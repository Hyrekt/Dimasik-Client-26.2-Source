package dev.dimasik.client.system;

import com.mojang.blaze3d.textures.GpuTextureView;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;
import lombok.Generated;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot.Type;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.joml.Vector4i;

public class Class_cdSwzxNCqQjsbpyo extends Class_NO6SuGqq3FB7jQDZ implements Class_OJntZb8PWlU5XrDj {
   private static final float f_18361 = 200.0F;
   private static final float f_18362 = 76.0F;
   private static final float f_18363 = 220.0F;
   private static final float f_18364 = 63.0F;
   private static final float f_18365 = 173.0F;
   private static final float f_18366 = 13.0F;
   private static final float f_18367 = 38.0F;
   private static final float f_18368 = 2.8F;
   private static final float f_18369 = 74.0F;
   private static final float f_18370 = 10.0F;
   private static final int f_18371 = 16;
   private static final int f_18372 = Class_BftdentXEtGbugJw.m_2310(255, 243, 0);
   private static final Identifier f_18373 = Class_wHRRCm2tlLY7DN4I.m_9311(Class_cdSwzxNCqQjsbpyo.f_18705);
   private static final Identifier f_18374 = Class_wHRRCm2tlLY7DN4I.m_9311(Class_cdSwzxNCqQjsbpyo.f_18706);
   private final Class_w8fCJQ5ZtH5lQbWc f_18375;
   private final Class_w8fCJQ5ZtH5lQbWc f_18376;
   private final Class_w8fCJQ5ZtH5lQbWc f_18377;
   private boolean f_18378;
   private final MultiChoiceSetting f_18379;
   private final CheckboxSetting f_18380;
   private final CheckboxSetting f_18381;
   private final SliderSetting f_18382;
   private final MultiChoiceSetting f_18383;
   private final CheckboxSetting f_18384;
   private final Class_u8iL1f1cFf6CucWB f_18385;
   private final Class_w8fCJQ5ZtH5lQbWc f_18386;
   private final Class_w8fCJQ5ZtH5lQbWc f_18387;
   private final Class_w8fCJQ5ZtH5lQbWc f_18388;
   private final Class_w8fCJQ5ZtH5lQbWc f_18389;
   private final Class_RVyRgqHvriBnyLPh f_18390;
   private final Class_w8fCJQ5ZtH5lQbWc f_18391;
   private final Class_w8fCJQ5ZtH5lQbWc f_18392;
   private final DecimalFormat f_18393;
   private final CopyOnWriteArrayList<Class_cdSwzxNCqQjsbpyo.OEfroLbLOcB56zRr> f_18394;
   private Entity f_18395;
   private final Class_Trm8dR6i9vMfnZEG.Class_6SoEwLZCu5bs5f6U[] f_18396;
   private ItemStack f_18397;
   private float f_18398;
   private float f_18399;
   private float f_18400;
   private float f_18401;
   private float f_18402;
   private float f_18403;
   private float f_18404;
   private float f_18405;
   private float f_18406;
   private float f_18407;
   private long f_18408;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_18409;
   private static final String f_18410 = "TargetHud";
   private static final float f_18411 = 10.0F;
   private static final float f_18412 = 10.0F;
   private static final float f_18413 = 100.0F;
   private static final float f_18414 = 100.0F;
   private static final float f_18415 = 10.0F;
   private static final float f_18416 = 5.5F;
   private static final float f_18417 = 5.0F;
   private static final float f_18418 = 3.0F;
   private static final float f_18419 = 6.0F;
   private static final float f_18420 = 2.6F;
   private static final float f_18421 = 4.5F;
   private static final float f_18422 = 8.0F;
   private static final float f_18423 = 3.0F;
   private static final String f_18424 = "0.0";
   private static final float f_18425 = -1.0F;
   private static final float f_18426 = -1.0F;
   private static final float f_18427 = -1.0F;
   private static final float f_18428 = -1.0F;
   private static final float f_18429 = -1.0F;
   private static final float f_18430 = -1.0F;
   private static final float f_18431 = -1.0F;
   private static final String f_18432 = "TargetHud";
   private static final String f_18433 = "Заменить Скин";
   private static final String f_18434 = "От полоски";
   private static final String f_18435 = "Информация о цели";
   private static final float f_18436 = 0.05F;
   private static final float f_18437 = 1.0E9F;
   private static final float f_18438 = -1.0F;
   private static final float f_18439 = -1.0F;
   private static final float f_18440 = -1.0F;
   private static final float f_18441 = -1.0F;
   private static final float f_18442 = -1.0F;
   private static final float f_18443 = -1.0F;
   private static final String f_18444 = "2";
   private static final float f_18445 = 0.001F;
   private static final float f_18446 = 0.01F;
   private static final String f_18447 = "2";
   private static final float f_18448 = 220.0F;
   private static final float f_18449 = 200.0F;
   private static final float f_18450 = 16.0F;
   private static final float f_18451 = 200.0F;
   private static final float f_18452 = 74.0F;
   private static final float f_18453 = 10.0F;
   private static final String f_18454 = "2";
   private static final float f_18455 = 16.0F;
   private static final float f_18456 = 74.0F;
   private static final float f_18457 = 10.0F;
   private static final float f_18458 = 255.0F;
   private static final float f_18459 = 76.0F;
   private static final float f_18460 = 76.0F;
   private static final float f_18461 = 10.0F;
   private static final float f_18462 = 255.0F;
   private static final float f_18463 = 0.3F;
   private static final float f_18464 = 74.0F;
   private static final float f_18465 = 54.0F;
   private static final float f_18466 = 8.0F;
   private static final float f_18467 = 3.0F;
   private static final float f_18468 = 74.0F;
   private static final float f_18469 = 54.0F;
   private static final float f_18470 = 8.0F;
   private static final float f_18471 = 3.0F;
   private static final float f_18472 = 74.0F;
   private static final float f_18473 = 54.0F;
   private static final float f_18474 = 8.0F;
   private static final float f_18475 = 3.0F;
   private static final float f_18476 = 76.0F;
   private static final String f_18477 = "2";
   private static final float f_18478 = 63.0F;
   private static final float f_18479 = 76.0F;
   private static final float f_18480 = 0.96F;
   private static final float f_18481 = 0.04F;
   private static final float f_18482 = 192.0F;
   private static final float f_18483 = 32.0F;
   private static final float f_18484 = 17.25F;
   private static final float f_18485 = 220.0F;
   private static final float f_18486 = 63.0F;
   private static final float f_18487 = 31.5F;
   private static final float f_18488 = 31.5F;
   private static final float f_18489 = 255.0F;
   private static final float f_18490 = 220.0F;
   private static final float f_18491 = 63.0F;
   private static final float f_18492 = 220.0F;
   private static final float f_18493 = 63.0F;
   private static final float f_18494 = 14.0F;
   private static final float f_18495 = 60.0F;
   private static final float f_18496 = 14.0F;
   private static final float f_18497 = 105.0F;
   private static final float f_18498 = 14.0F;
   private static final float f_18499 = 33.0F;
   private static final float f_18500 = 18.0F;
   private static final float f_18501 = 18.0F;
   private static final float f_18502 = 255.0F;
   private static final float f_18503 = 0.25F;
   private static final float f_18504 = 2.8F;
   private static final float f_18505 = 0.55F;
   private static final float f_18506 = 173.0F;
   private static final float f_18507 = 13.0F;
   private static final float f_18508 = 38.0F;
   private static final float f_18509 = 2.8F;
   private static final float f_18510 = 0.001F;
   private static final float f_18511 = 173.0F;
   private static final float f_18512 = 13.0F;
   private static final float f_18513 = 38.0F;
   private static final float f_18514 = 2.8F;
   private static final float f_18515 = 0.38F;
   private static final float f_18516 = 0.001F;
   private static final float f_18517 = 0.01F;
   private static final float f_18518 = 171.5F;
   private static final float f_18519 = 11.5F;
   private static final float f_18520 = 41.0F;
   private static final float f_18521 = 1.8F;
   private static final float f_18522 = 0.22F;
   private static final float f_18523 = 173.0F;
   private static final float f_18524 = 13.0F;
   private static final float f_18525 = 38.0F;
   private static final float f_18526 = 0.001F;
   private static final float f_18527 = 173.0F;
   private static final float f_18528 = 13.0F;
   private static final float f_18529 = 38.0F;
   private static final float f_18530 = 0.32F;
   private static final float f_18531 = 191.5F;
   private static final float f_18532 = 24.5F;
   private static final float f_18533 = 220.0F;
   private static final float f_18534 = 63.0F;
   private static final float f_18535 = 13.0F;
   private static final float f_18536 = 13.0F;
   private static final float f_18537 = 4.0F;
   private static final float f_18538 = 15.0F;
   private static final float f_18539 = 10.0F;
   private static final float f_18540 = 10.0F;
   private static final float f_18541 = 43.0F;
   private static final float f_18542 = 43.0F;
   private static final float f_18543 = 11.0F;
   private static final float f_18544 = 10.0F;
   private static final float f_18545 = 10.0F;
   private static final float f_18546 = 43.0F;
   private static final float f_18547 = 43.0F;
   private static final float f_18548 = 11.0F;
   private static final float f_18549 = 0.125F;
   private static final float f_18550 = 0.01F;
   private static final float f_18551 = 5.5F;
   private static final float f_18552 = 10.0F;
   private static final float f_18553 = 0.14F;
   private static final float f_18554 = 0.12F;
   private static final float f_18555 = 0.88F;
   private static final float f_18556 = 8.0F;
   private static final float f_18557 = 8.0F;
   private static final float f_18558 = 60.0F;
   private static final float f_18559 = 60.0F;
   private static final float f_18560 = 8.0F;
   private static final float f_18561 = 8.0F;
   private static final float f_18562 = 8.0F;
   private static final float f_18563 = 8.0F;
   private static final float f_18564 = 8.0F;
   private static final float f_18565 = 8.0F;
   private static final float f_18566 = 60.0F;
   private static final float f_18567 = 60.0F;
   private static final float f_18568 = 8.0F;
   private static final float f_18569 = 0.125F;
   private static final String f_18570 = "N";
   private static final float f_18571 = 14.0F;
   private static final float f_18572 = 20.0F;
   private static final float f_18573 = 8.0F;
   private static final float f_18574 = 8.0F;
   private static final float f_18575 = 60.0F;
   private static final float f_18576 = 0.01F;
   private static final float f_18577 = 22.0F;
   private static final float f_18578 = 8.0F;
   private static final float f_18579 = 255.0F;
   private static final float f_18580 = 255.0F;
   private static final float f_18581 = 14.0F;
   private static final float f_18582 = 8.0F;
   private static final float f_18583 = 1.9F;
   private static final float f_18584 = 255.0F;
   private static final float f_18585 = 12.0F;
   private static final float f_18586 = 43.0F;
   private static final float f_18587 = 20.0F;
   private static final String f_18588 = "Классика";
   private static final float f_18589 = 76.0F;
   private static final float f_18590 = 38.0F;
   private static final float f_18591 = 38.0F;
   private static final float f_18592 = 0.5F;
   private static final float f_18593 = 10.0F;
   private static final float f_18594 = 17.0F;
   private static final double f_18595 = Math.PI * 2;
   private static final double f_18596 = -0.3;
   private static final double f_18597 = 0.3;
   private static final double f_18598 = 4.0;
   private static final double f_18599 = 20.0;
   private static final double f_18600 = 16.0;
   private static final double f_18601 = 34.0;
   private static final double f_18602 = 6.0;
   private static final double f_18603 = Math.PI * 2;
   private static final double f_18604 = 8.0;
   private static final double f_18605 = 22.0;
   private static final double f_18606 = -6.0;
   private static final float f_18607 = 6.0F;
   private static final double f_18608 = -6.0;
   private static final float f_18609 = 6.0F;
   private static final double f_18610 = 5.0;
   private static final float f_18611 = 2.5F;
   private static final double f_18612 = Math.PI * 2;
   private static final double f_18613 = 6.0;
   private static final double f_18614 = 16.0;
   private static final double f_18615 = -6.0;
   private static final float f_18616 = 6.0F;
   private static final double f_18617 = -6.0;
   private static final float f_18618 = 6.0F;
   private static final double f_18619 = 4.0;
   private static final float f_18620 = 0.05F;
   private static final float f_18621 = 0.35F;
   private static final float f_18622 = 1.5F;
   private static final float f_18623 = 58.0F;
   private static final float f_18624 = 0.06F;
   private static final float f_18625 = 74.0F;
   private static final double f_18626 = -3.5;
   private static final double f_18627 = 3.5;
   private static final double f_18628 = -Math.PI * 9.0 / 10.0;
   private static final double f_18629 = Math.PI * 9.0 / 10.0;
   private static final double f_18630 = 20.0;
   private static final double f_18631 = 52.0;
   private static final double f_18632 = 6.0;
   private static final double f_18633 = 16.0;
   private static final float f_18634 = 0.05F;
   private static final float f_18635 = 0.002F;
   private static final float f_18636 = 0.02F;
   private static final float f_18637 = 0.18F;
   private static final double f_18638 = 1.0E-4;
   private static final double f_18639 = Math.PI;
   private static final double f_18640 = 2.0;
   private static final double f_18641 = 1.4;
   private static final double f_18642 = 1.05;
   private static final double f_18643 = 2.4;
   private static final double f_18644 = Math.PI;
   private static final double f_18645 = 2.0;
   private static final double f_18646 = -0.55;
   private static final double f_18647 = 0.55;
   private static final double f_18648 = 0.35;
   private static final double f_18649 = 1.05;
   private static final double f_18650 = -0.2;
   private static final double f_18651 = 0.35;
   private static final double f_18652 = -3.5;
   private static final double f_18653 = 3.5;
   private static final float f_18654 = 255.0F;
   private static final float f_18655 = 10.0F;
   private static final float f_18656 = 0.75F;
   private static final float f_18657 = 6.0F;
   private static final float f_18658 = 6.0F;
   private static final float f_18659 = 8.0F;
   private static final float f_18660 = 8.0F;
   private static final float f_18661 = 3.0F;
   private static final float f_18662 = 6.0F;
   private static final float f_18663 = 6.0F;
   private static final float f_18664 = 8.0F;
   private static final float f_18665 = 8.0F;
   private static final float f_18666 = 3.0F;
   private static final float f_18667 = 0.15F;
   private static final float f_18668 = 0.6F;
   private static final float f_18669 = 0.4F;
   private static final float f_18670 = 3.0F;
   private static final float f_18671 = 0.8F;
   private static final float f_18672 = 0.2F;
   private static final float f_18673 = 0.01F;
   private static final float f_18674 = 0.75F;
   private static final float f_18675 = 0.25F;
   private static final double f_18676 = 255.0;
   private static final float f_18677 = 0.5F;
   private static final float f_18678 = 2.2F;
   private static final float f_18679 = 0.11F;
   private static final float f_18680 = 0.004F;
   private static final float f_18681 = 0.7F;
   private static final float f_18682 = -22.0F;
   private static final float f_18683 = 20.0F;
   private static final float f_18684 = 20.0F;
   private static final float f_18685 = 20.0F;
   private static final float f_18686 = 20.0F;
   private static final float f_18687 = 20.0F;
   private static final float f_18688 = 20.0F;
   private static final float f_18689 = 20.0F;
   private static final float f_18690 = 20.0F;
   private static final float f_18691 = 74.0F;
   private static final float f_18692 = 12.0F;
   private static final String f_18693 = "h";
   private static final float f_18694 = 74.0F;
   private static final float f_18695 = 74.0F;
   private static final String f_18696 = "h";
   private static final float f_18697 = 15.0F;
   private static final float f_18698 = 4.0F;
   private static final float f_18699 = 36.0F;
   private static final float f_18700 = 78.0F;
   private static final float f_18701 = 74.0F;
   private static final float f_18702 = 13.0F;
   private static final float f_18703 = 4.0F;
   private static final float f_18704 = 29.0F;
   private static final String f_18705 = "hud/target_skin";
   private static final String f_18706 = "hud/target_skin_hit";

   private void m_6218(float var1, float var2, boolean var3, float var4, float var5, float var6) {
      if (!this.f_18381.m_8768()) {
         this.m_6219(var1, var2, var3);
      } else {
         float var7 = var3 ? this.f_18403 : this.f_18402;
         float var8 = var3 ? this.f_18401 : this.f_18399;
         boolean var9 = var8 >= 0.0F && var2 < var8 - f_18634;
         boolean var10 = var7 >= 0.0F && var1 < var7 - f_18635;
         if (var9 || var10) {
            float var11 = var7 < 0.0F ? var1 : var7;
            float var12 = Math.min(var1, var11);
            float var13 = Math.max(var1, var11);
            float var14 = Math.max(f_18636, var13 - var12);
            int var15 = var9 ? Math.round(this.f_18382.m_8768()) : Math.max(2, Math.round(this.f_18382.m_8768() * f_18637));
            ThreadLocalRandom var16 = ThreadLocalRandom.current();
            boolean var17 = this.m_6229();
            int var18 = var3 ? f_18372 : 0;
            double var19 = this.f_18407 > f_18638 ? var14 / this.f_18407 * f_18639 * f_18640 : f_18641;

            for (int var21 = 0; var21 < var15; var21++) {
               double var22 = var12 + var14 * Math.pow(var16.nextDouble(), var9 ? f_18642 : f_18643);
               double var24 = var22 * f_18644 * f_18645;
               double var26 = var6 + var16.nextDouble(f_18646, f_18647);
               double var28 = -var19 * var16.nextDouble(f_18648, f_18649) + var16.nextDouble(f_18650, f_18651);
               double var30 = var16.nextDouble(f_18652, f_18653);
               this.f_18394.add(new Class_cdSwzxNCqQjsbpyo.OEfroLbLOcB56zRr(var4, var5, var26, var24, var28, var30, var18, var17));
            }
         }

         this.m_6219(var1, var2, var3);
      }
   }

   public Class_cdSwzxNCqQjsbpyo(
      MultiChoiceSetting var1, CheckboxSetting var2, CheckboxSetting var3, SliderSetting var4, MultiChoiceSetting var5, CheckboxSetting var6
   ) {
      super(f_18410, f_18411, f_18412, f_18413, f_18414);
      this.f_18375 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_18415, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_18376 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_18416, Class_eXr9Fra2ad3yFXY8.f_19121);
      this.f_18377 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_18417, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_18386 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_18418, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_18387 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_18419, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_18388 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_18420, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_18389 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_18421, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_18390 = new Class_RVyRgqHvriBnyLPh();
      this.f_18391 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_18422, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_18392 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_18423, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_18393 = new DecimalFormat(f_18424, new DecimalFormatSymbols(Locale.US));
      this.f_18394 = new CopyOnWriteArrayList<>();
      this.f_18395 = null;
      this.f_18396 = new Class_Trm8dR6i9vMfnZEG.Class_6SoEwLZCu5bs5f6U[6];
      this.f_18397 = ItemStack.EMPTY;
      this.f_18398 = f_18425;
      this.f_18399 = f_18426;
      this.f_18400 = f_18427;
      this.f_18401 = f_18428;
      this.f_18402 = f_18429;
      this.f_18403 = f_18430;
      this.f_18404 = f_18431;
      this.f_18405 = 0.0F;
      this.f_18409 = this::m_6235;

      for (int var7 = 0; var7 < this.f_18396.length; var7++) {
         this.f_18396[var7] = new Class_Trm8dR6i9vMfnZEG.Class_6SoEwLZCu5bs5f6U(true);
      }

      this.f_18379 = var1;
      this.f_18380 = var2;
      this.f_18381 = var3;
      this.f_18382 = var4;
      this.f_18383 = var5;
      this.f_18384 = var6;
      this.f_18385 = new Class_u8iL1f1cFf6CucWB(f_18432, var2, var4, var5, var6, f_18433, var1, var3, f_18434);
   }

   private void m_6219(float var1, float var2, boolean var3) {
      if (var3) {
         this.f_18403 = var1;
         this.f_18401 = var2;
      } else {
         this.f_18402 = var1;
         this.f_18399 = var2;
      }
   }

   private void m_6220(float var1, float var2, boolean var3) {
      if (var3) {
         this.f_18400 = var1;
         this.f_18401 = var2;
      } else {
         this.f_18398 = var1;
         this.f_18399 = var2;
      }
   }

   private float m_6221() {
      return this.f_18379.m_7568(f_18477) ? f_18478 : f_18479;
   }

   private void m_6222(LivingEntity var1, float var2) {
      this.m_6240(var1, var2, f_18589, f_18590, f_18591);
   }

   private float m_6223(Entity var1) {
      if (this.f_18379.m_7568(f_18447)) {
         return f_18448;
      }

      if (var1 == null) {
         return f_18449;
      }

      float var2 = Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(this.m_6243(var1), f_18450, 0.0F);
      return Math.max(f_18451, f_18452 + var2 + f_18453);
   }

   private float m_6224() {
      return 1.0F - f_18553 * (1.0F - this.f_18376.m_9288());
   }

   private void m_6225(LivingEntity var1, float var2, float var3, GuiGraphicsExtractor var4, float var5) {
      ArrayList var6 = new ArrayList();

      for (EquipmentSlot var8 : EquipmentSlotGroup.ARMOR) {
         if (var8.getType() == Type.HUMANOID_ARMOR) {
            ItemStack var9 = var1.getItemBySlot(var8);
            if (!var9.isEmpty()) {
               var6.add(var9);
            }
         }
      }

      int var16 = var6.size();
      ItemStack var17 = var1.getOffhandItem();
      ItemStack var18 = var1.getMainHandItem();
      int var10 = var16 + (var17.isEmpty() ? 0 : 1) + (var18.isEmpty() ? 0 : 1);
      if (var10 > 0) {
         int var11 = 0;
         float var12 = 0.0F;
         float var13 = this.m_6245(var3, f_18682);
         if (!var17.isEmpty()) {
            Class_U4Qsm43RVlUI3Pre.m_5206(this.m_6245(var2, var12), var13, f_18683, f_18684, var17, true, this.f_18396[var11++]);
            var12 += f_18685;
         }

         if (!var18.isEmpty()) {
            Class_U4Qsm43RVlUI3Pre.m_5206(this.m_6245(var2, var12), var13, f_18686, f_18687, var18, true, this.f_18396[var11++]);
            var12 += f_18688;
         }

         for (int var14 = 0; var14 < var16; var14++) {
            float var15 = this.m_6245(var2, var12 + var14 * 20);
            Class_U4Qsm43RVlUI3Pre.m_5206(var15, var13, f_18689, f_18690, (ItemStack)var6.get(var14), true, this.f_18396[var11++]);
         }
      }
   }

   private void m_6226(Entity var1, float var2, float var3, float var4, Class_bhRaN0YSSLQRYjPo var5) {
      if (var1 instanceof LivingEntity var6) {
         if (this.f_18379.m_7568(f_18454)) {
            this.m_6233(var1, var6, var2, var3);
         } else {
            var3 += f_18455 * (1.0F - this.f_18376.m_9288());
            float var7 = this.f_18375.m_9288();
            float var8 = var4 - f_18456 - f_18457;
            float var9 = this.m_6246(var6);
            float var10 = var6.getAbsorptionAmount();
            float var11 = var6.getMaxHealth();
            ItemStack var12 = this.m_6248(var6);
            if (!var12.isEmpty()) {
               this.f_18397 = var12.copy();
            }

            this.f_18391.m_9283(var12.isEmpty() ? 0.0F : 1.0F);
            float var13 = Math.min(this.f_18386.m_9288() / var11, 1.0F);
            float var14 = var8 * var13;
            float var15 = Math.min(this.f_18392.m_9288() / var11, 1.0F);
            float var16 = var8 * var15;
            this.m_6222(var6, var4);
            this.m_6231(var14, var9);
            this.m_6244(var16, var10, true);
            float var17 = this.m_6224();
            float var18 = this.m_6237();
            Class_Ssh31B3ljfKeWsvS.m_4864(f_18458 * this.f_18375.m_9288());
            Class_FvJXUGWpZo3zYBW4.m_2692(var2, var3, var4, f_18459, var17);
            Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());
            Class_U4Qsm43RVlUI3Pre.m_5188(var2, var3, var4, f_18460, f_18461);
            this.m_6239(var1, var2, var3, -1, var7);
            this.m_6234(var6, var12, var2, var3, var5.m_6083(), var7);
            int var19 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
            int var20 = Class_BftdentXEtGbugJw.m_2306(
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN), Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.MAIN) / f_18462 * f_18463
            );
            Class_U4Qsm43RVlUI3Pre.m_5199(var2 + f_18464, var3 + f_18465, var8, f_18466, f_18467, var20);
            Class_U4Qsm43RVlUI3Pre.m_5199(var2 + f_18468, var3 + f_18469, var14 * var18, f_18470, f_18471, var19);
            if (var16 > 0.0F) {
               Class_U4Qsm43RVlUI3Pre.m_5199(var2 + f_18472, var3 + f_18473, var16 * var18, f_18474, f_18475, f_18372);
            }

            this.m_6242(var1, var2, var3, var9, var14, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT), var10);
            Class_Ssh31B3ljfKeWsvS.m_4830();
            this.m_6225(var6, var2, var3, var5.m_6083(), var7);
            this.m_6230(var2, var3, var7);
            Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());
            Class_FvJXUGWpZo3zYBW4.m_2694(var2, var3, var4, f_18476, var17);
            Class_Ssh31B3ljfKeWsvS.m_4844();
         }
      }
   }

   private void m_6227(Entity var1, float var2, float var3) {
      if (!this.f_18384.m_8768()) {
         if (var1 instanceof LivingEntity var6) {
            GpuTextureView var7 = Class_7CxJH622IPbYv0YY.m_1608(var6);
            if (var7 != null) {
               Class_U4Qsm43RVlUI3Pre.m_5209(
                  var2 + f_18544, var3 + f_18545, f_18546, f_18547, new Vector4f(f_18548), new Vector4f(f_18549), new Vector4i(-1), var7
               );
            }
         }
      } else {
         Identifier var4 = var1 instanceof LivingEntity var5 && var5.hurtTime > 0 ? f_18374 : f_18373;
         Class_U4Qsm43RVlUI3Pre.m_5196(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());
         Class_U4Qsm43RVlUI3Pre.m_5184(
            var2 + f_18539, var3 + f_18540, f_18541, f_18542, new Vector4f(f_18543), new Vector4f(0.0F, 0.0F, 1.0F, 1.0F), new Vector4i(-1), var4
         );
      }
   }

   private void m_6228(float var1, float var2, int var3) {
      String var4 = this.f_18390.m_4506();
      float var5 = Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var4, f_18535, 0.0F);
      if (!this.f_18390.m_4500()) {
         Class_U4Qsm43RVlUI3Pre.m_5186(Class_y1y6QpONhWEUIdEB.m_9588(), var4, var1 - var5 / 2.0F, var2, 13, var3);
      } else {
         String var6 = this.f_18390.m_4502();
         float var7 = Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var6, f_18536, 0.0F);
         float var8 = this.f_18390.m_4503();
         float var9 = this.f_18390.m_4505() * 17;
         float var10 = Math.max(var5, var7) + f_18537;
         Class_U4Qsm43RVlUI3Pre.m_5196(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());
         Class_Ssh31B3ljfKeWsvS.m_4860(var1 - var10 / 2.0F, var2 - 1.0F, var10, f_18538);

         try {
            Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var6, var1 - var7 / 2.0F, var2 + var9 * var8, 13, var3);
            Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var4, var1 - var5 / 2.0F, var2 - var9 * (1.0F - var8), 13, var3);
         } finally {
            Class_Ssh31B3ljfKeWsvS.m_4828();
         }
      }
   }

   private boolean m_6229() {
      return this.f_18383.m_7568(f_18588);
   }

   private void m_6230(float var1, float var2, float var3) {
      if (this.f_18380.m_8768() || this.f_18381.m_8768() || !this.f_18394.isEmpty()) {
         long var4 = System.currentTimeMillis();
         this.f_18394.removeIf(var2x -> var4 - var2x.f_18306 > var2x.f_18307);
         int var6 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);

         for (Class_cdSwzxNCqQjsbpyo.OEfroLbLOcB56zRr var8 : this.f_18394) {
            int var9 = var8.f_18305 != 0 ? var8.f_18305 : var6;
            float var10 = var8.f_18305 != 0 ? 1.0F : Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.MAIN) / f_18654;
            if (var8.f_18303 && !var8.f_18304) {
               var8.f_18322 = Class_3VHxwfI2NZKoxzIi.m_1301(var8.f_18322, 1.0F, f_18655);
               var8.f_18320 = Class_3VHxwfI2NZKoxzIi.m_1305(var8.f_18320, var8.f_18321, f_18656);
               float var27 = 1.0F - (float)(var4 - var8.f_18306) / (float)var8.f_18307;
               float var29 = var1 + (float)var8.f_18320.x;
               float var31 = var2 + (float)var8.f_18320.y;
               Class_U4Qsm43RVlUI3Pre.m_5199(
                  var29 - f_18657, var31 - f_18658, f_18659, f_18660, f_18661, Class_BftdentXEtGbugJw.m_2306(var9, var10 * var8.f_18322 * var27 * var3)
               );
            } else {
               var8.m_6216(this.f_18407, var4);
               if (var8.f_18303) {
                  float var26 = 1.0F - (float)(var4 - var8.f_18306) / (float)var8.f_18307;
                  float var28 = var1 + (float)var8.f_18311;
                  float var30 = var2 + (float)var8.f_18312;
                  Class_U4Qsm43RVlUI3Pre.m_5199(
                     var28 - f_18662, var30 - f_18663, f_18664, f_18665, f_18666, Class_BftdentXEtGbugJw.m_2306(var9, var10 * var26 * var3)
                  );
               } else {
                  float var11 = (float)(var4 - var8.f_18306) / (float)var8.f_18307;
                  float var12 = Math.min(var11 / f_18667, 1.0F);
                  float var13 = 1.0F - Math.max(0.0F, (var11 - f_18668) / f_18669);
                  float var14 = var12 * var12 * (f_18670 - 2.0F * var12) * var13;
                  float var15 = f_18671 + f_18672 * (float)Math.sin((float)(var4 - var8.f_18306) * f_18673 + var8.f_18309);
                  float var16 = var8.f_18308 * (f_18674 + f_18675 * var13);
                  int var17 = Class_BftdentXEtGbugJw.m_2302(var9, Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_18676), var8.f_18310 * f_18677);
                  float var18 = var1 + (float)var8.f_18311;
                  float var19 = var2 + (float)var8.f_18312;
                  float var20 = var3 * var14 * var15;
                  float var21 = var16 * f_18678;

                  for (int var22 = (int)var21; var22 > 0; var22--) {
                     float var23 = 1.0F - var22 / var21;
                     float var24 = var20 * f_18679 * var23 * var23;
                     if (!(var24 <= f_18680)) {
                        float var25 = var16 + var22;
                        Class_U4Qsm43RVlUI3Pre.m_5199(
                           var18 - var25, var19 - var25, var25 * 2.0F, var25 * 2.0F, var25 - 1.0F, Class_BftdentXEtGbugJw.m_2306(var9, var24)
                        );
                     }
                  }

                  Class_U4Qsm43RVlUI3Pre.m_5199(
                     var18 - var16, var19 - var16, var16 * 2.0F, var16 * 2.0F, var16 - 1.0F, Class_BftdentXEtGbugJw.m_2306(var17, var20 * f_18681)
                  );
               }
            }
         }
      }
   }

   private void m_6231(float var1, float var2) {
      this.m_6244(var1, var2, false);
   }

   private Entity m_6232(LivingEntity var1) {
      return (Entity)(var1 == null && f_11537.gui.screen() instanceof ChatScreen ? f_11537.player : var1);
   }

   @Override
   public void m_3992() {
      this.f_18385.m_9082();
   }

   @Override
   public void m_1333() {
      this.f_18385.m_9093();
   }

   private void m_6233(Entity var1, LivingEntity var2, float var3, float var4) {
      float var5 = this.f_18375.m_9288();
      float var6 = f_18480 + f_18481 * var5;
      float var7 = this.f_18387.m_9288();
      float var8 = this.f_18388.m_9288();
      float var9 = this.f_18389.m_9288();
      float var10 = Math.max(1.0F, var2.getMaxHealth());
      float var11 = Math.clamp(var7 / var10, 0.0F, 1.0F);
      float var12 = Math.clamp(var8 / var10, 0.0F, 1.0F);
      float var13 = var2.getAbsorptionAmount();
      float var14 = Math.clamp(this.f_18392.m_9288() / var10, 0.0F, 1.0F);
      float var15 = f_18482;
      float var16 = f_18483;
      float var17 = f_18484;
      this.m_6240(var2, f_18485, f_18486, f_18487, f_18488);
      this.m_6218(var11, this.m_6246(var2), false, var15, var16, var17);
      this.m_6218(var14, var13, true, var15, var16, var17);
      Class_Ssh31B3ljfKeWsvS.m_4864(f_18489 * var5);
      Class_FvJXUGWpZo3zYBW4.m_2692(var3, var4, f_18490, f_18491, var6);
      Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());
      Class_U4Qsm43RVlUI3Pre.m_5188(var3, var4, f_18492, f_18493, f_18494);
      this.m_6227(var1, var3, var4);
      String var18 = this.m_6243(var1);
      Class_U4Qsm43RVlUI3Pre.m_5221(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         Component.literal(var18),
         var3 + f_18495,
         var4 + f_18496,
         14,
         Class_BftdentXEtGbugJw.m_2310(255, 255, 255),
         f_18497,
         f_18498
      );
      ItemStack[] var19 = new ItemStack[]{
         var2.getItemBySlot(EquipmentSlot.FEET),
         var2.getItemBySlot(EquipmentSlot.LEGS),
         var2.getItemBySlot(EquipmentSlot.CHEST),
         var2.getItemBySlot(EquipmentSlot.HEAD),
         var2.getMainHandItem(),
         var2.getOffhandItem()
      };
      ArrayList var20 = new ArrayList();

      for (ItemStack var24 : var19) {
         if (!var24.isEmpty()) {
            var20.add(var24);
         }
      }

      for (int var25 = 0; var25 < var20.size(); var25++) {
         float var27 = this.m_6245(var3, 60 + var25 * 18);
         float var29 = this.m_6245(var4, f_18499);
         Class_U4Qsm43RVlUI3Pre.m_5206(var27, var29, f_18500, f_18501, (ItemStack)var20.get(var25), false, this.f_18396[var25]);
      }

      int var26 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
      int var28 = Class_BftdentXEtGbugJw.m_2306(var26, Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.MAIN) / f_18502 * f_18503);
      float var30 = f_18504 + f_18505 * var9;
      Class_U4Qsm43RVlUI3Pre.m_5191(var3 + f_18506, var4 + f_18507, f_18508, f_18509, 1.0F, var28);
      if (var12 > var11 + f_18510) {
         Class_U4Qsm43RVlUI3Pre.m_5191(var3 + f_18511, var4 + f_18512, f_18513, f_18514, var12, Class_BftdentXEtGbugJw.m_2306(var26, f_18515));
      }

      if (var11 > f_18516) {
         if (var9 > f_18517) {
            Class_U4Qsm43RVlUI3Pre.m_5191(var3 + f_18518, var4 + f_18519, f_18520, f_18521, var11, Class_BftdentXEtGbugJw.m_2306(var26, f_18522 * var9));
         }

         Class_U4Qsm43RVlUI3Pre.m_5191(var3 + f_18523, var4 + f_18524, f_18525, var30, var11, var26);
      }

      if (var14 > f_18526) {
         Class_U4Qsm43RVlUI3Pre.m_5191(var3 + f_18527, var4 + f_18528, f_18529, var30, var14, f_18372);
      }

      int var31 = Class_BftdentXEtGbugJw.m_2302(Class_BftdentXEtGbugJw.m_2310(255, 255, 255), var26, f_18530 * var9);
      this.m_6228(var3 + f_18531, var4 + f_18532, var31);
      Class_Ssh31B3ljfKeWsvS.m_4830();
      this.m_6230(var3, var4, var5);
      Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());
      Class_FvJXUGWpZo3zYBW4.m_2694(var3, var4, f_18533, f_18534, var6);
      Class_Ssh31B3ljfKeWsvS.m_4844();
   }

   private void m_6234(LivingEntity var1, ItemStack var2, float var3, float var4, GuiGraphicsExtractor var5, float var6) {
      float var7 = var3 + f_18573;
      float var8 = var4 + f_18574;
      float var9 = f_18575;
      float var10 = this.f_18391.m_9288() * var6;
      if (!(var10 <= f_18576)) {
         Class_U4Qsm43RVlUI3Pre.m_5196(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());
         Class_U4Qsm43RVlUI3Pre.m_5219(var7, var8, var9, var9, f_18577, f_18578, Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_18579 * var10));
         ItemStack var11 = var2.isEmpty() ? this.f_18397 : var2;
         if (!var11.isEmpty()) {
            Class_U4Qsm43RVlUI3Pre.m_5196(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());
            Class_Ssh31B3ljfKeWsvS.m_4864(f_18580 * var10);
            Class_Ssh31B3ljfKeWsvS.m_4851(var11, var7 + f_18581, var8 + f_18582, f_18583, false);
            Class_Ssh31B3ljfKeWsvS.m_4864(f_18584 * this.f_18375.m_9288());
         }

         if (!var2.isEmpty()) {
            String var12 = this.m_6236(var1);
            float var13 = Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var12, f_18585, 0.0F);
            Class_U4Qsm43RVlUI3Pre.m_5186(
               Class_y1y6QpONhWEUIdEB.m_9588(), var12, var7 + var9 / 2.0F - var13 / 2.0F, var8 + f_18586, 12, Class_BftdentXEtGbugJw.m_2306(-1, var10)
            );
         }
      }
   }

   public void m_6235(Class_bhRaN0YSSLQRYjPo var1) {
      if (!DimasikClient.m_9057().m_9049().m_2801().m_3433().m_6177().m_7145(f_18435)) {
         this.f_18375.m_9281(0.0F);
         this.f_18376.m_9281(0.0F);
         this.f_18377.m_9281(0.0F);
         this.f_18378 = false;
         this.f_18394.clear();
         this.f_18408 = 0L;
         this.m_4012(0.0F);
         this.m_4007(0.0F);
      } else {
         Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
         long var2 = System.nanoTime();
         this.f_18407 = this.f_18408 == 0L ? 0.0F : Math.min(f_18436, (float)(var2 - this.f_18408) / f_18437);
         this.f_18408 = var2;
         float var4 = this.m_3998();
         float var5 = this.m_3993();
         LivingEntity var6 = DimasikClient.m_9057().m_9049().m_2801().m_3576().m_1114();
         Entity var7 = this.m_6232(var6);
         float var8 = var7 != null ? 1.0F : 0.0F;
         if ((var7 != null ? var7 : this.f_18395) instanceof LivingEntity var10) {
            float var11 = this.m_6246(var10);
            float var12 = var10.getAbsorptionAmount();
            if (var7 != this.f_18395 && var7 != null) {
               this.f_18386.m_9281(var11);
               this.f_18387.m_9281(var11);
               this.f_18388.m_9281(var11);
               this.f_18389.m_9281(0.0F);
               this.f_18404 = var11;
               this.f_18390.m_4504(Math.round(var11));
               this.f_18392.m_9281(var12);
               this.f_18391.m_9281(0.0F);
               this.f_18397 = ItemStack.EMPTY;
               this.f_18398 = f_18438;
               this.f_18399 = f_18439;
               this.f_18400 = f_18440;
               this.f_18401 = f_18441;
               this.f_18402 = f_18442;
               this.f_18403 = f_18443;
               this.f_18405 = 0.0F;
               this.f_18406 = 0.0F;
               this.f_18394.clear();
            }

            this.f_18392.m_9283(var12);
            this.f_18386.m_9283(var11);
            if (this.f_18379.m_7568(f_18444)) {
               if (this.f_18404 >= 0.0F && Math.abs(var11 - this.f_18404) > f_18445) {
                  this.f_18389.m_9281(1.0F);
               }

               this.f_18387.m_9283(var11);
               this.f_18388.m_9283(var11);
               this.f_18389.m_9283(0.0F);
               this.f_18390.m_4501(Math.round(var11), this.f_18407);
               this.f_18404 = var11;
            }
         }

         this.m_6241(var8);
         if (this.f_18375.m_9288() < f_18446) {
            this.f_18394.clear();
            this.m_4012(0.0F);
            this.m_4007(0.0F);
         } else {
            Entity var16 = var7 != null ? var7 : this.f_18395;
            float var17 = this.m_6223(var16);
            if (this.f_18375.m_9288() > 0.0F) {
               this.m_4013();

               try {
                  this.m_6226(var16, var4, var5, var17, var1);
               } finally {
                  this.m_4005();
               }
            }

            this.f_18395 = var7 != null ? var7 : this.f_18395;
            this.m_4007(this.m_6221());
            this.m_4012(var17);
         }
      }
   }

   private String m_6236(LivingEntity var1) {
      float var2 = Math.max(0, var1.getUseItemRemainingTicks()) / f_18587;
      return this.f_18393.format(var2) + "";
   }

   @Override
   public boolean m_1340(float var1, float var2, int var3) {
      if (var3 == 1 && Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.m_3998(), this.m_3993(), this.m_1757(), this.m_1758())) {
         this.f_18385.m_9060(var1, var2);
         return true;
      } else {
         return this.f_18385.m_9070(var1, var2, var3);
      }
   }

   private float m_6237() {
      return Math.clamp((this.f_18377.m_9288() - f_18554) / f_18555, 0.0F, 1.0F);
   }

   @Generated
   public CopyOnWriteArrayList<Class_cdSwzxNCqQjsbpyo.OEfroLbLOcB56zRr> m_6238() {
      return this.f_18394;
   }

   private void m_6239(Entity var1, float var2, float var3, int var4, float var5) {
      if (this.f_18384.m_8768()) {
         Identifier var7 = f_18373;
         if (var1 instanceof LivingEntity var8 && var8.hurtTime > 0) {
            var7 = f_18374;
         }

         Class_U4Qsm43RVlUI3Pre.m_5196(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());
         Class_U4Qsm43RVlUI3Pre.m_5184(
            var2 + f_18556,
            var3 + f_18557,
            f_18558,
            f_18559,
            new Vector4f(f_18560, f_18561, f_18562, f_18563),
            new Vector4f(0.0F, 0.0F, 1.0F, 1.0F),
            new Vector4i(Class_BftdentXEtGbugJw.m_2306(-1, var5)),
            var7
         );
      } else if (var1 instanceof LivingEntity var6) {
         GpuTextureView var9 = Class_7CxJH622IPbYv0YY.m_1608(var6);
         if (var9 == null) {
            return;
         }

         Class_U4Qsm43RVlUI3Pre.m_5209(var2 + f_18564, var3 + f_18565, f_18566, f_18567, new Vector4f(f_18568), new Vector4f(f_18569), new Vector4i(-1), var9);
      } else {
         Class_U4Qsm43RVlUI3Pre.m_5186(Class_y1y6QpONhWEUIdEB.m_9591(), f_18570, var2 + f_18571, var3 + f_18572, 38, var4);
      }
   }

   private void m_6240(LivingEntity var1, float var2, float var3, float var4, float var5) {
      float var6 = var1.hurtTime > 0 ? Math.min(f_18592, (float)var1.hurtTime / Math.max(1, var1.hurtDuration)) : 0.0F;
      if (!this.f_18380.m_8768()) {
         this.f_18405 = var6;
      } else {
         boolean var7 = this.m_6229();
         int var8 = Math.max(1, Math.round(this.f_18382.m_8768()));
         ThreadLocalRandom var9 = ThreadLocalRandom.current();
         if (var6 > this.f_18405) {
            if (var7) {
               for (int var10 = 0; var10 < var8; var10++) {
                  this.f_18394.add(new Class_cdSwzxNCqQjsbpyo.OEfroLbLOcB56zRr(new Vec3(var4 + 2.0F, var5 + 2.0F, 0.0)));
               }
            } else {
               int var19 = Math.max(1, Math.round(var8 * f_18593 / f_18594));
               int var11 = Math.max(0, var8 - var19);

               for (int var12 = 0; var12 < var19; var12++) {
                  double var13 = f_18595 * var12 / var19 + var9.nextDouble(f_18596, f_18597);
                  double var15 = var9.nextDouble(f_18598, f_18599);
                  double var17 = var9.nextDouble(f_18600, f_18601);
                  this.f_18394
                     .add(
                        new Class_cdSwzxNCqQjsbpyo.OEfroLbLOcB56zRr(
                           var4 + Math.cos(var13) * var15, var5 + Math.sin(var13) * var15, Math.cos(var13) * var17, Math.sin(var13) * var17 - f_18602
                        )
                     );
               }

               for (int var21 = 0; var21 < var11; var21++) {
                  double var23 = var9.nextDouble(f_18603);
                  double var24 = var9.nextDouble(f_18604, f_18605);
                  this.f_18394
                     .add(
                        new Class_cdSwzxNCqQjsbpyo.OEfroLbLOcB56zRr(
                           var9.nextDouble(f_18606, var2 + f_18607),
                           var9.nextDouble(f_18608, var3 + f_18609),
                           Math.cos(var23) * var24,
                           Math.sin(var23) * var24 - f_18610
                        )
                     );
               }
            }
         }

         this.f_18405 = var6;
         if (!var7) {
            this.f_18406 = this.f_18406 + this.f_18407 * f_18611;

            while (this.f_18406 >= 1.0F) {
               this.f_18406--;
               if (this.f_18394.size() >= Math.max(40, var8 * 2)) {
                  break;
               }

               double var20 = var9.nextDouble(f_18612);
               double var22 = var9.nextDouble(f_18613, f_18614);
               this.f_18394
                  .add(
                     new Class_cdSwzxNCqQjsbpyo.OEfroLbLOcB56zRr(
                        var9.nextDouble(f_18615, var2 + f_18616),
                        var9.nextDouble(f_18617, var3 + f_18618),
                        Math.cos(var20) * var22,
                        Math.sin(var20) * var22 - f_18619
                     )
                  );
            }
         }
      }
   }

   private void m_6241(float var1) {
      boolean var2 = var1 > 0.0F;
      if (var2 != this.f_18378) {
         if (var2 && this.f_18375.m_9288() < f_18550) {
            this.f_18376.m_9281(0.0F);
            this.f_18377.m_9281(0.0F);
         }

         this.f_18376.m_9285(var2 ? Class_eXr9Fra2ad3yFXY8.f_19121 : Class_eXr9Fra2ad3yFXY8.f_19100);
         this.f_18376.m_9286(var2 ? f_18551 : f_18552);
         this.f_18378 = var2;
      }

      this.f_18375.m_9283(var1);
      this.f_18376.m_9283(var1);
      if (var2) {
         this.f_18377.m_9283(1.0F);
      }
   }

   private void m_6242(Entity var1, float var2, float var3, float var4, float var5, int var6, float var7) {
      String var8 = this.m_6243(var1);
      Class_U4Qsm43RVlUI3Pre.m_5186(Class_y1y6QpONhWEUIdEB.m_9588(), var8, var2 + f_18691, var3 + f_18692, 16, var6);
      Class_U4Qsm43RVlUI3Pre.m_5186(
         Class_y1y6QpONhWEUIdEB.m_9591(),
         f_18693,
         var2 + Math.max(f_18694, f_18695 + var5 - Class_y1y6QpONhWEUIdEB.m_9591().m_7383().m_2157(f_18696, f_18697, 0.0F) / 2.0F - f_18698),
         var3 + f_18699,
         15,
         var6
      );
      Class_U4Qsm43RVlUI3Pre.m_5186(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         (int)var4 + "",
         var2 + Math.max(f_18700, f_18701 + var5 - Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157((int)var4 + "", f_18702, 0.0F) / 2.0F - f_18703),
         var3 + f_18704,
         13,
         var6
      );
   }

   private String m_6243(Entity var1) {
      if (var1 == null) {
         return "";
      } else {
         return var1 instanceof Player var2 ? Class_29BIBbZyd5QWCwS1.m_997(var2) : Class_29BIBbZyd5QWCwS1.m_988(var1.getName().getString());
      }
   }

   private void m_6244(float var1, float var2, boolean var3) {
      if (!this.f_18381.m_8768()) {
         this.m_6220(var1, var2, var3);
      } else {
         float var4 = var3 ? this.f_18400 : this.f_18398;
         float var5 = var3 ? this.f_18401 : this.f_18399;
         boolean var6 = var5 >= 0.0F && var2 < var5 - f_18620;
         boolean var7 = var4 >= 0.0F && var1 < var4 - f_18621;
         if (var6 || var7) {
            float var8 = Math.max(var1, var4);
            float var9 = Math.max(f_18622, var8 - var1);
            float var10 = f_18623;
            int var11 = var6 ? Math.round(this.f_18382.m_8768()) : Math.max(1, Math.round(this.f_18382.m_8768() * f_18624));
            ThreadLocalRandom var12 = ThreadLocalRandom.current();
            boolean var13 = this.m_6229();
            int var14 = var3 ? f_18372 : 0;

            for (int var15 = 0; var15 < var11; var15++) {
               double var16 = f_18625 + var1 + var12.nextDouble(0.0, var9);
               double var18 = var10 + var12.nextDouble(f_18626, f_18627);
               if (var13) {
                  this.f_18394.add(new Class_cdSwzxNCqQjsbpyo.OEfroLbLOcB56zRr(new Vec3(var16, var18, 0.0), var14));
               } else {
                  double var20 = var12.nextDouble(f_18628, f_18629);
                  double var22 = var12.nextDouble(f_18630, f_18631);
                  this.f_18394
                     .add(
                        new Class_cdSwzxNCqQjsbpyo.OEfroLbLOcB56zRr(
                           var16, var18, Math.cos(var20) * var22, Math.sin(var20) * var22 - var12.nextDouble(f_18632, f_18633), var14
                        )
                     );
               }
            }
         }

         this.m_6220(var1, var2, var3);
      }
   }

   private float m_6245(float var1, float var2) {
      float var3 = Class_qyFZUkNc6oUs6ojL.m_8354();
      return var1 + (Math.round(var1 + var2 * var3) - var1) / var3;
   }

   private float m_6246(LivingEntity var1) {
      boolean var2 = DimasikClient.m_9057().m_9049().m_2801().m_3487().m_776();
      if (var2) {
         float var3 = Class_g3Fg4YmMuzK7loFX.m_6757(var1);
         float var4 = var1.getHealth() + var1.getAbsorptionAmount();
         return var3 == Math.floor(var4) ? var1.getHealth() : Math.max(0.0F, var3);
      } else {
         return var1.getHealth();
      }
   }

   @Generated
   public Class_u8iL1f1cFf6CucWB m_6247() {
      return this.f_18385;
   }

   private ItemStack m_6248(LivingEntity var1) {
      if (!var1.isUsingItem()) {
         return ItemStack.EMPTY;
      }

      ItemStack var2 = var1.getUseItem();
      if (var2.isEmpty()) {
         return ItemStack.EMPTY;
      }

      ItemUseAnimation var3 = var2.getUseAnimation();
      return var3 != ItemUseAnimation.EAT && var3 != ItemUseAnimation.DRINK ? ItemStack.EMPTY : var2;
   }

   public static class OEfroLbLOcB56zRr {
      public final boolean f_18303;
      public final boolean f_18304;
      public final int f_18305;
      public final long f_18306 = System.currentTimeMillis();
      public final long f_18307;
      public final float f_18308;
      public final float f_18309;
      public final float f_18310;
      public double f_18311;
      public double f_18312;
      public double f_18313;
      public double f_18314;
      public double f_18315;
      public double f_18316;
      public double f_18317;
      public double f_18318;
      public double f_18319;
      public Vec3 f_18320;
      public Vec3 f_18321;
      public float f_18322;
      public static final float f_18323 = 10.0F;
      public static final long f_18324 = 900L;
      public static final long f_18325 = 700L;
      public static final float f_18326 = 1.8F;
      public static final float f_18327 = 1.8F;
      public static final float f_18328 = 10.0F;
      public static final long f_18329 = 1250L;
      public static final long f_18330 = 750L;
      public static final float f_18331 = 4.0F;
      public static final long f_18332 = 900L;
      public static final long f_18333 = 700L;
      public static final float f_18334 = 1.8F;
      public static final float f_18335 = 1.8F;
      public static final float f_18336 = 10.0F;
      public static final float f_18337 = -75.0F;
      public static final float f_18338 = 75.0F;
      public static final float f_18339 = -75.0F;
      public static final float f_18340 = 75.0F;
      public static final float f_18341 = -75.0F;
      public static final float f_18342 = 75.0F;
      public static final long f_18343 = 1250L;
      public static final long f_18344 = 750L;
      public static final float f_18345 = 4.0F;
      public static final float f_18346 = 10.0F;
      public static final double f_18347 = 0.7;
      public static final double f_18348 = 3.2;
      public static final double f_18349 = 0.004;
      public static final float f_18350 = 4.0F;
      public static final double f_18351 = 0.4;
      public static final double f_18352 = 0.55;
      public static final double f_18353 = 0.55;
      public static final float f_18354 = 18.0F;
      public static final double f_18355 = 0.002;
      public static final float f_18356 = 4.0F;
      public static final double f_18357 = 6.0;
      public static final double f_18358 = 0.0017;
      public static final float f_18359 = 3.0F;
      public static final double f_18360 = 4.0;

      public OEfroLbLOcB56zRr(double var1, double var3, double var5, double var7) {
         this(var1, var3, var5, var7, 0);
      }

      public OEfroLbLOcB56zRr(Vec3 var1) {
         this(var1, 0);
      }

      public void m_6216(float var1, long var2) {
         if (this.f_18304) {
            this.f_18319 = this.f_18319 + this.f_18313 * var1;
            this.f_18317 = this.f_18317 + this.f_18314 * var1;
            this.f_18317 = this.f_18317 + (this.f_18318 - this.f_18317) * Math.min(1.0F, var1 * f_18346);
            this.f_18313 = this.f_18313 * Math.exp(-var1 * f_18347);
            this.f_18314 = this.f_18314 * Math.exp(-var1 * f_18348);
            double var4 = Math.sin(var2 * f_18349 + this.f_18309 * f_18350) * f_18351;
            this.f_18311 = this.f_18315 + Math.sin(this.f_18319) * (this.f_18317 + var4);
            this.f_18312 = this.f_18316 - Math.cos(this.f_18319) * (this.f_18317 + var4);
         } else {
            this.f_18313 = this.f_18313 * Math.exp(-var1 * f_18352);
            this.f_18314 = this.f_18314 * Math.exp(-var1 * f_18353);
            this.f_18314 = this.f_18314 + f_18354 * var1;
            this.f_18311 = this.f_18311 + (this.f_18313 * var1 + Math.sin(var2 * f_18355 + this.f_18309 * f_18356) * f_18357 * var1);
            this.f_18312 = this.f_18312 + (this.f_18314 * var1 + Math.cos(var2 * f_18358 + this.f_18309 * f_18359) * f_18360 * var1);
         }
      }

      public OEfroLbLOcB56zRr(Vec3 var1, int var2) {
         this.f_18309 = ThreadLocalRandom.current().nextFloat() * f_18336;
         this.f_18310 = ThreadLocalRandom.current().nextFloat();
         this.f_18303 = true;
         this.f_18304 = false;
         this.f_18305 = var2;
         this.f_18320 = var1;
         this.f_18321 = var1.add(
            -ThreadLocalRandom.current().nextFloat(f_18337, f_18338),
            -ThreadLocalRandom.current().nextFloat(f_18339, f_18340),
            -ThreadLocalRandom.current().nextFloat(f_18341, f_18342)
         );
         this.f_18307 = f_18343 + ThreadLocalRandom.current().nextLong(f_18344);
         this.f_18308 = f_18345;
      }

      public OEfroLbLOcB56zRr(double var1, double var3, double var5, double var7, double var9, double var11, int var13, boolean var14) {
         this.f_18309 = ThreadLocalRandom.current().nextFloat() * f_18328;
         this.f_18310 = ThreadLocalRandom.current().nextFloat();
         this.f_18303 = var14;
         this.f_18304 = true;
         this.f_18305 = var13;
         this.f_18315 = var1;
         this.f_18316 = var3;
         this.f_18317 = var5;
         this.f_18318 = var5;
         this.f_18319 = var7;
         this.f_18313 = var9;
         this.f_18314 = var11;
         this.f_18311 = var1 + Math.sin(var7) * var5;
         this.f_18312 = var3 - Math.cos(var7) * var5;
         if (var14) {
            this.f_18307 = f_18329 + ThreadLocalRandom.current().nextLong(f_18330);
            this.f_18308 = f_18331;
         } else {
            this.f_18307 = f_18332 + ThreadLocalRandom.current().nextLong(f_18333);
            this.f_18308 = f_18334 + ThreadLocalRandom.current().nextFloat() * f_18335;
         }
      }

      public OEfroLbLOcB56zRr(double var1, double var3, double var5, double var7, int var9) {
         this.f_18309 = ThreadLocalRandom.current().nextFloat() * f_18323;
         this.f_18310 = ThreadLocalRandom.current().nextFloat();
         this.f_18303 = false;
         this.f_18304 = false;
         this.f_18305 = var9;
         this.f_18311 = var1;
         this.f_18312 = var3;
         this.f_18313 = var5;
         this.f_18314 = var7;
         this.f_18307 = f_18324 + ThreadLocalRandom.current().nextLong(f_18325);
         this.f_18308 = f_18326 + ThreadLocalRandom.current().nextFloat() * f_18327;
      }
   }
}
