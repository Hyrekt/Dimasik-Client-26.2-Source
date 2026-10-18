package dev.dimasik.client.system;

import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Optional;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket.Pos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;

public final class Class_iIkbGn13xFkduDs0 extends Class_msKbTl6QleqYGoq3 {
   private static final int f_23597 = 29999984;
   private final Class_ogbKn2n6FHWLNDRn f_23598;
   private final Class_BRcL6O5snpibOFlK f_23599;
   private final Class_gEPk7yDw6CwIte87<Class_sULPxrOl7TpPlaX6> f_23600;
   private final Class_gEPk7yDw6CwIte87<Class_3tFUGm5rgVT7VgqP> f_23601;
   private static final String f_23602 = "tp";
   private static final String f_23603 = "stop";
   private static final String f_23604 = "rw";
   private static final String f_23605 = "name";
   private static final String f_23606 = "x";
   private static final String f_23607 = "z";
   private static final String f_23608 = "name";
   private static final String f_23609 = "x";
   private static final String f_23610 = "y";
   private static final String f_23611 = "z";
   private static final int f_23612 = -29999984;
   private static final int f_23613 = 29999984;
   private static final double f_23614 = -2.9999984E7;
   private static final double f_23615 = 2.9999984E7;
   private static final String f_23616 = "x";
   private static final String f_23617 = "y";
   private static final String f_23618 = "z";
   private static final String f_23619 = "name";
   private static final String f_23620 = "x";
   private static final String f_23621 = "z";
   private static final String f_23622 = "name";

   private int m_7250() {
      this.f_23598.m_7979();
      return 1;
   }

   private int m_7251(String var1) {
      Player var2 = null;

      for (Player var4 : Minecraft.getInstance().level.players()) {
         if (var4.getGameProfile().name().equalsIgnoreCase(var1)) {
            var2 = var4;
         }
      }

      if (var2 != null) {
         for (int var5 = 0; var5 < 10; var5++) {
            Class_3LQSDrJ0WJYOQ7ck.m_1293(
               new Pos(
                  Minecraft.getInstance().player.getX(),
                  Minecraft.getInstance().player.getY(),
                  Minecraft.getInstance().player.getZ(),
                  Minecraft.getInstance().player.onGround(),
                  Minecraft.getInstance().player.horizontalCollision
               )
            );
         }

         Vec3 var6 = var2.position();

         for (int var7 = 0; var7 < 10; var7++) {
            Class_3LQSDrJ0WJYOQ7ck.m_1293(
               new Pos(var6.x, var6.y, var6.z, Minecraft.getInstance().player.onGround(), Minecraft.getInstance().player.horizontalCollision)
            );
            Minecraft.getInstance().player.setPos(var6.x, var6.y, var6.z);
         }
      }

      return 1;
   }

   private IntegerArgumentType m_7253() {
      return IntegerArgumentType.integer(f_23612, f_23613);
   }

   private int m_7255(String var1) {
      return this.m_7257(this.f_23599.m_2263(var1));
   }

   private int m_7256(double var1, double var3, double var5) {
      return this.m_7257(Optional.of(new Vec3(var1, var3, var5)));
   }

   private int m_7257(Optional<Vec3> var1) {
      if (var1.isEmpty()) {
         return 0;
      }

      Vec3 var2 = (Vec3)var1.get();
      if (!this.f_23599.m_2265(var2)) {
         return 0;
      }

      this.f_23598.m_7984();
      this.f_23599.m_2266(var2);
      return 1;
   }

   public Class_iIkbGn13xFkduDs0() {
      super(f_23602);
      Minecraft var1 = Minecraft.getInstance();
      this.f_23598 = new Class_ogbKn2n6FHWLNDRn(var1);
      this.f_23599 = new Class_BRcL6O5snpibOFlK(var1);
      this.f_23600 = var1x -> this.f_23598.m_7991();
      this.f_23601 = var1x -> this.f_23598.m_7995();
   }

   private int m_7258(int var1, int var2) {
      this.f_23598.m_7982(var1, var2);
      return 1;
   }

   @Override
   public void build(LiteralArgumentBuilder<ClientSuggestionProvider> var1) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)var1.then(this.m_7628(f_23603).executes(var1x -> this.m_7250())))
               .then(
                  ((LiteralArgumentBuilder)this.m_7628(f_23604)
                        .then(
                           this.m_7624(f_23605, StringArgumentType.word())
                              .suggests((var1x, var2) -> this.f_23599.m_2262(var2))
                              .executes(var1x -> this.m_7255(StringArgumentType.getString(var1x, f_23622)))
                        ))
                     .then(
                        this.m_7624(f_23606, this.m_7253())
                           .then(
                              this.m_7624(f_23607, this.m_7253())
                                 .executes(var1x -> this.m_7258(IntegerArgumentType.getInteger(var1x, f_23620), IntegerArgumentType.getInteger(var1x, f_23621)))
                           )
                     )
               ))
            .then(
               this.m_7624(f_23608, StringArgumentType.word())
                  .suggests((var1x, var2) -> this.f_23599.m_2262(var2))
                  .executes(var1x -> this.m_7251(StringArgumentType.getString(var1x, f_23619)))
            ))
         .then(
            this.m_7624(f_23609, this.m_7262())
               .then(
                  this.m_7624(f_23610, DoubleArgumentType.doubleArg())
                     .then(
                        this.m_7624(f_23611, this.m_7262())
                           .executes(
                              var1x -> this.m_7256(
                                 DoubleArgumentType.getDouble(var1x, f_23616),
                                 DoubleArgumentType.getDouble(var1x, f_23617),
                                 DoubleArgumentType.getDouble(var1x, f_23618)
                              )
                           )
                     )
               )
         );
   }

   private DoubleArgumentType m_7262() {
      return DoubleArgumentType.doubleArg(f_23614, f_23615);
   }
}
