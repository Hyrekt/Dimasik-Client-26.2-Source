package dev.dimasik.client.system;

import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.platform.NativeImage;
import com.mojang.blaze3d.platform.NativeImage.Format;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.util.Arrays;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.level.levelgen.Heightmap.Types;
import net.minecraft.world.phys.Vec3;
import org.lwjgl.system.MemoryStack;

public final class Class_B4b08mhJ5vKzLj3f implements AutoCloseable {
   private static final int f_5291 = 128;
   private final int[] f_5292 = new int[16384];
   private final int[] f_5293 = new int[16384];
   private final MutableBlockPos f_5294 = new MutableBlockPos();
   private NativeImage f_5295;
   private GpuTexture f_5296;
   private GpuTextureView f_5297;
   private GpuBuffer f_5298;
   private ClientLevel f_5299;
   private int f_5300;
   private int f_5301;
   private int f_5302;
   private long f_5303;
   private boolean f_5304;
   private static final int f_5305 = 32768;
   private static final int f_5306 = 65535;
   private static final int f_5307 = 65535;
   private static final int f_5308 = -16777216;
   private static final long f_5309 = 100000000L;
   private static final double f_5310 = 128.0;
   private static final double f_5311 = 128.0;
   private static final double f_5312 = 128.0;
   private static final double f_5313 = 128.0;
   private static final float f_5314 = 0.0078125F;
   private static final String f_5315 = "RainRoof";
   private static final String f_5316 = "RoofSampler";
   private static final int f_5317 = Integer.MIN_VALUE;
   private static final int f_5318 = Integer.MIN_VALUE;
   private static final long f_5319 = 16L;
   private static final String f_5320 = "Ambience rain roof uniforms";
   private static final String f_5321 = "Ambience rain heightmap";

   @Override
   public void close() {
      if (this.f_5297 != null) {
         this.f_5297.close();
      }

      if (this.f_5296 != null) {
         this.f_5296.close();
      }

      if (this.f_5295 != null) {
         this.f_5295.close();
      }

      if (this.f_5298 != null && !this.f_5298.isClosed()) {
         this.f_5298.close();
      }

      this.f_5297 = null;
      this.f_5296 = null;
      this.f_5295 = null;
      this.f_5298 = null;
      this.f_5299 = null;
      this.f_5304 = false;
      this.f_5303 = 0L;
      this.f_5302 = 0;
   }

   public void m_2111(ClientLevel var1, Vec3 var2, CommandEncoder var3) {
      if (this.f_5299 != var1) {
         this.close();
         this.f_5299 = var1;
      }

      this.m_2112();
      int var4 = Mth.floor(var2.x) - 64;
      int var5 = Mth.floor(var2.z) - 64;
      long var6 = System.nanoTime();
      boolean var8 = var6 >= this.f_5303;
      if (!this.f_5304 || var4 != this.f_5300 || var5 != this.f_5301 || var8) {
         this.f_5300 = var4;
         this.f_5301 = var5;

         for (int var9 = this.f_5301 >> 4; var9 <= this.f_5301 + 128 - 1 >> 4; var9++) {
            int var10 = Math.max(this.f_5301, var9 << 4);
            int var11 = Math.min(this.f_5301 + 128, var9 + 1 << 4);

            for (int var12 = this.f_5300 >> 4; var12 <= this.f_5300 + 128 - 1 >> 4; var12++) {
               int var13 = Math.max(this.f_5300, var12 << 4);
               int var14 = Math.min(this.f_5300 + 128, var12 + 1 << 4);
               boolean var15 = var1.hasChunkAt(this.f_5294.set(var12 << 4, 0, var9 << 4));

               for (int var16 = var10; var16 < var11; var16++) {
                  int var17 = var16 & 127;
                  boolean var18 = var8 && var17 / 32 == this.f_5302;

                  for (int var19 = var13; var19 < var14; var19++) {
                     int var20 = var19 & 127;
                     int var21 = var17 * 128 + var20;
                     if (!this.f_5304 || var18 || this.f_5292[var21] != var19 || this.f_5293[var21] != var16) {
                        int var22 = var15 ? Mth.clamp(var1.getHeight(Types.MOTION_BLOCKING, var19, var16) + f_5305, 0, f_5306) : f_5307;
                        this.f_5295.setPixel(var20, var17, f_5308 | (var22 & 0xFF) << 16 | var22 >> 8 << 8);
                        this.f_5292[var21] = var19;
                        this.f_5293[var21] = var16;
                     }
                  }
               }
            }
         }

         var3.writeToTexture(this.f_5296, this.f_5295);
         this.f_5304 = true;
         if (var8) {
            this.f_5302 = this.f_5302 + 1 & 3;
            this.f_5303 = var6 + f_5309;
         }
      }

      MemoryStack var25 = MemoryStack.stackPush();

      try {
         var3.writeToBuffer(
            this.f_5298.slice(),
            Std140Builder.onStack(var25, 16)
               .putVec4((float)(var2.x - Math.floor(var2.x / f_5310) * f_5311), (float)(var2.z - Math.floor(var2.z / f_5312) * f_5313), (float)var2.y, f_5314)
               .get()
         );
      } catch (Throwable var24) {
         if (var25 != null) {
            try {
               var25.close();
            } catch (Throwable var23) {
               var24.addSuppressed(var23);
            }
         }

         throw var24;
      }

      if (var25 != null) {
         var25.close();
      }
   }

   private void m_2112() {
      if (this.f_5295 == null) {
         Arrays.fill(this.f_5292, f_5317);
         Arrays.fill(this.f_5293, f_5318);
         this.f_5295 = new NativeImage(Format.RGBA, 128, 128, false);
         this.f_5296 = RenderSystem.getDevice().createTexture(() -> f_5321, 5, GpuFormat.RGBA8_UNORM, 128, 128, 1, 1);
         this.f_5297 = RenderSystem.getDevice().createTextureView(this.f_5296);
         this.f_5298 = RenderSystem.getDevice().createBuffer(() -> f_5320, 136, f_5319);
      }
   }

   public void m_2113(RenderPass var1) {
      var1.setUniform(f_5315, this.f_5298);
      var1.bindTexture(f_5316, this.f_5297, RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
   }
}
