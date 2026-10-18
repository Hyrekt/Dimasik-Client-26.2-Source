package dev.dimasik.client.module.misc;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.IntegerSetting;
import dev.dimasik.client.system.Class_21JsiqqLzgnqk2Dg;
import dev.dimasik.client.system.Class_B6JOzHnwhU3pe4AO;
import dev.dimasik.client.system.Class_B6vpBUNmRtH3JzmV;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.Items;

public class ClickPearl extends Module {
   private final IntegerSetting f_29816;
   private final Class_21JsiqqLzgnqk2Dg f_29817;
   private int f_29818;
   private boolean f_29819;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_29820;
   private final Class_gEPk7yDw6CwIte87<Class_B6JOzHnwhU3pe4AO> f_29821;
   private static final String f_29822 = "ClickPearl";
   private static final String f_29823 = "Кидает пёрл по бинду";
   private static final String f_29824 = "Клавиша бросания";
   private static final String f_29825 = "Легитный";
   private static final String f_29826 = "pearl";
   private static final String f_29827 = "pearl";

   public void m_8313(Class_Xu9btcIeUN33XnMK var1) {
      if (this.m_8314()) {
         if (DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5152().m_7568(f_29825)) {
            this.m_8319();
         } else {
            this.m_8316();
         }
      }
   }

   @Override
   public void m_732() {
      this.f_29817.m_914().clear();
   }

   private boolean m_8314() {
      if (!this.f_29819) {
         return false;
      }

      this.f_29818 = Class_B6vpBUNmRtH3JzmV.m_2128(Items.ENDER_PEARL);
      this.f_29819 = false;
      return this.f_29818 >= 0;
   }

   public ClickPearl() {
      super(f_29822, f_29823, Category.MISC);
      this.f_29816 = new IntegerSetting(f_29824, -1);
      this.f_29817 = new Class_21JsiqqLzgnqk2Dg();
      this.f_29818 = -1;
      this.f_29819 = false;
      this.f_29820 = this::m_8313;
      this.f_29821 = this::m_8317;
      this.m_795(this.f_29816);
   }

   private void m_8316() {
      if (Class_B6vpBUNmRtH3JzmV.m_2126(this.f_29818)) {
         Class_B6vpBUNmRtH3JzmV.m_2131(Class_B6vpBUNmRtH3JzmV.m_2127(this.f_29818));
         f_11537.gameMode.useItem(f_11537.player, InteractionHand.MAIN_HAND);
         Class_B6vpBUNmRtH3JzmV.m_2131(f_11537.player.getInventory().selected);
      } else {
         this.f_29817.m_925(this.f_29817.m_907(), this.f_29818);
         Class_B6vpBUNmRtH3JzmV.m_2131(this.f_29817.m_907());
         f_11537.gameMode.useItem(f_11537.player, InteractionHand.MAIN_HAND);
         Class_B6vpBUNmRtH3JzmV.m_2131(f_11537.player.getInventory().selected);
         this.f_29817.m_925(this.f_29817.m_907(), this.f_29818);
      }
   }

   public void m_8317(Class_B6JOzHnwhU3pe4AO var1) {
      if (f_11537.gui.screen() == null && var1.m_2116() == 1 && var1.m_2117() == this.f_29816.m_8768()) {
         this.f_29819 = true;
      }
   }

   private void m_8319() {
      int var1 = this.f_29818;
      if (Class_B6vpBUNmRtH3JzmV.m_2126(var1)) {
         Runnable var2 = () -> {
            Class_B6vpBUNmRtH3JzmV.m_2131(Class_B6vpBUNmRtH3JzmV.m_2127(var1));
            f_11537.gameMode.useItem(f_11537.player, InteractionHand.MAIN_HAND);
         };
         Runnable var3 = () -> Class_B6vpBUNmRtH3JzmV.m_2131(f_11537.player.getInventory().selected);
         this.f_29817.m_908(f_29826, 1, var2, var3);
      } else {
         Runnable var4 = () -> {
            this.f_29817.m_925(this.f_29817.m_907(), var1);
            this.f_29817.m_921();
            Class_B6vpBUNmRtH3JzmV.m_2131(this.f_29817.m_907());
            f_11537.gameMode.useItem(f_11537.player, InteractionHand.MAIN_HAND);
         };
         Runnable var5 = () -> {
            Class_B6vpBUNmRtH3JzmV.m_2131(f_11537.player.getInventory().selected);
            this.f_29817.m_925(this.f_29817.m_907(), var1);
            this.f_29817.m_921();
         };
         this.f_29817.m_905(f_29827, 1, var4, var5);
      }
   }
}
