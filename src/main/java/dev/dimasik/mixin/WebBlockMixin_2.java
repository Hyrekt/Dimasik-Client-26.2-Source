package dev.dimasik.mixin;

import dev.dimasik.client.system.Class_mZ6Q7gwh7mng3x8m;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.WebBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WebBlock.class)
public class WebBlockMixin_2 {
   @Inject(method = "entityInside", at = @At("HEAD"))
   private void onEntityCollision(BlockState var1, Level var2, BlockPos var3, Entity var4, InsideBlockEffectApplier var5, boolean var6, CallbackInfo var7) {
      ((Class_mZ6Q7gwh7mng3x8m)var4).dimas$setInWeb(true);
   }
}
