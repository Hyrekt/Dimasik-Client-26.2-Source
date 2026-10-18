package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.manager.ClientManagerRegistry;
import dev.dimasik.client.module.render.Hud;
import java.util.Arrays;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.ItemStack;
import org.joml.Matrix4f;

public final class Class_Y6ux4QBnIgZms3Ps extends Class_NO6SuGqq3FB7jQDZ {
   private final Matrix4f f_16124 = new Matrix4f();
   private final Class_w8fCJQ5ZtH5lQbWc[] f_16125 = new Class_w8fCJQ5ZtH5lQbWc[27];
   private final Class_w8fCJQ5ZtH5lQbWc[] f_16126 = new Class_w8fCJQ5ZtH5lQbWc[27];
   private final int[] f_16127 = new int[27];
   private final Class_Trm8dR6i9vMfnZEG.Class_6SoEwLZCu5bs5f6U[] f_16128 = new Class_Trm8dR6i9vMfnZEG.Class_6SoEwLZCu5bs5f6U[27];
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_16129 = this::m_5634;
   private static final String f_16130 = "Inventory";
   private static final float f_16131 = 28.0F;
   private static final float f_16132 = 190.0F;
   private static final float f_16133 = 290.0F;
   private static final float f_16134 = 104.0F;
   private static final float f_16135 = 12.0F;
   private static final float f_16136 = 16.0F;
   private static final float f_16137 = 290.0F;
   private static final float f_16138 = 104.0F;
   private static final float f_16139 = 7.0F;
   private static final float f_16140 = 28.0F;
   private static final float f_16141 = 3.0F;
   private static final float f_16142 = 14.0F;
   private static final float f_16143 = 0.01F;
   private static final float f_16144 = 1.25F;
   private static final float f_16145 = 0.72F;
   private static final float f_16146 = 0.28F;
   private static final float f_16147 = 0.1F;
   private static final float f_16148 = 16.0F;
   private static final float f_16149 = 0.5F;
   private static final float f_16150 = 0.5F;
   private static final String f_16151 = "Инвентарь";

   private void m_5634(Class_bhRaN0YSSLQRYjPo var1) {
      if (!this.m_5635()) {
         this.m_4012(0.0F);
         this.m_4007(0.0F);
      } else if (f_11537.gui.hud.isHidden() && !(f_11537.gui.screen() instanceof ChatScreen)) {
         this.m_4012(0.0F);
         this.m_4007(0.0F);
      } else {
         float var2 = Math.round(this.m_3998());
         float var3 = Math.round(this.m_3993());
         float var4 = f_16137;
         float var5 = f_16138;
         float var6 = f_16139;
         float var7 = f_16140;
         float var8 = f_16141;
         Class_Ssh31B3ljfKeWsvS.m_4814(this.f_16124.identity());
         this.m_4013();
         Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588());

         try {
            Class_U4Qsm43RVlUI3Pre.m_5188(var2, var3, var4, var5, f_16142);
            Inventory var9 = f_11537.player.getInventory();

            for (int var10 = 0; var10 < this.f_16125.length; var10++) {
               int var11 = var10 % 9;
               int var12 = var10 / 9;
               float var13 = var2 + var6 + var11 * (var7 + var8);
               float var14 = var3 + var6 + var12 * (var7 + var8);
               ItemStack var15 = var9.getItem(9 + var10);
               boolean var16 = var15 != null && !var15.isEmpty();
               this.f_16125[var10].m_9283(var16 ? 1.0F : 0.0F);
               float var17 = Math.clamp(this.f_16125[var10].m_9288(), 0.0F, 1.0F);
               int var18 = var16 ? var15.getCount() : 0;
               if (this.f_16127[var10] != var18) {
                  this.f_16127[var10] = var18;
                  this.f_16126[var10].m_9281(1.0F);
               }

               this.f_16126[var10].m_9283(0.0F);
               float var19 = Math.clamp(this.f_16126[var10].m_9288(), 0.0F, 1.0F);
               if (var16 && !(var17 <= f_16143)) {
                  float var20 = f_16144 * (f_16145 + var17 * f_16146 + var19 * f_16147);
                  float var21 = f_16148 * var20;
                  Class_U4Qsm43RVlUI3Pre.m_5206(
                     var13 + (var7 - var21) * f_16149, var14 + (var7 - var21) * f_16150, var21, var21, var15, false, this.f_16128[var10]
                  );
               }
            }
         } finally {
            Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588());
            this.m_4005();
         }

         this.m_4012(var4);
         this.m_4007(var5);
      }
   }

   public Class_Y6ux4QBnIgZms3Ps() {
      super(f_16130, f_16131, f_16132, f_16133, f_16134);
      Arrays.fill(this.f_16127, -1);

      for (int var1 = 0; var1 < this.f_16125.length; var1++) {
         this.f_16125[var1] = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_16135, Class_eXr9Fra2ad3yFXY8.f_19100);
         this.f_16126[var1] = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_16136, Class_eXr9Fra2ad3yFXY8.f_19100);
         this.f_16128[var1] = new Class_Trm8dR6i9vMfnZEG.Class_6SoEwLZCu5bs5f6U();
      }
   }

   private boolean m_5635() {
      try {
         if (f_11537.player != null && f_11537.level != null) {
            ClientManagerRegistry var1 = DimasikClient.m_9057().m_9049();
            if (var1 != null && var1.m_2808().m_5376()) {
               Hud var2 = var1.m_2801().m_3433();
               return var2 != null && var2.m_776() && var2.m_6177().m_7145(f_16151);
            } else {
               return false;
            }
         } else {
            return false;
         }
      } catch (Throwable var3) {
         return false;
      }
   }
}
