package dev.dimasik.client.module.render;

import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.pipeline.TextureTarget;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.shaders.UniformType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.AutoStorageIndexBuffer;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.MeshData;
import com.mojang.blaze3d.vertex.MeshData.DrawState;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_PoKta0VE7AdhY1En;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Map.Entry;
import net.minecraft.network.protocol.game.ClientboundExplodePacket;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;

public final class TNTEffect extends Module {
   private static final int f_13309 = 8;
   private static final int f_13310 = 24;
   private static final int f_13311 = 36;
   private static final int f_13312 = 144;
   private final SliderSetting f_13313;
   private final SliderSetting f_13314;
   private final SliderSetting f_13315;
   private final List<TNTEffect.XYlWrwlqtrDPf0a3> f_13316;
   private final Map<Integer, TNTEffect.daehi5IwXVPgXABJ> f_13317;
   private TextureTarget f_13318;
   private final RenderPipeline f_13319;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_13320;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_13321;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_13322;
   private static final String f_13323 = "TNTEffect";
   private static final String f_13324 = "Ударная волна при взрыве TNT";
   private static final String f_13325 = "Сила";
   private static final float f_13326 = 1.35F;
   private static final float f_13327 = 0.5F;
   private static final float f_13328 = 2.5F;
   private static final float f_13329 = 0.05F;
   private static final String f_13330 = "Радиус";
   private static final float f_13331 = 16.0F;
   private static final float f_13332 = 8.0F;
   private static final float f_13333 = 28.0F;
   private static final float f_13334 = 0.5F;
   private static final String f_13335 = "Длительность";
   private static final float f_13336 = 0.9F;
   private static final float f_13337 = 0.5F;
   private static final float f_13338 = 1.6F;
   private static final float f_13339 = 0.05F;
   private static final String f_13340 = "dimasik/tnt_effect";
   private static final String f_13341 = "tnt_effect";
   private static final String f_13342 = "tnt_effect";
   private static final String f_13343 = "TNTSphere";
   private static final String f_13344 = "SceneSampler";
   private static final double f_13345 = 128.0;
   private static final double f_13346 = 16.0;
   private static final long f_13347 = 1000L;
   private static final double f_13348 = 0.25;
   private static final long f_13349 = 150000000L;
   private static final float f_13350 = 4.0F;
   private static final float f_13351 = 0.75F;
   private static final float f_13352 = 0.1F;
   private static final float f_13353 = 1.0E9F;
   private static final double f_13354 = 3.4;
   private static final float f_13355 = 0.35F;
   private static final float f_13356 = 0.045F;
   private static final float f_13357 = 0.52F;
   private static final float f_13358 = 0.18F;
   private static final float f_13359 = 0.022F;
   private static final float f_13360 = 0.038F;
   private static final int f_13361 = -16777216;
   private static final float f_13362 = 1.15F;
   private static final float f_13363 = 0.58F;
   private static final float f_13364 = 0.05F;
   private static final float f_13365 = 1.05F;
   private static final float f_13366 = 0.52F;
   private static final String f_13367 = "SceneSampler";
   private static final String f_13368 = "TNTSphere";
   private static final float f_13369 = 24.0F;
   private static final float f_13370 = 24.0F;
   private static final float f_13371 = 0.5F;
   private static final float f_13372 = (float) Math.PI;
   private static final float f_13373 = 0.5F;
   private static final float f_13374 = (float) Math.PI;
   private static final float f_13375 = 36.0F;
   private static final float f_13376 = 36.0F;
   private static final float f_13377 = (float) (Math.PI * 2);
   private static final float f_13378 = (float) (Math.PI * 2);
   private static final String f_13379 = "tnt-effect-scene";
   private static final float f_13380 = 3.0F;
   private static final String f_13381 = "TNT shockwave spheres";
   private static final String f_13382 = "TNT shockwave sphere uniforms";
   private static final String f_13383 = "TNT shockwave sphere vertices";
   private static final float f_13384 = 1.0E9F;
   private static final long f_13385 = 1000L;

   private void m_4704(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.level != null && f_11537.player != null) {
         long var2 = System.currentTimeMillis();

         for (PrimedTnt var5 : f_11537.level.getEntitiesOfClass(PrimedTnt.class, f_11537.player.getBoundingBox().inflate(f_13345), var0 -> true)) {
            this.f_13317.put(var5.getId(), new TNTEffect.daehi5IwXVPgXABJ(var5.position(), var2));
         }

         this.f_13317.values().removeIf(var2x -> var2 - var2x.lastSeen > f_13385);
      } else {
         this.f_13316.clear();
         this.f_13317.clear();
      }
   }

   private void m_4705(Class_XzpX8S5F5zd9jbuE var1) {
      if (var1.m_5619() instanceof ClientboundExplodePacket var2) {
         Vec3 var5 = var2.center();
         float var4 = var2.radius();
         f_11537.execute(() -> this.m_4708(var5, var4));
      }
   }

   private void m_4708(Vec3 var1, float var2) {
      if (this.m_776() && f_11537.level != null && f_11537.player != null) {
         long var3 = System.currentTimeMillis();
         Integer var5 = null;
         double var6 = f_13346;

         for (Entry var9 : this.f_13317.entrySet()) {
            TNTEffect.daehi5IwXVPgXABJ var10 = (TNTEffect.daehi5IwXVPgXABJ)var9.getValue();
            if (var3 - var10.lastSeen <= f_13347) {
               double var11 = var10.position.distanceToSqr(var1);
               if (var11 < var6) {
                  var6 = var11;
                  var5 = (Integer)var9.getKey();
               }
            }
         }

         if (var5 != null) {
            this.f_13317.remove(var5);
            long var13 = System.nanoTime();

            for (TNTEffect.XYlWrwlqtrDPf0a3 var16 : this.f_13316) {
               if (var16.position.distanceToSqr(var1) < f_13348 && var13 - var16.startedAt < f_13349) {
                  return;
               }
            }

            float var15 = Mth.clamp(var2 / f_13350, f_13351, 2.0F);
            this.f_13316.add(new TNTEffect.XYlWrwlqtrDPf0a3(var1, var13, var15));

            while (this.f_13316.size() > 8) {
               this.f_13316.removeFirst();
            }
         }
      }
   }

   @Override
   public void m_732() {
      this.f_13316.clear();
      this.f_13317.clear();
      if (this.f_13318 != null) {
         this.f_13318.destroyBuffers();
         this.f_13318 = null;
      }
   }

   private void m_4710(RenderTarget var1, List<TNTEffect.Class_6pL4xCFguzuIBHqk> var2, Matrix4f var3, Matrix4f var4) {
      TextureTarget var5 = this.m_4715(var1);
      CommandEncoder var6 = RenderSystem.getDevice().createCommandEncoder();
      var6.copyTextureToTexture(var1.getColorTexture(), var5.getColorTexture(), 0, 0, 0, 0, 0, var1.width, var1.height);
      Vector4f var7 = Class_BftdentXEtGbugJw.m_2298(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) | f_13361);
      BufferBuilder var8 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.TRIANGLES, DefaultVertexFormat.POSITION_TEX_COLOR_NORMAL);
      Matrix4f var9 = new Matrix4f();
      int var10 = 0;

      for (TNTEffect.Class_6pL4xCFguzuIBHqk var12 : var2) {
         float var13 = var12.centerX * var12.centerX + var12.centerY * var12.centerY + var12.centerZ * var12.centerZ;
         boolean var14 = var13 < (var12.radius + var12.thickness) * (var12.radius + var12.thickness);
         var10 += this.m_4717(var8, var9, var12, var12.radius + var12.thickness * f_13362, var12.strength * f_13363, var14, var7);
         var10 += this.m_4717(var8, var9, var12, Math.max(f_13364, var12.radius - var12.thickness * f_13365), -var12.strength * f_13366, var14, var7);
         var10 += this.m_4717(var8, var9, var12, var12.radius, var12.strength, var14, var7);
      }

      MeshData var35 = var8.build();
      if (var35 != null && var10 != 0) {
         MeshData var36 = var35;

         try {
            MemoryStack var37 = MemoryStack.stackPush();

            try {
               DrawState var38 = var35.drawState();
               AutoStorageIndexBuffer var15 = RenderSystem.getSequentialBuffer(var38.primitiveTopology());
               GpuBuffer var16 = var15.getBuffer(var38.indexCount());
               ByteBuffer var17 = Std140Builder.onStack(var37, 144)
                  .putMat4f(var3)
                  .putMat4f(var4)
                  .putVec4(var1.width, var1.height, var3.m00(), var3.m11())
                  .get();
               GpuBuffer var18 = RenderSystem.getDevice().createBuffer(() -> f_13383, 32, var35.vertexBuffer());

               try {
                  GpuBuffer var19 = RenderSystem.getDevice().createBuffer(() -> f_13382, 128, var17);

                  try {
                     RenderPass var20 = var6.createRenderPass(
                        () -> f_13381, var1.getColorTextureView(), Optional.empty(), var1.getDepthTextureView(), OptionalDouble.empty()
                     );

                     try {
                        var20.setPipeline(this.f_13319);
                        var20.bindTexture(f_13367, var5.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
                        var20.setUniform(f_13368, var19);
                        var20.setVertexBuffer(0, var18.slice());
                        var20.setIndexBuffer(var16, var15.type());
                        var20.drawIndexed(var38.indexCount(), 1, 0, 0, 0);
                     } catch (Throwable var28) {
                        if (var20 != null) {
                           try {
                              var20.close();
                           } catch (Throwable var27) {
                              var28.addSuppressed(var27);
                           }
                        }

                        throw var28;
                     }

                     if (var20 != null) {
                        var20.close();
                     }
                  } catch (Throwable var29) {
                     if (var19 != null) {
                        try {
                           var19.close();
                        } catch (Throwable var26) {
                           var29.addSuppressed(var26);
                        }
                     }

                     throw var29;
                  }

                  if (var19 != null) {
                     var19.close();
                  }
               } catch (Throwable var30) {
                  if (var18 != null) {
                     try {
                        var18.close();
                     } catch (Throwable var25) {
                        var30.addSuppressed(var25);
                     }
                  }

                  throw var30;
               }

               if (var18 != null) {
                  var18.close();
               }
            } catch (Throwable var31) {
               if (var37 != null) {
                  try {
                     var37.close();
                  } catch (Throwable var24) {
                     var31.addSuppressed(var24);
                  }
               }

               throw var31;
            }

            if (var37 != null) {
               var37.close();
            }
         } catch (Throwable var32) {
            if (var36 != null) {
               try {
                  var36.close();
               } catch (Throwable var23) {
                  var32.addSuppressed(var23);
               }
            }

            throw var32;
         }

         if (var36 != null) {
            var36.close();
         }
      } else {
         if (var35 != null) {
            var35.close();
         }
      }
   }

   @Override
   public void m_778() {
      this.f_13316.clear();
      this.f_13317.clear();
   }

   private int m_4712(
      BufferBuilder var1,
      Matrix4f var2,
      TNTEffect.Class_6pL4xCFguzuIBHqk var3,
      float var4,
      float var5,
      float var6,
      float var7,
      boolean var8,
      Vector4f var9,
      float var10,
      float var11
   ) {
      float var12 = Mth.cos(var6);
      float var13 = var12 * Mth.cos(var5);
      float var14 = Mth.sin(var6);
      float var15 = var12 * Mth.sin(var5);
      var1.addVertex(var2, var3.centerX + var13 * var4, var3.centerY + var14 * var4, var3.centerZ + var15 * var4)
         .setUv(var7, var8 ? -var4 : var4)
         .setColor(var9.x, var9.y, var9.z, var3.alpha)
         .setNormal(var13, var14, var15);
      return 1;
   }

   private TextureTarget m_4715(RenderTarget var1) {
      if (this.f_13318 == null) {
         this.f_13318 = new TextureTarget(f_13379, var1.width, var1.height, false, GpuFormat.RGBA8_UNORM);
      } else if (this.f_13318.width != var1.width || this.f_13318.height != var1.height) {
         this.f_13318.resize(var1.width, var1.height);
      }

      return this.f_13318;
   }

   private void m_4716(Class_TZhU50s8XmBQCMP5 var1) {
      if (f_11537.level != null && f_11537.player != null && !this.f_13316.isEmpty()) {
         long var2 = System.nanoTime();
         float var4 = Math.max(f_13352, this.f_13315.m_8768());
         this.f_13316.removeIf(var3 -> (float)(var2 - var3.startedAt) / f_13384 >= var4);
         if (!this.f_13316.isEmpty()) {
            RenderTarget var5 = f_11537.gameRenderer.mainRenderTarget();
            if (var5 != null && var5.getColorTexture() != null && var5.getDepthTexture() != null && !var5.getDepthTexture().isClosed()) {
               ArrayList var6 = new ArrayList(8);

               for (TNTEffect.XYlWrwlqtrDPf0a3 var8 : this.f_13316) {
                  TNTEffect.Class_6pL4xCFguzuIBHqk var9 = this.m_4718(var8, var1.m_5010(), var2, var4);
                  if (var9 != null) {
                     var6.add(var9);
                  }
               }

               if (!var6.isEmpty()) {
                  this.m_4710(var5, var6, var1.m_5009(), var1.m_5007());
               }
            }
         }
      }
   }

   private int m_4717(BufferBuilder var1, Matrix4f var2, TNTEffect.Class_6pL4xCFguzuIBHqk var3, float var4, float var5, boolean var6, Vector4f var7) {
      int var8 = 0;

      for (int var9 = 0; var9 < 24; var9++) {
         float var10 = var9 / f_13369;
         float var11 = (var9 + 1.0F) / f_13370;
         float var12 = (var10 - f_13371) * f_13372;
         float var13 = (var11 - f_13373) * f_13374;

         for (int var14 = 0; var14 < 36; var14++) {
            float var15 = var14 / f_13375;
            float var16 = (var14 + 1.0F) / f_13376;
            float var17 = var15 * f_13377;
            float var18 = var16 * f_13378;
            var8 += this.m_4712(var1, var2, var3, var4, var17, var12, var5, var6, var7, var15, var10);
            var8 += this.m_4712(var1, var2, var3, var4, var18, var13, var5, var6, var7, var16, var11);
            var8 += this.m_4712(var1, var2, var3, var4, var18, var12, var5, var6, var7, var16, var10);
            var8 += this.m_4712(var1, var2, var3, var4, var17, var12, var5, var6, var7, var15, var10);
            var8 += this.m_4712(var1, var2, var3, var4, var17, var13, var5, var6, var7, var15, var11);
            var8 += this.m_4712(var1, var2, var3, var4, var18, var13, var5, var6, var7, var16, var11);
         }
      }

      return var8;
   }

   public TNTEffect() {
      super(f_13323, f_13324, Category.RENDER);
      this.f_13313 = new SliderSetting(f_13325, f_13326, f_13327, f_13328).m_828(f_13329);
      this.f_13314 = new SliderSetting(f_13330, f_13331, f_13332, f_13333).m_828(f_13334);
      this.f_13315 = new SliderSetting(f_13335, f_13336, f_13337, f_13338).m_828(f_13339);
      this.f_13316 = new ArrayList<>();
      this.f_13317 = new HashMap<>();
      this.f_13319 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_13340)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_13341))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_13342))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2727()
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR_NORMAL, PrimitiveTopology.TRIANGLES)
         .m_2729(f_13343, UniformType.UNIFORM_BUFFER)
         .m_2741(f_13344)
         .m_2722();
      this.f_13320 = this::m_4704;
      this.f_13321 = this::m_4705;
      this.f_13322 = this::m_4716;
      this.m_795(this.f_13313, this.f_13314, this.f_13315);
   }

   private TNTEffect.Class_6pL4xCFguzuIBHqk m_4718(TNTEffect.XYlWrwlqtrDPf0a3 var1, Vec3 var2, long var3, float var5) {
      float var6 = Mth.clamp((float)(var3 - var1.startedAt) / f_13353 / var5, 0.0F, 1.0F);
      float var7 = 1.0F - (float)Math.pow(1.0F - var6, f_13354);
      float var8 = (f_13355 + var7 * this.f_13314.m_8768()) * var1.power;
      Vec3 var9 = var1.position.subtract(var2);
      float var10 = m_4719(0.0F, f_13356, var6);
      float var11 = 1.0F - m_4719(f_13357, 1.0F, var6);
      float var12 = var10 * var11;
      float var13 = Math.max(f_13358, var8 * (f_13359 + f_13360 * (1.0F - var6)));
      float var14 = this.f_13313.m_8768() * var1.power * var12;
      return new TNTEffect.Class_6pL4xCFguzuIBHqk((float)var9.x, (float)var9.y, (float)var9.z, var8, var13, var14, var12, var6);
   }

   private static float m_4719(float var0, float var1, float var2) {
      float var3 = Mth.clamp((var2 - var0) / (var1 - var0), 0.0F, 1.0F);
      return var3 * var3 * (f_13380 - 2.0F * var3);
   }

   private record Class_6pL4xCFguzuIBHqk(
      float centerX, float centerY, float centerZ, float radius, float thickness, float strength, float alpha, float progress
   ) {
   }

   private record XYlWrwlqtrDPf0a3(Vec3 position, long startedAt, float power) {
   }

   private record daehi5IwXVPgXABJ(Vec3 position, long lastSeen) {
   }
}
