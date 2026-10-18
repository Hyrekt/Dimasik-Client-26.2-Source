package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.combat.Aura;
import java.util.Random;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector2f;

public class Class_EHj6ccnn0IY8UWbT extends Class_kkp256olqZ4F1qt3 {
   private float f_6780;
   private static final float f_6781 = 0.08F;
   private static final float f_6782 = 0.02F;
   private static final float f_6783 = 0.01F;
   private static final float f_6784 = 0.01F;
   private static final double f_6785 = 0.001;
   private static final double f_6786 = 0.5;
   private static final double f_6787 = 0.0015;
   private static final double f_6788 = 0.3;
   private static final float f_6789 = 0.5F;
   private static final float f_6790 = 0.4F;
   private static final float f_6791 = 0.5F;
   private static final float f_6792 = 0.2F;
   private static final float f_6793 = 90.0F;
   private static final float f_6794 = 90.0F;
   private static final float f_6795 = 5.0F;
   private static final long f_6796 = 10000L;
   private static final float f_6797 = 375.0F;
   private static final float f_6798 = 3.14F;
   private static final double f_6799 = Math.PI;
   private static final float f_6800 = 7.23F;
   private static final float f_6801 = 0.083333336F;
   private static final long f_6802 = 10000L;
   private static final float f_6803 = 425.0F;
   private static final float f_6804 = 3.14F;
   private static final double f_6805 = Math.PI;
   private static final float f_6806 = 15.2F;
   private static final float f_6807 = 0.083333336F;

   @Override
   public Vector2f m_1006(Vector2f var1, Vector2f var2) {
      Aura var3 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
      double var4 = Mth.wrapDegrees(var2.x - var1.x);
      double var6 = var2.y - var1.y;
      float var11 = (f_6781 + ((float)Math.random() * f_6782 - f_6783)) * f_6784;
      this.f_6780 += var11;
      this.f_6780 = Math.clamp(this.f_6780, 0.0F, 1.0F);
      float var10 = this.f_6780;
      float var12 = 0.0F;
      float var13 = 0.0F;
      LivingEntity var14 = DimasikClient.m_9057().m_9049().m_2801().m_3576().m_1114();
      if (f_11537.hitResult instanceof EntityHitResult var15 && var15.getEntity() == var14 && !this.f_25114) {
         this.f_6780 = 0.0F;
         var10 = 0.0F;
      } else {
         var12 = (float)(Math.sin(System.currentTimeMillis() * f_6785) * f_6786);
         var13 = (float)(Math.cos(System.currentTimeMillis() * f_6787) * f_6788);
         if (Math.abs(var4) > 1.0 || Math.abs(var6) > 1.0) {
            var12 += ((float)Math.random() - f_6789) * f_6790;
            var13 += ((float)Math.random() - f_6791) * f_6792;
         }
      }

      float var36 = f_6793;
      float var37 = f_6794;
      float var17 = new Random().nextFloat(f_6795);
      double var18 = Math.sqrt(var4 * var4 + var6 * var6);
      if (var18 == 0.0) {
         return new Vector2f(var1.x, var1.y);
      }

      double var20 = Math.abs(var4 / var18);
      double var22 = Math.abs(var6 / var18);
      double var24 = (var36 + var17) * var20;
      double var26 = (var37 + var17) * var22;
      float var28 = (float)Math.max(Math.min(var4, var24), -var24) + var12;
      float var29 = (float)Math.max(Math.min(var6, var26), -var26) + var13;
      float var8 = var1.x + var28 * var10;
      float var9 = var1.y + var29 * var10;
      float var30 = (float)(System.currentTimeMillis() % f_6796) / f_6797;
      float var31 = (float)Math.sin(var30 * f_6798 * f_6799) * f_6800 * f_6801;
      var8 -= !this.f_25114 ? var31 : 0.0F;
      float var32 = (float)(System.currentTimeMillis() % f_6802) / f_6803;
      float var33 = (float)Math.sin(var32 * f_6804 * f_6805) * f_6806 * f_6807;
      var9 += !this.f_25114 ? var33 : 0.0F;
      return new Vector2f(Class_uHPXr81r5AZlFeJr.m_9128(var8), Class_uHPXr81r5AZlFeJr.m_9128(var9));
   }

   public Class_EHj6ccnn0IY8UWbT(Vec3 var1) {
      super(var1, Class_kkp256olqZ4F1qt3.HLSsfEOz1OozGlGI.FAST);
   }
}
