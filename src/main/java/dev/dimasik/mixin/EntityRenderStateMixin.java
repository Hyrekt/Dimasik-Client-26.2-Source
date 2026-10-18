package dev.dimasik.mixin;

import dev.dimasik.client.system.Class_smYfxG0Sb94s63Ts;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(EntityRenderState.class)
public abstract class EntityRenderStateMixin implements Class_smYfxG0Sb94s63Ts {
   @Unique
   private int dimasik$entityId;
   private static final int f_36636 = Integer.MIN_VALUE;

   public EntityRenderStateMixin() {
      this.dimasik$entityId = f_36636;
   }

   @Override
   public int dimasik$getEntityId() {
      return this.dimasik$entityId;
   }

   @Override
   public void dimasik$setEntityId(int var1) {
      this.dimasik$entityId = var1;
   }
}
