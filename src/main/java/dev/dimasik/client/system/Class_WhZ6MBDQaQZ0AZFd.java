package dev.dimasik.client.system;

import com.google.gson.JsonObject;

public final class Class_WhZ6MBDQaQZ0AZFd {
   private static boolean f_15703;
   private static boolean f_15704 = true;
   private static float f_15705 = 1.0F;
   private static int f_15706 = 2;
   private static Class_WhZ6MBDQaQZ0AZFd.K4ufvBpHGycE5Var f_15707 = Class_WhZ6MBDQaQZ0AZFd.K4ufvBpHGycE5Var.DEFAULT;
   private static final float f_15708 = 100.0F;
   private static final float f_15709 = 100.0F;
   private static final float f_15710 = 0.7F;
   private static final float f_15711 = 1.2F;
   private static final String f_15712 = "Language";
   private static final String f_15713 = "English";
   private static final String f_15714 = "Русский";
   private static final String f_15715 = "Hints";
   private static final String f_15716 = "Scale";
   private static final String f_15717 = "Quality";
   private static final String f_15718 = "Layout";
   private static final String f_15719 = "Language";
   private static final String f_15720 = "English";
   private static final String f_15721 = "Language";
   private static final String f_15722 = "Hints";
   private static final String f_15723 = "Hints";
   private static final String f_15724 = "Scale";
   private static final String f_15725 = "Scale";
   private static final String f_15726 = "Quality";
   private static final String f_15727 = "Quality";
   private static final String f_15728 = "Layout";
   private static final String f_15729 = "Layout";
   private static final String f_15730 = "Layout";

   public static Class_WhZ6MBDQaQZ0AZFd.K4ufvBpHGycE5Var m_5484() {
      return f_15707;
   }

   public static int m_5485() {
      return f_15706;
   }

   public static JsonObject m_5486() {
      JsonObject var0 = new JsonObject();
      var0.addProperty(f_15712, f_15703 ? f_15713 : f_15714);
      var0.addProperty(f_15715, f_15704);
      var0.addProperty(f_15716, f_15705);
      var0.addProperty(f_15717, f_15706);
      var0.addProperty(f_15718, f_15707.f_15697);
      return var0;
   }

   public static float m_5487() {
      return f_15705;
   }

   public static void m_5488(Class_WhZ6MBDQaQZ0AZFd.K4ufvBpHGycE5Var var0) {
      f_15707 = var0 == null ? Class_WhZ6MBDQaQZ0AZFd.K4ufvBpHGycE5Var.DEFAULT : var0;
   }

   public static void m_5489(int var0) {
      f_15706 = Math.clamp(var0, 0, 2);
   }

   public static void m_5490(boolean var0) {
      f_15703 = var0;
      Class_0p152hWffX3ippAf.m_803(var0);
   }

   public static boolean m_5491() {
      return f_15704;
   }

   public static void m_5492(boolean var0) {
      f_15704 = var0;
   }

   public static void m_5493(float var0) {
      if (Float.isFinite(var0)) {
         f_15705 = Math.clamp(Math.round(var0 * f_15708) / f_15709, f_15710, f_15711);
      }
   }

   public static void m_5494(JsonObject var0) {
      if (var0 != null) {
         if (var0.has(f_15719)) {
            m_5490(f_15720.equals(var0.get(f_15721).getAsString()));
         }

         if (var0.has(f_15722)) {
            m_5492(var0.get(f_15723).getAsBoolean());
         }

         if (var0.has(f_15724)) {
            m_5493(var0.get(f_15725).getAsFloat());
         }

         if (var0.has(f_15726)) {
            m_5489(var0.get(f_15727).getAsInt());
         }

         f_15707 = Class_WhZ6MBDQaQZ0AZFd.K4ufvBpHGycE5Var.DEFAULT;
         if (var0.has(f_15728) && var0.get(f_15729).isJsonPrimitive()) {
            String var1 = var0.get(f_15730).getAsString();

            for (Class_WhZ6MBDQaQZ0AZFd.K4ufvBpHGycE5Var var5 : Class_WhZ6MBDQaQZ0AZFd.K4ufvBpHGycE5Var.values()) {
               if (var5.f_15697.equals(var1)) {
                  f_15707 = var5;
                  break;
               }
            }
         }
      }
   }

   private Class_WhZ6MBDQaQZ0AZFd() {
   }

   public static boolean m_5495() {
      return f_15703;
   }

   public enum K4ufvBpHGycE5Var {
      COMPACT("compact", "Компактный", "Compact", "\ue121", true, false),
      COMPACT_SETTINGS("compact_settings", "Компактный с настройками", "Compact with settings", "\ue122", true, true),
      FULL_SETTINGS("full_settings", "Полный с настройками", "Full with settings", "\ue123", false, true),
      DEFAULT("default", "Обычный", "Default", "\ue124", false, false);

      public final String f_15697;
      public final String f_15698;
      public final String f_15699;
      public final String f_15700;
      public final boolean f_15701;
      public final boolean f_15702;

      K4ufvBpHGycE5Var(String var3, String var4, String var5, String var6, boolean var7, boolean var8) {
         this.f_15697 = var3;
         this.f_15698 = var4;
         this.f_15699 = var5;
         this.f_15700 = var6;
         this.f_15701 = var7;
         this.f_15702 = var8;
      }

      public String m_5480() {
         return Class_0p152hWffX3ippAf.m_804(this.f_15698, this.f_15699);
      }

      public String m_5481() {
         return this.f_15700;
      }

      public boolean m_5482() {
         return this.f_15701;
      }

      public boolean m_5483() {
         return this.f_15702;
      }
   }
}
