package dev.dimasik.client.module.movement;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_ftHu9o3WzCU3Adxm;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import net.minecraft.network.protocol.game.ServerboundPlayerCommandPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerCommandPacket.Action;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Items;

public class ElytraFly extends Module {
   private boolean f_29886;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_29887 = this::m_8329;
   private static final String f_29888 = "ElytraFly";
   private static final String f_29889 = "Управляет полётом на элитрах";
   private static final String f_29890 = "ElytraFly работает только с протоколом 1.17.1 через ViaFabric";
   private static final String f_29891 = "ElytraFly работает только при включении на земле";
   private static final float f_29892 = -30.0F;
   private static final float f_29893 = 30.0F;
   private static final double f_29894 = 0.08;
   private static final double f_29895 = 0.29;
   private static final double f_29896 = 0.301;

   private void m_8329(Class_Xu9btcIeUN33XnMK var1) {
      if (this.f_29886) {
         this.f_29886 = false;
         this.m_777();
      } else if (f_11537.player != null && f_11537.level != null) {
         if (f_11537.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA)) {
            f_11537.player.setXRot(Mth.clamp(f_11537.player.getXRot(), f_29892, f_29893));
            if (f_11537.player.onGround()) {
               f_11537.player.jumpFromGround();
            } else {
               if (!f_11537.player.isFallFlying()) {
                  f_11537.player.startFallFlying();
                  f_11537.player.connection.send(new ServerboundPlayerCommandPacket(f_11537.player, Action.START_FALL_FLYING));
               }

               if (f_11537.player.isFallFlying()) {
                  double var2 = f_29894;
                  double var4 = Math.toRadians(f_11537.player.getYRot());
                  double var6 = -Math.sin(var4) * var2;
                  double var8 = Math.cos(var4) * var2;
                  double var10 = f_11537.player.tickCount % 2 == 0 ? f_29895 : f_29896;
                  f_11537.player.setDeltaMovement(var6, var10, var8);
               }
            }
         }
      }
   }

   public ElytraFly() {
      super(f_29888, f_29889, Category.MOVEMENT);
   }

   @Override
   public void m_778() {
      this.f_29886 = false;
      if (f_11537.player != null) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_29890);
         if (!f_11537.player.onGround()) {
            Class_ftHu9o3WzCU3Adxm.m_6731(f_29891);
            this.f_29886 = true;
         }
      }
   }
}
