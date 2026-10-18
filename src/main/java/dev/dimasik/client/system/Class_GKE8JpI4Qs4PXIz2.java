package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import java.util.concurrent.CopyOnWriteArrayList;
import lombok.Generated;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;

public final class Class_GKE8JpI4Qs4PXIz2 implements Class_NzJrN63M7QBpmAbi {
   private static final CopyOnWriteArrayList<Class_GKE8JpI4Qs4PXIz2.bHjpPXPp18BFp0lL> f_7754 = new CopyOnWriteArrayList<>();
   private static final Class_GKE8JpI4Qs4PXIz2.Class_10KLMN6wH9oS4p6P f_7755 = new Class_GKE8JpI4Qs4PXIz2.Class_10KLMN6wH9oS4p6P();
   private static final String f_7756 = "This is a utility class and cannot be instantiated";

   public static void m_2780(Runnable var0, Runnable var1) {
      m_2792(var0, var1, DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5153().m_8768().intValue());
   }

   public static void m_2781(Runnable var0, int var1) {
      m_2787(null, var0, null, Class_GKE8JpI4Qs4PXIz2.kj2Z8I2T2tcGn1s3.STOP, var1);
   }

   private static void m_2782() {
      if (!f_7754.isEmpty()) {
         if (!m_2791()) {
            f_7754.clear();
         } else {
            long var0 = System.nanoTime();
            f_7754.removeIf(var2 -> var2.f_7742 != f_11537.player || var2.f_7743 != f_11537.level || var0 - var2.f_7744 >= var2.f_7745);
         }
      }
   }

   public static void m_2783(Runnable var0) {
      m_2781(var0, DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5153().m_8768().intValue());
   }

   @Generated
   private Class_GKE8JpI4Qs4PXIz2() {
      throw new UnsupportedOperationException(f_7756);
   }

   public static void m_2784(Class_Xu9btcIeUN33XnMK var0) {
   }

   public static void m_2785(Class_mRcJJZJYG5cvDAlU var0) {
   }

   public static void m_2786(Object var0) {
      f_7754.removeIf(var1 -> var1.f_7741 == var0);
   }

   private static boolean m_2787(Object var0, Runnable var1, Runnable var2, Class_GKE8JpI4Qs4PXIz2.kj2Z8I2T2tcGn1s3 var3, int var4) {
      m_2782();
      if (m_2791() && (var0 == null || !m_2790(var0))) {
         f_7754.add(new Class_GKE8JpI4Qs4PXIz2.bHjpPXPp18BFp0lL(var0, var1, var2, var3, var4));
         return true;
      } else {
         return false;
      }
   }

   public static boolean m_2790(Object var0) {
      m_2782();
      return f_7754.stream().anyMatch(var1 -> var1.f_7741 == var0);
   }

   private static boolean m_2791() {
      return f_11537.player != null
         && f_11537.level != null
         && f_11537.gameMode != null
         && f_11537.player.isAlive()
         && !f_11537.player.isRemoved()
         && !f_11537.player.isSpectator()
         && f_11537.player.containerMenu == f_11537.player.inventoryMenu
         && f_11537.player.inventoryMenu.getCarried().isEmpty();
   }

   static {
      DimasikClient.m_9057().m_9051().m_9713(f_7755);
   }

   public static void m_2792(Runnable var0, Runnable var1, int var2) {
      m_2787(null, var0, var1, Class_GKE8JpI4Qs4PXIz2.kj2Z8I2T2tcGn1s3.STOP, var2);
   }

   public static boolean m_2793(Object var0, Runnable var1, int var2) {
      return m_2787(var0, var1, null, Class_GKE8JpI4Qs4PXIz2.kj2Z8I2T2tcGn1s3.STOP, var2);
   }

   public static void m_2794(Runnable var0) {
      m_2787(null, var0, null, Class_GKE8JpI4Qs4PXIz2.kj2Z8I2T2tcGn1s3.STOP_SPRINT, 1);
   }

   private static class Class_10KLMN6wH9oS4p6P {
      public final Class_gEPk7yDw6CwIte87<Class_mRcJJZJYG5cvDAlU> f_7738 = Class_GKE8JpI4Qs4PXIz2::m_2785;
      public final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_7739 = Class_GKE8JpI4Qs4PXIz2::m_2784;

      public Class_10KLMN6wH9oS4p6P() {
      }
   }

   private static class bHjpPXPp18BFp0lL {
      public final Class_kPXtxQj0j9mBpxqt f_7740 = new Class_kPXtxQj0j9mBpxqt();
      public final Object f_7741;
      public final LocalPlayer f_7742 = Class_NzJrN63M7QBpmAbi.f_11537.player;
      public final ClientLevel f_7743 = Class_NzJrN63M7QBpmAbi.f_11537.level;
      public final long f_7744 = System.nanoTime();
      public final long f_7745;
      public final Runnable f_7746;
      public final Runnable f_7747;
      public final int f_7748;
      public Class_GKE8JpI4Qs4PXIz2.ewHs3iisfBk3jFb7 f_7749 = Class_GKE8JpI4Qs4PXIz2.ewHs3iisfBk3jFb7.ACTIVE;
      public final Class_GKE8JpI4Qs4PXIz2.kj2Z8I2T2tcGn1s3 f_7750;
      public static final long f_7751 = 3000000000L;
      public static final long f_7752 = 40L;
      public static final long f_7753 = 50000000L;

      @Generated
      public int m_2767() {
         return this.f_7748;
      }

      @Generated
      public void m_2768(Class_GKE8JpI4Qs4PXIz2.ewHs3iisfBk3jFb7 var1) {
         this.f_7749 = var1;
      }

      @Generated
      public long m_2769() {
         return this.f_7745;
      }

      @Generated
      public long m_2770() {
         return this.f_7744;
      }

      public bHjpPXPp18BFp0lL(Object var1, Runnable var2, Runnable var3, Class_GKE8JpI4Qs4PXIz2.kj2Z8I2T2tcGn1s3 var4, int var5) {
         this.f_7741 = var1;
         this.f_7746 = var2;
         this.f_7748 = Math.max(0, var5);
         this.f_7745 = Math.max(f_7751, (this.f_7748 + f_7752) * f_7753);
         this.f_7750 = var4;
         this.f_7747 = var3;
      }

      @Generated
      public LocalPlayer m_2771() {
         return this.f_7742;
      }

      @Generated
      public Class_GKE8JpI4Qs4PXIz2.kj2Z8I2T2tcGn1s3 m_2772() {
         return this.f_7750;
      }

      @Generated
      public Runnable m_2773() {
         return this.f_7747;
      }

      @Generated
      public Runnable m_2774() {
         return this.f_7746;
      }

      @Generated
      public Object m_2775() {
         return this.f_7741;
      }

      @Generated
      public Class_kPXtxQj0j9mBpxqt m_2776() {
         return this.f_7740;
      }

      @Generated
      public Class_GKE8JpI4Qs4PXIz2.ewHs3iisfBk3jFb7 m_2777() {
         return this.f_7749;
      }

      @Generated
      public ClientLevel m_2778() {
         return this.f_7743;
      }
   }

   private enum ewHs3iisfBk3jFb7 {
      ACTIVE,
      WAIT;
   }

   private enum kj2Z8I2T2tcGn1s3 {
      STOP_SPRINT,
      STOP;
   }
}
