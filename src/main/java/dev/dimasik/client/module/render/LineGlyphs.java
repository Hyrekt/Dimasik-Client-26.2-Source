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
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
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
import java.util.Random;
import net.minecraft.client.Camera;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.util.Mth;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;

public class LineGlyphs extends Module {
   private static final Vec3i[] f_19703 = new Vec3i[]{
      new Vec3i(1, 0, 0), new Vec3i(-1, 0, 0), new Vec3i(0, 1, 0), new Vec3i(0, -1, 0), new Vec3i(0, 0, 1), new Vec3i(0, 0, -1)
   };
   private static final float f_19704 = 0.02F;
   private final SliderSetting f_19705;
   private final CheckboxSetting f_19706;
   private final CheckboxSetting f_19707;
   private final SliderSetting f_19708;
   private final Random f_19709;
   private final List<LineGlyphs.l0BiVcWgIvIOczNl> f_19710;
   private final List<LineGlyphs.l0BiVcWgIvIOczNl> f_19711;
   private final List<LineGlyphs.bquu4gHyAWIBCoHu> f_19712;
   private int f_19713;
   private final RenderPipeline f_19714;
   private final RenderPipeline f_19715;
   private final LineGlyphs.a6h3v5zeSbcWzdWo[] f_19716;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_19717;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_19718;
   private static final String f_19719 = "LineGlyphs";
   private static final String f_19720 = "Неоновые ломаные линии вокруг игрока";
   private static final String f_19721 = "Количество Линий";
   private static final float f_19722 = 70.0F;
   private static final float f_19723 = 5.0F;
   private static final float f_19724 = 200.0F;
   private static final float f_19725 = 5.0F;
   private static final String f_19726 = "Медленная Скорость";
   private static final String f_19727 = "Пунктирные Линии";
   private static final String f_19728 = "Шаг Пунктира";
   private static final float f_19729 = 3.0F;
   private static final float f_19730 = 0.5F;
   private static final float f_19731 = 20.0F;
   private static final float f_19732 = 0.5F;
   private static final long f_19733 = 93882L;
   private static final String f_19734 = "dimasik/line_glyphs_glow";
   private static final String f_19735 = "target_esp_crystal";
   private static final String f_19736 = "target_esp_crystal";
   private static final String f_19737 = "dimasik/line_glyphs_core";
   private static final String f_19738 = "target_esp_crystal";
   private static final String f_19739 = "target_esp_crystal";
   private static final float f_19740 = 4.0F;
   private static final float f_19741 = 0.08F;
   private static final float f_19742 = 2.5F;
   private static final float f_19743 = 0.15F;
   private static final float f_19744 = 1.5F;
   private static final float f_19745 = 0.25F;
   private static final float f_19746 = 0.01F;
   private static final float f_19747 = 0.04F;
   private static final float f_19748 = 0.08F;
   private static final float f_19749 = 0.85F;
   private static final float f_19750 = 0.01F;
   private static final float f_19751 = 0.25F;
   private static final float f_19752 = 1.75F;
   private static final float f_19753 = 0.018F;
   private static final float f_19754 = 0.01F;
   private static final float f_19755 = 0.25F;
   private static final float f_19756 = 1.75F;
   private static final float f_19757 = 255.0F;
   private static final double f_19758 = 1.0E-4;
   private static final float f_19759 = -135.0F;
   private static final float f_19760 = 135.0F;
   private static final float f_19761 = 0.02F;
   private static final float f_19762 = 0.5F;
   private static final double f_19763 = 1.0E-10;
   private static final double f_19764 = 0.5;
   private static final double f_19765 = 0.5;
   private static final double f_19766 = 0.5;
   private static final double f_19767 = 1.0E-8;
   private static final double f_19768 = 1.0E-8;
   private static final float f_19769 = 255.0F;
   private static final float f_19770 = 255.0F;
   private static final float f_19771 = 255.0F;
   private static final float f_19772 = 255.0F;
   private static final String f_19773 = "lineGlyphs";
   private static final String f_19774 = "lineGlyphsVertices";

   private void m_6497(List<LineGlyphs.bquu4gHyAWIBCoHu> var1, Vec3 var2, int var3, float var4) {
      var1.add(new LineGlyphs.bquu4gHyAWIBCoHu(var2.x - var4, var2.y, var2.z, var3));
      var1.add(new LineGlyphs.bquu4gHyAWIBCoHu(var2.x + var4, var2.y, var2.z, var3));
      var1.add(new LineGlyphs.bquu4gHyAWIBCoHu(var2.x, var2.y - var4, var2.z, var3));
      var1.add(new LineGlyphs.bquu4gHyAWIBCoHu(var2.x, var2.y + var4, var2.z, var3));
      var1.add(new LineGlyphs.bquu4gHyAWIBCoHu(var2.x, var2.y, var2.z - var4, var3));
      var1.add(new LineGlyphs.bquu4gHyAWIBCoHu(var2.x, var2.y, var2.z + var4, var3));
   }

   private void m_6498() {
      Iterator var1 = this.f_19710.iterator();

      while (var1.hasNext()) {
         LineGlyphs.l0BiVcWgIvIOczNl var2 = (LineGlyphs.l0BiVcWgIvIOczNl)var1.next();
         var2.m_6491();
         if (var2.m_6496()) {
            var1.remove();
         }
      }
   }

   private List<LineGlyphs.bquu4gHyAWIBCoHu> m_6499(List<LineGlyphs.l0BiVcWgIvIOczNl> var1, float var2, float var3) {
      boolean var4 = this.f_19707.m_8768();
      float var5 = Math.max(f_19747, this.f_19708.m_8768() * f_19748);
      float var6 = var5 * f_19749;
      List var7 = this.f_19712;
      var7.clear();

      for (LineGlyphs.l0BiVcWgIvIOczNl var9 : var1) {
         float var10 = var9.m_6495() * var3;
         if (!(var10 <= f_19750)) {
            List var11 = var9.f_19684;
            int var12 = var11.size();
            if (var12 >= 2) {
               for (int var13 = 0; var13 < var12 - 1; var13++) {
                  Vec3 var14 = (Vec3)var11.get(var13);
                  Vec3 var15 = (Vec3)var11.get(var13 + 1);
                  float var16 = var10 * (f_19751 + (float)var13 / var12 / f_19752);
                  int var17 = this.m_6513(var16);
                  if (var4) {
                     this.m_6500(var7, var14, var15, var17, var5, var6);
                  } else {
                     this.m_6515(var7, var14, var15, var17);
                  }
               }
            }
         }
      }

      float var18 = f_19753 * var2;

      for (LineGlyphs.l0BiVcWgIvIOczNl var20 : var1) {
         float var21 = var20.m_6495() * var3;
         if (!(var21 <= f_19754)) {
            List var22 = var20.f_19684;
            int var23 = var22.size();
            if (var23 >= 2) {
               for (int var24 = 0; var24 < var23; var24++) {
                  Vec3 var25 = (Vec3)var22.get(var24);
                  float var26 = var21 * (f_19755 + (float)var24 / var23 / f_19756);
                  int var27 = this.m_6513(var26);
                  this.m_6497(var7, var25, var27, var18);
               }
            }
         }
      }

      return var7;
   }

   private void m_6500(List<LineGlyphs.bquu4gHyAWIBCoHu> var1, Vec3 var2, Vec3 var3, int var4, float var5, float var6) {
      double var7 = var3.x - var2.x;
      double var9 = var3.y - var2.y;
      double var11 = var3.z - var2.z;
      double var13 = Math.sqrt(var7 * var7 + var9 * var9 + var11 * var11);
      if (!(var13 < f_19758)) {
         double var15 = var7 / var13;
         double var17 = var9 / var13;
         double var19 = var11 / var13;
         double var21 = 0.0;

         for (boolean var23 = true; var21 < var13; var23 = !var23) {
            double var24 = var23 ? var5 : var6;
            double var26 = Math.min(var13, var21 + var24);
            if (var23) {
               var1.add(new LineGlyphs.bquu4gHyAWIBCoHu(var2.x + var15 * var21, var2.y + var17 * var21, var2.z + var19 * var21, var4));
               var1.add(new LineGlyphs.bquu4gHyAWIBCoHu(var2.x + var15 * var26, var2.y + var17 * var26, var2.z + var19 * var26, var4));
            }

            var21 = var26;
         }
      }
   }

   @Override
   public void m_732() {
      this.f_19710.clear();
      this.f_19711.clear();
      this.f_19712.clear();
   }

   private boolean m_6503(Vec3i var1) {
      if (f_11537.level == null) {
         return true;
      } else {
         BlockPos var2 = new BlockPos(var1.getX(), var1.getY(), var1.getZ());
         BlockState var3 = f_11537.level.getBlockState(var2);
         if (var3.isAir()) {
            return true;
         } else {
            return !var3.getFluidState().isEmpty() ? false : var3.getCollisionShape(f_11537.level, var2).isEmpty();
         }
      }
   }

   private Vec3 m_6504() {
      Camera var1 = f_11537.gameRenderer.mainCamera();
      return var1 != null ? var1.position() : f_11537.player.position();
   }

   private void m_6505() {
      if (f_11537.player == null || f_11537.level == null) {
         this.f_19710.clear();
         this.f_19713 = -1;
      } else if (f_11537.player.tickCount != this.f_19713) {
         this.f_19713 = f_11537.player.tickCount;
         this.m_6498();
         this.m_6522();
      }
   }

   @Override
   public void m_778() {
      this.f_19710.clear();
      this.f_19711.clear();
      this.f_19712.clear();
      this.f_19713 = -1;
   }

   private void m_6506(List<LineGlyphs.bquu4gHyAWIBCoHu> var1, Matrix4f var2, Vec3 var3, float var4, RenderPipeline var5) {
      if (var1.size() >= 2) {
         float var6 = f_19761 * var4 * f_19762;
         BufferBuilder var7 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
         int var8 = 0;

         for (int var9 = 0; var9 + 1 < var1.size(); var9 += 2) {
            var8 += this.m_6511(var7, var2, var3, (LineGlyphs.bquu4gHyAWIBCoHu)var1.get(var9), (LineGlyphs.bquu4gHyAWIBCoHu)var1.get(var9 + 1), var6);
         }

         this.m_6523(var7, var8, var5);
      }
   }

   private float m_6507(float var1, float var2) {
      return var2 <= var1 ? var1 : var1 + this.f_19709.nextFloat() * (var2 - var1);
   }

   private static double m_6508(double var0, double var2, double var4) {
      return var0 + (var2 - var0) * var4;
   }

   private void m_6509(Class_TZhU50s8XmBQCMP5 var1) {
      this.f_19711.clear();
      this.f_19712.clear();
      if (f_11537.player != null && f_11537.level != null) {
         this.m_6505();
         float var2 = var1.m_5004();

         for (LineGlyphs.l0BiVcWgIvIOczNl var4 : this.f_19710) {
            if (var4.m_6495() > f_19746 && var4.m_6493() >= 2) {
               var4.m_6492(var2);
               this.f_19711.add(var4);
            }
         }

         if (!this.f_19711.isEmpty()) {
            Matrix4f var13 = var1.m_5006().last().pose();
            Vec3 var14 = var1.m_5010();

            try {
               for (LineGlyphs.a6h3v5zeSbcWzdWo var8 : this.f_19716) {
                  List var9 = this.m_6499(this.f_19711, var8.widthMul, var8.alphaMul);
                  this.m_6506(var9, var13, var14, var8.widthMul, var8.pipeline);
               }
            } finally {
               this.f_19711.clear();
               this.f_19712.clear();
            }
         }
      }
   }

   private void m_6510(Class_Xu9btcIeUN33XnMK var1) {
      this.m_6505();
   }

   private int m_6511(BufferBuilder var1, Matrix4f var2, Vec3 var3, LineGlyphs.bquu4gHyAWIBCoHu var4, LineGlyphs.bquu4gHyAWIBCoHu var5, float var6) {
      double var7 = var4.f_19676 - var3.x;
      double var9 = var4.f_19677 - var3.y;
      double var11 = var4.f_19678 - var3.z;
      double var13 = var5.f_19676 - var3.x;
      double var15 = var5.f_19677 - var3.y;
      double var17 = var5.f_19678 - var3.z;
      double var19 = var13 - var7;
      double var21 = var15 - var9;
      double var23 = var17 - var11;
      double var25 = var19 * var19 + var21 * var21 + var23 * var23;
      if (var25 < f_19763) {
         return 0;
      }

      double var27 = (var7 + var13) * f_19764;
      double var29 = (var9 + var15) * f_19765;
      double var31 = (var11 + var17) * f_19766;
      double var33 = var21 * var31 - var23 * var29;
      double var35 = var23 * var27 - var19 * var31;
      double var37 = var19 * var29 - var21 * var27;
      double var39 = Math.sqrt(var33 * var33 + var35 * var35 + var37 * var37);
      if (var39 < f_19767) {
         var33 = -var23;
         var35 = 0.0;
         var37 = var19;
         var39 = Math.sqrt(var33 * var33 + var37 * var37);
         if (var39 < f_19768) {
            var33 = var6;
            var35 = 0.0;
            var37 = 0.0;
            var39 = var6;
         }
      }

      float var41 = (float)(var6 / var39);
      float var42 = (float)(var33 * var41);
      float var43 = (float)(var35 * var41);
      float var44 = (float)(var37 * var41);
      float var45 = var4.f_19679 / f_19769;
      float var46 = var4.f_19680 / f_19770;
      float var47 = var4.f_19681 / f_19771;
      float var48 = var4.f_19682 / f_19772;
      var1.addVertex(var2, (float)var7 - var42, (float)var9 - var43, (float)var11 - var44).setUv(0.0F, 0.0F).setColor(var45, var46, var47, var48);
      var1.addVertex(var2, (float)var7 + var42, (float)var9 + var43, (float)var11 + var44).setUv(1.0F, 0.0F).setColor(var45, var46, var47, var48);
      var1.addVertex(var2, (float)var13 + var42, (float)var15 + var43, (float)var17 + var44).setUv(1.0F, 1.0F).setColor(var45, var46, var47, var48);
      var1.addVertex(var2, (float)var13 - var42, (float)var15 - var43, (float)var17 - var44).setUv(0.0F, 1.0F).setColor(var45, var46, var47, var48);
      return 4;
   }

   private Vec3i m_6512(Vec3i var1) {
      for (int var2 = 0; var2 < 12; var2++) {
         Vec3i var3 = this.m_6518();
         int var4 = var3.getX() * var1.getX() + var3.getY() * var1.getY() + var3.getZ() * var1.getZ();
         if (var4 == 0) {
            return var3;
         }
      }

      return this.m_6518();
   }

   private int m_6513(float var1) {
      int var2 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
      float var3 = Mth.clamp(var1, 0.0F, 1.0F);
      int var4 = var2 >> 16 & 0xFF;
      int var5 = var2 >> 8 & 0xFF;
      int var6 = var2 & 0xFF;
      int var7 = (int)(var3 * f_19757);
      return var7 << 24 | var4 << 16 | var5 << 8 | var6;
   }

   private float m_6514(int var1, int var2, float var3) {
      if (var1 <= 0) {
         return 1.0F;
      }

      float var4 = 1.0F - (var2 - var3) / var1;
      return Mth.clamp(var4, 0.0F, 1.0F);
   }

   private void m_6515(List<LineGlyphs.bquu4gHyAWIBCoHu> var1, Vec3 var2, Vec3 var3, int var4) {
      var1.add(new LineGlyphs.bquu4gHyAWIBCoHu(var2.x, var2.y, var2.z, var4));
      var1.add(new LineGlyphs.bquu4gHyAWIBCoHu(var3.x, var3.y, var3.z, var4));
   }

   private int m_6516() {
      return Math.max(1, Math.round(this.f_19705.m_8768()));
   }

   private int m_6517(int var1, int var2) {
      return var2 <= var1 ? var1 : this.f_19709.nextInt(var2 - var1) + var1;
   }

   public LineGlyphs() {
      super(f_19719, f_19720, Category.RENDER);
      this.f_19705 = new SliderSetting(f_19721, f_19722, f_19723, f_19724).m_828(f_19725);
      this.f_19706 = new CheckboxSetting(f_19726, false);
      this.f_19707 = new CheckboxSetting(f_19727, false);
      this.f_19708 = new SliderSetting(f_19728, f_19729, f_19730, f_19731).m_828(f_19732).m_822(() -> this.f_19707.m_8768());
      this.f_19709 = new Random(f_19733);
      this.f_19710 = new ArrayList<>();
      this.f_19711 = new ArrayList<>();
      this.f_19712 = new ArrayList<>();
      this.f_19713 = -1;
      this.f_19714 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_19734)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_19735))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_19736))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.ADDITIVE)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2722();
      this.f_19715 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_19737)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_19738))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_19739))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2722();
      this.f_19716 = new LineGlyphs.a6h3v5zeSbcWzdWo[]{
         new LineGlyphs.a6h3v5zeSbcWzdWo(f_19740, f_19741, this.f_19714),
         new LineGlyphs.a6h3v5zeSbcWzdWo(f_19742, f_19743, this.f_19714),
         new LineGlyphs.a6h3v5zeSbcWzdWo(f_19744, f_19745, this.f_19714),
         new LineGlyphs.a6h3v5zeSbcWzdWo(1.0F, 1.0F, this.f_19715)
      };
      this.f_19717 = this::m_6510;
      this.f_19718 = this::m_6509;
      this.m_795(this.f_19705, this.f_19706, this.f_19707, this.f_19708);
   }

   private Vec3i m_6518() {
      return f_19703[this.f_19709.nextInt(f_19703.length)];
   }

   private Vec3i m_6519() {
      Vec3 var1 = this.m_6504();

      for (int var2 = 0; var2 < 16; var2++) {
         int var3 = this.m_6517(6, 25);
         float var4 = f_11537.player != null ? f_11537.player.getYRot() : 0.0F;
         float var5 = var4 + this.m_6507(f_19759, f_19760);
         float var6 = (float)Math.toRadians(var5);
         int var7 = (int)(-(Mth.sin(var6) * var3));
         int var8 = this.m_6517(0, 13);
         int var9 = (int)(Mth.cos(var6) * var3);
         Vec3i var10 = new Vec3i((int)Math.floor(var1.x) + var7, (int)Math.floor(var1.y) + var8, (int)Math.floor(var1.z) + var9);
         if (this.m_6503(var10)) {
            return var10;
         }
      }

      return new Vec3i((int)Math.floor(var1.x), (int)Math.floor(var1.y), (int)Math.floor(var1.z));
   }

   private int m_6521() {
      int var1 = 0;

      for (LineGlyphs.l0BiVcWgIvIOczNl var3 : this.f_19710) {
         if (!var3.m_6494()) {
            var1++;
         }
      }

      return var1;
   }

   private void m_6522() {
      int var1 = this.m_6516();

      int var2;
      for (var2 = this.m_6521(); var2 < var1; var2++) {
         this.f_19710.add(new LineGlyphs.l0BiVcWgIvIOczNl(this.m_6519(), this.m_6517(7, 13)));
      }

      if (var2 > var1) {
         for (LineGlyphs.l0BiVcWgIvIOczNl var4 : this.f_19710) {
            if (var2 <= var1) {
               break;
            }

            if (!var4.m_6494()) {
               var4.m_6490();
               var2--;
            }
         }
      }
   }

   private void m_6523(BufferBuilder var1, int var2, RenderPipeline var3) {
      MeshData var4 = var1.build();
      if (var4 != null) {
         if (var2 == 0) {
            var4.close();
         } else {
            GpuBuffer var5 = null;

            try {
               DrawState var6 = var4.drawState();
               int var7 = var6.indexCount();
               AutoStorageIndexBuffer var8 = RenderSystem.getSequentialBuffer(var6.primitiveTopology());
               GpuBuffer var9 = var8.getBuffer(var7);
               IndexType var10 = var8.type();
               var5 = RenderSystem.getDevice().createBuffer(() -> f_19774, 32, var4.vertexBuffer());
               RenderTarget var11 = f_11537.gameRenderer.mainRenderTarget();
               CommandEncoder var12 = RenderSystem.getDevice().createCommandEncoder();
               RenderPass var13 = var12.createRenderPass(
                  () -> f_19773, var11.getColorTextureView(), Optional.empty(), var11.getDepthTextureView(), OptionalDouble.empty()
               );

               try {
                  RenderSystem.bindDefaultUniforms(var13);
                  var13.setPipeline(var3);
                  var13.setVertexBuffer(0, var5.slice());
                  var13.setIndexBuffer(var9, var10);
                  var13.drawIndexed(var7, 1, 0, 0, 0);
               } catch (Throwable var21) {
                  if (var13 != null) {
                     try {
                        var13.close();
                     } catch (Throwable var20) {
                        var21.addSuppressed(var20);
                     }
                  }

                  throw var21;
               }

               if (var13 != null) {
                  var13.close();
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

   private record a6h3v5zeSbcWzdWo(float widthMul, float alphaMul, RenderPipeline pipeline) {
   }

   private static class bquu4gHyAWIBCoHu {
      public final double f_19676;
      public final double f_19677;
      public final double f_19678;
      public final int f_19679;
      public final int f_19680;
      public final int f_19681;
      public final int f_19682;

      public bquu4gHyAWIBCoHu(double var1, double var3, double var5, int var7) {
         this.f_19676 = var1;
         this.f_19677 = var3;
         this.f_19678 = var5;
         this.f_19682 = var7 >> 24 & 0xFF;
         this.f_19679 = var7 >> 16 & 0xFF;
         this.f_19680 = var7 >> 8 & 0xFF;
         this.f_19681 = var7 & 0xFF;
      }
   }

   private class l0BiVcWgIvIOczNl {
      public final List<Vec3i> f_19683 = new ArrayList<>();
      public final List<Vec3> f_19684 = new ArrayList<>();
      public Vec3i f_19685;
      public int f_19686;
      public int f_19687;
      public int f_19688;
      public boolean f_19689;
      public final long f_19690 = System.currentTimeMillis();
      public long f_19691;
      public static final double f_19693 = 0.5;
      public static final double f_19694 = 0.5;
      public static final double f_19695 = 0.5;
      public static final double f_19696 = 0.5;
      public static final double f_19697 = 0.5;
      public static final double f_19698 = 0.5;
      public static final float f_19699 = 0.33F;
      public static final float f_19700 = 400.0F;
      public static final float f_19701 = 600.0F;
      public static final float f_19702 = 0.03F;

      public void m_6490() {
         if (!this.f_19689) {
            this.f_19689 = true;
            this.f_19691 = System.currentTimeMillis();
         }
      }

      public void m_6491() {
         if (!this.f_19689) {
            if (this.f_19688 <= 0) {
               this.m_6490();
            } else if (this.f_19686 > 0) {
               this.f_19686 = this.f_19686 - (LineGlyphs.this.f_19706.m_8768() ? 1 : 2);
               if (this.f_19686 < 0) {
                  this.f_19686 = 0;
               }
            } else {
               Vec3i var1 = this.f_19683.get(this.f_19683.size() - 1);
               boolean var2 = false;

               for (int var3 = 0; var3 < 8; var3++) {
                  Vec3i var4 = LineGlyphs.this.m_6512(this.f_19685);
                  int var5 = LineGlyphs.this.m_6517(1, 4);
                  Vec3i var6 = new Vec3i(var1.getX() + var4.getX() * var5, var1.getY() + var4.getY() * var5, var1.getZ() + var4.getZ() * var5);
                  if (LineGlyphs.this.m_6503(var6)) {
                     this.f_19685 = var4;
                     this.f_19687 = var5;
                     this.f_19686 = var5;
                     this.f_19683.add(var6);
                     this.f_19688--;
                     var2 = true;
                     break;
                  }
               }

               if (!var2) {
                  this.m_6490();
               }
            }
         }
      }

      public void m_6492(float var1) {
         this.f_19684.clear();
         float var2 = LineGlyphs.this.m_6514(this.f_19687, this.f_19686, var1);

         for (int var3 = 0; var3 < this.f_19683.size(); var3++) {
            Vec3i var4 = this.f_19683.get(var3);
            double var5 = var4.getX() + f_19693;
            double var7 = var4.getY() + f_19694;
            double var9 = var4.getZ() + f_19695;
            if (this.f_19683.size() >= 2 && var3 == this.f_19683.size() - 1) {
               Vec3i var11 = this.f_19683.get(this.f_19683.size() - 2);
               var5 = LineGlyphs.m_6508(var11.getX() + f_19696, var5, var2);
               var7 = LineGlyphs.m_6508(var11.getY() + f_19697, var7, var2);
               var9 = LineGlyphs.m_6508(var11.getZ() + f_19698, var9, var2);
            }

            this.f_19684.add(new Vec3(var5, var7, var9));
         }
      }

      public int m_6493() {
         return this.f_19683.size();
      }

      public boolean m_6494() {
         return this.f_19689;
      }

      public float m_6495() {
         float var1 = LineGlyphs.this.f_19706.m_8768() ? f_19699 : 1.0F;
         if (this.f_19689) {
            long var4 = System.currentTimeMillis() - this.f_19691;
            return Math.max(0.0F, 1.0F - (float)var4 * var1 / f_19700);
         } else {
            long var2 = System.currentTimeMillis() - this.f_19690;
            return Math.min(1.0F, (float)var2 * var1 / f_19701);
         }
      }

      public l0BiVcWgIvIOczNl(Vec3i var2, int var3) {
         this.f_19683.add(var2);
         this.f_19685 = LineGlyphs.this.m_6518();
         this.f_19688 = var3;
         this.m_6491();
      }

      public boolean m_6496() {
         return this.f_19689 && this.m_6495() <= f_19702;
      }
   }
}
