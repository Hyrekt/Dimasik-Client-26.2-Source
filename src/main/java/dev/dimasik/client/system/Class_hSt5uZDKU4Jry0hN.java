package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.ClientSounds;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import java.util.Locale;

public class Class_hSt5uZDKU4Jry0hN extends Class_c7bxavYluZ02uW8X<CheckboxSetting> {
   private final Class_1gO7GkQ9aEvcObZ8 f_23379 = new Class_1gO7GkQ9aEvcObZ8();
   private boolean f_23380;
   private static final float f_23381 = 20.0F;
   private static final float f_23382 = 0.2F;
   private static final float f_23383 = 32.0F;
   private static final float f_23384 = 24.0F;
   private static final float f_23385 = 8.0F;
   private static final float f_23386 = 4.0F;
   private static final float f_23387 = 13.0F;
   private static final float f_23388 = 4.0F;
   private static final float f_23389 = 0.85F;
   private static final float f_23390 = 6.0F;
   private static final float f_23391 = 5.0F;
   private static final double f_23392 = 255.0;
   private static final double f_23393 = 255.0;
   private static final float f_23394 = 12.0F;
   private static final float f_23395 = 3.0F;
   private static final float f_23396 = 30.0F;
   private static final float f_23397 = 18.0F;
   private static final float f_23398 = 7.0F;
   private static final float f_23399 = 30.0F;
   private static final float f_23400 = 5.0F;
   private static final float f_23401 = 14.0F;
   private static final float f_23402 = 14.0F;
   private static final float f_23403 = 6.0F;
   private static final float f_23404 = 20.0F;
   private static final float f_23405 = 32.0F;
   private static final double f_23406 = 30.0;
   private static final double f_23407 = 18.0;
   private static final float f_23408 = 20.0F;
   private static final long f_23409 = 280L;
   private static final long f_23410 = 3L;
   private static final String f_23411 = ".";
   private static final String f_23412 = "...";
   private static final String f_23413 = "-";
   private static final String f_23414 = "SPC";
   private static final String f_23415 = "LSH";
   private static final String f_23416 = "RSH";
   private static final String f_23417 = "LCT";
   private static final String f_23418 = "RCT";
   private static final String f_23419 = "LAL";
   private static final String f_23420 = "RAL";
   private static final String f_23421 = "ENT";
   private static final String f_23422 = "TAB";
   private static final String f_23423 = "CAP";
   private static final String f_23424 = "UP";
   private static final String f_23425 = "DN";
   private static final String f_23426 = "LT";
   private static final String f_23427 = "RT";
   private static final String f_23428 = "DEL";
   private static final String f_23429 = "BS";

   private void m_7170(int var1) {
      this.f_18147.m_5183().m_1367(var1);
      ClientSounds.m_9463(var1 < 0 ? ClientSounds.KG2FYhAQHwVAXDJG.BIND_RESET : ClientSounds.KG2FYhAQHwVAXDJG.BIND_SET);
      this.f_23380 = false;
      Class_5SHCkqfIMPKgkAV5.m_1480(var1);
      this.m_7172();
   }

   @Override
   public boolean m_702() {
      return this.f_23380;
   }

   @Override
   public boolean m_2319(float var1, float var2, int var3) {
      if (!this.f_23380) {
         return false;
      }

      if (var3 != 0) {
         this.m_7170(var3);
      }

      return true;
   }

   private String m_7171(String var1, float var2, float var3) {
      if (var1 != null && !var1.isEmpty()) {
         if (Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var1, (int)var3) <= var2) {
            return var1;
         }

         String var4 = f_23412;
         int var5 = var1.length();

         while (var5 > 0) {
            var5 = var1.offsetByCodePoints(var5, -1);
            String var6 = var1.substring(0, var5) + var4;
            if (Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var6, (int)var3) <= var2) {
               return var6;
            }
         }

         return var4;
      } else {
         return "";
      }
   }

   @Override
   public void m_700(float var1, float var2, int var3) {
      if (this.f_23380) {
         if (var3 != 0) {
            this.m_7170(var3);
         }
      } else {
         boolean var4 = Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_18143 + this.f_18145 - f_23405, this.f_18144 + 2.0F, f_23406, f_23407);
         boolean var5 = Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_18143, this.f_18144, this.f_18145, Math.max(this.f_18146, f_23408));
         if (var3 == 0) {
            if (var4) {
               this.f_18147.m_823(!this.f_18147.m_8768());
               ClientSounds.m_9463(this.f_18147.m_8768() ? ClientSounds.KG2FYhAQHwVAXDJG.CHECKBOX_ON : ClientSounds.KG2FYhAQHwVAXDJG.CHECKBOX_OFF);
            }
         } else if (var3 == 1 && var5) {
            this.f_23380 = true;
            ClientSounds.m_9463(ClientSounds.KG2FYhAQHwVAXDJG.BIND_START);
         }
      }
   }

   @Override
   public void m_698(int var1) {
      if (this.f_23380) {
         if (var1 == 256) {
            this.f_23380 = false;
         } else if (var1 != 261 && var1 != 259) {
            this.m_7170(var1);
         } else {
            this.m_7170(-1);
         }
      }
   }

   @Override
   public void m_701(float var1, float var2, float var3) {
      this.f_23379.m_848(0.0F, 1.0F, f_23382, Class_55WOGfS5cDac4HRi.f_2285, var3);
      int var4 = Class_BftdentXEtGbugJw.m_2302(
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT),
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT),
         this.f_23379.m_845()
      );
      float var5 = this.f_18143 + this.f_18145 - f_23383;
      String var6 = this.m_7174();
      float var7 = var6 == null ? 0.0F : Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var6, 10);
      float var8 = Math.max(f_23384, var5 - this.f_18143 - (var6 == null ? 0.0F : var7 + f_23385) - f_23386);
      String var9 = this.m_7171(Class_0p152hWffX3ippAf.m_801(this.f_18147.m_8764()), var8, f_23387);
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var9, this.f_18143, this.f_18144 + f_23388, 13, var4);
      if (var6 != null) {
         int var10 = Class_5SHCkqfIMPKgkAV5.m_1486(
            this.f_18147.m_5183().m_1369(),
            this.f_23380,
            Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT), f_23389),
            Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT),
            this.f_18147
         );
         Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var6, var5 - var7 - f_23390, this.f_18144 + f_23391, 10, var10);
      }

      int var13 = Class_BftdentXEtGbugJw.m_2302(
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_STATE),
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_STATE),
         this.f_23379.m_845()
      );
      int var11 = Class_BftdentXEtGbugJw.m_2302(
         Class_BftdentXEtGbugJw.m_2303(125, 135, 145, f_23392), Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_23393), this.f_23379.m_845()
      );
      float var12 = f_23394 * this.f_23379.m_845();
      Class_Ssh31B3ljfKeWsvS.m_4817(var5, this.f_18144 + f_23395, f_23396, f_23397, f_23398, var13);
      Class_Ssh31B3ljfKeWsvS.m_4817(this.f_18143 + this.f_18145 - f_23399 + var12, this.f_18144 + f_23400, f_23401, f_23402, f_23403, var11);
      this.f_18146 = f_23404;
   }

   private void m_7172() {
      DimasikClient.m_9057().m_9049().m_2802().m_8844().m_5559();
   }

   private String m_7173(int var1) {
      if (var1 < 0) {
         return f_23413;
      }

      if (var1 >= 0 && var1 <= 7) {
         return var1 + 1 + "";
      }

      return switch (var1) {
         case 32 -> f_23414;
         case 257 -> f_23421;
         case 258 -> f_23422;
         case 259 -> f_23429;
         case 261 -> f_23428;
         case 262 -> f_23427;
         case 263 -> f_23426;
         case 264 -> f_23425;
         case 265 -> f_23424;
         case 280 -> f_23423;
         case 340 -> f_23415;
         case 341 -> f_23417;
         case 342 -> f_23419;
         case 344 -> f_23416;
         case 345 -> f_23418;
         case 346 -> f_23420;
         default -> {
            String var2 = Class_vAC0cSmAiUV3cskz.m_9251(var1);
            yield var2.isEmpty() ? var1 + "" : var2.toUpperCase(Locale.ROOT);
         }
      };
   }

   public Class_hSt5uZDKU4Jry0hN(CheckboxSetting var1) {
      super(var1, f_23381);
   }

   private String m_7174() {
      if (this.f_23380) {
         return this.m_7175();
      }

      int var1 = this.f_18147.m_5183().m_1369();
      return var1 < 0 ? null : this.m_7173(var1);
   }

   @Override
   public void m_2322() {
      this.f_23380 = false;
   }

   @Override
   public void m_694() {
      this.f_23379.m_843(this.f_18147.m_8768());
   }

   private String m_7175() {
      int var1 = (int)(System.currentTimeMillis() / f_23409 % f_23410) + 1;
      return f_23411.repeat(var1);
   }
}
