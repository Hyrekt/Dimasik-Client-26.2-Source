package dev.dimasik.mixin;

import dev.dimasik.client.system.Class_7dCjHrlQt8mkhswh;
import net.minecraft.client.multiplayer.resolver.ServerAddress;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ServerAddress.class)
public class ServerAddressMixin {
   @ModifyVariable(method = "parseString", at = @At("HEAD"), argsOnly = true)
   private static String dimasik$redirectAddress(String var0) {
      return Class_7dCjHrlQt8mkhswh.m_1741(var0);
   }
}
