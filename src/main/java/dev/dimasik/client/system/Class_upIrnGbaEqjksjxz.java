package dev.dimasik.client.system;

import java.util.function.Consumer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;

public abstract class Class_upIrnGbaEqjksjxz {
   public static final int f_33264 = 2;
   private final int f_33265;
   private final Consumer<Class_WzqIkwE6nF1UkDXB> f_33266;
   private int f_33267;

   protected Class_upIrnGbaEqjksjxz m_9241() {
      return new Class_upIrnGbaEqjksjxz.Class_81rgm4DaSCBIOxZR();
   }

   public final void m_9247(Class_WzqIkwE6nF1UkDXB var1) {
      this.f_33266.accept(var1);
   }

   protected Class_upIrnGbaEqjksjxz m_9245() {
      return new Class_upIrnGbaEqjksjxz.sJwIQAiyBepuCTt1();
   }

   private Class_upIrnGbaEqjksjxz m_9248(boolean var1, double var2, double var4, double var6, Player var8) {
      if (var1) {
         return var4 < 0.0 && var8.getXRot() >= this.m_9250(var2, var4, var6) ? this.m_9241() : this.m_9240();
      } else {
         return var4 < 0.0 ? this.m_9244(var8) : this.m_9243(var4);
      }
   }

   protected Class_upIrnGbaEqjksjxz(int var1, Consumer<Class_WzqIkwE6nF1UkDXB> var2) {
      this.f_33265 = var1;
      this.f_33266 = var2;
   }

   protected Class_upIrnGbaEqjksjxz(Consumer<Class_WzqIkwE6nF1UkDXB> var1) {
      this(2, var1);
   }

   protected Class_upIrnGbaEqjksjxz m_9246() {
      return new Class_upIrnGbaEqjksjxz.sjIvDlO0aHttzuTX();
   }

   protected Class_upIrnGbaEqjksjxz m_9243(double var1) {
      return this.m_9245();
   }

   public final Class_upIrnGbaEqjksjxz m_9249(boolean var1, double var2, double var4, double var6, Player var8) {
      return this.f_33267++ > this.f_33265 ? this.m_9248(var1, var2, var4, var6, var8) : this;
   }

   protected Class_upIrnGbaEqjksjxz m_9242() {
      return new Class_upIrnGbaEqjksjxz.SNZExbzjCgbJiSxq();
   }

   protected Class_upIrnGbaEqjksjxz m_9240() {
      return new Class_upIrnGbaEqjksjxz.cs0bUBLtM4qaSY65();
   }

   private float m_9250(double var1, double var3, double var5) {
      return Class_O4GrYnfSWk91dY9f.m_4033((float)(-Math.atan2(var3, Math.sqrt(var1 * var1 + var5 * var5))));
   }

   protected Class_upIrnGbaEqjksjxz m_9244(Player var1) {
      return this.m_9242();
   }

   public static final class Class_81rgm4DaSCBIOxZR extends Class_upIrnGbaEqjksjxz {
      public Class_81rgm4DaSCBIOxZR() {
         super(Class_WzqIkwE6nF1UkDXB::m_2096);
      }

      @Override
      protected Class_upIrnGbaEqjksjxz m_9240() {
         return new Class_upIrnGbaEqjksjxz.cs0bUBLtM4qaSY65(6);
      }

      @Override
      protected Class_upIrnGbaEqjksjxz m_9241() {
         return this;
      }
   }

   public static final class SNZExbzjCgbJiSxq extends Class_upIrnGbaEqjksjxz {
      public SNZExbzjCgbJiSxq() {
         super(Class_WzqIkwE6nF1UkDXB::m_2099);
      }

      @Override
      protected Class_upIrnGbaEqjksjxz m_9242() {
         return this;
      }
   }

   public static final class cs0bUBLtM4qaSY65 extends Class_upIrnGbaEqjksjxz {
      public cs0bUBLtM4qaSY65() {
         this(2);
      }

      public cs0bUBLtM4qaSY65(int var1) {
         super(var1, Class_WzqIkwE6nF1UkDXB::m_2094);
      }

      @Override
      protected Class_upIrnGbaEqjksjxz m_9243(double var1) {
         return var1 >= 0.0 ? this.m_9241() : super.m_9243(var1);
      }

      @Override
      protected Class_upIrnGbaEqjksjxz m_9240() {
         return this;
      }
   }

   public static final class sJwIQAiyBepuCTt1 extends Class_upIrnGbaEqjksjxz {
      public static final double f_33263 = 0.25;

      public sJwIQAiyBepuCTt1() {
         super(Class_WzqIkwE6nF1UkDXB::m_2095);
      }

      @Override
      protected Class_upIrnGbaEqjksjxz m_9244(Player var1) {
         BlockPos var2 = BlockPos.containing(var1.getX(), var1.getY() - f_33263, var1.getZ());
         return var1.level().getBlockState(var2).isAir() && var1.level().getBlockState(var2.below()).isAir() ? super.m_9244(var1) : this.m_9245();
      }

      @Override
      protected Class_upIrnGbaEqjksjxz m_9245() {
         return this;
      }
   }

   public static final class sjIvDlO0aHttzuTX extends Class_upIrnGbaEqjksjxz {
      public sjIvDlO0aHttzuTX() {
         super(Class_WzqIkwE6nF1UkDXB::m_2097);
      }

      @Override
      protected Class_upIrnGbaEqjksjxz m_9246() {
         return this;
      }
   }
}
