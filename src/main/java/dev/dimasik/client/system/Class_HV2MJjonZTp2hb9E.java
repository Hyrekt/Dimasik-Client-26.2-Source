package dev.dimasik.client.system;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.world.phys.Vec3;

public final class Class_HV2MJjonZTp2hb9E {
   public static final double f_8094 = 0.8;
   private static final double f_8095 = 0.03;
   private static final double f_8096 = 0.05;
   private final List<Class_HV2MJjonZTp2hb9E.jnaMQ9nFLbpv6JGN> f_8097 = new ArrayList<>();
   private Class_HV2MJjonZTp2hb9E.jnaMQ9nFLbpv6JGN f_8098;
   private double f_8099;
   private static final double f_8100 = 0.8;
   private static final double f_8101 = 256.0;
   private static final double f_8102 = 0.03;
   private static final double f_8103 = 0.05;
   private static final double f_8104 = 0.8;
   private static final double f_8105 = 0.8;
   private static final double f_8106 = 0.8;

   public void m_2890() {
      this.f_8097.clear();
      this.f_8098 = null;
      this.f_8099 = 0.0;
   }

   public void m_2891(Vec3 var1, double var2, int var4) {
      if (this.f_8098 != null && (var2 < this.f_8098.time() || var2 - this.f_8098.time() >= f_8100 || var1.distanceToSqr(this.f_8098.position()) > f_8101)) {
         this.m_2890();
      }

      Class_HV2MJjonZTp2hb9E.jnaMQ9nFLbpv6JGN var5 = new Class_HV2MJjonZTp2hb9E.jnaMQ9nFLbpv6JGN(var1, var2);
      if (this.f_8098 == null) {
         this.f_8098 = var5;
         this.f_8097.add(var5);
      } else {
         double var6 = Math.max(var1.distanceTo(this.f_8098.position()) / f_8102, (var2 - this.f_8098.time()) / f_8103);
         if (var6 > 0.0) {
            double var8 = this.f_8099 + var6;
            int var10 = (int)Math.floor(var8);

            for (int var11 = 1; var11 <= var10; var11++) {
               this.f_8097.add(this.f_8098.lerp(var5, (var11 - this.f_8099) / var6));
            }

            this.f_8099 = var8 - var10;
         }

         this.f_8098 = var5;
         int var12 = 0;

         while (var12 + 1 < this.f_8097.size() && this.f_8097.get(var12 + 1).time() <= var2 - f_8104) {
            var12++;
         }

         var12 = Math.max(var12, this.f_8097.size() - var4 - 1);
         if (var12 > 0) {
            this.f_8097.subList(0, var12).clear();
         }
      }
   }

   public Class_HV2MJjonZTp2hb9E.DMX2EoiuFSpe34po m_2892(int var1) {
      if (this.f_8098 == null) {
         return new Class_HV2MJjonZTp2hb9E.DMX2EoiuFSpe34po(List.of(), 0.0);
      }

      double var2 = 0.0;
      if (this.f_8097.size() > 1 && this.f_8097.getFirst().time() < this.f_8098.time() - f_8105) {
         Class_HV2MJjonZTp2hb9E.jnaMQ9nFLbpv6JGN var4 = this.f_8097.getFirst();
         Class_HV2MJjonZTp2hb9E.jnaMQ9nFLbpv6JGN var5 = this.f_8097.get(1);
         var2 = Math.clamp((this.f_8098.time() - f_8106 - var4.time()) / (var5.time() - var4.time()), 0.0, 1.0);
      }

      double var10 = Math.min(var1 - 1, this.f_8097.size() - 1 + this.f_8099 - var2);
      int var6 = Math.min(this.f_8097.size(), (int)var10 + 1);
      ArrayList var7 = new ArrayList(var6);
      var7.add(this.f_8098);

      for (int var8 = 1; var8 < var6; var8++) {
         int var9 = this.f_8097.size() - 1 - var8;
         var7.add(this.f_8097.get(var9).lerp(this.f_8097.get(var9 + 1), this.f_8099));
      }

      return new Class_HV2MJjonZTp2hb9E.DMX2EoiuFSpe34po(var7, var10 + 1.0);
   }

   public record DMX2EoiuFSpe34po(List<Class_HV2MJjonZTp2hb9E.jnaMQ9nFLbpv6JGN> points, double length) {
   }

   public record jnaMQ9nFLbpv6JGN(Vec3 position, double time) {
      public Class_HV2MJjonZTp2hb9E.jnaMQ9nFLbpv6JGN lerp(Class_HV2MJjonZTp2hb9E.jnaMQ9nFLbpv6JGN var1, double var2) {
         return new Class_HV2MJjonZTp2hb9E.jnaMQ9nFLbpv6JGN(this.position.lerp(var1.position(), var2), this.time + (var1.time - this.time) * var2);
      }
   }
}
