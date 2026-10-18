package dev.dimasik.client.system;

import it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import net.minecraft.client.player.ClientInput;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Input;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LadderBlock;
import net.minecraft.world.level.block.PowderSnowBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class Class_SmEMzWs5Zw5oBieG implements Class_NzJrN63M7QBpmAbi {
   public static final double f_13597 = 50.0;
   public final Player f_13598;
   public final Class_SmEMzWs5Zw5oBieG.kJXwKzbXWIuNXAxh f_13599;
   public Vec3 f_13600;
   public Vec3 f_13601;
   public Vec3 f_13602;
   public AABB f_13603;
   public float f_13604;
   public float f_13605;
   public boolean f_13606;
   public double f_13607;
   public int f_13608;
   public boolean f_13609;
   public boolean f_13610;
   public boolean f_13611;
   public boolean f_13612;
   public boolean f_13613;
   public boolean f_13614;
   public boolean f_13615;
   public boolean f_13616;
   private final Object2DoubleMap<TagKey<Fluid>> f_13617;
   private final HashSet<TagKey<Fluid>> f_13618;
   private int f_13619 = 0;
   private boolean f_13620 = false;
   private Vec3 f_13621;
   private Vec3 f_13622;
   private double f_13623 = 0.0;
   private static final double f_13624 = 0.5;
   private static final double f_13625 = 50.0;
   private static final double f_13626 = 1.0E-4;
   private static final double f_13627 = -70.0;
   private static final double f_13628 = 0.003;
   private static final double f_13629 = 0.003;
   private static final double f_13630 = 0.003;
   private static final float f_13631 = 0.98F;
   private static final float f_13632 = 0.98F;
   private static final double f_13633 = -0.2;
   private static final double f_13634 = 0.085;
   private static final double f_13635 = 0.06;
   private static final double f_13636 = 0.1;
   private static final double f_13637 = 0.08;
   private static final double f_13638 = 0.01;
   private static final float f_13639 = 0.9F;
   private static final float f_13640 = 0.8F;
   private static final float f_13641 = 0.02F;
   private static final float f_13642 = 0.5F;
   private static final float f_13643 = 0.54600006F;
   private static final float f_13644 = 3.0F;
   private static final float f_13645 = 3.0F;
   private static final float f_13646 = 0.96F;
   private static final double f_13647 = 0.2;
   private static final double f_13648 = 0.8;
   private static final double f_13649 = 0.6;
   private static final double f_13650 = 0.3;
   private static final float f_13651 = 0.02F;
   private static final double f_13652 = 0.5;
   private static final double f_13653 = 0.8;
   private static final double f_13654 = 0.5;
   private static final double f_13655 = 0.5;
   private static final double f_13656 = 4.0;
   private static final double f_13657 = 0.6;
   private static final double f_13658 = 0.3;
   private static final double f_13659 = -0.5;
   private static final float f_13660 = (float) (Math.PI / 180.0);
   private static final double f_13661 = 0.4;
   private static final double f_13662 = -1.0;
   private static final double f_13663 = 0.75;
   private static final double f_13664 = -0.1;
   private static final double f_13665 = 0.04;
   private static final double f_13666 = 3.2;
   private static final double f_13667 = 0.1;
   private static final double f_13668 = 0.1;
   private static final double f_13669 = 0.99;
   private static final double f_13670 = 0.98;
   private static final double f_13671 = 0.99;
   private static final float f_13672 = 0.91F;
   private static final float f_13673 = 0.91F;
   private static final double f_13674 = 0.05;
   private static final double f_13675 = 0.2;
   private static final double f_13676 = -0.1;
   private static final double f_13677 = 0.98F;
   private static final double f_13678 = 0.6;
   private static final double f_13679 = 0.2;
   private static final double f_13680 = 1.0E-7;
   private static final float f_13681 = (float) (Math.PI / 180.0);
   private static final float f_13682 = (float) (Math.PI / 180.0);
   private static final double f_13683 = 16.0;
   private static final double f_13684 = 32.0;
   private static final float f_13685 = 0.21600002F;
   private static final float f_13686 = 0.02F;
   private static final float f_13687 = 0.006F;
   private static final float f_13688 = 0.1F;
   private static final double f_13689 = 1.0E-7;
   private static final double f_13690 = 0.2;
   private static final double f_13691 = 0.2;
   private static final double f_13692 = -0.15F;
   private static final double f_13693 = 0.15F;
   private static final double f_13694 = -0.15F;
   private static final double f_13695 = 0.15F;
   private static final double f_13696 = -0.15F;
   private static final double f_13697 = 0.05;
   private static final double f_13698 = -0.5;
   private static final double f_13699 = -0.5;
   private static final double f_13700 = -0.5;
   private static final double f_13701 = 0.5;
   private static final double f_13702 = 0.5;
   private static final float f_13703 = 0.42F;
   private static final float f_13704 = 0.1F;
   private static final double f_13705 = 0.04F;
   private static final double f_13706 = 0.5000001;
   private static final double f_13707 = 0.4;
   private static final double f_13708 = 0.4;
   private static final double f_13709 = 0.014;
   private static final double f_13710 = 0.11111111F;
   private static final double f_13711 = 0.001;
   private static final double f_13712 = 0.4;
   private static final double f_13713 = 0.003;
   private static final double f_13714 = 0.003;
   private static final double f_13715 = 0.0045;
   private static final double f_13716 = 0.0045;
   private static final double f_13717 = Math.PI;
   private static final double f_13718 = 180.0;
   private static final double f_13719 = Math.PI;
   private static final double f_13720 = 180.0;

   private void m_4738() {
      if (this.f_13615) {
         this.f_13615 = this.m_4753() && this.m_4793() && !this.f_13598.isPassenger();
      } else {
         this.f_13615 = this.m_4753()
            && this.m_4754()
            && !this.f_13598.isPassenger()
            && this.f_13598.level().getFluidState(this.m_4765(this.f_13600)).is(FluidTags.WATER);
      }
   }

   private void m_4739() {
      this.f_13616 = this.f_13618.contains(FluidTags.WATER);
      this.f_13618.clear();
      double var1 = this.m_4762() - f_13710;
      if (!(this.f_13598.getVehicle() instanceof Boat var4 && !var4.isUnderWater() && var4.getBoundingBox().maxY >= var1 && var4.getBoundingBox().minY <= var1)
         )
       {
         BlockPos var8 = BlockPos.containing(this.f_13600.x, var1, this.f_13600.z);
         FluidState var5 = this.f_13598.level().getFluidState(var8);
         double var6 = var8.getY() + var5.getHeight(this.f_13598.level(), var8);
         if (var6 > var1) {
            this.f_13618.addAll(var5.tags().toList());
         }
      }
   }

   private void m_4740(Vec3 var1) {
      Vec3 var2 = var1;
      var2 = this.m_4750(var2);
      Vec3 var3 = this.m_4760(var2);
      if (var3.lengthSqr() > f_13689) {
         this.f_13600 = this.f_13600.add(var3);
         this.f_13603 = this.f_13598.getDimensions(this.f_13598.getPose()).makeBoundingBox(this.f_13600);
      }

      boolean var4 = !Mth.equal(var1.x, var3.x);
      boolean var5 = !Mth.equal(var1.z, var3.z);
      this.f_13612 = var4 || var5;
      this.f_13613 = var1.y != var3.y;
      this.f_13611 = this.f_13613 && var1.y < 0.0;
      if (!this.m_4793()) {
         this.m_4755();
      }

      if (this.f_13611) {
         this.m_4774();
      } else if (var1.y < 0.0) {
         this.f_13607 = this.f_13607 - (float)var1.y;
      }

      Vec3 var6 = this.f_13602;
      if (this.f_13612 || this.f_13613) {
         this.f_13602 = new Vec3(var4 ? 0.0 : var6.x, this.f_13611 ? 0.0 : var6.y, var5 ? 0.0 : var6.z);
      }
   }

   private Vec3 m_4741(Vec3 var1, float var2) {
      this.m_4751(this.m_4789(var2), var1);
      this.f_13602 = this.m_4744(this.f_13602);
      this.m_4740(this.f_13602);
      Vec3 var3 = this.f_13602;
      BlockPos var4 = this.m_4765(this.f_13600);
      BlockState var5 = this.m_4790(var4);
      if ((this.f_13612 || this.f_13609)
         && (this.m_4743() || var5 != null && var5.is(Blocks.POWDER_SNOW) && PowderSnowBlock.canEntityWalkOnPowderSnow(this.f_13598))) {
         var3 = new Vec3(var3.x, f_13679, var3.z);
      }

      return var3;
   }

   private float m_4742() {
      float var1 = f_13686;
      return this.f_13599.f_13589.sprint() ? var1 + f_13687 : var1;
   }

   public boolean m_4743() {
      BlockPos var1 = this.m_4765(this.f_13600);
      BlockState var2 = this.m_4790(var1);
      return var2.is(BlockTags.CLIMBABLE) ? true : var2.getBlock() instanceof TrapDoorBlock && this.m_4768(var1, var2);
   }

   private Vec3 m_4744(Vec3 var1) {
      if (!this.m_4743()) {
         return var1;
      }

      this.m_4774();
      double var2 = Mth.clamp(var1.x, f_13692, f_13693);
      double var4 = Mth.clamp(var1.z, f_13694, f_13695);
      double var6 = Math.max(var1.y, f_13696);
      if (var6 < 0.0 && !this.m_4790(this.m_4765(this.f_13600)).is(Blocks.SCAFFOLDING) && this.f_13598.isSuppressingSlidingDownLadder()) {
         var6 = 0.0;
      }

      return new Vec3(var2, var6, var4);
   }

   public int m_4745() {
      return this.f_13619;
   }

   public double m_4746() {
      return this.f_13623;
   }

   private double m_4747() {
      return this.f_13598.getEyeHeight() < f_13707 ? 0.0 : f_13708;
   }

   public Vec3 m_4748() {
      return this.f_13600;
   }

   public static Class_SmEMzWs5Zw5oBieG m_4749(Player var0, Class_SmEMzWs5Zw5oBieG.kJXwKzbXWIuNXAxh var1, Vec3 var2) {
      return new Class_SmEMzWs5Zw5oBieG(
         var0,
         var1,
         var0.position(),
         var0.getPositionCodec().getBase(),
         var2,
         var0.getBoundingBox(),
         var0.getYRot(),
         var0.getXRot(),
         var0.isSprinting(),
         var0.fallDistance,
         0,
         var1.f_13589.jump(),
         var0.isFallFlying(),
         var0.onGround(),
         var0.horizontalCollision,
         var0.verticalCollision,
         var0.isInWater(),
         var0.isSwimming(),
         var0.isUnderWater(),
         m_4798(var0),
         m_4764(var0)
      );
   }

   private Vec3 m_4750(Vec3 var1) {
      if (var1.y <= 0.0 && this.m_4791()) {
         double var2 = var1.x;
         double var4 = var1.z;

         double var6;
         for (var6 = f_13697;
            var2 != 0.0 && this.f_13598.level().noCollision(this.f_13598, this.f_13603.move(var2, f_13698, 0.0));
            var2 += var2 > 0.0 ? -var6 : var6
         ) {
            if (var2 < var6 && var2 >= -var6) {
               var2 = 0.0;
               break;
            }
         }

         while (var4 != 0.0 && this.f_13598.level().noCollision(this.f_13598, this.f_13603.move(0.0, f_13699, var4))) {
            if (var4 < var6 && var4 >= -var6) {
               var4 = 0.0;
               break;
            }

            var4 += var4 > 0.0 ? -var6 : var6;
         }

         while (var2 != 0.0 && var4 != 0.0 && this.f_13598.level().noCollision(this.f_13598, this.f_13603.move(var2, f_13700, var4))) {
            var2 = var2 < var6 && var2 >= -var6 ? 0.0 : (var2 > 0.0 ? var2 - var6 : var2 + var6);
            if (var4 < var6 && var4 >= -var6) {
               var4 = 0.0;
               break;
            }

            var4 += var4 > 0.0 ? -var6 : var6;
         }

         if (var1.x != var2 || var1.z != var4) {
            this.f_13620 = true;
         }

         if (this.m_4752()) {
            var1 = new Vec3(var2, var1.y, var4);
         }
      }

      return var1;
   }

   private void m_4751(float var1, Vec3 var2) {
      Vec3 var3 = m_4757(var2, var1, this.f_13604);
      this.f_13602 = this.f_13602.add(var3);
   }

   protected boolean m_4752() {
      return this.f_13599.f_13589.shift() || this.f_13599.f_13586;
   }

   private boolean m_4753() {
      return this.f_13606;
   }

   public boolean m_4754() {
      return this.f_13616 && this.m_4793();
   }

   private void m_4755() {
      if (this.f_13598.getVehicle() instanceof Boat) {
         Boat var1 = (Boat)this.f_13598.getVehicle();
         if (!var1.isUnderWater()) {
            this.f_13614 = false;
            return;
         }
      }

      if (this.m_4756(FluidTags.WATER, f_13709)) {
         this.m_4774();
         this.f_13614 = true;
      } else {
         this.f_13614 = false;
      }
   }

   private boolean m_4756(TagKey<Fluid> var1, double var2) {
      if (this.m_4770()) {
         return false;
      }

      AABB var4 = this.f_13603.deflate(f_13711);
      int var5 = Mth.floor(var4.minX);
      int var6 = Mth.ceil(var4.maxX);
      int var7 = Mth.floor(var4.minY);
      int var8 = Mth.ceil(var4.maxY);
      int var9 = Mth.floor(var4.minZ);
      int var10 = Mth.ceil(var4.maxZ);
      double var11 = 0.0;
      boolean var13 = true;
      boolean var14 = false;
      Vec3 var15 = Vec3.ZERO;
      int var16 = 0;
      MutableBlockPos var17 = new MutableBlockPos();

      for (int var18 = var5; var18 < var6; var18++) {
         for (int var19 = var7; var19 < var8; var19++) {
            for (int var20 = var9; var20 < var10; var20++) {
               var17.set(var18, var19, var20);
               FluidState var21 = this.f_13598.level().getFluidState(var17);
               if (var21.is(var1)) {
                  double var22 = var19 + var21.getHeight(this.f_13598.level(), var17);
                  if (var22 >= var4.minY) {
                     var14 = true;
                     var11 = Math.max(var22 - var4.minY, var11);
                     if (var13) {
                        Vec3 var24 = var21.getFlow(this.f_13598.level(), var17);
                        if (var11 < f_13712) {
                           var24 = var24.scale(var11);
                        }

                        var15 = var15.add(var24);
                        var16++;
                     }
                  }
               }
            }
         }
      }

      if (var15.length() > 0.0) {
         if (var16 > 0) {
            var15 = var15.scale(1.0 / var16);
         }

         var15 = var15.scale(var2);
         if (Math.abs(this.f_13602.x) < f_13713 && Math.abs(this.f_13602.z) < f_13714 && var15.length() < f_13715) {
            var15 = var15.normalize().scale(f_13716);
         }

         this.f_13602 = this.f_13602.add(var15);
      }

      this.f_13617.put(var1, var11);
      return var14;
   }

   private static Vec3 m_4757(Vec3 var0, float var1, float var2) {
      double var3 = var0.lengthSqr();
      if (var3 < f_13680) {
         return Vec3.ZERO;
      }

      Vec3 var5 = (var3 > 1.0 ? var0.normalize() : var0).scale(var1);
      float var6 = Mth.sin(var2 * f_13681);
      float var7 = Mth.cos(var2 * f_13682);
      return new Vec3(var5.x * var7 - var5.z * var6, var5.y, var5.z * var7 + var5.x * var6);
   }

   private boolean m_4758(double var1, double var3, double var5) {
      return this.m_4783(this.f_13603.move(var1, var3, var5));
   }

   private static Vec3 m_4759(Vec3 var0, Vec3 var1, double var2) {
      return new Vec3(var0.x + (var1.x - var0.x) * var2, var0.y + (var1.y - var0.y) * var2, var0.z + (var1.z - var0.z) * var2);
   }

   private Vec3 m_4760(Vec3 var1) {
      AABB var2 = this.f_13603;
      List var3 = Collections.emptyList();
      Vec3 var4;
      if (var1.lengthSqr() == 0.0) {
         var4 = var1;
      } else {
         var4 = Entity.collideBoundingBox(this.f_13598, var1, var2, this.f_13598.level(), var3);
      }

      boolean var5 = var1.x != var4.x;
      boolean var6 = var1.y != var4.y;
      boolean var7 = var1.z != var4.z;
      boolean var8 = this.f_13611 || var6 && var1.y < 0.0;
      if (this.f_13598.maxUpStep() > 0.0F && var8 && (var5 || var7)) {
         Vec3 var9 = Entity.collideBoundingBox(this.f_13598, new Vec3(var1.x, this.f_13598.maxUpStep(), var1.z), var2, this.f_13598.level(), var3);
         Vec3 var10 = Entity.collideBoundingBox(
            this.f_13598, new Vec3(0.0, this.f_13598.maxUpStep(), 0.0), var2.expandTowards(var1.x, 0.0, var1.z), this.f_13598.level(), var3
         );
         Vec3 var11 = Entity.collideBoundingBox(this.f_13598, new Vec3(var1.x, 0.0, var1.z), var2.move(var10), this.f_13598.level(), var3).add(var10);
         if (var10.y < this.f_13598.maxUpStep() && var11.horizontalDistanceSqr() > var9.horizontalDistanceSqr()) {
            var9 = var11;
         }

         if (var9.horizontalDistanceSqr() > var4.horizontalDistanceSqr()) {
            return var9.add(Entity.collideBoundingBox(this.f_13598, new Vec3(0.0, -var9.y + var1.y, 0.0), var2.move(var9), this.f_13598.level(), var3));
         }
      }

      return var4;
   }

   public static Class_SmEMzWs5Zw5oBieG m_4761(int var0) {
      Class_SmEMzWs5Zw5oBieG var1 = m_4781(Class_SmEMzWs5Zw5oBieG.kJXwKzbXWIuNXAxh.fromClientPlayer(f_11537.player.getLastSentInput()));

      for (int var2 = 0; var2 < var0; var2++) {
         var1.m_4776();
      }

      return var1;
   }

   private double m_4762() {
      return this.f_13600.y + this.f_13598.getEyeHeight();
   }

   private void m_4763(TagKey<Fluid> var1) {
      this.f_13602 = this.f_13602.add(0.0, f_13705, 0.0);
   }

   private static HashSet<TagKey<Fluid>> m_4764(Player var0) {
      HashSet var1 = new HashSet();
      if (var0.isEyeInFluid(FluidTags.WATER)) {
         var1.add(FluidTags.WATER);
      }

      if (var0.isEyeInFluid(FluidTags.LAVA)) {
         var1.add(FluidTags.LAVA);
      }

      return var1;
   }

   public BlockPos m_4765(Vec3 var1) {
      return new BlockPos(Mth.floor(var1.x), Mth.floor(var1.y), Mth.floor(var1.z));
   }

   public static Class_SmEMzWs5Zw5oBieG m_4766(Player var0, long var1) {
      Class_SmEMzWs5Zw5oBieG var3 = m_4797(var0, Class_SmEMzWs5Zw5oBieG.kJXwKzbXWIuNXAxh.guessInput(var0));
      var3.m_4782(var1);
      return var3;
   }

   private double m_4767(TagKey<Fluid> var1) {
      return this.f_13617.getDouble(var1);
   }

   private boolean m_4768(BlockPos var1, BlockState var2) {
      if (!(Boolean)var2.getValue(TrapDoorBlock.OPEN)) {
         return false;
      }

      BlockState var3 = this.f_13598.level().getBlockState(var1.below());
      return var3.is(Blocks.LADDER) && ((Direction)var3.getValue(LadderBlock.FACING)).equals(var2.getValue(TrapDoorBlock.FACING));
   }

   private Vec3 m_4769(float var1, float var2) {
      float var3 = (float)(var1 * f_13717 / f_13718);
      float var4 = (float)(-var2 * f_13719 / f_13720);
      float var5 = Mth.cos(var4);
      float var6 = Mth.sin(var4);
      float var7 = Mth.cos(var3);
      float var8 = Mth.sin(var3);
      return new Vec3(var6 * var7, -var8, var5 * var7);
   }

   private boolean m_4770() {
      AABB var1 = this.f_13603.inflate(1.0);
      int var2 = Mth.floor(var1.minX);
      int var3 = Mth.ceil(var1.maxX);
      int var4 = Mth.floor(var1.minZ);
      int var5 = Mth.ceil(var1.maxZ);
      return !this.f_13598.level().hasChunksAt(var2, var4, var3, var5);
   }

   public static Class_SmEMzWs5Zw5oBieG m_4771(Player var0, Vec3 var1, long var2) {
      Class_SmEMzWs5Zw5oBieG var4 = m_4749(var0, Class_SmEMzWs5Zw5oBieG.kJXwKzbXWIuNXAxh.guessInput(var0), var1);
      var4.m_4782(var2);
      return var4;
   }

   public static Class_SmEMzWs5Zw5oBieG m_4772(Player var0, int var1) {
      Class_SmEMzWs5Zw5oBieG var2 = m_4797(var0, Class_SmEMzWs5Zw5oBieG.kJXwKzbXWIuNXAxh.guessInput(var0));

      for (int var3 = 0; var3 < var1; var3++) {
         var2.m_4776();
      }

      return var2;
   }

   private void m_4773(Vec3 var1) {
      if (this.f_13615 && !this.f_13598.isPassenger()) {
         double var2 = this.m_4787().y;
         double var4 = var2 < f_13633 ? f_13634 : f_13635;
         BlockPos var6 = new BlockPos(Mth.floor(this.f_13600.x), Mth.floor(this.f_13600.y + 1.0 - f_13636), Mth.floor(this.f_13600.z));
         if (var2 <= 0.0 || this.f_13599.f_13589.jump() || !this.f_13598.level().getBlockState(var6).getFluidState().isEmpty()) {
            this.f_13602 = this.f_13602.add(0.0, (var2 - this.f_13602.y) * var4, 0.0);
         }
      }

      double var19 = this.f_13602.y;
      double var20 = f_13637;
      boolean var21 = this.f_13602.y <= 0.0;
      if (this.f_13602.y <= 0.0 && this.m_4778(MobEffects.SLOW_FALLING)) {
         var20 = f_13638;
         this.m_4774();
      }

      if (this.m_4793() && this.f_13598.isAffectedByFluids()) {
         double var25 = this.f_13600.y;
         float var28 = this.m_4753() ? f_13639 : f_13640;
         float var30 = f_13641;
         float var32 = (float)this.m_4785(Attributes.WATER_MOVEMENT_EFFICIENCY);
         if (!this.f_13611) {
            var32 *= f_13642;
         }

         if (var32 > 0.0F) {
            var28 += (f_13643 - var28) * var32 / f_13644;
            var30 += (this.m_4780() - var30) * var32 / f_13645;
         }

         if (this.m_4778(MobEffects.DOLPHINS_GRACE)) {
            var28 = f_13646;
         }

         this.m_4751(var30, var1);
         this.m_4740(this.f_13602);
         Vec3 var33 = this.f_13602;
         if (this.f_13612 && this.m_4743()) {
            var33 = new Vec3(var33.x, f_13647, var33.z);
         }

         this.f_13602 = var33.multiply(var28, f_13648, var28);
         Vec3 var34 = this.m_4784(var20, var21, this.f_13602);
         this.f_13602 = var34;
         if (this.f_13612 && this.m_4758(var34.x, var34.y + f_13649 - this.f_13600.y + var25, var34.z)) {
            this.f_13602 = new Vec3(var34.x, f_13650, var34.z);
         }
      } else if (this.m_4777() && this.f_13598.isAffectedByFluids()) {
         double var24 = this.f_13600.y;
         this.m_4751(f_13651, var1);
         this.m_4740(this.f_13602);
         if (this.m_4767(FluidTags.LAVA) <= this.m_4747()) {
            this.f_13602 = this.f_13602.multiply(f_13652, f_13653, f_13654);
            this.f_13602 = this.m_4784(var20, var21, this.f_13602);
         } else {
            this.f_13602 = this.f_13602.scale(f_13655);
         }

         if (!this.f_13598.isNoGravity()) {
            this.f_13602 = this.f_13602.add(0.0, -var20 / f_13656, 0.0);
         }

         if (this.f_13612 && this.m_4758(this.f_13602.x, this.f_13602.y + f_13657 - this.f_13600.y + var24, this.f_13602.z)) {
            this.f_13602 = new Vec3(this.f_13602.x, f_13658, this.f_13602.z);
         }
      } else if (this.f_13610) {
         Vec3 var9 = this.f_13602;
         if (var9.y > f_13659) {
            this.f_13607 = 1.0;
         }

         Vec3 var10 = this.m_4787();
         float var11 = this.f_13605 * f_13660;
         double var12 = Math.sqrt(var10.x * var10.x + var10.z * var10.z);
         double var14 = this.f_13602.horizontalDistance();
         double var16 = var10.length();
         float var18 = Mth.cos(var11);
         var18 = (float)(var18 * (var18 * Math.min(1.0, var16 / f_13661)));
         var9 = this.f_13602.add(0.0, var20 * (f_13662 + var18 * f_13663), 0.0);
         if (var9.y < 0.0 && var12 > 0.0) {
            double var7 = var9.y * f_13664 * var18;
            var9 = var9.add(var10.x * var7 / var12, var7, var10.z * var7 / var12);
         }

         if (var11 < 0.0F && var12 > 0.0) {
            double var22 = var14 * -Mth.sin(var11) * f_13665;
            var9 = var9.add(-var10.x * var22 / var12, var22 * f_13666, -var10.z * var22 / var12);
         }

         if (var12 > 0.0) {
            var9 = var9.add((var10.x / var12 * var14 - var9.x) * f_13667, 0.0, (var10.z / var12 * var14 - var9.z) * f_13668);
         }

         this.f_13602 = var9.multiply(f_13669, f_13670, f_13671);
         this.m_4740(this.f_13602);
      } else {
         BlockPos var23 = this.m_4792();
         float var8 = this.f_13598.level().getBlockState(var23).getBlock().getFriction();
         float var27 = this.f_13611 ? var8 * f_13672 : f_13673;
         Vec3 var29 = this.m_4741(var1, var8);
         double var31 = var29.y;
         if (this.m_4778(MobEffects.LEVITATION)) {
            MobEffectInstance var13 = this.m_4786(MobEffects.LEVITATION);
            if (var13 != null) {
               var31 += (f_13674 * (var13.getAmplifier() + 1) - var29.y) * f_13675;
            }
         } else if (this.f_13598.level().isClientSide() && !this.f_13598.level().hasChunkAt(var23)) {
            var31 = this.f_13600.y > this.f_13598.level().getMinY() ? f_13676 : 0.0;
         } else if (!this.f_13598.isNoGravity()) {
            var31 -= var20;
         }

         this.f_13602 = new Vec3(var29.x * var27, var31 * f_13677, var29.z * var27);
      }

      if (this.f_13598.getAbilities().flying && !this.f_13598.isPassenger()) {
         this.f_13602 = new Vec3(this.f_13602.x, var19 * f_13678, this.f_13602.z);
         this.m_4774();
      }
   }

   private void m_4774() {
      this.f_13607 = 0.0;
   }

   public void m_4775() {
      this.f_13602 = this.f_13602.add(0.0, this.m_4795() - this.f_13602.y, 0.0);
      if (this.m_4753()) {
         float var1 = (float)Math.toRadians(this.f_13604);
         this.f_13602 = this.f_13602.add(-Mth.sin(var1) * f_13690, 0.0, Mth.cos(var1) * f_13691);
      }
   }

   public void m_4776() {
      this.f_13619++;
      this.f_13620 = false;
      if (!(this.f_13600.y <= f_13627)) {
         this.f_13599.update();
         this.m_4755();
         this.m_4739();
         this.m_4738();
         if (this.f_13608 > 0) {
            this.f_13608--;
         }

         this.f_13609 = this.f_13599.f_13589.jump();
         double var1 = this.f_13602.x;
         double var3 = this.f_13602.y;
         double var5 = this.f_13602.z;
         if (Math.abs(this.f_13602.x) < f_13628) {
            var1 = 0.0;
         }

         if (Math.abs(this.f_13602.y) < f_13629) {
            var3 = 0.0;
         }

         if (Math.abs(this.f_13602.z) < f_13630) {
            var5 = 0.0;
         }

         if (this.f_13611) {
            this.f_13610 = false;
         }

         this.f_13602 = new Vec3(var1, var3, var5);
         if (this.f_13609) {
            double var7 = this.m_4777() ? this.m_4767(FluidTags.LAVA) : this.m_4767(FluidTags.WATER);
            boolean var9 = this.m_4793() && var7 > 0.0;
            double var10 = this.m_4747();
            if (!var9 || this.f_13611 && !(var7 > var10)) {
               if (!this.m_4777() || this.f_13611 && !(var7 > var10)) {
                  if ((this.f_13611 || var9 && var7 <= var10) && this.f_13608 == 0) {
                     this.m_4775();
                     this.f_13608 = 10;
                  }
               } else {
                  this.m_4763(FluidTags.LAVA);
               }
            } else {
               this.m_4763(FluidTags.WATER);
            }
         }

         float var12 = this.f_13599.f_13588 * f_13631;
         float var8 = this.f_13599.f_13587 * f_13632;
         float var13 = 0.0F;
         if (this.m_4778(MobEffects.SLOW_FALLING) || this.m_4778(MobEffects.LEVITATION)) {
            this.m_4774();
         }

         this.f_13621 = this.f_13600;
         this.f_13622 = this.f_13602;
         this.m_4773(new Vec3(var12, var13, var8));
         this.f_13601 = this.f_13601 != null ? this.f_13601 : this.f_13600;
      }
   }

   public boolean m_4777() {
      return this.f_13617.getDouble(FluidTags.LAVA) > 0.0;
   }

   public boolean m_4778(Holder<MobEffect> var1) {
      MobEffectInstance var2 = this.f_13598.getEffect(var1);
      return var2 != null && var2.getDuration() >= this.f_13619;
   }

   public Class_SmEMzWs5Zw5oBieG m_4779() {
      return new Class_SmEMzWs5Zw5oBieG(
         this.f_13598,
         this.f_13599,
         this.f_13600,
         this.f_13601,
         this.f_13602,
         this.f_13603,
         this.f_13604,
         this.f_13605,
         this.f_13606,
         this.f_13607,
         this.f_13608,
         this.f_13609,
         this.f_13610,
         this.f_13611,
         this.f_13612,
         this.f_13613,
         this.f_13614,
         this.f_13615,
         this.f_13616,
         new Object2DoubleArrayMap(this.f_13617),
         new HashSet<>(this.f_13618)
      );
   }

   private float m_4780() {
      return f_13688;
   }

   public static Class_SmEMzWs5Zw5oBieG m_4781(Class_SmEMzWs5Zw5oBieG.kJXwKzbXWIuNXAxh var0) {
      LocalPlayer var1 = f_11537.player;
      return new Class_SmEMzWs5Zw5oBieG(
         var1,
         var0,
         var1.position(),
         var1.getPositionCodec().getBase(),
         var1.getDeltaMovement(),
         var1.getBoundingBox(),
         var1.getYRot(),
         var1.getXRot(),
         var1.isSprinting(),
         var1.fallDistance,
         0,
         var0.f_13589.jump(),
         var1.isFallFlying(),
         var1.onGround(),
         var1.horizontalCollision,
         var1.verticalCollision,
         var1.isInWater(),
         var1.isSwimming(),
         var1.isUnderWater(),
         m_4798(var1),
         m_4764(var1)
      );
   }

   public void m_4782(long var1) {
      double var3 = var1 / f_13625;
      int var5 = (int)Math.floor(var3);
      double var6 = var3 - var5;

      for (int var8 = 0; var8 < var5; var8++) {
         this.m_4776();
      }

      if (var6 > f_13626) {
         Vec3 var26 = this.f_13600;
         Vec3 var9 = this.f_13601;
         Vec3 var10 = this.f_13602;
         boolean var11 = this.f_13611;
         boolean var12 = this.f_13612;
         boolean var13 = this.f_13613;
         double var14 = this.f_13607;
         int var16 = this.f_13608;
         boolean var17 = this.f_13614;
         boolean var18 = this.f_13615;
         boolean var19 = this.f_13616;
         boolean var20 = this.f_13610;
         Object2DoubleArrayMap var21 = new Object2DoubleArrayMap(this.f_13617);
         HashSet var22 = new HashSet<>(this.f_13618);
         this.m_4776();
         Vec3 var23 = this.f_13600;
         Vec3 var24 = this.f_13601;
         Vec3 var25 = this.f_13602;
         this.f_13600 = m_4759(var26, var23, var6);
         this.f_13601 = m_4759(var9, var24, var6);
         this.f_13602 = m_4759(var10, var25, var6);
         this.f_13603 = this.f_13598.getDimensions(this.f_13598.getPose()).makeBoundingBox(this.f_13600);
         this.f_13611 = var11;
         this.f_13612 = var12;
         this.f_13613 = var13;
         this.f_13607 = var14;
         this.f_13608 = var16;
         this.f_13614 = var17;
         this.f_13615 = var18;
         this.f_13616 = var19;
         this.f_13610 = var20;
         this.f_13617.clear();
         this.f_13617.putAll(var21);
         this.f_13618.clear();
         this.f_13618.addAll(var22);
         this.f_13623 = var6;
      } else {
         this.f_13623 = 0.0;
      }
   }

   private boolean m_4783(AABB var1) {
      return this.f_13598.level().noCollision(this.f_13598, var1) && !this.f_13598.level().containsAnyLiquid(var1);
   }

   private Vec3 m_4784(double var1, boolean var3, Vec3 var4) {
      return this.f_13598.isNoGravity() ? var4 : var4.add(0.0, -var1 / (var3 ? f_13683 : f_13684), 0.0);
   }

   public double m_4785(Holder<Attribute> var1) {
      return this.f_13598.getAttributeValue(var1);
   }

   private MobEffectInstance m_4786(Holder<MobEffect> var1) {
      MobEffectInstance var2 = this.f_13598.getEffect(var1);
      return var2 != null && var2.getDuration() >= this.f_13619 ? var2 : null;
   }

   private Vec3 m_4787() {
      return this.m_4769(this.f_13605, this.f_13604);
   }

   private float m_4788() {
      if (this.m_4778(MobEffects.JUMP_BOOST)) {
         MobEffectInstance var1 = this.m_4786(MobEffects.JUMP_BOOST);
         return f_13704 * (var1.getAmplifier() + 1);
      } else {
         return 0.0F;
      }
   }

   private float m_4789(float var1) {
      return this.f_13611 ? this.m_4780() * (f_13685 / (var1 * var1 * var1)) : this.m_4742();
   }

   public Class_SmEMzWs5Zw5oBieG(
      Player var1,
      Class_SmEMzWs5Zw5oBieG.kJXwKzbXWIuNXAxh var2,
      Vec3 var3,
      Vec3 var4,
      Vec3 var5,
      AABB var6,
      float var7,
      float var8,
      boolean var9,
      double var10,
      int var12,
      boolean var13,
      boolean var14,
      boolean var15,
      boolean var16,
      boolean var17,
      boolean var18,
      boolean var19,
      boolean var20,
      Object2DoubleMap<TagKey<Fluid>> var21,
      HashSet<TagKey<Fluid>> var22
   ) {
      this.f_13598 = var1;
      this.f_13599 = var2;
      this.f_13600 = var3;
      this.f_13601 = var4;
      this.f_13602 = var5;
      this.f_13603 = var6;
      this.f_13604 = var7;
      this.f_13605 = var8;
      this.f_13606 = var9;
      this.f_13607 = var10;
      this.f_13608 = var12;
      this.f_13609 = var13;
      this.f_13610 = var14;
      this.f_13611 = var15;
      this.f_13612 = var16;
      this.f_13613 = var17;
      this.f_13614 = var18;
      this.f_13615 = var19;
      this.f_13616 = var20;
      this.f_13617 = var21;
      this.f_13618 = var22;
      this.f_13621 = var3;
      this.f_13622 = var5;
   }

   public BlockState m_4790(BlockPos var1) {
      return this.f_13598.level().getBlockState(var1);
   }

   private boolean m_4791() {
      return this.f_13611 || this.f_13607 < f_13701 && !this.f_13598.level().noCollision(this.f_13598, this.f_13603.move(0.0, this.f_13607 - f_13702, 0.0));
   }

   private BlockPos m_4792() {
      return BlockPos.containing(this.f_13600.x, this.f_13603.minY - f_13706, this.f_13600.z);
   }

   private boolean m_4793() {
      return this.f_13614;
   }

   public static Class_SmEMzWs5Zw5oBieG m_4794(long var0) {
      Class_SmEMzWs5Zw5oBieG var2 = m_4781(Class_SmEMzWs5Zw5oBieG.kJXwKzbXWIuNXAxh.fromClientPlayer(f_11537.player.getLastSentInput()));
      var2.m_4782(var0);
      return var2;
   }

   private float m_4795() {
      return f_13703 * this.m_4796() + this.m_4788();
   }

   private float m_4796() {
      float var1 = 0.0F;
      Block var2 = this.m_4790(this.m_4765(this.f_13600)).getBlock();
      if (var2 != null) {
         var1 = var2.getJumpFactor();
      }

      float var3 = 0.0F;
      Block var4 = this.m_4790(this.m_4792()).getBlock();
      if (var4 != null) {
         var3 = var4.getJumpFactor();
      }

      return var1 == 1.0F ? var3 : var1;
   }

   public static Class_SmEMzWs5Zw5oBieG m_4797(Player var0, Class_SmEMzWs5Zw5oBieG.kJXwKzbXWIuNXAxh var1) {
      return new Class_SmEMzWs5Zw5oBieG(
         var0,
         var1,
         var0.position(),
         var0.getPositionCodec().getBase(),
         var0.position().subtract(new Vec3(var0.xo, var0.yo, var0.zo)),
         var0.getBoundingBox(),
         var0.getYRot(),
         var0.getXRot(),
         var0.isSprinting(),
         var0.fallDistance,
         0,
         var1.f_13589.jump(),
         var0.isFallFlying(),
         var0.onGround(),
         var0.horizontalCollision,
         var0.verticalCollision,
         var0.isInWater(),
         var0.isSwimming(),
         var0.isUnderWater(),
         m_4798(var0),
         m_4764(var0)
      );
   }

   private static Object2DoubleMap<TagKey<Fluid>> m_4798(Player var0) {
      Object2DoubleArrayMap var1 = new Object2DoubleArrayMap();
      var1.put(FluidTags.WATER, var0.getFluidHeight(FluidTags.WATER));
      var1.put(FluidTags.LAVA, var0.getFluidHeight(FluidTags.LAVA));
      return var1;
   }

   public static class kJXwKzbXWIuNXAxh extends ClientInput {
      public boolean f_13586 = false;
      public float f_13587;
      public float f_13588;
      public Input f_13589;
      public static final double f_13590 = 0.121;
      public static final float f_13591 = -1.0F;
      public static final float f_13592 = -1.0F;
      public static final float f_13593 = 0.3F;
      public static final float f_13594 = 0.3F;
      public static final float f_13595 = (float) (Math.PI / 180.0);
      public static final double f_13596 = 0.001;

      public kJXwKzbXWIuNXAxh(Input var1) {
         this.f_13589 = var1;
      }

      public static Class_SmEMzWs5Zw5oBieG.kJXwKzbXWIuNXAxh fromClientPlayer(Input var0) {
         return new Class_SmEMzWs5Zw5oBieG.kJXwKzbXWIuNXAxh(var0);
      }

      public void update() {
         if (this.f_13589.forward() != this.f_13589.backward()) {
            this.f_13587 = this.f_13589.forward() ? 1.0F : f_13591;
         } else {
            this.f_13587 = 0.0F;
         }

         if (this.f_13589.left() == this.f_13589.right()) {
            this.f_13588 = 0.0F;
         } else {
            this.f_13588 = this.f_13589.left() ? 1.0F : f_13592;
         }

         if (this.f_13589.shift()) {
            this.f_13588 = this.f_13588 * f_13593;
            this.f_13587 = this.f_13587 * f_13594;
         }
      }

      public static Class_SmEMzWs5Zw5oBieG.kJXwKzbXWIuNXAxh guessInput(Player var0) {
         Vec3 var1 = var0.getDeltaMovement();
         float var2 = var0.getYRot() * f_13595;
         double var3 = -Mth.sin(var2) * var1.x + Mth.cos(var2) * var1.z;
         double var5 = Mth.cos(var2) * var1.x + Mth.sin(var2) * var1.z;
         double var7 = f_13596;
         return new Class_SmEMzWs5Zw5oBieG.kJXwKzbXWIuNXAxh(
            new Input(var3 > var7, var3 < -var7, var5 > var7, var5 < -var7, false, var0.isShiftKeyDown(), var0.isSprinting())
         );
      }

      public String toString() {
         return ""
            + this.f_13589.forward()
            + this.f_13589.backward()
            + this.f_13589.left()
            + this.f_13589.right()
            + this.f_13589.jump()
            + this.f_13589.sprint()
            + this.f_13589.shift();
      }
   }
}
