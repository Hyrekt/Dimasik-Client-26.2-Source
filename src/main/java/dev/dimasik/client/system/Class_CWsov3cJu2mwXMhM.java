package dev.dimasik.client.system;

import java.util.List;
import net.minecraft.client.gui.navigation.ScreenRectangle;
import net.minecraft.client.renderer.state.gui.pip.PictureInPictureRenderState;
import org.jspecify.annotations.Nullable;

public record Class_CWsov3cJu2mwXMhM(
   List<Class_CWsov3cJu2mwXMhM.FmHMh8tB8MnHgILT> previews,
   int x0,
   int y0,
   int x1,
   int y1,
   @Nullable ScreenRectangle scissorArea,
   @Nullable ScreenRectangle bounds
) implements PictureInPictureRenderState {
   public int m_2420() {
      return this.x1;
   }

   public int m_2421() {
      return this.x0;
   }

   public Class_CWsov3cJu2mwXMhM(List<Class_CWsov3cJu2mwXMhM.FmHMh8tB8MnHgILT> var1, int var2, int var3, int var4, int var5, @Nullable ScreenRectangle var6) {
      this(var1, var2, var3, var4, var5, var6, PictureInPictureRenderState.getBounds(var2, var3, var4, var5, var6));
   }

   public int m_2422() {
      return this.y1;
   }

   public float scale() {
      return 1.0F;
   }

   public int m_2423() {
      return this.y0;
   }

   public record FmHMh8tB8MnHgILT(Class_LdeJaBYCxAYq5SO6 variant, float alpha, float x, float y, float width, float height) {
   }
}
