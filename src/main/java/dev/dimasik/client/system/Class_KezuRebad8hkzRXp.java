package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.combat.ElytraTarget;
import lombok.Generated;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;

public final class Class_KezuRebad8hkzRXp implements Class_NzJrN63M7QBpmAbi {
   private static int f_10211 = 0;
   private static final float f_10212 = 6.0F;
   private static final String f_10213 = "Перегнал";
   private static final float f_10214 = 1.5F;
   private static final float f_10215 = 0.92F;
   private static final float f_10216 = 6.0F;
   private static final String f_10217 = "Перегнал";
   private static final double f_10218 = 2.0;
   private static final float f_10219 = 1.5F;
   private static final float f_10220 = 0.92F;
   private static final double f_10221 = -1.0E-5;
   private static final double f_10222 = 0.08;
   private static final double f_10223 = 0.98;
   private static final double f_10224 = 0.99;
   private static final double f_10225 = 0.98;
   private static final double f_10226 = 0.99;
   private static final String f_10227 = "This is a utility class and cannot be instantiated";

   public static boolean m_3380(LivingEntity var0, boolean var1, boolean var2, boolean var3, boolean var4, float var5, boolean var6, boolean var7) {
      ElytraTarget var8 = DimasikClient.m_9057().m_9049().m_2801().m_3574();
      if (DimasikClient.m_9057().m_9049().m_2801().m_3460().m_776() || DimasikClient.m_9057().m_9049().m_2801().m_3590().m_776()) {
         var5 = f_10212;
      }

      boolean var9 = var4 && var0.isFallFlying() && var8.m_5078().m_7568(f_10213) && Class_3VHxwfI2NZKoxzIi.m_1306(var0) > var8.m_5076().m_8768().floatValue()
         ? Math.sqrt(f_11537.player.distanceToSqr(var8.m_5099(var0, var0.position().add(0.0, var0.getBbHeight() / 2.0F, 0.0)))) <= var5
         : f_11537.player.distanceTo(var0) <= var5;
      boolean var10 = !var7 || DimasikClient.m_9057().m_9052().m_6340().m_1750() >= f_10211;
      boolean var11 = var9;
      boolean var12 = f_11537.player.getAttackStrengthScale(f_10214) > f_10215;
      boolean var13 = f_11537.player.isInWater() && !f_11537.options.keyJump.isDown();
      boolean var14 = DimasikClient.m_9057().m_9049().m_2801().m_3590().m_776() || DimasikClient.m_9057().m_9049().m_2801().m_3460().m_776();
      boolean var15 = f_11537.player.fallDistance > 0.0
         || ((Class_mZ6Q7gwh7mng3x8m)f_11537.player).dimas$isInWeb()
         || !var1
         || var2 && f_11537.player.onGround() && !f_11537.options.keyJump.isDown();
      boolean var16 = f_11537.player.hasEffect(MobEffects.LEVITATION) || f_11537.player.hasEffect(MobEffects.BLINDNESS);
      boolean var17 = f_11537.player.isInLava() || f_11537.player.onClimbable() || f_11537.player.getAbilities().flying;
      boolean var18 = !var6
         || Class_gJeXlympVy5r92wv.m_6784(
            f_11537.player.getViewYRot(f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true)),
            f_11537.player.getViewXRot(f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true)),
            var5,
            var0,
            false
         );
      boolean var19 = var10
         && var11
         && var12
         && var18
         && (f_11537.player.isEyeInFluid(FluidTags.WATER) || var15 || var17 || var16 || var13 || var14 || f_11537.player.isFallFlying());
      if (var19 && var3) {
         f_10211 = DimasikClient.m_9057().m_9052().m_6340().m_1750() + 10;
      }

      return var19;
   }

   @Generated
   private Class_KezuRebad8hkzRXp() {
      throw new UnsupportedOperationException(f_10227);
   }

   public static int m_3381(LivingEntity var0, boolean var1, boolean var2, boolean var3, float var4, boolean var5, int var6) {
      if (var0 != null && f_11537.player != null && var6 >= 0) {
         ElytraTarget var7 = DimasikClient.m_9057().m_9049().m_2801().m_3574();
         boolean var8 = DimasikClient.m_9057().m_9049().m_2801().m_3590().m_776() || DimasikClient.m_9057().m_9049().m_2801().m_3460().m_776();
         if (var8) {
            var4 = f_10216;
         }

         boolean var9 = f_11537.player.hasEffect(MobEffects.LEVITATION) || f_11537.player.hasEffect(MobEffects.BLINDNESS);
         boolean var10 = f_11537.player.isInLava() || f_11537.player.onClimbable() || f_11537.player.getAbilities().flying;
         boolean var11 = f_11537.player.isInWater() && !f_11537.options.keyJump.isDown();
         Vec3 var12 = f_11537.player.position();
         Vec3 var13 = var0.position();
         Vec3 var14 = f_11537.player.getDeltaMovement();
         Vec3 var15 = var0.getDeltaMovement();
         double var16 = var14.y;
         boolean var18 = f_11537.player.onGround();
         float var19 = (float)f_11537.player.fallDistance;

         for (int var20 = 0; var20 <= var6; var20++) {
            boolean var21 = var3
               && var7.m_5078().m_7568(f_10217)
               && var0.isFallFlying()
               && Class_3VHxwfI2NZKoxzIi.m_1306(var0) > var7.m_5076().m_8768().floatValue();
            Vec3 var22 = var21 ? var7.m_5099(var0, var13.add(0.0, var0.getBbHeight() / f_10218, 0.0)) : var13;
            boolean var23 = var12.distanceTo(var22) <= var4;
            boolean var24 = !var5 || DimasikClient.m_9057().m_9052().m_6340().m_1750() + var20 >= f_10211;
            boolean var25 = f_11537.player.getAttackStrengthScale(f_10219 + var20) > f_10220;
            boolean var26 = var19 > 0.0F || !var18 && var16 < f_10221;
            boolean var27 = var26 || !var1 || var2 && var18 && !f_11537.options.keyJump.isDown();
            boolean var28 = ((Class_mZ6Q7gwh7mng3x8m)f_11537.player).dimas$isInWeb() && var26;
            boolean var29 = f_11537.player.isEyeInFluid(FluidTags.WATER) || var27 || var10 || var9 || var11 || var8 || var28 || f_11537.player.isFallFlying();
            if (var23 && var24 && var25 && var29) {
               return var20;
            }

            if (var20 == var6) {
               break;
            }

            var12 = var12.add(var14);
            var13 = var13.add(var15);
            if (!var18) {
               var16 = (var16 - f_10222) * f_10223;
               var14 = new Vec3(var14.x, var16, var14.z);
               if (var16 < 0.0) {
                  var19 += (float)(-var16);
               }
            }

            var15 = var15.multiply(f_10224, f_10225, f_10226);
         }

         return -1;
      } else {
         return -1;
      }
   }
}
