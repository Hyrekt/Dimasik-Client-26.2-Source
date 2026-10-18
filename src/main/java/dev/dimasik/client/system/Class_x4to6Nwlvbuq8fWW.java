package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack.Pose;
import net.minecraft.resources.Identifier;
import org.joml.Vector3f;

public final class Class_x4to6Nwlvbuq8fWW {
   public static final Identifier f_34714 = Identifier.fromNamespaceAndPath(Class_x4to6Nwlvbuq8fWW.f_34874, Class_x4to6Nwlvbuq8fWW.f_34875);
   public static final Identifier f_34715 = Identifier.fromNamespaceAndPath(Class_x4to6Nwlvbuq8fWW.f_34876, Class_x4to6Nwlvbuq8fWW.f_34877);
   private static final float f_34716 = 3.0F;
   private static final float f_34717 = 6.0F;
   private static final float f_34718 = 13.0F;
   private static final float f_34719 = 9.0F;
   private static final float f_34720 = 11.0F;
   private static final float f_34721 = 2.5F;
   private static final float f_34722 = 4.0F;
   private static final float f_34723 = 7.5F;
   private static final float f_34724 = 6.5F;
   private static final float f_34725 = 7.5F;
   private static final float f_34726 = 4.0F;
   private static final float f_34727 = 12.5F;
   private static final float f_34728 = 6.5F;
   private static final float f_34729 = 2.5F;
   private static final float f_34730 = 6.5F;
   private static final float f_34731 = 7.5F;
   private static final float f_34732 = 11.0F;
   private static final float f_34733 = 10.0F;
   private static final float f_34734 = 6.5F;
   private static final float f_34735 = 15.0F;
   private static final float f_34736 = 11.0F;
   private static final float f_34737 = 7.5F;
   private static final float f_34738 = 6.5F;
   private static final float f_34739 = 10.0F;
   private static final float f_34740 = 11.0F;
   private static final float f_34741 = 6.5F;
   private static final float f_34742 = 2.5F;
   private static final float f_34743 = 11.0F;
   private static final float f_34744 = 4.0F;
   private static final float f_34745 = 4.0F;
   private static final float f_34746 = 12.0F;
   private static final float f_34747 = 7.0F;
   private static final float f_34748 = 6.0F;
   private static final float f_34749 = 5.0F;
   private static final float f_34750 = 11.0F;
   private static final float f_34751 = 9.0F;
   private static final float f_34752 = 12.0F;
   private static final float f_34753 = 11.0F;
   private static final float f_34754 = 5.0F;
   private static final float f_34755 = 12.0F;
   private static final float f_34756 = 12.0F;
   private static final float f_34757 = 5.0F;
   private static final float f_34758 = 15.0F;
   private static final float f_34759 = 5.0F;
   private static final float f_34760 = 12.0F;
   private static final float f_34761 = 6.0F;
   private static final float f_34762 = 15.0F;
   private static final float f_34763 = 12.0F;
   private static final float f_34764 = 15.0F;
   private static final float f_34765 = 11.0F;
   private static final float f_34766 = 11.0F;
   private static final float f_34767 = 11.5F;
   private static final float f_34768 = 11.5F;
   private static final float f_34769 = 10.5F;
   private static final float f_34770 = 11.0F;
   private static final float f_34771 = 11.0F;
   private static final float f_34772 = 11.5F;
   private static final float f_34773 = 10.5F;
   private static final float f_34774 = 11.5F;
   private static final float f_34775 = 11.0F;
   private static final float f_34776 = 15.5F;
   private static final float f_34777 = 10.0F;
   private static final float f_34778 = 11.5F;
   private static final float f_34779 = 10.5F;
   private static final float f_34780 = 15.5F;
   private static final float f_34781 = 11.0F;
   private static final float f_34782 = 11.5F;
   private static final float f_34783 = 11.5F;
   private static final float f_34784 = 15.5F;
   private static final float f_34785 = 4.0F;
   private static final float f_34786 = 3.0F;
   private static final float f_34787 = 11.0F;
   private static final float f_34788 = 5.0F;
   private static final float f_34789 = 11.0F;
   private static final float f_34790 = 12.0F;
   private static final float f_34791 = 11.0F;
   private static final float f_34792 = 3.0F;
   private static final float f_34793 = 11.0F;
   private static final float f_34794 = 12.0F;
   private static final float f_34795 = 11.0F;
   private static final float f_34796 = 12.0F;
   private static final float f_34797 = 3.0F;
   private static final float f_34798 = 9.0F;
   private static final float f_34799 = 6.0F;
   private static final float f_34800 = 13.0F;
   private static final float f_34801 = 12.0F;
   private static final float f_34802 = 11.0F;
   private static final float f_34803 = 7.5F;
   private static final float f_34804 = 12.5F;
   private static final float f_34805 = 2.5F;
   private static final float f_34806 = 2.5F;
   private static final float f_34807 = 7.5F;
   private static final float f_34808 = 2.5F;
   private static final float f_34809 = 2.5F;
   private static final float f_34810 = 2.5F;
   private static final float f_34811 = 7.5F;
   private static final float f_34812 = 4.0F;
   private static final float f_34813 = 10.0F;
   private static final float f_34814 = 2.5F;
   private static final float f_34815 = 15.0F;
   private static final float f_34816 = 4.0F;
   private static final float f_34817 = 7.5F;
   private static final float f_34818 = 2.5F;
   private static final float f_34819 = 10.0F;
   private static final float f_34820 = 4.0F;
   private static final float f_34821 = 2.5F;
   private static final float f_34822 = 2.5F;
   private static final float f_34823 = 4.0F;
   private static final float f_34824 = 4.0F;
   private static final float f_34825 = 3.995F;
   private static final float f_34826 = 12.0F;
   private static final float f_34827 = 7.0F;
   private static final float f_34828 = 12.0F;
   private static final float f_34829 = 5.0F;
   private static final float f_34830 = 15.0F;
   private static final float f_34831 = 3.0F;
   private static final float f_34832 = 9.0F;
   private static final float f_34833 = 5.995F;
   private static final float f_34834 = 13.0F;
   private static final float f_34835 = 12.0F;
   private static final float f_34836 = 2.5F;
   private static final float f_34837 = 2.5F;
   private static final float f_34838 = 7.5F;
   private static final float f_34839 = 4.0F;
   private static final float f_34840 = 16.0F;
   private static final float f_34841 = 16.0F;
   private static final float f_34842 = 16.0F;
   private static final float f_34843 = 16.0F;
   private static final float f_34844 = 16.0F;
   private static final float f_34845 = 16.0F;
   private static final float f_34846 = 16.0F;
   private static final float f_34847 = 16.0F;
   private static final float f_34848 = 8.0F;
   private static final float f_34849 = 16.0F;
   private static final float f_34850 = 8.0F;
   private static final float f_34851 = 16.0F;
   private static final float f_34852 = 12.0F;
   private static final float f_34853 = 16.0F;
   private static final float f_34854 = 12.0F;
   private static final float f_34855 = 16.0F;
   private static final float f_34856 = 8.0F;
   private static final float f_34857 = 16.0F;
   private static final float f_34858 = 8.0F;
   private static final float f_34859 = 16.0F;
   private static final float f_34860 = -1.0F;
   private static final float f_34861 = -1.0F;
   private static final float f_34862 = -1.0F;
   private static final float f_34863 = 8.0F;
   private static final float f_34864 = 16.0F;
   private static final float f_34865 = 8.0F;
   private static final float f_34866 = 16.0F;
   private static final float f_34867 = 12.0F;
   private static final float f_34868 = 16.0F;
   private static final float f_34869 = 12.0F;
   private static final float f_34870 = 16.0F;
   private static final float f_34871 = 8.0F;
   private static final float f_34872 = 16.0F;
   private static final float f_34873 = -1.0F;
   private static final String f_34874 = "dimasik";
   private static final String f_34875 = "textures/cosmetics/backpacks/backpack.png";
   private static final String f_34876 = "dimasik";
   private static final String f_34877 = "textures/cosmetics/backpacks/backpack_overlay.png";

   public static void m_9447(PoseStack var0, VertexConsumer var1, int var2, int var3, Class_LdeJaBYCxAYq5SO6 var4, float var5) {
      float var6 = var4.m_3639();
      float var7 = var4.m_3640();
      float var8 = var4.m_3641();
      m_9453(
         var0,
         var1,
         f_34716,
         0.0F,
         f_34717,
         f_34718,
         f_34719,
         f_34720,
         m_9448(f_34721, f_34722, f_34723, f_34724, true),
         m_9448(f_34725, f_34726, f_34727, f_34728, true),
         m_9452(f_34729, f_34730, f_34731, f_34732),
         m_9452(f_34733, f_34734, f_34735, f_34736),
         m_9452(f_34737, f_34738, f_34739, f_34740),
         m_9452(0.0F, f_34741, f_34742, f_34743),
         var2,
         var3,
         var6,
         var7,
         var8,
         var5
      );
      m_9453(
         var0,
         var1,
         f_34744,
         1.0F,
         f_34745,
         f_34746,
         f_34747,
         f_34748,
         m_9448(f_34749, f_34750, f_34751, f_34752, true),
         m_9448(1.0F, f_34753, f_34754, f_34755, true),
         m_9452(1.0F, f_34756, f_34757, f_34758),
         null,
         m_9452(f_34759, f_34760, f_34761, f_34762),
         m_9452(0.0F, f_34763, 1.0F, f_34764),
         var2,
         var3,
         var6,
         var7,
         var8,
         var5
      );
      Class_x4to6Nwlvbuq8fWW.ax4yy6bSDHjcwAHu var9 = m_9448(f_34765, f_34766, f_34767, f_34768, true);
      Class_x4to6Nwlvbuq8fWW.ax4yy6bSDHjcwAHu var10 = m_9448(f_34769, f_34770, f_34771, f_34772, true);
      Class_x4to6Nwlvbuq8fWW.ax4yy6bSDHjcwAHu var11 = m_9452(f_34773, f_34774, f_34775, f_34776);
      Class_x4to6Nwlvbuq8fWW.ax4yy6bSDHjcwAHu var12 = m_9452(f_34777, f_34778, f_34779, f_34780);
      Class_x4to6Nwlvbuq8fWW.ax4yy6bSDHjcwAHu var13 = m_9452(f_34781, f_34782, f_34783, f_34784);
      m_9453(var0, var1, f_34785, f_34786, f_34787, f_34788, f_34789, f_34790, var9, var10, null, var11, var12, var13, var2, var3, var6, var7, var8, var5);
      m_9453(var0, var1, f_34791, f_34792, f_34793, f_34794, f_34795, f_34796, var9, var10, null, var11, var12, var13, var2, var3, var6, var7, var8, var5);
      m_9453(
         var0,
         var1,
         f_34797,
         f_34798,
         f_34799,
         f_34800,
         f_34801,
         f_34802,
         m_9448(f_34803, 0.0F, f_34804, f_34805, true),
         m_9448(f_34806, 0.0F, f_34807, f_34808, true),
         m_9452(f_34809, f_34810, f_34811, f_34812),
         m_9452(f_34813, f_34814, f_34815, f_34816),
         m_9452(f_34817, f_34818, f_34819, f_34820),
         m_9452(0.0F, f_34821, f_34822, f_34823),
         var2,
         var3,
         var6,
         var7,
         var8,
         var5
      );
   }

   private static Class_x4to6Nwlvbuq8fWW.ax4yy6bSDHjcwAHu m_9448(float var0, float var1, float var2, float var3, boolean var4) {
      return new Class_x4to6Nwlvbuq8fWW.ax4yy6bSDHjcwAHu(var0 / f_34844, var1 / f_34845, var2 / f_34846, var3 / f_34847, var4);
   }

   private static void m_9449(
      PoseStack var0,
      VertexConsumer var1,
      Class_x4to6Nwlvbuq8fWW.ax4yy6bSDHjcwAHu var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16,
      float var17,
      int var18,
      int var19,
      float var20,
      float var21,
      float var22,
      float var23
   ) {
      if (var2 != null) {
         Pose var24 = var0.last();
         Vector3f var25 = var24.normal().transform(new Vector3f(var15, var16, var17)).normalize();
         if (var2.rotate) {
            m_9450(var24, var1, var3, var4, var5, var2.u1, var2.v1, var25, var18, var19, var20, var21, var22, var23);
            m_9450(var24, var1, var6, var7, var8, var2.u1, var2.v0, var25, var18, var19, var20, var21, var22, var23);
            m_9450(var24, var1, var9, var10, var11, var2.u0, var2.v0, var25, var18, var19, var20, var21, var22, var23);
            m_9450(var24, var1, var12, var13, var14, var2.u0, var2.v1, var25, var18, var19, var20, var21, var22, var23);
         } else {
            m_9450(var24, var1, var3, var4, var5, var2.u0, var2.v0, var25, var18, var19, var20, var21, var22, var23);
            m_9450(var24, var1, var6, var7, var8, var2.u0, var2.v1, var25, var18, var19, var20, var21, var22, var23);
            m_9450(var24, var1, var9, var10, var11, var2.u1, var2.v1, var25, var18, var19, var20, var21, var22, var23);
            m_9450(var24, var1, var12, var13, var14, var2.u1, var2.v0, var25, var18, var19, var20, var21, var22, var23);
         }
      }
   }

   private Class_x4to6Nwlvbuq8fWW() {
   }

   private static void m_9450(
      Pose var0,
      VertexConsumer var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      Vector3f var7,
      int var8,
      int var9,
      float var10,
      float var11,
      float var12,
      float var13
   ) {
      Vector3f var14 = var0.pose().transformPosition(new Vector3f(var2, var3, var4));
      var1.addVertex(var14.x, var14.y, var14.z)
         .setColor(var10, var11, var12, var13)
         .setUv(var5, var6)
         .setOverlay(var9)
         .setLight(var8)
         .setNormal(var7.x, var7.y, var7.z);
   }

   public static void m_9451(PoseStack var0, VertexConsumer var1, int var2, int var3, float var4) {
      m_9454(var0, var1, f_34824, 1.0F, f_34825, f_34826, f_34827, m_9452(1.0F, f_34828, f_34829, f_34830), var2, var3, 1.0F, 1.0F, 1.0F, var4);
      m_9454(var0, var1, f_34831, f_34832, f_34833, f_34834, f_34835, m_9452(f_34836, f_34837, f_34838, f_34839), var2, var3, 1.0F, 1.0F, 1.0F, var4);
   }

   private static Class_x4to6Nwlvbuq8fWW.ax4yy6bSDHjcwAHu m_9452(float var0, float var1, float var2, float var3) {
      return new Class_x4to6Nwlvbuq8fWW.ax4yy6bSDHjcwAHu(var0 / f_34840, var1 / f_34841, var2 / f_34842, var3 / f_34843, false);
   }

   private static void m_9453(
      PoseStack var0,
      VertexConsumer var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      Class_x4to6Nwlvbuq8fWW.ax4yy6bSDHjcwAHu var8,
      Class_x4to6Nwlvbuq8fWW.ax4yy6bSDHjcwAHu var9,
      Class_x4to6Nwlvbuq8fWW.ax4yy6bSDHjcwAHu var10,
      Class_x4to6Nwlvbuq8fWW.ax4yy6bSDHjcwAHu var11,
      Class_x4to6Nwlvbuq8fWW.ax4yy6bSDHjcwAHu var12,
      Class_x4to6Nwlvbuq8fWW.ax4yy6bSDHjcwAHu var13,
      int var14,
      int var15,
      float var16,
      float var17,
      float var18,
      float var19
   ) {
      float var20 = (var2 - f_34848) / f_34849;
      float var21 = (var5 - f_34850) / f_34851;
      float var22 = (f_34852 - var6) / f_34853;
      float var23 = (f_34854 - var3) / f_34855;
      float var24 = (var4 - f_34856) / f_34857;
      float var25 = (var7 - f_34858) / f_34859;
      m_9449(
         var0,
         var1,
         var8,
         var20,
         var22,
         var25,
         var20,
         var22,
         var24,
         var21,
         var22,
         var24,
         var21,
         var22,
         var25,
         0.0F,
         f_34860,
         0.0F,
         var14,
         var15,
         var16,
         var17,
         var18,
         var19
      );
      m_9449(
         var0,
         var1,
         var9,
         var20,
         var23,
         var24,
         var20,
         var23,
         var25,
         var21,
         var23,
         var25,
         var21,
         var23,
         var24,
         0.0F,
         1.0F,
         0.0F,
         var14,
         var15,
         var16,
         var17,
         var18,
         var19
      );
      m_9449(
         var0,
         var1,
         var10,
         var20,
         var22,
         var24,
         var20,
         var23,
         var24,
         var21,
         var23,
         var24,
         var21,
         var22,
         var24,
         0.0F,
         0.0F,
         f_34861,
         var14,
         var15,
         var16,
         var17,
         var18,
         var19
      );
      m_9449(
         var0,
         var1,
         var11,
         var21,
         var22,
         var25,
         var21,
         var23,
         var25,
         var20,
         var23,
         var25,
         var20,
         var22,
         var25,
         0.0F,
         0.0F,
         1.0F,
         var14,
         var15,
         var16,
         var17,
         var18,
         var19
      );
      m_9449(
         var0,
         var1,
         var12,
         var20,
         var22,
         var25,
         var20,
         var23,
         var25,
         var20,
         var23,
         var24,
         var20,
         var22,
         var24,
         f_34862,
         0.0F,
         0.0F,
         var14,
         var15,
         var16,
         var17,
         var18,
         var19
      );
      m_9449(
         var0,
         var1,
         var13,
         var21,
         var22,
         var24,
         var21,
         var23,
         var24,
         var21,
         var23,
         var25,
         var21,
         var22,
         var25,
         1.0F,
         0.0F,
         0.0F,
         var14,
         var15,
         var16,
         var17,
         var18,
         var19
      );
   }

   private static void m_9454(
      PoseStack var0,
      VertexConsumer var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      Class_x4to6Nwlvbuq8fWW.ax4yy6bSDHjcwAHu var7,
      int var8,
      int var9,
      float var10,
      float var11,
      float var12,
      float var13
   ) {
      float var14 = (var2 - f_34863) / f_34864;
      float var15 = (var5 - f_34865) / f_34866;
      float var16 = (f_34867 - var6) / f_34868;
      float var17 = (f_34869 - var3) / f_34870;
      float var18 = (var4 - f_34871) / f_34872;
      m_9449(
         var0,
         var1,
         var7,
         var14,
         var16,
         var18,
         var14,
         var17,
         var18,
         var15,
         var17,
         var18,
         var15,
         var16,
         var18,
         0.0F,
         0.0F,
         f_34873,
         var8,
         var9,
         var10,
         var11,
         var12,
         var13
      );
   }

   private record ax4yy6bSDHjcwAHu(float u0, float v0, float u1, float v1, boolean rotate) {
      public float m_9443() {
         return this.u1;
      }

      public float m_9444() {
         return this.u0;
      }

      public float m_9445() {
         return this.v0;
      }

      public float m_9446() {
         return this.v1;
      }
   }
}
