package dev.dimasik.client.system;

import dev.dimasik.mixin.ItemCooldownsMixin;
import dev.dimasik.mixin.ItemCooldowns_CooldownInstanceMixin;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemCooldowns;
import net.minecraft.world.item.ItemStack;

public final class Class_Xw2DxVWUHvaJJDcA implements Class_NzJrN63M7QBpmAbi {
   private static final float f_16084 = 20.0F;

   private Class_Xw2DxVWUHvaJJDcA() {
   }

   public static float m_5616(Item var0, float var1) {
      return var0 == null ? 0.0F : m_5617(new ItemStack(var0), var1);
   }

   public static float m_5617(ItemStack var0, float var1) {
      return f_11537.player == null ? 0.0F : m_5618(f_11537.player.getCooldowns(), var0, var1);
   }

   public static float m_5618(ItemCooldowns var0, ItemStack var1, float var2) {
      if (var0 != null && var1 != null && !var1.isEmpty()) {
         ItemCooldownsMixin var3 = (ItemCooldownsMixin)var0;
         Identifier var4 = var3.invokeGetCooldownGroup(var1);
         Object var5 = var3.getCooldownEntries().get(var4);
         if (var5 == null) {
            return 0.0F;
         }

         int var6 = ((ItemCooldowns_CooldownInstanceMixin)var5).getEndTick();
         float var7 = var6 - (var3.getCooldownTick() + var2);
         return Math.max(var7 / f_16084, 0.0F);
      } else {
         return 0.0F;
      }
   }
}
