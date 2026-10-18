package dev.dimasik.client.system;

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
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Optional;
import org.lwjgl.system.MemoryStack;

public final class Class_fuGrtM7rHAJXPau4 implements Class_NzJrN63M7QBpmAbi {
   public static final Class_fuGrtM7rHAJXPau4 f_20770 = new Class_fuGrtM7rHAJXPau4();
   private static final int f_20771 = Class_y3cvEHXTSEF5dp8q.values().length;
   private static final int f_20772 = 192;
   private static final int f_20773 = (2 + f_20771 * 2 + 192) * 16;
   private static final float f_20774 = 1.72F;
   private final RenderPipeline f_20775;
   private TextureTarget f_20776;
   private TextureTarget f_20777;
   private int[] f_20778;
   private int[] f_20779;
   private float f_20780;
   private float f_20781;
   private long f_20782;
   private boolean f_20783;
   private boolean f_20784;
   private int f_20785;
   private final float[] f_20786;
   private int f_20787;
   private static final String f_20788 = "dimasik/theme_wave";
   private static final String f_20789 = "theme_wave";
   private static final String f_20790 = "theme_wave";
   private static final String f_20791 = "ThemeWave";
   private static final String f_20792 = "Sampler0";
   private static final String f_20793 = "BaseSampler";
   private static final float f_20794 = 1.0E9F;
   private static final float f_20795 = 1.72F;
   private static final float f_20796 = 0.095F;
   private static final String f_20797 = "Sampler0";
   private static final String f_20798 = "BaseSampler";
   private static final String f_20799 = "ThemeWave";
   private static final String f_20800 = "theme-wave-copy";
   private static final String f_20801 = "theme-wave-background";
   private static final float f_20802 = 255.0F;
   private static final float f_20803 = 255.0F;
   private static final float f_20804 = 255.0F;
   private static final float f_20805 = 255.0F;
   private static final String f_20806 = "theme wave";
   private static final String f_20807 = "theme wave uniforms";

   private void m_6736(int var1, int var2) {
      if (this.f_20776 == null) {
         this.f_20776 = new TextureTarget(f_20800, var1, var2, false, GpuFormat.RGBA8_UNORM);
      } else if (this.f_20776.width != var1 || this.f_20776.height != var2) {
         this.f_20776.resize(var1, var2);
      }

      if (this.f_20777 == null) {
         this.f_20777 = new TextureTarget(f_20801, var1, var2, false, GpuFormat.RGBA8_UNORM);
      } else if (this.f_20777.width != var1 || this.f_20777.height != var2) {
         this.f_20777.resize(var1, var2);
      }
   }

   public void m_6737() {
      if (this.f_20782 != 0L) {
         this.f_20787 = 0;
         this.f_20784 = true;
         RenderTarget var1 = f_11537.gameRenderer.mainRenderTarget();
         this.m_6736(var1.width, var1.height);
         CommandEncoder var2 = RenderSystem.getDevice().createCommandEncoder();
         var2.copyTextureToTexture(var1.getColorTexture(), this.f_20777.getColorTexture(), 0, 0, 0, 0, 0, var1.width, var1.height);
         this.f_20783 = true;
         this.m_6740(0.0F, 0.0F, var1.width, var1.height);
      }
   }

   public void m_6738() {
      if (this.f_20785 > 0) {
         this.f_20785--;
      }
   }

   private static int[] m_6739(int[] var0) {
      int[] var1 = new int[f_20771];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = var2 < var0.length ? var0[var2] : -1;
      }

      return var1;
   }

   public void m_6740(float var1, float var2, float var3, float var4) {
      if (this.f_20784 && this.f_20785 <= 0 && this.f_20782 != 0L && !(var3 <= 0.0F) && !(var4 <= 0.0F)) {
         float var5 = var1;
         float var6 = var2;
         float var7 = var1 + var3;
         float var8 = var2 + var4;
         if (Class_Ssh31B3ljfKeWsvS.m_4812()) {
            var5 = Math.max(var5, Class_Ssh31B3ljfKeWsvS.m_4834().x);
            var6 = Math.max(var6, Class_Ssh31B3ljfKeWsvS.m_4834().y);
            var7 = Math.min(var7, Class_Ssh31B3ljfKeWsvS.m_4834().x + Class_Ssh31B3ljfKeWsvS.m_4834().z);
            var8 = Math.min(var8, Class_Ssh31B3ljfKeWsvS.m_4834().y + Class_Ssh31B3ljfKeWsvS.m_4834().w);
         }

         if (!(var7 <= var5) && !(var8 <= var6)) {
            for (int var9 = 0; var9 < this.f_20787; var9++) {
               int var10 = var9 * 4;
               float var11 = this.f_20786[var10];
               float var12 = this.f_20786[var10 + 1];
               float var13 = this.f_20786[var10 + 2];
               float var14 = this.f_20786[var10 + 3];
               if (var7 >= var11 && var5 <= var13 && var8 >= var12 && var6 <= var14) {
                  this.f_20786[var10] = Math.min(var5, var11);
                  this.f_20786[var10 + 1] = Math.min(var6, var12);
                  this.f_20786[var10 + 2] = Math.max(var7, var13);
                  this.f_20786[var10 + 3] = Math.max(var8, var14);
                  return;
               }
            }

            if (this.f_20787 < 192) {
               int var15 = this.f_20787++ * 4;
               this.f_20786[var15] = var5;
               this.f_20786[var15 + 1] = var6;
               this.f_20786[var15 + 2] = var7;
               this.f_20786[var15 + 3] = var8;
            }
         }
      }
   }

   public void m_6741() {
      this.f_20784 = false;
      if (this.f_20782 != 0L && this.f_20778 != null && this.f_20779 != null && this.f_20783) {
         float var1 = (float)(System.nanoTime() - this.f_20782) / f_20794 / f_20795;
         if (var1 >= 1.0F) {
            this.f_20782 = 0L;
            this.f_20778 = null;
            this.f_20779 = null;
            this.f_20783 = false;
         } else {
            RenderTarget var2 = f_11537.gameRenderer.mainRenderTarget();
            this.m_6736(var2.width, var2.height);
            CommandEncoder var3 = RenderSystem.getDevice().createCommandEncoder();
            var3.copyTextureToTexture(var2.getColorTexture(), this.f_20776.getColorTexture(), 0, 0, 0, 0, 0, var2.width, var2.height);
            MemoryStack var4 = MemoryStack.stackPush();

            try {
               Std140Builder var5 = Std140Builder.onStack(var4, f_20773)
                  .putVec4(this.f_20780, this.f_20781, var1, 1.0F)
                  .putVec4(var2.width, var2.height, f_20796, this.f_20787);

               for (int var9 : this.f_20778) {
                  m_6744(var5, var9);
               }

               for (int var25 : this.f_20779) {
                  m_6744(var5, var25);
               }

               for (int var18 = 0; var18 < 192; var18++) {
                  if (var18 < this.f_20787) {
                     int var21 = var18 * 4;
                     var5.putVec4(
                        this.f_20786[var21] / var2.width,
                        1.0F - this.f_20786[var21 + 3] / var2.height,
                        this.f_20786[var21 + 2] / var2.width,
                        1.0F - this.f_20786[var21 + 1] / var2.height
                     );
                  } else {
                     var5.putVec4(0.0F, 0.0F, 0.0F, 0.0F);
                  }
               }

               ByteBuffer var19 = var5.get();
               GpuBuffer var22 = RenderSystem.getDevice().createBuffer(() -> f_20807, 128, var19);

               try {
                  RenderPass var24 = var3.createRenderPass(() -> f_20806, var2.getColorTextureView(), Optional.empty());

                  try {
                     RenderSystem.bindDefaultUniforms(var24);
                     var24.setPipeline(this.f_20775);
                     var24.bindTexture(f_20797, this.f_20776.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
                     var24.bindTexture(f_20798, this.f_20777.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
                     var24.setUniform(f_20799, var22);
                     var24.draw(3, 1, 0, 0);
                  } catch (Throwable var14) {
                     if (var24 != null) {
                        try {
                           var24.close();
                        } catch (Throwable var13) {
                           var14.addSuppressed(var13);
                        }
                     }

                     throw var14;
                  }

                  if (var24 != null) {
                     var24.close();
                  }
               } catch (Throwable var15) {
                  if (var22 != null) {
                     try {
                        var22.close();
                     } catch (Throwable var12) {
                        var15.addSuppressed(var12);
                     }
                  }

                  throw var15;
               }

               if (var22 != null) {
                  var22.close();
               }
            } catch (Throwable var16) {
               if (var4 != null) {
                  try {
                     var4.close();
                  } catch (Throwable var11) {
                     var16.addSuppressed(var11);
                  }
               }

               throw var16;
            }

            if (var4 != null) {
               var4.close();
            }

            this.f_20783 = false;
         }
      }
   }

   public boolean m_6743() {
      return this.f_20782 != 0L;
   }

   private static void m_6744(Std140Builder var0, int var1) {
      var0.putVec4((var1 >> 16 & 0xFF) / f_20802, (var1 >> 8 & 0xFF) / f_20803, (var1 & 0xFF) / f_20804, (var1 >>> 24 & 0xFF) / f_20805);
   }

   private Class_fuGrtM7rHAJXPau4() {
      this.f_20775 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_20788)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_20789))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_20790))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_20791, UniformType.UNIFORM_BUFFER)
         .m_2741(f_20792)
         .m_2741(f_20793)
         .m_2722();
      this.f_20786 = new float[768];
   }

   public void m_6745() {
      this.f_20785++;
   }

   public void m_6747(float var1, float var2, int[] var3, int[] var4) {
      if (var3 != null && var4 != null && !Arrays.equals(var3, var4)) {
         RenderTarget var5 = f_11537.gameRenderer.mainRenderTarget();
         float var6 = Math.max(1.0F, var5.width);
         float var7 = Math.max(1.0F, var5.height);
         this.f_20780 = Math.clamp(var1 / var6, 0.0F, 1.0F);
         this.f_20781 = Math.clamp(1.0F - var2 / var7, 0.0F, 1.0F);
         this.f_20778 = m_6739(var3);
         this.f_20779 = m_6739(var4);
         this.f_20782 = System.nanoTime();
         this.f_20783 = false;
         this.f_20787 = 0;
      }
   }
}
