package dev.dimasik.client.system;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class Class_VS8MzaIEcdhnbhlH extends Class_wrlOrPdKXkgHMuew {
   private final Class_kPXtxQj0j9mBpxqt f_15394 = new Class_kPXtxQj0j9mBpxqt();
   private boolean f_15395 = false;
   private static final String f_15396 = "Якорь";

   @Override
   public boolean m_1753() {
      if (!this.f_34675.m_9524().m_7145(f_15396)) {
         return false;
      } else {
         BlockState var1 = Class_6bKVgcECVOqgwJOX.m_1547(Blocks.RESPAWN_ANCHOR, Math.round(this.f_34675.m_9541().m_8768()));
         if (var1 != null) {
            this.f_15394.m_7442();
            this.f_15395 = true;
            return true;
         } else {
            return this.f_15395 && !this.f_15394.m_7443(this.f_34675.m_9536().m_8768().intValue());
         }
      }
   }
}
