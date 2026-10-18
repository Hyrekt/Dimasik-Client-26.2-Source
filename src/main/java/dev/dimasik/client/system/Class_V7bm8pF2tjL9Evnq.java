package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import java.util.ArrayList;
import lombok.Generated;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.ChatScreen;
import org.joml.Matrix4f;
import org.lwjgl.glfw.GLFW;

public class Class_V7bm8pF2tjL9Evnq extends ArrayList<Class_NO6SuGqq3FB7jQDZ> {
   private static final float f_15243 = 26.0F;
   private static final float f_15244 = 40.0F;
   private static final float[] f_15245 = new float[]{
      Class_V7bm8pF2tjL9Evnq.f_15347,
      Class_V7bm8pF2tjL9Evnq.f_15348,
      Class_V7bm8pF2tjL9Evnq.f_15349,
      Class_V7bm8pF2tjL9Evnq.f_15350,
      Class_V7bm8pF2tjL9Evnq.f_15351
   };
   private static final String f_15246 = "Отпустите ЛКМ для подтверждения позиции.";
   private float f_15247;
   private float f_15248;
   private float f_15249;
   private float f_15250;
   private Class_NO6SuGqq3FB7jQDZ f_15251 = null;
   private Class_NO6SuGqq3FB7jQDZ f_15252 = null;
   private float f_15253;
   private float f_15254;
   private float f_15255;
   private float f_15256;
   private float f_15257 = Float.NaN;
   private float f_15258 = Float.NaN;
   private long f_15259;
   private final Class_3uXLx9N6kT6tGg39 f_15260;
   private final Class_cdSwzxNCqQjsbpyo f_15261;
   private final Class_uWwGUbSkSaLy0aZF f_15262;
   private final Class_yHuMNA1veUxr6eGN f_15263;
   private final Class_h9gmP6jZeiKETGdh f_15264;
   private final Class_8M6KWDCphbBjAqSQ f_15265;
   private final Class_UiQ3442HnvvsK2qb f_15266;
   private final Class_ND5nzva71juYlk72 f_15267;
   private final Class_s6dPPNYhKFC2fKhZ f_15268;
   private final CheckboxSetting f_15269;
   private final Class_w8fCJQ5ZtH5lQbWc f_15270;
   private boolean f_15271;
   private final Class_gEPk7yDw6CwIte87<Class_i0GDVYUh4DGVWtXa> f_15272;
   private final Class_gEPk7yDw6CwIte87<Class_lvSdQbZIK6LWhOfu> f_15273;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_15274;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_15275;
   private final Class_gEPk7yDw6CwIte87<Class_CPqSaXQtUSOKX1Z4> f_15276;
   private static final float f_15277 = 12.0F;
   private static final float f_15278 = -180.0F;
   private static final float f_15279 = 180.0F;
   private static final float f_15280 = 7.0F;
   private static final float f_15281 = 10.0F;
   private static final float f_15282 = -180.0F;
   private static final float f_15283 = 180.0F;
   private static final float f_15284 = 7.0F;
   private static final float f_15285 = -180.0F;
   private static final float f_15286 = 180.0F;
   private static final float f_15287 = 7.0F;
   private static final float f_15288 = 0.01F;
   private static final String f_15289 = "Зажми Ctrl + Shift чтобы показалась сетка";
   private static final float f_15290 = 0.5F;
   private static final float f_15291 = 17.0F;
   private static final double f_15292 = 170.0;
   private static final double f_15293 = 210.0;
   private static final double f_15294 = 230.0;
   private static final double f_15295 = 22.0;
   private static final double f_15296 = 210.0;
   private static final float f_15297 = 1.5F;
   private static final float f_15298 = 8.0F;
   private static final float f_15299 = 5.0F;
   private static final float f_15300 = 1.5F;
   private static final float f_15301 = 8.0F;
   private static final float f_15302 = 5.0F;
   private static final float f_15303 = 1.5F;
   private static final float f_15304 = 8.0F;
   private static final float f_15305 = 5.0F;
   private static final float f_15306 = 1.5F;
   private static final float f_15307 = 8.0F;
   private static final float f_15308 = 5.0F;
   private static final float f_15309 = 8.0F;
   private static final float f_15310 = 1.25F;
   private static final float f_15311 = 8.0F;
   private static final String f_15312 = "Отпустите ЛКМ для подтверждения позиции.";
   private static final float f_15313 = 9.0F;
   private static final float f_15314 = 6.0F;
   private static final float f_15315 = 0.5F;
   private static final float f_15316 = 6.0F;
   private static final float f_15317 = 6.0F;
   private static final float f_15318 = 6.0F;
   private static final float f_15319 = 8.0F;
   private static final float f_15320 = 6.0F;
   private static final float f_15321 = 8.0F;
   private static final String f_15322 = "Отпустите ЛКМ для подтверждения позиции.";
   private static final float f_15323 = 0.5F;
   private static final float f_15324 = 0.75F;
   private static final float f_15325 = 0.65F;
   private static final float f_15326 = 0.5F;
   private static final float f_15327 = 0.5F;
   private static final float f_15328 = 10.0F;
   private static final float f_15329 = -22.0F;
   private static final float f_15330 = 0.5F;
   private static final float f_15331 = 40.0F;
   private static final float f_15332 = 0.5F;
   private static final float f_15333 = Float.MAX_VALUE;
   private static final float f_15334 = 26.0F;
   private static final float f_15335 = 0.5F;
   private static final float f_15336 = 0.1F;
   private static final float f_15337 = 1.0E9F;
   private static final float f_15338 = 0.016F;
   private static final float f_15339 = 520.0F;
   private static final float f_15340 = 30.0F;
   private static final float f_15341 = 520.0F;
   private static final float f_15342 = 30.0F;
   private static final float f_15343 = 0.05F;
   private static final float f_15344 = 0.05F;
   private static final float f_15345 = 0.5F;
   private static final float f_15346 = 0.5F;
   private static final float f_15347 = 0.16666667F;
   private static final float f_15348 = 0.33333334F;
   private static final float f_15349 = 0.5F;
   private static final float f_15350 = 0.6666667F;
   private static final float f_15351 = 0.8333333F;

   @Generated
   public Class_h9gmP6jZeiKETGdh m_5355() {
      return this.f_15264;
   }

   private void m_5356() {
      if (this.f_15252 != null) {
         if (this.f_15252 instanceof Class_ND5nzva71juYlk72) {
            this.f_15253 = this.f_15252.m_3998();
            this.f_15252.m_4008(this.f_15254);
            this.f_15255 = this.f_15256 = 0.0F;
            if (this.f_15251 == null) {
               this.m_5372();
            }
         } else {
            long var1 = System.nanoTime();
            float var3 = this.f_15259 == 0L ? 0.0F : Math.min(f_15336, (float)(var1 - this.f_15259) / f_15337);
            this.f_15259 = var1;
            if (!(var3 <= 0.0F)) {
               while (var3 > 0.0F) {
                  float var4 = Math.min(f_15338, var3);
                  float var5 = this.f_15253 - this.f_15252.m_3998();
                  float var6 = this.f_15254 - this.f_15252.m_3999();
                  this.f_15255 = this.f_15255 + (var5 * f_15339 - this.f_15255 * f_15340) * var4;
                  this.f_15256 = this.f_15256 + (var6 * f_15341 - this.f_15256 * f_15342) * var4;
                  this.f_15252.m_3997(this.f_15252.m_3998() + this.f_15255 * var4);
                  this.f_15252.m_4008(this.f_15252.m_3999() + this.f_15256 * var4);
                  var3 -= var4;
               }

               if (this.f_15251 == null
                  && Math.abs(this.f_15253 - this.f_15252.m_3998()) < f_15343
                  && Math.abs(this.f_15254 - this.f_15252.m_3999()) < f_15344
                  && Math.abs(this.f_15255) < f_15345
                  && Math.abs(this.f_15256) < f_15346) {
                  this.f_15252.m_3997(this.f_15253);
                  this.f_15252.m_4008(this.f_15254);
                  this.m_5372();
               }
            }
         }
      }
   }

   private void m_5357() {
      if (this.m_5364() && this.f_15251 != null) {
         Minecraft var1 = Minecraft.getInstance();
         float var2 = var1.getWindow().getScreenWidth();
         float var3 = var1.getWindow().getScreenHeight();
         float var4 = this.f_15251.m_1757();
         float var5 = this.f_15251.m_1758();
         float var6 = this.f_15249;
         float var7 = this.f_15250;
         float var8 = this.f_15253;
         float var9 = this.f_15254;
         int var10 = Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_15293);
         int var11 = Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_15294);
         int var12 = Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_15295);
         int var13 = Class_BftdentXEtGbugJw.m_2303(12, 14, 18, f_15296);
         Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
         Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588());

         try {
            this.m_5361(var6, var7, var8, var9, f_15297, f_15298, f_15299, var10);
            this.m_5361(var6 + var4, var7, var8 + var4, var9, f_15300, f_15301, f_15302, var10);
            this.m_5361(var6, var7 + var5, var8, var9 + var5, f_15303, f_15304, f_15305, var10);
            this.m_5361(var6 + var4, var7 + var5, var8 + var4, var9 + var5, f_15306, f_15307, f_15308, var10);
            Class_U4Qsm43RVlUI3Pre.m_5199(var8, var9, var4, var5, f_15309, var12);
            Class_U4Qsm43RVlUI3Pre.m_5187(var8, var9, var4, var5, f_15310, f_15311, var11);
            byte var14 = 11;
            float var15 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), f_15312, var14);
            float var16 = f_15313;
            float var17 = f_15314;
            float var18 = var15 + var16 * 2.0F;
            float var19 = var14 + var17 * 2.0F;
            float var20 = Math.clamp(var8 + (var4 - var18) * f_15315, f_15316, Math.max(f_15317, var2 - var18 - f_15318));
            float var21 = var9 + var5 + f_15319;
            if (var21 + var19 > var3 - f_15320) {
               var21 = var9 - var19 - f_15321;
            }

            Class_U4Qsm43RVlUI3Pre.m_5186(Class_y1y6QpONhWEUIdEB.m_9588(), f_15322, var20 + var16, var21 + var17, var14, -1);
         } finally {
            Class_U4Qsm43RVlUI3Pre.m_5193();
         }
      }
   }

   @Generated
   public Class_UiQ3442HnvvsK2qb m_5359() {
      return this.f_15266;
   }

   public boolean m_5360(float var1, float var2, int var3) {
      if (!this.f_15271) {
         return false;
      }

      for (Class_NO6SuGqq3FB7jQDZ var5 : this.reversed()) {
         if (var5 instanceof Class_OJntZb8PWlU5XrDj var6 && var6.m_1340(var1, var2, var3)) {
            return true;
         }
      }

      return false;
   }

   private void m_5361(float var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8) {
      float var9 = var3 - var1;
      float var10 = var4 - var2;
      float var11 = (float)Math.hypot(var9, var10);
      if (!(var11 < f_15323)) {
         float var12 = var9 / var11;
         float var13 = var10 / var11;
         float var14 = Math.max(f_15324, var5 * f_15325);
         float var15 = 0.0F;

         while (var15 < var11) {
            float var16 = Math.min(var15 + var6, var11);

            for (float var17 = var15; var17 < var16; var17 += var14) {
               float var18 = var1 + var12 * var17;
               float var19 = var2 + var13 * var17;
               Class_U4Qsm43RVlUI3Pre.m_5199(var18 - var5 * f_15326, var19 - var5 * f_15327, var5, var5, 0.0F, var8);
            }

            var15 += var6 + var7;
         }
      }
   }

   private boolean m_5362(Minecraft var1) {
      long var2 = var1.getWindow().handle();
      boolean var4 = GLFW.glfwGetKey(var2, 340) == 1 || GLFW.glfwGetKey(var2, 344) == 1;
      boolean var5 = GLFW.glfwGetKey(var2, 341) == 1 || GLFW.glfwGetKey(var2, 345) == 1;
      return var4 && var5;
   }

   public void m_5363(Class_CPqSaXQtUSOKX1Z4 var1) {
      if (!var1.m_1581()) {
         if (this.m_5360(var1.m_2413(), var1.m_2414(), var1.m_2415())) {
            var1.m_1582(true);
         } else {
            this.m_5365(var1.m_2413(), var1.m_2414(), var1.m_2415());
         }
      }
   }

   private boolean m_5364() {
      return !(this.f_15251 instanceof Class_ND5nzva71juYlk72) && this.f_15269 != null && this.f_15269.m_8768();
   }

   public boolean m_5365(float var1, float var2, int var3) {
      if (this.f_15271 && var3 == 0) {
         for (Class_NO6SuGqq3FB7jQDZ var5 : this.reversed()) {
            if (var5.m_4011() && Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var5.m_3998(), var5.m_3993(), var5.m_1757(), var5.m_1758())) {
               this.m_5379(var5);
               this.f_15247 = var5.m_3998() - var1;
               this.f_15248 = var5.m_3999() - var2;
               this.f_15249 = var5.m_3998();
               this.f_15250 = var5 instanceof Class_sntt8iARozMvczqs ? f_15328 : var5.m_3999();
               this.f_15251 = var5;
               this.f_15252 = var5;
               if (var5 instanceof Class_UiQ3442HnvvsK2qb var6) {
                  var6.m_5282();
               }

               this.f_15253 = var5.m_3998();
               this.f_15254 = this.f_15250;
               this.f_15255 = 0.0F;
               this.f_15256 = !this.m_5364() && !(var5 instanceof Class_sntt8iARozMvczqs) ? f_15329 : 0.0F;
               this.f_15259 = System.nanoTime();
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private float m_5366(float var1, float var2, float var3, float var4, boolean var5) {
      float var6 = var1 + var2 * f_15330;
      float var7 = var5 ? this.f_15257 : this.f_15258;
      if (!Float.isNaN(var7)) {
         if (Math.abs(var6 - var7) <= f_15331) {
            return Math.clamp(var7 - var2 * f_15332, 0.0F, var4);
         }

         if (var5) {
            this.f_15257 = Float.NaN;
         } else {
            this.f_15258 = Float.NaN;
         }
      }

      float var8 = Float.NaN;
      float var9 = f_15333;

      for (float var13 : f_15245) {
         float var14 = var3 * var13;
         float var15 = Math.abs(var6 - var14);
         if (var15 < var9) {
            var9 = var15;
            var8 = var14;
         }
      }

      if (!Float.isNaN(var8) && var9 <= f_15334) {
         if (var5) {
            this.f_15257 = var8;
         } else {
            this.f_15258 = var8;
         }

         return Math.clamp(var8 - var2 * f_15335, 0.0F, var4);
      } else {
         return Math.clamp(var1, 0.0F, var4);
      }
   }

   public void m_5367(Class_lvSdQbZIK6LWhOfu var1) {
      for (Class_NO6SuGqq3FB7jQDZ var3 : this) {
         if (var3 instanceof Class_OJntZb8PWlU5XrDj var4) {
            var4.m_1333();
         }
      }

      this.m_5379(null);
      this.f_15251 = null;
      this.f_15247 = 0.0F;
      this.f_15248 = 0.0F;
      this.f_15257 = Float.NaN;
      this.f_15258 = Float.NaN;
   }

   @Generated
   public Class_8M6KWDCphbBjAqSQ m_5368() {
      return this.f_15265;
   }

   public void m_5369() {
      if (!this.f_15271) {
         this.f_15271 = true;
         this.forEach(var0 -> DimasikClient.m_9057().m_9051().m_9713(var0));
         DimasikClient.m_9057().m_9051().m_9713(this.f_15261.m_6247());
         DimasikClient.m_9057().m_9051().m_9713(this.f_15262.m_9200());
         DimasikClient.m_9057().m_9051().m_9713(this.f_15263.m_9650());
         DimasikClient.m_9057().m_9051().m_9713(this.f_15264.m_7121());
         DimasikClient.m_9057().m_9051().m_9713(this.f_15268.m_8635());
         DimasikClient.m_9057().m_9051().m_9713(this.f_15267.m_4003());
      }
   }

   public void m_5370() {
      for (Class_NO6SuGqq3FB7jQDZ var2 : this) {
         if (var2 instanceof Class_OJntZb8PWlU5XrDj var3) {
            var3.m_3992();
         }
      }

      if (!this.m_5364() || !this.m_5375()) {
         this.f_15251 = null;
         this.f_15247 = 0.0F;
         this.f_15248 = 0.0F;
         this.f_15257 = Float.NaN;
         this.f_15258 = Float.NaN;
      }
   }

   private void m_5372() {
      this.f_15252 = null;
      this.f_15255 = this.f_15256 = 0.0F;
      this.f_15259 = 0L;
   }

   private void m_5373() {
      if (Class_HKVFPtZz5yGHYty6.m_2883()) {
         this.f_15270.m_9281(0.0F);
      } else {
         Minecraft var1 = Minecraft.getInstance();
         boolean var2 = var1.gui.screen() instanceof ChatScreen;
         float var3 = var1.getWindow().getScreenWidth();
         float var4 = var1.getWindow().getScreenHeight();
         this.f_15270.m_9283(var2 && this.m_5362(var1) ? 1.0F : 0.0F);
         if (this.f_15270.m_9288() > f_15288) {
            Class_mwMbZDAuWfXKO4d6.f_25551.m_7635(var3, var4, this.f_15270.m_9288());
         }

         if (var2) {
            String var5 = f_15289;
            float var6 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var5, 11);
            float var7 = (var3 - var6) * f_15290;
            Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
            Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var5, var7, f_15291, 11, Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_15292));
         }

         this.m_5357();
      }
   }

   public void m_5374() {
      if (this.f_15271) {
         this.f_15271 = false;
         this.f_15261.m_6247().m_9093();
         this.f_15262.m_9200().m_9093();
         this.f_15263.m_9650().m_9093();
         this.f_15264.m_7121().m_9093();
         this.f_15268.m_8635().m_9093();
         this.f_15267.m_1333();
         this.f_15267.m_4012(0.0F);
         this.f_15267.m_4007(0.0F);
         this.forEach(var0 -> DimasikClient.m_9057().m_9051().m_9715(var0));
         DimasikClient.m_9057().m_9051().m_9715(this.f_15261.m_6247());
         DimasikClient.m_9057().m_9051().m_9715(this.f_15262.m_9200());
         DimasikClient.m_9057().m_9051().m_9715(this.f_15263.m_9650());
         DimasikClient.m_9057().m_9051().m_9715(this.f_15264.m_7121());
         DimasikClient.m_9057().m_9051().m_9715(this.f_15268.m_8635());
         DimasikClient.m_9057().m_9051().m_9715(this.f_15267.m_4003());
      }
   }

   private boolean m_5375() {
      if (this.f_15251 == null) {
         return false;
      }

      this.f_15251.m_3997(this.f_15253);
      this.f_15251.m_4008(this.f_15254);
      this.f_15251 = null;
      this.f_15247 = 0.0F;
      this.f_15248 = 0.0F;
      this.f_15257 = Float.NaN;
      this.f_15258 = Float.NaN;
      this.m_5372();
      return true;
   }

   public boolean m_5376() {
      return this.f_15271;
   }

   public void m_5377(Class_i0GDVYUh4DGVWtXa var1) {
      this.m_5370();
   }

   public void m_5378(Class_bhRaN0YSSLQRYjPo var1) {
      if (this.f_15251 != null) {
         Minecraft var2 = Minecraft.getInstance();
         float var3 = var2.getWindow().getScreenWidth();
         float var4 = var2.getWindow().getScreenHeight();
         float var5 = Math.max(0.0F, var3 - this.f_15251.m_1757());
         float var6 = Math.clamp(var1.m_6082() + this.f_15247, 0.0F, var5);
         boolean var7 = this.m_5362(var2);
         if (var7) {
            var6 = this.m_5366(var6, this.f_15251.m_1757(), var3, var5, true);
         } else {
            this.f_15257 = Float.NaN;
         }

         if (this.f_15251 instanceof Class_ND5nzva71juYlk72) {
            var6 = this.f_15251.m_3998();
            this.f_15249 = var6;
            this.f_15253 = var6;
            this.f_15255 = 0.0F;
            this.f_15257 = Float.NaN;
         }

         if (this.f_15251 instanceof Class_sntt8iARozMvczqs) {
            this.f_15255 = this.f_15255 + Math.max(f_15278, Math.min(f_15279, (var6 - this.f_15253) * f_15280));
            this.f_15256 = 0.0F;
            this.f_15253 = var6;
            this.f_15254 = f_15281;
            this.f_15258 = Float.NaN;
         } else {
            float var8 = Math.max(0.0F, var4 - this.f_15251.m_1758());
            float var9 = Math.clamp(var1.m_6084() + this.f_15248, 0.0F, var8);
            if (var7) {
               var9 = this.m_5366(var9, this.f_15251.m_1758(), var4, var8, false);
            } else {
               this.f_15258 = Float.NaN;
            }

            this.f_15255 = this.f_15255 + Math.max(f_15282, Math.min(f_15283, (var6 - this.f_15253) * f_15284));
            this.f_15256 = this.f_15256 + Math.max(f_15285, Math.min(f_15286, (var9 - this.f_15254) * f_15287));
            this.f_15253 = var6;
            this.f_15254 = var9;
         }

         if (this.m_5364()) {
            this.f_15251.m_3997(this.f_15249);
            this.f_15251.m_4008(this.f_15250);
            this.f_15255 = 0.0F;
            this.f_15256 = 0.0F;
            this.f_15259 = System.nanoTime();
         }
      }

      if (!this.m_5364() || this.f_15251 == null) {
         this.m_5356();
      }
   }

   public Class_V7bm8pF2tjL9Evnq(
      MultiChoiceSetting var1,
      MultiChoiceSetting var2,
      CheckboxSetting var3,
      CheckboxSetting var4,
      SliderSetting var5,
      MultiChoiceSetting var6,
      CheckboxSetting var7,
      SliderSetting var8,
      SliderSetting var9,
      SliderSetting var10,
      CheckboxSetting var11,
      CheckboxSetting var12,
      ItemListSetting var13
   ) {
      this.f_15270 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_15277);
      this.f_15272 = this::m_5377;
      this.f_15273 = this::m_5367;
      this.f_15274 = this::m_5378;
      this.f_15275 = new Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo>() {
         public void m_1781(Class_bhRaN0YSSLQRYjPo var1) {
            Class_V7bm8pF2tjL9Evnq.this.m_5373();
         }

         @Override
         public int m_1780() {
            return -150;
         }
      };
      this.f_15276 = this::m_5363;
      this.add(new Class_GxQmf1xdnKh0U1rS());
      this.add(new Class_VZIpjPvwyHP3ChPv());
      this.f_15260 = new Class_3uXLx9N6kT6tGg39();
      this.add(this.f_15260);
      this.f_15261 = new Class_cdSwzxNCqQjsbpyo(var1, var3, var4, var5, var6, var7);
      this.add(this.f_15261);
      this.f_15262 = new Class_uWwGUbSkSaLy0aZF(var2);
      this.add(this.f_15262);
      this.add(new Class_hPXcxylpJibNeaCt());
      this.add(new Class_8obKf7Y4NcvqxQPH());
      this.add(new Class_o7YEwF0weLMsp5Po());
      this.add(new Class_t6qxznuvLEUVWtjm());
      this.add(new Class_UFYSfcO7ecfYZscM());
      this.add(new Class_Maaoqz7ut3IoxSsx());
      this.f_15268 = new Class_s6dPPNYhKFC2fKhZ(var10);
      this.add(this.f_15268);
      this.add(new Class_Y6ux4QBnIgZms3Ps());
      this.f_15263 = new Class_yHuMNA1veUxr6eGN(var8);
      this.add(this.f_15263);
      this.f_15264 = new Class_h9gmP6jZeiKETGdh(var9);
      this.add(this.f_15264);
      this.f_15265 = new Class_8M6KWDCphbBjAqSQ();
      this.add(this.f_15265);
      this.add(new Class_sntt8iARozMvczqs());
      this.add(new Class_KFQNWUQzUTuWWSnk());
      this.f_15266 = new Class_UiQ3442HnvvsK2qb();
      this.add(this.f_15266);
      this.f_15267 = new Class_ND5nzva71juYlk72(var13);
      this.add(this.f_15267);
      this.add(new Class_rSdaPYwfOhuHo0YE());
      this.f_15269 = var12;
      DimasikClient.m_9057().m_9051().m_9713(this);
   }

   private void m_5379(Class_NO6SuGqq3FB7jQDZ var1) {
      if (this.f_15252 != null && this.f_15252 != var1) {
         this.f_15252.m_3997(this.f_15253);
         this.f_15252.m_4008(this.f_15254);
         this.m_5372();
      }
   }

   @Generated
   public Class_ND5nzva71juYlk72 m_5380() {
      return this.f_15267;
   }
}
