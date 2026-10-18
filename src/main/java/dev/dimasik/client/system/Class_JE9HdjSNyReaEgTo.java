package dev.dimasik.client.system;

import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;

public class Class_JE9HdjSNyReaEgTo {
   @Class_FUILRKIQ6wtWry59("isCrawling")
   public boolean m_3170(AbstractClientPlayer var1) {
      return var1.isVisuallyCrawling();
   }

   @Class_FUILRKIQ6wtWry59("isItemCoolingDown")
   public boolean m_3171(ItemStack var1, AbstractClientPlayer var2) {
      return var2.getCooldowns().isOnCooldown(var1);
   }

   @Class_FUILRKIQ6wtWry59("isUsingRiptide")
   public boolean m_3172(AbstractClientPlayer var1) {
      return var1.isAutoSpinAttack();
   }

   @Class_FUILRKIQ6wtWry59
   public double m_3173(AbstractClientPlayer var1) {
      return var1.getX();
   }

   @Class_FUILRKIQ6wtWry59("getPitch")
   public double m_3174(AbstractClientPlayer var1) {
      return var1.getXRot();
   }

   @Class_FUILRKIQ6wtWry59
   public double m_3175(AbstractClientPlayer var1) {
      return var1.getDeltaMovement().x();
   }

   @Class_FUILRKIQ6wtWry59("getSpeed")
   public double m_3176(AbstractClientPlayer var1) {
      return var1.getDeltaMovement().length();
   }

   @Class_FUILRKIQ6wtWry59
   public double m_3177(AbstractClientPlayer var1) {
      return var1.getDeltaMovement().z();
   }

   @Class_FUILRKIQ6wtWry59("getMainItem")
   public ItemStack m_3178(AbstractClientPlayer var1) {
      return var1.getMainHandItem();
   }

   @Class_FUILRKIQ6wtWry59("getOffhandItem")
   public ItemStack m_3179(AbstractClientPlayer var1) {
      return var1.getOffhandItem();
   }

   @Class_FUILRKIQ6wtWry59("getYaw")
   public double m_3180(AbstractClientPlayer var1) {
      return var1.getYRot();
   }

   @Class_FUILRKIQ6wtWry59("isOnGround")
   public boolean m_3181(AbstractClientPlayer var1) {
      return var1.onGround();
   }

   @Class_FUILRKIQ6wtWry59
   public boolean m_3182(AbstractClientPlayer var1) {
      return var1.isScoping();
   }

   @Class_FUILRKIQ6wtWry59
   public boolean m_3183(AbstractClientPlayer var1, int var2) {
      return var1.isPassenger();
   }

   @Class_FUILRKIQ6wtWry59
   public double m_3184(AbstractClientPlayer var1) {
      return var1.getHealth();
   }

   @Class_FUILRKIQ6wtWry59
   public boolean m_3185(AbstractClientPlayer var1) {
      return var1.isUnderWater();
   }

   @Class_FUILRKIQ6wtWry59("getSwingCount")
   public double m_3186(AbstractClientPlayer var1) {
      return var1 instanceof Class_YKVEPueVFZUF71Xd var2 ? var2.hMI5_0$getSwingCount() : 0.0;
   }

   @Class_FUILRKIQ6wtWry59
   public double m_3187(AbstractClientPlayer var1) {
      return var1.getY();
   }

   @Class_FUILRKIQ6wtWry59("isUsingItem")
   public boolean m_3188(AbstractClientPlayer var1) {
      return var1.isUsingItem();
   }

   @Class_FUILRKIQ6wtWry59("isSneaking")
   public boolean m_3189(AbstractClientPlayer var1) {
      return var1.isShiftKeyDown();
   }

   @Class_FUILRKIQ6wtWry59("getActiveHand")
   public InteractionHand m_3190(AbstractClientPlayer var1) {
      return var1.getUsedItemHand();
   }

   @Class_FUILRKIQ6wtWry59("isSwimming")
   public boolean m_3191(AbstractClientPlayer var1) {
      return var1.isSwimming();
   }

   @Class_FUILRKIQ6wtWry59
   public String m_3192(AbstractClientPlayer var1, int var2) {
      return var1.level().getBlockState(var1.blockPosition().below().below(var2)).getBlock().builtInRegistryHolder().getRegisteredName();
   }

   @Class_FUILRKIQ6wtWry59
   public double m_3193(AbstractClientPlayer var1) {
      return var1.getZ();
   }

   @Class_FUILRKIQ6wtWry59("getAge")
   public int m_3194(AbstractClientPlayer var1) {
      return var1.tickCount;
   }

   @Class_FUILRKIQ6wtWry59("isClimbing")
   public boolean m_3195(AbstractClientPlayer var1) {
      return var1.onClimbable();
   }

   @Class_FUILRKIQ6wtWry59
   public String m_3196(AbstractClientPlayer var1, int var2) {
      return var1.level().getBlockState(var1.blockPosition().above().above().above(var2)).getBlock().builtInRegistryHolder().getRegisteredName();
   }

   @Class_FUILRKIQ6wtWry59("getYSpeed")
   public double m_3197(AbstractClientPlayer var1) {
      return var1.getDeltaMovement().y();
   }

   @Class_FUILRKIQ6wtWry59("isTouchingWater")
   public boolean m_3198(AbstractClientPlayer var1) {
      return var1.isInWater();
   }

   @Class_FUILRKIQ6wtWry59
   public String m_3199(AbstractClientPlayer var1) {
      return var1.level().getBlockState(var1.blockPosition().below()).getBlock().builtInRegistryHolder().getRegisteredName();
   }
}
