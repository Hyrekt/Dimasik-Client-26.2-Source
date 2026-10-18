package dev.dimasik.client.module.render;

import net.minecraft.world.InteractionHand;

public record ViewModel$NhWhpWveQCbOyUER(InteractionHand hand, float x, float y, float width, float height) {
   public float distanceSquared(float var1, float var2) {
      float var3 = this.x + this.width * 0.5F;
      float var4 = this.y + this.height * 0.5F;
      float var5 = var1 - var3;
      float var6 = var2 - var4;
      return var5 * var5 + var6 * var6;
   }
}
