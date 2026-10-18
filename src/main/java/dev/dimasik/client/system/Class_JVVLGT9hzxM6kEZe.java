package dev.dimasik.client.system;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import net.minecraft.client.renderer.Projection;
import net.minecraft.client.renderer.ProjectionMatrixBuffer;

public final class Class_JVVLGT9hzxM6kEZe implements AutoCloseable {
   private final Projection f_9661 = new Projection();
   private final ProjectionMatrixBuffer f_9662;
   private final float f_9663;
   private final float f_9664;
   private final boolean f_9665;

   public Class_JVVLGT9hzxM6kEZe(String var1, float var2, float var3, boolean var4) {
      this.f_9662 = new ProjectionMatrixBuffer(var1);
      this.f_9663 = var2;
      this.f_9664 = var3;
      this.f_9665 = var4;
   }

   @Override
   public void close() {
      this.f_9662.close();
   }

   public GpuBufferSlice m_3263(float var1, float var2) {
      this.f_9661.setupOrtho(this.f_9663, this.f_9664, var1, var2, this.f_9665);
      return this.f_9662.getBuffer(this.f_9661);
   }
}
