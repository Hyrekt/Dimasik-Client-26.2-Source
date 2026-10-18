package dev.dimasik.client.module.combat;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundDamageEventPacket;
import net.minecraft.network.protocol.game.ClientboundSetEntityMotionPacket;
import net.minecraft.util.Util;
import net.minecraft.world.damagesource.DamageTypes;

public class AntiThors extends Module {
   private long f_445 = 0L;
   private Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_446 = this::m_806;
   private static final String f_447 = "AntiThors";
   private static final String f_448 = "Убирает отбрасывание от шипов при полёте на элитрах";
   private static final long f_449 = 500L;
   private static final long f_450 = -1L;

   private void m_806(Class_XzpX8S5F5zd9jbuE var1) {
      if (f_11537.player != null && f_11537.level != null) {
         Packet var2 = var1.m_5619();
         long var3 = Util.getMillis();
         if (var2 instanceof ClientboundDamageEventPacket var5 && var5.entityId() == f_11537.player.getId() && var5.sourceType().is(DamageTypes.THORNS)) {
            this.f_445 = var3;
         } else {
            if (var2 instanceof ClientboundSetEntityMotionPacket var6
               && var6.id() == f_11537.player.getId()
               && f_11537.player.isFallFlying()
               && this.f_445 >= 0L
               && var3 - this.f_445 <= f_449) {
               var1.m_1582(true);
               this.f_445 = f_450;
            }
         }
      }
   }

   public AntiThors() {
      super(f_447, f_448, Category.COMBAT);
   }
}
