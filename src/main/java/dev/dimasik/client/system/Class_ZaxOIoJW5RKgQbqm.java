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

public final class Class_ZaxOIoJW5RKgQbqm implements Class_NzJrN63M7QBpmAbi {
   public static final File f_16954 = new File(System.getenv(Class_ZaxOIoJW5RKgQbqm.f_16974) + "", Class_ZaxOIoJW5RKgQbqm.f_16975);
   private static final String f_16955 = "Кастомные формы частиц Dimasik\n==============================\n\nФормат файла: PNG или JPG/JPEG\n(можно даже JPG, переименованный в .png — тоже подхватит)\n\nИмя в меню: имя файла без расширения\n  abemish.png  ->  \"abemish\"\n  weslo.jpg    ->  \"weslo\"\n\nРазмер картинки:\n  - лучше квадрат (256x256, 512x512 или 1000x1000)\n  - можно меньше/больше — размер партикла задаётся слайдером в модуле\n  - слишком маленькие (<64) будут мыльными, слишком большие (>2048) зря жрут память\n\nКак рисовать:\n  - прозрачный фон (для PNG)\n  - сама форма — белая или светлая (цвет партикла красится сверху)\n  - чёрный/тёмный почти не видно (аддитивный бленд)\n\nПосле добавления файлов нажми «Загрузить свои» ещё раз, чтобы обновить список.\n";
   private static final Set<String> f_16956 = Set.of(
      Class_ZaxOIoJW5RKgQbqm.f_16976,
      Class_ZaxOIoJW5RKgQbqm.f_16977,
      Class_ZaxOIoJW5RKgQbqm.f_16978,
      Class_ZaxOIoJW5RKgQbqm.f_16979,
      Class_ZaxOIoJW5RKgQbqm.f_16980,
      Class_ZaxOIoJW5RKgQbqm.f_16981,
      Class_ZaxOIoJW5RKgQbqm.f_16982,
      Class_ZaxOIoJW5RKgQbqm.f_16983,
      Class_ZaxOIoJW5RKgQbqm.f_16984,
      Class_ZaxOIoJW5RKgQbqm.f_16985,
      Class_ZaxOIoJW5RKgQbqm.f_16986,
      Class_ZaxOIoJW5RKgQbqm.f_16987,
      Class_ZaxOIoJW5RKgQbqm.f_16988
   );
   private static final Map<String, Identifier> f_16957 = new LinkedHashMap<>();
   private static final List<Identifier> f_16958 = new ArrayList<>();
   private static final AtomicInteger f_16959 = new AtomicInteger();
   private static final String f_16960 = "README.txt";
   private static final String f_16961 = "Кастомные формы частиц Dimasik\n==============================\n\nФормат файла: PNG или JPG/JPEG\n(можно даже JPG, переименованный в .png — тоже подхватит)\n\nИмя в меню: имя файла без расширения\n  abemish.png  ->  \"abemish\"\n  weslo.jpg    ->  \"weslo\"\n\nРазмер картинки:\n  - лучше квадрат (256x256, 512x512 или 1000x1000)\n  - можно меньше/больше — размер партикла задаётся слайдером в модуле\n  - слишком маленькие (<64) будут мыльными, слишком большие (>2048) зря жрут память\n\nКак рисовать:\n  - прозрачный фон (для PNG)\n  - сама форма — белая или светлая (цвет партикла красится сверху)\n  - чёрный/тёмный почти не видно (аддитивный бленд)\n\nПосле добавления файлов нажми «Загрузить свои» ещё раз, чтобы обновить список.\n";
   private static final String f_16962 = "TextureManager ещё не готов";
   private static final String f_16963 = "README.txt";
   private static final String f_16964 = "dimasik";
   private static final String f_16965 = ", ";
   private static final String f_16966 = "png";
   private static final String f_16967 = "jpg";
   private static final String f_16968 = "jpeg";
   private static final String f_16969 = "пустой файл";
   private static final String f_16970 = "не удалось прочитать изображение";
   private static final String f_16971 = "png";
   private static final String f_16972 = "не удалось конвертировать в PNG";
   private static final String f_16973 = "dimasik-custom-particle";
   private static final String f_16974 = "SystemDrive";
   private static final String f_16975 = "dimasik/particles";
   private static final String f_16976 = "корона";
   private static final String f_16977 = "взрыв куба";
   private static final String f_16978 = "доллар";
   private static final String f_16979 = "сердце";
   private static final String f_16980 = "молния";
   private static final String f_16981 = "линия";
   private static final String f_16982 = "ромб";
   private static final String f_16983 = "снежинка";
   private static final String f_16984 = "звезда";
   private static final String f_16985 = "звезда 2";
   private static final String f_16986 = "треугольник";
   private static final String f_16987 = "свечение";
   private static final String f_16988 = "рандом";

   public static synchronized Class_ZaxOIoJW5RKgQbqm.cBw2IGFKjkF3YwJh m_5825() {
      m_5835();
      m_5827();
      f_16957.clear();
      Class_ZaxOIoJW5RKgQbqm.cBw2IGFKjkF3YwJh var0 = new Class_ZaxOIoJW5RKgQbqm.cBw2IGFKjkF3YwJh();
      File[] var1 = f_16954.listFiles();
      if (var1 == null) {
         var0.f_16953.add(f_16954.getAbsolutePath() + "");
         return var0;
      }

      if (f_11537 != null && f_11537.getTextureManager() != null) {
         for (File var5 : var1) {
            if (var5.isFile()) {
               String var6 = var5.getName();
               if (!var6.equalsIgnoreCase(f_16963)) {
                  int var7 = var6.lastIndexOf(46);
                  if (var7 > 0) {
                     String var8 = var6.substring(var7 + 1).toLowerCase(Locale.ROOT);
                     if (m_5828(var8)) {
                        String var9 = var6.substring(0, var7).trim();
                        if (!var9.isEmpty()) {
                           if (f_16956.contains(var9.toLowerCase(Locale.ROOT))) {
                              var0.f_16953.add(var6 + "");
                           } else if (!f_16957.containsKey(var9)) {
                              try {
                                 NativeImage var10 = m_5834(var5);
                                 Identifier var13 = Identifier.fromNamespaceAndPath(f_16964, f_16959.incrementAndGet() + "");
                                 f_11537.getTextureManager().register(var13, new DynamicTexture(() -> f_16973, var10));
                                 f_16958.add(var13);
                                 f_16957.put(var9, var13);
                                 var0.f_16952.add(var9);
                              } catch (Exception var12) {
                                 String var11 = var12.getMessage() != null ? var12.getMessage() : var12.getClass().getSimpleName();
                                 var0.f_16953.add(var6 + var11);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         return var0;
      } else {
         var0.f_16953.add(f_16962);
         return var0;
      }
   }

   private static void m_5826(Class_ZaxOIoJW5RKgQbqm.cBw2IGFKjkF3YwJh var0) {
      if (f_11537.player != null) {
         if (var0.f_16952.isEmpty() && var0.f_16953.isEmpty()) {
            Class_ftHu9o3WzCU3Adxm.m_6731(f_16954.getAbsolutePath() + "");
         } else {
            if (!var0.f_16952.isEmpty()) {
               Class_ftHu9o3WzCU3Adxm.m_6731(String.join(f_16965, var0.f_16952) + "");
            }

            for (String var2 : var0.f_16953) {
               Class_ftHu9o3WzCU3Adxm.m_6731(var2 + "");
            }
         }
      }
   }

   private static void m_5827() {
      if (f_11537 != null && f_11537.getTextureManager() != null) {
         for (Identifier var1 : f_16958) {
            f_11537.getTextureManager().release(var1);
         }

         f_16958.clear();
      } else {
         f_16958.clear();
      }
   }

   private static boolean m_5828(String var0) {
      return var0.equals(f_16966) || var0.equals(f_16967) || var0.equals(f_16968);
   }

   public static synchronized List<Identifier> m_5829() {
      return Collections.unmodifiableList(new ArrayList<>(f_16957.values()));
   }

   public static synchronized void m_5831(boolean var0, Runnable var1) {
      m_5835();
      if (f_11537 == null) {
         if (var1 != null) {
            var1.run();
         }
      } else {
         f_11537.execute(() -> {
            Class_ZaxOIoJW5RKgQbqm.cBw2IGFKjkF3YwJh var2 = m_5825();
            if (var0) {
               m_5826(var2);
            }

            if (var1 != null) {
               var1.run();
            }
         });
      }
   }

   public static synchronized List<String> m_5832() {
      return Collections.unmodifiableList(new ArrayList<>(f_16957.keySet()));
   }

   private static boolean m_5833(byte[] var0) {
      return var0.length >= 8 && (var0[0] & 255) == 137 && var0[1] == 80 && var0[2] == 78 && var0[3] == 71;
   }

   private static NativeImage m_5834(File var0) throws Exception {
      byte[] var1 = Files.readAllBytes(var0.toPath());
      if (var1.length < 4) {
         throw new IllegalArgumentException(f_16969);
      } else if (m_5833(var1)) {
         return NativeImage.read(var1);
      } else {
         BufferedImage var2 = ImageIO.read(var0);
         if (var2 == null) {
            throw new IllegalArgumentException(f_16970);
         } else {
            BufferedImage var3 = new BufferedImage(var2.getWidth(), var2.getHeight(), 2);
            Graphics var4 = var3.getGraphics();
            var4.drawImage(var2, 0, 0, null);
            var4.dispose();
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            if (!ImageIO.write(var3, f_16971, var5)) {
               throw new IllegalArgumentException(f_16972);
            } else {
               return NativeImage.read(var5.toByteArray());
            }
         }
      }
   }

   public static void m_5835() {
      if (!f_16954.exists()) {
         f_16954.mkdirs();
      }

      File var0 = new File(f_16954, f_16960);

      try {
         Files.writeString(var0.toPath(), f_16961, StandardCharsets.UTF_8);
      } catch (Exception var2) {
      }
   }

   private Class_ZaxOIoJW5RKgQbqm() {
   }

   public static synchronized Identifier m_5836(String var0) {
      return f_16957.get(var0);
   }

   public static synchronized boolean m_5838(String var0) {
      return f_16957.containsKey(var0);
   }

   public static final class cBw2IGFKjkF3YwJh {
      public final List<String> f_16952 = new ArrayList<>();
      public final List<String> f_16953 = new ArrayList<>();
   }
}
