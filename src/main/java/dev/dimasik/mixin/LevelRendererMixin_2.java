package dev.dimasik.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.render.BetterMinecraft;
import dev.dimasik.mixin.annotation.IfModLoaded;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.chunk.SectionRenderDispatcher.RenderSection;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@IfModLoaded("!sodium")
@Mixin(LevelRenderer.class)
public class LevelRendererMixin_2 {
   private static final double f_36655 = 1.0E-12;

   @ModifyArgs(
      method = "prepareChunkRenders",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/DynamicUniforms$ChunkSectionInfo;<init>(Lorg/joml/Matrix4fc;IIIFII)V")
   )
   private void animateSection(Args var1, @Local RenderSection var2) {
      BetterMinecraft var3 = module();
      if (var3 != null) {
         Vec3 var4 = var3.f_16484.m_4619(var2, var3);
         if (var4.lengthSqr() > f_36655) {
            Matrix4fc var5 = (Matrix4fc)var1.get(0);
            var1.set(0, new Matrix4f(var5).translate((float)var4.x, (float)var4.y, (float)var4.z));
         }
      }
   }

   @Unique
   private static BetterMinecraft module() {
      DimasikClient var0 = DimasikClient.m_9057();
      return var0 != null && var0.m_9049() != null && var0.m_9049().m_2801() != null ? var0.m_9049().m_2801().m_3478() : null;
   }
}
