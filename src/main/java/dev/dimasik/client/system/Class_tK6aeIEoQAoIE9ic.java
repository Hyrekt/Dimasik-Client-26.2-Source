package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.combat.Aura;
import java.util.Random;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector2f;

public class Class_tK6aeIEoQAoIE9ic extends Class_kkp256olqZ4F1qt3 {
   private float f_31775;
   private static final float f_31776 = 0.08F;
   private static final float f_31777 = 0.02F;
   private static final float f_31778 = 0.01F;
   private static final double f_31779 = 0.01;
   private static final double f_31780 = 0.5;
   private static final double f_31781 = 0.015;
   private static final double f_31782 = 0.3;
   private static final float f_31783 = 0.5F;
   private static final float f_31784 = 0.4F;
   private static final float f_31785 = 0.5F;
   private static final float f_31786 = 0.2F;
   private static final float f_31787 = 90.0F;
   private static final float f_31788 = 90.0F;
   private static final float f_31789 = 20.0F;
   private static final long f_31790 = 10000L;
   private static final float f_31791 = 375.0F;
   private static final float f_31792 = 3.14F;
   private static final double f_31793 = Math.PI;
   private static final float f_31794 = 7.23F;
   private static final long f_31795 = 10000L;
   private static final float f_31796 = 425.0F;
   private static final float f_31797 = 3.14F;
   private static final double f_31798 = Math.PI;
   private static final float f_31799 = 15.2F;

   public Class_tK6aeIEoQAoIE9ic(Vec3 var1) {
      super(var1);
   }

   @Override
   public void m_1801() {
      this.f_31775 = 0.0F;
   }

   @Override
   public Vector2f m_1006(Vector2f var1, Vector2f var2) {
      Aura var3 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
      double var4 = Mth.wrapDegrees(var2.x - var1.x);
      double var6 = var2.y - var1.y;
      float var11 = (f_31776 + ((float)Math.random() * f_31777 - f_31778)) * var3.m_1159().m_8768();
      this.f_31775 += var11;
      this.f_31775 = Math.clamp(this.f_31775, 0.0F, 1.0F);
      float var10 = this.f_31775;
      float var12 = 0.0F;
      float var13 = 0.0F;
      LivingEntity var14 = DimasikClient.m_9057().m_9049().m_2801().m_3576().m_1114();
      if (f_11537.hitResult instanceof EntityHitResult var15 && var15.getEntity() == var14 && !this.f_25114) {
         this.f_31775 = 0.0F;
         var10 = 0.0F;
      } else {
         var12 = (float)(Math.sin(System.currentTimeMillis() * f_31779) * f_31780);
         var13 = (float)(Math.cos(System.currentTimeMillis() * f_31781) * f_31782);
         if (Math.abs(var4) > 1.0 || Math.abs(var6) > 1.0) {
            var12 += ((float)Math.random() - f_31783) * f_31784;
            var13 += ((float)Math.random() - f_31785) * f_31786;
         }
      }

      float var36 = f_31787;
      float var37 = f_31788;
      float var17 = new Random().nextFloat(f_31789);
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
      float var30 = (float)(System.currentTimeMillis() % f_31790) / f_31791;
      float var31 = (float)Math.sin(var30 * f_31792 * f_31793) * f_31794;
      var8 += !this.f_25114 ? var31 : 0.0F;
      float var32 = (float)(System.currentTimeMillis() % f_31795) / f_31796;
      float var33 = (float)Math.sin(var32 * f_31797 * f_31798) * f_31799;
      var9 += !this.f_25114 ? var33 : 0.0F;
      return new Vector2f(Class_2qQelPM41kDnHHzu.m_1201(var8), Class_2qQelPM41kDnHHzu.m_1201(var9));
   }
}
