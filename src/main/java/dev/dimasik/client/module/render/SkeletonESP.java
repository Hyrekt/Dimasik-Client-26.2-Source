package dev.dimasik.client.module.render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.ColorSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_81oIJPtsDGdzRKcL;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_bhSc4OUnYWSe2vjL;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;

public class SkeletonESP extends Module {
   private final ColorSetting f_34878;
   private final ColorSetting f_34879;
   private final SliderSetting f_34880;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_34881;
   private static final String f_34882 = "SkeletonESP";
   private static final String f_34883 = "Рендерит скелет игроков линиями";
   private static final String f_34884 = "Цвет";
   private static final String f_34885 = "Цвет друзей";
   private static final int f_34886 = -16711936;
   private static final String f_34887 = "Толщина";
   private static final float f_34888 = 1.5F;
   private static final float f_34889 = 0.5F;
   private static final float f_34890 = 3.0F;
   private static final float f_34891 = 0.5F;
   private static final float f_34892 = 0.5F;
   private static final float f_34893 = 1.05F;
   private static final double f_34894 = 1.6;
   private static final double f_34895 = 1.2;
   private static final double f_34896 = 0.6;
   private static final double f_34897 = 0.33F;
   private static final double f_34898 = 0.8;
   private static final double f_34899 = 0.15;
   private static final double f_34900 = 1.5;
   private static final double f_34901 = 1.2;
   private static final double f_34902 = 0.6;
   private static final double f_34903 = 0.8;
   private static final double f_34904 = 0.1;
   private static final double f_34905 = 0.33F;
   private static final double f_34906 = 0.25;
   private static final double f_34907 = 1.25;
   private static final double f_34908 = 0.95;
   private static final double f_34909 = 0.45;
   private static final double f_34910 = 0.55;
   private static final double f_34911 = 0.1;
   private static final double f_34912 = 1.5;
   private static final double f_34913 = 1.2;
   private static final double f_34914 = 0.6;
   private static final double f_34915 = 0.8;
   private static final double f_34916 = 0.1;
   private static final double f_34917 = 0.33F;
   private static final double f_34918 = 1.5;
   private static final double f_34919 = 1.2;
   private static final double f_34920 = 0.6;
   private static final double f_34921 = 0.8;
   private static final double f_34922 = 0.1;
   private static final double f_34923 = 0.33F;
   private static final float f_34924 = -50.0F;
   private static final float f_34925 = 50.0F;
   private static final float f_34926 = 3.0F;
   private static final float f_34927 = 0.8F;
   private static final float f_34928 = 0.6662F;
   private static final float f_34929 = (float) Math.PI;
   private static final float f_34930 = 0.5F;
   private static final float f_34931 = 0.6662F;
   private static final float f_34932 = 0.5F;
   private static final float f_34933 = 0.6662F;
   private static final float f_34934 = 1.4F;
   private static final float f_34935 = 0.6662F;
   private static final float f_34936 = (float) Math.PI;
   private static final float f_34937 = 1.4F;
   private static final float f_34938 = 90.0F;
   private static final float f_34939 = -0.1F;
   private static final float f_34940 = 4.0F;
   private static final float f_34941 = 0.5F;
   private static final float f_34942 = 180.0F / (float)Math.PI;
   private static final float f_34943 = 180.0F / (float)Math.PI;
   private static final float f_34944 = 180.0F / (float)Math.PI;
   private static final float f_34945 = 180.0F / (float)Math.PI;
   private static final float f_34946 = 0.0025F;

   public SkeletonESP() {
      super(f_34882, f_34883, Category.RENDER);
      this.f_34878 = new ColorSetting(f_34884, false, -1);
      this.f_34879 = new ColorSetting(f_34885, false, f_34886);
      this.f_34880 = new SliderSetting(f_34887, f_34888, f_34889, f_34890).m_828(f_34891);
      this.f_34881 = this::m_9457;
      this.m_795(this.f_34878, this.f_34879, this.f_34880);
   }

   private void m_9455(PoseStack var1, VertexConsumer var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      Class_bhSc4OUnYWSe2vjL.m_6086(var1.last(), var2, var3, var4, var5, var6, var7, var8, var9);
      float var10 = Math.max(0.0F, this.f_34880.m_8768() - 1.0F) * f_34946;
      if (var10 > 0.0F) {
         Class_bhSc4OUnYWSe2vjL.m_6086(var1.last(), var2, var3 + var10, var4, var5, var6 + var10, var7, var8, var9);
         Class_bhSc4OUnYWSe2vjL.m_6086(var1.last(), var2, var3 - var10, var4, var5, var6 - var10, var7, var8, var9);
         Class_bhSc4OUnYWSe2vjL.m_6086(var1.last(), var2, var3, var4, var5 + var10, var6, var7, var8 + var10, var9);
         Class_bhSc4OUnYWSe2vjL.m_6086(var1.last(), var2, var3, var4, var5 - var10, var6, var7, var8 - var10, var9);
      }
   }

   private void m_9456(PoseStack var1, VertexConsumer var2, Player var3, Vec3 var4, float var5) {
      double var6 = Mth.lerp(var5, var3.xo, var3.getX()) - var4.x;
      double var8 = Mth.lerp(var5, var3.yo, var3.getY()) - var4.y;
      double var10 = Mth.lerp(var5, var3.zo, var3.getZ()) - var4.z;
      float var12 = var3.isBaby() ? f_34892 : f_34893;
      double var13 = var8 + f_34894 * var12;
      double var15 = var8 + f_34895 * var12;
      double var17 = var8 + f_34896 * var12;
      double var19 = f_34897;
      double var21 = var8 + f_34898 * var12;
      double var23 = f_34899 * var12;
      double var25 = var8;
      boolean var27 = var3.isVisuallySwimming() || var3.isSwimming();
      boolean var28 = var3.isFallFlying();
      boolean var29 = var3.isVisuallyCrawling() && !var3.isCrouching();
      boolean var30 = var3.isCrouching();
      if (var27) {
         var13 = var8 + f_34900 * var12;
         var15 = var8 + f_34901 * var12;
         var17 = var8 + f_34902 * var12;
         var21 = var8 + f_34903 * var12;
         var25 = var8 + f_34904 * var12;
         var19 = f_34905;
         var23 = f_34906 * var12;
      } else if (var30) {
         var13 = var8 + f_34907 * var12;
         var15 = var8 + f_34908 * var12;
         var17 = var8 + f_34909 * var12;
         var21 = var8 + f_34910 * var12;
         var25 = var8 - f_34911 * var12;
      } else if (var28) {
         var13 = var8 + f_34912 * var12;
         var15 = var8 + f_34913 * var12;
         var17 = var8 + f_34914 * var12;
         var21 = var8 + f_34915 * var12;
         var25 = var8 + f_34916 * var12;
         var19 = f_34917;
      } else if (var29) {
         var13 = var8 + f_34918 * var12;
         var15 = var8 + f_34919 * var12;
         var17 = var8 + f_34920 * var12;
         var21 = var8 + f_34921 * var12;
         var25 = var8 + f_34922 * var12;
         var19 = f_34923;
      }

      int var31 = DimasikClient.m_9057().m_9049().m_2804().m_2877(var3.getName().getString()) ? this.f_34879.m_8768() : this.f_34878.m_8768();
      float var32 = Mth.rotLerp(var5, var3.yBodyRotO, var3.yBodyRot);
      float var33 = Mth.rotLerp(var5, var3.yHeadRotO, var3.yHeadRot);
      float var34 = Mth.lerp(var5, var3.xRotO, var3.getXRot());
      float var35 = var33 - var32;
      var34 = Mth.clamp(var34, f_34924, f_34925);
      float var36 = var3.walkAnimation.position(var5);
      float var37 = var3.walkAnimation.speed(var5);
      if (var3.isBaby()) {
         var36 *= f_34926;
         var37 *= f_34927;
      }

      if (var37 > 1.0F) {
         var37 = 1.0F;
      }

      float var38 = 0.0F;
      float var39 = 0.0F;
      float var40 = 0.0F;
      float var41 = 0.0F;
      if (!var27 && !var28 && !var29) {
         var38 = Mth.cos(var36 * f_34928 + f_34929) * 2.0F * var37 * f_34930;
         var39 = Mth.cos(var36 * f_34931) * 2.0F * var37 * f_34932;
         var40 = Mth.cos(var36 * f_34933) * f_34934 * var37;
         var41 = Mth.cos(var36 * f_34935 + f_34936) * f_34937 * var37;
      }

      var1.pushPose();
      var1.translate(var6, var8, var10);
      var1.mulPose(Axis.YP.rotationDegrees(-var32));
      if (var27 || var28 || var29) {
         var1.mulPose(Axis.XP.rotationDegrees(var34 + f_34938));
      } else if (var30) {
         var1.translate(0.0F, f_34939 * var12, 0.0F);
         var1.mulPose(Axis.XP.rotationDegrees(f_34940));
      }

      var1.pushPose();
      var1.translate(0.0F, (float)(var15 - var8), 0.0F);
      var1.mulPose(Axis.YP.rotationDegrees(-var35));
      if (!var27 && !var28 && !var29) {
         var1.mulPose(Axis.XP.rotationDegrees(var34 * f_34941));
      }

      this.m_9455(var1, var2, 0.0F, 0.0F, 0.0F, 0.0F, (float)(var13 - var15), 0.0F, var31);
      var1.popPose();
      this.m_9455(var1, var2, 0.0F, (float)(var15 - var8), 0.0F, 0.0F, (float)(var17 - var8), 0.0F, var31);
      var1.pushPose();
      var1.translate((float)(-var19), (float)(var15 - var8), 0.0F);
      var1.mulPose(Axis.XP.rotationDegrees(-var39 * f_34942));
      this.m_9455(var1, var2, 0.0F, 0.0F, 0.0F, 0.0F, (float)(var21 - var15), 0.0F, var31);
      var1.popPose();
      this.m_9455(var1, var2, 0.0F, (float)(var15 - var8), 0.0F, (float)(-var19), (float)(var15 - var8), 0.0F, var31);
      var1.pushPose();
      var1.translate((float)var19, (float)(var15 - var8), 0.0F);
      var1.mulPose(Axis.XP.rotationDegrees(-var38 * f_34943));
      this.m_9455(var1, var2, 0.0F, 0.0F, 0.0F, 0.0F, (float)(var21 - var15), 0.0F, var31);
      var1.popPose();
      this.m_9455(var1, var2, 0.0F, (float)(var15 - var8), 0.0F, (float)var19, (float)(var15 - var8), 0.0F, var31);
      var1.pushPose();
      var1.translate((float)(-var23), (float)(var17 - var8), 0.0F);
      var1.mulPose(Axis.XP.rotationDegrees(-var41 * f_34944));
      this.m_9455(var1, var2, 0.0F, 0.0F, 0.0F, 0.0F, (float)(var25 - var17), 0.0F, var31);
      var1.popPose();
      this.m_9455(var1, var2, 0.0F, (float)(var17 - var8), 0.0F, (float)(-var23), (float)(var17 - var8), 0.0F, var31);
      var1.pushPose();
      var1.translate((float)var23, (float)(var17 - var8), 0.0F);
      var1.mulPose(Axis.XP.rotationDegrees(-var40 * f_34945));
      this.m_9455(var1, var2, 0.0F, 0.0F, 0.0F, 0.0F, (float)(var25 - var17), 0.0F, var31);
      var1.popPose();
      this.m_9455(var1, var2, 0.0F, (float)(var17 - var8), 0.0F, (float)var23, (float)(var17 - var8), 0.0F, var31);
      var1.popPose();
   }

   private void m_9457(Class_TZhU50s8XmBQCMP5 var1) {
      if (f_11537.level != null && f_11537.player != null) {
         PoseStack var2 = var1.m_5006();
         VertexConsumer var3 = var1.m_5008().m_881(Class_81oIJPtsDGdzRKcL.f_3816);
         float var4 = var1.m_5004();
         Vec3 var5 = var1.m_5010();

         for (AbstractClientPlayer var7 : f_11537.level.players()) {
            if (this.m_9458(var7)) {
               this.m_9456(var2, var3, var7, var5, var4);
            }
         }
      }
   }

   private boolean m_9458(Player var1) {
      if (!var1.isAlive() || var1.isRemoved()) {
         return false;
      } else if (DimasikClient.m_9057().m_9049().m_2801().m_3581().f_33163.contains(var1)) {
         return false;
      } else {
         return var1 == f_11537.player ? !f_11537.options.getCameraType().isFirstPerson() : true;
      }
   }
}
