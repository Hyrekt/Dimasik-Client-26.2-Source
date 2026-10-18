package dev.dimasik.client.system;

import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public final class Class_BRcL6O5snpibOFlK {
   private static final int f_5793 = 8;
   private static final int f_5794 = 4;
   private static final double f_5795 = 0.29;
   private static final double f_5796 = 1.0;
   private static final double f_5797 = 1.8;
   private final Minecraft f_5798;
   private static final double f_5799 = Double.MAX_VALUE;
   private static final double f_5800 = 0.5;
   private static final double f_5801 = 0.5;
   private static final double f_5802 = 0.5;
   private static final double f_5803 = 0.5;
   private static final double f_5804 = 0.29;
   private static final double f_5805 = 0.29;
   private static final double f_5806 = 0.29;
   private static final double f_5807 = 1.8;
   private static final double f_5808 = 0.29;
   private static final double f_5809 = 0.5;
   private static final double f_5810 = 0.5;

   private boolean m_2259(BlockPos var1) {
      if (this.f_5798.level != null && this.f_5798.level.hasChunk(var1.getX() >> 4, var1.getZ() >> 4)) {
         BlockState var2 = this.f_5798.level.getBlockState(var1);
         if (var2.getCollisionShape(this.f_5798.level, var1).isEmpty()) {
            return false;
         }

         double var3 = var1.getX() + f_5802;
         double var5 = var1.getZ() + f_5803;
         AABB var7 = new AABB(var3 - f_5804, var1.getY() + 1.0, var5 - f_5805, var3 + f_5806, var1.getY() + f_5807, var5 + f_5808);
         return this.f_5798.level.noCollision(this.f_5798.player, var7);
      } else {
         return false;
      }
   }

   public Class_BRcL6O5snpibOFlK(Minecraft var1) {
      this.f_5798 = var1;
   }

   private Optional<AbstractClientPlayer> m_2260(String var1) {
      return this.f_5798.level == null
         ? Optional.empty()
         : this.f_5798.level.players().stream().filter(var1x -> var1x.getName().getString().equalsIgnoreCase(var1)).findFirst();
   }

   public CompletableFuture<Suggestions> m_2262(SuggestionsBuilder var1) {
      if (this.f_5798.getConnection() == null) {
         return var1.buildFuture();
      }

      String var2 = var1.getRemaining().toLowerCase(Locale.ROOT);
      this.f_5798
         .getConnection()
         .getOnlinePlayers()
         .stream()
         .map(PlayerInfo::getProfile)
         .<String>map(GameProfile::name)
         .filter(var1x -> var1x != null && var1x.toLowerCase(Locale.ROOT).startsWith(var2))
         .distinct()
         .sorted(String.CASE_INSENSITIVE_ORDER)
         .forEach(var1::suggest);
      return var1.buildFuture();
   }

   public Optional<Vec3> m_2263(String var1) {
      return this.f_5798.player == null
         ? Optional.empty()
         : this.m_2260(var1).map(this::m_2264).map(var0 -> new Vec3(var0.getX() + f_5809, var0.getY(), var0.getZ() + f_5810));
   }

   private BlockPos m_2264(AbstractClientPlayer var1) {
      BlockPos var2 = var1.blockPosition();
      BlockPos var3 = null;
      double var4 = f_5799;

      for (int var6 = -4; var6 <= 4; var6++) {
         for (int var7 = -8; var7 <= 8; var7++) {
            for (int var8 = -8; var8 <= 8; var8++) {
               BlockPos var9 = var2.offset(var7, var6, var8);
               if (this.m_2259(var9)) {
                  double var10 = var9.getX() + f_5800;
                  double var12 = var9.getZ() + f_5801;
                  double var14 = var10 - var1.getX();
                  double var16 = var9.getY() - var1.getY();
                  double var18 = var12 - var1.getZ();
                  double var20 = var14 * var14 + var16 * var16 + var18 * var18;
                  if (var20 < var4) {
                     var3 = var9;
                     var4 = var20;
                  }
               }
            }
         }
      }

      return var3;
   }

   public boolean m_2265(Vec3 var1) {
      return this.f_5798.player != null && var1 != null && Double.isFinite(var1.x) && Double.isFinite(var1.y) && Double.isFinite(var1.z);
   }

   public void m_2266(Vec3 var1) {
      this.f_5798.player.setPos(var1.x, var1.y, var1.z);
   }

   public Optional<Vec3> m_2267(String var1) {
      return this.m_2260(var1).map(Entity::position);
   }
}
