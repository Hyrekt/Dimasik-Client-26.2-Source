package dev.dimasik.client.system;

import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class Class_XHmGFP4pbXhGQRa5 {
   private static final Object f_15946 = Class_XHmGFP4pbXhGQRa5.class;
   private static final long f_15947 = 250L;
   private final Map<String, Integer> f_15948 = new LinkedHashMap<>();
   private Runnable f_15949 = () -> {};
   private boolean f_15950 = true;
   private float f_15951;
   private long f_15952;
   private long f_15953;
   private static final float f_15954 = 0.8F;
   private static final float f_15955 = 0.1F;
   private static final float f_15956 = 1.5F;
   private static final float f_15957 = 0.1F;
   private static final float f_15958 = 1.5F;
   private static final String f_15959 = "SoundPad: пользовательских .wav файлов нет";
   private static final String f_15960 = "explorer.exe";
   private static final long f_15961 = 250L;
   private static final String f_15962 = "Simple Voice Chat не найден";
   private static final long f_15963 = 1125899906842597L;
   private static final long f_15964 = 31L;
   private static final long f_15965 = 31L;
   private static final long f_15966 = 31L;
   private static final String f_15967 = ".wav";

   private long m_5531() {
      File[] var1 = Class_uJpBVX4twNtQ4dBB.f_32804.listFiles((var0, var1x) -> var1x.toLowerCase().endsWith(f_15967));
      if (var1 == null) {
         return 0L;
      }

      Arrays.sort(var1, (var0, var1x) -> var0.getName().compareToIgnoreCase(var1x.getName()));
      long var2 = f_15963;

      for (File var7 : var1) {
         var2 = f_15964 * var2 + var7.getName().toLowerCase().hashCode();
         var2 = f_15965 * var2 + var7.length();
         var2 = f_15966 * var2 + var7.lastModified();
      }

      return var2;
   }

   public synchronized void m_5532(Runnable var1) {
      this.f_15949 = var1 != null ? var1 : () -> {};
   }

   public synchronized void m_5533(Map<String, Integer> var1, boolean var2, float var3) {
      this.f_15948.clear();
      if (var1 != null) {
         this.f_15948.putAll(var1);
      }

      this.f_15950 = var2;
      this.f_15951 = Math.clamp(var3, f_15955, f_15956);
   }

   public synchronized boolean m_5534() {
      long var1 = this.m_5531();
      if (var1 == this.f_15953) {
         return false;
      }

      Class_uJpBVX4twNtQ4dBB.m_9144(false);
      this.f_15953 = var1;
      return true;
   }

   public synchronized void m_5535(String var1, int var2) {
      if (var1 != null && !var1.isBlank()) {
         if (var2 >= 0) {
            this.f_15948.replaceAll((var2x, var3) -> !var2x.equals(var1) && var3 == var2 ? -1 : var3);
         }

         this.f_15948.put(var1, var2);
         this.f_15949.run();
      }
   }

   public synchronized List<Class_uJpBVX4twNtQ4dBB.IVQgO2YsArlvWl7V> m_5536() {
      return Class_uJpBVX4twNtQ4dBB.m_9154();
   }

   public synchronized void m_5537(boolean var1) {
      this.f_15950 = var1;
      this.f_15949.run();
   }

   public synchronized void m_5539(float var1) {
      this.f_15951 = Math.clamp(var1, f_15957, f_15958);
      this.f_15949.run();
   }

   public boolean m_5540(int var1) {
      String var2 = null;
      synchronized (this) {
         for (Class_uJpBVX4twNtQ4dBB.IVQgO2YsArlvWl7V var5 : Class_uJpBVX4twNtQ4dBB.m_9154()) {
            if (this.f_15948.getOrDefault(var5.slot(), -1) == var1) {
               var2 = var5.slot();
               break;
            }
         }
      }

      if (var2 == null) {
         return false;
      }

      this.m_5543(var2);
      return true;
   }

   public Class_XHmGFP4pbXhGQRa5() {
      this.f_15951 = f_15954;
      Class_uJpBVX4twNtQ4dBB.m_9149();
      Class_uJpBVX4twNtQ4dBB.m_9144(false);
      this.f_15953 = this.m_5531();
   }

   public synchronized void m_5541(boolean var1) {
      Class_uJpBVX4twNtQ4dBB.RTskwvciZuAtXp7a var2 = Class_uJpBVX4twNtQ4dBB.m_9144(false);
      this.f_15953 = this.m_5531();
      if (var1) {
         int var3 = Class_uJpBVX4twNtQ4dBB.m_9154().size();
         if (var3 == 0) {
            Class_ftHu9o3WzCU3Adxm.m_6731(f_15959);
            Class_ftHu9o3WzCU3Adxm.m_6731(Class_uJpBVX4twNtQ4dBB.f_32804.getAbsolutePath());
         } else {
            Class_ftHu9o3WzCU3Adxm.m_6731(var3 + "");
         }

         for (String var5 : var2.f_32803) {
            Class_ftHu9o3WzCU3Adxm.m_6731(var5 + "");
         }
      }
   }

   public void m_5542() {
      Class_hSBVBKos4AGYjXlc.m_7161(f_15946);
   }

   public void m_5543(String var1) {
      long var2 = System.currentTimeMillis();
      synchronized (this) {
         if (var2 - this.f_15952 < f_15961) {
            return;
         }

         this.f_15952 = var2;
      }

      if (!Class_12xPckxKUUa66C9x.m_830()) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_15962);
      } else {
         short[] var4 = Class_uJpBVX4twNtQ4dBB.m_9143(var1);
         if (var4 == null) {
            this.m_5541(false);
            var4 = Class_uJpBVX4twNtQ4dBB.m_9143(var1);
         }

         if (var4 == null) {
            Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
         } else {
            boolean var5;
            float var6;
            synchronized (this) {
               var5 = this.f_15950;
               var6 = this.f_15951;
            }

            Class_hSBVBKos4AGYjXlc.m_7167(var4, var5, var6, f_15946);
         }
      }
   }

   public void m_5544() {
      try {
         Class_uJpBVX4twNtQ4dBB.m_9149();
         new ProcessBuilder(f_15960, Class_uJpBVX4twNtQ4dBB.f_32804.getAbsolutePath()).start();
      } catch (Exception var3) {
         String var2 = var3.getMessage() != null ? var3.getMessage() : var3.getClass().getSimpleName();
         Class_ftHu9o3WzCU3Adxm.m_6731(var2 + "");
         Class_ftHu9o3WzCU3Adxm.m_6731(Class_uJpBVX4twNtQ4dBB.f_32804.getAbsolutePath());
      }
   }

   public synchronized Map<String, Integer> m_5547() {
      return new LinkedHashMap<>(this.f_15948);
   }

   public synchronized int m_5548(String var1) {
      return this.f_15948.getOrDefault(var1, -1);
   }

   public synchronized float m_5550() {
      return this.f_15951;
   }

   public synchronized boolean m_5551() {
      return this.f_15950;
   }
}
