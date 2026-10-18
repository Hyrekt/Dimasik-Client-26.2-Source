package dev.dimasik.client.system;

import dev.dimasik.client.ui.screen.Screen_1;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.TitleScreen;

public final class Class_3rIWKJPNF4pSLfT4 {
   private Class_3rIWKJPNF4pSLfT4() {
   }

   public static Screen m_1330(Screen var0, boolean var1) {
      if (Class_HKVFPtZz5yGHYty6.m_2883()) {
         return var0;
      } else {
         return !(var0 instanceof TitleScreen) && (var0 != null || var1) ? var0 : new Screen_1();
      }
   }
}
