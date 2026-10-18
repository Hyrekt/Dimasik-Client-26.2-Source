package dev.dimasik.client.module.movement;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_3LQSDrJ0WJYOQ7ck;
import dev.dimasik.client.system.Class_QmNR03reugBgWiPr;
import dev.dimasik.client.system.Class_SmEMzWs5Zw5oBieG;
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
import net.minecraft.network.protocol.game.ServerboundPlayerCommandPacket;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket.StatusOnly;
import net.minecraft.network.protocol.game.ServerboundPlayerCommandPacket.Action;

public class NoFall extends Module {
   private final MultiChoiceSetting f_31109;
   public int f_31110;
   public boolean f_31111;
   private boolean f_31112;
   private int f_31113;
   private final Class_QmNR03reugBgWiPr f_31114;
   private final Class_QmNR03reugBgWiPr f_31115;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_31116;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_31117;
   private final Class_gEPk7yDw6CwIte87<Class_mRcJJZJYG5cvDAlU> f_31118;
   private final Class_gEPk7yDw6CwIte87<Class_sULPxrOl7TpPlaX6> f_31119;
   private final Class_gEPk7yDw6CwIte87<Class_lTzchJDbvRVrnXlw> f_31120;
   private static final String f_31121 = "NoFall";
   private static final String f_31122 = "Убирает урон от падения";
   private static final String f_31123 = "Обход";
   private static final String f_31124 = "Grim 72";
   private static final String f_31125 = "Grim 73";
   private static final String f_31126 = "Grim 72";
   private static final String f_31127 = "Grim 73";
   private static final String f_31128 = "Grim 73";
   private static final String f_31129 = "Grim 72";
   private static final double f_31130 = 3.0;
   private static final double f_31131 = 200.0;
   private static final double f_31132 = 300.0;
   private static final String f_31133 = "Grim 73";
   private static final double f_31134 = 3.0;
   private static final float f_31135 = 0.5F;
   private static final double f_31136 = 300.0;
   private static final String f_31137 = "Grim 72";

   public void m_8707() {
      this.f_31110 = 0;
      this.f_31111 = false;
      this.f_31112 = false;
   }

   private void m_8708(Class_lTzchJDbvRVrnXlw var1) {
      if (this.f_31109.m_7568(f_31128) && var1.m_7532() instanceof ServerboundMovePlayerPacket var2 && this.f_31111 && var2.isOnGround() && this.f_31110 == 0) {
         Class_3LQSDrJ0WJYOQ7ck.m_1293(new StatusOnly(true, false));
         this.f_31114.m_4459();
         this.f_31112 = true;
      }
   }

   private void m_8709(Class_Xu9btcIeUN33XnMK var1) {
      if (this.f_31109.m_7568(f_31129)) {
         this.f_31111 = f_11537.player.fallDistance > f_31130;
         if (this.f_31113 > 0) {
            this.f_31113--;
         }

         if (this.f_31111 && !f_11537.player.onGround() && Class_SmEMzWs5Zw5oBieG.m_4761(1).f_13611 && this.f_31115.m_4458(f_31131)) {
            boolean var2 = false;
            Class_3LQSDrJ0WJYOQ7ck.m_1293(new ServerboundPlayerCommandPacket(f_11537.player, Action.START_FALL_FLYING));
            Class_3LQSDrJ0WJYOQ7ck.m_1293(new ServerboundPlayerCommandPacket(f_11537.player, Action.START_FALL_FLYING));
            this.f_31115.m_4459();
            this.f_31112 = true;
            this.f_31114.m_4459();
         }

         if (this.f_31114.m_4458(f_31132)) {
            this.f_31112 = false;
            this.f_31113 = 0;
         }
      }

      if (this.f_31109.m_7568(f_31133)) {
         this.f_31111 = f_11537.player.fallDistance > f_31134;
         if (this.f_31110 == 2) {
            Class_ZPRMV6aCWVosHRWh.m_5820(f_31135);
         }

         if (this.f_31110 <= 1) {
            Class_ZPRMV6aCWVosHRWh.m_5820(1.0F);
         }

         if (this.f_31110 > 0) {
            this.f_31110--;
         }

         if (this.f_31114.m_4458(f_31136)) {
            this.f_31112 = false;
            this.f_31110 = 0;
         }
      }
   }

   private void m_8710(Class_mRcJJZJYG5cvDAlU var1) {
      if (this.f_31109.m_7568(f_31137)) {
         if (this.f_31112) {
            var1.m_7604(false);
         }

         if (this.f_31113 == 2) {
            var1.m_7604(false);
         }

         if (this.f_31113 == 1) {
            var1.m_7604(true);
         }
      } else {
         if (this.f_31112) {
            var1.m_7604(false);
         }

         if (this.f_31110 == 2) {
            var1.m_7604(false);
         }

         if (this.f_31110 == 1) {
            var1.m_7604(true);
         }
      }
   }

   private void m_8711(Class_sULPxrOl7TpPlaX6 var1) {
   }

   public NoFall() {
      super(f_31121, f_31122, Category.MOVEMENT);
      this.f_31109 = new MultiChoiceSetting(f_31123, new Class_2ZaVm8TGDJ68TnJB(f_31124), new Class_2ZaVm8TGDJ68TnJB(f_31125));
      this.f_31114 = new Class_QmNR03reugBgWiPr();
      this.f_31115 = new Class_QmNR03reugBgWiPr();
      this.f_31116 = this::m_8712;
      this.f_31117 = this::m_8709;
      this.f_31118 = this::m_8710;
      this.f_31119 = this::m_8711;
      this.f_31120 = this::m_8708;
      this.m_795(this.f_31109);
   }

   private void m_8712(Class_XzpX8S5F5zd9jbuE var1) {
      if (var1.m_5619() instanceof ClientboundLoginPacket
         || var1.m_5619() instanceof ClientboundDisconnectPacket
         || var1.m_5619() instanceof ClientboundRespawnPacket) {
         this.m_8707();
      }

      if (var1.m_5619() instanceof ClientboundPlayerPositionPacket && this.f_31112) {
         if (this.f_31109.m_7568(f_31126)) {
            this.f_31113 = 2;
         } else if (this.f_31109.m_7568(f_31127)) {
            this.f_31110 = 2;
         }

         this.f_31112 = false;
      }
   }

   @Override
   public void m_732() {
      super.m_732();
      this.f_31112 = false;
      this.f_31111 = false;
      this.f_31113 = 0;
      this.f_31110 = 0;
   }
}
