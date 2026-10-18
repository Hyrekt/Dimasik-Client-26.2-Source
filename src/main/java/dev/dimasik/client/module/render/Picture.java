package dev.dimasik.client.module.render;

import com.mojang.blaze3d.IndexType;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.AutoStorageIndexBuffer;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.MeshData;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.MeshData.DrawState;
import com.mojang.math.Axis;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.BooleanSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_PoKta0VE7AdhY1En;
import dev.dimasik.client.system.Class_S6axnpVTuH2ACFYf;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_b8v0o2NnCtANmOp9;
import dev.dimasik.client.system.Class_ftHu9o3WzCU3Adxm;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;

public class Picture extends Module implements Class_b8v0o2NnCtANmOp9 {
   private static final float f_32695 = 0.7F;
   private static final float f_32696 = 0.45F;
   private static final Class_S6axnpVTuH2ACFYf.Zq8mBegeS5jtnHjK f_32697 = new Class_S6axnpVTuH2ACFYf.Zq8mBegeS5jtnHjK(
      Identifier.fromNamespaceAndPath(Picture.f_32733, Picture.f_32734), 1.0F
   );
   private static final Class_S6axnpVTuH2ACFYf.Zq8mBegeS5jtnHjK f_32698 = new Class_S6axnpVTuH2ACFYf.Zq8mBegeS5jtnHjK(
      Identifier.fromNamespaceAndPath(Picture.f_32735, Picture.f_32736), Picture.f_32737
   );
   private final Class_2ZaVm8TGDJ68TnJB f_32699;
   private final Class_2ZaVm8TGDJ68TnJB f_32700;
   private final Map<String, Class_2ZaVm8TGDJ68TnJB> f_32701;
   private final MultiChoiceSetting f_32702;
   private final MultiChoiceSetting f_32703;
   private final BooleanSetting f_32704;
   private final RenderPipeline f_32705;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_32706;
   private static final String f_32707 = "Picture";
   private static final String f_32708 = "Рисует картинку над головой";
   private static final String f_32709 = "Сюся";
   private static final String f_32710 = "Могучий Орёл";
   private static final String f_32711 = "Картинка";
   private static final String f_32712 = "Цель";
   private static final String f_32713 = "На себя";
   private static final String f_32714 = "На всех";
   private static final String f_32715 = "На друзей";
   private static final String f_32716 = "Загрузить свои";
   private static final String f_32717 = "dimasik/picture";
   private static final String f_32718 = "dead_chams";
   private static final String f_32719 = "dead_chams";
   private static final String f_32720 = "Sampler0";
   private static final String f_32721 = "На себя";
   private static final String f_32722 = "На друзей";
   private static final float f_32723 = 0.7F;
   private static final float f_32724 = 90.0F;
   private static final float f_32725 = 90.0F;
   private static final float f_32726 = 0.45F;
   private static final String f_32727 = "explorer.exe";
   private static final String f_32728 = "Сюся";
   private static final String f_32729 = "Могучий Орёл";
   private static final String f_32730 = "Sampler0";
   private static final String f_32731 = "picture";
   private static final String f_32732 = "pictureVertices";
   private static final String f_32733 = "dimasik";
   private static final String f_32734 = "textures/test/soca.png";
   private static final String f_32735 = "dimasik";
   private static final String f_32736 = "textures/picture/mighty_eagle.png";
   private static final float f_32737 = 1.9543568F;

   private Class_S6axnpVTuH2ACFYf.Zq8mBegeS5jtnHjK m_9106() {
      if (this.f_32702.m_7568(f_32728)) {
         return f_32697;
      }

      if (this.f_32702.m_7568(f_32729)) {
         return f_32698;
      }

      Class_2ZaVm8TGDJ68TnJB var1 = this.f_32702.m_7564();
      Class_S6axnpVTuH2ACFYf.Zq8mBegeS5jtnHjK var2 = var1 == null ? null : Class_S6axnpVTuH2ACFYf.m_4689(var1.m_1181());
      return var2 != null ? var2 : f_32697;
   }

   public Picture() {
      super(f_32707, f_32708, Category.RENDER);
      this.f_32699 = new Class_2ZaVm8TGDJ68TnJB(f_32709);
      this.f_32700 = new Class_2ZaVm8TGDJ68TnJB(f_32710);
      this.f_32701 = new LinkedHashMap<>();
      this.f_32702 = new MultiChoiceSetting(f_32711, this.f_32699, this.f_32700);
      this.f_32703 = new MultiChoiceSetting(
         f_32712, new Class_2ZaVm8TGDJ68TnJB(f_32713), new Class_2ZaVm8TGDJ68TnJB(f_32714), new Class_2ZaVm8TGDJ68TnJB(f_32715)
      );
      this.f_32704 = new BooleanSetting(f_32716).m_1474(this::m_9115).m_1472();
      this.f_32705 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_32717)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_32718))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_32719))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2741(f_32720)
         .m_2722();
      this.f_32706 = this::m_9113;
      this.m_795(this.f_32702, this.f_32703, this.f_32704);
      Class_S6axnpVTuH2ACFYf.m_4688();
      Class_S6axnpVTuH2ACFYf.m_4681(false, this::m_9108);
   }

   private void m_9108() {
      ArrayList var1 = new ArrayList<>(List.of(this.f_32699, this.f_32700));
      HashSet var2 = new HashSet<>(Class_S6axnpVTuH2ACFYf.m_4680());
      this.f_32701.keySet().removeIf(var1x -> !var2.contains(var1x));

      for (String var4 : Class_S6axnpVTuH2ACFYf.m_4680()) {
         var1.add(this.f_32701.computeIfAbsent(var4, Class_2ZaVm8TGDJ68TnJB::new));
      }

      this.f_32702.m_7563(var1);
   }

   private void m_9109(Class_TZhU50s8XmBQCMP5 var1, Class_S6axnpVTuH2ACFYf.Zq8mBegeS5jtnHjK var2, Player var3, float var4) {
      Vec3 var5 = new Vec3(Mth.lerp(var4, var3.xo, var3.getX()), Mth.lerp(var4, var3.yo, var3.getY()), Mth.lerp(var4, var3.zo, var3.getZ()));
      float var6 = Mth.rotLerp(var4, var3.yBodyRotO, var3.yBodyRot);
      float var7 = Mth.lerp(var4, var3.xRotO, var3.getXRot());
      boolean var8 = var3.isFallFlying() || var3.isVisuallySwimming() || var3.isVisuallyCrawling();
      float var9 = f_32723;
      float var10 = var9 / var2.aspectRatio();
      float var11 = var8 ? var3.getDimensions(Pose.STANDING).height() : var3.getBbHeight();
      PoseStack var12 = var1.m_5006();
      var12.pushPose();
      var12.translate(var5.x - var1.m_5010().x, var5.y - var1.m_5010().y, var5.z - var1.m_5010().z);
      var12.mulPose(Axis.YP.rotationDegrees(-var6));
      if (var8) {
         var12.mulPose(Axis.XP.rotationDegrees(var7 + f_32724));
      }

      var12.translate(0.0F, var11, 0.0F);
      if (var8) {
         var12.mulPose(Axis.XP.rotationDegrees(-var7 - f_32725));
      }

      var12.translate(0.0F, f_32726 + var10 / 2.0F, 0.0F);
      Matrix4f var13 = var12.last().pose();
      BufferBuilder var14 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
      float var15 = var9 / 2.0F;
      float var16 = var10 / 2.0F;
      this.m_9116(var14, var13, -var15, -var16, 0.0F, 0.0F, 1.0F);
      this.m_9116(var14, var13, -var15, var16, 0.0F, 0.0F, 0.0F);
      this.m_9116(var14, var13, var15, var16, 0.0F, 1.0F, 0.0F);
      this.m_9116(var14, var13, var15, -var16, 0.0F, 1.0F, 1.0F);
      var12.popPose();
      this.m_9114(var14, var2.texture());
   }

   private boolean m_9111(Player var1) {
      if (this.f_32703.m_7568(f_32721)) {
         return var1 == f_11537.player;
      } else {
         return this.f_32703.m_7568(f_32722) ? DimasikClient.m_9057().m_9049().m_2804().m_2877(var1.getGameProfile().name()) : true;
      }
   }

   private void m_9113(Class_TZhU50s8XmBQCMP5 var1) {
      if (f_11537.player != null && f_11537.level != null) {
         Class_S6axnpVTuH2ACFYf.Zq8mBegeS5jtnHjK var2 = this.m_9106();
         float var3 = var1.m_5004();

         for (Player var5 : f_11537.level.players()) {
            if (this.m_9111(var5)) {
               this.m_9109(var1, var2, var5, var3);
            }
         }
      }
   }

   @Override
   public void m_778() {
      Class_S6axnpVTuH2ACFYf.m_4681(false, this::m_9108);
   }

   private void m_9114(BufferBuilder var1, Identifier var2) {
      MeshData var3 = var1.build();
      if (var3 != null) {
         GpuBuffer var4 = null;

         try {
            DrawState var5 = var3.drawState();
            int var6 = var5.indexCount();
            AutoStorageIndexBuffer var7 = RenderSystem.getSequentialBuffer(var5.primitiveTopology());
            GpuBuffer var8 = var7.getBuffer(var6);
            IndexType var9 = var7.type();
            var4 = RenderSystem.getDevice().createBuffer(() -> f_32732, 32, var3.vertexBuffer());
            RenderTarget var10 = f_11537.gameRenderer.mainRenderTarget();
            AbstractTexture var11 = f_11537.getTextureManager().getTexture(var2);
            CommandEncoder var12 = RenderSystem.getDevice().createCommandEncoder();
            RenderPass var13 = var12.createRenderPass(
               () -> f_32731, var10.getColorTextureView(), Optional.empty(), var10.getDepthTextureView(), OptionalDouble.empty()
            );

            try {
               RenderSystem.bindDefaultUniforms(var13);
               var13.setPipeline(this.f_32705);
               var13.bindTexture(f_32730, var11.getTextureView(), var11.getSampler());
               var13.setVertexBuffer(0, var4.slice());
               var13.setIndexBuffer(var8, var9);
               var13.drawIndexed(var6, 1, 0, 0, 0);
            } catch (Throwable var21) {
               if (var13 != null) {
                  try {
                     var13.close();
                  } catch (Throwable var20) {
                     var21.addSuppressed(var20);
                  }
               }

               throw var21;
            }

            if (var13 != null) {
               var13.close();
            }
         } finally {
            if (var4 != null) {
               var4.close();
            }

            var3.close();
         }
      }
   }

   private void m_9115() {
      try {
         Class_S6axnpVTuH2ACFYf.m_4688();
         new ProcessBuilder(f_32727, Class_S6axnpVTuH2ACFYf.f_13216.getAbsolutePath()).start();
         Class_S6axnpVTuH2ACFYf.m_4681(true, this::m_9108);
      } catch (Exception var3) {
         String var2 = var3.getMessage() != null ? var3.getMessage() : var3.getClass().getSimpleName();
         if (f_11537.player != null) {
            Class_ftHu9o3WzCU3Adxm.m_6731(var2 + "");
            Class_ftHu9o3WzCU3Adxm.m_6731(Class_S6axnpVTuH2ACFYf.f_13216.getAbsolutePath() + "");
         }
      }
   }

   private void m_9116(BufferBuilder var1, Matrix4f var2, float var3, float var4, float var5, float var6, float var7) {
      var1.addVertex(var2, var3, var4, var5).setUv(var6, var7).setColor(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
