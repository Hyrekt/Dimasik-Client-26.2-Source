package dev.dimasik.client.system;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexConsumer;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.renderer.StagedVertexBuffer;
import net.minecraft.client.renderer.StagedVertexBuffer.Draw;
import net.minecraft.client.renderer.StagedVertexBuffer.ExecuteInfo;
import net.minecraft.client.renderer.rendertype.PreparedRenderType;
import net.minecraft.client.renderer.rendertype.RenderType;

public interface Class_1x5Fn2q4kmtD2Zmq {
   VertexConsumer m_881(RenderType var1);

   static Class_1x5Fn2q4kmtD2Zmq.EGrtL3OkTEhswyKz m_885() {
      return Class_1x5Fn2q4kmtD2Zmq.Ac6ztro4H4QJgd8Y.f_639;
   }

   final class Ac6ztro4H4QJgd8Y {
      public static final Class_1x5Fn2q4kmtD2Zmq.EGrtL3OkTEhswyKz f_639 = new Class_1x5Fn2q4kmtD2Zmq.EGrtL3OkTEhswyKz();
   }

   final class EGrtL3OkTEhswyKz implements AutoCloseable, Class_1x5Fn2q4kmtD2Zmq {
      public final StagedVertexBuffer f_640;
      public final List<Draw> f_641;
      public final List<PreparedRenderType> f_642;
      public RenderType f_643;
      public Draw f_644;
      public static final int f_645 = 786432;
      public static final String f_646 = "Dimasik geometry";

      @Override
      public VertexConsumer m_881(RenderType var1) {
         if (this.f_643 != var1 || this.f_644 == null || !var1.canConsolidateConsecutiveGeometry()) {
            this.f_643 = var1;
            this.f_644 = this.f_640
               .appendDraw(var1.format(), var1.primitiveTopology(), var1.sortOnUpload() ? RenderSystem.getProjectionType().vertexSorting() : null);
            this.f_641.add(this.f_644);
            this.f_642.add(var1.prepare());
         }

         return this.f_640.getVertexBuilder(this.f_644);
      }

      public void m_882(RenderType var1) {
         this.m_884();
      }

      public void m_883() {
         this.m_884();
         this.f_640.endFrame();
      }

      public EGrtL3OkTEhswyKz() {
         this.f_640 = new StagedVertexBuffer(() -> f_646, f_645);
         this.f_641 = new ArrayList<>();
         this.f_642 = new ArrayList<>();
      }

      @Override
      public void close() {
         this.f_640.close();
         this.f_641.clear();
         this.f_642.clear();
         this.f_643 = null;
         this.f_644 = null;
      }

      public void m_884() {
         if (!this.f_641.isEmpty()) {
            try {
               this.f_640.upload();

               for (int var1 = 0; var1 < this.f_641.size(); var1++) {
                  ExecuteInfo var2 = this.f_640.getExecuteInfo(this.f_641.get(var1));
                  if (var2 != null) {
                     this.f_642.get(var1).drawFromBuffer(var2);
                  }
               }
            } finally {
               this.f_640.endDraw();
               this.f_641.clear();
               this.f_642.clear();
               this.f_643 = null;
               this.f_644 = null;
            }
         }
      }
   }
}
