package dev.dimasik.client.system;

import java.util.Objects;
import net.minecraft.world.item.Item;
import net.minecraft.world.phys.Vec3;

public final class Class_PwhkzxQl0NRqCDbQ {
   private final Item f_11900;
   private final Vec3 f_11901;
   private final String f_11902;
   private final int f_11903;
   private final double f_11904;

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof Class_PwhkzxQl0NRqCDbQ var2)
            ? false
            : this.f_11903 == var2.f_11903
               && Double.compare(this.f_11904, var2.f_11904) == 0
               && Objects.equals(this.f_11900, var2.f_11900)
               && Objects.equals(this.f_11901, var2.f_11901)
               && Objects.equals(this.f_11902, var2.f_11902);
      }
   }

   public String m_4228() {
      return this.f_11902;
   }

   public double m_4229() {
      return this.f_11904;
   }

   public int m_4230() {
      return this.f_11903;
   }

   public Item m_4231() {
      return this.f_11900;
   }

   public Vec3 m_4232() {
      return this.f_11901;
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.f_11900, this.f_11901, this.f_11902, this.f_11903, this.f_11904);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName() + this.f_11900 + this.f_11901 + this.f_11902 + this.f_11903 + this.f_11904;
   }

   public Class_PwhkzxQl0NRqCDbQ(Item var1, Vec3 var2, String var3, int var4, double var5) {
      this.f_11900 = var1;
      this.f_11901 = var2;
      this.f_11902 = var3;
      this.f_11903 = var4;
      this.f_11904 = var5;
   }
}
