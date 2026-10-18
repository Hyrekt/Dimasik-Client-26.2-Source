package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.system.Class_3GDSJINRhi8zNlKp;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;

public class AutoEvent extends Module {
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_25468 = this::m_7580;
   private static final String f_25469 = "AutoEvent";
   private static final String f_25470 = "АвтоЭвент под ReallyWorld";
   private static final String f_25471 = "АирДроп » Координаты: ";
   private static final String f_25472 = "АирДроп » Координаты: ";
   private static final String f_25473 = "[";
   private static final String f_25474 = "]";
   private static final String f_25475 = "; ";
   private static final String f_25476 = "AirDrop";
   private static final String f_25477 = "AirDrop";

   public AutoEvent() {
      super(f_25469, f_25470, Category.MISC);
   }

   private void m_7580(Class_XzpX8S5F5zd9jbuE var1) {
      if (var1.m_5619() instanceof ClientboundSystemChatPacket var2) {
         String var7 = var2.content().getString();
         if (var7.contains(f_25471)) {
            String[] var4 = var7.substring(var7.indexOf(f_25472) + 23).replace(f_25473, "").replace(f_25474, "").split(f_25475);
            int var5 = Integer.parseInt(var4[0]);
            int var6 = Integer.parseInt(var4[1]);
            Class_3GDSJINRhi8zNlKp.m_1271().m_1266(f_25476);
            Class_3GDSJINRhi8zNlKp.m_1271().m_1262(f_25477, new BlockPos(var5, 80, var6));
         }
      }
   }
}
