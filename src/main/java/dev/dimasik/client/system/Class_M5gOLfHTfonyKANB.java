package dev.dimasik.client.system;

import lombok.Generated;

public final class Class_M5gOLfHTfonyKANB {
   private static final double f_11114 = 255.0;
   private static final float f_11115 = 0.74F;
   private static final float f_11116 = 6.5F;
   private static final float f_11117 = 1.35F;
   private static final float f_11118 = 1.05F;
   private static final float f_11119 = 0.75F;
   private static final float f_11120 = 0.2F;
   private static final float f_11121 = 14.0F;
   private static final float f_11122 = 185.0F;
   private static final float f_11123 = 1.05F;
   private static final String f_11124 = "This is a utility class and cannot be instantiated";

   @Generated
   private Class_M5gOLfHTfonyKANB() {
      throw new UnsupportedOperationException(f_11124);
   }

   private static int m_3875(int var0, int var1, int var2, int var3, float var4) {
      return Class_BftdentXEtGbugJw.m_2303(var0, var1, var2, var3 * Math.clamp(var4, 0.0F, 1.0F));
   }

   public static void m_3876(float var0, float var1) {
      Class_Ssh31B3ljfKeWsvS.m_4817(0.0F, 0.0F, var0, var1, 0.0F, m_3880(Class_y3cvEHXTSEF5dp8q.WINDOW_BACKGROUND, 1.0F, 38));
   }

   private static int m_3877(Class_y3cvEHXTSEF5dp8q var0, float var1) {
      int var2 = Class_LsNSRvPKh5AwfAUe.m_3820(var0);
      return Class_BftdentXEtGbugJw.m_2303(
         Class_BftdentXEtGbugJw.m_2309(var2),
         Class_BftdentXEtGbugJw.m_2299(var2),
         Class_BftdentXEtGbugJw.m_2308(var2),
         Class_BftdentXEtGbugJw.m_2297(var2) * Math.clamp(var1, 0.0F, 1.0F)
      );
   }

   public static void m_3878(
      Class_pgtjhKJjK46C8cZl var0, float var1, float var2, float var3, float var4, float var5, float var6, boolean var7, float var8, float var9, float var10
   ) {
      int var11 = Class_BftdentXEtGbugJw.m_2303(232, 116, 134, f_11114);
      int var12 = Class_BftdentXEtGbugJw.m_2302(
         var7 ? m_3875(220, 227, 239, 185, var8) : m_3875(225, 216, 220, 188, var8), m_3875(244, 220, 225, 210, var8), var9
      );
      int var13 = Class_BftdentXEtGbugJw.m_2302(
         var7 ? m_3877(Class_y3cvEHXTSEF5dp8q.OUTLINE, var8) : m_3875(199, 119, 133, 52, var8), Class_BftdentXEtGbugJw.m_2306(var11, f_11115 * var8), var9
      );
      int var14 = Class_BftdentXEtGbugJw.m_2302(
         var7 ? m_3877(Class_y3cvEHXTSEF5dp8q.WINDOW_BACKGROUND, var8) : m_3875(18, 14, 18, 178, var8), m_3875(126, 48, 64, 174, var8), var9
      );
      float var15 = f_11116 * var10;
      float var16 = f_11117 * var10;
      float var17 = f_11118 * var10;
      var0.m_8202(var1, var2, var3, var4, var5, var6, var15, var16, var12);
      var0.m_8198(var1, var2, Math.max(0.0F, var3 - var17), var4 + var17, var5, var6, var15 - f_11119 * var10, var16 + f_11120 * var10, var13);
      var0.m_8198(var1, var2, var3, var4, var5, var6, var15, var16, var14);
   }

   public static void m_3879(float var0, float var1, float var2, float var3, float var4) {
      Class_Ssh31B3ljfKeWsvS.m_4858(
         var0 - var2, var1 - var2, var2 * 2.0F, var2 * 2.0F, f_11121, var2, Class_BftdentXEtGbugJw.m_2303(220, 227, 239, f_11122 * var4)
      );
      Class_Ssh31B3ljfKeWsvS.m_4817(var0 - var2, var1 - var2, var2 * 2.0F, var2 * 2.0F, var2, m_3877(Class_y3cvEHXTSEF5dp8q.WINDOW_BACKGROUND, var4));
      Class_Ssh31B3ljfKeWsvS.m_4854(var0 - var2, var1 - var2, var2 * 2.0F, var2 * 2.0F, f_11123 * var3, var2, m_3877(Class_y3cvEHXTSEF5dp8q.OUTLINE, var4));
   }

   private static int m_3880(Class_y3cvEHXTSEF5dp8q var0, float var1, int var2) {
      int var3 = Class_LsNSRvPKh5AwfAUe.m_3820(var0);
      return Class_BftdentXEtGbugJw.m_2303(
         Class_BftdentXEtGbugJw.m_2309(var3), Class_BftdentXEtGbugJw.m_2299(var3), Class_BftdentXEtGbugJw.m_2308(var3), var2 * Math.clamp(var1, 0.0F, 1.0F)
      );
   }
}
