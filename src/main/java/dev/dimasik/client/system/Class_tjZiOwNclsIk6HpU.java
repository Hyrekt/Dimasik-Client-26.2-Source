package dev.dimasik.client.system;

import java.util.Locale;
import java.util.Set;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.FontDescription;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.FontDescription.Resource;
import net.minecraft.resources.Identifier;

public final class Class_tjZiOwNclsIk6HpU {
   private static final String f_32038 = "ꔂ";
   private static final String f_32039 = "ꔃ";
   private static final String f_32040 = "ꔆ";
   private static final String f_32041 = "ꔇ";
   private static final Set<String> f_32042 = Set.of(
      Class_tjZiOwNclsIk6HpU.f_32085, Class_tjZiOwNclsIk6HpU.f_32086, Class_tjZiOwNclsIk6HpU.f_32087, Class_tjZiOwNclsIk6HpU.f_32088
   );
   private static final FontDescription f_32043 = new Resource(Identifier.fromNamespaceAndPath(Class_tjZiOwNclsIk6HpU.f_32089, Class_tjZiOwNclsIk6HpU.f_32090));
   private static final Style f_32044 = Style.EMPTY.withFont(f_32043).withColor(Class_tjZiOwNclsIk6HpU.f_32091).withBold(false);
   private static final Style f_32045 = Style.EMPTY.withColor(Class_tjZiOwNclsIk6HpU.f_32092).withBold(false);
   private static final String f_32046 = "ADMIN";
   private static final String f_32047 = "BETA";
   private static final String f_32048 = "YOUTUBE";
   private static final String f_32049 = "ADMIN";
   private static final String f_32050 = "BETA";
   private static final String f_32051 = "MEDIA";
   private static final String f_32052 = "USER";
   private static final String f_32053 = "DEFAULT";
   private static final String f_32054 = "ADMIN";
   private static final String f_32055 = "BETA";
   private static final String f_32056 = "YOUTUBE";
   private static final String f_32057 = "ꔂ";
   private static final String f_32058 = "ꔃ";
   private static final String f_32059 = "ꔆ";
   private static final String f_32060 = "ꔇ";
   private static final String f_32061 = "ꔂ";
   private static final String f_32062 = "ꔃ";
   private static final String f_32063 = "ꔆ";
   private static final String f_32064 = "ꔇ";
   private static final String f_32065 = " ";
   private static final String f_32066 = "ꔂ";
   private static final String f_32067 = "ꔂ";
   private static final String f_32068 = "ꔃ";
   private static final String f_32069 = "ꔃ";
   private static final String f_32070 = "ꔆ";
   private static final String f_32071 = "ꔆ";
   private static final String f_32072 = "ꔇ";
   private static final String f_32073 = "ꔇ";
   private static final String f_32074 = "DEFAULT";
   private static final String f_32075 = "ADMIN";
   private static final String f_32076 = "ADMINISTRATOR";
   private static final String f_32077 = "BETA";
   private static final String f_32078 = "YOUTUBE";
   private static final String f_32079 = "MEDIA";
   private static final String f_32080 = "YOUTUBER";
   private static final String f_32081 = "ADMIN";
   private static final String f_32082 = "BETA";
   private static final String f_32083 = "YOUTUBE";
   private static final String f_32084 = "DEFAULT";
   private static final String f_32085 = "ADMIN";
   private static final String f_32086 = "BETA";
   private static final String f_32087 = "YOUTUBE";
   private static final String f_32088 = "DEFAULT";
   private static final String f_32089 = "dimasik";
   private static final String f_32090 = "roles";
   private static final int f_32091 = 16777215;
   private static final int f_32092 = 13158600;

   private Class_tjZiOwNclsIk6HpU() {
   }

   public static String m_8934() {
      return "cracked by @soezproject & Vkontakt3";
   }

   private static Component m_8935(String var0, String var1) {
      MutableComponent var2 = Component.empty();
      if (!var0.isEmpty()) {
         var2.append(Component.literal(var0).setStyle(f_32044));
         var2.append(f_32065);
      }

      return var2.append(Component.literal(var1).setStyle(f_32045));
   }

   private static String m_8936(String var0) {
      if (var0.startsWith(f_32066)) {
         return f_32067;
      } else if (var0.startsWith(f_32068)) {
         return f_32069;
      } else if (var0.startsWith(f_32070)) {
         return f_32071;
      } else {
         return var0.startsWith(f_32072) ? f_32073 : "";
      }
   }

   public static boolean m_8937(String var0) {
      return var0 == null || f_32042.contains(var0.trim().toUpperCase(Locale.ROOT));
   }

   public static Component m_8938(Class_YWsKkU1Pvrv9cQed var0) {
      return m_8935(m_8940(var0.role()), var0.member() + var0.text());
   }

   public static boolean m_8939() {
      return false;
   }

   public static String m_8940(String var0) {
      if (var0 != null && !var0.isBlank()) {
         return switch (m_8946(var0)) {
            case f_32054 -> f_32057;
            case f_32055 -> f_32058;
            case f_32056 -> f_32059;
            default -> f_32060;
         };
      } else {
         return "";
      }
   }

   public static String m_8941(Class_YWsKkU1Pvrv9cQed var0) {
      String var1 = m_8940(var0.role());
      return (var1.isEmpty() ? "" : var1 + "") + var0.member() + var0.text();
   }

   public static Component m_8942(String var0, String var1) {
      String var2 = var1 == null ? "" : var1;
      String var3 = m_8936(var2);
      if (!var3.isEmpty()) {
         var2 = var2.substring(var3.length()).stripLeading();
      }

      return m_8935(var3, var0 + var2);
   }

   public static String m_8943(String var0) {
      String var1 = var0 == null ? "" : var0;
      return !var1.startsWith(f_32061) && !var1.startsWith(f_32062) && !var1.startsWith(f_32063) && !var1.startsWith(f_32064) ? m_8940(m_8934()) + var1 : var1;
   }

   public static String m_8944(String var0, String var1) {
      String var2 = var1 == null ? "" : var1;
      String var3 = m_8936(var2);
      if (!var3.isEmpty()) {
         var2 = var2.substring(var3.length()).stripLeading();
      }

      return (var3.isEmpty() ? "" : var3 + "") + var0 + var2;
   }

   public static String m_8945(String var0) {
      return switch (m_8946(var0)) {
         case f_32046 -> f_32049;
         case f_32047 -> f_32050;
         case f_32048 -> f_32051;
         default -> f_32052;
      };
   }

   private static String m_8946(String var0) {
      String var1 = var0 == null ? f_32074 : var0.trim().toUpperCase(Locale.ROOT);

      return switch (var1) {
         case f_32075, f_32076 -> f_32081;
         case f_32077 -> f_32082;
         case f_32078, f_32079, f_32080 -> f_32083;
         default -> f_32084;
      };
   }
}
