package dev.dimasik.client.system;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;

public final class Class_cxtVSustGMvg4Bq0 {
   public static final int f_18835 = 32;
   private static final int f_18836 = 64;
   private static final String f_18837 = "Основной";
   private static final Set<String> f_18838 = Set.of(
      Class_cxtVSustGMvg4Bq0.f_18887,
      Class_cxtVSustGMvg4Bq0.f_18888,
      Class_cxtVSustGMvg4Bq0.f_18889,
      Class_cxtVSustGMvg4Bq0.f_18890,
      Class_cxtVSustGMvg4Bq0.f_18891
   );
   private final Map<String, List<Class_cxtVSustGMvg4Bq0.VQlWXpv7uUWBoP93>> f_18839 = new LinkedHashMap<>();
   private final Map<String, Class_cxtVSustGMvg4Bq0.Znq8jzbHPgtGpXuG> f_18840 = new LinkedHashMap<>();
   private final Map<String, Deque<List<Class_cxtVSustGMvg4Bq0.VQlWXpv7uUWBoP93>>> f_18841 = new LinkedHashMap<>();
   private final Map<String, Deque<List<Class_cxtVSustGMvg4Bq0.VQlWXpv7uUWBoP93>>> f_18842 = new LinkedHashMap<>();
   private String f_18843;
   private static final String f_18844 = "Основной";
   private static final String f_18845 = "Оставь хотя бы один пресет";
   private static final String f_18846 = "Введи название пресета";
   private static final String f_18847 = "Название: не больше 32 символов";
   private static final String f_18848 = "Пресет с таким названием уже есть";
   private static final String f_18849 = "[\\p{Cntrl}§]";
   private static final String f_18850 = "\\s+";
   private static final String f_18851 = " ";
   private static final String f_18852 = "version";
   private static final String f_18853 = "activePreset";
   private static final String f_18854 = "presets";
   private static final String f_18855 = "presetModes";
   private static final String f_18856 = "presets";
   private static final String f_18857 = "slots";
   private static final String f_18858 = "slots";
   private static final String f_18859 = "Missing inventory slots";
   private static final String f_18860 = "slots";
   private static final String f_18861 = "presets";
   private static final String f_18862 = "version";
   private static final String f_18863 = "version";
   private static final String f_18864 = "Unsupported inventory presets format";
   private static final String f_18865 = "presets";
   private static final String f_18866 = "presetModes";
   private static final String f_18867 = "presetModes";
   private static final String f_18868 = "presetModes";
   private static final String f_18869 = "No valid inventory presets";
   private static final String f_18870 = "activePreset";
   private static final String f_18871 = "activePreset";
   private static final String f_18872 = "activePreset";
   private static final String f_18873 = "item";
   private static final String f_18874 = "(?:[a-z0-9_.-]+:)?[a-z0-9/._-]+";
   private static final String f_18875 = "name";
   private static final String f_18876 = "name";
   private static final String f_18877 = "count";
   private static final String f_18878 = "count";
   private static final String f_18879 = "kind";
   private static final String f_18880 = "kind";
   private static final String f_18881 = "NORMAL";
   private static final String f_18882 = "NORMAL";
   private static final String f_18883 = "item";
   private static final String f_18884 = "name";
   private static final String f_18885 = "count";
   private static final String f_18886 = "kind";
   private static final String f_18887 = "NORMAL";
   private static final String f_18888 = "BALL";
   private static final String f_18889 = "PUMPKIN";
   private static final String f_18890 = "POTION";
   private static final String f_18891 = "FUNTIME";

   public Class_cxtVSustGMvg4Bq0() {
      this.f_18843 = f_18844;
      this.f_18839.put(this.f_18843, List.of());
   }

   private boolean m_6290(
      Map<String, Deque<List<Class_cxtVSustGMvg4Bq0.VQlWXpv7uUWBoP93>>> var1, Map<String, Deque<List<Class_cxtVSustGMvg4Bq0.VQlWXpv7uUWBoP93>>> var2
   ) {
      Deque var3 = (Deque)var1.get(this.f_18843);
      if (var3 != null && !var3.isEmpty()) {
         this.m_6301(var2, this.m_6308());
         this.f_18839.put(this.f_18843, (List<Class_cxtVSustGMvg4Bq0.VQlWXpv7uUWBoP93>)var3.removeLast());
         return true;
      } else {
         return false;
      }
   }

   public void m_6291(Class_cxtVSustGMvg4Bq0.Znq8jzbHPgtGpXuG var1) {
      this.f_18840.put(this.f_18843, Objects.requireNonNull(var1));
   }

   public void m_6292(String var1) {
      String var2 = this.m_6304(var1, this.f_18843);
      this.f_18840.put(var2, this.f_18840.getOrDefault(this.f_18843, Class_cxtVSustGMvg4Bq0.Znq8jzbHPgtGpXuG.REALLY_WORLD));
      if (!this.f_18843.equals(var2)) {
         this.f_18840.remove(this.f_18843);
         if (this.f_18841.containsKey(this.f_18843)) {
            this.f_18841.put(var2, this.f_18841.remove(this.f_18843));
         }

         if (this.f_18842.containsKey(this.f_18843)) {
            this.f_18842.put(var2, this.f_18842.remove(this.f_18843));
         }
      }

      LinkedHashMap var3 = new LinkedHashMap();
      this.f_18839.forEach((var3x, var4) -> var3.put(var3x.equals(this.f_18843) ? var2 : var3x, var4));
      this.f_18839.clear();
      this.f_18839.putAll(var3);
      this.f_18843 = var2;
   }

   public Class_cxtVSustGMvg4Bq0.Znq8jzbHPgtGpXuG m_6293() {
      return this.f_18840.getOrDefault(this.f_18843, Class_cxtVSustGMvg4Bq0.Znq8jzbHPgtGpXuG.REALLY_WORLD);
   }

   public String m_6294() {
      return this.f_18843;
   }

   public void m_6295(List<Class_cxtVSustGMvg4Bq0.VQlWXpv7uUWBoP93> var1) {
      List var2 = List.copyOf(var1);
      if (!var2.equals(this.m_6308())) {
         this.m_6301(this.f_18841, this.m_6308());
         this.f_18842.remove(this.f_18843);
         this.f_18839.put(this.f_18843, var2);
      }
   }

   public boolean m_6296() {
      return this.f_18841.containsKey(this.f_18843) && !this.f_18841.get(this.f_18843).isEmpty();
   }

   public List<String> m_6297() {
      return List.copyOf(this.f_18839.keySet());
   }

   public boolean m_6298(String var1) {
      if (this.f_18839.containsKey(var1) && !this.f_18843.equals(var1)) {
         this.f_18843 = var1;
         return true;
      } else {
         return false;
      }
   }

   public boolean m_6299() {
      return this.m_6290(this.f_18841, this.f_18842);
   }

   private static String m_6300(String var0) {
      return var0 == null ? "" : var0.replaceAll(f_18849, "").strip().replaceAll(f_18850, f_18851);
   }

   private void m_6301(Map<String, Deque<List<Class_cxtVSustGMvg4Bq0.VQlWXpv7uUWBoP93>>> var1, List<Class_cxtVSustGMvg4Bq0.VQlWXpv7uUWBoP93> var2) {
      Deque var3 = var1.computeIfAbsent(this.f_18843, var0 -> new ArrayDeque());
      if (var3.size() >= 64) {
         var3.removeFirst();
      }

      var3.addLast(var2);
   }

   public void m_6302() {
      if (this.f_18839.size() <= 1) {
         throw new IllegalArgumentException(f_18845);
      }

      this.f_18839.remove(this.f_18843);
      this.f_18840.remove(this.f_18843);
      this.f_18841.remove(this.f_18843);
      this.f_18842.remove(this.f_18843);
      this.f_18843 = this.f_18839.keySet().iterator().next();
   }

   public JsonObject m_6303() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(f_18852, 3);
      var1.addProperty(f_18853, this.f_18843);
      JsonObject var2 = new JsonObject();
      this.f_18839.forEach((var1x, var2x) -> {
         JsonObject var3x = new JsonObject();

         for (Class_cxtVSustGMvg4Bq0.VQlWXpv7uUWBoP93 var5 : var2x) {
            JsonObject var6 = new JsonObject();
            var6.addProperty(f_18883, var5.item());
            var6.addProperty(f_18884, var5.name());
            var6.addProperty(f_18885, var5.count());
            var6.addProperty(f_18886, var5.kind());
            var3x.add(String.valueOf(var5.index()), var6);
         }

         var2.add(var1x, var3x);
      });
      var1.add(f_18854, var2);
      JsonObject var3 = new JsonObject();
      this.f_18839
         .keySet()
         .forEach(var2x -> var3.addProperty(var2x, this.f_18840.getOrDefault(var2x, Class_cxtVSustGMvg4Bq0.Znq8jzbHPgtGpXuG.REALLY_WORLD).name()));
      var1.add(f_18855, var3);
      return var1;
   }

   private String m_6304(String var1, String var2) {
      String var3 = m_6300(var1);
      if (var3.isEmpty()) {
         throw new IllegalArgumentException(f_18846);
      }

      if (var3.codePointCount(0, var3.length()) > 32) {
         throw new IllegalArgumentException(f_18847);
      }

      for (String var5 : this.f_18839.keySet()) {
         if (!var5.equals(var2) && var5.equalsIgnoreCase(var3)) {
            throw new IllegalArgumentException(f_18848);
         }
      }

      return var3;
   }

   public boolean m_6306() {
      return this.f_18842.containsKey(this.f_18843) && !this.f_18842.get(this.f_18843).isEmpty();
   }

   public List<Class_cxtVSustGMvg4Bq0.VQlWXpv7uUWBoP93> m_6308() {
      return this.f_18839.get(this.f_18843);
   }

   public static Class_cxtVSustGMvg4Bq0 m_6309(JsonObject var0) {
      Class_cxtVSustGMvg4Bq0 var1 = new Class_cxtVSustGMvg4Bq0();
      if (!var0.has(f_18856)) {
         if (var0.has(f_18857) && var0.get(f_18858).isJsonObject()) {
            var1.f_18839.put(var1.f_18843, m_6310(var0.getAsJsonObject(f_18860)));
            return var1;
         } else {
            throw new IllegalArgumentException(f_18859);
         }
      } else if (var0.get(f_18861).isJsonObject() && (!var0.has(f_18862) || var0.get(f_18863).getAsInt() <= 3)) {
         var1.f_18839.clear();

         for (Entry var3 : var0.getAsJsonObject(f_18865).entrySet()) {
            if (((JsonElement)var3.getValue()).isJsonObject()) {
               try {
                  String var4 = var1.m_6304((String)var3.getKey(), null);
                  var1.f_18839.put(var4, m_6310(((JsonElement)var3.getValue()).getAsJsonObject()));
                  if (var0.has(f_18866) && var0.get(f_18867).isJsonObject()) {
                     JsonElement var5 = var0.getAsJsonObject(f_18868).get((String)var3.getKey());
                     if (var5 != null && var5.isJsonPrimitive()) {
                        try {
                           var1.f_18840.put(var4, Class_cxtVSustGMvg4Bq0.Znq8jzbHPgtGpXuG.valueOf(var5.getAsString()));
                        } catch (IllegalArgumentException var7) {
                        }
                     }
                  }
               } catch (IllegalArgumentException var8) {
               }
            }
         }

         if (var1.f_18839.isEmpty()) {
            throw new IllegalArgumentException(f_18869);
         }

         String var9 = var0.has(f_18870) && var0.get(f_18871).isJsonPrimitive() ? var0.get(f_18872).getAsString() : "";
         var1.f_18843 = var1.f_18839.containsKey(var9) ? var9 : var1.f_18839.keySet().iterator().next();
         return var1;
      } else {
         throw new IllegalArgumentException(f_18864);
      }
   }

   private static List<Class_cxtVSustGMvg4Bq0.VQlWXpv7uUWBoP93> m_6310(JsonObject var0) {
      ArrayList var1 = new ArrayList();

      for (Entry var3 : var0.entrySet()) {
         try {
            int var4 = Integer.parseInt((String)var3.getKey());
            if (var4 >= 0 && var4 < 41 && ((JsonElement)var3.getValue()).isJsonObject()) {
               JsonObject var5 = ((JsonElement)var3.getValue()).getAsJsonObject();
               String var6 = var5.get(f_18873).getAsString();
               if (var6.matches(f_18874)) {
                  String var7 = var5.has(f_18875) ? var5.get(f_18876).getAsString() : "";
                  int var8 = var5.has(f_18877) ? Math.max(1, var5.get(f_18878).getAsInt()) : 1;
                  String var9 = var5.has(f_18879) ? var5.get(f_18880).getAsString() : f_18881;
                  var1.add(new Class_cxtVSustGMvg4Bq0.VQlWXpv7uUWBoP93(var4, var6, var7, var8, f_18838.contains(var9) ? var9 : f_18882));
               }
            }
         } catch (RuntimeException var10) {
         }
      }

      return List.copyOf(var1);
   }

   public boolean m_6311() {
      return this.m_6290(this.f_18842, this.f_18841);
   }

   public void m_6313(String var1) {
      String var2 = this.m_6304(var1, null);
      this.f_18839.put(var2, List.copyOf(this.m_6308()));
      this.f_18840.put(var2, this.m_6293());
      this.f_18843 = var2;
   }

   public record VQlWXpv7uUWBoP93(int index, String item, String name, int count, String kind) {
   }

   public enum Znq8jzbHPgtGpXuG {
      REALLY_WORLD("ReallyWorld"),
      FUNTIME("Funtime");

      public final String f_18834;

      Znq8jzbHPgtGpXuG(String var3) {
         this.f_18834 = var3;
      }

      public String m_6289() {
         return this.f_18834;
      }
   }
}
