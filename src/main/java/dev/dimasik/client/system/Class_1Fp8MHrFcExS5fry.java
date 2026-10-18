package dev.dimasik.client.system;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;

public class Class_1Fp8MHrFcExS5fry implements Class_NzJrN63M7QBpmAbi, ArgumentType<Integer> {
   private final Class_1Fp8MHrFcExS5fry.L8l4X9BRIyc3YbU9 f_489;

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      if (this.f_489 == Class_1Fp8MHrFcExS5fry.L8l4X9BRIyc3YbU9.f_486) {
         var2.suggest((int)Math.round(f_11537.player.getX()));
      } else if (this.f_489 == Class_1Fp8MHrFcExS5fry.L8l4X9BRIyc3YbU9.f_487) {
         var2.suggest((int)Math.round(f_11537.player.getY()));
      } else {
         var2.suggest((int)Math.round(f_11537.player.getZ()));
      }

      return var2.buildFuture();
   }

   public Class_1Fp8MHrFcExS5fry(Class_1Fp8MHrFcExS5fry.L8l4X9BRIyc3YbU9 var1) {
      this.f_489 = var1;
   }

   public Integer parse(StringReader var1) throws CommandSyntaxException {
      return var1.readInt();
   }

   public static Class_1Fp8MHrFcExS5fry coordinate(Class_1Fp8MHrFcExS5fry.L8l4X9BRIyc3YbU9 var0) {
      return new Class_1Fp8MHrFcExS5fry(var0);
   }

   public enum L8l4X9BRIyc3YbU9 {
      f_486,
      f_487,
      f_488;
   }
}
