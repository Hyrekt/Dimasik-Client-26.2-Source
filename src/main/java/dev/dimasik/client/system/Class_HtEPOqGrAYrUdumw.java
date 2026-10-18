package dev.dimasik.client.system;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;

public final class Class_HtEPOqGrAYrUdumw {
   private static final long f_8249 = 4L;

   private Class_HtEPOqGrAYrUdumw() {
   }

   public static GpuBufferSlice m_2944(ByteBuffer var0, int var1) {
      GpuDevice var2 = RenderSystem.getDevice();
      return var2.createCommandEncoder().transientMemory().uploadStaging(var0, f_8249, 32, var0.remaining(), var1);
   }

   public static GpuBufferSlice m_2945(ByteBuffer var0) {
      GpuDevice var1 = RenderSystem.getDevice();
      long var2 = var1.getDeviceInfo().limits().minUniformOffsetAlignment();
      return var1.createCommandEncoder().transientMemory().uploadStaging(var0, var2, 128);
   }
}
