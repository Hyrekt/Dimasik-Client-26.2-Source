package dev.dimasik.client.system;

import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.IndexType;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.pipeline.TextureTarget;
import com.mojang.blaze3d.platform.BlendFactor;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.shaders.UniformType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.ScissorState;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import dev.dimasik.mixin.RenderPipelinesMixin;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.function.Supplier;
import net.minecraft.client.Camera;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.rendertype.PreparedRenderType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;

public final class Class_JYI3tOXLKmfxbnee implements Class_NzJrN63M7QBpmAbi, AutoCloseable {
   private static final double f_9666 = 22500.0;
   private static final int f_9667 = 48;
   private static final int f_9668 = 144;
   private static final int f_9669 = 6;
   private static final int f_9670 = 96;
   private static final int f_9671 = 16;
   private static final int f_9672 = 80;
   private static final int f_9673 = 64;
   private static final int f_9674 = 1056;
   private static final int f_9675 = 1088;
   private static final float f_9676 = 1.5F;
   private static final RenderPipeline f_9677 = Class_GEnQMkY73qXewYpU.m_2718()
      .m_2726(Class_JYI3tOXLKmfxbnee.f_9875)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9876))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9877))
      .m_2719(CompareOp.ALWAYS_PASS)
      .m_2737(false)
      .m_2725(false)
      .m_2727()
      .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
      .m_2729(Class_JYI3tOXLKmfxbnee.f_9878, UniformType.UNIFORM_BUFFER)
      .m_2741(Class_JYI3tOXLKmfxbnee.f_9879)
      .m_2722();
   private static final RenderPipeline f_9678 = Class_GEnQMkY73qXewYpU.m_2718()
      .m_2726(Class_JYI3tOXLKmfxbnee.f_9880)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9881))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9882))
      .m_2719(CompareOp.ALWAYS_PASS)
      .m_2737(false)
      .m_2725(false)
      .m_2727()
      .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
      .m_2741(Class_JYI3tOXLKmfxbnee.f_9883)
      .m_2722();
   private static final RenderPipeline f_9679 = Class_GEnQMkY73qXewYpU.m_2718()
      .m_2726(Class_JYI3tOXLKmfxbnee.f_9884)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9885))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9886))
      .m_2719(CompareOp.ALWAYS_PASS)
      .m_2737(false)
      .m_2725(false)
      .m_2727()
      .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
      .m_2729(Class_JYI3tOXLKmfxbnee.f_9887, UniformType.UNIFORM_BUFFER)
      .m_2741(Class_JYI3tOXLKmfxbnee.f_9888)
      .m_2722();
   private static final RenderPipeline f_9680 = Class_GEnQMkY73qXewYpU.m_2718()
      .m_2726(Class_JYI3tOXLKmfxbnee.f_9889)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9890))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9891))
      .m_2719(CompareOp.ALWAYS_PASS)
      .m_2737(false)
      .m_2725(false)
      .m_2727()
      .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
      .m_2729(Class_JYI3tOXLKmfxbnee.f_9892, UniformType.UNIFORM_BUFFER)
      .m_2741(Class_JYI3tOXLKmfxbnee.f_9893)
      .m_2722();
   private static final RenderPipeline f_9681 = Class_GEnQMkY73qXewYpU.m_2718()
      .m_2726(Class_JYI3tOXLKmfxbnee.f_9894)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9895))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9896))
      .m_2719(CompareOp.ALWAYS_PASS)
      .m_2737(false)
      .m_2725(false)
      .m_2732(BlendFunction.LIGHTNING)
      .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
      .m_2729(Class_JYI3tOXLKmfxbnee.f_9897, UniformType.UNIFORM_BUFFER)
      .m_2741(Class_JYI3tOXLKmfxbnee.f_9898)
      .m_2741(Class_JYI3tOXLKmfxbnee.f_9899)
      .m_2722();
   private static final RenderPipeline f_9682 = Class_GEnQMkY73qXewYpU.m_2718()
      .m_2726(Class_JYI3tOXLKmfxbnee.f_9900)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9901))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9902))
      .m_2719(CompareOp.ALWAYS_PASS)
      .m_2737(false)
      .m_2725(false)
      .m_2727()
      .m_2714(GpuFormat.RGBA16_FLOAT)
      .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
      .m_2729(Class_JYI3tOXLKmfxbnee.f_9903, UniformType.UNIFORM_BUFFER)
      .m_2741(Class_JYI3tOXLKmfxbnee.f_9904)
      .m_2741(Class_JYI3tOXLKmfxbnee.f_9905)
      .m_2741(Class_JYI3tOXLKmfxbnee.f_9906)
      .m_2722();
   private static final RenderPipeline f_9683 = Class_GEnQMkY73qXewYpU.m_2718()
      .m_2726(Class_JYI3tOXLKmfxbnee.f_9907)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9908))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9909))
      .m_2719(CompareOp.ALWAYS_PASS)
      .m_2737(false)
      .m_2725(false)
      .m_2732(new BlendFunction(BlendFactor.ONE, BlendFactor.ONE, BlendFactor.ONE, BlendFactor.ONE))
      .m_2714(GpuFormat.RGBA16_FLOAT)
      .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
      .m_2741(Class_JYI3tOXLKmfxbnee.f_9910)
      .m_2722();
   private static final RenderPipeline f_9684 = Class_GEnQMkY73qXewYpU.m_2718()
      .m_2726(Class_JYI3tOXLKmfxbnee.f_9911)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9912))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9913))
      .m_2719(CompareOp.ALWAYS_PASS)
      .m_2737(false)
      .m_2725(false)
      .m_2732(new BlendFunction(BlendFactor.ONE, BlendFactor.ONE, BlendFactor.ONE, BlendFactor.ONE))
      .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
      .m_2729(Class_JYI3tOXLKmfxbnee.f_9914, UniformType.UNIFORM_BUFFER)
      .m_2741(Class_JYI3tOXLKmfxbnee.f_9915)
      .m_2741(Class_JYI3tOXLKmfxbnee.f_9916)
      .m_2722();
   private static final RenderPipeline f_9685 = Class_GEnQMkY73qXewYpU.m_2718()
      .m_2726(Class_JYI3tOXLKmfxbnee.f_9917)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9918))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9919))
      .m_2719(CompareOp.ALWAYS_PASS)
      .m_2737(false)
      .m_2725(false)
      .m_2727()
      .m_2714(GpuFormat.RGBA16_FLOAT)
      .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
      .m_2729(Class_JYI3tOXLKmfxbnee.f_9920, UniformType.UNIFORM_BUFFER)
      .m_2741(Class_JYI3tOXLKmfxbnee.f_9921)
      .m_2722();
   private static final RenderPipeline f_9686 = m_3303(Class_JYI3tOXLKmfxbnee.f_9922);
   private static final RenderPipeline f_9687 = m_3303(Class_JYI3tOXLKmfxbnee.f_9923);
   private static final RenderPipeline f_9688 = Class_GEnQMkY73qXewYpU.m_2718()
      .m_2726(Class_JYI3tOXLKmfxbnee.f_9924)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9925))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9926))
      .m_2719(CompareOp.ALWAYS_PASS)
      .m_2737(false)
      .m_2725(false)
      .m_2727()
      .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
      .m_2729(Class_JYI3tOXLKmfxbnee.f_9927, UniformType.UNIFORM_BUFFER)
      .m_2741(Class_JYI3tOXLKmfxbnee.f_9928)
      .m_2741(Class_JYI3tOXLKmfxbnee.f_9929)
      .m_2722();
   private static final RenderPipeline f_9689 = RenderPipelinesMixin.register(
      Class_GEnQMkY73qXewYpU.m_2718(RenderPipelinesMixin.getOutlineSnippet())
         .m_2726(Class_JYI3tOXLKmfxbnee.f_9930)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9931))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9932))
         .m_2729(Class_JYI3tOXLKmfxbnee.f_9933, UniformType.UNIFORM_BUFFER)
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(true)
         .m_2725(false)
         .m_2727()
         .m_2722()
   );
   private static final RenderPipeline f_9690 = Class_GEnQMkY73qXewYpU.m_2718()
      .m_2726(Class_JYI3tOXLKmfxbnee.f_9934)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9935))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9936))
      .m_2719(CompareOp.ALWAYS_PASS)
      .m_2737(false)
      .m_2720(true, true)
      .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
      .m_2729(Class_JYI3tOXLKmfxbnee.f_9937, UniformType.UNIFORM_BUFFER)
      .m_2741(Class_JYI3tOXLKmfxbnee.f_9938)
      .m_2732(BlendFunction.TRANSLUCENT)
      .m_2722();
   private static final RenderPipeline f_9691 = Class_GEnQMkY73qXewYpU.m_2718()
      .m_2726(Class_JYI3tOXLKmfxbnee.f_9939)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9940))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9941))
      .m_2719(CompareOp.ALWAYS_PASS)
      .m_2737(false)
      .m_2725(false)
      .m_2732(BlendFunction.TRANSLUCENT)
      .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
      .m_2729(Class_JYI3tOXLKmfxbnee.f_9942, UniformType.UNIFORM_BUFFER)
      .m_2741(Class_JYI3tOXLKmfxbnee.f_9943)
      .m_2741(Class_JYI3tOXLKmfxbnee.f_9944)
      .m_2741(Class_JYI3tOXLKmfxbnee.f_9945)
      .m_2722();
   private final Function<Entity, Class_y7LCUoWgFH6Mz8SR> f_9692;
   private final Supplier<? extends Collection<Class_y7LCUoWgFH6Mz8SR>> f_9693;
   private final List<Class_y7LCUoWgFH6Mz8SR> f_9694;
   private final boolean[] f_9695;
   private final int[] f_9696;
   private final float[][][] f_9697;
   private Matrix4f f_9698;
   private float f_9699;
   private final Vector4f f_9700 = new Vector4f();
   private TextureTarget f_9701;
   private TextureTarget f_9702;
   private GpuBuffer f_9703;
   private TextureTarget f_9704;
   private TextureTarget f_9705;
   private final TextureTarget[][] f_9706 = new TextureTarget[2][3];
   private final TextureTarget[][] f_9707 = new TextureTarget[2][3];
   private GpuBuffer f_9708;
   private GpuBuffer f_9709;
   private int f_9710 = -1;
   private int f_9711 = -1;
   private float f_9712 = Float.NaN;
   private TextureTarget f_9713;
   private TextureTarget f_9714;
   private TextureTarget f_9715;
   private GpuBuffer f_9716;
   private boolean f_9717;
   private GpuBuffer f_9718;
   private GpuBuffer f_9719;
   private GpuBuffer f_9720;
   private GpuBuffer f_9721;
   private GpuBuffer f_9722;
   private TextureTarget f_9723;
   private boolean f_9724;
   private final double[][] f_9725 = new double[64][4];
   private int f_9726;
   private GpuBuffer f_9727;
   private TextureTarget f_9728;
   private GpuBuffer f_9729;
   private boolean f_9730;
   private boolean f_9731;
   private static final RenderPipeline f_9732 = RenderPipelinesMixin.register(
      Class_GEnQMkY73qXewYpU.m_2718(RenderPipelinesMixin.getOutlineSnippet())
         .m_2726(Class_JYI3tOXLKmfxbnee.f_9946)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9947))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_JYI3tOXLKmfxbnee.f_9948))
         .m_2729(Class_JYI3tOXLKmfxbnee.f_9949, UniformType.UNIFORM_BUFFER)
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(true)
         .m_2725(false)
         .m_2727()
         .m_2722()
   );
   private boolean f_9733;
   private boolean f_9734;
   private boolean f_9735;
   private final long f_9736 = System.nanoTime();
   private final ByteBuffer f_9737 = ByteBuffer.allocate(144).limit(0);
   private float f_9738;
   private int f_9739;
   private int f_9740;
   private int f_9741 = -1;
   private int f_9742 = -1;
   private float f_9743 = Float.NaN;
   private int f_9744 = -1;
   private int f_9745 = -1;
   private float f_9746 = Float.NaN;
   private static final String f_9747 = "hands_fullscreen";
   private static final String f_9748 = "InSampler";
   private static final String f_9749 = "entityEspSurface";
   private static final String f_9750 = "DynamicTransforms";
   private static final String f_9751 = "EspSurfaceAnchors";
   private static final String f_9752 = "entityEspGlowSurface";
   private static final String f_9753 = "entityEspGlowSurface";
   private static final String f_9754 = "DynamicTransforms";
   private static final String f_9755 = "EspGlowSurface";
   private static final String f_9756 = "entityEspSurfaceAnchors";
   private static final double f_9757 = 0.5;
   private static final double f_9758 = 0.5;
   private static final int f_9759 = -16777216;
   private static final String f_9760 = "entity-esp-preview-surface";
   private static final String f_9761 = "entityEspPreviewSurface";
   private static final String f_9762 = "PreviewSurface";
   private static final String f_9763 = "DepthSampler";
   private static final String f_9764 = "MaskSampler";
   private static final String f_9765 = "InSampler";
   private static final float f_9766 = 255.0F;
   private static final float f_9767 = 255.0F;
   private static final float f_9768 = 255.0F;
   private static final float f_9769 = 255.0F;
   private static final String f_9770 = "InSampler";
   private static final String f_9771 = "PreviewMask";
   private static final double f_9772 = 22500.0;
   private static final int f_9773 = -16711939;
   private static final float f_9774 = 0.1F;
   private static final float f_9775 = 0.5F;
   private static final float f_9776 = 0.05F;
   private static final float f_9777 = 0.03125F;
   private static final float f_9778 = 0.75F;
   private static final float f_9779 = 0.25F;
   private static final float f_9780 = 1.25F;
   private static final float f_9781 = 0.05F;
   private static final float f_9782 = 0.5F;
   private static final float f_9783 = 0.5F;
   private static final float f_9784 = 0.5F;
   private static final float f_9785 = 0.5F;
   private static final double f_9786 = 2.0;
   private static final double f_9787 = 50.0;
   private static final String f_9788 = "entity-esp-category-mask";
   private static final String f_9789 = "entityEspCategoryMask";
   private static final String f_9790 = "InSampler";
   private static final String f_9791 = "CategoryMask";
   private static final float f_9792 = 0.002F;
   private static final float f_9793 = 8.0F;
   private static final String f_9794 = "entityEspModelFillUniforms";
   private static final long f_9795 = 120000L;
   private static final float f_9796 = 1000.0F;
   private static final String f_9797 = "MaskSampler";
   private static final String f_9798 = "SceneSampler";
   private static final String f_9799 = "SurfaceSampler";
   private static final String f_9800 = "EspChamsFill";
   private static final float f_9801 = 25.0F;
   private static final float f_9802 = 6.0F;
   private static final float f_9803 = 12.0F;
   private static final String f_9804 = "InSampler";
   private static final float f_9805 = 0.01F;
   private static final float f_9806 = 25.0F;
   private static final float f_9807 = 12.0F;
   private static final float f_9808 = 6.0F;
   private static final float f_9809 = 45.0F;
   private static final float f_9810 = 9.0F;
   private static final float f_9811 = 0.2025F;
   private static final float f_9812 = 1.0E-4F;
   private static final float f_9813 = 0.81F;
   private static final String f_9814 = "MaskSampler";
   private static final String f_9815 = "RadiusSampler";
   private static final String f_9816 = "SurfaceSampler";
   private static final String f_9817 = "EspOuterGlow";
   private static final String f_9818 = "BloomSampler";
   private static final String f_9819 = "MaskSampler";
   private static final String f_9820 = "EspOuterGlow";
   private static final String f_9821 = "entity-esp-filtered-glow";
   private static final String f_9822 = "InSampler";
   private static final String f_9823 = "GlowBlur";
   private static final String f_9824 = "entityEspGlowHorizontal";
   private static final String f_9825 = "entityEspGlowVertical";
   private static final float f_9826 = Float.MIN_NORMAL;
   private static final float f_9827 = 3.0F;
   private static final float f_9828 = Float.MIN_NORMAL;
   private static final float f_9829 = 5.0F;
   private static final float f_9830 = Float.MIN_NORMAL;
   private static final float f_9831 = 7.0F;
   private static final float f_9832 = Float.MIN_NORMAL;
   private static final String f_9833 = "InSampler";
   private static final String f_9834 = "EspGlow";
   private static final String f_9835 = "InSampler";
   private static final String f_9836 = "EspBlur";
   private static final String f_9837 = "entityEspModelBlurHorizontalUniforms";
   private static final String f_9838 = "entityEspModelBlurVerticalUniforms";
   private static final float f_9839 = 0.2F;
   private static final float f_9840 = 0.5F;
   private static final String f_9841 = "entityEspModelGlowUniforms";
   private static final String f_9842 = "Энергопоток";
   private static final String f_9843 = "Дымчатая аура";
   private static final String f_9844 = "Мягкий неон";
   private static final float f_9845 = 1.0E9F;
   private static final float f_9846 = 1.5F;
   private static final String f_9847 = "entityEspModelOutlineUniforms";
   private static final float f_9848 = 1.5F;
   private static final String f_9849 = "entity-esp-model-blur-horizontal";
   private static final String f_9850 = "entity-esp-model-blur-vertical";
   private static final String f_9851 = "entity-esp-preview-source";
   private static final String f_9852 = "entity-esp-preview-output";
   private static final String f_9853 = "Космос";
   private static final String f_9854 = "Плазма";
   private static final String f_9855 = "Стекло";
   private static final String f_9856 = "Дымчатая аура";
   private static final String f_9857 = "Энергопоток";
   private static final double f_9858 = 0.25;
   private static final float f_9859 = 360.0F;
   private static final float f_9860 = 255.0F;
   private static final String f_9861 = "entityEspModelBlur";
   private static final String f_9862 = "entityEspModelOutline";
   private static final String f_9863 = "entityEspGlowFilter";
   private static final String f_9864 = "entityEspModelGlow";
   private static final String f_9865 = "entityEspModelMask";
   private static final String f_9866 = "entityEspDistanceGlow";
   private static final String f_9867 = "entityEspModelFill";
   private static final String f_9868 = "entityEspCategoryMask";
   private static final String f_9869 = "entityEspPreviewMask";
   private static final String f_9870 = "entityEspPreviewMaskUniforms";
   private static final String f_9871 = "entityEspPreviewCopy";
   private static final String f_9872 = "entityEspPreviewSurface";
   private static final String f_9873 = "entityEspGlowSurface";
   private static final String f_9874 = "entityEspSurface";
   private static final String f_9875 = "dimasik/entity_esp_category_mask";
   private static final String f_9876 = "hands_fullscreen";
   private static final String f_9877 = "entity_esp_category_mask";
   private static final String f_9878 = "CategoryMask";
   private static final String f_9879 = "InSampler";
   private static final String f_9880 = "dimasik/entity_esp_model_mask";
   private static final String f_9881 = "hands_fullscreen";
   private static final String f_9882 = "entity_esp_mask";
   private static final String f_9883 = "InSampler";
   private static final String f_9884 = "dimasik/entity_esp_preview_mask";
   private static final String f_9885 = "hands_fullscreen";
   private static final String f_9886 = "entity_esp_preview_mask";
   private static final String f_9887 = "PreviewMask";
   private static final String f_9888 = "InSampler";
   private static final String f_9889 = "dimasik/entity_esp_model_blur";
   private static final String f_9890 = "hands_fullscreen";
   private static final String f_9891 = "entity_esp_gaussian_blur";
   private static final String f_9892 = "EspBlur";
   private static final String f_9893 = "InSampler";
   private static final String f_9894 = "dimasik/entity_esp_model_glow";
   private static final String f_9895 = "hands_fullscreen";
   private static final String f_9896 = "entity_esp_model_glow";
   private static final String f_9897 = "EspOuterGlow";
   private static final String f_9898 = "BloomSampler";
   private static final String f_9899 = "MaskSampler";
   private static final String f_9900 = "dimasik/entity_esp_glow_seed";
   private static final String f_9901 = "hands_fullscreen";
   private static final String f_9902 = "entity_esp_glow_seed";
   private static final String f_9903 = "EspOuterGlow";
   private static final String f_9904 = "MaskSampler";
   private static final String f_9905 = "SurfaceSampler";
   private static final String f_9906 = "RadiusSampler";
   private static final String f_9907 = "dimasik/entity_esp_glow_accumulate";
   private static final String f_9908 = "hands_fullscreen";
   private static final String f_9909 = "entity_esp_glow_accumulate";
   private static final String f_9910 = "InSampler";
   private static final String f_9911 = "dimasik/entity_esp_preview_glow";
   private static final String f_9912 = "hands_fullscreen";
   private static final String f_9913 = "entity_esp_model_glow";
   private static final String f_9914 = "EspOuterGlow";
   private static final String f_9915 = "BloomSampler";
   private static final String f_9916 = "MaskSampler";
   private static final String f_9917 = "dimasik/entity_esp_glow_blur";
   private static final String f_9918 = "hands_fullscreen";
   private static final String f_9919 = "entity_esp_glow_blur";
   private static final String f_9920 = "GlowBlur";
   private static final String f_9921 = "InSampler";
   private static final String f_9922 = "entity_esp_glow_downsample";
   private static final String f_9923 = "entity_esp_glow_upsample";
   private static final String f_9924 = "dimasik/entity_esp_preview_surface";
   private static final String f_9925 = "hands_fullscreen";
   private static final String f_9926 = "entity_esp_preview_surface";
   private static final String f_9927 = "PreviewSurface";
   private static final String f_9928 = "DepthSampler";
   private static final String f_9929 = "MaskSampler";
   private static final String f_9930 = "dimasik/entity_esp_glow_surface";
   private static final String f_9931 = "entity_esp_glow_surface";
   private static final String f_9932 = "entity_esp_glow_surface";
   private static final String f_9933 = "EspGlowSurface";
   private static final String f_9934 = "dimasik/entity_esp_model_outline";
   private static final String f_9935 = "entity_esp_glow_blit";
   private static final String f_9936 = "entity_esp_glow_blit";
   private static final String f_9937 = "EspGlow";
   private static final String f_9938 = "InSampler";
   private static final String f_9939 = "dimasik/entity_esp_model_fill";
   private static final String f_9940 = "hands_fullscreen";
   private static final String f_9941 = "entity_esp_chams_fill";
   private static final String f_9942 = "EspChamsFill";
   private static final String f_9943 = "MaskSampler";
   private static final String f_9944 = "SurfaceSampler";
   private static final String f_9945 = "SceneSampler";
   private static final String f_9946 = "dimasik/entity_esp_surface";
   private static final String f_9947 = "entity_esp_surface";
   private static final String f_9948 = "entity_esp_surface";
   private static final String f_9949 = "EspSurfaceAnchors";

   private TextureTarget m_3265(TextureTarget var1, int var2, int var3) {
      if (var1 == null) {
         return new TextureTarget(f_9821, var2, var3, false, GpuFormat.RGBA16_FLOAT);
      }

      if (var1.width != var2 || var1.height != var3) {
         var1.resize(var2, var3);
      }

      return var1;
   }

   private boolean m_3266(Class_y7LCUoWgFH6Mz8SR var1) {
      return var1 != null && (var1.m_9640().m_8768() || var1.m_9613().m_8768() || var1.m_9619().m_8768());
   }

   private static float m_3267(int var0, int var1) {
      return (var0 >>> var1 & 0xFF) / f_9860;
   }

   private void m_3268(int var1, int var2, int var3, boolean var4) {
      int var5 = var4 ? 1 : 0;

      for (int var6 = 0; var6 <= var3; var6++) {
         int var7 = 2 << var6;
         int var8 = Math.max(1, (var1 + var7 - 1) / var7);
         int var9 = Math.max(1, (var2 + var7 - 1) / var7);
         this.f_9706[var5][var6] = this.m_3265(this.f_9706[var5][var6], var8, var9);
         if (var6 == var3) {
            this.f_9707[var5][var6] = this.m_3265(this.f_9707[var5][var6], var8, var9);
         }
      }
   }

   private void m_3269(RenderPass var1, RenderTarget var2, float[] var3) {
      if (var3 != null) {
         int var4 = Math.max(0, (int)Math.floor(var3[0] * var2.width));
         int var5 = Math.max(0, (int)Math.floor(var3[1] * var2.height));
         int var6 = Math.min(var2.width, (int)Math.ceil(var3[2] * var2.width));
         int var7 = Math.min(var2.height, (int)Math.ceil(var3[3] * var2.height));
         var1.enableScissor(var4, var5, Math.max(1, var6 - var4), Math.max(1, var7 - var5));
      }
   }

   private int m_3271(Class_y7LCUoWgFH6Mz8SR var1) {
      if (var1.m_9597().m_7568(f_9853)) {
         return 2;
      } else if (var1.m_9597().m_7568(f_9854)) {
         return 3;
      } else {
         return var1.m_9597().m_7568(f_9855) ? 4 : 1;
      }
   }

   private boolean m_3273(Class_y7LCUoWgFH6Mz8SR var1) {
      return var1.m_9635().m_8768() && this.m_3266(var1);
   }

   public void m_3274(Class_15puspGa4UwNUgkr var1) {
      if (this.m_3294()) {
         Entity var2 = var1.m_838();
         Class_y7LCUoWgFH6Mz8SR var3 = this.f_9692.apply(var2);
         if (var3 != null) {
            if (!this.m_3281(var2, var3)) {
               var1.m_837().outlineColor = 0;
            } else {
               this.m_3293();
               this.f_9734 = true;
               int var4 = this.f_9694.indexOf(var3);
               if (var4 >= 0) {
                  this.f_9695[var4] = true;
               }

               this.f_9731 = this.f_9731 | (var3.m_9619().m_8768() && this.m_3285(var3));
               if (this.f_9726 < 64) {
                  double[] var5 = this.f_9725[this.f_9726++];
                  EntityRenderState var6 = var1.m_837();
                  var5[0] = var6.x;
                  var5[1] = var6.y + var2.getBbHeight() * f_9757;
                  var5[2] = var6.z;
                  var5[3] = Math.max(f_9758, var2.getBbHeight());
               }

               if (var3.m_9613().m_8768()) {
                  if (!this.f_9735) {
                     this.f_9738 = var3.m_9618().m_8768();
                     this.f_9739 = this.m_3278(var3);
                     this.f_9740 = this.m_3271(var3);
                  }

                  this.f_9735 = true;
               }

               int var7 = this.m_3283(var3);
               if (var4 >= 0 && var3.m_9619().m_8768()) {
                  int var8 = this.m_3279(var2, var1.m_837(), var4);
                  var7 = var7 & -256 | 253 - var8;
               }

               var1.m_837().outlineColor = var7;
            }
         }
      }
   }

   public GpuTextureView m_3275(GpuTextureView var1, int var2, int var3, Class_y7LCUoWgFH6Mz8SR var4, GpuTextureView var5, Matrix4f var6, float var7) {
      if (var1 != null && var2 > 0 && var3 > 0 && var4 != null && this.m_3266(var4)) {
         this.m_3290(var2, var3);
         CommandEncoder var8 = RenderSystem.getDevice().createCommandEncoder();
         this.m_3300(var8, var1, this.f_9714);
         this.m_3286(var8, var1, this.f_9713, this.m_3296(var4) | f_9759);
         this.f_9717 = false;
         if (var4.m_9619().m_8768() && this.m_3285(var4)) {
            this.m_3301(var8, var5, var6, var7, var2, var3);
         }

         if (var4.m_9613().m_8768()) {
            this.m_3315(this.f_9713, this.f_9714, var4.m_9618().m_8768(), this.m_3278(var4), this.m_3271(var4), true);
         }

         if (var4.m_9640().m_8768() || var4.m_9619().m_8768()) {
            if (var4.m_9619().m_8768()) {
               this.m_3316(
                  this.f_9713, this.f_9714, var4.m_9632().m_8768(), var4.m_9638().m_8768(), var4.m_9640().m_8768() ? var4.m_9636().m_8768() : 0.0F, var4, true
               );
            } else {
               this.m_3297(this.f_9713, this.f_9714, var4.m_9636().m_8768());
            }
         }

         return this.f_9714.getColorTextureView();
      } else {
         return null;
      }
   }

   private void m_3276(PreparedRenderType var1, GpuBuffer var2, GpuBuffer var3, IndexType var4, int var5, int var6, int var7) {
      Matrix4f var8 = Class_FvJXUGWpZo3zYBW4.m_2691();
      if (var8 != null && this.f_9726 != 0) {
         RenderTarget var9 = f_11537.gameRenderer.mainRenderTarget();
         if (this.f_9728 == null) {
            this.f_9728 = new TextureTarget(f_9752, var9.width, var9.height, true, GpuFormat.RGBA8_UNORM);
         } else if (this.f_9728.width != var9.width || this.f_9728.height != var9.height) {
            this.f_9728.resize(var9.width, var9.height);
            this.f_9730 = false;
         }

         GpuTextureView var10 = this.f_9728.getColorTextureView();
         GpuTextureView var11 = this.f_9728.getDepthTextureView();
         if (var10 != null && !var10.isClosed() && var11 != null && !var11.isClosed()) {
            CommandEncoder var12 = RenderSystem.getDevice().createCommandEncoder();
            if (!this.f_9730) {
               this.f_9729 = this.m_3309(this.f_9729, 1088, f_9753);
               Vec3 var13 = f_11537.gameRenderer.mainCamera().position();
               Vector4f var14 = new Vector4f(1.0F, 0.0F, 0.0F, 0.0F).mul(var8);
               Vector4f var15 = new Vector4f(0.0F, 1.0F, 0.0F, 0.0F).mul(var8);
               Vector4f var16 = new Vector4f(0.0F, 0.0F, 1.0F, 0.0F).mul(var8);
               Vector4f var17 = new Vector4f();
               MemoryStack var18 = MemoryStack.stackPush();

               try {
                  Std140Builder var19 = Std140Builder.onStack(var18, 1088)
                     .putVec4(this.f_9726, 0.0F, 0.0F, 0.0F)
                     .putVec4(var14.x, var14.y, var14.z, 0.0F)
                     .putVec4(var15.x, var15.y, var15.z, 0.0F)
                     .putVec4(var16.x, var16.y, var16.z, 0.0F);

                  for (int var20 = 0; var20 < 64; var20++) {
                     if (var20 < this.f_9726) {
                        double[] var21 = this.f_9725[var20];
                        var17.set((float)(var21[0] - var13.x), (float)(var21[1] - var13.y), (float)(var21[2] - var13.z), 1.0F).mul(var8);
                        var19.putVec4(var17.x, var17.y, var17.z, (float)var21[3]);
                     } else {
                        var19.putVec4(0.0F, 0.0F, 0.0F, 1.0F);
                     }
                  }

                  var12.writeToBuffer(this.f_9729.slice(), var19.get());
               } catch (Throwable var25) {
                  if (var18 != null) {
                     try {
                        var18.close();
                     } catch (Throwable var23) {
                        var25.addSuppressed(var23);
                     }
                  }

                  throw var25;
               }

               if (var18 != null) {
                  var18.close();
               }
            }

            RenderPass var26 = var12.createRenderPass(
               () -> f_9873,
               var10,
               this.f_9730 ? Optional.empty() : Optional.of(new Vector4f(0.0F)),
               var11,
               this.f_9730 ? OptionalDouble.empty() : OptionalDouble.of(0.0)
            );

            try {
               var26.setPipeline(f_9689);
               ScissorState var27 = var1.scissorState();
               if (var27.enabled()) {
                  var26.enableScissor(var27.x(), var27.y(), var27.width(), var27.height());
               }

               RenderSystem.bindDefaultUniforms(var26);
               var26.setUniform(f_9754, var1.dynamicTransforms());
               var26.setUniform(f_9755, this.f_9729);
               var26.setVertexBuffer(0, var2.slice());
               var26.setIndexBuffer(var3, var4);
               var1.textures().forEach(var1x -> var26.bindTexture(var1x.name(), var1x.textureView(), var1x.sampler()));
               var26.drawIndexed(var7, 1, var6, var5, 0);
            } catch (Throwable var24) {
               if (var26 != null) {
                  try {
                     var26.close();
                  } catch (Throwable var22) {
                     var24.addSuppressed(var22);
                  }
               }

               throw var24;
            }

            if (var26 != null) {
               var26.close();
            }

            this.f_9730 = true;
         }
      }
   }

   private void m_3277(RenderTarget var1, RenderTarget var2, int var3, float var4, Class_y7LCUoWgFH6Mz8SR var5) {
      int var6 = this.f_9696[var3];
      if (var6 != 0) {
         this.f_9701 = this.m_3265(this.f_9701, Math.max(1, (var1.width + 1) / 2), Math.max(1, (var1.height + 1) / 2));
         boolean var7 = true;

         for (int var8 = 0; var8 < 6; var8++) {
            if ((var6 & 1 << var8) != 0) {
               float var9 = Math.clamp(var5.m_9632().m_8768(), 1.0F, f_9801) / (1 << var8);
               float[] var10 = this.f_9697[var3][var8];
               float var11 = var9 * f_9802 + f_9803;
               var10[0] = Math.clamp(var10[0] - var11 / var1.width, 0.0F, 1.0F);
               var10[1] = Math.clamp(var10[1] - var11 / var1.height, 0.0F, 1.0F);
               var10[2] = Math.clamp(var10[2] + var11 / var1.width, 0.0F, 1.0F);
               var10[3] = Math.clamp(var10[3] + var11 / var1.height, 0.0F, 1.0F);
               if (!(var10[2] <= var10[0]) && !(var10[3] <= var10[1])) {
                  TextureTarget var12 = this.m_3320(this.f_9702, var2, var9, var5.m_9638().m_8768(), var4, var5, false, var1, var8, var3, var10);
                  if (var12 != null) {
                     RenderPass var13 = RenderSystem.getDevice()
                        .createCommandEncoder()
                        .createRenderPass(() -> f_9866, this.f_9701.getColorTextureView(), var7 ? Optional.of(new Vector4f(0.0F)) : Optional.empty());

                     try {
                        var13.setPipeline(f_9683);
                        var13.bindTexture(f_9804, var12.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
                        this.m_3269(var13, this.f_9701, var10);
                        var13.draw(3, 1, 0, 0);
                     } catch (Throwable var17) {
                        if (var13 != null) {
                           try {
                              var13.close();
                           } catch (Throwable var16) {
                              var17.addSuppressed(var16);
                           }
                        }

                        throw var17;
                     }

                     if (var13 != null) {
                        var13.close();
                     }

                     var7 = false;
                  }
               }
            }
         }

         if (!var7) {
            this.m_3304(this.f_9702, var2, this.f_9701, false);
         }
      }
   }

   private int m_3278(Class_y7LCUoWgFH6Mz8SR var1) {
      return var1.m_9620().m_8768() ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : var1.m_9600().m_8768();
   }

   private int m_3279(Entity var1, EntityRenderState var2, int var3) {
      float var4 = 0.0F;
      float var5 = 0.0F;
      float var6 = 1.0F;
      float var7 = 1.0F;
      float var8 = 1.0F;
      if (this.f_9698 != null) {
         Vec3 var9 = f_11537.gameRenderer.mainCamera().position();
         float var10 = (float)(var2.x - var9.x);
         float var11 = (float)(var2.y - var9.y);
         float var12 = (float)(var2.z - var9.z);
         float var13 = Math.max(f_9774, var1.getBbHeight());
         this.f_9700.set(var10, var11 + var13 * f_9775, var12, 1.0F).mul(this.f_9698);
         var8 = Math.clamp(var13 * this.f_9699 / Math.max(this.f_9700.w, f_9776), f_9777, 1.0F);
         float var14 = Math.max(var1.getBbWidth(), var13 * f_9778);
         var5 = 1.0F;
         var4 = 1.0F;
         var7 = 0.0F;
         var6 = 0.0F;

         for (int var15 = 0; var15 < 8; var15++) {
            this.f_9700
               .set(
                  var10 + ((var15 & 1) == 0 ? -var14 : var14),
                  var11 + ((var15 & 2) == 0 ? -var13 * f_9779 : var13 * f_9780),
                  var12 + ((var15 & 4) == 0 ? -var14 : var14),
                  1.0F
               )
               .mul(this.f_9698);
            if (this.f_9700.w <= f_9781) {
               var5 = 0.0F;
               var4 = 0.0F;
               var7 = 1.0F;
               var6 = 1.0F;
               break;
            }

            float var16 = this.f_9700.x / this.f_9700.w * f_9782 + f_9783;
            float var17 = this.f_9700.y / this.f_9700.w * f_9784 + f_9785;
            var4 = Math.min(var4, var16);
            var5 = Math.min(var5, var17);
            var6 = Math.max(var6, var16);
            var7 = Math.max(var7, var17);
         }
      }

      int var18 = Math.clamp((int)Math.round(-Math.log(var8) / Math.log(f_9786) * f_9787), 0, 250);
      int var19 = var18 / 50;
      int var20 = Math.min(5, (var18 + 49) / 50);

      for (int var21 = var19; var21 <= var20; var21++) {
         this.f_9696[var3] = this.f_9696[var3] | 1 << var21;
         float[] var22 = this.f_9697[var3][var21];
         var22[0] = Math.min(var22[0], var4);
         var22[1] = Math.min(var22[1], var5);
         var22[2] = Math.max(var22[2], var6);
         var22[3] = Math.max(var22[3], var7);
      }

      return var18;
   }

   public boolean m_3281(Entity var1, Class_y7LCUoWgFH6Mz8SR var2) {
      if (var1 == null || var2 == null || !this.m_3273(var2)) {
         return false;
      } else if (!var1.isAlive() && !(var1 instanceof ItemEntity)) {
         return false;
      } else if (!this.m_3291(var1) && !this.m_3305(var1)) {
         Entity var3 = f_11537.getCameraEntity();
         return var3 != null && var1.distanceToSqr(var3) <= f_9772;
      } else {
         return false;
      }
   }

   private void m_3282(CommandEncoder var1, int var2, int var3, float var4) {
      GpuBuffer var5 = this.f_9718;
      GpuBuffer var6 = this.f_9719;
      this.f_9718 = this.m_3309(this.f_9718, 48, f_9837);
      this.f_9719 = this.m_3309(this.f_9719, 48, f_9838);
      boolean var7 = var5 != this.f_9718 || var6 != this.f_9719 || this.f_9741 != var2 || this.f_9742 != var3 || Float.compare(this.f_9743, var4) != 0;
      if (var7) {
         float var8 = Math.max(var4, 1.0F) * f_9839;
         float var9 = Math.max(Math.max(var4, 1.0F) * f_9840, 1.0F);
         float[] var10 = new float[6];
         var10[0] = 1.0F;
         float var11 = 1.0F;

         for (int var12 = 1; var12 < var10.length; var12++) {
            float var13 = var8 * var12;
            var10[var12] = (float)Math.exp(-(var13 * var13) / (2.0F * var9 * var9));
            var11 += var10[var12] * 2.0F;
         }

         for (int var17 = 0; var17 < var10.length; var17++) {
            var10[var17] /= var11;
         }

         MemoryStack var18 = MemoryStack.stackPush();

         try {
            ByteBuffer var19 = Std140Builder.onStack(var18, 48)
               .putVec2(1.0F / var2, 1.0F / var3)
               .putVec2(1.0F, 0.0F)
               .putVec4(var8, var10[0], var10[1], var10[2])
               .putVec4(var10[3], var10[4], var10[5], 0.0F)
               .get();
            var1.writeToBuffer(this.f_9718.slice(), var19);
            ByteBuffer var14 = Std140Builder.onStack(var18, 48)
               .putVec2(1.0F / var2, 1.0F / var3)
               .putVec2(0.0F, 1.0F)
               .putVec4(var8, var10[0], var10[1], var10[2])
               .putVec4(var10[3], var10[4], var10[5], 0.0F)
               .get();
            var1.writeToBuffer(this.f_9719.slice(), var14);
         } catch (Throwable var16) {
            if (var18 != null) {
               try {
                  var18.close();
               } catch (Throwable var15) {
                  var16.addSuppressed(var15);
               }
            }

            throw var16;
         }

         if (var18 != null) {
            var18.close();
         }

         this.f_9741 = var2;
         this.f_9742 = var3;
         this.f_9743 = var4;
      }
   }

   public int m_3283(Class_y7LCUoWgFH6Mz8SR var1) {
      if (var1 == null) {
         return 0;
      }

      int var2 = this.f_9694.indexOf(var1);
      return var2 < 0 ? 0 : f_9773 | var2 + 1 << 16;
   }

   private boolean m_3285(Class_y7LCUoWgFH6Mz8SR var1) {
      return var1.m_9607().m_7568(f_9856) || var1.m_9607().m_7568(f_9857) || var1.m_9610().m_8768();
   }

   private void m_3286(CommandEncoder var1, GpuTextureView var2, TextureTarget var3, int var4) {
      GpuTextureView var5 = var3.getColorTextureView();
      if (var5 != null && !var5.isClosed()) {
         GpuBuffer var6 = null;

         try {
            MemoryStack var7 = MemoryStack.stackPush();

            try {
               ByteBuffer var8 = Std140Builder.onStack(var7, 16)
                  .putVec4((var4 >> 16 & 0xFF) / f_9766, (var4 >> 8 & 0xFF) / f_9767, (var4 & 0xFF) / f_9768, (var4 >>> 24 & 0xFF) / f_9769)
                  .get();
               var6 = RenderSystem.getDevice().createBuffer(() -> f_9870, 128, var8);
               RenderPass var9 = var1.createRenderPass(() -> f_9869, var5, Optional.of(new Vector4f(0.0F)));

               try {
                  var9.setPipeline(f_9679);
                  var9.bindTexture(f_9770, var2, RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
                  var9.setUniform(f_9771, var6);
                  var9.draw(3, 1, 0, 0);
               } catch (Throwable var20) {
                  if (var9 != null) {
                     try {
                        var9.close();
                     } catch (Throwable var19) {
                        var20.addSuppressed(var19);
                     }
                  }

                  throw var20;
               }

               if (var9 != null) {
                  var9.close();
               }
            } catch (Throwable var21) {
               if (var7 != null) {
                  try {
                     var7.close();
                  } catch (Throwable var18) {
                     var21.addSuppressed(var18);
                  }
               }

               throw var21;
            }

            if (var7 != null) {
               var7.close();
            }
         } finally {
            if (var6 != null) {
               var6.close();
            }
         }
      }
   }

   private void m_3287() {
      this.f_9737.clear().limit(0);
      this.f_9741 = -1;
      this.f_9742 = -1;
      this.f_9743 = Float.NaN;
      this.f_9744 = -1;
      this.f_9745 = -1;
      this.f_9746 = Float.NaN;
   }

   private void m_3288(CommandEncoder var1, int var2, int var3, float var4) {
      GpuBuffer var5 = this.f_9708;
      GpuBuffer var6 = this.f_9709;
      this.f_9708 = this.m_3309(this.f_9708, 48, f_9824);
      this.f_9709 = this.m_3309(this.f_9709, 48, f_9825);
      if (var5 != this.f_9708 || var6 != this.f_9709 || this.f_9710 != var2 || this.f_9711 != var3 || Float.compare(this.f_9712, var4) != 0) {
         float[] var7 = new float[9];
         var7[0] = 1.0F;
         float var8 = 1.0F;

         for (int var9 = 1; var9 < var7.length; var9++) {
            var7[var9] = (float)Math.exp(-var9 * var9 / (2.0F * var4 * var4));
            var8 += var7[var9] * 2.0F;
         }

         for (int var22 = 0; var22 < var7.length; var22++) {
            var7[var22] /= var8;
         }

         float var23 = var7[1] + var7[2];
         float var10 = var7[3] + var7[4];
         float var11 = var7[5] + var7[6];
         float var12 = var7[7] + var7[8];
         float var13 = 1.0F + var7[2] / Math.max(var23, f_9826);
         float var14 = f_9827 + var7[4] / Math.max(var10, f_9828);
         float var15 = f_9829 + var7[6] / Math.max(var11, f_9830);
         float var16 = f_9831 + var7[8] / Math.max(var12, f_9832);
         MemoryStack var17 = MemoryStack.stackPush();

         try {
            ByteBuffer var18 = Std140Builder.onStack(var17, 48)
               .putVec4(1.0F / var2, 0.0F, var7[0], 0.0F)
               .putVec4(var13, var23, var14, var10)
               .putVec4(var15, var11, var16, var12)
               .get();
            ByteBuffer var19 = Std140Builder.onStack(var17, 48)
               .putVec4(0.0F, 1.0F / var3, var7[0], 0.0F)
               .putVec4(var13, var23, var14, var10)
               .putVec4(var15, var11, var16, var12)
               .get();
            var1.writeToBuffer(this.f_9708.slice(), var18);
            var1.writeToBuffer(this.f_9709.slice(), var19);
         } catch (Throwable var21) {
            if (var17 != null) {
               try {
                  var17.close();
               } catch (Throwable var20) {
                  var21.addSuppressed(var20);
               }
            }

            throw var21;
         }

         if (var17 != null) {
            var17.close();
         }

         this.f_9710 = var2;
         this.f_9711 = var3;
         this.f_9712 = var4;
      }
   }

   private void m_3290(int var1, int var2) {
      if (this.f_9713 == null || this.f_9714 == null) {
         this.f_9713 = new TextureTarget(f_9851, var1, var2, false, GpuFormat.RGBA8_UNORM);
         this.f_9714 = new TextureTarget(f_9852, var1, var2, false, GpuFormat.RGBA8_UNORM);
      } else if (this.f_9713.width != var1 || this.f_9713.height != var2) {
         this.f_9713.resize(var1, var2);
         this.f_9714.resize(var1, var2);
         this.m_3287();
      }
   }

   private boolean m_3291(Entity var1) {
      return (var1 == f_11537.player || var1 == f_11537.getCameraEntity()) && f_11537.options.getCameraType().isFirstPerson();
   }

   private void m_3292(CommandEncoder var1, RenderTarget var2, RenderTarget var3, GpuBuffer var4) {
      GpuTextureView var5 = var2.getColorTextureView();
      GpuTextureView var6 = var3.getColorTextureView();
      if (var5 != null && !var5.isClosed() && var6 != null && !var6.isClosed()) {
         RenderPass var7 = var1.createRenderPass(() -> f_9861, var6, Optional.of(new Vector4f(0.0F)));

         try {
            var7.setPipeline(f_9680);
            var7.bindTexture(f_9835, var5, RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
            var7.setUniform(f_9836, var4);
            var7.draw(3, 1, 0, 0);
         } catch (Throwable var11) {
            if (var7 != null) {
               try {
                  var7.close();
               } catch (Throwable var10) {
                  var11.addSuppressed(var10);
               }
            }

            throw var11;
         }

         if (var7 != null) {
            var7.close();
         }
      }
   }

   private void m_3293() {
      if (!this.f_9733) {
         Camera var1 = f_11537.gameRenderer.mainCamera();
         this.f_9698 = var1.isInitialized() ? var1.getViewRotationProjectionMatrix(new Matrix4f()) : null;
         if (this.f_9698 != null) {
            float var2 = this.f_9698.m01();
            float var3 = this.f_9698.m11();
            float var4 = this.f_9698.m21();
            this.f_9699 = (float)Math.sqrt(var2 * var2 + var3 * var3 + var4 * var4) * f_11537.gameRenderer.mainRenderTarget().height / f_9859;
         } else {
            this.f_9699 = 1.0F;
         }

         Arrays.fill(this.f_9696, 0);

         for (float[][] var5 : this.f_9697) {
            for (float[] var9 : var5) {
               var9[0] = var9[1] = 1.0F;
               var9[2] = var9[3] = 0.0F;
            }
         }

         this.f_9726 = 0;
         this.f_9724 = false;
         this.f_9733 = true;
         this.f_9730 = false;
         this.f_9731 = false;
         this.f_9734 = false;
         this.f_9735 = false;
         Arrays.fill(this.f_9695, false);
         this.f_9738 = 0.0F;
         this.f_9739 = -1;
         this.f_9740 = 1;
      }
   }

   public boolean m_3294() {
      return f_11537.player != null && f_11537.level != null && this.m_3329();
   }

   public Class_JYI3tOXLKmfxbnee(Function<Entity, Class_y7LCUoWgFH6Mz8SR> var1, Supplier<? extends Collection<Class_y7LCUoWgFH6Mz8SR>> var2) {
      this.f_9692 = var1;
      this.f_9693 = var2;
      this.f_9694 = List.copyOf((Collection<? extends Class_y7LCUoWgFH6Mz8SR>)var2.get());
      this.f_9695 = new boolean[this.f_9694.size()];
      this.f_9696 = new int[this.f_9694.size()];
      this.f_9697 = new float[this.f_9694.size()][6][4];
   }

   private int m_3296(Class_y7LCUoWgFH6Mz8SR var1) {
      return var1.m_9620().m_8768() ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : var1.m_9604().m_8768();
   }

   private void m_3297(RenderTarget var1, RenderTarget var2, float var3) {
      GpuTextureView var4 = var1.getColorTextureView();
      GpuTextureView var5 = var2.getColorTextureView();
      if (var4 != null && !var4.isClosed() && var5 != null && !var5.isClosed()) {
         CommandEncoder var6 = RenderSystem.getDevice().createCommandEncoder();
         this.m_3308(var6, var1.width, var1.height, var3);
         RenderPass var7 = var6.createRenderPass(() -> f_9862, var5, Optional.empty());

         try {
            var7.setPipeline(f_9690);
            var7.bindTexture(f_9833, var4, RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
            var7.setUniform(f_9834, this.f_9721);
            var7.draw(3, 1, 0, 0);
         } catch (Throwable var11) {
            if (var7 != null) {
               try {
                  var7.close();
               } catch (Throwable var10) {
                  var11.addSuppressed(var10);
               }
            }

            throw var11;
         }

         if (var7 != null) {
            var7.close();
         }
      }
   }

   public boolean m_3298(RenderTarget var1, RenderTarget var2) {
      if (this.f_9734 && var1 != null && var2 != null && var1.getColorTextureView() != null && var2.getColorTextureView() != null) {
         float var3 = this.f_9738;
         int var4 = this.f_9739;
         int var5 = this.f_9740;
         boolean var6 = this.f_9735;

         try {
            if (var6) {
               this.m_3315(var1, var2, var3, var4, var5, false);
            }

            for (int var7 = 0; var7 < this.f_9695.length; var7++) {
               if (this.f_9695[var7]) {
                  Class_y7LCUoWgFH6Mz8SR var8 = this.f_9694.get(var7);
                  if (var8.m_9640().m_8768() || var8.m_9619().m_8768()) {
                     this.m_3302(var1, var8, var7);
                     float var9 = var8.m_9640().m_8768() ? var8.m_9636().m_8768() : 0.0F;
                     if (var8.m_9619().m_8768()) {
                        this.m_3277(var1, var2, var7, var9, var8);
                     } else {
                        this.m_3297(this.f_9702, var2, var9);
                     }
                  }
               }
            }

            return true;
         } finally {
            this.m_3310();
         }
      } else {
         this.m_3310();
         return false;
      }
   }

   @Override
   public void close() {
      this.m_3310();
      if (this.f_9701 != null) {
         this.f_9701.destroyBuffers();
         this.f_9701 = null;
      }

      this.f_9717 = false;
      if (this.f_9715 != null) {
         this.f_9715.destroyBuffers();
         this.f_9715 = null;
      }

      if (this.f_9716 != null) {
         this.f_9716.close();
         this.f_9716 = null;
      }

      if (this.f_9728 != null) {
         this.f_9728.destroyBuffers();
         this.f_9728 = null;
      }

      if (this.f_9729 != null) {
         this.f_9729.close();
         this.f_9729 = null;
      }

      if (this.f_9702 != null) {
         this.f_9702.destroyBuffers();
         this.f_9702 = null;
      }

      if (this.f_9703 != null) {
         this.f_9703.close();
         this.f_9703 = null;
      }

      if (this.f_9727 != null) {
         this.f_9727.close();
         this.f_9727 = null;
      }

      if (this.f_9723 != null) {
         this.f_9723.destroyBuffers();
         this.f_9723 = null;
      }

      if (this.f_9704 != null) {
         this.f_9704.destroyBuffers();
         this.f_9704 = null;
      }

      if (this.f_9705 != null) {
         this.f_9705.destroyBuffers();
         this.f_9705 = null;
      }

      for (int var1 = 0; var1 < this.f_9706.length; var1++) {
         for (int var2 = 0; var2 < this.f_9706[var1].length; var2++) {
            if (this.f_9706[var1][var2] != null) {
               this.f_9706[var1][var2].destroyBuffers();
            }

            if (this.f_9707[var1][var2] != null) {
               this.f_9707[var1][var2].destroyBuffers();
            }

            this.f_9706[var1][var2] = null;
            this.f_9707[var1][var2] = null;
         }
      }

      if (this.f_9708 != null) {
         this.f_9708.close();
         this.f_9708 = null;
      }

      if (this.f_9709 != null) {
         this.f_9709.close();
         this.f_9709 = null;
      }

      if (this.f_9713 != null) {
         this.f_9713.destroyBuffers();
         this.f_9713 = null;
      }

      if (this.f_9714 != null) {
         this.f_9714.destroyBuffers();
         this.f_9714 = null;
      }

      if (this.f_9718 != null) {
         this.f_9718.close();
         this.f_9718 = null;
      }

      if (this.f_9719 != null) {
         this.f_9719.close();
         this.f_9719 = null;
      }

      if (this.f_9720 != null) {
         this.f_9720.close();
         this.f_9720 = null;
      }

      if (this.f_9721 != null) {
         this.f_9721.close();
         this.f_9721 = null;
      }

      if (this.f_9722 != null) {
         this.f_9722.close();
         this.f_9722 = null;
      }

      this.m_3287();
   }

   private void m_3300(CommandEncoder var1, GpuTextureView var2, TextureTarget var3) {
      GpuTextureView var4 = var3.getColorTextureView();
      if (var4 != null && !var4.isClosed()) {
         RenderPass var5 = var1.createRenderPass(() -> f_9871, var4, Optional.of(new Vector4f(0.0F)));

         try {
            var5.setPipeline(f_9678);
            var5.bindTexture(f_9765, var2, RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
            var5.draw(3, 1, 0, 0);
         } catch (Throwable var9) {
            if (var5 != null) {
               try {
                  var5.close();
               } catch (Throwable var8) {
                  var9.addSuppressed(var8);
               }
            }

            throw var9;
         }

         if (var5 != null) {
            var5.close();
         }
      }
   }

   private void m_3301(CommandEncoder var1, GpuTextureView var2, Matrix4f var3, float var4, int var5, int var6) {
      if (var2 != null && !var2.isClosed() && var3 != null) {
         if (this.f_9715 == null) {
            this.f_9715 = new TextureTarget(f_9760, var5, var6, false, GpuFormat.RGBA8_UNORM);
         } else if (this.f_9715.width != var5 || this.f_9715.height != var6) {
            this.f_9715.resize(var5, var6);
         }

         this.f_9716 = this.m_3309(this.f_9716, 80, f_9761);
         MemoryStack var7 = MemoryStack.stackPush();

         try {
            ByteBuffer var8 = Std140Builder.onStack(var7, 80).putMat4f(var3).putVec4(var4, 0.0F, 0.0F, 0.0F).get();
            var1.writeToBuffer(this.f_9716.slice(), var8);
         } catch (Throwable var13) {
            if (var7 != null) {
               try {
                  var7.close();
               } catch (Throwable var11) {
                  var13.addSuppressed(var11);
               }
            }

            throw var13;
         }

         if (var7 != null) {
            var7.close();
         }

         RenderPass var14 = var1.createRenderPass(() -> f_9872, this.f_9715.getColorTextureView(), Optional.empty());

         try {
            var14.setPipeline(f_9688);
            var14.setUniform(f_9762, this.f_9716);
            var14.bindTexture(f_9763, var2, RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
            var14.bindTexture(f_9764, this.f_9713.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
            var14.draw(3, 1, 0, 0);
         } catch (Throwable var12) {
            if (var14 != null) {
               try {
                  var14.close();
               } catch (Throwable var10) {
                  var12.addSuppressed(var10);
               }
            }

            throw var12;
         }

         if (var14 != null) {
            var14.close();
         }

         this.f_9717 = true;
      }
   }

   private void m_3302(RenderTarget var1, Class_y7LCUoWgFH6Mz8SR var2, int var3) {
      if (this.f_9702 == null) {
         this.f_9702 = new TextureTarget(f_9788, var1.width, var1.height, false, GpuFormat.RGBA8_UNORM);
      } else if (this.f_9702.width != var1.width || this.f_9702.height != var1.height) {
         this.f_9702.resize(var1.width, var1.height);
      }

      CommandEncoder var4 = RenderSystem.getDevice().createCommandEncoder();
      this.f_9703 = this.m_3309(this.f_9703, 32, f_9789);
      int var5 = this.m_3296(var2);
      MemoryStack var6 = MemoryStack.stackPush();

      try {
         ByteBuffer var7 = Std140Builder.onStack(var6, 32)
            .putVec4(m_3267(var5, 16), m_3267(var5, 8), m_3267(var5, 0), 1.0F)
            .putVec4(var3 + 1, 0.0F, 0.0F, 0.0F)
            .get();
         var4.writeToBuffer(this.f_9703.slice(), var7);
      } catch (Throwable var12) {
         if (var6 != null) {
            try {
               var6.close();
            } catch (Throwable var10) {
               var12.addSuppressed(var10);
            }
         }

         throw var12;
      }

      if (var6 != null) {
         var6.close();
      }

      RenderPass var13 = var4.createRenderPass(() -> f_9868, this.f_9702.getColorTextureView(), Optional.empty());

      try {
         var13.setPipeline(f_9677);
         var13.bindTexture(f_9790, var1.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
         var13.setUniform(f_9791, this.f_9703);
         var13.draw(3, 1, 0, 0);
      } catch (Throwable var11) {
         if (var13 != null) {
            try {
               var13.close();
            } catch (Throwable var9) {
               var11.addSuppressed(var9);
            }
         }

         throw var11;
      }

      if (var13 != null) {
         var13.close();
      }
   }

   private static RenderPipeline m_3303(String var0) {
      return Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(var0 + "")
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_9747))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(var0))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2727()
         .m_2714(GpuFormat.RGBA16_FLOAT)
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2741(f_9748)
         .m_2722();
   }

   private void m_3304(RenderTarget var1, RenderTarget var2, RenderTarget var3, boolean var4) {
      CommandEncoder var5 = RenderSystem.getDevice().createCommandEncoder();
      GpuTextureView var6 = var2.getColorTextureView();
      GpuTextureView var7 = var1.getColorTextureView();
      GpuTextureView var8 = var3.getColorTextureView();
      RenderPass var9 = var5.createRenderPass(() -> f_9864, var6, Optional.empty());

      try {
         var9.setPipeline(var4 ? f_9684 : f_9681);
         var9.bindTexture(f_9818, var8, RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
         var9.bindTexture(f_9819, var7, RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
         var9.setUniform(f_9820, this.f_9720);
         var9.draw(3, 1, 0, 0);
      } catch (Throwable var13) {
         if (var9 != null) {
            try {
               var9.close();
            } catch (Throwable var12) {
               var13.addSuppressed(var12);
            }
         }

         throw var13;
      }

      if (var9 != null) {
         var9.close();
      }
   }

   private boolean m_3305(Entity var1) {
      Vec3 var2 = f_11537.gameRenderer.mainCamera().position();
      return var1.getBoundingBox().inflate(f_9858).contains(var2);
   }

   private void m_3308(CommandEncoder var1, int var2, int var3, float var4) {
      GpuBuffer var5 = this.f_9721;
      this.f_9721 = this.m_3309(this.f_9721, 96, f_9847);
      boolean var6 = var5 != this.f_9721 || this.f_9744 != var2 || this.f_9745 != var3 || Float.compare(this.f_9746, var4) != 0;
      if (var6) {
         MemoryStack var7 = MemoryStack.stackPush();

         try {
            ByteBuffer var8 = Std140Builder.onStack(var7, 96)
               .putVec4(0.0F, 0.0F, var4, 0.0F)
               .putVec4(1.0F, f_9848, 2.0F, 0.0F)
               .putVec4(1.0F, 1.0F, 1.0F, 1.0F)
               .putVec4(1.0F, 1.0F, 1.0F, 1.0F)
               .putVec4(0.0F, 0.0F, 0.0F, 0.0F)
               .putVec2(var2, var3)
               .get();
            var1.writeToBuffer(this.f_9721.slice(), var8);
         } catch (Throwable var11) {
            if (var7 != null) {
               try {
                  var7.close();
               } catch (Throwable var10) {
                  var11.addSuppressed(var10);
               }
            }

            throw var11;
         }

         if (var7 != null) {
            var7.close();
         }

         this.f_9744 = var2;
         this.f_9745 = var3;
         this.f_9746 = var4;
      }
   }

   private GpuBuffer m_3309(GpuBuffer var1, int var2, String var3) {
      return var1 != null && !var1.isClosed() ? var1 : RenderSystem.getDevice().createBuffer(() -> var3, 136, var2);
   }

   private void m_3310() {
      this.f_9698 = null;
      Arrays.fill(this.f_9696, 0);
      this.f_9726 = 0;
      this.f_9724 = false;
      this.f_9733 = false;
      this.f_9730 = false;
      this.f_9731 = false;
      this.f_9734 = false;
      this.f_9735 = false;
      Arrays.fill(this.f_9695, false);
      this.f_9738 = 0.0F;
      this.f_9739 = -1;
      this.f_9740 = 1;
   }

   public void m_3311(PreparedRenderType var1, GpuBuffer var2, GpuBuffer var3, IndexType var4, int var5, int var6, int var7) {
      if (this.f_9731) {
         this.m_3276(var1, var2, var3, var4, var5, var6, var7);
      }

      if (this.f_9735 && (this.f_9740 == 2 || this.f_9740 == 3)) {
         if (!this.f_9724) {
            this.m_3326();
         }

         RenderTarget var8 = f_11537.gameRenderer.mainRenderTarget();
         if (this.f_9723 == null) {
            this.f_9723 = new TextureTarget(f_9749, var8.width, var8.height, true, GpuFormat.RGBA8_UNORM);
         } else if (this.f_9723.width != var8.width || this.f_9723.height != var8.height) {
            this.f_9723.resize(var8.width, var8.height);
            this.f_9724 = false;
         }

         GpuTextureView var9 = this.f_9723.getColorTextureView();
         GpuTextureView var10 = this.f_9723.getDepthTextureView();
         if (var9 != null && !var9.isClosed() && var10 != null && !var10.isClosed()) {
            RenderPass var11 = RenderSystem.getDevice()
               .createCommandEncoder()
               .createRenderPass(
                  () -> f_9874,
                  var9,
                  this.f_9724 ? Optional.empty() : Optional.of(new Vector4f(0.0F)),
                  var10,
                  this.f_9724 ? OptionalDouble.empty() : OptionalDouble.of(0.0)
               );

            try {
               var11.setPipeline(f_9732);
               ScissorState var12 = var1.scissorState();
               if (var12.enabled()) {
                  var11.enableScissor(var12.x(), var12.y(), var12.width(), var12.height());
               }

               RenderSystem.bindDefaultUniforms(var11);
               var11.setUniform(f_9750, var1.dynamicTransforms());
               var11.setUniform(f_9751, this.f_9727);
               var11.setVertexBuffer(0, var2.slice());
               var11.setIndexBuffer(var3, var4);
               var1.textures().forEach(var1x -> var11.bindTexture(var1x.name(), var1x.textureView(), var1x.sampler()));
               var11.drawIndexed(var7, 1, var6, var5, 0);
            } catch (Throwable var15) {
               if (var11 != null) {
                  try {
                     var11.close();
                  } catch (Throwable var14) {
                     var15.addSuppressed(var14);
                  }
               }

               throw var15;
            }

            if (var11 != null) {
               var11.close();
            }

            this.f_9724 = true;
         }
      }
   }

   public boolean m_3312() {
      return this.f_9734;
   }

   private void m_3315(RenderTarget var1, RenderTarget var2, float var3, int var4, int var5, boolean var6) {
      if (!(var3 <= f_9792)) {
         GpuTextureView var7 = var1.getColorTextureView();
         GpuTextureView var8 = var2.getColorTextureView();
         if (var7 != null && !var7.isClosed() && var8 != null && !var8.isClosed()) {
            CommandEncoder var9 = RenderSystem.getDevice().createCommandEncoder();
            GpuTextureView var10 = var7;
            if (var5 == 4) {
               int var11 = Math.max(1, var2.width / 2);
               int var12 = Math.max(1, var2.height / 2);
               this.m_3317(var11, var12);
               this.m_3282(var9, var11, var12, f_9793);
               this.m_3292(var9, var2, this.f_9704, this.f_9718);
               this.m_3292(var9, this.f_9704, this.f_9705, this.f_9719);
               var10 = this.f_9705.getColorTextureView();
               if (var10 == null || var10.isClosed()) {
                  return;
               }
            }

            this.f_9722 = this.m_3309(this.f_9722, 80, f_9794);
            GpuTextureView var22 = !var6 && this.f_9724 && this.f_9723 != null ? this.f_9723.getColorTextureView() : null;
            boolean var23 = var22 != null && !var22.isClosed();
            MemoryStack var13 = MemoryStack.stackPush();

            try {
               float var14 = m_3267(var4, 16);
               float var15 = m_3267(var4, 8);
               float var16 = m_3267(var4, 0);
               Std140Builder var17 = Std140Builder.onStack(var13, 80)
                  .putVec4(Math.clamp(var3, 0.0F, 1.0F), var6 ? 0.0F : 1.0F, 0.0F, var5)
                  .putVec4(var14, var15, var16, 1.0F)
                  .putVec4(var14, var15, var16, 1.0F)
                  .putVec4(var14, var15, var16, 1.0F)
                  .putVec4(var1.width, var1.height, var23 ? 1.0F : 0.0F, (float)(System.currentTimeMillis() % f_9795) / f_9796);
               var9.writeToBuffer(this.f_9722.slice(), var17.get());
            } catch (Throwable var21) {
               if (var13 != null) {
                  try {
                     var13.close();
                  } catch (Throwable var19) {
                     var21.addSuppressed(var19);
                  }
               }

               throw var21;
            }

            if (var13 != null) {
               var13.close();
            }

            RenderPass var24 = var9.createRenderPass(() -> f_9867, var8, Optional.empty());

            try {
               var24.setPipeline(f_9691);
               var24.bindTexture(f_9797, var7, RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
               var24.bindTexture(f_9798, var10, RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
               var24.bindTexture(f_9799, var23 ? var22 : var7, RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
               var24.setUniform(f_9800, this.f_9722);
               var24.draw(3, 1, 0, 0);
            } catch (Throwable var20) {
               if (var24 != null) {
                  try {
                     var24.close();
                  } catch (Throwable var18) {
                     var20.addSuppressed(var18);
                  }
               }

               throw var20;
            }

            if (var24 != null) {
               var24.close();
            }
         }
      }
   }

   private void m_3316(RenderTarget var1, RenderTarget var2, float var3, float var4, float var5, Class_y7LCUoWgFH6Mz8SR var6, boolean var7) {
      TextureTarget var8 = this.m_3320(var1, var2, var3, var4, var5, var6, var7, var1, -1, -1, null);
      if (var8 != null) {
         this.m_3304(var1, var2, var8, var7);
      }
   }

   private void m_3317(int var1, int var2) {
      if (this.f_9704 == null || this.f_9705 == null) {
         this.f_9704 = new TextureTarget(f_9849, var1, var2, false, GpuFormat.RGBA8_UNORM);
         this.f_9705 = new TextureTarget(f_9850, var1, var2, false, GpuFormat.RGBA8_UNORM);
         this.m_3287();
      } else if (this.f_9704.width != var1 || this.f_9704.height != var2) {
         this.f_9704.resize(var1, var2);
         this.f_9705.resize(var1, var2);
         this.m_3287();
      }
   }

   private TextureTarget m_3320(
      RenderTarget var1,
      RenderTarget var2,
      float var3,
      float var4,
      float var5,
      Class_y7LCUoWgFH6Mz8SR var6,
      boolean var7,
      RenderTarget var8,
      int var9,
      int var10,
      float[] var11
   ) {
      GpuTextureView var12 = var1.getColorTextureView();
      GpuTextureView var13 = var2.getColorTextureView();
      if (var12 != null && !var12.isClosed() && var13 != null && !var13.isClosed()) {
         var3 = Math.clamp(var3, var7 ? 1.0F : f_9805, f_9806);
         int var14 = var3 > f_9807 ? 2 : (var3 > f_9808 ? 1 : 0);
         this.m_3268(var1.width, var1.height, var14, var7);
         TextureTarget[] var15 = this.f_9706[var7 ? 1 : 0];
         TextureTarget var16 = this.f_9707[var7 ? 1 : 0][var14];
         GpuTextureView var17 = var15[0].getColorTextureView();
         CommandEncoder var18 = RenderSystem.getDevice().createCommandEncoder();
         float var19 = 2 << var14;
         float var20 = var14 == 2 ? f_9809 : (var14 == 1 ? f_9810 : 0.0F);
         float var21 = (float)Math.sqrt(Math.max(var7 ? f_9811 : f_9812, (var3 * var3 * f_9813 - var20) / (var19 * var19)));
         this.m_3288(var18, var15[var14].width, var15[var14].height, var21);
         this.m_3325(var18, var1.width, var1.height, var4, var5, var6, var7, var9, var10, Math.min(1.0F, var3));
         RenderPass var22 = var18.createRenderPass(() -> f_9865, var17, var11 != null ? Optional.of(new Vector4f(0.0F)) : Optional.empty());

         try {
            var22.setPipeline(f_9682);
            var22.bindTexture(f_9814, var12, RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
            var22.bindTexture(f_9815, var8.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
            GpuTextureView var23 = var7 ? (this.f_9717 ? this.f_9715.getColorTextureView() : var12) : (this.f_9730 ? this.f_9728.getColorTextureView() : var12);
            var22.bindTexture(f_9816, var23, RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
            var22.setUniform(f_9817, this.f_9720);
            this.m_3269(var22, var15[0], var11);
            var22.draw(3, 1, 0, 0);
         } catch (Throwable var26) {
            if (var22 != null) {
               try {
                  var22.close();
               } catch (Throwable var25) {
                  var26.addSuppressed(var25);
               }
            }

            throw var26;
         }

         if (var22 != null) {
            var22.close();
         }

         for (int var28 = 1; var28 <= var14; var28++) {
            this.m_3321(var18, var15[var28 - 1], var15[var28], f_9686, null, var11);
         }

         this.m_3321(var18, var15[var14], var16, f_9685, this.f_9708, var11);
         this.m_3321(var18, var16, var15[var14], f_9685, this.f_9709, var11);

         for (int var29 = var14 - 1; var29 >= 0; var29--) {
            this.m_3321(var18, var15[var29 + 1], var15[var29], f_9687, null, var11);
         }

         return var15[0];
      } else {
         return null;
      }
   }

   private void m_3321(CommandEncoder var1, RenderTarget var2, RenderTarget var3, RenderPipeline var4, GpuBuffer var5, float[] var6) {
      RenderPass var7 = var1.createRenderPass(() -> f_9863, var3.getColorTextureView(), var6 != null ? Optional.of(new Vector4f(0.0F)) : Optional.empty());

      try {
         var7.setPipeline(var4);
         var7.bindTexture(f_9822, var2.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
         if (var5 != null) {
            var7.setUniform(f_9823, var5);
         }

         this.m_3269(var7, var3, var6);
         var7.draw(3, 1, 0, 0);
      } catch (Throwable var11) {
         if (var7 != null) {
            try {
               var7.close();
            } catch (Throwable var10) {
               var11.addSuppressed(var10);
            }
         }

         throw var11;
      }

      if (var7 != null) {
         var7.close();
      }
   }

   public boolean m_3322(RenderTarget var1, RenderTarget var2, Class_y7LCUoWgFH6Mz8SR var3) {
      this.f_9717 = false;
      if (var3 == null || !this.m_3266(var3)) {
         return false;
      }

      if (var1 != null && var2 != null && var1.getColorTextureView() != null && var2.getColorTextureView() != null) {
         if (var3.m_9613().m_8768()) {
            this.m_3315(var1, var2, var3.m_9618().m_8768(), this.m_3278(var3), this.m_3271(var3), true);
         }

         if (var3.m_9640().m_8768() || var3.m_9619().m_8768()) {
            if (var3.m_9619().m_8768()) {
               this.m_3316(var1, var2, var3.m_9632().m_8768(), var3.m_9638().m_8768(), var3.m_9640().m_8768() ? var3.m_9636().m_8768() : 0.0F, var3, true);
            } else {
               this.m_3297(var1, var2, var3.m_9636().m_8768());
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public void m_3324() {
      this.m_3310();
   }

   private void m_3325(
      CommandEncoder var1, int var2, int var3, float var4, float var5, Class_y7LCUoWgFH6Mz8SR var6, boolean var7, int var8, int var9, float var10
   ) {
      GpuBuffer var11 = this.f_9720;
      this.f_9720 = this.m_3309(this.f_9720, 144, f_9841);
      int var12 = var6.m_9607().m_7568(f_9842) ? 3 : (var6.m_9607().m_7568(f_9843) ? 2 : (var6.m_9607().m_7568(f_9844) ? 1 : 0));
      boolean var13 = var6.m_9610().m_8768();
      boolean var14 = var6.m_9620().m_8768();
      int var15 = var14 ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : var6.m_9609().m_8768();
      int var16 = var14 ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN_TWO) : var6.m_9625().m_8768();
      int var17 = this.m_3296(var6);
      float var18 = var6.m_9624().m_8768();
      float var19 = var6.m_9615().m_8768();
      float var20 = var6.m_9616().m_8768();
      float var21 = (var12 != 2 || !(var18 > 0.0F)) && (var12 != 3 || !(var20 > 0.0F)) && (!var13 || !(var19 > 0.0F))
         ? 0.0F
         : (float)(System.nanoTime() - this.f_9736) / f_9845;
      MemoryStack var22 = MemoryStack.stackPush();

      label116: {
         try {
            ByteBuffer var23 = Std140Builder.onStack(var22, 144)
               .putVec4(var6.m_9599().m_8768(), 2.0F, f_9846, var4)
               .putVec4(m_3267(var15, 16), m_3267(var15, 8), m_3267(var15, 0), m_3267(var15, 24))
               .putVec4(m_3267(var16, 16), m_3267(var16, 8), m_3267(var16, 0), m_3267(var16, 24))
               .putVec4(m_3267(var17, 16), m_3267(var17, 8), m_3267(var17, 0), 1.0F)
               .putVec4(var2, var3, var5, (var7 ? !this.f_9717 : !this.f_9730) ? 0.0F : 1.0F)
               .putVec4(var12, var6.m_9630().m_8768(), var21, var18)
               .putVec4(var6.m_9626().m_8768(), var6.m_9642().m_8768(), var13 ? 1.0F : 0.0F, var19)
               .putVec4(var20, var6.m_9627().m_8768(), var6.m_9611().m_8768(), var7 ? 1.0F : 0.0F)
               .putVec4(var8, var8 >= 0 ? 1.0F : 0.0F, var10, var9 + 1)
               .get();
            if (var11 == this.f_9720 && this.f_9737.equals(var23)) {
               break label116;
            }

            this.f_9737.clear().put(var23).flip();
            var23.rewind();
            var1.writeToBuffer(this.f_9720.slice(), var23);
         } catch (Throwable var26) {
            if (var22 != null) {
               try {
                  var22.close();
               } catch (Throwable var25) {
                  var26.addSuppressed(var25);
               }
            }

            throw var26;
         }

         if (var22 != null) {
            var22.close();
         }

         return;
      }

      if (var22 != null) {
         var22.close();
      }
   }

   private void m_3326() {
      this.f_9727 = this.m_3309(this.f_9727, 1056, f_9756);
      Matrix4f var1 = Class_FvJXUGWpZo3zYBW4.m_2691();
      Vec3 var2 = f_11537.gameRenderer.mainCamera().position();
      Vector4f var3 = new Vector4f();
      Vector4f var4 = new Vector4f(0.0F, 1.0F, 0.0F, 0.0F);
      if (var1 != null) {
         var4.mul(var1);
      }

      MemoryStack var5 = MemoryStack.stackPush();

      try {
         Std140Builder var6 = Std140Builder.onStack(var5, 1056)
            .putVec4(var1 == null ? 0.0F : this.f_9726, f_11537.gameRenderer.mainRenderTarget().width, f_11537.gameRenderer.mainRenderTarget().height, 0.0F)
            .putVec4(var4.x, var4.y, var4.z, 0.0F);

         for (int var7 = 0; var7 < 64; var7++) {
            if (var1 != null && var7 < this.f_9726) {
               double[] var8 = this.f_9725[var7];
               var3.set((float)(var8[0] - var2.x), (float)(var8[1] - var2.y), (float)(var8[2] - var2.z), 1.0F).mul(var1);
               var6.putVec4(var3.x, var3.y, var3.z, (float)var8[3]);
            } else {
               var6.putVec4(0.0F, 0.0F, 0.0F, 1.0F);
            }
         }

         RenderSystem.getDevice().createCommandEncoder().writeToBuffer(this.f_9727.slice(), var6.get());
      } catch (Throwable var10) {
         if (var5 != null) {
            try {
               var5.close();
            } catch (Throwable var9) {
               var10.addSuppressed(var9);
            }
         }

         throw var10;
      }

      if (var5 != null) {
         var5.close();
      }
   }

   private boolean m_3329() {
      Collection var1 = this.f_9693.get();
      if (var1 != null && !var1.isEmpty()) {
         for (Class_y7LCUoWgFH6Mz8SR var3 : (Iterable<Class_y7LCUoWgFH6Mz8SR>) (Iterable) var1) {
            if (this.m_3273(var3)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public boolean m_3330() {
      return this.m_3294();
   }
}
