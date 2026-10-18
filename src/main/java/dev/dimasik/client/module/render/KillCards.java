package dev.dimasik.client.module.render;

import com.mojang.blaze3d.textures.FilterMode;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.module.combat.AntiBot;
import dev.dimasik.client.module.combat.Aura;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.system.Class_8M6KWDCphbBjAqSQ;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_eXr9Fra2ad3yFXY8;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_qyFZUkNc6oUs6ojL;
import dev.dimasik.client.system.Class_w8fCJQ5ZtH5lQbWc;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_wjdoxQGtI8mFyL6U;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.network.protocol.game.ClientboundEntityEventPacket;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.player.Player;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.joml.Vector4i;

public class KillCards extends Module {
   private static final Identifier f_25304 = Class_wHRRCm2tlLY7DN4I.m_9311(KillCards.f_25454);
   private static final Identifier f_25305 = Class_wHRRCm2tlLY7DN4I.m_9311(KillCards.f_25455);
   private static final Identifier f_25306 = Class_wHRRCm2tlLY7DN4I.m_9311(KillCards.f_25456);
   private static final Identifier f_25307 = Class_wHRRCm2tlLY7DN4I.m_9311(KillCards.f_25457);
   private static final Vector4f f_25308 = new Vector4f(0.0F, 0.0F, 1.0F, 1.0F);
   private static final int f_25309 = 5;
   private static final long f_25310 = 300000L;
   private static final long f_25311 = 3500L;
   private static final float f_25312 = 176.0F;
   private static final float f_25313 = 48.0F;
   private static final float f_25314 = 32.0F;
   private static final float f_25315 = 50.0F;
   private final CheckboxSetting f_25316;
   private final CheckboxSetting f_25317;
   private final List<KillCards.Class_6dc88X8jHPSkDBEU> f_25318;
   private final List<KillCards.EnGafDMBKQIscOgk> f_25319;
   private final Class_w8fCJQ5ZtH5lQbWc f_25320;
   private final Class_gEPk7yDw6CwIte87<Class_wjdoxQGtI8mFyL6U> f_25321;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_25322;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_25323;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_25324;
   private static final String f_25325 = "KillCards";
   private static final String f_25326 = "Карточки последних убийств в стиле CS2";
   private static final String f_25327 = "Работать на мобов";
   private static final String f_25328 = "Свечение";
   private static final float f_25329 = 12.0F;
   private static final long f_25330 = 300L;
   private static final float f_25331 = 0.26F;
   private static final float f_25332 = 640.0F;
   private static final float f_25333 = 420.0F;
   private static final float f_25334 = 18.0F;
   private static final float f_25335 = 176.0F;
   private static final float f_25336 = 0.5F;
   private static final float f_25337 = 52.0F;
   private static final float f_25338 = 0.01F;
   private static final float f_25339 = 0.01F;
   private static final float f_25340 = 255.0F;
   private static final float f_25341 = 48.0F;
   private static final float f_25342 = 0.5F;
   private static final float f_25343 = 176.0F;
   private static final float f_25344 = 8.0F;
   private static final float f_25345 = 0.5F;
   private static final float f_25346 = 0.5F;
   private static final float f_25347 = 50.0F;
   private static final float f_25348 = 10.0F;
   private static final float f_25349 = 0.02F;
   private static final float f_25350 = 0.55F;
   private static final float f_25351 = 0.5F;
   private static final float f_25352 = 48.0F;
   private static final float f_25353 = 14.0F;
   private static final float f_25354 = 0.5F;
   private static final float f_25355 = 0.52F;
   private static final float f_25356 = 0.5F;
   private static final float f_25357 = 14.0F;
   private static final float f_25358 = 5.0F;
   private static final float f_25359 = 64.0F;
   private static final float f_25360 = 18.0F;
   private static final float f_25361 = 0.5F;
   private static final float f_25362 = 0.72F;
   private static final float f_25363 = 0.45F;
   private static final float f_25364 = 0.58F;
   private static final float f_25365 = 1.12F;
   private static final float f_25366 = 0.22F;
   private static final float f_25367 = 0.5F;
   private static final float f_25368 = 0.5F;
   private static final float f_25369 = 0.38F;
   private static final float f_25370 = 0.5F;
   private static final float f_25371 = 0.55F;
   private static final float f_25372 = 1.15F;
   private static final float f_25373 = 1.45F;
   private static final float f_25374 = 0.5F;
   private static final float f_25375 = 0.82F;
   private static final float f_25376 = 0.02F;
   private static final float f_25377 = 86.0F;
   private static final float f_25378 = 28.0F;
   private static final float f_25379 = 0.5F;
   private static final float f_25380 = 0.5F;
   private static final float f_25381 = 1.2F;
   private static final float f_25382 = 3.8F;
   private static final float f_25383 = 1.6F;
   private static final float f_25384 = 0.42F;
   private static final float f_25385 = 32.0F;
   private static final float f_25386 = 50.0F;
   private static final float f_25387 = 10.0F;
   private static final long f_25388 = 300000L;
   private static final float f_25389 = 0.86F;
   private static final float f_25390 = 0.14F;
   private static final float f_25391 = 1.06F;
   private static final float f_25392 = 0.5F;
   private static final float f_25393 = 2.2F;
   private static final float f_25394 = 2.6F;
   private static final float f_25395 = 16.0F;
   private static final float f_25396 = 0.5F;
   private static final float f_25397 = 0.4F;
   private static final float f_25398 = 0.01F;
   private static final float f_25399 = 3.4F;
   private static final float f_25400 = 205.0F;
   private static final float f_25401 = 1.15F;
   private static final float f_25402 = 0.7F;
   private static final float f_25403 = 0.4F;
   private static final float f_25404 = 3.4F;
   private static final float f_25405 = 0.84F;
   private static final float f_25406 = 0.16F;
   private static final float f_25407 = 0.05F;
   private static final float f_25408 = 1.4F;
   private static final float f_25409 = 1.4F;
   private static final float f_25410 = 2.8F;
   private static final float f_25411 = 2.8F;
   private static final float f_25412 = 2.4F;
   private static final float f_25413 = 0.12F;
   private static final float f_25414 = 7.2F;
   private static final float f_25415 = 0.92F;
   private static final float f_25416 = 2.6F;
   private static final float f_25417 = 2.8F;
   private static final float f_25418 = 2.6F;
   private static final float f_25419 = 2.8F;
   private static final float f_25420 = 18.5F;
   private static final float f_25421 = 0.5F;
   private static final float f_25422 = 0.5F;
   private static final float f_25423 = 0.4F;
   private static final float f_25424 = 0.7F;
   private static final float f_25425 = 0.7F;
   private static final float f_25426 = 140.0F;
   private static final float f_25427 = 0.5F;
   private static final float f_25428 = 236.0F;
   private static final float f_25429 = 0.58F;
   private static final float f_25430 = 0.5F;
   private static final float f_25431 = 0.02F;
   private static final float f_25432 = 0.5F;
   private static final float f_25433 = 0.03F;
   private static final float f_25434 = 0.18F;
   private static final float f_25435 = 1.15F;
   private static final float f_25436 = 0.04F;
   private static final float f_25437 = 0.5F;
   private static final float f_25438 = 1.5F;
   private static final float f_25439 = 1.5F;
   private static final float f_25440 = 3.0F;
   private static final float f_25441 = 3.0F;
   private static final float f_25442 = 0.95F;
   private static final float f_25443 = 3.0F;
   private static final float f_25444 = 0.5F;
   private static final float f_25445 = 0.16F;
   private static final long f_25446 = 480L;
   private static final long f_25447 = 50L;
   private static final float f_25448 = 50.0F;
   private static final long f_25449 = 50L;
   private static final float f_25450 = 430.0F;
   private static final int f_25451 = -16777216;
   private static final long f_25452 = 300000L;
   private static final float f_25453 = 0.02F;
   private static final String f_25454 = "hud/killcards/logo";
   private static final String f_25455 = "hud/killcards/skull";
   private static final String f_25456 = "hud/killcards/glow";
   private static final String f_25457 = "hud/killcards/beam";

   private float m_7539() {
      if (this.f_25319.isEmpty()) {
         return 0.0F;
      }

      long var1 = System.currentTimeMillis() - this.f_25319.get(this.f_25319.size() - 1).f_25299;
      if (var1 < 0L || var1 > f_25446) {
         return 0.0F;
      }

      if (var1 < f_25447) {
         return (float)var1 / f_25448;
      }

      float var3 = 1.0F - (float)(var1 - f_25449) / f_25450;
      return var3 * var3;
   }

   private void m_7541(float var1, float var2, float var3, float var4, float var5, int var6, boolean var7, float var8) {
      int var9 = this.m_7562();
      boolean var10 = this.f_25317.m_8768();
      float var11 = var7 ? 0.0F : this.m_7539();
      float var12 = f_25341 * var4;
      float var13 = var1 + (var3 - var12) * f_25342;
      float var14 = var2 + f_25343 * var4 - var12 - f_25344 * var4;
      float var15 = var13 + var12 * f_25345;
      float var16 = var14 + var12 * f_25346;
      float var17 = f_25347 * var4;
      float var18 = var14 - var17 + f_25348 * var4;
      if (var10 && var11 > f_25349) {
         this.m_7557(var15, var18, var17, var16, var12, var4, var9, var8, var11);
      }

      this.m_7549(var1, var3, var5, var16, var4, var9, var8, var10, var11);
      this.m_7552(var15, var14, var4, var6, var7, var9, var8, var10, var11);
      this.m_7556(var13, var14, var12, var9, var8);
   }

   private void m_7542() {
      long var1 = System.currentTimeMillis();
      this.f_25319.removeIf(var2 -> {
         if (var1 - var2.f_25299 < f_25452) {
            return false;
         }

         var2.f_25301.m_9283(0.0F);
         return var2.f_25301.m_9288() < f_25453;
      });

      while (this.f_25319.size() > 5) {
         this.f_25319.remove(0);
      }
   }

   private boolean m_7543(LivingEntity var1) {
      KillCards.Class_6dc88X8jHPSkDBEU var2 = this.m_7547(var1);
      return var2 != null && var2.m_7537() && var2.f_25295;
   }

   private void m_7545(Class_XzpX8S5F5zd9jbuE var1) {
      if (this.m_776() && f_11537.level != null) {
         if (var1.m_5619() instanceof ClientboundEntityEventPacket var2) {
            if (var2.getEntity(f_11537.level) instanceof LivingEntity var4 && this.m_7554(var4)) {
               if (this.m_7543(var4)) {
                  if (var2.getEventId() == 3) {
                     f_11537.execute(() -> this.m_7560(var4));
                  }
               }
            }
         }
      }
   }

   private void m_7546(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.level != null && f_11537.player != null) {
         try {
            Aura var2 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
            if (var2 != null && var2.m_776() && var2.m_1114() instanceof LivingEntity var3 && var3.isAlive()) {
               this.m_7550(var3, true);
            }
         } catch (Throwable var6) {
         }

         Iterator var7 = this.f_25318.iterator();

         while (var7.hasNext()) {
            KillCards.Class_6dc88X8jHPSkDBEU var8 = (KillCards.Class_6dc88X8jHPSkDBEU)var7.next();
            if (!var8.m_7537()) {
               var7.remove();
            } else {
               LivingEntity var9 = var8.f_25292;
               boolean var5 = f_11537.level.getEntity(var9.getId()) == null;
               if ((var9.getHealth() <= 0.0F || !var9.isAlive() || var5) && var8.f_25295 && !var8.f_25296) {
                  this.m_7560(var9);
                  var8.m_7535(f_25330);
               }
            }
         }

         this.f_25318.removeIf(var0 -> !var0.m_7537());
         this.m_7542();
      } else {
         this.f_25318.clear();
         this.f_25319.clear();
      }
   }

   private KillCards.Class_6dc88X8jHPSkDBEU m_7547(LivingEntity var1) {
      if (var1 == null) {
         return null;
      }

      for (KillCards.Class_6dc88X8jHPSkDBEU var3 : this.f_25318) {
         if (var3.f_25292.getId() == var1.getId()) {
            return var3;
         }
      }

      return null;
   }

   @Override
   public void m_732() {
      this.f_25318.clear();
      this.m_7559();
   }

   private void m_7549(float var1, float var2, float var3, float var4, float var5, int var6, float var7, boolean var8, float var9) {
      float var10 = var1 + (var2 - var3) * f_25370;
      float var11 = var4 - f_25371 * var5;
      float var12 = Math.max(f_25372, f_25373 * var5);
      float var13 = var3 * f_25374;
      int var14 = Class_BftdentXEtGbugJw.m_2306(var6, 0.0F);
      int var15 = Class_BftdentXEtGbugJw.m_2306(var6, (var8 ? 1.0F : f_25375) * var7);
      Class_Ssh31B3ljfKeWsvS.m_4843(var10, var11, var13, var12, 0.0F, new Vector4i(var14, var14, var15, var15));
      Class_Ssh31B3ljfKeWsvS.m_4843(var10 + var13, var11, var13, var12, 0.0F, new Vector4i(var15, var15, var14, var14));
      if (var8 && var9 > f_25376) {
         float var16 = (f_25377 + f_25378 * var9) * var5;
         float var17 = var1 + var2 * f_25379;
         Class_Ssh31B3ljfKeWsvS.m_4817(
            var17 - var16 * f_25380, var11 - f_25381 * var5, var16, f_25382 * var5, f_25383 * var5, Class_BftdentXEtGbugJw.m_2306(var6, f_25384 * var9 * var7)
         );
      }
   }

   private void m_7550(LivingEntity var1, boolean var2) {
      if (this.m_7554(var1)) {
         for (KillCards.Class_6dc88X8jHPSkDBEU var4 : this.f_25318) {
            if (var4.f_25292.getId() == var1.getId()) {
               var4.m_7538(var1);
               if (var2) {
                  var4.m_7536();
               }

               return;
            }
         }

         if (var2) {
            KillCards.Class_6dc88X8jHPSkDBEU var5 = new KillCards.Class_6dc88X8jHPSkDBEU(var1);
            var5.m_7536();
            this.f_25318.add(var5);
         }
      }
   }

   private boolean m_7551(LivingEntity var1) {
      if (var1 instanceof Player var2) {
         try {
            AntiBot var3 = DimasikClient.m_9057().m_9049().m_2801().m_3581();
            return var3 != null && var3.m_776() && var3.f_33163.contains(var2);
         } catch (Throwable var4) {
            return false;
         }
      } else {
         return false;
      }
   }

   private void m_7552(float var1, float var2, float var3, int var4, boolean var5, int var6, float var7, boolean var8, float var9) {
      if (var4 > 0) {
         float var10 = f_25385 * var3;
         float var11 = f_25386 * var3;
         float var12 = var2 - var11 + f_25387 * var3;

         for (int var13 = 0; var13 < var4; var13++) {
            float var14 = 1.0F;
            float var15 = var7;
            if (!var5 && var13 < this.f_25319.size()) {
               KillCards.EnGafDMBKQIscOgk var16 = this.f_25319.get(var13);
               var16.f_25300.m_9283(1.0F);
               boolean var17 = System.currentTimeMillis() - var16.f_25299 >= f_25388;
               var16.f_25301.m_9283(var17 ? 0.0F : 1.0F);
               var14 = var16.f_25300.m_9288();
               var15 *= var16.f_25301.m_9288();
            }

            boolean var27 = var13 == var4 - 1;
            float var28 = Math.max(0.0F, var14);
            float var18 = f_25389 + f_25390 * Math.min(var28, f_25391);
            int var19 = var4 - 1 - var13;
            float var20 = var4 == 1 ? 0.0F : ((float)var13 / (var4 - 1) - f_25392) * 2.0F;
            float var21 = var10 * var18;
            float var22 = var11 * var18;
            float var23 = var20 * f_25393 * var3;
            float var24 = -var19 * f_25394 * var3 + (1.0F - Math.min(var28, 1.0F)) * f_25395 * var3;
            float var25 = var1 - var21 * f_25396 + var23;
            float var26 = var12 + (var11 - var22) + var24;
            this.m_7561(var25, var26, var21, var22, var13 + 1, var27, var6, var15 * Math.min(1.0F, f_25397 + var28), var8, var3, var27 ? var9 : 0.0F);
         }
      }
   }

   public KillCards() {
      super(f_25325, f_25326, Category.RENDER);
      this.f_25316 = new CheckboxSetting(f_25327, false);
      this.f_25317 = new CheckboxSetting(f_25328, true);
      this.f_25318 = new ArrayList<>();
      this.f_25319 = new ArrayList<>();
      this.f_25320 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_25329, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_25321 = this::m_7555;
      this.f_25322 = this::m_7545;
      this.f_25323 = this::m_7546;
      this.f_25324 = this::m_7553;
      this.m_795(this.f_25316, this.f_25317);
   }

   private void m_7553(Class_bhRaN0YSSLQRYjPo var1) {
      if (f_11537.player != null && f_11537.getWindow() != null) {
         this.m_7542();
         float var2 = Class_qyFZUkNc6oUs6ojL.m_8354();
         float var3 = f_11537.getWindow().getScreenWidth();
         float var4 = f_11537.getWindow().getScreenHeight();
         float var5 = Math.min(var3 * f_25331, f_25332 * var2);
         var5 = Math.max(var5, f_25333 * var2);
         float var6 = var5 + f_25334 * var2;
         float var7 = f_25335 * var2;
         Class_8M6KWDCphbBjAqSQ var8 = this.m_7558();
         boolean var9 = f_11537.gui.screen() instanceof ChatScreen;
         boolean var10 = var9 && this.f_25319.isEmpty();
         boolean var11 = !this.f_25319.isEmpty() || var10;
         this.f_25320.m_9283(var11 ? 1.0F : 0.0F);
         float var12 = this.f_25320.m_9288();
         float var13 = (var3 - var6) * f_25336;
         float var14 = var4 - var7 - f_25337 * var2;
         float var15 = var8 != null && var8.m_1759() ? var8.m_3998() : var13;
         float var16 = var8 != null && var8.m_1759() ? var8.m_3993() : var14;
         if (var8 != null) {
            if (var12 > f_25338) {
               var8.m_1760(var13, var14, var6, var7);
               var15 = var8.m_3998();
               var16 = var8.m_3993();
            } else {
               var8.m_4012(0.0F);
               var8.m_4007(0.0F);
            }
         }

         if (!(var12 < f_25339)) {
            Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
            Class_Ssh31B3ljfKeWsvS.m_4864(f_25340 * var12);

            try {
               int var17 = var10 ? 2 : this.f_25319.size();
               this.m_7541(var15, var16, var6, var2, var5, var17, var10, var12);
            } finally {
               Class_Ssh31B3ljfKeWsvS.m_4844();
               Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
            }
         }
      } else {
         this.m_7559();
      }
   }

   private boolean m_7554(LivingEntity var1) {
      if (var1 == null || var1 == f_11537.player || var1 instanceof ArmorStand) {
         return false;
      } else if (this.m_7551(var1)) {
         return false;
      } else {
         return var1 instanceof Player ? true : this.f_25316.m_8768();
      }
   }

   private void m_7555(Class_wjdoxQGtI8mFyL6U var1) {
      if (this.m_776() && var1.m_9372() == Class_wjdoxQGtI8mFyL6U.Class_327mRdjAqNoPaemJ.POST && var1.m_9371() == f_11537.player) {
         if (var1.m_9370() instanceof LivingEntity var2 && var2.isAlive()) {
            this.m_7550(var2, true);
         }
      }
   }

   private void m_7556(float var1, float var2, float var3, int var4, float var5) {
      Class_Ssh31B3ljfKeWsvS.m_4817(var1, var2, var3, var3, var3 * f_25427, Class_BftdentXEtGbugJw.m_2303(10, 12, 16, (int)(f_25428 * var5)));
      float var6 = var3 * f_25429;
      float var7 = var1 + (var3 - var6) * f_25430 - var3 * f_25431;
      float var8 = var2 + (var3 - var6) * f_25432 - var3 * f_25433;
      Class_Ssh31B3ljfKeWsvS.m_4829(var7, var8, var6, var6, 0.0F, f_25308, Class_BftdentXEtGbugJw.m_2306(var4, var5), f_25304, FilterMode.LINEAR);
      int var9 = Class_BftdentXEtGbugJw.m_2302(var4, Class_BftdentXEtGbugJw.m_2310(255, 255, 255), f_25434);
      Class_Ssh31B3ljfKeWsvS.m_4854(var1, var2, var3, var3, Math.max(f_25435, var3 * f_25436), var3 * f_25437, Class_BftdentXEtGbugJw.m_2306(var9, var5));
      Class_Ssh31B3ljfKeWsvS.m_4854(
         var1 + f_25438,
         var2 + f_25439,
         var3 - f_25440,
         var3 - f_25441,
         f_25442,
         (var3 - f_25443) * f_25444,
         Class_BftdentXEtGbugJw.m_2306(Class_BftdentXEtGbugJw.m_2310(255, 255, 255), f_25445 * var5)
      );
   }

   private void m_7557(float var1, float var2, float var3, float var4, float var5, float var6, int var7, float var8, float var9) {
      float var10 = var8 * var9;
      int var11 = Class_BftdentXEtGbugJw.m_2302(var7, Class_BftdentXEtGbugJw.m_2310(255, 255, 255), f_25350);
      float var12 = var2 + var3 * f_25351;
      float var13 = (f_25352 + f_25353 * var9) * var6;
      Class_Ssh31B3ljfKeWsvS.m_4829(
         var1 - var13 * f_25354,
         var12 - var13 * f_25355,
         var13,
         var13,
         0.0F,
         f_25308,
         Class_BftdentXEtGbugJw.m_2306(var7, f_25356 * var10),
         f_25306,
         FilterMode.LINEAR
      );
      float var14 = (f_25357 + f_25358 * var9) * var6;
      float var15 = (f_25359 + f_25360 * var9) * var6;
      Class_Ssh31B3ljfKeWsvS.m_4829(
         var1 - var14 * f_25361,
         var12 - var15 * f_25362,
         var14,
         var15,
         var14 * f_25363,
         f_25308,
         Class_BftdentXEtGbugJw.m_2306(var11, f_25364 * var10),
         f_25307,
         FilterMode.LINEAR
      );
      float var16 = var5 * (f_25365 + f_25366 * var9);
      Class_Ssh31B3ljfKeWsvS.m_4829(
         var1 - var16 * f_25367,
         var4 - var16 * f_25368,
         var16,
         var16,
         0.0F,
         f_25308,
         Class_BftdentXEtGbugJw.m_2306(var7, f_25369 * var10),
         f_25306,
         FilterMode.LINEAR
      );
   }

   private Class_8M6KWDCphbBjAqSQ m_7558() {
      try {
         return DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null ? DimasikClient.m_9057().m_9049().m_2808().m_5368() : null;
      } catch (Throwable var2) {
         return null;
      }
   }

   private void m_7559() {
      Class_8M6KWDCphbBjAqSQ var1 = this.m_7558();
      if (var1 != null) {
         var1.m_4012(0.0F);
         var1.m_4007(0.0F);
      }
   }

   private void m_7560(LivingEntity var1) {
      if (this.m_7554(var1)) {
         KillCards.Class_6dc88X8jHPSkDBEU var2 = this.m_7547(var1);
         if (var2 != null && var2.m_7537() && var2.f_25295 && !var2.f_25296) {
            var2.f_25296 = true;
            KillCards.EnGafDMBKQIscOgk var3 = new KillCards.EnGafDMBKQIscOgk();
            var3.f_25300.m_9281(0.0F);
            this.f_25319.add(var3);

            while (this.f_25319.size() > 5) {
               this.f_25319.remove(0);
            }
         }
      }
   }

   private void m_7561(float var1, float var2, float var3, float var4, int var5, boolean var6, int var7, float var8, boolean var9, float var10, float var11) {
      if (!(var8 < f_25398)) {
         Class_Ssh31B3ljfKeWsvS.m_4817(var1, var2, var3, var4, f_25399 * var10, Class_BftdentXEtGbugJw.m_2303(8, 10, 14, (int)(f_25400 * var8)));
         float var12 = Math.max(1.0F, (f_25401 + f_25402 * var11) * var10);
         int var13 = Class_BftdentXEtGbugJw.m_2302(var7, Class_BftdentXEtGbugJw.m_2310(255, 255, 255), f_25403 * var11);
         Class_Ssh31B3ljfKeWsvS.m_4854(var1, var2, var3, var4, var12, f_25404 * var10, Class_BftdentXEtGbugJw.m_2306(var13, (f_25405 + f_25406 * var11) * var8));
         if (var9 && var11 > f_25407) {
            Class_Ssh31B3ljfKeWsvS.m_4817(
               var1 + f_25408 * var10,
               var2 + f_25409 * var10,
               var3 - f_25410 * var10,
               var4 - f_25411 * var10,
               f_25412 * var10,
               Class_BftdentXEtGbugJw.m_2306(var7, f_25413 * var11 * var8)
            );
         }

         float var14 = f_25414 * var10;
         int var15 = Class_BftdentXEtGbugJw.m_2306(var7, f_25415 * var8);
         Class_Ssh31B3ljfKeWsvS.m_4829(var1 + f_25416 * var10, var2 + f_25417 * var10, var14, var14, 0.0F, f_25308, var15, f_25305, FilterMode.LINEAR);
         Class_Ssh31B3ljfKeWsvS.m_4829(
            var1 + var3 - var14 - f_25418 * var10, var2 + var4 - var14 - f_25419 * var10, var14, var14, 0.0F, f_25308, var15, f_25305, FilterMode.LINEAR
         );
         if (var6) {
            String var16 = String.valueOf(var5);
            int var17 = Math.max(13, Math.round(f_25420 * var10));
            float var18 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var16, var17);
            float var19 = var1 + (var3 - var18) * f_25421;
            float var20 = var2 + (var4 - var17) * f_25422 - f_25423 * var10;
            Class_Ssh31B3ljfKeWsvS.m_4866(
               Class_y1y6QpONhWEUIdEB.m_9588(),
               var16,
               var19 + f_25424 * var10,
               var20 + f_25425 * var10,
               var17,
               Class_BftdentXEtGbugJw.m_2303(0, 0, 0, (int)(f_25426 * var8))
            );
            Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var16, var19, var20, var17, Class_BftdentXEtGbugJw.m_2306(var7, var8));
         }
      }
   }

   private int m_7562() {
      return Class_BftdentXEtGbugJw.m_2304(0) | f_25451;
   }

   private static final class Class_6dc88X8jHPSkDBEU {
      public LivingEntity f_25292;
      public long f_25293;
      public long f_25294;
      public boolean f_25295;
      public boolean f_25296;
      public static final long f_25297 = 3500L;
      public static final long f_25298 = 3500L;

      public void m_7535(long var1) {
         this.f_25294 = var1;
         this.f_25293 = System.currentTimeMillis();
      }

      public void m_7536() {
         this.f_25295 = true;
         this.f_25293 = System.currentTimeMillis();
      }

      public Class_6dc88X8jHPSkDBEU(LivingEntity var1) {
         this.f_25294 = f_25297;
         this.m_7538(var1);
      }

      public boolean m_7537() {
         return this.f_25292 != null && System.currentTimeMillis() - this.f_25293 < this.f_25294;
      }

      public void m_7538(LivingEntity var1) {
         this.f_25292 = var1;
         this.f_25293 = System.currentTimeMillis();
         this.f_25294 = f_25298;
         if (var1.getHealth() > 0.0F) {
            this.f_25296 = false;
         }
      }
   }

   private static final class EnGafDMBKQIscOgk {
      public final long f_25299 = System.currentTimeMillis();
      public final Class_w8fCJQ5ZtH5lQbWc f_25300;
      public final Class_w8fCJQ5ZtH5lQbWc f_25301;
      public static final float f_25302 = 6.0F;
      public static final float f_25303 = 10.0F;

      public EnGafDMBKQIscOgk() {
         this.f_25300 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_25302, Class_eXr9Fra2ad3yFXY8.f_19121);
         this.f_25301 = new Class_w8fCJQ5ZtH5lQbWc(1.0F, f_25303, Class_eXr9Fra2ad3yFXY8.f_19099);
      }
   }
}
