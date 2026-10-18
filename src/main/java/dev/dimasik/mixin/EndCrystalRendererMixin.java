package dev.dimasik.mixin;

import net.minecraft.client.model.object.crystal.EndCrystalModel;
import net.minecraft.client.renderer.entity.EndCrystalRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(EndCrystalRenderer.class)
public interface EndCrystalRendererMixin {
   @Accessor("model")
   EndCrystalModel dimasik$getModel();
}
