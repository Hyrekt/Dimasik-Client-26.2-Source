package dev.dimasik.mixin;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.manager.ModuleManager;
import dev.dimasik.client.module.misc.NoInteract;
import dev.dimasik.client.system.Class_CWDgYIJS0DdP16bO;
import dev.dimasik.client.system.Class_CfVCvIKlP96CnB1Y;
import dev.dimasik.client.system.Class_GsbUtVYTQREvoZcW;
import dev.dimasik.client.system.Class_a7M44oHQPwN0rL5A;
import dev.dimasik.client.system.Class_wjdoxQGtI8mFyL6U;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.ShulkerBoxBlock;
import net.minecraft.world.phys.BlockHitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MultiPlayerGameMode.class)
public abstract class MultiPlayerGameModeMixin_2 {
   @Shadow
   private int destroyDelay;

   @Inject(method = "startDestroyBlock", at = @At("HEAD"), cancellable = true)
   private void onAttackBlock(BlockPos var1, Direction var2, CallbackInfoReturnable<Boolean> var3) {
      Minecraft var4 = Minecraft.getInstance();
      if (var4.level != null) {
         Class_CfVCvIKlP96CnB1Y var5 = new Class_CfVCvIKlP96CnB1Y(
            var4.level.getBlockState(var1), var1, Class_CfVCvIKlP96CnB1Y.Class_7LDFCrX8BWsvELV3.START, var2
         );
         DimasikClient.m_9057().m_9051().m_9708(var5);
         if (var5.m_1581()) {
            var3.setReturnValue(false);
         }
      }
   }

   @Inject(method = "attack", at = @At("HEAD"), cancellable = true)
   public void attackEntity(Player var1, Entity var2, CallbackInfo var3) {
      try {
         if (var1 != null && var2 != null) {
            Class_a7M44oHQPwN0rL5A var4 = new Class_a7M44oHQPwN0rL5A(var1, var2);
            DimasikClient.m_9057().m_9051().m_9708(var4);
            if (var4.m_1581()) {
               var3.cancel();
               return;
            }

            DimasikClient.m_9057().m_9051().m_9708(new Class_wjdoxQGtI8mFyL6U(var1, var2, Class_wjdoxQGtI8mFyL6U.Class_327mRdjAqNoPaemJ.PRE));
         }
      } catch (Exception var5) {
      }
   }

   @Inject(method = "attack", at = @At("RETURN"))
   public void attackEntityPost(Player var1, Entity var2, CallbackInfo var3) {
      try {
         if (var1 != null && var2 != null) {
            DimasikClient.m_9057().m_9051().m_9708(new Class_wjdoxQGtI8mFyL6U(var1, var2, Class_wjdoxQGtI8mFyL6U.Class_327mRdjAqNoPaemJ.POST));
         }
      } catch (Exception var5) {
      }
   }

   @Inject(method = "useItemOn", at = @At("HEAD"), cancellable = true)
   public void interactBlock(LocalPlayer var1, InteractionHand var2, BlockHitResult var3, CallbackInfoReturnable<InteractionResult> var4) {
      Class_GsbUtVYTQREvoZcW var5 = new Class_GsbUtVYTQREvoZcW(var1, var2, var3);
      DimasikClient.m_9057().m_9051().m_9708(var5);
      if (var5.m_1581()) {
         var4.setReturnValue(InteractionResult.SUCCESS);
      }

      Block var6 = null;
      if (Minecraft.getInstance().level != null) {
         var6 = Minecraft.getInstance().level.getBlockState(var3.getBlockPos()).getBlock();
      }

      ModuleManager var7 = DimasikClient.m_9057().m_9049().m_2801();
      if (var7.m_3558() == null || !var7.m_3558().m_776()) {
         NoInteract var8 = var7.m_3586();
         if (var8 != null
            && var8.m_776()
            && !var1.isShiftKeyDown()
            && (
               var6 == Blocks.CHEST
                  || var6 == Blocks.TRAPPED_CHEST
                  || var6 == Blocks.FURNACE
                  || var6 == Blocks.ANVIL
                  || var6 == Blocks.CRAFTING_TABLE
                  || var6 == Blocks.HOPPER
                  || var6 == Blocks.JUKEBOX
                  || var6 == Blocks.NOTE_BLOCK
                  || var6 == Blocks.ENDER_CHEST
                  || var6 == Blocks.DISPENSER
                  || var6 == Blocks.DROPPER
                  || var6 instanceof ShulkerBoxBlock
                  || var6 instanceof FenceBlock
                  || var6 instanceof FenceGateBlock
            )) {
            var4.setReturnValue(InteractionResult.PASS);
         }
      }
   }

   @Inject(method = "continueDestroyBlock", at = @At("HEAD"))
   private void updateBlockBreakingProgress(BlockPos var1, Direction var2, CallbackInfoReturnable<Boolean> var3) {
      Class_CWDgYIJS0DdP16bO var4 = new Class_CWDgYIJS0DdP16bO(this.destroyDelay);
      DimasikClient.m_9057().m_9051().m_9708(var4);
      if (var4.m_2419()) {
         this.destroyDelay = 0;
      }
   }
}
