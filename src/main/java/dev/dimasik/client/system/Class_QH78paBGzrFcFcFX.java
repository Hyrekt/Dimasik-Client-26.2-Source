package dev.dimasik.client.system;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import dev.dimasik.client.DimasikClient;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;

public final class Class_QH78paBGzrFcFcFX extends Class_msKbTl6QleqYGoq3 {
   private static final String f_12238 = "unhook";

   @Override
   public void build(LiteralArgumentBuilder<ClientSuggestionProvider> var1) {
      var1.executes(var0 -> {
         DimasikClient.m_9057().m_9049().m_2805().m_1648();
         return 1;
      });
   }

   public Class_QH78paBGzrFcFcFX() {
      super(f_12238);
   }
}
