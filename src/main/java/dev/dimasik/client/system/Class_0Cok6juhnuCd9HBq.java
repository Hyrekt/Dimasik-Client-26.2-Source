package dev.dimasik.client.system;

import java.util.UUID;
import lombok.Generated;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.multiplayer.PlayerInfo;

public final class Class_0Cok6juhnuCd9HBq implements Class_NzJrN63M7QBpmAbi {
   private static final String f_164 = "This is a utility class and cannot be instantiated";

   public static int m_683(UUID var0) {
      ClientPacketListener var1 = f_11537.getConnection();
      if (var1 == null) {
         return -1;
      }

      PlayerInfo var2 = var1.getPlayerInfo(var0);
      return var2 == null ? -1 : var2.getLatency();
   }

   @Generated
   private Class_0Cok6juhnuCd9HBq() {
      throw new UnsupportedOperationException(f_164);
   }
}
