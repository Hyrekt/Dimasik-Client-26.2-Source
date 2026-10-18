package dev.dimasik.client.system;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.level.Level;

public final class Class_bYDeIFrnJe97cH9q {
   private static final EquipmentSlot[] f_17717 = new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET};
   private final Map<EquipmentSlot, Class_bYDeIFrnJe97cH9q.TDqhfQLQ6e542RIu> f_17718 = new EnumMap<>(EquipmentSlot.class);
   private final Map<Holder<MobEffect>, Class_bYDeIFrnJe97cH9q.z3HhD59buvqZo1tx> f_17719 = new HashMap<>();
   private final Set<Holder<MobEffect>> f_17720 = new HashSet<>();
   private Player f_17721;
   private Level f_17722;
   private static final double f_17723 = 100.0;
   private static final double f_17724 = 10.0;
   private static final double f_17725 = 5.0;
   private static final double f_17726 = 5.0;
   private static final String f_17727 = "Скоро сломается: ";
   private static final String f_17728 = " — осталось ";
   private static final double f_17729 = 200.0;
   private static final double f_17730 = 100.0;
   private static final String f_17731 = "Скоро закончится эффект: ";
   private static final String f_17732 = " — осталось ";

   private void m_6076(Player var1) {
      this.f_17720.clear();

      for (MobEffectInstance var3 : var1.getActiveEffects()) {
         if (!var3.isInfiniteDuration()
            && var3.getDuration() > 0
            && !var3.isAmbient()
            && var3.showIcon()
            && !((MobEffect)var3.getEffect().value()).isInstantaneous()) {
            Holder var4 = var3.getEffect();
            this.f_17720.add(var4);
            Class_bYDeIFrnJe97cH9q.z3HhD59buvqZo1tx var5 = this.f_17719.get(var4);
            if (var5 == null || var5.f_17715 != var3.getAmplifier()) {
               var5 = new Class_bYDeIFrnJe97cH9q.z3HhD59buvqZo1tx(var3.getAmplifier());
               this.f_17719.put(var4, var5);
            }

            if (var5.f_17716.m_6074(var3.getDuration(), f_17729, f_17730)) {
               int var6 = (var3.getDuration() + 19) / 20;
               int var7 = var3.getDuration() <= 100 ? Class_BftdentXEtGbugJw.m_2310(255, 180, 65) : Class_BftdentXEtGbugJw.m_2310(115, 185, 255);
               MutableComponent var8 = Component.literal(f_17731)
                  .append(PotionContents.getPotionDescription(var4, var3.getAmplifier()))
                  .append(f_17732)
                  .append(Component.literal(var6 + "").withColor(var7));
               ItemStack var9 = new ItemStack(Items.POTION);
               var9.set(
                  DataComponents.POTION_CONTENTS, PotionContents.EMPTY.withEffectAdded(new MobEffectInstance(var4, var3.getDuration(), var3.getAmplifier()))
               );
               Class_8UIDpbIRPAjhei7m.m_1791(var8, var9, var7, Class_MP0Q3Izlf2HSndyS.EFFECTS);
            }
         }
      }

      this.f_17719.keySet().removeIf(var1x -> !this.f_17720.contains(var1x));
   }

   public void m_6077(Player var1, boolean var2, boolean var3) {
      if (!var1.isAlive()) {
         this.m_6079();
      } else {
         if (this.f_17721 != var1 || this.f_17722 != var1.level()) {
            this.m_6079();
            this.f_17721 = var1;
            this.f_17722 = var1.level();
         }

         if (var2) {
            this.m_6078(var1);
         } else {
            this.f_17718.clear();
         }

         if (var3) {
            this.m_6076(var1);
         } else {
            this.f_17719.clear();
            this.f_17720.clear();
         }
      }
   }

   private void m_6078(Player var1) {
      for (EquipmentSlot var5 : f_17717) {
         ItemStack var6 = var1.getItemBySlot(var5);
         if (!var6.isEmpty() && var6.isDamageableItem() && var6.getMaxDamage() > 0) {
            Class_bYDeIFrnJe97cH9q.TDqhfQLQ6e542RIu var7 = this.f_17718.get(var5);
            if (var7 == null || !var7.m_6073(var6)) {
               var7 = new Class_bYDeIFrnJe97cH9q.TDqhfQLQ6e542RIu(var6);
               this.f_17718.put(var5, var7);
            }

            int var8 = Math.max(0, var6.getMaxDamage() - var6.getDamageValue());
            double var9 = var8 * f_17723 / var6.getMaxDamage();
            if (var7.f_17713.m_6074(var9, f_17724, f_17725)) {
               int var11 = var9 <= f_17726 ? Class_BftdentXEtGbugJw.m_2310(255, 70, 70) : Class_BftdentXEtGbugJw.m_2310(255, 180, 65);
               MutableComponent var12 = Component.literal(f_17727)
                  .append(var6.getHoverName().copy())
                  .append(f_17728)
                  .append(Component.literal((int)Math.ceil(var9) + "").withColor(var11));
               Class_8UIDpbIRPAjhei7m.m_1791(var12, var6, var11, Class_MP0Q3Izlf2HSndyS.ARMOR);
            }
         } else {
            this.f_17718.remove(var5);
         }
      }
   }

   public void m_6079() {
      this.f_17718.clear();
      this.f_17719.clear();
      this.f_17720.clear();
      this.f_17721 = null;
      this.f_17722 = null;
   }

   private static final class TDqhfQLQ6e542RIu {
      public final ItemStack f_17712;
      public final Class_bYDeIFrnJe97cH9q.ZoclKDs9HmOyRcEf f_17713 = new Class_bYDeIFrnJe97cH9q.ZoclKDs9HmOyRcEf();

      public TDqhfQLQ6e542RIu(ItemStack var1) {
         this.f_17712 = var1.copyWithCount(1);
      }

      public boolean m_6073(ItemStack var1) {
         if (this.f_17712.getItem() != var1.getItem()) {
            return false;
         }

         this.f_17712.setDamageValue(var1.getDamageValue());
         return ItemStack.isSameItemSameComponents(this.f_17712, var1);
      }
   }

   private static final class ZoclKDs9HmOyRcEf {
      public int f_17714;

      public ZoclKDs9HmOyRcEf() {
      }

      public boolean m_6074(double var1, double var3, double var5) {
         int var7 = var1 <= var5 ? 2 : (var1 <= var3 ? 1 : 0);
         boolean var8 = var7 > this.f_17714;
         this.f_17714 = var7;
         return var8;
      }
   }

   private static final class z3HhD59buvqZo1tx {
      public final int f_17715;
      public final Class_bYDeIFrnJe97cH9q.ZoclKDs9HmOyRcEf f_17716 = new Class_bYDeIFrnJe97cH9q.ZoclKDs9HmOyRcEf();

      public z3HhD59buvqZo1tx(int var1) {
         this.f_17715 = var1;
      }
   }
}
