package dev.dimasik.client.system;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.blaze3d.platform.NativeImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Class_JG8EQkxMGm8yNbUr implements Class_NzJrN63M7QBpmAbi {
   private static final Logger f_9311 = LoggerFactory.getLogger(Class_JG8EQkxMGm8yNbUr.f_9421);
   private static final Class_JG8EQkxMGm8yNbUr f_9312 = new Class_JG8EQkxMGm8yNbUr();
   private static final String f_9313 = "/assets/dimasik/media/media_session.ps1";
   private static final long f_9314 = 400L;
   private static final int f_9315 = 3;
   private final ExecutorService f_9316 = Executors.newSingleThreadExecutor(var0 -> {
      Thread var1 = new Thread(var0, f_9420);
      var1.setDaemon(true);
      return var1;
   });
   private final Path f_9317;
   private final Path f_9318;
   private final Path f_9319;
   private final AtomicInteger f_9320;
   private volatile Process f_9321;
   private volatile boolean f_9322;
   private volatile int f_9323;
   private volatile int f_9324;
   private volatile Class_JG8EQkxMGm8yNbUr.Class_1rYH3NQ9GPXfnr59 f_9325;
   private volatile String f_9326;
   private volatile String f_9327;
   private volatile Identifier f_9328;
   private volatile String f_9329;
   private volatile int f_9330;
   private volatile long f_9331;
   private volatile long f_9332;
   private static final String f_9333 = "dimasik_media_session.ps1";
   private static final String f_9334 = "dimasik_media_art.png";
   private static final String f_9335 = "dimasik_media_cmd.txt";
   private static final long f_9336 = -1L;
   private static final long f_9337 = -1L;
   private static final String f_9338 = "java.io.tmpdir";
   private static final String f_9339 = ".";
   private static final String f_9340 = "os.name";
   private static final String f_9341 = "win";
   private static final String f_9342 = "Доступно только на Windows";
   private static final long f_9343 = -1L;
   private static final long f_9344 = -1L;
   private static final String f_9345 = "powershell.exe";
   private static final String f_9346 = "-NoProfile";
   private static final String f_9347 = "-NonInteractive";
   private static final String f_9348 = "-WindowStyle";
   private static final String f_9349 = "Hidden";
   private static final String f_9350 = "-ExecutionPolicy";
   private static final String f_9351 = "Bypass";
   private static final String f_9352 = "-File";
   private static final String f_9353 = "-IntervalMs";
   private static final long f_9354 = 400L;
   private static final String f_9355 = "-ArtPath";
   private static final String f_9356 = "-CommandPath";
   private static final String f_9357 = "Dimasik-Media";
   private static final String f_9358 = "Dimasik-Media-Errors";
   private static final String f_9359 = "Медиаплеер: мост не запустился";
   private static final String f_9360 = "/assets/dimasik/media/media_session.ps1";
   private static final String f_9361 = "скрипт моста отсутствует в ресурсах";
   private static final String f_9362 = "Медиаплеер: чтение состояния прервано: {}";
   private static final String f_9363 = "#<";
   private static final String f_9364 = "<Objs";
   private static final String f_9365 = "Медиаплеер (мост): {}";
   private static final String f_9366 = "Мост медиасеанса не отвечает";
   private static final String f_9367 = "Медиаплеер: мост завершился, перезапуск {}/{}";
   private static final long f_9368 = 3000L;
   private static final String f_9369 = "ok";
   private static final String f_9370 = "reason";
   private static final String f_9371 = "reason";
   private static final String f_9372 = "volume";
   private static final long f_9373 = -1L;
   private static final long f_9374 = -1L;
   private static final String f_9375 = "no-session";
   private static final String f_9376 = "thumbId";
   private static final String f_9377 = "thumb";
   private static final String f_9378 = "Playing";
   private static final String f_9379 = "status";
   private static final String f_9380 = "position";
   private static final String f_9381 = "age";
   private static final long f_9382 = 2000L;
   private static final String f_9383 = "title";
   private static final String f_9384 = "artist";
   private static final String f_9385 = "duration";
   private static final String f_9386 = "app";
   private static final String f_9387 = "canSeek";
   private static final String f_9388 = "canNext";
   private static final String f_9389 = "canPrev";
   private static final String f_9390 = "volume";
   private static final String f_9391 = "Медиаплеер: не разобрал строку состояния: {}";
   private static final long f_9392 = 80L;
   private static final long f_9393 = -1L;
   private static final long f_9394 = -1L;
   private static final long f_9395 = 400L;
   private static final long f_9396 = -1L;
   private static final long f_9397 = 350L;
   private static final long f_9398 = -1L;
   private static final long f_9399 = 200L;
   private static final long f_9400 = 2500L;
   private static final long f_9401 = -1L;
   private static final long f_9402 = 20000L;
   private static final long f_9403 = 20000L;
   private static final long f_9404 = 5000L;
   private static final String f_9405 = "dimasik";
   private static final String f_9406 = "pause";
   private static final String f_9407 = "play";
   private static final String f_9408 = "next";
   private static final String f_9409 = "previous";
   private static final String f_9410 = "seek";
   private static final String f_9411 = "volume";
   private static final String f_9412 = ".exe";
   private static final long f_9413 = 1000000L;
   private static final long f_9414 = 60000L;
   private static final long f_9415 = -1L;
   private static final long f_9416 = -1L;
   private static final String f_9417 = "Медиаплеер: команда {} не отправлена: {}";
   private static final String f_9418 = "dimasik-artwork";
   private static final String f_9419 = "Медиаплеер: обложка не прочитана: {}";
   private static final String f_9420 = "Dimasik-Media-Command";
   private static final String f_9421 = "Dimasik/Music";

   private static String m_3200(String var0, String var1) {
      return (var0 == null ? "" : var0.trim().toLowerCase(Locale.ROOT)) + "";
   }

   public boolean m_3202() {
      return this.f_9325.present() && this.f_9325.seekable() && this.f_9325.durationMs() > 0L;
   }

   public boolean m_3203() {
      return this.f_9325.present() && !this.f_9325.playing();
   }

   private void m_3204(String var1) {
      try {
         JsonObject var2 = JsonParser.parseString(var1).getAsJsonObject();
         if (!var2.get(f_9369).getAsBoolean()) {
            String var23 = var2.has(f_9370) ? var2.get(f_9371).getAsString() : "";
            this.f_9325 = new Class_JG8EQkxMGm8yNbUr.Class_1rYH3NQ9GPXfnr59(
               false, "", "", "", false, 0L, 0L, false, false, false, m_3250(var2, f_9372, -1), System.nanoTime()
            );
            this.f_9329 = "";
            this.f_9330 = 0;
            this.f_9331 = f_9373;
            this.f_9332 = f_9374;
            this.f_9326 = f_9375.equals(var23) ? "" : var23;
            this.f_9327 = "";
            this.m_3215();
            return;
         }

         this.f_9326 = "";
         String var3 = m_3206(var2, f_9376);
         String var4 = m_3206(var2, f_9377);
         boolean var5 = f_9378.equalsIgnoreCase(m_3206(var2, f_9379));
         long var6 = Math.max(0L, var2.get(f_9380).getAsLong());
         long var8 = var5 ? Math.clamp(m_3228(var2, f_9381, 0L), 0L, f_9382) : 0L;
         long var10 = var6 + var8;
         String var12 = m_3206(var2, f_9383);
         String var13 = m_3206(var2, f_9384);
         String var14 = m_3200(var12, var13);
         long var15 = this.m_3218();
         boolean var17 = this.f_9325.present() && (var14.equals(this.f_9329) || m_3241(this.f_9329, var14));
         long var18 = this.m_3205(Math.max(0L, var2.get(f_9385).getAsLong()), var15);
         long var20 = this.m_3236(var5, var17, var10, var15);
         this.f_9329 = var14;
         this.f_9332 = var10;
         this.f_9325 = new Class_JG8EQkxMGm8yNbUr.Class_1rYH3NQ9GPXfnr59(
            true,
            var12,
            var13,
            m_3206(var2, f_9386),
            var5,
            var20,
            var18,
            var2.get(f_9387).getAsBoolean(),
            var2.get(f_9388).getAsBoolean(),
            var2.get(f_9389).getAsBoolean(),
            m_3250(var2, f_9390, -1),
            System.nanoTime()
         );
         if (!var3.equals(this.f_9327)) {
            this.f_9327 = var3;
            if (var4.isBlank()) {
               this.m_3215();
            } else {
               this.m_3220(var4, var3);
            }
         }
      } catch (Exception var22) {
         f_9311.warn(f_9391, var22.getMessage());
      }
   }

   private long m_3205(long var1, long var3) {
      if (var1 >= f_9402) {
         return var1;
      }

      long var5 = this.f_9325.durationMs();
      return var5 >= f_9403 && var3 < var5 + f_9404 ? var5 : 0L;
   }

   private static String m_3206(JsonObject var0, String var1) {
      return var0.has(var1) && !var0.get(var1).isJsonNull() ? var0.get(var1).getAsString() : "";
   }

   private static Path m_3207(String var0) {
      return Path.of(System.getProperty(f_9338, f_9339), var0);
   }

   public String m_3208() {
      return this.f_9326;
   }

   public synchronized void m_3209() {
      if (this.f_9323 > 0) {
         this.f_9323--;
      }

      if (this.f_9323 <= 0) {
         this.f_9322 = false;
         Process var1 = this.f_9321;
         this.f_9321 = null;
         if (var1 != null) {
            var1.destroy();
         }

         this.f_9325 = Class_JG8EQkxMGm8yNbUr.Class_1rYH3NQ9GPXfnr59.EMPTY;
         this.f_9329 = "";
         this.f_9330 = 0;
         this.f_9331 = f_9343;
         this.f_9332 = f_9344;
         this.f_9326 = "";
         this.m_3215();
      }
   }

   private static boolean m_3210() {
      return System.getProperty(f_9340, "").toLowerCase().contains(f_9341);
   }

   public void m_3211() {
      this.m_3227(f_9409, 0L);
   }

   public boolean m_3213() {
      return this.f_9325.present() && !this.f_9325.title().isBlank();
   }

   private void m_3215() {
      Identifier var1 = this.f_9328;
      this.f_9328 = null;
      if (var1 != null) {
         f_11537.execute(() -> f_11537.getTextureManager().release(var1));
      }
   }

   private void m_3216() {
      try {
         this.m_3221();
         ProcessBuilder var1 = new ProcessBuilder(
            f_9345,
            f_9346,
            f_9347,
            f_9348,
            f_9349,
            f_9350,
            f_9351,
            f_9352,
            this.f_9317.toString(),
            f_9353,
            String.valueOf(f_9354),
            f_9355,
            this.f_9318.toString(),
            f_9356,
            this.f_9319.toString()
         );
         Files.deleteIfExists(this.f_9319);
         Process var2 = var1.start();
         this.f_9321 = var2;
         this.m_3240(f_9357, () -> this.m_3234(var2));
         this.m_3240(f_9358, () -> this.m_3246(var2));
         this.f_9326 = "";
      } catch (Exception var3) {
         this.f_9326 = var3.getMessage() + "";
         f_9311.error(f_9359, var3);
      }
   }

   public synchronized void m_3217() {
      if (!m_3210()) {
         this.f_9326 = f_9342;
      } else {
         this.f_9323++;
         if (!this.f_9322) {
            this.f_9322 = true;
            this.f_9324 = 0;
            this.m_3216();
         }
      }
   }

   public long m_3218() {
      Class_JG8EQkxMGm8yNbUr.Class_1rYH3NQ9GPXfnr59 var1 = this.f_9325;
      if (!var1.present()) {
         return 0L;
      }

      long var2 = var1.basePositionMs();
      if (var1.playing()) {
         var2 += Math.max(0L, (System.nanoTime() - var1.receivedAt()) / f_9413);
      }

      long var4 = var1.durationMs();
      return var4 > 0L && var2 > var4 && var4 >= f_9414 ? var4 : Math.max(0L, var2);
   }

   public void m_3219() {
      this.m_3227(f_9408, 0L);
   }

   private void m_3220(String var1, String var2) {
      this.f_9316.execute(() -> {
         try {
            byte[] var3 = Files.readAllBytes(Path.of(var1));
            NativeImage var4 = NativeImage.read(var3);
            f_11537.execute(() -> this.m_3243(var2, var4));
         } catch (Exception var5) {
            f_9311.warn(f_9419, var5.getMessage());
         }
      });
   }

   private void m_3221() throws IOException {
      try (InputStream var1 = Class_JG8EQkxMGm8yNbUr.class.getResourceAsStream(f_9360)) {
         if (var1 == null) {
            throw new IOException(f_9361);
         }

         byte[] var2 = var1.readAllBytes();
         boolean var3 = var2.length >= 3 && (var2[0] & 255) == 239 && (var2[1] & 255) == 187 && (var2[2] & 255) == 191;

         try (OutputStream var4 = Files.newOutputStream(this.f_9317)) {
            if (!var3) {
               var4.write(new byte[]{-17, -69, -65});
            }

            var4.write(var2);
         }
      }
   }

   public String m_3223() {
      String var1 = this.f_9325.app();
      if (var1.isBlank()) {
         return "";
      }

      String var2 = var1.endsWith(f_9412) ? var1.substring(0, var1.length() - 4) : var1;
      int var3 = Math.max(var2.lastIndexOf(92), var2.lastIndexOf(33));
      if (var3 >= 0 && var3 + 1 < var2.length()) {
         var2 = var2.substring(var3 + 1);
      }

      return var2;
   }

   public Identifier m_3224() {
      return this.f_9328;
   }

   public boolean m_3225() {
      return this.f_9325.volume() >= 0;
   }

   public static Class_JG8EQkxMGm8yNbUr m_3226() {
      return f_9312;
   }

   private void m_3227(String var1, long var2) {
      if (this.f_9321 != null) {
         this.f_9316.execute(() -> {
            try {
               Path var4 = Path.of(this.f_9319 + "");
               Files.writeString(var4, var1 + var2 + System.lineSeparator(), StandardCharsets.UTF_8);
               Files.move(var4, this.f_9319, StandardCopyOption.REPLACE_EXISTING);
            } catch (Exception var5) {
               f_9311.warn(f_9417, var1, var5.getMessage());
            }
         });
      }
   }

   private static long m_3228(JsonObject var0, String var1, long var2) {
      return var0.has(var1) && !var0.get(var1).isJsonNull() ? var0.get(var1).getAsLong() : var2;
   }

   public void m_3229() {
      synchronized (this) {
         this.f_9323 = 0;
         this.f_9322 = false;
         Process var2 = this.f_9321;
         this.f_9321 = null;
         if (var2 != null) {
            var2.destroy();
         }

         this.f_9325 = Class_JG8EQkxMGm8yNbUr.Class_1rYH3NQ9GPXfnr59.EMPTY;
         this.f_9329 = "";
         this.f_9330 = 0;
         this.f_9331 = f_9415;
         this.f_9332 = f_9416;
         this.f_9326 = "";
         this.m_3215();
      }

      this.f_9316.shutdownNow();
   }

   public void m_3230() {
      if (!this.m_3245()) {
         this.m_3251();
      }
   }

   private Class_JG8EQkxMGm8yNbUr() {
      this.f_9317 = m_3207(f_9333);
      this.f_9318 = m_3207(f_9334);
      this.f_9319 = m_3207(f_9335);
      this.f_9320 = new AtomicInteger();
      this.f_9325 = Class_JG8EQkxMGm8yNbUr.Class_1rYH3NQ9GPXfnr59.EMPTY;
      this.f_9326 = "";
      this.f_9327 = "";
      this.f_9329 = "";
      this.f_9331 = f_9336;
      this.f_9332 = f_9337;
   }

   public int m_3233() {
      return Math.max(0, this.f_9325.volume());
   }

   private void m_3234(Process var1) {
      String var3;
      try (BufferedReader var2 = new BufferedReader(new InputStreamReader(var1.getInputStream(), StandardCharsets.UTF_8))) {
         while ((var3 = var2.readLine()) != null) {
            if (!this.f_9322) {
               return;
            }

            this.m_3204(var3);
         }
      } catch (IOException var7) {
         if (this.f_9322) {
            f_9311.warn(f_9362, var7.getMessage());
         }
      }

      if (this.f_9322) {
         this.m_3248();
      }
   }

   public void m_3235() {
      if (this.m_3245()) {
         this.m_3251();
      }
   }

   private long m_3236(boolean var1, boolean var2, long var3, long var5) {
      boolean var7 = this.f_9332 < 0L || var3 > this.f_9332 + f_9392;
      if (!var2) {
         this.f_9330 = 0;
         this.f_9331 = f_9393;
         return var3;
      }

      if (!var1) {
         this.f_9330 = 0;
         this.f_9331 = f_9394;
         return var5;
      }

      if (var7 && var5 > var3 + f_9395) {
         this.f_9330 = 0;
         this.f_9331 = f_9396;
         return var3;
      }

      if (var3 >= var5 - f_9397) {
         this.f_9330 = 0;
         this.f_9331 = f_9398;
         return Math.max(var5, var3);
      }

      boolean var8 = this.f_9331 >= 0L && var3 > this.f_9331 + f_9399;
      int var9 = var3 < f_9400 ? 3 : 2;
      if (var8) {
         this.f_9330++;
         this.f_9331 = var3;
         if (this.f_9330 >= var9) {
            this.f_9330 = 0;
            this.f_9331 = f_9401;
            return var3;
         } else {
            return var5;
         }
      } else {
         this.f_9330 = 0;
         this.f_9331 = var3;
         return var5;
      }
   }

   public String m_3237() {
      return this.f_9325.title();
   }

   public String m_3239() {
      return this.f_9325.artist();
   }

   private void m_3240(String var1, Runnable var2) {
      Thread var3 = new Thread(var2, var1);
      var3.setDaemon(true);
      var3.start();
   }

   private static boolean m_3241(String var0, String var1) {
      if (var0 == null || var0.isEmpty() || var1 == null) {
         return false;
      }

      if (var0.equals(var1)) {
         return true;
      }

      int var2 = var0.indexOf(1);
      int var3 = var1.indexOf(1);
      String var4 = var2 < 0 ? var0 : var0.substring(0, var2);
      String var5 = var3 < 0 ? var1 : var1.substring(0, var3);
      return var4.length() >= 3 && var5.length() >= 3 ? var4.equals(var5) || var4.contains(var5) || var5.contains(var4) : false;
   }

   private void m_3243(String var1, NativeImage var2) {
      if (!var1.equals(this.f_9327)) {
         var2.close();
      } else {
         Identifier var3 = this.f_9328;
         Identifier var4 = Identifier.fromNamespaceAndPath(f_9405, this.f_9320.incrementAndGet() + "");
         f_11537.getTextureManager().register(var4, new DynamicTexture(() -> f_9418, var2));
         this.f_9328 = var4;
         if (var3 != null) {
            f_11537.getTextureManager().release(var3);
         }
      }
   }

   public void m_3244(long var1) {
      long var3 = this.m_3252();
      long var5 = Math.max(0L, var3 > 0L ? Math.min(var1, var3) : var1);
      Class_JG8EQkxMGm8yNbUr.Class_1rYH3NQ9GPXfnr59 var7 = this.f_9325;
      this.f_9325 = new Class_JG8EQkxMGm8yNbUr.Class_1rYH3NQ9GPXfnr59(
         var7.present(),
         var7.title(),
         var7.artist(),
         var7.app(),
         var7.playing(),
         var5,
         var7.durationMs(),
         var7.seekable(),
         var7.canNext(),
         var7.canPrevious(),
         var7.volume(),
         System.nanoTime()
      );
      this.m_3227(f_9410, var5);
   }

   public boolean m_3245() {
      return this.f_9325.playing();
   }

   private void m_3246(Process var1) {
      String var3;
      try (BufferedReader var2 = new BufferedReader(new InputStreamReader(var1.getErrorStream(), StandardCharsets.UTF_8))) {
         while ((var3 = var2.readLine()) != null) {
            if (!var3.isBlank() && !var3.startsWith(f_9363) && !var3.startsWith(f_9364)) {
               f_9311.warn(f_9365, var3);
            }
         }
      } catch (IOException var7) {
      }
   }

   public boolean m_3247() {
      return this.f_9325.canNext() || this.f_9325.canPrevious();
   }

   private synchronized void m_3248() {
      if (this.f_9322) {
         if (++this.f_9324 > 3) {
            this.f_9326 = f_9366;
            this.f_9322 = false;
         } else {
            f_9311.warn(f_9367, this.f_9324, 3);

            try {
               Thread.sleep(f_9368);
            } catch (InterruptedException var2) {
               Thread.currentThread().interrupt();
               return;
            }

            if (this.f_9322) {
               this.m_3216();
            }
         }
      }
   }

   public void m_3249(int var1) {
      int var2 = Math.max(0, Math.min(100, var1));
      Class_JG8EQkxMGm8yNbUr.Class_1rYH3NQ9GPXfnr59 var3 = this.f_9325;
      this.f_9325 = new Class_JG8EQkxMGm8yNbUr.Class_1rYH3NQ9GPXfnr59(
         var3.present(),
         var3.title(),
         var3.artist(),
         var3.app(),
         var3.playing(),
         var3.basePositionMs(),
         var3.durationMs(),
         var3.seekable(),
         var3.canNext(),
         var3.canPrevious(),
         var2,
         var3.receivedAt()
      );
      this.m_3227(f_9411, var2);
   }

   private static int m_3250(JsonObject var0, String var1, int var2) {
      return var0.has(var1) && !var0.get(var1).isJsonNull() ? var0.get(var1).getAsInt() : var2;
   }

   public void m_3251() {
      boolean var1 = this.m_3245();
      Class_JG8EQkxMGm8yNbUr.Class_1rYH3NQ9GPXfnr59 var2 = this.f_9325;
      this.f_9325 = new Class_JG8EQkxMGm8yNbUr.Class_1rYH3NQ9GPXfnr59(
         var2.present(),
         var2.title(),
         var2.artist(),
         var2.app(),
         !var1,
         this.m_3218(),
         var2.durationMs(),
         var2.seekable(),
         var2.canNext(),
         var2.canPrevious(),
         var2.volume(),
         System.nanoTime()
      );
      this.m_3227(var1 ? f_9406 : f_9407, 0L);
   }

   public long m_3252() {
      return this.f_9325.durationMs();
   }

   private record Class_1rYH3NQ9GPXfnr59(
      boolean present,
      String title,
      String artist,
      String app,
      boolean playing,
      long basePositionMs,
      long durationMs,
      boolean seekable,
      boolean canNext,
      boolean canPrevious,
      int volume,
      long receivedAt
   ) {
      private static final Class_JG8EQkxMGm8yNbUr.Class_1rYH3NQ9GPXfnr59 EMPTY = new Class_JG8EQkxMGm8yNbUr.Class_1rYH3NQ9GPXfnr59(
         false, "", "", "", false, 0L, 0L, false, false, false, -1, 0L
      );
   }
}
