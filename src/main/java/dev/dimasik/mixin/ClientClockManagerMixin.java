package dev.dimasik.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.render.Ambience;
import net.minecraft.client.ClientClockManager;
import net.minecraft.core.Holder;
import net.minecraft.world.clock.WorldClock;
import net.minecraft.world.clock.WorldClocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ClientClockManager.class)
public abstract class ClientClockManagerMixin {
   @ModifyReturnValue(method = "getTotalTicks", at = @At("RETURN"))
   private long dimasik$overrideWorldTime(long var1, Holder<WorldClock> var3) {
      if (!var3.is(WorldClocks.OVERWORLD)) {
         return var1;
      } else {
         DimasikClient var4 = DimasikClient.m_9057();
         if (var4 != null && var4.m_9049() != null && var4.m_9049().m_2801() != null) {
            Ambience var5 = var4.m_9049().m_2801().m_3511();
            return var5 == null ? var1 : var5.m_3008(var1);
         } else {
            return var1;
         }
      }
   }
}
