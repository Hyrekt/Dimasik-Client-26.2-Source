package dev.dimasik.client.system;

import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import net.minecraft.client.gui.screens.ChatScreen;
import org.joml.Matrix4f;

public final class Class_u8iL1f1cFf6CucWB implements Class_NzJrN63M7QBpmAbi {
   private static final float f_32393 = 158.0F;
   private static final float f_32394 = 26.0F;
   private static final float f_32395 = 54.0F;
   private static final float f_32396 = 7.0F;
   private static final float f_32397 = 138.0F;
   private static final float f_32398 = 92.0F;
   private static final float f_32399 = 40.0F;
   private static final float f_32400 = 22.0F;
   private static final float f_32401 = 11.0F;
   private final String f_32402;
   private final String f_32403;
   private final ItemListSetting f_32404;
   private final Supplier<MultiChoiceSetting> f_32405;
   private final MultiChoiceSetting f_32406;
   private final MultiChoiceSetting f_32407;
   private final CheckboxSetting f_32408;
   private final CheckboxSetting f_32409;
   private final String f_32410;
   private final CheckboxSetting f_32411;
   private final String f_32412;
   private final SliderSetting f_32413;
   private final Function<Float, String> f_32414;
   private CheckboxSetting f_32415;
   private SliderSetting f_32416;
   private String f_32417;
   private final Class_w8fCJQ5ZtH5lQbWc f_32418;
   private final Class_w8fCJQ5ZtH5lQbWc f_32419;
   private final Class_w8fCJQ5ZtH5lQbWc f_32420;
   private final Class_w8fCJQ5ZtH5lQbWc f_32421;
   private final Class_w8fCJQ5ZtH5lQbWc f_32422;
   private final Class_w8fCJQ5ZtH5lQbWc f_32423;
   private final Class_w8fCJQ5ZtH5lQbWc f_32424;
   private final IdentityHashMap<Class_2ZaVm8TGDJ68TnJB, Class_w8fCJQ5ZtH5lQbWc> f_32425;
   private final IdentityHashMap<Class_2ZaVm8TGDJ68TnJB, Class_w8fCJQ5ZtH5lQbWc> f_32426;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_32427;
   private boolean f_32428;
   private boolean f_32429;
   private boolean f_32430;
   private float f_32431;
   private float f_32432;
   private float f_32433;
   private float f_32434;
   private float f_32435;
   private static final String f_32436 = "3D модель";
   private static final float f_32437 = 10.0F;
   private static final float f_32438 = 7.0F;
   private static final float f_32439 = 7.0F;
   private static final float f_32440 = 7.0F;
   private static final float f_32441 = 7.0F;
   private static final float f_32442 = 14.0F;
   private static final float f_32443 = 14.0F;
   private static final String f_32444 = "3D модель";
   private static final float f_32445 = 10.0F;
   private static final float f_32446 = 7.0F;
   private static final float f_32447 = 7.0F;
   private static final float f_32448 = 7.0F;
   private static final float f_32449 = 7.0F;
   private static final float f_32450 = 14.0F;
   private static final float f_32451 = 14.0F;
   private static final String f_32452 = "3D модель";
   private static final float f_32453 = 10.0F;
   private static final float f_32454 = 7.0F;
   private static final float f_32455 = 7.0F;
   private static final float f_32456 = 7.0F;
   private static final float f_32457 = 7.0F;
   private static final float f_32458 = 14.0F;
   private static final float f_32459 = 14.0F;
   private static final String f_32460 = "Частицы";
   private static final String f_32461 = "3D модель";
   private static final float f_32462 = 10.0F;
   private static final float f_32463 = 7.0F;
   private static final float f_32464 = 7.0F;
   private static final float f_32465 = 7.0F;
   private static final float f_32466 = 7.0F;
   private static final float f_32467 = 14.0F;
   private static final float f_32468 = 14.0F;
   private static final String f_32469 = "3D модель";
   private static final float f_32470 = 10.0F;
   private static final float f_32471 = 7.0F;
   private static final float f_32472 = 7.0F;
   private static final float f_32473 = 7.0F;
   private static final float f_32474 = 7.0F;
   private static final float f_32475 = 14.0F;
   private static final float f_32476 = 14.0F;
   private static final float f_32477 = 30.0F;
   private static final float f_32478 = 26.0F;
   private static final float f_32479 = 26.0F;
   private static final float f_32480 = 26.0F;
   private static final float f_32481 = 48.0F;
   private static final float f_32482 = 26.0F;
   private static final float f_32483 = 26.0F;
   private static final float f_32484 = 26.0F;
   private static final float f_32485 = 40.0F;
   private static final float f_32486 = 26.0F;
   private static final String f_32487 = "Выкл";
   private static final String f_32488 = "Вкл";
   private static final String f_32489 = "Вкл";
   private static final String f_32490 = "Выкл";
   private static final float f_32491 = 6.0F;
   private static final float f_32492 = 4.0F;
   private static final float f_32493 = 158.0F;
   private static final float f_32494 = 4.0F;
   private static final float f_32495 = 6.0F;
   private static final float f_32496 = 4.0F;
   private static final float f_32497 = 4.0F;
   private static final float f_32498 = 158.0F;
   private static final float f_32499 = 4.0F;
   private static final float f_32500 = 4.0F;
   private static final float f_32501 = 8.0F;
   private static final float f_32502 = 158.0F;
   private static final float f_32503 = 4.0F;
   private static final float f_32504 = 4.0F;
   private static final float f_32505 = 4.0F;
   private static final float f_32506 = 4.0F;
   private static final float f_32507 = 4.0F;
   private static final float f_32508 = 54.0F;
   private static final float f_32509 = 26.0F;
   private static final float f_32510 = 26.0F;
   private static final float f_32511 = 7.0F;
   private static final double f_32512 = 144.0;
   private static final float f_32513 = 26.0F;
   private static final float f_32514 = 158.0F;
   private static final float f_32515 = 41.0F;
   private static final double f_32516 = 30.0;
   private static final double f_32517 = 18.0;
   private static final float f_32518 = 26.0F;
   private static final double f_32519 = 30.0;
   private static final double f_32520 = 18.0;
   private static final float f_32521 = 26.0F;
   private static final double f_32522 = 30.0;
   private static final double f_32523 = 18.0;
   private static final double f_32524 = 30.0;
   private static final double f_32525 = 18.0;
   private static final float f_32526 = 11.0F;
   private static final float f_32527 = 136.0F;
   private static final float f_32528 = 26.0F;
   private static final float f_32529 = 22.0F;
   private static final float f_32530 = 8.0F;
   private static final double f_32531 = 20.0;
   private static final float f_32532 = 11.0F;
   private static final float f_32533 = 136.0F;
   private static final float f_32534 = 54.0F;
   private static final float f_32535 = 22.0F;
   private static final float f_32536 = 8.0F;
   private static final double f_32537 = 20.0;
   private static final float f_32538 = 54.0F;
   private static final float f_32539 = 22.0F;
   private static final float f_32540 = 28.0F;
   private static final float f_32541 = 26.0F;
   private static final float f_32542 = 7.0F;
   private static final double f_32543 = 144.0;
   private static final float f_32544 = 26.0F;
   private static final double f_32545 = 158.0;
   private static final float f_32546 = 158.0F;
   private static final float f_32547 = 41.0F;
   private static final float f_32548 = 54.0F;
   private static final double f_32549 = 30.0;
   private static final double f_32550 = 18.0;
   private static final double f_32551 = 158.0;
   private static final float f_32552 = 11.0F;
   private static final float f_32553 = 136.0F;
   private static final float f_32554 = 54.0F;
   private static final float f_32555 = 8.0F;
   private static final double f_32556 = 20.0;
   private static final double f_32557 = 158.0;
   private static final float f_32558 = 54.0F;
   private static final float f_32559 = 26.0F;
   private static final float f_32560 = 26.0F;
   private static final float f_32561 = 7.0F;
   private static final float f_32562 = 54.0F;
   private static final double f_32563 = 144.0;
   private static final double f_32564 = 158.0;
   private static final String f_32565 = "I";
   private static final String f_32566 = "Отключите Заменение скина";
   private static final String f_32567 = "Отключите Заменение скина";
   private static final float f_32568 = 0.01F;
   private static final float f_32569 = 158.0F;
   private static final float f_32570 = 158.0F;
   private static final float f_32571 = 12.0F;
   private static final float f_32572 = 158.0F;
   private static final float f_32573 = 26.0F;
   private static final float f_32574 = 0.75F;
   private static final float f_32575 = 158.0F;
   private static final float f_32576 = 12.0F;
   private static final float f_32577 = 158.0F;
   private static final float f_32578 = 12.0F;
   private static final float f_32579 = 11.0F;
   private static final float f_32580 = 8.0F;
   private static final String f_32581 = "F";
   private static final String f_32582 = "F";
   private static final float f_32583 = 158.0F;
   private static final float f_32584 = 11.0F;
   private static final float f_32585 = 8.0F;
   private static final float f_32586 = 33.0F;
   private static final float f_32587 = 0.96F;
   private static final float f_32588 = 0.04F;
   private static final float f_32589 = 79.0F;
   private static final float f_32590 = 0.5F;
   private static final float f_32591 = 255.0F;
   private static final float f_32592 = 11.0F;
   private static final float f_32593 = 158.0F;
   private static final float f_32594 = 11.0F;
   private static final float f_32595 = 8.0F;
   private static final float f_32596 = 54.0F;
   private static final String f_32597 = "Вид";
   private static final float f_32598 = 5.0F;
   private static final float f_32599 = 26.0F;
   private static final float f_32600 = 0.05F;
   private static final float f_32601 = 0.5F;
   private static final float f_32602 = 3.0F;
   private static final float f_32603 = 26.0F;
   private static final String f_32604 = "От головы";
   private static final String f_32605 = "Включить частицы";
   private static final float f_32606 = 11.0F;
   private static final float f_32607 = 5.0F;
   private static final float f_32608 = 26.0F;
   private static final float f_32609 = 11.0F;
   private static final float f_32610 = 5.0F;
   private static final float f_32611 = 26.0F;
   private static final float f_32612 = 11.0F;
   private static final float f_32613 = 5.0F;
   private static final float f_32614 = 11.0F;
   private static final float f_32615 = 5.0F;
   private static final float f_32616 = 26.0F;
   private static final float f_32617 = 100.0F;
   private static final float f_32618 = 100.0F;
   private static final String f_32619 = "Размер 3D";
   private static final float f_32620 = 11.0F;
   private static final float f_32621 = 158.0F;
   private static final float f_32622 = 11.0F;
   private static final float f_32623 = 22.0F;
   private static final float f_32624 = 0.01F;
   private static final String f_32625 = "Частицы";
   private static final float f_32626 = 11.0F;
   private static final float f_32627 = 158.0F;
   private static final float f_32628 = 11.0F;
   private static final float f_32629 = 22.0F;
   private static final float f_32630 = 22.0F;
   private static final float f_32631 = 28.0F;
   private static final float f_32632 = 0.05F;
   private static final float f_32633 = 0.5F;
   private static final float f_32634 = 3.0F;
   private static final float f_32635 = 26.0F;
   private static final float f_32636 = 54.0F;
   private static final float f_32637 = 11.0F;
   private static final float f_32638 = 5.0F;
   private static final float f_32639 = 158.0F;
   private static final float f_32640 = 41.0F;
   private static final float f_32641 = 30.0F;
   private static final float f_32642 = 18.0F;
   private static final float f_32643 = 7.0F;
   private static final float f_32644 = 12.0F;
   private static final float f_32645 = 4.0F;
   private static final float f_32646 = 14.0F;
   private static final float f_32647 = 14.0F;
   private static final float f_32648 = 6.0F;
   private static final float f_32649 = 54.0F;
   private static final float f_32650 = 11.0F;
   private static final float f_32651 = 14.0F;
   private static final float f_32652 = 158.0F;
   private static final float f_32653 = 11.0F;
   private static final float f_32654 = 14.0F;
   private static final float f_32655 = 11.0F;
   private static final float f_32656 = 136.0F;
   private static final float f_32657 = 4.0F;
   private static final float f_32658 = 13.0F;
   private static final float f_32659 = 6.5F;
   private static final float f_32660 = 0.35F;
   private static final float f_32661 = 5.5F;
   private static final float f_32662 = 11.0F;
   private static final float f_32663 = 136.0F;
   private static final float f_32664 = 11.0F;
   private static final float f_32665 = 136.0F;
   private static final float f_32666 = 4.0F;
   private static final float f_32667 = 13.0F;
   private static final float f_32668 = 6.5F;
   private static final float f_32669 = 0.35F;
   private static final float f_32670 = 5.5F;
   private static final float f_32671 = 54.0F;
   private static final float f_32672 = 26.0F;
   private static final float f_32673 = 7.0F;
   private static final double f_32674 = 144.0;
   private static final double f_32675 = 24.0;
   private static final float f_32676 = 6.0F;
   private static final float f_32677 = 0.35F;
   private static final String f_32678 = "r";
   private static final float f_32679 = 11.0F;
   private static final float f_32680 = 4.0F;
   private static final float f_32681 = 6.0F;
   private static final float f_32682 = 12.0F;
   private static final float f_32683 = 16.0F;
   private static final float f_32684 = 4.0F;
   private static final float f_32685 = 138.0F;
   private static final float f_32686 = 26.0F;
   private static final float f_32687 = 8.0F;
   private static final float f_32688 = 87.0F;
   private static final float f_32689 = 92.0F;
   private static final float f_32690 = 54.0F;
   private static final float f_32691 = 26.0F;
   private static final float f_32692 = 7.0F;
   private static final float f_32693 = 12.0F;
   private static final float f_32694 = 7.0F;

   public void m_9060(float var1, float var2) {
      if (this.f_32428) {
         this.m_9093();
      } else {
         float var3 = this.m_9092();
         this.f_32431 = Math.clamp(var1 + f_32491, f_32492, f_11537.getWindow().getScreenWidth() - f_32493 - f_32494);
         this.f_32432 = Math.clamp(var2 + f_32495, f_32496, f_11537.getWindow().getScreenHeight() - var3 - f_32497);
         this.f_32428 = true;
         this.m_9088();
      }
   }

   private void m_9061(float var1, float var2, float var3) {
      if (this.f_32429 && this.m_9098()) {
         this.m_9069(var1);
      }

      this.f_32419.m_9283(this.f_32408.m_8768() ? 1.0F : 0.0F);
      if (this.f_32411 != null) {
         this.f_32421.m_9283(this.f_32411.m_8768() ? 1.0F : 0.0F);
      }

      float var4 = this.f_32419.m_9288();
      float var5 = var3;
      float var6 = this.f_32433 + f_32596;
      if (this.f_32406 != null) {
         this.m_9102(
            f_32597,
            this.f_32406.m_7564().m_1181(),
            var6 + f_32598,
            m_9103(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT, var5),
            m_9103(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT, var5)
         );
         List var7 = this.f_32406.m_8768();
         float var8 = var6 + f_32599;
         float var9 = Math.min(f_32600, f_32601 / var7.size());

         for (int var10 = 0; var10 < var7.size(); var10++) {
            float var11 = Math.clamp(var3 * (1.0F + var7.size() * var9) - var10 * var9, 0.0F, 1.0F);
            var11 = var11 * var11 * (f_32602 - 2.0F * var11);
            this.m_9087(this.f_32406, (Class_2ZaVm8TGDJ68TnJB)var7.get(var10), var8 + var10 * f_32603, var3, var11, var1, var2);
         }
      }

      float var17 = var6 + this.m_9095();
      Class_U4Qsm43RVlUI3Pre.m_5186(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         this.f_32411 != null ? f_32604 : f_32605,
         this.f_32431 + f_32606,
         var17 + f_32607,
         11,
         m_9103(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT, var5)
      );
      this.m_9071(var17, var4, var5);
      if (this.f_32411 != null) {
         float var18 = var17 + f_32608;
         Class_U4Qsm43RVlUI3Pre.m_5186(
            Class_y1y6QpONhWEUIdEB.m_9588(), this.f_32412, this.f_32431 + f_32609, var18 + f_32610, 11, m_9103(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT, var5)
         );
         this.m_9071(var18, this.f_32421.m_9288(), var5);
      }

      if (this.f_32409 != null) {
         this.f_32420.m_9283(this.f_32409.m_8768() ? 1.0F : 0.0F);
         float var19 = var17 + f_32611 + this.m_9084();
         Class_U4Qsm43RVlUI3Pre.m_5186(
            Class_y1y6QpONhWEUIdEB.m_9588(), this.f_32410, this.f_32431 + f_32612, var19 + f_32613, 11, m_9103(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT, var5)
         );
         this.m_9071(var19, this.f_32420.m_9288(), var5);
      }

      if (this.f_32415 != null) {
         this.f_32422.m_9283(this.f_32415.m_8768() ? 1.0F : 0.0F);
         float var20 = this.m_9096(var17);
         Class_U4Qsm43RVlUI3Pre.m_5186(
            Class_y1y6QpONhWEUIdEB.m_9588(), this.f_32417, this.f_32431 + f_32614, var20 + f_32615, 11, m_9103(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT, var5)
         );
         this.m_9071(var20, this.f_32422.m_9288(), var5);
         if (this.m_9099()) {
            if (this.f_32430) {
               this.m_9062(var1);
            }

            float var22 = var20 + f_32616;
            String var24 = Math.round(this.f_32416.m_8768() * f_32617) / f_32618 + "";
            Class_U4Qsm43RVlUI3Pre.m_5186(
               Class_y1y6QpONhWEUIdEB.m_9588(), f_32619, this.f_32431 + f_32620, var22, 11, m_9103(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT, var5)
            );
            Class_U4Qsm43RVlUI3Pre.m_5186(
               Class_y1y6QpONhWEUIdEB.m_9588(),
               var24,
               this.f_32431 + f_32621 - f_32622 - Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var24, 11),
               var22,
               11,
               m_9103(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT, var5)
            );
            this.m_9073(var22 + f_32623, var5);
         }
      }

      float var21 = this.f_32411 == null ? var4 : Math.max(var4, this.f_32421.m_9288());
      float var23 = var5 * var21;
      if (!(var23 <= f_32624)) {
         float var25 = var6 + this.m_9094();
         String var27 = this.f_32414.apply(this.f_32413.m_8768());
         Class_U4Qsm43RVlUI3Pre.m_5186(
            Class_y1y6QpONhWEUIdEB.m_9588(), f_32625, this.f_32431 + f_32626, var25, 11, m_9103(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT, var23)
         );
         Class_U4Qsm43RVlUI3Pre.m_5186(
            Class_y1y6QpONhWEUIdEB.m_9588(),
            var27,
            this.f_32431 + f_32627 - f_32628 - Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var27, 11),
            var25,
            11,
            m_9103(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT, var23)
         );
         this.m_9089(var25 + f_32629, var23);
         if (this.f_32407 != null) {
            List var12 = this.f_32407.m_8768();
            float var13 = var25 + f_32630 + f_32631;
            float var14 = Math.min(f_32632, f_32633 / var12.size());

            for (int var15 = 0; var15 < var12.size(); var15++) {
               float var16 = Math.clamp(var3 * (1.0F + var12.size() * var14) - var15 * var14, 0.0F, 1.0F);
               var16 = var16 * var16 * (f_32634 - 2.0F * var16);
               this.m_9067((Class_2ZaVm8TGDJ68TnJB)var12.get(var15), var13 + var15 * f_32635, var3 * var23, var16, var1, var2);
            }
         }
      }
   }

   public Class_u8iL1f1cFf6CucWB(String var1, CheckboxSetting var2, SliderSetting var3, MultiChoiceSetting var4) {
      this(var1, var2, var3, var4, null, null);
   }

   private void m_9062(float var1) {
      if (this.f_32416 != null) {
         this.m_9074(this.f_32416, var1);
      }
   }

   private float m_9063() {
      return this.m_9066(this.f_32413);
   }

   private float m_9065(float var1) {
      float var2 = this.f_32433 + this.f_32434 * f_32590;
      return var2 + (var1 - var2) / this.f_32435;
   }

   private float m_9066(SliderSetting var1) {
      float var2 = var1.m_813() - var1.m_824();
      return var2 == 0.0F ? 0.0F : (var1.m_8768() - var1.m_824()) / var2;
   }

   private void m_9067(Class_2ZaVm8TGDJ68TnJB var1, float var2, float var3, float var4, float var5, float var6) {
      this.m_9090(var1, this.m_9072(var1), var2, var3, var4, var5, var6);
   }

   private void m_9068(Class_2ZaVm8TGDJ68TnJB var1) {
      if (this.f_32407 != null) {
         this.f_32407.m_1767(var1);
      } else if (this.f_32404 != null) {
         var1.m_1183(!var1.m_1187());
      } else {
         this.f_32405.get().m_1767(var1);
      }
   }

   private void m_9069(float var1) {
      this.m_9074(this.f_32413, var1);
   }

   public boolean m_9070(float var1, float var2, int var3) {
      if (!this.f_32428) {
         return false;
      }

      var1 = this.m_9081(var1);
      var2 = this.m_9065(var2);
      if (var3 == 0 && this.m_9075()) {
         float var18 = this.f_32433 + f_32508;
         if (this.f_32406 != null) {
            float var21 = var18 + f_32509;
            int var23 = (int)((var2 - var21) / f_32510);
            if (var23 >= 0
               && var23 < this.f_32406.m_8768().size()
               && Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_32431 + f_32511, var21, f_32512, this.f_32406.m_8768().size() * f_32513)) {
               this.f_32406.m_1767(this.f_32406.m_8768().get(var23));
               return true;
            }
         }

         float var22 = var18 + this.m_9095();
         float var24 = this.f_32431 + f_32514 - f_32515;
         float var7 = var22 + 2.0F;
         if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var24, var7, f_32516, f_32517)) {
            this.f_32408.m_823(!this.f_32408.m_8768());
            return true;
         }

         if (this.f_32411 != null) {
            float var8 = var22 + f_32518 + 2.0F;
            if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var24, var8, f_32519, f_32520)) {
               this.f_32411.m_823(!this.f_32411.m_8768());
               return true;
            }
         }

         if (this.f_32409 != null) {
            float var25 = var22 + f_32521 + this.m_9084() + 2.0F;
            if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var24, var25, f_32522, f_32523)) {
               boolean var29 = !this.f_32409.m_8768();
               this.f_32409.m_823(var29);
               if (var29 && this.f_32415 != null) {
                  this.f_32415.m_823(false);
               }

               return true;
            }
         }

         if (this.f_32415 != null) {
            float var26 = this.m_9096(var22);
            if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var24, var26 + 2.0F, f_32524, f_32525)) {
               if (!this.f_32415.m_8768() && this.f_32409 != null && this.f_32409.m_8768()) {
                  this.m_9085();
                  return true;
               }

               this.f_32415.m_823(!this.f_32415.m_8768());
               return true;
            }

            if (this.m_9099()) {
               float var9 = this.f_32431 + f_32526;
               float var10 = f_32527;
               float var11 = var26 + f_32528 + f_32529;
               if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var9, var11 - f_32530, var10, f_32531)) {
                  this.f_32430 = true;
                  this.m_9062(var1);
                  return true;
               }
            }
         }

         if (this.m_9098()) {
            float var27 = this.f_32431 + f_32532;
            float var28 = f_32533;
            float var30 = this.f_32433 + f_32534 + this.m_9094() + f_32535;
            if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var27, var30 - f_32536, var28, f_32537)) {
               this.f_32429 = true;
               this.m_9069(var1);
               return true;
            }

            if (this.f_32407 != null) {
               List var31 = this.f_32407.m_8768();
               float var12 = this.f_32433 + f_32538 + this.m_9094() + f_32539 + f_32540;
               int var13 = (int)((var2 - var12) / f_32541);
               if (var13 >= 0
                  && var13 < var31.size()
                  && Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_32431 + f_32542, var12, f_32543, var31.size() * f_32544)) {
                  this.f_32407.m_1767((Class_2ZaVm8TGDJ68TnJB)var31.get(var13));
                  return true;
               }
            }
         }

         if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_32431, this.f_32433, f_32545, this.m_9092())) {
            return true;
         }

         this.m_9093();
         return false;
      } else if (var3 == 0 && this.m_9105()) {
         float var17 = this.f_32431 + f_32546 - f_32547;
         float var20 = this.f_32433 + f_32548 + 2.0F;
         if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var17, var20, f_32549, f_32550)) {
            this.f_32408.m_823(!this.f_32408.m_8768());
            return true;
         }

         if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_32431, this.f_32433, f_32551, this.m_9092())) {
            return true;
         }

         this.m_9093();
         return false;
      } else if (var3 == 0 && this.m_9097()) {
         float var16 = this.f_32431 + f_32552;
         float var19 = f_32553;
         if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var16, this.f_32433 + f_32554 - f_32555, var19, f_32556)) {
            this.f_32429 = true;
            this.m_9069(var1);
            return true;
         }

         if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_32431, this.f_32433, f_32557, this.m_9092())) {
            return true;
         }

         this.m_9093();
         return false;
      } else {
         if (var3 == 0 && !this.m_9075() && !this.m_9105()) {
            List var4 = this.m_9101();
            int var5 = (int)((var2 - this.f_32433 - f_32558) / f_32559);
            float var6 = var4.size() * f_32560;
            if (var5 >= 0 && var5 < var4.size() && Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_32431 + f_32561, this.f_32433 + f_32562, f_32563, var6)) {
               this.m_9068((Class_2ZaVm8TGDJ68TnJB)var4.get(var5));
               return true;
            }
         }

         if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_32431, this.f_32433, f_32564, this.m_9092())) {
            return true;
         }

         this.m_9093();
         return false;
      }
   }

   public Class_u8iL1f1cFf6CucWB(String var1, String var2, ItemListSetting var3) {
      this.f_32417 = f_32436;
      this.f_32418 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32437, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_32419 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32438, Class_eXr9Fra2ad3yFXY8.f_19101);
      this.f_32420 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32439, Class_eXr9Fra2ad3yFXY8.f_19101);
      this.f_32421 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32440, Class_eXr9Fra2ad3yFXY8.f_19101);
      this.f_32422 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32441, Class_eXr9Fra2ad3yFXY8.f_19101);
      this.f_32423 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32442, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_32424 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32443, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_32425 = new IdentityHashMap<>();
      this.f_32426 = new IdentityHashMap<>();
      this.f_32427 = new Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo>() {
         public void m_1781(Class_bhRaN0YSSLQRYjPo var1) {
            Class_u8iL1f1cFf6CucWB.this.m_9083(var1);
         }

         @Override
         public int m_1780() {
            return -100;
         }
      };
      this.f_32435 = 1.0F;
      this.f_32402 = var1;
      this.f_32403 = var2;
      this.f_32404 = var3;
      this.f_32405 = null;
      this.f_32406 = null;
      this.f_32407 = null;
      this.f_32408 = null;
      this.f_32409 = null;
      this.f_32410 = null;
      this.f_32411 = null;
      this.f_32412 = null;
      this.f_32413 = null;
      this.f_32414 = null;
   }

   private void m_9071(float var1, float var2, float var3) {
      int var4 = Class_BftdentXEtGbugJw.m_2302(m_9103(Class_y3cvEHXTSEF5dp8q.DEACTIVE_STATE, var3), m_9103(Class_y3cvEHXTSEF5dp8q.ACTIVE_STATE, var3), var2);
      int var5 = m_9103(Class_y3cvEHXTSEF5dp8q.CIRCLE, var3);
      float var6 = this.f_32431 + f_32639 - f_32640;
      Class_U4Qsm43RVlUI3Pre.m_5199(var6, var1 + 2.0F, f_32641, f_32642, f_32643, var4);
      Class_U4Qsm43RVlUI3Pre.m_5199(var6 + 2.0F + f_32644 * var2, var1 + f_32645, f_32646, f_32647, f_32648, var5);
   }

   private boolean m_9072(Class_2ZaVm8TGDJ68TnJB var1) {
      if (this.f_32407 != null) {
         return this.f_32407.m_7564() == var1;
      } else {
         return this.f_32404 != null ? var1.m_1187() : this.f_32405.get().m_7564() == var1;
      }
   }

   private void m_9073(float var1, float var2) {
      this.f_32424.m_9283(this.m_9066(this.f_32416));
      float var3 = Math.clamp(this.f_32424.m_9288(), 0.0F, 1.0F);
      float var4 = this.f_32431 + f_32664;
      float var5 = f_32665;
      float var6 = f_32666;
      Class_U4Qsm43RVlUI3Pre.m_5199(var4, var1, var5, var6, 2.0F, m_9103(Class_y3cvEHXTSEF5dp8q.WINDOW_BACKGROUND_TWO, var2));
      Class_U4Qsm43RVlUI3Pre.m_5199(var4, var1, Math.max(var6, var5 * var3), var6, 2.0F, m_9103(Class_y3cvEHXTSEF5dp8q.MAIN, var2));
      float var7 = f_32667;
      float var8 = var4 + var5 * var3 - var7 / 2.0F;
      float var9 = var1 + var6 / 2.0F - var7 / 2.0F;
      Class_U4Qsm43RVlUI3Pre.m_5199(var8 - 1.0F, var9 - 1.0F, var7 + 2.0F, var7 + 2.0F, f_32668, m_9103(Class_y3cvEHXTSEF5dp8q.MAIN, f_32669 * var2));
      Class_U4Qsm43RVlUI3Pre.m_5199(var8, var9, var7, var7, f_32670, m_9103(Class_y3cvEHXTSEF5dp8q.CIRCLE, var2));
   }

   private void m_9074(SliderSetting var1, float var2) {
      float var3 = this.f_32431 + f_32662;
      float var4 = f_32663;
      float var5 = (var2 - var3) / var4 * (var1.m_813() - var1.m_824()) + var1.m_824();
      if (var1.m_817() > 0.0F) {
         var5 = (float)Class_3VHxwfI2NZKoxzIi.m_1308(var5, var1.m_817());
      }

      var1.m_823(var5);
   }

   private boolean m_9075() {
      return this.f_32408 != null && this.f_32413 != null;
   }

   private String m_9077() {
      if (this.m_9075()) {
         if (!this.m_9098()) {
            return f_32487;
         } else {
            return this.f_32407 != null ? this.f_32407.m_7564().m_1181() : f_32488;
         }
      } else if (this.m_9105()) {
         return this.f_32408.m_8768() ? f_32489 : f_32490;
      } else if (this.m_9097()) {
         return this.f_32414.apply(this.f_32413.m_8768());
      } else if (this.f_32404 != null) {
         long var1 = this.f_32404.m_8768().stream().filter(Class_2ZaVm8TGDJ68TnJB::m_1187).count();
         return "" + var1 + this.f_32404.m_8768().size();
      } else {
         return this.f_32405.get().m_7564().m_1181();
      }
   }

   public Class_u8iL1f1cFf6CucWB(String var1, String var2, CheckboxSetting var3) {
      this.f_32417 = f_32469;
      this.f_32418 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32470, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_32419 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32471, Class_eXr9Fra2ad3yFXY8.f_19101);
      this.f_32420 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32472, Class_eXr9Fra2ad3yFXY8.f_19101);
      this.f_32421 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32473, Class_eXr9Fra2ad3yFXY8.f_19101);
      this.f_32422 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32474, Class_eXr9Fra2ad3yFXY8.f_19101);
      this.f_32423 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32475, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_32424 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32476, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_32425 = new IdentityHashMap<>();
      this.f_32426 = new IdentityHashMap<>();
      this.f_32427 = new Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo>() {
         public void m_1781(Class_bhRaN0YSSLQRYjPo var1) {
            Class_u8iL1f1cFf6CucWB.this.m_9083(var1);
         }

         @Override
         public int m_1780() {
            return -100;
         }
      };
      this.f_32435 = 1.0F;
      this.f_32402 = var1;
      this.f_32403 = var2;
      this.f_32404 = null;
      this.f_32405 = null;
      this.f_32406 = null;
      this.f_32407 = null;
      this.f_32408 = var3;
      this.f_32409 = null;
      this.f_32410 = null;
      this.f_32411 = null;
      this.f_32412 = null;
      this.f_32413 = null;
      this.f_32414 = null;
   }

   private void m_9078(float var1, float var2) {
      if (this.f_32429) {
         this.m_9069(var1);
      }

      float var3 = this.f_32433 + f_32649;
      this.m_9089(var3, var2);
      String var4 = this.f_32414.apply(this.f_32413.m_824());
      String var5 = this.f_32414.apply(this.f_32413.m_813());
      int var6 = m_9103(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT, var2);
      Class_U4Qsm43RVlUI3Pre.m_5186(Class_y1y6QpONhWEUIdEB.m_9588(), var4, this.f_32431 + f_32650, var3 + f_32651, 10, var6);
      Class_U4Qsm43RVlUI3Pre.m_5186(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         var5,
         this.f_32431 + f_32652 - f_32653 - Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var5, 10),
         var3 + f_32654,
         10,
         var6
      );
   }

   private void m_9079(float var1) {
      this.f_32419.m_9283(this.f_32408.m_8768() ? 1.0F : 0.0F);
      float var2 = this.f_32419.m_9288();
      float var3 = this.f_32433 + f_32636;
      Class_U4Qsm43RVlUI3Pre.m_5186(
         Class_y1y6QpONhWEUIdEB.m_9588(), this.f_32403, this.f_32431 + f_32637, var3 + f_32638, 11, m_9103(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT, var1)
      );
      this.m_9071(var3, var2, var1);
   }

   public Class_u8iL1f1cFf6CucWB m_9080(CheckboxSetting var1, SliderSetting var2) {
      this.f_32415 = var1;
      this.f_32416 = var2;
      return this;
   }

   private float m_9081(float var1) {
      float var2 = this.f_32431 + f_32589;
      return var2 + (var1 - var2) / this.f_32435;
   }

   public void m_9082() {
      this.f_32429 = false;
      this.f_32430 = false;
   }

   private void m_9083(Class_bhRaN0YSSLQRYjPo var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (!(f_11537.gui.screen() instanceof ChatScreen)) {
            this.m_9093();
         }

         this.f_32418.m_9283(this.f_32428 ? 1.0F : 0.0F);
         float var2 = Math.clamp(this.f_32418.m_9288(), 0.0F, 1.0F);
         if (!(var2 <= f_32568)) {
            if (f_11537.getWindow().getScreenWidth() > 0 && f_11537.getWindow().getScreenHeight() > 0) {
               this.m_9088();
               float var3 = this.m_9081(var1.m_6082());
               float var4 = this.m_9065(var1.m_6084());
               Matrix4f var5 = new Matrix4f(Class_Ssh31B3ljfKeWsvS.m_4853());
               float var6 = Class_Ssh31B3ljfKeWsvS.m_4821();

               try {
                  Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
                  Class_FvJXUGWpZo3zYBW4.m_2692(this.f_32431, this.f_32433, f_32569, this.f_32434, this.f_32435);
                  Class_Ssh31B3ljfKeWsvS.m_4864(var6 * var2);
                  Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());

                  try {
                     if (Class_oDLvT3Io61u7HRHc.m_7743()) {
                        Class_oDLvT3Io61u7HRHc.m_7752(this.f_32431, this.f_32433, f_32570, this.f_32434, f_32571);
                     } else {
                        Class_U4Qsm43RVlUI3Pre.m_5211(
                           this.f_32431, this.f_32433, f_32572, this.f_32434, f_32573, m_9103(Class_y3cvEHXTSEF5dp8q.WINDOW_SHADOW, f_32574)
                        );
                        Class_U4Qsm43RVlUI3Pre.m_5199(
                           this.f_32431, this.f_32433, f_32575, this.f_32434, f_32576, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_BACKGROUND)
                        );
                        Class_oDLvT3Io61u7HRHc.m_7738(this.f_32431, this.f_32433, f_32577, this.f_32434, f_32578);
                     }

                     Class_U4Qsm43RVlUI3Pre.m_5186(
                        Class_y1y6QpONhWEUIdEB.m_9588(),
                        this.f_32402,
                        this.f_32431 + f_32579,
                        this.f_32433 + f_32580,
                        13,
                        Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT)
                     );
                     float var7 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9591(), f_32581, 12);
                     Class_U4Qsm43RVlUI3Pre.m_5186(
                        Class_y1y6QpONhWEUIdEB.m_9591(),
                        f_32582,
                        this.f_32431 + f_32583 - f_32584 - var7,
                        this.f_32433 + f_32585,
                        13,
                        Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN)
                     );
                     int var8 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT);
                     this.m_9102(this.f_32403, this.m_9077(), this.f_32433 + f_32586, var8, var8);
                     if (this.m_9075()) {
                        this.m_9061(var3, var4, 1.0F);
                     } else if (this.m_9105()) {
                        this.m_9079(1.0F);
                     } else if (this.m_9097()) {
                        this.m_9078(var3, 1.0F);
                     } else {
                        List var9 = this.m_9101();

                        for (int var10 = 0; var10 < var9.size(); var10++) {
                           this.m_9100((Class_2ZaVm8TGDJ68TnJB)var9.get(var10), var10, 1.0F, 1.0F, var3, var4);
                        }
                     }
                  } finally {
                     Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());
                     Class_oDLvT3Io61u7HRHc.m_7739();
                  }
               } finally {
                  Class_Ssh31B3ljfKeWsvS.m_4853().set(var5);
                  Class_Ssh31B3ljfKeWsvS.m_4864(var6);
               }
            }
         }
      } else {
         this.m_9093();
         this.f_32418.m_9281(0.0F);
      }
   }

   private float m_9084() {
      return this.f_32411 != null ? f_32486 : 0.0F;
   }

   public Class_u8iL1f1cFf6CucWB(String var1, CheckboxSetting var2, SliderSetting var3) {
      this(var1, var2, var3, null, null, null);
   }

   private void m_9085() {
      Class_8UIDpbIRPAjhei7m.m_1792(f_32565, f_32566, Class_BftdentXEtGbugJw.m_2310(255, 70, 70));
      if (f_11537.player != null) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_32567);
      }
   }

   private void m_9087(MultiChoiceSetting var1, Class_2ZaVm8TGDJ68TnJB var2, float var3, float var4, float var5, float var6, float var7) {
      this.m_9090(var2, var1.m_7564() == var2, var3, var4, var5, var6, var7);
   }

   private void m_9088() {
      this.f_32433 = this.f_32432;
      this.f_32434 = this.m_9092();
      this.f_32435 = f_32587 + f_32588 * Math.clamp(this.f_32418.m_9288(), 0.0F, 1.0F);
   }

   private void m_9089(float var1, float var2) {
      this.f_32423.m_9283(this.m_9063());
      float var3 = Math.clamp(this.f_32423.m_9288(), 0.0F, 1.0F);
      float var4 = this.f_32431 + f_32655;
      float var5 = f_32656;
      float var6 = f_32657;
      Class_U4Qsm43RVlUI3Pre.m_5199(var4, var1, var5, var6, 2.0F, m_9103(Class_y3cvEHXTSEF5dp8q.WINDOW_BACKGROUND_TWO, var2));
      Class_U4Qsm43RVlUI3Pre.m_5199(var4, var1, Math.max(var6, var5 * var3), var6, 2.0F, m_9103(Class_y3cvEHXTSEF5dp8q.MAIN, var2));
      float var7 = f_32658;
      float var8 = var4 + var5 * var3 - var7 / 2.0F;
      float var9 = var1 + var6 / 2.0F - var7 / 2.0F;
      Class_U4Qsm43RVlUI3Pre.m_5199(var8 - 1.0F, var9 - 1.0F, var7 + 2.0F, var7 + 2.0F, f_32659, m_9103(Class_y3cvEHXTSEF5dp8q.MAIN, f_32660 * var2));
      Class_U4Qsm43RVlUI3Pre.m_5199(var8, var9, var7, var7, f_32661, m_9103(Class_y3cvEHXTSEF5dp8q.CIRCLE, var2));
   }

   private void m_9090(Class_2ZaVm8TGDJ68TnJB var1, boolean var2, float var3, float var4, float var5, float var6, float var7) {
      Class_w8fCJQ5ZtH5lQbWc var8 = this.f_32425.computeIfAbsent(var1, var0 -> new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32694, Class_eXr9Fra2ad3yFXY8.f_19101));
      Class_w8fCJQ5ZtH5lQbWc var9 = this.f_32426.computeIfAbsent(var1, var0 -> new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32693, Class_eXr9Fra2ad3yFXY8.f_19100));
      var8.m_9283(var2 ? 1.0F : 0.0F);
      boolean var10 = this.f_32428 && Class_FvJXUGWpZo3zYBW4.m_2697(var6, var7, this.f_32431 + f_32673, var3 - 2.0F, f_32674, f_32675);
      var9.m_9283(var10 ? 1.0F : 0.0F);
      float var11 = var8.m_9288();
      float var12 = var9.m_9288();
      float var13 = var4 * var5;
      float var14 = f_32676 * (1.0F - var5);
      int var15 = Class_BftdentXEtGbugJw.m_2302(
         m_9103(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT, var13), m_9103(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT, var13), Math.max(var11, var12 * f_32677)
      );
      Class_U4Qsm43RVlUI3Pre.m_5186(
         Class_y1y6QpONhWEUIdEB.m_9591(),
         f_32678,
         this.f_32431 + f_32679 + f_32680 * (1.0F - var11) + var14,
         var3 + f_32681,
         11,
         m_9103(Class_y3cvEHXTSEF5dp8q.MAIN, var11 * var13)
      );
      Class_U4Qsm43RVlUI3Pre.m_5186(
         Class_y1y6QpONhWEUIdEB.m_9588(), var1.m_1181(), this.f_32431 + f_32682 + f_32683 * var11 + 2.0F * var12 + var14, var3 + f_32684, 11, var15
      );
   }

   public void m_9091(float var1, float var2, float var3) {
      if (this.f_32428) {
         this.m_9093();
      } else {
         float var4 = this.m_9092();
         float var5 = f_11537.getWindow().getScreenWidth();
         float var6 = f_11537.getWindow().getScreenHeight();
         float var7 = var5 - f_32498 - f_32499;
         float var8 = var6 - var4 - f_32500;
         float var9 = f_32501;
         float var10 = var1 + var3 + var9;
         float var11 = var1 - f_32502 - var9;
         if (var10 <= var7) {
            this.f_32431 = Math.max(f_32503, var10);
         } else if (var11 >= f_32504) {
            this.f_32431 = Math.min(var11, var7);
         } else {
            this.f_32431 = Math.clamp(var10, f_32505, var7);
         }

         this.f_32432 = Math.clamp(var2, f_32506, Math.max(f_32507, var8));
         this.f_32428 = true;
         this.m_9088();
      }
   }

   private float m_9092() {
      if (this.m_9075()) {
         float var1 = f_32685 + this.m_9104();
         if (this.f_32407 != null) {
            var1 += this.f_32407.m_8768().size() * f_32686 + f_32687;
         }

         return var1;
      } else if (this.m_9105()) {
         return f_32688;
      } else {
         return this.m_9097() ? f_32689 : f_32690 + this.m_9101().size() * f_32691 + f_32692;
      }
   }

   public void m_9093() {
      this.f_32428 = false;
      this.f_32429 = false;
      this.f_32430 = false;
   }

   private float m_9094() {
      return f_32485 + this.m_9104();
   }

   private float m_9095() {
      return this.f_32406 == null ? 0.0F : (this.f_32406.m_8768().size() + 1) * f_32484;
   }

   private float m_9096(float var1) {
      return var1 + f_32482 + this.m_9084() + (this.f_32409 != null ? f_32483 : 0.0F);
   }

   private boolean m_9097() {
      return this.f_32408 == null && this.f_32413 != null;
   }

   public Class_u8iL1f1cFf6CucWB(String var1, String var2, Supplier<MultiChoiceSetting> var3) {
      this.f_32417 = f_32444;
      this.f_32418 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32445, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_32419 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32446, Class_eXr9Fra2ad3yFXY8.f_19101);
      this.f_32420 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32447, Class_eXr9Fra2ad3yFXY8.f_19101);
      this.f_32421 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32448, Class_eXr9Fra2ad3yFXY8.f_19101);
      this.f_32422 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32449, Class_eXr9Fra2ad3yFXY8.f_19101);
      this.f_32423 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32450, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_32424 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32451, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_32425 = new IdentityHashMap<>();
      this.f_32426 = new IdentityHashMap<>();
      this.f_32427 = new Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo>() {
         public void m_1781(Class_bhRaN0YSSLQRYjPo var1) {
            Class_u8iL1f1cFf6CucWB.this.m_9083(var1);
         }

         @Override
         public int m_1780() {
            return -100;
         }
      };
      this.f_32435 = 1.0F;
      this.f_32402 = var1;
      this.f_32403 = var2;
      this.f_32404 = null;
      this.f_32405 = var3;
      this.f_32406 = null;
      this.f_32407 = null;
      this.f_32408 = null;
      this.f_32409 = null;
      this.f_32410 = null;
      this.f_32411 = null;
      this.f_32412 = null;
      this.f_32413 = null;
      this.f_32414 = null;
   }

   public Class_u8iL1f1cFf6CucWB(
      String var1, CheckboxSetting var2, SliderSetting var3, MultiChoiceSetting var4, CheckboxSetting var5, String var6, MultiChoiceSetting var7
   ) {
      this(var1, var2, var3, var4, var5, var6, var7, null, null);
   }

   private boolean m_9098() {
      return this.f_32408.m_8768() || this.f_32411 != null && this.f_32411.m_8768();
   }

   public Class_u8iL1f1cFf6CucWB(String var1, String var2, SliderSetting var3, Function<Float, String> var4) {
      this.f_32417 = f_32461;
      this.f_32418 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32462, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_32419 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32463, Class_eXr9Fra2ad3yFXY8.f_19101);
      this.f_32420 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32464, Class_eXr9Fra2ad3yFXY8.f_19101);
      this.f_32421 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32465, Class_eXr9Fra2ad3yFXY8.f_19101);
      this.f_32422 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32466, Class_eXr9Fra2ad3yFXY8.f_19101);
      this.f_32423 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32467, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_32424 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32468, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_32425 = new IdentityHashMap<>();
      this.f_32426 = new IdentityHashMap<>();
      this.f_32427 = new Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo>() {
         public void m_1781(Class_bhRaN0YSSLQRYjPo var1) {
            Class_u8iL1f1cFf6CucWB.this.m_9083(var1);
         }

         @Override
         public int m_1780() {
            return -100;
         }
      };
      this.f_32435 = 1.0F;
      this.f_32402 = var1;
      this.f_32403 = var2;
      this.f_32404 = null;
      this.f_32405 = null;
      this.f_32406 = null;
      this.f_32407 = null;
      this.f_32408 = null;
      this.f_32409 = null;
      this.f_32410 = null;
      this.f_32411 = null;
      this.f_32412 = null;
      this.f_32413 = var3;
      this.f_32414 = var4;
   }

   private boolean m_9099() {
      return this.f_32415 != null && this.f_32415.m_8768() && this.f_32416 != null;
   }

   private void m_9100(Class_2ZaVm8TGDJ68TnJB var1, int var2, float var3, float var4, float var5, float var6) {
      this.m_9067(var1, this.f_32433 + f_32671 + var2 * f_32672, var3, var4, var5, var6);
   }

   private List<Class_2ZaVm8TGDJ68TnJB> m_9101() {
      if (this.f_32407 != null) {
         return this.f_32407.m_8768();
      } else {
         return this.f_32404 != null ? this.f_32404.m_8768() : this.f_32405.get().m_8768();
      }
   }

   private void m_9102(String var1, String var2, float var3, int var4, int var5) {
      float var6 = this.f_32431 + f_32592;
      float var7 = this.f_32431 + f_32593 - f_32594;
      float var8 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var1, 11);
      float var9 = Math.max(0.0F, var7 - var6 - var8 - f_32595);
      String var10 = Class_xQDipU5xyFVqunmD.m_9499(Class_y1y6QpONhWEUIdEB.m_9588(), var2, var9, 11);
      Class_U4Qsm43RVlUI3Pre.m_5186(Class_y1y6QpONhWEUIdEB.m_9588(), var1, var6, var3, 11, var4);
      Class_U4Qsm43RVlUI3Pre.m_5186(
         Class_y1y6QpONhWEUIdEB.m_9588(), var10, var7 - Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var10, 11), var3, 11, var5
      );
   }

   public Class_u8iL1f1cFf6CucWB(
      String var1,
      CheckboxSetting var2,
      SliderSetting var3,
      MultiChoiceSetting var4,
      CheckboxSetting var5,
      String var6,
      MultiChoiceSetting var7,
      CheckboxSetting var8,
      String var9
   ) {
      this.f_32417 = f_32452;
      this.f_32418 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32453, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_32419 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32454, Class_eXr9Fra2ad3yFXY8.f_19101);
      this.f_32420 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32455, Class_eXr9Fra2ad3yFXY8.f_19101);
      this.f_32421 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32456, Class_eXr9Fra2ad3yFXY8.f_19101);
      this.f_32422 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32457, Class_eXr9Fra2ad3yFXY8.f_19101);
      this.f_32423 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32458, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_32424 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_32459, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_32425 = new IdentityHashMap<>();
      this.f_32426 = new IdentityHashMap<>();
      this.f_32427 = new Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo>() {
         public void m_1781(Class_bhRaN0YSSLQRYjPo var1) {
            Class_u8iL1f1cFf6CucWB.this.m_9083(var1);
         }

         @Override
         public int m_1780() {
            return -100;
         }
      };
      this.f_32435 = 1.0F;
      this.f_32402 = var1;
      this.f_32403 = f_32460;
      this.f_32404 = null;
      this.f_32405 = null;
      this.f_32406 = var7;
      this.f_32407 = var4;
      this.f_32408 = var2;
      this.f_32409 = var5;
      this.f_32410 = var6;
      this.f_32411 = var8;
      this.f_32412 = var9;
      this.f_32413 = var3;
      this.f_32414 = var0 -> Math.round(var0) + "";
   }

   private static int m_9103(Class_y3cvEHXTSEF5dp8q var0, float var1) {
      int var2 = Class_LsNSRvPKh5AwfAUe.m_3820(var0);
      return Class_BftdentXEtGbugJw.m_2306(var2, Class_BftdentXEtGbugJw.m_2297(var2) / f_32591 * Math.clamp(var1, 0.0F, 1.0F));
   }

   public Class_u8iL1f1cFf6CucWB(String var1, CheckboxSetting var2, SliderSetting var3, MultiChoiceSetting var4, CheckboxSetting var5, String var6) {
      this(var1, var2, var3, var4, var5, var6, null);
   }

   private float m_9104() {
      float var1 = this.f_32409 != null ? f_32477 : 0.0F;
      if (this.f_32411 != null) {
         var1 += f_32478;
      }

      if (this.f_32406 != null) {
         var1 += (this.f_32406.m_8768().size() + 1) * f_32479;
      }

      if (this.f_32415 != null) {
         var1 += f_32480;
         if (this.f_32415.m_8768() && this.f_32416 != null) {
            var1 += f_32481;
         }
      }

      return var1;
   }

   private boolean m_9105() {
      return this.f_32408 != null && this.f_32413 == null;
   }
}
