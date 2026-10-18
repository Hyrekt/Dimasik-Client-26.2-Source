package dev.dimasik.client.system;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.util.Mth;
import org.joml.Vector3f;

public final class Class_DYfbN7i8OfYweq8U {
   private final Map<String, Class_DYfbN7i8OfYweq8U.A5vmzn1vhNQlNmN4> f_6412;
   private final float f_6413;
   private final float f_6414;
   private final float f_6415;
   private final boolean f_6416;
   private static final float f_6417 = 0.05F;
   private static final String f_6418 = "dimasik";
   private static final String f_6419 = "animations";
   private static final String f_6420 = "_bends";
   private static final String f_6421 = "_overrides";
   private static final String f_6422 = "animation_length";
   private static final String f_6423 = "animation_length";
   private static final String f_6424 = "loop_start";
   private static final String f_6425 = "loop_start";
   private static final String f_6426 = "loop_end";
   private static final String f_6427 = "loop_end";
   private static final String f_6428 = "loop_end";
   private static final String f_6429 = "loop_end";
   private static final String f_6430 = "easing_before";
   private static final String f_6431 = "easing_before";
   private static final String f_6432 = "easing_before";
   private static final String f_6433 = "easing_before";
   private static final String f_6434 = "bones";
   private static final String f_6435 = "bones";
   private static final String f_6436 = "bones";
   private static final String f_6437 = "rotation";
   private static final String f_6438 = "rotation";
   private static final String f_6439 = "rotation";
   private static final String f_6440 = "position";
   private static final String f_6441 = "position";
   private static final String f_6442 = "position";
   private static final String f_6443 = "bend_direction";
   private static final String f_6444 = "bendDirection";
   private static final String f_6445 = "bend";
   private static final float f_6446 = 0.05F;
   private static final float f_6447 = 0.05F;
   private static final String f_6448 = "dimasik";
   private static final String f_6449 = "animations";
   private static final float f_6450 = 1.0E-4F;
   private static final String f_6451 = "linear";
   private static final String f_6452 = "vector";
   private static final String f_6453 = "easing";
   private static final String f_6454 = "easing";
   private static final String f_6455 = "linear";
   private static final String f_6456 = "vector";
   private static final String f_6457 = "easing";
   private static final String f_6458 = "linear";
   private static final String f_6459 = "vector";
   private static final String f_6460 = "easing";
   private static final String f_6461 = "easing";
   private static final String f_6462 = "linear";
   private static final String f_6463 = "value";
   private static final String f_6464 = "easing";
   private static final String f_6465 = "easing";
   private static final String f_6466 = "linear";
   private static final String f_6467 = "value";
   private static final String f_6468 = "easing";
   private static final String f_6469 = "linear";
   private static final String f_6470 = "value";
   private static final String f_6471 = "easing";
   private static final String f_6472 = "easing";

   private Class_DYfbN7i8OfYweq8U(Map<String, Class_DYfbN7i8OfYweq8U.A5vmzn1vhNQlNmN4> var1, float var2, float var3, float var4, boolean var5) {
      this.f_6412 = var1;
      this.f_6413 = Math.max(f_6417, var2);
      this.f_6414 = Math.clamp(var3, 0.0F, this.f_6413);
      this.f_6415 = Math.max(this.f_6413, var4);
      this.f_6416 = var5;
   }

   public static Class_DYfbN7i8OfYweq8U m_2455(Class_sIga32lGjUfDbarq var0, String var1) {
      Identifier var2 = Identifier.fromNamespaceAndPath(f_6418, var0.file() + "");

      try {
         BufferedReader var3 = ((Resource)Minecraft.getInstance().getResourceManager().getResource(var2).orElseThrow()).openAsReader();

         try (var3) {
            JsonObject var5 = JsonParser.parseReader(var3).getAsJsonObject();
            JsonObject var6 = var5.getAsJsonObject(f_6419).getAsJsonObject(var1);
            JsonObject var7 = m_2461(var0, var1, f_6420);
            JsonObject var8 = m_2461(var0, var1, f_6421);
            HashMap var9 = new HashMap();
            float var10 = var6.has(f_6422) ? var6.get(f_6423).getAsFloat() : 0.0F;
            float var11 = var6.has(f_6424) ? var6.get(f_6425).getAsFloat() : 0.0F;
            float var12 = var6.has(f_6426) ? var6.get(f_6427).getAsFloat() : (var7 != null && var7.has(f_6428) ? var7.get(f_6429).getAsFloat() : var10);
            boolean var13 = var6.has(f_6430) ? var6.get(f_6431).getAsBoolean() : var7 == null || !var7.has(f_6432) || var7.get(f_6433).getAsBoolean();
            JsonObject var14 = var6.getAsJsonObject(f_6434);
            JsonObject var15 = var7 == null ? null : var7.getAsJsonObject(f_6435);
            JsonObject var16 = var8 == null ? null : var8.getAsJsonObject(f_6436);

            for (Entry var18 : var14.entrySet()) {
               JsonObject var19 = ((JsonElement)var18.getValue()).getAsJsonObject();
               JsonObject var20 = var15 != null && var15.has((String)var18.getKey()) ? var15.getAsJsonObject((String)var18.getKey()) : var19;
               JsonObject var21 = var16 != null && var16.has((String)var18.getKey()) ? var16.getAsJsonObject((String)var18.getKey()) : null;
               Class_DYfbN7i8OfYweq8U.GznGTTBli1rQ3gwz var22 = m_2456(var21 != null && var21.has(f_6437) ? var21.get(f_6438) : var19.get(f_6439));
               Class_DYfbN7i8OfYweq8U.GznGTTBli1rQ3gwz var23 = m_2456(var21 != null && var21.has(f_6440) ? var21.get(f_6441) : var19.get(f_6442));
               Class_DYfbN7i8OfYweq8U.IET5l3Vp1Dn8A8q1 var24 = m_2457(m_2460(var20, f_6443, f_6444));
               Class_DYfbN7i8OfYweq8U.IET5l3Vp1Dn8A8q1 var25 = m_2457(var20.get(f_6445));
               var9.put((String)var18.getKey(), new Class_DYfbN7i8OfYweq8U.A5vmzn1vhNQlNmN4(var22, var23, var24, var25));
               var10 = Math.max(var10, Math.max(var22.end(), var23.end()));
            }

            return new Class_DYfbN7i8OfYweq8U(var9, var10, var11, var12, var13);
         }
      } catch (Exception var28) {
         return new Class_DYfbN7i8OfYweq8U(Map.of(), f_6446, 0.0F, f_6447, true);
      }
   }

   private static Class_DYfbN7i8OfYweq8U.GznGTTBli1rQ3gwz m_2456(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         if (var0.isJsonArray()) {
            return new Class_DYfbN7i8OfYweq8U.GznGTTBli1rQ3gwz(List.of(new Class_DYfbN7i8OfYweq8U.K1KtCBraBuUb1H2o(0.0F, m_2462(var0), f_6451)));
         }

         JsonObject var1 = var0.getAsJsonObject();
         if (var1.has(f_6452)) {
            String var9 = var1.has(f_6453) ? var1.get(f_6454).getAsString() : f_6455;
            return new Class_DYfbN7i8OfYweq8U.GznGTTBli1rQ3gwz(List.of(new Class_DYfbN7i8OfYweq8U.K1KtCBraBuUb1H2o(0.0F, m_2462(var1.get(f_6456)), var9)));
         }

         ArrayList var2 = new ArrayList();

         for (Entry var4 : var1.entrySet()) {
            if (!((String)var4.getKey()).equals(f_6457)) {
               JsonElement var5 = (JsonElement)var4.getValue();
               String var7 = f_6458;
               Vector3f var6;
               if (var5.isJsonObject()) {
                  JsonObject var8 = var5.getAsJsonObject();
                  var6 = m_2462(var8.get(f_6459));
                  if (var8.has(f_6460)) {
                     var7 = var8.get(f_6461).getAsString();
                  }
               } else {
                  var6 = m_2462(var5);
               }

               var2.add(new Class_DYfbN7i8OfYweq8U.K1KtCBraBuUb1H2o(Float.parseFloat((String)var4.getKey()), var6, var7));
            }
         }

         var2.sort(Comparator.comparingDouble(Class_DYfbN7i8OfYweq8U.K1KtCBraBuUb1H2o::time));
         return new Class_DYfbN7i8OfYweq8U.GznGTTBli1rQ3gwz(var2);
      } else {
         return Class_DYfbN7i8OfYweq8U.GznGTTBli1rQ3gwz.EMPTY;
      }
   }

   private static Class_DYfbN7i8OfYweq8U.IET5l3Vp1Dn8A8q1 m_2457(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         if (var0.isJsonPrimitive()) {
            return new Class_DYfbN7i8OfYweq8U.IET5l3Vp1Dn8A8q1(List.of(new Class_DYfbN7i8OfYweq8U.FdeAxqkWAWYWQg4V(0.0F, var0.getAsFloat(), f_6462)));
         }

         JsonObject var1 = var0.getAsJsonObject();
         if (var1.has(f_6463)) {
            String var9 = var1.has(f_6464) ? var1.get(f_6465).getAsString() : f_6466;
            return new Class_DYfbN7i8OfYweq8U.IET5l3Vp1Dn8A8q1(List.of(new Class_DYfbN7i8OfYweq8U.FdeAxqkWAWYWQg4V(0.0F, var1.get(f_6467).getAsFloat(), var9)));
         }

         ArrayList var2 = new ArrayList();

         for (Entry var4 : var1.entrySet()) {
            if (!((String)var4.getKey()).equals(f_6468)) {
               JsonElement var5 = (JsonElement)var4.getValue();
               String var7 = f_6469;
               float var6;
               if (var5.isJsonObject()) {
                  JsonObject var8 = var5.getAsJsonObject();
                  var6 = var8.get(f_6470).getAsFloat();
                  if (var8.has(f_6471)) {
                     var7 = var8.get(f_6472).getAsString();
                  }
               } else {
                  var6 = var5.getAsFloat();
               }

               var2.add(new Class_DYfbN7i8OfYweq8U.FdeAxqkWAWYWQg4V(Float.parseFloat((String)var4.getKey()), var6, var7));
            }
         }

         var2.sort(Comparator.comparingDouble(Class_DYfbN7i8OfYweq8U.FdeAxqkWAWYWQg4V::time));
         return new Class_DYfbN7i8OfYweq8U.IET5l3Vp1Dn8A8q1(var2);
      } else {
         return Class_DYfbN7i8OfYweq8U.IET5l3Vp1Dn8A8q1.EMPTY;
      }
   }

   public float m_2458() {
      return this.f_6413;
   }

   public Class_DYfbN7i8OfYweq8U.jYlylkCtfEuU3kLU m_2459(String var1, float var2) {
      Class_DYfbN7i8OfYweq8U.A5vmzn1vhNQlNmN4 var3 = this.f_6412.get(var1);
      return var3 == null
         ? Class_DYfbN7i8OfYweq8U.jYlylkCtfEuU3kLU.ZERO
         : new Class_DYfbN7i8OfYweq8U.jYlylkCtfEuU3kLU(
            var3.rotation.sample(var2, this.f_6414, this.f_6415, this.f_6416),
            var3.position.sample(var2, this.f_6414, this.f_6415, this.f_6416),
            var3.bendDirection.sample(var2, this.f_6414, this.f_6415, this.f_6416),
            var3.bend.sample(var2, this.f_6414, this.f_6415, this.f_6416),
            !var3.rotation.frames().isEmpty(),
            !var3.position.frames().isEmpty(),
            !var3.bend.frames().isEmpty()
         );
   }

   private static JsonElement m_2460(JsonObject var0, String var1, String var2) {
      return var0.has(var1) ? var0.get(var1) : var0.get(var2);
   }

   private static JsonObject m_2461(Class_sIga32lGjUfDbarq var0, String var1, String var2) {
      Identifier var3 = Identifier.fromNamespaceAndPath(f_6448, var0.file() + var2);

      try {
         BufferedReader var4 = ((Resource)Minecraft.getInstance().getResourceManager().getResource(var3).orElseThrow()).openAsReader();

         try (var4) {
            JsonObject var6 = JsonParser.parseReader(var4).getAsJsonObject();
            return var6.getAsJsonObject(f_6449).getAsJsonObject(var1);
         }
      } catch (Exception var10) {
         return null;
      }
   }

   private static Vector3f m_2462(JsonElement var0) {
      if (var0 != null && var0.isJsonArray()) {
         JsonArray var1 = var0.getAsJsonArray();
         return new Vector3f(var1.get(0).getAsFloat(), var1.get(1).getAsFloat(), var1.get(2).getAsFloat());
      } else {
         return new Vector3f();
      }
   }

   public float m_2463(float var1, boolean var2) {
      if (!var2) {
         return Math.min(var1, this.f_6413);
      }

      if (var1 < this.f_6415) {
         return var1;
      }

      float var3 = this.f_6415 - this.f_6414;
      return var3 <= f_6450 ? this.f_6413 : this.f_6414 + (var1 - this.f_6414) % var3;
   }

   private record A5vmzn1vhNQlNmN4(
      Class_DYfbN7i8OfYweq8U.GznGTTBli1rQ3gwz rotation,
      Class_DYfbN7i8OfYweq8U.GznGTTBli1rQ3gwz position,
      Class_DYfbN7i8OfYweq8U.IET5l3Vp1Dn8A8q1 bendDirection,
      Class_DYfbN7i8OfYweq8U.IET5l3Vp1Dn8A8q1 bend
   ) {
   }

   private record FdeAxqkWAWYWQg4V(float time, float value, String easing) {
   }

   private record GznGTTBli1rQ3gwz(List<Class_DYfbN7i8OfYweq8U.K1KtCBraBuUb1H2o> frames) {
      private static final Class_DYfbN7i8OfYweq8U.GznGTTBli1rQ3gwz EMPTY = new Class_DYfbN7i8OfYweq8U.GznGTTBli1rQ3gwz(List.of());

      public static float ease(String var0, float var1) {
         return switch (var0) {
            case "easeInQuad" -> var1 * var1;
            case "easeOutQuad" -> 1.0F - (1.0F - var1) * (1.0F - var1);
            case "easeInOutQuad" -> var1 < 0.5F ? 2.0F * var1 * var1 : 1.0F - (float)Math.pow(-2.0F * var1 + 2.0F, 2.0) * 0.5F;
            case "easeInCubic" -> var1 * var1 * var1;
            case "easeOutCubic" -> 1.0F - (float)Math.pow(1.0F - var1, 3.0);
            case "easeInOutCubic" -> var1 < 0.5F ? 4.0F * var1 * var1 * var1 : 1.0F - (float)Math.pow(-2.0F * var1 + 2.0F, 3.0) * 0.5F;
            case "easeInSine" -> 1.0F - (float)Math.cos(var1 * Math.PI * 0.5);
            case "easeInOutSine" -> -((float)Math.cos(Math.PI * var1) - 1.0F) * 0.5F;
            case "step" -> 0.0F;
            default -> var1;
         };
      }

      public Vector3f sample(float var1, float var2, float var3, boolean var4) {
         if (this.frames.isEmpty()) {
            return new Vector3f();
         }

         if (this.frames.size() != 1 && !(var1 <= this.frames.getFirst().time)) {
            for (int var5 = 1; var5 < this.frames.size(); var5++) {
               Class_DYfbN7i8OfYweq8U.K1KtCBraBuUb1H2o var6 = this.frames.get(var5);
               if (var1 <= var6.time) {
                  Class_DYfbN7i8OfYweq8U.K1KtCBraBuUb1H2o var7 = this.frames.get(var5 - 1);
                  float var8 = (var1 - var7.time) / Math.max(1.0E-4F, var6.time - var7.time);
                  var8 = ease(var4 ? var6.easing : var7.easing, Math.clamp(var8, 0.0F, 1.0F));
                  return new Vector3f(var7.value).lerp(var6.value, var8);
               }
            }

            if (var3 > this.frames.getLast().time) {
               Class_DYfbN7i8OfYweq8U.K1KtCBraBuUb1H2o var9 = this.frames.stream().filter(var1x -> var1x.time >= var2).findFirst().orElse(null);
               if (var9 != null) {
                  Class_DYfbN7i8OfYweq8U.K1KtCBraBuUb1H2o var10 = this.frames.getLast();
                  float var11 = var9.time + var3 - var2;
                  float var13 = (var1 - var10.time) / Math.max(1.0E-4F, var11 - var10.time);
                  var13 = ease(var4 ? var9.easing : var10.easing, Math.clamp(var13, 0.0F, 1.0F));
                  return new Vector3f(var10.value).lerp(var9.value, var13);
               }
            }

            return new Vector3f(this.frames.getLast().value);
         } else {
            return new Vector3f(this.frames.getFirst().value);
         }
      }

      public float end() {
         return this.frames.isEmpty() ? 0.0F : this.frames.getLast().time;
      }
   }

   private record IET5l3Vp1Dn8A8q1(List<Class_DYfbN7i8OfYweq8U.FdeAxqkWAWYWQg4V> frames) {
      private static final Class_DYfbN7i8OfYweq8U.IET5l3Vp1Dn8A8q1 EMPTY = new Class_DYfbN7i8OfYweq8U.IET5l3Vp1Dn8A8q1(List.of());

      public float sample(float var1, float var2, float var3, boolean var4) {
         if (this.frames.isEmpty()) {
            return 0.0F;
         }

         if (this.frames.size() != 1 && !(var1 <= this.frames.getFirst().time)) {
            for (int var5 = 1; var5 < this.frames.size(); var5++) {
               Class_DYfbN7i8OfYweq8U.FdeAxqkWAWYWQg4V var6 = this.frames.get(var5);
               if (var1 <= var6.time) {
                  Class_DYfbN7i8OfYweq8U.FdeAxqkWAWYWQg4V var7 = this.frames.get(var5 - 1);
                  float var8 = (var1 - var7.time) / Math.max(1.0E-4F, var6.time - var7.time);
                  var8 = Class_DYfbN7i8OfYweq8U.GznGTTBli1rQ3gwz.ease(var4 ? var6.easing : var7.easing, Math.clamp(var8, 0.0F, 1.0F));
                  return Mth.lerp(var8, var7.value, var6.value);
               }
            }

            if (var3 > this.frames.getLast().time) {
               Class_DYfbN7i8OfYweq8U.FdeAxqkWAWYWQg4V var9 = this.frames.stream().filter(var1x -> var1x.time >= var2).findFirst().orElse(null);
               if (var9 != null) {
                  Class_DYfbN7i8OfYweq8U.FdeAxqkWAWYWQg4V var10 = this.frames.getLast();
                  float var11 = var9.time + var3 - var2;
                  float var13 = (var1 - var10.time) / Math.max(1.0E-4F, var11 - var10.time);
                  var13 = Class_DYfbN7i8OfYweq8U.GznGTTBli1rQ3gwz.ease(var4 ? var9.easing : var10.easing, Math.clamp(var13, 0.0F, 1.0F));
                  return Mth.lerp(var13, var10.value, var9.value);
               }
            }

            return this.frames.getLast().value;
         } else {
            return this.frames.getFirst().value;
         }
      }
   }

   private record K1KtCBraBuUb1H2o(float time, Vector3f value, String easing) {
   }

   public record jYlylkCtfEuU3kLU(
      Vector3f rotation, Vector3f position, float bendDirection, float bend, boolean hasRotation, boolean hasPosition, boolean hasBend
   ) {
      private static final Class_DYfbN7i8OfYweq8U.jYlylkCtfEuU3kLU ZERO = new Class_DYfbN7i8OfYweq8U.jYlylkCtfEuU3kLU(
         new Vector3f(), new Vector3f(), 0.0F, 0.0F, false, false, false
      );
   }
}
