package dev.dimasik.client.system;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;
import lombok.Generated;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.resources.ResourceManager;

public final class Class_4zw2NauxJRAjSJsT {
   private static final Identifier f_2217 = Identifier.fromNamespaceAndPath(Class_4zw2NauxJRAjSJsT.f_2221, Class_4zw2NauxJRAjSJsT.f_2222);
   private static final Gson f_2218 = new Gson();
   private static final String f_2219 = "\n";
   private static final String f_2220 = "This is a utility class and cannot be instantiated";
   private static final String f_2221 = "dimasik";
   private static final String f_2222 = "fonts/icons.json";

   private static InputStream m_1390(Identifier var0) throws IOException {
      String var1 = "/assets/" + var0.getNamespace() + "/" + var0.getPath();
      InputStream var2 = Class_4zw2NauxJRAjSJsT.class.getResourceAsStream(var1);
      if (var2 == null) {
         throw new IOException(var1);
      } else {
         return var2;
      }
   }

   private static InputStream m_1391(Identifier var0) throws IOException {
      if (var0.equals(f_2217)) {
         return m_1390(var0);
      }

      ResourceManager var1 = Minecraft.getInstance().getResourceManager();
      return var1.getResource(var0).isPresent() ? var1.open(var0) : m_1390(var0);
   }

   public static String m_1392(Identifier var0) {
      return m_1394(var0, f_2219);
   }

   @Generated
   private Class_4zw2NauxJRAjSJsT() {
      throw new UnsupportedOperationException(f_2220);
   }

   public static <T> T m_1393(Identifier var0, Class<T> var1) {
      return (T)f_2218.fromJson(m_1392(var0), var1);
   }

   public static String m_1394(Identifier var0, String var1) {
      try (
         InputStream var2 = m_1391(var0);
         BufferedReader var3 = new BufferedReader(new InputStreamReader(var2, StandardCharsets.UTF_8));
      ) {
         return var3.lines().collect(Collectors.joining(var1));
      } catch (IOException var10) {
         throw new RuntimeException(var10);
      }
   }

   public static JsonObject m_1395(Identifier var0) {
      return JsonParser.parseString(m_1392(var0)).getAsJsonObject();
   }
}
