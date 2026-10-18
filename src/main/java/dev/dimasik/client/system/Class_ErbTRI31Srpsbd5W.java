package dev.dimasik.client.system;

import lombok.Generated;
import net.minecraft.network.protocol.game.ClientboundSetTimePacket;
import net.minecraft.util.Mth;

public class Class_ErbTRI31Srpsbd5W extends Class_4DhobBIM8lTNckKj {
   private static float f_7155 = 0.0F;
   public long f_7156;
   private static float f_7157 = Class_ErbTRI31Srpsbd5W.f_7161;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_7158 = this::m_2575;
   private static final float f_7159 = 20.0F;
   private static final float f_7160 = 1.0E9F;
   private static final float f_7161 = 20.0F;

   @Generated
   public static float m_2573() {
      return f_7157;
   }

   @Generated
   public static float m_2574() {
      return f_7155;
   }

   private void m_2575(Class_XzpX8S5F5zd9jbuE var1) {
      if (var1.m_5619() instanceof ClientboundSetTimePacket) {
         this.m_2576();
      }
   }

   private void m_2576() {
      long var1 = System.nanoTime() - this.f_7156;
      float var3 = f_7159;
      float var4 = var3 * (f_7160 / (float)var1);
      float var5 = Mth.clamp(var4, 0.0F, var3);
      f_7157 = Math.round(var5 * 2.0F) / 2.0F;
      f_7155 = var5 - var3;
      this.f_7156 = System.nanoTime();
   }
}
