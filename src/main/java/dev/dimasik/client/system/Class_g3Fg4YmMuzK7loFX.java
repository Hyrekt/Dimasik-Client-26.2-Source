package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import lombok.Generated;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.scores.DisplaySlot;
import net.minecraft.world.scores.ScoreAccess;
import net.minecraft.world.scores.ScoreHolder;

public final class Class_g3Fg4YmMuzK7loFX implements Class_NzJrN63M7QBpmAbi {
   private static final String f_20841 = "This is a utility class and cannot be instantiated";

   @Generated
   private Class_g3Fg4YmMuzK7loFX() {
      throw new UnsupportedOperationException(f_20841);
   }

   public static float m_6757(LivingEntity var0) {
      float var1 = var0.getHealth();
      ScoreHolder var2 = ScoreHolder.forNameOnly(var0.getScoreboardName());
      if (f_11537.level.getScoreboard().getDisplayObjective(DisplaySlot.BELOW_NAME) != null && var0 instanceof Player var3) {
         ScoreAccess var4 = f_11537.level
            .getScoreboard()
            .getOrCreatePlayerScore(var2, f_11537.level.getScoreboard().getDisplayObjective(DisplaySlot.BELOW_NAME));
         if (f_11537.getCurrentServer() != null && DimasikClient.m_9057().m_9049().m_2801().m_3487().m_776()) {
            var1 = var4.get();
         }
      }

      return var1;
   }
}
