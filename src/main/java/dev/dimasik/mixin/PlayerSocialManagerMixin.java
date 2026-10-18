package dev.dimasik.mixin;

import com.mojang.authlib.minecraft.UserApiService;
import dev.dimasik.client.system.Class_IcxzP9CeJec7FlAp;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import net.minecraft.client.gui.screens.social.PlayerSocialManager;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerSocialManager.class)
public abstract class PlayerSocialManagerMixin {
   @Shadow
   @Final
   private UserApiService service;
   @Shadow
   private boolean onlineMode;
   @Shadow
   private CompletableFuture<?> pendingBlockListRefresh;
   @Unique
   private Class_IcxzP9CeJec7FlAp dimasik$blockList;

   @Inject(method = "startOnlineMode", at = @At("RETURN"))
   private void dimasik$captureBlockList(CallbackInfo var1) {
      if (Class_IcxzP9CeJec7FlAp.m_3113(this.service)) {
         if (this.dimasik$blockList == null) {
            this.dimasik$blockList = new Class_IcxzP9CeJec7FlAp(this.service);
         }

         this.pendingBlockListRefresh = this.dimasik$blockList.m_3117(this.pendingBlockListRefresh);
      }
   }

   @Inject(method = "isBlocked", at = @At("HEAD"), cancellable = true)
   private void dimasik$checkCachedBlockList(UUID var1, CallbackInfoReturnable<Boolean> var2) {
      if (!this.onlineMode) {
         var2.setReturnValue(false);
      } else if (Class_IcxzP9CeJec7FlAp.m_3113(this.service)) {
         if (this.dimasik$blockList == null) {
            this.dimasik$blockList = new Class_IcxzP9CeJec7FlAp(this.service);
            this.pendingBlockListRefresh = this.dimasik$blockList.m_3117(this.pendingBlockListRefresh);
         }

         this.pendingBlockListRefresh = this.dimasik$blockList.m_3119(this.pendingBlockListRefresh);
         var2.setReturnValue(this.dimasik$blockList.m_3116(var1));
      }
   }
}
