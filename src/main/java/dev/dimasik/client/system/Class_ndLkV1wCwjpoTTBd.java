package dev.dimasik.client.system;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map.Entry;

public final class Class_ndLkV1wCwjpoTTBd {
   private static final String f_25832 = "assets/dimasik/lang/gui_en.json";
   private static final String f_25833 = "[Lang] gui_en.json not found";

   public static void m_7679() {
      HashMap var0 = new HashMap();

      try {
         label67: {
            try (InputStream var1 = Class_ndLkV1wCwjpoTTBd.class.getClassLoader().getResourceAsStream(f_25832)) {
               if (var1 != null) {
                  JsonObject var2 = JsonParser.parseReader(new InputStreamReader(var1, StandardCharsets.UTF_8)).getAsJsonObject();

                  for (Entry var4 : var2.entrySet()) {
                     if (((JsonElement)var4.getValue()).isJsonPrimitive()) {
                        var0.put((String)var4.getKey(), ((JsonElement)var4.getValue()).getAsString());
                     }
                  }
                  break label67;
               }

               System.err.println(f_25833);
               Class_0p152hWffX3ippAf.m_796(var0);
            }

            return;
         }
      } catch (Throwable var7) {
         System.err.println(var7.getMessage() + "");
      }

      Class_0p152hWffX3ippAf.m_796(var0);
      System.out.println(var0.size() + "");
   }

   private Class_ndLkV1wCwjpoTTBd() {
   }
}
