package dev.dimasik.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.system.Class_zPTPeXzpzYUQVVGj;
import net.minecraft.client.renderer.entity.state.ArmedEntityRenderState;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ArmedEntityRenderState.class)
public abstract class ArmedEntityRenderStateMixin {
   @ModifyExpressionValue(
      method = "extractArmedEntityRenderState",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/entity/LivingEntity;getItemHeldByArm(Lnet/minecraft/world/entity/HumanoidArm;)Lnet/minecraft/world/item/ItemStack;",
         ordinal = 0
      )
   )
   private static ItemStack replaceRightArmStack(ItemStack var0, LivingEntity var1) {
      Class_zPTPeXzpzYUQVVGj var2 = Class_zPTPeXzpzYUQVVGj.f_36113.m_9810(var1, HumanoidArm.RIGHT, var0);
      DimasikClient.m_9057().m_9051().m_9708(var2);
      return var2.m_9811();
   }

   @ModifyExpressionValue(
      method = "extractArmedEntityRenderState",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/entity/LivingEntity;getItemHeldByArm(Lnet/minecraft/world/entity/HumanoidArm;)Lnet/minecraft/world/item/ItemStack;",
         ordinal = 1
      )
   )
   private static ItemStack replaceLeftArmStack(ItemStack var0, LivingEntity var1) {
      Class_zPTPeXzpzYUQVVGj var2 = Class_zPTPeXzpzYUQVVGj.f_36113.m_9810(var1, HumanoidArm.LEFT, var0);
      DimasikClient.m_9057().m_9051().m_9708(var2);
      return var2.m_9811();
   }
}
