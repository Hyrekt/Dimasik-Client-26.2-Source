package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.combat.Aura;
import lombok.Generated;
import net.minecraft.util.Mth;
import org.joml.Vector2f;

public class Class_FghX3TD0v55wW2U2 extends Class_4DhobBIM8lTNckKj {
   private final Vector2f f_7485 = new Vector2f();
   private final Vector2f f_7486 = new Vector2f();
   private final Vector2f f_7487 = new Vector2f();
   private final Vector2f f_7488 = new Vector2f();
   private final Vector2f f_7489 = new Vector2f();
   private final Class_gEPk7yDw6CwIte87<Class_jfpiTZhNIuwDwqKr> f_7490 = this::m_2652;
   private Class_kkp256olqZ4F1qt3 f_7491 = null;
   private final Class_gEPk7yDw6CwIte87<Class_dpBlC70x4optBWBD> f_7492 = this::m_2657;
   private final Class_gEPk7yDw6CwIte87<Class_Wb2zlgDaESbnT0hQ> f_7493 = this::m_2665;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_7494 = new Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK>() {
      @Override
      public int m_1780() {
         return -1;
      }

      public void m_1781(Class_Xu9btcIeUN33XnMK var1) {
         Class_FghX3TD0v55wW2U2.this.m_2651(var1);
      }
   };
   private final Class_gEPk7yDw6CwIte87<Class_pYAz0kgoyIbaaR5n> f_7495 = new Class_gEPk7yDw6CwIte87<Class_pYAz0kgoyIbaaR5n>() {
      public void m_1781(Class_pYAz0kgoyIbaaR5n var1) {
         Class_FghX3TD0v55wW2U2.this.m_2655(var1);
      }

      @Override
      public int m_1780() {
         return -1;
      }
   };
   private final Class_gEPk7yDw6CwIte87<Class_ETHFYgDAWb9l6f3g> f_7496 = new Class_gEPk7yDw6CwIte87<Class_ETHFYgDAWb9l6f3g>() {
      public void m_1781(Class_ETHFYgDAWb9l6f3g var1) {
         Class_FghX3TD0v55wW2U2.this.m_2658(var1);
      }

      @Override
      public int m_1780() {
         return -1;
      }
   };
   private int f_7497 = -1;
   private int f_7498;
   private static final float f_7499 = 0.5F;
   private static final float f_7500 = 0.5F;
   private static final float f_7501 = 5.0F;
   private static final float f_7502 = 5.0F;
   private static final float f_7503 = 5.0F;
   private static final String f_7504 = "FuntimeSnap";
   private static final float f_7505 = 0.15F;
   private static final float f_7506 = 0.15F;
   private static final float f_7507 = -90.0F;
   private static final float f_7508 = 90.0F;
   private static final float f_7509 = 0.15F;
   private static final float f_7510 = 0.15F;
   private static final float f_7511 = -90.0F;
   private static final float f_7512 = 90.0F;

   @Generated
   public Vector2f m_2649() {
      return this.f_7486;
   }

   @Generated
   public Vector2f m_2650() {
      return this.f_7485;
   }

   public void m_2651(Class_Xu9btcIeUN33XnMK var1) {
      this.f_7485.set(this.f_7486);
      this.f_7486.x = this.f_7486.x + (this.f_7487.x - this.f_7486.x) * f_7499;
      this.f_7486.y = this.f_7486.y + (this.f_7487.y - this.f_7486.y) * f_7500;
      if (this.m_2661()) {
         this.m_2659();
      } else {
         this.m_2653(Class_kkp256olqZ4F1qt3.HLSsfEOz1OozGlGI.SLOW, 2);
      }
   }

   public void m_2652(Class_jfpiTZhNIuwDwqKr var1) {
   }

   private void m_2653(Class_kkp256olqZ4F1qt3.HLSsfEOz1OozGlGI var1, int var2) {
      Class_U3Ilecg2NrGaJJQx var3 = DimasikClient.m_9057().m_9049().m_2813();
      if (var1 == Class_kkp256olqZ4F1qt3.HLSsfEOz1OozGlGI.SLOW) {
         var3.m_5167();
      }

      Class_kkp256olqZ4F1qt3 var4 = var3.m_5180();
      if (this.m_2656() == null || this.m_2656().m_7467() == var1) {
         if (var4 == null && this.f_7491 != null) {
            this.f_7491.m_7464(true);
            this.f_7489.set(this.f_7491.m_1006(this.f_7489, this.f_7488));
            f_11537.player.setYRot(this.f_7489.x);
            f_11537.player.setXRot(this.f_7489.y);
            if (var3.m_5174(this.f_7491)) {
               this.m_2660();
            } else {
               Vector2f var7 = new Vector2f(Mth.wrapDegrees(this.f_7488.x), this.f_7488.y);
               Vector2f var6 = new Vector2f(Mth.wrapDegrees(this.f_7489.x), this.f_7489.y);
               if (var7.distance(var6) < f_7501) {
                  this.m_2660();
               }
            }
         } else if (var4 != null && var4.m_7465() != null) {
            if (this.f_7491 != var4) {
               if (this.f_7491 == null && var4.m_7468()) {
                  this.f_7488.set(f_11537.player.getYRot(), f_11537.player.getXRot());
               }

               this.f_7491 = var4;
            }

            this.f_7489.set(var4.m_1006(this.f_7489, var4.m_1007()));
            Class_Xsbjx1SxvnHy6q8B var5 = new Class_Xsbjx1SxvnHy6q8B(this.f_7489);
            DimasikClient.m_9057().m_9051().m_9708(var5);
            f_11537.player.setYRot(var5.m_5615().x);
            f_11537.player.setXRot(var5.m_5615().y);
         }
      }
   }

   @Generated
   public Vector2f m_2654() {
      return this.f_7489;
   }

   public void m_2655(Class_pYAz0kgoyIbaaR5n var1) {
      if (this.m_2661()) {
         this.m_2664();
      } else {
         this.m_2653(Class_kkp256olqZ4F1qt3.HLSsfEOz1OozGlGI.MEDIUM, 6);
      }
   }

   public Class_kkp256olqZ4F1qt3 m_2656() {
      Class_kkp256olqZ4F1qt3 var1 = DimasikClient.m_9057().m_9049().m_2813().m_5180();
      return var1 != null ? var1 : this.f_7491;
   }

   private void m_2657(Class_dpBlC70x4optBWBD var1) {
      Aura var2 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
      if (var2 != null && var2.m_1128()) {
         float var4 = f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true);
         var2.m_1058(var4);
         var1.m_6349(var2.m_1055());
         var1.m_6350(var2.m_1132());
      } else {
         Class_kkp256olqZ4F1qt3 var3 = this.f_7491 != null ? this.f_7491 : DimasikClient.m_9057().m_9049().m_2813().m_5180();
         if (var3 != null) {
            if (var3.m_2678()) {
               return;
            }

            var1.m_6349(this.f_7488.x);
            var1.m_6350(this.f_7488.y);
         }
      }
   }

   public void m_2658(Class_ETHFYgDAWb9l6f3g var1) {
      if (!this.m_2661()) {
         this.m_2653(Class_kkp256olqZ4F1qt3.HLSsfEOz1OozGlGI.FAST, 24);
      }
   }

   private void m_2659() {
      Class_U3Ilecg2NrGaJJQx var1 = DimasikClient.m_9057().m_9049().m_2813();
      Class_kkp256olqZ4F1qt3 var2 = var1.m_5180();
      if (this.m_2656() == null || this.m_2656().m_7467() == Class_kkp256olqZ4F1qt3.HLSsfEOz1OozGlGI.SLOW) {
         var1.m_5167();
         if (var2 == null && this.f_7491 != null) {
            this.f_7491.m_7464(true);
            this.f_7489.set(this.f_7491.m_1006(this.f_7489, this.f_7488));
            f_11537.player.setYRot(this.f_7489.x);
            f_11537.player.setXRot(this.f_7489.y);
            if (var1.m_5174(this.f_7491)) {
               this.m_2660();
            } else {
               Vector2f var5 = new Vector2f(Mth.wrapDegrees(this.f_7488.x), this.f_7488.y);
               Vector2f var4 = new Vector2f(Mth.wrapDegrees(this.f_7489.x), this.f_7489.y);
               if (var5.distance(var4) < f_7502) {
                  this.m_2660();
               }
            }
         } else if (var2 != null && var2.m_7465() != null) {
            if (this.f_7491 != var2) {
               if (this.f_7491 == null && var2.m_7468()) {
                  this.f_7488.set(f_11537.player.getYRot(), f_11537.player.getXRot());
               }

               this.f_7491 = var2;
            }

            this.f_7489.set(var2.m_1006(this.f_7489, var2.m_1007()));
            Class_Xsbjx1SxvnHy6q8B var3 = new Class_Xsbjx1SxvnHy6q8B(this.f_7489);
            DimasikClient.m_9057().m_9051().m_9708(var3);
            f_11537.player.setYRot(var3.m_5615().x);
            f_11537.player.setXRot(var3.m_5615().y);
         }
      }
   }

   public void m_2660() {
      Class_U3Ilecg2NrGaJJQx var1 = DimasikClient.m_9057().m_9049().m_2813();
      boolean var2 = this.f_7491 == var1.m_5176();
      boolean var3 = var1.m_5172(this.f_7491);
      this.f_7491.m_1801();
      this.f_7491 = null;
      if (var3) {
         f_11537.player.setYRot(this.f_7488.x);
         f_11537.player.setXRot(this.f_7488.y);
      } else {
         if (this.f_7488.x != 0.0F) {
            if (var2) {
               f_11537.player.setYRot(this.f_7488.x * (f_11537.player.getYRot() / this.f_7488.x));
            } else {
               f_11537.player.setYRot(f_11537.player.getYRot() + Mth.wrapDegrees(this.f_7488.x - f_11537.player.getYRot()));
            }
         }

         f_11537.player.setXRot(this.f_7488.y);
      }
   }

   private boolean m_2661() {
      Aura var1 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
      Class_U3Ilecg2NrGaJJQx var2 = DimasikClient.m_9057().m_9049().m_2813();
      Class_9rb49jlyiwFNOlTd var3 = var2.m_5176();
      return var1 != null && var1.m_776() && var1.m_1115().m_7568(f_7504) || this.f_7491 == var3 || var2.m_5180() == var3;
   }

   public void m_2662(Class_kkp256olqZ4F1qt3 var1) {
      if (this.f_7491 == var1) {
         this.f_7491 = null;
         this.f_7489.set(this.f_7488);
         if (f_11537.player != null) {
            f_11537.player.setYRot(this.f_7488.x);
            f_11537.player.setXRot(this.f_7488.y);
         }
      }
   }

   @Generated
   public Vector2f m_2663() {
      return this.f_7488;
   }

   private void m_2664() {
      Aura var1 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
      Class_U3Ilecg2NrGaJJQx var2 = DimasikClient.m_9057().m_9049().m_2813();
      var2.m_5167();
      Class_kkp256olqZ4F1qt3 var3 = var2.m_5180();
      Class_kkp256olqZ4F1qt3 var4 = this.f_7491 != null ? this.f_7491 : var2.m_5180();
      if (var4 == null || var4.m_7467() == Class_kkp256olqZ4F1qt3.HLSsfEOz1OozGlGI.FAST || var4 == var2.m_5169()) {
         if (var3 != null || this.f_7491 != null) {
            if (var3 == null) {
               this.f_7491.m_7464(true);
               this.f_7489.set(this.f_7491.m_1006(this.f_7489, this.f_7488));
               f_11537.player.setYRot(this.f_7489.x);
               f_11537.player.setXRot(this.f_7489.y);
               if (var2.m_5174(this.f_7491)) {
                  this.m_2660();
               } else {
                  Vector2f var7 = new Vector2f(Mth.wrapDegrees(this.f_7488.x), this.f_7488.y);
                  Vector2f var6 = new Vector2f(Mth.wrapDegrees(this.f_7489.x), this.f_7489.y);
                  if (var7.distance(var6) < f_7503) {
                     this.m_2660();
                  }
               }
            } else if (var3.m_7465() != null) {
               this.f_7491 = var3;
               this.f_7489.set(var3.m_1006(this.f_7489, var3.m_1007()));
               Class_Xsbjx1SxvnHy6q8B var5 = new Class_Xsbjx1SxvnHy6q8B(this.f_7489);
               DimasikClient.m_9057().m_9051().m_9708(var5);
               f_11537.player.setYRot(this.f_7489.x);
               f_11537.player.setXRot(this.f_7489.y);
            }
         }
      }
   }

   private void m_2665(Class_Wb2zlgDaESbnT0hQ var1) {
      Aura var2 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
      if (var2 != null && var2.m_1128()) {
         var1.m_1582(true);
      } else {
         Class_kkp256olqZ4F1qt3 var3 = this.f_7491 != null ? this.f_7491 : DimasikClient.m_9057().m_9049().m_2813().m_5180();
         if (var3 != null) {
            if (var3.m_2678()) {
               return;
            }

            this.f_7488.x = this.f_7488.x + var1.m_5479() * f_7505;
            this.f_7488.y = this.f_7488.y + var1.m_5476() * f_7506;
            this.f_7488.y = Math.clamp(this.f_7488.y, f_7507, f_7508);
            var1.m_1582(true);
         } else {
            this.f_7488.set(f_11537.player.getYRot(), f_11537.player.getXRot());
            this.f_7489.set(f_11537.player.getYRot(), f_11537.player.getXRot());
         }

         this.f_7487.x = this.f_7487.x + var1.m_5479() * f_7509;
         this.f_7487.y = this.f_7487.y + var1.m_5476() * f_7510;
         this.f_7487.y = Math.clamp(this.f_7488.y, f_7511, f_7512);
      }
   }

   @Generated
   public Vector2f m_2666() {
      return this.f_7487;
   }
}
