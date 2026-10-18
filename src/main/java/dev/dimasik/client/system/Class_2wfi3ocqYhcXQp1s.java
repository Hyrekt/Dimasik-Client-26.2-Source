package dev.dimasik.client.system;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction.Axis;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.VoxelShape;

public final class Class_2wfi3ocqYhcXQp1s implements Class_NzJrN63M7QBpmAbi {
   private static final double f_1237 = 28.0;
   private static final double f_1238 = 0.025;
   private static final int f_1239 = 8;
   private double f_1240;
   private double f_1241;
   private double f_1242;
   private double f_1243;
   private double f_1244;
   private double f_1245;
   private float f_1246;
   private float f_1247;
   private boolean f_1248;
   private static final double f_1249 = 28.0;
   private static final double f_1250 = 0.025;
   private static final double f_1251 = 1.12;
   private static final double f_1252 = 0.012;
   private static final double f_1253 = 0.34;
   private static final float f_1254 = 0.28F;
   private static final float f_1255 = 0.18F;
   private static final float f_1256 = 180.0F;
   private static final float f_1257 = 0.08F;
   private static final double f_1258 = 0.35;
   private static final double f_1259 = -0.42;
   private static final double f_1260 = 0.42;
   private static final double f_1261 = 0.45;
   private static final double f_1262 = 0.001;
   private static final long f_1263 = 13L;
   private static final double f_1264 = 0.045;
   private static final double f_1265 = 0.42;
   private static final double f_1266 = 0.9;
   private static final double f_1267 = 0.78;
   private static final double f_1268 = 0.55;
   private static final float f_1269 = 180.0F;
   private static final float f_1270 = 360.0F;
   private static final float f_1271 = 540.0F;
   private static final float f_1272 = 360.0F;
   private static final float f_1273 = 180.0F;

   private Vec3 m_1204(LivingEntity var1, float var2) {
      if (var1 != null) {
         return this.m_1207(var1, var2);
      }

      float var3 = (float)Math.toRadians(f_11537.player.getYRot());
      double var4 = -var2;
      double var6 = var2 * f_1261;
      double var8 = f_11537.player.getX() - Math.sin(var3) * var4 + Math.cos(var3) * var6;
      double var10 = f_11537.player.getZ() + Math.cos(var3) * var4 + Math.sin(var3) * var6;
      return new Vec3(var8, this.m_1212(var8, f_11537.player.getY(), var10), var10);
   }

   private float m_1205(float var1, float var2, float var3) {
      float var4 = ((var2 - var1) % f_1270 + f_1271) % f_1272 - f_1273;
      return var1 + var4 * var3;
   }

   private void m_1206(Vec3 var1, LivingEntity var2) {
      this.f_1240 = var1.x;
      this.f_1241 = var1.y;
      this.f_1242 = var1.z;
      this.f_1246 = var2 != null ? this.m_1210(var2.getX() - this.f_1240, var2.getZ() - this.f_1242) : f_1269 - f_11537.player.getYRot();
      this.f_1243 = this.f_1240;
      this.f_1244 = this.f_1241;
      this.f_1245 = this.f_1242;
      this.f_1247 = this.f_1246;
   }

   private Vec3 m_1207(LivingEntity var1, float var2) {
      double var3 = var1.getX() - f_11537.player.getX();
      double var5 = var1.getZ() - f_11537.player.getZ();
      double var7 = Math.sqrt(var3 * var3 + var5 * var5);
      if (var7 < f_1262) {
         float var9 = (float)Math.toRadians(f_11537.player.getYRot());
         var3 = -Math.sin(var9);
         var5 = Math.cos(var9);
         var7 = 1.0;
      }

      double var23 = var3 / var7;
      double var11 = var5 / var7;
      double var13 = (f_11537.level.getGameTime() + var1.getId() * f_1263) * f_1264;
      double var15 = Math.sin(var13) * f_1265;
      double var17 = Math.max(f_1266, var2 * f_1267 + var1.getBbWidth() * f_1268);
      double var19 = var1.getX() - var23 * var17 - var11 * var15;
      double var21 = var1.getZ() - var11 * var17 + var23 * var15;
      return new Vec3(var19, this.m_1212(var19, var1.getY(), var21), var21);
   }

   public double m_1208(float var1) {
      return Mth.lerp(var1, this.f_1245, this.f_1242);
   }

   public double m_1209(float var1) {
      return Mth.lerp(var1, this.f_1244, this.f_1241);
   }

   private float m_1210(double var1, double var3) {
      return (float)Math.toDegrees(Math.atan2(-var1, -var3));
   }

   public double m_1211(float var1) {
      return Mth.lerp(var1, this.f_1243, this.f_1240);
   }

   private double m_1212(double var1, double var3, double var5) {
      int var7 = Mth.floor(var3);

      for (int var8 = 0; var8 >= -8; var8--) {
         BlockPos var9 = BlockPos.containing(var1, var7 + var8, var5);
         BlockState var10 = f_11537.level.getBlockState(var9);
         VoxelShape var11 = var10.getCollisionShape(f_11537.level, var9);
         if (!var11.isEmpty()) {
            return var9.getY() + var11.max(Axis.Y);
         }
      }

      return var3;
   }

   public boolean m_1213() {
      return this.f_1248;
   }

   public float m_1214(float var1) {
      return this.m_1205(this.f_1247, this.f_1246, var1);
   }

   public double m_1215(LivingEntity var1, float var2, float var3) {
      Vec3 var4 = this.m_1204(var1, var3);
      if (!this.f_1248) {
         this.m_1206(var4, var1);
         this.f_1248 = true;
         return 0.0;
      }

      this.f_1243 = this.f_1240;
      this.f_1244 = this.f_1241;
      this.f_1245 = this.f_1242;
      this.f_1247 = this.f_1246;
      double var5 = var4.x - this.f_1240;
      double var7 = var4.y - this.f_1241;
      double var9 = var4.z - this.f_1242;
      double var11 = Math.sqrt(var5 * var5 + var9 * var9);
      if (Math.sqrt(var5 * var5 + var7 * var7 + var9 * var9) > f_1249) {
         this.m_1206(var4, var1);
         return 0.0;
      }

      if (var11 > f_1250) {
         double var13 = var2 * (var1 != null ? f_1251 : 1.0);
         double var15 = Math.min(var11, Math.min(var13, Math.max(f_1252, var11 * f_1253)));
         this.f_1240 += var5 / var11 * var15;
         this.f_1242 += var9 / var11 * var15;
         this.f_1246 = this.m_1205(this.f_1246, this.m_1210(var5, var9), f_1254);
      } else if (var1 != null) {
         this.f_1246 = this.m_1205(this.f_1246, this.m_1210(var1.getX() - this.f_1240, var1.getZ() - this.f_1242), f_1255);
      } else {
         this.f_1246 = this.m_1205(this.f_1246, f_1256 - f_11537.player.getYRot(), f_1257);
      }

      this.f_1241 = this.f_1241 + Mth.clamp(var7 * f_1258, f_1259, f_1260);
      return Math.sqrt((this.f_1240 - this.f_1243) * (this.f_1240 - this.f_1243) + (this.f_1242 - this.f_1245) * (this.f_1242 - this.f_1245));
   }

   public void m_1216() {
      this.f_1248 = false;
   }
}
