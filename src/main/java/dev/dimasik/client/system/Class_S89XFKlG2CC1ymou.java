package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import org.joml.Matrix4f;
import org.joml.Vector4i;

public final class Class_S89XFKlG2CC1ymou {
   public static final Identifier f_13241 = Identifier.fromNamespaceAndPath(Class_S89XFKlG2CC1ymou.f_13292, Class_S89XFKlG2CC1ymou.f_13293);
   private static final Identifier f_13242 = Identifier.fromNamespaceAndPath(Class_S89XFKlG2CC1ymou.f_13294, Class_S89XFKlG2CC1ymou.f_13295);
   private static final int f_13243 = -2580225;
   private static final int f_13244 = -4690198;
   private static Class_S89XFKlG2CC1ymou.tlOLVkvj4RHiarzV f_13245;
   private static long f_13246 = Class_S89XFKlG2CC1ymou.f_13296;
   private static long f_13247;
   private static float f_13248;
   private static final float f_13249 = 0.001F;
   private static final float f_13250 = 0.5F;
   private static final float f_13251 = 0.46F;
   private static final float f_13252 = 68.0F;
   private static final float f_13253 = 1000.0F;
   private static final float f_13254 = 0.1F;
   private static final float f_13255 = -10.0F;
   private static final float f_13256 = 0.001F;
   private static final float f_13257 = 0.5F;
   private static final String f_13258 = "P";
   private static final int f_13259 = -2580225;
   private static final int f_13260 = -4690198;
   private static final float f_13261 = 90.0F;
   private static final float f_13262 = 1050.0F;
   private static final float f_13263 = 860.0F;
   private static final float f_13264 = 620.0F;
   private static final float f_13265 = 1530.0F;
   private static final float f_13266 = 850.0F;
   private static final float f_13267 = 720.0F;
   private static final float f_13268 = 420.0F;
   private static final float f_13269 = 0.001F;
   private static final float f_13270 = 224.0F;
   private static final float f_13271 = 8.0F;
   private static final float f_13272 = 0.5F;
   private static final float f_13273 = 0.5F;
   private static final float f_13274 = 43.0F;
   private static final float f_13275 = 0.5F;
   private static final int f_13276 = -2580225;
   private static final int f_13277 = -4690198;
   private static final int f_13278 = 587202559;
   private static final int f_13279 = 1242567450;
   private static final float f_13280 = 1.5F;
   private static final float f_13281 = 0.35F;
   private static final float f_13282 = 0.5F;
   private static final float f_13283 = 0.5F;
   private static final float f_13284 = 0.96F;
   private static final float f_13285 = 0.96F;
   private static final int f_13286 = -16777216;
   private static final float f_13287 = 3.0F;
   private static final float f_13288 = 6.0F;
   private static final float f_13289 = 15.0F;
   private static final float f_13290 = 10.0F;
   private static final int f_13291 = 16777215;
   private static final String f_13292 = "dimasik";
   private static final String f_13293 = "images/mainmenu/gavs_loading_background.png";
   private static final String f_13294 = "dimasik";
   private static final String f_13295 = "fonts/icons.png";
   private static final long f_13296 = Long.MIN_VALUE;

   private static float m_4691(float var0) {
      float var1 = Mth.clamp(var0, 0.0F, 1.0F);
      return var1 * var1 * (f_13287 - 2.0F * var1);
   }

   private static float m_4692(float var0) {
      float var1 = Mth.clamp(var0, 0.0F, 1.0F);
      return var1 * var1 * var1 * (var1 * (var1 * f_13288 - f_13289) + f_13290);
   }

   private static void m_4693(float var0, float var1, float var2, long var3, float var5) {
      Class_jZQ0pP9BTU3L7miy var6 = Class_y1y6QpONhWEUIdEB.m_9591();
      float var7 = var6.m_7383().m_2150(80, var2);
      float var8 = var0 - var7 * f_13257;
      float var9 = Class_Ssh31B3ljfKeWsvS.m_4863(var6, f_13258, var1, var2);
      int var10 = m_4700(Class_y3cvEHXTSEF5dp8q.MAIN, f_13259);
      int var11 = m_4700(Class_y3cvEHXTSEF5dp8q.MAIN_TWO, f_13260);
      float var12 = m_4692(Mth.clamp(((float)var3 - f_13261) / f_13262, 0.0F, 1.0F));
      float var13 = m_4692(Mth.clamp(((float)var3 - f_13263) / f_13264, 0.0F, 1.0F));
      float var14 = m_4692(Mth.clamp(((float)var3 - f_13265) / f_13266, 0.0F, 1.0F));
      Class_Ssh31B3ljfKeWsvS.m_4856(var6, 80, var8, var9, var2, m_4694(var10, var5), var11, var12, var13, var14);
   }

   private Class_S89XFKlG2CC1ymou() {
   }

   private static int m_4694(int var0, float var1) {
      int var2 = Math.round((var0 >>> 24 & 0xFF) * Mth.clamp(var1, 0.0F, 1.0F));
      return var0 & f_13291 | var2 << 24;
   }

   public static void m_4695() {
      Class_S89XFKlG2CC1ymou.tlOLVkvj4RHiarzV var0 = f_13245;
      f_13245 = null;
      if (var0 != null) {
         Minecraft var1 = Minecraft.getInstance();
         int var2 = var1.getWindow().getScreenWidth();
         int var3 = var1.getWindow().getScreenHeight();
         if (var2 > 0 && var3 > 0) {
            m_4697(var0);
            if (!(var0.alpha <= f_13249)) {
               float var4 = (float)var2 / var0.scaledWidth;
               float var5 = (float)var3 / var0.scaledHeight;
               float var6 = Math.min(var4, var5);
               float var7 = var2 * f_13250;
               float var8 = var3 * f_13251;
               float var9 = f_13252 * var6;
               long var10 = Math.max(0L, var0.now - var0.session);
               Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
               Class_Ssh31B3ljfKeWsvS.m_4830();
               Class_Ssh31B3ljfKeWsvS.m_4844();
               m_4693(var7, var8, var9, var10, var0.alpha);
               m_4699(var7, var8, var9, var4, var5, var10, var0.alpha);
               Class_Ssh31B3ljfKeWsvS.m_4830();
               Class_Ssh31B3ljfKeWsvS.m_4844();
               Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
            }
         }
      }
   }

   public static void m_4696(TextureManager var0) {
      var0.registerAndLoad(f_13241, new Class_djbaMMAd0d0WLgAu(f_13241));
      var0.registerAndLoad(f_13242, new Class_djbaMMAd0d0WLgAu(f_13242, true));
      Class_Ssh31B3ljfKeWsvS.m_4799(Class_vTZKxPf6p5PqMnWH.m_8698());
   }

   private static void m_4697(Class_S89XFKlG2CC1ymou.tlOLVkvj4RHiarzV var0) {
      if (f_13246 != var0.session) {
         f_13246 = var0.session;
         f_13247 = var0.now;
         f_13248 = 0.0F;
      }

      float var1 = Mth.clamp((float)(var0.now - f_13247) / f_13253, 0.0F, f_13254);
      f_13247 = var0.now;
      float var2 = 1.0F - (float)Math.exp(f_13255 * var1);
      f_13248 = f_13248 + (var0.progress - f_13248) * var2;
      if (var0.progress >= 1.0F && 1.0F - f_13248 < f_13256) {
         f_13248 = 1.0F;
      }
   }

   public static void m_4698(long var0, long var2, int var4, int var5, float var6, float var7) {
      f_13245 = new Class_S89XFKlG2CC1ymou.tlOLVkvj4RHiarzV(
         var0, var2, Math.max(1, var4), Math.max(1, var5), Mth.clamp(var6, 0.0F, 1.0F), Mth.clamp(var7, 0.0F, 1.0F)
      );
   }

   private static void m_4699(float var0, float var1, float var2, float var3, float var4, long var5, float var7) {
      float var8 = m_4691(Mth.clamp(((float)var5 - f_13267) / f_13268, 0.0F, 1.0F));
      float var9 = var7 * var8;
      if (!(var9 <= f_13269)) {
         float var10 = f_13270 * var3;
         float var11 = f_13271 * var4;
         float var12 = var0 - var10 * f_13272;
         float var13 = var1 + var2 * f_13273 + f_13274 * var4;
         float var14 = Math.max(1.0F, 1.0F * Math.min(var3, var4));
         float var15 = var11 * f_13275;
         int var16 = m_4700(Class_y3cvEHXTSEF5dp8q.MAIN, f_13276);
         int var17 = m_4700(Class_y3cvEHXTSEF5dp8q.MAIN_TWO, f_13277);
         Class_Ssh31B3ljfKeWsvS.m_4817(var12 - var14, var13 - var14, var10 + var14 * 2.0F, var11 + var14 * 2.0F, var15 + var14, m_4694(f_13278, var9));
         Class_Ssh31B3ljfKeWsvS.m_4817(var12, var13, var10, var11, var15, m_4694(f_13279, var9));
         float var18 = Math.max(1.0F, f_13280 * Math.min(var3, var4));
         float var19 = Math.max(0.0F, var10 - var18 * 2.0F);
         float var20 = Math.max(1.0F, var11 - var18 * 2.0F);
         float var21 = var19 * Mth.clamp(f_13248, 0.0F, 1.0F);
         if (var21 > f_13281) {
            float var22 = Math.min(var20 * f_13282, var21 * f_13283);
            int var23 = m_4694(var16, var9 * f_13284);
            int var24 = m_4694(var17, var9 * f_13285);
            Class_Ssh31B3ljfKeWsvS.m_4843(var12 + var18, var13 + var18, var21, var20, var22, new Vector4i(var23, var24, var23, var24));
         }
      }
   }

   private static int m_4700(Class_y3cvEHXTSEF5dp8q var0, int var1) {
      try {
         DimasikClient var2 = DimasikClient.m_9057();
         if (var2 != null && var2.m_9049() != null && var2.m_9049().m_2812() != null) {
            return Class_LsNSRvPKh5AwfAUe.m_3820(var0) | f_13286;
         }
      } catch (RuntimeException var3) {
      }

      return var1;
   }

   private record tlOLVkvj4RHiarzV(long session, long now, int scaledWidth, int scaledHeight, float alpha, float progress) {
   }
}
