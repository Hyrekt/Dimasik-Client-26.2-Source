package dev.dimasik.client.system;

import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.IndexType;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.ProjectionType;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.pipeline.TextureTarget;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.shaders.UniformType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.AutoStorageIndexBuffer;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.MeshData;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.MeshData.DrawState;
import com.mojang.math.Axis;
import dev.dimasik.mixin.RenderPipelinesMixin;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Random;
import net.minecraft.client.Camera;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector4f;

public final class Class_oV1nLcU0paHSE9Oj implements Class_NzJrN63M7QBpmAbi {
   private static final Identifier f_26511 = Identifier.fromNamespaceAndPath(Class_oV1nLcU0paHSE9Oj.f_27889, Class_oV1nLcU0paHSE9Oj.f_27890);
   private static final Identifier f_26512 = Identifier.fromNamespaceAndPath(Class_oV1nLcU0paHSE9Oj.f_27891, Class_oV1nLcU0paHSE9Oj.f_27892);
   private static final Identifier f_26513 = Identifier.fromNamespaceAndPath(Class_oV1nLcU0paHSE9Oj.f_27893, Class_oV1nLcU0paHSE9Oj.f_27894);
   private static final Identifier f_26514 = Identifier.fromNamespaceAndPath(Class_oV1nLcU0paHSE9Oj.f_27895, Class_oV1nLcU0paHSE9Oj.f_27896);
   private static final Identifier f_26515 = Identifier.fromNamespaceAndPath(Class_oV1nLcU0paHSE9Oj.f_27897, Class_oV1nLcU0paHSE9Oj.f_27898);
   private static final Identifier f_26516 = Identifier.fromNamespaceAndPath(Class_oV1nLcU0paHSE9Oj.f_27899, Class_oV1nLcU0paHSE9Oj.f_27900);
   private static final Identifier f_26517 = Identifier.fromNamespaceAndPath(Class_oV1nLcU0paHSE9Oj.f_27901, Class_oV1nLcU0paHSE9Oj.f_27902);
   private static final Identifier f_26518 = Identifier.fromNamespaceAndPath(Class_oV1nLcU0paHSE9Oj.f_27903, Class_oV1nLcU0paHSE9Oj.f_27904);
   private static final Identifier f_26519 = Identifier.fromNamespaceAndPath(Class_oV1nLcU0paHSE9Oj.f_27905, Class_oV1nLcU0paHSE9Oj.f_27906);
   private static final RenderPipeline f_26520 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
      .m_2726(Class_oV1nLcU0paHSE9Oj.f_27907)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27908))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27909))
      .m_2719(CompareOp.ALWAYS_PASS)
      .m_2737(false)
      .m_2725(false)
      .m_2732(BlendFunction.ADDITIVE)
      .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
      .m_2741(Class_oV1nLcU0paHSE9Oj.f_27910)
      .m_2722();
   private static final RenderPipeline f_26521 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
      .m_2726(Class_oV1nLcU0paHSE9Oj.f_27911)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27912))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27913))
      .m_2719(CompareOp.ALWAYS_PASS)
      .m_2737(false)
      .m_2725(true)
      .m_2732(BlendFunction.ADDITIVE)
      .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
      .m_2741(Class_oV1nLcU0paHSE9Oj.f_27914)
      .m_2722();
   private static final RenderPipeline f_26522 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
      .m_2726(Class_oV1nLcU0paHSE9Oj.f_27915)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27916))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27917))
      .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
      .m_2737(false)
      .m_2725(true)
      .m_2732(BlendFunction.ADDITIVE)
      .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
      .m_2741(Class_oV1nLcU0paHSE9Oj.f_27918)
      .m_2722();
   private static final RenderPipeline f_26523 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
      .m_2726(Class_oV1nLcU0paHSE9Oj.f_27919)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27920))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27921))
      .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
      .m_2737(false)
      .m_2725(true)
      .m_2732(BlendFunction.TRANSLUCENT)
      .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
      .m_2722();
   private static final RenderPipeline f_26524 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
      .m_2726(Class_oV1nLcU0paHSE9Oj.f_27922)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27923))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27924))
      .m_2719(CompareOp.ALWAYS_PASS)
      .m_2737(false)
      .m_2725(true)
      .m_2732(BlendFunction.TRANSLUCENT)
      .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
      .m_2722();
   private static final RenderPipeline f_26525 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
      .m_2726(Class_oV1nLcU0paHSE9Oj.f_27925)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27926))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27927))
      .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
      .m_2737(false)
      .m_2725(false)
      .m_2732(BlendFunction.ADDITIVE)
      .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
      .m_2741(Class_oV1nLcU0paHSE9Oj.f_27928)
      .m_2722();
   private static final RenderPipeline f_26526 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
      .m_2726(Class_oV1nLcU0paHSE9Oj.f_27929)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27930))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27931))
      .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
      .m_2737(false)
      .m_2725(false)
      .m_2732(BlendFunction.LIGHTNING)
      .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.TRIANGLES)
      .m_2722();
   private static final RenderPipeline f_26527 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
      .m_2726(Class_oV1nLcU0paHSE9Oj.f_27932)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27933))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27934))
      .m_2719(CompareOp.ALWAYS_PASS)
      .m_2737(false)
      .m_2725(false)
      .m_2732(BlendFunction.LIGHTNING)
      .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.TRIANGLES)
      .m_2722();
   private static final RenderPipeline f_26528 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
      .m_2726(Class_oV1nLcU0paHSE9Oj.f_27935)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27936))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27937))
      .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
      .m_2737(false)
      .m_2725(false)
      .m_2732(BlendFunction.LIGHTNING)
      .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
      .m_2741(Class_oV1nLcU0paHSE9Oj.f_27938)
      .m_2722();
   private static final RenderPipeline f_26529 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
      .m_2726(Class_oV1nLcU0paHSE9Oj.f_27939)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27940))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27941))
      .m_2719(CompareOp.ALWAYS_PASS)
      .m_2737(false)
      .m_2725(false)
      .m_2732(BlendFunction.LIGHTNING)
      .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
      .m_2741(Class_oV1nLcU0paHSE9Oj.f_27942)
      .m_2722();
   private static final RenderPipeline f_26530 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
      .m_2726(Class_oV1nLcU0paHSE9Oj.f_27943)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27944))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27945))
      .m_2719(CompareOp.ALWAYS_PASS)
      .m_2737(false)
      .m_2725(false)
      .m_2732(BlendFunction.ADDITIVE)
      .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
      .m_2722();
   private static final RenderPipeline f_26531 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
      .m_2726(Class_oV1nLcU0paHSE9Oj.f_27946)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27947))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27948))
      .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
      .m_2737(false)
      .m_2725(false)
      .m_2732(BlendFunction.ADDITIVE)
      .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
      .m_2722();
   private static final RenderPipeline f_26532 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
      .m_2726(Class_oV1nLcU0paHSE9Oj.f_27949)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27950))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27951))
      .m_2719(CompareOp.ALWAYS_PASS)
      .m_2737(false)
      .m_2725(false)
      .m_2732(BlendFunction.OVERLAY)
      .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
      .m_2722();
   private static final RenderPipeline f_26533 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
      .m_2726(Class_oV1nLcU0paHSE9Oj.f_27952)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27953))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27954))
      .m_2719(CompareOp.ALWAYS_PASS)
      .m_2737(false)
      .m_2725(false)
      .m_2727()
      .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
      .m_2722();
   private static final RenderPipeline f_26534 = Class_GEnQMkY73qXewYpU.m_2718()
      .m_2726(Class_oV1nLcU0paHSE9Oj.f_27955)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27956))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27957))
      .m_2719(CompareOp.ALWAYS_PASS)
      .m_2737(false)
      .m_2725(false)
      .m_2732(BlendFunction.TRANSLUCENT)
      .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
      .m_2741(Class_oV1nLcU0paHSE9Oj.f_27958)
      .m_2722();
   private static final RenderPipeline f_26535 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
      .m_2726(Class_oV1nLcU0paHSE9Oj.f_27959)
      .m_2721(1.0F, 1.0F)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27960))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27961))
      .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
      .m_2737(false)
      .m_2725(false)
      .m_2732(BlendFunction.ADDITIVE)
      .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
      .m_2741(Class_oV1nLcU0paHSE9Oj.f_27962)
      .m_2722();
   private static final RenderPipeline f_26536 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
      .m_2726(Class_oV1nLcU0paHSE9Oj.f_27963)
      .m_2721(1.0F, 1.0F)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27964))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27965))
      .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
      .m_2737(true)
      .m_2725(false)
      .m_2732(BlendFunction.ADDITIVE)
      .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
      .m_2741(Class_oV1nLcU0paHSE9Oj.f_27966)
      .m_2722();
   private static final RenderPipeline f_26537 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
      .m_2726(Class_oV1nLcU0paHSE9Oj.f_27967)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27968))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27969))
      .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
      .m_2737(false)
      .m_2725(false)
      .m_2732(BlendFunction.ADDITIVE)
      .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
      .m_2722();
   private static final RenderPipeline f_26538 = Class_GEnQMkY73qXewYpU.m_2718()
      .m_2726(Class_oV1nLcU0paHSE9Oj.f_27970)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27971))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27972))
      .m_2719(CompareOp.ALWAYS_PASS)
      .m_2737(false)
      .m_2725(false)
      .m_2732(BlendFunction.TRANSLUCENT)
      .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
      .m_2741(Class_oV1nLcU0paHSE9Oj.f_27973)
      .m_2722();
   private static final RenderPipeline f_26539 = Class_GEnQMkY73qXewYpU.m_2718(RenderPipelinesMixin.getPositionColorSnippet())
      .m_2726(Class_oV1nLcU0paHSE9Oj.f_27974)
      .m_2719(CompareOp.ALWAYS_PASS)
      .m_2737(false)
      .m_2725(false)
      .m_2732(BlendFunction.ADDITIVE)
      .m_2739(DefaultVertexFormat.POSITION_COLOR, PrimitiveTopology.DEBUG_LINES)
      .m_2722();
   private static final RenderPipeline f_26540 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
      .m_2726(Class_oV1nLcU0paHSE9Oj.f_27975)
      .m_2729(Class_oV1nLcU0paHSE9Oj.f_27976, UniformType.UNIFORM_BUFFER)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27977))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_oV1nLcU0paHSE9Oj.f_27978))
      .m_2719(CompareOp.ALWAYS_PASS)
      .m_2737(false)
      .m_2725(false)
      .m_2732(BlendFunction.ADDITIVE)
      .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
      .m_2722();
   private static final float f_26541 = 0.82F;
   private static final float f_26542 = 0.7F;
   private static LivingEntity f_26543;
   private static float f_26544;
   private static float f_26545;
   private static long f_26546;
   private static String f_26547 = "";
   private static final List<Vector3f> f_26548 = new ArrayList<>();
   private static final float[][] f_26549 = new float[][]{
      {0.0F, Class_oV1nLcU0paHSE9Oj.f_27979, 0.0F},
      {0.0F, Class_oV1nLcU0paHSE9Oj.f_27980, 0.0F},
      {1.0F, 0.0F, 0.0F},
      {Class_oV1nLcU0paHSE9Oj.f_27981, 0.0F, 0.0F},
      {0.0F, 0.0F, 1.0F},
      {0.0F, 0.0F, Class_oV1nLcU0paHSE9Oj.f_27982}
   };
   private static final int[][] f_26550 = new int[][]{{0, 4, 2}, {0, 3, 4}, {0, 5, 3}, {0, 2, 5}, {1, 2, 4}, {1, 4, 3}, {1, 3, 5}, {1, 5, 2}};
   private static final float[] f_26551 = new float[]{
      1.0F,
      Class_oV1nLcU0paHSE9Oj.f_27983,
      Class_oV1nLcU0paHSE9Oj.f_27984,
      Class_oV1nLcU0paHSE9Oj.f_27985,
      Class_oV1nLcU0paHSE9Oj.f_27986,
      Class_oV1nLcU0paHSE9Oj.f_27987,
      Class_oV1nLcU0paHSE9Oj.f_27988,
      Class_oV1nLcU0paHSE9Oj.f_27989
   };
   private static int f_26552 = Class_oV1nLcU0paHSE9Oj.f_27990;
   private static float f_26553;
   private static float f_26554;
   private static final List<Vector3f> f_26555 = new ArrayList<>();
   private static int f_26556 = Class_oV1nLcU0paHSE9Oj.f_27991;
   private static final Random f_26557 = new Random();
   private static final List<Class_oV1nLcU0paHSE9Oj.vbgKRi4F34zTzWmv> f_26558 = new ArrayList<>();
   private static long f_26559;
   private static TextureTarget f_26560;
   private static final LinkedList<Vec3>[] f_26561 = new LinkedList[]{new LinkedList(), new LinkedList(), new LinkedList(), new LinkedList(), new LinkedList()};
   private static final List<Class_oV1nLcU0paHSE9Oj.CefWHVrCHHOwSLC4> f_26562 = new ArrayList<>();
   private static double f_26563;
   private static final long f_26564 = System.currentTimeMillis();
   private static float f_26565;
   private static long f_26566 = System.nanoTime();
   private static long f_26567;
   private static int f_26568 = -1;
   private static int f_26569 = Class_oV1nLcU0paHSE9Oj.f_27992;
   private static float f_26570 = Class_oV1nLcU0paHSE9Oj.f_27993;
   private static String f_26571 = Class_oV1nLcU0paHSE9Oj.f_27994;
   private static String f_26572 = Class_oV1nLcU0paHSE9Oj.f_27995;
   private static final double[] f_26573 = m_7908(true);
   private static final double[] f_26574 = m_7908(false);
   private static final int f_26575 = 3;
   private static final int f_26576 = 20;
   private static final float f_26577 = 1.0F;
   private static final double f_26578 = 0.0035;
   private static final double f_26579 = 0.1;
   private static final float f_26580 = 1.0F;
   private static final double f_26581 = 1.15;
   private static final double f_26582 = 9.0;
   private static final float f_26583 = 0.18F;
   private static final double f_26584 = 1.7;
   private static final float f_26585 = 0.25F;
   private static final float f_26586 = 0.22F;
   private static final float f_26587 = 0.12F;
   private static final int f_26588 = 26;
   private static final double f_26589 = 3.1;
   private static float f_26590 = 1.0F;
   private static float f_26591;
   private static double f_26592;
   private static boolean f_26593;
   private static int f_26594 = Class_oV1nLcU0paHSE9Oj.f_27996;
   private static int f_26595 = 3;
   private static boolean f_26596 = true;
   private static String f_26597 = Class_oV1nLcU0paHSE9Oj.f_27997;
   private static long f_26598;
   private static float f_26599;
   private static float f_26600;
   private static String f_26601 = Class_oV1nLcU0paHSE9Oj.f_27998;
   private static boolean f_26602;
   private static String f_26603 = Class_oV1nLcU0paHSE9Oj.f_27999;
   private static boolean f_26604;
   private static boolean f_26605 = true;
   private static String f_26606 = "";
   private static String f_26607 = "";
   private static String f_26608 = "";
   private static final LinkedList<Class_oV1nLcU0paHSE9Oj.BNt5vHvMwoeyBNKB> f_26609 = new LinkedList<>();
   private static long f_26610;
   private static int f_26611 = Class_oV1nLcU0paHSE9Oj.f_28000;
   private static final int f_26612 = 3;
   private static final long f_26613 = 200L;
   private static final int f_26614 = 28;
   private static final int f_26615 = 4;
   private static final long f_26616 = 90L;
   private static final List<Class_oV1nLcU0paHSE9Oj.F0nIo1tGX54h6o8A> f_26617 = new ArrayList<>();
   private static long f_26618;
   private static final int f_26619 = 18;
   private static final int f_26620 = 2;
   private static final long f_26621 = 60L;
   private static final int f_26622 = 3;
   private static final List<Class_oV1nLcU0paHSE9Oj.SjzMjyMYX7ylg4dN> f_26623 = new ArrayList<>();
   private static long f_26624;
   private static int f_26625 = Class_oV1nLcU0paHSE9Oj.f_28001;
   private static float f_26626;
   private static TextureTarget f_26627;
   private static boolean f_26628;
   private static float f_26629 = Class_oV1nLcU0paHSE9Oj.f_28002;
   private static boolean f_26630;
   private static boolean f_26631 = true;
   private static boolean f_26632;
   private static int f_26633 = -1;
   private static float f_26634 = 1.0F;
   private static float f_26635;
   private static boolean f_26636;
   private static boolean f_26637;
   private static double f_26638;
   private static double f_26639;
   private static double f_26640;
   private static double f_26641;
   private static double f_26642;
   private static double f_26643;
   private static boolean f_26644;
   private static Class_TZhU50s8XmBQCMP5 f_26645;
   private static LivingEntity f_26646;
   private static String f_26647;
   private static int f_26648;
   private static int f_26649;
   private static GpuBufferSlice f_26650;
   private static ProjectionType f_26651;
   private static final Identifier f_26652 = Class_wHRRCm2tlLY7DN4I.m_9311(Class_oV1nLcU0paHSE9Oj.f_28003);
   private static final RenderPipeline f_26653 = Class_8eJhbT3fP9R0tMrZ.m_1814(Class_oV1nLcU0paHSE9Oj.f_28004, CompareOp.GREATER_THAN_OR_EQUAL);
   private static final RenderPipeline f_26654 = Class_8eJhbT3fP9R0tMrZ.m_1814(Class_oV1nLcU0paHSE9Oj.f_28005, CompareOp.ALWAYS_PASS);
   private static float f_26655 = Class_oV1nLcU0paHSE9Oj.f_28006;
   private static int f_26656 = 14;
   private static boolean f_26657 = true;
   private static float f_26658;
   private static long f_26659;
   private static int f_26660 = Class_oV1nLcU0paHSE9Oj.f_28007;
   private static int f_26661;
   private static final float f_26662 = 0.1F;
   private static final float f_26663 = 5.0F;
   private static final String f_26664 = "Тип 1";
   private static final String f_26665 = "Тип 1";
   private static final String f_26666 = "Тип 1";
   private static final String f_26667 = "Тип 1";
   private static final String f_26668 = "Тип 2";
   private static final int f_26669 = Integer.MIN_VALUE;
   private static final int f_26670 = Integer.MIN_VALUE;
   private static final int f_26671 = Integer.MIN_VALUE;
   private static final int f_26672 = Integer.MIN_VALUE;
   private static final float f_26673 = 0.01F;
   private static final float f_26674 = 0.01F;
   private static final float f_26675 = 5.5F;
   private static final String f_26676 = "InSampler";
   private static final String f_26677 = "Призраки";
   private static final String f_26678 = "Кристалики";
   private static final String f_26679 = "Молнии";
   private static final float f_26680 = 0.1F;
   private static final float f_26681 = 1000.0F;
   private static final String f_26682 = "Кольцо";
   private static final String f_26683 = "Тип 3";
   private static final String f_26684 = "Куб";
   private static final float f_26685 = 1.05F;
   private static final float f_26686 = 0.3F;
   private static final String f_26687 = "Молнии";
   private static final String f_26688 = "Тип 3";
   private static final int f_26689 = Integer.MIN_VALUE;
   private static final int f_26690 = Integer.MIN_VALUE;
   private static final int f_26691 = Integer.MIN_VALUE;
   private static final int f_26692 = Integer.MIN_VALUE;
   private static final String f_26693 = "Кристалики";
   private static final String f_26694 = "Тип 4";
   private static final float f_26695 = 1000.0F;
   private static final float f_26696 = 0.15F;
   private static final double f_26697 = Math.PI;
   private static final double f_26698 = 2.0;
   private static final float f_26699 = 0.001F;
   private static final float f_26700 = 0.01F;
   private static final int f_26701 = -65536;
   private static final int f_26702 = -65536;
   private static final String f_26703 = "Призраки";
   private static final String f_26704 = "Кристалики";
   private static final String f_26705 = "Молнии";
   private static final String f_26706 = "Кольцо";
   private static final String f_26707 = "Обруч";
   private static final String f_26708 = "Призраки";
   private static final String f_26709 = "Кристалики";
   private static final String f_26710 = "Ромбики";
   private static final String f_26711 = "Молнии";
   private static final String f_26712 = "Куб";
   private static final String f_26713 = "Квадрат";
   private static final String f_26714 = "Треугольник";
   private static final String f_26715 = "Пентограмма";
   private static final String f_26716 = "Тип 3";
   private static final String f_26717 = "Тип 2";
   private static final int f_26718 = Integer.MIN_VALUE;
   private static final String f_26719 = "Тип 2";
   private static final String f_26720 = "Тип 3";
   private static final String f_26721 = "Тип 4";
   private static final String f_26722 = "Тип 5";
   private static final String f_26723 = "Тип 6";
   private static final String f_26724 = "Тип 7";
   private static final String f_26725 = "Тип 8";
   private static final int f_26726 = Integer.MIN_VALUE;
   private static final int f_26727 = Integer.MIN_VALUE;
   private static final String f_26728 = "Тип 2";
   private static final String f_26729 = "Тип 3";
   private static final String f_26730 = "Тип 4";
   private static final String f_26731 = "Тип 3";
   private static final String f_26732 = "Тип 1";
   private static final String f_26733 = "Тип 3";
   private static final String f_26734 = "Never";
   private static final String f_26735 = "Auto";
   private static final String f_26736 = "Молнии";
   private static final String f_26737 = "Кристалики";
   private static final long f_26738 = 360000L;
   private static final float f_26739 = 11.5F;
   private static final float f_26740 = 0.001F;
   private static final float f_26741 = 1.18F;
   private static final float f_26742 = 0.18F;
   private static final double f_26743 = 0.035;
   private static final double f_26744 = 1.7;
   private static final double f_26745 = 2.41;
   private static final float f_26746 = 0.68F;
   private static final float f_26747 = 0.3F;
   private static final float f_26748 = 0.36F;
   private static final float f_26749 = 0.28F;
   private static final float f_26750 = 0.42F;
   private static final double f_26751 = 0.035;
   private static final double f_26752 = 1.7;
   private static final double f_26753 = 2.41;
   private static final float f_26754 = 1.15F;
   private static final float f_26755 = -0.9F;
   private static final float f_26756 = 37.7F;
   private static final float f_26757 = 91.345F;
   private static final float f_26758 = 12.17F;
   private static final float f_26759 = 43758.547F;
   private static final float f_26760 = 0.075F;
   private static final float f_26761 = 0.115F;
   private static final float f_26762 = 0.03F;
   private static final float f_26763 = 0.8F;
   private static final float f_26764 = 1.73F;
   private static final float f_26765 = 0.06F;
   private static final float f_26766 = 255.0F;
   private static final float f_26767 = 155.0F;
   private static final float f_26768 = 0.7F;
   private static final float f_26769 = 1.08F;
   private static final long f_26770 = 360000L;
   private static final float f_26771 = 40.0F;
   private static final long f_26772 = 360000L;
   private static final float f_26773 = 11.5F;
   private static final float f_26774 = 0.001F;
   private static final float f_26775 = 1.27F;
   private static final float f_26776 = 0.08F;
   private static final float f_26777 = 0.85F;
   private static final float f_26778 = 0.55F;
   private static final float f_26779 = 1.18F;
   private static final float f_26780 = 0.18F;
   private static final float f_26781 = 0.18F;
   private static final float f_26782 = 3.6F;
   private static final float f_26783 = 0.09F;
   private static final float f_26784 = 1.8F;
   private static final float f_26785 = 0.24F;
   private static final float f_26786 = 0.28F;
   private static final float f_26787 = 0.34F;
   private static final float f_26788 = 255.0F;
   private static final float f_26789 = 155.0F;
   private static final float f_26790 = 1.08F;
   private static final float f_26791 = 0.82F;
   private static final float f_26792 = 1.18F;
   private static final float f_26793 = 1.0E-5F;
   private static final float f_26794 = 1.7F;
   private static final float f_26795 = 2.41F;
   private static final float f_26796 = 0.035F;
   private static final float f_26797 = 6.8F;
   private static final float f_26798 = 0.88F;
   private static final float f_26799 = 0.5F;
   private static final float f_26800 = 1.15F;
   private static final float f_26801 = -0.9F;
   private static final float f_26802 = 37.7F;
   private static final float f_26803 = 360.0F;
   private static final float f_26804 = 0.82F;
   private static final float f_26805 = 0.42F;
   private static final float f_26806 = 0.18F;
   private static final float f_26807 = 1.75F;
   private static final float f_26808 = 0.02F;
   private static final float f_26809 = 0.08F;
   private static final float f_26810 = 0.82F;
   private static final float f_26811 = 0.82F;
   private static final float f_26812 = 1.35F;
   private static final float f_26813 = 0.45F;
   private static final float f_26814 = 1.5F;
   private static final float f_26815 = 14.0F;
   private static final float f_26816 = 0.85F;
   private static final float f_26817 = 0.12F;
   private static final float f_26818 = 18.0F;
   private static final float f_26819 = 0.16F;
   private static final float f_26820 = 0.42F;
   private static final float f_26821 = 205.0F;
   private static final float f_26822 = 0.78F;
   private static final float f_26823 = 0.95F;
   private static final float f_26824 = 112.0F;
   private static final float f_26825 = 0.35F;
   private static final float f_26826 = 0.6F;
   private static final float f_26827 = 300.0F;
   private static final float f_26828 = 0.58F;
   private static final float f_26829 = 0.82F;
   private static final float f_26830 = 55.0F;
   private static final float f_26831 = 0.48F;
   private static final float f_26832 = 0.35F;
   private static final float f_26833 = 238.0F;
   private static final float f_26834 = 0.2F;
   private static final float f_26835 = 1.05F;
   private static final float f_26836 = 150.0F;
   private static final float f_26837 = 0.68F;
   private static final float f_26838 = 0.58F;
   private static final float f_26839 = 342.0F;
   private static final float f_26840 = 0.88F;
   private static final float f_26841 = 0.9F;
   private static final float f_26842 = 88.0F;
   private static final float f_26843 = 0.55F;
   private static final float f_26844 = 0.48F;
   private static final float f_26845 = 275.0F;
   private static final float f_26846 = 0.4F;
   private static final float f_26847 = 1.12F;
   private static final float f_26848 = 24.0F;
   private static final float f_26849 = 0.72F;
   private static final float f_26850 = 0.68F;
   private static final float f_26851 = 190.0F;
   private static final float f_26852 = 0.3F;
   private static final float f_26853 = 0.38F;
   private static final float f_26854 = 128.0F;
   private static final float f_26855 = 0.62F;
   private static final float f_26856 = 0.94F;
   private static final float f_26857 = 318.0F;
   private static final float f_26858 = 0.83F;
   private static final float f_26859 = 0.55F;
   private static final float f_26860 = 63.0F;
   private static final float f_26861 = 0.12F;
   private static final float f_26862 = 0.76F;
   private static final float f_26863 = 224.0F;
   private static final float f_26864 = 0.5F;
   private static final float f_26865 = 1.08F;
   private static final float f_26866 = 165.0F;
   private static final float f_26867 = 0.92F;
   private static final float f_26868 = 0.45F;
   private static final float f_26869 = 355.0F;
   private static final float f_26870 = 0.26F;
   private static final float f_26871 = 0.87F;
   private static final float f_26872 = 98.0F;
   private static final float f_26873 = 0.66F;
   private static final float f_26874 = 0.62F;
   private static final float f_26875 = 260.0F;
   private static final float f_26876 = 0.44F;
   private static final float f_26877 = 38.0F;
   private static final float f_26878 = 0.76F;
   private static final float f_26879 = 0.52F;
   private static final float f_26880 = 208.0F;
   private static final float f_26881 = 0.57F;
   private static final float f_26882 = 0.72F;
   private static final float f_26883 = 330.0F;
   private static final float f_26884 = 0.14F;
   private static final float f_26885 = 0.58F;
   private static final float f_26886 = 82.0F;
   private static final float f_26887 = 0.32F;
   private static final float f_26888 = 0.5F;
   private static final float f_26889 = 176.0F;
   private static final float f_26890 = 0.5F;
   private static final float f_26891 = 0.68F;
   private static final float f_26892 = 286.0F;
   private static final float f_26893 = 0.7F;
   private static final float f_26894 = 0.56F;
   private static final float f_26895 = 44.0F;
   private static final float f_26896 = 0.88F;
   private static final float f_26897 = 0.74F;
   private static final float f_26898 = 0.08F;
   private static final float f_26899 = 0.04F;
   private static final double f_26900 = Math.PI / 2;
   private static final double f_26901 = Math.PI / 2;
   private static final double f_26902 = Math.PI / 2;
   private static final double f_26903 = Math.PI / 2;
   private static final float f_26904 = 0.22F;
   private static final float f_26905 = 1.08F;
   private static final double f_26906 = 0.18;
   private static final double f_26907 = 0.82;
   private static final double f_26908 = 0.34;
   private static final double f_26909 = 0.155;
   private static final double f_26910 = 0.031;
   private static final double f_26911 = 0.2;
   private static final double f_26912 = 0.8;
   private static final double f_26913 = 0.58;
   private static final double f_26914 = 0.58;
   private static final int f_26915 = -65536;
   private static final float f_26916 = 0.76F;
   private static final float f_26917 = 0.24F;
   private static final float f_26918 = 0.35F;
   private static final double f_26919 = 3.0;
   private static final double f_26920 = 0.19;
   private static final double f_26921 = 0.02;
   private static final double f_26922 = 0.014;
   private static final double f_26923 = 0.3;
   private static final double f_26924 = 0.12;
   private static final double f_26925 = 0.05;
   private static final double f_26926 = 2.45;
   private static final double f_26927 = 0.05;
   private static final double f_26928 = 0.04;
   private static final double f_26929 = 0.045;
   private static final double f_26930 = 0.018;
   private static final double f_26931 = 0.96;
   private static final double f_26932 = 0.04;
   private static final double f_26933 = 0.065;
   private static final double f_26934 = 0.018;
   private static final double f_26935 = Math.PI;
   private static final double f_26936 = 2.15;
   private static final double f_26937 = 0.9;
   private static final double f_26938 = Math.PI * 2;
   private static final double f_26939 = Math.PI * 2;
   private static final double f_26940 = -Math.PI / 2;
   private static final double f_26941 = Math.PI;
   private static final double f_26942 = -Math.PI / 2;
   private static final double f_26943 = Math.PI;
   private static final double f_26944 = Math.PI * 2;
   private static final double f_26945 = Math.PI * 2;
   private static final String f_26946 = "target-esp-cube-core";
   private static final float f_26947 = 1.4F;
   private static final long f_26948 = 100000L;
   private static final float f_26949 = 1.5F;
   private static final float f_26950 = 360.0F;
   private static final float f_26951 = 80.0F;
   private static final float f_26952 = 0.08F;
   private static final float f_26953 = 0.002F;
   private static final float f_26954 = 0.3F;
   private static final float f_26955 = 0.007F;
   private static final float f_26956 = 0.5F;
   private static final float f_26957 = 1.2F;
   private static final float f_26958 = 0.5F;
   private static final float f_26959 = 0.15F;
   private static final float f_26960 = -0.15F;
   private static final float f_26961 = 5.0F;
   private static final float f_26962 = 0.62F;
   private static final float f_26963 = 6.0F;
   private static final float f_26964 = 0.05F;
   private static final double f_26965 = 2.0;
   private static final float f_26966 = 20.0F;
   private static final float f_26967 = 0.7F;
   private static final double f_26968 = 0.15;
   private static final double f_26969 = 10.0;
   private static final double f_26970 = 25.0;
   private static final double f_26971 = 0.285;
   private static final double f_26972 = -1.0;
   private static final double f_26973 = -1.0;
   private static final double f_26974 = -1.0;
   private static final double f_26975 = -1.0;
   private static final double f_26976 = -1.0;
   private static final int f_26977 = Integer.MIN_VALUE;
   private static final float f_26978 = 0.22F;
   private static final float f_26979 = 0.22F;
   private static final float f_26980 = 0.22F;
   private static final float f_26981 = 0.78F;
   private static final float f_26982 = 0.01F;
   private static final float f_26983 = 0.12F;
   private static final double f_26984 = 9.0;
   private static final double f_26985 = 0.5;
   private static final float f_26986 = 0.65F;
   private static final float f_26987 = 0.45F;
   private static final double f_26988 = 0.7;
   private static final double f_26989 = 1.15;
   private static final float f_26990 = 0.18F;
   private static final float f_26991 = 0.001F;
   private static final float f_26992 = 0.8F;
   private static final float f_26993 = 0.5F;
   private static final double f_26994 = 0.1;
   private static final double f_26995 = 1.7;
   private static final float f_26996 = 0.7F;
   private static final float f_26997 = 0.25F;
   private static final float f_26998 = 20.0F;
   private static final double f_26999 = 0.0035;
   private static final float f_27000 = 4.0F;
   private static final float f_27001 = 0.12F;
   private static final float f_27002 = 0.21F;
   private static final float f_27003 = 0.01F;
   private static final double f_27004 = 3.1;
   private static final float f_27005 = 0.4F;
   private static final float f_27006 = 0.12F;
   private static final float f_27007 = 0.24F;
   private static final double f_27008 = 0.55;
   private static final double f_27009 = Math.PI * 2;
   private static final double f_27010 = 26.0;
   private static final double f_27011 = 0.15;
   private static final double f_27012 = 3.0;
   private static final float f_27013 = 6.0F;
   private static final double f_27014 = 0.35;
   private static final float f_27015 = 1.5F;
   private static final long f_27016 = 900L;
   private static final float f_27017 = 900.0F;
   private static final float f_27018 = 1.25F;
   private static final float f_27019 = 1.05F;
   private static final float f_27020 = 0.4F;
   private static final long f_27021 = 25L;
   private static final double f_27022 = 0.15;
   private static final double f_27023 = 25.0;
   private static final double f_27024 = -1.0;
   private static final float f_27025 = 0.2F;
   private static final double f_27026 = -1.0;
   private static final double f_27027 = -1.0;
   private static final float f_27028 = 0.2F;
   private static final double f_27029 = -1.0;
   private static final double f_27030 = -1.0;
   private static final float f_27031 = 0.2F;
   private static final double f_27032 = 0.14;
   private static final double f_27033 = 1.0E-5;
   private static final double f_27034 = 5.0;
   private static final double f_27035 = 0.5;
   private static final double f_27036 = 1.5;
   private static final double f_27037 = 0.1;
   private static final double f_27038 = 0.65;
   private static final double f_27039 = 0.1;
   private static final double f_27040 = 0.65;
   private static final double f_27041 = 0.1;
   private static final double f_27042 = 0.65;
   private static final float f_27043 = 2.1F;
   private static final float f_27044 = 0.7F;
   private static final float f_27045 = 0.24F;
   private static final float f_27046 = 0.14F;
   private static final float f_27047 = 2.1F;
   private static final float f_27048 = 0.48F;
   private static final double f_27049 = 0.7;
   private static final double f_27050 = 0.7;
   private static final double f_27051 = -1.0;
   private static final double f_27052 = -1.0;
   private static final double f_27053 = -1.0;
   private static final float f_27054 = 2.70158F;
   private static final float f_27055 = 1.70158F;
   private static final long f_27056 = 200L;
   private static final float f_27057 = 0.01F;
   private static final float f_27058 = 0.6F;
   private static final float f_27059 = 0.5F;
   private static final float f_27060 = 0.2F;
   private static final float f_27061 = 0.38F;
   private static final float f_27062 = 0.45F;
   private static final float f_27063 = 0.85F;
   private static final float f_27064 = 0.02F;
   private static final long f_27065 = 90L;
   private static final float f_27066 = 0.02F;
   private static final float f_27067 = 0.38F;
   private static final float f_27068 = 0.14F;
   private static final float f_27069 = 0.2F;
   private static final float f_27070 = 0.22F;
   private static final float f_27071 = 0.02F;
   private static final float f_27072 = 0.14F;
   private static final float f_27073 = 2.2F;
   private static final float f_27074 = 0.55F;
   private static final float f_27075 = 1.35F;
   private static final float f_27076 = 0.75F;
   private static final float f_27077 = 0.02F;
   private static final float f_27078 = 0.14F;
   private static final float f_27079 = 0.45F;
   private static final float f_27080 = 0.6F;
   private static final float f_27081 = 0.25F;
   private static final float f_27082 = 0.45F;
   private static final float f_27083 = 0.12F;
   private static final float f_27084 = 0.16F;
   private static final float f_27085 = 0.5F;
   private static final float f_27086 = 0.5F;
   private static final float f_27087 = 1.05F;
   private static final float f_27088 = 0.55F;
   private static final float f_27089 = 0.82F;
   private static final float f_27090 = 0.1F;
   private static final float f_27091 = 0.12F;
   private static final float f_27092 = 0.55F;
   private static final float f_27093 = 0.25F;
   private static final float f_27094 = 1.25F;
   private static final float f_27095 = 0.55F;
   private static final float f_27096 = 0.9F;
   private static final float f_27097 = 0.1F;
   private static final float f_27098 = 0.25F;
   private static final float f_27099 = 0.2F;
   private static final float f_27100 = 1.25F;
   private static final float f_27101 = 0.55F;
   private static final double f_27102 = Math.PI;
   private static final double f_27103 = 2.0;
   private static final float f_27104 = 1.2F;
   private static final float f_27105 = 0.35F;
   private static final float f_27106 = 0.03F;
   private static final float f_27107 = 100.0F;
   private static final float f_27108 = 100.0F;
   private static final float f_27109 = 0.12F;
   private static final float f_27110 = 0.78F;
   private static final float f_27111 = 0.22F;
   private static final float f_27112 = 0.92F;
   private static final float f_27113 = 0.08F;
   private static final long f_27114 = 90L;
   private static final float f_27115 = 19.37F;
   private static final float f_27116 = 0.5F;
   private static final float f_27117 = 0.35F;
   private static final float f_27118 = 0.5F;
   private static final float f_27119 = 0.1F;
   private static final float f_27120 = 0.5F;
   private static final float f_27121 = 0.07F;
   private static final double f_27122 = Math.PI;
   private static final double f_27123 = 2.0;
   private static final float f_27124 = 0.92F;
   private static final float f_27125 = 1.1F;
   private static final double f_27126 = 0.14;
   private static final long f_27127 = 31L;
   private static final long f_27128 = 97L;
   private static final double f_27129 = 1.0E-6;
   private static final double f_27130 = 0.55;
   private static final float f_27131 = 27.0F;
   private static final double f_27132 = 0.015;
   private static final double f_27133 = 1.0E-8;
   private static final double f_27134 = 0.85;
   private static final double f_27135 = 1.0E-8;
   private static final double f_27136 = 0.5;
   private static final double f_27137 = 2.0;
   private static final double f_27138 = 0.5;
   private static final double f_27139 = 2.0;
   private static final double f_27140 = 0.35;
   private static final double f_27141 = 0.5;
   private static final double f_27142 = 0.5;
   private static final double f_27143 = 0.5;
   private static final float f_27144 = 1.0E-4F;
   private static final double f_27145 = 1.0E-10;
   private static final double f_27146 = 0.5;
   private static final double f_27147 = 1.0E-8;
   private static final double f_27148 = 1.0E-8;
   private static final double f_27149 = 1.0E-8;
   private static final double f_27150 = -1.0;
   private static final double f_27151 = 1.0E-8;
   private static final float f_27152 = 0.5F;
   private static final float f_27153 = 0.5F;
   private static final float f_27154 = 0.5F;
   private static final float f_27155 = 0.5F;
   private static final float f_27156 = 1.0E-4F;
   private static final float f_27157 = 0.001F;
   private static final double f_27158 = 1.0E-9;
   private static final double f_27159 = 0.9;
   private static final double f_27160 = 1.0E-9;
   private static final double f_27161 = -1.0;
   private static final double f_27162 = 1.0E-9;
   private static final float f_27163 = 4.0F;
   private static final float f_27164 = 0.25F;
   private static final float f_27165 = 0.001F;
   private static final float f_27166 = 2.4F;
   private static final float f_27167 = 2.4F;
   private static final double f_27168 = Math.PI * 2;
   private static final double f_27169 = 6.0;
   private static final double f_27170 = Math.PI * 2;
   private static final double f_27171 = 6.0;
   private static final float f_27172 = 6.0F;
   private static final float f_27173 = 6.0F;
   private static final float f_27174 = 0.72F;
   private static final float f_27175 = 0.28F;
   private static final double f_27176 = Math.PI;
   private static final double f_27177 = 0.75;
   private static final float f_27178 = 6.0F;
   private static final float f_27179 = 15.0F;
   private static final float f_27180 = 10.0F;
   private static final float f_27181 = 0.5F;
   private static final float f_27182 = 0.5F;
   private static final int f_27183 = 374761393;
   private static final int f_27184 = 668265263;
   private static final int f_27185 = 1274126177;
   private static final float f_27186 = 0.5F;
   private static final float f_27187 = 2.03F;
   private static final float f_27188 = 0.5F;
   private static final double f_27189 = 1.0E-9;
   private static final double f_27190 = 0.75;
   private static final long f_27191 = 60L;
   private static final float f_27192 = 0.01F;
   private static final float f_27193 = 0.4F;
   private static final float f_27194 = 0.9F;
   private static final double f_27195 = Math.PI;
   private static final float f_27196 = 0.02F;
   private static final double f_27197 = 1.0E-9;
   private static final float f_27198 = 0.3F;
   private static final float f_27199 = 0.34F;
   private static final float f_27200 = 0.18F;
   private static final float f_27201 = 0.18F;
   private static final float f_27202 = 0.3F;
   private static final float f_27203 = 0.09F;
   private static final float f_27204 = 0.42F;
   private static final float f_27205 = 0.05F;
   private static final float f_27206 = 0.6F;
   private static final float f_27207 = 0.028F;
   private static final float f_27208 = 0.85F;
   private static final float f_27209 = 0.014F;
   private static final float f_27210 = 0.006F;
   private static final double f_27211 = 0.6;
   private static final double f_27212 = 0.5;
   private static final double f_27213 = 0.2;
   private static final double f_27214 = 0.22;
   private static final double f_27215 = 0.18;
   private static final float f_27216 = 1.6F;
   private static final float f_27217 = 1.2F;
   private static final float f_27218 = 0.85F;
   private static final float f_27219 = 0.9F;
   private static final float f_27220 = (float) Math.PI;
   private static final float f_27221 = 0.82F;
   private static final float f_27222 = 0.1F;
   private static final float f_27223 = 0.18F;
   private static final double f_27224 = 0.06;
   private static final double f_27225 = 0.4;
   private static final float f_27226 = 0.55F;
   private static final float f_27227 = 0.35F;
   private static final float f_27228 = 100.0F;
   private static final float f_27229 = 0.85F;
   private static final float f_27230 = 0.55F;
   private static final double f_27231 = Math.PI;
   private static final double f_27232 = 2.0;
   private static final double f_27233 = 0.5;
   private static final double f_27234 = 0.35;
   private static final double f_27235 = 0.92;
   private static final double f_27236 = 0.16;
   private static final double f_27237 = 0.06;
   private static final double f_27238 = 0.88;
   private static final double f_27239 = 0.5;
   private static final double f_27240 = 0.05;
   private static final double f_27241 = 0.5;
   private static final double f_27242 = 0.5;
   private static final double f_27243 = 2.0;
   private static final double f_27244 = 0.5;
   private static final double f_27245 = 0.5;
   private static final double f_27246 = 0.9;
   private static final double f_27247 = Math.PI;
   private static final double f_27248 = 2.0;
   private static final long f_27249 = 80L;
   private static final float f_27250 = 0.4F;
   private static final long f_27251 = 30L;
   private static final float f_27252 = 0.35F;
   private static final float f_27253 = 0.85F;
   private static final float f_27254 = 0.2F;
   private static final float f_27255 = 0.4F;
   private static final float f_27256 = 0.6F;
   private static final float f_27257 = 0.07F;
   private static final float f_27258 = 0.8F;
   private static final float f_27259 = 0.2F;
   private static final double f_27260 = 0.05;
   private static final float f_27261 = 0.015F;
   private static final float f_27262 = 0.001F;
   private static final float f_27263 = 0.001F;
   private static final float f_27264 = 0.5F;
   private static final float f_27265 = 0.5F;
   private static final float f_27266 = 0.5F;
   private static final float f_27267 = 0.5F;
   private static final float f_27268 = 0.045F;
   private static final float f_27269 = 0.6F;
   private static final float f_27270 = 0.5F;
   private static final float f_27271 = 0.024F;
   private static final float f_27272 = 11.0F;
   private static final float f_27273 = 0.012F;
   private static final float f_27274 = 0.55F;
   private static final float f_27275 = 0.45F;
   private static final float f_27276 = 23.0F;
   private static final double f_27277 = 0.55;
   private static final double f_27278 = 0.5;
   private static final double f_27279 = 0.18;
   private static final double f_27280 = Math.PI;
   private static final double f_27281 = 2.0;
   private static final double f_27282 = 0.2;
   private static final double f_27283 = 0.55;
   private static final double f_27284 = 0.2;
   private static final double f_27285 = 0.55;
   private static final double f_27286 = 0.5;
   private static final double f_27287 = 1.25;
   private static final double f_27288 = 0.9;
   private static final double f_27289 = 1.6;
   private static final double f_27290 = 2.4;
   private static final double f_27291 = 2.6;
   private static final double f_27292 = 0.55;
   private static final double f_27293 = 0.35;
   private static final double f_27294 = 1.0E-6;
   private static final double f_27295 = -1.0;
   private static final double f_27296 = 1.0E-8;
   private static final double f_27297 = -1.0;
   private static final double f_27298 = 0.5;
   private static final double f_27299 = 0.35;
   private static final double f_27300 = 0.55;
   private static final double f_27301 = 0.15;
   private static final double f_27302 = 0.4;
   private static final float f_27303 = 0.5F;
   private static final float f_27304 = 0.05F;
   private static final float f_27305 = 0.5F;
   private static final double f_27306 = 0.22;
   private static final double f_27307 = 0.18;
   private static final float f_27308 = 0.45F;
   private static final float f_27309 = 0.3F;
   private static final float f_27310 = 0.5F;
   private static final double f_27311 = Math.PI;
   private static final double f_27312 = 0.4;
   private static final double f_27313 = 0.35;
   private static final double f_27314 = 0.3;
   private static final double f_27315 = 0.4;
   private static final double f_27316 = 0.16;
   private static final double f_27317 = 0.12;
   private static final float f_27318 = 0.35F;
   private static final float f_27319 = 0.3F;
   private static final float f_27320 = 100.0F;
   private static final double f_27321 = -1.0;
   private static final float f_27322 = 0.4F;
   private static final float f_27323 = 0.6F;
   private static final double f_27324 = 0.5;
   private static final double f_27325 = 1.0E-8;
   private static final double f_27326 = 1.0E-8;
   private static final double f_27327 = 1.0E-8;
   private static final double f_27328 = 1.0E-8;
   private static final double f_27329 = 0.5;
   private static final double f_27330 = 2.0;
   private static final double f_27331 = 0.5;
   private static final double f_27332 = 0.55;
   private static final double f_27333 = 0.52;
   private static final double f_27334 = 0.52;
   private static final float f_27335 = 1.0E-4F;
   private static final float f_27336 = 0.75F;
   private static final float f_27337 = 0.28F;
   private static final float f_27338 = 0.01F;
   private static final double f_27339 = 1.0E-8;
   private static final double f_27340 = 0.88;
   private static final double f_27341 = 1.0E-8;
   private static final double f_27342 = 0.45;
   private static final double f_27343 = 0.45;
   private static final float f_27344 = 0.5F;
   private static final float f_27345 = 1.18F;
   private static final float f_27346 = 0.52F;
   private static final float f_27347 = 1.18F;
   private static final float f_27348 = 0.72F;
   private static final float f_27349 = 0.12F;
   private static final float f_27350 = 0.88F;
   private static final float f_27351 = 0.12F;
   private static final double f_27352 = Math.PI * 2;
   private static final double f_27353 = Math.PI * 2;
   private static final double f_27354 = 0.5;
   private static final double f_27355 = 2.0;
   private static final double f_27356 = 2.0;
   private static final double f_27357 = 5.0;
   private static final double f_27358 = 4.0;
   private static final double f_27359 = 3.0;
   private static final double f_27360 = 3.0;
   private static final double f_27361 = 0.5;
   private static final double f_27362 = 2.0;
   private static final double f_27363 = 2.0;
   private static final double f_27364 = 5.0;
   private static final double f_27365 = 4.0;
   private static final double f_27366 = 3.0;
   private static final double f_27367 = 3.0;
   private static final double f_27368 = 0.5;
   private static final double f_27369 = 2.0;
   private static final double f_27370 = 2.0;
   private static final double f_27371 = 5.0;
   private static final double f_27372 = 4.0;
   private static final double f_27373 = 3.0;
   private static final double f_27374 = 3.0;
   private static final float f_27375 = 4.0F;
   private static final float f_27376 = 1.25F;
   private static final String f_27377 = "InSampler";
   private static final String f_27378 = "target-esp-lightning-glow-mask";
   private static final double f_27379 = 12.9898;
   private static final double f_27380 = 78.233;
   private static final float f_27381 = 43758.547F;
   private static final float f_27382 = 0.001F;
   private static final double f_27383 = 0.58;
   private static final float f_27384 = 0.95F;
   private static final float f_27385 = 0.05F;
   private static final float f_27386 = 2.6667F;
   private static final float f_27387 = 58.0F;
   private static final float f_27388 = 58.0F;
   private static final float f_27389 = 16.0F;
   private static final float f_27390 = 5.5F;
   private static final float f_27391 = -4.2F;
   private static final float f_27392 = 7.4F;
   private static final float f_27393 = 130.0F;
   private static final float f_27394 = 250.0F;
   private static final float f_27395 = 0.9F;
   private static final float f_27396 = 0.35F;
   private static final float f_27397 = 0.16F;
   private static final float f_27398 = 0.4F;
   private static final float f_27399 = 0.6F;
   private static final float f_27400 = 0.34F;
   private static final float f_27401 = 6.0F;
   private static final float f_27402 = 0.1F;
   private static final float f_27403 = 0.08F;
   private static final float f_27404 = 0.82F;
   private static final float f_27405 = -7.0F;
   private static final float f_27406 = 7.0F;
   private static final float f_27407 = 0.095F;
   private static final float f_27408 = 0.88F;
   private static final float f_27409 = 0.2F;
   private static final float f_27410 = 0.5F;
   private static final float f_27411 = 0.32F;
   private static final float f_27412 = 0.0628F;
   private static final double f_27413 = 0.98;
   private static final String f_27414 = "Тип 2";
   private static final float f_27415 = 1.5F;
   private static final float f_27416 = 1.2F;
   private static final double f_27417 = 1.667;
   private static final float f_27418 = 180.0F;
   private static final float f_27419 = 255.0F;
   private static final double f_27420 = 0.5;
   private static final float f_27421 = 3.0F;
   private static final float f_27422 = 0.08F;
   private static final float f_27423 = 0.04F;
   private static final float f_27424 = 0.42F;
   private static final float f_27425 = 0.32F;
   private static final float f_27426 = 0.001F;
   private static final double f_27427 = 0.85F;
   private static final float f_27428 = 0.3F;
   private static final float f_27429 = 0.1764706F;
   private static final float f_27430 = 2.1F;
   private static final float f_27431 = -0.95F;
   private static final float f_27432 = 0.6F;
   private static final float f_27433 = 0.95F;
   private static final float f_27434 = 0.6F;
   private static final float f_27435 = -1.05F;
   private static final float f_27436 = 5.0F;
   private static final float f_27437 = 0.85F;
   private static final float f_27438 = 3.0F;
   private static final float f_27439 = 3.0F;
   private static final float f_27440 = 0.5F;
   private static final float f_27441 = 0.7F;
   private static final float f_27442 = 3.0F;
   private static final float f_27443 = 0.08F;
   private static final float f_27444 = 3.0F;
   private static final float f_27445 = 3.0F;
   private static final float f_27446 = 0.9F;
   private static final float f_27447 = 80.0F;
   private static final float f_27448 = 175.0F;
   private static final float f_27449 = 255.0F;
   private static final float f_27450 = 0.95F;
   private static final float f_27451 = 1.9F;
   private static final float f_27452 = 0.002F;
   private static final float f_27453 = 0.35F;
   private static final float f_27454 = 2.2F;
   private static final float f_27455 = 0.45F;
   private static final float f_27456 = 1.3F;
   private static final float f_27457 = 3.0F;
   private static final double f_27458 = Math.PI * 2;
   private static final double f_27459 = Math.PI;
   private static final float f_27460 = 0.15F;
   private static final float f_27461 = 0.5F;
   private static final float f_27462 = 0.5F;
   private static final double f_27463 = Math.PI;
   private static final double f_27464 = 3.0;
   private static final float f_27465 = 0.6F;
   private static final float f_27466 = 1.65F;
   private static final float f_27467 = 0.55F;
   private static final float f_27468 = 0.5F;
   private static final float f_27469 = 0.16F;
   private static final float f_27470 = 12.9898F;
   private static final float f_27471 = 43758.547F;
   private static final float f_27472 = 0.01F;
   private static final float f_27473 = 0.52F;
   private static final float f_27474 = 0.18F;
   private static final float f_27475 = 0.04F;
   private static final double f_27476 = 3.1;
   private static final float f_27477 = 0.68F;
   private static final float f_27478 = 1.14F;
   private static final float f_27479 = 0.15F;
   private static final double f_27480 = 0.55;
   private static final double f_27481 = 0.035;
   private static final float f_27482 = 1.32F;
   private static final float f_27483 = 0.18F;
   private static final float f_27484 = 0.4F;
   private static final double f_27485 = 1.28;
   private static final double f_27486 = 0.17;
   private static final double f_27487 = 34.0;
   private static final double f_27488 = 9.0;
   private static final double f_27489 = 0.7;
   private static final double f_27490 = 0.82;
   private static final double f_27491 = 0.48;
   private static final float f_27492 = 0.88F;
   private static final float f_27493 = 0.12F;
   private static final float f_27494 = 0.85365856F;
   private static final float f_27495 = 0.55F;
   private static final float f_27496 = 0.22F;
   private static final float f_27497 = 0.42F;
   private static final float f_27498 = 0.16F;
   private static final float f_27499 = 0.14F;
   private static final float f_27500 = 0.22F;
   private static final float f_27501 = 0.78F;
   private static final float f_27502 = 0.28F;
   private static final float f_27503 = 0.2F;
   private static final float f_27504 = 0.72F;
   private static final float f_27505 = 0.28F;
   private static final double f_27506 = 4.2;
   private static final double f_27507 = 1.256637;
   private static final float f_27508 = 0.11F;
   private static final float f_27509 = 0.88F;
   private static final float f_27510 = 0.9F;
   private static final float f_27511 = 0.2F;
   private static final float f_27512 = 0.5F;
   private static final float f_27513 = 0.32F;
   private static final float f_27514 = 0.42F;
   private static final float f_27515 = 3.0F;
   private static final float f_27516 = 5.0F;
   private static final float f_27517 = 0.09F;
   private static final float f_27518 = 0.015F;
   private static final float f_27519 = 0.92F;
   private static final float f_27520 = 0.7F;
   private static final float f_27521 = 0.16F;
   private static final float f_27522 = 2.1F;
   private static final float f_27523 = 0.55F;
   private static final float f_27524 = 0.28F;
   private static final float f_27525 = 0.06F;
   private static final double f_27526 = 1.55;
   private static final double f_27527 = Math.PI;
   private static final double f_27528 = 2.0;
   private static final double f_27529 = 5.0;
   private static final double f_27530 = 1.04;
   private static final double f_27531 = 1.04;
   private static final float f_27532 = 0.07F;
   private static final float f_27533 = 0.7F;
   private static final float f_27534 = 0.48F;
   private static final float f_27535 = 0.82F;
   private static final double f_27536 = Math.PI / 2;
   private static final double f_27537 = Math.PI;
   private static final double f_27538 = 2.0;
   private static final double f_27539 = 5.0;
   private static final double f_27540 = 1.0E-6;
   private static final float f_27541 = 0.68F;
   private static final float f_27542 = 0.72F;
   private static final float f_27543 = 1.15F;
   private static final float f_27544 = 0.16F;
   private static final double f_27545 = 2.0;
   private static final double f_27546 = 0.17;
   private static final double f_27547 = 22.0;
   private static final float f_27548 = 0.46F;
   private static final float f_27549 = 2.72F;
   private static final float f_27550 = 0.22F;
   private static final float f_27551 = 2.6667F;
   private static final float f_27552 = 0.48F;
   private static final float f_27553 = 0.94F;
   private static final double f_27554 = 5.0;
   private static final float f_27555 = 13.0F;
   private static final double f_27556 = 0.075;
   private static final float f_27557 = 0.42F;
   private static final float f_27558 = 0.07F;
   private static final float f_27559 = 0.105F;
   private static final float f_27560 = 0.72F;
   private static final float f_27561 = 0.9F;
   private static final float f_27562 = 0.5F;
   private static final float f_27563 = 0.4F;
   private static final double f_27564 = Math.PI * 2;
   private static final float f_27565 = 360.0F;
   private static final float f_27566 = 0.13F;
   private static final float f_27567 = 0.52F;
   private static final float f_27568 = 0.82F;
   private static final float f_27569 = 0.17F;
   private static final float f_27570 = 0.115F;
   private static final float f_27571 = 0.085F;
   private static final float f_27572 = 0.65F;
   private static final float f_27573 = 0.01F;
   private static final double f_27574 = 1550.0;
   private static final double f_27575 = Math.PI;
   private static final double f_27576 = 2.0;
   private static final float f_27577 = 10.0F;
   private static final float f_27578 = 0.25F;
   private static final double f_27579 = 0.5;
   private static final double f_27580 = 0.5;
   private static final double f_27581 = 0.2875;
   private static final float f_27582 = 0.005F;
   private static final float f_27583 = 0.008F;
   private static final float f_27584 = 0.3F;
   private static final float f_27585 = 0.75F;
   private static final float f_27586 = 0.65F;
   private static final float f_27587 = 0.65F;
   private static final int f_27588 = -3329486;
   private static final double f_27589 = 5.0;
   private static final float f_27590 = 5.0F;
   private static final float f_27591 = 0.1F;
   private static final float f_27592 = 0.8F;
   private static final double f_27593 = 0.5;
   private static final float f_27594 = 0.3F;
   private static final float f_27595 = 0.2F;
   private static final float f_27596 = 0.2F;
   private static final float f_27597 = 0.8F;
   private static final float f_27598 = 50.0F;
   private static final float f_27599 = 0.005F;
   private static final float f_27600 = 1800.0F;
   private static final long f_27601 = 1500L;
   private static final double f_27602 = 2.0;
   private static final double f_27603 = 2.0;
   private static final float f_27604 = 0.5F;
   private static final double f_27605 = -2.0;
   private static final double f_27606 = 2.0;
   private static final double f_27607 = 2.0;
   private static final double f_27608 = 2.0;
   private static final double f_27609 = 2.0;
   private static final float f_27610 = 0.5F;
   private static final float f_27611 = 2000000.0F;
   private static final float f_27612 = 10.0F;
   private static final float f_27613 = 2.5F;
   private static final float f_27614 = 0.7F;
   private static final float f_27615 = 14.0F;
   private static final float f_27616 = 0.5F;
   private static final float f_27617 = 0.5F;
   private static final float f_27618 = 0.5F;
   private static final float f_27619 = 0.2F;
   private static final float f_27620 = 3.5F;
   private static final float f_27621 = 15.0F;
   private static final float f_27622 = 0.5F;
   private static final double f_27623 = Math.PI;
   private static final double f_27624 = 2.0;
   private static final long f_27625 = 12345L;
   private static final double f_27626 = 0.5;
   private static final double f_27627 = 0.5;
   private static final double f_27628 = 0.5;
   private static final float f_27629 = 10.0F;
   private static final float f_27630 = 0.15F;
   private static final float f_27631 = 0.5882353F;
   private static final double f_27632 = 0.5;
   private static final float f_27633 = 1.5F;
   private static final float f_27634 = 1.5F;
   private static final float f_27635 = 1.5F;
   private static final double f_27636 = 4.0;
   private static final float f_27637 = 8.0F;
   private static final float f_27638 = 0.55F;
   private static final float f_27639 = 0.2F;
   private static final float f_27640 = 0.5F;
   private static final double f_27641 = 125.0;
   private static final double f_27642 = 0.2;
   private static final double f_27643 = 10.0;
   private static final double f_27644 = 15.0;
   private static final double f_27645 = 0.45;
   private static final double f_27646 = 0.45;
   private static final float f_27647 = 0.045F;
   private static final double f_27648 = 0.35F;
   private static final float f_27649 = 0.045F;
   private static final double f_27650 = 0.35F;
   private static final float f_27651 = 0.045F;
   private static final float f_27652 = 0.2F;
   private static final float f_27653 = 0.35F;
   private static final float f_27654 = 1.5F;
   private static final float f_27655 = 2.25F;
   private static final float f_27656 = 0.2F;
   private static final long f_27657 = 16L;
   private static final double f_27658 = 4.0;
   private static final double f_27659 = 360.0;
   private static final float f_27660 = 0.6F;
   private static final float f_27661 = 0.5F;
   private static final float f_27662 = 0.4F;
   private static final double f_27663 = 360.0;
   private static final double f_27664 = 2.0;
   private static final float f_27665 = 0.4F;
   private static final float f_27666 = 100.0F;
   private static final float f_27667 = 0.01F;
   private static final float f_27668 = 400.0F;
   private static final float f_27669 = 400.0F;
   private static final float f_27670 = 800.0F;
   private static final float f_27671 = 400.0F;
   private static final float f_27672 = 0.01F;
   private static final float f_27673 = 0.01F;
   private static final double f_27674 = 0.004;
   private static final double f_27675 = Math.PI * 2;
   private static final double f_27676 = 0.15;
   private static final double f_27677 = -1.0;
   private static final double f_27678 = 0.8;
   private static final double f_27679 = 0.55;
   private static final double f_27680 = 0.5;
   private static final double f_27681 = 0.04;
   private static final float f_27682 = 0.34F;
   private static final float f_27683 = 0.21F;
   private static final double f_27684 = 1.8;
   private static final float f_27685 = 0.2F;
   private static final double f_27686 = Math.PI;
   private static final double f_27687 = 10.0;
   private static final float f_27688 = 0.1F;
   private static final double f_27689 = Math.PI;
   private static final double f_27690 = 2.0;
   private static final long f_27691 = 10L;
   private static final long f_27692 = 360L;
   private static final float f_27693 = 0.75F;
   private static final float f_27694 = 0.75F;
   private static final float f_27695 = 0.75F;
   private static final double f_27696 = 255.0;
   private static final float f_27697 = 180.0F;
   private static final int f_27698 = -39836;
   private static final int f_27699 = 16777215;
   private static final double f_27700 = 2000.0;
   private static final float f_27701 = 360.0F;
   private static final float f_27702 = 20.0F;
   private static final float f_27703 = 0.3F;
   private static final double f_27704 = 1.5;
   private static final double f_27705 = 0.7F;
   private static final double f_27706 = 1.5;
   private static final double f_27707 = 0.7F;
   private static final double f_27708 = 10430.378350470453;
   private static final int f_27709 = 65535;
   private static final double f_27710 = Math.PI;
   private static final double f_27711 = 2.0;
   private static final double f_27712 = 65536.0;
   private static final float f_27713 = 0.3F;
   private static final float f_27714 = 0.35F;
   private static final float f_27715 = 255.0F;
   private static final float f_27716 = 0.06F;
   private static final float f_27717 = 0.2F;
   private static final float f_27718 = 255.0F;
   private static final float f_27719 = 0.06F;
   private static final float f_27720 = 255.0F;
   private static final long f_27721 = 360000L;
   private static final float f_27722 = 7.25F;
   private static final float f_27723 = 0.001F;
   private static final float f_27724 = 1.5F;
   private static final float f_27725 = 1.25F;
   private static final float f_27726 = 0.5F;
   private static final double f_27727 = 0.05;
   private static final float f_27728 = 0.15F;
   private static final float f_27729 = 19.3F;
   private static final float f_27730 = 0.9625F;
   private static final float f_27731 = 0.2F;
   private static final float f_27732 = 0.4375F;
   private static final float f_27733 = 0.22F;
   private static final double f_27734 = 2.0;
   private static final float f_27735 = 1.5F;
   private static final float f_27736 = 1.25F;
   private static final float f_27737 = 0.5F;
   private static final long f_27738 = 360000L;
   private static final float f_27739 = 2.5F;
   private static final float f_27740 = 0.3F;
   private static final float f_27741 = 0.1F;
   private static final float f_27742 = 0.1F;
   private static final float f_27743 = 0.3F;
   private static final float f_27744 = 0.1F;
   private static final float f_27745 = 1.5F;
   private static final float f_27746 = 0.2F;
   private static final float f_27747 = 0.6F;
   private static final float f_27748 = 0.2F;
   private static final float f_27749 = 1.5F;
   private static final long f_27750 = 133769420L;
   private static final float f_27751 = 12.0F;
   private static final float f_27752 = -1.0F;
   private static final float f_27753 = 360.0F;
   private static final float f_27754 = Float.MAX_VALUE;
   private static final double f_27755 = 240.0;
   private static final float f_27756 = 260.0F;
   private static final double f_27757 = 0.9;
   private static final float f_27758 = 60.0F;
   private static final float f_27759 = 0.05F;
   private static final int f_27760 = -52686;
   private static final float f_27761 = 0.5F;
   private static final float f_27762 = 0.5F;
   private static final float f_27763 = 0.5F;
   private static final float f_27764 = 0.5F;
   private static final float f_27765 = 1.0E-8F;
   private static final float f_27766 = -1.0F;
   private static final float f_27767 = 1.3F;
   private static final float f_27768 = 1.3F;
   private static final float f_27769 = 1.3F;
   private static final float f_27770 = 0.92F;
   private static final float f_27771 = 1.7F;
   private static final float f_27772 = 0.16F;
   private static final float f_27773 = 0.54F;
   private static final float f_27774 = 0.76F;
   private static final float f_27775 = 0.92F;
   private static final float f_27776 = 4.3F;
   private static final float f_27777 = 0.16F;
   private static final float f_27778 = 1.12F;
   private static final float f_27779 = 0.92F;
   private static final float f_27780 = 8.1F;
   private static final float f_27781 = 0.12F;
   private static final float f_27782 = 12.6F;
   private static final float f_27783 = 0.5F;
   private static final float f_27784 = 0.07F;
   private static final float f_27785 = 17.2F;
   private static final float f_27786 = 0.5F;
   private static final float f_27787 = 0.07F;
   private static final float f_27788 = 0.58F;
   private static final float f_27789 = 0.42F;
   private static final float f_27790 = 0.18F;
   private static final float f_27791 = 0.45F;
   private static final float f_27792 = 0.45F;
   private static final float f_27793 = 0.45F;
   private static final float f_27794 = 0.45F;
   private static final float f_27795 = 0.45F;
   private static final float f_27796 = 0.45F;
   private static final float f_27797 = 0.45F;
   private static final float f_27798 = 0.45F;
   private static final float f_27799 = 0.61F;
   private static final float f_27800 = 23.0F;
   private static final float f_27801 = 1.27F;
   private static final float f_27802 = 51.0F;
   private static final float f_27803 = 17.0F;
   private static final float f_27804 = 1.3F;
   private static final float f_27805 = 1.3F;
   private static final float f_27806 = 1.3F;
   private static final float f_27807 = 0.62F;
   private static final float f_27808 = 0.92F;
   private static final float f_27809 = 1.7F;
   private static final float f_27810 = 0.16F;
   private static final float f_27811 = 0.76F;
   private static final float f_27812 = 0.92F;
   private static final float f_27813 = 4.3F;
   private static final float f_27814 = 0.16F;
   private static final float f_27815 = 0.76F;
   private static final float f_27816 = 0.92F;
   private static final float f_27817 = 8.1F;
   private static final float f_27818 = 0.16F;
   private static final float f_27819 = 12.6F;
   private static final float f_27820 = 0.5F;
   private static final float f_27821 = 0.08F;
   private static final float f_27822 = 17.2F;
   private static final float f_27823 = 0.5F;
   private static final float f_27824 = 0.08F;
   private static final float f_27825 = 0.58F;
   private static final float f_27826 = 0.6F;
   private static final float f_27827 = 0.6F;
   private static final float f_27828 = 0.6F;
   private static final float f_27829 = 0.6F;
   private static final float f_27830 = 0.6F;
   private static final float f_27831 = 0.6F;
   private static final float f_27832 = 0.6F;
   private static final float f_27833 = 0.6F;
   private static final float f_27834 = 78.233F;
   private static final float f_27835 = 43758.547F;
   private static final float f_27836 = 0.5F;
   private static final float f_27837 = 1.0E-8F;
   private static final float f_27838 = -1.0F;
   private static final float f_27839 = 1.34F;
   private static final float f_27840 = 1.34F;
   private static final float f_27841 = 0.84F;
   private static final float f_27842 = 0.36F;
   private static final float f_27843 = 1.12F;
   private static final float f_27844 = 0.5F;
   private static final float f_27845 = 0.5F;
   private static final float f_27846 = 0.5F;
   private static final float f_27847 = 0.5F;
   private static final float f_27848 = 0.5F;
   private static final float f_27849 = 0.5F;
   private static final float f_27850 = 0.5F;
   private static final float f_27851 = 0.5F;
   private static final float f_27852 = 0.5F;
   private static final float f_27853 = 0.5F;
   private static final float f_27854 = 0.5F;
   private static final float f_27855 = 0.5F;
   private static final float f_27856 = 0.5F;
   private static final float f_27857 = 0.5F;
   private static final float f_27858 = 0.5F;
   private static final float f_27859 = 0.5F;
   private static final float f_27860 = 0.5F;
   private static final float f_27861 = 0.5F;
   private static final float f_27862 = 0.5F;
   private static final float f_27863 = 0.5F;
   private static final float f_27864 = 0.5F;
   private static final float f_27865 = 0.5F;
   private static final float f_27866 = 255.0F;
   private static final float f_27867 = 0.5F;
   private static final float f_27868 = 255.0F;
   private static final float f_27869 = 10.0F;
   private static final float f_27870 = 360.0F;
   private static final float f_27871 = 0.5F;
   private static final long f_27872 = 4L;
   private static final long f_27873 = 360L;
   private static final float f_27874 = 180.0F;
   private static final float f_27875 = 0.85F;
   private static final float f_27876 = 3.0F;
   private static final String f_27877 = "Sampler0";
   private static final String f_27878 = "targetEspMask";
   private static final String f_27879 = "targetEspMaskVertices";
   private static final String f_27880 = "targetEspColor";
   private static final String f_27881 = "targetEspColorVertices";
   private static final String f_27882 = "targetEsp";
   private static final String f_27883 = "targetEspVertices";
   private static final int f_27884 = 16777215;
   private static final String f_27885 = "targetEspTriangleLines";
   private static final String f_27886 = "targetEspTriangleLines";
   private static final String f_27887 = "targetEspLightningCore";
   private static final String f_27888 = "targetEspCubeComposite";
   private static final String f_27889 = "dimasik";
   private static final String f_27890 = "icons/world_render/target.png";
   private static final String f_27891 = "dimasik";
   private static final String f_27892 = "icons/world_render/target1.png";
   private static final String f_27893 = "dimasik";
   private static final String f_27894 = "icons/world_render/firepart2.png";
   private static final String f_27895 = "dimasik";
   private static final String f_27896 = "textures/targetesp/zenith_ghost.png";
   private static final String f_27897 = "dimasik";
   private static final String f_27898 = "icons/world_render/bloom.png";
   private static final String f_27899 = "dimasik";
   private static final String f_27900 = "images/particles/bloom.png";
   private static final String f_27901 = "dimasik";
   private static final String f_27902 = "images/particles/bloom.png";
   private static final String f_27903 = "dimasik";
   private static final String f_27904 = "images/targetesp/glow.png";
   private static final String f_27905 = "dimasik";
   private static final String f_27906 = "textures/targetesp/lightning_arc.png";
   private static final String f_27907 = "dimasik/target_esp";
   private static final String f_27908 = "dead_chams";
   private static final String f_27909 = "dead_chams";
   private static final String f_27910 = "Sampler0";
   private static final String f_27911 = "dimasik/target_esp_ghost_no_depth";
   private static final String f_27912 = "zenith_target_esp";
   private static final String f_27913 = "zenith_target_esp";
   private static final String f_27914 = "Sampler0";
   private static final String f_27915 = "dimasik/target_esp_ghost_depth";
   private static final String f_27916 = "zenith_target_esp";
   private static final String f_27917 = "zenith_target_esp";
   private static final String f_27918 = "Sampler0";
   private static final String f_27919 = "dimasik/target_esp_crystal_color";
   private static final String f_27920 = "target_esp_crystal";
   private static final String f_27921 = "target_esp_crystal";
   private static final String f_27922 = "dimasik/target_esp_crystal_color_no_depth";
   private static final String f_27923 = "target_esp_crystal";
   private static final String f_27924 = "target_esp_crystal";
   private static final String f_27925 = "dimasik/target_esp_crystal_glow_depth";
   private static final String f_27926 = "dead_chams";
   private static final String f_27927 = "dead_chams";
   private static final String f_27928 = "Sampler0";
   private static final String f_27929 = "dimasik/target_esp_orbit_crystal_depth";
   private static final String f_27930 = "target_esp_crystal";
   private static final String f_27931 = "target_esp_crystal";
   private static final String f_27932 = "dimasik/target_esp_orbit_crystal_no_depth";
   private static final String f_27933 = "target_esp_crystal";
   private static final String f_27934 = "target_esp_crystal";
   private static final String f_27935 = "dimasik/target_esp_orbit_glow_depth";
   private static final String f_27936 = "target_esp_orbit_glow";
   private static final String f_27937 = "target_esp_orbit_glow";
   private static final String f_27938 = "Sampler0";
   private static final String f_27939 = "dimasik/target_esp_orbit_glow_no_depth";
   private static final String f_27940 = "target_esp_orbit_glow";
   private static final String f_27941 = "target_esp_orbit_glow";
   private static final String f_27942 = "Sampler0";
   private static final String f_27943 = "dimasik/target_esp_ring";
   private static final String f_27944 = "target_esp_ring";
   private static final String f_27945 = "target_esp_ring";
   private static final String f_27946 = "dimasik/target_esp_hoop";
   private static final String f_27947 = "target_esp_ring";
   private static final String f_27948 = "target_esp_ring";
   private static final String f_27949 = "dimasik/target_esp_ring_wave";
   private static final String f_27950 = "target_esp_cube";
   private static final String f_27951 = "target_esp_cube";
   private static final String f_27952 = "dimasik/target_esp_cube";
   private static final String f_27953 = "target_esp_cube";
   private static final String f_27954 = "target_esp_cube";
   private static final String f_27955 = "dimasik/target_esp_cube_composite";
   private static final String f_27956 = "hands_fullscreen";
   private static final String f_27957 = "target_esp_cube_composite";
   private static final String f_27958 = "InSampler";
   private static final String f_27959 = "dimasik/target_esp_lightning_arc";
   private static final String f_27960 = "dead_chams";
   private static final String f_27961 = "dead_chams";
   private static final String f_27962 = "Sampler0";
   private static final String f_27963 = "dimasik/target_esp_lightning_arc_depth";
   private static final String f_27964 = "dead_chams";
   private static final String f_27965 = "dead_chams";
   private static final String f_27966 = "Sampler0";
   private static final String f_27967 = "dimasik/target_esp_lightning";
   private static final String f_27968 = "target_esp_lightning";
   private static final String f_27969 = "target_esp_lightning";
   private static final String f_27970 = "dimasik/target_esp_lightning_core";
   private static final String f_27971 = "hands_fullscreen";
   private static final String f_27972 = "target_esp_lightning_core";
   private static final String f_27973 = "InSampler";
   private static final String f_27974 = "dimasik/target_esp_triangle_lines";
   private static final String f_27975 = "dimasik/target_esp_pentagram";
   private static final String f_27976 = "Globals";
   private static final String f_27977 = "target_esp_pentagram";
   private static final String f_27978 = "target_esp_pentagram";
   private static final float f_27979 = 1.5F;
   private static final float f_27980 = -1.5F;
   private static final float f_27981 = -1.0F;
   private static final float f_27982 = -1.0F;
   private static final float f_27983 = 0.8F;
   private static final float f_27984 = 0.6F;
   private static final float f_27985 = 0.9F;
   private static final float f_27986 = 0.7F;
   private static final float f_27987 = 0.5F;
   private static final float f_27988 = 0.4F;
   private static final float f_27989 = 0.6F;
   private static final int f_27990 = Integer.MIN_VALUE;
   private static final int f_27991 = Integer.MIN_VALUE;
   private static final int f_27992 = -11486721;
   private static final float f_27993 = 1.2F;
   private static final String f_27994 = "Тип 1";
   private static final String f_27995 = "Тип 1";
   private static final int f_27996 = Integer.MIN_VALUE;
   private static final String f_27997 = "Тип 1";
   private static final String f_27998 = "Тип 1";
   private static final String f_27999 = "Тип 2";
   private static final int f_28000 = Integer.MIN_VALUE;
   private static final int f_28001 = Integer.MIN_VALUE;
   private static final float f_28002 = 12.0F;
   private static final String f_28003 = "private/glow";
   private static final String f_28004 = "dimasik/target_esp_private_depth";
   private static final String f_28005 = "dimasik/target_esp_private_no_depth";
   private static final float f_28006 = 0.2F;
   private static final int f_28007 = Integer.MIN_VALUE;

   public static boolean m_7807() {
      return f_26543 != null && f_26544 > f_26674;
   }

   private static void m_7808(Class_TZhU50s8XmBQCMP5 var0, Vec3 var1, LivingEntity var2, int var3, float var4, float var5) {
      var1 = var1.subtract(f_11537.gameRenderer.mainCamera().position());
      float var6 = m_7937(var4);
      if (!(var6 <= f_27472)) {
         float var7 = var2.getBbHeight();
         float var8 = Mth.lerp(var6, f_27473, 1.0F) * m_7906(f_26544);
         var8 *= 1.0F + var5 * f_27474;
         float var9 = 1.0F + f_27475 * (float)Math.sin(f_26545 * f_27476);
         float var10 = Math.max(f_27477, var2.getBbWidth() * f_27478 + f_27479) * var8 * var9;
         Matrix4f var11 = var0.m_5006().last().pose();
         BufferBuilder var12 = m_7952();
         Vec3[] var13 = m_7820(m_7956(new Vec3(0.0, 1.0, 0.0)), -f_26545 * f_27480);
         m_7899(var12, var11, var1.add(0.0, f_27481, 0.0), var13[0], var13[1], var10 * f_27482, m_7887(m_7817(var3, f_27483), var6 * f_27484));
         double var14 = f_26545 * f_27485 + var2.getId() * f_27486;
         double var16 = Math.toRadians(f_27487 + f_27488 * Math.sin(f_26545 * f_27489));
         Vec3 var18 = new Vec3(Math.sin(var16) * Math.cos(var14), Math.cos(var16), Math.sin(var16) * Math.sin(var14));
         Vec3[] var19 = m_7820(m_7956(var18), f_26545 * f_27490);
         Vec3 var20 = var1.add(0.0, var7 * f_27491, 0.0);
         m_7899(var12, var11, var20, var19[0], var19[1], var10, m_7887(var3, var6 * (f_27492 + var5 * f_27493)));
         m_7854(var12, f_26540, true);
         float var21 = var10 * f_27494;
         BufferBuilder var22 = m_7952();
         m_7893(var22, var11, var20.x, var20.y, var20.z, var10 * (f_27495 + var5 * f_27496), m_7887(m_7817(var3, f_27497), var6 * (f_27498 + var5 * f_27499)));
         m_7893(var22, var11, var20.x, var20.y, var20.z, var10 * f_27500, m_7887(m_7817(var3, f_27501), var6 * (f_27502 + var5 * f_27503)));

         for (int var23 = 0; var23 < 5; var23++) {
            Vec3 var24 = m_7823(var20, var19[0], var19[1], var21, var23);
            float var25 = f_27504 + f_27505 * (float)Math.sin(f_26545 * f_27506 + var23 * f_27507);
            m_7893(var22, var11, var24.x, var24.y, var24.z, f_27508 * var25, m_7887(m_7817(var3, f_27509), var6 * f_27510));
            m_7893(var22, var11, var24.x, var24.y, var24.z, f_27511 * var25, m_7887(m_7817(var3, f_27512), var6 * f_27513));
         }

         int[] var35 = new int[]{0, 2, 4, 1, 3};

         for (int var36 = 0; var36 < 3; var36++) {
            float var38 = (f_26545 * f_27514 + var36 / f_27515) % 1.0F;
            float var26 = var38 * f_27516;
            int var27 = Math.min(4, (int)var26);
            float var28 = var26 - var27;
            Vec3 var29 = m_7823(var20, var19[0], var19[1], var21, var35[var27]);
            Vec3 var30 = m_7823(var20, var19[0], var19[1], var21, var35[(var27 + 1) % 5]);
            Vec3 var31 = var29.lerp(var30, var28);
            float var32 = f_27517 - var36 * f_27518;
            m_7893(var22, var11, var31.x, var31.y, var31.z, var32, m_7887(m_7817(var3, f_27519), var6 * (f_27520 - var36 * f_27521)));
            m_7893(var22, var11, var31.x, var31.y, var31.z, var32 * f_27522, m_7887(m_7817(var3, f_27523), var6 * (f_27524 - var36 * f_27525)));
         }

         for (int var37 = 0; var37 < 5; var37++) {
            double var39 = f_26545 * f_27526 + var37 * f_27527 * f_27528 / f_27529;
            Vec3 var40 = var20.add(var19[0].scale(Math.cos(var39) * var10 * f_27530)).add(var19[1].scale(Math.sin(var39) * var10 * f_27531));
            m_7893(var22, var11, var40.x, var40.y, var40.z, f_27532, m_7887(m_7817(var3, f_27533), var6 * f_27534));
         }

         m_7942(var22, f_26515, true);
      }
   }

   private static void m_7809(BufferBuilder var0, PoseStack var1, float var2, float var3, float var4, float var5, int var6, float var7, float var8) {
      var1.pushPose();
      var1.translate(var2, var3, var4);
      float var9 = var7 * f_27836;
      float var10 = -var2;
      float var11 = var9 - var3;
      float var12 = -var4;
      float var13 = var10 * var10 + var11 * var11 + var12 * var12;
      if (var13 > f_27837) {
         float var14 = 1.0F / (float)Math.sqrt(var13);
         float var15 = Mth.clamp(var11 * var14, f_27838, 1.0F);
         float var16 = (float)Math.toDegrees(Math.atan2(var10, var12));
         float var17 = -((float)Math.toDegrees(Math.asin(var15)));
         var1.mulPose(Axis.YP.rotationDegrees(var16));
         var1.mulPose(Axis.XP.rotationDegrees(var17));
      }

      var1.mulPose(Axis.ZP.rotationDegrees(var8));
      var1.scale(var5 * f_27839, var5 * f_27840, var5 * f_27841);
      Matrix4f var18 = var1.last().pose();
      float var19 = f_27842;
      float var20 = f_27843;
      m_7845(var0, var18, 0.0F, 0.0F, var20, -var19, 0.0F, 0.0F, 0.0F, var19, 0.0F, var6);
      m_7845(var0, var18, 0.0F, 0.0F, var20, 0.0F, var19, 0.0F, var19, 0.0F, 0.0F, var6);
      m_7845(var0, var18, 0.0F, 0.0F, var20, var19, 0.0F, 0.0F, 0.0F, -var19, 0.0F, var6);
      m_7845(var0, var18, 0.0F, 0.0F, var20, 0.0F, -var19, 0.0F, -var19, 0.0F, 0.0F, var6);
      m_7845(var0, var18, 0.0F, 0.0F, -var20, 0.0F, var19, 0.0F, -var19, 0.0F, 0.0F, var6);
      m_7845(var0, var18, 0.0F, 0.0F, -var20, var19, 0.0F, 0.0F, 0.0F, var19, 0.0F, var6);
      m_7845(var0, var18, 0.0F, 0.0F, -var20, 0.0F, -var19, 0.0F, var19, 0.0F, 0.0F, var6);
      m_7845(var0, var18, 0.0F, 0.0F, -var20, -var19, 0.0F, 0.0F, 0.0F, -var19, 0.0F, var6);
      var1.popPose();
   }

   private static float m_7810(int var0, int var1) {
      float var2 = (float)var0 / Math.max(1, var1 - 1);
      return f_27174 + f_27175 * (float)Math.sin(f_27176 * Math.pow(var2, f_27177));
   }

   private static void m_7811(Class_TZhU50s8XmBQCMP5 var0, Vec3 var1, LivingEntity var2, int var3, int var4, float var5, long var6) {
      var1 = var1.subtract(f_11537.gameRenderer.mainCamera().position());
      m_7871(var2);
      float var8 = (float)(var6 % f_26738) / f_26739;
      float var9 = (float)var6 * f_26740;
      float var10 = f_26741 - f_26742 * var5;
      float var11 = (float)Math.sin(Math.toRadians(var8));
      float var12 = (float)Math.cos(Math.toRadians(var8));
      BufferBuilder var13 = m_7952();
      PoseStack var14 = var0.m_5006();

      for (int var15 = 0; var15 < f_26555.size(); var15++) {
         Vector3f var16 = f_26555.get(var15);
         float var17 = var16.x * var12 - var16.z * var11;
         float var18 = var16.x * var11 + var16.z * var12;
         float var19 = var17 * var10;
         float var20 = var18 * var10;
         float var21 = var16.y + (float)(f_26743 * Math.sin(var9 * f_26744 + var15 * f_26745));
         m_7954(var13, var14, var1.x + var19, var1.y + var21, var1.z + var20, f_26746, m_7887(var3, var5 * f_26747));
         m_7954(var13, var14, var1.x + var19, var1.y + var21, var1.z + var20, f_26748, m_7887(m_7817(var3, f_26749), var5 * f_26750));
      }

      m_7830(var13, f_26515, true, m_7831());
      BufferBuilder var32 = m_7952();

      for (int var33 = 0; var33 < f_26555.size(); var33++) {
         Vector3f var34 = f_26555.get(var33);
         float var35 = var34.x * var12 - var34.z * var11;
         float var36 = var34.x * var11 + var34.z * var12;
         float var37 = var35 * var10;
         float var38 = var36 * var10;
         float var22 = var34.y + (float)(f_26751 * Math.sin(var9 * f_26752 + var33 * f_26753));
         float var23 = var8 * (var33 % 2 == 0 ? f_26754 : f_26755) + var33 * f_26756;
         float var24 = (float)Math.sin(var33 * f_26757 + f_26758) * f_26759;
         var24 -= (float)Math.floor(var24);
         float var25 = f_26760 + var24 * f_26761;
         float var26 = f_26762 + ((float)Math.sin(var9 * f_26763 + var33 * f_26764) + 1.0F) * f_26765;
         int var27 = Class_BftdentXEtGbugJw.m_2303(
            Class_BftdentXEtGbugJw.m_2309(var3), Class_BftdentXEtGbugJw.m_2299(var3), Class_BftdentXEtGbugJw.m_2308(var3), Math.round(f_26766 * var5)
         );
         int var28 = Class_BftdentXEtGbugJw.m_2303(
            Class_BftdentXEtGbugJw.m_2309(var3), Class_BftdentXEtGbugJw.m_2299(var3), Class_BftdentXEtGbugJw.m_2308(var3), Math.round(f_26767 * var5)
         );
         int var29 = m_7817(var27, var26);
         int var30 = Class_BftdentXEtGbugJw.m_2302(var29, -1, f_26768);
         var14.pushPose();
         var14.translate(var1.x, var1.y, var1.z);
         m_7944(var32, var14, var37, var22, var38, var25 * f_26769, var29, var30, var23, true, var33, true);
         m_7944(var32, var14, var37, var22, var38, var25, var29, var30, var23, true, var33, false);
         var14.popPose();
      }

      m_7825(var32, m_7821());
   }

   private static void m_7812(BufferBuilder var0, Matrix4f var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      m_7931(var0, var1, var2, var3, var4, var5, var6, Class_BftdentXEtGbugJw.m_2298(var7));
   }

   private static void m_7813(BufferBuilder var0, Matrix4f var1, double var2, double var4, double var6, int var8, float var9) {
      if (!(var9 <= f_27003)) {
         float var10 = m_7832(f_26590);
         double var11 = f_27004 * var10;
         int var13 = m_7887(var8, var9);
         int var14 = m_7887(var8, var9 * f_27005);
         float var15 = f_27006 + f_27007 * (1.0F - var10);
         double var16 = f_27008 * var10;

         for (int var18 = 0; var18 < 26; var18++) {
            double var19 = f_27009 * var18 / f_27010 + f_26592 * f_27011;
            double var21 = var2 + Math.cos(var19) * var11;
            double var23 = var6 + Math.sin(var19) * var11;
            double var25 = var4 + Math.sin(var19 * f_27012 + f_26590 * f_27013) * var16 * f_27014;
            m_7893(var0, var1, var21, var25, var23, var15, var13);
            m_7893(var0, var1, var21, var25, var23, var15 * f_27015, var14);
         }
      }
   }

   private static void m_7814(Class_TZhU50s8XmBQCMP5 var0, Vec3 var1, LivingEntity var2, int var3, float var4) {
      BufferBuilder var5 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
      Vec3 var6 = var1.subtract(f_11537.gameRenderer.mainCamera().position());
      PoseStack var7 = new PoseStack();
      var7.mulPose(var0.m_5006().last().pose());
      double var8 = f_26545 * f_27755;
      Quaternionf var10 = f_11537.gameRenderer.mainCamera().rotation();
      Class_euFMDTGHOhdZbwzG.m_6442(var2.getBbWidth(), var2.getBbHeight(), var8, var4, f_26655, f_26656, (var5x, var6x, var7x, var8x, var9) -> {
         if (var9 != 0) {
            var7.pushPose();
            var7.translate(var6.x + var5x, var6.y + var6x, var6.z + var7x);
            var7.mulPose(var10);
            Class_8eJhbT3fP9R0tMrZ.m_1813(var5, var7.last().pose(), var8x, var3 & f_27884 | var9 << 24);
            var7.popPose();
         }
      });
      m_7830(var5, f_26652, false, f_26657 ? f_26654 : f_26653);
   }

   private static float m_7815(float var0, float var1) {
      float var2 = 0.0F;
      float var3 = f_27186;
      float var4 = 1.0F;

      for (int var5 = 0; var5 < 4; var5++) {
         var2 += m_7924(var0 * var4, var1 * var4) * var3;
         var4 *= f_27187;
         var3 *= f_27188;
      }

      return Mth.clamp(var2, 0.0F, 1.0F);
   }

   private static void m_7816(Class_TZhU50s8XmBQCMP5 var0, Vec3 var1, LivingEntity var2, int var3, float var4) {
      if (f_26611 != var2.getId()) {
         f_26609.clear();
         f_26610 = 0L;
         f_26611 = var2.getId();
      }

      Vec3 var5 = f_11537.gameRenderer.mainCamera().position();
      double var6 = var1.x;
      double var8 = var1.y + var2.getBbHeight() / f_26965;
      double var10 = var1.z;
      double var12 = var6 - var5.x;
      double var14 = var8 - var5.y;
      double var16 = var10 - var5.z;
      long var18 = System.currentTimeMillis();
      PoseStack var20 = var0.m_5006();
      BufferBuilder var21 = m_7952();
      m_7840(var20, var21, var5, var4, var3);

      for (int var22 = 0; var22 < 20; var22++) {
         float var23 = 1.0F - var22 / f_26966 * f_26967;
         double var24 = f_26968 * (var18 - var22 * f_26969) / f_26970;
         float var26 = (float)(f_26971 * var23);
         m_7873(var20, var21, var12, var14, var16, var24, 1.0, 1.0, f_26972, var26, var4, var3);
         m_7873(var20, var21, var12, var14, var16, var24, f_26973, 1.0, f_26974, var26, var4, var3);
         m_7873(var20, var21, var12, var14, var16, var24, f_26975, f_26976, 1.0, var26, var4, var3);
      }

      m_7951(var6, var8, var10, var18, var4);
      m_7942(var21, f_26513, true);
   }

   private static int m_7817(int var0, float var1) {
      var1 = Mth.clamp(var1, 0.0F, 1.0F);
      return Class_BftdentXEtGbugJw.m_2303(
         Math.round(Mth.lerpInt(var1, Class_BftdentXEtGbugJw.m_2309(var0), 255)),
         Math.round(Mth.lerpInt(var1, Class_BftdentXEtGbugJw.m_2299(var0), 255)),
         Math.round(Mth.lerpInt(var1, Class_BftdentXEtGbugJw.m_2308(var0), 255)),
         Class_BftdentXEtGbugJw.m_2297(var0)
      );
   }

   private static void m_7818(
      BufferBuilder var0,
      Matrix4f var1,
      Vec3 var2,
      Vec3 var3,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      float var16,
      int var17
   ) {
      for (int var18 = -1; var18 <= 1; var18 += 2) {
         for (int var19 = -1; var19 <= 1; var19 += 2) {
            for (int var20 = -1; var20 <= 1; var20 += 2) {
               double var21 = 1.0 - Math.pow(1.0F - var16, f_26919);
               Vec3 var23 = m_7894(new Vec3(var18 * var8, var19 * var8, var20 * var8), var4, var6, 0.0);
               Vec3 var24 = new Vec3(var23.x, 0.0, var23.z).normalize();
               double var25 = var21 * (f_26920 + (var19 > 0 ? f_26921 : 0.0) + (var18 * var20 > 0 ? f_26922 : 0.0));
               double var27 = m_7932(var23.y, var14, var16, var18, var19, var20);
               Vec3 var29 = new Vec3(var23.x + var24.x * var25, var27, var23.z + var24.z * var25);
               double var30 = var21 * (f_26923 + (var18 * var19 * var20 > 0 ? f_26924 : f_26925));
               Vec3 var32 = m_7894(new Vec3(-var18, 0.0, 0.0), var4, var6, 0.0);
               Vec3 var33 = m_7894(new Vec3(0.0, -var19, 0.0), var4, var6, 0.0);
               Vec3 var34 = m_7894(new Vec3(0.0, 0.0, -var20), var4, var6, 0.0);
               var32 = m_7894(var32, var30 * var20, var30 * var19, var30 * var18);
               var33 = m_7894(var33, var30 * var20, var30 * var19, var30 * var18);
               var34 = m_7894(var34, var30 * var20, var30 * var19, var30 * var18);
               m_7863(var0, var1, var2, var3, var29, var32, var33, var34, var10, var12, var17);
            }
         }
      }
   }

   private static int m_7819(int var0, int var1, float var2) {
      float var3 = ((float)System.currentTimeMillis() / f_27869 + var2) % f_27870;
      float var4 = ((float)Math.sin(Math.toRadians(var3)) + 1.0F) * f_27871;
      return Class_BftdentXEtGbugJw.m_2302(var0, var1, var4);
   }

   private static Vec3[] m_7820(Vec3[] var0, double var1) {
      double var3 = Math.cos(var1);
      double var5 = Math.sin(var1);
      Vec3 var7 = var0[0];
      Vec3 var8 = var0[1];
      return new Vec3[]{var7.scale(var3).add(var8.scale(var5)), var7.scale(-var5).add(var8.scale(var3))};
   }

   private static RenderPipeline m_7821() {
      return f_26602 ? f_26524 : f_26523;
   }

   private static void m_7822(BufferBuilder var0, Matrix4f var1, double var2, double var4, double var6, float var8, float var9, float var10, int var11) {
      Vector4f var12 = Class_BftdentXEtGbugJw.m_2298(var11);
      float var13 = var8 * f_27763;
      float var14 = (float)Math.toRadians(var9);
      float var15 = (float)Math.toRadians(var10);
      float var16 = (float)Math.cos(var14) * var13;
      float var17 = (float)Math.sin(var14) * var13;
      float var18 = (float)Math.sin(var14) * (float)Math.sin(var15) * var13;
      float var19 = (float)Math.cos(var15) * var13;
      float var20 = -((float)Math.cos(var14)) * (float)Math.sin(var15) * var13;
      m_7931(var0, var1, (float)var2 - var16 - var18, (float)var4 - var19, (float)var6 - var17 - var20, 0.0F, 1.0F, var12);
      m_7931(var0, var1, (float)var2 - var16 + var18, (float)var4 + var19, (float)var6 - var17 + var20, 0.0F, 0.0F, var12);
      m_7931(var0, var1, (float)var2 + var16 + var18, (float)var4 + var19, (float)var6 + var17 + var20, 1.0F, 0.0F, var12);
      m_7931(var0, var1, (float)var2 + var16 - var18, (float)var4 - var19, (float)var6 + var17 - var20, 1.0F, 1.0F, var12);
   }

   private static Vec3 m_7823(Vec3 var0, Vec3 var1, Vec3 var2, float var3, int var4) {
      double var5 = f_27536 + var4 * f_27537 * f_27538 / f_27539;
      return var0.add(var1.scale(Math.cos(var5) * var3)).add(var2.scale(Math.sin(var5) * var3));
   }

   private static TextureTarget m_7824(int var0, int var1) {
      if (f_26560 == null) {
         f_26560 = new TextureTarget(f_27378, var0, var1, true, GpuFormat.RGBA8_UNORM);
      } else if (f_26560.width != var0 || f_26560.height != var1) {
         f_26560.resize(var0, var1);
      }

      return f_26560;
   }

   private static void m_7825(BufferBuilder var0, RenderPipeline var1) {
      m_7854(var0, var1, false);
   }

   private static int m_7826(LivingEntity var0, int var1, float var2, long var3) {
      if (f_26660 != var0.getId()) {
         f_26660 = var0.getId();
         f_26661 = var0.hurtTime;
         f_26659 = 0L;
         f_26658 = 0.0F;
      }

      if (var0.hurtTime > f_26661) {
         f_26659 = var3;
      }

      f_26661 = var0.hurtTime;
      if (!f_26596) {
         f_26658 = 0.0F;
         return var1;
      } else {
         float var5 = Mth.clamp((float)(var3 - f_26659) / f_27756, 0.0F, 1.0F);
         float var6 = 1.0F - m_7937(var5);
         float var7 = 1.0F - (float)Math.pow(f_27757, var2 * f_27758);
         f_26658 = Mth.lerp(var7, f_26658, var6);
         return f_26658 < f_27759 ? var1 : Class_BftdentXEtGbugJw.m_2302(var1, f_27760, f_26658);
      }
   }

   private static float m_7827(float var0) {
      return var0 * var0 * var0 * (var0 * (var0 * f_27178 - f_27179) + f_27180);
   }

   private static List<Vec3> m_7828(Vec3 var0, Vec3 var1, int var2, double var3) {
      if (var2 <= 0) {
         ArrayList var13 = new ArrayList(2);
         var13.add(var0);
         var13.add(var1);
         return var13;
      } else {
         Vec3 var5 = var1.subtract(var0);
         Vec3 var6 = var0.add(var5.scale(f_27241));
         Vec3 var7 = m_7928(var5);
         double var8 = (f_26557.nextDouble() - f_27242) * f_27243 * var3;
         Vec3 var10 = var6.add(var7.scale(var8));
         List var11 = m_7828(var0, var10, var2 - 1, var3 * f_27244);
         List var12 = m_7828(var10, var1, var2 - 1, var3 * f_27245);
         var11.remove(var11.size() - 1);
         var11.addAll(var12);
         return var11;
      }
   }

   private static RenderPipeline m_7829() {
      return f_26602 ? f_26527 : f_26526;
   }

   private static void m_7830(BufferBuilder var0, Identifier var1, boolean var2, RenderPipeline var3) {
      MeshData var4 = var0.build();
      if (var4 != null) {
         GpuBuffer var5 = null;

         try {
            DrawState var6 = var4.drawState();
            int var7 = var6.indexCount();
            AutoStorageIndexBuffer var8 = RenderSystem.getSequentialBuffer(var6.primitiveTopology());
            GpuBuffer var9 = var8.getBuffer(var7);
            IndexType var10 = var8.type();
            var5 = RenderSystem.getDevice().createBuffer(() -> f_27883, 32, var4.vertexBuffer());
            if (var2 && f_26628) {
               Class_tXNQy8JnA8G6nDOI.f_31830.m_8874(var5, var9, var10, var7, f_26629);
            }

            RenderTarget var11 = f_11537.gameRenderer.mainRenderTarget();
            CommandEncoder var12 = RenderSystem.getDevice().createCommandEncoder();
            AbstractTexture var13 = f_11537.getTextureManager().getTexture(var1);
            RenderPass var14 = var12.createRenderPass(
               () -> f_27882, var11.getColorTextureView(), Optional.empty(), var11.getDepthTextureView(), OptionalDouble.empty()
            );

            try {
               RenderSystem.bindDefaultUniforms(var14);
               var14.setPipeline(var3);
               var14.bindTexture(f_27877, var13.getTextureView(), var13.getSampler());
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

   private static RenderPipeline m_7831() {
      return f_26602 ? f_26520 : f_26525;
   }

   private static float m_7832(float var0) {
      var0 = Mth.clamp(var0, 0.0F, 1.0F);
      return var0 * var0 * (f_27876 - 2.0F * var0);
   }

   private static void m_7833(BufferBuilder var0, Identifier var1) {
      m_7942(var0, var1, false);
   }

   private static void m_7834(BufferBuilder var0, Matrix4f var1, List<Vec3> var2, float var3, float var4, int var5, float var6, float var7) {
      int var8 = var2.size() - 1;
      if (var8 > 0 && !(var3 <= 0.0F) && !(var4 <= f_27335)) {
         float var9 = var3 * var8;

         for (int var10 = 0; var10 < var8 && !(var9 <= var10); var10++) {
            float var11 = Mth.clamp(var9 - var10, 0.0F, 1.0F);
            float var12 = m_7858(var10 + 1, var6);
            float var13 = 1.0F - m_7832(Mth.clamp((var7 - var12 * f_27336) / f_27337, 0.0F, 1.0F));
            if (!(var13 <= f_27338)) {
               Vec3 var14 = (Vec3)var2.get(var10);
               Vec3 var15 = (Vec3)var2.get(var10 + 1);
               Vec3 var16 = var11 < 1.0F ? var14.lerp(var15, var11) : var15;
               Vec3 var17 = var16.subtract(var14);
               if (!(var17.lengthSqr() < f_27339)) {
                  var17 = var17.normalize();
                  Vec3 var18 = Math.abs(var17.y) < f_27340 ? new Vec3(0.0, 1.0, 0.0) : new Vec3(1.0, 0.0, 0.0);
                  Vec3 var19 = var17.cross(var18);
                  if (var19.lengthSqr() < f_27341) {
                     var19 = new Vec3(0.0, 0.0, 1.0);
                  }

                  var19 = var19.normalize();
                  Vec3 var20 = var17.cross(var19).normalize();
                  if (var10 > 0) {
                     var14 = var14.subtract(var17.scale(var4 * f_27342));
                  }

                  if (var11 >= 1.0F && var10 < var8 - 1) {
                     var16 = var16.add(var17.scale(var4 * f_27343));
                  }

                  float var21 = (var10 + var11 * f_27344) / var8;
                  float var22 = Mth.lerp(var21, f_27345, f_27346);
                  float var23 = var11 < 1.0F ? f_27347 : 1.0F;
                  float var24 = var4 * var22 * var23;
                  float var25 = var24 * Mth.lerp(var11, 1.0F, f_27348);
                  float var26 = (1.0F - var21 * f_27349) * (f_27350 + var12 * f_27351) * var13;
                  int var27 = m_7887(var5, var26);
                  byte var28 = 6;

                  for (int var29 = 0; var29 < var28; var29++) {
                     double var30 = f_27352 * var29 / var28;
                     double var32 = f_27353 * (var29 + 1) / var28;
                     Vec3 var34 = var14.add(var19.scale(Math.cos(var30) * var24)).add(var20.scale(Math.sin(var30) * var24));
                     Vec3 var35 = var14.add(var19.scale(Math.cos(var32) * var24)).add(var20.scale(Math.sin(var32) * var24));
                     Vec3 var36 = var16.add(var19.scale(Math.cos(var30) * var25)).add(var20.scale(Math.sin(var30) * var25));
                     Vec3 var37 = var16.add(var19.scale(Math.cos(var32) * var25)).add(var20.scale(Math.sin(var32) * var25));
                     m_7812(var0, var1, (float)var34.x, (float)var34.y, (float)var34.z, 0.0F, (float)var29 / var28, var27);
                     m_7812(var0, var1, (float)var35.x, (float)var35.y, (float)var35.z, 0.0F, (var29 + 1.0F) / var28, var27);
                     m_7812(var0, var1, (float)var37.x, (float)var37.y, (float)var37.z, var11, (var29 + 1.0F) / var28, var27);
                     m_7812(var0, var1, (float)var36.x, (float)var36.y, (float)var36.z, var11, (float)var29 / var28, var27);
                  }
               }
            }
         }
      }
   }

   private static void m_7835(BufferBuilder var0, Matrix4f var1, Vec3 var2, Vec3 var3, Vec3 var4, double var5, int var7, int var8, int var9) {
      for (int var10 = 0; var10 < var7; var10++) {
         double var11 = f_26940 + f_26941 * var10 / var7;
         double var13 = f_26942 + f_26943 * (var10 + 1) / var7;

         for (int var15 = 0; var15 < var8; var15++) {
            double var16 = f_26944 * var15 / var8;
            double var18 = f_26945 * (var15 + 1) / var8;
            Vec3 var20 = m_7878(var4, var5, var11, var16);
            Vec3 var21 = m_7878(var4, var5, var11, var18);
            Vec3 var22 = m_7878(var4, var5, var13, var18);
            Vec3 var23 = m_7878(var4, var5, var13, var16);
            m_7945(var0, var1, m_7870(var20, var2, var3), m_7870(var21, var2, var3), m_7870(var22, var2, var3), m_7870(var23, var2, var3), var9);
         }
      }
   }

   private static void m_7836(Class_TZhU50s8XmBQCMP5 var0, Vec3 var1, LivingEntity var2, int var3, int var4, float var5) {
      Vec3 var6 = f_11537.gameRenderer.mainCamera().position();
      Vec3 var7 = var1.add(0.0, var2.getBbHeight() * f_27632, 0.0).subtract(var6);
      BufferBuilder var8 = m_7952();
      PoseStack var9 = var0.m_5006();
      var9.pushPose();
      var9.translate(var7.x, var7.y, var7.z);
      var9.scale(f_27633, f_27634, f_27635);
      double var10 = (System.currentTimeMillis() - f_26564) / f_27636;

      for (int var12 = 0; var12 < 4; var12++) {
         for (int var13 = 0; var13 < 9; var13++) {
            var9.pushPose();
            float var14 = var13 / f_27637;
            float var15 = (f_27638 * (1.0F - var14) + f_27639 * var14) * f_27640;
            double var16 = var10 - var12 * f_27641;
            double var18 = f_27642 * (var16 - var13 * f_27643) / f_27644;
            double var20 = 0.0;
            double var22 = -Math.cos(var18) * f_27645;
            double var24 = Math.sin(var18) * f_27646;
            switch (var12) {
               case 0:
                  var20 += var13 * f_27647;
                  var9.translate(var22, var20 + f_27648, var24);
                  break;
               case 1:
               case 3:
                  var20 -= var13 * f_27649;
                  var9.translate(var22, var20 - f_27650, var24);
                  break;
               case 2:
               default:
                  var20 += var13 * f_27651;
                  var9.translate(var22, var20, var24);
            }

            int var26 = m_7887(m_7909(var3, var4, var13 * 25, false), var5);
            var9.mulPose(f_11537.gameRenderer.mainCamera().rotation());
            Matrix4f var27 = var9.last().pose();
            m_7850(var8, var27, var15, m_7920(var26));
            if (f_26630) {
               int var28 = m_7887(m_7817(var26, f_27652), f_27653);
               m_7850(var8, var27, var15 * f_27654, m_7920(var28));
               m_7850(var8, var27, var15 * f_27655, m_7920(m_7887(var28, f_27656)));
            }

            var9.popPose();
         }
      }

      var9.popPose();
      m_7872(var8, f_26514);
   }

   private static Vec3 m_7837(double var0, double var2, double var4, double var6) {
      double var8 = Math.sin(var0) * f_27049;
      double var10 = Math.cos(var0) * f_27050;
      if (var2 == 1.0 && var4 == 1.0 && var6 == f_27051) {
         return new Vec3(var8, var10, -var10);
      } else {
         return var2 == f_27052 && var4 == 1.0 && var6 == f_27053 ? new Vec3(-var8, var8, -var10) : new Vec3(-var8, -var8, var10);
      }
   }

   private static void m_7839(
      BufferBuilder var0,
      Matrix4f var1,
      double var2,
      double var4,
      double var6,
      long var8,
      double var10,
      float var12,
      float var13,
      int var14,
      int var15,
      int var16
   ) {
      double var17 = f_26994 * (1.0 + f_26995 * var13);
      float var19 = f_26996 + f_26997 * var13;

      for (int var20 = 0; var20 < 20; var20++) {
         float var21 = 1.0F - var20 / f_26998 * var19;
         double var22 = var8 * f_26999 - var20 * var17 + f_26592;
         double var24 = Math.sin(var22) * var10;
         double var26 = Math.cos(var22) * var10;
         double var28 = var2;
         double var30 = var4;
         double var32 = var6;
         switch (var16) {
            case 0:
               var28 += var24;
               var30 += var26;
               var32 -= var26;
               break;
            case 1:
               var28 -= var24;
               var30 += var24;
               var32 -= var26;
               break;
            default:
               var28 -= var24;
               var30 -= var24;
               var32 += var26;
         }

         float var34 = f_27000 * var21 * var12;
         m_7893(var0, var1, var28, var30, var32, var34 * f_27001, var14);
         m_7893(var0, var1, var28, var30, var32, var34 * f_27002, var15);
      }
   }

   private static void m_7840(PoseStack var0, BufferBuilder var1, Vec3 var2, float var3, int var4) {
      long var5 = System.currentTimeMillis();
      Iterator var7 = f_26609.iterator();

      while (var7.hasNext()) {
         Class_oV1nLcU0paHSE9Oj.BNt5vHvMwoeyBNKB var8 = (Class_oV1nLcU0paHSE9Oj.BNt5vHvMwoeyBNKB)var7.next();
         long var9 = var5 - var8.f_26460;
         if (var9 > f_27016) {
            var7.remove();
         } else {
            float var11 = 1.0F - (float)var9 / f_27017;
            if (var11 <= 0.0F) {
               var7.remove();
            } else {
               float var12 = Mth.clamp(var3 * var8.f_26462 * var11 * f_27018, 0.0F, 1.0F);
               float var13 = var8.f_26461 * (f_27019 + f_27020 * var11);
               m_7949(var0, var1, var8.f_26459.x - var2.x, var8.f_26459.y - var2.y, var8.f_26459.z - var2.z, var13, var12, var4);
            }
         }
      }
   }

   private static boolean m_7841(String var0) {
      if (f_26736.equals(var0)) {
         return f_26604;
      } else {
         return f_26737.equals(var0) ? f_26602 : true;
      }
   }

   private static BufferBuilder m_7842() {
      return Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.TRIANGLES, DefaultVertexFormat.POSITION_TEX_COLOR);
   }

   private static void m_7843(Class_TZhU50s8XmBQCMP5 var0, Vec3 var1, LivingEntity var2, int var3, float var4) {
      var1 = var1.subtract(f_11537.gameRenderer.mainCamera().position());
      float var5 = f_26545 * f_26570;
      float var6 = var2.getBbWidth() * f_27561;
      float var7 = var2.getBbHeight();
      float var8 = m_7937(var4);
      int var9 = m_7898(var3, f_27562);
      short var10 = 144;
      byte var11 = 32;
      Matrix4f var12 = var0.m_5006().last().pose();
      BufferBuilder var13 = m_7952();
      double var14 = Math.abs(Math.sin(var5)) * var7;
      double var16 = Math.abs(Math.sin(var5 - f_27563)) * var7;

      for (int var18 = 0; var18 < var10; var18++) {
         double var19 = f_27564 * var18 / var10;
         double var21 = var1.x + Math.cos(var19) * var6;
         double var23 = var1.z + Math.sin(var19) * var6;
         int var25 = m_7819(var3, var9, var18 * (f_27565 / var10));
         m_7893(var13, var12, var21, var1.y + var14, var23, f_27566, m_7887(var25, var8 * f_27567));

         for (int var26 = 1; var26 <= var11; var26++) {
            float var27 = (float)var26 / var11;
            double var28 = var14 + (var16 - var14) * var27;
            float var30 = var8 * (1.0F - var27 * f_27568) * f_27569;
            float var31 = Mth.lerp(var27, f_27570, f_27571);
            m_7893(var13, var12, var21, var1.y + var28, var23, var31, m_7887(var25, var30));
         }
      }

      m_7942(var13, f_26518, true);
   }

   private static void m_7844(BufferBuilder var0, Matrix4f var1, List<Vec3> var2, float var3, float var4, int var5, int var6, float var7) {
      int var8 = var2.size() - 1;
      if (var8 > 0 && !(var4 <= f_27156) && !(var3 <= f_27157)) {
         float var9 = var3 * var8;
         int var10 = Math.min(var8 - 1, (int)var9);
         Vec3[] var11 = new Vec3[var10 + 2];
         Vec3[] var12 = new Vec3[var10 + 2];
         Vec3[] var13 = new Vec3[var10 + 2];
         Vec3 var14 = null;

         for (int var15 = 0; var15 < var11.length; var15++) {
            Vec3 var16 = (Vec3)var2.get(Math.max(0, var15 - 1));
            Vec3 var17 = (Vec3)var2.get(Math.min(var2.size() - 1, var15 + 1));
            Vec3 var18 = var17.subtract(var16);
            if (var18.lengthSqr() < f_27158) {
               var18 = new Vec3(0.0, 1.0, 0.0);
            }

            var18 = var18.normalize();
            Vec3 var19 = Math.abs(var18.y) < f_27159 ? new Vec3(0.0, 1.0, 0.0) : new Vec3(1.0, 0.0, 0.0);
            Vec3 var20 = var18.cross(var19);
            if (var20.lengthSqr() < f_27160) {
               var20 = new Vec3(1.0, 0.0, 0.0);
            }

            var20 = var20.normalize();
            if (var14 != null && var20.dot(var14) < 0.0) {
               var20 = var20.scale(f_27161);
            }

            if (var14 != null) {
               var20 = var14.add(var20).normalize();
               if (var20.lengthSqr() < f_27162) {
                  var20 = var14;
               }
            }

            Vec3 var21 = var18.cross(var20).normalize();
            var11[var15] = var18;
            var12[var15] = var20;
            var13[var15] = var21;
            var14 = var20;
         }

         float var45 = var6 / f_27163;
         float var46 = var45 + f_27164;
         byte var47 = 6;
         float var49 = var4;

         for (int var50 = 0; var50 <= var10; var50++) {
            float var52 = Mth.clamp(var9 - var50, 0.0F, 1.0F);
            if (var52 <= f_27165) {
               break;
            }

            float var53 = var49 * m_7810(var50, var2.size());
            float var22 = var49 * m_7810(var50 + 1, var2.size());
            if (var52 < 1.0F) {
               var22 = Mth.lerp(var52, var53, var22);
            }

            Vec3 var23 = (Vec3)var2.get(var50);
            Vec3 var24 = (Vec3)var2.get(var50 + 1);
            if (var52 < 1.0F) {
               var24 = var23.lerp(var24, var52);
            }

            Vec3 var25 = var12[var50];
            Vec3 var26 = var13[var50];
            Vec3 var27 = var50 + 1 < var12.length ? var12[var50 + 1] : var12[var50];
            Vec3 var28 = var50 + 1 < var13.length ? var13[var50 + 1] : var13[var50];
            if (var52 < 1.0F) {
               var27 = var25.lerp(var27, var52).normalize();
               var28 = var26.lerp(var28, var52).normalize();
            }

            float var29 = (float)var50 / var8 * f_27166 + var7;
            float var30 = (var50 + var52) / var8 * f_27167 + var7;
            int var31 = var52 < 1.0F ? m_7887(var5, var52) : var5;

            for (int var32 = 0; var32 < 6; var32++) {
               float var33 = (float)(f_27168 * var32 / f_27169);
               float var34 = (float)(f_27170 * (var32 + 1) / f_27171);
               float var35 = (float)Math.cos(var33);
               float var36 = (float)Math.sin(var33);
               float var37 = (float)Math.cos(var34);
               float var38 = (float)Math.sin(var34);
               Vec3 var39 = var23.add(var25.scale(var35 * var53)).add(var26.scale(var36 * var53));
               Vec3 var40 = var23.add(var25.scale(var37 * var53)).add(var26.scale(var38 * var53));
               Vec3 var41 = var24.add(var27.scale(var37 * var22)).add(var28.scale(var38 * var22));
               Vec3 var42 = var24.add(var27.scale(var35 * var22)).add(var28.scale(var36 * var22));
               float var43 = Mth.lerp(var32 / f_27172, var45, var46);
               float var44 = Mth.lerp((var32 + 1) / f_27173, var45, var46);
               m_7812(var0, var1, (float)var39.x, (float)var39.y, (float)var39.z, var29, var43, var5);
               m_7812(var0, var1, (float)var40.x, (float)var40.y, (float)var40.z, var29, var44, var5);
               m_7812(var0, var1, (float)var41.x, (float)var41.y, (float)var41.z, var30, var44, var31);
               m_7812(var0, var1, (float)var42.x, (float)var42.y, (float)var42.z, var30, var43, var31);
            }
         }
      }
   }

   private static void m_7845(
      BufferBuilder var0, Matrix4f var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11
   ) {
      Vector4f var12 = Class_BftdentXEtGbugJw.m_2298(var11);
      m_7931(var0, var1, var2, var3, var4, f_27850, f_27851, var12);
      m_7931(var0, var1, var5, var6, var7, f_27852, f_27853, var12);
      m_7931(var0, var1, var8, var9, var10, f_27854, f_27855, var12);
      m_7931(var0, var1, var8, var9, var10, f_27856, f_27857, var12);
   }

   private static int m_7846(int var0, int var1, int var2, float var3, float var4) {
      int var5 = Class_LsNSRvPKh5AwfAUe.m_3842() ? Class_BftdentXEtGbugJw.m_2304(var2) : m_7909(var0, var1, var2, false);
      int var6 = m_7817(var5, 1.0F - var4);
      if (var3 > 0.0F) {
         int var7 = Class_BftdentXEtGbugJw.m_2300(f_27588, -29556, var2, 4);
         var6 = Class_BftdentXEtGbugJw.m_2302(var6, var7, var3);
      }

      return var6;
   }

   private static void m_7847(Class_TZhU50s8XmBQCMP5 var0, Vec3 var1, LivingEntity var2, int var3, float var4, float var5, boolean var6) {
      if (!(var4 <= f_26982)) {
         if (f_26594 != var2.getId()) {
            f_26594 = var2.getId();
            f_26590 = 1.0F;
            f_26591 = 0.0F;
            f_26593 = false;
         }

         boolean var7 = var6 && var2.hurtTime > 7;
         if (var7 && !f_26593) {
            f_26590 = 0.0F;
            f_26593 = true;
         } else if (!var7) {
            f_26593 = false;
         }

         if (f_26590 < 1.0F) {
            f_26590 = Math.min(1.0F, f_26590 + var5 / 1.0F);
         }

         f_26591 = m_7886(f_26591, m_7879(f_26590), var5 / f_26983);
         float var8 = f_26591;
         f_26592 = f_26592 + var5 * var8 * f_26984;
         Vec3 var9 = var1.subtract(f_11537.gameRenderer.mainCamera().position());
         double var10 = var9.x;
         double var12 = var9.y + var2.getBbHeight() * f_26985;
         double var14 = var9.z;
         long var16 = System.currentTimeMillis();
         int var18 = Class_BftdentXEtGbugJw.m_2302(var3, -1, var8 * f_26986);
         int var19 = m_7887(var18, Math.min(1.0F, var4 * (1.0F + var8)));
         int var20 = m_7887(var18, var4 * f_26987);
         double var21 = f_26988 * (1.0 + f_26989 * var8);
         float var23 = 1.0F * (1.0F + f_26990 * var8);
         Matrix4f var24 = var0.m_5006().last().pose();
         BufferBuilder var25 = m_7952();

         for (int var26 = 0; var26 < 3; var26++) {
            m_7839(var25, var24, var10, var12, var14, var16, var21, var23, var8, var19, var20, var26);
         }

         if (var8 > f_26991) {
            m_7813(var25, var24, var10, var12, var14, var18, var4 * var8);
            m_7893(var25, var24, var10, var12, var14, f_26992 * var8, m_7887(var18, var4 * var8 * f_26993));
         }

         m_7942(var25, f_26518, true);
      }
   }

   private static void m_7848(Class_TZhU50s8XmBQCMP5 var0, Vec3 var1, LivingEntity var2, int var3, float var4, long var5, boolean var7) {
      f_26617.removeIf(var2x -> var5 - var2x.f_26486 > var2x.f_26487);
      f_26617.removeIf(var0x -> var0x.f_26478 < 1.0F);
      if (var7) {
         while (f_26617.size() < 2) {
            f_26617.add(m_7881(var5 - f_26557.nextInt(120)));
         }

         if (var5 - f_26618 >= f_27056 && f_26617.size() < 3) {
            f_26617.add(m_7881(var5));
            f_26618 = var5;
         }
      }

      if (!f_26617.isEmpty() && !(var4 <= f_27057)) {
         Vec3 var8 = var1.subtract(f_11537.gameRenderer.mainCamera().position());
         float var9 = Math.max(var2.getBbHeight(), f_27058);
         float var10 = Math.max(var2.getBbWidth() * f_27059, f_27060);
         float var11 = var10 + f_27061;
         Matrix4f var12 = var0.m_5006().last().pose();
         PoseStack var13 = var0.m_5006();
         int var14 = m_7817(var3, f_27062);
         int var15 = m_7817(var3, f_27063);
         ArrayList var16 = new ArrayList(f_26617.size());
         float[] var17 = new float[f_26617.size()];

         for (int var18 = 0; var18 < f_26617.size(); var18++) {
            Class_oV1nLcU0paHSE9Oj.F0nIo1tGX54h6o8A var19 = f_26617.get(var18);
            float var20 = m_7960(var19, var5, var4);
            var17[var18] = var20;
            ArrayList var21 = new ArrayList(28);
            if (var20 > f_27064) {
               int var22 = (int)((var5 - var19.f_26486) / f_27065);
               m_7961(var19, var8, var9, var11, var22, var21);
            }

            var16.add(var21);
         }

         BufferBuilder var26 = m_7952();

         for (int var27 = 0; var27 < f_26617.size(); var27++) {
            float var29 = var17[var27];
            List var32 = (List)var16.get(var27);
            if (!(var29 <= f_27066) && var32.size() >= 2) {
               Class_oV1nLcU0paHSE9Oj.F0nIo1tGX54h6o8A var35 = f_26617.get(var27);

               for (int var23 = 0; var23 < var32.size(); var23++) {
                  Vec3 var24 = (Vec3)var32.get(var23);
                  float var25 = m_7810(var23, var32.size()) * var35.f_26482;
                  m_7954(var26, var13, var24.x, var24.y, var24.z, f_27067 * var25, m_7887(var3, var29 * f_27068));
                  m_7954(var26, var13, var24.x, var24.y, var24.z, f_27069 * var25, m_7887(var14, var29 * f_27070));
               }
            }
         }

         m_7830(var26, f_26515, false, f_26535);
         BufferBuilder var28 = m_7952();

         for (int var30 = 0; var30 < f_26617.size(); var30++) {
            float var33 = var17[var30];
            List var36 = (List)var16.get(var30);
            if (!(var33 <= f_27071) && var36.size() >= 2) {
               float var38 = f_27072 * f_26617.get(var30).f_26482;
               m_7866(var28, var12, var36, var38 * f_27073, m_7887(var3, var33 * f_27074));
               m_7866(var28, var12, var36, var38 * f_27075, m_7887(var14, var33 * f_27076));
            }
         }

         m_7830(var28, f_26518, false, f_26535);
         BufferBuilder var31 = m_7952();

         for (int var34 = 0; var34 < f_26617.size(); var34++) {
            float var37 = var17[var34];
            List var39 = (List)var16.get(var34);
            if (!(var37 <= f_27077) && var39.size() >= 2) {
               float var40 = f_27078 * f_26617.get(var34).f_26482;
               m_7866(var31, var12, var39, var40, m_7887(var15, var37));
               m_7866(var31, var12, var39, var40 * f_27079, m_7887(-1, var37));
            }
         }

         m_7830(var31, f_26518, false, f_26535);
      }
   }

   private static void m_7849(Class_TZhU50s8XmBQCMP5 var0, Vec3 var1, LivingEntity var2, int var3, int var4, float var5, long var6) {
      var1 = var1.subtract(f_11537.gameRenderer.mainCamera().position());
      m_7871(var2);
      byte var8 = 12;
      byte var9 = 20;
      int var10 = var8 + var9;
      float var11 = (float)(var6 % f_26770) / f_26771;
      float var12 = (float)(var6 % f_26772) / f_26773;
      float var13 = (float)var6 * f_26774;
      float var14 = var2.getBbWidth() * f_26775;
      float var15 = f_26776 * (f_26777 + f_26778 * var5);
      float var16 = var2.getBbHeight();
      float var17 = f_26779 - f_26780 * var5;
      PoseStack var18 = var0.m_5006();
      BufferBuilder var19 = m_7952();

      for (int var20 = 0; var20 < var10; var20++) {
         Class_oV1nLcU0paHSE9Oj.CGX9upVJA0hI2PBi var21 = m_7859(var20, var8, var9, var11, var12, var13, var14, var16, var15, var17);
         float var22 = f_26781 + var21.size() * f_26782;
         float var23 = f_26783 + var21.size() * f_26784;
         m_7954(var19, var18, var1.x + var21.x(), var1.y + var21.y(), var1.z + var21.z(), var22, m_7887(var3, var5 * f_26785));
         m_7954(var19, var18, var1.x + var21.x(), var1.y + var21.y(), var1.z + var21.z(), var23, m_7887(m_7817(var3, f_26786), var5 * f_26787));
      }

      m_7942(var19, f_26515, true);
      int var26 = Class_BftdentXEtGbugJw.m_2303(
         Class_BftdentXEtGbugJw.m_2309(var3), Class_BftdentXEtGbugJw.m_2299(var3), Class_BftdentXEtGbugJw.m_2308(var3), Math.round(f_26788 * var5)
      );
      int var27 = Class_BftdentXEtGbugJw.m_2303(
         Class_BftdentXEtGbugJw.m_2309(var3), Class_BftdentXEtGbugJw.m_2299(var3), Class_BftdentXEtGbugJw.m_2308(var3), Math.round(f_26789 * var5)
      );
      BufferBuilder var28 = m_7952();
      var18.pushPose();
      var18.translate(var1.x, var1.y, var1.z);

      for (int var29 = 0; var29 < var10; var29++) {
         Class_oV1nLcU0paHSE9Oj.CGX9upVJA0hI2PBi var24 = m_7859(var29, var8, var9, var11, var12, var13, var14, var16, var15, var17);
         m_7938(var28, var18, var24.x(), var24.y(), var24.z(), var24.size() * f_26790, var27, var4, var24.spin(), var29, var16, true);
         m_7938(var28, var18, var24.x(), var24.y(), var24.z(), var24.size(), var26, var4, var24.spin(), var29, var16, false);
      }

      var18.popPose();
      m_7825(var28, f_26523);
   }

   private static void m_7850(BufferBuilder var0, Matrix4f var1, float var2, int var3) {
      Class_vjVj7yuYZq5AqDPM.m_9276(var1, 0.0F, 0.0F, 0.0F, var2 * 2.0F, var3);
      Vector4f var4 = Class_BftdentXEtGbugJw.m_2298(var3);
      m_7931(var0, var1, -var2, -var2, 0.0F, 1.0F, 1.0F, var4);
      m_7931(var0, var1, var2, -var2, 0.0F, 0.0F, 1.0F, var4);
      m_7931(var0, var1, var2, var2, 0.0F, 0.0F, 0.0F, var4);
      m_7931(var0, var1, -var2, var2, 0.0F, 1.0F, 0.0F, var4);
   }

   private static void m_7852(PoseStack var0, int var1, float var2, long var3) {
      byte var5 = 5;
      float[] var6 = new float[]{f_27431, f_27432};
      float[] var7 = new float[]{f_27433, f_27434};
      float[] var8 = new float[]{0.0F, f_27435};
      float[][][] var9 = new float[6][][];

      for (int var10 = 0; var10 <= 5; var10++) {
         float var11 = var10 / f_27436;
         float var12 = var6[0] + (var8[0] - var6[0]) * var11;
         float var13 = var6[1] + (var8[1] - var6[1]) * var11;
         float var14 = var7[0] + (var8[0] - var7[0]) * var11;
         float var15 = var7[1] + (var8[1] - var7[1]) * var11;
         int var16 = 5 - var10;
         var9[var10] = new float[var16 + 1][2];

         for (int var17 = 0; var17 <= var16; var17++) {
            float var18 = var16 == 0 ? 0.0F : (float)var17 / var16;
            var9[var10][var17][0] = var12 + (var14 - var12) * var18;
            var9[var10][var17][1] = var13 + (var15 - var13) * var18;
         }
      }

      ArrayList var25 = new ArrayList();

      for (int var26 = 0; var26 < 5; var26++) {
         int var28 = 5 - var26;

         for (int var30 = 0; var30 < var28; var30++) {
            var25.add(new float[][]{var9[var26][var30], var9[var26][var30 + 1], var9[var26 + 1][var30]});
            if (var30 < var28 - 1) {
               var25.add(new float[][]{var9[var26][var30 + 1], var9[var26 + 1][var30 + 1], var9[var26 + 1][var30]});
            }
         }
      }

      Matrix4f var27 = var0.last().pose();
      int var29 = Class_BftdentXEtGbugJw.m_2312(var1, -1, f_27437);
      BufferBuilder var31 = m_7952();

      for (int var32 = 0; var32 < var25.size(); var32++) {
         float[][] var34 = (float[][])var25.get(var32);
         float var37 = (var34[0][0] + var34[1][0] + var34[2][0]) / f_27438;
         float var40 = (var34[0][1] + var34[1][1] + var34[2][1]) / f_27439;
         float[] var43 = m_7868(var37, var3);
         float var19 = var43[0];
         float var20 = var43[1];
         float var21 = var43[2];
         float var22 = var43[3];
         Matrix4f var23 = m_7874(var27, var37, var40, var19, var20);
         int var24 = m_7922(var40, var32, var1);
         if (var21 > 0.0F) {
            var24 = Class_BftdentXEtGbugJw.m_2312(var24, -1, var21 * f_27440);
         }

         if (var22 > 0.0F) {
            var24 = Class_BftdentXEtGbugJw.m_2312(var24, var29, Mth.clamp(var22 * f_27441, 0.0F, 1.0F));
         }

         m_7845(var31, var23, var34[0][0], var34[0][1], 0.0F, var34[1][0], var34[1][1], 0.0F, var34[2][0], var34[2][1], 0.0F, m_7887(var24, var2));
      }

      m_7854(var31, f_26533, true);
      ArrayList var33 = new ArrayList();

      for (int var35 = 0; var35 < var25.size(); var35++) {
         float[][] var38 = (float[][])var25.get(var35);
         float var41 = (var38[0][0] + var38[1][0] + var38[2][0]) / f_27442;
         if (m_7868(var41, var3)[2] > f_27443) {
            var33.add(var35);
         }
      }

      if (!var33.isEmpty()) {
         BufferBuilder var36 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.DEBUG_LINES, DefaultVertexFormat.POSITION_COLOR);

         for (Object var42_obj : var33) {
            int var42 = (Integer)var42_obj;
            float[][] var44 = (float[][])var25.get(var42);
            float var45 = (var44[0][0] + var44[1][0] + var44[2][0]) / f_27444;
            float var46 = (var44[0][1] + var44[1][1] + var44[2][1]) / f_27445;
            float[] var47 = m_7868(var45, var3);
            Matrix4f var48 = m_7874(var27, var45, var46, var47[0], var47[1]);
            int var49 = m_7887(Class_BftdentXEtGbugJw.m_2312(var1, -1, f_27446), (f_27447 + f_27448 * var47[2]) / f_27449 * var2);
            Vector4f var50 = Class_BftdentXEtGbugJw.m_2298(var49);
            m_7865(var36, var48, var44[0][0], var44[0][1], 0.0F, var44[1][0], var44[1][1], 0.0F, var50);
            m_7865(var36, var48, var44[1][0], var44[1][1], 0.0F, var44[2][0], var44[2][1], 0.0F, var50);
            m_7865(var36, var48, var44[2][0], var44[2][1], 0.0F, var44[0][0], var44[0][1], 0.0F, var50);
         }

         m_7923(var36, f_26539);
      }
   }

   private static void m_7853(Class_TZhU50s8XmBQCMP5 var0, Vec3 var1, LivingEntity var2, int var3, int var4, float var5, float var6) {
      Vec3 var7 = f_11537.gameRenderer.mainCamera().position();
      float var8 = var2.getBbHeight();
      long var9 = f_27601;
      double var11 = System.currentTimeMillis() % var9;
      boolean var13 = var11 > var9 / f_27602;
      float var14 = (float)(var11 / (var9 / f_27603));
      if (var13) {
         var14--;
      } else {
         var14 = 1.0F - var14;
      }

      var14 = var14 < f_27604 ? 2.0F * var14 * var14 : (float)(1.0 - Math.pow(f_27605 * var14 + f_27606, f_27607) / f_27608);
      double var15 = var8 / f_27609 * (var14 > f_27610 ? 1.0 - var14 : var14) * (var13 ? -1 : 1);
      long var17 = System.nanoTime();
      float var19 = (float)(var17 - f_26566) / f_27611;
      f_26566 = var17;
      float var20 = var2.hurtTime <= 0 ? 0.0F : (var2.hurtTime - var6) / f_27612;
      f_26565 = f_26565 + Math.max(0.0F, var20) * var19;
      float var21 = (float)(System.currentTimeMillis() - f_26564) / f_27613 + f_26565;
      BufferBuilder var22 = m_7952();
      PoseStack var23 = var0.m_5006();
      var23.pushPose();
      var23.translate(var1.x - var7.x, var1.y - var7.y + var8 * var14 + var15, var1.z - var7.z);
      float var24 = f_27614;

      for (int var25 = 0; var25 < 4; var25++) {
         for (int var26 = 0; var26 < 15; var26++) {
            var23.pushPose();
            float var27 = var26 / f_27615;
            float var28 = (f_27616 * (1.0F - var27) + f_27617 * var27) * var5 * f_27618;
            float var29 = f_27619 * (var21 - var26 * f_27620) / f_27621;
            boolean var30 = var27 < f_27622;
            float var31 = var30 ? var27 * 2.0F : (1.0F - var27) * 2.0F;
            double var32 = Math.sin(var31 * f_27623) * f_27624;
            Random var34 = new Random(var26 * f_27625);
            double var35 = (var34.nextDouble() - f_27626) * var32;
            double var37 = (var34.nextDouble() - f_27627) * var32;
            double var39 = (var34.nextDouble() - f_27628) * var32;
            var35 = var35 * var5 - var35;
            var37 = var37 * var5 - var37;
            var39 = var39 * var5 - var39;
            switch (var25) {
               case 0:
                  var23.translate(Math.cos(var29) * var24 + var35, var37, Math.sin(var29) * var24 + var39);
                  break;
               case 1:
                  var23.translate(-Math.sin(var29) * var24 + var35, var37, Math.cos(var29) * var24 + var39);
                  break;
               case 2:
                  var23.translate(-Math.cos(var29) * var24 + var35, var37, -Math.sin(var29) * var24 + var39);
                  break;
               default:
                  var23.translate(Math.sin(var29) * var24 + var35, var37, -Math.cos(var29) * var24 + var39);
            }

            int var41 = m_7817(m_7819(var3, var4, var26 * f_27629), f_27630);
            int var42 = m_7887(var41, var5 * f_27631);
            var23.mulPose(f_11537.gameRenderer.mainCamera().rotation());
            m_7850(var22, var23.last().pose(), var28, m_7920(var42));
            var23.popPose();
         }
      }

      var23.popPose();
      m_7872(var22, f_26514);
   }

   private static void m_7854(BufferBuilder var0, RenderPipeline var1, boolean var2) {
      MeshData var3 = var0.build();
      if (var3 != null) {
         GpuBuffer var4 = null;

         try {
            DrawState var5 = var3.drawState();
            int var6 = var5.indexCount();
            AutoStorageIndexBuffer var7 = RenderSystem.getSequentialBuffer(var5.primitiveTopology());
            GpuBuffer var8 = var7.getBuffer(var6);
            IndexType var9 = var7.type();
            var4 = RenderSystem.getDevice().createBuffer(() -> f_27881, 32, var3.vertexBuffer());
            if (var2 && f_26628) {
               Class_tXNQy8JnA8G6nDOI.f_31830.m_8874(var4, var8, var9, var6, f_26629);
            }

            RenderTarget var10 = f_11537.gameRenderer.mainRenderTarget();
            CommandEncoder var11 = RenderSystem.getDevice().createCommandEncoder();
            RenderPass var12 = var11.createRenderPass(
               () -> f_27880, var10.getColorTextureView(), Optional.empty(), var10.getDepthTextureView(), OptionalDouble.empty()
            );

            try {
               RenderSystem.bindDefaultUniforms(var12);
               var12.setPipeline(var1);
               var12.setVertexBuffer(0, var4.slice());
               var12.setIndexBuffer(var8, var9);
               var12.drawIndexed(var6, 1, 0, 0, 0);
            } catch (Throwable var20) {
               if (var12 != null) {
                  try {
                     var12.close();
                  } catch (Throwable var19) {
                     var20.addSuppressed(var19);
                  }
               }

               throw var20;
            }

            if (var12 != null) {
               var12.close();
            }
         } finally {
            if (var4 != null) {
               var4.close();
            }

            var3.close();
         }
      }
   }

   private static void m_7855(BufferBuilder var0, Matrix4f var1, float var2, int var3) {
      Class_vjVj7yuYZq5AqDPM.m_9276(var1, 0.0F, 0.0F, 0.0F, var2, var3);
      Vector4f var4 = Class_BftdentXEtGbugJw.m_2298(var3);
      float var5 = var2 * f_27761;
      m_7931(var0, var1, -var5, -var5, 0.0F, 0.0F, 1.0F, var4);
      m_7931(var0, var1, -var5, var5, 0.0F, 0.0F, 0.0F, var4);
      m_7931(var0, var1, var5, var5, 0.0F, 1.0F, 0.0F, var4);
      m_7931(var0, var1, var5, -var5, 0.0F, 1.0F, 1.0F, var4);
   }

   private static Class_oV1nLcU0paHSE9Oj.SjzMjyMYX7ylg4dN m_7856(LivingEntity var0, Vec3 var1, long var2, float var4) {
      double var5 = Math.max(var0.getBbHeight(), f_27211);
      double var7 = Math.max(var0.getBbWidth() * f_27212, f_27213) + f_27214 + f_26557.nextDouble() * f_27215;
      int var9 = f_26557.nextBoolean() ? 1 : -1;
      float var10 = f_27216 + f_26557.nextFloat() * f_27217;
      float var11 = var4 * (f_27218 + f_26557.nextFloat() * f_27219) + f_26557.nextFloat() * f_27220 * 2.0F;
      float var12 = f_26557.nextFloat() * f_27221;
      float var13 = Math.min(1.0F, var12 + f_27222 + f_26557.nextFloat() * f_27223);
      Vec3 var14 = m_7903(var1, var5, var7, var11, var10, var9, var12);
      Vec3 var15 = m_7903(var1, var5, var7, var11, var10, var9, var13);
      double var16 = var14.distanceTo(var15);
      List var18 = m_7828(var14, var15, 3, Math.max(f_27224, var16 * f_27225));
      ArrayList var19 = new ArrayList(var18.size());

      for (Object var21_obj : var18) {
         Vec3 var21 = (Vec3)var21_obj;
         var19.add(var21.subtract(var1));
      }

      float var22 = f_27226 + f_26557.nextFloat() * f_27227;
      return new Class_oV1nLcU0paHSE9Oj.SjzMjyMYX7ylg4dN(
         var19, var2, System.nanoTime(), 520 + f_26557.nextInt(260), f_26557.nextFloat() * f_27228, f_27229 + f_26557.nextFloat() * f_27230, var9, var22
      );
   }

   public static void m_7857() {
      f_26644 = false;
      if (f_26645 != null && f_26647 != null) {
         GpuBufferSlice var0 = RenderSystem.getProjectionMatrixBuffer();
         ProjectionType var1 = RenderSystem.getProjectionType();
         Class_TZhU50s8XmBQCMP5 var2 = f_26645;
         LivingEntity var3 = f_26646;
         String var4 = f_26647;
         int var5 = f_26648;
         int var6 = f_26649;
         f_26645 = null;
         f_26646 = null;
         f_26647 = null;

         try {
            RenderSystem.setProjectionMatrix(f_26650, f_26651);
            m_7914(var2, var3, var4, var5, var6);
            if (f_26632) {
               m_7876();
            }
         } finally {
            RenderSystem.setProjectionMatrix(var0, var1);
         }
      }
   }

   private static float m_7858(int var0, float var1) {
      float var2 = (float)Math.sin(var0 * f_27379 + var1 * f_27380);
      var2 *= f_27381;
      return var2 - (float)Math.floor(var2);
   }

   private static Class_oV1nLcU0paHSE9Oj.CGX9upVJA0hI2PBi m_7859(
      int var0, int var1, int var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9
   ) {
      if (var0 >= var1) {
         int var25 = var0 - var1;
         int var26 = var25 * f_26555.size() / var2;
         Vector3f var27 = f_26555.get(var26);
         float var28 = (float)Math.toRadians(var4);
         float var29 = Mth.sin(var28);
         float var30 = Mth.cos(var28);
         float var31 = var27.x * var30 - var27.z * var29;
         float var33 = var27.x * var29 + var27.z * var30;
         float var35 = Mth.sqrt(var31 * var31 + var33 * var33);
         float var36 = var6 * f_26791;
         float var20 = Math.max(var35 * f_26792, var36);
         if (var35 > f_26793) {
            float var21 = var20 / var35;
            var31 *= var21;
            var33 *= var21;
         }

         var31 *= var9;
         var33 *= var9;
         float var37 = var27.y + (float)Math.sin(var5 * f_26794 + var25 * f_26795) * f_26796;
         float var22 = m_7948(var25, f_26797);
         float var23 = var8 * (f_26798 + var22 * f_26799);
         float var24 = var4 * (var25 % 2 == 0 ? f_26800 : f_26801) + var25 * f_26802;
         return new Class_oV1nLcU0paHSE9Oj.CGX9upVJA0hI2PBi(var31, var37, var33, var23, var24);
      } else {
         float var10 = f_26803 * var0 / var1;
         float var11 = (float)Math.toRadians(var10 + var3);
         float var12 = f_26804 + Math.abs((float)Math.sin(var11 * 2.0F)) * f_26805;
         float var13 = var6 * var12 * var9;
         float var14 = (float)Math.sin(var11) * var13;
         float var15 = (float)Math.cos(var11) * var13;
         float var16 = f_26806 + Math.abs((float)Math.sin(var11 * f_26807 + var3 * f_26808));
         float var17 = var7 * (f_26809 + f_26810 * var16);
         float var18 = var8 * (f_26811 + Math.abs((float)Math.sin(var11 * f_26812)) * f_26813);
         float var19 = var3 * f_26814 + var10 * f_26815;
         return new Class_oV1nLcU0paHSE9Oj.CGX9upVJA0hI2PBi(var14, var17, var15, var18, var19);
      }
   }

   private static Vec3[] m_7860(Vec3 var0) {
      Vec3 var1 = Math.abs(var0.y) > f_27413 ? new Vec3(1.0, 0.0, 0.0) : new Vec3(0.0, 1.0, 0.0);
      Vec3 var2 = var1.cross(var0).normalize();
      Vec3 var3 = var0.cross(var2).normalize();
      return new Vec3[]{var2, var3};
   }

   private static Class_oV1nLcU0paHSE9Oj.vbgKRi4F34zTzWmv m_7861(LivingEntity var0, Vec3 var1, long var2) {
      double var4 = Math.max(var0.getBbHeight(), f_27277);
      double var6 = Math.max(var0.getBbWidth() * f_27278, f_27279);
      double var8 = f_26557.nextDouble() * f_27280 * f_27281;
      double var10 = var6 * (f_27282 + f_26557.nextDouble() * f_27283);
      double var12 = var4 * (f_27284 + f_26557.nextDouble() * f_27285);
      Vec3 var14 = var1.add(Math.cos(var8) * var10, var12, Math.sin(var8) * var10);
      double var15 = var8 + (f_26557.nextDouble() - f_27286) * f_27287;
      double var17 = var6 + f_27288 + f_26557.nextDouble() * f_27289;
      double var19 = var4 + f_27290 + f_26557.nextDouble() * f_27291;
      Vec3 var21 = var1.add(Math.cos(var15) * var17, var19, Math.sin(var15) * var17);
      ArrayList var22 = new ArrayList();
      List var23 = m_7875(var21, var14, 4, f_27292 + f_26557.nextDouble() * f_27293);
      var22.add(new Class_oV1nLcU0paHSE9Oj.FDRJZV2OjTT35QNI(var23, 1.0F, 0.0F));
      int var24 = 1 + f_26557.nextInt(3);

      for (int var25 = 0; var25 < var24; var25++) {
         int var26 = 3 + f_26557.nextInt(Math.max(1, var23.size() - 6));
         Vec3 var27 = (Vec3)var23.get(var26);
         Vec3 var28 = var14.subtract(var21);
         if (var28.lengthSqr() < f_27294) {
            var28 = new Vec3(0.0, f_27295, 0.0);
         }

         var28 = var28.normalize();
         Vec3 var29 = var28.cross(new Vec3(0.0, 1.0, 0.0));
         if (var29.lengthSqr() < f_27296) {
            var29 = new Vec3(1.0, 0.0, 0.0);
         }

         var29 = var29.normalize();
         Vec3 var30 = var29.scale(f_26557.nextBoolean() ? 1.0 : f_27297).add(0.0, f_26557.nextDouble() * f_27298 - f_27299, 0.0).normalize();
         double var31 = f_27300 + f_26557.nextDouble() * 1.0;
         Vec3 var33 = var27.add(var30.scale(var31)).add(var28.scale(f_27301 + f_26557.nextDouble() * f_27302));
         float var34 = Mth.clamp((float)var26 / (var23.size() - 1) * f_27303, f_27304, f_27305);
         var22.add(
            new Class_oV1nLcU0paHSE9Oj.FDRJZV2OjTT35QNI(
               m_7875(var27, var33, 3, f_27306 + f_26557.nextDouble() * f_27307), f_27308 + f_26557.nextFloat() * f_27309, var34
            )
         );
      }

      if (f_26557.nextFloat() < f_27310) {
         double var35 = var8 + f_27311 * (f_27312 + f_26557.nextDouble() * f_27313) * (f_26557.nextBoolean() ? 1 : -1);
         Vec3 var36 = var1.add(Math.cos(var35) * var6, var4 * (f_27314 + f_26557.nextDouble() * f_27315), Math.sin(var35) * var6);
         var22.add(new Class_oV1nLcU0paHSE9Oj.FDRJZV2OjTT35QNI(m_7875(var14, var36, 3, f_27316 + f_26557.nextDouble() * f_27317), f_27318, f_27319));
      }

      return new Class_oV1nLcU0paHSE9Oj.vbgKRi4F34zTzWmv(
         var22, var14, var1, var2, 560 + f_26557.nextInt(340), f_26557.nextFloat() * f_27320, -1, 0.0, f_27321, f_27322, f_27323
      );
   }

   private static void m_7862(Vec3[] var0, int var1, int var2, double var3, Random var5) {
      if (var2 - var1 > 1) {
         int var6 = var1 + var2 >>> 1;
         Vec3 var7 = var0[var1];
         Vec3 var8 = var0[var2];
         Vec3 var9 = var7.add(var8).scale(f_27324);
         Vec3 var10 = var8.subtract(var7);
         if (var10.lengthSqr() < f_27325) {
            var0[var6] = var9;
         } else {
            Vec3 var11 = var10.cross(new Vec3(0.0, 1.0, 0.0));
            if (var11.lengthSqr() < f_27326) {
               var11 = var10.cross(new Vec3(1.0, 0.0, 0.0));
            }

            if (var11.lengthSqr() < f_27327) {
               var11 = new Vec3(1.0, 0.0, 0.0);
            }

            var11 = var11.normalize();
            Vec3 var12 = var10.cross(var11);
            if (var12.lengthSqr() < f_27328) {
               var12 = new Vec3(0.0, 1.0, 0.0);
            } else {
               var12 = var12.normalize();
            }

            double var13 = (var5.nextDouble() - f_27329) * f_27330 * var3;
            double var15 = (var5.nextDouble() - f_27331) * var3 * f_27332;
            var0[var6] = var9.add(var11.scale(var13)).add(var12.scale(var15));
            m_7862(var0, var1, var6, var3 * f_27333, var5);
            m_7862(var0, var6, var2, var3 * f_27334, var5);
         }
      }
   }

   private static void m_7863(
      BufferBuilder var0, Matrix4f var1, Vec3 var2, Vec3 var3, Vec3 var4, Vec3 var5, Vec3 var6, Vec3 var7, double var8, double var10, int var12
   ) {
      m_7835(var0, var1, var2, var3, var4, var10, 3, 6, var12);
      Vec3[] var13 = new Vec3[]{var5, var6, var7};

      for (Vec3 var17 : var13) {
         Vec3 var18 = var4.add(var17.scale(var8));
         m_7939(var0, var1, var2, var3, var4, var18, var10, 6, var12);
         m_7835(var0, var1, var2, var3, var18, var10, 3, 6, var12);
      }
   }

   private static void m_7864(Class_TZhU50s8XmBQCMP5 var0, Vec3 var1, LivingEntity var2, int var3, int var4, boolean var5) {
      long var6 = System.currentTimeMillis();
      if (var5 && var6 - f_26567 >= f_27657) {
         f_26567 = var6;
         f_26563 = f_26563 + f_27658;
         double var8 = f_26563 % f_27659;
         float var10 = f_27660 + var2.getBbWidth() * f_27661;
         float var11 = var2.getBbHeight() / 2.0F;

         for (int var12 = 0; var12 < 4; var12++) {
            float var13 = (var12 - 1) * f_27662;
            double var14 = var8 + var13 * f_27663;
            double var16 = Math.toRadians(-var14);
            double var18 = Math.sin(var16 + f_27664) * var13;
            double var20 = Math.cos(var16) * var10;
            double var22 = Math.sin(var16) * var10;
            int var24 = m_7909(var3, var4, (int)var8 + 90 * var12, false);
            f_26562.add(new Class_oV1nLcU0paHSE9Oj.CefWHVrCHHOwSLC4(var1.x + var20, var1.y + var11 + var18, var1.z + var22, var6, var24));
         }
      }

      Vec3 var25 = f_11537.gameRenderer.mainCamera().position();
      BufferBuilder var9 = m_7952();
      PoseStack var26 = var0.m_5006();
      float var27 = f_27665;
      Iterator var28 = f_26562.iterator();

      while (var28.hasNext()) {
         Class_oV1nLcU0paHSE9Oj.CefWHVrCHHOwSLC4 var29 = (Class_oV1nLcU0paHSE9Oj.CefWHVrCHHOwSLC4)var28.next();
         float var30 = (float)(var6 - var29.f_26466);
         var29.m_7806(var6);
         if (var30 > f_27666 && var29.f_26468 < f_27667) {
            var28.remove();
         } else {
            float var15;
            if (var30 < f_27668) {
               var15 = 1.0F - var30 / f_27669;
            } else if (var30 < f_27670) {
               var15 = var30 / f_27671 - 1.0F;
            } else {
               var15 = 1.0F;
            }

            var15 = Mth.clamp(var15, 0.0F, 1.0F);
            if (!(var29.f_26468 <= f_27672)) {
               var26.pushPose();
               var26.translate(var29.f_26463 - var25.x, var29.f_26464 - var25.y, var29.f_26465 - var25.z);
               var26.mulPose(f_11537.gameRenderer.mainCamera().rotation());
               m_7850(var9, var26.last().pose(), var27 * var15, m_7920(m_7887(var29.f_26467, var29.f_26468)));
               var26.popPose();
            }
         }
      }

      m_7872(var9, f_26514);
   }

   private static void m_7865(BufferBuilder var0, Matrix4f var1, float var2, float var3, float var4, float var5, float var6, float var7, Vector4f var8) {
      var0.addVertex(var1, var2, var3, var4).setColor(var8.x, var8.y, var8.z, var8.w);
      var0.addVertex(var1, var5, var6, var7).setColor(var8.x, var8.y, var8.z, var8.w);
   }

   private static void m_7866(BufferBuilder var0, Matrix4f var1, List<Vec3> var2, float var3, int var4) {
      if (var2.size() >= 2 && !(var3 <= f_27144)) {
         Vec3 var5 = Vec3.ZERO;
         Vec3[] var6 = new Vec3[var2.size() - 1];

         for (int var7 = 0; var7 < var2.size() - 1; var7++) {
            Vec3 var8 = (Vec3)var2.get(var7);
            Vec3 var9 = (Vec3)var2.get(var7 + 1);
            Vec3 var10 = var9.subtract(var8);
            if (var10.lengthSqr() < f_27145) {
               var6[var7] = var7 > 0 ? var6[var7 - 1] : new Vec3(1.0, 0.0, 0.0);
            } else {
               var10 = var10.normalize();
               Vec3 var11 = var8.add(var9).scale(f_27146);
               Vec3 var12 = var5.subtract(var11);
               if (var12.lengthSqr() < f_27147) {
                  var12 = new Vec3(0.0, 0.0, 1.0);
               }

               Vec3 var13 = var10.cross(var12.normalize());
               if (var13.lengthSqr() < f_27148) {
                  var13 = var10.cross(new Vec3(0.0, 1.0, 0.0));
                  if (var13.lengthSqr() < f_27149) {
                     var13 = new Vec3(1.0, 0.0, 0.0);
                  }
               }

               var13 = var13.normalize();
               if (var7 > 0 && var13.dot(var6[var7 - 1]) < 0.0) {
                  var13 = var13.scale(f_27150);
               }

               var6[var7] = var13;
            }
         }

         Vec3[] var15 = new Vec3[var2.size()];

         for (int var16 = 0; var16 < var2.size(); var16++) {
            Vec3 var18;
            if (var16 == 0) {
               var18 = var6[0];
            } else if (var16 == var2.size() - 1) {
               var18 = var6[var6.length - 1];
            } else {
               Vec3 var22 = var6[var16 - 1];
               Vec3 var24 = var6[var16];
               var18 = var22.add(var24);
               if (var18.lengthSqr() < f_27151) {
                  var18 = var22;
               } else {
                  var18 = var18.normalize();
               }
            }

            var15[var16] = var18.scale(var3 * m_7810(var16, var2.size()));
         }

         for (int var17 = 0; var17 < var2.size() - 1; var17++) {
            Vec3 var20 = (Vec3)var2.get(var17);
            Vec3 var23 = (Vec3)var2.get(var17 + 1);
            Vec3 var25 = var20.subtract(var15[var17]);
            Vec3 var26 = var20.add(var15[var17]);
            Vec3 var28 = var23.subtract(var15[var17 + 1]);
            Vec3 var14 = var23.add(var15[var17 + 1]);
            m_7812(var0, var1, (float)var25.x, (float)var25.y, (float)var25.z, 0.0F, f_27152, var4);
            m_7812(var0, var1, (float)var26.x, (float)var26.y, (float)var26.z, 1.0F, f_27153, var4);
            m_7812(var0, var1, (float)var14.x, (float)var14.y, (float)var14.z, 1.0F, f_27154, var4);
            m_7812(var0, var1, (float)var28.x, (float)var28.y, (float)var28.z, 0.0F, f_27155, var4);
         }
      }
   }

   public static void m_7867() {
      f_26598 = 0L;
      f_26599 = 0.0F;
      f_26600 = 0.0F;
      f_26543 = null;
      f_26544 = 0.0F;
      f_26545 = 0.0F;
      f_26546 = 0L;
      f_26547 = "";
      f_26548.clear();
      f_26552 = f_26669;
      f_26555.clear();
      f_26556 = f_26670;
      f_26558.clear();
      f_26559 = 0L;
      if (f_26560 != null) {
         f_26560.destroyBuffers();
         f_26560 = null;
      }

      f_26617.clear();
      f_26618 = 0L;
      f_26623.clear();
      f_26624 = 0L;
      f_26606 = "";
      f_26607 = "";
      f_26608 = "";
      f_26609.clear();
      f_26610 = 0L;
      f_26611 = f_26671;
      m_7910();
      Class_8j6qxz5hlVm3X7m2.m_1844();
      m_7892();
      f_26625 = f_26672;
      f_26632 = false;
      f_26635 = 0.0F;
      f_26636 = false;
      f_26637 = false;
      f_26638 = 0.0;
      f_26639 = 0.0;
      f_26640 = 0.0;
      f_26641 = 0.0;
      f_26642 = 0.0;
      f_26643 = 0.0;
   }

   private static float[] m_7868(float var0, long var1) {
      float var3 = 1.0F - Mth.clamp((var0 + f_27450) / f_27451, 0.0F, 1.0F);
      float var4 = (float)var1 * f_27452;
      var4 -= (float)Math.floor(var4);
      float var5 = f_27453;
      float var6 = f_27454;
      float var7 = f_27455;
      float var8 = f_27456;
      if (var4 >= var5) {
         return new float[]{0.0F, 0.0F, 0.0F, 0.0F};
      } else {
         float var9 = var4 / var5 * var6;
         float var10 = (var9 - var3) / var7;
         if (var10 > 0.0F && var10 < 1.0F) {
            float var15 = var10 * var10 * (f_27457 - 2.0F * var10);
            float var16 = (float)(f_27458 * var15);
            float var17 = (float)Math.sin(f_27459 * var10);
            return new float[]{var16, var17 * f_27460, Math.abs((float)Math.sin(var16)), 0.0F};
         } else if (var10 >= 1.0F && var10 < 1.0F + var8) {
            float var11 = (var10 - 1.0F) / var8;
            float var12 = 1.0F - var11;
            float var13 = f_27461 + f_27462 * (float)Math.sin(var11 * f_27463 * f_27464);
            return new float[]{0.0F, 0.0F, 0.0F, var12 * var13};
         } else {
            return new float[]{0.0F, 0.0F, 0.0F, 0.0F};
         }
      }
   }

   private static RenderPipeline m_7869() {
      return f_26602 ? f_26529 : f_26528;
   }

   private static Vec3 m_7870(Vec3 var0, Vec3 var1, Vec3 var2) {
      return var0.add(var1).subtract(var2);
   }

   private static void m_7871(LivingEntity var0) {
      if (f_26556 != var0.getId()) {
         f_26556 = var0.getId();
         f_26555.clear();
         float var1 = var0.getBbWidth() * f_26816 + f_26817;
         float var2 = var0.getBbHeight();
         float[][] var3 = new float[][]{
            {f_26818, f_26819, f_26820},
            {f_26821, f_26822, f_26823},
            {f_26824, f_26825, f_26826},
            {f_26827, f_26828, f_26829},
            {f_26830, f_26831, f_26832},
            {f_26833, f_26834, f_26835},
            {f_26836, f_26837, f_26838},
            {f_26839, f_26840, f_26841},
            {f_26842, f_26843, f_26844},
            {f_26845, f_26846, f_26847},
            {f_26848, f_26849, f_26850},
            {f_26851, f_26852, f_26853},
            {f_26854, f_26855, f_26856},
            {f_26857, f_26858, f_26859},
            {f_26860, f_26861, f_26862},
            {f_26863, f_26864, f_26865},
            {f_26866, f_26867, f_26868},
            {f_26869, f_26870, f_26871},
            {f_26872, f_26873, f_26874},
            {f_26875, f_26876, 1.0F},
            {f_26877, f_26878, f_26879},
            {f_26880, f_26881, f_26882},
            {f_26883, f_26884, f_26885},
            {f_26886, f_26887, f_26888},
            {f_26889, f_26890, f_26891},
            {f_26892, f_26893, f_26894},
            {f_26895, f_26896, f_26897}
         };

         for (float[] var7 : var3) {
            float var8 = (float)Math.toRadians(var7[0]);
            float var9 = var1 * var7[2];
            f_26555.add(new Vector3f(Mth.cos(var8) * var9, Mth.clamp(var7[1] * var2, f_26898, var2 - f_26899), Mth.sin(var8) * var9));
         }
      }
   }

   private static void m_7872(BufferBuilder var0, Identifier var1) {
      m_7830(var0, var1, false, f_26631 ? f_26521 : f_26522);
   }

   private static void m_7873(
      PoseStack var0,
      BufferBuilder var1,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      float var16,
      float var17,
      int var18
   ) {
      Vec3 var19 = m_7837(var8, var10, var12, var14);
      Vec3 var20 = m_7837(var8 + f_27032, var10, var12, var14);
      double var21 = var20.x - var19.x;
      double var23 = var20.y - var19.y;
      double var25 = var20.z - var19.z;
      double var27 = Math.sqrt(var21 * var21 + var23 * var23 + var25 * var25);
      double var29 = var27 > f_27033 ? 1.0 / var27 : 0.0;
      double var31 = var21 * var29;
      double var33 = var23 * var29;
      double var35 = var25 * var29;
      float var37 = (float)Mth.clamp(var27 * f_27034, f_27035, f_27036);
      var0.pushPose();
      var0.translate(
         var2 + var19.x - var31 * (f_27037 + var16 * f_27038),
         var4 + var19.y - var33 * (f_27039 + var16 * f_27040),
         var6 + var19.z - var35 * (f_27041 + var16 * f_27042)
      );
      var0.mulPose(f_11537.gameRenderer.mainCamera().rotation());
      Matrix4f var38 = var0.last().pose();
      float var39 = var16 * (f_27043 + f_27044 * var37);
      m_7855(var1, var38, var39, m_7887(var18, var17 * (f_27045 + f_27046 * var37)));
      m_7855(var1, var38, var16, m_7887(var18, var17));
      var0.popPose();
   }

   private static Matrix4f m_7874(Matrix4f var0, float var1, float var2, float var3, float var4) {
      Matrix4f var5 = new Matrix4f(var0);
      var5.translate(var1, var2, var4);
      var5.rotate(var3, 0.0F, 1.0F, 0.0F);
      var5.translate(-var1, -var2, 0.0F);
      return var5;
   }

   private static List<Vec3> m_7875(Vec3 var0, Vec3 var1, int var2, double var3) {
      int var5 = (1 << var2) + 1;
      Vec3[] var6 = new Vec3[var5];
      var6[0] = var0;
      var6[var5 - 1] = var1;
      m_7862(var6, 0, var5 - 1, var3, f_26557);
      ArrayList var7 = new ArrayList(var5);

      for (Vec3 var11 : var6) {
         var7.add(var11);
      }

      return var7;
   }

   public static void m_7876() {
      if (f_26632 && f_26627 != null) {
         f_26632 = false;
         RenderTarget var0 = f_11537.gameRenderer.mainRenderTarget();
         if (var0 != null && var0.getColorTextureView() != null) {
            Class_rG6KJzJWXQjNHCHC.m_8389(f_26627, var0, f_26633, f_26675, f_26634, 1.0F);
            CommandEncoder var1 = RenderSystem.getDevice().createCommandEncoder();
            RenderPass var2 = var1.createRenderPass(() -> f_27888, var0.getColorTextureView(), Optional.empty());

            try {
               var2.setPipeline(f_26534);
               var2.bindTexture(f_26676, f_26627.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
               var2.draw(3, 1, 0, 0);
            } catch (Throwable var6) {
               if (var2 != null) {
                  try {
                     var2.close();
                  } catch (Throwable var5) {
                     var6.addSuppressed(var5);
                  }
               }

               throw var6;
            }

            if (var2 != null) {
               var2.close();
            }
         }
      }
   }

   private static Vec3 m_7878(Vec3 var0, double var1, double var3, double var5) {
      double var7 = Math.cos(var3) * var1;
      return var0.add(Math.cos(var5) * var7, Math.sin(var3) * var1, Math.sin(var5) * var7);
   }

   private static float m_7879(float var0) {
      if (var0 <= 0.0F || var0 >= 1.0F) {
         return 0.0F;
      } else {
         return var0 < f_26978 ? m_7832(var0 / f_26979) : m_7832(1.0F - (var0 - f_26980) / f_26981);
      }
   }

   private static Class_oV1nLcU0paHSE9Oj.F0nIo1tGX54h6o8A m_7881(long var0) {
      float var2 = f_26557.nextFloat();
      float var3;
      float var4;
      float var5;
      if (var2 < f_27080) {
         float var6 = f_27081 + f_26557.nextFloat() * f_27082;
         float var7 = f_27083 + f_26557.nextFloat() * f_27084;
         var4 = var6 - var7 * f_27085;
         var3 = var6 + var7 * f_27086;
         var5 = f_27087 + f_26557.nextFloat() * f_27088;
      } else if (var2 < f_27089) {
         var4 = f_27090 + f_26557.nextFloat() * f_27091;
         var3 = f_27092 + f_26557.nextFloat() * f_27093;
         var5 = f_27094 + f_26557.nextFloat() * f_27095;
      } else {
         var4 = f_27096 - f_26557.nextFloat() * f_27097;
         var3 = f_27098 + f_26557.nextFloat() * f_27099;
         var5 = f_27100 + f_26557.nextFloat() * f_27101;
      }

      return new Class_oV1nLcU0paHSE9Oj.F0nIo1tGX54h6o8A(
         f_26557.nextDouble() * f_27102 * f_27103,
         f_26557.nextBoolean() ? 1 : -1,
         var5,
         var3,
         var4,
         1.0F,
         f_27104 + f_26557.nextFloat() * f_27105,
         f_27106,
         f_26557.nextInt(4),
         f_26557.nextFloat() * f_27107,
         var0,
         1500 + f_26557.nextInt(500),
         f_26557.nextFloat() * f_27108
      );
   }

   private Class_oV1nLcU0paHSE9Oj() {
   }

   private static void m_7883(Class_TZhU50s8XmBQCMP5 var0, Vec3 var1, LivingEntity var2, int var3, int var4, float var5, long var6) {
      var1 = var1.subtract(f_11537.gameRenderer.mainCamera().position());
      m_7958(var2);
      float var8 = (float)var6 * f_27382 + f_26626;
      float var9 = var2.getBbHeight();
      Vec3 var10 = var1.add(0.0, var9 * f_27383, 0.0);
      Matrix4f var11 = var0.m_5006().last().pose();
      float var12 = var2.getBbWidth() * f_27384 + f_27385;
      float var13 = var12 * f_27386;
      float[] var14 = new float[]{f_27387, f_27388, f_27389};
      float[] var15 = new float[]{f_27390, f_27391, f_27392};
      float[] var16 = new float[]{0.0F, f_27393, f_27394};
      BufferBuilder var17 = m_7952();
      BufferBuilder var18 = m_7952();
      m_7893(var18, var11, var10.x, var10.y, var10.z, var12 * f_27395, m_7887(m_7817(var3, f_27396), var5 * f_27397));
      m_7893(var18, var11, var10.x, var10.y, var10.z, var12 * f_27398, m_7887(m_7817(var3, f_27399), var5 * f_27400));

      for (int var19 = 0; var19 < var14.length; var19++) {
         float var20 = var8 * var15[var19] * f_27401 + var16[var19];
         double var21 = Math.toRadians(var20);
         double var23 = Math.toRadians(var14[var19]);
         Vec3 var25 = new Vec3(Math.sin(var23) * Math.cos(var21), Math.cos(var23), Math.sin(var23) * Math.sin(var21));
         Vec3[] var26 = m_7860(var25);
         int var27 = var19 == var14.length - 1 ? m_7817(var4, f_27402) : m_7817(var3, f_27403);
         m_7955(var17, var11, var10, var26[0], var26[1], var13, m_7887(var27, var5 * f_27404));
         double var28 = Math.toRadians(var20 * (var15[var19] < 0.0F ? f_27405 : f_27406) + var16[var19]);
         Vec3 var30 = var10.add(var26[0].scale(Math.cos(var28) * var12)).add(var26[1].scale(Math.sin(var28) * var12));
         m_7893(var18, var11, var30.x, var30.y, var30.z, f_27407, m_7887(m_7817(var3, f_27408), var5));
         m_7893(var18, var11, var30.x, var30.y, var30.z, f_27409, m_7887(m_7817(var3, f_27410), var5 * f_27411));
      }

      m_7825(var17, f_26530);
      m_7942(var18, f_26515, true);
   }

   private static void m_7884(Class_TZhU50s8XmBQCMP5 var0, Vec3 var1, LivingEntity var2, int var3, int var4, float var5, float var6) {
      float var7 = var5 * f_27572;
      if (!(var7 <= f_27573)) {
         Vec3 var8 = f_11537.gameRenderer.mainCamera().position();
         float var9 = var2.getBbHeight();
         long var10 = Math.max(1L, Math.round(f_27574 / f_26570));
         double var12 = (double)(System.currentTimeMillis() % var10) / var10 * f_27575 * f_27576;
         float var14 = 0.0F;
         if (f_26596 && var2.hurtTime > 0) {
            var14 = Mth.clamp((var2.hurtTime - var6) / f_27577, 0.0F, 1.0F);
         }

         float var15 = var2.getBbWidth() * f_27578;
         float var16 = var2.getBbWidth() + var15 - var15 * var7;
         float var17 = (float)(var1.x - var8.x);
         float var18 = (float)(var1.y - var8.y);
         float var19 = (float)(var1.z - var8.z);
         float var20 = var18 + var9 * (float)(f_27579 + f_27580 * Math.cos(var12));
         float var21 = (float)(Math.sin(var12) * var9 * f_27581);
         Matrix4f var22 = var0.m_5006().last().pose();
         BufferBuilder var23 = m_7952();
         byte var24 = 2;
         float var25 = f_27582;
         float var26 = f_27583;

         for (int var27 = 0; var27 < var24; var27++) {
            float var28 = var20 + var25 / var24 * var27;
            float var29 = var7 * (1.0F - (float)var27 / var24 * f_27584);
            int var30 = var27 * 10;

            for (int var31 = 0; var31 < 360; var31 += 5) {
               int var32 = var31 / 5;
               int var33 = m_7846(var3, var4, var31 * 5 + var30, var14, f_27585);
               Vector4f var34 = Class_BftdentXEtGbugJw.m_2298(m_7887(var33, var29));
               float var35 = var17 + (float)(f_26573[var32] * var16);
               float var36 = var19 + (float)(f_26574[var32] * var16);
               float var37 = var17 + (float)(f_26573[var32 + 1] * var16);
               float var38 = var19 + (float)(f_26574[var32 + 1] * var16);
               float var39 = var37 - var35;
               float var40 = var38 - var36;
               float var41 = Mth.sqrt(var39 * var39 + var40 * var40);
               float var42 = var41 == 0.0F ? var26 : -var40 / var41 * var26;
               float var43 = var41 == 0.0F ? 0.0F : var39 / var41 * var26;
               m_7931(var23, var22, var35 + var42, var28, var36 + var43, 0.0F, 0.0F, var34);
               m_7931(var23, var22, var37 + var42, var28, var38 + var43, 0.0F, 1.0F, var34);
               m_7931(var23, var22, var37 - var42, var28, var38 - var43, 1.0F, 1.0F, var34);
               m_7931(var23, var22, var35 - var42, var28, var36 - var43, 1.0F, 0.0F, var34);
            }
         }

         for (int var44 = 0; var44 < 360; var44 += 5) {
            int var45 = var44 / 5;
            int var46 = m_7846(var3, var4, var44 * 20, var14, f_27586);
            int var47 = m_7846(var3, var4, (var44 + 5) * 20, var14, f_27587);
            Vector4f var48 = Class_BftdentXEtGbugJw.m_2298(m_7887(var46, var7));
            Vector4f var49 = Class_BftdentXEtGbugJw.m_2298(m_7887(var46, 0.0F));
            Vector4f var50 = Class_BftdentXEtGbugJw.m_2298(m_7887(var47, var7));
            Vector4f var51 = Class_BftdentXEtGbugJw.m_2298(m_7887(var47, 0.0F));
            float var52 = var17 + (float)(f_26573[var45] * var16);
            float var53 = var19 + (float)(f_26574[var45] * var16);
            float var54 = var17 + (float)(f_26573[var45 + 1] * var16);
            float var55 = var19 + (float)(f_26574[var45 + 1] * var16);
            float var56 = var20 + var21;
            m_7931(var23, var22, var52, var20, var53, 0.0F, 0.0F, var48);
            m_7931(var23, var22, var52, var56, var53, 0.0F, 1.0F, var49);
            m_7931(var23, var22, var54, var56, var55, 1.0F, 1.0F, var51);
            m_7931(var23, var22, var54, var20, var55, 1.0F, 0.0F, var50);
         }

         m_7825(var23, f_26532);
      }
   }

   private static void m_7885(Class_TZhU50s8XmBQCMP5 var0, Vec3 var1, LivingEntity var2, int var3, int var4, float var5) {
      if (var5 <= f_27673) {
         m_7892();
      } else {
         var1 = var1.subtract(f_11537.gameRenderer.mainCamera().position());
         long var6 = System.currentTimeMillis();
         PoseStack var8 = var0.m_5006();
         BufferBuilder var9 = m_7952();

         for (int var10 = 0; var10 < f_26561.length; var10++) {
            double var11 = var6 * f_27674;
            double var13 = var10 * (f_27675 / f_26561.length);
            double var15 = var2.getBbWidth() + f_27676;
            double var17 = Math.sin(var11 + var13) * var15;
            double var19 = Math.cos(var11 + var13) * var15;
            double var21 = var10 % 2 == 0 ? 1.0 : f_27677;
            double var23 = Math.sin((var11 + var13) * f_27678) * var21;
            double var25 = var23 * (var2.getBbHeight() * f_27679) + var2.getBbHeight() * f_27680;
            LinkedList var27 = f_26561[var10];
            Vec3 var28 = new Vec3(var17, var25, var19);
            if (!var27.isEmpty()) {
               Vec3 var29 = (Vec3)var27.getFirst();
               double var30 = var29.distanceTo(var28);
               int var32 = Mth.clamp((int)Math.ceil(var30 / f_27681), 1, 6);

               for (int var33 = 1; var33 <= var32; var33++) {
                  double var34 = (double)var33 / var32;
                  var27.addFirst(var29.lerp(var28, var34));
               }
            } else {
               var27.addFirst(var28);
            }

            while (var27.size() > 34) {
               var27.removeLast();
            }

            int var42 = 0;
            int var43 = var27.size();

            for (Object var44_obj : var27) {
               Vec3 var44 = (Vec3)var44_obj;
               float var45 = 1.0F - (float)var42 / var43;
               float var46 = (float)(var1.x + var44.x);
               float var35 = (float)(var1.y + var44.y);
               float var36 = (float)(var1.z + var44.z);
               int var37 = Class_BftdentXEtGbugJw.m_2302(var3, var4, var45);
               float var38 = var42 == 0 ? f_27682 : f_27683;
               float var39 = var38 * var45 * var5;
               float var40 = (float)(Math.pow(var45, f_27684) * var5);
               m_7954(var9, var8, var46, var35, var36, var39, m_7887(var37, var40));
               if (var42 == 0) {
                  m_7954(var9, var8, var46, var35, var36, f_27685 * var5, m_7887(-1, var5));
               }

               var42++;
            }
         }

         m_7942(var9, f_26516, false);
      }
   }

   private static float m_7886(float var0, float var1, float var2) {
      if (var0 < var1) {
         return Math.min(var0 + var2, var1);
      } else {
         return var0 > var1 ? Math.max(var0 - var2, var1) : var0;
      }
   }

   private static int m_7887(int var0, float var1) {
      return Class_BftdentXEtGbugJw.m_2303(
         Class_BftdentXEtGbugJw.m_2309(var0),
         Class_BftdentXEtGbugJw.m_2299(var0),
         Class_BftdentXEtGbugJw.m_2308(var0),
         Class_BftdentXEtGbugJw.m_2297(var0) * Mth.clamp(var1, 0.0F, 1.0F)
      );
   }

   private static void m_7888(Class_TZhU50s8XmBQCMP5 var0, Vec3 var1, LivingEntity var2, int var3, float var4, long var5) {
      Vec3 var7 = f_11537.gameRenderer.mainCamera().position();
      Vec3 var8 = var2.position().add(0.0, var2.getBbHeight() / f_27734, 0.0);
      float var9 = var2.getBbWidth() * f_27735;
      float var10 = var2.getBbHeight();
      float var11 = f_27736 - f_27737 * var4;
      float var12 = (float)(var5 % f_27738) / f_27739 + var4;
      PoseStack var13 = var0.m_5006();
      BufferBuilder var14 = m_7842();

      for (int var15 = 0; var15 < 360; var15 += 20) {
         double var16 = Math.toRadians(var15 + var12 * f_27740);
         float var18 = (float)Math.sin(var16) * var9 * var11;
         float var19 = (float)Math.cos(var16) * var9 * var11;
         float var20 = f_27741 + var10 * Math.abs((float)Math.sin(var15));
         Vec3 var21 = var1.add(var18, var20, var19);
         var13.pushPose();
         var13.translate(var21.x - var7.x, var21.y - var7.y, var21.z - var7.z);
         Vector3f var22 = new Vector3f((float)(var8.x - var21.x), (float)(var8.y - var21.y), (float)(var8.z - var21.z)).normalize();
         var13.mulPose(new Quaternionf().rotationTo(new Vector3f(0.0F, 1.0F, 0.0F), var22));
         m_7946(var14, var13, f_27742, m_7887(var3, var4));
         var13.popPose();
      }

      m_7825(var14, m_7829());
      BufferBuilder var23 = m_7952();

      for (int var24 = 0; var24 < 360; var24 += 20) {
         double var17 = Math.toRadians(var24 + var12 * f_27743);
         float var25 = (float)Math.sin(var17) * var9 * var11;
         float var26 = (float)Math.cos(var17) * var9 * var11;
         float var27 = f_27744 + var10 * Math.abs((float)Math.sin(var24));
         Vec3 var28 = var1.add(var25, var27, var26);
         m_7954(var23, var13, var28.x - var7.x, var28.y - var7.y, var28.z - var7.z, f_27745 * var4, m_7887(var3, var4 * f_27746));
         m_7954(var23, var13, var28.x - var7.x, var28.y - var7.y, var28.z - var7.z, f_27747 * var4, m_7887(var3, var4 * f_27748));
      }

      m_7830(var23, f_26517, false, m_7869());
   }

   public static void m_7889(boolean var0, float var1, int var2) {
      f_26657 = var0;
      f_26655 = var1;
      f_26656 = var2;
   }

   private static float m_7891(int var0) {
      float var1 = (float)Math.sin(var0 * f_27470) * f_27471;
      return var1 - (float)Math.floor(var1);
   }

   private static void m_7892() {
      for (LinkedList var3 : f_26561) {
         var3.clear();
      }
   }

   private static void m_7893(BufferBuilder var0, Matrix4f var1, double var2, double var4, double var6, float var8, int var9) {
      PoseStack var10 = new PoseStack();
      var10.mulPose(var1);
      var10.translate(var2, var4, var6);
      var10.mulPose(f_11537.gameRenderer.mainCamera().rotation());
      m_7855(var0, var10.last().pose(), var8, var9);
   }

   private static Vec3 m_7894(Vec3 var0, double var1, double var3, double var5) {
      double var7 = Math.sin(var1);
      double var9 = Math.cos(var1);
      double var11 = var0.y * var9 - var0.z * var7;
      double var13 = var0.y * var7 + var0.z * var9;
      var0 = new Vec3(var0.x, var11, var13);
      double var15 = Math.sin(var3);
      double var17 = Math.cos(var3);
      double var19 = var0.x * var17 - var0.z * var15;
      var13 = var0.x * var15 + var0.z * var17;
      var0 = new Vec3(var19, var0.y, var13);
      double var21 = Math.sin(var5);
      double var23 = Math.cos(var5);
      var19 = var0.x * var23 - var0.y * var21;
      var11 = var0.x * var21 + var0.y * var23;
      return new Vec3(var19, var11, var0.z);
   }

   private static void m_7895(Class_TZhU50s8XmBQCMP5 var0, Vec3 var1, LivingEntity var2, int var3, float var4, float var5, long var6) {
      float var8 = (float)Math.sin(var2.hurtTime * f_27686 / f_27687);
      f_26600 = f_26600 + (var8 - f_26600) * (float)Math.sin(Math.min(var5 / f_27688, 1.0F) * f_27689 / f_27690);
      int var9 = (int)((var6 / f_27691 + 1L) % f_27692);
      var9 = var9 >= 180 ? 360 - var9 : var9;
      int var10 = Class_BftdentXEtGbugJw.m_2303(
         Math.min(255, Math.round(Class_BftdentXEtGbugJw.m_2309(var3) / f_27693)),
         Math.min(255, Math.round(Class_BftdentXEtGbugJw.m_2299(var3) / f_27694)),
         Math.min(255, Math.round(Class_BftdentXEtGbugJw.m_2308(var3) / f_27695)),
         f_27696
      );
      int var11 = Class_BftdentXEtGbugJw.m_2302(var3, var10, var9 / f_27697);
      if (f_26596) {
         var11 = Class_BftdentXEtGbugJw.m_2302(var11, f_27698, f_26600);
      }

      var11 &= f_27699;
      float var12 = (float)Math.cos(var6 / f_27700) * f_27701 + f_26600 * f_27702;
      float var13 = (1.0F - f_27703 * f_26600) * var4;
      Camera var14 = f_11537.gameRenderer.mainCamera();
      Vec3 var15 = var14.position();
      PoseStack var16 = var0.m_5006();

      for (int var17 = 0; var17 < 3; var17++) {
         BufferBuilder var18 = Class_uYlA2bjVcAq54Bqy.m_9213(var17 == 2, var17 == 0);

         for (int var19 = 0; var19 < 360; var19 += 12) {
            float var20 = (float)Math.toRadians(var19 + var12);
            float var21 = (float)(Math.sin(var20) * var2.getBbWidth() * f_27704 * f_27705);
            float var22 = (float)(Math.cos(var20) * var2.getBbWidth() * f_27706 * f_27707);
            double var23 = var2.getBbHeight() * Math.abs(Math.sin(((int)(var19 * f_27708) & f_27709) * f_27710 * f_27711 / f_27712));
            var16.pushPose();
            var16.translate(var1.x + var21 - var15.x, var1.y + var23 - var15.y, var1.z + var22 - var15.z);
            if (var17 == 0) {
               var16.mulPose(var14.rotation());
               Class_uYlA2bjVcAq54Bqy.m_9215(var18, var16.last().pose(), f_27713 * var13, var11 | (int)(var4 * f_27714 * f_27715) << 24);
            } else {
               var16.mulPose(new Quaternionf().rotationTo(new Vector3f(0.0F, 1.0F, 0.0F), new Vector3f(-var21, (float)(-var23), -var22).normalize()));
               if (var17 == 1) {
                  Class_uYlA2bjVcAq54Bqy.m_9217(var18, var16.last().pose(), f_27716 * var13, var11 | (int)(var4 * f_27717 * f_27718) << 24);
               } else {
                  Class_uYlA2bjVcAq54Bqy.m_9211(var18, var16.last().pose(), f_27719 * var13, var11 | (int)(var4 * f_27720) << 24);
               }
            }

            var16.popPose();
         }

         Class_uYlA2bjVcAq54Bqy.m_9218(var18, var17 == 2, var17 == 0 ? Class_uYlA2bjVcAq54Bqy.f_33138 : null, !f_26602);
      }
   }

   private static void m_7896(double var0, double var2, double var4, double var6, double var8, double var10, double var12, float var14, float var15) {
      Vec3 var16 = m_7837(var6, var8, var10, var12);
      f_26609.addLast(
         new Class_oV1nLcU0paHSE9Oj.BNt5vHvMwoeyBNKB(new Vec3(var0 + var16.x, var2 + var16.y, var4 + var16.z), System.currentTimeMillis(), var14, var15)
      );

      while (f_26609.size() > 130) {
         f_26609.pollFirst();
      }
   }

   private static void m_7897(Class_TZhU50s8XmBQCMP5 var0, Vec3 var1, int var2, float var3) {
      var1 = var1.subtract(f_11537.gameRenderer.mainCamera().position());
      BufferBuilder var4 = m_7952();
      PoseStack var5 = var0.m_5006();
      float var6 = f_26545 * f_27590;
      float var7 = m_7832(f_26544);

      for (int var8 = 0; var8 < 9; var8 += 3) {
         for (int var9 = 0; var9 < 12; var9++) {
            float var10 = var6 + var9 * f_27591;
            int var11 = var8 * var8;
            double var12 = var1.x + f_27592 * Mth.sin(var10 + var11);
            double var14 = var1.y + f_27593 + f_27594 * Mth.sin(var6 + var9 * f_27595) + f_27596 * var8;
            double var16 = var1.z + f_27597 * Mth.cos(var10 - var11);
            float var18 = f_27598 * var7 * (f_27599 + var9 / f_27600);
            var5.pushPose();
            var5.translate(var12, var14, var16);
            var5.mulPose(f_11537.gameRenderer.mainCamera().rotation());
            m_7855(var4, var5.last().pose(), var18, m_7887(var2, var3));
            var5.popPose();
         }
      }

      m_7942(var4, f_26513, true);
   }

   private static int m_7898(int var0, float var1) {
      return Class_BftdentXEtGbugJw.m_2303(
         Math.min(255, Math.round(Class_BftdentXEtGbugJw.m_2309(var0) * var1)),
         Math.min(255, Math.round(Class_BftdentXEtGbugJw.m_2299(var0) * var1)),
         Math.min(255, Math.round(Class_BftdentXEtGbugJw.m_2308(var0) * var1)),
         Class_BftdentXEtGbugJw.m_2297(var0)
      );
   }

   private static void m_7899(BufferBuilder var0, Matrix4f var1, Vec3 var2, Vec3 var3, Vec3 var4, float var5, int var6) {
      m_7955(var0, var1, var2, var3, var4, var5 * 2.0F / f_27535, var6);
   }

   private static float m_7900(int var0, float var1, float var2) {
      return switch (var0 & 3) {
         case 0 -> var1 + var2;
         case 1 -> -var1 + var2;
         case 2 -> var1 - var2;
         default -> -var1 - var2;
      };
   }

   public static void m_7901() {
      Class_vjVj7yuYZq5AqDPM.m_9270();
      f_26644 = true;
      f_26645 = null;
      f_26646 = null;
      f_26647 = null;
      f_26650 = RenderSystem.getProjectionMatrixBuffer();
      f_26651 = RenderSystem.getProjectionType();
   }

   private static Vec3 m_7903(Vec3 var0, double var1, double var3, float var5, float var6, int var7, float var8) {
      double var9 = var5 + var7 * var6 * f_27231 * f_27232 * var8 + (f_26557.nextDouble() - f_27233) * f_27234;
      double var11 = var3 * (f_27235 + f_26557.nextDouble() * f_27236);
      double var13 = var1 * (f_27237 + var8 * f_27238) + (f_26557.nextDouble() - f_27239) * var1 * f_27240;
      return var0.add(Math.cos(var9) * var11, var13, Math.sin(var9) * var11);
   }

   private static void m_7904(
      BufferBuilder var0,
      Matrix4f var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      int var11,
      int var12,
      int var13
   ) {
      Vector4f var14 = Class_BftdentXEtGbugJw.m_2298(var11);
      Vector4f var15 = Class_BftdentXEtGbugJw.m_2298(var12);
      Vector4f var16 = Class_BftdentXEtGbugJw.m_2298(var13);
      m_7931(var0, var1, var2, var3, var4, f_27858, f_27859, var14);
      m_7931(var0, var1, var8, var9, var10, f_27860, f_27861, var16);
      m_7931(var0, var1, var5, var6, var7, f_27862, f_27863, var15);
      m_7931(var0, var1, var5, var6, var7, f_27864, f_27865, var15);
   }

   public static void m_7905(boolean var0, float var1) {
      f_26628 = var0;
      f_26629 = var1;
   }

   private static float m_7906(float var0) {
      float var1 = Mth.clamp(var0, 0.0F, 1.0F) - 1.0F;
      return 1.0F + f_27054 * var1 * var1 * var1 + f_27055 * var1 * var1;
   }

   private static void m_7907(Class_TZhU50s8XmBQCMP5 var0, Vec3 var1, LivingEntity var2, int var3, float var4, long var5, boolean var7) {
      double var8 = System.nanoTime() * f_27189;
      float var10 = (float)(var8 * f_27190);
      if (var7 && var5 - f_26624 >= f_27191 && f_26623.size() < 18) {
         for (int var11 = 0; var11 < 2 && f_26623.size() < 18; var11++) {
            f_26623.add(m_7856(var2, var1, var5, var10));
         }

         f_26624 = var5;
      }

      f_26623.removeIf(var2x -> var5 - var2x.f_26493 > var2x.f_26495);
      if (!f_26623.isEmpty() && !(var4 <= f_27192)) {
         Vec3 var35 = f_11537.gameRenderer.mainCamera().position();
         Matrix4f var12 = var0.m_5006().last().pose();
         PoseStack var13 = var0.m_5006();
         int var14 = m_7817(var3, f_27193);
         int var15 = m_7817(var3, f_27194);
         BufferBuilder var16 = m_7952();
         BufferBuilder var17 = m_7952();

         for (Class_oV1nLcU0paHSE9Oj.SjzMjyMYX7ylg4dN var19 : f_26623) {
            float var20 = (float)(var5 - var19.f_26493) / (float)var19.f_26495;
            if (!(var20 < 0.0F) && !(var20 > 1.0F)) {
               float var21 = (float)Math.sin(f_27195 * Mth.clamp(var20, 0.0F, 1.0F));
               var21 = m_7832(var21);
               float var22 = var4 * var21;
               if (!(var22 <= f_27196)) {
                  double var23 = (System.nanoTime() - var19.f_26494) * f_27197;
                  float var25 = (float)(var23 * var19.f_26499 * var19.f_26498);
                  float var26 = (float)Math.cos(var25);
                  float var27 = (float)Math.sin(var25);
                  ArrayList var28 = new ArrayList(var19.f_26492.size());

                  for (Vec3 var30 : var19.f_26492) {
                     double var31 = var30.x * var26 - var30.z * var27;
                     double var33 = var30.x * var27 + var30.z * var26;
                     var28.add(var1.add(var31, var30.y, var33).subtract(var35));
                  }

                  if (var28.size() >= 2) {
                     for (int var37 = 0; var37 < var28.size(); var37++) {
                        Vec3 var38 = (Vec3)var28.get(var37);
                        float var39 = 1.0F - (float)var37 / Math.max(1, var28.size() - 1) * f_27198;
                        m_7954(var16, var13, var38.x, var38.y, var38.z, f_27199 * var39 * var19.f_26497, m_7887(var3, var22 * f_27200));
                        m_7954(var16, var13, var38.x, var38.y, var38.z, f_27201 * var39 * var19.f_26497, m_7887(var14, var22 * f_27202));
                        m_7954(var16, var13, var38.x, var38.y, var38.z, f_27203 * var39 * var19.f_26497, m_7887(var15, var22 * f_27204));
                     }

                     m_7866(var17, var12, var28, f_27205 * var19.f_26497, m_7887(var3, var22 * f_27206));
                     m_7866(var17, var12, var28, f_27207 * var19.f_26497, m_7887(var14, var22 * f_27208));
                     m_7866(var17, var12, var28, f_27209 * var19.f_26497, m_7887(var15, var22));
                     m_7866(var17, var12, var28, f_27210 * var19.f_26497, m_7887(-1, var22));
                  }
               }
            }
         }

         m_7830(var16, f_26515, false, f_26535);
         m_7830(var17, f_26518, false, f_26535);
      }
   }

   private static double[] m_7908(boolean var0) {
      double[] var1 = new double[73];

      for (int var2 = 0; var2 <= 72; var2++) {
         double var3 = Math.toRadians(var2 * f_27589);
         var1[var2] = var0 ? Math.cos(var3) : Math.sin(var3);
      }

      return var1;
   }

   private static int m_7909(int var0, int var1, int var2, boolean var3) {
      int var4 = (int)((System.currentTimeMillis() / f_27872 + var2) % f_27873);
      if (var4 >= 180) {
         var4 = 360 - var4;
      }

      int var5 = Class_BftdentXEtGbugJw.m_2302(var0, var1, var4 / f_27874);
      return var3 ? m_7817(var5, f_27875) : var5;
   }

   private static void m_7910() {
      f_26590 = 1.0F;
      f_26591 = 0.0F;
      f_26592 = 0.0;
      f_26593 = false;
      f_26594 = f_26977;
   }

   private static void m_7911(BufferBuilder var0, BufferBuilder var1, RenderPipeline var2) {
      m_7913(var0, var1, var2, -1);
   }

   private static void m_7912(Class_TZhU50s8XmBQCMP5 var0, Vec3 var1, LivingEntity var2, int var3, float var4) {
      var1 = var1.subtract(f_11537.gameRenderer.mainCamera().position());
      float var5 = var2.getBbWidth() * f_26947;
      float var6 = (float)(System.currentTimeMillis() % f_26948) / f_26949;
      int var7 = Mth.clamp(f_26595, 2, 4);
      float var8 = f_26950 / var7;
      float var9 = f_26951;
      float var10 = var8 - var9;
      byte var11 = 0;
      int var12 = 0;
      int var13 = 0;
      Matrix4f var14 = var0.m_5006().last().pose();
      BufferBuilder var15 = m_7952();

      for (int var16 = 0; var16 < 360; var16 += 2) {
         if (var12 > 0) {
            var12 -= 2;
            if (var12 <= 0) {
               var13++;
            }
         } else {
            float var17 = f_26952 + f_26953 * var11;
            float var18 = f_26954 + f_26955 * var11;
            var11 += 2;
            if (var11 > var9) {
               var12 = (int)var10;
               var11 = 0;
            } else {
               float var19 = Math.max(f_26956, f_26957 - f_26958 * var4);
               float var20 = (float)Math.toRadians(var16 + var6);
               float var21 = (float)(var1.x + Math.sin(var20) * var5 * var19);
               float var22 = (float)(var1.z + Math.cos(var20) * var5 * var19);
               float var23 = (var13 % 2 == 0 ? f_26959 : f_26960) * var2.getBbHeight();
               float var24 = (float)Math.sin(Math.toRadians(var16 / 2.0F + var6 / f_26961));
               float var25 = (float)(var1.y + var2.getBbHeight() * f_26962 + var2.getBbHeight() / f_26963 * var24 + var23);
               m_7893(var15, var14, var21, var25, var22, var18, m_7887(var3, var4 * f_26964));
               m_7893(var15, var14, var21, var25, var22, var17, m_7887(var3, var4));
            }
         }
      }

      m_7942(var15, f_26518, true);
   }

   private static void m_7913(BufferBuilder var0, BufferBuilder var1, RenderPipeline var2, int var3) {
      RenderTarget var4 = f_11537.gameRenderer.mainRenderTarget();
      if (var4 != null && var4.getColorTextureView() != null && var4.getDepthTextureView() != null) {
         TextureTarget var5 = m_7824(var4.width, var4.height);
         var5.copyDepthFrom(var4);
         m_7929(var1, var2, var5, true);
         Class_rG6KJzJWXQjNHCHC.m_8389(var5, var4, var3, f_27375, f_27376, 1.0F);
         m_7825(var0, var2);
         CommandEncoder var6 = RenderSystem.getDevice().createCommandEncoder();
         RenderPass var7 = var6.createRenderPass(() -> f_27887, var4.getColorTextureView(), Optional.empty());

         try {
            var7.setPipeline(f_26538);
            var7.bindTexture(f_27377, var5.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
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

   public static void m_7914(Class_TZhU50s8XmBQCMP5 var0, LivingEntity var1, String var2, int var3, int var4) {
      if (f_26644 && f_26605 && (var2.equals(f_26677) || var2.equals(f_26678) || var2.equals(f_26679)) && (var1 != null && var1.isAlive() || m_7807())) {
         Class_vjVj7yuYZq5AqDPM.m_9277();
      }

      if (f_26644 && m_7841(var2)) {
         f_26645 = var0;
         f_26646 = var1;
         f_26647 = var2;
         f_26648 = var3;
         f_26649 = var4;
      } else {
         long var5 = System.currentTimeMillis();
         float var7 = f_26546 == 0L ? 0.0F : Math.min(f_26680, (float)(var5 - f_26546) / f_26681);
         f_26546 = var5;
         boolean var8 = var1 != null && var1.isAlive();
         if (var8) {
            f_26568 = var3;
            f_26569 = var4;
         }

         boolean var9 = var2.equals(f_26682) && f_26571.equals(f_26683);
         float var10 = var9 ? 1.0F : (!var8 && var2.equals(f_26684) ? f_26685 : f_26686);
         f_26544 = m_7886(f_26544, var8 ? 1.0F : 0.0F, var7 / var10);
         if (var8) {
            f_26543 = var1;
         }

         if (!f_26547.equals(var2)) {
            if (f_26687.equals(f_26547) && f_26688.equals(f_26608)) {
               Class_8j6qxz5hlVm3X7m2.m_1844();
            }

            f_26545 = 0.0F;
            f_26555.clear();
            f_26556 = f_26689;
            f_26548.clear();
            f_26552 = f_26690;
            f_26558.clear();
            f_26559 = 0L;
            f_26617.clear();
            f_26618 = 0L;
            f_26623.clear();
            f_26624 = 0L;
            m_7892();
            f_26562.clear();
            f_26563 = 0.0;
            f_26625 = f_26691;
            f_26632 = false;
            f_26635 = 0.0F;
            f_26636 = false;
            f_26637 = false;
            f_26638 = 0.0;
            f_26639 = 0.0;
            f_26640 = 0.0;
            f_26641 = 0.0;
            f_26642 = 0.0;
            f_26643 = 0.0;
            f_26606 = "";
            f_26607 = "";
            f_26608 = "";
            f_26609.clear();
            f_26610 = 0L;
            f_26611 = f_26692;
            m_7910();
            f_26547 = var2;
         }

         boolean var11 = var2.equals(f_26693) && f_26601.equals(f_26694);
         float var12 = f_26598 == 0L ? 0.0F : (float)(var5 - f_26598) / f_26695;
         if (var11) {
            f_26599 = f_26599 + ((var8 ? 1.0F : 0.0F) - f_26599) * (float)Math.sin(Math.min(var12 / f_26696, 1.0F) * f_26697 / f_26698);
            f_26544 = f_26599;
            f_26598 = var5;
         } else {
            f_26598 = 0L;
            f_26599 = 0.0F;
            f_26600 = 0.0F;
         }

         if (f_26543 != null && !(f_26544 <= (var11 ? f_26699 : f_26700))) {
            f_26545 += var7;
            float var13 = var0.m_5005().getGameTimeDeltaPartialTick(true);
            Vec3 var14 = new Vec3(
               Mth.lerp(var13, f_26543.xo, f_26543.getX()), Mth.lerp(var13, f_26543.yo, f_26543.getY()), Mth.lerp(var13, f_26543.zo, f_26543.getZ())
            );
            float var15 = f_26543.hurtDuration <= 0 ? 0.0F : Mth.clamp((float)f_26543.hurtTime / f_26543.hurtDuration, 0.0F, 1.0F);
            int var16 = f_26596 ? Class_BftdentXEtGbugJw.m_2302(var3, f_26701, var15) : var3;
            int var17 = f_26596 ? Class_BftdentXEtGbugJw.m_2302(var4, f_26702, var15) : var4;
            float var18 = var11 ? f_26544 : m_7832(f_26544);
            Class_vjVj7yuYZq5AqDPM.m_9272(f_26605 && (var2.equals(f_26703) || var2.equals(f_26704) || var2.equals(f_26705)), var0.m_5006().last().pose());

            try {
               switch (var2) {
                  case f_26706:
                     if (f_26716.equals(f_26571)) {
                        float var29 = var8 ? m_7937(f_26544) : 1.0F - (1.0F - f_26544) * (1.0F - f_26544);
                        m_7814(var0, var14, f_26543, m_7826(f_26543, var3, var7, var5), var29);
                     } else if (f_26717.equals(f_26571)) {
                        m_7884(var0, var14, f_26543, var3, var4, var18, var13);
                     } else {
                        m_7843(var0, var14, f_26543, var16, var18);
                     }
                     break;
                  case f_26707:
                     m_7917(var0, var14, f_26543, var16, var18);
                     break;
                  case f_26708:
                     if (!f_26606.equals(f_26597)) {
                        m_7892();
                        f_26562.clear();
                        f_26563 = 0.0;
                        f_26609.clear();
                        f_26610 = 0L;
                        f_26611 = f_26718;
                        m_7910();
                        f_26606 = f_26597;
                     }

                     switch (f_26597) {
                        case f_26719:
                           m_7836(var0, var14, f_26543, var16, var17, var18);
                           return;
                        case f_26720:
                           m_7885(var0, var14, f_26543, var16, var17, var18);
                           return;
                        case f_26721:
                           m_7864(var0, var14, f_26543, var16, var17, var8);
                           return;
                        case f_26722:
                           m_7853(var0, var14, f_26543, var16, var17, f_26544, var13);
                           return;
                        case f_26723:
                           m_7912(var0, var14, f_26543, var16, var18);
                           return;
                        case f_26724:
                           m_7816(var0, var14, f_26543, var16, var18);
                           return;
                        case f_26725:
                           m_7847(var0, var14, f_26543, var16, var18, var7, var8);
                           return;
                        default:
                           m_7897(var0, var14, var16, var18);
                           return;
                     }
                  case f_26709:
                     if (!f_26607.equals(f_26601)) {
                        f_26555.clear();
                        f_26556 = f_26726;
                        f_26548.clear();
                        f_26552 = f_26727;
                        f_26607 = f_26601;
                     }

                     switch (f_26601) {
                        case f_26728:
                           m_7935(var0, var14, f_26543, var16, var18, var5);
                           return;
                        case f_26729:
                           m_7888(var0, var14, f_26543, var16, var18, var5);
                           return;
                        case f_26730:
                           m_7895(var0, var14, f_26543, var3, var18, var12, var5);
                           return;
                        default:
                           m_7811(var0, var14, f_26543, var16, var4, var18, var5);
                           return;
                     }
                  case f_26710:
                     m_7849(var0, var14, f_26543, var16, var4, var18, var5);
                     break;
                  case f_26711:
                     try {
                        if (!f_26608.equals(f_26603)) {
                           if (f_26731.equals(f_26608)) {
                              Class_8j6qxz5hlVm3X7m2.m_1844();
                           }

                           f_26558.clear();
                           f_26617.clear();
                           f_26623.clear();
                           f_26559 = 0L;
                           f_26618 = 0L;
                           f_26624 = 0L;
                           f_26608 = f_26603;
                        }

                        if (f_26732.equals(f_26603)) {
                           m_7916(var0, var14, f_26543, var16, var18, var5, var8, var15);
                        } else if (f_26733.equals(f_26603)) {
                           Class_8j6qxz5hlVm3X7m2.m_1853(f_11537.gameRenderer.mainCamera(), var13, f_26543, var18, var3, f_26596, f_26604 ? f_26734 : f_26735);
                        } else {
                           m_7907(var0, var14, f_26543, var16, var18, var5, var8);
                        }
                     } catch (Throwable var26) {
                        var26.printStackTrace();
                        f_26558.clear();
                        f_26617.clear();
                        f_26623.clear();
                        f_26559 = 0L;
                        f_26618 = 0L;
                        f_26624 = 0L;
                     }
                     break;
                  case f_26712:
                     m_7959(var0, var14, f_26543, var16, f_26544, var7, var8, var15);
                     break;
                  case f_26713:
                     m_7915(var0, var14, f_26543, var16, var18);
                     break;
                  case f_26714:
                     m_7943(var0, var14, f_26543, var16, var18, var5);
                     break;
                  case f_26715:
                     m_7808(var0, var14, f_26543, var16, var18, var15);
               }
            } finally {
               Class_vjVj7yuYZq5AqDPM.m_9274(var0.m_5009());
            }
         } else {
            if (!var8) {
               f_26543 = null;
            }

            m_7892();
            f_26562.clear();
            f_26609.clear();
         }
      }
   }

   private static void m_7915(Class_TZhU50s8XmBQCMP5 var0, Vec3 var1, LivingEntity var2, int var3, float var4) {
      var1 = var1.subtract(f_11537.gameRenderer.mainCamera().position());
      boolean var5 = f_27414.equals(f_26572);
      float var6 = var2.hurtDuration <= 0 ? 0.0F : Mth.clamp((float)var2.hurtTime / var2.hurtDuration, 0.0F, 1.0F);
      float var7 = Mth.lerpInt(f_26544, 2, 1) * (var5 ? f_27415 : f_27416);
      float var8 = (float)Math.sin(f_26545 * f_27417) * f_27418;
      int var9 = var3;
      if (var5) {
         int var10 = Mth.clamp((int)(Class_BftdentXEtGbugJw.m_2309(var3) * (1.0F - var6) + f_27419 * var6), 0, 255);
         int var11 = Mth.clamp((int)(Class_BftdentXEtGbugJw.m_2299(var3) * (1.0F - var6)), 0, 255);
         int var12 = Mth.clamp((int)(Class_BftdentXEtGbugJw.m_2308(var3) * (1.0F - var6)), 0, 255);
         var9 = Class_BftdentXEtGbugJw.m_2303(var10, var11, var12, Class_BftdentXEtGbugJw.m_2297(var3));
      }

      BufferBuilder var14 = m_7952();
      PoseStack var15 = var0.m_5006();
      var15.pushPose();
      var15.translate(var1.x, var1.y + var2.getBbHeight() * f_27420, var1.z);
      var15.mulPose(f_11537.gameRenderer.mainCamera().rotation());
      var15.mulPose(Axis.ZP.rotationDegrees(var8));
      m_7855(var14, var15.last().pose(), var7, m_7887(var9, var4));
      var15.popPose();
      m_7942(var14, var5 ? f_26512 : f_26511, true);
   }

   private static void m_7916(Class_TZhU50s8XmBQCMP5 var0, Vec3 var1, LivingEntity var2, int var3, float var4, long var5, boolean var7, float var8) {
      if (var7 && var5 - f_26559 >= f_27249 && f_26558.size() < 5) {
         f_26558.add(m_7861(var2, var1, var5));
         if (f_26557.nextFloat() < f_27250 && f_26558.size() < 5) {
            f_26558.add(m_7861(var2, var1, var5 + f_27251));
         }

         f_26559 = var5;
      }

      Iterator var9 = f_26558.iterator();

      while (var9.hasNext()) {
         Class_oV1nLcU0paHSE9Oj.vbgKRi4F34zTzWmv var10 = (Class_oV1nLcU0paHSE9Oj.vbgKRi4F34zTzWmv)var9.next();
         if (var5 - var10.f_26503 > var10.f_26504) {
            var9.remove();
         }
      }

      if (!f_26558.isEmpty()) {
         int var34 = m_7817(var3, f_27252);
         int var11 = m_7817(var3, f_27253);
         BufferBuilder var12 = m_7952();
         BufferBuilder var13 = m_7952();
         Matrix4f var14 = var0.m_5006().last().pose();
         Vec3 var15 = f_11537.gameRenderer.mainCamera().position();

         for (Class_oV1nLcU0paHSE9Oj.vbgKRi4F34zTzWmv var17 : f_26558) {
            float var18 = (float)(var5 - var17.f_26503) / (float)var17.f_26504;
            if (!(var18 < 0.0F)) {
               float var19 = m_7937(Mth.clamp(var18 / f_27254, 0.0F, 1.0F));
               float var20 = 1.0F - m_7832(Mth.clamp((var18 - f_27255) / f_27256, 0.0F, 1.0F));
               float var21 = 1.0F - m_7832(Mth.clamp(var18 / f_27257, 0.0F, 1.0F));
               float var22 = f_27258 + f_27259 * (float)Math.sin(var5 * f_27260 + var17.f_26505);
               float var23 = var4 * var20 * var22;
               if (!(var23 <= f_27261)) {
                  Vec3 var24 = var1.subtract(var17.f_26502);

                  for (Class_oV1nLcU0paHSE9Oj.FDRJZV2OjTT35QNI var26 : var17.f_26500) {
                     float var27 = Mth.clamp((var19 - var26.f_26491) / Math.max(f_27262, 1.0F - var26.f_26491), 0.0F, 1.0F);
                     if (!(var27 <= f_27263)) {
                        ArrayList var28 = new ArrayList(var26.f_26489.size());

                        for (Vec3 var30 : var26.f_26489) {
                           var28.add(var30.add(var24).subtract(var15));
                        }

                        float var35 = var23 * (f_27264 + var26.f_26490 * f_27265);

                        for (int var36 = 1; var36 <= 2; var36++) {
                           float var31 = (var28.size() - 1) * var27 * var36 * f_27266;
                           int var32 = Math.min((int)var31, var28.size() - 1);
                           Vec3 var33 = ((Vec3)var28.get(var32)).lerp((Vec3)var28.get(Math.min(var32 + 1, var28.size() - 1)), var31 - var32);
                           Class_vjVj7yuYZq5AqDPM.m_9273((float)var33.x, (float)var33.y, (float)var33.z, f_27267 * var26.f_26490, m_7887(var3, var35));
                        }

                        m_7834(var12, var14, var28, var27, var26.f_26490 * f_27268, m_7887(var34, var35 * (f_27269 + var21 * f_27270)), var17.f_26505, 0.0F);
                        m_7834(
                           var13,
                           var14,
                           var28,
                           var27,
                           var26.f_26490 * f_27271,
                           m_7887(var11, Math.min(1.0F, var35 * (1.0F + var21))),
                           var17.f_26505 + f_27272,
                           0.0F
                        );
                        m_7834(
                           var12,
                           var14,
                           var28,
                           var27,
                           var26.f_26490 * f_27273,
                           m_7887(-1, Math.min(1.0F, var35 * (f_27274 + var21 * f_27275))),
                           var17.f_26505 + f_27276,
                           0.0F
                        );
                     }
                  }
               }
            }
         }

         m_7913(var12, var13, f_26537, var3);
      }
   }

   private static void m_7917(Class_TZhU50s8XmBQCMP5 var0, Vec3 var1, LivingEntity var2, int var3, float var4) {
      var1 = var1.subtract(f_11537.gameRenderer.mainCamera().position());
      float var5 = m_7937(var4);
      float var6 = var2.getBbHeight();
      float var7 = Mth.lerp(var5, f_27541, 1.0F);
      float var8 = Math.max(f_27542, var2.getBbWidth() * f_27543 + f_27544) * var7;
      double var9 = f_26545 * f_27545 + var2.getId() * f_27546;
      double var11 = Math.toRadians(f_27547);
      Vec3 var13 = new Vec3(Math.sin(var11) * Math.cos(var9), Math.cos(var11), Math.sin(var11) * Math.sin(var9));
      Vec3[] var14 = m_7860(var13);
      Vec3 var15 = var1.add(0.0, var6 * f_27548, 0.0);
      Matrix4f var16 = var0.m_5006().last().pose();
      BufferBuilder var17 = m_7952();
      m_7955(var17, var16, var15, var14[0], var14[1], var8 * f_27549, m_7887(var3, var5 * f_27550));
      m_7955(var17, var16, var15, var14[0], var14[1], var8 * f_27551, m_7887(m_7817(var3, f_27552), var5 * f_27553));
      m_7825(var17, f_26531);
      BufferBuilder var18 = m_7952();
      double var19 = f_26545 * f_27554;

      for (int var21 = 0; var21 < 13; var21++) {
         float var22 = 1.0F - var21 / f_27555;
         double var23 = var19 - var21 * f_27556;
         Vec3 var25 = var15.add(var14[0].scale(Math.cos(var23) * var8)).add(var14[1].scale(Math.sin(var23) * var8));
         float var26 = var5 * var22 * var22 * f_27557;
         float var27 = f_27558 + var22 * f_27559;
         m_7893(var18, var16, var25.x, var25.y, var25.z, var27, m_7887(m_7817(var3, f_27560), var26));
      }

      m_7942(var18, f_26515, true);
   }

   private static int m_7918(int var0) {
      int var1 = var0 * f_27183 + f_27184;
      var1 = (var1 ^ var1 >> 13) * f_27185;
      return var1 & 0xFF;
   }

   public static void m_7919(boolean var0, boolean var1) {
      f_26630 = var0;
      f_26631 = var1;
   }

   private static int m_7920(int var0) {
      float var1 = Class_BftdentXEtGbugJw.m_2297(var0) / f_27866;
      float var2 = Class_BftdentXEtGbugJw.m_2309(var0) * var1;
      float var3 = Class_BftdentXEtGbugJw.m_2299(var0) * var1;
      float var4 = Class_BftdentXEtGbugJw.m_2308(var0) * var1;
      float var5 = Math.max(var2, Math.max(var3, var4)) * f_27867;
      if (var5 <= 0.0F) {
         return 0;
      }

      int var6 = Mth.clamp(Math.round(var5), 1, 255);
      float var7 = f_27868 / (var6 * 2.0F);
      return Class_BftdentXEtGbugJw.m_2303(
         Mth.clamp(Math.round(var2 * var7), 0, 255), Mth.clamp(Math.round(var3 * var7), 0, 255), Mth.clamp(Math.round(var4 * var7), 0, 255), var6
      );
   }

   public static void m_7921(
      float var0, String var1, int var2, boolean var3, String var4, String var5, boolean var6, String var7, boolean var8, boolean var9, String var10
   ) {
      f_26570 = Mth.clamp(var0, f_26662, f_26663);
      f_26571 = var1 != null && !var1.isEmpty() ? var1 : f_26664;
      f_26572 = var10 != null && !var10.isEmpty() ? var10 : f_26665;
      f_26595 = Mth.clamp(var2, 2, 4);
      f_26596 = var3;
      f_26597 = var4 != null && !var4.isEmpty() ? var4 : f_26666;
      f_26601 = var5 != null && !var5.isEmpty() ? var5 : f_26667;
      f_26602 = var6;
      f_26603 = var7 != null && !var7.isEmpty() ? var7 : f_26668;
      f_26604 = var8;
      f_26605 = var9;
   }

   private static int m_7922(float var0, int var1, int var2) {
      float var3 = Mth.clamp((f_27465 - var0) / f_27466, 0.0F, 1.0F);
      int var4 = Class_BftdentXEtGbugJw.m_2312(var2, -1, f_27467);
      int var5 = Class_BftdentXEtGbugJw.m_2312(var4, var2, var3);
      float var6 = (m_7891(var1) - f_27468) * f_27469;
      return Class_BftdentXEtGbugJw.m_2312(var5, var6 >= 0.0F ? -1 : var2, Math.abs(var6));
   }

   private static void m_7923(BufferBuilder var0, RenderPipeline var1) {
      MeshData var2 = var0.build();
      if (var2 != null) {
         GpuBuffer var3 = null;

         try {
            DrawState var4 = var2.drawState();
            int var5 = var4.indexCount();
            AutoStorageIndexBuffer var6 = RenderSystem.getSequentialBuffer(var4.primitiveTopology());
            GpuBuffer var7 = var6.getBuffer(var5);
            IndexType var8 = var6.type();
            var3 = RenderSystem.getDevice().createBuffer(() -> f_27886, 32, var2.vertexBuffer());
            RenderTarget var9 = f_11537.gameRenderer.mainRenderTarget();
            CommandEncoder var10 = RenderSystem.getDevice().createCommandEncoder();
            RenderPass var11 = var10.createRenderPass(
               () -> f_27885, var9.getColorTextureView(), Optional.empty(), var9.getDepthTextureView(), OptionalDouble.empty()
            );

            try {
               RenderSystem.bindDefaultUniforms(var11);
               var11.setPipeline(var1);
               var11.setVertexBuffer(0, var3.slice());
               var11.setIndexBuffer(var7, var8);
               var11.drawIndexed(var5, 1, 0, 0, 0);
            } catch (Throwable var19) {
               if (var11 != null) {
                  try {
                     var11.close();
                  } catch (Throwable var18) {
                     var19.addSuppressed(var18);
                  }
               }

               throw var19;
            }

            if (var11 != null) {
               var11.close();
            }
         } finally {
            if (var3 != null) {
               var3.close();
            }

            var2.close();
         }
      }
   }

   private static float m_7924(float var0, float var1) {
      int var2 = (int)Math.floor(var0) & 0xFF;
      int var3 = (int)Math.floor(var1) & 0xFF;
      float var4 = var0 - (float)Math.floor(var0);
      float var5 = var1 - (float)Math.floor(var1);
      float var6 = m_7827(var4);
      float var7 = m_7827(var5);
      int var8 = m_7918(var2) + var3;
      int var9 = m_7918(var2) + var3 + 1;
      int var10 = m_7918(var2 + 1) + var3;
      int var11 = m_7918(var2 + 1) + var3 + 1;
      float var12 = Mth.lerp(var6, m_7900(m_7918(var8), var4, var5), m_7900(m_7918(var10), var4 - 1.0F, var5));
      float var13 = Mth.lerp(var6, m_7900(m_7918(var9), var4, var5 - 1.0F), m_7900(m_7918(var11), var4 - 1.0F, var5 - 1.0F));
      return Mth.clamp(Mth.lerp(var7, var12, var13) * f_27181 + f_27182, 0.0F, 1.0F);
   }

   public static void m_7925(Class_TZhU50s8XmBQCMP5 var0) {
      if (f_26543 != null && f_26544 > f_26673) {
         m_7914(var0, null, f_26547, f_26568, f_26569);
      }
   }

   private static void m_7927(LivingEntity var0) {
      float var1 = var0.getBbWidth() * f_27749;
      float var2 = var0.getBbHeight();
      if (f_26552 != var0.getId() || f_26553 != var1 || f_26554 != var2) {
         f_26552 = var0.getId();
         f_26553 = var1;
         f_26554 = var2;
         f_26548.clear();
         Random var3 = new Random(var0.getId() * f_27750);
         int var4 = (int)(var1 + var2 * f_27751);

         for (int var5 = 0; var5 < var4; var5++) {
            Vector3f var6 = null;
            float var7 = f_27752;

            for (int var8 = 0; var8 < 15; var8++) {
               float var9 = var3.nextFloat() * f_27753;
               float var10 = var3.nextFloat() * var2;
               float var11 = (float)Math.toRadians(var9);
               float var12 = (float)Math.sin(var11) * var1;
               float var13 = (float)Math.cos(var11) * var1;
               if (f_26548.isEmpty()) {
                  var6 = new Vector3f(var12, var10, var13);
                  break;
               }

               float var14 = f_27754;

               for (Vector3f var16 : f_26548) {
                  float var17 = var16.x - var12;
                  float var18 = var16.y - var10;
                  float var19 = var16.z - var13;
                  var14 = Math.min(var14, var17 * var17 + var18 * var18 + var19 * var19);
               }

               if (var14 > var7) {
                  var7 = var14;
                  var6 = new Vector3f(var12, var10, var13);
               }
            }

            if (var6 != null) {
               f_26548.add(var6);
            }
         }
      }
   }

   private static Vec3 m_7928(Vec3 var0) {
      Vec3 var1 = var0.normalize();
      Vec3 var2 = Math.abs(var1.y) < f_27246 ? new Vec3(0.0, 1.0, 0.0) : new Vec3(1.0, 0.0, 0.0);
      Vec3 var3 = var1.cross(var2).normalize();
      Vec3 var4 = var1.cross(var3).normalize();
      double var5 = f_26557.nextDouble() * f_27247 * f_27248;
      return var3.scale(Math.cos(var5)).add(var4.scale(Math.sin(var5)));
   }

   private static void m_7929(BufferBuilder var0, RenderPipeline var1, RenderTarget var2, boolean var3) {
      MeshData var4 = var0.build();
      if (var4 != null) {
         GpuBuffer var5 = null;

         try {
            DrawState var6 = var4.drawState();
            int var7 = var6.indexCount();
            AutoStorageIndexBuffer var8 = RenderSystem.getSequentialBuffer(var6.primitiveTopology());
            GpuBuffer var9 = var8.getBuffer(var7);
            IndexType var10 = var8.type();
            var5 = RenderSystem.getDevice().createBuffer(() -> f_27879, 32, var4.vertexBuffer());
            CommandEncoder var11 = RenderSystem.getDevice().createCommandEncoder();
            RenderPass var12 = var11.createRenderPass(
               () -> f_27878,
               var2.getColorTextureView(),
               var3 ? Optional.of(new Vector4f(0.0F)) : Optional.empty(),
               var2.getDepthTextureView(),
               OptionalDouble.empty()
            );

            try {
               RenderSystem.bindDefaultUniforms(var12);
               var12.setPipeline(var1);
               var12.setVertexBuffer(0, var5.slice());
               var12.setIndexBuffer(var9, var10);
               var12.drawIndexed(var7, 1, 0, 0, 0);
            } catch (Throwable var20) {
               if (var12 != null) {
                  try {
                     var12.close();
                  } catch (Throwable var19) {
                     var20.addSuppressed(var19);
                  }
               }

               throw var20;
            }

            if (var12 != null) {
               var12.close();
            }
         } finally {
            if (var5 != null) {
               var5.close();
            }

            var4.close();
         }
      }
   }

   private static void m_7931(BufferBuilder var0, Matrix4f var1, float var2, float var3, float var4, float var5, float var6, Vector4f var7) {
      var0.addVertex(var1, var2, var3, var4).setUv(var5, var6).setColor(var7.x, var7.y, var7.z, var7.w);
   }

   private static double m_7932(double var0, double var2, float var4, int var5, int var6, int var7) {
      double var8 = f_26926 + (var5 > 0 ? f_26927 : 0.0) + (var7 > 0 ? f_26928 : 0.0);
      double var10 = f_26929 + (var6 > 0 ? f_26930 : 0.0);
      double var12 = var0 + var10 * var4 - var8 * var4 * var4;
      if (var12 >= var2) {
         return var12;
      }

      double var14 = Mth.clamp(Math.sqrt(Math.max(0.0, (var0 - var2) / var8)), 0.0, f_26931);
      double var16 = Mth.clamp((var4 - var14) / Math.max(f_26932, 1.0 - var14), 0.0, 1.0);
      double var18 = f_26933 + (var5 * var7 > 0 ? f_26934 : 0.0);
      double var20 = Math.abs(Math.sin(var16 * f_26935 * f_26936)) * var18 * (1.0 - var16) * (1.0 - var16);
      return var2 + var20;
   }

   private static List<Vec3> m_7934(List<Vec3> var0, int var1) {
      if (var0.size() >= 3 && var1 > 1) {
         ArrayList var2 = new ArrayList((var0.size() - 1) * var1 + 1);

         for (int var3 = 0; var3 < var0.size() - 1; var3++) {
            Vec3 var4 = (Vec3)var0.get(Math.max(0, var3 - 1));
            Vec3 var5 = (Vec3)var0.get(var3);
            Vec3 var6 = (Vec3)var0.get(var3 + 1);
            Vec3 var7 = (Vec3)var0.get(Math.min(var0.size() - 1, var3 + 2));

            for (int var8 = 0; var8 < var1; var8++) {
               double var9 = (double)var8 / var1;
               var2.add(m_7962(var4, var5, var6, var7, var9));
            }
         }

         var2.add((Vec3)var0.get(var0.size() - 1));
         return var2;
      } else {
         return new ArrayList<>(var0);
      }
   }

   private static void m_7935(Class_TZhU50s8XmBQCMP5 var0, Vec3 var1, LivingEntity var2, int var3, float var4, long var5) {
      var1 = var1.subtract(f_11537.gameRenderer.mainCamera().position());
      m_7927(var2);
      float var7 = (float)(var5 % f_27721) / f_27722;
      float var8 = (float)var5 * f_27723;
      float var9 = var2.getBbWidth() * f_27724;
      float var10 = var2.getBbHeight();
      float var11 = f_27725 - f_27726 * var4;
      float var12 = (float)Math.sin(Math.toRadians(var7));
      float var13 = (float)Math.cos(Math.toRadians(var7));
      int var14 = m_7887(var3, var4);
      PoseStack var15 = var0.m_5006();
      BufferBuilder var16 = m_7952();

      for (int var17 = 0; var17 < f_26548.size(); var17++) {
         Vector3f var18 = f_26548.get(var17);
         float var19 = var18.x * var13 - var18.z * var12;
         float var20 = var18.x * var12 + var18.z * var13;
         float var21 = var19 * var11;
         float var22 = var20 * var11;
         float var23 = var18.y + (float)(f_27727 * Math.sin(var8 * 2.0F + var17 * 1337));
         var15.pushPose();
         var15.translate(var1.x, var1.y, var1.z);
         m_7809(var16, var15, var21, var23, var22, f_27728, var14, var10, var7 + var17 * f_27729);
         var15.popPose();
         m_7954(var16, var15, var1.x + var21, var1.y + var23, var1.z + var22, f_27730, m_7887(var3, var4 * f_27731));
         m_7954(var16, var15, var1.x + var21, var1.y + var23, var1.z + var22, f_27732, m_7887(var3, var4 * f_27733));
      }

      m_7830(var16, f_26515, true, m_7831());
   }

   private static float m_7937(float var0) {
      float var1 = 1.0F - Mth.clamp(var0, 0.0F, 1.0F);
      return 1.0F - var1 * var1 * var1;
   }

   private static void m_7938(
      BufferBuilder var0, PoseStack var1, float var2, float var3, float var4, float var5, int var6, int var7, float var8, int var9, float var10, boolean var11
   ) {
      var1.pushPose();
      var1.translate(var2, var3, var4);
      float var12 = var10 * f_27764;
      float var13 = -var2;
      float var14 = var12 - var3;
      float var15 = -var4;
      float var16 = var13 * var13 + var14 * var14 + var15 * var15;
      if (var16 > f_27765) {
         float var17 = 1.0F / (float)Math.sqrt(var16);
         float var18 = Mth.clamp(var14 * var17, f_27766, 1.0F);
         float var19 = (float)Math.toDegrees(Math.atan2(var13, var15));
         float var20 = -((float)Math.toDegrees(Math.asin(var18)));
         var1.mulPose(Axis.YP.rotationDegrees(var19));
         var1.mulPose(Axis.XP.rotationDegrees(var20));
      }

      var1.mulPose(Axis.ZP.rotationDegrees(var8));
      var1.scale(var5 * f_27767, var5 * f_27768, var5 * f_27769);
      Matrix4f var29 = var1.last().pose();
      float var30 = f_27770 + m_7948(var9, f_27771) * f_27772;
      float var31 = f_27773 * var30;
      float var32 = f_27774 * (f_27775 + m_7948(var9, f_27776) * f_27777);
      float var21 = f_27778 * (f_27779 + m_7948(var9, f_27780) * f_27781);
      float var22 = (m_7948(var9, f_27782) - f_27783) * f_27784;
      float var23 = (m_7948(var9, f_27785) - f_27786) * f_27787;
      int var24 = Class_BftdentXEtGbugJw.m_2297(var6);
      int var25 = Class_BftdentXEtGbugJw.m_2303(
         Class_BftdentXEtGbugJw.m_2309(var7), Class_BftdentXEtGbugJw.m_2299(var7), Class_BftdentXEtGbugJw.m_2308(var7), var24
      );
      int var26 = var11 ? m_7817(var6, f_27788) : var6;
      int var27 = var11 ? m_7817(var25, f_27789) : var25;
      int var28 = var11 ? m_7817(var6, f_27790) : var6;
      m_7904(var0, var29, var22, var23, var32, -var31, 0.0F, 0.0F, 0.0F, var31, 0.0F, var26, var28, var28);
      m_7904(var0, var29, var22, var23, var32, 0.0F, var31, 0.0F, var31, 0.0F, 0.0F, var26, var28, var28);
      m_7904(var0, var29, var22, var23, var32, var31, 0.0F, 0.0F, 0.0F, -var31, 0.0F, var26, var28, var28);
      m_7904(var0, var29, var22, var23, var32, 0.0F, -var31, 0.0F, -var31, 0.0F, 0.0F, var26, var28, var28);
      m_7904(var0, var29, -var22 * f_27791, -var23 * f_27792, -var21, 0.0F, var31, 0.0F, -var31, 0.0F, 0.0F, var27, var28, var28);
      m_7904(var0, var29, -var22 * f_27793, -var23 * f_27794, -var21, var31, 0.0F, 0.0F, 0.0F, var31, 0.0F, var27, var28, var28);
      m_7904(var0, var29, -var22 * f_27795, -var23 * f_27796, -var21, 0.0F, -var31, 0.0F, var31, 0.0F, 0.0F, var27, var28, var28);
      m_7904(var0, var29, -var22 * f_27797, -var23 * f_27798, -var21, -var31, 0.0F, 0.0F, 0.0F, -var31, 0.0F, var27, var28, var28);
      var1.popPose();
   }

   private static void m_7939(BufferBuilder var0, Matrix4f var1, Vec3 var2, Vec3 var3, Vec3 var4, Vec3 var5, double var6, int var8, int var9) {
      Vec3 var10 = var5.subtract(var4).normalize();
      Vec3 var11 = Math.abs(var10.y) < f_26937 ? new Vec3(0.0, 1.0, 0.0) : new Vec3(1.0, 0.0, 0.0);
      Vec3 var12 = var10.cross(var11).normalize().scale(var6);
      Vec3 var13 = var10.cross(var12).normalize().scale(var6);

      for (int var14 = 0; var14 < var8; var14++) {
         double var15 = f_26938 * var14 / var8;
         double var17 = f_26939 * (var14 + 1) / var8;
         Vec3 var19 = var12.scale(Math.cos(var15)).add(var13.scale(Math.sin(var15)));
         Vec3 var20 = var12.scale(Math.cos(var17)).add(var13.scale(Math.sin(var17)));
         m_7945(
            var0,
            var1,
            m_7870(var4.add(var19), var2, var3),
            m_7870(var4.add(var20), var2, var3),
            m_7870(var5.add(var20), var2, var3),
            m_7870(var5.add(var19), var2, var3),
            var9
         );
      }
   }

   public static boolean m_7940() {
      return f_26632;
   }

   private static void m_7941(BufferBuilder var0, BufferBuilder var1) {
      m_7913(var0, var1, f_26537, -1);
   }

   private static void m_7942(BufferBuilder var0, Identifier var1, boolean var2) {
      m_7830(var0, var1, var2, f_26520);
   }

   private static void m_7943(Class_TZhU50s8XmBQCMP5 var0, Vec3 var1, LivingEntity var2, int var3, float var4, long var5) {
      var1 = var1.subtract(f_11537.gameRenderer.mainCamera().position());
      float var7 = (float)Math.sin(f_26545 * f_27421) * f_27422;
      float var8 = 1.0F + f_27423 * (float)Math.sin(f_26545 * 2.0F);
      float var9 = (f_27424 + var2.getBbWidth() * f_27425) * var4 * m_7906(f_26544) * var8;
      if (!(var9 <= f_27426)) {
         double var10 = var1.x;
         double var12 = var1.y + var2.getBbHeight() + f_27427 + var7;
         double var14 = var1.z;
         float var16 = -f_11537.gameRenderer.mainCamera().yRot();
         PoseStack var17 = var0.m_5006();
         BufferBuilder var18 = m_7952();
         var17.pushPose();
         var17.translate(var10, var12, var14);
         var17.mulPose(Axis.YP.rotationDegrees(var16));
         int var19 = m_7887(Class_BftdentXEtGbugJw.m_2312(var3, -1, f_27428), f_27429 * var4);
         m_7855(var18, var17.last().pose(), var9 * f_27430, var19);
         var17.popPose();
         m_7942(var18, f_26518, true);
         var17.pushPose();
         var17.translate(var10, var12, var14);
         var17.mulPose(Axis.YP.rotationDegrees(var16));
         var17.scale(var9, var9, var9);
         m_7852(var17, var3, var4, var5);
         var17.popPose();
      }
   }

   private static void m_7944(
      BufferBuilder var0,
      PoseStack var1,
      float var2,
      float var3,
      float var4,
      float var5,
      int var6,
      int var7,
      float var8,
      boolean var9,
      int var10,
      boolean var11
   ) {
      var1.pushPose();
      var1.translate(var2, var3, var4);
      var1.mulPose(Axis.XP.rotationDegrees(var8 * f_27799 + f_27800));
      var1.mulPose(Axis.YP.rotationDegrees(var8 * f_27801 + f_27802));
      var1.mulPose(Axis.ZP.rotationDegrees(var8 + f_27803));
      var1.scale(var5 * f_27804, var5 * f_27805, var5 * f_27806);
      Matrix4f var12 = var1.last().pose();
      float var13 = f_27807 * (f_27808 + m_7948(var10, f_27809) * f_27810);
      float var14 = f_27811 * (f_27812 + m_7948(var10, f_27813) * f_27814);
      float var15 = f_27815 * (f_27816 + m_7948(var10, f_27817) * f_27818);
      float var16 = (m_7948(var10, f_27819) - f_27820) * f_27821;
      float var17 = (m_7948(var10, f_27822) - f_27823) * f_27824;
      int var18 = var9 ? m_7817(var6, f_27825) : var6;
      int var19 = var6;
      int var20 = var9
         ? Class_BftdentXEtGbugJw.m_2303(
            Class_BftdentXEtGbugJw.m_2309(var7), Class_BftdentXEtGbugJw.m_2299(var7), Class_BftdentXEtGbugJw.m_2308(var7), Class_BftdentXEtGbugJw.m_2297(var6)
         )
         : var6;
      int var21 = var11 ? var20 : var18;
      int var22 = var11 ? var18 : var20;
      m_7904(var0, var12, var16, var17, var14, -var13, 0.0F, 0.0F, 0.0F, var13, 0.0F, var21, var19, var19);
      m_7904(var0, var12, var16, var17, var14, 0.0F, var13, 0.0F, var13, 0.0F, 0.0F, var21, var19, var19);
      m_7904(var0, var12, var16, var17, var14, var13, 0.0F, 0.0F, 0.0F, -var13, 0.0F, var21, var19, var19);
      m_7904(var0, var12, var16, var17, var14, 0.0F, -var13, 0.0F, -var13, 0.0F, 0.0F, var21, var19, var19);
      m_7904(var0, var12, -var16 * f_27826, -var17 * f_27827, -var15, 0.0F, var13, 0.0F, -var13, 0.0F, 0.0F, var22, var19, var19);
      m_7904(var0, var12, -var16 * f_27828, -var17 * f_27829, -var15, var13, 0.0F, 0.0F, 0.0F, var13, 0.0F, var22, var19, var19);
      m_7904(var0, var12, -var16 * f_27830, -var17 * f_27831, -var15, 0.0F, -var13, 0.0F, var13, 0.0F, 0.0F, var22, var19, var19);
      m_7904(var0, var12, -var16 * f_27832, -var17 * f_27833, -var15, -var13, 0.0F, 0.0F, 0.0F, -var13, 0.0F, var22, var19, var19);
      var1.popPose();
   }

   private static void m_7945(BufferBuilder var0, Matrix4f var1, Vec3 var2, Vec3 var3, Vec3 var4, Vec3 var5, int var6) {
      m_7812(var0, var1, (float)var2.x, (float)var2.y, (float)var2.z, 0.0F, 0.0F, var6);
      m_7812(var0, var1, (float)var3.x, (float)var3.y, (float)var3.z, 1.0F, 0.0F, var6);
      m_7812(var0, var1, (float)var4.x, (float)var4.y, (float)var4.z, 1.0F, 1.0F, var6);
      m_7812(var0, var1, (float)var5.x, (float)var5.y, (float)var5.z, 0.0F, 1.0F, var6);
   }

   private static void m_7946(BufferBuilder var0, PoseStack var1, float var2, int var3) {
      var1.pushPose();
      var1.scale(var2, var2, var2);
      Matrix4f var4 = var1.last().pose();

      for (int var5 = 0; var5 < f_26550.length; var5++) {
         int var6 = Class_BftdentXEtGbugJw.m_2303(
            Math.round(Class_BftdentXEtGbugJw.m_2309(var3) * f_26551[var5]),
            Math.round(Class_BftdentXEtGbugJw.m_2299(var3) * f_26551[var5]),
            Math.round(Class_BftdentXEtGbugJw.m_2308(var3) * f_26551[var5]),
            Class_BftdentXEtGbugJw.m_2297(var3)
         );
         float[] var7 = f_26549[f_26550[var5][0]];
         float[] var8 = f_26549[f_26550[var5][1]];
         float[] var9 = f_26549[f_26550[var5][2]];
         Vector4f var10 = Class_BftdentXEtGbugJw.m_2298(var6);
         m_7931(var0, var4, var7[0], var7[1], var7[2], f_27844, f_27845, var10);
         m_7931(var0, var4, var8[0], var8[1], var8[2], f_27846, f_27847, var10);
         m_7931(var0, var4, var9[0], var9[1], var9[2], f_27848, f_27849, var10);
      }

      var1.popPose();
   }

   private static float m_7948(int var0, float var1) {
      float var2 = (float)Math.sin(var0 * f_27834 + var1) * f_27835;
      return var2 - (float)Math.floor(var2);
   }

   private static void m_7949(PoseStack var0, BufferBuilder var1, double var2, double var4, double var6, float var8, float var9, int var10) {
      var0.pushPose();
      var0.translate(var2, var4, var6);
      var0.mulPose(f_11537.gameRenderer.mainCamera().rotation());
      Matrix4f var11 = var0.last().pose();
      m_7855(var1, var11, var8 * f_27047, m_7887(var10, var9 * f_27048));
      m_7855(var1, var11, var8, m_7887(var10, var9));
      var0.popPose();
   }

   private static void m_7950(Vec3[] var0, int var1, int var2, double var3, int var5, Random var6) {
      if (var2 - var1 >= 2 && !(var3 < f_27132) && var5 <= 3) {
         int var7 = (var1 + var2) / 2;
         Vec3 var8 = var0[var1];
         Vec3 var9 = var0[var2];
         Vec3 var10 = var9.subtract(var8);
         if (!(var10.lengthSqr() < f_27133)) {
            var10 = var10.normalize();
            Vec3 var11 = var10.cross(Math.abs(var10.y) < f_27134 ? new Vec3(0.0, 1.0, 0.0) : new Vec3(1.0, 0.0, 0.0));
            if (var11.lengthSqr() < f_27135) {
               var11 = new Vec3(0.0, 0.0, 1.0);
            }

            var11 = var11.normalize();
            Vec3 var12 = var10.cross(var11).normalize();
            double var13 = (var6.nextDouble() - f_27136) * f_27137 * var3;
            double var15 = (var6.nextDouble() - f_27138) * f_27139 * var3 * f_27140;
            var0[var7] = var8.lerp(var9, f_27141).add(var11.scale(var13)).add(var12.scale(var15));
            m_7950(var0, var1, var7, var3 * f_27142, var5 + 1, var6);
            m_7950(var0, var7, var2, var3 * f_27143, var5 + 1, var6);
         }
      }
   }

   private static void m_7951(double var0, double var2, double var4, long var6, float var8) {
      long var9 = System.currentTimeMillis();
      if (var9 - f_26610 >= f_27021) {
         f_26610 = var9;
         double var11 = f_27022 * var6 / f_27023;
         m_7896(var0, var2, var4, var11, 1.0, 1.0, f_27024, f_27025, var8);
         m_7896(var0, var2, var4, var11, f_27026, 1.0, f_27027, f_27028, var8);
         m_7896(var0, var2, var4, var11, f_27029, f_27030, 1.0, f_27031, var8);
      }
   }

   private static BufferBuilder m_7952() {
      return Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
   }

   private static void m_7954(BufferBuilder var0, PoseStack var1, double var2, double var4, double var6, float var8, int var9) {
      var1.pushPose();
      var1.translate(var2, var4, var6);
      var1.mulPose(f_11537.gameRenderer.mainCamera().rotation());
      m_7855(var0, var1.last().pose(), var8, var9);
      var1.popPose();
   }

   private static void m_7955(BufferBuilder var0, Matrix4f var1, Vec3 var2, Vec3 var3, Vec3 var4, float var5, int var6) {
      Vector4f var7 = Class_BftdentXEtGbugJw.m_2298(var6);
      float var8 = var5 * f_27762;
      Vec3 var9 = var2.subtract(var3.scale(var8)).subtract(var4.scale(var8));
      Vec3 var10 = var2.subtract(var3.scale(var8)).add(var4.scale(var8));
      Vec3 var11 = var2.add(var3.scale(var8)).add(var4.scale(var8));
      Vec3 var12 = var2.add(var3.scale(var8)).subtract(var4.scale(var8));
      m_7931(var0, var1, (float)var9.x, (float)var9.y, (float)var9.z, 0.0F, 0.0F, var7);
      m_7931(var0, var1, (float)var10.x, (float)var10.y, (float)var10.z, 0.0F, 1.0F, var7);
      m_7931(var0, var1, (float)var11.x, (float)var11.y, (float)var11.z, 1.0F, 1.0F, var7);
      m_7931(var0, var1, (float)var12.x, (float)var12.y, (float)var12.z, 1.0F, 0.0F, var7);
   }

   private static Vec3[] m_7956(Vec3 var0) {
      Vec3 var1 = new Vec3(0.0, 1.0, 0.0).subtract(var0.scale(var0.y));
      if (var1.lengthSqr() < f_27540) {
         return m_7860(var0);
      }

      Vec3 var2 = var1.normalize();
      Vec3 var3 = var2.cross(var0).normalize();
      return new Vec3[]{var3, var2};
   }

   private static void m_7958(LivingEntity var0) {
      if (f_26625 != var0.getId()) {
         f_26625 = var0.getId();
         f_26626 = var0.getId() % 1000 * f_27412;
      }
   }

   private static void m_7959(Class_TZhU50s8XmBQCMP5 var0, Vec3 var1, LivingEntity var2, int var3, float var4, float var5, boolean var6, float var7) {
      Matrix4f var8 = var0.m_5006().last().pose();
      Vec3 var9 = f_11537.gameRenderer.mainCamera().position();
      boolean var10 = var6 && var2.hurtTime > 7;
      if (var10 && !f_26636) {
         f_26640 = f_26638;
         f_26641 = f_26639;
         f_26642 = f_26640;
         f_26643 = f_26641;
         switch (f_26557.nextInt(4)) {
            case 0:
               f_26643 = f_26643 + f_26900;
               break;
            case 1:
               f_26643 = f_26643 - f_26901;
               break;
            case 2:
               f_26642 = f_26642 + f_26902;
               break;
            default:
               f_26642 = f_26642 - f_26903;
         }

         f_26635 = 0.0F;
         f_26637 = true;
         f_26636 = true;
      } else if (!var10) {
         f_26636 = false;
      }

      if (!var6 && f_26637) {
         float var11 = m_7832(f_26635);
         f_26638 = Mth.lerp(var11, f_26640, f_26642);
         f_26639 = Mth.lerp(var11, f_26641, f_26643);
         f_26637 = false;
      }

      if (f_26637) {
         f_26635 = Math.min(1.0F, f_26635 + var5 / f_26904);
         if (f_26635 >= 1.0F) {
            f_26638 = f_26642;
            f_26639 = f_26643;
            f_26637 = false;
         }
      }

      float var39 = m_7832(f_26635);
      float var12 = 0.0F;
      var12 = m_7832(var12);
      float var13 = var6 ? Mth.clamp(var4, 0.0F, 1.0F) : 1.0F;
      float var14 = var6 ? Math.min(f_26905, m_7906(m_7832(var13))) : 1.0F;
      float var15 = var6 ? 0.0F : Mth.clamp(1.0F - var4, 0.0F, 1.0F);
      double var16 = 1.0;
      double var18 = f_26906 + var14 * f_26907;
      double var20 = f_26908 * var16 * var18;
      double var22 = f_26909 * var16 * var18;
      double var24 = f_26910 * var16 * (f_26911 + var14 * f_26912);
      double var26 = f_26637 ? Mth.lerp(var39, f_26640, f_26642) : f_26638;
      double var28 = f_26637 ? Mth.lerp(var39, f_26641, f_26643) : f_26639;
      Vec3 var30 = var1.add(0.0, var2.getBbHeight() * f_26913, 0.0);
      double var31 = -var2.getBbHeight() * f_26914 + var24;
      int var33 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
      int var34 = f_26596 ? Class_BftdentXEtGbugJw.m_2302(var33, f_26915, var7) : var33;
      float var35 = var6 ? 1.0F : 1.0F - m_7832(Mth.clamp((var15 - f_26916) / f_26917, 0.0F, 1.0F));
      int var36 = m_7887(var34, var35);
      RenderTarget var37 = f_11537.gameRenderer.mainRenderTarget();
      m_7963(var37.width, var37.height);
      BufferBuilder var38 = m_7952();
      m_7818(var38, var8, var30, var9, var26, var28, var20, var22, var24, var31, var15, var36);
      m_7929(var38, f_26533, f_26627, true);
      if (f_26628) {
         Class_tXNQy8JnA8G6nDOI.f_31830.m_8868(f_26627, f_26629);
      }

      f_26633 = var34;
      f_26634 = 1.0F + var12 * f_26918;
      f_26632 = true;
   }

   private static float m_7960(Class_oV1nLcU0paHSE9Oj.F0nIo1tGX54h6o8A var0, long var1, float var3) {
      float var4 = (float)(var1 - var0.f_26486) / (float)var0.f_26487;
      if (!(var4 < 0.0F) && !(var4 > 1.0F)) {
         float var5 = m_7937(Mth.clamp(var4 / f_27109, 0.0F, 1.0F));
         float var6 = 1.0F - m_7832(Mth.clamp((var4 - f_27110) / f_27111, 0.0F, 1.0F));
         float var7 = f_27112 + f_27113 * m_7858((int)((var1 - var0.f_26486) / f_27114) + 1, var0.f_26488);
         return var3 * var5 * var6 * var7;
      } else {
         return 0.0F;
      }
   }

   private static void m_7961(Class_oV1nLcU0paHSE9Oj.F0nIo1tGX54h6o8A var0, Vec3 var1, float var2, float var3, int var4, List<Vec3> var5) {
      var5.clear();
      byte var6 = 12;
      Vec3[] var7 = new Vec3[var6];
      float var8 = var0.f_26485 + var4 * f_27115;
      float var9 = Math.max(var0.f_26478, 1.0F);

      for (int var10 = 0; var10 < var6; var10++) {
         float var11 = (float)var10 / (var6 - 1);
         float var12 = (m_7858(var10 + 3 + var4 * 11, var8) - f_27116) * f_27117;
         float var13 = (m_7858(var10 + 71 + var4 * 5, var8) - f_27118) * f_27119;
         float var14 = (m_7858(var10 + 19 + var4, var8) - f_27120) * f_27121;
         double var15 = var0.f_26476 + var0.f_26477 * var9 * f_27122 * f_27123 * var11 + var12;
         double var17 = var3 * var0.f_26481 * (1.0F + var13);
         var17 = Mth.clamp((float)var17, var3 * f_27124, var3 * f_27125);
         double var19 = var2 * Mth.lerp(var11, var0.f_26480, var0.f_26479) + var2 * var14;
         var7[var10] = var1.add(Math.cos(var15) * var17, var19, Math.sin(var15) * var17);
      }

      m_7950(var7, 0, var6 - 1, var3 * f_27126, 0, new Random(Float.floatToIntBits(var8) * f_27127 + var4 * f_27128));

      for (int var21 = 0; var21 < var6; var21++) {
         Vec3 var23 = var7[var21].subtract(var1);
         double var25 = Math.sqrt(var23.x * var23.x + var23.z * var23.z);
         if (var25 > f_27129) {
            double var28 = var3 * var0.f_26481;
            double var16 = var28 / var25;
            double var18 = f_27130;
            var7[var21] = var1.add(var23.x * (1.0 - var18 + var18 * var16), var23.y, var23.z * (1.0 - var18 + var18 * var16));
         }
      }

      for (int var22 = 0; var22 < 28; var22++) {
         float var24 = var22 / f_27131;
         float var26 = var24 * (var6 - 1);
         int var27 = Math.min(var6 - 2, (int)var26);
         float var29 = var26 - var27;
         var5.add(var7[var27].lerp(var7[var27 + 1], var29));
      }
   }

   private static Vec3 m_7962(Vec3 var0, Vec3 var1, Vec3 var2, Vec3 var3, double var4) {
      double var6 = var4 * var4;
      double var8 = var6 * var4;
      return new Vec3(
         f_27354
            * (
               f_27355 * var1.x
                  + (-var0.x + var2.x) * var4
                  + (f_27356 * var0.x - f_27357 * var1.x + f_27358 * var2.x - var3.x) * var6
                  + (-var0.x + f_27359 * var1.x - f_27360 * var2.x + var3.x) * var8
            ),
         f_27361
            * (
               f_27362 * var1.y
                  + (-var0.y + var2.y) * var4
                  + (f_27363 * var0.y - f_27364 * var1.y + f_27365 * var2.y - var3.y) * var6
                  + (-var0.y + f_27366 * var1.y - f_27367 * var2.y + var3.y) * var8
            ),
         f_27368
            * (
               f_27369 * var1.z
                  + (-var0.z + var2.z) * var4
                  + (f_27370 * var0.z - f_27371 * var1.z + f_27372 * var2.z - var3.z) * var6
                  + (-var0.z + f_27373 * var1.z - f_27374 * var2.z + var3.z) * var8
            )
      );
   }

   private static void m_7963(int var0, int var1) {
      if (f_26627 == null) {
         f_26627 = new TextureTarget(f_26946, var0, var1, false, GpuFormat.RGBA8_UNORM);
      } else if (f_26627.width != var0 || f_26627.height != var1) {
         f_26627.resize(var0, var1);
      }
   }

   private static final class BNt5vHvMwoeyBNKB {
      public final Vec3 f_26459;
      public final long f_26460;
      public final float f_26461;
      public final float f_26462;

      public BNt5vHvMwoeyBNKB(Vec3 var1, long var2, float var4, float var5) {
         this.f_26459 = var1;
         this.f_26460 = var2;
         this.f_26461 = var4;
         this.f_26462 = var5;
      }
   }

   private record CGX9upVJA0hI2PBi(float x, float y, float z, float size, float spin) {
   }

   private static final class CefWHVrCHHOwSLC4 {
      public final double f_26463;
      public final double f_26464;
      public final double f_26465;
      public final long f_26466;
      public final int f_26467;
      public float f_26468;
      public float f_26469;
      public float f_26470 = 1.0F;
      public long f_26471;
      public long f_26472;
      public static final long f_26473 = 100L;
      public static final long f_26474 = 200L;
      public static final long f_26475 = 50L;

      public void m_7806(long var1) {
         float var3 = Mth.clamp((float)(var1 - this.f_26471) / (float)this.f_26472, 0.0F, 1.0F);
         this.f_26468 = Mth.lerp(var3, this.f_26469, this.f_26470);
         this.f_26469 = this.f_26468;
         this.f_26470 = var1 - this.f_26466 < f_26474 ? 1.0F : 0.0F;
         this.f_26471 = var1;
         this.f_26472 = f_26475;
      }

      public CefWHVrCHHOwSLC4(double var1, double var3, double var5, long var7, int var9) {
         this.f_26472 = f_26473;
         this.f_26463 = var1;
         this.f_26464 = var3;
         this.f_26465 = var5;
         this.f_26466 = var7;
         this.f_26467 = var9;
         this.f_26471 = var7;
      }
   }

   private static final class F0nIo1tGX54h6o8A {
      public final double f_26476;
      public final int f_26477;
      public final float f_26478;
      public final float f_26479;
      public final float f_26480;
      public final float f_26481;
      public final float f_26482;
      public final float f_26483;
      public final int f_26484;
      public final float f_26485;
      public final long f_26486;
      public final long f_26487;
      public final float f_26488;

      public F0nIo1tGX54h6o8A(
         double var1,
         int var3,
         float var4,
         float var5,
         float var6,
         float var7,
         float var8,
         float var9,
         int var10,
         float var11,
         long var12,
         long var14,
         float var16
      ) {
         this.f_26476 = var1;
         this.f_26477 = var3;
         this.f_26478 = var4;
         this.f_26479 = var5;
         this.f_26480 = var6;
         this.f_26481 = var7;
         this.f_26482 = var8;
         this.f_26483 = var9;
         this.f_26484 = var10;
         this.f_26485 = var11;
         this.f_26486 = var12;
         this.f_26487 = var14;
         this.f_26488 = var16;
      }
   }

   private static final class FDRJZV2OjTT35QNI {
      public final List<Vec3> f_26489;
      public final float f_26490;
      public final float f_26491;

      public FDRJZV2OjTT35QNI(List<Vec3> var1, float var2, float var3) {
         this.f_26489 = var1;
         this.f_26490 = var2;
         this.f_26491 = var3;
      }
   }

   private static final class SjzMjyMYX7ylg4dN {
      public final List<Vec3> f_26492;
      public final long f_26493;
      public final long f_26494;
      public final long f_26495;
      public final float f_26496;
      public final float f_26497;
      public final int f_26498;
      public final float f_26499;

      public SjzMjyMYX7ylg4dN(List<Vec3> var1, long var2, long var4, long var6, float var8, float var9, int var10, float var11) {
         this.f_26492 = var1;
         this.f_26493 = var2;
         this.f_26494 = var4;
         this.f_26495 = var6;
         this.f_26496 = var8;
         this.f_26497 = var9;
         this.f_26498 = var10;
         this.f_26499 = var11;
      }
   }

   private static final class vbgKRi4F34zTzWmv {
      public final List<Class_oV1nLcU0paHSE9Oj.FDRJZV2OjTT35QNI> f_26500;
      public final Vec3 f_26501;
      public final Vec3 f_26502;
      public final long f_26503;
      public final long f_26504;
      public final float f_26505;
      public final int f_26506;
      public final double f_26507;
      public final double f_26508;
      public final float f_26509;
      public final float f_26510;

      public vbgKRi4F34zTzWmv(
         List<Class_oV1nLcU0paHSE9Oj.FDRJZV2OjTT35QNI> var1,
         Vec3 var2,
         Vec3 var3,
         long var4,
         long var6,
         float var8,
         int var9,
         double var10,
         double var12,
         float var14,
         float var15
      ) {
         this.f_26500 = var1;
         this.f_26501 = var2;
         this.f_26502 = var3;
         this.f_26503 = var4;
         this.f_26504 = var6;
         this.f_26505 = var8;
         this.f_26506 = var9;
         this.f_26507 = var10;
         this.f_26508 = var12;
         this.f_26509 = var14;
         this.f_26510 = var15;
      }
   }
}
