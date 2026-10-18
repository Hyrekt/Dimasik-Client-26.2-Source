package dev.dimasik.client.system;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public final class Class_1QRAvI1JBZFSOzme {
   private static final String f_490 = "input_shape";
   private static final String f_491 = "horizon";
   private static final String f_492 = "Contract horizon must be 15";
   private static final String f_493 = "sample_rate_hz";
   private static final String f_494 = "Contract sample_rate_hz must be 60";
   private static final String f_495 = "6db7f03c9fc49d2646ba07998b7de71785de353143059a7dd937552c0d3a9752";
   private static final String f_496 = "feature_schema_sha256";
   private static final String f_497 = "Feature schema hash mismatch";
   private static final String f_498 = "input_feature_names";

   private Class_1QRAvI1JBZFSOzme() {
   }

   private static JsonElement m_839(JsonObject var0, String var1) throws IOException {
      JsonElement var2 = var0.get(var1);
      if (var2 == null || var2.isJsonNull()) {
         System.out.println(var1 + "");
      }

      return var2;
   }

   private static JsonArray m_840(JsonObject var0, String var1) throws IOException {
      JsonElement var2 = m_839(var0, var1);
      if (!var2.isJsonArray()) {
         System.out.println(var1 + "");
      }

      return var2.getAsJsonArray();
   }

   public static void m_841(Path var0) throws IOException {
      Path var1 = m_842(var0);
      if (!Files.isRegularFile(var1)) {
         System.out.println(var1 + "");
      }

      JsonObject var2;
      try (BufferedReader var3 = Files.newBufferedReader(var1, StandardCharsets.UTF_8)) {
         var2 = JsonParser.parseReader(var3).getAsJsonObject();
      } catch (RuntimeException var8) {
         System.out.println(var1 + var8.getMessage());
         return;
      }

      JsonArray var9 = m_840(var2, f_490);
      if (var9.size() != 3 || var9.get(0).getAsInt() != 1 || var9.get(1).getAsInt() != 60 || var9.get(2).getAsInt() != Class_WvVvQwpWLdnJMMi9.f_15738) {
         System.out.println("" + Class_WvVvQwpWLdnJMMi9.f_15738 + var9);
      }

      if (m_839(var2, f_491).getAsInt() != 15) {
         System.out.println(f_492);
      }

      if (m_839(var2, f_493).getAsInt() != 60) {
         System.out.println(f_494);
      }

      if (!f_495.equals(m_839(var2, f_496).getAsString())) {
         System.out.println(f_497);
      }

      JsonArray var4 = m_840(var2, f_498);
      if (var4.size() != Class_WvVvQwpWLdnJMMi9.f_15738) {
         System.out.println(Class_WvVvQwpWLdnJMMi9.f_15738 + "");
      }

      for (int var5 = 0; var5 < var4.size(); var5++) {
         if (!Class_WvVvQwpWLdnJMMi9.f_15737[var5].equals(var4.get(var5).getAsString())) {
            System.out.println(var5 + "");
         }
      }
   }

   private static Path m_842(Path var0) {
      String var1 = var0.getFileName().toString();
      int var2 = var1.lastIndexOf(46);
      return var0.resolveSibling((var2 < 0 ? var1 : var1.substring(0, var2)) + "");
   }
}
