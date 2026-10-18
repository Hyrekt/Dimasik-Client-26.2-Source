package dev.dimasik.client.system;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.resources.Resource;

public final class Class_YaEsaeS2vWKCkc5L {
   private static final Map<Class_HSD91zSgdqsM5q0d, List<Class_CaVoGy5a20MKv97j>> f_16440 = new EnumMap<>(Class_HSD91zSgdqsM5q0d.class);
   private static final Map<String, Class_CaVoGy5a20MKv97j> f_16441 = new LinkedHashMap<>();
   private static boolean f_16442;
   private static final String f_16443 = "dimasik";
   private static final String f_16444 = "cosmetics/catalog.json";
   private static final String f_16445 = "name";
   private static final String f_16446 = "displayName";
   private static final String f_16447 = "category";
   private static final String f_16448 = "dimasik";
   private static final String f_16449 = "dimasik";
   private static final String f_16450 = "animation";
   private static final String f_16451 = "animation";
   private static final String f_16452 = "dimasik";
   private static final String f_16453 = "attach";
   private static final String f_16454 = "attach";
   private static final String f_16455 = "scale";
   private static final String f_16456 = "x";
   private static final String f_16457 = "y";
   private static final String f_16458 = "z";

   public static List<Class_CaVoGy5a20MKv97j> m_5692(Class_HSD91zSgdqsM5q0d var0) {
      m_5693();
      return f_16440.getOrDefault(var0, List.of());
   }

   private static void m_5693() {
      if (!f_16442) {
         f_16442 = true;
         Identifier var0 = Identifier.fromNamespaceAndPath(f_16443, f_16444);
         Optional var1 = Minecraft.getInstance().getResourceManager().getResource(var0);
         if (!var1.isEmpty()) {
            try (InputStream var2 = ((Resource)var1.get()).open()) {
               for (JsonElement var5 : JsonParser.parseReader(new InputStreamReader(var2, StandardCharsets.UTF_8)).getAsJsonArray()) {
                  m_5697(var5.getAsJsonObject());
               }
            } catch (Exception var8) {
            }
         }
      }
   }

   public static void m_5694() {
      f_16442 = false;
      f_16440.clear();
      f_16441.clear();
   }

   public static String m_5696(Class_HSD91zSgdqsM5q0d var0) {
      List var1 = m_5692(var0);
      return var1.isEmpty() ? "" : ((Class_CaVoGy5a20MKv97j)var1.getFirst()).name();
   }

   private static void m_5697(JsonObject var0) {
      String var1 = var0.get(f_16445).getAsString();
      String var2 = var0.get(f_16446).getAsString();
      Class_HSD91zSgdqsM5q0d var3 = Class_HSD91zSgdqsM5q0d.m_2887(var0.get(f_16447).getAsString());
      String var4 = var3.m_2888() + var1;
      Identifier var5 = Identifier.fromNamespaceAndPath(f_16448, var4 + "");
      Identifier var6 = Identifier.fromNamespaceAndPath(f_16449, var4 + "");
      Optional var7 = Minecraft.getInstance().getResourceManager().getResource(var5);
      if (!var7.isEmpty()) {
         try (InputStream var8 = ((Resource)var7.get()).open()) {
            Class_vhSU9kAizeRReaAF var9 = null;
            Map var10 = Map.of();
            if (var0.has(f_16450) && var0.get(f_16451).getAsBoolean()) {
               Optional var11 = Minecraft.getInstance().getResourceManager().getResource(Identifier.fromNamespaceAndPath(f_16452, var4 + ""));
               if (var11.isPresent()) {
                  try (InputStream var12 = ((Resource)var11.get()).open()) {
                     var10 = Map.copyOf(Class_vhSU9kAizeRReaAF.m_9267(var12));
                     if (!var10.isEmpty()) {
                        var9 = (Class_vhSU9kAizeRReaAF)var10.values().iterator().next();
                     }
                  }
               }
            }

            Class_LQL7JwvjBBIPKKmN var20 = var0.has(f_16453)
               ? Class_LQL7JwvjBBIPKKmN.m_3627(var0.get(f_16454).getAsString())
               : Class_LQL7JwvjBBIPKKmN.m_3628(var3);
            Class_CaVoGy5a20MKv97j var21 = new Class_CaVoGy5a20MKv97j(
               var1,
               var2,
               var3,
               var0.get(f_16455).getAsFloat(),
               var0.get(f_16456).getAsFloat(),
               var0.get(f_16457).getAsFloat(),
               var0.get(f_16458).getAsFloat(),
               var6,
               Class_oAq4PeD1FSXoIaXR.m_7728(var8),
               var9,
               var20,
               var10
            );
            f_16440.computeIfAbsent(var3, var0x -> new ArrayList<>()).add(var21);
            f_16441.put(var3.m_2888() + var1, var21);
         } catch (Exception var19) {
         }
      }
   }

   public static Class_CaVoGy5a20MKv97j m_5698(Class_HSD91zSgdqsM5q0d var0, String var1) {
      m_5693();
      return f_16441.get(var0.m_2888() + var1);
   }

   private Class_YaEsaeS2vWKCkc5L() {
   }
}
