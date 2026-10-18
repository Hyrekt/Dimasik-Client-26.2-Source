package dev.dimasik.client.system;

import net.minecraft.client.Minecraft;

public final class Class_mzQ5t1DkueICIw6Q {
   private static boolean f_25562;

   public static void m_7638() {
      f_25562 = true;

      try {
         Minecraft.getInstance().gameRenderer.guiRenderer.render();
      } finally {
         f_25562 = false;
      }
   }

   public static boolean m_7639() {
      return f_25562;
   }

   private Class_mzQ5t1DkueICIw6Q() {
   }
}
