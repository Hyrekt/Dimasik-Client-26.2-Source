package dev.dimasik.client.system;

import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import net.minecraft.network.protocol.Packet;

public final class Class_3LQSDrJ0WJYOQ7ck implements Class_NzJrN63M7QBpmAbi {
   private static final List<Packet<?>> f_1398 = new ArrayList<>();
   private static final String f_1399 = "This is a utility class and cannot be instantiated";

   @Generated
   private Class_3LQSDrJ0WJYOQ7ck() {
      throw new UnsupportedOperationException(f_1399);
   }

   public static void m_1293(Packet<?> var0) {
      f_1398.add(var0);
      f_11537.getConnection().send(var0);
   }

   @Generated
   public static List<Packet<?>> m_1294() {
      return f_1398;
   }

   public static void m_1295(Packet<?> var0) {
      f_11537.getConnection().send(var0);
   }
}
