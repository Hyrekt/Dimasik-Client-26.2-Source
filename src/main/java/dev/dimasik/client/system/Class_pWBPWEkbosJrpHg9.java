package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.autobuy.AutoBuy;
import dev.dimasik.client.ui.screen.Screen_8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.util.Mth;
import net.minecraft.world.item.ItemStack;

public final class Class_pWBPWEkbosJrpHg9 {
   private static final float f_28195 = 74.0F;
   private static final float f_28196 = 8.0F;
   private static final float f_28197 = 11.0F;
   private static final float f_28198 = 48.0F;
   private static final float f_28199 = 42.0F;
   private static final float f_28200 = 6.0F;
   private static final float f_28201 = 54.0F;
   private static final float f_28202 = 7.0F;
   private static final float f_28203 = 92.0F;
   private static final float f_28204 = 25.0F;
   private static Class_pWBPWEkbosJrpHg9 f_28205;
   private static boolean f_28206;
   private static String f_28207;
   private static String f_28208;
   private static float f_28209;
   private static float f_28210;
   private static float f_28211;
   private static float f_28212;
   private final Screen_8 f_28213;
   private final Class_w8fCJQ5ZtH5lQbWc f_28214;
   private final Map<AutoBuy.EfEV0McZpW4GEOT8, Class_w8fCJQ5ZtH5lQbWc> f_28215;
   private final Map<AutoBuy.EfEV0McZpW4GEOT8, Class_w8fCJQ5ZtH5lQbWc> f_28216;
   private final Map<AutoBuy.EfEV0McZpW4GEOT8, Class_w8fCJQ5ZtH5lQbWc> f_28217;
   private final Map<AutoBuy.EfEV0McZpW4GEOT8, Class_w8fCJQ5ZtH5lQbWc> f_28218;
   private final List<AutoBuy.EfEV0McZpW4GEOT8> f_28219;
   private long f_28220;
   private float f_28221;
   private float f_28222;
   private float f_28223;
   private float f_28224;
   private AutoBuy.EfEV0McZpW4GEOT8 f_28225;
   private AutoBuy.EfEV0McZpW4GEOT8 f_28226;
   private String f_28227;
   private static final float f_28228 = 8.0F;
   private static final float f_28229 = 20.0F;
   private static final float f_28230 = 8.0F;
   private static final float f_28231 = 270.0F;
   private static final float f_28232 = 602.0F;
   private static final float f_28233 = 8.0F;
   private static final float f_28234 = 24.0F;
   private static final float f_28235 = 6.0F;
   private static final float f_28236 = 48.0F;
   private static final float f_28237 = 10.0F;
   private static final float f_28238 = 74.0F;
   private static final float f_28239 = 8.0F;
   private static final float f_28240 = 48.0F;
   private static final float f_28241 = 48.0F;
   private static final float f_28242 = 10.0F;
   private static final float f_28243 = 92.0F;
   private static final float f_28244 = 12.0F;
   private static final float f_28245 = 10.0F;
   private static final long f_28246 = 150L;
   private static final String f_28247 = "Каталог";
   private static final String f_28248 = "Все доступные предметы";
   private static final String f_28249 = "К покупке · ";
   private static final String f_28250 = "Выбранные предметы";
   private static final String f_28251 = "Ожидает парсер · ПКМ удалить";
   private static final String f_28252 = " · ПКМ удалить";
   private static final String f_28253 = "Уже добавлен";
   private static final String f_28254 = "ЛКМ — добавить";
   private static final float f_28255 = 10.0F;
   private static final float f_28256 = 0.015F;
   private static final float f_28257 = 0.18F;
   private static final float f_28258 = 0.18F;
   private static final float f_28259 = 255.0F;
   private static final float f_28260 = 16.0F;
   private static final float f_28261 = 0.38F;
   private static final float f_28262 = 20.0F;
   private static final float f_28263 = 11.0F;
   private static final float f_28264 = 0.22F;
   private static final float f_28265 = 11.0F;
   private static final float f_28266 = 0.18F;
   private static final float f_28267 = 0.3F;
   private static final float f_28268 = 13.0F;
   private static final float f_28269 = 11.0F;
   private static final float f_28270 = 18.0F;
   private static final float f_28271 = 7.0F;
   private static final float f_28272 = 0.25F;
   private static final float f_28273 = 13.0F;
   private static final float f_28274 = 11.0F;
   private static final float f_28275 = 18.0F;
   private static final float f_28276 = 0.86F;
   private static final float f_28277 = 22.0F;
   private static final float f_28278 = 9.0F;
   private static final float f_28279 = 0.94F;
   private static final float f_28280 = 22.0F;
   private static final float f_28281 = 27.0F;
   private static final float f_28282 = 0.72F;
   private static final float f_28283 = 22.0F;
   private static final float f_28284 = 12.0F;
   private static final float f_28285 = 0.5F;
   private static final float f_28286 = 12.0F;
   private static final float f_28287 = 14.0F;
   private static final float f_28288 = 0.88F;
   private static final float f_28289 = 12.0F;
   private static final float f_28290 = 40.0F;
   private static final float f_28291 = 24.0F;
   private static final float f_28292 = 0.12F;
   private static final double f_28293 = 92.0;
   private static final double f_28294 = 25.0;
   private static final float f_28295 = 92.0F;
   private static final float f_28296 = 25.0F;
   private static final float f_28297 = 7.0F;
   private static final float f_28298 = 0.52F;
   private static final float f_28299 = 0.12F;
   private static final String f_28300 = "AutoBuy: ВКЛ";
   private static final String f_28301 = "AutoBuy: ВЫКЛ";
   private static final float f_28302 = 46.0F;
   private static final float f_28303 = 8.0F;
   private static final float f_28304 = 0.5F;
   private static final float f_28305 = 0.94F;
   private static final float f_28306 = 42.0F;
   private static final float f_28307 = 6.0F;
   private static final float f_28308 = 0.5F;
   private static final float f_28309 = 5.0F;
   private static final float f_28310 = 10.0F;
   private static final float f_28311 = 48.0F;
   private static final float f_28312 = 48.0F;
   private static final float f_28313 = 42.0F;
   private static final double f_28314 = 42.0;
   private static final double f_28315 = 42.0;
   private static final float f_28316 = 42.0F;
   private static final float f_28317 = 42.0F;
   private static final float f_28318 = 14.0F;
   private static final float f_28319 = 11.0F;
   private static final float f_28320 = 0.45F;
   private static final float f_28321 = 0.32F;
   private static final float f_28322 = 0.42F;
   private static final float f_28323 = 0.42F;
   private static final float f_28324 = 0.3F;
   private static final float f_28325 = 0.18F;
   private static final float f_28326 = 0.06F;
   private static final float f_28327 = 1.2F;
   private static final float f_28328 = 0.8F;
   private static final float f_28329 = 0.01F;
   private static final float f_28330 = 42.0F;
   private static final float f_28331 = 42.0F;
   private static final float f_28332 = 8.0F;
   private static final float f_28333 = 0.26F;
   private static final float f_28334 = 42.0F;
   private static final float f_28335 = 42.0F;
   private static final float f_28336 = 8.0F;
   private static final float f_28337 = 25.0F;
   private static final float f_28338 = 2.5F;
   private static final float f_28339 = 1.5F;
   private static final float f_28340 = 42.0F;
   private static final float f_28341 = 0.5F;
   private static final float f_28342 = 42.0F;
   private static final float f_28343 = 0.5F;
   private static final float f_28344 = 0.72F;
   private static final float f_28345 = 0.28F;
   private static final double f_28346 = 260.0;
   private static final float f_28347 = 42.0F;
   private static final float f_28348 = 9.0F;
   private static final float f_28349 = 4.0F;
   private static final float f_28350 = 5.0F;
   private static final float f_28351 = 5.0F;
   private static final float f_28352 = 2.5F;
   private static final float f_28353 = 5.0F;
   private static final float f_28354 = 10.0F;
   private static final float f_28355 = 20.0F;
   private static final float f_28356 = 5.0F;
   private static final float f_28357 = 10.0F;
   private static final float f_28358 = 61.0F;
   private static final float f_28359 = 54.0F;
   private static final float f_28360 = 0.01F;
   private static final double f_28361 = 54.0;
   private static final float f_28362 = 54.0F;
   private static final float f_28363 = 14.0F;
   private static final float f_28364 = 18.0F;
   private static final float f_28365 = 1.5F;
   private static final float f_28366 = 8.0F;
   private static final float f_28367 = 0.78F;
   private static final float f_28368 = 0.34F;
   private static final float f_28369 = 0.46F;
   private static final float f_28370 = 0.46F;
   private static final float f_28371 = 0.31F;
   private static final float f_28372 = 0.17F;
   private static final float f_28373 = 0.01F;
   private static final float f_28374 = 0.01F;
   private static final float f_28375 = 54.0F;
   private static final float f_28376 = 10.0F;
   private static final float f_28377 = 0.16F;
   private static final float f_28378 = 0.2F;
   private static final float f_28379 = 54.0F;
   private static final float f_28380 = 9.0F;
   private static final float f_28381 = 32.0F;
   private static final float f_28382 = 10.0F;
   private static final float f_28383 = 54.0F;
   private static final float f_28384 = 0.5F;
   private static final float f_28385 = 120.0F;
   private static final float f_28386 = 52.0F;
   private static final float f_28387 = 10.0F;
   private static final float f_28388 = 0.94F;
   private static final float f_28389 = 52.0F;
   private static final float f_28390 = 27.0F;
   private static final float f_28391 = 84.0F;
   private static final float f_28392 = 20.0F;
   private static final float f_28393 = 5.0F;
   private static final float f_28394 = 0.62F;
   private static final float f_28395 = 0.62F;
   private static final long f_28396 = 900L;
   private static final long f_28397 = 450L;
   private static final String f_28398 = "|";
   private static final String f_28399 = "Цена: ";
   private static final float f_28400 = 7.0F;
   private static final float f_28401 = 5.0F;
   private static final float f_28402 = 0.96F;
   private static final String f_28403 = "Ожидает парсер";
   private static final float f_28404 = 52.0F;
   private static final float f_28405 = 31.0F;
   private static final String f_28406 = "×";
   private static final float f_28407 = 20.0F;
   private static final float f_28408 = 18.0F;
   private static final float f_28409 = 0.55F;
   private static final float f_28410 = 0.45F;
   private static final float f_28411 = 5.0F;
   private static final float f_28412 = 0.5F;
   private static final float f_28413 = 0.5F;
   private static final float f_28414 = 20.0F;
   private static final float f_28415 = 40.0F;
   private static final float f_28416 = 40.0F;
   private static final float f_28417 = 40.0F;
   private static final float f_28418 = 12.0F;
   private static final float f_28419 = 0.12F;
   private static final float f_28420 = 0.06F;
   private static final String f_28421 = "+";
   private static final float f_28422 = 31.0F;
   private static final float f_28423 = 0.86F;
   private static final String f_28424 = "Список покупок пуст";
   private static final float f_28425 = 12.0F;
   private static final float f_28426 = 0.9F;
   private static final String f_28427 = "Нажми на предмет в каталоге";
   private static final float f_28428 = 30.0F;
   private static final float f_28429 = 0.68F;
   private static final float f_28430 = 0.66F;
   private static final float f_28431 = 0.34F;
   private static final double f_28432 = 420.0;
   private static final float f_28433 = 28.0F;
   private static final float f_28434 = 0.48F;
   private static final float f_28435 = 48.0F;
   private static final float f_28436 = 6.0F;
   private static final float f_28437 = 61.0F;
   private static final float f_28438 = 7.0F;
   private static final float f_28439 = 16.0F;
   private static final float f_28440 = 0.5F;
   private static final float f_28441 = 10.0F;
   private static final float f_28442 = 10.0F;
   private static final float f_28443 = 24.0F;
   private static final float f_28444 = 42.0F;
   private static final float f_28445 = 14.0F;
   private static final float f_28446 = 14.0F;
   private static final float f_28447 = 10.0F;
   private static final float f_28448 = 255.0F;
   private static final float f_28449 = 0.32F;
   private static final float f_28450 = 22.0F;
   private static final float f_28451 = 8.0F;
   private static final float f_28452 = 0.2F;
   private static final float f_28453 = 0.45F;
   private static final float f_28454 = 0.55F;
   private static final float f_28455 = 0.45F;
   private static final float f_28456 = 255.0F;
   private static final float f_28457 = 8.0F;
   private static final float f_28458 = 0.86F;
   private static final float f_28459 = 12.0F;
   private static final float f_28460 = 8.0F;
   private static final float f_28461 = 255.0F;
   private static final float f_28462 = 0.94F;
   private static final float f_28463 = 12.0F;
   private static final float f_28464 = 24.0F;
   private static final float f_28465 = 255.0F;
   private static final float f_28466 = 0.76F;
   private static final double f_28467 = 92.0;
   private static final double f_28468 = 25.0;
   private static final float f_28469 = 42.0F;
   private static final float f_28470 = 6.0F;
   private static final float f_28471 = 0.5F;
   private static final float f_28472 = 48.0F;
   private static final float f_28473 = 48.0F;
   private static final double f_28474 = 42.0;
   private static final double f_28475 = 42.0;
   private static final float f_28476 = 42.0F;
   private static final float f_28477 = 42.0F;
   private static final float f_28478 = 10.0F;
   private static final float f_28479 = 20.0F;
   private static final float f_28480 = 61.0F;
   private static final double f_28481 = 54.0;
   private static final float f_28482 = 54.0F;
   private static final long f_28483 = 1000000000L;
   private static final float f_28484 = 42.0F;
   private static final float f_28485 = 42.0F;
   private static final float f_28486 = 0.5F;
   private static final float f_28487 = 10.0F;

   private void m_8055() {
      if (this.f_28226 != null) {
         try {
            long var1 = this.f_28227.isBlank() ? 1L : Long.parseLong(this.f_28227);
            this.f_28226.setting().m_818((float)Math.clamp(var1, 1L, f_28483));
         } catch (NumberFormatException var3) {
         }

         this.f_28226 = null;
         this.f_28227 = "";
      }
   }

   private float m_8056(Map<AutoBuy.EfEV0McZpW4GEOT8, Class_w8fCJQ5ZtH5lQbWc> var1, AutoBuy.EfEV0McZpW4GEOT8 var2, boolean var3, float var4) {
      Class_w8fCJQ5ZtH5lQbWc var5 = var1.computeIfAbsent(var2, var2x -> new Class_w8fCJQ5ZtH5lQbWc(var3 ? 1.0F : 0.0F, var4, Class_eXr9Fra2ad3yFXY8.f_19100));
      var5.m_9283(var3 ? 1.0F : 0.0F);
      return Mth.clamp(var5.m_9288(), 0.0F, 1.0F);
   }

   private void m_8057(String var1, float var2, float var3, int var4, int var5) {
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(), var1, var2 - Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var1, var4) * f_28440, var3, var4, var5
      );
   }

   private void m_8058(List<AutoBuy.EfEV0McZpW4GEOT8> var1) {
      for (AutoBuy.EfEV0McZpW4GEOT8 var3 : var1) {
         if (var3.enabled() && !this.f_28219.contains(var3)) {
            this.f_28219.add(var3);
            this.f_28218.put(var3, new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_28255, Class_eXr9Fra2ad3yFXY8.f_19100));
         }
      }

      Iterator var5 = this.f_28219.iterator();

      while (var5.hasNext()) {
         AutoBuy.EfEV0McZpW4GEOT8 var6 = (AutoBuy.EfEV0McZpW4GEOT8)var5.next();
         Class_w8fCJQ5ZtH5lQbWc var4 = this.f_28218
            .computeIfAbsent(var6, var1x -> new Class_w8fCJQ5ZtH5lQbWc(var6.enabled() ? 1.0F : 0.0F, f_28487, Class_eXr9Fra2ad3yFXY8.f_19100));
         var4.m_9283(var6.enabled() ? 1.0F : 0.0F);
         if (!var6.enabled() && var4.m_9288() < f_28256) {
            var5.remove();
            this.f_28218.remove(var6);
            this.f_28217.remove(var6);
         }
      }

      if (this.f_28225 != null && !this.f_28225.enabled()) {
         this.f_28225 = null;
      }

      if (this.f_28226 != null && !this.f_28226.enabled()) {
         this.m_8087();
      }
   }

   private float m_8059() {
      return this.m_8101() + this.m_8096() - f_28243 - f_28244;
   }

   public static void m_8060() {
      if (f_28206 && f_28207 != null) {
         float var0 = Math.max(
               Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), f_28207, 12),
               Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), f_28208, 10)
            )
            + f_28443;
         float var1 = f_28444;
         float var2 = Math.min(f_28209 + f_28445, f_28211 - var0);
         float var3 = Math.min(f_28210 + f_28446, f_28212 - var1);
         Class_Ssh31B3ljfKeWsvS.m_4859(
            var2,
            var3,
            var0,
            var1,
            f_28447,
            Class_BftdentXEtGbugJw.m_2306(
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SHADOW), Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.SHADOW) / f_28448 * f_28449
            )
         );
         Class_Ssh31B3ljfKeWsvS.m_4858(
            var2,
            var3,
            var0,
            var1,
            f_28450,
            f_28451,
            Class_BftdentXEtGbugJw.m_2303(255, 255, 255, Math.min(60, (int)(Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.BACKGROUND) * f_28452)))
         );
         int var4 = Class_BftdentXEtGbugJw.m_2302(
            Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.BACKGROUND), Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_STATE), f_28453
         );
         float var5 = (
               Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.BACKGROUND) * f_28454
                  + Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.DEACTIVE_STATE) * f_28455
            )
            / f_28456;
         Class_Ssh31B3ljfKeWsvS.m_4817(var2, var3, var0, var1, f_28457, Class_BftdentXEtGbugJw.m_2306(var4, var5 * f_28458));
         Class_Ssh31B3ljfKeWsvS.m_4866(
            Class_y1y6QpONhWEUIdEB.m_9588(),
            f_28207,
            var2 + f_28459,
            var3 + f_28460,
            12,
            Class_BftdentXEtGbugJw.m_2306(
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.TEXT), Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.TEXT) / f_28461 * f_28462
            )
         );
         Class_Ssh31B3ljfKeWsvS.m_4866(
            Class_y1y6QpONhWEUIdEB.m_9588(),
            f_28208,
            var2 + f_28463,
            var3 + f_28464,
            10,
            Class_BftdentXEtGbugJw.m_2306(
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SUR_TEXT),
               Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.SUR_TEXT) / f_28465 * f_28466
            )
         );
         f_28206 = false;
         f_28205 = null;
      }
   }

   private AutoBuy.EfEV0McZpW4GEOT8 m_8061(float var1, float var2) {
      if (!m_8065(var1, var2, this.m_8101(), this.m_8069(), this.m_8096(), this.m_8099())) {
         return null;
      }

      float var3 = this.m_8101() + f_28478;
      float var4 = this.m_8096() - f_28479;
      float var5 = this.m_8069() + this.f_28223;
      float var6 = 0.0F;

      for (int var7 = 0; var7 < this.f_28219.size(); var7++) {
         AutoBuy.EfEV0McZpW4GEOT8 var8 = this.f_28219.get(var7);
         float var9 = this.f_28218.get(var8) == null ? 1.0F : this.f_28218.get(var8).m_9288();
         float var10 = var5 + var6;
         var6 += f_28480 * var9;
         if (var8.enabled() && m_8065(var1, var2, var3, var10, var4, f_28481) && !this.m_8074(var3, var10, var4, f_28482)) {
            return var8;
         }
      }

      return null;
   }

   public boolean m_8062(float var1, float var2, int var3) {
      AutoBuy var4 = this.m_8071();
      if (var4 == null) {
         return false;
      }

      if (var3 == 0 && m_8065(var1, var2, this.m_8059(), this.m_8083(), f_28467, f_28468)) {
         if (var4.m_3942()) {
            var4.m_3941(false);
         } else {
            if (!var4.m_776()) {
               var4.m_792();
            }

            var4.m_3941(true);
         }

         return true;
      } else {
         List var5 = var4.m_3908();
         AutoBuy.EfEV0McZpW4GEOT8 var6 = this.m_8068(var5, var1, var2);
         if (var6 != null && var3 == 0) {
            this.m_8055();
            this.f_28225 = var6;
            if (!var6.enabled()) {
               var6.setting().m_818(1.0F);
            }

            return true;
         } else {
            AutoBuy.EfEV0McZpW4GEOT8 var7 = this.m_8061(var1, var2);
            if (var7 != null) {
               if (var3 == 1) {
                  if (this.f_28226 == var7) {
                     this.m_8087();
                  }

                  var7.setting().m_818(0.0F);
                  if (this.f_28225 == var7) {
                     this.f_28225 = null;
                  }
               } else if (var3 == 0) {
                  this.f_28225 = var7;
                  this.m_8078(var7);
               }

               return true;
            } else {
               if (var3 == 0) {
                  this.m_8055();
               }

               return false;
            }
         }
      }
   }

   private void m_8063(float var1, float var2, String var3, String var4, String var5) {
      float var6 = this.m_8081();
      Class_Ssh31B3ljfKeWsvS.m_4859(var1 + f_28268, var6 + f_28269, 2.0F, f_28270, f_28271, this.m_8104(Class_y3cvEHXTSEF5dp8q.MAIN, f_28272));
      Class_Ssh31B3ljfKeWsvS.m_4817(var1 + f_28273, var6 + f_28274, 2.0F, f_28275, 1.0F, this.m_8104(Class_y3cvEHXTSEF5dp8q.MAIN, f_28276));
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(), var3, var1 + f_28277, var6 + f_28278, 13, this.m_8104(Class_y3cvEHXTSEF5dp8q.TEXT, f_28279)
      );
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(), var5, var1 + f_28280, var6 + f_28281, 8, this.m_8104(Class_y3cvEHXTSEF5dp8q.SUR_TEXT, f_28282)
      );
      if (!var4.isEmpty()) {
         float var7 = Math.max(f_28283, Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var4, 9) + f_28284);
         this.m_8057(var4, var1 + var2 - var7 * f_28285 - f_28286, var6 + f_28287, 9, this.m_8104(Class_y3cvEHXTSEF5dp8q.MAIN, f_28288));
      }

      Class_Ssh31B3ljfKeWsvS.m_4817(var1 + f_28289, var6 + f_28290, var2 - f_28291, 1.0F, 0.0F, this.m_8104(Class_y3cvEHXTSEF5dp8q.LINE, f_28292));
   }

   private int m_8064() {
      return Math.max(1, (int)((this.m_8103() - f_28234 + f_28235) / f_28236));
   }

   private static boolean m_8065(double var0, double var2, double var4, double var6, double var8, double var10) {
      return var0 >= var4 && var0 <= var4 + var8 && var2 >= var6 && var2 <= var6 + var10;
   }

   private float m_8066() {
      return f_28430 + f_28431 * (float)Math.sin(System.currentTimeMillis() / f_28432);
   }

   private void m_8067(String var1, String var2, float var3, float var4) {
      f_28205 = this;
      f_28206 = true;
      f_28207 = var1;
      f_28208 = var2;
      f_28209 = var3;
      f_28210 = var4;
      f_28211 = this.f_28213.getGuiX() + this.f_28213.getGuiWidth() - f_28441;
      f_28212 = this.f_28213.getGuiY() + this.f_28213.getGuiHeight() - f_28442;
   }

   private AutoBuy.EfEV0McZpW4GEOT8 m_8068(List<AutoBuy.EfEV0McZpW4GEOT8> var1, float var2, float var3) {
      if (!m_8065(var2, var3, this.m_8082(), this.m_8069(), this.m_8103(), this.m_8099())) {
         return null;
      }

      float var4 = this.m_8064() * f_28469 + (this.m_8064() - 1) * f_28470;
      float var5 = this.m_8082() + (this.m_8103() - var4) * f_28471;
      float var6 = this.m_8069() + this.f_28221;

      for (int var7 = 0; var7 < var1.size(); var7++) {
         float var8 = var5 + var7 % this.m_8064() * f_28472;
         float var9 = var6 + var7 / this.m_8064() * f_28473;
         if (m_8065(var2, var3, var8, var9, f_28474, f_28475) && !this.m_8074(var8, var9, f_28476, f_28477)) {
            return (AutoBuy.EfEV0McZpW4GEOT8)var1.get(var7);
         }
      }

      return null;
   }

   private float m_8069() {
      return this.m_8081() + f_28240;
   }

   private void m_8070(float var1, float var2, float var3, float var4) {
      Class_Ssh31B3ljfKeWsvS.m_4859(var1, var2, var3, var4, f_28260, this.m_8104(Class_y3cvEHXTSEF5dp8q.SHADOW, f_28261));
      Class_Ssh31B3ljfKeWsvS.m_4858(
         var1,
         var2,
         var3,
         var4,
         f_28262,
         f_28263,
         Class_BftdentXEtGbugJw.m_2303(255, 255, 255, Math.min(64, (int)(Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.BACKGROUND) * f_28264)))
      );
      Class_Ssh31B3ljfKeWsvS.m_4817(var1, var2, var3, var4, f_28265, this.m_8102(f_28266, f_28267));
   }

   private AutoBuy m_8071() {
      return DimasikClient.m_9057().m_9049().m_2801().m_3503();
   }

   private void m_8072() {
      float var1 = this.m_8101() + this.m_8096() * f_28412;
      float var2 = this.m_8069() + this.m_8099() * f_28413;
      float var3 = this.m_8066();
      Class_Ssh31B3ljfKeWsvS.m_4817(
         var1 - f_28414, var2 - f_28415, f_28416, f_28417, f_28418, this.m_8104(Class_y3cvEHXTSEF5dp8q.SELECTED, f_28419 + var3 * f_28420)
      );
      this.m_8057(f_28421, var1, var2 - f_28422, 18, this.m_8104(Class_y3cvEHXTSEF5dp8q.MAIN, f_28423));
      this.m_8057(Class_0p152hWffX3ippAf.m_801(f_28424), var1, var2 + f_28425, 12, this.m_8104(Class_y3cvEHXTSEF5dp8q.TEXT, f_28426));
      this.m_8057(Class_0p152hWffX3ippAf.m_801(f_28427), var1, var2 + f_28428, 9, this.m_8104(Class_y3cvEHXTSEF5dp8q.SUR_TEXT, f_28429));
   }

   private boolean m_8074(float var1, float var2, float var3, float var4) {
      return this.f_28213.getSearchOverlayAlpha() > f_28486 && this.f_28213.isUnderSearch(var1, var2, var3, var4);
   }

   private float m_8075(Class_y3cvEHXTSEF5dp8q var1) {
      return Mth.clamp(Class_LsNSRvPKh5AwfAUe.m_3852(var1) / f_28259, 0.0F, 1.0F);
   }

   private float m_8076(int var1) {
      return Math.max(0.0F, var1 * f_28437 - (var1 > 0 ? f_28438 : 0.0F));
   }

   public static void m_8077(String var0, String var1, float var2, float var3, float var4, float var5) {
      f_28205 = null;
      f_28206 = true;
      f_28207 = var0;
      f_28208 = var1;
      f_28209 = var2;
      f_28210 = var3;
      f_28211 = var4;
      f_28212 = var5;
   }

   private void m_8078(AutoBuy.EfEV0McZpW4GEOT8 var1) {
      if (this.f_28226 != null && this.f_28226 != var1) {
         this.m_8055();
      }

      this.f_28226 = var1;
      this.f_28227 = var1.price() <= 1L ? "" : Long.toString(var1.price());
   }

   private int m_8079(Class_y3cvEHXTSEF5dp8q var1) {
      return Class_LsNSRvPKh5AwfAUe.m_3820(var1);
   }

   private void m_8080(float var1, float var2, float var3, float var4) {
      if (!(var3 <= var4)) {
         float var5 = Math.max(f_28433, var4 * var4 / var3);
         float var6 = Mth.clamp(-var2 / (var3 - var4), 0.0F, 1.0F);
         Class_Ssh31B3ljfKeWsvS.m_4817(var1, this.m_8069() + (var4 - var5) * var6, 2.0F, var5, 1.0F, this.m_8104(Class_y3cvEHXTSEF5dp8q.SCROLL, f_28434));
      }
   }

   private float m_8081() {
      return this.f_28213.getGuiY() + f_28238;
   }

   private float m_8082() {
      return this.m_8098();
   }

   private float m_8083() {
      return this.m_8081() + f_28245;
   }

   private void m_8084(ItemStack var1, float var2, float var3, float var4) {
      Class_Ssh31B3ljfKeWsvS.m_4851(var1, var2, var3, var4 / f_28439, false);
   }

   public boolean m_8085(float var1, float var2, float var3) {
      if (m_8065(var1, var2, this.m_8082(), this.m_8069(), this.m_8103(), this.m_8099())) {
         this.f_28222 = this.f_28222 + var3 * f_28484;
         return true;
      } else if (m_8065(var1, var2, this.m_8101(), this.m_8069(), this.m_8096(), this.m_8099())) {
         this.f_28224 = this.f_28224 + var3 * f_28485;
         return true;
      } else {
         return false;
      }
   }

   private void m_8086(AutoBuy var1, float var2, float var3) {
      float var4 = this.m_8059();
      float var5 = this.m_8083();
      boolean var6 = m_8065(var2, var3, var4, var5, f_28293, f_28294);
      float var7 = var1.m_3942() ? 1.0F : 0.0F;
      int var8 = Class_BftdentXEtGbugJw.m_2302(this.m_8079(Class_y3cvEHXTSEF5dp8q.DEACTIVE_STATE), this.m_8079(Class_y3cvEHXTSEF5dp8q.SELECTED), var7);
      Class_Ssh31B3ljfKeWsvS.m_4817(var4, var5, f_28295, f_28296, f_28297, Class_BftdentXEtGbugJw.m_2306(var8, f_28298 + (var6 ? f_28299 : 0.0F)));
      this.m_8057(
         var1.m_3942() ? Class_0p152hWffX3ippAf.m_801(f_28300) : Class_0p152hWffX3ippAf.m_801(f_28301),
         var4 + f_28302,
         var5 + f_28303,
         9,
         this.m_8104(var7 > f_28304 ? Class_y3cvEHXTSEF5dp8q.TEXT : Class_y3cvEHXTSEF5dp8q.SUR_TEXT, f_28305)
      );
   }

   private void m_8087() {
      this.f_28226 = null;
      this.f_28227 = "";
   }

   public void m_8088(GuiGraphicsExtractor var1, float var2, float var3, float var4) {
      AutoBuy var5 = this.m_8071();
      if (var5 != null) {
         long var6 = System.currentTimeMillis();
         if (var6 - this.f_28220 > f_28246) {
            this.f_28214.m_9281(0.0F);
         }

         this.f_28220 = var6;
         this.f_28214.m_9283(1.0F);
         float var8 = Class_Ssh31B3ljfKeWsvS.m_4821();
         Class_Ssh31B3ljfKeWsvS.m_4864(var8 * this.f_28214.m_9288() * this.f_28213.getLayoutContentAlpha(0));
         List var9 = var5.m_3908();
         this.m_8058(var9);
         this.m_8106(var9.size(), this.f_28219.size());
         this.m_8070(this.m_8082(), this.m_8081(), this.m_8103(), this.m_8107());
         this.m_8070(this.m_8101(), this.m_8081(), this.m_8096(), this.m_8107());
         this.m_8063(this.m_8082(), this.m_8103(), Class_0p152hWffX3ippAf.m_801(f_28247), Integer.toString(var9.size()), Class_0p152hWffX3ippAf.m_801(f_28248));
         this.m_8063(this.m_8101(), this.m_8096(), Class_0p152hWffX3ippAf.m_801(f_28249) + var5.m_3917(), "", Class_0p152hWffX3ippAf.m_801(f_28250));
         this.m_8086(var5, var2, var3);
         AutoBuy.EfEV0McZpW4GEOT8 var10 = this.m_8097(var9, var2, var3);
         AutoBuy.EfEV0McZpW4GEOT8 var11 = this.m_8093(this.f_28219, var2, var3, var5);
         if (var11 != null) {
            String var12 = var11.price() <= 1L ? Class_0p152hWffX3ippAf.m_801(f_28251) : var5.m_3901(var11.price()) + Class_0p152hWffX3ippAf.m_801(f_28252);
            this.m_8067(Class_0p152hWffX3ippAf.m_801(var11.name()), var12, var2, var3);
         } else if (var10 != null) {
            String var13 = var10.enabled() ? Class_0p152hWffX3ippAf.m_801(f_28253) : Class_0p152hWffX3ippAf.m_801(f_28254);
            this.m_8067(Class_0p152hWffX3ippAf.m_801(var10.name()), var13, var2, var3);
         } else if (f_28205 == this) {
            f_28205 = null;
            f_28206 = false;
         }

         Class_Ssh31B3ljfKeWsvS.m_4864(var8);
      }
   }

   private float m_8090(Class_y3cvEHXTSEF5dp8q var1, Class_y3cvEHXTSEF5dp8q var2, float var3) {
      float var4 = Mth.clamp(var3, 0.0F, 1.0F);
      return this.m_8075(var1) + (this.m_8075(var2) - this.m_8075(var1)) * var4;
   }

   private float m_8091() {
      return this.f_28213.getGuiWidth() - this.f_28213.getSidebarWidth() - f_28229;
   }

   private String m_8092(String var1, float var2, int var3) {
      if (Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var1, var3) <= var2) {
         return var1;
      }

      String var4 = var1;

      while (var4.length() > 1 && Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var4 + "", var3) > var2) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      return var4 + "";
   }

   private AutoBuy.EfEV0McZpW4GEOT8 m_8093(List<AutoBuy.EfEV0McZpW4GEOT8> var1, float var2, float var3, AutoBuy var4) {
      float var5 = this.m_8101() + f_28354;
      float var6 = this.m_8096() - f_28355;
      float var7 = this.m_8069() + this.f_28223;
      float var8 = this.m_8069() + this.m_8099();
      AutoBuy.EfEV0McZpW4GEOT8 var9 = null;
      Class_Ssh31B3ljfKeWsvS.m_4860(this.m_8101() + f_28356, this.m_8069(), this.m_8096() - f_28357, this.m_8099());
      if (var1.isEmpty()) {
         this.m_8072();
      }

      float var10 = 0.0F;

      for (int var11 = 0; var11 < var1.size(); var11++) {
         AutoBuy.EfEV0McZpW4GEOT8 var12 = (AutoBuy.EfEV0McZpW4GEOT8)var1.get(var11);
         float var13 = this.f_28218.get(var12) == null ? 1.0F : this.f_28218.get(var12).m_9288();
         float var14 = var7 + var10;
         var10 += f_28358 * var13;
         if (!(var14 + f_28359 < this.m_8069()) && !(var14 > var8) && !(var13 <= f_28360)) {
            boolean var15 = var12.enabled();
            boolean var16 = var15
               && m_8065(var2, var3, var5, var14, var6, f_28361)
               && m_8065(var2, var3, this.m_8101(), this.m_8069(), this.m_8096(), this.m_8099())
               && !this.m_8074(var5, var14, var6, f_28362);
            float var17 = this.m_8056(this.f_28217, var12, var16, f_28363);
            float var18 = var12 == this.f_28225 ? 1.0F : 0.0F;
            float var19 = var5 + (1.0F - var13) * f_28364 - var17 * f_28365;
            float var20 = var6 - (1.0F - var13) * f_28366;
            float var21 = var13;
            float var22 = Math.max(var18 * f_28367, var17 * f_28368);
            int var23 = Class_BftdentXEtGbugJw.m_2302(
               Class_BftdentXEtGbugJw.m_2302(this.m_8079(Class_y3cvEHXTSEF5dp8q.BACKGROUND), this.m_8079(Class_y3cvEHXTSEF5dp8q.DEACTIVE_STATE), f_28369),
               this.m_8079(Class_y3cvEHXTSEF5dp8q.SELECTED),
               var22
            );
            float var24 = this.m_8090(Class_y3cvEHXTSEF5dp8q.BACKGROUND, Class_y3cvEHXTSEF5dp8q.DEACTIVE_STATE, f_28370);
            var24 += (this.m_8075(Class_y3cvEHXTSEF5dp8q.SELECTED) - var24) * var22;
            int var25 = Class_BftdentXEtGbugJw.m_2306(var23, var24 * (f_28371 + var22 * f_28372) * var13);
            float var26 = Class_Ssh31B3ljfKeWsvS.m_4821();
            Class_Ssh31B3ljfKeWsvS.m_4864(var26 * var13);
            if (var17 > f_28373 || var18 > f_28374) {
               Class_Ssh31B3ljfKeWsvS.m_4859(
                  var19,
                  var14,
                  var20,
                  f_28375,
                  f_28376,
                  var18 > var17 ? this.m_8104(Class_y3cvEHXTSEF5dp8q.MAIN, var18 * f_28377) : this.m_8104(Class_y3cvEHXTSEF5dp8q.SHADOW, var17 * f_28378)
               );
            }

            Class_Ssh31B3ljfKeWsvS.m_4817(var19, var14, var20, f_28379, f_28380, var25);
            float var27 = f_28381 + var17 * 2.0F;
            this.m_8084(var12.stack(), var19 + f_28382, var14 + (f_28383 - var27) * f_28384, var27);
            Class_Ssh31B3ljfKeWsvS.m_4866(
               Class_y1y6QpONhWEUIdEB.m_9588(),
               this.m_8092(Class_0p152hWffX3ippAf.m_801(var12.name()), var20 - f_28385, 11),
               var19 + f_28386,
               var14 + f_28387,
               11,
               this.m_8104(Class_y3cvEHXTSEF5dp8q.TEXT, var21 * f_28388)
            );
            if (var12 == this.f_28226) {
               float var28 = var19 + f_28389;
               float var29 = var14 + f_28390;
               float var30 = var20 - f_28391;
               Class_Ssh31B3ljfKeWsvS.m_4817(var28, var29, var30, f_28392, f_28393, this.m_8102(f_28394, f_28395));
               String var31 = System.currentTimeMillis() % f_28396 < f_28397 ? f_28398 : "";
               Class_Ssh31B3ljfKeWsvS.m_4866(
                  Class_y1y6QpONhWEUIdEB.m_9588(),
                  Class_0p152hWffX3ippAf.m_801(f_28399) + this.f_28227 + var31,
                  var28 + f_28400,
                  var29 + f_28401,
                  9,
                  this.m_8104(Class_y3cvEHXTSEF5dp8q.TEXT, f_28402)
               );
            } else {
               boolean var33 = var12.price() <= 1L;
               String var34 = var33 ? Class_0p152hWffX3ippAf.m_801(f_28403) : var4.m_3901(var12.price());
               int var35 = var33 ? this.m_8079(Class_y3cvEHXTSEF5dp8q.SUR_TEXT) : this.m_8079(Class_y3cvEHXTSEF5dp8q.MAIN);
               Class_Ssh31B3ljfKeWsvS.m_4866(
                  Class_y1y6QpONhWEUIdEB.m_9588(),
                  var34,
                  var19 + f_28404,
                  var14 + f_28405,
                  9,
                  Class_BftdentXEtGbugJw.m_2306(
                     var35, this.m_8075(var33 ? Class_y3cvEHXTSEF5dp8q.SUR_TEXT : Class_y3cvEHXTSEF5dp8q.MAIN) * var21 * (var33 ? this.m_8066() : 1.0F)
                  )
               );
            }

            Class_Ssh31B3ljfKeWsvS.m_4866(
               Class_y1y6QpONhWEUIdEB.m_9588(),
               f_28406,
               var19 + var20 - f_28407,
               var14 + f_28408,
               13,
               this.m_8104(Class_y3cvEHXTSEF5dp8q.SUR_TEXT, var21 * (f_28409 + var17 * f_28410))
            );
            Class_Ssh31B3ljfKeWsvS.m_4864(var26);
            if (var16) {
               var9 = var12;
            }
         }
      }

      Class_Ssh31B3ljfKeWsvS.m_4828();
      this.m_8080(this.m_8101() + this.m_8096() - f_28411, this.f_28223, this.m_8076(var1.size()), this.m_8099());
      return var9;
   }

   public boolean m_8094(String var1) {
      if (this.f_28226 != null && var1 != null) {
         int var2 = 0;

         while (var2 < var1.length()) {
            int var3 = var1.codePointAt(var2);
            var2 += Character.charCount(var3);
            if (var3 >= 48 && var3 <= 57 && this.f_28227.length() < 10) {
               this.f_28227 = this.f_28227 + (char)var3;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public float m_8095() {
      return this.m_8107();
   }

   private float m_8096() {
      return this.m_8091() - f_28233 - this.m_8103();
   }

   private AutoBuy.EfEV0McZpW4GEOT8 m_8097(List<AutoBuy.EfEV0McZpW4GEOT8> var1, float var2, float var3) {
      float var4 = this.m_8064() * f_28306 + (this.m_8064() - 1) * f_28307;
      float var5 = this.m_8082() + (this.m_8103() - var4) * f_28308;
      float var6 = this.m_8069() + this.f_28221;
      float var7 = this.m_8069() + this.m_8099();
      AutoBuy.EfEV0McZpW4GEOT8 var8 = null;
      Class_Ssh31B3ljfKeWsvS.m_4860(this.m_8082() + f_28309, this.m_8069(), this.m_8103() - f_28310, this.m_8099());

      for (int var9 = 0; var9 < var1.size(); var9++) {
         AutoBuy.EfEV0McZpW4GEOT8 var10 = (AutoBuy.EfEV0McZpW4GEOT8)var1.get(var9);
         float var11 = var5 + var9 % this.m_8064() * f_28311;
         float var12 = var6 + var9 / this.m_8064() * f_28312;
         if (!(var12 + f_28313 < this.m_8069()) && !(var12 > var7)) {
            boolean var13 = m_8065(var2, var3, var11, var12, f_28314, f_28315)
               && m_8065(var2, var3, this.m_8082(), this.m_8069(), this.m_8103(), this.m_8099())
               && !this.m_8074(var11, var12, f_28316, f_28317);
            float var14 = this.m_8056(this.f_28215, var10, var13, f_28318);
            float var15 = this.m_8056(this.f_28216, var10, var10 == this.f_28225, f_28319);
            float var16 = var10.enabled() ? 1.0F : 0.0F;
            float var17 = Math.max(var15, var16 * f_28320);
            float var18 = Math.max(var17, var14 * f_28321);
            int var19 = Class_BftdentXEtGbugJw.m_2302(
               Class_BftdentXEtGbugJw.m_2302(this.m_8079(Class_y3cvEHXTSEF5dp8q.BACKGROUND), this.m_8079(Class_y3cvEHXTSEF5dp8q.DEACTIVE_STATE), f_28322),
               this.m_8079(Class_y3cvEHXTSEF5dp8q.SELECTED),
               var18
            );
            float var20 = this.m_8090(Class_y3cvEHXTSEF5dp8q.BACKGROUND, Class_y3cvEHXTSEF5dp8q.DEACTIVE_STATE, f_28323);
            var20 += (this.m_8075(Class_y3cvEHXTSEF5dp8q.SELECTED) - var20) * var18;
            int var21 = Class_BftdentXEtGbugJw.m_2306(var19, var20 * (f_28324 + var18 * f_28325 + var14 * f_28326));
            float var22 = var14 * f_28327 + var15 * f_28328;
            if (var14 > f_28329) {
               Class_Ssh31B3ljfKeWsvS.m_4859(var11, var12 - var22, f_28330, f_28331, f_28332, this.m_8104(Class_y3cvEHXTSEF5dp8q.SHADOW, var14 * f_28333));
            }

            Class_Ssh31B3ljfKeWsvS.m_4817(var11, var12 - var22, f_28334, f_28335, f_28336, var21);
            float var23 = f_28337 + var14 * f_28338 + var15 * f_28339;
            this.m_8084(var10.stack(), var11 + (f_28340 - var23) * f_28341, var12 - var22 + (f_28342 - var23) * f_28343, var23);
            if (var10.enabled()) {
               float var24 = f_28344 + f_28345 * (float)Math.sin(System.currentTimeMillis() / f_28346 + var9);
               Class_Ssh31B3ljfKeWsvS.m_4817(
                  var11 + f_28347 - f_28348, var12 - var22 + f_28349, f_28350, f_28351, f_28352, this.m_8104(Class_y3cvEHXTSEF5dp8q.MAIN, var24)
               );
            }

            if (var13) {
               var8 = var10;
            }
         }
      }

      Class_Ssh31B3ljfKeWsvS.m_4828();
      this.m_8080(this.m_8082() + this.m_8103() - f_28353, this.f_28221, this.m_8105(var1.size()), this.m_8099());
      return var8;
   }

   private float m_8098() {
      return this.f_28213.getGuiX() + this.f_28213.getSidebarWidth() + f_28237;
   }

   private float m_8099() {
      return this.m_8107() - f_28241 - f_28242;
   }

   public Class_pWBPWEkbosJrpHg9(Screen_8 var1) {
      this.f_28214 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_28228, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_28215 = new HashMap<>();
      this.f_28216 = new HashMap<>();
      this.f_28217 = new HashMap<>();
      this.f_28218 = new HashMap<>();
      this.f_28219 = new ArrayList<>();
      this.f_28227 = "";
      this.f_28213 = var1;
   }

   public boolean m_8100(int var1) {
      if (this.f_28226 == null) {
         return false;
      }

      if (var1 == 257 || var1 == 335) {
         this.m_8055();
      } else if (var1 == 256) {
         this.m_8087();
      } else if (var1 == 259) {
         if (!this.f_28227.isEmpty()) {
            this.f_28227 = this.f_28227.substring(0, this.f_28227.length() - 1);
         }
      } else if (var1 == 261) {
         this.f_28227 = "";
      }

      return true;
   }

   private float m_8101() {
      return this.m_8082() + this.m_8103() + f_28239;
   }

   private int m_8102(float var1, float var2) {
      int var3 = Class_BftdentXEtGbugJw.m_2302(this.m_8079(Class_y3cvEHXTSEF5dp8q.BACKGROUND), this.m_8079(Class_y3cvEHXTSEF5dp8q.DEACTIVE_STATE), var1);
      return Class_BftdentXEtGbugJw.m_2306(var3, this.m_8090(Class_y3cvEHXTSEF5dp8q.BACKGROUND, Class_y3cvEHXTSEF5dp8q.DEACTIVE_STATE, var1) * var2);
   }

   private float m_8103() {
      return (this.m_8091() - f_28230) * f_28231 / f_28232;
   }

   private int m_8104(Class_y3cvEHXTSEF5dp8q var1, float var2) {
      return Class_BftdentXEtGbugJw.m_2306(this.m_8079(var1), this.m_8075(var1) * var2);
   }

   private float m_8105(int var1) {
      int var2 = (var1 + this.m_8064() - 1) / this.m_8064();
      return Math.max(0.0F, var2 * f_28435 - f_28436);
   }

   private void m_8106(int var1, int var2) {
      float var3 = Math.max(0.0F, this.m_8105(var1) - this.m_8099());
      this.f_28222 = Math.clamp(this.f_28222, -var3, 0.0F);
      this.f_28221 = Math.clamp(this.f_28221 + (this.f_28222 - this.f_28221) * f_28257, -var3, 0.0F);
      float var4 = Math.max(0.0F, this.m_8076(var2) - this.m_8099());
      this.f_28224 = Math.clamp(this.f_28224, -var4, 0.0F);
      this.f_28223 = Math.clamp(this.f_28223 + (this.f_28224 - this.f_28223) * f_28258, -var4, 0.0F);
   }

   private float m_8107() {
      return this.f_28213.getModuleViewportHeight();
   }
}
