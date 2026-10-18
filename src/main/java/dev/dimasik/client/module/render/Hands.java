package dev.dimasik.client.module.render;

import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.pipeline.TextureTarget;
import com.mojang.blaze3d.systems.RenderSystem;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ColorSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_Us8xWOeAtWjRiicr;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import org.joml.Vector4f;

public class Hands extends Module {
   private static final String f_28490 = "Заливка";
   private static final String f_28491 = "Шейдер";
   private static final String f_28492 = "Зеркало";
   private static final String f_28493 = "Шейдер + Зеркало";
   private static final String f_28494 = "Nothing";
   private static final String f_28495 = "Обычный";
   private static final String f_28496 = "Энергия";
   private static final String f_28497 = "Ленты";
   public static volatile boolean f_28498;
   public static RenderTarget f_28499;
   private final MultiChoiceSetting f_28500;
   private final CheckboxSetting f_28501;
   private final CheckboxSetting f_28502;
   private final SliderSetting f_28503;
   private final SliderSetting f_28504;
   private final SliderSetting f_28505;
   private final CheckboxSetting f_28506;
   private final SliderSetting f_28507;
   private final SliderSetting f_28508;
   private final ColorSetting f_28509;
   private final SliderSetting f_28510;
   private final CheckboxSetting f_28511;
   private final SliderSetting f_28512;
   private final MultiChoiceSetting f_28513;
   private final ColorSetting f_28514;
   private final CheckboxSetting f_28515;
   private final ColorSetting f_28516;
   private final SliderSetting f_28517;
   private final SliderSetting f_28518;
   private final SliderSetting f_28519;
   private final SliderSetting f_28520;
   private final CheckboxSetting f_28521;
   private final SliderSetting f_28522;
   private final CheckboxSetting f_28523;
   private final SliderSetting f_28524;
   private final CheckboxSetting f_28525;
   private final SliderSetting f_28526;
   private final SliderSetting f_28527;
   private final ColorSetting f_28528;
   private final ColorSetting f_28529;
   private final SliderSetting f_28530;
   private final CheckboxSetting f_28531;
   private final ColorSetting f_28532;
   private final SliderSetting f_28533;
   private final CheckboxSetting f_28534;
   private final MultiChoiceSetting f_28535;
   private final SliderSetting f_28536;
   private final SliderSetting f_28537;
   private final SliderSetting f_28538;
   private final SliderSetting f_28539;
   private final SliderSetting f_28540;
   private final SliderSetting f_28541;
   private final SliderSetting f_28542;
   private final SliderSetting f_28543;
   private final SliderSetting f_28544;
   private final SliderSetting f_28545;
   private final SliderSetting f_28546;
   private final SliderSetting f_28547;
   private final CheckboxSetting f_28548;
   private final SliderSetting f_28549;
   private final SliderSetting f_28550;
   private final CheckboxSetting f_28551;
   private final SliderSetting f_28552;
   private final SliderSetting f_28553;
   private final SliderSetting f_28554;
   private final SliderSetting f_28555;
   private final SliderSetting f_28556;
   private final SliderSetting f_28557;
   private final SliderSetting f_28558;
   private final SliderSetting f_28559;
   private final CheckboxSetting f_28560;
   private final SliderSetting f_28561;
   private TextureTarget f_28562;
   private boolean f_28563;
   private long f_28564;
   private static final String f_28565 = "Hands";
   private static final String f_28566 = "Визуальные эффекты рук от первого лица";
   private static final String f_28567 = "Режим";
   private static final String f_28568 = "Nothing";
   private static final String f_28569 = "Заливка";
   private static final String f_28570 = "Шейдер";
   private static final String f_28571 = "Зеркало";
   private static final String f_28572 = "Шейдер + Зеркало";
   private static final String f_28573 = "Nothing";
   private static final String f_28574 = "Авто цвет под тему";
   private static final String f_28575 = "Авто цвет под предмет";
   private static final String f_28576 = "Смешивание";
   private static final float f_28577 = 0.5F;
   private static final float f_28578 = 0.01F;
   private static final String f_28579 = "Искажение зеркала";
   private static final float f_28580 = 0.05F;
   private static final String f_28581 = "Сила размытия";
   private static final float f_28582 = 0.1F;
   private static final float f_28583 = 3.0F;
   private static final float f_28584 = 0.05F;
   private static final String f_28585 = "Радужная";
   private static final String f_28586 = "Скорость радуги";
   private static final float f_28587 = 0.4F;
   private static final float f_28588 = 0.05F;
   private static final String f_28589 = "Масштаб радуги";
   private static final float f_28590 = 0.2F;
   private static final float f_28591 = 3.0F;
   private static final float f_28592 = 0.1F;
   private static final String f_28593 = "Цвет заливки";
   private static final int f_28594 = -48060;
   private static final String f_28595 = "Прозрачность заливки";
   private static final float f_28596 = 0.8F;
   private static final float f_28597 = 0.05F;
   private static final String f_28598 = "Сохранить тени";
   private static final String f_28599 = "Сила теней";
   private static final float f_28600 = 0.3F;
   private static final float f_28601 = 0.05F;
   private static final String f_28602 = "Стиль шейдера";
   private static final String f_28603 = "Шейдер";
   private static final String f_28604 = "HandShader";
   private static final String f_28605 = "Туманность";
   private static final String f_28606 = "Космос";
   private static final String f_28607 = "Градиент";
   private static final String f_28608 = "Homie";
   private static final String f_28609 = "Цвет шейдера 1";
   private static final int f_28610 = -3632385;
   private static final String f_28611 = "Второй цвет";
   private static final String f_28612 = "Цвет шейдера 2";
   private static final int f_28613 = -11534136;
   private static final String f_28614 = "Скорость шейдера";
   private static final float f_28615 = 1.5F;
   private static final float f_28616 = 0.05F;
   private static final float f_28617 = 2.5F;
   private static final float f_28618 = 0.05F;
   private static final String f_28619 = "Масштаб шейдера";
   private static final float f_28620 = 1.5F;
   private static final float f_28621 = 0.2F;
   private static final float f_28622 = 5.0F;
   private static final float f_28623 = 0.1F;
   private static final String f_28624 = "Свечение шейдера";
   private static final float f_28625 = 1.2F;
   private static final float f_28626 = 3.0F;
   private static final float f_28627 = 0.05F;
   private static final String f_28628 = "Качество шейдера";
   private static final float f_28629 = 3.0F;
   private static final String f_28630 = "Звёзды";
   private static final String f_28631 = "Прозрачность шейдера";
   private static final float f_28632 = 0.05F;
   private static final String f_28633 = "Сохранить тени шейдера";
   private static final String f_28634 = "Сила теней шейдера";
   private static final float f_28635 = 0.5F;
   private static final float f_28636 = 0.05F;
   private static final String f_28637 = "Глов";
   private static final String f_28638 = "Размытие";
   private static final float f_28639 = 3.0F;
   private static final float f_28640 = 5.0F;
   private static final String f_28641 = "Яркость";
   private static final float f_28642 = 0.5F;
   private static final float f_28643 = 5.0F;
   private static final float f_28644 = 0.1F;
   private static final String f_28645 = "Цвет глова 1";
   private static final String f_28646 = "Цвет глова 2";
   private static final int f_28647 = -54784;
   private static final String f_28648 = "Внутреннее свечение";
   private static final float f_28649 = 0.65F;
   private static final float f_28650 = 1.5F;
   private static final float f_28651 = 0.05F;
   private static final String f_28652 = "Обводка";
   private static final String f_28653 = "Цвет обводки";
   private static final String f_28654 = "Толщина обводки";
   private static final float f_28655 = 0.5F;
   private static final float f_28656 = 0.5F;
   private static final String f_28657 = "Шлейф";
   private static final String f_28658 = "Режим шлейфа";
   private static final String f_28659 = "Обычный";
   private static final String f_28660 = "Энергия";
   private static final String f_28661 = "Ленты";
   private static final String f_28662 = "Длина энергии";
   private static final float f_28663 = 0.4F;
   private static final float f_28664 = 0.05F;
   private static final String f_28665 = "Яркость энергии";
   private static final float f_28666 = 1.35F;
   private static final float f_28667 = 0.5F;
   private static final float f_28668 = 2.5F;
   private static final float f_28669 = 0.05F;
   private static final String f_28670 = "Движение энергии";
   private static final float f_28671 = 1.3F;
   private static final float f_28672 = 0.05F;
   private static final String f_28673 = "Пульсация энергии";
   private static final float f_28674 = 0.05F;
   private static final String f_28675 = "Шлейф за камерой";
   private static final float f_28676 = 0.05F;
   private static final float f_28677 = 0.05F;
   private static final String f_28678 = "Длина лент";
   private static final float f_28679 = 0.3F;
   private static final float f_28680 = 0.15F;
   private static final float f_28681 = 3.0F;
   private static final float f_28682 = 0.05F;
   private static final String f_28683 = "Ширина лент";
   private static final float f_28684 = 0.55F;
   private static final float f_28685 = 0.25F;
   private static final float f_28686 = 1.5F;
   private static final float f_28687 = 0.05F;
   private static final String f_28688 = "Яркость лент";
   private static final float f_28689 = 2.5F;
   private static final float f_28690 = 0.05F;
   private static final String f_28691 = "Сила лент за камерой";
   private static final float f_28692 = 0.1F;
   private static final float f_28693 = 0.05F;
   private static final String f_28694 = "Подъём лент";
   private static final float f_28695 = 0.32F;
   private static final float f_28696 = 0.01F;
   private static final String f_28697 = "Изгиб лент";
   private static final float f_28698 = 0.05F;
   private static final String f_28699 = "Скорость волн";
   private static final float f_28700 = 1.5F;
   private static final float f_28701 = 3.0F;
   private static final float f_28702 = 0.05F;
   private static final String f_28703 = "Ленты при ударе";
   private static final String f_28704 = "Длина при ударе";
   private static final float f_28705 = 0.15F;
   private static final float f_28706 = 3.0F;
   private static final float f_28707 = 0.05F;
   private static final String f_28708 = "Сила при ударе";
   private static final float f_28709 = 1.15F;
   private static final float f_28710 = 2.5F;
   private static final float f_28711 = 0.05F;
   private static final String f_28712 = "Ленты при еде";
   private static final String f_28713 = "Длина при еде";
   private static final float f_28714 = 0.65F;
   private static final float f_28715 = 0.15F;
   private static final float f_28716 = 3.0F;
   private static final float f_28717 = 0.05F;
   private static final String f_28718 = "Сила при еде";
   private static final float f_28719 = 0.7F;
   private static final float f_28720 = 2.5F;
   private static final float f_28721 = 0.05F;
   private static final String f_28722 = "Скорость затухания";
   private static final float f_28723 = 0.04F;
   private static final float f_28724 = 0.002F;
   private static final float f_28725 = 0.2F;
   private static final float f_28726 = 0.002F;
   private static final String f_28727 = "Подъём";
   private static final float f_28728 = 0.2F;
   private static final float f_28729 = 1.5F;
   private static final float f_28730 = 0.05F;
   private static final String f_28731 = "Качание";
   private static final float f_28732 = 0.2F;
   private static final float f_28733 = 0.005F;
   private static final String f_28734 = "Шлейф от камеры";
   private static final float f_28735 = 0.05F;
   private static final String f_28736 = "Турбулентность";
   private static final float f_28737 = 0.02F;
   private static final float f_28738 = 0.6F;
   private static final float f_28739 = 0.01F;
   private static final String f_28740 = "Мерцание";
   private static final float f_28741 = 0.2F;
   private static final float f_28742 = 0.2F;
   private static final float f_28743 = 0.01F;
   private static final String f_28744 = "Сдув при ударе";
   private static final String f_28745 = "Сила сдува";
   private static final float f_28746 = 4.0F;
   private static final float f_28747 = 10.0F;
   private static final float f_28748 = 0.5F;
   private static final String f_28749 = "hands-capture";
   private static final String f_28750 = "Заливка";
   private static final String f_28751 = "Шейдер";
   private static final String f_28752 = "Зеркало";
   private static final String f_28753 = "Шейдер + Зеркало";
   private static final String f_28754 = "Nothing";
   private static final String f_28755 = "Шейдер";
   private static final String f_28756 = "Зеркало";
   private static final String f_28757 = "HandShader";
   private static final String f_28758 = "Туманность";
   private static final String f_28759 = "Космос";
   private static final String f_28760 = "Градиент";
   private static final String f_28761 = "Homie";
   private static final float f_28762 = 1000.0F;
   private static final String f_28763 = "Обычный";
   private static final String f_28764 = "Энергия";
   private static final String f_28765 = "Ленты";
   private static final String f_28766 = "Градиент";

   public float m_8108() {
      return this.f_28507.m_8768();
   }

   public int m_8109() {
      int var1 = Math.round(this.f_28520.m_8768());
      return var1 == 1 ? 3 : (var1 == 3 ? 8 : 5);
   }

   public int m_8110() {
      return this.f_28501.m_8768() ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : this.f_28514.m_8768();
   }

   public float m_8111() {
      return this.f_28519.m_8768();
   }

   public float m_8112() {
      return this.f_28539.m_8768();
   }

   public float m_8113() {
      return this.f_28541.m_8768();
   }

   public float m_8114() {
      return this.f_28503.m_8768();
   }

   public void m_8115() {
      if (this.m_8181() && !this.f_28563 && f_11537.player != null && f_11537.level != null) {
         RenderTarget var1 = f_11537.gameRenderer.mainRenderTarget();
         int var2 = Math.max(1, var1.width);
         int var3 = Math.max(1, var1.height);
         if (this.f_28562 == null) {
            this.f_28562 = new TextureTarget(f_28749, var2, var3, true, GpuFormat.RGBA8_UNORM);
         } else if (this.f_28562.width != var2 || this.f_28562.height != var3) {
            this.f_28562.resize(var2, var3);
         }

         RenderSystem.getDevice()
            .createCommandEncoder()
            .clearColorAndDepthTextures(this.f_28562.getColorTexture(), new Vector4f(0.0F), this.f_28562.getDepthTexture(), 0.0);
         f_28499 = this.f_28562;
         f_28498 = true;
         this.f_28563 = true;
      }
   }

   public float m_8116() {
      return this.f_28527.m_8768();
   }

   public float m_8118() {
      return this.f_28549.m_8768();
   }

   public int m_8119() {
      if (this.m_8127()) {
         return 4;
      } else {
         return this.m_8125() ? 0 : (this.f_28500.m_7568(f_28755) ? 1 : (this.f_28500.m_7568(f_28756) ? 2 : 3));
      }
   }

   public int m_8120() {
      if (this.f_28501.m_8768()) {
         return this.f_28515.m_8768()
            ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN_TWO)
            : Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
      } else {
         return this.f_28515.m_8768() ? this.f_28516.m_8768() : this.f_28514.m_8768();
      }
   }

   public float m_8121() {
      return this.f_28552.m_8768();
   }

   public int m_8122() {
      return this.f_28501.m_8768() ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : this.f_28509.m_8768();
   }

   public boolean m_8123() {
      return this.f_28511.m_8768();
   }

   public boolean m_8124() {
      return this.f_28548.m_8768();
   }

   public boolean m_8125() {
      return this.f_28500.m_7568(f_28750);
   }

   public boolean m_8127() {
      return this.f_28500.m_7568(f_28754);
   }

   public boolean m_8129() {
      return this.f_28531.m_8768();
   }

   public void m_8130() {
      if (this.f_28563) {
         f_28498 = false;
         f_28499 = null;
         this.f_28563 = false;
         if (this.m_776() && this.f_28562 != null && f_11537.gameRenderer.mainRenderTarget() != null) {
            Class_Us8xWOeAtWjRiicr.f_14920.m_5320(this.f_28562, f_11537.gameRenderer.mainRenderTarget(), this);
         }
      }
   }

   public boolean m_8131() {
      return this.f_28500.m_7568(f_28751) || this.m_8173();
   }

   public boolean m_8132() {
      return this.f_28523.m_8768();
   }

   public float m_8133() {
      return this.f_28526.m_8768();
   }

   public boolean m_8134() {
      return this.m_8186() && this.f_28535.m_7568(f_28764);
   }

   public float m_8136() {
      return this.f_28537.m_8768();
   }

   public Hands() {
      super(f_28565, f_28566, Category.RENDER);
      this.f_28500 = new MultiChoiceSetting(
         f_28567,
         new Class_2ZaVm8TGDJ68TnJB(f_28568),
         new Class_2ZaVm8TGDJ68TnJB(f_28569),
         new Class_2ZaVm8TGDJ68TnJB(f_28570),
         new Class_2ZaVm8TGDJ68TnJB(f_28571),
         new Class_2ZaVm8TGDJ68TnJB(f_28572),
         new Class_2ZaVm8TGDJ68TnJB(f_28573)
      );
      this.f_28501 = new CheckboxSetting(f_28574, true);
      this.f_28502 = new CheckboxSetting(f_28575, false);
      this.f_28503 = new SliderSetting(f_28576, f_28577, 0.0F, 1.0F).m_828(f_28578).m_822(this::m_8151);
      this.f_28504 = new SliderSetting(f_28579, 0.0F, 0.0F, 1.0F).m_828(f_28580).m_822(this::m_8151);
      this.f_28505 = new SliderSetting(f_28581, 1.0F, f_28582, f_28583).m_828(f_28584).m_822(this::m_8151);
      this.f_28506 = new CheckboxSetting(f_28585, false).m_822(this::m_8125);
      this.f_28507 = new SliderSetting(f_28586, f_28587, 0.0F, 2.0F).m_828(f_28588).m_822(() -> this.m_8125() && this.f_28506.m_8768());
      this.f_28508 = new SliderSetting(f_28589, 1.0F, f_28590, f_28591).m_828(f_28592).m_822(() -> this.m_8125() && this.f_28506.m_8768());
      this.f_28509 = new ColorSetting(f_28593, false, f_28594).m_822(() -> this.m_8125() && !this.f_28506.m_8768() && !this.f_28501.m_8768());
      this.f_28510 = new SliderSetting(f_28595, f_28596, 0.0F, 1.0F).m_828(f_28597).m_822(this::m_8125);
      this.f_28511 = new CheckboxSetting(f_28598, true).m_822(this::m_8125);
      this.f_28512 = new SliderSetting(f_28599, f_28600, 0.0F, 1.0F).m_828(f_28601).m_822(() -> this.m_8125() && this.f_28511.m_8768());
      this.f_28513 = new MultiChoiceSetting(
            f_28602,
            new Class_2ZaVm8TGDJ68TnJB(f_28603),
            new Class_2ZaVm8TGDJ68TnJB(f_28604),
            new Class_2ZaVm8TGDJ68TnJB(f_28605),
            new Class_2ZaVm8TGDJ68TnJB(f_28606),
            new Class_2ZaVm8TGDJ68TnJB(f_28607),
            new Class_2ZaVm8TGDJ68TnJB(f_28608)
         )
         .m_822(this::m_8131);
      this.f_28514 = new ColorSetting(f_28609, false, f_28610).m_822(() -> this.m_8131() && !this.f_28501.m_8768());
      this.f_28515 = new CheckboxSetting(f_28611, false).m_822(this::m_8131);
      this.f_28516 = new ColorSetting(f_28612, false, f_28613).m_822(() -> this.m_8131() && this.f_28515.m_8768() && !this.f_28501.m_8768());
      this.f_28517 = new SliderSetting(f_28614, f_28615, f_28616, f_28617).m_828(f_28618).m_822(this::m_8131);
      this.f_28518 = new SliderSetting(f_28619, f_28620, f_28621, f_28622).m_828(f_28623).m_822(this::m_8131);
      this.f_28519 = new SliderSetting(f_28624, f_28625, 0.0F, f_28626).m_828(f_28627).m_822(this::m_8131);
      this.f_28520 = new SliderSetting(f_28628, 2.0F, 1.0F, f_28629).m_828(1.0F).m_822(() -> this.m_8131() && !this.f_28513.m_7568(f_28766));
      this.f_28521 = new CheckboxSetting(f_28630, true).m_822(this::m_8131);
      this.f_28522 = new SliderSetting(f_28631, 1.0F, 0.0F, 1.0F).m_828(f_28632).m_822(this::m_8131);
      this.f_28523 = new CheckboxSetting(f_28633, false).m_822(this::m_8131);
      this.f_28524 = new SliderSetting(f_28634, f_28635, 0.0F, 1.0F).m_828(f_28636).m_822(() -> this.m_8131() && this.f_28523.m_8768());
      this.f_28525 = new CheckboxSetting(f_28637, true);
      this.f_28526 = new SliderSetting(f_28638, f_28639, 1.0F, f_28640).m_828(1.0F).m_822(this.f_28525::m_8768);
      this.f_28527 = new SliderSetting(f_28641, 1.0F, f_28642, f_28643).m_828(f_28644).m_822(this.f_28525::m_8768);
      this.f_28528 = new ColorSetting(f_28645, false, -11713).m_822(() -> this.f_28525.m_8768() && !this.f_28501.m_8768() && !this.f_28502.m_8768());
      this.f_28529 = new ColorSetting(f_28646, false, f_28647).m_822(() -> this.f_28525.m_8768() && !this.f_28501.m_8768() && !this.f_28502.m_8768());
      this.f_28530 = new SliderSetting(f_28648, f_28649, 0.0F, f_28650).m_828(f_28651).m_822(this.f_28525::m_8768);
      this.f_28531 = new CheckboxSetting(f_28652, true);
      this.f_28532 = new ColorSetting(f_28653, true, -1).m_822(() -> this.f_28531.m_8768() && !this.f_28501.m_8768() && !this.f_28502.m_8768());
      this.f_28533 = new SliderSetting(f_28654, 1.0F, f_28655, 2.0F).m_828(f_28656).m_822(this.f_28531::m_8768);
      this.f_28534 = new CheckboxSetting(f_28657, true).m_822(this.f_28525::m_8768);
      this.f_28535 = new MultiChoiceSetting(
            f_28658, new Class_2ZaVm8TGDJ68TnJB(f_28659), new Class_2ZaVm8TGDJ68TnJB(f_28660), new Class_2ZaVm8TGDJ68TnJB(f_28661)
         )
         .m_822(this::m_8186);
      this.f_28536 = new SliderSetting(f_28662, 1.0F, f_28663, 2.0F).m_828(f_28664).m_822(this::m_8134);
      this.f_28537 = new SliderSetting(f_28665, f_28666, f_28667, f_28668).m_828(f_28669).m_822(this::m_8134);
      this.f_28538 = new SliderSetting(f_28670, f_28671, 0.0F, 2.0F).m_828(f_28672).m_822(this::m_8134);
      this.f_28539 = new SliderSetting(f_28673, 1.0F, 0.0F, 2.0F).m_828(f_28674).m_822(this::m_8134);
      this.f_28540 = new SliderSetting(f_28675, f_28676, 0.0F, 2.0F).m_828(f_28677).m_822(this::m_8134);
      this.f_28541 = new SliderSetting(f_28678, f_28679, f_28680, f_28681).m_828(f_28682).m_822(this::m_8153);
      this.f_28542 = new SliderSetting(f_28683, f_28684, f_28685, f_28686).m_828(f_28687).m_822(this::m_8153);
      this.f_28543 = new SliderSetting(f_28688, 1.0F, 0.0F, f_28689).m_828(f_28690).m_822(this::m_8153);
      this.f_28544 = new SliderSetting(f_28691, f_28692, 0.0F, 2.0F).m_828(f_28693).m_822(this::m_8153);
      this.f_28545 = new SliderSetting(f_28694, f_28695, 0.0F, 1.0F).m_828(f_28696).m_822(this::m_8153);
      this.f_28546 = new SliderSetting(f_28697, 2.0F, 0.0F, 2.0F).m_828(f_28698).m_822(this::m_8153);
      this.f_28547 = new SliderSetting(f_28699, f_28700, 0.0F, f_28701).m_828(f_28702).m_822(this::m_8153);
      this.f_28548 = new CheckboxSetting(f_28703, true).m_822(this::m_8153);
      this.f_28549 = new SliderSetting(f_28704, 0.0F, f_28705, f_28706).m_828(f_28707).m_822(() -> this.m_8153() && this.f_28548.m_8768());
      this.f_28550 = new SliderSetting(f_28708, f_28709, 0.0F, f_28710).m_828(f_28711).m_822(() -> this.m_8153() && this.f_28548.m_8768());
      this.f_28551 = new CheckboxSetting(f_28712, true).m_822(this::m_8153);
      this.f_28552 = new SliderSetting(f_28713, f_28714, f_28715, f_28716).m_828(f_28717).m_822(() -> this.m_8153() && this.f_28551.m_8768());
      this.f_28553 = new SliderSetting(f_28718, f_28719, 0.0F, f_28720).m_828(f_28721).m_822(() -> this.m_8153() && this.f_28551.m_8768());
      this.f_28554 = new SliderSetting(f_28722, f_28723, f_28724, f_28725).m_828(f_28726).m_822(this::m_8165);
      this.f_28555 = new SliderSetting(f_28727, f_28728, 0.0F, f_28729).m_828(f_28730).m_822(this::m_8165);
      this.f_28556 = new SliderSetting(f_28731, 0.0F, 0.0F, f_28732).m_828(f_28733).m_822(this::m_8165);
      this.f_28557 = new SliderSetting(f_28734, 0.0F, 0.0F, 2.0F).m_828(f_28735).m_822(this::m_8165);
      this.f_28558 = new SliderSetting(f_28736, f_28737, 0.0F, f_28738).m_828(f_28739).m_822(this::m_8165);
      this.f_28559 = new SliderSetting(f_28740, f_28741, 0.0F, f_28742).m_828(f_28743).m_822(this::m_8165);
      this.f_28560 = new CheckboxSetting(f_28744, false).m_822(this::m_8165);
      this.f_28561 = new SliderSetting(f_28745, f_28746, 1.0F, f_28747).m_828(f_28748).m_822(() -> this.m_8165() && this.f_28560.m_8768());
      this.m_795(
         this.f_28500,
         this.f_28501,
         this.f_28502,
         this.f_28503,
         this.f_28504,
         this.f_28505,
         this.f_28506,
         this.f_28507,
         this.f_28508,
         this.f_28509,
         this.f_28510,
         this.f_28511,
         this.f_28512,
         this.f_28513,
         this.f_28514,
         this.f_28515,
         this.f_28516,
         this.f_28517,
         this.f_28518,
         this.f_28519,
         this.f_28520,
         this.f_28521,
         this.f_28522,
         this.f_28523,
         this.f_28524,
         this.f_28525,
         this.f_28526,
         this.f_28527,
         this.f_28528,
         this.f_28529,
         this.f_28530,
         this.f_28531,
         this.f_28532,
         this.f_28533,
         this.f_28534,
         this.f_28535,
         this.f_28536,
         this.f_28537,
         this.f_28538,
         this.f_28539,
         this.f_28540,
         this.f_28541,
         this.f_28542,
         this.f_28543,
         this.f_28544,
         this.f_28545,
         this.f_28546,
         this.f_28547,
         this.f_28548,
         this.f_28549,
         this.f_28550,
         this.f_28551,
         this.f_28552,
         this.f_28553,
         this.f_28554,
         this.f_28555,
         this.f_28556,
         this.f_28557,
         this.f_28558,
         this.f_28559,
         this.f_28560,
         this.f_28561
      );
   }

   public float m_8137() {
      return this.f_28518.m_8768();
   }

   public float m_8138() {
      return this.f_28553.m_8768();
   }

   @Override
   public void m_778() {
      this.f_28564 = System.currentTimeMillis();
   }

   public float m_8139() {
      return this.f_28556.m_8768();
   }

   public float m_8140() {
      return this.f_28510.m_8768();
   }

   public int m_8141() {
      return Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
   }

   public float m_8143() {
      return this.f_28546.m_8768();
   }

   public boolean m_8144() {
      return this.f_28560.m_8768();
   }

   public boolean m_8145() {
      return this.f_28551.m_8768();
   }

   public float m_8147() {
      return this.f_28540.m_8768();
   }

   public float m_8148() {
      return this.f_28557.m_8768();
   }

   public float m_8149() {
      return this.f_28555.m_8768();
   }

   public float m_8150() {
      return this.f_28550.m_8768();
   }

   public boolean m_8151() {
      return this.f_28500.m_7568(f_28752) || this.m_8173();
   }

   public float m_8152() {
      return this.f_28517.m_8768();
   }

   public boolean m_8153() {
      return this.m_8186() && this.f_28535.m_7568(f_28765);
   }

   public int m_8155() {
      if (this.f_28502.m_8768()) {
         return -1;
      } else {
         return this.f_28501.m_8768() ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : this.f_28532.m_8768();
      }
   }

   public float m_8156() {
      return this.f_28508.m_8768();
   }

   public float m_8158() {
      return this.f_28504.m_8768();
   }

   public int m_8159() {
      if (this.f_28513.m_7568(f_28757)) {
         return 4;
      } else if (this.f_28513.m_7568(f_28758)) {
         return 1;
      } else if (this.f_28513.m_7568(f_28759)) {
         return 2;
      } else if (this.f_28513.m_7568(f_28760)) {
         return 3;
      } else {
         return this.f_28513.m_7568(f_28761) ? 5 : 0;
      }
   }

   public float m_8160() {
      return this.f_28533.m_8768();
   }

   public float m_8161() {
      return this.f_28554.m_8768();
   }

   public float m_8162() {
      return this.f_28545.m_8768();
   }

   public float m_8163() {
      return this.f_28543.m_8768();
   }

   public float m_8164() {
      return this.f_28547.m_8768();
   }

   public boolean m_8165() {
      return this.m_8186() && this.f_28535.m_7568(f_28763);
   }

   public int m_8166() {
      return this.f_28501.m_8768() ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : this.f_28528.m_8768();
   }

   public float m_8167() {
      return this.f_28536.m_8768();
   }

   public float m_8168() {
      return this.f_28505.m_8768();
   }

   public float m_8169() {
      return this.f_28559.m_8768();
   }

   public float m_8170() {
      return this.f_28542.m_8768();
   }

   public int m_8171() {
      return this.f_28501.m_8768() ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN_TWO) : this.f_28529.m_8768();
   }

   public float m_8172() {
      return this.f_28512.m_8768();
   }

   public boolean m_8173() {
      return this.f_28500.m_7568(f_28753);
   }

   public float m_8174() {
      return this.f_28544.m_8768();
   }

   public float m_8177() {
      return this.f_28561.m_8768();
   }

   @Override
   public void m_732() {
      f_28498 = false;
      f_28499 = null;
      this.f_28563 = false;
      if (this.f_28562 != null) {
         this.f_28562.destroyBuffers();
         this.f_28562 = null;
      }

      Class_Us8xWOeAtWjRiicr.f_14920.m_5303();
   }

   public float m_8179() {
      return this.f_28558.m_8768();
   }

   public boolean m_8181() {
      return this.m_776() && (!this.m_8127() || this.f_28525.m_8768() || this.f_28531.m_8768());
   }

   public float m_8182() {
      return this.f_28530.m_8768();
   }

   public float m_8183() {
      return (float)(System.currentTimeMillis() - this.f_28564) / f_28762;
   }

   public boolean m_8186() {
      return this.f_28525.m_8768() && this.f_28534.m_8768();
   }

   public float m_8188() {
      return this.f_28522.m_8768();
   }

   public boolean m_8189() {
      return this.f_28502.m_8768();
   }

   public boolean m_8190() {
      return this.f_28521.m_8768();
   }

   public boolean m_8191() {
      return this.f_28506.m_8768();
   }

   public int m_8193() {
      return this.m_8153() ? 2 : (this.m_8134() ? 1 : 0);
   }

   public float m_8194() {
      return this.f_28524.m_8768();
   }

   public boolean m_8195() {
      return this.f_28525.m_8768();
   }

   public float m_8196() {
      return this.f_28538.m_8768();
   }
}
