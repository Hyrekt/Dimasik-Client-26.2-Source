package dev.dimasik.client.system;

import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.joml.Vector4i;

public class Class_KFQNWUQzUTuWWSnk extends Class_NO6SuGqq3FB7jQDZ {
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_10153 = this::m_3379;
   private static final String f_10154 = "GPS";
   private static final float f_10155 = 300.0F;
   private static final float f_10156 = 100.0F;
   private static final float f_10157 = 80.0F;
   private static final float f_10158 = 39.0F;
   private static final double f_10159 = 90.0;
   private static final float f_10160 = 39.0F;
   private static final float f_10161 = 30.0F;
   private static final float f_10162 = 20.0F;
   private static final float f_10163 = 7.0F;
   private static final float f_10164 = 10.0F;
   private static final float f_10165 = 12.0F;
   private static final float f_10166 = 6.0F;
   private static final float f_10167 = 5.0F;
   private static final float f_10168 = 55.0F;
   private static final float f_10169 = 0.5F;
   private static final float f_10170 = 0.5F;
   private static final float f_10171 = 0.5F;
   private static final float f_10172 = 0.5F;
   private static final float f_10173 = -1.0F;
   private static final String f_10174 = "hud/arrow";
   private static final float f_10175 = 18.0F;
   private static final float f_10176 = 0.5F;
   private static final float f_10177 = 7.0F;
   private static final float f_10178 = 0.5F;
   private static final float f_10179 = 21.0F;

   public void m_3379(Class_bhRaN0YSSLQRYjPo var1) {
      if (Class_0WrunFUNlRPaOg0e.f_264 && f_11537.player != null) {
         double var2 = Class_0WrunFUNlRPaOg0e.f_265 - f_11537.player.getX();
         double var4 = Class_0WrunFUNlRPaOg0e.f_266 - f_11537.player.getZ();
         float var6 = (float)Math.sqrt(var2 * var2 + var4 * var4);
         float var7 = f_11537.gameRenderer.mainCamera().yRot();
         float var8 = (float)(Math.toDegrees(Math.atan2(var4, var2)) - var7 - f_10159);
         float var9 = f_11537.getWindow().getScreenWidth();
         float var10 = f_11537.getWindow().getScreenHeight();
         String var11 = Math.round(var6) + "";
         String var12 = "" + Math.round(Class_0WrunFUNlRPaOg0e.f_265) + Math.round(Class_0WrunFUNlRPaOg0e.f_266);
         byte var13 = 11;
         byte var14 = 8;
         float var15 = Math.max(
            Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var11, var13),
            Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9590(), var12, var14)
         );
         float var16 = f_10160;
         float var17 = f_10161;
         float var18 = f_10162 + var17 + f_10163 + var15 + f_10164;
         this.m_4012(var18);
         this.m_4007(var16);
         float var19 = this.m_3998();
         float var20 = this.m_3993();
         this.m_4013();

         try {
            Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
            Class_Ssh31B3ljfKeWsvS.m_4848(var19, var20, var18, var16, f_10165);
            float var21 = var19 + f_10166;
            float var22 = var20 + f_10167;
            float var23 = f_10168;
            float var24 = var21 + (var17 - var23) * f_10169;
            float var25 = var22 + (var17 - var23) * f_10170;
            float var26 = var24 + var23 * f_10171;
            float var27 = var25 + var23 * f_10172;
            Matrix4f var28 = Class_Ssh31B3ljfKeWsvS.m_4853();
            float var29 = f_10173 + var26 * 2.0F / var9;
            float var30 = 1.0F - var27 * 2.0F / var10;
            float var31 = var9 / var10;
            var28.translate(var29, var30, 0.0F)
               .scale(1.0F, var31, 1.0F)
               .rotateZ((float)(-Math.toRadians(var8)))
               .scale(1.0F, 1.0F / var31, 1.0F)
               .translate(-var29, -var30, 0.0F);
            Class_U4Qsm43RVlUI3Pre.m_5204(true);
            Class_Ssh31B3ljfKeWsvS.m_4842(var24, var25 - 1.0F, var23, var23, new Vector4f(0.0F), new Vector4i(-1), Class_wHRRCm2tlLY7DN4I.m_9311(f_10174));
            Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
            float var32 = var21 + var17 + f_10175;
            Class_Ssh31B3ljfKeWsvS.m_4866(
               Class_y1y6QpONhWEUIdEB.m_9588(),
               var11,
               var32 + (var15 - Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var11, var13)) * f_10176,
               var20 + f_10177,
               var13,
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT)
            );
            Class_Ssh31B3ljfKeWsvS.m_4866(
               Class_y1y6QpONhWEUIdEB.m_9590(),
               var12,
               var32 + (var15 - Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9590(), var12, var14)) * f_10178,
               var20 + f_10179,
               var14,
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT)
            );
         } finally {
            this.m_4005();
         }

         Class_U4Qsm43RVlUI3Pre.m_5204(false);
      } else {
         this.m_4012(0.0F);
         this.m_4007(0.0F);
      }
   }

   public Class_KFQNWUQzUTuWWSnk() {
      super(f_10154, f_10155, f_10156, f_10157, f_10158);
   }
}
