package dev.dimasik.client.module.render;

import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.pipeline.TextureTarget;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.shaders.UniformType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ColorSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_qVhkkaIE4caRWwpV;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.nio.ByteBuffer;
import java.util.Optional;
import net.minecraft.client.DeltaTracker;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;

public class ShaderMist extends Module {
   private static final int f_17862 = 80;
   private final SliderSetting f_17863;
   private final SliderSetting f_17864;
   private final SliderSetting f_17865;
   private final SliderSetting f_17866;
   private final CheckboxSetting f_17867;
   private final ColorSetting f_17868;
   private final RenderPipeline f_17869;
   private TextureTarget f_17870;
   private long f_17871;
   private static final String f_17872 = "ShaderMist";
   private static final String f_17873 = "Шейдерное небо Pulsar";
   private static final String f_17874 = "Скорость";
   private static final float f_17875 = 0.1F;
   private static final float f_17876 = 5.0F;
   private static final float f_17877 = 0.1F;
   private static final String f_17878 = "Размер";
   private static final float f_17879 = 5.0F;
   private static final float f_17880 = 20.0F;
   private static final float f_17881 = 0.5F;
   private static final String f_17882 = "Интенсивность";
   private static final float f_17883 = 0.01F;
   private static final float f_17884 = 0.001F;
   private static final float f_17885 = 0.05F;
   private static final float f_17886 = 0.001F;
   private static final String f_17887 = "Прозрачность";
   private static final float f_17888 = 0.3F;
   private static final float f_17889 = 0.05F;
   private static final String f_17890 = "Авто цвет под тему";
   private static final String f_17891 = "Цвет";
   private static final int f_17892 = -11885569;
   private static final String f_17893 = "dimasik/shader_mist_pulsar";
   private static final String f_17894 = "hands_fullscreen";
   private static final String f_17895 = "shader_mist_pulsar";
   private static final String f_17896 = "ShaderMist";
   private static final String f_17897 = "SceneSampler";
   private static final String f_17898 = "DepthSampler";
   private static final long f_17899 = -1L;
   private static final float f_17900 = 1000.0F;
   private static final float f_17901 = 16.0F;
   private static final float f_17902 = 16.0F;
   private static final float f_17903 = 0.98F;
   private static final float f_17904 = 1.05F;
   private static final float f_17905 = 5.0E-4F;
   private static final String f_17906 = "SceneSampler";
   private static final String f_17907 = "DepthSampler";
   private static final String f_17908 = "ShaderMist";
   private static final String f_17909 = "ShaderMist scene";
   private static final long f_17910 = -1L;
   private static final String f_17911 = "ShaderMist";
   private static final String f_17912 = "ShaderMist uniforms";

   public ShaderMist() {
      super(f_17872, f_17873, Category.RENDER);
      this.f_17863 = new SliderSetting(f_17874, 1.0F, f_17875, f_17876).m_828(f_17877);
      this.f_17864 = new SliderSetting(f_17878, f_17879, 1.0F, f_17880).m_828(f_17881);
      this.f_17865 = new SliderSetting(f_17882, f_17883, f_17884, f_17885).m_828(f_17886);
      this.f_17866 = new SliderSetting(f_17887, 1.0F, f_17888, 1.0F).m_828(f_17889);
      this.f_17867 = new CheckboxSetting(f_17890, true);
      this.f_17868 = new ColorSetting(f_17891, false, f_17892).m_822(() -> !this.f_17867.m_8768());
      this.f_17869 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_17893)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_17894))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_17895))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2727()
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_17896, UniformType.UNIFORM_BUFFER)
         .m_2741(f_17897)
         .m_2741(f_17898)
         .m_2722();
      this.f_17871 = f_17899;
      this.m_795(this.f_17863, this.f_17864, this.f_17865, this.f_17866, this.f_17867, this.f_17868);
   }

   public void m_6120(Matrix4f var1, Matrix4f var2, DeltaTracker var3) {
      if (this.m_776() && f_11537.player != null && f_11537.level != null && var1 != null && var2 != null) {
         RenderTarget var4 = f_11537.gameRenderer.mainRenderTarget();
         if (var4 != null && var4.getColorTexture() != null && var4.getDepthTexture() != null && !var4.getDepthTexture().isClosed()) {
            if (this.f_17871 < 0L) {
               this.f_17871 = System.currentTimeMillis();
            }

            int var5 = Math.max(1, var4.width);
            int var6 = Math.max(1, var4.height);
            this.m_6123(var5, var6);
            CommandEncoder var7 = RenderSystem.getDevice().createCommandEncoder();
            var7.copyTextureToTexture(var4.getColorTexture(), this.f_17870.getColorTexture(), 0, 0, 0, 0, 0, var5, var6);
            float var8 = (float)(System.currentTimeMillis() - this.f_17871) / f_17900;
            Vector4f var9 = Class_BftdentXEtGbugJw.m_2298(
               this.f_17867.m_8768() ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : this.f_17868.m_8768()
            );
            float var10 = (float)Math.toRadians(-f_11537.gameRenderer.mainCamera().yRot());
            float var11 = (float)Math.toRadians(f_11537.gameRenderer.mainCamera().xRot());
            float var12 = ((Integer)f_11537.options.fov().get()).intValue();
            float var13 = var1.m22();
            float var14 = var1.m32();
            float var15 = Math.max(f_17901, f_11537.options.getEffectiveRenderDistance() * f_17902);
            float var16 = m_6121(var15 * f_17903, var13, var14);
            float var17 = Math.max(m_6121(var15 * f_17904, var13, var14), var16 + f_17905);
            MemoryStack var18 = MemoryStack.stackPush();

            try {
               ByteBuffer var19 = Std140Builder.onStack(var18, 80)
                  .putVec4(var5, var6, var8, var12)
                  .putVec4(var9.x, var9.y, var9.z, this.f_17866.m_8768())
                  .putVec4(this.f_17863.m_8768(), this.f_17864.m_8768(), this.f_17865.m_8768(), 0.0F)
                  .putVec4(var10, var11, 0.0F, 0.0F)
                  .putVec4(0.0F, var16, var17, 0.0F)
                  .get();
               GpuBuffer var20 = RenderSystem.getDevice().createBuffer(() -> f_17912, 128, var19);

               try {
                  RenderPass var21 = var7.createRenderPass(() -> f_17911, var4.getColorTextureView(), Optional.empty());

                  try {
                     var21.setPipeline(this.f_17869);
                     var21.bindTexture(f_17906, this.f_17870.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
                     var21.bindTexture(f_17907, var4.getDepthTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
                     var21.setUniform(f_17908, var20);
                     var21.draw(3, 1, 0, 0);
                  } catch (Throwable var27) {
                     if (var21 != null) {
                        try {
                           var21.close();
                        } catch (Throwable var26) {
                           var27.addSuppressed(var26);
                        }
                     }

                     throw var27;
                  }

                  if (var21 != null) {
                     var21.close();
                  }
               } catch (Throwable var28) {
                  if (var20 != null) {
                     try {
                        var20.close();
                     } catch (Throwable var25) {
                        var28.addSuppressed(var25);
                     }
                  }

                  throw var28;
               }

               if (var20 != null) {
                  var20.close();
               }
            } catch (Throwable var29) {
               if (var18 != null) {
                  try {
                     var18.close();
                  } catch (Throwable var24) {
                     var29.addSuppressed(var24);
                  }
               }

               throw var29;
            }

            if (var18 != null) {
               var18.close();
            }
         }
      }
   }

   @Override
   public void m_732() {
      this.f_17871 = f_17910;
      if (this.f_17870 != null) {
         this.f_17870.destroyBuffers();
         this.f_17870 = null;
      }
   }

   private static float m_6121(float var0, float var1, float var2) {
      return 1.0F - Class_qVhkkaIE4caRWwpV.m_8334(var0, var1, var2, RenderSystem.getDevice().getDeviceInfo().isZZeroToOne());
   }

   public boolean m_6122() {
      return this.m_776();
   }

   private void m_6123(int var1, int var2) {
      if (this.f_17870 == null) {
         this.f_17870 = new TextureTarget(f_17909, var1, var2, false, GpuFormat.RGBA8_UNORM);
      } else if (this.f_17870.width != var1 || this.f_17870.height != var2) {
         this.f_17870.resize(var1, var2);
      }
   }
}
