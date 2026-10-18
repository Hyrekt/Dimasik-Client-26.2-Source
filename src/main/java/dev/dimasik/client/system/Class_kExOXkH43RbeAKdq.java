package dev.dimasik.client.system;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.shaders.ShaderType;
import com.mojang.blaze3d.systems.RenderSystem;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.render.BetterMinecraft;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.Identifier;
import net.minecraft.world.phys.Vec3;
import org.lwjgl.system.MemoryStack;

public final class Class_kExOXkH43RbeAKdq implements AutoCloseable {
   private static final String f_24806 = "DimasikChunkOffsets";
   public static final int f_24807 = 256;
   private static final int f_24808 = 4096;
   private final Map<Class_kExOXkH43RbeAKdq.uQ9fNUWc63j0tkTA, GpuBufferSlice> f_24809 = new IdentityHashMap<>();
   private final List<GpuBuffer> f_24810 = new ArrayList<>();
   private GpuBuffer f_24811;
   private int f_24812;
   private BetterMinecraft f_24813;
   private static final String f_24814 = "DimasikChunkOffsets";
   private static final String f_24815 = "OpenGL";
   private static final long f_24816 = 4096L;
   private static final String f_24817 = "sodium";
   private static final String f_24818 = "blocks/block_layer_opaque";
   private static final String f_24819 = "vec3 position = _vert_position + translation;";
   private static final String f_24820 = "void main() {";
   private static final String f_24821 = "Unrecognized Sodium terrain shader for chunk animation";
   private static final String f_24822 = "vec3 position = _vert_position + translation + dimasik_Offsets[_draw_id].xyz;";
   private static final String f_24823 = "Dimasik animated chunk offsets";
   private static final String f_24824 = "Dimasik chunk zero offsets";

   public void m_7410() {
      this.f_24809.clear();
      this.f_24812 = 0;
      this.f_24813 = null;
   }

   public void m_7411() {
      if (this.f_24811 == null || this.f_24811.isClosed()) {
         MemoryStack var1 = MemoryStack.stackPush();

         try {
            this.f_24811 = RenderSystem.getDevice().createBuffer(() -> f_24824, 128, var1.calloc(4096));
         } catch (Throwable var5) {
            if (var1 != null) {
               try {
                  var1.close();
               } catch (Throwable var4) {
                  var5.addSuppressed(var4);
               }
            }

            throw var5;
         }

         if (var1 != null) {
            var1.close();
         }
      }

      BetterMinecraft var6 = m_7417();
      BetterMinecraft var2 = var6 != null && var6.m_776() && var6.f_16480.m_8768() ? var6 : null;
      if (this.f_24813 != var2) {
         this.f_24809.clear();
      }

      this.f_24813 = var2;
      if (var2 == null && var6 != null) {
         var6.f_16484.m_4615();
      }
   }

   public static String m_7412(Identifier var0, ShaderType var1, String var2) {
      if (var2 != null && var1 == ShaderType.VERTEX && var0.getNamespace().equals(f_24817) && var0.getPath().equals(f_24818)) {
         String var3 = f_24819;
         String var4 = f_24820;
         if (var2.contains(var3) && var2.contains(var4)) {
            return var2.replace(var4, var4 + "").replace(var3, f_24822);
         } else {
            throw new IllegalStateException(f_24821);
         }
      } else {
         return var2;
      }
   }

   public GpuBufferSlice m_7414(Class_kExOXkH43RbeAKdq.uQ9fNUWc63j0tkTA var1) {
      return this.f_24813 == null ? this.f_24811.slice() : this.f_24809.computeIfAbsent(var1, this::m_7416);
   }

   private GpuBufferSlice m_7416(Class_kExOXkH43RbeAKdq.uQ9fNUWc63j0tkTA var1) {
      MemoryStack var2 = MemoryStack.stackPush();

      GpuBufferSlice var15;
      label85: {
         label86: {
            GpuBufferSlice var16;
            try {
               ByteBuffer var3 = var2.calloc(4096);
               boolean var4 = false;

               for (Class_kExOXkH43RbeAKdq.cpNrSXK4DbPFap8e var8 : var1.dimasik$sections()) {
                  if (var8 != null && var8.dimasik$hasMesh()) {
                     Vec3 var9 = this.f_24813.f_16484.m_4620(var8, var8.dimasik$origin(), this.f_24813);
                     if (var9.x != 0.0 || var9.y != 0.0 || var9.z != 0.0) {
                        int var10 = var8.dimasik$index() * 16;
                        var3.putFloat(var10, (float)var9.x);
                        var3.putFloat(var10 + 4, (float)var9.y);
                        var3.putFloat(var10 + 8, (float)var9.z);
                        var4 = true;
                     }
                  }
               }

               if (!var4) {
                  var15 = this.f_24811.slice();
                  break label85;
               }

               if (!f_24815.equals(RenderSystem.getDevice().getDeviceInfo().backendName())) {
                  var15 = Class_HtEPOqGrAYrUdumw.m_2945(var3);
                  break label86;
               }

               if (this.f_24812 == this.f_24810.size()) {
                  this.f_24810.add(RenderSystem.getDevice().createBuffer(() -> f_24823, 136, f_24816));
               }

               GpuBuffer var13 = this.f_24810.get(this.f_24812++);
               RenderSystem.getDevice().createCommandEncoder().writeToBuffer(var13.slice(), var3);
               var16 = var13.slice();
            } catch (Throwable var12) {
               if (var2 != null) {
                  try {
                     var2.close();
                  } catch (Throwable var11) {
                     var12.addSuppressed(var11);
                  }
               }

               throw var12;
            }

            if (var2 != null) {
               var2.close();
            }

            return var16;
         }

         if (var2 != null) {
            var2.close();
         }

         return var15;
      }

      if (var2 != null) {
         var2.close();
      }

      return var15;
   }

   public static BetterMinecraft m_7417() {
      DimasikClient var0 = DimasikClient.m_9057();
      return var0 != null && var0.m_9049() != null && var0.m_9049().m_2801() != null ? var0.m_9049().m_2801().m_3478() : null;
   }

   public static String m_7418() {
      return f_24814;
   }

   @Override
   public void close() {
      this.m_7410();
      if (this.f_24811 != null && !this.f_24811.isClosed()) {
         this.f_24811.close();
      }

      this.f_24811 = null;

      for (GpuBuffer var2 : this.f_24810) {
         if (!var2.isClosed()) {
            var2.close();
         }
      }

      this.f_24810.clear();
   }

   public interface Class_6RZFeINBnYKmF9rg {
      void dimasik$closeChunkAnimation();
   }

   public interface cpNrSXK4DbPFap8e {
      int dimasik$index();

      boolean dimasik$hasMesh();

      BlockPos dimasik$origin();
   }

   public interface uQ9fNUWc63j0tkTA {
      Class_kExOXkH43RbeAKdq.cpNrSXK4DbPFap8e[] dimasik$sections();
   }
}
