package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.system.Class_QmNR03reugBgWiPr;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import net.minecraft.network.protocol.game.ClientboundSoundPacket;
import net.minecraft.network.protocol.game.ServerboundSetCarriedItemPacket;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentHelper;

public class AutoFish extends Module {
   private final CheckboxSetting f_36487;
   private boolean f_36488;
   private boolean f_36489;
   private int f_36490;
   private final Class_QmNR03reugBgWiPr f_36491;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_36492;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_36493;
   private static final String f_36494 = "AutoFish";
   private static final String f_36495 = "Автоматизирует процесс рыбалки";
   private static final String f_36496 = "Автоматически брать удочку";
   private static final double f_36497 = 600.0;
   private static final double f_36498 = 300.0;

   private void m_9941(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (this.f_36487.m_8768() && this.f_36490 == -1) {
            this.m_9943();
         }

         if (this.f_36490 != -1 && f_11537.player.getInventory().selected != this.f_36490) {
            f_11537.player.connection.send(new ServerboundSetCarriedItemPacket(this.f_36490));
            f_11537.player.getInventory().selected = this.f_36490;
         }

         if (this.f_36488 && this.f_36491.m_4458(f_36497)) {
            this.m_9942();
            this.f_36488 = false;
            this.f_36489 = true;
            this.f_36491.m_4459();
         }

         if (this.f_36489 && this.f_36491.m_4458(f_36498)) {
            this.m_9942();
            this.f_36489 = false;
            this.f_36491.m_4459();
         }
      }
   }

   private void m_9942() {
      if (this.f_36490 != -1) {
         if (f_11537.player.getInventory().getItem(this.f_36490).is(Items.FISHING_ROD)) {
            if (f_11537.player.getInventory().selected != this.f_36490) {
               f_11537.player.connection.send(new ServerboundSetCarriedItemPacket(this.f_36490));
               f_11537.player.getInventory().selected = this.f_36490;
            }

            f_11537.gameMode.useItem(f_11537.player, InteractionHand.MAIN_HAND);
         }
      }
   }

   private void m_9943() {
      int var1 = -1;
      int var2 = -1;

      for (int var3 = 0; var3 < 9; var3++) {
         ItemStack var4 = f_11537.player.getInventory().getItem(var3);
         if (var4.is(Items.FISHING_ROD)) {
            int var5 = EnchantmentHelper.getEnchantmentsForCrafting(var4).entrySet().size();
            if (var5 > var2) {
               var2 = var5;
               var1 = var3;
            }
         }
      }

      if (var1 != -1) {
         this.f_36490 = var1;
      }
   }

   public AutoFish() {
      super(f_36494, f_36495, Category.MISC);
      this.f_36487 = new CheckboxSetting(f_36496, true);
      this.f_36490 = -1;
      this.f_36491 = new Class_QmNR03reugBgWiPr();
      this.f_36492 = this::m_9941;
      this.f_36493 = this::m_9944;
      this.m_795(this.f_36487);
   }

   @Override
   public void m_732() {
      this.f_36488 = false;
      this.f_36489 = false;
      this.f_36490 = -1;
      this.f_36491.m_4459();
   }

   private void m_9944(Class_XzpX8S5F5zd9jbuE var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (var1.m_5619() instanceof ClientboundSoundPacket var2) {
            if (var2.getSound().value() == SoundEvents.FISHING_BOBBER_SPLASH) {
               this.f_36488 = true;
               this.f_36491.m_4459();
            }
         }
      }
   }
}
