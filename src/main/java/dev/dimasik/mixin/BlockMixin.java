package dev.dimasik.mixin;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.system.Class_jhduRFRSz3NXcVvu;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Block.class)
public class BlockMixin {
   @Inject(method = "setPlacedBy", at = @At("HEAD"))
   public void onPlaced(Level var1, BlockPos var2, BlockState var3, @Nullable LivingEntity var4, ItemStack var5, CallbackInfo var6) {
      if (var1.isClientSide() && var4 == Minecraft.getInstance().player && var5.is(Items.OBSIDIAN)) {
         DimasikClient.m_9057().m_9051().m_9708(new Class_jhduRFRSz3NXcVvu(var2));
      }
   }
}
