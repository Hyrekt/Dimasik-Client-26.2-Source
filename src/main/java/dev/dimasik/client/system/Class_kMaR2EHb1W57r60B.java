package dev.dimasik.client.system;

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
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.MeshData;
import dev.dimasik.client.module.render.Rain;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.UUID;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.joml.Vector4i;

public final class Class_kMaR2EHb1W57r60B implements Class_NzJrN63M7QBpmAbi {
   private final LinkedHashMap<UUID, Class_kMaR2EHb1W57r60B.Q4yUo5thuE6iRSRD> f_24864 = new LinkedHashMap<>();
   private final Matrix4f f_24865 = new Matrix4f();
   private final Matrix4f f_24866 = new Matrix4f();
   private final Vector4f f_24867 = new Vector4f();
   private final Vector4f f_24868 = new Vector4f();
   private final Vector3f f_24869 = new Vector3f();
   private final RenderPipeline f_24870;
   private final RenderPipeline f_24871;
   private GpuBuffer f_24872;
   private GpuBuffer f_24873;
   private int f_24874;
   private int f_24875;
   private ClientLevel f_24876;
   private long f_24877;
   private static final String f_24878 = "dimasik/party_marker";
   private static final String f_24879 = "party_marker";
   private static final String f_24880 = "party_marker";
   private static final String f_24881 = "dimasik/party_marker_label";
   private static final String f_24882 = "party_marker_label";
   private static final String f_24883 = "party_marker_label";
   private static final float f_24884 = 0.016666668F;
   private static final float f_24885 = 1.0E9F;
   private static final float f_24886 = 0.1F;
   private static final float f_24887 = 16.0F;
   private static final float f_24888 = 1.8F;
   private static final float f_24889 = 0.5F;
   private static final float f_24890 = 7.5E8F;
   private static final float f_24891 = 0.65F;
   private static final float f_24892 = 0.58F;
   private static final float f_24893 = 0.42F;
   private static final float f_24894 = 300.0F;
   private static final float f_24895 = 0.003F;
   private static final float f_24896 = 1.5F;
   private static final float f_24897 = 0.025F;
   private static final float f_24898 = 1.5F;
   private static final float f_24899 = 12.0F;
   private static final float f_24900 = 0.7F;
   private static final float f_24901 = 0.004F;
   private static final float f_24902 = 0.7F;
   private static final float f_24903 = 4.0F;
   private static final float f_24904 = 0.008F;
   private static final float f_24905 = 0.1F;
   private static final float f_24906 = 0.12F;
   private static final float f_24907 = 3.0F;
   private static final float f_24908 = 0.575F;
   private static final float f_24909 = 1.65F;
   private static final float f_24910 = 1.09F;
   private static final float f_24911 = 0.575F;
   private static final float f_24912 = 0.5F;
   private static final float f_24913 = 0.001F;
   private static final double f_24914 = 1.0E9;
   private static final double f_24915 = Math.PI;
   private static final double f_24916 = 2.0;
   private static final double f_24917 = 3.2;
   private static final float f_24918 = 0.01F;
   private static final float f_24919 = -1.0F;
   private static final float f_24920 = 0.5F;
   private static final float f_24921 = 0.5F;
   private static final float f_24922 = 0.5F;
   private static final float f_24923 = 32.0F;
   private static final float f_24924 = 0.5F;
   private static final float f_24925 = 32.0F;
   private static final float f_24926 = 0.5F;
   private static final float f_24927 = 0.001F;
   private static final float f_24928 = 0.5F;
   private static final float f_24929 = 0.001F;
   private static final float f_24930 = (float) (Math.PI / 2);
   private static final float f_24931 = 0.5F;
   private static final float f_24932 = 0.5F;
   private static final float f_24933 = 0.9F;
   private static final float f_24934 = 0.16F;
   private static final float f_24935 = 80.0F;
   private static final long f_24936 = 2147483647L;
   private static final float f_24937 = 0.003F;
   private static final double f_24938 = 1.0E9;
   private static final double f_24939 = Math.PI;
   private static final double f_24940 = 2.0;
   private static final double f_24941 = 3.2;
   private static final float f_24942 = 0.055F;
   private static final float f_24943 = 0.035F;
   private static final float f_24944 = 0.06F;
   private static final float f_24945 = 0.09F;
   private static final double f_24946 = 0.55;
   private static final double f_24947 = 0.55;
   private static final float f_24948 = 0.65F;
   private static final float f_24949 = 0.006F;
   private static final double f_24950 = Math.PI;
   private static final float f_24951 = 0.32F;
   private static final float f_24952 = 0.5F;
   private static final float f_24953 = 0.5F;
   private static final float f_24954 = 0.68F;
   private static final float f_24955 = 0.1F;
   private static final long f_24956 = 200000000L;
   private static final float f_24957 = 0.003F;
   private static final float f_24958 = 30.0F;
   private static final String f_24959 = "minecraft:player";
   private static final float f_24960 = 32.0F;
   private static final float f_24961 = 0.5F;
   private static final float f_24962 = 12.0F;
   private static final float f_24963 = 12.0F;
   private static final float f_24964 = 12.0F;
   private static final float f_24965 = 6.0F;
   private static final float f_24966 = 16.0F;
   private static final float f_24967 = 16.0F;
   private static final float f_24968 = 12.0F;
   private static final float f_24969 = 16.0F;
   private static final float f_24970 = 12.0F;
   private static final float f_24971 = 16.0F;
   private static final float f_24972 = 16.0F;
   private static final float f_24973 = 0.5F;
   private static final float f_24974 = 16.0F;
   private static final float f_24975 = -1.0F;
   private static final float f_24976 = 0.5F;
   private static final float f_24977 = 32.0F;
   private static final float f_24978 = 12.0F;
   private static final float f_24979 = 5.0F;
   private static final float f_24980 = 4.0F;
   private static final float f_24981 = 9.0F;
   private static final float f_24982 = 10.0F;
   private static final float f_24983 = 9.5F;
   private static final float f_24984 = -1.0F;
   private static final float f_24985 = 10.0F;
   private static final float f_24986 = 10.0F;
   private static final float f_24987 = 20.0F;
   private static final float f_24988 = 20.0F;
   private static final float f_24989 = 0.88F;
   private static final float f_24990 = 0.12F;
   private static final float f_24991 = 24.0F;
   private static final float f_24992 = 24.0F;
   private static final float f_24993 = 5.0F;
   private static final float f_24994 = 0.125F;
   private static final float f_24995 = 24.0F;
   private static final float f_24996 = 24.0F;
   private static final float f_24997 = 5.0F;
   private static final float f_24998 = 0.625F;
   private static final float f_24999 = 0.125F;
   private static final float f_25000 = 0.125F;
   private static final float f_25001 = 0.125F;
   private static final float f_25002 = -1.0F;
   private static final float f_25003 = 0.5F;
   private static final float f_25004 = 0.5F;
   private static final float f_25005 = 1.0E-4F;
   private static final float f_25006 = 1.0E-4F;
   private static final float f_25007 = 0.9999F;
   private static final float f_25008 = 0.9999F;
   private static final int f_25009 = 16777215;
   private static final float f_25010 = 3.0F;
   private static final float f_25011 = 0.05F;
   private static final String f_25012 = "party-markers";
   private static final String f_25013 = "party-labels";
   private static final String f_25014 = "party-markers";

   private void m_7428(BufferBuilder var1, boolean var2) {
      MeshData var3 = var1.build();
      if (var3 != null) {
         MeshData var4 = var3;

         try {
            int var5 = var3.vertexBuffer().remaining();
            GpuBuffer var6 = var2 ? this.f_24873 : this.f_24872;
            if (var6 == null || var6.isClosed() || (var2 ? this.f_24875 : this.f_24874) < var5) {
               if (var6 != null && !var6.isClosed()) {
                  var6.close();
               }

               int var7 = Math.max(4096, Integer.highestOneBit(var5 - 1) << 1);
               var6 = RenderSystem.getDevice().createBuffer(() -> var2 ? f_25013 : f_25014, 40, var7);
               if (var2) {
                  this.f_24873 = var6;
                  this.f_24875 = var7;
               } else {
                  this.f_24872 = var6;
                  this.f_24874 = var7;
               }
            }

            CommandEncoder var19 = RenderSystem.getDevice().createCommandEncoder();
            var19.writeToBuffer(var6.slice(0L, var5), var3.vertexBuffer());
            AutoStorageIndexBuffer var8 = RenderSystem.getSequentialBuffer(PrimitiveTopology.QUADS);
            int var9 = var3.drawState().indexCount();
            GpuBuffer var10 = var8.getBuffer(var9);
            RenderTarget var11 = f_11537.gameRenderer.mainRenderTarget();
            RenderPass var12 = var19.createRenderPass(() -> f_25012, var11.getColorTextureView(), Optional.empty());

            try {
               RenderSystem.bindDefaultUniforms(var12);
               var12.setPipeline(var2 ? this.f_24871 : this.f_24870);
               var12.setVertexBuffer(0, var6.slice());
               var12.setIndexBuffer(var10, var8.type());
               var12.drawIndexed(var9, 1, 0, 0, 0);
            } catch (Throwable var17) {
               if (var12 != null) {
                  try {
                     var12.close();
                  } catch (Throwable var16) {
                     var17.addSuppressed(var16);
                  }
               }

               throw var17;
            }

            if (var12 != null) {
               var12.close();
            }
         } catch (Throwable var18) {
            if (var4 != null) {
               try {
                  var4.close();
               } catch (Throwable var15) {
                  var18.addSuppressed(var15);
               }
            }

            throw var18;
         }

         if (var4 != null) {
            var4.close();
         }
      }
   }

   private static int m_7429(int var0, float var1) {
      return var0 & f_25009 | Math.round((var0 >>> 24) * Math.clamp(var1, 0.0F, 1.0F)) << 24;
   }

   public void m_7430() {
      this.f_24864.clear();
      this.f_24876 = null;
      this.f_24877 = 0L;
      if (this.f_24872 != null && !this.f_24872.isClosed()) {
         this.f_24872.close();
      }

      this.f_24872 = null;
      this.f_24874 = 0;
      if (this.f_24873 != null && !this.f_24873.isClosed()) {
         this.f_24873.close();
      }

      this.f_24873 = null;
      this.f_24875 = 0;
   }

   private static void m_7432(BufferBuilder var0, float var1, float var2, float var3, float var4, int var5, int var6) {
      float var7 = Math.max(1, f_11537.getWindow().getScreenWidth());
      float var8 = Math.max(1, f_11537.getWindow().getScreenHeight());
      m_7438(
         var0,
         Class_Ssh31B3ljfKeWsvS.m_4853(),
         f_25002 + (var1 + var3 * f_25003) * 2.0F / var7,
         1.0F - (var2 + var4 * f_25004) * 2.0F / var8,
         0.0F,
         var3 / var7,
         0.0F,
         0.0F,
         0.0F,
         var4 / var8,
         0.0F,
         var5,
         var6
      );
   }

   private static boolean m_7433(Vector4f var0) {
      return var0.w > f_25011 && Math.abs(var0.x) <= var0.w && Math.abs(var0.y) <= var0.w && var0.z <= var0.w;
   }

   private void m_7434(Class_kMaR2EHb1W57r60B.Q4yUo5thuE6iRSRD var1, float var2, float var3) {
      Class_8GkQlkemKscT6O8F var4 = var1.f_24842.m_4884();
      if (var1.f_24853 instanceof AbstractClientPlayer var5) {
         var1.f_24855 = var5.getSkin().body().texturePath();
      } else if (f_11537.getConnection() != null) {
         PlayerInfo var8 = f_11537.getConnection().getPlayerInfo(var4.entityUuid());
         if (var8 != null) {
            var1.f_24855 = var8.getSkin().body().texturePath();
         }
      }

      Identifier var7 = var1.f_24855 != null ? var1.f_24855 : DefaultPlayerSkin.get(var4.entityUuid()).body().texturePath();
      GpuTextureView var9 = f_11537.getTextureManager().getTexture(var7).getTextureView();
      Class_U4Qsm43RVlUI3Pre.m_5209(var2, var3, f_24991, f_24992, new Vector4f(f_24993), new Vector4f(f_24994), new Vector4i(-1), var9);
      Class_U4Qsm43RVlUI3Pre.m_5209(
         var2, var3, f_24995, f_24996, new Vector4f(f_24997), new Vector4f(f_24998, f_24999, f_25000, f_25001), new Vector4i(-1), var9
      );
   }

   public Class_kMaR2EHb1W57r60B() {
      this.f_24870 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_24878)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_24879))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_24880))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.LIGHTNING)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2722();
      this.f_24871 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_24881)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_24882))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_24883))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2722();
   }

   public void m_7435(Class_TZhU50s8XmBQCMP5 var1, int var2) {
      if (!Rain.m_6679()) {
         if (this.f_24876 != f_11537.level) {
            this.m_7430();
            this.f_24876 = f_11537.level;
         }

         if (f_11537.level != null && f_11537.player != null && var1.m_5009() != null && var1.m_5007() != null) {
            long var3 = System.nanoTime();
            float var5 = this.f_24877 == 0L ? f_24884 : Math.clamp((float)(var3 - this.f_24877) / f_24885, 0.0F, f_24886);
            this.f_24877 = var3;

            for (Class_kMaR2EHb1W57r60B.Q4yUo5thuE6iRSRD var7 : this.f_24864.values()) {
               var7.f_24845 = false;
            }

            String var53 = f_11537.level.dimension().identifier().toString();

            for (Class_SurII2wPoqIgB3n9.zTgXnNfGgpaJC7i2 var8 : Class_zZgIgQUpIcqCwBUw.m_9905().m_9906().values()) {
               if (var53.equals(var8.m_4884().dimension()) && Class_zZgIgQUpIcqCwBUw.m_9905().m_9907(var8.m_4884()) && var3 < var8.m_4882()) {
                  Class_kMaR2EHb1W57r60B.Q4yUo5thuE6iRSRD var9 = this.f_24864.get(var8.m_4884().m_1756());
                  if (var9 == null) {
                     if (this.f_24864.size() >= 64) {
                        this.f_24864.pollFirstEntry();
                     }

                     var9 = new Class_kMaR2EHb1W57r60B.Q4yUo5thuE6iRSRD(var8);
                     this.f_24864.put(var8.m_4884().m_1756(), var9);
                  }

                  var9.f_24842 = var8;
                  var9.f_24845 = true;
               }
            }

            if (!this.f_24864.isEmpty()) {
               float var55 = 1.0F - (float)Math.exp(-var5 * f_24887);
               int var56 = Math.max(1, f_11537.getWindow().getScreenWidth());
               int var57 = Math.max(1, f_11537.getWindow().getScreenHeight());
               Matrix4f var10 = var1.m_5007();
               this.f_24865.set(var1.m_5009()).mul(var10);
               Vec3 var11 = var1.m_5010();
               this.f_24869.set(1.0F, 0.0F, 0.0F).rotate(f_11537.gameRenderer.mainCamera().rotation());
               BufferBuilder var12 = null;
               Iterator var13 = this.f_24864.values().iterator();

               while (var13.hasNext()) {
                  Class_kMaR2EHb1W57r60B.Q4yUo5thuE6iRSRD var14 = (Class_kMaR2EHb1W57r60B.Q4yUo5thuE6iRSRD)var13.next();
                  Class_8GkQlkemKscT6O8F var15 = var14.f_24842.m_4884();
                  boolean var16 = var15.entityUuid() != null;
                  var14.f_24853 = var16 ? Class_zZgIgQUpIcqCwBUw.m_9905().m_9882(var15) : null;
                  if (var14.f_24853 != null) {
                     var14.f_24854 = var14.f_24853;
                  }

                  Vec3 var17 = var14.f_24853 == null ? null : var14.f_24853.getPosition(var1.m_5004());
                  double var18 = var17 == null ? var15.x() : var17.x;
                  double var20 = var17 == null ? var15.y() : var17.y;
                  double var22 = var17 == null ? var15.z() : var17.z;
                  if (var16) {
                     if (var14.f_24853 != null) {
                        Vec3 var24 = var14.f_24853.getBoundingBox().getCenter();
                        var18 += var24.x - var14.f_24853.getX();
                        var20 += var24.y - var14.f_24853.getY();
                        var22 += var24.z - var14.f_24853.getZ();
                     } else {
                        EntityType var58 = (EntityType)BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.parse(var15.entityType()));
                        float var25 = var14.f_24854 != null ? var14.f_24854.getBbHeight() : (var58 != null ? var58.getDimensions().height() : f_24888);
                        var20 += var25 * f_24889;
                        if (var14.f_24856) {
                           var18 = var14.f_24857 + (var18 - var14.f_24857) * var55;
                           var20 = var14.f_24858 + (var20 - var14.f_24858) * var55;
                           var22 = var14.f_24859 + (var22 - var14.f_24859) * var55;
                        }
                     }

                     var14.f_24857 = var18;
                     var14.f_24858 = var20;
                     var14.f_24859 = var22;
                     var14.f_24856 = true;
                  }

                  double var59 = var18 - f_11537.player.getX();
                  double var26 = var20 - f_11537.player.getY();
                  double var28 = var22 - f_11537.player.getZ();
                  double var30 = Math.sqrt(var59 * var59 + var26 * var26 + var28 * var28);
                  float var32 = var14.f_24845
                     ? m_7439((float)(var14.f_24842.m_4882() - var3) / f_24890)
                        * m_7439((float)var30 / f_24891)
                        * (f_24892 + f_24893 / (1.0F + (float)var30 / f_24894))
                     : 0.0F;
                  var14.f_24847 = var14.f_24847 + (var32 - var14.f_24847) * var55;
                  if (!var14.f_24845 && var14.f_24847 < f_24895) {
                     var13.remove();
                  } else {
                     float var33 = (float)(var18 - var11.x);
                     float var34 = (float)(var20 - var11.y);
                     float var35 = (float)(var22 - var11.z);
                     float var36 = Math.clamp(f_24896 + (float)var30 * f_24897, f_24898, f_24899);
                     float var37 = Math.clamp(f_24900 + (float)var30 * f_24901, f_24902, f_24903);
                     if (var16) {
                        this.f_24865.transform(this.f_24867.set(var33, var34, var35, 1.0F));
                     } else {
                        this.f_24865.transform(this.f_24867.set(var33, var34 + var36, var35, 1.0F));
                     }

                     this.f_24865.transform(this.f_24868.set(var33, var34, var35, 1.0F));
                     float var38 = Math.max(f_24904, Math.max(this.f_24867.w, this.f_24868.w) * 2.0F / (var57 * Math.max(f_24905, var1.m_5009().m11())));
                     float var39 = Math.max(f_24906, var38 * f_24907);
                     var14.f_24846 = var16
                        ? m_7433(this.f_24867)
                        : m_7437(this.f_24865, var33, var34 + var36 * f_24908, var35, Math.max(var37 * f_24909, var39 * f_24910), var36 * f_24911);
                     if (!var16 && !m_7433(this.f_24867)) {
                        if (var14.f_24846 && !m_7433(this.f_24868)) {
                           this.f_24867.add(this.f_24868).mul(f_24912);
                        } else {
                           this.f_24867.set(this.f_24868);
                        }
                     }

                     float var40 = Math.max(Math.abs(this.f_24867.w), f_24913);
                     float var41 = this.f_24867.x / var40;
                     float var42 = this.f_24867.y / var40;
                     var14.f_24852 = 0.0F;
                     if (!var16 && !var14.f_24846) {
                        double var43 = (var3 - var14.f_24842.m_4881()) / f_24914;
                        var14.f_24852 = (float)Math.sin(var43 * f_24915 * f_24916 / f_24917);
                        if (Math.abs(var41) + Math.abs(var42) < f_24918) {
                           var42 = f_24919;
                        }

                        float var45 = var41 * var56 * f_24920;
                        float var46 = -var42 * var57 * f_24921;
                        float var47 = Math.max(
                           Math.abs(var45) / Math.max(1.0F, var56 * f_24922 - f_24923), Math.abs(var46) / Math.max(1.0F, var57 * f_24924 - f_24925)
                        );
                        var14.f_24848 = var56 * f_24926 + var45 / Math.max(var47, f_24927);
                        var14.f_24849 = var57 * f_24928 + var46 / Math.max(var47, f_24929);
                        var14.f_24851 = (float)Math.atan2(var46, var45) + f_24930;
                     } else {
                        var14.f_24848 = (var41 + 1.0F) * var56 * f_24931;
                        var14.f_24849 = (1.0F - var42) * var57 * f_24932;
                     }

                     var14.f_24850 = f_24933 + f_24934 / (1.0F + (float)var30 / f_24935);
                     int var60 = (int)Math.min(f_24936, Math.round(var30));
                     if (var60 != var14.f_24860) {
                        var14.f_24860 = var60;
                        var14.f_24861 = var60 + "";
                        var14.f_24862 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var14.f_24861, 13);
                     }

                     if (!var16 && !(var14.f_24847 < f_24937)) {
                        double var44 = (var3 - var14.f_24842.m_4881()) / f_24938;
                        float var61 = (float)Math.sin(var44 * f_24939 * f_24940 / f_24941);
                        float var62 = var36 * (f_24942 + f_24943 * var61);
                        float var48 = var36 * (1.0F + f_24944 * var61);
                        float var49 = var39 * (1.0F + f_24945 * var61);
                        float var50 = (float)(var44 * f_24946 - Math.floor(var44 * f_24947));
                        int var51 = m_7429(var2, var14.f_24847);
                        if (var12 == null) {
                           var12 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
                        }

                        m_7438(var12, var10, var33, var34, var35, var37, 0.0F, 0.0F, 0.0F, 0.0F, var37, 0, var51);
                        float var52 = var37 * (1.0F + var50 * f_24948);
                        m_7438(
                           var12,
                           var10,
                           var33,
                           var34 + f_24949,
                           var35,
                           var52,
                           0.0F,
                           0.0F,
                           0.0F,
                           0.0F,
                           var52,
                           0,
                           m_7429(var2, var14.f_24847 * (float)Math.sin(var50 * f_24950) * f_24951)
                        );
                        m_7438(
                           var12,
                           var10,
                           var33,
                           var34 + var62 + var48 * f_24952,
                           var35,
                           this.f_24869.x * var49,
                           this.f_24869.y * var49,
                           this.f_24869.z * var49,
                           0.0F,
                           var48 * f_24953,
                           0.0F,
                           4,
                           m_7429(var2, var14.f_24847 * (f_24954 + f_24955 * var61))
                        );
                     }
                  }
               }

               if (var12 != null) {
                  this.m_7428(var12, false);
               }
            }
         }
      }
   }

   private static boolean m_7436(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      return var0 * var4 + var1 * var5 + var2 * var6 + var3 + (Math.abs(var0) + Math.abs(var2)) * var7 + Math.abs(var1) * var8 < 0.0F;
   }

   private static boolean m_7437(Matrix4f var0, float var1, float var2, float var3, float var4, float var5) {
      return !m_7436(var0.m03() + var0.m00(), var0.m13() + var0.m10(), var0.m23() + var0.m20(), var0.m33() + var0.m30(), var1, var2, var3, var4, var5)
         && !m_7436(var0.m03() - var0.m00(), var0.m13() - var0.m10(), var0.m23() - var0.m20(), var0.m33() - var0.m30(), var1, var2, var3, var4, var5)
         && !m_7436(var0.m03() + var0.m01(), var0.m13() + var0.m11(), var0.m23() + var0.m21(), var0.m33() + var0.m31(), var1, var2, var3, var4, var5)
         && !m_7436(var0.m03() - var0.m01(), var0.m13() - var0.m11(), var0.m23() - var0.m21(), var0.m33() - var0.m31(), var1, var2, var3, var4, var5)
         && !m_7436(var0.m03() - var0.m02(), var0.m13() - var0.m12(), var0.m23() - var0.m22(), var0.m33() - var0.m32(), var1, var2, var3, var4, var5);
   }

   private static void m_7438(
      BufferBuilder var0,
      Matrix4f var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      int var11,
      int var12
   ) {
      var0.addVertex(var1, var2 - var5 - var8, var3 - var6 - var9, var4 - var7 - var10).setUv(var11 + f_25005, 0.0F).setColor(var12);
      var0.addVertex(var1, var2 - var5 + var8, var3 - var6 + var9, var4 - var7 + var10).setUv(var11 + f_25006, 1.0F).setColor(var12);
      var0.addVertex(var1, var2 + var5 + var8, var3 + var6 + var9, var4 + var7 + var10).setUv(var11 + f_25007, 1.0F).setColor(var12);
      var0.addVertex(var1, var2 + var5 - var8, var3 + var6 - var9, var4 + var7 - var10).setUv(var11 + f_25008, 0.0F).setColor(var12);
   }

   private static float m_7439(float var0) {
      float var1 = Math.clamp(var0, 0.0F, 1.0F);
      return var1 * var1 * (f_25010 - 2.0F * var1);
   }

   public void m_7441(int var1, GuiGraphicsExtractor var2) {
      if (f_11537.level != null
         && f_11537.player != null
         && !this.f_24864.isEmpty()
         && !Rain.m_6679()
         && System.nanoTime() - this.f_24877 <= f_24956
         && !f_11537.gui.hud.isHidden()) {
         int var3 = Math.max(1, f_11537.getWindow().getScreenWidth());
         int var4 = Math.max(1, f_11537.getWindow().getScreenHeight());
         Matrix4f var5 = Class_Ssh31B3ljfKeWsvS.m_4853();
         this.f_24866.set(var5);
         float var6 = Class_Ssh31B3ljfKeWsvS.m_4821();
         BufferBuilder var7 = null;
         Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588());

         try {
            for (Class_kMaR2EHb1W57r60B.Q4yUo5thuE6iRSRD var9 : this.f_24864.values()) {
               if (!(var9.f_24847 < f_24957)) {
                  float var10 = var9.f_24843 + var9.f_24862 + f_24958;
                  boolean var11 = var9.f_24842.m_4884().entityUuid() != null;
                  if (!var11 || var9.f_24846) {
                     boolean var12 = var11 && f_24959.equals(var9.f_24842.m_4884().entityType());
                     if (var12) {
                        var10 += f_24960;
                     }

                     float var13 = var9.f_24850 * Class_qyFZUkNc6oUs6ojL.m_8354();
                     float var14 = var10 * var13 * f_24961;
                     float var15 = var11 ? var9.f_24848 : Math.clamp(var9.f_24848, f_24962 + var14, Math.max(f_24963 + var14, var3 - var14 - f_24964));
                     float var16 = var9.f_24846 ? f_24965 * var13 : f_24966;
                     float var17 = var11
                        ? var9.f_24849
                        : Math.clamp(
                           var9.f_24849 - var16 - f_24967 * var13, f_24968 + f_24969 * var13, Math.max(f_24970 + f_24971 * var13, var4 - 12 - f_24972 * var13)
                        );
                     float var18 = var15 - var10 * f_24973;
                     float var19 = var17 - f_24974;
                     float var20 = f_24975 + (var18 + var10 * f_24976) * 2.0F / var3;
                     float var21 = 1.0F - var17 * 2.0F / var4;
                     var5.identity().translate(var20, var21, 0.0F).scale(var13, var13, 1.0F).translate(-var20, -var21, 0.0F);
                     Class_Ssh31B3ljfKeWsvS.m_4864(var6 * var9.f_24847);
                     Class_U4Qsm43RVlUI3Pre.m_5188(var18, var19, var10, f_24977, f_24978);
                     if (var12) {
                        this.m_7434(var9, var18 + f_24979, var19 + f_24980);
                     }

                     Class_U4Qsm43RVlUI3Pre.m_5186(
                        Class_y1y6QpONhWEUIdEB.m_9588(),
                        var9.f_24844,
                        var18 + (var12 ? 42 : 10),
                        var19 + f_24981,
                        14,
                        Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT)
                     );
                     Class_U4Qsm43RVlUI3Pre.m_5186(
                        Class_y1y6QpONhWEUIdEB.m_9588(),
                        var9.f_24861,
                        var18 + var10 - var9.f_24862 - f_24982,
                        var19 + f_24983,
                        13,
                        Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT)
                     );
                     if (!var11 && !var9.f_24846) {
                        if (var7 == null) {
                           var7 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
                        }

                        float var22 = f_24984 + var9.f_24848 * 2.0F / var3;
                        float var23 = 1.0F - var9.f_24849 * 2.0F / var4;
                        float var24 = (float)var3 / var4;
                        var5.identity()
                           .translate(var22, var23, 0.0F)
                           .scale(1.0F, var24, 1.0F)
                           .rotateZ(-var9.f_24851)
                           .scale(1.0F, 1.0F / var24, 1.0F)
                           .translate(-var22, -var23, 0.0F);
                        m_7432(
                           var7,
                           var9.f_24848 - f_24985,
                           var9.f_24849 - f_24986 + var9.f_24852 * 2.0F,
                           f_24987,
                           f_24988,
                           8,
                           m_7429(var1, var9.f_24847 * (f_24989 + f_24990 * var9.f_24852))
                        );
                     }
                  }
               }
            }
         } finally {
            try {
               Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588());
            } finally {
               var5.set(this.f_24866);
               Class_Ssh31B3ljfKeWsvS.m_4864(var6);
            }
         }

         if (var7 != null) {
            this.m_7428(var7, true);
         }
      }
   }

   private static final class Q4yUo5thuE6iRSRD {
      public Class_SurII2wPoqIgB3n9.zTgXnNfGgpaJC7i2 f_24842;
      public final float f_24843;
      public final String f_24844;
      public boolean f_24845;
      public boolean f_24846;
      public float f_24847;
      public float f_24848;
      public float f_24849;
      public float f_24850;
      public float f_24851;
      public float f_24852;
      public LivingEntity f_24853;
      public LivingEntity f_24854;
      public Identifier f_24855;
      public boolean f_24856;
      public double f_24857;
      public double f_24858;
      public double f_24859;
      public int f_24860 = -1;
      public String f_24861 = "";
      public float f_24862;
      public static final String f_24863 = "minecraft:player";

      public Q4yUo5thuE6iRSRD(Class_SurII2wPoqIgB3n9.zTgXnNfGgpaJC7i2 var1) {
         this.f_24842 = var1;
         Class_8GkQlkemKscT6O8F var2 = var1.m_4884();
         EntityType var3 = var2.entityUuid() != null && !f_24863.equals(var2.entityType())
            ? (EntityType)BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.parse(var2.entityType()))
            : null;
         this.f_24844 = var3 != null ? var3.getDescription().getString() : var2.name();
         this.f_24843 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), this.f_24844, 14);
      }
   }
}
