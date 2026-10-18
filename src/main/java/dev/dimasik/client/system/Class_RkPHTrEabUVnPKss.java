package dev.dimasik.client.system;

import net.minecraft.client.Minecraft;

public final class Class_RkPHTrEabUVnPKss {
   private final Class_PKdQIwbr1ubGwinO f_12654;
   private final Minecraft f_12655;
   private final Class_QmNR03reugBgWiPr f_12656 = new Class_QmNR03reugBgWiPr();
   private final Class_QmNR03reugBgWiPr f_12657 = new Class_QmNR03reugBgWiPr();
   private boolean f_12658;
   private boolean f_12659;
   private long f_12660;
   private static final long f_12661 = 1000L;

   private void m_4571() {
      if (this.f_12658 && this.f_12654.m_4117() && Class_ihGZO2ZUujXpOL3n.m_7299()) {
         Class_ihGZO2ZUujXpOL3n.m_7305(new Class_HK69HhzrhXh8OKoN(this.f_12654, this.f_12655, this.f_12660));
         this.f_12659 = true;
         this.f_12656.m_4459();
      }
   }

   public Class_RkPHTrEabUVnPKss(Class_PKdQIwbr1ubGwinO var1, Minecraft var2) {
      this.f_12654 = var1;
      this.f_12655 = var2;
   }

   public void m_4573() {
      if (this.f_12658 && this.f_12654.m_4117()) {
         if (!Class_ihGZO2ZUujXpOL3n.m_7299()) {
            this.f_12659 = false;
            if (this.f_12657.m_4461(this.f_12654.m_4119(), true)) {
               this.m_4574();
            }
         } else {
            if (!this.f_12659 || this.f_12656.m_4461(this.f_12654.m_4118(), true)) {
               this.m_4571();
            }
         }
      }
   }

   private void m_4574() {
      if (this.f_12658 && this.f_12654.m_4117() && !Class_ihGZO2ZUujXpOL3n.m_7299()) {
         Class_ihGZO2ZUujXpOL3n.m_7298((var1, var2) -> this.f_12659 = false);
         this.f_12659 = Class_ihGZO2ZUujXpOL3n.m_7306(this.f_12654.m_4124(), this::m_4571);
         if (this.f_12659) {
            this.m_4571();
         }
      }
   }

   public void m_4575() {
      this.f_12658 = true;
      this.f_12659 = false;
      this.f_12660 = System.currentTimeMillis() / f_12661;
      this.f_12656.m_4459();
      this.f_12657.m_4459();
      this.m_4574();
   }

   public void m_4576() {
      this.f_12658 = false;
      this.f_12659 = false;
      Class_ihGZO2ZUujXpOL3n.m_7298(null);
      if (Class_ihGZO2ZUujXpOL3n.m_7299()) {
         Class_ihGZO2ZUujXpOL3n.m_7307();
      }
   }
}
