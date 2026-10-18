package dev.dimasik.client.system;

import java.util.List;
import java.util.function.Predicate;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public final class Class_hDYugYZW8b426Ynk {
   public static final double f_23250 = 3.0;
   private int f_23251;
   private Class_hDYugYZW8b426Ynk.JoTGRuFuwNGJjun2 f_23252;
   private Class_hDYugYZW8b426Ynk.JoTGRuFuwNGJjun2 f_23253;
   private static final int f_23254 = Integer.MIN_VALUE;
   private static final double f_23255 = 256.0;
   private static final double f_23256 = 6.0;
   private static final double f_23257 = 1.0E-10;
   private static final double f_23258 = 6.0;
   private static final double f_23259 = 1.0E-8;
   private static final double f_23260 = 6.0;
   private static final double f_23261 = 0.3;
   private static final double f_23262 = 1.0E-8;
   private static final double f_23263 = 1.0E-8;
   private static final double f_23264 = 8.0;
   private static final double f_23265 = 0.5;
   private static final double f_23266 = 2.0;
   private static final double f_23267 = 3.0;
   private static final int f_23268 = Integer.MIN_VALUE;

   public void m_7130() {
      this.f_23251 = f_23268;
      this.f_23252 = this.f_23253 = null;
   }

   private Class_qT3a68ZR9cAz3wbe.GHJVGUMVTdUYTniZ m_7131() {
      int var1 = this.f_23252.velocity().lengthSqr() < f_23263 ? 0 : Math.clamp(this.f_23252.tick() - this.f_23252.positionTick(), 0, 2);
      return new Class_qT3a68ZR9cAz3wbe.GHJVGUMVTdUYTniZ(this.f_23252.position(), this.f_23252.velocity(), this.f_23252.acceleration(), 0.0F, 0.0F, var1);
   }

   public Class_qT3a68ZR9cAz3wbe.GHJVGUMVTdUYTniZ m_7132(int var1, int var2, Vec3 var3, Vec3 var4) {
      if (this.f_23252 == null
         || var1 != this.f_23251
         || var2 < this.f_23252.tick()
         || var2 - this.f_23252.tick() > 10
         || var3.distanceToSqr(this.f_23252.position()) > f_23255) {
         this.m_7130();
         this.f_23251 = var1;
         this.f_23252 = new Class_hDYugYZW8b426Ynk.JoTGRuFuwNGJjun2(var2, var2, var3, m_7135(var4, f_23256), Vec3.ZERO);
         return this.m_7131();
      }

      if (var2 == this.f_23252.tick() && var3.distanceToSqr(this.f_23252.position()) < f_23257) {
         return this.m_7131();
      }

      if (var2 > this.f_23252.tick()) {
         this.f_23253 = this.f_23252;
      }

      Class_hDYugYZW8b426Ynk.JoTGRuFuwNGJjun2 var5 = this.f_23253;
      if (var5 == null) {
         this.f_23252 = new Class_hDYugYZW8b426Ynk.JoTGRuFuwNGJjun2(var2, var2, var3, m_7135(var4, f_23258), Vec3.ZERO);
         return this.m_7131();
      }

      Vec3 var6 = var3.subtract(var5.position());
      int var7 = Math.max(1, var2 - var5.positionTick());
      Vec3 var9 = Vec3.ZERO;
      int var10 = var5.positionTick();
      Vec3 var8;
      if (var6.lengthSqr() > f_23259) {
         var8 = m_7135(var6.scale(1.0 / var7), f_23260);
         double var11 = var8.x * var5.velocity().x + var8.z * var5.velocity().z;
         if (var11 > 0.0) {
            Vec3 var13 = var8.subtract(var5.velocity()).scale(1.0 / var7);
            if (var13.x * var8.x + var13.z * var8.z >= 0.0) {
               var9 = m_7135(var13, f_23261);
            }
         }

         var10 = var2;
      } else {
         var8 = var7 >= 3 ? Vec3.ZERO : var5.velocity();
         if (var8.lengthSqr() < f_23262) {
            var10 = var2;
         }
      }

      this.f_23252 = new Class_hDYugYZW8b426Ynk.JoTGRuFuwNGJjun2(var2, var10, var3, var8, var9);
      return this.m_7131();
   }

   public static AABB m_7133(AABB var0, Vec3 var1, Vec3 var2) {
      return var0.move(var2.subtract(var1));
   }

   public static Class_hDYugYZW8b426Ynk.dS9M4r6823hmtWBk m_7134(
      AABB var0,
      Class_qT3a68ZR9cAz3wbe.GHJVGUMVTdUYTniZ var1,
      Class_FyutImIC8oFoGKuH.at09eCJZBjEw7bSk var2,
      double var3,
      boolean var5,
      Class_FyutImIC8oFoGKuH.v4GJnInBNLLhf0jm var6,
      Predicate<AABB> var7
   ) {
      double var8 = Math.clamp(var3, 0.0, f_23264);
      double var10 = var8 + var1.age() + f_23265 + (var5 ? 1 : 0);
      double var12 = Math.max(1.0, Math.ceil(var8)) + 1.0 + (var5 ? 1 : 0);
      int var14 = (int)Math.ceil(var10 + f_23266 * var12 + f_23267 + 1.0);
      List var15 = Class_FyutImIC8oFoGKuH.m_2705(var0, var1, var2, var14, var6, var7);
      return new Class_hDYugYZW8b426Ynk.dS9M4r6823hmtWBk(var15, var10, var12);
   }

   public Class_hDYugYZW8b426Ynk() {
      this.f_23251 = f_23254;
   }

   private static Vec3 m_7135(Vec3 var0, double var1) {
      double var3 = var0.length();
      if (!Double.isFinite(var3)) {
         return Vec3.ZERO;
      } else {
         return var3 > var1 ? var0.scale(var1 / var3) : var0;
      }
   }

   private record JoTGRuFuwNGJjun2(int tick, int positionTick, Vec3 position, Vec3 velocity, Vec3 acceleration) {
   }

   public record dS9M4r6823hmtWBk(List<AABB> boxes, double leadTicks, double supportTicks) {
      public double readyAt(int var1) {
         return this.leadTicks + Math.max(0, var1 - 1) * this.supportTicks;
      }
   }
}
