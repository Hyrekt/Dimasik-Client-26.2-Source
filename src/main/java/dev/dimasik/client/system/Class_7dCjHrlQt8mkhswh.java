package dev.dimasik.client.system;

import java.util.Locale;
import java.util.Set;
import net.minecraft.client.multiplayer.resolver.ServerAddress;

public final class Class_7dCjHrlQt8mkhswh {
   private static final String f_3795 = "redirect.bravohvh.fun";
   private static final Set<String> f_3796 = Set.of(Class_7dCjHrlQt8mkhswh.f_3801, Class_7dCjHrlQt8mkhswh.f_3802, Class_7dCjHrlQt8mkhswh.f_3803);
   private static final String f_3797 = "redirect.bravohvh.fun";
   private static final String f_3798 = "redirect.bravohvh.fun";
   private static final String f_3799 = ".";
   private static final String f_3800 = "[";
   private static final String f_3801 = "mc.svinworld.space";
   private static final String f_3802 = "mc.svinworld.fun";
   private static final String f_3803 = "46.174.48.116";

   private static String m_1740(String var0) {
      if (var0 == null) {
         return "";
      }

      String var1 = var0.trim().toLowerCase(Locale.ROOT);
      return var1.endsWith(f_3799) ? var1.substring(0, var1.length() - 1) : var1;
   }

   private Class_7dCjHrlQt8mkhswh() {
   }

   public static String m_1741(String var0) {
      if (var0 != null && !var0.isBlank()) {
         Class_7dCjHrlQt8mkhswh.bXIyfKioff4OiAdC var1 = m_1742(var0.trim());
         if (!f_3796.contains(var1.host())) {
            return var0;
         } else {
            return var1.port() != null ? var1.port() + "" : f_3797;
         }
      } else {
         return var0;
      }
   }

   private static Class_7dCjHrlQt8mkhswh.bXIyfKioff4OiAdC m_1742(String var0) {
      String var1 = var0;
      String var2 = null;
      if (var0.startsWith(f_3800)) {
         int var3 = var0.indexOf(93);
         if (var3 != -1) {
            var1 = var0.substring(1, var3);
            if (var3 + 1 < var0.length() && var0.charAt(var3 + 1) == ':') {
               var2 = var0.substring(var3 + 2);
            }
         }
      } else {
         int var4 = var0.lastIndexOf(58);
         if (var4 != -1 && var0.indexOf(58) == var4) {
            var1 = var0.substring(0, var4);
            var2 = var0.substring(var4 + 1);
         }
      }

      if (var2 != null && var2.isBlank()) {
         var2 = null;
      }

      return new Class_7dCjHrlQt8mkhswh.bXIyfKioff4OiAdC(m_1740(var1), var2);
   }

   public static ServerAddress m_1743(ServerAddress var0) {
      if (var0 == null) {
         return null;
      } else if (!f_3796.contains(m_1740(var0.getHost()))) {
         return var0;
      } else {
         return var0.getPort() == 25565 ? ServerAddress.parseString(f_3798) : ServerAddress.parseString(var0.getPort() + "");
      }
   }

   private record bXIyfKioff4OiAdC(String host, String port) {
   }
}
