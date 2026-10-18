package dev.dimasik.client.system;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.ChestStealer;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

public final class Class_rDgULSgEpLrIruzt extends Class_msKbTl6QleqYGoq3 {
   private static final String f_30044 = "stealer";
   private static final String f_30045 = "add";
   private static final String f_30046 = "item";
   private static final String f_30047 = "remove";
   private static final String f_30048 = "item";
   private static final String f_30049 = "list";
   private static final String f_30050 = "clear";
   private static final String f_30051 = "Кастомный список ChestStealer пуст.";
   private static final String f_30052 = ", ";
   private static final String f_30053 = ":";
   private static final String f_30054 = ":";
   private static final String f_30055 = "minecraft";
   private static final String f_30056 = "minecraft";
   private static final String f_30057 = "item";
   private static final String f_30058 = "item";

   private ChestStealer m_8359() {
      return DimasikClient.m_9057().m_9049().m_2801().m_3533();
   }

   private int m_8361(String var1) {
      Identifier var2 = this.m_8363(var1);
      if (var2 != null && BuiltInRegistries.ITEM.containsKey(var2)) {
         ChestStealer var3 = this.m_8359();
         if (!var3.m_4082(var2)) {
            Class_ftHu9o3WzCU3Adxm.m_6731(var2 + "");
            return 1;
         } else {
            this.m_8370();
            Class_ftHu9o3WzCU3Adxm.m_6731(var2 + "");
            return 1;
         }
      } else {
         Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
         return 1;
      }
   }

   private CompletableFuture<Suggestions> m_8362(SuggestionsBuilder var1) {
      String var2 = var1.getRemaining().trim().toLowerCase(Locale.ROOT);
      boolean var3 = var2.contains(f_30054);
      this.m_8359().m_4083().stream().sorted(Comparator.comparing(Identifier::toString)).forEach(var3x -> {
         String var4 = var3x.toString();
         if (var4.startsWith(var2)) {
            var1.suggest(var4);
         }

         if (!var3 && var3x.getNamespace().equals(f_30055)) {
            String var5 = var3x.getPath();
            if (var5.startsWith(var2)) {
               var1.suggest(var5);
            }
         }
      });
      return var1.buildFuture();
   }

   private Identifier m_8363(String var1) {
      return var1 != null && !var1.isBlank() ? Identifier.tryParse(var1.trim().toLowerCase(Locale.ROOT)) : null;
   }

   private CompletableFuture<Suggestions> m_8364(SuggestionsBuilder var1) {
      String var2 = var1.getRemaining().trim().toLowerCase(Locale.ROOT);
      boolean var3 = var2.contains(f_30053);
      BuiltInRegistries.ITEM.keySet().stream().sorted(Comparator.comparing(Identifier::toString)).forEach(var3x -> {
         String var4 = var3x.toString();
         if (var4.startsWith(var2)) {
            var1.suggest(var4);
         }

         if (!var3 && var3x.getNamespace().equals(f_30056)) {
            String var5 = var3x.getPath();
            if (var5.startsWith(var2)) {
               var1.suggest(var5);
            }
         }
      });
      return var1.buildFuture();
   }

   @Override
   public void build(LiteralArgumentBuilder<ClientSuggestionProvider> var1) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)var1.executes(var1x -> this.m_8367()))
                  .then(
                     this.m_7628(f_30045)
                        .then(
                           this.m_7624(f_30046, StringArgumentType.word())
                              .suggests((var1x, var2) -> this.m_8364(var2))
                              .executes(var1x -> this.m_8361(StringArgumentType.getString(var1x, f_30058)))
                        )
                  ))
               .then(
                  this.m_7628(f_30047)
                     .then(
                        this.m_7624(f_30048, StringArgumentType.word())
                           .suggests((var1x, var2) -> this.m_8362(var2))
                           .executes(var1x -> this.m_8366(StringArgumentType.getString(var1x, f_30057)))
                     )
               ))
            .then(this.m_7628(f_30049).executes(var1x -> this.m_8367())))
         .then(this.m_7628(f_30050).executes(var1x -> this.m_8369()));
   }

   private int m_8366(String var1) {
      Identifier var2 = this.m_8363(var1);
      if (var2 != null && this.m_8359().m_4079(var2)) {
         this.m_8370();
         Class_ftHu9o3WzCU3Adxm.m_6731(var2 + "");
         return 1;
      } else {
         Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
         return 1;
      }
   }

   private int m_8367() {
      List var1 = this.m_8359().m_4083().stream().sorted(Comparator.comparing(Identifier::toString)).toList();
      if (var1.isEmpty()) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_30051);
         return 1;
      } else {
         Class_ftHu9o3WzCU3Adxm.m_6731(String.join(f_30052, var1.stream().map(x -> ((Identifier)x).toString()).toList()) + "");
         return 1;
      }
   }

   private int m_8369() {
      int var1 = this.m_8359().m_4083().size();
      this.m_8359().m_4086();
      this.m_8370();
      Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
      return 1;
   }

   private void m_8370() {
      DimasikClient.m_9057().m_9049().m_2802().m_8846().m_5559();
   }

   public Class_rDgULSgEpLrIruzt() {
      super(f_30044);
   }
}
