package dev.dimasik.client.system;

import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.component.DataComponentMap;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.RegistryOps;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.ProjectileItem;
import net.minecraft.world.item.SplashPotionItem;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.component.KineticWeapon;
import net.minecraft.world.item.component.ItemAttributeModifiers.Entry;
import net.minecraft.world.item.component.KineticWeapon.Condition;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LanternBlock;

public class Class_0cYBtbDex02wgqyX {
   private static <T> void m_747(ItemStack var0, ItemStack var1, DataComponentType<T> var2) {
      if (var0.has(var2)) {
         var1.set(var2, var0.get(var2));
      }
   }

   @Class_FUILRKIQ6wtWry59("getSpearData")
   public Class_Y0ULF11Z68EYrJVE m_748(ItemStack var1) {
      LocalPlayer var2 = Minecraft.getInstance().player;
      KineticWeapon var3 = (KineticWeapon)var1.get(DataComponents.KINETIC_WEAPON);
      int var4 = var1.getUseDuration(var2) - (var2.getUseItemRemainingTicks() + 1);
      int var5 = var3.delayTicks();
      boolean var6 = var4 < var3.dismountConditions().<Integer>map(Condition::maxDurationTicks).orElse(0) + var5;
      boolean var7 = var4 < var3.knockbackConditions().<Integer>map(Condition::maxDurationTicks).orElse(0) + var5;
      boolean var8 = var4 < var3.damageConditions().<Integer>map(Condition::maxDurationTicks).orElse(0) + var5;
      boolean var9 = var2.getTicksSinceLastKineticHitFeedback(0.0F) == 1.0F;
      return new Class_Y0ULF11Z68EYrJVE(var8, var7, var6, var9);
   }

   @Class_FUILRKIQ6wtWry59
   public ItemStack m_749(Item var1) {
      return var1.getDefaultInstance();
   }

   @Class_FUILRKIQ6wtWry59("isThrowable")
   public boolean m_750(ItemStack var1) {
      return var1.getItem() instanceof SplashPotionItem || var1.getItem() instanceof ProjectileItem;
   }

   @Class_FUILRKIQ6wtWry59("isBlock")
   public boolean m_751(ItemStack var1) {
      return Block.byItem(var1.getItem()) != Blocks.AIR;
   }

   @Class_FUILRKIQ6wtWry59("isLantern")
   public boolean m_752(ItemStack var1) {
      return Block.byItem(var1.getItem()) instanceof LanternBlock;
   }

   @Class_FUILRKIQ6wtWry59
   public void m_753(ItemStack var1, boolean var2) {
      ((Class_kEXcsyIrxlSEKaOA)(Object)var1).hMI5_0$setTransform(var2);
   }

   @Class_FUILRKIQ6wtWry59
   public boolean m_754(ItemStack var1) {
      if (Block.byItem(var1.getItem()) == Blocks.AIR) {
         return false;
      }

      int var2 = ((Class_kEXcsyIrxlSEKaOA)(Object)var1).hMI5_0$getRenderAsBlock();
      return var2 == 1 || var2 == -1;
   }

   @Class_FUILRKIQ6wtWry59
   public boolean m_755(ItemStack var1) {
      return var1.isEnchanted();
   }

   @Class_FUILRKIQ6wtWry59
   public static Class_CrK5npDk5KUpJvhf m_756(ItemStack var0) {
      RegistryOps var1 = RegistryOps.create(JsonOps.INSTANCE, Minecraft.getInstance().level.registryAccess());
      DataComponentMap var2 = var0.getComponents();
      JsonElement var3 = (JsonElement)DataComponentMap.CODEC.encodeStart(var1, var2).getOrThrow();
      return new Class_CrK5npDk5KUpJvhf(var3.getAsJsonObject());
   }

   @Class_FUILRKIQ6wtWry59("isEmpty")
   public boolean m_757(ItemStack var1) {
      return var1.isEmpty();
   }

   @Class_FUILRKIQ6wtWry59
   public void m_758(Item var1) {
      Class_LRsxqvEkEcBPGPUf.f_10589 = var1.getDefaultInstance();
   }

   @Class_FUILRKIQ6wtWry59
   public void m_759(Item var1) {
      Class_LRsxqvEkEcBPGPUf.f_10588 = var1.getDefaultInstance();
   }

   @Class_FUILRKIQ6wtWry59("isChargedCrossbow")
   public boolean m_760(ItemStack var1) {
      return CrossbowItem.isCharged(var1);
   }

   @Class_FUILRKIQ6wtWry59
   public void m_761(ItemStack var1) {
      ItemStack var2 = var1.getItem().getDefaultInstance();
      m_747(var1, var2, DataComponents.ENCHANTMENTS);
      m_747(var1, var2, DataComponents.ITEM_MODEL);
      m_747(var1, var2, DataComponents.CUSTOM_MODEL_DATA);
      m_747(var1, var2, DataComponents.CUSTOM_DATA);
   }

   @Class_FUILRKIQ6wtWry59
   public String m_762(ItemStack var1) {
      return var1.getCustomName() != null ? var1.getCustomName().getString() : var1.getHoverName().getString();
   }

   @Class_FUILRKIQ6wtWry59("isCustomTranslate")
   public boolean m_763(ItemStack var1) {
      return Class_LRsxqvEkEcBPGPUf.f_10579.getOrDefault(this.m_771(var1), false);
   }

   @Class_FUILRKIQ6wtWry59("shouldTranslateItem")
   public boolean m_764(ItemStack var1) {
      int var2 = ((Class_kEXcsyIrxlSEKaOA)(Object)var1).hMI5_0$getTransform();
      return var2 == 0
         ? false
         : !var1.is(ConventionalItemTags.RODS)
               && !var1.is(ConventionalItemTags.TOOLS)
               && !var1.is(ItemTags.SWORDS)
               && !var1.is(ConventionalItemTags.MACE_TOOLS)
               && var1.getUseAnimation() != ItemUseAnimation.BLOCK
               && !(this.m_768(var1) > 0.0F)
            || var1.getUseAnimation() == ItemUseAnimation.EAT
            || var1.getUseAnimation() == ItemUseAnimation.DRINK
            || var1.getUseAnimation() == ItemUseAnimation.SPYGLASS;
   }

   @Class_FUILRKIQ6wtWry59("getUseAction")
   public String m_765(ItemStack var1) {
      return var1.getUseAnimation().getSerializedName();
   }

   @Class_FUILRKIQ6wtWry59("isIn")
   public boolean m_766(ItemStack var1, TagKey<Item> var2) {
      return var1.is(var2);
   }

   @Class_FUILRKIQ6wtWry59
   public void m_767(ItemStack var1, double var2) {
      ((Class_kEXcsyIrxlSEKaOA)(Object)var1).hMI5_0$setSwingSpeed((int)var2);
   }

   @Class_FUILRKIQ6wtWry59
   public float m_768(ItemStack var1) {
      ItemAttributeModifiers var2 = (ItemAttributeModifiers)var1.getComponents().get(DataComponents.ATTRIBUTE_MODIFIERS);
      if (var2 == null) {
         return 0.0F;
      }

      float var3 = 0.0F;

      for (Entry var5 : var2.modifiers()) {
         if (var5.attribute().value() == Attributes.ATTACK_DAMAGE.value()) {
            var3 += (float)var5.modifier().amount();
         }
      }

      return var3;
   }

   @Class_FUILRKIQ6wtWry59("isOf")
   public boolean m_769(ItemStack var1, Item var2) {
      return var1.is(var2);
   }

   @Class_FUILRKIQ6wtWry59
   public void m_770(ItemStack var1, boolean var2) {
      if (Block.byItem(var1.getItem()) != Blocks.AIR) {
         ((Class_kEXcsyIrxlSEKaOA)(Object)var1).hMI5_0$setRenderAsBlock(var2);
      }
   }

   @Class_FUILRKIQ6wtWry59("getName")
   public String m_771(ItemStack var1) {
      return var1.getItem().toString();
   }
}
