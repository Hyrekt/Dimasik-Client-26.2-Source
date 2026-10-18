package dev.dimasik.client.system;

import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import org.lwjgl.glfw.GLFW;

public class Class_U3jQIyqr1iJdwPZl {
   public KeyMapping f_14625;

   @Class_FUILRKIQ6wtWry59("isKeyPressed")
   public boolean m_5182(int var1) {
      if (var1 == 0) {
         return false;
      }

      long var2 = Minecraft.getInstance().getWindow().handle();
      return GLFW.glfwGetKey(var2, var1) == 1;
   }
}
