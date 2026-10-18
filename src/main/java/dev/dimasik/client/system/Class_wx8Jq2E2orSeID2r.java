package dev.dimasik.client.system;

import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import net.minecraft.client.resources.model.cuboid.CuboidModelElement;
import net.minecraft.core.Direction;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public final class Class_wx8Jq2E2orSeID2r {
   private static final float f_34677 = 0.001F;
   private static final float f_34678 = 1.0E-4F;
   private static final float f_34679 = 0.001F;
   private static final float f_34680 = 1.0E-4F;
   private static final float f_34681 = 0.001F;
   private static final float f_34682 = 0.001F;
   private static final float f_34683 = 1.0E-4F;
   private static final float f_34684 = 0.001F;
   private static final float f_34685 = 0.001F;
   private static final float f_34686 = 1.0E-4F;
   private static final float f_34687 = 0.001F;
   private static final float f_34688 = 0.001F;
   private static final float f_34689 = 1.0E-4F;
   private static final float f_34690 = 0.001F;
   private static final float f_34691 = 1.0E-4F;
   private static final float f_34692 = 0.001F;
   private static final float f_34693 = 0.001F;
   private static final float f_34694 = 1.0E-4F;
   private static final float f_34695 = 0.001F;
   private static final float f_34696 = 0.001F;
   private static final float f_34697 = 1.0E-4F;
   private static final float f_34698 = 0.001F;
   private static final float f_34699 = 0.001F;
   private static final float f_34700 = 1.0E-4F;
   private static final float f_34701 = 0.001F;
   private static final float f_34702 = 0.001F;

   private Class_wx8Jq2E2orSeID2r() {
   }

   public static void m_9438(List<CuboidModelElement> var0) {
      ListIterator var1 = var0.listIterator();

      while (var1.hasNext()) {
         CuboidModelElement var2 = (CuboidModelElement)var1.next();
         Set var3 = var2.faces().keySet();
         if (var3.size() == 1) {
            Direction var4 = (Direction)var3.iterator().next();
            if (var4 == Direction.DOWN || var4 == Direction.UP || var4 == Direction.NORTH || var4 == Direction.SOUTH) {
               Vector3fc var5 = var2.from();
               Vector3fc var6 = var2.to();
               Vector3f var7 = new Vector3f(var5);
               Vector3f var8 = new Vector3f(var6);
               m_9439(var7, var8, var4);
               var1.set(new CuboidModelElement(var7, var8, var2.faces(), var2.rotation(), var2.shade(), var2.lightEmission()));
            }
         }
      }
   }

   public static void m_9439(Vector3f var0, Vector3f var1, Direction var2) {
      switch (var2) {
         case DOWN:
            var0.set(var0.x() - f_34679, var0.y() - f_34680, var0.z() - f_34681);
            var1.set(var1.x() + f_34682, var1.y() - f_34683, var1.z() + f_34684);
            break;
         case UP:
            var0.set(var0.x() - f_34685, var0.y() + f_34686, var0.z() - f_34687);
            var1.set(var1.x() + f_34688, var1.y() + f_34689, var1.z() + f_34690);
            break;
         case NORTH:
            var0.set(var0.x() - f_34691, var0.y() + f_34692, var0.z() - f_34693);
            var1.set(var1.x() - f_34694, var1.y() - f_34695, var1.z() + f_34696);
            break;
         case SOUTH:
            var0.set(var0.x() + f_34697, var0.y() + f_34698, var0.z() - f_34699);
            var1.set(var1.x() + f_34700, var1.y() - f_34701, var1.z() + f_34702);
      }
   }
}
