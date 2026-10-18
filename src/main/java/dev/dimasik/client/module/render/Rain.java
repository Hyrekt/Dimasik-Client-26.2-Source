package dev.dimasik.client.module.render;

import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.ProjectionType;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.pipeline.TextureTarget;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.resource.GraphicsResourceAllocator;
import com.mojang.blaze3d.shaders.UniformType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.ScissorState;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_NzJrN63M7QBpmAbi;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import net.minecraft.client.Camera;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.ProjectionMatrixBuffer;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.core.Direction.Axis;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.Mth;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap.Types;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;

public final class Rain extends Module {
   private static final int f_20287 = 32;
   private static final int f_20288 = 3;
   private static final int f_20289 = 1408;
   private static final int f_20290 = 42;
   private static final int f_20291 = 6;
   private static final int f_20292 = 48;
   private static final double f_20293 = 48.0;
   private static final float f_20294 = 0.55F;
   private static final float f_20295 = 0.68F;
   private final SliderSetting f_20296;
   private final SliderSetting f_20297;
   private final SliderSetting f_20298;
   private final SliderSetting f_20299;
   private final SliderSetting f_20300;
   private final CheckboxSetting f_20301;
   private final SliderSetting f_20302;
   private final SliderSetting f_20303;
   private final CheckboxSetting f_20304;
   private final RenderPipeline f_20305;
   private final TextureTarget[] f_20306;
   private final ProjectionMatrixBuffer[] f_20307;
   private final Matrix4f[] f_20308;
   private final Matrix4f f_20309;
   private final Matrix4f f_20310;
   private final float[] f_20311;
   private TextureTarget f_20312;
   private GpuBuffer f_20313;
   private ClientLevel f_20314;
   private int f_20315;
   private int f_20316;
   private int f_20317;
   private boolean f_20318;
   private boolean f_20319;
   private boolean f_20320;
   private Vec3 f_20321;
   private boolean f_20322;
   private static boolean f_20323;
   private static RenderTarget f_20324;
   private static Matrix4f f_20325;
   private static Matrix4f f_20326;
   private final List<Rain.Class_73l7foKBzFGGFnra> f_20327;
   private final List<Rain.Class_73l7foKBzFGGFnra> f_20328;
   private final float[] f_20329;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_20330;
   private ClientLevel f_20331;
   private Vec3 f_20332;
   private double f_20333;
   private boolean f_20334;
   private int f_20335;
   private int f_20336;
   private int f_20337;
   private static final String f_20338 = "Rain";
   private static final String f_20339 = "Стабильные влажные отражения на поверхности";
   private static final String f_20340 = "Сила отражений";
   private static final float f_20341 = 0.32F;
   private static final float f_20342 = 0.02F;
   private static final float f_20343 = 0.01F;
   private static final String f_20344 = "Искажение и движение";
   private static final float f_20345 = 0.4F;
   private static final float f_20346 = 2.5F;
   private static final float f_20347 = 0.05F;
   private static final String f_20348 = "Мягкость отражений";
   private static final float f_20349 = 0.72F;
   private static final float f_20350 = 0.2F;
   private static final float f_20351 = 0.02F;
   private static final String f_20352 = "Затемнение мокрой поверхности";
   private static final float f_20353 = 0.1F;
   private static final float f_20354 = 0.25F;
   private static final float f_20355 = 0.01F;
   private static final String f_20356 = "Активность дождевой воды";
   private static final float f_20357 = 1.35F;
   private static final float f_20358 = 3.0F;
   private static final float f_20359 = 0.05F;
   private static final String f_20360 = "Брызги при ходьбе";
   private static final String f_20361 = "Сила брызг";
   private static final float f_20362 = 0.2F;
   private static final float f_20363 = 0.05F;
   private static final String f_20364 = "Время жизни волн (сек)";
   private static final float f_20365 = 1.8F;
   private static final float f_20366 = 0.6F;
   private static final float f_20367 = 4.0F;
   private static final float f_20368 = 0.1F;
   private static final String f_20369 = "Только во время дождя";
   private static final String f_20370 = "dimasik/rain_effect";
   private static final String f_20371 = "rain_effect";
   private static final String f_20372 = "rain_effect";
   private static final String f_20373 = "RainEffectData";
   private static final String f_20374 = "SceneSampler";
   private static final String f_20375 = "MainDepthSampler";
   private static final String f_20376 = "ReflectionSampler0";
   private static final String f_20377 = "ReflectionSampler1";
   private static final String f_20378 = "ReflectionSampler2";
   private static final float f_20379 = 0.01F;
   private static final String f_20380 = "capture setup";
   private static final float f_20381 = -1.0F;
   private static final float f_20382 = -1.0F;
   private static final float f_20383 = 0.002F;
   private static final float f_20384 = 0.002F;
   private static final String f_20385 = "reflection capture";
   private static final long f_20386 = 240000L;
   private static final float f_20387 = 20.0F;
   private static final String f_20388 = "SceneSampler";
   private static final String f_20389 = "MainDepthSampler";
   private static final String f_20390 = "RainEffectData";
   private static final String f_20391 = "reflection composite";
   private static final long f_20392 = 1408L;
   private static final double f_20393 = 16.0;
   private static final float f_20394 = 0.08F;
   private static final double f_20395 = 0.008;
   private static final double f_20396 = 0.54;
   private static final double f_20397 = 0.44;
   private static final double f_20398 = 0.5;
   private static final double f_20399 = 0.22;
   private static final double f_20400 = -1.0;
   private static final double f_20401 = 0.145;
   private static final double f_20402 = 0.045;
   private static final double f_20403 = 0.025;
   private static final double f_20404 = 0.045;
   private static final float f_20405 = 1.22F;
   private static final float f_20406 = 0.86F;
   private static final float f_20407 = 0.28F;
   private static final float f_20408 = 1000.0F;
   private static final float f_20409 = 0.88F;
   private static final float f_20410 = 0.24F;
   private static final double f_20411 = 0.003;
   private static final float f_20412 = 4.0F;
   private static final float f_20413 = 4.0F;
   private static final double f_20414 = Math.PI;
   private static final double f_20415 = 2.0;
   private static final double f_20416 = 0.025;
   private static final double f_20417 = 0.055;
   private static final float f_20418 = 1.8F;
   private static final double f_20419 = 0.012;
   private static final double f_20420 = 0.018;
   private static final float f_20421 = 1.5F;
   private static final double f_20422 = 0.055;
   private static final double f_20423 = 0.105;
   private static final float f_20424 = 0.75F;
   private static final float f_20425 = 0.35F;
   private static final float f_20426 = 1.45F;
   private static final double f_20427 = 0.025;
   private static final double f_20428 = 0.11;
   private static final double f_20429 = 0.025;
   private static final float f_20430 = 0.08F;
   private static final float f_20431 = 0.01F;
   private static final float f_20432 = 1.8F;
   private static final float f_20433 = 1.25F;
   private static final double f_20434 = Math.PI;
   private static final double f_20435 = 2.0;
   private static final double f_20436 = 2.0;
   private static final double f_20437 = 11.0;
   private static final double f_20438 = 14.0;
   private static final double f_20439 = 0.025;
   private static final double f_20440 = 0.08;
   private static final double f_20441 = Math.PI;
   private static final double f_20442 = 2.0;
   private static final double f_20443 = 0.006;
   private static final double f_20444 = 0.022;
   private static final float f_20445 = 2.4F;
   private static final double f_20446 = 0.055;
   private static final double f_20447 = 0.075;
   private static final double f_20448 = 0.25;
   private static final double f_20449 = 0.015;
   private static final double f_20450 = 0.015;
   private static final double f_20451 = 0.015;
   private static final double f_20452 = 0.015;
   private static final double f_20453 = 0.28;
   private static final double f_20454 = 0.72;
   private static final double f_20455 = 9216.0;
   private static final int f_20456 = 73244475;
   private static final int f_20457 = 73244475;
   private static final int f_20458 = 16777215;
   private static final float f_20459 = 1.6777215E7F;
   private static final double f_20460 = 2304.0;
   private static final long f_20461 = 2304L;
   private static final float f_20462 = 16.0F;
   private static final int f_20463 = Integer.MIN_VALUE;
   private static final int f_20464 = Integer.MIN_VALUE;
   private static final float f_20465 = 16.0F;
   private static final float f_20466 = 16.0F;
   private static final double f_20467 = 0.999;
   private static final double f_20468 = 0.001;
   private static final double f_20469 = 16.0;
   private static final double f_20470 = 16.0;
   private static final double f_20471 = 0.45;
   private static final float f_20472 = 0.55F;
   private static final float f_20473 = 0.55F;
   private static final String f_20474 = "Rain scene backup";
   private static final float f_20475 = 1.0E-6F;
   private static final float f_20476 = -1.0F;
   private static final float f_20477 = -1.0F;
   private static final float f_20478 = -1.0F;
   private static final float f_20479 = 1.0E-6F;
   private static final float f_20480 = 0.68F;
   private static final float f_20481 = 0.68F;
   private static final String f_20482 = "resource release";
   private static final double f_20483 = 16.0;
   private static final String f_20484 = "Rain effect uniforms";
   private static final String f_20485 = "Rain effect composite";

   private static double m_6642(Entry<Integer, Integer> var0, double var1) {
      double var3 = Math.abs(((Integer)var0.getKey()).intValue() / f_20470 - var1);
      return ((Integer)var0.getValue()).intValue() * (1.0 + f_20471 / (1.0 + var3));
   }

   public static Matrix4f m_6643() {
      return f_20326;
   }

   private static Throwable m_6644(Throwable var0, Throwable var1) {
      if (var0 == null) {
         return var1;
      }

      if (m_6672(var1) && !m_6672(var0)) {
         var1.addSuppressed(var0);
         return var1;
      }

      if (var0 != var1) {
         var0.addSuppressed(var1);
      }

      return var0;
   }

   private static void m_6645(RenderTarget var0, RenderTarget var1) {
      if (var0.getDepthTexture() != null && var1.getDepthTexture() != null) {
         var1.copyDepthFrom(var0);
      }
   }

   private static Entry<Integer, Integer> m_6646(List<Entry<Integer, Integer>> var0, int var1) {
      for (Entry var3 : var0) {
         if ((Integer)var3.getKey() == var1) {
            return var3;
         }
      }

      return null;
   }

   private static void m_6647(TextureTarget var0) {
      RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(var0.getColorTexture(), new Vector4f(0.0F), var0.getDepthTexture(), 0.0);
   }

   public static Matrix4f m_6648() {
      return f_20325;
   }

   private void m_6649(Vec3 var1, float var2) {
      float var3 = this.f_20300.m_8768();
      if (!(var2 <= f_20430) && !(var3 <= f_20431)) {
         this.f_20337++;
         int var4 = var3 >= f_20432 ? 1 : 2;
         if (this.f_20337 % var4 == 0) {
            int var5 = Math.clamp(1 + Mth.floor(var3 * var2 * f_20433), 1, 5);

            for (int var6 = 0; var6 < var5; var6++) {
               int var7 = ++this.f_20336;
               float var8 = m_6667(var7 * 89 + 7);
               float var9 = m_6667(var7 * 131 + 19);
               double var10 = var8 * f_20434 * f_20435;
               double var12 = f_20436 + Math.sqrt(var9) * f_20437;
               double var14 = var1.x + Math.cos(var10) * var12;
               double var16 = var1.z + Math.sin(var10) * var12;
               int var18 = f_11537.level.getHeight(Types.WORLD_SURFACE, Mth.floor(var14), Mth.floor(var16));
               Rain.zN5C9uJ0aNKQQyhW var19 = this.m_6669(var14, var16, var18);
               if (var19 != null && !(Math.abs(var19.y() - var1.y) > f_20438)) {
                  double var20 = var19.y() + f_20439;
                  if (f_11537.level.canSeeSky(BlockPos.containing(var14, var20 + f_20440, var16))) {
                     float var22 = m_6667(var7 * 173 + 31);
                     float var23 = m_6667(var7 * 211 + 43);
                     double var24 = var22 * f_20441 * f_20442;
                     double var26 = (f_20443 + var23 * f_20444) * Math.min(var3, f_20445);
                     double var28 = Math.cos(var24) * var26;
                     double var30 = Math.sin(var24) * var26;
                     double var32 = f_20446 + m_6667(var7 * 251 + 59) * f_20447 * Math.min(var3, 2.0F);
                     Particle var34 = f_11537.particleEngine.createParticle(ParticleTypes.SPLASH, var14, var20, var16, var28, 0.0, var30);
                     if (var34 != null) {
                        var34.setParticleSpeed(var28, var32, var30);
                     }
                  }
               }
            }
         }
      } else {
         this.f_20337 = 0;
      }
   }

   public boolean m_6650() {
      return this.m_776()
         && !f_20323
         && f_11537.level != null
         && f_11537.player != null
         && f_11537.gameRenderer != null
         && (!this.f_20304.m_8768() || this.m_6659() > f_20379 || this.m_6682());
   }

   public void m_6651(Camera var1, Matrix4f var2, Matrix4f var3) {
      if (this.m_6650() && this.f_20320 && var1 != null && var2 != null && var3 != null) {
         RenderTarget var4 = f_11537.gameRenderer.mainRenderTarget();
         if (var4 != null
            && var4.getColorTexture() != null
            && var4.getDepthTexture() != null
            && var4.getColorTextureView() != null
            && var4.getDepthTextureView() != null) {
            Throwable var5 = null;

            try {
               this.m_6665(var4.width, var4.height);
               if (!this.f_20320) {
                  return;
               }

               m_6676(var4, this.f_20312);
               Matrix4f var6 = this.f_20309.set(var3).invert();
               Vec3 var7 = var1.position();
               Matrix4f var8 = this.f_20310.set(var2).translate((float)(-var7.x), (float)(-var7.y), (float)(-var7.z)).invert();
               MemoryStack var9 = MemoryStack.stackPush();

               try {
                  Std140Builder var10 = Std140Builder.onStack(var9, 1408).putMat4f(var6).putMat4f(var8);

                  for (Matrix4f var14 : this.f_20308) {
                     var10.putMat4f(var14);
                  }

                  float var22 = ((float)(f_11537.level.getGameTime() % f_20386) + f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(false)) / f_20387;
                  var10.putVec4(this.f_20311[0], this.f_20311[1], this.f_20311[2], this.f_20317)
                     .putVec4(this.f_20296.m_8768(), this.f_20298.m_8768(), this.f_20299.m_8768(), this.m_6659())
                     .putVec4(this.f_20297.m_8768(), var22, this.f_20300.m_8768(), 0.0F);
                  this.m_6668(var10, var7);
                  ByteBuffer var23 = var10.get();
                  CommandEncoder var24 = RenderSystem.getDevice().createCommandEncoder();
                  this.f_20313 = this.m_6680();
                  var24.writeToBuffer(this.f_20313.slice(), var23);
                  RenderPass var25 = var24.createRenderPass(() -> f_20485, var4.getColorTextureView(), Optional.empty());

                  try {
                     var25.setPipeline(this.f_20305);
                     var25.bindTexture(f_20388, this.f_20312.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
                     var25.bindTexture(f_20389, var4.getDepthTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));

                     for (int var15 = 0; var15 < 3; var15++) {
                        var25.bindTexture(
                           var15 + "", this.f_20306[var15].getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR)
                        );
                     }

                     var25.setUniform(f_20390, this.f_20313);
                     var25.draw(3, 1, 0, 0);
                  } catch (Throwable var19) {
                     if (var25 != null) {
                        try {
                           var25.close();
                        } catch (Throwable var18) {
                           var19.addSuppressed(var18);
                        }
                     }

                     throw var19;
                  }

                  if (var25 != null) {
                     var25.close();
                  }
               } catch (Throwable var20) {
                  if (var9 != null) {
                     try {
                        var9.close();
                     } catch (Throwable var17) {
                        var20.addSuppressed(var17);
                     }
                  }

                  throw var20;
               }

               if (var9 != null) {
                  var9.close();
               }
            } catch (Throwable var21) {
               var5 = m_6644(var5, var21);
            }

            m_6661(f_20391, var5);
         }
      }
   }

   public static RenderTarget m_6653() {
      return f_20324;
   }

   private static Throwable m_6654(Throwable var0, Runnable var1) {
      try {
         var1.run();
         return var0;
      } catch (Throwable var3) {
         return m_6644(var0, var3);
      }
   }

   private void m_6655() {
      this.f_20314 = null;
      this.f_20315 = 0;
      this.f_20316 = 0;
      this.f_20317 = 0;
      this.f_20318 = false;
      this.f_20319 = false;
      this.f_20320 = false;

      for (int var1 = 0; var1 < 3; var1++) {
         this.f_20311[var1] = Float.NaN;
         this.f_20308[var1].identity();
      }
   }

   private void m_6658() {
      f_20323 = false;
      f_20324 = null;
      f_20325 = null;
      f_20326 = null;
      this.f_20322 = false;
      TextureTarget var1 = this.f_20312;
      this.f_20312 = null;
      GpuBuffer var2 = this.f_20313;
      this.f_20313 = null;
      TextureTarget[] var3 = (TextureTarget[])this.f_20306.clone();
      ProjectionMatrixBuffer[] var4 = (ProjectionMatrixBuffer[])this.f_20307.clone();

      for (int var5 = 0; var5 < 3; var5++) {
         this.f_20306[var5] = null;
      }

      for (int var15 = 0; var15 < 3; var15++) {
         this.f_20307[var15] = null;
      }

      this.f_20314 = null;
      this.f_20321 = null;
      this.f_20317 = 0;
      this.f_20318 = false;
      this.f_20319 = false;
      this.f_20320 = false;
      Throwable var16 = null;
      if (var2 != null && !var2.isClosed()) {
         try {
            var2.close();
         } catch (Throwable var14) {
            var16 = m_6644(var16, var14);
         }
      }

      if (var1 != null) {
         try {
            var1.destroyBuffers();
         } catch (Throwable var13) {
            var16 = m_6644(var16, var13);
         }
      }

      for (TextureTarget var9 : var3) {
         if (var9 != null) {
            try {
               var9.destroyBuffers();
            } catch (Throwable var12) {
               var16 = m_6644(var16, var12);
            }
         }
      }

      for (ProjectionMatrixBuffer var20 : var4) {
         if (var20 != null) {
            try {
               var20.close();
            } catch (Throwable var11) {
               var16 = m_6644(var16, var11);
            }
         }
      }

      m_6661(f_20482, var16);
   }

   private float m_6659() {
      if (!this.f_20304.m_8768()) {
         return 1.0F;
      }

      float var1 = f_11537.level == null ? 0.0F : f_11537.level.getRainLevel(f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(false));
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
         Ambience var2 = DimasikClient.m_9057().m_9049().m_2801().m_3511();
         if (var2 != null) {
            if (var2.m_3025()) {
               return 1.0F;
            }

            if (var2.m_3012()) {
               return 0.0F;
            }
         }
      }

      return Math.clamp(var1, 0.0F, 1.0F);
   }

   private void m_6660(Camera var1) {
      Vec3 var2 = var1.position();
      boolean var3 = this.f_20314 != null && this.f_20314 != f_11537.level;
      boolean var4 = this.f_20321 != null && this.f_20321.distanceToSqr(var2) > f_20460;
      this.f_20321 = var2;
      if (var3 || var4) {
         this.m_6655();
      }

      boolean var5 = this.f_20314 == f_11537.level;
      long var6 = (long)Math.floor(var2.x) - this.f_20315;
      long var8 = (long)Math.floor(var2.z) - this.f_20316;
      boolean var10 = var6 * var6 + var8 * var8 > f_20461;
      if (!var5 || !this.f_20318 || var10) {
         int[] var11 = new int[3];

         for (int var12 = 0; var12 < 3; var12++) {
            var11[var12] = var5 && Float.isFinite(this.f_20311[var12]) ? Math.round(this.f_20311[var12] * f_20462) : f_20463;
         }

         this.f_20314 = f_11537.level;
         this.f_20315 = (int)Math.floor(var2.x);
         this.f_20316 = (int)Math.floor(var2.z);
         this.f_20319 = false;
         this.f_20320 = false;
         Map var21 = this.m_6675();
         if (var21.isEmpty()) {
            this.f_20317 = 0;
            this.f_20318 = false;
         } else {
            this.f_20318 = true;
            ArrayList<Entry<Integer, Integer>> var13 = new ArrayList(var21.entrySet());
            ArrayList<Entry<Integer, Integer>> var14 = new ArrayList<>(3);

            for (int var15 = 0; var15 < 3; var15++) {
               var14.add(null);
            }

            HashSet var22 = new HashSet();
            double var16 = f_11537.player == null ? var2.y : f_11537.player.getY();

            for (int var18 = 0; var18 < 3; var18++) {
               int var19 = var11[var18];
               if (var19 != f_20464) {
                  Entry var20 = m_6646(var13, var19);
                  if (var20 != null && var22.add(var19)) {
                     var14.set(var18, var20);
                  }
               }
            }

            if (var14.get(0) == null) {
               Entry var23 = var13.stream()
                  .filter(var1x -> !var22.contains(var1x.getKey()))
                  .min(Comparator.comparingDouble(var2x -> Math.abs(((Integer)var2x.getKey()).intValue() / f_20483 - var16)))
                  .orElse(null);
               if (var23 != null) {
                  var14.set(0, var23);
                  var22.add((Integer)var23.getKey());
               }
            }

            for (int var24 = 0; var24 < 3; var24++) {
               if (var14.get(var24) == null) {
                  Entry var26 = var13.stream()
                     .filter(var1x -> !var22.contains(var1x.getKey()))
                     .max(Comparator.comparingDouble(var2x -> m_6642((Entry<Integer, Integer>)var2x, var16)))
                     .orElse(null);
                  if (var26 == null) {
                     break;
                  }

                  var14.set(var24, var26);
                  var22.add((Integer)var26.getKey());
               }
            }

            List var25 = var14.stream().filter(var0 -> var0 != null).toList();
            this.f_20317 = Math.min(3, var25.size());
            float var27 = ((Integer)((Entry)var25.getFirst()).getKey()).intValue() / f_20465;

            for (int var28 = 0; var28 < 3; var28++) {
               this.f_20311[var28] = var28 < this.f_20317 ? ((Integer)((Entry)var25.get(var28)).getKey()).intValue() / f_20466 : var27;
            }

            this.f_20319 = this.f_20317 > 0;
         }
      }
   }

   private static void m_6661(String var0, Throwable var1) {
      if (var1 != null) {
         if (var1 instanceof VirtualMachineError var3) {
            throw var3;
         } else if (var1 instanceof LinkageError var2) {
            throw var2;
         } else {
            System.err.println(var0 + var1.getMessage());
            var1.printStackTrace();
         }
      }
   }

   private void m_6664(double var1, double var3, double var5, double var7, double var9, float var11, float var12, boolean var13) {
      if (f_11537.particleEngine != null) {
         int var14 = Math.clamp(Math.round(f_20412 + var12 * f_20413 + (var13 ? 2.0F : 0.0F)), 4, 14);

         for (int var15 = 0; var15 < var14; var15++) {
            float var16 = m_6667(this.f_20335 * 193 + var15 * 47 + 3);
            float var17 = m_6667(this.f_20335 * 157 + var15 * 29 + 11);
            float var18 = m_6667(this.f_20335 * 101 + var15 * 61 + 23);
            double var19 = var16 * f_20414 * f_20415;
            double var21 = Math.cos(var19);
            double var23 = Math.sin(var19);
            double var25 = (f_20416 + var17 * f_20417) * Math.min(var12, f_20418);
            double var27 = (f_20419 + var11 * f_20420) * Math.min(var12, f_20421);
            double var29 = var21 * var25 + var7 * var27;
            double var31 = var23 * var25 + var9 * var27;
            double var33 = (f_20422 + var18 * f_20423) * Math.min(f_20424 + var12 * f_20425, f_20426);
            double var35 = f_20427 + m_6667(this.f_20335 * 83 + var15 * 37 + 41) * f_20428;
            Particle var37 = f_11537.particleEngine
               .createParticle(ParticleTypes.SPLASH, var1 + var21 * var35, var3 + f_20429, var5 + var23 * var35, var29, 0.0, var31);
            if (var37 != null) {
               var37.setParticleSpeed(var29, var33, var31);
            }
         }
      }
   }

   public Rain() {
      super(f_20338, f_20339, Category.RENDER);
      this.f_20296 = new SliderSetting(f_20340, f_20341, f_20342, 1.0F).m_828(f_20343);
      this.f_20297 = new SliderSetting(f_20344, f_20345, 0.0F, f_20346).m_828(f_20347);
      this.f_20298 = new SliderSetting(f_20348, f_20349, f_20350, 1.0F).m_828(f_20351);
      this.f_20299 = new SliderSetting(f_20352, f_20353, 0.0F, f_20354).m_828(f_20355);
      this.f_20300 = new SliderSetting(f_20356, f_20357, 0.0F, f_20358).m_828(f_20359);
      this.f_20301 = new CheckboxSetting(f_20360, true);
      this.f_20302 = new SliderSetting(f_20361, 1.0F, f_20362, 2.0F).m_828(f_20363).m_822(this.f_20301::m_8768);
      this.f_20303 = new SliderSetting(f_20364, f_20365, f_20366, f_20367).m_828(f_20368).m_822(this.f_20301::m_8768);
      this.f_20304 = new CheckboxSetting(f_20369, false);
      this.f_20305 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_20370)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_20371))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_20372))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_20373, UniformType.UNIFORM_BUFFER)
         .m_2741(f_20374)
         .m_2741(f_20375)
         .m_2741(f_20376)
         .m_2741(f_20377)
         .m_2741(f_20378)
         .m_2722();
      this.f_20306 = new TextureTarget[3];
      this.f_20307 = new ProjectionMatrixBuffer[3];
      this.f_20308 = new Matrix4f[3];
      this.f_20309 = new Matrix4f();
      this.f_20310 = new Matrix4f();
      this.f_20311 = new float[3];
      this.f_20327 = new ArrayList<>(32);
      this.f_20328 = new ArrayList<>(32);
      this.f_20329 = new float[32];
      this.f_20330 = this::m_6683;
      this.f_20334 = true;
      this.m_795(this.f_20296, this.f_20297, this.f_20298, this.f_20299, this.f_20300, this.f_20301, this.f_20302, this.f_20303, this.f_20304);

      for (int var1 = 0; var1 < 3; var1++) {
         this.f_20308[var1] = new Matrix4f();
         this.f_20311[var1] = Float.NaN;
      }
   }

   @Override
   public void m_732() {
      this.m_6681();
      this.m_6674();
   }

   private void m_6665(int var1, int var2) {
      int var3 = Math.max(1, var1);
      int var4 = Math.max(1, var2);
      int var5 = Math.max(1, Math.round(var3 * f_20472));
      int var6 = Math.max(1, Math.round(var4 * f_20473));
      boolean var7 = false;
      if (this.f_20312 == null) {
         this.f_20312 = new TextureTarget(f_20474, var3, var4, true, GpuFormat.RGBA8_UNORM);
      } else if (this.f_20312.width != var3 || this.f_20312.height != var4) {
         this.f_20312.resize(var3, var4);
      }

      for (int var8 = 0; var8 < 3; var8++) {
         if (this.f_20307[var8] == null) {
            this.f_20307[var8] = new ProjectionMatrixBuffer(var8 + "");
         }

         if (this.f_20306[var8] == null) {
            this.f_20306[var8] = new TextureTarget(var8 + "", var5, var6, true, GpuFormat.RGBA8_UNORM);
            var7 = true;
         } else if (this.f_20306[var8].width != var5 || this.f_20306[var8].height != var6) {
            this.f_20306[var8].resize(var5, var6);
            var7 = true;
         }
      }

      if (var7) {
         this.f_20320 = false;
      }
   }

   private void m_6666(Vec3 var1, double var2, double var4, boolean var6) {
      float var7 = m_6667(++this.f_20335);
      float var8 = m_6667(this.f_20335 * 31 + 17);
      double var9 = (var7 - f_20398) * f_20399;
      double var11 = Math.cos(var9);
      double var13 = Math.sin(var9);
      double var15 = var2 * var11 - var4 * var13;
      double var17 = var2 * var13 + var4 * var11;
      double var19 = var17;
      double var21 = -var15;
      double var23 = this.f_20334 ? f_20400 : 1.0;
      double var25 = var23 * (f_20401 + var8 * f_20402);
      double var27 = f_20403 + var7 * f_20404;
      double var29 = var1.x + var19 * var25 + var15 * var27;
      double var31 = var1.z + var21 * var25 + var17 * var27;
      Rain.zN5C9uJ0aNKQQyhW var33 = this.m_6669(var29, var31, var1.y);
      this.f_20334 = !this.f_20334;
      if (var33 != null) {
         float var34 = this.f_20302.m_8768() * (var6 ? f_20405 : 1.0F) * (f_20406 + var8 * f_20407);
         long var35 = (long)(this.f_20303.m_8768() * f_20408 * (f_20409 + var7 * f_20410));
         long var37 = System.currentTimeMillis();
         double var39 = var33.y() + f_20411;
         if (this.f_20327.size() >= 32) {
            this.f_20327.removeFirst();
         }

         this.f_20327.add(new Rain.Class_73l7foKBzFGGFnra(var29, var39, var31, (float)var15, (float)var17, var7, var34, var37, var37 + var35));
         this.m_6664(var29, var39, var31, var15, var17, var7, var34, var6);
      }
   }

   private static float m_6667(int var0) {
      int var1 = var0 * f_20456;
      var1 = (var1 ^ var1 >>> 16) * f_20457;
      var1 ^= var1 >>> 16;
      return (var1 & f_20458) / f_20459;
   }

   private void m_6668(Std140Builder var1, Vec3 var2) {
      long var3 = System.currentTimeMillis();
      this.f_20328.clear();

      for (Rain.Class_73l7foKBzFGGFnra var6 : this.f_20327) {
         double var7 = var6.f_20262 - var2.x;
         double var9 = var6.f_20264 - var2.z;
         if (var7 * var7 + var9 * var9 <= f_20455 && var6.f_20270 > var3) {
            this.f_20328.add(var6);
         }
      }

      int var11 = Math.min(32, this.f_20328.size());

      for (int var12 = 0; var12 < var11; var12++) {
         this.f_20329[var12] = this.f_20328.get(var12).m_6628(var3);
      }

      for (int var13 = 0; var13 < 32; var13++) {
         if (var13 < var11) {
            Rain.Class_73l7foKBzFGGFnra var15 = this.f_20328.get(var13);
            var1.putVec4((float)(var15.f_20262 - var2.x), (float)(var15.f_20264 - var2.z), (float)(var15.f_20263 - var2.y), this.f_20329[var13]);
         } else {
            var1.putVec4(0.0F, 0.0F, 0.0F, 0.0F);
         }
      }

      for (int var14 = 0; var14 < 32; var14++) {
         if (var14 < var11) {
            Rain.Class_73l7foKBzFGGFnra var16 = this.f_20328.get(var14);
            var1.putVec4(var16.f_20265, var16.f_20266, var16.f_20267, var16.f_20268);
         } else {
            var1.putVec4(0.0F, 0.0F, 0.0F, 0.0F);
         }
      }

      var1.putVec4(var11, 1.0F, 0.0F, 0.0F);
   }

   private Rain.zN5C9uJ0aNKQQyhW m_6669(double var1, double var3, double var5) {
      int var7 = Mth.floor(var1);
      int var8 = Mth.floor(var3);
      int var9 = Mth.floor(var5 + f_20448);
      double var10 = var1 - var7;
      double var12 = var3 - var8;
      double var14 = Double.NEGATIVE_INFINITY;
      MutableBlockPos var16 = new MutableBlockPos();

      for (int var17 = var9; var17 >= var9 - 3; var17--) {
         var16.set(var7, var17, var8);
         BlockState var18 = f_11537.level.getBlockState(var16);
         if (!var18.isAir()) {
            VoxelShape var19 = var18.getCollisionShape(f_11537.level, var16);
            if (!var19.isEmpty()) {
               for (AABB var21 : var19.toAabbs()) {
                  if (!(var10 < var21.minX - f_20449) && !(var10 > var21.maxX + f_20450) && !(var12 < var21.minZ - f_20451) && !(var12 > var21.maxZ + f_20452)) {
                     double var22 = var17 + var21.maxY;
                     if (var22 <= var5 + f_20453 && var5 - var22 <= f_20454) {
                        var14 = Math.max(var14, var22);
                     }
                  }
               }
            }
         }
      }

      return Double.isFinite(var14) ? new Rain.zN5C9uJ0aNKQQyhW(var14) : null;
   }

   private static Matrix4f m_6670(Matrix4f var0) {
      return new Matrix4f(var0).scale(f_20480, f_20481, 1.0F);
   }

   public void m_6671(
      LevelRenderer var1,
      GraphicsResourceAllocator var2,
      DeltaTracker var3,
      Camera var4,
      Matrix4f var5,
      Matrix4f var6,
      Matrix4f var7,
      GpuBufferSlice var8,
      Vector4f var9,
      boolean var10
   ) {
      if (this.m_6650() && var1 != null && var2 != null && var3 != null && var4 != null && var5 != null && var6 != null && var7 != null) {
         RenderTarget var11;
         Rain.ZOKMnbmDQburyPB0 var12;
         try {
            this.m_6660(var4);
            if (!this.f_20319 || this.f_20317 == 0) {
               return;
            }

            var11 = f_11537.gameRenderer.mainRenderTarget();
            if (var11 == null || var11.getColorTexture() == null || var11.getDepthTexture() == null) {
               return;
            }

            this.m_6665(var11.width, var11.height);
            var12 = Rain.ZOKMnbmDQburyPB0.m_6636();
         } catch (Throwable var68) {
            m_6661(f_20380, var68);
            return;
         }

         Vec3 var13 = var4.position();
         boolean var14 = false;
         boolean var15 = false;
         boolean var16 = false;
         Throwable var17 = null;
         f_20325 = new Matrix4f(var5);
         f_20326 = m_6670(var7);
         f_20323 = true;

         try {
            try {
               m_6676(var11, this.f_20312);
               var14 = true;
            } catch (Throwable var64) {
               var17 = m_6644(var17, var64);
            }

            try {
               m_6645(var11, this.f_20312);
               var15 = true;
            } catch (Throwable var63) {
               var17 = m_6644(var17, var63);
            }

            if (var17 == null) {
               for (int var18 = 0; var18 < this.f_20317; var18++) {
                  float var19 = this.f_20311[var18];
                  TextureTarget var20 = this.f_20306[var18];
                  Matrix4f var21 = m_6670(var6);
                  Matrix4f var22 = m_6670(var7);
                  Matrix4f var23 = new Matrix4f(var5).translate((float)(-var13.x), (float)(-var13.y), (float)(-var13.z));
                  Matrix4f var24 = new Matrix4f().translation(0.0F, var19 * 2.0F, 0.0F).scale(1.0F, f_20381, 1.0F);
                  Matrix4f var25 = new Matrix4f().scaling(f_20382, 1.0F, 1.0F).mul(var23).mul(var24);
                  Matrix4f var26 = new Matrix4f(var25).translate((float)var13.x, (float)var13.y, (float)var13.z);
                  Matrix4f var27 = m_6678(var21, var25, var19 + f_20383);
                  Matrix4f var28 = m_6678(var22, var25, var19 + f_20384);
                  this.f_20308[var18].set(new Matrix4f(var27).mul(var25));

                  Rain.ZOKMnbmDQburyPB0 var29;
                  try {
                     var29 = Rain.ZOKMnbmDQburyPB0.m_6636();
                  } catch (Throwable var65) {
                     var17 = m_6644(var17, var65);
                     break;
                  }

                  Throwable var30 = null;

                  try {
                     m_6647(var20);
                     f_20324 = var20;
                     RenderSystem.outputColorTextureOverride = var20.getColorTextureView();
                     RenderSystem.outputDepthTextureOverride = var20.getDepthTextureView();
                     RenderSystem.setProjectionMatrix(this.f_20307[var18].getBuffer(var27), RenderSystem.getProjectionType());
                     f_11537.levelExtractor.extract(var3, var4, var3.getGameTimeDeltaPartialTick(false));
                     CameraRenderState var31 = f_11537.gameRenderer.gameRenderState().levelRenderState.cameraRenderState;
                     var31.viewRotationMatrix.set(var26);
                     var31.projectionMatrix.set(var27);
                     var1.render(var2, var3, false, var31, var26, var8, var9 == null ? new Vector4f() : new Vector4f(var9), var10);
                  } catch (Throwable var61) {
                     var30 = m_6644(var30, var61);
                  } finally {
                     var30 = var29.m_6634(var30);
                  }

                  if (var30 != null) {
                     var17 = m_6644(var17, var30);
                     break;
                  }
               }

               var16 = var17 == null;
            }
         } catch (Throwable var66) {
            var17 = m_6644(var17, var66);
         } finally {
            var17 = var12.m_6634(var17);
            if (var14) {
               try {
                  m_6676(this.f_20312, var11);
               } catch (Throwable var60) {
                  var17 = m_6644(var17, var60);
               }
            }

            if (var15) {
               try {
                  m_6645(this.f_20312, var11);
               } catch (Throwable var59) {
                  var17 = m_6644(var17, var59);
               }
            }

            f_20323 = false;
            f_20325 = null;
            f_20326 = null;
            var17 = m_6654(var17, () -> f_11537.levelExtractor.extract(var3, var4, var3.getGameTimeDeltaPartialTick(false)));
         }

         if (this.f_20322) {
            this.m_6658();
            var16 = false;
         }

         this.f_20320 = this.m_776() && var16 && var17 == null;
         m_6661(f_20385, var17);
      }
   }

   private static boolean m_6672(Throwable var0) {
      return var0 instanceof VirtualMachineError || var0 instanceof LinkageError;
   }

   @Override
   public void m_778() {
      this.m_6655();
      this.f_20321 = null;
      this.f_20322 = false;
      this.m_6681();
      this.f_20331 = f_11537.level;
   }

   public void m_6674() {
      this.f_20320 = false;
      if (f_20323) {
         this.f_20322 = true;
      } else {
         this.m_6658();
      }
   }

   private Map<Integer, Integer> m_6675() {
      HashMap<Integer, Integer> var1 = new HashMap<>();
      MutableBlockPos var2 = new MutableBlockPos();
      MutableBlockPos var3 = new MutableBlockPos();

      for (int var4 = -42; var4 <= 42; var4 += 6) {
         for (int var5 = -42; var5 <= 42; var5 += 6) {
            int var6 = this.f_20315 + var5;
            int var7 = this.f_20316 + var4;
            int var8 = f_11537.level.getHeight(Types.WORLD_SURFACE, var6, var7);

            for (int var9 = f_11537.level.getMinY(); var9 < var8; var9++) {
               var2.set(var6, var9, var7);
               BlockState var10 = f_11537.level.getBlockState(var2);
               if (!var10.isAir()) {
                  VoxelShape var11 = var10.getCollisionShape(f_11537.level, var2);
                  if (var11.isEmpty()) {
                     var11 = var10.getShape(f_11537.level, var2);
                  }

                  if (!var11.isEmpty()) {
                     double var12 = var11.max(Axis.Y);
                     var3.set(var6, var9 + 1, var7);
                     BlockState var14 = f_11537.level.getBlockState(var3);
                     VoxelShape var15 = var14.getCollisionShape(f_11537.level, var3);
                     if (var15.isEmpty()) {
                        var15 = var14.getShape(f_11537.level, var3);
                     }

                     boolean var16 = var12 < f_20467 || var15.isEmpty() || var15.min(Axis.Y) > f_20468;
                     if (var16) {
                        int var17 = (int)Math.round((var9 + var12) * f_20469);
                        var1.merge(var17, 1, Integer::sum);
                     }
                  }
               }
            }
         }
      }

      return var1;
   }

   private static void m_6676(RenderTarget var0, RenderTarget var1) {
      int var2 = Math.min(var0.width, var1.width);
      int var3 = Math.min(var0.height, var1.height);
      RenderSystem.getDevice().createCommandEncoder().copyTextureToTexture(var0.getColorTexture(), var1.getColorTexture(), 0, 0, 0, 0, 0, var2, var3);
   }

   private static Matrix4f m_6678(Matrix4f var0, Matrix4f var1, float var2) {
      Vector4f var3 = new Vector4f(0.0F, 1.0F, 0.0F, -var2);
      new Matrix4f(var1).invert().transpose().transform(var3);
      float var4 = (float)Math.sqrt(var3.x * var3.x + var3.y * var3.y + var3.z * var3.z);
      if (var4 <= f_20475) {
         return new Matrix4f(var0);
      }

      var3.div(var4);
      boolean var5 = RenderSystem.getDevice().getDeviceInfo().isZZeroToOne();
      Vector4f var6 = new Vector4f(var3.x >= 0.0F ? 1.0F : f_20476, var3.y >= 0.0F ? 1.0F : f_20477, var5 ? 0.0F : f_20478, 1.0F);
      new Matrix4f(var0).invert().transform(var6);
      float var7 = var3.dot(var6);
      if (Math.abs(var7) <= f_20479) {
         return new Matrix4f(var0);
      }

      Vector4f var8 = new Vector4f(var3).mul((var5 ? 1.0F : 2.0F) / var7);
      Matrix4f var9 = new Matrix4f(var0);
      var9.m02(var9.m03() - var8.x);
      var9.m12(var9.m13() - var8.y);
      var9.m22(var9.m23() - var8.z);
      var9.m32(var9.m33() - var8.w);
      return var9;
   }

   public static boolean m_6679() {
      return f_20323;
   }

   private GpuBuffer m_6680() {
      if (this.f_20313 == null || this.f_20313.isClosed()) {
         this.f_20313 = RenderSystem.getDevice().createBuffer(() -> f_20484, 136, f_20392);
      }

      return this.f_20313;
   }

   private void m_6681() {
      this.f_20327.clear();
      this.f_20328.clear();
      this.f_20331 = null;
      this.f_20332 = null;
      this.f_20333 = 0.0;
      this.f_20334 = true;
      this.f_20337 = 0;
   }

   private boolean m_6682() {
      if (!this.f_20301.m_8768()) {
         return false;
      }

      long var1 = System.currentTimeMillis();

      for (Rain.Class_73l7foKBzFGGFnra var4 : this.f_20327) {
         if (var4.f_20270 > var1) {
            return true;
         }
      }

      return false;
   }

   private void m_6683(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (this.f_20331 != f_11537.level) {
            this.m_6681();
            this.f_20331 = f_11537.level;
         }

         long var2 = System.currentTimeMillis();
         this.f_20327.removeIf(var2x -> var2x.f_20270 <= var2);
         Vec3 var4 = f_11537.player.position();
         float var5 = this.m_6659();
         this.m_6649(var4, var5);
         if (!this.f_20301.m_8768()) {
            this.f_20327.clear();
            this.f_20332 = var4;
            this.f_20333 = 0.0;
         } else if (this.f_20332 == null) {
            this.f_20332 = var4;
         } else {
            double var6 = var4.x - this.f_20332.x;
            double var8 = var4.z - this.f_20332.z;
            double var10 = var6 * var6 + var8 * var8;
            this.f_20332 = var4;
            if (var10 > f_20393) {
               this.f_20333 = 0.0;
            } else if (f_11537.player.onGround() && !f_11537.player.isPassenger() && !f_11537.player.isSwimming() && !(var5 <= f_20394)) {
               double var12 = Math.sqrt(var10);
               if (!(var12 < f_20395)) {
                  this.f_20333 += var12;
                  double var14 = f_11537.player.isSprinting() ? f_20396 : f_20397;
                  if (!(this.f_20333 < var14)) {
                     this.f_20333 %= var14;
                     double var16 = var6 / var12;
                     double var18 = var8 / var12;
                     this.m_6666(var4, var16, var18, f_11537.player.isSprinting());
                  }
               }
            } else {
               this.f_20333 = 0.0;
            }
         }
      } else {
         this.m_6681();
      }
   }

   private static final class Class_73l7foKBzFGGFnra {
      public final double f_20262;
      public final double f_20263;
      public final double f_20264;
      public final float f_20265;
      public final float f_20266;
      public final float f_20267;
      public final float f_20268;
      public final long f_20269;
      public final long f_20270;

      public float m_6628(long var1) {
         long var3 = Math.max(1L, this.f_20270 - this.f_20269);
         return Math.clamp((float)(var1 - this.f_20269) / (float)var3, 0.0F, 1.0F);
      }

      public Class_73l7foKBzFGGFnra(double var1, double var3, double var5, float var7, float var8, float var9, float var10, long var11, long var13) {
         this.f_20262 = var1;
         this.f_20263 = var3;
         this.f_20264 = var5;
         this.f_20265 = var7;
         this.f_20266 = var8;
         this.f_20267 = var9;
         this.f_20268 = var10;
         this.f_20269 = var11;
         this.f_20270 = var13;
      }
   }

   private static final class ZOKMnbmDQburyPB0 {
      public final GpuTextureView f_20271 = RenderSystem.outputColorTextureOverride;
      public final GpuTextureView f_20272 = RenderSystem.outputDepthTextureOverride;
      public final GpuBufferSlice f_20273 = RenderSystem.getProjectionMatrixBuffer();
      public final ProjectionType f_20274 = RenderSystem.getProjectionType();
      public final GpuBufferSlice f_20275 = RenderSystem.getShaderFog();
      public final GpuBufferSlice f_20276 = RenderSystem.getShaderLights();
      public final GpuBuffer f_20277 = RenderSystem.getGlobalSettingsUniform();
      public final Matrix4f f_20278 = new Matrix4f(RenderSystem.getModelViewMatrixCopy());
      public final Matrix4f f_20279;
      public final Matrix4f f_20280;
      public final boolean f_20281;
      public final int f_20282;
      public final int f_20283;
      public final int f_20284;
      public final int f_20285;
      public final RenderTarget f_20286;

      public Throwable m_6634(Throwable var1) {
         var1 = Rain.m_6654(var1, () -> Rain.f_20324 = this.f_20286);
         var1 = Rain.m_6654(var1, () -> RenderSystem.outputColorTextureOverride = this.f_20271);
         var1 = Rain.m_6654(var1, () -> RenderSystem.outputDepthTextureOverride = this.f_20272);
         var1 = Rain.m_6654(var1, () -> RenderSystem.setProjectionMatrix(this.f_20273, this.f_20274));
         var1 = Rain.m_6654(var1, () -> RenderSystem.setShaderFog(this.f_20275));
         var1 = Rain.m_6654(var1, () -> RenderSystem.setShaderLights(this.f_20276));
         var1 = Rain.m_6654(var1, () -> RenderSystem.setGlobalSettingsUniform(this.f_20277));
         var1 = Rain.m_6654(var1, () -> RenderSystem.getModelViewStack().set(this.f_20278));
         CameraRenderState var2 = Class_NzJrN63M7QBpmAbi.f_11537.gameRenderer.gameRenderState().levelRenderState.cameraRenderState;
         var1 = Rain.m_6654(var1, () -> var2.viewRotationMatrix.set(this.f_20279));
         var1 = Rain.m_6654(var1, () -> var2.projectionMatrix.set(this.f_20280));
         var1 = Rain.m_6654(var1, () -> RenderSystem.enableScissorForRenderTypeDraws(this.f_20282, this.f_20283, this.f_20284, this.f_20285));
         if (!this.f_20281) {
            var1 = Rain.m_6654(var1, RenderSystem::disableScissorForRenderTypeDraws);
         }

         return var1;
      }

      public static Rain.ZOKMnbmDQburyPB0 m_6636() {
         return new Rain.ZOKMnbmDQburyPB0();
      }

      public ZOKMnbmDQburyPB0() {
         CameraRenderState var1 = Class_NzJrN63M7QBpmAbi.f_11537.gameRenderer.gameRenderState().levelRenderState.cameraRenderState;
         this.f_20279 = new Matrix4f(var1.viewRotationMatrix);
         this.f_20280 = new Matrix4f(var1.projectionMatrix);
         ScissorState var2 = RenderSystem.getScissorStateForRenderTypeDraws();
         this.f_20281 = var2.enabled();
         this.f_20282 = var2.x();
         this.f_20283 = var2.y();
         this.f_20284 = var2.width();
         this.f_20285 = var2.height();
         this.f_20286 = Rain.f_20324;
      }
   }

   private record zN5C9uJ0aNKQQyhW(double y) {
   }
}
