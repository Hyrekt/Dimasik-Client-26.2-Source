package dev.dimasik.client.system;

import dev.dimasik.client.setting.Setting;
import dev.dimasik.client.ui.screen.Screen_8;
import lombok.Generated;
import net.minecraft.client.Minecraft;

public abstract class Class_c7bxavYluZ02uW8X<T extends Setting<?>> {
   private final Class_1gO7GkQ9aEvcObZ8 f_18142 = new Class_1gO7GkQ9aEvcObZ8();
   protected float f_18143;
   protected float f_18144;
   protected float f_18145;
   protected float f_18146;
   protected T f_18147;
   private static final float f_18148 = 8.0F;
   private static final float f_18149 = 0.125F;
   private static final float f_18150 = 10.0F;
   private static final float f_18151 = 0.125F;
   private static final float f_18152 = 5.0F;

   public void m_2317(float var1, float var2, float var3) {
   }

   public void m_2935(String var1, int var2, int var3) {
   }

   @Generated
   public void m_6138(float var1) {
      this.f_18143 = var1;
   }

   public void m_2322() {
   }

   public boolean m_2319(float var1, float var2, int var3) {
      return false;
   }

   public void m_698(int var1) {
   }

   @Generated
   public float m_6139() {
      return this.f_18146;
   }

   public void m_2083(float var1, float var2, int var3) {
   }

   public void m_5916(int var1) {
   }

   @Generated
   public void m_6140(float var1) {
      this.f_18144 = var1;
   }

   @Generated
   public float m_6141() {
      return this.f_18143;
   }

   @Generated
   public void m_6142(float var1) {
      this.f_18146 = var1;
   }

   @Generated
   public void m_6143(float var1) {
      this.f_18145 = var1;
   }

   public abstract void m_700(float var1, float var2, int var3);

   @Generated
   public float m_6144() {
      return this.f_18144;
   }

   public boolean m_702() {
      return false;
   }

   @Generated
   public float m_6145() {
      return this.f_18145;
   }

   public Class_c7bxavYluZ02uW8X(T var1) {
      this.f_18147 = (T)var1;
   }

   public boolean m_2320(float var1, float var2, double var3) {
      return false;
   }

   public Class_c7bxavYluZ02uW8X(T var1, float var2) {
      this((T)var1);
      this.f_18146 = var2;
   }

   protected float m_6146(float var1, float var2) {
      if (Minecraft.getInstance().gui.screen() instanceof Screen_8 var3) {
         float var7 = f_18150 + var2 * f_18151;
         float var5 = var3.getModuleViewportY() + var7;
         float var6 = var3.getModuleViewportY() + var3.getModuleViewportHeight() - var2 - var7;
         if (var1 > var6) {
            var1 = this.f_18144 - var2 - f_18152;
         }

         return Math.clamp(var1, var5, Math.max(var5, var6));
      } else {
         return var1;
      }
   }

   @Generated
   public Class_1gO7GkQ9aEvcObZ8 m_6147() {
      return this.f_18142;
   }

   public abstract void m_694();

   protected float m_6148(float var1, float var2) {
      if (Minecraft.getInstance().gui.screen() instanceof Screen_8 var3) {
         float var7 = f_18148 + var2 * f_18149;
         float var5 = var3.getModuleViewportX() + var7;
         float var6 = var3.getModuleViewportX() + var3.getModuleViewportWidth() - var2 - var7;
         return Math.clamp(var1, var5, Math.max(var5, var6));
      } else {
         return var1;
      }
   }

   @Generated
   public T m_6149() {
      return this.f_18147;
   }

   public abstract void m_701(float var1, float var2, float var3);
}
