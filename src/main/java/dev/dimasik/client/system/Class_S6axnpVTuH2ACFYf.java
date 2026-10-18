package dev.dimasik.client.system;

import com.mojang.blaze3d.platform.NativeImage;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.imageio.ImageIO;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.resources.Identifier;

public final class Class_S6axnpVTuH2ACFYf implements Class_NzJrN63M7QBpmAbi {
   public static final File f_13216 = new File(System.getenv(Class_S6axnpVTuH2ACFYf.f_13237) + "", Class_S6axnpVTuH2ACFYf.f_13238);
   private static final String f_13217 = "Пользовательские картинки для модуля Picture\n=============================================\n\nПоложите сюда PNG, JPG, JPEG или WebP.\nИмя файла без расширения появится в списке «Картинка».\n\nПосле добавления файлов нажмите «Загрузить свои» в настройках Picture ещё раз.\nЛучше использовать изображения не больше 4096x4096 пикселей.\n";
   private static final Set<String> f_13218 = Set.of(Class_S6axnpVTuH2ACFYf.f_13239, Class_S6axnpVTuH2ACFYf.f_13240);
   private static final Map<String, Class_S6axnpVTuH2ACFYf.Zq8mBegeS5jtnHjK> f_13219 = new LinkedHashMap<>();
   private static final List<Identifier> f_13220 = new ArrayList<>();
   private static final AtomicInteger f_13221 = new AtomicInteger();
   private static final String f_13222 = "README.txt";
   private static final String f_13223 = "Пользовательские картинки для модуля Picture\n=============================================\n\nПоложите сюда PNG, JPG, JPEG или WebP.\nИмя файла без расширения появится в списке «Картинка».\n\nПосле добавления файлов нажмите «Загрузить свои» в настройках Picture ещё раз.\nЛучше использовать изображения не больше 4096x4096 пикселей.\n";
   private static final String f_13224 = "TextureManager ещё не готов";
   private static final String f_13225 = "README.txt";
   private static final String f_13226 = "dimasik";
   private static final String f_13227 = "png";
   private static final String f_13228 = "jpg";
   private static final String f_13229 = "jpeg";
   private static final String f_13230 = "webp";
   private static final String f_13231 = "не удалось прочитать изображение";
   private static final String f_13232 = "размер больше 4096x4096";
   private static final String f_13233 = "png";
   private static final String f_13234 = "не удалось конвертировать в PNG";
   private static final String f_13235 = ", ";
   private static final String f_13236 = "dimasik-custom-picture";
   private static final String f_13237 = "SystemDrive";
   private static final String f_13238 = "dimasik/pictures";
   private static final String f_13239 = "сюся";
   private static final String f_13240 = "могучий орёл";

   public static synchronized List<String> m_4680() {
      return Collections.unmodifiableList(new ArrayList<>(f_13219.keySet()));
   }

   public static synchronized void m_4681(boolean var0, Runnable var1) {
      m_4688();
      if (f_11537 == null) {
         if (var1 != null) {
            var1.run();
         }
      } else {
         f_11537.execute(() -> {
            Class_S6axnpVTuH2ACFYf.VPSUZXmESPzvxhrr var2 = m_4686();
            if (var0) {
               m_4687(var2);
            }

            if (var1 != null) {
               var1.run();
            }
         });
      }
   }

   private Class_S6axnpVTuH2ACFYf() {
   }

   private static void m_4683() {
      if (f_11537 != null && f_11537.getTextureManager() != null) {
         for (Identifier var1 : f_13220) {
            f_11537.getTextureManager().release(var1);
         }

         f_13220.clear();
      } else {
         f_13220.clear();
      }
   }

   private static boolean m_4684(String var0) {
      String var1 = var0.toLowerCase(Locale.ROOT);
      return var1.equals(f_13227) || var1.equals(f_13228) || var1.equals(f_13229) || var1.equals(f_13230);
   }

   private static synchronized Class_S6axnpVTuH2ACFYf.VPSUZXmESPzvxhrr m_4686() {
      m_4688();
      m_4683();
      f_13219.clear();
      Class_S6axnpVTuH2ACFYf.VPSUZXmESPzvxhrr var0 = new Class_S6axnpVTuH2ACFYf.VPSUZXmESPzvxhrr();
      File[] var1 = f_13216.listFiles();
      if (var1 == null) {
         var0.f_13215.add(f_13216.getAbsolutePath() + "");
         return var0;
      }

      if (f_11537 != null && f_11537.getTextureManager() != null) {
         for (File var5 : var1) {
            if (var5.isFile() && !var5.getName().equalsIgnoreCase(f_13225)) {
               String var6 = var5.getName();
               int var7 = var6.lastIndexOf(46);
               if (var7 > 0 && m_4684(var6.substring(var7 + 1))) {
                  String var8 = var6.substring(0, var7).trim();
                  if (!var8.isEmpty()) {
                     if (f_13218.contains(var8.toLowerCase(Locale.ROOT))) {
                        var0.f_13215.add(var6 + "");
                     } else if (!f_13219.containsKey(var8)) {
                        try {
                           NativeImage var9 = m_4690(var5);
                           float var13 = (float)var9.getWidth() / var9.getHeight();
                           Identifier var11 = Identifier.fromNamespaceAndPath(f_13226, f_13221.incrementAndGet() + "");
                           f_11537.getTextureManager().register(var11, new DynamicTexture(() -> f_13236, var9));
                           f_13220.add(var11);
                           f_13219.put(var8, new Class_S6axnpVTuH2ACFYf.Zq8mBegeS5jtnHjK(var11, var13));
                           var0.f_13214.add(var8);
                        } catch (Exception var12) {
                           String var10 = var12.getMessage() != null ? var12.getMessage() : var12.getClass().getSimpleName();
                           var0.f_13215.add(var6 + var10);
                        }
                     }
                  }
               }
            }
         }

         return var0;
      } else {
         var0.f_13215.add(f_13224);
         return var0;
      }
   }

   private static void m_4687(Class_S6axnpVTuH2ACFYf.VPSUZXmESPzvxhrr var0) {
      if (f_11537.player != null) {
         if (var0.f_13214.isEmpty() && var0.f_13215.isEmpty()) {
            Class_ftHu9o3WzCU3Adxm.m_6731(f_13216.getAbsolutePath() + "");
         } else {
            if (!var0.f_13214.isEmpty()) {
               Class_ftHu9o3WzCU3Adxm.m_6731(String.join(f_13235, var0.f_13214) + "");
            }

            for (String var2 : var0.f_13215) {
               Class_ftHu9o3WzCU3Adxm.m_6731(var2 + "");
            }
         }
      }
   }

   public static void m_4688() {
      if (!f_13216.exists()) {
         f_13216.mkdirs();
      }

      File var0 = new File(f_13216, f_13222);

      try {
         Files.writeString(var0.toPath(), f_13223, StandardCharsets.UTF_8);
      } catch (Exception var2) {
      }
   }

   public static synchronized Class_S6axnpVTuH2ACFYf.Zq8mBegeS5jtnHjK m_4689(String var0) {
      return f_13219.get(var0);
   }

   private static NativeImage m_4690(File var0) throws Exception {
      BufferedImage var1 = ImageIO.read(var0);
      if (var1 == null) {
         throw new IllegalArgumentException(f_13231);
      }

      if (var1.getWidth() <= 4096 && var1.getHeight() <= 4096) {
         BufferedImage var2 = new BufferedImage(var1.getWidth(), var1.getHeight(), 2);
         Graphics var3 = var2.getGraphics();
         var3.drawImage(var1, 0, 0, null);
         var3.dispose();
         ByteArrayOutputStream var4 = new ByteArrayOutputStream();
         if (!ImageIO.write(var2, f_13233, var4)) {
            throw new IllegalArgumentException(f_13234);
         } else {
            return NativeImage.read(var4.toByteArray());
         }
      } else {
         throw new IllegalArgumentException(f_13232);
      }
   }

   private static final class VPSUZXmESPzvxhrr {
      public final List<String> f_13214 = new ArrayList<>();
      public final List<String> f_13215 = new ArrayList<>();

      public VPSUZXmESPzvxhrr() {
      }
   }

   public record Zq8mBegeS5jtnHjK(Identifier texture, float aspectRatio) {
   }
}
