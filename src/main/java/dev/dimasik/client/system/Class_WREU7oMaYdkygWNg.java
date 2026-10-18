package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack.Pose;
import dev.dimasik.mixin.ModelPartMixin;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelPart.Cube;
import net.minecraft.client.model.geom.ModelPart.Polygon;
import net.minecraft.client.model.geom.ModelPart.Vertex;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public final class Class_WREU7oMaYdkygWNg {
   private static final Map<Cube, Class_WREU7oMaYdkygWNg.Yb9rt2hgDXjjwdPv> f_15560 = Collections.synchronizedMap(new WeakHashMap<>());
   private static final Map<ModelPart, Class_WREU7oMaYdkygWNg.Yb9rt2hgDXjjwdPv> f_15561 = Collections.synchronizedMap(new WeakHashMap<>());
   private static final Map<ModelPart, Object> f_15562 = Collections.synchronizedMap(new WeakHashMap<>());
   private static final ThreadLocal<Object> f_15563 = new ThreadLocal<>();
   private static final float f_15564 = 1.0E-4F;
   private static final float f_15565 = 1.0E-4F;
   private static final float f_15566 = 0.375F;
   private static final float f_15567 = -0.375F;
   private static final float f_15568 = 16.0F;
   private static final float f_15569 = 16.0F;
   private static final float f_15570 = 16.0F;
   private static final double f_15571 = 0.001F;
   private static final float f_15572 = -1.0F;
   private static final float f_15573 = 0.5F;
   private static final float f_15574 = 1.0E-4F;
   private static final float f_15575 = 0.5F;
   private static final float f_15576 = -1.0F;
   private static final float f_15577 = 1.0E-6F;
   private static final float f_15578 = 0.5F;
   private static final float f_15579 = 0.5F;
   private static final float f_15580 = 0.5F;

   private static Vector3f m_5444(Vector3f var0, Class_WREU7oMaYdkygWNg.pyTTdbsIFaDrnTvj var1, Class_WREU7oMaYdkygWNg.Yb9rt2hgDXjjwdPv var2) {
      float var3 = var2.down ? f_15572 : 1.0F;
      float var4 = (float)Math.cos(var2.direction);
      float var5 = (float)Math.sin(var2.direction) * var3;
      float var6 = var3 * var5;
      float var7 = -var3 * var4;
      float var8 = var6 * (var0.x - var1.centerX) + var7 * (var0.z - var1.centerZ);
      if (!var2.down) {
         var8 = -var8;
      }

      float var9 = var2.down ? var1.minY - var0.y : var0.y - var1.maxY;
      float var10 = var2.down ? var1.maxY - var0.y : var0.y - var1.minY;
      float var11 = (float)Math.tan(var2.angle * f_15573) * var8;
      Vector3f var12 = new Vector3f(var0);
      float var13 = Math.max(f_15574, var1.height * f_15575) * (var2.down ? f_15576 : 1.0F);
      if (Math.abs(var9) < Math.abs(var10)) {
         var12.y += var3 * (-var9 / var13 * var11);
         var12.sub(var1.centerX, var1.centerY, var1.centerZ).rotateAxis(var2.angle, var4, 0.0F, var5).add(var1.centerX, var1.centerY, var1.centerZ);
      } else {
         var12.y += var3 * (-var10 / var13 * var11);
      }

      return var12;
   }

   private static Class_WREU7oMaYdkygWNg.pyTTdbsIFaDrnTvj m_5445(Cube var0) {
      float var1 = Float.POSITIVE_INFINITY;
      float var2 = Float.NEGATIVE_INFINITY;

      for (Polygon var6 : var0.polygons) {
         for (Vertex var10 : var6.vertices()) {
            var1 = Math.min(var1, var10.y());
            var2 = Math.max(var2, var10.y());
         }
      }

      return new Class_WREU7oMaYdkygWNg.pyTTdbsIFaDrnTvj(
         (var0.minX + var0.maxX) * f_15578, (var0.minY + var0.maxY) * f_15579, (var0.minZ + var0.maxZ) * f_15580, var1, var2, var2 - var1
      );
   }

   public static void m_5446(ModelPart var0, Object var1, boolean var2, float var3, float var4) {
      for (Cube var6 : ((ModelPartMixin)(Object)var0).dimasik$getCuboids()) {
         if (Math.abs(var4) < f_15564) {
            f_15560.remove(var6);
         } else {
            f_15560.put(var6, new Class_WREU7oMaYdkygWNg.Yb9rt2hgDXjjwdPv(var1, var2, var3, var4));
         }
      }
   }

   public static void m_5447(ModelPart var0) {
      f_15561.remove(var0);
   }

   private static Vector3f m_5448(Class_WREU7oMaYdkygWNg.wEYeKjcfoVXe4DxS[] var0, Polygon var1) {
      Vector3f var2 = new Vector3f(var0[0].position).sub(var0[2].position);
      Vector3f var3 = new Vector3f(var0[1].position).sub(var0[3].position);
      Vector3f var4 = var2.cross(var3);
      if (var4.lengthSquared() < f_15577) {
         var4.set(var1.normal());
      } else {
         var4.normalize();
      }

      if (var4.dot(var1.normal()) < 0.0F) {
         var4.negate();
      }

      return var4;
   }

   private static int m_5449(Vertex var0, Vertex var1) {
      float var2 = var1.x() - var0.x();
      float var3 = var1.y() - var0.y();
      float var4 = var1.z() - var0.z();
      return Math.max(1, (int)Math.floor(Math.sqrt(var2 * var2 + var3 * var3 + var4 * var4) + f_15571));
   }

   public static void m_5450(ModelPart var0, Object var1, float var2, float var3) {
      if (Math.abs(var3) < f_15565) {
         f_15561.remove(var0);
      } else {
         f_15561.put(var0, new Class_WREU7oMaYdkygWNg.Yb9rt2hgDXjjwdPv(var1, false, var2, var3));
      }
   }

   public static Object m_5451(ModelPart var0) {
      return f_15562.computeIfAbsent(var0, var0x -> new Object());
   }

   private Class_WREU7oMaYdkygWNg() {
   }

   private static void m_5452(
      Polygon var0,
      Class_WREU7oMaYdkygWNg.pyTTdbsIFaDrnTvj var1,
      Class_WREU7oMaYdkygWNg.Yb9rt2hgDXjjwdPv var2,
      Pose var3,
      VertexConsumer var4,
      int var5,
      int var6,
      int var7
   ) {
      Vertex[] var8 = var0.vertices();
      int var9 = m_5449(var8[0], var8[1]);
      int var10 = m_5449(var8[1], var8[2]);

      for (int var11 = 0; var11 < var10; var11++) {
         float var12 = (float)var11 / var10;
         float var13 = (float)(var11 + 1) / var10;

         for (int var14 = 0; var14 < var9; var14++) {
            float var15 = (float)var14 / var9;
            float var16 = (float)(var14 + 1) / var9;
            Class_WREU7oMaYdkygWNg.wEYeKjcfoVXe4DxS[] var17 = new Class_WREU7oMaYdkygWNg.wEYeKjcfoVXe4DxS[]{
               m_5457(var8, var15, var12, var1, var2),
               m_5457(var8, var16, var12, var1, var2),
               m_5457(var8, var16, var13, var1, var2),
               m_5457(var8, var15, var13, var1, var2)
            };
            Vector3f var18 = m_5448(var17, var0);
            var3.transformNormal(var18, var18).normalize();

            for (Class_WREU7oMaYdkygWNg.wEYeKjcfoVXe4DxS var22 : var17) {
               Vector3f var23 = var3.pose()
                  .transformPosition(var22.position.x / f_15568, var22.position.y / f_15569, var22.position.z / f_15570, new Vector3f());
               var4.addVertex(var23.x, var23.y, var23.z, var7, var22.u, var22.v, var6, var5, var18.x, var18.y, var18.z);
            }
         }
      }
   }

   public static void m_5453(Object var0) {
      if (var0 == null) {
         f_15563.remove();
      } else {
         f_15563.set(var0);
      }
   }

   public static void m_5454(ModelPart var0) {
      for (Cube var2 : ((ModelPartMixin)(Object)var0).dimasik$getCuboids()) {
         f_15560.remove(var2);
      }
   }

   public static boolean m_5455(Cube var0, Pose var1, VertexConsumer var2, int var3, int var4, int var5) {
      Object var6 = f_15563.get();
      if (var6 == null) {
         return false;
      }

      Class_WREU7oMaYdkygWNg.Yb9rt2hgDXjjwdPv var7 = f_15560.get(var0);
      if (var7 != null && var7.owner == var6) {
         Class_WREU7oMaYdkygWNg.pyTTdbsIFaDrnTvj var8 = m_5445(var0);

         for (Polygon var12 : var0.polygons) {
            m_5452(var12, var8, var7, var1, var2, var3, var4, var5);
         }

         return true;
      } else {
         return false;
      }
   }

   public static Object m_5456(ModelPart var0) {
      Object var1 = f_15563.get();
      m_5453(f_15562.get(var0));
      return var1;
   }

   private static Class_WREU7oMaYdkygWNg.wEYeKjcfoVXe4DxS m_5457(
      Vertex[] var0, float var1, float var2, Class_WREU7oMaYdkygWNg.pyTTdbsIFaDrnTvj var3, Class_WREU7oMaYdkygWNg.Yb9rt2hgDXjjwdPv var4
   ) {
      float var5 = (1.0F - var1) * (1.0F - var2);
      float var6 = var1 * (1.0F - var2);
      float var7 = var1 * var2;
      float var8 = (1.0F - var1) * var2;
      Vector3f var9 = new Vector3f(
         var0[0].x() * var5 + var0[1].x() * var6 + var0[2].x() * var7 + var0[3].x() * var8,
         var0[0].y() * var5 + var0[1].y() * var6 + var0[2].y() * var7 + var0[3].y() * var8,
         var0[0].z() * var5 + var0[1].z() * var6 + var0[2].z() * var7 + var0[3].z() * var8
      );
      float var10 = var0[0].u() * var5 + var0[1].u() * var6 + var0[2].u() * var7 + var0[3].u() * var8;
      float var11 = var0[0].v() * var5 + var0[1].v() * var6 + var0[2].v() * var7 + var0[3].v() * var8;
      return new Class_WREU7oMaYdkygWNg.wEYeKjcfoVXe4DxS(m_5444(var9, var3, var4), var10, var11);
   }

   public static void m_5459(ModelPart var0, PoseStack var1) {
      Object var2 = f_15563.get();
      if (var2 != null) {
         Class_WREU7oMaYdkygWNg.Yb9rt2hgDXjjwdPv var3 = f_15561.get(var0);
         if (var3 != null && var3.owner == var2) {
            float var4 = -var3.direction;
            var1.translate(0.0F, f_15566, 0.0F);
            var1.mulPose(new Quaternionf().rotateAxis(var3.angle, (float)Math.cos(var4), 0.0F, (float)Math.sin(var4)));
            var1.translate(0.0F, f_15567, 0.0F);
         }
      }
   }

   private record Yb9rt2hgDXjjwdPv(Object owner, boolean down, float direction, float angle) {
   }

   private record pyTTdbsIFaDrnTvj(float centerX, float centerY, float centerZ, float minY, float maxY, float height) {
   }

   private record wEYeKjcfoVXe4DxS(Vector3f position, float u, float v) {
      public float m_5442() {
         return this.u;
      }

      public float m_5443() {
         return this.v;
      }
   }
}
