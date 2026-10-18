package dev.dimasik.mixin;

import dev.dimasik.client.system.Class_HKVFPtZz5yGHYty6;
import dev.dimasik.client.system.Class_S89XFKlG2CC1ymou;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.LoadingOverlay;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.server.packs.resources.ReloadInstance;
import net.minecraft.util.Mth;
import net.minecraft.util.Util;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LoadingOverlay.class)
public abstract class LoadingOverlayMixin {
   @Unique
   private static final int BACKGROUND_WIDTH = 1672;
   @Unique
   private static final int BACKGROUND_HEIGHT = 941;
   @Shadow
   @Final
   private Minecraft minecraft;
   @Shadow
   @Final
   private ReloadInstance reload;
   @Shadow
   @Final
   private boolean fadeIn;
   @Shadow
   private float currentProgress;
   @Shadow
   private long fadeOutStart;
   @Shadow
   private long fadeInStart;
   @Unique
   private long dimasik$openedAt;
   private static final long f_36679 = -1L;
   private static final long f_36680 = -1L;
   private static final long f_36681 = -1L;
   private static final long f_36682 = -1L;
   private static final float f_36683 = 1000.0F;
   private static final float f_36684 = -1.0F;
   private static final long f_36685 = -1L;
   private static final float f_36686 = 500.0F;
   private static final float f_36687 = -1.0F;
   private static final int f_36688 = -16447991;
   private static final float f_36689 = 1.7768332F;
   private static final float f_36690 = 1672.0F;
   private static final float f_36691 = 941.0F;
   private static final float f_36692 = 1672.0F;
   private static final float f_36693 = 941.0F;
   private static final float f_36694 = 1.035F;
   private static final float f_36695 = 0.007F;
   private static final double f_36696 = 2600.0;
   private static final float f_36697 = 1672.0F;
   private static final float f_36698 = 941.0F;
   private static final float f_36699 = 0.5F;
   private static final float f_36700 = 0.12F;
   private static final double f_36701 = 5200.0;
   private static final float f_36702 = 0.5F;
   private static final float f_36703 = 0.1F;
   private static final double f_36704 = 6100.0;
   private static final int f_36705 = -1811741432;
   private static final float f_36706 = 46.0F;
   private static final float f_36707 = 3.0F;
   private static final int f_36708 = 16777215;

   public LoadingOverlayMixin() {
      this.dimasik$openedAt = f_36679;
   }

   @Inject(method = "registerTextures", at = @At("TAIL"))
   private static void dimasik$initializeLoadingScreen(TextureManager var0, CallbackInfo var1) {
      Class_S89XFKlG2CC1ymou.m_4696(var0);
   }

   @Inject(method = "extractRenderState", at = @At("HEAD"), cancellable = true)
   private void dimasik$renderLoadingScreen(GuiGraphicsExtractor var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (!Class_HKVFPtZz5yGHYty6.m_2883()) {
         int var6 = var1.guiWidth();
         int var7 = var1.guiHeight();
         long var8 = Util.getMillis();
         if (this.dimasik$openedAt == f_36680) {
            this.dimasik$openedAt = var8;
         }

         if (this.fadeIn && this.fadeInStart == f_36681) {
            this.fadeInStart = var8;
         }

         float var10 = this.fadeOutStart > f_36682 ? (float)(var8 - this.fadeOutStart) / f_36683 : f_36684;
         float var11 = this.fadeInStart > f_36685 ? (float)(var8 - this.fadeInStart) / f_36686 : f_36687;
         float var12;
         if (var10 >= 1.0F) {
            this.dimasik$renderUnderlying(var1, 0, 0, var4);
            var12 = 1.0F - dimasik$smooth(Mth.clamp(var10 - 1.0F, 0.0F, 1.0F));
         } else if (this.fadeIn) {
            if (this.minecraft.gui.screen() != null && var11 < 1.0F) {
               this.minecraft.gui.screen().extractRenderStateWithTooltipAndSubtitles(var1, var2, var3, var4);
            } else {
               this.minecraft.gui.hud.extractDeferredSubtitles();
            }

            var12 = dimasik$smooth(Mth.clamp(var11, 0.0F, 1.0F));
         } else {
            var1.fill(0, 0, var6, var7, f_36688);
            var12 = 1.0F;
         }

         var1.nextStratum();
         dimasik$drawBackground(var1, var6, var7, var8, var12);
         this.currentProgress = Mth.clamp(this.reload.getActualProgress(), 0.0F, 1.0F);
         Class_S89XFKlG2CC1ymou.m_4698(this.dimasik$openedAt, var8, var6, var7, var12, this.currentProgress);
         if (var10 >= 2.0F) {
            this.minecraft.gui.setOverlay(null);
         }

         var5.cancel();
      }
   }

   @Unique
   private void dimasik$renderUnderlying(GuiGraphicsExtractor var1, int var2, int var3, float var4) {
      if (this.minecraft.gui.screen() != null) {
         this.minecraft.gui.screen().extractRenderStateWithTooltipAndSubtitles(var1, var2, var3, var4);
      } else {
         this.minecraft.gui.hud.extractDeferredSubtitles();
      }
   }

   @Unique
   private static void dimasik$drawBackground(GuiGraphicsExtractor var0, int var1, int var2, long var3, float var5) {
      float var6 = (float)var1 / Math.max(var2, 1);
      float var7 = f_36689;
      float var8 = f_36690;
      float var9 = f_36691;
      if (var6 > var7) {
         var9 = f_36692 / var6;
      } else {
         var8 = f_36693 * var6;
      }

      float var10 = f_36694 + f_36695 * (float)Math.sin(var3 / f_36696);
      var8 /= var10;
      var9 /= var10;
      float var11 = f_36697 - var8;
      float var12 = f_36698 - var9;
      float var13 = var11 * (f_36699 + f_36700 * (float)Math.sin(var3 / f_36701));
      float var14 = var12 * (f_36702 + f_36703 * (float)Math.cos(var3 / f_36704));
      var0.blit(
         RenderPipelines.GUI_TEXTURED,
         Class_S89XFKlG2CC1ymou.f_13241,
         0,
         0,
         var13,
         var14,
         var1,
         var2,
         Math.max(1, Math.round(var8)),
         Math.max(1, Math.round(var9)),
         1672,
         941,
         dimasik$opacity(-1, var5)
      );
      var0.fill(0, 0, var1, var2, dimasik$opacity(f_36705, var5));
      int var15 = Math.round(f_36706 * var5);
      int var16 = Math.max(8, Math.min(28, Math.min(var1, var2) / 24));

      for (int var17 = 0; var17 < var16; var17++) {
         float var18 = 1.0F - (float)var17 / var16;
         int var19 = dimasik$argb(Math.round(var15 * var18 * var18 / var16), 0, 0, 0);
         var0.fill(var17, var17, var1 - var17, var17 + 1, var19);
         var0.fill(var17, var2 - var17 - 1, var1 - var17, var2 - var17, var19);
         var0.fill(var17, var17, var17 + 1, var2 - var17, var19);
         var0.fill(var1 - var17 - 1, var17, var1 - var17, var2 - var17, var19);
      }
   }

   @Unique
   private static float dimasik$smooth(float var0) {
      float var1 = Mth.clamp(var0, 0.0F, 1.0F);
      return var1 * var1 * (f_36707 - 2.0F * var1);
   }

   @Unique
   private static int dimasik$opacity(int var0, float var1) {
      int var2 = Math.round((var0 >>> 24 & 0xFF) * Mth.clamp(var1, 0.0F, 1.0F));
      return var0 & f_36708 | var2 << 24;
   }

   @Unique
   private static int dimasik$argb(int var0, int var1, int var2, int var3) {
      return Mth.clamp(var0, 0, 255) << 24 | Mth.clamp(var1, 0, 255) << 16 | Mth.clamp(var2, 0, 255) << 8 | Mth.clamp(var3, 0, 255);
   }
}
