package dev.dimasik.client.module.combat;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack.Pose;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_3VHxwfI2NZKoxzIi;
import dev.dimasik.client.system.Class_81oIJPtsDGdzRKcL;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_bhSc4OUnYWSe2vjL;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_wjdoxQGtI8mFyL6U;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.common.ClientboundDisconnectPacket;
import net.minecraft.network.protocol.game.ClientboundAddEntityPacket;
import net.minecraft.network.protocol.game.ClientboundAnimatePacket;
import net.minecraft.network.protocol.game.ClientboundEntityEventPacket;
import net.minecraft.network.protocol.game.ClientboundEntityPositionSyncPacket;
import net.minecraft.network.protocol.game.ClientboundLevelParticlesPacket;
import net.minecraft.network.protocol.game.ClientboundLoginPacket;
import net.minecraft.network.protocol.game.ClientboundMoveEntityPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import net.minecraft.network.protocol.game.ClientboundRemoveEntitiesPacket;
import net.minecraft.network.protocol.game.ClientboundRespawnPacket;
import net.minecraft.network.protocol.game.ClientboundSetEntityMotionPacket;
import net.minecraft.network.protocol.game.ClientboundSetTimePacket;
import net.minecraft.network.protocol.game.ClientboundSoundPacket;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import net.minecraft.network.protocol.game.ClientboundTeleportEntityPacket;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class Backtrack extends Module {
   private final SliderSetting f_15362;
   private final SliderSetting f_15363;
   private final CheckboxSetting f_15364;
   private final List<Backtrack.WP8wUtuq49T0jAf5> f_15365;
   private Entity f_15366;
   private Vec3 f_15367;
   private Vec3 f_15368;
   private final Class_gEPk7yDw6CwIte87<Class_wjdoxQGtI8mFyL6U> f_15369;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_15370;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_15371;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_15372;
   private static final String f_15373 = "Backtrack";
   private static final String f_15374 = "Задерживает пакеты цели для удара по прошлой позиции";
   private static final String f_15375 = "Дистанция";
   private static final float f_15376 = 3.0F;
   private static final float f_15377 = 3.0F;
   private static final float f_15378 = 6.0F;
   private static final float f_15379 = 0.1F;
   private static final String f_15380 = "Задержка";
   private static final float f_15381 = 500.0F;
   private static final float f_15382 = 100.0F;
   private static final float f_15383 = 5000.0F;
   private static final float f_15384 = 50.0F;
   private static final String f_15385 = "Отображать боксы";
   private static final float f_15386 = 15.0F;
   private static final int f_15387 = -65536;
   private static final float f_15388 = 10.0F;
   private static final float f_15389 = 0.11764706F;
   private static final float f_15390 = 0.7058824F;
   private static final double f_15391 = 4096.0;
   private static final double f_15392 = 4096.0;
   private static final double f_15393 = 4096.0;

   @Override
   public void m_778() {
      this.m_5390();
   }

   private boolean m_5383(Packet<?> var1) {
      return var1 instanceof ClientboundSoundPacket
         || var1 instanceof ClientboundEntityEventPacket
         || var1 instanceof ClientboundSetTimePacket
         || var1 instanceof ClientboundLevelParticlesPacket
         || var1 instanceof ClientboundAnimatePacket
         || var1 instanceof ClientboundSystemChatPacket
         || var1 instanceof ClientboundAddEntityPacket
         || var1 instanceof ClientboundRemoveEntitiesPacket
         || var1 instanceof ClientboundPlayerPositionPacket
         || var1 instanceof ClientboundRespawnPacket
         || var1 instanceof ClientboundLoginPacket
         || var1 instanceof ClientboundDisconnectPacket;
   }

   private void m_5384(PoseStack var1, VertexConsumer var2, Vec3 var3, AABB var4, int var5) {
      float var6 = (float)(var4.minX - var3.x);
      float var7 = (float)(var4.minY - var3.y);
      float var8 = (float)(var4.minZ - var3.z);
      float var9 = (float)(var4.maxX - var3.x);
      float var10 = (float)(var4.maxY - var3.y);
      float var11 = (float)(var4.maxZ - var3.z);
      Pose var12 = var1.last();
      this.m_5391(var12, var2, var6, var7, var8, var9, var7, var8, var9, var7, var11, var6, var7, var11, var5);
      this.m_5391(var12, var2, var6, var10, var8, var6, var10, var11, var9, var10, var11, var9, var10, var8, var5);
      this.m_5391(var12, var2, var6, var7, var8, var6, var10, var8, var9, var10, var8, var9, var7, var8, var5);
      this.m_5391(var12, var2, var9, var7, var8, var9, var10, var8, var9, var10, var11, var9, var7, var11, var5);
      this.m_5391(var12, var2, var6, var7, var11, var9, var7, var11, var9, var10, var11, var6, var10, var11, var5);
      this.m_5391(var12, var2, var6, var7, var8, var6, var7, var11, var6, var10, var11, var6, var10, var8, var5);
   }

   private boolean m_5385() {
      return this.f_15366 == null && this.f_15367 == null;
   }

   private void m_5386(Class_wjdoxQGtI8mFyL6U var1) {
      if (!f_11537.isLocalServer() && f_11537.player != null && f_11537.level != null) {
         if (var1.m_9372() == Class_wjdoxQGtI8mFyL6U.Class_327mRdjAqNoPaemJ.PRE && var1.m_9371() == f_11537.player) {
            Entity var2 = var1.m_9370();
            if (var2 != null && var2 != this.f_15366 && !var2.isInvulnerable()) {
               this.f_15366 = var2;
               this.f_15368 = this.f_15367 = var2.position();
            }
         }
      }
   }

   @Override
   public void m_732() {
      this.m_5390();
   }

   private void m_5387(Packet<?> var1) {
      if (var1 instanceof ClientboundEntityPositionSyncPacket var2 && var2.id() == this.f_15366.getId()) {
         this.f_15367 = var2.values().position();
      } else if (var1 instanceof ClientboundTeleportEntityPacket var4 && var4.id() == this.f_15366.getId()) {
         this.f_15367 = var4.change().position();
      } else {
         if (var1 instanceof ClientboundMoveEntityPacket var5 && this.f_15367 != null) {
            Entity var3 = var5.getEntity(f_11537.level);
            if (var3 == this.f_15366) {
               this.f_15367 = this.f_15367.add(var5.getXa() / f_15391, var5.getYa() / f_15392, var5.getZa() / f_15393);
            }
         }
      }
   }

   private void m_5388(boolean var1) {
      synchronized (this.f_15365) {
         Iterator var3 = this.f_15365.iterator();

         while (var3.hasNext()) {
            Backtrack.WP8wUtuq49T0jAf5 var4 = (Backtrack.WP8wUtuq49T0jAf5)var3.next();
            if (f_11537.player == null || f_11537.getConnection() == null) {
               return;
            }

            if (this.f_15367 == null) {
               this.m_5389(var4.packet);
               var3.remove();
            } else {
               double var5 = f_11537.player.position().distanceTo(this.f_15367) / this.f_15362.m_8768().floatValue();
               if (var1 || !(var4.timestamp + this.f_15363.m_8768().floatValue() * var5 > System.currentTimeMillis())) {
                  this.m_5389(var4.packet);
                  var3.remove();
                  continue;
               }
               break;
            }
         }
      }
   }

   private void m_5389(Packet<?> var1) {
      try {
         ((Packet) var1).handle(f_11537.getConnection());
      } catch (Exception var3) {
      }
   }

   private void m_5390() {
      this.m_5388(true);
      this.f_15366 = null;
      this.f_15367 = null;
      this.f_15368 = null;
   }

   private void m_5391(
      Pose var1,
      VertexConsumer var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      int var15
   ) {
      var2.addVertex(var1, var3, var4, var5).setColor(var15);
      var2.addVertex(var1, var6, var7, var8).setColor(var15);
      var2.addVertex(var1, var9, var10, var11).setColor(var15);
      var2.addVertex(var1, var12, var13, var14).setColor(var15);
   }

   public Backtrack() {
      super(f_15373, f_15374, Category.COMBAT);
      this.f_15362 = new SliderSetting(f_15375, f_15376, f_15377, f_15378).m_828(f_15379);
      this.f_15363 = new SliderSetting(f_15380, f_15381, f_15382, f_15383).m_828(f_15384);
      this.f_15364 = new CheckboxSetting(f_15385, true);
      this.f_15365 = new LinkedList<>();
      this.f_15369 = this::m_5386;
      this.f_15370 = this::m_5392;
      this.f_15371 = this::m_5393;
      this.f_15372 = this::m_5395;
      this.m_795(this.f_15362, this.f_15363, this.f_15364);
   }

   private void m_5392(Class_XzpX8S5F5zd9jbuE var1) {
      if (!f_11537.isLocalServer() && f_11537.player != null && f_11537.level != null) {
         Packet var2 = var1.m_5619();
         if (this.m_5394()) {
            if (!this.m_5383(var2)) {
               if (var2 instanceof ClientboundSetEntityMotionPacket var3 && var3.id() == f_11537.player.getId()) {
                  this.m_5390();
               } else if (this.f_15366 != null) {
                  this.m_5387(var2);
                  var1.m_1582(true);
                  synchronized (this.f_15365) {
                     this.f_15365.add(new Backtrack.WP8wUtuq49T0jAf5(var2, System.currentTimeMillis()));
                  }
               }
            }
         }
      }
   }

   private void m_5393(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if ((!this.f_15365.isEmpty() || !this.m_5385()) && !f_11537.isLocalServer()) {
            if (this.m_5394()) {
               this.m_5388(false);
            } else {
               this.m_5390();
            }
         }
      }
   }

   private boolean m_5394() {
      return !this.m_5385() && f_11537.player != null && this.f_15366 != null && this.f_15367 != null
         ? this.f_15366.isAlive() && !this.f_15366.isInvulnerable() && f_11537.player.position().distanceTo(this.f_15367) <= this.f_15362.m_8768().floatValue()
         : false;
   }

   private void m_5395(Class_TZhU50s8XmBQCMP5 var1) {
      if (this.f_15364.m_8768() && this.f_15367 != null && this.f_15366 != null && !f_11537.isLocalServer()) {
         if (this.f_15366 instanceof LivingEntity var2) {
            double var10 = this.f_15366.getBbWidth() / 2.0F;
            if (this.f_15368 == null || this.f_15367.distanceTo(this.f_15368) >= 1.0) {
               this.f_15368 = this.f_15367;
            }

            this.f_15368 = Class_3VHxwfI2NZKoxzIi.m_1305(this.f_15368, this.f_15367, f_15386);
            int var5 = Class_BftdentXEtGbugJw.m_2312(f_15387, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN), 1.0F - var2.hurtTime / f_15388);
            AABB var6 = new AABB(
               this.f_15368.x - var10,
               this.f_15368.y,
               this.f_15368.z - var10,
               this.f_15368.x + var10,
               this.f_15368.y + this.f_15366.getBbHeight(),
               this.f_15368.z + var10
            );
            Vec3 var7 = var1.m_5010();
            VertexConsumer var8 = var1.m_5008().m_881(Class_81oIJPtsDGdzRKcL.f_3818);
            this.m_5384(var1.m_5006(), var8, var7, var6, Class_BftdentXEtGbugJw.m_2306(var5, f_15389));
            VertexConsumer var9 = var1.m_5008().m_881(Class_81oIJPtsDGdzRKcL.f_3816);
            Class_bhSc4OUnYWSe2vjL.m_6087(
               var1.m_5006(), var9, var7, var6.minX, var6.minY, var6.minZ, var6.maxX, var6.maxY, var6.maxZ, Class_BftdentXEtGbugJw.m_2306(var5, f_15390)
            );
         }
      }
   }

   private record WP8wUtuq49T0jAf5(Packet<?> packet, long timestamp) {
   }
}
