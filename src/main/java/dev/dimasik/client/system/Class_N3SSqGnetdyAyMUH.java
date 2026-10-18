package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.world.phys.Vec3;

public abstract class Class_N3SSqGnetdyAyMUH {
   public abstract void m_2482(
      Class_WzqIkwE6nF1UkDXB var1, float var2, PoseStack var3, VertexConsumer var4, int var5, int var6, float var7, float var8, float var9, float var10
   );

   public static Class_JtQh1r0P8b1y8XvD m_3989(int var0, int var1) {
      return new Class_JtQh1r0P8b1y8XvD(64, 64, var0, var1);
   }

   public static void m_3990(Class_JtQh1r0P8b1y8XvD var0, Class_JtQh1r0P8b1y8XvD var1, Vec3 var2) {
      var1.f_10058 = var0.f_10058 = Class_O4GrYnfSWk91dY9f.m_4030((float)var2.x);
      var0.f_10059 = Class_O4GrYnfSWk91dY9f.m_4030((float)var2.y);
      var1.f_10059 = -var0.f_10059;
      var0.f_10060 = Class_O4GrYnfSWk91dY9f.m_4030((float)var2.z);
      var1.f_10060 = -var0.f_10060;
   }
}
