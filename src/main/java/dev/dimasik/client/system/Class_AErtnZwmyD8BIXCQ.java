package dev.dimasik.client.system;

import dev.dimasik.client.module.misc.ClientSounds;
import dev.dimasik.client.setting.impl.PositionSetting;
import org.joml.Vector2f;

public class Class_AErtnZwmyD8BIXCQ extends Class_c7bxavYluZ02uW8X<PositionSetting> {
   private boolean f_5097;
   private boolean f_5098;
   private static final float f_5099 = 34.0F;
   private static final double f_5100 = 255.0;
   private static final double f_5101 = 255.0;
   private static final float f_5102 = 23.0F;
   private static final float f_5103 = 5.0F;
   private static final double f_5104 = 255.0;
   private static final float f_5105 = 23.0F;
   private static final float f_5106 = 5.0F;
   private static final double f_5107 = 255.0;
   private static final float f_5108 = 4.0F;
   private static final float f_5109 = 20.0F;
   private static final float f_5110 = 12.0F;
   private static final float f_5111 = 12.0F;
   private static final float f_5112 = 5.0F;
   private static final double f_5113 = 255.0;
   private static final float f_5114 = 4.0F;
   private static final float f_5115 = 20.0F;
   private static final float f_5116 = 12.0F;
   private static final float f_5117 = 12.0F;
   private static final float f_5118 = 5.0F;
   private static final double f_5119 = 255.0;
   private static final float f_5120 = 34.0F;
   private static final float f_5121 = 22.0F;
   private static final double f_5122 = 8.0;
   private static final float f_5123 = 22.0F;
   private static final float f_5124 = 8.0F;
   private static final double f_5125 = 8.0;

   private float m_2081(float var1, float var2) {
      float var3 = (var2 - var1) / this.f_18145 * (this.f_18147.m_8003().y - this.f_18147.m_8003().x) + this.f_18147.m_8003().x;
      var3 = (float)Class_3VHxwfI2NZKoxzIi.m_1308(var3, this.f_18147.m_8006());
      return Math.clamp(var3, this.f_18147.m_8003().x, this.f_18147.m_8003().y);
   }

   private Vector2f m_2082() {
      float var1 = this.f_18147.m_8003().y - this.f_18147.m_8003().x;
      return new Vector2f((this.f_18147.m_8768().x - this.f_18147.m_8003().x) / var1, (this.f_18147.m_8768().y - this.f_18147.m_8003().x) / var1);
   }

   public Class_AErtnZwmyD8BIXCQ(PositionSetting var1) {
      super(var1, f_5099);
   }

   @Override
   public void m_700(float var1, float var2, int var3) {
      float var4 = this.f_18145 * this.m_2082().y - this.f_18145 * this.m_2082().x;
      if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_18143, this.f_18144 + f_5121, this.f_18145 * this.m_2082().x + var4 / 2.0F, f_5122)) {
         this.f_5097 = true;
         ClientSounds.m_9463(ClientSounds.KG2FYhAQHwVAXDJG.SLIDER_GRAB);
      } else if (Class_FvJXUGWpZo3zYBW4.m_2697(
         var1, var2, this.f_18143 + this.f_18145 * this.m_2082().y - var4 / 2.0F, this.f_18144 + f_5123, this.f_18145 - this.m_2082().y - f_5124, f_5125
      )) {
         this.f_5098 = true;
         ClientSounds.m_9463(ClientSounds.KG2FYhAQHwVAXDJG.SLIDER_GRAB);
      }
   }

   @Override
   public void m_694() {
   }

   @Override
   public void m_2083(float var1, float var2, int var3) {
      if (this.f_5097 || this.f_5098) {
         ClientSounds.m_9463(ClientSounds.KG2FYhAQHwVAXDJG.SLIDER_RELEASE);
      }

      this.f_5097 = false;
      this.f_5098 = false;
   }

   @Override
   public void m_701(float var1, float var2, float var3) {
      String var4 = "" + this.f_18147.m_8768().x + this.f_18147.m_8768().y;
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         Class_0p152hWffX3ippAf.m_801(this.f_18147.m_8764()),
         this.f_18143,
         this.f_18144,
         13,
         Class_BftdentXEtGbugJw.m_2303(206, 207, 210, f_5100)
      );
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         var4,
         this.f_18143 + this.f_18145 - Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var4, 12),
         this.f_18144,
         12,
         Class_BftdentXEtGbugJw.m_2303(148, 151, 156, f_5101)
      );
      Class_Ssh31B3ljfKeWsvS.m_4817(this.f_18143, this.f_18144 + f_5102, this.f_18145, f_5103, 2.0F, Class_BftdentXEtGbugJw.m_2303(34, 38, 47, f_5104));
      float var5 = this.f_18145 * this.m_2082().y - this.f_18145 * this.m_2082().x;
      Class_Ssh31B3ljfKeWsvS.m_4817(
         this.f_18143 + this.f_18145 * this.m_2082().x, this.f_18144 + f_5105, var5, f_5106, 2.0F, Class_BftdentXEtGbugJw.m_2303(128, 179, 255, f_5107)
      );
      Class_Ssh31B3ljfKeWsvS.m_4817(
         this.f_18143 + this.f_18145 * this.m_2082().x - f_5108,
         this.f_18144 + f_5109,
         f_5110,
         f_5111,
         f_5112,
         Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_5113)
      );
      Class_Ssh31B3ljfKeWsvS.m_4817(
         this.f_18143 + this.f_18145 * this.m_2082().y - f_5114,
         this.f_18144 + f_5115,
         f_5116,
         f_5117,
         f_5118,
         Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_5119)
      );
      float var6 = this.f_18147.m_8768().x;
      float var7 = this.f_18147.m_8768().y;
      if (this.f_5097) {
         this.f_18147.m_8768().x = Math.min(this.m_2081(this.f_18143, var1), this.f_18147.m_8768().y - this.f_18147.m_8000());
      } else if (this.f_5098) {
         this.f_18147.m_8768().y = Math.max(this.m_2081(this.f_18143, var1), this.f_18147.m_8768().x + this.f_18147.m_8000());
      }

      if (Float.compare(var6, this.f_18147.m_8768().x) != 0 || Float.compare(var7, this.f_18147.m_8768().y) != 0) {
         ClientSounds.m_9462(ClientSounds.KG2FYhAQHwVAXDJG.SLIDER, this.f_5097 ? this.m_2082().x : this.m_2082().y);
      }

      this.f_18146 = f_5120;
   }
}
