package dev.dimasik.client.system;

import com.mojang.blaze3d.IndexType;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.AutoStorageIndexBuffer;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.MeshData;
import com.mojang.blaze3d.vertex.MeshData.DrawState;
import java.nio.ByteBuffer;
import net.minecraft.client.Minecraft;
import org.joml.Vector4f;
import org.joml.Vector4i;
import org.lwjgl.system.MemoryStack;

public interface Class_b8v0o2NnCtANmOp9 {
   default GpuBufferSlice m_5993(MemoryStack var1, Vector4i var2) {
      Vector4f var3 = Class_BftdentXEtGbugJw.m_2298(var2.x);
      Vector4f var4 = Class_BftdentXEtGbugJw.m_2298(var2.y);
      Vector4f var5 = Class_BftdentXEtGbugJw.m_2298(var2.z);
      Vector4f var6 = Class_BftdentXEtGbugJw.m_2298(var2.w);
      var3.w = var3.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / 255.0F);
      var4.w = var4.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / 255.0F);
      var5.w = var5.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / 255.0F);
      var6.w = var6.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / 255.0F);
      ByteBuffer var7 = Std140Builder.onStack(var1, 64).putVec4(var3).putVec4(var4).putVec4(var5).putVec4(var6).get();
      return Class_HtEPOqGrAYrUdumw.m_2945(var7);
   }

   default boolean m_5994(float var1, float var2, float var3, float var4) {
      if (!Class_Ssh31B3ljfKeWsvS.m_4812()) {
         return false;
      }

      float var5 = Class_Ssh31B3ljfKeWsvS.m_4834().x;
      float var6 = Class_Ssh31B3ljfKeWsvS.m_4834().y;
      float var7 = Class_Ssh31B3ljfKeWsvS.m_4834().w;
      float var8 = Class_Ssh31B3ljfKeWsvS.m_4834().z;
      boolean var9 = var2 + var4 > var6 && var2 < var6 + var7;
      boolean var10 = var1 + var3 > var5 && var1 < var5 + var8;
      return !var9 || !var10;
   }

   default GpuBufferSlice m_5995(Vector4f var1, MemoryStack var2) {
      float var3 = var1.x;
      float var4 = var1.y;
      float var5 = var1.x + var1.z;
      float var6 = var1.y + var1.w;
      Vector4f var7 = Class_Ssh31B3ljfKeWsvS.m_4834();
      float var8 = var7.x;
      float var9 = var7.y;
      float var10 = var7.x + var7.z;
      float var11 = var7.y + var7.w;
      float var12 = Math.max(var3, var8);
      float var13 = Math.max(var4, var9);
      float var14 = Math.min(var5, var10);
      float var15 = Math.min(var6, var11);
      float var16 = var1.z != 0.0F ? (var12 - var3) / var1.z : 0.0F;
      float var17 = var1.w != 0.0F ? (var13 - var4) / var1.w : 0.0F;
      float var18 = var1.z != 0.0F ? (var14 - var12) / var1.z : 0.0F;
      float var19 = var1.w != 0.0F ? (var15 - var13) / var1.w : 0.0F;
      var17 = 1.0F - (var17 + var19);
      ByteBuffer var20 = Std140Builder.onStack(var2, 32)
         .putVec4(new Vector4f(var17, var16, var19, var18))
         .putFloat(Class_Ssh31B3ljfKeWsvS.m_4812() ? 1.0F : 0.0F)
         .get();
      return Class_HtEPOqGrAYrUdumw.m_2945(var20);
   }

   default Vector4f m_5996(Vector4f var1) {
      float var2 = var1.x;
      float var3 = var1.y;
      float var4 = var1.x + var1.z;
      float var5 = var1.y + var1.w;
      Vector4f var6 = Class_Ssh31B3ljfKeWsvS.m_4834();
      float var7 = var6.x;
      float var8 = var6.y;
      float var9 = var6.x + var6.z;
      float var10 = var6.y + var6.w;
      float var11 = Math.max(var2, var7);
      float var12 = Math.max(var3, var8);
      float var13 = Math.min(var4, var9);
      float var14 = Math.min(var5, var10);
      float var15 = var1.z != 0.0F ? (var11 - var2) / var1.z : 0.0F;
      float var16 = var1.w != 0.0F ? (var12 - var3) / var1.w : 0.0F;
      float var17 = var1.z != 0.0F ? (var13 - var11) / var1.z : 0.0F;
      float var18 = var1.w != 0.0F ? (var14 - var12) / var1.w : 0.0F;
      var16 = 1.0F - (var16 + var18);
      return new Vector4f(var16, var15, var18, var17);
   }

   default boolean m_5997(Vector4i var1) {
      Vector4f var2 = Class_BftdentXEtGbugJw.m_2298(var1.x);
      Vector4f var3 = Class_BftdentXEtGbugJw.m_2298(var1.y);
      Vector4f var4 = Class_BftdentXEtGbugJw.m_2298(var1.z);
      Vector4f var5 = Class_BftdentXEtGbugJw.m_2298(var1.w);
      var2.w = var2.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / 255.0F);
      var3.w = var3.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / 255.0F);
      var4.w = var4.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / 255.0F);
      var5.w = var5.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / 255.0F);
      return var2.w == 0.0F && var3.w == 0.0F && var4.w == 0.0F && var5.w == 0.0F;
   }

   default void m_5998(BufferBuilder var1, RenderPass var2, RenderPipeline var3) {
      RenderPass var4 = var2;

      label70: {
         try {
            MeshData var5 = var1.build();

            label72: {
               try {
                  if (var5 != null) {
                     DrawState var6 = var5.drawState();
                     int var7 = var6.indexCount();
                     AutoStorageIndexBuffer var8 = RenderSystem.getSequentialBuffer(var6.primitiveTopology());
                     GpuBuffer var9 = var8.getBuffer(var7);
                     IndexType var10 = var8.type();
                     GpuBufferSlice var11 = Class_HtEPOqGrAYrUdumw.m_2944(var5.vertexBuffer(), var6.format().getVertexSize());
                     var2.setPipeline(var3);
                     var2.setVertexBuffer(0, var11);
                     var2.setIndexBuffer(var9, var10);
                     var2.drawIndexed(var7, 1, 0, 0, 0);
                     break label72;
                  }
               } catch (Throwable var14) {
                  if (var5 != null) {
                     try {
                        var5.close();
                     } catch (Throwable var13) {
                        var14.addSuppressed(var13);
                     }
                  }

                  throw var14;
               }

               if (var5 != null) {
                  var5.close();
               }
               break label70;
            }

            if (var5 != null) {
               var5.close();
            }
         } catch (Throwable var15) {
            if (var4 != null) {
               try {
                  var4.close();
               } catch (Throwable var12) {
                  var15.addSuppressed(var12);
               }
            }

            throw var15;
         }

         if (var4 != null) {
            var4.close();
         }

         return;
      }

      if (var4 != null) {
         var4.close();
      }
   }

   default void m_5999(BufferBuilder var1, float var2, float var3, float var4, float var5) {
      float var6 = 2.0F / Minecraft.getInstance().getWindow().getScreenWidth() * var4;
      float var7 = 2.0F / Minecraft.getInstance().getWindow().getScreenHeight() * var5;
      float var8 = -1.0F + var2 * 2.0F / Minecraft.getInstance().getWindow().getScreenWidth();
      float var9 = 1.0F - var3 * 2.0F / Minecraft.getInstance().getWindow().getScreenHeight() - var7;
      var1.addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var8, var9, 0.0F);
      var1.addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var8 + var6, var9, 0.0F);
      var1.addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var8 + var6, var9 + var7, 0.0F);
      var1.addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var8, var9 + var7, 0.0F);
   }
}
