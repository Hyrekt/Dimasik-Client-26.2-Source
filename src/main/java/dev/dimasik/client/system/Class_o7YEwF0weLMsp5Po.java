package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;

public class Class_o7YEwF0weLMsp5Po extends Class_NO6SuGqq3FB7jQDZ {
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_26012 = this::m_7711;
   private static final String f_26013 = "Coordinates";
   private static final float f_26014 = 41.0F;
   private static final float f_26015 = 92.0F;
   private static final float f_26016 = 100.0F;
   private static final float f_26017 = 100.0F;
   private static final String f_26018 = "Координаты";
   private static final String f_26019 = "$";
   private static final float f_26020 = 16.0F;
   private static final float f_26021 = 28.0F;
   private static final float f_26022 = 14.0F;
   private static final float f_26023 = 35.0F;
   private static final float f_26024 = 12.0F;
   private static final String f_26025 = "$";
   private static final float f_26026 = 10.0F;
   private static final float f_26027 = 8.0F;
   private static final float f_26028 = 18.0F;
   private static final float f_26029 = 8.0F;
   private static final float f_26030 = 33.0F;

   public void m_7711(Class_bhRaN0YSSLQRYjPo var1) {
      if (!DimasikClient.m_9057().m_9049().m_2801().m_3433().m_6177().m_7145(f_26018)) {
         this.m_4012(0.0F);
         this.m_4007(0.0F);
      } else {
         String var2 = "" + (int)f_11537.player.getX() + (int)f_11537.player.getY() + (int)f_11537.player.getZ();
         float var3 = Class_y1y6QpONhWEUIdEB.m_9591().m_7383().m_2157(f_26019, f_26020, 0.0F);
         float var4 = f_26021 + var3 + Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var2, f_26022, 0.0F);
         float var5 = this.m_3998();
         float var6 = this.m_3993();
         this.m_4013();
         Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());

         try {
            Class_U4Qsm43RVlUI3Pre.m_5188(var5, var6 - 1.0F, var4, f_26023, f_26024);
            Class_U4Qsm43RVlUI3Pre.m_5186(Class_y1y6QpONhWEUIdEB.m_9591(), f_26025, var5 + f_26026, var6 + f_26027, 16, Class_oDLvT3Io61u7HRHc.m_7740(3));
            Class_U4Qsm43RVlUI3Pre.m_5186(
               Class_y1y6QpONhWEUIdEB.m_9588(),
               var2,
               var5 + f_26028 + var3,
               var6 + f_26029,
               14,
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT)
            );
         } finally {
            Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());
            this.m_4005();
         }

         this.m_4012(var4);
         this.m_4007(f_26030);
      }
   }

   public Class_o7YEwF0weLMsp5Po() {
      super(f_26013, f_26014, f_26015, f_26016, f_26017);
   }
}
