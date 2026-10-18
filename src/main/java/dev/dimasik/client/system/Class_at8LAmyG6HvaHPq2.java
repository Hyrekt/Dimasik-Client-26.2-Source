package dev.dimasik.client.system;

import java.io.IOException;
import java.util.LinkedHashSet;

public final class Class_at8LAmyG6HvaHPq2 {
   private static final long f_17461 = 12L;
   private static final String f_17462 = ", ";

   private static boolean m_5941(int var0, int var1, int var2) {
      return var0 != 0
         && var0 != 10
         && var0 != 127
         && var0 < 224
         && (var0 != 100 || var1 < 64 || var1 > 127)
         && (var0 != 169 || var1 != 254)
         && (var0 != 172 || var1 < 16 || var1 > 31)
         && (var0 != 192 || var1 != 168 && (var1 != 0 || var2 != 0 && var2 != 2) && (var1 != 88 || var2 != 99))
         && (var0 != 198 || var1 != 18 && var1 != 19 && (var1 != 51 || var2 != 100))
         && (var0 != 203 || var1 != 0 || var2 != 113);
   }

   private Class_at8LAmyG6HvaHPq2() {
   }

   public static String m_5942(byte[] var0) throws IOException {
      Class_b4eSpB4hig30Hstc.m_5992(var0);
      Class_b4eSpB4hig30Hstc.G3oW5dpyVPTggMO0 var1 = new Class_b4eSpB4hig30Hstc.G3oW5dpyVPTggMO0(var0);
      var1.m_5968(f_17461);
      long var2 = var1.m_5969();
      LinkedHashSet var4 = new LinkedHashSet();

      for (long var5 = 0L; var5 < var2; var5++) {
         int var7 = var1.m_5970();
         int var8 = var1.m_5970();
         int var9 = var1.m_5970();
         int var10 = var1.m_5970();
         int var11 = var1.m_5970();
         int var12 = var1.m_5971();
         if ((var7 == 1 || var7 == 2) && var12 != 0 && m_5941(var8, var9, var10)) {
            var4.add("" + var8 + var9 + var10 + var11);
         }
      }

      return var4.isEmpty() ? null : String.join(f_17462, var4);
   }
}
