package dev.dimasik.client.system;

import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.ProjectionType;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.PoseStack;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.client.renderer.SubmitNodeStorage;
import net.minecraft.client.renderer.item.TrackingItemStackRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import org.joml.Vector4f;

public final class Class_Trm8dR6i9vMfnZEG implements AutoCloseable, Class_NzJrN63M7QBpmAbi {
   private final SubmitNodeStorage f_14392 = new SubmitNodeStorage();
   private static final int f_14393 = 1024;
   private static final int f_14394 = 32;
   private static final int f_14395 = 32;
   private static final int f_14396 = 1024;
   private static final int f_14397 = 512;
   private static final long f_14398 = 50000000L;
   private static int f_14399;
   private final Map<Object, Class_Trm8dR6i9vMfnZEG.EBEdhOrL5B3pmuGf> f_14400 = new HashMap<>();
   private final Map<Object, Class_Trm8dR6i9vMfnZEG.W0wkxNml2By9HGq5> f_14401 = new LinkedHashMap<>();
   private final Map<Class_Trm8dR6i9vMfnZEG.CkfgPW9myfNnhxN7, Class_Trm8dR6i9vMfnZEG.Io9apeuwNPuyomYn> f_14402;
   private final Class_JVVLGT9hzxM6kEZe f_14403;
   private GpuTexture f_14404;
   private GpuTextureView f_14405;
   private GpuTexture f_14406;
   private GpuTextureView f_14407;
   private int f_14408;
   private int f_14409;
   private int f_14410;
   private Object f_14411;
   private boolean f_14412;
   private static final float f_14413 = 0.75F;
   private static final String f_14414 = "dimasik batched item atlas";
   private static final float f_14415 = -1000.0F;
   private static final float f_14416 = 1000.0F;
   private static final long f_14417 = 50000000L;
   private static final long f_14418 = 50000000L;
   private static final float f_14419 = 1024.0F;
   private static final float f_14420 = 1024.0F;
   private static final float f_14421 = 1024.0F;
   private static final float f_14422 = 1024.0F;
   private static final float f_14423 = 1024.0F;
   private static final float f_14424 = 1024.0F;
   private static final float f_14425 = 16.0F;
   private static final float f_14426 = 16.0F;
   private static final float f_14427 = 32.0F;
   private static final float f_14428 = -32.0F;
   private static final float f_14429 = 32.0F;
   private static final int f_14430 = 15728880;
   private static final String f_14431 = "Dimasik batched item atlas";
   private static final String f_14432 = "Dimasik batched item atlas depth";

   public int m_5057() {
      return this.f_14400.size();
   }

   public void m_5058() {
      if (!this.f_14412) {
         if (this.f_14410 != f_14399 || this.f_14411 != f_11537.level) {
            this.f_14400.values().forEach(var0 -> var0.f_14383 = false);
            this.f_14402.values().forEach(var0 -> var0.f_14391 = false);
            this.f_14400.clear();
            this.f_14402.clear();
            this.f_14401.clear();
            this.f_14408 = 0;
            this.f_14410 = f_14399;
            this.f_14411 = f_11537.level;
            RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(this.f_14404, new Vector4f(0.0F), this.f_14406, 0.0);
         }

         this.f_14409++;
      }
   }

   public boolean m_5059() {
      return !this.f_14401.isEmpty();
   }

   public void m_5060() {
      if (!this.f_14412 && !this.f_14401.isEmpty()) {
         Class_1x5Fn2q4kmtD2Zmq.EGrtL3OkTEhswyKz var1 = Class_1x5Fn2q4kmtD2Zmq.m_885();
         var1.m_884();
         GpuTextureView var2 = RenderSystem.outputColorTextureOverride;
         GpuTextureView var3 = RenderSystem.outputDepthTextureOverride;
         RenderSystem.backupProjectionMatrix();

         try {
            RenderSystem.outputColorTextureOverride = this.f_14405;
            RenderSystem.outputDepthTextureOverride = this.f_14407;
            RenderSystem.setProjectionMatrix(this.f_14403.m_3263(f_14423, f_14424), ProjectionType.ORTHOGRAPHIC);
            PoseStack var4 = new PoseStack();

            for (Class_Trm8dR6i9vMfnZEG.W0wkxNml2By9HGq5 var6 : this.f_14401.values()) {
               this.m_5066(var6.state(), var6.entry(), var4, var1);
               var6.entry().f_14386 = this.f_14409;
            }
         } finally {
            var1.m_884();
            RenderSystem.outputColorTextureOverride = var2;
            RenderSystem.outputDepthTextureOverride = var3;
            RenderSystem.restoreProjectionMatrix();
            RenderSystem.disableScissorForRenderTypeDraws();
            this.f_14401.clear();
         }
      }
   }

   public static void m_5061() {
      f_14399++;
   }

   public GpuTextureView m_5062() {
      return this.f_14405;
   }

   public Class_Trm8dR6i9vMfnZEG.RP0DX1n0YDZ43moC m_5063(ItemStack var1, Class_Trm8dR6i9vMfnZEG.Class_6SoEwLZCu5bs5f6U var2) {
      if (!this.f_14412 && var1 != null && !var1.isEmpty()) {
         long var3 = System.nanoTime();
         if (var2.f_14370 != this
            || var2.f_14372 == null
            || !var2.f_14372.f_14391
            || (var2.f_14369 || var2.f_14371 != var1 || var3 >= var2.f_14372.f_14390) && !ItemStack.matches(var1, var2.f_14372.f_14388.f_14373)) {
            Class_Trm8dR6i9vMfnZEG.CkfgPW9myfNnhxN7 var5 = new Class_Trm8dR6i9vMfnZEG.CkfgPW9myfNnhxN7(var1);
            Class_Trm8dR6i9vMfnZEG.Io9apeuwNPuyomYn var6 = this.f_14402.get(var5);
            if (var6 == null) {
               if (this.f_14402.size() >= 512) {
                  Iterator var7 = this.f_14402.values().iterator();
                  ((Class_Trm8dR6i9vMfnZEG.Io9apeuwNPuyomYn)var7.next()).f_14391 = false;
                  var7.remove();
               }

               var6 = new Class_Trm8dR6i9vMfnZEG.Io9apeuwNPuyomYn(var5);
               this.f_14402.put(var5, var6);
            }

            var2.f_14370 = this;
            var2.f_14372 = var6;
         }

         var2.f_14371 = var1;
         Class_Trm8dR6i9vMfnZEG.Io9apeuwNPuyomYn var10 = var2.f_14372;
         boolean var11 = var2.f_14369
            && var10.f_14389 != null
            && var10.f_14389.f_14382
            && var10.f_14389.f_14386 != this.f_14409
            && var10.f_14389.f_14387 != this.f_14409;
         if (var3 < var10.f_14390 && (var10.f_14389 == null || var10.f_14389.f_14383) && !var11) {
            if (var10.f_14389 != null) {
               var10.f_14389.f_14384 = this.f_14409;
            }

            return var10.f_14389 == null ? null : var10.f_14389.m_5054();
         } else {
            var10.f_14390 = var3 + f_14417;
            this.f_14402.get(var10.f_14388);
            TrackingItemStackRenderState var12 = new TrackingItemStackRenderState();
            f_11537.getItemModelResolver().updateForTopItem(var12, var10.f_14388.f_14373, ItemDisplayContext.GUI, f_11537.level, f_11537.player, 0);
            if (var12.isEmpty()) {
               var10.f_14389 = null;
               return null;
            }

            Object var8 = var12.getModelIdentity();
            Class_Trm8dR6i9vMfnZEG.EBEdhOrL5B3pmuGf var9 = this.f_14400.get(var8);
            if (var9 == null) {
               var9 = this.m_5065();
               if (var9 != null) {
                  var9.f_14382 = var12.isAnimated();
                  this.f_14400.put(var8, var9);
                  this.m_5064(var8, var12, var9);
               }
            } else if (var9.f_14382 && (var2.f_14369 || var3 - var9.f_14385 >= f_14418) && var9.f_14386 != this.f_14409 && var9.f_14387 != this.f_14409) {
               this.m_5064(var8, var12, var9);
            }

            var10.f_14389 = var9;
            if (var9 != null) {
               var9.f_14384 = this.f_14409;
            }

            return var9 == null ? null : var9.m_5054();
         }
      } else {
         return null;
      }
   }

   private void m_5064(Object var1, TrackingItemStackRenderState var2, Class_Trm8dR6i9vMfnZEG.EBEdhOrL5B3pmuGf var3) {
      var3.f_14387 = this.f_14409;
      var3.f_14385 = System.nanoTime();
      this.f_14401.put(var1, new Class_Trm8dR6i9vMfnZEG.W0wkxNml2By9HGq5(var2, var3));
   }

   private Class_Trm8dR6i9vMfnZEG.EBEdhOrL5B3pmuGf m_5065() {
      if (this.f_14408 < 1024) {
         int var10 = this.f_14408++;
         int var11 = var10 % 32;
         int var13 = var10 / 32;
         int var14 = var11 * 32;
         int var15 = var13 * 32;
         float var6 = var14 / f_14419;
         float var7 = (var14 + 32) / f_14420;
         float var8 = (1024 - var15) / f_14421;
         float var9 = (1024 - var15 - 32) / f_14422;
         return new Class_Trm8dR6i9vMfnZEG.EBEdhOrL5B3pmuGf(var14, var15, var6, var8, var7, var9);
      }

      Object var1 = null;
      Class_Trm8dR6i9vMfnZEG.EBEdhOrL5B3pmuGf var2 = null;

      for (Entry var4 : this.f_14400.entrySet()) {
         Class_Trm8dR6i9vMfnZEG.EBEdhOrL5B3pmuGf var5 = (Class_Trm8dR6i9vMfnZEG.EBEdhOrL5B3pmuGf)var4.getValue();
         if (var5.f_14384 != this.f_14409 && !this.f_14401.containsKey(var4.getKey()) && (var2 == null || var5.f_14384 < var2.f_14384)) {
            var1 = var4.getKey();
            var2 = var5;
         }
      }

      if (var2 == null) {
         return null;
      }

      this.f_14400.remove(var1);
      var2.f_14383 = false;
      Class_Trm8dR6i9vMfnZEG.EBEdhOrL5B3pmuGf var12 = new Class_Trm8dR6i9vMfnZEG.EBEdhOrL5B3pmuGf(
         var2.f_14375, var2.f_14376, var2.f_14381.m_5055(), var2.f_14381.vTop(), var2.f_14381.m_5056(), var2.f_14381.vBottom()
      );
      var12.f_14386 = 0;
      return var12;
   }

   private void m_5066(
      TrackingItemStackRenderState var1, Class_Trm8dR6i9vMfnZEG.EBEdhOrL5B3pmuGf var2, PoseStack var3, Class_1x5Fn2q4kmtD2Zmq.EGrtL3OkTEhswyKz var4
   ) {
      if (var2.f_14386 >= 0) {
         RenderSystem.getDevice()
            .createCommandEncoder()
            .clearColorAndDepthTextures(this.f_14404, new Vector4f(0.0F), this.f_14406, 0.0, var2.f_14375, 1024 - var2.f_14376 - 32, 32, 32);
      }

      var3.pushPose();

      try {
         var3.translate(var2.f_14375 + f_14425, var2.f_14376 + f_14426, 0.0F);
         var3.scale(f_14427, f_14428, f_14429);
         f_11537.gameRenderer
            .lighting()
            .setupFor(var1.usesBlockLight() ? com.mojang.blaze3d.platform.Lighting.Entry.ITEMS_3D : com.mojang.blaze3d.platform.Lighting.Entry.ITEMS_FLAT);
         RenderSystem.enableScissorForRenderTypeDraws(var2.f_14375, 1024 - var2.f_14376 - 32, 32, 32);
         var1.submit(var3, this.f_14392, f_14430, OverlayTexture.NO_OVERLAY, 0);
         f_11537.gameRenderer.featureRenderDispatcher().renderAllFeatures(this.f_14392);
         var4.m_884();
      } finally {
         RenderSystem.disableScissorForRenderTypeDraws();
         var3.popPose();
      }
   }

   public Class_Trm8dR6i9vMfnZEG.RP0DX1n0YDZ43moC m_5067(ItemStack var1) {
      if (!this.f_14412 && var1 != null && !var1.isEmpty()) {
         ItemStack var2 = var1;
         TrackingItemStackRenderState var3 = new TrackingItemStackRenderState();
         f_11537.getItemModelResolver().updateForTopItem(var3, var2, ItemDisplayContext.GUI, f_11537.level, f_11537.player, 0);
         if (var3.isEmpty()) {
            return null;
         }

         Object var4 = var3.getModelIdentity();
         Class_Trm8dR6i9vMfnZEG.EBEdhOrL5B3pmuGf var5 = this.f_14400.get(var4);
         if (var5 == null) {
            var5 = this.m_5065();
            if (var5 == null) {
               return null;
            }

            var5.f_14382 = var3.isAnimated();
            this.f_14400.put(var4, var5);
            this.m_5064(var4, var3, var5);
         } else if (var5.f_14382 && var5.f_14386 != this.f_14409 && var5.f_14387 != this.f_14409) {
            this.m_5064(var4, var3, var5);
         }

         var5.f_14384 = this.f_14409;
         return var5.m_5054();
      } else {
         return null;
      }
   }

   public Class_Trm8dR6i9vMfnZEG() {
      this.f_14402 = new LinkedHashMap<>(64, f_14413, true);
      this.f_14403 = new Class_JVVLGT9hzxM6kEZe(f_14414, f_14415, f_14416, true);
      this.f_14410 = f_14399;
      this.m_5070();
   }

   @Override
   public void close() {
      if (!this.f_14412) {
         this.f_14412 = true;
         this.f_14401.clear();
         this.f_14400.clear();
         this.f_14402.values().forEach(var0 -> var0.f_14391 = false);
         this.f_14402.clear();
         if (this.f_14405 != null) {
            this.f_14405.close();
            this.f_14405 = null;
         }

         if (this.f_14404 != null) {
            this.f_14404.close();
            this.f_14404 = null;
         }

         if (this.f_14407 != null) {
            this.f_14407.close();
            this.f_14407 = null;
         }

         if (this.f_14406 != null) {
            this.f_14406.close();
            this.f_14406 = null;
         }
      }
   }

   private void m_5070() {
      GpuDevice var1 = RenderSystem.getDevice();
      this.f_14404 = var1.createTexture(f_14431, 13, GpuFormat.RGBA8_UNORM, 1024, 1024, 1, 1);
      this.f_14405 = var1.createTextureView(this.f_14404);
      this.f_14406 = var1.createTexture(f_14432, 9, GpuFormat.D32_FLOAT, 1024, 1024, 1, 1);
      this.f_14407 = var1.createTextureView(this.f_14406);
      var1.createCommandEncoder().clearColorAndDepthTextures(this.f_14404, new Vector4f(0.0F), this.f_14406, 0.0);
   }

   private static final class CkfgPW9myfNnhxN7 {
      public final ItemStack f_14373;
      public final int f_14374;

      @Override
      public int hashCode() {
         return this.f_14374;
      }

      public CkfgPW9myfNnhxN7(ItemStack var1) {
         this.f_14373 = var1.copy();
         this.f_14374 = 31 * ItemStack.hashItemAndComponents(this.f_14373) + this.f_14373.getCount();
      }

      @Override
      public boolean equals(Object var1) {
         return var1 == this || var1 instanceof Class_Trm8dR6i9vMfnZEG.CkfgPW9myfNnhxN7 var2 && ItemStack.matches(this.f_14373, var2.f_14373);
      }
   }

   public static final class Class_6SoEwLZCu5bs5f6U {
      public final boolean f_14369;
      public Class_Trm8dR6i9vMfnZEG f_14370;
      public ItemStack f_14371;
      public Class_Trm8dR6i9vMfnZEG.Io9apeuwNPuyomYn f_14372;

      public Class_6SoEwLZCu5bs5f6U(boolean var1) {
         this.f_14369 = var1;
      }

      public Class_6SoEwLZCu5bs5f6U() {
         this(false);
      }
   }

   private static final class EBEdhOrL5B3pmuGf {
      public final int f_14375;
      public final int f_14376;
      public final float f_14377;
      public final float f_14378;
      public final float f_14379;
      public final float f_14380;
      public final Class_Trm8dR6i9vMfnZEG.RP0DX1n0YDZ43moC f_14381;
      public boolean f_14382;
      public boolean f_14383 = true;
      public int f_14384;
      public long f_14385;
      public int f_14386 = -1;
      public int f_14387 = -1;

      public EBEdhOrL5B3pmuGf(int var1, int var2, float var3, float var4, float var5, float var6) {
         this.f_14375 = var1;
         this.f_14376 = var2;
         this.f_14377 = var3;
         this.f_14378 = var4;
         this.f_14379 = var5;
         this.f_14380 = var6;
         this.f_14381 = new Class_Trm8dR6i9vMfnZEG.RP0DX1n0YDZ43moC(var3, var4, var5, var6);
      }

      public Class_Trm8dR6i9vMfnZEG.RP0DX1n0YDZ43moC m_5054() {
         return this.f_14381;
      }
   }

   private static final class Io9apeuwNPuyomYn {
      public final Class_Trm8dR6i9vMfnZEG.CkfgPW9myfNnhxN7 f_14388;
      public Class_Trm8dR6i9vMfnZEG.EBEdhOrL5B3pmuGf f_14389;
      public long f_14390;
      public boolean f_14391 = true;

      public Io9apeuwNPuyomYn(Class_Trm8dR6i9vMfnZEG.CkfgPW9myfNnhxN7 var1) {
         this.f_14388 = var1;
      }
   }

   public record RP0DX1n0YDZ43moC(float u0, float vTop, float u1, float vBottom) {
      public float m_5055() {
         return this.u0;
      }

      public float m_5056() {
         return this.u1;
      }
   }

   private record W0wkxNml2By9HGq5(TrackingItemStackRenderState state, Class_Trm8dR6i9vMfnZEG.EBEdhOrL5B3pmuGf entry) {
   }
}
