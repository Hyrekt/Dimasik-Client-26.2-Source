package dev.dimasik.mixin;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.system.Class_QBKwWNWLlChWViO9;
import dev.dimasik.client.system.Class_WCOf2iYDUGCRyVGl;
import dev.dimasik.client.system.Class_kkp256olqZ4F1qt3;
import dev.dimasik.client.system.Class_mRcJJZJYG5cvDAlU;
import net.minecraft.client.Options;
import net.minecraft.client.player.KeyboardInput;
import net.minecraft.world.entity.player.Input;
import net.minecraft.world.phys.Vec2;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(KeyboardInput.class)
public class KeyboardInputMixin {
   @Final
   @Shadow
   private Options options;

   @Inject(method = "tick", at = @At("HEAD"), cancellable = true)
   public void tick(CallbackInfo var1) {
      var1.cancel();
      Class_mRcJJZJYG5cvDAlU var2 = new Class_mRcJJZJYG5cvDAlU(
         KeyboardInput.calculateImpulse(this.options.keyUp.isDown(), this.options.keyDown.isDown()),
         KeyboardInput.calculateImpulse(this.options.keyLeft.isDown(), this.options.keyRight.isDown()),
         this.options.keyUp.isDown(),
         this.options.keyDown.isDown(),
         this.options.keyLeft.isDown(),
         this.options.keyRight.isDown(),
         this.options.keyJump.isDown(),
         this.options.keyShift.isDown(),
         this.options.keySprint.isDown()
      );
      DimasikClient.m_9057().m_9051().m_9708(var2);
      if (!var2.m_1581()) {
         Class_kkp256olqZ4F1qt3 var3 = DimasikClient.m_9057().m_9049().m_2813().m_5180();
         if (var3 != null && var3.m_7468()) {
            Class_QBKwWNWLlChWViO9.m_4255(var2);
         }

         ((KeyboardInput)(Object)this).keyPresses = new Input(var2.m_7595(), var2.m_7589(), var2.m_7602(), var2.m_7600(), var2.m_7598(), var2.m_7601(), var2.m_7591());
         if (Class_WCOf2iYDUGCRyVGl.m_5424() != null && Class_WCOf2iYDUGCRyVGl.m_5424().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
            ((KeyboardInput)(Object)this).moveVector = new Vec2(var2.m_7603(), var2.m_7588());
         } else {
            ((KeyboardInput)(Object)this).moveVector = new Vec2(var2.m_7603(), var2.m_7588()).normalized();
         }
      }
   }
}
