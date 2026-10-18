package dev.dimasik.client.system;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class Class_vhSU9kAizeRReaAF {
   private final float f_34203;
   private final boolean f_34204;
   private final Map<String, Class_vhSU9kAizeRReaAF.KjEKo16BBrdB7ein> f_34205;
   private static final float f_34206 = 0.001F;
   private static final String f_34207 = "animations";
   private static final String f_34208 = "animations";
   private static final String f_34209 = "animation_length";
   private static final String f_34210 = "animation_length";
   private static final String f_34211 = "loop";
   private static final String f_34212 = "loop";
   private static final String f_34213 = "loop";
   private static final String f_34214 = "loop";
   private static final String f_34215 = "loop";
   private static final String f_34216 = "loop";
   private static final String f_34217 = "bones";
   private static final String f_34218 = "bones";
   private static final String f_34219 = "rotation";
   private static final String f_34220 = "position";
   private static final String f_34221 = "scale";
   private static final String f_34222 = "vector";
   private static final String f_34223 = "post";
   private static final String f_34224 = "pre";
   private static final String f_34225 = "post";
   private static final String f_34226 = "post";
   private static final String f_34227 = "vector";
   private static final String f_34228 = "vector";
   private static final String f_34229 = "pre";
   private static final String f_34230 = "pre";
   private static final float f_34231 = 1.0E-4F;

   public Class_vhSU9kAizeRReaAF.rzuGHwCVMAX16TP6 m_9260(String var1, float var2) {
      Class_vhSU9kAizeRReaAF.KjEKo16BBrdB7ein var3 = this.f_34205.get(var1);
      if (var3 == null) {
         return Class_vhSU9kAizeRReaAF.rzuGHwCVMAX16TP6.EMPTY;
      }

      float var4 = this.f_34204 ? var2 % this.f_34203 : Math.min(var2, this.f_34203);
      return new Class_vhSU9kAizeRReaAF.rzuGHwCVMAX16TP6(m_9265(var3.rotation, var4), m_9265(var3.position, var4), m_9265(var3.scale, var4));
   }

   private Class_vhSU9kAizeRReaAF(float var1, boolean var2, Map<String, Class_vhSU9kAizeRReaAF.KjEKo16BBrdB7ein> var3) {
      this.f_34203 = Math.max(f_34206, var1);
      this.f_34204 = var2;
      this.f_34205 = var3;
   }

   private static Class_vhSU9kAizeRReaAF m_9261(JsonObject var0) {
      float var1 = var0.has(f_34209) ? var0.get(f_34210).getAsFloat() : 1.0F;
      boolean var2 = var0.has(f_34211)
         && var0.get(f_34212).isJsonPrimitive()
         && (var0.get(f_34213).getAsJsonPrimitive().isBoolean() ? var0.get(f_34214).getAsBoolean() : f_34215.equalsIgnoreCase(var0.get(f_34216).getAsString()));
      HashMap var3 = new HashMap();
      if (var0.has(f_34217)) {
         for (Entry var5 : var0.getAsJsonObject(f_34218).entrySet()) {
            JsonObject var6 = ((JsonElement)var5.getValue()).getAsJsonObject();
            var3.put(
               (String)var5.getKey(),
               new Class_vhSU9kAizeRReaAF.KjEKo16BBrdB7ein(m_9263(var6.get(f_34219)), m_9263(var6.get(f_34220)), m_9263(var6.get(f_34221)))
            );
         }
      }

      return new Class_vhSU9kAizeRReaAF(var1, var2, var3);
   }

   public static Class_vhSU9kAizeRReaAF m_9262(InputStream var0) {
      Map var1 = m_9267(var0);
      return var1.isEmpty() ? null : (Class_vhSU9kAizeRReaAF)var1.values().iterator().next();
   }

   private static List<Class_vhSU9kAizeRReaAF.lEGuyS2th2iremLc> m_9263(JsonElement var0) {
      if (var0 == null || var0.isJsonNull()) {
         return List.of();
      }

      if (var0.isJsonArray()) {
         return List.of(new Class_vhSU9kAizeRReaAF.lEGuyS2th2iremLc(0.0F, m_9264(var0)));
      }

      JsonObject var1 = var0.getAsJsonObject();
      if (!var1.has(f_34222) && !var1.has(f_34223) && !var1.has(f_34224)) {
         ArrayList var2 = new ArrayList();

         for (Entry var4 : var1.entrySet()) {
            try {
               var2.add(new Class_vhSU9kAizeRReaAF.lEGuyS2th2iremLc(Float.parseFloat((String)var4.getKey()), m_9264((JsonElement)var4.getValue())));
            } catch (NumberFormatException var6) {
            }
         }

         var2.sort(Comparator.comparingDouble(Class_vhSU9kAizeRReaAF.lEGuyS2th2iremLc::time));
         return var2;
      } else {
         return List.of(new Class_vhSU9kAizeRReaAF.lEGuyS2th2iremLc(0.0F, m_9264(var1)));
      }
   }

   private static float[] m_9264(JsonElement var0) {
      if (var0 == null || var0.isJsonNull()) {
         return new float[]{0.0F, 0.0F, 0.0F};
      } else if (var0.isJsonArray()) {
         JsonArray var2 = var0.getAsJsonArray();
         return new float[]{
            var2.size() > 0 ? m_9266(var2.get(0)) : 0.0F, var2.size() > 1 ? m_9266(var2.get(1)) : 0.0F, var2.size() > 2 ? m_9266(var2.get(2)) : 0.0F
         };
      } else {
         JsonObject var1 = var0.getAsJsonObject();
         if (var1.has(f_34225)) {
            return m_9264(var1.get(f_34226));
         } else if (var1.has(f_34227)) {
            return m_9264(var1.get(f_34228));
         } else {
            return var1.has(f_34229) ? m_9264(var1.get(f_34230)) : new float[]{0.0F, 0.0F, 0.0F};
         }
      }
   }

   private static float[] m_9265(List<Class_vhSU9kAizeRReaAF.lEGuyS2th2iremLc> var0, float var1) {
      if (var0.isEmpty()) {
         return null;
      }

      if (var0.size() != 1 && !(var1 <= ((Class_vhSU9kAizeRReaAF.lEGuyS2th2iremLc)var0.getFirst()).time)) {
         if (var1 >= ((Class_vhSU9kAizeRReaAF.lEGuyS2th2iremLc)var0.getLast()).time) {
            return (float[])((Class_vhSU9kAizeRReaAF.lEGuyS2th2iremLc)var0.getLast()).value.clone();
         }

         for (int var2 = 0; var2 < var0.size() - 1; var2++) {
            Class_vhSU9kAizeRReaAF.lEGuyS2th2iremLc var3 = (Class_vhSU9kAizeRReaAF.lEGuyS2th2iremLc)var0.get(var2);
            Class_vhSU9kAizeRReaAF.lEGuyS2th2iremLc var4 = (Class_vhSU9kAizeRReaAF.lEGuyS2th2iremLc)var0.get(var2 + 1);
            if (!(var1 < var3.time) && !(var1 > var4.time)) {
               float var5 = (var1 - var3.time) / Math.max(f_34231, var4.time - var3.time);
               return new float[]{
                  var3.value[0] + (var4.value[0] - var3.value[0]) * var5,
                  var3.value[1] + (var4.value[1] - var3.value[1]) * var5,
                  var3.value[2] + (var4.value[2] - var3.value[2]) * var5
               };
            }
         }

         return (float[])((Class_vhSU9kAizeRReaAF.lEGuyS2th2iremLc)var0.getLast()).value.clone();
      } else {
         return (float[])((Class_vhSU9kAizeRReaAF.lEGuyS2th2iremLc)var0.getFirst()).value.clone();
      }
   }

   private static float m_9266(JsonElement var0) {
      if (var0 != null && var0.isJsonPrimitive()) {
         try {
            return var0.getAsFloat();
         } catch (Exception var2) {
            return 0.0F;
         }
      } else {
         return 0.0F;
      }
   }

   public static Map<String, Class_vhSU9kAizeRReaAF> m_9267(InputStream var0) {
      JsonObject var1 = JsonParser.parseReader(new InputStreamReader(var0, StandardCharsets.UTF_8)).getAsJsonObject();
      LinkedHashMap var2 = new LinkedHashMap();
      if (!var1.has(f_34207)) {
         return var2;
      }

      JsonObject var3 = var1.getAsJsonObject(f_34208);

      for (Entry var5 : var3.entrySet()) {
         if (((JsonElement)var5.getValue()).isJsonObject()) {
            Class_vhSU9kAizeRReaAF var6 = m_9261(((JsonElement)var5.getValue()).getAsJsonObject());
            if (var6 != null) {
               var2.put((String)var5.getKey(), var6);
            }
         }
      }

      return var2;
   }

   private record KjEKo16BBrdB7ein(
      List<Class_vhSU9kAizeRReaAF.lEGuyS2th2iremLc> rotation,
      List<Class_vhSU9kAizeRReaAF.lEGuyS2th2iremLc> position,
      List<Class_vhSU9kAizeRReaAF.lEGuyS2th2iremLc> scale
   ) {
   }

   private record lEGuyS2th2iremLc(float time, float[] value) {
   }

   public record rzuGHwCVMAX16TP6(float[] rotation, float[] position, float[] scale) {
      private static final Class_vhSU9kAizeRReaAF.rzuGHwCVMAX16TP6 EMPTY = new Class_vhSU9kAizeRReaAF.rzuGHwCVMAX16TP6(null, null, null);
   }
}
