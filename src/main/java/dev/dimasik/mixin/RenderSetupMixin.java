package dev.dimasik.mixin;

import java.util.Map;
import net.minecraft.client.renderer.rendertype.RenderSetup;
import net.minecraft.client.renderer.rendertype.RenderSetup.TextureBinding;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(RenderSetup.class)
public interface RenderSetupMixin {
   @Accessor("textures")
   Map<String, TextureBinding> getTextures();
}
