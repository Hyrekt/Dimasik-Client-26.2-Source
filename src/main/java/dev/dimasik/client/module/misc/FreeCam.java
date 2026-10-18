package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_331rljyx7QX4JcMi;
import dev.dimasik.client.system.Class_Wb2zlgDaESbnT0hQ;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_dpBlC70x4optBWBD;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_jfpiTZhNIuwDwqKr;
import lombok.Generated;
import net.minecraft.client.CameraType;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;

public class FreeCam extends Module {
   private static final long f_16764 = 380000000L;
   private final SliderSetting f_16765;
   private final SliderSetting f_16766;
   private Vec3 f_16767;
   private Vec3 f_16768;
   private Vec2 f_16769;
   private CameraType f_16770;
   private Vec3 f_16771;
   private float f_16772;
   private float f_16773;
   private long f_16774;
   private boolean f_16775;
   private static float f_16776;
   private static float f_16777;
   private final Class_gEPk7yDw6CwIte87<Class_331rljyx7QX4JcMi> f_16778;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_16779;
   private final Class_gEPk7yDw6CwIte87<Class_jfpiTZhNIuwDwqKr> f_16780;
   private final Class_gEPk7yDw6CwIte87<Class_dpBlC70x4optBWBD> f_16781;
   private final Class_gEPk7yDw6CwIte87<Class_Wb2zlgDaESbnT0hQ> f_16782;
   private static final String f_16783 = "FreeCam";
   private static final String f_16784 = "Свободная камера";
   private static final String f_16785 = "Скорость XZ";
   private static final float f_16786 = 0.5F;
   private static final float f_16787 = 0.1F;
   private static final float f_16788 = 1.5F;
   private static final float f_16789 = 0.05F;
   private static final String f_16790 = "Скорость Y";
   private static final float f_16791 = 0.5F;
   private static final float f_16792 = 0.1F;
   private static final float f_16793 = 1.5F;
   private static final float f_16794 = 0.05F;
   private static final float f_16795 = 0.15F;
   private static final float f_16796 = 0.15F;
   private static final float f_16797 = -90.0F;
   private static final float f_16798 = 90.0F;
   private static final float f_16799 = 3.8E8F;
   private static final float f_16800 = -45.0F;
   private static final float f_16801 = 45.0F;
   private static final float f_16802 = 45.0F;
   private static final float f_16803 = -45.0F;
   private static final double f_16804 = -1.0;
   private static final float f_16805 = 90.0F;
   private static final float f_16806 = 90.0F;
   private static final float f_16807 = 90.0F;
   private static final float f_16808 = 90.0F;

   @Generated
   public static float m_5764() {
      return f_16776;
   }

   private float m_5765() {
      return Mth.clamp((float)(System.nanoTime() - this.f_16774) / f_16799, 0.0F, 1.0F);
   }

   public void m_5766(Class_dpBlC70x4optBWBD var1) {
      var1.m_6349(f_16776);
      var1.m_6350(f_16777);
   }

   private void m_5767(Class_Wb2zlgDaESbnT0hQ var1) {
      f_16776 = f_16776 + var1.m_5479() * f_16795;
      f_16777 = Math.clamp(f_16777 + var1.m_5476() * f_16796, f_16797, f_16798);
      var1.m_1582(true);
   }

   private void m_5768(Class_331rljyx7QX4JcMi var1) {
      if (this.f_16767 != null && this.f_16768 != null) {
         Vec3 var2 = this.f_16768.lerp(this.f_16767, var1.m_1217());
         var1.m_1219(var2);
      }
   }

   @Generated
   public static void m_5769(float var0) {
      f_16777 = var0;
   }

   @Generated
   public static float m_5770() {
      return f_16777;
   }

   private float m_5771(float var1) {
      float var2 = 1.0F - var1;
      return 1.0F - var2 * var2 * var2;
   }

   public Vec2 m_5772(float var1, float var2) {
      if (!this.f_16775) {
         return new Vec2(var1, var2);
      }

      float var3 = this.m_5771(this.m_5765());
      float var4 = Mth.wrapDegrees(var1 - this.f_16772);
      return new Vec2(this.f_16772 + var4 * var3, Mth.lerp(var3, this.f_16773, var2));
   }

   @Generated
   public static void m_5773(float var0) {
      f_16776 = var0;
   }

   private void m_5774(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (this.f_16767 == null) {
            Vec3 var2 = f_11537.gameRenderer.mainCamera().position();
            this.f_16767 = var2;
            this.f_16768 = var2;
         }

         if (f_11537.options.getCameraType() != CameraType.FIRST_PERSON) {
            f_11537.options.setCameraType(CameraType.FIRST_PERSON);
         }

         this.f_16768 = this.f_16767;
         float var13 = this.f_16765.m_8768();
         float var3 = this.f_16766.m_8768();
         float var4 = f_16776;
         double var5 = 0.0;
         double var7 = 0.0;
         if (f_11537.options.keyUp.isDown()) {
            var5++;
         }

         if (f_11537.options.keyDown.isDown()) {
            var5--;
         }

         if (f_11537.options.keyLeft.isDown()) {
            var7++;
         }

         if (f_11537.options.keyRight.isDown()) {
            var7--;
         }

         double var9 = 0.0;
         double var11 = 0.0;
         if (var5 != 0.0 || var7 != 0.0) {
            if (var5 != 0.0) {
               if (var7 > 0.0) {
                  var4 += var5 > 0.0 ? f_16800 : f_16801;
               } else if (var7 < 0.0) {
                  var4 += var5 > 0.0 ? f_16802 : f_16803;
               }

               var7 = 0.0;
               if (var5 > 0.0) {
                  var5 = 1.0;
               } else {
                  var5 = f_16804;
               }
            }

            var9 = var5 * var13 * Mth.cos((float)Math.toRadians(var4 + f_16805)) + var7 * var13 * Mth.sin(Math.toRadians(var4 + f_16806));
            var11 = var5 * var13 * Mth.sin((float)Math.toRadians(var4 + f_16807)) - var7 * var13 * Mth.cos(Math.toRadians(var4 + f_16808));
         }

         this.f_16767 = this.f_16767.add(var9, 0.0, var11);
         if (f_11537.options.keyJump.isDown()) {
            this.f_16767 = this.f_16767.add(0.0, var3, 0.0);
         }

         if (f_11537.options.keyShift.isDown()) {
            this.f_16767 = this.f_16767.add(0.0, -var3, 0.0);
         }
      }
   }

   private void m_5775() {
      this.f_16775 = false;
      this.f_16771 = null;
      this.f_16772 = 0.0F;
      this.f_16773 = 0.0F;
      this.f_16774 = 0L;
      this.f_16767 = null;
      this.f_16768 = null;
      if (this.f_16770 != null) {
         f_11537.options.setCameraType(this.f_16770);
         this.f_16770 = null;
      }
   }

   public Vec3 m_5776(Vec3 var1) {
      if (this.f_16775 && this.f_16771 != null) {
         float var2 = this.m_5765();
         float var3 = this.m_5771(var2);
         Vec3 var4 = this.f_16771.lerp(var1, var3);
         if (var2 >= 1.0F) {
            this.m_5775();
            return var1;
         } else {
            return var4;
         }
      } else {
         return var1;
      }
   }

   @Override
   public void m_778() {
      this.f_16775 = false;
      this.f_16771 = null;
      this.f_16774 = 0L;
      this.f_16770 = f_11537.options.getCameraType();
      if (f_11537.player != null) {
         this.f_16769 = new Vec2(f_11537.player.getYRot(), f_11537.player.getXRot());
         f_16776 = f_11537.gameRenderer.mainCamera().yRot();
         f_16777 = f_11537.gameRenderer.mainCamera().xRot();
      }
   }

   @Override
   public void m_732() {
      if (this.f_16769 != null) {
         f_11537.player.setYRot(this.f_16769.x);
         f_11537.player.setXRot(this.f_16769.y);
      }

      if (this.f_16767 != null && f_11537.player != null && f_11537.level != null) {
         this.f_16775 = true;
         this.f_16771 = this.f_16767;
         this.f_16772 = f_16776;
         this.f_16773 = f_16777;
         this.f_16774 = System.nanoTime();
      } else {
         this.m_5775();
      }

      this.f_16769 = null;
   }

   public FreeCam() {
      super(f_16783, f_16784, Category.MISC);
      this.f_16765 = new SliderSetting(f_16785, f_16786, f_16787, f_16788).m_828(f_16789);
      this.f_16766 = new SliderSetting(f_16790, f_16791, f_16792, f_16793).m_828(f_16794);
      this.f_16778 = this::m_5768;
      this.f_16779 = this::m_5774;
      this.f_16780 = this::m_5777;
      this.f_16781 = this::m_5766;
      this.f_16782 = this::m_5767;
      this.m_795(this.f_16765, this.f_16766);
   }

   private void m_5777(Class_jfpiTZhNIuwDwqKr var1) {
      if (this.f_16769 == null) {
         this.f_16769 = new Vec2(var1.m_7396(), var1.m_7397());
      }

      f_11537.player.setYRot(this.f_16769.x);
      f_11537.player.setXRot(this.f_16769.y);
      var1.m_1582(true);
   }
}
