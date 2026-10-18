package dev.dimasik.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.combat.CrystalAura;
import dev.dimasik.client.module.misc.OpenWalls;
import dev.dimasik.client.module.misc.PvpSafe;
import dev.dimasik.client.system.Class_0luV76OwW94UA9ep;
import dev.dimasik.client.system.Class_1zuDZFR2X3PEGKeD;
import dev.dimasik.client.system.Class_2rBcvBFWICpL1qYQ;
import dev.dimasik.client.system.Class_CfVCvIKlP96CnB1Y;
import dev.dimasik.client.system.Class_ETHFYgDAWb9l6f3g;
import dev.dimasik.client.system.Class_MVSd3mwdK6LBOLSC;
import dev.dimasik.client.system.Class_X574GcHt0SazS9zo;
import dev.dimasik.client.system.Class_YKVEPueVFZUF71Xd;
import dev.dimasik.client.system.Class_pYAz0kgoyIbaaR5n;
import dev.dimasik.client.system.Class_sULPxrOl7TpPlaX6;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult.Type;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Minecraft.class)
public class MinecraftMixin_3 {
   @Unique
   private final Class_2rBcvBFWICpL1qYQ frame$60 = new Class_2rBcvBFWICpL1qYQ(false);
   @Unique
   private final Class_2rBcvBFWICpL1qYQ frame$240 = new Class_2rBcvBFWICpL1qYQ(false);
   @Shadow
   public @Nullable ClientLevel level;
   @Shadow
   private int rightClickDelay;

   @Inject(method = "updateTitle", at = @At("HEAD"), cancellable = true)
   private void dimasik$unhookWindowTitle(CallbackInfo var1) {
      if (true) {
         Minecraft.getInstance().getWindow().setTitle("cracked by @soezproject & Vkontakt3");
         var1.cancel();
      }
   }

   @Inject(method = "tick", at = @At("HEAD"))
   private void tick(CallbackInfo var1) {
      DimasikClient.m_9057().m_9051().m_9708(new Class_sULPxrOl7TpPlaX6());
   }

   @Inject(method = "runTick", at = @At("HEAD"))
   private void render(boolean var1, CallbackInfo var2) {
      if (Minecraft.getInstance().player != null) {
         this.frame$60.m_1203(60, () -> DimasikClient.m_9057().m_9051().m_9708(new Class_pYAz0kgoyIbaaR5n()));
         this.frame$240.m_1203(240, () -> DimasikClient.m_9057().m_9051().m_9708(new Class_ETHFYgDAWb9l6f3g()));
      }
   }

   @WrapOperation(
      method = "startUseItem",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/multiplayer/MultiPlayerGameMode;useItemOn(Lnet/minecraft/client/player/LocalPlayer;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/BlockHitResult;)Lnet/minecraft/world/InteractionResult;"
      )
   )
   private InteractionResult openWallsInteract(
      MultiPlayerGameMode var1, LocalPlayer var2, InteractionHand var3, BlockHitResult var4, Operation<InteractionResult> var5
   ) {
      OpenWalls var6 = DimasikClient.m_9057().m_9049().m_2801().m_3522();
      if (var6.m_776() && !var2.getItemInHand(var3).is(Items.EXPERIENCE_BOTTLE)) {
         BlockHitResult var7 = Class_1zuDZFR2X3PEGKeD.m_888(
            var2, var2.blockInteractionRange(), var1x -> var6.m_5441().stream().anyMatch(var1xx -> var1xx.isInstance(var1x))
         );
         if (var7.getType() == Type.BLOCK) {
            InteractionResult var8 = (InteractionResult)var5.call(new Object[]{var1, var2, var3, var7});
            return InteractionResult.SUCCESS;
         } else {
            return (InteractionResult)var5.call(new Object[]{var1, var2, var3, var4});
         }
      } else {
         return (InteractionResult)var5.call(new Object[]{var1, var2, var3, var4});
      }
   }

   @Inject(method = "continueAttack", at = @At("HEAD"), cancellable = true)
   private void retainCrystalMining(boolean var1, CallbackInfo var2) {
      CrystalAura var3 = DimasikClient.m_9057().m_9049().m_2801().m_3444();
      if (var3 != null && var3.m_5779()) {
         var2.cancel();
      }
   }

   @Redirect(
      method = "continueAttack",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/multiplayer/MultiPlayerGameMode;continueDestroyBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Z"
      )
   )
   private boolean hookBlockDamage(MultiPlayerGameMode var1, BlockPos var2, Direction var3) {
      BlockState var4 = this.level.getBlockState(var2);
      Class_CfVCvIKlP96CnB1Y var5 = new Class_CfVCvIKlP96CnB1Y(var4, var2, Class_CfVCvIKlP96CnB1Y.Class_7LDFCrX8BWsvELV3.START, var3);
      DimasikClient.m_9057().m_9051().m_9708(var5);
      if (var5.m_1581()) {
         return false;
      }

      boolean var6 = var1.continueDestroyBlock(var2, var3);
      DimasikClient.m_9057().m_9051().m_9708(new Class_CfVCvIKlP96CnB1Y(var4, var2, Class_CfVCvIKlP96CnB1Y.Class_7LDFCrX8BWsvELV3.STOP, var3));
      return var6;
   }

   @WrapOperation(method = "handleKeybinds", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/KeyMapping;consumeClick()Z"))
   private boolean freecamambassador(KeyMapping var1, Operation<Boolean> var2) {
      boolean var3 = (Boolean)var2.call(new Object[]{var1});
      return var1 == ((Minecraft)(Object)this).options.keyTogglePerspective
            && DimasikClient.m_9057() != null
            && DimasikClient.m_9057().m_9049().m_2801().m_3460().m_776()
         ? false
         : var3;
   }

   @Inject(
      method = "startAttack",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/player/LocalPlayer;swing(Lnet/minecraft/world/InteractionHand;)V")
   )
   private void hmiAttackSwing(CallbackInfoReturnable<Boolean> var1) {
      Minecraft var2 = (Minecraft)(Object)this;
      if (Class_X574GcHt0SazS9zo.m_5499() && var2.player instanceof Class_YKVEPueVFZUF71Xd var3) {
         var3.hMI5_0$resetMainHandSwing(false);
      }
   }

   @Redirect(
      method = "startUseItem",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/player/LocalPlayer;swing(Lnet/minecraft/world/InteractionHand;)V")
   )
   private void hmiUseSwing(LocalPlayer var1, InteractionHand var2) {
      if (Class_X574GcHt0SazS9zo.m_5499() && var1 instanceof Class_YKVEPueVFZUF71Xd var3) {
         if (var2 == InteractionHand.MAIN_HAND) {
            var3.hMI5_0$resetMainHandSwing(true);
         } else {
            var3.hMI5_0$resetOffHandSwing(true);
         }
      }

      var1.swing(var2);
   }

   @Inject(method = "startUseItem", at = @At("HEAD"), cancellable = true)
   private void onUseItem(CallbackInfo var1) {
      Class_0luV76OwW94UA9ep var2 = new Class_0luV76OwW94UA9ep();
      DimasikClient.m_9057().m_9051().m_9708(var2);
      if (var2.m_1581()) {
         this.rightClickDelay = 4;
         var1.cancel();
      }
   }

   @Inject(method = {"disconnectWithProgressScreen()V", "disconnectWithSavingScreen()V"}, at = @At("HEAD"), cancellable = true)
   private void blockPvpDisconnect(CallbackInfo var1) {
      if (PvpSafe.m_7585()) {
         var1.cancel();
      }
   }

   @Inject(method = "disconnectWithProgressScreen(Z)V", at = @At("HEAD"), cancellable = true)
   private void blockPvpTransferDisconnect(boolean var1, CallbackInfo var2) {
      if (PvpSafe.m_7585()) {
         var2.cancel();
      }
   }

   @Inject(method = {"disconnectWithProgressScreen()V", "disconnectWithSavingScreen()V", "disconnectWithProgressScreen(Z)V"}, at = @At("RETURN"))
   private void resetWorldRenderResources(CallbackInfo var1) {
      if (!var1.isCancelled()) {
         Class_MVSd3mwdK6LBOLSC.m_3892();
      }
   }
}
