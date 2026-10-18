package dev.dimasik.client.module.combat;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.system.Class_QmNR03reugBgWiPr;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_h78PE30BIJJYoUEk;
import dev.dimasik.client.system.Class_mRcJJZJYG5cvDAlU;
import net.minecraft.network.protocol.game.ServerboundPlayerCommandPacket;
import net.minecraft.network.protocol.game.ServerboundSetCarriedItemPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerCommandPacket.Action;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult.Type;

public final class TriggerBot extends Module {
   private final CheckboxSetting f_12446;
   private final CheckboxSetting f_12447;
   private final CheckboxSetting f_12448;
   private final CheckboxSetting f_12449;
   private final CheckboxSetting f_12450;
   private final CheckboxSetting f_12451;
   private final CheckboxSetting f_12452;
   private final Class_QmNR03reugBgWiPr f_12453;
   private int f_12454;
   private boolean f_12455;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_12456;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK.Class_07sbU45IoaK910B1> f_12457;
   private final Class_gEPk7yDw6CwIte87<Class_mRcJJZJYG5cvDAlU> f_12458;
   private static final String f_12459 = "TriggerBot";
   private static final String f_12460 = "Автоматически атакует существ в радиусе";
   private static final String f_12461 = "Бить только критами";
   private static final String f_12462 = "Автоматически ломать щит";
   private static final String f_12463 = "Только при зажатом пробеле";
   private static final String f_12464 = "Синхронизация с ТПС";
   private static final String f_12465 = "Не бить при использовании";
   private static final String f_12466 = "Только с оружием";
   private static final String f_12467 = "Сбрасывать спринт";
   private static final float f_12468 = 0.5F;
   private static final long f_12469 = 450L;
   private static final float f_12470 = 0.9F;
   private static final double f_12471 = 0.1F;
   private static final double f_12472 = 0.08;
   private static final double f_12473 = 2.5;
   private static final double f_12474 = 1.5;
   private static final double f_12475 = 0.05;
   private static final double f_12476 = 0.2;
   private static final double f_12477 = 0.3;
   private static final double f_12478 = 0.3;
   private static final double f_12479 = 0.3;
   private static final double f_12480 = 0.3;

   public TriggerBot() {
      super(f_12459, f_12460, Category.COMBAT);
      this.f_12446 = new CheckboxSetting(f_12461, true);
      this.f_12447 = new CheckboxSetting(f_12462, true);
      this.f_12448 = new CheckboxSetting(f_12463, false).m_822(this.f_12446::m_8768);
      this.f_12449 = new CheckboxSetting(f_12464, false);
      this.f_12450 = new CheckboxSetting(f_12465, false);
      this.f_12451 = new CheckboxSetting(f_12466, false);
      this.f_12452 = new CheckboxSetting(f_12467, true);
      this.f_12453 = new Class_QmNR03reugBgWiPr();
      this.f_12455 = true;
      this.f_12456 = this::m_4490;
      this.f_12457 = this::m_4493;
      this.f_12458 = this::m_4495;
      this.m_795(this.f_12451, this.f_12452, this.f_12446, this.f_12448, this.f_12449, this.f_12450, this.f_12447);
   }

   private void m_4487() {
      if (f_11537.player != null && f_11537.level != null) {
         if (f_11537.player.fallDistance > f_12471 && this.m_4498()) {
            this.f_12455 = false;
         } else {
            this.f_12455 = true;
         }
      } else {
         this.f_12455 = true;
      }
   }

   private boolean m_4488() {
      return f_11537.player.fallDistance > 0.0 && !f_11537.player.onGround();
   }

   private boolean m_4489() {
      boolean var1 = f_11537.player.getPose() == Pose.CROUCHING && f_11537.options.keyJump.isDown();
      double var2 = f_11537.player.getBbHeight() + (var1 ? f_12475 : f_12476);
      return !this.m_4499(var2);
   }

   private void m_4490(Class_Xu9btcIeUN33XnMK var1) {
      if (DimasikClient.m_9057().m_9049().m_2801().m_3590().m_776()) {
         this.f_12455 = true;
      } else {
         this.m_4487();
      }

      if (!DimasikClient.m_9057().m_9049().m_2801().m_3548().m_776()) {
         this.m_4497();
      }
   }

   private boolean m_4491() {
      if (f_11537.player.isInWater() || f_11537.player.onClimbable() || f_11537.player.getAbilities().flying) {
         return false;
      }

      if (!f_11537.player.onGround()) {
         return false;
      }

      boolean var1 = this.m_4499(f_11537.player.onGround() ? f_12473 : f_12474);
      boolean var2 = !this.m_4489();
      return var1 && var2;
   }

   public boolean m_4492() {
      if (f_11537.player == null) {
         return false;
      }

      if (f_11537.player.isUsingItem() && this.f_12450.m_8768()) {
         return false;
      }

      ItemStack var1 = f_11537.player.getMainHandItem();
      boolean var2 = var1.is(ItemTags.SWORDS) || var1.is(ItemTags.AXES);
      if (!var2 && this.f_12451.m_8768()) {
         return false;
      }

      float var3 = this.f_12449.m_8768() ? 0.0F : f_12468;
      boolean var4 = this.f_12453.m_4463(f_12469) && f_11537.player.getAttackStrengthScale(var3) > f_12470;
      boolean var5 = f_11537.options.keyJump.isDown() || !f_11537.player.onGround();
      if (this.m_4491()) {
         return var4;
      }

      boolean var6 = DimasikClient.m_9057().m_9049().m_2801().m_3548().m_776();
      boolean var7 = this.m_4494();
      boolean var8 = this.m_4488();
      return var6
         ? var4 && (!this.f_12446.m_8768() || !var7 || this.f_12448.m_8768() && !var5 || var8)
         : var4 && (!this.f_12446.m_8768() || !var7 || this.f_12448.m_8768() && !var5 || var8 && this.f_12455);
   }

   private void m_4493(Class_Xu9btcIeUN33XnMK.Class_07sbU45IoaK910B1 var1) {
      if (DimasikClient.m_9057().m_9049().m_2801().m_3548().m_776()) {
         this.m_4497();
      }
   }

   private boolean m_4494() {
      return !f_11537.player.isInWater()
         && !f_11537.player.isInLava()
         && !f_11537.player.onClimbable()
         && !f_11537.player.getAbilities().flying
         && !f_11537.player.isPassenger()
         && !f_11537.player.hasEffect(MobEffects.BLINDNESS)
         && !f_11537.player.hasEffect(MobEffects.SLOW_FALLING)
         && !f_11537.player.hasEffect(MobEffects.LEVITATION)
         && !f_11537.player.isFallFlying();
   }

   private void m_4495(Class_mRcJJZJYG5cvDAlU var1) {
      if (this.f_12454 > 0 && this.f_12452.m_8768()) {
         var1.m_7590(0.0F);
         var1.m_7596(0.0F);
         var1.m_7587(false);
         var1.m_7597(false);
         var1.m_7599(false);
         var1.m_7594(false);
         this.f_12454--;
      }
   }

   @Override
   public void m_732() {
      this.f_12455 = false;
      this.f_12454 = 0;
      super.m_732();
   }

   private boolean m_4496(Entity var1) {
      if (!this.f_12447.m_8768()) {
         return false;
      }

      if (var1 instanceof LivingEntity var2) {
         int var3 = Class_h78PE30BIJJYoUEk.m_7079();
         if (var2.getUseItem().getItem() == Items.SHIELD && var3 != -1) {
            if (var3 < 9) {
               f_11537.getConnection().send(new ServerboundSetCarriedItemPacket(var3));
               f_11537.gameMode.attack(f_11537.player, var2);
               f_11537.player.swing(InteractionHand.MAIN_HAND);
               f_11537.getConnection().send(new ServerboundSetCarriedItemPacket(f_11537.player.getInventory().selected));
            } else {
               f_11537.gameMode
                  .handleContainerInput(
                     f_11537.player.inventoryMenu.containerId, var3, f_11537.player.getInventory().selected, ContainerInput.SWAP, f_11537.player
                  );
               f_11537.gameMode.attack(f_11537.player, var2);
               f_11537.player.swing(InteractionHand.MAIN_HAND);
               f_11537.gameMode
                  .handleContainerInput(
                     f_11537.player.inventoryMenu.containerId, var3, f_11537.player.getInventory().selected, ContainerInput.SWAP, f_11537.player
                  );
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void m_4497() {
      if (f_11537.player != null && f_11537.level != null && f_11537.gameMode != null) {
         if (f_11537.hitResult instanceof EntityHitResult var1 && var1.getType() == Type.ENTITY) {
            if (this.m_4492()) {
               boolean var4 = DimasikClient.m_9057().m_9052().m_6338().m_1499()
                  && !f_11537.player.isInWater()
                  && !f_11537.player.isInLava()
                  && !f_11537.player.isSwimming();
               if (var4 && this.f_12452.m_8768()) {
                  this.f_12454 = 1;
                  if (DimasikClient.m_9057().m_9052().m_6338().m_1499()) {
                     f_11537.player.setSprinting(false);
                     f_11537.getConnection().send(new ServerboundPlayerCommandPacket(f_11537.player, Action.STOP_SPRINTING));
                  }
               }

               Entity var3 = var1.getEntity();
               f_11537.gameMode.attack(f_11537.player, var3);
               f_11537.player.swing(InteractionHand.MAIN_HAND);
               this.f_12455 = false;
               this.f_12453.m_4459();
               this.m_4496(var3);
            }
         }
      }
   }

   private boolean m_4498() {
      AABB var1 = f_11537.player.getBoundingBox().move(0.0, Math.min(f_11537.player.getDeltaMovement().y, 0.0) - f_12472, 0.0);
      return f_11537.level.getBlockCollisions(f_11537.player, var1).iterator().hasNext();
   }

   private boolean m_4499(double var1) {
      double var3 = f_11537.player.getX();
      double var5 = f_11537.player.getY();
      double var7 = f_11537.player.getZ();
      AABB var9 = new AABB(var3 - f_12477, var5 + f_11537.player.getBbHeight(), var7 - f_12478, var3 + f_12479, var5 + var1, var7 + f_12480);
      return f_11537.level.getBlockCollisions(f_11537.player, var9).iterator().hasNext();
   }
}
