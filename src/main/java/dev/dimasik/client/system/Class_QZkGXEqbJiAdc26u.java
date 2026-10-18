package dev.dimasik.client.system;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.mojang.serialization.JsonOps;
import java.nio.charset.StandardCharsets;
import net.minecraft.server.packs.OverlayMetadataSection;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.metadata.pack.PackFormat;
import net.minecraft.server.packs.metadata.pack.PackMetadataSection;

public final class Class_QZkGXEqbJiAdc26u {
   private static final int f_12328 = 88;
   private static final int f_12329 = 3;
   private static final String f_12330 = "dimasik_rwfixer_revision";
   private static final JsonObject f_12331 = JsonParser.parseString(Class_QZkGXEqbJiAdc26u.f_12393).getAsJsonObject();
   private static final String f_12332 = "(?:.*/)?assets/[^/]+/items/.+\\.json";
   private static final String f_12333 = "type";
   private static final String f_12334 = "special";
   private static final String f_12335 = "model";
   private static final String f_12336 = "type";
   private static final String f_12337 = "head";
   private static final String f_12338 = "kind";
   private static final String f_12339 = "player";
   private static final String f_12340 = "type";
   private static final String f_12341 = "minecraft:player_head";
   private static final String f_12342 = "type";
   private static final String f_12343 = "player_head";
   private static final String f_12344 = "kind";
   private static final String f_12345 = "transformation";
   private static final String f_12346 = "transformation";
   private static final String f_12347 = "type";
   private static final String f_12348 = "range_dispatch";
   private static final String f_12349 = "property";
   private static final String f_12350 = "custom_model_data";
   private static final String f_12351 = "index";
   private static final String f_12352 = "index";
   private static final String f_12353 = "pack";
   private static final String f_12354 = "dimasik_rwfixer_revision";
   private static final String f_12355 = "dimasik_rwfixer_revision";
   private static final String f_12356 = "min_format";
   private static final String f_12357 = "max_format";
   private static final String f_12358 = "{\n  \"pack\": {\"description\": \"ReallyWorld 26.2 (Dimasik fixed)\"},\n  \"overlays\": {\"entries\": [{\"directory\": \"1_21_2\"}]},\n  \"sodium\": {\n    \"ignored_shaders\": [\n      \"rendertype_entity_translucent.fsh\",\n      \"rendertype_entity_translucent.vsh\"\n    ]\n  }\n}\n";
   private static final String f_12359 = "pack";
   private static final String f_12360 = "description";
   private static final String f_12361 = "description";
   private static final String f_12362 = "ReallyWorld 26.2 (RwFixed)";
   private static final String f_12363 = "pack_format";
   private static final String f_12364 = "supported_formats";
   private static final String f_12365 = "min_format";
   private static final String f_12366 = "max_format";
   private static final String f_12367 = "overlays";
   private static final String f_12368 = "entries";
   private static final String f_12369 = "formats";
   private static final String f_12370 = "min_format";
   private static final String f_12371 = "min_format";
   private static final String f_12372 = "min_inclusive";
   private static final String f_12373 = "max_format";
   private static final String f_12374 = "max_format";
   private static final String f_12375 = "max_inclusive";
   private static final String f_12376 = "min_format";
   private static final String f_12377 = "min_inclusive";
   private static final String f_12378 = "min_format";
   private static final String f_12379 = "max_inclusive";
   private static final String f_12380 = "max_format";
   private static final String f_12381 = "formats";
   private static final String f_12382 = "formats";
   private static final String f_12383 = "sodium";
   private static final String f_12384 = "ignored_shaders";
   private static final String f_12385 = "rendertype_entity_translucent.fsh";
   private static final String f_12386 = "rendertype_entity_translucent.vsh";
   private static final String f_12387 = "ignored_shaders";
   private static final String f_12388 = "dimasik_rwfixer_revision";
   private static final String f_12389 = "pack";
   private static final String f_12390 = "overlays";
   private static final String f_12391 = "overlays";
   private static final String f_12392 = "min_inclusive";
   private static final String f_12393 = "{\n  \"translation\": [0.5, 0.0, 0.5],\n  \"left_rotation\": [1.0, 0.0, 0.0, -0.0],\n  \"scale\": [1.0, 1.0, 1.0],\n  \"right_rotation\": [0.0, 0.0, 0.0, 1.0]\n}\n";

   private static boolean m_4444(JsonElement var0) {
      boolean var1 = false;
      if (var0.isJsonArray()) {
         for (JsonElement var3 : var0.getAsJsonArray()) {
            var1 |= m_4444(var3);
         }
      } else if (var0.isJsonObject()) {
         JsonObject var5 = var0.getAsJsonObject();
         if (m_4448(var5, f_12333, f_12334) && var5.get(f_12335) instanceof JsonObject var6) {
            if (m_4448(var6, f_12336, f_12337) && m_4448(var6, f_12338, f_12339)) {
               var6.addProperty(f_12340, f_12341);
               var1 = true;
            }

            if (m_4448(var6, f_12342, f_12343)) {
               var1 |= var6.remove(f_12344) != null;
               if (!var5.has(f_12345)) {
                  var5.add(f_12346, f_12331.deepCopy());
                  var1 = true;
               }
            }
         }

         if (m_4448(var5, f_12347, f_12348) && m_4448(var5, f_12349, f_12350) && !var5.has(f_12351)) {
            var5.addProperty(f_12352, 0);
            var1 = true;
         }

         for (JsonElement var8 : var5.asMap().values()) {
            var1 |= m_4444(var8);
         }
      }

      return var1;
   }

   public static boolean m_4445(byte[] var0) {
      try {
         JsonObject var1 = JsonParser.parseString(new String(var0, StandardCharsets.UTF_8)).getAsJsonObject();
         JsonObject var2 = var1.getAsJsonObject(f_12353);
         boolean var3 = var1.has(f_12354) && var1.get(f_12355).getAsInt() == 3 && var2.get(f_12356).getAsInt() == 88 && var2.get(f_12357).getAsInt() == 88;
         if (var3) {
            m_4446(var1);
         }

         return var3;
      } catch (RuntimeException var4) {
         return false;
      }
   }

   private static void m_4446(JsonObject var0) {
      PackMetadataSection.CLIENT_TYPE.codec().parse(JsonOps.INSTANCE, var0.get(f_12389)).getOrThrow(IllegalArgumentException::new);
      if (var0.has(f_12390)) {
         OverlayMetadataSection.CLIENT_TYPE.codec().parse(JsonOps.INSTANCE, var0.get(f_12391)).getOrThrow(IllegalArgumentException::new);
      }
   }

   private static JsonElement m_4447(JsonElement var0, String var1) {
      if (var0 instanceof JsonObject var2 && var2.has(var1)) {
         return var2.get(var1).deepCopy();
      } else if (var0 != null && var0.isJsonPrimitive()) {
         return var0.deepCopy();
      } else {
         return (JsonElement)(var0 instanceof JsonArray var3 && !var3.isEmpty()
            ? var3.get(f_12392.equals(var1) ? 0 : var3.size() - 1).deepCopy()
            : new JsonPrimitive(88));
      }
   }

   private static boolean m_4448(JsonObject var0, String var1, String var2) {
      JsonElement var3 = var0.get(var1);
      return var3 != null && var3.isJsonPrimitive() && (var2.equals(var3.getAsString()) || (var2 + "").equals(var3.getAsString()));
   }

   private static JsonObject m_4449(JsonObject var0, String var1) {
      if (var0.get(var1) instanceof JsonObject var4) {
         return var4;
      } else {
         JsonObject var2 = new JsonObject();
         var0.add(var1, var2);
         return var2;
      }
   }

   public static byte[] m_4450() {
      JsonObject var0 = JsonParser.parseString(f_12358).getAsJsonObject();
      return m_4452(var0);
   }

   public static byte[] m_4451(byte[] var0) {
      JsonObject var1;
      try {
         var1 = JsonParser.parseString(new String(var0, StandardCharsets.UTF_8)).getAsJsonObject();
      } catch (RuntimeException var3) {
         return m_4450();
      }

      return m_4452(var1);
   }

   private static byte[] m_4452(JsonObject var0) {
      JsonObject var1 = m_4449(var0, f_12359);
      if (!var1.has(f_12360)) {
         var1.addProperty(f_12361, f_12362);
      }

      var1.remove(f_12363);
      var1.remove(f_12364);
      var1.addProperty(f_12365, 88);
      var1.addProperty(f_12366, 88);
      if (var0.get(f_12367) instanceof JsonObject var2 && var2.get(f_12368) instanceof JsonArray var3) {
         boolean var12 = false;

         for (JsonElement var6 : var3) {
            if (var6 instanceof JsonObject var7) {
               JsonElement var8 = var7.get(f_12369);
               if (!var7.has(f_12370)) {
                  var7.add(f_12371, m_4447(var8, f_12372));
               }

               if (!var7.has(f_12373)) {
                  var7.add(f_12374, m_4447(var8, f_12375));
               }

               var12 |= m_4455(var7.get(f_12376)) <= PackFormat.lastPreMinorVersion(PackType.CLIENT_RESOURCES);
            }
         }

         for (JsonElement var18 : var3) {
            if (var18 instanceof JsonObject var20) {
               if (var12) {
                  JsonObject var22 = new JsonObject();
                  var22.addProperty(f_12377, m_4455(var20.get(f_12378)));
                  var22.addProperty(f_12379, m_4455(var20.get(f_12380)));
                  var20.add(f_12381, var22);
               } else {
                  var20.remove(f_12382);
               }
            }
         }
      }

      JsonObject var9 = m_4449(var0, f_12383);
      JsonArray var10 = var9.get(f_12384) instanceof JsonArray var13 ? var13 : new JsonArray();

      for (String var21 : new String[]{f_12385, f_12386}) {
         JsonPrimitive var23 = new JsonPrimitive(var21);
         if (!var10.contains(var23)) {
            var10.add(var23);
         }
      }

      var9.add(f_12387, var10);
      var0.addProperty(f_12388, 3);
      m_4446(var0);
      return var0.toString().getBytes(StandardCharsets.UTF_8);
   }

   public static String m_4453(String var0) {
      return var0 + "";
   }

   public static boolean m_4454(String var0) {
      return var0.matches(f_12332);
   }

   private static int m_4455(JsonElement var0) {
      return var0 instanceof JsonArray var1 ? var1.get(0).getAsInt() : var0.getAsInt();
   }

   private Class_QZkGXEqbJiAdc26u() {
   }

   public static byte[] m_4456(byte[] var0) {
      JsonElement var1 = JsonParser.parseString(new String(var0, StandardCharsets.UTF_8));
      return m_4444(var1) ? var1.toString().getBytes(StandardCharsets.UTF_8) : var0;
   }
}
