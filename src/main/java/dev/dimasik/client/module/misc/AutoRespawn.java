package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.DeathScreen;

public class AutoRespawn extends Module {
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_5133 = this::m_2085;
   private static final String f_5134 = "AutoRespawn";
   private static final String f_5135 = "Автоматически возраждается";

   public void m_2085(Class_Xu9btcIeUN33XnMK var1) {
      if (Minecraft.getInstance().gui.screen() instanceof DeathScreen) {
         Minecraft.getInstance().player.respawn();
         Minecraft.getInstance().gui.setScreen(null);
      }
   }

   public AutoRespawn() {
      super(f_5134, f_5135, Category.MISC);
   }
}
