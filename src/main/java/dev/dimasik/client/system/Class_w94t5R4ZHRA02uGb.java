package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.mixin.BossHealthOverlayMixin_2;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.world.scores.DisplaySlot;
import net.minecraft.world.scores.Objective;

public final class Class_w94t5R4ZHRA02uGb {
   private static final float f_34310 = 8.0F;
   private static final float f_34311 = 0.58F;
   private static final int f_34312 = 12;
   private static final int f_34313 = 5;
   private static final Class_w8fCJQ5ZtH5lQbWc f_34314 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, Class_w94t5R4ZHRA02uGb.f_34358, Class_eXr9Fra2ad3yFXY8.f_19100);
   private static final Class_w8fCJQ5ZtH5lQbWc f_34315 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, Class_w94t5R4ZHRA02uGb.f_34359, Class_eXr9Fra2ad3yFXY8.f_19100);
   private static final Map<Class_NO6SuGqq3FB7jQDZ, Float> f_34316 = new IdentityHashMap<>();
   private static float f_34317;
   private static float f_34318;
   private static float f_34319;
   private static float f_34320;
   private static boolean f_34321;
   private static float f_34322;
   private static float f_34323;
   private static float f_34324;
   private static float f_34325;
   private static float f_34326;
   private static boolean f_34327;
   private static boolean f_34328;
   private static boolean f_34329;
   private static float f_34330 = Float.POSITIVE_INFINITY;
   private static float f_34331 = Float.POSITIVE_INFINITY;
   private static float f_34332 = Float.NEGATIVE_INFINITY;
   private static float f_34333 = Float.NEGATIVE_INFINITY;
   private static final float f_34334 = 0.001F;
   private static final float f_34335 = 0.001F;
   private static final float f_34336 = 0.001F;
   private static final float f_34337 = 0.001F;
   private static final float f_34338 = 0.001F;
   private static final float f_34339 = 8.0F;
   private static final float f_34340 = 8.0F;
   private static final float f_34341 = 8.0F;
   private static final float f_34342 = 4.0F;
   private static final float f_34343 = 3.0F;
   private static final float f_34344 = 19.0F;
   private static final float f_34345 = 91.0F;
   private static final float f_34346 = 0.5F;
   private static final float f_34347 = 12.0F;
   private static final String f_34348 = "hud_without_config";
   private static final float f_34349 = 0.5F;
   private static final float f_34350 = 0.58F;
   private static final float f_34351 = 8.0F;
   private static final float f_34352 = 8.0F;
   private static final float f_34353 = 0.01F;
   private static final float f_34354 = 8.0F;
   private static final float f_34355 = 8.0F;
   private static final float f_34356 = 0.001F;
   private static final float f_34357 = 8.0F;
   private static final float f_34358 = 14.0F;
   private static final float f_34359 = 14.0F;

   private static boolean m_9289(float var0, float var1, float var2, float var3) {
      return f_34327 && !(f_34326 <= 1.0F) ? m_9303(var0, var1, var2, var3, f_34323, f_34324, f_34325, f_34326) : false;
   }

   private static float m_9290(float var0, float var1, float var2, float var3, float var4) {
      if (!m_9292(var0, var1, var2, var3)) {
         return 0.0F;
      }

      float var5 = 0.0F;
      if (m_9302(var0, var1, var2, var3)) {
         var5 = Math.max(var5, f_34320);
      }

      if (m_9289(var0, var1, var2, var3)) {
         var5 = Math.max(var5, f_34326);
      }

      float var6 = Math.max(0.0F, Math.min(f_34322, var5) + f_34354 - var1);
      float var7 = Math.max(0.0F, var4 - f_34355 - (var1 + var3));
      return Math.min(var6, var7);
   }

   public static float m_9291(float var0, float var1, float var2, float var3) {
      Minecraft var4 = Minecraft.getInstance();
      if (var4.getWindow() == null) {
         return 0.0F;
      }

      float var5 = Math.max(1.0F, var4.getWindow().getGuiScale());
      return m_9295(var0 * var5, var1 * var5, var2 * var5, var3 * var5) / var5;
   }

   private static boolean m_9292(float var0, float var1, float var2, float var3) {
      return m_9302(var0, var1, var2, var3) || m_9289(var0, var1, var2, var3);
   }

   public static void m_9293() {
      f_34329 = false;
      if (f_34332 > f_34330 && f_34333 > f_34331) {
         Minecraft var0 = Minecraft.getInstance();
         if (var0.getWindow() != null) {
            float var1 = var0.getWindow().getGuiScale();
            f_34317 = f_34330 * var1;
            f_34318 = f_34331 * var1;
            f_34319 = f_34332 * var1;
            f_34320 = f_34333 * var1;
            f_34321 = true;
         }
      }
   }

   public static void m_9294() {
      if (!f_34328) {
         f_34329 = false;
      } else {
         f_34329 = true;
         f_34330 = Float.POSITIVE_INFINITY;
         f_34331 = Float.POSITIVE_INFINITY;
         f_34332 = Float.NEGATIVE_INFINITY;
         f_34333 = Float.NEGATIVE_INFINITY;
      }
   }

   public static float m_9295(float var0, float var1, float var2, float var3) {
      if (m_9298() && !(f_34322 <= 1.0F) && !(var2 <= 1.0F) && !(var3 <= 1.0F)) {
         Minecraft var4 = Minecraft.getInstance();
         return var4.getWindow() == null ? 0.0F : m_9290(var0, var1, var2, var3, var4.getWindow().getScreenHeight());
      } else {
         return 0.0F;
      }
   }

   public static float m_9296(Class_NO6SuGqq3FB7jQDZ var0) {
      if (m_9298() && var0 != null) {
         Float var1 = f_34316.get(var0);
         return var1 == null ? 0.0F : var1;
      } else {
         return 0.0F;
      }
   }

   private static void m_9297(Minecraft var0) {
      Class_V7bm8pF2tjL9Evnq var1;
      try {
         var1 = DimasikClient.m_9057().m_9049().m_2808();
      } catch (Throwable var14) {
         return;
      }

      if (var1 != null) {
         float var2 = var0.getWindow().getScreenHeight();
         ArrayList var3 = new ArrayList();
         ArrayList var4 = new ArrayList();
         ArrayList var5 = new ArrayList();

         for (Class_NO6SuGqq3FB7jQDZ var7 : var1) {
            if (!f_34348.equals(var7.m_4006()) && !(var7 instanceof Class_UiQ3442HnvvsK2qb)) {
               float var8 = var7.m_1757();
               float var9 = var7.m_1758();
               if (!(var8 <= 1.0F) && !(var9 <= 1.0F)) {
                  float var10 = var7.m_3999();
                  float var11 = var7.m_3998();
                  boolean var12 = m_9302(var11, var10, var8, var9);
                  boolean var13 = m_9289(var11, var10, var8, var9);
                  if (var12 || var13) {
                     if (var12) {
                        if (var10 + var9 * f_34349 > var2 * f_34350) {
                           var4.add(var7);
                        } else {
                           var3.add(var7);
                        }
                     } else {
                        var5.add(var7);
                     }
                  }
               }
            }
         }

         m_9305(var3, var2);
         m_9305(var4, var2);
         m_9305(var5, var2);
      }
   }

   public static boolean m_9298() {
      return f_34328;
   }

   private static float m_9299(Minecraft var0) {
      if (var0.gui.hud != null && var0.getWindow() != null) {
         int var1;
         try {
            var1 = ((BossHealthOverlayMixin_2)var0.gui.hud.getBossOverlay()).getBossBars().size();
         } catch (Throwable var8) {
            return 0.0F;
         }

         if (var1 <= 0) {
            return 0.0F;
         }

         float var2 = var0.getWindow().getGuiScale();
         int var3 = 10 + Math.max(1, 9);
         int var4 = Math.max(var3, var0.getWindow().getGuiScaledHeight() / 3);
         int var5 = 0;
         int var6 = 12;

         for (int var7 = 0; var7 < var1; var7++) {
            var5++;
            var6 += var3;
            if (var6 >= var4) {
               break;
            }
         }

         return (12 + (var5 - 1) * var3 + 5) * var2;
      } else {
         return 0.0F;
      }
   }

   public static boolean m_9300() {
      return f_34328 && f_34314.m_9288() > f_34337 && f_34321;
   }

   public static void m_9301() {
      Minecraft var0 = Minecraft.getInstance();
      f_34328 = m_9307();
      if (!f_34328) {
         f_34314.m_9281(0.0F);
         f_34315.m_9281(0.0F);
         f_34316.clear();
         f_34321 = false;
         f_34327 = false;
         f_34322 = 0.0F;
         f_34329 = false;
      } else {
         boolean var1 = m_9309(var0);
         f_34314.m_9283(var1 && f_34321 ? 1.0F : 0.0F);
         if (!var1 && f_34314.m_9288() <= f_34334) {
            f_34321 = false;
         }

         boolean var2 = var1 || f_34314.m_9288() > f_34335;
         m_9308(var0, var2);
         float var3 = 0.0F;
         if (f_34321 && f_34314.m_9288() > f_34336) {
            var3 = Math.max(var3, f_34320);
         }

         if (f_34327) {
            var3 = Math.max(var3, f_34326);
         }

         f_34315.m_9283(var3);
         f_34322 = f_34315.m_9288();
         f_34316.clear();
         if (f_34328 && !(f_34322 <= 1.0F) && var0.getWindow() != null) {
            m_9297(var0);
         }
      }
   }

   private Class_w94t5R4ZHRA02uGb() {
   }

   private static boolean m_9302(float var0, float var1, float var2, float var3) {
      return f_34321 && !(f_34314.m_9288() <= f_34356) ? m_9303(var0, var1, var2, var3, f_34317, f_34318, f_34319, f_34320) : false;
   }

   private static boolean m_9303(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      return var0 < var6 && var0 + var2 > var4 && var1 < var7 + f_34357 && var1 + var3 > var5;
   }

   public static float m_9304(float var0, float var1) {
      if (!f_34328) {
         return 0.0F;
      }

      float var2 = f_34314.m_9288();
      if (!(var2 <= f_34338) && f_34321) {
         Minecraft var3 = Minecraft.getInstance();
         if (var3.getWindow() == null) {
            return 0.0F;
         }

         float var4 = Math.max(1.0F, var3.getWindow().getGuiScale());
         float var5 = f_34320 / var4 + f_34339 / var4;
         float var6 = var5 - var0;
         if (var6 <= 0.0F) {
            return 0.0F;
         }

         float var7 = var3.getWindow().getGuiScaledHeight() - f_34340 / var4 - (var0 + var1);
         return Math.min(var6, Math.max(0.0F, var7)) * var2;
      } else {
         return 0.0F;
      }
   }

   private static void m_9305(List<Class_NO6SuGqq3FB7jQDZ> var0, float var1) {
      if (!var0.isEmpty()) {
         float var2 = Float.POSITIVE_INFINITY;
         float var3 = Float.NEGATIVE_INFINITY;
         float var4 = 0.0F;

         for (Class_NO6SuGqq3FB7jQDZ var6 : var0) {
            float var7 = var6.m_3998();
            float var8 = var6.m_3999();
            float var9 = var6.m_1757();
            float var10 = var6.m_1758();
            var2 = Math.min(var2, var8);
            var3 = Math.max(var3, var8 + var10);
            if (m_9302(var7, var8, var9, var10)) {
               var4 = Math.max(var4, f_34320);
            }

            if (m_9289(var7, var8, var9, var10)) {
               var4 = Math.max(var4, f_34326);
            }
         }

         float var11 = Math.max(0.0F, Math.min(f_34322, var4) + f_34351 - var2);
         float var13 = Math.max(0.0F, var1 - f_34352 - var3);
         var11 = Math.min(var11, var13);
         if (!(var11 <= f_34353)) {
            for (Class_NO6SuGqq3FB7jQDZ var15 : var0) {
               f_34316.put(var15, var11);
            }
         }
      }
   }

   public static void m_9306(int var0, int var1, int var2, int var3) {
      if (f_34329) {
         float var4 = Math.min(var0, var2);
         float var5 = Math.max(var0, var2);
         float var6 = Math.min(var1, var3);
         float var7 = Math.max(var1, var3);
         if (!(var5 - var4 < f_34341) && !(var7 - var6 < f_34342)) {
            f_34330 = Math.min(f_34330, var4);
            f_34331 = Math.min(f_34331, var6);
            f_34332 = Math.max(f_34332, var5);
            f_34333 = Math.max(f_34333, var7);
         }
      }
   }

   private static boolean m_9307() {
      try {
         Class_Q49u2s432M4ulFXV.CwiKd8zPwK2PGGOy var0 = new Class_Q49u2s432M4ulFXV.CwiKd8zPwK2PGGOy();
         DimasikClient.m_9057().m_9051().m_9708(var0);
         return var0.m_4234();
      } catch (Throwable var1) {
         return false;
      }
   }

   private static void m_9308(Minecraft var0, boolean var1) {
      f_34327 = false;
      f_34323 = 0.0F;
      f_34324 = 0.0F;
      f_34325 = 0.0F;
      f_34326 = 0.0F;
      if (var0.getWindow() != null) {
         int var2;
         try {
            if (var0.gui.hud == null) {
               return;
            }

            var2 = ((BossHealthOverlayMixin_2)var0.gui.hud.getBossOverlay()).getBossBars().size();
         } catch (Throwable var8) {
            return;
         }

         if (var2 > 0) {
            float var3 = m_9299(var0);
            if (!(var3 <= 0.0F)) {
               float var4 = var0.getWindow().getGuiScale();
               float var5 = 0.0F;
               if (var1 && f_34321) {
                  var5 = m_9304(f_34343, var2 * f_34344) * var4;
               }

               float var6 = f_34345 * var4;
               float var7 = var0.getWindow().getScreenWidth() * f_34346;
               f_34323 = var7 - var6;
               f_34325 = var7 + var6;
               f_34324 = f_34347 * var4 + var5;
               f_34326 = var3 + var5;
               f_34327 = f_34325 > f_34323 && f_34326 > f_34324;
            }
         }
      }
   }

   private static boolean m_9309(Minecraft var0) {
      if (var0.player == null || var0.options == null || var0.getConnection() == null || var0.level == null) {
         return false;
      }

      if (!var0.options.keyPlayerList.isDown()) {
         return false;
      }

      if (!var0.isLocalServer()) {
         return true;
      }

      int var1 = var0.getConnection().getListedOnlinePlayers().size();
      Objective var2 = var0.level.getScoreboard().getDisplayObjective(DisplaySlot.LIST);
      return var1 > 1 || var2 != null;
   }
}
