package dev.dimasik.client.module.combat;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_ZPRMV6aCWVosHRWh;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_mZ6Q7gwh7mng3x8m;
import dev.dimasik.client.system.Class_wjdoxQGtI8mFyL6U;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket.Pos;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket.PosRot;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;

public class Criticals extends Module {
   private static final float f_14012 = 0.001F;
   private static final double f_14013 = 1.0E-9;
   private final ItemListSetting f_14014;
   private final CheckboxSetting f_14015;
   private final Class_gEPk7yDw6CwIte87<Class_wjdoxQGtI8mFyL6U> f_14016;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_14017;
   private boolean f_14018;
   private static final String f_14019 = "Criticals";
   private static final String f_14020 = "Позволяет наносить критические удары";
   private static final String f_14021 = "Работать если";
   private static final String f_14022 = "В паутине";
   private static final String f_14023 = "С плавным падением";
   private static final String f_14024 = "Ускорение ударов";
   private static final String f_14025 = "С плавным падением";
   private static final String f_14026 = "В паутине";
   private static final double f_14027 = 1.0E-9;
   private static final String f_14028 = "С плавным падением";
   private static final double f_14029 = 1.0E-9;
   private static final double f_14030 = 0.001F;
   private static final String f_14031 = "С плавным падением";
   private static final float f_14032 = 2.5F;
   private static final double f_14033 = -0.085F;
   private static final double f_14034 = -0.15F;
   private static final float f_14035 = 0.6F;
   private static final String f_14036 = "С плавным падением";

   private void m_5011(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player == null || f_11537.level == null) {
         this.m_5012();
      } else if (f_11537.player.isFallFlying() || f_11537.player.isInWater() || f_11537.player.isInLava()) {
         this.m_5012();
      } else if (DimasikClient.m_9057().m_9049().m_2801().m_3576().m_1114() == null) {
         this.m_5012();
      } else {
         this.m_5014();
      }
   }

   public Criticals() {
      super(f_14019, f_14020, Category.COMBAT);
      this.f_14014 = new ItemListSetting(f_14021, new Class_2ZaVm8TGDJ68TnJB(f_14022, true), new Class_2ZaVm8TGDJ68TnJB(f_14023, true));
      this.f_14015 = new CheckboxSetting(f_14024, false).m_822(() -> this.f_14014.m_7145(f_14036));
      this.f_14016 = this::m_5018;
      this.f_14017 = this::m_5011;
      this.m_795(this.f_14014, this.f_14015);
   }

   private void m_5012() {
      if (this.f_14018) {
         Class_ZPRMV6aCWVosHRWh.m_5820(1.0F);
         this.f_14018 = false;
      }
   }

   @Override
   public void m_732() {
      this.m_5012();
   }

   public boolean m_5013() {
      return this.m_776() && this.f_14014.m_7145(f_14025) && f_11537.player != null && f_11537.player.hasEffect(MobEffects.SLOW_FALLING);
   }

   private void m_5014() {
      if (!this.f_14015.m_8768() || !this.f_14014.m_7145(f_14031)) {
         this.m_5012();
      } else if (f_11537.player.hasEffect(MobEffects.SLOW_FALLING) && !f_11537.player.onGround()) {
         Aura var1 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
         if (var1 != null && var1.m_1114() != null) {
            if (f_11537.player.distanceTo(var1.m_1114()) > f_14032) {
               this.m_5012();
            } else {
               double var2 = f_11537.player.getDeltaMovement().y;
               if (var2 <= f_14033 && var2 >= f_14034) {
                  Class_ZPRMV6aCWVosHRWh.m_5820(f_14035);
                  this.f_14018 = true;
               } else {
                  this.m_5012();
               }
            }
         } else {
            this.m_5012();
         }
      } else {
         this.m_5012();
      }
   }

   private void m_5015() {
      if (f_11537.player.fallDistance <= 0.0) {
         f_11537.player.fallDistance = f_14030;
      }
   }

   private boolean m_5016() {
      if (f_11537.player != null && f_11537.level != null) {
         if (((Class_mZ6Q7gwh7mng3x8m)f_11537.player).dimas$isInWeb()) {
            return true;
         }

         AABB var1 = f_11537.player.getBoundingBox();
         int var2 = Mth.floor(var1.minX);
         int var3 = Mth.floor(var1.minY);
         int var4 = Mth.floor(var1.minZ);
         int var5 = Mth.floor(var1.maxX);
         int var6 = Mth.floor(var1.maxY);
         int var7 = Mth.floor(var1.maxZ);
         MutableBlockPos var8 = new MutableBlockPos();

         for (int var9 = var2; var9 <= var5; var9++) {
            for (int var10 = var3; var10 <= var6; var10++) {
               for (int var11 = var4; var11 <= var7; var11++) {
                  if (f_11537.level.getBlockState(var8.set(var9, var10, var11)).is(Blocks.COBWEB)) {
                     return true;
                  }
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public void m_778() {
      this.f_14018 = false;
   }

   private void m_5018(Class_wjdoxQGtI8mFyL6U var1) {
      if (var1.m_9372() == Class_wjdoxQGtI8mFyL6U.Class_327mRdjAqNoPaemJ.PRE) {
         if (f_11537.player != null && f_11537.level != null) {
            if (var1.m_9370() instanceof LivingEntity) {
               if (!f_11537.player.isFallFlying() && !f_11537.player.isInWater() && !f_11537.player.isInLava()) {
                  double var2 = f_11537.player.getX();
                  double var4 = f_11537.player.getY();
                  double var6 = f_11537.player.getZ();
                  if (this.f_14014.m_7145(f_14026) && this.m_5016()) {
                     f_11537.player.connection.send(new Pos(var2, var4 - f_14027, var6, false, f_11537.player.horizontalCollision));
                     this.m_5015();
                  } else {
                     if (this.f_14014.m_7145(f_14028) && !f_11537.player.onGround() && f_11537.player.hasEffect(MobEffects.SLOW_FALLING)) {
                        f_11537.player
                           .connection
                           .send(
                              new PosRot(
                                 var2, var4 - f_14029, var6, f_11537.player.getYRot(), f_11537.player.getXRot(), false, f_11537.player.horizontalCollision
                              )
                           );
                        this.m_5015();
                     }
                  }
               }
            }
         }
      }
   }
}
