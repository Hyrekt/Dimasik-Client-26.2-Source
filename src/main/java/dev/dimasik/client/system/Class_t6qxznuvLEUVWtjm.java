package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;

public class Class_t6qxznuvLEUVWtjm extends Class_NO6SuGqq3FB7jQDZ {
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_31526 = this::m_8784;
   private static final String f_31527 = "Speed";
   private static final float f_31528 = 40.0F;
   private static final float f_31529 = 133.0F;
   private static final float f_31530 = 100.0F;
   private static final float f_31531 = 100.0F;
   private static final String f_31532 = "Скорость";
   private static final String f_31533 = "c";
   private static final float f_31534 = 16.0F;
   private static final float f_31535 = 28.0F;
   private static final float f_31536 = 14.0F;
   private static final float f_31537 = 35.0F;
   private static final float f_31538 = 12.0F;
   private static final String f_31539 = "c";
   private static final float f_31540 = 10.0F;
   private static final float f_31541 = 8.0F;
   private static final float f_31542 = 18.0F;
   private static final float f_31543 = 8.0F;
   private static final float f_31544 = 33.0F;

   public Class_t6qxznuvLEUVWtjm() {
      super(f_31527, f_31528, f_31529, f_31530, f_31531);
   }

   public void m_8784(Class_bhRaN0YSSLQRYjPo var1) {
      if (!DimasikClient.m_9057().m_9049().m_2801().m_3433().m_6177().m_7145(f_31532)) {
         this.m_4012(0.0F);
         this.m_4007(0.0F);
      } else {
         String var2 = Class_izWUmV9vkI9fgiey.m_7350() + "";
         float var3 = Class_y1y6QpONhWEUIdEB.m_9591().m_7383().m_2157(f_31533, f_31534, 0.0F);
         float var4 = f_31535 + var3 + Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var2, f_31536, 0.0F);
         float var5 = this.m_3998();
         float var6 = this.m_3993();
         this.m_4013();
         Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());

         try {
            Class_U4Qsm43RVlUI3Pre.m_5188(var5, var6 - 1.0F, var4, f_31537, f_31538);
            Class_U4Qsm43RVlUI3Pre.m_5186(Class_y1y6QpONhWEUIdEB.m_9591(), f_31539, var5 + f_31540, var6 + f_31541, 16, Class_oDLvT3Io61u7HRHc.m_7740(11));
            Class_U4Qsm43RVlUI3Pre.m_5186(
               Class_y1y6QpONhWEUIdEB.m_9588(),
               var2,
               var5 + f_31542 + var3,
               var6 + f_31543,
               14,
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT)
            );
         } finally {
            Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());
            this.m_4005();
         }

         this.m_4012(var4);
         this.m_4007(f_31544);
      }
   }
}
