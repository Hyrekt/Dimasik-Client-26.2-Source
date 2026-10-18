package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.block.BlockModelRenderState;
import net.minecraft.client.renderer.block.model.BlockDisplayContext;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.LightCoordsUtil;
import net.minecraft.world.level.block.state.BlockState;

public final class Class_TEZjqunjD9Oo9nmP implements Class_y1qIiVsEYrGcWXzL {
   public static final Class_TEZjqunjD9Oo9nmP f_13952 = new Class_TEZjqunjD9Oo9nmP();
   private static final BlockDisplayContext f_13953 = BlockDisplayContext.create();
   private final BlockModelRenderState f_13954 = new BlockModelRenderState();
   private static final long f_13955 = 42L;
   private static final long f_13956 = 42L;
   private static final int f_13957 = 15728880;

   @Override
   public void m_4944(BlockState var1, PoseStack var2, SubmitNodeCollector var3, int var4, ClientLevel var5, AbstractClientPlayer var6) {
      this.f_13954.clear();
      Minecraft.getInstance().getModelManager().getBlockModelSet().get(var1).update(this.f_13954, var1, f_13953, f_13956);
      this.f_13954.blockLightCoords = var1.emissiveRendering() ? f_13957 : LightCoordsUtil.pack(var1.getLightEmission(), 0);
      this.f_13954.submit(var2, var3, var4, OverlayTexture.NO_OVERLAY, 0);
   }

   public void m_4945(SubmitNodeCollector var1, PoseStack var2, BlockState var3, int var4, int var5, int var6) {
      this.f_13954.clear();
      Minecraft.getInstance().getModelManager().getBlockModelSet().get(var3).update(this.f_13954, var3, f_13953, f_13955);
      this.f_13954.submit(var2, var1, var4, var5, var6);
   }
}
