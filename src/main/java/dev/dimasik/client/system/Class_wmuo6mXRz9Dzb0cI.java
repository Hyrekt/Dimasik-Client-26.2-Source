package dev.dimasik.client.system;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import dev.dimasik.client.DimasikClient;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

public final class Class_wmuo6mXRz9Dzb0cI extends Class_msKbTl6QleqYGoq3 {
   private static final Class_wmuo6mXRz9Dzb0cI.IHTm1FcKY7yYcJ4i f_34492 = new Class_wmuo6mXRz9Dzb0cI.IHTm1FcKY7yYcJ4i();
   private static final Map<String, Integer> f_34493 = Map.ofEntries(
      Map.entry(Class_wmuo6mXRz9Dzb0cI.f_34522, Class_wmuo6mXRz9Dzb0cI.f_34523),
      Map.entry(Class_wmuo6mXRz9Dzb0cI.f_34524, Class_wmuo6mXRz9Dzb0cI.f_34525),
      Map.entry(Class_wmuo6mXRz9Dzb0cI.f_34526, 255),
      Map.entry(Class_wmuo6mXRz9Dzb0cI.f_34527, Class_wmuo6mXRz9Dzb0cI.f_34528),
      Map.entry(Class_wmuo6mXRz9Dzb0cI.f_34529, Class_wmuo6mXRz9Dzb0cI.f_34530),
      Map.entry(Class_wmuo6mXRz9Dzb0cI.f_34531, Class_wmuo6mXRz9Dzb0cI.f_34532),
      Map.entry(Class_wmuo6mXRz9Dzb0cI.f_34533, Class_wmuo6mXRz9Dzb0cI.f_34534),
      Map.entry(Class_wmuo6mXRz9Dzb0cI.f_34535, 0),
      Map.entry(Class_wmuo6mXRz9Dzb0cI.f_34536, Class_wmuo6mXRz9Dzb0cI.f_34537),
      Map.entry(Class_wmuo6mXRz9Dzb0cI.f_34538, Class_wmuo6mXRz9Dzb0cI.f_34539),
      Map.entry(Class_wmuo6mXRz9Dzb0cI.f_34540, Class_wmuo6mXRz9Dzb0cI.f_34541),
      Map.entry(Class_wmuo6mXRz9Dzb0cI.f_34542, Class_wmuo6mXRz9Dzb0cI.f_34543),
      Map.entry(Class_wmuo6mXRz9Dzb0cI.f_34544, Class_wmuo6mXRz9Dzb0cI.f_34545),
      Map.entry(Class_wmuo6mXRz9Dzb0cI.f_34546, Class_wmuo6mXRz9Dzb0cI.f_34547),
      Map.entry(Class_wmuo6mXRz9Dzb0cI.f_34548, 255),
      Map.entry(Class_wmuo6mXRz9Dzb0cI.f_34549, Class_wmuo6mXRz9Dzb0cI.f_34550),
      Map.entry(Class_wmuo6mXRz9Dzb0cI.f_34551, Class_wmuo6mXRz9Dzb0cI.f_34552),
      Map.entry(Class_wmuo6mXRz9Dzb0cI.f_34553, Class_wmuo6mXRz9Dzb0cI.f_34554),
      Map.entry(Class_wmuo6mXRz9Dzb0cI.f_34555, Class_wmuo6mXRz9Dzb0cI.f_34556),
      Map.entry(Class_wmuo6mXRz9Dzb0cI.f_34557, Class_wmuo6mXRz9Dzb0cI.f_34558),
      Map.entry(Class_wmuo6mXRz9Dzb0cI.f_34559, Class_wmuo6mXRz9Dzb0cI.f_34560),
      Map.entry(Class_wmuo6mXRz9Dzb0cI.f_34561, Class_wmuo6mXRz9Dzb0cI.f_34562),
      Map.entry(Class_wmuo6mXRz9Dzb0cI.f_34563, 0),
      Map.entry(Class_wmuo6mXRz9Dzb0cI.f_34564, 0),
      Map.entry(Class_wmuo6mXRz9Dzb0cI.f_34565, Class_wmuo6mXRz9Dzb0cI.f_34566)
   );
   private static final List<String> f_34494 = List.of(
      Class_wmuo6mXRz9Dzb0cI.f_34567,
      Class_wmuo6mXRz9Dzb0cI.f_34568,
      Class_wmuo6mXRz9Dzb0cI.f_34569,
      Class_wmuo6mXRz9Dzb0cI.f_34570,
      Class_wmuo6mXRz9Dzb0cI.f_34571,
      Class_wmuo6mXRz9Dzb0cI.f_34572,
      Class_wmuo6mXRz9Dzb0cI.f_34573,
      Class_wmuo6mXRz9Dzb0cI.f_34574,
      Class_wmuo6mXRz9Dzb0cI.f_34575,
      Class_wmuo6mXRz9Dzb0cI.f_34576,
      Class_wmuo6mXRz9Dzb0cI.f_34577,
      Class_wmuo6mXRz9Dzb0cI.f_34578,
      Class_wmuo6mXRz9Dzb0cI.f_34579,
      Class_wmuo6mXRz9Dzb0cI.f_34580,
      Class_wmuo6mXRz9Dzb0cI.f_34581,
      Class_wmuo6mXRz9Dzb0cI.f_34582,
      Class_wmuo6mXRz9Dzb0cI.f_34583
   );
   private static final String f_34495 = "blockesp";
   private static final String f_34496 = "add";
   private static final String f_34497 = "shulkers";
   private static final String f_34498 = "color";
   private static final String f_34499 = "target";
   private static final String f_34500 = "color";
   private static final String f_34501 = "remove";
   private static final String f_34502 = "target";
   private static final String f_34503 = "list";
   private static final String f_34504 = "clear";
   private static final String f_34505 = "Список BlockESP пуст.";
   private static final String f_34506 = "Список BlockESP:";
   private static final String f_34507 = ":";
   private static final String f_34508 = ":";
   private static final String f_34509 = "minecraft";
   private static final String f_34510 = "#ffffff";
   private static final String f_34511 = "#FFFFFF";
   private static final String f_34512 = "#";
   private static final String f_34513 = "0x";
   private static final String f_34514 = "[0-9a-f]{6}|[0-9a-f]{8}";
   private static final int f_34515 = 16777215;
   private static final String f_34516 = "#%06X";
   private static final int f_34517 = 16777215;
   private static final String f_34518 = "target";
   private static final String f_34519 = "target";
   private static final String f_34520 = "color";
   private static final String f_34521 = "color";
   private static final String f_34522 = "white";
   private static final int f_34523 = 16777215;
   private static final String f_34524 = "red";
   private static final int f_34525 = 16711680;
   private static final String f_34526 = "blue";
   private static final String f_34527 = "green";
   private static final int f_34528 = 65280;
   private static final String f_34529 = "yellow";
   private static final int f_34530 = 16776960;
   private static final String f_34531 = "cyan";
   private static final int f_34532 = 65535;
   private static final String f_34533 = "magenta";
   private static final int f_34534 = 16711935;
   private static final String f_34535 = "black";
   private static final String f_34536 = "gray";
   private static final int f_34537 = 8421504;
   private static final String f_34538 = "orange";
   private static final int f_34539 = 16744448;
   private static final String f_34540 = "purple";
   private static final int f_34541 = 8388863;
   private static final String f_34542 = "pink";
   private static final int f_34543 = 16738740;
   private static final String f_34544 = "белый";
   private static final int f_34545 = 16777215;
   private static final String f_34546 = "красный";
   private static final int f_34547 = 16711680;
   private static final String f_34548 = "синий";
   private static final String f_34549 = "зелёный";
   private static final int f_34550 = 65280;
   private static final String f_34551 = "зеленый";
   private static final int f_34552 = 65280;
   private static final String f_34553 = "жёлтый";
   private static final int f_34554 = 16776960;
   private static final String f_34555 = "желтый";
   private static final int f_34556 = 16776960;
   private static final String f_34557 = "голубой";
   private static final int f_34558 = 65535;
   private static final String f_34559 = "фиолетовый";
   private static final int f_34560 = 8388863;
   private static final String f_34561 = "розовый";
   private static final int f_34562 = 16738740;
   private static final String f_34563 = "чёрный";
   private static final String f_34564 = "черный";
   private static final String f_34565 = "серый";
   private static final int f_34566 = 8421504;
   private static final String f_34567 = "minecraft:shulker_box";
   private static final String f_34568 = "minecraft:white_shulker_box";
   private static final String f_34569 = "minecraft:orange_shulker_box";
   private static final String f_34570 = "minecraft:magenta_shulker_box";
   private static final String f_34571 = "minecraft:light_blue_shulker_box";
   private static final String f_34572 = "minecraft:yellow_shulker_box";
   private static final String f_34573 = "minecraft:lime_shulker_box";
   private static final String f_34574 = "minecraft:pink_shulker_box";
   private static final String f_34575 = "minecraft:gray_shulker_box";
   private static final String f_34576 = "minecraft:light_gray_shulker_box";
   private static final String f_34577 = "minecraft:cyan_shulker_box";
   private static final String f_34578 = "minecraft:purple_shulker_box";
   private static final String f_34579 = "minecraft:blue_shulker_box";
   private static final String f_34580 = "minecraft:brown_shulker_box";
   private static final String f_34581 = "minecraft:green_shulker_box";
   private static final String f_34582 = "minecraft:red_shulker_box";
   private static final String f_34583 = "minecraft:black_shulker_box";

   private Integer m_9373(String var1) {
      if (var1 != null && !var1.isBlank()) {
         String var2 = var1.trim().toLowerCase(Locale.ROOT);
         Integer var3 = f_34493.get(var2);
         if (var3 != null) {
            return var3;
         }

         if (var2.startsWith(f_34512)) {
            var2 = var2.substring(1);
         }

         if (var2.startsWith(f_34513)) {
            var2 = var2.substring(2);
         }

         if (!var2.matches(f_34514)) {
            return null;
         }

         try {
            long var4 = Long.parseLong(var2, 16);
            return (int)var4 & f_34515;
         } catch (NumberFormatException var6) {
            return null;
         }
      } else {
         return null;
      }
   }

   private void m_9377(SuggestionsBuilder var1, String var2, boolean var3, Identifier var4) {
      String var5 = var4.toString();
      if (var5.startsWith(var2)) {
         var1.suggest(var5);
      }

      if (!var3 && var4.getNamespace().equals(f_34509)) {
         String var6 = var4.getPath();
         if (var6.startsWith(var2)) {
            var1.suggest(var6);
         }
      }
   }

   @Override
   public void build(LiteralArgumentBuilder<ClientSuggestionProvider> var1) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)var1.then(
                  ((LiteralArgumentBuilder)this.m_7628(f_34496)
                        .then(
                           this.m_7628(f_34497)
                              .then(
                                 this.m_7624(f_34498, f_34492)
                                    .suggests((var1x, var2) -> this.m_9392(var2))
                                    .executes(var1x -> this.m_9396((String)var1x.getArgument(f_34521, String.class)))
                              )
                        ))
                     .then(
                        this.m_7624(f_34499, f_34492)
                           .suggests((var1x, var2) -> this.m_9379(var2))
                           .then(
                              this.m_7624(f_34500, f_34492)
                                 .suggests((var1x, var2) -> this.m_9392(var2))
                                 .executes(
                                    var1x -> this.m_9389((String)var1x.getArgument(f_34519, String.class), (String)var1x.getArgument(f_34520, String.class))
                                 )
                           )
                     )
               ))
               .then(
                  this.m_7628(f_34501)
                     .then(
                        this.m_7624(f_34502, f_34492)
                           .suggests((var1x, var2) -> this.m_9394(var2))
                           .executes(var1x -> this.m_9387((String)var1x.getArgument(f_34518, String.class)))
                     )
               ))
            .then(this.m_7628(f_34503).executes(var1x -> this.m_9393())))
         .then(this.m_7628(f_34504).executes(var1x -> this.m_9385()));
   }

   private CompletableFuture<Suggestions> m_9379(SuggestionsBuilder var1) {
      String var2 = var1.getRemaining().toLowerCase(Locale.ROOT);
      boolean var3 = var2.contains(f_34507);
      Stream.<Identifier>concat(BuiltInRegistries.BLOCK.keySet().stream(), BuiltInRegistries.ENTITY_TYPE.keySet().stream())
         .distinct()
         .sorted(Comparator.comparing(Identifier::toString))
         .forEach(var4 -> this.m_9377(var1, var2, var3, var4));
      return var1.buildFuture();
   }

   private String m_9380(int var1) {
      return String.format(f_34516, var1 & f_34517);
   }

   private Class_J32sUe2fy1OIemnb m_9381() {
      return DimasikClient.m_9057().m_9049().m_2810();
   }

   private void m_9382() {
      DimasikClient.m_9057().m_9049().m_2802().m_8852().m_5559();
   }

   private int m_9385() {
      int var1 = this.m_9381().m_3167();
      this.m_9382();
      Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
      return 1;
   }

   private int m_9387(String var1) {
      String var2 = Class_J32sUe2fy1OIemnb.m_3169(var1);
      if (var2 != null && this.m_9381().m_3168(var2)) {
         this.m_9382();
         Class_ftHu9o3WzCU3Adxm.m_6731(var2 + "");
         return 1;
      } else {
         Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
         return 1;
      }
   }

   private int m_9389(String var1, String var2) {
      String var3 = Class_J32sUe2fy1OIemnb.m_3169(var1);
      Identifier var4 = var3 == null ? null : Identifier.tryParse(var3);
      if (var4 != null && (BuiltInRegistries.BLOCK.containsKey(var4) || BuiltInRegistries.ENTITY_TYPE.containsKey(var4))) {
         Integer var5 = this.m_9373(var2);
         if (var5 == null) {
            Class_ftHu9o3WzCU3Adxm.m_6731(var2 + "");
            return 1;
         } else {
            this.m_9381().m_3164(var3, var5);
            this.m_9382();
            Class_ftHu9o3WzCU3Adxm.m_6731(var3 + this.m_9380(var5));
            return 1;
         }
      } else {
         Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
         return 1;
      }
   }

   private CompletableFuture<Suggestions> m_9392(SuggestionsBuilder var1) {
      String var2 = var1.getRemaining().toLowerCase(Locale.ROOT);
      f_34493.keySet().stream().sorted().filter(var1x -> var1x.startsWith(var2)).forEach(var1::suggest);
      if (var2.isEmpty() || f_34510.startsWith(var2)) {
         var1.suggest(f_34511);
      }

      return var1.buildFuture();
   }

   private int m_9393() {
      List var1 = this.m_9381().m_3166().stream().sorted(Comparator.comparing(Class_J32sUe2fy1OIemnb.Oybn1scxKSxj8sN9::target)).toList();
      if (var1.isEmpty()) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_34505);
         return 1;
      }

      Class_ftHu9o3WzCU3Adxm.m_6731(f_34506);

      for (Object var3_obj : var1) {
         Class_J32sUe2fy1OIemnb.Oybn1scxKSxj8sN9 var3 = (Class_J32sUe2fy1OIemnb.Oybn1scxKSxj8sN9)var3_obj;
         Class_ftHu9o3WzCU3Adxm.m_6731(var3.target() + this.m_9380(var3.color()));
      }

      Class_ftHu9o3WzCU3Adxm.m_6731(var1.size() + "");
      return 1;
   }

   private CompletableFuture<Suggestions> m_9394(SuggestionsBuilder var1) {
      String var2 = var1.getRemaining().toLowerCase(Locale.ROOT);
      boolean var3 = var2.contains(f_34508);
      this.m_9381()
         .m_3166()
         .stream()
         .map(Class_J32sUe2fy1OIemnb.Oybn1scxKSxj8sN9::target)
         .<Identifier>map(Identifier::tryParse)
         .filter(var0 -> var0 != null)
         .sorted(Comparator.comparing(Identifier::toString))
         .forEach(var4 -> this.m_9377(var1, var2, var3, var4));
      return var1.buildFuture();
   }

   public Class_wmuo6mXRz9Dzb0cI() {
      super(f_34495);
   }

   private int m_9396(String var1) {
      Integer var2 = this.m_9373(var1);
      if (var2 == null) {
         Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
         return 1;
      }

      for (String var4 : f_34494) {
         this.m_9381().m_3164(var4, var2);
      }

      this.m_9382();
      Class_ftHu9o3WzCU3Adxm.m_6731(this.m_9380(var2) + "");
      return 1;
   }

   private static final class IHTm1FcKY7yYcJ4i implements ArgumentType<String> {
      public static final SimpleCommandExceptionType f_34490 = new SimpleCommandExceptionType(
         Component.literal(Class_wmuo6mXRz9Dzb0cI.IHTm1FcKY7yYcJ4i.f_34491)
      );
      public static final String f_34491 = "Ожидалось значение";

      public IHTm1FcKY7yYcJ4i() {
      }

      public String parse(StringReader var1) throws CommandSyntaxException {
         int var2 = var1.getCursor();

         while (var1.canRead() && !Character.isWhitespace(var1.peek())) {
            var1.skip();
         }

         if (var1.getCursor() == var2) {
            throw f_34490.createWithContext(var1);
         } else {
            return var1.getString().substring(var2, var1.getCursor());
         }
      }
   }
}
