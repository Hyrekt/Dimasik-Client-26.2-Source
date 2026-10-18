package dev.dimasik.client.system;

import com.mojang.blaze3d.platform.InputConstants;
import dev.dimasik.client.DimasikClient;
import lombok.Generated;
import net.minecraft.client.KeyMapping;
import net.minecraft.network.protocol.game.ServerboundContainerClosePacket;

public class Class_8x4deAyjocMIBSj7 implements Class_NzJrN63M7QBpmAbi {
   private static Object f_4507;
   private final Class_kPXtxQj0j9mBpxqt f_4508 = new Class_kPXtxQj0j9mBpxqt();
   private Class_8x4deAyjocMIBSj7.Class_079opm3QvbaunWwN f_4509 = Class_8x4deAyjocMIBSj7.Class_079opm3QvbaunWwN.ACTIVE;

   public Class_8x4deAyjocMIBSj7.Class_8xzBZ83gOSc56UI6 m_1901(Runnable var1, boolean var2) {
      return this.m_1902(var1, DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5153().m_8768().intValue());
   }

   public Class_8x4deAyjocMIBSj7.Class_8xzBZ83gOSc56UI6 m_1902(Runnable var1, int var2) {
      if (m_1906()) {
         return Class_8x4deAyjocMIBSj7.Class_8xzBZ83gOSc56UI6.WAIT;
      }

      KeyMapping[] var3 = new KeyMapping[]{
         f_11537.options.keyUp, f_11537.options.keyDown, f_11537.options.keyLeft, f_11537.options.keyRight, f_11537.options.keyJump, f_11537.options.keySprint
      };

      for (KeyMapping var7 : var3) {
         var7.setDown(false);
      }

      DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5158(true);
      if (!Class_QBKwWNWLlChWViO9.m_4256()) {
         if (this.f_4509 == Class_8x4deAyjocMIBSj7.Class_079opm3QvbaunWwN.ACTIVE) {
            var1.run();
            this.f_4508.m_7442();
            this.f_4509 = Class_8x4deAyjocMIBSj7.Class_079opm3QvbaunWwN.WAIT;
         }

         if (var2 <= 0 || this.f_4508.m_7443(var2 - 1)) {
            DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5158(false);
            if (f_11537.gui.screen() == null) {
               f_11537.player.connection.send(new ServerboundContainerClosePacket(0));

               for (KeyMapping var12 : var3) {
                  boolean var8 = InputConstants.isKeyDown(f_11537.getWindow(), var12.key.getValue());
                  var12.setDown(var8);
               }
            }

            this.f_4509 = Class_8x4deAyjocMIBSj7.Class_079opm3QvbaunWwN.ACTIVE;
            return Class_8x4deAyjocMIBSj7.Class_8xzBZ83gOSc56UI6.SUCCESS;
         }
      } else {
         this.f_4508.m_7442();
      }

      return Class_8x4deAyjocMIBSj7.Class_8xzBZ83gOSc56UI6.WAIT;
   }

   @Generated
   public Class_8x4deAyjocMIBSj7.Class_079opm3QvbaunWwN m_1903() {
      return this.f_4509;
   }

   public static synchronized boolean m_1904(Object var0) {
      if (var0 == null) {
         return false;
      }

      if (f_4507 == null) {
         f_4507 = var0;
      }

      return f_4507 == var0;
   }

   public static synchronized void m_1905(Object var0) {
      if (f_4507 == var0) {
         f_4507 = null;
      }
   }

   private static synchronized boolean m_1906() {
      return f_4507 != null;
   }

   public void m_1907() {
      this.f_4509 = Class_8x4deAyjocMIBSj7.Class_079opm3QvbaunWwN.ACTIVE;
   }

   public enum Class_079opm3QvbaunWwN {
      WAIT,
      ACTIVE;
   }

   public enum Class_8xzBZ83gOSc56UI6 {
      ERROR,
      SUCCESS,
      WAIT;
   }
}
