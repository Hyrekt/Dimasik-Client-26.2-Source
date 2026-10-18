package dev.dimasik.client.ui.screen;

import dev.dimasik.client.module.misc.AutoInventory;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_U4Qsm43RVlUI3Pre;
import dev.dimasik.client.system.Class_eXr9Fra2ad3yFXY8;
import dev.dimasik.client.system.Class_jZQ0pP9BTU3L7miy;
import dev.dimasik.client.system.Class_w8fCJQ5ZtH5lQbWc;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.network.chat.Component;
import org.joml.Matrix4f;
import org.joml.Vector2f;

public final class Screen_3 extends Screen {
   private static final float f_3885 = 425.0F;
   private static final float f_3886 = 800.0F;
   private static final float f_3887 = 504.0F;
   private static final float f_3888 = 1.882353F;
   private static final float f_3889 = 267.75F;
   private static final float f_3890 = 20.0F;
   private static final float f_3891 = 4.0F;
   private static final int f_3892 = 10;
   private final AutoInventory f_3893;
   private final Class_w8fCJQ5ZtH5lQbWc f_3894;
   private final List<Screen_3.VggJ55i16rnEKn7Q> f_3895;
   private AutoInventory.GRHIGyJL5StNlDi5 f_3896;
   private AutoInventory.GRHIGyJL5StNlDi5 f_3897;
   private float f_3898;
   private float f_3899;
   private float f_3900;
   private float f_3901;
   private float f_3902;
   private float f_3903;
   private float f_3904;
   private float f_3905;
   private float f_3906;
   private Screen_3.lcdOjG5vSyNNdWIE f_3907;
   private Screen_3.lcdOjG5vSyNNdWIE f_3908;
   private Screen_3.lcdOjG5vSyNNdWIE f_3909;
   private static final String f_3910 = "Collector";
   private static final float f_3911 = 7.0F;
   private static final float f_3912 = 255.0F;
   private static final float f_3913 = 800.0F;
   private static final float f_3914 = 0.5F;
   private static final float f_3915 = 504.0F;
   private static final float f_3916 = 0.5F;
   private static final float f_3917 = 425.0F;
   private static final float f_3918 = 0.5F;
   private static final float f_3919 = 267.75F;
   private static final float f_3920 = 0.5F;
   private static final float f_3921 = 1.882353F;
   private static final float f_3922 = 0.85F;
   private static final float f_3923 = 0.15F;
   private static final float f_3924 = 14.0F;
   private static final float f_3925 = 133.875F;
   private static final float f_3926 = 0.22F;
   private static final float f_3927 = 800.0F;
   private static final float f_3928 = 504.0F;
   private static final float f_3929 = 20.0F;
   private static final float f_3930 = 425.0F;
   private static final float f_3931 = 267.75F;
   private static final float f_3932 = 425.0F;
   private static final float f_3933 = 267.75F;
   private static final float f_3934 = 8.0F;
   private static final String f_3935 = "S";
   private static final float f_3936 = 8.5F;
   private static final String f_3937 = "F";
   private static final float f_3938 = 8.5F;
   private static final float f_3939 = 36.0F;
   private static final float f_3940 = 425.0F;
   private static final float f_3941 = 0.5F;
   private static final String f_3942 = "P";
   private static final float f_3943 = 10.0F;
   private static final float f_3944 = 14.0F;
   private static final float f_3945 = 27.0F;
   private static final float f_3946 = 4.0F;
   private static final float f_3947 = 0.75F;
   private static final float f_3948 = 8.0F;
   private static final double f_3949 = 25.0;
   private static final String f_3950 = "dimasik client";
   private static final float f_3951 = 35.0F;
   private static final float f_3952 = 3.5F;
   private static final float f_3953 = 8.75F;
   private static final float f_3954 = 12.0F;
   private static final float f_3955 = 0.5F;
   private static final float f_3956 = 3.0F;
   private static final float f_3957 = 16.0F;
   private static final float f_3958 = 6.0F;
   private static final float f_3959 = 0.5F;
   private static final float f_3960 = 425.0F;
   private static final float f_3961 = 20.0F;
   private static final String f_3962 = "collector section";
   private static final float f_3963 = 16.0F;
   private static final float f_3964 = 6.75F;
   private static final float f_3965 = 4.5F;
   private static final float f_3966 = 6.75F;
   private static final float f_3967 = 32.0F;
   private static final float f_3968 = 223.75F;
   private static final float f_3969 = 8.0F;
   private static final double f_3970 = 10.0;
   private static final float f_3971 = 24.0F;
   private static final float f_3972 = 4.0F;
   private static final float f_3973 = 212.5F;
   private static final float f_3974 = 425.0F;
   private static final float f_3975 = 24.0F;
   private static final float f_3976 = 24.0F;
   private static final float f_3977 = 20.0F;
   private static final double f_3978 = 20.0;
   private static final double f_3979 = 20.0;
   private static final float f_3980 = 0.024F;
   private static final float f_3981 = 0.012F;
   private static final float f_3982 = 20.0F;
   private static final float f_3983 = 20.0F;
   private static final float f_3984 = 4.0F;
   private static final float f_3985 = 2.5F;
   private static final float f_3986 = 2.5F;
   private static final float f_3987 = 15.0F;
   private static final float f_3988 = 15.0F;
   private static final float f_3989 = 20.0F;
   private static final float f_3990 = 6.5F;
   private static final float f_3991 = 20.0F;
   private static final float f_3992 = 8.0F;
   private static final float f_3993 = 6.5F;
   private static final float f_3994 = 0.35F;
   private static final float f_3995 = 20.0F;
   private static final float f_3996 = 20.0F;
   private static final float f_3997 = 260.0F;
   private static final float f_3998 = 42.0F;
   private static final float f_3999 = 8.0F;
   private static final float f_4000 = 12.0F;
   private static final float f_4001 = 12.0F;
   private static final float f_4002 = 129.0F;
   private static final float f_4003 = 38.0F;
   private static final float f_4004 = 6.0F;
   private static final float f_4005 = 20.0F;
   private static final float f_4006 = 7.5F;
   private static final float f_4007 = 20.0F;
   private static final float f_4008 = 5.5F;
   private static final float f_4009 = 7.5F;
   private static final float f_4010 = 4.25F;
   private static final float f_4011 = 4.25F;
   private static final float f_4012 = 14.0F;
   private static final float f_4013 = 8.5F;
   private static final float f_4014 = 5.0F;
   private static final float f_4015 = 16.0F;
   private static final float f_4016 = 10.0F;
   private static final float f_4017 = 16.0F;
   private static final float f_4018 = 5.0F;
   private static final float f_4019 = 16.0F;
   private static final float f_4020 = 10.0F;
   private static final String f_4021 = "−";
   private static final float f_4022 = 4.0F;
   private static final float f_4023 = 5.5F;
   private static final float f_4024 = 11.0F;
   private static final float f_4025 = 16.0F;
   private static final float f_4026 = 6.75F;
   private static final float f_4027 = 0.5F;
   private static final float f_4028 = 3.4F;
   private static final float f_4029 = 6.75F;
   private static final String f_4030 = "+";
   private static final float f_4031 = 26.0F;
   private static final float f_4032 = 7.5F;
   private static final float f_4033 = 11.0F;
   private static final float f_4034 = 0.18F;
   private static final float f_4035 = 14.0F;
   private static final float f_4036 = 8.5F;
   private static final float f_4037 = 3.25F;
   private static final float f_4038 = 14.0F;
   private static final float f_4039 = 8.5F;
   private static final float f_4040 = 0.3F;
   private static final float f_4041 = 3.25F;
   private static final float f_4042 = 0.22F;
   private static final float f_4043 = 1.5F;
   private static final float f_4044 = 5.5F;
   private static final float f_4045 = 1.5F;
   private static final float f_4046 = 5.5F;
   private static final float f_4047 = 5.5F;
   private static final float f_4048 = 1.75F;
   private static final float f_4049 = 8.0F;
   private static final float f_4050 = 32.0F;
   private static final double f_4051 = 236.0;
   private static final double f_4052 = 223.75;
   private static final float f_4053 = 15.0F;
   private static final float f_4054 = 212.5F;

   private boolean contains(Screen_3.lcdOjG5vSyNNdWIE var1, Vector2f var2) {
      return var1 != null && var1.contains(var2.x, var2.y);
   }

   public boolean isPauseScreen() {
      return false;
   }

   private void icon(String var1, float var2, float var3, float var4, int var5) {
      Class_U4Qsm43RVlUI3Pre.m_5186(Class_y1y6QpONhWEUIdEB.m_9591(), var1, var2, var3, (int)var4, var5);
   }

   private String fit(String var1, float var2, float var3) {
      if (this.width(Class_y1y6QpONhWEUIdEB.m_9590(), var1, var3) <= var2) {
         return var1;
      }

      String var4 = var1;

      while (var4.length() > 1 && this.width(Class_y1y6QpONhWEUIdEB.m_9590(), var4 + "", var3) > var2) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      return var4 + "";
   }

   private boolean inside(double var1, double var3, double var5, double var7, double var9, double var11) {
      return var1 >= var5 && var1 <= var5 + var9 && var3 >= var7 && var3 <= var7 + var11;
   }

   public Screen_3(AutoInventory var1) {
      super(Component.literal(f_3910));
      this.f_3894 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_3911, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_3895 = new ArrayList<>();
      this.f_3902 = 1.0F;
      this.f_3893 = var1;
   }

   protected void extractBlurredBackground(GuiGraphicsExtractor var1) {
   }

   public void clearFocus() {
   }

   private Vector2f logicalMouse(float var1, float var2) {
      float var3 = this.f_3898 + f_4054;
      return new Vector2f(var3 + (var1 - var3) / this.f_3902, this.f_3903 + (var2 - this.f_3903) / this.f_3902);
   }

   public boolean mouseScrolled(double var1, double var3, double var5, double var7) {
      Vector2f var9 = Class_FvJXUGWpZo3zYBW4.m_2693(var1, var3);
      Vector2f var10 = this.logicalMouse(var9.x, var9.y);
      if (this.inside(var10.x, var10.y, this.f_3898 + f_4049, this.f_3899 + f_4050, f_4051, f_4052)) {
         this.f_3905 = Math.clamp(this.f_3905 + (float)var7 * f_4053, this.f_3906, 0.0F);
      }

      return true;
   }

   private void drawHeader() {
      float var1 = this.f_3899 + f_3934;
      float var2 = this.iconWidth(f_3935, f_3936);
      float var3 = this.iconWidth(f_3937, f_3938);
      float var4 = var2 + var3 + f_3939;
      float var5 = this.f_3898 + (f_3940 - var4) * f_3941;
      this.icon(f_3942, this.f_3898 + f_3943, var1, f_3944, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN));
      Class_U4Qsm43RVlUI3Pre.m_5199(this.f_3898 + f_3945, var1 + f_3946, f_3947, f_3948, 0.0F, Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_3949));
      this.text(
         Class_y1y6QpONhWEUIdEB.m_9590(),
         f_3950,
         this.f_3898 + f_3951,
         var1 + f_3952,
         f_3953,
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT)
      );
      float var6 = var5 + f_3954;
      float var7 = var6 + var2 * f_3955;
      Class_U4Qsm43RVlUI3Pre.m_5199(var7 - f_3956, var1 + f_3957, f_3958, f_3959, 0.0F, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN));
      float var8 = this.f_3898 + f_3960 - f_3961;
      String var9 = f_3962;
      this.text(
         Class_y1y6QpONhWEUIdEB.m_9590(),
         var9,
         var8 + f_3963 - this.width(Class_y1y6QpONhWEUIdEB.m_9590(), var9, f_3964),
         var1 + f_3965,
         f_3966,
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT)
      );
   }

   private void toggle(float var1, float var2, boolean var3) {
      int var4 = Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT), f_4034);
      Class_U4Qsm43RVlUI3Pre.m_5199(var1, var2, f_4035, f_4036, f_4037, var3 ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : var4);
      Class_U4Qsm43RVlUI3Pre.m_5187(
         var1,
         var2,
         f_4038,
         f_4039,
         f_4040,
         f_4041,
         Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT), f_4042)
      );
      Class_U4Qsm43RVlUI3Pre.m_5199(
         var1 + f_4043 + (var3 ? f_4044 : 0.0F),
         var2 + f_4045,
         f_4046,
         f_4047,
         f_4048,
         var3 ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT) : Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT)
      );
   }

   private void drawSettings() {
      this.f_3907 = this.f_3908 = this.f_3909 = null;
      if (this.f_3896 != null) {
         float var1 = this.f_3898 + f_3997;
         float var2 = this.f_3899 + f_3998;
         Class_U4Qsm43RVlUI3Pre.m_5222(var1, var2 - f_3999, f_4000, f_4001, this.f_3896.m_4167(), false);
         float var3 = var1 + f_4002;
         float var4 = var3 - f_4003;
         String var5 = this.fit(this.f_3896.m_4168(), var4 - f_4004 - (var1 + f_4005), f_4006);
         this.text(
            Class_y1y6QpONhWEUIdEB.m_9590(),
            var5,
            var1 + f_4007,
            var2 - f_4008,
            f_4009,
            this.f_3896.m_4169()
               ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT)
               : Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT)
         );
         this.toggle(var3, var2 - f_4010, this.f_3896.m_4169());
         this.f_3907 = new Screen_3.lcdOjG5vSyNNdWIE(var3, var2 - f_4011, f_4012, f_4013);
         this.f_3908 = new Screen_3.lcdOjG5vSyNNdWIE(var4, var2 - f_4014, f_4015, f_4016);
         this.f_3909 = new Screen_3.lcdOjG5vSyNNdWIE(var4 + f_4017, var2 - f_4018, f_4019, f_4020);
         this.text(
            Class_y1y6QpONhWEUIdEB.m_9590(),
            f_4021,
            var4 + f_4022,
            var2 - f_4023,
            f_4024,
            Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT)
         );
         String var6 = String.valueOf(this.f_3896.m_4164());
         this.text(
            Class_y1y6QpONhWEUIdEB.m_9590(),
            var6,
            var4 + f_4025 - this.width(Class_y1y6QpONhWEUIdEB.m_9590(), var6, f_4026) * f_4027,
            var2 - f_4028,
            f_4029,
            this.f_3896.m_4169()
               ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT)
               : Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT)
         );
         this.text(
            Class_y1y6QpONhWEUIdEB.m_9590(),
            f_4030,
            var4 + f_4031,
            var2 - f_4032,
            f_4033,
            Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT)
         );
      }
   }

   public void onClose() {
      if (this.f_3893.m_4227() > 0 && !this.f_3893.m_4180()) {
         this.f_3893.m_4217();
      }

      super.onClose();
   }

   private float iconWidth(String var1, float var2) {
      return Class_y1y6QpONhWEUIdEB.m_9591().m_7383().m_2157(var1, var2, 0.0F);
   }

   private float width(Class_jZQ0pP9BTU3L7miy var1, String var2, float var3) {
      return var1.m_7383().m_2157(var2, var3, 0.0F);
   }

   private void drawGrid(List<AutoInventory.GRHIGyJL5StNlDi5> var1, float var2, float var3) {
      float var4 = this.f_3899 + f_3967;
      float var5 = f_3968;
      float var6 = this.f_3898 + f_3969;
      float var7 = (float)Math.ceil(var1.size() / f_3970);
      float var8 = Math.max(0.0F, var7 * f_3971 - f_3972);
      this.f_3906 = Math.min(0.0F, var5 - var8);
      this.f_3905 = Math.clamp(this.f_3905, this.f_3906, 0.0F);
      this.f_3904 = Math.clamp(this.f_3904, this.f_3906, 0.0F);
      this.f_3897 = null;
      this.f_3895.clear();
      float var9 = this.f_3898 + f_3973;
      Class_Ssh31B3ljfKeWsvS.m_4860(
         var9 + (this.f_3898 - var9) * this.f_3902, this.f_3903 + (var4 - this.f_3903) * this.f_3902, f_3974 * this.f_3902, var5 * this.f_3902
      );

      for (int var10 = 0; var10 < var1.size(); var10++) {
         AutoInventory.GRHIGyJL5StNlDi5 var11 = (AutoInventory.GRHIGyJL5StNlDi5)var1.get(var10);
         float var12 = var6 + var10 % 10 * f_3975;
         float var13 = var4 + var10 / 10 * f_3976 + this.f_3904;
         if (!(var13 + f_3977 < var4) && !(var13 > var4 + var5)) {
            boolean var14 = this.inside(var2, var3, var12, var13, f_3978, f_3979);
            if (var14) {
               this.f_3897 = var11;
            }

            float var15 = var11 == this.f_3896 ? f_3980 : (var14 ? f_3981 : 0.0F);
            if (var15 > 0.0F) {
               Class_U4Qsm43RVlUI3Pre.m_5199(
                  var12, var13, f_3982, f_3983, f_3984, Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT), var15)
               );
            }

            Class_U4Qsm43RVlUI3Pre.m_5222(var12 + f_3985, var13 + f_3986, f_3987, f_3988, var11.m_4167(), false);
            if (var11.m_4164() > 1) {
               String var16 = String.valueOf(var11.m_4164());
               this.text(
                  Class_y1y6QpONhWEUIdEB.m_9590(),
                  var16,
                  var12 + f_3989 - 2.0F - this.width(Class_y1y6QpONhWEUIdEB.m_9590(), var16, f_3990),
                  var13 + f_3991 - f_3992,
                  f_3993,
                  var11.m_4169()
                     ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT)
                     : Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT), f_3994)
               );
            }

            this.f_3895.add(new Screen_3.VggJ55i16rnEKn7Q(new Screen_3.lcdOjG5vSyNNdWIE(var12, var13, f_3995, f_3996), var11));
         }
      }

      Class_Ssh31B3ljfKeWsvS.m_4828();
   }

   private void text(Class_jZQ0pP9BTU3L7miy var1, String var2, float var3, float var4, float var5, int var6) {
      Class_U4Qsm43RVlUI3Pre.m_5186(var1, var2, var3, var4, (int)var5, var6);
   }

   public void extractRenderState(GuiGraphicsExtractor var1, int var2, int var3, float var4) {
      Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
      Class_Ssh31B3ljfKeWsvS.m_4830();
      this.f_3894.m_9283(1.0F);
      float var5 = Math.clamp(this.f_3894.m_9288(), 0.0F, 1.0F);
      Class_Ssh31B3ljfKeWsvS.m_4864(f_3912 * var5);
      this.f_3900 = (this.minecraft.getWindow().getScreenWidth() - f_3913) * f_3914;
      this.f_3901 = (this.minecraft.getWindow().getScreenHeight() - f_3915) * f_3916;
      this.f_3898 = (this.minecraft.getWindow().getScreenWidth() - f_3917) * f_3918;
      this.f_3899 = (this.minecraft.getWindow().getScreenHeight() - f_3919) * f_3920;
      this.f_3902 = f_3921 * (f_3922 + var5 * f_3923);
      float var6 = this.f_3899 + (1.0F - var5) * f_3924;
      this.f_3903 = var6 + f_3925;
      Vector2f var7 = Class_FvJXUGWpZo3zYBW4.m_2693(var2, var3);
      Vector2f var8 = this.logicalMouse(var7.x, var7.y);
      List var9 = this.f_3893.m_4212();
      if (this.f_3896 == null && !var9.isEmpty()) {
         this.f_3896 = (AutoInventory.GRHIGyJL5StNlDi5)var9.getFirst();
      }

      this.f_3904 = this.f_3904 + (this.f_3905 - this.f_3904) * f_3926;
      Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9590(), Class_y1y6QpONhWEUIdEB.m_9591());
      Class_U4Qsm43RVlUI3Pre.m_5188(this.f_3900, this.f_3901, f_3927, f_3928, f_3929);
      Class_FvJXUGWpZo3zYBW4.m_2692(this.f_3898, var6, f_3930, f_3931, this.f_3902);
      this.drawHeader();
      this.drawGrid(var9, var8.x, var8.y);
      this.drawSettings();
      Class_FvJXUGWpZo3zYBW4.m_2694(this.f_3898, var6, f_3932, f_3933, this.f_3902);
      Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9590(), Class_y1y6QpONhWEUIdEB.m_9591());
      Class_Ssh31B3ljfKeWsvS.m_4844();
   }

   public boolean mouseClicked(MouseButtonEvent var1, boolean var2) {
      Vector2f var3 = Class_FvJXUGWpZo3zYBW4.m_2693(var1.x(), var1.y());
      Vector2f var4 = this.logicalMouse(var3.x, var3.y);
      if (var1.button() == 0) {
         if (this.contains(this.f_3907, var4)) {
            this.f_3896.m_4163(!this.f_3896.m_4169());
            return true;
         }

         if (this.contains(this.f_3908, var4)) {
            this.f_3896.m_4170(this.f_3896.m_4164() - 1);
            return true;
         }

         if (this.contains(this.f_3909, var4)) {
            this.f_3896.m_4170(this.f_3896.m_4164() + 1);
            return true;
         }

         for (Screen_3.VggJ55i16rnEKn7Q var6 : this.f_3895) {
            if (var6.bounds.contains(var4.x, var4.y)) {
               this.f_3896 = var6.entry;
               return true;
            }
         }
      }

      if (var1.button() == 1 && this.f_3897 != null) {
         this.f_3897.m_4163(!this.f_3897.m_4169());
         return true;
      } else {
         return true;
      }
   }

   private record VggJ55i16rnEKn7Q(Screen_3.lcdOjG5vSyNNdWIE bounds, AutoInventory.GRHIGyJL5StNlDi5 entry) {
   }

   private record lcdOjG5vSyNNdWIE(float x, float y, float width, float height) {
      public boolean contains(float var1, float var2) {
         return var1 >= this.x && var1 <= this.x + this.width && var2 >= this.y && var2 <= this.y + this.height;
      }
   }
}
