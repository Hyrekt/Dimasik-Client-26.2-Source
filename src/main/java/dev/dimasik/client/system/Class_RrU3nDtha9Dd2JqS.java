package dev.dimasik.client.system;

import dev.dimasik.client.module.render.BetterMinecraft;
import java.util.WeakHashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.chunk.SectionRenderDispatcher.RenderSection;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.phys.Vec3;

public final class Class_RrU3nDtha9Dd2JqS {
   private final Minecraft f_12815 = Minecraft.getInstance();
   private final WeakHashMap<Object, Class_RrU3nDtha9Dd2JqS.T7ql4SwJCvjyKG8P> f_12816 = new WeakHashMap<>();
   private ClientLevel f_12817;
   private static final String f_12818 = "По направлению";
   private static final double f_12819 = 1000000.0;
   private static final String f_12820 = "От горизонта";
   private static final String f_12821 = "Снизу";
   private static final String f_12822 = "Сверху";
   private static final String f_12823 = "Сверху";
   private static final String f_12824 = "От игрока";
   private static final String f_12825 = "По направлению";
   private static final double f_12826 = 8.0;
   private static final double f_12827 = 8.0;
   private static final String f_12828 = "Quad";
   private static final String f_12829 = "Cubic";
   private static final String f_12830 = "Quart";
   private static final String f_12831 = "Quint";
   private static final String f_12832 = "Expo";
   private static final String f_12833 = "Sine";
   private static final String f_12834 = "Circ";
   private static final String f_12835 = "Back";
   private static final String f_12836 = "Bounce";
   private static final String f_12837 = "Elastic";

   public void m_4613(Object var1, BlockPos var2) {
      this.m_4614();
      if (this.f_12815.player != null && this.f_12815.level != null) {
         this.f_12816.put(var1, new Class_RrU3nDtha9Dd2JqS.T7ql4SwJCvjyKG8P(var2.asLong(), this.m_4616(var2)));
      }
   }

   private void m_4614() {
      if (this.f_12817 != this.f_12815.level) {
         this.f_12816.clear();
         this.f_12817 = this.f_12815.level;
      }
   }

   public void m_4615() {
      this.f_12816.clear();
      this.f_12817 = null;
   }

   private Direction m_4616(BlockPos var1) {
      double var2 = this.f_12815.player.getX() - var1.getX() - f_12826;
      double var4 = this.f_12815.player.getZ() - var1.getZ() - f_12827;
      return Math.abs(var2) > Math.abs(var4) ? (var2 > 0.0 ? Direction.EAST : Direction.WEST) : (var4 > 0.0 ? Direction.SOUTH : Direction.NORTH);
   }

   public void m_4617(RenderSection var1) {
      this.m_4613(var1, var1.getRenderOrigin());
   }

   public static double m_4618(String var0, double var1) {
      double var3 = Math.clamp(var1, 0.0, 1.0);

      return switch (var0) {
         case f_12828 -> Class_eXr9Fra2ad3yFXY8.f_19097.m_4476(var3);
         case f_12829 -> Class_eXr9Fra2ad3yFXY8.f_19100.m_4476(var3);
         case f_12830 -> Class_eXr9Fra2ad3yFXY8.f_19103.m_4476(var3);
         case f_12831 -> Class_eXr9Fra2ad3yFXY8.f_19106.m_4476(var3);
         case f_12832 -> Class_eXr9Fra2ad3yFXY8.f_19118.m_4476(var3);
         case f_12833 -> Class_eXr9Fra2ad3yFXY8.f_19109.m_4476(var3);
         case f_12834 -> Math.sqrt(1.0 - (var3 - 1.0) * (var3 - 1.0));
         case f_12835 -> Class_eXr9Fra2ad3yFXY8.f_19121.m_4476(var3);
         case f_12836 -> Class_eXr9Fra2ad3yFXY8.f_19123.m_4476(var3);
         case f_12837 -> Class_eXr9Fra2ad3yFXY8.f_19115.m_4476(var3);
         default -> var3;
      };
   }

   public Vec3 m_4619(RenderSection var1, BetterMinecraft var2) {
      return this.m_4620(var1, var1.getRenderOrigin(), var2);
   }

   public Vec3 m_4620(Object var1, BlockPos var2, BetterMinecraft var3) {
      this.m_4614();
      if (var3.m_776() && var3.f_16480.m_8768() && this.f_12815.player != null && this.f_12815.level != null) {
         Class_RrU3nDtha9Dd2JqS.T7ql4SwJCvjyKG8P var4 = this.f_12816.get(var1);
         if (var4 == null || var4.f_12812 != var2.asLong()) {
            this.m_4613(var1, var2);
            var4 = this.f_12816.get(var1);
         }

         long var5 = System.nanoTime();
         if (var4.f_12813 == 0L) {
            var4.f_12813 = var5;
            if (var3.f_16482.m_7568(f_12818)) {
               var4.f_12814 = this.m_4616(var2);
            }
         }

         double var7 = Math.min(1.0, (var5 - var4.f_12813) / (var3.f_16481.m_8768().floatValue() * f_12819));
         if (var7 >= 1.0) {
            return Vec3.ZERO;
         }

         double var9 = 1.0 - m_4618(var3.f_16483.m_7564().m_1181(), var7);
         String var11 = var3.f_16482.m_7564().m_1181();
         if (var11.equals(f_12820)) {
            var11 = var2.getY() < this.f_12815.level.getSeaLevel() ? f_12821 : f_12822;
         }
         return switch (var11) {
            case f_12823 -> new Vec3(0.0, (this.f_12815.level.getMinY() + this.f_12815.level.getHeight() - var2.getY()) * var9, 0.0);
            case f_12824, f_12825 -> new Vec3(-var4.f_12814.getStepX() * 200 * var9, 0.0, -var4.f_12814.getStepZ() * 200 * var9);
            default -> new Vec3(0.0, (this.f_12815.level.getMinY() - var2.getY()) * var9, 0.0);
         };
      } else {
         this.m_4615();
         return Vec3.ZERO;
      }
   }

   private static final class T7ql4SwJCvjyKG8P {
      public final long f_12812;
      public long f_12813;
      public Direction f_12814;

      public T7ql4SwJCvjyKG8P(long var1, Direction var3) {
         this.f_12812 = var1;
         this.f_12814 = var3;
      }
   }
}
