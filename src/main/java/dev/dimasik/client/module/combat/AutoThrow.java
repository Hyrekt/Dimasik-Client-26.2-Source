package dev.dimasik.client.module.combat;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.IntegerSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_8x4deAyjocMIBSj7;
import dev.dimasik.client.system.Class_B6JOzHnwhU3pe4AO;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_ftHu9o3WzCU3Adxm;
import dev.dimasik.client.system.Class_g3Fg4YmMuzK7loFX;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.protocol.game.ServerboundSetCarriedItemPacket;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public final class AutoThrow extends Module {
   private static final String f_11304 = "Автоматический";
   private static final String f_11305 = "По бинду";
   private static final long f_11306 = 5000000000L;
   private final MultiChoiceSetting f_11307;
   private final IntegerSetting f_11308;
   private final SliderSetting f_11309;
   private final SliderSetting f_11310;
   private final Class_8x4deAyjocMIBSj7 f_11311;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_11312;
   private final Class_gEPk7yDw6CwIte87<Class_B6JOzHnwhU3pe4AO> f_11313;
   private AutoThrow.wNOSci2IrKm5Sm5T f_11314;
   private int f_11315;
   private int f_11316;
   private int f_11317;
   private int f_11318;
   private boolean f_11319;
   private boolean f_11320;
   private long f_11321;
   private static final String f_11322 = "Auto Throw";
   private static final String f_11323 = "Автоматически бросает взрывное зелье исцеления";
   private static final String f_11324 = "Режим";
   private static final String f_11325 = "Автоматический";
   private static final String f_11326 = "По бинду";
   private static final String f_11327 = "Кнопка";
   private static final String f_11328 = "Здоровье цели";
   private static final float f_11329 = 15.0F;
   private static final float f_11330 = 20.0F;
   private static final float f_11331 = 0.5F;
   private static final String f_11332 = "Дистанция";
   private static final float f_11333 = 3.0F;
   private static final float f_11334 = 6.0F;
   private static final float f_11335 = 0.1F;
   private static final String f_11336 = "По бинду";
   private static final String f_11337 = "Автоматический";
   private static final long f_11338 = 5000000000L;
   private static final String f_11339 = "В инвентаре нет взрывного зелья исцеления.";
   private static final double f_11340 = 0.15;
   private static final String f_11341 = "Автоматический";
   private static final String f_11342 = "Автоматический";
   private static final String f_11343 = "По бинду";

   public AutoThrow() {
      super(f_11322, f_11323, Category.COMBAT);
      this.f_11307 = new MultiChoiceSetting(f_11324, new Class_2ZaVm8TGDJ68TnJB(f_11325), new Class_2ZaVm8TGDJ68TnJB(f_11326));
      this.f_11308 = new IntegerSetting(f_11327, () -> this.f_11307.m_7568(f_11343));
      this.f_11309 = new SliderSetting(f_11328, f_11329, 1.0F, f_11330).m_828(f_11331).m_822(() -> this.f_11307.m_7568(f_11342));
      this.f_11310 = new SliderSetting(f_11332, f_11333, 1.0F, f_11334).m_828(f_11335).m_822(() -> this.f_11307.m_7568(f_11341));
      this.f_11311 = new Class_8x4deAyjocMIBSj7();
      this.f_11312 = this::m_3949;
      this.f_11313 = this::m_3951;
      this.f_11314 = AutoThrow.wNOSci2IrKm5Sm5T.IDLE;
      this.f_11315 = -1;
      this.f_11316 = -1;
      this.m_795(this.f_11307, this.f_11308, this.f_11309, this.f_11310);
   }

   private void m_3949(Class_Xu9btcIeUN33XnMK var1) {
      if (!this.m_3963()) {
         this.m_3952(false);
      } else if (this.f_11314 != AutoThrow.wNOSci2IrKm5Sm5T.IDLE) {
         this.m_3960();
      } else if (this.f_11307.m_7568(f_11337) && f_11537.gui.screen() == null && System.nanoTime() - this.f_11321 >= f_11338) {
         LivingEntity var2 = DimasikClient.m_9057().m_9049().m_2801().m_3576().m_1114();
         if (var2 instanceof Player
            && var2.isAlive()
            && this.m_3961(var2)
            && !(Class_g3Fg4YmMuzK7loFX.m_6757(var2) + var2.getAbsorptionAmount() >= this.f_11309.m_8768())
            && !(f_11537.player.distanceTo(var2) > this.f_11310.m_8768())
            && this.m_3953(var2)) {
            this.m_3966(false);
         }
      }
   }

   private void m_3950() {
      if (!this.f_11320) {
         this.m_3954(this.f_11316);
         this.m_3952(false);
      } else {
         if (this.f_11311
               .m_1901(
                  () -> f_11537.gameMode.handleContainerInput(f_11537.player.inventoryMenu.containerId, this.f_11315, 8, ContainerInput.SWAP, f_11537.player),
                  true
               )
            == Class_8x4deAyjocMIBSj7.Class_8xzBZ83gOSc56UI6.SUCCESS) {
            this.f_11320 = false;
            this.m_3954(this.f_11316);
            this.m_3952(false);
         }
      }
   }

   private void m_3951(Class_B6JOzHnwhU3pe4AO var1) {
      if (this.f_11307.m_7568(f_11336)
         && var1.m_2116() == 1
         && this.f_11308.m_8768() >= 0
         && var1.m_2117() == this.f_11308.m_8768()
         && f_11537.gui.screen() == null) {
         this.m_3966(true);
      }
   }

   private void m_3952(boolean var1) {
      if (var1 && this.m_3963()) {
         if (this.f_11320 && this.f_11315 >= 9) {
            f_11537.gameMode.handleContainerInput(f_11537.player.inventoryMenu.containerId, this.f_11315, 8, ContainerInput.SWAP, f_11537.player);
         }

         this.m_3954(this.f_11316);
      }

      this.f_11311.m_1907();
      this.f_11314 = AutoThrow.wNOSci2IrKm5Sm5T.IDLE;
      this.f_11315 = -1;
      this.f_11316 = -1;
      this.f_11317 = 0;
      this.f_11318 = 0;
      this.f_11319 = false;
      this.f_11320 = false;
   }

   private boolean m_3953(LivingEntity var1) {
      Vec3 var2 = f_11537.player.getEyePosition();
      Vec3 var3 = var2.add(f_11537.player.getViewVector(1.0F).scale(this.f_11310.m_8768() + 1.0F));
      AABB var4 = var1.getBoundingBox().inflate(f_11340);
      return var4.contains(var2) || var4.clip(var2, var3).isPresent();
   }

   private void m_3954(int var1) {
      if (var1 >= 0 && var1 <= 8 && f_11537.player.getInventory().getSelectedSlot() != var1) {
         f_11537.player.getInventory().selected = var1;
         f_11537.player.connection.send(new ServerboundSetCarriedItemPacket(var1));
      }
   }

   private int m_3956() {
      for (int var1 = 0; var1 < 9; var1++) {
         if (this.m_3964(f_11537.player.getInventory().getItem(var1))) {
            return var1;
         }
      }

      for (int var2 = 9; var2 < 36; var2++) {
         if (this.m_3964(f_11537.player.getInventory().getItem(var2))) {
            return var2;
         }
      }

      return -1;
   }

   @Override
   public void m_732() {
      this.m_3952(true);
   }

   private void m_3960() {
      if (++this.f_11318 > 60 || f_11537.player.isDeadOrDying()) {
         this.m_3952(true);
      } else if (this.f_11317 > 0) {
         this.f_11317--;
      } else {
         switch (this.f_11314) {
            case EQUIP:
               this.m_3965();
               break;
            case THROW:
               this.m_3968();
               break;
            case RESTORE:
               this.m_3950();
         }
      }
   }

   private boolean m_3961(LivingEntity var1) {
      return var1.isUsingItem() && var1.getTicksUsingItem() >= 10 && !var1.getUseItem().is(Items.SPLASH_POTION) && this.m_3967(var1.getUseItem());
   }

   private boolean m_3963() {
      return f_11537.player != null && f_11537.level != null && f_11537.gameMode != null && f_11537.getConnection() != null;
   }

   private boolean m_3964(ItemStack var1) {
      return var1 != null && !var1.isEmpty() && var1.is(Items.SPLASH_POTION) && this.m_3967(var1);
   }

   private void m_3965() {
      if (this.f_11319) {
         this.m_3954(this.f_11315);
         this.f_11317 = 1;
         this.f_11314 = AutoThrow.wNOSci2IrKm5Sm5T.THROW;
      } else {
         if (this.f_11311.m_1901(() -> {
            f_11537.gameMode.handleContainerInput(f_11537.player.inventoryMenu.containerId, this.f_11315, 8, ContainerInput.SWAP, f_11537.player);
            this.f_11320 = true;
         }, true) == Class_8x4deAyjocMIBSj7.Class_8xzBZ83gOSc56UI6.SUCCESS) {
            this.m_3954(8);
            this.f_11317 = 1;
            this.f_11314 = AutoThrow.wNOSci2IrKm5Sm5T.THROW;
         }
      }
   }

   private void m_3966(boolean var1) {
      if (this.m_3963() && f_11537.gui.screen() == null && this.f_11314 == AutoThrow.wNOSci2IrKm5Sm5T.IDLE) {
         int var2 = this.m_3956();
         if (var2 < 0) {
            if (var1) {
               Class_ftHu9o3WzCU3Adxm.m_6731(f_11339);
            }
         } else {
            this.f_11315 = var2;
            this.f_11316 = f_11537.player.getInventory().getSelectedSlot();
            this.f_11319 = var2 < 9;
            this.f_11320 = false;
            this.f_11317 = 0;
            this.f_11318 = 0;
            this.f_11314 = AutoThrow.wNOSci2IrKm5Sm5T.EQUIP;
         }
      }
   }

   private boolean m_3967(ItemStack var1) {
      if (var1 != null && !var1.isEmpty()) {
         PotionContents var2 = (PotionContents)var1.get(DataComponents.POTION_CONTENTS);
         if (var2 == null) {
            return false;
         }

         for (MobEffectInstance var4 : var2.getAllEffects()) {
            if (var4.getEffect().equals(MobEffects.INSTANT_HEALTH)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public void m_778() {
      this.f_11321 = 0L;
      this.m_3952(false);
   }

   private void m_3968() {
      if (!this.m_3964(f_11537.player.getInventory().getSelectedItem())) {
         this.m_3952(true);
      } else {
         f_11537.gameMode.useItem(f_11537.player, InteractionHand.MAIN_HAND);
         this.f_11321 = System.nanoTime();
         this.f_11317 = 1;
         this.f_11314 = AutoThrow.wNOSci2IrKm5Sm5T.RESTORE;
      }
   }

   private enum wNOSci2IrKm5Sm5T {
      IDLE,
      EQUIP,
      THROW,
      RESTORE;
   }
}
