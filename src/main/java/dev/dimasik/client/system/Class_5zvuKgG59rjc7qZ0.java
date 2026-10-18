package dev.dimasik.client.system;

import lombok.Generated;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerCommandPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerInputPacket;
import net.minecraft.network.protocol.game.ServerboundSetCarriedItemPacket;

public class Class_5zvuKgG59rjc7qZ0 extends Class_4DhobBIM8lTNckKj implements Class_NzJrN63M7QBpmAbi {
   private int f_2557;
   private float f_2558;
   private float f_2559;
   private float f_2560;
   private double f_2561;
   private double f_2562;
   private double f_2563;
   private boolean f_2564;
   private boolean f_2565;
   private boolean f_2566;
   private boolean f_2567;
   private double f_2568;
   private boolean f_2569;
   private final Class_gEPk7yDw6CwIte87<Class_sULPxrOl7TpPlaX6> f_2570 = this::m_1511;
   private final Class_gEPk7yDw6CwIte87<Class_lTzchJDbvRVrnXlw> f_2571 = this::m_1514;

   @Generated
   public boolean m_1499() {
      return this.f_2565;
   }

   @Generated
   public boolean m_1500() {
      return this.f_2567;
   }

   @Generated
   public boolean m_1501() {
      return this.f_2569;
   }

   @Generated
   public double m_1502() {
      return this.f_2563;
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_sULPxrOl7TpPlaX6> m_1503() {
      return this.f_2570;
   }

   @Generated
   public boolean m_1504() {
      return this.f_2564;
   }

   @Generated
   public boolean m_1505() {
      return this.f_2566;
   }

   @Generated
   public double m_1506() {
      return this.f_2561;
   }

   @Generated
   public int m_1507() {
      return this.f_2557;
   }

   @Generated
   public double m_1508() {
      return this.f_2568;
   }

   @Generated
   public float m_1509() {
      return this.f_2559;
   }

   @Generated
   public double m_1510() {
      return this.f_2562;
   }

   public void m_1511(Class_sULPxrOl7TpPlaX6 var1) {
      if (f_11537.player == null) {
         this.f_2560 = 0.0F;
         this.f_2569 = false;
      } else {
         double var2 = f_11537.player.getY();
         if (!this.f_2569) {
            this.f_2568 = var2;
            this.f_2569 = true;
         } else {
            double var4 = this.f_2568 - var2;
            if (f_11537.player.onGround()) {
               this.f_2560 = 0.0F;
            } else if (var4 > 0.0) {
               this.f_2560 += (float)var4;
            }

            this.f_2568 = var2;
         }
      }
   }

   @Generated
   public float m_1512() {
      return this.f_2558;
   }

   @Generated
   public float m_1513() {
      return this.f_2560;
   }

   public void m_1514(Class_lTzchJDbvRVrnXlw var1) {
      if (f_11537.player != null) {
         if (var1.m_7532() instanceof ServerboundMovePlayerPacket var2) {
            if (var2.hasPosition()) {
               this.f_2561 = var2.getX(f_11537.player.getX());
               this.f_2562 = var2.getY(f_11537.player.getY());
               this.f_2563 = var2.getZ(f_11537.player.getZ());
            }

            if (var2.hasRotation()) {
               this.f_2558 = var2.getYRot(f_11537.player.getYRot());
               this.f_2559 = var2.getXRot(f_11537.player.getXRot());
            }

            this.f_2564 = var2.isOnGround();
            this.f_2567 = var2.horizontalCollision();
         }

         if (var1.m_7532() instanceof ServerboundSetCarriedItemPacket var4) {
            this.f_2557 = var4.getSlot();
         }

         if (var1.m_7532() instanceof ServerboundPlayerCommandPacket var5) {
            switch (var5.getAction()) {
               case START_SPRINTING:
                  this.f_2565 = true;
                  break;
               case STOP_SPRINTING:
                  this.f_2565 = false;
            }
         }

         if (var1.m_7532() instanceof ServerboundPlayerInputPacket var6) {
            this.f_2566 = var6.input().shift();
         }
      }
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_lTzchJDbvRVrnXlw> m_1515() {
      return this.f_2571;
   }
}
