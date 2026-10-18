package dev.dimasik.client.system;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.render.FakePlayer;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public final class Class_bFyrsdfJijUF7flU extends Class_msKbTl6QleqYGoq3 {
   private static final Class_bFyrsdfJijUF7flU.Z99STNFPDzIIePo9 f_17611 = new Class_bFyrsdfJijUF7flU.Z99STNFPDzIIePo9();
   private static final Map<String, EquipmentSlot> f_17612 = Map.of(
      Class_bFyrsdfJijUF7flU.f_17654,
      EquipmentSlot.HEAD,
      Class_bFyrsdfJijUF7flU.f_17655,
      EquipmentSlot.CHEST,
      Class_bFyrsdfJijUF7flU.f_17656,
      EquipmentSlot.LEGS,
      Class_bFyrsdfJijUF7flU.f_17657,
      EquipmentSlot.FEET,
      Class_bFyrsdfJijUF7flU.f_17658,
      EquipmentSlot.MAINHAND,
      Class_bFyrsdfJijUF7flU.f_17659,
      EquipmentSlot.OFFHAND
   );
   private static final String f_17613 = "fakeplayer";
   private static final String f_17614 = "fake";
   private static final String f_17615 = "add";
   private static final String f_17616 = "name";
   private static final String f_17617 = "remove";
   private static final String f_17618 = "name";
   private static final String f_17619 = "equip";
   private static final String f_17620 = "name";
   private static final String f_17621 = "slot";
   private static final String f_17622 = "item";
   private static final String f_17623 = "count";
   private static final String f_17624 = "give";
   private static final String f_17625 = "name";
   private static final String f_17626 = "item";
   private static final String f_17627 = "count";
   private static final String f_17628 = "copy";
   private static final String f_17629 = "name";
   private static final String f_17630 = "list";
   private static final String f_17631 = "clear";
   private static final String f_17632 = "Не удалось добавить FakePlayer: имя занято или мир не загружен.";
   private static final String f_17633 = "Не удалось выдать предмет: игрок не найден или инвентарь заполнен.";
   private static final String f_17634 = "Список FakePlayer пуст.";
   private static final String f_17635 = ", ";
   private static final String f_17636 = ":";
   private static final String f_17637 = ":";
   private static final String f_17638 = "minecraft";
   private static final String f_17639 = "name";
   private static final String f_17640 = "name";
   private static final String f_17641 = "item";
   private static final String f_17642 = "count";
   private static final String f_17643 = "name";
   private static final String f_17644 = "item";
   private static final String f_17645 = "name";
   private static final String f_17646 = "slot";
   private static final String f_17647 = "item";
   private static final String f_17648 = "count";
   private static final String f_17649 = "name";
   private static final String f_17650 = "slot";
   private static final String f_17651 = "item";
   private static final String f_17652 = "name";
   private static final String f_17653 = "name";
   private static final String f_17654 = "head";
   private static final String f_17655 = "chest";
   private static final String f_17656 = "legs";
   private static final String f_17657 = "feet";
   private static final String f_17658 = "mainhand";
   private static final String f_17659 = "offhand";

   private int m_6001() {
      int var1 = this.m_6016().m_8421();
      Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
      return 1;
   }

   public Class_bFyrsdfJijUF7flU() {
      super(f_17613, f_17614);
   }

   private int m_6002(String var1) {
      if (!this.m_6016().m_8414(var1)) {
         Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
         return 1;
      } else {
         Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
         return 1;
      }
   }

   private int m_6003() {
      List var1 = this.m_6016().m_8420();
      if (var1.isEmpty()) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_17634);
         return 1;
      } else {
         Class_ftHu9o3WzCU3Adxm.m_6731(String.join(f_17635, var1) + "");
         return 1;
      }
   }

   private int m_6004(String var1, String var2, int var3) {
      ItemStack var4 = this.m_6011(var2, var3);
      if (var4 == null) {
         return 1;
      } else if (!this.m_6016().m_8411((String)var1, var4)) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_17633);
         return 1;
      } else {
         Class_ftHu9o3WzCU3Adxm.m_6731(var1 + BuiltInRegistries.ITEM.getKey(var4.getItem()) + var4.getCount());
         return 1;
      }
   }

   @Override
   public void build(LiteralArgumentBuilder<ClientSuggestionProvider> var1) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)var1.executes(
                              var1x -> this.m_6003()
                           ))
                           .then(
                              ((LiteralArgumentBuilder)this.m_7628(f_17615).executes(var1x -> this.m_6028(null)))
                                 .then(
                                    this.m_7624(f_17616, StringArgumentType.word())
                                       .executes(var1x -> this.m_6028(StringArgumentType.getString(var1x, f_17653)))
                                 )
                           ))
                        .then(
                           this.m_7628(f_17617)
                              .then(
                                 this.m_7624(f_17618, StringArgumentType.word())
                                    .suggests((var1x, var2) -> this.m_6008(var2))
                                    .executes(var1x -> this.m_6026(StringArgumentType.getString(var1x, f_17652)))
                              )
                        ))
                     .then(
                        this.m_7628(f_17619)
                           .then(
                              this.m_7624(f_17620, StringArgumentType.word())
                                 .suggests((var1x, var2) -> this.m_6008(var2))
                                 .then(
                                    this.m_7624(f_17621, StringArgumentType.word())
                                       .suggests((var1x, var2) -> this.m_6021(var2))
                                       .then(
                                          ((RequiredArgumentBuilder)this.m_7624(f_17622, f_17611)
                                                .suggests((var1x, var2) -> this.m_6022(var2))
                                                .executes(
                                                   var1x -> this.m_6024(
                                                      StringArgumentType.getString(var1x, f_17649),
                                                      StringArgumentType.getString(var1x, f_17650),
                                                      (String)var1x.getArgument(f_17651, String.class),
                                                      1
                                                   )
                                                ))
                                             .then(
                                                this.m_7624(f_17623, IntegerArgumentType.integer(1, 99))
                                                   .executes(
                                                      var1x -> this.m_6024(
                                                         StringArgumentType.getString(var1x, f_17645),
                                                         StringArgumentType.getString(var1x, f_17646),
                                                         (String)var1x.getArgument(f_17647, String.class),
                                                         IntegerArgumentType.getInteger(var1x, f_17648)
                                                      )
                                                   )
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(
                     this.m_7628(f_17624)
                        .then(
                           this.m_7624(f_17625, StringArgumentType.word())
                              .suggests((var1x, var2) -> this.m_6008(var2))
                              .then(
                                 ((RequiredArgumentBuilder)this.m_7624(f_17626, f_17611)
                                       .suggests((var1x, var2) -> this.m_6022(var2))
                                       .executes(
                                          var1x -> this.m_6004(
                                             StringArgumentType.getString(var1x, f_17643), (String)var1x.getArgument(f_17644, String.class), 1
                                          )
                                       ))
                                    .then(
                                       this.m_7624(f_17627, IntegerArgumentType.integer(1, 99))
                                          .executes(
                                             var1x -> this.m_6004(
                                                StringArgumentType.getString(var1x, f_17640),
                                                (String)var1x.getArgument(f_17641, String.class),
                                                IntegerArgumentType.getInteger(var1x, f_17642)
                                             )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  this.m_7628(f_17628)
                     .then(
                        this.m_7624(f_17629, StringArgumentType.word())
                           .suggests((var1x, var2) -> this.m_6008(var2))
                           .executes(var1x -> this.m_6002(StringArgumentType.getString(var1x, f_17639)))
                     )
               ))
            .then(this.m_7628(f_17630).executes(var1x -> this.m_6003())))
         .then(this.m_7628(f_17631).executes(var1x -> this.m_6001()));
   }

   private CompletableFuture<Suggestions> m_6008(SuggestionsBuilder var1) {
      String var2 = var1.getRemaining().toLowerCase(Locale.ROOT);
      this.m_6016()
         .m_8420()
         .stream()
         .sorted(String.CASE_INSENSITIVE_ORDER)
         .filter(var1x -> var1x.toLowerCase(Locale.ROOT).startsWith(var2))
         .forEach(var1::suggest);
      return var1.buildFuture();
   }

   private ItemStack m_6011(String var1, int var2) {
      Identifier var3 = this.m_6018(var1);
      if (var3 != null && BuiltInRegistries.ITEM.containsKey(var3)) {
         Item var4 = (Item)BuiltInRegistries.ITEM.getValue(var3);
         ItemStack var5 = new ItemStack(var4);
         var5.setCount(Math.clamp(var2, 1, var5.getMaxStackSize()));
         return var5;
      } else {
         Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
         return null;
      }
   }

   private FakePlayer m_6016() {
      return DimasikClient.m_9057().m_9049().m_2801().m_3499();
   }

   private Identifier m_6018(String var1) {
      if (var1 != null && !var1.isBlank()) {
         String var2 = var1.trim().toLowerCase(Locale.ROOT);
         if (!var2.contains(f_17636)) {
            var2 = var2 + "";
         }

         return Identifier.tryParse(var2);
      } else {
         return null;
      }
   }

   private CompletableFuture<Suggestions> m_6021(SuggestionsBuilder var1) {
      String var0 = var1.getRemaining().toLowerCase(Locale.ROOT);
      f_17612.keySet().stream().sorted().filter(var1x -> var1x.startsWith(var0)).forEach(var1::suggest);
      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> m_6022(SuggestionsBuilder var1) {
      String var2 = var1.getRemaining().toLowerCase(Locale.ROOT);
      boolean var3 = var2.contains(f_17637);
      BuiltInRegistries.ITEM.keySet().stream().sorted(Comparator.comparing(Identifier::toString)).forEach(var3x -> {
         String var4 = var3x.toString();
         if (var4.startsWith(var2)) {
            var1.suggest(var4);
         }

         if (!var3 && var3x.getNamespace().equals(f_17638) && var3x.getPath().startsWith(var2)) {
            var1.suggest(var3x.getPath());
         }
      });
      return var1.buildFuture();
   }

   private int m_6024(String var1, String var2, String var3, int var4) {
      EquipmentSlot var5 = f_17612.get(var2.toLowerCase(Locale.ROOT));
      if (var5 == null) {
         Class_ftHu9o3WzCU3Adxm.m_6731(var2 + "");
         return 1;
      } else {
         ItemStack var6 = this.m_6011(var3, var4);
         if (var6 == null) {
            return 1;
         } else if (!this.m_6016().m_8417(var1, var5, var6)) {
            Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
            return 1;
         } else {
            Class_ftHu9o3WzCU3Adxm.m_6731(var1 + var2 + BuiltInRegistries.ITEM.getKey(var6.getItem()) + var6.getCount());
            return 1;
         }
      }
   }

   private int m_6026(String var1) {
      if (!this.m_6016().m_8416(var1)) {
         Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
         return 1;
      } else {
         Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
         return 1;
      }
   }

   private int m_6028(String var1) {
      RemotePlayer var2 = this.m_6016().m_8413(var1);
      if (var2 == null) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_17632);
         return 1;
      } else {
         Class_ftHu9o3WzCU3Adxm.m_6731(var2.getGameProfile().name() + "");
         return 1;
      }
   }

   private static final class Z99STNFPDzIIePo9 implements ArgumentType<String> {
      public static final SimpleCommandExceptionType f_17609 = new SimpleCommandExceptionType(
         Component.literal(Class_bFyrsdfJijUF7flU.Z99STNFPDzIIePo9.f_17610)
      );
      public static final String f_17610 = "Ожидался предмет";

      public String parse(StringReader var1) throws CommandSyntaxException {
         int var2 = var1.getCursor();

         while (var1.canRead() && !Character.isWhitespace(var1.peek())) {
            var1.skip();
         }

         if (var1.getCursor() == var2) {
            throw f_17609.createWithContext(var1);
         } else {
            return var1.getString().substring(var2, var1.getCursor());
         }
      }

      public Z99STNFPDzIIePo9() {
      }
   }
}
