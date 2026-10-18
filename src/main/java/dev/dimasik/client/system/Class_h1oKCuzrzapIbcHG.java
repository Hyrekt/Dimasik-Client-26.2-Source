package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import java.util.Random;
import java.util.Set;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.LightCoordsUtil;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.VoxelShape;

public final class Class_h1oKCuzrzapIbcHG implements Class_NzJrN63M7QBpmAbi {
   private static final Set<String> f_23009 = Set.of(
      Class_h1oKCuzrzapIbcHG.f_23139, Class_h1oKCuzrzapIbcHG.f_23140, Class_h1oKCuzrzapIbcHG.f_23141, Class_h1oKCuzrzapIbcHG.f_23142
   );
   private static final Set<String> f_23010 = Set.of(Class_h1oKCuzrzapIbcHG.f_23143, Class_h1oKCuzrzapIbcHG.f_23144, Class_h1oKCuzrzapIbcHG.f_23145);
   private final Random f_23011 = new Random();
   private double f_23012;
   private double f_23013;
   private double f_23014;
   private double f_23015;
   private double f_23016;
   private double f_23017;
   private float f_23018;
   private float f_23019;
   private float f_23020;
   private boolean f_23021;
   private boolean f_23022;
   private boolean f_23023;
   private double f_23024 = 1.0;
   private float f_23025;
   private String f_23026;
   private Vec3 f_23027;
   private int f_23028;
   private static final String f_23029 = "idle";
   private static final String f_23030 = "idle";
   private static final double f_23031 = 20.0;
   private static final float f_23032 = 0.01F;
   private static final double f_23033 = 324.0;
   private static final double f_23034 = 0.22;
   private static final double f_23035 = 0.06;
   private static final double f_23036 = 1.4;
   private static final double f_23037 = 0.02;
   private static final double f_23038 = 0.22;
   private static final double f_23039 = 0.48;
   private static final double f_23040 = 0.42;
   private static final double f_23041 = 0.35;
   private static final double f_23042 = 1.6;
   private static final double f_23043 = 0.04;
   private static final double f_23044 = 0.42;
   private static final double f_23045 = 0.78;
   private static final double f_23046 = 0.03;
   private static final double f_23047 = 0.08;
   private static final double f_23048 = 0.42;
   private static final double f_23049 = 0.35;
   private static final double f_23050 = 0.12;
   private static final double f_23051 = 0.22;
   private static final double f_23052 = 2.2;
   private static final double f_23053 = 1.45;
   private static final double f_23054 = 0.16;
   private static final double f_23055 = 0.06;
   private static final double f_23056 = 0.16;
   private static final double f_23057 = 12.0;
   private static final double f_23058 = 5.0;
   private static final double f_23059 = 7.0;
   private static final double f_23060 = 3.4;
   private static final double f_23061 = 1.8;
   private static final double f_23062 = 10.0;
   private static final double f_23063 = 2.4;
   private static final double f_23064 = 6.0;
   private static final double f_23065 = 1.5;
   private static final double f_23066 = 0.9;
   private static final double f_23067 = 1.1;
   private static final double f_23068 = 1.2;
   private static final double f_23069 = 0.2;
   private static final double f_23070 = 1.2;
   private static final double f_23071 = 2.8;
   private static final double f_23072 = 2.2;
   private static final double f_23073 = 0.25;
   private static final double f_23074 = 1.4;
   private static final double f_23075 = 0.18;
   private static final double f_23076 = 0.08;
   private static final double f_23077 = 1.05;
   private static final double f_23078 = 1.5;
   private static final double f_23079 = 0.12;
   private static final double f_23080 = 0.03;
   private static final double f_23081 = 0.04;
   private static final double f_23082 = 0.06;
   private static final double f_23083 = 0.62;
   private static final double f_23084 = 1.3;
   private static final double f_23085 = 0.16;
   private static final double f_23086 = 1.05;
   private static final double f_23087 = 0.1;
   private static final double f_23088 = 0.08;
   private static final double f_23089 = 0.95;
   private static final double f_23090 = 1.9;
   private static final double f_23091 = 0.08;
   private static final double f_23092 = 0.02;
   private static final double f_23093 = 0.012;
   private static final double f_23094 = 1.0E-4;
   private static final double f_23095 = 0.001;
   private static final double f_23096 = 0.04;
   private static final double f_23097 = 0.02;
   private static final float f_23098 = 14.0F;
   private static final float f_23099 = 6.0F;
   private static final double f_23100 = 0.045;
   private static final double f_23101 = 0.012;
   private static final double f_23102 = 0.045;
   private static final float f_23103 = 18.0F;
   private static final float f_23104 = 5.0F;
   private static final String f_23105 = "fly";
   private static final String f_23106 = "idle";
   private static final double f_23107 = 1.4;
   private static final String f_23108 = "run";
   private static final String f_23109 = "walk";
   private static final double f_23110 = 1.0E-4;
   private static final float f_23111 = (float) (Math.PI / 180.0);
   private static final double f_23112 = 1.55;
   private static final double f_23113 = 1.25;
   private static final double f_23114 = 1.35;
   private static final double f_23115 = 0.7;
   private static final double f_23116 = 0.8;
   private static final double f_23117 = 0.5;
   private static final double f_23118 = 4.2;
   private static final double f_23119 = 0.5;
   private static final double f_23120 = 2.4;
   private static final double f_23121 = 0.35;
   private static final double f_23122 = 3.4;
   private static final double f_23123 = 0.35;
   private static final double f_23124 = 1.35;
   private static final double f_23125 = 0.22;
   private static final double f_23126 = 0.32;
   private static final double f_23127 = 0.4225;
   private static final double f_23128 = 1.0E-4;
   private static final float f_23129 = (float) (Math.PI / 180.0);
   private static final double f_23130 = 0.65;
   private static final double f_23131 = 0.4225;
   private static final double f_23132 = 1.0E-4;
   private static final float f_23133 = (float) (Math.PI / 180.0);
   private static final double f_23134 = 0.65;
   private static final double f_23135 = Double.MAX_VALUE;
   private static final double f_23136 = 3.0;
   private static final double f_23137 = 0.4;
   private static final float f_23138 = 90.0F;
   private static final String f_23139 = "fly_rope_left";
   private static final String f_23140 = "fly_rope_right";
   private static final String f_23141 = "fly_rope_left_tip";
   private static final String f_23142 = "fly_rope_right_tip";
   private static final String f_23143 = "rope_spin";
   private static final String f_23144 = "left_handle";
   private static final String f_23145 = "right_handle";

   public void m_7045() {
      this.f_23021 = false;
      this.f_23027 = null;
      this.f_23022 = false;
      this.f_23023 = false;
      this.f_23026 = f_23030;
      this.f_23025 = 0.0F;
   }

   private Vec3 m_7046(Vec3 var1, Player var2) {
      double var3 = var1.x - var2.getX();
      double var5 = var1.z - var2.getZ();
      double var7 = var3 * var3 + var5 * var5;
      if (var7 >= f_23131) {
         return var1;
      }

      double var9 = Math.sqrt(var7);
      if (var9 < f_23132) {
         float var11 = var2.getYRot() * f_23133;
         var3 = -Mth.sin(var11);
         var5 = Mth.cos(var11);
         var9 = 1.0;
      }

      double var13 = f_23134 / var9;
      return new Vec3(var2.getX() + var3 * var13, var1.y, var2.getZ() + var5 * var13);
   }

   private void m_7047(Vec3 var1) {
      this.f_23012 = this.f_23015 = var1.x;
      this.f_23013 = this.f_23016 = var1.y;
      this.f_23014 = this.f_23017 = var1.z;
      this.f_23027 = var1;
   }

   private Vec3 m_7048(Player var1, boolean var2) {
      Vec3 var3 = new Vec3(var1.getDeltaMovement().x, 0.0, var1.getDeltaMovement().z);
      Vec3 var4;
      if (var3.lengthSqr() < f_23110) {
         float var5 = var1.getYRot() * f_23111;
         var4 = new Vec3(-Mth.sin(var5), 0.0, Mth.cos(var5));
      } else {
         var4 = var3.normalize();
      }

      Vec3 var16 = new Vec3(-var4.z, 0.0, var4.x);
      double var6 = var2 ? (var1.isFallFlying() ? f_23112 : f_23113) : f_23114;
      double var8 = (var2 ? f_23115 : f_23116) * this.f_23028;
      double var10 = var2
         ? Math.clamp(f_23117 + var1.getDeltaMovement().length() * f_23118, f_23119, f_23120)
         : Math.clamp(f_23121 + var3.length() * f_23122, f_23123, f_23124);
      Vec3 var12 = var1.position().add(var4.scale(var10));
      Vec3 var13 = var12.subtract(var4.scale(var6)).add(var16.scale(var8));
      if (var2) {
         double var14 = var1.isFallFlying() ? f_23125 : f_23126;
         return new Vec3(var13.x, var1.getY() + var14, var13.z);
      } else {
         return this.m_7046(new Vec3(var13.x, this.m_7056(var13.x, var13.z, var1.getY()), var13.z), var1);
      }
   }

   private double m_7049(float var1) {
      return Mth.lerp(var1, this.f_23016, this.f_23013);
   }

   private void m_7050(Player var1) {
      Vec3 var2 = new Vec3(this.f_23012, this.f_23013, this.f_23014);
      double var3 = var2.distanceToSqr(var1.position());
      double var5 = Math.sqrt(var3);
      double var7 = var1.getDeltaMovement().horizontalDistance();
      boolean var9 = var1.isFallFlying() || var1.getAbilities().flying;
      Vec3 var10 = this.m_7048(var1, var9);
      if (var3 > f_23033) {
         this.m_7047(var10);
         this.m_7057(var10, 0.0, false, var9, 1.0);
      } else {
         double var11 = var9
            ? Math.clamp(f_23034 + var1.getDeltaMovement().length() * f_23035 + Math.max(0.0, var5 - f_23036) * f_23037, f_23038, f_23039)
            : Math.clamp(f_23040 + var7 * f_23041 + Math.max(0.0, var5 - f_23042) * f_23043, f_23044, f_23045);
         this.f_23027 = this.f_23027 == null ? var10 : this.f_23027.lerp(var10, var11);
         Vec3 var13 = this.f_23027.subtract(var2);
         double var14 = Math.hypot(var13.x, var13.z);
         double var16 = var13.length();
         boolean var18 = var7 > f_23046 || Math.abs(var1.getDeltaMovement().y) > f_23047;
         boolean var19 = var14 < f_23048 && Math.abs(var13.y) < f_23049;
         if (!var9 && var19 && !var18) {
            this.m_7057(this.m_7063(var2, var1.getY()), 0.0, false, false, 1.0);
         } else {
            MobEffectInstance var20 = var1.getEffect(MobEffects.SPEED);
            int var21 = var20 != null ? var20.getAmplifier() + 1 : 0;
            if (var9) {
               boolean var28 = var16 > f_23050 || var18;
               double var23 = Math.clamp(
                  f_23051
                     + var1.getDeltaMovement().length() * (var1.isFallFlying() ? f_23052 : f_23053)
                     + Math.max(0.0, var5 - 1.0) * f_23054
                     + var21 * f_23055,
                  f_23056,
                  var1.isFallFlying()
                     ? (var5 > f_23057 ? f_23058 : (var5 > f_23059 ? f_23060 : f_23061))
                     : (var5 > f_23062 ? f_23063 : (var5 > f_23064 ? f_23065 : f_23066))
               );
               double var25 = Math.clamp(
                  f_23067 + Math.max(0.0, var5 - f_23068) * f_23069 + var1.getDeltaMovement().length() * f_23070, 1.0, var1.isFallFlying() ? f_23071 : f_23072
               );
               this.m_7057(this.f_23027, var23, var28, true, var25);
               this.m_7062(var1);
            } else {
               double var22 = Math.clamp((var14 - f_23073) / f_23074, f_23075, 1.0);
               double var24 = Math.clamp(
                     f_23076 + var7 * f_23077 + Math.max(0.0, var5 - f_23078) * f_23079 + var21 * f_23080 + (var1.isSprinting() ? f_23081 : 0.0),
                     f_23082,
                     f_23083
                  )
                  * var22;
               double var26 = Math.clamp(
                  1.0 + Math.max(0.0, var5 - f_23084) * f_23085 + var7 * f_23086 + var21 * f_23087 + (var1.isSprinting() ? f_23088 : 0.0), f_23089, f_23090
               );
               this.m_7057(this.f_23027, var24, var14 > f_23091 || var18, false, var26);
               this.m_7062(var1);
            }
         }
      }
   }

   private static float m_7051(float var0, float var1, float var2) {
      return var0 + Mth.clamp(Mth.wrapDegrees(var1 - var0), -var2, var2);
   }

   public Class_h1oKCuzrzapIbcHG() {
      this.f_23026 = f_23029;
      this.f_23028 = 1;
   }

   private static float m_7052(double var0, double var2) {
      return (float)Math.toDegrees(Mth.atan2(var2, var0)) - f_23138;
   }

   public void m_7053(PoseStack var1, Class_1x5Fn2q4kmtD2Zmq var2, Vec3 var3, float var4, Class_CaVoGy5a20MKv97j var5, float var6) {
      if (this.f_23021 && var5 != null && !(var6 < f_23032)) {
         Class_vhSU9kAizeRReaAF var7 = var5.clip(this.f_23026);
         RenderType var8 = RenderTypes.entityCutout(var5.texture());
         VertexConsumer var9 = var2.m_881(var8);
         var1.pushPose();
         var1.translate(this.m_7059(var4) - var3.x, this.m_7049(var4) - var3.y, this.m_7060(var4) - var3.z);
         var1.mulPose(Axis.YP.rotationDegrees(-this.m_7058(var4)));
         float var10 = var5.scale();
         var1.scale(var10, var10, var10);
         Class_rlEjoVq6UqFoLGoE.m_8459(
            var1, var9, var5.model(), var7, this.f_23025, this.m_7061(), OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, var6, this.f_23023 ? f_23010 : f_23009
         );
         var1.popPose();
         if (var2 instanceof Class_1x5Fn2q4kmtD2Zmq.EGrtL3OkTEhswyKz var11) {
            var11.m_882(var8);
         }
      }
   }

   public void m_7054(Player var1) {
      if (var1 != null && f_11537.level != null) {
         if (!this.f_23021) {
            this.m_7055(var1);
         }

         this.f_23015 = this.f_23012;
         this.f_23016 = this.f_23013;
         this.f_23017 = this.f_23014;
         this.f_23019 = this.f_23018;
         this.m_7050(var1);
         this.f_23025 = this.f_23025 + (float)(this.f_23024 / f_23031);
      } else {
         this.m_7045();
      }
   }

   private void m_7055(Player var1) {
      this.f_23028 = this.f_23011.nextBoolean() ? 1 : -1;
      Vec3 var2 = this.m_7048(var1, var1.isFallFlying() || var1.getAbilities().flying);
      this.f_23012 = this.f_23015 = var2.x;
      this.f_23013 = this.f_23016 = var2.y;
      this.f_23014 = this.f_23017 = var2.z;
      this.f_23018 = this.f_23019 = this.f_23020 = var1.getYRot();
      this.f_23027 = var2;
      this.f_23021 = true;
   }

   private double m_7056(double var1, double var3, double var5) {
      ClientLevel var7 = f_11537.level;
      if (var7 == null) {
         return var5;
      }

      int var8 = Mth.floor(var1);
      int var9 = Mth.floor(var3);
      int var10 = Mth.floor(var5) + 2;
      int var11 = Mth.floor(var5) - 8;
      MutableBlockPos var12 = new MutableBlockPos(var8, var10, var9);
      double var13 = var5;
      double var15 = f_23135;

      for (int var17 = var10; var17 >= var11; var17--) {
         var12.setY(var17);
         BlockState var18 = var7.getBlockState(var12);
         if (!var18.is(BlockTags.LEAVES)) {
            VoxelShape var19 = var18.getCollisionShape(var7, var12);
            if (!var19.isEmpty()) {
               double var20 = var17 + var19.max(net.minecraft.core.Direction.Axis.Y);
               double var22 = Math.abs(var20 - var5);
               if (var22 < var15) {
                  var15 = var22;
                  var13 = var20;
               }
            }
         }
      }

      return var15 <= f_23136 ? var13 : var5;
   }

   private void m_7057(Vec3 var1, double var2, boolean var4, boolean var5, double var6) {
      this.f_23023 = var5;
      this.f_23024 = var6;
      Vec3 var8 = new Vec3(this.f_23012, this.f_23013, this.f_23014);
      Vec3 var9 = var1.subtract(var8);
      double var10 = Math.hypot(var9.x, var9.z);
      double var12 = var9.length();
      if (var5) {
         if (var4 && var12 > f_23092) {
            double var14 = Math.min(var12, Math.max(f_23093, var2));
            Vec3 var16 = var9.normalize().scale(var14);
            this.f_23012 = this.f_23012 + var16.x;
            this.f_23013 = this.f_23013 + var16.y;
            this.f_23014 = this.f_23014 + var16.z;
            if (var10 > f_23094) {
               this.f_23020 = m_7052(var9.x, var9.z);
            }
         } else if (Math.abs(var9.y) > f_23095) {
            this.f_23013 = this.f_23013 + Math.copySign(Math.min(Math.abs(var9.y), f_23096), var9.y);
         }

         this.f_23022 = var4 && var12 > f_23097;
         this.f_23018 = m_7051(this.f_23018, this.f_23020, this.f_23022 ? f_23098 : f_23099);
      } else {
         if (var4 && var10 > f_23100) {
            this.f_23020 = m_7052(var9.x, var9.z);
            double var17 = Math.min(var10, Math.max(f_23101, var2));
            this.f_23012 = this.f_23012 + var9.x / var10 * var17;
            this.f_23014 = this.f_23014 + var9.z / var10 * var17;
         }

         this.f_23013 = this.m_7056(this.f_23012, this.f_23014, var1.y);
         this.f_23022 = var4 && var10 > f_23102;
         this.f_23018 = m_7051(this.f_23018, this.f_23020, this.f_23022 ? f_23103 : f_23104);
      }

      String var18 = this.f_23023 ? f_23105 : (!this.f_23022 ? f_23106 : (this.f_23024 >= f_23107 ? f_23108 : f_23109));
      if (!var18.equals(this.f_23026)) {
         this.f_23026 = var18;
         this.f_23025 = 0.0F;
      }
   }

   private float m_7058(float var1) {
      return Mth.rotLerp(var1, this.f_23019, this.f_23018);
   }

   private double m_7059(float var1) {
      return Mth.lerp(var1, this.f_23015, this.f_23012);
   }

   private double m_7060(float var1) {
      return Mth.lerp(var1, this.f_23017, this.f_23014);
   }

   private int m_7061() {
      if (f_11537.level == null) {
         return LightCoordsUtil.pack(15, 15);
      }

      BlockPos var1 = BlockPos.containing(this.f_23012, this.f_23013 + f_23137, this.f_23014);
      return LightCoordsUtil.pack(f_11537.level.getBrightness(LightLayer.BLOCK, var1), f_11537.level.getBrightness(LightLayer.SKY, var1));
   }

   private void m_7062(Player var1) {
      double var2 = this.f_23012 - var1.getX();
      double var4 = this.f_23014 - var1.getZ();
      double var6 = var2 * var2 + var4 * var4;
      if (!(var6 >= f_23127)) {
         double var8 = Math.sqrt(var6);
         if (var8 < f_23128) {
            float var10 = var1.getYRot() * f_23129;
            var2 = -Mth.sin(var10);
            var4 = Mth.cos(var10);
            var8 = 1.0;
         }

         double var12 = f_23130 / var8;
         this.f_23012 = var1.getX() + var2 * var12;
         this.f_23014 = var1.getZ() + var4 * var12;
      }
   }

   private Vec3 m_7063(Vec3 var1, double var2) {
      return new Vec3(var1.x, this.m_7056(var1.x, var1.z, var2), var1.z);
   }
}
