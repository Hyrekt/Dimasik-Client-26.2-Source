package dev.dimasik.client.module.misc;

import com.google.gson.JsonObject;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.BooleanSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_8UIDpbIRPAjhei7m;
import dev.dimasik.client.system.Class_QmNR03reugBgWiPr;
import dev.dimasik.client.system.Class_SluWNIC7qlm0dHwu;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_cxtVSustGMvg4Bq0;
import dev.dimasik.client.system.Class_fFSER1OTAD5huhkq;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.ui.screen.Screen_10;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.BooleanSupplier;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.util.StringUtil;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.inventory.InventoryMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.equipment.Equippable;

public final class InventorySort extends Module {
   public static final int f_30396 = 41;
   public static final int f_30397 = 39;
   public static final int f_30398 = 38;
   public static final int f_30399 = 37;
   public static final int f_30400 = 36;
   public static final int f_30401 = 40;
   public static final String f_30402 = "Шар";
   public static final String f_30403 = "Тыква";
   public static final String f_30404 = "Голова Джека";
   public static final String f_30405 = "Силка";
   public static final String f_30406 = "Скорка";
   public static final String f_30407 = "Огнестойка";
   private static final int[] f_30408 = m_8594();
   private final InventorySort.moe13vRLIOivvpKs[] f_30409 = new InventorySort.moe13vRLIOivvpKs[41];
   private Class_cxtVSustGMvg4Bq0 f_30410 = new Class_cxtVSustGMvg4Bq0();
   private volatile JsonObject f_30411 = this.f_30410.m_6303();
   private BooleanSupplier f_30412 = () -> false;
   private boolean f_30413;
   private boolean f_30414 = true;
   private final SliderSetting f_30415;
   private final BooleanSetting f_30416;
   private final Class_QmNR03reugBgWiPr f_30417;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_30418;
   private boolean f_30419;
   private int f_30420;
   private int f_30421;
   private int f_30422;
   private int f_30423;
   private static final String f_30424 = "InventorySort";
   private static final String f_30425 = "Сортирует инвентарь по выбранному шаблону";
   private static final String f_30426 = "Задержка";
   private static final float f_30427 = 50.0F;
   private static final float f_30428 = 250.0F;
   private static final float f_30429 = 10.0F;
   private static final String f_30430 = "Открыть панель";
   private static final String f_30431 = "H";
   private static final String f_30432 = "Инвентарь отсортирован";
   private static final String f_30433 = "I";
   private static final String f_30434 = "Сначала расставь предметы в шаблоне";
   private static final String f_30435 = "Тыква";
   private static final String f_30436 = "Голова Джека";
   private static final String f_30437 = "Шар";
   private static final String f_30438 = "Головы";
   private static final String f_30439 = "Хорус";
   private static final String f_30440 = "Силка";
   private static final String f_30441 = "Зелье силы";
   private static final String f_30442 = "Скорка";
   private static final String f_30443 = "Зелье скорости";
   private static final String f_30444 = "Огнестойка";
   private static final String f_30445 = "Огнестойкость";
   private static final String f_30446 = "Чарка";
   private static final String f_30447 = "Золотое яблоко";
   private static final String f_30448 = "Обсидиан";
   private static final String f_30449 = "Кристалл Края";
   private static final String f_30450 = "Эндер-жемчуг";
   private static final String f_30451 = "Фейерверк";
   private static final String f_30452 = "Тотем";
   private static final String f_30453 = "Щит";
   private static final String f_30454 = "Элитры";
   private static final String f_30455 = "Шлем";
   private static final String f_30456 = "Нагрудник";
   private static final String f_30457 = "Поножи";
   private static final String f_30458 = "Ботинки";
   private static final String f_30459 = "Меч";
   private static final String f_30460 = "Кирка";
   private static final String f_30461 = "Топор";
   private static final String f_30462 = "Лопата";
   private static final String f_30463 = "Funtime";
   private static final String f_30464 = "Эндер-жемчуг";
   private static final String f_30465 = "Фейерверк";
   private static final String f_30466 = "Хорус";
   private static final String f_30467 = "Обсидиан";
   private static final String f_30468 = "Кристалл Края";
   private static final String f_30469 = "Тотем";
   private static final String f_30470 = "Щит";
   private static final String f_30471 = "[★]";
   private static final String f_30472 = "[⚡]";
   private static final String f_30473 = "xxx";
   private static final int f_30474 = Integer.MIN_VALUE;
   private static final String f_30475 = "Шар";
   private static final String f_30476 = "Тыква";
   private static final String f_30477 = "Голова Джека";
   private static final String f_30478 = "голова джека";
   private static final String f_30479 = "джека";
   private static final String f_30480 = "\\s+";
   private static final String f_30481 = " ";
   private static final String f_30482 = "Силка";
   private static final String f_30483 = "Скорка";
   private static final String f_30484 = "Огнестойка";
   private static final String f_30485 = "Силка";
   private static final String f_30486 = "Скорка";
   private static final String f_30487 = "Огнестойка";
   private static final String f_30488 = "Силка";
   private static final String f_30489 = "Скорка";
   private static final String f_30490 = "Огнестойка";

   private void m_8524(int var1, Identifier var2, String var3, int var4, InventorySort.Class_6H1cx2XzHC7vSJVh var5) {
      if (var1 >= 0 && var1 < 41 && var2 != null && BuiltInRegistries.ITEM.containsKey(var2)) {
         Item var6 = (Item)BuiltInRegistries.ITEM.getValue(var2);
         ItemStack var7 = this.m_8566(var5, var3, new ItemStack(var6));
         String var8 = this.m_8589(var5, var3, var7);
         if (!var7.isEmpty()) {
            this.f_30409[var1] = new InventorySort.moe13vRLIOivvpKs(var7.copyWithCount(1), var8, Math.max(1, var4), var5);
         }
      }
   }

   @Override
   public void m_778() {
      this.m_8570();
   }

   public void m_8525(int var1, int var2) {
      if (this.m_8538(var1, var2)) {
         InventorySort.moe13vRLIOivvpKs var3 = this.f_30409[var2];
         this.f_30409[var2] = this.f_30409[var1];
         this.f_30409[var1] = var3;
         this.m_8582();
      }
   }

   public void m_8526(int var1, ItemStack var2, String var3, InventorySort.Class_6H1cx2XzHC7vSJVh var4) {
      if (this.m_8554(var1, var2) && var4 != null) {
         this.m_8585();
         String var5 = this.m_8589(var4, var3, var2);
         this.f_30409[var1] = new InventorySort.moe13vRLIOivvpKs(this.m_8566(var4, var5, var2), var5, Math.max(1, var2.getCount()), var4);
         this.m_8582();
      }
   }

   public void m_8527(String var1) {
      this.f_30410.m_6292(var1);
      this.m_8578();
   }

   private void m_8528() {
      this.f_30420 = -1;
      this.f_30421 = -1;
      this.f_30423 = 0;
      this.f_30422 = 8;
   }

   public void m_8529() {
      if (f_11537.player != null) {
         this.m_8585();
         if (!this.m_8532()) {
            Class_8UIDpbIRPAjhei7m.m_1792(f_30433, f_30434, -1);
         } else {
            this.m_8542();
            this.m_8528();
            this.f_30419 = true;
            this.f_30417.m_4459();
         }
      }
   }

   private static Class_SluWNIC7qlm0dHwu.Class_3w2x36ewkoAH3rZP m_8530(String var0) {
      return Class_SluWNIC7qlm0dHwu.f_13386.stream().filter(var1 -> var1.name().equals(var0)).findFirst().orElse(null);
   }

   private void m_8531() {
      this.m_8528();
      this.f_30419 = false;
      this.f_30413 = true;
      this.m_8585();
      this.m_8578();
   }

   public boolean m_8532() {
      this.m_8585();

      for (InventorySort.moe13vRLIOivvpKs var4 : this.f_30409) {
         if (var4 != null && !var4.stack().isEmpty()) {
            return true;
         }
      }

      return false;
   }

   private static String m_8533(String var0) {
      return var0.replace(f_30471, "").replace(f_30472, "").replace(f_30473, "").trim();
   }

   public void m_8534() {
      if (this.f_30410.m_6311()) {
         this.m_8531();
      }
   }

   private int m_8535(int var1, int var2) {
      for (int var3 = 8; var3 >= 0; var3--) {
         if (var3 != var1 && var3 != var2) {
            InventorySort.moe13vRLIOivvpKs var4 = this.f_30409[var3];
            if (var4 == null && this.m_8555(var3).isEmpty()) {
               return var3;
            }
         }
      }

      for (int var5 = 8; var5 >= 0; var5--) {
         if (var5 != var1 && var5 != var2) {
            return var5;
         }
      }

      return 8;
   }

   private boolean m_8536(InventorySort.moe13vRLIOivvpKs var1, ItemStack var2) {
      if (var1 != null && var2 != null && !var2.isEmpty()) {
         return switch (var1.kind()) {
            case NORMAL -> var2.getItem() == var1.stack().getItem();
            case BALL -> var2.is(Items.PLAYER_HEAD) && !this.m_8548(var2);
            case PUMPKIN -> this.m_8548(var2);
            case POTION -> this.m_8550(var2, this.m_8541(var1.name()));
            case FUNTIME -> {
               Class_SluWNIC7qlm0dHwu.Class_3w2x36ewkoAH3rZP var3 = m_8530(var1.name());
               yield var3 != null && var3.matches(var2);
            }
         };
      } else {
         return false;
      }
   }

   public void m_8537(int var1, ItemStack var2, String var3) {
      this.m_8526(var1, var2, var3, this.m_8564(var2));
   }

   public boolean m_8538(int var1, int var2) {
      this.m_8585();
      if (var1 < 0 || var1 >= 41 || var1 == var2 || this.f_30409[var1] == null) {
         return false;
      } else {
         return !this.m_8554(var2, this.f_30409[var1].stack()) ? false : this.f_30409[var2] == null || this.m_8554(var1, this.f_30409[var2].stack());
      }
   }

   public void m_8539(int var1, int var2) {
      if (var1 >= 0 && var1 < 41) {
         this.m_8585();
         InventorySort.moe13vRLIOivvpKs var3 = this.f_30409[var1];
         if (var3 != null) {
            int var4 = Math.clamp(var3.count() + var2, 1, var3.stack().getMaxStackSize());
            if (var4 != var3.count()) {
               this.f_30409[var1] = new InventorySort.moe13vRLIOivvpKs(var3.stack(), var3.name(), var4, var3.kind());
               this.m_8582();
            }
         }
      }
   }

   private boolean m_8540(int var1, ItemStack var2) {
      EquipmentSlot var3 = this.m_8558(var1);
      if (var3 == null) {
         return true;
      }

      if (var3 == EquipmentSlot.HEAD && var2.is(Items.PLAYER_HEAD)) {
         return true;
      }

      Equippable var4 = (Equippable)var2.get(DataComponents.EQUIPPABLE);
      return var4 != null && var4.slot() == var3;
   }

   private Holder<MobEffect> m_8541(String var1) {
      if (f_30488.equals(var1)) {
         return MobEffects.STRENGTH;
      } else if (f_30489.equals(var1)) {
         return MobEffects.SPEED;
      } else {
         return f_30490.equals(var1) ? MobEffects.FIRE_RESISTANCE : null;
      }
   }

   private void m_8542() {
      if (f_11537.player != null && f_11537.gameMode != null) {
         ItemStack var1 = f_11537.player.inventoryMenu.getCarried();
         if (!var1.isEmpty()) {
            int var2 = -1;

            for (int var3 = 9; var3 < 36; var3++) {
               if (this.m_8555(var3).isEmpty()) {
                  var2 = var3;
                  break;
               }
            }

            if (var2 < 0) {
               for (int var4 = 0; var4 < 9; var4++) {
                  if (this.m_8555(var4).isEmpty()) {
                     var2 = var4;
                     break;
                  }
               }
            }

            if (var2 >= 0) {
               f_11537.gameMode.handleContainerInput(f_11537.player.inventoryMenu.containerId, m_8588(var2), 0, ContainerInput.PICKUP, f_11537.player);
            }
         }
      }
   }

   public void m_8543(BooleanSupplier var1) {
      this.f_30412 = var1;
   }

   public void m_8544() {
      this.f_30410.m_6302();
      this.m_8528();
      this.f_30419 = false;
      this.f_30413 = true;
      this.m_8585();
      this.m_8578();
   }

   private void m_8545(int var1, int var2) {
      int var3 = m_8588(var1);
      int var4 = m_8588(var2);
      if (var3 >= 0 && var4 >= 0 && var3 != var4) {
         int var5 = f_11537.player.inventoryMenu.containerId;
         if (var1 >= 0 && var1 < 9) {
            this.m_8584(var5, var4, var1);
         } else if (var2 >= 0 && var2 < 9) {
            this.m_8584(var5, var3, var2);
         } else if (var1 == 40) {
            this.m_8584(var5, var4, 40);
         } else if (var2 == 40) {
            this.m_8584(var5, var3, 40);
         } else {
            this.f_30420 = var1;
            this.f_30421 = var2;
            this.f_30422 = this.m_8535(var1, var2);
            this.f_30423 = 0;
            this.m_8547();
         }
      }
   }

   public List<InventorySort.mA278GQ37c0o7Z5q> m_8546() {
      if (this.m_8571() == Class_cxtVSustGMvg4Bq0.Znq8jzbHPgtGpXuG.FUNTIME) {
         return this.m_8552();
      }

      ArrayList var1 = new ArrayList();
      this.m_8559(var1, f_30435, f_30436, this.m_8577(), InventorySort.Class_6H1cx2XzHC7vSJVh.PUMPKIN);
      this.m_8559(var1, f_30437, f_30438, this.m_8557(), InventorySort.Class_6H1cx2XzHC7vSJVh.BALL);
      this.m_8559(var1, f_30439, "", new ItemStack(Items.CHORUS_FRUIT), InventorySort.Class_6H1cx2XzHC7vSJVh.NORMAL);
      this.m_8559(var1, f_30440, f_30441, this.m_8551(Potions.STRENGTH), InventorySort.Class_6H1cx2XzHC7vSJVh.POTION);
      this.m_8559(var1, f_30442, f_30443, this.m_8551(Potions.SWIFTNESS), InventorySort.Class_6H1cx2XzHC7vSJVh.POTION);
      this.m_8559(var1, f_30444, f_30445, this.m_8551(Potions.FIRE_RESISTANCE), InventorySort.Class_6H1cx2XzHC7vSJVh.POTION);
      this.m_8559(var1, f_30446, "", new ItemStack(Items.ENCHANTED_GOLDEN_APPLE), InventorySort.Class_6H1cx2XzHC7vSJVh.NORMAL);
      this.m_8559(var1, f_30447, "", new ItemStack(Items.GOLDEN_APPLE), InventorySort.Class_6H1cx2XzHC7vSJVh.NORMAL);
      this.m_8559(var1, f_30448, "", new ItemStack(Items.OBSIDIAN), InventorySort.Class_6H1cx2XzHC7vSJVh.NORMAL);
      this.m_8559(var1, f_30449, "", new ItemStack(Items.END_CRYSTAL), InventorySort.Class_6H1cx2XzHC7vSJVh.NORMAL);
      this.m_8559(var1, f_30450, "", new ItemStack(Items.ENDER_PEARL), InventorySort.Class_6H1cx2XzHC7vSJVh.NORMAL);
      this.m_8559(var1, f_30451, "", new ItemStack(Items.FIREWORK_ROCKET), InventorySort.Class_6H1cx2XzHC7vSJVh.NORMAL);
      this.m_8559(var1, f_30452, "", new ItemStack(Items.TOTEM_OF_UNDYING), InventorySort.Class_6H1cx2XzHC7vSJVh.NORMAL);
      this.m_8559(var1, f_30453, "", new ItemStack(Items.SHIELD), InventorySort.Class_6H1cx2XzHC7vSJVh.NORMAL);
      this.m_8559(var1, f_30454, "", new ItemStack(Items.ELYTRA), InventorySort.Class_6H1cx2XzHC7vSJVh.NORMAL);
      this.m_8559(var1, f_30455, "", new ItemStack(Items.NETHERITE_HELMET), InventorySort.Class_6H1cx2XzHC7vSJVh.NORMAL);
      this.m_8559(var1, f_30456, "", new ItemStack(Items.NETHERITE_CHESTPLATE), InventorySort.Class_6H1cx2XzHC7vSJVh.NORMAL);
      this.m_8559(var1, f_30457, "", new ItemStack(Items.NETHERITE_LEGGINGS), InventorySort.Class_6H1cx2XzHC7vSJVh.NORMAL);
      this.m_8559(var1, f_30458, "", new ItemStack(Items.NETHERITE_BOOTS), InventorySort.Class_6H1cx2XzHC7vSJVh.NORMAL);
      this.m_8559(var1, f_30459, "", new ItemStack(Items.NETHERITE_SWORD), InventorySort.Class_6H1cx2XzHC7vSJVh.NORMAL);
      this.m_8559(var1, f_30460, "", new ItemStack(Items.NETHERITE_PICKAXE), InventorySort.Class_6H1cx2XzHC7vSJVh.NORMAL);
      this.m_8559(var1, f_30461, "", new ItemStack(Items.NETHERITE_AXE), InventorySort.Class_6H1cx2XzHC7vSJVh.NORMAL);
      this.m_8559(var1, f_30462, "", new ItemStack(Items.NETHERITE_SHOVEL), InventorySort.Class_6H1cx2XzHC7vSJVh.NORMAL);
      return var1;
   }

   private void m_8547() {
      int var1 = f_11537.player.inventoryMenu.containerId;
      int var2 = m_8588(this.f_30420);
      int var3 = m_8588(this.f_30421);
      if (this.f_30423 == 0) {
         this.m_8584(var1, var3, this.f_30422);
      } else if (this.f_30423 == 1) {
         this.m_8584(var1, var2, this.f_30422);
      } else {
         this.m_8584(var1, var3, this.f_30422);
      }

      this.f_30423++;
      if (this.f_30423 > 2) {
         this.m_8528();
      }
   }

   private boolean m_8548(ItemStack var1) {
      if (var1 != null && !var1.isEmpty() && var1.is(Items.PLAYER_HEAD)) {
         String var2 = this.m_8590(var1.getHoverName().getString());
         return var2.contains(f_30478) || var2.contains(f_30479);
      } else {
         return false;
      }
   }

   private static ItemStack m_8549(Class_SluWNIC7qlm0dHwu.Class_3w2x36ewkoAH3rZP var0) {
      ItemStack var1 = Class_fFSER1OTAD5huhkq.m_6478(m_8533(var0.name()));
      return var1 == null ? var0.stack() : var1.copyWithCount(1);
   }

   private boolean m_8550(ItemStack var1, Holder<MobEffect> var2) {
      if (var2 != null && var1 != null && !var1.isEmpty()) {
         if (!var1.is(Items.POTION) && !var1.is(Items.SPLASH_POTION) && !var1.is(Items.LINGERING_POTION)) {
            return false;
         }

         PotionContents var3 = (PotionContents)var1.get(DataComponents.POTION_CONTENTS);
         if (var3 == null) {
            return false;
         }

         for (MobEffectInstance var5 : var3.getAllEffects()) {
            if (var5.getEffect().equals(var2)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private ItemStack m_8551(Holder<Potion> var1) {
      return PotionContents.createItemStack(Items.SPLASH_POTION, var1);
   }

   private List<InventorySort.mA278GQ37c0o7Z5q> m_8552() {
      ArrayList var1 = new ArrayList();

      for (Class_SluWNIC7qlm0dHwu.Class_3w2x36ewkoAH3rZP var3 : Class_SluWNIC7qlm0dHwu.f_13386) {
         this.m_8559(var1, var3.name(), f_30463, m_8549(var3), InventorySort.Class_6H1cx2XzHC7vSJVh.FUNTIME);
      }

      this.m_8559(var1, f_30464, "", new ItemStack(Items.ENDER_PEARL), InventorySort.Class_6H1cx2XzHC7vSJVh.NORMAL);
      this.m_8559(var1, f_30465, "", new ItemStack(Items.FIREWORK_ROCKET), InventorySort.Class_6H1cx2XzHC7vSJVh.NORMAL);
      this.m_8559(var1, f_30466, "", new ItemStack(Items.CHORUS_FRUIT), InventorySort.Class_6H1cx2XzHC7vSJVh.NORMAL);
      this.m_8559(var1, f_30467, "", new ItemStack(Items.OBSIDIAN), InventorySort.Class_6H1cx2XzHC7vSJVh.NORMAL);
      this.m_8559(var1, f_30468, "", new ItemStack(Items.END_CRYSTAL), InventorySort.Class_6H1cx2XzHC7vSJVh.NORMAL);
      this.m_8559(var1, f_30469, "", new ItemStack(Items.TOTEM_OF_UNDYING), InventorySort.Class_6H1cx2XzHC7vSJVh.NORMAL);
      this.m_8559(var1, f_30470, "", new ItemStack(Items.SHIELD), InventorySort.Class_6H1cx2XzHC7vSJVh.NORMAL);
      return var1;
   }

   private InventorySort.moe13vRLIOivvpKs m_8553(ItemStack var1) {
      if (this.m_8571() == Class_cxtVSustGMvg4Bq0.Znq8jzbHPgtGpXuG.FUNTIME) {
         Class_SluWNIC7qlm0dHwu.Class_3w2x36ewkoAH3rZP var4 = Class_SluWNIC7qlm0dHwu.m_4731(var1);
         return var4 != null
            ? new InventorySort.moe13vRLIOivvpKs(m_8549(var4), var4.name(), var1.getCount(), InventorySort.Class_6H1cx2XzHC7vSJVh.FUNTIME)
            : new InventorySort.moe13vRLIOivvpKs(
               var1.copyWithCount(1), var1.getHoverName().getString(), var1.getCount(), InventorySort.Class_6H1cx2XzHC7vSJVh.NORMAL
            );
      } else {
         InventorySort.Class_6H1cx2XzHC7vSJVh var2 = this.m_8564(var1);
         String var3 = this.m_8589(var2, var1.getHoverName().getString(), var1);
         return new InventorySort.moe13vRLIOivvpKs(this.m_8566(var2, var3, var1), var3, var1.getCount(), var2);
      }
   }

   public boolean m_8554(int var1, ItemStack var2) {
      return var1 >= 0 && var1 < 41 && var2 != null && !var2.isEmpty() && this.m_8540(var1, var2);
   }

   private ItemStack m_8555(int var1) {
      if (f_11537.player == null) {
         return ItemStack.EMPTY;
      }

      if (var1 >= 0 && var1 < 36) {
         return f_11537.player.getInventory().getItem(var1);
      }

      return switch (var1) {
         case 36 -> f_11537.player.getItemBySlot(EquipmentSlot.FEET);
         case 37 -> f_11537.player.getItemBySlot(EquipmentSlot.LEGS);
         case 38 -> f_11537.player.getItemBySlot(EquipmentSlot.CHEST);
         case 39 -> f_11537.player.getItemBySlot(EquipmentSlot.HEAD);
         case 40 -> f_11537.player.getOffhandItem();
         default -> ItemStack.EMPTY;
      };
   }

   public boolean m_8556() {
      return this.f_30410.m_6306();
   }

   private ItemStack m_8557() {
      ItemStack var1 = this.m_8572(false);
      return var1.isEmpty() ? new ItemStack(Items.PLAYER_HEAD) : var1;
   }

   private EquipmentSlot m_8558(int var1) {
      return switch (var1) {
         case 36 -> EquipmentSlot.FEET;
         case 37 -> EquipmentSlot.LEGS;
         case 38 -> EquipmentSlot.CHEST;
         case 39 -> EquipmentSlot.HEAD;
         default -> null;
      };
   }

   private void m_8559(List<InventorySort.mA278GQ37c0o7Z5q> var1, String var2, String var3, ItemStack var4, InventorySort.Class_6H1cx2XzHC7vSJVh var5) {
      if (var4 != null && !var4.isEmpty()) {
         var1.add(new InventorySort.mA278GQ37c0o7Z5q(var2, var3, var4.copyWithCount(1), var5));
      }
   }

   public void m_8560(String var1) {
      if (this.f_30410.m_6298(var1)) {
         this.m_8528();
         this.f_30419 = false;
         this.f_30413 = true;
         this.m_8585();
         this.m_8578();
      }
   }

   public boolean m_8561() {
      return this.f_30410.m_6296();
   }

   private void m_8562(Class_Xu9btcIeUN33XnMK var1) {
      if (this.f_30419) {
         if (f_11537.player == null || f_11537.level == null || f_11537.gameMode == null) {
            this.f_30419 = false;
         } else if (!(f_11537.gui.screen() instanceof Screen_10)) {
            if (!(f_11537.player.containerMenu instanceof InventoryMenu)) {
               this.f_30419 = false;
            } else if (this.f_30417.m_4463(this.f_30415.m_8768().longValue())) {
               if (!f_11537.player.inventoryMenu.getCarried().isEmpty()) {
                  this.m_8542();
                  this.f_30417.m_4459();
               } else {
                  if (!this.m_8581()) {
                     this.m_8542();
                     this.m_8528();
                     this.f_30419 = false;
                     Class_8UIDpbIRPAjhei7m.m_1792(f_30431, f_30432, -1);
                  }
               }
            }
         }
      }
   }

   public boolean m_8563() {
      return this.f_30414;
   }

   private InventorySort.Class_6H1cx2XzHC7vSJVh m_8564(ItemStack var1) {
      if (this.m_8548(var1)) {
         return InventorySort.Class_6H1cx2XzHC7vSJVh.PUMPKIN;
      } else if (var1.is(Items.PLAYER_HEAD)) {
         return InventorySort.Class_6H1cx2XzHC7vSJVh.BALL;
      } else {
         return this.m_8596(var1) != null ? InventorySort.Class_6H1cx2XzHC7vSJVh.POTION : InventorySort.Class_6H1cx2XzHC7vSJVh.NORMAL;
      }
   }

   private ItemStack m_8566(InventorySort.Class_6H1cx2XzHC7vSJVh var1, String var2, ItemStack var3) {
      return switch (var1) {
         case NORMAL -> var3.copyWithCount(1);
         case BALL -> this.m_8557();
         case PUMPKIN -> this.m_8577();
         case POTION -> this.m_8575(var2);
         case FUNTIME -> {
            Class_SluWNIC7qlm0dHwu.Class_3w2x36ewkoAH3rZP var4 = m_8530(var2);
            yield var4 == null ? var3.copyWithCount(1) : m_8549(var4);
         }
      };
   }

   public void m_8567(Class_cxtVSustGMvg4Bq0.Znq8jzbHPgtGpXuG var1) {
      if (var1 != this.f_30410.m_6293()) {
         this.f_30410.m_6291(var1);
         this.m_8578();
      }
   }

   public void m_8568(Class_cxtVSustGMvg4Bq0 var1) {
      this.f_30410 = var1;
      this.f_30413 = true;
      this.f_30411 = this.f_30410.m_6303();
      this.f_30414 = true;
   }

   public void m_8569() {
      if (f_11537.player != null) {
         this.m_8585();

         for (int var1 = 0; var1 < 41; var1++) {
            ItemStack var2 = this.m_8555(var1);
            this.f_30409[var1] = var2.isEmpty() ? null : this.m_8553(var2);
         }

         this.m_8582();
      }
   }

   private void m_8570() {
      if (f_11537.player != null) {
         if (!this.m_776()) {
            this.m_792();
         } else {
            this.m_8528();
            this.f_30419 = false;
            f_11537.gui.setScreen(new Screen_10(this));
         }
      }
   }

   public Class_cxtVSustGMvg4Bq0.Znq8jzbHPgtGpXuG m_8571() {
      return this.f_30410.m_6293();
   }

   @Override
   public void m_732() {
      this.m_8528();
      this.f_30419 = false;
      this.m_8542();
   }

   private ItemStack m_8572(boolean var1) {
      if (f_11537.player == null) {
         return ItemStack.EMPTY;
      }

      ItemStack var2 = f_11537.player.getItemBySlot(EquipmentSlot.HEAD);
      if (this.m_8591(var2, var1)) {
         return var2.copyWithCount(1);
      }

      ItemStack var3 = f_11537.player.getOffhandItem();
      if (this.m_8591(var3, var1)) {
         return var3.copyWithCount(1);
      }

      for (int var4 = 0; var4 < 36; var4++) {
         ItemStack var5 = f_11537.player.getInventory().getItem(var4);
         if (this.m_8591(var5, var1)) {
            return var5.copyWithCount(1);
         }
      }

      return ItemStack.EMPTY;
   }

   public void m_8573(int var1) {
      this.m_8585();
      if (var1 >= 0 && var1 < 41 && this.f_30409[var1] != null) {
         this.f_30409[var1] = null;
         this.m_8582();
      }
   }

   public void m_8574() {
      this.m_8585();

      for (int var1 = 0; var1 < this.f_30409.length; var1++) {
         this.f_30409[var1] = null;
      }

      this.m_8582();
   }

   private ItemStack m_8575(String var1) {
      if (f_30482.equals(var1)) {
         return this.m_8551(Potions.STRENGTH);
      } else if (f_30483.equals(var1)) {
         return this.m_8551(Potions.SWIFTNESS);
      } else {
         return f_30484.equals(var1) ? this.m_8551(Potions.FIRE_RESISTANCE) : this.m_8551(Potions.STRENGTH);
      }
   }

   private int m_8576(int var1, InventorySort.moe13vRLIOivvpKs var2) {
      int var3 = -1;
      int var4 = f_30474;

      for (int var5 = 0; var5 < 41; var5++) {
         if (var5 != var1) {
            ItemStack var6 = this.m_8555(var5);
            if (this.m_8536(var2, var6) && this.m_8540(var1, var6)) {
               InventorySort.moe13vRLIOivvpKs var7 = this.f_30409[var5];
               if (var7 == null || !this.m_8536(var7, var6) || var7.count() > 1 && var6.getCount() != var7.count()) {
                  int var8 = var7 == null ? 200 : 80;
                  if (var5 >= 0 && var5 < 9) {
                     var8 += 25;
                  }

                  var8 -= Math.abs(var6.getCount() - var2.count());
                  if (var8 > var4) {
                     var4 = var8;
                     var3 = var5;
                  }
               }
            }
         }
      }

      return var3;
   }

   private ItemStack m_8577() {
      ItemStack var1 = this.m_8572(true);
      if (!var1.isEmpty()) {
         return var1;
      }

      ItemStack var2 = new ItemStack(Items.PLAYER_HEAD);
      var2.set(DataComponents.CUSTOM_NAME, Component.literal(f_30477));
      return var2;
   }

   private void m_8578() {
      this.f_30411 = this.f_30410.m_6303();
      this.f_30414 = this.f_30412.getAsBoolean();
   }

   public void m_8579() {
      this.m_8578();
   }

   public void m_8580(String var1) {
      this.f_30410.m_6313(var1);
      this.m_8578();
   }

   private boolean m_8581() {
      if (this.f_30420 >= 0) {
         this.m_8547();
         this.f_30417.m_4459();
         return true;
      }

      for (int var4 : f_30408) {
         InventorySort.moe13vRLIOivvpKs var5 = this.f_30409[var4];
         if (var5 != null && !var5.stack().isEmpty()) {
            ItemStack var6 = this.m_8555(var4);
            if (!this.m_8536(var5, var6) || var5.count() > 1 && var6.getCount() != var5.count()) {
               int var7 = this.m_8576(var4, var5);
               if (var7 >= 0) {
                  this.m_8545(var4, var7);
                  this.f_30417.m_4459();
                  return true;
               }
            }
         }
      }

      return false;
   }

   private void m_8582() {
      ArrayList var1 = new ArrayList();

      for (int var2 = 0; var2 < this.f_30409.length; var2++) {
         InventorySort.moe13vRLIOivvpKs var3 = this.f_30409[var2];
         if (var3 != null && !var3.stack().isEmpty()) {
            var1.add(
               new Class_cxtVSustGMvg4Bq0.VQlWXpv7uUWBoP93(
                  var2, BuiltInRegistries.ITEM.getKey(var3.stack().getItem()).toString(), var3.name(), var3.count(), var3.kind().name()
               )
            );
         }
      }

      this.f_30410.m_6295(var1);
      this.m_8578();
   }

   public void m_8583() {
      if (this.f_30410.m_6299()) {
         this.m_8531();
      }
   }

   private void m_8584(int var1, int var2, int var3) {
      f_11537.gameMode.handleContainerInput(var1, var2, var3, ContainerInput.SWAP, f_11537.player);
   }

   private void m_8585() {
      if (this.f_30413 && f_11537.player != null) {
         Arrays.fill(this.f_30409, null);

         for (Class_cxtVSustGMvg4Bq0.VQlWXpv7uUWBoP93 var2 : this.f_30410.m_6308()) {
            this.m_8524(var2.index(), Identifier.tryParse(var2.item()), var2.name(), var2.count(), InventorySort.Class_6H1cx2XzHC7vSJVh.valueOf(var2.kind()));
         }

         this.f_30413 = false;
      }
   }

   public List<String> m_8586() {
      return this.f_30410.m_6297();
   }

   private static int m_8588(int var0) {
      if (var0 >= 0 && var0 < 9) {
         return 36 + var0;
      }

      if (var0 >= 9 && var0 < 36) {
         return var0;
      }

      return switch (var0) {
         case 36 -> 8;
         case 37 -> 7;
         case 38 -> 6;
         case 39 -> 5;
         case 40 -> 45;
         default -> -1;
      };
   }

   public InventorySort() {
      super(f_30424, f_30425, Category.MISC);
      this.f_30415 = new SliderSetting(f_30426, f_30427, 0.0F, f_30428).m_828(f_30429);
      this.f_30416 = new BooleanSetting(f_30430).m_1474(this::m_8570).m_1472();
      this.f_30417 = new Class_QmNR03reugBgWiPr();
      this.f_30418 = this::m_8562;
      this.f_30420 = -1;
      this.f_30421 = -1;
      this.f_30422 = 8;
      this.m_795(this.f_30415, this.f_30416);
   }

   private String m_8589(InventorySort.Class_6H1cx2XzHC7vSJVh var1, String var2, ItemStack var3) {
      return switch (var1) {
         case NORMAL, FUNTIME -> var2 != null && !var2.isBlank() ? var2 : var3.getHoverName().getString();
         case BALL -> f_30475;
         case PUMPKIN -> f_30476;
         case POTION -> {
            String var4 = this.m_8596(var3);
            yield var4 != null ? var4 : var2;
         }
      };
   }

   private String m_8590(String var1) {
      return StringUtil.stripColor(var1 == null ? "" : var1).toLowerCase(Locale.ROOT).replaceAll(f_30480, f_30481).trim();
   }

   private boolean m_8591(ItemStack var1, boolean var2) {
      return var1.is(Items.PLAYER_HEAD) && this.m_8548(var1) == var2;
   }

   public JsonObject m_8592() {
      return this.f_30411.deepCopy();
   }

   public String m_8593() {
      return this.f_30410.m_6294();
   }

   private static int[] m_8594() {
      int[] var0 = new int[41];
      int var1 = 0;
      var0[var1++] = 39;
      var0[var1++] = 38;
      var0[var1++] = 37;
      var0[var1++] = 36;
      var0[var1++] = 40;
      int var2 = 0;

      while (var2 < 9) {
         var0[var1++] = var2++;
      }

      var2 = 9;

      while (var2 < 36) {
         var0[var1++] = var2++;
      }

      return var0;
   }

   public InventorySort.moe13vRLIOivvpKs[] m_8595() {
      this.m_8585();
      return this.f_30409;
   }

   private String m_8596(ItemStack var1) {
      if (this.m_8550(var1, MobEffects.STRENGTH)) {
         return f_30485;
      } else if (this.m_8550(var1, MobEffects.SPEED)) {
         return f_30486;
      } else {
         return this.m_8550(var1, MobEffects.FIRE_RESISTANCE) ? f_30487 : null;
      }
   }

   public enum Class_6H1cx2XzHC7vSJVh {
      NORMAL,
      BALL,
      PUMPKIN,
      POTION,
      FUNTIME;
   }

   public record mA278GQ37c0o7Z5q(String name, String subtitle, ItemStack stack, InventorySort.Class_6H1cx2XzHC7vSJVh kind) {
      public String label() {
         return this.kind == InventorySort.Class_6H1cx2XzHC7vSJVh.FUNTIME ? InventorySort.m_8533(this.name) : this.name;
      }
   }

   public record moe13vRLIOivvpKs(ItemStack stack, String name, int count, InventorySort.Class_6H1cx2XzHC7vSJVh kind) {
      public String label() {
         return this.kind == InventorySort.Class_6H1cx2XzHC7vSJVh.FUNTIME ? InventorySort.m_8533(this.name) : this.name;
      }
   }
}
