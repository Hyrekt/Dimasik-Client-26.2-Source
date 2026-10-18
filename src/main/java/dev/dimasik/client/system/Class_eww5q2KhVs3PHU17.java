package dev.dimasik.client.system;

import java.util.Arrays;
import net.minecraft.world.entity.Entity;

public final class Class_eww5q2KhVs3PHU17 extends Class_4DhobBIM8lTNckKj implements Class_NzJrN63M7QBpmAbi {
   private static final int f_19319 = 120;
   private static final Class_eww5q2KhVs3PHU17 f_19320 = new Class_eww5q2KhVs3PHU17();
   private final float[] f_19321 = new float[120];
   private int f_19322;
   private int f_19323;
   private long f_19324;
   private long f_19325;
   private float f_19326;
   private int f_19327;
   private int f_19328;
   private int f_19329;
   private int f_19330;
   private long f_19331;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_19332 = new Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo>() {
      @Override
      public int m_1780() {
         return 10000;
      }

      public void m_1781(Class_bhRaN0YSSLQRYjPo var1) {
         Class_eww5q2KhVs3PHU17.this.f_19325 = System.nanoTime();
         Class_eww5q2KhVs3PHU17.this.m_6446();
         Class_eww5q2KhVs3PHU17.this.m_6454();
      }
   };
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_19333 = new Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo>() {
      public static final float f_19317 = 1000000.0F;

      @Override
      public int m_1780() {
         return -10000;
      }

      public void m_1781(Class_bhRaN0YSSLQRYjPo var1) {
         if (Class_eww5q2KhVs3PHU17.this.f_19325 != 0L) {
            Class_eww5q2KhVs3PHU17.this.f_19326 = (float)(System.nanoTime() - Class_eww5q2KhVs3PHU17.this.f_19325) / f_19317;
         }
      }
   };
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_19334 = var1 -> this.f_19327++;
   private final Class_gEPk7yDw6CwIte87<Class_lTzchJDbvRVrnXlw> f_19335 = var1 -> this.f_19328++;
   private static final float f_19336 = 250.0F;
   private static final float f_19337 = 1000000.0F;
   private static final long f_19338 = 1000L;
   private static final float f_19339 = 0.5F;
   private static final float f_19340 = 1000.0F;
   private static final long f_19341 = 1048576L;
   private static final long f_19342 = 1048576L;

   public int m_6443() {
      return f_11537 == null ? 0 : f_11537.getFps();
   }

   public static Class_eww5q2KhVs3PHU17 m_6445() {
      return f_19320;
   }

   private void m_6446() {
      long var1 = System.nanoTime();
      if (this.f_19324 != 0L) {
         float var3 = Math.min(f_19336, (float)(var1 - this.f_19324) / f_19337);
         this.f_19321[this.f_19322] = var3;
         this.f_19322 = (this.f_19322 + 1) % 120;
         this.f_19323 = Math.min(120, this.f_19323 + 1);
      }

      this.f_19324 = var1;
   }

   public float[] m_6447() {
      float[] var1 = new float[this.f_19323];
      int var2 = (this.f_19322 - this.f_19323 + 120) % 120;

      for (int var3 = 0; var3 < this.f_19323; var3++) {
         var1[var3] = this.f_19321[(var2 + var3) % 120];
      }

      return var1;
   }

   public int m_6448() {
      return f_11537 != null && f_11537.player != null ? Class_izWUmV9vkI9fgiey.m_7352(f_11537.player) : 0;
   }

   public float m_6449() {
      if (this.f_19323 == 0) {
         return 0.0F;
      }

      float[] var1 = this.m_6447();
      Arrays.sort(var1);
      int var2 = Math.max(0, var1.length - 1 - Math.max(1, var1.length / 100));
      float var3 = Math.max(f_19339, var1[var2]);
      return f_19340 / var3;
   }

   public long m_6450() {
      return Runtime.getRuntime().maxMemory() / f_19342;
   }

   public long m_6451() {
      Runtime var1 = Runtime.getRuntime();
      return (var1.totalMemory() - var1.freeMemory()) / f_19341;
   }

   public int m_6452() {
      if (f_11537 != null && f_11537.level != null) {
         int var1 = 0;

         for (Entity var3 : f_11537.level.entitiesForRendering()) {
            var1++;
         }

         return var1;
      } else {
         return 0;
      }
   }

   public int m_6453() {
      return this.f_19330;
   }

   private Class_eww5q2KhVs3PHU17() {
   }

   private void m_6454() {
      long var1 = System.currentTimeMillis();
      if (this.f_19331 == 0L) {
         this.f_19331 = var1;
      }

      if (var1 - this.f_19331 >= f_19338) {
         this.f_19329 = this.f_19327;
         this.f_19330 = this.f_19328;
         this.f_19327 = 0;
         this.f_19328 = 0;
         this.f_19331 = var1;
      }
   }

   public float m_6455() {
      if (this.f_19323 == 0) {
         return 0.0F;
      }

      float var1 = 0.0F;

      for (int var2 = 0; var2 < this.f_19323; var2++) {
         var1 += this.f_19321[var2];
      }

      return var1 / this.f_19323;
   }

   public float m_6456() {
      return this.f_19326;
   }

   public int m_6457() {
      return this.f_19329;
   }
}
