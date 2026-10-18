package dev.dimasik.client.module.misc;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.IntegerSetting;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.system.Class_21JsiqqLzgnqk2Dg;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_3LQSDrJ0WJYOQ7ck;
import dev.dimasik.client.system.Class_B6JOzHnwhU3pe4AO;
import dev.dimasik.client.system.Class_B6vpBUNmRtH3JzmV;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_h78PE30BIJJYoUEk;
import net.minecraft.network.protocol.game.ServerboundPlayerCommandPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerCommandPacket.Action;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Items;

public class ElytraSwap extends Module {
   private final MultiChoiceSetting f_34385;
   private final ItemListSetting f_34386;
   private final IntegerSetting f_34387;
   private final IntegerSetting f_34388;
   private final Class_21JsiqqLzgnqk2Dg f_34389;
   private boolean f_34390;
   private boolean f_34391;
   private boolean f_34392;
   private int f_34393;
   private int f_34394;
   private String f_34395;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_34396;
   private final Class_gEPk7yDw6CwIte87<Class_B6JOzHnwhU3pe4AO> f_34397;
   private static final String f_34398 = "ElytraSwap";
   private static final String f_34399 = "Помощник элитр";
   private static final String f_34400 = "Мод запуска фейверка";
   private static final String f_34401 = "Рейджовый";
   private static final String f_34402 = "Легитный";
   private static final String f_34403 = "Прочие настройки";
   private static final String f_34404 = "Авто взлет";
   private static final String f_34405 = "Клавиша элитр";
   private static final String f_34406 = "Клавиша фейерверка";
   private static final String f_34407 = "Легитный";
   private static final String f_34408 = "Легитный";
   private static final String f_34409 = "chestplate";
   private static final String f_34410 = "elytra";
   private static final String f_34411 = "firework";
   private static final String f_34412 = "Авто взлет";

   private boolean m_9326() {
      return this.f_34386.m_7145(f_34412)
         && this.f_34392
         && f_11537.player.getItemBySlot(EquipmentSlot.CHEST).getItem().equals(Items.ELYTRA)
         && !f_11537.player.isFallFlying();
   }

   @Override
   public void m_732() {
      this.f_34389.m_914().clear();
   }

   private boolean m_9330() {
      if (!this.f_34391) {
         return false;
      }

      this.f_34394 = Class_B6vpBUNmRtH3JzmV.m_2128(Items.FIREWORK_ROCKET);
      this.f_34395 = f_34411;
      this.f_34391 = false;
      return this.f_34394 >= 0;
   }

   private void m_9333() {
      if (Class_B6vpBUNmRtH3JzmV.m_2126(this.f_34394)) {
         Class_B6vpBUNmRtH3JzmV.m_2131(Class_B6vpBUNmRtH3JzmV.m_2127(this.f_34394));
         f_11537.gameMode.useItem(f_11537.player, InteractionHand.MAIN_HAND);
         Class_B6vpBUNmRtH3JzmV.m_2131(f_11537.player.getInventory().selected);
      } else {
         this.f_34389.m_925(this.f_34389.m_907(), this.f_34394);
         Class_B6vpBUNmRtH3JzmV.m_2131(this.f_34389.m_907());
         f_11537.gameMode.useItem(f_11537.player, InteractionHand.MAIN_HAND);
         Class_B6vpBUNmRtH3JzmV.m_2131(f_11537.player.getInventory().selected);
         this.f_34389.m_925(this.f_34389.m_907(), this.f_34394);
      }
   }

   private void m_9334() {
      if (Class_B6vpBUNmRtH3JzmV.m_2126(this.f_34393)) {
         this.f_34389.m_925(Class_B6vpBUNmRtH3JzmV.m_2127(this.f_34393), 6);
      } else {
         this.f_34389.m_925(this.f_34389.m_907(), this.f_34393);
         this.f_34389.m_925(this.f_34389.m_907(), 6);
         this.f_34389.m_925(this.f_34389.m_907(), this.f_34393);
      }

      this.f_34392 = true;
      this.f_34393 = -1;
   }

   private void m_9335() {
      if (f_11537.player.onGround()) {
         f_11537.player.jumpFromGround();
      } else {
         f_11537.player.startFallFlying();
         Class_3LQSDrJ0WJYOQ7ck.m_1293(new ServerboundPlayerCommandPacket(f_11537.player, Action.START_FALL_FLYING));
      }
   }

   private void m_9336() {
      int var1 = this.f_34393;
      if (Class_B6vpBUNmRtH3JzmV.m_2126(var1)) {
         this.f_34389.m_923(this.f_34395, () -> this.f_34389.m_925(Class_B6vpBUNmRtH3JzmV.m_2127(var1), 6), () -> {
            this.f_34389.m_921();
            this.f_34392 = true;
         });
      } else {
         this.f_34389.m_923(this.f_34395, () -> {
            this.f_34389.m_925(this.f_34389.m_907(), var1);
            this.f_34389.m_925(this.f_34389.m_907(), 6);
            this.f_34389.m_925(this.f_34389.m_907(), var1);
         }, () -> {
            this.f_34389.m_921();
            this.f_34392 = true;
         });
      }

      this.f_34393 = -1;
   }

   public void m_9337(Class_Xu9btcIeUN33XnMK var1) {
      if (this.m_9339()) {
         if (DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5152().m_7568(f_34407)) {
            this.m_9336();
         } else {
            this.m_9334();
         }
      } else if (this.m_9330()) {
         if (this.f_34385.m_7568(f_34408)) {
            this.m_9338();
         } else {
            this.m_9333();
         }
      } else if (this.m_9326()) {
         this.m_9335();
      }
   }

   private void m_9338() {
      int var1 = this.f_34394;
      if (Class_B6vpBUNmRtH3JzmV.m_2126(var1)) {
         Runnable var2 = () -> {
            Class_B6vpBUNmRtH3JzmV.m_2131(Class_B6vpBUNmRtH3JzmV.m_2127(var1));
            f_11537.gameMode.useItem(f_11537.player, InteractionHand.MAIN_HAND);
         };
         Runnable var3 = () -> Class_B6vpBUNmRtH3JzmV.m_2131(f_11537.player.getInventory().selected);
         this.f_34389.m_908(this.f_34395, 1, var2, var3);
      } else {
         Runnable var4 = () -> {
            this.f_34389.m_925(this.f_34389.m_907(), var1);
            this.f_34389.m_921();
            Class_B6vpBUNmRtH3JzmV.m_2131(this.f_34389.m_907());
            f_11537.gameMode.useItem(f_11537.player, InteractionHand.MAIN_HAND);
         };
         Runnable var5 = () -> {
            Class_B6vpBUNmRtH3JzmV.m_2131(f_11537.player.getInventory().selected);
            this.f_34389.m_925(this.f_34389.m_907(), var1);
            this.f_34389.m_921();
         };
         this.f_34389.m_905(this.f_34395, 1, var4, var5);
      }
   }

   private boolean m_9339() {
      if (!this.f_34390) {
         return false;
      }

      if (f_11537.player.getItemBySlot(EquipmentSlot.CHEST).getItem().equals(Items.ELYTRA)) {
         this.f_34393 = Class_h78PE30BIJJYoUEk.m_7070();
         this.f_34395 = f_34409;
      } else {
         this.f_34393 = Class_B6vpBUNmRtH3JzmV.m_2128(Items.ELYTRA);
         this.f_34395 = f_34410;
      }

      this.f_34390 = false;
      return this.f_34393 >= 0;
   }

   public ElytraSwap() {
      super(f_34398, f_34399, Category.MISC);
      this.f_34385 = new MultiChoiceSetting(f_34400, new Class_2ZaVm8TGDJ68TnJB(f_34401), new Class_2ZaVm8TGDJ68TnJB(f_34402));
      this.f_34386 = new ItemListSetting(f_34403, new Class_2ZaVm8TGDJ68TnJB(f_34404));
      this.f_34387 = new IntegerSetting(f_34405, -1);
      this.f_34388 = new IntegerSetting(f_34406, -1);
      this.f_34389 = new Class_21JsiqqLzgnqk2Dg();
      this.f_34393 = -1;
      this.f_34394 = -1;
      this.f_34395 = null;
      this.f_34396 = this::m_9337;
      this.f_34397 = this::m_9342;
      this.m_795(this.f_34385, this.f_34386, this.f_34387, this.f_34388);
   }

   public void m_9342(Class_B6JOzHnwhU3pe4AO var1) {
      int var2 = Class_B6vpBUNmRtH3JzmV.m_2128(Items.FIREWORK_ROCKET);
      if (f_11537.gui.screen() == null && var1.m_2116() == 1) {
         if (var1.m_2117() == this.f_34387.m_8768()) {
            this.f_34392 = false;
            this.f_34390 = true;
         } else if (var1.m_2117() == this.f_34388.m_8768()
            && f_11537.player.isFallFlying()
            && f_11537.player.getItemBySlot(EquipmentSlot.CHEST).getItem().equals(Items.ELYTRA)
            && var2 >= 0) {
            this.f_34391 = true;
         }
      }
   }
}
