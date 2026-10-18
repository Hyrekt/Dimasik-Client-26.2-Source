package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.system.Class_6oHaOrvBEHvpIU9L;
import dev.dimasik.client.system.Class_ftHu9o3WzCU3Adxm;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import net.minecraft.ChatFormatting;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.scores.PlayerTeam;

public final class LeaveTracker extends Module {
   private final Class_gEPk7yDw6CwIte87<Class_6oHaOrvBEHvpIU9L> f_15971 = this::m_5554;
   private static final String f_15972 = "LeaveTracker";
   private static final String f_15973 = "Отслеживает координаты, на которых пропадают дальние игроки";
   private static final float f_15974 = 250.0F;
   private static final String f_15975 = "CIT-";
   private static final String f_15976 = " замечен на координатах ";

   public LeaveTracker() {
      super(f_15972, f_15973, Category.MISC);
   }

   private void m_5554(Class_6oHaOrvBEHvpIU9L var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (var1.m_1580() instanceof AbstractClientPlayer var2) {
            if (!(var2 instanceof LocalPlayer) && var2 != f_11537.player) {
               if (!(f_11537.player.distanceTo(var2) < f_15974)) {
                  String var9 = var2.getGameProfile().name();
                  if (var9 != null && !var9.isBlank() && !var9.contains(f_15975)) {
                     int var4 = (int)var2.getX();
                     int var5 = (int)var2.getY();
                     int var6 = (int)var2.getZ();
                     PlayerTeam var7 = var2.getTeam();
                     MutableComponent var8 = Component.empty();
                     if (var7 != null) {
                        var8.append(var7.getPlayerPrefix());
                     }

                     var8.append(Component.literal(var9));
                     if (var7 != null) {
                        var8.append(var7.getPlayerSuffix());
                     }

                     var8.append(Component.literal(f_15976).withStyle(ChatFormatting.GRAY));
                     var8.append(Component.literal("" + var4 + var5 + var6).withStyle(ChatFormatting.WHITE));
                     Class_ftHu9o3WzCU3Adxm.m_6731(var8);
                  }
               }
            }
         }
      }
   }
}
