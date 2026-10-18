package dev.dimasik.client.module.render;

import com.mojang.blaze3d.IndexType;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.AutoStorageIndexBuffer;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.MeshData;
import com.mojang.blaze3d.vertex.MeshData.DrawState;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ColorSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_NzJrN63M7QBpmAbi;
import dev.dimasik.client.system.Class_PoKta0VE7AdhY1En;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;

public class WorldParticles extends Module {
   private static final float f_20569 = 1.4142135F;
   private static final float[] f_20570 = new float[]{WorldParticles.f_20752, WorldParticles.f_20753, WorldParticles.f_20754};
   private static final float[] f_20571 = new float[]{WorldParticles.f_20755, WorldParticles.f_20756, WorldParticles.f_20757};
   private static final int[] f_20572 = new int[]{
      WorldParticles.f_20758,
      -19361,
      -142,
      WorldParticles.f_20759,
      WorldParticles.f_20760,
      WorldParticles.f_20761,
      WorldParticles.f_20762,
      WorldParticles.f_20763,
      -1,
      WorldParticles.f_20764
   };
   private final MultiChoiceSetting f_20573;
   private final MultiChoiceSetting f_20574;
   private final SliderSetting f_20575;
   private final SliderSetting f_20576;
   private final SliderSetting f_20577;
   private final SliderSetting f_20578;
   private final SliderSetting f_20579;
   private final MultiChoiceSetting f_20580;
   private final SliderSetting f_20581;
   private final SliderSetting f_20582;
   private final SliderSetting f_20583;
   private final CheckboxSetting f_20584;
   private final CheckboxSetting f_20585;
   private final CheckboxSetting f_20586;
   private final CheckboxSetting f_20587;
   private final ColorSetting f_20588;
   private final List<WorldParticles.aztZH0xs3t5tppSZ> f_20589;
   private final RenderPipeline f_20590;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_20591;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_20592;
   private Vec3 f_20593;
   private WorldParticles.Class_6a9COkoS3NohmbgS f_20594;
   private final float[] f_20595;
   private final float[] f_20596;
   private static final String f_20597 = "WorldParticles";
   private static final String f_20598 = "Частицы вокруг игрока";
   private static final String f_20599 = "Форма";
   private static final String f_20600 = "Корона";
   private static final String f_20601 = "Взрыв куба";
   private static final String f_20602 = "Доллар";
   private static final String f_20603 = "Сердце";
   private static final String f_20604 = "Молния";
   private static final String f_20605 = "Линия";
   private static final String f_20606 = "Ромб";
   private static final String f_20607 = "Снежинка";
   private static final String f_20608 = "Звезда";
   private static final String f_20609 = "Звезда 2";
   private static final String f_20610 = "Треугольник";
   private static final String f_20611 = "Свечение";
   private static final String f_20612 = "Рандом";
   private static final String f_20613 = "Анимация";
   private static final String f_20614 = "Обычная";
   private static final String f_20615 = "Парение";
   private static final String f_20616 = "Маятник";
   private static final String f_20617 = "Кувырок";
   private static final String f_20618 = "Пульсация";
   private static final String f_20619 = "Скорость анимации";
   private static final float f_20620 = 0.25F;
   private static final float f_20621 = 3.0F;
   private static final float f_20622 = 0.05F;
   private static final String f_20623 = "Сила анимации";
   private static final float f_20624 = 0.2F;
   private static final float f_20625 = 0.05F;
   private static final String f_20626 = "Количество";
   private static final float f_20627 = 100.0F;
   private static final float f_20628 = 10.0F;
   private static final float f_20629 = 300.0F;
   private static final String f_20630 = "Время жизни";
   private static final float f_20631 = 10.0F;
   private static final float f_20632 = 60.0F;
   private static final String f_20633 = "Размер";
   private static final float f_20634 = 1.5F;
   private static final float f_20635 = 0.1F;
   private static final float f_20636 = 1.5F;
   private static final float f_20637 = 0.05F;
   private static final String f_20638 = "Тип свечения";
   private static final String f_20639 = "Тип 1";
   private static final String f_20640 = "Тип 2";
   private static final String f_20641 = "Свечение";
   private static final float f_20642 = 1.5F;
   private static final float f_20643 = 0.1F;
   private static final float f_20644 = 5.0F;
   private static final float f_20645 = 0.1F;
   private static final String f_20646 = "Размер свечения";
   private static final float f_20647 = 3.0F;
   private static final String f_20648 = "Дальность";
   private static final float f_20649 = 48.0F;
   private static final float f_20650 = 16.0F;
   private static final float f_20651 = 96.0F;
   private static final String f_20652 = "Физика";
   private static final String f_20653 = "Анимированная альфа";
   private static final String f_20654 = "Случайный цвет";
   private static final String f_20655 = "Авто цвет под тему";
   private static final String f_20656 = "Цвет";
   private static final int f_20657 = -10962689;
   private static final String f_20658 = "dimasik/world_particles";
   private static final String f_20659 = "dead_chams";
   private static final String f_20660 = "dead_chams";
   private static final String f_20661 = "Sampler0";
   private static final String f_20662 = "Парение";
   private static final String f_20663 = "Маятник";
   private static final String f_20664 = "Кувырок";
   private static final String f_20665 = "Пульсация";
   private static final float f_20666 = 0.25F;
   private static final float f_20667 = 0.22F;
   private static final float f_20668 = 12.0F;
   private static final String f_20669 = "Тип 2";
   private static final float f_20670 = 0.25F;
   private static final float f_20671 = 0.25F;
   private static final float f_20672 = 0.36F;
   private static final float f_20673 = 1.4142135F;
   private static final double f_20674 = 0.08;
   private static final double f_20675 = 0.015;
   private static final double f_20676 = 3.0;
   private static final double f_20677 = 5.0;
   private static final double f_20678 = 0.72;
   private static final double f_20679 = Math.PI * 2;
   private static final double f_20680 = 0.015;
   private static final double f_20681 = 1.0E-4;
   private static final double f_20682 = 0.45;
   private static final double f_20683 = 0.45;
   private static final double f_20684 = -1.25;
   private static final double f_20685 = 1.25;
   private static final double f_20686 = 4.0;
   private static final double f_20687 = 20.0;
   private static final float f_20688 = 0.25F;
   private static final double f_20689 = -0.035;
   private static final double f_20690 = 0.035;
   private static final double f_20691 = -0.006;
   private static final double f_20692 = 0.018;
   private static final double f_20693 = -0.035;
   private static final double f_20694 = 0.035;
   private static final float f_20695 = 1000.0F;
   private static final String f_20696 = "Корона";
   private static final String f_20697 = "Взрыв куба";
   private static final String f_20698 = "Доллар";
   private static final String f_20699 = "Сердце";
   private static final String f_20700 = "Молния";
   private static final String f_20701 = "Линия";
   private static final String f_20702 = "Ромб";
   private static final String f_20703 = "Снежинка";
   private static final String f_20704 = "Звезда";
   private static final String f_20705 = "Звезда 2";
   private static final String f_20706 = "Треугольник";
   private static final String f_20707 = "Свечение";
   private static final String f_20708 = "Рандом";
   private static final String f_20709 = "Тип 2";
   private static final String f_20710 = "Тип 2";
   private static final double f_20711 = 0.04;
   private static final double f_20712 = 200.0;
   private static final double f_20713 = 2.0;
   private static final float f_20714 = 0.01F;
   private static final float f_20715 = (float) (Math.PI / 180.0);
   private static final float f_20716 = 0.001F;
   private static final float f_20717 = 0.22F;
   private static final float f_20718 = 2.4F;
   private static final float f_20719 = 0.72F;
   private static final float f_20720 = 0.5F;
   private static final float f_20721 = 1.4142135F;
   private static final float f_20722 = 0.01F;
   private static final float f_20723 = 0.34F;
   private static final float f_20724 = 255.0F;
   private static final float f_20725 = 0.001F;
   private static final float f_20726 = 18.0F;
   private static final float f_20727 = 0.8F;
   private static final float f_20728 = 0.001F;
   private static final float f_20729 = 55.0F;
   private static final float f_20730 = 0.001F;
   private static final float f_20731 = 150.0F;
   private static final float f_20732 = 75.0F;
   private static final float f_20733 = 1.7F;
   private static final float f_20734 = 0.001F;
   private static final float f_20735 = 150.0F;
   private static final float f_20736 = 95.0F;
   private static final float f_20737 = 1.1F;
   private static final String f_20738 = "Sampler0";
   private static final float f_20739 = (float) (Math.PI / 180.0);
   private static final float f_20740 = (float) (Math.PI / 180.0);
   private static final float f_20741 = 0.5F;
   private static final float f_20742 = 255.0F;
   private static final float f_20743 = 255.0F;
   private static final float f_20744 = 255.0F;
   private static final float f_20745 = 255.0F;
   private static final String f_20746 = "worldParticles";
   private static final String f_20747 = "worldParticlesVertices";
   private static final String f_20748 = "Тип 2";
   private static final String f_20749 = "Тип 2";
   private static final String f_20750 = "Обычная";
   private static final String f_20751 = "Обычная";
   private static final float f_20752 = 1.5F;
   private static final float f_20753 = 2.25F;
   private static final float f_20754 = 3.375F;
   private static final float f_20755 = 0.7F;
   private static final float f_20756 = 0.45F;
   private static final float f_20757 = 0.28F;
   private static final int f_20758 = -41121;
   private static final int f_20759 = -9830517;
   private static final int f_20760 = -9901825;
   private static final int f_20761 = -9202689;
   private static final int f_20762 = -5018625;
   private static final int f_20763 = -35610;
   private static final int f_20764 = -10092590;

   private void m_6702() {
      this.f_20589.clear();
      this.f_20593 = null;
      this.f_20594 = null;

      for (int var1 = 0; var1 < this.f_20595.length; var1++) {
         this.f_20595[var1] = this.f_20596[var1] = var1 == 0 ? 1.0F : 0.0F;
      }
   }

   private void m_6703(BufferBuilder var1, Identifier var2, int var3) {
      MeshData var4 = var1.build();
      if (var4 != null) {
         if (var3 == 0) {
            var4.close();
         } else {
            GpuBuffer var5 = null;

            try {
               DrawState var6 = var4.drawState();
               int var7 = var6.indexCount();
               AutoStorageIndexBuffer var8 = RenderSystem.getSequentialBuffer(var6.primitiveTopology());
               GpuBuffer var9 = var8.getBuffer(var7);
               IndexType var10 = var8.type();
               var5 = RenderSystem.getDevice().createBuffer(() -> f_20747, 32, var4.vertexBuffer());
               RenderTarget var11 = f_11537.gameRenderer.mainRenderTarget();
               CommandEncoder var12 = RenderSystem.getDevice().createCommandEncoder();
               AbstractTexture var13 = f_11537.getTextureManager().getTexture(var2);
               RenderPass var14 = var12.createRenderPass(
                  () -> f_20746, var11.getColorTextureView(), Optional.empty(), var11.getDepthTextureView(), OptionalDouble.empty()
               );

               try {
                  RenderSystem.bindDefaultUniforms(var14);
                  var14.setPipeline(this.f_20590);
                  var14.bindTexture(f_20738, var13.getTextureView(), var13.getSampler());
                  var14.setVertexBuffer(0, var5.slice());
                  var14.setIndexBuffer(var9, var10);
                  var14.drawIndexed(var7, 1, 0, 0, 0);
               } catch (Throwable var22) {
                  if (var14 != null) {
                     try {
                        var14.close();
                     } catch (Throwable var21) {
                        var22.addSuppressed(var21);
                     }
                  }

                  throw var22;
               }

               if (var14 != null) {
                  var14.close();
               }
            } finally {
               if (var5 != null) {
                  var5.close();
               }

               var4.close();
            }
         }
      }
   }

   private void m_6705(BufferBuilder var1, Matrix4f var2, float var3, int var4) {
      float var5 = var3 * f_20741;
      float var6 = Class_BftdentXEtGbugJw.m_2309(var4) / f_20742;
      float var7 = Class_BftdentXEtGbugJw.m_2299(var4) / f_20743;
      float var8 = Class_BftdentXEtGbugJw.m_2308(var4) / f_20744;
      float var9 = Class_BftdentXEtGbugJw.m_2297(var4) / f_20745;
      var1.addVertex(var2, -var5, -var5, 0.0F).setUv(0.0F, 0.0F).setColor(var6, var7, var8, var9);
      var1.addVertex(var2, -var5, var5, 0.0F).setUv(0.0F, 1.0F).setColor(var6, var7, var8, var9);
      var1.addVertex(var2, var5, var5, 0.0F).setUv(1.0F, 1.0F).setColor(var6, var7, var8, var9);
      var1.addVertex(var2, var5, -var5, 0.0F).setUv(1.0F, 0.0F).setColor(var6, var7, var8, var9);
   }

   private void m_6706(
      BufferBuilder var1,
      Matrix4f var2,
      Matrix4f var3,
      Matrix4f var4,
      double var5,
      double var7,
      double var9,
      float var11,
      float var12,
      float var13,
      float var14,
      int var15
   ) {
      var4.set(var2).translate((float)var5, (float)var7, (float)var9).mul(var3).rotateZ((float)Math.toRadians(var12));
      if (var13 != 0.0F) {
         var4.rotateX(var13 * f_20739);
      }

      if (var14 != 0.0F) {
         var4.rotateY(var14 * f_20740);
      }

      this.m_6705(var1, var4, var11, var15);
   }

   private void m_6707(
      Identifier var1,
      WorldParticles.Class_6a9COkoS3NohmbgS var2,
      boolean var3,
      float var4,
      Vec3 var5,
      double var6,
      float var8,
      boolean var9,
      boolean var10,
      int var11,
      long var12,
      Matrix4f var14,
      Matrix4f var15,
      Matrix4f var16
   ) {
      BufferBuilder var17 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
      byte var18 = 0;
      float var19 = this.f_20576.m_8768();
      float var20 = Mth.lerp(var4, this.f_20596[1], this.f_20595[1]) * var19;
      float var21 = Mth.lerp(var4, this.f_20596[2], this.f_20595[2]);
      float var22 = Mth.lerp(var4, this.f_20596[3], this.f_20595[3]);
      float var23 = Mth.lerp(var4, this.f_20596[4], this.f_20595[4]) * var19;
      int var24 = !var3 && this.f_20580.m_7568(f_20710) ? this.m_6710() : 0;

      for (WorldParticles.aztZH0xs3t5tppSZ var26 : this.f_20589) {
         if (var2 == null || var26.f_20518 == var2) {
            double var27 = Mth.lerp(var4, var26.f_20508, var26.f_20505);
            double var29 = Mth.lerp(var4, var26.f_20509, var26.f_20506);
            double var31 = Mth.lerp(var4, var26.f_20510, var26.f_20507);
            double var33 = var27 - var5.x;
            double var35 = var29 - var5.y;
            double var37 = var31 - var5.z;
            double var39 = var33 * var33 + var35 * var35 + var37 * var37;
            if (!(var39 > var6) && !(var39 < f_20711)) {
               float var41 = var26.m_6695(var12);
               if (var9) {
                  var41 *= (float)((Math.sin((var12 - var26.m_6699()) / f_20712) + 1.0) / f_20713);
               }

               if (!(var41 <= f_20714)) {
                  float var42 = Mth.lerp(var4, var26.f_20524, var26.f_20523);
                  float var43 = var26.f_20519 * f_20715;
                  float var44 = var23 > f_20716 ? 1.0F + f_20717 * var23 * (float)Math.sin(var42 * f_20718 + var43) : 1.0F;
                  float var45 = var3 ? var26.f_20516 * var8 * f_20719 : var26.f_20516 * f_20720;
                  var45 *= var44;
                  var45 = Math.min(var45, var26.f_20521 * f_20721);
                  if (!(var45 <= f_20722)) {
                     float var46 = var3 ? var41 * f_20723 : var41;
                     int var47 = var26.m_6696(var11, var10);
                     var47 = Class_BftdentXEtGbugJw.m_2303(
                        Class_BftdentXEtGbugJw.m_2309(var47), Class_BftdentXEtGbugJw.m_2299(var47), Class_BftdentXEtGbugJw.m_2308(var47), f_20724 * var46
                     );
                     float var48 = var26.m_6692(var12);
                     if (var20 > f_20725) {
                        var48 += var20 * f_20726 * (float)Math.sin(var42 * f_20727 + var43);
                     }

                     if (var21 > f_20728) {
                        float var49 = var26.f_20519 + f_20729 * var19 * (float)Math.sin(var42 * 2.0F + var43);
                        var48 += Mth.wrapDegrees(var49 - var48) * var21;
                     }

                     float var57 = !var3 && var22 > f_20730 ? var22 * Math.min(f_20731, f_20732 * var19) * (float)Math.sin(var42 * f_20733 + var43) : 0.0F;
                     float var50 = !var3 && var22 > f_20734 ? var22 * Math.min(f_20735, f_20736 * var19) * (float)Math.cos(var42 * f_20737 + var43) : 0.0F;
                     this.m_6706(var17, var14, var15, var16, var33, var35, var37, var45, var48, var57, var50, var47);
                     var18 += 4;

                     for (int var51 = 0; var51 < var24; var51++) {
                        float var52 = var45 * f_20570[var51];
                        int var53 = Class_BftdentXEtGbugJw.m_2306(var47, var46 * f_20571[var51]);
                        if (Class_BftdentXEtGbugJw.m_2297(var53) != 0) {
                           this.m_6705(var17, var16, var52, var53);
                           var18 += 4;
                        }
                     }
                  }
               }
            }
         }
      }

      this.m_6703(var17, var1, var18);
   }

   private int m_6710() {
      return Math.clamp(Math.round(this.f_20582.m_8768()), 1, f_20570.length);
   }

   public WorldParticles() {
      super(f_20597, f_20598, Category.RENDER);
      this.f_20573 = new MultiChoiceSetting(
         f_20599,
         8,
         new Class_2ZaVm8TGDJ68TnJB(f_20600),
         new Class_2ZaVm8TGDJ68TnJB(f_20601),
         new Class_2ZaVm8TGDJ68TnJB(f_20602),
         new Class_2ZaVm8TGDJ68TnJB(f_20603),
         new Class_2ZaVm8TGDJ68TnJB(f_20604),
         new Class_2ZaVm8TGDJ68TnJB(f_20605),
         new Class_2ZaVm8TGDJ68TnJB(f_20606),
         new Class_2ZaVm8TGDJ68TnJB(f_20607),
         new Class_2ZaVm8TGDJ68TnJB(f_20608),
         new Class_2ZaVm8TGDJ68TnJB(f_20609),
         new Class_2ZaVm8TGDJ68TnJB(f_20610),
         new Class_2ZaVm8TGDJ68TnJB(f_20611),
         new Class_2ZaVm8TGDJ68TnJB(f_20612)
      );
      this.f_20574 = new MultiChoiceSetting(
         f_20613,
         new Class_2ZaVm8TGDJ68TnJB(f_20614),
         new Class_2ZaVm8TGDJ68TnJB(f_20615),
         new Class_2ZaVm8TGDJ68TnJB(f_20616),
         new Class_2ZaVm8TGDJ68TnJB(f_20617),
         new Class_2ZaVm8TGDJ68TnJB(f_20618)
      );
      this.f_20575 = new SliderSetting(f_20619, 1.0F, f_20620, f_20621).m_828(f_20622).m_822(() -> !this.f_20574.m_7568(f_20751));
      this.f_20576 = new SliderSetting(f_20623, 1.0F, f_20624, 2.0F).m_828(f_20625).m_822(() -> !this.f_20574.m_7568(f_20750));
      this.f_20577 = new SliderSetting(f_20626, f_20627, f_20628, f_20629).m_828(1.0F);
      this.f_20578 = new SliderSetting(f_20630, f_20631, 2.0F, f_20632).m_828(1.0F);
      this.f_20579 = new SliderSetting(f_20633, f_20634, f_20635, f_20636).m_828(f_20637);
      this.f_20580 = new MultiChoiceSetting(f_20638, new Class_2ZaVm8TGDJ68TnJB(f_20639), new Class_2ZaVm8TGDJ68TnJB(f_20640));
      this.f_20581 = new SliderSetting(f_20641, f_20642, f_20643, f_20644).m_828(f_20645).m_822(() -> !this.f_20580.m_7568(f_20749));
      this.f_20582 = new SliderSetting(f_20646, 2.0F, 1.0F, f_20647).m_828(1.0F).m_822(() -> this.f_20580.m_7568(f_20748));
      this.f_20583 = new SliderSetting(f_20648, f_20649, f_20650, f_20651).m_828(1.0F);
      this.f_20584 = new CheckboxSetting(f_20652, false);
      this.f_20585 = new CheckboxSetting(f_20653, false);
      this.f_20586 = new CheckboxSetting(f_20654, false);
      this.f_20587 = new CheckboxSetting(f_20655, true).m_822(() -> !this.f_20586.m_8768());
      this.f_20588 = new ColorSetting(f_20656, false, f_20657).m_822(() -> !this.f_20586.m_8768() && !this.f_20587.m_8768());
      this.f_20589 = new ArrayList<>();
      this.f_20590 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_20658)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_20659))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_20660))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.ADDITIVE)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2741(f_20661)
         .m_2722();
      this.f_20591 = this::m_6715;
      this.f_20592 = this::m_6713;
      this.f_20595 = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F};
      this.f_20596 = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F};
      this.m_795(
         this.f_20573,
         this.f_20574,
         this.f_20575,
         this.f_20576,
         this.f_20577,
         this.f_20578,
         this.f_20579,
         this.f_20580,
         this.f_20581,
         this.f_20582,
         this.f_20583,
         this.f_20584,
         this.f_20585,
         this.f_20586,
         this.f_20587,
         this.f_20588
      );
   }

   private WorldParticles.Class_6a9COkoS3NohmbgS m_6711() {
      return switch (this.f_20573.m_7564().m_1181()) {
         case f_20696 -> WorldParticles.Class_6a9COkoS3NohmbgS.CROWN;
         case f_20697 -> WorldParticles.Class_6a9COkoS3NohmbgS.CUBE_BLAST;
         case f_20698 -> WorldParticles.Class_6a9COkoS3NohmbgS.DOLLAR;
         case f_20699 -> WorldParticles.Class_6a9COkoS3NohmbgS.HEART;
         case f_20700 -> WorldParticles.Class_6a9COkoS3NohmbgS.LIGHTNING;
         case f_20701 -> WorldParticles.Class_6a9COkoS3NohmbgS.LINE;
         case f_20702 -> WorldParticles.Class_6a9COkoS3NohmbgS.RHOMBUS;
         case f_20703 -> WorldParticles.Class_6a9COkoS3NohmbgS.SNOWFLAKE;
         case f_20704 -> WorldParticles.Class_6a9COkoS3NohmbgS.STAR;
         case f_20705 -> WorldParticles.Class_6a9COkoS3NohmbgS.STAR_ALT;
         case f_20706 -> WorldParticles.Class_6a9COkoS3NohmbgS.TRIANGLE;
         case f_20707 -> WorldParticles.Class_6a9COkoS3NohmbgS.GLOW;
         case f_20708 -> WorldParticles.Class_6a9COkoS3NohmbgS.RANDOM;
         default -> WorldParticles.Class_6a9COkoS3NohmbgS.STAR;
      };
   }

   private void m_6713(Class_TZhU50s8XmBQCMP5 var1) {
      if (!this.f_20589.isEmpty() && f_11537.player != null) {
         WorldParticles.Class_6a9COkoS3NohmbgS var2 = this.f_20594;
         float var3 = var1.m_5005().getGameTimeDeltaPartialTick(true);
         Vec3 var4 = f_11537.gameRenderer.mainCamera().position();
         float var5 = f_11537.gameRenderer.mainCamera().yRot();
         float var6 = f_11537.gameRenderer.mainCamera().xRot();
         double var7 = this.f_20583.m_8768().floatValue();
         double var9 = var7 * var7;
         float var11 = this.f_20581.m_8768();
         boolean var12 = this.f_20585.m_8768();
         boolean var13 = this.f_20586.m_8768();
         int var14 = this.f_20587.m_8768() ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : this.f_20588.m_8768();
         long var15 = System.currentTimeMillis();
         Matrix4f var17 = var1.m_5006().last().pose();
         Matrix4f var18 = new Matrix4f().rotateY((float)Math.toRadians(-var5)).rotateX((float)Math.toRadians(var6));
         Matrix4f var19 = new Matrix4f();
         if (var2 == WorldParticles.Class_6a9COkoS3NohmbgS.RANDOM) {
            for (WorldParticles.Class_6a9COkoS3NohmbgS var23 : WorldParticles.Class_6a9COkoS3NohmbgS.f_20502) {
               this.m_6707(var23.f_20504, var23, false, var3, var4, var9, var11, var12, var13, var14, var15, var17, var18, var19);
            }
         } else if (var2 != null) {
            this.m_6707(var2.f_20504, var2, false, var3, var4, var9, var11, var12, var13, var14, var15, var17, var18, var19);
         }

         if (!this.f_20580.m_7568(f_20709)) {
            this.m_6707(WorldParticles.Class_6a9COkoS3NohmbgS.f_20503, null, true, var3, var4, var9, var11, var12, var13, var14, var15, var17, var18, var19);
         }
      }
   }

   private void m_6715(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null) {
         long var2 = System.currentTimeMillis();

         byte var4 = switch (this.f_20574.m_7564().m_1181()) {
            case f_20662 -> 1;
            case f_20663 -> 2;
            case f_20664 -> 3;
            case f_20665 -> 4;
            default -> 0;
         };

         for (int var21 = 0; var21 < this.f_20595.length; var21++) {
            this.f_20596[var21] = this.f_20595[var21];
            this.f_20595[var21] = this.f_20595[var21] + ((var21 == var4 ? 1 : 0) - this.f_20595[var21]) * f_20666;
         }

         float var22 = this.f_20576.m_8768();
         float var23 = 1.0F + f_20667 * var22 * this.f_20595[4];
         Vec3 var7 = f_11537.player.position();
         Vec3 var8 = this.f_20593 == null ? Vec3.ZERO : var7.subtract(this.f_20593);
         this.f_20593 = var7;
         WorldParticles.Class_6a9COkoS3NohmbgS var9 = this.m_6711();
         if (this.f_20594 != var9) {
            this.f_20589.clear();
            this.f_20594 = var9;
         }

         double var10 = this.f_20583.m_8768() + f_20668;
         double var12 = var10 * var10;
         float var14 = this.f_20580.m_7568(f_20669) ? f_20670 * f_20570[this.m_6710() - 1] : Math.max(f_20671, this.f_20581.m_8768() * f_20672);
         Iterator var15 = this.f_20589.iterator();

         while (var15.hasNext()) {
            WorldParticles.aztZH0xs3t5tppSZ var16 = (WorldParticles.aztZH0xs3t5tppSZ)var15.next();
            var16.m_6697(this.f_20584.m_8768(), var16.f_20516 * var14 * f_20673 * var23, this.f_20575.m_8768(), this.f_20595[1] * var22);
            if (var16.m_6698(var2) || var16.m_6701(var7) > var12) {
               var15.remove();
            }
         }

         int var24 = Math.round(this.f_20577.m_8768());
         if (this.f_20589.size() < var24) {
            double var17 = var8.horizontalDistance();
            int var19 = var17 > f_20674 ? 3 : (var17 > f_20675 ? 2 : 1);
            var19 = Math.min(var19, var24 - this.f_20589.size());

            for (int var20 = 0; var20 < var19; var20++) {
               this.m_6716(var7, var8, var17, var9, var2);
            }
         }
      } else {
         this.m_6702();
      }
   }

   private void m_6716(Vec3 var1, Vec3 var2, double var3, WorldParticles.Class_6a9COkoS3NohmbgS var5, long var6) {
      ThreadLocalRandom var8 = ThreadLocalRandom.current();
      WorldParticles.Class_6a9COkoS3NohmbgS var9 = var5 == WorldParticles.Class_6a9COkoS3NohmbgS.RANDOM ? WorldParticles.Class_6a9COkoS3NohmbgS.m_6691() : var5;
      int var10 = f_20572[var8.nextInt(f_20572.length)];
      float var11 = this.f_20579.m_8768();

      for (int var12 = 0; var12 < 8; var12++) {
         double var13 = f_20676 + var8.nextDouble() * Math.max(f_20677, this.f_20583.m_8768().floatValue() * f_20678);
         double var15 = var8.nextDouble(f_20679);
         double var17 = var1.x;
         double var19 = var1.z;
         if (var3 > f_20680) {
            double var21 = Math.max(var2.horizontalDistance(), f_20681);
            var17 += var2.x / var21 * var13 * f_20682;
            var19 += var2.z / var21 * var13 * f_20683;
            double var23 = Math.atan2(var2.z, var2.x);
            var15 = var23 + var8.nextDouble(f_20684, f_20685);
         }

         double var27 = var17 + Math.cos(var15) * var13;
         double var28 = var1.y - f_20686 + var8.nextDouble(f_20687);
         double var25 = var19 + Math.sin(var15) * var13;
         if (WorldParticles.aztZH0xs3t5tppSZ.m_6694(var27, var28, var25, var11 * f_20688)) {
            this.f_20589
               .add(
                  new WorldParticles.aztZH0xs3t5tppSZ(
                     var27,
                     var28,
                     var25,
                     var8.nextDouble(f_20689, f_20690),
                     var8.nextDouble(f_20691, f_20692),
                     var8.nextDouble(f_20693, f_20694),
                     var6,
                     (long)(this.f_20578.m_8768() * f_20695),
                     var11,
                     var10,
                     var9
                  )
               );
            return;
         }
      }
   }

   @Override
   public void m_732() {
      this.m_6702();
   }

   private enum Class_6a9COkoS3NohmbgS {
      CROWN("crown.png"),
      CUBE_BLAST("cubeblast1.png"),
      DOLLAR("dollar.png"),
      HEART("heart.png"),
      LIGHTNING("lightning.png"),
      LINE("line.png"),
      RHOMBUS("rhombus.png"),
      SNOWFLAKE("snowflake.png"),
      STAR("star.png"),
      STAR_ALT("star1.png"),
      TRIANGLE("triangle.png"),
      GLOW("glow.png"),
      RANDOM(null);

      public static final WorldParticles.Class_6a9COkoS3NohmbgS[] f_20502 = new WorldParticles.Class_6a9COkoS3NohmbgS[]{
         CROWN, CUBE_BLAST, DOLLAR, HEART, LIGHTNING, LINE, RHOMBUS, SNOWFLAKE, STAR, STAR_ALT, TRIANGLE, GLOW
      };
      public static final Identifier f_20503 = Identifier.fromNamespaceAndPath("dimasik", "textures/world/dashbloomsample.png");
      public final Identifier f_20504;

      Class_6a9COkoS3NohmbgS(String var3) {
         this.f_20504 = var3 == null ? null : Identifier.fromNamespaceAndPath("dimasik", "textures/world/" + var3);
      }

      public static WorldParticles.Class_6a9COkoS3NohmbgS m_6691() {
         return f_20502[ThreadLocalRandom.current().nextInt(f_20502.length)];
      }
   }

   private static final class aztZH0xs3t5tppSZ {
      public double f_20505;
      public double f_20506;
      public double f_20507;
      public double f_20508;
      public double f_20509;
      public double f_20510;
      public double f_20511;
      public double f_20512;
      public double f_20513;
      public final long f_20514;
      public final long f_20515;
      public final float f_20516;
      public final int f_20517;
      public final WorldParticles.Class_6a9COkoS3NohmbgS f_20518;
      public final float f_20519;
      public final float f_20520;
      public float f_20521;
      public int f_20522;
      public float f_20523;
      public float f_20524;
      public static final float f_20525 = 360.0F;
      public static final float f_20526 = 0.5F;
      public static final float f_20527 = 1.5F;
      public static final float f_20528 = 0.25F;
      public static final float f_20529 = 1.4142135F;
      public static final float f_20530 = 0.05F;
      public static final double f_20531 = 5.94E-4;
      public static final float f_20532 = 0.25F;
      public static final double f_20533 = 2.9701;
      public static final double f_20534 = 2.9701;
      public static final double f_20535 = 2.9701;
      public static final float f_20536 = 0.001F;
      public static final double f_20537 = Math.PI;
      public static final double f_20538 = 180.0;
      public static final double f_20539 = 0.9;
      public static final double f_20540 = 0.9;
      public static final double f_20541 = 0.8;
      public static final double f_20542 = 1.3;
      public static final double f_20543 = 1.3;
      public static final double f_20544 = 0.55;
      public static final double f_20545 = 0.7;
      public static final double f_20546 = 0.7;
      public static final double f_20547 = 0.65;
      public static final double f_20548 = -0.32;
      public static final double f_20549 = 0.003;
      public static final double f_20550 = 0.28;
      public static final double f_20551 = 0.012;
      public static final double f_20552 = 0.28;
      public static final double f_20553 = 0.88;
      public static final double f_20554 = 0.88;
      public static final double f_20555 = -0.32;
      public static final double f_20556 = 0.970299;
      public static final double f_20557 = 0.970299;
      public static final double f_20558 = 0.970299;
      public static final float f_20559 = 0.5F;
      public static final float f_20560 = 0.92F;
      public static final float f_20561 = 600.0F;
      public static final float f_20562 = 400.0F;
      public static final long f_20563 = 400L;
      public static final float f_20564 = 0.06F;
      public static final float f_20565 = 0.5F;
      public static final float f_20566 = -2.0F;
      public static final double f_20567 = 2.0;
      public static final float f_20568 = 0.5F;

      public float m_6692(long var1) {
         return this.f_20519 + this.f_20520 * (float)(var1 - this.f_20514) * f_20564;
      }

      public static float m_6693(double var0, double var2, double var4, float var6) {
         if (m_6694(var0, var2, var4, var6)) {
            return var6;
         }

         float var7 = 0.0F;
         float var8 = var6;

         for (int var9 = 0; var9 < 5; var9++) {
            float var10 = (var7 + var8) * f_20559;
            if (m_6694(var0, var2, var4, var10)) {
               var7 = var10;
            } else {
               var8 = var10;
            }
         }

         return var7 * f_20560;
      }

      public static boolean m_6694(double var0, double var2, double var4, double var6) {
         return Class_NzJrN63M7QBpmAbi.f_11537.level == null
            ? false
            : Class_NzJrN63M7QBpmAbi.f_11537.level.noCollision(new AABB(var0 - var6, var2 - var6, var4 - var6, var0 + var6, var2 + var6, var4 + var6));
      }

      public float m_6695(long var1) {
         long var3 = var1 - this.f_20514;
         float var5 = this.m_6700(Mth.clamp((float)var3 / f_20561, 0.0F, 1.0F));
         float var6 = 1.0F - this.m_6700(Mth.clamp((float)(var3 - this.f_20515) / f_20562, 0.0F, 1.0F));
         return var5 * var6;
      }

      public int m_6696(int var1, boolean var2) {
         return var2 ? this.f_20517 : var1;
      }

      public aztZH0xs3t5tppSZ(
         double var1,
         double var3,
         double var5,
         double var7,
         double var9,
         double var11,
         long var13,
         long var15,
         float var17,
         int var18,
         WorldParticles.Class_6a9COkoS3NohmbgS var19
      ) {
         this.f_20519 = ThreadLocalRandom.current().nextFloat() * f_20525;
         this.f_20520 = f_20526 + ThreadLocalRandom.current().nextFloat() * f_20527;
         this.f_20505 = this.f_20508 = var1;
         this.f_20506 = this.f_20509 = var3;
         this.f_20507 = this.f_20510 = var5;
         this.f_20511 = var7;
         this.f_20512 = var9;
         this.f_20513 = var11;
         this.f_20514 = var13;
         this.f_20515 = var15;
         this.f_20516 = var17;
         this.f_20517 = var18;
         this.f_20518 = var19;
         this.f_20521 = var17 * f_20528 * f_20529;
      }

      public void m_6697(boolean var1, float var2, float var3, float var4) {
         this.f_20508 = this.f_20505;
         this.f_20509 = this.f_20506;
         this.f_20510 = this.f_20507;
         this.f_20524 = this.f_20523;
         this.f_20523 = this.f_20523 + f_20530 * var3;
         if (var1) {
            this.f_20512 = this.f_20512 - f_20531;
         }

         double var5 = this.f_20516 * f_20532;
         double var7 = this.f_20511 * f_20533;
         double var9 = this.f_20512 * f_20534;
         double var11 = this.f_20513 * f_20535;
         if (var4 > f_20536) {
            double var13 = this.f_20519 * f_20537 / f_20538;
            var7 += (Math.sin(this.f_20523 * f_20539 + var13) - Math.sin(this.f_20524 * f_20540 + var13)) * f_20541 * var4;
            var9 += (Math.sin(this.f_20523 * f_20542 + var13) - Math.sin(this.f_20524 * f_20543 + var13)) * f_20544 * var4;
            var11 += (Math.cos(this.f_20523 * f_20545 + var13) - Math.cos(this.f_20524 * f_20546 + var13)) * f_20547 * var4;
         }

         if (m_6694(this.f_20505 + var7, this.f_20506 + var9, this.f_20507 + var11, var5)) {
            this.f_20505 += var7;
            this.f_20506 += var9;
            this.f_20507 += var11;
         } else {
            if (m_6694(this.f_20505 + var7, this.f_20506, this.f_20507, var5)) {
               this.f_20505 += var7;
            } else {
               this.f_20511 = this.f_20511 * f_20548;
            }

            if (m_6694(this.f_20505, this.f_20506 + var9, this.f_20507, var5)) {
               this.f_20506 += var9;
            } else {
               double var15 = Math.abs(this.f_20512);
               this.f_20512 = !(var9 < 0.0) || !var1 ? -this.f_20512 * f_20552 : (var15 > f_20549 ? Math.min(var15 * f_20550, f_20551) : 0.0);
               this.f_20511 = this.f_20511 * f_20553;
               this.f_20513 = this.f_20513 * f_20554;
            }

            if (m_6694(this.f_20505, this.f_20506, this.f_20507 + var11, var5)) {
               this.f_20507 += var11;
            } else {
               this.f_20513 = this.f_20513 * f_20555;
            }
         }

         this.f_20511 = this.f_20511 * f_20556;
         this.f_20512 = this.f_20512 * f_20557;
         this.f_20513 = this.f_20513 * f_20558;
         if (this.f_20522-- <= 0) {
            this.f_20521 = m_6693(this.f_20505, this.f_20506, this.f_20507, Math.max((float)var5, var2));
            this.f_20522 = 4;
         }
      }

      public boolean m_6698(long var1) {
         return var1 - this.f_20514 > this.f_20515 + f_20563;
      }

      public long m_6699() {
         return this.f_20514;
      }

      public float m_6700(float var1) {
         return var1 < f_20565 ? 2.0F * var1 * var1 : 1.0F - (float)Math.pow(f_20566 * var1 + 2.0F, f_20567) * f_20568;
      }

      public double m_6701(Vec3 var1) {
         double var2 = this.f_20505 - var1.x;
         double var4 = this.f_20506 - var1.y;
         double var6 = this.f_20507 - var1.z;
         return var2 * var2 + var4 * var4 + var6 * var6;
      }
   }
}
