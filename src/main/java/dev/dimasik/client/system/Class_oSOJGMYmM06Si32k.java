package dev.dimasik.client.system;

import com.mojang.blaze3d.textures.FilterMode;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.ui.screen.Screen_8;
import net.minecraft.resources.Identifier;
import org.joml.Vector4f;
import org.joml.Vector4i;

public final class Class_oSOJGMYmM06Si32k implements Class_NzJrN63M7QBpmAbi {
   private static final float f_26215 = 242.0F;
   private static final float f_26216 = 288.0F;
   private static final float f_26217 = 12.0F;
   private static final float f_26218 = 225.0F;
   private static final float f_26219 = 47.0F;
   private static final float f_26220 = 8.0F;
   private static final String f_26221 = "\ue120";
   private static final String f_26222 = "\ue125";
   private static final String f_26223 = "\ue126";
   private static final String f_26224 = "\ue127";
   private static final String f_26225 = "\ue128";
   private static final String f_26226 = "\ue129";
   private final Screen_8 f_26227;
   private final Class_w8fCJQ5ZtH5lQbWc f_26228;
   private final Class_w8fCJQ5ZtH5lQbWc f_26229;
   private boolean f_26230;
   private boolean f_26231;
   private float f_26232;
   private boolean f_26233;
   private static final float f_26234 = 7.5F;
   private static final float f_26235 = 10.0F;
   private static final float f_26236 = 254.0F;
   private static final float f_26237 = 242.0F;
   private static final float f_26238 = 12.0F;
   private static final float f_26239 = 8.0F;
   private static final float f_26240 = 288.0F;
   private static final float f_26241 = 14.0F;
   private static final float f_26242 = 10.0F;
   private static final float f_26243 = 10.0F;
   private static final float f_26244 = 53.0F;
   private static final float f_26245 = 18.0F;
   private static final float f_26246 = 4.0F;
   private static final float f_26247 = 6.0F;
   private static final float f_26248 = 32.0F;
   private static final float f_26249 = 0.01F;
   private static final float f_26250 = 70.0F;
   private static final float f_26251 = 40.0F;
   private static final float f_26252 = 42.0F;
   private static final float f_26253 = 45.0F;
   private static final float f_26254 = 66.0F;
   private static final float f_26255 = 44.0F;
   private static final float f_26256 = 8.0F;
   private static final float f_26257 = 12.0F;
   private static final float f_26258 = 66.0F;
   private static final float f_26259 = 44.0F;
   private static final float f_26260 = 25.0F;
   private static final float f_26261 = 10.0F;
   private static final String f_26262 = "\ue127";
   private static final float f_26263 = 15.0F;
   private static final float f_26264 = 16.0F;
   private static final float f_26265 = 12.0F;
   private static final float f_26266 = 10.0F;
   private static final float f_26267 = 53.0F;
   private static final float f_26268 = 18.0F;
   private static final double f_26269 = 45.0;
   private static final float f_26270 = 0.001F;
   private static final float f_26271 = 12.0F;
   private static final float f_26272 = 24.0F;
   private static final float f_26273 = 12.0F;
   private static final float f_26274 = 48.0F;
   private static final float f_26275 = 242.0F;
   private static final float f_26276 = 288.0F;
   private static final float f_26277 = 14.0F;
   private static final float f_26278 = 14.0F;
   private static final float f_26279 = 32.0F;
   private static final float f_26280 = 154.0F;
   private static final float f_26281 = 56.0F;
   private static final float f_26282 = 14.0F;
   private static final float f_26283 = 13.0F;
   private static final float f_26284 = 154.0F;
   private static final float f_26285 = 56.0F;
   private static final float f_26286 = 32.0F;
   private static final float f_26287 = 10.0F;
   private static final String f_26288 = "9";
   private static final float f_26289 = 242.0F;
   private static final float f_26290 = 25.0F;
   private static final float f_26291 = 16.0F;
   private static final float f_26292 = 10.0F;
   private static final String f_26293 = "\ue128";
   private static final String f_26294 = "UID";
   private static final float f_26295 = 60.0F;
   private static final String f_26296 = "—";
   private static final float f_26297 = 61.0F;
   private static final String f_26298 = "\ue129";
   private static final String f_26299 = "Подписка";
   private static final String f_26300 = "Subscription";
   private static final float f_26301 = 80.0F;
   private static final String f_26302 = "Нет данных";
   private static final String f_26303 = "cracked by";
   private static final String f_26304 = "до ";
   private static final String f_26305 = "until ";
   private static final float f_26306 = 81.0F;
   private static final float f_26307 = 100.0F;
   private static final String f_26308 = "\ue120";
   private static final String f_26309 = "Язык";
   private static final String f_26310 = "Language";
   private static final float f_26311 = 110.0F;
   private static final String f_26312 = "English";
   private static final String f_26313 = "Русский";
   private static final float f_26314 = 111.0F;
   private static final String f_26315 = "\ue125";
   private static final String f_26316 = "Масштаб GUI";
   private static final String f_26317 = "GUI scale";
   private static final float f_26318 = 142.0F;
   private static final float f_26319 = 100.0F;
   private static final float f_26320 = 143.0F;
   private static final float f_26321 = 204.0F;
   private static final float f_26322 = 0.7F;
   private static final float f_26323 = 0.5F;
   private static final float f_26324 = 19.0F;
   private static final float f_26325 = 172.0F;
   private static final float f_26326 = 3.0F;
   private static final float f_26327 = 1.5F;
   private static final float f_26328 = 19.0F;
   private static final float f_26329 = 172.0F;
   private static final float f_26330 = 3.0F;
   private static final float f_26331 = 3.0F;
   private static final float f_26332 = 1.5F;
   private static final float f_26333 = 15.0F;
   private static final float f_26334 = 169.5F;
   private static final float f_26335 = 8.0F;
   private static final float f_26336 = 8.0F;
   private static final float f_26337 = 4.0F;
   private static final float f_26338 = 190.0F;
   private static final String f_26339 = "\ue126";
   private static final String f_26340 = "Вид GUI";
   private static final String f_26341 = "GUI layout";
   private static final float f_26342 = 202.0F;
   private static final float f_26343 = 15.0F;
   private static final float f_26344 = 55.0F;
   private static final float f_26345 = 225.0F;
   private static final double f_26346 = 47.0;
   private static final double f_26347 = 32.0;
   private static final float f_26348 = 47.0F;
   private static final float f_26349 = 32.0F;
   private static final float f_26350 = 7.0F;
   private static final float f_26351 = 0.85F;
   private static final float f_26352 = 0.45F;
   private static final float f_26353 = 0.18F;
   private static final float f_26354 = 47.0F;
   private static final float f_26355 = 32.0F;
   private static final float f_26356 = 7.0F;
   private static final float f_26357 = 0.5F;
   private static final float f_26358 = 15.0F;
   private static final float f_26359 = 7.0F;
   private static final float f_26360 = 17.0F;
   private static final float f_26361 = 242.0F;
   private static final float f_26362 = 0.5F;
   private static final float f_26363 = 268.0F;
   private static final float f_26364 = 10.0F;
   private static final float f_26365 = 14.0F;
   private static final float f_26366 = 142.0F;
   private static final double f_26367 = 103.0;
   private static final double f_26368 = 32.0;
   private static final float f_26369 = 103.0F;
   private static final float f_26370 = 32.0F;
   private static final float f_26371 = 7.0F;
   private static final float f_26372 = 0.55F;
   private static final float f_26373 = 0.18F;
   private static final float f_26374 = 103.0F;
   private static final float f_26375 = 32.0F;
   private static final float f_26376 = 7.0F;
   private static final float f_26377 = 0.5F;
   private static final String f_26378 = "Русский";
   private static final String f_26379 = "English";
   private static final float f_26380 = 12.0F;
   private static final float f_26381 = 9.0F;
   private static final float f_26382 = 12.0F;
   private static final double f_26383 = 103.0;
   private static final double f_26384 = 32.0;
   private static final double f_26385 = 242.0;
   private static final double f_26386 = 288.0;
   private static final float f_26387 = 242.0F;
   private static final float f_26388 = 34.0F;
   private static final float f_26389 = 6.0F;
   private static final double f_26390 = 28.0;
   private static final double f_26391 = 28.0;
   private static final float f_26392 = 110.0F;
   private static final float f_26393 = 12.0F;
   private static final float f_26394 = 164.0F;
   private static final double f_26395 = 218.0;
   private static final double f_26396 = 20.0;
   private static final float f_26397 = 15.0F;
   private static final float f_26398 = 55.0F;
   private static final float f_26399 = 225.0F;
   private static final double f_26400 = 47.0;
   private static final double f_26401 = 32.0;
   private static final float f_26402 = 0.7F;
   private static final float f_26403 = 19.0F;
   private static final float f_26404 = 204.0F;
   private static final float f_26405 = 0.5F;
   private static final float f_26406 = 0.7F;
   private static final float f_26407 = 1.2F;
   private static final float f_26408 = 9.0F;
   private static final float f_26409 = 4.0F;
   private static final double f_26410 = 224.0;
   private static final double f_26411 = 26.0;
   private static final float f_26412 = 9.0F;
   private static final float f_26413 = 4.0F;
   private static final double f_26414 = 224.0;
   private static final double f_26415 = 26.0;
   private static final float f_26416 = 9.0F;
   private static final float f_26417 = 4.0F;
   private static final float f_26418 = 224.0F;
   private static final float f_26419 = 26.0F;
   private static final float f_26420 = 6.0F;
   private static final float f_26421 = 0.45F;
   private static final float f_26422 = 16.0F;
   private static final float f_26423 = 12.0F;
   private static final float f_26424 = 36.0F;
   private static final float f_26425 = 11.0F;
   private static final float f_26426 = 242.0F;
   private static final float f_26427 = 34.0F;
   private static final float f_26428 = 11.0F;
   private static final String f_26429 = ">";
   private static final float f_26430 = 242.0F;
   private static final float f_26431 = 25.0F;
   private static final float f_26432 = 9.0F;
   private static final float f_26433 = 242.0F;
   private static final float f_26434 = 17.0F;
   private static final float f_26435 = 10.0F;
   private static final float f_26436 = 16.0F;
   private static final float f_26437 = 210.0F;
   private static final float f_26438 = 18.0F;
   private static final float f_26439 = 22.0F;
   private static final float f_26440 = 12.0F;
   private static final float f_26441 = 12.0F;
   private static final float f_26442 = 12.0F;
   private static final String f_26443 = "Пользователь";
   private static final String f_26444 = "User";
   private static final float f_26445 = 9.0F;
   private static final String f_26446 = "W";
   private static final float f_26447 = 0.25F;
   private static final float f_26448 = 0.22F;
   private static final float f_26449 = 0.5F;
   private static final float f_26450 = 9.0F;
   private static final float f_26451 = 0.125F;
   private static final float f_26452 = 9.0F;
   private static final float f_26453 = 0.625F;
   private static final float f_26454 = 0.125F;
   private static final float f_26455 = 0.125F;
   private static final float f_26456 = 0.125F;
   private static final float f_26457 = 0.5F;
   private static final float f_26458 = 0.5F;

   private void m_7766(float var1, float var2, String var3, String var4, float var5) {
      if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.m_7801() + f_26412, var5 - f_26413, f_26414, f_26415)) {
         Class_Ssh31B3ljfKeWsvS.m_4817(
            this.m_7801() + f_26416,
            var5 - f_26417,
            f_26418,
            f_26419,
            f_26420,
            Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SELECTED), f_26421)
         );
      }

      this.m_7779(var3, var4, var5);
   }

   private void m_7767(float var1, float var2) {
      Class_WhZ6MBDQaQZ0AZFd.K4ufvBpHGycE5Var var3 = Class_WhZ6MBDQaQZ0AZFd.m_5484();

      for (Class_WhZ6MBDQaQZ0AZFd.K4ufvBpHGycE5Var var7 : Class_WhZ6MBDQaQZ0AZFd.K4ufvBpHGycE5Var.values()) {
         float var8 = this.m_7801() + f_26343 + var7.ordinal() * f_26344;
         float var9 = this.m_7773() + f_26345;
         boolean var10 = var7 == Class_WhZ6MBDQaQZ0AZFd.m_5484();
         boolean var11 = Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var8, var9, f_26346, f_26347);
         if (var11) {
            var3 = var7;
         }

         Class_Ssh31B3ljfKeWsvS.m_4817(
            var8,
            var9,
            f_26348,
            f_26349,
            f_26350,
            Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SELECTED), var10 ? f_26351 : (var11 ? f_26352 : f_26353))
         );
         Class_Ssh31B3ljfKeWsvS.m_4854(
            var8,
            var9,
            f_26354,
            f_26355,
            1.0F,
            f_26356,
            var10 ? Class_BftdentXEtGbugJw.m_2306(m_7775(), f_26357) : Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE)
         );
         m_7805(var7.m_5481(), var8 + f_26358, var9 + f_26359, f_26360, var10 ? m_7775() : (var11 ? m_7784() : m_7791()));
      }

      String var12 = var3.m_5480();
      m_7788(
         var12,
         this.m_7801() + (f_26361 - Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var12, 10)) * f_26362,
         this.m_7773() + f_26363,
         f_26364,
         m_7791()
      );
   }

   private static Object m_7768() {
      return null;
   }

   public void m_7769(float var1, float var2) {
      float var3 = this.m_7795();
      if (!(var3 < f_26270)) {
         float var4 = Class_Ssh31B3ljfKeWsvS.m_4821();
         Class_Ssh31B3ljfKeWsvS.m_4860(
            this.f_26227.getGuiX() - this.m_7771() - f_26271, this.f_26227.getGuiY() - f_26272, this.m_7771() + f_26273, this.f_26227.getGuiHeight() + f_26274
         );

         try {
            Class_Ssh31B3ljfKeWsvS.m_4864(var4 * var3);
            this.m_7797(var1, var2);
         } finally {
            Class_Ssh31B3ljfKeWsvS.m_4864(var4);
            Class_Ssh31B3ljfKeWsvS.m_4828();
         }
      }
   }

   private static String m_7770(Object var0) {
      return "cracked by";
   }

   public Class_oSOJGMYmM06Si32k(Screen_8 var1) {
      this.f_26228 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_26234, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_26229 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_26235, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_26227 = var1;
   }

   public float m_7771() {
      return f_26236 * this.m_7795();
   }

   private void m_7772() {
      Class_tLsgnS2CZo4KwQoK var1 = DimasikClient.m_9057().m_9049().m_2802();
      String var2 = var1.m_8863();
      var1.m_8844().m_5559();
      var1.m_8849(var2);
   }

   private float m_7773() {
      return this.f_26227.getGuiY() + this.f_26227.getGuiHeight() - f_26240 - f_26241 + f_26242 * (1.0F - this.m_7795());
   }

   public void m_7774(float var1) {
      this.m_7785(var1);
   }

   private static int m_7775() {
      return Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
   }

   public boolean m_7776(int var1) {
      if (!this.f_26230) {
         return false;
      }

      if (var1 == 256) {
         if (this.f_26233) {
            this.f_26233 = false;
         } else {
            this.m_7796();
         }
      }

      return true;
   }

   private float m_7777() {
      return this.m_7773() + f_26366;
   }

   public boolean m_7778(float var1, float var2) {
      return Class_FvJXUGWpZo3zYBW4.m_2697(
         var1,
         var2,
         this.f_26227.getGuiX() + f_26266,
         this.f_26227.getGuiY() + this.f_26227.getGuiHeight() - f_26267,
         this.f_26227.getSidebarWidth() - f_26268,
         f_26269
      );
   }

   private void m_7779(String var1, String var2, float var3) {
      m_7805(var1, this.m_7801() + f_26422, var3 + 1.0F, f_26423, m_7791());
      m_7788(var2, this.m_7801() + f_26424, var3 + 1.0F, f_26425, m_7784());
   }

   public boolean m_7780() {
      return this.f_26230;
   }

   public boolean m_7781(float var1, float var2, int var3) {
      if (!this.f_26230) {
         return false;
      }

      if (this.f_26233) {
         for (int var4 = 0; var4 < 2; var4++) {
            if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.m_7794(var4), this.m_7777(), f_26383, f_26384)) {
               if (var3 == 0) {
                  Class_WhZ6MBDQaQZ0AZFd.m_5490(var4 == 1);
                  this.f_26233 = false;
                  this.m_7772();
               }

               return true;
            }
         }
      }

      if (!Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.m_7801(), this.m_7773(), f_26385, f_26386)) {
         this.m_7796();
         return true;
      }

      if (var3 != 0) {
         return true;
      }

      if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.m_7801() + f_26387 - f_26388, this.m_7773() + f_26389, f_26390, f_26391)) {
         this.m_7796();
      } else if (this.m_7787(var1, var2, f_26392)) {
         this.f_26233 = !this.f_26233;
      } else if (!this.f_26233 && Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.m_7801() + f_26393, this.m_7773() + f_26394, f_26395, f_26396)) {
         this.f_26231 = true;
         this.m_7785(var1);
      } else {
         for (Class_WhZ6MBDQaQZ0AZFd.K4ufvBpHGycE5Var var7 : Class_WhZ6MBDQaQZ0AZFd.K4ufvBpHGycE5Var.values()) {
            float var8 = this.m_7801() + f_26397 + var7.ordinal() * f_26398;
            if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var8, this.m_7773() + f_26399, f_26400, f_26401)) {
               this.f_26227.setLayout(var7);
               this.m_7772();
               return true;
            }
         }
      }

      return true;
   }

   public void m_7782() {
      this.f_26228.m_9283(this.f_26230 ? 1.0F : 0.0F);
   }

   private static String m_7783(Object var0) {
      return "@soezproject & Vkontakt3";
   }

   private static int m_7784() {
      return Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT);
   }

   private void m_7785(float var1) {
      if (this.f_26231) {
         this.f_26232 = Math.clamp(f_26402 + (var1 - this.m_7801() - f_26403) / f_26404 * f_26405, f_26406, f_26407);
      }
   }

   public void m_7786() {
      if (this.f_26231) {
         Class_WhZ6MBDQaQZ0AZFd.m_5493(this.f_26232);
         this.f_26231 = false;
         this.m_7772();
      }
   }

   private boolean m_7787(float var1, float var2, float var3) {
      return Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.m_7801() + f_26408, this.m_7773() + var3 - f_26409, f_26410, f_26411);
   }

   private static void m_7788(String var0, float var1, float var2, float var3, int var4) {
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var0, var1, var2, Math.round(var3), var4);
   }

   public void m_7789() {
      this.m_7796();
      this.f_26228.m_9281(0.0F);
   }

   private void m_7790(float var1, float var2) {
      for (int var3 = 0; var3 < 2; var3++) {
         float var4 = this.m_7794(var3);
         float var5 = this.m_7777();
         boolean var6 = var3 == (Class_WhZ6MBDQaQZ0AZFd.m_5495() ? 1 : 0);
         boolean var7 = Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var4, var5, f_26367, f_26368);
         Class_Ssh31B3ljfKeWsvS.m_4817(
            var4,
            var5,
            f_26369,
            f_26370,
            f_26371,
            Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SELECTED), var6 ? f_26372 : f_26373)
         );
         Class_Ssh31B3ljfKeWsvS.m_4854(
            var4,
            var5,
            f_26374,
            f_26375,
            1.0F,
            f_26376,
            var6 ? Class_BftdentXEtGbugJw.m_2306(m_7775(), f_26377) : Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE)
         );
         m_7788(var3 == 0 ? f_26378 : f_26379, var4 + f_26380, var5 + f_26381, f_26382, var6 ? m_7775() : (var7 ? m_7784() : m_7791()));
      }
   }

   private static int m_7791() {
      return Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT);
   }

   public void m_7792(float var1, float var2) {
      float var3 = this.f_26227.getGuiX() + f_26243;
      float var4 = this.f_26227.getGuiY() + this.f_26227.getGuiHeight() - f_26244;
      float var5 = this.f_26227.getSidebarWidth() - f_26245;
      this.f_26229.m_9283(!this.m_7778(var1, var2) && !this.f_26230 ? 0.0F : 1.0F);
      m_7800(var3 + f_26246, var4 + f_26247, f_26248);
      float var6 = this.f_26227.getSidebarLabelAlpha();
      if (var6 > f_26249 && var5 > f_26250) {
         float var7 = Class_Ssh31B3ljfKeWsvS.m_4821();
         Class_Ssh31B3ljfKeWsvS.m_4860(var3 + f_26251, var4, Math.max(0.0F, var5 - f_26252), f_26253);
         Class_Ssh31B3ljfKeWsvS.m_4864(var7 * var6);
         Object var8 = m_7768();
         m_7788(m_7798(m_7770(var8), var5 - f_26254, 12), var3 + f_26255, var4 + f_26256, f_26257, m_7784());
         m_7788(m_7798(m_7783(var8), var5 - f_26258, 10), var3 + f_26259, var4 + f_26260, f_26261, m_7791());
         m_7805(f_26262, var3 + var5 - f_26263, var4 + f_26264, f_26265, Class_BftdentXEtGbugJw.m_2302(m_7791(), m_7775(), this.f_26229.m_9288()));
         Class_Ssh31B3ljfKeWsvS.m_4864(var7);
         Class_Ssh31B3ljfKeWsvS.m_4828();
      }
   }

   private void m_7793(float var1) {
      Class_Ssh31B3ljfKeWsvS.m_4817(this.m_7801() + f_26436, var1, f_26437, 1.0F, 0.0F, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE));
   }

   private float m_7794(int var1) {
      return this.m_7801() + f_26365 + var1 * 111;
   }

   private float m_7795() {
      return Math.clamp(this.f_26228.m_9288(), 0.0F, 1.0F);
   }

   public void m_7796() {
      this.m_7786();
      this.f_26230 = false;
      this.f_26233 = false;
   }

   private void m_7797(float var1, float var2) {
      float var3 = this.m_7801();
      float var4 = this.m_7773();
      m_7799(var3, var4, f_26275, f_26276);
      Object var5 = m_7768();
      m_7800(var3 + f_26277, var4 + f_26278, f_26279);
      m_7788(m_7798(m_7770(var5), f_26280, 13), var3 + f_26281, var4 + f_26282, f_26283, m_7784());
      m_7788(m_7798(m_7783(var5), f_26284, 10), var3 + f_26285, var4 + f_26286, f_26287, m_7775());
      m_7805(f_26288, var3 + f_26289 - f_26290, var4 + f_26291, f_26292, m_7791());
      this.m_7779(f_26293, f_26294, var4 + f_26295);
      this.m_7804(var5 == null ? f_26296 : String.valueOf(-1), var4 + f_26297, m_7791());
      this.m_7779(f_26298, Class_0p152hWffX3ippAf.m_804(f_26299, f_26300), var4 + f_26301);
      String var10000;
      if (var5 != null && null != null) {
         var10000 = Class_0p152hWffX3ippAf.m_804(f_26304, f_26305);
         Object var10001 = null;
         var10000 = var10000 + "cracked by";
      } else {
         var10000 = Class_0p152hWffX3ippAf.m_804(f_26302, f_26303);
      }

      String var6 = var10000;
      this.m_7804(var6, var4 + f_26306, m_7791());
      this.m_7793(var4 + f_26307);
      this.m_7766(var1, var2, f_26308, Class_0p152hWffX3ippAf.m_804(f_26309, f_26310), var4 + f_26311);
      this.m_7802(Class_WhZ6MBDQaQZ0AZFd.m_5495() ? f_26312 : f_26313, var4 + f_26314);
      if (this.f_26233) {
         this.m_7790(var1, var2);
      } else {
         this.m_7779(f_26315, Class_0p152hWffX3ippAf.m_804(f_26316, f_26317), var4 + f_26318);
         float var7 = this.f_26231 ? this.f_26232 : Class_WhZ6MBDQaQZ0AZFd.m_5487();
         this.m_7804(Math.round(var7 * f_26319) + "", var4 + f_26320, m_7784());
         float var8 = f_26321;
         float var9 = (var7 - f_26322) / f_26323 * var8;
         Class_Ssh31B3ljfKeWsvS.m_4817(
            var3 + f_26324, var4 + f_26325, var8, f_26326, f_26327, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_STATE)
         );
         Class_Ssh31B3ljfKeWsvS.m_4817(var3 + f_26328, var4 + f_26329, Math.max(f_26330, var9), f_26331, f_26332, m_7775());
         Class_Ssh31B3ljfKeWsvS.m_4817(var3 + f_26333 + var9, var4 + f_26334, f_26335, f_26336, f_26337, m_7784());
      }

      this.m_7793(var4 + f_26338);
      this.m_7779(f_26339, Class_0p152hWffX3ippAf.m_804(f_26340, f_26341), var4 + f_26342);
      this.m_7767(var1, var2);
   }

   private static String m_7798(String var0, float var1, int var2) {
      if (Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var0, var2) <= var1) {
         return var0;
      }

      while (!var0.isEmpty() && Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var0 + "", var2) > var1) {
         var0 = var0.substring(0, var0.offsetByCodePoints(var0.length(), -1));
      }

      return var0 + "";
   }

   private static void m_7799(float var0, float var1, float var2, float var3) {
      Class_Ssh31B3ljfKeWsvS.m_4859(var0, var1, var2, var3, f_26438, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SHADOW));
      if (Class_WhZ6MBDQaQZ0AZFd.m_5485() > 0) {
         Class_Ssh31B3ljfKeWsvS.m_4858(var0, var1, var2, var3, f_26439, f_26440, -1);
      }

      Class_Ssh31B3ljfKeWsvS.m_4817(var0, var1, var2, var3, f_26441, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.BACKGROUND));
      Class_Ssh31B3ljfKeWsvS.m_4854(var0, var1, var2, var3, 1.0F, f_26442, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE));
   }

   private static void m_7800(float var0, float var1, float var2) {
      Identifier var3 = f_11537.player == null ? null : Class_7CxJH622IPbYv0YY.m_1607(f_11537.player);
      if (var3 == null) {
         Class_Ssh31B3ljfKeWsvS.m_4817(var0, var1, var2, var2, f_26445, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SELECTED));
         m_7805(f_26446, var0 + var2 * f_26447, var1 + var2 * f_26448, var2 * f_26449, m_7791());
      } else {
         Class_Ssh31B3ljfKeWsvS.m_4850(var0, var1, var2, var2, new Vector4f(f_26450), new Vector4f(f_26451), new Vector4i(-1), var3, FilterMode.NEAREST);
         Class_Ssh31B3ljfKeWsvS.m_4850(
            var0, var1, var2, var2, new Vector4f(f_26452), new Vector4f(f_26453, f_26454, f_26455, f_26456), new Vector4i(-1), var3, FilterMode.NEAREST
         );
      }
   }

   private float m_7801() {
      return this.f_26227.getGuiX() - f_26237 - f_26238 + f_26239 * (1.0F - this.m_7795());
   }

   private void m_7802(String var1, float var2) {
      m_7788(var1, this.m_7801() + f_26426 - f_26427 - Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var1, 11), var2, f_26428, m_7791());
      m_7805(f_26429, this.m_7801() + f_26430 - f_26431, var2 + 2.0F, f_26432, m_7791());
   }

   public void m_7803() {
      if (this.f_26230) {
         this.m_7796();
      } else {
         this.f_26230 = true;
         this.f_26233 = false;
      }
   }

   private void m_7804(String var1, float var2, int var3) {
      m_7788(var1, this.m_7801() + f_26433 - f_26434 - Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var1, 10), var2, f_26435, var3);
   }

   private static void m_7805(String var0, float var1, float var2, float var3, int var4) {
      int var5 = Math.round(var3);
      float var6 = Class_y1y6QpONhWEUIdEB.m_9591().m_7383().m_2150(var0.codePointAt(0), var5);
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9591(),
         var0,
         var1 + (var3 - var6) * f_26457,
         Class_Ssh31B3ljfKeWsvS.m_4863(Class_y1y6QpONhWEUIdEB.m_9591(), var0, var2 + var3 * f_26458, var5),
         var5,
         var4
      );
   }
}
