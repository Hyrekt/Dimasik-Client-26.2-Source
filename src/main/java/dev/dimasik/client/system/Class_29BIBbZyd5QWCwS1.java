package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.NameProtect;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.locale.Language;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.util.FormattedCharSequence;
import net.minecraft.world.entity.player.Player;

public final class Class_29BIBbZyd5QWCwS1 {
   private static final String f_683 = "Protected";
   private static final Pattern f_684 = Pattern.compile(Class_29BIBbZyd5QWCwS1.f_715);
   private static final Pattern f_685 = Pattern.compile(Class_29BIBbZyd5QWCwS1.f_716);
   private static final String f_686 = "mc.ReallyWorld.me";
   private static final String f_687 = "dimasclient.fun";
   private static final String f_688 = "ReallyWorld.ru";
   private static final String f_689 = "dimasclient.fun";
   private static final String f_690 = "vk.com/reallyworlds";
   private static final String f_691 = "t.me/dimasikdlc";
   private static final Object f_692 = new Object();
   private static final ThreadLocal<Integer> f_693 = ThreadLocal.withInitial(() -> 0);
   private static final ThreadLocal<Integer> f_694 = ThreadLocal.withInitial(() -> 0);
   private static final ThreadLocal<Integer> f_695 = ThreadLocal.withInitial(() -> 0);
   private static final ThreadLocal<Integer> f_696 = ThreadLocal.withInitial(() -> 0);
   private static int f_697;
   private static volatile String f_698 = "";
   private static volatile String f_699 = "";
   private static volatile int f_700 = Class_29BIBbZyd5QWCwS1.f_717;
   private static volatile Class_29BIBbZyd5QWCwS1.NZBngs15gqSIHdys f_701 = Class_29BIBbZyd5QWCwS1.NZBngs15gqSIHdys.empty();
   private static final ThreadLocal<Class_29BIBbZyd5QWCwS1.E31ppc6lt5h7BB07> f_702 = ThreadLocal.withInitial(Class_29BIBbZyd5QWCwS1.E31ppc6lt5h7BB07::new);
   private static final String f_703 = "???";
   private static final String f_704 = "mc.ReallyWorld.me";
   private static final String f_705 = "dimasclient.fun";
   private static final String f_706 = "ReallyWorld.ru";
   private static final String f_707 = "dimasclient.fun";
   private static final String f_708 = "vk.com/reallyworlds";
   private static final String f_709 = "t.me/dimasikdlc";
   private static final int f_710 = Integer.MIN_VALUE;
   private static final String f_711 = "Protected";
   private static final String f_712 = "Protected";
   private static final long f_713 = Long.MIN_VALUE;
   private static final String f_714 = "Protected";
   private static final String f_715 = "(?iu)ГРИФ\\s*#\\s*(\\d+)";
   private static final String f_716 = "(?iu)Клан\\s*:\\s*(.+)";
   private static final int f_717 = Integer.MIN_VALUE;

   private static Component m_930(Component var0, String var1, List<Class_29BIBbZyd5QWCwS1.h11vCuWr51MZ3mMO> var2) {
      if (var2.isEmpty()) {
         return var0;
      }

      ArrayList var3 = new ArrayList(var1.length());
      var0.visit((var1x, var2x) -> {
         for (int var3x = 0; var3x < var2x.length(); var3x++) {
            var3.add(var1x);
         }

         return Optional.empty();
      }, Style.EMPTY);
      if (var3.size() != var1.length()) {
         return var0;
      }

      MutableComponent var4 = Component.empty();
      int var5 = 0;

      for (Class_29BIBbZyd5QWCwS1.h11vCuWr51MZ3mMO var7 : var2) {
         if (var7.start() >= var5 && var7.end() <= var1.length()) {
            m_951(var4, var1, var3, var5, var7.start());
            m_968(var4, var7.value(), var3, var7.start(), var7.end());
            var5 = var7.end();
         }
      }

      m_951(var4, var1, var3, var5, var1.length());
      return var4;
   }

   public static Component m_931(Component var0) {
      if (var0 != null && m_993()) {
         Component var1 = m_961(var0);
         return m_1000(var1, false);
      } else {
         return var0;
      }
   }

   public static boolean m_932() {
      return f_697 > 0;
   }

   public static Component m_933(Component var0) {
      return m_1000(var0, true);
   }

   public static void m_934() {
      int var0 = f_696.get() - 1;
      if (var0 <= 0) {
         f_696.remove();
      } else {
         f_696.set(var0);
      }
   }

   private static Class_29BIBbZyd5QWCwS1.E31ppc6lt5h7BB07 m_935(Class_29BIBbZyd5QWCwS1.NZBngs15gqSIHdys var0) {
      Class_29BIBbZyd5QWCwS1.E31ppc6lt5h7BB07 var1 = f_702.get();
      Minecraft var2 = Minecraft.getInstance();
      NameProtect var3 = DimasikClient.m_9057().m_9049().m_2801().m_3484();
      char var4 = var3.m_2052() ? var3.m_2050() : '\u0000';
      String var5 = var3.m_2064() ? var3.m_2054() : null;
      boolean var6 = var3.m_2060();
      boolean var7 = var3.m_2058();
      Language var8 = Language.getInstance();
      String var9 = var1.f_673;
      long var10 = var2.level == null ? f_713 : var2.level.getGameTime();
      if (var4 != 0 && (var10 != var1.f_674 || var1.f_670 != var2.level || var1.f_669 != var0 || var1.f_672 != var4)) {
         var9 = m_985();
         var1.f_674 = var10;
      }

      if (var1.f_669 != var0
         || var1.f_670 != var2.level
         || var1.f_671 != var8
         || var1.f_672 != var4
         || !Objects.equals(var1.f_673, var9)
         || !Objects.equals(var1.f_675, var5)
         || var1.f_676 != var6
         || var1.f_677 != var7) {
         var1.f_678.clear();
         var1.f_679.m_1316();
         var1.f_680.m_1316();
         var1.f_681.m_1316();
         var1.f_669 = var0;
         var1.f_670 = var2.level;
         var1.f_671 = var8;
         var1.f_672 = var4;
         var1.f_673 = var9;
         var1.f_675 = var5;
         var1.f_676 = var6;
         var1.f_677 = var7;
      }

      return var1;
   }

   private static Component m_936(Component var0, Pattern var1, int var2, String var3) {
      if (var0 != null && var1 != null) {
         String var4 = m_980(var0);
         Matcher var5 = var1.matcher(var4);
         ArrayList var6 = new ArrayList();

         while (var5.find()) {
            var6.add(new Class_29BIBbZyd5QWCwS1.h11vCuWr51MZ3mMO(var5.start(var2), var5.end(var2), var3));
         }

         return m_930(var0, var4, var6);
      } else {
         return var0;
      }
   }

   private static String m_937(String var0) {
      if (var0 != null && !var0.isEmpty()) {
         boolean var1 = false;

         for (int var2 = 0; var2 < var0.length(); var2++) {
            if (Class_JInbhwbvIxCoRpXA.m_3256(var0.charAt(var2))) {
               var1 = true;
               break;
            }
         }

         if (!var1) {
            return var0;
         }

         if (!DimasikClient.m_9057().m_9049().m_2801().m_3484().m_2052()) {
            return var0;
         }

         boolean[] var7 = m_960(var0);
         if (var7 == null) {
            return var0;
         }

         char var3 = DimasikClient.m_9057().m_9049().m_2801().m_3484().m_2050();
         char[] var4 = var0.toCharArray();
         boolean var5 = false;

         for (int var6 = 0; var6 < var4.length; var6++) {
            if (var7[var6] && Class_JInbhwbvIxCoRpXA.m_3256(var4[var6])) {
               var4[var6] = var3;
               var5 = true;
            }
         }

         return var5 ? new String(var4) : var0;
      } else {
         return var0;
      }
   }

   private static boolean m_938(String var0, String var1) {
      String var2 = var0.toLowerCase(Locale.ROOT);
      if (var2.equals(var1)) {
         return true;
      }

      if (!var2.startsWith(var1 + "")) {
         return false;
      }

      for (int var3 = var1.length() + 1; var3 < var2.length(); var3++) {
         if (!Character.isDigit(var2.charAt(var3))) {
            return false;
         }
      }

      return true;
   }

   public static Component m_940(Component var0) {
      return m_1000(var0, false);
   }

   public static void m_941() {
      f_698 = "";
      f_699 = "";
      f_700 = f_710;
      f_701 = Class_29BIBbZyd5QWCwS1.NZBngs15gqSIHdys.empty();
   }

   private static void m_942(MutableComponent var0, String var1, List<Style> var2, int var3, int var4, Style var5) {
      if (var1 != null && !var1.isEmpty()) {
         int var6 = Math.max(1, var4 - var3);
         int var7 = var1.length();
         int var8 = 0;
         Style var9 = null;

         for (int var10 = 0; var10 < var7; var10++) {
            Style var11 = var5;
            if (var11 == null) {
               int var12 = Math.min(var6 - 1, (int)((long)var10 * var6 / var7));
               int var13 = Math.min(var2.size() - 1, var3 + var12);
               var11 = var13 >= 0 ? (Style)var2.get(var13) : Style.EMPTY;
            }

            if (var10 > 0 && !Objects.equals(var9, var11)) {
               var0.append(Component.literal(var1.substring(var8, var10)).setStyle(var9));
               var8 = var10;
            }

            var9 = var11;
         }

         var0.append(Component.literal(var1.substring(var8)).setStyle(var9));
      }
   }

   public static void m_943() {
      int var0 = f_695.get() - 1;
      if (var0 <= 0) {
         f_695.remove();
      } else {
         f_695.set(var0);
      }
   }

   private static String m_944() {
      Minecraft var0 = Minecraft.getInstance();
      return var0 != null && var0.player != null ? var0.player.getGameProfile().name() : null;
   }

   public static String m_945(String var0) {
      return m_988(var0);
   }

   public static FormattedCharSequence m_948(FormattedCharSequence var0) {
      if (var0 == null || !m_993()) {
         return var0;
      }

      if (!DimasikClient.m_9057().m_9049().m_2801().m_3484().m_2052()) {
         return var0;
      }

      boolean[] var1 = m_984(var0);
      if (var1 == null) {
         return var0;
      }

      char var2 = DimasikClient.m_9057().m_9049().m_2801().m_3484().m_2050();
      return var3 -> var0.accept((var3x, var4, var5) -> {
         if (var3x >= 0 && var3x < var1.length && var1[var3x] && Class_JInbhwbvIxCoRpXA.m_3256(var5)) {
            var5 = var2;
         }

         return var3.accept(var3x, var4, var5);
      });
   }

   private static Class_29BIBbZyd5QWCwS1.NZBngs15gqSIHdys m_949() {
      LinkedHashMap var0 = new LinkedHashMap();
      Minecraft var1 = Minecraft.getInstance();
      if (var1 != null && var1.player != null) {
         m_970(var0, var1.player.getGameProfile().name(), DimasikClient.m_9057().m_9049().m_2801().m_3484().m_2057());

         for (Class_GOZclSP08fljqFSO var3 : DimasikClient.m_9057().m_9049().m_2804()) {
            String var4 = var3.m_2796() ? var3.m_2797() : f_711;
            m_970(var0, var3.m_2795(), var4);
         }

         if (var0.isEmpty()) {
            return Class_29BIBbZyd5QWCwS1.NZBngs15gqSIHdys.empty();
         }

         ArrayList<String> var5 = new ArrayList<>(var0.keySet());
         var5.sort(Comparator.comparingInt(String::length).reversed());
         String var6 = var5.stream().map(Pattern::quote).reduce((var0x, var1x) -> var0x + var1x).orElse("");
         Pattern var7 = Pattern.compile(var6 + "");
         return new Class_29BIBbZyd5QWCwS1.NZBngs15gqSIHdys(var7, Map.copyOf(var0));
      } else {
         return Class_29BIBbZyd5QWCwS1.NZBngs15gqSIHdys.empty();
      }
   }

   private static Component m_950(Component var0, String var1) {
      String var2 = m_980(var0);
      Matcher var3 = f_685.matcher(var2);
      return !var3.find() ? var0 : m_1002(var0, var3.start(1), var3.end(1), var1, Style.EMPTY.withColor(ChatFormatting.DARK_GRAY));
   }

   private static void m_951(MutableComponent var0, String var1, List<Style> var2, int var3, int var4) {
      int var5 = var3;

      while (var5 < var4) {
         Style var6 = (Style)var2.get(var5);
         int var7 = var5 + 1;

         while (var7 < var4 && Objects.equals(var2.get(var7), var6)) {
            var7++;
         }

         var0.append(Component.literal(var1.substring(var5, var7)).setStyle(var6));
         var5 = var7;
      }
   }

   public static boolean m_952() {
      return f_694.get() > 0;
   }

   public static void m_953() {
      f_696.set(f_696.get() + 1);
   }

   private static Style m_955(List<Class_29BIBbZyd5QWCwS1.XAK04FhEIVjIp26N> var0, int var1) {
      for (Class_29BIBbZyd5QWCwS1.XAK04FhEIVjIp26N var3 : var0) {
         if (var1 >= var3.start() && var1 < var3.end()) {
            return var3.style();
         }
      }

      return Style.EMPTY;
   }

   public static Component m_956(Component var0) {
      if (var0 != null && m_993()) {
         NameProtect var1 = DimasikClient.m_9057().m_9049().m_2801().m_3484();
         if (!var1.m_2058()) {
            return var0;
         }

         Component var2 = m_964(var0, f_706, f_707);
         return m_964(var2, f_708, f_709);
      } else {
         return var0;
      }
   }

   public static void m_958() {
      if (f_697 > 0) {
         f_697--;
      }
   }

   public static void m_959() {
      f_694.set(f_694.get() + 1);
   }

   private static boolean[] m_960(String var0) {
      String var1 = m_944();
      if (var1 != null && !var1.isBlank()) {
         Class_29BIBbZyd5QWCwS1.NZBngs15gqSIHdys var2 = m_978();
         if (var2.isEmpty()) {
            return null;
         }

         boolean[] var3 = null;
         String var4 = m_985();
         if (var4 != null && !var4.isBlank()) {
            int var5 = 0;

            while (var5 <= var0.length() - var4.length()) {
               int var6 = m_979(var0, var4, var5);
               if (var6 < 0) {
                  break;
               }

               int var7 = var6 + var4.length();

               for (int var8 = var6; var8 < var7; var8++) {
                  if (Class_JInbhwbvIxCoRpXA.m_3256(var0.charAt(var8))) {
                     if (var3 == null) {
                        var3 = new boolean[var0.length()];
                     }

                     var3[var8] = true;
                  }
               }

               var5 = var7;
            }
         }

         String var10 = var1.toLowerCase(Locale.ROOT);
         Matcher var11 = var2.pattern().matcher(var0);

         while (var11.find()) {
            if (m_938(var11.group(), var10)) {
               int var12 = Math.max(0, var11.start() - 48);

               for (int var13 = var11.start() - 1; var13 >= var12; var13--) {
                  char var9 = var0.charAt(var13);
                  if (var9 == 187 || var9 == '\n' || var9 == '\r') {
                     break;
                  }

                  if (Class_JInbhwbvIxCoRpXA.m_3256(var9)) {
                     if (var3 == null) {
                        var3 = new boolean[var0.length()];
                     }

                     var3[var13] = true;
                     break;
                  }
               }
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   private static Component m_961(Component var0) {
      if (!DimasikClient.m_9057().m_9049().m_2801().m_3484().m_2052()) {
         return var0;
      }

      MutableComponent var1 = Component.empty();
      boolean[] var2 = new boolean[]{false};
      var0.visit((var2x, var3) -> {
         if (!var3.isEmpty()) {
            String var4 = DimasikClient.m_9057().m_9049().m_2801().m_3484().m_2055(var3);
            if (!var4.equals(var3)) {
               var2[0] = true;
            }

            var1.append(Component.literal(var4).setStyle(var2x));
         }

         return Optional.empty();
      }, Style.EMPTY);
      return (Component)(var2[0] ? var1 : var0);
   }

   private static Component m_962(Component var0) {
      Component var1 = m_933(var0);
      NameProtect var2 = DimasikClient.m_9057().m_9049().m_2801().m_3484();
      if (var2.m_2064()) {
         var1 = m_950(var1, var2.m_2054());
      }

      if (var2.m_2060()) {
         var1 = m_936(var1, f_684, 1, f_703);
      }

      if (var2.m_2058()) {
         var1 = m_964(var1, f_704, f_705);
      }

      return var1;
   }

   public static void m_963() {
      f_695.set(f_695.get() + 1);
   }

   private static Component m_964(Component var0, String var1, String var2) {
      if (var0 != null && var1 != null && !var1.isEmpty()) {
         String var3 = m_980(var0);
         ArrayList var4 = new ArrayList();
         int var5 = 0;

         while (var5 <= var3.length() - var1.length()) {
            int var6 = m_979(var3, var1, var5);
            if (var6 < 0) {
               break;
            }

            var4.add(new Class_29BIBbZyd5QWCwS1.h11vCuWr51MZ3mMO(var6, var6 + var1.length(), var2));
            var5 = var6 + var1.length();
         }

         return m_930(var0, var3, var4);
      } else {
         return var0;
      }
   }

   private static String m_965(String var0, Class_29BIBbZyd5QWCwS1.NZBngs15gqSIHdys var1) {
      if (var1.isEmpty()) {
         return var0;
      }

      Class_29BIBbZyd5QWCwS1.E31ppc6lt5h7BB07 var2 = m_935(var1);
      String var3 = var2.f_678.get(var0);
      if (var3 != null) {
         return var3;
      }

      String var4 = m_966(m_937(var0), var1);
      if (var0.length() <= 4096) {
         if (var2.f_678.size() >= 512) {
            var2.f_678.clear();
         }

         var2.f_678.put(var0, var4);
      }

      return var4;
   }

   private static String m_966(String var0, Class_29BIBbZyd5QWCwS1.NZBngs15gqSIHdys var1) {
      Matcher var2 = var1.pattern().matcher(var0);
      if (!var2.find()) {
         return var0;
      }

      StringBuffer var3 = new StringBuffer(var0.length());

      do {
         String var4 = m_992(var2.group(), var1);
         var2.appendReplacement(var3, Matcher.quoteReplacement(var4));
      } while (var2.find());

      var2.appendTail(var3);
      return var3.toString();
   }

   private static void m_968(MutableComponent var0, String var1, List<Style> var2, int var3, int var4) {
      m_942(var0, var1, var2, var3, var4, null);
   }

   public static void m_969() {
      int var0 = f_694.get() - 1;
      if (var0 <= 0) {
         f_694.remove();
      } else {
         f_694.set(var0);
      }
   }

   private static void m_970(Map<String, String> var0, String var1, String var2) {
      if (var1 != null && !var1.isBlank()) {
         var0.putIfAbsent(var1.toLowerCase(Locale.ROOT), var2 != null && !var2.isBlank() ? var2 : f_712);
      }
   }

   private static void m_971(MutableComponent var0, List<Class_29BIBbZyd5QWCwS1.XAK04FhEIVjIp26N> var1, int var2, int var3, String var4) {
      if (var2 < var3) {
         for (Class_29BIBbZyd5QWCwS1.XAK04FhEIVjIp26N var6 : var1) {
            int var7 = Math.max(var2, var6.start());
            int var8 = Math.min(var3, var6.end());
            if (var7 < var8) {
               var0.append(Component.literal(var4.substring(var7, var8)).setStyle(var6.style()));
            }
         }
      }
   }

   public static Component m_972(Component var0) {
      if (var0 != null && m_993()) {
         Class_29BIBbZyd5QWCwS1.E31ppc6lt5h7BB07 var1 = m_935(m_978());
         Class_29BIBbZyd5QWCwS1.rc4CEkdSq7BuEY3q var2 = var1.f_681.m_1318(var0, var0x -> {
            Component var1x = m_962(var0x);
            return new Class_29BIBbZyd5QWCwS1.rc4CEkdSq7BuEY3q(var1x == var0x ? null : var1x);
         });
         return var2.value == null ? var0 : var2.value;
      } else {
         return var0;
      }
   }

   public static int m_973() {
      if (!m_993()) {
         return 0;
      }

      Minecraft var0 = Minecraft.getInstance();
      NameProtect var1 = DimasikClient.m_9057().m_9049().m_2801().m_3484();
      int var2 = 1;
      var2 = 31 * var2 + var0.player.getGameProfile().name().hashCode();
      var2 = 31 * var2 + var1.m_2057().hashCode();
      var2 = 31 * var2 + DimasikClient.m_9057().m_9049().m_2804().m_2872();
      var2 = 31 * var2 + (var1.m_2052() ? var1.m_2050() : '\u0000');
      return 31 * var2 + (var1.m_2058() ? 1 : 0);
   }

   public static boolean m_974() {
      return f_695.get() > 0;
   }

   public static boolean m_975() {
      return f_696.get() > 0;
   }

   public static boolean m_976() {
      return f_693.get() > 0;
   }

   public static void m_977() {
      int var0 = f_693.get() - 1;
      if (var0 <= 0) {
         f_693.remove();
      } else {
         f_693.set(var0);
      }
   }

   private static Class_29BIBbZyd5QWCwS1.NZBngs15gqSIHdys m_978() {
      if (!m_993()) {
         return Class_29BIBbZyd5QWCwS1.NZBngs15gqSIHdys.empty();
      }

      Minecraft var0 = Minecraft.getInstance();
      if (var0 != null && var0.player != null) {
         String var1 = var0.player.getGameProfile().name();
         String var2 = DimasikClient.m_9057().m_9049().m_2801().m_3484().m_2057();
         int var3 = DimasikClient.m_9057().m_9049().m_2804().m_2872();
         if (var1.equalsIgnoreCase(f_698) && var2.equals(f_699) && var3 == f_700) {
            return f_701;
         }

         synchronized (f_692) {
            if (var1.equalsIgnoreCase(f_698) && var2.equals(f_699) && var3 == f_700) {
               return f_701;
            }

            f_701 = m_949();
            f_698 = var1;
            f_699 = var2;
            f_700 = var3;
            return f_701;
         }
      } else {
         return Class_29BIBbZyd5QWCwS1.NZBngs15gqSIHdys.empty();
      }
   }

   private static int m_979(String var0, String var1, int var2) {
      int var3 = var0.length() - var1.length();

      for (int var4 = Math.max(0, var2); var4 <= var3; var4++) {
         if (var0.regionMatches(true, var4, var1, 0, var1.length())) {
            return var4;
         }
      }

      return -1;
   }

   private static String m_980(Component var0) {
      m_982();

      try {
         return var0.getString();
      } finally {
         m_977();
      }
   }

   public static Component m_981(Component var0, String var1) {
      if (var0 == null) {
         return Component.literal(m_1004(var1));
      }

      if (!m_993()) {
         return var0;
      }

      String var2 = m_1004(var1);
      return (Component)(var2 != null && !var2.equals(var1) ? Component.literal(var2).setStyle(var0.getStyle()) : var0);
   }

   public static void m_982() {
      f_693.set(f_693.get() + 1);
   }

   public static String m_983(String var0) {
      return m_988(var0);
   }

   private static boolean[] m_984(FormattedCharSequence var0) {
      StringBuilder var1 = new StringBuilder();
      var0.accept((var1x, var2, var3) -> {
         var1.appendCodePoint(var3);
         return true;
      });
      return m_960(var1.toString());
   }

   private static String m_985() {
      Minecraft var0 = Minecraft.getInstance();
      return var0 != null && var0.player != null ? m_980(var0.player.getDisplayName()) : null;
   }

   private Class_29BIBbZyd5QWCwS1() {
   }

   public static String m_988(String var0) {
      return var0 != null && !var0.isEmpty() && m_993() ? m_965(var0, m_978()) : var0;
   }

   public static Component m_989(Component var0) {
      return m_1000(var0, true);
   }

   private static String m_992(String var0, Class_29BIBbZyd5QWCwS1.NZBngs15gqSIHdys var1) {
      String var2 = var0.toLowerCase(Locale.ROOT);
      String var3 = var1.replacements().get(var2);
      if (var3 != null) {
         return var3;
      }

      int var4 = var2.lastIndexOf(95);
      if (var4 > 0 && var4 + 1 < var2.length()) {
         boolean var5 = true;

         for (int var6 = var4 + 1; var6 < var2.length(); var6++) {
            if (!Character.isDigit(var2.charAt(var6))) {
               var5 = false;
               break;
            }
         }

         if (var5) {
            var3 = var1.replacements().get(var2.substring(0, var4));
            if (var3 != null) {
               return var3;
            }
         }
      }

      return f_714;
   }

   public static boolean m_993() {
      Minecraft var0 = Minecraft.getInstance();
      return var0 != null
         && var0.player != null
         && DimasikClient.m_9057() != null
         && DimasikClient.m_9057().m_9049() != null
         && DimasikClient.m_9057().m_9049().m_2801() != null
         && DimasikClient.m_9057().m_9049().m_2801().m_3484() != null
         && DimasikClient.m_9057().m_9049().m_2801().m_3484().m_776();
   }

   private static Component m_995(Component var0, boolean var1) {
      Class_29BIBbZyd5QWCwS1.NZBngs15gqSIHdys var2 = m_978();
      if (var2.isEmpty()) {
         return var0;
      }

      String var3 = var0.getString();
      String var4 = var1 ? m_937(var3) : var3;
      Matcher var5 = var2.pattern().matcher(var4);
      if (!var5.find()) {
         return var0;
      }

      ArrayList var6 = new ArrayList();
      int[] var7 = new int[]{0};
      var0.visit((var2x, var3x) -> {
         if (!var3x.isEmpty()) {
            int var4x = var7[0];
            var7[0] += var3x.length();
            var6.add(new Class_29BIBbZyd5QWCwS1.XAK04FhEIVjIp26N(var4x, var7[0], var3x, var2x));
         }

         return Optional.empty();
      }, Style.EMPTY);
      MutableComponent var8 = Component.empty();
      int var9 = 0;

      do {
         m_971(var8, var6, var9, var5.start(), var4);
         String var10 = m_992(var5.group(), var2);
         var8.append(Component.literal(var10).setStyle(m_955(var6, var5.start())));
         var9 = var5.end();
      } while (var5.find());

      m_971(var8, var6, var9, var4.length(), var4);
      return var8;
   }

   public static String m_997(Player var0) {
      return var0 == null ? "" : m_1004(var0.getGameProfile().name());
   }

   public static void m_998() {
      f_697++;
   }

   private static Component m_1000(Component var0, boolean var1) {
      if (var0 != null && m_993()) {
         Class_29BIBbZyd5QWCwS1.E31ppc6lt5h7BB07 var2 = m_935(m_978());
         Class_3dmyjp6zjiPOb8Hv var3 = var1 ? var2.f_679 : var2.f_680;
         Class_29BIBbZyd5QWCwS1.rc4CEkdSq7BuEY3q var4 = (Class_29BIBbZyd5QWCwS1.rc4CEkdSq7BuEY3q) var3.m_1318(var0, var1x -> {
            Component var2x = m_995((Component) var1x, var1);
            return new Class_29BIBbZyd5QWCwS1.rc4CEkdSq7BuEY3q(var2x == var1x ? null : var2x);
         });
         return var4.value == null ? var0 : var4.value;
      } else {
         return var0;
      }
   }

   private static Component m_1002(Component var0, int var1, int var2, String var3, Style var4) {
      String var5 = m_980(var0);
      if (var1 >= 0 && var2 >= var1 && var2 <= var5.length()) {
         ArrayList var6 = new ArrayList(var5.length());
         var0.visit((var1x, var2x) -> {
            for (int var3x = 0; var3x < var2x.length(); var3x++) {
               var6.add(var1x);
            }

            return Optional.empty();
         }, Style.EMPTY);
         if (var6.size() != var5.length()) {
            return var0;
         }

         MutableComponent var7 = Component.empty();
         m_951(var7, var5, var6, 0, var1);
         m_942(var7, var3, var6, var1, var2, var4);
         m_951(var7, var5, var6, var2, var5.length());
         return var7;
      } else {
         return var0;
      }
   }

   public static String m_1004(String var0) {
      if (var0 != null && !var0.isBlank() && m_993()) {
         String var1 = m_978().replacements().get(var0.toLowerCase(Locale.ROOT));
         return var1 == null ? var0 : var1;
      } else {
         return var0;
      }
   }

   private static final class E31ppc6lt5h7BB07 {
      public Class_29BIBbZyd5QWCwS1.NZBngs15gqSIHdys f_669;
      public Object f_670;
      public Object f_671;
      public int f_672;
      public String f_673 = "";
      public long f_674;
      public String f_675;
      public boolean f_676;
      public boolean f_677;
      public final Map<String, String> f_678;
      public final Class_3dmyjp6zjiPOb8Hv<Class_29BIBbZyd5QWCwS1.rc4CEkdSq7BuEY3q> f_679;
      public final Class_3dmyjp6zjiPOb8Hv<Class_29BIBbZyd5QWCwS1.rc4CEkdSq7BuEY3q> f_680;
      public final Class_3dmyjp6zjiPOb8Hv<Class_29BIBbZyd5QWCwS1.rc4CEkdSq7BuEY3q> f_681;
      public static final long f_682 = Long.MIN_VALUE;

      public E31ppc6lt5h7BB07() {
         this.f_674 = f_682;
         this.f_678 = new HashMap<>();
         this.f_679 = new Class_3dmyjp6zjiPOb8Hv<>(256);
         this.f_680 = new Class_3dmyjp6zjiPOb8Hv<>(256);
         this.f_681 = new Class_3dmyjp6zjiPOb8Hv<>(128);
      }
   }

   private record NZBngs15gqSIHdys(Pattern pattern, Map<String, String> replacements) {
      public boolean isEmpty() {
         return this.pattern == null || this.replacements.isEmpty();
      }

      public static Class_29BIBbZyd5QWCwS1.NZBngs15gqSIHdys empty() {
         return new Class_29BIBbZyd5QWCwS1.NZBngs15gqSIHdys(null, Map.of());
      }
   }

   private record XAK04FhEIVjIp26N(int start, int end, String value, Style style) {
   }

   private record h11vCuWr51MZ3mMO(int start, int end, String value) {
   }

   private record rc4CEkdSq7BuEY3q(Component value) {
   }
}
