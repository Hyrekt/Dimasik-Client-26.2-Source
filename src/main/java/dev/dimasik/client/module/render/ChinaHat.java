package dev.dimasik.client.module.render;

import com.mojang.blaze3d.IndexType;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.platform.BlendFactor;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.AutoStorageIndexBuffer;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.MeshData;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.MeshData.DrawState;
import com.mojang.math.Axis;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ColorSetting;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_Iua76IEbeuvyIBtu;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_PoKta0VE7AdhY1En;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import dev.dimasik.mixin.RenderPipelinesMixin;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import net.minecraft.client.Camera;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector4f;

public class ChinaHat extends Module {
   private static final int f_16187 = 64;
   private static final float f_16188 = 0.012F;
   private static final int f_16189 = 6;
   private static final int f_16190 = 5;
   private static final int f_16191 = 24;
   private static final int f_16192 = 8;
   private static final Identifier f_16193 = Identifier.fromNamespaceAndPath(ChinaHat.f_16438, ChinaHat.f_16439);
   private static final double f_16194 = 20.0;
   private final MultiChoiceSetting f_16195;
   private final ItemListSetting f_16196;
   private final SliderSetting f_16197;
   private final SliderSetting f_16198;
   private final SliderSetting f_16199;
   private final SliderSetting f_16200;
   private final SliderSetting f_16201;
   private final SliderSetting f_16202;
   private final SliderSetting f_16203;
   private final SliderSetting f_16204;
   private final CheckboxSetting f_16205;
   private final CheckboxSetting f_16206;
   private final ColorSetting f_16207;
   private final RenderPipeline f_16208;
   private final RenderPipeline f_16209;
   private static final BlendFunction f_16210 = new BlendFunction(BlendFactor.SRC_ALPHA, BlendFactor.ONE);
   private final RenderPipeline f_16211;
   private final RenderPipeline f_16212;
   private final Map<Integer, LinkedList<Vec3>[]> f_16213;
   private final Vector4f f_16214;
   private final Matrix4f f_16215;
   private final Matrix4f f_16216;
   private final Matrix3f f_16217;
   private final Vector4f f_16218;
   private final Vector4f f_16219;
   private long f_16220;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_16221;
   private float f_16222;
   private float f_16223;
   private float f_16224;
   private float f_16225;
   private float f_16226;
   private float f_16227;
   private static final String f_16228 = "ChinaHat";
   private static final String f_16229 = "Конус над головой игрока";
   private static final String f_16230 = "Режим";
   private static final String f_16231 = "Обычный";
   private static final String f_16232 = "Градиент";
   private static final String f_16233 = "Контур";
   private static final String f_16234 = "Cyber";
   private static final String f_16235 = "Призраки 1";
   private static final String f_16236 = "Призраки 2";
   private static final String f_16237 = "Призраки 3";
   private static final String f_16238 = "Отображать";
   private static final String f_16239 = "Себя";
   private static final String f_16240 = "Друзей";
   private static final String f_16241 = "Игроков";
   private static final String f_16242 = "Радиус";
   private static final float f_16243 = 0.65F;
   private static final float f_16244 = 0.3F;
   private static final float f_16245 = 1.4F;
   private static final float f_16246 = 0.05F;
   private static final String f_16247 = "Высота";
   private static final float f_16248 = 0.35F;
   private static final float f_16249 = 0.1F;
   private static final float f_16250 = 0.9F;
   private static final float f_16251 = 0.05F;
   private static final String f_16252 = "Отступ";
   private static final float f_16253 = 0.08F;
   private static final float f_16254 = -0.2F;
   private static final float f_16255 = 0.4F;
   private static final float f_16256 = 0.01F;
   private static final String f_16257 = "Скорость";
   private static final float f_16258 = 45.0F;
   private static final float f_16259 = 180.0F;
   private static final String f_16260 = "Прозрачность";
   private static final float f_16261 = 0.75F;
   private static final float f_16262 = 0.15F;
   private static final float f_16263 = 0.05F;
   private static final String f_16264 = "Размер";
   private static final float f_16265 = 0.3F;
   private static final float f_16266 = 0.05F;
   private static final float f_16267 = 0.01F;
   private static final String f_16268 = "Длина трейла";
   private static final float f_16269 = 25.0F;
   private static final float f_16270 = 5.0F;
   private static final float f_16271 = 100.0F;
   private static final String f_16272 = "Смещение цвета";
   private static final float f_16273 = 360.0F;
   private static final String f_16274 = "Всегда показывать";
   private static final String f_16275 = "Авто цвет под тему";
   private static final String f_16276 = "Цвет";
   private static final int f_16277 = -38006;
   private static final String f_16278 = "dimasik/china_hat";
   private static final String f_16279 = "target_esp_crystal";
   private static final String f_16280 = "target_esp_crystal";
   private static final String f_16281 = "dimasik/china_hat_ghost3";
   private static final String f_16282 = "dead_chams";
   private static final String f_16283 = "dead_chams";
   private static final String f_16284 = "Sampler0";
   private static final String f_16285 = "dimasik/pipeline/chinahat_cyber_glass";
   private static final String f_16286 = "chinahat";
   private static final String f_16287 = "chinahat";
   private static final String f_16288 = "dimasik/pipeline/chinahat_cyber_bloom";
   private static final String f_16289 = "chinahat";
   private static final String f_16290 = "chinahat";
   private static final long f_16291 = -1L;
   private static final String f_16292 = "Призраки";
   private static final String f_16293 = "Призраки 1";
   private static final String f_16294 = "Cyber";
   private static final long f_16295 = -1L;
   private static final String f_16296 = "Призраки 3";
   private static final long f_16297 = -1L;
   private static final float f_16298 = 0.05F;
   private static final String f_16299 = "Призраки 2";
   private static final String f_16300 = "Призраки 1";
   private static final String f_16301 = "Контур";
   private static final int f_16302 = 9347071;
   private static final int f_16303 = 6061823;
   private static final float f_16304 = 0.9375F;
   private static final String f_16305 = "chinaHatCyberGlass";
   private static final String f_16306 = "chinaHatCyberBloom";
   private static final double f_16307 = Math.PI;
   private static final double f_16308 = 20.0;
   private static final double f_16309 = 1000.0;
   private static final float f_16310 = 10.0F;
   private static final float f_16311 = 0.3F;
   private static final float f_16312 = 1.6F;
   private static final float f_16313 = 0.5F;
   private static final float f_16314 = 0.26F;
   private static final float f_16315 = 0.42F;
   private static final float f_16316 = (float) (Math.PI * 2);
   private static final float f_16317 = 6.0F;
   private static final float f_16318 = 4.0F;
   private static final float f_16319 = 1.9F;
   private static final float f_16320 = 0.35F;
   private static final int f_16321 = -15394268;
   private static final float f_16322 = 0.45F;
   private static final float f_16323 = 1.25F;
   private static final float f_16324 = 0.5F;
   private static final float f_16325 = 0.22F;
   private static final float f_16326 = 0.42F;
   private static final float f_16327 = 0.38F;
   private static final float f_16328 = 0.22F;
   private static final float f_16329 = 0.44F;
   private static final float f_16330 = 0.02F;
   private static final float f_16331 = 0.42F;
   private static final float f_16332 = 0.18F;
   private static final float f_16333 = 0.36F;
   private static final float f_16334 = 0.4F;
   private static final float f_16335 = 0.2F;
   private static final float f_16336 = 0.28F;
   private static final float f_16337 = 0.06F;
   private static final float f_16338 = 0.48F;
   private static final float f_16339 = 0.34F;
   private static final float f_16340 = 0.06F;
   private static final float f_16341 = 0.48F;
   private static final float f_16342 = 0.2F;
   private static final float f_16343 = 0.28F;
   private static final float f_16344 = 0.36F;
   private static final float f_16345 = 0.4F;
   private static final float f_16346 = 0.42F;
   private static final float f_16347 = 0.18F;
   private static final float f_16348 = 0.44F;
   private static final float f_16349 = 0.02F;
   private static final float f_16350 = 0.38F;
   private static final float f_16351 = 0.22F;
   private static final float f_16352 = 0.22F;
   private static final float f_16353 = 0.42F;
   private static final float f_16354 = 0.05F;
   private static final float f_16355 = 0.13F;
   private static final float f_16356 = 0.14F;
   private static final float f_16357 = 0.07F;
   private static final float f_16358 = 0.11F;
   private static final float f_16359 = 0.13F;
   private static final float f_16360 = 0.14F;
   private static final float f_16361 = 0.07F;
   private static final float f_16362 = 0.11F;
   private static final float f_16363 = 1.0E-5F;
   private static final float f_16364 = 1.0E-5F;
   private static final float f_16365 = 1.0E-5F;
   private static final double f_16366 = 0.004;
   private static final float f_16367 = 45.0F;
   private static final double f_16368 = Math.PI * 2;
   private static final double f_16369 = -1.0;
   private static final double f_16370 = 0.8;
   private static final double f_16371 = 0.04;
   private static final float f_16372 = 0.26F;
   private static final float f_16373 = 0.16F;
   private static final float f_16374 = 0.35F;
   private static final double f_16375 = 1.8;
   private static final float f_16376 = 0.12F;
   private static final float f_16377 = 1.0E-5F;
   private static final float f_16378 = (float) (Math.PI * 2);
   private static final float f_16379 = 8.0F;
   private static final float f_16380 = (float) (Math.PI * 2);
   private static final float f_16381 = 8.0F;
   private static final float f_16382 = 0.5F;
   private static final float f_16383 = 100.0F;
   private static final float f_16384 = 90.0F;
   private static final float f_16385 = 90.0F;
   private static final float f_16386 = 90.0F;
   private static final float f_16387 = 0.8333334F;
   private static final float f_16388 = 0.12F;
   private static final float f_16389 = -1.0F;
   private static final float f_16390 = 0.3F;
   private static final float f_16391 = -1.0F;
   private static final float f_16392 = 0.3F;
   private static final String f_16393 = "Градиент";
   private static final float f_16394 = 0.95F;
   private static final float f_16395 = 0.9F;
   private static final float f_16396 = (float) (Math.PI * 2);
   private static final float f_16397 = 64.0F;
   private static final float f_16398 = (float) (Math.PI * 2);
   private static final float f_16399 = 64.0F;
   private static final float f_16400 = 0.01F;
   private static final float f_16401 = 0.030000001F;
   private static final float f_16402 = 0.012F;
   private static final float f_16403 = (float) (Math.PI * 2);
   private static final float f_16404 = 64.0F;
   private static final float f_16405 = (float) (Math.PI * 2);
   private static final float f_16406 = 64.0F;
   private static final float f_16407 = 0.012F;
   private static final float f_16408 = 0.012F;
   private static final float f_16409 = 0.012F;
   private static final float f_16410 = 0.012F;
   private static final String f_16411 = "Градиент";
   private static final String f_16412 = "Призраки 1";
   private static final String f_16413 = "Призраки 2";
   private static final String f_16414 = "Призраки 3";
   private static final String f_16415 = "Себя";
   private static final String f_16416 = "Призраки 3";
   private static final String f_16417 = "Друзей";
   private static final String f_16418 = "Игроков";
   private static final String f_16419 = "chinaHat";
   private static final String f_16420 = "Sampler0";
   private static final long f_16421 = -1L;
   private static final String f_16422 = "chinaHatGhost3";
   private static final String f_16423 = "chinaHatGhost3Vertices";
   private static final String f_16424 = "Градиент";
   private static final String f_16425 = "Cyber";
   private static final String f_16426 = "Градиент";
   private static final String f_16427 = "Cyber";
   private static final String f_16428 = "Призраки 3";
   private static final String f_16429 = "Призраки 3";
   private static final String f_16430 = "Призраки 3";
   private static final String f_16431 = "Призраки 3";
   private static final String f_16432 = "Cyber";
   private static final String f_16433 = "Cyber";
   private static final String f_16434 = "Cyber";
   private static final String f_16435 = "Призраки 3";
   private static final String f_16436 = "Cyber";
   private static final String f_16437 = "Cyber";
   private static final String f_16438 = "dimasik";
   private static final String f_16439 = "images/fireflies/bloom.png";

   private void m_5643(BufferBuilder var1, int var2) {
      MeshData var3 = var1.build();
      if (var3 != null) {
         if (var2 == 0) {
            var3.close();
         } else {
            GpuBuffer var4 = null;

            try {
               DrawState var5 = var3.drawState();
               int var6 = var5.indexCount();
               AutoStorageIndexBuffer var7 = RenderSystem.getSequentialBuffer(var5.primitiveTopology());
               GpuBuffer var8 = var7.getBuffer(var6);
               IndexType var9 = var7.type();
               var4 = RenderSystem.getDevice().createBuffer(() -> f_16423, 32, var3.vertexBuffer());
               RenderTarget var10 = f_11537.gameRenderer.mainRenderTarget();
               CommandEncoder var11 = RenderSystem.getDevice().createCommandEncoder();
               AbstractTexture var12 = f_11537.getTextureManager().getTexture(f_16193);
               RenderPass var13 = var11.createRenderPass(
                  () -> f_16422, var10.getColorTextureView(), Optional.empty(), var10.getDepthTextureView(), OptionalDouble.empty()
               );

               try {
                  RenderSystem.bindDefaultUniforms(var13);
                  var13.setPipeline(this.f_16209);
                  var13.bindTexture(f_16420, var12.getTextureView(), var12.getSampler());
                  var13.setVertexBuffer(0, var4.slice());
                  var13.setIndexBuffer(var8, var9);
                  var13.drawIndexed(var6, 1, 0, 0, 0);
               } catch (Throwable var21) {
                  if (var13 != null) {
                     try {
                        var13.close();
                     } catch (Throwable var20) {
                        var21.addSuppressed(var20);
                     }
                  }

                  throw var21;
               }

               if (var13 != null) {
                  var13.close();
               }
            } finally {
               if (var4 != null) {
                  var4.close();
               }

               var3.close();
            }
         }
      }
   }

   private void m_5644(BufferBuilder var1, Matrix4f var2, float var3, float var4, float var5, Vector4f var6) {
      var1.addVertex(var2, var3, var4, var5).setUv(0.0F, 0.0F).setColor(var6.x, var6.y, var6.z, var6.w);
   }

   private float m_5647(Player var1, ChinaHat.uDvg2RY38Z22x8A4 var2, boolean var3) {
      boolean var4 = var2.xRot != 0.0F || var2.swimShift > 0.0F || var1.isFallFlying() || var1.isVisuallySwimming() || var1.isVisuallyCrawling();
      float var5 = (var4 ? var1.getDimensions(Pose.STANDING).height() : var1.getBbHeight()) * var2.scale;
      return var3 ? var5 * f_16387 - f_16388 : var5 + this.f_16199.m_8768();
   }

   private int m_5648(BufferBuilder var1, Matrix4f var2, float var3, float var4, float var5, float var6, int var7, float var8) {
      Vector4f var9 = Class_BftdentXEtGbugJw.m_2298(Class_BftdentXEtGbugJw.m_2306(var7, var8));
      Vector4f var10 = Class_BftdentXEtGbugJw.m_2298(Class_BftdentXEtGbugJw.m_2306(var7, 0.0F));
      byte var11 = 0;

      for (int var12 = 0; var12 < 8; var12++) {
         float var13 = f_16378 * var12 / f_16379;
         float var14 = f_16380 * (var12 + 1) / f_16381;
         float var15 = Mth.cos(var13);
         float var16 = Mth.sin(var13);
         float var17 = Mth.cos(var14);
         float var18 = Mth.sin(var14);
         this.m_5644(var1, var2, var3, var4, var5, var9);
         this.m_5644(
            var1,
            var2,
            var3 + this.f_16218.x * var15 * var6 + this.f_16219.x * var16 * var6,
            var4 + this.f_16218.y * var15 * var6 + this.f_16219.y * var16 * var6,
            var5 + this.f_16218.z * var15 * var6 + this.f_16219.z * var16 * var6,
            var10
         );
         this.m_5644(
            var1,
            var2,
            var3 + this.f_16218.x * var17 * var6 + this.f_16219.x * var18 * var6,
            var4 + this.f_16218.y * var17 * var6 + this.f_16219.y * var18 * var6,
            var5 + this.f_16218.z * var17 * var6 + this.f_16219.z * var18 * var6,
            var10
         );
         this.m_5644(var1, var2, var3, var4, var5, var9);
         var11 += 4;
      }

      return var11;
   }

   private float m_5650(PoseStack var1, Vec3 var2, Player var3, float var4, float var5) {
      ChinaHat.uDvg2RY38Z22x8A4 var6 = this.m_5655(var3, var4);
      var1.pushPose();
      this.m_5688(var1, var2, var3, var4, var6, var5, this.m_5647(var3, var6, true));
      return var6.scale;
   }

   private static boolean m_5652(Vector4f var0) {
      float var1 = Mth.sqrt(var0.x * var0.x + var0.y * var0.y + var0.z * var0.z);
      if (!(var1 < f_16377) && Float.isFinite(var1)) {
         var0.x /= var1;
         var0.y /= var1;
         var0.z /= var1;
         return true;
      } else {
         return false;
      }
   }

   private float m_5653(PoseStack var1, Vec3 var2, Player var3, float var4, float var5) {
      ChinaHat.uDvg2RY38Z22x8A4 var6 = this.m_5655(var3, var4);
      var1.pushPose();
      this.m_5688(var1, var2, var3, var4, var6, var5, this.m_5647(var3, var6, false));
      return var6.scale;
   }

   private int m_5654(
      BufferBuilder var1,
      Matrix4f var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      Vector4f var16
   ) {
      this.m_5657(var1, var2, var3, var4, var5, var6 - var8, var7 - var9, var10, var11, var12, var13, var14, var15, var16);
      this.m_5657(var1, var2, var3, var4, var5, var6 - var8, var7 + var9, var10, var11, var12, var13, var14, var15, var16);
      this.m_5657(var1, var2, var3, var4, var5, var6 + var8, var7 + var9, var10, var11, var12, var13, var14, var15, var16);
      this.m_5657(var1, var2, var3, var4, var5, var6 + var8, var7 - var9, var10, var11, var12, var13, var14, var15, var16);
      return 4;
   }

   private ChinaHat.uDvg2RY38Z22x8A4 m_5655(Player var1, float var2) {
      float var3 = Mth.rotLerp(var2, var1.yBodyRotO, var1.yBodyRot);
      float var4 = Mth.lerp(var2, var1.xRotO, var1.getXRot());
      float var5 = var1.getSwimAmount(var2);
      float var6 = var1.isBaby() ? f_16382 : 1.0F;
      float var7 = 0.0F;
      float var8 = 0.0F;
      if (var1.isFallFlying()) {
         float var9 = var1.getFallFlyingTicks() + var2;
         float var10 = Mth.clamp(var9 * var9 / f_16383, 0.0F, 1.0F);
         if (!var1.isAutoSpinAttack()) {
            var7 = var10 * (var4 + f_16384);
         }
      } else if (var5 > 0.0F) {
         float var11 = var1.isInWater() ? var4 + f_16385 : f_16386;
         var7 = Mth.lerp(var5, 0.0F, var11);
         if (var1.isVisuallySwimming()) {
            var8 = var5;
         }
      }

      return new ChinaHat.uDvg2RY38Z22x8A4(var3, var7, var8, var6);
   }

   private int m_5656(BufferBuilder var1, PoseStack var2, Vec3 var3, Player var4, float var5) {
      float var6 = this.m_5653(var2, var3, var4, var5, 0.0F);
      Matrix4f var7 = var2.last().pose();
      this.f_16216.set(var7).invert();
      this.f_16218.set(1.0F, 0.0F, 0.0F, 0.0F);
      this.f_16216.transform(this.f_16218);
      this.f_16219.set(0.0F, 1.0F, 0.0F, 0.0F);
      this.f_16216.transform(this.f_16219);
      if (m_5652(this.f_16218) && m_5652(this.f_16219)) {
         float var8 = this.f_16197.m_8768() * var6;
         float var9 = this.f_16198.m_8768() * var6;
         float var10 = this.f_16201.m_8768();
         int var11 = this.m_5686(0);
         int var12 = this.f_16206.m_8768() ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN_TWO) : this.m_5686(48);
         double var13 = System.currentTimeMillis() * f_16366 * (this.f_16200.m_8768() / f_16367);
         LinkedList[] var15 = this.m_5678(var4.getId());
         int var16 = 0;

         for (int var17 = 0; var17 < var15.length; var17++) {
            double var18 = var17 * (f_16368 / var15.length);
            double var20 = Math.sin(var13 + var18) * var8;
            double var22 = Math.cos(var13 + var18) * var8;
            double var24 = var17 % 2 == 0 ? 1.0 : f_16369;
            double var26 = Math.sin((var13 + var18) * f_16370) * var24 * var9;
            LinkedList var28 = var15[var17];
            Vec3 var29 = new Vec3(var20, var26, var22);
            if (!var28.isEmpty()) {
               Vec3 var30 = (Vec3)var28.getFirst();
               double var31 = var30.distanceTo(var29);
               int var33 = Mth.clamp((int)Math.ceil(var31 / f_16371), 1, 6);

               for (int var34 = 1; var34 <= var33; var34++) {
                  var28.addFirst(var30.lerp(var29, (double)var34 / var33));
               }
            } else {
               var28.addFirst(var29);
            }

            while (var28.size() > 24) {
               var28.removeLast();
            }

            int var42 = 0;
            int var43 = var28.size();

            for (Vec3 var44 : (Iterable<Vec3>) (Iterable) var28) {
               float var45 = 1.0F - (float)var42 / var43;
               float var35 = (float)var44.x;
               float var36 = (float)var44.y;
               float var37 = (float)var44.z;
               int var38 = Class_BftdentXEtGbugJw.m_2302(var11, var12, var45);
               float var39 = var42 == 0 ? f_16372 : f_16373;
               float var40 = var39 * var45 * Math.max(var10, f_16374);
               float var41 = (float)(Math.pow(var45, f_16375) * var10);
               var16 += this.m_5648(var1, var7, var35, var36, var37, var40, var38, var41);
               if (var42 == 0) {
                  var16 += this.m_5648(var1, var7, var35, var36, var37, f_16376, -1, var10);
               }

               var42++;
            }
         }

         var2.popPose();
         return var16;
      } else {
         var2.popPose();
         return 0;
      }
   }

   private int m_5657(
      BufferBuilder var1,
      Matrix4f var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      Vector4f var14
   ) {
      this.m_5644(var1, var2, var3 + var8 * var6 + var11 * var7, var4 + var9 * var6 + var12 * var7, var5 + var10 * var6 + var13 * var7, var14);
      return 1;
   }

   private boolean m_5658(float var1, float var2, float var3, float var4, float var5) {
      float var6 = this.f_16214.x - var1;
      float var7 = this.f_16214.y - var2;
      float var8 = this.f_16214.z - var3;
      float var9 = Mth.sqrt(var6 * var6 + var7 * var7 + var8 * var8);
      if (var9 < f_16363) {
         return false;
      }

      var6 /= var9;
      var7 /= var9;
      var8 /= var9;
      float var10 = var8;
      float var11 = 0.0F;
      float var12 = -var6;
      float var13 = Mth.sqrt(var10 * var10 + var12 * var12);
      if (var13 < f_16364) {
         var10 = var4;
         var11 = 0.0F;
         var12 = 0.0F;
      } else {
         float var14 = var4 / var13;
         var10 *= var14;
         var12 *= var14;
      }

      float var24 = var7 * var12 - var8 * var11;
      float var15 = var8 * var10 - var6 * var12;
      float var16 = var6 * var11 - var7 * var10;
      float var17 = Mth.sqrt(var24 * var24 + var15 * var15 + var16 * var16);
      if (var17 < f_16365) {
         return false;
      }

      float var18 = var5 / var17;
      this.f_16222 = var10;
      this.f_16223 = var11;
      this.f_16224 = var12;
      this.f_16225 = var24 * var18;
      this.f_16226 = var15 * var18;
      this.f_16227 = var16 * var18;
      return true;
   }

   public ChinaHat() {
      super(f_16228, f_16229, Category.RENDER);
      this.f_16195 = new MultiChoiceSetting(
         f_16230,
         new Class_2ZaVm8TGDJ68TnJB(f_16231),
         new Class_2ZaVm8TGDJ68TnJB(f_16232),
         new Class_2ZaVm8TGDJ68TnJB(f_16233),
         new Class_2ZaVm8TGDJ68TnJB(f_16234),
         new Class_2ZaVm8TGDJ68TnJB(f_16235),
         new Class_2ZaVm8TGDJ68TnJB(f_16236),
         new Class_2ZaVm8TGDJ68TnJB(f_16237)
      );
      this.f_16196 = new ItemListSetting(
         f_16238, new Class_2ZaVm8TGDJ68TnJB(f_16239, true), new Class_2ZaVm8TGDJ68TnJB(f_16240, false), new Class_2ZaVm8TGDJ68TnJB(f_16241, false)
      );
      this.f_16197 = new SliderSetting(f_16242, f_16243, f_16244, f_16245).m_828(f_16246).m_822(() -> !this.f_16195.m_7568(f_16437));
      this.f_16198 = new SliderSetting(f_16247, f_16248, f_16249, f_16250)
         .m_828(f_16251)
         .m_822(() -> !this.f_16195.m_7568(f_16435) && !this.f_16195.m_7568(f_16436));
      this.f_16199 = new SliderSetting(f_16252, f_16253, f_16254, f_16255).m_828(f_16256).m_822(() -> !this.f_16195.m_7568(f_16434));
      this.f_16200 = new SliderSetting(f_16257, f_16258, 0.0F, f_16259).m_828(1.0F).m_822(() -> !this.f_16195.m_7568(f_16433));
      this.f_16201 = new SliderSetting(f_16260, f_16261, f_16262, 1.0F).m_828(f_16263).m_822(() -> !this.f_16195.m_7568(f_16432));
      this.f_16202 = new SliderSetting(f_16264, f_16265, f_16266, 1.0F).m_828(f_16267).m_822(() -> this.f_16195.m_7568(f_16431));
      this.f_16203 = new SliderSetting(f_16268, f_16269, f_16270, f_16271).m_828(1.0F).m_822(() -> this.f_16195.m_7568(f_16430));
      this.f_16204 = new SliderSetting(f_16272, 0.0F, 0.0F, f_16273).m_828(1.0F).m_822(() -> this.f_16195.m_7568(f_16429));
      this.f_16205 = new CheckboxSetting(f_16274, false).m_822(() -> this.f_16195.m_7568(f_16428));
      this.f_16206 = new CheckboxSetting(f_16275, true).m_822(() -> !this.f_16195.m_7568(f_16426) && !this.f_16195.m_7568(f_16427));
      this.f_16207 = new ColorSetting(f_16276, false, f_16277)
         .m_822(() -> !this.f_16206.m_8768() && !this.f_16195.m_7568(f_16424) && !this.f_16195.m_7568(f_16425));
      this.f_16208 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_16278)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_16279))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_16280))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2722();
      this.f_16209 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_16281)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_16282))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_16283))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.ADDITIVE)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2741(f_16284)
         .m_2722();
      this.f_16211 = RenderPipelinesMixin.register(
         Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671, RenderPipelines.GLOBALS_SNIPPET)
            .m_2726(f_16285)
            .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_16286))
            .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_16287))
            .m_2719(CompareOp.ALWAYS_PASS)
            .m_2737(false)
            .m_2725(false)
            .m_2732(BlendFunction.TRANSLUCENT)
            .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR_NORMAL, PrimitiveTopology.TRIANGLES)
            .m_2722()
      );
      this.f_16212 = RenderPipelinesMixin.register(
         Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671, RenderPipelines.GLOBALS_SNIPPET)
            .m_2726(f_16288)
            .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_16289))
            .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_16290))
            .m_2719(CompareOp.ALWAYS_PASS)
            .m_2737(false)
            .m_2725(false)
            .m_2732(f_16210)
            .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR_NORMAL, PrimitiveTopology.TRIANGLES)
            .m_2722()
      );
      this.f_16213 = new HashMap<>();
      this.f_16214 = new Vector4f();
      this.f_16215 = new Matrix4f();
      this.f_16216 = new Matrix4f();
      this.f_16217 = new Matrix3f();
      this.f_16218 = new Vector4f();
      this.f_16219 = new Vector4f();
      this.f_16220 = f_16291;
      this.f_16221 = this::m_5668;
      this.m_795(
         this.f_16195,
         this.f_16196,
         this.f_16197,
         this.f_16198,
         this.f_16199,
         this.f_16200,
         this.f_16201,
         this.f_16202,
         this.f_16203,
         this.f_16204,
         this.f_16205,
         this.f_16206,
         this.f_16207
      );
   }

   private int m_5660(BufferBuilder var1, Matrix4f var2, float var3, float var4, float var5, float var6, int var7) {
      Vector4f var8 = Class_BftdentXEtGbugJw.m_2298(var7);
      Vector4f var9 = Class_BftdentXEtGbugJw.m_2298(Class_BftdentXEtGbugJw.m_2306(f_16321, Math.max(f_16322, var8.w)));
      float var10 = var6;
      float var11 = var6 * f_16323;
      float[] var12 = new float[]{
         0.0F,
         var11 * f_16324,
         var10 * f_16325,
         var11 * f_16326,
         var10 * f_16327,
         var11 * f_16328,
         var10 * f_16329,
         var11 * f_16330,
         var10 * f_16331,
         -var11 * f_16332,
         var10 * f_16333,
         -var11 * f_16334,
         var10 * f_16335,
         -var11 * f_16336,
         var10 * f_16337,
         -var11 * f_16338,
         0.0F,
         -var11 * f_16339,
         -var10 * f_16340,
         -var11 * f_16341,
         -var10 * f_16342,
         -var11 * f_16343,
         -var10 * f_16344,
         -var11 * f_16345,
         -var10 * f_16346,
         -var11 * f_16347,
         -var10 * f_16348,
         var11 * f_16349,
         -var10 * f_16350,
         var11 * f_16351,
         -var10 * f_16352,
         var11 * f_16353
      };
      float var13 = 0.0F;
      float var14 = 0.0F;
      float var15 = 0.0F;
      float var16 = 0.0F;
      float var17 = 0.0F;
      float var18 = 0.0F;
      if (!this.m_5658(var3, var4, var5, 1.0F, 1.0F)) {
         var13 = 1.0F;
         var17 = 1.0F;
      } else {
         var13 = this.f_16222;
         var14 = this.f_16223;
         var15 = this.f_16224;
         var16 = this.f_16225;
         var17 = this.f_16226;
         var18 = this.f_16227;
      }

      int var19 = var12.length / 2;
      int var20 = 0;
      float var21 = 0.0F;
      float var22 = var11 * f_16354;

      for (int var23 = 0; var23 < var19; var23++) {
         int var24 = (var23 + 1) % var19;
         var20 += this.m_5657(var1, var2, var3, var4, var5, var21, var22, var13, var14, var15, var16, var17, var18, var8);
         var20 += this.m_5657(var1, var2, var3, var4, var5, var12[var23 * 2], var12[var23 * 2 + 1], var13, var14, var15, var16, var17, var18, var8);
         var20 += this.m_5657(var1, var2, var3, var4, var5, var12[var24 * 2], var12[var24 * 2 + 1], var13, var14, var15, var16, var17, var18, var8);
         var20 += this.m_5657(var1, var2, var3, var4, var5, var21, var22, var13, var14, var15, var16, var17, var18, var8);
      }

      var20 += this.m_5654(
         var1, var2, var3, var4, var5, -var10 * f_16355, var11 * f_16356, var10 * f_16357, var11 * f_16358, var13, var14, var15, var16, var17, var18, var9
      );
      return var20
         + this.m_5654(
            var1, var2, var3, var4, var5, var10 * f_16359, var11 * f_16360, var10 * f_16361, var11 * f_16362, var13, var14, var15, var16, var17, var18, var9
         );
   }

   private static Vec3 m_5661(Player var0, float var1) {
      return new Vec3(Mth.lerp(var1, var0.xo, var0.getX()), Mth.lerp(var1, var0.yo, var0.getY()), Mth.lerp(var1, var0.zo, var0.getZ()));
   }

   @Override
   public void m_732() {
      this.f_16220 = f_16421;
      this.f_16213.clear();
      super.m_732();
   }

   private int m_5664(BufferBuilder var1, Matrix4f var2, float var3, float var4, float var5) {
      byte var6 = 0;
      boolean var7 = this.f_16195.m_7568(f_16393);
      Vector4f var8 = Class_BftdentXEtGbugJw.m_2298(Class_BftdentXEtGbugJw.m_2306(this.m_5686(0), var5 * (var7 ? f_16394 : f_16395)));

      for (int var9 = 0; var9 < 64; var9++) {
         float var10 = f_16396 * var9 / f_16397;
         float var11 = f_16398 * (var9 + 1) / f_16399;
         float var12 = Mth.cos(var10) * var3;
         float var13 = Mth.sin(var10) * var3;
         float var14 = Mth.cos(var11) * var3;
         float var15 = Mth.sin(var11) * var3;
         Vector4f var16 = Class_BftdentXEtGbugJw.m_2298(Class_BftdentXEtGbugJw.m_2306(this.m_5686(var9), var5));
         Vector4f var17 = Class_BftdentXEtGbugJw.m_2298(Class_BftdentXEtGbugJw.m_2306(this.m_5686(var9 + 1), var5));
         this.m_5644(var1, var2, 0.0F, var4, 0.0F, var8);
         this.m_5644(var1, var2, var12, 0.0F, var13, var16);
         this.m_5644(var1, var2, var14, 0.0F, var15, var17);
         this.m_5644(var1, var2, 0.0F, var4, 0.0F, var8);
         var6 += 4;
      }

      return var6;
   }

   private void m_5665(Class_TZhU50s8XmBQCMP5 var1, float var2, Vec3 var3) {
      if (this.f_16220 < 0L) {
         this.f_16220 = System.currentTimeMillis();
      }

      Camera var4 = f_11537.gameRenderer.mainCamera();
      float var5 = this.f_16197.m_8768();
      float var6 = this.f_16202.m_8768();
      float var7 = this.f_16200.m_8768();
      float var8 = this.f_16201.m_8768();
      int var9 = this.f_16203.m_8768().intValue();
      float var10 = this.f_16204.m_8768();
      long var11 = System.currentTimeMillis();
      PoseStack var13 = var1.m_5006();
      BufferBuilder var14 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
      int var15 = 0;

      for (Player var17 : f_11537.level.players()) {
         if (this.m_5673(var17)) {
            ChinaHat.uDvg2RY38Z22x8A4 var18 = this.m_5655(var17, var2);
            this.m_5683(this.f_16215, var3, var17, var2, var18, 0.0F, this.m_5647(var17, var18, false));
            float var19 = var5 * var18.scale;
            float var20 = var6 * var18.scale;

            for (int var21 = 0; var21 < 2; var21++) {
               double var22 = var21 * f_16307;

               for (int var24 = 0; var24 < var9; var24++) {
                  float var25 = (1.0F - (float)var24 / var9) * var8;
                  float var26 = var20 * (1.0F - (float)var24 / var9);
                  double var27 = (var11 - this.f_16220 - var24 * f_16308) / f_16309;
                  double var29 = var27 * (var7 / f_16310) + var22;
                  this.f_16214.set((float)(Math.sin(var29) * var19), 0.0F, (float)(Math.cos(var29) * var19), 1.0F);
                  this.f_16215.transform(this.f_16214);
                  float var31 = this.f_16214.x;
                  float var32 = this.f_16214.y;
                  float var33 = this.f_16214.z;
                  int var34 = (int)(var10 + var24 * 30);
                  int var35 = this.f_16206.m_8768() ? Class_BftdentXEtGbugJw.m_2304(var34) : this.f_16207.m_8768();
                  int var36 = Class_BftdentXEtGbugJw.m_2306(var35, var25);
                  int var37 = Class_BftdentXEtGbugJw.m_2306(Class_BftdentXEtGbugJw.m_2302(var35, -1, f_16311), var25);
                  var13.pushPose();
                  var13.translate(var31, var32, var33);
                  var13.mulPose(Axis.YP.rotationDegrees(-var4.yRot()));
                  var13.mulPose(Axis.XP.rotationDegrees(var4.xRot()));
                  Matrix4f var38 = var13.last().pose();
                  var15 += m_5675(var14, var38, var26, var36);
                  var15 += m_5675(var14, var38, var26 * f_16312, var37);
                  var13.popPose();
               }
            }
         }
      }

      this.m_5643(var14, var15);
   }

   private int m_5666(BufferBuilder var1, Matrix4f var2, float var3, float var4, float var5) {
      byte var6 = 0;
      float var7 = Math.max(f_16400, var3 - f_16401);
      float var8 = f_16402;

      for (int var9 = 0; var9 < 64; var9++) {
         float var10 = f_16403 * var9 / f_16404;
         float var11 = f_16405 * (var9 + 1) / f_16406;
         Vector4f var12 = Class_BftdentXEtGbugJw.m_2298(Class_BftdentXEtGbugJw.m_2306(this.m_5686(var9), var5));
         Vector4f var13 = Class_BftdentXEtGbugJw.m_2298(Class_BftdentXEtGbugJw.m_2306(this.m_5686(var9 + 1), var5));
         float var14 = Mth.cos(var10) * var3;
         float var15 = Mth.sin(var10) * var3;
         float var16 = Mth.cos(var11) * var3;
         float var17 = Mth.sin(var11) * var3;
         float var18 = Mth.cos(var10) * var7;
         float var19 = Mth.sin(var10) * var7;
         float var20 = Mth.cos(var11) * var7;
         float var21 = Mth.sin(var11) * var7;
         this.m_5644(var1, var2, var14, 0.0F, var15, var12);
         this.m_5644(var1, var2, var16, 0.0F, var17, var13);
         this.m_5644(var1, var2, var20, 0.0F, var21, var13);
         this.m_5644(var1, var2, var18, 0.0F, var19, var12);
         var6 += 4;
         if (var9 % 4 == 0) {
            float var22 = -Mth.sin(var10);
            float var23 = Mth.cos(var10);
            Vector4f var24 = Class_BftdentXEtGbugJw.m_2298(Class_BftdentXEtGbugJw.m_2306(this.m_5686(var9), var5));
            this.m_5644(var1, var2, var22 * var8, var4, var23 * var8, var24);
            this.m_5644(var1, var2, var14 + var22 * f_16407, 0.0F, var15 + var23 * f_16408, var12);
            this.m_5644(var1, var2, var14 - var22 * f_16409, 0.0F, var15 - var23 * f_16410, var12);
            this.m_5644(var1, var2, -var22 * var8, var4, -var23 * var8, var24);
            var6 += 4;
         }
      }

      return var6;
   }

   private void m_5668(Class_TZhU50s8XmBQCMP5 var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (f_16292.equals(this.f_16195.m_7566())) {
            this.f_16195.m_1766(f_16293);
         }

         float var2 = var1.m_5005().getGameTimeDeltaPartialTick(true);
         Vec3 var3 = var1.m_5010();
         if (this.f_16195.m_7568(f_16294)) {
            this.f_16213.clear();
            this.f_16220 = f_16295;
            this.m_5684(var1, var2, var3);
         } else if (this.f_16195.m_7568(f_16296)) {
            this.f_16213.clear();
            this.m_5665(var1, var2, var3);
         } else {
            this.f_16220 = f_16297;
            float var4 = (float)Math.toRadians(((float)f_11537.level.getGameTime() + var2) * this.f_16200.m_8768() * f_16298);
            boolean var5 = this.f_16195.m_7568(f_16299);
            if (!var5) {
               this.f_16213.clear();
            }

            BufferBuilder var6 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
            int var7 = 0;
            HashSet var8 = var5 ? new HashSet() : null;
            PoseStack var9 = var1.m_5006();

            for (Player var11 : f_11537.level.players()) {
               if (this.m_5673(var11)) {
                  if (var5) {
                     var8.add(var11.getId());
                     var7 += this.m_5656(var6, var9, var3, var11, var2);
                  } else if (this.f_16195.m_7568(f_16300)) {
                     var7 += this.m_5669(var6, var9, var3, var11, var2, var4);
                  } else {
                     var7 += this.m_5689(var6, var9, var3, var11, var2, var4);
                  }
               }
            }

            if (var8 != null) {
               this.f_16213.keySet().removeIf(var1x -> !var8.contains(var1x));
            }

            this.m_5680(var6, var7);
         }
      }
   }

   private int m_5669(BufferBuilder var1, PoseStack var2, Vec3 var3, Player var4, float var5, float var6) {
      float var7 = this.m_5653(var2, var3, var4, var5, var6);
      this.m_5670(var3, var4, var5, var6);
      Matrix4f var8 = var2.last().pose();
      float var9 = this.f_16197.m_8768() * var7;
      float var10 = this.f_16198.m_8768() * var7;
      float var11 = this.f_16201.m_8768();
      float var12 = Mth.clamp(var9 * f_16313, f_16314, f_16315);
      int var13 = 0;

      for (int var14 = 0; var14 < 6; var14++) {
         float var15 = f_16316 * var14 / f_16317;
         float var16 = Mth.sin(var6 * f_16318 + var14 * f_16319) * var10 * f_16320;
         var13 += this.m_5660(
            var1, var8, Mth.cos(var15) * var9, var16, Mth.sin(var15) * var9, var12, Class_BftdentXEtGbugJw.m_2306(this.m_5686(var14 * 8), var11)
         );
      }

      var2.popPose();
      return var13;
   }

   private void m_5670(Vec3 var1, Player var2, float var3, float var4) {
      ChinaHat.uDvg2RY38Z22x8A4 var5 = this.m_5655(var2, var3);
      this.m_5683(this.f_16215, var1, var2, var3, var5, var4, this.m_5647(var2, var5, false));
      this.f_16215.invert();
      this.f_16214.set(0.0F, 0.0F, 0.0F, 1.0F);
      this.f_16215.transform(this.f_16214);
   }

   private boolean m_5673(Player var1) {
      if (var1 != f_11537.player) {
         return DimasikClient.m_9057().m_9049().m_2804().m_2877(var1.getName().getString()) ? this.f_16196.m_7145(f_16417) : this.f_16196.m_7145(f_16418);
      } else if (!this.f_16196.m_7145(f_16415)) {
         return false;
      } else {
         return !f_11537.options.getCameraType().isFirstPerson() ? true : this.f_16195.m_7568(f_16416) && this.f_16205.m_8768();
      }
   }

   private static int m_5675(BufferBuilder var0, Matrix4f var1, float var2, int var3) {
      Vector4f var4 = Class_BftdentXEtGbugJw.m_2298(var3);
      var0.addVertex(var1, -var2, -var2, 0.0F).setUv(0.0F, 0.0F).setColor(var4.x, var4.y, var4.z, var4.w);
      var0.addVertex(var1, -var2, var2, 0.0F).setUv(0.0F, 1.0F).setColor(var4.x, var4.y, var4.z, var4.w);
      var0.addVertex(var1, var2, var2, 0.0F).setUv(1.0F, 1.0F).setColor(var4.x, var4.y, var4.z, var4.w);
      var0.addVertex(var1, var2, -var2, 0.0F).setUv(1.0F, 0.0F).setColor(var4.x, var4.y, var4.z, var4.w);
      return 4;
   }

   private void m_5676(BufferBuilder var1, int var2, RenderPipeline var3, String var4) {
      MeshData var5 = var1.build();
      if (var5 != null) {
         if (var2 == 0) {
            var5.close();
         } else {
            GpuBuffer var6 = null;

            try {
               DrawState var7 = var5.drawState();
               int var8 = var7.indexCount();
               AutoStorageIndexBuffer var9 = RenderSystem.getSequentialBuffer(var7.primitiveTopology());
               GpuBuffer var10 = var9.getBuffer(var8);
               IndexType var11 = var9.type();
               var6 = RenderSystem.getDevice().createBuffer(() -> var4 + "", 32, var5.vertexBuffer());
               RenderTarget var12 = f_11537.gameRenderer.mainRenderTarget();
               CommandEncoder var13 = RenderSystem.getDevice().createCommandEncoder();
               RenderPass var14 = var13.createRenderPass(
                  () -> var4, var12.getColorTextureView(), Optional.empty(), var12.getDepthTextureView(), OptionalDouble.empty()
               );

               try {
                  RenderSystem.bindDefaultUniforms(var14);
                  var14.setPipeline(var3);
                  var14.setVertexBuffer(0, var6.slice());
                  var14.setIndexBuffer(var10, var11);
                  var14.drawIndexed(var8, 1, 0, 0, 0);
               } catch (Throwable var22) {
                  if (var14 != null) {
                     try {
                        var14.close();
                     } catch (Throwable var21) {
                        var22.addSuppressed(var21);
                     }
                  }

                  throw var22;
               }

               if (var14 != null) {
                  var14.close();
               }
            } finally {
               if (var6 != null) {
                  var6.close();
               }

               var5.close();
            }
         }
      }
   }

   private LinkedList<Vec3>[] m_5678(int var1) {
      return this.f_16213.computeIfAbsent(var1, var0 -> {
         LinkedList[] var1x = new LinkedList[5];

         for (int var2 = 0; var2 < var1x.length; var2++) {
            var1x[var2] = new LinkedList();
         }

         return var1x;
      });
   }

   private void m_5680(BufferBuilder var1, int var2) {
      this.m_5676(var1, var2, this.f_16208, f_16419);
   }

   private void m_5683(Matrix4f var1, Vec3 var2, Player var3, float var4, ChinaHat.uDvg2RY38Z22x8A4 var5, float var6, float var7) {
      Vec3 var8 = m_5661(var3, var4);
      var1.translation((float)(var8.x - var2.x), (float)(var8.y - var2.y), (float)(var8.z - var2.z));
      var1.rotate(Axis.YP.rotationDegrees(-var5.bodyYaw));
      if (var5.xRot != 0.0F) {
         var1.rotate(Axis.XP.rotationDegrees(var5.xRot));
      }

      if (var5.swimShift > 0.0F) {
         var1.translate(0.0F, f_16391 * var5.swimShift * var5.scale, f_16392 * var5.swimShift * var5.scale);
      }

      var1.translate(0.0F, var7, 0.0F);
      if (var6 != 0.0F) {
         var1.rotate(Axis.YP.rotation(var6));
      }
   }

   private void m_5684(Class_TZhU50s8XmBQCMP5 var1, float var2, Vec3 var3) {
      int var4 = f_16302;
      int var5 = f_16303;
      PoseStack var6 = var1.m_5006();
      BufferBuilder var7 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.TRIANGLES, DefaultVertexFormat.POSITION_TEX_COLOR_NORMAL);
      BufferBuilder var8 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.TRIANGLES, DefaultVertexFormat.POSITION_TEX_COLOR_NORMAL);
      int var9 = 0;
      int var10 = 0;

      for (Player var12 : f_11537.level.players()) {
         if (this.m_5673(var12)) {
            float var13 = this.m_5650(var6, var3, var12, var2, 0.0F) * f_16304;
            Matrix4f var14 = var6.last().pose();
            this.f_16217.set(var6.last().normal());
            var9 += Class_Iua76IEbeuvyIBtu.m_3153(var7, var14, this.f_16217, var4, var5, 1.0F, var13, var13);
            var10 += Class_Iua76IEbeuvyIBtu.m_3158(var8, var14, this.f_16217, var4, var5, 1.0F, var13, var13);
            var6.popPose();
         }
      }

      this.m_5676(var7, var9, this.f_16211, f_16305);
      this.m_5676(var8, var10, this.f_16212, f_16306);
   }

   private int m_5686(int var1) {
      if (!this.f_16195.m_7568(f_16411) && (!this.m_5690() || !this.f_16206.m_8768())) {
         return this.f_16206.m_8768() ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : this.f_16207.m_8768();
      } else {
         return Class_BftdentXEtGbugJw.m_2304(var1 * 3);
      }
   }

   private void m_5688(PoseStack var1, Vec3 var2, Player var3, float var4, ChinaHat.uDvg2RY38Z22x8A4 var5, float var6, float var7) {
      Vec3 var8 = m_5661(var3, var4);
      var1.translate(var8.x - var2.x, var8.y - var2.y, var8.z - var2.z);
      var1.mulPose(Axis.YP.rotationDegrees(-var5.bodyYaw));
      if (var5.xRot != 0.0F) {
         var1.mulPose(Axis.XP.rotationDegrees(var5.xRot));
      }

      if (var5.swimShift > 0.0F) {
         var1.translate(0.0F, f_16389 * var5.swimShift * var5.scale, f_16390 * var5.swimShift * var5.scale);
      }

      var1.translate(0.0F, var7, 0.0F);
      if (var6 != 0.0F) {
         var1.mulPose(Axis.YP.rotation(var6));
      }
   }

   private int m_5689(BufferBuilder var1, PoseStack var2, Vec3 var3, Player var4, float var5, float var6) {
      float var7 = this.m_5653(var2, var3, var4, var5, var6);
      Matrix4f var8 = var2.last().pose();
      float var9 = this.f_16197.m_8768() * var7;
      float var10 = this.f_16198.m_8768() * var7;
      float var11 = this.f_16201.m_8768();
      int var12 = this.f_16195.m_7568(f_16301) ? this.m_5666(var1, var8, var9, var10, var11) : this.m_5664(var1, var8, var9, var10, var11);
      var2.popPose();
      return var12;
   }

   private boolean m_5690() {
      return this.f_16195.m_7568(f_16412) || this.f_16195.m_7568(f_16413) || this.f_16195.m_7568(f_16414);
   }

   private record uDvg2RY38Z22x8A4(float bodyYaw, float xRot, float swimShift, float scale) {
   }
}
