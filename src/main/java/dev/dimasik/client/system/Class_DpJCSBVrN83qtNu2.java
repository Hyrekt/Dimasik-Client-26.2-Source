package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

public final class Class_DpJCSBVrN83qtNu2 extends Class_N3SSqGnetdyAyMUH {
   private final Class_JtQh1r0P8b1y8XvD f_6625 = m_3989(0, 0);
   private final Class_JtQh1r0P8b1y8XvD[] f_6626;
   private final Class_JtQh1r0P8b1y8XvD[] f_6627;
   private final Class_JtQh1r0P8b1y8XvD[] f_6628;
   private final Class_JtQh1r0P8b1y8XvD[] f_6629;
   private static final float f_6630 = -1.5F;
   private static final float f_6631 = -1.5F;
   private static final float f_6632 = 1.5F;
   private static final float f_6633 = 5.5F;
   private static final float f_6634 = 2.5F;
   private static final float f_6635 = -5.0F;
   private static final float f_6636 = -1.5F;
   private static final float f_6637 = -1.5F;
   private static final float f_6638 = -1.5F;
   private static final float f_6639 = 5.5F;
   private static final float f_6640 = 2.5F;
   private static final float f_6641 = -0.1F;
   private static final float f_6642 = -1.1F;
   private static final float f_6643 = -2.0F;
   private static final float f_6644 = 4.7F;
   private static final float f_6645 = -0.6F;
   private static final float f_6646 = 0.1F;
   private static final float f_6647 = -6.9F;
   private static final float f_6648 = -1.1F;
   private static final float f_6649 = -2.0F;
   private static final float f_6650 = -4.7F;
   private static final float f_6651 = -0.6F;
   private static final float f_6652 = 0.1F;
   private static final float f_6653 = -1.5F;
   private static final float f_6654 = -1.5F;
   private static final float f_6655 = 6.5F;
   private static final float f_6656 = 0.2F;
   private static final float f_6657 = 0.1F;
   private static final float f_6658 = -9.0F;
   private static final float f_6659 = -1.5F;
   private static final float f_6660 = -1.5F;
   private static final float f_6661 = -6.5F;
   private static final float f_6662 = 0.2F;
   private static final float f_6663 = 0.1F;
   private static final float f_6664 = -1.0F;
   private static final float f_6665 = -1.0F;
   private static final float f_6666 = 8.5F;
   private static final float f_6667 = -5.0F;
   private static final float f_6668 = -1.0F;
   private static final float f_6669 = -1.0F;
   private static final float f_6670 = -8.5F;
   private static final float f_6671 = -1.0F;
   private static final float f_6672 = 0.4F;
   private static final float f_6673 = -6.0F;
   private static final float f_6674 = -1.0F;
   private static final float f_6675 = -0.4F;
   private static final float f_6676 = -0.5F;
   private static final float f_6677 = 1.5F;
   private static final float f_6678 = -10.0F;
   private static final float f_6679 = -0.5F;
   private static final float f_6680 = 1.5F;
   private static final float f_6681 = -2.0F;
   private static final float f_6682 = -0.5F;
   private static final float f_6683 = -9.0F;
   private static final float f_6684 = -0.5F;
   private static final float f_6685 = -2.1F;
   private static final float f_6686 = -0.5F;
   private static final float f_6687 = -11.0F;
   private static final float f_6688 = -2.1F;
   private static final float f_6689 = -0.5F;

   private static Class_JtQh1r0P8b1y8XvD m_2481(float var0, float var1, float var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9) {
      Class_tNlRpwRgzUrOo0Tc var10 = Class_tNlRpwRgzUrOo0Tc.m_8864(var0, var1, var2, var3, var4, var5, var6, 64, 64);
      var10.m_3361(var7, var8, var9);
      return var10;
   }

   @Override
   public void m_2482(
      Class_WzqIkwE6nF1UkDXB var1, float var2, PoseStack var3, VertexConsumer var4, int var5, int var6, float var7, float var8, float var9, float var10
   ) {
      Class_GgAv5LmRq7OHDViI var11 = (Class_GgAv5LmRq7OHDViI)var1;

      for (int var12 = 0; var12 < this.f_6626.length; var12++) {
         m_3990(this.f_6626[var12], this.f_6627[var12], var11.m_2842(var12, var2));
      }

      for (int var13 = 0; var13 < this.f_6628.length; var13++) {
         m_3990(this.f_6628[var13], this.f_6629[var13], var11.m_2837(var13, var2));
      }

      this.f_6625.m_3358(var3, var4, var5, var6, var7, var8, var9, var10);
   }

   private static Class_JtQh1r0P8b1y8XvD m_2483(
      int var0, int var1, float var2, float var3, float var4, int var5, int var6, int var7, float var8, float var9, float var10
   ) {
      Class_JtQh1r0P8b1y8XvD var11 = m_3989(var0, var1);
      var11.m_3359(var2, var3, var4, var5, var6, var7);
      var11.m_3361(var8, var9, var10);
      return var11;
   }

   public Class_DpJCSBVrN83qtNu2() {
      Class_JtQh1r0P8b1y8XvD var1 = m_2483(0, 28, 0.0F, f_6630, f_6631, 5, 3, 3, f_6632, f_6633, f_6634);
      Class_JtQh1r0P8b1y8XvD var2 = m_2483(0, 34, f_6635, f_6636, f_6637, 5, 3, 3, f_6638, f_6639, f_6640);
      Class_JtQh1r0P8b1y8XvD var3 = m_2483(0, 0, f_6641, f_6642, f_6643, 7, 3, 4, f_6644, f_6645, f_6646);
      Class_JtQh1r0P8b1y8XvD var4 = m_2483(0, 7, f_6647, f_6648, f_6649, 7, 3, 4, f_6650, f_6651, f_6652);
      Class_JtQh1r0P8b1y8XvD var5 = m_2483(22, 0, 0.0F, f_6653, f_6654, 9, 3, 3, f_6655, f_6656, f_6657);
      Class_JtQh1r0P8b1y8XvD var6 = m_2483(22, 6, f_6658, f_6659, f_6660, 9, 3, 3, f_6661, f_6662, f_6663);
      Class_JtQh1r0P8b1y8XvD var7 = m_2483(46, 0, 0.0F, f_6664, f_6665, 5, 2, 2, f_6666, 0.0F, 0.0F);
      Class_JtQh1r0P8b1y8XvD var8 = m_2483(46, 4, f_6667, f_6668, f_6669, 5, 2, 2, f_6670, 0.0F, 0.0F);
      var1.m_3360(var3);
      var2.m_3360(var4);
      var3.m_3360(var5);
      var4.m_3360(var6);
      var5.m_3360(var7);
      var6.m_3360(var8);
      Class_JtQh1r0P8b1y8XvD var9 = m_2481(0.0F, 0.0F, f_6671, 6, 8, 6, 40, f_6672, 0.0F, 1.0F);
      Class_JtQh1r0P8b1y8XvD var10 = m_2481(f_6673, 0.0F, f_6674, 6, 8, 0, 40, f_6675, 0.0F, 1.0F);
      Class_JtQh1r0P8b1y8XvD var11 = m_2481(0.0F, 0.0F, f_6676, 10, 14, 10, 14, 0.0F, f_6677, 1.0F);
      Class_JtQh1r0P8b1y8XvD var12 = m_2481(f_6678, 0.0F, f_6679, 10, 14, 0, 14, 0.0F, f_6680, 1.0F);
      Class_JtQh1r0P8b1y8XvD var13 = m_2481(f_6681, 0.0F, f_6682, 11, 12, 31, 14, 0.0F, 1.0F, 0.0F);
      Class_JtQh1r0P8b1y8XvD var14 = m_2481(f_6683, 0.0F, f_6684, 11, 12, 20, 14, 0.0F, 1.0F, 0.0F);
      Class_JtQh1r0P8b1y8XvD var15 = m_2481(0.0F, f_6685, f_6686, 11, 11, 53, 14, 0.0F, 0.0F, 0.0F);
      Class_JtQh1r0P8b1y8XvD var16 = m_2481(f_6687, f_6688, f_6689, 11, 11, 42, 14, 0.0F, 0.0F, 0.0F);
      var1.m_3360(var9);
      var2.m_3360(var10);
      var3.m_3360(var11);
      var4.m_3360(var12);
      var5.m_3360(var13);
      var6.m_3360(var14);
      var7.m_3360(var15);
      var8.m_3360(var16);
      this.f_6625.m_3360(var1);
      this.f_6625.m_3360(var2);
      this.f_6626 = new Class_JtQh1r0P8b1y8XvD[]{var1, var3, var5, var7};
      this.f_6627 = new Class_JtQh1r0P8b1y8XvD[]{var2, var4, var6, var8};
      this.f_6628 = new Class_JtQh1r0P8b1y8XvD[]{var9, var11, var13, var15};
      this.f_6629 = new Class_JtQh1r0P8b1y8XvD[]{var10, var12, var14, var16};
   }
}
