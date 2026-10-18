package dev.dimasik.client.system;

import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaterniond;
import org.joml.Vector3d;
import org.joml.Vector3dc;

public final class Class_bYB5A9m3txWhzKnd {
   public static final long f_17698 = 16666666L;
   private static final long f_17699 = 250000000L;
   private static final int f_17700 = 128;
   private final Class_bYB5A9m3txWhzKnd.G6Vtrn6Ff1TSIeEG[] f_17701 = new Class_bYB5A9m3txWhzKnd.G6Vtrn6Ff1TSIeEG[128];
   private final Class_bYB5A9m3txWhzKnd.G6Vtrn6Ff1TSIeEG f_17702 = new Class_bYB5A9m3txWhzKnd.G6Vtrn6Ff1TSIeEG();
   private final Matrix4f f_17703 = new Matrix4f();
   private int f_17704;
   private int f_17705;
   private static final long f_17706 = 250000000L;
   private static final double f_17707 = 64.0;
   private static final long f_17708 = 16666666L;
   private static final float f_17709 = 180.0F;
   private static final float f_17710 = 360.0F;
   private static final float f_17711 = 360.0F;

   public void m_6065() {
      this.f_17704 = 0;
      this.f_17705 = 0;
   }

   public Matrix4fc m_6066() {
      return this.f_17703;
   }

   public Matrix4fc m_6067() {
      return this.f_17702.f_17693;
   }

   public float m_6068() {
      return this.f_17702.f_17696;
   }

   public float m_6069() {
      return this.f_17702.f_17697;
   }

   private Class_bYB5A9m3txWhzKnd.G6Vtrn6Ff1TSIeEG m_6070(int var1) {
      return this.f_17701[(this.f_17704 + var1) % 128];
   }

   public Vector3dc m_6071() {
      return this.f_17702.f_17695;
   }

   public boolean m_6072(long var1, Matrix4fc var3, Matrix4fc var4, double var5, double var7, double var9, float var11, float var12) {
      if (var3.isFinite()
         && var4.isFinite()
         && Double.isFinite(var5)
         && Double.isFinite(var7)
         && Double.isFinite(var9)
         && Float.isFinite(var11)
         && Float.isFinite(var12)) {
         if (this.f_17705 > 0) {
            Class_bYB5A9m3txWhzKnd.G6Vtrn6Ff1TSIeEG var13 = this.m_6070(this.f_17705 - 1);
            if (var1 <= var13.f_17692 || var1 - var13.f_17692 > f_17706 || var13.f_17695.distanceSquared(var5, var7, var9) > f_17707) {
               this.m_6065();
            }
         }

         int var22 = (this.f_17704 + this.f_17705) % 128;
         Class_bYB5A9m3txWhzKnd.G6Vtrn6Ff1TSIeEG var14 = this.f_17701[var22];
         if (var14 == null) {
            this.f_17701[var22] = var14 = new Class_bYB5A9m3txWhzKnd.G6Vtrn6Ff1TSIeEG();
         }

         var14.f_17692 = var1;
         var14.f_17693.set(var3);
         var4.getNormalizedRotation(var14.f_17694);
         var14.f_17695.set(var5, var7, var9);
         var14.f_17696 = var11;
         var14.f_17697 = var12;
         if (this.f_17705 == 128) {
            this.f_17704 = (this.f_17704 + 1) % 128;
         } else {
            this.f_17705++;
         }

         if (this.f_17705 < 2) {
            return false;
         }

         long var15;
         for (var15 = var1 - f_17708; this.f_17705 > 2 && this.m_6070(1).f_17692 <= var15; this.f_17705--) {
            this.f_17704 = (this.f_17704 + 1) % 128;
         }

         Class_bYB5A9m3txWhzKnd.G6Vtrn6Ff1TSIeEG var17 = this.m_6070(0);
         Class_bYB5A9m3txWhzKnd.G6Vtrn6Ff1TSIeEG var18 = this.m_6070(1);
         double var19 = Math.clamp((double)(var15 - var17.f_17692) / (var18.f_17692 - var17.f_17692), 0.0, 1.0);
         var17.f_17693.lerp(var18.f_17693, (float)var19, this.f_17702.f_17693);
         var17.f_17694.slerp(var18.f_17694, var19, this.f_17702.f_17694).normalize();
         this.f_17702.f_17694.get(this.f_17703);
         var17.f_17695.lerp(var18.f_17695, var19, this.f_17702.f_17695);
         float var21 = var18.f_17696 - var17.f_17696;
         var21 -= (float)Math.floor((var21 + f_17709) / f_17710) * f_17711;
         this.f_17702.f_17696 = var17.f_17696 + var21 * (float)var19;
         this.f_17702.f_17697 = var17.f_17697 + (var18.f_17697 - var17.f_17697) * (float)var19;
         return true;
      } else {
         this.m_6065();
         return false;
      }
   }

   private static final class G6Vtrn6Ff1TSIeEG {
      public long f_17692;
      public final Matrix4f f_17693 = new Matrix4f();
      public final Quaterniond f_17694 = new Quaterniond();
      public final Vector3d f_17695 = new Vector3d();
      public float f_17696;
      public float f_17697;

      public G6Vtrn6Ff1TSIeEG() {
      }
   }
}
