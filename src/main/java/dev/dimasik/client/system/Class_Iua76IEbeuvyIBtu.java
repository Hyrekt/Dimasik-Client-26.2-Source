package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.BufferBuilder;
import net.minecraft.util.Mth;
import org.joml.Matrix3f;
import org.joml.Matrix4f;

public final class Class_Iua76IEbeuvyIBtu {
   private static final int f_9163 = 256;
   private static final int f_9164 = 18;
   private static final float f_9165 = -0.503125F;
   private static final float f_9166 = (float)Math.sqrt(Class_Iua76IEbeuvyIBtu.f_9300) + Class_Iua76IEbeuvyIBtu.f_9301;
   private static final float f_9167 = 0.286F;
   private static final float[] f_9168 = new float[257];
   private static final float[] f_9169 = new float[257];
   private static final float[] f_9170 = new float[19];
   private static final float[] f_9171 = new float[19];
   private static final float f_9172 = 0.286F;
   private static final int f_9173 = 16777215;
   private static final int f_9174 = 16777215;
   private static final float f_9175 = 0.07F;
   private static final float f_9176 = 256.0F;
   private static final float f_9177 = 256.0F;
   private static final float f_9178 = -0.769105F;
   private static final float f_9179 = 0.286F;
   private static final float f_9180 = 0.286F;
   private static final float f_9181 = 0.035F;
   private static final float f_9182 = 0.58F;
   private static final float f_9183 = -0.769105F;
   private static final float f_9184 = 0.286F;
   private static final float f_9185 = 0.286F;
   private static final float f_9186 = 0.035F;
   private static final float f_9187 = 0.58F;
   private static final float f_9188 = -0.503125F;
   private static final float f_9189 = 0.286F;
   private static final float f_9190 = 0.286F;
   private static final float f_9191 = 0.985F;
   private static final float f_9192 = -0.503125F;
   private static final float f_9193 = 0.286F;
   private static final float f_9194 = 0.286F;
   private static final float f_9195 = 0.985F;
   private static final float f_9196 = 0.055F;
   private static final float f_9197 = 0.085F;
   private static final float f_9198 = 0.235F;
   private static final float f_9199 = 0.155F;
   private static final float f_9200 = -0.789125F;
   private static final float f_9201 = 0.286F;
   private static final float f_9202 = -0.789125F;
   private static final float f_9203 = 0.286F;
   private static final float f_9204 = 0.42F;
   private static final float f_9205 = 0.68F;
   private static final float f_9206 = 256.0F;
   private static final float f_9207 = 256.0F;
   private static final float f_9208 = 0.286F;
   private static final float f_9209 = 0.286F;
   private static final float f_9210 = 0.055F;
   private static final float f_9211 = 0.48F;
   private static final float f_9212 = 0.286F;
   private static final float f_9213 = 0.286F;
   private static final float f_9214 = 0.055F;
   private static final float f_9215 = 0.48F;
   private static final float f_9216 = 0.286F;
   private static final float f_9217 = 0.286F;
   private static final float f_9218 = 0.82F;
   private static final float f_9219 = 0.286F;
   private static final float f_9220 = 0.286F;
   private static final float f_9221 = 0.82F;
   private static final float f_9222 = 0.972F;
   private static final float f_9223 = 1.052F;
   private static final float f_9224 = 256.0F;
   private static final float f_9225 = 256.0F;
   private static final float f_9226 = -0.500625F;
   private static final float f_9227 = -1.0F;
   private static final float f_9228 = 1.1800001F;
   private static final float f_9229 = 0.2F;
   private static final float f_9230 = -0.500625F;
   private static final float f_9231 = -1.0F;
   private static final float f_9232 = 1.1800001F;
   private static final float f_9233 = 0.2F;
   private static final float f_9234 = -0.500625F;
   private static final float f_9235 = -0.045F;
   private static final float f_9236 = 1.9200001F;
   private static final float f_9237 = -0.500625F;
   private static final float f_9238 = -0.045F;
   private static final float f_9239 = 1.9200001F;
   private static final float f_9240 = 1.072F;
   private static final float f_9241 = 0.07F;
   private static final float f_9242 = 1.36F;
   private static final float f_9243 = 0.38F;
   private static final float f_9244 = 256.0F;
   private static final float f_9245 = 256.0F;
   private static final float f_9246 = -0.77210504F;
   private static final float f_9247 = 0.286F;
   private static final float f_9248 = 0.286F;
   private static final float f_9249 = 2.035F;
   private static final float f_9250 = 0.1F;
   private static final float f_9251 = -0.77210504F;
   private static final float f_9252 = 0.286F;
   private static final float f_9253 = 0.286F;
   private static final float f_9254 = 2.035F;
   private static final float f_9255 = 0.1F;
   private static final float f_9256 = -0.504625F;
   private static final float f_9257 = 0.286F;
   private static final float f_9258 = 0.286F;
   private static final float f_9259 = 2.325F;
   private static final float f_9260 = -0.504625F;
   private static final float f_9261 = 0.286F;
   private static final float f_9262 = 0.286F;
   private static final float f_9263 = 2.325F;
   private static final float f_9264 = 0.97F;
   private static final float f_9265 = 1.075F;
   private static final float f_9266 = 1.02F;
   private static final float f_9267 = 0.44F;
   private static final float f_9268 = 0.94F;
   private static final float f_9269 = 0.34F;
   private static final float f_9270 = 256.0F;
   private static final float f_9271 = 256.0F;
   private static final float f_9272 = -0.501625F;
   private static final float f_9273 = -1.0F;
   private static final float f_9274 = 2.02F;
   private static final float f_9275 = 0.42F;
   private static final float f_9276 = -0.501625F;
   private static final float f_9277 = -1.0F;
   private static final float f_9278 = 2.02F;
   private static final float f_9279 = 0.42F;
   private static final float f_9280 = -0.501625F;
   private static final float f_9281 = -0.045F;
   private static final float f_9282 = 2.72F;
   private static final float f_9283 = -0.501625F;
   private static final float f_9284 = -0.045F;
   private static final float f_9285 = 2.72F;
   private static final float f_9286 = -0.500125F;
   private static final float f_9287 = 0.122F;
   private static final float f_9288 = -0.500125F;
   private static final float f_9289 = 2.035F;
   private static final float f_9290 = -0.500125F;
   private static final float f_9291 = 2.035F;
   private static final float f_9292 = 2.995F;
   private static final float f_9293 = 0.18F;
   private static final float f_9294 = 2.995F;
   private static final float f_9295 = 0.18F;
   private static final float f_9296 = 1.0E-6F;
   private static final float f_9297 = 255.0F;
   private static final float f_9298 = 255.0F;
   private static final float f_9299 = 255.0F;
   private static final double f_9300 = 0.17626953F;
   private static final float f_9301 = 0.14F;
   private static final float f_9302 = (float) (Math.PI * 2);
   private static final float f_9303 = 256.0F;
   private static final float f_9304 = (float) (Math.PI * 2);
   private static final float f_9305 = 18.0F;

   static {
      for (int var0 = 0; var0 <= 256; var0++) {
         float var1 = f_9302 * var0 / f_9303;
         f_9169[var0] = (float)Math.sin(var1);
         f_9168[var0] = (float)Math.cos(var1);
      }

      for (int var2 = 0; var2 <= 18; var2++) {
         float var3 = f_9304 * var2 / f_9305;
         f_9171[var2] = (float)Math.sin(var3);
         f_9170[var2] = (float)Math.cos(var3);
      }
   }

   private static int m_3146(BufferBuilder var0, Matrix4f var1, Matrix3f var2, int var3, int var4, float var5, float var6, float var7) {
      int var8 = var3 >> 16 & 0xFF;
      int var9 = var3 >> 8 & 0xFF;
      int var10 = var3 & 0xFF;
      int var11 = var4 >> 16 & 0xFF;
      int var12 = var4 >> 8 & 0xFF;
      int var13 = var4 & 0xFF;
      float var14 = f_9166 * f_9264;
      float var15 = f_9166 * f_9265;
      float var16 = f_9166 * f_9266;
      float var17 = f_9166 * f_9267;
      float var18 = var5 * f_9268;
      float var19 = var5 * f_9269;
      int var20 = 0;

      for (int var21 = 0; var21 < 256; var21++) {
         int var22 = var21 + 1;
         float var23 = var21 / f_9270;
         float var24 = var22 / f_9271;
         var20 += m_3151(
            var0,
            var1,
            var2,
            var6,
            var7,
            f_9168[var21] * var14,
            f_9272,
            f_9169[var21] * var14,
            0.0F,
            f_9273,
            0.0F,
            var23,
            f_9274,
            var8,
            var9,
            var10,
            var18 * f_9275,
            f_9168[var22] * var14,
            f_9276,
            f_9169[var22] * var14,
            0.0F,
            f_9277,
            0.0F,
            var24,
            f_9278,
            var8,
            var9,
            var10,
            var18 * f_9279,
            f_9168[var22] * var15,
            f_9280,
            f_9169[var22] * var15,
            f_9168[var22],
            f_9281,
            f_9169[var22],
            var24,
            f_9282,
            var11,
            var12,
            var13,
            var18,
            f_9168[var21] * var15,
            f_9283,
            f_9169[var21] * var15,
            f_9168[var21],
            f_9284,
            f_9169[var21],
            var23,
            f_9285,
            var11,
            var12,
            var13,
            var18
         );

         for (int var25 = 0; var25 < 18; var25++) {
            float var26 = f_9171[var25];
            float var27 = f_9170[var25];
            float var28 = var16 + var27 * var17;
            float var29 = f_9286 + var26 * f_9287;
            var20 += m_3151(
               var0,
               var1,
               var2,
               var6,
               var7,
               f_9168[var21] * var16,
               f_9288,
               f_9169[var21] * var16,
               f_9168[var21],
               0.0F,
               f_9169[var21],
               var23,
               f_9289,
               var8,
               var9,
               var10,
               var19,
               f_9168[var22] * var16,
               f_9290,
               f_9169[var22] * var16,
               f_9168[var22],
               0.0F,
               f_9169[var22],
               var24,
               f_9291,
               var8,
               var9,
               var10,
               var19,
               f_9168[var22] * var28,
               var29,
               f_9169[var22] * var28,
               f_9168[var22] * var27,
               var26,
               f_9169[var22] * var27,
               var24,
               f_9292,
               var11,
               var12,
               var13,
               var19 * f_9293,
               f_9168[var21] * var28,
               var29,
               f_9169[var21] * var28,
               f_9168[var21] * var27,
               var26,
               f_9169[var21] * var27,
               var23,
               f_9294,
               var11,
               var12,
               var13,
               var19 * f_9295
            );
         }
      }

      return var20;
   }

   private static void m_3147(
      BufferBuilder var0,
      Matrix4f var1,
      Matrix3f var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      int var13,
      int var14,
      int var15,
      float var16
   ) {
      float var17 = var5 * var3;
      float var18 = -var6 * var4;
      float var19 = var7 * var3;
      float var20 = var8;
      float var21 = -var9;
      float var22 = var10;
      float var23 = var2.m00() * var20 + var2.m10() * var21 + var2.m20() * var22;
      float var24 = var2.m01() * var20 + var2.m11() * var21 + var2.m21() * var22;
      float var25 = var2.m02() * var20 + var2.m12() * var21 + var2.m22() * var22;
      float var26 = var23 * var23 + var24 * var24 + var25 * var25;
      float var27 = var26 <= f_9296 ? 1.0F : (float)(1.0 / Math.sqrt(var26));
      float var28 = Mth.clamp(var16, 0.0F, 1.0F);
      var0.addVertex(var1, var17, var18, var19)
         .setUv(var11, var12)
         .setColor(var13 / f_9297, var14 / f_9298, var15 / f_9299, var28)
         .setNormal(var23 * var27, var24 * var27, var25 * var27);
   }

   public static int m_3148(int[] var0, float var1) {
      float var2 = var1 - (float)Math.floor(var1);
      float var3 = var2 * (var0.length - 1);
      int var4 = Math.min(var0.length - 2, Math.max(0, (int)Math.floor(var3)));
      return m_3152(var0[var4] & f_9173, var0[var4 + 1] & f_9174, var3 - var4);
   }

   public static int m_3149(int var0, float var1) {
      float var2 = Mth.clamp(var1, 0.0F, 1.0F);
      int var3 = var0 >> 16 & 0xFF;
      int var4 = var0 >> 8 & 0xFF;
      int var5 = var0 & 0xFF;
      var3 = Math.min(255, Math.round(var3 + (255 - var3) * var2));
      var4 = Math.min(255, Math.round(var4 + (255 - var4) * var2));
      var5 = Math.min(255, Math.round(var5 + (255 - var5) * var2));
      return var3 << 16 | var4 << 8 | var5;
   }

   public static float m_3150() {
      return f_9166;
   }

   private static int m_3151(
      BufferBuilder var0,
      Matrix4f var1,
      Matrix3f var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      int var13,
      int var14,
      int var15,
      float var16,
      float var17,
      float var18,
      float var19,
      float var20,
      float var21,
      float var22,
      float var23,
      float var24,
      int var25,
      int var26,
      int var27,
      float var28,
      float var29,
      float var30,
      float var31,
      float var32,
      float var33,
      float var34,
      float var35,
      float var36,
      int var37,
      int var38,
      int var39,
      float var40,
      float var41,
      float var42,
      float var43,
      float var44,
      float var45,
      float var46,
      float var47,
      float var48,
      int var49,
      int var50,
      int var51,
      float var52
   ) {
      m_3147(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16);
      m_3147(var0, var1, var2, var3, var4, var17, var18, var19, var20, var21, var22, var23, var24, var25, var26, var27, var28);
      m_3147(var0, var1, var2, var3, var4, var29, var30, var31, var32, var33, var34, var35, var36, var37, var38, var39, var40);
      m_3147(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16);
      m_3147(var0, var1, var2, var3, var4, var29, var30, var31, var32, var33, var34, var35, var36, var37, var38, var39, var40);
      m_3147(var0, var1, var2, var3, var4, var41, var42, var43, var44, var45, var46, var47, var48, var49, var50, var51, var52);
      return 6;
   }

   public static int m_3152(int var0, int var1, float var2) {
      var2 = Mth.clamp(var2, 0.0F, 1.0F);
      int var3 = var0 >> 16 & 0xFF;
      int var4 = var0 >> 8 & 0xFF;
      int var5 = var0 & 0xFF;
      int var6 = var1 >> 16 & 0xFF;
      int var7 = var1 >> 8 & 0xFF;
      int var8 = var1 & 0xFF;
      int var9 = Math.round(var3 + (var6 - var3) * var2);
      int var10 = Math.round(var4 + (var7 - var4) * var2);
      int var11 = Math.round(var5 + (var8 - var5) * var2);
      return var9 << 16 | var10 << 8 | var11;
   }

   public static int m_3153(BufferBuilder var0, Matrix4f var1, Matrix3f var2, int var3, int var4, float var5, float var6, float var7) {
      int var8 = 0;
      var8 += m_3159(var0, var1, var2, var3, var4, var5, var6, var7);
      var8 += m_3156(var0, var1, var2, var3, var4, var5, false, var6, var7);
      return var8 + m_3157(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   private Class_Iua76IEbeuvyIBtu() {
   }

   private static int m_3154(BufferBuilder var0, Matrix4f var1, Matrix3f var2, int var3, int var4, float var5, float var6, float var7) {
      int var8 = var3 >> 16 & 0xFF;
      int var9 = var3 >> 8 & 0xFF;
      int var10 = var3 & 0xFF;
      int var11 = var4 >> 16 & 0xFF;
      int var12 = var4 >> 8 & 0xFF;
      int var13 = var4 & 0xFF;
      float var14 = f_9166 * f_9240;
      float var15 = f_9166 * f_9241 * f_9242;
      float var16 = var5 * f_9243;
      int var17 = 0;

      for (int var18 = 0; var18 < 256; var18++) {
         int var19 = var18 + 1;
         float var20 = var18 / f_9244;
         float var21 = var19 / f_9245;
         var17 += m_3151(
            var0,
            var1,
            var2,
            var6,
            var7,
            f_9168[var18] * var15,
            f_9246,
            f_9169[var18] * var15,
            f_9168[var18] * f_9247,
            -var14,
            f_9169[var18] * f_9248,
            var20,
            f_9249,
            var8,
            var9,
            var10,
            var16 * f_9250,
            f_9168[var19] * var15,
            f_9251,
            f_9169[var19] * var15,
            f_9168[var19] * f_9252,
            -var14,
            f_9169[var19] * f_9253,
            var21,
            f_9254,
            var8,
            var9,
            var10,
            var16 * f_9255,
            f_9168[var19] * var14,
            f_9256,
            f_9169[var19] * var14,
            f_9168[var19] * f_9257,
            -var14,
            f_9169[var19] * f_9258,
            var21,
            f_9259,
            var11,
            var12,
            var13,
            var16,
            f_9168[var18] * var14,
            f_9260,
            f_9169[var18] * var14,
            f_9168[var18] * f_9261,
            -var14,
            f_9169[var18] * f_9262,
            var20,
            f_9263,
            var11,
            var12,
            var13,
            var16
         );
      }

      return var17;
   }

   public static float m_3155() {
      return f_9172;
   }

   private static int m_3156(BufferBuilder var0, Matrix4f var1, Matrix3f var2, int var3, int var4, float var5, boolean var6, float var7, float var8) {
      int var9 = var3 >> 16 & 0xFF;
      int var10 = var3 >> 8 & 0xFF;
      int var11 = var3 & 0xFF;
      int var12 = var4 >> 16 & 0xFF;
      int var13 = var4 >> 8 & 0xFF;
      int var14 = var4 & 0xFF;
      float var15 = var6 ? f_9196 : f_9197;
      float var16 = var6 ? f_9198 : f_9199;
      float var17 = f_9166 * var15;
      float var18 = f_9166 * var16;
      float var19 = f_9200 + f_9201 * var15;
      float var20 = f_9202 + f_9203 * var16;
      float var21 = var6 ? 2.0F : 1.0F;
      float var22 = var5 * (var6 ? f_9204 : f_9205);
      int var23 = 0;

      for (int var24 = 0; var24 < 256; var24++) {
         int var25 = var24 + 1;
         float var26 = var24 / f_9206;
         float var27 = var25 / f_9207;
         var23 += m_3151(
            var0,
            var1,
            var2,
            var7,
            var8,
            f_9168[var24] * var17,
            var19,
            f_9169[var24] * var17,
            f_9168[var24] * f_9208,
            -f_9166,
            f_9169[var24] * f_9209,
            var26,
            var21 + f_9210,
            var9,
            var10,
            var11,
            var22 * f_9211,
            f_9168[var25] * var17,
            var19,
            f_9169[var25] * var17,
            f_9168[var25] * f_9212,
            -f_9166,
            f_9169[var25] * f_9213,
            var27,
            var21 + f_9214,
            var9,
            var10,
            var11,
            var22 * f_9215,
            f_9168[var25] * var18,
            var20,
            f_9169[var25] * var18,
            f_9168[var25] * f_9216,
            -f_9166,
            f_9169[var25] * f_9217,
            var27,
            var21 + f_9218,
            var12,
            var13,
            var14,
            var22,
            f_9168[var24] * var18,
            var20,
            f_9169[var24] * var18,
            f_9168[var24] * f_9219,
            -f_9166,
            f_9169[var24] * f_9220,
            var26,
            var21 + f_9221,
            var12,
            var13,
            var14,
            var22
         );
      }

      return var23;
   }

   private static int m_3157(BufferBuilder var0, Matrix4f var1, Matrix3f var2, int var3, int var4, float var5, float var6, float var7) {
      int var8 = var3 >> 16 & 0xFF;
      int var9 = var3 >> 8 & 0xFF;
      int var10 = var3 & 0xFF;
      int var11 = var4 >> 16 & 0xFF;
      int var12 = var4 >> 8 & 0xFF;
      int var13 = var4 & 0xFF;
      float var14 = f_9166 * f_9222;
      float var15 = f_9166 * f_9223;
      int var16 = 0;

      for (int var17 = 0; var17 < 256; var17++) {
         int var18 = var17 + 1;
         float var19 = var17 / f_9224;
         float var20 = var18 / f_9225;
         var16 += m_3151(
            var0,
            var1,
            var2,
            var6,
            var7,
            f_9168[var17] * var14,
            f_9226,
            f_9169[var17] * var14,
            0.0F,
            f_9227,
            0.0F,
            var19,
            f_9228,
            var8,
            var9,
            var10,
            var5 * f_9229,
            f_9168[var18] * var14,
            f_9230,
            f_9169[var18] * var14,
            0.0F,
            f_9231,
            0.0F,
            var20,
            f_9232,
            var8,
            var9,
            var10,
            var5 * f_9233,
            f_9168[var18] * var15,
            f_9234,
            f_9169[var18] * var15,
            f_9168[var18],
            f_9235,
            f_9169[var18],
            var20,
            f_9236,
            var11,
            var12,
            var13,
            var5,
            f_9168[var17] * var15,
            f_9237,
            f_9169[var17] * var15,
            f_9168[var17],
            f_9238,
            f_9169[var17],
            var19,
            f_9239,
            var11,
            var12,
            var13,
            var5
         );
      }

      return var16;
   }

   public static int m_3158(BufferBuilder var0, Matrix4f var1, Matrix3f var2, int var3, int var4, float var5, float var6, float var7) {
      int var8 = 0;
      var8 += m_3154(var0, var1, var2, var3, var4, var5, var6, var7);
      var8 += m_3156(var0, var1, var2, var3, var4, var5, true, var6, var7);
      return var8 + m_3146(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   private static int m_3159(BufferBuilder var0, Matrix4f var1, Matrix3f var2, int var3, int var4, float var5, float var6, float var7) {
      int var8 = var3 >> 16 & 0xFF;
      int var9 = var3 >> 8 & 0xFF;
      int var10 = var3 & 0xFF;
      int var11 = var4 >> 16 & 0xFF;
      int var12 = var4 >> 8 & 0xFF;
      int var13 = var4 & 0xFF;
      float var14 = f_9166 * f_9175;
      int var15 = 0;

      for (int var16 = 0; var16 < 256; var16++) {
         int var17 = var16 + 1;
         float var18 = var16 / f_9176;
         float var19 = var17 / f_9177;
         var15 += m_3151(
            var0,
            var1,
            var2,
            var6,
            var7,
            f_9168[var16] * var14,
            f_9178,
            f_9169[var16] * var14,
            f_9168[var16] * f_9179,
            -f_9166,
            f_9169[var16] * f_9180,
            var18,
            f_9181,
            var8,
            var9,
            var10,
            var5 * f_9182,
            f_9168[var17] * var14,
            f_9183,
            f_9169[var17] * var14,
            f_9168[var17] * f_9184,
            -f_9166,
            f_9169[var17] * f_9185,
            var19,
            f_9186,
            var8,
            var9,
            var10,
            var5 * f_9187,
            f_9168[var17] * f_9166,
            f_9188,
            f_9169[var17] * f_9166,
            f_9168[var17] * f_9189,
            -f_9166,
            f_9169[var17] * f_9190,
            var19,
            f_9191,
            var11,
            var12,
            var13,
            var5,
            f_9168[var16] * f_9166,
            f_9192,
            f_9169[var16] * f_9166,
            f_9168[var16] * f_9193,
            -f_9166,
            f_9169[var16] * f_9194,
            var18,
            f_9195,
            var11,
            var12,
            var13,
            var5
         );
      }

      return var15;
   }
}
