package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.combat.Aura;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector2f;

public final class Class_zUtJiwnxatAkdw6h extends Class_kkp256olqZ4F1qt3 {
   private static final int f_36169 = Integer.MIN_VALUE;
   private static final long f_36170 = 350000000L;
   private static final float f_36171 = 0.002F;
   private static final float f_36172 = 2.25F;
   private static final float f_36173 = 1.65F;
   private static final float f_36174 = 3.35F;
   private static final float f_36175 = 2.45F;
   private static final float f_36176 = 0.48F;
   private static final float f_36177 = 0.34F;
   private final Random f_36178 = new Random();
   private int f_36179;
   private int f_36180;
   private int f_36181;
   private long f_36182;
   private int f_36183;
   private boolean f_36184;
   private boolean f_36185;
   private double f_36186;
   private double f_36187;
   private double f_36188;
   private boolean f_36189;
   private boolean f_36190;
   private int f_36191;
   private int f_36192;
   private int f_36193;
   private float f_36194;
   private float f_36195;
   private float f_36196;
   private boolean f_36197;
   private float f_36198;
   private float f_36199;
   private float f_36200;
   private float f_36201;
   private float f_36202;
   private int f_36203;
   private int f_36204;
   private boolean f_36205;
   private Class_zUtJiwnxatAkdw6h.j3pwrXthfZ4Wna2i f_36206;
   private int f_36207;
   private int f_36208;
   private float f_36209;
   private float f_36210;
   private float f_36211;
   private float f_36212;
   private int f_36213;
   private int f_36214;
   private float f_36215;
   private float f_36216;
   private float f_36217;
   private boolean f_36218;
   private Class_zUtJiwnxatAkdw6h.j3pwrXthfZ4Wna2i f_36219;
   private float f_36220;
   private float f_36221;
   private float f_36222;
   private float f_36223;
   private float f_36224;
   private float f_36225;
   private float f_36226;
   private float f_36227;
   private float f_36228;
   private float f_36229;
   private float f_36230;
   private float f_36231;
   private boolean f_36232;
   private boolean f_36233;
   private static final int f_36234 = Integer.MIN_VALUE;
   private static final double f_36235 = 0.5;
   private static final double f_36236 = 0.5;
   private static final double f_36237 = 0.5;
   private static final int f_36238 = Integer.MIN_VALUE;
   private static final long f_36239 = 350000000L;
   private static final double f_36240 = 0.002F;
   private static final double f_36241 = Math.PI;
   private static final float f_36242 = 90.0F;
   private static final float f_36243 = 0.54F;
   private static final float f_36244 = 0.54F;
   private static final float f_36245 = 0.43F;
   private static final float f_36246 = 0.78F;
   private static final float f_36247 = 13.0F;
   private static final float f_36248 = 43.0F;
   private static final float f_36249 = 8.0F;
   private static final float f_36250 = 24.0F;
   private static final float f_36251 = 15.5F;
   private static final float f_36252 = 9.5F;
   private static final float f_36253 = 2.4F;
   private static final float f_36254 = 1.6F;
   private static final float f_36255 = 0.24F;
   private static final float f_36256 = 0.72F;
   private static final float f_36257 = 0.64F;
   private static final float f_36258 = 0.82F;
   private static final float f_36259 = 0.8F;
   private static final float f_36260 = 0.42F;
   private static final float f_36261 = 0.035F;
   private static final float f_36262 = 0.1F;
   private static final float f_36263 = 0.24F;
   private static final float f_36264 = 0.025F;
   private static final float f_36265 = 0.07F;
   private static final float f_36266 = -90.0F;
   private static final float f_36267 = 90.0F;
   private static final float f_36268 = -15.0F;
   private static final float f_36269 = 15.0F;
   private static final float f_36270 = -15.0F;
   private static final float f_36271 = 15.0F;
   private static final float f_36272 = -15.0F;
   private static final float f_36273 = 1.5F;
   private static final float f_36274 = 15.0F;
   private static final float f_36275 = -15.0F;
   private static final double f_36276 = Math.PI;
   private static final double f_36277 = 0.5;
   private static final float f_36278 = 0.5F;
   private static final float f_36279 = -2.0F;
   private static final double f_36280 = 2.0;
   private static final float f_36281 = 0.5F;
   private static final float f_36282 = 0.5F;
   private static final float f_36283 = 8.0F;
   private static final float f_36284 = -2.0F;
   private static final double f_36285 = 4.0;
   private static final float f_36286 = 0.5F;
   private static final float f_36287 = 3.0F;
   private static final float f_36288 = 3.0F;
   private static final float f_36289 = 0.2F;
   private static final double f_36290 = 0.16;
   private static final double f_36291 = 0.84;
   private static final double f_36292 = 0.2;
   private static final double f_36293 = 0.82;
   private static final double f_36294 = 0.16;
   private static final double f_36295 = 0.84;
   private static final float f_36296 = 0.78F;
   private static final float f_36297 = 4.0F;
   private static final float f_36298 = 45.0F;
   private static final float f_36299 = 0.78F;
   private static final float f_36300 = 12.0F;
   private static final float f_36301 = 0.62F;
   private static final float f_36302 = 0.44F;
   private static final float f_36303 = 0.55F;
   private static final float f_36304 = 0.035F;
   private static final float f_36305 = 0.075F;
   private static final float f_36306 = 0.42F;
   private static final float f_36307 = 3.8F;
   private static final float f_36308 = 0.025F;
   private static final float f_36309 = 0.06F;
   private static final float f_36310 = 0.16F;
   private static final float f_36311 = 1.25F;
   private static final float f_36312 = 28.0F;
   private static final float f_36313 = 0.36F;
   private static final float f_36314 = 2.25F;
   private static final float f_36315 = 1.65F;
   private static final float f_36316 = 0.25F;
   private static final float f_36317 = 0.25F;
   private static final float f_36318 = 3.35F;
   private static final float f_36319 = 2.45F;
   private static final float f_36320 = 2.25F;
   private static final float f_36321 = 0.48F;
   private static final float f_36322 = 0.62F;
   private static final float f_36323 = 1.65F;
   private static final float f_36324 = 0.34F;
   private static final float f_36325 = 0.62F;
   private static final float f_36326 = -90.0F;
   private static final float f_36327 = 90.0F;
   private static final float f_36328 = 0.08F;
   private static final float f_36329 = 0.28F;
   private static final float f_36330 = 0.12F;
   private static final float f_36331 = 0.42F;
   private static final float f_36332 = 0.05F;
   private static final float f_36333 = 0.18F;
   private static final float f_36334 = 0.07F;
   private static final float f_36335 = 0.26F;
   private static final float f_36336 = 0.58F;
   private static final float f_36337 = 0.54F;
   private static final float f_36338 = 0.46F;
   private static final float f_36339 = 0.42F;
   private static final float f_36340 = 0.92F;
   private static final float f_36341 = 1.08F;
   private static final float f_36342 = 0.985F;
   private static final float f_36343 = 2.5F;
   private static final float f_36344 = 7.0F;
   private static final float f_36345 = 0.65F;
   private static final float f_36346 = 0.008F;
   private static final float f_36347 = 0.02F;
   private static final float f_36348 = 0.1F;
   private static final float f_36349 = 1.45F;
   private static final float f_36350 = 0.72F;
   private static final float f_36351 = 0.96F;
   private static final float f_36352 = 0.34F;
   private static final float f_36353 = 0.12F;
   private static final float f_36354 = 0.24F;
   private static final float f_36355 = 0.16F;
   private static final float f_36356 = 0.3F;
   private static final float f_36357 = 0.48F;
   private static final float f_36358 = 0.66F;
   private static final float f_36359 = 0.82F;
   private static final float f_36360 = 0.94F;
   private static final float f_36361 = 0.68F;
   private static final float f_36362 = 0.25F;
   private static final float f_36363 = 0.38F;
   private static final float f_36364 = 0.02F;
   private static final float f_36365 = 0.11F;
   private static final float f_36366 = 0.62F;
   private static final float f_36367 = 0.8F;
   private static final float f_36368 = 0.86F;
   private static final float f_36369 = 0.97F;
   private static final float f_36370 = 0.17F;
   private static final float f_36371 = 0.31F;
   private static final float f_36372 = 0.07F;
   private static final float f_36373 = 0.2F;
   private static final float f_36374 = 0.55F;
   private static final float f_36375 = 0.75F;
   private static final float f_36376 = 0.84F;
   private static final float f_36377 = 0.96F;
   private static final float f_36378 = 0.22F;
   private static final float f_36379 = 0.16F;
   private static final float f_36380 = 0.68F;
   private static final float f_36381 = 0.84F;
   private static final float f_36382 = 0.972F;
   private static final float f_36383 = 0.995F;
   private static final float f_36384 = 1.0E-4F;
   private static final float f_36385 = 0.86F;
   private static final float f_36386 = 1.0E-4F;
   private static final float f_36387 = 0.78F;
   private static final float f_36388 = 0.56F;
   private static final float f_36389 = 0.68F;
   private static final float f_36390 = 1.28F;
   private static final double f_36391 = Math.PI / 2;
   private static final double f_36392 = Math.PI;
   private static final float f_36393 = 0.5F;
   private static final float f_36394 = 4.0F;
   private static final float f_36395 = 4.0F;
   private static final float f_36396 = 0.5F;
   private static final float f_36397 = 32.0F;
   private static final float f_36398 = 32.0F;
   private static final float f_36399 = 1.0E-4F;
   private static final float f_36400 = 1.0E-4F;
   private static final float f_36401 = 3.0F;
   private static final float f_36402 = 3.0F;
   private static final float f_36403 = 3.0F;
   private static final float f_36404 = 6.0F;
   private static final float f_36405 = 3.0F;
   private static final float f_36406 = 0.25F;
   private static final float f_36407 = 0.1F;
   private static final float f_36408 = 0.7F;
   private static final float f_36409 = 0.9F;
   private static final float f_36410 = 1.0E-4F;
   private static final float f_36411 = 1.0E-4F;
   private static final double f_36412 = 0.12;
   private static final double f_36413 = 0.07;
   private static final double f_36414 = 0.09;
   private static final double f_36415 = 0.11;
   private static final double f_36416 = 0.12;
   private static final double f_36417 = 0.07;
   private static final float f_36418 = 0.05F;
   private static final float f_36419 = -1.0F;

   public Class_zUtJiwnxatAkdw6h(Vec3 var1) {
      super(var1);
      this.f_36179 = f_36234;
      this.f_36186 = f_36235;
      this.f_36187 = f_36236;
      this.f_36188 = f_36237;
      this.f_36206 = Class_zUtJiwnxatAkdw6h.j3pwrXthfZ4Wna2i.CUBIC_BEZIER;
      this.f_36215 = 1.0F;
      this.f_36219 = Class_zUtJiwnxatAkdw6h.j3pwrXthfZ4Wna2i.CUBIC_BEZIER;
   }

   private Vector2f m_9843(Vec3 var1) {
      Vec3 var2 = var1.subtract(f_11537.player.getEyePosition());
      double var3 = Math.hypot(var2.x, var2.z);
      return new Vector2f((float)Math.toDegrees(Math.atan2(-var2.x, var2.z)), (float)(-Math.toDegrees(Math.atan2(var2.y, var3))));
   }

   private void m_9844() {
      float var1 = this.f_36178.nextFloat();
      if (var1 < f_36352) {
         this.f_36226 = this.m_9866(f_36353, f_36354);
         this.f_36227 = this.m_9866(f_36355, f_36356);
         this.f_36228 = this.m_9866(f_36357, f_36358);
         this.f_36229 = this.m_9866(f_36359, f_36360);
      } else if (var1 < f_36361) {
         this.f_36226 = this.m_9866(f_36362, f_36363);
         this.f_36227 = this.m_9866(f_36364, f_36365);
         this.f_36228 = this.m_9866(f_36366, f_36367);
         this.f_36229 = this.m_9866(f_36368, f_36369);
      } else {
         this.f_36226 = this.m_9866(f_36370, f_36371);
         this.f_36227 = this.m_9866(f_36372, f_36373);
         this.f_36228 = this.m_9866(f_36374, f_36375);
         this.f_36229 = this.m_9866(f_36376, f_36377);
      }

      this.f_36232 = this.f_36178.nextFloat() < f_36378;
      this.f_36233 = false;
      if (this.f_36232) {
         this.f_36228 = this.m_9866(Math.max(this.f_36226 + f_36379, f_36380), f_36381);
         this.f_36229 = this.m_9866(f_36382, f_36383);
      }
   }

   private Vector2f m_9845(Entity var1, Vector2f var2) {
      return !this.f_36185 ? var2 : this.m_9843(this.m_9863(var1.getBoundingBox(), this.f_36186, this.f_36187, this.f_36188));
   }

   private void m_9846(Entity var1, Vector2f var2) {
      this.f_36181 = this.f_36180 + 12 + this.f_36178.nextInt(15);
      this.f_36185 = this.f_36178.nextFloat() < f_36289;
      if (this.f_36185) {
         AABB var3 = var1.getBoundingBox();
         ArrayList var4 = new ArrayList(9);

         for (int var5 = 0; var5 < 9; var5++) {
            double var6 = this.m_9856(f_36290, f_36291);
            double var8 = this.m_9856(f_36292, f_36293);
            double var10 = this.m_9856(f_36294, f_36295);
            Vector2f var12 = this.m_9843(this.m_9863(var3, var6, var8, var10));
            float var13 = Mth.wrapDegrees(var12.x - var2.x);
            float var14 = var12.y - var2.y;
            var4.add(new Class_zUtJiwnxatAkdw6h.HvcYUY2SeNQbrvpW(var6, var8, var10, (float)Math.hypot(var13, var14)));
         }

         var4.sort(Comparator.comparingDouble(Class_zUtJiwnxatAkdw6h.HvcYUY2SeNQbrvpW::rotationDistance));
         int var15;
         if (this.f_36178.nextFloat() < f_36296) {
            var15 = 1 + this.f_36178.nextInt(Math.min(3, var4.size() - 1));
         } else {
            int var16 = Math.min(4, var4.size() - 1);
            var15 = var16 + this.f_36178.nextInt(var4.size() - var16);
         }

         Class_zUtJiwnxatAkdw6h.HvcYUY2SeNQbrvpW var17 = (Class_zUtJiwnxatAkdw6h.HvcYUY2SeNQbrvpW)var4.get(var15);
         this.f_36186 = var17.x();
         this.f_36187 = var17.y();
         this.f_36188 = var17.z();
      }
   }

   private void m_9847(Vector2f var1, Vector2f var2, boolean var3) {
      float var4 = Mth.wrapDegrees(var2.x - var1.x);
      float var5 = var2.y - var1.y;
      if (!this.f_36197) {
         if (var3 && Math.abs(var4) < f_36314 && Math.abs(var5) < f_36315) {
            this.f_36197 = true;
            this.f_36198 = var1.x;
            this.f_36199 = var1.y;
            this.f_36216 = this.f_36216 * f_36316;
            this.f_36217 = this.f_36217 * f_36317;
         }
      } else if (var3 && !(Math.abs(var4) > f_36318) && !(Math.abs(var5) > f_36319)) {
         float var6 = Mth.wrapDegrees(var2.x - this.f_36198);
         float var7 = var2.y - this.f_36199;
         this.f_36198 = this.f_36198 + this.m_9857(var6, f_36320, f_36321) * f_36322;
         this.f_36199 = Mth.clamp(this.f_36199 + this.m_9857(var7, f_36323, f_36324) * f_36325, f_36326, f_36327);
      } else {
         this.f_36197 = false;
      }
   }

   private float m_9848() {
      return this.f_36178.nextFloat() * 2.0F - 1.0F;
   }

   private boolean m_9849(Vector2f var1, Vector2f var2, boolean var3) {
      float var4 = Mth.wrapDegrees(var2.x - var1.x);
      float var5 = var2.y - var1.y;
      float var6 = (float)Math.hypot(var4, var5);
      if (var6 < f_36297) {
         return false;
      }

      float var7 = var6 > f_36298 ? f_36299 : (var6 > f_36300 ? f_36301 : f_36302);
      if (!var3) {
         var7 *= f_36303;
      }

      if (this.f_36178.nextFloat() >= var7) {
         return false;
      }

      float var8 = this.m_9868(var4);
      float var9 = this.m_9868(var5);
      this.f_36194 = var8 * Mth.clamp(Math.abs(var4) * this.m_9866(f_36304, f_36305), f_36306, f_36307);
      this.f_36195 = var9 * Mth.clamp(Math.abs(var5) * this.m_9866(f_36308, f_36309), f_36310, f_36311);
      this.f_36190 = Math.abs(var4) >= Math.abs(var5);
      this.f_36196 = this.f_36190 ? var8 : var9;
      this.f_36191 = 0;
      this.f_36192 = Mth.clamp(4 + (int)Math.ceil(var6 / f_36312), 4, 11);
      this.f_36189 = true;
      this.f_36193 = 0;
      this.f_36213 = Math.abs(var5) > 2.0F && this.f_36178.nextFloat() < f_36313 ? 1 : 0;
      return true;
   }

   private float m_9850(float var1, float var2, float var3) {
      float var4 = 1.0F - var1;
      return f_36401 * var4 * var4 * var1 * var2 + f_36402 * var4 * var1 * var1 * var3 + var1 * var1 * var1;
   }

   private boolean m_9851(Vector2f var1, Vector2f var2) {
      if (!this.f_36189) {
         return false;
      }

      this.f_36191++;
      float var3 = Mth.wrapDegrees(var2.x - var1.x);
      float var4 = var2.y - var1.y;
      float var5 = this.f_36190 ? var3 : var4;
      boolean var6 = var5 * this.f_36196 <= 0.0F;
      if (!var6 && this.f_36191 < this.f_36192) {
         return false;
      }

      this.f_36189 = false;
      this.f_36193 = 2 + this.f_36178.nextInt(3);
      return true;
   }

   @Override
   public void m_1801() {
      this.f_36179 = f_36238;
      this.f_36180 = 0;
      this.f_36181 = 0;
      this.f_36182 = 0L;
      this.f_36183 = 0;
      this.f_36184 = false;
      this.f_36185 = false;
      this.m_9876();
      this.f_36193 = 0;
      this.f_36197 = false;
      this.m_9869();
      this.f_36207 = 0;
      this.f_36208 = 0;
      this.f_36209 = 0.0F;
      this.f_36210 = 0.0F;
      this.f_36211 = 0.0F;
      this.f_36212 = 0.0F;
      this.f_36213 = 0;
      this.f_36214 = 0;
      this.f_36215 = 1.0F;
      this.f_36216 = 0.0F;
      this.f_36217 = 0.0F;
      this.m_9874();
   }

   private void m_9852() {
      if (this.f_36180 >= this.f_36214) {
         this.f_36215 = this.m_9866(f_36340, f_36341);
         this.f_36214 = this.f_36180 + 4 + this.f_36178.nextInt(5);
      }
   }

   private float m_9853(Vector2f var1, float var2, float var3) {
      if (this.f_36218 && !(this.f_36224 < f_36384)) {
         float var4 = Mth.wrapDegrees(var2 - var1.x);
         float var5 = var3 - var1.y;
         float var6 = (float)Math.hypot(var4, var5);
         float var7 = 1.0F - Mth.clamp(var6 / this.f_36224, 0.0F, 1.0F);
         float var8 = Mth.wrapDegrees(var1.x - this.f_36220);
         float var9 = var1.y - this.f_36221;
         float var10 = (float)Math.hypot(var8, var9);
         float var11 = Mth.clamp(var10 / this.f_36224, 0.0F, 1.0F);
         this.f_36225 = Math.max(this.f_36225, Math.max(var7, var11));
         if (this.f_36232 && !this.f_36233 && this.f_36225 >= f_36385) {
            this.f_36208 = this.f_36180 + Math.max(1, this.f_36207 + 1);
            this.f_36233 = true;
         }

         return this.f_36225;
      } else {
         return 1.0F;
      }
   }

   private float m_9854(Class_zUtJiwnxatAkdw6h.j3pwrXthfZ4Wna2i var1, float var2) {
      float var3 = Mth.clamp(var2, 0.0F, 1.0F);

      return switch (var1) {
         case CUBIC_BEZIER -> this.m_9862(0.0F, 0.0F, 1.0F, 1.0F, var3);
         case SINE_IN_OUT -> (float)(-(Math.cos(f_36276 * var3) - 1.0) * f_36277);
         case QUADRATIC_IN_OUT -> var3 < f_36278 ? 2.0F * var3 * var3 : 1.0F - (float)Math.pow(f_36279 * var3 + 2.0F, f_36280) * f_36281;
         case QUARTIC_IN_OUT -> var3 < f_36282 ? f_36283 * var3 * var3 * var3 * var3 : 1.0F - (float)Math.pow(f_36284 * var3 + 2.0F, f_36285) * f_36286;
      };
   }

   private boolean m_9855(Entity var1) {
      Aura var2 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
      return var2 != null && var2.m_1114() != null && var2.m_1114().equals(var1) ? var2.m_1111() : false;
   }

   private double m_9856(double var1, double var3) {
      return var1 + this.f_36178.nextDouble() * (var3 - var1);
   }

   private float m_9857(float var1, float var2, float var3) {
      return Math.abs(var1) <= var2 ? 0.0F : var1 - Math.copySign(var3, var1);
   }

   private float m_9858(float var1, float var2, float var3) {
      if (Math.abs(var1) < f_36410) {
         return 0.0F;
      } else if (Math.abs(var2) < f_36411) {
         return Math.copySign(Math.min(Math.abs(var1), var3), var1);
      } else {
         return Math.signum(var1) != Math.signum(var2)
            ? Math.copySign(Math.min(Math.abs(var1), var3), var1)
            : Math.copySign(Math.min(Math.abs(var1), Math.abs(var2) + var3), var1);
      }
   }

   private void m_9859(Entity var1) {
      if (!this.f_36205) {
         this.f_36205 = true;
         this.f_36200 = this.f_36178.nextBoolean() ? f_36268 : f_36269;
         this.f_36201 = this.f_36200;
         this.f_36202 = this.f_36200 == f_36270 ? f_36271 : f_36272;
         this.f_36203 = 0;
         this.f_36204 = this.m_9867();
         this.f_36206 = this.m_9864();
      }

      this.f_36203 = Math.min(this.f_36203 + 1, this.f_36204);
      float var2 = Mth.clamp((float)this.f_36203 / this.f_36204, 0.0F, 1.0F);
      float var3 = this.m_9854(this.f_36206, var2);
      this.f_36200 = Mth.lerp(var3, this.f_36201, this.f_36202) * Math.clamp(f_36273 / var1.distanceTo(f_11537.player), 0.0F, 1.0F);
      if (this.f_36203 >= this.f_36204) {
         this.f_36201 = this.f_36202;
         this.f_36202 = this.f_36202 <= 0.0F ? f_36274 : f_36275;
         this.f_36203 = 0;
         this.f_36204 = this.m_9867();
         this.f_36206 = this.m_9864();
      }
   }

   private void m_9860(boolean var1) {
      if (this.f_36207 == 0 && this.f_36180 >= this.f_36208) {
         this.f_36207 = 2 + this.f_36178.nextInt(3);
         float var2 = var1 ? this.m_9866(f_36328, f_36329) : this.m_9866(f_36330, f_36331);
         float var3 = var1 ? this.m_9866(f_36332, f_36333) : this.m_9866(f_36334, f_36335);
         this.f_36211 = this.m_9848() * var2;
         this.f_36212 = this.m_9848() * var3;
         this.f_36208 = this.f_36180 + this.f_36207 + 3 + this.f_36178.nextInt(6);
      }

      if (this.f_36207 > 0) {
         this.f_36209 = Mth.lerp(f_36336, this.f_36209, this.f_36211);
         this.f_36210 = Mth.lerp(f_36337, this.f_36210, this.f_36212);
         this.f_36207--;
         if (this.f_36207 == 0) {
            this.f_36211 = 0.0F;
            this.f_36212 = 0.0F;
         }
      } else {
         this.f_36209 = Mth.lerp(f_36338, this.f_36209, 0.0F);
         this.f_36210 = Mth.lerp(f_36339, this.f_36210, 0.0F);
      }
   }

   private void m_9861(Entity var1, Vector2f var2) {
      this.f_36179 = var1.getId();
      this.f_36180 = 0;
      this.f_36183 = 1 + this.f_36178.nextInt(2);
      this.f_36184 = true;
      this.f_36197 = false;
      this.f_36193 = 0;
      this.m_9876();
      this.f_36207 = 0;
      this.f_36208 = 2 + this.f_36178.nextInt(4);
      this.f_36209 = 0.0F;
      this.f_36210 = 0.0F;
      this.f_36211 = 0.0F;
      this.f_36212 = 0.0F;
      this.f_36216 = 0.0F;
      this.f_36217 = 0.0F;
      this.f_36214 = 0;
      this.m_9874();
      this.m_9869();
      this.m_9846(var1, var2);
   }

   private float m_9862(float var1, float var2, float var3, float var4, float var5) {
      float var6 = 1.0F - var5;
      return var6 * var6 * var6 * var1 + f_36287 * var6 * var6 * var5 * var2 + f_36288 * var6 * var5 * var5 * var3 + var5 * var5 * var5 * var4;
   }

   private Vec3 m_9863(AABB var1, double var2, double var4, double var6) {
      double var8 = Math.min(var1.getXsize() * f_36412, f_36413);
      double var10 = Math.min(var1.getYsize() * f_36414, f_36415);
      double var12 = Math.min(var1.getZsize() * f_36416, f_36417);
      return new Vec3(
         Mth.lerp(var2, var1.minX + var8, var1.maxX - var8),
         Mth.lerp(var4, var1.minY + var10, var1.maxY - var10),
         Mth.lerp(var6, var1.minZ + var12, var1.maxZ - var12)
      );
   }

   private Class_zUtJiwnxatAkdw6h.j3pwrXthfZ4Wna2i m_9864() {
      Class_zUtJiwnxatAkdw6h.j3pwrXthfZ4Wna2i[] var1 = Class_zUtJiwnxatAkdw6h.j3pwrXthfZ4Wna2i.values();
      return var1[this.f_36178.nextInt(var1.length)];
   }

   private float m_9865(float var1) {
      float var2 = var1;

      for (int var3 = 0; var3 < 5; var3++) {
         float var4 = this.m_9850(var2, this.f_36226, this.f_36228) - var1;
         float var5 = this.m_9873(var2, this.f_36226, this.f_36228);
         if (Math.abs(var4) < f_36399 || Math.abs(var5) < f_36400) {
            break;
         }

         var2 = Mth.clamp(var2 - var4 / var5, 0.0F, 1.0F);
      }

      return var2;
   }

   private float m_9866(float var1, float var2) {
      return var1 + this.f_36178.nextFloat() * (var2 - var1);
   }

   private int m_9867() {
      return 5 + this.f_36178.nextInt(6);
   }

   @Override
   public Vector2f m_1006(Vector2f var1, Vector2f var2) {
      Aura var3 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
      LivingEntity var4 = var3.m_1114();
      if (var1 == null || var2 == null) {
         return var1 != null ? var1 : var2;
      }

      if (var4 != null && f_11537.player != null) {
         long var5 = System.nanoTime();
         boolean var7 = this.f_36182 != 0L && var5 - this.f_36182 > f_36239;
         boolean var8 = var7 || this.f_36179 != var4.getId();
         this.f_36182 = var5;
         if (var8) {
            this.m_9861(var4, var1);
         }

         this.m_9859(var4);
         if (this.m_9878(var4)) {
            return var1;
         }

         if (!var8) {
            this.f_36180++;
         }

         boolean var9 = this.f_36184;
         this.f_36184 = false;
         boolean var10 = false;
         if (this.f_36180 >= this.f_36181) {
            this.m_9846(var4, var1);
            var10 = true;
         }

         Vector2f var11 = this.m_9872(this.m_9845(var4, var2));
         Vector2f var12 = this.m_9872(this.m_9843(var4.getBoundingBox().getCenter()));
         boolean var13 = var4.getDeltaMovement().lengthSqr() < f_36240;
         boolean var14 = this.f_36197;
         this.m_9847(var1, var12, var13);
         this.m_9860(this.f_36197);
         boolean var15 = var9 || var10 || var14 != this.f_36197;
         if (this.f_36197) {
            var15 |= this.f_36189;
            this.m_9876();
         } else if (var9 || var10) {
            var15 |= this.m_9849(var1, var11, var9);
         }

         float var16;
         float var17;
         if (this.f_36197) {
            var16 = this.f_36198 + this.f_36209;
            var17 = this.f_36199 + this.f_36210;
         } else {
            var15 |= this.m_9851(var1, var11);
            var16 = var11.x + (this.f_36189 ? this.f_36194 : 0.0F) + this.f_36209;
            var17 = var11.y + (this.f_36189 ? this.f_36195 : 0.0F) + this.f_36210;
         }

         float var18 = 1.0F;
         if (this.f_36197) {
            this.m_9874();
         } else {
            this.m_9870(var1, var16, var17, var15);
            float var19 = this.m_9853(var1, var16, var17);
            float var20 = this.m_9879(var19);
            float var21 = (float)Math.sin(f_36241 * var20);
            var16 += this.f_36230 * var21;
            var17 += this.f_36231 * var21;
            var18 = this.m_9875(var19);
         }

         float var33 = Mth.wrapDegrees(var16 - var1.x);
         float var34 = var17 - var1.y;
         float var35 = (float)Math.hypot(var33, var34);
         this.m_9852();
         float var22 = Mth.clamp(var35 / f_36242, 0.0F, 1.0F);
         float var23 = this.f_36197 ? f_36243 : Mth.lerp(var22, this.f_36193 > 0 ? f_36244 : f_36245, f_36246);
         var23 *= var18;
         float var24 = Mth.lerp(var22, f_36247, f_36248) * this.f_36215 * var18;
         float var25 = Mth.lerp(var22, f_36249, f_36250) * this.f_36215 * var18;
         if (this.f_36193 > 0 && !this.f_36189) {
            var24 = Math.min(var24, f_36251);
            var25 = Math.min(var25, f_36252);
         }

         if (this.f_36197) {
            var24 = Math.min(var24, f_36253);
            var25 = Math.min(var25, f_36254);
         }

         float var26 = Mth.clamp(var33 * var23, -var24, var24);
         float var27 = Mth.clamp(var34 * var23, -var25, var25);
         if (this.f_36213 > 0 && !this.f_36197) {
            var27 *= f_36255;
            this.f_36213--;
         }

         float var28 = this.f_36197 ? f_36256 : Mth.lerp(var22, f_36257, f_36258);
         if (this.f_36193 > 0 && !this.f_36189) {
            var28 = Math.max(var28, f_36259);
         }

         float var29 = Mth.lerp(var28, this.f_36216, var26);
         float var30 = Mth.lerp(var28, this.f_36217, var27);
         float var31 = this.f_36193 > 0 ? f_36260 : (this.f_36197 ? f_36261 : f_36262);
         float var32 = this.f_36193 > 0 ? f_36263 : (this.f_36197 ? f_36264 : f_36265);
         var29 = this.m_9858(var29, var33, var31);
         var30 = this.m_9858(var30, var34, var32);
         this.f_36216 = var29;
         this.f_36217 = var30;
         if (this.f_36193 > 0 && !this.f_36189) {
            this.f_36193--;
         }

         return new Vector2f(var1.x + var29, Mth.clamp(var1.y + var30, f_36266, f_36267));
      } else {
         return var1;
      }
   }

   private float m_9868(float var1) {
      if (Math.abs(var1) > f_36418) {
         return Math.signum(var1);
      } else {
         return this.f_36178.nextBoolean() ? 1.0F : f_36419;
      }
   }

   private void m_9869() {
      this.f_36205 = false;
      this.f_36200 = 0.0F;
      this.f_36201 = 0.0F;
      this.f_36202 = 0.0F;
      this.f_36203 = 0;
      this.f_36204 = 1;
      this.f_36206 = Class_zUtJiwnxatAkdw6h.j3pwrXthfZ4Wna2i.CUBIC_BEZIER;
   }

   private void m_9870(Vector2f var1, float var2, float var3, boolean var4) {
      float var5 = Mth.wrapDegrees(var2 - this.f_36222);
      float var6 = var3 - this.f_36223;
      float var7 = (float)Math.hypot(var5, var6);
      float var8 = (float)Math.hypot(Mth.wrapDegrees(var2 - var1.x), var3 - var1.y);
      boolean var9 = this.f_36218 && this.f_36225 >= f_36342 && var8 > f_36343;
      if (var4 || !this.f_36218 || var7 > f_36344 || var9) {
         this.m_9871(var1, var2, var3);
      }
   }

   private void m_9871(Vector2f var1, float var2, float var3) {
      float var4 = Mth.wrapDegrees(var2 - var1.x);
      float var5 = var3 - var1.y;
      float var6 = (float)Math.hypot(var4, var5);
      if (var6 < f_36345) {
         this.m_9874();
      } else {
         this.f_36218 = true;
         this.f_36220 = var1.x;
         this.f_36221 = var1.y;
         this.f_36222 = var2;
         this.f_36223 = var3;
         this.f_36224 = var6;
         this.f_36225 = 0.0F;
         this.f_36219 = this.m_9864();
         this.m_9844();
         float var7 = Mth.clamp(var6 * this.m_9866(f_36346, f_36347), f_36348, f_36349);
         if (this.f_36178.nextBoolean()) {
            var7 = -var7;
         }

         this.f_36230 = -var5 / var6 * var7;
         this.f_36231 = var4 / var6 * var7 * this.m_9866(f_36350, f_36351);
      }
   }

   private Vector2f m_9872(Vector2f var1) {
      return new Vector2f(var1.x + this.f_36200, var1.y);
   }

   private float m_9873(float var1, float var2, float var3) {
      float var4 = 1.0F - var1;
      return f_36403 * var4 * var4 * var2 + f_36404 * var4 * var1 * (var3 - var2) + f_36405 * var1 * var1 * (1.0F - var3);
   }

   private void m_9874() {
      this.f_36218 = false;
      this.f_36219 = Class_zUtJiwnxatAkdw6h.j3pwrXthfZ4Wna2i.CUBIC_BEZIER;
      this.f_36220 = 0.0F;
      this.f_36221 = 0.0F;
      this.f_36222 = 0.0F;
      this.f_36223 = 0.0F;
      this.f_36224 = 0.0F;
      this.f_36225 = 0.0F;
      this.f_36226 = f_36406;
      this.f_36227 = f_36407;
      this.f_36228 = f_36408;
      this.f_36229 = f_36409;
      this.f_36230 = 0.0F;
      this.f_36231 = 0.0F;
      this.f_36232 = false;
      this.f_36233 = false;
   }

   private float m_9875(float var1) {
      if (!this.f_36218) {
         return 1.0F;
      }

      float var2 = Mth.clamp(var1, 0.0F, 1.0F);
      float var3;
      if (this.f_36219 == Class_zUtJiwnxatAkdw6h.j3pwrXthfZ4Wna2i.CUBIC_BEZIER) {
         float var4 = this.m_9865(var2);
         float var5 = this.m_9873(var4, this.f_36226, this.f_36228);
         float var6 = this.m_9873(var4, this.f_36227, this.f_36229);
         var3 = var6 / Math.max(f_36386, var5);
      } else {
         var3 = this.m_9877(this.f_36219, var2);
      }

      float var7 = this.f_36232 && var1 > f_36387 ? f_36388 : f_36389;
      return Mth.clamp(var3, var7, f_36390);
   }

   private void m_9876() {
      this.f_36189 = false;
      this.f_36191 = 0;
      this.f_36192 = 0;
      this.f_36194 = 0.0F;
      this.f_36195 = 0.0F;
      this.f_36196 = 0.0F;
   }

   private float m_9877(Class_zUtJiwnxatAkdw6h.j3pwrXthfZ4Wna2i var1, float var2) {
      float var3 = Mth.clamp(var2, 0.0F, 1.0F);

      return switch (var1) {
         case CUBIC_BEZIER -> 1.0F;
         case SINE_IN_OUT -> (float)(f_36391 * Math.sin(f_36392 * var3));
         case QUADRATIC_IN_OUT -> var3 < f_36393 ? f_36394 * var3 : f_36395 * (1.0F - var3);
         case QUARTIC_IN_OUT -> var3 < f_36396 ? f_36397 * var3 * var3 * var3 : f_36398 * (1.0F - var3) * (1.0F - var3) * (1.0F - var3);
      };
   }

   private boolean m_9878(Entity var1) {
      if (this.f_36183 <= 0) {
         return false;
      } else if (this.m_9855(var1)) {
         this.f_36183 = 0;
         return false;
      } else {
         this.f_36183--;
         this.f_36216 = 0.0F;
         this.f_36217 = 0.0F;
         return true;
      }
   }

   private float m_9879(float var1) {
      if (!this.f_36218) {
         return var1;
      }

      if (this.f_36219 != Class_zUtJiwnxatAkdw6h.j3pwrXthfZ4Wna2i.CUBIC_BEZIER) {
         return this.m_9854(this.f_36219, var1);
      }

      float var2 = this.m_9865(Mth.clamp(var1, 0.0F, 1.0F));
      return this.m_9850(var2, this.f_36227, this.f_36229);
   }

   @Override
   public Vector2f m_1007() {
      Aura var1 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
      LivingEntity var2 = var1.m_1114();
      if (var2 != null && f_11537.player != null) {
         AABB var3 = var2.getBoundingBox();
         Vec3 var4 = f_11537.player.getEyePosition();
         return this.m_9843(new Vec3(Mth.clamp(var4.x, var3.minX, var3.maxX), Mth.clamp(var4.y, var3.minY, var3.maxY), Mth.clamp(var4.z, var3.minZ, var3.maxZ)));
      } else {
         return super.m_1007();
      }
   }

   private record HvcYUY2SeNQbrvpW(double x, double y, double z, float rotationDistance) {
   }

   private enum j3pwrXthfZ4Wna2i {
      CUBIC_BEZIER,
      SINE_IN_OUT,
      QUADRATIC_IN_OUT,
      QUARTIC_IN_OUT;
   }
}
