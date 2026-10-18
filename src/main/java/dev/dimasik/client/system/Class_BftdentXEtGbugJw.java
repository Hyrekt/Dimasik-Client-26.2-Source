package dev.dimasik.client.system;

import java.awt.Color;
import lombok.Generated;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.util.Mth;
import org.joml.Vector4f;

public final class Class_BftdentXEtGbugJw {
   private static final long f_5941 = 10000L;
   private static final float f_5942 = 8.0F;
   private static final float f_5943 = 360.0F;
   private static final float f_5944 = 360.0F;
   private static final float f_5945 = 0.85F;
   private static final int f_5946 = -16777216;
   private static final float f_5947 = 16.0F;
   private static final float f_5948 = 360.0F;
   private static final int f_5949 = 16777215;
   private static final int f_5950 = 16777215;
   private static final long f_5951 = 10000L;
   private static final float f_5952 = 10000.0F;
   private static final float f_5953 = 0.5F;
   private static final float f_5954 = 0.5F;
   private static final double f_5955 = Math.PI;
   private static final double f_5956 = 2.0;
   private static final long f_5957 = 360L;
   private static final float f_5958 = 180.0F;
   private static final float f_5959 = 255.0F;
   private static final float f_5960 = 255.0F;
   private static final float f_5961 = 255.0F;
   private static final float f_5962 = 1.5F;
   private static final float f_5963 = 255.0F;
   private static final float f_5964 = 255.0F;
   private static final float f_5965 = 255.0F;
   private static final float f_5966 = 255.0F;
   private static final float f_5967 = 255.0F;
   private static final float f_5968 = 255.0F;
   private static final float f_5969 = 255.0F;
   private static final float f_5970 = 255.0F;
   private static final float f_5971 = 255.0F;
   private static final float f_5972 = 255.0F;
   private static final float f_5973 = 255.0F;
   private static final float f_5974 = 255.0F;
   private static final float f_5975 = 255.0F;
   private static final float f_5976 = 255.0F;
   private static final float f_5977 = 255.0F;
   private static final float f_5978 = 255.0F;
   private static final int f_5979 = -16777216;
   private static final float f_5980 = 255.0F;
   private static final float f_5981 = 255.0F;
   private static final float f_5982 = 255.0F;
   private static final String f_5983 = "#";
   private static final String f_5984 = "0x";
   private static final String f_5985 = "0X";
   private static final double f_5986 = 255.0;
   private static final String f_5987 = "This is a utility class and cannot be instantiated";

   public static int m_2297(int var0) {
      return var0 >> 24 & 0xFF;
   }

   public static Vector4f m_2298(int var0) {
      float var1 = (var0 >> 24 & 0xFF) / f_5975;
      float var2 = (var0 >> 16 & 0xFF) / f_5976;
      float var3 = (var0 >> 8 & 0xFF) / f_5977;
      float var4 = (var0 & 0xFF) / f_5978;
      return new Vector4f(var2, var3, var4, var1);
   }

   public static int m_2299(int var0) {
      return var0 >> 8 & 0xFF;
   }

   public static int m_2300(int var0, int var1, int var2, int var3) {
      int var4 = (int)((System.currentTimeMillis() / var3 + var2) % f_5957);
      var4 = (var4 > 180 ? 360 - var4 : var4) + 180;
      int var5 = m_2312(var0, var1, Mth.clamp(var4 / f_5958 - 1.0F, 0.0F, 1.0F));
      float[] var6 = m_2301(var5);
      float[] var7 = Color.RGBtoHSB((int)(var6[0] * f_5959), (int)(var6[1] * f_5960), (int)(var6[2] * f_5961), null);
      var7[1] *= f_5962;
      var7[1] = Math.min(var7[1], 1.0F);
      return Color.HSBtoRGB(var7[0], var7[1], var7[2]);
   }

   public static float[] m_2301(int var0) {
      return new float[]{(var0 >> 16 & 0xFF) / f_5971, (var0 >> 8 & 0xFF) / f_5972, (var0 & 0xFF) / f_5973, (var0 >> 24 & 0xFF) / f_5974};
   }

   public static int m_2302(int var0, int var1, float var2) {
      Vector4f var3 = m_2298(var0).mul(f_5980);
      Vector4f var4 = m_2298(var1).mul(f_5981);
      return m_2303(
         (int)Class_3VHxwfI2NZKoxzIi.m_1309(var3.x, var4.x, var2),
         (int)Class_3VHxwfI2NZKoxzIi.m_1309(var3.y, var4.y, var2),
         (int)Class_3VHxwfI2NZKoxzIi.m_1309(var3.z, var4.z, var2),
         Class_3VHxwfI2NZKoxzIi.m_1309(var3.w, var4.w, var2)
      );
   }

   @Generated
   private Class_BftdentXEtGbugJw() {
      throw new UnsupportedOperationException(f_5987);
   }

   public static int m_2303(int var0, int var1, int var2, double var3) {
      return (int)var3 << 24 | var0 << 16 | var1 << 8 | var2;
   }

   public static int m_2304(int var0) {
      if (Class_LsNSRvPKh5AwfAUe.m_3842()) {
         float var1 = ((float)System.currentTimeMillis() / f_5942 + var0 * 16) % f_5943 / f_5944;
         if (var1 < 0.0F) {
            var1++;
         }

         return Color.HSBtoRGB(var1, f_5945, 1.0F) | f_5946;
      } else {
         return m_2307(
            Class_LsNSRvPKh5AwfAUe.m_3845(Class_y3cvEHXTSEF5dp8q.MAIN),
            Class_LsNSRvPKh5AwfAUe.m_3845(Class_y3cvEHXTSEF5dp8q.MAIN_TWO),
            var0 * f_5947 / f_5948,
            255
         );
      }
   }

   public static int m_2305(String var0) {
      String var1 = var0.trim();
      if (var1.startsWith(f_5983)) {
         var1 = var1.substring(1);
      }

      if (var1.startsWith(f_5984) || var1.startsWith(f_5985)) {
         var1 = var1.substring(2);
      }

      if (var1.length() == 3 || var1.length() == 4) {
         char var2 = var1.charAt(0);
         char var3 = var1.charAt(1);
         char var4 = var1.charAt(2);
         char var5 = var1.length() == 4 ? var1.charAt(3) : 'F';
         var1 = "" + var2 + var2 + var3 + var3 + var4 + var4 + var5 + var5;
      }

      if (var1.length() == 6) {
         int var7 = Integer.parseInt(var1.substring(0, 2), 16);
         int var9 = Integer.parseInt(var1.substring(2, 4), 16);
         int var11 = Integer.parseInt(var1.substring(4, 6), 16);
         return m_2303(var7, var9, var11, f_5986);
      } else if (var1.length() == 8) {
         int var6 = Integer.parseInt(var1.substring(0, 2), 16);
         int var8 = Integer.parseInt(var1.substring(2, 4), 16);
         int var10 = Integer.parseInt(var1.substring(4, 6), 16);
         int var12 = Integer.parseInt(var1.substring(6, 8), 16);
         return m_2303(var6, var8, var10, var12);
      } else {
         throw new IllegalArgumentException(var0 + "");
      }
   }

   public static int m_2306(int var0, float var1) {
      int var2 = Math.min(255, Math.max(0, (int)(var1 * f_5982)));
      return m_2303(m_2309(var0), m_2299(var0), m_2308(var0), var2);
   }

   public static int m_2307(int var0, int var1, float var2, int var3) {
      if ((var0 & f_5949) == (var1 & f_5950)) {
         return m_2303(m_2309(var0), m_2299(var0), m_2308(var0), var3);
      }

      float var4 = ((float)(System.currentTimeMillis() % f_5951) / f_5952 + var2) % 1.0F;
      if (var4 < 0.0F) {
         var4++;
      }

      float var5 = f_5953 - f_5954 * (float)Math.cos(var4 * f_5955 * f_5956);
      int var6 = m_2312(var0, var1, var5);
      return m_2303(m_2309(var6), m_2299(var6), m_2308(var6), var3);
   }

   public static int m_2308(int var0) {
      return var0 & 0xFF;
   }

   public static int m_2309(int var0) {
      return var0 >> 16 & 0xFF;
   }

   public static int m_2310(int var0, int var1, int var2) {
      return f_5979 | var0 << 16 | var1 << 8 | var2;
   }

   public static Component m_2311(String var0) {
      MutableComponent var1 = Component.empty();

      for (int var2 = 0; var2 < var0.length(); var2++) {
         char var3 = var0.charAt(var2);
         MutableComponent var4 = Component.literal(String.valueOf(var3)).setStyle(Style.EMPTY.withColor(new Color(m_2304(var2)).getRGB()));
         var1.append(var4);
      }

      return var1;
   }

   public static int m_2312(int var0, int var1, float var2) {
      float[] var3 = m_2301(var0);
      float[] var4 = m_2301(var1);
      return m_2303(
         (int)Class_3VHxwfI2NZKoxzIi.m_1309(var3[0] * f_5963, var4[0] * f_5964, var2),
         (int)Class_3VHxwfI2NZKoxzIi.m_1309(var3[1] * f_5965, var4[1] * f_5966, var2),
         (int)Class_3VHxwfI2NZKoxzIi.m_1309(var3[2] * f_5967, var4[2] * f_5968, var2),
         (int)Class_3VHxwfI2NZKoxzIi.m_1309(var3[3] * f_5969, var4[3] * f_5970, var2)
      );
   }

   public static int m_2313(int var0, float var1) {
      int var2 = (int)(m_2309(var0) * var1);
      int var3 = (int)(m_2299(var0) * var1);
      int var4 = (int)(m_2308(var0) * var1);
      int var5 = (int)(m_2297(var0) * var1);
      return m_2303(var2, var3, var4, var5);
   }
}
