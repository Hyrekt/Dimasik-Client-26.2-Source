package dev.dimasik.client.module.render;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.system.Class_3VHxwfI2NZKoxzIi;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import java.util.Locale;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Vector2f;

public final class TNTTimer extends Module {
   private static final float f_24774 = 64.0F;
   private static final int f_24775 = 13;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_24776 = this::m_7388;
   private static final String f_24777 = "TNTTimer";
   private static final String f_24778 = "Время до взрыва динамита";
   private static final double f_24779 = 64.0;
   private static final String f_24780 = "%.1f сек";
   private static final float f_24781 = 20.0F;
   private static final double f_24782 = 0.5;
   private static final float f_24783 = 6.0F;
   private static final float f_24784 = 13.0F;
   private static final float f_24785 = 6.0F;
   private static final float f_24786 = 0.5F;
   private static final double f_24787 = 125.0;
   private static final float f_24788 = 3.0F;
   private static final float f_24789 = 0.5F;
   private static final float f_24790 = 13.0F;
   private static final double f_24791 = 255.0;

   public TNTTimer() {
      super(f_24777, f_24778, Category.RENDER);
   }

   private void m_7388(Class_bhRaN0YSSLQRYjPo var1) {
      if (var1.m_6083() != null && f_11537.player != null && f_11537.level != null) {
         Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
         float var2 = f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true);

         for (PrimedTnt var4 : f_11537.level.getEntitiesOfClass(PrimedTnt.class, f_11537.player.getBoundingBox().inflate(f_24779), var0 -> true)) {
            String var5 = String.format(Locale.ROOT, f_24780, var4.getFuse() / f_24781);
            Vec3 var6 = Class_3VHxwfI2NZKoxzIi.m_1303(new Vec3(var4.xo, var4.yo, var4.zo), var4.position(), var2).add(0.0, var4.getBbHeight() + f_24782, 0.0);
            Vector2f var7 = Class_FvJXUGWpZo3zYBW4.m_2690(var6);
            if (var7 != null) {
               float var8 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var5, 13) + f_24783;
               float var9 = Class_Ssh31B3ljfKeWsvS.m_4823(Class_y1y6QpONhWEUIdEB.m_9588(), f_24784) + f_24785;
               float var10 = var7.x - var8 * f_24786;
               float var11 = var7.y;
               Class_Ssh31B3ljfKeWsvS.m_4817(var10, var11, var8, var9, 0.0F, Class_BftdentXEtGbugJw.m_2303(15, 15, 16, f_24787));
               Class_Ssh31B3ljfKeWsvS.m_4866(
                  Class_y1y6QpONhWEUIdEB.m_9588(),
                  var5,
                  var10 + f_24788,
                  Class_Ssh31B3ljfKeWsvS.m_4839(Class_y1y6QpONhWEUIdEB.m_9588(), var11 + var9 * f_24789, f_24790),
                  13,
                  Class_BftdentXEtGbugJw.m_2303(255, 55, 55, f_24791)
               );
            }
         }
      }
   }
}
