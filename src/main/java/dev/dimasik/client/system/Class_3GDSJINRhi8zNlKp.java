package dev.dimasik.client.system;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dev.dimasik.client.DimasikClient;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector2f;

public final class Class_3GDSJINRhi8zNlKp implements Class_NzJrN63M7QBpmAbi {
   private static final Class_3GDSJINRhi8zNlKp f_1312 = new Class_3GDSJINRhi8zNlKp();
   private final List<Class_pd4Eet3PWTOW1Bvo> f_1313 = new ArrayList<>();
   private final Gson f_1314 = new GsonBuilder().setPrettyPrinting().create();
   private final Path f_1315;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_1316;
   private boolean f_1317;
   private static final String f_1318 = "dimasik";
   private static final String f_1319 = "waypoints.json";
   private static final String f_1320 = "WAY";
   private static final float f_1321 = 16.0F;
   private static final float f_1322 = 12.0F;
   private static final float f_1323 = 12.0F;
   private static final float f_1324 = 16.0F;
   private static final float f_1325 = 32.0F;
   private static final float f_1326 = 0.5F;
   private static final float f_1327 = 0.5F;
   private static final float f_1328 = 10.0F;
   private static final float f_1329 = 16.0F;
   private static final float f_1330 = 11.0F;
   private static final float f_1331 = 6.0F;
   private static final float f_1332 = 7.0F;
   private static final float f_1333 = 9.0F;
   private static final double f_1334 = 255.0;
   private static final float f_1335 = 12.0F;
   private static final float f_1336 = 11.0F;
   private static final float f_1337 = 0.5F;
   private static final String f_1338 = "name";
   private static final String f_1339 = "x";
   private static final String f_1340 = "y";
   private static final String f_1341 = "z";
   private static final String f_1342 = "name";
   private static final String f_1343 = "x";
   private static final String f_1344 = "y";
   private static final String f_1345 = "z";

   public boolean m_1262(String var1, BlockPos var2) {
      if (this.m_1269(var1).isPresent()) {
         return false;
      }

      this.f_1313.add(new Class_pd4Eet3PWTOW1Bvo(var1, var2));
      this.m_1272();
      return true;
   }

   public void m_1264() {
      if (!this.f_1317) {
         this.f_1317 = true;
         this.m_1267();
         DimasikClient.m_9057().m_9051().m_9713(this);
      }
   }

   private void m_1265(Class_bhRaN0YSSLQRYjPo var1) {
      if (!Class_HKVFPtZz5yGHYty6.m_2883() && f_11537.player != null && f_11537.level != null && !this.f_1313.isEmpty()) {
         for (Class_pd4Eet3PWTOW1Bvo var3 : this.f_1313) {
            Vec3 var4 = Vec3.atCenterOf(var3.pos());
            Vector2f var5 = Class_FvJXUGWpZo3zYBW4.m_2690(var4);
            if (var5 != null) {
               double var6 = f_11537.player.position().distanceTo(var4);
               String var8 = f_1320;
               String var9 = var3.name();
               String var10 = Math.round(var6) + "";
               float var11 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var8, 10);
               float var12 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var9, 13);
               float var13 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9590(), var10, 11);
               float var14 = f_1321 + var11 + f_1322 + var12 + f_1323 + var13 + f_1324;
               float var15 = f_1325;
               float var16 = var5.x - var14 * f_1326;
               float var17 = var5.y - var15 * f_1327;
               Class_Ssh31B3ljfKeWsvS.m_4848(var16, var17, var14, var15, f_1328);
               float var18 = var16 + f_1329;
               Class_Ssh31B3ljfKeWsvS.m_4866(
                  Class_y1y6QpONhWEUIdEB.m_9588(), var8, var18, var17 + f_1330, 11, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN)
               );
               float var19 = var18 + var11 + f_1331;
               float var20 = var19 + f_1332;
               Class_Ssh31B3ljfKeWsvS.m_4866(
                  Class_y1y6QpONhWEUIdEB.m_9588(), var9, var20, var17 + f_1333, 13, Class_BftdentXEtGbugJw.m_2303(235, 239, 247, f_1334)
               );
               Class_Ssh31B3ljfKeWsvS.m_4866(
                  Class_y1y6QpONhWEUIdEB.m_9590(),
                  var10,
                  var20 + var12 + f_1335,
                  var17 + f_1336,
                  11,
                  Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN), f_1337)
               );
            }
         }
      }
   }

   public Class_3GDSJINRhi8zNlKp() {
      this.f_1315 = FabricLoader.getInstance().getConfigDir().resolve(f_1318).resolve(f_1319);
      this.f_1316 = this::m_1265;
   }

   public boolean m_1266(String var1) {
      boolean var2 = this.f_1313.removeIf(var1x -> var1x.name().equalsIgnoreCase(var1));
      if (var2) {
         this.m_1272();
      }

      return var2;
   }

   public void m_1267() {
      this.f_1313.clear();
      if (Files.exists(this.f_1315)) {
         try {
            for (JsonElement var3 : JsonParser.parseString(Files.readString(this.f_1315, StandardCharsets.UTF_8)).getAsJsonArray()) {
               JsonObject var4 = var3.getAsJsonObject();
               this.f_1313
                  .add(
                     new Class_pd4Eet3PWTOW1Bvo(
                        var4.get(f_1342).getAsString(), new BlockPos(var4.get(f_1343).getAsInt(), var4.get(f_1344).getAsInt(), var4.get(f_1345).getAsInt())
                     )
                  );
            }
         } catch (Exception var5) {
            this.f_1313.clear();
         }
      }
   }

   public List<Class_pd4Eet3PWTOW1Bvo> m_1268() {
      return List.copyOf(this.f_1313);
   }

   public Optional<Class_pd4Eet3PWTOW1Bvo> m_1269(String var1) {
      return this.f_1313.stream().filter(var1x -> var1x.name().equalsIgnoreCase(var1)).findFirst();
   }

   public int m_1270() {
      int var1 = this.f_1313.size();
      this.f_1313.clear();
      this.m_1272();
      return var1;
   }

   public static Class_3GDSJINRhi8zNlKp m_1271() {
      return f_1312;
   }

   public void m_1272() {
      try {
         Files.createDirectories(this.f_1315.getParent());
         JsonArray var1 = new JsonArray();

         for (Class_pd4Eet3PWTOW1Bvo var3 : this.f_1313) {
            JsonObject var4 = new JsonObject();
            var4.addProperty(f_1338, var3.name());
            var4.addProperty(f_1339, var3.pos().getX());
            var4.addProperty(f_1340, var3.pos().getY());
            var4.addProperty(f_1341, var3.pos().getZ());
            var1.add(var4);
         }

         Files.writeString(this.f_1315, this.f_1314.toJson(var1), StandardCharsets.UTF_8);
      } catch (Exception var5) {
      }
   }
}
