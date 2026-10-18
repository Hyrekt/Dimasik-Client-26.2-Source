package dev.dimasik.client.system;

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
import dev.dimasik.client.module.render.Rain;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Random;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.core.Direction.Axis;
import net.minecraft.util.Mth;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.joml.FrustumIntersection;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public final class Class_DcCQ4WatKHyfGvHx implements Class_NzJrN63M7QBpmAbi {
   private static final String f_6485 = "surface_butterfly";
   private static final int f_6486 = 72;
   private static final int f_6487 = 180;
   private static final int f_6488 = 6;
   private static final Direction[] f_6489 = Direction.values();
   private final RenderPipeline f_6490;
   private final List<Class_DcCQ4WatKHyfGvHx.CUP1LmVN4EiPUaot> f_6491 = new ArrayList<>();
   private final Random f_6492 = new Random();
   private final MutableBlockPos f_6493 = new MutableBlockPos();
   private final FrustumIntersection f_6494 = new FrustumIntersection();
   private final Matrix4f f_6495 = new Matrix4f();
   private final Vector3f f_6496 = new Vector3f();
   private final Vector3f f_6497 = new Vector3f();
   private ClientLevel f_6498;
   private Vec3 f_6499;
   private GpuBuffer f_6500;
   private int f_6501;
   private int f_6502;
   private int f_6503;
   private static final String f_6504 = "dimasik/surface_butterfly";
   private static final String f_6505 = "surface_particle";
   private static final String f_6506 = "surface_butterfly";
   private static final float f_6507 = 4.0F;
   private static final float f_6508 = 72.0F;
   private static final float f_6509 = 64.0F;
   private static final double f_6510 = 2.0;
   private static final double f_6511 = 2.0;
   private static final double f_6512 = 2.0;
   private static final double f_6513 = 0.12;
   private static final double f_6514 = 0.76;
   private static final double f_6515 = 0.12;
   private static final double f_6516 = 0.76;
   private static final double f_6517 = 0.12;
   private static final double f_6518 = 0.76;
   private static final double f_6519 = 0.025;
   private static final double f_6520 = 0.35;
   private static final double f_6521 = Math.PI;
   private static final double f_6522 = 2.0;
   private static final float f_6523 = 0.13F;
   private static final float f_6524 = 0.1F;
   private static final float f_6525 = 180.0F;
   private static final float f_6526 = 0.75F;
   private static final float f_6527 = 0.5F;
   private static final float f_6528 = (float) (Math.PI * 2);
   private static final double f_6529 = 0.17;
   private static final double f_6530 = 0.5;
   private static final double f_6531 = Math.PI;
   private static final double f_6532 = 0.12;
   private static final double f_6533 = 0.075;
   private static final double f_6534 = 0.55;
   private static final double f_6535 = 0.06;
   private static final float f_6536 = 14.0F;
   private static final float f_6537 = 22.0F;
   private static final float f_6538 = 12.0F;
   private static final double f_6539 = 2.0;
   private static final double f_6540 = 0.2;
   private static final double f_6541 = 0.6;
   private static final float f_6542 = 0.005F;
   private static final float f_6543 = 3.0F;
   private static final float f_6544 = 0.5F;
   private static final float f_6545 = 0.5F;
   private static final float f_6546 = 255.0F;
   private static final float f_6547 = 255.0F;
   private static final float f_6548 = 255.0F;
   private static final float f_6549 = 0.25F;
   private static final float f_6550 = 0.7F;
   private static final float f_6551 = 0.5F;
   private static final float f_6552 = 0.5F;
   private static final float f_6553 = 0.6F;
   private static final double f_6554 = 0.82;
   private static final float f_6555 = 0.5F;
   private static final float f_6556 = 0.5F;
   private static final float f_6557 = 0.22F;
   private static final float f_6558 = 0.28F;
   private static final float f_6559 = 0.72F;
   private static final double f_6560 = 1.9;
   private static final double f_6561 = 1.9;
   private static final float f_6562 = 4.0F;
   private static final float f_6563 = 5.0F;
   private static final float f_6564 = 0.2F;
   private static final float f_6565 = 0.18F;
   private static final double f_6566 = 0.004;
   private static final double f_6567 = 0.085;
   private static final double f_6568 = 0.65;
   private static final float f_6569 = 3.0F;
   private static final float f_6570 = 0.01F;
   private static final float f_6571 = 0.18F;
   private static final float f_6572 = 1.7F;
   private static final float f_6573 = 6.0F;
   private static final float f_6574 = -1.25F;
   private static final float f_6575 = 2.5F;
   private static final float f_6576 = (float) Math.PI;
   private static final float f_6577 = 2.17F;
   private static final float f_6578 = 1.43F;
   private static final float f_6579 = 0.7F;
   private static final double f_6580 = 0.3;
   private static final double f_6581 = 0.18;
   private static final double f_6582 = 1.12;
   private static final double f_6583 = 0.12;
   private static final double f_6584 = 0.2;
   private static final double f_6585 = 0.16;
   private static final float f_6586 = 1.9F;
   private static final float f_6587 = 0.12F;
   private static final float f_6588 = 0.88F;
   private static final double f_6589 = 0.12;
   private static final double f_6590 = 0.45;
   private static final double f_6591 = 0.24;
   private static final double f_6592 = 0.45;
   private static final double f_6593 = 0.24;
   private static final double f_6594 = 0.45;
   private static final double f_6595 = 0.24;
   private static final double f_6596 = 0.22;
   private static final double f_6597 = 0.4;
   private static final double f_6598 = 0.22;
   private static final double f_6599 = 0.4;
   private static final double f_6600 = 0.22;
   private static final double f_6601 = 0.4;
   private static final double f_6602 = 0.09;
   private static final float f_6603 = 0.7F;
   private static final float f_6604 = 0.4F;
   private static final double f_6605 = 0.07;
   private static final float f_6606 = 0.4F;
   private static final double f_6607 = 1.0E-12;
   private static final float f_6608 = 6.0F;
   private static final float f_6609 = 6.0F;
   private static final float f_6610 = 7.0F;
   private static final float f_6611 = 7.0F;
   private static final String f_6612 = "surface_butterfly";
   private static final String f_6613 = "surface_butterfly";

   private void m_2465(
      BufferBuilder var1,
      Matrix4f var2,
      double var3,
      double var5,
      double var7,
      double var9,
      double var11,
      double var13,
      double var15,
      float var17,
      float var18,
      float var19,
      float var20,
      float var21
   ) {
      double var22 = var9 - var3;
      double var24 = var11 - var5;
      double var26 = var13 - var7;
      double var28 = var24 * var7 - var26 * var5;
      double var30 = var26 * var3 - var22 * var7;
      double var32 = var22 * var5 - var24 * var3;
      double var34 = var28 * var28 + var30 * var30 + var32 * var32;
      if (!(var34 < f_6607)) {
         double var36 = var15 / Math.sqrt(var34);
         var28 *= var36;
         var30 *= var36;
         var32 *= var36;
         this.m_2476(var1, var2, var3 - var28, var5 - var30, var7 - var32, f_6608, 0.0F, var17, var18, var19, var20);
         this.m_2476(var1, var2, var3 + var28, var5 + var30, var7 + var32, f_6609, 1.0F, var17, var18, var19, var20);
         this.m_2476(var1, var2, var9 + var28, var11 + var30, var13 + var32, f_6610, 1.0F, var17, var18, var19, var21);
         this.m_2476(var1, var2, var9 - var28, var11 - var30, var13 - var32, f_6611, 0.0F, var17, var18, var19, var21);
      }
   }

   private void m_2466(
      BufferBuilder var1, Matrix4f var2, Vec3 var3, Vec3 var4, Vec3 var5, float var6, float var7, float var8, float var9, float var10, float var11
   ) {
      this.m_2477(var1, var2, var3.subtract(var4).subtract(var5), var6, 0.0F, var8, var9, var10, var11);
      this.m_2477(var1, var2, var3.subtract(var4).add(var5), var6, 1.0F, var8, var9, var10, var11);
      this.m_2477(var1, var2, var3.add(var4).add(var5), var7, 1.0F, var8, var9, var10, var11);
      this.m_2477(var1, var2, var3.add(var4).subtract(var5), var7, 0.0F, var8, var9, var10, var11);
   }

   private void m_2467(BufferBuilder var1, Matrix4f var2, Vec3 var3, Vec3 var4, Vec3 var5, float var6, float var7, float var8, float var9) {
      this.m_2477(var1, var2, var3.subtract(var5), 0.0F, 0.0F, var6, var7, var8, var9);
      this.m_2477(var1, var2, var3.add(var5), 0.0F, 1.0F, var6, var7, var8, var9);
      this.m_2477(var1, var2, var3.add(var4).add(var5), 1.0F, 1.0F, var6, var7, var8, var9);
      this.m_2477(var1, var2, var3.add(var4).subtract(var5), 1.0F, 0.0F, var6, var7, var8, var9);
   }

   public void m_2468() {
      this.f_6491.clear();
      this.f_6498 = null;
      this.f_6499 = null;
      this.f_6502 = 0;
      if (this.f_6500 != null) {
         this.f_6500.close();
         this.f_6500 = null;
      }

      this.f_6501 = 0;
   }

   public void m_2469(float var1, float var2) {
      if (f_11537.level != null && f_11537.player != null) {
         Vec3 var3 = f_11537.gameRenderer.mainCamera().position();
         if (this.f_6498 != f_11537.level || this.f_6499 != null && this.f_6499.distanceToSqr(var3) > var1 * var1 * f_6507) {
            this.m_2468();
            this.f_6498 = f_11537.level;
         }

         this.f_6499 = var3;
         this.f_6502++;
         int var4 = Math.round(f_6508 * var2);
         Iterator var5 = this.f_6491.iterator();

         while (var5.hasNext()) {
            Class_DcCQ4WatKHyfGvHx.CUP1LmVN4EiPUaot var6 = (Class_DcCQ4WatKHyfGvHx.CUP1LmVN4EiPUaot)var5.next();
            if (this.f_6502 - var6.f_6479 < var6.f_6480 && (var6.f_6483 < 0 || this.f_6502 - var6.f_6483 < 12)) {
               if (var6.f_6483 < 0
                  && (
                     var6.f_6475.distanceToSqr(var3) > (var1 + 2.0F) * (var1 + 2.0F)
                        || !this.f_6498.getBlockState(var6.f_6473).equals(var6.f_6474)
                        || this.m_2470(this.m_2474(var6, this.f_6502))
                  )) {
                  var6.f_6483 = this.f_6502;
               }
            } else {
               var5.remove();
            }
         }

         if (this.f_6491.size() < var4) {
            int var8 = Math.round(f_6509 * var2);
            int var7 = 0;

            while (var8-- > 0 && var7 < 5 && this.f_6491.size() < var4) {
               if (this.m_2473(var3, var1)) {
                  var7++;
               }
            }
         }
      } else {
         this.m_2468();
      }
   }

   private boolean m_2470(Vec3 var1) {
      BlockPos var2 = BlockPos.containing(var1);
      if (!this.f_6498.hasChunkAt(var2)) {
         return true;
      }

      VoxelShape var3 = this.f_6498.getBlockState(var2).getShape(this.f_6498, var2);
      if (var3.isEmpty()) {
         return false;
      }

      double var4 = var1.x - var2.getX();
      double var6 = var1.y - var2.getY();
      double var8 = var1.z - var2.getZ();

      for (AABB var11 : var3.toAabbs()) {
         if (var4 > var11.minX && var4 < var11.maxX && var6 > var11.minY && var6 < var11.maxY && var8 > var11.minZ && var8 < var11.maxZ) {
            return true;
         }
      }

      return false;
   }

   public void m_2471(Class_TZhU50s8XmBQCMP5 var1, float var2) {
      if (f_11537.level != null && this.f_6498 == f_11537.level && f_11537.player != null && !this.f_6491.isEmpty() && !Rain.m_6679()) {
         float var3 = this.f_6502 + var1.m_5005().getGameTimeDeltaPartialTick(false);
         Vec3 var4 = f_11537.gameRenderer.mainCamera().position();
         int var5 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
         int var6 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN_TWO);
         Matrix4f var7 = var1.m_5006().last().pose();
         this.f_6494.set(this.f_6495.set(var1.m_5009()).mul(var7));
         this.f_6496.set(1.0F, 0.0F, 0.0F).rotate(f_11537.gameRenderer.mainCamera().rotation());
         this.f_6497.set(0.0F, 1.0F, 0.0F).rotate(f_11537.gameRenderer.mainCamera().rotation());
         Vec3 var8 = new Vec3(this.f_6496.x, this.f_6496.y, this.f_6496.z);
         Vec3 var9 = new Vec3(this.f_6497.x, this.f_6497.y, this.f_6497.z);
         BufferBuilder var10 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);

         for (Class_DcCQ4WatKHyfGvHx.CUP1LmVN4EiPUaot var12 : this.f_6491) {
            float var13 = var3 - var12.f_6479;
            float var14 = Math.clamp(var13 / f_6536, 0.0F, 1.0F) * Math.clamp((var12.f_6480 - var13) / f_6537, 0.0F, 1.0F);
            if (var12.f_6483 >= 0) {
               var14 *= Math.clamp(1.0F - (var3 - var12.f_6483) / f_6538, 0.0F, 1.0F);
            }

            Vec3 var15 = this.m_2474(var12, var3).subtract(var4);
            double var16 = var15.length();
            var14 *= Math.clamp((float)((var2 + 1.0F - var16) / f_6539), 0.0F, 1.0F);
            var14 *= Math.clamp((float)((var16 - f_6540) / f_6541), 0.0F, 1.0F);
            if (!(var14 <= f_6542) && this.f_6494.testSphere((float)var15.x, (float)var15.y, (float)var15.z, var12.f_6481 * f_6543)) {
               int var18 = Class_BftdentXEtGbugJw.m_2302(var5, var6, f_6544 + f_6545 * Mth.sin(var12.f_6482));
               float var19 = Class_BftdentXEtGbugJw.m_2309(var18) / f_6546;
               float var20 = Class_BftdentXEtGbugJw.m_2299(var18) / f_6547;
               float var21 = Class_BftdentXEtGbugJw.m_2308(var18) / f_6548;
               float var22 = f_6549 + f_6550 * (f_6551 + f_6552 * Mth.sin(var13 * f_6553 + var12.f_6482));
               Vec3 var23 = var12.f_6477.scale(Math.cos(var22) * var12.f_6481);
               Vec3 var24 = var12.f_6476.scale(Math.sin(var22) * var12.f_6481);
               Vec3 var25 = var12.f_6478.scale(var12.f_6481 * f_6554);
               float var26 = f_6555 + f_6556 * Mth.sin(var13 * f_6557 + var12.f_6482 * 2.0F);
               float var27 = var26 * var26 * var26;
               float var28 = var14 * (f_6558 + f_6559 * var27);
               this.m_2466(
                  var10,
                  var7,
                  var15,
                  var8.scale(var12.f_6481 * f_6560),
                  var9.scale(var12.f_6481 * f_6561),
                  f_6562,
                  f_6563,
                  var19,
                  var20,
                  var21,
                  var14 * (f_6564 + f_6565 * var27)
               );
               this.m_2467(var10, var7, var15, var23.add(var24), var25, var19, var20, var21, var14);
               this.m_2467(var10, var7, var15, var23.reverse().add(var24), var25, var19, var20, var21, var14);
               this.m_2466(
                  var10,
                  var7,
                  var15.add(var12.f_6476.scale(f_6566)),
                  var12.f_6477.scale(var12.f_6481 * f_6567),
                  var12.f_6478.scale(var12.f_6481 * f_6568),
                  2.0F,
                  f_6569,
                  var19,
                  var20,
                  var21,
                  var14
               );
               if (var28 > f_6570) {
                  this.m_2472(var10, var7, var15, var12, var13, 1, var19, var20, var21, var28);
                  this.m_2472(var10, var7, var15, var12, var13, -1, var19, var20, var21, var28);
               }
            }
         }

         this.m_2475(var10);
      }
   }

   private void m_2472(
      BufferBuilder var1,
      Matrix4f var2,
      Vec3 var3,
      Class_DcCQ4WatKHyfGvHx.CUP1LmVN4EiPUaot var4,
      float var5,
      int var6,
      float var7,
      float var8,
      float var9,
      float var10
   ) {
      double var11 = 0.0;
      double var13 = 0.0;
      double var15 = 0.0;
      float var17 = 0.0F;
      float var18 = var5 * f_6571 + var4.f_6482 + var6 * f_6572;

      for (int var19 = 0; var19 <= 6; var19++) {
         float var20 = var19 / f_6573;
         float var21 = f_6574 + var20 * f_6575;
         float var22 = Mth.sin(var20 * f_6576);
         float var23 = Mth.sin(var19 * f_6577 + var18) * Mth.sin(var19 * f_6578 - var18 * f_6579);
         double var24 = var6 * var4.f_6481 * (f_6580 + Mth.cos(var21) + var23 * f_6581 * var22);
         double var26 = var4.f_6481 * (Mth.sin(var21) * f_6582 + var23 * f_6583 * var22);
         double var28 = var4.f_6481 * (f_6584 + f_6585 * Mth.sin(var18 + var19 * f_6586));
         double var30 = var3.x + var4.f_6477.x * var24 + var4.f_6478.x * var26 + var4.f_6476.x * var28;
         double var32 = var3.y + var4.f_6477.y * var24 + var4.f_6478.y * var26 + var4.f_6476.y * var28;
         double var34 = var3.z + var4.f_6477.z * var24 + var4.f_6478.z * var26 + var4.f_6476.z * var28;
         float var36 = var10 * (f_6587 + f_6588 * var22);
         if (var19 > 0) {
            this.m_2465(var1, var2, var11, var13, var15, var30, var32, var34, var4.f_6481 * f_6589, var7, var8, var9, var17, var36);
         }

         if (var19 == 3) {
            double var37 = var30 + (var4.f_6477.x * var6 * f_6590 + var4.f_6478.x * f_6591) * var4.f_6481;
            double var39 = var32 + (var4.f_6477.y * var6 * f_6592 + var4.f_6478.y * f_6593) * var4.f_6481;
            double var41 = var34 + (var4.f_6477.z * var6 * f_6594 + var4.f_6478.z * f_6595) * var4.f_6481;
            double var43 = var37 + (var4.f_6477.x * var6 * f_6596 + var4.f_6478.x * f_6597) * var4.f_6481;
            double var45 = var39 + (var4.f_6477.y * var6 * f_6598 + var4.f_6478.y * f_6599) * var4.f_6481;
            double var47 = var41 + (var4.f_6477.z * var6 * f_6600 + var4.f_6478.z * f_6601) * var4.f_6481;
            this.m_2465(var1, var2, var30, var32, var34, var37, var39, var41, var4.f_6481 * f_6602, var7, var8, var9, var10 * f_6603, var10 * f_6604);
            this.m_2465(var1, var2, var37, var39, var41, var43, var45, var47, var4.f_6481 * f_6605, var7, var8, var9, var10 * f_6606, 0.0F);
         }

         var11 = var30;
         var13 = var32;
         var15 = var34;
         var17 = var36;
      }
   }

   private boolean m_2473(Vec3 var1, float var2) {
      int var3 = Mth.floor(var1.x + (this.f_6492.nextDouble() * f_6510 - 1.0) * var2);
      int var4 = Mth.floor(var1.y + (this.f_6492.nextDouble() * f_6511 - 1.0) * var2);
      int var5 = Mth.floor(var1.z + (this.f_6492.nextDouble() * f_6512 - 1.0) * var2);
      this.f_6493.set(var3, var4, var5);
      if (!this.f_6498.hasChunkAt(this.f_6493)) {
         return false;
      }

      BlockState var6 = this.f_6498.getBlockState(this.f_6493);
      if (var6.isAir()) {
         return false;
      }

      VoxelShape var7 = var6.getShape(this.f_6498, this.f_6493);
      if (var7.isEmpty()) {
         return false;
      }

      List var8 = var7.toAabbs();
      AABB var9 = (AABB)var8.get(this.f_6492.nextInt(var8.size()));
      Direction var10 = f_6489[this.f_6503++ % f_6489.length];
      Vec3 var11 = new Vec3(var10.getStepX(), var10.getStepY(), var10.getStepZ());
      double var12 = Mth.lerp(f_6513 + this.f_6492.nextDouble() * f_6514, var9.minX, var9.maxX);
      double var14 = Mth.lerp(f_6515 + this.f_6492.nextDouble() * f_6516, var9.minY, var9.maxY);
      double var16 = Mth.lerp(f_6517 + this.f_6492.nextDouble() * f_6518, var9.minZ, var9.maxZ);
      switch (var10) {
         case DOWN:
            var14 = var9.minY;
            break;
         case UP:
            var14 = var9.maxY;
            break;
         case NORTH:
            var16 = var9.minZ;
            break;
         case SOUTH:
            var16 = var9.maxZ;
            break;
         case WEST:
            var12 = var9.minX;
            break;
         case EAST:
            var12 = var9.maxX;
      }

      Vec3 var18 = new Vec3(var3 + var12, var4 + var14, var5 + var16);
      if (!(var18.distanceToSqr(var1) > var2 * var2) && !this.m_2470(var18.add(var11.scale(f_6519))) && !this.m_2470(var18.add(var11.scale(f_6520)))) {
         Vec3 var19 = var10.getAxis() == Axis.Y ? new Vec3(1.0, 0.0, 0.0) : new Vec3(0.0, 1.0, 0.0);
         Vec3 var20 = var11.cross(var19);
         double var21 = this.f_6492.nextDouble() * f_6521 * f_6522;
         Vec3 var23 = var19.scale(Math.cos(var21)).add(var20.scale(Math.sin(var21)));
         Vec3 var24 = var11.cross(var23);
         float var25 = f_6523 + this.f_6492.nextFloat() * f_6524;
         this.f_6491
            .add(
               new Class_DcCQ4WatKHyfGvHx.CUP1LmVN4EiPUaot(
                  this.f_6493.immutable(),
                  var6,
                  var18,
                  var11,
                  var23,
                  var24,
                  this.f_6502,
                  Math.round(f_6525 * (f_6526 + this.f_6492.nextFloat() * f_6527)),
                  var25,
                  this.f_6492.nextFloat() * f_6528
               )
            );
         return true;
      } else {
         return false;
      }
   }

   private Vec3 m_2474(Class_DcCQ4WatKHyfGvHx.CUP1LmVN4EiPUaot var1, float var2) {
      float var3 = Math.max(0.0F, var2 - var1.f_6479);
      float var4 = var3 / var1.f_6480;
      double var5 = f_6529 + f_6530 * Math.sin(f_6531 * Math.min(1.0F, var4));
      double var7 = f_6532 * Math.sin(var3 * f_6533 + var1.f_6482);
      return var1.f_6475
         .add(var1.f_6476.scale(var5))
         .add(var1.f_6477.scale(var7))
         .add(var1.f_6478.scale(var7 * f_6534 * Math.cos(var3 * f_6535 + var1.f_6482)));
   }

   private void m_2475(BufferBuilder var1) {
      MeshData var2 = var1.build();
      if (var2 != null) {
         MeshData var3 = var2;

         try {
            int var4 = var2.vertexBuffer().remaining();
            if (this.f_6500 == null || this.f_6500.isClosed() || this.f_6501 < var4) {
               if (this.f_6500 != null && !this.f_6500.isClosed()) {
                  this.f_6500.close();
               }

               this.f_6501 = 4096;

               while (this.f_6501 < var4) {
                  this.f_6501 *= 2;
               }

               this.f_6500 = RenderSystem.getDevice().createBuffer(() -> f_6613, 40, this.f_6501);
            }

            CommandEncoder var5 = RenderSystem.getDevice().createCommandEncoder();
            var5.writeToBuffer(this.f_6500.slice(0L, var4), var2.vertexBuffer());
            AutoStorageIndexBuffer var6 = RenderSystem.getSequentialBuffer(PrimitiveTopology.QUADS);
            int var7 = var2.drawState().indexCount();
            GpuBuffer var8 = var6.getBuffer(var7);
            RenderTarget var9 = f_11537.gameRenderer.mainRenderTarget();
            RenderPass var10 = var5.createRenderPass(
               () -> f_6612, var9.getColorTextureView(), Optional.empty(), var9.getDepthTextureView(), OptionalDouble.empty()
            );

            try {
               RenderSystem.bindDefaultUniforms(var10);
               var10.setPipeline(this.f_6490);
               var10.setVertexBuffer(0, this.f_6500.slice());
               var10.setIndexBuffer(var8, var6.type());
               var10.drawIndexed(var7, 1, 0, 0, 0);
            } catch (Throwable var15) {
               if (var10 != null) {
                  try {
                     var10.close();
                  } catch (Throwable var14) {
                     var15.addSuppressed(var14);
                  }
               }

               throw var15;
            }

            if (var10 != null) {
               var10.close();
            }
         } catch (Throwable var16) {
            if (var3 != null) {
               try {
                  var3.close();
               } catch (Throwable var13) {
                  var16.addSuppressed(var13);
               }
            }

            throw var16;
         }

         if (var3 != null) {
            var3.close();
         }
      }
   }

   private void m_2476(
      BufferBuilder var1, Matrix4f var2, double var3, double var5, double var7, float var9, float var10, float var11, float var12, float var13, float var14
   ) {
      var1.addVertex(var2, (float)var3, (float)var5, (float)var7).setUv(var9, var10).setColor(var11, var12, var13, var14);
   }

   public Class_DcCQ4WatKHyfGvHx() {
      this.f_6490 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_6504)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_6505))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_6506))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.LIGHTNING)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2722();
   }

   private void m_2477(BufferBuilder var1, Matrix4f var2, Vec3 var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      this.m_2476(var1, var2, var3.x, var3.y, var3.z, var4, var5, var6, var7, var8, var9);
   }

   private static final class CUP1LmVN4EiPUaot {
      public final BlockPos f_6473;
      public final BlockState f_6474;
      public final Vec3 f_6475;
      public final Vec3 f_6476;
      public final Vec3 f_6477;
      public final Vec3 f_6478;
      public final int f_6479;
      public final int f_6480;
      public final float f_6481;
      public final float f_6482;
      public int f_6483 = -1;

      public CUP1LmVN4EiPUaot(BlockPos var1, BlockState var2, Vec3 var3, Vec3 var4, Vec3 var5, Vec3 var6, int var7, int var8, float var9, float var10) {
         this.f_6473 = var1;
         this.f_6474 = var2;
         this.f_6475 = var3;
         this.f_6476 = var4;
         this.f_6477 = var5;
         this.f_6478 = var6;
         this.f_6479 = var7;
         this.f_6480 = var8;
         this.f_6481 = var9;
         this.f_6482 = var10;
      }
   }
}
