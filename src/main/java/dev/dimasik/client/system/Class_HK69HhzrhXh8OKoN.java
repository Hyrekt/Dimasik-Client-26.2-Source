package dev.dimasik.client.system;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.client.Minecraft;

public final class Class_HK69HhzrhXh8OKoN extends Class_nqIPwf7m22Ne6Hwn {
   private final Class_PKdQIwbr1ubGwinO f_8080;
   private static final String f_8081 = "buttons";

   private String m_2879(String var1) {
      return Class_Hh3sghUzXbE4iX4W.m_2903(var1) ? null : var1;
   }

   @Override
   public JsonObject m_2880() {
      JsonObject var1 = super.m_2880();
      JsonArray var2 = new JsonArray();
      int var3 = 0;

      for (Class_Hh3sghUzXbE4iX4W var5 : this.f_8080.m_4122()) {
         if (var5.m_2906()) {
            var2.add(var5.m_2904());
            if (++var3 == 2) {
               break;
            }
         }
      }

      if (var2.size() > 0) {
         var1.add(f_8081, var2);
      }

      return var1;
   }

   public Class_HK69HhzrhXh8OKoN(Class_PKdQIwbr1ubGwinO var1, Minecraft var2, long var3) {
      this.f_8080 = var1;
      this.m_2881(var1.m_4114(), this::m_7701);
      this.m_2881(var1.m_4115(var2), this::m_7700);
      if (!Class_Hh3sghUzXbE4iX4W.m_2903(var1.m_4120())) {
         this.m_7703(var1.m_4120(), this.m_2879(var1.m_4113()));
      }

      if (!Class_Hh3sghUzXbE4iX4W.m_2903(var1.m_4116())) {
         this.m_7699(var1.m_4116(), this.m_2879(var1.m_4121()));
      }

      if (var1.m_4125()) {
         this.m_7704(var3);
      }
   }

   private void m_2881(String var1, Class_HK69HhzrhXh8OKoN.HDTwJD3CDXReJJHa var2) {
      if (!Class_Hh3sghUzXbE4iX4W.m_2903(var1)) {
         var2.m_2878(var1);
      }
   }

   private interface HDTwJD3CDXReJJHa {
      void m_2878(String var1);
   }
}
