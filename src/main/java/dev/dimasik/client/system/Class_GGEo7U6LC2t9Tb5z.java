package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.player.PlayerModel;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.HumanoidArm;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public final class Class_GGEo7U6LC2t9Tb5z {
   private static final Map<AvatarRenderState, UUID> f_7692 = new WeakHashMap<>();
   private static final Map<String, Integer> f_7693 = new HashMap<>();
   private static final Map<UUID, Class_GGEo7U6LC2t9Tb5z.xwEztf4lk4uL6X0r> f_7694 = new HashMap<>();
   private static Class_GGEo7U6LC2t9Tb5z.xwEztf4lk4uL6X0r f_7695;
   private static final float f_7696 = 1.0E-4F;
   private static final float f_7697 = 1.0E9F;
   private static final long f_7698 = 180L;
   private static final String f_7699 = "head";
   private static final String f_7700 = "torso";
   private static final String f_7701 = "right_arm";
   private static final float f_7702 = -5.0F;
   private static final String f_7703 = "left_arm";
   private static final float f_7704 = 5.0F;
   private static final String f_7705 = "right_leg";
   private static final float f_7706 = -1.9F;
   private static final float f_7707 = 12.0F;
   private static final float f_7708 = 0.1F;
   private static final String f_7709 = "left_leg";
   private static final float f_7710 = 1.9F;
   private static final float f_7711 = 12.0F;
   private static final float f_7712 = 0.1F;
   private static final String f_7713 = "body";
   private static final float f_7714 = 16.0F;
   private static final float f_7715 = 16.0F;
   private static final float f_7716 = 16.0F;
   private static final float f_7717 = 0.7F;
   private static final float f_7718 = -0.7F;
   private static final String f_7719 = "left_arm";
   private static final String f_7720 = "right_arm";
   private static final float f_7721 = 1.0E-4F;
   private static final float f_7722 = 0.25F;
   private static final float f_7723 = -0.25F;
   private static final String f_7724 = "left_leg";
   private static final String f_7725 = "right_leg";
   private static final float f_7726 = 0.375F;
   private static final String f_7727 = "body";
   private static final String f_7728 = "torso";
   private static final float f_7729 = 0.375F;
   private static final float f_7730 = 1.0E-4F;
   private static final float f_7731 = (float) (Math.PI / 180.0);
   private static final String f_7732 = "body";
   private static final String f_7733 = "torso";
   private static final String f_7734 = "right_arm";
   private static final String f_7735 = "left_arm";
   private static final String f_7736 = "right_leg";
   private static final String f_7737 = "left_leg";

   private static void m_2747(AvatarRenderState var0, String var1, float var2, PoseStack var3) {
      long var4 = System.nanoTime();
      Class_GGEo7U6LC2t9Tb5z.xwEztf4lk4uL6X0r var6 = m_2756(var0, var4);
      if (var6 != null) {
         Class_DYfbN7i8OfYweq8U.jYlylkCtfEuU3kLU var7 = var6.f_7688.m_2459(var1, var6.m_2745(var4));
         m_2755(var7.bendDirection(), var7.bend() * var6.m_2744(var4), var2, var3);
      }
   }

   public static void m_2748(AvatarRenderState var0, boolean var1, PoseStack var2) {
      m_2747(var0, var1 ? f_7724 : f_7725, f_7726, var2);
   }

   private static void m_2749(HumanoidModel<?> var0) {
      Class_WREU7oMaYdkygWNg.m_5454(var0.body);
      Class_WREU7oMaYdkygWNg.m_5454(var0.rightArm);
      Class_WREU7oMaYdkygWNg.m_5454(var0.leftArm);
      Class_WREU7oMaYdkygWNg.m_5454(var0.rightLeg);
      Class_WREU7oMaYdkygWNg.m_5454(var0.leftLeg);
      Class_WREU7oMaYdkygWNg.m_5447(var0.head);
      Class_WREU7oMaYdkygWNg.m_5447(var0.rightArm);
      Class_WREU7oMaYdkygWNg.m_5447(var0.leftArm);
      if (var0 instanceof PlayerModel var1) {
         Class_WREU7oMaYdkygWNg.m_5454(var1.jacket);
         Class_WREU7oMaYdkygWNg.m_5454(var1.rightSleeve);
         Class_WREU7oMaYdkygWNg.m_5454(var1.leftSleeve);
         Class_WREU7oMaYdkygWNg.m_5454(var1.rightPants);
         Class_WREU7oMaYdkygWNg.m_5454(var1.leftPants);
      }
   }

   public static void m_2750(AvatarRenderState var0, PoseStack var1) {
      long var2 = System.nanoTime();
      Class_GGEo7U6LC2t9Tb5z.xwEztf4lk4uL6X0r var4 = m_2756(var0, var2);
      if (var4 != null) {
         Class_DYfbN7i8OfYweq8U var5 = var4.f_7688;
         float var6 = var4.m_2745(var2);
         float var7 = var4.m_2744(var2);
         Class_DYfbN7i8OfYweq8U.jYlylkCtfEuU3kLU var8 = var5.m_2459(f_7727, var6);
         Class_DYfbN7i8OfYweq8U.jYlylkCtfEuU3kLU var9 = var5.m_2459(f_7728, var6);
         m_2755(var8.bendDirection() + var9.bendDirection(), (var8.bend() + var9.bend()) * var7, f_7729, var1);
      }
   }

   private static void m_2751(ModelPart var0, Class_DYfbN7i8OfYweq8U.jYlylkCtfEuU3kLU var1, float var2, float var3, float var4, float var5) {
      Vector3f var6 = var1.rotation();
      Vector3f var7 = var1.position();
      float var8 = f_7731;
      if (var1.hasRotation()) {
         var0.xRot = Mth.lerp(var2, var0.xRot, var6.x * var8);
         var0.yRot = Mth.lerp(var2, var0.yRot, var6.y * var8);
         var0.zRot = Mth.lerp(var2, var0.zRot, var6.z * var8);
      }

      if (var1.hasPosition()) {
         var0.x = Mth.lerp(var2, var0.x, var3 + var7.x);
         var0.y = Mth.lerp(var2, var0.y, var4 - var7.y);
         var0.z = Mth.lerp(var2, var0.z, var5 + var7.z);
      }
   }

   public static void m_2752() {
      if (f_7695 != null && f_7695.f_7689.f_25503 == 0L) {
         f_7695.f_7689.m_7606(System.nanoTime());
         Class_IJNgfuPB2JDUg8Ln.m_2973().m_2959();
      }
   }

   public static void m_2753(boolean var0) {
      long var1 = System.nanoTime();
      f_7694.entrySet().removeIf(var2 -> !Class_IJNgfuPB2JDUg8Ln.m_2973().m_2962(var2.getKey(), var1) || var2.getValue().f_7689.m_7608(var1));
      if (f_7695 != null) {
         Minecraft var3 = Minecraft.getInstance();
         if (var3.player != null && var3.level != null) {
            if (!var0
               && (
                  var3.player.input.getMoveVector().lengthSquared() > f_7696
                     || var3.player.input.keyPresses.jump()
                     || var3.player.input.keyPresses.shift()
                     || var3.player.isFallFlying()
                     || var3.player.isSwimming()
               )) {
               m_2752();
            }

            if (f_7695 != null) {
               float var4 = (float)(var1 - f_7695.f_7689.f_25502) / f_7697;
               if (!f_7695.f_7686.loop() && var4 >= f_7695.f_7688.m_2458()) {
                  m_2752();
               }

               if (f_7695 != null && f_7695.f_7689.m_7608(var1)) {
                  m_2758();
               }
            }
         } else {
            m_2758();
         }
      }
   }

   public static Class_GGEo7U6LC2t9Tb5z.xwEztf4lk4uL6X0r m_2754() {
      return f_7695;
   }

   private Class_GGEo7U6LC2t9Tb5z() {
   }

   private static void m_2755(float var0, float var1, float var2, PoseStack var3) {
      if (!(Math.abs(var1) < f_7730)) {
         float var4 = -var0;
         var3.translate(0.0F, var2, 0.0F);
         var3.mulPose(new Quaternionf().rotateAxis(var1, (float)Math.cos(var4), 0.0F, (float)Math.sin(var4)));
         var3.translate(0.0F, -var2, 0.0F);
      }
   }

   private static Class_GGEo7U6LC2t9Tb5z.xwEztf4lk4uL6X0r m_2756(AvatarRenderState var0, long var1) {
      UUID var3 = f_7692.get(var0);
      Minecraft var4 = Minecraft.getInstance();
      if (var3 != null && var4.player != null && Class_IJNgfuPB2JDUg8Ln.m_2973().m_2951()) {
         Class_GGEo7U6LC2t9Tb5z.xwEztf4lk4uL6X0r var5 = var3.equals(var4.player.getUUID())
            ? f_7695
            : (Class_IJNgfuPB2JDUg8Ln.m_2973().m_2962(var3, var1) ? f_7694.get(var3) : null);
         if (var5 == null) {
            return null;
         }

         var5.m_2743(var1);
         return var5.f_7689.m_7608(var1) ? null : var5;
      } else {
         return null;
      }
   }

   public static void m_2757(AvatarRenderState var0, PoseStack var1) {
      long var2 = System.nanoTime();
      Class_GGEo7U6LC2t9Tb5z.xwEztf4lk4uL6X0r var4 = m_2756(var0, var2);
      if (var4 != null) {
         Class_DYfbN7i8OfYweq8U var5 = var4.f_7688;
         float var6 = var4.m_2745(var2);
         float var7 = var4.m_2744(var2);
         Class_DYfbN7i8OfYweq8U.jYlylkCtfEuU3kLU var8 = var5.m_2459(f_7713, var6);
         Vector3f var9 = var8.position();
         Vector3f var10 = var8.rotation();
         float var11 = var8.hasPosition() ? -var9.x * var7 / f_7714 : 0.0F;
         float var12 = var8.hasPosition() ? var9.y * var7 / f_7715 : 0.0F;
         float var13 = var8.hasPosition() ? var9.z * var7 / f_7716 : 0.0F;
         float var14 = var8.hasRotation() ? -var10.x * var7 : 0.0F;
         float var15 = var8.hasRotation() ? -var10.y * var7 : 0.0F;
         float var16 = var8.hasRotation() ? var10.z * var7 : 0.0F;
         var1.translate(var11, var12 + f_7717, var13);
         var1.mulPose(Axis.ZP.rotationDegrees(var16));
         var1.mulPose(Axis.YP.rotationDegrees(var15));
         var1.mulPose(Axis.XP.rotationDegrees(var14));
         var1.translate(0.0F, f_7718, 0.0F);
      }
   }

   public static void m_2758() {
      f_7695 = null;
      Class_IJNgfuPB2JDUg8Ln.m_2973().m_2956();
   }

   public static void m_2759(UUID var0, Class_ihAt1VjcwWMm2sNx var1, Class_sIga32lGjUfDbarq var2, long var3, long var5) {
      if (var1.state() != Class_ihAt1VjcwWMm2sNx.k19EOlI5xzmGXgut.CLEAR
         && (var1.state() != Class_ihAt1VjcwWMm2sNx.k19EOlI5xzmGXgut.STOP || var1.stopAgeMillis() + var5 < f_7698)) {
         long var7 = var1.elapsedMillis() + var5;
         Class_GGEo7U6LC2t9Tb5z.xwEztf4lk4uL6X0r var9 = f_7694.get(var0);
         if (var9 == null || !var9.f_7685.equals(var1.m_7297()) || var9.f_7686 != var2 || !var9.f_7687.equals(var1.variant())) {
            var9 = new Class_GGEo7U6LC2t9Tb5z.xwEztf4lk4uL6X0r(var1.m_7297(), var2, var1.variant(), var3, var7);
            f_7694.put(var0, var9);
         }

         var9.f_7689.m_7607(var3, var7, var1.state() == Class_ihAt1VjcwWMm2sNx.k19EOlI5xzmGXgut.STOP, var1.stopAgeMillis() + var5);
         var9.m_2743(var3);
      } else {
         f_7694.remove(var0);
      }
   }

   public static void m_2760(Class_sIga32lGjUfDbarq var0) {
      Class_IJNgfuPB2JDUg8Ln.m_2973().m_2952();
      int var1 = f_7693.getOrDefault(var0.m_8684(), 0);
      String var2 = var0.animations().get(var1 % var0.animations().size());
      f_7693.put(var0.m_8684(), (var1 + 1) % var0.animations().size());
      f_7695 = new Class_GGEo7U6LC2t9Tb5z.xwEztf4lk4uL6X0r(UUID.randomUUID(), var0, var2, System.nanoTime(), 0L);
      f_7695.f_7689.f_25502 = System.nanoTime();
      Class_IJNgfuPB2JDUg8Ln.m_2973().m_2959();
   }

   public static void m_2761(AvatarRenderState var0, UUID var1) {
      f_7692.put(var0, var1);
   }

   private static void m_2762(HumanoidModel<?> var0, Class_DYfbN7i8OfYweq8U var1, float var2, float var3) {
      Object var4 = Class_WREU7oMaYdkygWNg.m_5451(var0.root());
      Class_DYfbN7i8OfYweq8U.jYlylkCtfEuU3kLU var5 = var1.m_2459(f_7732, var2);
      Class_DYfbN7i8OfYweq8U.jYlylkCtfEuU3kLU var6 = var1.m_2459(f_7733, var2);
      Class_DYfbN7i8OfYweq8U.jYlylkCtfEuU3kLU var7 = var1.m_2459(f_7734, var2);
      Class_DYfbN7i8OfYweq8U.jYlylkCtfEuU3kLU var8 = var1.m_2459(f_7735, var2);
      Class_DYfbN7i8OfYweq8U.jYlylkCtfEuU3kLU var9 = var1.m_2459(f_7736, var2);
      Class_DYfbN7i8OfYweq8U.jYlylkCtfEuU3kLU var10 = var1.m_2459(f_7737, var2);
      float var11 = var6.bendDirection() + var5.bendDirection();
      float var12 = (var6.bend() + var5.bend()) * var3;
      Class_WREU7oMaYdkygWNg.m_5446(var0.body, var4, true, var11, var12);
      Class_WREU7oMaYdkygWNg.m_5446(var0.rightArm, var4, false, var7.bendDirection(), var7.bend() * var3);
      Class_WREU7oMaYdkygWNg.m_5446(var0.leftArm, var4, false, var8.bendDirection(), var8.bend() * var3);
      Class_WREU7oMaYdkygWNg.m_5446(var0.rightLeg, var4, false, var9.bendDirection(), var9.bend() * var3);
      Class_WREU7oMaYdkygWNg.m_5446(var0.leftLeg, var4, false, var10.bendDirection(), var10.bend() * var3);
      Class_WREU7oMaYdkygWNg.m_5450(var0.head, var4, var11, var12);
      Class_WREU7oMaYdkygWNg.m_5450(var0.rightArm, var4, var11, var12);
      Class_WREU7oMaYdkygWNg.m_5450(var0.leftArm, var4, var11, var12);
      if (var0 instanceof PlayerModel var13) {
         Class_WREU7oMaYdkygWNg.m_5446(var13.jacket, var4, true, var11, var12);
         Class_WREU7oMaYdkygWNg.m_5446(var13.rightSleeve, var4, false, var7.bendDirection(), var7.bend() * var3);
         Class_WREU7oMaYdkygWNg.m_5446(var13.leftSleeve, var4, false, var8.bendDirection(), var8.bend() * var3);
         Class_WREU7oMaYdkygWNg.m_5446(var13.rightPants, var4, false, var9.bendDirection(), var9.bend() * var3);
         Class_WREU7oMaYdkygWNg.m_5446(var13.leftPants, var4, false, var10.bendDirection(), var10.bend() * var3);
      }
   }

   public static void m_2763() {
      f_7695 = null;
      f_7694.clear();
      f_7692.clear();
   }

   public static void m_2764(AvatarRenderState var0, HumanoidArm var1, PoseStack var2) {
      long var3 = System.nanoTime();
      Class_GGEo7U6LC2t9Tb5z.xwEztf4lk4uL6X0r var5 = m_2756(var0, var3);
      if (var5 != null) {
         Class_DYfbN7i8OfYweq8U var6 = var5.f_7688;
         float var7 = var5.m_2745(var3);
         float var8 = var5.m_2744(var3);
         Class_DYfbN7i8OfYweq8U.jYlylkCtfEuU3kLU var9 = var6.m_2459(var1 == HumanoidArm.LEFT ? f_7719 : f_7720, var7);
         float var10 = var9.bend() * var8;
         if (!(Math.abs(var10) < f_7721)) {
            float var11 = -var9.bendDirection();
            var2.translate(0.0F, f_7722, 0.0F);
            var2.mulPose(new Quaternionf().rotateAxis(var10, (float)Math.cos(var11), 0.0F, (float)Math.sin(var11)));
            var2.translate(0.0F, f_7723, 0.0F);
         }
      }
   }

   public static boolean m_2765() {
      return f_7695 != null;
   }

   public static void m_2766(HumanoidModel<?> var0, AvatarRenderState var1) {
      m_2749(var0);
      long var2 = System.nanoTime();
      Class_GGEo7U6LC2t9Tb5z.xwEztf4lk4uL6X0r var4 = m_2756(var1, var2);
      if (var4 != null) {
         Class_DYfbN7i8OfYweq8U var5 = var4.f_7688;
         float var6 = var4.m_2745(var2);
         float var7 = var4.m_2744(var2);
         m_2751(var0.head, var5.m_2459(f_7699, var6), var7, 0.0F, 0.0F, 0.0F);
         m_2751(var0.body, var5.m_2459(f_7700, var6), var7, 0.0F, 0.0F, 0.0F);
         m_2751(var0.rightArm, var5.m_2459(f_7701, var6), var7, f_7702, 2.0F, 0.0F);
         m_2751(var0.leftArm, var5.m_2459(f_7703, var6), var7, f_7704, 2.0F, 0.0F);
         m_2751(var0.rightLeg, var5.m_2459(f_7705, var6), var7, f_7706, f_7707, f_7708);
         m_2751(var0.leftLeg, var5.m_2459(f_7709, var6), var7, f_7710, f_7711, f_7712);
         m_2762(var0, var5, var6, var7);
      }
   }

   static final class xwEztf4lk4uL6X0r {
      public final UUID f_7685;
      public final Class_sIga32lGjUfDbarq f_7686;
      public final String f_7687;
      public final Class_DYfbN7i8OfYweq8U f_7688;
      public final Class_mWYg31oKUE0OPic4 f_7689;
      public static final float f_7690 = 1.0E9F;
      public static final float f_7691 = 1.0E9F;

      public void m_2743(long var1) {
         if (!this.f_7686.loop() && this != Class_GGEo7U6LC2t9Tb5z.f_7695) {
            long var3 = this.f_7689.f_25502 + (long)(this.f_7688.m_2458() * f_7690);
            if (var1 >= var3 && (this.f_7689.f_25503 == 0L || this.f_7689.f_25503 > var3)) {
               this.f_7689.f_25503 = var3;
            }
         }
      }

      public float m_2744(long var1) {
         return this.f_7689.m_7605(var1);
      }

      public float m_2745(long var1) {
         return this.f_7688.m_2463((float)(var1 - this.f_7689.f_25502) / f_7691, this.f_7686.loop());
      }

      public xwEztf4lk4uL6X0r(UUID var1, Class_sIga32lGjUfDbarq var2, String var3, long var4, long var6) {
         this.f_7685 = var1;
         this.f_7686 = var2;
         this.f_7687 = var3;
         this.f_7688 = Class_DYfbN7i8OfYweq8U.m_2455(var2, var3);
         this.f_7689 = new Class_mWYg31oKUE0OPic4(var4, var6);
      }
   }
}
