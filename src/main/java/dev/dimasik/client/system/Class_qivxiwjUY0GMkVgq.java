package dev.dimasik.client.system;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import lombok.Generated;

public class Class_qivxiwjUY0GMkVgq implements ArgumentType<String> {
   private List<String> f_30009;

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      StringReader var3 = new StringReader(var2.getRemaining());

      for (String var5 : this.f_30009) {
         if (var5.toLowerCase().startsWith(var3.getString().toLowerCase())) {
            var2.suggest(var5);
         }
      }

      return var2.buildFuture();
   }

   public String parse(StringReader var1) throws CommandSyntaxException {
      String var0 = var1.readUnquotedString();
      return this.f_30009.stream().filter(var1x -> var1x.equalsIgnoreCase(var0)).findFirst().get();
   }

   @Generated
   public void setList(List<String> var1) {
      this.f_30009 = var1;
   }
}
