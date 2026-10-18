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
import dev.dimasik.client.module.combat.Aura;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_PoKta0VE7AdhY1En;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_wjdoxQGtI8mFyL6U;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import net.minecraft.client.Camera;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.network.protocol.game.ClientboundEntityEventPacket;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;

public class KillSpray extends Module {
   private static final Identifier f_10001 = Class_wHRRCm2tlLY7DN4I.m_9311(KillSpray.f_10049);
   private static final long f_10002 = 2500L;
   private final CheckboxSetting f_10003;
   private final SliderSetting f_10004;
   private final SliderSetting f_10005;
   private final List<KillSpray.NiE439ero3drRDrh> f_10006;
   private final List<KillSpray.yTpcHUbcMfDYQXAL> f_10007;
   private final Map<Integer, Long> f_10008;
   private final RenderPipeline f_10009;
   private final Class_gEPk7yDw6CwIte87<Class_wjdoxQGtI8mFyL6U> f_10010;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_10011;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_10012;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_10013;
   private static final String f_10014 = "KillSpray";
   private static final String f_10015 = "Спрей с логотипом Dimasik на месте килла";
   private static final String f_10016 = "Только игроки";
   private static final String f_10017 = "Размер";
   private static final float f_10018 = 1.2F;
   private static final float f_10019 = 0.5F;
   private static final float f_10020 = 2.5F;
   private static final float f_10021 = 0.05F;
   private static final String f_10022 = "Длительность";
   private static final float f_10023 = 5.0F;
   private static final float f_10024 = 12.0F;
   private static final float f_10025 = 0.5F;
   private static final String f_10026 = "dimasik/killspray";
   private static final String f_10027 = "dead_chams";
   private static final String f_10028 = "dead_chams";
   private static final String f_10029 = "Sampler0";
   private static final float f_10030 = 180.0F;
   private static final float f_10031 = 3.0F;
   private static final float f_10032 = 0.65F;
   private static final float f_10033 = 0.65F;
   private static final float f_10034 = 0.35F;
   private static final float f_10035 = 0.01F;
   private static final float f_10036 = 0.55F;
   private static final float f_10037 = 0.45F;
   private static final float f_10038 = 0.15F;
   private static final long f_10039 = 2500L;
   private static final long f_10040 = 2500L;
   private static final double f_10041 = 0.55;
   private static final double f_10042 = 0.9;
   private static final double f_10043 = 4.0;
   private static final float f_10044 = 1000.0F;
   private static final long f_10045 = 750L;
   private static final String f_10046 = "Sampler0";
   private static final String f_10047 = "killspray";
   private static final String f_10048 = "killSprayVertices";
   private static final String f_10049 = "killspray/logo";

   public KillSpray() {
      super(f_10014, f_10015, Category.RENDER);
      this.f_10003 = new CheckboxSetting(f_10016, true);
      this.f_10004 = new SliderSetting(f_10017, f_10018, f_10019, f_10020).m_828(f_10021);
      this.f_10005 = new SliderSetting(f_10022, f_10023, 1.0F, f_10024).m_828(f_10025);
      this.f_10006 = new ArrayList<>();
      this.f_10007 = new ArrayList<>();
      this.f_10008 = new HashMap<>();
      this.f_10009 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_10026)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_10027))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_10028))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2741(f_10029)
         .m_2722();
      this.f_10010 = this::m_3346;
      this.f_10011 = this::m_3341;
      this.f_10012 = this::m_3343;
      this.f_10013 = this::m_3349;
      this.m_795(this.f_10003, this.f_10004, this.f_10005);
   }

   private synchronized void m_3339(LivingEntity var1) {
      if (this.m_3347(var1)) {
         long var2 = System.currentTimeMillis();
         Long var4 = this.f_10008.get(var1.getId());
         if (var4 == null || var4 <= var2) {
            Vec3 var5 = var1.position().add(0.0, Math.max(var1.getBbHeight() * f_10041, f_10042), 0.0);

            for (KillSpray.NiE439ero3drRDrh var7 : this.f_10006) {
               if (var7.f_9995.distanceToSqr(var5) < f_10043) {
                  return;
               }
            }

            long var8 = (long)(this.f_10005.m_8768() * f_10044);
            this.f_10008.put(var1.getId(), var2 + var8 + f_10045);
            this.f_10006.clear();
            this.f_10006.add(new KillSpray.NiE439ero3drRDrh(var5, this.f_10004.m_8768(), var8));
         }
      }
   }

   private void m_3340(BufferBuilder var1) {
      MeshData var2 = var1.build();
      if (var2 != null) {
         GpuBuffer var3 = null;

         try {
            DrawState var4 = var2.drawState();
            int var5 = var4.indexCount();
            AutoStorageIndexBuffer var6 = RenderSystem.getSequentialBuffer(var4.primitiveTopology());
            GpuBuffer var7 = var6.getBuffer(var5);
            IndexType var8 = var6.type();
            var3 = RenderSystem.getDevice().createBuffer(() -> f_10048, 32, var2.vertexBuffer());
            RenderTarget var9 = f_11537.gameRenderer.mainRenderTarget();
            AbstractTexture var10 = f_11537.getTextureManager().getTexture(f_10001);
            CommandEncoder var11 = RenderSystem.getDevice().createCommandEncoder();
            RenderPass var12 = var11.createRenderPass(
               () -> f_10047, var9.getColorTextureView(), Optional.empty(), var9.getDepthTextureView(), OptionalDouble.empty()
            );

            try {
               RenderSystem.bindDefaultUniforms(var12);
               var12.setPipeline(this.f_10009);
               var12.bindTexture(f_10046, var10.getTextureView(), var10.getSampler());
               var12.setVertexBuffer(0, var3.slice());
               var12.setIndexBuffer(var7, var8);
               var12.drawIndexed(var5, 1, 0, 0, 0);
            } catch (Throwable var20) {
               if (var12 != null) {
                  try {
                     var12.close();
                  } catch (Throwable var19) {
                     var20.addSuppressed(var19);
                  }
               }

               throw var20;
            }

            if (var12 != null) {
               var12.close();
            }
         } finally {
            if (var3 != null) {
               var3.close();
            }

            var2.close();
         }
      }
   }

   private void m_3341(Class_XzpX8S5F5zd9jbuE var1) {
      if (var1.m_5619() instanceof ClientboundEntityEventPacket var2 && f_11537.level != null) {
         if (var2.getEntity(f_11537.level) instanceof LivingEntity var4 && this.m_3347(var4)) {
            if (var2.getEventId() == 3) {
               if (this.m_3345(var4)) {
                  f_11537.execute(() -> this.m_3339(var4));
               }
            }
         }
      }
   }

   private void m_3342(BufferBuilder var1, Matrix4f var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      var1.addVertex(var2, var3, var4, var5).setUv(var6, var7).setColor(1.0F, 1.0F, 1.0F, var8);
   }

   private void m_3343(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.level != null && f_11537.player != null) {
         try {
            Aura var2 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
            if (var2 != null && var2.m_776() && var2.m_1114() != null && var2.m_1114().isAlive()) {
               this.m_3353(var2.m_1114());
            }
         } catch (Throwable var8) {
         }

         long var9 = System.currentTimeMillis();
         Iterator var4 = this.f_10007.iterator();

         while (var4.hasNext()) {
            KillSpray.yTpcHUbcMfDYQXAL var5 = (KillSpray.yTpcHUbcMfDYQXAL)var4.next();
            if (!var5.m_3338(var9)) {
               var4.remove();
            } else {
               LivingEntity var6 = var5.f_9999;
               boolean var7 = f_11537.level.getEntity(var6.getId()) == null;
               if (var6.getHealth() <= 0.0F || !var6.isAlive() || var7) {
                  this.m_3339(var6);
               }
            }
         }

         this.f_10006.removeIf(var2x -> var9 - var2x.f_9998 > var2x.f_9997);
         this.f_10008.entrySet().removeIf(var2x -> var2x.getValue() < var9);
      } else {
         this.f_10006.clear();
         this.f_10007.clear();
         this.f_10008.clear();
      }
   }

   private boolean m_3345(LivingEntity var1) {
      long var2 = System.currentTimeMillis();

      for (KillSpray.yTpcHUbcMfDYQXAL var5 : this.f_10007) {
         if (var5.f_9999.getId() == var1.getId() && var5.m_3338(var2)) {
            return true;
         }
      }

      return false;
   }

   private void m_3346(Class_wjdoxQGtI8mFyL6U var1) {
      if (var1.m_9372() == Class_wjdoxQGtI8mFyL6U.Class_327mRdjAqNoPaemJ.POST && var1.m_9371() == f_11537.player) {
         if (var1.m_9370() instanceof LivingEntity var2 && var2.isAlive()) {
            this.m_3353(var2);
         }
      }
   }

   private boolean m_3347(LivingEntity var1) {
      if (var1 == null || var1 == f_11537.player) {
         return false;
      } else {
         return this.f_10003.m_8768() ? var1 instanceof Player : true;
      }
   }

   private void m_3349(Class_TZhU50s8XmBQCMP5 var1) {
      if (!this.f_10006.isEmpty() && f_11537.gameRenderer != null) {
         Camera var2 = f_11537.gameRenderer.mainCamera();
         long var3 = System.currentTimeMillis();

         for (KillSpray.NiE439ero3drRDrh var6 : this.f_10006) {
            float var7 = (float)(var3 - var6.f_9998);
            if (!(var7 < 0.0F) && !(var7 > (float)var6.f_9997)) {
               float var8 = var7 / (float)var6.f_9997;
               float var9 = Mth.clamp(var7 / f_10030, 0.0F, 1.0F);
               var9 = var9 * var9 * (f_10031 - 2.0F * var9);
               float var10 = var8 > f_10032 ? 1.0F - (var8 - f_10033) / f_10034 : 1.0F;
               float var11 = Mth.clamp(var9 * var10, 0.0F, 1.0F);
               if (!(var11 <= f_10035)) {
                  float var12 = var6.f_9996 * (f_10036 + f_10037 * var9);
                  Vec3 var13 = var6.f_9995;
                  PoseStack var14 = var1.m_5006();
                  var14.pushPose();
                  var14.translate(var13.x - var1.m_5010().x, var13.y - var1.m_5010().y, var13.z - var1.m_5010().z);
                  var14.mulPose(Axis.YP.rotationDegrees(-var2.yRot()));
                  var14.translate(0.0F, f_10038, 0.0F);
                  Matrix4f var15 = var14.last().pose();
                  BufferBuilder var16 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
                  float var17 = var12 / 2.0F;
                  this.m_3342(var16, var15, -var17, -var17, 0.0F, 0.0F, 1.0F, var11);
                  this.m_3342(var16, var15, -var17, var17, 0.0F, 0.0F, 0.0F, var11);
                  this.m_3342(var16, var15, var17, var17, 0.0F, 1.0F, 0.0F, var11);
                  this.m_3342(var16, var15, var17, -var17, 0.0F, 1.0F, 1.0F, var11);
                  var14.popPose();
                  this.m_3340(var16);
               }
            }
         }
      }
   }

   private void m_3353(LivingEntity var1) {
      if (this.m_3347(var1)) {
         long var2 = System.currentTimeMillis();

         for (KillSpray.yTpcHUbcMfDYQXAL var5 : this.f_10007) {
            if (var5.f_9999.getId() == var1.getId()) {
               var5.f_10000 = var2 + f_10039;
               return;
            }
         }

         this.f_10007.add(new KillSpray.yTpcHUbcMfDYQXAL(var1, var2 + f_10040));
      }
   }

   @Override
   public void m_732() {
      this.f_10006.clear();
      this.f_10007.clear();
      this.f_10008.clear();
   }

   private static final class NiE439ero3drRDrh {
      public final Vec3 f_9995;
      public final float f_9996;
      public final long f_9997;
      public final long f_9998 = System.currentTimeMillis();

      public NiE439ero3drRDrh(Vec3 var1, float var2, long var3) {
         this.f_9995 = var1;
         this.f_9996 = var2;
         this.f_9997 = var3;
      }
   }

   private static final class yTpcHUbcMfDYQXAL {
      public final LivingEntity f_9999;
      public long f_10000;

      public boolean m_3338(long var1) {
         return var1 <= this.f_10000 && this.f_9999 != null;
      }

      public yTpcHUbcMfDYQXAL(LivingEntity var1, long var2) {
         this.f_9999 = var1;
         this.f_10000 = var2;
      }
   }
}
