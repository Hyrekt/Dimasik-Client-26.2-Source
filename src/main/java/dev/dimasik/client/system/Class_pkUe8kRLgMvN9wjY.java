package dev.dimasik.client.system;

import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.ProjectionType;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.shaders.UniformType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import net.minecraft.client.renderer.SubmitNodeStorage;
import net.minecraft.client.renderer.item.TrackingItemStackRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.Mth;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.AABB;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;

public class Class_pkUe8kRLgMvN9wjY implements Class_NzJrN63M7QBpmAbi, Class_b8v0o2NnCtANmOp9 {
   private final SubmitNodeStorage f_28803 = new SubmitNodeStorage();
   private static final int f_28804 = 256;
   private static final int f_28805 = 600;
   private final RenderPipeline f_28806;
   private final CommandEncoder f_28807;
   private final Class_JVVLGT9hzxM6kEZe f_28808;
   private final Map<Class_pkUe8kRLgMvN9wjY.prObGRgMEEtFwb8l, Class_pkUe8kRLgMvN9wjY.k8yaGhpgiepif0os> f_28809;
   private int f_28810;
   private static final String f_28811 = "dimasik/item_stack";
   private static final String f_28812 = "texture";
   private static final String f_28813 = "texture";
   private static final String f_28814 = "Forms";
   private static final String f_28815 = "Colors";
   private static final String f_28816 = "Scissors";
   private static final String f_28817 = "Sampler0";
   private static final String f_28818 = "dimasik item projection";
   private static final float f_28819 = -1000.0F;
   private static final float f_28820 = 1000.0F;
   private static final float f_28821 = 0.004F;
   private static final float f_28822 = 0.004F;
   private static final float f_28823 = 10.0F;
   private static final float f_28824 = 10.0F;
   private static final float f_28825 = 10.0F;
   private static final float f_28826 = 0.004F;
   private static final float f_28827 = 1.0E-4F;
   private static final float f_28828 = 16.0F;
   private static final float f_28829 = 1.0E-4F;
   private static final float f_28830 = 16.0F;
   private static final float f_28831 = 8.0F;
   private static final float f_28832 = 8.0F;
   private static final float f_28833 = 8.0F;
   private static final float f_28834 = 8.0F;
   private static final float f_28835 = 0.5F;
   private static final float f_28836 = 0.5F;
   private static final float f_28837 = -8.0F;
   private static final float f_28838 = -8.0F;
   private static final double f_28839 = 16.0;
   private static final double f_28840 = 16.0;
   private static final double f_28841 = 16.0;
   private static final double f_28842 = 16.0;
   private static final double f_28843 = 16.0;
   private static final double f_28844 = 16.0;
   private static final double f_28845 = 16.0;
   private static final double f_28846 = 16.0;
   private static final float f_28847 = 8.0F;
   private static final float f_28848 = 8.0F;
   private static final float f_28849 = 16.0F;
   private static final float f_28850 = 10.0F;
   private static final float f_28851 = 10.0F;
   private static final float f_28852 = 10.0F;
   private static final int f_28853 = 15728880;
   private static final float f_28854 = -1.0F;
   private static final float f_28855 = 0.001F;
   private static final String f_28856 = "Sampler0";
   private static final float f_28857 = 255.0F;
   private static final String f_28858 = "Forms";
   private static final String f_28859 = "Colors";
   private static final String f_28860 = "Scissors";
   private static final int f_28861 = Integer.MAX_VALUE;
   private static final String f_28862 = "itemStackPass";
   private static final String f_28863 = "dimasik item depth";
   private static final String f_28864 = "dimasik item";

   public void m_8204() {
      for (Class_pkUe8kRLgMvN9wjY.k8yaGhpgiepif0os var2 : this.f_28809.values()) {
         this.m_8213(var2);
      }

      this.f_28809.clear();
   }

   private Class_pkUe8kRLgMvN9wjY.k8yaGhpgiepif0os m_8205(ItemStack var1, int var2) {
      return this.m_8208(var1, var2, ItemDisplayContext.GUI, 0, 0, 0);
   }

   private void m_8206() {
      Class_pkUe8kRLgMvN9wjY.prObGRgMEEtFwb8l var1 = null;
      int var2 = f_28861;

      for (Entry var4 : this.f_28809.entrySet()) {
         if (((Class_pkUe8kRLgMvN9wjY.k8yaGhpgiepif0os)var4.getValue()).f_28802 < var2) {
            var2 = ((Class_pkUe8kRLgMvN9wjY.k8yaGhpgiepif0os)var4.getValue()).f_28802;
            var1 = (Class_pkUe8kRLgMvN9wjY.prObGRgMEEtFwb8l)var4.getKey();
         }
      }

      if (var1 != null) {
         this.m_8213(this.f_28809.remove(var1));
      }
   }

   public void m_8207(ItemStack var1, float var2, float var3, float var4, float var5) {
      if (!var1.isEmpty() && !(var4 <= 0.0F) && !(var5 <= 0.0F) && !(Class_Ssh31B3ljfKeWsvS.m_4821() <= f_28826) && !this.m_5994(var2, var3, var4, var5)) {
         TrackingItemStackRenderState var6 = new TrackingItemStackRenderState();
         f_11537.getItemModelResolver().updateForTopItem(var6, var1, ItemDisplayContext.GUI, f_11537.level, f_11537.player, 0);
         if (!var6.isEmpty()) {
            AABB var7 = var6.getModelBoundingBox();
            float var8 = Math.max(f_28827, (float)var7.getXsize() * f_28828);
            float var9 = Math.max(f_28829, (float)var7.getYsize() * f_28830);
            float var10 = Math.min(var4 / var8, var5 / var9);
            if (Float.isFinite(var10)) {
               int var11 = Math.clamp(Mth.ceil(var10), 1, 8);
               Class_pkUe8kRLgMvN9wjY.k8yaGhpgiepif0os var12 = this.m_8214(var6, var11, ItemDisplayContext.GUI, 0, 0, 0, true);
               if (var12 != null) {
                  float var13 = f_28831 + (float)(var7.minX + var7.maxX) * f_28832;
                  float var14 = f_28833 - (float)(var7.minY + var7.maxY) * f_28834;
                  this.m_8215(
                     var12,
                     var2 + var4 * f_28835 + (var12.f_28796 - var13) * var10,
                     var3 + var5 * f_28836 + (var12.f_28797 - var14) * var10,
                     var12.f_28798 * var10,
                     var12.f_28799 * var10,
                     var10,
                     var11
                  );
               }
            }
         }
      }
   }

   private Class_pkUe8kRLgMvN9wjY.k8yaGhpgiepif0os m_8208(ItemStack var1, int var2, ItemDisplayContext var3, int var4, int var5, int var6) {
      TrackingItemStackRenderState var7 = new TrackingItemStackRenderState();
      f_11537.getItemModelResolver().updateForTopItem(var7, var1, var3, f_11537.level, f_11537.player, 0);
      return var7.isEmpty() ? null : this.m_8214(var7, var2, var3, var4, var5, var6, false);
   }

   public GpuTextureView m_8210(ItemStack var1, float var2) {
      if (!var1.isEmpty() && !(var2 <= 0.0F)) {
         Class_pkUe8kRLgMvN9wjY.k8yaGhpgiepif0os var3 = this.m_8205(var1, Math.clamp(Mth.ceil(var2), 1, 8));
         return var3 == null ? null : var3.f_28791;
      } else {
         return null;
      }
   }

   public void m_8211(ItemStack var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      if (!var1.isEmpty() && !(var4 <= 0.0F) && !(Class_Ssh31B3ljfKeWsvS.m_4821() <= f_28822)) {
         int var8 = Math.clamp(Mth.ceil(var4), 1, 8);
         Class_pkUe8kRLgMvN9wjY.k8yaGhpgiepif0os var9 = this.m_8208(
            var1, var8, ItemDisplayContext.FIRST_PERSON_RIGHT_HAND, Math.round(var5 * f_28823), Math.round(var6 * f_28824), Math.round(var7 * f_28825)
         );
         if (var9 != null) {
            this.m_8215(var9, var2 + var9.f_28796 * var4, var3 + var9.f_28797 * var4, var9.f_28798 * var4, var9.f_28799 * var4, var4, var8);
         }
      }
   }

   private void m_8213(Class_pkUe8kRLgMvN9wjY.k8yaGhpgiepif0os var1) {
      if (var1 != null) {
         if (var1.f_28791 != null) {
            var1.f_28791.close();
         }

         if (var1.f_28790 != null) {
            var1.f_28790.close();
         }

         if (var1.f_28793 != null) {
            var1.f_28793.close();
         }

         if (var1.f_28792 != null) {
            var1.f_28792.close();
         }

         var1.f_28790 = null;
         var1.f_28791 = null;
         var1.f_28792 = null;
         var1.f_28793 = null;
      }
   }

   public Class_pkUe8kRLgMvN9wjY() {
      this.f_28806 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_28811)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_28812))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_28813))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2739(DefaultVertexFormat.POSITION_TEX, PrimitiveTopology.QUADS)
         .m_2729(f_28814, UniformType.UNIFORM_BUFFER)
         .m_2729(f_28815, UniformType.UNIFORM_BUFFER)
         .m_2729(f_28816, UniformType.UNIFORM_BUFFER)
         .m_2732(BlendFunction.TRANSLUCENT_PREMULTIPLIED_ALPHA)
         .m_2741(f_28817)
         .m_2722();
      this.f_28807 = RenderSystem.getDevice().createCommandEncoder();
      this.f_28808 = new Class_JVVLGT9hzxM6kEZe(f_28818, f_28819, f_28820, true);
      this.f_28809 = new HashMap<>();
   }

   private Class_pkUe8kRLgMvN9wjY.k8yaGhpgiepif0os m_8214(
      TrackingItemStackRenderState var1, int var2, ItemDisplayContext var3, int var4, int var5, int var6, boolean var7
   ) {
      Class_pkUe8kRLgMvN9wjY.prObGRgMEEtFwb8l var8 = new Class_pkUe8kRLgMvN9wjY.prObGRgMEEtFwb8l(var1.getModelIdentity(), var2, var3, var4, var5, var6, var7);
      Class_pkUe8kRLgMvN9wjY.k8yaGhpgiepif0os var9 = this.f_28809.get(var8);
      if (var9 == null || var9.f_28800 && var9.f_28801 != this.f_28810) {
         var9 = this.m_8216(var1, var9, var8, var2);
      }

      if (var9 == null) {
         return null;
      }

      var9.f_28802 = this.f_28810;
      return var9;
   }

   private void m_8215(Class_pkUe8kRLgMvN9wjY.k8yaGhpgiepif0os var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      if (!this.m_5994(var2, var3, var4, var5)) {
         Class_PoKta0VE7AdhY1En var8 = Class_PoKta0VE7AdhY1En.m_4161();
         BufferBuilder var9 = var8.m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX);
         float var10 = 2.0F / f_11537.getWindow().getScreenWidth() * var4;
         float var11 = 2.0F / f_11537.getWindow().getScreenHeight() * var5;
         float var12 = f_28854 + var2 * 2.0F / f_11537.getWindow().getScreenWidth();
         float var13 = 1.0F - var3 * 2.0F / f_11537.getWindow().getScreenHeight() - var11;
         var9.addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var12, var13, 0.0F).setUv(0.0F, 0.0F);
         var9.addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var12 + var10, var13, 0.0F).setUv(1.0F, 0.0F);
         var9.addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var12 + var10, var13 + var11, 0.0F).setUv(1.0F, 1.0F);
         var9.addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var12, var13 + var11, 0.0F).setUv(0.0F, 1.0F);
         RenderPass var14 = this.f_28807.createRenderPass(() -> f_28862, f_11537.gameRenderer.mainRenderTarget().getColorTextureView(), Optional.empty());
         RenderSystem.bindDefaultUniforms(var14);
         boolean var15 = Math.abs(var6 - var7) < f_28855;
         var14.bindTexture(f_28856, var1.f_28791, RenderSystem.getSamplerCache().getClampToEdge(var15 ? FilterMode.NEAREST : FilterMode.LINEAR));
         MemoryStack var19 = MemoryStack.stackPush();

         try {
            ByteBuffer var20 = Std140Builder.onStack(var19, 32).putVec4(new Vector4f(0.0F)).putVec2(var5, var4).putFloat(0.0F).get();
            float var21 = Class_Ssh31B3ljfKeWsvS.m_4821() / f_28857;
            Vector4f var22 = new Vector4f(var21, var21, var21, var21);
            ByteBuffer var23 = Std140Builder.onStack(var19, 64).putVec4(var22).putVec4(var22).putVec4(var22).putVec4(var22).get();
            GpuBufferSlice var16 = this.m_5995(new Vector4f(var2, var3, var4, var5), var19);
            GpuBufferSlice var17 = Class_HtEPOqGrAYrUdumw.m_2945(var20);
            GpuBufferSlice var18 = Class_HtEPOqGrAYrUdumw.m_2945(var23);
            var14.setUniform(f_28858, var17);
            var14.setUniform(f_28859, var18);
            var14.setUniform(f_28860, var16);
         } catch (Throwable var25) {
            if (var19 != null) {
               try {
                  var19.close();
               } catch (Throwable var24) {
                  var25.addSuppressed(var24);
               }
            }

            throw var25;
         }

         if (var19 != null) {
            var19.close();
         }

         this.m_5998(var9, var14, this.f_28806);
      }
   }

   private Class_pkUe8kRLgMvN9wjY.k8yaGhpgiepif0os m_8216(
      TrackingItemStackRenderState var1, Class_pkUe8kRLgMvN9wjY.k8yaGhpgiepif0os var2, Class_pkUe8kRLgMvN9wjY.prObGRgMEEtFwb8l var3, int var4
   ) {
      float var5 = 0.0F;
      float var6 = 0.0F;
      int var7 = 16;
      int var8 = 16;
      if (var3.context() == ItemDisplayContext.FIRST_PERSON_RIGHT_HAND) {
         var5 = f_28837;
         var6 = f_28838;
         var7 = 32;
         var8 = 32;
      }

      AABB var9 = var1.getModelBoundingBox();
      int var10 = Mth.ceil(var9.getXsize() * f_28839);
      int var11 = Mth.ceil(var9.getYsize() * f_28840);
      if (var3.fitted()) {
         int var12 = Mth.floor((float)(var9.minX * f_28841));
         int var13 = Mth.ceil((float)(var9.maxY * f_28842));
         var5 = var12 + 8;
         var6 = 8 - var13;
         var7 = Math.max(1, Mth.ceil((float)(var9.maxX * f_28843)) - var12);
         var8 = Math.max(1, var13 - Mth.floor((float)(var9.minY * f_28844)));
      } else if (var3.context() == ItemDisplayContext.GUI && (var10 > 16 || var11 > 16)) {
         int var23 = Mth.floor((float)(var9.minX * f_28845));
         int var25 = Mth.floor((float)(var9.maxY * f_28846));
         var5 = var23 + 8;
         var6 = 8 - var25;
         var7 = var10;
         var8 = var11;
      }

      int var24 = var7 * var4;
      int var26 = var8 * var4;
      if (var2 != null && (var2.f_28794 != var24 || var2.f_28795 != var26)) {
         this.f_28809.remove(var3);
         this.m_8213(var2);
         var2 = null;
      }

      Class_pkUe8kRLgMvN9wjY.k8yaGhpgiepif0os var14 = var2 != null ? var2 : new Class_pkUe8kRLgMvN9wjY.k8yaGhpgiepif0os();
      if (var14.f_28790 == null) {
         GpuDevice var15 = RenderSystem.getDevice();
         var14.f_28790 = var15.createTexture(() -> f_28864, 13, GpuFormat.RGBA8_UNORM, var24, var26, 1, 1);
         var14.f_28791 = var15.createTextureView(var14.f_28790);
         var14.f_28792 = var15.createTexture(() -> f_28863, 9, GpuFormat.D32_FLOAT, var24, var26, 1, 1);
         var14.f_28793 = var15.createTextureView(var14.f_28792);
      }

      var14.f_28794 = var24;
      var14.f_28795 = var26;
      var14.f_28796 = var5;
      var14.f_28797 = var6;
      var14.f_28798 = var7;
      var14.f_28799 = var8;
      var14.f_28800 = var1.isAnimated();
      var14.f_28801 = this.f_28810;
      this.f_28807.clearColorAndDepthTextures(var14.f_28790, new Vector4f(0.0F), var14.f_28792, 0.0);
      Class_1x5Fn2q4kmtD2Zmq.EGrtL3OkTEhswyKz var27 = Class_1x5Fn2q4kmtD2Zmq.m_885();
      var27.m_884();
      GpuTextureView var16 = RenderSystem.outputColorTextureOverride;
      GpuTextureView var17 = RenderSystem.outputDepthTextureOverride;
      RenderSystem.outputColorTextureOverride = var14.f_28791;
      RenderSystem.outputDepthTextureOverride = var14.f_28793;
      RenderSystem.backupProjectionMatrix();

      try {
         RenderSystem.setProjectionMatrix(this.f_28808.m_3263(var24, var26), ProjectionType.ORTHOGRAPHIC);
         f_11537.gameRenderer
            .lighting()
            .setupFor(var1.usesBlockLight() ? com.mojang.blaze3d.platform.Lighting.Entry.ITEMS_3D : com.mojang.blaze3d.platform.Lighting.Entry.ITEMS_FLAT);
         PoseStack var18 = new PoseStack();
         var18.translate((f_28847 - var5) * var4, (f_28848 - var6) * var4, 0.0F);
         float var19 = f_28849 * var4;
         var18.scale(var19, -var19, var19);
         var18.mulPose(Axis.YP.rotationDegrees(var3.yaw() / f_28850));
         var18.mulPose(Axis.ZP.rotationDegrees(var3.roll() / f_28851));
         var18.mulPose(Axis.XP.rotationDegrees(var3.pitch() / f_28852));
         var1.submit(var18, this.f_28803, f_28853, OverlayTexture.NO_OVERLAY, 0);
         f_11537.gameRenderer.featureRenderDispatcher().renderAllFeatures(this.f_28803);
         var27.m_884();
      } finally {
         RenderSystem.outputColorTextureOverride = var16;
         RenderSystem.outputDepthTextureOverride = var17;
         RenderSystem.restoreProjectionMatrix();
      }

      if (var2 == null) {
         if (this.f_28809.size() >= 256) {
            this.m_8206();
         }

         this.f_28809.put(var3, var14);
      }

      return var14;
   }

   public void m_8217() {
      this.f_28810++;
      if (this.f_28810 % 120 == 0) {
         Iterator var1 = this.f_28809.entrySet().iterator();

         while (var1.hasNext()) {
            Class_pkUe8kRLgMvN9wjY.k8yaGhpgiepif0os var2 = (Class_pkUe8kRLgMvN9wjY.k8yaGhpgiepif0os)((Entry)var1.next()).getValue();
            if (this.f_28810 - var2.f_28802 > 600) {
               this.m_8213(var2);
               var1.remove();
            }
         }
      }
   }

   public void m_8218(ItemStack var1, float var2, float var3, float var4) {
      if (!var1.isEmpty() && !(var4 <= 0.0F) && !(Class_Ssh31B3ljfKeWsvS.m_4821() <= f_28821)) {
         int var5 = Math.clamp(Mth.ceil(var4), 1, 8);
         Class_pkUe8kRLgMvN9wjY.k8yaGhpgiepif0os var6 = this.m_8205(var1, var5);
         if (var6 != null) {
            if (!this.m_5994(var2 + var6.f_28796 * var4, var3 + var6.f_28797 * var4, var6.f_28798 * var4, var6.f_28799 * var4)) {
               this.m_8215(var6, var2 + var6.f_28796 * var4, var3 + var6.f_28797 * var4, var6.f_28798 * var4, var6.f_28799 * var4, var4, var5);
            }
         }
      }
   }

   private static final class k8yaGhpgiepif0os {
      public GpuTexture f_28790;
      public GpuTextureView f_28791;
      public GpuTexture f_28792;
      public GpuTextureView f_28793;
      public int f_28794;
      public int f_28795;
      public float f_28796;
      public float f_28797;
      public int f_28798;
      public int f_28799;
      public boolean f_28800;
      public int f_28801;
      public int f_28802;

      public k8yaGhpgiepif0os() {
      }
   }

   private record prObGRgMEEtFwb8l(Object modelKey, int texScale, ItemDisplayContext context, int pitch, int yaw, int roll, boolean fitted) {
   }
}
