package dev.dimasik.client.module.render;

import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.IndexType;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
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
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.MeshData.DrawState;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_81oIJPtsDGdzRKcL;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_PoKta0VE7AdhY1En;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_bhSc4OUnYWSe2vjL;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.awt.Color;
import java.nio.ByteBuffer;
import java.util.Optional;
import java.util.OptionalDouble;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;

public final class BlockOverlay extends Module {
   private static final double f_507 = 0.01;
   private static final double f_508 = 0.002;
   private static final double f_509 = 36.0;
   private final MultiChoiceSetting f_510;
   private final CheckboxSetting f_511;
   private final SliderSetting f_512;
   private final SliderSetting f_513;
   private final SliderSetting f_514;
   private final SliderSetting f_515;
   private final SliderSetting f_516;
   private final SliderSetting f_517;
   private final CheckboxSetting f_518;
   private final SliderSetting f_519;
   private final RenderPipeline f_520;
   private final RenderPipeline f_521;
   private final RenderPipeline f_522;
   private final RenderPipeline f_523;
   private AABB f_524;
   private long f_525;
   private TextureTarget f_526;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_527;
   private static final String f_528 = "BlockOverlay";
   private static final String f_529 = "Подсвечивает блок под прицелом";
   private static final String f_530 = "Режим";
   private static final String f_531 = "Плазма";
   private static final String f_532 = "Шейдер";
   private static final String f_533 = "Заливка";
   private static final String f_534 = "Обводка темы";
   private static final String f_535 = "Прозрачность";
   private static final float f_536 = 0.72F;
   private static final float f_537 = 0.1F;
   private static final float f_538 = 0.05F;
   private static final String f_539 = "Скорость плазмы";
   private static final float f_540 = 1.15F;
   private static final float f_541 = 0.1F;
   private static final float f_542 = 5.0F;
   private static final float f_543 = 0.1F;
   private static final String f_544 = "Масштаб плазмы";
   private static final float f_545 = 2.4F;
   private static final float f_546 = 0.5F;
   private static final float f_547 = 5.0F;
   private static final float f_548 = 0.1F;
   private static final String f_549 = "Ширина оутлайна";
   private static final float f_550 = 2.75F;
   private static final float f_551 = 0.5F;
   private static final float f_552 = 8.0F;
   private static final float f_553 = 0.25F;
   private static final String f_554 = "Прозрачность оутлайна";
   private static final float f_555 = 70.0F;
   private static final float f_556 = 5.0F;
   private static final float f_557 = 100.0F;
   private static final String f_558 = "Сила свечения";
   private static final float f_559 = 1.05F;
   private static final float f_560 = 0.2F;
   private static final float f_561 = 2.5F;
   private static final float f_562 = 0.05F;
   private static final String f_563 = "Плавность";
   private static final String f_564 = "Скорость плавности";
   private static final float f_565 = 10.0F;
   private static final float f_566 = 25.0F;
   private static final float f_567 = 0.5F;
   private static final String f_568 = "dimasik/block_overlay_fill";
   private static final String f_569 = "block_overlay_mask";
   private static final String f_570 = "block_overlay_mask";
   private static final String f_571 = "dimasik/block_overlay_mask";
   private static final String f_572 = "block_overlay_mask";
   private static final String f_573 = "block_overlay_mask";
   private static final String f_574 = "dimasik/block_overlay_plasma";
   private static final String f_575 = "hands_fullscreen";
   private static final String f_576 = "block_overlay_plasma";
   private static final String f_577 = "BlockOverlayPlasma";
   private static final String f_578 = "MaskSampler";
   private static final String f_579 = "dimasik/block_overlay_crystal";
   private static final String f_580 = "hands_fullscreen";
   private static final String f_581 = "block_overlay_crystal";
   private static final String f_582 = "BlockOverlayCrystal";
   private static final String f_583 = "MaskSampler";
   private static final long f_584 = -1L;
   private static final double f_585 = 0.5;
   private static final double f_586 = 0.5;
   private static final double f_587 = 0.5;
   private static final double f_588 = 36.0;
   private static final String f_589 = "Плазма";
   private static final String f_590 = "Шейдер";
   private static final float f_591 = 255.0F;
   private static final float f_592 = 255.0F;
   private static final float f_593 = 255.0F;
   private static final float f_594 = 255.0F;
   private static final float f_595 = 255.0F;
   private static final float f_596 = 255.0F;
   private static final long f_597 = 100000L;
   private static final float f_598 = 1000.0F;
   private static final float f_599 = 100.0F;
   private static final String f_600 = "MaskSampler";
   private static final String f_601 = "BlockOverlayPlasma";
   private static final float f_602 = 255.0F;
   private static final float f_603 = 255.0F;
   private static final float f_604 = 255.0F;
   private static final long f_605 = 100000L;
   private static final float f_606 = 1000.0F;
   private static final float f_607 = 100.0F;
   private static final String f_608 = "MaskSampler";
   private static final String f_609 = "BlockOverlayCrystal";
   private static final double f_610 = 0.01;
   private static final float f_611 = 255.0F;
   private static final float f_612 = 255.0F;
   private static final double f_613 = 0.01;
   private static final float f_614 = 100.0F;
   private static final double f_615 = 0.002;
   private static final String f_616 = "block-overlay-mask";
   private static final double f_617 = 0.001;
   private static final double f_618 = 0.001;
   private static final double f_619 = 0.001;
   private static final double f_620 = 0.001;
   private static final double f_621 = 0.001;
   private static final double f_622 = 0.001;
   private static final double f_623 = 1.0E-7;
   private static final double f_624 = 1.0E-7;
   private static final double f_625 = 1.0E-7;
   private static final double f_626 = 1.0E9;
   private static final long f_627 = -1L;
   private static final String f_628 = "blockOverlayMask";
   private static final String f_629 = "blockOverlay";
   private static final String f_630 = "blockOverlayVertices";
   private static final String f_631 = "blockOverlayCrystal";
   private static final String f_632 = "blockOverlayCrystal";
   private static final String f_633 = "blockOverlayPlasma";
   private static final String f_634 = "blockOverlayPlasma";
   private static final String f_635 = "Плазма";
   private static final String f_636 = "Шейдер";
   private static final String f_637 = "Плазма";
   private static final String f_638 = "Плазма";

   private void m_854(PoseStack var1, AABB var2, Vec3 var3, int var4) {
      if (this.m_871(var1, var2, var3)) {
         Color var5 = new Color(var4, true);
         CommandEncoder var6 = RenderSystem.getDevice().createCommandEncoder();
         GpuBuffer var7 = null;

         try {
            MemoryStack var8 = MemoryStack.stackPush();

            try {
               ByteBuffer var9 = Std140Builder.onStack(var8, 64)
                  .putVec4(var5.getRed() / f_602, var5.getGreen() / f_603, var5.getBlue() / f_604, this.f_512.m_8768())
                  .putVec4((float)(System.currentTimeMillis() % f_605) / f_606, this.f_511.m_8768() ? 1.0F : 0.0F, 0.0F, 0.0F)
                  .putVec4(this.f_515.m_8768(), this.f_516.m_8768() / f_607, this.f_517.m_8768(), 0.0F)
                  .putVec2(this.f_526.width, this.f_526.height)
                  .get();
               var7 = RenderSystem.getDevice().createBuffer(() -> f_632, 128, var9);
               RenderTarget var10 = f_11537.gameRenderer.mainRenderTarget();
               RenderPass var11 = var6.createRenderPass(() -> f_631, var10.getColorTextureView(), Optional.empty());

               try {
                  RenderSystem.bindDefaultUniforms(var11);
                  var11.bindTexture(f_608, this.f_526.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
                  var11.setUniform(f_609, var7);
                  var11.setPipeline(this.f_523);
                  var11.draw(3, 1, 0, 0);
               } catch (Throwable var22) {
                  if (var11 != null) {
                     try {
                        var11.close();
                     } catch (Throwable var21) {
                        var22.addSuppressed(var21);
                     }
                  }

                  throw var22;
               }

               if (var11 != null) {
                  var11.close();
               }
            } catch (Throwable var23) {
               if (var8 != null) {
                  try {
                     var8.close();
                  } catch (Throwable var20) {
                     var23.addSuppressed(var20);
                  }
               }

               throw var23;
            }

            if (var8 != null) {
               var8.close();
            }
         } finally {
            if (var7 != null) {
               var7.close();
            }
         }
      }
   }

   private void m_855(PoseStack var1, AABB var2, Vec3 var3, int var4) {
      if (this.m_871(var1, var2, var3)) {
         Color var5 = new Color(var4, true);
         Color var6 = new Color(Math.min(255, var5.getRed() + 70), Math.min(255, var5.getGreen() + 55), Math.min(255, var5.getBlue() + 40));
         CommandEncoder var7 = RenderSystem.getDevice().createCommandEncoder();
         GpuBuffer var8 = null;

         try {
            MemoryStack var9 = MemoryStack.stackPush();

            try {
               ByteBuffer var10 = Std140Builder.onStack(var9, 80)
                  .putVec4(var5.getRed() / f_591, var5.getGreen() / f_592, var5.getBlue() / f_593, this.f_512.m_8768())
                  .putVec4(var6.getRed() / f_594, var6.getGreen() / f_595, var6.getBlue() / f_596, 1.0F)
                  .putVec4((float)(System.currentTimeMillis() % f_597) / f_598, this.f_513.m_8768(), this.f_514.m_8768(), this.f_511.m_8768() ? 1.0F : 0.0F)
                  .putVec4(this.f_515.m_8768(), this.f_516.m_8768() / f_599, this.f_517.m_8768(), 0.0F)
                  .putVec2(this.f_526.width, this.f_526.height)
                  .get();
               var8 = RenderSystem.getDevice().createBuffer(() -> f_634, 128, var10);
               RenderTarget var11 = f_11537.gameRenderer.mainRenderTarget();
               RenderPass var12 = var7.createRenderPass(() -> f_633, var11.getColorTextureView(), Optional.empty());

               try {
                  RenderSystem.bindDefaultUniforms(var12);
                  var12.bindTexture(f_600, this.f_526.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
                  var12.setUniform(f_601, var8);
                  var12.setPipeline(this.f_522);
                  var12.draw(3, 1, 0, 0);
               } catch (Throwable var23) {
                  if (var12 != null) {
                     try {
                        var12.close();
                     } catch (Throwable var22) {
                        var23.addSuppressed(var22);
                     }
                  }

                  throw var23;
               }

               if (var12 != null) {
                  var12.close();
               }
            } catch (Throwable var24) {
               if (var9 != null) {
                  try {
                     var9.close();
                  } catch (Throwable var21) {
                     var24.addSuppressed(var21);
                  }
               }

               throw var24;
            }

            if (var9 != null) {
               var9.close();
            }
         } finally {
            if (var8 != null) {
               var8.close();
            }
         }
      }
   }

   private AABB m_856(Level var1, BlockPos var2) {
      BlockState var3 = var1.getBlockState(var2);
      AABB var4 = var3.getShape(var1, var2).bounds();
      return !var4.hasNaN() && (!(var4.minX >= var4.maxX - f_623) || !(var4.minY >= var4.maxY - f_624) || !(var4.minZ >= var4.maxZ - f_625))
         ? var4.move(var2.getX(), var2.getY(), var2.getZ())
         : new AABB(var2);
   }

   private void m_857(BufferBuilder var1, Matrix4f var2, AABB var3, float var4, float var5, float var6, float var7) {
      float var8 = (float)var3.minX;
      float var9 = (float)var3.minY;
      float var10 = (float)var3.minZ;
      float var11 = (float)var3.maxX;
      float var12 = (float)var3.maxY;
      float var13 = (float)var3.maxZ;
      this.m_870(var1, var2, var8, var9, var10, var11, var9, var10, var11, var9, var13, var8, var9, var13, var4, var5, var6, var7);
      this.m_870(var1, var2, var8, var12, var10, var8, var12, var13, var11, var12, var13, var11, var12, var10, var4, var5, var6, var7);
      this.m_870(var1, var2, var8, var9, var10, var8, var12, var10, var11, var12, var10, var11, var9, var10, var4, var5, var6, var7);
      this.m_870(var1, var2, var8, var9, var13, var11, var9, var13, var11, var12, var13, var8, var12, var13, var4, var5, var6, var7);
      this.m_870(var1, var2, var8, var9, var10, var8, var9, var13, var8, var12, var13, var8, var12, var10, var4, var5, var6, var7);
      this.m_870(var1, var2, var11, var9, var10, var11, var12, var10, var11, var12, var13, var11, var9, var13, var4, var5, var6, var7);
   }

   public static boolean m_859() {
      try {
         BlockOverlay var0 = DimasikClient.m_9057().m_9049().m_2801().m_3427();
         if (var0 == null || !var0.m_776()) {
            return false;
         } else if (f_11537.level != null && f_11537.gameRenderer != null) {
            Vec3 var1 = f_11537.gameRenderer.mainCamera().position();
            return !var0.m_865(var1);
         } else {
            return true;
         }
      } catch (Throwable var2) {
         return false;
      }
   }

   private void m_860(Class_TZhU50s8XmBQCMP5 var1, AABB var2, Vec3 var3, int var4) {
      float var5 = this.f_516.m_8768() / f_614;
      int var6 = Class_BftdentXEtGbugJw.m_2306(var4, var5);
      AABB var7 = var2.inflate(f_615);
      VertexConsumer var8 = var1.m_5008().m_881(Class_81oIJPtsDGdzRKcL.f_3816);
      Class_bhSc4OUnYWSe2vjL.m_6087(var1.m_5006(), var8, var3, var7.minX, var7.minY, var7.minZ, var7.maxX, var7.maxY, var7.maxZ, var6);
   }

   private static double m_861(double var0, double var2, double var4) {
      return var0 + (var2 - var0) * var4;
   }

   private boolean m_863(BufferBuilder var1, RenderPipeline var2, RenderTarget var3, boolean var4) {
      MeshData var5 = var1.build();
      if (var5 == null) {
         return false;
      }

      GpuBuffer var6 = null;

      try {
         DrawState var7 = var5.drawState();
         int var8 = var7.indexCount();
         if (var8 <= 0) {
            return false;
         }

         AutoStorageIndexBuffer var9 = RenderSystem.getSequentialBuffer(var7.primitiveTopology());
         GpuBuffer var10 = var9.getBuffer(var8);
         IndexType var11 = var9.type();
         var6 = RenderSystem.getDevice().createBuffer(() -> f_630, 32, var5.vertexBuffer());
         CommandEncoder var12 = RenderSystem.getDevice().createCommandEncoder();
         RenderPass var13 = var4
            ? var12.createRenderPass(() -> f_629, var3.getColorTextureView(), Optional.empty(), var3.getDepthTextureView(), OptionalDouble.empty())
            : var12.createRenderPass(() -> f_628, var3.getColorTextureView(), Optional.empty());

         try {
            RenderSystem.bindDefaultUniforms(var13);
            var13.setPipeline(var2);
            var13.setVertexBuffer(0, var6.slice());
            var13.setIndexBuffer(var10, var11);
            var13.drawIndexed(var8, 1, 0, 0, 0);
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

         return true;
      } finally {
         if (var6 != null) {
            var6.close();
         }

         var5.close();
      }
   }

   private boolean m_865(Vec3 var1) {
      BlockPos var2 = BlockPos.containing(var1.x - f_617, var1.y - f_618, var1.z - f_619);
      BlockPos var3 = BlockPos.containing(var1.x + f_620, var1.y + f_621, var1.z + f_622);

      for (BlockPos var5 : BlockPos.betweenClosed(var2, var3)) {
         BlockState var6 = f_11537.level.getBlockState(var5);
         if (!var6.isAir()) {
            VoxelShape var7 = var6.getCollisionShape(f_11537.level, var5);
            if (!var7.isEmpty()) {
               AABB var8 = var7.bounds();
               double var9 = var1.x - var5.getX();
               double var11 = var1.y - var5.getY();
               double var13 = var1.z - var5.getZ();
               if (var8.contains(var9, var11, var13)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private void m_867() {
      int var1 = f_11537.getWindow().getWidth();
      int var2 = f_11537.getWindow().getHeight();
      if (var1 > 0 && var2 > 0) {
         if (this.f_526 == null) {
            this.f_526 = new TextureTarget(f_616, var1, var2, false, GpuFormat.RGBA8_UNORM);
         } else {
            if (this.f_526.width != var1 || this.f_526.height != var2) {
               this.f_526.resize(var1, var2);
            }
         }
      }
   }

   private void m_870(
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
      var1.addVertex(var2, var3, var4, var5).setUv(0.0F, 0.0F).setColor(var15, var16, var17, var18);
      var1.addVertex(var2, var6, var7, var8).setUv(1.0F, 0.0F).setColor(var15, var16, var17, var18);
      var1.addVertex(var2, var9, var10, var11).setUv(1.0F, 1.0F).setColor(var15, var16, var17, var18);
      var1.addVertex(var2, var12, var13, var14).setUv(0.0F, 1.0F).setColor(var15, var16, var17, var18);
   }

   private boolean m_871(PoseStack var1, AABB var2, Vec3 var3) {
      this.m_867();
      if (this.f_526 == null) {
         return false;
      }

      CommandEncoder var4 = RenderSystem.getDevice().createCommandEncoder();
      var4.clearColorTexture(this.f_526.getColorTexture(), new Vector4f(0.0F));
      AABB var5 = var2.inflate(f_610).move(-var3.x, -var3.y, -var3.z);
      BufferBuilder var6 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
      this.m_857(var6, var1.last().pose(), var5, 1.0F, 1.0F, 1.0F, 1.0F);
      return this.m_863(var6, this.f_521, this.f_526, false);
   }

   @Override
   public void m_732() {
      this.m_878();
      if (this.f_526 != null) {
         this.f_526.destroyBuffers();
         this.f_526 = null;
      }
   }

   private void m_873(PoseStack var1, AABB var2, Vec3 var3, int var4) {
      int var5 = Math.max(0, Math.min(255, Math.round(this.f_512.m_8768() * f_611)));
      int var6 = Class_BftdentXEtGbugJw.m_2306(var4, var5 / f_612);
      Vector4f var7 = Class_BftdentXEtGbugJw.m_2298(var6);
      AABB var8 = var2.inflate(f_613).move(-var3.x, -var3.y, -var3.z);
      BufferBuilder var9 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
      this.m_857(var9, var1.last().pose(), var8, var7.x, var7.y, var7.z, var7.w);
      this.m_863(var9, this.f_520, f_11537.gameRenderer.mainRenderTarget(), true);
   }

   private void m_875(Class_TZhU50s8XmBQCMP5 var1) {
      if (f_11537.level != null && f_11537.player != null) {
         HitResult var2 = f_11537.hitResult;
         if (var2 != null && var2.getType() == Type.BLOCK) {
            BlockHitResult var3 = (BlockHitResult)var2;
            Vec3 var4 = var1.m_5010();
            if (!var3.isInside() && !this.m_865(var4)) {
               BlockPos var5 = var3.getBlockPos();
               double var6 = f_11537.player.distanceToSqr(var5.getX() + f_585, var5.getY() + f_586, var5.getZ() + f_587);
               if (var6 > f_588) {
                  this.m_878();
               } else {
                  AABB var8 = this.m_856(f_11537.level, var5);
                  if (var8.contains(var4)) {
                     this.m_878();
                  } else {
                     this.m_879(var8);
                     if (this.f_524 != null) {
                        this.m_876(var1, this.f_524);
                     }
                  }
               }
            } else {
               this.m_878();
            }
         } else {
            this.m_878();
         }
      } else {
         this.m_878();
      }
   }

   private void m_876(Class_TZhU50s8XmBQCMP5 var1, AABB var2) {
      Vec3 var3 = var1.m_5010();
      PoseStack var4 = var1.m_5006();
      int var5 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
      if (this.f_510.m_7568(f_589)) {
         this.m_855(var4, var2, var3, var5);
      } else if (this.f_510.m_7568(f_590)) {
         this.m_854(var4, var2, var3, var5);
      } else {
         this.m_873(var4, var2, var3, var5);
         if (this.f_511.m_8768()) {
            this.m_860(var1, var2, var3, var5);
         }
      }
   }

   public BlockOverlay() {
      super(f_528, f_529, Category.RENDER);
      this.f_510 = new MultiChoiceSetting(f_530, new Class_2ZaVm8TGDJ68TnJB(f_531), new Class_2ZaVm8TGDJ68TnJB(f_532), new Class_2ZaVm8TGDJ68TnJB(f_533));
      this.f_511 = new CheckboxSetting(f_534, true);
      this.f_512 = new SliderSetting(f_535, f_536, f_537, 1.0F).m_828(f_538);
      this.f_513 = new SliderSetting(f_539, f_540, f_541, f_542).m_828(f_543).m_822(() -> this.f_510.m_7568(f_638));
      this.f_514 = new SliderSetting(f_544, f_545, f_546, f_547).m_828(f_548).m_822(() -> this.f_510.m_7568(f_637));
      this.f_515 = new SliderSetting(f_549, f_550, f_551, f_552).m_828(f_553).m_822(this.f_511::m_8768);
      this.f_516 = new SliderSetting(f_554, f_555, f_556, f_557).m_828(1.0F).m_822(this.f_511::m_8768);
      this.f_517 = new SliderSetting(f_558, f_559, f_560, f_561)
         .m_828(f_562)
         .m_822(() -> (this.f_510.m_7568(f_635) || this.f_510.m_7568(f_636)) && this.f_511.m_8768());
      this.f_518 = new CheckboxSetting(f_563, true);
      this.f_519 = new SliderSetting(f_564, f_565, 2.0F, f_566).m_828(f_567).m_822(this.f_518::m_8768);
      this.f_520 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_568)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_569))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_570))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2722();
      this.f_521 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_571)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_572))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_573))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2722();
      this.f_522 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_574)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_575))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_576))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_577, UniformType.UNIFORM_BUFFER)
         .m_2741(f_578)
         .m_2722();
      this.f_523 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_579)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_580))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_581))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_582, UniformType.UNIFORM_BUFFER)
         .m_2741(f_583)
         .m_2722();
      this.f_525 = f_584;
      this.f_527 = this::m_875;
      this.m_795(this.f_510, this.f_511, this.f_512, this.f_513, this.f_514, this.f_515, this.f_516, this.f_517, this.f_518, this.f_519);
   }

   private void m_878() {
      this.f_524 = null;
      this.f_525 = f_627;
   }

   private void m_879(AABB var1) {
      long var2 = System.nanoTime();
      if (!this.f_518.m_8768()) {
         this.f_524 = var1;
         this.f_525 = var2;
      } else if (this.f_524 != null && this.f_525 >= 0L) {
         double var4 = (var2 - this.f_525) / f_626;
         this.f_525 = var2;
         double var6 = this.f_519.m_8768().floatValue();
         double var8 = 1.0 - Math.exp(-var6 * Math.max(0.0, var4));
         this.f_524 = new AABB(
            m_861(this.f_524.minX, var1.minX, var8),
            m_861(this.f_524.minY, var1.minY, var8),
            m_861(this.f_524.minZ, var1.minZ, var8),
            m_861(this.f_524.maxX, var1.maxX, var8),
            m_861(this.f_524.maxY, var1.maxY, var8),
            m_861(this.f_524.maxZ, var1.maxZ, var8)
         );
      } else {
         this.f_524 = var1;
         this.f_525 = var2;
      }
   }
}
