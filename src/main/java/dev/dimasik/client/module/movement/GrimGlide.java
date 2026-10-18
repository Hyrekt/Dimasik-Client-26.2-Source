package dev.dimasik.client.module.movement;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_3LQSDrJ0WJYOQ7ck;
import dev.dimasik.client.system.Class_MACPHdFZqVYaxUay;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_ZPRMV6aCWVosHRWh;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_lTzchJDbvRVrnXlw;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket.StatusOnly;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.phys.Vec3;

public class GrimGlide extends Module {
   private final SliderSetting f_14751;
   private final SliderSetting f_14752;
   private int f_14753;
   private boolean f_14754;
   private int f_14755;
   private boolean f_14756;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_14757;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_14758;
   private final Class_gEPk7yDw6CwIte87<Class_MACPHdFZqVYaxUay> f_14759;
   private final Class_gEPk7yDw6CwIte87<Class_lTzchJDbvRVrnXlw> f_14760;
   private static final String f_14761 = "GrimGlide";
   private static final String f_14762 = "Ускоряет полёт на элитрах без фейерверков";
   private static final String f_14763 = "Timer Boost";
   private static final float f_14764 = 1.5F;
   private static final float f_14765 = 5.0F;
   private static final float f_14766 = 0.1F;
   private static final String f_14767 = "Сброс таймера";
   private static final float f_14768 = 0.5F;
   private static final float f_14769 = 0.9F;
   private static final float f_14770 = 0.01F;
   private static final float f_14771 = (float) (Math.PI / 180.0);
   private static final double f_14772 = 0.01;
   private static final double f_14773 = -1.0;
   private static final double f_14774 = 0.75;
   private static final double f_14775 = -0.1;
   private static final double f_14776 = 0.04F;
   private static final double f_14777 = 3.2;
   private static final double f_14778 = 0.1;
   private static final double f_14779 = 0.1;
   private static final double f_14780 = 0.09F;
   private static final double f_14781 = 0.99F;
   private static final double f_14782 = 0.98F;
   private static final double f_14783 = 0.99F;
   private static final double f_14784 = 0.03F;
   private static final double f_14785 = 0.3F;
   private static final double f_14786 = 0.3F;
   private static final double f_14787 = 0.3F;

   @Override
   public void m_778() {
      this.f_14753 = 0;
      this.f_14754 = false;
      this.f_14755 = 0;
      this.f_14756 = false;
   }

   public GrimGlide() {
      super(f_14761, f_14762, Category.MOVEMENT);
      this.f_14751 = new SliderSetting(f_14763, f_14764, 1.0F, f_14765).m_828(f_14766);
      this.f_14752 = new SliderSetting(f_14767, f_14768, 0.0F, f_14769).m_828(f_14770);
      this.f_14757 = this::m_5240;
      this.f_14758 = this::m_5237;
      this.f_14759 = this::m_5239;
      this.f_14760 = this::m_5238;
      this.m_795(this.f_14751, this.f_14752);
   }

   private void m_5236() {
      boolean var1 = f_11537.player != null && f_11537.player.isFallFlying();
      if (!var1) {
         if (this.f_14756) {
            Class_ZPRMV6aCWVosHRWh.m_5820(1.0F);
            this.f_14756 = false;
         }
      } else {
         Class_ZPRMV6aCWVosHRWh.m_5820(this.f_14755 % 2 == 0 ? this.f_14751.m_8768() : this.f_14752.m_8768());
         this.f_14756 = true;
         this.f_14755++;
      }
   }

   public void m_5237(Class_XzpX8S5F5zd9jbuE var1) {
      if (var1.m_5619() instanceof ClientboundPlayerPositionPacket) {
         this.f_14753 = 2;
         this.f_14754 = true;
         if (this.f_14755 % 2 == 1) {
            this.f_14755++;
         }
      }
   }

   public void m_5238(Class_lTzchJDbvRVrnXlw var1) {
      if (var1.m_7532() instanceof ServerboundMovePlayerPacket) {
         if (f_11537.player.isFallFlying() && this.f_14753 == 0 && !this.f_14754) {
            Class_3LQSDrJ0WJYOQ7ck.m_1293(new StatusOnly(true, true));
            var1.m_1582(true);
         }

         this.f_14754 = false;
      }
   }

   @Override
   public void m_732() {
      if (this.f_14756) {
         Class_ZPRMV6aCWVosHRWh.m_5820(1.0F);
         this.f_14756 = false;
      }
   }

   public void m_5239(Class_MACPHdFZqVYaxUay var1) {
      Vec3 var2 = f_11537.player.getDeltaMovement();
      Vec3 var3 = f_11537.player.getLookAngle();
      float var4 = f_11537.player.getXRot() * f_14771;
      double var5 = Math.sqrt(var3.x * var3.x + var3.z * var3.z);
      double var7 = var2.horizontalDistance();
      boolean var9 = f_11537.player.getDeltaMovement().y <= 0.0;
      double var10 = var9 && f_11537.player.hasEffect(MobEffects.SLOW_FALLING) ? Math.min(f_11537.player.getGravity(), f_14772) : f_11537.player.getGravity();
      double var12 = Mth.square(Math.cos(var4));
      var2 = var2.add(0.0, var10 * (f_14773 + var12 * f_14774), 0.0);
      if (var2.y < 0.0 && var5 > 0.0) {
         double var14 = var2.y * f_14775 * var12;
         var2 = var2.add(var3.x * var14 / var5, var14, var3.z * var14 / var5);
      }

      if (var4 < 0.0F && var5 > 0.0) {
         double var25 = var7 * -Mth.sin(var4) * f_14776;
         var2 = var2.add(-var3.x * var25 / var5, var25 * f_14777, -var3.z * var25 / var5);
      }

      if (var5 > 0.0) {
         var2 = var2.add((var3.x / var5 * var7 - var2.x) * f_14778, 0.0, (var3.z / var5 * var7 - var2.z) * f_14779);
      }

      double var16 = Math.toRadians(f_11537.player.getYRot());
      double var18 = -Math.sin(var16);
      double var20 = Math.cos(var16);
      if (this.f_14753 >= 1) {
         double var22 = f_14780;
         var1.m_3883(var2.multiply(f_14781, f_14782, f_14783).add(var18 * var22, f_14784, var20 * var22));
      } else {
         var1.m_3883(var2.multiply(f_14785, f_14786, f_14787));
      }
   }

   public void m_5240(Class_Xu9btcIeUN33XnMK var1) {
      if (this.f_14753 > 0) {
         this.f_14753--;
      }

      this.m_5236();
   }
}
