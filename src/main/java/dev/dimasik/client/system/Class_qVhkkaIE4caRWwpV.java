package dev.dimasik.client.system;

public final class Class_qVhkkaIE4caRWwpV {
   private static final float f_29923 = 0.001F;
   private static final float f_29924 = 0.5F;

   private Class_qVhkkaIE4caRWwpV() {
   }

   public static float m_8334(float var0, float var1, float var2, boolean var3) {
      float var4 = var2 / Math.max(var0, f_29923) - var1;
      return Math.clamp(var3 ? var4 : (var4 + 1.0F) * f_29924, 0.0F, 1.0F);
   }
}
