package dev.dimasik.client.system;

import net.minecraft.client.Minecraft;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;

public class Class_ovy1AInkwJ2AwJ25 {
   @Class_FUILRKIQ6wtWry59("playSound")
   public void m_7999(String var1, double var2) {
      Minecraft.getInstance().player.playSound(SoundEvent.createVariableRangeEvent(Identifier.withDefaultNamespace(var1)), (float)var2, 1.0F);
   }
}
