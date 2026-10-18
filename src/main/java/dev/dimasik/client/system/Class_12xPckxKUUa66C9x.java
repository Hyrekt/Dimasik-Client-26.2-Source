package dev.dimasik.client.system;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class Class_12xPckxKUUa66C9x {
   private static boolean f_462;
   private static boolean f_463;
   private static Method f_464;
   private static Method f_465;
   private static Method f_466;
   private static Method f_467;
   private static Method f_468;
   private static Method f_469;
   private static Method f_470;
   private static Field f_471;
   private static Boolean f_472;
   private static Boolean f_473;
   private static boolean f_474;
   private static final String f_475 = "de.maxhenkel.voicechat.voice.client.ClientManager";
   private static final String f_476 = "getPlayerStateManager";
   private static final String f_477 = "isMuted";
   private static final String f_478 = "setMuted";
   private static final String f_479 = "isDisabled";
   private static final String f_480 = "setDisabled";
   private static final String f_481 = "canEnable";
   private static final String f_482 = "getPttKeyHandler";
   private static final String f_483 = "pttKeyDown";

   public static boolean m_830() {
      return m_831() && f_463;
   }

   private Class_12xPckxKUUa66C9x() {
   }

   private static boolean m_831() {
      if (f_462) {
         return f_463;
      }

      f_462 = true;

      try {
         Class var0 = Class.forName(f_475);
         f_464 = var0.getMethod(f_476);
         Class var1 = f_464.getReturnType();
         f_465 = var1.getMethod(f_477);
         f_466 = var1.getMethod(f_478, boolean.class);
         f_467 = var1.getMethod(f_479);
         f_468 = var1.getMethod(f_480, boolean.class);

         try {
            f_469 = var1.getMethod(f_481);
         } catch (NoSuchMethodException var3) {
            f_469 = null;
         }

         f_470 = var0.getMethod(f_482);
         Class var2 = f_470.getReturnType();
         f_471 = var2.getDeclaredField(f_483);
         f_471.setAccessible(true);
         f_463 = true;
         return true;
      } catch (ReflectiveOperationException | LinkageError var4) {
         f_463 = false;
         return false;
      }
   }

   private static void m_832(boolean var0) {
      if (f_471 != null && f_470 != null) {
         try {
            Object var1 = f_470.invoke(null);
            if (var1 != null) {
               f_471.setBoolean(var1, var0);
            }
         } catch (ReflectiveOperationException | LinkageError var2) {
         }
      }
   }

   public static synchronized void m_833() {
      if (f_474) {
         m_832(true);
      }
   }

   public static synchronized void m_834() {
      f_474 = false;
      m_832(false);
      if (f_463 && f_472 != null) {
         try {
            Object var0 = f_464.invoke(null);
            if (var0 != null) {
               f_466.invoke(var0, f_472);
               if (f_473 != null) {
                  f_468.invoke(var0, f_473);
               }
            }
         } catch (ReflectiveOperationException | LinkageError var1) {
         }

         f_472 = null;
         f_473 = null;
      } else {
         f_472 = null;
         f_473 = null;
      }
   }

   public static synchronized void m_835() {
      if (m_831() && f_463) {
         try {
            Object var0 = f_464.invoke(null);
            if (var0 != null) {
               if (f_472 == null) {
                  f_472 = (Boolean)f_465.invoke(var0);
                  f_473 = (Boolean)f_467.invoke(var0);
               }

               Boolean var1 = (Boolean)f_467.invoke(var0);
               if (Boolean.TRUE.equals(var1)) {
                  Boolean var2 = f_469 != null ? (Boolean)f_469.invoke(var0) : Boolean.TRUE;
                  if (Boolean.TRUE.equals(var2)) {
                     f_468.invoke(var0, false);
                  }
               }

               f_466.invoke(var0, false);
            }
         } catch (ReflectiveOperationException | LinkageError var3) {
         }

         f_474 = true;
         m_832(true);
      }
   }

   public static boolean m_836() {
      return f_474;
   }
}
