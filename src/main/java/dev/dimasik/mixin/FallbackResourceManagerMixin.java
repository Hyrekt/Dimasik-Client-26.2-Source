package dev.dimasik.mixin;

import dev.dimasik.client.system.Class_yat3STEywmb0lNb5;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.PackResources;
import net.minecraft.server.packs.resources.FallbackResourceManager;
import net.minecraft.server.packs.resources.IoSupplier;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.server.packs.resources.ResourceMetadata;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FallbackResourceManager.class)
public abstract class FallbackResourceManagerMixin {
   private static final String f_36638 = "dimasik";
   private static final String f_36639 = ".png";
   private static final String f_36640 = ".vsh";
   private static final String f_36641 = ".fsh";
   private static final String f_36642 = ".glsl";

   @Inject(method = "createResource", at = @At("RETURN"), cancellable = true)
   private static void decryptDimasikResource(
      PackResources var0, Identifier var1, IoSupplier<InputStream> var2, IoSupplier<ResourceMetadata> var3, CallbackInfoReturnable<Resource> var4
   ) {
      if (shouldDecrypt(var1)) {
         Resource var5 = (Resource)var4.getReturnValue();
         Resource var6 = new Resource(var5.source(), () -> decrypt(var5, var1), var5::metadata);
         var4.setReturnValue(var6);
      }
   }

   private static InputStream decrypt(Resource var0, Identifier var1) throws IOException {
      try (InputStream var2 = var0.open()) {
         try {
            return Class_yat3STEywmb0lNb5.m_9683(var2, var1.toString());
         } catch (GeneralSecurityException var6) {
            throw new IOException("Failed to decrypt resource: " + var1, var6);
         }
      }
   }

   private static boolean shouldDecrypt(Identifier var0) {
      if (!f_36638.equals(var0.getNamespace())) {
         return false;
      }

      String var1 = var0.getPath();
      return var1.endsWith(f_36639) || var1.endsWith(f_36640) || var1.endsWith(f_36641) || var1.endsWith(f_36642);
   }
}
