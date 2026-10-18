package dev.dimasik.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.render.Hands;
import dev.dimasik.client.module.render.SwingAnimations;
import dev.dimasik.client.module.render.ViewModel;
import dev.dimasik.client.system.Class_DNgAQHvIOjv6AdJX;
import dev.dimasik.client.system.Class_KxBUtZUr1gpu62Tc;
import dev.dimasik.client.system.Class_LFCWJ1yB8IfrtaTe;
import dev.dimasik.client.system.Class_LRsxqvEkEcBPGPUf;
import dev.dimasik.client.system.Class_OadJxIIiAHkVgpNi;
import dev.dimasik.client.system.Class_RnKnITDbSPC9tZWL;
import dev.dimasik.client.system.Class_TEZjqunjD9Oo9nmP;
import dev.dimasik.client.system.Class_X574GcHt0SazS9zo;
import dev.dimasik.client.system.Class_YKVEPueVFZUF71Xd;
import dev.dimasik.client.system.Class_kEXcsyIrxlSEKaOA;
import dev.dimasik.client.system.Class_kmb9eogH8we2lnWk;
import dev.dimasik.client.system.Class_tjdtKxsAEogQMtun;
import dev.dimasik.client.system.Class_uGNFApwy8sUjPdk5;
import dev.dimasik.client.system.Class_uSt35kOUbtFe5Sh0;
import dev.dimasik.client.system.Class_uxCxe8d1qdBSkRXf;
import dev.dimasik.client.system.Class_vfCH9nEcAGy3E8bx;
import dev.dimasik.client.system.Class_xo2hAgsqCXlkjPQx;
import dev.dimasik.client.system.Class_zPTPeXzpzYUQVVGj;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.ItemInHandRenderer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.state.BellRenderState;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.component.DataComponents;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.LightCoordsUtil;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.entity.BellBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.properties.BellAttachType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = ItemInHandRenderer.class, priority = 1100)
public abstract class ItemInHandRendererMixin {
   @Shadow
   @Final
   private Minecraft minecraft;
   @Unique
   private boolean hmiMainHandSwitchEvent;
   @Unique
   private boolean hmiOffHandSwitchEvent;
   @Unique
   private Item hmiPrevMainHand = Items.AIR;
   @Unique
   private Item hmiPrevOffHand = Items.AIR;
   @Unique
   private final ArrayList<Class_uGNFApwy8sUjPdk5> hmiParticles = new ArrayList<>();
   @Unique
   private boolean hmiSwingMHand;
   @Unique
   private boolean hmiSwingOHand;
   @Unique
   private float hmiMainHandSwingProgress;
   @Unique
   private float hmiOffHandSwingProgress;
   private static final double f_36515 = 0.22;
   private static final double f_36516 = 0.25;
   private static final double f_36517 = 0.2;
   private static final String f_36518 = "torch";
   private static final double f_36519 = -0.05;
   private static final float f_36520 = 1.75F;
   private static final float f_36521 = 1.75F;
   private static final float f_36522 = 1.75F;
   private static final double f_36523 = -0.25;
   private static final double f_36524 = -0.05;
   private static final float f_36525 = 0.3F;
   private static final float f_36526 = 0.3F;
   private static final float f_36527 = 0.3F;
   private static final double f_36528 = -0.9;
   private static final double f_36529 = -0.45;
   private static final double f_36530 = -0.7;
   private static final float f_36531 = -0.3F;
   private static final float f_36532 = 0.3F;
   private static final float f_36533 = 0.3F;
   private static final float f_36534 = 0.3F;
   private static final double f_36535 = -0.9;
   private static final double f_36536 = -0.45;
   private static final double f_36537 = -0.7;
   private static final String f_36538 = "ITEM";
   private static final double f_36539 = -0.05;
   private static final double f_36540 = 0.2;
   private static final double f_36541 = 0.1;
   private static final float f_36542 = -12.0F;
   private static final String f_36543 = "ITEM";
   private static final String f_36544 = "SCREEN";
   private static final double f_36545 = -0.35;
   private static final double f_36546 = 0.2;
   private static final double f_36547 = 1.5;
   private static final double f_36548 = -0.3;
   private static final double f_36549 = -0.6;
   private static final float f_36550 = 15.0F;
   private static final float f_36551 = 0.5F;
   private static final float f_36552 = 0.5F;
   private static final float f_36553 = 0.5F;
   private static final float f_36554 = 35.0F;
   private static final float f_36555 = 0.5F;
   private static final float f_36556 = 0.5F;
   private static final float f_36557 = 0.5F;
   private static final float f_36558 = -65.0F;
   private static final float f_36559 = 0.5F;
   private static final float f_36560 = 0.5F;
   private static final float f_36561 = 0.5F;
   private static final float f_36562 = 0.9F;
   private static final float f_36563 = 0.9F;
   private static final float f_36564 = 0.9F;
   private static final double f_36565 = 0.5;
   private static final double f_36566 = -0.15;
   private static final double f_36567 = -0.85;
   private static final float f_36568 = 15.0F;
   private static final float f_36569 = 0.5F;
   private static final float f_36570 = 0.5F;
   private static final float f_36571 = 0.5F;
   private static final float f_36572 = 0.9F;
   private static final float f_36573 = 0.9F;
   private static final float f_36574 = 0.9F;
   private static final float f_36575 = -1.0F;
   private static final float f_36576 = -0.3F;
   private static final float f_36577 = (float) Math.PI;
   private static final float f_36578 = 0.4F;
   private static final float f_36579 = (float) (Math.PI * 2);
   private static final float f_36580 = -0.4F;
   private static final float f_36581 = (float) Math.PI;
   private static final float f_36582 = 0.64000005F;
   private static final float f_36583 = 0.6F;
   private static final float f_36584 = -0.6F;
   private static final float f_36585 = 0.71999997F;
   private static final float f_36586 = 45.0F;
   private static final float f_36587 = (float) Math.PI;
   private static final float f_36588 = (float) Math.PI;
   private static final float f_36589 = 70.0F;
   private static final float f_36590 = -20.0F;
   private static final float f_36591 = -1.0F;
   private static final float f_36592 = 3.6F;
   private static final float f_36593 = 3.5F;
   private static final float f_36594 = 120.0F;
   private static final float f_36595 = 200.0F;
   private static final float f_36596 = -135.0F;
   private static final float f_36597 = 5.6F;
   private static final String f_36598 = "Обычный";
   private static final String f_36599 = "HMI";

   @Shadow
   protected abstract void renderPlayerArm(PoseStack var1, SubmitNodeCollector var2, int var3, float var4, float var5, HumanoidArm var6);

   @Shadow
   protected abstract void submitArmWithItem(
      AbstractClientPlayer var1,
      float var2,
      float var3,
      InteractionHand var4,
      float var5,
      ItemStack var6,
      float var7,
      PoseStack var8,
      SubmitNodeCollector var9,
      int var10
   );

   @Shadow
   protected abstract void renderMap(PoseStack var1, SubmitNodeCollector var2, int var3, ItemStack var4);

   @Shadow
   public abstract void renderItem(LivingEntity var1, ItemStack var2, ItemDisplayContext var3, PoseStack var4, SubmitNodeCollector var5, int var6);

   @ModifyVariable(method = "submitArmWithItem", at = @At("HEAD"), argsOnly = true)
   private ItemStack replaceCosmeticItem(ItemStack var1) {
      return Class_xo2hAgsqCXlkjPQx.m_9508(var1);
   }

   @Inject(
      method = "submitArmWithItem",
      at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/vertex/PoseStack;pushPose()V", ordinal = 0, shift = Shift.AFTER)
   )
   private void applyViewModel(
      AbstractClientPlayer var1,
      float var2,
      float var3,
      InteractionHand var4,
      float var5,
      ItemStack var6,
      float var7,
      PoseStack var8,
      SubmitNodeCollector var9,
      int var10,
      CallbackInfo var11
   ) {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9051() != null) {
         DimasikClient.m_9057().m_9051().m_9708(new Class_RnKnITDbSPC9tZWL(var8, var6, var4));
      }

      ViewModel var12 = this.hmiViewModel();
      if (var12 != null && !Class_X574GcHt0SazS9zo.m_5499()) {
         var12.m_2848(var4, !var6.isEmpty(), var8);
      }
   }

   @Inject(
      method = "submitArmWithItem",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/ItemInHandRenderer;renderItem(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemDisplayContext;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;I)V"
      )
   )
   private void applyViewModelScale(
      AbstractClientPlayer var1,
      float var2,
      float var3,
      InteractionHand var4,
      float var5,
      ItemStack var6,
      float var7,
      PoseStack var8,
      SubmitNodeCollector var9,
      int var10,
      CallbackInfo var11
   ) {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
         ViewModel var12 = DimasikClient.m_9057().m_9049().m_2801().m_3546();
         if (var12 != null && var12.m_776()) {
            var12.m_2862(var4, var8);
         }
      }
   }

   @WrapOperation(
      method = "submitArmWithItem",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/ItemInHandRenderer;renderPlayerArm(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IFFLnet/minecraft/world/entity/HumanoidArm;)V"
      )
   )
   private void applyVanillaHandPartOffset(
      ItemInHandRenderer var1, PoseStack var2, SubmitNodeCollector var3, int var4, float var5, float var6, HumanoidArm var7, Operation<Void> var8
   ) {
      ViewModel var9 = this.hmiViewModel();
      if (var9 != null && !Class_X574GcHt0SazS9zo.m_5499()) {
         if (!ViewModel.m_2846()) {
            var8.call(new Object[]{var1, var2, var3, var4, var5, var6, var7});
         }
      } else {
         var8.call(new Object[]{var1, var2, var3, var4, var5, var6, var7});
      }
   }

   @WrapOperation(
      method = "submitArmWithItem",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/ItemInHandRenderer;renderItem(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemDisplayContext;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;I)V"
      )
   )
   private void applyVanillaItemPartOffset(
      ItemInHandRenderer var1,
      LivingEntity var2,
      ItemStack var3,
      ItemDisplayContext var4,
      PoseStack var5,
      SubmitNodeCollector var6,
      int var7,
      Operation<Void> var8
   ) {
      ViewModel var9 = this.hmiViewModel();
      if (var9 != null && !Class_X574GcHt0SazS9zo.m_5499()) {
         if (!ViewModel.m_2864()) {
            var8.call(new Object[]{var1, var2, var3, var4, var5, var6, var7});
         }
      } else {
         var8.call(new Object[]{var1, var2, var3, var4, var5, var6, var7});
      }
   }

   @Unique
   private ViewModel hmiViewModel() {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
         ViewModel var1 = DimasikClient.m_9057().m_9049().m_2801().m_3546();
         return var1 != null && var1.m_776() ? var1 : null;
      } else {
         return null;
      }
   }

   @Unique
   private InteractionHand hmiHand(HumanoidArm var1) {
      return this.minecraft.player != null && var1 == this.minecraft.player.getMainArm() ? InteractionHand.MAIN_HAND : InteractionHand.OFF_HAND;
   }

   @Redirect(
      method = "submitHandsWithItems(FLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/player/LocalPlayer;I)V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/ItemInHandRenderer;submitArmWithItem(Lnet/minecraft/client/player/AbstractClientPlayer;FFLnet/minecraft/world/InteractionHand;FLnet/minecraft/world/item/ItemStack;FLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;I)V"
      )
   )
   private void hmiRenderOverhaul(
      ItemInHandRenderer var1,
      AbstractClientPlayer var2,
      float var3,
      float var4,
      InteractionHand var5,
      float var6,
      ItemStack var7,
      float var8,
      PoseStack var9,
      SubmitNodeCollector var10,
      int var11
   ) {
      if (!Class_X574GcHt0SazS9zo.m_5499()) {
         this.submitArmWithItem(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
      } else if (!var2.isScoping()) {
         var7 = Class_xo2hAgsqCXlkjPQx.m_9508(var7);
         ((Class_kEXcsyIrxlSEKaOA)(Object)var7).hMI5_0$setTransform(-1);
         boolean var12 = var5 == InteractionHand.MAIN_HAND;
         boolean var13 = false;
         boolean var14 = false;
         if (var12 && var2.isUsingItem() && var2.getUsedItemHand() != var5) {
            ItemStack var15 = var2.getOffhandItem();
            if (var15.getUseAnimation() == ItemUseAnimation.BOW
               || var15.getUseAnimation() == ItemUseAnimation.BOW
               || var15.getUseAnimation() == ItemUseAnimation.CROSSBOW && !CrossbowItem.isCharged(var15)) {
               var7 = Items.AIR.getDefaultInstance();
            }
         }

         if (!var12 && var2.isUsingItem() && var2.getUsedItemHand() != var5) {
            ItemStack var32 = var2.getMainHandItem();
            if (var32.getUseAnimation() == ItemUseAnimation.BOW || var32.getUseAnimation() == ItemUseAnimation.CROSSBOW && !CrossbowItem.isCharged(var32)) {
               var7 = Items.AIR.getDefaultInstance();
            }
         }

         if (var12) {
            this.hmiMainHandSwitchEvent = var7.getItem() != this.hmiPrevMainHand;
         } else {
            this.hmiOffHandSwitchEvent = var7.getItem() != this.hmiPrevOffHand;
         }

         var9.pushPose();
         ViewModel var33 = DimasikClient.m_9057().m_9049().m_2801().m_3546();
         boolean var16 = var33 != null && var33.m_776();
         if (var16) {
            var33.m_2847(var5, var7, var9);
         }

         if (var2 instanceof Class_YKVEPueVFZUF71Xd var17) {
            this.hmiMainHandSwingProgress = var17.hMI5_0$getMainHandSwingProgress(var3);
            this.hmiOffHandSwingProgress = var17.hMI5_0$getOffHandSwingProgress(var3);
            var6 = var12 ? this.hmiMainHandSwingProgress : this.hmiOffHandSwingProgress;
            this.hmiSwingMHand = var17.hMI5_0$getMHandEvent();
            this.hmiSwingOHand = var17.hMI5_0$getOHandEvent();
            var13 = var12 ? var17.hMI5_0$getMInteract() : var17.hMI5_0$getOInteract();
            var14 = var17.hMI5_0$getBlockBreak();
         }

         HumanoidArm var34 = var12 ? var2.getMainArm() : var2.getMainArm().getOpposite();
         boolean var18 = var34 == HumanoidArm.RIGHT;
         int var19 = var18 ? 1 : -1;
         this.hmiScenePose(
            var9,
            var7,
            var18,
            var6,
            var8,
            var2,
            var12,
            var5,
            this.hmiMainHandSwingProgress,
            this.hmiOffHandSwingProgress,
            this.hmiMainHandSwitchEvent,
            this.hmiOffHandSwitchEvent,
            this.hmiSwingMHand,
            this.hmiSwingOHand,
            var13,
            var14,
            this.hmiParticles
         );
         var9.pushPose();
         this.hmiHandRelativePose(
            var9,
            var7,
            var18,
            var6,
            var8,
            var2,
            var12,
            var5,
            this.hmiMainHandSwingProgress,
            this.hmiOffHandSwingProgress,
            this.hmiMainHandSwitchEvent,
            this.hmiOffHandSwitchEvent,
            this.hmiSwingMHand,
            this.hmiSwingOHand,
            var13,
            var14,
            this.hmiParticles
         );
         int var20 = LightCoordsUtil.lightCoordsWithEmission(var11, Block.byItem(var7.getItem()).defaultBlockState().getLightEmission());
         if (!ViewModel.m_2846()) {
            if (var16) {
               var33.m_2849(var5, false, var9);
            }

            if (var2.isInvisible()) {
               this.hmiApplyArmMatrices(var9, var20, 0.0F, 0.0F, var34);
            } else {
               this.renderPlayerArm(var9, var10, var20, 0.0F, 0.0F, var34);
            }
         }

         var9.popPose();
         var9.pushPose();
         if (var16) {
            var33.m_2849(var5, true, var9);
         }

         Block var21 = Block.byItem(var7.getItem());
         BlockState var22 = var21.defaultBlockState();
         boolean var23 = var21 != Blocks.AIR
            && !var22.is(BlockTags.INSIDE_STEP_SOUND_BLOCKS)
            && !var22.is(BlockTags.CROPS)
            && var7.getUseAnimation() != ItemUseAnimation.EAT
            && !var7.is(Items.REDSTONE)
            && !var7.is(ItemTags.BANNERS)
            && !var7.is(ItemTags.SKULLS)
            && Class_LRsxqvEkEcBPGPUf.f_10578.getOrDefault(var7.getItem().toString(), true);
         if (!ViewModel.m_2864() && var23) {
            var6 = 0.0F;
            BlockState var36 = var22;
            this.hmiItemPose(
               var9,
               var7,
               var18,
               var6,
               var2,
               var12,
               var5,
               var8,
               this.hmiMainHandSwingProgress,
               this.hmiOffHandSwingProgress,
               this.hmiMainHandSwitchEvent,
               this.hmiOffHandSwitchEvent,
               this.hmiSwingMHand,
               this.hmiSwingOHand,
               var13,
               var14,
               this.hmiParticles
            );
            var9.translate(f_36515 * var19, f_36516, f_36517);
            if (var7.is(Items.LEVER) || var36.is(BlockTags.BUTTONS)) {
               var36 = (BlockState)var36.setValue(BlockStateProperties.ATTACH_FACE, AttachFace.FLOOR);
            }

            String var37 = var7.getHoverName().toString().toLowerCase();
            if (!var37.contains(f_36518) && !(var21 instanceof LanternBlock) && !var36.is(BlockTags.ALL_HANGING_SIGNS)) {
               var9.translate(f_36523 * var19, f_36524, 0.0);
            } else {
               var9.translate(f_36519 * var19, 0.0, 0.0);
               var9.scale(f_36520, f_36521, f_36522);
            }

            var9.pushPose();
            var9.scale(f_36525, f_36526, f_36527);
            var9.translate(f_36528 * var19, f_36529, f_36530);
            var9.popPose();
            if (!var18) {
               var9.translate(f_36531, 0.0F, 0.0F);
            }

            var9.scale(f_36532, f_36533, f_36534);
            var9.translate(f_36535 * var19, f_36536, f_36537);
            if (var16) {
               var33.m_2862(var5, var9);
            }

            if (var7.is(Items.BELL)) {
               BellBlockEntity var26 = new BellBlockEntity(BlockPos.ZERO, Blocks.BELL.defaultBlockState());
               BellRenderState var27 = new BellRenderState();
               var27.lightCoords = var11;
               BlockEntityRenderer var28 = this.minecraft.getBlockEntityRenderDispatcher().getRenderer(var26);
               var28.submit(var27, var9, var10, new CameraRenderState());
               BlockState var29 = (BlockState)Blocks.BELL.defaultBlockState().setValue(BlockStateProperties.BELL_ATTACHMENT, BellAttachType.CEILING);
               Class_TEZjqunjD9Oo9nmP.f_13952.m_4944(var29, var9, var10, var11, this.minecraft.level, var2);
            } else {
               if (var36.hasProperty(BlockStateProperties.DOUBLE_BLOCK_HALF)) {
                  var9.pushPose();
                  var9.translate(0.0F, 1.0F, 0.0F);
                  Class_TEZjqunjD9Oo9nmP.f_13952
                     .m_4944(
                        (BlockState)var36.setValue(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.UPPER),
                        var9,
                        var10,
                        var11,
                        this.minecraft.level,
                        var2
                     );
                  var9.popPose();
               }

               Class_TEZjqunjD9Oo9nmP.f_13952.m_4944(var36, var9, var10, var11, this.minecraft.level, var2);
            }

            var9.pushPose();
            if (!var18) {
               var9.translate(1.0F, 0.0F, 0.0F);
            }

            Class_uSt35kOUbtFe5Sh0.m_9195(this.hmiParticles, var9, var10, f_36538, var5, var11, var2, var3);
            var9.popPose();
         } else if (!ViewModel.m_2864()
            && (
               var7.getUseAnimation() == ItemUseAnimation.BLOCK
                  || var7.getUseAnimation() == ItemUseAnimation.BRUSH
                  || var7.getUseAnimation() == ItemUseAnimation.TRIDENT
            )) {
            this.hmiItemPose(
               var9,
               var7,
               var18,
               var6,
               var2,
               var12,
               var5,
               var8,
               this.hmiMainHandSwingProgress,
               this.hmiOffHandSwingProgress,
               this.hmiMainHandSwitchEvent,
               this.hmiOffHandSwitchEvent,
               this.hmiSwingMHand,
               this.hmiSwingOHand,
               var13,
               var14,
               this.hmiParticles
            );
            if (var16) {
               var33.m_2862(var5, var9);
            }

            ItemStack var35 = new ItemStack(var7.getItem(), var7.getCount());
            this.hmiCopyAppearanceComponents(var7, var35);
            ItemStack var25 = var12 ? Class_LRsxqvEkEcBPGPUf.f_10588 : Class_LRsxqvEkEcBPGPUf.f_10589;
            if (!var25.is(Items.AIR)) {
               var35 = var25;
            }

            Class_kmb9eogH8we2lnWk.m_7474(var7);
            Class_DNgAQHvIOjv6AdJX.m_2451(this.hmiContext(var18, var6, var2, var5, var12, var8, var13, var14, var7), var7);
            this.renderItem(var2, var35, var18 ? ItemDisplayContext.THIRD_PERSON_RIGHT_HAND : ItemDisplayContext.THIRD_PERSON_LEFT_HAND, var9, var10, var11);
         } else if (!ViewModel.m_2864()) {
            this.hmiItemPose(
               var9,
               var7,
               var18,
               var6,
               var2,
               var12,
               var5,
               var8,
               this.hmiMainHandSwingProgress,
               this.hmiOffHandSwingProgress,
               this.hmiMainHandSwitchEvent,
               this.hmiOffHandSwitchEvent,
               this.hmiSwingMHand,
               this.hmiSwingOHand,
               var13,
               var14,
               this.hmiParticles
            );
            if (var7.has(DataComponents.MAP_ID)) {
               var9.pushPose();
               var9.translate(f_36539 * var19, f_36540, f_36541);
               var9.mulPose(Axis.YP.rotationDegrees(f_36542 * var19));
               if (var16) {
                  var33.m_2862(var5, var9);
               }

               this.renderMap(var9, var10, var11, var7);
               var9.popPose();
            } else {
               ItemStack var24 = var12 ? Class_LRsxqvEkEcBPGPUf.f_10588 : Class_LRsxqvEkEcBPGPUf.f_10589;
               if (var24.is(Items.AIR)) {
                  var24 = var7;
               }

               Class_kmb9eogH8we2lnWk.m_7474(var7);
               Class_DNgAQHvIOjv6AdJX.m_2451(this.hmiContext(var18, var6, var2, var5, var12, var8, var13, var14, var7), var7);
               if (var16) {
                  var33.m_2862(var5, var9);
               }

               this.renderItem(var2, var24, var18 ? ItemDisplayContext.THIRD_PERSON_RIGHT_HAND : ItemDisplayContext.THIRD_PERSON_LEFT_HAND, var9, var10, var11);
            }

            if (var18) {
               Class_tjdtKxsAEogQMtun.f_32094.set(var9.last().pose());
            } else {
               Class_tjdtKxsAEogQMtun.f_32095.set(var9.last().pose());
            }

            var9.pushPose();
            Class_uSt35kOUbtFe5Sh0.m_9195(this.hmiParticles, var9, var10, f_36543, var5, var11, var2, var3);
            var9.popPose();
         }

         var9.popPose();
         var9.popPose();
         if (var12) {
            this.hmiPrevMainHand = var7.getItem();
         } else {
            this.hmiPrevOffHand = var7.getItem();
         }

         if (!ViewModel.f_7981 && !Hands.f_28498) {
            var9.pushPose();
            Class_uSt35kOUbtFe5Sh0.m_9195(this.hmiParticles, var9, var10, f_36544, var5, var11, var2, var3);
            var9.popPose();
         }

         Class_tjdtKxsAEogQMtun.f_32096 = var3;
         Class_LRsxqvEkEcBPGPUf.f_10589 = Items.AIR.getDefaultInstance();
         Class_LRsxqvEkEcBPGPUf.f_10588 = Items.AIR.getDefaultInstance();
      }
   }

   @Unique
   private Class_OadJxIIiAHkVgpNi hmiContext(
      boolean var1, float var2, AbstractClientPlayer var3, InteractionHand var4, boolean var5, float var6, boolean var7, boolean var8, ItemStack var9
   ) {
      return new Class_OadJxIIiAHkVgpNi(
         var1,
         var2,
         var3,
         var4,
         var5,
         Class_tjdtKxsAEogQMtun.f_32100,
         var6,
         this.hmiMainHandSwingProgress,
         this.hmiOffHandSwingProgress,
         this.hmiMainHandSwitchEvent,
         this.hmiOffHandSwitchEvent,
         this.hmiSwingMHand,
         this.hmiSwingOHand,
         var7,
         var8,
         var9
      );
   }

   @Unique
   private void hmiScenePose(
      PoseStack var1,
      ItemStack var2,
      boolean var3,
      float var4,
      float var5,
      AbstractClientPlayer var6,
      boolean var7,
      InteractionHand var8,
      float var9,
      float var10,
      boolean var11,
      boolean var12,
      boolean var13,
      boolean var14,
      boolean var15,
      boolean var16,
      List<Class_uGNFApwy8sUjPdk5> var17
   ) {
      this.hmiExecute(
         Class_uxCxe8d1qdBSkRXf.f_33272, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17
      );

      for (Class_vfCH9nEcAGy3E8bx var19 : Class_uxCxe8d1qdBSkRXf.f_33268) {
         this.hmiExecute(var19, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17);
      }

      if (!var2.isEmpty()) {
         var1.translate(0.0, f_36545, f_36546);
      }
   }

   @Unique
   private void hmiHandRelativePose(
      PoseStack var1,
      ItemStack var2,
      boolean var3,
      float var4,
      float var5,
      AbstractClientPlayer var6,
      boolean var7,
      InteractionHand var8,
      float var9,
      float var10,
      boolean var11,
      boolean var12,
      boolean var13,
      boolean var14,
      boolean var15,
      boolean var16,
      List<Class_uGNFApwy8sUjPdk5> var17
   ) {
      int var18 = var3 ? 1 : -1;
      this.hmiExecute(
         Class_uxCxe8d1qdBSkRXf.f_33273, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17
      );

      for (Class_vfCH9nEcAGy3E8bx var20 : Class_uxCxe8d1qdBSkRXf.f_33269) {
         this.hmiExecute(var20, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17);
      }

      if (!var2.isEmpty()) {
         var1.translate(f_36547 * var18, f_36548, f_36549);
         var1.rotateAround(Axis.XP.rotationDegrees(f_36550), f_36551 * var18, f_36552, f_36553);
         var1.rotateAround(Axis.YP.rotationDegrees(f_36554 * var18), f_36555 * var18, f_36556, f_36557);
         var1.rotateAround(Axis.ZP.rotationDegrees(f_36558 * var18), f_36559 * var18, f_36560, f_36561);
         var1.scale(f_36562, f_36563, f_36564);
      }
   }

   @Unique
   private void hmiItemPose(
      PoseStack var1,
      ItemStack var2,
      boolean var3,
      float var4,
      AbstractClientPlayer var5,
      boolean var6,
      InteractionHand var7,
      float var8,
      float var9,
      float var10,
      boolean var11,
      boolean var12,
      boolean var13,
      boolean var14,
      boolean var15,
      boolean var16,
      List<Class_uGNFApwy8sUjPdk5> var17
   ) {
      int var18 = var3 ? 1 : -1;
      var1.translate(f_36565 * var18, f_36566, f_36567);
      var1.rotateAround(Axis.XP.rotationDegrees(f_36568), f_36569, f_36570, f_36571);
      var1.scale(f_36572, f_36573, f_36574);
      this.hmiExecute(
         Class_uxCxe8d1qdBSkRXf.f_33274, var1, var2, var3, var4, var8, var5, var6, var7, var9, var10, var11, var12, var13, var14, var15, var16, var17
      );

      for (Class_vfCH9nEcAGy3E8bx var20 : Class_uxCxe8d1qdBSkRXf.f_33270) {
         this.hmiExecute(var20, var1, var2, var3, var4, var8, var5, var6, var7, var9, var10, var11, var12, var13, var14, var15, var16, var17);
      }
   }

   @Unique
   private void hmiExecute(
      Class_vfCH9nEcAGy3E8bx var1,
      PoseStack var2,
      ItemStack var3,
      boolean var4,
      float var5,
      float var6,
      AbstractClientPlayer var7,
      boolean var8,
      InteractionHand var9,
      float var10,
      float var11,
      boolean var12,
      boolean var13,
      boolean var14,
      boolean var15,
      boolean var16,
      boolean var17,
      List<Class_uGNFApwy8sUjPdk5> var18
   ) {
      if (var1 != null) {
         var1.m_9259(
            var2,
            var4,
            Class_LRsxqvEkEcBPGPUf.f_10584,
            var5,
            var3,
            var7,
            var9,
            var8,
            Class_tjdtKxsAEogQMtun.f_32100,
            var6,
            var10,
            var11,
            var12,
            var13,
            var14,
            var15,
            var16,
            var17,
            var18
         );
      }
   }

   @Unique
   private void hmiApplyArmMatrices(PoseStack var1, int var2, float var3, float var4, HumanoidArm var5) {
      boolean var6 = var5 != HumanoidArm.LEFT;
      float var7 = var6 ? 1.0F : f_36575;
      float var8 = Mth.sqrt(var4);
      float var9 = f_36576 * Mth.sin(var8 * f_36577);
      float var10 = f_36578 * Mth.sin(var8 * f_36579);
      float var11 = f_36580 * Mth.sin(var4 * f_36581);
      var1.translate(var7 * (var9 + f_36582), var10 - f_36583 + var3 * f_36584, var11 - f_36585);
      var1.mulPose(Axis.YP.rotationDegrees(var7 * f_36586));
      float var12 = Mth.sin(var4 * var4 * f_36587);
      float var13 = Mth.sin(var8 * f_36588);
      var1.mulPose(Axis.YP.rotationDegrees(var7 * var13 * f_36589));
      var1.mulPose(Axis.ZP.rotationDegrees(var7 * var12 * f_36590));
      var1.translate(var7 * f_36591, f_36592, f_36593);
      var1.mulPose(Axis.ZP.rotationDegrees(var7 * f_36594));
      var1.mulPose(Axis.XP.rotationDegrees(f_36595));
      var1.mulPose(Axis.YP.rotationDegrees(var7 * f_36596));
      var1.translate(var7 * f_36597, 0.0F, 0.0F);
   }

   @Unique
   private void hmiCopyAppearanceComponents(ItemStack var1, ItemStack var2) {
      hmiCopyComponent(var1, var2, DataComponents.ENCHANTMENTS);
      hmiCopyComponent(var1, var2, DataComponents.ITEM_MODEL);
      hmiCopyComponent(var1, var2, DataComponents.CUSTOM_MODEL_DATA);
      hmiCopyComponent(var1, var2, DataComponents.CUSTOM_DATA);
   }

   @Unique
   private static <T> void hmiCopyComponent(ItemStack var0, ItemStack var1, DataComponentType<T> var2) {
      if (var0.has(var2)) {
         var1.set(var2, var0.get(var2));
      }
   }

   @ModifyExpressionValue(
      method = "submitHandsWithItems(FLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/player/LocalPlayer;I)V",
      at = @At(value = "FIELD", target = "Lnet/minecraft/client/renderer/ItemInHandRenderer$HandRenderSelection;renderMainHand:Z")
   )
   private boolean hmiRenderMainHand(boolean var1) {
      return Class_X574GcHt0SazS9zo.m_5499() || var1;
   }

   @ModifyExpressionValue(
      method = "submitHandsWithItems(FLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/player/LocalPlayer;I)V",
      at = @At(value = "FIELD", target = "Lnet/minecraft/client/renderer/ItemInHandRenderer$HandRenderSelection;renderOffHand:Z")
   )
   private boolean hmiRenderOffHand(boolean var1) {
      return Class_X574GcHt0SazS9zo.m_5499() || var1;
   }

   @Redirect(
      method = "submitHandsWithItems(FLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/player/LocalPlayer;I)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/player/LocalPlayer;getViewYRot(F)F")
   )
   public float redirectYaw(LocalPlayer var1, float var2) {
      return DimasikClient.m_9057().m_9052().m_6342().m_2666().x;
   }

   @Redirect(
      method = "submitHandsWithItems(FLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/player/LocalPlayer;I)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/player/LocalPlayer;getViewXRot(F)F")
   )
   public float redirectPitch(LocalPlayer var1, float var2) {
      return DimasikClient.m_9057().m_9052().m_6342().m_2666().y;
   }

   @Redirect(
      method = "submitHandsWithItems(FLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/player/LocalPlayer;I)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/util/Mth;lerp(FFF)F", ordinal = 0)
   )
   public float redirectRenderPitch(float var1, float var2, float var3) {
      return Mth.lerp(var1, DimasikClient.m_9057().m_9052().m_6342().m_2650().y, DimasikClient.m_9057().m_9052().m_6342().m_2649().y);
   }

   @Redirect(
      method = "submitHandsWithItems(FLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/player/LocalPlayer;I)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/util/Mth;lerp(FFF)F", ordinal = 1)
   )
   public float redirectRenderYaw(float var1, float var2, float var3) {
      return Mth.lerp(var1, DimasikClient.m_9057().m_9052().m_6342().m_2650().x, DimasikClient.m_9057().m_9052().m_6342().m_2649().x);
   }

   @Inject(
      method = "submitHandsWithItems(FLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/player/LocalPlayer;I)V",
      at = @At("HEAD")
   )
   private void beginHandsCapture(float var1, PoseStack var2, SubmitNodeCollector var3, LocalPlayer var4, int var5, CallbackInfo var6) {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
         Hands var7 = DimasikClient.m_9057().m_9049().m_2801().m_3577();
         ViewModel var8 = DimasikClient.m_9057().m_9049().m_2801().m_3546();
         boolean var9 = var8 != null && var8.m_2854();
         if (!var9 && var7 != null) {
            var7.m_8115();
         }
      }
   }

   @Inject(method = "swingArm", at = @At("HEAD"), cancellable = true)
   private void swingArm(float var1, PoseStack var2, int var3, HumanoidArm var4, CallbackInfo var5) {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9051() != null) {
         Class_KxBUtZUr1gpu62Tc var6 = new Class_KxBUtZUr1gpu62Tc(var2, var4, var1);
         DimasikClient.m_9057().m_9051().m_9708(var6);
         if (var6.m_1581()) {
            var5.cancel();
         }
      }
   }

   @Inject(method = "applyItemArmAttackTransform", at = @At("HEAD"), cancellable = true)
   private void cancelVanillaSwingOffset(PoseStack var1, HumanoidArm var2, float var3, CallbackInfo var4) {
      if (this.isSwingAnimationsEnabled()) {
         var4.cancel();
      }
   }

   @ModifyVariable(method = "applyItemArmTransform", at = @At("HEAD"), argsOnly = true, ordinal = 0)
   private float removeEquipProgress(float var1) {
      return this.isSwingAnimationsEnabled() ? 0.0F : var1;
   }

   @Unique
   private boolean isSwingAnimationsEnabled() {
      DimasikClient var1 = DimasikClient.m_9057();
      if (var1 != null && var1.m_9049() != null && var1.m_9049().m_2801() != null) {
         SwingAnimations var2 = var1.m_9049().m_2801().m_3563();
         if (var2 == null || !var2.m_776() || var2.f_24134.m_7568(f_36598)) {
            return false;
         } else if (var2.f_24134.m_7568(f_36599)) {
            return true;
         } else {
            return !var2.m_7285() ? false : !var2.f_24141.m_8768() || DimasikClient.m_9057().m_9049().m_2801().m_3576().m_1114() != null;
         }
      } else {
         return false;
      }
   }

   @ModifyConstant(method = "applyEatTransform", constant = @Constant(floatValue = 0.1F))
   private float modifyEatBobbing(float var1) {
      Class_LFCWJ1yB8IfrtaTe var2 = new Class_LFCWJ1yB8IfrtaTe(var1);
      DimasikClient.m_9057().m_9051().m_9708(var2);
      return var2.m_3623();
   }

   @ModifyExpressionValue(
      method = "tick",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/player/LocalPlayer;getMainHandItem()Lnet/minecraft/world/item/ItemStack;")
   )
   private ItemStack replaceMainHandStack(ItemStack var1) {
      if (this.minecraft.player == null) {
         return var1;
      }

      Class_zPTPeXzpzYUQVVGj var2 = Class_zPTPeXzpzYUQVVGj.f_36113.m_9819(this.minecraft.player, var1);
      DimasikClient.m_9057().m_9051().m_9708(var2);
      return var2.m_9811();
   }
}
