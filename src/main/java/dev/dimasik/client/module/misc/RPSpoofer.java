package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import net.minecraft.client.multiplayer.ClientCommonPacketListenerImpl.PackConfirmScreen;
import net.minecraft.network.protocol.common.ClientboundResourcePackPushPacket;
import net.minecraft.network.protocol.common.ServerboundResourcePackPacket;
import net.minecraft.network.protocol.common.ServerboundResourcePackPacket.Action;

public class RPSpoofer extends Module {
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_23551 = this::m_7223;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_23552 = this::m_7224;
   private static final String f_23553 = "RPSpoofer";
   private static final String f_23554 = "Сообщает серверу, что набор ресурсов был загружен";

   private void m_7223(Class_XzpX8S5F5zd9jbuE var1) {
      if (!(var1.m_5619() instanceof ClientboundResourcePackPushPacket)
         || RWFixer.m_8294() == null
         || f_11537.getCurrentServer() == null
         || !RWFixer.m_8298(f_11537.getCurrentServer().ip)) {
         if (var1.m_5619() instanceof ClientboundResourcePackPushPacket) {
            f_11537.getConnection().send(new ServerboundResourcePackPacket(f_11537.player.getUUID(), Action.ACCEPTED));
            f_11537.getConnection().send(new ServerboundResourcePackPacket(f_11537.player.getUUID(), Action.SUCCESSFULLY_LOADED));
            var1.m_1582(true);
         }
      }
   }

   public RPSpoofer() {
      super(f_23553, f_23554, Category.MISC);
   }

   private void m_7224(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.gui.screen() instanceof PackConfirmScreen) {
         f_11537.gui.screen().onClose();
      }
   }
}
