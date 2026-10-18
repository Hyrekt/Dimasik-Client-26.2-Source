package dev.dimasik.client.system;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import net.minecraft.client.Minecraft;
import net.minecraft.world.phys.Vec3;

public final class Class_kLrHwbwaigmlFL18 {
   private static final long f_24825 = 200000000L;
   private static final long f_24826 = 10L;
   private static final double f_24827 = 0.001;
   private final Minecraft f_24828;
   private boolean f_24829;
   private boolean f_24830;
   private long f_24831;
   private int f_24832;
   private Vec3 f_24833;
   private Runnable f_24834;
   private static final double f_24835 = 0.5;
   private static final double f_24836 = 0.5;
   private static final long f_24837 = 10L;
   private static final long f_24838 = 200000000L;
   private static final double f_24839 = 0.001;
   private static final double f_24840 = 0.001;
   private static final double f_24841 = 0.001;

   public boolean m_7420() {
      return !this.f_24830 || System.nanoTime() - this.f_24831 >= f_24838;
   }

   private void m_7421(int var1) {
      if (this.f_24829 && var1 == this.f_24832) {
         this.f_24829 = false;
         Runnable var2 = this.f_24834;
         this.f_24834 = null;
         if (this.m_7423() && var2 != null) {
            var2.run();
         }
      }
   }

   public boolean m_7422(double var1, double var3, double var5, Runnable var7) {
      if (this.f_24828.player != null && !this.f_24829 && this.m_7420()) {
         double var8 = Math.floor(var1) + f_24835;
         double var10 = Math.floor(var5) + f_24836;
         this.f_24833 = new Vec3(var8, var3, var10);
         this.f_24834 = var7;
         this.f_24829 = true;
         int var12 = ++this.f_24832;
         this.f_24828.player.setPos(var8, var3, var10);
         this.f_24830 = true;
         this.f_24831 = System.nanoTime();
         CompletableFuture.delayedExecutor(f_24837, TimeUnit.MILLISECONDS).execute(() -> this.f_24828.execute(() -> this.m_7421(var12)));
         return true;
      } else {
         return false;
      }
   }

   public boolean m_7423() {
      return this.f_24828.player != null && this.f_24833 != null
         ? Math.abs(this.f_24828.player.getX() - this.f_24833.x) <= f_24839
            && Math.abs(this.f_24828.player.getY() - this.f_24833.y) <= f_24840
            && Math.abs(this.f_24828.player.getZ() - this.f_24833.z) <= f_24841
         : false;
   }

   public void m_7424() {
      this.m_7426();
      this.f_24833 = null;
      this.f_24830 = false;
      this.f_24831 = 0L;
   }

   public boolean m_7425() {
      return this.f_24829;
   }

   public Class_kLrHwbwaigmlFL18(Minecraft var1) {
      this.f_24828 = var1;
   }

   public void m_7426() {
      this.f_24829 = false;
      this.f_24834 = null;
      this.f_24832++;
   }
}
