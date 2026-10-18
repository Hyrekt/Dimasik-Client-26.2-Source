package dev.dimasik.client.system;

import lombok.Generated;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.scores.PlayerTeam;

public final class Class_85GsaT81C7qK5rCn {
   private static final String f_3825 = "This is a utility class and cannot be instantiated";

   public static Component m_1755(Player var0) {
      PlayerTeam var1 = var0.getTeam();
      return (Component)(var1 != null ? var1.getPlayerPrefix() : Component.empty());
   }

   @Generated
   private Class_85GsaT81C7qK5rCn() {
      throw new UnsupportedOperationException(f_3825);
   }
}
