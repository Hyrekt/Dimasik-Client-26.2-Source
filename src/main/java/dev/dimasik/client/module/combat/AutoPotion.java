package dev.dimasik.client.module.combat;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_I4ZLf1tdGfKiuaY4;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_h78PE30BIJJYoUEk;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.game.ClientboundBossEventPacket;
import net.minecraft.network.protocol.game.ClientboundBossEventPacket.Handler;
import net.minecraft.util.StringUtil;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.BossEvent.BossBarColor;
import net.minecraft.world.BossEvent.BossBarOverlay;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.phys.AABB;

public final class AutoPotion extends Module {
   private final CheckboxSetting f_7165;
   private final ItemListSetting f_7166;
   private final Class_I4ZLf1tdGfKiuaY4 f_7167;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_7168;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_7169;
   private int f_7170;
   private boolean f_7171;
   private boolean f_7172;
   private UUID f_7173;
   private static final String f_7174 = "Auto Potion";
   private static final String f_7175 = "Автоматически использует зелья, бросая их под себя";
   private static final String f_7176 = "Только при пвп";
   private static final String f_7177 = "Что кидать?";
   private static final String f_7178 = "Силка";
   private static final String f_7179 = "Скорка";
   private static final String f_7180 = "Огнестойка";
   private static final String f_7181 = "Исцеление";
   private static final String f_7182 = "Скорка";
   private static final String f_7183 = "Силка";
   private static final String f_7184 = "Огнестойка";
   private static final String f_7185 = "Исцеление";
   private static final float f_7186 = 90.0F;
   private static final float f_7187 = 90.0F;
   private static final double f_7188 = -0.5;

   private int m_2577(boolean var1, Holder<MobEffect> var2) {
      int var3 = var1 ? 9 : 36;

      for (int var4 = 0; var4 < var3; var4++) {
         ItemStack var5 = f_11537.player.getInventory().getItem(var4);
         if (this.m_2582(var5, var2)) {
            return var4;
         }
      }

      return -1;
   }

   private boolean m_2578() {
      if (f_11537.player.getY() < 0.0) {
         return false;
      }

      AABB var1 = f_11537.player.getBoundingBox().move(0.0, f_7188, 0.0);
      return !f_11537.level.getBlockCollisions(f_11537.player, var1).iterator().hasNext();
   }

   private void m_2579(List<Integer> var1, boolean var2) {
      if (var2 && !(f_11537.player.getHealth() >= f_11537.player.getMaxHealth())) {
         this.m_2585(var1, MobEffects.INSTANT_HEALTH);
      }
   }

   @Override
   public void m_778() {
      this.f_7170 = 20;
      this.f_7171 = false;
      super.m_778();
   }

   @Override
   public void m_732() {
      this.m_2583();
      this.f_7170 = 20;
      super.m_732();
   }

   private void m_2580(List<Integer> var1, boolean var2, Holder<MobEffect> var3) {
      if (var2 && !f_11537.player.hasEffect(var3)) {
         this.m_2585(var1, var3);
      }
   }

   private void m_2581(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null && f_11537.gameMode != null) {
         this.f_7170++;
         ArrayList var2 = new ArrayList();
         this.m_2580(var2, this.f_7166.m_7145(f_7182), MobEffects.SPEED);
         this.m_2580(var2, this.f_7166.m_7145(f_7183), MobEffects.STRENGTH);
         this.m_2580(var2, this.f_7166.m_7145(f_7184), MobEffects.FIRE_RESISTANCE);
         this.m_2579(var2, this.f_7166.m_7145(f_7185));
         if (this.f_7165.m_8768() && !this.f_7172) {
            this.m_2583();
         } else if (this.f_7170 >= 20 && !this.m_2578() && !var2.isEmpty()) {
            this.f_7167.m_2950(f_11537.player.getYRot(), f_7186);
            if (DimasikClient.m_9057().m_9049().m_2813().m_5177(this.f_7167, 10, 1)) {
               this.f_7171 = true;
               if (!(Math.abs(f_7187 - f_11537.player.getXRot()) > 1.0F)) {
                  int var3 = f_11537.player.getInventory().getSelectedSlot();

                  for (int var5 : (Iterable<Integer>) (Iterable) var2) {
                     if (var5 < 9) {
                        Class_h78PE30BIJJYoUEk.m_7082(var5);
                        f_11537.gameMode.useItem(f_11537.player, InteractionHand.MAIN_HAND);
                     } else {
                        f_11537.gameMode.handleContainerInput(0, var5, var3, ContainerInput.SWAP, f_11537.player);
                        Class_h78PE30BIJJYoUEk.m_7082(var3);
                        f_11537.gameMode.useItem(f_11537.player, InteractionHand.MAIN_HAND);
                        f_11537.gameMode.handleContainerInput(0, var5, var3, ContainerInput.SWAP, f_11537.player);
                     }
                  }

                  Class_h78PE30BIJJYoUEk.m_7082(var3);
                  this.f_7170 = 0;
                  this.m_2583();
               }
            }
         } else {
            this.m_2583();
         }
      }
   }

   private boolean m_2582(ItemStack var1, Holder<MobEffect> var2) {
      if (var1 != null && !var1.isEmpty() && var1.is(Items.SPLASH_POTION)) {
         PotionContents var3 = (PotionContents)var1.get(DataComponents.POTION_CONTENTS);
         if (var3 == null) {
            return false;
         }

         for (MobEffectInstance var5 : var3.getAllEffects()) {
            if (var5.getEffect().equals(var2)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private void m_2583() {
      if (this.f_7171) {
         DimasikClient.m_9057().m_9049().m_2813().m_5175(this.f_7167);
         this.f_7171 = false;
      }
   }

   public AutoPotion() {
      super(f_7174, f_7175, Category.COMBAT);
      this.f_7165 = new CheckboxSetting(f_7176, true);
      this.f_7166 = new ItemListSetting(
         f_7177,
         new Class_2ZaVm8TGDJ68TnJB(f_7178, true),
         new Class_2ZaVm8TGDJ68TnJB(f_7179, true),
         new Class_2ZaVm8TGDJ68TnJB(f_7180, true),
         new Class_2ZaVm8TGDJ68TnJB(f_7181, true)
      );
      this.f_7167 = new Class_I4ZLf1tdGfKiuaY4();
      this.f_7168 = this::m_2581;
      this.f_7169 = this::m_2584;
      this.f_7170 = 20;
      this.m_795(this.f_7165, this.f_7166);
   }

   private void m_2584(Class_XzpX8S5F5zd9jbuE var1) {
      if (var1.m_5619() instanceof ClientboundBossEventPacket var2) {
         var2.dispatch(new Handler() {
            public static final String f_7163 = "pvp";
            public static final String f_7164 = "у вас осталось";

            public void remove(UUID var1) {
               if (AutoPotion.this.f_7173 != null && AutoPotion.this.f_7173.equals(var1)) {
                  AutoPotion.this.f_7172 = false;
                  AutoPotion.this.f_7173 = null;
               }
            }

            public void add(UUID var1, Component var2x, float var3, BossBarColor var4, BossBarOverlay var5, boolean var6, boolean var7, boolean var8) {
               String var9 = StringUtil.stripColor(var2x.getString()).toLowerCase(Locale.ROOT);
               if (var9.contains(f_7163) || var9.contains(f_7164)) {
                  AutoPotion.this.f_7172 = true;
                  AutoPotion.this.f_7173 = var1;
               }
            }
         });
      }
   }

   private void m_2585(List<Integer> var1, Holder<MobEffect> var2) {
      int var3 = this.m_2577(true, var2);
      if (var3 != -1) {
         var1.add(var3);
      } else {
         int var4 = this.m_2577(false, var2);
         if (var4 != -1) {
            var1.add(var4);
         }
      }
   }
}
