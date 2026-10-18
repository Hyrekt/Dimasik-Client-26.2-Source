package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.world.scores.DisplaySlot;
import org.joml.Matrix4f;

public final class Class_UiQ3442HnvvsK2qb extends Class_NO6SuGqq3FB7jQDZ implements Class_OJntZb8PWlU5XrDj {
   private static final float f_14848 = 22.0F;
   private static final float f_14849 = 6.0F;
   private static Class_UiQ3442HnvvsK2qb f_14850;
   private boolean f_14851;
   private boolean f_14852;
   private boolean f_14853;
   private boolean f_14854;
   private boolean f_14855;
   private boolean f_14856;
   private boolean f_14857;
   private boolean f_14858;
   private boolean f_14859;
   private float f_14860;
   private float f_14861;
   private float f_14862;
   private float f_14863;
   private float f_14864 = Float.POSITIVE_INFINITY;
   private float f_14865 = Float.POSITIVE_INFINITY;
   private float f_14866 = Float.NEGATIVE_INFINITY;
   private float f_14867 = Float.NEGATIVE_INFINITY;
   private float f_14868;
   private float f_14869;
   private static final String f_14870 = "Scoreboard";
   private static final float f_14871 = -1.0F;
   private static final float f_14872 = -1.0F;
   private static final float f_14873 = 0.01F;
   private static final float f_14874 = 0.01F;
   private static final float f_14875 = 8.0F;
   private static final float f_14876 = 4.0F;
   private static final double f_14877 = 90.0;
   private static final double f_14878 = 220.0;
   private static final double f_14879 = 210.0;
   private static final float f_14880 = 1.2F;
   private static final float f_14881 = 5.0F;
   private static final float f_14882 = 6.0F;
   private static final float f_14883 = 1.1F;
   private static final float f_14884 = 6.0F;
   private static final double f_14885 = 210.0;
   private static final float f_14886 = 7.0F;
   private static final float f_14887 = 7.0F;
   private static final float f_14888 = 8.0F;
   private static final float f_14889 = 8.0F;
   private static final float f_14890 = 4.0F;
   private static final double f_14891 = 235.0;
   private static final double f_14892 = 70.0;
   private static final float f_14893 = 22.0F;
   private static final float f_14894 = 6.0F;
   private static final float f_14895 = 4.0F;
   private static final float f_14896 = 6.0F;
   private static final float f_14897 = 22.0F;
   private static final float f_14898 = 22.0F;

   public void m_5266() {
      this.f_14859 = false;
      this.f_14860 = 0.0F;
      this.f_14861 = 0.0F;
   }

   public void m_5267() {
      if (!this.f_14858) {
         this.m_5286();
         this.m_5266();
      }
   }

   public void m_5268(int var1, int var2, int var3, int var4) {
      if (this.f_14854) {
         float var5 = Math.min(var1, var3);
         float var6 = Math.max(var1, var3);
         float var7 = Math.min(var2, var4);
         float var8 = Math.max(var2, var4);
         if (!(var6 - var5 < f_14875) && !(var8 - var7 < f_14876)) {
            this.f_14864 = Math.min(this.f_14864, var5);
            this.f_14865 = Math.min(this.f_14865, var7);
            this.f_14866 = Math.max(this.f_14866, var6);
            this.f_14867 = Math.max(this.f_14867, var8);
         }
      }
   }

   @Override
   public float m_1758() {
      return this.f_11521;
   }

   public void m_5269(float var1, float var2) {
      if (this.f_14859) {
         Minecraft var3 = Minecraft.getInstance();
         float var4 = Math.max(0.0F, var3.getWindow().getScreenWidth() - this.m_1757());
         float var5 = Math.max(0.0F, var3.getWindow().getScreenHeight() - this.m_1758());
         this.m_3997(Math.clamp(var1 + this.f_14860, 0.0F, var4));
         this.m_4008(Math.clamp(var2 + this.f_14861, 0.0F, var5));
      }
   }

   @Override
   public float m_1757() {
      return this.f_11520;
   }

   public boolean m_5270() {
      return this.f_14853;
   }

   public void m_5271() {
      this.f_14858 = false;
   }

   public void m_5272() {
      if (m_5284() && this.f_14858 && m_5281() && !(this.f_11520 <= 1.0F) && !(this.f_11521 <= 1.0F)) {
         Minecraft var1 = Minecraft.getInstance();
         if (var1.gui.screen() instanceof ChatScreen) {
            float var2 = this.m_3998();
            float var3 = this.m_3993();
            float var4 = this.m_1757();
            float var5 = this.m_1758();
            float[] var6 = this.m_5277();
            int var7 = Class_BftdentXEtGbugJw.m_2303(255, 255, 255, this.f_14853 ? f_14877 : f_14878);
            int var8 = this.f_14853 ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : Class_BftdentXEtGbugJw.m_2303(12, 14, 18, f_14879);
            Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
            Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588());

            try {
               Class_U4Qsm43RVlUI3Pre.m_5187(var2, var3, var4, var5, f_14880, f_14881, var7);
               Class_U4Qsm43RVlUI3Pre.m_5199(var6[0], var6[1], var6[2], var6[3], f_14882, var8);
               Class_U4Qsm43RVlUI3Pre.m_5187(var6[0], var6[1], var6[2], var6[3], f_14883, f_14884, Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_14885));
               Class_U4Qsm43RVlUI3Pre.m_5199(
                  var6[0] + f_14886,
                  var6[1] + f_14887,
                  f_14888,
                  f_14889,
                  f_14890,
                  this.f_14853 ? Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_14891) : Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_14892)
               );
            } finally {
               Class_U4Qsm43RVlUI3Pre.m_5193();
            }
         }
      }
   }

   public void m_5273(GuiGraphicsExtractor var1) {
      this.f_14868 = 0.0F;
      this.f_14869 = 0.0F;
      this.f_14855 = false;
      this.f_14854 = false;
      this.f_14856 = true;
      this.m_5285();
      if (m_5284() && var1 != null && m_5281()) {
         this.f_14854 = true;
         Minecraft var2 = Minecraft.getInstance();
         float var3 = Math.max(1.0F, var2.getWindow().getGuiScale());
         if (this.f_14851 && this.f_14857 && this.f_11520 > 1.0F && this.f_11521 > 1.0F) {
            this.f_14868 = this.m_3998() / var3 - this.f_14862;
            this.f_14869 = this.m_3999() / var3 - this.f_14863;
            if (Math.abs(this.f_14868) > f_14873 || Math.abs(this.f_14869) > f_14874) {
               var1.pose().pushMatrix();
               var1.pose().translate(this.f_14868, this.f_14869);
               this.f_14855 = true;
            }
         }
      } else {
         this.m_5286();
      }
   }

   public static float m_5274() {
      return f_14850 == null ? 0.0F : f_14850.f_14869;
   }

   public void m_5275(boolean var1) {
      this.f_14853 = var1;
   }

   public void m_5276(GuiGraphicsExtractor var1) {
      if (this.f_14856) {
         this.f_14856 = false;
         if (this.f_14855 && var1 != null) {
            var1.pose().popMatrix();
         }

         this.f_14855 = false;
         this.f_14854 = false;
         if (!m_5284() || !m_5281()) {
            this.m_5286();
            this.f_14868 = 0.0F;
            this.f_14869 = 0.0F;
         } else if (this.f_14866 > this.f_14864 && this.f_14867 > this.f_14865) {
            Minecraft var2 = Minecraft.getInstance();
            float var3 = Math.max(1.0F, var2.getWindow().getGuiScale());
            this.f_14862 = this.f_14864;
            this.f_14863 = this.f_14865;
            this.f_14857 = true;
            this.f_14858 = true;
            this.f_14852 = true;
            this.m_4012((this.f_14866 - this.f_14864) * var3);
            this.m_4007((this.f_14867 - this.f_14865) * var3);
            if (!this.f_14851) {
               this.m_3997(this.f_14862 * var3);
               this.m_4008(this.f_14863 * var3);
            }

            this.f_14852 = false;
         } else {
            this.m_5286();
         }
      }
   }

   private float[] m_5277() {
      if (Minecraft.getInstance().gui.screen() instanceof ChatScreen && !(this.f_11520 <= 1.0F) && !(this.f_11521 <= 1.0F)) {
         float var1 = this.m_3998();
         float var2 = this.m_3993();
         float var3 = var1 - f_14893 - f_14894;
         if (var3 < f_14895) {
            var3 = var1 + this.m_1757() + f_14896;
         }

         return new float[]{var3, var2, f_14897, f_14898};
      } else {
         return new float[]{0.0F, 0.0F, 0.0F, 0.0F};
      }
   }

   public static float m_5278() {
      return f_14850 == null ? 0.0F : f_14850.f_14868;
   }

   @Override
   public void m_3997(float var1) {
      super.m_3997(var1);
      if (!this.f_14852 && var1 >= 0.0F) {
         this.f_14851 = true;
      }
   }

   public static Class_UiQ3442HnvvsK2qb m_5279() {
      return f_14850;
   }

   @Override
   public void m_4008(float var1) {
      super.m_4008(var1);
      if (!this.f_14852 && var1 >= 0.0F) {
         this.f_14851 = true;
      }
   }

   public boolean m_5280() {
      return this.f_14851;
   }

   public static boolean m_5281() {
      Minecraft var0 = Minecraft.getInstance();
      if (var0.level == null) {
         return false;
      }

      try {
         return var0.level.getScoreboard().getDisplayObjective(DisplaySlot.SIDEBAR) != null;
      } catch (Throwable var2) {
         return false;
      }
   }

   public void m_5282() {
      this.f_14851 = true;
   }

   public boolean m_5283(float var1, float var2, int var3) {
      if (var3 == 0 && this.m_4011()) {
         if (!Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.m_3998(), this.m_3993(), this.m_1757(), this.m_1758())) {
            return false;
         }

         this.f_14859 = true;
         this.f_14860 = this.m_3998() - var1;
         this.f_14861 = this.m_3999() - var2;
         this.f_14851 = true;
         return true;
      } else {
         return false;
      }
   }

   public static boolean m_5284() {
      try {
         Class_Q49u2s432M4ulFXV.fUSCJlrSiIciub1c var0 = new Class_Q49u2s432M4ulFXV.fUSCJlrSiIciub1c();
         DimasikClient.m_9057().m_9051().m_9708(var0);
         return var0.m_4235();
      } catch (Throwable var1) {
         return false;
      }
   }

   private void m_5285() {
      this.f_14864 = Float.POSITIVE_INFINITY;
      this.f_14865 = Float.POSITIVE_INFINITY;
      this.f_14866 = Float.NEGATIVE_INFINITY;
      this.f_14867 = Float.NEGATIVE_INFINITY;
   }

   @Override
   public float m_3993() {
      return this.f_11519;
   }

   public void m_5286() {
      this.f_14856 = false;
      this.f_14852 = true;
      this.m_4012(0.0F);
      this.m_4007(0.0F);
      this.f_14852 = false;
   }

   public Class_UiQ3442HnvvsK2qb() {
      super(f_14870, f_14871, f_14872, 0.0F, 0.0F);
      f_14850 = this;
   }

   @Override
   public boolean m_4011() {
      return m_5284() && !this.f_14853 && m_5281() && super.m_4011();
   }

   @Override
   public boolean m_1340(float var1, float var2, int var3) {
      if (m_5284() && m_5281() && var3 == 0) {
         float[] var4 = this.m_5277();
         if (var4[2] > 0.0F && Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var4[0], var4[1], var4[2], var4[3])) {
            this.f_14853 = !this.f_14853;
            if (this.f_14853) {
               this.f_14851 = true;
            }

            return true;
         } else {
            return this.f_14853 && Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.m_3998(), this.m_3993(), this.m_1757(), this.m_1758());
         }
      } else {
         return false;
      }
   }
}
