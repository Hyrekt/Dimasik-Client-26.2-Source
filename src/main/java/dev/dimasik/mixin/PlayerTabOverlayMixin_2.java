package dev.dimasik.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.system.Class_29BIBbZyd5QWCwS1;
import dev.dimasik.client.system.Class_Q49u2s432M4ulFXV;
import dev.dimasik.client.system.Class_w94t5R4ZHRA02uGb;
import java.util.UUID;
import java.util.WeakHashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.PlayerTabOverlay;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.network.chat.Component;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.scores.Scoreboard;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerTabOverlay.class)
public class PlayerTabOverlayMixin_2 {
   @Shadow
   private Component footer;
   @Shadow
   private Component header;
   @Unique
   private Component dimas$originalFooter;
   @Unique
   private Component dimas$originalHeader;
   @Unique
   private Component dimas$sourceFooter;
   @Unique
   private Component dimas$sourceHeader;
   @Unique
   private Component dimas$protectedFooter;
   @Unique
   private Component dimas$protectedHeader;
   @Unique
   private boolean dimas$animationMatrixPushed;
   @Unique
   private final WeakHashMap<PlayerInfo, Component> dimas$sourceNameCache = new WeakHashMap<>();
   @Unique
   private final WeakHashMap<PlayerInfo, Component> dimas$protectedNameCache = new WeakHashMap<>();
   @Unique
   private int dimas$protectionSignature;
   @Unique
   private boolean dimas$nameProtectEnabled;
   @Unique
   private UUID dimas$localPlayerUuid;
   private static final float f_36709 = 0.5F;
   private static final float f_36710 = 10.0F;

   @Inject(method = "extractRenderState", at = @At("HEAD"))
   private void dimas$beginTabCapture(GuiGraphicsExtractor var1, int var2, Scoreboard var3, Objective var4, CallbackInfo var5) {
      this.dimas$originalFooter = this.footer;
      this.dimas$originalHeader = this.header;
      Minecraft var6 = Minecraft.getInstance();
      this.dimas$nameProtectEnabled = Class_29BIBbZyd5QWCwS1.m_993();
      int var7 = Class_29BIBbZyd5QWCwS1.m_973();
      if (var7 != this.dimas$protectionSignature) {
         this.dimas$protectionSignature = var7;
         this.dimas$sourceNameCache.clear();
         this.dimas$protectedNameCache.clear();
         this.dimas$sourceFooter = null;
         this.dimas$sourceHeader = null;
      }

      this.dimas$localPlayerUuid = var6.player == null ? null : var6.player.getUUID();
      if (this.dimas$sourceFooter != this.footer) {
         this.dimas$sourceFooter = this.footer;
         this.dimas$protectedFooter = Class_29BIBbZyd5QWCwS1.m_956(this.footer);
      }

      if (this.dimas$sourceHeader != this.header) {
         this.dimas$sourceHeader = this.header;
         this.dimas$protectedHeader = Class_29BIBbZyd5QWCwS1.m_956(this.header);
      }

      this.footer = this.dimas$protectedFooter;
      this.header = this.dimas$protectedHeader;
      boolean var8 = var6.options != null && var6.options.keyPlayerList.isDown();
      Class_Q49u2s432M4ulFXV.md2fuys8biu4Kb1I var9 = dimas$playerListAnimation(var8);
      this.dimas$animationMatrixPushed = var9.m_4244();
      if (this.dimas$animationMatrixPushed) {
         float var10 = var9.m_4247();
         float var11 = var2 * f_36709;
         float var12 = f_36710;
         var1.pose().pushMatrix();
         var1.pose().translate(var11, var12);
         var1.pose().scale(var10, var10);
         var1.pose().translate(-var11, -var12);
      }

      Class_w94t5R4ZHRA02uGb.m_9294();
      Class_29BIBbZyd5QWCwS1.m_998();
      Class_29BIBbZyd5QWCwS1.m_959();
   }

   @Inject(method = "getNameForDisplay", at = @At("RETURN"), cancellable = true)
   private void dimas$protectTabPlayerName(PlayerInfo var1, CallbackInfoReturnable<Component> var2) {
      Component var3 = (Component)var2.getReturnValue();
      if (var3 != null && this.dimas$nameProtectEnabled) {
         Component var4 = this.dimas$sourceNameCache.get(var1);
         Component var5 = this.dimas$protectedNameCache.get(var1);
         if (var5 == null || var4 != var3 && (var4 == null || !var4.equals(var3))) {
            boolean var6 = this.dimas$localPlayerUuid != null && var1.getProfile().id().equals(this.dimas$localPlayerUuid);
            Component var7 = var6 ? Class_29BIBbZyd5QWCwS1.m_931(var3) : Class_29BIBbZyd5QWCwS1.m_940(var3);
            this.dimas$sourceNameCache.put(var1, var3);
            this.dimas$protectedNameCache.put(var1, var7);
            var2.setReturnValue(var7);
         } else {
            var2.setReturnValue(var5);
         }
      }
   }

   @WrapOperation(method = "extractRenderState", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiGraphicsExtractor;fill(IIIII)V"))
   private void dimas$captureTabFill(GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5, int var6, Operation<Void> var7) {
      Class_w94t5R4ZHRA02uGb.m_9306(var2, var3, var4, var5);
      var7.call(new Object[]{var1, var2, var3, var4, var5, var6});
   }

   @Inject(method = "extractRenderState", at = @At("RETURN"))
   private void dimas$endTabCapture(GuiGraphicsExtractor var1, int var2, Scoreboard var3, Objective var4, CallbackInfo var5) {
      try {
         Class_w94t5R4ZHRA02uGb.m_9293();
      } finally {
         if (this.dimas$animationMatrixPushed) {
            var1.pose().popMatrix();
            this.dimas$animationMatrixPushed = false;
         }

         this.footer = this.dimas$originalFooter;
         this.header = this.dimas$originalHeader;
         this.dimas$originalFooter = null;
         this.dimas$originalHeader = null;
         this.dimas$nameProtectEnabled = false;
         this.dimas$localPlayerUuid = null;
         Class_29BIBbZyd5QWCwS1.m_969();
         Class_29BIBbZyd5QWCwS1.m_958();
      }
   }

   @Unique
   private static Class_Q49u2s432M4ulFXV.md2fuys8biu4Kb1I dimas$playerListAnimation(boolean var0) {
      Class_Q49u2s432M4ulFXV.md2fuys8biu4Kb1I var1 = new Class_Q49u2s432M4ulFXV.md2fuys8biu4Kb1I(var0);
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9051() != null) {
         DimasikClient.m_9057().m_9051().m_9708(var1);
      }

      return var1;
   }
}
