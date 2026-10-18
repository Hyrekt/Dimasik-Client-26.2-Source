package dev.dimasik;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.system.Class_X574GcHt0SazS9zo;
import net.fabricmc.api.ClientModInitializer;

public class Dimasik implements ClientModInitializer {
   public void onInitializeClient() {
      Class_X574GcHt0SazS9zo.m_5501();
      new DimasikClient();
   }
}
