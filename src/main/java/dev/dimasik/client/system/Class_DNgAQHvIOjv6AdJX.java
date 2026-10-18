package dev.dimasik.client.system;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.Items;

public class Class_DNgAQHvIOjv6AdJX {
   private static final List<Class_OadJxIIiAHkVgpNi> f_6410 = new ArrayList<>();

   public static Class_OadJxIIiAHkVgpNi m_2450() {
      if (!f_6410.isEmpty()) {
         Class_OadJxIIiAHkVgpNi var0 = f_6410.getFirst();
         f_6410.remove(var0);
         return var0;
      } else {
         return new Class_OadJxIIiAHkVgpNi(
            false,
            0.0F,
            Minecraft.getInstance().player,
            InteractionHand.MAIN_HAND,
            false,
            Class_tjdtKxsAEogQMtun.f_32100,
            0.0F,
            0.0F,
            0.0F,
            false,
            false,
            false,
            false,
            false,
            false,
            Items.AIR.getDefaultInstance()
         );
      }
   }

   public static void m_2451(Class_OadJxIIiAHkVgpNi var0, ItemStack var1) {
      if (!var1.isEmpty() && var1.getUseAnimation() != ItemUseAnimation.BLOCK && var1.getUseAnimation() != ItemUseAnimation.TRIDENT) {
         f_6410.add(var0);
      }
   }

   public static void m_2452() {
      f_6410.clear();
   }
}
