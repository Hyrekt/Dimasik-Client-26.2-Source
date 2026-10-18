package dev.dimasik.client.system;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.Items;

public class Class_kmb9eogH8we2lnWk {
   private static final List<ItemStack> f_25116 = new ArrayList<>();

   public static void m_7472() {
      f_25116.clear();
   }

   public static ItemStack m_7473() {
      if (!f_25116.isEmpty()) {
         ItemStack var0 = f_25116.getFirst();
         f_25116.remove(var0);
         return var0;
      } else {
         return Items.AIR.getDefaultInstance();
      }
   }

   public static void m_7474(ItemStack var0) {
      if (!var0.isEmpty() && var0.getUseAnimation() != ItemUseAnimation.BLOCK && var0.getUseAnimation() != ItemUseAnimation.TRIDENT) {
         f_25116.add(var0);
      }
   }
}
