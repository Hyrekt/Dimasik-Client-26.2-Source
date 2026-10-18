package dev.dimasik.client.module.render;

import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.system.Class_81oIJPtsDGdzRKcL;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_Zqqahn7tp91I2xsr;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_bhSc4OUnYWSe2vjL;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_nio4jTv6m1ynGWq8;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import java.util.Locale;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Vector2f;

public final class WardenESP extends Module {
   private final Class_nio4jTv6m1ynGWq8 f_14817 = new Class_nio4jTv6m1ynGWq8();
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_14818 = this::m_5248;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_14819 = this::m_5249;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_14820 = this::m_5247;
   private static final String f_14821 = "Warden ESP";
   private static final String f_14822 = "Отображает сундуки в городе варденов с таймером возрождения";
   private static final double f_14823 = 255.0;
   private static final double f_14824 = 0.6;
   private static final long f_14825 = 1000L;
   private static final String f_14826 = "%02d:%02d";
   private static final float f_14827 = 28.0F;
   private static final float f_14828 = 22.0F;
   private static final float f_14829 = 0.5F;
   private static final float f_14830 = 0.5F;
   private static final float f_14831 = 6.0F;
   private static final double f_14832 = 210.0;
   private static final float f_14833 = 4.0F;
   private static final float f_14834 = 3.0F;
   private static final float f_14835 = 0.9F;
   private static final float f_14836 = 22.0F;
   private static final float f_14837 = 0.5F;
   private static final float f_14838 = 11.0F;
   private static final double f_14839 = 255.0;

   private void m_5247(Class_bhRaN0YSSLQRYjPo var1) {
      if (var1.m_6083() != null && f_11537.level != null && Class_Zqqahn7tp91I2xsr.m_5864(f_11537.level)) {
         Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());

         for (BlockPos var3 : this.f_14817.m_7690()) {
            Class_nio4jTv6m1ynGWq8.HZs4HwDaM8Wd3CUt var4 = this.f_14817.m_7696(var3);
            if (var4 != null) {
               Vector2f var5 = Class_FvJXUGWpZo3zYBW4.m_2690(Vec3.atCenterOf(var3).add(0.0, f_14824, 0.0));
               if (var5 != null) {
                  int var6 = (int)(var4.m_7689() / f_14825);
                  String var7 = String.format(Locale.US, f_14826, var6 / 60, var6 % 60);
                  float var8 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var7, 11);
                  float var9 = f_14827 + var8;
                  float var10 = f_14828;
                  float var11 = var5.x - var9 * f_14829;
                  float var12 = var5.y - var10 * f_14830;
                  Class_Ssh31B3ljfKeWsvS.m_4817(var11, var12, var9, var10, f_14831, Class_BftdentXEtGbugJw.m_2303(11, 11, 13, f_14832));
                  Class_Ssh31B3ljfKeWsvS.m_4851(Items.CHEST.getDefaultInstance(), var11 + f_14833, var12 + f_14834, f_14835, false);
                  Class_Ssh31B3ljfKeWsvS.m_4866(
                     Class_y1y6QpONhWEUIdEB.m_9588(),
                     var7,
                     var11 + f_14836,
                     Class_Ssh31B3ljfKeWsvS.m_4839(Class_y1y6QpONhWEUIdEB.m_9588(), var12 + var10 * f_14837, f_14838),
                     11,
                     Class_BftdentXEtGbugJw.m_2303(238, 247, 255, f_14839)
                  );
               }
            }
         }
      }
   }

   public WardenESP() {
      super(f_14821, f_14822, Category.RENDER);
   }

   private void m_5248(Class_Xu9btcIeUN33XnMK var1) {
      this.f_14817.m_7695();
   }

   private void m_5249(Class_TZhU50s8XmBQCMP5 var1) {
      if (f_11537.level != null && Class_Zqqahn7tp91I2xsr.m_5864(f_11537.level)) {
         VertexConsumer var2 = var1.m_5008().m_881(Class_81oIJPtsDGdzRKcL.f_3816);
         Vec3 var3 = var1.m_5010();
         int var4 = Class_BftdentXEtGbugJw.m_2303(255, 100, 100, f_14823);

         for (BlockPos var6 : this.f_14817.m_7690()) {
            if (this.f_14817.m_7696(var6) == null) {
               Class_bhSc4OUnYWSe2vjL.m_6088(
                  var1.m_5006(), var2, var3, var6.getX(), var6.getY(), var6.getZ(), var6.getX() + 1.0, var6.getY() + 1.0, var6.getZ() + 1.0, var4, false
               );
            }
         }
      }
   }

   public Class_nio4jTv6m1ynGWq8 m_5250() {
      return this.f_14817;
   }
}
