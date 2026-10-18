package dev.dimasik.client.system;

import dev.dimasik.client.module.misc.ClientSounds;
import dev.dimasik.client.setting.impl.BooleanSetting;

public class Class_zhNm5shz4cDfKVsG extends Class_c7bxavYluZ02uW8X<BooleanSetting> {
   private final Runnable f_36467;
   private static final float f_36468 = 28.0F;
   private static final float f_36469 = 28.0F;
   private static final float f_36470 = 0.8F;
   private static final float f_36471 = 0.55F;
   private static final float f_36472 = 7.0F;
   private static final float f_36473 = 7.0F;
   private static final float f_36474 = 10.0F;
   private static final float f_36475 = 7.0F;
   private static final String f_36476 = "}";
   private static final float f_36477 = 18.0F;
   private static final float f_36478 = 8.0F;

   @Override
   public void m_694() {
   }

   @Override
   public void m_700(float var1, float var2, int var3) {
      if (var3 == 0 && Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_18143, this.f_18144, this.f_18145, this.f_18146)) {
         ClientSounds.m_9463(ClientSounds.KG2FYhAQHwVAXDJG.BUTTON);
         this.f_36467.run();
      }
   }

   public Class_zhNm5shz4cDfKVsG(BooleanSetting var1, Runnable var2) {
      super(var1, f_36468);
      this.f_36467 = var2;
   }

   @Override
   public void m_701(float var1, float var2, float var3) {
      this.f_18146 = f_36469;
      boolean var4 = Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_18143, this.f_18144, this.f_18145, this.f_18146);
      int var5 = Class_BftdentXEtGbugJw.m_2306(
         var4 ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SELECTED) : Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.BACKGROUND),
         var4 ? f_36470 : f_36471
      );
      int var6 = var4 ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE);
      int var7 = var4 ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT) : Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT);
      Class_Ssh31B3ljfKeWsvS.m_4817(this.f_18143, this.f_18144, this.f_18145, this.f_18146, f_36472, var5);
      Class_Ssh31B3ljfKeWsvS.m_4854(this.f_18143, this.f_18144, this.f_18145, this.f_18146, 1.0F, f_36473, var6);
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(), Class_0p152hWffX3ippAf.m_801(this.f_18147.m_8764()), this.f_18143 + f_36474, this.f_18144 + f_36475, 12, var7
      );
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9591(), f_36476, this.f_18143 + this.f_18145 - f_36477, this.f_18144 + f_36478, 11, var7);
   }
}
