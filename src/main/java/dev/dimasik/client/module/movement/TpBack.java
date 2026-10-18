package dev.dimasik.client.module.movement;

import com.mojang.blaze3d.platform.InputConstants;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.system.Class_3LQSDrJ0WJYOQ7ck;
import dev.dimasik.client.system.Class_QmNR03reugBgWiPr;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_ZPRMV6aCWVosHRWh;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_lTzchJDbvRVrnXlw;
import dev.dimasik.client.system.Class_mRcJJZJYG5cvDAlU;
import dev.dimasik.client.system.Class_sULPxrOl7TpPlaX6;
import net.minecraft.network.protocol.common.ClientboundDisconnectPacket;
import net.minecraft.network.protocol.game.ClientboundLoginPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import net.minecraft.network.protocol.game.ClientboundRespawnPacket;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket.StatusOnly;

public class TpBack extends Module {
   public int f_28181;
   public boolean f_28182;
   private boolean f_28183;
   private final Class_QmNR03reugBgWiPr f_28184 = new Class_QmNR03reugBgWiPr();
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_28185 = this::m_8048;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_28186 = this::m_8050;
   private final Class_gEPk7yDw6CwIte87<Class_mRcJJZJYG5cvDAlU> f_28187 = this::m_8047;
   private final Class_gEPk7yDw6CwIte87<Class_sULPxrOl7TpPlaX6> f_28188 = this::m_8054;
   private final Class_gEPk7yDw6CwIte87<Class_lTzchJDbvRVrnXlw> f_28189 = this::m_8051;
   private static final String f_28190 = "TpBack";
   private static final String f_28191 = "Возвращает назад после падения";
   private static final double f_28192 = 3.0;
   private static final float f_28193 = 0.5F;
   private static final double f_28194 = 300.0;

   @Override
   public void m_732() {
      this.m_8052();
      Class_ZPRMV6aCWVosHRWh.m_5820(1.0F);
      this.m_8053();
      super.m_732();
   }

   private void m_8047(Class_mRcJJZJYG5cvDAlU var1) {
      if (this.f_28183) {
         var1.m_7604(false);
      }

      if (this.f_28181 == 2) {
         var1.m_7604(false);
      }

      if (this.f_28181 == 1) {
         var1.m_7604(true);
      }
   }

   private void m_8048(Class_XzpX8S5F5zd9jbuE var1) {
      if (var1.m_5619() instanceof ClientboundLoginPacket
         || var1.m_5619() instanceof ClientboundDisconnectPacket
         || var1.m_5619() instanceof ClientboundRespawnPacket) {
         this.m_8052();
         Class_ZPRMV6aCWVosHRWh.m_5820(1.0F);
         this.m_8053();
      }

      if (var1.m_5619() instanceof ClientboundPlayerPositionPacket && this.f_28183) {
         this.f_28181 = 2;
         this.f_28183 = false;
      }
   }

   public TpBack() {
      super(f_28190, f_28191, Category.MOVEMENT);
   }

   private void m_8049() {
      if (f_11537.options != null && f_11537.gui.screen() == null) {
         f_11537.options.keyUp.setDown(true);
         f_11537.options.keyJump.setDown(true);
      }
   }

   @Override
   public void m_778() {
      this.m_8052();
      this.m_8049();
   }

   private void m_8050(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null) {
         this.m_8049();
         this.f_28182 = f_11537.player.fallDistance > f_28192;
         if (this.f_28181 == 2) {
            Class_ZPRMV6aCWVosHRWh.m_5820(f_28193);
         } else if (this.f_28181 <= 1) {
            Class_ZPRMV6aCWVosHRWh.m_5820(1.0F);
         }

         if (this.f_28181 > 0) {
            this.f_28181--;
         }

         if (this.f_28184.m_4458(f_28194)) {
            this.f_28183 = false;
            this.f_28181 = 0;
         }
      }
   }

   private void m_8051(Class_lTzchJDbvRVrnXlw var1) {
      if (var1.m_7532() instanceof ServerboundMovePlayerPacket var2 && this.f_28182 && var2.isOnGround() && this.f_28181 == 0) {
         Class_3LQSDrJ0WJYOQ7ck.m_1293(new StatusOnly(true, false));
         this.f_28184.m_4459();
         this.f_28183 = true;
      }
   }

   public void m_8052() {
      this.f_28181 = 0;
      this.f_28182 = false;
      this.f_28183 = false;
   }

   private void m_8053() {
      if (f_11537.options != null && f_11537.getWindow() != null) {
         f_11537.options.keyUp.setDown(InputConstants.isKeyDown(f_11537.getWindow(), f_11537.options.keyUp.key.getValue()));
         f_11537.options.keyJump.setDown(InputConstants.isKeyDown(f_11537.getWindow(), f_11537.options.keyJump.key.getValue()));
      }
   }

   private void m_8054(Class_sULPxrOl7TpPlaX6 var1) {
      this.m_8049();
   }
}
