package dev.dimasik.mixin;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.system.Class_ArgbZzNIUBY6lyfv;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.WebBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WebBlock.class)
public class WebBlockMixin {
   private static final double f_36501 = 0.5;
   private static final double f_36502 = 0.25;
   private static final double f_36503 = 0.5;

   @Inject(
      method = "entityInside",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/entity/Entity;makeStuckInBlock(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/phys/Vec3;)V",
         shift = Shift.BEFORE
      ),
      cancellable = true
   )
   private void inside(BlockState var1, Level var2, BlockPos var3, Entity var4, InsideBlockEffectApplier var5, boolean var6, CallbackInfo var7) {
      if (var4 instanceof LocalPlayer) {
         Class_ArgbZzNIUBY6lyfv var8 = new Class_ArgbZzNIUBY6lyfv(new Vec3(f_36501, f_36502, f_36503), var3);
         DimasikClient.m_9057().m_9051().m_9708(var8);
         if (var8.m_1581()) {
            var7.cancel();
         }
      }
   }
}
