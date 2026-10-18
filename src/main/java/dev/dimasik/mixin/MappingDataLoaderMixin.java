package dev.dimasik.mixin;

import dev.dimasik.client.system.Class_6M2KTJxj5F0zKj2K;
import dev.dimasik.mixin.annotation.IfModLoaded;
import java.io.InputStream;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@IfModLoaded({"replaymod", "viafabricplus"})
@Pseudo
@Mixin(
   targets = {"com.viaversion.viaversion.api.data.MappingDataLoader", "com.replaymod.replaystudio.lib.viaversion.api.data.MappingDataLoader"},
   remap = false
)
public abstract class MappingDataLoaderMixin {
   @Shadow(remap = false)
   @Final
   private Class<?> dataLoaderClass;
   @Shadow(remap = false)
   @Final
   private String dataPath;

   @Inject(method = "getResource(Ljava/lang/String;)Ljava/io/InputStream;", at = @At("HEAD"), cancellable = true, remap = false)
   private void dimasik$readOwnedMapping(String var1, CallbackInfoReturnable<InputStream> var2) {
      var2.setReturnValue(Class_6M2KTJxj5F0zKj2K.m_1542(this.dataLoaderClass, this.dataPath + var1));
   }
}
