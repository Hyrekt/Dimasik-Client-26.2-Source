package dev.dimasik.client.module.render;

import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.BlendFactor;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_B6JOzHnwhU3pe4AO;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.mixin.RenderPipelinesMixin;
import dev.dimasik.mixin.RenderTypeMixin;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import net.minecraft.client.Camera;
import net.minecraft.client.renderer.rendertype.RenderSetup;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;

public class Invoker extends Module {
   private static final Identifier f_25653 = Identifier.fromNamespaceAndPath(Invoker.f_25768, Invoker.f_25769);
   private static final BlendFunction f_25654 = new BlendFunction(BlendFactor.SRC_ALPHA, BlendFactor.ONE);
   private static final int f_25655 = 3;
   private static final int f_25656 = 10;
   private static final int f_25657 = 16;
   private static final int f_25658 = 640;
   private static final float f_25659 = 0.1F;
   private static final float f_25660 = 1.0F;
   private static final float f_25661 = 380.0F;
   private static final float[] f_25662 = new float[]{0.0F, Invoker.f_25770, Invoker.f_25771};
   private static final float[] f_25663 = new float[]{1.0F, Invoker.f_25772, Invoker.f_25773};
   private static final float[] f_25664 = new float[]{Invoker.f_25774, Invoker.f_25775, Invoker.f_25776};
   private static final float[] f_25665 = new float[]{Invoker.f_25777, 1.0F, 1.0F};
   private static final float f_25666 = 0.8627451F;
   private static final float[] f_25667 = new float[640];
   private static final float[] f_25668 = new float[640];
   private static final float[] f_25669 = new float[640];
   private static final float[] f_25670 = new float[640];
   private static final RenderPipeline f_25671;
   public static final RenderType f_25672;
   private static final RenderPipeline f_25673;
   public static final RenderType f_25674;
   private final CheckboxSetting f_25675;
   private final CheckboxSetting f_25676;
   private final CheckboxSetting f_25677;
   private final CheckboxSetting f_25678;
   private final MultiChoiceSetting f_25679;
   private final SliderSetting f_25680;
   private final SliderSetting f_25681;
   private final Map<UUID, ArrayDeque<Invoker.MdcGsR4hnlG2Dhwm>[]> f_25682;
   private final Set<UUID> f_25683;
   private final Invoker.nk0ay91tkv3AeClv[] f_25684;
   private int f_25685;
   private final int[] f_25686;
   private final float[] f_25687;
   private final float[] f_25688;
   private long f_25689;
   private boolean f_25690;
   private int f_25691;
   private float f_25692;
   private float f_25693;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_25694;
   private final Class_gEPk7yDw6CwIte87<Class_B6JOzHnwhU3pe4AO> f_25695;
   private static final float f_25696 = 0.1F;
   private static final float f_25697 = 0.1F;
   private static final float f_25698 = 0.1F;
   private static final double f_25699 = 0.56;
   private static final double f_25700 = 0.44;
   private static final double f_25701 = 0.65;
   private static final double f_25702 = 0.35;
   private static final String f_25703 = "Invoker";
   private static final String f_25704 = "Три сферы вокруг игрока";
   private static final String f_25705 = "Себя";
   private static final String f_25706 = "Других";
   private static final String f_25707 = "От первого лица";
   private static final String f_25708 = "Каст";
   private static final String f_25709 = "След";
   private static final String f_25710 = "None";
   private static final String f_25711 = "Trail";
   private static final String f_25712 = "Fire";
   private static final String f_25713 = "Длина следа";
   private static final float f_25714 = 40.0F;
   private static final float f_25715 = 6.0F;
   private static final float f_25716 = 48.0F;
   private static final String f_25717 = "Сила следа";
   private static final float f_25718 = 0.7F;
   private static final float f_25719 = 0.3F;
   private static final float f_25720 = 0.1F;
   private static final long f_25721 = -1L;
   private static final long f_25722 = -1L;
   private static final float f_25723 = 380.0F;
   private static final float f_25724 = 1.70158F;
   private static final String f_25725 = "None";
   private static final String f_25726 = "Fire";
   private static final long f_25727 = 1000000L;
   private static final float f_25728 = 1000.0F;
   private static final float f_25729 = 0.12F;
   private static final float f_25730 = 0.88F;
   private static final float f_25731 = 2.1F;
   private static final double f_25732 = 0.08F;
   private static final float f_25733 = 3.0F;
   private static final float f_25734 = 1.2F;
   private static final float f_25735 = 0.1F;
   private static final float f_25736 = 2.8F;
   private static final double f_25737 = 0.085;
   private static final float f_25738 = 0.45F;
   private static final float f_25739 = 2.1F;
   private static final double f_25740 = 0.08F;
   private static final float f_25741 = 3.0F;
   private static final float f_25742 = 1.2F;
   private static final float f_25743 = 0.1F;
   private static final float f_25744 = 2.8F;
   private static final double f_25745 = 0.085;
   private static final float f_25746 = 0.01F;
   private static final float f_25747 = 0.02F;
   private static final float f_25748 = 0.8627451F;
   private static final float f_25749 = 0.01F;
   private static final float f_25750 = 0.02F;
   private static final float f_25751 = 0.6F;
   private static final float f_25752 = 0.534902F;
   private static final float f_25753 = 0.09F;
   private static final float f_25754 = 0.64F;
   private static final float f_25755 = 0.09F;
   private static final float f_25756 = 0.55F;
   private static final float f_25757 = 0.02F;
   private static final float f_25758 = 0.5F;
   private static final float f_25759 = 0.01F;
   private static final float f_25760 = 0.5176471F;
   private static final float f_25761 = 0.74509805F;
   private static final float f_25762 = 0.25490198F;
   private static final float f_25763 = 0.48000002F;
   private static final float f_25764 = 0.55F;
   private static final float f_25765 = 0.7F;
   private static final String f_25766 = "None";
   private static final String f_25767 = "None";
   private static final String f_25768 = "dimasik";
   private static final String f_25769 = "images/particles/bloom.png";
   private static final float f_25770 = (float) (Math.PI * 2.0 / 3.0);
   private static final float f_25771 = (float) (Math.PI * 4.0 / 3.0);
   private static final float f_25772 = 0.2509804F;
   private static final float f_25773 = 0.54901963F;
   private static final float f_25774 = 0.32156864F;
   private static final float f_25775 = 0.8235294F;
   private static final float f_25776 = 0.3529412F;
   private static final float f_25777 = 0.14117648F;
   private static final double f_25778 = 10.0;
   private static final double f_25779 = Math.PI;
   private static final double f_25780 = Math.PI / 2;
   private static final double f_25781 = 10.0;
   private static final double f_25782 = Math.PI;
   private static final double f_25783 = Math.PI / 2;
   private static final double f_25784 = 16.0;
   private static final double f_25785 = Math.PI;
   private static final double f_25786 = 2.0;
   private static final double f_25787 = 16.0;
   private static final double f_25788 = Math.PI;
   private static final double f_25789 = 2.0;
   private static final String f_25790 = "dimasik/pipeline/invoker_sphere";
   private static final String f_25791 = "target_esp_crystal";
   private static final String f_25792 = "target_esp_crystal";
   private static final String f_25793 = "dimasik_invoker_sphere";
   private static final String f_25794 = "dimasik/pipeline/invoker_bloom";
   private static final String f_25795 = "dead_chams";
   private static final String f_25796 = "dead_chams";
   private static final String f_25797 = "Sampler0";
   private static final String f_25798 = "dimasik_invoker_bloom";
   private static final String f_25799 = "Sampler0";

   private float m_7654() {
      return this.f_25689 < 0L ? 1.0F : Mth.clamp((float)(System.currentTimeMillis() - this.f_25689) / f_25723, 0.0F, 1.0F);
   }

   private void m_7655(VertexConsumer var1, Matrix4f var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (!(var6 < f_25757)) {
         for (int var11 = 0; var11 < 640; var11++) {
            float var12 = f_25670[var11];
            var1.addVertex(var2, var3 + f_25667[var11] * var6, var4 + f_25668[var11] * var6, var5 + f_25669[var11] * var6)
               .setUv(0.0F, 0.0F)
               .setColor(var7 * var12, var8 * var12, var9 * var12, var10);
         }
      }
   }

   private void m_7657(VertexConsumer var1, PoseStack var2, double var3, double var5, double var7, float var9, float var10, float var11, boolean var12) {
      for (int var13 = 0; var13 < this.f_25685; var13++) {
         Invoker.nk0ay91tkv3AeClv var14 = this.f_25684[var13];
         ArrayDeque[] var15 = this.f_25682.get(var14.f_25646);
         if (var15 != null && var14.f_25647 >= 0) {
            ArrayDeque var16 = var15[var14.f_25647];
            if (!var16.isEmpty()) {
               int var17 = var16.size();
               int var18 = 0;
               float var19 = f_25663[var14.f_25648];
               float var20 = f_25664[var14.f_25648];
               float var21 = f_25665[var14.f_25648];

               for (Invoker.MdcGsR4hnlG2Dhwm var23 : (Iterable<Invoker.MdcGsR4hnlG2Dhwm>) (Iterable) var16) {
                  float var24 = (float)(var23.f_25643 - var3);
                  float var25 = (float)(var23.f_25644 - var5);
                  float var26 = (float)(var23.f_25645 - var7);
                  float var27 = m_7665(var24, var25, var26);
                  if (var27 <= f_25759) {
                     var18++;
                  } else {
                     float var28 = var17 <= 1 ? 0.0F : (float)var18 / (var17 - 1);
                     float var29 = (1.0F - var28) * (1.0F - var28);
                     float var30 = Mth.clamp(f_25760 * var29 * var11 * var27, 0.0F, 1.0F);
                     float var31 = var19;
                     float var32 = var20;
                     float var33 = var21;
                     if (var12) {
                        var31 = Math.min(1.0F, Mth.lerp(var29, var31, 1.0F));
                        var32 = Math.min(1.0F, Mth.lerp(var29, var32, f_25761));
                        var33 = Math.min(1.0F, Mth.lerp(var29, var33, f_25762));
                     }

                     this.m_7663(var1, var2, var24, var25, var26, var9, var10, f_25763 * (f_25764 + f_25765 * var29), var31, var32, var33, var30);
                     var18++;
                  }
               }
            }
         }
      }
   }

   private void m_7658(Class_B6JOzHnwhU3pe4AO var1) {
      if (this.f_25678.m_8768() && f_11537.player != null && f_11537.gui.screen() == null) {
         if (var1.m_2116() == 1) {
            byte var2 = switch (var1.m_2117()) {
               case 65 -> 1;
               case 68 -> 2;
               case 87 -> 0;
               default -> -1;
            };
            if (var2 >= 0) {
               this.m_7661(var2);
            }
         }
      }
   }

   private void m_7659(UUID var1, int var2, double var3, double var5, double var7, int var9) {
      ArrayDeque[] var10 = this.f_25682.computeIfAbsent(var1, var0 -> m_7660());
      ArrayDeque var11 = var10[var2];
      Invoker.MdcGsR4hnlG2Dhwm var12 = var11.size() >= var9 ? (Invoker.MdcGsR4hnlG2Dhwm)var11.removeLast() : null;
      if (var12 == null) {
         var12 = new Invoker.MdcGsR4hnlG2Dhwm();
      }

      var12.f_25643 = var3;
      var12.f_25644 = var5;
      var12.f_25645 = var7;
      var11.addFirst(var12);

      while (var11.size() > var9) {
         var11.removeLast();
      }
   }

   private static ArrayDeque<Invoker.MdcGsR4hnlG2Dhwm>[] m_7660() {
      ArrayDeque[] var0 = new ArrayDeque[3];

      for (int var1 = 0; var1 < 3; var1++) {
         var0[var1] = new ArrayDeque();
      }

      return var0;
   }

   private void m_7661(int var1) {
      float var2 = m_7670(this.m_7654());
      float[] var3 = new float[3];
      float[] var4 = new float[3];

      for (int var5 = 0; var5 < 3; var5++) {
         var3[var5] = Mth.lerp(var2, this.f_25687[var5], f_25662[var5]);
         var4[var5] = Mth.lerp(var2, this.f_25688[var5], 1.0F);
      }

      this.f_25691 = this.f_25686[0];
      this.f_25692 = var3[0];
      this.f_25693 = var4[0];
      this.f_25687[0] = var3[1];
      this.f_25687[1] = var3[2];
      this.f_25687[2] = f_25662[2];
      this.f_25688[0] = var4[1];
      this.f_25688[1] = var4[2];
      this.f_25688[2] = 0.0F;
      this.f_25686[0] = this.f_25686[1];
      this.f_25686[1] = this.f_25686[2];
      this.f_25686[2] = var1;
      this.f_25690 = true;
      this.f_25689 = System.currentTimeMillis();
   }

   @Override
   public void m_732() {
      this.f_25682.clear();
      this.f_25686[0] = 0;
      this.f_25686[1] = 1;
      this.f_25686[2] = 2;
      this.m_7664();
      super.m_732();
   }

   private void m_7662(Class_TZhU50s8XmBQCMP5 var1) {
      if (f_11537.player != null && f_11537.level != null) {
         float var2 = var1.m_5005().getGameTimeDeltaPartialTick(true);
         Vec3 var3 = var1.m_5010();
         Camera var4 = f_11537.gameRenderer.mainCamera();
         PoseStack var5 = var1.m_5006();
         Matrix4f var6 = var5.last().pose();
         boolean var7 = f_11537.options.getCameraType().isFirstPerson();
         boolean var8 = !this.f_25679.m_7568(f_25725);
         boolean var9 = this.f_25679.m_7568(f_25726);
         int var10 = this.f_25680.m_8768().intValue();
         float var11 = this.f_25681.m_8768();
         float var12 = (float)(System.currentTimeMillis() % f_25727) / f_25728;
         double var13 = var3.x;
         double var15 = var3.y;
         double var17 = var3.z;
         float var19 = var4.yRot();
         float var20 = var4.xRot();
         this.f_25683.clear();
         this.f_25685 = 0;

         for (Player var22 : f_11537.level.players()) {
            if (var22 != null && !var22.isSpectator()) {
               boolean var23 = var22 == f_11537.player;
               if (var23 ? this.f_25675.m_8768() && (!var7 || this.f_25677.m_8768()) : this.f_25676.m_8768()) {
                  UUID var24 = var22.getUUID();
                  this.f_25683.add(var24);
                  double var25 = Mth.lerp(var2, var22.xo, var22.getX());
                  double var27 = Mth.lerp(var2, var22.yo, var22.getY());
                  double var29 = Mth.lerp(var2, var22.zo, var22.getZ());
                  float var31 = Mth.lerp(var2, var22.yBodyRotO, var22.yBodyRot);
                  double var32 = Math.toRadians(var31);
                  double var34 = var27 + var22.getBbHeight();
                  float var36 = this.f_25678.m_8768() && var23 ? m_7670(this.m_7654()) : 1.0F;
                  float var37 = this.f_25678.m_8768() && var23 ? m_7671(this.m_7654()) : 1.0F;

                  for (int var38 = 0; var38 < 3 && this.f_25685 < this.f_25684.length; var38++) {
                     float var39 = f_25662[var38];
                     float var40 = 1.0F;
                     float var41 = 1.0F;
                     if (this.f_25678.m_8768() && var23) {
                        var39 = Mth.lerp(var36, this.f_25687[var38], f_25662[var38]);
                        var40 = Mth.lerp(var36, this.f_25688[var38], 1.0F);
                        if (this.f_25690 && var38 == 2) {
                           var41 = f_25729 + f_25730 * var37;
                        }
                     }

                     float var42 = 1.0F * var40 * (1.0F + (float)(Math.sin(var12 * f_25731 + var39) * f_25732));
                     float var43 = var12 * 2.0F + var39 + (float)var32;
                     float var44 = (float)Math.sin(var43 * f_25733 + var12 * f_25734);
                     double var45 = var25 + Math.cos(var43) * var42;
                     double var47 = var34 + var44 * f_25735 * var40 + Math.sin(var12 * f_25736 + var39) * f_25737 * var40;
                     double var49 = var29 + Math.sin(var43) * var42;
                     if (var8 && var40 > f_25738) {
                        this.m_7659(var24, var38, var45, var47, var49, var10);
                     }

                     Invoker.nk0ay91tkv3AeClv var51 = this.f_25684[this.f_25685++];
                     var51.f_25646 = var24;
                     var51.f_25647 = var38;
                     var51.f_25648 = this.f_25678.m_8768() && var23 ? this.f_25686[var38] : var38;
                     var51.f_25649 = var41;
                     var51.f_25650 = var45;
                     var51.f_25651 = var47;
                     var51.f_25652 = var49;
                  }

                  if (this.f_25678.m_8768() && var23 && this.f_25691 >= 0 && var36 < 1.0F && this.f_25685 < this.f_25684.length) {
                     float var64 = Mth.lerp(var36, this.f_25693, 0.0F);
                     float var65 = this.f_25692;
                     float var66 = 1.0F * var64 * (1.0F + (float)(Math.sin(var12 * f_25739 + var65) * f_25740));
                     float var67 = var12 * 2.0F + var65 + (float)var32;
                     float var68 = (float)Math.sin(var67 * f_25741 + var12 * f_25742);
                     Invoker.nk0ay91tkv3AeClv var69 = this.f_25684[this.f_25685++];
                     var69.f_25646 = var24;
                     var69.f_25647 = -1;
                     var69.f_25648 = this.f_25691;
                     var69.f_25649 = 1.0F - var36;
                     var69.f_25650 = var25 + Math.cos(var67) * var66;
                     var69.f_25651 = var34 + var68 * f_25743 * var64 + Math.sin(var12 * f_25744 + var65) * f_25745 * var64;
                     var69.f_25652 = var29 + Math.sin(var67) * var66;
                  }
               }
            }
         }

         this.f_25682.keySet().removeIf(var1x -> !this.f_25683.contains(var1x));
         if (this.m_7654() >= 1.0F) {
            this.f_25690 = false;
            this.f_25691 = -1;
         }

         if (this.f_25685 != 0) {
            VertexConsumer var52 = var1.m_5008().m_881(f_25672);

            for (int var53 = 0; var53 < this.f_25685; var53++) {
               Invoker.nk0ay91tkv3AeClv var55 = this.f_25684[var53];
               float var57 = (float)(var55.f_25650 - var13);
               float var59 = (float)(var55.f_25651 - var15);
               float var26 = (float)(var55.f_25652 - var17);
               float var62 = m_7665(var57, var59, var26);
               if (!(var62 <= f_25746) && !(var55.f_25649 < f_25747)) {
                  this.m_7655(
                     var52, var6, var57, var59, var26, var55.f_25649, f_25663[var55.f_25648], f_25664[var55.f_25648], f_25665[var55.f_25648], f_25748 * var62
                  );
               }
            }

            VertexConsumer var54 = var1.m_5008().m_881(f_25674);

            for (int var56 = 0; var56 < this.f_25685; var56++) {
               Invoker.nk0ay91tkv3AeClv var58 = this.f_25684[var56];
               float var60 = (float)(var58.f_25650 - var13);
               float var61 = (float)(var58.f_25651 - var15);
               float var63 = (float)(var58.f_25652 - var17);
               float var28 = m_7665(var60, var61, var63);
               if (!(var28 <= f_25749) && !(var58.f_25649 < f_25750)) {
                  this.m_7663(
                     var54,
                     var5,
                     var60,
                     var61,
                     var63,
                     var19,
                     var20,
                     f_25751 * var58.f_25649,
                     f_25663[var58.f_25648],
                     f_25664[var58.f_25648],
                     f_25665[var58.f_25648],
                     f_25752 * var28
                  );
               }
            }

            if (var8) {
               this.m_7657(var54, var5, var13, var15, var17, var19, var20, var11, var9);
            }
         }
      }
   }

   public Invoker() {
      super(f_25703, f_25704, Category.RENDER);
      this.f_25675 = new CheckboxSetting(f_25705, true);
      this.f_25676 = new CheckboxSetting(f_25706, false);
      this.f_25677 = new CheckboxSetting(f_25707, false);
      this.f_25678 = new CheckboxSetting(f_25708, false);
      this.f_25679 = new MultiChoiceSetting(
         f_25709, new Class_2ZaVm8TGDJ68TnJB(f_25710), new Class_2ZaVm8TGDJ68TnJB(f_25711), new Class_2ZaVm8TGDJ68TnJB(f_25712)
      );
      this.f_25680 = new SliderSetting(f_25713, f_25714, f_25715, f_25716).m_828(1.0F).m_822(() -> !this.f_25679.m_7568(f_25767));
      this.f_25681 = new SliderSetting(f_25717, f_25718, f_25719, 2.0F).m_828(f_25720).m_822(() -> !this.f_25679.m_7568(f_25766));
      this.f_25682 = new HashMap<>();
      this.f_25683 = new HashSet<>();
      this.f_25684 = new Invoker.nk0ay91tkv3AeClv[96];
      this.f_25686 = new int[]{0, 1, 2};
      this.f_25687 = new float[]{f_25662[0], f_25662[1], f_25662[2]};
      this.f_25688 = new float[]{1.0F, 1.0F, 1.0F};
      this.f_25689 = f_25721;
      this.f_25691 = -1;
      this.f_25694 = this::m_7662;
      this.f_25695 = this::m_7658;
      this.m_795(this.f_25675, this.f_25676, this.f_25677, this.f_25678, this.f_25679, this.f_25680, this.f_25681);

      for (int var1 = 0; var1 < this.f_25684.length; var1++) {
         this.f_25684[var1] = new Invoker.nk0ay91tkv3AeClv();
      }
   }

   private void m_7663(
      VertexConsumer var1,
      PoseStack var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12
   ) {
      float var13 = var8 * f_25758;
      var2.pushPose();
      var2.translate(var3, var4, var5);
      var2.mulPose(Axis.YP.rotationDegrees(-var6));
      var2.mulPose(Axis.XP.rotationDegrees(var7));
      Matrix4f var14 = var2.last().pose();
      var1.addVertex(var14, -var13, var13, 0.0F).setUv(0.0F, 1.0F).setColor(var9, var10, var11, var12);
      var1.addVertex(var14, var13, var13, 0.0F).setUv(1.0F, 1.0F).setColor(var9, var10, var11, var12);
      var1.addVertex(var14, var13, -var13, 0.0F).setUv(1.0F, 0.0F).setColor(var9, var10, var11, var12);
      var1.addVertex(var14, -var13, -var13, 0.0F).setUv(0.0F, 0.0F).setColor(var9, var10, var11, var12);
      var2.popPose();
   }

   private void m_7664() {
      for (int var1 = 0; var1 < 3; var1++) {
         this.f_25687[var1] = f_25662[var1];
         this.f_25688[var1] = 1.0F;
      }

      this.f_25689 = f_25722;
      this.f_25690 = false;
      this.f_25691 = -1;
   }

   static {
      int var0 = 0;

      for (int var1 = 0; var1 < 10; var1++) {
         double var2 = var1 / f_25778 * f_25779 - f_25780;
         double var4 = (var1 + 1) / f_25781 * f_25782 - f_25783;

         for (int var6 = 0; var6 < 16; var6++) {
            double var7 = var6 / f_25784 * f_25785 * f_25786;
            double var9 = (var6 + 1) / f_25787 * f_25788 * f_25789;
            var0 = m_7668(var0, var2, var7);
            var0 = m_7668(var0, var4, var7);
            var0 = m_7668(var0, var4, var9);
            var0 = m_7668(var0, var2, var9);
         }
      }

      f_25671 = RenderPipelinesMixin.register(
         Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
            .m_2726(f_25790)
            .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_25791))
            .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_25792))
            .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
            .m_2737(true)
            .m_2725(true)
            .m_2732(BlendFunction.TRANSLUCENT)
            .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
            .m_2722()
      );
      f_25672 = RenderTypeMixin.create(f_25793, RenderSetup.builder(f_25671).createRenderSetup());
      f_25673 = RenderPipelinesMixin.register(
         Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
            .m_2726(f_25794)
            .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_25795))
            .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_25796))
            .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
            .m_2737(false)
            .m_2725(false)
            .m_2732(f_25654)
            .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
            .m_2741(f_25797)
            .m_2722()
      );
      f_25674 = RenderTypeMixin.create(f_25798, RenderSetup.builder(f_25673).withTexture(f_25799, f_25653).createRenderSetup());
   }

   private static float m_7665(float var0, float var1, float var2) {
      float var3 = var0 * var0 + var1 * var1 + var2 * var2;
      if (var3 < f_25753) {
         return 0.0F;
      } else {
         return var3 >= f_25754 ? 1.0F : (var3 - f_25755) / f_25756;
      }
   }

   private static int m_7668(int var0, double var1, double var3) {
      float var5 = (float)(Math.cos(var3) * Math.cos(var1));
      float var6 = (float)Math.sin(var1);
      float var7 = (float)(Math.sin(var3) * Math.cos(var1));
      f_25667[var0] = var5 * f_25696;
      f_25668[var0] = var6 * f_25697;
      f_25669[var0] = var7 * f_25698;
      f_25670[var0] = (float)Mth.clamp(f_25699 + f_25700 * Math.max(0.0, var6 * f_25701 + var7 * f_25702), 0.0, 1.0);
      return var0 + 1;
   }

   private static float m_7670(float var0) {
      var0 = Mth.clamp(var0, 0.0F, 1.0F);
      float var1 = 1.0F - var0;
      return 1.0F - var1 * var1 * var1;
   }

   private static float m_7671(float var0) {
      var0 = Mth.clamp(var0, 0.0F, 1.0F);
      float var1 = f_25724;
      float var2 = var1 + 1.0F;
      float var3 = var0 - 1.0F;
      return 1.0F + var2 * var3 * var3 * var3 + var1 * var3 * var3;
   }

   private static final class MdcGsR4hnlG2Dhwm {
      public double f_25643;
      public double f_25644;
      public double f_25645;

      public MdcGsR4hnlG2Dhwm() {
      }
   }

   private static final class nk0ay91tkv3AeClv {
      public UUID f_25646;
      public int f_25647;
      public int f_25648;
      public float f_25649;
      public double f_25650;
      public double f_25651;
      public double f_25652;

      public nk0ay91tkv3AeClv() {
      }
   }
}
