package dev.dimasik.client.system;

import com.mojang.blaze3d.platform.Window;
import net.minecraft.client.Minecraft;
import org.lwjgl.glfw.GLFW;

public final class Class_8RZa6amQedgEQOyz {
   private Class_wOPwT7J4giBZsk46 f_3834;
   private boolean f_3835;
   private String f_3836;

   public static String m_1761() {
      return "cracked by @soezproject & Vkontakt3";
   }

   public void m_1762() {
      Window var1 = Minecraft.getInstance().getWindow();
      this.f_3836 = GLFW.glfwGetWindowTitle(var1.handle());
      var1.setTitle(m_1761());
      this.f_3834 = Class_wOPwT7J4giBZsk46.m_9320();
      this.f_3835 = this.f_3834 != null && !this.f_3834.m_9318();
      if (this.f_3834 != null) {
         this.f_3834.m_9317(true);
      }

      Class_ftHu9o3WzCU3Adxm.m_6729();
   }

   public void m_1763() {
      Class_ftHu9o3WzCU3Adxm.m_6729();
      if (this.f_3836 != null) {
         Minecraft.getInstance().getWindow().setTitle(this.f_3836);
      }

      this.f_3836 = null;
      if (this.f_3835 && this.f_3834 == Class_wOPwT7J4giBZsk46.m_9320()) {
         this.f_3834.m_9317(false);
      }

      this.f_3834 = null;
      this.f_3835 = false;
   }
}
