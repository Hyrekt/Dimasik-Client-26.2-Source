package dev.dimasik.mixin;

import dev.dimasik.client.system.Class_HrGsNnD57pFcZeYW;
import java.util.List;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.ServerList;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerList.class)
public class ServerListMixin {
   @Shadow
   @Final
   private List<ServerData> serverList;

   @Inject(method = "load", at = @At("RETURN"))
   private void dimasik$addPinnedServers(CallbackInfo var1) {
      if (Class_HrGsNnD57pFcZeYW.m_2937(this.serverList)) {
         ((ServerList)(Object)this).save();
      }
   }

   @Inject(method = "remove", at = @At("RETURN"))
   private void dimasik$keepPinnedServers(ServerData var1, CallbackInfo var2) {
      if (Class_HrGsNnD57pFcZeYW.m_2940(var1)) {
         Class_HrGsNnD57pFcZeYW.m_2937(this.serverList);
      }
   }

   @Inject(method = "swap", at = @At("RETURN"))
   private void dimasik$keepPinnedOrder(int var1, int var2, CallbackInfo var3) {
      Class_HrGsNnD57pFcZeYW.m_2937(this.serverList);
   }
}
