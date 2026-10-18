package dev.dimasik.client.system;

import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.ByteBufferBuilder;
import com.mojang.blaze3d.vertex.VertexFormat;

public final class Class_PoKta0VE7AdhY1En implements AutoCloseable {
   private final ByteBufferBuilder f_11800;

   public void m_4160() {
      this.f_11800.clear();
   }

   @Override
   public void close() {
      this.f_11800.close();
   }

   public static Class_PoKta0VE7AdhY1En m_4161() {
      return Class_PoKta0VE7AdhY1En.YCcnTUTZivpF9col.f_11798;
   }

   public Class_PoKta0VE7AdhY1En(int var1) {
      this.f_11800 = new ByteBufferBuilder(var1);
   }

   public BufferBuilder m_4162(PrimitiveTopology var1, VertexFormat var2) {
      return new BufferBuilder(this.f_11800, var1, var2);
   }

   private static final class YCcnTUTZivpF9col {
      public static final Class_PoKta0VE7AdhY1En f_11798 = new Class_PoKta0VE7AdhY1En(Class_PoKta0VE7AdhY1En.YCcnTUTZivpF9col.f_11799);
      public static final int f_11799 = 786432;

      public YCcnTUTZivpF9col() {
      }
   }
}
