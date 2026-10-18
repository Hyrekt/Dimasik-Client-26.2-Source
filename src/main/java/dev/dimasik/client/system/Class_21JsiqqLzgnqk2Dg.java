package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import java.util.concurrent.CopyOnWriteArrayList;
import lombok.Generated;
import net.minecraft.client.player.KeyboardInput;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.protocol.game.ServerboundContainerClosePacket;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.Action;
import net.minecraft.world.inventory.ContainerInput;

public class Class_21JsiqqLzgnqk2Dg implements Class_NzJrN63M7QBpmAbi {
   private final CopyOnWriteArrayList<Class_21JsiqqLzgnqk2Dg.hiajNRX0O7rkAEff> f_662 = new CopyOnWriteArrayList<>();
   private static final CopyOnWriteArrayList<Class_21JsiqqLzgnqk2Dg.K0xlgnhw27vo9DjG> f_663 = new CopyOnWriteArrayList<>();
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_664 = this::m_906;
   private final Class_gEPk7yDw6CwIte87<Class_mRcJJZJYG5cvDAlU> f_665 = this::m_911;

   public void m_905(String var1, int var2, Runnable... var3) {
      for (Class_21JsiqqLzgnqk2Dg.hiajNRX0O7rkAEff var5 : this.f_662) {
         if (var5.m_904().equals(var1)) {
            return;
         }
      }

      Class_21JsiqqLzgnqk2Dg.hiajNRX0O7rkAEff var6 = new Class_21JsiqqLzgnqk2Dg.hiajNRX0O7rkAEff(
         var1, var3, null, Class_21JsiqqLzgnqk2Dg.p3Jsub0AkKKo1pGe.LEGIT
      );
      var6.m_901(var2);
      this.f_662.add(var6);
   }

   public void m_906(Class_Xu9btcIeUN33XnMK var1) {
      if (!this.m_909()) {
         this.f_662.clear();
      } else {
         for (Class_21JsiqqLzgnqk2Dg.hiajNRX0O7rkAEff var3 : this.f_662) {
            if (var3.m_898().equals(Class_21JsiqqLzgnqk2Dg.p3Jsub0AkKKo1pGe.LEGIT)) {
               this.m_913(var3);
            } else if (var3.m_898().equals(Class_21JsiqqLzgnqk2Dg.p3Jsub0AkKKo1pGe.MATRIX)) {
               this.m_917(var3);
            } else if (var3.m_898().equals(Class_21JsiqqLzgnqk2Dg.p3Jsub0AkKKo1pGe.RAGE)) {
               this.m_915(var3);
            }
         }
      }
   }

   public int m_907() {
      return f_11537.player.getInventory().selected + 1 > 8 ? f_11537.player.getInventory().selected - 1 : f_11537.player.getInventory().selected + 1;
   }

   public void m_908(String var1, int var2, Runnable... var3) {
      for (Class_21JsiqqLzgnqk2Dg.hiajNRX0O7rkAEff var5 : this.f_662) {
         if (var5.m_904().equals(var1)) {
            return;
         }
      }

      Class_21JsiqqLzgnqk2Dg.hiajNRX0O7rkAEff var6 = new Class_21JsiqqLzgnqk2Dg.hiajNRX0O7rkAEff(var1, var3, null, Class_21JsiqqLzgnqk2Dg.p3Jsub0AkKKo1pGe.RAGE);
      var6.m_901(var2);
      this.f_662.add(var6);
   }

   private boolean m_909() {
      return f_11537.player != null && f_11537.level != null && f_11537.player.isAlive();
   }

   @Generated
   public static CopyOnWriteArrayList<Class_21JsiqqLzgnqk2Dg.K0xlgnhw27vo9DjG> m_910() {
      return f_663;
   }

   public void m_911(Class_mRcJJZJYG5cvDAlU var1) {
      boolean var2 = true;
      boolean var3 = true;

      for (Class_21JsiqqLzgnqk2Dg.hiajNRX0O7rkAEff var5 : this.f_662) {
         if (var5.m_898().equals(Class_21JsiqqLzgnqk2Dg.p3Jsub0AkKKo1pGe.LEGIT)) {
            var2 = false;
            var3 = false;
            break;
         }

         if (var5.m_898().equals(Class_21JsiqqLzgnqk2Dg.p3Jsub0AkKKo1pGe.MATRIX)) {
            var3 = false;
         }
      }

      if (!var2) {
         var1.m_7587(false);
         var1.m_7597(false);
         var1.m_7599(false);
         var1.m_7594(false);
         var1.m_7604(false);
         var1.m_7592(false);
         var1.m_7590(KeyboardInput.calculateImpulse(var1.m_7595(), var1.m_7589()));
         var1.m_7596(KeyboardInput.calculateImpulse(var1.m_7602(), var1.m_7600()));
      }

      if (!var3) {
         var1.m_7593(false);
      }
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> m_912() {
      return this.f_664;
   }

   public Class_21JsiqqLzgnqk2Dg() {
      DimasikClient.m_9057().m_9051().m_9713(this);
   }

   private void m_913(Class_21JsiqqLzgnqk2Dg.hiajNRX0O7rkAEff var1) {
      if (!Class_QBKwWNWLlChWViO9.m_4256()) {
         if (var1.m_897().length > 1) {
            if (var1.m_894() == Class_21JsiqqLzgnqk2Dg.Class_8DVj7YpcJFMthHGD.START && var1.m_900().m_7443(var1.m_899())) {
               var1.m_897()[var1.m_902()].run();
               var1.m_900().m_7442();
               var1.m_896().m_7442();
               var1.m_893(var1.m_902() + 1);
               if (var1.m_902() >= var1.m_897().length) {
                  var1.m_895(Class_21JsiqqLzgnqk2Dg.Class_8DVj7YpcJFMthHGD.END);
               }
            }
         } else if (var1.m_894() == Class_21JsiqqLzgnqk2Dg.Class_8DVj7YpcJFMthHGD.START) {
            var1.m_897()[var1.m_902()].run();
            var1.m_895(Class_21JsiqqLzgnqk2Dg.Class_8DVj7YpcJFMthHGD.END);
            var1.m_896().m_7442();
         }

         if (var1.m_894() == Class_21JsiqqLzgnqk2Dg.Class_8DVj7YpcJFMthHGD.END
            && var1.m_896().m_7443(DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5153().m_8768().intValue())) {
            if (var1.m_903() != null) {
               var1.m_903().run();
            }

            this.f_662.remove(var1);
         }
      }
   }

   @Generated
   public CopyOnWriteArrayList<Class_21JsiqqLzgnqk2Dg.hiajNRX0O7rkAEff> m_914() {
      return this.f_662;
   }

   private void m_915(Class_21JsiqqLzgnqk2Dg.hiajNRX0O7rkAEff var1) {
      if (var1.m_897().length > 1) {
         if (var1.m_900().m_7443(var1.m_899())) {
            var1.m_897()[var1.m_902()].run();
            var1.m_893(var1.m_902() + 1);
            var1.m_900().m_7442();
         }
      } else {
         var1.m_897()[var1.m_902()].run();
         this.f_662.remove(var1);
      }

      if (var1.m_902() >= var1.m_897().length) {
         this.f_662.remove(var1);
      }
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_mRcJJZJYG5cvDAlU> m_916() {
      return this.f_665;
   }

   private void m_917(Class_21JsiqqLzgnqk2Dg.hiajNRX0O7rkAEff var1) {
      if (!Class_QBKwWNWLlChWViO9.m_4263()) {
         if (var1.m_897().length > 1) {
            if (var1.m_900().m_7443(var1.m_899())) {
               var1.m_897()[var1.m_902()].run();
               var1.m_893(var1.m_902() + 1);
               var1.m_900().m_7442();
            }
         } else {
            var1.m_897()[var1.m_902()].run();
            this.f_662.remove(var1);
         }

         if (var1.m_902() >= var1.m_897().length) {
            this.f_662.remove(var1);
         }
      }
   }

   public void m_918(String var1, Runnable var2) {
      this.m_923(var1, var2, null);
   }

   public void m_919(String var1, int var2, Runnable var3, Runnable... var4) {
      for (Class_21JsiqqLzgnqk2Dg.hiajNRX0O7rkAEff var6 : this.f_662) {
         if (var6.m_904().equals(var1)) {
            return;
         }
      }

      Class_21JsiqqLzgnqk2Dg.hiajNRX0O7rkAEff var7 = new Class_21JsiqqLzgnqk2Dg.hiajNRX0O7rkAEff(
         var1, var4, var3, Class_21JsiqqLzgnqk2Dg.p3Jsub0AkKKo1pGe.LEGIT
      );
      var7.m_901(var2);
      this.f_662.add(var7);
   }

   public void m_920() {
      Class_3LQSDrJ0WJYOQ7ck.m_1293(new ServerboundPlayerActionPacket(Action.SWAP_ITEM_WITH_OFFHAND, new BlockPos(0, 0, 0), Direction.DOWN));
   }

   public void m_921() {
      if (f_11537.gui.screen() == null) {
         f_11537.player.connection.send(new ServerboundContainerClosePacket(0));
      }
   }

   public void m_922(String var1, int var2, Runnable... var3) {
      for (Class_21JsiqqLzgnqk2Dg.hiajNRX0O7rkAEff var5 : this.f_662) {
         if (var5.m_904().equals(var1)) {
            return;
         }
      }

      Class_21JsiqqLzgnqk2Dg.hiajNRX0O7rkAEff var6 = new Class_21JsiqqLzgnqk2Dg.hiajNRX0O7rkAEff(
         var1, var3, null, Class_21JsiqqLzgnqk2Dg.p3Jsub0AkKKo1pGe.MATRIX
      );
      var6.m_901(var2);
      this.f_662.add(var6);
   }

   public void m_923(String var1, Runnable var2, Runnable var3) {
      for (Class_21JsiqqLzgnqk2Dg.hiajNRX0O7rkAEff var5 : this.f_662) {
         if (var5.m_904().equals(var1)) {
            return;
         }
      }

      this.f_662.add(new Class_21JsiqqLzgnqk2Dg.hiajNRX0O7rkAEff(var1, var2, var3, Class_21JsiqqLzgnqk2Dg.p3Jsub0AkKKo1pGe.LEGIT));
   }

   public void m_924(String var1, Runnable var2) {
      for (Class_21JsiqqLzgnqk2Dg.hiajNRX0O7rkAEff var4 : this.f_662) {
         if (var4.m_904().equals(var1)) {
            return;
         }
      }

      this.f_662.add(new Class_21JsiqqLzgnqk2Dg.hiajNRX0O7rkAEff(var1, var2, null, Class_21JsiqqLzgnqk2Dg.p3Jsub0AkKKo1pGe.MATRIX));
   }

   public void m_925(int var1, int var2) {
      boolean var3 = false;

      for (Class_21JsiqqLzgnqk2Dg.K0xlgnhw27vo9DjG var5 : m_910()) {
         if (var5.m_891() == var1 && var5.m_892() == var2) {
            var3 = true;
            break;
         }
      }

      if (!var3) {
         int var6 = var1;
         if (var6 < 9) {
            var6 += 36;
         } else if (var6 == 40) {
            var6 = 45;
         }

         Class_21JsiqqLzgnqk2Dg.K0xlgnhw27vo9DjG var7 = new Class_21JsiqqLzgnqk2Dg.K0xlgnhw27vo9DjG(var6, var2);
         var7.m_890().m_7442();
         m_910().add(var7);
      }

      f_11537.gameMode.handleContainerInput(0, var2, var1, ContainerInput.SWAP, f_11537.player);
   }

   public enum Class_8DVj7YpcJFMthHGD {
      START,
      END;
   }

   public static class K0xlgnhw27vo9DjG {
      public final int f_650;
      public final int f_651;
      public final Class_kPXtxQj0j9mBpxqt f_652 = new Class_kPXtxQj0j9mBpxqt();

      @Generated
      public Class_kPXtxQj0j9mBpxqt m_890() {
         return this.f_652;
      }

      @Generated
      public int m_891() {
         return this.f_650;
      }

      @Generated
      public int m_892() {
         return this.f_651;
      }

      @Generated
      public K0xlgnhw27vo9DjG(int var1, int var2) {
         this.f_650 = var1;
         this.f_651 = var2;
      }
   }

   public static class hiajNRX0O7rkAEff {
      public final String f_653;
      public final Runnable[] f_654;
      public final Runnable f_655;
      public final Class_21JsiqqLzgnqk2Dg.p3Jsub0AkKKo1pGe f_656;
      public Class_21JsiqqLzgnqk2Dg.Class_8DVj7YpcJFMthHGD f_657 = Class_21JsiqqLzgnqk2Dg.Class_8DVj7YpcJFMthHGD.START;
      public int f_658;
      public int f_659 = 0;
      public final Class_kPXtxQj0j9mBpxqt f_660 = new Class_kPXtxQj0j9mBpxqt();
      public final Class_kPXtxQj0j9mBpxqt f_661 = new Class_kPXtxQj0j9mBpxqt();

      @Generated
      public void m_893(int var1) {
         this.f_659 = var1;
      }

      @Generated
      public Class_21JsiqqLzgnqk2Dg.Class_8DVj7YpcJFMthHGD m_894() {
         return this.f_657;
      }

      @Generated
      public void m_895(Class_21JsiqqLzgnqk2Dg.Class_8DVj7YpcJFMthHGD var1) {
         this.f_657 = var1;
      }

      @Generated
      public Class_kPXtxQj0j9mBpxqt m_896() {
         return this.f_661;
      }

      @Generated
      public Runnable[] m_897() {
         return this.f_654;
      }

      @Generated
      public Class_21JsiqqLzgnqk2Dg.p3Jsub0AkKKo1pGe m_898() {
         return this.f_656;
      }

      @Generated
      public int m_899() {
         return this.f_658;
      }

      @Generated
      public Class_kPXtxQj0j9mBpxqt m_900() {
         return this.f_660;
      }

      @Generated
      public void m_901(int var1) {
         this.f_658 = var1;
      }

      public hiajNRX0O7rkAEff(String var1, Runnable[] var2, Runnable var3, Class_21JsiqqLzgnqk2Dg.p3Jsub0AkKKo1pGe var4) {
         this.f_653 = var1;
         this.f_654 = var2;
         this.f_655 = var3;
         this.f_656 = var4;
      }

      @Generated
      public int m_902() {
         return this.f_659;
      }

      public hiajNRX0O7rkAEff(String var1, Runnable var2, Runnable var3, Class_21JsiqqLzgnqk2Dg.p3Jsub0AkKKo1pGe var4) {
         this.f_653 = var1;
         this.f_654 = new Runnable[]{var2};
         this.f_655 = var3;
         this.f_656 = var4;
      }

      @Generated
      public Runnable m_903() {
         return this.f_655;
      }

      @Generated
      public String m_904() {
         return this.f_653;
      }
   }

   public enum p3Jsub0AkKKo1pGe {
      LEGIT,
      MATRIX,
      RAGE;
   }
}
