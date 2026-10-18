package dev.dimasik.client.module.movement;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_QmNR03reugBgWiPr;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_qPbJhurktO5IWlrv;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket;
import net.minecraft.network.protocol.game.ServerboundUseItemPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.Action;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.Items;

public class NoSlow extends Module {
   public static final MultiChoiceSetting f_14788 = new MultiChoiceSetting(
      NoSlow.f_14807,
      new Class_2ZaVm8TGDJ68TnJB(NoSlow.f_14808),
      new Class_2ZaVm8TGDJ68TnJB(NoSlow.f_14809),
      new Class_2ZaVm8TGDJ68TnJB(NoSlow.f_14810),
      new Class_2ZaVm8TGDJ68TnJB(NoSlow.f_14811),
      new Class_2ZaVm8TGDJ68TnJB(NoSlow.f_14812)
   );
   private final Class_QmNR03reugBgWiPr f_14789 = new Class_QmNR03reugBgWiPr();
   private final Class_QmNR03reugBgWiPr f_14790 = new Class_QmNR03reugBgWiPr();
   private int f_14791 = 0;
   private static int f_14792 = 0;
   private boolean f_14793 = false;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_14794 = this::m_5244;
   private final Class_gEPk7yDw6CwIte87<Class_qPbJhurktO5IWlrv> f_14795 = this::m_5242;
   private static final String f_14796 = "NoSlow";
   private static final String f_14797 = "Убирает замедление";
   private static final String f_14798 = "Grim New";
   private static final String f_14799 = "Reallyworld";
   private static final String f_14800 = "Grim Ticks";
   private static final long f_14801 = 125L;
   private static final String f_14802 = "Vanilla";
   private static final String f_14803 = "Reallyworld";
   private static final String f_14804 = "Grim Ticks";
   private static final String f_14805 = "Funtime арбалет";
   private static final String f_14806 = "Grim New";
   private static final String f_14807 = "Режим";
   private static final String f_14808 = "Vanilla";
   private static final String f_14809 = "Grim Ticks";
   private static final String f_14810 = "Grim New";
   private static final String f_14811 = "Reallyworld";
   private static final String f_14812 = "Funtime арбалет";

   private void m_5241() {
      if (f_11537.getConnection() != null) {
         if (f_11537.player.getUsedItemHand() == InteractionHand.MAIN_HAND && f_11537.player.getTicksUsingItem() == 1) {
            f_11537.getConnection().send(new ServerboundPlayerActionPacket(Action.DROP_ALL_ITEMS, BlockPos.ZERO, f_11537.player.getDirection()));
         }
      }
   }

   public void m_5242(Class_qPbJhurktO5IWlrv var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (!f_11537.player.isFallFlying()) {
            if (f_11537.player.isUsingItem()) {
               switch (f_14788.m_7564().m_1181()) {
                  case f_14802:
                     var1.m_1582(true);
                     break;
                  case f_14803:
                  case f_14804:
                     if (this.f_14793) {
                        var1.m_1582(true);
                     }
                     break;
                  case f_14805:
                     this.m_5243(var1);
                     break;
                  case f_14806:
                     if (f_11537.player.getUsedItemHand() == InteractionHand.MAIN_HAND && f_11537.player.getTicksUsingItem() > 1 && this.f_14791 % 2 == 0) {
                        var1.m_1582(true);
                     }
               }
            }
         }
      }
   }

   private void m_5243(Class_qPbJhurktO5IWlrv var1) {
      if ((f_11537.player.getOffhandItem().getItem() == Items.CROSSBOW || f_11537.player.getMainHandItem().getItem() == Items.CROSSBOW)
         && f_11537.player.getUseItem().getItem() == Items.CROSSBOW) {
         var1.m_1582(true);
      }
   }

   public void m_5244(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null && !f_11537.player.isFallFlying()) {
         this.f_14793 = false;
         if (f_14788.m_7568(f_14798)) {
            this.m_5241();
         }

         if (f_14788.m_7568(f_14799)) {
            if (f_11537.player.isUsingItem()) {
               this.f_14791++;
               int[] var2 = new int[]{2, 3, 3};
               int var3 = var2[f_14792 % 3];
               if (this.f_14791 >= var3) {
                  this.f_14793 = true;
                  this.f_14791 = 0;
                  f_14792++;
               }
            } else {
               this.f_14791 = 0;
               f_14792 = 0;
            }
         } else {
            this.f_14791 = 0;
         }

         if (f_14788.m_7568(f_14800) && f_11537.player.isUsingItem() && this.f_14790.m_4463(f_14801)) {
            this.f_14793 = true;
            f_11537.player.connection.send(new ServerboundUseItemPacket(InteractionHand.MAIN_HAND, 0, f_11537.player.getYRot(), f_11537.player.getXRot()));
            this.f_14790.m_4459();
         }

         if (f_11537.player.hurtTime == 10) {
            this.f_14789.m_4459();
         }
      }
   }

   public NoSlow() {
      super(f_14796, f_14797, Category.MOVEMENT);
      this.m_795(f_14788);
   }
}
