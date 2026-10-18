package dev.dimasik.client.system;

import dev.dimasik.client.setting.impl.ItemListSetting;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import lombok.Generated;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionContents;

public final class Class_ND5nzva71juYlk72 extends Class_NO6SuGqq3FB7jQDZ implements Class_OJntZb8PWlU5XrDj {
   private final ItemListSetting f_11490;
   private final ArrayList<Class_MP0Q3Izlf2HSndyS> f_11491 = new ArrayList<>();
   private final Class_u8iL1f1cFf6CucWB f_11492;
   private Class_oRlzNKqPjTwmgkNL f_11493;
   private Class_oRlzNKqPjTwmgkNL f_11494;
   private Class_MP0Q3Izlf2HSndyS f_11495;
   private long f_11496;
   private static final String f_11497 = "Notifications";
   private static final float f_11498 = -1.0F;
   private static final String f_11499 = "Уведомления";
   private static final String f_11500 = "Показывать";
   private static final float f_11501 = 0.5F;
   private static final float f_11502 = 0.5F;
   private static final float f_11503 = 42.0F;
   private static final long f_11504 = 2000000000L;
   private static final String f_11505 = "Выберите уведомления через ПКМ";
   private static final String f_11506 = "Player";
   private static final String f_11507 = "TNT рядом — взорвётся через 2 сек.";
   private static final String f_11508 = "H";
   private static final String f_11509 = "Модуль Beautiful включён";
   private static final String f_11510 = "H";
   private static final String f_11511 = "Инвентарь отсортирован";
   private static final long f_11512 = 2000L;

   public float m_3991() {
      return this.f_11519;
   }

   @Override
   public void m_1333() {
      this.f_11492.m_9093();
      this.m_4000();
   }

   @Override
   public void m_3992() {
      this.f_11492.m_9082();
   }

   @Override
   public float m_3993() {
      return this.m_3999() + Class_w94t5R4ZHRA02uGb.m_9296(this);
   }

   public Class_ND5nzva71juYlk72(ItemListSetting var1) {
      super(f_11497, 0.0F, f_11498, 0.0F, 0.0F);
      this.f_11490 = var1;
      this.f_11492 = new Class_u8iL1f1cFf6CucWB(f_11499, f_11500, var1);
   }

   private Class_oRlzNKqPjTwmgkNL m_3995(Class_MP0Q3Izlf2HSndyS var1) {
      ItemStack var2 = ItemStack.EMPTY;
      String var3 = "";
      int var5 = Class_BftdentXEtGbugJw.m_2304(0);
      String var4;
      if (var1 == null) {
         var4 = f_11505;
      } else {
         switch (var1) {
            case ARMOR:
               var2 = new ItemStack(ThreadLocalRandom.current().nextBoolean() ? Items.DIAMOND_HELMET : Items.DIAMOND_CHESTPLATE);
               int var7 = ThreadLocalRandom.current().nextBoolean() ? 5 : 10;
               var2.setDamageValue(var2.getMaxDamage() - Math.max(1, var2.getMaxDamage() * var7 / 100));
               var4 = var2.getHoverName().getString() + var7;
               var5 = Class_BftdentXEtGbugJw.m_2310(255, 180, 65);
               break;
            case EFFECTS:
               var2 = new ItemStack(Items.POTION);
               var2.set(DataComponents.POTION_CONTENTS, PotionContents.EMPTY.withEffectAdded(new MobEffectInstance(MobEffects.SPEED, 40)));
               var4 = PotionContents.getPotionDescription(MobEffects.SPEED, 0).getString() + "";
               break;
            case SELF_USE:
            case PLAYER_USE:
               var2 = new ItemStack(ThreadLocalRandom.current().nextBoolean() ? Items.GOLDEN_APPLE : Items.ENCHANTED_GOLDEN_APPLE);
               String var6 = var1 == Class_MP0Q3Izlf2HSndyS.SELF_USE ? f_11537.player.getName().getString() : f_11506;
               var4 = var6 + var2.getHoverName().getString();
               break;
            case TNT:
               var2 = new ItemStack(Items.TNT);
               var4 = f_11507;
               var5 = Class_BftdentXEtGbugJw.m_2310(255, 70, 70);
               break;
            case MODULES:
               var3 = f_11508;
               var4 = f_11509;
               break;
            default:
               var3 = f_11510;
               var4 = f_11511;
         }
      }

      return new Class_3q8kKNGNpsKuAxlp(var3, Component.literal(var4), var5, var2, f_11512);
   }

   @Generated
   public Class_oRlzNKqPjTwmgkNL m_3996() {
      return this.f_11493;
   }

   @Override
   public void m_3997(float var1) {
   }

   @Override
   public float m_3998() {
      return (f_11537.getWindow().getScreenWidth() - this.m_1757()) * f_11501;
   }

   @Override
   public float m_3999() {
      float var1 = this.f_11519 < 0.0F ? f_11537.getWindow().getScreenHeight() * f_11502 + f_11503 : this.f_11519;
      return Math.clamp(var1, 0.0F, Math.max(0.0F, f_11537.getWindow().getScreenHeight() - this.m_1758()));
   }

   public void m_4000() {
      this.f_11493 = null;
      this.f_11494 = null;
      this.f_11495 = null;
      this.f_11496 = 0L;
   }

   @Override
   public boolean m_1340(float var1, float var2, int var3) {
      if (!(f_11537.gui.screen() instanceof ChatScreen) || !this.m_4011()) {
         return false;
      } else if (this.f_11492.m_9070(var1, var2, var3)) {
         return true;
      } else if (var3 == 1 && Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.m_3998(), this.m_3993(), this.m_1757(), this.m_1758())) {
         this.f_11492.m_9091(this.m_3998(), this.m_3993(), this.m_1757());
         return true;
      } else {
         return false;
      }
   }

   @Generated
   public Class_oRlzNKqPjTwmgkNL m_4001() {
      return this.f_11494;
   }

   public void m_4002() {
      if (f_11537.gui.screen() instanceof ChatScreen && f_11537.player != null) {
         long var1 = System.nanoTime();
         if (this.f_11493 == null
            || var1 >= this.f_11496
            || this.f_11495 != null && !this.f_11495.m_3887(this.f_11490)
            || this.f_11495 == null && !this.f_11490.m_8768().stream().noneMatch(var0 -> var0.m_1187())) {
            this.f_11491.clear();

            for (Class_MP0Q3Izlf2HSndyS var6 : Class_MP0Q3Izlf2HSndyS.values()) {
               if (var6.m_3887(this.f_11490)) {
                  this.f_11491.add(var6);
               }
            }

            if (this.f_11491.size() > 1) {
               this.f_11491.remove(this.f_11495);
            }

            Class_MP0Q3Izlf2HSndyS var7 = this.f_11491.isEmpty() ? null : this.f_11491.get(ThreadLocalRandom.current().nextInt(this.f_11491.size()));
            this.f_11494 = this.f_11493;
            if (this.f_11494 != null) {
               this.f_11494.m_7756();
            }

            this.f_11493 = this.m_3995(var7);
            this.f_11495 = var7;
            this.f_11496 = var1 + f_11504;
         }
      } else {
         this.m_4000();
      }
   }

   @Generated
   public Class_u8iL1f1cFf6CucWB m_4003() {
      return this.f_11492;
   }
}
