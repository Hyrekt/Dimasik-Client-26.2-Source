package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.render.Hud;
import dev.dimasik.client.setting.impl.SliderSetting;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.network.protocol.game.ClientboundEntityEventPacket;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.joml.Matrix4f;
import org.joml.Vector4f;

public class Class_yHuMNA1veUxr6eGN extends Class_NO6SuGqq3FB7jQDZ implements Class_OJntZb8PWlU5XrDj {
   private static final Identifier f_35350 = Class_wHRRCm2tlLY7DN4I.m_9311(Class_yHuMNA1veUxr6eGN.f_35466);
   private static final Identifier f_35351 = Class_wHRRCm2tlLY7DN4I.m_9311(Class_yHuMNA1veUxr6eGN.f_35467);
   private static final float f_35352 = 16.0F;
   private static final float f_35353 = 84.0F;
   private static final float f_35354 = 16.0F;
   private static final float f_35355 = 116.0F;
   private static final float f_35356 = 18.0F;
   private static final float f_35357 = 14.0F;
   private static final float f_35358 = 15.0F;
   private static final float f_35359 = 18.0F;
   private static final float f_35360 = 180.0F;
   private static final float f_35361 = 260.0F;
   private static final int f_35362 = 3;
   private static final int f_35363 = 5;
   private static final int f_35364 = Class_BftdentXEtGbugJw.m_2303(255, 96, 96, Class_yHuMNA1veUxr6eGN.f_35468);
   private static final long f_35365 = 4000L;
   private static final float f_35366 = 0.5F;
   private static final EquipmentSlot[] f_35367 = new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET};
   private final SliderSetting f_35368;
   private final Class_u8iL1f1cFf6CucWB f_35369;
   private final Class_w8fCJQ5ZtH5lQbWc f_35370;
   private final Class_w8fCJQ5ZtH5lQbWc f_35371;
   private final Class_w8fCJQ5ZtH5lQbWc f_35372;
   private final Class_QmNR03reugBgWiPr f_35373;
   private final Class_QmNR03reugBgWiPr f_35374;
   private final Class_QmNR03reugBgWiPr f_35375;
   private LivingEntity f_35376;
   private String f_35377;
   private float f_35378;
   private float f_35379;
   private int f_35380;
   private float f_35381;
   private float f_35382;
   private Class_yHuMNA1veUxr6eGN.Class_0JtNhdWsqgtIr5dX f_35383;
   private Class_yHuMNA1veUxr6eGN.Class_0JtNhdWsqgtIr5dX f_35384;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_35385;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_35386;
   private static final String f_35387 = "PvPAssist";
   private static final float f_35388 = 37.0F;
   private static final float f_35389 = 187.0F;
   private static final float f_35390 = 100.0F;
   private static final float f_35391 = 116.0F;
   private static final float f_35392 = 9.0F;
   private static final float f_35393 = 12.0F;
   private static final float f_35394 = 6.0F;
   private static final float f_35395 = -1.0F;
   private static final String f_35396 = "PvPAssist";
   private static final String f_35397 = "Размер";
   private static final String f_35398 = "PvP помощник";
   private static final float f_35399 = 0.01F;
   private static final float f_35400 = 180.0F;
   private static final float f_35401 = 260.0F;
   private static final float f_35402 = 132.0F;
   private static final float f_35403 = 116.0F;
   private static final float f_35404 = 116.0F;
   private static final float f_35405 = 0.05F;
   private static final float f_35406 = 255.0F;
   private static final float f_35407 = 18.0F;
   private static final float f_35408 = 1000.0F;
   private static final float f_35409 = 0.5F;
   private static final float f_35410 = 0.5F;
   private static final String f_35411 = "Отхилься у тебя мало ХП";
   private static final long f_35412 = 4000L;
   private static final long f_35413 = 4000L;
   private static final String f_35414 = "У тебя скоро сломается броня, Починись!";
   private static final String f_35415 = "Быстрее бей его, у него сейчас хрустнет броня!";
   private static final String f_35416 = "Помогаю тебе доминировать в бою";
   private static final float f_35417 = 58.0F;
   private static final float f_35418 = 58.0F;
   private static final float f_35419 = 84.0F;
   private static final float f_35420 = 0.999F;
   private static final float f_35421 = 0.86F;
   private static final float f_35422 = 0.14F;
   private static final float f_35423 = 0.86F;
   private static final float f_35424 = 0.14F;
   private static final float f_35425 = 0.01F;
   private static final float f_35426 = 0.2F;
   private static final float f_35427 = 255.0F;
   private static final float f_35428 = 255.0F;
   private static final float f_35429 = 1.2F;
   private static final float f_35430 = 0.8F;
   private static final float f_35431 = 1.8F;
   private static final float f_35432 = 6.0F;
   private static final float f_35433 = 0.07F;
   private static final String f_35434 = "N";
   private static final float f_35435 = 16.0F;
   private static final float f_35436 = 24.0F;
   private static final String f_35437 = "N";
   private static final float f_35438 = 20.0F;
   private static final String f_35439 = "PvP помощник";
   private static final float f_35440 = 7.0F;
   private static final float f_35441 = 20.0F;
   private static final float f_35442 = 42.0F;
   private static final float f_35443 = 6.0F;
   private static final float f_35444 = 58.0F;
   private static final float f_35445 = 0.999F;
   private static final float f_35446 = -16.0F;
   private static final float f_35447 = 16.0F;
   private static final float f_35448 = 0.01F;
   private static final float f_35449 = 18.0F;
   private static final float f_35450 = 44.0F;
   private static final float f_35451 = 255.0F;
   private static final float f_35452 = 18.0F;
   private static final float f_35453 = 18.0F;
   private static final float f_35454 = 6.0F;
   private static final float f_35455 = 2.5F;
   private static final float f_35456 = 0.12F;
   private static final String f_35457 = " ";
   private static final float f_35458 = 260.0F;
   private static final String f_35459 = "N";
   private static final float f_35460 = 7.0F;
   private static final float f_35461 = 15.0F;
   private static final float f_35462 = 14.0F;
   private static final float f_35463 = -1.0F;
   private static final float f_35464 = 100.0F;
   private static final String f_35465 = "%.2fx";
   private static final String f_35466 = "hud/pvpassist/win";
   private static final String f_35467 = "hud/pvpassist/lose";
   private static final double f_35468 = 255.0;

   private float m_9644(List<String> var1) {
      float var2 = 0.0F;

      for (String var4 : var1) {
         var2 = Math.max(var2, this.m_9652(var4));
      }

      return var2;
   }

   public void m_9646(Class_bhRaN0YSSLQRYjPo var1) {
      if (this.m_9670().m_6177().m_7145(f_35398) && f_11537.player != null) {
         Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
         this.f_35382 = this.f_35368.m_8768();
         this.m_9655();
         this.m_9669();
         this.f_35372.m_9283(1.0F);
         float var2 = this.f_35370.m_9288();
         if (!(var2 < f_35399) && this.f_35383 != null) {
            List var3 = this.m_9662(this.f_35383.text());
            float var4 = Math.clamp(Math.max(this.m_9644(var3), this.m_9648()), f_35400 * this.f_35382, f_35401 * this.f_35382);
            this.f_35371.m_9283(f_35402 * this.f_35382 + var4);
            float var5 = this.f_35371.m_9288();
            float var6 = f_35403 * this.f_35382;
            float var7 = this.m_3998();
            float var8 = this.m_3993();
            float var9 = var7 + f_35404 * this.f_35382;
            float var10 = this.f_35372.m_9288();
            float var11 = 1.0F + f_35405 * (1.0F - var2);
            this.m_4012(var5);
            this.m_4007(var6);
            this.m_4013();
            Class_Ssh31B3ljfKeWsvS.m_4864(f_35406 * var2);
            Class_FvJXUGWpZo3zYBW4.m_2692(var7, var8, var5, var6, var11);

            try {
               Class_Ssh31B3ljfKeWsvS.m_4848(var7, var8, var5, var6, f_35407 * this.f_35382);
               this.m_9664(var10);
               this.m_9660(var9, var4);
               this.m_9656(var9, var4, var10);
               this.m_9663(var5, var6, var10);
            } finally {
               Class_FvJXUGWpZo3zYBW4.m_2694(var7, var8, var5, var6, var11);
               Class_Ssh31B3ljfKeWsvS.m_4844();
               this.m_4005();
            }
         } else {
            this.m_9667();
         }
      } else {
         this.f_35369.m_9093();
         this.m_9667();
      }
   }

   private int m_9647() {
      return Math.max(1, Math.round(f_35462 * this.f_35382));
   }

   private float m_9648() {
      int var1 = this.m_9647();
      return Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9591(), f_35459, var1)
         + f_35460 * this.f_35382
         + Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(this.f_35377, var1, 0.0F);
   }

   @Override
   public boolean m_1340(float var1, float var2, int var3) {
      if (var3 == 1 && Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.m_3998(), this.m_3993(), this.m_1757(), this.m_1758())) {
         this.f_35369.m_9060(var1, var2);
         return true;
      } else {
         return this.f_35369.m_9070(var1, var2, var3);
      }
   }

   private int m_9649() {
      int var1 = Class_h78PE30BIJJYoUEk.m_7078(Items.TOTEM_OF_UNDYING);
      ItemStack var2 = f_11537.player.getOffhandItem();
      return var2.is(Items.TOTEM_OF_UNDYING) ? var1 + var2.getCount() : var1;
   }

   public Class_u8iL1f1cFf6CucWB m_9650() {
      return this.f_35369;
   }

   private int m_9651() {
      return Math.max(1, Math.round(f_35461 * this.f_35382));
   }

   private float m_9652(String var1) {
      return Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var1, this.m_9651(), 0.0F);
   }

   private void m_9653(Class_yHuMNA1veUxr6eGN.Class_0JtNhdWsqgtIr5dX var1, float var2, float var3, float var4) {
      if (!(var4 <= f_35448)) {
         List var5 = this.m_9662(var1.text());
         float var6 = f_35449 * this.f_35382;
         float var7 = this.m_3993() + f_35450 * this.f_35382 + (3 - var5.size()) * var6 / 2.0F + var3;
         int var8 = Class_BftdentXEtGbugJw.m_2306(
            Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT),
            Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT) / f_35451 * var4
         );

         for (int var9 = 0; var9 < var5.size(); var9++) {
            Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), (String)var5.get(var9), var2, var7 + var9 * var6, this.m_9651(), var8);
         }
      }
   }

   private void m_9654(Class_yHuMNA1veUxr6eGN.Class_0JtNhdWsqgtIr5dX var1, float var2, float var3, float var4, float var5) {
      if (!(var5 <= f_35425)) {
         float var6 = var2 - var4 / 2.0F;
         float var7 = var3 - var4 / 2.0F;
         float var8 = var4 * f_35426;
         int var9 = this.m_9659(var1);
         this.m_9666(var6, var7, var4, var8, var9, var5);
         Class_Ssh31B3ljfKeWsvS.m_4817(
            var6,
            var7,
            var4,
            var4,
            var8,
            Class_BftdentXEtGbugJw.m_2306(
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_BACKGROUND_TWO),
               Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.WINDOW_BACKGROUND_TWO) / f_35427 * var5
            )
         );
         Class_Ssh31B3ljfKeWsvS.m_4806(
            var6, var7, var4, var4, var8, new Vector4f(1.0F), Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_35428 * var5), var1.good() ? f_35350 : f_35351
         );
         Class_Ssh31B3ljfKeWsvS.m_4854(var6, var7, var4, var4, f_35429 * this.f_35382, var8, Class_BftdentXEtGbugJw.m_2306(var9, f_35430 * var5));
      }
   }

   private void m_9655() {
      Object var1 = DimasikClient.m_9057().m_9049().m_2801().m_3576().m_1114();
      if (var1 == null && this.f_35376 == null && f_11537.gui.screen() instanceof ChatScreen) {
         var1 = f_11537.player;
      }

      if (var1 != null) {
         if (var1 != this.f_35376) {
            this.f_35376 = (LivingEntity)var1;
            this.f_35380 = 0;
            this.f_35373.m_4459();
            this.f_35375.m_4465(0L);
         }

         this.f_35377 = ((LivingEntity) var1).getName().getString();
         this.f_35378 = this.m_9657((LivingEntity)var1);
         this.f_35379 = this.m_9665((LivingEntity)var1);
      }
   }

   private void m_9656(float var1, float var2, float var3) {
      Class_Ssh31B3ljfKeWsvS.m_4860(var1 - 2.0F * this.f_35382, this.m_3993() + f_35442 * this.f_35382, var2 + f_35443 * this.f_35382, f_35444 * this.f_35382);
      if (this.f_35384 != null && var3 < f_35445) {
         this.m_9653(this.f_35384, var1, f_35446 * this.f_35382 * var3, 1.0F - var3);
      }

      this.m_9653(this.f_35383, var1, f_35447 * this.f_35382 * (1.0F - var3), var3);
      Class_Ssh31B3ljfKeWsvS.m_4828();
   }

   private float m_9657(LivingEntity var1) {
      return DimasikClient.m_9057().m_9049().m_2801().m_3487().m_776()
         ? Math.max(0.0F, Class_g3Fg4YmMuzK7loFX.m_6757(var1))
         : var1.getHealth() + var1.getAbsorptionAmount();
   }

   @Override
   public void m_3992() {
      this.f_35369.m_9082();
   }

   public void m_9658(Class_XzpX8S5F5zd9jbuE var1) {
      if (var1.m_5619() instanceof ClientboundEntityEventPacket var2 && f_11537.level != null) {
         if (var2.getEventId() == 35) {
            Entity var4 = var2.getEntity(f_11537.level);
            if (var4 != null) {
               if (var4 == f_11537.player) {
                  this.f_35374.m_4459();
               } else if (var4 == this.f_35376) {
                  this.f_35375.m_4459();
               }
            }
         }
      }
   }

   private int m_9659(Class_yHuMNA1veUxr6eGN.Class_0JtNhdWsqgtIr5dX var1) {
      return var1.good() ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : f_35364;
   }

   private void m_9660(float var1, float var2) {
      int var3 = this.m_9647();
      float var4 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9591(), f_35434, var3);
      Class_Ssh31B3ljfKeWsvS.m_4860(var1, this.m_3993() + f_35435 * this.f_35382, var2, f_35436 * this.f_35382);
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9591(),
         f_35437,
         var1,
         this.m_3993() + f_35438 * this.f_35382,
         var3,
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN)
      );
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         this.f_35377.isEmpty() ? f_35439 : this.f_35377,
         var1 + var4 + f_35440 * this.f_35382,
         this.m_3993() + f_35441 * this.f_35382,
         var3,
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT)
      );
      Class_Ssh31B3ljfKeWsvS.m_4828();
   }

   @Override
   public void m_1333() {
      this.f_35369.m_9093();
   }

   private void m_9661(Class_yHuMNA1veUxr6eGN.Class_0JtNhdWsqgtIr5dX var1) {
      if (this.f_35383 == null) {
         this.f_35383 = var1;
         this.f_35372.m_9281(1.0F);
      } else if (!this.f_35383.text().equals(var1.text())) {
         this.f_35384 = this.f_35383;
         this.f_35383 = var1;
         this.f_35372.m_9281(0.0F);
      }
   }

   private List<String> m_9662(String var1) {
      ArrayList var2 = new ArrayList(3);
      StringBuilder var3 = new StringBuilder();

      for (String var7 : var1.split(f_35457)) {
         String var8 = var3.isEmpty() ? var7 : var3 + var7;
         if (!var3.isEmpty() && !(this.m_9652(var8) <= f_35458 * this.f_35382)) {
            var2.add(var3.toString());
            var3.setLength(0);
            var3.append(var7);
            if (var2.size() == 3) {
               return var2;
            }
         } else {
            var3.setLength(0);
            var3.append(var8);
         }
      }

      if (!var3.isEmpty()) {
         var2.add(var3.toString());
      }

      return var2;
   }

   private void m_9663(float var1, float var2, float var3) {
      float var4 = this.m_3998() + f_35452 * this.f_35382;
      float var5 = var1 - f_35453 * this.f_35382 * 2.0F;
      float var6 = this.m_3993() + var2 - f_35454 * this.f_35382;
      float var7 = f_35455 * this.f_35382;
      int var8 = this.f_35384 == null ? this.m_9659(this.f_35383) : Class_BftdentXEtGbugJw.m_2302(this.m_9659(this.f_35384), this.m_9659(this.f_35383), var3);
      Class_Ssh31B3ljfKeWsvS.m_4817(
         var4, var6, var5, var7, var7 / 2.0F, Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT), f_35456)
      );
      Class_Ssh31B3ljfKeWsvS.m_4817(var4, var6, Math.max(var7, var5 * this.f_35381), var7, var7 / 2.0F, var8);
   }

   private void m_9664(float var1) {
      float var2 = this.m_3998() + f_35417 * this.f_35382;
      float var3 = this.m_3993() + f_35418 * this.f_35382;
      float var4 = f_35419 * this.f_35382;
      if (this.f_35384 != null && var1 < f_35420) {
         this.m_9654(this.f_35384, var2, var3, var4 * (f_35421 + f_35422 * (1.0F - var1)), 1.0F - var1);
      }

      this.m_9654(this.f_35383, var2, var3, var4 * (f_35423 + f_35424 * var1), var1);
   }

   private float m_9665(LivingEntity var1) {
      float var2 = f_35463;

      for (EquipmentSlot var6 : f_35367) {
         ItemStack var7 = var1.getItemBySlot(var6);
         if (!var7.isEmpty() && var7.isDamageableItem() && var7.getMaxDamage() > 0) {
            float var8 = (var7.getMaxDamage() - var7.getDamageValue()) * f_35464 / var7.getMaxDamage();
            if (var2 < 0.0F || var8 < var2) {
               var2 = var8;
            }
         }
      }

      return var2;
   }

   private void m_9666(float var1, float var2, float var3, float var4, int var5, float var6) {
      for (int var7 = 5; var7 > 0; var7--) {
         float var8 = var7 * f_35431 * this.f_35382;
         float var9 = 1.0F - var7 / f_35432;
         Class_Ssh31B3ljfKeWsvS.m_4817(
            var1 - var8, var2 - var8, var3 + var8 * 2.0F, var3 + var8 * 2.0F, var4 + var8, Class_BftdentXEtGbugJw.m_2306(var5, f_35433 * var9 * var6)
         );
      }
   }

   private void m_9667() {
      this.m_4012(0.0F);
      this.m_4007(0.0F);
   }

   private List<Class_yHuMNA1veUxr6eGN.Class_0JtNhdWsqgtIr5dX> m_9668() {
      ArrayList var1 = new ArrayList();
      if (!this.f_35377.isEmpty()) {
         float var2 = this.m_9657(f_11537.player);
         if (var2 > this.f_35378 + f_35409) {
            var1.add(new Class_yHuMNA1veUxr6eGN.Class_0JtNhdWsqgtIr5dX(this.f_35377 + "", true));
         } else if (var2 < this.f_35378 - f_35410) {
            var1.add(new Class_yHuMNA1veUxr6eGN.Class_0JtNhdWsqgtIr5dX(f_35411, false));
         }

         if (!this.f_35375.m_4463(f_35412)) {
            var1.add(new Class_yHuMNA1veUxr6eGN.Class_0JtNhdWsqgtIr5dX(this.f_35377 + "", true));
         }

         if (!this.f_35374.m_4463(f_35413)) {
            var1.add(new Class_yHuMNA1veUxr6eGN.Class_0JtNhdWsqgtIr5dX(this.m_9649() + "", false));
         }

         float var3 = this.m_9665(f_11537.player);
         float var4 = this.m_9670().m_6171().m_8768();
         if (var3 >= 0.0F && this.f_35379 >= 0.0F) {
            if (var3 < this.f_35379 && var3 <= var4) {
               var1.add(new Class_yHuMNA1veUxr6eGN.Class_0JtNhdWsqgtIr5dX(f_35414, false));
            } else if (this.f_35379 < var3 && this.f_35379 <= var4) {
               var1.add(new Class_yHuMNA1veUxr6eGN.Class_0JtNhdWsqgtIr5dX(f_35415, true));
            }
         }
      }

      if (var1.isEmpty() && f_11537.gui.screen() instanceof ChatScreen) {
         var1.add(new Class_yHuMNA1veUxr6eGN.Class_0JtNhdWsqgtIr5dX(f_35416, true));
      }

      return var1;
   }

   private void m_9669() {
      List var1 = this.m_9668();
      this.f_35370.m_9283(var1.isEmpty() ? 0.0F : 1.0F);
      if (!var1.isEmpty()) {
         long var2 = (long)(this.m_9670().m_6189().m_8768() * f_35408);
         if (var1.size() > 1 && this.f_35373.m_4461(var2, true)) {
            this.f_35380++;
         }

         this.f_35381 = var1.size() > 1 ? Math.clamp((float)this.f_35373.m_4460() / (float)var2, 0.0F, 1.0F) : 1.0F;
         this.m_9661((Class_yHuMNA1veUxr6eGN.Class_0JtNhdWsqgtIr5dX)var1.get(Math.floorMod(this.f_35380, var1.size())));
      }
   }

   public Class_yHuMNA1veUxr6eGN(SliderSetting var1) {
      super(f_35387, f_35388, f_35389, f_35390, f_35391);
      this.f_35370 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_35392, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_35371 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_35393, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_35372 = new Class_w8fCJQ5ZtH5lQbWc(1.0F, f_35394, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_35373 = new Class_QmNR03reugBgWiPr();
      this.f_35374 = new Class_QmNR03reugBgWiPr();
      this.f_35375 = new Class_QmNR03reugBgWiPr();
      this.f_35377 = "";
      this.f_35379 = f_35395;
      this.f_35381 = 1.0F;
      this.f_35382 = 1.0F;
      this.f_35385 = this::m_9646;
      this.f_35386 = this::m_9658;
      this.f_35368 = var1;
      this.f_35369 = new Class_u8iL1f1cFf6CucWB(f_35396, f_35397, var1, var0 -> String.format(Locale.US, f_35465, var0));
      this.f_35374.m_4465(0L);
      this.f_35375.m_4465(0L);
   }

   private Hud m_9670() {
      return DimasikClient.m_9057().m_9049().m_2801().m_3433();
   }

   private record Class_0JtNhdWsqgtIr5dX(String text, boolean good) {
   }
}
