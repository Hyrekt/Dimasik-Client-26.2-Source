package dev.dimasik.client.system;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.SecureRandom;
import lombok.Generated;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;

public final class Class_3VHxwfI2NZKoxzIi {
   private static final double f_1411 = 180.0 / Math.PI;
   private static final double f_1412 = 90.0;
   private static final double f_1413 = 180.0 / Math.PI;
   private static final double f_1414 = 20.0;
   private static final double f_1415 = 0.02F;
   private static final double f_1416 = 0.7;
   private static final double f_1417 = 0.8;
   private static final double f_1418 = 0.1;
   private static final double f_1419 = 3.0;
   private static final double f_1420 = 0.5;
   private static final double f_1421 = 0.5;
   private static final String f_1422 = "This is a utility class and cannot be instantiated";

   public static double m_1300() {
      return Class_NzJrN63M7QBpmAbi.f_11537.getFps() > 0 ? 1.0 / Class_NzJrN63M7QBpmAbi.f_11537.getFps() : 1.0;
   }

   public static float m_1301(float var0, float var1, float var2) {
      return (float)(var0 + (var1 - var0) * Mth.clamp(m_1300() * var2, 0.0, 1.0));
   }

   @Generated
   private Class_3VHxwfI2NZKoxzIi() {
      throw new UnsupportedOperationException(f_1422);
   }

   public static float m_1302(float var0, float var1) {
      SecureRandom var2 = new SecureRandom();
      double var3 = var2.nextDouble();
      double var5 = var2.nextDouble();
      double var7 = var2.nextGaussian() * f_1415;
      double var9 = Math.pow(var3, 1.0 + var2.nextDouble() * f_1416);
      double var11 = (var5 * f_1417 + f_1418) * (Math.log1p(var3 * f_1419) * f_1420 + f_1421);
      return (float)(var0 + (var1 - var0) * var9 * var11 + var7);
   }

   public static Vec3 m_1303(Vec3 var0, Vec3 var1, float var2) {
      return new Vec3(Mth.lerp(var2, var0.x, var1.x), Mth.lerp(var2, var0.y, var1.y), Mth.lerp(var2, var0.z, var1.z));
   }

   public static Vec2 m_1304(Vec3 var0) {
      return m_1310(var0.x, var0.y, var0.z);
   }

   public static Vec3 m_1305(Vec3 var0, Vec3 var1, float var2) {
      return new Vec3(
         m_1311((float)var0.x(), (float)var1.x(), var2), m_1311((float)var0.y(), (float)var1.y(), var2), m_1311((float)var0.z(), (float)var1.z(), var2)
      );
   }

   public static double m_1306(Entity var0) {
      double var1 = var0.getX() - var0.xo;
      double var3 = var0.getY() - var0.yo;
      double var5 = var0.getZ() - var0.zo;
      double var7 = Math.sqrt(var1 * var1 + var3 * var3 + var5 * var5);
      return f_1414 * var7;
   }

   public static Vec3 m_1307(Vec3 var0, AABB var1) {
      return new Vec3(Mth.clamp(var0.x(), var1.minX, var1.maxX), Mth.clamp(var0.y(), var1.minY, var1.maxY), Mth.clamp(var0.z(), var1.minZ, var1.maxZ));
   }

   public static double m_1308(double var0, double var2) {
      double var4 = Math.round(var0 / var2) * var2;
      BigDecimal var6 = new BigDecimal(var4);
      var6 = var6.setScale(2, RoundingMode.HALF_UP);
      return var6.doubleValue();
   }

   public static float m_1309(float var0, float var1, float var2) {
      return Mth.lerp(var2, var0, var1);
   }

   public static Vec2 m_1310(double var0, double var2, double var4) {
      double var6 = var0 - Class_NzJrN63M7QBpmAbi.f_11537.player.getX();
      double var8 = var2 - Class_NzJrN63M7QBpmAbi.f_11537.player.getEyeY();
      double var10 = var4 - Class_NzJrN63M7QBpmAbi.f_11537.player.getZ();
      double var12 = Mth.sqrt((float)(var6 * var6 + var10 * var10));
      float var14 = (float)(Mth.atan2(var10, var6) * f_1411 - f_1412);
      float var15 = (float)(-Mth.atan2(var8, var12) * f_1413);
      return new Vec2(var14, var15);
   }

   public static float m_1311(float var0, float var1, float var2) {
      return (1.0F - Mth.clamp((float)(m_1300() * var2), 0.0F, 1.0F)) * var0 + Mth.clamp((float)(m_1300() * var2), 0.0F, 1.0F) * var1;
   }
}
