package dev.dimasik.mixin;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.system.Class_7DTOkauxrDyjxs2f;
import dev.dimasik.client.system.Class_B6JOzHnwhU3pe4AO;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_Wb2zlgDaESbnT0hQ;
import dev.dimasik.client.system.Class_sJi3aXfHth4X5YmL;
import net.minecraft.client.Minecraft;
import net.minecraft.client.MouseHandler;
import net.minecraft.client.input.MouseButtonInfo;
import net.minecraft.client.player.LocalPlayer;
import org.joml.Vector2f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MouseHandler.class)
public class MouseHandlerMixin {
   @Shadow
   private double accumulatedDX;
   @Shadow
   private double accumulatedDY;

   @Inject(method = "onButton", at = @At("HEAD"), cancellable = true)
   private void onMouseButton(long var1, MouseButtonInfo var3, int var4, CallbackInfo var5) {
      DimasikClient.m_9057().m_9051().m_9708(new Class_B6JOzHnwhU3pe4AO(var3.button(), var4));
      Minecraft var6 = Minecraft.getInstance();
      if (var4 == 1 && var6.gui.screen() != null) {
         Vector2f var7 = Class_FvJXUGWpZo3zYBW4.m_2693(var6.mouseHandler.xpos(), var6.mouseHandler.ypos());
         Class_7DTOkauxrDyjxs2f var8 = new Class_7DTOkauxrDyjxs2f(var7.x, var7.y, var3.button());
         DimasikClient.m_9057().m_9051().m_9708(var8);
         if (var8.m_1581()) {
            var5.cancel();
         }
      }
   }

   @Inject(method = "handleAccumulatedMovement", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/MouseHandler;turnPlayer(D)V", shift = Shift.AFTER))
   private void accumulateMove(CallbackInfo var1) {
      Class_sJi3aXfHth4X5YmL var2 = new Class_sJi3aXfHth4X5YmL(this.accumulatedDX, this.accumulatedDY);
      DimasikClient.m_9057().m_9051().m_9708(var2);
   }

   @Redirect(method = "turnPlayer", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/player/LocalPlayer;turn(DD)V"))
   public void changeLookDirection(LocalPlayer var1, double var2, double var4) {
      Class_Wb2zlgDaESbnT0hQ var6 = new Class_Wb2zlgDaESbnT0hQ((float)var2, (float)var4);
      DimasikClient.m_9057().m_9051().m_9708(var6);
      if (!var6.m_1581()) {
         var1.turn(var2, var4);
      }
   }
}
