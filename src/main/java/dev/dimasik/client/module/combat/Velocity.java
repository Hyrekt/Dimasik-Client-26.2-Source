package dev.dimasik.client.module.combat;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import net.minecraft.network.protocol.game.ClientboundSetEntityMotionPacket;

public class Velocity extends Module {
   private final ItemListSetting f_31052;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_31053;
   private static final String f_31054 = "Velocity";
   private static final String f_31055 = "Отключает откидывание";
   private static final String f_31056 = "Работать";
   private static final String f_31057 = "Элитра";
   private static final String f_31058 = "Земля";
   private static final String f_31059 = "Вода";
   private static final String f_31060 = "Элитра";
   private static final String f_31061 = "Вода";
   private static final String f_31062 = "Земля";

   public void m_8682(Class_XzpX8S5F5zd9jbuE var1) {
      if (var1.m_5619() instanceof ClientboundSetEntityMotionPacket var2 && this.m_8683() && var2.id() == f_11537.player.getId()) {
         var1.m_1582(true);
      }
   }

   public Velocity() {
      super(f_31054, f_31055, Category.COMBAT);
      this.f_31052 = new ItemListSetting(f_31056, new Class_2ZaVm8TGDJ68TnJB(f_31057), new Class_2ZaVm8TGDJ68TnJB(f_31058), new Class_2ZaVm8TGDJ68TnJB(f_31059));
      this.f_31053 = this::m_8682;
      this.m_795(this.f_31052);
   }

   private boolean m_8683() {
      boolean var1 = f_11537.player.isFallFlying() && this.f_31052.m_7145(f_31060);
      boolean var2 = f_11537.player.isInWater() && this.f_31052.m_7145(f_31061);
      return var1 || var2 || this.f_31052.m_7145(f_31062);
   }
}
