package dev.dimasik.client.module.render;

import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
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
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_15puspGa4UwNUgkr;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_wjdoxQGtI8mFyL6U;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector2f;
import org.lwjgl.system.MemoryStack;

public final class ImpactNova extends Module {
   public static final int f_17463 = -65282;
   private static final int f_17464 = 6;
   private static final int f_17465 = 336;
   private static final float f_17466 = 0.16F;
   private static final float f_17467 = 0.34F;
   private static final float f_17468 = 0.55F;
   private static final ImpactNova.jhktxCOXdy0vTtLt f_17469 = new ImpactNova.jhktxCOXdy0vTtLt(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
   private final MultiChoiceSetting f_17470;
   private final CheckboxSetting f_17471;
   private final ColorSetting f_17472;
   private final SliderSetting f_17473;
   private final SliderSetting f_17474;
   private final SliderSetting f_17475;
   private final List<ImpactNova.W20HLQ0TIMhtWHFP> f_17476;
   private final Random f_17477;
   private final RenderPipeline f_17478;
   private final Class_gEPk7yDw6CwIte87<Class_wjdoxQGtI8mFyL6U> f_17479;
   private final Class_gEPk7yDw6CwIte87<Class_15puspGa4UwNUgkr> f_17480;
   private static final String f_17481 = "ImpactNova";
   private static final String f_17482 = "Шейдерная накладка на модель после удара";
   private static final String f_17483 = "Вид";
   private static final String f_17484 = "Импульс";
   private static final String f_17485 = "Сжигание";
   private static final String f_17486 = "Цвет темы";
   private static final String f_17487 = "Цвет";
   private static final int f_17488 = -7643905;
   private static final String f_17489 = "Масштаб";
   private static final float f_17490 = 0.5F;
   private static final float f_17491 = 0.1F;
   private static final String f_17492 = "Сила";
   private static final float f_17493 = 0.3F;
   private static final float f_17494 = 0.1F;
   private static final String f_17495 = "Длительность";
   private static final float f_17496 = 1.4F;
   private static final float f_17497 = 0.4F;
   private static final float f_17498 = 3.0F;
   private static final float f_17499 = 0.1F;
   private static final String f_17500 = "dimasik/impact_nova_model";
   private static final String f_17501 = "hands_fullscreen";
   private static final String f_17502 = "impact_nova_model";
   private static final String f_17503 = "ImpactNova";
   private static final String f_17504 = "MaskSampler";
   private static final double f_17505 = 0.001;
   private static final int f_17506 = -65282;
   private static final double f_17507 = 0.25;
   private static final float f_17508 = 0.1F;
   private static final float f_17509 = 1000.0F;
   private static final float f_17510 = 0.002F;
   private static final float f_17511 = 0.2F;
   private static final float f_17512 = 0.2F;
   private static final double f_17513 = 0.5;
   private static final float f_17514 = 1.0E-5F;
   private static final float f_17515 = 0.55F;
   private static final float f_17516 = 0.5F;
   private static final float f_17517 = 0.2F;
   private static final float f_17518 = 0.2F;
   private static final float f_17519 = 0.16F;
   private static final float f_17520 = 0.65999997F;
   private static final float f_17521 = 0.34F;
   private static final float f_17522 = 255.0F;
   private static final float f_17523 = 255.0F;
   private static final float f_17524 = 255.0F;
   private static final String f_17525 = "MaskSampler";
   private static final String f_17526 = "ImpactNova";
   private static final String f_17527 = "Сжигание";
   private static final float f_17528 = 6.0F;
   private static final float f_17529 = 15.0F;
   private static final float f_17530 = 10.0F;
   private static final float f_17531 = 0.1F;
   private static final float f_17532 = 1000.0F;
   private static final String f_17533 = "impactNovaOverlay";
   private static final String f_17534 = "impactNovaUniforms";

   private float m_5943(float var1) {
      return var1 * var1 * var1 * (var1 * (var1 * f_17528 - f_17529) + f_17530);
   }

   public ImpactNova() {
      super(f_17481, f_17482, Category.RENDER);
      this.f_17470 = new MultiChoiceSetting(f_17483, new Class_2ZaVm8TGDJ68TnJB(f_17484), new Class_2ZaVm8TGDJ68TnJB(f_17485));
      this.f_17471 = new CheckboxSetting(f_17486, true);
      this.f_17472 = new ColorSetting(f_17487, false, f_17488).m_822(() -> !this.f_17471.m_8768());
      this.f_17473 = new SliderSetting(f_17489, 1.0F, f_17490, 2.0F).m_828(f_17491);
      this.f_17474 = new SliderSetting(f_17492, 1.0F, f_17493, 2.0F).m_828(f_17494);
      this.f_17475 = new SliderSetting(f_17495, f_17496, f_17497, f_17498).m_828(f_17499);
      this.f_17476 = new ArrayList<>();
      this.f_17477 = new Random();
      this.f_17478 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_17500)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_17501))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_17502))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_17503, UniformType.UNIFORM_BUFFER)
         .m_2741(f_17504)
         .m_2722();
      this.f_17479 = this::m_5962;
      this.f_17480 = this::m_5960;
      this.m_795(this.f_17470, this.f_17471, this.f_17472, this.f_17473, this.f_17474, this.f_17475);
   }

   private void m_5945(RenderTarget var1, RenderTarget var2, List<ImpactNova.jhktxCOXdy0vTtLt> var3) {
      CommandEncoder var4 = RenderSystem.getDevice().createCommandEncoder();
      GpuBuffer var5 = null;

      try {
         MemoryStack var6 = MemoryStack.stackPush();

         try {
            int var7 = this.f_17471.m_8768() ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : this.f_17472.m_8768();
            Std140Builder var8 = Std140Builder.onStack(var6, 336)
               .putVec4(this.m_5958(), this.f_17474.m_8768(), var3.size(), this.f_17473.m_8768())
               .putVec4(
                  Class_BftdentXEtGbugJw.m_2309(var7) / f_17522,
                  Class_BftdentXEtGbugJw.m_2299(var7) / f_17523,
                  Class_BftdentXEtGbugJw.m_2308(var7) / f_17524,
                  1.0F
               )
               .putVec4(var1.width, var1.height, 0.0F, 0.0F);

            for (int var9 = 0; var9 < 6; var9++) {
               ImpactNova.jhktxCOXdy0vTtLt var10 = var9 < var3.size() ? (ImpactNova.jhktxCOXdy0vTtLt)var3.get(var9) : f_17469;
               var8.putVec4(var10.centerU(), var10.centerV(), var10.blockScale(), var10.seed());
            }

            for (int var24 = 0; var24 < 6; var24++) {
               ImpactNova.jhktxCOXdy0vTtLt var27 = var24 < var3.size() ? (ImpactNova.jhktxCOXdy0vTtLt)var3.get(var24) : f_17469;
               var8.putVec4(var27.hitLocalX(), var27.hitLocalY(), 0.0F, 0.0F);
            }

            for (int var25 = 0; var25 < 6; var25++) {
               ImpactNova.jhktxCOXdy0vTtLt var28 = var25 < var3.size() ? (ImpactNova.jhktxCOXdy0vTtLt)var3.get(var25) : f_17469;
               var8.putVec4(var28.progress(), var28.age(), var28.envelope(), var28.growth());
            }

            ByteBuffer var26 = var8.get();
            var5 = RenderSystem.getDevice().createBuffer(() -> f_17534, 128, var26);
            RenderPass var29 = var4.createRenderPass(() -> f_17533, var2.getColorTextureView(), Optional.empty());

            try {
               var29.setPipeline(this.f_17478);
               var29.bindTexture(f_17525, var1.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
               var29.setUniform(f_17526, var5);
               var29.draw(3, 1, 0, 0);
            } catch (Throwable var21) {
               if (var29 != null) {
                  try {
                     var29.close();
                  } catch (Throwable var20) {
                     var21.addSuppressed(var20);
                  }
               }

               throw var21;
            }

            if (var29 != null) {
               var29.close();
            }
         } catch (Throwable var22) {
            if (var6 != null) {
               try {
                  var6.close();
               } catch (Throwable var19) {
                  var22.addSuppressed(var19);
               }
            }

            throw var22;
         }

         if (var6 != null) {
            var6.close();
         }
      } finally {
         if (var5 != null) {
            var5.close();
         }
      }
   }

   private boolean m_5946(Entity var1) {
      if (var1 != null && f_11537.gameRenderer != null) {
         Vec3 var2 = f_11537.gameRenderer.mainCamera().position();
         return var1.getBoundingBox().inflate(f_17507).contains(var2);
      } else {
         return false;
      }
   }

   private Vec3 m_5947(Entity var1) {
      float var2 = f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true);
      return new Vec3(Mth.lerp(var2, var1.xo, var1.getX()), Mth.lerp(var2, var1.yo, var1.getY()), Mth.lerp(var2, var1.zo, var1.getZ()));
   }

   private void m_5948() {
      long var1 = System.currentTimeMillis();
      long var3 = (long)(Math.max(this.f_17475.m_8768(), f_17531) * f_17532);
      Iterator var5 = this.f_17476.iterator();

      while (var5.hasNext()) {
         ImpactNova.W20HLQ0TIMhtWHFP var6 = (ImpactNova.W20HLQ0TIMhtWHFP)var5.next();
         if (var6.target == null || var6.target.isRemoved() || var1 - var6.startedAt >= var3) {
            var5.remove();
         }
      }
   }

   public boolean m_5949(Entity var1) {
      if (this.m_776() && var1 != null) {
         if (this.m_5946(var1)) {
            return false;
         }

         this.m_5948();

         for (ImpactNova.W20HLQ0TIMhtWHFP var3 : this.f_17476) {
            if (var3.target == var1) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public boolean m_5952() {
      this.m_5948();
      return this.m_776() && !this.f_17476.isEmpty();
   }

   private float m_5953(Vec3 var1, float var2, float var3) {
      float var4 = var2 * f_17516;
      float var5 = Float.POSITIVE_INFINITY;
      float var6 = Float.POSITIVE_INFINITY;
      float var7 = Float.NEGATIVE_INFINITY;
      float var8 = Float.NEGATIVE_INFINITY;
      int var9 = 0;

      for (float var13 : new float[]{0.0F, var3}) {
         for (float var17 : new float[]{-var4, var4}) {
            for (float var21 : new float[]{-var4, var4}) {
               Vector2f var22 = Class_FvJXUGWpZo3zYBW4.m_2696(var1.add(var17, var13, var21), false);
               if (var22 != null) {
                  var5 = Math.min(var5, var22.x);
                  var6 = Math.min(var6, var22.y);
                  var7 = Math.max(var7, var22.x);
                  var8 = Math.max(var8, var22.y);
                  var9++;
               }
            }
         }
      }

      if (var9 < 2) {
         return 0.0F;
      }

      float var23 = (var7 - var5) / Math.max(var2, f_17517);
      float var24 = (var8 - var6) / Math.max(var3, f_17518);
      return Math.max(var23, var24);
   }

   @Override
   public void m_732() {
      this.f_17476.clear();
   }

   public void m_5955(RenderTarget var1, RenderTarget var2) {
      if (this.m_5952()) {
         long var3 = System.currentTimeMillis();
         float var5 = Math.max(this.f_17475.m_8768(), f_17508);
         float var6 = f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true);
         float var7 = (float)var1.width / Math.max(var1.height, 1);
         ArrayList var8 = new ArrayList(6);

         for (ImpactNova.W20HLQ0TIMhtWHFP var10 : List.copyOf(this.f_17476)) {
            if (var8.size() >= 6) {
               break;
            }

            if (!this.m_5946(var10.target)) {
               float var11 = (float)(var3 - var10.startedAt) / f_17509;
               float var12 = Math.clamp(var11 / var5, 0.0F, 1.0F);
               float var13 = this.m_5961(var12);
               if (!(var13 <= f_17510)) {
                  ImpactNova.jhktxCOXdy0vTtLt var14 = this.m_5959(var10, var6, var7, var12, var11, var13);
                  if (var14 != null) {
                     var8.add(var14);
                  }
               }
            }
         }

         if (!var8.isEmpty()) {
            this.m_5945(var1, var2, var8);
         }
      }
   }

   private float m_5956(Vec3 var1, float var2) {
      float var3 = (float)Math.toRadians(var2);
      Vec3 var4 = new Vec3(Math.cos(var3), 0.0, Math.sin(var3));
      Vec3 var5 = new Vec3(-Math.sin(var3), 0.0, Math.cos(var3));
      Vec3 var6 = new Vec3(0.0, 1.0, 0.0);
      Vector2f var7 = Class_FvJXUGWpZo3zYBW4.m_2696(var1, false);
      if (var7 == null) {
         return 0.0F;
      }

      float var8 = 0.0F;

      for (Vec3 var12 : new Vec3[]{var4, var6, var5}) {
         Vector2f var13 = Class_FvJXUGWpZo3zYBW4.m_2696(var1.add(var12), false);
         if (var13 != null) {
            var8 = Math.max(var8, (float)Math.hypot(var13.x - var7.x, var13.y - var7.y));
         }
      }

      return var8;
   }

   private float m_5957(float var1) {
      float var2 = 1.0F - var1;
      return 1.0F - var2 * var2 * var2;
   }

   private float m_5958() {
      return this.f_17470.m_7568(f_17527) ? 1.0F : 0.0F;
   }

   private ImpactNova.jhktxCOXdy0vTtLt m_5959(ImpactNova.W20HLQ0TIMhtWHFP var1, float var2, float var3, float var4, float var5, float var6) {
      Entity var7 = var1.target;
      Vec3 var8 = this.m_5947(var7);
      float var9 = Math.max(var7.getBbHeight(), f_17511);
      float var10 = Math.max(var7.getBbWidth(), f_17512);
      Vec3 var11 = var8.add(0.0, var9 * f_17513, 0.0);
      Vector2f var12 = Class_FvJXUGWpZo3zYBW4.m_2696(var11, true);
      if (var12 == null) {
         return null;
      }

      float var13 = this.m_5956(var11, var7.getYRot(var2));
      var13 = Math.max(var13, this.m_5953(var8, var10, var9));
      if (var13 < f_17514) {
         return null;
      }

      Vector2f var14 = Class_FvJXUGWpZo3zYBW4.m_2696(var8.add(var1.localHit), false);
      if (var14 == null) {
         return null;
      }

      float var15 = (var14.x - var12.x) * var3 / var13;
      float var16 = (var14.y - var12.y) / var13;
      return new ImpactNova.jhktxCOXdy0vTtLt(
         var12.x, var12.y, var13, var1.seed, var15, var16, var4, var5, var6, this.m_5957(Math.clamp(var4 / f_17515, 0.0F, 1.0F))
      );
   }

   private void m_5960(Class_15puspGa4UwNUgkr var1) {
      if (this.m_776() && this.m_5949(var1.m_838())) {
         var1.m_837().outlineColor = f_17506;
      }
   }

   private float m_5961(float var1) {
      float var2 = this.m_5943(Math.clamp(var1 / f_17519, 0.0F, 1.0F));
      float var3 = this.m_5943(Math.clamp((var1 - f_17520) / f_17521, 0.0F, 1.0F));
      return var2 * (1.0F - var3);
   }

   private void m_5962(Class_wjdoxQGtI8mFyL6U var1) {
      if (var1.m_9372() == Class_wjdoxQGtI8mFyL6U.Class_327mRdjAqNoPaemJ.POST && var1.m_9370() != null && var1.m_9371() == f_11537.player) {
         Entity var2 = var1.m_9370();
         Vec3 var3 = this.m_5963(var1).subtract(this.m_5947(var2));
         this.f_17476.removeIf(var1x -> var1x.target == var2);
         this.f_17476.add(new ImpactNova.W20HLQ0TIMhtWHFP(var2, var3, System.currentTimeMillis(), this.f_17477.nextFloat()));

         while (this.f_17476.size() > 6) {
            this.f_17476.removeFirst();
         }
      }
   }

   private Vec3 m_5963(Class_wjdoxQGtI8mFyL6U var1) {
      if (f_11537.hitResult instanceof EntityHitResult var2 && var2.getEntity() == var1.m_9370()) {
         return var2.getLocation();
      } else {
         AABB var4 = var1.m_9370().getBoundingBox().inflate(f_17505);
         Vec3 var5 = var1.m_9371().getEyePosition();
         return var4.clip(var5, var4.getCenter()).orElse(var4.getCenter());
      }
   }

   private record W20HLQ0TIMhtWHFP(Entity target, Vec3 localHit, long startedAt, float seed) {
   }

   private record jhktxCOXdy0vTtLt(
      float centerU, float centerV, float blockScale, float seed, float hitLocalX, float hitLocalY, float progress, float age, float envelope, float growth
   ) {
   }
}
