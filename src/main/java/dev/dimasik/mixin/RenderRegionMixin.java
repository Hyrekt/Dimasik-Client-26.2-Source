package dev.dimasik.mixin;

import dev.dimasik.client.system.Class_kExOXkH43RbeAKdq;
import dev.dimasik.mixin.annotation.IfModLoaded;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Unique;

@IfModLoaded("sodium")
@Pseudo
@Mixin(targets = "net.caffeinemc.mods.sodium.client.render.chunk.region.RenderRegion", remap = false)
public class RenderRegionMixin implements Class_kExOXkH43RbeAKdq.uQ9fNUWc63j0tkTA {
   @Unique
   private final Class_kExOXkH43RbeAKdq.cpNrSXK4DbPFap8e[] dimasik$animatedSections = new Class_kExOXkH43RbeAKdq.cpNrSXK4DbPFap8e[256];

   @Override
   public Class_kExOXkH43RbeAKdq.cpNrSXK4DbPFap8e[] dimasik$sections() {
      return this.dimasik$animatedSections;
   }
}
