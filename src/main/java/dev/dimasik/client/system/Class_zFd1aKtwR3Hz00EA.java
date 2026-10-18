package dev.dimasik.client.system;

import lombok.Generated;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.world.inventory.Slot;

public class Class_zFd1aKtwR3Hz00EA implements Class_W36DTOFJFiIifzGK {
   private final AbstractContainerScreen<?> f_36110;
   private final Slot f_36111;
   private final Runnable f_36112;

   @Generated
   public Slot m_9806() {
      return this.f_36111;
   }

   @Generated
   public AbstractContainerScreen<?> m_9807() {
      return this.f_36110;
   }

   @Generated
   public Class_zFd1aKtwR3Hz00EA(AbstractContainerScreen<?> var1, Slot var2, Runnable var3) {
      this.f_36110 = var1;
      this.f_36111 = var2;
      this.f_36112 = var3;
   }

   public void m_9808() {
      this.f_36112.run();
   }
}
