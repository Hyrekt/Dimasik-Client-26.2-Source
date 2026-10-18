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
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.MeshData.DrawState;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.ColorSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_54SEkpqYjEsUMrjI;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_PoKta0VE7AdhY1En;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_g3Fg4YmMuzK7loFX;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_h78PE30BIJJYoUEk;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Vector4f;

public final class HoleESP extends Module {
   private static final Direction[] f_32314 = Direction.values();
   private static final int f_32315 = 5;
   private static final int f_32316 = 48;
   private static final int f_32317 = 24;
   private final SliderSetting f_32318;
   private final SliderSetting f_32319;
   private final ColorSetting f_32320;
   private final ColorSetting f_32321;
   private final SliderSetting f_32322;
   private final List<HoleESP.Mx71B8Pe1yxT5BPt> f_32323;
   private int f_32324;
   private final RenderPipeline f_32325;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_32326;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_32327;
   private static final String f_32328 = "HoleESP";
   private static final String f_32329 = "Позиции под кристалл и обсидиан";
   private static final String f_32330 = "Кол-во лунок";
   private static final float f_32331 = 20.0F;
   private static final float f_32332 = 64.0F;
   private static final String f_32333 = "Радиус";
   private static final float f_32334 = 12.0F;
   private static final float f_32335 = 4.0F;
   private static final float f_32336 = 24.0F;
   private static final String f_32337 = "Благоприятный";
   private static final int f_32338 = -14090476;
   private static final String f_32339 = "Отрицательный";
   private static final int f_32340 = -55256;
   private static final String f_32341 = "Кол-во Для обсидиана";
   private static final float f_32342 = 3.0F;
   private static final String f_32343 = "dimasik/hole_esp";
   private static final String f_32344 = "target_esp_crystal";
   private static final String f_32345 = "target_esp_crystal";
   private static final double f_32346 = 0.5;
   private static final double f_32347 = 0.5;
   private static final float f_32348 = 0.55F;
   private static final float f_32349 = 0.5F;
   private static final float f_32350 = 0.75F;
   private static final float f_32351 = 0.05F;
   private static final float f_32352 = 0.05F;
   private static final float f_32353 = 0.95F;
   private static final float f_32354 = 0.95F;
   private static final float f_32355 = 0.95F;
   private static final float f_32356 = 0.08F;
   private static final float f_32357 = 0.92F;
   private static final float f_32358 = 0.08F;
   private static final float f_32359 = 0.92F;
   private static final float f_32360 = 1.12F;
   private static final float f_32361 = 0.92F;
   private static final float f_32362 = 0.5F;
   private static final float f_32363 = 0.5F;
   private static final float f_32364 = 0.5F;
   private static final float f_32365 = 0.4F;
   private static final float f_32366 = 0.32F;
   private static final float f_32367 = 0.08F;
   private static final float f_32368 = 0.35F;
   private static final float f_32369 = 0.88F;
   private static final float f_32370 = 0.85F;
   private static final float f_32371 = 0.5F;
   private static final float f_32372 = 0.5F;
   private static final float f_32373 = 0.5F;
   private static final float f_32374 = 0.03F;
   private static final float f_32375 = 0.003F;
   private static final float f_32376 = 0.01F;
   private static final float f_32377 = 0.5F;
   private static final float f_32378 = 0.5F;
   private static final float f_32379 = 0.5F;
   private static final float f_32380 = 255.0F;
   private static final String f_32381 = "holeEsp";
   private static final String f_32382 = "holeEspVertices";

   private void m_9019(Class_TZhU50s8XmBQCMP5 var1) {
      if (!this.f_32323.isEmpty() && f_11537.player != null && f_11537.level != null && f_11537.gameRenderer != null) {
         PoseStack var2 = var1.m_5006();
         Vec3 var3 = f_11537.gameRenderer.mainCamera().position();
         BufferBuilder var4 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);

         for (HoleESP.Mx71B8Pe1yxT5BPt var6 : this.f_32323) {
            float var7;
            float var8;
            float var9;
            float var10;
            float var11;
            float var12;
            if (var6.type == HoleESP.Z96c8L8Odng2DqZk.OBSIDIAN) {
               var7 = var6.pos.getX() + f_32351;
               var8 = var6.pos.getY();
               var9 = var6.pos.getZ() + f_32352;
               var10 = var6.pos.getX() + f_32353;
               var11 = var6.pos.getY() + f_32354;
               var12 = var6.pos.getZ() + f_32355;
            } else {
               var7 = var6.pos.getX() + f_32356;
               var8 = var6.pos.getY() + f_32357;
               var9 = var6.pos.getZ() + f_32358;
               var10 = var6.pos.getX() + f_32359;
               var11 = var6.pos.getY() + f_32360;
               var12 = var6.pos.getZ() + f_32361;
            }

            float var13 = var10 - var7;
            float var14 = var11 - var8;
            float var15 = var12 - var9;
            float var16 = (var7 + var10) * f_32362 - (float)var3.x;
            float var17 = (var8 + var11) * f_32363 - (float)var3.y;
            float var18 = (var9 + var12) * f_32364 - (float)var3.z;
            int var19 = var6.favorable ? this.f_32320.m_8768() : this.f_32321.m_8768();
            float var20 = var6.type == HoleESP.Z96c8L8Odng2DqZk.OBSIDIAN ? f_32365 : f_32366;
            int var21 = this.m_9038(this.m_9045(var19, f_32367), var20);
            int var22 = this.m_9038(this.m_9045(var19, f_32368), f_32369);
            var2.pushPose();
            var2.translate(var16, var17, var18);
            Matrix4f var23 = var2.last().pose();
            this.m_9027(var4, var23, var13, var14, var15, var21);
            this.m_9040(var4, var23, var13, var14, var15, var22);
            var2.popPose();
         }

         this.m_9032(var4);
      }
   }

   private void m_9020(BufferBuilder var1, Matrix4f var2, float var3, float var4, float var5, Vector4f var6) {
      var1.addVertex(var2, var3, var4, var5).setUv(0.0F, 0.0F).setColor(var6.x, var6.y, var6.z, var6.w);
   }

   private boolean m_9023(MutableBlockPos var1) {
      int var2 = var1.getX();
      int var3 = var1.getY();
      int var4 = var1.getZ();
      boolean var5 = this.m_9025(f_11537.level.getBlockState(var1.set(var2 + 1, var3, var4)))
         || this.m_9025(f_11537.level.getBlockState(var1.set(var2 - 1, var3, var4)))
         || this.m_9025(f_11537.level.getBlockState(var1.set(var2, var3, var4 + 1)))
         || this.m_9025(f_11537.level.getBlockState(var1.set(var2, var3, var4 - 1)))
         || this.m_9025(f_11537.level.getBlockState(var1.set(var2, var3 - 1, var4)));
      var1.set(var2, var3, var4);
      return var5;
   }

   private void m_9024(List<HoleESP.yGgWBkqGI5zgQJ4G> var1, float var2) {
      if (!var1.isEmpty()) {
         float var3 = 0.0F;
         float var4 = Float.NEGATIVE_INFINITY;

         for (HoleESP.yGgWBkqGI5zgQJ4G var6 : var1) {
            if (!(var6.score.selfDamage() >= var2 - 1.0F)) {
               var3 = Math.max(var3, var6.score.enemyDamage());
               var4 = Math.max(var4, var6.score.value());
            }
         }

         for (int var13 = 0; var13 < var1.size(); var13++) {
            HoleESP.yGgWBkqGI5zgQJ4G var14 = (HoleESP.yGgWBkqGI5zgQJ4G)var1.get(var13);
            HoleESP.u0Kic7Yjhk9PibOE var7 = var14.score;
            boolean var8 = var7.selfDamage() >= var2 - 1.0F;
            boolean var9 = var7.enemyDamage() < 1.0F;
            boolean var10;
            if (!var8 && !var9 && !(var3 <= 0.0F)) {
               boolean var11 = var7.enemyDamage() >= var3 * f_32348;
               boolean var12 = var7.value() >= var4 * f_32349 || var7.enemyDamage() >= var7.selfDamage() * f_32350;
               var10 = var11 && var12;
            } else {
               var10 = false;
            }

            var1.set(
               var13,
               new HoleESP.yGgWBkqGI5zgQJ4G(var14.pos, var14.type, new HoleESP.u0Kic7Yjhk9PibOE(var10, var7.value(), var7.enemyDamage(), var7.selfDamage()))
            );
         }
      }
   }

   private boolean m_9025(BlockState var1) {
      return var1.is(Blocks.OBSIDIAN) || var1.is(Blocks.BEDROCK);
   }

   private void m_9027(BufferBuilder var1, Matrix4f var2, float var3, float var4, float var5, int var6) {
      Vector4f var7 = Class_BftdentXEtGbugJw.m_2298(var6);
      float var8 = var3 * f_32377;
      float var9 = var4 * f_32378;
      float var10 = var5 * f_32379;
      this.m_9042(var1, var2, -var8, -var9, var10, -var8, var9, var10, var8, var9, var10, var8, -var9, var10, var7);
      this.m_9042(var1, var2, var8, -var9, -var10, var8, var9, -var10, -var8, var9, -var10, -var8, -var9, -var10, var7);
      this.m_9042(var1, var2, -var8, var9, var10, -var8, var9, -var10, var8, var9, -var10, var8, var9, var10, var7);
      this.m_9042(var1, var2, -var8, -var9, -var10, -var8, -var9, var10, var8, -var9, var10, var8, -var9, -var10, var7);
      this.m_9042(var1, var2, var8, -var9, var10, var8, var9, var10, var8, var9, -var10, var8, -var9, -var10, var7);
      this.m_9042(var1, var2, -var8, -var9, -var10, -var8, var9, -var10, -var8, var9, var10, -var8, -var9, var10, var7);
   }

   private boolean m_9030() {
      return Class_h78PE30BIJJYoUEk.m_7068(Items.OBSIDIAN) == -1 && Class_h78PE30BIJJYoUEk.m_7068(Items.END_CRYSTAL) == -1
         ? f_11537.player.getOffhandItem().is(Items.OBSIDIAN) || f_11537.player.getOffhandItem().is(Items.END_CRYSTAL)
         : true;
   }

   private void m_9031(
      BlockPos var1,
      int var2,
      int var3,
      Vec3 var4,
      double var5,
      Set<Long> var7,
      List<HoleESP.U4eocUQ7ZtP75x9R> var8,
      List<HoleESP.U4eocUQ7ZtP75x9R> var9,
      MutableBlockPos var10,
      MutableBlockPos var11
   ) {
      for (int var12 = -var2; var12 <= var2; var12++) {
         for (int var13 = -var3; var13 <= var3; var13++) {
            for (int var14 = -var2; var14 <= var2; var14++) {
               var10.set(var1.getX() + var12, var1.getY() + var13, var1.getZ() + var14);
               long var15 = BlockPos.asLong(var10.getX(), var10.getY(), var10.getZ());
               if (var7.add(var15)) {
                  double var17 = var10.getX() + f_32346;
                  double var19 = var10.getY() + 1.0;
                  double var21 = var10.getZ() + f_32347;
                  if (!(var4.distanceToSqr(var17, var19, var21) > var5)) {
                     BlockState var23 = f_11537.level.getBlockState(var10);
                     var11.set(var10.getX(), var10.getY() + 1, var10.getZ());
                     if (this.m_9025(var23)) {
                        if (f_11537.level.isEmptyBlock(var11)) {
                           var8.add(new HoleESP.U4eocUQ7ZtP75x9R(var10.immutable(), new Vec3(var17, var19, var21)));
                        }
                     } else if (var23.canBeReplaced() && f_11537.level.isEmptyBlock(var11) && this.m_9023(var10) && this.m_9046(var10)) {
                        var9.add(new HoleESP.U4eocUQ7ZtP75x9R(var10.immutable(), new Vec3(var17, var19, var21)));
                     }
                  }
               }
            }
         }
      }
   }

   public HoleESP() {
      super(f_32328, f_32329, Category.RENDER);
      this.f_32318 = new SliderSetting(f_32330, f_32331, 1.0F, f_32332).m_828(1.0F);
      this.f_32319 = new SliderSetting(f_32333, f_32334, f_32335, f_32336).m_828(1.0F);
      this.f_32320 = new ColorSetting(f_32337, false, f_32338);
      this.f_32321 = new ColorSetting(f_32339, false, f_32340);
      this.f_32322 = new SliderSetting(f_32341, 2.0F, 1.0F, f_32342).m_828(1.0F);
      this.f_32323 = new ArrayList<>();
      this.f_32325 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_32343)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_32344))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_32345))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2722();
      this.f_32326 = this::m_9041;
      this.f_32327 = this::m_9019;
      this.m_795(this.f_32318, this.f_32319, this.f_32320, this.f_32321, this.f_32322);
   }

   private void m_9032(BufferBuilder var1) {
      MeshData var2 = var1.build();
      if (var2 != null) {
         GpuBuffer var3 = null;

         try {
            DrawState var4 = var2.drawState();
            int var5 = var4.indexCount();
            if (var5 > 0) {
               AutoStorageIndexBuffer var6 = RenderSystem.getSequentialBuffer(var4.primitiveTopology());
               GpuBuffer var7 = var6.getBuffer(var5);
               IndexType var8 = var6.type();
               var3 = RenderSystem.getDevice().createBuffer(() -> f_32382, 32, var2.vertexBuffer());
               CommandEncoder var9 = RenderSystem.getDevice().createCommandEncoder();
               RenderTarget var10 = f_11537.gameRenderer.mainRenderTarget();
               RenderPass var11 = var9.createRenderPass(
                  () -> f_32381, var10.getColorTextureView(), Optional.empty(), var10.getDepthTextureView(), OptionalDouble.empty()
               );

               try {
                  RenderSystem.bindDefaultUniforms(var11);
                  var11.setPipeline(this.f_32325);
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

               return;
            }
         } finally {
            if (var3 != null) {
               var3.close();
            }

            var2.close();
         }
      }
   }

   private void m_9033(BufferBuilder var1, Matrix4f var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      this.m_9027(var1, new Matrix4f(var2).translate(var3, var4, var5), var6, var7, var8, var9);
   }

   @Override
   public void m_732() {
      this.f_32323.clear();
      this.f_32324 = 0;
   }

   private int m_9036(int var1, int var2, int var3, int var4) {
      return var4 << 24 | var1 << 16 | var2 << 8 | var3;
   }

   private int m_9038(int var1, float var2) {
      return this.m_9036(
         Class_BftdentXEtGbugJw.m_2309(var1),
         Class_BftdentXEtGbugJw.m_2299(var1),
         Class_BftdentXEtGbugJw.m_2308(var1),
         Math.round(f_32380 * Mth.clamp(var2, 0.0F, 1.0F))
      );
   }

   private List<LivingEntity> m_9039() {
      ArrayList<LivingEntity> var1 = new ArrayList<>(4);
      ArrayList<LivingEntity> var2 = new ArrayList<>(2);
      float var3 = this.f_32319.m_8768() + 2.0F;

      for (Player var5 : f_11537.level.players()) {
         if (var5 != f_11537.player
            && var5.isAlive()
            && !var5.isSpectator()
            && !DimasikClient.m_9057().m_9049().m_2801().m_3581().f_33163.contains(var5)
            && !(var5.distanceTo(f_11537.player) > var3)) {
            if (DimasikClient.m_9057().m_9049().m_2804().m_2877(var5.getName().getString())) {
               var2.add(var5);
            } else {
               var1.add(var5);
            }
         }
      }

      ArrayList<LivingEntity> var6 = var1.isEmpty() ? var2 : var1;
      var6.sort(Comparator.comparingDouble(var0 -> var0.distanceToSqr(f_11537.player)));
      return var6.size() > 2 ? var6.subList(0, 2) : var6;
   }

   private void m_9040(BufferBuilder var1, Matrix4f var2, float var3, float var4, float var5, int var6) {
      float var7 = var3 * f_32371;
      float var8 = var4 * f_32372;
      float var9 = var5 * f_32373;
      float var10 = Mth.clamp(Math.min(var3, var5) * f_32374, f_32375, f_32376);

      for (int var11 = -1; var11 <= 1; var11 += 2) {
         for (int var12 = -1; var12 <= 1; var12 += 2) {
            this.m_9033(var1, var2, 0.0F, var11 * var8, var12 * var9, var3 + var10, var10, var10, var6);
         }
      }

      for (int var13 = -1; var13 <= 1; var13 += 2) {
         for (int var15 = -1; var15 <= 1; var15 += 2) {
            this.m_9033(var1, var2, var13 * var7, 0.0F, var15 * var9, var10, var4 + var10, var10, var6);
         }
      }

      for (int var14 = -1; var14 <= 1; var14 += 2) {
         for (int var16 = -1; var16 <= 1; var16 += 2) {
            this.m_9033(var1, var2, var14 * var7, var16 * var8, 0.0F, var10, var10, var5 + var10, var6);
         }
      }
   }

   private void m_9041(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player == null || f_11537.level == null) {
         this.f_32323.clear();
      } else if (!this.m_9030()) {
         this.f_32323.clear();
      } else if (++this.f_32324 % 5 == 0) {
         List var2 = this.m_9039();
         LivingEntity var3 = var2.isEmpty() ? null : (LivingEntity)var2.getFirst();
         BlockPos var4 = f_11537.player.blockPosition();
         int var5 = Math.min(Math.round(this.f_32319.m_8768()), 16);
         double var6 = this.f_32319.m_8768() * this.f_32319.m_8768();
         Vec3 var8 = f_11537.player.getEyePosition();
         float var9 = Class_g3Fg4YmMuzK7loFX.m_6757(f_11537.player);
         ArrayList<HoleESP.U4eocUQ7ZtP75x9R> var10 = new ArrayList<>();
         ArrayList<HoleESP.U4eocUQ7ZtP75x9R> var11 = new ArrayList<>();
         HashSet var12 = new HashSet();
         MutableBlockPos var13 = new MutableBlockPos();
         MutableBlockPos var14 = new MutableBlockPos();
         this.m_9031(var4, var5, 3, var8, var6, var12, var10, var11, var13, var14);
         if (var3 != null) {
            this.m_9031(var3.blockPosition(), 5, 2, var8, var6, var12, var10, var11, var13, var14);
         }

         Vec3 var15 = var3 != null ? var3.position() : f_11537.player.position();
         var10.sort(Comparator.comparingDouble(var1x -> var15.distanceToSqr(var1x.crystalCenter)));
         var11.sort(Comparator.comparingDouble(var1x -> var15.distanceToSqr(var1x.crystalCenter)));
         List<HoleESP.yGgWBkqGI5zgQJ4G> var16 = this.m_9044(var10, HoleESP.Z96c8L8Odng2DqZk.CRYSTAL, var2, 48);
         List<HoleESP.yGgWBkqGI5zgQJ4G> var17 = this.m_9044(var11, HoleESP.Z96c8L8Odng2DqZk.OBSIDIAN, var2, 24);
         this.m_9024(var16, var9);
         this.m_9024(var17, var9);
         var16.sort(
            Comparator.<HoleESP.yGgWBkqGI5zgQJ4G, Boolean>comparing(var0 -> !var0.score.favorable())
               .thenComparing(var0 -> -var0.score.enemyDamage())
               .thenComparing(var0 -> -var0.score.value())
         );
         var17.sort(Comparator.<HoleESP.yGgWBkqGI5zgQJ4G, Float>comparing(var0 -> -var0.score.enemyDamage()).thenComparing(var0 -> -var0.score.value()));
         ArrayList var18 = new ArrayList();
         HashSet var19 = new HashSet();
         int var20 = Math.round(this.f_32318.m_8768());

         for (HoleESP.yGgWBkqGI5zgQJ4G var22 : var16) {
            if (var18.size() >= var20) {
               break;
            }

            if (var19.add(var22.pos)) {
               var18.add(new HoleESP.Mx71B8Pe1yxT5BPt(var22.pos, HoleESP.Z96c8L8Odng2DqZk.CRYSTAL, var22.score.favorable()));
            }
         }

         int var25 = Math.round(this.f_32322.m_8768());
         int var26 = 0;

         for (HoleESP.yGgWBkqGI5zgQJ4G var24 : var17) {
            if (var26 >= var25) {
               break;
            }

            if (var19.add(var24.pos)) {
               var18.add(new HoleESP.Mx71B8Pe1yxT5BPt(var24.pos, HoleESP.Z96c8L8Odng2DqZk.OBSIDIAN, var24.score.favorable()));
               var26++;
            }
         }

         this.f_32323.clear();
         this.f_32323.addAll(var18);
      }
   }

   private void m_9042(
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
      Vector4f var15
   ) {
      this.m_9020(var1, var2, var3, var4, var5, var15);
      this.m_9020(var1, var2, var6, var7, var8, var15);
      this.m_9020(var1, var2, var9, var10, var11, var15);
      this.m_9020(var1, var2, var12, var13, var14, var15);
   }

   private HoleESP.u0Kic7Yjhk9PibOE m_9043(Vec3 var1, List<LivingEntity> var2) {
      float var3 = Class_54SEkpqYjEsUMrjI.m_1398(var1, f_11537.player);
      float var4 = 0.0F;
      int var5 = Math.min(var2.size(), 2);

      for (int var6 = 0; var6 < var5; var6++) {
         var4 = Math.max(var4, Class_54SEkpqYjEsUMrjI.m_1398(var1, (Entity)var2.get(var6)));
      }

      return new HoleESP.u0Kic7Yjhk9PibOE(false, var4 - var3 * f_32370, var4, var3);
   }

   private List<HoleESP.yGgWBkqGI5zgQJ4G> m_9044(List<HoleESP.U4eocUQ7ZtP75x9R> var1, HoleESP.Z96c8L8Odng2DqZk var2, List<LivingEntity> var3, int var4) {
      ArrayList var5 = new ArrayList(Math.min(var1.size(), var4));
      int var6 = Math.min(var1.size(), var4);

      for (int var7 = 0; var7 < var6; var7++) {
         HoleESP.U4eocUQ7ZtP75x9R var8 = (HoleESP.U4eocUQ7ZtP75x9R)var1.get(var7);
         var5.add(new HoleESP.yGgWBkqGI5zgQJ4G(var8.pos, var2, this.m_9043(var8.crystalCenter, var3)));
      }

      return var5;
   }

   private int m_9045(int var1, float var2) {
      return this.m_9036(
         Math.round(Mth.lerpInt(var2, Class_BftdentXEtGbugJw.m_2309(var1), 255)),
         Math.round(Mth.lerpInt(var2, Class_BftdentXEtGbugJw.m_2299(var1), 255)),
         Math.round(Mth.lerpInt(var2, Class_BftdentXEtGbugJw.m_2308(var1), 255)),
         255
      );
   }

   private boolean m_9046(MutableBlockPos var1) {
      int var2 = var1.getX();
      int var3 = var1.getY();
      int var4 = var1.getZ();

      for (Direction var8 : f_32314) {
         BlockState var9 = f_11537.level.getBlockState(var1.set(var2 + var8.getStepX(), var3 + var8.getStepY(), var4 + var8.getStepZ()));
         if (!var9.canBeReplaced() && !var9.getCollisionShape(f_11537.level, var1).isEmpty()) {
            var1.set(var2, var3, var4);
            return true;
         }
      }

      var1.set(var2, var3, var4);
      return false;
   }

   private record Mx71B8Pe1yxT5BPt(BlockPos pos, HoleESP.Z96c8L8Odng2DqZk type, boolean favorable) {
   }

   private record U4eocUQ7ZtP75x9R(BlockPos pos, Vec3 crystalCenter) {
   }

   private enum Z96c8L8Odng2DqZk {
      CRYSTAL,
      OBSIDIAN;
   }

   private record u0Kic7Yjhk9PibOE(boolean favorable, float value, float enemyDamage, float selfDamage) {
   }

   private record yGgWBkqGI5zgQJ4G(BlockPos pos, HoleESP.Z96c8L8Odng2DqZk type, HoleESP.u0Kic7Yjhk9PibOE score) {
   }
}
