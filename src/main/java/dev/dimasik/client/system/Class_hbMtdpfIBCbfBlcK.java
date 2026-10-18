package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.phys.Vec3;

public class Class_hbMtdpfIBCbfBlcK implements Class_NzJrN63M7QBpmAbi {
   private double f_23430;
   private double f_23431;
   private boolean f_23432;
   private boolean f_23433;
   private int f_23434;
   private int f_23435;
   private static final float f_23436 = 0.88F;
   private static final float f_23437 = 0.91F;
   private static final float f_23438 = 0.16277136F;
   private static final float f_23439 = 0.2F;
   private static final float f_23440 = 0.0255F;
   private static final double f_23441 = 0.25;
   private static final double f_23442 = 0.08;
   private static final double f_23443 = 0.055;
   private static final double f_23444 = 0.043;
   private static final double f_23445 = 0.3;
   private static final double f_23446 = 0.019;
   private static final double f_23447 = 0.25;
   private static final double f_23448 = 0.001;
   private static final double f_23449 = 0.002;
   private static final float f_23450 = 1.3F;
   private static final float f_23451 = 0.91F;

   public boolean m_7176() {
      return this.f_23433;
   }

   public void m_7177(double var1) {
      this.f_23430 = var1 * this.f_23431;
   }

   public void m_7178(double var1) {
      this.f_23430 = var1;
   }

   public boolean m_7179() {
      return this.f_23432;
   }

   public void m_7180(boolean var1) {
      this.f_23433 = var1;
   }

   private float m_7181(LocalPlayer var1) {
      boolean var2 = var1.isSprinting();
      var1.setSprinting(false);
      float var3 = var1.getSpeed() * f_23450;
      var1.setSprinting(var2);
      return var3;
   }

   private float m_7182(LocalPlayer var1) {
      BlockPos var2 = BlockPos.containing(var1.getX(), var1.getBoundingBox().minY - 1.0, var1.getZ());
      return var1.level().getBlockState(var2).getBlock().getFriction() * f_23451;
   }

   public double m_7183(Class_EndlYW7bFBb6ZTsy var1, boolean var2, boolean var3, boolean var4, float var5) {
      boolean var6 = f_11537.player.onGround();
      Vec3 var7 = var1.m_2544();
      boolean var8 = var6 && var7.y <= 0.0;
      boolean var9 = var7.y > 0.0;
      float var10 = this.m_7181(f_11537.player);
      float var11 = this.m_7182(f_11537.player);
      float var12 = f_11537.player.hasEffect(MobEffects.JUMP_BOOST) && f_11537.player.isUsingItem() ? f_23436 : f_23437;
      if (var6) {
         var12 = var11;
      }

      float var13 = f_23438 / (var12 * var12 * var12);
      float var14;
      if (var6) {
         var14 = var10 * var13;
         if (var9) {
            var14 += f_23439;
         }
      } else {
         var14 = var2 && var3 && (var4 || f_11537.options.keyJump.isDown()) ? var5 : f_23440;
      }

      boolean var15 = false;
      double var16 = this.f_23430 + var14;
      double var18 = 0.0;
      if (f_11537.player.isUsingItem() && !var9) {
         double var20 = this.f_23430 + var14 * f_23441;
         double var22 = var7.y;
         if (var22 != 0.0 && Math.abs(var22) < f_23442) {
            var20 += f_23443;
         }

         if (var16 > (var18 = Math.max(f_23444, var20))) {
            var15 = true;
            this.f_23435++;
         } else {
            this.f_23435 = Math.max(this.f_23435 - 1, 0);
         }
      } else {
         this.f_23435 = 0;
      }

      if (this.f_23435 > 3) {
         var16 = var18 - (f_11537.player.hasEffect(MobEffects.JUMP_BOOST) && f_11537.player.isUsingItem() ? f_23445 : f_23446);
      } else {
         var16 = Math.max(var15 ? 0.0 : f_23447, var16) - (this.f_23434++ % 2 == 0 ? f_23448 : f_23449);
      }

      this.f_23431 = var12;
      if (!var8 && !var6) {
         this.f_23432 = true;
      }

      if (!var6 && !var8) {
         this.f_23433 = !DimasikClient.m_9057().m_9052().m_6338().m_1499();
      }

      if (var8 && var6) {
         this.f_23433 = false;
      }

      return var16;
   }
}
