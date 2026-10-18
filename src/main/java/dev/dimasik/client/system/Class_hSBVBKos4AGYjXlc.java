package dev.dimasik.client.system;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.AudioFormat.Encoding;

public final class Class_hSBVBKos4AGYjXlc {
   public static final int f_23362 = 960;
   private static final int f_23363 = 48000;
   private static final int f_23364 = 4096;
   private static final long f_23365 = 1500000000L;
   private static final Object f_23366 = new Object();
   private static short[] f_23367;
   private static short[] f_23368;
   private static int f_23369;
   private static boolean f_23370;
   private static long f_23371;
   private static Object f_23372;
   private static final AtomicInteger f_23373 = new AtomicInteger();
   private static final ExecutorService f_23374 = Executors.newSingleThreadExecutor(var0 -> {
      Thread var1 = new Thread(var0, Class_hSBVBKos4AGYjXlc.f_23378);
      var1.setDaemon(true);
      var1.setPriority(5);
      return var1;
   });
   private static final long f_23375 = 1500000000L;
   private static final float f_23376 = 48000.0F;
   private static final float f_23377 = 48000.0F;
   private static final String f_23378 = "dimasik-voicechat-local";

   private static void m_7157() {
      m_7165();
      f_23368 = null;
      f_23372 = null;
      f_23373.incrementAndGet();
   }

   public static boolean m_7159() {
      synchronized (f_23366) {
         return f_23370;
      }
   }

   public static void m_7160(short[] var0, boolean var1, float var2) {
      m_7167(var0, var1, var2, null);
   }

   public static void m_7161(Object var0) {
      synchronized (f_23366) {
         if (Objects.equals(f_23372, var0)) {
            m_7157();
         }
      }
   }

   public static short[] m_7163(int var0) {
      if (var0 <= 0) {
         var0 = 960;
      }

      synchronized (f_23366) {
         if (f_23370 && f_23367 != null) {
            f_23371 = System.nanoTime();
            if (f_23369 >= f_23367.length) {
               m_7165();
               return null;
            }

            short[] var2 = new short[var0];
            int var3 = f_23367.length - f_23369;
            int var4 = Math.min(var0, var3);
            System.arraycopy(f_23367, f_23369, var2, 0, var4);
            f_23369 += var4;
            f_23368 = var2;
            if (f_23369 >= f_23367.length) {
               m_7165();
            }

            return var2;
         } else {
            return null;
         }
      }
   }

   public static void m_7164() {
      synchronized (f_23366) {
         m_7157();
      }
   }

   private static void m_7165() {
      f_23370 = false;
      f_23367 = null;
      f_23369 = 0;
      f_23371 = 0L;
      Class_12xPckxKUUa66C9x.m_834();
   }

   public static short[] m_7166() {
      synchronized (f_23366) {
         short[] var1 = f_23368;
         f_23368 = null;
         return var1;
      }
   }

   public static void m_7167(short[] var0, boolean var1, float var2, Object var3) {
      if (var0 != null && var0.length != 0) {
         synchronized (f_23366) {
            m_7157();
            f_23367 = Arrays.copyOf(var0, var0.length);
            f_23369 = 0;
            f_23370 = true;
            f_23371 = System.nanoTime();
            f_23372 = var3;
            Class_12xPckxKUUa66C9x.m_835();
         }

         if (var1 && var2 > 0.0F) {
            int var7 = f_23373.incrementAndGet();
            short[] var5 = Arrays.copyOf(var0, var0.length);
            f_23374.execute(() -> m_7168(var5, var2, var7));
         }
      }
   }

   private static void m_7168(short[] var0, float var1, int var2) {
      AudioFormat var3 = new AudioFormat(Encoding.PCM_SIGNED, f_23376, 16, 1, 2, f_23377, false);

      try (SourceDataLine var4 = AudioSystem.getSourceDataLine(var3)) {
         var4.open(var3);
         var4.start();
         byte[] var5 = new byte[4096];
         int var6 = 0;

         while (var6 < var0.length && f_23373.get() == var2) {
            int var7 = Math.min(var5.length / 2, var0.length - var6);

            for (int var8 = 0; var8 < var7; var8++) {
               int var9 = Math.clamp(Math.round(var0[var6 + var8] * var1), -32768, 32767);
               var5[var8 * 2] = (byte)var9;
               var5[var8 * 2 + 1] = (byte)(var9 >> 8);
            }

            var4.write(var5, 0, var7 * 2);
            var6 += var7;
         }

         if (f_23373.get() == var2) {
            var4.drain();
         }

         var4.stop();
      } catch (LineUnavailableException | IllegalArgumentException var12) {
      }
   }

   private Class_hSBVBKos4AGYjXlc() {
   }

   public static boolean m_7169() {
      synchronized (f_23366) {
         if (!f_23370) {
            return false;
         }

         Class_12xPckxKUUa66C9x.m_833();
         if (System.nanoTime() - f_23371 <= f_23375) {
            return false;
         }

         m_7165();
         return true;
      }
   }
}
