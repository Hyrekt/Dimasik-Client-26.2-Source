package dev.dimasik.client.system;

import com.mojang.blaze3d.textures.GpuTextureView;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.render.Hud;
import lombok.Generated;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.ItemStack;
import org.joml.Vector4f;
import org.joml.Vector4i;

public final class Class_U4Qsm43RVlUI3Pre implements Class_b8v0o2NnCtANmOp9, Class_NzJrN63M7QBpmAbi {
   private static final Class_QXWSRsUq6ZajU3lN f_14627 = new Class_QXWSRsUq6ZajU3lN();
   private static final float f_14628 = 16.0F;
   private static final float f_14629 = 30.0F;
   private static final float f_14630 = 0.5F;
   private static final float f_14631 = 18.0F;
   private static final float f_14632 = 10.0F;
   private static final float f_14633 = 1.5F;
   private static final float f_14634 = 0.5F;
   private static final float f_14635 = 22.0F;
   private static final float f_14636 = 30.0F;
   private static final float f_14637 = 11.0F;
   private static final float f_14638 = 11.0F;
   private static final float f_14639 = 255.0F;
   private static final float f_14640 = 255.0F;
   private static final double f_14641 = 255.0;
   private static final float f_14642 = 1.5F;
   private static final float f_14643 = 3.0F;
   private static final float f_14644 = 1.5F;
   private static final float f_14645 = 3.0F;
   private static final float f_14646 = 16.0F;
   private static final float f_14647 = 16.0F;
   private static final float f_14648 = 13.0F;
   private static final float f_14649 = 13.0F;
   private static final int f_14650 = -16777216;
   private static final float f_14651 = 13.0F;
   private static final int f_14652 = -16777216;
   private static final float f_14653 = 16.0F;
   private static final float f_14654 = 16.0F;
   private static final float f_14655 = 16.0F;
   private static final int f_14656 = Integer.MAX_VALUE;
   private static final float f_14657 = 9.0F;
   private static final float f_14658 = 17.0F;
   private static final float f_14659 = 17.0F;
   private static final float f_14660 = 36.0F;
   private static final float f_14661 = 3.0F;
   private static final float f_14662 = 16.0F;
   private static final float f_14663 = 15.0F;
   private static final float f_14664 = 36.0F;
   private static final float f_14665 = 4.0F;
   private static final float f_14666 = 16.0F;
   private static final float f_14667 = 14.0F;
   private static final float f_14668 = 255.0F;
   private static final float f_14669 = 255.0F;
   private static final double f_14670 = 255.0;
   private static final float f_14671 = 3.0F;
   private static final float f_14672 = 3.0F;
   private static final float f_14673 = 3.0F;
   private static final float f_14674 = 3.0F;
   private static final float f_14675 = 255.0F;
   private static final float f_14676 = 255.0F;
   private static final float f_14677 = 255.0F;
   private static final float f_14678 = 255.0F;
   private static final float f_14679 = 0.12F;
   private static final String f_14680 = "This is a utility class and cannot be instantiated";

   public static void m_5184(float var0, float var1, float var2, float var3, Vector4f var4, Vector4f var5, Vector4i var6, Identifier var7) {
      f_14627.m_4433(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   public static void m_5185(float var0, float var1, float var2, float var3, float var4) {
      if (!(var2 <= 0.0F) && !(var3 <= 0.0F) && !(Class_Ssh31B3ljfKeWsvS.m_4821() <= 0.0F)) {
         boolean var5 = Class_oDLvT3Io61u7HRHc.m_7743();
         boolean var6 = DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049().m_2801().m_3433().m_6157().m_8768();
         if (!var5 && var6) {
            m_5211(var0, var1, var2, var3, f_14628, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SHADOW));
         }

         if (var5) {
            Class_oDLvT3Io61u7HRHc.m_7752(var0, var1, var2, var3, var4);
         } else {
            Class_oDLvT3Io61u7HRHc.m_7742(var0, var1, var2, var3, var4, true);
         }
      }
   }

   public static void m_5186(Class_jZQ0pP9BTU3L7miy var0, String var1, float var2, float var3, int var4, int var5) {
      if (var4 > 0 && var5 >>> 24 != 0 && !(Class_Ssh31B3ljfKeWsvS.m_4821() <= 0.0F)) {
         f_14627.m_4421(var0, Class_29BIBbZyd5QWCwS1.m_988(var1), var2, var3, var4, var5);
      }
   }

   public static void m_5187(float var0, float var1, float var2, float var3, float var4, float var5, int var6) {
      m_5216(var0, var1, var2, var3, var4, new Vector4f(var5), var6);
   }

   public static void m_5188(float var0, float var1, float var2, float var3, float var4) {
      if (!(var2 <= 0.0F) && !(var3 <= 0.0F) && !(Class_Ssh31B3ljfKeWsvS.m_4821() <= 0.0F)) {
         if (Class_oDLvT3Io61u7HRHc.m_7743()) {
            Class_oDLvT3Io61u7HRHc.m_7752(var0, var1, var2, var3, var4);
         } else {
            if (DimasikClient.m_9057().m_9049().m_2801().m_3433().f_18172.m_8768()) {
               m_5211(var0, var1, var2, var3, var4 * 2.0F, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SHADOW));
            }

            if (DimasikClient.m_9057().m_9049().m_2801().m_3433().f_18173.m_8768()) {
               m_5219(var0, var1, var2, var3, f_14629, var4, -1);
            }

            m_5199(var0, var1, var2, var3, var4, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_BACKGROUND));
            Class_oDLvT3Io61u7HRHc.m_7738(var0, var1, var2, var3, var4);
         }
      }
   }

   public static void m_5189(float var0, float var1, float var2, float var3, Vector4f var4, Vector4i var5, Identifier var6) {
      m_5184(var0, var1, var2, var3, var4, new Vector4f(0.0F, 0.0F, 1.0F, 1.0F), var5, var6);
   }

   public static void m_5190(float var0, float var1, float var2, float var3, Vector4f var4, Vector4i var5, ItemStack var6) {
      f_14627.m_4442(var0, var1, var2, var3, var4, var5, var6);
   }

   public static void m_5191(float var0, float var1, float var2, float var3, float var4, int var5) {
      f_14627.m_4427(var0, var1, var2, var2, Math.clamp(var4, 0.0F, 1.0F), 10, new Vector4f(var3), var5);
   }

   public static void m_5192(Class_jZQ0pP9BTU3L7miy var0, Component var1, float var2, float var3, int var4, int var5) {
      if (var4 > 0 && var5 >>> 24 != 0 && !(Class_Ssh31B3ljfKeWsvS.m_4821() <= 0.0F)) {
         f_14627.m_4443(var0, Class_29BIBbZyd5QWCwS1.m_933(var1), var2, var3, var4, var5);
      }
   }

   public static void m_5193(Class_jZQ0pP9BTU3L7miy... var0) {
      f_14627.m_4411(var0);
   }

   public static void m_5194(float var0, float var1, float var2, float var3, Vector4f var4, Vector4f var5, Vector4i var6, GpuTextureView var7) {
      f_14627.m_4415(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   public static void m_5195(float var0, float var1, float var2, float var3, Vector4f var4, int var5) {
      float var6 = Math.max(Math.max(var4.x, var4.y), Math.max(var4.z, var4.w));
      if (!(var2 <= 0.0F) && !(var3 <= 0.0F) && !(var6 <= 0.0F)) {
         Vector4f var7 = Class_BftdentXEtGbugJw.m_2298(var5);
         int var8 = (int)(var7.x * f_14675);
         int var9 = (int)(var7.y * f_14676);
         int var10 = (int)(var7.z * f_14677);
         float var11 = var7.w * f_14678;

         for (int var12 = (int)var6; var12 > 0; var12--) {
            float var13 = 1.0F - var12 / var6;
            int var14 = (int)(var11 * f_14679 * var13 * var13);
            if (var14 > 0) {
               int var15 = Class_BftdentXEtGbugJw.m_2303(var8, var9, var10, var14);
               float var16 = var12;
               f_14627.m_4424(
                  var0 - var16,
                  var1 - var16,
                  var2 + var16 * 2.0F,
                  var3 + var16 * 2.0F,
                  0.0F,
                  7,
                  new Vector4f(var4).add(var16, var16, var16, var16),
                  new Vector4i(var15)
               );
            }
         }
      }
   }

   public static void m_5196(Class_jZQ0pP9BTU3L7miy... var0) {
      f_14627.m_4436(var0);
   }

   public static void m_5197(ItemStack var0, float var1, float var2, float var3, boolean var4, Class_Trm8dR6i9vMfnZEG.Class_6SoEwLZCu5bs5f6U var5) {
      if (var0 != null && !var0.isEmpty() && !(var3 <= 0.0F) && !(Class_Ssh31B3ljfKeWsvS.m_4821() <= 0.0F)) {
         m_5206(var1, var2, f_14646 * var3, f_14647 * var3, var0, false, var5);
         if (var4) {
            if (var0.isBarVisible()) {
               m_5199(var1 + 2.0F * var3, var2 + f_14648 * var3, f_14649 * var3, 2.0F * var3, 0.0F, f_14650);
               m_5199(var1 + 2.0F * var3, var2 + f_14651 * var3, var0.getBarWidth() * var3, var3, 0.0F, f_14652 | var0.getBarColor());
            }

            if (f_11537.player != null) {
               float var6 = f_11537.player.getCooldowns().getCooldownPercent(var0, f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true));
               if (var6 > 0.0F) {
                  m_5199(var1, var2 + f_14653 * var3 * (1.0F - var6), f_14654 * var3, f_14655 * var3 * var6, 0.0F, f_14656);
               }
            }

            if (var0.getCount() != 1) {
               String var9 = Integer.toString(var0.getCount());
               int var7 = Math.max(7, Math.round(f_14657 * var3));
               float var8 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var9, var7);
               m_5186(Class_y1y6QpONhWEUIdEB.m_9588(), var9, var1 + f_14658 * var3 - var8, var2 + f_14659 * var3 - var7, var7, -1);
            }
         }
      }
   }

   public static void m_5198(float var0, float var1, float var2, float var3, float var4, Vector4i var5) {
      m_5220(var0, var1, var2, var3, new Vector4f(var4), var5);
   }

   public static void m_5199(float var0, float var1, float var2, float var3, float var4, int var5) {
      m_5220(var0, var1, var2, var3, new Vector4f(var4), new Vector4i(var5));
   }

   public static void m_5200(float var0, float var1, float var2, float var3, float var4, Vector4i var5) {
      f_14627.m_4424(var0, var1, var2, var2, Math.clamp(var4, 0.0F, 1.0F), 10, new Vector4f(var3), var5);
   }

   public static void m_5201(Class_jZQ0pP9BTU3L7miy... var0) {
      f_14627.m_4410(var0);
   }

   public static void m_5202(
      float var0, float var1, float var2, float var3, Vector4f var4, Vector4i var5, ItemStack var6, Class_Trm8dR6i9vMfnZEG.Class_6SoEwLZCu5bs5f6U var7
   ) {
      f_14627.m_4422(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   @Generated
   private Class_U4Qsm43RVlUI3Pre() {
      throw new UnsupportedOperationException(f_14680);
   }

   public static void m_5203(float var0, float var1, float var2, float var3, ItemStack var4, boolean var5) {
      m_5190(var0, var1, var2, var3, new Vector4f(0.0F), new Vector4i(-1), var4);
      if (var5) {
         if (var4.getCount() > 1) {
            m_5186(
               Class_y1y6QpONhWEUIdEB.m_9588(),
               var4.getCount() + "",
               var0 + f_14660 - f_14661 - Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var4.getCount() + "", f_14662, 0.0F),
               var1 + f_14663,
               16,
               Class_BftdentXEtGbugJw.m_2310(0, 0, 0)
            );
            m_5186(
               Class_y1y6QpONhWEUIdEB.m_9588(),
               var4.getCount() + "",
               var0 + f_14664 - f_14665 - Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var4.getCount() + "", f_14666, 0.0F),
               var1 + f_14667,
               16,
               -1
            );
         }

         if (var4.isDamageableItem() && var4.isDamaged()) {
            float var6 = (float)(var4.getMaxDamage() - var4.getDamageValue()) / var4.getMaxDamage();
            int var7 = Math.round(var2 * var6);
            int var8 = Class_BftdentXEtGbugJw.m_2303((int)(f_14668 * (1.0F - var6)), (int)(f_14669 * var6), 0, f_14670);
            m_5199(var0, var1 + var3 - f_14671, var2, f_14672, 0.0F, Class_BftdentXEtGbugJw.m_2310(0, 0, 0));
            m_5199(var0, var1 + var3 - f_14673, var7, f_14674, 0.0F, var8);
         }
      }
   }

   public static void m_5204(boolean var0) {
      f_14627.m_4417(var0);
   }

   public static void m_5205(float var0, float var1, float var2, float var3, Vector4f var4, Vector4i var5, ItemStack var6) {
      f_14627.m_4420(var0, var1, var2, var3, var4, var5, var6);
   }

   public static void m_5206(float var0, float var1, float var2, float var3, ItemStack var4, boolean var5, Class_Trm8dR6i9vMfnZEG.Class_6SoEwLZCu5bs5f6U var6) {
      if (var4 != null && !var4.isEmpty() && !(var2 <= 0.0F) && !(var3 <= 0.0F) && !(Class_Ssh31B3ljfKeWsvS.m_4821() <= 0.0F)) {
         if (var6 == null) {
            m_5190(var0, var1, var2, var3, new Vector4f(0.0F), new Vector4i(-1), var4);
         } else {
            f_14627.m_4418(var0, var1, var2, var3, new Vector4f(0.0F), new Vector4i(-1), var4, var6);
         }

         if (var5) {
            if (var4.getCount() > 1) {
               m_5186(
                  Class_y1y6QpONhWEUIdEB.m_9588(),
                  var4.getCount() + "",
                  var0 + var2 / 2.0F - Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var4.getCount() + "", f_14637, 0.0F) / 2.0F,
                  var1 - f_14638,
                  11,
                  -1
               );
            }

            if (var4.isDamageableItem() && var4.isDamaged()) {
               float var7 = (float)(var4.getMaxDamage() - var4.getDamageValue()) / var4.getMaxDamage();
               int var8 = Math.round(var2 * var7);
               int var9 = Class_BftdentXEtGbugJw.m_2303((int)(f_14639 * (1.0F - var7)), (int)(f_14640 * var7), 0, f_14641);
               m_5199(var0, var1 + var3 - f_14642, var2, f_14643, 0.0F, Class_BftdentXEtGbugJw.m_2310(0, 0, 0));
               m_5199(var0, var1 + var3 - f_14644, var8, f_14645, 0.0F, var9);
            }
         }
      }
   }

   public static void m_5207() {
      f_14627.m_4435();
   }

   public static void m_5208() {
      f_14627.m_4431();
   }

   public static void m_5209(float var0, float var1, float var2, float var3, Vector4f var4, Vector4f var5, Vector4i var6, GpuTextureView var7) {
      f_14627.m_4416(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   public static void m_5210(float var0, float var1, float var2, float var3, float var4, float var5, Vector4i var6) {
      m_5212(var0, var1, var2, var3, var4, new Vector4f(var5), var6);
   }

   public static void m_5211(float var0, float var1, float var2, float var3, float var4, int var5) {
      m_5195(var0, var1, var2, var3, new Vector4f(var4), var5);
   }

   public static void m_5212(float var0, float var1, float var2, float var3, float var4, Vector4f var5, Vector4i var6) {
      f_14627.m_4424(var0, var1, var2, var3, var4, 9, var5, var6);
   }

   public static void m_5213(float var0, float var1, float var2, float var3, Vector4f var4, int var5) {
      m_5220(var0, var1, var2, var3, var4, new Vector4i(var5));
   }

   public static void m_5214(float var0, float var1, float var2, float var3, float var4, Vector4f var5, Vector4i var6) {
      f_14627.m_4424(var0, var1, var2, var3, var4, 8, var5, var6);
   }

   public static void m_5215(float var0, float var1, float var2, float var3, float var4) {
      if (!(var2 <= 0.0F) && !(var3 <= 0.0F) && !(Class_Ssh31B3ljfKeWsvS.m_4821() <= 0.0F)) {
         Hud var5 = DimasikClient.m_9057().m_9049().m_2801().m_3433();
         boolean var6 = var5.m_6162().m_8768();
         boolean var7 = var5.m_6185().m_8768();
         Vector4f var8 = new Vector4f(Math.clamp(var4, 0.0F, Math.min(var2, var3) * f_14630));
         if (var6 || var5.m_6157().m_8768()) {
            float var9 = var6 ? f_14631 : Math.max(f_14632, var4 * f_14633);
            int var10 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SHADOW);
            if (var6) {
               var10 = Class_BftdentXEtGbugJw.m_2306(var10, f_14634);
            }

            f_14627.m_4427(var0 - var9, var1 - var9, var2 + var9 * 2.0F, var3 + var9 * 2.0F, var9, 12, var8, var10);
         }

         if (var6 || var7) {
            f_14627.m_4427(var0, var1, var2, var3, var6 ? f_14635 : f_14636, 11, var8, -1);
         }

         int var11 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_BACKGROUND);
         if (var7 && !var6) {
            var11 = Class_BftdentXEtGbugJw.m_2303(
               Class_BftdentXEtGbugJw.m_2309(var11),
               Class_BftdentXEtGbugJw.m_2299(var11),
               Class_BftdentXEtGbugJw.m_2308(var11),
               Math.max(230, Class_BftdentXEtGbugJw.m_2297(var11))
            );
         }

         Vector4i var12 = var6 ? Class_oDLvT3Io61u7HRHc.m_7745(Class_y3cvEHXTSEF5dp8q.WINDOW_BACKGROUND) : new Vector4i(var11);
         f_14627.m_4424(var0, var1, var2, var3, 0.0F, 7, var8, var12);
      }
   }

   public static void m_5216(float var0, float var1, float var2, float var3, float var4, Vector4f var5, int var6) {
      m_5214(var0, var1, var2, var3, var4, var5, new Vector4i(var6));
   }

   public static void m_5217(float var0, float var1, float var2, float var3, Vector4f var4, Vector4i var5, GpuTextureView var6) {
      f_14627.m_4413(var0, var1, var2, var3, var4, var5, var6);
   }

   public static void m_5218(float var0, float var1, float var2, float var3, float var4, Vector4f var5, int var6) {
      m_5212(var0, var1, var2, var3, var4, var5, new Vector4i(var6));
   }

   public static void m_5219(float var0, float var1, float var2, float var3, float var4, float var5, int var6) {
      m_5212(var0, var1, var2, var3, var4, new Vector4f(var5), new Vector4i(var6));
   }

   public static void m_5220(float var0, float var1, float var2, float var3, Vector4f var4, Vector4i var5) {
      f_14627.m_4424(var0, var1, var2, var3, 0.0F, 7, var4, var5);
   }

   public static void m_5221(Class_jZQ0pP9BTU3L7miy var0, Component var1, float var2, float var3, int var4, int var5, float var6, float var7) {
      if (var4 > 0 && var5 >>> 24 != 0 && !(Class_Ssh31B3ljfKeWsvS.m_4821() <= 0.0F)) {
         f_14627.m_4437(var0, Class_29BIBbZyd5QWCwS1.m_933(var1), var2, var3, var4, var5, var6, var7);
      }
   }

   public static void m_5222(float var0, float var1, float var2, float var3, ItemStack var4, boolean var5) {
      m_5206(var0, var1, var2, var3, var4, var5, null);
   }
}
