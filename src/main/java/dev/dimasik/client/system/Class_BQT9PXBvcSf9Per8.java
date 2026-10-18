package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.NameProtect;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;

public final class Class_BQT9PXBvcSf9Per8 {
   private static final Pattern f_5771 = Pattern.compile(Class_BQT9PXBvcSf9Per8.f_5791);
   private static final int f_5772 = 32;
   private static final int f_5773 = 9;
   private static final Map<String, String> f_5774 = new ConcurrentHashMap<>();
   private static final ThreadLocal<Boolean> f_5775 = ThreadLocal.withInitial(() -> false);
   private static final Map<String, Optional<Class_BQT9PXBvcSf9Per8.Class_2aR5PtofAtKtr9oj>> f_5776 = new LinkedHashMap<>(
      64, Class_BQT9PXBvcSf9Per8.f_5792, true
   );
   private static final Class_3dmyjp6zjiPOb8Hv<Class_BQT9PXBvcSf9Per8.Class_1fnqprBQcMEa4uUc> f_5777 = new Class_3dmyjp6zjiPOb8Hv<>(128);
   private static boolean f_5778;
   private static final List<Class_BQT9PXBvcSf9Per8.bOEz2p8ILokhTqEI> f_5779 = new ArrayList<>();
   private static volatile List<Class_BQT9PXBvcSf9Per8.bOEz2p8ILokhTqEI> f_5780 = List.of();
   private static String f_5781;
   private static String f_5782 = "";
   private static String f_5783 = "";
   private static boolean f_5784;
   private static final long f_5785 = 400L;
   private static final String f_5786 = "0";
   private static final double f_5787 = 11.0;
   private static final int f_5788 = -670398;
   private static final int f_5789 = 1728053247;
   private static final long f_5790 = 2L;
   private static final String f_5791 = "\\d+(?:[.,]\\d+)*";
   private static final float f_5792 = 0.75F;

   private static void m_2235() {
      f_5776.clear();
      f_5777.m_1316();
   }

   private static void m_2236() {
      f_5781 = null;
      f_5783 = "";
      f_5784 = false;
      m_2235();
   }

   private static Class_BQT9PXBvcSf9Per8.Class_2aR5PtofAtKtr9oj m_2237(String var0, Class_BQT9PXBvcSf9Per8.TB7iKUBBu7diImfg var1) {
      Matcher var2 = f_5771.matcher(var0);
      if (!var2.find()) {
         return null;
      }

      String var3 = var2.group();
      String var4 = m_2255(var1.name(), var3);
      String var5 = var0.substring(0, var2.start()) + var4 + var0.substring(var2.end());
      return new Class_BQT9PXBvcSf9Per8.Class_2aR5PtofAtKtr9oj(
         var5, List.of(new Class_BQT9PXBvcSf9Per8.hRQXZMCkQ4zi96uQ(var1.name(), var3, var2.start(), var2.end(), var2.start(), var2.start() + var4.length()))
      );
   }

   public static boolean m_2238(String var0) {
      if (!m_2258() || f_5781 == null || var0 == null || var0.isEmpty()) {
         return false;
      }

      if (Character.isISOControl(var0.charAt(0))) {
         return false;
      }

      if (f_5784) {
         f_5783 = "";
         f_5784 = false;
      }

      if (f_5783.codePointCount(0, f_5783.length()) >= 32) {
         return true;
      }

      f_5783 = f_5783 + var0;
      m_2235();
      return true;
   }

   public static boolean m_2239(float var0, float var1, int var2) {
      if (m_2258() && var2 == 0) {
         for (int var3 = f_5780.size() - 1; var3 >= 0; var3--) {
            Class_BQT9PXBvcSf9Per8.bOEz2p8ILokhTqEI var4 = f_5780.get(var3);
            if (!(var0 < var4.x) && !(var1 < var4.y) && !(var0 > var4.x + var4.width) && !(var1 > var4.y + var4.height)) {
               m_2240();
               m_2248(var4.key(), m_2255(var4.key(), var4.original()));
               return true;
            }
         }

         if (f_5781 != null) {
            m_2240();
         }

         return false;
      } else {
         return false;
      }
   }

   private static void m_2240() {
      if (f_5781 != null) {
         String var0 = f_5783 == null ? "" : f_5783;
         if (!var0.isEmpty() && !var0.equals(f_5782)) {
            f_5774.put(f_5781, var0);
         } else {
            f_5774.remove(f_5781);
         }

         f_5781 = null;
         f_5783 = "";
         f_5784 = false;
         m_2235();
      }
   }

   public static void m_2242(GuiGraphicsExtractor var0, Font var1, Component var2, int var3, int var4) {
      if (m_2254() && var2 != null && var1 != null) {
         Minecraft var5 = Minecraft.getInstance();
         if (var5.gui.screen() instanceof ChatScreen) {
            Class_BQT9PXBvcSf9Per8.Class_2aR5PtofAtKtr9oj var6 = m_2252(var2.getString());
            if (var6 != null) {
               double var7 = var5.getWindow().getGuiScale();
               long var9 = System.currentTimeMillis() / f_5785;

               for (Class_BQT9PXBvcSf9Per8.hRQXZMCkQ4zi96uQ var12 : var6.spans) {
                  String var13 = var6.output.substring(0, var12.start);
                  String var14 = var6.output.substring(var12.start, var12.end);
                  int var15 = var1.width(var13);
                  int var16 = Math.max(4, var1.width(var14.isEmpty() ? f_5786 : var14));
                  int var17 = var3 + var15;
                  float var18 = Class_UiQ3442HnvvsK2qb.m_5278();
                  float var19 = Class_UiQ3442HnvvsK2qb.m_5274();
                  f_5779.add(
                     new Class_BQT9PXBvcSf9Per8.bOEz2p8ILokhTqEI(
                        var12.key, var12.original, (var17 - 1 + var18) * var7, (var4 - 1 + var19) * var7, (var16 + 2) * var7, f_5787 * var7
                     )
                  );
                  boolean var20 = var12.key.equals(f_5781);
                  int var21 = var20 ? f_5788 : f_5789;
                  var0.fill(var17, var4 + 9 - 1, var17 + var16, var4 + 9, var21);
                  if (var20 && var9 % f_5790 == 0L) {
                     int var22 = var17 + var1.width(f_5783);
                     var0.fill(var22, var4, var22 + 1, var4 + 9 - 1, -1);
                  }
               }
            }
         }
      }
   }

   public static boolean m_2244(int var0) {
      if (m_2258() && f_5781 != null) {
         switch (var0) {
            case 256:
               m_2236();
               return true;
            case 257:
            case 335:
               m_2240();
               return true;
            case 259:
            case 261:
               if (f_5784) {
                  f_5783 = "";
                  f_5784 = false;
               } else if (!f_5783.isEmpty()) {
                  f_5783 = f_5783.substring(0, f_5783.offsetByCodePoints(f_5783.length(), -1));
               }

               m_2235();
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   private static Component m_2245(Component var0, Class_BQT9PXBvcSf9Per8.Class_2aR5PtofAtKtr9oj var1) {
      String var2 = var0.getString();
      ArrayList var3 = new ArrayList(var2.length());
      var0.visit((var1x, var2x) -> {
         for (int var3x = 0; var3x < var2x.length(); var3x++) {
            var3.add(var1x);
         }

         return Optional.empty();
      }, Style.EMPTY);
      if (var3.size() != var2.length()) {
         return Component.literal(var1.output).setStyle(var0.getStyle());
      }

      MutableComponent var4 = Component.empty();
      int var5 = 0;
      int var6 = 0;

      while (var5 < var2.length()) {
         if (var6 < var1.spans.size() && var5 == var1.spans.get(var6).origStart) {
            Class_BQT9PXBvcSf9Per8.hRQXZMCkQ4zi96uQ var10 = var1.spans.get(var6++);
            Style var11 = (Style)var3.get(Math.min(var10.origStart, var3.size() - 1));
            var4.append(Component.literal(var1.output.substring(var10.start, var10.end)).setStyle(var11));
            var5 = var10.origEnd;
         } else {
            int var7 = var6 < var1.spans.size() ? var1.spans.get(var6).origStart : var2.length();
            int var8 = var5;
            Style var9 = (Style)var3.get(var8);
            var5++;

            while (var5 < var7 && Objects.equals(var3.get(var5), var9)) {
               var5++;
            }

            var4.append(Component.literal(var2.substring(var8, var5)).setStyle(var9));
         }
      }

      return var4;
   }

   public static void m_2246() {
      f_5779.clear();
      boolean var0 = m_2258();
      f_5775.set(var0);
      if (f_5778 != var0) {
         m_2235();
         f_5778 = var0;
      }

      if (!var0) {
         f_5781 = null;
         f_5784 = false;
      }
   }

   public static Component m_2247(Component var0) {
      if (m_2254() && var0 != null) {
         Class_BQT9PXBvcSf9Per8.Class_1fnqprBQcMEa4uUc var1 = f_5777.m_1318(var0, var0x -> {
            String var1x = var0x.getString();
            Class_BQT9PXBvcSf9Per8.Class_2aR5PtofAtKtr9oj var2 = m_2252(var1x);
            return new Class_BQT9PXBvcSf9Per8.Class_1fnqprBQcMEa4uUc(var2 != null && !var2.output.equals(var1x) ? m_2245(var0x, var2) : null);
         });
         return var1.value == null ? var0 : var1.value;
      } else {
         return var0;
      }
   }

   private static void m_2248(String var0, String var1) {
      f_5781 = var0;
      f_5782 = m_2249(var0, var1);
      f_5783 = var1 == null ? "" : var1;
      f_5784 = true;
      m_2235();
   }

   private Class_BQT9PXBvcSf9Per8() {
   }

   private static String m_2249(String var0, String var1) {
      for (Class_BQT9PXBvcSf9Per8.bOEz2p8ILokhTqEI var3 : f_5780) {
         if (var3.key().equals(var0)) {
            return var3.original();
         }
      }

      return var1;
   }

   private static Class_BQT9PXBvcSf9Per8.TB7iKUBBu7diImfg m_2250(String var0) {
      String var1 = var0.toLowerCase(Locale.ROOT);

      for (Class_BQT9PXBvcSf9Per8.TB7iKUBBu7diImfg var5 : Class_BQT9PXBvcSf9Per8.TB7iKUBBu7diImfg.values()) {
         if (var1.contains(var5.f_5770)) {
            return var5;
         }
      }

      return null;
   }

   public static void m_2251() {
      f_5780 = List.copyOf(f_5779);
      f_5779.clear();
      f_5775.set(false);
   }

   private static Class_BQT9PXBvcSf9Per8.Class_2aR5PtofAtKtr9oj m_2252(String var0) {
      if (var0 != null && !var0.isEmpty()) {
         Optional var1 = f_5776.get(var0);
         if (var1 != null) {
            return (Class_BQT9PXBvcSf9Per8.Class_2aR5PtofAtKtr9oj)var1.orElse(null);
         }

         Class_BQT9PXBvcSf9Per8.TB7iKUBBu7diImfg var2 = m_2250(var0);
         Class_BQT9PXBvcSf9Per8.Class_2aR5PtofAtKtr9oj var3 = var2 == null ? null : m_2237(var0, var2);
         if (f_5776.size() >= 128) {
            f_5776.remove(f_5776.keySet().iterator().next());
         }

         f_5776.put(var0, Optional.ofNullable(var3));
         return var3;
      } else {
         return null;
      }
   }

   public static boolean m_2254() {
      return Boolean.TRUE.equals(f_5775.get());
   }

   private static String m_2255(String var0, String var1) {
      return var0.equals(f_5781) ? f_5783 : f_5774.getOrDefault(var0, var1);
   }

   public static String m_2256(String var0) {
      if (m_2254() && var0 != null && !var0.isEmpty()) {
         Class_BQT9PXBvcSf9Per8.Class_2aR5PtofAtKtr9oj var1 = m_2252(var0);
         return var1 == null ? var0 : var1.output;
      } else {
         return var0;
      }
   }

   public static void m_2257() {
      m_2240();
   }

   public static boolean m_2258() {
      if (!Class_29BIBbZyd5QWCwS1.m_993()) {
         return false;
      }

      NameProtect var0 = DimasikClient.m_9057().m_9049().m_2801().m_3484();
      return var0 != null && var0.m_2051();
   }

   private record Class_1fnqprBQcMEa4uUc(Component value) {
   }

   private record Class_2aR5PtofAtKtr9oj(String output, List<Class_BQT9PXBvcSf9Per8.hRQXZMCkQ4zi96uQ> spans) {
   }

   private enum TB7iKUBBu7diImfg {
      RILLIKI("риллик"),
      ROMASHKI("ромашк"),
      BALANCE("баланс"),
      ELO("elo");

      public final String f_5770;

      TB7iKUBBu7diImfg(String var3) {
         this.f_5770 = var3;
      }
   }

   private record bOEz2p8ILokhTqEI(String key, String original, double x, double y, double width, double height) {
   }

   private record hRQXZMCkQ4zi96uQ(String key, String original, int origStart, int origEnd, int start, int end) {
   }
}
