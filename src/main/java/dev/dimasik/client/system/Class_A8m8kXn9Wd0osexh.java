package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.PoseStack.Pose;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ARGB;

public final class Class_A8m8kXn9Wd0osexh {
   private static final List<Class_A8m8kXn9Wd0osexh.znFy9xCNOz1Br7XS> f_5088 = new ArrayList<>();
   private static final int f_5089 = 15728880;
   private static final float f_5090 = 255.0F;
   private static final float f_5091 = 255.0F;
   private static final float f_5092 = 255.0F;
   private static final float f_5093 = 255.0F;

   public static void m_2076() {
      f_5088.clear();
   }

   public static void m_2078(SubmitNodeCollector var0) {
      if (!f_5088.isEmpty() && var0 != null) {
         PoseStack var1 = new PoseStack();

         for (Class_A8m8kXn9Wd0osexh.znFy9xCNOz1Br7XS var3 : f_5088) {
            var1.last().set(var3.matricesEntry);
            var0.submitCustomGeometry(
               var1,
               RenderTypes.outline(var3.type.m_8628()),
               (var1x, var2) -> {
                  PoseStack var3x = new PoseStack();
                  var3x.last().set(var1x);
                  var3.type
                     .m_8630()
                     .m_2482(
                        var3.animator,
                        var3.tickDelta,
                        var3x,
                        var2,
                        f_5089,
                        OverlayTexture.NO_OVERLAY,
                        ARGB.red(var3.outlineColor) / f_5090,
                        ARGB.green(var3.outlineColor) / f_5091,
                        ARGB.blue(var3.outlineColor) / f_5092,
                        ARGB.alpha(var3.outlineColor) / f_5093
                     );
               }
            );
         }

         f_5088.clear();
      }
   }

   private Class_A8m8kXn9Wd0osexh() {
   }

   public static void m_2079(Pose var0, Class_s5qEamGcEs25C3d8 var1, Class_WzqIkwE6nF1UkDXB var2, float var3, int var4) {
      if (var4 != 0) {
         f_5088.add(new Class_A8m8kXn9Wd0osexh.znFy9xCNOz1Br7XS(var0.copy(), var1, var2, var3, var4));
      }
   }

   private record znFy9xCNOz1Br7XS(Pose matricesEntry, Class_s5qEamGcEs25C3d8 type, Class_WzqIkwE6nF1UkDXB animator, float tickDelta, int outlineColor) {
   }
}
