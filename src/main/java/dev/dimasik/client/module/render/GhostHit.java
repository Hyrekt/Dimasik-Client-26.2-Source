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
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ColorSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_1x5Fn2q4kmtD2Zmq;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_PoKta0VE7AdhY1En;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_wjdoxQGtI8mFyL6U;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import dev.dimasik.mixin.RenderTypeMixin;
import java.awt.Color;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.SubmitNodeStorage;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.client.renderer.rendertype.RenderSetup;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.state.level.LevelRenderState;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.network.protocol.game.ClientboundEntityEventPacket;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Vector4f;

public class GhostHit extends Module {
   private final SubmitNodeStorage f_32847 = new SubmitNodeStorage();
   private static final Identifier f_32848 = Identifier.fromNamespaceAndPath(GhostHit.f_32997, GhostHit.f_32998);
   private static final int f_32849 = 65280;
   private static final long f_32850 = 2000000000L;
   private static final RenderPipeline f_32851 = Class_GEnQMkY73qXewYpU.m_2718(RenderPipelines.ENTITY_SNIPPET)
      .m_2726(GhostHit.f_32999)
      .m_2723(GhostHit.f_33000, GhostHit.f_33001)
      .m_2736(GhostHit.f_33002)
      .m_2741(GhostHit.f_33003)
      .m_2732(BlendFunction.TRANSLUCENT)
      .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
      .m_2737(false)
      .m_2725(false)
      .m_2722();
   private static final Map<Identifier, RenderType> f_32852 = new HashMap<>();
   private static boolean f_32853;
   private static int f_32854 = GhostHit.f_33004;
   private static final Map<AvatarRenderState, Float> f_32855 = Collections.synchronizedMap(new IdentityHashMap<>());
   private final SliderSetting f_32856;
   private final SliderSetting f_32857;
   private final SliderSetting f_32858;
   private final SliderSetting f_32859;
   private final SliderSetting f_32860;
   private final CheckboxSetting f_32861;
   private final SliderSetting f_32862;
   private final CheckboxSetting f_32863;
   private final SliderSetting f_32864;
   private final SliderSetting f_32865;
   private final CheckboxSetting f_32866;
   private final CheckboxSetting f_32867;
   private final CheckboxSetting f_32868;
   private final ColorSetting f_32869;
   private final CopyOnWriteArrayList<GhostHit.aRjfVNLgg9Fq37Cm> f_32870;
   private int f_32871;
   private final RenderPipeline f_32872;
   private final Class_gEPk7yDw6CwIte87<Class_wjdoxQGtI8mFyL6U> f_32873;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_32874;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_32875;
   private static final String f_32876 = "GhostHit";
   private static final String f_32877 = "Призрак цели при ударе и тотеме";
   private static final String f_32878 = "Время жизни";
   private static final float f_32879 = 1450.0F;
   private static final float f_32880 = 300.0F;
   private static final float f_32881 = 4000.0F;
   private static final float f_32882 = 10.0F;
   private static final String f_32883 = "Высота подъёма";
   private static final float f_32884 = 1.85F;
   private static final float f_32885 = 5.0F;
   private static final float f_32886 = 0.05F;
   private static final String f_32887 = "Прозрачность";
   private static final float f_32888 = 0.55F;
   private static final float f_32889 = 0.05F;
   private static final float f_32890 = 0.01F;
   private static final String f_32891 = "Свечение";
   private static final float f_32892 = 0.05F;
   private static final String f_32893 = "Размер свечения";
   private static final float f_32894 = 1.15F;
   private static final float f_32895 = 0.4F;
   private static final float f_32896 = 2.5F;
   private static final float f_32897 = 0.05F;
   private static final String f_32898 = "Свечение по краям";
   private static final String f_32899 = "Резкость краёв";
   private static final float f_32900 = 2.5F;
   private static final float f_32901 = 0.5F;
   private static final float f_32902 = 6.0F;
   private static final float f_32903 = 0.1F;
   private static final String f_32904 = "Искры";
   private static final String f_32905 = "Кол-во искр";
   private static final float f_32906 = 14.0F;
   private static final float f_32907 = 40.0F;
   private static final String f_32908 = "Макс. призраков";
   private static final float f_32909 = 7.0F;
   private static final float f_32910 = 20.0F;
   private static final String f_32911 = "Тотем";
   private static final String f_32912 = "Радужное свечение";
   private static final String f_32913 = "Цвет темы";
   private static final String f_32914 = "Цвет";
   private static final int f_32915 = -10962689;
   private static final String f_32916 = "dimasik/ghost_hit";
   private static final String f_32917 = "dead_chams";
   private static final String f_32918 = "dead_chams";
   private static final String f_32919 = "Sampler0";
   private static final long f_32920 = 2000000000L;
   private static final float f_32921 = 1000000.0F;
   private static final int f_32922 = 15728880;
   private static final float f_32923 = 1.35F;
   private static final float f_32924 = 0.01F;
   private static final float f_32925 = 1.0E9F;
   private static final int f_32926 = 16777215;
   private static final float f_32927 = 0.14F;
   private static final float f_32928 = 0.82F;
   private static final float f_32929 = 0.18F;
   private static final float f_32930 = 3.2F;
   private static final double f_32931 = 0.9;
   private static final float f_32932 = 0.5F;
   private static final float f_32933 = 0.01F;
   private static final float f_32934 = 0.85F;
   private static final float f_32935 = 0.15F;
   private static final float f_32936 = 3.4F;
   private static final float f_32937 = 3.1F;
   private static final float f_32938 = 5.2F;
   private static final float f_32939 = 0.18F;
   private static final float f_32940 = 1.7F;
   private static final float f_32941 = 2.9F;
   private static final float f_32942 = 0.35F;
   private static final double f_32943 = 0.95;
   private static final double f_32944 = 0.18;
   private static final float f_32945 = 0.94F;
   private static final float f_32946 = 0.06F;
   private static final float f_32947 = 5.2F;
   private static final float f_32948 = 1.15F;
   private static final float f_32949 = 0.55F;
   private static final float f_32950 = 0.18F;
   private static final float f_32951 = 0.55F;
   private static final float f_32952 = 0.28F;
   private static final float f_32953 = 0.09F;
   private static final int f_32954 = 65382;
   private static final float f_32955 = 0.9F;
   private static final float f_32956 = 1.15F;
   private static final float f_32957 = 0.34F;
   private static final float f_32958 = 0.11F;
   private static final float f_32959 = 0.28F;
   private static final float f_32960 = 0.65F;
   private static final float f_32961 = 0.075F;
   private static final int f_32962 = 65348;
   private static final double f_32963 = Math.PI * 2;
   private static final double f_32964 = 0.025;
   private static final long f_32965 = 9176L;
   private static final float f_32966 = 0.4F;
   private static final float f_32967 = 0.5F;
   private static final double f_32968 = Math.PI;
   private static final double f_32969 = 2.0;
   private static final double f_32970 = 0.25;
   private static final double f_32971 = 0.45;
   private static final double f_32972 = 2.5;
   private static final double f_32973 = 0.12;
   private static final float f_32974 = 0.02F;
   private static final double f_32975 = 0.1;
   private static final double f_32976 = 2.1;
   private static final double f_32977 = 0.1;
   private static final double f_32978 = 0.1;
   private static final float f_32979 = 1.1F;
   private static final float f_32980 = 0.5F;
   private static final float f_32981 = 0.5F;
   private static final String f_32982 = "Sampler0";
   private static final float f_32983 = 1.0E9F;
   private static final float f_32984 = 0.08F;
   private static final int f_32985 = 65280;
   private static final long f_32986 = 8000000L;
   private static final long f_32987 = 40L;
   private static final long f_32988 = 360L;
   private static final float f_32989 = 360.0F;
   private static final int f_32990 = 16777215;
   private static final int f_32991 = 16777215;
   private static final float f_32992 = -1.0F;
   private static final String f_32993 = "ghostHit";
   private static final String f_32994 = "ghostHitVertices";
   private static final String f_32995 = "ghost_hit_model";
   private static final String f_32996 = "Sampler0";
   private static final String f_32997 = "dimasik";
   private static final String f_32998 = "images/targetesp/glow.png";
   private static final String f_32999 = "dimasik/ghost_hit_model";
   private static final String f_33000 = "ALPHA_CUTOUT";
   private static final float f_33001 = 0.1F;
   private static final String f_33002 = "PER_FACE_LIGHTING";
   private static final String f_33003 = "Sampler1";
   private static final int f_33004 = 654311423;

   public static float m_9159(AvatarRenderState var0) {
      Float var1 = f_32855.get(var0);
      return var1 == null ? f_32992 : var1;
   }

   private void m_9161(int var1) {
      for (GhostHit.aRjfVNLgg9Fq37Cm var3 : this.f_32870) {
         if (var3.f_32844 == var1) {
            this.m_9194(var3);
         }
      }
   }

   private void m_9162(Class_XzpX8S5F5zd9jbuE var1) {
      if (this.m_776() && this.f_32866.m_8768() && f_11537.level != null) {
         if (var1.m_5619() instanceof ClientboundEntityEventPacket var2) {
            if (var2.getEventId() == 35) {
               if (var2.getEntity(f_11537.level) instanceof AbstractClientPlayer var4 && var4 != f_11537.player) {
                  f_11537.execute(() -> {
                     if (this.m_776() && this.f_32866.m_8768() && f_11537.level != null) {
                        if (var4.level() == f_11537.level && var4.isAlive()) {
                           this.m_9161(var4.getId());
                           this.m_9166(var4, true);
                        }
                     }
                  });
               }
            }
         }
      }
   }

   private float m_9163(GhostHit.aRjfVNLgg9Fq37Cm var1, long var2) {
      return (float)(var2 - var1.f_32840) / f_32983;
   }

   private int m_9164(
      BufferBuilder var1, PoseStack var2, GhostHit.aRjfVNLgg9Fq37Cm var3, Vec3 var4, float var5, float var6, float var7, float var8, float var9, int var10
   ) {
      float var11 = this.f_32859.m_8768();
      float var12 = this.f_32860.m_8768();
      float var13 = f_32934 + f_32935 * Mth.sin(var9 * f_32936 + var3.f_32843);
      double var14 = var3.f_32839.x - var4.x;
      double var16 = var3.f_32839.y + var7 + 1.0 - var4.y;
      double var18 = var3.f_32839.z - var4.z;
      int var20 = 0;
      var20 += this.m_9176(
         var1,
         var2,
         var14,
         var16,
         var18,
         f_32937 * var12 * var13,
         f_32938 * var12 * var13,
         0.0F,
         var5,
         var6,
         Class_BftdentXEtGbugJw.m_2306(var10, Mth.clamp(var11 * var8 * f_32939, 0.0F, 1.0F))
      );
      return var20
         + this.m_9176(
            var1,
            var2,
            var14,
            var16,
            var18,
            f_32940 * var12 * var13,
            f_32941 * var12 * var13,
            0.0F,
            var5,
            var6,
            Class_BftdentXEtGbugJw.m_2306(var10, Mth.clamp(var11 * var8 * f_32942, 0.0F, 1.0F))
         );
   }

   private void m_9165(
      GhostHit.aRjfVNLgg9Fq37Cm var1,
      EntityRenderDispatcher var2,
      LevelRenderState var3,
      SubmitNodeCollector var4,
      PoseStack var5,
      Vec3 var6,
      Vec3 var7,
      float var8,
      int var9
   ) {
      if (var9 >>> 24 != 0) {
         var1.f_32838.scale = var8;
         f_32854 = var9;
         f_32853 = true;

         try {
            var2.submit(var1.f_32838, var3.cameraRenderState, var6.x - var7.x, var6.y - var7.y, var6.z - var7.z, var5, var4);
         } finally {
            f_32853 = false;
         }
      }
   }

   private void m_9166(AbstractClientPlayer var1, boolean var2) {
      float var3 = f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true);
      if (f_11537.getEntityRenderDispatcher().extractEntity(var1, var3) instanceof AvatarRenderState var5) {
         this.m_9184(var5);
         GhostHit.aRjfVNLgg9Fq37Cm var6 = new GhostHit.aRjfVNLgg9Fq37Cm(
            var5,
            new Vec3(var5.x, var5.y, var5.z),
            System.nanoTime(),
            var5.scale,
            f_11537.level,
            this.f_32871++,
            var1.getId(),
            var2,
            var2 ? f_32920 : (long)(this.f_32856.m_8768() * f_32921)
         );
         this.f_32870.add(var6);
         f_32855.put(var5, 0.0F);
         this.m_9167();
      }
   }

   private void m_9167() {
      int var1 = Math.round(this.f_32865.m_8768());

      while (this.f_32870.size() > var1) {
         GhostHit.aRjfVNLgg9Fq37Cm var2 = this.f_32870.get(0);
         this.f_32870.remove(var2);
         f_32855.remove(var2.f_32838);
      }
   }

   private void m_9170(Class_TZhU50s8XmBQCMP5 var1) {
      if (f_11537.level != null && !this.f_32870.isEmpty() && !Rain.m_6679()) {
         this.m_9172(var1.m_5007());
         boolean var2 = this.f_32859.m_8768() > 0.0F;
         boolean var3 = this.f_32863.m_8768();
         boolean var4 = false;

         for (GhostHit.aRjfVNLgg9Fq37Cm var6 : this.f_32870) {
            if (var6.f_32845) {
               var4 = true;
               break;
            }
         }

         if (var2 || var3 || var4) {
            long var19 = System.nanoTime();
            Vec3 var7 = f_11537.gameRenderer.mainCamera().position();
            float var8 = f_11537.gameRenderer.mainCamera().yRot();
            float var9 = f_11537.gameRenderer.mainCamera().xRot();
            BufferBuilder var10 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
            int var11 = 0;

            for (GhostHit.aRjfVNLgg9Fq37Cm var13 : this.f_32870) {
               if (var13.f_32842 == f_11537.level) {
                  float var14 = (float)(var19 - var13.f_32840) / (float)var13.f_32846;
                  if (!(var14 >= 1.0F)) {
                     float var15 = this.m_9186(var14);
                     if (!(var15 <= f_32933)) {
                        float var16 = this.m_9182(var14);
                        float var17 = this.m_9163(var13, var19);
                        int var18 = this.m_9193(var13, var19);
                        if (var2) {
                           var11 += this.m_9164(var10, var1.m_5006(), var13, var7, var8, var9, var16, var15, var17, var18);
                        }

                        if (var3) {
                           var11 += this.m_9192(var10, var1.m_5006(), var13, var7, var8, var9, var16, var15, var17, var18);
                        }

                        if (var13.f_32845) {
                           var11 += this.m_9188(var10, var1.m_5006(), var13, var7, var8, var9, var16, var15, var17, var18);
                        }
                     }
                  }
               }
            }

            this.m_9180(var10, var11);
         }
      }
   }

   private void m_9172(Matrix4f var1) {
      Class_1x5Fn2q4kmtD2Zmq.EGrtL3OkTEhswyKz var2 = Class_1x5Fn2q4kmtD2Zmq.m_885();
      var2.m_884();
      Matrix4fStack var3 = RenderSystem.getModelViewStack();
      var3.pushMatrix();

      try {
         var3.mul(var1);
         this.m_9189(new PoseStack(), f_11537.gameRenderer.gameRenderState().levelRenderState, this.f_32847, f_11537.getEntityRenderDispatcher());
         f_11537.gameRenderer.featureRenderDispatcher().renderAllFeatures(this.f_32847);
         var2.m_884();
      } finally {
         var3.popMatrix();
      }
   }

   private int m_9176(
      BufferBuilder var1, PoseStack var2, double var3, double var5, double var7, float var9, float var10, float var11, float var12, float var13, int var14
   ) {
      if (var14 >>> 24 <= 1) {
         return 0;
      }

      Vector4f var15 = Class_BftdentXEtGbugJw.m_2298(var14);
      float var16 = var9 * f_32980;
      float var17 = var10 * f_32981;
      var2.pushPose();
      var2.translate(var3, var5, var7);
      var2.mulPose(Axis.YP.rotationDegrees(-var12));
      var2.mulPose(Axis.XP.rotationDegrees(var13));
      var2.mulPose(Axis.ZP.rotationDegrees(var11));
      Matrix4f var18 = var2.last().pose();
      this.m_9178(var1, var18, -var16, -var17, 0.0F, 0.0F, 0.0F, var15);
      this.m_9178(var1, var18, -var16, var17, 0.0F, 0.0F, 1.0F, var15);
      this.m_9178(var1, var18, var16, var17, 0.0F, 1.0F, 1.0F, var15);
      this.m_9178(var1, var18, var16, -var17, 0.0F, 1.0F, 0.0F, var15);
      var2.popPose();
      return 4;
   }

   public static RenderType m_9177(Identifier var0) {
      return f_32852.computeIfAbsent(
         var0,
         var0x -> RenderTypeMixin.create(
            f_32995, RenderSetup.builder(f_32851).withTexture(f_32996, var0x).useLightmap().useOverlay().sortOnUpload().createRenderSetup()
         )
      );
   }

   private void m_9178(BufferBuilder var1, Matrix4f var2, float var3, float var4, float var5, float var6, float var7, Vector4f var8) {
      var1.addVertex(var2, var3, var4, var5).setUv(var6, var7).setColor(var8.x, var8.y, var8.z, var8.w);
   }

   @Override
   public void m_778() {
      this.m_9190();
   }

   public static boolean m_9179(AvatarRenderState var0) {
      return f_32855.containsKey(var0);
   }

   private void m_9180(BufferBuilder var1, int var2) {
      MeshData var3 = var1.build();
      if (var3 != null) {
         if (var2 == 0) {
            var3.close();
         } else {
            GpuBuffer var4 = null;

            try {
               DrawState var5 = var3.drawState();
               int var6 = var5.indexCount();
               AutoStorageIndexBuffer var7 = RenderSystem.getSequentialBuffer(var5.primitiveTopology());
               GpuBuffer var8 = var7.getBuffer(var6);
               IndexType var9 = var7.type();
               var4 = RenderSystem.getDevice().createBuffer(() -> f_32994, 32, var3.vertexBuffer());
               RenderTarget var10 = f_11537.gameRenderer.mainRenderTarget();
               CommandEncoder var11 = RenderSystem.getDevice().createCommandEncoder();
               AbstractTexture var12 = f_11537.getTextureManager().getTexture(f_32848);
               RenderPass var13 = var11.createRenderPass(
                  () -> f_32993, var10.getColorTextureView(), Optional.empty(), var10.getDepthTextureView(), OptionalDouble.empty()
               );

               try {
                  RenderSystem.bindDefaultUniforms(var13);
                  var13.setPipeline(this.f_32872);
                  var13.bindTexture(f_32982, var12.getTextureView(), var12.getSampler());
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
   }

   private int m_9181(
      BufferBuilder var1,
      PoseStack var2,
      GhostHit.aRjfVNLgg9Fq37Cm var3,
      Vec3 var4,
      float var5,
      float var6,
      double var7,
      float var9,
      float var10,
      float var11,
      int var12,
      int var13,
      float var14
   ) {
      int var15 = 0;

      for (int var16 = 0; var16 < var12; var16++) {
         double var17 = var10 + var16 * (f_32963 / var12);
         double var19 = var3.f_32839.x + Math.cos(var17) * var9 - var4.x;
         double var21 = var7 + Math.sin(var17) * f_32964 - var4.y;
         double var23 = var3.f_32839.z + Math.sin(var17) * var9 - var4.z;
         var15 += this.m_9176(var1, var2, var19, var21, var23, var11, var11, 0.0F, var5, var6, Class_BftdentXEtGbugJw.m_2306(var13, var14));
      }

      return var15;
   }

   private float m_9182(float var1) {
      float var2 = 1.0F - var1;
      return this.f_32857.m_8768() * (1.0F - var2 * var2 * var2);
   }

   public GhostHit() {
      super(f_32876, f_32877, Category.RENDER);
      this.f_32856 = new SliderSetting(f_32878, f_32879, f_32880, f_32881).m_828(f_32882);
      this.f_32857 = new SliderSetting(f_32883, f_32884, 0.0F, f_32885).m_828(f_32886);
      this.f_32858 = new SliderSetting(f_32887, f_32888, f_32889, 1.0F).m_828(f_32890);
      this.f_32859 = new SliderSetting(f_32891, 1.0F, 0.0F, 2.0F).m_828(f_32892);
      this.f_32860 = new SliderSetting(f_32893, f_32894, f_32895, f_32896).m_828(f_32897).m_822(() -> this.f_32859.m_8768() > 0.0F);
      this.f_32861 = new CheckboxSetting(f_32898, true);
      this.f_32862 = new SliderSetting(f_32899, f_32900, f_32901, f_32902).m_828(f_32903).m_822(() -> this.f_32861.m_8768());
      this.f_32863 = new CheckboxSetting(f_32904, true);
      this.f_32864 = new SliderSetting(f_32905, f_32906, 2.0F, f_32907).m_828(1.0F).m_822(() -> this.f_32863.m_8768());
      this.f_32865 = new SliderSetting(f_32908, f_32909, 1.0F, f_32910).m_828(1.0F);
      this.f_32866 = new CheckboxSetting(f_32911, true);
      this.f_32867 = new CheckboxSetting(f_32912, false);
      this.f_32868 = new CheckboxSetting(f_32913, true).m_822(() -> !this.f_32867.m_8768());
      this.f_32869 = new ColorSetting(f_32914, false, f_32915).m_822(() -> !this.f_32867.m_8768() && !this.f_32868.m_8768());
      this.f_32870 = new CopyOnWriteArrayList<>();
      this.f_32872 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_32916)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_32917))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_32918))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.ADDITIVE)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2741(f_32919)
         .m_2722();
      this.f_32873 = this::m_9183;
      this.f_32874 = this::m_9162;
      this.f_32875 = this::m_9170;
      this.m_795(
         this.f_32856,
         this.f_32857,
         this.f_32858,
         this.f_32859,
         this.f_32860,
         this.f_32861,
         this.f_32862,
         this.f_32863,
         this.f_32864,
         this.f_32865,
         this.f_32866,
         this.f_32867,
         this.f_32868,
         this.f_32869
      );
   }

   private void m_9183(Class_wjdoxQGtI8mFyL6U var1) {
      if (this.m_776() && f_11537.level != null && var1.m_9372() == Class_wjdoxQGtI8mFyL6U.Class_327mRdjAqNoPaemJ.POST && var1.m_9371() == f_11537.player) {
         if (var1.m_9370() instanceof AbstractClientPlayer var2 && var2.isAlive()) {
            this.m_9166(var2, false);
         }
      }
   }

   private void m_9184(AvatarRenderState var1) {
      var1.isInvisible = true;
      var1.isInvisibleToPlayer = false;
      var1.displayFireAnimation = false;
      var1.outlineColor = 0;
      var1.nameTag = null;
      var1.nameTagAttachment = null;
      var1.scoreText = null;
      var1.leashStates = null;
      var1.shadowPieces.clear();
      var1.arrowCount = 0;
      var1.stingerCount = 0;
      var1.showHat = false;
      var1.showJacket = false;
      var1.showLeftPants = false;
      var1.showRightPants = false;
      var1.showLeftSleeve = false;
      var1.showRightSleeve = false;
      var1.showCape = false;
      var1.showExtraEars = false;
      var1.parrotOnLeftShoulder = null;
      var1.parrotOnRightShoulder = null;
      var1.headEquipment = ItemStack.EMPTY;
      var1.chestEquipment = ItemStack.EMPTY;
      var1.legsEquipment = ItemStack.EMPTY;
      var1.feetEquipment = ItemStack.EMPTY;
      var1.leftHandItemStack = ItemStack.EMPTY;
      var1.rightHandItemStack = ItemStack.EMPTY;
      var1.headItem.clear();
      var1.leftHandItemState.clear();
      var1.rightHandItemState.clear();
      var1.heldOnHead.clear();
      var1.lightCoords = f_32922;
      var1.isPassenger = false;
      var1.isAutoSpinAttack = false;
      var1.attackTime = 0.0F;
   }

   private float m_9186(float var1) {
      float var2 = Mth.clamp(var1 / f_32984, 0.0F, 1.0F);
      float var3 = 1.0F - var1;
      return var2 * var3 * var3;
   }

   private int m_9188(
      BufferBuilder var1, PoseStack var2, GhostHit.aRjfVNLgg9Fq37Cm var3, Vec3 var4, float var5, float var6, float var7, float var8, float var9, int var10
   ) {
      double var11 = var3.f_32839.y + var7 + var3.f_32838.boundingBoxHeight * f_32943 + f_32944;
      double var13 = var3.f_32839.x - var4.x;
      double var15 = var11 - var4.y;
      double var17 = var3.f_32839.z - var4.z;
      float var19 = f_32945 + f_32946 * Mth.sin(var9 * f_32947 + var3.f_32843);
      float var20 = Mth.clamp(var8 * f_32948, 0.0F, 1.0F);
      int var21 = 0;
      var21 += this.m_9176(
         var1,
         var2,
         var13,
         var15,
         var17,
         f_32949 * var19,
         f_32950 * var19,
         0.0F,
         var5,
         var6,
         Class_BftdentXEtGbugJw.m_2306(var10, Mth.clamp(var8 * f_32951, 0.0F, 1.0F))
      );
      var21 += this.m_9176(
         var1,
         var2,
         var13,
         var15,
         var17,
         f_32952 * var19,
         f_32953 * var19,
         0.0F,
         var5,
         var6,
         Class_BftdentXEtGbugJw.m_2306(f_32954, Mth.clamp(var8 * f_32955, 0.0F, 1.0F))
      );
      byte var22 = 32;
      float var23 = var9 * f_32956;
      var21 += this.m_9181(var1, var2, var3, var4, var5, var6, var11, f_32957, var23, f_32958, var22, var10, var20);
      return var21 + this.m_9181(var1, var2, var3, var4, var5, var6, var11, f_32959, -var23 * f_32960, f_32961, var22, f_32962, var20);
   }

   private void m_9189(PoseStack var1, LevelRenderState var2, SubmitNodeCollector var3, EntityRenderDispatcher var4) {
      if (f_11537.level != null && !this.f_32870.isEmpty()) {
         long var5 = System.nanoTime();
         Vec3 var7 = var2.cameraRenderState.pos;

         for (GhostHit.aRjfVNLgg9Fq37Cm var9 : this.f_32870) {
            if (var9.f_32842 != f_11537.level) {
               this.m_9194(var9);
            } else {
               float var10 = (float)(var5 - var9.f_32840) / (float)var9.f_32846;
               if (var10 >= 1.0F) {
                  this.m_9194(var9);
               } else {
                  float var11 = (var9.f_32845 ? Math.min(1.0F, this.f_32858.m_8768() * f_32923) : this.f_32858.m_8768()) * this.m_9186(var10);
                  if (!(var11 <= f_32924)) {
                     Vec3 var12 = var9.f_32839.add(0.0, this.m_9182(var10), 0.0);
                     f_32855.put(var9.f_32838, (float)(var5 - var9.f_32840) / f_32925);
                     int var13 = var9.f_32845 ? this.m_9193(var9, var5) : f_32926;
                     if (this.f_32861.m_8768()) {
                        float var14 = f_32927 / this.f_32862.m_8768();
                        float var15 = f_32928 + f_32929 * Mth.sin(this.m_9163(var9, var5) * f_32930 + var9.f_32843);
                        this.m_9165(
                           var9,
                           var4,
                           var2,
                           var3,
                           var1,
                           var12.subtract(0.0, var14 * f_32931, 0.0),
                           var7,
                           var9.f_32841 * (1.0F + var14),
                           Class_BftdentXEtGbugJw.m_2306(this.m_9193(var9, var5), var11 * f_32932 * var15)
                        );
                     }

                     this.m_9165(var9, var4, var2, var3, var1, var12, var7, var9.f_32841, Class_BftdentXEtGbugJw.m_2306(var13, var11));
                  }
               }
            }
         }
      }
   }

   private void m_9190() {
      this.f_32870.clear();
      f_32855.clear();
      f_32852.clear();
   }

   public static int m_9191(int var0) {
      return f_32853 ? f_32854 : var0;
   }

   private int m_9192(
      BufferBuilder var1, PoseStack var2, GhostHit.aRjfVNLgg9Fq37Cm var3, Vec3 var4, float var5, float var6, float var7, float var8, float var9, int var10
   ) {
      int var11 = Math.round(this.f_32864.m_8768());
      Random var12 = new Random(var3.f_32843 * f_32965 + 1L);
      int var13 = 0;

      for (int var14 = 0; var14 < var11; var14++) {
         float var15 = var12.nextFloat();
         float var16 = (var9 * (f_32966 + var12.nextFloat() * f_32967) + var15) % 1.0F;
         double var17 = var12.nextFloat() * f_32968 * f_32969;
         double var19 = f_32970 + var12.nextFloat() * f_32971;
         double var21 = Math.sin(var9 * f_32972 + var14) * f_32973;
         float var23 = (1.0F - var16) * var8;
         if (!(var23 <= f_32974)) {
            double var24 = var3.f_32839.x + Math.cos(var17) * var19 + var21 - var4.x;
            double var26 = var3.f_32839.y + f_32975 + var16 * (var7 + f_32976) - var4.y;
            double var28 = var3.f_32839.z + Math.sin(var17) * var19 - var4.z;
            float var30 = (float)(f_32977 + f_32978 * (1.0F - var16));
            var13 += this.m_9176(
               var1, var2, var24, var26, var28, var30, var30, 0.0F, var5, var6, Class_BftdentXEtGbugJw.m_2306(var10, Mth.clamp(var23 * f_32979, 0.0F, 1.0F))
            );
         }
      }

      return var13;
   }

   private int m_9193(GhostHit.aRjfVNLgg9Fq37Cm var1, long var2) {
      if (var1.f_32845) {
         return f_32985;
      } else if (this.f_32867.m_8768()) {
         float var4 = (float)((var2 / f_32986 + var1.f_32843 * f_32987) % f_32988) / f_32989;
         return Color.HSBtoRGB(var4, 1.0F, 1.0F) & f_32990;
      } else {
         return (this.f_32868.m_8768() ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : this.f_32869.m_8768()) & f_32991;
      }
   }

   @Override
   public void m_732() {
      this.m_9190();
      f_32853 = false;
   }

   private void m_9194(GhostHit.aRjfVNLgg9Fq37Cm var1) {
      this.f_32870.remove(var1);
      f_32855.remove(var1.f_32838);
   }

   private static final class aRjfVNLgg9Fq37Cm {
      public final AvatarRenderState f_32838;
      public final Vec3 f_32839;
      public final long f_32840;
      public final float f_32841;
      public final ClientLevel f_32842;
      public final int f_32843;
      public final int f_32844;
      public final boolean f_32845;
      public final long f_32846;

      public aRjfVNLgg9Fq37Cm(AvatarRenderState var1, Vec3 var2, long var3, float var5, ClientLevel var6, int var7, int var8, boolean var9, long var10) {
         this.f_32838 = var1;
         this.f_32839 = var2;
         this.f_32840 = var3;
         this.f_32841 = var5;
         this.f_32842 = var6;
         this.f_32843 = var7;
         this.f_32844 = var8;
         this.f_32845 = var9;
         this.f_32846 = var10;
      }
   }
}
