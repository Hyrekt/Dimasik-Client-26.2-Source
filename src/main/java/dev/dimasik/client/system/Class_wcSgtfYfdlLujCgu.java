package dev.dimasik.client.system;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Module;
import java.util.concurrent.CompletableFuture;

public class Class_wcSgtfYfdlLujCgu implements ArgumentType<String> {
   private static final String f_34460 = "\"";

   public String parse(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.readString();
      return DimasikClient.m_9057().m_9049().m_2801().stream().filter(var1x -> var1x.m_793().equals(var2.replace(f_34460, ""))).findFirst().get().m_793();
   }

   public static Class_wcSgtfYfdlLujCgu modules() {
      return new Class_wcSgtfYfdlLujCgu();
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      for (Module var4 : DimasikClient.m_9057().m_9049().m_2801()) {
         if (var4.m_793().toLowerCase().startsWith(var2.getRemaining().toLowerCase())) {
            var2.suggest(var4.m_793() + "");
         }
      }

      return var2.buildFuture();
   }
}
