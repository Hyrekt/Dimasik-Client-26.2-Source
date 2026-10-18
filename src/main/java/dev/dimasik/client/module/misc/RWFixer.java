package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.BooleanSetting;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.system.Class_QZkGXEqbJiAdc26u;
import dev.dimasik.client.system.Class_ftHu9o3WzCU3Adxm;
import dev.dimasik.client.system.Class_l0gjJA23I6dlnzax;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.HexFormat;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import net.minecraft.client.resources.server.PackLoadFeedback.FinalResult;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.common.ServerboundResourcePackPacket;
import net.minecraft.network.protocol.common.ServerboundResourcePackPacket.Action;
import net.minecraft.server.packs.DownloadQueue.BatchResult;
import net.minecraft.server.packs.DownloadQueue.DownloadRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RWFixer extends Module {
   private static final File f_29249 = new File(System.getenv(RWFixer.f_29330) + "", RWFixer.f_29331);
   private static final Logger f_29250 = LoggerFactory.getLogger(RWFixer.f_29332);
   private static volatile RWFixer f_29251;
   private static final byte[] f_29252 = new byte[]{80, 75, 3, 4};
   private static final Pattern f_29253 = Pattern.compile(RWFixer.f_29333, 32);
   private static final Pattern f_29254 = Pattern.compile(RWFixer.f_29334);
   private static final String f_29255 = "{\n  \"sources\": [\n    {\n      \"type\": \"minecraft:directory\",\n      \"prefix\": \"item/\",\n      \"source\": \"item\"\n    },\n    {\n      \"type\": \"minecraft:directory\",\n      \"prefix\": \"archangel_set_texture/\",\n      \"source\": \"archangel_set_texture\"\n    },\n    {\n      \"type\": \"minecraft:directory\",\n      \"prefix\": \"gui/\",\n      \"source\": \"gui\"\n    },\n    {\n      \"type\": \"minecraft:directory\",\n      \"prefix\": \"custom/\",\n      \"source\": \"custom\"\n    },\n    {\n      \"type\": \"minecraft:paletted_permutations\",\n      \"palette_key\": \"minecraft:trims/color_palettes/trim_palette\",\n      \"permutations\": {\n        \"amethyst\": \"minecraft:trims/color_palettes/amethyst\",\n        \"copper\": \"minecraft:trims/color_palettes/copper\",\n        \"copper_darker\": \"minecraft:trims/color_palettes/copper_darker\",\n        \"diamond\": \"minecraft:trims/color_palettes/diamond\",\n        \"diamond_darker\": \"minecraft:trims/color_palettes/diamond_darker\",\n        \"emerald\": \"minecraft:trims/color_palettes/emerald\",\n        \"gold\": \"minecraft:trims/color_palettes/gold\",\n        \"gold_darker\": \"minecraft:trims/color_palettes/gold_darker\",\n        \"iron\": \"minecraft:trims/color_palettes/iron\",\n        \"iron_darker\": \"minecraft:trims/color_palettes/iron_darker\",\n        \"lapis\": \"minecraft:trims/color_palettes/lapis\",\n        \"netherite\": \"minecraft:trims/color_palettes/netherite\",\n        \"netherite_darker\": \"minecraft:trims/color_palettes/netherite_darker\",\n        \"quartz\": \"minecraft:trims/color_palettes/quartz\",\n        \"redstone\": \"minecraft:trims/color_palettes/redstone\",\n        \"resin\": \"minecraft:trims/color_palettes/resin\"\n      },\n      \"textures\": [\n        \"minecraft:trims/items/helmet_trim\",\n        \"minecraft:trims/items/chestplate_trim\",\n        \"minecraft:trims/items/leggings_trim\",\n        \"minecraft:trims/items/boots_trim\"\n      ]\n    }\n  ]\n}\n";
   private final CheckboxSetting f_29256;
   private final CheckboxSetting f_29257;
   private final BooleanSetting f_29258;
   private final ExecutorService f_29259;
   private final Map<UUID, RWFixer.hHJJ9YWMFAhInbEm> f_29260;
   private volatile Connection f_29261;
   private static final String f_29262 = "RWFixer";
   private static final String f_29263 = "Автоматически исправляет ресурспак на ReallyWorld и PlayRW";
   private static final String f_29264 = "Спуф статуса";
   private static final String f_29265 = "Уведомления";
   private static final String f_29266 = "Открыть папку";
   private static final int f_29267 = 65535;
   private static final String f_29268 = ".";
   private static final String f_29269 = "reallyworld.me";
   private static final String f_29270 = ".reallyworld.me";
   private static final String f_29271 = "reallyworld.ru";
   private static final String f_29272 = ".reallyworld.ru";
   private static final String f_29273 = "playrw.ru";
   private static final String f_29274 = ".playrw.ru";
   private static final String f_29275 = "playrw.me";
   private static final String f_29276 = ".playrw.me";
   private static final String f_29277 = "RwFixed applied for resource pack {}";
   private static final String f_29278 = "RwFixed загружен и применён.";
   private static final String f_29279 = "RwFixed could not be applied for resource pack {}: {}";
   private static final String f_29280 = "Не удалось загрузить РП. Причина записана в latest.log.";
   private static final String f_29281 = "Не удалось применить RwFixed. Причина записана в latest.log.";
   private static final String f_29282 = "RwFixed";
   private static final String f_29283 = "Подготавливаю RwFixed для ресурспака ReallyWorld...";
   private static final String f_29284 = "Could not update ReallyWorld rank icons";
   private static final String f_29285 = "pack.mcmeta";
   private static final String f_29286 = "rwfixed-";
   private static final String f_29287 = ".writing";
   private static final String f_29288 = "rp-raw-";
   private static final String f_29289 = ".zip";
   private static final String f_29290 = "rp-out-";
   private static final String f_29291 = ".zip";
   private static final String f_29292 = "assets/";
   private static final String f_29293 = "/models/item/";
   private static final String f_29294 = ".json";
   private static final String f_29295 = "/models/";
   private static final String f_29296 = "/items/";
   private static final String f_29297 = "/";
   private static final String f_29298 = "pack.mcmeta";
   private static final String f_29299 = "assets/";
   private static final String f_29300 = "/models/";
   private static final String f_29301 = ".json";
   private static final String f_29302 = "pack.mcmeta";
   private static final String f_29303 = "pack.mcmeta";
   private static final String f_29304 = "/models/";
   private static final String f_29305 = "/items/";
   private static final String f_29306 = "assets/minecraft/atlases/items.json";
   private static final String f_29307 = "assets/minecraft/atlases/items.json";
   private static final String f_29308 = "{\n  \"sources\": [\n    {\n      \"type\": \"minecraft:directory\",\n      \"prefix\": \"item/\",\n      \"source\": \"item\"\n    },\n    {\n      \"type\": \"minecraft:directory\",\n      \"prefix\": \"archangel_set_texture/\",\n      \"source\": \"archangel_set_texture\"\n    },\n    {\n      \"type\": \"minecraft:directory\",\n      \"prefix\": \"gui/\",\n      \"source\": \"gui\"\n    },\n    {\n      \"type\": \"minecraft:directory\",\n      \"prefix\": \"custom/\",\n      \"source\": \"custom\"\n    },\n    {\n      \"type\": \"minecraft:paletted_permutations\",\n      \"palette_key\": \"minecraft:trims/color_palettes/trim_palette\",\n      \"permutations\": {\n        \"amethyst\": \"minecraft:trims/color_palettes/amethyst\",\n        \"copper\": \"minecraft:trims/color_palettes/copper\",\n        \"copper_darker\": \"minecraft:trims/color_palettes/copper_darker\",\n        \"diamond\": \"minecraft:trims/color_palettes/diamond\",\n        \"diamond_darker\": \"minecraft:trims/color_palettes/diamond_darker\",\n        \"emerald\": \"minecraft:trims/color_palettes/emerald\",\n        \"gold\": \"minecraft:trims/color_palettes/gold\",\n        \"gold_darker\": \"minecraft:trims/color_palettes/gold_darker\",\n        \"iron\": \"minecraft:trims/color_palettes/iron\",\n        \"iron_darker\": \"minecraft:trims/color_palettes/iron_darker\",\n        \"lapis\": \"minecraft:trims/color_palettes/lapis\",\n        \"netherite\": \"minecraft:trims/color_palettes/netherite\",\n        \"netherite_darker\": \"minecraft:trims/color_palettes/netherite_darker\",\n        \"quartz\": \"minecraft:trims/color_palettes/quartz\",\n        \"redstone\": \"minecraft:trims/color_palettes/redstone\",\n        \"resin\": \"minecraft:trims/color_palettes/resin\"\n      },\n      \"textures\": [\n        \"minecraft:trims/items/helmet_trim\",\n        \"minecraft:trims/items/chestplate_trim\",\n        \"minecraft:trims/items/leggings_trim\",\n        \"minecraft:trims/items/boots_trim\"\n      ]\n    }\n  ]\n}\n";
   private static final String f_29309 = "assets/";
   private static final String f_29310 = ".json";
   private static final String f_29311 = "assets/";
   private static final String f_29312 = "models/";
   private static final String f_29313 = "models/";
   private static final String f_29314 = "assets/";
   private static final String f_29315 = "/textures/";
   private static final String f_29316 = ".png";
   private static final String f_29317 = "assets/";
   private static final String f_29318 = "textures/";
   private static final String f_29319 = "textures/";
   private static final String f_29320 = "/";
   private static final String f_29321 = "minecraft";
   private static final String f_29322 = "\"textures\":{";
   private static final String f_29323 = "\":\"";
   private static final String f_29324 = "/";
   private static final String f_29325 = "assets/";
   private static final String f_29326 = "SHA-1";
   private static final String f_29327 = "explorer.exe";
   private static final String f_29328 = "Failed to prepare ReallyWorld resource pack {}";
   private static final String f_29329 = "RWFixer";
   private static final String f_29330 = "SystemDrive";
   private static final String f_29331 = "dimasik/resourcepacks";
   private static final String f_29332 = "Dimasik/RWFixer";
   private static final String f_29333 = "\"textures\"\\s*:\\s*\\{([^}]*)}";
   private static final String f_29334 = "\"([^\"]+)\"\\s*:\\s*\"([^\"]+)\"";

   private byte[] m_8285(byte[] var1) {
      int var2 = this.m_8290(var1, f_29252);
      if (var2 <= 0) {
         return var1;
      }

      byte[] var3 = new byte[var1.length - var2];
      System.arraycopy(var1, var2, var3, 0, var3.length);
      return var3;
   }

   private Set<String> m_8286(File var1) throws Exception {
      HashSet var2 = new HashSet();

      try (ZipFile var3 = new ZipFile(var1)) {
         Enumeration var4 = var3.entries();

         while (var4.hasMoreElements()) {
            String var5 = this.m_8288(this.m_8308((ZipEntry)var4.nextElement()));
            if (var5.startsWith(f_29314) && var5.contains(f_29315) && var5.endsWith(f_29316)) {
               String var6 = var5.substring(f_29317.length());
               int var7 = var6.indexOf(47);
               if (var7 >= 0) {
                  String var8 = var6.substring(0, var7);
                  String var9 = var6.substring(var7 + 1);
                  if (var9.startsWith(f_29318)) {
                     String var10 = var9.substring(f_29319.length(), var9.length() - 4);
                     var2.add(var8 + var10);
                  }
               }
            }
         }
      }

      return var2;
   }

   @Override
   public void m_777() {
   }

   private String m_8288(String var1) {
      int var2 = var1.indexOf(f_29325);
      return var2 > 0 && var1.charAt(var2 - 1) == '/' ? var1.substring(var2) : var1;
   }

   @Override
   public void m_792() {
      if (!this.m_776()) {
         super.m_792();
      }
   }

   private int m_8290(byte[] var1, byte[] var2) {
      label24:
      for (int var3 = 0; var3 <= var1.length - var2.length; var3++) {
         for (int var4 = 0; var4 < var2.length; var4++) {
            if (var1[var3 + var4] != var2[var4]) {
               continue label24;
            }
         }

         return var3;
      }

      return -1;
   }

   public void m_8291(Connection var1, UUID var2, FinalResult var3) {
      if (this.f_29261 == var1 && this.f_29260.containsKey(var2)) {
         if (var3 == FinalResult.APPLIED) {
            f_29250.info(f_29277, var2);
            this.m_8302(f_29278);
         } else if (var3 == FinalResult.DOWNLOAD_FAILED || var3 == FinalResult.ACTIVATION_FAILED) {
            f_29250.warn(f_29279, var2, var3);
            this.m_8302(var3 == FinalResult.DOWNLOAD_FAILED ? f_29280 : f_29281);
         }
      }
   }

   private String m_8292(byte[] var1) throws Exception {
      byte[] var2 = MessageDigest.getInstance(f_29326).digest(var1);
      return HexFormat.of().formatHex(var2);
   }

   public void m_8293(Map<UUID, DownloadRequest> var1, Connection var2, BatchResult var3, Consumer<BatchResult> var4, Executor var5) {
      if (var2 != null && this.f_29261 == var2) {
         HashMap var6 = new HashMap();

         for (Entry var8 : var3.downloaded().entrySet()) {
            DownloadRequest var9 = (DownloadRequest)var1.get(var8.getKey());
            RWFixer.hHJJ9YWMFAhInbEm var10 = this.f_29260.get(var8.getKey());
            if (var9 != null && var10 != null && var10.url().equals(var9.url().toExternalForm())) {
               var6.put((UUID)var8.getKey(), (Path)var8.getValue());
            }
         }

         if (var6.isEmpty()) {
            var4.accept(var3);
         } else {
            this.f_29259.execute(() -> {
               HashMap var6x = new HashMap(var3.downloaded());
               HashSet var7 = new HashSet(var3.failed());

               for (Object var9xObj : var6.entrySet()) {
                  Entry var9x = (Entry) var9xObj;
                  if (this.f_29261 != var2) {
                     break;
                  }

                  try {
                     var6x.put((UUID)var9x.getKey(), this.m_8297((Path)var9x.getValue()));
                  } catch (Exception var12) {
                     var6x.remove(var9x.getKey());
                     var7.add((UUID)var9x.getKey());
                     f_29250.error(f_29328, var9x.getKey(), var12);
                     String var11 = var12.getMessage() != null ? var12.getMessage() : var12.getClass().getSimpleName();
                     this.m_8302(var11 + "");
                  }
               }

               BatchResult var13 = new BatchResult(var6x, var7);
               var5.execute(() -> var4.accept(this.f_29261 == var2 ? var13 : var3));
            });
         }
      } else {
         var4.accept(var3);
      }
   }

   public static RWFixer m_8294() {
      return f_29251;
   }

   public RWFixer() {
      super(f_29262, f_29263, Category.MISC);
      this.f_29256 = new CheckboxSetting(f_29264, true);
      this.f_29257 = new CheckboxSetting(f_29265, true);
      this.f_29258 = new BooleanSetting(f_29266).m_1474(this::m_8307).m_1472();
      this.f_29259 = Executors.newSingleThreadExecutor(var0 -> {
         Thread var1 = new Thread(var0, f_29329);
         var1.setDaemon(true);
         return var1;
      });
      this.f_29260 = new HashMap<>();
      this.m_795(this.f_29256, this.f_29257, this.f_29258);
      f_29251 = this;
   }

   private byte[] m_8295(byte[] var1) throws Exception {
      Path var2 = Files.createTempFile(f_29288, f_29289);
      Path var3 = Files.createTempFile(f_29290, f_29291);

      try {
         Files.write(var2, var1);
         Set var4 = this.m_8286(var2.toFile());
         HashSet var5 = new HashSet();
         ArrayList var6 = new ArrayList();

         try (ZipFile var7 = new ZipFile(var2.toFile())) {
            Enumeration var8 = var7.entries();

            while (var8.hasMoreElements()) {
               String var9 = this.m_8308((ZipEntry)var8.nextElement());
               var5.add(var9);
            }

            for (String var10 : (Iterable<String>) (Iterable) var5) {
               if (this.m_8288(var10).startsWith(f_29292) && var10.contains(f_29293) && var10.endsWith(f_29294)) {
                  String var11 = var10.replace(f_29295, f_29296);
                  if (!var5.contains(var11)) {
                     var6.add(var10);
                  }
               }
            }
         }

         try (
            ZipFile var42 = new ZipFile(var2.toFile());
            ZipOutputStream var43 = new ZipOutputStream(Files.newOutputStream(var3));
         ) {
            var43.setLevel(-1);
            byte[] var45 = new byte[8192];

            for (Enumeration var46 = var42.entries(); var46.hasMoreElements(); var43.closeEntry()) {
               ZipEntry var47 = (ZipEntry)var46.nextElement();
               String var12 = this.m_8308(var47);
               ZipEntry var13 = new ZipEntry(var12);
               if (var47.getTime() >= 0L) {
                  var13.setTime(var47.getTime());
               }

               var43.putNextEntry(var13);
               if (!var12.endsWith(f_29297)) {
                  byte[] var14;
                  try (
                     InputStream var15 = var42.getInputStream(var47);
                     ByteArrayOutputStream var16 = new ByteArrayOutputStream();
                  ) {
                     int var17;
                     while ((var17 = var15.read(var45)) >= 0) {
                        var16.write(var45, 0, var17);
                     }

                     var14 = var16.toByteArray();
                  }

                  if (var12.equals(f_29298)) {
                     var14 = Class_QZkGXEqbJiAdc26u.m_4451(var14);
                  } else if (Class_QZkGXEqbJiAdc26u.m_4454(var12)) {
                     var14 = Class_QZkGXEqbJiAdc26u.m_4456(var14);
                  } else if (this.m_8288(var12).startsWith(f_29299) && var12.contains(f_29300) && var12.endsWith(f_29301)) {
                     var14 = this.m_8299(var12, var14, var4);
                  }

                  var43.write(var14);
               }
            }

            if (!var5.contains(f_29302)) {
               var43.putNextEntry(new ZipEntry(f_29303));
               var43.write(Class_QZkGXEqbJiAdc26u.m_4450());
               var43.closeEntry();
            }

            for (String var49 : (Iterable<String>) (Iterable) var6) {
               String var50 = var49.replace(f_29304, f_29305);
               String var51 = this.m_8304(var49);
               if (var51 != null) {
                  byte[] var52 = (var51 + "").getBytes(StandardCharsets.UTF_8);
                  var43.putNextEntry(new ZipEntry(var50));
                  var43.write(var52);
                  var43.closeEntry();
               }
            }

            if (!var5.contains(f_29306)) {
               var43.putNextEntry(new ZipEntry(f_29307));
               var43.write(f_29308.getBytes(StandardCharsets.UTF_8));
               var43.closeEntry();
            }
         }

         return Files.readAllBytes(var3);
      } finally {
         Files.deleteIfExists(var2);
         Files.deleteIfExists(var3);
      }
   }

   public void m_8296() {
      this.f_29261 = null;
      this.f_29260.clear();
   }

   private Path m_8297(Path var1) throws Exception {
      byte[] var2 = Files.readAllBytes(var1);
      Path var3 = f_29249.toPath().resolve(f_29282);
      Files.createDirectories(var3);
      Path var4 = var3.resolve(Class_QZkGXEqbJiAdc26u.m_4453(this.m_8292(var2)));
      if (Files.isRegularFile(var4) && this.m_8311(var4)) {
         return var4;
      }

      this.m_8302(f_29283);
      this.m_8305(var4, this.m_8295(this.m_8285(var2)));

      try {
         Class_l0gjJA23I6dlnzax.m_7483(var4);
      } catch (Exception var6) {
         f_29250.warn(f_29284, var6);
      }

      return var4;
   }

   public static boolean m_8298(String var0) {
      if (var0 != null && !var0.isBlank()) {
         try {
            URI var1 = URI.create(var0.strip() + "");
            if (var1.getUserInfo() == null && var1.getQuery() == null && var1.getFragment() == null && var1.getRawPath().isEmpty() && var1.getPort() <= f_29267
               )
             {
               String var2 = var1.getHost();
               if (var2 == null) {
                  return false;
               }

               var2 = var2.toLowerCase(Locale.ROOT);
               if (var2.endsWith(f_29268)) {
                  var2 = var2.substring(0, var2.length() - 1);
               }

               return var2.equals(f_29269)
                  || var2.endsWith(f_29270)
                  || var2.equals(f_29271)
                  || var2.endsWith(f_29272)
                  || var2.equals(f_29273)
                  || var2.endsWith(f_29274)
                  || var2.equals(f_29275)
                  || var2.endsWith(f_29276);
            } else {
               return false;
            }
         } catch (IllegalArgumentException var3) {
            return false;
         }
      } else {
         return false;
      }
   }

   private byte[] m_8299(String var1, byte[] var2, Set<String> var3) {
      String[] var4 = this.m_8288(var1).split(f_29320);
      if (var4.length < 3) {
         return var2;
      }

      String var5 = var4[1];
      if (f_29321.equals(var5)) {
         return var2;
      }

      String var6 = new String(var2, StandardCharsets.UTF_8);
      Matcher var7 = f_29253.matcher(var6);
      StringBuilder var8 = new StringBuilder();
      int var9 = 0;
      boolean var10 = false;

      while (var7.find()) {
         var8.append(var6, var9, var7.start());
         String var11 = var7.group(1);
         String var12 = this.m_8310(var11, var5, var3);
         if (!var12.equals(var11)) {
            var10 = true;
         }

         var8.append(f_29322).append(var12).append('}');
         var9 = var7.end();
      }

      if (!var10) {
         return var2;
      }

      var8.append(var6.substring(var9));
      return var8.toString().getBytes(StandardCharsets.UTF_8);
   }

   public Connection m_8301() {
      return this.f_29261;
   }

   private void m_8302(String var1) {
      if (this.f_29257.m_8768()) {
         f_11537.execute(() -> {
            if (f_11537.player != null && f_11537.getCurrentServer() != null && m_8298(f_11537.getCurrentServer().ip)) {
               Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
            }
         });
      }
   }

   private String m_8303(String var1, String var2, Set<String> var3) {
      if (var1.isEmpty() || var1.charAt(0) == '#' || var1.indexOf(58) >= 0) {
         return var1;
      } else if (var3.contains(var2 + var1)) {
         return var1;
      } else {
         return var3.contains(var1 + "") ? var1 + "" : var1;
      }
   }

   private String m_8304(String var1) {
      var1 = this.m_8288(var1);
      if (var1.startsWith(f_29309) && var1.endsWith(f_29310)) {
         String var2 = var1.substring(f_29311.length(), var1.length() - 5);
         int var3 = var2.indexOf(47);
         if (var3 < 0) {
            return null;
         }

         String var4 = var2.substring(0, var3);
         String var5 = var2.substring(var3 + 1);
         return !var5.startsWith(f_29312) ? null : var4 + var5.substring(f_29313.length());
      } else {
         return null;
      }
   }

   private void m_8305(Path var1, byte[] var2) throws Exception {
      Path var3 = Files.createTempFile(var1.getParent(), f_29286, f_29287);

      try {
         Files.write(var3, var2);

         try {
            Files.move(var3, var1, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
         } catch (AtomicMoveNotSupportedException var8) {
            Files.move(var3, var1, StandardCopyOption.REPLACE_EXISTING);
         }
      } finally {
         Files.deleteIfExists(var3);
      }
   }

   private void m_8307() {
      try {
         if (!f_29249.exists()) {
            f_29249.mkdirs();
         }

         new ProcessBuilder(f_29327, f_29249.getAbsolutePath()).start();
      } catch (Exception var3) {
         String var2 = var3.getMessage() != null ? var3.getMessage() : var3.getClass().getSimpleName();
         Class_ftHu9o3WzCU3Adxm.m_6731(var2 + "");
         Class_ftHu9o3WzCU3Adxm.m_6731(f_29249.getAbsolutePath() + "");
      }
   }

   private String m_8308(ZipEntry var1) {
      String var2 = var1.getName().replace('\\', '/');
      if (var1.getSize() > 0L) {
         while (var2.endsWith(f_29324)) {
            var2 = var2.substring(0, var2.length() - 1);
         }
      }

      return var2;
   }

   public boolean m_8309(Connection var1, UUID var2) {
      if (this.f_29261 != var1) {
         return false;
      }

      RWFixer.hHJJ9YWMFAhInbEm var3 = this.f_29260.get(var2);
      return var3 != null && var3.spoofed();
   }

   private String m_8310(String var1, String var2, Set<String> var3) {
      Matcher var4 = f_29254.matcher(var1);
      StringBuilder var5 = new StringBuilder();

      int var6;
      for (var6 = 0; var4.find(); var6 = var4.end()) {
         var5.append(var1, var6, var4.start());
         String var7 = var4.group(1);
         String var8 = var4.group(2);
         String var9 = this.m_8303(var8, var2, var3);
         var5.append('"').append(var7).append(f_29323).append(var9).append('"');
      }

      var5.append(var1.substring(var6));
      return var5.toString();
   }

   private boolean m_8311(Path var1) {
      try (ZipFile var2 = new ZipFile(var1.toFile())) {
         ZipEntry var3 = var2.getEntry(f_29285);
         if (var3 == null) {
            return false;
         }

         try (InputStream var4 = var2.getInputStream(var3)) {
            return Class_QZkGXEqbJiAdc26u.m_4445(var4.readAllBytes());
         }
      } catch (Exception var11) {
         return false;
      }
   }

   public void m_8312(Connection var1, String var2, UUID var3, String var4) {
      if (m_8298(var2)) {
         if (this.f_29261 != var1) {
            this.m_8296();
            this.f_29261 = var1;
         }

         boolean var5 = this.f_29256.m_8768();
         this.f_29260.put(var3, new RWFixer.hHJJ9YWMFAhInbEm(var4, var5));
         if (var5) {
            var1.send(new ServerboundResourcePackPacket(var3, Action.ACCEPTED));
            var1.send(new ServerboundResourcePackPacket(var3, Action.SUCCESSFULLY_LOADED));
         }
      }
   }

   private record hHJJ9YWMFAhInbEm(String url, boolean spoofed) {
   }
}
