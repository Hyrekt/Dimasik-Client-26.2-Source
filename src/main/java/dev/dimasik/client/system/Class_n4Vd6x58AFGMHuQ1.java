package dev.dimasik.client.system;

import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.IndexType;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.pipeline.TextureTarget;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.AutoStorageIndexBuffer;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.MeshData;
import com.mojang.blaze3d.vertex.MeshData.DrawState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Vector4f;

public final class Class_n4Vd6x58AFGMHuQ1 {
   private static final Identifier f_25563 = Identifier.fromNamespaceAndPath(Class_n4Vd6x58AFGMHuQ1.f_25605, Class_n4Vd6x58AFGMHuQ1.f_25606);
   private static final float[][] f_25564 = new float[][]{
      {Class_n4Vd6x58AFGMHuQ1.f_25607, Class_n4Vd6x58AFGMHuQ1.f_25608, Class_n4Vd6x58AFGMHuQ1.f_25609, 0.0F, 1.0F, 0.0F},
      {Class_n4Vd6x58AFGMHuQ1.f_25610, Class_n4Vd6x58AFGMHuQ1.f_25611, Class_n4Vd6x58AFGMHuQ1.f_25612, 0.0F, 1.0F, 0.0F},
      {Class_n4Vd6x58AFGMHuQ1.f_25613, Class_n4Vd6x58AFGMHuQ1.f_25614, Class_n4Vd6x58AFGMHuQ1.f_25615, 0.0F, 1.0F, 0.0F},
      {Class_n4Vd6x58AFGMHuQ1.f_25616, Class_n4Vd6x58AFGMHuQ1.f_25617, Class_n4Vd6x58AFGMHuQ1.f_25618, 0.0F, 1.0F, 0.0F},
      {Class_n4Vd6x58AFGMHuQ1.f_25619, Class_n4Vd6x58AFGMHuQ1.f_25620, Class_n4Vd6x58AFGMHuQ1.f_25621, 1.0F, 0.0F, 0.0F},
      {Class_n4Vd6x58AFGMHuQ1.f_25622, Class_n4Vd6x58AFGMHuQ1.f_25623, Class_n4Vd6x58AFGMHuQ1.f_25624, 1.0F, 0.0F, 0.0F},
      {Class_n4Vd6x58AFGMHuQ1.f_25625, Class_n4Vd6x58AFGMHuQ1.f_25626, Class_n4Vd6x58AFGMHuQ1.f_25627, 1.0F, 0.0F, 0.0F},
      {Class_n4Vd6x58AFGMHuQ1.f_25628, Class_n4Vd6x58AFGMHuQ1.f_25629, Class_n4Vd6x58AFGMHuQ1.f_25630, 1.0F, 0.0F, 0.0F},
      {Class_n4Vd6x58AFGMHuQ1.f_25631, Class_n4Vd6x58AFGMHuQ1.f_25632, Class_n4Vd6x58AFGMHuQ1.f_25633, 0.0F, 0.0F, 1.0F},
      {Class_n4Vd6x58AFGMHuQ1.f_25634, Class_n4Vd6x58AFGMHuQ1.f_25635, Class_n4Vd6x58AFGMHuQ1.f_25636, 0.0F, 0.0F, 1.0F},
      {Class_n4Vd6x58AFGMHuQ1.f_25637, Class_n4Vd6x58AFGMHuQ1.f_25638, Class_n4Vd6x58AFGMHuQ1.f_25639, 0.0F, 0.0F, 1.0F},
      {Class_n4Vd6x58AFGMHuQ1.f_25640, Class_n4Vd6x58AFGMHuQ1.f_25641, Class_n4Vd6x58AFGMHuQ1.f_25642, 0.0F, 0.0F, 1.0F}
   };
   private static final long f_25565 = 520L;
   private final List<Class_n4Vd6x58AFGMHuQ1.QfbCrxNSev29L19B> f_25566 = new ArrayList<>();
   private TextureTarget f_25567;
   private final RenderPipeline f_25568;
   private static final String f_25569 = "dimasik/hw_stan_bloom";
   private static final String f_25570 = "dead_chams";
   private static final String f_25571 = "dead_chams";
   private static final String f_25572 = "Sampler0";
   private static final float f_25573 = 520.0F;
   private static final float f_25574 = 0.025F;
   private static final float f_25575 = 0.92F;
   private static final float f_25576 = 30.0F;
   private static final float f_25577 = 30.0F;
   private static final float f_25578 = 30.0F;
   private static final float f_25579 = 0.045F;
   private static final float f_25580 = 0.001F;
   private static final float f_25581 = 0.001F;
   private static final float f_25582 = 255.0F;
   private static final float f_25583 = 255.0F;
   private static final float f_25584 = 255.0F;
   private static final float f_25585 = 255.0F;
   private static final float f_25586 = 0.5F;
   private static final float f_25587 = 0.5F;
   private static final float f_25588 = 0.5F;
   private static final float f_25589 = 0.5F;
   private static final float f_25590 = 0.5F;
   private static final float f_25591 = 0.5F;
   private static final float f_25592 = 0.5F;
   private static final float f_25593 = 0.5F;
   private static final float f_25594 = 6.0F;
   private static final float f_25595 = 15.0F;
   private static final float f_25596 = 10.0F;
   private static final float f_25597 = 5.5F;
   private static final float f_25598 = 0.72F;
   private static final float f_25599 = 1.05F;
   private static final String f_25600 = "Sampler0";
   private static final String f_25601 = "holy-world-stun-glow";
   private static final String f_25602 = "hwStanFx";
   private static final String f_25603 = "hwStanFx";
   private static final double f_25604 = 0.01;
   private static final String f_25605 = "dimasik";
   private static final String f_25606 = "images/fireflies/bloom.png";
   private static final float f_25607 = 15.0F;
   private static final float f_25608 = -15.0F;
   private static final float f_25609 = 15.0F;
   private static final float f_25610 = -15.0F;
   private static final float f_25611 = -15.0F;
   private static final float f_25612 = 15.0F;
   private static final float f_25613 = 15.0F;
   private static final float f_25614 = -15.0F;
   private static final float f_25615 = -15.0F;
   private static final float f_25616 = -15.0F;
   private static final float f_25617 = -15.0F;
   private static final float f_25618 = -15.0F;
   private static final float f_25619 = -15.0F;
   private static final float f_25620 = 15.0F;
   private static final float f_25621 = 15.0F;
   private static final float f_25622 = -15.0F;
   private static final float f_25623 = -15.0F;
   private static final float f_25624 = 15.0F;
   private static final float f_25625 = -15.0F;
   private static final float f_25626 = 15.0F;
   private static final float f_25627 = -15.0F;
   private static final float f_25628 = -15.0F;
   private static final float f_25629 = -15.0F;
   private static final float f_25630 = -15.0F;
   private static final float f_25631 = 15.0F;
   private static final float f_25632 = 15.0F;
   private static final float f_25633 = -15.0F;
   private static final float f_25634 = -15.0F;
   private static final float f_25635 = 15.0F;
   private static final float f_25636 = -15.0F;
   private static final float f_25637 = 15.0F;
   private static final float f_25638 = -15.0F;
   private static final float f_25639 = -15.0F;
   private static final float f_25640 = -15.0F;
   private static final float f_25641 = -15.0F;
   private static final float f_25642 = -15.0F;

   private void m_7640(CommandEncoder var1, RenderTarget var2, GpuBuffer var3, GpuBuffer var4, IndexType var5, int var6, AbstractTexture var7) {
      RenderPass var8 = var1.createRenderPass(() -> f_25602, var2.getColorTextureView(), Optional.empty(), var2.getDepthTextureView(), OptionalDouble.empty());

      try {
         RenderSystem.bindDefaultUniforms(var8);
         var8.setPipeline(this.f_25568);
         var8.bindTexture(f_25600, var7.getTextureView(), var7.getSampler());
         var8.setVertexBuffer(0, var3.slice());
         var8.setIndexBuffer(var4, var5);
         var8.drawIndexed(var6, 1, 0, 0, 0);
      } catch (Throwable var12) {
         if (var8 != null) {
            try {
               var8.close();
            } catch (Throwable var11) {
               var12.addSuppressed(var11);
            }
         }

         throw var12;
      }

      if (var8 != null) {
         var8.close();
      }
   }

   private int m_7642(
      BufferBuilder var1, Matrix4f var2, Vec3 var3, double var4, double var6, double var8, double var10, double var12, double var14, float var16, int var17
   ) {
      float var18 = (float)(Math.min(var4, var10) - var3.x);
      float var19 = (float)(Math.min(var6, var12) - var3.y);
      float var20 = (float)(Math.min(var8, var14) - var3.z);
      float var21 = (float)(Math.max(var4, var10) - var3.x);
      float var22 = (float)(Math.max(var6, var12) - var3.y);
      float var23 = (float)(Math.max(var8, var14) - var3.z);
      if (var21 - var18 >= f_25580) {
         var19 -= var16;
         var22 += var16;
         var20 -= var16;
         var23 += var16;
      } else if (var22 - var19 >= f_25581) {
         var18 -= var16;
         var21 += var16;
         var20 -= var16;
         var23 += var16;
      } else {
         var18 -= var16;
         var21 += var16;
         var19 -= var16;
         var22 += var16;
      }

      return this.m_7652(var1, var2, var18, var19, var20, var21, var22, var23, var17);
   }

   private void m_7643(int var1, int var2) {
      var1 = Math.max(1, var1);
      var2 = Math.max(1, var2);
      if (this.f_25567 == null) {
         this.f_25567 = new TextureTarget(f_25601, var1, var2, true, GpuFormat.RGBA8_UNORM);
      } else if (this.f_25567.width != var1 || this.f_25567.height != var2) {
         this.f_25567.resize(var1, var2);
      }
   }

   private static float m_7644(float var0) {
      return var0 * var0 * var0 * (var0 * (var0 * f_25594 - f_25595) + f_25596);
   }

   private int m_7645(
      BufferBuilder var1,
      Matrix4f var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16,
      float var17,
      float var18
   ) {
      var1.addVertex(var2, var3, var4, var5).setUv(f_25586, f_25587).setColor(var15, var16, var17, var18);
      var1.addVertex(var2, var6, var7, var8).setUv(f_25588, f_25589).setColor(var15, var16, var17, var18);
      var1.addVertex(var2, var9, var10, var11).setUv(f_25590, f_25591).setColor(var15, var16, var17, var18);
      var1.addVertex(var2, var12, var13, var14).setUv(f_25592, f_25593).setColor(var15, var16, var17, var18);
      return 4;
   }

   public void m_7646(Vec3 var1) {
      this.f_25566.removeIf(var1x -> var1x.center.distanceToSqr(var1) < f_25604);
      this.f_25566.add(new Class_n4Vd6x58AFGMHuQ1.QfbCrxNSev29L19B(var1, System.currentTimeMillis()));
   }

   private void m_7647(BufferBuilder var1, int var2) {
      MeshData var3 = var1.build();
      if (var3 != null) {
         if (var2 == 0) {
            var3.close();
         } else {
            GpuBuffer var4 = null;

            try {
               DrawState var5 = var3.drawState();
               int var6 = var5.indexCount();
               AutoStorageIndexBuffer var7 = RenderSystem.getSequentialBuffer(var5.primitiveTopology());
               GpuBuffer var8 = var7.getBuffer(var6);
               IndexType var9 = var7.type();
               var4 = RenderSystem.getDevice().createBuffer(() -> f_25603, 32, var3.vertexBuffer());
               RenderTarget var10 = Minecraft.getInstance().gameRenderer.mainRenderTarget();
               this.m_7643(var10.width, var10.height);
               CommandEncoder var11 = RenderSystem.getDevice().createCommandEncoder();
               var11.clearColorTexture(this.f_25567.getColorTexture(), new Vector4f(0.0F));
               this.f_25567.copyDepthFrom(var10);
               AbstractTexture var12 = Minecraft.getInstance().getTextureManager().getTexture(f_25563);
               this.m_7640(var11, this.f_25567, var4, var8, var9, var6, var12);
               Class_rG6KJzJWXQjNHCHC.m_8385(
                  this.f_25567, var10, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN), f_25597, f_25598, f_25599, true, 0.0F, 0, 0.0F
               );
               this.m_7640(RenderSystem.getDevice().createCommandEncoder(), var10, var4, var8, var9, var6, var12);
            } finally {
               if (var4 != null) {
                  var4.close();
               }

               var3.close();
            }
         }
      }
   }

   public Class_n4Vd6x58AFGMHuQ1() {
      this.f_25568 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_25569)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_25570))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_25571))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.ADDITIVE)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2741(f_25572)
         .m_2722();
   }

   public void m_7648() {
      this.f_25566.clear();
   }

   public void m_7649(Class_TZhU50s8XmBQCMP5 var1, List<Vec3> var2) {
      Minecraft var3 = Minecraft.getInstance();
      if (var3.player != null && var3.level != null) {
         if (!var2.isEmpty() || !this.f_25566.isEmpty()) {
            Vec3 var4 = var1.m_5010();
            Matrix4f var5 = var1.m_5006().last().pose();
            int var6 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
            BufferBuilder var7 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
            int var8 = 0;

            for (Vec3 var10 : var2) {
               var8 += this.m_7650(var7, var5, var4, var10, var6, 1.0F, 1.0F);
            }

            long var15 = System.currentTimeMillis();
            Iterator var11 = this.f_25566.iterator();

            while (var11.hasNext()) {
               Class_n4Vd6x58AFGMHuQ1.QfbCrxNSev29L19B var12 = (Class_n4Vd6x58AFGMHuQ1.QfbCrxNSev29L19B)var11.next();
               float var13 = Mth.clamp((float)(var15 - var12.startedAt) / f_25573, 0.0F, 1.0F);
               if (var13 >= 1.0F) {
                  var11.remove();
               } else {
                  float var14 = m_7644(var13);
                  var8 += this.m_7650(var7, var5, var4, var12.center, var6, 1.0F - var14, 1.0F - var14 * f_25574);
               }
            }

            this.m_7647(var7, var8);
         }
      } else {
         this.m_7648();
      }
   }

   private int m_7650(BufferBuilder var1, Matrix4f var2, Vec3 var3, Vec3 var4, int var5, float var6, float var7) {
      int var8 = 0;
      int var9 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN_TWO);

      for (int var10 = 0; var10 < f_25564.length; var10++) {
         float[] var11 = f_25564[var10];
         int var12 = Class_BftdentXEtGbugJw.m_2302(var5, var9, (float)var10 / (f_25564.length - 1));
         int var13 = Class_BftdentXEtGbugJw.m_2306(var12, f_25575 * var6);
         double var14 = var4.x + var11[0] * var7;
         double var16 = var4.y + var11[1] * var7;
         double var18 = var4.z + var11[2] * var7;
         double var20 = var14 + f_25576 * var11[3] * var7;
         double var22 = var16 + f_25577 * var11[4] * var7;
         double var24 = var18 + f_25578 * var11[5] * var7;
         var8 += this.m_7642(var1, var2, var3, var14, var16, var18, var20, var22, var24, f_25579, var13);
      }

      return var8;
   }

   private int m_7652(BufferBuilder var1, Matrix4f var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      float var10 = Class_BftdentXEtGbugJw.m_2309(var9) / f_25582;
      float var11 = Class_BftdentXEtGbugJw.m_2299(var9) / f_25583;
      float var12 = Class_BftdentXEtGbugJw.m_2308(var9) / f_25584;
      float var13 = Class_BftdentXEtGbugJw.m_2297(var9) / f_25585;
      int var14 = 0;
      var14 += this.m_7645(var1, var2, var3, var4, var5, var3, var7, var5, var3, var7, var8, var3, var4, var8, var10, var11, var12, var13);
      var14 += this.m_7645(var1, var2, var6, var4, var8, var6, var7, var8, var6, var7, var5, var6, var4, var5, var10, var11, var12, var13);
      var14 += this.m_7645(var1, var2, var3, var4, var8, var6, var4, var8, var6, var4, var5, var3, var4, var5, var10, var11, var12, var13);
      var14 += this.m_7645(var1, var2, var3, var7, var5, var6, var7, var5, var6, var7, var8, var3, var7, var8, var10, var11, var12, var13);
      var14 += this.m_7645(var1, var2, var6, var4, var5, var6, var7, var5, var3, var7, var5, var3, var4, var5, var10, var11, var12, var13);
      return var14 + this.m_7645(var1, var2, var3, var4, var8, var3, var7, var8, var6, var7, var8, var6, var4, var8, var10, var11, var12, var13);
   }

   private record QfbCrxNSev29L19B(Vec3 center, long startedAt) {
   }
}
