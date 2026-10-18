package dev.dimasik.client.system;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.world.entity.player.Player;

public class Class_kpflxtXeu0M2qrjz implements Class_NzJrN63M7QBpmAbi, ArgumentType<String> {
   private final Class_kpflxtXeu0M2qrjz.MSZdeeOsK03SSTKV f_25117;

   public String parse(StringReader var1) throws CommandSyntaxException {
      return var1.readUnquotedString();
   }

   public static Class_kpflxtXeu0M2qrjz players(Class_kpflxtXeu0M2qrjz.MSZdeeOsK03SSTKV var0) {
      return new Class_kpflxtXeu0M2qrjz(var0);
   }

   public Class_kpflxtXeu0M2qrjz(Class_kpflxtXeu0M2qrjz.MSZdeeOsK03SSTKV var1) {
      this.f_25117 = var1;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      StringReader var3 = new StringReader(var2.getRemaining());
      if (this.f_25117 == Class_kpflxtXeu0M2qrjz.MSZdeeOsK03SSTKV.ALL) {
         for (PlayerInfo var5 : f_11537.player.connection.getListedOnlinePlayers()) {
            if (Class_fDYr9dPgi2Kr231m.m_6462().matcher(var5.getProfile().name()).matches()
               && var5.getProfile().name().toLowerCase().startsWith(var3.getString().toLowerCase())) {
               var2.suggest(var5.getProfile().name());
            }
         }
      } else {
         for (Player var7 : f_11537.level.players()) {
            if (var7.getGameProfile().name().toLowerCase().startsWith(var3.getString().toLowerCase())) {
               var2.suggest(var7.getGameProfile().name());
            }
         }
      }

      return var2.buildFuture();
   }

   public enum MSZdeeOsK03SSTKV {
      ALL,
      NEARBY;
   }
}
