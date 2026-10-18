package dev.dimasik.client.system;

import java.util.List;
import net.minecraft.client.gui.navigation.ScreenRectangle;
import net.minecraft.client.renderer.state.gui.pip.PictureInPictureRenderState;
import org.jspecify.annotations.Nullable;

public record Class_s5Et3FmuBUH4bvsQ(
   List<Class_s5Et3FmuBUH4bvsQ.zuGVqZ9Rt8YOeccM> wings,
   int x0,
   int y0,
   int x1,
   int y1,
   float scale,
   @Nullable ScreenRectangle scissorArea,
   @Nullable ScreenRectangle bounds
) implements PictureInPictureRenderState {
   public int m_8623() {
      return this.x1;
   }

   public int m_8624() {
      return this.x0;
   }

   public Class_s5Et3FmuBUH4bvsQ(
      List<Class_s5Et3FmuBUH4bvsQ.zuGVqZ9Rt8YOeccM> var1, int var2, int var3, int var4, int var5, float var6, @Nullable ScreenRectangle var7
   ) {
      this(var1, var2, var3, var4, var5, var6, var7, PictureInPictureRenderState.getBounds(var2, var3, var4, var5, var7));
   }

   public int m_8625() {
      return this.y0;
   }

   public int m_8626() {
      return this.y1;
   }

   public record zuGVqZ9Rt8YOeccM(
      Class_s5qEamGcEs25C3d8 type, Class_WzqIkwE6nF1UkDXB animator, float delta, float alpha, float x, float y, float width, float height
   ) {
   }
}
