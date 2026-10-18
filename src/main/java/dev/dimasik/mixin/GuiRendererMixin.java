package dev.dimasik.mixin;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.system.Class_CWsov3cJu2mwXMhM;
import dev.dimasik.client.system.Class_G9igPv6YqsJmODJA;
import dev.dimasik.client.system.Class_HKVFPtZz5yGHYty6;
import dev.dimasik.client.system.Class_S89XFKlG2CC1ymou;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_aWLprtZpm5cB7Dha;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_c1vfJn2bkwGOckqu;
import dev.dimasik.client.system.Class_pWBPWEkbosJrpHg9;
import dev.dimasik.client.system.Class_s5Et3FmuBUH4bvsQ;
import dev.dimasik.client.system.Class_zcop3nhFFuuxjT2z;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.render.GuiRenderer;
import net.minecraft.client.gui.render.pip.PictureInPictureRenderer;
import net.minecraft.client.renderer.state.gui.pip.PictureInPictureRenderState;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiRenderer.class)
public class GuiRendererMixin {
   @Shadow
   @Final
   @Mutable
   private Map<Class<? extends PictureInPictureRenderState>, PictureInPictureRenderer<?>> pictureInPictureRenderers;

   @Inject(method = "<init>", at = @At("TAIL"))
   private void addWingRenderer(CallbackInfo var1) {
      HashMap var2 = new HashMap<>(this.pictureInPictureRenderers);
      var2.put(Class_s5Et3FmuBUH4bvsQ.class, new Class_G9igPv6YqsJmODJA());
      var2.put(Class_zcop3nhFFuuxjT2z.class, new Class_aWLprtZpm5cB7Dha());
      var2.put(Class_CWsov3cJu2mwXMhM.class, new Class_c1vfJn2bkwGOckqu());
      this.pictureInPictureRenderers = Map.copyOf(var2);
   }

   @Inject(method = "render()V", at = @At("TAIL"))
   private void renders(CallbackInfo var1) {
      if (!Class_HKVFPtZz5yGHYty6.m_2883()) {
         Class_bhRaN0YSSLQRYjPo.LeCf1iKfPVPci6zr var2 = new Class_bhRaN0YSSLQRYjPo.LeCf1iKfPVPci6zr(
            (float)Minecraft.getInstance().mouseHandler.xpos(), (float)Minecraft.getInstance().mouseHandler.ypos()
         );
         DimasikClient.m_9057().m_9051().m_9708(var2);
         Class_pWBPWEkbosJrpHg9.m_8060();
         Class_S89XFKlG2CC1ymou.m_4695();
      }

      Class_Ssh31B3ljfKeWsvS.m_4867();
   }
}
