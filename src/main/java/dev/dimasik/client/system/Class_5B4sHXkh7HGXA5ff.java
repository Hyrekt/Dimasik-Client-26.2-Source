package dev.dimasik.client.system;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.server.packs.resources.ResourceManager;

public class Class_5B4sHXkh7HGXA5ff implements SimpleSynchronousResourceReloadListener {
   private static final String f_2427 = "holdmyitems";
   private static final String f_2428 = "lua_animation_loader";
   private static final String f_2429 = "global\\.(\\w+)\\s*=\\s*([^;]+)\\s*;";
   private static final String f_2430 = "\\$\\{(\\w+)\\}";
   private static final String f_2431 = "respackopts";
   private static final String f_2432 = "\\r?\\n";
   private static final String f_2433 = "0";
   private static final String f_2434 = "\n-- PERSIST VARIABLES\n";
   private static final String f_2435 = "registry:put('";
   private static final String f_2436 = "',";
   private static final String f_2437 = ")\n";
   private static final String f_2438 = "holdmyitems/hand_pose.lua";
   private static final String f_2439 = "holdmyitems/item_pose.lua";
   private static final String f_2440 = "holdmyitems/hand_relative_pose.lua";
   private static final String f_2441 = "holdmyitems/item_model.lua";
   private static final String f_2442 = "holdmyitems/hand_addon.lua";
   private static final String f_2443 = "holdmyitems/hand_relative_addon.lua";
   private static final String f_2444 = "holdmyitems/item_addon.lua";
   private static final String f_2445 = "holdmyitems/item_model_addon.lua";
   private static final String f_2446 = "minecraft";
   private static final String f_2447 = "minecraft";
   private static final String f_2448 = "minecraft";

   private String preprocessScript(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         Pattern var2 = Pattern.compile(f_2429);
         Pattern var3 = Pattern.compile(f_2430);
         HashSet var4 = new HashSet();
         StringBuilder var5 = new StringBuilder();
         boolean var6 = FabricLoader.getInstance().isModLoaded(f_2431);

         for (String var10 : var1.split(f_2432)) {
            String var11 = var10;
            if (!var6) {
               Matcher var12 = var3.matcher(var11);
               StringBuffer var13 = new StringBuffer();

               while (var12.find()) {
                  var12.appendReplacement(var13, f_2433);
               }

               var12.appendTail(var13);
               var11 = var13.toString();
            }

            Matcher var19 = var2.matcher(var11);
            StringBuffer var20 = new StringBuffer();

            boolean var14;
            for (var14 = false; var19.find(); var14 = true) {
               String var15 = var19.group(1);
               String var16 = var19.group(2).trim();
               var4.add(var15);
               var19.appendReplacement(var20, var15 + var15 + var16);
            }

            var19.appendTail(var20);
            var5.append(var14 ? var20.toString() : var11).append('\n');
         }

         if (!var4.isEmpty()) {
            var5.append(f_2434);

            for (String var18 : (Iterable<String>) (Iterable) var4) {
               var5.append(f_2435).append(var18).append(f_2436).append(var18).append(f_2437);
            }
         }

         return var5.toString();
      } else {
         return var1;
      }
   }

   private void loadSingle(ResourceManager var1, String var2, Consumer<String> var3) {
      Identifier var4 = Identifier.fromNamespaceAndPath(f_2446, var2);

      try {
         Resource var5 = (Resource)var1.getResource(var4).orElse(null);
         if (var5 == null) {
            var3.accept("");
            return;
         }

         try (InputStream var6 = var5.open()) {
            var3.accept(this.preprocessScript(new String(var6.readAllBytes(), StandardCharsets.UTF_8)));
         }
      } catch (Exception var11) {
         var3.accept("");
         var11.printStackTrace();
      }
   }

   public void onResourceManagerReload(ResourceManager var1) {
      Class_LRsxqvEkEcBPGPUf.f_10578.clear();
      Class_LRsxqvEkEcBPGPUf.f_10579.clear();
      Class_LRsxqvEkEcBPGPUf.f_10584.clear();
      Class_LRsxqvEkEcBPGPUf.f_10582.clear();
      Class_LRsxqvEkEcBPGPUf.f_10580.clear();
      this.loadSingle(var1, f_2438, var0 -> {
         try {
            Class_uxCxe8d1qdBSkRXf.f_33272 = new Class_vfCH9nEcAGy3E8bx(var0);
         } catch (IOException var2) {
            throw new RuntimeException(var2);
         }
      });
      this.loadSingle(var1, f_2439, var0 -> {
         try {
            Class_uxCxe8d1qdBSkRXf.f_33274 = new Class_vfCH9nEcAGy3E8bx(var0);
         } catch (IOException var2) {
            throw new RuntimeException(var2);
         }
      });
      this.loadSingle(var1, f_2440, var0 -> {
         try {
            Class_uxCxe8d1qdBSkRXf.f_33273 = new Class_vfCH9nEcAGy3E8bx(var0);
         } catch (IOException var2) {
            throw new RuntimeException(var2);
         }
      });
      this.loadSingle(var1, f_2441, var0 -> {
         try {
            Class_uxCxe8d1qdBSkRXf.f_33275 = new Class_4jILs03bXRDH6BlD(var0);
         } catch (IOException var2) {
            throw new RuntimeException(var2);
         }
      });
      Class_uxCxe8d1qdBSkRXf.f_33268 = this.loadMultiple(var1, f_2442);
      Class_uxCxe8d1qdBSkRXf.f_33269 = this.loadMultiple(var1, f_2443);
      Class_uxCxe8d1qdBSkRXf.f_33270 = this.loadMultiple(var1, f_2444);
      Class_uxCxe8d1qdBSkRXf.f_33271 = this.loadMultipleModel(var1, f_2445);
   }

   public Identifier getFabricId() {
      return Identifier.fromNamespaceAndPath(f_2427, f_2428);
   }

   private ArrayList<Class_vfCH9nEcAGy3E8bx> loadMultiple(ResourceManager var1, String var2) {
      Identifier var3 = Identifier.fromNamespaceAndPath(f_2447, var2);
      ArrayList var4 = new ArrayList();

      try {
         for (Resource var7 : var1.getResourceStack(var3)) {
            try (InputStream var8 = var7.open()) {
               String var9 = this.preprocessScript(new String(var8.readAllBytes(), StandardCharsets.UTF_8));
               var4.add(new Class_vfCH9nEcAGy3E8bx(var9));
            }
         }
      } catch (Exception var13) {
         var13.printStackTrace();
      }

      return var4;
   }

   private ArrayList<Class_4jILs03bXRDH6BlD> loadMultipleModel(ResourceManager var1, String var2) {
      Identifier var3 = Identifier.fromNamespaceAndPath(f_2448, var2);
      ArrayList var4 = new ArrayList();

      try {
         for (Resource var7 : var1.getResourceStack(var3)) {
            try (InputStream var8 = var7.open()) {
               String var9 = this.preprocessScript(new String(var8.readAllBytes(), StandardCharsets.UTF_8));
               var4.add(new Class_4jILs03bXRDH6BlD(var9));
            }
         }
      } catch (Exception var13) {
         var13.printStackTrace();
      }

      return var4;
   }
}
