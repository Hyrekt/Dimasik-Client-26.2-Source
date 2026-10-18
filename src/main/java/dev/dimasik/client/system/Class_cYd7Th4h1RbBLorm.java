package dev.dimasik.client.system;

import net.minecraft.resources.Identifier;

public enum Class_cYd7Th4h1RbBLorm {
   CLASSIC("classic", "Классика", false, false, 175, 210, 255, 232, 64, 64);

   private final String f_18293;
   private final String f_18294;
   private final boolean f_18295;
   private final boolean f_18296;
   private final int f_18297;
   private final int f_18298;
   private final int f_18299;
   private final int f_18300;
   private final int f_18301;
   private final int f_18302;

   Class_cYd7Th4h1RbBLorm(String var3, String var4, boolean var5, boolean var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      this.f_18293 = var3;
      this.f_18294 = var4;
      this.f_18295 = var5;
      this.f_18296 = var6;
      this.f_18297 = var7;
      this.f_18298 = var8;
      this.f_18299 = var9;
      this.f_18300 = var10;
      this.f_18301 = var11;
      this.f_18302 = var12;
   }

   public String m_6196() {
      return this.f_18293;
   }

   public String m_6197() {
      return this.f_18294;
   }

   public boolean m_6198() {
      return this.f_18295;
   }

   public boolean m_6199() {
      return this.f_18296;
   }

   public Identifier m_6200() {
      return this == CLASSIC ? Class_wHRRCm2tlLY7DN4I.m_9311("mainmenu/legacy/img") : Class_wHRRCm2tlLY7DN4I.m_9311("mainmenu/themes/" + this.f_18293);
   }

   public int m_6201(float var1) {
      return Class_BftdentXEtGbugJw.m_2303(255, 255, 255, (this.f_18295 ? 255.0F : 40.4F) * var1);
   }

   public int m_6202(float var1) {
      return this.f_18296 ? Class_BftdentXEtGbugJw.m_2303(18, 22, 28, 235.0F * var1) : Class_BftdentXEtGbugJw.m_2303(224, 243, 252, 225.0F * var1);
   }

   public int m_6203(float var1) {
      return this.f_18296 ? Class_BftdentXEtGbugJw.m_2303(42, 48, 58, 230.0F * var1) : Class_BftdentXEtGbugJw.m_2303(87, 90, 105, 220.0F * var1);
   }

   public int m_6204(float var1) {
      return this.f_18296 ? Class_BftdentXEtGbugJw.m_2303(36, 42, 52, 230.0F * var1) : Class_BftdentXEtGbugJw.m_2303(96, 101, 116, 220.0F * var1);
   }

   public int m_6205(boolean var1, float var2) {
      float var3 = (this.f_18296 ? 228.0F : 155.0F) * var2;
      return var1 ? Class_BftdentXEtGbugJw.m_2303(25, 27, 35, var3) : Class_BftdentXEtGbugJw.m_2303(15, 16, 21, var3);
   }

   public int m_6206(float var1, float var2) {
      float var3 = (this.f_18296 ? 165.0F : 58.0F) * var1 * var2;
      return Class_BftdentXEtGbugJw.m_2303(m_6215(255, this.f_18297, 0.35F), m_6215(255, this.f_18298, 0.35F), m_6215(255, this.f_18299, 0.35F), var3);
   }

   public int m_6207(float var1, float var2) {
      return Class_BftdentXEtGbugJw.m_2303(7, 9, 14, (this.f_18296 ? 18.0F : 42.0F) * var1 * var2);
   }

   public int m_6208(float var1) {
      return this.f_18296 ? Class_BftdentXEtGbugJw.m_2303(198, 204, 214, 255.0F * var1) : Class_BftdentXEtGbugJw.m_2303(87, 90, 105, 255.0F * var1);
   }

   public int m_6209(float var1) {
      return Class_BftdentXEtGbugJw.m_2303(225, 230, 240, 255.0F * var1);
   }

   public int m_6210(float var1) {
      return this.f_18296
         ? Class_BftdentXEtGbugJw.m_2303(m_6215(150, this.f_18297, 0.45F), m_6215(155, this.f_18298, 0.45F), m_6215(165, this.f_18299, 0.45F), 255.0F * var1)
         : Class_BftdentXEtGbugJw.m_2303(52, 54, 62, 255.0F * var1);
   }

   public int m_6211(float var1) {
      return Class_BftdentXEtGbugJw.m_2303(this.f_18297, this.f_18298, this.f_18299, 255.0F * var1);
   }

   public int m_6212(float var1) {
      return this.f_18296
         ? Class_BftdentXEtGbugJw.m_2303(this.f_18300, this.f_18301, this.f_18302, 235.0F * var1)
         : Class_BftdentXEtGbugJw.m_2303(52, 54, 62, 255.0F * var1);
   }

   public int m_6213(float var1) {
      return Class_BftdentXEtGbugJw.m_2303(Math.min(255, this.f_18300 + 20), Math.min(255, this.f_18301 + 12), Math.min(255, this.f_18302 + 12), 255.0F * var1);
   }

   public static Class_cYd7Th4h1RbBLorm m_6214(String var0) {
      if (var0 != null && !var0.isBlank() && !var0.equalsIgnoreCase("wheat")) {
         for (Class_cYd7Th4h1RbBLorm var4 : values()) {
            if (var4.f_18293.equalsIgnoreCase(var0)) {
               return var4;
            }
         }

         return CLASSIC;
      } else {
         return CLASSIC;
      }
   }

   private static int m_6215(int var0, int var1, float var2) {
      return Math.round(var0 + (var1 - var0) * var2);
   }
}
