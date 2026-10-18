package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.combat.Aura;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.UUID;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.AbstractClientPlayer;

public final class Class_EELhdLEtuZYiR6rw implements Class_NzJrN63M7QBpmAbi {
   private static final int f_6706 = 100;
   private static final float f_6707 = 7.0F;
   private static final double f_6708 = 0.82;
   private static final DateTimeFormatter f_6709 = DateTimeFormatter.ofPattern(Class_EELhdLEtuZYiR6rw.f_6769, Locale.ROOT);
   private static final String[] f_6710 = new String[]{
      Class_EELhdLEtuZYiR6rw.f_6770,
      Class_EELhdLEtuZYiR6rw.f_6771,
      Class_EELhdLEtuZYiR6rw.f_6772,
      Class_EELhdLEtuZYiR6rw.f_6773,
      Class_EELhdLEtuZYiR6rw.f_6774,
      Class_EELhdLEtuZYiR6rw.f_6775,
      Class_EELhdLEtuZYiR6rw.f_6776,
      Class_EELhdLEtuZYiR6rw.f_6777
   };
   private static final String[] f_6711 = new String[]{Class_EELhdLEtuZYiR6rw.f_6778, Class_EELhdLEtuZYiR6rw.f_6779};
   private static final String[] f_6712 = m_2495(f_6710, f_6711, Class_WvVvQwpWLdnJMMi9.f_15737);
   private final Class_FDIjwAsPHVABPHnJ f_6713 = new Class_FDIjwAsPHVABPHnJ();
   private final Class_dSYEfAT7aJC05RrC f_6714 = new Class_dSYEfAT7aJC05RrC();
   private Path f_6715;
   private Path f_6716;
   private Path f_6717;
   private UUID f_6718;
   private UUID f_6719;
   private BufferedWriter f_6720;
   private AbstractClientPlayer f_6721;
   private ClientLevel f_6722;
   private long f_6723;
   private long f_6724;
   private long f_6725;
   private long f_6726;
   private long f_6727;
   private long f_6728;
   private long f_6729;
   private static final String f_6730 = "gru-datasets-v3-60hz";
   private static final String f_6731 = ",";
   private static final String f_6732 = "Dataset 60 Hz started";
   private static final String f_6733 = "completed";
   private static final String f_6734 = "finalize_failed";
   private static final float f_6735 = 7.0F;
   private static final long f_6736 = 3L;
   private static final long f_6737 = 100L;
   private static final String f_6738 = "schemaVersion";
   private static final String f_6739 = "sessionId";
   private static final String f_6740 = "createdAtUtc";
   private static final String f_6741 = "status";
   private static final String f_6742 = "recording";
   private static final String f_6743 = "minecraftVersion";
   private static final String f_6744 = "26.2";
   private static final String f_6745 = "mappings";
   private static final String f_6746 = "official";
   private static final String f_6747 = "sampleRateHz";
   private static final String f_6748 = "sampleIntervalNanos";
   private static final long f_6749 = 16666666L;
   private static final String f_6750 = "sequenceLength";
   private static final String f_6751 = "horizon";
   private static final String f_6752 = "featureCount";
   private static final String f_6753 = "featureSchemaSha256";
   private static final String f_6754 = "6db7f03c9fc49d2646ba07998b7de71785de353143059a7dd937552c0d3a9752";
   private static final String f_6755 = "targetHeightRatio";
   private static final double f_6756 = 0.82;
   private static final String f_6757 = "velocityUnit";
   private static final String f_6758 = "units per second";
   private static final String f_6759 = "angularVelocityUnit";
   private static final String f_6760 = "degrees per second";
   private static final String f_6761 = "columns";
   private static final String f_6762 = ",";
   private static final String f_6763 = "status";
   private static final String f_6764 = "closedAtUtc";
   private static final String f_6765 = "recordedRows";
   private static final String f_6766 = "lastSegmentId";
   private static final String f_6767 = "worldEpochsSeen";
   private static final String f_6768 = "GRU Dataset Collector 60 Hz";
   private static final String f_6769 = "yyyyMMdd_HHmmss_SSS";
   private static final String f_6770 = "schema_version";
   private static final String f_6771 = "session_id";
   private static final String f_6772 = "world_epoch";
   private static final String f_6773 = "segment_id";
   private static final String f_6774 = "sample_index";
   private static final String f_6775 = "segment_sample";
   private static final String f_6776 = "sample_time_ns";
   private static final String f_6777 = "target_uuid";
   private static final String f_6778 = "player_yaw";
   private static final String f_6779 = "player_pitch";

   public void m_2490() {
      if (this.f_6720 == null) {
         UUID var1 = UUID.randomUUID();
         String var2 = f_6709.format(LocalDateTime.now()) + var1.toString().substring(0, 8);
         Path var3 = f_11537.gameDirectory.toPath().resolve(f_6730);
         Path var4 = var3.resolve(var2 + "");
         Path var5 = var3.resolve(var2 + "");
         Path var6 = var3.resolve(var2 + "");

         try {
            Files.createDirectories(var3);
            this.f_6720 = Files.newBufferedWriter(var4, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW, StandardOpenOption.WRITE);
            this.f_6720.write(String.join(f_6731, f_6712));
            this.f_6720.newLine();
            this.f_6720.flush();
            this.f_6715 = var4;
            this.f_6716 = var5;
            this.f_6717 = var6;
            this.f_6718 = var1;
            this.f_6723 = System.nanoTime();
            this.f_6722 = f_11537.level;
            this.f_6724 = this.f_6722 == null ? 0L : 1L;
            this.f_6725 = this.f_6726 = this.f_6727 = this.f_6728 = this.f_6729 = 0L;
            this.f_6721 = null;
            this.f_6713.m_2593();
            this.m_2503();
            this.m_2505();
            Class_ftHu9o3WzCU3Adxm.m_6731(f_6732);
         } catch (IOException var8) {
            m_2502(this.f_6720);
            this.f_6720 = null;
            System.err.println(var8.getMessage() + "");
         }
      }
   }

   private void m_2491(Properties var1, boolean var2) {
      StandardOpenOption[] var3 = var2
         ? new StandardOpenOption[]{StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE}
         : new StandardOpenOption[]{StandardOpenOption.CREATE_NEW, StandardOpenOption.WRITE};

      try (BufferedWriter var4 = Files.newBufferedWriter(this.f_6717, StandardCharsets.UTF_8, var3)) {
         var1.store(var4, f_6768);
      } catch (IOException var9) {
         System.err.println(var9.getMessage());
      }
   }

   private void m_2492(UUID var1) {
      this.f_6725++;
      this.f_6726 = 0L;
      this.f_6719 = var1;
      this.f_6714.m_6335();
   }

   private boolean m_2493() {
      return f_11537.level != null
         && f_11537.player != null
         && f_11537.player.isAlive()
         && f_11537.gui.screen() == null
         && f_11537.isWindowActive()
         && f_11537.mouseHandler.isMouseGrabbed();
   }

   private void m_2494() {
      Aura var1 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
      this.f_6721 = Class_lwIe74mLf6HOTjku.m_7574(this.f_6721, f_6735, true, true, false, false, var1.m_1032()) instanceof AbstractClientPlayer var3
         ? var3
         : null;
   }

   private static String[] m_2495(String[]... var0) {
      int var1 = 0;

      for (String[] var5 : var0) {
         var1 += var5.length;
      }

      String[] var8 = new String[var1];
      int var9 = 0;

      for (String[] var7 : var0) {
         System.arraycopy(var7, 0, var8, var9, var7.length);
         var9 += var7.length;
      }

      return var8;
   }

   public boolean m_2496() {
      return this.f_6720 != null;
   }

   public void m_2497(float var1) {
      if (this.f_6720 != null) {
         long var2 = System.nanoTime();
         if (!this.f_6713.m_2592(var2, 55)) {
            this.m_2503();
         } else {
            this.m_2500(var1, var2);
         }
      }
   }

   private void m_2498(Class_dSYEfAT7aJC05RrC.TEKbDjGhGLlvYtoY var1, long var2, UUID var4) throws IOException {
      Class_EELhdLEtuZYiR6rw.OoZ2IiywOF7GqvWX var5 = new Class_EELhdLEtuZYiR6rw.OoZ2IiywOF7GqvWX();
      var5.m_2489(f_6736);
      var5.m_2488(this.f_6718.toString());
      var5.m_2489(this.f_6724);
      var5.m_2489(this.f_6725);
      var5.m_2489(this.f_6727);
      var5.m_2489(this.f_6726);
      var5.m_2489(var2);
      var5.m_2488(var4.toString());
      var5.m_2485(var1.playerYaw());
      var5.m_2485(var1.playerPitch());

      for (float var9 : var1.features()) {
         var5.m_2485(var9);
      }

      if (var5.m_2487() != f_6712.length) {
         throw new IllegalStateException("" + var5.m_2487() + f_6712.length);
      }

      this.f_6720.write(var5.m_2486());
      this.f_6720.newLine();
      this.f_6728++;
      if (++this.f_6729 >= f_6737) {
         this.f_6720.flush();
         this.f_6729 = 0L;
      }
   }

   private void m_2499(String var1) {
      if (this.f_6717 != null) {
         Properties var2 = new Properties();
         if (Files.isRegularFile(this.f_6717)) {
            try (BufferedReader var3 = Files.newBufferedReader(this.f_6717, StandardCharsets.UTF_8)) {
               var2.load(var3);
            } catch (IOException var8) {
               System.err.println(var8.getMessage());
            }
         }

         var2.setProperty(f_6763, var1);
         var2.setProperty(f_6764, Instant.now().toString());
         var2.setProperty(f_6765, Long.toString(this.f_6728));
         var2.setProperty(f_6766, Long.toString(this.f_6725));
         var2.setProperty(f_6767, Long.toString(this.f_6724));
         this.m_2491(var2, true);
      }
   }

   private void m_2500(float var1, long var2) {
      if (f_11537.level != this.f_6722) {
         this.f_6722 = f_11537.level;
         if (this.f_6722 != null) {
            this.f_6724++;
         }

         this.f_6721 = null;
         this.m_2503();
      }

      if (!this.m_2493()) {
         this.m_2503();
      } else {
         this.m_2494();
         if (this.f_6721 != null && this.f_6721.isAlive() && !this.f_6721.isRemoved() && !this.f_6721.isSpectator()) {
            UUID var4 = this.f_6721.getUUID();
            boolean var5 = !var4.equals(this.f_6719);
            if (var5) {
               this.m_2492(var4);
            }

            Class_dSYEfAT7aJC05RrC.TEKbDjGhGLlvYtoY var6 = this.f_6714.m_6337(f_11537.player, this.f_6721, var1, var2);
            if (var6.resetHistory()) {
               if (!var5) {
                  this.f_6725++;
                  this.f_6726 = 0L;
               }

               if (var6.features() == null) {
                  return;
               }
            }

            if (var6.features() != null) {
               try {
                  this.m_2498(var6, var2 - this.f_6723, var4);
                  this.f_6727++;
                  this.f_6726++;
               } catch (IOException | RuntimeException var8) {
                  System.err.println(var8.getMessage() + "");
                  this.m_2503();
               }
            }
         } else {
            this.m_2503();
         }
      }
   }

   public void m_2501() {
      if (this.f_6720 != null) {
         this.m_2503();

         try {
            this.f_6720.flush();
            this.f_6720.close();
            this.f_6720 = null;
            this.m_2499(f_6733);
            m_2504(this.f_6715, this.f_6716);
            Class_ftHu9o3WzCU3Adxm.m_6731("" + this.f_6728 + this.f_6725);
         } catch (IOException var5) {
            m_2502(this.f_6720);
            this.f_6720 = null;
            this.m_2499(f_6734);
            System.err.println(var5.getMessage() + "");
         } finally {
            this.f_6715 = this.f_6716 = this.f_6717 = null;
            this.f_6718 = null;
            this.f_6721 = null;
            this.f_6713.m_2593();
         }
      }
   }

   private static void m_2502(BufferedWriter var0) {
      if (var0 != null) {
         try {
            var0.close();
         } catch (IOException var2) {
         }
      }
   }

   private void m_2503() {
      this.f_6719 = null;
      this.f_6726 = 0L;
      this.f_6714.m_6335();
   }

   private static void m_2504(Path var0, Path var1) throws IOException {
      try {
         Files.move(var0, var1, StandardCopyOption.ATOMIC_MOVE);
      } catch (AtomicMoveNotSupportedException var3) {
         Files.move(var0, var1);
      }
   }

   private void m_2505() {
      Properties var1 = new Properties();
      var1.setProperty(f_6738, Integer.toString(3));
      var1.setProperty(f_6739, this.f_6718.toString());
      var1.setProperty(f_6740, Instant.now().toString());
      var1.setProperty(f_6741, f_6742);
      var1.setProperty(f_6743, f_6744);
      var1.setProperty(f_6745, f_6746);
      var1.setProperty(f_6747, Integer.toString(60));
      var1.setProperty(f_6748, Long.toString(f_6749));
      var1.setProperty(f_6750, Integer.toString(60));
      var1.setProperty(f_6751, Integer.toString(15));
      var1.setProperty(f_6752, Integer.toString(Class_WvVvQwpWLdnJMMi9.f_15738));
      var1.setProperty(f_6753, f_6754);
      var1.setProperty(f_6755, Double.toString(f_6756));
      var1.setProperty(f_6757, f_6758);
      var1.setProperty(f_6759, f_6760);
      var1.setProperty(f_6761, String.join(f_6762, f_6712));
      this.m_2491(var1, false);
   }

   private static final class OoZ2IiywOF7GqvWX {
      public final List<String> f_6703 = new ArrayList<>(Class_EELhdLEtuZYiR6rw.f_6712.length);
      public static final String f_6704 = "Non-finite CSV value";
      public static final String f_6705 = ",";

      public void m_2485(double var1) {
         if (!Double.isFinite(var1)) {
            throw new IllegalArgumentException(f_6704);
         }

         this.f_6703.add(Double.toString(var1));
      }

      public String m_2486() {
         return String.join(f_6705, this.f_6703);
      }

      public int m_2487() {
         return this.f_6703.size();
      }

      public void m_2488(String var1) {
         this.f_6703.add(var1);
      }

      public OoZ2IiywOF7GqvWX() {
      }

      public void m_2489(long var1) {
         this.f_6703.add(Long.toString(var1));
      }
   }
}
