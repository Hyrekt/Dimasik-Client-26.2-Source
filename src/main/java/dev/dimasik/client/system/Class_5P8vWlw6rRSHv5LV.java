package dev.dimasik.client.system;

import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;

public final class Class_5P8vWlw6rRSHv5LV {
   public final Vec3 f_2507;
   public final long f_2508;
   public final long f_2509;
   public final boolean f_2510;
   public final float f_2511;
   public final int f_2512;
   public float f_2513;
   public boolean f_2514;

   public Class_5P8vWlw6rRSHv5LV(Vec3 var1, long var2, long var4, boolean var6, float var7, int var8) {
      this.f_2507 = var1;
      this.f_2508 = var2;
      this.f_2509 = var4;
      this.f_2510 = var6;
      this.f_2511 = var7;
      this.f_2512 = var8;
   }

   public float m_1475(long var1) {
      return Mth.clamp((float)(var1 - this.f_2508) / (float)this.f_2509, 0.0F, 1.0F);
   }

   public boolean m_1476(long var1) {
      return var1 - this.f_2508 > this.f_2509;
   }
}
