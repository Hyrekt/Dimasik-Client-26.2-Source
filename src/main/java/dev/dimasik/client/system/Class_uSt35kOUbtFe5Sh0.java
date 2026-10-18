package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.world.InteractionHand;

public class Class_uSt35kOUbtFe5Sh0 {
   public static void m_9195(
      ArrayList<Class_uGNFApwy8sUjPdk5> var0,
      PoseStack var1,
      SubmitNodeCollector var2,
      String var3,
      InteractionHand var4,
      int var5,
      AbstractClientPlayer var6,
      float var7
   ) {
      Iterator var8 = var0.iterator();

      while (var8.hasNext()) {
         Class_uGNFApwy8sUjPdk5 var9 = (Class_uGNFApwy8sUjPdk5)var8.next();
         if (var9.f_32747) {
            var8.remove();
         } else if (var9.f_32746 == var3 && var9.f_32769 == var4) {
            if (var9.f_32773 != null) {
               var9.m_9126(var9.f_32773, var2, var5, var6, var7);
            } else {
               var9.m_9126(var1, var2, var5, var6, var7);
            }

            var9.m_9127();
         }
      }
   }
}
