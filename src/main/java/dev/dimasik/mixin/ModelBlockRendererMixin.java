package dev.dimasik.mixin;

import dev.dimasik.client.module.misc.Optimization;
import dev.dimasik.client.system.Class_nulhzpfOWV9d1NBW;
import dev.dimasik.client.system.Class_xYKqykPYp6IuC6PX;
import net.minecraft.client.renderer.block.BlockAndTintGetter;
import net.minecraft.client.renderer.block.BlockQuadOutput;
import net.minecraft.client.renderer.block.ModelBlockRenderer;
import net.minecraft.client.renderer.block.dispatch.BlockStateModel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.VegetationBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ModelBlockRenderer.class)
public abstract class ModelBlockRendererMixin {
   @Inject(method = "tesselateBlock", at = @At("HEAD"), cancellable = true)
   private void dimasik$cullVegetation(
      BlockQuadOutput var1,
      float var2,
      float var3,
      float var4,
      BlockAndTintGetter var5,
      BlockPos var6,
      BlockState var7,
      BlockStateModel var8,
      long var9,
      CallbackInfo var11
   ) {
      if (var7.getBlock() instanceof VegetationBlock && (Optimization.m_5852() || Class_nulhzpfOWV9d1NBW.m_7706(Class_xYKqykPYp6IuC6PX.QfQnMomAbf3hjvZP.GRASS))
         )
       {
         var11.cancel();
      }
   }
}
