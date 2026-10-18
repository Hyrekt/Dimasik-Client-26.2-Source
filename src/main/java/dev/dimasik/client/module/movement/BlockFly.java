package dev.dimasik.client.module.movement;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_LJY6AyYHP77Twgvj;
import dev.dimasik.client.system.Class_QmNR03reugBgWiPr;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_mRcJJZJYG5cvDAlU;

public class BlockFly extends Module {
   private final SliderSetting f_19078;
   private final Class_QmNR03reugBgWiPr f_19079;
   private final Class_gEPk7yDw6CwIte87<Class_mRcJJZJYG5cvDAlU> f_19080;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_19081;
   private static final String f_19082 = "BlockFly";
   private static final String f_19083 = "Позволяет летать блоками на RW";
   private static final String f_19084 = "Задержка";
   private static final float f_19085 = 500.0F;
   private static final float f_19086 = 500.0F;
   private static final float f_19087 = 50.0F;

   public BlockFly() {
      super(f_19082, f_19083, Category.MOVEMENT);
      this.f_19078 = new SliderSetting(f_19084, f_19085, 0.0F, f_19086).m_828(f_19087);
      this.f_19079 = new Class_QmNR03reugBgWiPr();
      this.f_19080 = this::m_6369;
      this.f_19081 = this::m_6370;
      this.m_795(this.f_19078);
   }

   @Override
   public void m_778() {
      super.m_778();
      this.f_19079.m_4459();
      Class_LJY6AyYHP77Twgvj.m_3626();
   }

   @Override
   public void m_732() {
      super.m_732();
      if (f_11537.player != null) {
         f_11537.player.noPhysics = false;
      }

      Class_LJY6AyYHP77Twgvj.m_3626();
   }

   private void m_6369(Class_mRcJJZJYG5cvDAlU var1) {
      if (this.m_776()) {
         var1.m_7592(false);
      }
   }

   private void m_6370(Class_Xu9btcIeUN33XnMK var1) {
      if (this.m_776() && f_11537.player != null && f_11537.level != null && f_11537.gameMode != null) {
         boolean var2 = f_11537.options.keyUp.isDown();
         boolean var3 = f_11537.options.keyJump.isDown();
         boolean var4 = f_11537.options.keyShift.isDown();
         if (!f_11537.player.onGround()) {
            double var5 = (var3 ? 1.0 : 0.0) - (var4 ? 1.0 : 0.0);
            if (var2 || var5 != 0.0) {
               if (this.f_19079.m_4463(this.f_19078.m_8768().longValue())) {
                  double var7 = Math.toRadians(f_11537.player.getYRot());
                  double var9 = var2 ? -Math.sin(var7) : 0.0;
                  double var11 = var2 ? Math.cos(var7) : 0.0;
                  if (f_11537.options.getCameraType().isFirstPerson()) {
                     Class_LJY6AyYHP77Twgvj.m_3624(f_11537.player);
                  } else {
                     Class_LJY6AyYHP77Twgvj.m_3626();
                  }

                  f_11537.player.setPos(f_11537.player.getX() + var9, f_11537.player.getY() + var5, f_11537.player.getZ() + var11);
                  this.f_19079.m_4459();
               }
            }
         }
      }
   }
}
