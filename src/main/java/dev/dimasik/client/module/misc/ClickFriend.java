package dev.dimasik.client.module.misc;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.IntegerSetting;
import dev.dimasik.client.system.Class_B6JOzHnwhU3pe4AO;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import net.minecraft.world.entity.player.Player;

public class ClickFriend extends Module {
   private final IntegerSetting f_13945;
   private final Class_gEPk7yDw6CwIte87<Class_B6JOzHnwhU3pe4AO> f_13946;
   private static final String f_13947 = "ClickFriend";
   private static final String f_13948 = "Bind";

   public ClickFriend() {
      super(f_13947, "", Category.MISC);
      this.f_13945 = new IntegerSetting(f_13948, -1);
      this.f_13946 = this::m_4942;
      this.m_795(this.f_13945);
   }

   public void m_4942(Class_B6JOzHnwhU3pe4AO var1) {
      if (f_11537.gui.screen() == null && var1.m_2116() == 1 && var1.m_2117() == this.f_13945.m_8768() && f_11537.crosshairPickEntity instanceof Player var2) {
         String var4 = var2.getGameProfile().name();
         if (DimasikClient.m_9057().m_9049().m_2804().m_2877(var4)) {
            DimasikClient.m_9057().m_9049().m_2804().removeIf(var1x -> var1x.m_2795().equalsIgnoreCase(var4));
         } else {
            DimasikClient.m_9057().m_9049().m_2804().m_2873(var4, null);
         }

         DimasikClient.m_9057().m_9049().m_2802().m_8843().m_5559();
      }
   }
}
