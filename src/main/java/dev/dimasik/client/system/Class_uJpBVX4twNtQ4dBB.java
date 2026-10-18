package dev.dimasik.client.system;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.AudioFormat.Encoding;

public final class Class_uJpBVX4twNtQ4dBB {
   public static final File f_32804 = new File(System.getenv(Class_uJpBVX4twNtQ4dBB.f_32828) + "", Class_uJpBVX4twNtQ4dBB.f_32829);
   public static final String f_32805 = "kidai_shar";
   public static final String f_32806 = "totem";
   public static final String f_32807 = "slabost";
   public static final String f_32808 = "pokupai";
   private static final int f_32809 = 48000;
   private static final int f_32810 = 16;
   private static final Map<String, String> f_32811 = Map.of(
      Class_uJpBVX4twNtQ4dBB.f_32830,
      Class_uJpBVX4twNtQ4dBB.f_32831,
      Class_uJpBVX4twNtQ4dBB.f_32832,
      Class_uJpBVX4twNtQ4dBB.f_32833,
      Class_uJpBVX4twNtQ4dBB.f_32834,
      Class_uJpBVX4twNtQ4dBB.f_32835,
      Class_uJpBVX4twNtQ4dBB.f_32836,
      Class_uJpBVX4twNtQ4dBB.f_32837
   );
   private static final String f_32812 = "Кастомные звуки SoundPad\n===============================\n\nФормат: WAV (PCM), лучше моно 48kHz 16-bit.\n\nЛюбой .wav в этой папке = новый звук в SoundPad.\nНазвание звука = имя файла без расширения.\n  hello.wav  ->  звук «hello»\n\nВстроенные (если файла нет — берутся из клиента):\n  kidai_shar.wav  ->  «кидай шар отпущу, чмошник ебанный»\n  totem.wav       ->  «Тотем ебливому пидорасу»\n  slabost.wav     ->  «признай свою слабость пидорас»\n  pokupai.wav     ->  «Покупай Димасик клиент сын шлюхи»\n\nПосле добавления файлов вернись во вкладку SoundPad.\nСписок обновится автоматически; также можно нажать «Обновить».\n";
   private static final Map<String, Class_uJpBVX4twNtQ4dBB.IVQgO2YsArlvWl7V> f_32813 = new LinkedHashMap<>();
   private static final String f_32814 = "README.txt";
   private static final String f_32815 = "Кастомные звуки SoundPad\n===============================\n\nФормат: WAV (PCM), лучше моно 48kHz 16-bit.\n\nЛюбой .wav в этой папке = новый звук в SoundPad.\nНазвание звука = имя файла без расширения.\n  hello.wav  ->  звук «hello»\n\nВстроенные (если файла нет — берутся из клиента):\n  kidai_shar.wav  ->  «кидай шар отпущу, чмошник ебанный»\n  totem.wav       ->  «Тотем ебливому пидорасу»\n  slabost.wav     ->  «признай свою слабость пидорас»\n  pokupai.wav     ->  «Покупай Димасик клиент сын шлюхи»\n\nПосле добавления файлов вернись во вкладку SoundPad.\nСписок обновится автоматически; также можно нажать «Обновить».\n";
   private static final String f_32816 = "README.txt";
   private static final String f_32817 = "wav";
   private static final int f_32818 = 544501094;
   private static final int f_32819 = 65535;
   private static final int f_32820 = 65535;
   private static final int f_32821 = 65535;
   private static final int f_32822 = 1635017060;
   private static final float f_32823 = 48000.0F;
   private static final float f_32824 = 48000.0F;
   private static final float f_32825 = 0.5F;
   private static final String f_32826 = "Звуки VoiceChat: файлов нет. Кинь .wav в папку и нажми ещё раз.";
   private static final String f_32827 = ", ";
   private static final String f_32828 = "SystemDrive";
   private static final String f_32829 = "dimasik/voicechat";
   private static final String f_32830 = "kidai_shar";
   private static final String f_32831 = "кидай шар отпущу, чмошник ебанный";
   private static final String f_32832 = "totem";
   private static final String f_32833 = "Тотем ебливому пидорасу";
   private static final String f_32834 = "slabost";
   private static final String f_32835 = "признай свою слабость пидорас";
   private static final String f_32836 = "pokupai";
   private static final String f_32837 = "Покупай Димасик клиент сын шлюхи";

   private Class_uJpBVX4twNtQ4dBB() {
   }

   public static synchronized List<Class_uJpBVX4twNtQ4dBB.IVQgO2YsArlvWl7V> m_9141() {
      return Collections.unmodifiableList(new ArrayList<>(f_32813.values()));
   }

   public static synchronized List<Class_uJpBVX4twNtQ4dBB.IVQgO2YsArlvWl7V> m_9142() {
      return f_32813.values().stream().filter(var0 -> f_32811.containsKey(var0.slot())).toList();
   }

   public static synchronized short[] m_9143(String var0) {
      Class_uJpBVX4twNtQ4dBB.IVQgO2YsArlvWl7V var1 = f_32813.get(var0.toLowerCase(Locale.ROOT));
      return var1 != null ? var1.pcm() : null;
   }

   public static synchronized Class_uJpBVX4twNtQ4dBB.RTskwvciZuAtXp7a m_9144(boolean var0) {
      m_9149();
      f_32813.clear();
      Class_uJpBVX4twNtQ4dBB.RTskwvciZuAtXp7a var1 = new Class_uJpBVX4twNtQ4dBB.RTskwvciZuAtXp7a();
      File[] var2 = f_32804.listFiles();
      if (var2 == null) {
         var1.f_32803.add(f_32804.getAbsolutePath() + "");
      } else {
         Arrays.sort(var2, (var0x, var1x) -> var0x.getName().compareToIgnoreCase(var1x.getName()));

         for (File var6 : var2) {
            if (var6.isFile()) {
               String var7 = var6.getName();
               if (!var7.equalsIgnoreCase(f_32816)) {
                  int var8 = var7.lastIndexOf(46);
                  if (var8 > 0) {
                     String var9 = var7.substring(var8 + 1).toLowerCase(Locale.ROOT);
                     if (var9.equals(f_32817)) {
                        String var10 = var7.substring(0, var8).trim();
                        if (!var10.isEmpty()) {
                           String var11 = var10.toLowerCase(Locale.ROOT);
                           if (!f_32813.containsKey(var11)) {
                              try {
                                 short[] var12 = m_9157(var6);
                                 if (var12 != null && var12.length != 0) {
                                    String var21 = f_32811.getOrDefault(var11, var10);
                                    f_32813.put(var11, new Class_uJpBVX4twNtQ4dBB.IVQgO2YsArlvWl7V(var11, var21, var12));
                                    var1.f_32801.add(var21);
                                 } else {
                                    var1.f_32803.add(var7 + "");
                                 }
                              } catch (Exception var15) {
                                 String var13 = var15.getMessage() != null ? var15.getMessage() : var15.getClass().getSimpleName();
                                 var1.f_32803.add(var7 + var13);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      for (Entry var17 : f_32811.entrySet()) {
         String var18 = (String)var17.getKey();
         if (!f_32813.containsKey(var18)) {
            try {
               short[] var19 = m_9158(var18);
               if (var19 != null && var19.length > 0) {
                  f_32813.put(var18, new Class_uJpBVX4twNtQ4dBB.IVQgO2YsArlvWl7V(var18, (String)var17.getValue(), var19));
                  var1.f_32801.add((String)var17.getValue() + "");
               }
            } catch (Exception var14) {
               String var20 = var14.getMessage() != null ? var14.getMessage() : var14.getClass().getSimpleName();
               var1.f_32803.add(var18 + var20);
            }
         }
      }

      if (var0) {
         m_9153(var1);
      }

      return var1;
   }

   private static short[] m_9145(AudioInputStream var0) throws IOException {
      AudioFormat var1 = var0.getFormat();
      if (var1.getEncoding() != Encoding.PCM_SIGNED || var1.getSampleSizeInBits() != 16 || var1.isBigEndian()) {
         AudioFormat var2 = new AudioFormat(
            Encoding.PCM_SIGNED, var1.getSampleRate(), 16, var1.getChannels(), var1.getChannels() * 16 / 8, var1.getSampleRate(), false
         );
         var0 = AudioSystem.getAudioInputStream(var2, var0);
         var1 = var0.getFormat();
      }

      short[] var4 = m_9152(var0);
      short[] var3 = m_9147(var4, Math.max(1, var1.getChannels()));
      return m_9146(var3, var1.getSampleRate(), f_32824);
   }

   private static short[] m_9146(short[] var0, float var1, float var2) {
      if (var0.length != 0 && !(Math.abs(var1 - var2) < f_32825)) {
         int var3 = Math.max(1, Math.round(var0.length * (var2 / var1)));
         short[] var4 = new short[var3];
         double var5 = (double)(var0.length - 1) / Math.max(1, var3 - 1);

         for (int var7 = 0; var7 < var3; var7++) {
            double var8 = var7 * var5;
            int var10 = (int)var8;
            int var11 = Math.min(var10 + 1, var0.length - 1);
            double var12 = var8 - var10;
            var4[var7] = (short)Math.round(var0[var10] * (1.0 - var12) + var0[var11] * var12);
         }

         return var4;
      } else {
         return var0;
      }
   }

   private static short[] m_9147(short[] var0, int var1) {
      if (var1 <= 1) {
         return var0;
      }

      int var2 = var0.length / var1;
      short[] var3 = new short[var2];

      for (int var4 = 0; var4 < var2; var4++) {
         short var5 = 0;
         int var6 = var4 * var1;

         for (int var7 = 0; var7 < var1; var7++) {
            var5 += var0[var6 + var7];
         }

         var3[var4] = (short)(var5 / var1);
      }

      return var3;
   }

   public static void m_9149() {
      if (!f_32804.exists()) {
         f_32804.mkdirs();
      }

      File var0 = new File(f_32804, f_32814);

      try {
         Files.writeString(var0.toPath(), f_32815, StandardCharsets.UTF_8);
      } catch (Exception var2) {
      }
   }

   public static synchronized boolean m_9151(String var0) {
      return f_32813.containsKey(var0.toLowerCase(Locale.ROOT));
   }

   private static short[] m_9152(AudioInputStream var0) throws IOException {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      byte[] var2 = new byte[8192];

      int var3;
      while ((var3 = var0.read(var2)) >= 0) {
         if (var3 > 0) {
            var1.write(var2, 0, var3);
         }
      }

      byte[] var4 = var1.toByteArray();
      int var5 = var4.length / 2;
      short[] var6 = new short[var5];

      for (int var7 = 0; var7 < var5; var7++) {
         int var8 = var4[var7 * 2] & 255;
         int var9 = var4[var7 * 2 + 1] << 8;
         var6[var7] = (short)(var8 | var9);
      }

      return var6;
   }

   private static void m_9153(Class_uJpBVX4twNtQ4dBB.RTskwvciZuAtXp7a var0) {
      if (var0.f_32801.isEmpty() && var0.f_32803.isEmpty()) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_32826);
         Class_ftHu9o3WzCU3Adxm.m_6731(f_32804.getAbsolutePath());
      } else {
         if (!var0.f_32801.isEmpty()) {
            Class_ftHu9o3WzCU3Adxm.m_6731(var0.f_32801.size() + String.join(f_32827, var0.f_32801));
         }

         for (String var2 : var0.f_32803) {
            Class_ftHu9o3WzCU3Adxm.m_6731(var2 + "");
         }
      }
   }

   public static synchronized List<Class_uJpBVX4twNtQ4dBB.IVQgO2YsArlvWl7V> m_9154() {
      return f_32813.values().stream().filter(var0 -> !f_32811.containsKey(var0.slot())).toList();
   }

   private static short[] m_9155(byte[] var0) throws UnsupportedAudioFileException, IOException {
      short[] var1 = m_9156(var0);
      if (var1 != null && var1.length > 0) {
         return var1;
      }

      try (AudioInputStream var2 = AudioSystem.getAudioInputStream(new ByteArrayInputStream(var0))) {
         return m_9145(var2);
      }
   }

   private static short[] m_9156(byte[] var0) {
      if (var0.length < 44 || var0[0] != 82 || var0[1] != 73 || var0[2] != 70 || var0[3] != 70) {
         return null;
      }

      if (var0[8] == 87 && var0[9] == 65 && var0[10] == 86 && var0[11] == 69) {
         int var1 = 0;
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = -1;
         int var6 = 0;
         int var7 = 12;

         while (var7 + 8 <= var0.length) {
            int var8 = var0[var7] & 255 | (var0[var7 + 1] & 255) << 8 | (var0[var7 + 2] & 255) << 16 | (var0[var7 + 3] & 255) << 24;
            int var9 = ByteBuffer.wrap(var0, var7 + 4, 4).order(ByteOrder.LITTLE_ENDIAN).getInt();
            int var10 = var7 + 8;
            if (var9 < 0 || var10 + var9 > var0.length) {
               return null;
            }

            if (var8 == f_32818) {
               if (var9 < 16) {
                  return null;
               }

               ByteBuffer var11 = ByteBuffer.wrap(var0, var10, var9).order(ByteOrder.LITTLE_ENDIAN);
               var4 = var11.getShort() & f_32819;
               var1 = var11.getShort() & f_32820;
               var2 = var11.getInt();
               var11.getInt();
               var11.getShort();
               var3 = var11.getShort() & f_32821;
            } else if (var8 == f_32822) {
               var5 = var10;
               var6 = var9;
               break;
            }

            var7 = var10 + var9 + (var9 & 1);
         }

         if (var5 < 0 || var1 <= 0 || var2 <= 0) {
            return null;
         }

         if (var4 == 1 && var3 == 16) {
            int var15 = var1 * (var3 / 8);
            if (var15 <= 0) {
               return null;
            }

            var6 = Math.min(var6, var0.length - var5);
            var6 -= var6 % var15;
            int var16 = var6 / var15;
            if (var16 <= 0) {
               return null;
            }

            short[] var17 = new short[var16 * var1];
            ByteBuffer var18 = ByteBuffer.wrap(var0, var5, var6).order(ByteOrder.LITTLE_ENDIAN);

            for (int var12 = 0; var12 < var17.length; var12++) {
               var17[var12] = var18.getShort();
            }

            short[] var19 = m_9147(var17, var1);
            return m_9146(var19, var2, f_32823);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private static short[] m_9157(File var0) throws UnsupportedAudioFileException, IOException {
      return m_9155(Files.readAllBytes(var0.toPath()));
   }

   private static short[] m_9158(String var0) throws IOException, UnsupportedAudioFileException {
      String var1 = var0 + "";

      try (InputStream var2 = Class_uJpBVX4twNtQ4dBB.class.getResourceAsStream(var1)) {
         return var2 == null ? null : m_9155(var2.readAllBytes());
      }
   }

   public record IVQgO2YsArlvWl7V(String slot, String displayName, short[] pcm) {
   }

   public static final class RTskwvciZuAtXp7a {
      public final List<String> f_32801 = new ArrayList<>();
      public final List<String> f_32802 = new ArrayList<>();
      public final List<String> f_32803 = new ArrayList<>();
   }
}
