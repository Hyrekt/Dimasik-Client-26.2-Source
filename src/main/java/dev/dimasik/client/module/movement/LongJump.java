package dev.dimasik.client.module.movement;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_QBKwWNWLlChWViO9;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_ZPRMV6aCWVosHRWh;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.phys.Vec3;

public class LongJump extends Module {
   private final MultiChoiceSetting f_18997;
   private final CheckboxSetting f_18998;
   private final SliderSetting f_18999;
   private final CheckboxSetting f_19000;
   private final CheckboxSetting f_19001;
   private final SliderSetting f_19002;
   private final SliderSetting f_19003;
   private final SliderSetting f_19004;
   private final CheckboxSetting f_19005;
   private final SliderSetting f_19006;
   private int f_19007;
   private double f_19008;
   private double f_19009;
   private double f_19010;
   private double f_19011;
   private double f_19012;
   private boolean f_19013;
   private boolean f_19014;
   private long f_19015;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_19016;
   private static final String f_19017 = "LongJump";
   private static final String f_19018 = "Увеличивает дальность прыжка";
   private static final String f_19019 = "Режим";
   private static final String f_19020 = "Обычный";
   private static final String f_19021 = "Незаметный";
   private static final String f_19022 = "Использовать таймер";
   private static final String f_19023 = "Скорость таймера";
   private static final float f_19024 = 0.5F;
   private static final float f_19025 = 3.0F;
   private static final float f_19026 = 0.1F;
   private static final String f_19027 = "Отключать после прыжка";
   private static final String f_19028 = "Бесконечная дистанция";
   private static final String f_19029 = "Макс. дистанция";
   private static final float f_19030 = 10.0F;
   private static final float f_19031 = 5.0F;
   private static final float f_19032 = 40.0F;
   private static final String f_19033 = "Скорость";
   private static final float f_19034 = 1.35F;
   private static final float f_19035 = 0.1F;
   private static final float f_19036 = 10.0F;
   private static final float f_19037 = 0.1F;
   private static final String f_19038 = "Скорость (Незаметный)";
   private static final float f_19039 = 0.45F;
   private static final float f_19040 = 0.1F;
   private static final float f_19041 = 0.01F;
   private static final String f_19042 = "Буст по Y";
   private static final String f_19043 = "Сила буста Y";
   private static final float f_19044 = 0.5F;
   private static final float f_19045 = 0.1F;
   private static final float f_19046 = 0.1F;
   private static final String f_19047 = "Незаметный";
   private static final double f_19048 = 0.42;
   private static final double f_19049 = 2.149;
   private static final double f_19050 = 0.66;
   private static final long f_19051 = 10L;
   private static final double f_19052 = 0.4;
   private static final double f_19053 = 0.2873;
   private static final float f_19054 = 0.2F;
   private static final float f_19055 = -45.0F;
   private static final float f_19056 = 45.0F;
   private static final float f_19057 = 45.0F;
   private static final float f_19058 = -45.0F;
   private static final float f_19059 = -1.0F;
   private static final float f_19060 = 90.0F;
   private static final String f_19061 = "Обычный";
   private static final String f_19062 = "Обычный";
   private static final String f_19063 = "Незаметный";
   private static final String f_19064 = "Обычный";
   private static final String f_19065 = "Обычный";
   private static final String f_19066 = "Обычный";
   private static final String f_19067 = "Обычный";
   private static final String f_19068 = "Обычный";
   private static final String f_19069 = "Обычный";

   private void m_6354(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null) {
         double var2 = f_11537.player.getX() - f_11537.player.xo;
         double var4 = f_11537.player.getZ() - f_11537.player.zo;
         this.f_19009 = Math.sqrt(var2 * var2 + var4 * var4);
         if (this.f_18997.m_7568(f_19047)) {
            this.m_6362();
         } else {
            this.m_6356();
         }
      }
   }

   private void m_6355(double var1) {
      float var3 = f_11537.player.getYRot();
      float var4 = f_11537.player.input.getMoveVector().y;
      float var5 = f_11537.player.input.getMoveVector().x;
      if (var4 != 0.0F || var5 != 0.0F) {
         if (var4 != 0.0F) {
            if (var5 > 0.0F) {
               var3 += var4 > 0.0F ? f_19055 : f_19056;
            } else if (var5 < 0.0F) {
               var3 += var4 > 0.0F ? f_19057 : f_19058;
            }

            var5 = 0.0F;
            var4 = var4 > 0.0F ? 1.0F : f_19059;
         }

         double var6 = Math.toRadians(var3 + f_19060);
         double var8 = var4 * var1 * Math.cos(var6) + var5 * var1 * Math.sin(var6);
         double var10 = var4 * var1 * Math.sin(var6) - var5 * var1 * Math.cos(var6);
         f_11537.player.setDeltaMovement(var8, f_11537.player.getDeltaMovement().y, var10);
      }
   }

   private void m_6356() {
      if (!this.f_19001.m_8768()) {
         double var1 = f_11537.player.distanceToSqr(this.f_19010, this.f_19011, this.f_19012);
         float var3 = this.f_19002.m_8768();
         if (var1 > var3 * var3) {
            this.m_777();
            return;
         }
      }

      if (!Class_QBKwWNWLlChWViO9.m_4256()) {
         this.f_19007 = 0;
         this.f_19008 = 0.0;
      } else {
         if (this.f_18998.m_8768()) {
            Class_ZPRMV6aCWVosHRWh.m_5820(this.f_18999.m_8768());
         }

         switch (this.f_19007) {
            case 0:
               this.f_19008 = this.f_19003.m_8768().floatValue() * this.m_6361();
               this.f_19007 = 1;
               break;
            case 1:
               double var4 = f_19048 + this.m_6368();
               if (this.f_19005.m_8768()) {
                  var4 += this.f_19006.m_8768().floatValue();
               }

               Vec3 var5 = f_11537.player.getDeltaMovement();
               f_11537.player.setDeltaMovement(var5.x, var4, var5.z);
               this.f_19008 = this.f_19008 * f_19049;
               if (this.f_19000.m_8768() && !this.f_19014) {
                  this.f_19015 = System.currentTimeMillis();
                  this.f_19014 = true;
               }

               this.f_19007 = 2;
               break;
            case 2:
               this.f_19008 = this.f_19009 - f_19050 * (this.f_19009 - this.m_6361());
               if (f_11537.player.getDeltaMovement().y < 0.0) {
                  this.f_19007 = 3;
               }
               break;
            case 3:
               this.f_19008 = Math.max(this.m_6361(), this.f_19008);
               if (f_11537.player.onGround()) {
                  if (this.f_19000.m_8768()) {
                     this.m_777();
                  }

                  this.f_19007 = 0;
               }
         }

         this.m_6355(this.f_19008);
         if (this.m_776() && this.f_19014 && this.f_19015 > 0L && System.currentTimeMillis() - this.f_19015 >= f_19051) {
            this.m_777();
         }
      }
   }

   private double m_6361() {
      return f_19053;
   }

   private void m_6362() {
      if (f_11537.player.onGround() && f_11537.options.keyJump.isDown()) {
         f_11537.player.jumpFromGround();
         this.f_19013 = true;
         this.f_19007 = 1;
      }

      if (this.f_19013) {
         float var1 = this.f_19004.m_8768();
         switch (this.f_19007) {
            case 1:
               this.m_6355(var1 * this.m_6361());
               Vec3 var2 = f_11537.player.getDeltaMovement();
               f_11537.player.setDeltaMovement(var2.x, f_19052 + this.m_6368(), var2.z);
               this.f_19007 = 2;
               break;
            case 2:
               if (f_11537.player.getDeltaMovement().y < 0.0) {
                  this.f_19007 = 3;
               }
               break;
            case 3:
               if (f_11537.player.onGround()) {
                  this.f_19013 = false;
                  this.f_19007 = 0;
                  if (this.f_19000.m_8768()) {
                     this.m_777();
                  }
               }
         }
      }
   }

   public LongJump() {
      super(f_19017, f_19018, Category.MOVEMENT);
      this.f_18997 = new MultiChoiceSetting(f_19019, new Class_2ZaVm8TGDJ68TnJB(f_19020), new Class_2ZaVm8TGDJ68TnJB(f_19021));
      this.f_18998 = new CheckboxSetting(f_19022, false).m_822(() -> this.f_18997.m_7568(f_19069));
      this.f_18999 = new SliderSetting(f_19023, 1.0F, f_19024, f_19025).m_828(f_19026).m_822(() -> this.f_18997.m_7568(f_19068) && this.f_18998.m_8768());
      this.f_19000 = new CheckboxSetting(f_19027, true).m_822(() -> this.f_18997.m_7568(f_19067));
      this.f_19001 = new CheckboxSetting(f_19028, false).m_822(() -> this.f_18997.m_7568(f_19066));
      this.f_19002 = new SliderSetting(f_19029, f_19030, f_19031, f_19032).m_828(1.0F).m_822(() -> this.f_18997.m_7568(f_19065) && !this.f_19001.m_8768());
      this.f_19003 = new SliderSetting(f_19033, f_19034, f_19035, f_19036).m_828(f_19037).m_822(() -> this.f_18997.m_7568(f_19064));
      this.f_19004 = new SliderSetting(f_19038, f_19039, f_19040, 2.0F).m_828(f_19041).m_822(() -> this.f_18997.m_7568(f_19063));
      this.f_19005 = new CheckboxSetting(f_19042, false).m_822(() -> this.f_18997.m_7568(f_19062));
      this.f_19006 = new SliderSetting(f_19043, f_19044, f_19045, 2.0F).m_828(f_19046).m_822(() -> this.f_18997.m_7568(f_19061) && this.f_19005.m_8768());
      this.f_19016 = this::m_6354;
      this.m_795(this.f_18997, this.f_18998, this.f_18999, this.f_19000, this.f_19001, this.f_19002, this.f_19003, this.f_19004, this.f_19005, this.f_19006);
   }

   private float m_6368() {
      return f_11537.player.hasEffect(MobEffects.JUMP_BOOST) ? f_19054 : 0.0F;
   }

   @Override
   public void m_732() {
      Class_ZPRMV6aCWVosHRWh.m_5820(1.0F);
      this.f_19007 = 0;
      this.f_19008 = 0.0;
      this.f_19009 = 0.0;
      this.f_19013 = false;
      this.f_19014 = false;
      super.m_732();
   }

   @Override
   public void m_778() {
      this.f_19007 = 0;
      this.f_19008 = 0.0;
      this.f_19009 = 0.0;
      if (f_11537.player != null) {
         this.f_19010 = f_11537.player.getX();
         this.f_19011 = f_11537.player.getY();
         this.f_19012 = f_11537.player.getZ();
      }

      this.f_19013 = false;
      this.f_19014 = false;
      this.f_19015 = 0L;
      Class_ZPRMV6aCWVosHRWh.m_5820(1.0F);
      super.m_778();
   }
}
