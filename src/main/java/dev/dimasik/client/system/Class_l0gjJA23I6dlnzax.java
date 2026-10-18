package dev.dimasik.client.system;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.imageio.ImageIO;
import net.minecraft.resources.Identifier;

public final class Class_l0gjJA23I6dlnzax {
   public static final Path f_25145 = m_7477();
   private static final String f_25146 = "assets/minecraft/font/default.json";
   private static final String f_25147 = "providers";
   private static final String f_25148 = "bitmap";
   private static final String f_25149 = "type";
   private static final String f_25150 = "type";
   private static final String f_25151 = "chars";
   private static final String f_25152 = "file";
   private static final int f_25153 = 65535;
   private static final String f_25154 = "png";
   private static final int f_25155 = 65535;
   private static final String f_25156 = "dimasik";
   private static final int f_25157 = 42240;
   private static final float f_25158 = 4.0F;
   private static final float f_25159 = 3.9375F;
   private static final String f_25160 = "[^a-z0-9]+";
   private static final String f_25161 = "_";
   private static final String f_25162 = "^_+|_+$";
   private static final String f_25163 = "src/client/resources/assets/dimasik";
   private static final String f_25164 = "textures/reallyworld/ranks";
   private static final String f_25165 = "src/client/resources/assets/dimasik/textures/reallyworld/ranks";
   private static final int f_25166 = 65535;
   private static final String f_25167 = "minecraft";

   private static Path m_7477() {
      Path var0 = Path.of("").toAbsolutePath().normalize();

      for (int var1 = 0; var1 < 4 && var0 != null; var0 = var0.getParent()) {
         Path var2 = var0.resolve(f_25163);
         if (Files.isDirectory(var2)) {
            return var2.resolve(f_25164);
         }

         var1++;
      }

      return Path.of(f_25165).toAbsolutePath().normalize();
   }

   private static String m_7478(String var0) {
      int var1 = var0.indexOf(58);
      String var2 = var1 >= 0 ? var0.substring(0, var1) : f_25167;
      String var3 = var1 >= 0 ? var0.substring(var1 + 1) : var0;
      return var2 + var3;
   }

   private static boolean m_7479(JsonArray var0) {
      for (JsonElement var2 : var0) {
         for (int var6 : var2.getAsString().codePoints().toArray()) {
            if (var6 <= f_25166 && Class_JInbhwbvIxCoRpXA.m_3254((char)var6)) {
               return true;
            }
         }
      }

      return false;
   }

   public static float m_7480(int var0, float var1) {
      return var1 * ((char)var0 == f_25157 ? f_25158 : f_25159);
   }

   public static Identifier m_7481(int var0) {
      return var0 <= f_25155 && Class_JInbhwbvIxCoRpXA.m_3254((char)var0) ? Identifier.fromNamespaceAndPath(f_25156, m_7485(var0) + "") : null;
   }

   private static int m_7482(BufferedImage var0, int var1, int var2, int var3, int var4) {
      for (int var5 = var3 - 1; var5 >= 0; var5--) {
         for (int var6 = 0; var6 < var4; var6++) {
            if (var0.getRGB(var1 + var5, var2 + var6) >>> 24 != 0) {
               return var5 + 1;
            }
         }
      }

      return 0;
   }

   public static void m_7483(Path var0) throws Exception {
      Files.createDirectories(f_25145);
      HashMap var1 = new HashMap();

      try (ZipFile var2 = new ZipFile(var0.toFile())) {
         ZipEntry var3 = var2.getEntry(f_25146);
         if (var3 == null) {
            return;
         }

         InputStreamReader var5 = new InputStreamReader(var2.getInputStream(var3), StandardCharsets.UTF_8);

         JsonObject var4;
         try {
            var4 = JsonParser.parseReader(var5).getAsJsonObject();
         } catch (Throwable var27) {
            try {
               var5.close();
            } catch (Throwable var26) {
               var27.addSuppressed(var26);
            }

            throw var27;
         }

         var5.close();
         JsonArray var30 = var4.getAsJsonArray(f_25147);
         if (var30 == null) {
            return;
         }

         for (JsonElement var7 : var30) {
            if (var7.isJsonObject()) {
               JsonObject var8 = var7.getAsJsonObject();
               if (f_25148.equals(var8.has(f_25149) ? var8.get(f_25150).getAsString() : "")) {
                  JsonArray var9 = var8.getAsJsonArray(f_25151);
                  if (var9 != null && m_7479(var9)) {
                     String var10 = var8.get(f_25152).getAsString();
                     BufferedImage var11 = (BufferedImage)var1.get(var10);
                     if (var11 == null) {
                        ZipEntry var12 = var2.getEntry(m_7478(var10));
                        if (var12 == null) {
                           continue;
                        }

                        try (InputStream var13 = var2.getInputStream(var12)) {
                           var11 = ImageIO.read(var13);
                        }

                        if (var11 == null) {
                           continue;
                        }

                        var1.put(var10, var11);
                     }

                     int var31 = var9.size();
                     int var32 = 0;

                     for (JsonElement var15 : var9) {
                        String var16 = var15.getAsString();
                        var32 = Math.max(var32, var16.codePointCount(0, var16.length()));
                     }

                     if (var31 > 0 && var32 > 0) {
                        int var33 = var11.getWidth() / var32;
                        int var34 = var11.getHeight() / var31;

                        for (int var35 = 0; var35 < var31; var35++) {
                           int[] var17 = var9.get(var35).getAsString().codePoints().toArray();

                           for (int var18 = 0; var18 < var17.length; var18++) {
                              int var19 = var17[var18];
                              if (var19 <= f_25153 && Class_JInbhwbvIxCoRpXA.m_3254((char)var19)) {
                                 int var20 = m_7482(var11, var18 * var33, var35 * var34, var33, var34);
                                 if (var20 > 0) {
                                    int var21 = m_7484(var11, var18 * var33, var35 * var34, var20, var34);
                                    if (var21 > 0) {
                                       BufferedImage var22 = m_7486(var11.getSubimage(var18 * var33, var35 * var34, var20, var21));
                                       String var23 = m_7485(var19);
                                       ImageIO.write(var22, f_25154, f_25145.resolve(var23 + "").toFile());
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private Class_l0gjJA23I6dlnzax() {
   }

   private static int m_7484(BufferedImage var0, int var1, int var2, int var3, int var4) {
      for (int var5 = var4 - 1; var5 >= 0; var5--) {
         for (int var6 = 0; var6 < var3; var6++) {
            if (var0.getRGB(var1 + var6, var2 + var5) >>> 24 != 0) {
               return var5 + 1;
            }
         }
      }

      return 0;
   }

   private static String m_7485(int var0) {
      return Class_JInbhwbvIxCoRpXA.m_3257(var0).toLowerCase(Locale.ROOT).replaceAll(f_25160, f_25161).replaceAll(f_25162, "");
   }

   private static BufferedImage m_7486(BufferedImage var0) {
      BufferedImage var1 = new BufferedImage(var0.getWidth() * 4, var0.getHeight() * 4, 2);
      Graphics2D var2 = var1.createGraphics();
      var2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
      var2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
      var2.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
      var2.drawImage(var0, 0, 0, var1.getWidth(), var1.getHeight(), null);
      var2.dispose();
      return var1;
   }
}
