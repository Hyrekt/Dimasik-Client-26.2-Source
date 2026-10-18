package dev.dimasik.client.system;

import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundEntityPositionSyncPacket;
import net.minecraft.network.protocol.game.ClientboundExplodePacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.network.protocol.game.ClientboundLevelParticlesPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import net.minecraft.network.protocol.game.ClientboundTeleportEntityPacket;
import net.minecraft.world.entity.PositionMoveRotation;
import net.minecraft.world.phys.Vec3;

public final class Class_wZXELw6B281Ic9qV extends Class_4DhobBIM8lTNckKj {
   private static final double f_34429 = 1.0E9;
   private static final double f_34430 = 1000000.0;
   private static final int f_34431 = 100000;
   private static final int f_34432 = 1000000;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_34433 = this::m_9354;
   private static final double f_34434 = 1.0E9;
   private static final double f_34435 = 1.0E9;
   private static final int f_34436 = 1000000;
   private static final double f_34437 = 1.0E9;
   private static final double f_34438 = 1.0E9;
   private static final double f_34439 = 1.0E9;
   private static final double f_34440 = 1.0E9;
   private static final double f_34441 = 1.0E9;
   private static final double f_34442 = 1.0E9;
   private static final double f_34443 = 1.0E9;
   private static final int f_34444 = 100000;
   private static final double f_34445 = 1.0E9;
   private static final double f_34446 = 1000000.0;
   private static final double f_34447 = 1000000.0;
   private static final double f_34448 = 1.0E9;

   private void m_9354(Class_XzpX8S5F5zd9jbuE var1) {
      if (f_11537.player != null && f_11537.level != null) {
         Packet var2 = var1.m_5619();
         if (var2 instanceof ClientboundExplodePacket var8) {
            if (this.m_9358(var8.center(), f_34434)
               || this.m_9355(var8.radius(), f_34435)
               || var8.blockCount() < 0
               || var8.blockCount() > f_34436
               || var8.playerKnockback().filter(var1x -> this.m_9358(var1x, f_34448)).isPresent()) {
               var1.m_1582(true);
            }
         } else if (var2 instanceof ClientboundLevelParticlesPacket var7) {
            if (this.m_9355(var7.getX(), f_34437)
               || this.m_9355(var7.getY(), f_34438)
               || this.m_9355(var7.getZ(), f_34439)
               || this.m_9355(var7.getXDist(), f_34440)
               || this.m_9355(var7.getYDist(), f_34441)
               || this.m_9355(var7.getZDist(), f_34442)
               || this.m_9355(var7.getMaxSpeed(), f_34443)
               || var7.getCount() < 0
               || var7.getCount() > f_34444) {
               var1.m_1582(true);
            }
         } else if (var2 instanceof ClientboundPlayerPositionPacket var6) {
            if (this.m_9357(var6.change(), f_34445)) {
               var1.m_1582(true);
            }
         } else if (var2 instanceof ClientboundGameEventPacket var5) {
            if (var5.getEvent() == ClientboundGameEventPacket.DEMO_EVENT) {
               var1.m_1582(true);
            }
         } else if (var2 instanceof ClientboundTeleportEntityPacket var4) {
            if (this.m_9357(var4.change(), f_34446)) {
               var1.m_1582(true);
            }
         } else {
            if (var2 instanceof ClientboundEntityPositionSyncPacket var3 && this.m_9357(var3.values(), f_34447)) {
               var1.m_1582(true);
            }
         }
      }
   }

   private boolean m_9355(double var1, double var3) {
      return !Double.isFinite(var1) || Math.abs(var1) > var3;
   }

   private boolean m_9357(PositionMoveRotation var1, double var2) {
      return var1 == null
         || this.m_9358(var1.position(), var2)
         || this.m_9358(var1.deltaMovement(), var2)
         || this.m_9355(var1.yRot(), var2)
         || this.m_9355(var1.xRot(), var2);
   }

   private boolean m_9358(Vec3 var1, double var2) {
      return var1 == null || this.m_9355(var1.x, var2) || this.m_9355(var1.y, var2) || this.m_9355(var1.z, var2);
   }
}
