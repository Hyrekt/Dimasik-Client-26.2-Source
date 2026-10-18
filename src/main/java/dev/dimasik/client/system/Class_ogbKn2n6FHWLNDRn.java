package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.world.entity.Pose;

public final class Class_ogbKn2n6FHWLNDRn {
   private static final int f_28029 = 100;
   private static final Runnable f_28030 = () -> {};
   private final Minecraft f_28031;
   private final Class_xrhOOBeB7dc3Ypz3 f_28032;
   private final Class_kLrHwbwaigmlFL18 f_28033;
   private Class_ogbKn2n6FHWLNDRn.ebTnG2S0qRee0CGF f_28034;
   private Class_ogbKn2n6FHWLNDRn.QuxRnbveVQG8t9wi f_28035;
   private static final String f_28036 = "TP RW: сейчас маршрут недоступен";
   private static final String f_28037 = "мир или состояние игрока изменились";
   private static final String f_28038 = "TP RW: маршрут остановлен";
   private static final String f_28039 = "TP RW: активного маршрута нет";
   private static final String f_28040 = "над следующей колонкой нет твёрдой поверхности";
   private static final String f_28041 = "следующий участок не загрузился или на нём нет поверхности";
   private static final String f_28042 = "целевой чанк не загрузился";
   private static final String f_28043 = "над целевой колонкой нет твёрдой поверхности";
   private static final String f_28044 = "TP RW: сухого выхода нет, выхожу под водой";

   public void m_7979() {
      boolean var1 = this.f_28034 != null || this.f_28033.m_7425();
      this.m_7984();
      Class_ftHu9o3WzCU3Adxm.m_6731(var1 ? f_28038 : f_28039);
   }

   private void m_7980(double var1, double var3, double var5, Runnable var7) {
      Class_ogbKn2n6FHWLNDRn.ebTnG2S0qRee0CGF var8 = this.f_28034;
      Class_ogbKn2n6FHWLNDRn.QuxRnbveVQG8t9wi var9 = var8.m_7972();
      boolean var10 = this.f_28033.m_7422(var1, var3, var5, () -> {
         if (this.f_28034 == var8) {
            var7.run();
         }
      });
      if (var10) {
         this.f_28035 = var9;
      }
   }

   private boolean m_7981() {
      return this.f_28031.player != null
         && this.f_28031.level != null
         && this.f_28031.level == this.f_28034.m_7970()
         && this.f_28031.getConnection() != null
         && this.f_28031.player.isAlive()
         && !this.f_28031.player.isPassenger()
         && this.f_28031.player.getPose() == Pose.STANDING
         && !this.m_7994();
   }

   public void m_7982(int var1, int var2) {
      if (!this.m_7987()) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_28036);
      } else {
         this.m_7984();
         this.f_28034 = new Class_ogbKn2n6FHWLNDRn.ebTnG2S0qRee0CGF(this.f_28031.level, var1, var2);
         Class_ftHu9o3WzCU3Adxm.m_6731("" + var1 + var2);
      }
   }

   private void m_7983(String var1) {
      this.m_7984();
      Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
   }

   public void m_7984() {
      this.f_28034 = null;
      this.f_28035 = null;
      this.f_28033.m_7424();
   }

   private void m_7985() {
      if (!this.f_28032.m_9559(this.f_28034.m_7970(), this.f_28034.m_7969(), this.f_28034.m_7974())) {
         if (this.f_28034.m_7971() >= 100) {
            this.m_7983(f_28042);
         }
      } else {
         this.f_28034.m_7973();
         Class_xrhOOBeB7dc3Ypz3.Class_5jfddM01kcv3NYub var1 = this.f_28032.m_9556(this.f_28034.m_7970(), this.f_28034.m_7969(), this.f_28034.m_7974());
         if (var1 == null) {
            this.m_7983(f_28043);
         } else {
            this.f_28034.m_7976(var1.y());
            if (var1.underwater()) {
               Class_ftHu9o3WzCU3Adxm.m_6731(f_28044);
            }

            this.f_28034.m_7977(Class_ogbKn2n6FHWLNDRn.QuxRnbveVQG8t9wi.ASCEND);
         }
      }
   }

   private void m_7986() {
      if (this.f_28033.m_7420()) {
         if (!this.f_28033.m_7423()) {
            this.f_28034.m_7977(Class_ogbKn2n6FHWLNDRn.QuxRnbveVQG8t9wi.ASCEND);
         } else {
            int var1 = this.f_28031.player.getBlockX();
            int var2 = this.f_28031.player.getBlockY();
            int var3 = this.f_28031.player.getBlockZ();
            this.m_7984();
            Class_ftHu9o3WzCU3Adxm.m_6731("" + var1 + var2 + var3);
         }
      }
   }

   private boolean m_7987() {
      return this.f_28031.player != null
         && this.f_28031.level != null
         && this.f_28031.getConnection() != null
         && this.f_28031.player.isAlive()
         && !this.f_28031.player.isPassenger()
         && this.f_28031.player.getPose() == Pose.STANDING
         && !this.m_7994();
   }

   private void m_7988() {
      if (this.f_28032.m_9564(this.f_28031.player.getX(), this.f_28031.player.getZ(), this.f_28034.m_7969(), this.f_28034.m_7974())) {
         this.f_28034.m_7977(Class_ogbKn2n6FHWLNDRn.QuxRnbveVQG8t9wi.WAIT_TARGET_CHUNK);
      } else {
         Class_xrhOOBeB7dc3Ypz3.GOXK1fVlpDV1VLLV var1 = this.f_28032
            .m_9561(
               this.f_28034.m_7970(), this.f_28031.player, this.f_28031.player.getX(), this.f_28031.player.getZ(), this.f_28034.m_7969(), this.f_28034.m_7974()
            );
         if (var1 == null) {
            if (this.f_28034.m_7971() >= 100) {
               this.m_7983(f_28041);
            }
         } else {
            this.f_28034.m_7973();
            this.m_7980(var1.x(), var1.surface().y(), var1.z(), f_28030);
         }
      }
   }

   private void m_7989() {
      this.m_7980(
         this.f_28032.m_9563(this.f_28034.m_7969()),
         this.f_28034.m_7975(),
         this.f_28032.m_9563(this.f_28034.m_7974()),
         () -> this.f_28034.m_7977(Class_ogbKn2n6FHWLNDRn.QuxRnbveVQG8t9wi.FINAL_CONFIRM)
      );
   }

   public void m_7991() {
      if (this.f_28034 != null) {
         if (!this.m_7981()) {
            this.m_7983(f_28037);
         } else if (!this.f_28033.m_7425()) {
            switch (this.f_28034.m_7972()) {
               case ALIGN_SURFACE:
                  this.m_7993();
                  break;
               case MOVE_HORIZONTAL:
                  this.m_7988();
                  break;
               case WAIT_TARGET_CHUNK:
                  this.m_7985();
                  break;
               case ASCEND:
                  this.m_7989();
                  break;
               case FINAL_CONFIRM:
                  this.m_7986();
            }
         }
      }
   }

   public Class_ogbKn2n6FHWLNDRn(Minecraft var1) {
      this.f_28031 = var1;
      this.f_28032 = new Class_xrhOOBeB7dc3Ypz3();
      this.f_28033 = new Class_kLrHwbwaigmlFL18(var1);
   }

   private void m_7993() {
      Class_xrhOOBeB7dc3Ypz3.Class_5jfddM01kcv3NYub var1 = this.f_28032
         .m_9556(this.f_28034.m_7970(), (int)Math.floor(this.f_28031.player.getX()), (int)Math.floor(this.f_28031.player.getZ()));
      if (var1 == null) {
         this.m_7983(f_28040);
      } else {
         this.m_7980(
            this.f_28031.player.getX(),
            var1.y(),
            this.f_28031.player.getZ(),
            () -> this.f_28034.m_7977(Class_ogbKn2n6FHWLNDRn.QuxRnbveVQG8t9wi.MOVE_HORIZONTAL)
         );
      }
   }

   private boolean m_7994() {
      return DimasikClient.m_9057().m_9049().m_2801().m_3460().m_776();
   }

   public void m_7995() {
      if (this.f_28034 != null) {
         this.f_28033.m_7426();
         if (this.f_28035 != null) {
            this.f_28034.m_7977(this.f_28035);
         }
      }
   }

   private enum QuxRnbveVQG8t9wi {
      ALIGN_SURFACE,
      MOVE_HORIZONTAL,
      WAIT_TARGET_CHUNK,
      ASCEND,
      FINAL_CONFIRM;
   }

   private static final class ebTnG2S0qRee0CGF {
      public final ClientLevel f_28023;
      public final int f_28024;
      public final int f_28025;
      public Class_ogbKn2n6FHWLNDRn.QuxRnbveVQG8t9wi f_28026 = Class_ogbKn2n6FHWLNDRn.QuxRnbveVQG8t9wi.ALIGN_SURFACE;
      public int f_28027;
      public int f_28028;

      public int m_7969() {
         return this.f_28024;
      }

      public ebTnG2S0qRee0CGF(ClientLevel var1, int var2, int var3) {
         this.f_28023 = var1;
         this.f_28024 = var2;
         this.f_28025 = var3;
      }

      public ClientLevel m_7970() {
         return this.f_28023;
      }

      public int m_7971() {
         return ++this.f_28028;
      }

      public Class_ogbKn2n6FHWLNDRn.QuxRnbveVQG8t9wi m_7972() {
         return this.f_28026;
      }

      public void m_7973() {
         this.f_28028 = 0;
      }

      public int m_7974() {
         return this.f_28025;
      }

      public int m_7975() {
         return this.f_28027;
      }

      public void m_7976(int var1) {
         this.f_28027 = var1;
      }

      public void m_7977(Class_ogbKn2n6FHWLNDRn.QuxRnbveVQG8t9wi var1) {
         this.f_28026 = var1;
      }
   }
}
