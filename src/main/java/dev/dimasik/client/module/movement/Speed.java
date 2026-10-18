package dev.dimasik.client.module.movement;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.module.combat.Aura;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_EndlYW7bFBb6ZTsy;
import dev.dimasik.client.system.Class_J4cQIb7yfObhq6oF;
import dev.dimasik.client.system.Class_QBKwWNWLlChWViO9;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_ZPRMV6aCWVosHRWh;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_jfpiTZhNIuwDwqKr;
import dev.dimasik.client.system.Class_mRcJJZJYG5cvDAlU;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import net.minecraft.network.protocol.game.ClientboundSetEntityMotionPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerCommandPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerCommandPacket.Action;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.component.ItemAttributeModifiers.Entry;
import net.minecraft.world.phys.Vec3;

public class Speed extends Module {
   public final Map<Entity, Vec3> f_12662 = new HashMap<>();
   private final MultiChoiceSetting f_12663;
   private final SliderSetting f_12664;
   private final SliderSetting f_12665;
   private final SliderSetting f_12666;
   private final CheckboxSetting f_12667;
   private final MultiChoiceSetting f_12668;
   private final SliderSetting f_12669;
   private final CheckboxSetting f_12670;
   private final SliderSetting f_12671;
   private final SliderSetting f_12672;
   private final SliderSetting f_12673;
   private int f_12674;
   private int f_12675;
   private long f_12676;
   private double f_12677;
   private double f_12678;
   private boolean f_12679;
   private int f_12680;
   private final Class_gEPk7yDw6CwIte87<Class_mRcJJZJYG5cvDAlU> f_12681;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_12682;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_12683;
   private final Class_gEPk7yDw6CwIte87<Class_jfpiTZhNIuwDwqKr.Class_13dQBetjQQOBNsco> f_12684;
   private final Class_gEPk7yDw6CwIte87<Class_J4cQIb7yfObhq6oF> f_12685;
   private final Class_gEPk7yDw6CwIte87<Class_EndlYW7bFBb6ZTsy> f_12686;
   private static final String f_12687 = "Speed";
   private static final String f_12688 = "Ускоряет скорость передвижения";
   private static final String f_12689 = "Мод";
   private static final String f_12690 = "Grim 72";
   private static final String f_12691 = "Grim колиззия";
   private static final String f_12692 = "MetaHvH";
   private static final String f_12693 = "HVH";
   private static final String f_12694 = "Vanila";
   private static final String f_12695 = "Скорость";
   private static final float f_12696 = 0.4F;
   private static final float f_12697 = 0.1F;
   private static final String f_12698 = "Скорость 2";
   private static final float f_12699 = 3.4F;
   private static final float f_12700 = 5.0F;
   private static final float f_12701 = 0.1F;
   private static final String f_12702 = "HolyWorld скорость";
   private static final float f_12703 = 1.6F;
   private static final float f_12704 = 0.8F;
   private static final float f_12705 = 3.0F;
   private static final float f_12706 = 0.05F;
   private static final String f_12707 = "Авто прыжок";
   private static final String f_12708 = "HVH режим";
   private static final String f_12709 = "Default";
   private static final String f_12710 = "Custom";
   private static final String f_12711 = "HVH скорость";
   private static final float f_12712 = 0.2F;
   private static final float f_12713 = 0.2F;
   private static final float f_12714 = 1.05F;
   private static final float f_12715 = 0.01F;
   private static final String f_12716 = "HVH буст с дамагом";
   private static final String f_12717 = "HVH значение буста";
   private static final float f_12718 = 0.7F;
   private static final float f_12719 = 0.1F;
   private static final float f_12720 = 5.0F;
   private static final float f_12721 = 0.1F;
   private static final String f_12722 = "HVH длительность буста";
   private static final float f_12723 = 700.0F;
   private static final float f_12724 = 100.0F;
   private static final float f_12725 = 2000.0F;
   private static final float f_12726 = 100.0F;
   private static final String f_12727 = "Vanila скорость";
   private static final float f_12728 = 0.5F;
   private static final float f_12729 = 0.3F;
   private static final float f_12730 = 0.1F;
   private static final String f_12731 = "HVH";
   private static final String f_12732 = "MetaHvH";
   private static final String f_12733 = "Grim колиззия";
   private static final double f_12734 = 0.35;
   private static final double f_12735 = 0.067;
   private static final double f_12736 = 5.0;
   private static final double f_12737 = 0.067;
   private static final String f_12738 = "Custom";
   private static final float f_12739 = 0.49665F;
   private static final float f_12740 = 0.41598004F;
   private static final float f_12741 = 0.43F;
   private static final float f_12742 = 0.36F;
   private static final float f_12743 = 0.2924F;
   private static final float f_12744 = 0.24480002F;
   private static final float f_12745 = 0.835F;
   private static final float f_12746 = 1.435F;
   private static final float f_12747 = 10.0F;
   private static final float f_12748 = 1.3F;
   private static final String f_12749 = "Шар Геракла 2";
   private static final String f_12750 = "Шар CHAMPION";
   private static final String f_12751 = "Шар GOD";
   private static final String f_12752 = "Талисман Венома";
   private static final String f_12753 = "КУБИК-РУБИК";
   private static final double f_12754 = 3.0;
   private static final double f_12755 = 3.5;
   private static final String f_12756 = "AttributeModifiers";
   private static final String f_12757 = "AttributeName";
   private static final String f_12758 = "Amount";
   private static final double f_12759 = 3.0;
   private static final double f_12760 = 3.5;
   private static final String f_12761 = "minecraft:generic.armor";
   private static final String f_12762 = "minecraft:armor";
   private static final String f_12763 = "generic.armor";
   private static final String f_12764 = ":armor";
   private static final String f_12765 = ".armor";
   private static final float f_12766 = 0.452154F;
   private static final float f_12767 = 0.520174F;
   private static final float f_12768 = 0.591416F;
   private static final float f_12769 = 0.358F;
   private static final float f_12770 = 0.358F;
   private static final double f_12771 = 20.0;
   private static final float f_12772 = -45.0F;
   private static final float f_12773 = 45.0F;
   private static final float f_12774 = 45.0F;
   private static final float f_12775 = -45.0F;
   private static final float f_12776 = -1.0F;
   private static final float f_12777 = 90.0F;
   private static final float f_12778 = 90.0F;
   private static final String f_12779 = "Vanila";
   private static final double f_12780 = 1.0E-4;
   private static final double f_12781 = 0.97;
   private static final double f_12782 = 0.7;
   private static final double f_12783 = 0.02;
   private static final double f_12784 = 0.08;
   private static final String f_12785 = "Grim 72";
   private static final String f_12786 = "HolyWorld";
   private static final String f_12787 = "Grim 72";
   private static final double f_12788 = 0.03;
   private static final double f_12789 = 0.03;
   private static final double f_12790 = 0.085;
   private static final double f_12791 = 0.03;
   private static final double f_12792 = -0.08;
   private static final String f_12793 = "Grim 72";
   private static final String f_12794 = "HolyWorld";
   private static final String f_12795 = "Grim 72";
   private static final String f_12796 = "HVH";
   private static final String f_12797 = "Grim 72";
   private static final String f_12798 = "HolyWorld";
   private static final String f_12799 = "Grim 72";
   private static final String f_12800 = "HolyWorld";
   private static final String f_12801 = "Vanila";
   private static final String f_12802 = "HVH";
   private static final String f_12803 = "HVH";
   private static final String f_12804 = "HVH";
   private static final String f_12805 = "HVH";
   private static final String f_12806 = "Custom";
   private static final String f_12807 = "HVH";
   private static final String f_12808 = "MetaHvH";
   private static final String f_12809 = "HolyWorld";
   private static final String f_12810 = "Grim 72";
   private static final String f_12811 = "Grim 72";

   @Override
   public void m_732() {
      this.m_4599();
   }

   private boolean m_4578() {
      return f_11537.player == null
         || !this.f_12663.m_7568(f_12799) && !this.f_12663.m_7568(f_12800)
         || f_11537.level == null
         || f_11537.getConnection() == null
         || !Class_QBKwWNWLlChWViO9.m_4256()
         || f_11537.player.isPassenger()
         || f_11537.player.getAbilities().flying;
   }

   private boolean m_4579() {
      return f_11537.player != null
         && f_11537.level != null
         && f_11537.getConnection() != null
         && Class_QBKwWNWLlChWViO9.m_4256()
         && !f_11537.player.isPassenger()
         && !f_11537.player.getAbilities().flying
         && this.m_4584();
   }

   private void m_4580() {
      this.f_12680 = 0;
      this.m_4595();
   }

   public Speed() {
      super(f_12687, f_12688, Category.MOVEMENT);
      this.f_12663 = new MultiChoiceSetting(
         f_12689,
         new Class_2ZaVm8TGDJ68TnJB(f_12690),
         new Class_2ZaVm8TGDJ68TnJB(f_12691),
         new Class_2ZaVm8TGDJ68TnJB(f_12692),
         new Class_2ZaVm8TGDJ68TnJB(f_12693),
         new Class_2ZaVm8TGDJ68TnJB(f_12694)
      );
      this.f_12664 = new SliderSetting(f_12695, f_12696, 0.0F, 2.0F).m_828(f_12697).m_822(() -> this.f_12663.m_7568(f_12811));
      this.f_12665 = new SliderSetting(f_12698, f_12699, 1.0F, f_12700).m_828(f_12701).m_822(() -> this.f_12663.m_7568(f_12810));
      this.f_12666 = new SliderSetting(f_12702, f_12703, f_12704, f_12705).m_828(f_12706).m_822(() -> this.f_12663.m_7568(f_12809));
      this.f_12667 = new CheckboxSetting(f_12707, true).m_822(() -> this.f_12663.m_7568(f_12808));
      this.f_12668 = new MultiChoiceSetting(f_12708, new Class_2ZaVm8TGDJ68TnJB(f_12709), new Class_2ZaVm8TGDJ68TnJB(f_12710))
         .m_822(() -> this.f_12663.m_7568(f_12807));
      this.f_12669 = new SliderSetting(f_12711, f_12712, f_12713, f_12714)
         .m_828(f_12715)
         .m_822(() -> this.f_12663.m_7568(f_12805) && this.f_12668.m_7568(f_12806));
      this.f_12670 = new CheckboxSetting(f_12716, false).m_822(() -> this.f_12663.m_7568(f_12804));
      this.f_12671 = new SliderSetting(f_12717, f_12718, f_12719, f_12720).m_828(f_12721).m_822(() -> this.f_12663.m_7568(f_12803) && this.f_12670.m_8768());
      this.f_12672 = new SliderSetting(f_12722, f_12723, f_12724, f_12725).m_828(f_12726).m_822(() -> this.f_12663.m_7568(f_12802) && this.f_12670.m_8768());
      this.f_12673 = new SliderSetting(f_12727, f_12728, f_12729, 2.0F).m_828(f_12730).m_822(() -> this.f_12663.m_7568(f_12801));
      this.f_12675 = -1;
      this.f_12681 = this::m_4601;
      this.f_12682 = this::m_4594;
      this.f_12683 = this::m_4593;
      this.f_12684 = this::m_4607;
      this.f_12685 = this::m_4610;
      this.f_12686 = this::m_4598;
      this.m_795(
         this.f_12663,
         this.f_12664,
         this.f_12665,
         this.f_12666,
         this.f_12667,
         this.f_12668,
         this.f_12669,
         this.f_12670,
         this.f_12671,
         this.f_12672,
         this.f_12673
      );
   }

   private double m_4583(Entity var1) {
      Vec3 var2 = var1.position();
      Vec3 var3 = this.f_12662.put(var1, var2);
      if (var3 == null) {
         return 0.0;
      }

      double var4 = var2.x - var3.x;
      double var6 = var2.z - var3.z;
      return Math.sqrt(var4 * var4 + var6 * var6) * f_12771;
   }

   private boolean m_4584() {
      return f_11537.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA) || this.m_4587() != -1;
   }

   public static void m_4585(float var0) {
      Class_ZPRMV6aCWVosHRWh.m_5820(var0);
   }

   private void m_4586() {
      if (this.m_4579() && !f_11537.player.isFallFlying() && !f_11537.player.onGround() && !(f_11537.player.getDeltaMovement().y >= 0.0) && this.f_12680 <= 0) {
         int var1 = this.m_4587();
         if (f_11537.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA)) {
            f_11537.getConnection().send(new ServerboundPlayerCommandPacket(f_11537.player, Action.START_FALL_FLYING));
            this.f_12680 = 4;
         } else if (var1 != -1) {
            if (this.f_12675 == -1) {
               this.f_12675 = f_11537.player.getInventory().getSelectedSlot();
            }

            if (f_11537.player.getInventory().getSelectedSlot() != var1) {
               f_11537.player.getInventory().setSelectedSlot(var1);
            } else {
               f_11537.getConnection()
                  .send(
                     new ServerboundPlayerActionPacket(
                        net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.Action.SWAP_ITEM_WITH_OFFHAND, BlockPos.ZERO, Direction.DOWN
                     )
                  );
               f_11537.getConnection().send(new ServerboundPlayerCommandPacket(f_11537.player, Action.START_FALL_FLYING));
               f_11537.getConnection()
                  .send(
                     new ServerboundPlayerActionPacket(
                        net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.Action.SWAP_ITEM_WITH_OFFHAND, BlockPos.ZERO, Direction.DOWN
                     )
                  );
               this.m_4595();
               this.f_12680 = 4;
            }
         }
      }
   }

   private int m_4587() {
      for (int var1 = 0; var1 < 9; var1++) {
         if (f_11537.player.getInventory().getItem(var1).is(Items.ELYTRA)) {
            return var1;
         }
      }

      return -1;
   }

   private boolean m_4591(String var1) {
      String var2 = var1 == null ? "" : var1.toLowerCase(Locale.ROOT);
      return var2.equals(f_12761) || var2.equals(f_12762) || var2.equals(f_12763) || var2.endsWith(f_12764) || var2.endsWith(f_12765);
   }

   private void m_4592() {
      if (!this.m_4579()) {
         this.m_4580();
      } else {
         if (this.f_12680 > 0) {
            this.f_12680--;
         }

         if (f_11537.player.isFallFlying()) {
            Vec3 var1 = f_11537.player.getViewVector(1.0F);
            double var2 = this.f_12666.m_8768().floatValue();
            f_11537.player.setDeltaMovement(var1.x * var2, Math.min(var1.y * var2, f_12792), var1.z * var2);
         }
      }
   }

   public void m_4593(Class_XzpX8S5F5zd9jbuE var1) {
      if (this.f_12663.m_7568(f_12796)
         && this.f_12670.m_8768()
         && var1.m_5619() instanceof ClientboundSetEntityMotionPacket var2
         && f_11537.player != null
         && var2.id() == f_11537.player.getId()) {
         this.f_12676 = System.currentTimeMillis();
      }

      if (!this.m_4578()) {
         if (var1.m_5619() instanceof ClientboundPlayerPositionPacket) {
            if (this.f_12663.m_7568(f_12797)) {
               if (this.f_12674 % 2 == 1) {
                  this.f_12674++;
               }

               m_4585(1.0F);
            } else if (this.f_12663.m_7568(f_12798)) {
               this.f_12680 = 5;
               this.m_4595();
            }
         }
      }
   }

   public void m_4594(Class_Xu9btcIeUN33XnMK var1) {
      if (this.f_12663.m_7568(f_12731)) {
         this.m_4608();
      } else if (this.f_12663.m_7568(f_12732)) {
         this.m_4600();
      } else if (this.f_12663.m_7568(f_12733)) {
         if (f_11537.player != null && f_11537.level != null && Class_QBKwWNWLlChWViO9.m_4256()) {
            double var2 = f_12734;
            List var4 = f_11537.level
               .getEntities(
                  f_11537.player, f_11537.player.getBoundingBox().inflate(var2), var0 -> var0.isAlive() && (var0 instanceof Player || var0 instanceof Boat)
               );
            if (!var4.isEmpty()) {
               double var5 = f_12735;

               for (Entity var8 : (Iterable<Entity>) (Iterable) var4) {
                  if (var8 instanceof Player) {
                     double var9 = this.m_4583(var8);
                     if (var9 >= f_12736) {
                        var5 = f_12737;
                        break;
                     }
                  }
               }

               double[] var11 = this.m_4609(var5);
               f_11537.player.push(var11[0], 0.0, var11[1]);
            }
         }
      }
   }

   private void m_4595() {
      if (this.f_12675 != -1 && f_11537.player != null) {
         f_11537.player.getInventory().setSelectedSlot(this.f_12675);
      }

      this.f_12675 = -1;
   }

   private double[] m_4596(double var1, double var3) {
      Aura var5 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
      return var5 != null && var5.m_1013() ? var5.m_1011(var1, var3) : new double[]{var1, var3};
   }

   @Override
   public void m_778() {
      this.m_4599();
   }

   private void m_4598(Class_EndlYW7bFBb6ZTsy var1) {
      if (this.f_12663.m_7568(f_12779) && f_11537.player != null && f_11537.level != null) {
         if (!f_11537.player.getAbilities().flying && !f_11537.player.isFallFlying() && !f_11537.player.isPassenger()) {
            Vec3 var2 = var1.m_2544();
            if (!Class_QBKwWNWLlChWViO9.m_4256()) {
               this.f_12679 = false;
               if (f_11537.player.onGround()) {
                  var1.m_2545(new Vec3(0.0, var2.y, 0.0));
               }
            } else {
               double var3 = Class_QBKwWNWLlChWViO9.m_4258(true);
               double var5 = this.f_12673.m_8768().floatValue();
               double var7 = -Math.sin(var3);
               double var9 = Math.cos(var3);
               double var11 = var7 * var5;
               double var13 = var9 * var5;
               boolean var15 = f_11537.player.isInWater() || f_11537.player.isInLava();
               if (!f_11537.player.onGround() || var15) {
                  double var16 = this.f_12679 ? this.f_12677 : var2.x;
                  double var18 = this.f_12679 ? this.f_12678 : var2.z;
                  double var20 = Math.hypot(var16, var18);
                  double var22 = var20 < f_12780 ? 1.0 : (var16 * var7 + var18 * var9) / var20;
                  double var24 = var15 ? f_12781 : f_12782;
                  double var26 = var15 ? f_12783 : f_12784;
                  if (var22 < var24) {
                     double var28 = var11 - var16;
                     double var30 = var13 - var18;
                     double var32 = Math.hypot(var28, var30);
                     if (var32 > var26) {
                        var11 = var16 + var28 / var32 * var26;
                        var13 = var18 + var30 / var32 * var26;
                     }
                  }
               }

               this.f_12679 = true;
               double[] var36 = this.m_4596(var11, var13);
               var11 = var36[0];
               var13 = var36[1];
               this.f_12677 = var11;
               this.f_12678 = var13;
               f_11537.player.setDeltaMovement(var11, f_11537.player.getDeltaMovement().y, var13);
               var1.m_2545(new Vec3(var11, var2.y, var13));
            }
         } else {
            this.f_12679 = false;
         }
      }
   }

   private void m_4599() {
      this.m_4595();
      this.f_12674 = 0;
      this.f_12680 = 0;
      this.f_12679 = false;
      m_4585(1.0F);
   }

   private void m_4600() {
      if (f_11537.player != null && f_11537.level != null && !f_11537.player.getAbilities().flying) {
         MobEffectInstance var2 = f_11537.player.getEffect(MobEffects.SPEED);
         float var1;
         if (var2 != null) {
            if (var2.getAmplifier() == 0) {
               var1 = f_12766;
            } else if (var2.getAmplifier() == 1) {
               var1 = f_12767;
            } else if (var2.getAmplifier() >= 2) {
               var1 = f_12768;
            } else {
               var1 = f_12769;
            }
         } else {
            var1 = f_12770;
         }

         if (!f_11537.player.isFallFlying() && !f_11537.player.isInWater() && !f_11537.player.isEyeInFluid(FluidTags.WATER) && !f_11537.player.onGround()) {
            Class_QBKwWNWLlChWViO9.m_4254(var1);
         }

         if (this.f_12667.m_8768() && Class_QBKwWNWLlChWViO9.m_4256() && f_11537.player.onGround() && !f_11537.options.keyJump.isDown()) {
            f_11537.player.jumpFromGround();
         }
      }
   }

   public void m_4601(Class_mRcJJZJYG5cvDAlU var1) {
   }

   private boolean m_4606() {
      ItemStack var1 = f_11537.player.getItemBySlot(EquipmentSlot.HEAD);
      if (!var1.isEmpty() && var1.is(Items.PLAYER_HEAD)) {
         ItemAttributeModifiers var2 = (ItemAttributeModifiers)var1.get(DataComponents.ATTRIBUTE_MODIFIERS);
         if (var2 != null) {
            for (Entry var4 : var2.modifiers()) {
               if (this.m_4591(var4.attribute().unwrapKey().map(var0 -> var0.identifier().toString()).orElse(""))) {
                  double var5 = var4.modifier().amount();
                  if (var5 == f_12754 || var5 == f_12755) {
                     return true;
                  }
               }
            }
         }

         CustomData var11 = (CustomData)var1.get(DataComponents.CUSTOM_DATA);
         if (var11 == null) {
            return false;
         }

         Optional var12 = var11.copyTag().getList(f_12756);
         if (var12.isEmpty()) {
            return false;
         }

         for (Tag var6 : (ListTag)var12.get()) {
            if (var6 instanceof CompoundTag var7) {
               String var8 = var7.getString(f_12757).orElse("");
               double var9 = var7.getDouble(f_12758).orElse(0.0);
               if (this.m_4591(var8) && (var9 == f_12759 || var9 == f_12760)) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public void m_4607(Class_jfpiTZhNIuwDwqKr.Class_13dQBetjQQOBNsco var1) {
      if (this.m_4578() && this.f_12663.m_7568(f_12793)) {
         this.m_4599();
      } else if (this.f_12663.m_7568(f_12794)) {
         this.m_4586();
      } else {
         if (this.f_12663.m_7568(f_12795) && this.f_12674 % 2 == 0) {
            m_4585(this.f_12664.m_8768());
            f_11537.getConnection().send(new ServerboundPlayerCommandPacket(f_11537.player, Action.START_FALL_FLYING));
            f_11537.getConnection().send(new ServerboundPlayerCommandPacket(f_11537.player, Action.START_FALL_FLYING));
         }
      }
   }

   private void m_4608() {
      if (f_11537.player != null && f_11537.level != null && !f_11537.player.getAbilities().flying && !f_11537.player.isFallFlying()) {
         MobEffectInstance var2 = f_11537.player.getEffect(MobEffects.SPEED);
         MobEffectInstance var3 = f_11537.player.getEffect(MobEffects.SLOWNESS);
         String var4 = f_11537.player.getOffhandItem().getHoverName().getString();
         boolean var5 = this.m_4611(var4);
         float var1;
         if (this.f_12668.m_7568(f_12738)) {
            var1 = this.f_12669.m_8768();
         } else if (var2 != null && var2.getAmplifier() == 2) {
            var1 = var5 ? f_12739 : f_12740;
         } else if (var2 != null && var2.getAmplifier() == 1) {
            var1 = var5 ? f_12741 : f_12742;
         } else {
            var1 = var5 ? f_12743 : f_12744;
         }

         if (var3 != null) {
            var1 *= f_12745;
         }

         if (!f_11537.player.onGround()) {
            var1 *= f_12746;
         }

         if (this.f_12670.m_8768() && System.currentTimeMillis() - this.f_12676 <= this.f_12672.m_8768().longValue()) {
            var1 += this.f_12671.m_8768() / f_12747;
         }

         if (this.m_4606()) {
            var1 /= f_12748;
         }

         Class_QBKwWNWLlChWViO9.m_4264(var1);
      }
   }

   private double[] m_4609(double var1) {
      float var3 = f_11537.player.zza;
      float var4 = f_11537.player.xxa;
      float var5 = f_11537.player.getYRot();
      if (var3 != 0.0F) {
         if (var4 > 0.0F) {
            var5 += var3 > 0.0F ? f_12772 : f_12773;
         } else if (var4 < 0.0F) {
            var5 += var3 > 0.0F ? f_12774 : f_12775;
         }

         var4 = 0.0F;
         if (var3 > 0.0F) {
            var3 = 1.0F;
         } else if (var3 < 0.0F) {
            var3 = f_12776;
         }
      }

      double var6 = Math.sin(Math.toRadians(var5 + f_12777));
      double var8 = Math.cos(Math.toRadians(var5 + f_12778));
      double var10 = var3 * var1 * var8 + var4 * var1 * var6;
      double var12 = var3 * var1 * var6 - var4 * var1 * var8;
      return new double[]{var10, var12};
   }

   public void m_4610(Class_J4cQIb7yfObhq6oF var1) {
      if (this.m_4578() && this.f_12663.m_7568(f_12785)) {
         this.m_4599();
      } else if (this.f_12663.m_7568(f_12786)) {
         this.m_4592();
      } else {
         if (this.f_12663.m_7568(f_12787)) {
            m_4585(this.f_12665.m_8768());
            if (this.f_12674 > 3) {
               double var2 = f_12788;
               if (this.f_12674 % 2 == 0) {
                  f_11537.player.setDeltaMovement(f_11537.player.getDeltaMovement().add(0.0, f_12789, 0.0));
                  var2 = f_11537.player.onGround() ? f_12790 : f_12791;
               }

               double var4 = Math.toRadians(Class_QBKwWNWLlChWViO9.m_4258(false));
               double var6 = Class_QBKwWNWLlChWViO9.m_4257()[0];
               double var8 = Class_QBKwWNWLlChWViO9.m_4257()[1];
               f_11537.player.setDeltaMovement(f_11537.player.getDeltaMovement().add(var6 * var2, 0.0, var8 * var2));
            }

            this.f_12674++;
         }
      }
   }

   private boolean m_4611(String var1) {
      return var1.contains(f_12749) || var1.contains(f_12750) || var1.contains(f_12751) || var1.contains(f_12752) || var1.contains(f_12753);
   }
}
