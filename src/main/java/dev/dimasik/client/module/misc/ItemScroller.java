package dev.dimasik.client.module.misc;

import com.google.gson.JsonObject;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_zFd1aKtwR3Hz00EA;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.world.inventory.Slot;
import org.lwjgl.glfw.GLFW;

public final class ItemScroller extends Module {
   public final SliderSetting f_11592;
   private AbstractContainerScreen<?> f_11593;
   private long f_11594;
   private final Class_gEPk7yDw6CwIte87<Class_zFd1aKtwR3Hz00EA> f_11595;
   private static final String f_11596 = "ItemScroller";
   private static final String f_11597 = "Упрощает перемещение предметов";
   private static final String f_11598 = "Задержка";
   private static final float f_11599 = 10.0F;
   private static final long f_11600 = 100L;
   private static final float f_11601 = 10.0F;
   private static final float f_11602 = 8.0F;

   @Override
   public void m_778() {
      this.f_11593 = null;
      this.f_11594 = 0L;
      super.m_778();
   }

   @Override
   public void m_732() {
      this.f_11593 = null;
      this.f_11594 = 0L;
      super.m_732();
   }

   @Override
   public void m_791(JsonObject var1) {
      super.m_791(var1);
      float var2 = this.f_11592.m_8768();
      this.f_11592.m_823(Float.isFinite(var2) && var2 >= 0.0F && var2 <= f_11601 ? var2 : f_11602);
   }

   private void m_4049(Class_zFd1aKtwR3Hz00EA var1) {
      if (f_11537.player != null && f_11537.gameMode != null && f_11537.gui.screen() == var1.m_9807()) {
         long var2 = System.currentTimeMillis();
         if (this.f_11593 != var1.m_9807()) {
            this.f_11593 = var1.m_9807();
            this.f_11594 = var2;
         }

         Slot var4 = var1.m_9806();
         if (f_11537.isWindowActive() && var4 != null && var4.isActive() && var4.hasItem()) {
            long var5 = f_11537.getWindow().handle();
            if (GLFW.glfwGetMouseButton(var5, 0) == 1 && GLFW.glfwGetKey(var5, 340) == 1) {
               long var7 = this.f_11592.m_8768().longValue() * f_11600;
               if (var2 - this.f_11594 >= var7) {
                  var1.m_9808();
                  this.f_11594 = var2;
               }
            }
         }
      }
   }

   public ItemScroller() {
      super(f_11596, f_11597, Category.MISC);
      this.f_11592 = new SliderSetting(f_11598, 1.0F, 0.0F, f_11599).m_828(1.0F);
      this.f_11595 = this::m_4049;
      this.m_795(this.f_11592);
   }
}
