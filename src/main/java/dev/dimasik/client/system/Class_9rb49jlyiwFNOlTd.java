package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.combat.Aura;
import java.util.Random;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector2f;

public final class Class_9rb49jlyiwFNOlTd extends Class_kkp256olqZ4F1qt3 {
   private static final int f_4919 = Integer.MIN_VALUE;
   private static final int f_4920 = 3;
   private static final float f_4921 = -25.0F;
   private static final float f_4922 = 25.0F;
   private boolean f_4923;
   private final Random f_4924 = new Random();
   private Class_9rb49jlyiwFNOlTd.mn4h0QrxdczI0Wn4 f_4925 = Class_9rb49jlyiwFNOlTd.mn4h0QrxdczI0Wn4.IDLE;
   private int f_4926;
   private int f_4927;
   private float f_4928;
   private float f_4929;
   private float f_4930;
   private int f_4931;
   private int f_4932;
   private boolean f_4933;
   private boolean f_4934;
   private Class_9rb49jlyiwFNOlTd.eSaeBRGVpAqYNihi f_4935;
   private boolean f_4936;
   private int f_4937;
   private int f_4938;
   private Vector2f f_4939;
   private Vector2f f_4940;
   private float f_4941;
   private float f_4942;
   private float f_4943;
   private float f_4944;
   private float f_4945;
   private float f_4946;
   private float f_4947;
   private float f_4948;
   private float f_4949;
   private float f_4950;
   private float f_4951;
   private float f_4952;
   private Class_9rb49jlyiwFNOlTd.eSaeBRGVpAqYNihi f_4953;
   private boolean f_4954;
   private int f_4955;
   private int f_4956;
   private float f_4957;
   private float f_4958;
   private Vector2f f_4959;
   private Class_9rb49jlyiwFNOlTd.eSaeBRGVpAqYNihi f_4960;
   private Vector2f f_4961;
   private Vector2f f_4962;
   private float f_4963;
   private static final int f_4964 = Integer.MIN_VALUE;
   private static final float f_4965 = 0.68F;
   private static final float f_4966 = 0.38F;
   private static final int f_4967 = Integer.MIN_VALUE;
   private static final float f_4968 = -90.0F;
   private static final float f_4969 = 90.0F;
   private static final float f_4970 = 1.5F;
   private static final float f_4971 = 1.5F;
   private static final float f_4972 = -90.0F;
   private static final float f_4973 = 90.0F;
   private static final double f_4974 = Math.PI;
   private static final double f_4975 = Math.PI;
   private static final float f_4976 = -90.0F;
   private static final float f_4977 = 90.0F;
   private static final float f_4978 = 0.001F;
   private static final double f_4979 = 3.0;
   private static final double f_4980 = 1.5;
   private static final double f_4981 = 0.001;
   private static final float f_4982 = 0.22F;
   private static final float f_4983 = 0.28F;
   private static final float f_4984 = 0.35F;
   private static final float f_4985 = 5.0F;
   private static final float f_4986 = 0.12F;
   private static final float f_4987 = 0.2F;
   private static final float f_4988 = 3.5F;
   private static final float f_4989 = 0.8F;
   private static final float f_4990 = 0.15F;
   private static final float f_4991 = 0.58F;
   private static final float f_4992 = 0.78F;
   private static final float f_4993 = 0.25F;
   private static final float f_4994 = 3.2F;
   private static final float f_4995 = 0.8F;
   private static final float f_4996 = 0.08F;
   private static final float f_4997 = -1.0F;
   private static final float f_4998 = 0.15F;
   private static final float f_4999 = 1.8F;
   private static final float f_5000 = 0.5F;
   private static final float f_5001 = 0.08F;
   private static final float f_5002 = 0.08F;
   private static final float f_5003 = 0.42F;
   private static final float f_5004 = -1.0F;
   private static final float f_5005 = 0.05F;
   private static final float f_5006 = 0.28F;
   private static final float f_5007 = -1.0F;
   private static final float f_5008 = (float) (Math.PI * 2);
   private static final float f_5009 = 5.5F;
   private static final float f_5010 = 9.5F;
   private static final float f_5011 = -0.055F;
   private static final float f_5012 = 0.095F;
   private static final float f_5013 = 0.02F;
   private static final float f_5014 = 0.22F;
   private static final float f_5015 = 0.72F;
   private static final float f_5016 = 0.98F;
   private static final float f_5017 = 0.68F;
   private static final float f_5018 = 0.02F;
   private static final float f_5019 = 0.14F;
   private static final float f_5020 = 0.82F;
   private static final float f_5021 = 0.97F;
   private static final float f_5022 = -25.0F;
   private static final float f_5023 = 25.0F;
   private static final float f_5024 = -25.0F;
   private static final float f_5025 = 25.0F;
   private static final float f_5026 = -25.0F;
   private static final float f_5027 = 1.5F;
   private static final float f_5028 = 25.0F;
   private static final float f_5029 = -25.0F;
   private static final double f_5030 = Math.PI;
   private static final double f_5031 = 0.5;
   private static final float f_5032 = 0.5F;
   private static final float f_5033 = -2.0F;
   private static final double f_5034 = 2.0;
   private static final float f_5035 = 0.5F;
   private static final float f_5036 = 0.5F;
   private static final float f_5037 = 8.0F;
   private static final float f_5038 = -2.0F;
   private static final double f_5039 = 4.0;
   private static final float f_5040 = 0.5F;
   private static final float f_5041 = 3.0F;
   private static final float f_5042 = 3.0F;
   private static final float f_5043 = -90.0F;
   private static final float f_5044 = 90.0F;
   private static final float f_5045 = 0.1F;
   private static final float f_5046 = -1.0F;
   private static final float f_5047 = 0.68F;
   private static final float f_5048 = (float) (Math.PI / 180.0);
   private static final float f_5049 = (float) (Math.PI / 180.0);

   @Override
   public Vector2f m_1006(Vector2f var1, Vector2f var2) {
      Aura var3 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
      LivingEntity var4 = var3.m_1114();
      if (var1 != null && var2 != null && var4 != null && f_11537.player != null) {
         this.m_2024();

         return switch (this.f_4925) {
            case IDLE -> this.m_2020(var1);
            case SNAP -> this.m_2015(var1, var2, var4);
            case RETURN_CAMERA -> this.m_2034(var1);
            case HOLD_LAST -> this.m_2046(var1);
            case HOLD_CAMERA -> this.m_2043();
         };
      } else {
         return var1 != null ? var1 : var2;
      }
   }

   private void m_2014(Vector2f var1) {
      this.f_4954 = true;
      this.f_4959 = this.m_2044(var1);
      this.f_4955 = 0;
      this.f_4956 = 6 + this.f_4924.nextInt(5);
      this.f_4957 = this.m_2048(f_5018, f_5019);
      this.f_4958 = this.m_2048(f_5020, f_5021);
      this.f_4960 = this.m_2038();
   }

   private Vector2f m_2015(Vector2f var1, Vector2f var2, Entity var3) {
      if (!this.f_4936) {
         this.m_2028(var1, var2);
      }

      if (this.f_4927 == 0) {
         this.f_4937 = this.f_4938;
      } else {
         this.f_4937 = Math.min(this.f_4937 + 1, this.f_4938);
      }

      float var4 = Mth.clamp((float)this.f_4937 / this.f_4938, 0.0F, 1.0F);
      Vector2f var5 = this.m_2047(this.m_2029(this.f_4939, var2), var4);
      this.m_2025(var5, var3);
      Vector2f var6 = new Vector2f(var5.x + this.f_4928, var5.y);
      Vector2f var7 = new Vector2f(var6.x + this.f_4941, Mth.clamp(var6.y + this.f_4942, f_4972, f_4973));
      float var8 = this.m_2023(0.0F, this.f_4951, this.f_4952, 1.0F, var4);
      float var9 = Mth.clamp(var8 - this.f_4950 * (float)Math.sin(f_4974 * var8), 0.0F, 1.0F);
      Vector2f var10 = new Vector2f(this.m_2035(var8, this.f_4939.x, var7.x, var6.x), this.m_2035(var9, this.f_4939.y, var7.y, var6.y));
      float var11 = (float)Math.sin(f_4975 * var4);
      float var12 = (float)Math.sin(this.f_4948 + var4 * this.f_4949);
      var10.add(this.f_4944 * var11 + this.f_4946 * var12 * var11, this.f_4945 * var11 + this.f_4947 * var12 * var11);
      var10 = this.m_2042(new Vector2f(var10.x, Mth.clamp(var10.y, f_4976, f_4977)));
      return this.m_2036(var10);
   }

   public boolean m_2016() {
      if (!this.f_4923) {
         return false;
      }

      if (this.f_4925 == Class_9rb49jlyiwFNOlTd.mn4h0QrxdczI0Wn4.HOLD_LAST) {
         this.f_4925 = Class_9rb49jlyiwFNOlTd.mn4h0QrxdczI0Wn4.RETURN_CAMERA;
         this.f_4954 = false;
      }

      return this.f_4925 == Class_9rb49jlyiwFNOlTd.mn4h0QrxdczI0Wn4.RETURN_CAMERA
         ? true
         : this.f_4925 == Class_9rb49jlyiwFNOlTd.mn4h0QrxdczI0Wn4.HOLD_CAMERA && !this.m_2019();
   }

   public void m_2017(Entity var1, int var2) {
      if (var1 == null) {
         this.m_1801();
      } else {
         if (this.f_4926 != var1.getId()) {
            this.m_2045(var1);
         }

         if (this.f_4923) {
            if (var2 < 0 || var2 > 3) {
               return;
            }

            if (this.f_4925 == Class_9rb49jlyiwFNOlTd.mn4h0QrxdczI0Wn4.RETURN_CAMERA) {
               return;
            }

            this.f_4923 = false;
         }

         this.f_4927 = var2;
         if (this.f_4925 == Class_9rb49jlyiwFNOlTd.mn4h0QrxdczI0Wn4.SNAP) {
            if (var2 < 0) {
               this.m_2030();
            }
         } else {
            if (var2 >= 0 && var2 <= 3) {
               this.f_4925 = Class_9rb49jlyiwFNOlTd.mn4h0QrxdczI0Wn4.SNAP;
               this.f_4936 = false;
               this.f_4937 = 0;
               this.f_4938 = Math.max(2, var2 + 1);
            }
         }
      }
   }

   private void m_2018() {
      this.f_4936 = false;
      this.f_4937 = 0;
      this.f_4938 = 1;
      this.f_4939 = null;
      this.f_4940 = null;
      this.f_4941 = 0.0F;
      this.f_4942 = 0.0F;
      this.f_4943 = f_5047;
      this.f_4944 = 0.0F;
      this.f_4945 = 0.0F;
      this.f_4946 = 0.0F;
      this.f_4947 = 0.0F;
      this.f_4948 = 0.0F;
      this.f_4949 = 0.0F;
      this.f_4950 = 0.0F;
      this.f_4951 = 0.0F;
      this.f_4952 = 1.0F;
      this.f_4953 = Class_9rb49jlyiwFNOlTd.eSaeBRGVpAqYNihi.CUBIC_BEZIER;
   }

   private boolean m_2019() {
      if (this.f_4961 == null) {
         return true;
      }

      Vector2f var1 = this.m_2031();
      return Math.abs(Mth.wrapDegrees(this.f_4961.x - var1.x)) <= f_4970 && Math.abs(this.f_4961.y - var1.y) <= f_4971;
   }

   private Vector2f m_2020(Vector2f var1) {
      Vector2f var2 = this.m_2031();
      float var3 = this.m_2022(var1.x, var2.x);
      Vector2f var4 = this.m_2042(new Vector2f(var3 + this.f_4928, Mth.clamp(var2.y, f_4968, f_4969)));
      return this.m_2036(var4);
   }

   private float m_2021(float var1) {
      if (Math.abs(var1) > f_5045) {
         return Math.signum(var1);
      } else {
         return this.f_4924.nextBoolean() ? 1.0F : f_5046;
      }
   }

   private float m_2022(float var1, float var2) {
      return var1 + Mth.wrapDegrees(var2 - var1);
   }

   private float m_2023(float var1, float var2, float var3, float var4, float var5) {
      float var6 = 1.0F - var5;
      return var6 * var6 * var6 * var1 + f_5041 * var6 * var6 * var5 * var2 + f_5042 * var6 * var5 * var5 * var3 + var5 * var5 * var5 * var4;
   }

   private void m_2024() {
      if (!this.f_4933) {
         this.f_4933 = true;
         this.f_4928 = this.f_4924.nextBoolean() ? f_5022 : f_5023;
         this.f_4929 = this.f_4928;
         this.f_4930 = this.f_4928 == f_5024 ? f_5025 : f_5026;
         this.f_4931 = 0;
         this.f_4932 = this.m_2027();
         this.f_4935 = this.m_2038();
      }

      LivingEntity var1 = DimasikClient.m_9057().m_9049().m_2801().m_3576().m_1114();
      this.f_4931 = Math.min(this.f_4931 + 1, this.f_4932);
      float var2 = Mth.clamp((float)this.f_4931 / this.f_4932, 0.0F, 1.0F);
      float var3 = this.m_2040(this.f_4935, var2);
      this.f_4928 = Mth.lerp(var3, this.f_4929, this.f_4930) * Math.clamp(f_5027 / var1.distanceTo(f_11537.player), 0.0F, 1.0F);
      if (this.f_4931 >= this.f_4932) {
         this.f_4929 = this.f_4930;
         this.f_4930 = this.f_4930 <= 0.0F ? f_5028 : f_5029;
         this.f_4931 = 0;
         this.f_4932 = this.m_2027();
         this.f_4935 = this.m_2038();
      }
   }

   private void m_2025(Vector2f var1, Entity var2) {
      Vector2f var3 = new Vector2f(var1.x + this.f_4928, var1.y);
      boolean var4 = this.m_2032(var1, var2);
      boolean var5 = this.m_2032(var3, var2);
      if (var5) {
         this.f_4934 = false;
      } else if (var4 && !this.f_4934) {
         this.f_4934 = true;
         if (!(Math.abs(this.f_4928) < f_4978)) {
            this.f_4929 = this.f_4928;
            this.f_4930 = -this.f_4928;
            this.f_4931 = 0;
            this.f_4932 = Math.max(2, Math.max(1, this.f_4927) * 2);
            this.f_4935 = this.m_2038();
         }
      }
   }

   private Vec3 m_2026(Vector2f var1) {
      float var2 = var1.x * f_5048;
      float var3 = var1.y * f_5049;
      float var4 = Mth.cos(var3);
      return new Vec3(-Mth.sin(var2) * var4, -Mth.sin(var3), Mth.cos(var2) * var4);
   }

   private int m_2027() {
      return 5 + this.f_4924.nextInt(6);
   }

   private void m_2028(Vector2f var1, Vector2f var2) {
      this.f_4936 = true;
      this.f_4953 = this.m_2038();
      this.f_4939 = this.m_2044(var1);
      this.f_4940 = this.m_2029(this.f_4939, var2);
      float var3 = this.f_4940.x - this.f_4939.x;
      float var4 = this.f_4940.y - this.f_4939.y;
      float var5 = this.m_2021(var3);
      float var6 = this.m_2021(var4);
      float var7 = this.f_4924.nextFloat() < f_4982 ? -var5 : var5;
      float var8 = this.f_4924.nextFloat() < f_4983 ? -var6 : var6;
      this.f_4941 = var7 * this.m_2048(f_4984, Math.min(f_4985, 1.0F + Math.abs(var3) * f_4986));
      this.f_4942 = var8 * this.m_2048(f_4987, Math.min(f_4988, f_4989 + Math.abs(var4) * f_4990));
      this.f_4943 = this.m_2048(f_4991, f_4992);
      this.f_4944 = -var5 * this.m_2048(f_4993, Math.min(f_4994, f_4995 + Math.abs(var3) * f_4996));
      this.f_4945 = (this.f_4924.nextBoolean() ? 1.0F : f_4997) * this.m_2048(f_4998, Math.min(f_4999, f_5000 + Math.abs(var4) * f_5001));
      this.f_4946 = this.m_2048(f_5002, f_5003) * this.m_2021(this.m_2048(f_5004, 1.0F));
      this.f_4947 = this.m_2048(f_5005, f_5006) * this.m_2021(this.m_2048(f_5007, 1.0F));
      this.f_4948 = this.m_2048(0.0F, f_5008);
      this.f_4949 = this.m_2048(f_5009, f_5010);
      this.f_4950 = this.m_2048(f_5011, f_5012);
      this.f_4951 = this.m_2048(f_5013, f_5014);
      this.f_4952 = this.m_2048(f_5015, f_5016);
      this.f_4962 = null;
   }

   private Vector2f m_2029(Vector2f var1, Vector2f var2) {
      return new Vector2f(this.m_2022(var1.x, var2.x), Mth.clamp(var2.y, f_5043, f_5044));
   }

   private void m_2030() {
      this.f_4925 = Class_9rb49jlyiwFNOlTd.mn4h0QrxdczI0Wn4.IDLE;
      this.m_2018();
   }

   private Vector2f m_2031() {
      return new Vector2f(DimasikClient.m_9057().m_9052().m_6342().m_2663());
   }

   private boolean m_2032(Vector2f var1, Entity var2) {
      Vec3 var3 = f_11537.player.getEyePosition();
      double var4 = Math.max(f_4979, var3.distanceTo(var2.getBoundingBox().getCenter()) + f_4980);
      Vec3 var6 = var3.add(this.m_2026(var1).scale(var4));
      return var2.getBoundingBox().inflate(f_4981).clip(var3, var6).isPresent();
   }

   public void m_2033() {
      Vector2f var1 = this.f_4961 != null ? this.f_4961 : this.f_4940;
      this.f_4962 = this.m_2044(var1);
      this.f_4963 = this.f_4928;
      this.f_4936 = false;
      this.f_4927 = -1;
      this.f_4923 = true;
      if (this.f_4924.nextFloat(0.0F, 1.0F) > f_4966) {
         this.f_4925 = Class_9rb49jlyiwFNOlTd.mn4h0QrxdczI0Wn4.RETURN_CAMERA;
         this.f_4954 = false;
      } else {
         this.f_4925 = Class_9rb49jlyiwFNOlTd.mn4h0QrxdczI0Wn4.HOLD_LAST;
      }
   }

   private Vector2f m_2034(Vector2f var1) {
      if (!this.f_4954) {
         this.m_2014(var1);
      }

      Vector2f var2 = this.m_2031();
      float var3 = this.m_2022(this.f_4959.x, var2.x + this.f_4928);
      this.f_4955 = Math.min(this.f_4955 + 1, this.f_4956);
      float var4 = Mth.clamp((float)this.f_4955 / this.f_4956, 0.0F, 1.0F);
      float var5 = this.f_4960 == Class_9rb49jlyiwFNOlTd.eSaeBRGVpAqYNihi.CUBIC_BEZIER
         ? this.m_2023(0.0F, this.f_4957, this.f_4958, 1.0F, var4)
         : this.m_2040(this.f_4960, var4);
      Vector2f var6 = this.m_2042(new Vector2f(Mth.lerp(var5, this.f_4959.x, var3), Mth.lerp(var5, this.f_4959.y, var2.y)));
      this.m_2036(var6);
      if (this.f_4955 >= this.f_4956) {
         this.f_4925 = Class_9rb49jlyiwFNOlTd.mn4h0QrxdczI0Wn4.HOLD_CAMERA;
         this.f_4954 = false;
      }

      return var6;
   }

   private float m_2035(float var1, float var2, float var3, float var4) {
      if (var1 < this.f_4943) {
         float var6 = Mth.clamp(var1 / this.f_4943, 0.0F, 1.0F);
         return Mth.lerp(this.m_2040(this.f_4953, var6), var2, var3);
      } else {
         float var5 = Mth.clamp((var1 - this.f_4943) / (1.0F - this.f_4943), 0.0F, 1.0F);
         return Mth.lerp(this.m_2040(this.f_4953, var5), var3, var4);
      }
   }

   public Class_9rb49jlyiwFNOlTd(Vec3 var1) {
      super(var1);
      this.f_4926 = f_4964;
      this.f_4927 = -1;
      this.f_4935 = Class_9rb49jlyiwFNOlTd.eSaeBRGVpAqYNihi.CUBIC_BEZIER;
      this.f_4938 = 1;
      this.f_4943 = f_4965;
      this.f_4953 = Class_9rb49jlyiwFNOlTd.eSaeBRGVpAqYNihi.CUBIC_BEZIER;
      this.f_4956 = 1;
      this.f_4960 = Class_9rb49jlyiwFNOlTd.eSaeBRGVpAqYNihi.CUBIC_BEZIER;
   }

   private Vector2f m_2036(Vector2f var1) {
      this.f_4961 = this.m_2044(var1);
      return var1;
   }

   private void m_2037() {
      this.f_4954 = false;
      this.f_4955 = 0;
      this.f_4956 = 1;
      this.f_4957 = 0.0F;
      this.f_4958 = 1.0F;
      this.f_4959 = null;
      this.f_4960 = Class_9rb49jlyiwFNOlTd.eSaeBRGVpAqYNihi.CUBIC_BEZIER;
   }

   @Override
   public void m_1801() {
      this.f_4925 = Class_9rb49jlyiwFNOlTd.mn4h0QrxdczI0Wn4.IDLE;
      this.f_4926 = f_4967;
      this.f_4927 = -1;
      this.f_4961 = null;
      this.f_4962 = null;
      this.f_4963 = 0.0F;
      this.f_4923 = false;
      this.m_2018();
      this.m_2037();
      this.m_2041();
   }

   private Class_9rb49jlyiwFNOlTd.eSaeBRGVpAqYNihi m_2038() {
      Class_9rb49jlyiwFNOlTd.eSaeBRGVpAqYNihi[] var1 = Class_9rb49jlyiwFNOlTd.eSaeBRGVpAqYNihi.values();
      return var1[this.f_4924.nextInt(var1.length)];
   }

   public void m_2039() {
      this.f_4961 = null;
      this.f_4962 = null;
      this.f_4963 = this.f_4928;
      this.f_4936 = false;
      this.f_4954 = false;
   }

   private float m_2040(Class_9rb49jlyiwFNOlTd.eSaeBRGVpAqYNihi var1, float var2) {
      float var3 = Mth.clamp(var2, 0.0F, 1.0F);

      return switch (var1) {
         case CUBIC_BEZIER -> this.m_2023(0.0F, 0.0F, 1.0F, 1.0F, var3);
         case SINE_IN_OUT -> (float)(-(Math.cos(f_5030 * var3) - 1.0) * f_5031);
         case QUADRATIC_IN_OUT -> var3 < f_5032 ? 2.0F * var3 * var3 : 1.0F - (float)Math.pow(f_5033 * var3 + 2.0F, f_5034) * f_5035;
         case QUARTIC_IN_OUT -> var3 < f_5036 ? f_5037 * var3 * var3 * var3 * var3 : 1.0F - (float)Math.pow(f_5038 * var3 + 2.0F, f_5039) * f_5040;
      };
   }

   private void m_2041() {
      this.f_4933 = false;
      this.f_4934 = false;
      this.f_4928 = 0.0F;
      this.f_4929 = 0.0F;
      this.f_4930 = 0.0F;
      this.f_4931 = 0;
      this.f_4932 = 1;
      this.f_4935 = Class_9rb49jlyiwFNOlTd.eSaeBRGVpAqYNihi.CUBIC_BEZIER;
   }

   private Vector2f m_2042(Vector2f var1) {
      return new Vector2f(Class_uHPXr81r5AZlFeJr.m_9133(var1.x), Class_uHPXr81r5AZlFeJr.m_9133(var1.y));
   }

   private Vector2f m_2043() {
      Vector2f var1 = this.m_2031();
      Vector2f var2 = this.m_2042(new Vector2f(var1.x + this.f_4928, var1.y));
      return this.m_2036(var2);
   }

   private Vector2f m_2044(Vector2f var1) {
      return var1 == null ? null : new Vector2f(var1.x, var1.y);
   }

   private void m_2045(Entity var1) {
      this.f_4926 = var1.getId();
      this.f_4925 = Class_9rb49jlyiwFNOlTd.mn4h0QrxdczI0Wn4.IDLE;
      this.f_4927 = -1;
      this.f_4961 = null;
      this.f_4962 = null;
      this.f_4963 = 0.0F;
      this.f_4923 = false;
      this.m_2018();
      this.m_2037();
      this.m_2041();
   }

   private Vector2f m_2046(Vector2f var1) {
      if (this.f_4962 == null) {
         this.f_4962 = this.m_2044(this.f_4961 != null ? this.f_4961 : var1);
         this.f_4963 = this.f_4928;
      }

      Vector2f var2 = this.m_2042(new Vector2f(this.f_4962.x + (this.f_4928 - this.f_4963), this.f_4962.y));
      return this.m_2036(var2);
   }

   private Vector2f m_2047(Vector2f var1, float var2) {
      if (this.f_4940 != null && !(var2 >= 1.0F)) {
         float var3 = Mth.lerp(this.m_2040(this.f_4953, var2), f_5017, 1.0F);
         this.f_4940 = new Vector2f(Mth.lerp(var3, this.f_4940.x, var1.x), Mth.lerp(var3, this.f_4940.y, var1.y));
         return this.f_4940;
      } else {
         this.f_4940 = var1;
         return var1;
      }
   }

   private float m_2048(float var1, float var2) {
      return var1 + this.f_4924.nextFloat() * (var2 - var1);
   }

   private enum eSaeBRGVpAqYNihi {
      CUBIC_BEZIER,
      SINE_IN_OUT,
      QUADRATIC_IN_OUT,
      QUARTIC_IN_OUT;
   }

   private enum mn4h0QrxdczI0Wn4 {
      IDLE,
      SNAP,
      RETURN_CAMERA,
      HOLD_LAST,
      HOLD_CAMERA;
   }
}
