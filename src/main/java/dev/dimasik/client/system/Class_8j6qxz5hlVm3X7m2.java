package dev.dimasik.client.system;

import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.pipeline.TextureTarget;
import com.mojang.blaze3d.platform.BlendFactor;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.shaders.UniformType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.AutoStorageIndexBuffer;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuSampler;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.MeshData;
import com.mojang.blaze3d.vertex.MeshData.DrawState;
import dev.dimasik.mixin.RenderPipelinesMixin;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.DynamicUniformStorage;
import net.minecraft.client.renderer.DynamicUniformStorage.DynamicUniform;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Class_8j6qxz5hlVm3X7m2 {
   public static final String f_4153 = "Auto";
   public static final String f_4154 = "Always";
   public static final String f_4155 = "Never";
   private static final Minecraft f_4156 = Minecraft.getInstance();
   private static final Logger f_4157 = LoggerFactory.getLogger(Class_8j6qxz5hlVm3X7m2.f_4275);
   private static final List<Runnable> f_4158 = new ArrayList<>();
   private static final BlendFunction f_4159 = new BlendFunction(BlendFactor.SRC_ALPHA, BlendFactor.ONE, BlendFactor.ONE, BlendFactor.ZERO);
   private static final BlendFunction f_4160 = new BlendFunction(
      BlendFactor.ONE, BlendFactor.ONE_MINUS_SRC_ALPHA, BlendFactor.ONE, BlendFactor.ONE_MINUS_SRC_ALPHA
   );
   private static final RenderPipeline f_4161 = m_1866(Class_8j6qxz5hlVm3X7m2.f_4276, CompareOp.ALWAYS_PASS);
   private static final RenderPipeline f_4162 = m_1866(Class_8j6qxz5hlVm3X7m2.f_4277, CompareOp.GREATER_THAN_OR_EQUAL);
   private static final RenderPipeline f_4163 = RenderPipelinesMixin.register(
      Class_GEnQMkY73qXewYpU.m_2718()
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_8j6qxz5hlVm3X7m2.f_4278))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_8j6qxz5hlVm3X7m2.f_4279))
         .m_2741(Class_8j6qxz5hlVm3X7m2.f_4280)
         .m_2729(Class_8j6qxz5hlVm3X7m2.f_4281, UniformType.UNIFORM_BUFFER)
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2739(DefaultVertexFormat.POSITION, PrimitiveTopology.TRIANGLE_STRIP)
         .m_2742(Identifier.fromNamespaceAndPath(Class_8j6qxz5hlVm3X7m2.f_4282, Class_8j6qxz5hlVm3X7m2.f_4283))
         .m_2722()
   );
   private static final RenderPipeline f_4164 = RenderPipelinesMixin.register(
      Class_GEnQMkY73qXewYpU.m_2718()
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_8j6qxz5hlVm3X7m2.f_4284))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_8j6qxz5hlVm3X7m2.f_4285))
         .m_2741(Class_8j6qxz5hlVm3X7m2.f_4286)
         .m_2729(Class_8j6qxz5hlVm3X7m2.f_4287, UniformType.UNIFORM_BUFFER)
         .m_2732(f_4160)
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2739(DefaultVertexFormat.POSITION, PrimitiveTopology.TRIANGLE_STRIP)
         .m_2742(Identifier.fromNamespaceAndPath(Class_8j6qxz5hlVm3X7m2.f_4288, Class_8j6qxz5hlVm3X7m2.f_4289))
         .m_2722()
   );
   private static final DynamicUniformStorage<Class_8j6qxz5hlVm3X7m2.szGtUBFAEr0CJ7Uv> f_4165 = new DynamicUniformStorage(
      Class_8j6qxz5hlVm3X7m2.f_4290, 96, 256
   );
   private static final DynamicUniformStorage<Class_8j6qxz5hlVm3X7m2.abXuACoQvVDQJPr4> f_4166 = new DynamicUniformStorage(
      Class_8j6qxz5hlVm3X7m2.f_4291, 16, 256
   );
   private static final DynamicUniformStorage<Class_8j6qxz5hlVm3X7m2.abXuACoQvVDQJPr4> f_4167 = new DynamicUniformStorage(
      Class_8j6qxz5hlVm3X7m2.f_4292, 16, 256
   );
   private static GpuBuffer f_4168;
   private static long f_4169;
   private static GpuBuffer f_4170;
   private static GpuSampler f_4171;
   private static TextureTarget f_4172;
   private static TextureTarget f_4173;
   private static TextureTarget f_4174;
   private static long f_4175;
   private static float f_4176;
   private static boolean f_4177;
   private static final String f_4178 = "target/lightning_line";
   private static final String f_4179 = "target/lightning";
   private static final String f_4180 = "LightningLine";
   private static final String f_4181 = "dimasik";
   private static final float f_4182 = 12.0F;
   private static final float f_4183 = 0.007843138F;
   private static final String f_4184 = "Lightning TargetESP disabled after a render failure";
   private static final float f_4185 = 0.016666668F;
   private static final float f_4186 = 1.0E9F;
   private static final float f_4187 = 0.05F;
   private static final float f_4188 = 0.75F;
   private static final float f_4189 = 0.16F;
   private static final double f_4190 = 0.35;
   private static final int f_4191 = -16777216;
   private static final int f_4192 = 16718349;
   private static final float f_4193 = 0.5F;
   private static final float f_4194 = 0.085F;
   private static final float f_4195 = 10.0F;
   private static final float f_4196 = 22.0F;
   private static final float f_4197 = 0.4F;
   private static final float f_4198 = 9.0F;
   private static final float f_4199 = 6.0F;
   private static final float f_4200 = 1.3F;
   private static final float f_4201 = (float) (Math.PI * 2);
   private static final float f_4202 = 0.08F;
   private static final float f_4203 = 0.42F;
   private static final float f_4204 = 0.3F;
   private static final float f_4205 = 0.55F;
   private static final float f_4206 = 0.45F;
   private static final float f_4207 = 0.01F;
   private static final float f_4208 = 0.16F;
   private static final float f_4209 = 1.7F;
   private static final float f_4210 = 2.1F;
   private static final float f_4211 = (float) Math.PI;
   private static final float f_4212 = 0.6F;
   private static final float f_4213 = 0.5F;
   private static final float f_4214 = -1.0F;
   private static final float f_4215 = 0.85F;
   private static final float f_4216 = 0.05F;
   private static final float f_4217 = 0.67F;
   private static final float f_4218 = 0.12F;
   private static final float f_4219 = 0.9F;
   private static final float f_4220 = 10.0F;
   private static final float f_4221 = 0.5F;
   private static final float f_4222 = 1.0E-4F;
   private static final float f_4223 = 0.9F;
   private static final float f_4224 = 0.9F;
   private static final float f_4225 = 1.0E-5F;
   private static final float f_4226 = 0.3F;
   private static final float f_4227 = 0.5F;
   private static final float f_4228 = 0.5F;
   private static final float f_4229 = 0.5F;
   private static final float f_4230 = 0.5F;
   private static final float f_4231 = 0.45F;
   private static final float f_4232 = 0.4F;
   private static final float f_4233 = 0.4F;
   private static final float f_4234 = 0.4F;
   private static final float f_4235 = 1.0E-5F;
   private static final float f_4236 = 0.75F;
   private static final float f_4237 = 0.55F;
   private static final float f_4238 = 0.7F;
   private static final float f_4239 = 1.0E-5F;
   private static final float f_4240 = 3.0F;
   private static final int f_4241 = 374761393;
   private static final int f_4242 = 668265263;
   private static final int f_4243 = 1274126177;
   private static final int f_4244 = 1274126177;
   private static final int f_4245 = 65535;
   private static final float f_4246 = 32768.0F;
   private static final String f_4247 = "LightningLine";
   private static final String f_4248 = "Dimasik TargetESP lightning blur horizontal";
   private static final float f_4249 = 0.5F;
   private static final String f_4250 = "Dimasik TargetESP lightning blur vertical";
   private static final String f_4251 = "LightningComposite";
   private static final String f_4252 = "Sampler0";
   private static final String f_4253 = "LightningBlur";
   private static final String f_4254 = "Sampler0";
   private static final String f_4255 = "Always";
   private static final String f_4256 = "Never";
   private static final double f_4257 = 1.0E-8;
   private static final double f_4258 = 0.5;
   private static final float f_4259 = 36.0F;
   private static final int f_4260 = 16777215;
   private static final String f_4261 = "Dimasik TargetESP lightning capture";
   private static final String f_4262 = "Dimasik TargetESP lightning blur A";
   private static final String f_4263 = "Dimasik TargetESP lightning blur B";
   private static final long f_4264 = 8192L;
   private static final float f_4265 = -1.0F;
   private static final float f_4266 = -1.0F;
   private static final float f_4267 = -1.0F;
   private static final float f_4268 = -1.0F;
   private static final long f_4269 = 4L;
   private static final long f_4270 = 4L;
   private static final String f_4271 = "Dimasik TargetESP lightning fullscreen quad";
   private static final String f_4272 = "Dimasik TargetESP lightning vertices";
   private static final String f_4273 = "Dimasik TargetESP lightning bloom composite";
   private static final String f_4274 = "Dimasik TargetESP lightning";
   private static final String f_4275 = "dimasik-target-lightning";
   private static final String f_4276 = "target_lightning";
   private static final String f_4277 = "target_lightning_depth";
   private static final String f_4278 = "esp/esp_fullscreen";
   private static final String f_4279 = "target/lightning_blur";
   private static final String f_4280 = "Sampler0";
   private static final String f_4281 = "LightningBlur";
   private static final String f_4282 = "dimasik";
   private static final String f_4283 = "pipeline/target_lightning_blur";
   private static final String f_4284 = "esp/esp_fullscreen";
   private static final String f_4285 = "target/lightning_composite";
   private static final String f_4286 = "Sampler0";
   private static final String f_4287 = "LightningComposite";
   private static final String f_4288 = "dimasik";
   private static final String f_4289 = "pipeline/target_lightning_composite";
   private static final String f_4290 = "Target lightning line UBO";
   private static final String f_4291 = "Target lightning blur UBO";
   private static final String f_4292 = "Target lightning composite UBO";

   private static void m_1835(RenderTarget var0, float var1, float var2, boolean var3, float var4) {
      if (f_4172 != null && f_4173 != null && f_4174 != null && f_4170 != null) {
         CommandEncoder var5 = RenderSystem.getDevice().createCommandEncoder();
         m_1857(var5, f_4172.getColorTextureView(), f_4174, var1, f_4248);
         m_1857(var5, f_4174.getColorTextureView(), f_4173, -var1 * f_4249, f_4250);
         if (var3) {
            Class_tXNQy8JnA8G6nDOI.f_31830.m_8868(f_4173, var4);
         }

         GpuBufferSlice var6 = f_4167.writeUniform(new Class_8j6qxz5hlVm3X7m2.abXuACoQvVDQJPr4(var2));
         RenderPass var7 = var5.createRenderPass(() -> f_4273, var0.getColorTextureView(), Optional.empty(), null, OptionalDouble.empty());

         try {
            var7.setPipeline(f_4164);
            var7.setUniform(f_4251, var6);
            var7.bindTexture(f_4252, f_4173.getColorTextureView(), m_1852());
            var7.setVertexBuffer(0, f_4170.slice());
            var7.draw(4, 1, 0, 0);
         } catch (Throwable var11) {
            if (var7 != null) {
               try {
                  var7.close();
               } catch (Throwable var10) {
                  var11.addSuppressed(var10);
               }
            }

            throw var11;
         }

         if (var7 != null) {
            var7.close();
         }
      }
   }

   private static void m_1836() {
      m_1843(f_4172);
      m_1843(f_4173);
      m_1843(f_4174);
      f_4172 = null;
      f_4173 = null;
      f_4174 = null;
      m_1863(f_4168);
      f_4168 = null;
      f_4169 = 0L;
      m_1863(f_4170);
      f_4170 = null;
      f_4171 = null;
   }

   private static void m_1837(Camera var0, float var1, LivingEntity var2, float var3, int var4, boolean var5, String var6, boolean var7, float var8) {
      RenderTarget var9 = f_4156.gameRenderer.mainRenderTarget();
      if (var9 != null && var9.width > 0 && var9.height > 0) {
         m_1860(var9.width, var9.height);
         m_1846(RenderSystem.getDevice());
         long var10 = System.nanoTime();
         float var12 = f_4175 == 0L ? f_4185 : Math.min((float)(var10 - f_4175) / f_4186, f_4187);
         f_4175 = var10;
         f_4176 += var12;
         Vec3 var13 = var0.position();
         float var14 = (float)(Mth.lerp(var1, var2.xOld, var2.getX()) - var13.x);
         float var15 = (float)(Mth.lerp(var1, var2.yOld, var2.getY()) - var13.y);
         float var16 = (float)(Mth.lerp(var1, var2.zOld, var2.getZ()) - var13.z);
         float var17 = var2.getBbHeight();
         float var18 = var2.getBbWidth() * f_4188 + f_4189;
         int var19 = var4;
         if (var5 && var2.hurtTime > 0) {
            float var20 = Math.max(0.0F, var2.hurtTime - var1);
            float var21 = Math.max(1.0F, var2.hurtDuration);
            float var22 = Mth.clamp(var20 / var21, 0.0F, 1.0F);
            float var23 = (float)Math.pow(var22, f_4190);
            var19 = m_1849(var4, var4 & f_4191 | f_4192, var23);
         }

         boolean var30 = m_1865(var6, var13, var2);
         RenderPipeline var31 = var30 ? f_4162 : f_4161;
         Matrix4f var32 = m_1845();
         if (var32 != null) {
            float var33 = var15 + var17 * f_4193;
            double var24 = Math.sqrt(var14 * var14 + var33 * var33 + var16 * var16);
            float var26 = m_1861(f_4194, var24, var32, var9.height);
            MeshData var27 = m_1851(var14, var15, var16, var17, var18, var19, var3, f_4195, 1.0F);
            if (var27 != null) {
               m_1859(var27, var31, var32, var9.width, var9.height, f_4172.getColorTextureView(), var9.useDepth ? var9.getDepthTextureView() : null, true);
               m_1835(var9, var26, var3, var7, var8);
            }

            MeshData var28 = m_1851(var14, var15, var16, var17, var18, var19, var3, f_4196, f_4197);
            m_1859(var28, var31, var32, var9.width, var9.height, var9.getColorTextureView(), var9.useDepth ? var9.getDepthTextureView() : null, false);
            MeshData var29 = m_1851(var14, var15, var16, var17, var18, var19, var3, f_4198, 1.0F);
            m_1859(var29, var31, var32, var9.width, var9.height, var9.getColorTextureView(), var9.useDepth ? var9.getDepthTextureView() : null, false);
         }
      }
   }

   private static int m_1839(int var0, float var1) {
      int var2 = Math.round((var0 >>> 24 & 0xFF) * Mth.clamp(var1, 0.0F, 1.0F));
      return var2 << 24 | var0 & f_4260;
   }

   private static void m_1840(BufferBuilder var0, float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, float var9) {
      float var10 = var4 - var1;
      float var11 = var5 - var2;
      float var12 = var6 - var3;
      float var13 = (float)Math.sqrt(var10 * var10 + var11 * var11 + var12 * var12);
      if (!(var13 < f_4239)) {
         float var14 = 1.0F / var13;
         float var15 = var10 * var14;
         float var16 = var11 * var14;
         float var17 = var12 * var14;
         var0.addVertex(var1, var2, var3).setColor(var7).setNormal(var15, var16, var17).setLineWidth(var9);
         var0.addVertex(var4, var5, var6).setColor(var8).setNormal(var15, var16, var17).setLineWidth(var9);
      }
   }

   private static void m_1841(int var0) {
      if (f_4168 == null || f_4168.isClosed() || f_4169 < var0) {
         m_1863(f_4168);
         long var1 = f_4264;

         while (var1 < var0) {
            var1 <<= 1;
         }

         f_4168 = RenderSystem.getDevice().createBuffer(() -> f_4272, 40, var1);
         f_4169 = var1;
      }
   }

   private static void m_1843(TextureTarget var0) {
      if (var0 != null) {
         f_4158.add(var0::destroyBuffers);
      }
   }

   private Class_8j6qxz5hlVm3X7m2() {
   }

   public static void m_1844() {
      m_1836();
      m_1858();
      f_4175 = 0L;
      f_4176 = 0.0F;
      f_4177 = false;
   }

   private static Matrix4f m_1845() {
      Matrix4f var0 = Class_FvJXUGWpZo3zYBW4.m_2698();
      Matrix4f var1 = Class_FvJXUGWpZo3zYBW4.m_2691();
      return var0 != null && var1 != null ? var0.mul(var1) : null;
   }

   private static void m_1846(GpuDevice var0) {
      if (f_4170 == null || f_4170.isClosed()) {
         f_4170 = null;
         float[] var1 = new float[]{f_4265, f_4266, 0.0F, 1.0F, f_4267, 0.0F, f_4268, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F};
         ByteBuffer var2 = ByteBuffer.allocateDirect(var1.length * 4).order(ByteOrder.nativeOrder());

         for (float var6 : var1) {
            var2.putFloat(var6);
         }

         var2.flip();
         f_4170 = var0.createBuffer(() -> f_4271, 40, var1.length * f_4269);
         var0.createCommandEncoder().writeToBuffer(f_4170.slice(0L, var1.length * f_4270), var2);
      }
   }

   public static void m_1848(Camera var0, float var1, LivingEntity var2, float var3, int var4, boolean var5, String var6, boolean var7, float var8) {
      if (!f_4177 && var0 != null && var2 != null && !(var3 <= f_4183) && f_4156.level != null && f_4156.player != null) {
         try {
            m_1837(var0, var1, var2, var3, var4, var5, var6, var7, var8);
         } catch (Throwable var10) {
            f_4177 = true;
            f_4157.error(f_4184, var10);
            m_1836();
         }
      }
   }

   private static int m_1849(int var0, int var1, float var2) {
      float var3 = Mth.clamp(var2, 0.0F, 1.0F);
      int var4 = Mth.lerpInt(var3, var0 >>> 24 & 0xFF, var1 >>> 24 & 0xFF);
      int var5 = Mth.lerpInt(var3, var0 >>> 16 & 0xFF, var1 >>> 16 & 0xFF);
      int var6 = Mth.lerpInt(var3, var0 >>> 8 & 0xFF, var1 >>> 8 & 0xFF);
      int var7 = Mth.lerpInt(var3, var0 & 0xFF, var1 & 0xFF);
      return var4 << 24 | var5 << 16 | var6 << 8 | var7;
   }

   private static void m_1850(
      BufferBuilder var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      int var7,
      float var8,
      float var9,
      float var10,
      int var11,
      int var12,
      int var13,
      int var14,
      float var15
   ) {
      float var16 = var4 - var1;
      float var17 = var5 - var2;
      float var18 = var6 - var3;
      float var19 = (float)Math.sqrt(var16 * var16 + var17 * var17 + var18 * var18);
      if (var7 > 0 && !(var19 < f_4222)) {
         float var20 = var16 / var19;
         float var21 = var17 / var19;
         float var22 = var18 / var19;
         float var23 = Math.abs(var21) < f_4223 ? 0.0F : 1.0F;
         float var24 = Math.abs(var21) < f_4224 ? 1.0F : 0.0F;
         float var25 = -var22 * var24;
         float var26 = var22 * var23;
         float var27 = var20 * var24 - var21 * var23;
         float var28 = (float)Math.sqrt(var25 * var25 + var26 * var26 + var27 * var27);
         if (var28 < f_4225) {
            var28 = 1.0F;
         }

         var25 /= var28;
         var26 /= var28;
         var27 /= var28;
         float var29 = var21 * var27 - var22 * var26;
         float var30 = var22 * var25 - var20 * var27;
         float var31 = var20 * var26 - var21 * var25;
         float var32 = m_1862(var12, 0, 0, var14, var15);
         float var33 = m_1862(var12, 1, 0, var14, var15);
         float var34 = var19 * f_4226;
         float var35 = (var1 + var4) * f_4227 + (var25 * var32 + var29 * var33) * var34;
         float var36 = (var2 + var5) * f_4228 + (var26 * var32 + var30 * var33) * var34;
         float var37 = (var3 + var6) * f_4229 + (var27 * var32 + var31 * var33) * var34;
         float var38 = (var9 + var10) * f_4230;
         m_1850(var0, var1, var2, var3, var35, var36, var37, var7 - 1, var8, var9, var38, var11, var12 * 2 + 7, var13, var14, var15);
         m_1850(var0, var35, var36, var37, var4, var5, var6, var7 - 1, var8, var38, var10, var11, var12 * 2 + 9, var13, var14, var15);
         if (var13 < 2 && var7 >= 2 && m_1862(var12, 2, 0, var14, var15) > f_4231) {
            float var39 = m_1862(var12, 3, 0, var14, var15);
            float var40 = m_1862(var12, 4, 0, var14, var15);
            float var41 = var20 * f_4232 + var25 * var39 + var29 * var40;
            float var42 = var21 * f_4233 + var26 * var39 + var30 * var40;
            float var43 = var22 * f_4234 + var27 * var39 + var31 * var40;
            float var44 = (float)Math.sqrt(var41 * var41 + var42 * var42 + var43 * var43);
            if (var44 < f_4235) {
               var44 = 1.0F;
            }

            float var45 = var19 * f_4236 / var44;
            m_1850(
               var0,
               var35,
               var36,
               var37,
               var35 + var41 * var45,
               var36 + var42 * var45,
               var37 + var43 * var45,
               Math.min(var7 - 1, 3),
               var8 * f_4237,
               var38 * f_4238,
               0.0F,
               var11,
               var12 * 3 + 13,
               var13 + 1,
               var14,
               var15
            );
         }
      } else {
         m_1840(var0, var1, var2, var3, var4, var5, var6, m_1839(var11, var9), m_1839(var11, var10), var8);
      }
   }

   private static MeshData m_1851(float var0, float var1, float var2, float var3, float var4, int var5, float var6, float var7, float var8) {
      BufferBuilder var9 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.LINES, DefaultVertexFormat.POSITION_COLOR_NORMAL_LINE_WIDTH);
      byte var10 = 3;
      byte var11 = 3;
      float var12 = f_4176 * f_4199;
      int var13 = (int)var12;
      float var14 = var12 - var13;
      float var15 = f_4200;
      float var16 = f_4201;

      for (int var17 = 0; var17 < var10; var17++) {
         float var18 = f_4176 * var15 + (float)var17 / var10;
         int var19 = (int)Math.floor(var18);
         float var20 = var18 - var19;
         float var21 = Mth.clamp(var20 / f_4202, 0.0F, 1.0F);
         float var22 = 1.0F - Mth.clamp((var20 - f_4203) / f_4204, 0.0F, 1.0F);
         float var23 = Mth.clamp(f_4205 + f_4206 * m_1862(var17, 900, 0, var13, var14), 0.0F, 1.0F);
         float var24 = var21 * var22 * var23;
         if (!(var24 <= f_4207)) {
            float var25 = var6 * var24 * var8;
            float var26 = var3 * f_4208 * (float)Math.sin(f_4176 * f_4209 + var17 * f_4210);
            float var27 = m_1854(var17, 11, var19) * f_4211;
            float var28 = f_4212 + f_4213 * Math.abs(m_1854(var17, 12, var19));
            float var29 = m_1854(var17, 13, var19) >= 0.0F ? 1.0F : f_4214;
            float var30 = var1 + var3 * (f_4215 + f_4216 * m_1854(var17, 14, var19));
            float var31 = var3 * f_4217;
            float var32 = var4 * (1.0F + f_4218 * m_1854(var17, 15, var19));
            float var33 = 0.0F;
            float var34 = 0.0F;
            float var35 = 0.0F;

            for (int var36 = 0; var36 <= var11; var36++) {
               float var37 = (float)var36 / var11;
               float var38 = var27 + f_4176 * f_4219 + var29 * var28 * var16 * var37;
               float var39 = var0 + (float)Math.cos(var38) * var32;
               float var40 = var2 + (float)Math.sin(var38) * var32;
               float var41 = var30 - var31 * var37 + var26;
               if (var7 == f_4220 && var36 > 0 && var36 < var11) {
                  Class_vjVj7yuYZq5AqDPM.m_9273(var39, var41, var40, f_4221, m_1839(var5, var25));
               }

               if (var36 > 0) {
                  int var42 = (var17 * 131 + var36) * 17 + var19 * 101 | 1;
                  m_1850(var9, var33, var34, var35, var39, var41, var40, 4, var7, var25, var25, var5, var42, 0, var13, var14);
               }

               var33 = var39;
               var34 = var41;
               var35 = var40;
            }
         }
      }

      return var9.build();
   }

   private static GpuSampler m_1852() {
      if (f_4171 == null) {
         f_4171 = RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR);
      }

      return f_4171;
   }

   public static void m_1853(Camera var0, float var1, LivingEntity var2, float var3, int var4, boolean var5, String var6) {
      m_1848(var0, var1, var2, var3, var4, var5, var6, false, f_4182);
   }

   private static float m_1854(int var0, int var1, int var2) {
      int var3 = var0 * f_4241 + var1 * f_4242 + var2 * f_4243;
      var3 = (var3 ^ var3 >>> 13) * f_4244;
      var3 ^= var3 >>> 16;
      return (var3 & f_4245) / f_4246 - 1.0F;
   }

   public static void m_1855() {
      f_4165.endFrame();
      f_4166.endFrame();
      f_4167.endFrame();
      m_1858();
   }

   private static void m_1857(CommandEncoder var0, GpuTextureView var1, TextureTarget var2, float var3, String var4) {
      GpuBufferSlice var5 = f_4166.writeUniform(new Class_8j6qxz5hlVm3X7m2.abXuACoQvVDQJPr4(var3));
      RenderPass var6 = var0.createRenderPass(() -> var4, var2.getColorTextureView(), Optional.of(new Vector4f(0.0F)), null, OptionalDouble.empty());

      try {
         var6.setPipeline(f_4163);
         var6.setUniform(f_4253, var5);
         var6.bindTexture(f_4254, var1, m_1852());
         var6.setVertexBuffer(0, f_4170.slice());
         var6.draw(4, 1, 0, 0);
      } catch (Throwable var10) {
         if (var6 != null) {
            try {
               var6.close();
            } catch (Throwable var9) {
               var10.addSuppressed(var9);
            }
         }

         throw var10;
      }

      if (var6 != null) {
         var6.close();
      }
   }

   private static void m_1858() {
      for (int var0 = 0; var0 < f_4158.size(); var0++) {
         try {
            f_4158.get(var0).run();
         } catch (Throwable var2) {
         }
      }

      f_4158.clear();
   }

   private static void m_1859(MeshData var0, RenderPipeline var1, Matrix4f var2, int var3, int var4, GpuTextureView var5, GpuTextureView var6, boolean var7) {
      if (var0 != null && var5 != null) {
         MeshData var8 = var0;

         label72: {
            try {
               ByteBuffer var9 = var0.vertexBuffer();
               int var10 = var9.remaining();
               if (var10 <= 0) {
                  break label72;
               }

               m_1841(var10);
               CommandEncoder var11 = RenderSystem.getDevice().createCommandEncoder();
               var11.writeToBuffer(f_4168.slice(0L, var10), var9);
               GpuBufferSlice var12 = f_4165.writeUniform(new Class_8j6qxz5hlVm3X7m2.szGtUBFAEr0CJ7Uv(var2, var3, var4));
               RenderPass var13 = var11.createRenderPass(
                  () -> f_4274, var5, var7 ? Optional.of(new Vector4f(0.0F)) : Optional.empty(), var6, OptionalDouble.empty()
               );

               try {
                  var13.setPipeline(var1);
                  var13.setUniform(f_4247, var12);
                  var13.setVertexBuffer(0, f_4168.slice());
                  DrawState var14 = var0.drawState();
                  AutoStorageIndexBuffer var15 = RenderSystem.getSequentialBuffer(var14.primitiveTopology());
                  var13.setIndexBuffer(var15.getBuffer(var14.indexCount()), var15.type());
                  var13.drawIndexed(var14.indexCount(), 1, 0, 0, 0);
               } catch (Throwable var18) {
                  if (var13 != null) {
                     try {
                        var13.close();
                     } catch (Throwable var17) {
                        var18.addSuppressed(var17);
                     }
                  }

                  throw var18;
               }

               if (var13 != null) {
                  var13.close();
               }
            } catch (Throwable var19) {
               if (var8 != null) {
                  try {
                     var8.close();
                  } catch (Throwable var16) {
                     var19.addSuppressed(var16);
                  }
               }

               throw var19;
            }

            if (var8 != null) {
               var8.close();
            }

            return;
         }

         if (var8 != null) {
            var8.close();
         }
      }
   }

   private static void m_1860(int var0, int var1) {
      int var2 = Math.max(1, var0 / 2);
      int var3 = Math.max(1, var1 / 2);
      if (f_4172 == null || f_4172.width != var0 || f_4172.height != var1) {
         m_1843(f_4172);
         f_4172 = new TextureTarget(f_4261, var0, var1, false, GpuFormat.RGBA8_UNORM);
      }

      if (f_4173 == null || f_4173.width != var2 || f_4173.height != var3) {
         m_1843(f_4173);
         f_4173 = new TextureTarget(f_4262, var2, var3, false, GpuFormat.RGBA8_UNORM);
      }

      if (f_4174 == null || f_4174.width != var2 || f_4174.height != var3) {
         m_1843(f_4174);
         f_4174 = new TextureTarget(f_4263, var2, var3, false, GpuFormat.RGBA8_UNORM);
      }
   }

   private static float m_1861(float var0, double var1, Matrix4f var3, int var4) {
      float var5 = (float)Math.sqrt(var3.m01() * var3.m01() + var3.m11() * var3.m11() + var3.m21() * var3.m21());
      float var6 = var5 * var4 / (2.0F * (float)Math.max(var1, f_4258));
      return Mth.clamp(var0 * var6, 1.0F, f_4259);
   }

   private static float m_1862(int var0, int var1, int var2, int var3, float var4) {
      float var5 = m_1854(var0, var1, var3 * 4 + var2);
      float var6 = m_1854(var0, var1, (var3 + 1) * 4 + var2);
      float var7 = var4 * var4 * (f_4240 - 2.0F * var4);
      return var5 + (var6 - var5) * var7;
   }

   private static void m_1863(GpuBuffer var0) {
      if (var0 != null) {
         f_4158.add(() -> {
            if (!var0.isClosed()) {
               var0.close();
            }
         });
      }
   }

   private static boolean m_1865(String var0, Vec3 var1, LivingEntity var2) {
      if (f_4255.equalsIgnoreCase(var0)) {
         return true;
      }

      if (!f_4256.equalsIgnoreCase(var0) && f_4156.level != null) {
         AABB var3 = var2.getBoundingBox();
         Vec3 var4 = new Vec3(Mth.clamp(var1.x, var3.minX, var3.maxX), Mth.clamp(var1.y, var3.minY, var3.maxY), Mth.clamp(var1.z, var3.minZ, var3.maxZ));
         if (var4.distanceToSqr(var1) < f_4257) {
            return false;
         }

         BlockHitResult var5 = f_4156.level.clip(new ClipContext(var1, var4, Block.OUTLINE, Fluid.NONE, f_4156.player));
         return var5.getType() != Type.MISS;
      } else {
         return false;
      }
   }

   private static RenderPipeline m_1866(String var0, CompareOp var1) {
      return RenderPipelinesMixin.register(
         Class_GEnQMkY73qXewYpU.m_2718()
            .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_4178))
            .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_4179))
            .m_2729(f_4180, UniformType.UNIFORM_BUFFER)
            .m_2732(f_4159)
            .m_2719(var1)
            .m_2737(false)
            .m_2725(false)
            .m_2739(DefaultVertexFormat.POSITION_COLOR_NORMAL_LINE_WIDTH, PrimitiveTopology.LINES)
            .m_2742(Identifier.fromNamespaceAndPath(f_4181, var0 + ""))
            .m_2722()
      );
   }

   private record abXuACoQvVDQJPr4(float value) implements DynamicUniform {
      public void write(ByteBuffer var1) {
         var1.putFloat(this.value).putFloat(0.0F).putFloat(0.0F).putFloat(0.0F);
      }
   }

   private record szGtUBFAEr0CJ7Uv(Matrix4f mvp, float screenWidth, float screenHeight) implements DynamicUniform {
      public void write(ByteBuffer var1) {
         this.mvp.get(var1);
         var1.position(var1.position() + 64);
         var1.putFloat(1.0F).putFloat(1.0F).putFloat(1.0F).putFloat(1.0F);
         var1.putFloat(this.screenWidth).putFloat(this.screenHeight).putFloat(0.0F).putFloat(0.0F);
      }
   }
}
