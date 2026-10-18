package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.render.ClickGui;
import dev.dimasik.client.module.render.Hud;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import org.joml.Matrix4f;
import org.joml.Vector4i;

public final class Class_oDLvT3Io61u7HRHc {
   private static final List<Class_oDLvT3Io61u7HRHc.OXcmwYnAI8fVi1QP> f_26172 = new ArrayList<>();
   private static final float f_26173 = 8.0F;
   private static final float f_26174 = 8.0F;
   private static final float f_26175 = 0.5F;
   private static final float f_26176 = 18.0F;
   private static final float f_26177 = 22.0F;
   private static final double f_26178 = 255.0;
   private static final float f_26179 = 8.0F;
   private static final float f_26180 = 8.0F;
   private static final float f_26181 = 0.5F;
   private static final float f_26182 = 14.0F;
   private static final float f_26183 = 1.6F;
   private static final float f_26184 = 22.0F;
   private static final double f_26185 = 255.0;
   private static final float f_26186 = 8.0F;
   private static final float f_26187 = 8.0F;
   private static final float f_26188 = 16.0F;
   private static final float f_26189 = 1.2F;
   private static final float f_26190 = 0.55F;
   private static final float f_26191 = 22.0F;
   private static final double f_26192 = 255.0;
   private static final float f_26193 = 8.0F;
   private static final float f_26194 = 8.0F;
   private static final float f_26195 = 8.0F;
   private static final float f_26196 = 8.0F;
   private static final float f_26197 = 4.0F;
   private static final float f_26198 = 4.0F;
   private static final float f_26199 = 0.01F;
   private static final float f_26200 = 255.0F;
   private static final float f_26201 = 165.0F;
   private static final float f_26202 = 130.0F;
   private static final String f_26203 = "This is a utility class and cannot be instantiated";

   public static void m_7737() {
      f_26172.clear();
   }

   public static void m_7738(float var0, float var1, float var2, float var3, float var4) {
      if (!(var2 <= 0.0F) && !(var3 <= 0.0F) && !(Class_Ssh31B3ljfKeWsvS.m_4821() <= 0.0F)) {
         ClickGui var5 = DimasikClient.m_9057().m_9049().m_2801().m_3442();
         if (var5 != null && var5.m_8279()) {
            f_26172.add(
               new Class_oDLvT3Io61u7HRHc.OXcmwYnAI8fVi1QP(
                  var0, var1, var2, var3, var4, new Matrix4f(Class_Ssh31B3ljfKeWsvS.m_4853()), Class_Ssh31B3ljfKeWsvS.m_4821()
               )
            );
         }
      }
   }

   public static void m_7739() {
      if (!f_26172.isEmpty()) {
         Matrix4f var0 = new Matrix4f(Class_Ssh31B3ljfKeWsvS.m_4853());
         float var1 = Class_Ssh31B3ljfKeWsvS.m_4821();

         try {
            if (!f_26172.isEmpty()) {
               for (Class_oDLvT3Io61u7HRHc.OXcmwYnAI8fVi1QP var3 : f_26172) {
                  Class_Ssh31B3ljfKeWsvS.m_4814(var3.matrix);
                  Class_Ssh31B3ljfKeWsvS.m_4864(var3.alpha);
                  m_7741(var3.x, var3.y, var3.w, var3.h, var3.round);
               }

               f_26172.clear();
            }
         } finally {
            Class_Ssh31B3ljfKeWsvS.m_4814(var0);
            Class_Ssh31B3ljfKeWsvS.m_4864(var1);
         }
      }
   }

   public static int m_7740(int var0) {
      return Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
   }

   public static void m_7741(float var0, float var1, float var2, float var3, float var4) {
      try {
         ClickGui var5 = DimasikClient.m_9057().m_9049().m_2801().m_3442();
         if (var5 == null) {
            return;
         }

         var5.m_8282(var0, var1, var2, var3, var4);
      } catch (Throwable var6) {
      }
   }

   public static void m_7742(float var0, float var1, float var2, float var3, float var4, boolean var5) {
      int var6 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_BACKGROUND);
      if (var5) {
         Class_U4Qsm43RVlUI3Pre.m_5199(var0, var1, var2, var3, var4, var6);
         m_7751(var0, var1, var2, var3, var4);
      } else {
         Class_Ssh31B3ljfKeWsvS.m_4817(var0, var1, var2, var3, var4, var6);
         m_7741(var0, var1, var2, var3, var4);
      }
   }

   public static boolean m_7743() {
      try {
         Hud var0 = DimasikClient.m_9057().m_9049().m_2801().m_3433();
         return var0 != null && var0.m_6162().m_8768();
      } catch (Throwable var1) {
         return false;
      }
   }

   public static void m_7744(float var0, float var1, float var2, float var3, float var4) {
      if (!(var2 < f_26186) && !(var3 < f_26187)) {
         Class_Ssh31B3ljfKeWsvS.m_4859(
            var0,
            var1,
            var2,
            var3,
            Math.max(f_26188, var4 * f_26189),
            Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SHADOW), f_26190)
         );
         Class_Ssh31B3ljfKeWsvS.m_4858(var0, var1, var2, var3, f_26191, var4, Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_26192));
         Class_Ssh31B3ljfKeWsvS.m_4843(var0, var1, var2, var3, var4, m_7745(Class_y3cvEHXTSEF5dp8q.BACKGROUND));
         Class_Ssh31B3ljfKeWsvS.m_4854(var0, var1, var2, var3, 1.0F, var4, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE));
      }
   }

   public static Vector4i m_7745(Class_y3cvEHXTSEF5dp8q var0) {
      return m_7750(var0, 185, 165);
   }

   @Generated
   private Class_oDLvT3Io61u7HRHc() {
      throw new UnsupportedOperationException(f_26203);
   }

   public static void m_7746(float var0, float var1, float var2, float var3, float var4) {
      if (!(var2 < f_26193) && !(var3 < f_26194)) {
         Class_Ssh31B3ljfKeWsvS.m_4843(var0, var1, var2, var3, var4, m_7750(Class_y3cvEHXTSEF5dp8q.BACKGROUND, 160, 135));
         Class_Ssh31B3ljfKeWsvS.m_4854(var0, var1, var2, var3, 1.0F, var4, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE));
      }
   }

   public static void m_7747(float var0, float var1, float var2, float var3, float var4) {
      if (!(var2 < f_26179) && !(var3 < f_26180)) {
         int var5 = Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SHADOW), f_26181);
         Class_Ssh31B3ljfKeWsvS.m_4859(var0, var1, var2, var3, Math.max(f_26182, var4 * f_26183), var5);
         Class_Ssh31B3ljfKeWsvS.m_4858(var0, var1, var2, var3, f_26184, var4, Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_26185));
         Class_Ssh31B3ljfKeWsvS.m_4843(var0, var1, var2, var3, var4, m_7745(Class_y3cvEHXTSEF5dp8q.WINDOW_BACKGROUND));
         m_7741(var0, var1, var2, var3, var4);
      }
   }

   public static void m_7748(float var0, float var1, float var2, float var3, float var4, float var5) {
      if (!(var2 < f_26197) && !(var3 < f_26198) && !(var5 <= f_26199)) {
         float var6 = Class_Ssh31B3ljfKeWsvS.m_4821() / f_26200 * Math.clamp(var5, 0.0F, 1.0F);
         int var7 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SELECTED);
         int var8 = Class_BftdentXEtGbugJw.m_2309(var7);
         int var9 = Class_BftdentXEtGbugJw.m_2299(var7);
         int var10 = Class_BftdentXEtGbugJw.m_2308(var7);
         int var11 = Class_BftdentXEtGbugJw.m_2303(Math.min(255, var8 + 14), Math.min(255, var9 + 14), Math.min(255, var10 + 14), (int)(f_26201 * var6));
         int var12 = Class_BftdentXEtGbugJw.m_2303(var8, var9, var10, (int)(f_26202 * var6));
         Class_Ssh31B3ljfKeWsvS.m_4843(var0, var1, var2, var3, var4, new Vector4i(var11, var11, var12, var12));
      }
   }

   public static void m_7749(float var0, float var1, float var2, float var3, float var4) {
      if (!(var2 < f_26195) && !(var3 < f_26196)) {
         if (m_7743()) {
            Class_Ssh31B3ljfKeWsvS.m_4843(var0, var1, var2, var3, var4, m_7745(Class_y3cvEHXTSEF5dp8q.WINDOW_BACKGROUND));
            Class_Ssh31B3ljfKeWsvS.m_4854(var0, var1, var2, var3, 1.0F, var4, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE));
         } else {
            Class_Ssh31B3ljfKeWsvS.m_4817(var0, var1, var2, var3, var4, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_BACKGROUND));
         }
      }
   }

   private static Vector4i m_7750(Class_y3cvEHXTSEF5dp8q var0, int var1, int var2) {
      int var3 = Class_LsNSRvPKh5AwfAUe.m_3820(var0);
      int var4 = Class_BftdentXEtGbugJw.m_2309(var3);
      int var5 = Class_BftdentXEtGbugJw.m_2299(var3);
      int var6 = Class_BftdentXEtGbugJw.m_2308(var3);
      int var7 = Class_BftdentXEtGbugJw.m_2303(Math.min(255, var4 + 12), Math.min(255, var5 + 12), Math.min(255, var6 + 12), var1);
      int var8 = Class_BftdentXEtGbugJw.m_2303(var4, var5, var6, var2);
      return new Vector4i(var7, var7, var8, var8);
   }

   private static void m_7751(float var0, float var1, float var2, float var3, float var4) {
      m_7738(var0, var1, var2, var3, var4);
   }

   public static void m_7752(float var0, float var1, float var2, float var3, float var4) {
      if (!(var2 < f_26173) && !(var3 < f_26174)) {
         int var5 = Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SHADOW), f_26175);
         Class_U4Qsm43RVlUI3Pre.m_5211(var0, var1, var2, var3, f_26176, var5);
         Class_U4Qsm43RVlUI3Pre.m_5219(var0, var1, var2, var3, f_26177, var4, Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_26178));
         Class_U4Qsm43RVlUI3Pre.m_5198(var0, var1, var2, var3, var4, m_7745(Class_y3cvEHXTSEF5dp8q.WINDOW_BACKGROUND));
         m_7751(var0, var1, var2, var3, var4);
      }
   }

   private record OXcmwYnAI8fVi1QP(float x, float y, float w, float h, float round, Matrix4f matrix, float alpha) {
      public float m_7735() {
         return this.h;
      }

      public float m_7736() {
         return this.w;
      }
   }
}
