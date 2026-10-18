package dev.dimasik.mixin;

import dev.dimasik.client.module.misc.Optimization;
import net.minecraft.client.renderer.block.BlockAndTintGetter;
import net.minecraft.client.renderer.block.FluidRenderer;
import net.minecraft.client.renderer.block.FluidRenderer.Output;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(FluidRenderer.class)
public class FluidRendererMixin {
   @Inject(method = "tesselate", at = @At("HEAD"), cancellable = true)
   private void render(BlockAndTintGetter var1, BlockPos var2, Output var3, BlockState var4, FluidState var5, CallbackInfo var6) {
      boolean var7 = Optimization.m_5846() && var5.is(FluidTags.WATER);
      boolean var8 = Optimization.m_5850() && var5.is(FluidTags.LAVA);
      if (var7 || var8) {
         var6.cancel();
      }
   }
}
