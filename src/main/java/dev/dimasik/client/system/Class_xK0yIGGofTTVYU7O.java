package dev.dimasik.client.system;

public final class Class_xK0yIGGofTTVYU7O {
   private static final float f_35016 = 30.0F;

   private Class_xK0yIGGofTTVYU7O() {
   }

   public static boolean m_9464(boolean var0, boolean var1, boolean var2, float var3) {
      return !var0 || !var1 || !var2 || !(var3 > f_35016);
   }

   public record Class_4Epr1VJXiN2Tcg12(int blocks, float ticks, boolean current, boolean preferred, float score)
      implements Comparable<Class_xK0yIGGofTTVYU7O.Class_4Epr1VJXiN2Tcg12> {
      public int compareTo(Class_xK0yIGGofTTVYU7O.Class_4Epr1VJXiN2Tcg12 var1) {
         if (this.blocks == 0 != (var1.blocks == 0)) {
            return this.blocks == 0 ? -1 : 1;
         }

         if (this.blocks > 0) {
            if (Float.compare(this.ticks, var1.ticks) != 0) {
               return Float.compare(this.ticks, var1.ticks);
            }

            if (this.blocks != var1.blocks) {
               return Integer.compare(this.blocks, var1.blocks);
            }

            if (this.current != var1.current) {
               return this.current ? -1 : 1;
            }
         }

         if (this.preferred != var1.preferred) {
            return this.preferred ? -1 : 1;
         } else {
            return Float.compare(var1.score, this.score);
         }
      }
   }
}
