package dev.dimasik.client.module.combat;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.module.movement.ElytraBooster;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_3VHxwfI2NZKoxzIi;
import dev.dimasik.client.system.Class_81oIJPtsDGdzRKcL;
import dev.dimasik.client.system.Class_MACPHdFZqVYaxUay;
import dev.dimasik.client.system.Class_MCgcjXLZQdRybe5M;
import dev.dimasik.client.system.Class_QmNR03reugBgWiPr;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_XqyHOyiq0ROk9HLU;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_bhSc4OUnYWSe2vjL;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_h78PE30BIJJYoUEk;
import dev.dimasik.client.system.Class_lMF8QIjJz1IQgCZg;
import lombok.Generated;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class ElytraTarget extends Module {
   private final SliderSetting f_14433;
   private final SliderSetting f_14434;
   private final CheckboxSetting f_14435;
   private final SliderSetting f_14436;
   private final CheckboxSetting f_14437;
   private final MultiChoiceSetting f_14438;
   private final SliderSetting f_14439;
   private final MultiChoiceSetting f_14440;
   private final SliderSetting f_14441;
   private final CheckboxSetting f_14442;
   private final CheckboxSetting f_14443;
   private final CheckboxSetting f_14444;
   public final Class_QmNR03reugBgWiPr f_14445;
   private boolean f_14446;
   private Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_14447;
   private Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_14448;
   private final Class_gEPk7yDw6CwIte87<Class_XqyHOyiq0ROk9HLU> f_14449;
   private final Class_gEPk7yDw6CwIte87<Class_MACPHdFZqVYaxUay> f_14450;
   private static final String f_14451 = "ElytraTarget";
   private static final String f_14452 = "Преследует игрока на элитрах";
   private static final String f_14453 = "Дистанция атаки";
   private static final float f_14454 = 3.0F;
   private static final float f_14455 = 5.0F;
   private static final float f_14456 = 0.1F;
   private static final String f_14457 = "Дистанция обнаружения";
   private static final float f_14458 = 30.0F;
   private static final float f_14459 = 15.0F;
   private static final float f_14460 = 120.0F;
   private static final float f_14461 = 0.1F;
   private static final String f_14462 = "Элитра лаг";
   private static final String f_14463 = "Дистанция отлета";
   private static final float f_14464 = 7.5F;
   private static final float f_14465 = 5.0F;
   private static final float f_14466 = 15.0F;
   private static final float f_14467 = 0.5F;
   private static final String f_14468 = "Элитра перегон";
   private static final String f_14469 = "Режим предикта";
   private static final String f_14470 = "От ротации";
   private static final String f_14471 = "От скорости";
   private static final String f_14472 = "Сила предикта";
   private static final float f_14473 = 3.0F;
   private static final float f_14474 = 1.5F;
   private static final float f_14475 = 10.0F;
   private static final float f_14476 = 0.5F;
   private static final String f_14477 = "Бить когда";
   private static final String f_14478 = "Перегнал";
   private static final String f_14479 = "Всегда";
   private static final String f_14480 = "Предиктить от бпс";
   private static final float f_14481 = 15.0F;
   private static final float f_14482 = 10.0F;
   private static final float f_14483 = 30.0F;
   private static final String f_14484 = "Автоматически использовать фейверк";
   private static final String f_14485 = "Моментальный отклик";
   private static final String f_14486 = "Рендерить предикт";
   private static final double f_14487 = 1000.0;
   private static final double f_14488 = 2.6F;
   private static final float f_14489 = 1.7F;
   private static final float f_14490 = 0.17F;
   private static final double f_14491 = 2.0;
   private static final double f_14492 = 3.2;
   private static final double f_14493 = 1.0E-5F;
   private static final double f_14494 = 1.0E-5F;
   private static final double f_14495 = 1.0E-5F;
   private static final double f_14496 = 4.5;
   private static final float f_14497 = (float) (Math.PI / 180.0);
   private static final double f_14498 = 0.01;
   private static final double f_14499 = -1.0;
   private static final double f_14500 = 0.75;
   private static final double f_14501 = -0.1;
   private static final double f_14502 = 0.04;
   private static final double f_14503 = 0.1;
   private static final double f_14504 = 0.1;
   private static final double f_14505 = 0.99F;
   private static final double f_14506 = 0.98F;
   private static final double f_14507 = 0.99F;
   private static final float f_14508 = 0.5F;
   private static final double f_14509 = 0.75;
   private static final double f_14510 = 0.75;
   private static final double f_14511 = 0.75;
   private static final String f_14512 = "От ротации";

   public ElytraTarget() {
      super(f_14451, f_14452, Category.COMBAT);
      this.f_14433 = new SliderSetting(f_14453, f_14454, 1.0F, f_14455).m_828(f_14456);
      this.f_14434 = new SliderSetting(f_14457, f_14458, f_14459, f_14460).m_828(f_14461);
      this.f_14435 = new CheckboxSetting(f_14462, false);
      this.f_14436 = new SliderSetting(f_14463, f_14464, f_14465, f_14466).m_828(f_14467).m_822(() -> this.f_14435.m_8768());
      this.f_14437 = new CheckboxSetting(f_14468, false);
      this.f_14438 = new MultiChoiceSetting(f_14469, new Class_2ZaVm8TGDJ68TnJB(f_14470), new Class_2ZaVm8TGDJ68TnJB(f_14471))
         .m_822(() -> this.f_14437.m_8768());
      this.f_14439 = new SliderSetting(f_14472, f_14473, f_14474, f_14475).m_828(f_14476).m_822(() -> this.f_14437.m_8768());
      this.f_14440 = new MultiChoiceSetting(f_14477, new Class_2ZaVm8TGDJ68TnJB(f_14478), new Class_2ZaVm8TGDJ68TnJB(f_14479));
      this.f_14441 = new SliderSetting(f_14480, f_14481, f_14482, f_14483).m_828(1.0F);
      this.f_14442 = new CheckboxSetting(f_14484, true);
      this.f_14443 = new CheckboxSetting(f_14485, true);
      this.f_14444 = new CheckboxSetting(f_14486, true);
      this.f_14445 = new Class_QmNR03reugBgWiPr();
      this.f_14447 = this::m_5081;
      this.f_14448 = this::m_5085;
      this.f_14449 = this::m_5091;
      this.f_14450 = this::m_5083;
      this.m_795(
         this.f_14433,
         this.f_14434,
         this.f_14435,
         this.f_14436,
         this.f_14437,
         this.f_14438,
         this.f_14439,
         this.f_14440,
         this.f_14441,
         this.f_14442,
         this.f_14443,
         this.f_14444
      );
   }

   @Generated
   public Class_QmNR03reugBgWiPr m_5073() {
      return this.f_14445;
   }

   @Generated
   public SliderSetting m_5074() {
      return this.f_14436;
   }

   @Generated
   public boolean m_5075() {
      return this.f_14446;
   }

   @Generated
   public SliderSetting m_5076() {
      return this.f_14441;
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_XqyHOyiq0ROk9HLU> m_5077() {
      return this.f_14449;
   }

   @Generated
   public MultiChoiceSetting m_5078() {
      return this.f_14440;
   }

   @Generated
   public CheckboxSetting m_5079() {
      return this.f_14435;
   }

   @Generated
   public MultiChoiceSetting m_5080() {
      return this.f_14438;
   }

   public void m_5081(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null) {
         if (!f_11537.player.isFallFlying()) {
            this.f_14446 = false;
         }

         Aura var2 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
         if (var2.m_776() && f_11537.player.isFallFlying() && var2.m_1114() != null && this.f_14442.m_8768() && this.f_14445.m_4458(f_14487)) {
            Class_h78PE30BIJJYoUEk.m_7064(Items.FIREWORK_ROCKET);
            this.f_14445.m_4459();
         }
      }
   }

   @Generated
   public CheckboxSetting m_5082() {
      return this.f_14444;
   }

   private void m_5083(Class_MACPHdFZqVYaxUay var1) {
      if (f_11537.player != null && this.f_14443.m_8768()) {
         LivingEntity var2 = DimasikClient.m_9057().m_9049().m_2801().m_3576().m_1114();
         if (this.f_14446) {
            float var3 = f_14489;
            ElytraBooster var4 = DimasikClient.m_9057().m_9049().m_2801().m_3418();
            if (var4.m_776()) {
               var3 = var4.m_5040() + f_14490;
            }

            if (var2 != null && f_11537.player.getEyePosition().distanceTo(this.m_5088(var2)) < f_14491) {
               var3 = (float)var2.getDeltaMovement().length();
            }

            var1.m_3883(this.m_5095(Vec3.directionFromRotation(f_11537.player.getXRot(), f_11537.player.getYRot()).scale(var3), 1.0));
            this.f_14446 = false;
         } else if (var2 != null) {
            Vec3 var5 = this.m_5095(f_11537.player.getDeltaMovement(), f_14492);
            Vec3 var6 = new Vec3(var2.getDeltaMovement().x * f_14493, var2.getDeltaMovement().y * f_14494, var2.getDeltaMovement().z * f_14495);
            if (f_11537.player.getEyePosition().distanceTo(this.m_5088(var2)) < f_14496
               && var2.isFallFlying()
               && Math.hypot(var2.getDeltaMovement().x, var2.getDeltaMovement().z) != 0.0) {
               var1.m_3883(var5.add(var6));
            }
         }
      }
   }

   public boolean m_5084(LivingEntity var1) {
      return f_11537.player.isFallFlying();
   }

   private void m_5085(Class_TZhU50s8XmBQCMP5 var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (this.f_14444.m_8768()) {
            LivingEntity var2 = DimasikClient.m_9057().m_9049().m_2801().m_3576().m_1114();
            if (var2 != null) {
               Aura var3 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
               if (var3.m_776() && f_11537.player.isFallFlying() && var2.isFallFlying()) {
                  PoseStack var4 = var1.m_5006();
                  VertexConsumer var5 = var1.m_5008().m_881(Class_81oIJPtsDGdzRKcL.f_3816);
                  Vec3 var6 = var1.m_5010();
                  Vec3 var7 = var2.position().add(0.0, var2.getBbHeight() / 2.0F + (f_11537.player.isFallFlying() ? f_14508 : 0.0F), 0.0);
                  Vec3 var8 = this.m_5099(var2, var7);
                  AABB var9 = AABB.ofSize(var8, f_14509, f_14510, f_14511);
                  Class_bhSc4OUnYWSe2vjL.m_6087(var4, var5, var6, var9.minX, var9.minY, var9.minZ, var9.maxX, var9.maxY, var9.maxZ, -1);
               }
            }
         }
      }
   }

   @Generated
   public CheckboxSetting m_5086() {
      return this.f_14437;
   }

   @Generated
   public SliderSetting m_5087() {
      return this.f_14434;
   }

   private Vec3 m_5088(LivingEntity var1) {
      return var1.getEyePosition().add(var1.getDeltaMovement());
   }

   @Generated
   public SliderSetting m_5089() {
      return this.f_14439;
   }

   @Generated
   public SliderSetting m_5090() {
      return this.f_14433;
   }

   private void m_5091(Class_XqyHOyiq0ROk9HLU var1) {
      if (f_11537.player != null && this.f_14443.m_8768()) {
         LivingEntity var2 = DimasikClient.m_9057().m_9049().m_2801().m_3576().m_1114();
         Vec3 var3 = var2 != null ? Class_3VHxwfI2NZKoxzIi.m_1307(f_11537.player.getEyePosition(), var2.getBoundingBox()) : Vec3.ZERO;
         if (var1.m_5608() == f_11537.player
            && (var2 == null || !f_11537.player.isFallFlying() || var2.isFallFlying() || !(f_11537.player.getEyePosition().distanceTo(var3) < f_14488))) {
            this.f_14446 = true;
         }
      }
   }

   @Override
   public void m_732() {
      this.f_14446 = false;
   }

   @Generated
   public CheckboxSetting m_5092() {
      return this.f_14442;
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> m_5094() {
      return this.f_14448;
   }

   private Vec3 m_5095(Vec3 var1, double var2) {
      Vec3 var4 = f_11537.player.getLookAngle();
      float var5 = f_11537.player.getXRot() * f_14497;
      double var6 = Math.sqrt(var4.x * var4.x + var4.z * var4.z);
      double var8 = var1.horizontalDistance();
      boolean var10 = f_11537.player.getDeltaMovement().y <= 0.0;
      double var11 = var10 && f_11537.player.hasEffect(MobEffects.SLOW_FALLING) ? Math.min(f_11537.player.getGravity(), f_14498) : f_11537.player.getGravity();
      double var13 = Mth.square(Math.cos(var5));
      var1 = var1.add(0.0, var11 * (f_14499 + var13 * f_14500), 0.0);
      if (var1.y < 0.0 && var6 > 0.0) {
         double var15 = var1.y * f_14501 * var13;
         var1 = var1.add(var4.x * var15 / var6, var15, var4.z * var15 / var6);
      }

      if (var5 < 0.0F && var6 > 0.0) {
         double var18 = var8 * -Mth.sin(var5) * f_14502;
         var1 = var1.add(-var4.x * var18 / var6, var18 * var2, -var4.z * var18 / var6);
      }

      if (var6 > 0.0) {
         var1 = var1.add((var4.x / var6 * var8 - var1.x) * f_14503, 0.0, (var4.z / var6 * var8 - var1.z) * f_14504);
      }

      return var1.multiply(f_14505, f_14506, f_14507);
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> m_5096() {
      return this.f_14447;
   }

   @Generated
   public CheckboxSetting m_5098() {
      return this.f_14443;
   }

   public Vec3 m_5099(LivingEntity var1, Vec3 var2) {
      if (this.m_776() && var1 != null && f_11537.player != null) {
         if (!this.m_5084(var1)
            || !this.f_14437.m_8768()
            || !var1.isFallFlying()
            || !(Class_3VHxwfI2NZKoxzIi.m_1306(var1) > this.f_14441.m_8768().floatValue())) {
            return var2;
         } else {
            return this.f_14438.m_7568(f_14512)
               ? var2.add(
                  var1.calculateViewVector(((Class_lMF8QIjJz1IQgCZg)var1).getResolvedPitch(), ((Class_lMF8QIjJz1IQgCZg)var1).getResolvedYaw())
                     .scale(this.f_14439.m_8768().floatValue())
               )
               : var2.add(Class_MCgcjXLZQdRybe5M.m_3885(var1, this.f_14439.m_8768()));
         }
      } else {
         return var2;
      }
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_MACPHdFZqVYaxUay> m_5100() {
      return this.f_14450;
   }
}
