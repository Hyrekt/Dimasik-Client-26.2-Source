package dev.dimasik.client.system;

import net.minecraft.client.Minecraft;
import org.lwjgl.glfw.GLFW;

public final class Class_2TFiP2yfi5iArGSw {
   private static boolean m_1178(long var0, int var2, int var3) {
      return GLFW.glfwGetKey(var0, var2) == 1 || GLFW.glfwGetKey(var0, var3) == 1;
   }

   private Class_2TFiP2yfi5iArGSw() {
   }

   public static int m_1179() {
      long var0 = Minecraft.getInstance().getWindow().handle();
      byte var2 = 0;
      if (m_1178(var0, 340, 344)) {
         var2 |= 1;
      }

      if (m_1178(var0, 341, 345)) {
         var2 |= 2;
      }

      if (m_1178(var0, 342, 346)) {
         var2 |= 4;
      }

      if (m_1178(var0, 343, 347)) {
         var2 |= 8;
      }

      return var2;
   }
}
