package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector2f;

public final class Class_8eBbS8V7lQU0fpQj implements Class_NzJrN63M7QBpmAbi {
   private static final Class_8eBbS8V7lQU0fpQj f_4087 = new Class_8eBbS8V7lQU0fpQj();
   private static final int f_4088 = 2;
   private static final int f_4089 = 1;
   private static final int f_4090 = 2;
   private static final int f_4091 = 30;
   private static final int f_4092 = -100;
   private final Object[] f_4093 = new Object[2];
   private final int[] f_4094 = new int[]{-100, -100};
   private final Class_8eBbS8V7lQU0fpQj.CVBKTA8jlkCZ9mHm f_4095 = new Class_8eBbS8V7lQU0fpQj.CVBKTA8jlkCZ9mHm();
   private int f_4096 = -100;
   private int f_4097 = -100;
   private Object f_4098;
   private Object f_4099;
   private static final double f_4100 = 90.0;
   private static final float f_4101 = -90.0F;
   private static final float f_4102 = 90.0F;

   private boolean m_1802(Object var1, Vector2f var2, Vec3 var3) {
      int var4 = f_11537.player.tickCount;
      if (var4 < this.f_4097) {
         this.m_1807();
      }

      this.f_4097 = var4;
      int var5 = this.m_1808(var1);
      if (var5 != -1) {
         this.f_4094[var5] = var4;
      }

      if (this.f_4096 == var4) {
         return false;
      } else {
         Object var6 = var5 == -1 ? null : this.f_4093[1 - var5];
         if (var6 != null && this.m_1806(1 - var5, var4) && this.f_4098 != null && this.f_4098 != var1) {
            return false;
         } else {
            this.f_4096 = var4;
            this.f_4098 = var6;
            this.f_4095.m_7466(var3);
            this.f_4095.m_1800(var2.x, var2.y);
            Class_U3Ilecg2NrGaJJQx var7 = DimasikClient.m_9057().m_9049().m_2813();
            boolean var8 = var7.m_5177(this.f_4095, 2, 30);
            if (var8 && var7.m_5180() == this.f_4095) {
               this.f_4099 = var1;
               Vector2f var9 = this.f_4095.m_1006(new Vector2f(f_11537.player.getYRot(), f_11537.player.getXRot()), this.f_4095.m_1007());
               DimasikClient.m_9057().m_9052().m_6342().m_2654().set(var9);
               return true;
            } else {
               return false;
            }
         }
      }
   }

   public static Class_8eBbS8V7lQU0fpQj m_1803() {
      return f_4087;
   }

   public boolean m_1804(Object var1) {
      return this.f_4099 == var1 && DimasikClient.m_9057().m_9049().m_2813().m_5180() == this.f_4095;
   }

   public boolean m_1805(Object var1, Vector2f var2) {
      return var1 != null && var2 != null && f_11537.player != null ? this.m_1802(var1, var2, f_11537.player.getEyePosition()) : false;
   }

   private Class_8eBbS8V7lQU0fpQj() {
   }

   private boolean m_1806(int var1, int var2) {
      int var3 = var2 - this.f_4094[var1];
      return var3 >= 0 && var3 <= 1;
   }

   public void m_1807() {
      this.f_4094[0] = -100;
      this.f_4094[1] = -100;
      this.f_4096 = -100;
      this.f_4098 = null;
      this.f_4099 = null;
   }

   private int m_1808(Object var1) {
      int var2 = this.m_1812(var1);
      if (var2 != -1) {
         return var2;
      }

      for (int var3 = 0; var3 < 2; var3++) {
         if (this.f_4093[var3] == null) {
            this.f_4093[var3] = var1;
            return var3;
         }
      }

      return -1;
   }

   private Vector2f m_1809(Vec3 var1) {
      Vec3 var2 = var1.subtract(f_11537.player.getEyePosition());
      float var3 = (float)(Math.toDegrees(Math.atan2(var2.z, var2.x)) - f_4100);
      float var4 = (float)(-Math.toDegrees(Math.atan2(var2.y, Math.sqrt(var2.x * var2.x + var2.z * var2.z))));
      return new Vector2f(Mth.wrapDegrees(var3), Mth.clamp(var4, f_4101, f_4102));
   }

   public boolean m_1810(Object var1, Vec3 var2) {
      return var1 != null && var2 != null && f_11537.player != null ? this.m_1802(var1, this.m_1809(var2), var2) : false;
   }

   public void m_1811(Object var1) {
      int var2 = this.m_1812(var1);
      if (var2 != -1) {
         this.f_4093[var2] = null;
         this.f_4094[var2] = -100;
      }

      if (this.f_4098 == var1) {
         this.f_4098 = null;
      }

      if (this.f_4099 == var1) {
         DimasikClient.m_9057().m_9049().m_2813().m_5164(this.f_4095);
         DimasikClient.m_9057().m_9052().m_6342().m_2662(this.f_4095);
         this.f_4099 = null;
      }
   }

   private int m_1812(Object var1) {
      for (int var2 = 0; var2 < 2; var2++) {
         if (this.f_4093[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   private static final class CVBKTA8jlkCZ9mHm extends Class_kkp256olqZ4F1qt3 {
      public final Vector2f f_4079 = new Vector2f();
      public static final float f_4080 = -90.0F;
      public static final float f_4081 = 90.0F;
      public static final float f_4082 = 180.0F;
      public static final float f_4083 = 180.0F;
      public static final float f_4084 = 1.0E-6F;
      public static final float f_4085 = -90.0F;
      public static final float f_4086 = 90.0F;

      @Override
      public Vector2f m_1006(Vector2f var1, Vector2f var2) {
         float var3 = Mth.wrapDegrees(var2.x - var1.x);
         float var4 = var2.y - var1.y;
         float var5 = Math.abs(var3) + Math.abs(var4);
         float var6 = var5 == 0.0F ? 0.0F : Math.abs(var3 / var5) * f_4082;
         float var7 = var5 == 0.0F ? 0.0F : Math.abs(var4 / var5) * f_4083;
         float var8 = Class_uHPXr81r5AZlFeJr.m_9139();
         float var9 = Mth.clamp(var3, -var6, var6);
         float var10 = Mth.clamp(var4, -var7, var7);
         if (var8 > f_4084) {
            var9 = Math.round(var9 / var8) * var8;
            var10 = Math.round(var10 / var8) * var8;
         }

         float var11 = var1.x + var9;
         float var12 = Mth.clamp(var1.y + var10, f_4085, f_4086);
         return new Vector2f(var11, var12);
      }

      public CVBKTA8jlkCZ9mHm() {
         super(null);
         this.m_7471(false);
         this.m_7470(true);
      }

      public void m_1800(float var1, float var2) {
         this.f_4079.set(Mth.wrapDegrees(var1), Mth.clamp(var2, f_4080, f_4081));
      }

      @Override
      public void m_1801() {
         this.f_4079.zero();
         this.f_25115 = null;
         this.f_25114 = false;
      }

      @Override
      public Vector2f m_1007() {
         return new Vector2f(this.f_4079);
      }
   }
}
