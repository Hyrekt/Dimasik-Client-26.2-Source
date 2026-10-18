package dev.dimasik.client.module.movement;

import com.mojang.blaze3d.platform.InputConstants;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.system.Class_3LQSDrJ0WJYOQ7ck;
import dev.dimasik.client.system.Class_8x4deAyjocMIBSj7;
import dev.dimasik.client.system.Class_B6vpBUNmRtH3JzmV;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_h78PE30BIJJYoUEk;
import dev.dimasik.client.system.Class_j2JBuvODdMpDiDiw;
import dev.dimasik.client.system.Class_jfpiTZhNIuwDwqKr;
import dev.dimasik.client.system.Class_sULPxrOl7TpPlaX6;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket.PosRot;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.Vec3;

public class AirStuck extends Module {
   private CheckboxSetting f_15677;
   private final CheckboxSetting f_15678;
   private Vec3 f_15679;
   private final Class_8x4deAyjocMIBSj7 f_15680;
   private LocalPlayer f_15681;
   private int f_15682;
   private int f_15683;
   private boolean f_15684;
   private boolean f_15685;
   private final AirStuck.t9uvkqJAxnnbD7G6 f_15686;
   private final Class_gEPk7yDw6CwIte87<Class_jfpiTZhNIuwDwqKr> f_15687;
   private final Class_gEPk7yDw6CwIte87<Class_j2JBuvODdMpDiDiw> f_15688;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_15689;
   private static final String f_15690 = "AirStuck";
   private static final String f_15691 = "Замораживает модель игрока в воздухе";
   private static final String f_15692 = "Reallyworld 360 (1.17.1)";
   private static final String f_15693 = "Свап нагрудника";
   private static final String f_15694 = "Легитный";

   @Override
   public void m_778() {
      this.m_5471();
      this.m_5475();
      if (f_11537.player != this.f_15681 || f_11537.player == null || f_11537.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA)) {
         this.f_15683 = -1;
      }

      this.f_15681 = f_11537.player;
      this.f_15679 = f_11537.player == null ? Vec3.ZERO : f_11537.player.getDeltaMovement();
      if (this.f_15678.m_8768() && f_11537.player != null && f_11537.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA)) {
         this.f_15682 = Class_h78PE30BIJJYoUEk.m_7070();
         this.m_5470();
      }
   }

   @Override
   public void m_732() {
      this.m_5471();
      if (f_11537.player != null && f_11537.player == this.f_15681) {
         f_11537.player.setDeltaMovement(this.f_15679);
      }

      this.f_15679 = Vec3.ZERO;
      if (this.f_15683 >= 0 && f_11537.player != null && f_11537.player == this.f_15681) {
         if (!this.f_15685) {
            this.f_15685 = true;
            DimasikClient.m_9057().m_9051().m_9713(this.f_15686);
         }

         this.m_5470();
      } else {
         this.m_5474();
      }
   }

   public void m_5468(Class_jfpiTZhNIuwDwqKr var1) {
      var1.m_1582(true);
   }

   public void m_5469(Class_j2JBuvODdMpDiDiw var1) {
      var1.m_1582(true);
      if (f_11537.player != null && this.f_15677.m_8768()) {
         Class_3LQSDrJ0WJYOQ7ck.m_1293(
            new PosRot(
               f_11537.player.position().x(),
               f_11537.player.position().y(),
               f_11537.player.position().z(),
               f_11537.player.getYRot(),
               f_11537.player.getXRot(),
               false,
               false
            )
         );
      }
   }

   private void m_5470() {
      if (this.f_15682 >= 0 || this.f_15684 || this.f_15685) {
         if (f_11537.player == null || f_11537.player != this.f_15681 || f_11537.level == null || f_11537.gameMode == null || !f_11537.player.isAlive()) {
            this.m_5474();
         } else if (!this.f_15685 && !this.f_15678.m_8768()) {
            this.m_5471();
         } else if (f_11537.gui.screen() == null && f_11537.player.containerMenu == f_11537.player.inventoryMenu) {
            GuiMove var1 = DimasikClient.m_9057().m_9049().m_2801().m_3455();
            if (!this.f_15684) {
               if (var1.m_5148()) {
                  return;
               }

               if (this.f_15685) {
                  if (f_11537.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA) || this.m_5472() < 0) {
                     this.m_5474();
                     return;
                  }
               } else {
                  if (!f_11537.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA)) {
                     this.m_5471();
                     return;
                  }

                  this.f_15682 = Class_h78PE30BIJJYoUEk.m_7070();
                  if (this.f_15682 < 0) {
                     return;
                  }
               }
            }

            if (!this.f_15684 && !var1.m_5152().m_7568(f_15694)) {
               this.m_5473();
               if (this.f_15685) {
                  this.m_5474();
               }
            } else {
               boolean var2 = this.f_15680.m_1901(this::m_5473, true) == Class_8x4deAyjocMIBSj7.Class_8xzBZ83gOSc56UI6.SUCCESS;
               this.f_15684 = !var2 && var1.m_5148();
               if (var2 && this.f_15685) {
                  this.m_5474();
               }
            }
         } else {
            if (this.f_15684) {
               this.m_5471();
            }
         }
      }
   }

   private void m_5471() {
      if (this.f_15684) {
         GuiMove var1 = DimasikClient.m_9057().m_9049().m_2801().m_3455();
         var1.m_5158(false);
         if (f_11537.gui.screen() == null && !var1.m_5148()) {
            KeyMapping[] var2 = new KeyMapping[]{
               f_11537.options.keyUp,
               f_11537.options.keyDown,
               f_11537.options.keyLeft,
               f_11537.options.keyRight,
               f_11537.options.keyJump,
               f_11537.options.keySprint
            };

            for (KeyMapping var6 : var2) {
               var6.setDown(InputConstants.isKeyDown(f_11537.getWindow(), var6.key.getValue()));
            }
         }
      }

      this.f_15680.m_1907();
      this.f_15684 = false;
      this.f_15682 = -1;
   }

   private int m_5472() {
      return this.f_15683 >= 0 && f_11537.player.inventoryMenu.getSlot(this.f_15683).getItem().is(Items.ELYTRA)
         ? this.f_15683
         : Class_B6vpBUNmRtH3JzmV.m_2128(Items.ELYTRA);
   }

   public AirStuck() {
      super(f_15690, f_15691, Category.MOVEMENT);
      this.f_15677 = new CheckboxSetting(f_15692, true);
      this.f_15678 = new CheckboxSetting(f_15693, false);
      this.f_15679 = Vec3.ZERO;
      this.f_15680 = new Class_8x4deAyjocMIBSj7();
      this.f_15682 = -1;
      this.f_15683 = -1;
      this.f_15686 = new AirStuck.t9uvkqJAxnnbD7G6();
      this.f_15687 = this::m_5468;
      this.f_15688 = this::m_5469;
      this.f_15689 = var1 -> this.m_5470();
      this.m_795(this.f_15677, this.f_15678);
   }

   private void m_5473() {
      this.f_15682 = -1;
      boolean var1 = f_11537.player.getItemBySlot(EquipmentSlot.CHEST).is(Items.ELYTRA);
      if (this.f_15685 != var1) {
         int var2 = this.f_15685 ? this.m_5472() : Class_h78PE30BIJJYoUEk.m_7070();
         if (var2 >= 0) {
            if (Class_B6vpBUNmRtH3JzmV.m_2126(var2)) {
               Class_B6vpBUNmRtH3JzmV.m_2129(Class_B6vpBUNmRtH3JzmV.m_2127(var2), 6);
            } else {
               Class_B6vpBUNmRtH3JzmV.m_2129(8, var2);
               Class_B6vpBUNmRtH3JzmV.m_2129(8, 6);
               Class_B6vpBUNmRtH3JzmV.m_2129(8, var2);
            }

            if (!this.f_15685) {
               this.f_15683 = var2;
            }
         }
      }
   }

   private void m_5474() {
      this.m_5471();
      this.m_5475();
      this.f_15683 = -1;
      if (!this.m_776()) {
         this.f_15681 = null;
      }
   }

   private void m_5475() {
      if (this.f_15685) {
         DimasikClient.m_9057().m_9051().m_9715(this.f_15686);
         this.f_15685 = false;
      }
   }

   private final class t9uvkqJAxnnbD7G6 {
      public final Class_gEPk7yDw6CwIte87<Class_sULPxrOl7TpPlaX6> f_15675 = var1x -> {
         if (AirStuck.this.f_15685) {
            AirStuck.this.m_5470();
         }
      };

      public t9uvkqJAxnnbD7G6() {
      }
   }
}
