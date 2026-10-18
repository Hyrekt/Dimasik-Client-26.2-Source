package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.combat.Aura;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.LongSupplier;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector2f;

public class Class_FrHk789UOFu9WpSr extends Class_kkp256olqZ4F1qt3 {
   private static final long f_7517 = 16666667L;
   private static final long f_7518 = 750000L;
   private static final long f_7519 = 8000000L;
   private static final long f_7520 = 50000000L;
   private static final long f_7521 = 2000000000L;
   private static final double f_7522 = 0.016666666666666666;
   private static final float f_7523 = 0.82F;
   private static final long f_7524 = Long.MIN_VALUE;
   private final Class_dSYEfAT7aJC05RrC f_7525 = new Class_dSYEfAT7aJC05RrC();
   private final LongSupplier f_7526;
   private Class_L3ITGDRmNtD9wK8j f_7527;
   private boolean f_7528;
   private LivingEntity f_7529;
   private Object f_7530;
   private long f_7531;
   private String f_7532;
   private long f_7533;
   private long f_7534;
   private long f_7535;
   private long f_7536;
   private float f_7537;
   private float f_7538;
   private float f_7539;
   private float f_7540;
   private float f_7541;
   private float f_7542;
   private boolean f_7543;
   private static final String f_7544 = "0";
   private static final long f_7545 = Long.MIN_VALUE;
   private static final long f_7546 = Long.MIN_VALUE;
   private static final long f_7547 = Long.MIN_VALUE;
   private static final long f_7548 = Long.MIN_VALUE;
   private static final long f_7549 = Long.MIN_VALUE;
   private static final long f_7550 = 50000000L;
   private static final String f_7551 = "Nonfinite self rotation";
   private static final double f_7552 = 0.82F;
   private static final String f_7553 = "Human aim update failed";
   private static final long f_7554 = Long.MIN_VALUE;
   private static final double f_7555 = 1.0E9;
   private static final double f_7556 = 1000.0;
   private static final double f_7557 = 0.008;
   private static final double f_7558 = 0.03334;
   private static final float f_7559 = 8.0F;
   private static final float f_7560 = 33.34F;
   private static final float f_7561 = 1.0E-4F;
   private static final float f_7562 = 1.0E-4F;
   private static final double f_7563 = 0.016666666666666666;
   private static final double f_7564 = 0.016666666666666666;
   private static final float f_7565 = -90.0F;
   private static final float f_7566 = 90.0F;
   private static final String f_7567 = "GCDUtils returned a nonfinite rotation";
   private static final long f_7568 = Long.MIN_VALUE;
   private static final long f_7569 = 8000000L;
   private static final long f_7570 = -750000L;
   private static final long f_7571 = Long.MIN_VALUE;
   private static final long f_7572 = 16666667L;
   private static final long f_7573 = 16666667L;
   private static final long f_7574 = 750000L;
   private static final long f_7575 = 16666667L;
   private static final long f_7576 = Long.MIN_VALUE;
   private static final long f_7577 = Long.MIN_VALUE;
   private static final String f_7578 = "standalone-onnx-aim/policy.bin";
   private static final long f_7579 = Long.MIN_VALUE;
   private static final long f_7580 = 2000000000L;

   private void m_2669(String var1, RuntimeException var2, long var3) {
      if (this.f_7536 == f_7579 || var3 - this.f_7536 >= f_7580) {
         this.f_7536 = var3;
         System.out.println(var1 + var2.getMessage());
      }
   }

   public void m_2670() {
      this.f_7529 = null;
      this.f_7530 = null;
      this.m_2676();
   }

   @Override
   public Vector2f m_1006(Vector2f var1, Vector2f var2) {
      if (!this.f_25114 && this.f_7528) {
         return this.m_2681(var1);
      }

      this.m_2670();
      DimasikClient.m_9057().m_9052().m_6342().m_2660();
      return new Vector2f(var1.x, var1.y);
   }

   public void m_2671() {
      this.m_2679();
   }

   public Class_FrHk789UOFu9WpSr(Vec3 var1) {
      this(var1, System::nanoTime);
   }

   private boolean m_2672(LivingEntity var1) {
      return var1 != null && var1 != f_11537.player && var1.isAlive() && !var1.isRemoved() && !var1.isSpectator();
   }

   public boolean m_2673() {
      return this.f_7528;
   }

   private void m_2674(long var1) {
      if (this.f_7533 == f_7571) {
         this.f_7534 = var1 + f_7572;
      } else {
         this.f_7534 = this.f_7534 + f_7573;
         if (var1 - this.f_7534 > f_7574) {
            this.f_7534 = var1 + f_7575;
         }
      }

      this.f_7533 = var1;
   }

   private void m_2675() {
      if (this.f_7527 != null) {
         this.f_7527.m_3597();
      }

      this.f_7532 = Long.toString(++this.f_7531);
      this.f_7535 = f_7576;
      this.f_7539 = this.f_7540 = 0.0F;
      this.f_7543 = false;
   }

   private void m_2676() {
      this.f_7525.m_6335();
      this.m_2675();
      this.f_7533 = this.f_7534 = f_7577;
   }

   private boolean m_2677(long var1) {
      if (this.f_7533 == f_7568) {
         return true;
      }

      long var3 = var1 - this.f_7533;
      return var3 >= f_7569 && var1 - this.f_7534 >= f_7570;
   }

   @Override
   public boolean m_2678() {
      return false;
   }

   private void m_2679() {
      this.m_2670();
      this.f_7527 = null;
      this.f_7528 = false;
   }

   public boolean m_2680() {
      this.m_2679();
      Path var1 = FabricLoader.getInstance().getConfigDir().resolve(f_7578);

      try {
         Class_L3ITGDRmNtD9wK8j var2 = new Class_L3ITGDRmNtD9wK8j(var1, ThreadLocalRandom.current().nextLong());
         Class_t1oYgKOWaFs5u3Ch.m_8779(var2, Class_WvVvQwpWLdnJMMi9.f_15738);
         this.f_7527 = var2;
         this.f_7528 = true;
         System.out.println(var1 + "");
         return true;
      } catch (IOException | RuntimeException var3) {
         this.f_7527 = null;
         this.f_7528 = false;
         System.out.println(var1 + var3.getMessage());
         return false;
      }
   }

   public Class_FrHk789UOFu9WpSr(Vec3 var1, LongSupplier var2) {
      super(var1, Class_kkp256olqZ4F1qt3.HLSsfEOz1OozGlGI.MEDIUM);
      this.f_7532 = f_7544;
      this.f_7533 = f_7545;
      this.f_7534 = f_7546;
      this.f_7535 = f_7547;
      this.f_7536 = f_7548;
      this.f_7526 = var2;
      this.m_2680();
   }

   private Vector2f m_2681(Vector2f var1) {
      if (this.f_7527 != null && f_11537.player != null && f_11537.level != null) {
         Aura var2 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
         LivingEntity var3 = var2.m_1114();
         if (!this.m_2672(var3)) {
            this.m_2670();
            return new Vector2f(var1.x, var1.y);
         }

         long var4 = this.f_7526.getAsLong();
         if (var3 != this.f_7529 || f_11537.level != this.f_7530) {
            this.m_2670();
            this.f_7529 = var3;
            this.f_7530 = f_11537.level;
         }

         if (this.f_7533 != f_7549 && var4 - this.f_7533 > f_7550) {
            this.m_2676();
         }

         if (!this.m_2677(var4)) {
            return new Vector2f(var1.x, var1.y);
         }

         try {
            if (Float.isFinite(var1.x) && Float.isFinite(var1.y)) {
               this.f_7525.m_6334(f_7552);
               Class_dSYEfAT7aJC05RrC.TEKbDjGhGLlvYtoY var6 = this.f_7525
                  .m_6337(f_11537.player, var3, f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true), var4);
               if (var6.resetHistory()) {
                  this.m_2675();
               }

               if (var6.features() == null) {
                  return new Vector2f(var1.x, var1.y);
               }

               this.m_2674(var4);
               return this.m_2682(var1, var6.features(), var4);
            } else {
               throw new IllegalArgumentException(f_7551);
            }
         } catch (RuntimeException var7) {
            this.m_2676();
            this.m_2669(f_7553, var7, var4);
            return new Vector2f(var1.x, var1.y);
         }
      } else {
         this.m_2670();
         return new Vector2f(var1.x, var1.y);
      }
   }

   private Vector2f m_2682(Vector2f var1, float[] var2, long var3) {
      if (var2.length != 30) {
         throw new IllegalArgumentException(var2.length + "");
      }

      float[] var5 = (float[])var2.clone();
      if (this.f_7535 != f_7554) {
         double var6 = (var3 - this.f_7535) / f_7555;
         var5[0] = (float)(var6 * f_7556);
         if (!(var6 >= f_7557) || !(var6 <= f_7558)) {
            throw new IllegalStateException(var5[0] + "");
         }

         var5[12] = (float)(Mth.wrapDegrees(var1.x - this.f_7537) / var6);
         var5[13] = (float)((var1.y - this.f_7538) / var6);
      }

      if (var5[0] >= f_7559 && var5[0] <= f_7560) {
         Class_L3ITGDRmNtD9wK8j.OBQ8cwGsskDBxUIx var12 = this.f_7527.m_3605(Class_t1oYgKOWaFs5u3Ch.m_8780(var5), this.f_7532, var3);
         this.f_7535 = var3;
         this.f_7537 = var1.x;
         this.f_7538 = var1.y;
         if (var12 == null) {
            return new Vector2f(var1.x, var1.y);
         }

         if (this.f_7543 && (Math.abs(Mth.wrapDegrees(var1.x - this.f_7541)) > f_7561 || Math.abs(var1.y - this.f_7542) > f_7562)) {
            this.f_7539 = 0.0F;
            this.f_7540 = 0.0F;
         }

         float var7 = 0.0F;
         float var8 = 0.0F;
         if (var12.yawVelocity() != 0.0) {
            float var9 = (float)(var12.yawVelocity() * f_7563) + this.f_7539;
            var7 = Class_uHPXr81r5AZlFeJr.m_9128(var9);
            this.f_7539 = var9 - var7;
         }

         if (var12.pitchVelocity() != 0.0) {
            float var13 = (float)(var12.pitchVelocity() * f_7564) + this.f_7540;
            var8 = Class_uHPXr81r5AZlFeJr.m_9128(var13);
            this.f_7540 = var13 - var8;
         }

         float var14 = var1.x + var7;
         float var10 = var1.y + var8;
         float var11 = Mth.clamp(var10, f_7565, f_7566);
         if (var11 != var10) {
            this.f_7540 = 0.0F;
         }

         if (Float.isFinite(var14) && Float.isFinite(var11)) {
            this.f_7541 = var14;
            this.f_7542 = var11;
            this.f_7543 = true;
            return new Vector2f(var14, var11);
         } else {
            throw new IllegalStateException(f_7567);
         }
      } else {
         throw new IllegalStateException(var5[0] + "");
      }
   }
}
