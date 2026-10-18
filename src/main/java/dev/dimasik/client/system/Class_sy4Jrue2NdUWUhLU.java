package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;
import org.joml.Vector4f;

public final class Class_sy4Jrue2NdUWUhLU {
   private final int f_31452;
   private final float f_31453;
   private final float f_31454;
   private final float f_31455;
   private final float f_31456;
   private final float f_31457;
   private final float f_31458;
   private final float f_31459;
   private final float f_31460;
   private static final float f_31461 = -1.0F;
   private static final float f_31462 = 255.0F;
   private static final float f_31463 = 255.0F;
   private static final float f_31464 = 255.0F;
   private static final float f_31465 = 255.0F;
   private static final float f_31466 = -1.0F;
   private static final float f_31467 = 255.0F;
   private static final float f_31468 = 255.0F;
   private static final float f_31469 = 255.0F;
   private static final float f_31470 = 255.0F;
   private static final float f_31471 = -1.0F;
   private static final float f_31472 = 255.0F;
   private static final float f_31473 = 3.0F;

   public Class_sy4Jrue2NdUWUhLU(Class_PBaph5kIoGi7c8fq.OrsQZAoSQ9GBVogD var1, float var2, float var3) {
      this.f_31452 = var1.m_4096();
      this.f_31457 = var1.m_4097();
      Class_PBaph5kIoGi7c8fq.LZucy3ro1EQvVMkW var4 = var1.m_4099();
      if (var4 != null) {
         this.f_31453 = var4.m_4095() / var2;
         this.f_31454 = var4.m_4094() / var2;
         this.f_31455 = 1.0F - var4.m_4093() / var3;
         this.f_31456 = 1.0F - var4.m_4092() / var3;
      } else {
         this.f_31453 = this.f_31454 = this.f_31455 = this.f_31456 = 0.0F;
      }

      Class_PBaph5kIoGi7c8fq.LZucy3ro1EQvVMkW var5 = var1.m_4098();
      if (var5 != null) {
         this.f_31459 = var5.m_4094() - var5.m_4095();
         this.f_31460 = var5.m_4093() - var5.m_4092();
         this.f_31458 = var5.m_4093();
      } else {
         this.f_31459 = this.f_31460 = this.f_31458 = 0.0F;
      }
   }

   public float m_8769() {
      return this.f_31460;
   }

   public float m_8770(VertexConsumer var1, float var2, float var3, float var4, int var5) {
      var4 -= this.f_31458 * var2;
      float var6 = this.f_31459 * var2;
      float var7 = this.f_31460 * var2;
      float var8 = 2.0F / Minecraft.getInstance().getWindow().getScreenWidth() * var6;
      float var9 = 2.0F / Minecraft.getInstance().getWindow().getScreenHeight() * var7;
      float var10 = f_31461 + var3 * 2.0F / Minecraft.getInstance().getWindow().getScreenWidth();
      float var11 = 1.0F - var4 * 2.0F / Minecraft.getInstance().getWindow().getScreenHeight() - var9;
      Vector4f var12 = Class_BftdentXEtGbugJw.m_2298(var5);
      var1.addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var10, var11, 0.0F)
         .setUv(this.f_31453, this.f_31456)
         .setColor(var12.x, var12.y, var12.z, var12.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / f_31462));
      var1.addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var10 + var8, var11, 0.0F)
         .setUv(this.f_31454, this.f_31456)
         .setColor(var12.x, var12.y, var12.z, var12.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / f_31463));
      var1.addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var10 + var8, var11 + var9, 0.0F)
         .setUv(this.f_31454, this.f_31455)
         .setColor(var12.x, var12.y, var12.z, var12.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / f_31464));
      var1.addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var10, var11 + var9, 0.0F)
         .setUv(this.f_31453, this.f_31455)
         .setColor(var12.x, var12.y, var12.z, var12.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / f_31465));
      return this.f_31457 * var2;
   }

   public float m_8771(float var1) {
      return this.f_31459 * var1;
   }

   public int m_8772() {
      return this.f_31452;
   }

   public float m_8773(VertexConsumer var1, float var2, float var3, int var4, float var5, float var6, int var7, float var8, float var9) {
      var6 -= this.f_31458 * var2;
      float var10 = this.f_31459 * var2;
      float var11 = this.f_31460 * var2;
      float var12 = this.f_31457 * var2;
      if (var5 >= var9) {
         return var12;
      }

      float var13 = 2.0F / Minecraft.getInstance().getWindow().getScreenWidth() * var10;
      float var14 = 2.0F / Minecraft.getInstance().getWindow().getScreenHeight() * var11;
      float var15 = f_31471 + var5 * 2.0F / Minecraft.getInstance().getWindow().getScreenWidth();
      float var16 = 1.0F - var6 * 2.0F / Minecraft.getInstance().getWindow().getScreenHeight() - var14;
      Vector4f var17 = Class_BftdentXEtGbugJw.m_2298(var7);
      float var18 = Class_Ssh31B3ljfKeWsvS.m_4821() / f_31472;
      float var19 = this.m_8778(var5, var8, var9);
      float var20 = this.m_8778(var5 + var10, var8, var9);
      var1.addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var15, var16, 0.0F)
         .setUv(this.f_31453, this.f_31456)
         .setColor(var17.x, var17.y, var17.z, var17.w * var18 * var19)
         .setUv1(Math.round(var3), var4)
         .setUv2(0, 0);
      var1.addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var15 + var13, var16, 0.0F)
         .setUv(this.f_31454, this.f_31456)
         .setColor(var17.x, var17.y, var17.z, var17.w * var18 * var20)
         .setUv1(Math.round(var3), var4)
         .setUv2(0, 0);
      var1.addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var15 + var13, var16 + var14, 0.0F)
         .setUv(this.f_31454, this.f_31455)
         .setColor(var17.x, var17.y, var17.z, var17.w * var18 * var20)
         .setUv1(Math.round(var3), var4)
         .setUv2(0, 0);
      var1.addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var15, var16 + var14, 0.0F)
         .setUv(this.f_31453, this.f_31455)
         .setColor(var17.x, var17.y, var17.z, var17.w * var18 * var19)
         .setUv1(Math.round(var3), var4)
         .setUv2(0, 0);
      return var12;
   }

   public float m_8774(VertexConsumer var1, float var2, float var3, int var4, float var5, float var6, int var7) {
      var6 -= this.f_31458 * var2;
      float var8 = this.f_31459 * var2;
      float var9 = this.f_31460 * var2;
      float var10 = 2.0F / Minecraft.getInstance().getWindow().getScreenWidth() * var8;
      float var11 = 2.0F / Minecraft.getInstance().getWindow().getScreenHeight() * var9;
      float var12 = f_31466 + var5 * 2.0F / Minecraft.getInstance().getWindow().getScreenWidth();
      float var13 = 1.0F - var6 * 2.0F / Minecraft.getInstance().getWindow().getScreenHeight() - var11;
      Vector4f var14 = Class_BftdentXEtGbugJw.m_2298(var7);
      var1.addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var12, var13, 0.0F)
         .setUv(this.f_31453, this.f_31456)
         .setColor(var14.x, var14.y, var14.z, var14.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / f_31467))
         .setUv1(Math.round(var3), var4)
         .setUv2(0, 0);
      var1.addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var12 + var10, var13, 0.0F)
         .setUv(this.f_31454, this.f_31456)
         .setColor(var14.x, var14.y, var14.z, var14.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / f_31468))
         .setUv1(Math.round(var3), var4)
         .setUv2(0, 0);
      var1.addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var12 + var10, var13 + var11, 0.0F)
         .setUv(this.f_31454, this.f_31455)
         .setColor(var14.x, var14.y, var14.z, var14.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / f_31469))
         .setUv1(Math.round(var3), var4)
         .setUv2(0, 0);
      var1.addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var12, var13 + var11, 0.0F)
         .setUv(this.f_31453, this.f_31455)
         .setColor(var14.x, var14.y, var14.z, var14.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / f_31470))
         .setUv1(Math.round(var3), var4)
         .setUv2(0, 0);
      return this.f_31457 * var2;
   }

   public float m_8775(float var1) {
      return this.f_31457 * var1;
   }

   public Vector4f m_8776() {
      return new Vector4f(this.f_31453, this.f_31455, this.f_31454, this.f_31456);
   }

   public float m_8777() {
      return this.f_31458;
   }

   private float m_8778(float var1, float var2, float var3) {
      if (var1 <= var2) {
         return 1.0F;
      }

      if (var1 >= var3) {
         return 0.0F;
      }

      float var4 = (var3 - var1) / (var3 - var2);
      return var4 * var4 * (f_31473 - 2.0F * var4);
   }
}
