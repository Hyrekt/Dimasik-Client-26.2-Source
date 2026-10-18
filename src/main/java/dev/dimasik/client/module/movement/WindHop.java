package dev.dimasik.client.module.movement;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.system.Class_I4ZLf1tdGfKiuaY4;
import dev.dimasik.client.system.Class_U3Ilecg2NrGaJJQx;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_h78PE30BIJJYoUEk;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.Items;

public class WindHop extends Module {
   private static final int f_16002 = 5;
   private static final int f_16003 = 4;
   private final CheckboxSetting f_16004;
   private final CheckboxSetting f_16005;
   private final CheckboxSetting f_16006;
   private final Class_I4ZLf1tdGfKiuaY4 f_16007;
   private WindHop.pxg204TVNshUIjE7 f_16008;
   private int f_16009;
   private int f_16010;
   private int f_16011;
   private int f_16012;
   private int f_16013;
   private boolean f_16014;
   private boolean f_16015;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_16016;
   private static final String f_16017 = "WindHop";
   private static final String f_16018 = "Прыгает и использует заряд ветра под игрока";
   private static final String f_16019 = "Авто Свап";
   private static final String f_16020 = "Взмах рукой";
   private static final String f_16021 = "Авто прыжок";
   private static final float f_16022 = 90.0F;
   private static final float f_16023 = 90.0F;
   private static final float f_16024 = 4.0F;

   private void m_5572() {
      if (this.f_16014) {
         this.f_16012++;
         if (f_11537.player.onGround() && this.f_16012 <= 4) {
            return;
         }

         this.m_5585();
      }

      if (this.f_16004.m_8768() && this.f_16009 >= 0 && this.f_16009 <= 8 && this.f_16009 != this.f_16010) {
         Class_h78PE30BIJJYoUEk.m_7082(this.f_16009);
      }

      this.m_777();
   }

   private boolean m_5573() {
      return f_11537.player != null && f_11537.level != null && f_11537.gameMode != null && f_11537.getConnection() != null;
   }

   private void m_5574() {
      if (!f_11537.player.onGround()) {
         this.m_777();
      } else {
         f_11537.options.keyJump.setDown(true);
         this.f_16014 = true;
         this.f_16012 = 0;
         this.f_16008 = WindHop.pxg204TVNshUIjE7.SWITCH_BACK;
      }
   }

   private void m_5575() {
      this.f_16011++;
      int var1 = DimasikClient.m_9057().m_9052().m_6338().m_1507();
      if (var1 != this.f_16010) {
         if (this.f_16011 > 5) {
            this.m_777();
         }
      } else {
         this.m_5579();
      }
   }

   @Override
   public void m_732() {
      this.m_5585();
      this.m_5583();
      this.m_5582();
      super.m_732();
   }

   private void m_5576() {
      Class_U3Ilecg2NrGaJJQx var1 = DimasikClient.m_9057().m_9049().m_2813();
      if (var1.m_5180() != this.f_16007) {
         this.m_777();
      } else if (!(Math.abs(f_16023 - f_11537.player.getXRot()) > f_16024)) {
         if (this.f_16004.m_8768() && this.f_16009 != this.f_16010) {
            Class_h78PE30BIJJYoUEk.m_7082(this.f_16010);
            this.f_16011 = 0;
            this.f_16008 = WindHop.pxg204TVNshUIjE7.WAIT_SWITCH;
         } else {
            this.m_5579();
         }
      }
   }

   private void m_5577(Class_Xu9btcIeUN33XnMK var1) {
      if (this.m_5573()) {
         switch (this.f_16008) {
            case IDLE:
               this.m_5581();
               break;
            case ROTATING:
               this.m_5576();
               break;
            case WAIT_SWITCH:
               this.m_5575();
               break;
            case JUMP:
               this.m_5574();
               break;
            case USE:
               this.m_5578();
               break;
            case SWITCH_BACK:
               this.m_5572();
         }
      }
   }

   private void m_5578() {
      if (this.f_16010 >= 0 && this.f_16010 <= 8 && f_11537.player.getInventory().getItem(this.f_16010).is(Items.WIND_CHARGE)) {
         f_11537.gameMode.useItem(f_11537.player, InteractionHand.MAIN_HAND);
         this.f_16013 = DimasikClient.m_9057().m_9052().m_6340().m_1750();
         if (this.f_16005.m_8768()) {
            Class_h78PE30BIJJYoUEk.m_7072(Class_h78PE30BIJJYoUEk.dpblX4sGlSoWbrTC.MainHand);
         }

         this.m_5583();
         this.f_16008 = this.f_16006.m_8768() ? WindHop.pxg204TVNshUIjE7.JUMP : WindHop.pxg204TVNshUIjE7.SWITCH_BACK;
      } else {
         this.m_777();
      }
   }

   private void m_5579() {
      this.f_16008 = WindHop.pxg204TVNshUIjE7.USE;
   }

   public WindHop() {
      super(f_16017, f_16018, Category.MOVEMENT);
      this.f_16004 = new CheckboxSetting(f_16019, true);
      this.f_16005 = new CheckboxSetting(f_16020, true);
      this.f_16006 = new CheckboxSetting(f_16021, true);
      this.f_16007 = new Class_I4ZLf1tdGfKiuaY4();
      this.f_16008 = WindHop.pxg204TVNshUIjE7.IDLE;
      this.f_16009 = -1;
      this.f_16010 = -1;
      this.f_16013 = -1000;
      this.f_16016 = this::m_5577;
      this.m_795(this.f_16004, this.f_16005, this.f_16006);
   }

   public boolean m_5580() {
      return this.f_16008 != WindHop.pxg204TVNshUIjE7.IDLE
         || f_11537.player != null && DimasikClient.m_9057().m_9052().m_6340().m_1750() - this.f_16013 <= 2 && this.m_776();
   }

   private void m_5581() {
      if (f_11537.player.onGround()) {
         this.f_16009 = f_11537.player.getInventory().selected;
         this.f_16010 = Class_h78PE30BIJJYoUEk.m_7077(Items.WIND_CHARGE, 0, 8);
         if (this.f_16010 != -1) {
            if (!this.f_16004.m_8768()) {
               if (!f_11537.player.getMainHandItem().is(Items.WIND_CHARGE)) {
                  return;
               }

               this.f_16010 = this.f_16009;
            }

            this.f_16007.m_2950(f_11537.player.getYRot(), f_16022);
            if (DimasikClient.m_9057().m_9049().m_2813().m_5177(this.f_16007, 20, 10)) {
               this.f_16015 = true;
               this.f_16011 = 0;
               this.f_16008 = WindHop.pxg204TVNshUIjE7.ROTATING;
            }
         }
      }
   }

   private void m_5582() {
      this.f_16008 = WindHop.pxg204TVNshUIjE7.IDLE;
      this.f_16009 = -1;
      this.f_16010 = -1;
      this.f_16011 = 0;
      this.f_16012 = 0;
      this.f_16014 = false;
      this.f_16015 = false;
   }

   private void m_5583() {
      if (this.f_16015) {
         DimasikClient.m_9057().m_9049().m_2813().m_5175(this.f_16007);
         this.f_16015 = false;
      }
   }

   private boolean m_5584() {
      return DimasikClient.m_9057().m_9049().m_2801().m_3576().m_1065();
   }

   private void m_5585() {
      if (this.f_16014) {
         f_11537.options.keyJump.setDown(false);
         this.f_16014 = false;
      }
   }

   private enum pxg204TVNshUIjE7 {
      IDLE,
      ROTATING,
      WAIT_SWITCH,
      JUMP,
      USE,
      SWITCH_BACK;
   }
}
