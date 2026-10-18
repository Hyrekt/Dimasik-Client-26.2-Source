package dev.dimasik.client.system;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dev.dimasik.client.module.misc.AutoJoiner;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

public final class Class_rpKWQ1k3x4TuZQdK extends Class_XWvsgVpnvA3CjeNU {
   private final Map<Class_mqwnQ7i1Iw9tXynj, Class_rpKWQ1k3x4TuZQdK.T01kcayfOW8Fv55g> f_30354 = new EnumMap<>(Class_mqwnQ7i1Iw9tXynj.class);
   private static final String f_30355 = "dimasik/client";
   private static final String f_30356 = "servers";
   private static final String f_30357 = "grief";
   private static final String f_30358 = "category";
   private static final String f_30359 = "number";
   private static final String f_30360 = "grief";
   private static final String f_30361 = "category";
   private static final String f_30362 = "number";

   private static String m_8463(JsonObject var0, String var1) {
      if (var0.has(var1) && !var0.get(var1).isJsonNull()) {
         String var2 = var0.get(var1).getAsString();
         return var2 != null && !var2.isBlank() ? var2 : null;
      } else {
         return null;
      }
   }

   public void m_8464(Class_mqwnQ7i1Iw9tXynj var1, int var2) {
      if (var1 != null && var2 >= 1) {
         Class_rpKWQ1k3x4TuZQdK.T01kcayfOW8Fv55g var3 = this.m_8465(var1);
         if (var3.grief() != var2 || var3.holyCategory() != null) {
            this.f_30354.put(var1, new Class_rpKWQ1k3x4TuZQdK.T01kcayfOW8Fv55g(var2, null, 0));
            this.m_5559();
         }
      }
   }

   public Class_rpKWQ1k3x4TuZQdK.T01kcayfOW8Fv55g m_8465(Class_mqwnQ7i1Iw9tXynj var1) {
      return this.f_30354.getOrDefault(var1, Class_rpKWQ1k3x4TuZQdK.T01kcayfOW8Fv55g.EMPTY);
   }

   private static int m_8466(JsonObject var0, String var1) {
      if (var0.has(var1) && !var0.get(var1).isJsonNull()) {
         JsonElement var2 = var0.get(var1);

         try {
            return var2.getAsInt();
         } catch (Exception var4) {
            return 0;
         }
      } else {
         return 0;
      }
   }

   public void m_8467(Class_mqwnQ7i1Iw9tXynj var1, AutoJoiner.UFtxOEj3EQyyOrKf var2) {
      if (var1 != null && var2 != null && var2.number() >= 1) {
         Class_rpKWQ1k3x4TuZQdK.T01kcayfOW8Fv55g var3 = this.m_8465(var1);
         if (!var2.category().name().equals(var3.holyCategory()) || var3.holyNumber() != var2.number()) {
            this.f_30354.put(var1, new Class_rpKWQ1k3x4TuZQdK.T01kcayfOW8Fv55g(0, var2.category().name(), var2.number()));
            this.m_5559();
         }
      }
   }

   public Class_rpKWQ1k3x4TuZQdK() {
      super(f_30355, f_30356);
   }

   @Override
   protected void m_808() {
      this.f_30354.clear();
      String var1 = this.m_5557();
      if (var1 != null && !var1.isBlank()) {
         JsonObject var2 = JsonParser.parseString(var1).getAsJsonObject();

         for (Class_mqwnQ7i1Iw9tXynj var6 : Class_mqwnQ7i1Iw9tXynj.values()) {
            String var7 = var6.name().toLowerCase(Locale.ROOT);
            if (var2.has(var7) && var2.get(var7).isJsonObject()) {
               JsonObject var8 = var2.getAsJsonObject(var7);
               int var9 = m_8466(var8, f_30360);
               String var10 = m_8463(var8, f_30361);
               int var11 = m_8466(var8, f_30362);
               Class_rpKWQ1k3x4TuZQdK.T01kcayfOW8Fv55g var12 = new Class_rpKWQ1k3x4TuZQdK.T01kcayfOW8Fv55g(var9, var10, var11);
               if (var12.hasAny()) {
                  this.f_30354.put(var6, var12);
               }
            }
         }
      }
   }

   @Override
   protected void m_809() {
      JsonObject var1 = new JsonObject();

      for (Entry var3 : this.f_30354.entrySet()) {
         Class_rpKWQ1k3x4TuZQdK.T01kcayfOW8Fv55g var4 = (Class_rpKWQ1k3x4TuZQdK.T01kcayfOW8Fv55g)var3.getValue();
         if (var4.hasAny()) {
            JsonObject var5 = new JsonObject();
            if (var4.hasGrief()) {
               var5.addProperty(f_30357, var4.grief());
            }

            if (var4.hasHoly()) {
               var5.addProperty(f_30358, var4.holyCategory());
               var5.addProperty(f_30359, var4.holyNumber());
            }

            var1.add(((Class_mqwnQ7i1Iw9tXynj)var3.getKey()).name().toLowerCase(Locale.ROOT), var5);
         }
      }

      this.m_5558(var1);
   }

   public record T01kcayfOW8Fv55g(int grief, String holyCategory, int holyNumber) {
      public static final Class_rpKWQ1k3x4TuZQdK.T01kcayfOW8Fv55g EMPTY = new Class_rpKWQ1k3x4TuZQdK.T01kcayfOW8Fv55g(0, null, 0);

      public boolean hasHoly() {
         return this.holyCategory != null && !this.holyCategory.isBlank() && this.holyNumber > 0;
      }

      public static String holyLabel(String var0) {
         return switch (var0.toUpperCase(Locale.ROOT)) {
            case "SOLO" -> "Соло";
            case "DUO" -> "Дуо";
            case "TRIO" -> "Трио";
            case "CLAN" -> "Клан";
            default -> var0;
         };
      }

      public boolean hasAny() {
         return this.hasGrief() || this.hasHoly();
      }

      public String label() {
         if (this.hasHoly()) {
            return holyLabel(this.holyCategory) + " #" + this.holyNumber;
         } else {
            return this.hasGrief() ? "Гриф #" + this.grief : "Пока не заходили";
         }
      }

      public boolean hasGrief() {
         return this.grief > 0;
      }
   }
}
