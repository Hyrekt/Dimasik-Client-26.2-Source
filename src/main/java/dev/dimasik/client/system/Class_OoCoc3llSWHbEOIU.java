package dev.dimasik.client.system;

public enum Class_OoCoc3llSWHbEOIU {
   SHTREBUX("Штребух", "shtrebux"),
   HONEY("МЁД ПО ТЕЛУ", "med"),
   OAR("Весло", "weslo");

   private final String f_11650;
   private final String f_11651;

   Class_OoCoc3llSWHbEOIU(String var3, String var4) {
      this.f_11650 = var3;
      this.f_11651 = var4;
   }

   public static Class_2ZaVm8TGDJ68TnJB[] m_4070() {
      Class_OoCoc3llSWHbEOIU[] var0 = values();
      Class_2ZaVm8TGDJ68TnJB[] var1 = new Class_2ZaVm8TGDJ68TnJB[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2] = new Class_2ZaVm8TGDJ68TnJB(var0[var2].f_11650);
      }

      return var1;
   }

   public static Class_OoCoc3llSWHbEOIU m_4071(String var0) {
      for (Class_OoCoc3llSWHbEOIU var4 : values()) {
         if (var4.f_11650.equals(var0)) {
            return var4;
         }
      }

      return SHTREBUX;
   }

   public String m_4072() {
      return this.f_11650;
   }

   public void m_4073(float var1) {
      Class_ayeYIPFHssYN0qd9.m_5966().m_5965(this.f_11651, var1);
   }
}
