package dev.dimasik.mixin;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.Optimization;
import dev.dimasik.client.module.movement.NoWebController;
import dev.dimasik.client.system.Class_nulhzpfOWV9d1NBW;
import dev.dimasik.client.system.Class_rj7yTIJUyflxIxTs;
import dev.dimasik.client.system.Class_xYKqykPYp6IuC6PX;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.VegetationBlock;
import net.minecraft.world.level.block.WebBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.BlockStateBase;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockStateBase.class)
public abstract class BlockBehaviour_BlockStateBaseMixin {
   @Inject(method = "getRenderShape", at = @At("HEAD"), cancellable = true)
   private void onGetRenderType(CallbackInfoReturnable<RenderShape> var1) {
      BlockState var2 = (BlockState)(Object)this;
      if (var2.getBlock() instanceof VegetationBlock && (Optimization.m_5852() || Class_nulhzpfOWV9d1NBW.m_7706(Class_xYKqykPYp6IuC6PX.QfQnMomAbf3hjvZP.GRASS))
         )
       {
         var1.setReturnValue(RenderShape.INVISIBLE);
      }
   }

   @Inject(
      method = "getShape(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/shapes/CollisionContext;)Lnet/minecraft/world/phys/shapes/VoxelShape;",
      at = @At("HEAD"),
      cancellable = true
   )
   private void onGetOutlineShape(BlockGetter var1, BlockPos var2, CollisionContext var3, CallbackInfoReturnable<VoxelShape> var4) {
      if (this.isCobwebBypass()) {
         var4.setReturnValue(Shapes.empty());
      }
   }

   @Inject(
      method = "getCollisionShape(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/shapes/CollisionContext;)Lnet/minecraft/world/phys/shapes/VoxelShape;",
      at = @At("HEAD"),
      cancellable = true
   )
   private void fullRwCollision(BlockGetter var1, BlockPos var2, CollisionContext var3, CallbackInfoReturnable<VoxelShape> var4) {
      if (Class_rj7yTIJUyflxIxTs.m_8451(var2)) {
         var4.setReturnValue(Shapes.empty());
      }
   }

   @Inject(
      method = "getCollisionShape(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/shapes/VoxelShape;",
      at = @At("HEAD"),
      cancellable = true
   )
   private void fullRwCollisionNoContext(BlockGetter var1, BlockPos var2, CallbackInfoReturnable<VoxelShape> var3) {
      if (Class_rj7yTIJUyflxIxTs.m_8451(var2)) {
         var3.setReturnValue(Shapes.empty());
      }
   }

   @Inject(method = "getInteractionShape", at = @At("HEAD"), cancellable = true)
   private void onGetRaycastShape(BlockGetter var1, BlockPos var2, CallbackInfoReturnable<VoxelShape> var3) {
      if (this.isCobwebBypass()) {
         var3.setReturnValue(Shapes.empty());
      }
   }

   private boolean isCobwebBypass() {
      BlockState var1 = (BlockState)(Object)this;
      if (!(var1.getBlock() instanceof WebBlock)) {
         return false;
      }

      if (DimasikClient.m_9057() == null) {
         return false;
      }

      NoWebController var2 = DimasikClient.m_9057().m_9049().m_2801().m_3588();
      return var2 != null && var2.m_776();
   }
}
