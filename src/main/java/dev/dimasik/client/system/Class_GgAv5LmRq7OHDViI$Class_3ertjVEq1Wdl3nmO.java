package dev.dimasik.client.system;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import net.minecraft.world.phys.Vec3;

public final class Class_GgAv5LmRq7OHDViI$Class_3ertjVEq1Wdl3nmO {
   public final Builder<Integer, Vec3> f_7824 = ImmutableMap.builder();

   public Class_GgAv5LmRq7OHDViI.tewcpbtBeD7Qhqn6 m_2827() {
      return new Class_GgAv5LmRq7OHDViI.tewcpbtBeD7Qhqn6(this.f_7824.build());
   }

   public Class_GgAv5LmRq7OHDViI$Class_3ertjVEq1Wdl3nmO m_2828(int var1, double var2, double var4, double var6) {
      this.f_7824.put(var1, new Vec3(var2, var4, var6));
      return this;
   }
}
