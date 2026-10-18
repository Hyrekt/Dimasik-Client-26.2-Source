package dev.dimasik.client.system;

import net.minecraft.core.component.DataComponents;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public final class Class_xo2hAgsqCXlkjPQx {
   public static ItemStack m_9508(ItemStack var0) {
      if (var0 == null || var0.isEmpty()) {
         return var0;
      }

      if (!Class_rsrLB4fiDOF3z0YM.m_8496()) {
         return var0;
      }

      Class_m52tuSNQY8S356Ab var1;
      if (var0.is(Items.MACE)) {
         var1 = Class_rsrLB4fiDOF3z0YM.m_8483();
      } else {
         if (!var0.is(ItemTags.SWORDS)) {
            return var0;
         }

         var1 = Class_rsrLB4fiDOF3z0YM.m_8488();
      }

      ItemStack var2 = var0.copy();
      var2.set(DataComponents.ITEM_MODEL, var1.m_7578());
      return var2;
   }

   private Class_xo2hAgsqCXlkjPQx() {
   }
}
