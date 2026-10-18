package dev.dimasik.client.system;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.core.BlockPos;

public final class Class_rj7yTIJUyflxIxTs {
   public static final Set<BlockPos> f_30302 = ConcurrentHashMap.newKeySet();

   public static boolean m_8451(BlockPos var0) {
      return var0 != null && f_30302.contains(var0);
   }

   private Class_rj7yTIJUyflxIxTs() {
   }
}
