package dev.dimasik.client.system;

import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;

public class Class_kAwUR6aHTAAWiWAv extends Class_msKbTl6QleqYGoq3 {
   private static final double f_24800 = 100.0;
   private static final double f_24801 = 0.01;
   private static final String f_24802 = "hclip";
   private static final String f_24803 = "distance";
   private static final double f_24804 = 10000.0;
   private static final String f_24805 = "distance";

   public Class_kAwUR6aHTAAWiWAv() {
      super(f_24802);
   }

   private void m_7408(double var1, double var3) {
      if (Class_NzJrN63M7QBpmAbi.f_11537.player != null) {
         if (Double.isFinite(var1) && Double.isFinite(var3)) {
            Class_NzJrN63M7QBpmAbi.f_11537.player.setPos(var1, Class_NzJrN63M7QBpmAbi.f_11537.player.getY(), var3);
         }
      }
   }

   @Override
   public void build(LiteralArgumentBuilder<ClientSuggestionProvider> var1) {
      var1.then(this.m_7624(f_24803, DoubleArgumentType.doubleArg(1.0, f_24804)).executes(var1x -> {
         if (Class_NzJrN63M7QBpmAbi.f_11537.player == null) {
            return 0;
         }

         double var2 = DoubleArgumentType.getDouble(var1x, f_24805);
         if (!Double.isFinite(var2)) {
            return 0;
         }

         double var4 = Math.toRadians(Class_NzJrN63M7QBpmAbi.f_11537.player.getYRot());
         double var6 = Class_NzJrN63M7QBpmAbi.f_11537.player.getX() - Math.sin(var4) * var2;
         double var8 = Class_NzJrN63M7QBpmAbi.f_11537.player.getZ() + Math.cos(var4) * var2;
         this.m_7408(var6, var8);
         return 1;
      }));
   }
}
