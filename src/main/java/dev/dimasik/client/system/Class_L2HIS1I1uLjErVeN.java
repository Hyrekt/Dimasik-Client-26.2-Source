package dev.dimasik.client.system;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;

public final class Class_L2HIS1I1uLjErVeN extends Class_msKbTl6QleqYGoq3 implements Class_NzJrN63M7QBpmAbi {
   private static final String f_10280 = "way";
   private static final String f_10281 = "waypoint";
   private static final String f_10282 = "wp";
   private static final String f_10283 = "add";
   private static final String f_10284 = "name";
   private static final String f_10285 = "x";
   private static final String f_10286 = "y";
   private static final String f_10287 = "z";
   private static final String f_10288 = "remove";
   private static final String f_10289 = "name";
   private static final String f_10290 = "delete";
   private static final String f_10291 = "name";
   private static final String f_10292 = "list";
   private static final String f_10293 = "clear";
   private static final String f_10294 = "clearall";
   private static final String f_10295 = "Список точек пуст";
   private static final String f_10296 = "Точки:";
   private static final String f_10297 = "name";
   private static final String f_10298 = "name";
   private static final String f_10299 = "name";
   private static final String f_10300 = "x";
   private static final String f_10301 = "y";
   private static final String f_10302 = "z";
   private static final String f_10303 = "name";

   private int m_3396() {
      Class_ftHu9o3WzCU3Adxm.m_6731(Class_3GDSJINRhi8zNlKp.m_1271().m_1270() + "");
      return 1;
   }

   private int m_3398(String var1) {
      Class_ftHu9o3WzCU3Adxm.m_6731(Class_3GDSJINRhi8zNlKp.m_1271().m_1266(var1) ? var1 + "" : var1 + "");
      return 1;
   }

   private int m_3401() {
      if (f_11537.player == null) {
         return 0;
      }

      if (Class_3GDSJINRhi8zNlKp.m_1271().m_1268().isEmpty()) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_10295);
         return 1;
      }

      Class_ftHu9o3WzCU3Adxm.m_6731(f_10296);

      for (Class_pd4Eet3PWTOW1Bvo var2 : Class_3GDSJINRhi8zNlKp.m_1271().m_1268()) {
         BlockPos var3 = var2.pos();
         long var4 = Math.round(f_11537.player.position().distanceTo(Vec3.atCenterOf(var3)));
         Class_ftHu9o3WzCU3Adxm.m_6731(var2.name() + var3.getX() + var3.getY() + var3.getZ() + var4);
      }

      return 1;
   }

   public Class_L2HIS1I1uLjErVeN() {
      super(f_10280, f_10281, f_10282);
   }

   private int m_3403(String var1, BlockPos var2) {
      if (f_11537.player == null) {
         return 0;
      } else if (!Class_3GDSJINRhi8zNlKp.m_1271().m_1262(var1, var2)) {
         Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
         return 1;
      } else {
         Class_ftHu9o3WzCU3Adxm.m_6731(var1 + var2.getX() + var2.getY() + var2.getZ());
         return 1;
      }
   }

   @Override
   public void build(LiteralArgumentBuilder<ClientSuggestionProvider> var1) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)var1.executes(
                           var1x -> this.m_3401()
                        ))
                        .then(
                           this.m_7628(f_10283)
                              .then(
                                 ((RequiredArgumentBuilder)this.m_7624(f_10284, StringArgumentType.word())
                                       .executes(var1x -> this.m_3403(StringArgumentType.getString(var1x, f_10303), f_11537.player.blockPosition())))
                                    .then(
                                       this.m_7624(f_10285, IntegerArgumentType.integer())
                                          .then(
                                             this.m_7624(f_10286, IntegerArgumentType.integer())
                                                .then(
                                                   this.m_7624(f_10287, IntegerArgumentType.integer())
                                                      .executes(
                                                         var1x -> this.m_3403(
                                                            StringArgumentType.getString(var1x, f_10299),
                                                            new BlockPos(
                                                               IntegerArgumentType.getInteger(var1x, f_10300),
                                                               IntegerArgumentType.getInteger(var1x, f_10301),
                                                               IntegerArgumentType.getInteger(var1x, f_10302)
                                                            )
                                                         )
                                                      )
                                                )
                                          )
                                    )
                              )
                        ))
                     .then(
                        this.m_7628(f_10288)
                           .then(this.m_7624(f_10289, StringArgumentType.word()).executes(var1x -> this.m_3398(StringArgumentType.getString(var1x, f_10298))))
                     ))
                  .then(
                     this.m_7628(f_10290)
                        .then(this.m_7624(f_10291, StringArgumentType.word()).executes(var1x -> this.m_3398(StringArgumentType.getString(var1x, f_10297))))
                  ))
               .then(this.m_7628(f_10292).executes(var1x -> this.m_3401())))
            .then(this.m_7628(f_10293).executes(var1x -> this.m_3396())))
         .then(this.m_7628(f_10294).executes(var1x -> this.m_3396()));
   }
}
