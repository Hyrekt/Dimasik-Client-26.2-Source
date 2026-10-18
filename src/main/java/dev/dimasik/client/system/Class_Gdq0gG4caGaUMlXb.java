package dev.dimasik.client.system;

import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

public final class Class_Gdq0gG4caGaUMlXb {
   private static final String f_7763 = "This is a utility class and cannot be instantiated";

   @Generated
   private Class_Gdq0gG4caGaUMlXb() {
      throw new UnsupportedOperationException(f_7763);
   }

   public static List<ItemStack> m_2800(LivingEntity var0) {
      ArrayList var1 = new ArrayList();
      var1.add(var0.getItemBySlot(EquipmentSlot.HEAD));
      var1.add(var0.getItemBySlot(EquipmentSlot.CHEST));
      var1.add(var0.getItemBySlot(EquipmentSlot.LEGS));
      var1.add(var0.getItemBySlot(EquipmentSlot.FEET));
      return var1;
   }
}
