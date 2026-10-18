package dev.dimasik.client.system;

import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BannerItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.component.CustomData;

public final class Class_uFQsmDRHM5w7NSH1 {
   private static final String f_32738 = "Низкий";
   private static final String f_32739 = "Высокий";
   private static final String f_32740 = "PublicBukkitValues";
   private static final String f_32741 = "potion-popper";
   private static final String f_32742 = "minecraft:ftid";

   public static boolean m_9117(ItemStack var0) {
      if (!var0.is(Items.POTION)) {
         return false;
      }

      PotionContents var1 = (PotionContents)var0.getOrDefault(DataComponents.POTION_CONTENTS, PotionContents.EMPTY);

      for (MobEffectInstance var3 : var1.getAllEffects()) {
         if (var3.getEffect().equals(MobEffects.SPEED)) {
            return true;
         }
      }

      return false;
   }

   private Class_uFQsmDRHM5w7NSH1() {
   }

   public static boolean m_9118(ItemStack var0, String var1) {
      CustomData var2 = (CustomData)var0.get(DataComponents.CUSTOM_DATA);
      if (var2 == null) {
         return false;
      }

      CompoundTag var3 = var2.copyTag();
      return var3.getCompound(f_32740).flatMap(var0x -> var0x.getString(f_32742)).map(var1::equals).orElse(false);
   }

   private static boolean m_9119(ItemStack var0) {
      return var0.is(Items.WOODEN_PICKAXE)
         || var0.is(Items.STONE_PICKAXE)
         || var0.is(Items.IRON_PICKAXE)
         || var0.is(Items.GOLDEN_PICKAXE)
         || var0.is(Items.DIAMOND_PICKAXE)
         || var0.is(Items.NETHERITE_PICKAXE);
   }

   private static boolean m_9120(ItemStack var0) {
      Item var1 = var0.getItem();
      return var1 instanceof ShovelItem
         || var1 instanceof AxeItem
         || var1 instanceof BannerItem
         || var1 instanceof SmithingTemplateItem && !var0.is(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
         || var0.is(Items.BLAZE_ROD)
         || var0.is(Items.ENCHANTED_BOOK)
         || var0.is(Items.TRIDENT)
         || var0.is(Items.NAME_TAG)
         || var0.is(Items.SCULK)
         || var0.is(Items.SCULK_SENSOR)
         || var0.is(Items.ENDER_CHEST)
         || var0.is(Items.REINFORCED_DEEPSLATE)
         || var0.is(Items.PUFFERFISH)
         || var0.is(Items.HONEY_BOTTLE)
         || var0.is(Items.FERMENTED_SPIDER_EYE)
         || var0.is(Items.ANVIL)
         || var0.is(Items.COOKED_PORKCHOP);
   }

   public static boolean m_9122(ItemStack var0, String var1) {
      return f_32738.equals(var1) ? false : m_9120(var0) || f_32739.equals(var1) && m_9123(var0);
   }

   private static boolean m_9123(ItemStack var0) {
      Item var1 = var0.getItem();
      return var1 instanceof ArrowItem
         || m_9119(var0)
         || var1 instanceof AxeItem
         || var0.is(Items.CHORUS_FRUIT)
         || var0.is(Items.DISC_FRAGMENT_5)
         || var0.is(Items.NAUTILUS_SHELL)
         || var0.is(Items.BOOKSHELF)
         || var0.is(Items.COOKED_MUTTON)
         || var0.is(Items.SKELETON_SPAWN_EGG)
         || var0.is(Items.CREEPER_SPAWN_EGG)
         || var0.is(Items.ZOMBIE_SPAWN_EGG)
         || var0.is(Items.VINDICATOR_SPAWN_EGG)
         || var0.is(Items.PIGLIN_SPAWN_EGG)
         || var0.is(Items.FIRE_CHARGE)
         || var0.is(Items.LEATHER)
         || var0.is(Items.SHULKER_SHELL)
         || var0.is(Items.EXPERIENCE_BOTTLE)
         || var0.is(Items.WITHER_ROSE)
         || var0.is(Items.EMERALD)
         || var0.is(Items.SUGAR)
         || m_9118(var0, f_32741)
         || var0.has(DataComponents.JUKEBOX_PLAYABLE)
         || var0.is(Items.GHAST_TEAR)
         || var0.is(Items.DRAGON_BREATH)
         || var0.is(Items.VEX_SPAWN_EGG)
         || var0.is(Items.ENDERMITE_SPAWN_EGG)
         || var0.is(Items.CAT_SPAWN_EGG)
         || var0.is(Items.ENCHANTING_TABLE)
         || var0.is(Items.DIAMOND_HELMET)
         || var0.is(Items.DIAMOND_CHESTPLATE)
         || var0.is(Items.DIAMOND_LEGGINGS)
         || var0.is(Items.DIAMOND_BOOTS);
   }

   public static boolean m_9124(ItemStack var0) {
      PotionContents var1 = (PotionContents)var0.getOrDefault(DataComponents.POTION_CONTENTS, PotionContents.EMPTY);
      Holder var2 = (Holder)var1.potion().orElse(null);
      return var2 != null && (var2.equals(Potions.INVISIBILITY) || var2.equals(Potions.LONG_INVISIBILITY));
   }
}
