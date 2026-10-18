package dev.dimasik.client.system;

import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.shaders.UniformType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import java.nio.ByteBuffer;
import java.util.Optional;
import net.minecraft.resources.Identifier;
import org.joml.Vector4f;
import org.joml.Vector4i;
import org.lwjgl.system.MemoryStack;

public final class Class_q4EBgBLwGNBvADTN implements Class_NzJrN63M7QBpmAbi, Class_b8v0o2NnCtANmOp9 {
   private static final Identifier f_29828 = Class_wHRRCm2tlLY7DN4I.m_9311(Class_q4EBgBLwGNBvADTN.f_29851);
   private static final Identifier f_29829 = Class_wHRRCm2tlLY7DN4I.m_9311(Class_q4EBgBLwGNBvADTN.f_29852);
   private static final Identifier f_29830 = Class_wHRRCm2tlLY7DN4I.m_9311(Class_q4EBgBLwGNBvADTN.f_29853);
   private final long f_29831 = System.nanoTime();
   private final RenderPipeline f_29832;
   private static final String f_29833 = "dimasik/click_gui_background";
   private static final String f_29834 = "click_gui_background";
   private static final String f_29835 = "click_gui_background";
   private static final String f_29836 = "ClickGuiBackground";
   private static final float f_29837 = 1.0E9F;
   private static final float f_29838 = 255.0F;
   private static final float f_29839 = 0.82F;
   private static final float f_29840 = 0.82F;
   private static final float f_29841 = 0.48F;
   private static final float f_29842 = 0.48F;
   private static final float f_29843 = 20.0F;
   private static final float f_29844 = 30.0F;
   private static final float f_29845 = 30.0F;
   private static final float f_29846 = -30.0F;
   private static final float f_29847 = 30.0F;
   private static final String f_29848 = "ClickGuiBackground";
   private static final String f_29849 = "clickGuiBackgroundUniforms";
   private static final String f_29850 = "clickGuiBackgroundPass";
   private static final String f_29851 = "nightix/background";
   private static final String f_29852 = "nightix/circles_effect";
   private static final String f_29853 = "nightix/top_glow";

   public Class_q4EBgBLwGNBvADTN() {
      this.f_29832 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_29833)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_29834))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_29835))
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2739(DefaultVertexFormat.POSITION, PrimitiveTopology.QUADS)
         .m_2729(f_29836, UniformType.UNIFORM_BUFFER)
         .m_2722();
   }

   public void m_8324(float var1, float var2, float var3, int var4, int var5) {
      float var6 = f_11537.getWindow().getScreenWidth();
      float var7 = f_11537.getWindow().getScreenHeight();
      float var8 = (float)(System.nanoTime() - this.f_29831) / f_29837;
      int var9 = Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_29838 * var3);
      int var10 = Class_BftdentXEtGbugJw.m_2306(var4, var3 * f_29839);
      int var11 = Class_BftdentXEtGbugJw.m_2306(var5, var3 * f_29840);
      int var12 = Class_BftdentXEtGbugJw.m_2306(var4, var3 * f_29841);
      int var13 = Class_BftdentXEtGbugJw.m_2306(var5, var3 * f_29842);
      Class_Ssh31B3ljfKeWsvS.m_4858(0.0F, 0.0F, var6, var7, f_29843, 0.0F, var9);
      Class_Ssh31B3ljfKeWsvS.m_4804(0.0F, 0.0F, var6, var7, 0.0F, new Vector4i(var10, var11, var11, var10), f_29828);
      Vector4i var14 = new Vector4i(var12, var13, var13, var12);
      Class_Ssh31B3ljfKeWsvS.m_4804(0.0F, f_29844 - f_29845 * var3, var6, var7, 0.0F, var14, f_29829);
      Class_Ssh31B3ljfKeWsvS.m_4804(0.0F, f_29846 + f_29847 * var3, var6, var7, 0.0F, var14, f_29830);
      BufferBuilder var15 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION);
      this.m_5999(var15, 0.0F, 0.0F, var6, var7);
      CommandEncoder var16 = RenderSystem.getDevice().createCommandEncoder();
      RenderPass var17 = var16.createRenderPass(() -> f_29850, f_11537.gameRenderer.mainRenderTarget().getColorTextureView(), Optional.empty());
      RenderSystem.bindDefaultUniforms(var17);
      MemoryStack var19 = MemoryStack.stackPush();

      GpuBuffer var18;
      try {
         Vector4f var20 = Class_BftdentXEtGbugJw.m_2298(var4);
         Vector4f var21 = Class_BftdentXEtGbugJw.m_2298(var5);
         ByteBuffer var22 = Std140Builder.onStack(var19, 64)
            .putVec4(var6, var7, var8, var3)
            .putVec4(var1, var2, 0.0F, 0.0F)
            .putVec4(var20)
            .putVec4(var21)
            .get();
         var18 = RenderSystem.getDevice().createBuffer(() -> f_29849, 128, var22);
         var17.setUniform(f_29848, var18);
      } catch (Throwable var24) {
         if (var19 != null) {
            try {
               var19.close();
            } catch (Throwable var23) {
               var24.addSuppressed(var23);
            }
         }

         throw var24;
      }

      if (var19 != null) {
         var19.close();
      }

      this.m_5998(var15, var17, this.f_29832);
      var18.close();
   }
}
