package dev.dimasik.client.system;

import java.util.List;
import net.minecraft.client.gui.navigation.ScreenRectangle;
import net.minecraft.client.renderer.state.gui.pip.PictureInPictureRenderState;
import org.jspecify.annotations.Nullable;

public record Class_zcop3nhFFuuxjT2z(
   List<Class_zcop3nhFFuuxjT2z.Foth96PKoIxKs5bh> hats,
   int x0,
   int y0,
   int x1,
   int y1,
   float scale,
   @Nullable ScreenRectangle scissorArea,
   @Nullable ScreenRectangle bounds
) implements PictureInPictureRenderState {
   public int m_9936() {
      return this.y0;
   }

   public Class_zcop3nhFFuuxjT2z(
      List<Class_zcop3nhFFuuxjT2z.Foth96PKoIxKs5bh> var1, int var2, int var3, int var4, int var5, float var6, @Nullable ScreenRectangle var7
   ) {
      this(var1, var2, var3, var4, var5, var6, var7, PictureInPictureRenderState.getBounds(var2, var3, var4, var5, var7));
   }

   public int m_9937() {
      return this.y1;
   }

   public int m_9938() {
      return this.x0;
   }

   public int m_9939() {
      return this.x1;
   }

   public record Foth96PKoIxKs5bh(Class_LzYTXb7R2jug6Pep hat, float alpha, float x, float y, float width, float height) {
   }
}
