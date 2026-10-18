package dev.dimasik.client.system;

import lombok.Generated;
import net.minecraft.client.Minecraft;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector4f;

public final class Class_FvJXUGWpZo3zYBW4 implements Class_NzJrN63M7QBpmAbi {
   private static final Matrix4f f_7588 = new Matrix4f();
   private static final Matrix4f f_7589 = new Matrix4f();
   private static boolean f_7590;
   private static final float f_7591 = 0.5F;
   private static final float f_7592 = 0.5F;
   private static final float f_7593 = -1.0F;
   private static final float f_7594 = -1.0F;
   private static final float f_7595 = -0.15F;
   private static final float f_7596 = -0.15F;
   private static final String f_7597 = "This is a utility class and cannot be instantiated";

   public static Vector2f m_2689(Vec3 var0, boolean var1) {
      try {
         if (f_7590 && f_11537.gameRenderer != null) {
            Vec3 var2 = var0.subtract(f_11537.gameRenderer.mainCamera().position());
            Vector4f var3 = new Vector4f((float)var2.x, (float)var2.y, (float)var2.z, 1.0F);
            var3.mul(f_7588);
            var3.mul(f_7589);
            if (var3.w <= 0.0F) {
               if (var1) {
                  return null;
               }

               Vector4f var4 = new Vector4f((float)var2.x, (float)var2.y, (float)var2.z, 1.0F);
               var4.mul(f_7588);
               if (var4.z > f_7595) {
                  var4.z = f_7596;
               }

               var4.w = 1.0F;
               var4.mul(f_7589);
               if (var4.w <= 0.0F) {
                  return null;
               }

               var3 = var4;
            }

            float var9 = var3.x / var3.w;
            float var5 = var3.y / var3.w;
            if (!var1 || !(Math.abs(var9) > 1.0F) && !(Math.abs(var5) > 1.0F)) {
               int var6 = f_11537.getWindow().getScreenWidth();
               int var7 = f_11537.getWindow().getScreenHeight();
               return new Vector2f((var9 + 1.0F) / 2.0F * var6, (1.0F - var5) / 2.0F * var7);
            } else {
               return null;
            }
         } else {
            return null;
         }
      } catch (Exception var8) {
         return null;
      }
   }

   @Generated
   private Class_FvJXUGWpZo3zYBW4() {
      throw new UnsupportedOperationException(f_7597);
   }

   public static Vector2f m_2690(Vec3 var0) {
      return m_2689(var0, true);
   }

   public static Matrix4f m_2691() {
      return f_7590 ? new Matrix4f(f_7588) : null;
   }

   public static void m_2692(float var0, float var1, float var2, float var3, float var4) {
      float var5 = 2.0F / Minecraft.getInstance().getWindow().getScreenWidth() * var2;
      float var6 = 2.0F / Minecraft.getInstance().getWindow().getScreenHeight() * var3;
      float var7 = f_7593 + var0 * 2.0F / Minecraft.getInstance().getWindow().getScreenWidth();
      float var8 = 1.0F - var1 * 2.0F / Minecraft.getInstance().getWindow().getScreenHeight() - var6;
      float var9 = var7 + var5 / 2.0F;
      float var10 = var8 + var6 / 2.0F;
      Class_Ssh31B3ljfKeWsvS.m_4853().translate(var9, var10, 0.0F);
      Class_Ssh31B3ljfKeWsvS.m_4853().scale(var4, var4, 1.0F);
      Class_Ssh31B3ljfKeWsvS.m_4853().translate(-var9, -var10, 0.0F);
   }

   public static Vector2f m_2693(double var0, double var2) {
      return new Vector2f((float)(var0 * f_11537.getWindow().getGuiScale()), (float)(var2 * f_11537.getWindow().getGuiScale()));
   }

   public static void m_2694(float var0, float var1, float var2, float var3, float var4) {
      float var5 = 2.0F / Minecraft.getInstance().getWindow().getScreenWidth() * var2;
      float var6 = 2.0F / Minecraft.getInstance().getWindow().getScreenHeight() * var3;
      float var7 = f_7594 + var0 * 2.0F / Minecraft.getInstance().getWindow().getScreenWidth();
      float var8 = 1.0F - var1 * 2.0F / Minecraft.getInstance().getWindow().getScreenHeight() - var6;
      float var9 = var7 + var5 / 2.0F;
      float var10 = var8 + var6 / 2.0F;
      Class_Ssh31B3ljfKeWsvS.m_4853().translate(var9, var10, 0.0F);
      Class_Ssh31B3ljfKeWsvS.m_4853().scale(1.0F / var4, 1.0F / var4, 1.0F);
      Class_Ssh31B3ljfKeWsvS.m_4853().translate(-var9, -var10, 0.0F);
   }

   public static void m_2695(Matrix4f var0, Matrix4f var1) {
      if (var0 != null && var1 != null) {
         f_7588.set(var0);
         f_7589.set(var1);
         f_7590 = true;
      } else {
         f_7590 = false;
      }
   }

   public static Vector2f m_2696(Vec3 var0, boolean var1) {
      Vector2f var2 = m_2689(var0, var1);
      if (var2 == null) {
         return null;
      }

      int var3 = Math.max(f_11537.getWindow().getScreenWidth(), 1);
      int var4 = Math.max(f_11537.getWindow().getScreenHeight(), 1);
      return new Vector2f(var2.x / var3, 1.0F - var2.y / var4);
   }

   public static boolean m_2697(double var0, double var2, double var4, double var6, double var8, double var10) {
      return var0 >= var4 && var0 <= var4 + var8 && var2 >= var6 && var2 <= var6 + var10;
   }

   public static Matrix4f m_2698() {
      return f_7590 ? new Matrix4f(f_7589) : null;
   }

   public static Vector2f m_2699(float var0, float var1) {
      float var2 = f_11537.getWindow().getScreenWidth();
      float var3 = f_11537.getWindow().getScreenHeight();
      Vector4f var4 = new Vector4f(var0 * 2.0F / var2 - 1.0F, 1.0F - var1 * 2.0F / var3, 0.0F, 1.0F);
      Class_Ssh31B3ljfKeWsvS.m_4853().transform(var4);
      return new Vector2f((var4.x + 1.0F) * var2 * f_7591, (1.0F - var4.y) * var3 * f_7592);
   }
}
