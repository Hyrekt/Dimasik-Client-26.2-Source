package dev.dimasik.client.module.movement;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.ui.screen.Screen_8;

public class AutoSprint extends Module {
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_7513 = this::m_2667;
   private static final String f_7514 = "AutoSprint";
   private static final String f_7515 = "Автоматически включает режим бега";
   private static final String f_7516 = "Grim";

   public AutoSprint() {
      super(f_7514, f_7515, Category.MOVEMENT);
   }

   public void m_2667(Class_Xu9btcIeUN33XnMK var1) {
      if (this.m_2668()) {
         f_11537.options.keySprint.setDown(true);
      } else {
         f_11537.options.keySprint.setDown(false);
         f_11537.player.setSprinting(false);
      }
   }

   private boolean m_2668() {
      boolean var1 = DimasikClient.m_9057().m_9049().m_2801().m_3576().m_776() && DimasikClient.m_9057().m_9049().m_2801().m_3576().m_1114() != null;
      boolean var2 = f_11537.player.isInWater() || f_11537.player.isSuppressingSlidingDownLadder() || f_11537.player.isInLava();
      boolean var3 = DimasikClient.m_9057().m_9049().m_2801().m_3455().m_776()
         && DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5157().m_7568(f_7516)
         && f_11537.gui.screen() != null
         && !(f_11537.gui.screen() instanceof Screen_8);
      boolean var4 = f_11537.player.onGround() || !var1;
      boolean var5 = f_11537.player.getAbilities().flying;
      return !var3 && (var4 || var5 || var2);
   }
}
