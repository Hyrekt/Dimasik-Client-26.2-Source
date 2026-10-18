package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.combat.Aura;
import java.util.Random;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;
import org.joml.Vector2f;

public class Class_O826E9xWqxKIwYHX extends Class_kkp256olqZ4F1qt3 {
   private final Random f_11549 = new Random();
   private long f_11550;
   private boolean f_11551 = true;
   private static final String f_11552 = "Дефенсив";
   private static final String f_11553 = "Джиттер";
   private static final String f_11554 = "Джиттер";
   private static final float f_11555 = -90.0F;
   private static final float f_11556 = 90.0F;
   private static final float f_11557 = 2.1F;
   private static final double f_11558 = 2.0;
   private static final double f_11559 = 0.1;
   private static final float f_11560 = 3.0F;
   private static final double f_11561 = 0.5;
   private static final double f_11562 = 0.05;
   private static final double f_11563 = 1.5;
   private static final double f_11564 = 0.5;
   private static final double f_11565 = 6.0;
   private static final float f_11566 = 90.0F;
   private static final float f_11567 = -90.0F;
   private static final float f_11568 = 90.0F;
   private static final double f_11569 = 90.0;
   private static final double f_11570 = 90.0;
   private static final double f_11571 = 90.0;
   private static final float f_11572 = 89.0F;
   private static final float f_11573 = 180.0F;
   private static final float f_11574 = 18.0F;
   private static final float f_11575 = 15.0F;
   private static final float f_11576 = -89.0F;
   private static final float f_11577 = 89.0F;
   private static final float f_11578 = -89.0F;
   private static final float f_11579 = 89.0F;
   private static final long f_11580 = 80L;
   private static final long f_11581 = 80L;
   private static final float f_11582 = -90.0F;
   private static final float f_11583 = 85.0F;
   private static final double f_11584 = 0.9;
   private static final double f_11585 = 0.5;
   private static final double f_11586 = 0.1;
   private static final double f_11587 = 90.0;
   private static final float f_11588 = 0.001F;
   private static final float f_11589 = 0.001F;
   private static final float f_11590 = -90.0F;
   private static final float f_11591 = 90.0F;

   private boolean m_4039(LivingEntity var1) {
      if (var1 != null && f_11537.player != null && f_11537.level != null) {
         Vec3 var2 = f_11537.player.getEyePosition(f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true));
         double var3 = var1.getX();
         double var5 = var1.getY();
         double var7 = var1.getZ();
         Vec3[] var9 = new Vec3[]{
            new Vec3(var3, var5 + var1.getBbHeight() * f_11584, var7),
            new Vec3(var3, var5 + var1.getBbHeight() * f_11585, var7),
            new Vec3(var3, var5 + var1.getBbHeight() * f_11586, var7)
         };

         for (Vec3 var13 : var9) {
            ClipContext var14 = new ClipContext(var2, var13, Block.COLLIDER, Fluid.NONE, f_11537.player);
            if (f_11537.level.clip(var14).getType() == Type.MISS) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private Aura m_4040() {
      return DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null
         ? DimasikClient.m_9057().m_9049().m_2801().m_3576()
         : null;
   }

   @Override
   public Vector2f m_1007() {
      Aura var1 = this.m_4040();
      LivingEntity var2 = var1 != null ? var1.m_1114() : null;
      if (var1 != null && var2 != null && f_11537.player != null) {
         if (var1.m_1102().m_7568(f_11552)) {
            return this.m_4047(var2);
         } else {
            return var1.m_1102().m_7568(f_11553) ? this.m_4046(var2) : this.m_4041(var1, var2);
         }
      } else {
         return super.m_1007();
      }
   }

   private Vector2f m_4041(Aura var1, LivingEntity var2) {
      Vec3 var3 = f_11537.player.getEyePosition();
      float var4 = var1.m_1031().m_8768();
      double var5 = var2.getX() + (var2.getX() - var2.xo) * var4;
      double var7 = var2.getZ() + (var2.getZ() - var2.zo) * var4;
      float var9 = f_11557;
      double var10 = (Math.sin((double)System.currentTimeMillis() / var9) + 1.0) / f_11558;
      double var12 = var2.getEyeHeight(var2.getPose()) * f_11559;
      double var14 = var2.getEyeHeight(var2.getPose()) * f_11560;
      double var16 = var2.getY() + var12 + (var14 - var12) * var10;
      var16 += (Math.random() - f_11561) * f_11562;
      if (!this.m_4039(var2)) {
         double var18 = var3.distanceTo(var2.position());
         double var20 = Math.min(f_11563, Math.max(f_11564, var18 / f_11565));
         var16 = var2.getY() + var2.getBbHeight() + var20;
      }

      double var30 = var5 - var3.x;
      double var31 = var16 - var3.y;
      double var22 = var7 - var3.z;
      double var24 = Math.sqrt(var30 * var30 + var22 * var22);
      float var26 = f_11537.player.getYRot() + Mth.wrapDegrees((float)Math.toDegrees(Math.atan2(var22, var30)) - f_11566 - f_11537.player.getYRot());
      float var27 = Mth.clamp((float)(-Math.toDegrees(Math.atan2(var31, var24))), f_11567, f_11568);
      float[] var28 = this.m_4043(var26, var27, var2);
      return new Vector2f(var28[0], var28[1]);
   }

   @Override
   public Vector2f m_1006(Vector2f var1, Vector2f var2) {
      Aura var3 = this.m_4040();
      if (var3 != null && var3.m_1102().m_7568(f_11554)) {
         LivingEntity var4 = var3.m_1114();
         return this.m_4044(var1, var2, var4 != null && this.m_4039(var4));
      } else {
         return this.m_4048(var1, this.m_4045(var1.x, var2.x), Mth.clamp(var2.y, f_11555, f_11556));
      }
   }

   private float m_4042() {
      long var1 = System.currentTimeMillis();
      if (this.f_11550 == 0L) {
         this.f_11551 = true;
         this.f_11550 = var1 + f_11580;
      } else if (var1 >= this.f_11550) {
         this.f_11551 = !this.f_11551;
         this.f_11550 = var1 + f_11581;
      }

      return this.f_11551 ? f_11582 : f_11583;
   }

   private float[] m_4043(float var1, float var2, LivingEntity var3) {
      Vec3 var4 = f_11537.player.getEyePosition();
      AABB var5 = var3.getBoundingBox();
      float var6 = Float.POSITIVE_INFINITY;
      float var7 = Float.NEGATIVE_INFINITY;
      float var8 = Float.POSITIVE_INFINITY;
      float var9 = Float.NEGATIVE_INFINITY;

      for (double var13 : new double[]{var5.minX, var5.maxX}) {
         for (double var18 : new double[]{var5.minY, var5.maxY}) {
            for (double var23 : new double[]{var5.minZ, var5.maxZ}) {
               Vec3 var25 = new Vec3(var13, var18, var23).subtract(var4);
               float var26 = (float)Mth.wrapDegrees(Math.toDegrees(Math.atan2(var25.z, var25.x)) - f_11587);
               float var27 = (float)(-Math.toDegrees(Math.atan2(var25.y, Math.sqrt(var25.x * var25.x + var25.z * var25.z))));
               var6 = Math.min(var6, var26);
               var7 = Math.max(var7, var26);
               var8 = Math.min(var8, var27);
               var9 = Math.max(var9, var27);
            }
         }
      }

      return new float[]{Mth.clamp(var1, var6, var7), Mth.clamp(var2, var8, var9)};
   }

   private Vector2f m_4044(Vector2f var1, Vector2f var2, boolean var3) {
      int var4 = this.f_11549.nextInt(1) + 1;
      float var5 = Math.min(Math.max(Math.abs(Mth.wrapDegrees(var2.x - var1.x)), 1.0F), f_11573);
      float var7;
      if (var3) {
         float var6 = Math.max(Math.abs(Mth.wrapDegrees(var2.y - var1.y) - f_11574), f_11575 + var4);
         var7 = Mth.clamp(var1.y + (Mth.wrapDegrees(var2.y - var1.y) > 0.0F ? var6 : -var6), f_11576, f_11577);
      } else {
         float var9 = Math.max(Math.abs(var2.y - var1.y), 1.0F);
         var7 = Mth.clamp(var1.y + (var2.y > var1.y ? var9 : -var9), f_11578, f_11579);
      }

      float var8 = var1.x + (Mth.wrapDegrees(var2.x - var1.x) > 0.0F ? var5 : -var5);
      return new Vector2f(var8, var7);
   }

   private float m_4045(float var1, float var2) {
      return var1 + Mth.wrapDegrees(var2 - var1);
   }

   private Vector2f m_4046(LivingEntity var1) {
      float var2 = f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true);
      Vec3 var3 = f_11537.player.getEyePosition(var2);
      Vec3 var4 = var1.getPosition(var2);
      AABB var5 = var1.getBoundingBox();
      float var6 = Float.POSITIVE_INFINITY;
      float var7 = Float.NEGATIVE_INFINITY;
      float var8 = Float.POSITIVE_INFINITY;
      float var9 = Float.NEGATIVE_INFINITY;

      for (double var13 : new double[]{var5.minX, var5.maxX}) {
         for (double var18 : new double[]{var5.minY, var5.maxY}) {
            for (double var23 : new double[]{var5.minZ, var5.maxZ}) {
               Vec3 var25 = new Vec3(var13, var18, var23).subtract(var3);
               float var26 = (float)Mth.wrapDegrees(Math.toDegrees(Math.atan2(var25.z, var25.x)) - f_11570);
               float var27 = (float)(-Math.toDegrees(Math.atan2(var25.y, Math.hypot(var25.x, var25.z))));
               var6 = Math.min(var6, var26);
               var7 = Math.max(var7, var26);
               var8 = Math.min(var8, var27);
               var9 = Math.max(var9, var27);
            }
         }
      }

      Vec3 var28 = var4.subtract(var3);
      float var29 = (float)Mth.wrapDegrees(Math.toDegrees(Math.atan2(var28.z, var28.x)) - f_11571);
      float var31 = (float)(-Math.toDegrees(Math.atan2(var28.y, Math.hypot(var28.x, var28.z))));
      var29 = Mth.clamp(var29, var6, var7);
      var31 = Mth.clamp(var31, var8, var9);
      if (!this.m_4039(var1)) {
         var31 = f_11572;
      }

      return new Vector2f(var29, var31);
   }

   public Class_O826E9xWqxKIwYHX(Vec3 var1) {
      super(var1);
   }

   private Vector2f m_4047(LivingEntity var1) {
      Vec3 var2 = var1.position().subtract(f_11537.player.getEyePosition());
      float var3 = (float)Mth.wrapDegrees(Math.toDegrees(Math.atan2(var2.z, var2.x)) - f_11569);
      float[] var4 = this.m_4043(var3, 0.0F, var1);
      return new Vector2f(var4[0], this.m_4042());
   }

   @Override
   public void m_1801() {
      this.f_11550 = 0L;
      this.f_11551 = true;
   }

   private Vector2f m_4048(Vector2f var1, float var2, float var3) {
      float var4 = Class_uHPXr81r5AZlFeJr.m_9139();
      if (var4 < f_11588) {
         var4 = f_11589;
      }

      var2 -= (var2 - var1.x) % var4;
      var3 -= (var3 - var1.y) % var4;
      return new Vector2f(var2, Mth.clamp(var3, f_11590, f_11591));
   }
}
