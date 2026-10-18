package dev.dimasik.mixin;

import dev.dimasik.client.module.misc.RWFixer;
import java.net.Proxy;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import net.minecraft.client.User;
import net.minecraft.client.resources.server.DownloadedPackSource;
import net.minecraft.client.resources.server.PackDownloader;
import net.minecraft.client.resources.server.PackLoadFeedback;
import net.minecraft.client.resources.server.PackLoadFeedback.FinalResult;
import net.minecraft.client.resources.server.PackLoadFeedback.Update;
import net.minecraft.client.resources.server.ServerPackManager.PackPromptStatus;
import net.minecraft.network.Connection;
import net.minecraft.server.packs.DownloadQueue;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DownloadedPackSource.class)
public abstract class DownloadedPackSourceMixin {
   @Inject(method = "createDownloader", at = @At("RETURN"), cancellable = true)
   private void dimasik$prepareReallyWorldPacks(DownloadQueue var1, Executor var2, User var3, Proxy var4, CallbackInfoReturnable<PackDownloader> var5) {
      PackDownloader var6 = (PackDownloader)var5.getReturnValue();
      var5.setReturnValue((PackDownloader)(var2x, var3x) -> {
         Map var4x = Map.copyOf(var2x);
         RWFixer var5x = RWFixer.m_8294();
         Connection var6x = var5x != null ? var5x.m_8301() : null;
         var6.download(var4x, var5xx -> {
            if (var5x == null) {
               var3x.accept(var5xx);
            } else {
               var5x.m_8293(var4x, var6x, var5xx, var3x, var2);
            }
         });
      });
   }

   @Inject(method = "createPackResponseSender", at = @At("RETURN"), cancellable = true)
   private static void dimasik$spoofReallyWorldStatus(final Connection var0, CallbackInfoReturnable<PackLoadFeedback> var1) {
      final PackLoadFeedback var2 = (PackLoadFeedback)var1.getReturnValue();
      var1.setReturnValue(new PackLoadFeedback() {
         public void reportUpdate(UUID var1, Update var2x) {
            RWFixer var3 = RWFixer.m_8294();
            if (var3 == null || !var3.m_8309(var0, var1)) {
               var2.reportUpdate(var1, var2x);
            }
         }

         public void reportFinalResult(UUID var1, FinalResult var2x) {
            RWFixer var3 = RWFixer.m_8294();
            if (var3 != null) {
               var3.m_8291(var0, var1, var2x);
            }

            if (var3 == null || !var3.m_8309(var0, var1)) {
               var2.reportFinalResult(var1, var2x);
            }
         }
      });
   }

   @Inject(method = "cleanupAfterDisconnect", at = @At("RETURN"))
   private void dimasik$clearReallyWorldPacks(CallbackInfo var1) {
      RWFixer var2 = RWFixer.m_8294();
      if (var2 != null) {
         var2.m_8296();
      }
   }

   @Inject(method = "configureForServerControl", at = @At("HEAD"))
   private void dimasik$resetReallyWorldConnection(Connection var1, PackPromptStatus var2, CallbackInfo var3) {
      RWFixer var4 = RWFixer.m_8294();
      if (var4 != null && var4.m_8301() != var1) {
         var4.m_8296();
      }
   }
}
