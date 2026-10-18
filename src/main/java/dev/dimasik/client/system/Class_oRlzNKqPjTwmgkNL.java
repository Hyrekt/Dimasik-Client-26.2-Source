package dev.dimasik.client.system;

import lombok.Generated;
import net.minecraft.network.chat.Component;

public abstract class Class_oRlzNKqPjTwmgkNL {
   protected final Component f_26204;
   protected final long f_26205;
   protected final Class_QmNR03reugBgWiPr f_26206 = new Class_QmNR03reugBgWiPr();
   protected final Class_w8fCJQ5ZtH5lQbWc f_26207;
   protected final Class_w8fCJQ5ZtH5lQbWc f_26208;
   protected boolean f_26209;
   protected boolean f_26210;
   protected Class_MP0Q3Izlf2HSndyS f_26211;
   private static final long f_26212 = 1500L;
   private static final float f_26213 = 10.0F;
   private static final float f_26214 = 7.0F;

   @Generated
   public Component m_7753() {
      return this.f_26204;
   }

   @Generated
   public Class_w8fCJQ5ZtH5lQbWc m_7754() {
      return this.f_26207;
   }

   @Generated
   public Class_QmNR03reugBgWiPr m_7755() {
      return this.f_26206;
   }

   public abstract float m_1327();

   public void m_7756() {
      this.f_26209 = true;
   }

   protected void m_7757(float var1) {
      if (!this.f_26210) {
         this.f_26207.m_9281(var1);
         this.f_26210 = true;
      }
   }

   public Class_oRlzNKqPjTwmgkNL(Component var1) {
      this(var1, f_26212);
   }

   public abstract void m_1323(float var1, float var2, float var3);

   @Generated
   public Class_MP0Q3Izlf2HSndyS m_7758() {
      return this.f_26211;
   }

   @Generated
   public Class_w8fCJQ5ZtH5lQbWc m_7759() {
      return this.f_26208;
   }

   public boolean m_7760() {
      return this.f_26209 || this.f_26206.m_4463(this.f_26205);
   }

   @Generated
   public boolean m_7761() {
      return this.f_26210;
   }

   public abstract float m_1322();

   @Generated
   public long m_7762() {
      return this.f_26205;
   }

   public void m_7763(float var1, float var2) {
      this.m_1323(var1, var2, 0.0F);
   }

   @Generated
   public void m_7764(Class_MP0Q3Izlf2HSndyS var1) {
      this.f_26211 = var1;
   }

   public Class_oRlzNKqPjTwmgkNL(Component var1, long var2) {
      this.f_26207 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_26213);
      this.f_26208 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_26214);
      this.f_26209 = false;
      this.f_26210 = false;
      this.f_26211 = Class_MP0Q3Izlf2HSndyS.OTHER;
      this.f_26204 = var1;
      this.f_26205 = Math.max(1L, var2);
   }

   @Generated
   public boolean m_7765() {
      return this.f_26209;
   }
}
