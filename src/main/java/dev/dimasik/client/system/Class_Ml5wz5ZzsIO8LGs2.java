package dev.dimasik.client.system;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.ItemLore;

public final class Class_Ml5wz5ZzsIO8LGs2 {
   private static final Pattern f_11344 = Pattern.compile(Class_Ml5wz5ZzsIO8LGs2.f_11348, 66);
   private static final String f_11345 = "[^0-9]";
   private static final long f_11346 = 2147483647L;
   private static final int f_11347 = Integer.MAX_VALUE;
   private static final String f_11348 = "(?:\\$|цена)[^0-9]*([0-9][0-9 ,.]*)(?:$|[^0-9])";

   private Class_Ml5wz5ZzsIO8LGs2() {
   }

   public static int m_3969(ItemStack var0) {
      ItemLore var1 = (ItemLore)var0.get(DataComponents.LORE);
      if (var1 == null) {
         return 0;
      }

      for (Component var3 : var1.lines()) {
         Matcher var4 = f_11344.matcher(var3.getString());
         if (var4.find()) {
            try {
               long var5 = Long.parseLong(var4.group(1).replaceAll(f_11345, ""));
               return var5 > f_11346 ? f_11347 : (int)var5;
            } catch (NumberFormatException var7) {
               return 0;
            }
         }
      }

      return 0;
   }
}
