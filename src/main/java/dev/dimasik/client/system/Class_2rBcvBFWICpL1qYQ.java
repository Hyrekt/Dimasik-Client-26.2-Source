package dev.dimasik.client.system;

import net.minecraft.client.Minecraft;
import net.minecraft.util.Util;

public class Class_2rBcvBFWICpL1qYQ {
   private long f_1231;
   private int f_1232;
   private final boolean f_1233;
   private int f_1234 = 0;
   private long f_1235 = 0L;
   private static final long f_1236 = 1000000000L;

   public void m_1203(int var1, Class_xRervSElQuPilsjq... var2) {
      if (this.f_1234 != var1) {
         this.f_1235 = f_1236 / var1;
         this.f_1234 = var1;
      }

      long var3 = Util.getNanos();
      long var5 = var3 - this.f_1231;
      this.f_1232 = this.f_1232 + (int)(var5 / this.f_1235);
      this.f_1231 = this.f_1231 + this.f_1232 * this.f_1235;

      for (this.f_1232 = Math.min(this.f_1232, this.f_1233 ? Math.min(this.f_1234, Minecraft.getInstance().getFps()) : this.f_1234);
         this.f_1232 > 0;
         this.f_1232--
      ) {
         for (Class_xRervSElQuPilsjq var10 : var2) {
            var10.m_9501();
         }
      }
   }

   public Class_2rBcvBFWICpL1qYQ(boolean var1) {
      this.f_1231 = Util.getNanos();
      this.f_1233 = var1;
      this.f_1232 = 0;
   }
}
