package dev.dimasik.client.system;

import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.shaders.ShaderSource;
import com.mojang.blaze3d.shaders.UniformType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.MeshData;
import java.nio.ByteBuffer;
import java.util.Optional;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.util.Mth;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;

public class Class_hbNctSdT52MmbYth implements Class_b8v0o2NnCtANmOp9, Class_NzJrN63M7QBpmAbi {
   private final RenderPipeline f_23460;
   private final RenderPipeline f_23461;
   private final CommandEncoder f_23462;
   private static final String f_23463 = "dimasik/font";
   private static final String f_23464 = "font";
   private static final String f_23465 = "font";
   private static final String f_23466 = "Params";
   private static final String f_23467 = "Scissors";
   private static final String f_23468 = "Sampler0";
   private static final String f_23469 = "dimasik/loading_logo";
   private static final String f_23470 = "loading_logo";
   private static final String f_23471 = "loading_logo";
   private static final String f_23472 = "LogoParams";
   private static final String f_23473 = "Sampler0";
   private static final String f_23474 = "Sampler0";
   private static final String f_23475 = "LogoParams";
   private static final float f_23476 = 0.5F;
   private static final float f_23477 = 0.5F;
   private static final float f_23478 = 1.25F;
   private static final float f_23479 = 1.25F;
   private static final float f_23480 = 1.25F;
   private static final String f_23481 = "Sampler0";
   private static final String f_23482 = "Params";
   private static final String f_23483 = "Scissors";
   private static final int f_23484 = 16777215;
   private static final float f_23485 = 1.25F;
   private static final float f_23486 = 0.5F;
   private static final float f_23487 = 0.15F;
   private static final float f_23488 = 1.25F;
   private static final float f_23489 = -1.0F;
   private static final float f_23490 = -1.0F;
   private static final float f_23491 = 0.8660254F;
   private static final float f_23492 = -0.5F;
   private static final String f_23493 = "Sampler0";
   private static final String f_23494 = "Params";
   private static final String f_23495 = "Scissors";
   private static final String f_23496 = "Shine";
   private static final float f_23497 = 1.25F;
   private static final float f_23498 = 0.5F;
   private static final String f_23499 = "Sampler0";
   private static final float f_23500 = 0.15F;
   private static final float f_23501 = 1.25F;
   private static final String f_23502 = "Params";
   private static final String f_23503 = "Scissors";
   private static final float f_23504 = -1.0F;
   private static final String f_23505 = "fontPass";
   private static final String f_23506 = "shinyText";
   private static final String f_23507 = "font_text_pass";
   private static final String f_23508 = "loading_logo_pass";

   @Override
   public GpuBufferSlice m_5995(Vector4f var1, MemoryStack var2) {
      Vector4f var3 = Class_Ssh31B3ljfKeWsvS.m_4834();
      float var4 = var1.x;
      float var5 = var1.y;
      float var6 = var1.x + var1.z;
      float var7 = var1.y + var1.w;
      float var8 = var3.x;
      float var9 = var3.y;
      float var10 = var3.x + var3.z;
      float var11 = var3.y + var3.w;
      float var12 = Math.max(var4, var8);
      float var13 = Math.max(var5, var9);
      float var14 = Math.min(var6, var10);
      float var15 = Math.min(var7, var11);
      float var16 = var12;
      float var17 = var13;
      float var18 = var14 - var12;
      float var19 = var15 - var13;
      float var20 = 2.0F / Minecraft.getInstance().getWindow().getScreenWidth() * var18;
      float var21 = 2.0F / Minecraft.getInstance().getWindow().getScreenHeight() * var19;
      float var22 = f_23504 + var16 * 2.0F / Minecraft.getInstance().getWindow().getScreenWidth();
      float var23 = 1.0F - var17 * 2.0F / Minecraft.getInstance().getWindow().getScreenHeight() - var21;
      Vector3f var24 = Class_Ssh31B3ljfKeWsvS.m_4853().transformPosition(var22, var23, 0.0F, new Vector3f());
      Vector3f var25 = Class_Ssh31B3ljfKeWsvS.m_4853().transformPosition(var22 + var20, var23 + var21, 0.0F, new Vector3f());
      Vector4f var26 = new Vector4f(var24.x, var24.y, var25.x, var25.y);
      ByteBuffer var27 = Std140Builder.onStack(var2, 32)
         .putVec4(new Vector4f(var26))
         .putVec2(new Vector2f(f_11537.getWindow().getScreenWidth(), f_11537.getWindow().getScreenHeight()))
         .putFloat(Class_Ssh31B3ljfKeWsvS.m_4812() ? 1.0F : 0.0F)
         .get();
      return Class_HtEPOqGrAYrUdumw.m_2945(var27);
   }

   public void m_7184(Class_jZQ0pP9BTU3L7miy var1, int var2, float var3, float var4, float var5, int var6, int var7, float var8, float var9, float var10) {
      Vector4f var11 = var1.m_7383().m_2152(var2);
      if (var11 != null && Class_BftdentXEtGbugJw.m_2298(var6).w != 0.0F) {
         BufferBuilder var12 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
         var1.m_7383().m_2147(var12, Character.toString(var2), var5, 0.0F, 0.0F, var3, var4 + var1.m_7383().m_2151().m_4106() * var5, var6);
         GpuBufferSlice var13 = null;
         RenderPass var14 = null;

         try {
            MemoryStack var15 = MemoryStack.stackPush();

            try {
               Vector4f var16 = Class_BftdentXEtGbugJw.m_2298(var7);
               ByteBuffer var17 = Std140Builder.onStack(var15, 48)
                  .putVec4(var11)
                  .putVec4(
                     new Vector4f(var1.m_7383().m_2149().m_4101(), Mth.clamp(var8, 0.0F, 1.0F), Mth.clamp(var9, 0.0F, 1.0F), Mth.clamp(var10, 0.0F, 1.0F))
                  )
                  .putVec4(var16)
                  .get();
               var13 = Class_HtEPOqGrAYrUdumw.m_2945(var17);
            } catch (Throwable var23) {
               if (var15 != null) {
                  try {
                     var15.close();
                  } catch (Throwable var22) {
                     var23.addSuppressed(var22);
                  }
               }

               throw var23;
            }

            if (var15 != null) {
               var15.close();
            }

            var14 = this.f_23462.createRenderPass(() -> f_23508, f_11537.gameRenderer.mainRenderTarget().getColorTextureView(), Optional.empty());
            RenderSystem.bindDefaultUniforms(var14);
            var14.bindTexture(f_23474, var1.m_7383().m_2145().getTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
            var14.setUniform(f_23475, var13);
            this.m_5998(var12, var14, this.f_23461);
         } finally {
            if (var14 != null) {
               var14.close();
            }
         }
      }
   }

   private void m_7186(BufferBuilder var1) {
      MeshData var2 = var1.build();
      if (var2 != null) {
         var2.close();
      }
   }

   public void m_7187(Class_jZQ0pP9BTU3L7miy var1, String var2, float var3, float var4, float var5, int var6, int var7, float var8) {
      if (!var2.isEmpty() && !(var5 <= 0.0F) && Class_BftdentXEtGbugJw.m_2297(var6) != 0 && !(Class_Ssh31B3ljfKeWsvS.m_4821() <= 0.0F)) {
         float var9 = var1.m_7383().m_2153(var2, var5, 0.0F, 1.0F);
         if (!(var9 <= 0.0F) && !this.m_5994(var3, var4, var9, var5 * f_23485)) {
            RenderPipeline var10 = Class_hbNctSdT52MmbYth.jE4ukfaiiHR10vkR.f_23452;
            MemoryStack var14 = MemoryStack.stackPush();

            GpuBufferSlice var11;
            GpuBufferSlice var12;
            GpuBufferSlice var13;
            try {
               var11 = Class_HtEPOqGrAYrUdumw.m_2945(
                  Std140Builder.onStack(var14, 16).putFloat(var1.m_7383().m_2149().m_4101()).putFloat(0.0F).putFloat(f_23486).get()
               );
               var12 = this.m_5995(new Vector4f(var3, var4, var9 + var5 * f_23487, var5 * f_23488), var14);
               float var15 = f_11537.getWindow().getScreenWidth();
               float var16 = f_11537.getWindow().getScreenHeight();
               Vector3f var17 = Class_Ssh31B3ljfKeWsvS.m_4853()
                  .transformPosition(f_23489 + var3 * 2.0F / var15, 1.0F - var4 * 2.0F / var16, 0.0F, new Vector3f());
               Vector3f var18 = Class_Ssh31B3ljfKeWsvS.m_4853()
                  .transformPosition(f_23490 + (var3 + var9) * 2.0F / var15, 1.0F - (var4 + var5) * 2.0F / var16, 0.0F, new Vector3f());
               var13 = Class_HtEPOqGrAYrUdumw.m_2945(
                  Std140Builder.onStack(var14, 48)
                     .putVec4(new Vector4f(var17.x, var17.y, var18.x - var17.x, var18.y - var17.y))
                     .putVec4(new Vector4f(Mth.clamp(var8, 0.0F, 1.0F), var5 / var9, f_23491, f_23492))
                     .putVec4(Class_BftdentXEtGbugJw.m_2298(var7))
                     .get()
               );
            } catch (Throwable var22) {
               if (var14 != null) {
                  try {
                     var14.close();
                  } catch (Throwable var20) {
                     var22.addSuppressed(var20);
                  }
               }

               throw var22;
            }

            if (var14 != null) {
               var14.close();
            }

            BufferBuilder var23 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
            var1.m_7383().m_2147(var23, var2, var5, 0.0F, 0.0F, var3, var4 + var1.m_7383().m_2151().m_4106() * var5, var6);
            RenderPass var24 = this.f_23462.createRenderPass(() -> f_23506, f_11537.gameRenderer.mainRenderTarget().getColorTextureView(), Optional.empty());

            try {
               RenderSystem.bindDefaultUniforms(var24);
               var24.bindTexture(f_23493, var1.m_7383().m_2145().getTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
               var24.setUniform(f_23494, var11);
               var24.setUniform(f_23495, var12);
               var24.setUniform(f_23496, var13);
               this.m_5998(var23, var24, var10);
            } catch (Throwable var21) {
               if (var24 != null) {
                  try {
                     var24.close();
                  } catch (Throwable var19) {
                     var21.addSuppressed(var19);
                  }
               }

               throw var21;
            }

            if (var24 != null) {
               var24.close();
            }
         }
      }
   }

   public void m_7188(Class_jZQ0pP9BTU3L7miy var1, @NotNull Component var2, float var3, float var4, float var5, int var6, float var7, float var8, float var9) {
      if (!this.m_5994(var3, var4, var1.m_7383().m_2157(var2.getString(), var5, 0.0F), var5 * f_23478) || Class_BftdentXEtGbugJw.m_2298(var6).w != 0.0F) {
         BufferBuilder var10 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
         float var11 = var4 + var1.m_7383().m_2151().m_4106() * var5;
         float[] var12 = new float[]{var3};
         int var13 = var6 >>> 24;
         var2.visit((var10x, var11x) -> {
            if (!var11x.isEmpty()) {
               int var12x = var10x.getColor() == null ? var6 : this.m_7199(var10x.getColor().getValue(), var13);
               var12[0] = this.m_7195(var1, var10, var11x, var12[0], var11, var5, var7, var9, var12x, var13);
            }

            return Optional.empty();
         }, Style.EMPTY);
         float var14 = var12[0] - var3;
         if (!(var14 <= 0.0F) && !this.m_5994(var3, var4, var14, var5 * f_23479)) {
            GpuBufferSlice var15 = null;
            GpuBufferSlice var16 = null;
            RenderPass var17 = null;

            try {
               MemoryStack var18 = MemoryStack.stackPush();

               try {
                  ByteBuffer var19 = Std140Builder.onStack(var18, 16).putFloat(var1.m_7383().m_2149().m_4101()).putFloat(var7).putFloat(var8).get();
                  var15 = Class_HtEPOqGrAYrUdumw.m_2945(var19);
                  var16 = this.m_5995(new Vector4f(var3, var4, var14, var5 * f_23480), var18);
               } catch (Throwable var26) {
                  if (var18 != null) {
                     try {
                        var18.close();
                     } catch (Throwable var25) {
                        var26.addSuppressed(var25);
                     }
                  }

                  throw var26;
               }

               if (var18 != null) {
                  var18.close();
               }

               var17 = this.f_23462.createRenderPass(() -> f_23507, f_11537.gameRenderer.mainRenderTarget().getColorTextureView(), Optional.empty());
               RenderSystem.bindDefaultUniforms(var17);
               var17.bindTexture(f_23481, var1.m_7383().m_2145().getTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
               var17.setUniform(f_23482, var15);
               var17.setUniform(f_23483, var16);
               this.m_5998(var10, var17, this.f_23460);
            } finally {
               if (var17 != null) {
                  var17.close();
               }
            }
         } else {
            this.m_7186(var10);
         }
      }
   }

   public void m_7189(ShaderSource var1) {
      RenderSystem.getDevice().precompilePipeline(this.f_23460, var1);
      RenderSystem.getDevice().precompilePipeline(this.f_23461, var1);
   }

   public void m_7191(Class_jZQ0pP9BTU3L7miy var1, @NotNull String var2, float var3, float var4, float var5, int var6, float var7, float var8, float var9) {
      if (!var2.isEmpty()
         && !this.m_5994(var3, var4, var1.m_7383().m_2153(var2, var5, 0.0F, var9), var5 * f_23497)
         && Class_BftdentXEtGbugJw.m_2298(var6).w != 0.0F) {
         BufferBuilder var10 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
         var1.m_7383().m_2147(var10, var2, var5, var7 * f_23498 * var5, 0.0F, var3, var4 + var1.m_7383().m_2151().m_4106() * var5, var6);
         RenderPass var11 = this.f_23462.createRenderPass(() -> f_23505, f_11537.gameRenderer.mainRenderTarget().getColorTextureView(), Optional.empty());
         RenderSystem.bindDefaultUniforms(var11);
         var11.bindTexture(f_23499, var1.m_7383().m_2145().getTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
         MemoryStack var14 = MemoryStack.stackPush();

         try {
            ByteBuffer var15 = Std140Builder.onStack(var14, 16).putFloat(var1.m_7383().m_2149().m_4101()).putFloat(var7).putFloat(var8).get();
            GpuBufferSlice var12 = Class_HtEPOqGrAYrUdumw.m_2945(var15);
            float var16 = var1.m_7383().m_2153(var2, var5, 0.0F, var9);
            float var17 = var5 * f_23500;
            GpuBufferSlice var13 = this.m_5995(new Vector4f(var3, var4, var16 + var17, var5 * f_23501), var14);
            var11.setUniform(f_23502, var12);
            var11.setUniform(f_23503, var13);
         } catch (Throwable var19) {
            if (var14 != null) {
               try {
                  var14.close();
               } catch (Throwable var18) {
                  var19.addSuppressed(var18);
               }
            }

            throw var19;
         }

         if (var14 != null) {
            var14.close();
         }

         this.m_5998(var10, var11, this.f_23460);
         var11.close();
      }
   }

   private float m_7194(Class_jZQ0pP9BTU3L7miy var1, BufferBuilder var2, String var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      if (var3.isEmpty()) {
         return var4;
      }

      var1.m_7383().m_2147(var2, var3, var6, var7, 0.0F, var4, var5, var9);
      return var4 + var1.m_7383().m_2153(var3, var6, 0.0F, var8);
   }

   public Class_hbNctSdT52MmbYth() {
      this.f_23460 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_23463)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_23464))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_23465))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2729(f_23466, UniformType.UNIFORM_BUFFER)
         .m_2729(f_23467, UniformType.UNIFORM_BUFFER)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2741(f_23468)
         .m_2722();
      this.f_23461 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_23469)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_23470))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_23471))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2729(f_23472, UniformType.UNIFORM_BUFFER)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2741(f_23473)
         .m_2722();
      this.f_23462 = RenderSystem.getDevice().createCommandEncoder();
   }

   private float m_7195(
      Class_jZQ0pP9BTU3L7miy var1, BufferBuilder var2, String var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10
   ) {
      int var11 = var9;
      int var12 = 0;

      for (int var13 = 0; var13 < var3.length() - 1; var13++) {
         if (var3.charAt(var13) == 167) {
            if (var12 < var13) {
               var4 = this.m_7194(var1, var2, var3.substring(var12, var13), var4, var5, var6, var7, var8, var11);
            }

            ChatFormatting var14 = ChatFormatting.getByCode(Character.toLowerCase(var3.charAt(var13 + 1)));
            if (var14 != null) {
               if (TextColor.fromLegacyFormat(var14) != null) {
                  Integer var15 = TextColor.fromLegacyFormat(var14).getValue();
                  if (var15 != null) {
                     var11 = this.m_7199(var15, var10);
                  }
               } else if (var14 == ChatFormatting.RESET) {
                  var11 = var9;
               }
            }

            var12 = ++var13 + 1;
         }
      }

      if (var12 < var3.length()) {
         var4 = this.m_7194(var1, var2, var12 == 0 ? var3 : var3.substring(var12), var4, var5, var6, var7, var8, var11);
      }

      return var4;
   }

   public void m_7197(Class_jZQ0pP9BTU3L7miy var1, @NotNull String var2, float var3, float var4, int var5, int var6) {
      this.m_7191(var1, var2, var3, var4, var5, var6, 0.0F, f_23476, 1.0F);
   }

   public void m_7198(Class_jZQ0pP9BTU3L7miy var1, @NotNull Component var2, float var3, float var4, int var5, int var6) {
      this.m_7188(var1, var2, var3, var4, var5, var6, 0.0F, f_23477, 1.0F);
   }

   private int m_7199(int var1, int var2) {
      return var2 << 24 | var1 & f_23484;
   }

   private static final class jE4ukfaiiHR10vkR {
      public static final RenderPipeline f_23452 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(Class_hbNctSdT52MmbYth.jE4ukfaiiHR10vkR.f_23453)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_hbNctSdT52MmbYth.jE4ukfaiiHR10vkR.f_23454))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_hbNctSdT52MmbYth.jE4ukfaiiHR10vkR.f_23455))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2729(Class_hbNctSdT52MmbYth.jE4ukfaiiHR10vkR.f_23456, UniformType.UNIFORM_BUFFER)
         .m_2729(Class_hbNctSdT52MmbYth.jE4ukfaiiHR10vkR.f_23457, UniformType.UNIFORM_BUFFER)
         .m_2729(Class_hbNctSdT52MmbYth.jE4ukfaiiHR10vkR.f_23458, UniformType.UNIFORM_BUFFER)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2741(Class_hbNctSdT52MmbYth.jE4ukfaiiHR10vkR.f_23459)
         .m_2722();
      public static final String f_23453 = "dimasik/shiny_text";
      public static final String f_23454 = "font";
      public static final String f_23455 = "shiny_text";
      public static final String f_23456 = "Params";
      public static final String f_23457 = "Scissors";
      public static final String f_23458 = "Shine";
      public static final String f_23459 = "Sampler0";

      public jE4ukfaiiHR10vkR() {
      }
   }
}
