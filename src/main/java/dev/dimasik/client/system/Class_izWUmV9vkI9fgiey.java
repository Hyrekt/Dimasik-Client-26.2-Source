package dev.dimasik.client.system;

import com.sun.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import lombok.Generated;
import net.minecraft.ChatFormatting;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.player.Player;

public final class Class_izWUmV9vkI9fgiey implements Class_NzJrN63M7QBpmAbi {
   private static final long f_24665 = 1048576L;
   private static final double f_24666 = 100.0;
   private static final double f_24667 = 100.0;
   private static final String f_24668 = "0.0";
   private static final String f_24669 = "%.2f";
   private static final double f_24670 = 20.0;
   private static final String f_24671 = "Europe/Moscow";
   private static final String f_24672 = "HH:mm";
   private static final String f_24673 = "This is a utility class and cannot be instantiated";

   @Generated
   private Class_izWUmV9vkI9fgiey() {
      throw new UnsupportedOperationException(f_24673);
   }

   public static String m_7350() {
      LocalPlayer var0 = f_11537.player;
      double var1 = var0.getX() - var0.xo;
      double var3 = var0.getZ() - var0.zo;
      double var5 = var0.getY() - var0.yo;
      double var7 = Math.hypot(var1, var3);
      var7 = Math.hypot(var7, var5);
      return var7 == 0.0 ? f_24668 : String.format(Locale.US, f_24669, var7 * f_24670);
   }

   public static String m_7351() {
      return "";
   }

   public static int m_7352(Player var0) {
      PlayerInfo var1 = f_11537.getConnection().getPlayerInfo(var0.getUUID());
      return var1 != null ? var1.getLatency() : 0;
   }

   public static String m_7353() {
      String var0 = f_11537.getGpuUtilization() > f_24666 ? ChatFormatting.RED + "" : Math.round(f_11537.getGpuUtilization()) + "";
      return var0 + "";
   }

   public static int m_7354() {
      Runtime var0 = Runtime.getRuntime();
      long var1 = var0.totalMemory();
      long var3 = var0.freeMemory();
      long var5 = var1 - var3;
      return (int)(var5 / f_24665);
   }

   public static String m_7355() {
      ZonedDateTime var0 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), ZoneId.of(f_24671));
      return var0.format(DateTimeFormatter.ofPattern(f_24672));
   }

   public static int m_7356() {
      OperatingSystemMXBean var0 = (OperatingSystemMXBean)ManagementFactory.getOperatingSystemMXBean();
      double var1 = var0.getProcessCpuLoad();
      return var1 < 0.0 ? 0 : (int)Math.round(var1 * f_24667);
   }
}
