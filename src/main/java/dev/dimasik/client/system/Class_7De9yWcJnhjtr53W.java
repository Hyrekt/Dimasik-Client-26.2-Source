package dev.dimasik.client.system;

import com.mojang.blaze3d.IndexType;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.AutoStorageIndexBuffer;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.MeshData;
import com.mojang.blaze3d.vertex.MeshData.DrawState;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Optional;
import java.util.OptionalDouble;
import net.minecraft.client.renderer.texture.AbstractTexture;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;

public final class Class_7De9yWcJnhjtr53W implements Class_NzJrN63M7QBpmAbi {
   private static final float f_3127 = 64.0F;
   private static final float f_3128 = 32.0F;
   private static final float f_3129 = (float) (Math.PI / 180.0);
   private static final Vector3f f_3130 = new Vector3f(Class_7De9yWcJnhjtr53W.f_3189, Class_7De9yWcJnhjtr53W.f_3190, Class_7De9yWcJnhjtr53W.f_3191).normalize();
   private static final Vector3f f_3131 = new Vector3f(Class_7De9yWcJnhjtr53W.f_3192, Class_7De9yWcJnhjtr53W.f_3193, Class_7De9yWcJnhjtr53W.f_3194).normalize();
   private final Deque<Matrix4f> f_3132 = new ArrayDeque<>();
   private final Matrix4f f_3133 = new Matrix4f();
   private final Matrix4f f_3134 = new Matrix4f();
   private final Matrix4f f_3135 = new Matrix4f();
   private final Vector3f f_3136 = new Vector3f();
   private BufferBuilder f_3137;
   private Class_7De9yWcJnhjtr53W.yai0oZhjj58G7pDC f_3138 = Class_7De9yWcJnhjtr53W.yai0oZhjj58G7pDC.SKIN;
   private float f_3139 = 1.0F;
   private float f_3140 = 1.0F;
   private int f_3141;
   private static final String f_3142 = "Sampler0";
   private static final float f_3143 = (float) (Math.PI / 180.0);
   private static final float f_3144 = (float) (Math.PI / 180.0);
   private static final float f_3145 = (float) (Math.PI / 180.0);
   private static final float f_3146 = -1.0F;
   private static final float f_3147 = -1.0F;
   private static final float f_3148 = -1.0F;
   private static final float f_3149 = 64.0F;
   private static final float f_3150 = 64.0F;
   private static final float f_3151 = 32.0F;
   private static final float f_3152 = 32.0F;
   private static final float f_3153 = 64.0F;
   private static final float f_3154 = 64.0F;
   private static final float f_3155 = 32.0F;
   private static final float f_3156 = 32.0F;
   private static final float f_3157 = 64.0F;
   private static final float f_3158 = 64.0F;
   private static final float f_3159 = 32.0F;
   private static final float f_3160 = 32.0F;
   private static final float f_3161 = 64.0F;
   private static final float f_3162 = 64.0F;
   private static final float f_3163 = 32.0F;
   private static final float f_3164 = 32.0F;
   private static final float f_3165 = 64.0F;
   private static final float f_3166 = 64.0F;
   private static final float f_3167 = 32.0F;
   private static final float f_3168 = 32.0F;
   private static final float f_3169 = 64.0F;
   private static final float f_3170 = 64.0F;
   private static final float f_3171 = 32.0F;
   private static final float f_3172 = 32.0F;
   private static final float f_3173 = 255.0F;
   private static final float f_3174 = 255.0F;
   private static final float f_3175 = 255.0F;
   private static final float f_3176 = 255.0F;
   private static final double f_3177 = Math.PI;
   private static final double f_3178 = 2.0;
   private static final double f_3179 = Math.PI;
   private static final double f_3180 = 2.0;
   private static final float f_3181 = 0.5F;
   private static final float f_3182 = 0.5F;
   private static final float f_3183 = 0.55F;
   private static final float f_3184 = 0.35F;
   private static final float f_3185 = 0.1F;
   private static final float f_3186 = 0.1F;
   private static final String f_3187 = "catPet";
   private static final String f_3188 = "catPetVertices";
   private static final float f_3189 = -0.42F;
   private static final float f_3190 = 0.8F;
   private static final float f_3191 = -0.43F;
   private static final float f_3192 = 0.68F;
   private static final float f_3193 = 0.2F;
   private static final float f_3194 = 0.7F;

   public void m_1613(float var1, float var2, float var3) {
      this.f_3134.scale(var1, var2, var3);
   }

   public void m_1614(float var1) {
      this.f_3134.scale(var1);
   }

   private void m_1615(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16,
      float var17,
      float var18,
      float var19,
      float var20,
      float var21
   ) {
      float var22 = Math.min(1.0F, var21);
      float var23 = Math.min(1.0F, var21);
      float var24 = Math.min(1.0F, var21);
      float var25 = this.f_3139;
      this.m_1621(var1, var2, var3, var13, var14, var22, var23, var24, var25);
      this.m_1621(var4, var5, var6, var15, var16, var22, var23, var24, var25);
      this.m_1621(var7, var8, var9, var17, var18, var22, var23, var24, var25);
      this.m_1621(var10, var11, var12, var19, var20, var22, var23, var24, var25);
      this.f_3141 += 4;
   }

   public void m_1616(float var1) {
      this.f_3134.rotateZ(var1 * f_3145);
   }

   public void m_1617(RenderPipeline var1, AbstractTexture var2) {
      if (this.f_3137 != null) {
         MeshData var3 = this.f_3137.build();
         this.f_3137 = null;
         if (var3 != null) {
            if (this.f_3141 == 0) {
               var3.close();
            } else {
               GpuBuffer var4 = null;

               try {
                  DrawState var5 = var3.drawState();
                  int var6 = var5.indexCount();
                  AutoStorageIndexBuffer var7 = RenderSystem.getSequentialBuffer(var5.primitiveTopology());
                  GpuBuffer var8 = var7.getBuffer(var6);
                  IndexType var9 = var7.type();
                  var4 = RenderSystem.getDevice().createBuffer(() -> f_3188, 32, var3.vertexBuffer());
                  RenderTarget var10 = f_11537.gameRenderer.mainRenderTarget();
                  CommandEncoder var11 = RenderSystem.getDevice().createCommandEncoder();
                  RenderPass var12 = var11.createRenderPass(
                     () -> f_3187, var10.getColorTextureView(), Optional.empty(), var10.getDepthTextureView(), OptionalDouble.empty()
                  );

                  try {
                     RenderSystem.bindDefaultUniforms(var12);
                     var12.setPipeline(var1);
                     if (var2 != null) {
                        var12.bindTexture(f_3142, var2.getTextureView(), var2.getSampler());
                     }

                     var12.setVertexBuffer(0, var4.slice());
                     var12.setIndexBuffer(var8, var9);
                     var12.drawIndexed(var6, 1, 0, 0, 0);
                  } catch (Throwable var20) {
                     if (var12 != null) {
                        try {
                           var12.close();
                        } catch (Throwable var19) {
                           var20.addSuppressed(var19);
                        }
                     }

                     throw var20;
                  }

                  if (var12 != null) {
                     var12.close();
                  }
               } finally {
                  if (var4 != null) {
                     var4.close();
                  }

                  var3.close();
               }
            }
         }
      }
   }

   public void m_1618(float var1) {
      this.f_3134.rotateX(var1 * f_3143);
   }

   public void m_1619() {
      this.f_3134.set((Matrix4fc)this.f_3132.pop());
   }

   public void m_1620(float var1, float var2, float var3) {
      this.f_3134.translate(var1, var2, var3);
   }

   private void m_1621(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      this.f_3137.addVertex(this.f_3135, var1, var2, var3).setUv(var4, var5).setColor(var6, var7, var8, var9);
   }

   public void m_1622(RenderPipeline var1) {
      this.m_1617(var1, null);
   }

   public void m_1623(Class_7De9yWcJnhjtr53W.yai0oZhjj58G7pDC var1, Matrix4f var2, float var3, float var4) {
      this.f_3138 = var1;
      this.f_3139 = var3;
      this.f_3140 = var4;
      this.f_3141 = 0;
      this.f_3132.clear();
      this.f_3133.set(var2);
      this.f_3134.identity();
      this.f_3137 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
   }

   public void m_1624(float var1) {
      this.f_3134.rotateY(var1 * f_3144);
   }

   private float m_1625(float var1, float var2, float var3) {
      this.f_3136.set(var1, var2, var3);
      this.f_3134.transformDirection(this.f_3136).normalize();
      float var4 = Math.max(0.0F, this.f_3136.dot(f_3130));
      float var5 = Math.max(0.0F, this.f_3136.dot(f_3131));
      float var6 = f_3181 + f_3182 * this.f_3136.y;
      return (f_3183 + var4 * f_3184 + var5 * f_3185 + var6 * f_3186) * this.f_3140;
   }

   public void m_1627() {
      this.f_3132.push(new Matrix4f(this.f_3134));
   }

   public void m_1629(float var1, float var2, float var3, int var4, int var5) {
      if (this.f_3138 == Class_7De9yWcJnhjtr53W.yai0oZhjj58G7pDC.SHADOW) {
         this.f_3135.set(this.f_3133).mul(this.f_3134);
         float var6 = Class_BftdentXEtGbugJw.m_2309(var4) / f_3173;
         float var7 = Class_BftdentXEtGbugJw.m_2299(var4) / f_3174;
         float var8 = Class_BftdentXEtGbugJw.m_2308(var4) / f_3175;
         float var9 = Class_BftdentXEtGbugJw.m_2297(var4) / f_3176 * this.f_3139;

         for (int var10 = 0; var10 < var5; var10++) {
            double var11 = (double)var10 / var5 * f_3177 * f_3178;
            double var13 = (double)(var10 + 1) / var5 * f_3179 * f_3180;
            float var15 = (float)Math.cos(var11) * var1;
            float var16 = (float)Math.sin(var11) * var2;
            float var17 = (float)Math.cos(var13) * var1;
            float var18 = (float)Math.sin(var13) * var2;
            this.m_1621(0.0F, var3, 0.0F, 0.0F, 0.0F, var6, var7, var8, var9);
            this.m_1621(var15, var3, var16, 1.0F, 0.0F, var6, var7, var8, var9);
            this.m_1621(var17, var3, var18, 1.0F, 0.0F, var6, var7, var8, var9);
            this.m_1621(0.0F, var3, 0.0F, 0.0F, 0.0F, var6, var7, var8, var9);
            this.f_3141 += 4;
         }
      }
   }

   public void m_1630(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8) {
      if (this.f_3138 == Class_7De9yWcJnhjtr53W.yai0oZhjj58G7pDC.SKIN) {
         this.f_3135.set(this.f_3133).mul(this.f_3134);
         float var9 = var1 + var4;
         float var10 = var2 + var5;
         float var11 = var3 + var6;
         float var12 = this.m_1625(0.0F, 0.0F, f_3146);
         float var13 = this.m_1625(0.0F, 0.0F, 1.0F);
         float var14 = this.m_1625(f_3147, 0.0F, 0.0F);
         float var15 = this.m_1625(1.0F, 0.0F, 0.0F);
         float var16 = this.m_1625(0.0F, 1.0F, 0.0F);
         float var17 = this.m_1625(0.0F, f_3148, 0.0F);
         float var18 = (var7 + var6) / f_3149;
         float var19 = (var7 + var6 + var4) / f_3150;
         float var20 = (var8 + var6) / f_3151;
         float var21 = (var8 + var6 + var5) / f_3152;
         float var22 = (var7 + var6 + var4 + var6) / f_3153;
         float var23 = (var7 + var6 + var4 + var6 + var4) / f_3154;
         float var24 = (var8 + var6) / f_3155;
         float var25 = (var8 + var6 + var5) / f_3156;
         float var26 = var7 / f_3157;
         float var27 = (var7 + var6) / f_3158;
         float var28 = (var8 + var6) / f_3159;
         float var29 = (var8 + var6 + var5) / f_3160;
         float var30 = (var7 + var6 + var4) / f_3161;
         float var31 = (var7 + var6 + var4 + var6) / f_3162;
         float var32 = (var8 + var6) / f_3163;
         float var33 = (var8 + var6 + var5) / f_3164;
         float var34 = (var7 + var6) / f_3165;
         float var35 = (var7 + var6 + var4) / f_3166;
         float var36 = var8 / f_3167;
         float var37 = (var8 + var6) / f_3168;
         float var38 = (var7 + var6 + var4) / f_3169;
         float var39 = (var7 + var6 + var4 + var4) / f_3170;
         float var40 = var8 / f_3171;
         float var41 = (var8 + var6) / f_3172;
         this.m_1615(var1, var2, var3, var9, var2, var3, var9, var10, var3, var1, var10, var3, var19, var21, var18, var21, var18, var20, var19, var20, var12);
         this.m_1615(
            var9, var2, var11, var1, var2, var11, var1, var10, var11, var9, var10, var11, var22, var25, var23, var25, var23, var24, var22, var24, var13
         );
         this.m_1615(var1, var2, var11, var1, var2, var3, var1, var10, var3, var1, var10, var11, var26, var29, var27, var29, var27, var28, var26, var28, var14);
         this.m_1615(var9, var2, var3, var9, var2, var11, var9, var10, var11, var9, var10, var3, var30, var33, var31, var33, var31, var32, var30, var32, var15);
         this.m_1615(
            var1, var10, var11, var9, var10, var11, var9, var10, var3, var1, var10, var3, var34, var37, var35, var37, var35, var36, var34, var36, var16
         );
         this.m_1615(var1, var2, var3, var9, var2, var3, var9, var2, var11, var1, var2, var11, var38, var40, var39, var40, var39, var41, var38, var41, var17);
      }
   }

   public enum yai0oZhjj58G7pDC {
      SKIN,
      SHADOW;
   }
}
