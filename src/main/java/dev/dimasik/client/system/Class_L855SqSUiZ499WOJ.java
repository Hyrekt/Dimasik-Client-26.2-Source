package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import java.util.ArrayList;

public class Class_L855SqSUiZ499WOJ {
   private final ArrayList<Class_hqBajCoIbZEUNpAH> f_10566 = new ArrayList<>();

   @Class_FUILRKIQ6wtWry59("rotateZ")
   public void m_3609(int var1, int var2, float var3) {
      for (int var4 = var1; var4 <= var2; var4++) {
         this.m_3618(var4, new Class_rwJJYPA55BER998F(var3, 0.0F, 0.0F, 0.0F));
      }
   }

   @Class_FUILRKIQ6wtWry59("moveY")
   public void m_3610(int var1, int var2, float var3) {
      for (int var4 = var1; var4 <= var2; var4++) {
         this.m_3618(var4, new Class_z5c5pO9BF7svIt3E(var3));
      }
   }

   @Class_FUILRKIQ6wtWry59("rotateX")
   public void m_3611(int var1, int var2, float var3, float var4, float var5, float var6) {
      for (int var7 = var1; var7 <= var2; var7++) {
         this.m_3618(var7, new Class_PlygiGahPfdzKz1A(var3, var4, var5, var6));
      }
   }

   public void m_3612() {
      this.f_10566.clear();
   }

   @Class_FUILRKIQ6wtWry59("moveZ")
   public void m_3613(int var1, int var2, float var3) {
      for (int var4 = var1; var4 <= var2; var4++) {
         this.m_3618(var4, new Class_uYIEyMRvOiCPbTCc(var3));
      }
   }

   @Class_FUILRKIQ6wtWry59("rotateY")
   public void m_3614(int var1, int var2, float var3, float var4, float var5, float var6) {
      for (int var7 = var1; var7 <= var2; var7++) {
         this.m_3618(var7, new Class_MT6bUr3Um87gC8Qe(var3, var4, var5, var6));
      }
   }

   @Class_FUILRKIQ6wtWry59("rotateX")
   public void m_3615(int var1, int var2, float var3) {
      for (int var4 = var1; var4 <= var2; var4++) {
         this.m_3618(var4, new Class_PlygiGahPfdzKz1A(var3, 0.0F, 0.0F, 0.0F));
      }
   }

   @Class_FUILRKIQ6wtWry59("scale")
   public void m_3616(int var1, int var2, float var3, float var4, float var5) {
      for (int var6 = var1; var6 <= var2; var6++) {
         this.m_3618(var6, new Class_1zdQpKoM5rbukobC(var3, var4, var5));
      }
   }

   public void m_3617(int var1, PoseStack var2) {
      this.f_10566.reversed().forEach(var2x -> {
         if (var2x.f_23510 == var1) {
            var2x.m_886(var2);
         }
      });
   }

   private void m_3618(int var1, Class_hqBajCoIbZEUNpAH var2) {
      var2.f_23510 = var1;
      this.f_10566.add(var2);
   }

   @Class_FUILRKIQ6wtWry59("rotateZ")
   public void m_3619(int var1, int var2, float var3, float var4, float var5, float var6) {
      for (int var7 = var1; var7 <= var2; var7++) {
         this.m_3618(var7, new Class_rwJJYPA55BER998F(var3, var4, var5, var6));
      }
   }

   @Class_FUILRKIQ6wtWry59("rotateY")
   public void m_3620(int var1, int var2, float var3) {
      for (int var4 = var1; var4 <= var2; var4++) {
         this.m_3618(var4, new Class_MT6bUr3Um87gC8Qe(var3, 0.0F, 0.0F, 0.0F));
      }
   }

   @Class_FUILRKIQ6wtWry59("moveX")
   public void m_3621(int var1, int var2, float var3) {
      for (int var4 = var1; var4 <= var2; var4++) {
         this.m_3618(var4, new Class_C6aqnXxNnlmZhUpl(var3));
      }
   }
}
