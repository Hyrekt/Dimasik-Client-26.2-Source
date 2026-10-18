package dev.dimasik.client.system;

import java.util.UUID;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;

public final class Class_dSYEfAT7aJC05RrC implements Class_NzJrN63M7QBpmAbi {
   private static final double f_18932 = 0.008;
   private static final double f_18933 = 0.03334;
   private static final double f_18934 = 2.0;
   private static final double f_18935 = 2.0;
   private static final float f_18936 = 90.0F;
   private static final float f_18937 = 60.0F;
   private static final Vec3 f_18938 = new Vec3(0.0, 1.0, 0.0);
   private double f_18939;
   private UUID f_18940;
   private Object f_18941;
   private Class_dSYEfAT7aJC05RrC.xPnPwfOs5xA9WaAE f_18942;
   private static final double f_18943 = 0.82F;
   private static final String f_18944 = "heightRatio must be within 0..1";
   private static final float f_18945 = -90.0F;
   private static final float f_18946 = 90.0F;
   private static final String f_18947 = "Invalid observed look or partial tick";
   private static final long f_18948 = 8000000L;
   private static final double f_18949 = 1.0E9;
   private static final double f_18950 = 0.008;
   private static final double f_18951 = 0.03334;
   private static final double f_18952 = 2.0;
   private static final double f_18953 = 2.0;
   private static final float f_18954 = 90.0F;
   private static final float f_18955 = 60.0F;
   private static final String f_18956 = "sample_dt_ms";
   private static final double f_18957 = 1000.0;
   private static final String f_18958 = "world_tick_changed";
   private static final String f_18959 = "world_tick_phase";
   private static final String f_18960 = "rel_pos";
   private static final String f_18961 = "distance";
   private static final String f_18962 = "rel_vel";
   private static final String f_18963 = "aim_error_yaw";
   private static final String f_18964 = "aim_error_pitch";
   private static final String f_18965 = "yaw_velocity";
   private static final String f_18966 = "pitch_velocity";
   private static final String f_18967 = "target_relative_yaw_sin";
   private static final String f_18968 = "target_relative_yaw_cos";
   private static final String f_18969 = "target_on_ground";
   private static final String f_18970 = "target_sprinting";
   private static final String f_18971 = "target_sneaking";
   private static final String f_18972 = "target_hurt_time";
   private static final String f_18973 = "player_on_ground";
   private static final String f_18974 = "player_sprinting";
   private static final String f_18975 = "player_sneaking";
   private static final String f_18976 = "input_forward";
   private static final String f_18977 = "input_back";
   private static final String f_18978 = "input_left";
   private static final String f_18979 = "input_right";
   private static final String f_18980 = "input_jump";
   private static final String f_18981 = "input_attack";
   private static final String f_18982 = "exact_crosshair";

   public Class_dSYEfAT7aJC05RrC() {
      this.f_18939 = f_18943;
   }

   public Class_dSYEfAT7aJC05RrC.TEKbDjGhGLlvYtoY m_6333(LocalPlayer var1, LivingEntity var2, float var3, long var4, float var6, float var7, boolean var8) {
      if (Float.isFinite(var6) && Float.isFinite(var7) && !(var7 < f_18945) && !(var7 > f_18946) && Float.isFinite(var3)) {
         ClientLevel var9 = f_11537.level;
         Class_dSYEfAT7aJC05RrC.xPnPwfOs5xA9WaAE var10 = Class_dSYEfAT7aJC05RrC.xPnPwfOs5xA9WaAE.capture(var1, var2, var3, this.f_18939, var4, var6, var7);
         UUID var11 = var2.getUUID();
         if (var11.equals(this.f_18940) && this.f_18942 != null && var9 == this.f_18941) {
            long var12 = var10.nanoTime - this.f_18942.nanoTime;
            if (var12 > 0L && var12 >= f_18948) {
               double var14 = var12 / f_18949;
               Vec3 var16 = var10.targetPoint.subtract(this.f_18942.targetPoint);
               Vec3 var17 = var10.playerEye.subtract(this.f_18942.playerEye);
               float var18 = Mth.wrapDegrees(var10.playerYaw - this.f_18942.playerYaw);
               float var19 = var10.playerPitch - this.f_18942.playerPitch;
               if (Double.isFinite(var14)
                  && !(var14 < f_18950)
                  && !(var14 > f_18951)
                  && !(var16.length() > f_18952)
                  && !(var17.length() > f_18953)
                  && !(Math.abs(var18) > f_18954)
                  && !(Math.abs(var19) > f_18955)) {
                  Class_dSYEfAT7aJC05RrC.PVRkSOTWNViqDhkW var20 = Class_dSYEfAT7aJC05RrC.PVRkSOTWNViqDhkW.m_6330(var16, var17, var18, var19, var14);
                  Class_dSYEfAT7aJC05RrC.c9ZwI20m3nAE9qVE var21 = Class_dSYEfAT7aJC05RrC.c9ZwI20m3nAE9qVE.m_6331(var10.playerYaw, var10.playerPitch);
                  Vec3 var22 = var10.targetPoint.subtract(var10.playerEye);
                  Vec3 var23 = var21.project(var22);
                  Vec3 var24 = var21.project(var20.targetVelocity.subtract(var20.playerVelocity));
                  double var25 = Math.toRadians(Mth.wrapDegrees(var2.getYRot(var3) - var10.playerYaw));
                  Class_dSYEfAT7aJC05RrC.Class_8g0WOjsg3z6cUMYZ var27 = new Class_dSYEfAT7aJC05RrC.Class_8g0WOjsg3z6cUMYZ();
                  var27.m_6329(f_18956, var14 * f_18957);
                  var27.m_6327(f_18958, var10.worldTime != this.f_18942.worldTime);
                  var27.m_6329(f_18959, Mth.clamp(var3, 0.0F, 1.0F));
                  var27.m_6328(f_18960, var23);
                  var27.m_6329(f_18961, var22.length());
                  var27.m_6328(f_18962, var24);
                  var27.m_6329(f_18963, Mth.wrapDegrees(var10.idealYaw - var10.playerYaw));
                  var27.m_6329(f_18964, var10.idealPitch - var10.playerPitch);
                  var27.m_6329(f_18965, var20.yawVelocity);
                  var27.m_6329(f_18966, var20.pitchVelocity);
                  var27.m_6329(f_18967, Math.sin(var25));
                  var27.m_6329(f_18968, Math.cos(var25));
                  var27.m_6327(f_18969, var2.onGround());
                  var27.m_6327(f_18970, var2.isSprinting());
                  var27.m_6327(f_18971, var2.isShiftKeyDown());
                  var27.m_6329(f_18972, var2.hurtTime);
                  var27.m_6327(f_18973, var1.onGround());
                  var27.m_6327(f_18974, var1.isSprinting());
                  var27.m_6327(f_18975, var1.isShiftKeyDown());
                  var27.m_6327(f_18976, f_11537.options.keyUp.isDown());
                  var27.m_6327(f_18977, f_11537.options.keyDown.isDown());
                  var27.m_6327(f_18978, f_11537.options.keyLeft.isDown());
                  var27.m_6327(f_18979, f_11537.options.keyRight.isDown());
                  var27.m_6327(f_18980, f_11537.options.keyJump.isDown());
                  var27.m_6327(f_18981, f_11537.options.keyAttack.isDown());
                  var27.m_6327(f_18982, var8);
                  this.f_18942 = var10;
                  return new Class_dSYEfAT7aJC05RrC.TEKbDjGhGLlvYtoY(var27.m_6326(), var10.playerYaw, var10.playerPitch, false);
               } else {
                  this.f_18942 = var10;
                  return Class_dSYEfAT7aJC05RrC.TEKbDjGhGLlvYtoY.reset();
               }
            } else {
               return Class_dSYEfAT7aJC05RrC.TEKbDjGhGLlvYtoY.skip();
            }
         } else {
            this.f_18940 = var11;
            this.f_18941 = var9;
            this.f_18942 = var10;
            return Class_dSYEfAT7aJC05RrC.TEKbDjGhGLlvYtoY.reset();
         }
      } else {
         throw new IllegalArgumentException(f_18947);
      }
   }

   public void m_6334(double var1) {
      if (Double.isFinite(var1) && !(var1 < 0.0) && !(var1 > 1.0)) {
         if (Double.compare(var1, this.f_18939) != 0) {
            this.f_18939 = var1;
            this.m_6335();
         }
      } else {
         throw new IllegalArgumentException(f_18944);
      }
   }

   public void m_6335() {
      this.f_18940 = null;
      this.f_18941 = null;
      this.f_18942 = null;
   }

   public static Vec3 m_6336(LivingEntity var0, float var1, double var2) {
      Vec3 var4 = var0.getPosition(var1);
      return new Vec3(var4.x, var4.y + var0.getBbHeight() * var2, var4.z);
   }

   public Class_dSYEfAT7aJC05RrC.TEKbDjGhGLlvYtoY m_6337(LocalPlayer var1, LivingEntity var2, float var3, long var4) {
      return this.m_6333(var1, var2, var3, var4, var1.getYRot(), var1.getXRot(), f_11537.crosshairPickEntity == var2);
   }

   private static final class Class_8g0WOjsg3z6cUMYZ {
      public final float[] f_18930 = new float[Class_WvVvQwpWLdnJMMi9.f_15738];
      public int f_18931;

      public float[] m_6326() {
         if (this.f_18931 != this.f_18930.length) {
            throw new IllegalStateException("" + this.f_18931 + this.f_18930.length);
         } else {
            return this.f_18930;
         }
      }

      public void m_6327(String var1, boolean var2) {
         this.m_6329(var1, var2 ? 1.0 : 0.0);
      }

      public void m_6328(String var1, Vec3 var2) {
         this.m_6329(var1 + "", var2.x);
         this.m_6329(var1 + "", var2.y);
         this.m_6329(var1 + "", var2.z);
      }

      public Class_8g0WOjsg3z6cUMYZ() {
      }

      public void m_6329(String var1, double var2) {
         if (this.f_18931 < this.f_18930.length && Class_WvVvQwpWLdnJMMi9.f_15737[this.f_18931].equals(var1)) {
            float var4 = (float)var2;
            if (Double.isFinite(var2) && Float.isFinite(var4)) {
               this.f_18930[this.f_18931++] = var4;
            } else {
               throw new IllegalArgumentException(var1 + "");
            }
         } else {
            throw new IllegalStateException(this.f_18931 + var1);
         }
      }
   }

   private record PVRkSOTWNViqDhkW(Vec3 targetVelocity, Vec3 playerVelocity, float yawVelocity, float pitchVelocity) {
      public static Class_dSYEfAT7aJC05RrC.PVRkSOTWNViqDhkW m_6330(Vec3 var0, Vec3 var1, float var2, float var3, double var4) {
         double var6 = 1.0 / var4;
         return new Class_dSYEfAT7aJC05RrC.PVRkSOTWNViqDhkW(var0.scale(var6), var1.scale(var6), (float)(var2 * var6), (float)(var3 * var6));
      }
   }

   public record TEKbDjGhGLlvYtoY(float[] features, float playerYaw, float playerPitch, boolean resetHistory) {
      public static Class_dSYEfAT7aJC05RrC.TEKbDjGhGLlvYtoY reset() {
         return new Class_dSYEfAT7aJC05RrC.TEKbDjGhGLlvYtoY(null, 0.0F, 0.0F, true);
      }

      public static Class_dSYEfAT7aJC05RrC.TEKbDjGhGLlvYtoY skip() {
         return new Class_dSYEfAT7aJC05RrC.TEKbDjGhGLlvYtoY(null, 0.0F, 0.0F, false);
      }
   }

   private record c9ZwI20m3nAE9qVE(Vec3 right, Vec3 up, Vec3 forward) {
      public static Class_dSYEfAT7aJC05RrC.c9ZwI20m3nAE9qVE m_6331(float var0, float var1) {
         double var2 = Math.toRadians(var0);
         double var4 = Math.toRadians(var1);
         Vec3 var6 = new Vec3(-Math.sin(var2), 0.0, Math.cos(var2)).normalize();
         Vec3 var7 = var6.cross(Class_dSYEfAT7aJC05RrC.f_18938).normalize();
         Vec3 var8 = new Vec3(var6.x * Math.cos(var4), -Math.sin(var4), var6.z * Math.cos(var4)).normalize();
         return new Class_dSYEfAT7aJC05RrC.c9ZwI20m3nAE9qVE(var7, var7.cross(var8).normalize(), var8);
      }

      public Vec3 m_6332() {
         return this.up;
      }

      public Vec3 project(Vec3 var1) {
         return new Vec3(var1.dot(this.right), var1.dot(this.up), var1.dot(this.forward));
      }
   }

   private record xPnPwfOs5xA9WaAE(
      long nanoTime, long worldTime, Vec3 playerEye, Vec3 targetPoint, float playerYaw, float playerPitch, float idealYaw, float idealPitch
   ) {
      public static Class_dSYEfAT7aJC05RrC.xPnPwfOs5xA9WaAE capture(
         LocalPlayer var0, LivingEntity var1, float var2, double var3, long var5, float var7, float var8
      ) {
         Vec3 var9 = var0.getEyePosition(var2);
         Vec3 var10 = Class_dSYEfAT7aJC05RrC.m_6336(var1, var2, var3);
         Vec3 var11 = var10.subtract(var9);
         float var12 = (float)Math.toDegrees(Math.atan2(var11.z, var11.x)) - 90.0F;
         float var13 = (float)(-Math.toDegrees(Math.atan2(var11.y, Math.hypot(var11.x, var11.z))));
         return new Class_dSYEfAT7aJC05RrC.xPnPwfOs5xA9WaAE(var5, Class_NzJrN63M7QBpmAbi.f_11537.level.getGameTime(), var9, var10, var7, var8, var12, var13);
      }
   }
}
