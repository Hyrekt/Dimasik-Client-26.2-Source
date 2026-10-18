package dev.dimasik.client.system;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Locale;
import java.util.Properties;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;

public final class Class_Ja79cp8QmiWLo2Xv {
   private static final String f_9950 = "standalone-onnx-aim.properties";
   private static final String f_9951 = "standalone-onnx-aim/aim_gru.onnx";
   public final Path f_9952;
   public final boolean f_9953;
   public final boolean f_9954;
   public final double f_9955;
   public final double f_9956;
   public final int f_9957;
   private static final String f_9958 = "enabledOnStart";
   private static final String f_9959 = "padInitialHistory";
   private static final String f_9960 = "targetHeightRatio";
   private static final double f_9961 = 0.82;
   private static final String f_9962 = "temperature";
   private static final double f_9963 = 0.8;
   private static final double f_9964 = 0.05;
   private static final double f_9965 = 2.0;
   private static final String f_9966 = "minimumEffectiveRateHz";
   private static final String f_9967 = "modelPath";
   private static final String f_9968 = "standalone-onnx-aim/aim_gru.onnx";
   private static final String f_9969 = "standalone-onnx-aim/aim_gru.onnx";
   private static final String f_9970 = "standalone-onnx-aim.properties";
   private static final String f_9971 = "Standalone ONNX Aim 60 Hz";
   private static final String f_9972 = "Could not read or create {}";
   private static final String f_9973 = "Could not create model directory for {}";
   private static final String f_9974 = "modelPath";
   private static final String f_9975 = "standalone-onnx-aim/aim_gru.onnx";
   private static final String f_9976 = "enabledOnStart";
   private static final String f_9977 = "false";
   private static final String f_9978 = "padInitialHistory";
   private static final String f_9979 = "true";
   private static final String f_9980 = "targetHeightRatio";
   private static final String f_9981 = "0.82";
   private static final String f_9982 = "temperature";
   private static final String f_9983 = "0.8";
   private static final String f_9984 = "minimumEffectiveRateHz";
   private static final String f_9985 = "55";
   private static final String f_9986 = "true";
   private static final String f_9987 = "false";
   private static final String f_9988 = "Invalid {}={}; using {}";
   private static final String f_9989 = "Invalid {}={}; using {}";
   private static final String f_9990 = "Invalid {}={}; using {}";

   private Class_Ja79cp8QmiWLo2Xv(Properties var1, Logger var2, Path var3) {
      this.f_9953 = m_3332(var1, var2, f_9958, false);
      this.f_9954 = m_3332(var1, var2, f_9959, true);
      this.f_9955 = m_3331(var1, var2, f_9960, f_9961, 0.0, 1.0);
      this.f_9956 = m_3331(var1, var2, f_9962, f_9963, f_9964, f_9965);
      this.f_9957 = m_3335(var1, var2, f_9966, 55, 30, 60);
      String var4 = var1.getProperty(f_9967, f_9968).trim();
      Path var5 = Path.of(var4.isEmpty() ? f_9969 : var4);
      this.f_9952 = (var5.isAbsolute() ? var5 : var3.resolve(var5)).normalize();
   }

   private static double m_3331(Properties var0, Logger var1, String var2, double var3, double var5, double var7) {
      try {
         double var9 = Double.parseDouble(var0.getProperty(var2, Double.toString(var3)).trim());
         if (Double.isFinite(var9) && var9 >= var5 && var9 <= var7) {
            return var9;
         }
      } catch (NumberFormatException var11) {
      }

      var1.warn(f_9989, new Object[]{var2, var0.getProperty(var2), var3});
      return var3;
   }

   private static boolean m_3332(Properties var0, Logger var1, String var2, boolean var3) {
      String var4 = var0.getProperty(var2);
      if (var4 == null) {
         return var3;
      }

      return switch (var4.trim().toLowerCase(Locale.ROOT)) {
         case f_9986 -> true;
         case f_9987 -> false;
         default -> {
            var1.warn(f_9988, new Object[]{var2, var4, var3});
            yield var3;
         }
      };
   }

   public static Class_Ja79cp8QmiWLo2Xv m_3333(Logger var0) {
      Path var1 = FabricLoader.getInstance().getConfigDir();
      Path var2 = var1.resolve(f_9970);
      Properties var3 = m_3334();
      Properties var4 = new Properties(var3);

      try {
         Files.createDirectories(var1);
         if (Files.isRegularFile(var2)) {
            try (BufferedReader var5 = Files.newBufferedReader(var2, StandardCharsets.UTF_8)) {
               var4.load(var5);
            }
         } else {
            try (BufferedWriter var14 = Files.newBufferedWriter(var2, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW, StandardOpenOption.WRITE)) {
               var3.store(var14, f_9971);
            }
         }
      } catch (IOException var13) {
         var0.error(f_9972, var2, var13);
      }

      Class_Ja79cp8QmiWLo2Xv var15 = new Class_Ja79cp8QmiWLo2Xv(var4, var0, var1);

      try {
         Path var6 = var15.f_9952.getParent();
         if (var6 != null) {
            Files.createDirectories(var6);
         }
      } catch (IOException var8) {
         var0.warn(f_9973, var15.f_9952, var8);
      }

      return var15;
   }

   private static Properties m_3334() {
      Properties var0 = new Properties();
      var0.setProperty(f_9974, f_9975);
      var0.setProperty(f_9976, f_9977);
      var0.setProperty(f_9978, f_9979);
      var0.setProperty(f_9980, f_9981);
      var0.setProperty(f_9982, f_9983);
      var0.setProperty(f_9984, f_9985);
      return var0;
   }

   private static int m_3335(Properties var0, Logger var1, String var2, int var3, int var4, int var5) {
      try {
         int var6 = Integer.parseInt(var0.getProperty(var2, Integer.toString(var3)).trim());
         if (var6 >= var4 && var6 <= var5) {
            return var6;
         }
      } catch (NumberFormatException var7) {
      }

      var1.warn(f_9990, new Object[]{var2, var0.getProperty(var2), var3});
      return var3;
   }
}
