package dev.dimasik.client.system;

import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector2f;

public class Class_I4ZLf1tdGfKiuaY4 extends Class_kkp256olqZ4F1qt3 {
   private final Vector2f f_8254 = new Vector2f();
   private static final float f_8255 = -90.0F;
   private static final float f_8256 = 90.0F;
   private static final float f_8257 = 75.0F;
   private static final float f_8258 = 45.0F;
   private static final float f_8259 = -90.0F;
   private static final float f_8260 = 90.0F;

   @Override
   public Vector2f m_1006(Vector2f var1, Vector2f var2) {
      float var3 = Mth.wrapDegrees(var2.x - var1.x);
      float var4 = var2.y - var1.y;
      float var5 = f_8257;
      float var6 = f_8258;
      float var7 = var1.x + Mth.clamp(var3, -var5, var5);
      float var8 = var1.y + Mth.clamp(var4, -var6, var6);
      var8 = Mth.clamp(var8, f_8259, f_8260);
      return new Vector2f(Class_uHPXr81r5AZlFeJr.m_9128(var7), Class_uHPXr81r5AZlFeJr.m_9128(var8));
   }

   @Override
   public Vector2f m_1007() {
      return new Vector2f(this.f_8254);
   }

   public Class_I4ZLf1tdGfKiuaY4() {
      super(Vec3.ZERO);
   }

   public void m_2950(float var1, float var2) {
      this.f_8254.set(Mth.wrapDegrees(var1), Mth.clamp(var2, f_8255, f_8256));
      this.f_25114 = false;
   }
}
