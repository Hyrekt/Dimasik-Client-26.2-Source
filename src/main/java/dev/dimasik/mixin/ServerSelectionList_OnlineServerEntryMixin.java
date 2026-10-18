package dev.dimasik.mixin;

import dev.dimasik.client.system.Class_HrGsNnD57pFcZeYW;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.layouts.LayoutElement;
import net.minecraft.client.gui.screens.multiplayer.ServerSelectionList.OnlineServerEntry;
import net.minecraft.client.multiplayer.ServerData;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(OnlineServerEntry.class)
public abstract class ServerSelectionList_OnlineServerEntryMixin {
   @Shadow
   @Final
   private ServerData serverData;

   @Inject(method = "extractContent", at = @At("HEAD"))
   private void dimasik$drawPinnedBackground(GuiGraphicsExtractor var1, int var2, int var3, boolean var4, float var5, CallbackInfo var6) {
      Class_HrGsNnD57pFcZeYW.FFaLNU4IbnkHPl5I var7 = Class_HrGsNnD57pFcZeYW.m_2939(this.serverData);
      if (var7 != null) {
         LayoutElement var8 = (LayoutElement)this;
         int var9 = var8.getX();
         int var10 = var8.getY();
         int var11 = var9 + var8.getWidth();
         int var12 = var10 + var8.getHeight();
         var1.fill(var9, var10, var11, var12, var7.fill(var4));
      }
   }
}
