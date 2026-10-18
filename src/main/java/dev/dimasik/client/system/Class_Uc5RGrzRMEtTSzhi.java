package dev.dimasik.client.system;

import lombok.Generated;
import org.apache.commons.lang3.StringUtils;

public class Class_Uc5RGrzRMEtTSzhi {
   private final Class_Uc5RGrzRMEtTSzhi.c0YnRHLCUfrljfxV f_14840;
   private Runnable f_14841 = null;
   private Runnable f_14842 = null;
   private boolean f_14843 = false;
   private boolean f_14844 = false;
   private String f_14845 = "";
   private static final String f_14846 = ".";
   private static final String f_14847 = ",";

   @Generated
   public void m_5251(boolean var1) {
      this.f_14843 = var1;
   }

   @Generated
   public Class_Uc5RGrzRMEtTSzhi.c0YnRHLCUfrljfxV m_5252() {
      return this.f_14840;
   }

   @Generated
   public Runnable m_5253() {
      return this.f_14842;
   }

   public Class_Uc5RGrzRMEtTSzhi(Class_Uc5RGrzRMEtTSzhi.c0YnRHLCUfrljfxV var1) {
      this.f_14840 = var1;
   }

   @Generated
   public String m_5254() {
      return this.f_14845;
   }

   public float m_5255(float var1) {
      try {
         return Float.parseFloat(this.f_14845);
      } catch (NumberFormatException var3) {
         return var1;
      }
   }

   public void m_5256(int var1) {
      if (this.f_14843) {
         if (var1 == 341) {
            this.f_14844 = true;
         } else if (!this.f_14845.isEmpty() && var1 == 259) {
            this.f_14845 = this.f_14845.substring(0, this.f_14845.length() - 1);
         } else if (var1 == 257 || var1 == 256) {
            this.f_14843 = false;
            this.m_5265();
         }
      }
   }

   public void m_5257(Runnable var1) {
      this.f_14841 = var1;
   }

   @Generated
   public Runnable m_5258() {
      return this.f_14841;
   }

   @Generated
   public void m_5259(String var1) {
      this.f_14845 = var1;
   }

   public void m_5260(float var1, float var2, float var3, float var4, float var5, float var6, String var7, int var8) {
      if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var3, var4, var5, var6) && var8 == 0) {
         this.f_14845 = var7;
         this.f_14843 = true;
         this.f_14842 = this.f_14841;
      } else {
         this.m_5265();
         this.f_14843 = false;
      }
   }

   @Generated
   public boolean m_5261() {
      return this.f_14843;
   }

   public void m_5262(String var1) {
      if (this.f_14843) {
         if (this.f_14840 == Class_Uc5RGrzRMEtTSzhi.c0YnRHLCUfrljfxV.NUMBER) {
            if (StringUtils.isNumeric(var1)) {
               this.f_14845 = this.f_14845 + var1;
            } else if (var1.equals(f_14846) || var1.equals(f_14847)) {
               this.f_14845 = this.f_14845 + "";
            }
         } else if (this.f_14840 == Class_Uc5RGrzRMEtTSzhi.c0YnRHLCUfrljfxV.STRING) {
            this.f_14845 = this.f_14845 + var1;
         }
      }
   }

   @Generated
   public boolean m_5263() {
      return this.f_14844;
   }

   public void m_5264(int var1) {
      if (this.f_14843) {
         if (var1 == 341) {
            this.f_14844 = false;
         }
      }
   }

   private void m_5265() {
      if (this.f_14842 != null) {
         this.f_14842.run();
         this.f_14842 = null;
      }
   }

   public enum c0YnRHLCUfrljfxV {
      NUMBER,
      STRING;
   }
}
