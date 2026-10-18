package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.combat.Aura;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector2f;

public class Class_M1A3MKDuK3GlHJ7q extends Class_kkp256olqZ4F1qt3 {
   private final Class_obxgsH9koqdKsBxq f_11050;
   private final Class_kPXtxQj0j9mBpxqt f_11051;
   private Vec3 f_11052;
   private float f_11053;
   private float f_11054;
   private float f_11055;
   private boolean f_11056;
   private int f_11057;
   private float f_11058;
   private static final float f_11059 = 15.0F;
   private static final double f_11060 = 0.5;
   private static final float f_11061 = 0.6F;
   private static final double f_11062 = 0.3;
   private static final float f_11063 = 0.5F;
   private static final double f_11064 = 0.5;
   private static final float f_11065 = 0.6F;
   private static final double f_11066 = 0.12;
   private static final double f_11067 = 0.08;
   private static final float f_11068 = 0.003F;
   private static final float f_11069 = 0.008F;
   private static final double f_11070 = 0.5;
   private static final double f_11071 = 0.5;
   private static final double f_11072 = 0.6F;
   private static final float f_11073 = 80.0F;
   private static final float f_11074 = 20.0F;
   private static final float f_11075 = 0.2F;
   private static final double f_11076 = 20.0;
   private static final float f_11077 = 0.6F;
   private static final float f_11078 = 0.2F;
   private static final double f_11079 = 20.0;
   private static final double f_11080 = 15.0;
   private static final float f_11081 = 3.0F;
   private static final float f_11082 = 1.2F;
   private static final float f_11083 = 0.98F;
   private static final float f_11084 = 0.5F;
   private static final float f_11085 = 0.5F;
   private static final float f_11086 = 0.4F;
   private static final float f_11087 = 0.9F;
   private static final float f_11088 = 0.985F;
   private static final float f_11089 = 0.01F;
   private static final float f_11090 = 0.98F;
   private static final float f_11091 = 0.015F;
   private static final float f_11092 = 0.8F;
   private static final float f_11093 = 0.15F;
   private static final float f_11094 = 0.75F;
   private static final float f_11095 = 0.15F;
   private static final float f_11096 = 0.3F;
   private static final float f_11097 = 0.7F;
   private static final float f_11098 = 0.3F;
   private static final float f_11099 = 0.7F;
   private static final float f_11100 = 1.02F;
   private static final float f_11101 = 1.02F;
   private static final float f_11102 = 0.002F;
   private static final float f_11103 = 0.005F;
   private static final double f_11104 = 0.5;
   private static final double f_11105 = 0.5;
   private static final double f_11106 = 0.8F;
   private static final double f_11107 = 0.001;
   private static final double f_11108 = 0.5;
   private static final double f_11109 = 0.1;
   private static final double f_11110 = 0.5;
   private static final double f_11111 = 0.08;
   private static final float f_11112 = -90.0F;
   private static final float f_11113 = 90.0F;

   @Override
   public Vector2f m_1007() {
      LivingEntity var1 = DimasikClient.m_9057().m_9049().m_2801().m_3576().m_1114();
      float var2 = (float)(Math.random() - f_11060) * f_11537.player.getBbWidth() * f_11061;
      float var3 = (float)(Math.random() - f_11062) * f_11537.player.getBbHeight() * f_11063;
      float var4 = (float)(Math.random() - f_11064) * f_11537.player.getBbWidth() * f_11065;
      Vec3 var5 = new Vec3(var2, var3, var4);
      this.f_11052 = this.f_11052.lerp(var5, f_11066 + Math.random() * f_11067);
      Vec3 var6 = f_11537.player.getEyePosition();
      Vec3 var7 = this.f_25115.add(this.f_11052);
      Vec3 var8 = var7.subtract(var6).normalize();
      float var9 = (float)Math.toDegrees(Math.atan2(-var8.x, var8.z));
      float var10 = (float)Math.toDegrees(Math.asin(var8.y));
      return new Vector2f(var9, -var10);
   }

   @Override
   public Vector2f m_1006(Vector2f var1, Vector2f var2) {
      Aura var3 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
      Minecraft var4 = Minecraft.getInstance();
      float var5 = var2.x;
      float var6 = var2.y;
      float var7 = f_11068 + (float)Math.random() * f_11069;
      var5 += (float)((Math.random() - f_11070) * var7);
      var6 += (float)((Math.random() - f_11071) * var7 * f_11072);
      float var8 = var1.x;
      float var9 = var1.y;
      double var10 = Mth.wrapDegrees(var5 - var8);
      double var12 = var6 - var9;
      double var14 = Math.sqrt(var10 * var10 + var12 * var12);
      if (var14 == 0.0) {
         return new Vector2f(var1.x, var1.y);
      }

      float var16 = f_11073 + (float)Math.random() * f_11074;
      float var17 = var16 * (1.0F + f_11075 * (float)Math.min(var14 / f_11076, 1.0));
      float var18 = var16 * f_11077 * (1.0F + f_11078 * (float)Math.min(var14 / f_11079, 1.0));
      double var19 = Math.abs(var10 / var14);
      double var21 = Math.abs(var12 / var14);
      double var23 = var17 * var19;
      double var25 = var18 * var21;
      float var27 = (float)Math.clamp(var10, -var23, var23);
      float var28 = (float)Math.clamp(var12, -var25, var25);
      float var29 = (float)Math.min(var14 / f_11080, 1.0);
      float var30 = var29 * var29 * (f_11081 - 2.0F * var29);
      var30 = Math.min(var30 * f_11082, f_11083);
      var27 *= var30;
      var28 *= var30;
      this.f_11053 = this.f_11053 * f_11084 + f_11085;
      this.f_11053 = Math.clamp(this.f_11053, f_11086, f_11087);
      float var31 = f_11088 + (float)Math.random() * f_11089;
      float var32 = f_11090 + (float)Math.random() * f_11091;
      var27 *= var31 * (f_11092 + this.f_11053 * f_11093);
      var28 *= var32 * (f_11094 + this.f_11053 * f_11095);
      this.f_11054 = this.f_11054 * f_11096 + var27 * f_11097;
      this.f_11055 = this.f_11055 * f_11098 + var28 * f_11099;
      float var33 = Math.abs((float)var10) * f_11100;
      float var34 = Math.abs((float)var12) * f_11101;
      this.f_11054 = Math.clamp(this.f_11054, -var33, var33);
      this.f_11055 = Math.clamp(this.f_11055, -var34, var34);
      var5 = var8 + this.f_11054;
      var6 = var9 + this.f_11055;
      float var35 = f_11102 + (float)Math.random() * f_11103;
      var5 += (float)((Math.random() - f_11104) * var35);
      var6 += (float)((Math.random() - f_11105) * var35 * f_11106);
      if (Math.random() < f_11107) {
         var5 += (float)((Math.random() - f_11108) * f_11109);
         var6 += (float)((Math.random() - f_11110) * f_11111);
      }

      var6 = Math.max(f_11112, Math.min(f_11113, var6));
      return new Vector2f(Class_uHPXr81r5AZlFeJr.m_9128(var5), Class_uHPXr81r5AZlFeJr.m_9128(var6));
   }

   public Class_M1A3MKDuK3GlHJ7q(Vec3 var1) {
      super(var1);
      this.f_11050 = new Class_obxgsH9koqdKsBxq(1.0F, f_11059, 1.0F);
      this.f_11051 = new Class_kPXtxQj0j9mBpxqt();
      this.f_11052 = Vec3.ZERO;
      this.f_11053 = 0.0F;
      this.f_11054 = 0.0F;
      this.f_11055 = 0.0F;
      this.f_11056 = false;
      this.f_11057 = 0;
      this.f_11058 = 0.0F;
   }

   @Override
   public void m_3874() {
      this.f_11050.m_7967();
   }

   @Override
   public boolean m_2678() {
      return false;
   }
}
