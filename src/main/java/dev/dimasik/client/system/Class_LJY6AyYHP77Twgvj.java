package dev.dimasik.client.system;

import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.phys.Vec3;

public final class Class_LJY6AyYHP77Twgvj {
   private static final long f_10568 = 300000000L;
   private static LocalPlayer f_10569;
   private static Vec3 f_10570;
   private static Vec3 f_10571;
   private static long f_10572;
   private static boolean f_10573;
   private static final double f_10574 = 3.0E8;
   private static final double f_10575 = 3.0;
   private static final double f_10576 = 2.0;

   public static void m_3624(LocalPlayer var0) {
      if (var0 != null && f_10569 == var0 && f_10570 != null) {
         f_10571 = f_10570;
         f_10572 = System.nanoTime();
         f_10573 = true;
      } else {
         f_10573 = false;
      }
   }

   public static Vec3 m_3625(LocalPlayer var0, Vec3 var1) {
      if (f_10569 != var0) {
         m_3626();
         f_10569 = var0;
      }

      if (f_10573 && f_10571 != null) {
         double var2 = (System.nanoTime() - f_10572) / f_10574;
         if (var2 >= 1.0) {
            f_10573 = false;
            f_10571 = null;
            f_10570 = var1;
            return var1;
         } else {
            var2 = Math.max(0.0, var2);
            double var4 = var2 * var2 * (f_10575 - f_10576 * var2);
            f_10570 = new Vec3(f_10571.x + (var1.x - f_10571.x) * var4, f_10571.y + (var1.y - f_10571.y) * var4, f_10571.z + (var1.z - f_10571.z) * var4);
            return f_10570;
         }
      } else {
         f_10570 = var1;
         return var1;
      }
   }

   public static void m_3626() {
      f_10569 = null;
      f_10570 = null;
      f_10571 = null;
      f_10572 = 0L;
      f_10573 = false;
   }

   private Class_LJY6AyYHP77Twgvj() {
   }
}
