package dev.dimasik.client.system;

import com.google.common.collect.ImmutableMap;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.synth.SimplexNoise;
import net.minecraft.world.phys.Vec3;

public final class Class_GgAv5LmRq7OHDViI implements Class_WzqIkwE6nF1UkDXB {
   private final Class_GgAv5LmRq7OHDViI.CZ8XN3ikhK4BeUnA f_7931 = new Class_GgAv5LmRq7OHDViI.W0XVb8nO1a8RAwIU();
   private Class_GgAv5LmRq7OHDViI.CZ8XN3ikhK4BeUnA f_7932 = new Class_GgAv5LmRq7OHDViI.pH2ti3JMz1YY3cKs();
   private float f_7933;
   private float f_7934;

   private float m_2836(float var1) {
      return Class_O4GrYnfSWk91dY9f.m_4031(this.f_7933, this.f_7934, var1);
   }

   @Override
   public void m_2095() {
      this.m_2841(new Class_GgAv5LmRq7OHDViI.pH2ti3JMz1YY3cKs(), 18);
   }

   public Vec3 m_2837(int var1, float var2) {
      return this.f_7932.m_2831(var1, var2);
   }

   private void m_2838(float var1) {
      this.f_7934 += var1;
   }

   private void m_2839(Class_GgAv5LmRq7OHDViI.CZ8XN3ikhK4BeUnA var1) {
      this.f_7932.m_2832();
      this.f_7932 = var1;
   }

   @Override
   public void m_2098() {
      this.f_7933 = this.f_7934;
      this.m_2838(this.f_7932.m_2830());
   }

   public float m_2840(int var1) {
      return Math.min(Math.abs(var1 - 1), 2) / 2.0F;
   }

   @Override
   public void m_2094() {
      this.m_2841(new Class_GgAv5LmRq7OHDViI.a5s7AVzalQC7INSy(), 20);
   }

   @Override
   public void m_2097() {
      this.m_2841(new Class_GgAv5LmRq7OHDViI.i47s4CFbG9W7pyhK(), 2);
   }

   private void m_2841(Class_GgAv5LmRq7OHDViI.CZ8XN3ikhK4BeUnA var1, int var2) {
      this.m_2839(new Class_GgAv5LmRq7OHDViI.XupYH0xUrhatIQXK(this.f_7932, var1, var2));
   }

   public Vec3 m_2842(int var1, float var2) {
      return this.f_7932.m_2829(var1, var2);
   }

   @Override
   public void m_2099() {
      this.m_2841(new Class_GgAv5LmRq7OHDViI.yo2AZnSKxN4Rrqg1(), 8);
   }

   @Override
   public void m_2096() {
      this.m_2841(new Class_GgAv5LmRq7OHDViI.BMx7mmQdB9fWQeUg(), 60);
   }

   private final class BMx7mmQdB9fWQeUg implements Class_GgAv5LmRq7OHDViI.CZ8XN3ikhK4BeUnA {
      public final SimplexNoise f_7825;
      public int f_7826;
      public static final long f_7828 = 1234L;
      public static final double f_7829 = 5.0;
      public static final double f_7830 = 14.0;
      public static final double f_7831 = 0.17;
      public static final double f_7832 = 0.13;
      public static final double f_7833 = 1.25;
      public static final float f_7834 = 0.045F;

      @Override
      public Vec3 m_2829(int var1, float var2) {
         float var3 = Class_GgAv5LmRq7OHDViI.this.m_2840(var1);
         float var4 = Class_GgAv5LmRq7OHDViI.this.m_2836(var2);
         double var5 = (Math.sin(var4) * f_7829 - f_7830) * var3;
         return Class_GgAv5LmRq7OHDViI.this.f_7931.m_2829(var1, var2).add(0.0, var5, 0.0);
      }

      @Override
      public float m_2830() {
         this.f_7826++;
         return f_7834;
      }

      @Override
      public Vec3 m_2831(int var1, float var2) {
         double var3 = this.f_7825.getValue((this.f_7826 + var2) * f_7831, var1 * f_7832) * f_7833;
         return Class_GgAv5LmRq7OHDViI.this.f_7931.m_2831(var1, var2).add(var3, 0.0, 0.0);
      }

      public BMx7mmQdB9fWQeUg() {
         this.f_7825 = new SimplexNoise(RandomSource.create(f_7828));
      }
   }

   private interface CZ8XN3ikhK4BeUnA {
      default void m_2832() {
      }

      float m_2830();

      Vec3 m_2831(int var1, float var2);

      Vec3 m_2829(int var1, float var2);
   }

   private static final class W0XVb8nO1a8RAwIU implements Class_GgAv5LmRq7OHDViI.CZ8XN3ikhK4BeUnA {
      public final Class_GgAv5LmRq7OHDViI.tewcpbtBeD7Qhqn6 f_7835;
      public final Class_GgAv5LmRq7OHDViI.tewcpbtBeD7Qhqn6 f_7836;
      public static final double f_7837 = -23.5;
      public static final double f_7838 = -16.0;
      public static final double f_7839 = 13.0;
      public static final double f_7840 = 29.0;
      public static final double f_7841 = 12.0;
      public static final double f_7842 = -28.0;
      public static final double f_7843 = 4.0;
      public static final double f_7844 = 18.3;
      public static final double f_7845 = 23.48;

      @Override
      public float m_2830() {
         return 0.0F;
      }

      @Override
      public Vec3 m_2829(int var1, float var2) {
         return this.f_7835.m_2834(var1);
      }

      @Override
      public Vec3 m_2831(int var1, float var2) {
         return this.f_7836.m_2834(var1);
      }

      public W0XVb8nO1a8RAwIU() {
         this.f_7835 = Class_GgAv5LmRq7OHDViI.tewcpbtBeD7Qhqn6.m_2835()
            .m_2828(0, 0.0, f_7837, f_7838)
            .m_2828(1, 0.0, f_7839, f_7840)
            .m_2828(2, 0.0, f_7841, f_7842)
            .m_2828(3, 0.0, f_7843, f_7844)
            .m_2827();
         this.f_7836 = Class_GgAv5LmRq7OHDViI.tewcpbtBeD7Qhqn6.m_2835().m_2828(0, 0.0, 0.0, f_7845).m_2827();
      }
   }

   private final class XupYH0xUrhatIQXK implements Class_GgAv5LmRq7OHDViI.CZ8XN3ikhK4BeUnA {
      public final Class_GgAv5LmRq7OHDViI.CZ8XN3ikhK4BeUnA f_7846;
      public final Class_GgAv5LmRq7OHDViI.CZ8XN3ikhK4BeUnA f_7847;
      public final int f_7848;
      public int f_7849;
      public int f_7850;
      public boolean f_7851 = true;

      public XupYH0xUrhatIQXK(Class_GgAv5LmRq7OHDViI.CZ8XN3ikhK4BeUnA var2, Class_GgAv5LmRq7OHDViI.CZ8XN3ikhK4BeUnA var3, int var4) {
         this.f_7846 = var2;
         this.f_7847 = var3;
         this.f_7848 = var4;
      }

      public Vec3 m_2833(int var1, float var2, boolean var3) {
         Vec3 var4 = var3 ? this.f_7846.m_2829(var1, var2) : this.f_7846.m_2831(var1, var2);
         Vec3 var5 = var3 ? this.f_7847.m_2829(var1, var2) : this.f_7847.m_2831(var1, var2);
         float var6 = Class_O4GrYnfSWk91dY9f.m_4027(Class_O4GrYnfSWk91dY9f.m_4031(this.f_7849, this.f_7850, var2) / this.f_7848);
         return new Vec3(
            Class_O4GrYnfSWk91dY9f.m_4032(var4.x, var5.x, var6),
            Class_O4GrYnfSWk91dY9f.m_4032(var4.y, var5.y, var6),
            Class_O4GrYnfSWk91dY9f.m_4032(var4.z, var5.z, var6)
         );
      }

      @Override
      public float m_2830() {
         this.f_7849 = this.f_7850;
         float var1 = this.f_7846.m_2830();
         float var2 = this.f_7847.m_2830();
         float var3 = Class_O4GrYnfSWk91dY9f.m_4031(var1, var2, (float)this.f_7850 / this.f_7848);
         if (this.f_7850 < this.f_7848) {
            this.f_7850++;
         } else if (this.f_7851) {
            Class_GgAv5LmRq7OHDViI.this.m_2839(this.f_7847);
         }

         return var3;
      }

      @Override
      public Vec3 m_2829(int var1, float var2) {
         return this.m_2833(var1, var2, true);
      }

      @Override
      public void m_2832() {
         this.f_7851 = false;
      }

      @Override
      public Vec3 m_2831(int var1, float var2) {
         return this.m_2833(var1, var2, false);
      }
   }

   private final class a5s7AVzalQC7INSy implements Class_GgAv5LmRq7OHDViI.CZ8XN3ikhK4BeUnA {
      public int f_7853;
      public static final float f_7855 = 1.2F;
      public static final double f_7856 = (float) (Math.PI / 2);
      public static final double f_7857 = 2.0;
      public static final double f_7858 = 16.0;
      public static final double f_7859 = 8.0;
      public static final double f_7860 = 26.0;
      public static final double f_7861 = 12.0;
      public static final float f_7862 = (float) Math.PI;
      public static final double f_7863 = 2.0;
      public static final float f_7864 = 0.375F;
      public static final float f_7865 = 0.225F;
      public static final float f_7866 = 100.0F;

      @Override
      public Vec3 m_2831(int var1, float var2) {
         return Class_GgAv5LmRq7OHDViI.this.f_7931.m_2831(var1, var2);
      }

      public a5s7AVzalQC7INSy() {
      }

      @Override
      public Vec3 m_2829(int var1, float var2) {
         float var3 = Class_GgAv5LmRq7OHDViI.this.m_2840(var1);
         float var4 = Class_GgAv5LmRq7OHDViI.this.m_2836(var2);
         float var5 = var4 - var3 * f_7855;
         double var6 = (Math.sin(var5 + f_7856) - 1.0) / f_7857 * f_7858 + f_7859;
         double var8 = (Math.sin(var5) * f_7860 + f_7861) * (1.0 - var3 * (Math.min(Math.sin(var5 + f_7862), 0.0) / f_7863 + 1.0) * Math.sin(var4));
         return Class_GgAv5LmRq7OHDViI.this.f_7931.m_2829(var1, var2).add(var6, var8, 0.0);
      }

      @Override
      public float m_2830() {
         float var1 = Class_O4GrYnfSWk91dY9f.m_4031(f_7864, f_7865, this.f_7853 / f_7866);
         if (this.f_7853 < 100) {
            this.f_7853++;
         }

         return var1;
      }
   }

   private final class i47s4CFbG9W7pyhK implements Class_GgAv5LmRq7OHDViI.CZ8XN3ikhK4BeUnA {
      public static final float f_7868 = 1.2F;
      public static final double f_7869 = (float) (Math.PI / 2);
      public static final double f_7870 = 2.0;
      public static final double f_7871 = 20.0;
      public static final double f_7872 = 50.0;
      public static final double f_7873 = 20.0;
      public static final double f_7874 = 14.0;
      public static final float f_7875 = (float) Math.PI;
      public static final double f_7876 = 2.0;
      public static final double f_7877 = 4.0;
      public static final float f_7878 = 0.67F;

      @Override
      public Vec3 m_2829(int var1, float var2) {
         float var3 = Class_GgAv5LmRq7OHDViI.this.m_2840(var1 + 1);
         float var4 = Class_GgAv5LmRq7OHDViI.this.m_2836(var2);
         float var5 = var4 - var3 * f_7868;
         double var6 = (Math.sin(var5 + f_7869) - 1.0) / f_7870 * f_7871 + (1.0 - var3) * f_7872;
         double var8 = (Math.sin(var5) * f_7873 + (1.0 - var3) * f_7874)
            * (1.0 - var3 * (Math.min(Math.sin(var5 + f_7875), 0.0) / f_7876 + 1.0) * Math.sin(var4));
         return Class_GgAv5LmRq7OHDViI.this.f_7931.m_2829(var1, var2).add(var6, var8, f_7877);
      }

      @Override
      public Vec3 m_2831(int var1, float var2) {
         return Class_GgAv5LmRq7OHDViI.this.f_7931.m_2831(var1, var2);
      }

      public i47s4CFbG9W7pyhK() {
      }

      @Override
      public float m_2830() {
         return f_7878;
      }
   }

   private final class pH2ti3JMz1YY3cKs implements Class_GgAv5LmRq7OHDViI.CZ8XN3ikhK4BeUnA {
      public final Class_GgAv5LmRq7OHDViI.tewcpbtBeD7Qhqn6 f_7879;
      public final Class_GgAv5LmRq7OHDViI.tewcpbtBeD7Qhqn6 f_7880;
      public static final double f_7882 = 40.0;
      public static final double f_7883 = -60.0;
      public static final double f_7884 = -50.0;
      public static final double f_7885 = 72.0;
      public static final double f_7886 = 10.0;
      public static final double f_7887 = 100.0;
      public static final double f_7888 = -10.0;
      public static final double f_7889 = -120.0;
      public static final double f_7890 = 10.0;
      public static final double f_7891 = 100.0;
      public static final double f_7892 = 10.0;
      public static final double f_7893 = 20.0;
      public static final double f_7894 = 23.48;
      public static final double f_7895 = 20.0;
      public static final double f_7896 = -70.0;
      public static final double f_7897 = 10.0;
      public static final double f_7898 = 40.0;
      public static final double f_7899 = -20.0;
      public static final double f_7900 = 20.0;
      public static final double f_7901 = 0.6;
      public static final double f_7902 = 5.0;
      public static final double f_7903 = 16.0;
      public static final double f_7904 = 0.6;
      public static final double f_7905 = 4.0;
      public static final double f_7906 = 11.0;
      public static final float f_7907 = 0.06F;

      @Override
      public Vec3 m_2831(int var1, float var2) {
         float var3 = Class_GgAv5LmRq7OHDViI.this.m_2840(var1);
         float var4 = Class_GgAv5LmRq7OHDViI.this.m_2836(var2);
         double var5 = Math.sin(var4 - var3 * f_7904);
         return this.f_7880.m_2834(var1).add(var5 * f_7905 * var3, -var5 * f_7906 * var3, 0.0);
      }

      @Override
      public float m_2830() {
         return f_7907;
      }

      public pH2ti3JMz1YY3cKs() {
         this.f_7879 = Class_GgAv5LmRq7OHDViI.tewcpbtBeD7Qhqn6.m_2835()
            .m_2828(0, f_7882, f_7883, f_7884)
            .m_2828(1, f_7885, f_7886, f_7887)
            .m_2828(2, 0.0, f_7888, f_7889)
            .m_2828(3, f_7890, 0.0, f_7891)
            .m_2827();
         this.f_7880 = Class_GgAv5LmRq7OHDViI.tewcpbtBeD7Qhqn6.m_2835()
            .m_2828(0, f_7892, f_7893, f_7894)
            .m_2828(1, 0.0, f_7895, f_7896)
            .m_2828(2, 0.0, f_7897, f_7898)
            .m_2828(3, f_7899, 0.0, f_7900)
            .m_2827();
      }

      @Override
      public Vec3 m_2829(int var1, float var2) {
         float var3 = Class_GgAv5LmRq7OHDViI.this.m_2840(var1);
         float var4 = Class_GgAv5LmRq7OHDViI.this.m_2836(var2);
         double var5 = Math.sin(var4 - var3 * f_7901);
         return this.f_7879.m_2834(var1).add(var5 * f_7902 * var3, var5 * f_7903 * var3, 0.0);
      }
   }

   public static final class tewcpbtBeD7Qhqn6 {
      public final ImmutableMap<Integer, Vec3> f_7908;

      public tewcpbtBeD7Qhqn6(ImmutableMap<Integer, Vec3> var1) {
         this.f_7908 = var1;
      }

      public Vec3 m_2834(int var1) {
         return (Vec3)this.f_7908.getOrDefault(var1, Vec3.ZERO);
      }

      public static Class_GgAv5LmRq7OHDViI$Class_3ertjVEq1Wdl3nmO m_2835() {
         return new Class_GgAv5LmRq7OHDViI$Class_3ertjVEq1Wdl3nmO();
      }
   }

   private static final class yo2AZnSKxN4Rrqg1 implements Class_GgAv5LmRq7OHDViI.CZ8XN3ikhK4BeUnA {
      public final SimplexNoise f_7909;
      public final Class_GgAv5LmRq7OHDViI.tewcpbtBeD7Qhqn6 f_7910;
      public int f_7911;
      public static final long f_7912 = 1234L;
      public static final double f_7913 = 30.0;
      public static final double f_7914 = -23.0;
      public static final double f_7915 = -50.0;
      public static final double f_7916 = -10.0;
      public static final double f_7917 = 5.0;
      public static final double f_7918 = -10.0;
      public static final double f_7919 = -30.0;
      public static final double f_7920 = -20.0;
      public static final double f_7921 = -20.0;
      public static final double f_7922 = -20.0;
      public static final double f_7923 = 20.0;
      public static final double f_7924 = 0.18;
      public static final double f_7925 = 0.13;
      public static final double f_7926 = 0.92;
      public static final double f_7927 = 0.2;
      public static final double f_7928 = 0.13;
      public static final double f_7929 = 1.75;
      public static final double f_7930 = 4.0;

      @Override
      public Vec3 m_2831(int var1, float var2) {
         double var3 = this.f_7909.getValue((this.f_7911 + var2) * f_7927, var1 * f_7928) * f_7929;
         return new Vec3(-var3, var3 * f_7930, 0.0);
      }

      @Override
      public Vec3 m_2829(int var1, float var2) {
         double var3 = this.f_7909.getValue((this.f_7911 + var2) * f_7924, var1 * f_7925) * f_7926 * (var1 + 1);
         return this.f_7910.m_2834(var1).add(var3, 0.0, var3);
      }

      public yo2AZnSKxN4Rrqg1() {
         this.f_7909 = new SimplexNoise(RandomSource.create(f_7912));
         this.f_7910 = Class_GgAv5LmRq7OHDViI.tewcpbtBeD7Qhqn6.m_2835()
            .m_2828(0, f_7913, f_7914, f_7915)
            .m_2828(1, f_7916, f_7917, f_7918)
            .m_2828(2, f_7919, f_7920, f_7921)
            .m_2828(3, f_7922, 0.0, f_7923)
            .m_2827();
      }

      @Override
      public float m_2830() {
         this.f_7911++;
         return 0.0F;
      }
   }
}
