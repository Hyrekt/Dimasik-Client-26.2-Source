package dev.dimasik.client.system;

import net.minecraft.world.phys.Vec3;

public final class Class_Hu2eXItMRRg3g9gb {
   private Vec3 f_8250 = Vec3.ZERO;
   private Vec3 f_8251 = Vec3.ZERO;
   private boolean f_8252;
   private boolean f_8253;

   public void m_2946(Vec3 var1, boolean var2) {
      this.f_8251 = var1.subtract(this.f_8250);
      this.f_8250 = var1;
      this.f_8252 = var2;
      this.f_8253 = true;
   }

   public void m_2947() {
      if (!this.f_8253) {
         this.f_8251 = Vec3.ZERO;
      }

      this.f_8253 = false;
   }

   public Class_Hu2eXItMRRg3g9gb.TqWYbo6sw0sBmqfg m_2948() {
      return new Class_Hu2eXItMRRg3g9gb.TqWYbo6sw0sBmqfg(this.f_8250, this.f_8251, this.f_8252);
   }

   public void m_2949(Vec3 var1, boolean var2) {
      this.f_8250 = var1;
      this.f_8252 = var2;
      this.f_8251 = Vec3.ZERO;
      this.f_8253 = false;
   }

   public record TqWYbo6sw0sBmqfg(Vec3 position, Vec3 movement, boolean onGround) {
      public Vec3 inherited() {
         return new Vec3(this.movement.x, this.onGround ? 0.0 : this.movement.y, this.movement.z);
      }
   }
}
