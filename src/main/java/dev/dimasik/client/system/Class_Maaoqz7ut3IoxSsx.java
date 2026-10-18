package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.movement.Timer;
import net.minecraft.util.Mth;

public class Class_Maaoqz7ut3IoxSsx extends Class_NO6SuGqq3FB7jQDZ {
   private static final float f_11268 = 35.0F;
   private static final float f_11269 = 13.5F;
   private final Class_w8fCJQ5ZtH5lQbWc f_11270;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_11271;
   private static final String f_11272 = "Timer";
   private static final float f_11273 = 65.0F;
   private static final float f_11274 = 427.0F;
   private static final float f_11275 = 100.0F;
   private static final float f_11276 = 33.0F;
   private static final float f_11277 = 18.0F;
   private static final String f_11278 = "Таймер";
   private static final String f_11279 = "T";
   private static final float f_11280 = 16.0F;
   private static final float f_11281 = 14.0F;
   private static final float f_11282 = 28.0F;
   private static final float f_11283 = 22.0F;
   private static final float f_11284 = 35.0F;
   private static final float f_11285 = 12.0F;
   private static final String f_11286 = "T";
   private static final float f_11287 = 10.0F;
   private static final float f_11288 = 8.0F;
   private static final float f_11289 = 18.0F;
   private static final float f_11290 = 8.0F;
   private static final float f_11291 = 17.0F;
   private static final float f_11292 = 14.5F;
   private static final float f_11293 = 5.75F;
   private static final float f_11294 = 5.75F;
   private static final float f_11295 = 13.5F;
   private static final float f_11296 = 1.65F;
   private static final float f_11297 = 0.28F;
   private static final float f_11298 = 0.001F;
   private static final float f_11299 = 5.75F;
   private static final float f_11300 = 5.75F;
   private static final float f_11301 = 13.5F;
   private static final float f_11302 = 1.65F;
   private static final float f_11303 = 33.0F;

   public void m_3948(Class_bhRaN0YSSLQRYjPo var1) {
      if (!DimasikClient.m_9057().m_9049().m_2801().m_3433().m_6177().m_7145(f_11278)) {
         this.m_4012(0.0F);
         this.m_4007(0.0F);
      } else {
         float var2 = Mth.clamp(Timer.f_20820 / Timer.f_20819, 0.0F, 1.0F);
         this.f_11270.m_9283(var2);
         String var3 = (int)Timer.f_20820 + "";
         float var4 = Class_y1y6QpONhWEUIdEB.m_9591().m_7383().m_2157(f_11279, f_11280, 0.0F);
         float var5 = Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var3, f_11281, 0.0F);
         float var6 = f_11282 + var4 + var5 + f_11283;
         float var7 = this.m_3998();
         float var8 = this.m_3993();
         this.m_4013();
         Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9591(), Class_y1y6QpONhWEUIdEB.m_9588());

         try {
            Class_U4Qsm43RVlUI3Pre.m_5185(var7, var8 - 1.0F, var6, f_11284, f_11285);
            int var9 = Class_oDLvT3Io61u7HRHc.m_7740(9);
            int var10 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT);
            int var11 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT);
            Class_U4Qsm43RVlUI3Pre.m_5186(Class_y1y6QpONhWEUIdEB.m_9591(), f_11286, var7 + f_11287, var8 + f_11288, 16, var9);
            Class_U4Qsm43RVlUI3Pre.m_5186(Class_y1y6QpONhWEUIdEB.m_9588(), var3, var7 + f_11289 + var4, var8 + f_11290, 14, var10);
            float var12 = var7 + var6 - f_11291;
            float var13 = var8 + f_11292;
            float var14 = this.f_11270.m_9288();
            Class_U4Qsm43RVlUI3Pre.m_5191(var12 - f_11293, var13 - f_11294, f_11295, f_11296, 1.0F, Class_BftdentXEtGbugJw.m_2306(var11, f_11297));
            if (var14 > f_11298) {
               Class_U4Qsm43RVlUI3Pre.m_5191(
                  var12 - f_11299, var13 - f_11300, f_11301, f_11302, var14, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN)
               );
            }
         } finally {
            Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9591(), Class_y1y6QpONhWEUIdEB.m_9588());
            this.m_4005();
         }

         this.m_4012(var6);
         this.m_4007(f_11303);
      }
   }

   public Class_Maaoqz7ut3IoxSsx() {
      super(f_11272, f_11273, f_11274, f_11275, f_11276);
      this.f_11270 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_11277);
      this.f_11271 = this::m_3948;
   }
}
