package dev.dimasik.client.module.combat;

import com.mojang.blaze3d.platform.InputConstants;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.manager.ModuleManager;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.IntegerSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_8x4deAyjocMIBSj7;
import dev.dimasik.client.system.Class_B6JOzHnwhU3pe4AO;
import dev.dimasik.client.system.Class_B6vpBUNmRtH3JzmV;
import dev.dimasik.client.system.Class_FghX3TD0v55wW2U2;
import dev.dimasik.client.system.Class_FyutImIC8oFoGKuH;
import dev.dimasik.client.system.Class_Hu2eXItMRRg3g9gb;
import dev.dimasik.client.system.Class_I4ZLf1tdGfKiuaY4;
import dev.dimasik.client.system.Class_NzJrN63M7QBpmAbi;
import dev.dimasik.client.system.Class_U3Ilecg2NrGaJJQx;
import dev.dimasik.client.system.Class_V8TcGGMsId7v9MLv;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_a7M44oHQPwN0rL5A;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_h78PE30BIJJYoUEk;
import dev.dimasik.client.system.Class_jNlR3TgqfR7C3lDK;
import dev.dimasik.client.system.Class_jfpiTZhNIuwDwqKr;
import dev.dimasik.client.system.Class_mRcJJZJYG5cvDAlU;
import dev.dimasik.client.system.Class_nCtAXu2tIwCiU5cL;
import dev.dimasik.client.system.Class_qT3a68ZR9cAz3wbe;
import dev.dimasik.client.system.Class_sS4M8u1p9l0dNe0C;
import dev.dimasik.client.system.Class_wjdoxQGtI8mFyL6U;
import dev.dimasik.mixin.FireworkRocketEntityMixin_2;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import net.minecraft.network.protocol.game.ServerboundClientTickEndPacket;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerCommandPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerCommandPacket.Action;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.FireworkRocketEntity;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.entity.projectile.arrow.Arrow;
import net.minecraft.world.entity.projectile.hurtingprojectile.windcharge.AbstractWindCharge;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;

public class PvPHelper extends Module {
   private static final double f_10790 = 3.0;
   private static final int f_10791 = 80;
   private static final float f_10792 = 96.0F;
   private final Class_8x4deAyjocMIBSj7 f_10793 = new Class_8x4deAyjocMIBSj7();
   private final Set<Item> f_10794 = Set.of(
      Items.WOODEN_SWORD,
      Items.STONE_SWORD,
      Items.IRON_SWORD,
      Items.GOLDEN_SWORD,
      Items.DIAMOND_SWORD,
      Items.NETHERITE_SWORD,
      Items.WOODEN_AXE,
      Items.STONE_AXE,
      Items.IRON_AXE,
      Items.GOLDEN_AXE,
      Items.DIAMOND_AXE,
      Items.NETHERITE_AXE
   );
   private final Set<Item> f_10795 = Set.of(Items.WOODEN_AXE, Items.STONE_AXE, Items.IRON_AXE, Items.GOLDEN_AXE, Items.DIAMOND_AXE, Items.NETHERITE_AXE);
   private final Set<Item> f_10796 = Set.of(
      Items.WOODEN_SPEAR, Items.STONE_SPEAR, Items.COPPER_SPEAR, Items.IRON_SPEAR, Items.GOLDEN_SPEAR, Items.DIAMOND_SPEAR, Items.NETHERITE_SPEAR
   );
   private final CheckboxSetting f_10797;
   private final SliderSetting f_10798;
   private final CheckboxSetting f_10799;
   private final CheckboxSetting f_10800;
   private final CheckboxSetting f_10801;
   private final SliderSetting f_10802;
   private final IntegerSetting f_10803;
   private final CheckboxSetting f_10804;
   private final CheckboxSetting f_10805;
   private final IntegerSetting f_10806;
   private final IntegerSetting f_10807;
   private final SliderSetting f_10808;
   private final CheckboxSetting f_10809;
   private final CheckboxSetting f_10810;
   private final CheckboxSetting f_10811;
   private final CheckboxSetting f_10812;
   private final PvPHelper.PAPCFQnrNshOIkyt f_10813;
   private final PvPHelper.XPGXsXzin6L2DQlc f_10814;
   private final PvPHelper.oW2k3IUUXHjsdBC9 f_10815;
   private final PvPHelper.mNp0ZRBd9BgeEccY f_10816;
   private final PvPHelper.nUKRoLTrddhk3yUq f_10817;
   private final PvPHelper.lyzoT7kZH6ljyCCC f_10818;
   private final PvPHelper.OHK67uHY4ebMf6mN f_10819;
   private final Class_gEPk7yDw6CwIte87<Class_wjdoxQGtI8mFyL6U> f_10820;
   private final Class_gEPk7yDw6CwIte87<Class_a7M44oHQPwN0rL5A> f_10821;
   private final Class_gEPk7yDw6CwIte87<Class_B6JOzHnwhU3pe4AO> f_10822;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_10823;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK.Class_07sbU45IoaK910B1> f_10824;
   private final Class_gEPk7yDw6CwIte87<Class_mRcJJZJYG5cvDAlU> f_10825;
   private final Class_gEPk7yDw6CwIte87<Class_jfpiTZhNIuwDwqKr.Class_13dQBetjQQOBNsco> f_10826;
   private final Class_gEPk7yDw6CwIte87<Class_nCtAXu2tIwCiU5cL> f_10827;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_10828;
   private static final String f_10829 = "PvPHelper";
   private static final String f_10830 = "AutoMace, AntiMace, SpearBoost, InstaCart, WindPearl и ComboAssist";
   private static final String f_10831 = "AutoMace";
   private static final String f_10832 = "Задержка";
   private static final float f_10833 = 20.0F;
   private static final float f_10834 = 0.5F;
   private static final String f_10835 = "Только с Aura";
   private static final String f_10836 = "Force";
   private static final String f_10837 = "Use Chest";
   private static final String f_10838 = "Предсвап нагрудника";
   private static final float f_10839 = 7.0F;
   private static final float f_10840 = 5.0F;
   private static final float f_10841 = 10.0F;
   private static final String f_10842 = "SpearBoost";
   private static final String f_10843 = "SpearElytra";
   private static final String f_10844 = "InstaCart";
   private static final String f_10845 = "WindPearl";
   private static final String f_10846 = "AntiMace";
   private static final String f_10847 = "AntiMace дальность";
   private static final float f_10848 = 48.0F;
   private static final float f_10849 = 4.0F;
   private static final float f_10850 = 64.0F;
   private static final String f_10851 = "ComboAssist";
   private static final String f_10852 = "RayTracing";
   private static final String f_10853 = "SelfProtect";
   private static final String f_10854 = "FarStop";
   private static final String f_10855 = "Легитный";
   private static final String f_10856 = "Legit";

   private void m_3768(int var1) {
      if (this.m_3803() && var1 >= 0 && var1 <= 8) {
         f_11537.player.getInventory().selected = var1;
         f_11537.gameMode.ensureHasSentCarriedItem();
      }
   }

   private LivingEntity m_3769() {
      if (!this.f_10799.m_8768()) {
         LivingEntity var1 = this.m_3790();
         if (var1 != null) {
            return var1;
         }
      }

      Aura var4 = this.m_3795();
      if (var4 == null) {
         return null;
      } else {
         return var4.m_1114() instanceof LivingEntity var2 ? var2 : null;
      }
   }

   private int m_3773() {
      return this.m_3797(this.f_10796);
   }

   private boolean m_3774(Class_B6JOzHnwhU3pe4AO var1, IntegerSetting var2) {
      return var2.m_8768() != -1 && var1.m_2117() == var2.m_8768();
   }

   private boolean m_3775(int var1) {
      if (var1 < 0 || !this.m_3803()) {
         return false;
      }

      if (this.m_3794()) {
         return this.m_3800(var1) == Class_8x4deAyjocMIBSj7.Class_8xzBZ83gOSc56UI6.SUCCESS;
      }

      this.m_3804(var1);
      return true;
   }

   @Override
   public void m_732() {
      this.f_10813.m_3679(true);
      this.f_10814.m_3692(true);
      this.f_10815.m_3763(true);
      this.f_10816.m_3731();
      this.f_10817.m_3740();
      this.f_10818.m_3717();
      this.f_10819.m_3663();
      this.m_3798(false);
      super.m_732();
   }

   private void m_3777() {
      this.f_10816.m_3735();
      this.f_10819.m_3677();
      this.f_10814.m_3705();
      this.f_10815.m_3764();
      this.f_10817.m_3741();
      this.f_10813.m_3681();
      this.f_10818.m_3713();
   }

   private int m_3779() {
      return this.m_3792(Items.MACE);
   }

   private int m_3781() {
      return f_11537.player.getInventory().selected;
   }

   private void m_3782(Class_wjdoxQGtI8mFyL6U var1) {
      if (!this.f_10813.m_3691() && !this.f_10814.m_3707()) {
         if (var1.m_9372() == Class_wjdoxQGtI8mFyL6U.Class_327mRdjAqNoPaemJ.POST) {
            this.f_10813.m_3684();
         } else {
            if (var1.m_9372() == Class_wjdoxQGtI8mFyL6U.Class_327mRdjAqNoPaemJ.PRE && this.f_10797.m_8768() && var1.m_9370() instanceof LivingEntity var2) {
               this.f_10813.m_3688(var2);
            }
         }
      }
   }

   private void m_3783(Class_B6JOzHnwhU3pe4AO var1) {
      if (f_11537.gui.screen() == null && var1.m_2116() == 1) {
         if (this.m_3774(var1, this.f_10803)) {
            this.f_10814.m_3697();
         } else if (this.m_3774(var1, this.f_10806)) {
            this.f_10815.m_3766();
         } else {
            if (this.m_3774(var1, this.f_10807)) {
               this.f_10816.m_3726();
            }
         }
      }
   }

   public PvPHelper() {
      super(f_10829, f_10830, Category.COMBAT);
      this.f_10797 = new CheckboxSetting(f_10831, true);
      this.f_10798 = new SliderSetting(f_10832, 0.0F, 0.0F, f_10833).m_828(f_10834).m_822(this.f_10797::m_8768);
      this.f_10799 = new CheckboxSetting(f_10835, true).m_822(this.f_10797::m_8768);
      this.f_10800 = new CheckboxSetting(f_10836, false).m_822(this.f_10797::m_8768);
      this.f_10801 = new CheckboxSetting(f_10837, false).m_822(this.f_10797::m_8768);
      this.f_10802 = new SliderSetting(f_10838, f_10839, f_10840, f_10841).m_828(1.0F).m_822(() -> this.f_10797.m_8768() && this.f_10801.m_8768());
      this.f_10803 = new IntegerSetting(f_10842);
      this.f_10804 = new CheckboxSetting(f_10843, false).m_822(() -> this.f_10803.m_8768() != -1);
      this.f_10805 = new CheckboxSetting(f_10844, false);
      this.f_10806 = new IntegerSetting(f_10845);
      this.f_10807 = new IntegerSetting(f_10846);
      this.f_10808 = new SliderSetting(f_10847, f_10848, f_10849, f_10850).m_828(1.0F).m_822(() -> this.f_10807.m_8768() != -1);
      this.f_10809 = new CheckboxSetting(f_10851, false);
      this.f_10810 = new CheckboxSetting(f_10852, true).m_822(this.f_10809::m_8768);
      this.f_10811 = new CheckboxSetting(f_10853, false).m_822(this.f_10809::m_8768);
      this.f_10812 = new CheckboxSetting(f_10854, false).m_822(this.f_10809::m_8768);
      this.f_10813 = new PvPHelper.PAPCFQnrNshOIkyt();
      this.f_10814 = new PvPHelper.XPGXsXzin6L2DQlc();
      this.f_10815 = new PvPHelper.oW2k3IUUXHjsdBC9();
      this.f_10816 = new PvPHelper.mNp0ZRBd9BgeEccY();
      this.f_10817 = new PvPHelper.nUKRoLTrddhk3yUq();
      this.f_10818 = new PvPHelper.lyzoT7kZH6ljyCCC();
      this.f_10819 = new PvPHelper.OHK67uHY4ebMf6mN();
      this.f_10820 = this::m_3782;
      this.f_10821 = this::m_3799;
      this.f_10822 = this::m_3783;
      this.f_10823 = var1 -> this.m_3777();
      this.f_10824 = var1 -> this.f_10819.m_3655();
      this.f_10825 = var1 -> this.f_10819.m_3665(var1);
      this.f_10826 = var1 -> this.f_10816.m_3730(var1);
      this.f_10827 = var1 -> this.f_10816.m_3727(var1);
      this.f_10828 = var1 -> {
         if (!var1.m_1581() && var1.m_5619() instanceof ClientboundPlayerPositionPacket) {
            this.f_10816.f_10701 = true;
         }
      };
      this.m_795(
         this.f_10797,
         this.f_10798,
         this.f_10799,
         this.f_10800,
         this.f_10801,
         this.f_10802,
         this.f_10803,
         this.f_10804,
         this.f_10805,
         this.f_10806,
         this.f_10807,
         this.f_10808,
         this.f_10809,
         this.f_10810,
         this.f_10811,
         this.f_10812
      );
   }

   private void m_3785() {
      if (this.m_3803()) {
         f_11537.gameMode.useItem(f_11537.player, InteractionHand.MAIN_HAND);
         f_11537.player.swing(InteractionHand.MAIN_HAND);
      }
   }

   private boolean m_3786() {
      return this.f_10814.m_3695() || this.f_10815.m_3767() || this.f_10816.m_3725() || this.f_10817.m_3736();
   }

   private boolean m_3789() {
      if (!this.f_10799.m_8768()) {
         return true;
      }

      Aura var1 = this.m_3795();
      return var1 != null && var1.m_1114() != null;
   }

   private LivingEntity m_3790() {
      return f_11537.hitResult instanceof EntityHitResult var1 && var1.getEntity() instanceof LivingEntity var2 ? var2 : null;
   }

   private int m_3792(Item var1) {
      if (f_11537.player == null) {
         return -1;
      }

      for (int var2 = 0; var2 < 9; var2++) {
         if (f_11537.player.getInventory().getItem(var2).is(var1)) {
            return var2;
         }
      }

      return -1;
   }

   private void m_3793() {
      if (this.m_3803() && !f_11537.player.onGround() && f_11537.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA)) {
         f_11537.player.startFallFlying();
         ClientPacketListener var1 = f_11537.getConnection();
         if (var1 != null) {
            var1.send(new ServerboundPlayerCommandPacket(f_11537.player, Action.START_FALL_FLYING));
         }
      }
   }

   private boolean m_3794() {
      MultiChoiceSetting var1 = DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5152();
      return var1.m_7568(f_10855) || var1.m_7568(f_10856);
   }

   private Aura m_3795() {
      return DimasikClient.m_9057().m_9049().m_2801().m_3576();
   }

   private boolean m_3796() {
      return this.f_10813.m_3690() || this.f_10814.m_3695() || this.f_10815.m_3767() || this.f_10816.m_3725() || this.f_10817.m_3746();
   }

   private int m_3797(Set<Item> var1) {
      if (f_11537.player == null) {
         return -1;
      }

      for (int var2 = 0; var2 < 9; var2++) {
         if (var1.contains(f_11537.player.getInventory().getItem(var2).getItem())) {
            return var2;
         }
      }

      return -1;
   }

   private void m_3798(boolean var1) {
      Aura var2 = this.m_3795();
      if (var2 != null) {
         var2.m_1043(var1);
      }
   }

   private void m_3799(Class_a7M44oHQPwN0rL5A var1) {
      this.f_10817.m_3750(var1);
   }

   private Class_8x4deAyjocMIBSj7.Class_8xzBZ83gOSc56UI6 m_3800(int var1) {
      return Class_B6vpBUNmRtH3JzmV.m_2126(var1)
         ? this.f_10793.m_1901(() -> Class_B6vpBUNmRtH3JzmV.m_2129(Class_B6vpBUNmRtH3JzmV.m_2127(var1), 6), true)
         : this.f_10793.m_1901(() -> this.m_3806(var1), true);
   }

   private boolean m_3801(LivingEntity var1) {
      return var1 != null && var1.isAlive() && !var1.isRemoved();
   }

   private boolean m_3803() {
      return f_11537.player != null && f_11537.level != null && f_11537.gameMode != null;
   }

   private void m_3804(int var1) {
      if (Class_B6vpBUNmRtH3JzmV.m_2126(var1)) {
         Class_B6vpBUNmRtH3JzmV.m_2129(Class_B6vpBUNmRtH3JzmV.m_2127(var1), 6);
      } else {
         this.m_3806(var1);
      }
   }

   private int m_3805() {
      return this.m_3797(this.f_10795);
   }

   private void m_3806(int var1) {
      Class_B6vpBUNmRtH3JzmV.m_2129(8, var1);
      Class_B6vpBUNmRtH3JzmV.m_2129(8, 6);
      Class_B6vpBUNmRtH3JzmV.m_2129(8, var1);
   }

   private final class OHK67uHY4ebMf6mN {
      public static final double f_10619 = 6.0;
      public static final long f_10620 = 200L;
      public static final long f_10621 = 500L;
      public static final long f_10622 = 400L;
      public static final double f_10623 = 1.0;
      public static final float f_10624 = 10.0F;
      public static final double f_10625 = 0.05;
      public static final double f_10626 = 0.12;
      public static final double f_10627 = 2.5;
      public static final double f_10628 = 0.4;
      public static final double f_10629 = 0.08;
      public UUID f_10630;
      public UUID f_10631;
      public long f_10632;
      public long f_10633;
      public long f_10634;
      public int f_10635;
      public float f_10636;
      public boolean f_10637;
      public boolean f_10638;
      public long f_10639;
      public Vec3 f_10640;
      public Vec3 f_10641;
      public static final long f_10643 = 50L;
      public static final long f_10644 = 500L;
      public static final long f_10645 = 200L;
      public static final float f_10646 = (float) (Math.PI / 180.0);
      public static final long f_10647 = 400L;
      public static final float f_10648 = 10.0F;
      public static final double f_10649 = 0.05;
      public static final double f_10650 = 0.4;
      public static final double f_10651 = 2.5;
      public static final double f_10652 = 2.5;
      public static final double f_10653 = 2.5;
      public static final double f_10654 = 2.5;
      public static final double f_10655 = 2.5;
      public static final double f_10656 = 0.05;
      public static final double f_10657 = 0.12;
      public static final double f_10658 = 0.12;
      public static final double f_10659 = 0.08;
      public static final double f_10660 = 0.5;
      public static final double f_10661 = 6.0;
      public static final double f_10662 = 1.0E-4;
      public static final double f_10663 = 1.0E-6;
      public static final float f_10664 = -1.0F;
      public static final int f_10665 = Integer.MIN_VALUE;

      public double m_3642(Vec3 var1, AABB var2) {
         double var3 = Mth.clamp(var1.x, var2.minX, var2.maxX);
         double var5 = Mth.clamp(var1.y, var2.minY, var2.maxY);
         double var7 = Mth.clamp(var1.z, var2.minZ, var2.maxZ);
         return var1.distanceTo(new Vec3(var3, var5, var7));
      }

      public Player m_3643() {
         if (Class_NzJrN63M7QBpmAbi.f_11537.hitResult instanceof EntityHitResult var1) {
            return var1.getEntity() instanceof Player var4 ? var4 : null;
         } else {
            return null;
         }
      }

      public OHK67uHY4ebMf6mN() {
      }

      public void m_3644(Class_mRcJJZJYG5cvDAlU var1) {
         var1.m_7590(0.0F);
         var1.m_7596(0.0F);
         var1.m_7587(false);
         var1.m_7597(false);
         var1.m_7599(false);
         var1.m_7594(false);
         var1.m_7604(false);
         var1.m_7592(false);
         var1.m_7593(false);
      }

      public void m_3645() {
         this.f_10631 = null;
         this.f_10635 = f_10665;
         this.f_10636 = 0.0F;
      }

      public boolean m_3646(LocalPlayer var1, long var2) {
         if (this.f_10639 <= var2 || var1 == null || this.f_10640 == null || this.f_10641 == null) {
            this.m_3649();
            return false;
         }

         if (!var1.horizontalCollision && !var1.isInWater() && !var1.onClimbable() && !var1.isSwimming() && !var1.isPassenger()) {
            Vec3 var4 = var1.position().subtract(this.f_10640);
            double var5 = var4.x * this.f_10641.x + var4.z * this.f_10641.z;
            if (var5 >= 1.0) {
               this.m_3649();
               return false;
            } else {
               return true;
            }
         } else {
            this.m_3649();
            return false;
         }
      }

      public boolean m_3647(Player var1, Player var2, double var3) {
         return this.m_3642(var1.getEyePosition(), var2.getBoundingBox()) <= var3 + f_10662;
      }

      public boolean m_3648(LocalPlayer var1, Player var2) {
         if (var2 != null && var2 != var1 && var2.isAlive() && !var2.isRemoved()) {
            AntiBot var3 = DimasikClient.m_9057().m_9049().m_2801().m_3581();
            return var3.m_776() && var3.f_33163.contains(var2)
               ? false
               : !DimasikClient.m_9057().m_9049().m_2801().m_3445().m_776() || !DimasikClient.m_9057().m_9049().m_2804().m_2877(var2.getGameProfile().name());
         } else {
            return false;
         }
      }

      public void m_3649() {
         this.f_10639 = 0L;
         this.f_10640 = null;
         this.f_10641 = null;
      }

      public void m_3650(LocalPlayer var1, Player var2) {
         if (this.f_10631 == null || !this.f_10631.equals(var2.getUUID())) {
            this.f_10631 = var2.getUUID();
            this.f_10635 = var1.tickCount + 1;
            this.f_10636 = var1.getYRot();
         }

         this.m_3658(var1);
      }

      public void m_3651(LocalPlayer var1, Player var2, long var3, boolean var5) {
         this.m_3645();
         if (var5) {
            this.m_3658(var1);
         } else {
            this.m_3654();
         }

         Class_NzJrN63M7QBpmAbi.f_11537.startAttack();
         this.f_10630 = var2.getUUID();
         this.f_10632 = var3 + f_10644;
         if (PvPHelper.this.f_10811.m_8768()) {
            this.m_3652(var1, var3);
            this.f_10634 = 0L;
            this.f_10633 = 0L;
         } else {
            this.f_10634 = var3 + f_10645;
            this.f_10633 = this.f_10634;
         }

         this.f_10637 = var5;
      }

      public void m_3652(LocalPlayer var1, long var2) {
         float var4 = var1.getYRot() * f_10646;
         this.f_10641 = new Vec3(Mth.sin(var4), 0.0, -Mth.cos(var4)).normalize();
         this.f_10640 = var1.position();
         this.f_10639 = var2 + f_10647;
      }

      public double m_3653(Vec3 var1, Vec3 var2, Vec3 var3) {
         Vec3 var4 = new Vec3(var3.x, 0.0, var3.z);
         double var5 = var4.lengthSqr();
         if (var5 < f_10663) {
            return 0.0;
         }

         Vec3 var7 = var4.normalize();
         Vec3 var8 = var2.subtract(var1);
         return Math.max(0.0, var8.dot(var7));
      }

      public void m_3654() {
         if (this.f_10638) {
            if (Class_NzJrN63M7QBpmAbi.f_11537.options != null) {
               Class_NzJrN63M7QBpmAbi.f_11537.options.keySprint.setDown(this.m_3660(Class_NzJrN63M7QBpmAbi.f_11537.options.keySprint));
            }

            this.f_10638 = false;
         }
      }

      public void m_3655() {
         if (PvPHelper.this.f_10809.m_8768()) {
            if (this.f_10637) {
               this.m_3654();
               this.f_10637 = false;
            }
         }
      }

      public Vec3 m_3656(Vec3 var1) {
         return new Vec3(var1.x, 0.0, var1.z);
      }

      public Player m_3657(LocalPlayer var1) {
         Player var2 = this.m_3643();
         return this.m_3648(var1, var2) && this.m_3647(var1, var2, f_10661) ? var2 : null;
      }

      public void m_3658(LocalPlayer var1) {
         if (this.m_3674(var1)) {
            Class_NzJrN63M7QBpmAbi.f_11537.options.keySprint.setDown(true);
            this.f_10638 = true;
         }
      }

      public void m_3659() {
         this.m_3645();
         this.m_3654();
      }

      public boolean m_3660(KeyMapping var1) {
         return InputConstants.isKeyDown(Class_NzJrN63M7QBpmAbi.f_11537.getWindow(), var1.key.getValue());
      }

      public void m_3661(Class_mRcJJZJYG5cvDAlU var1) {
         var1.m_7590(f_10664);
         var1.m_7596(0.0F);
         var1.m_7587(false);
         var1.m_7597(true);
         var1.m_7599(false);
         var1.m_7594(false);
         var1.m_7604(false);
         var1.m_7592(false);
         var1.m_7593(false);
      }

      public Player m_3662(double var1) {
         if (Class_NzJrN63M7QBpmAbi.f_11537.level != null && !(var1 <= 0.0)) {
            Vec3 var3 = Class_NzJrN63M7QBpmAbi.f_11537.player.getEyePosition(1.0F);
            Vec3 var4 = Class_NzJrN63M7QBpmAbi.f_11537.player.getViewVector(1.0F);
            Vec3 var5 = var3.add(var4.scale(var1));
            BlockHitResult var6 = Class_NzJrN63M7QBpmAbi.f_11537
               .level
               .clip(new ClipContext(var3, var5, Block.COLLIDER, Fluid.NONE, Class_NzJrN63M7QBpmAbi.f_11537.player));
            AABB var7 = Class_NzJrN63M7QBpmAbi.f_11537.player.getBoundingBox().expandTowards(var4.scale(var1)).inflate(1.0, 1.0, 1.0);
            EntityHitResult var8 = ProjectileUtil.getEntityHitResult(
               Class_NzJrN63M7QBpmAbi.f_11537.player,
               var3,
               var5,
               var7,
               var1x -> var1x instanceof Player var2 && this.m_3648(Class_NzJrN63M7QBpmAbi.f_11537.player, var2),
               var1 * var1
            );
            if (var8 == null) {
               return null;
            }

            if (var6.getType() != Type.MISS) {
               double var9 = var3.distanceToSqr(var8.getLocation());
               double var11 = var3.distanceToSqr(var6.getLocation());
               if (var11 < var9) {
                  return null;
               }
            }

            return var8.getEntity() instanceof Player var13 ? var13 : null;
         } else {
            return null;
         }
      }

      public void m_3663() {
         this.m_3654();
         this.f_10630 = null;
         this.m_3645();
         this.f_10632 = 0L;
         this.f_10633 = 0L;
         this.f_10637 = false;
         this.f_10634 = 0L;
         this.m_3649();
      }

      public boolean m_3664(long var1) {
         if (this.f_10632 <= var1) {
            this.f_10632 = 0L;
            this.f_10630 = null;
            if (this.f_10634 <= var1) {
               this.f_10634 = 0L;
            }
         }

         return this.f_10632 > var1 || this.f_10634 > var1;
      }

      public void m_3665(Class_mRcJJZJYG5cvDAlU var1) {
         if (PvPHelper.this.f_10809.m_8768() && Class_NzJrN63M7QBpmAbi.f_11537.player != null) {
            long var2 = System.currentTimeMillis();
            if (this.m_3646(Class_NzJrN63M7QBpmAbi.f_11537.player, var2)) {
               this.m_3661(var1);
            } else if (this.m_3669(Class_NzJrN63M7QBpmAbi.f_11537.player, var2)) {
               this.m_3668(var1);
            } else {
               if (this.m_3673(var2) || this.m_3672(Class_NzJrN63M7QBpmAbi.f_11537.player, var2)) {
                  this.m_3644(var1);
               }
            }
         }
      }

      public double m_3666(Player var1) {
         return var1.entityInteractionRange();
      }

      public boolean m_3667(LocalPlayer var1, Player var2) {
         double var3 = this.m_3666(var1);
         double var5 = this.m_3666(var2);
         Vec3 var7 = this.m_3656(var1.getDeltaMovement());
         Vec3 var8 = this.m_3656(var2.getDeltaMovement());
         Vec3 var9 = var1.position().subtract(var2.position());
         double var10 = this.m_3653(var7, var8, var9);
         double var12 = f_10649 + Math.min(f_10650, var10 * f_10651);
         double var14 = this.m_3642(var1.getEyePosition(), var2.getBoundingBox());
         double var16 = this.m_3642(var2.getEyePosition(), var1.getBoundingBox());
         Vec3 var18 = var1.getEyePosition().add(var7.scale(f_10652));
         AABB var19 = var1.getBoundingBox().move(var7.scale(f_10653));
         Vec3 var20 = var2.getEyePosition().add(var8.scale(f_10654));
         AABB var21 = var2.getBoundingBox().move(var8.scale(f_10655));
         double var22 = this.m_3642(var18, var21);
         double var24 = this.m_3642(var20, var19);
         if (var14 > var3) {
            return false;
         } else if (var24 <= var5 + var12) {
            return true;
         } else if (var16 <= var5 + f_10656) {
            return true;
         } else {
            return var22 >= var3 - f_10657 ? true : var14 >= var3 - Math.max(f_10658, f_10659 + var12 * f_10660);
         }
      }

      public void m_3668(Class_mRcJJZJYG5cvDAlU var1) {
         var1.m_7590(1.0F);
         var1.m_7596(0.0F);
         var1.m_7587(true);
         var1.m_7597(false);
         var1.m_7599(false);
         var1.m_7594(false);
         var1.m_7604(false);
         var1.m_7592(false);
         var1.m_7593(Class_NzJrN63M7QBpmAbi.f_11537.options.keySprint.isDown());
      }

      public boolean m_3669(LocalPlayer var1, long var2) {
         if (this.f_10632 <= var2 && this.f_10634 <= var2 && this.f_10631 != null) {
            return Math.abs(Mth.wrapDegrees(var1.getYRot() - this.f_10636)) > f_10648 ? false : this.m_3674(var1);
         } else {
            return false;
         }
      }

      public boolean m_3670(LocalPlayer var1, Player var2) {
         return this.f_10631 != null && this.f_10631.equals(var2.getUUID()) ? var1.tickCount >= this.f_10635 : false;
      }

      public boolean m_3672(LocalPlayer var1, long var2) {
         if (PvPHelper.this.f_10812.m_8768() && this.f_10632 <= var2 && this.f_10634 <= var2) {
            Player var4 = this.m_3657(var1);
            return this.m_3648(var1, var4) && this.m_3667(var1, var4);
         } else {
            return false;
         }
      }

      public boolean m_3673(long var1) {
         if (this.f_10633 <= var1) {
            this.f_10633 = 0L;
            return false;
         } else {
            return true;
         }
      }

      public boolean m_3674(LocalPlayer var1) {
         if (this.m_3673(System.currentTimeMillis())) {
            return false;
         } else if (this.m_3646(var1, System.currentTimeMillis())) {
            return false;
         } else {
            Player var2 = this.m_3657(var1);
            if (PvPHelper.this.f_10812.m_8768() && this.m_3648(var1, var2) && this.m_3667(var1, var2)) {
               return false;
            } else if (!this.m_3660(Class_NzJrN63M7QBpmAbi.f_11537.options.keyUp) || this.m_3660(Class_NzJrN63M7QBpmAbi.f_11537.options.keyDown)) {
               return false;
            } else if (var1.isShiftKeyDown() || var1.isUsingItem()) {
               return false;
            } else if (var1.isInWater() || var1.onClimbable() || var1.isSwimming()) {
               return false;
            } else {
               return !var1.isFallFlying() && !var1.isPassenger() && !var1.horizontalCollision
                  ? var1.isCreative() || var1.getFoodData().getFoodLevel() > 6
                  : false;
            }
         }
      }

      public boolean m_3675(LocalPlayer var1) {
         return var1.getAttackStrengthScale(1.0F) >= 1.0F;
      }

      public Player m_3676(LocalPlayer var1) {
         Player var2 = this.m_3643();
         if (!this.m_3648(var1, var2)) {
            return null;
         }

         double var3 = this.m_3666(var1);
         if (!this.m_3647(var1, var2, var3)) {
            return null;
         }

         if (!PvPHelper.this.f_10810.m_8768()) {
            return var2;
         }

         Player var5 = this.m_3662(var3);
         return var5 != null && var5.getUUID().equals(var2.getUUID()) ? var2 : null;
      }

      public void m_3677() {
         if (!PvPHelper.this.f_10809.m_8768()) {
            this.m_3663();
         } else if (!PvPHelper.this.m_3803()) {
            this.m_3663();
         } else if (Class_NzJrN63M7QBpmAbi.f_11537.gui.screen() != null
            || Class_NzJrN63M7QBpmAbi.f_11537.player.isSpectator()
            || !Class_NzJrN63M7QBpmAbi.f_11537.player.isAlive()) {
            this.m_3663();
         } else if (!this.m_3678() && !PvPHelper.this.m_3796()) {
            long var1 = System.currentTimeMillis();
            boolean var3 = this.m_3646(Class_NzJrN63M7QBpmAbi.f_11537.player, var1);
            if (this.m_3664(var1)) {
               if (!var3 && this.f_10634 > var1) {
                  this.f_10633 = Math.max(this.f_10634, var1 + f_10643);
               }
            } else if (!this.m_3673(var1)) {
               if (!Class_NzJrN63M7QBpmAbi.f_11537.player.isUsingItem()
                  && !this.m_3660(Class_NzJrN63M7QBpmAbi.f_11537.options.keyDown)
                  && !Class_NzJrN63M7QBpmAbi.f_11537.player.isShiftKeyDown()) {
                  Player var4 = this.m_3676(Class_NzJrN63M7QBpmAbi.f_11537.player);
                  if (!this.m_3648(Class_NzJrN63M7QBpmAbi.f_11537.player, var4)) {
                     this.m_3659();
                  } else if (!this.m_3675(Class_NzJrN63M7QBpmAbi.f_11537.player)) {
                     this.m_3659();
                  } else {
                     if (!this.m_3674(Class_NzJrN63M7QBpmAbi.f_11537.player)) {
                        this.m_3659();
                        this.m_3651(Class_NzJrN63M7QBpmAbi.f_11537.player, var4, var1, false);
                     } else if (this.m_3670(Class_NzJrN63M7QBpmAbi.f_11537.player, var4)) {
                        this.m_3651(Class_NzJrN63M7QBpmAbi.f_11537.player, var4, var1, true);
                     } else {
                        this.m_3650(Class_NzJrN63M7QBpmAbi.f_11537.player, var4);
                     }
                  }
               } else {
                  this.m_3659();
               }
            }
         } else {
            this.m_3659();
         }
      }

      public boolean m_3678() {
         ModuleManager var1 = DimasikClient.m_9057().m_9049().m_2801();
         return var1.m_3576().m_776() || var1.m_3536().m_776();
      }
   }

   private enum OkhYiiEFIBI1DH7e {
      IDLE,
      WAITING_WIND;
   }

   private final class PAPCFQnrNshOIkyt {
      public PvPHelper.SQg4a8LCFReMvtI7 f_10666 = PvPHelper.SQg4a8LCFReMvtI7.IDLE;
      public LivingEntity f_10667;
      public int f_10668 = -1;
      public int f_10669;
      public long f_10670;
      public boolean f_10671;
      public static final float f_10673 = 1000.0F;

      public void m_3679(boolean var1) {
         if (var1 && this.m_3690() && PvPHelper.this.m_3803() && this.f_10668 != -1) {
            PvPHelper.this.m_3768(this.f_10668);
         }

         this.f_10666 = PvPHelper.SQg4a8LCFReMvtI7.IDLE;
         this.f_10667 = null;
         this.f_10668 = -1;
         this.f_10669 = 0;
         this.f_10671 = false;
      }

      public void m_3680(LivingEntity var1) {
         if (PvPHelper.this.m_3803()
            && PvPHelper.this.f_10797.m_8768()
            && this.f_10666 == PvPHelper.SQg4a8LCFReMvtI7.IDLE
            && PvPHelper.this.m_3801(var1)
            && PvPHelper.this.m_3779() != -1) {
            this.f_10668 = PvPHelper.this.m_3781();
            this.f_10667 = var1;
            this.f_10669 = Math.max(20, PvPHelper.this.f_10802.m_8768().intValue() + 12);
            this.f_10666 = this.m_3689(var1) && PvPHelper.this.m_3805() != -1
               ? PvPHelper.SQg4a8LCFReMvtI7.PREPARED_AXE
               : PvPHelper.SQg4a8LCFReMvtI7.PREPARED_MACE;
         }
      }

      public void m_3681() {
         if (this.m_3690()) {
            if (!PvPHelper.this.m_3803()) {
               this.m_3679(false);
            } else if (!this.m_3687()) {
               this.m_3682();
            } else {
               if (--this.f_10669 <= 0 || !PvPHelper.this.m_3801(this.f_10667) || Class_NzJrN63M7QBpmAbi.f_11537.player.onGround()) {
                  this.m_3682();
               }
            }
         }
      }

      public void m_3682() {
         if (this.f_10668 != -1 && PvPHelper.this.m_3803() && PvPHelper.this.m_3781() != this.f_10668) {
            PvPHelper.this.m_3768(this.f_10668);
         }

         this.m_3679(false);
      }

      public PAPCFQnrNshOIkyt() {
      }

      public boolean m_3683(LivingEntity var1, int var2, int var3) {
         try {
            if (PvPHelper.this.m_3781() != var2) {
               PvPHelper.this.m_3768(var2);
            }

            this.f_10671 = true;

            try {
               Class_NzJrN63M7QBpmAbi.f_11537.gameMode.attack(Class_NzJrN63M7QBpmAbi.f_11537.player, var1);
               Class_NzJrN63M7QBpmAbi.f_11537.player.swing(InteractionHand.MAIN_HAND);
            } finally {
               this.f_10671 = false;
            }

            if (PvPHelper.this.m_3803() && PvPHelper.this.m_3801(var1)) {
               if (PvPHelper.this.m_3781() != var3) {
                  PvPHelper.this.m_3768(var3);
               }

               this.f_10666 = PvPHelper.SQg4a8LCFReMvtI7.ATTACK_ARMED;
               return true;
            } else {
               this.m_3682();
               return false;
            }
         } catch (RuntimeException var8) {
            this.f_10671 = false;
            this.m_3682();
            throw var8;
         }
      }

      public void m_3684() {
         if (this.f_10666 == PvPHelper.SQg4a8LCFReMvtI7.ATTACK_ARMED) {
            this.m_3682();
         }
      }

      public void m_3685() {
         if (this.m_3687()) {
            this.m_3682();
         }
      }

      public boolean m_3686(LivingEntity var1) {
         return PvPHelper.this.m_3801(var1) && (var1.getMainHandItem().is(Items.SHIELD) || var1.getOffhandItem().is(Items.SHIELD));
      }

      public boolean m_3687() {
         return this.f_10666 == PvPHelper.SQg4a8LCFReMvtI7.PREPARED_AXE || this.f_10666 == PvPHelper.SQg4a8LCFReMvtI7.PREPARED_MACE;
      }

      public void m_3688(LivingEntity var1) {
         if (PvPHelper.this.m_3803() && !PvPHelper.this.m_3786() && PvPHelper.this.m_3801(var1)) {
            if (PvPHelper.this.f_10799.m_8768()) {
               Aura var2 = PvPHelper.this.m_3795();
               if (var2 == null || var2.m_1114() != var1) {
                  return;
               }
            }

            if (this.m_3687() && this.f_10667 != var1) {
               this.m_3682();
            } else {
               long var8 = System.currentTimeMillis();
               long var4 = (long)(PvPHelper.this.f_10798.m_8768() * f_10673);
               if (this.m_3687() || var8 - this.f_10670 >= var4) {
                  int var6 = PvPHelper.this.m_3779();
                  if (var6 != -1) {
                     if (this.m_3689(var1)) {
                        int var7 = PvPHelper.this.m_3805();
                        if (var7 != -1) {
                           if (this.f_10668 == -1) {
                              this.f_10668 = PvPHelper.this.m_3781();
                           }

                           if (this.m_3683(var1, var7, var6)) {
                              this.f_10667 = null;
                              this.f_10669 = 0;
                              this.f_10670 = var8;
                           }
                        }
                     } else {
                        if (this.f_10668 == -1) {
                           this.f_10668 = PvPHelper.this.m_3781();
                        }

                        if (PvPHelper.this.m_3781() != var6) {
                           PvPHelper.this.m_3768(var6);
                        }

                        this.f_10667 = null;
                        this.f_10669 = 0;
                        this.f_10666 = PvPHelper.SQg4a8LCFReMvtI7.ATTACK_ARMED;
                        this.f_10670 = var8;
                     }
                  }
               }
            }
         }
      }

      public boolean m_3689(LivingEntity var1) {
         return this.m_3686(var1) && (PvPHelper.this.f_10800.m_8768() || var1.isBlocking() && var1.getUseItem().is(Items.SHIELD));
      }

      public boolean m_3690() {
         return this.f_10666 != PvPHelper.SQg4a8LCFReMvtI7.IDLE;
      }

      public boolean m_3691() {
         return this.f_10671;
      }
   }

   private enum RZIEcpteNs8owJ8e {
      IDLE,
      EQUIP_CHESTPLATE,
      WAIT_CHESTPLATE,
      WAIT_GLIDING_STOP;
   }

   private enum SQg4a8LCFReMvtI7 {
      IDLE,
      PREPARED_AXE,
      PREPARED_MACE,
      ATTACK_ARMED;
   }

   private final class XPGXsXzin6L2DQlc {
      public PvPHelper.ukRSkuOhXbEhe0z6 f_10674 = PvPHelper.ukRSkuOhXbEhe0z6.IDLE;
      public int f_10675 = -1;
      public int f_10676 = -1;
      public int f_10677 = -1;
      public int f_10678;
      public int f_10679;
      public int f_10680;
      public boolean f_10681;
      public boolean f_10682;

      public void m_3692(boolean var1) {
         if (var1 && PvPHelper.this.m_3803()) {
            if (this.f_10682) {
               if (Class_NzJrN63M7QBpmAbi.f_11537.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA)) {
                  PvPHelper.this.m_3793();
               } else {
                  int var2 = Class_B6vpBUNmRtH3JzmV.m_2128(Items.ELYTRA);
                  if (var2 != -1 && PvPHelper.this.m_3775(var2) && Class_NzJrN63M7QBpmAbi.f_11537.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA)) {
                     PvPHelper.this.m_3793();
                  }
               }
            }

            if (this.f_10675 != -1 && PvPHelper.this.m_3781() != this.f_10675) {
               PvPHelper.this.m_3768(this.f_10675);
            }
         }

         this.f_10674 = PvPHelper.ukRSkuOhXbEhe0z6.IDLE;
         this.f_10675 = -1;
         this.f_10676 = -1;
         this.f_10677 = -1;
         this.f_10678 = 0;
         this.f_10679 = 0;
         this.f_10680 = 0;
         this.f_10681 = false;
         this.f_10682 = false;
      }

      public void m_3693() {
         this.f_10677 = -1;
         this.f_10674 = PvPHelper.ukRSkuOhXbEhe0z6.RESUME_FLIGHT;
         this.f_10678 = 1;
         this.f_10679 = 8;
         this.f_10680 = 0;
      }

      public void m_3694() {
         if (Class_NzJrN63M7QBpmAbi.f_11537.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA)) {
            this.m_3693();
         } else {
            int var1 = Class_B6vpBUNmRtH3JzmV.m_2128(Items.ELYTRA);
            if (var1 != -1) {
               if (PvPHelper.this.m_3775(var1)) {
                  if (Class_NzJrN63M7QBpmAbi.f_11537.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA)) {
                     this.m_3693();
                  } else {
                     this.f_10674 = PvPHelper.ukRSkuOhXbEhe0z6.CONFIRM_ELYTRA;
                  }
               }
            }
         }
      }

      public boolean m_3695() {
         return this.f_10674 != PvPHelper.ukRSkuOhXbEhe0z6.IDLE;
      }

      public void m_3696() {
         if (!Class_NzJrN63M7QBpmAbi.f_11537.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA)) {
            this.m_3703();
         } else {
            if (this.f_10677 < 0) {
               this.f_10677 = Class_h78PE30BIJJYoUEk.m_7070();
            }

            if (this.f_10677 == -1) {
               this.f_10682 = false;
               this.m_3698();
            } else {
               if (PvPHelper.this.m_3775(this.f_10677)) {
                  this.f_10677 = -1;
                  this.m_3703();
               }
            }
         }
      }

      public void m_3697() {
         if (PvPHelper.this.m_3803() && !PvPHelper.this.m_3796()) {
            int var1 = PvPHelper.this.m_3773();
            if (var1 != -1) {
               this.f_10675 = PvPHelper.this.m_3781();
               this.f_10676 = var1;
               if (this.m_3704()) {
                  int var2 = Class_h78PE30BIJJYoUEk.m_7070();
                  if (var2 != -1) {
                     this.f_10677 = var2;
                     this.f_10682 = true;
                     this.f_10674 = PvPHelper.ukRSkuOhXbEhe0z6.EQUIP_CHESTPLATE;
                     return;
                  }
               }

               this.m_3698();
            }
         }
      }

      public XPGXsXzin6L2DQlc() {
      }

      public void m_3698() {
         if (!PvPHelper.this.m_3803()) {
            this.m_3692(false);
         } else {
            if (this.f_10676 < 0
               || this.f_10676 > 8
               || !PvPHelper.this.f_10796.contains(Class_NzJrN63M7QBpmAbi.f_11537.player.getInventory().getItem(this.f_10676).getItem())) {
               this.f_10676 = PvPHelper.this.m_3773();
            }

            if (this.f_10676 == -1) {
               this.m_3699();
            } else {
               if (PvPHelper.this.m_3781() != this.f_10676) {
                  PvPHelper.this.m_3768(this.f_10676);
               }

               this.f_10674 = this.f_10682 ? PvPHelper.ukRSkuOhXbEhe0z6.EQUIP_ELYTRA : PvPHelper.ukRSkuOhXbEhe0z6.WAIT_SLOT_RESTORE;
               this.f_10678 = 1;
               this.f_10681 = true;

               try {
                  Class_NzJrN63M7QBpmAbi.f_11537.startAttack();
               } finally {
                  this.f_10681 = false;
               }

               if (this.f_10682) {
                  this.m_3694();
               }
            }
         }
      }

      public void m_3699() {
         if (this.f_10682) {
            this.f_10674 = PvPHelper.ukRSkuOhXbEhe0z6.EQUIP_ELYTRA;
         } else {
            this.f_10674 = PvPHelper.ukRSkuOhXbEhe0z6.WAIT_SLOT_RESTORE;
            this.f_10678 = 0;
         }
      }

      public void m_3700() {
         if (this.f_10678 <= 0 || --this.f_10678 <= 0) {
            if (Class_NzJrN63M7QBpmAbi.f_11537.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA)) {
               this.f_10677 = Class_h78PE30BIJJYoUEk.m_7070();
               this.f_10674 = PvPHelper.ukRSkuOhXbEhe0z6.EQUIP_CHESTPLATE;
            } else {
               this.m_3698();
            }
         }
      }

      public void m_3701() {
         if (Class_NzJrN63M7QBpmAbi.f_11537.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA)) {
            this.m_3693();
         } else {
            this.f_10674 = PvPHelper.ukRSkuOhXbEhe0z6.EQUIP_ELYTRA;
         }
      }

      public void m_3702() {
         if (this.f_10675 != -1 && PvPHelper.this.m_3803() && PvPHelper.this.m_3781() != this.f_10675) {
            PvPHelper.this.m_3768(this.f_10675);
         }

         this.m_3692(false);
      }

      public void m_3703() {
         this.f_10674 = PvPHelper.ukRSkuOhXbEhe0z6.WAIT_CHESTPLATE;
         this.f_10678 = 1;
      }

      public boolean m_3704() {
         return PvPHelper.this.f_10804.m_8768()
            && Class_NzJrN63M7QBpmAbi.f_11537.player.isFallFlying()
            && Class_NzJrN63M7QBpmAbi.f_11537.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA);
      }

      public void m_3705() {
         if (this.m_3695()) {
            if (!PvPHelper.this.m_3803()) {
               this.m_3692(false);
            } else {
               switch (this.f_10674) {
                  case IDLE:
                  default:
                     break;
                  case EQUIP_CHESTPLATE:
                     this.m_3696();
                     break;
                  case WAIT_CHESTPLATE:
                     this.m_3700();
                     break;
                  case EQUIP_ELYTRA:
                     this.m_3694();
                     break;
                  case CONFIRM_ELYTRA:
                     this.m_3701();
                     break;
                  case RESUME_FLIGHT:
                     this.m_3709();
                     break;
                  case WAIT_SLOT_RESTORE:
                     this.m_3708();
               }
            }
         }
      }

      public void m_3706() {
         this.f_10682 = false;
         this.f_10679 = 0;
         this.f_10680 = 0;
         this.f_10674 = PvPHelper.ukRSkuOhXbEhe0z6.WAIT_SLOT_RESTORE;
         this.f_10678 = 1;
      }

      public boolean m_3707() {
         return this.f_10681;
      }

      public void m_3708() {
         if (this.f_10678 <= 0 || --this.f_10678 <= 0) {
            this.m_3702();
         }
      }

      public void m_3709() {
         if (!Class_NzJrN63M7QBpmAbi.f_11537.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA)) {
            this.f_10680 = 0;
            this.f_10674 = PvPHelper.ukRSkuOhXbEhe0z6.EQUIP_ELYTRA;
         } else if (Class_NzJrN63M7QBpmAbi.f_11537.player.onGround()) {
            this.m_3706();
         } else if (this.f_10678 > 0) {
            this.f_10678--;
         } else {
            if (Class_NzJrN63M7QBpmAbi.f_11537.player.isFallFlying()) {
               this.f_10680++;
            } else {
               this.f_10680 = 0;
               PvPHelper.this.m_3793();
            }

            if (this.f_10679 > 0) {
               this.f_10679--;
            }

            if (this.f_10680 >= 2 || this.f_10679 <= 0) {
               this.m_3706();
            }
         }
      }
   }

   private final class lyzoT7kZH6ljyCCC {
      public final Set<Integer> f_10684 = new HashSet<>();
      public static final double f_10686 = 128.0;
      public static final double f_10687 = 0.99;
      public static final double f_10688 = -0.05;
      public static final double f_10689 = 0.5;
      public static final double f_10690 = 0.25;

      public BlockPos m_3710(Arrow var1) {
         Vec3 var2 = var1.position();
         Vec3 var3 = var1.getDeltaMovement();

         for (int var4 = 0; var4 < 160; var4++) {
            Vec3 var5 = var2.add(var3);
            BlockHitResult var6 = Class_NzJrN63M7QBpmAbi.f_11537.level.clip(new ClipContext(var2, var5, Block.COLLIDER, Fluid.NONE, var1));
            if (var6.getType() == Type.BLOCK) {
               return this.m_3718(var6);
            }

            var2 = var5;
            var3 = var3.scale(f_10687).add(0.0, f_10688, 0.0);
         }

         return null;
      }

      public void m_3712(BlockPos var1) {
         Vec3 var2 = Vec3.atCenterOf(var1).add(0.0, f_10690, 0.0);
         BlockHitResult var3 = new BlockHitResult(var2, Direction.UP, var1, false);
         Class_NzJrN63M7QBpmAbi.f_11537.gameMode.useItemOn(Class_NzJrN63M7QBpmAbi.f_11537.player, InteractionHand.MAIN_HAND, var3);
      }

      public void m_3713() {
         if (!PvPHelper.this.f_10805.m_8768() || !PvPHelper.this.m_3803()) {
            this.m_3717();
         } else if (!PvPHelper.this.m_3796()) {
            this.f_10684.removeIf(var0 -> Class_NzJrN63M7QBpmAbi.f_11537.level.getEntity(var0) == null);

            for (Arrow var2 : Class_NzJrN63M7QBpmAbi.f_11537
               .level
               .getEntitiesOfClass(
                  Arrow.class,
                  Class_NzJrN63M7QBpmAbi.f_11537.player.getBoundingBox().inflate(f_10686),
                  var0 -> var0.getOwner() == Class_NzJrN63M7QBpmAbi.f_11537.player
               )) {
               if (!this.f_10684.contains(var2.getId())) {
                  if (var2.tickCount > 10) {
                     this.f_10684.add(var2.getId());
                  } else {
                     BlockPos var3 = this.m_3710(var2);
                     if (var3 != null && this.m_3719(var3)) {
                        int var4 = PvPHelper.this.m_3792(Items.RAIL);
                        int var5 = PvPHelper.this.m_3792(Items.TNT_MINECART);
                        if (var4 != -1 && var5 != -1) {
                           this.f_10684.add(var2.getId());
                           this.m_3714(var3, var4, var5);
                           break;
                        }
                     }
                  }
               }
            }
         }
      }

      public void m_3714(BlockPos var1, int var2, int var3) {
         int var4 = PvPHelper.this.m_3781();

         try {
            PvPHelper.this.m_3768(var2);
            this.m_3720(var1);
            PvPHelper.this.m_3768(var3);
            this.m_3712(var1);
         } finally {
            if (PvPHelper.this.m_3803() && PvPHelper.this.m_3781() != var4) {
               PvPHelper.this.m_3768(var4);
            }
         }
      }

      public boolean m_3715(BlockPos var1) {
         BlockState var2 = Class_NzJrN63M7QBpmAbi.f_11537.level.getBlockState(var1);
         BlockState var3 = Class_NzJrN63M7QBpmAbi.f_11537.level.getBlockState(var1.below());
         return var2.canBeReplaced() && var3.isFaceSturdy(Class_NzJrN63M7QBpmAbi.f_11537.level, var1.below(), Direction.UP);
      }

      public lyzoT7kZH6ljyCCC() {
      }

      public void m_3717() {
         this.f_10684.clear();
      }

      public BlockPos m_3718(BlockHitResult var1) {
         BlockPos var2 = var1.getBlockPos();
         BlockPos var3 = var1.getDirection() == Direction.UP ? var2.above() : var2;

         for (int var4 = 2; var4 >= -4; var4--) {
            BlockPos var5 = var3.offset(0, var4, 0);
            if (this.m_3715(var5)) {
               return var5;
            }
         }

         return null;
      }

      public boolean m_3719(BlockPos var1) {
         return Class_NzJrN63M7QBpmAbi.f_11537.player.isWithinBlockInteractionRange(var1.below(), 0.0)
            && Class_NzJrN63M7QBpmAbi.f_11537.player.isWithinBlockInteractionRange(var1, 0.0);
      }

      public void m_3720(BlockPos var1) {
         BlockPos var2 = var1.below();
         Vec3 var3 = Vec3.atCenterOf(var2).add(0.0, f_10689, 0.0);
         BlockHitResult var4 = new BlockHitResult(var3, Direction.UP, var2, false);
         Class_NzJrN63M7QBpmAbi.f_11537.gameMode.useItemOn(Class_NzJrN63M7QBpmAbi.f_11537.player, InteractionHand.MAIN_HAND, var4);
      }
   }

   private final class mNp0ZRBd9BgeEccY {
      public final Class_qT3a68ZR9cAz3wbe f_10691 = new Class_qT3a68ZR9cAz3wbe();
      public final Class_Hu2eXItMRRg3g9gb f_10692 = new Class_Hu2eXItMRRg3g9gb();
      public final Class_jNlR3TgqfR7C3lDK f_10693 = new Class_jNlR3TgqfR7C3lDK();
      public final Class_I4ZLf1tdGfKiuaY4 f_10694 = new Class_I4ZLf1tdGfKiuaY4();
      public Player f_10695;
      public LocalPlayer f_10696;
      public ClientLevel f_10697;
      public boolean f_10698;
      public int f_10699;
      public int f_10700 = -1;
      public volatile boolean f_10701;
      public static final double f_10703 = 256.0;
      public static final double f_10704 = 50.0;
      public static final double f_10705 = 6.0;
      public static final double f_10706 = 4.0;
      public static final double f_10707 = 0.91F;
      public static final double f_10708 = 0.98F;
      public static final double f_10709 = 0.3;

      public InteractionHand m_3722() {
         if (Class_NzJrN63M7QBpmAbi.f_11537.player.getOffhandItem().is(Items.WIND_CHARGE)
            && !Class_NzJrN63M7QBpmAbi.f_11537.player.getCooldowns().isOnCooldown(Class_NzJrN63M7QBpmAbi.f_11537.player.getOffhandItem())) {
            return InteractionHand.OFF_HAND;
         }

         int var1 = PvPHelper.this.m_3792(Items.WIND_CHARGE);
         return var1 != -1
               && !Class_NzJrN63M7QBpmAbi.f_11537.player.getCooldowns().isOnCooldown(Class_NzJrN63M7QBpmAbi.f_11537.player.getInventory().getItem(var1))
            ? InteractionHand.MAIN_HAND
            : null;
      }

      public void m_3723() {
         this.m_3733();
         Player var1 = null;
         double var2 = PvPHelper.this.f_10808.m_8768() * PvPHelper.this.f_10808.m_8768();

         for (Player var5 : Class_NzJrN63M7QBpmAbi.f_11537.level.players()) {
            if (this.m_3728(var5)) {
               double var6 = Class_NzJrN63M7QBpmAbi.f_11537.player.distanceToSqr(var5);
               if (var6 < var2 || var6 == var2 && (var1 == null || var5.getId() < var1.getId())) {
                  var1 = var5;
                  var2 = var6;
               }
            }
         }

         if (var1 != this.f_10695) {
            this.f_10691.m_8333();
         }

         this.f_10695 = var1;
         if (this.f_10695 != null) {
            this.m_3724();
         }
      }

      public Class_qT3a68ZR9cAz3wbe.GHJVGUMVTdUYTniZ m_3724() {
         Vec3 var1 = this.f_10695.getPositionCodec().getBase();
         if (var1.distanceToSqr(this.f_10695.position()) > f_10703) {
            var1 = this.f_10695.position();
         }

         return this.f_10691
            .m_8332(
               this.f_10695.getId(),
               Class_NzJrN63M7QBpmAbi.f_11537.player.tickCount,
               var1,
               this.f_10695.getKnownMovement(),
               this.f_10695.getInterpolation().yRot(),
               this.f_10695.getInterpolation().xRot()
            );
      }

      public boolean m_3725() {
         return this.f_10698 || this.f_10700 >= 0;
      }

      public void m_3726() {
         if (PvPHelper.this.m_3803()
            && Class_NzJrN63M7QBpmAbi.f_11537.getConnection() != null
            && !PvPHelper.this.m_3796()
            && !Class_NzJrN63M7QBpmAbi.f_11537.player.isSpectator()
            && !Class_NzJrN63M7QBpmAbi.f_11537.player.isUsingItem()) {
            this.m_3723();
            if (this.f_10695 != null && this.m_3722() != null) {
               Class_U3Ilecg2NrGaJJQx var1 = DimasikClient.m_9057().m_9049().m_2813();
               Class_FghX3TD0v55wW2U2 var2 = DimasikClient.m_9057().m_9052().m_6342();
               if (var2.m_2656() == null) {
                  var2.m_2663().set(Class_NzJrN63M7QBpmAbi.f_11537.player.getYRot(), Class_NzJrN63M7QBpmAbi.f_11537.player.getXRot());
                  var2.m_2654().set(Class_NzJrN63M7QBpmAbi.f_11537.player.getYRot(), Class_NzJrN63M7QBpmAbi.f_11537.player.getXRot());
               }

               this.f_10694.m_2950(Class_NzJrN63M7QBpmAbi.f_11537.player.getYRot(), Class_NzJrN63M7QBpmAbi.f_11537.player.getXRot());
               if (var1.m_5177(this.f_10694, 6, 20)) {
                  this.f_10698 = true;
                  this.f_10699 = Class_NzJrN63M7QBpmAbi.f_11537.player.tickCount;
               }
            }
         }
      }

      public void m_3727(Class_nCtAXu2tIwCiU5cL var1) {
         if (PvPHelper.this.m_3803() && PvPHelper.this.f_10807.m_8768() != -1) {
            this.m_3733();
            if (var1.packet() instanceof ServerboundMovePlayerPacket var2) {
               Vec3 var4 = this.f_10692.m_2948().position();
               this.f_10692.m_2946(new Vec3(var2.getX(var4.x), var2.getY(var4.y), var2.getZ(var4.z)), var2.isOnGround());
            } else if (var1.packet() instanceof ServerboundClientTickEndPacket) {
               this.f_10692.m_2947();
            }
         }
      }

      public boolean m_3728(Player var1) {
         return var1 != Class_NzJrN63M7QBpmAbi.f_11537.player
            && var1.isAlive()
            && !var1.isRemoved()
            && !var1.isSpectator()
            && var1.level() == Class_NzJrN63M7QBpmAbi.f_11537.level
            && PvPHelper.this.f_10819.m_3648(Class_NzJrN63M7QBpmAbi.f_11537.player, var1);
      }

      public void m_3730(Class_jfpiTZhNIuwDwqKr.Class_13dQBetjQQOBNsco var1) {
         if (this.f_10698) {
            if (PvPHelper.this.m_3803()
               && this.f_10697 == Class_NzJrN63M7QBpmAbi.f_11537.level
               && this.f_10696 == Class_NzJrN63M7QBpmAbi.f_11537.player
               && Class_NzJrN63M7QBpmAbi.f_11537.getConnection() != null
               && !this.f_10701
               && !Class_NzJrN63M7QBpmAbi.f_11537.player.isPassenger()
               && Class_NzJrN63M7QBpmAbi.f_11537.gui.screen() == null
               && !Class_NzJrN63M7QBpmAbi.f_11537.player.isSpectator()
               && !Class_NzJrN63M7QBpmAbi.f_11537.player.isUsingItem()) {
               if (DimasikClient.m_9057().m_9049().m_2813().m_5180() != this.f_10694) {
                  this.m_3731();
               } else {
                  this.m_3723();
                  InteractionHand var2 = this.m_3722();
                  if (this.f_10695 != null && var2 != null) {
                     Class_qT3a68ZR9cAz3wbe.GHJVGUMVTdUYTniZ var3 = this.m_3724();
                     double var4 = var3.age() + Math.clamp(Class_V8TcGGMsId7v9MLv.f_15355 / f_10704, 0.0, f_10705);
                     MobEffectInstance var6 = this.f_10695.getEffect(MobEffects.LEVITATION);
                     boolean var7 = this.f_10695.isFallFlying()
                        && Class_NzJrN63M7QBpmAbi.f_11537
                           .level
                           .getEntitiesOfClass(FireworkRocketEntity.class, this.f_10695.getBoundingBox().inflate(f_10706), Entity::isAlive)
                           .stream()
                           .anyMatch(var1x -> ((FireworkRocketEntityMixin_2)var1x).dimasik$getAttachedEntity() == this.f_10695);
                     Class_FyutImIC8oFoGKuH.at09eCJZBjEw7bSk var8 = new Class_FyutImIC8oFoGKuH.at09eCJZBjEw7bSk(
                        this.f_10695.onGround(),
                        this.f_10695.isFallFlying(),
                        this.f_10695.getAbilities().flying,
                        this.f_10695.isInWater() || this.f_10695.isInLava(),
                        this.f_10695.onClimbable(),
                        this.f_10695.hasEffect(MobEffects.SLOW_FALLING),
                        var6 == null ? -1 : var6.getAmplifier(),
                        var7,
                        this.f_10695.isNoGravity() ? 0.0 : this.f_10695.getGravity(),
                        f_10707,
                        f_10708,
                        this.f_10695.maxUpStep(),
                        this.f_10695.getInterpolation().yRot(),
                        this.f_10695.getInterpolation().xRot()
                     );
                     AABB var9 = this.f_10695.getBoundingBox().move(var3.position().subtract(this.f_10695.position()));
                     List var10 = Class_FyutImIC8oFoGKuH.m_2705(
                        var9,
                        var3,
                        var8,
                        40 + (int)Math.ceil(var4) + 1,
                        (var1x, var2x) -> Entity.collideBoundingBox(this.f_10695, var2x, var1x, Class_NzJrN63M7QBpmAbi.f_11537.level, List.of()),
                        Class_sS4M8u1p9l0dNe0C::m_8705
                     );
                     Class_Hu2eXItMRRg3g9gb.TqWYbo6sw0sBmqfg var11 = this.f_10692.m_2948();
                     Vec3 var12 = var11.inherited();
                     Vec3 var13 = var11.position().add(0.0, Class_NzJrN63M7QBpmAbi.f_11537.player.getEyeHeight(), 0.0);
                     Class_jNlR3TgqfR7C3lDK.w3n44Eu0QQ7QmeOq var14 = this.f_10693.m_7382(var13, var12, var10, var4, this::m_3734);
                     if (var14 == null) {
                        this.m_3731();
                     } else {
                        int var15 = PvPHelper.this.m_3781();
                        float var16 = Class_NzJrN63M7QBpmAbi.f_11537.player.getYRot();
                        float var17 = Class_NzJrN63M7QBpmAbi.f_11537.player.getXRot();
                        this.f_10694.m_2950(var14.yaw(), var14.pitch());

                        try {
                           if (var2 == InteractionHand.MAIN_HAND) {
                              PvPHelper.this.m_3768(PvPHelper.this.m_3792(Items.WIND_CHARGE));
                           }

                           Class_NzJrN63M7QBpmAbi.f_11537.player.setYRot(var14.yaw());
                           Class_NzJrN63M7QBpmAbi.f_11537.player.setXRot(var14.pitch());
                           if (Class_NzJrN63M7QBpmAbi.f_11537.gameMode.useItem(Class_NzJrN63M7QBpmAbi.f_11537.player, var2).consumesAction()) {
                              Class_NzJrN63M7QBpmAbi.f_11537.player.swing(var2);
                           }
                        } finally {
                           Class_NzJrN63M7QBpmAbi.f_11537.player.setYRot(var16);
                           Class_NzJrN63M7QBpmAbi.f_11537.player.setXRot(var17);
                           PvPHelper.this.m_3768(var15);
                           this.f_10698 = false;
                           this.f_10700 = Class_NzJrN63M7QBpmAbi.f_11537.player.tickCount + 2;
                        }
                     }
                  } else {
                     this.m_3731();
                  }
               }
            } else {
               this.m_3731();
            }
         }
      }

      public void m_3731() {
         DimasikClient.m_9057().m_9049().m_2813().m_5164(this.f_10694);
         DimasikClient.m_9057().m_9052().m_6342().m_2662(this.f_10694);
         this.f_10698 = false;
         this.f_10700 = -1;
         this.f_10695 = null;
         this.f_10696 = null;
         this.f_10697 = null;
         this.f_10691.m_8333();
      }

      public void m_3733() {
         if (this.f_10701) {
            this.m_3731();
            this.f_10701 = false;
         }

         if (this.f_10697 != Class_NzJrN63M7QBpmAbi.f_11537.level || this.f_10696 != Class_NzJrN63M7QBpmAbi.f_11537.player) {
            this.m_3731();
            this.f_10697 = Class_NzJrN63M7QBpmAbi.f_11537.level;
            this.f_10696 = Class_NzJrN63M7QBpmAbi.f_11537.player;
            this.f_10692.m_2949(Class_NzJrN63M7QBpmAbi.f_11537.player.position(), Class_NzJrN63M7QBpmAbi.f_11537.player.onGround());
         }
      }

      public double m_3734(Vec3 var1, Vec3 var2) {
         BlockHitResult var3 = Class_NzJrN63M7QBpmAbi.f_11537
            .level
            .clipIncludingBorder(new ClipContext(var1, var2, Block.COLLIDER, Fluid.NONE, Class_NzJrN63M7QBpmAbi.f_11537.player));
         double var4 = var3.getType() == Type.MISS ? Double.POSITIVE_INFINITY : var1.distanceTo(var3.getLocation());

         for (Entity var7 : Class_NzJrN63M7QBpmAbi.f_11537
            .level
            .getEntities(
               Class_NzJrN63M7QBpmAbi.f_11537.player,
               new AABB(var1, var2).inflate(1.0),
               var1x -> var1x != this.f_10695
                  && var1x.isPickable()
                  && !var1x.isSpectator()
                  && !(var1x instanceof AbstractWindCharge)
                  && !var1x.is(EntityTypes.END_CRYSTAL)
            )) {
            AABB var8 = var7.getBoundingBox().inflate(f_10709);
            if (var8.contains(var1)) {
               return 0.0;
            }

            Optional var9 = var8.clip(var1, var2);
            if (var9.isPresent()) {
               var4 = Math.min(var4, var1.distanceTo((Vec3)var9.get()));
            }
         }

         return var4;
      }

      public void m_3735() {
         if (PvPHelper.this.m_3803() && PvPHelper.this.f_10807.m_8768() != -1) {
            if (!this.f_10698 || Class_NzJrN63M7QBpmAbi.f_11537.gui.screen() == null && Class_NzJrN63M7QBpmAbi.f_11537.player.tickCount - this.f_10699 <= 4) {
               if (this.f_10700 >= 0 && Class_NzJrN63M7QBpmAbi.f_11537.player.tickCount >= this.f_10700) {
                  DimasikClient.m_9057().m_9049().m_2813().m_5175(this.f_10694);
                  this.f_10700 = -1;
               }

               this.m_3723();
            } else {
               this.m_3731();
            }
         } else {
            this.m_3731();
         }
      }

      public mNp0ZRBd9BgeEccY() {
      }
   }

   private final class nUKRoLTrddhk3yUq {
      public PvPHelper.RZIEcpteNs8owJ8e f_10710 = PvPHelper.RZIEcpteNs8owJ8e.IDLE;
      public LivingEntity f_10711;
      public int f_10712 = -1;
      public int f_10713;
      public int f_10714;
      public int f_10715;
      public int f_10716;
      public boolean f_10717;
      public boolean f_10718;
      public boolean f_10719;
      public int f_10720 = -1;
      public Vec3 f_10721 = Vec3.ZERO;
      public Vec3 f_10722 = Vec3.ZERO;
      public Vec3 f_10723 = Vec3.ZERO;
      public Vec3 f_10724 = Vec3.ZERO;
      public float f_10725;
      public float f_10726;
      public float f_10727;
      public float f_10728;
      public float f_10729;
      public float f_10730;
      public float f_10731;
      public float f_10732;
      public boolean f_10733;
      public static final float f_10735 = 96.0F;
      public static final double f_10736 = 1.25;
      public static final double f_10737 = 0.75;
      public static final double f_10738 = 0.55;
      public static final double f_10739 = 0.45;
      public static final double f_10740 = 0.65;
      public static final double f_10741 = 0.35;
      public static final float f_10742 = 0.55F;
      public static final float f_10743 = 0.45F;
      public static final float f_10744 = 0.55F;
      public static final float f_10745 = 0.45F;
      public static final float f_10746 = 0.65F;
      public static final float f_10747 = 0.35F;
      public static final float f_10748 = 0.65F;
      public static final float f_10749 = 0.35F;
      public static final double f_10750 = 3.0;
      public static final double f_10751 = 0.82;
      public static final float f_10752 = 0.8F;
      public static final float f_10753 = 0.8F;
      public static final double f_10754 = -0.08;
      public static final double f_10755 = 0.91;
      public static final double f_10756 = 0.98;
      public static final double f_10757 = 0.91;
      public static final double f_10758 = 0.91;
      public static final double f_10759 = 0.91;
      public static final double f_10760 = -0.08;
      public static final double f_10761 = 0.91;
      public static final double f_10762 = 0.98;
      public static final double f_10763 = 0.91;
      public static final double f_10764 = Math.PI;
      public static final double f_10765 = 180.0;
      public static final double f_10766 = 0.4;
      public static final double f_10767 = -0.08;
      public static final double f_10768 = 0.06;
      public static final double f_10769 = -0.1;
      public static final double f_10770 = 0.04;
      public static final double f_10771 = 3.2;
      public static final double f_10772 = 0.1;
      public static final double f_10773 = 0.1;
      public static final double f_10774 = 0.99;
      public static final double f_10775 = 0.98;
      public static final double f_10776 = 0.99;
      public static final float f_10777 = 360.0F;
      public static final float f_10778 = 180.0F;
      public static final float f_10779 = 360.0F;
      public static final float f_10780 = -180.0F;
      public static final float f_10781 = 360.0F;
      public static final float f_10782 = -90.0F;
      public static final float f_10783 = 90.0F;

      public boolean m_3736() {
         return this.m_3746() && !this.f_10719;
      }

      public float m_3737(float var1) {
         float var2 = var1 % f_10777;
         if (var2 >= f_10778) {
            var2 -= f_10779;
         }

         if (var2 < f_10780) {
            var2 += f_10781;
         }

         return var2;
      }

      public boolean m_3738(LivingEntity var1) {
         if (!PvPHelper.this.f_10799.m_8768()) {
            return true;
         }

         Aura var2 = PvPHelper.this.m_3795();
         return var2 != null && var2.m_1114() == var1;
      }

      public void m_3739() {
         if (this.f_10718) {
            this.m_3753();
         } else {
            this.m_3747();
         }
      }

      public void m_3740() {
         PvPHelper.this.f_10813.m_3685();
         this.f_10710 = PvPHelper.RZIEcpteNs8owJ8e.IDLE;
         this.f_10711 = null;
         this.f_10712 = -1;
         this.f_10713 = 0;
         this.f_10714 = 0;
         this.f_10715 = 0;
         this.f_10716 = 0;
         this.f_10717 = false;
         this.f_10718 = false;
         this.f_10719 = false;
         this.m_3749();
      }

      public void m_3741() {
         if (this.f_10716 > 0) {
            this.f_10716--;
         }

         if (!this.m_3746()) {
            this.m_3752();
         } else if (PvPHelper.this.m_3803() && PvPHelper.this.m_3801(this.f_10711)) {
            if (--this.f_10715 <= 0 && !this.f_10717) {
               if (this.m_3748()) {
                  this.m_3739();
               } else {
                  this.m_3740();
               }
            } else {
               switch (this.f_10710) {
                  case IDLE:
                  default:
                     break;
                  case EQUIP_CHESTPLATE:
                     this.m_3757();
                     break;
                  case WAIT_CHESTPLATE:
                     this.m_3744();
                     break;
                  case WAIT_GLIDING_STOP:
                     this.m_3762();
               }
            }
         } else {
            this.m_3740();
         }
      }

      public void m_3742(LivingEntity var1, boolean var2) {
         int var3 = Class_h78PE30BIJJYoUEk.m_7070();
         if (var3 != -1) {
            if (!var2) {
               PvPHelper.this.f_10813.m_3680(var1);
            }

            this.f_10711 = var1;
            this.f_10712 = var3;
            this.f_10713 = 0;
            this.f_10714 = 0;
            this.f_10715 = 100;
            this.f_10717 = false;
            this.f_10718 = var2;
            this.f_10710 = PvPHelper.RZIEcpteNs8owJ8e.EQUIP_CHESTPLATE;
         }
      }

      public Vec3 m_3743(Vec3 var1) {
         return var1.add(0.0, f_10754, 0.0).multiply(f_10755, f_10756, f_10757);
      }

      public void m_3744() {
         if (this.f_10713 > 0) {
            this.f_10713--;
         } else if (!Class_NzJrN63M7QBpmAbi.f_11537.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA)) {
            this.m_3756();
         } else {
            this.f_10712 = Class_h78PE30BIJJYoUEk.m_7070();
            this.f_10715 = 20;
            this.f_10710 = PvPHelper.RZIEcpteNs8owJ8e.EQUIP_CHESTPLATE;
         }
      }

      public float m_3745(float var1) {
         return Math.max(f_10782, Math.min(f_10783, var1));
      }

      public boolean m_3746() {
         return this.f_10710 != PvPHelper.RZIEcpteNs8owJ8e.IDLE;
      }

      public void m_3747() {
         this.f_10710 = PvPHelper.RZIEcpteNs8owJ8e.IDLE;
         this.f_10711 = null;
         this.f_10712 = -1;
         this.f_10713 = 0;
         this.f_10714 = 0;
         this.f_10715 = 0;
         this.f_10716 = 2;
         this.f_10717 = false;
         this.f_10718 = false;
         this.m_3749();
      }

      public boolean m_3748() {
         return PvPHelper.this.m_3803()
            && !Class_NzJrN63M7QBpmAbi.f_11537.player.isFallFlying()
            && !Class_NzJrN63M7QBpmAbi.f_11537.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA);
      }

      public void m_3749() {
         this.f_10720 = -1;
         this.f_10721 = Vec3.ZERO;
         this.f_10722 = Vec3.ZERO;
         this.f_10723 = Vec3.ZERO;
         this.f_10724 = Vec3.ZERO;
         this.f_10725 = 0.0F;
         this.f_10726 = 0.0F;
         this.f_10727 = 0.0F;
         this.f_10728 = 0.0F;
         this.f_10729 = 0.0F;
         this.f_10730 = 0.0F;
         this.f_10731 = 0.0F;
         this.f_10732 = 0.0F;
         this.f_10733 = false;
      }

      public void m_3750(Class_a7M44oHQPwN0rL5A var1) {
         if (!this.f_10719 && var1.m_5904() instanceof LivingEntity var2) {
            if (this.m_3746()) {
               if (this.f_10711 == var2) {
                  if (this.m_3748()) {
                     this.m_3747();
                  } else {
                     var1.m_1582(true);
                  }
               }
            } else if (this.m_3761(var1, var2)) {
               var1.m_1582(true);
               this.m_3742(var2, true);
            }
         }
      }

      public Vec3 m_3751(LivingEntity var1, Vec3 var2, float var3, float var4) {
         Vec3 var5 = var1.calculateViewVector(var4, var3);
         double var6 = Math.hypot(var5.x, var5.z);
         double var8 = Math.hypot(var2.x, var2.z);
         double var10 = var5.length();
         double var12 = var4 * f_10764 / f_10765;
         double var14 = Math.cos(var12);
         var14 = var14 * var14 * Math.min(1.0, var10 / f_10766);
         Vec3 var16 = var2.add(0.0, f_10767 + var14 * f_10768, 0.0);
         if (var16.y < 0.0 && var6 > 0.0) {
            double var17 = var16.y * f_10769 * var14;
            var16 = var16.add(var5.x / var6 * var17, var17, var5.z / var6 * var17);
         }

         if (var12 < 0.0 && var6 > 0.0) {
            double var20 = var8 * -Math.sin(var12) * f_10770;
            var16 = var16.add(-var5.x / var6 * var20, var20 * f_10771, -var5.z / var6 * var20);
         }

         if (var6 > 0.0) {
            var16 = var16.add((var5.x / var6 * var8 - var16.x) * f_10772, 0.0, (var5.z / var6 * var8 - var16.z) * f_10773);
         }

         return var16.multiply(f_10774, f_10775, f_10776);
      }

      public void m_3752() {
         if (PvPHelper.this.m_3803() && this.f_10716 <= 0) {
            Aura var1 = PvPHelper.this.m_3795();
            LivingEntity var2 = var1 == null ? null : var1.m_1008(f_10735);
            if (PvPHelper.this.m_3801(var2) && this.m_3754(var2)) {
               this.m_3755(var2);
               if (this.f_10733) {
                  int var3 = this.m_3759(var2, 80);
                  int var4 = PvPHelper.this.f_10802.m_8768().intValue();
                  if (var3 >= 1 && var3 <= var4) {
                     this.m_3742(var2, false);
                  }
               }
            } else {
               if (!Class_NzJrN63M7QBpmAbi.f_11537.player.isFallFlying()
                  || !Class_NzJrN63M7QBpmAbi.f_11537.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA)) {
                  this.m_3749();
               }
            }
         } else {
            this.m_3749();
         }
      }

      public void m_3753() {
         LivingEntity var1 = this.f_10711;
         if (PvPHelper.this.m_3803() && PvPHelper.this.m_3801(var1) && this.m_3748()) {
            this.f_10719 = true;

            try {
               Class_NzJrN63M7QBpmAbi.f_11537.gameMode.attack(Class_NzJrN63M7QBpmAbi.f_11537.player, var1);
            } finally {
               this.f_10719 = false;
               this.m_3747();
            }
         } else {
            this.m_3740();
         }
      }

      public boolean m_3754(LivingEntity var1) {
         return PvPHelper.this.f_10797.m_8768()
            && PvPHelper.this.f_10801.m_8768()
            && Class_NzJrN63M7QBpmAbi.f_11537.gui.screen() == null
            && this.f_10716 == 0
            && !PvPHelper.this.f_10813.m_3690()
            && !PvPHelper.this.f_10814.m_3695()
            && !PvPHelper.this.f_10815.m_3767()
            && PvPHelper.this.m_3801(var1)
            && PvPHelper.this.m_3779() != -1
            && Class_h78PE30BIJJYoUEk.m_7070() != -1
            && !Class_NzJrN63M7QBpmAbi.f_11537.player.onGround()
            && Class_NzJrN63M7QBpmAbi.f_11537.player.isFallFlying()
            && Class_NzJrN63M7QBpmAbi.f_11537.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA);
      }

      public void m_3755(LivingEntity var1) {
         Vec3 var2 = Class_NzJrN63M7QBpmAbi.f_11537.player.getDeltaMovement();
         Vec3 var3 = var1.getDeltaMovement();
         if (this.f_10720 != var1.getId()) {
            this.f_10720 = var1.getId();
            this.f_10721 = var2;
            this.f_10722 = var3;
            this.f_10725 = Class_NzJrN63M7QBpmAbi.f_11537.player.getYRot();
            this.f_10726 = Class_NzJrN63M7QBpmAbi.f_11537.player.getXRot();
            this.f_10727 = var1.getYRot();
            this.f_10728 = var1.getXRot();
            this.f_10723 = Vec3.ZERO;
            this.f_10724 = Vec3.ZERO;
            this.f_10729 = 0.0F;
            this.f_10730 = 0.0F;
            this.f_10731 = 0.0F;
            this.f_10732 = 0.0F;
            this.f_10733 = false;
         } else {
            float var4 = Class_NzJrN63M7QBpmAbi.f_11537.player.getYRot();
            float var5 = Class_NzJrN63M7QBpmAbi.f_11537.player.getXRot();
            float var6 = var1.getYRot();
            float var7 = var1.getXRot();
            Vec3 var8 = this.m_3760(Class_NzJrN63M7QBpmAbi.f_11537.player, this.f_10721, this.f_10725, this.f_10726);
            Vec3 var9 = this.m_3760(var1, this.f_10722, this.f_10727, this.f_10728);
            Vec3 var10 = this.m_3758(var2.subtract(var8), f_10736);
            Vec3 var11 = this.m_3758(var3.subtract(var9), f_10737);
            this.f_10723 = this.f_10723.scale(f_10738).add(var10.scale(f_10739));
            this.f_10724 = this.f_10724.scale(f_10740).add(var11.scale(f_10741));
            this.f_10729 = this.f_10729 * f_10742 + this.m_3737(var4 - this.f_10725) * f_10743;
            this.f_10730 = this.f_10730 * f_10744 + (var5 - this.f_10726) * f_10745;
            this.f_10731 = this.f_10731 * f_10746 + this.m_3737(var6 - this.f_10727) * f_10747;
            this.f_10732 = this.f_10732 * f_10748 + (var7 - this.f_10728) * f_10749;
            this.f_10721 = var2;
            this.f_10722 = var3;
            this.f_10725 = var4;
            this.f_10726 = var5;
            this.f_10727 = var6;
            this.f_10728 = var7;
            this.f_10733 = true;
         }
      }

      public void m_3756() {
         Class_NzJrN63M7QBpmAbi.f_11537.player.stopFallFlying();
         this.f_10713 = 0;
         this.f_10715 = 12;
         this.f_10710 = PvPHelper.RZIEcpteNs8owJ8e.WAIT_GLIDING_STOP;
      }

      public nUKRoLTrddhk3yUq() {
      }

      public void m_3757() {
         if (!this.f_10717 && !Class_NzJrN63M7QBpmAbi.f_11537.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA)) {
            this.m_3756();
         } else {
            if (this.f_10712 < 0) {
               this.f_10712 = Class_h78PE30BIJJYoUEk.m_7070();
            }

            if (this.f_10712 != -1 && this.f_10714 < 4) {
               this.f_10717 = true;
               if (PvPHelper.this.m_3775(this.f_10712)) {
                  this.f_10717 = false;
                  this.f_10714++;
                  if (!Class_NzJrN63M7QBpmAbi.f_11537.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA)) {
                     this.m_3756();
                  } else {
                     this.f_10715 = 8;
                     this.f_10713 = 0;
                     this.f_10710 = PvPHelper.RZIEcpteNs8owJ8e.WAIT_CHESTPLATE;
                  }
               }
            } else {
               this.m_3740();
            }
         }
      }

      public Vec3 m_3758(Vec3 var1, double var2) {
         double var4 = var1.lengthSqr();
         double var6 = var2 * var2;
         return !(var4 <= var6) && var4 != 0.0 ? var1.scale(var2 / Math.sqrt(var4)) : var1;
      }

      public int m_3759(LivingEntity var1, int var2) {
         Vec3 var3 = Class_NzJrN63M7QBpmAbi.f_11537.player.position();
         Vec3 var4 = var1.position();
         Vec3 var5 = Class_NzJrN63M7QBpmAbi.f_11537.player.getDeltaMovement();
         Vec3 var6 = var1.getDeltaMovement();
         Vec3 var7 = this.f_10723;
         Vec3 var8 = this.f_10724;
         float var9 = var1.getYRot();
         float var10 = var1.getXRot();
         float var11 = this.f_10731;
         float var12 = this.f_10732;
         double var13 = var3.distanceTo(var4);

         for (int var15 = 1; var15 <= var2; var15++) {
            var9 = this.m_3737(var9 + var11);
            var10 = this.m_3745(var10 + var12);
            if (var15 == 1) {
               float var16 = this.m_3737(Class_NzJrN63M7QBpmAbi.f_11537.player.getYRot() + this.f_10729);
               float var17 = this.m_3745(Class_NzJrN63M7QBpmAbi.f_11537.player.getXRot() + this.f_10730);
               var5 = this.m_3751(Class_NzJrN63M7QBpmAbi.f_11537.player, var5, var16, var17).add(var7);
            } else {
               var5 = this.m_3743(var5);
            }

            var6 = this.m_3760(var1, var6, var9, var10).add(var8);
            var3 = var3.add(var5);
            var4 = var4.add(var6);
            double var18 = var3.distanceTo(var4);
            if (var18 <= f_10750 && var18 < var13) {
               return var15;
            }

            var13 = var18;
            var7 = Vec3.ZERO;
            var8 = var8.scale(f_10751);
            var11 *= f_10752;
            var12 *= f_10753;
         }

         return -1;
      }

      public Vec3 m_3760(LivingEntity var1, Vec3 var2, float var3, float var4) {
         if (var1.isFallFlying()) {
            return this.m_3751(var1, var2, var3, var4);
         } else {
            return var1.onGround() ? new Vec3(var2.x * f_10758, 0.0, var2.z * f_10759) : var2.add(0.0, f_10760, 0.0).multiply(f_10761, f_10762, f_10763);
         }
      }

      public boolean m_3761(Class_a7M44oHQPwN0rL5A var1, LivingEntity var2) {
         return PvPHelper.this.m_3803() && !var1.m_1581() && var1.m_5905() == Class_NzJrN63M7QBpmAbi.f_11537.player && this.m_3754(var2) && this.m_3738(var2);
      }

      public void m_3762() {
         if (Class_NzJrN63M7QBpmAbi.f_11537.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA)) {
            this.f_10712 = Class_h78PE30BIJJYoUEk.m_7070();
            this.f_10715 = 20;
            this.f_10710 = PvPHelper.RZIEcpteNs8owJ8e.EQUIP_CHESTPLATE;
         } else if (Class_NzJrN63M7QBpmAbi.f_11537.player.isFallFlying()) {
            Class_NzJrN63M7QBpmAbi.f_11537.player.stopFallFlying();
         } else {
            this.m_3739();
         }
      }
   }

   private final class oW2k3IUUXHjsdBC9 {
      public PvPHelper.OkhYiiEFIBI1DH7e f_10784 = PvPHelper.OkhYiiEFIBI1DH7e.IDLE;
      public int f_10785 = -1;
      public int f_10786;
      public float f_10787;
      public float f_10788;

      public oW2k3IUUXHjsdBC9() {
      }

      public void m_3763(boolean var1) {
         if (var1 && this.m_3767() && PvPHelper.this.m_3803() && this.f_10785 != -1 && PvPHelper.this.m_3781() != this.f_10785) {
            PvPHelper.this.m_3768(this.f_10785);
         }

         PvPHelper.this.m_3798(false);
         this.f_10784 = PvPHelper.OkhYiiEFIBI1DH7e.IDLE;
         this.f_10785 = -1;
         this.f_10786 = 0;
         this.f_10787 = 0.0F;
         this.f_10788 = 0.0F;
      }

      public void m_3764() {
         if (this.m_3767()) {
            PvPHelper.this.m_3798(true);
            if (!PvPHelper.this.m_3803()) {
               this.m_3763(false);
            } else if (this.f_10786 > 0) {
               this.f_10786--;
            } else {
               int var1 = PvPHelper.this.m_3792(Items.WIND_CHARGE);
               if (var1 == -1) {
                  this.m_3765();
               } else {
                  float var2 = Class_NzJrN63M7QBpmAbi.f_11537.player.getYRot();
                  float var3 = Class_NzJrN63M7QBpmAbi.f_11537.player.getXRot();

                  try {
                     Class_NzJrN63M7QBpmAbi.f_11537.player.setYRot(this.f_10787);
                     Class_NzJrN63M7QBpmAbi.f_11537.player.setXRot(this.f_10788);
                     PvPHelper.this.m_3768(var1);
                     PvPHelper.this.m_3785();
                  } finally {
                     Class_NzJrN63M7QBpmAbi.f_11537.player.setYRot(var2);
                     Class_NzJrN63M7QBpmAbi.f_11537.player.setXRot(var3);
                     this.m_3765();
                  }
               }
            }
         }
      }

      public void m_3765() {
         if (this.f_10785 != -1 && PvPHelper.this.m_3803() && PvPHelper.this.m_3781() != this.f_10785) {
            PvPHelper.this.m_3768(this.f_10785);
         }

         this.m_3763(false);
      }

      public void m_3766() {
         if (PvPHelper.this.m_3803() && !PvPHelper.this.m_3796()) {
            int var1 = PvPHelper.this.m_3792(Items.ENDER_PEARL);
            int var2 = PvPHelper.this.m_3792(Items.WIND_CHARGE);
            if (var1 != -1 && var2 != -1) {
               this.f_10785 = PvPHelper.this.m_3781();
               this.f_10787 = Class_NzJrN63M7QBpmAbi.f_11537.player.getYRot();
               this.f_10788 = Class_NzJrN63M7QBpmAbi.f_11537.player.getXRot();
               this.f_10784 = PvPHelper.OkhYiiEFIBI1DH7e.WAITING_WIND;
               this.f_10786 = 3;
               PvPHelper.this.m_3798(true);
               PvPHelper.this.m_3768(var1);
               Class_NzJrN63M7QBpmAbi.f_11537.options.keyJump.setDown(true);

               try {
                  PvPHelper.this.m_3785();
               } finally {
                  Class_NzJrN63M7QBpmAbi.f_11537.options.keyJump.setDown(false);
               }
            }
         }
      }

      public boolean m_3767() {
         return this.f_10784 != PvPHelper.OkhYiiEFIBI1DH7e.IDLE;
      }
   }

   private enum ukRSkuOhXbEhe0z6 {
      IDLE,
      EQUIP_CHESTPLATE,
      WAIT_CHESTPLATE,
      EQUIP_ELYTRA,
      CONFIRM_ELYTRA,
      RESUME_FLIGHT,
      WAIT_SLOT_RESTORE;
   }
}
