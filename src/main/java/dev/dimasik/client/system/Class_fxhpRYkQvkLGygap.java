package dev.dimasik.client.system;

import java.util.UUID;

public final class Class_fxhpRYkQvkLGygap {
   private static final int f_20808 = 8;
   private UUID f_20809;
   private int f_20810 = -1;
   private int f_20811 = -1;
   private int f_20812 = -1;
   private boolean f_20813;

   public void m_6748() {
      this.f_20809 = null;
      this.f_20810 = this.f_20811 = this.f_20812 = -1;
      this.f_20813 = false;
   }

   public boolean m_6749(UUID var1) {
      return !this.f_20813 && this.f_20811 >= 0 && this.f_20809 != null && this.f_20809.equals(var1);
   }

   public void m_6750(UUID var1, int var2, boolean var3) {
      this.m_6751(var1, var2, var3, var3);
   }

   public void m_6751(UUID var1, int var2, boolean var3, boolean var4) {
      if (var1 == null || !var1.equals(this.f_20809) || var2 < this.f_20812) {
         this.m_6748();
      }

      this.f_20809 = var1;
      this.f_20812 = var2;
      if (var1 != null && var4) {
         if (this.f_20811 < 0) {
            this.f_20811 = var2;
         }

         if (!this.f_20813) {
            if (var3) {
               if (this.f_20810 < 0) {
                  this.f_20810 = var2;
               }

               this.f_20813 = var2 > this.f_20810;
            } else {
               this.f_20810 = -1;
            }

            this.f_20813 = this.f_20813 | var2 - this.f_20811 >= 8;
         }
      } else {
         this.f_20810 = this.f_20811 = -1;
         this.f_20813 = false;
      }
   }

   public boolean m_6752(UUID var1) {
      return this.f_20813 && this.f_20809 != null && this.f_20809.equals(var1);
   }
}
