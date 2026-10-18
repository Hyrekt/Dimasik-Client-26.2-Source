package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.util.LightCoordsUtil;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class Class_uGNFApwy8sUjPdk5 {
   private int f_32743 = 0;
   private Consumer<Class_uGNFApwy8sUjPdk5> f_32744 = null;
   public String f_32745;
   public String f_32746;
   public boolean f_32747 = false;
   private boolean f_32748 = true;
   private final String f_32749;
   private double f_32750 = 0.0;
   private double f_32751 = 0.0;
   private double f_32752 = 0.0;
   public double f_32753;
   public double f_32754;
   public double f_32755;
   public double f_32756;
   public double f_32757;
   public double f_32758;
   private double f_32759;
   private double f_32760;
   public double f_32761;
   public double f_32762;
   public double f_32763;
   public double f_32764;
   public double f_32765;
   public double f_32766;
   public double f_32767;
   private boolean f_32768;
   public InteractionHand f_32769;
   private double f_32770;
   private Identifier f_32771;
   private List<Identifier> f_32772;
   public PoseStack f_32773;
   public Iterator<Identifier> f_32774;
   private static final double f_32775 = 255.0;
   private static final float f_32776 = 30.0F;
   private static final float f_32777 = 0.1F;
   private static final double f_32778 = 9999.0;
   private static final float f_32779 = 0.1F;
   private static final double f_32780 = 0.9;
   private static final double f_32781 = 0.01;
   private static final String f_32782 = "SCALE";
   private static final double f_32783 = 0.03;
   private static final double f_32784 = 0.07;
   private static final String f_32785 = "OPACITY";
   private static final float f_32786 = 10.0F;
   private static final double f_32787 = 255.0;
   private static final String f_32788 = "SPAWN";
   private static final String f_32789 = "KEYFRAME";
   private static final String f_32790 = "ADDITIVE";
   private static final String f_32791 = "CUTOUT_L";
   private static final double f_32792 = 0.25;

   public Class_uGNFApwy8sUjPdk5(
      boolean var1,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      double var16,
      double var18,
      double var20,
      double var22,
      double var24,
      double var26,
      Identifier var28,
      String var29,
      InteractionHand var30,
      String var31,
      String var32,
      double var33,
      double var35,
      Consumer<Class_uGNFApwy8sUjPdk5> var37,
      PoseStack var38
   ) {
      this(
         var1,
         var2,
         var4,
         var6,
         var8,
         var10,
         var12,
         var14,
         var16,
         var18,
         var20,
         var22,
         var24,
         var26,
         var28,
         new ArrayList<>(),
         var29,
         var30,
         var31,
         var32,
         var33,
         var35,
         var37,
         var38
      );
   }

   private Class_uGNFApwy8sUjPdk5(
      boolean var1,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      double var16,
      double var18,
      double var20,
      double var22,
      double var24,
      double var26,
      Identifier var28,
      List<Identifier> var29,
      String var30,
      InteractionHand var31,
      String var32,
      String var33,
      double var34,
      double var36,
      Consumer<Class_uGNFApwy8sUjPdk5> var38,
      PoseStack var39
   ) {
      this.f_32759 = f_32775;
      this.f_32760 = 0.0;
      this.f_32761 = 1.0;
      this.f_32770 = 0.0;
      this.f_32772 = new ArrayList<>();
      this.f_32773 = null;
      this.f_32752 = var34;
      this.f_32768 = var1;
      this.f_32745 = var32;
      this.f_32749 = var33;
      this.f_32746 = var30;
      this.f_32769 = var31;
      this.f_32744 = var38;
      this.f_32753 = var2;
      this.f_32754 = var4;
      this.f_32755 = var6;
      this.f_32759 = var36;
      this.f_32756 = var8;
      this.f_32757 = var10;
      this.f_32758 = var12;
      this.f_32762 = var14;
      this.f_32763 = var16;
      this.f_32764 = var18;
      this.f_32765 = var20;
      this.f_32766 = var22;
      this.f_32767 = var24;
      this.f_32761 = var26;
      this.f_32771 = var28;
      this.f_32772 = var29;
      this.f_32774 = var29.iterator();
      this.f_32773 = var39;
   }

   public Class_uGNFApwy8sUjPdk5(
      boolean var1,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      double var16,
      double var18,
      double var20,
      double var22,
      double var24,
      double var26,
      Identifier var28,
      String var29,
      InteractionHand var30,
      String var31,
      String var32,
      double var33,
      double var35
   ) {
      this(
         var1,
         var2,
         var4,
         var6,
         var8,
         var10,
         var12,
         var14,
         var16,
         var18,
         var20,
         var22,
         var24,
         var26,
         var28,
         new ArrayList<>(),
         var29,
         var30,
         var31,
         var32,
         var33,
         var35,
         null,
         null
      );
   }

   public Class_uGNFApwy8sUjPdk5(
      boolean var1,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      double var16,
      double var18,
      double var20,
      double var22,
      double var24,
      double var26,
      Identifier var28,
      String var29,
      InteractionHand var30,
      String var31,
      String var32,
      double var33,
      double var35,
      Consumer<Class_uGNFApwy8sUjPdk5> var37
   ) {
      this(
         var1,
         var2,
         var4,
         var6,
         var8,
         var10,
         var12,
         var14,
         var16,
         var18,
         var20,
         var22,
         var24,
         var26,
         var28,
         new ArrayList<>(),
         var29,
         var30,
         var31,
         var32,
         var33,
         var35,
         var37,
         null
      );
   }

   public Class_uGNFApwy8sUjPdk5(
      boolean var1,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      double var16,
      double var18,
      double var20,
      double var22,
      double var24,
      double var26,
      Identifier var28,
      List<Identifier> var29,
      String var30,
      InteractionHand var31,
      String var32,
      String var33,
      double var34,
      double var36,
      Consumer<Class_uGNFApwy8sUjPdk5> var38
   ) {
      this(
         var1,
         var2,
         var4,
         var6,
         var8,
         var10,
         var12,
         var14,
         var16,
         var18,
         var20,
         var22,
         var24,
         var26,
         var28,
         var29,
         var30,
         var31,
         var32,
         var33,
         var34,
         var36,
         var38,
         null
      );
   }

   public void m_9126(PoseStack var1, SubmitNodeCollector var2, int var3, AbstractClientPlayer var4, float var5) {
      if (!this.f_32747) {
         var1.pushPose();
         var1.translate(this.f_32753, this.f_32754, this.f_32755);
         var1.scale((float)this.f_32760, (float)this.f_32760, (float)this.f_32760);
         RenderType var6 = f_32790.equals(this.f_32749) ? Class_vjMJvlCrimAzIZqt.m_9269(this.f_32771) : RenderTypes.breezeWind(this.f_32771, 0.0F, 0.0F);
         Matrix4f var7 = var1.last().pose();
         Vector3f var8 = new Vector3f();
         Vector3f var9 = new Vector3f();
         Quaternionf var10 = new Quaternionf();
         var7.getTranslation(var8);
         var7.getUnnormalizedRotation(var10);
         var7.getScale(var9);
         var7.identity().translate(var8).scale(var9).rotate(Minecraft.getInstance().gameRenderer.mainCamera().rotation());
         var7.rotate(new Quaternionf().rotateX((float)Math.toRadians(this.f_32762)));
         var7.rotate(new Quaternionf().rotateY((float)Math.toRadians(this.f_32763)));
         var7.rotate(new Quaternionf().rotateZ((float)Math.toRadians(this.f_32764)));
         Matrix3f var11 = var1.last().normal();
         if (Objects.equals(this.f_32749, f_32791)) {
            var3 = LightCoordsUtil.pack(15, 15);
         }

         double var12 = f_32792;
         Vector3f var14 = new Vector3f(0.0F, 0.0F, 1.0F);
         var14.mul(var11);
         int var15 = var3;
         var2.submitCustomGeometry(
            var1,
            var6,
            (var5x, var6x) -> {
               int var7x = Math.clamp((int)this.f_32759, 0, 255);
               var6x.addVertex(var5x, (float)var12, (float)var12, 0.0F)
                  .setColor(255, 255, 255, var7x)
                  .setUv(1.0F, 0.0F)
                  .setOverlay(OverlayTexture.NO_OVERLAY)
                  .setLight(var15)
                  .setNormal(var14.x, var14.y, var14.z);
               var6x.addVertex(var5x, (float)(-var12), (float)var12, 0.0F)
                  .setColor(255, 255, 255, var7x)
                  .setUv(0.0F, 0.0F)
                  .setOverlay(OverlayTexture.NO_OVERLAY)
                  .setLight(var15)
                  .setNormal(var14.x, var14.y, var14.z);
               var6x.addVertex(var5x, (float)(-var12), (float)(-var12), 0.0F)
                  .setColor(255, 255, 255, var7x)
                  .setUv(0.0F, 1.0F)
                  .setOverlay(OverlayTexture.NO_OVERLAY)
                  .setLight(var15)
                  .setNormal(var14.x, var14.y, var14.z);
               var6x.addVertex(var5x, (float)var12, (float)(-var12), 0.0F)
                  .setColor(255, 255, 255, var7x)
                  .setUv(1.0F, 1.0F)
                  .setOverlay(OverlayTexture.NO_OVERLAY)
                  .setLight(var15)
                  .setNormal(var14.x, var14.y, var14.z);
            }
         );
         var1.popPose();
      }
   }

   public void m_9127() {
      if (!this.f_32747) {
         float var1 = Class_tjdtKxsAEogQMtun.f_32100 * f_32776;
         this.f_32752 = this.f_32752 - f_32777 * var1;
         this.f_32752 = Math.clamp(this.f_32752, 0.0, f_32778);
         this.f_32770 = this.f_32770 + f_32779 * var1;
         this.f_32753 = this.f_32753 + this.f_32756 * var1;
         this.f_32754 = this.f_32754 + this.f_32757 * var1;
         this.f_32755 = this.f_32755 + this.f_32758 * var1;
         double var2 = Math.pow(f_32780, var1);
         this.f_32756 *= var2;
         this.f_32757 *= var2;
         this.f_32758 *= var2;
         LocalPlayer var4 = Minecraft.getInstance().player;
         double var5 = var4.getYRot();
         double var7 = Math.toRadians(var5);
         double var9 = -Math.sin(var7);
         double var11 = Math.cos(var7);
         Vec3 var13 = var4.getDeltaMovement();
         double var14 = var13.x * var9 + var13.z * var11;
         double var16 = var4.getDeltaMovement().normalize().x * var11 - var13.z * var9;
         if (this.f_32768) {
            this.f_32757 = this.f_32757 - f_32781 * var1;
         }

         this.f_32762 = this.f_32762 + this.f_32765 * var1;
         this.f_32763 = this.f_32763 + this.f_32766 * var1;
         this.f_32764 = this.f_32764 + this.f_32767 * var1;
         if (!this.f_32772.isEmpty() && this.f_32774.hasNext() && Minecraft.getInstance().player.tickCount % 4 == 0 && var4.tickCount != this.f_32743) {
            this.f_32771 = this.f_32774.next();
         }

         if (this.f_32745 == f_32782) {
            if (!this.f_32748 && this.f_32752 == 0.0) {
               this.f_32760 = this.f_32760 - f_32783 * var1;
               if (this.f_32760 <= 0.0) {
                  this.f_32747 = true;
               }
            } else {
               this.f_32760 = this.f_32760 + f_32784 * var1;
               if (this.f_32760 >= this.f_32761) {
                  this.f_32760 = this.f_32761;
                  this.f_32748 = false;
               }
            }
         } else if (this.f_32745 == f_32785) {
            if (!this.f_32748 && this.f_32752 == 0.0) {
               this.f_32759 = this.f_32759 - f_32786 * var1;
               if (this.f_32759 <= 0.0) {
                  this.f_32747 = true;
                  this.f_32759 = 0.0;
               }
            } else {
               this.f_32760 = this.f_32761;
               this.f_32748 = false;
               this.f_32759 = f_32787;
            }
         } else if (this.f_32745 == f_32788) {
            if (!this.f_32748 && this.f_32752 == 0.0) {
               this.f_32747 = true;
            } else {
               this.f_32760 = this.f_32761;
               this.f_32748 = false;
            }
         } else if (this.f_32745 == f_32789) {
            if (!this.f_32748 && !this.f_32774.hasNext()) {
               this.f_32747 = true;
            } else {
               this.f_32760 = this.f_32761;
               this.f_32748 = false;
            }
         }

         if (this.f_32744 != null) {
            this.f_32744.accept(this);
         }

         this.f_32743 = var4.tickCount;
      }
   }
}
