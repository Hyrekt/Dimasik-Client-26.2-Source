package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import lombok.Generated;
import net.minecraft.network.protocol.game.ServerboundPlayerCommandPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerCommandPacket.Action;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec2;

public final class Class_QBKwWNWLlChWViO9 implements Class_NzJrN63M7QBpmAbi {
   private static final Class_QBKwWNWLlChWViO9.Bj9gtRXFmJBDkQ0A f_11918 = new Class_QBKwWNWLlChWViO9.Bj9gtRXFmJBDkQ0A();
   private static boolean f_11919 = false;
   private static final float f_11920 = -45.0F;
   private static final float f_11921 = 45.0F;
   private static final float f_11922 = 45.0F;
   private static final float f_11923 = -45.0F;
   private static final float f_11924 = -1.0F;
   private static final float f_11925 = 90.0F;
   private static final float f_11926 = 180.0F;
   private static final float f_11927 = -0.5F;
   private static final float f_11928 = 0.5F;
   private static final float f_11929 = 90.0F;
   private static final float f_11930 = 90.0F;
   private static final float f_11931 = Float.MAX_VALUE;
   private static final float f_11932 = -1.0F;
   private static final float f_11933 = -1.0F;
   private static final float f_11934 = Float.MAX_VALUE;
   private static final float f_11935 = -1.0F;
   private static final float f_11936 = -1.0F;
   private static final float f_11937 = 180.0F;
   private static final float f_11938 = -0.5F;
   private static final float f_11939 = 0.5F;
   private static final float f_11940 = 90.0F;
   private static final float f_11941 = 90.0F;
   private static final double f_11942 = -1.0;
   private static final float f_11943 = 90.0F;
   private static final float f_11944 = 90.0F;
   private static final float f_11945 = 90.0F;
   private static final float f_11946 = 90.0F;
   private static final float f_11947 = -1.0F;
   private static final float f_11948 = 180.0F;
   private static final float f_11949 = 90.0F;
   private static final float f_11950 = 90.0F;
   private static final float f_11951 = 45.0F;
   private static final float f_11952 = 45.0F;
   private static final float f_11953 = 45.0F;
   private static final float f_11954 = 45.0F;
   private static final float f_11955 = -1.0F;
   private static final String f_11956 = "This is a utility class and cannot be instantiated";

   public static void m_4254(double var0) {
      float var2 = f_11537.player.input.getMoveVector().y;
      float var3 = f_11537.player.input.getMoveVector().x;
      float var4 = f_11537.player.getYRot();
      if (var2 == 0.0F && var3 == 0.0F) {
         f_11537.player.setDeltaMovement(0.0, f_11537.player.getDeltaMovement().y, 0.0);
      } else {
         if (var2 != 0.0F) {
            if (var3 > 0.0F) {
               var4 += var2 > 0.0F ? f_11920 : f_11921;
            } else if (var3 < 0.0F) {
               var4 += var2 > 0.0F ? f_11922 : f_11923;
            }

            var3 = 0.0F;
            var2 = var2 > 0.0F ? 1.0F : f_11924;
         }

         double var5 = Math.toRadians(var4 + f_11925);
         double var7 = var2 * var0 * Math.cos(var5) + var3 * var0 * Math.sin(var5);
         double var9 = var2 * var0 * Math.sin(var5) - var3 * var0 * Math.cos(var5);
         f_11537.player.setDeltaMovement(var7, f_11537.player.getDeltaMovement().y, var9);
      }
   }

   @Generated
   private Class_QBKwWNWLlChWViO9() {
      throw new UnsupportedOperationException(f_11956);
   }

   public static void m_4255(Class_mRcJJZJYG5cvDAlU var0) {
      float var1 = var0.m_7588();
      float var2 = var0.m_7603();
      double var3 = Mth.wrapDegrees(
         Math.toDegrees(m_4262(f_11537.player.isFallFlying() ? f_11537.player.getYRot() : DimasikClient.m_9057().m_9052().m_6342().m_2663().x, var1, var2))
      );
      if (var1 != 0.0F || var2 != 0.0F) {
         float var5 = 0.0F;
         float var6 = 0.0F;
         float var7 = f_11931;

         for (float var8 = f_11932; var8 <= 1.0F; var8++) {
            for (float var9 = f_11933; var9 <= 1.0F; var9++) {
               if (var9 != 0.0F || var8 != 0.0F) {
                  double var10 = Mth.wrapDegrees(Math.toDegrees(m_4262(f_11537.player.getYRot(), var8, var9)));
                  double var12 = Math.abs(Mth.wrapDegrees(var3 - var10));
                  if (var12 < var7) {
                     var7 = (float)var12;
                     var5 = var8;
                     var6 = var9;
                  }
               }
            }
         }

         var0.m_7587(var5 > 0.0F);
         var0.m_7597(var5 < 0.0F);
         var0.m_7599(var6 > 0.0F);
         var0.m_7594(var6 < 0.0F);
         var0.m_7590(var5);
         var0.m_7596(var6);
      }
   }

   public static boolean m_4256() {
      Vec2 var0 = f_11537.player.input.getMoveVector();
      return var0.y != 0.0F || var0.x != 0.0F;
   }

   public static double[] m_4257() {
      float var0 = m_4260();
      if (var0 == f_11955) {
         return new double[]{0.0, 0.0};
      }

      double var1 = Math.toRadians(var0);
      return new double[]{-Math.sin(var1), Math.cos(var1)};
   }

   public static double m_4258(boolean var0) {
      Vec2 var1 = f_11537.player.input.getMoveVector();
      float var2 = var1.y;
      float var3 = var1.x;
      float var4 = f_11537.player.getYRot();
      if (var2 < 0.0F) {
         var4 += f_11926;
      }

      float var5 = 1.0F;
      if (var2 < 0.0F) {
         var5 = f_11927;
      } else if (var2 > 0.0F) {
         var5 = f_11928;
      }

      if (var3 > 0.0F) {
         var4 -= f_11929 * var5;
      }

      if (var3 < 0.0F) {
         var4 += f_11930 * var5;
      }

      return var0 ? Math.toRadians(var4) : var4;
   }

   public static void m_4259(double var0, double var2) {
      double var4 = f_11537.player.input.getMoveVector().y;
      double var6 = f_11537.player.input.getMoveVector().x;
      float var8 = f_11537.player.getYRot();
      double var9 = 0.0;
      if (f_11537.options.keyJump.isDown()) {
         var9 = var2;
      } else if (f_11537.options.keyShift.isDown()) {
         var9 = -var2;
      }

      if (var4 == 0.0 && var6 == 0.0) {
         f_11537.player.setDeltaMovement(0.0, var9, 0.0);
      } else {
         if (var4 != 0.0) {
            if (var6 > 0.0) {
               var8 += var4 > 0.0 ? -45 : 45;
            } else if (var6 < 0.0) {
               var8 += var4 > 0.0 ? 45 : -45;
            }

            var6 = 0.0;
            if (var4 > 0.0) {
               var4 = 1.0;
            } else if (var4 < 0.0) {
               var4 = f_11942;
            }
         }

         f_11537.player
            .setDeltaMovement(
               var4 * var0 * Mth.cos((float)Math.toRadians(var8 + f_11943)) + var6 * var0 * Mth.sin((float)Math.toRadians(var8 + f_11944)),
               var9,
               var4 * var0 * Mth.sin((float)Math.toRadians(var8 + f_11945)) - var6 * var0 * Mth.cos((float)Math.toRadians(var8 + f_11946))
            );
      }
   }

   public static float m_4260() {
      boolean var0 = f_11537.options.keyRight.isDown();
      boolean var1 = f_11537.options.keyLeft.isDown();
      boolean var2 = f_11537.options.keyUp.isDown();
      boolean var3 = f_11537.options.keyDown.isDown();
      float var4 = f_11537.player.getYRot();
      if (!var0 && !var3 && !var1 && !var2) {
         return f_11947;
      }

      if (var3) {
         var4 -= f_11948;
      }

      boolean var5 = (var3 || var2) && (!var3 || !var2);
      if (!var5) {
         if (var1) {
            var4 -= f_11949;
         }

         if (var0) {
            var4 += f_11950;
         }
      } else if (var4 == f_11537.player.getYRot()) {
         if (var1) {
            var4 -= f_11951;
         }

         if (var0) {
            var4 += f_11952;
         }
      } else {
         if (var1) {
            var4 += f_11953;
         }

         if (var0) {
            var4 -= f_11954;
         }
      }

      return Mth.wrapDegrees(var4);
   }

   private static void m_4261(Class_lTzchJDbvRVrnXlw var0) {
      if (var0.m_7532() instanceof ServerboundPlayerCommandPacket var1) {
         if (var1.getAction().equals(Action.STOP_SPRINTING)) {
            f_11919 = false;
         } else if (var1.getAction().equals(Action.START_SPRINTING)) {
            f_11919 = true;
         }
      }
   }

   public static double m_4262(float var0, double var1, double var3) {
      if (var1 < 0.0) {
         var0 += f_11937;
      }

      float var5 = 1.0F;
      if (var1 < 0.0) {
         var5 = f_11938;
      } else if (var1 > 0.0) {
         var5 = f_11939;
      }

      if (var3 > 0.0) {
         var0 -= f_11940 * var5;
      }

      if (var3 < 0.0) {
         var0 += f_11941 * var5;
      }

      return Math.toRadians(var0);
   }

   public static boolean m_4263() {
      return f_11919;
   }

   public static void m_4264(double var0) {
      if (m_4256()) {
         double var2 = m_4258(true);
         f_11537.player.setDeltaMovement(-Math.sin(var2) * var0, f_11537.player.getDeltaMovement().y, Math.cos(var2) * var0);
      }
   }

   public static void m_4265(Class_mRcJJZJYG5cvDAlU var0, float var1) {
      float var2 = var0.m_7588();
      float var3 = var0.m_7603();
      double var4 = Mth.wrapDegrees(Math.toDegrees(m_4262(f_11537.player.isFallFlying() ? f_11537.player.getYRot() : var1, var2, var3)));
      if (var2 != 0.0F || var3 != 0.0F) {
         float var6 = 0.0F;
         float var7 = 0.0F;
         float var8 = f_11934;

         for (float var9 = f_11935; var9 <= 1.0F; var9++) {
            for (float var10 = f_11936; var10 <= 1.0F; var10++) {
               if (var10 != 0.0F || var9 != 0.0F) {
                  double var11 = Mth.wrapDegrees(Math.toDegrees(m_4262(f_11537.player.getYRot(), var9, var10)));
                  double var13 = Math.abs(Mth.wrapDegrees(var4 - var11));
                  if (var13 < var8) {
                     var8 = (float)var13;
                     var6 = var9;
                     var7 = var10;
                  }
               }
            }
         }

         var0.m_7587(var6 > 0.0F);
         var0.m_7597(var6 < 0.0F);
         var0.m_7599(var7 > 0.0F);
         var0.m_7594(var7 < 0.0F);
         var0.m_7590(var6);
         var0.m_7596(var7);
      }
   }

   static {
      DimasikClient.m_9057().m_9051().m_9713(f_11918);
   }

   public static class Bj9gtRXFmJBDkQ0A {
      public final Class_gEPk7yDw6CwIte87<Class_lTzchJDbvRVrnXlw> f_11917 = Class_QBKwWNWLlChWViO9::m_4261;
   }
}
