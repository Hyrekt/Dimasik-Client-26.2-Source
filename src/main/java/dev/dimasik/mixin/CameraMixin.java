package dev.dimasik.mixin;

import com.mojang.math.Axis;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.FreeCam;
import dev.dimasik.client.module.render.BetterMinecraft;
import dev.dimasik.client.system.Class_331rljyx7QX4JcMi;
import dev.dimasik.client.system.Class_LJY6AyYHP77Twgvj;
import dev.dimasik.client.system.Class_Q49u2s432M4ulFXV;
import dev.dimasik.client.system.Class_VUL8fOj2RfatZYAM;
import dev.dimasik.client.system.Class_X574GcHt0SazS9zo;
import dev.dimasik.client.system.Class_aY0wvCQAcpXsfK9C;
import dev.dimasik.client.system.Class_dpBlC70x4optBWBD;
import dev.dimasik.client.system.Class_xYKqykPYp6IuC6PX;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.Camera;
import net.minecraft.client.CameraType;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(Camera.class)
public abstract class CameraMixin implements Class_VUL8fOj2RfatZYAM {
   @Shadow
   private float eyeHeight;
   @Shadow
   private float eyeHeightOld;
   @Shadow
   private Quaternionf rotation;
   @Shadow
   private float xRot;
   @Shadow
   private float yRot;
   @Shadow
   @Final
   private static Vector3fc FORWARDS;
   @Shadow
   @Final
   private static Vector3fc UP;
   @Shadow
   @Final
   private static Vector3fc LEFT;
   @Shadow
   private Vector3f forwards;
   @Shadow
   private Vector3f up;
   @Shadow
   private Vector3f left;
   @Shadow
   private int matrixPropertiesDirty;
   @Unique
   private int dimasik$rotationCalls;
   @Unique
   private float hmiPitch;
   @Unique
   private float hmiYaw;
   @Unique
   private float hmiRoll;
   @Unique
   private float hmiX;
   @Unique
   private float hmiY;
   @Unique
   private float hmiZ;
   @Unique
   private CameraType perspective;
   @Unique
   private CameraType transitionFrom;
   @Unique
   private CameraType transitionTo;
   @Unique
   private Vec3 frameStartPosition = Vec3.ZERO;
   @Unique
   private Vec3 frameAnchor = Vec3.ZERO;
   @Unique
   private Vec3 transitionStartOffset = Vec3.ZERO;
   @Unique
   private long transitionStartedAt;
   @Unique
   private long transitionDurationNanos;
   @Unique
   private float transitionStartYaw;
   @Unique
   private float transitionStartPitch;
   @Unique
   private boolean pendingOffsetCapture;
   private static final String f_36663 = "do_a_barrel_roll";
   private static final float f_36664 = (float) Math.PI;
   private static final float f_36665 = (float) (Math.PI / 180.0);
   private static final float f_36666 = (float) (Math.PI / 180.0);
   private static final float f_36667 = (float) (Math.PI / 180.0);
   private static final String f_36668 = "do_a_barrel_roll";
   private static final double f_36669 = 1.0E-4;
   private static final double f_36670 = 1.0E-4;
   private static final double f_36671 = 0.15;
   private static final double f_36672 = 0.85;
   private static final double f_36673 = 1.25;
   private static final double f_36674 = 0.5;
   private static final double f_36675 = 0.12;
   private static final double f_36676 = 3.0;
   private static final float f_36677 = 180.0F;
   private static final float f_36678 = 360.0F;

   @Shadow
   protected abstract void setPosition(Vec3 var1);

   @Override
   public void hMI5_0$applyRotation() {
      this.rotation.add(Axis.XP.rotationDegrees(this.hmiPitch));
      this.rotation.add(Axis.YP.rotationDegrees(this.hmiYaw));
      this.rotation.add(Axis.ZP.rotationDegrees(this.hmiRoll));
   }

   @Override
   public void hMI5_0$setRotationValues(float var1, float var2, float var3) {
      this.hmiPitch = var1;
      this.hmiYaw = var2;
      this.hmiRoll = var3;
   }

   @Override
   public void hMI5_0$setPosValues(float var1, float var2, float var3) {
      this.hmiX = var1;
      this.hmiY = var2;
      this.hmiZ = var3;
   }

   @Inject(method = "setRotation", at = @At("HEAD"), cancellable = true)
   private void hmiSetRotation(float var1, float var2, CallbackInfo var3) {
      if (Class_X574GcHt0SazS9zo.m_5499() && !FabricLoader.getInstance().isModLoaded(f_36663)) {
         this.xRot = var2;
         this.yRot = var1;
         this.rotation.rotationYXZ(f_36664 - (var1 + this.hmiYaw) * f_36665, (-var2 + this.hmiPitch) * f_36666, this.hmiRoll * f_36667);
         FORWARDS.rotate(this.rotation, this.forwards);
         UP.rotate(this.rotation, this.up);
         LEFT.rotate(this.rotation, this.left);
         this.matrixPropertiesDirty |= 3;
         var3.cancel();
      }
   }

   @Inject(method = "setPosition(DDD)V", at = @At("HEAD"), cancellable = true)
   private void hmiSetPos(double var1, double var3, double var5, CallbackInfo var7) {
      if (Class_X574GcHt0SazS9zo.m_5499() && !FabricLoader.getInstance().isModLoaded(f_36668)) {
         this.setPosition(new Vec3(var1 + this.hmiX, var3 + this.hmiY, var5 + this.hmiZ));
         var7.cancel();
      }
   }

   @Unique
   private static Vec3 shoulderSlideOffset(Vec3 var0, Vec3 var1, float var2) {
      double var3 = Math.sqrt(var0.x * var0.x + var0.z * var0.z);
      double var5 = Math.sqrt(var1.x * var1.x + var1.z * var1.z);
      if (!(var3 < f_36669) && !(var5 < f_36670)) {
         double var7 = Mth.clamp((var3 + var5) * f_36671, f_36672, f_36673);
         Vec3 var9 = new Vec3(var0.z / var3 * var7, Mth.lerp(f_36674, var0.y, var1.y) + f_36675, -var0.x / var3 * var7);
         double var10 = 1.0 - var2;
         double var12 = var10 * var10 * var10;
         double var14 = f_36676 * var10 * var2;
         double var16 = var2 * var2 * var2;
         return new Vec3(
            var0.x * var12 + var9.x * var14 + var1.x * var16,
            var0.y * var12 + var9.y * var14 + var1.y * var16,
            var0.z * var12 + var9.z * var14 + var1.z * var16
         );
      } else {
         return var0.lerp(var1, var2);
      }
   }

   @Unique
   private static Class_Q49u2s432M4ulFXV.iAAyuBd3W7AP4wvB perspectiveAnimation(float var0) {
      Class_Q49u2s432M4ulFXV.iAAyuBd3W7AP4wvB var1 = new Class_Q49u2s432M4ulFXV.iAAyuBd3W7AP4wvB(var0);
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9051() != null) {
         DimasikClient.m_9057().m_9051().m_9708(var1);
      }

      return var1;
   }

   @Inject(method = "alignWithEntity", at = @At("HEAD"))
   private void captureCameraStart(float var1, CallbackInfo var2) {
      this.dimasik$rotationCalls = 0;
      this.frameStartPosition = ((Camera)(Object)this).position();
      BetterMinecraft var3 = betterMinecraft();
      if (var3 != null) {
         var3.m_5728(((Camera)(Object)this).entity());
      }
   }

   @Redirect(method = "alignWithEntity", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Camera;setRotation(FF)V"))
   private void hookSetRotation(Camera var1, float var2, float var3, float var4) {
      CameraType var5 = Minecraft.getInstance().options.getCameraType();
      boolean var6 = !var5.isFirstPerson();
      boolean var7 = var5.isMirrored();
      if (this.dimasik$rotationCalls++ <= 0 || !var7) {
         Class_dpBlC70x4optBWBD var8 = new Class_dpBlC70x4optBWBD(var2, var3);
         DimasikClient.m_9057().m_9051().m_9708(var8);
         float var9 = var8.m_6348();
         float var10 = var8.m_6351();
         Vec2 var11 = DimasikClient.m_9057().m_9049().m_2801().m_3460().m_5772(var9, var10);
         var9 = var11.x;
         var10 = var11.y;
         BetterMinecraft var12 = betterMinecraft();
         if (var12 != null) {
            Vec2 var13 = var12.m_5744(var9, var10);
            var9 = var13.x;
            var10 = var13.y;
         }

         if (var6 && var7) {
            var9 += f_36677;
            var10 = -var10;
         }

         CameraType var20 = !var6 ? CameraType.FIRST_PERSON : (var7 ? CameraType.THIRD_PERSON_FRONT : CameraType.THIRD_PERSON_BACK);
         this.beginPerspectiveTransition(var20);
         float var14 = this.transitionProgress();
         if (var14 < 1.0F) {
            Class_Q49u2s432M4ulFXV.iAAyuBd3W7AP4wvB var15 = perspectiveAnimation(var14);
            float var16 = var15.m_4238() ? var15.m_4241() : 1.0F;
            float var17 = Mth.wrapDegrees(var9 - this.transitionStartYaw);
            if (this.isThirdPersonFlip() && var17 > 0.0F) {
               var17 -= f_36678;
            }

            var9 = this.transitionStartYaw + var17 * var16;
            var10 = Mth.lerp(var16, this.transitionStartPitch, var10);
         }

         ((Camera)(Object)this).setRotation(var9, var10);
      }
   }

   @Redirect(method = "alignWithEntity", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Camera;setPosition(DDD)V", ordinal = 0), require = 1)
   private void redirectSetPos(Camera var1, double var2, double var4, double var6, float var8) {
      Minecraft var9 = Minecraft.getInstance();
      Entity var10 = var1.entity();
      if (var10 == null) {
         Class_LJY6AyYHP77Twgvj.m_3626();
         Vec3 var18 = new Vec3(var2, var4, var6);
         this.frameAnchor = var18;
         var1.setPosition(var18);
      } else {
         Vec3 var11 = new Vec3(
            Mth.lerp(var8, var10.xo, var10.getX()),
            Mth.lerp(var8, var10.yo, var10.getY()) + Mth.lerp(var8, this.eyeHeightOld, this.eyeHeight),
            Mth.lerp(var8, var10.zo, var10.getZ())
         );
         DimasikClient var12 = DimasikClient.m_9057();
         if (var12 != null && var12.m_9051() != null && var12.m_9049() != null && var12.m_9049().m_2801() != null) {
            FreeCam var13 = var12.m_9049().m_2801().m_3460();
            boolean var14 = var9.options.getCameraType().isFirstPerson() && var10 == var9.player && !var13.m_776() && this.transitionProgress() >= 1.0F;
            if (var14 && var10 instanceof LocalPlayer var15) {
               var11 = Class_LJY6AyYHP77Twgvj.m_3625(var15, var11);
            } else {
               Class_LJY6AyYHP77Twgvj.m_3626();
            }

            Class_331rljyx7QX4JcMi var19 = new Class_331rljyx7QX4JcMi(var11, var8);
            var12.m_9051().m_9708(var19);
            Vec3 var16 = var13.m_5776(var19.m_1218());
            BetterMinecraft var17 = betterMinecraft();
            if (var17 != null) {
               var16 = var17.m_5737(var16);
            }

            this.frameAnchor = var16;
            var1.setPosition(var16);
         } else {
            Class_LJY6AyYHP77Twgvj.m_3626();
            this.frameAnchor = var11;
            var1.setPosition(var11);
         }
      }
   }

   @Inject(method = "alignWithEntity", at = @At("TAIL"))
   private void animatePerspective(float var1, CallbackInfo var2) {
      Camera var3 = (Camera)(Object)this;
      float var4 = this.transitionProgress();
      if (!(var4 >= 1.0F)) {
         Class_Q49u2s432M4ulFXV.iAAyuBd3W7AP4wvB var5 = perspectiveAnimation(var4);
         if (!var5.m_4238()) {
            this.transitionStartedAt = 0L;
            this.pendingOffsetCapture = false;
         } else {
            if (this.pendingOffsetCapture) {
               this.transitionStartOffset = this.frameStartPosition.subtract(this.frameAnchor);
               this.pendingOffsetCapture = false;
            }

            Vec3 var6 = var3.position().subtract(this.frameAnchor);
            float var7 = var5.m_4241();
            Vec3 var8;
            if (this.isThirdPersonFlip()) {
               var8 = shoulderSlideOffset(this.transitionStartOffset, var6, var7);
            } else {
               var8 = this.transitionStartOffset.lerp(var6, var7);
            }

            var3.setPosition(this.frameAnchor.add(var8));
         }
      }
   }

   @Unique
   private boolean isThirdPersonFlip() {
      return this.transitionFrom != null
         && !this.transitionFrom.isFirstPerson()
         && this.transitionTo != null
         && !this.transitionTo.isFirstPerson()
         && this.transitionFrom != this.transitionTo;
   }

   @Unique
   private void beginPerspectiveTransition(CameraType var1) {
      if (this.perspective == null) {
         this.perspective = var1;
         this.transitionFrom = var1;
         this.transitionTo = var1;
      } else if (this.perspective != var1) {
         Camera var2 = (Camera)(Object)this;
         this.transitionFrom = this.perspective;
         this.transitionTo = var1;
         this.perspective = var1;
         Class_Q49u2s432M4ulFXV.iAAyuBd3W7AP4wvB var3 = perspectiveAnimation(0.0F);
         if (!var3.m_4238()) {
            this.transitionStartedAt = 0L;
            this.transitionDurationNanos = 0L;
            this.pendingOffsetCapture = false;
         } else {
            this.transitionDurationNanos = Math.max(1L, var3.m_4239());
            this.transitionStartedAt = System.nanoTime();
            this.transitionStartYaw = var2.yRot();
            this.transitionStartPitch = var2.xRot();
            this.pendingOffsetCapture = true;
         }
      }
   }

   @Unique
   private float transitionProgress() {
      return this.transitionStartedAt != 0L && this.transitionDurationNanos > 0L
         ? Mth.clamp((float)(System.nanoTime() - this.transitionStartedAt) / (float)this.transitionDurationNanos, 0.0F, 1.0F)
         : 1.0F;
   }

   @Inject(method = "getMaxZoom", at = @At("HEAD"), cancellable = true)
   private void clipToSpace(float var1, CallbackInfoReturnable<Float> var2) {
      BetterMinecraft var3 = betterMinecraft();
      if (var3 != null && var3.m_5736() && var3.f_16489.m_8768()) {
         var2.setReturnValue(var1);
      } else {
         Class_xYKqykPYp6IuC6PX var4 = new Class_xYKqykPYp6IuC6PX(Class_xYKqykPYp6IuC6PX.QfQnMomAbf3hjvZP.CAMERA_CLIP);
         DimasikClient.m_9057().m_9051().m_9708(var4);
         if (var4.m_1581()) {
            var2.setReturnValue(var1);
         }
      }
   }

   @Unique
   private static BetterMinecraft betterMinecraft() {
      DimasikClient var0 = DimasikClient.m_9057();
      return var0 != null && var0.m_9049() != null && var0.m_9049().m_2801() != null ? var0.m_9049().m_2801().m_3478() : null;
   }

   @ModifyArg(method = "alignWithEntity", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Camera;getMaxZoom(F)F"), index = 0)
   private float customCameraZoom(float var1) {
      BetterMinecraft var2 = betterMinecraft();
      return var2 == null ? var1 : var2.m_5733(var1);
   }

   @ModifyArg(method = "alignWithEntity", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Camera;move(FFF)V", ordinal = 0), index = 2)
   private float customCameraShoulder(float var1) {
      BetterMinecraft var2 = betterMinecraft();
      return var2 != null && var2.m_5736() ? var2.f_16488.m_8768() : var1;
   }

   @ModifyArgs(method = "setupPerspective", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/Projection;setupPerspective(FFFFF)V"))
   private void dimasik$aspectRatio(Args var1) {
      float var2 = (Float)var1.get(3);
      float var3 = (Float)var1.get(4);
      Class_aY0wvCQAcpXsfK9C var4 = new Class_aY0wvCQAcpXsfK9C(var2 / var3);
      if (DimasikClient.m_9057() != null) {
         DimasikClient.m_9057().m_9051().m_9708(var4);
      }

      var1.set(3, var3 * var4.m_5909());
   }
}
