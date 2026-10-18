package dev.dimasik.client.system;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket.Pos;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.apache.commons.lang3.math.NumberUtils;

public class Class_QKNJdceZaZX0EDkg extends Class_msKbTl6QleqYGoq3 {
   private static final String f_12239 = "vclip";
   private static final String f_12240 = "up";
   private static final String f_12241 = "down";
   private static final float f_12242 = 1000.0F;
   private static final String f_12243 = "up";
   private static final String f_12244 = "down";
   private static final String f_12245 = "value";
   private static final String f_12246 = "value";
   private static final String f_12247 = "down";
   private static final String f_12248 = "up";

   private float m_4403(BlockPos var1, boolean var2) {
      int var3 = var2 ? 1 : -1;
      int var4 = var2 ? Class_NzJrN63M7QBpmAbi.f_11537.level.getMaxY() - var1.getY() : Class_NzJrN63M7QBpmAbi.f_11537.level.getMinY() - var1.getY();
      int var5 = var2 ? 1 : -1;
      boolean var6 = false;

      for (int var7 = var3; var2 ? var7 < var4 : var7 > var4; var7 += var5) {
         BlockPos var8 = var1.offset(0, var7, 0);
         BlockPos var9 = var8.above();
         BlockState var10 = Class_NzJrN63M7QBpmAbi.f_11537.level.getBlockState(var8);
         BlockState var11 = Class_NzJrN63M7QBpmAbi.f_11537.level.getBlockState(var9);
         if (!var2 && var10.is(Blocks.BEDROCK)) {
            return 0.0F;
         }

         boolean var12 = var10.isAir();
         boolean var13 = var11.isAir();
         if (!var12) {
            var6 = true;
         } else if (!var13) {
            var6 = true;
         } else if (var6) {
            return var7;
         }
      }

      return 0.0F;
   }

   private void m_4405(float var1, boolean var2) {
      int var3 = this.m_4407(var1);

      for (int var4 = 0; var4 < 10; var4++) {
         Class_NzJrN63M7QBpmAbi.f_11537
            .player
            .connection
            .send(
               new Pos(
                  Class_NzJrN63M7QBpmAbi.f_11537.player.getX(),
                  Class_NzJrN63M7QBpmAbi.f_11537.player.getY(),
                  Class_NzJrN63M7QBpmAbi.f_11537.player.getZ(),
                  Class_NzJrN63M7QBpmAbi.f_11537.player.onGround(),
                  Class_NzJrN63M7QBpmAbi.f_11537.player.horizontalCollision
               )
            );
      }

      double var7 = Class_NzJrN63M7QBpmAbi.f_11537.player.getY() + var1;

      for (int var6 = 0; var6 < 10; var6++) {
         Class_NzJrN63M7QBpmAbi.f_11537.player.setDeltaMovement(Vec3.ZERO);
         Class_NzJrN63M7QBpmAbi.f_11537
            .player
            .connection
            .send(
               new Pos(
                  Class_NzJrN63M7QBpmAbi.f_11537.player.getX(),
                  var7,
                  Class_NzJrN63M7QBpmAbi.f_11537.player.getZ(),
                  Class_NzJrN63M7QBpmAbi.f_11537.player.onGround(),
                  Class_NzJrN63M7QBpmAbi.f_11537.player.horizontalCollision
               )
            );
         Class_NzJrN63M7QBpmAbi.f_11537.player.setPos(Class_NzJrN63M7QBpmAbi.f_11537.player.getX(), var7, Class_NzJrN63M7QBpmAbi.f_11537.player.getZ());
      }
   }

   public Class_QKNJdceZaZX0EDkg() {
      super(f_12239);
   }

   private int m_4407(float var1) {
      return Math.max((int)(Math.abs(var1) / f_12242), 3);
   }

   @Override
   public void build(LiteralArgumentBuilder<ClientSuggestionProvider> var1) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)var1.then(this.m_7628(f_12243).executes(var1x -> {
         this.m_4409(f_12248, 0.0F);
         return 1;
      }))).then(this.m_7628(f_12244).executes(var1x -> {
         this.m_4409(f_12247, 0.0F);
         return 1;
      }))).then(this.m_7624(f_12245, IntegerArgumentType.integer()).executes(var1x -> {
         int var2 = (Integer)var1x.getArgument(f_12246, Integer.class);
         this.m_4409("", var2);
         return 1;
      }));
   }

   private float m_4408(String var1) {
      return NumberUtils.isParsable(var1) ? Float.parseFloat(var1) : 0.0F;
   }

   private void m_4409(String var1, float var2) {
      if (Class_NzJrN63M7QBpmAbi.f_11537.player != null && Class_NzJrN63M7QBpmAbi.f_11537.level != null) {
         BlockPos var3 = Class_NzJrN63M7QBpmAbi.f_11537.player.blockPosition();

         float var4 = switch (var1) {
            case f_12240 -> this.m_4403(var3, true);
            case f_12241 -> this.m_4403(var3, false);
            default -> var2;
         };
         if (var4 != 0.0F) {
            this.m_4405(var4, false);
         }
      }
   }
}
