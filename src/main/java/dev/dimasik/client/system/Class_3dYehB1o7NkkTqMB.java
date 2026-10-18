package dev.dimasik.client.system;

import lombok.Generated;
import net.minecraft.world.entity.LivingEntity;

public class Class_3dYehB1o7NkkTqMB extends Class_6u9LYKHM0SeJMktw implements Class_W36DTOFJFiIifzGK {
   private LivingEntity f_1423;

   @Generated
   protected boolean m_1313(Object var1) {
      return var1 instanceof Class_3dYehB1o7NkkTqMB;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      byte var2 = 1;
      LivingEntity var3 = this.m_1315();
      return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
   }

   @Generated
   public void m_1314(LivingEntity var1) {
      this.f_1423 = var1;
   }

   @Generated
   public LivingEntity m_1315() {
      return this.f_1423;
   }

   @Generated
   public Class_3dYehB1o7NkkTqMB(LivingEntity var1) {
      this.f_1423 = var1;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Class_3dYehB1o7NkkTqMB var2)) {
         return false;
      } else {
         if (!var2.m_1313(this)) {
            return false;
         }

         LivingEntity var3 = this.m_1315();
         LivingEntity var4 = var2.m_1315();
         return var3 == null ? var4 == null : var3.equals(var4);
      }
   }

   @Generated
   @Override
   public String toString() {
      return this.m_1315() + "";
   }
}
