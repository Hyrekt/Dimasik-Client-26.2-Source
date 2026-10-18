package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_lTzchJDbvRVrnXlw;
import net.minecraft.network.protocol.common.ServerboundPongPacket;

public class PacketDebug extends Module {
   private final Class_gEPk7yDw6CwIte87<Class_lTzchJDbvRVrnXlw> f_7152 = this::m_2572;
   private static final String f_7153 = "PacketDebug";
   private static final String f_7154 = "Выводит получаемые пакеты в консоль";

   public void m_2572(Class_lTzchJDbvRVrnXlw var1) {
      if (!(var1.m_7532() instanceof ServerboundPongPacket)) {
         System.out.println(var1.m_7532());
      }
   }

   public PacketDebug() {
      super(f_7153, f_7154, Category.MISC);
   }
}
