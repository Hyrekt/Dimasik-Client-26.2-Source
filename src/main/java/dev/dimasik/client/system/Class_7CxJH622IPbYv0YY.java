package dev.dimasik.client.system;

import com.mojang.blaze3d.textures.GpuTextureView;
import lombok.Generated;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.item.ItemStackRenderState;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.sprite.Material.Baked;
import net.minecraft.resources.Identifier;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;

public final class Class_7CxJH622IPbYv0YY {
   private static final ItemStackRenderState f_3121 = new ItemStackRenderState();
   private static final RandomSource f_3122 = RandomSource.create();
   private static final String f_3123 = "This is a utility class and cannot be instantiated";

   public static Identifier m_1607(LivingEntity var0) {
      if (var0 instanceof AbstractClientPlayer var6) {
         return var6.getSkin().body().texturePath();
      } else {
         Minecraft var1 = Minecraft.getInstance();
         EntityRenderer var2 = var1.getEntityRenderDispatcher().getRenderer(var0);
         if (var2 instanceof LivingEntityRenderer var3) {
            float var4 = var1.getDeltaTracker().getGameTimeDeltaPartialTick(true);
            LivingEntityRenderState var5 = (LivingEntityRenderState)var2.createRenderState(var0, var4);
            return var3.getTextureLocation(var5);
         } else {
            return null;
         }
      }
   }

   @Generated
   private Class_7CxJH622IPbYv0YY() {
      throw new UnsupportedOperationException(f_3123);
   }

   public static GpuTextureView m_1608(LivingEntity var0) {
      Identifier var1 = m_1607(var0);
      return var1 == null ? null : Minecraft.getInstance().getTextureManager().getTexture(var1).getTextureView();
   }

   public static Identifier m_1609(ItemStack var0) {
      Minecraft var1 = Minecraft.getInstance();
      var1.getItemModelResolver().updateForTopItem(f_3121, var0, ItemDisplayContext.GUI, var1.level, null, 0);
      Baked var2 = f_3121.pickParticleMaterial(f_3122);
      TextureAtlasSprite var3 = var2 == null ? null : var2.sprite();
      if (var3 == null) {
         return null;
      }

      Identifier var4 = var3.contents().name();
      return Identifier.fromNamespaceAndPath(var4.getNamespace(), var4.getPath() + "");
   }
}
