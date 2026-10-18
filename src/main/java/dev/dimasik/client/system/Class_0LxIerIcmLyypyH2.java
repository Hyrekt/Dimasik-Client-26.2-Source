package dev.dimasik.client.system;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class Class_0LxIerIcmLyypyH2 {
   @Class_FUILRKIQ6wtWry59("get")
   public Item m_704(String var1) {
      Identifier var2 = Identifier.parse(var1);
      return (Item)BuiltInRegistries.ITEM.getValue(var2);
   }

   @Class_FUILRKIQ6wtWry59
   public String m_705(ItemStack var1) {
      return var1.getCustomName().toString();
   }
}
