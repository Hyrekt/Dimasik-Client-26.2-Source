package dev.dimasik.client.module.movement;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.module.combat.Aura;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_EndlYW7bFBb6ZTsy;
import dev.dimasik.client.system.Class_NzJrN63M7QBpmAbi;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_hbMtdpfIBCbfBlcK;
import dev.dimasik.client.system.Class_lTzchJDbvRVrnXlw;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundEntityEventPacket;
import net.minecraft.network.protocol.game.ClientboundExplodePacket;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerCommandPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerCommandPacket.Action;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoulSandBlock;
import net.minecraft.world.phys.Vec3;

public class TargetStrafe extends Module {
   private final SliderSetting f_4112;
   private final SliderSetting f_4113;
   private final CheckboxSetting f_4114;
   private final SliderSetting f_4115;
   private final SliderSetting f_4116;
   private final CheckboxSetting f_4117;
   private float f_4118;
   private LivingEntity f_4119;
   private final TargetStrafe.eyT7tTIi0wVo1f5V f_4120;
   private String f_4121;
   private final Class_hbMtdpfIBCbfBlcK f_4122;
   private final List<Packet<?>> f_4123;
   private final Class_gEPk7yDw6CwIte87<Class_EndlYW7bFBb6ZTsy> f_4124;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_4125;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_4126;
   private final Class_gEPk7yDw6CwIte87<Class_lTzchJDbvRVrnXlw> f_4127;
   private static final String f_4128 = "TargetStrafe";
   private static final String f_4129 = "Стрейф вокруг цели ауры";
   private static final String f_4130 = "Дистанция";
   private static final float f_4131 = 0.1F;
   private static final float f_4132 = 6.0F;
   private static final float f_4133 = 0.05F;
   private static final String f_4134 = "Скорость";
   private static final float f_4135 = -0.1F;
   private static final float f_4136 = 0.5F;
   private static final float f_4137 = 0.01F;
   private static final String f_4138 = "Буст с дамагом";
   private static final String f_4139 = "Значение буста";
   private static final float f_4140 = 1.5F;
   private static final float f_4141 = 0.1F;
   private static final float f_4142 = 5.0F;
   private static final float f_4143 = 0.05F;
   private static final String f_4144 = "Время буста";
   private static final float f_4145 = 10.0F;
   private static final float f_4146 = 20.0F;
   private static final String f_4147 = "Сохранять цель";
   private static final float f_4148 = -1.0F;
   private static final float f_4149 = -1.0F;
   private static final long f_4150 = 100L;
   private static final float f_4151 = 10.0F;
   private static final double f_4152 = 90.0;

   private boolean m_1820(BlockPos var1) {
      return f_11537.level.getBlockState(var1).is(Blocks.COBWEB) || f_11537.level.getBlockState(var1.below()).getBlock() instanceof SoulSandBlock;
   }

   private void m_1821(Class_EndlYW7bFBb6ZTsy var1) {
      if (f_11537.player != null && f_11537.level != null && f_11537.player.tickCount >= 10) {
         boolean var2 = f_11537.options.keyLeft.isDown();
         boolean var3 = f_11537.options.keyRight.isDown();
         LivingEntity var4 = this.m_1822();
         if (var4 != null) {
            this.f_4121 = var4.getName().getString();
         }

         if (this.m_1830(var4)) {
            this.f_4119 = this.m_1824(this.f_4119);
         } else {
            this.f_4119 = var4;
         }

         if (this.f_4119 != null && this.f_4119.isAlive() && this.f_4119.getHealth() > 0.0F) {
            if (f_11537.player.horizontalCollision) {
               this.f_4118 = this.f_4118 * f_4148;
            }

            if (var2) {
               this.f_4118 = 1.0F;
            }

            if (var3) {
               this.f_4118 = f_4149;
            }

            double var5 = Math.atan2(f_11537.player.getZ() - this.f_4119.getZ(), f_11537.player.getX() - this.f_4119.getX());
            double var7 = Math.hypot(f_11537.player.getDeltaMovement().x, f_11537.player.getDeltaMovement().z);
            var5 += var7 / Math.max(f_11537.player.distanceTo(this.f_4119), this.f_4112.m_824()) * this.f_4118;
            double var9 = this.f_4119.getX() + this.f_4112.m_8768().floatValue() * Math.cos(var5);
            double var11 = this.f_4119.getZ() + this.f_4112.m_8768().floatValue() * Math.sin(var5);
            double var13 = this.m_1823(f_11537.player, var9, var11);
            this.f_4120.m_1819(this.f_4116.m_8768().longValue() * f_4150);
            float var15 = this.f_4115.m_8768() / f_4151;
            double var16 = this.f_4122.m_7183(var1, this.f_4114.m_8768(), this.f_4120.m_1815(), true, var15) + this.f_4113.m_8768().floatValue();
            Vec3 var18 = var1.m_2544();
            var1.m_2545(new Vec3(var16 * -Math.sin(Math.toRadians(var13)), var18.y, var16 * Math.cos(Math.toRadians(var13))));
            this.f_4122.m_7177(Math.hypot(var1.m_2544().x, var1.m_2544().z));
         }
      }
   }

   public TargetStrafe() {
      super(f_4128, f_4129, Category.MOVEMENT);
      this.f_4112 = new SliderSetting(f_4130, 1.0F, f_4131, f_4132).m_828(f_4133);
      this.f_4113 = new SliderSetting(f_4134, 0.0F, f_4135, f_4136).m_828(f_4137);
      this.f_4114 = new CheckboxSetting(f_4138, true);
      this.f_4115 = new SliderSetting(f_4139, f_4140, f_4141, f_4142).m_828(f_4143).m_822(this.f_4114::m_8768);
      this.f_4116 = new SliderSetting(f_4144, f_4145, 1.0F, f_4146).m_828(1.0F).m_822(this.f_4114::m_8768);
      this.f_4117 = new CheckboxSetting(f_4147, true);
      this.f_4118 = 1.0F;
      this.f_4120 = new TargetStrafe.eyT7tTIi0wVo1f5V();
      this.f_4121 = "";
      this.f_4122 = new Class_hbMtdpfIBCbfBlcK();
      this.f_4123 = new ArrayList<>();
      this.f_4124 = this::m_1821;
      this.f_4125 = this::m_1827;
      this.f_4126 = this::m_1825;
      this.f_4127 = this::m_1831;
      this.m_795(this.f_4112, this.f_4113, this.f_4117, this.f_4114, this.f_4115, this.f_4116);
   }

   private LivingEntity m_1822() {
      Aura var1 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
      return var1 != null && var1.m_776() ? var1.m_1114() : null;
   }

   private double m_1823(LivingEntity var1, double var2, double var4) {
      return Math.toDegrees(Math.atan2(var4 - var1.getZ(), var2 - var1.getX())) - f_4152;
   }

   private LivingEntity m_1824(LivingEntity var1) {
      for (Entity var3 : f_11537.level.entitiesForRendering()) {
         if (var3 instanceof Player && var3.getName().getString().equalsIgnoreCase(this.f_4121)) {
            return (LivingEntity)var3;
         }
      }

      return var1;
   }

   private void m_1825(Class_XzpX8S5F5zd9jbuE var1) {
      if (f_11537.player != null && f_11537.level != null) {
         this.f_4120.m_1816(var1);
         if (var1.m_5619() instanceof ClientboundPlayerPositionPacket) {
            this.f_4122.m_7178(0.0);
         }
      }
   }

   private void m_1826(boolean var1) {
      ServerboundPlayerCommandPacket var2 = new ServerboundPlayerCommandPacket(f_11537.player, var1 ? Action.START_SPRINTING : Action.STOP_SPRINTING);
      this.f_4123.add(var2);
      f_11537.player.connection.send(var2);
   }

   @Override
   public void m_778() {
      this.f_4122.m_7178(0.0);
      this.f_4119 = null;
      super.m_778();
   }

   private void m_1827(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player.onGround() && !f_11537.options.keyJump.isDown() && this.f_4119 != null && this.f_4119.isAlive()) {
         f_11537.player.jumpFromGround();
      }
   }

   public boolean m_1828() {
      if (this.m_1832()) {
         return false;
      }

      BlockPos var1 = f_11537.player.blockPosition();
      BlockPos var2 = var1.above();
      BlockPos var3 = var1.below();
      return this.m_1833(var2, var3) ? false : !this.m_1820(var1) && this.m_1829();
   }

   private boolean m_1829() {
      return !f_11537.player.getAbilities().flying && !f_11537.player.hasEffect(MobEffects.LEVITATION);
   }

   private boolean m_1830(LivingEntity var1) {
      Aura var2 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
      return this.f_4117.m_8768() && var1 != null && this.f_4121 != null && var2 != null && var2.m_776();
   }

   private void m_1831(Class_lTzchJDbvRVrnXlw var1) {
      if (f_11537.player != null && f_11537.level != null && var1.m_7532() instanceof ServerboundPlayerCommandPacket var2) {
         if (var2.getAction() == Action.START_SPRINTING || var2.getAction() == Action.STOP_SPRINTING) {
            if (!this.f_4123.remove(var1.m_7532())) {
               boolean var4 = DimasikClient.m_9057().m_9052().m_6338().m_1499();
               if (this.m_1828() && var4 != this.f_4122.m_7176()) {
                  var1.m_1582(true);
                  this.m_1826(this.f_4122.m_7176());
               } else {
                  if (this.f_4122.m_7179()) {
                     var1.m_1582(true);
                     this.m_1826(!var4);
                     this.f_4122.m_7180(false);
                  }
               }
            }
         }
      }
   }

   private boolean m_1832() {
      return f_11537.player == null
         || f_11537.level == null
         || f_11537.player.isShiftKeyDown()
         || f_11537.player.isFallFlying()
         || f_11537.player.isInWater()
         || f_11537.player.isInLava();
   }

   private boolean m_1833(BlockPos var1, BlockPos var2) {
      return f_11537.level.getBlockState(var1).isAir() && f_11537.level.getBlockState(var2).is(Blocks.WATER);
   }

   private static class eyT7tTIi0wVo1f5V implements Class_NzJrN63M7QBpmAbi {
      public long f_4106 = System.currentTimeMillis();
      public boolean f_4107;
      public boolean f_4108;
      public boolean f_4109;
      public boolean f_4110;
      public boolean f_4111;

      public eyT7tTIi0wVo1f5V() {
      }

      public boolean m_1815() {
         return this.f_4107;
      }

      public void m_1816(Class_XzpX8S5F5zd9jbuE var1) {
         boolean var2 = this.f_4108 || this.f_4110 || this.f_4109 || this.f_4111;
         if (!this.m_1817()) {
            if (var1.m_5619() instanceof ClientboundExplodePacket) {
               this.f_4109 = true;
            }

            if (!var2) {
               if (var1.m_5619() instanceof ClientboundEntityEventPacket var3 && var3.getEventId() == 2 && var3.getEntity(f_11537.level) == f_11537.player) {
                  this.f_4107 = true;
               }
            } else if (f_11537.player.hurtTime > 0) {
               this.f_4107 = false;
               this.m_1818();
            }
         }
      }

      public boolean m_1817() {
         return f_11537.player != null
            && (
               f_11537.player.hasEffect(MobEffects.POISON)
                  || f_11537.player.hasEffect(MobEffects.WITHER)
                  || f_11537.player.hasEffect(MobEffects.INSTANT_DAMAGE)
            );
      }

      public void m_1818() {
         this.f_4108 = false;
         this.f_4109 = false;
         this.f_4110 = false;
         this.f_4111 = false;
      }

      public boolean m_1819(long var1) {
         if (this.f_4107) {
            if (System.currentTimeMillis() - this.f_4106 > var1) {
               this.f_4107 = false;
               this.f_4106 = System.currentTimeMillis();
               return true;
            }
         } else {
            this.f_4106 = System.currentTimeMillis();
         }

         return false;
      }
   }
}
