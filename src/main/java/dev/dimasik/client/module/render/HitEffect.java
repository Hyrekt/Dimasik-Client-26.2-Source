package dev.dimasik.client.module.render;

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
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.MeshData;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.MeshData.DrawState;
import com.mojang.math.Axis;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.module.misc.Optimization;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ColorSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_HtEPOqGrAYrUdumw;
import dev.dimasik.client.system.Class_PoKta0VE7AdhY1En;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_wjdoxQGtI8mFyL6U;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Random;
import net.minecraft.client.Camera;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.client.resources.sounds.SimpleSoundInstance;
import net.minecraft.client.resources.sounds.SoundInstance;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;

public class HitEffect extends Module {
   private static final Identifier f_7249 = Identifier.fromNamespaceAndPath(HitEffect.f_7474, HitEffect.f_7475);
   private static final Identifier f_7250 = Identifier.fromNamespaceAndPath(HitEffect.f_7476, HitEffect.f_7477);
   private static final Identifier f_7251 = Identifier.fromNamespaceAndPath(HitEffect.f_7478, HitEffect.f_7479);
   private static final long f_7252 = 1600L;
   private static final int f_7253 = 32;
   private static final int f_7254 = 32;
   private static final int f_7255 = 32;
   private static final int f_7256 = 32;
   private static final HitEffect.Class_399iGRNv65fmJhMT[] f_7257 = m_2645();
   private static int f_7258;
   private static final float f_7259 = 1.1F;
   private static final double f_7260 = 0.2F;
   private static final double f_7261 = 0.12F;
   private static boolean f_7262;
   private final CheckboxSetting f_7263;
   private final MultiChoiceSetting f_7264;
   private final MultiChoiceSetting f_7265;
   private final SliderSetting f_7266;
   private final SliderSetting f_7267;
   private final SliderSetting f_7268;
   private final SliderSetting f_7269;
   private final SliderSetting f_7270;
   private final SliderSetting f_7271;
   private final SliderSetting f_7272;
   private final CheckboxSetting f_7273;
   private final CheckboxSetting f_7274;
   private final CheckboxSetting f_7275;
   private final CheckboxSetting f_7276;
   private final ColorSetting f_7277;
   private final ColorSetting f_7278;
   private final CheckboxSetting f_7279;
   private final SliderSetting f_7280;
   private final List<HitEffect.CEuJxW8r7Bpk9UkV> f_7281;
   private final List<HitEffect.BKOVsU5Lcv0ENI52> f_7282;
   private final List<HitEffect.mG8E8G79T8jPxNgO> f_7283;
   private final RenderPipeline f_7284;
   private final RenderPipeline f_7285;
   private final RenderPipeline f_7286;
   private final Class_gEPk7yDw6CwIte87<Class_wjdoxQGtI8mFyL6U> f_7287;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_7288;
   private static final String f_7289 = "HitEffect";
   private static final String f_7290 = "Пузырь / сфера / маркер при ударе";
   private static final String f_7291 = "Визуал";
   private static final String f_7292 = "Режим";
   private static final String f_7293 = "Пузырь";
   private static final String f_7294 = "Сфера";
   private static final String f_7295 = "Маркер";
   private static final String f_7296 = "Пропадание";
   private static final String f_7297 = "Альфа";
   private static final String f_7298 = "Разлом";
   private static final String f_7299 = "Сжатие";
   private static final String f_7300 = "Спираль";
   private static final String f_7301 = "Скорость";
   private static final float f_7302 = 0.25F;
   private static final float f_7303 = 3.0F;
   private static final float f_7304 = 0.05F;
   private static final String f_7305 = "Длительность (мс)";
   private static final float f_7306 = 450.0F;
   private static final float f_7307 = 100.0F;
   private static final float f_7308 = 2000.0F;
   private static final float f_7309 = 10.0F;
   private static final String f_7310 = "Размер";
   private static final float f_7311 = 1.25F;
   private static final float f_7312 = 0.3F;
   private static final float f_7313 = 3.0F;
   private static final float f_7314 = 0.05F;
   private static final String f_7315 = "Размер маркера";
   private static final float f_7316 = 0.5F;
   private static final float f_7317 = 0.1F;
   private static final float f_7318 = 0.05F;
   private static final String f_7319 = "Время появления";
   private static final float f_7320 = 100.0F;
   private static final float f_7321 = 50.0F;
   private static final float f_7322 = 500.0F;
   private static final float f_7323 = 10.0F;
   private static final String f_7324 = "Время показа";
   private static final float f_7325 = 300.0F;
   private static final float f_7326 = 100.0F;
   private static final float f_7327 = 1000.0F;
   private static final float f_7328 = 50.0F;
   private static final String f_7329 = "Время исчезновения";
   private static final float f_7330 = 200.0F;
   private static final float f_7331 = 50.0F;
   private static final float f_7332 = 500.0F;
   private static final float f_7333 = 10.0F;
   private static final String f_7334 = "Масштаб-анимация";
   private static final String f_7335 = "Свечение";
   private static final String f_7336 = "Больше эффектов";
   private static final String f_7337 = "Авто цвет под тему";
   private static final String f_7338 = "Цвет";
   private static final int f_7339 = -10962689;
   private static final String f_7340 = "Цвет 2";
   private static final int f_7341 = -12829441;
   private static final String f_7342 = "Звук";
   private static final String f_7343 = "Громкость";
   private static final float f_7344 = 0.4F;
   private static final float f_7345 = 0.1F;
   private static final float f_7346 = 0.05F;
   private static final String f_7347 = "dimasik/hit_effect";
   private static final String f_7348 = "dead_chams";
   private static final String f_7349 = "dead_chams";
   private static final String f_7350 = "Sampler0";
   private static final String f_7351 = "dimasik/hit_marker";
   private static final String f_7352 = "dead_chams";
   private static final String f_7353 = "dead_chams";
   private static final String f_7354 = "Sampler0";
   private static final String f_7355 = "dimasik/hit_sphere";
   private static final String f_7356 = "hit_sphere";
   private static final String f_7357 = "hit_sphere";
   private static final String f_7358 = "HitSphere";
   private static final String f_7359 = "Сфера";
   private static final double f_7360 = 1.55;
   private static final double f_7361 = 2.25;
   private static final String f_7362 = "Маркер";
   private static final double f_7363 = 360.0;
   private static final float f_7364 = 1.1F;
   private static final double f_7365 = 0.2F;
   private static final double f_7366 = 0.12F;
   private static final String f_7367 = "minecraft";
   private static final String f_7368 = "entity.player.attack";
   private static final float f_7369 = 0.8F;
   private static final float f_7370 = 1100.0F;
   private static final float f_7371 = 750.0F;
   private static final float f_7372 = 450.0F;
   private static final float f_7373 = 0.05F;
   private static final float f_7374 = 80.0F;
   private static final double f_7375 = 1.0E-4;
   private static final double f_7376 = 1.0E-4;
   private static final String f_7377 = "Сфера";
   private static final String f_7378 = "Маркер";
   private static final double f_7379 = 2.0;
   private static final double f_7380 = 6.0;
   private static final float f_7381 = 0.01F;
   private static final float f_7382 = 1600.0F;
   private static final float f_7383 = 0.22F;
   private static final float f_7384 = 0.225F;
   private static final float f_7385 = 0.4F;
   private static final float f_7386 = 3.0F;
   private static final float f_7387 = 0.02F;
   private static final float f_7388 = 1.55F;
   private static final float f_7389 = 1.5F;
   private static final float f_7390 = -210.0F;
   private static final float f_7391 = 0.5F;
   private static final float f_7392 = 0.5F;
   private static final String f_7393 = "Альфа";
   private static final long f_7394 = 100000L;
   private static final float f_7395 = 1000.0F;
   private static final float f_7396 = 0.15F;
   private static final float f_7397 = 0.15F;
   private static final float f_7398 = 0.15F;
   private static final float f_7399 = 0.85F;
   private static final float f_7400 = 0.01F;
   private static final float f_7401 = 0.15F;
   private static final float f_7402 = 0.15F;
   private static final float f_7403 = 0.85F;
   private static final double f_7404 = 0.4;
   private static final double f_7405 = 1.2;
   private static final double f_7406 = 0.5;
   private static final String f_7407 = "Разлом";
   private static final float f_7408 = 0.15F;
   private static final float f_7409 = 0.65F;
   private static final float f_7410 = 0.65F;
   private static final float f_7411 = 0.35F;
   private static final String f_7412 = "Сжатие";
   private static final String f_7413 = "Спираль";
   private static final double f_7414 = 0.85;
   private static final double f_7415 = 720.0;
   private static final double f_7416 = 2.0;
   private static final double f_7417 = 0.32;
   private static final double f_7418 = 1.8;
   private static final float f_7419 = 0.5F;
   private static final float f_7420 = 0.5F;
   private static final double f_7421 = 0.18;
   private static final double f_7422 = 0.6;
   private static final double f_7423 = 0.5;
   private static final float f_7424 = 0.35F;
   private static final float f_7425 = 0.8F;
   private static final long f_7426 = 3600L;
   private static final float f_7427 = 3600.0F;
   private static final float f_7428 = 360.0F;
   private static final double f_7429 = 1.35;
   private static final double f_7430 = 0.22;
   private static final double f_7431 = 60.0;
   private static final double f_7432 = 37.0;
   private static final String f_7433 = "Разлом";
   private static final String f_7434 = "Сжатие";
   private static final String f_7435 = "Спираль";
   private static final float f_7436 = 3.0F;
   private static final double f_7437 = 1.15;
   private static final String f_7438 = "Пузырь";
   private static final String f_7439 = "Сфера";
   private static final float f_7440 = 300.0F;
   private static final float f_7441 = 0.05F;
   private static final float f_7442 = 0.5F;
   private static final float f_7443 = 0.5F;
   private static final float f_7444 = 0.5F;
   private static final String f_7445 = "HitSphere";
   private static final String f_7446 = "Sampler0";
   private static final float f_7447 = 1.70158F;
   private static final double f_7448 = 3.0;
   private static final double f_7449 = 2.0;
   private static final long f_7450 = 48879L;
   private static final float f_7451 = 0.5F;
   private static final float f_7452 = 0.65F;
   private static final float f_7453 = 0.5F;
   private static final float f_7454 = 0.65F;
   private static final float f_7455 = 4.0F;
   private static final float f_7456 = 4.0F;
   private static final float f_7457 = 0.5F;
   private static final String f_7458 = "hitEffect";
   private static final String f_7459 = "hitSpheres";
   private static final float f_7460 = 1600.0F;
   private static final String f_7461 = "Пузырь";
   private static final String f_7462 = "Сфера";
   private static final String f_7463 = "Сфера";
   private static final String f_7464 = "Маркер";
   private static final String f_7465 = "Маркер";
   private static final String f_7466 = "Маркер";
   private static final String f_7467 = "Маркер";
   private static final String f_7468 = "Маркер";
   private static final String f_7469 = "Маркер";
   private static final String f_7470 = "Сфера";
   private static final String f_7471 = "Сфера";
   private static final String f_7472 = "Сфера";
   private static final String f_7473 = "Сфера";
   private static final String f_7474 = "dimasik";
   private static final String f_7475 = "images/hiteffect/bubble.png";
   private static final String f_7476 = "dimasik";
   private static final String f_7477 = "images/particles/bloom.png";
   private static final String f_7478 = "dimasik";
   private static final String f_7479 = "images/hiteffect/marker.png";

   public HitEffect() {
      super(f_7289, f_7290, Category.RENDER);
      this.f_7263 = new CheckboxSetting(f_7291, true);
      this.f_7264 = new MultiChoiceSetting(f_7292, new Class_2ZaVm8TGDJ68TnJB(f_7293), new Class_2ZaVm8TGDJ68TnJB(f_7294), new Class_2ZaVm8TGDJ68TnJB(f_7295))
         .m_822(this.f_7263::m_8768);
      this.f_7265 = new MultiChoiceSetting(
            f_7296,
            new Class_2ZaVm8TGDJ68TnJB(f_7297),
            new Class_2ZaVm8TGDJ68TnJB(f_7298),
            new Class_2ZaVm8TGDJ68TnJB(f_7299),
            new Class_2ZaVm8TGDJ68TnJB(f_7300)
         )
         .m_822(() -> this.f_7263.m_8768() && this.f_7264.m_7568(f_7473));
      this.f_7266 = new SliderSetting(f_7301, 1.0F, f_7302, f_7303).m_828(f_7304).m_822(() -> this.f_7263.m_8768() && this.f_7264.m_7568(f_7472));
      this.f_7267 = new SliderSetting(f_7305, f_7306, f_7307, f_7308).m_828(f_7309).m_822(() -> this.f_7263.m_8768() && this.f_7264.m_7568(f_7471));
      this.f_7268 = new SliderSetting(f_7310, f_7311, f_7312, f_7313).m_828(f_7314).m_822(() -> this.f_7263.m_8768() && this.f_7264.m_7568(f_7470));
      this.f_7269 = new SliderSetting(f_7315, f_7316, f_7317, 2.0F).m_828(f_7318).m_822(() -> this.f_7263.m_8768() && this.f_7264.m_7568(f_7469));
      this.f_7270 = new SliderSetting(f_7319, f_7320, f_7321, f_7322).m_828(f_7323).m_822(() -> this.f_7263.m_8768() && this.f_7264.m_7568(f_7468));
      this.f_7271 = new SliderSetting(f_7324, f_7325, f_7326, f_7327).m_828(f_7328).m_822(() -> this.f_7263.m_8768() && this.f_7264.m_7568(f_7467));
      this.f_7272 = new SliderSetting(f_7329, f_7330, f_7331, f_7332).m_828(f_7333).m_822(() -> this.f_7263.m_8768() && this.f_7264.m_7568(f_7466));
      this.f_7273 = new CheckboxSetting(f_7334, true).m_822(() -> this.f_7263.m_8768() && this.f_7264.m_7568(f_7465));
      this.f_7274 = new CheckboxSetting(f_7335, true).m_822(() -> this.f_7263.m_8768() && this.f_7264.m_7568(f_7464));
      this.f_7275 = new CheckboxSetting(f_7336, true).m_822(() -> this.f_7263.m_8768() && this.f_7264.m_7568(f_7463));
      this.f_7276 = new CheckboxSetting(f_7337, true).m_822(this.f_7263::m_8768);
      this.f_7277 = new ColorSetting(f_7338, false, f_7339).m_822(() -> this.f_7263.m_8768() && !this.f_7276.m_8768());
      this.f_7278 = new ColorSetting(f_7340, false, f_7341)
         .m_822(() -> this.f_7263.m_8768() && !this.f_7276.m_8768() && (this.f_7264.m_7568(f_7461) || this.f_7264.m_7568(f_7462)));
      this.f_7279 = new CheckboxSetting(f_7342, true);
      this.f_7280 = new SliderSetting(f_7343, f_7344, f_7345, 1.0F).m_828(f_7346).m_822(this.f_7279::m_8768);
      this.f_7281 = new ArrayList<>();
      this.f_7282 = new ArrayList<>();
      this.f_7283 = new ArrayList<>();
      this.f_7284 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_7347)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_7348))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_7349))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.ADDITIVE)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2741(f_7350)
         .m_2722();
      this.f_7285 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_7351)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_7352))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_7353))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2741(f_7354)
         .m_2722();
      this.f_7286 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_7355)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_7356))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_7357))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.ADDITIVE)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2729(f_7358, UniformType.UNIFORM_BUFFER)
         .m_2722();
      this.f_7287 = this::m_2643;
      this.f_7288 = this::m_2614;
      this.m_795(
         this.f_7263,
         this.f_7264,
         this.f_7265,
         this.f_7266,
         this.f_7267,
         this.f_7268,
         this.f_7269,
         this.f_7270,
         this.f_7271,
         this.f_7272,
         this.f_7273,
         this.f_7274,
         this.f_7275,
         this.f_7276,
         this.f_7277,
         this.f_7278,
         this.f_7279,
         this.f_7280
      );
   }

   private static float m_2599(float var0) {
      float var1 = Mth.clamp(var0, 0.0F, 1.0F);
      float var2 = f_7447;
      float var3 = var2 + 1.0F;
      return 1.0F + var3 * (float)Math.pow(var1 - 1.0F, f_7448) + var2 * (float)Math.pow(var1 - 1.0F, f_7449);
   }

   private Vec3 m_2600(LivingEntity var1, Vec3 var2) {
      Vec3 var3 = var2.subtract(new Vec3(var1.getX(), var1.getY(), var1.getZ()));
      var3 = new Vec3(var3.x, 0.0, var3.z);
      if (var3.lengthSqr() < f_7375) {
         Vec3 var4 = var1.getLookAngle();
         var3 = new Vec3(var4.x, 0.0, var4.z);
      }

      if (var3.lengthSqr() < f_7376) {
         var3 = new Vec3(0.0, 0.0, 1.0);
      }

      return var3.normalize();
   }

   private static float m_2601(float var0) {
      return var0 * var0 * var0;
   }

   private void m_2602(Class_TZhU50s8XmBQCMP5 var1) {
      if (!this.f_7281.isEmpty()) {
         Camera var2 = f_11537.gameRenderer.mainCamera();
         Vec3 var3 = var2.position();
         PoseStack var4 = var1.m_5006();
         long var5 = System.currentTimeMillis();
         BufferBuilder var7 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
         byte var8 = 0;

         for (HitEffect.CEuJxW8r7Bpk9UkV var10 : this.f_7281) {
            float var11 = (float)(var5 - var10.spawnTime) / f_7382;
            if (!(var11 >= 1.0F)) {
               float var12 = Math.max(0.0F, Math.min(1.0F, var11 / f_7383));
               float var13 = Math.max(0.0F, Math.min(1.0F, (var11 - f_7384) / f_7385));
               float var14 = var12 * var12 * (f_7386 - 2.0F * var12);
               float var15 = 1.0F - var13 * var13;
               float var16 = f_7387 + f_7388 * var14 * var15;
               float var17 = 1.0F - var13 * var13 * var13;
               float var18 = (float)(var5 - var10.spawnTime) / f_7389 + var10.spinSeed;
               Vec3 var19 = var10.pos.subtract(var3);
               int var20 = Class_BftdentXEtGbugJw.m_2306(this.m_2634(0), var17);
               var4.pushPose();
               var4.translate(var19.x, var19.y, var19.z);
               var4.mulPose(Axis.YP.rotationDegrees(var10.sideYaw));
               var4.mulPose(Axis.XP.rotationDegrees(f_7390));
               var4.mulPose(Axis.ZP.rotationDegrees(var18));
               float var21 = -var16 * f_7391;
               float var22 = -var16 * f_7392;
               Matrix4f var23 = var4.last().pose();
               Vector4f var24 = Class_BftdentXEtGbugJw.m_2298(var20);
               var7.addVertex(var23, var21, var22, 0.0F).setUv(0.0F, 0.0F).setColor(var24.x, var24.y, var24.z, var24.w);
               var7.addVertex(var23, var21, var22 + var16, 0.0F).setUv(0.0F, 1.0F).setColor(var24.x, var24.y, var24.z, var24.w);
               var7.addVertex(var23, var21 + var16, var22 + var16, 0.0F).setUv(1.0F, 1.0F).setColor(var24.x, var24.y, var24.z, var24.w);
               var7.addVertex(var23, var21 + var16, var22, 0.0F).setUv(1.0F, 0.0F).setColor(var24.x, var24.y, var24.z, var24.w);
               var8 += 4;
               var4.popPose();
            }
         }

         this.m_2615(var7, f_7249, var8);
         this.f_7281.removeIf(var2x -> (float)(var5 - var2x.spawnTime) / f_7460 >= 1.0F);
      }
   }

   public static boolean m_2604(SoundEvent var0) {
      return !f_7262 && var0 != null ? m_2636(var0.location()) : false;
   }

   private static Vec3 m_2607(Entity var0, float var1) {
      return new Vec3(Mth.lerp(var1, var0.xo, var0.getX()), Mth.lerp(var1, var0.yo, var0.getY()), Mth.lerp(var1, var0.zo, var0.getZ()));
   }

   private int m_2608(BufferBuilder var1, Matrix4f var2, Vec3 var3, Vec3 var4, Vec3 var5, double var6, int var8) {
      double var9 = var6 * f_7437;
      Vec3 var11 = var4.scale(var9);
      Vec3 var12 = var5.scale(var9);
      Vec3 var13 = var3.subtract(var11).subtract(var12);
      Vec3 var14 = var3.add(var11).subtract(var12);
      Vec3 var15 = var3.add(var11).add(var12);
      Vec3 var16 = var3.subtract(var11).add(var12);
      Vector4f var17 = Class_BftdentXEtGbugJw.m_2298(var8);
      this.m_2637(var1, var2, (float)var13.x, (float)var13.y, (float)var13.z, 0.0F, 1.0F, var17);
      this.m_2637(var1, var2, (float)var14.x, (float)var14.y, (float)var14.z, 1.0F, 1.0F, var17);
      this.m_2637(var1, var2, (float)var15.x, (float)var15.y, (float)var15.z, 1.0F, 0.0F, var17);
      this.m_2637(var1, var2, (float)var16.x, (float)var16.y, (float)var16.z, 0.0F, 0.0F, var17);
      return 4;
   }

   @Override
   public void m_732() {
      this.f_7281.clear();
      this.f_7282.clear();
      this.f_7283.clear();
   }

   private int m_2612(BufferBuilder var1, Matrix4f var2, Vec3 var3, Vec3 var4, Vec3 var5, double var6, int var8) {
      Vec3 var9 = var4.scale(var6);
      Vec3 var10 = var5.scale(var6);
      Vec3 var11 = var3.subtract(var9).subtract(var10);
      Vec3 var12 = var3.add(var9).subtract(var10);
      Vec3 var13 = var3.add(var9).add(var10);
      Vec3 var14 = var3.subtract(var9).add(var10);
      Vector4f var15 = Class_BftdentXEtGbugJw.m_2298(var8);
      this.m_2637(var1, var2, (float)var11.x, (float)var11.y, (float)var11.z, 0.0F, 1.0F, var15);
      this.m_2637(var1, var2, (float)var12.x, (float)var12.y, (float)var12.z, 1.0F, 1.0F, var15);
      this.m_2637(var1, var2, (float)var13.x, (float)var13.y, (float)var13.z, 1.0F, 0.0F, var15);
      this.m_2637(var1, var2, (float)var14.x, (float)var14.y, (float)var14.z, 0.0F, 0.0F, var15);
      return 4;
   }

   private void m_2613(Class_TZhU50s8XmBQCMP5 var1) {
      if (!this.f_7282.isEmpty()) {
         Camera var2 = f_11537.gameRenderer.mainCamera();
         Vec3 var3 = var2.position();
         Quaternionf var4 = var2.rotation();
         Vector3f var5 = new Vector3f(1.0F, 0.0F, 0.0F).rotate(var4);
         Vector3f var6 = new Vector3f(0.0F, 1.0F, 0.0F).rotate(var4);
         Vec3 var7 = new Vec3(var5.x, var5.y, var5.z);
         Vec3 var8 = new Vec3(var6.x, var6.y, var6.z);
         Matrix4f var9 = var1.m_5006().last().pose();
         long var10 = System.currentTimeMillis();
         String var12 = this.f_7265.m_7564() == null ? f_7393 : this.f_7265.m_7564().m_1181();
         float var13 = m_2620(var12);
         float var14 = (float)(var10 % f_7394) / f_7395;
         BufferBuilder var15 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
         ArrayList var16 = new ArrayList(this.f_7282.size());
         ArrayList var17 = new ArrayList(this.f_7282.size());
         int var18 = 0;
         Iterator var19 = this.f_7282.iterator();

         while (var19.hasNext()) {
            HitEffect.BKOVsU5Lcv0ENI52 var20 = (HitEffect.BKOVsU5Lcv0ENI52)var19.next();
            float var21 = Math.min(1.0F, (float)(var10 - var20.f_7240) / var20.f_7238);
            if (var21 >= 1.0F) {
               var19.remove();
            } else {
               float var22 = var21 < f_7396 ? var21 / f_7397 : 1.0F - (var21 - f_7398) / f_7399;
               var22 = Mth.clamp(var22, 0.0F, 1.0F);
               var22 *= var22;
               if (!(var22 <= f_7400)) {
                  float var23 = var21 > f_7401 ? (var21 - f_7402) / f_7403 : 0.0F;
                  double var24 = (f_7404 + var21 * f_7405) * this.f_7268.m_8768().floatValue();
                  double var26 = var24 * f_7406;
                  float var28 = var22;
                  double var29 = var26;
                  boolean var31 = false;
                  float var32 = 0.0F;
                  Vec3 var33 = var7;
                  Vec3 var34 = var8;
                  if (var12.equals(f_7407)) {
                     float var35 = Math.min(1.0F, var21 / f_7408);
                     if (var21 < f_7409) {
                        var28 = var35;
                     } else {
                        var32 = (var21 - f_7410) / f_7411;
                        var28 = (1.0F - var32) * (1.0F - var32);
                        var31 = true;
                     }
                  } else if (var23 > 0.0F) {
                     if (var12.equals(f_7412)) {
                        var29 = var26 * (1.0 - var23);
                     } else if (var12.equals(f_7413)) {
                        var29 = var26 * (1.0 - var23 * f_7414);
                        double var70 = var23 * var23 * Math.toRadians(f_7415);
                        double var37 = Math.cos(var70);
                        double var39 = Math.sin(var70);
                        var33 = var7.scale(var37).add(var8.scale(var39));
                        var34 = var7.scale(-var39).add(var8.scale(var37));
                     }
                  }

                  Vec3 var71 = var20.f_7237.subtract(var3);
                  int var36 = this.m_2634(var20.f_7239 * 40);
                  int var72 = 0;
                  if (var31) {
                     double var38 = f_7416 * var29;
                     double var40 = var29 * f_7417;
                     double var42 = var32 * var32 * f_7418;
                     Vec3 var44 = new Vec3(0.0, -var42, 0.0);

                     for (HitEffect.Class_399iGRNv65fmJhMT var48 : f_7257) {
                        double var49 = var48.cv - f_7419;
                        double var51 = var48.cu - f_7420;
                        double var53 = var48.spin * f_7421 * var32;
                        Vec3 var55 = var71.add(var7.scale(var49 * var38 + var53)).add(var8.scale(var51 * var38)).add(var44);
                        double var56 = var40 * (f_7422 + f_7423 * Math.abs(var48.spin));
                        float var58 = var28 * (1.0F - var32 * f_7424);
                        var72 += this.m_2608(var15, var9, var55, var33, var34, var56, Class_BftdentXEtGbugJw.m_2306(var36, var58));
                     }
                  } else {
                     var72 += this.m_2608(var15, var9, var71, var33, var34, var29, Class_BftdentXEtGbugJw.m_2306(var36, var28));
                  }

                  int var73 = var72 / 4 * 6;
                  Vector4f var74 = Class_BftdentXEtGbugJw.m_2298(var36);
                  MemoryStack var75 = MemoryStack.stackPush();

                  try {
                     ByteBuffer var41 = Std140Builder.onStack(var75, 32)
                        .putVec4(var21, var28, var13, var14 + var20.f_7239)
                        .putVec4(var74.x, var74.y, var74.z, var32)
                        .get();
                     var16.add(new HitEffect.Class_7SyA1R7CcCH9c3XH(var18, var73, Class_HtEPOqGrAYrUdumw.m_2945(var41)));
                  } catch (Throwable var60) {
                     if (var75 != null) {
                        try {
                           var75.close();
                        } catch (Throwable var59) {
                           var60.addSuppressed(var59);
                        }
                     }

                     throw var60;
                  }

                  if (var75 != null) {
                     var75.close();
                  }

                  var18 += var73;
                  if (this.f_7275.m_8768() && !var31) {
                     var17.add(new HitEffect.Class_50hPkcSDwZ0LExRp(var71, var29, Class_BftdentXEtGbugJw.m_2306(var36, var28 * f_7425), var20.f_7239));
                  }
               }
            }
         }

         this.m_2629(var15, var16);
         if (!var17.isEmpty()) {
            BufferBuilder var61 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
            int var62 = 0;
            float var65 = (float)(var10 % f_7426) / f_7427 * f_7428;

            for (HitEffect.Class_50hPkcSDwZ0LExRp var67 : (Iterable<HitEffect.Class_50hPkcSDwZ0LExRp>) (Iterable) var17) {
               double var25 = var67.halfSize * f_7429;
               double var27 = var67.halfSize * f_7430;

               for (int var68 = 0; var68 < 6; var68++) {
                  double var30 = Math.toRadians(var65 + var68 * f_7431 + var67.seed * f_7432);
                  Vec3 var69 = var67.center.add(var7.scale(Math.cos(var30) * var25)).add(var8.scale(Math.sin(var30) * var25));
                  var62 += this.m_2612(var61, var9, var69, var7, var8, var27, var67.color);
               }
            }

            this.m_2615(var61, f_7250, var62);
         }
      }
   }

   private void m_2614(Class_TZhU50s8XmBQCMP5 var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (!this.f_7263.m_8768()) {
            this.f_7281.clear();
            this.f_7282.clear();
            this.f_7283.clear();
         } else if (!this.f_7281.isEmpty() || !this.f_7282.isEmpty() || !this.f_7283.isEmpty()) {
            Vec3 var2 = f_11537.gameRenderer.mainCamera().position();
            double var3 = Optimization.m_5851(Double.POSITIVE_INFINITY);
            if (Double.isFinite(var3)) {
               this.f_7281.removeIf(var3x -> var3x.pos.distanceToSqr(var2) > var3);
               this.f_7282.removeIf(var3x -> var3x.f_7237.distanceToSqr(var2) > var3);
               this.f_7283.removeIf(var3x -> var3x.f_7241.distanceToSqr(var2) > var3);
            }

            int var5 = Optimization.m_5843(32);
            int var6 = Optimization.m_5843(32);
            int var7 = Optimization.m_5843(32);

            while (this.f_7281.size() > var5) {
               this.f_7281.removeFirst();
            }

            while (this.f_7282.size() > var6) {
               this.f_7282.removeFirst();
            }

            while (this.f_7283.size() > var7) {
               this.f_7283.removeFirst();
            }

            if (this.f_7264.m_7568(f_7377)) {
               this.f_7281.clear();
               this.f_7283.clear();
               this.m_2613(var1);
            } else if (this.f_7264.m_7568(f_7378)) {
               this.f_7281.clear();
               this.f_7282.clear();
               this.m_2640(var1);
            } else {
               this.f_7282.clear();
               this.f_7283.clear();
               this.m_2602(var1);
            }
         }
      }
   }

   private void m_2615(BufferBuilder var1, Identifier var2, int var3) {
      this.m_2630(var1, var2, var3, this.f_7284, true);
   }

   private int m_2617(
      BufferBuilder var1, PoseStack var2, double var3, double var5, double var7, float var9, float var10, float var11, float var12, float var13, int var14
   ) {
      return this.m_2644(var1, var2, var3, var5, var7, var9, var10, var11, var12, var13, var14, var14, var14, var14);
   }

   private boolean m_2619() {
      return f_11537.player == null
         ? false
         : f_11537.player.fallDistance > 0.0
            && !f_11537.player.onGround()
            && !f_11537.player.onClimbable()
            && !f_11537.player.isInWater()
            && !f_11537.player.hasEffect(MobEffects.BLINDNESS)
            && !f_11537.player.isPassenger();
   }

   private static float m_2620(String var0) {
      return switch (var0) {
         case f_7433 -> 1.0F;
         case f_7434 -> 2.0F;
         case f_7435 -> f_7436;
         default -> 0.0F;
      };
   }

   private static float m_2624(float var0) {
      float var1 = 1.0F - var0;
      return 1.0F - var1 * var1 * var1;
   }

   private Vec3 m_2625(Entity var1, Entity var2) {
      Vec3 var3 = new Vec3(var2.getX(), var2.getY() + var2.getBbHeight() / f_7379, var2.getZ());
      if (var1 == null) {
         return var3;
      }

      Vec3 var4 = var1.getEyePosition(1.0F);
      Vec3 var5 = var1.getViewVector(1.0F);
      Vec3 var6 = var2.getBoundingBox().getCenter();
      double var7 = Math.max(var4.distanceTo(var6) + 1.0, f_7380);
      Vec3 var9 = var4.add(var5.scale(var7));
      return var2.getBoundingBox().clip(var4, var9).orElse(var4.add(var5.scale(var4.distanceTo(var6))));
   }

   public static boolean m_2628(SoundInstance var0) {
      return !f_7262 && var0 != null ? m_2636(var0.getIdentifier()) : false;
   }

   private void m_2629(BufferBuilder var1, List<HitEffect.Class_7SyA1R7CcCH9c3XH> var2) {
      MeshData var3 = var1.build();
      if (var3 != null) {
         MeshData var4 = var3;

         label72: {
            try {
               if (var2.isEmpty()) {
                  break label72;
               }

               DrawState var5 = var3.drawState();
               AutoStorageIndexBuffer var6 = RenderSystem.getSequentialBuffer(var5.primitiveTopology());
               GpuBuffer var7 = var6.getBuffer(var5.indexCount());
               GpuBufferSlice var8 = Class_HtEPOqGrAYrUdumw.m_2944(var3.vertexBuffer(), var5.format().getVertexSize());
               RenderTarget var9 = f_11537.gameRenderer.mainRenderTarget();
               CommandEncoder var10 = RenderSystem.getDevice().createCommandEncoder();
               RenderPass var11 = var10.createRenderPass(
                  () -> f_7459, var9.getColorTextureView(), Optional.empty(), var9.getDepthTextureView(), OptionalDouble.empty()
               );

               try {
                  RenderSystem.bindDefaultUniforms(var11);
                  var11.setPipeline(this.f_7286);
                  var11.setVertexBuffer(0, var8);
                  var11.setIndexBuffer(var7, var6.type());

                  for (HitEffect.Class_7SyA1R7CcCH9c3XH var13 : var2) {
                     var11.setUniform(f_7445, var13.uniforms);
                     var11.drawIndexed(var13.indexCount, 1, var13.firstIndex, 0, 0);
                  }
               } catch (Throwable var16) {
                  if (var11 != null) {
                     try {
                        var11.close();
                     } catch (Throwable var15) {
                        var16.addSuppressed(var15);
                     }
                  }

                  throw var16;
               }

               if (var11 != null) {
                  var11.close();
               }
            } catch (Throwable var17) {
               if (var4 != null) {
                  try {
                     var4.close();
                  } catch (Throwable var14) {
                     var17.addSuppressed(var14);
                  }
               }

               throw var17;
            }

            if (var4 != null) {
               var4.close();
            }

            return;
         }

         if (var4 != null) {
            var4.close();
         }
      }
   }

   private void m_2630(BufferBuilder var1, Identifier var2, int var3, RenderPipeline var4, boolean var5) {
      MeshData var6 = var1.build();
      if (var6 != null) {
         if (var3 == 0) {
            var6.close();
         } else {
            try {
               DrawState var7 = var6.drawState();
               int var8 = var7.indexCount();
               AutoStorageIndexBuffer var9 = RenderSystem.getSequentialBuffer(var7.primitiveTopology());
               GpuBuffer var10 = var9.getBuffer(var8);
               IndexType var11 = var9.type();
               GpuBufferSlice var12 = Class_HtEPOqGrAYrUdumw.m_2944(var6.vertexBuffer(), var7.format().getVertexSize());
               RenderTarget var13 = f_11537.gameRenderer.mainRenderTarget();
               CommandEncoder var14 = RenderSystem.getDevice().createCommandEncoder();
               AbstractTexture var15 = var5 && var2 != null ? f_11537.getTextureManager().getTexture(var2) : null;
               RenderPass var16 = var14.createRenderPass(
                  () -> f_7458, var13.getColorTextureView(), Optional.empty(), var13.getDepthTextureView(), OptionalDouble.empty()
               );

               try {
                  RenderSystem.bindDefaultUniforms(var16);
                  var16.setPipeline(var4);
                  if (var15 != null) {
                     var16.bindTexture(f_7446, var15.getTextureView(), var15.getSampler());
                  }

                  var16.setVertexBuffer(0, var12);
                  var16.setIndexBuffer(var10, var11);
                  var16.drawIndexed(var8, 1, 0, 0, 0);
               } catch (Throwable var24) {
                  if (var16 != null) {
                     try {
                        var16.close();
                     } catch (Throwable var23) {
                        var24.addSuppressed(var23);
                     }
                  }

                  throw var24;
               }

               if (var16 != null) {
                  var16.close();
               }
            } finally {
               var6.close();
            }
         }
      }
   }

   @Override
   public void m_778() {
      this.f_7281.clear();
      this.f_7282.clear();
      this.f_7283.clear();
   }

   private float m_2631() {
      float var1 = f_11537.player == null ? 1.0F : f_11537.player.getAttackStrengthScale(0.0F);
      float var2 = var1 > f_7369 ? f_7370 : f_7371;
      return Math.max(var2 * (this.f_7267.m_8768() / f_7372) / Math.max(this.f_7266.m_8768(), f_7373), f_7374);
   }

   private int m_2634(int var1) {
      if (this.f_7276.m_8768()) {
         return Class_BftdentXEtGbugJw.m_2304(var1 / 16);
      } else {
         return !this.f_7264.m_7568(f_7438) && !this.f_7264.m_7568(f_7439)
            ? this.f_7277.m_8768()
            : Class_BftdentXEtGbugJw.m_2302(
               this.f_7277.m_8768(), this.f_7278.m_8768(), (Mth.sin((float)System.currentTimeMillis() / f_7440 + var1 * f_7441) + 1.0F) * f_7442
            );
      }
   }

   private static boolean m_2636(Identifier var0) {
      if (var0 != null && f_7367.equals(var0.getNamespace()) && var0.getPath().startsWith(f_7368)) {
         try {
            HitEffect var1 = DimasikClient.m_9057().m_9049().m_2801().m_3422();
            return var1 != null && var1.m_776() && var1.f_7279.m_8768();
         } catch (Throwable var2) {
            return false;
         }
      } else {
         return false;
      }
   }

   private void m_2637(BufferBuilder var1, Matrix4f var2, float var3, float var4, float var5, float var6, float var7, Vector4f var8) {
      var1.addVertex(var2, var3, var4, var5).setUv(var6, var7).setColor(var8.x, var8.y, var8.z, var8.w);
   }

   private void m_2640(Class_TZhU50s8XmBQCMP5 var1) {
      if (!this.f_7283.isEmpty()) {
         long var2 = System.currentTimeMillis();
         Camera var4 = f_11537.gameRenderer.mainCamera();
         Vec3 var5 = var4.position();
         PoseStack var6 = var1.m_5006();
         BufferBuilder var7 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
         int var8 = 0;
         Iterator var9 = this.f_7283.iterator();

         while (var9.hasNext()) {
            HitEffect.mG8E8G79T8jPxNgO var10 = (HitEffect.mG8E8G79T8jPxNgO)var9.next();
            if (var10.m_2596(var2)) {
               var9.remove();
            } else {
               float var11 = var10.m_2597(var2);
               if (!(var11 <= f_7381)) {
                  float var12 = this.f_7269.m_8768();
                  if (this.f_7273.m_8768()) {
                     var12 *= var10.m_2598(var2);
                  }

                  double var13 = var10.f_7241.x - var5.x;
                  double var15 = var10.f_7241.y - var5.y;
                  double var17 = var10.f_7241.z - var5.z;
                  int var19 = Class_BftdentXEtGbugJw.m_2306(this.m_2634(0), var11);
                  var8 += this.m_2617(var7, var6, var13, var15, var17, var12, var12, var4.yRot(), var4.xRot(), 0.0F, var19);
               }
            }
         }

         this.m_2630(var7, f_7251, var8, this.f_7274.m_8768() ? this.f_7284 : this.f_7285, true);
      }
   }

   private void m_2641() {
      if (this.f_7279.m_8768() && f_11537.player != null && f_11537.getSoundManager() != null) {
         boolean var1 = this.m_2619();
         float var2 = var1 ? f_7364 + (float)(Math.random() * f_7365) : 1.0F + (float)(Math.random() * f_7366);
         SoundEvent var3 = var1 ? SoundEvents.PLAYER_ATTACK_CRIT : SoundEvents.PLAYER_ATTACK_STRONG;
         f_7262 = true;

         try {
            f_11537.getSoundManager()
               .play(
                  new SimpleSoundInstance(
                     var3,
                     SoundSource.PLAYERS,
                     this.f_7280.m_8768(),
                     var2,
                     f_11537.player.getRandom(),
                     f_11537.player.getX(),
                     f_11537.player.getY(),
                     f_11537.player.getZ()
                  )
               );
         } finally {
            f_7262 = false;
         }
      }
   }

   private void m_2643(Class_wjdoxQGtI8mFyL6U var1) {
      if (this.m_776() && f_11537.player != null && f_11537.level != null) {
         if (var1.m_9372() == Class_wjdoxQGtI8mFyL6U.Class_327mRdjAqNoPaemJ.POST && var1.m_9371() == f_11537.player) {
            if (var1.m_9370() instanceof LivingEntity var3 && var3.isAlive()) {
               this.m_2641();
               if (this.f_7263.m_8768()) {
                  if (this.f_7264.m_7568(f_7359)) {
                     float var9 = f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true);
                     Vec3 var10 = m_2607(var3, var9).add(0.0, var3.getBbHeight() / f_7360 / (var3.isBaby() ? f_7361 : 1.0), 0.0);
                     if (Optimization.m_5849(var10.x, var10.y, var10.z)) {
                        this.f_7282.add(new HitEffect.BKOVsU5Lcv0ENI52(var10, this.m_2631()));

                        while (this.f_7282.size() > Optimization.m_5843(32)) {
                           this.f_7282.removeFirst();
                        }
                     }
                  } else if (this.f_7264.m_7568(f_7362)) {
                     Vec3 var8 = this.m_2625(var1.m_9371(), var3);
                     if (Optimization.m_5849(var8.x, var8.y, var8.z)) {
                        this.f_7283
                           .add(
                              new HitEffect.mG8E8G79T8jPxNgO(
                                 var8,
                                 System.currentTimeMillis(),
                                 this.f_7270.m_8768().longValue(),
                                 this.f_7271.m_8768().longValue(),
                                 this.f_7272.m_8768().longValue()
                              )
                           );

                        while (this.f_7283.size() > Optimization.m_5843(32)) {
                           this.f_7283.removeFirst();
                        }
                     }
                  } else {
                     Vec3 var4 = new Vec3(var1.m_9371().getX(), var1.m_9371().getY(), var1.m_9371().getZ());
                     Vec3 var5 = this.m_2600(var3, var4);
                     Vec3 var6 = this.m_2625(var1.m_9371(), var3);
                     if (Optimization.m_5849(var6.x, var6.y, var6.z)) {
                        float var7 = (float)Math.toDegrees(Math.atan2(var5.x, var5.z));
                        this.f_7281.add(new HitEffect.CEuJxW8r7Bpk9UkV(var6, System.currentTimeMillis(), (float)(Math.random() * f_7363), var7));

                        while (this.f_7281.size() > Optimization.m_5843(32)) {
                           this.f_7281.removeFirst();
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private int m_2644(
      BufferBuilder var1,
      PoseStack var2,
      double var3,
      double var5,
      double var7,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      int var14,
      int var15,
      int var16,
      int var17
   ) {
      float var18 = var9 * f_7443;
      float var19 = var10 * f_7444;
      var2.pushPose();
      var2.translate(var3, var5, var7);
      var2.mulPose(Axis.YP.rotationDegrees(-var11));
      var2.mulPose(Axis.XP.rotationDegrees(var12));
      var2.mulPose(Axis.ZP.rotationDegrees(var13));
      Matrix4f var20 = var2.last().pose();
      this.m_2637(var1, var20, -var18, -var19, 0.0F, 0.0F, 1.0F, Class_BftdentXEtGbugJw.m_2298(var14));
      this.m_2637(var1, var20, -var18, var19, 0.0F, 0.0F, 0.0F, Class_BftdentXEtGbugJw.m_2298(var15));
      this.m_2637(var1, var20, var18, var19, 0.0F, 1.0F, 0.0F, Class_BftdentXEtGbugJw.m_2298(var16));
      this.m_2637(var1, var20, var18, -var19, 0.0F, 1.0F, 1.0F, Class_BftdentXEtGbugJw.m_2298(var17));
      var2.popPose();
      return 4;
   }

   private static HitEffect.Class_399iGRNv65fmJhMT[] m_2645() {
      byte var0 = 4;
      float[][][] var1 = new float[var0 + 1][var0 + 1][2];
      Random var2 = new Random(f_7450);

      for (int var3 = 0; var3 <= var0; var3++) {
         for (int var4 = 0; var4 <= var0; var4++) {
            float var5 = (float)var3 / var0;
            float var6 = (float)var4 / var0;
            if (var3 > 0 && var3 < var0 && var4 > 0 && var4 < var0) {
               var5 += (var2.nextFloat() - f_7451) * (f_7452 / var0);
               var6 += (var2.nextFloat() - f_7453) * (f_7454 / var0);
            }

            var1[var3][var4][0] = var6;
            var1[var3][var4][1] = var5;
         }
      }

      HitEffect.Class_399iGRNv65fmJhMT[] var18 = new HitEffect.Class_399iGRNv65fmJhMT[var0 * var0];
      int var19 = 0;

      for (int var20 = 0; var20 < var0; var20++) {
         for (int var21 = 0; var21 < var0; var21++) {
            float var7 = var1[var20][var21][0];
            float var8 = var1[var20][var21][1];
            float var9 = var1[var20 + 1][var21][0];
            float var10 = var1[var20 + 1][var21][1];
            float var11 = var1[var20 + 1][var21 + 1][0];
            float var12 = var1[var20 + 1][var21 + 1][1];
            float var13 = var1[var20][var21 + 1][0];
            float var14 = var1[var20][var21 + 1][1];
            float var15 = (var7 + var9 + var11 + var13) / f_7455;
            float var16 = (var8 + var10 + var12 + var14) / f_7456;
            float var17 = (var2.nextFloat() - f_7457) * 2.0F;
            var18[var19++] = new HitEffect.Class_399iGRNv65fmJhMT(var15, var16, var17);
         }
      }

      return var18;
   }

   private static final class BKOVsU5Lcv0ENI52 {
      public final Vec3 f_7237;
      public final float f_7238;
      public final int f_7239;
      public final long f_7240 = System.currentTimeMillis();

      public BKOVsU5Lcv0ENI52(Vec3 var1, float var2) {
         this.f_7237 = var1;
         this.f_7238 = var2;
         this.f_7239 = HitEffect.f_7258++;
      }
   }

   private record CEuJxW8r7Bpk9UkV(Vec3 pos, long spawnTime, float spinSeed, float sideYaw) {
   }

   private record Class_399iGRNv65fmJhMT(float cu, float cv, float spin) {
      public float m_2594() {
         return this.cv;
      }

      public float m_2595() {
         return this.cu;
      }
   }

   private record Class_50hPkcSDwZ0LExRp(Vec3 center, double halfSize, int color, int seed) {
   }

   private record Class_7SyA1R7CcCH9c3XH(int firstIndex, int indexCount, GpuBufferSlice uniforms) {
   }

   private static final class mG8E8G79T8jPxNgO {
      public final Vec3 f_7241;
      public final long f_7242;
      public final long f_7243;
      public final long f_7244;
      public final long f_7245;
      public static final float f_7246 = 0.5F;
      public static final float f_7247 = 0.5F;
      public static final float f_7248 = 0.3F;

      public boolean m_2596(long var1) {
         return var1 - this.f_7242 >= this.f_7243 + this.f_7244 + this.f_7245;
      }

      public float m_2597(long var1) {
         long var3 = var1 - this.f_7242;
         if (var3 < this.f_7243) {
            return HitEffect.m_2624((float)var3 / (float)Math.max(this.f_7243, 1L));
         }

         if (var3 < this.f_7243 + this.f_7244) {
            return 1.0F;
         }

         long var5 = var3 - this.f_7243 - this.f_7244;
         float var7 = Math.min(1.0F, (float)var5 / (float)Math.max(this.f_7245, 1L));
         return 1.0F - HitEffect.m_2601(var7);
      }

      public float m_2598(long var1) {
         long var3 = var1 - this.f_7242;
         if (var3 < this.f_7243) {
            return f_7246 + f_7247 * HitEffect.m_2599((float)var3 / (float)Math.max(this.f_7243, 1L));
         }

         if (var3 < this.f_7243 + this.f_7244) {
            return 1.0F;
         }

         long var5 = var3 - this.f_7243 - this.f_7244;
         float var7 = Math.min(1.0F, (float)var5 / (float)Math.max(this.f_7245, 1L));
         return 1.0F - f_7248 * HitEffect.m_2601(var7);
      }

      public mG8E8G79T8jPxNgO(Vec3 var1, long var2, long var4, long var6, long var8) {
         this.f_7241 = var1;
         this.f_7242 = var2;
         this.f_7243 = var4;
         this.f_7244 = var6;
         this.f_7245 = var8;
      }
   }
}
