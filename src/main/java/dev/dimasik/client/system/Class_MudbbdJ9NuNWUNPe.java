package dev.dimasik.client.system;

import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.IndexType;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.shaders.UniformType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.AutoStorageIndexBuffer;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.MeshData;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.MeshData.DrawState;
import com.mojang.blaze3d.vertex.PoseStack.Pose;
import dev.dimasik.client.module.render.Chams;
import dev.dimasik.mixin.RenderPipelinesMixin;
import dev.dimasik.mixin.RenderTypeMixin;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.Model;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.rendertype.RenderSetup;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.resources.Identifier;
import net.minecraft.util.ARGB;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;

public final class Class_MudbbdJ9NuNWUNPe {
   private static final int f_11349 = 112;
   private static final long f_11350 = System.nanoTime();
   private static final Identifier f_11351 = Class_wHRRCm2tlLY7DN4I.m_9312(Class_MudbbdJ9NuNWUNPe.f_11385);
   private static final RenderPipeline f_11352 = RenderPipelinesMixin.register(
      Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2742(Identifier.fromNamespaceAndPath(Class_MudbbdJ9NuNWUNPe.f_11386, Class_MudbbdJ9NuNWUNPe.f_11387))
         .m_2734(f_11351)
         .m_2740(f_11351)
         .m_2741(Class_MudbbdJ9NuNWUNPe.f_11388)
         .m_2729(Class_MudbbdJ9NuNWUNPe.f_11389, UniformType.UNIFORM_BUFFER)
         .m_2739(DefaultVertexFormat.ENTITY, PrimitiveTopology.QUADS)
         .m_2725(false)
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2720(true, true)
         .m_2737(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2722()
   );
   private static final RenderPipeline f_11353 = RenderPipelinesMixin.register(
      Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2742(Identifier.fromNamespaceAndPath(Class_MudbbdJ9NuNWUNPe.f_11390, Class_MudbbdJ9NuNWUNPe.f_11391))
         .m_2734(f_11351)
         .m_2740(f_11351)
         .m_2741(Class_MudbbdJ9NuNWUNPe.f_11392)
         .m_2729(Class_MudbbdJ9NuNWUNPe.f_11393, UniformType.UNIFORM_BUFFER)
         .m_2739(DefaultVertexFormat.ENTITY, PrimitiveTopology.QUADS)
         .m_2725(false)
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2720(true, true)
         .m_2737(true)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2722()
   );
   private static final RenderType f_11354 = RenderTypeMixin.create(
      Class_MudbbdJ9NuNWUNPe.f_11394, RenderSetup.builder(f_11352).useLightmap().useOverlay().sortOnUpload().createRenderSetup()
   );
   private static final int f_11355 = 5;
   private static final List<Class_MudbbdJ9NuNWUNPe.fwaSiQ6RuCj0M6Hj> f_11356 = new ArrayList<>();
   private static GpuTexture f_11357;
   private static GpuTextureView f_11358;
   private static GpuFormat f_11359;
   private static int f_11360;
   private static int f_11361;
   private static boolean f_11362;
   private static final float f_11363 = 0.001F;
   private static final float f_11364 = 0.001F;
   private static final float f_11365 = 1.5F;
   private static final float f_11366 = 0.5F;
   private static final String f_11367 = "PrismaticChams";
   private static final String f_11368 = "Sampler0";
   private static final String f_11369 = "PrismaticChams";
   private static final String f_11370 = "dimasik-prismatic-chams-screen";
   private static final float f_11371 = 1.0E9F;
   private static final float f_11372 = 1.0E-5F;
   private static final float f_11373 = -1.0E-5F;
   private static final float f_11374 = 1.0E-5F;
   private static final float f_11375 = 0.5F;
   private static final float f_11376 = 0.5F;
   private static final float f_11377 = 0.5F;
   private static final float f_11378 = 0.5F;
   private static final int f_11379 = Integer.MIN_VALUE;
   private static final float f_11380 = 17.0F;
   private static final float f_11381 = 31.0F;
   private static final int f_11382 = 65535;
   private static final float f_11383 = 65535.0F;
   private static final String f_11384 = "prismaticChams";
   private static final String f_11385 = "prismatic_chams";
   private static final String f_11386 = "dimasik";
   private static final String f_11387 = "pipeline/prismatic_chams_visible";
   private static final String f_11388 = "Sampler0";
   private static final String f_11389 = "PrismaticChams";
   private static final String f_11390 = "dimasik";
   private static final String f_11391 = "pipeline/prismatic_chams_depth";
   private static final String f_11392 = "Sampler0";
   private static final String f_11393 = "PrismaticChams";
   private static final String f_11394 = "dimasik/prismatic_chams_visible";

   public static void m_3972() {
      f_11362 = false;
      f_11356.clear();
   }

   public static void m_3973() {
      f_11354.format();
   }

   private static void m_3974(Model var0, LivingEntityRenderState var1, Pose var2, int var3, int var4, int var5, float var6, float var7) {
      Chams var8 = Chams.m_9787();
      if (var8 != null && var0 != null && var1 != null && var2 != null) {
         var0.setupAnim(var1);
         PoseStack var9 = new PoseStack();
         var9.mulPose(m_3977(var2));
         BufferBuilder var10 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.ENTITY);
         var0.renderToBuffer(var9, var10, var3, var4, ARGB.opaque(var5));
         MeshData var11 = var10.build();
         if (var11 != null) {
            try {
               DrawState var12 = var11.drawState();
               int var13 = var12.indexCount();
               if (var13 <= 0) {
                  return;
               }

               AutoStorageIndexBuffer var14 = RenderSystem.getSequentialBuffer(var12.primitiveTopology());
               GpuBuffer var15 = var14.getBuffer(var13);
               IndexType var16 = var14.type();
               GpuBufferSlice var17 = Class_HtEPOqGrAYrUdumw.m_2944(var11.vertexBuffer(), var12.format().getVertexSize());
               RenderTarget var18 = Minecraft.getInstance().gameRenderer.mainRenderTarget();
               if (var18 == null || var18.getColorTextureView() == null) {
                  return;
               }

               if (f_11362 && f_11358 != null && !f_11358.isClosed()) {
                  boolean var19 = var6 > f_11365;
                  GpuBufferSlice var20 = m_3988(var8, var1, var2, var19 ? 1.0F : var6, var7);
                  GpuBufferSlice var21 = var19 ? m_3988(var8, var1, var2, 0.0F, var7) : null;
                  CommandEncoder var22 = RenderSystem.getDevice().createCommandEncoder();
                  RenderPipeline var23 = var6 > f_11366 ? f_11353 : f_11352;
                  RenderPass var24 = var22.createRenderPass(
                     () -> f_11384, var18.getColorTextureView(), Optional.empty(), var18.getDepthTextureView(), OptionalDouble.empty()
                  );

                  try {
                     RenderSystem.bindDefaultUniforms(var24);
                     var24.setPipeline(var23);
                     var24.setUniform(f_11367, var20);
                     var24.bindTexture(f_11368, f_11358, RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
                     var24.setVertexBuffer(0, var17);
                     var24.setIndexBuffer(var15, var16);
                     var24.drawIndexed(var13, 1, 0, 0, 0);
                     if (var19) {
                        var24.setPipeline(f_11352);
                        var24.setUniform(f_11369, var21);
                        var24.drawIndexed(var13, 1, 0, 0, 0);
                     }
                  } catch (Throwable var32) {
                     if (var24 != null) {
                        try {
                           var24.close();
                        } catch (Throwable var31) {
                           var32.addSuppressed(var31);
                        }
                     }

                     throw var32;
                  }

                  if (var24 != null) {
                     var24.close();
                  }

                  return;
               }
            } finally {
               var11.close();
            }
         }
      }
   }

   private static Vec3 m_3975() {
      Minecraft var0 = Minecraft.getInstance();
      return var0 != null && var0.gameRenderer != null && var0.gameRenderer.mainCamera() != null ? var0.gameRenderer.mainCamera().position() : Vec3.ZERO;
   }

   private static void m_3976(GpuTexture var0, int var1, int var2) {
      GpuFormat var3 = var0.getFormat();
      if (f_11357 == null || f_11358 == null || f_11357.isClosed() || f_11358.isClosed() || f_11360 != var1 || f_11361 != var2 || f_11359 != var3) {
         m_3979();
         f_11357 = RenderSystem.getDevice().createTexture(f_11370, 5, var3, var1, var2, 1, 1);
         f_11358 = RenderSystem.getDevice().createTextureView(f_11357);
         f_11359 = var3;
         f_11360 = var1;
         f_11361 = var2;
      }
   }

   private static Matrix4f m_3977(Pose var0) {
      Matrix4f var1 = new Matrix4f();
      Matrix4f var2 = Class_FvJXUGWpZo3zYBW4.m_2691();
      if (var2 != null) {
         var1.set(var2);
      }

      return var1.mul(var0.pose());
   }

   public static void m_3978(Model var0, LivingEntityRenderState var1, Pose var2, int var3, int var4, int var5, float var6) {
      if (var0 != null && var1 != null && var2 != null) {
         f_11356.add(new Class_MudbbdJ9NuNWUNPe.fwaSiQ6RuCj0M6Hj(var0, var1, var2.copy(), var3, var4, var5, var6));
      }
   }

   private Class_MudbbdJ9NuNWUNPe() {
   }

   private static void m_3979() {
      GpuTextureView var0 = f_11358;
      GpuTexture var1 = f_11357;
      f_11358 = null;
      f_11357 = null;
      f_11359 = null;
      f_11360 = 0;
      f_11361 = 0;
      if (var0 != null && !var0.isClosed()) {
         var0.close();
      }

      if (var1 != null && !var1.isClosed()) {
         var1.close();
      }
   }

   public static void m_3980() {
      if (!f_11356.isEmpty() && !f_11362) {
         m_3986();
      }
   }

   private static Vector4f m_3982(Pose var0, Vector4f var1) {
      Matrix4f var2 = Class_FvJXUGWpZo3zYBW4.m_2698();
      if (var2 == null) {
         var2 = new Matrix4f();
      }

      Vector4f var3 = new Vector4f(0.0F, 1.0F, 0.0F, 1.0F);
      m_3977(var0).transform(var3);
      var2.transform(var3);
      float var4 = Math.abs(var3.w) < f_11372 ? (var3.w < 0.0F ? f_11373 : f_11374) : var3.w;
      float var5 = (var3.x / var4 * f_11375 + f_11376) * var1.x;
      float var6 = (var3.y / var4 * f_11377 + f_11378) * var1.y;
      return new Vector4f(var5, var6, 0.0F, 0.0F);
   }

   public static RenderType m_3983() {
      return f_11354;
   }

   public static void m_3984() {
      if (!f_11356.isEmpty()) {
         try {
            Chams var0 = Chams.m_9787();
            if (var0 == null || var0.m_9783() <= f_11363) {
               return;
            }

            m_3986();
            if (!f_11362 || f_11358 == null || f_11358.isClosed()) {
               return;
            }

            for (Class_MudbbdJ9NuNWUNPe.fwaSiQ6RuCj0M6Hj var2 : f_11356) {
               float var3 = var0.m_9798(var2.state);
               if (!(var3 <= f_11364)) {
                  m_3974(var2.model, var2.state, var2.entry, var2.light, var2.overlay, var2.color, var2.depthPass, var3);
               }
            }
         } finally {
            f_11356.clear();
         }
      }
   }

   private static Vector4f m_3985() {
      int var0 = f_11362 && f_11360 > 0 ? f_11360 : 0;
      int var1 = f_11362 && f_11361 > 0 ? f_11361 : 0;
      if (var0 <= 0 || var1 <= 0) {
         Minecraft var2 = Minecraft.getInstance();
         if (var2 != null && var2.getWindow() != null) {
            var0 = var2.getWindow().getWidth();
            var1 = var2.getWindow().getHeight();
         }
      }

      var0 = Math.max(1, var0);
      var1 = Math.max(1, var1);
      return new Vector4f(var0, var1, 1.0F / var0, 1.0F / var1);
   }

   private static void m_3986() {
      if (!f_11362) {
         Minecraft var0 = Minecraft.getInstance();
         if (var0 != null) {
            RenderTarget var1 = var0.gameRenderer.mainRenderTarget();
            if (var1 != null) {
               GpuTexture var2 = var1.getColorTexture();
               if (var2 != null && !var2.isClosed()) {
                  int var3 = Math.max(1, var2.getWidth(0));
                  int var4 = Math.max(1, var2.getHeight(0));
                  m_3976(var2, var3, var4);
                  if (f_11357 != null && f_11358 != null && !f_11357.isClosed() && !f_11358.isClosed()) {
                     RenderSystem.getDevice().createCommandEncoder().copyTextureToTexture(var2, f_11357, 0, 0, 0, 0, 0, var3, var4);
                     f_11360 = var3;
                     f_11361 = var4;
                     f_11362 = true;
                  }
               }
            }
         }
      }
   }

   private static float m_3987(LivingEntityRenderState var0) {
      int var1 = Chams.m_9792(var0);
      int var2 = var1 == f_11379 ? Float.floatToIntBits((float)var0.x * f_11380 + (float)var0.z * f_11381) : var1;
      var2 ^= var2 << 13;
      var2 ^= var2 >>> 17;
      var2 ^= var2 << 5;
      return (var2 & f_11382) / f_11383;
   }

   private static GpuBufferSlice m_3988(Chams var0, LivingEntityRenderState var1, Pose var2, float var3, float var4) {
      float[] var5 = var0.m_9790();
      float[] var6 = var0.m_9802();
      Vec3 var7 = m_3975();
      float var8 = (float)(System.nanoTime() - f_11350) / f_11371;
      float var9 = m_3987(var1);
      float var10 = var0.m_9788() ? 0.0F : (var0.m_9785() ? 1.0F : 2.0F);
      Vector4f var11 = m_3985();
      Vector4f var12 = m_3982(var2, var11);
      MemoryStack var13 = MemoryStack.stackPush();

      GpuBufferSlice var15;
      try {
         ByteBuffer var14 = Std140Builder.onStack(var13, 112)
            .putVec4(var5[0], var5[1], var5[2], var5[3])
            .putVec4(var6[0], var6[1], var6[2], var6[3])
            .putVec4((float)var7.x, (float)var7.y, (float)var7.z, var8)
            .putVec4(var0.m_9786(), var0.m_9783(), var0.m_9795(), var0.m_9793())
            .putVec4(var4, var3, var9, var10)
            .putVec4(var11.x, var11.y, var11.z, var11.w)
            .putVec4(var12.x, var12.y, var12.z, var12.w)
            .get();
         var15 = Class_HtEPOqGrAYrUdumw.m_2945(var14);
      } catch (Throwable var17) {
         if (var13 != null) {
            try {
               var13.close();
            } catch (Throwable var16) {
               var17.addSuppressed(var16);
            }
         }

         throw var17;
      }

      if (var13 != null) {
         var13.close();
      }

      return var15;
   }

   private record fwaSiQ6RuCj0M6Hj(Model model, LivingEntityRenderState state, Pose entry, int light, int overlay, int color, float depthPass) {
   }
}
