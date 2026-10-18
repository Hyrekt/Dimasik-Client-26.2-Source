package dev.dimasik.mixin;

import dev.dimasik.client.module.render.BetterMinecraft;
import dev.dimasik.client.system.Class_kExOXkH43RbeAKdq;
import dev.dimasik.mixin.annotation.IfModLoaded;
import net.minecraft.core.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Coerce;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@IfModLoaded("sodium")
@Pseudo
@Mixin(targets = "net.caffeinemc.mods.sodium.client.render.chunk.RenderSection", remap = false)
public abstract class RenderSectionMixin implements Class_kExOXkH43RbeAKdq.cpNrSXK4DbPFap8e {
   @Unique
   private BlockPos dimasik$blockOrigin;
   @Unique
   private Class_kExOXkH43RbeAKdq.uQ9fNUWc63j0tkTA dimasik$animationRegion;

   @Shadow
   public abstract int getSectionIndex();

   @Shadow
   public abstract boolean isBuilt();

   @Shadow
   public abstract boolean isDisposed();

   @Inject(method = "<init>", at = @At("TAIL"))
   private void dimasik$trackSection(@Coerce Object var1, int var2, int var3, int var4, CallbackInfo var5) {
      this.dimasik$blockOrigin = new BlockPos(var2 << 4, var3 << 4, var4 << 4);
      this.dimasik$animationRegion = (Class_kExOXkH43RbeAKdq.uQ9fNUWc63j0tkTA)var1;
      this.dimasik$animationRegion.dimasik$sections()[this.getSectionIndex()] = this;
      BetterMinecraft var6 = Class_kExOXkH43RbeAKdq.m_7417();
      if (var6 != null && var6.m_776() && var6.f_16480.m_8768()) {
         var6.f_16484.m_4613(this, this.dimasik$blockOrigin);
      }
   }

   @Inject(method = "delete", at = @At("TAIL"))
   private void dimasik$forgetSection(CallbackInfo var1) {
      if (this.dimasik$animationRegion != null) {
         Class_kExOXkH43RbeAKdq.cpNrSXK4DbPFap8e[] var2 = this.dimasik$animationRegion.dimasik$sections();
         if (var2[this.getSectionIndex()] == (Object)this) {
            var2[this.getSectionIndex()] = null;
         }
      }
   }

   @Override
   public BlockPos dimasik$origin() {
      return this.dimasik$blockOrigin;
   }

   @Override
   public int dimasik$index() {
      return this.getSectionIndex();
   }

   @Override
   public boolean dimasik$hasMesh() {
      return this.isBuilt() && !this.isDisposed();
   }
}
