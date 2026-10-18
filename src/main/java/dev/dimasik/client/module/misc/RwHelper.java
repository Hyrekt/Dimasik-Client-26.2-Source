package dev.dimasik.client.module.misc;

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
import com.mojang.blaze3d.vertex.MeshData.DrawState;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.IntegerSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_8x4deAyjocMIBSj7;
import dev.dimasik.client.system.Class_B6JOzHnwhU3pe4AO;
import dev.dimasik.client.system.Class_B6vpBUNmRtH3JzmV;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_PlAkZAQgfIOFZi5F;
import dev.dimasik.client.system.Class_PoKta0VE7AdhY1En;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_ftHu9o3WzCU3Adxm;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_i7qN6fWCX6JrM0uQ;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_wjdoxQGtI8mFyL6U;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.UUID;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.game.ServerboundContainerClosePacket;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Vector4f;

public class RwHelper extends Module {
   private static final float f_32134 = 8.0F;
   private static final long f_32135 = 6000L;
   private static final long f_32136 = 420L;
   private static final long f_32137 = 380L;
   private static final long f_32138 = 60000L;
   private static final float f_32139 = 0.012F;
   private static final List<BlockPos> f_32140 = m_8967();
   private static final Set<Long> f_32141 = m_9013(f_32140);
   private static final List<RwHelper.alREtzPbGMoaP6IY> f_32142 = m_8996();
   private static final List<RwHelper.x9aLodu5PIhQDhta> f_32143 = m_8971();
   private static final float f_32144;
   private static final float f_32145;
   private final Class_8x4deAyjocMIBSj7 f_32146 = new Class_8x4deAyjocMIBSj7();
   private final IntegerSetting f_32147;
   private final IntegerSetting f_32148;
   private final IntegerSetting f_32149;
   private final IntegerSetting f_32150;
   private final IntegerSetting f_32151;
   private final IntegerSetting f_32152;
   private final SliderSetting f_32153;
   private final CheckboxSetting f_32154;
   private final CheckboxSetting f_32155;
   private final CheckboxSetting f_32156;
   private final IntegerSetting f_32157;
   private final RenderPipeline f_32158;
   private RwHelper.NzES1eNTXjIvLBnv f_32159;
   private Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv f_32160;
   private int f_32161;
   private int f_32162;
   private int f_32163;
   private int f_32164;
   private long f_32165;
   private boolean f_32166;
   private ChunkPos f_32167;
   private double f_32168;
   private boolean f_32169;
   private boolean f_32170;
   private long f_32171;
   private long f_32172;
   private Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv f_32173;
   private final List<RwHelper.y8hMpcnulALY81kb> f_32174;
   private final Class_gEPk7yDw6CwIte87<Class_B6JOzHnwhU3pe4AO> f_32175;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_32176;
   private final Class_gEPk7yDw6CwIte87<Class_wjdoxQGtI8mFyL6U> f_32177;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_32178;
   private static final String f_32179 = "RwHelper";
   private static final String f_32180 = "Помощник донат-предметов ReallyWorld";
   private static final String f_32181 = "Ловушка";
   private static final String f_32182 = "Эндер Ловушка";
   private static final String f_32183 = "Каменная ловушка (BravoHvH)";
   private static final String f_32184 = "Адская ловушка (BravoHvH)";
   private static final String f_32185 = "АнтиПолёт";
   private static final String f_32186 = "Тёмный Пульс";
   private static final String f_32187 = "Дистанция цели";
   private static final float f_32188 = 6.0F;
   private static final float f_32189 = 12.0F;
   private static final float f_32190 = 0.5F;
   private static final String f_32191 = "Превью ловушки";
   private static final String f_32192 = "Рендер АнтиПолёта";
   private static final String f_32193 = "CordDropper";
   private static final String f_32194 = "Бинд CordDropper";
   private static final String f_32195 = "dimasik/rw_helper";
   private static final String f_32196 = "target_esp_crystal";
   private static final String f_32197 = "target_esp_crystal";
   private static final long f_32198 = -1L;
   private static final String f_32199 = "hud/ender_trap";
   private static final float f_32200 = 1.5F;
   private static final long f_32201 = -1L;
   private static final long f_32202 = 60000L;
   private static final long f_32203 = 380L;
   private static final long f_32204 = -1L;
   private static final float f_32205 = 8.0F;
   private static final long f_32206 = 6000L;
   private static final long f_32207 = 350L;
   private static final long f_32208 = 120L;
   private static final long f_32209 = 60L;
   private static final float f_32210 = 8.0F;
   private static final float f_32211 = 420.0F;
   private static final float f_32212 = 380.0F;
   private static final float f_32213 = 0.01F;
   private static final float f_32214 = 0.18F;
   private static final float f_32215 = 0.82F;
   private static final float f_32216 = 0.85F;
   private static final float f_32217 = (float) Math.PI;
   private static final float f_32218 = 0.04F;
   private static final float f_32219 = 0.18F;
   private static final float f_32220 = 0.35F;
   private static final float f_32221 = 0.65F;
   private static final float f_32222 = 0.08F;
   private static final int f_32223 = -10696449;
   private static final float f_32224 = 0.35F;
   private static final float f_32225 = 0.02F;
   private static final float f_32226 = 0.02F;
   private static final float f_32227 = 0.02F;
   private static final float f_32228 = 0.02F;
   private static final float f_32229 = 0.1F;
   private static final float f_32230 = 0.03F;
   private static final float f_32231 = 0.03F;
   private static final float f_32232 = 0.03F;
   private static final float f_32233 = 0.03F;
   private static final float f_32234 = 0.55F;
   private static final float f_32235 = 0.03F;
   private static final float f_32236 = 0.03F;
   private static final float f_32237 = 0.03F;
   private static final float f_32238 = 0.03F;
   private static final float f_32239 = 0.55F;
   private static final float f_32240 = 0.03F;
   private static final float f_32241 = 0.03F;
   private static final float f_32242 = 0.03F;
   private static final float f_32243 = 0.03F;
   private static final float f_32244 = 0.55F;
   private static final float f_32245 = 0.03F;
   private static final float f_32246 = 0.03F;
   private static final float f_32247 = 0.03F;
   private static final float f_32248 = 0.03F;
   private static final float f_32249 = 0.55F;
   private static final float f_32250 = 0.5F;
   private static final float f_32251 = 0.5F;
   private static final float f_32252 = 2.2F;
   private static final float f_32253 = 0.28F;
   private static final float f_32254 = 0.08F;
   private static final float f_32255 = 0.02F;
   private static final float f_32256 = 0.12F;
   private static final float f_32257 = 0.09F;
   private static final int f_32258 = -4162305;
   private static final int f_32259 = -10696449;
   private static final float f_32260 = 0.62F;
   private static final int f_32261 = -1521409;
   private static final int f_32262 = -4657921;
   private static final float f_32263 = 0.5F;
   private static final float f_32264 = 0.001F;
   private static final float f_32265 = 0.01F;
   private static final float f_32266 = 0.01F;
   private static final float f_32267 = 0.5F;
   private static final float f_32268 = 0.5F;
   private static final float f_32269 = 0.5F;
   private static final float f_32270 = 0.62F;
   private static final float f_32271 = 0.38F;
   private static final float f_32272 = 2.15F;
   private static final float f_32273 = 0.31F;
   private static final float f_32274 = 0.5F;
   private static final float f_32275 = 0.01F;
   private static final float f_32276 = 0.55F;
   private static final float f_32277 = 0.45F;
   private static final float f_32278 = 2.8F;
   private static final float f_32279 = 0.4F;
   private static final float f_32280 = 0.25F;
   private static final float f_32281 = 0.35F;
   private static final float f_32282 = 0.055F;
   private static final float f_32283 = 0.04F;
   private static final float f_32284 = 0.5F;
   private static final float f_32285 = 0.01F;
   private static final float f_32286 = 0.012F;
   private static final float f_32287 = 0.7F;
   private static final float f_32288 = 0.3F;
   private static final float f_32289 = 0.22F;
   private static final float f_32290 = 0.18F;
   private static final float f_32291 = 0.72F;
   private static final float f_32292 = 0.22F;
   private static final float f_32293 = 0.18F;
   private static final float f_32294 = 0.04F;
   private static final float f_32295 = 1.0E-4F;
   private static final float f_32296 = 0.9F;
   private static final float f_32297 = 0.9F;
   private static final float f_32298 = 1.0E-4F;
   private static final float f_32299 = 1.0E-4F;
   private static final float f_32300 = 0.38F;
   private static final float f_32301 = 6.0F;
   private static final float f_32302 = 15.0F;
   private static final float f_32303 = 10.0F;
   private static final float f_32304 = 255.0F;
   private static final int f_32305 = 16777215;
   private static final long f_32306 = 4294967295L;
   private static final long f_32307 = 4294967295L;
   private static final long f_32308 = 1023L;
   private static final long f_32309 = 1023L;
   private static final long f_32310 = 1023L;
   private static final double f_32311 = 3.5;
   private static final String f_32312 = "rwHelper";
   private static final String f_32313 = "rwHelperVertices";

   private void m_8966() {
      if (this.f_32160 == null) {
         this.m_8989();
      } else {
         if (this.f_32162 == -1) {
            int var1 = this.m_9011(this.f_32160);
            if (var1 == -1) {
               this.m_8989();
               return;
            }

            if (var1 == 40) {
               f_11537.gameMode.useItem(f_11537.player, InteractionHand.OFF_HAND);
               f_11537.player.swing(InteractionHand.OFF_HAND);
               this.m_8989();
               return;
            }

            this.f_32162 = f_11537.player.getInventory().selected;
            if (var1 < 9) {
               this.f_32163 = var1;
            } else {
               this.f_32161 = this.m_8988(var1);
            }
         }

         Class_8x4deAyjocMIBSj7.Class_8xzBZ83gOSc56UI6 var2 = this.f_32146.m_1901(() -> {
            if (this.f_32163 != -1) {
               f_11537.player.getInventory().selected = this.f_32163;
            } else {
               Class_B6vpBUNmRtH3JzmV.m_2129(this.f_32162, this.f_32161);
            }

            f_11537.gameMode.useItem(f_11537.player, InteractionHand.MAIN_HAND);
            f_11537.player.swing(InteractionHand.MAIN_HAND);
         }, true);
         if (var2 == Class_8x4deAyjocMIBSj7.Class_8xzBZ83gOSc56UI6.SUCCESS) {
            this.f_32159 = RwHelper.NzES1eNTXjIvLBnv.RESTORE_TRAP;
         }
      }
   }

   private static List<BlockPos> m_8967() {
      LinkedHashSet var0 = new LinkedHashSet();
      double var1 = f_32311;
      double var3 = 1.0 / var1;
      int var5 = (int)Math.ceil(var1);

      label49:
      for (int var6 = 0; var6 <= var5; var6++) {
         double var7 = var6 * var3;
         double var9 = (var6 + 1) * var3;

         for (int var11 = 0; var11 <= var5; var11++) {
            double var12 = var11 * var3;
            double var14 = (var11 + 1) * var3;

            for (int var16 = 0; var16 <= var5; var16++) {
               double var17 = var16 * var3;
               double var19 = (var16 + 1) * var3;
               if (m_8991(var7, var12, var17) > 1.0) {
                  if (var16 == 0) {
                     if (var11 == 0) {
                        return List.copyOf(var0);
                     }
                     continue label49;
                  }
                  break;
               }

               if (!(m_8991(var9, var12, var17) <= 1.0) || !(m_8991(var7, var14, var17) <= 1.0) || !(m_8991(var7, var12, var19) <= 1.0)) {
                  var0.add(new BlockPos(var6, var11, var16));
                  var0.add(new BlockPos(-var6, var11, var16));
                  var0.add(new BlockPos(var6, -var11, var16));
                  var0.add(new BlockPos(var6, var11, -var16));
                  var0.add(new BlockPos(-var6, -var11, var16));
                  var0.add(new BlockPos(var6, -var11, -var16));
                  var0.add(new BlockPos(-var6, var11, -var16));
                  var0.add(new BlockPos(-var6, -var11, -var16));
               }
            }
         }
      }

      return List.copyOf(var0);
   }

   private Player m_8968(UUID var1) {
      if (f_11537.level != null && var1 != null) {
         for (Player var3 : f_11537.level.players()) {
            if (var3.getUUID().equals(var1) && var3 != f_11537.player) {
               return var3;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private void m_8969(BufferBuilder var1, int var2) {
      MeshData var3 = var1.build();
      if (var3 != null) {
         if (var2 <= 0) {
            var3.close();
         } else {
            GpuBuffer var4 = null;

            try {
               DrawState var5 = var3.drawState();
               int var6 = var5.indexCount();
               if (var6 > 0) {
                  AutoStorageIndexBuffer var7 = RenderSystem.getSequentialBuffer(var5.primitiveTopology());
                  GpuBuffer var8 = var7.getBuffer(var6);
                  IndexType var9 = var7.type();
                  var4 = RenderSystem.getDevice().createBuffer(() -> f_32313, 32, var3.vertexBuffer());
                  CommandEncoder var10 = RenderSystem.getDevice().createCommandEncoder();
                  RenderTarget var11 = f_11537.gameRenderer.mainRenderTarget();
                  RenderPass var12 = var10.createRenderPass(
                     () -> f_32312, var11.getColorTextureView(), Optional.empty(), var11.getDepthTextureView(), OptionalDouble.empty()
                  );

                  try {
                     RenderSystem.bindDefaultUniforms(var12);
                     var12.setPipeline(this.f_32158);
                     var12.setVertexBuffer(0, var4.slice());
                     var12.setIndexBuffer(var8, var9);
                     var12.drawIndexed(var6, 1, 0, 0, 0);
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

                  return;
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

   private static long m_8970(int var0, int var1, int var2) {
      return (var0 + 512 & f_32308) << 20 | (var1 + 512 & f_32309) << 10 | var2 + 512 & f_32310;
   }

   private static List<RwHelper.x9aLodu5PIhQDhta> m_8971() {
      LinkedHashSet var0 = new LinkedHashSet();
      ArrayList var1 = new ArrayList();

      for (RwHelper.alREtzPbGMoaP6IY var3 : f_32142) {
         float var4 = var3.m_8948();
         float var5 = var3.m_8949();
         float var6 = var3.m_8947();
         float[][] var7 = m_9004(var3);

         for (int var8 = 0; var8 < 4; var8++) {
            float[] var9 = var7[var8];
            float[] var10 = var7[var8 + 1 & 3];
            long var11 = m_9017(var4 + var9[0], var5 + var9[1], var6 + var9[2], var4 + var10[0], var5 + var10[1], var6 + var10[2]);
            if (var0.add(var11)) {
               var1.add(new RwHelper.x9aLodu5PIhQDhta(var4 + var9[0], var5 + var9[1], var6 + var9[2], var4 + var10[0], var5 + var10[1], var6 + var10[2]));
            }
         }
      }

      return List.copyOf(var1);
   }

   private float m_8972(float var1, float var2) {
      float var3 = f_32293;
      return Mth.clamp((var2 + var3 - var1) / var3, 0.0F, 1.0F);
   }

   private int m_8973(
      BufferBuilder var1, Matrix4f var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11
   ) {
      float var12 = var6 - var3;
      float var13 = var7 - var4;
      float var14 = var8 - var5;
      float var15 = Mth.sqrt(var12 * var12 + var13 * var13 + var14 * var14);
      if (var15 < f_32295) {
         return 0;
      }

      float var16 = Math.abs(var12) < f_32296 ? 1.0F : 0.0F;
      float var17 = Math.abs(var12) < f_32297 ? 0.0F : 1.0F;
      float var18 = var17 * var14;
      float var19 = -var16 * var14;
      float var20 = var16 * var13 - var17 * var12;
      float var21 = Mth.sqrt(var18 * var18 + var19 * var19 + var20 * var20);
      if (var21 < f_32298) {
         return 0;
      }

      var18 = var18 / var21 * var9;
      var19 = var19 / var21 * var9;
      var20 = var20 / var21 * var9;
      float var22 = var13 * var20 - var14 * var19;
      float var23 = var14 * var18 - var12 * var20;
      float var24 = var12 * var19 - var13 * var18;
      float var25 = Mth.sqrt(var22 * var22 + var23 * var23 + var24 * var24);
      if (var25 < f_32299) {
         return 0;
      }

      var22 = var22 / var25 * var9;
      var23 = var23 / var25 * var9;
      var24 = var24 / var25 * var9;
      Vector4f var26 = Class_BftdentXEtGbugJw.m_2298(var10);
      Vector4f var27 = Class_BftdentXEtGbugJw.m_2298(var11);
      this.m_8979(
         var1,
         var2,
         var3 + var18,
         var4 + var19,
         var5 + var20,
         var3 - var18,
         var4 - var19,
         var5 - var20,
         var6 - var18,
         var7 - var19,
         var8 - var20,
         var6 + var18,
         var7 + var19,
         var8 + var20,
         var26
      );
      this.m_8979(
         var1,
         var2,
         var3 + var22,
         var4 + var23,
         var5 + var24,
         var3 - var22,
         var4 - var23,
         var5 - var24,
         var6 - var22,
         var7 - var23,
         var8 - var24,
         var6 + var22,
         var7 + var23,
         var8 + var24,
         var26
      );
      float var28 = f_32300;
      this.m_8979(
         var1,
         var2,
         var3 + var18 * var28,
         var4 + var19 * var28,
         var5 + var20 * var28,
         var3 - var18 * var28,
         var4 - var19 * var28,
         var5 - var20 * var28,
         var6 - var18 * var28,
         var7 - var19 * var28,
         var8 - var20 * var28,
         var6 + var18 * var28,
         var7 + var19 * var28,
         var8 + var20 * var28,
         var27
      );
      return 12;
   }

   private int m_8974(
      BufferBuilder var1,
      Matrix4f var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      int var15
   ) {
      Vector4f var16 = Class_BftdentXEtGbugJw.m_2298(var15);
      this.m_9016(var1, var2, var3, var4, var5, var16);
      this.m_9016(var1, var2, var6, var7, var8, var16);
      this.m_9016(var1, var2, var9, var10, var11, var16);
      this.m_9016(var1, var2, var12, var13, var14, var16);
      return 4;
   }

   private void m_8975(Class_TZhU50s8XmBQCMP5 var1) {
      if (f_11537.player != null && f_11537.level != null && f_11537.gameRenderer != null) {
         float var2 = var1.m_5005().getGameTimeDeltaPartialTick(true);
         Vec3 var3 = f_11537.gameRenderer.mainCamera().position();
         Matrix4f var4 = var1.m_5006().last().pose();
         BufferBuilder var5 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
         int var6 = 0;
         if (this.f_32155.m_8768() && this.m_9010()) {
            var6 += this.m_8999(var5, var4, var3, var2);
         }

         if (this.f_32154.m_8768() && !this.f_32174.isEmpty()) {
            Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv var7 = this.m_9008();
            if (var7 != null) {
               this.f_32173 = var7;
            }

            Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv var8 = this.f_32173 != null ? this.f_32173 : Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv.TRAP;
            var6 += this.m_8982(var5, var4, var3, var2, var8);
         }

         this.m_8969(var5, var6);
      }
   }

   private void m_8976(Class_B6JOzHnwhU3pe4AO var1) {
      if (var1.m_2116() == 1 && var1.m_2117() >= 0 && f_11537.gui.screen() == null) {
         if (this.f_32156.m_8768() && this.m_8987(this.f_32157, var1.m_2117())) {
            this.m_9014();
         } else if (this.f_32159 == RwHelper.NzES1eNTXjIvLBnv.IDLE) {
            Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv var2 = this.m_8978(var1.m_2117());
            if (var2 != null) {
               int var3 = this.m_9011(var2);
               if (var3 == -1) {
                  Class_ftHu9o3WzCU3Adxm.m_6731(var2.m_7226() + "");
               } else {
                  this.f_32160 = var2;
                  if (var2.m_7228() == Class_i7qN6fWCX6JrM0uQ.EO1PV73dTsElS2tH.USE) {
                     this.f_32159 = RwHelper.NzES1eNTXjIvLBnv.USE_TRAP;
                  } else {
                     this.f_32159 = RwHelper.NzES1eNTXjIvLBnv.SWAP_OFFHAND;
                  }

                  this.f_32165 = System.currentTimeMillis();
               }
            }
         }
      }
   }

   private Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv m_8978(int var1) {
      if (this.m_8987(this.f_32147, var1)) {
         return Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv.TRAP;
      } else if (this.m_8987(this.f_32148, var1)) {
         return Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv.ENDER_TRAP;
      } else if (this.m_8987(this.f_32149, var1)) {
         return Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv.STONE_TRAP;
      } else if (this.m_8987(this.f_32150, var1)) {
         return Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv.HELL_TRAP;
      } else if (this.m_8987(this.f_32151, var1)) {
         return Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv.ANTI_FLIGHT;
      } else {
         return this.m_8987(this.f_32152, var1) ? Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv.DARK_PULSE : null;
      }
   }

   private void m_8979(
      BufferBuilder var1,
      Matrix4f var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      Vector4f var15
   ) {
      this.m_9016(var1, var2, var3, var4, var5, var15);
      this.m_9016(var1, var2, var6, var7, var8, var15);
      this.m_9016(var1, var2, var9, var10, var11, var15);
      this.m_9016(var1, var2, var12, var13, var14, var15);
   }

   private void m_8980() {
      if (this.f_32166) {
         if (f_11537.options != null) {
            f_11537.options.keyShift.setDown(false);
         }

         this.f_32166 = false;
      }
   }

   private static int m_8981(int var0, float var1) {
      return Math.round(f_32304 * Mth.clamp(var1, 0.0F, 1.0F)) << 24 | var0 & f_32305;
   }

   private int m_8982(BufferBuilder var1, Matrix4f var2, Vec3 var3, float var4, Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv var5) {
      float var6 = ((float)f_11537.level.getGameTime() + var4) * f_32257;
      boolean var7 = var5 == Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv.ENDER_TRAP;
      int var8 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
      int var9 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN_TWO);
      int var10 = Class_BftdentXEtGbugJw.m_2312(var8, var7 ? f_32258 : f_32259, f_32260);
      int var11 = Class_BftdentXEtGbugJw.m_2312(var9, var7 ? f_32261 : f_32262, f_32263);
      float var12 = Math.max(f_32264, f_32145 - f_32144);
      int var13 = 0;

      for (RwHelper.y8hMpcnulALY81kb var15 : this.f_32174) {
         if (!var15.m_8957()) {
            float var16 = var15.m_8965();
            if (!(var16 <= f_32265)) {
               float var17 = var15.m_8958();
               float var18 = var15.m_8962() * (1.0F - this.m_9012(var15.m_8956()));
               if (!(var18 <= f_32266)) {
                  Player var19 = this.m_8968(var15.f_32110);
                  double var20;
                  double var22;
                  double var24;
                  if (var19 != null) {
                     var20 = Mth.lerp(var4, var19.xo, var19.getX());
                     var22 = Mth.lerp(var4, var19.yo, var19.getY());
                     var24 = Mth.lerp(var4, var19.zo, var19.getZ());
                     var15.m_8964(var20, var22, var24, var19.getId());
                  } else {
                     var20 = var15.f_32114;
                     var22 = var15.f_32115;
                     var24 = var15.f_32116;
                  }

                  BlockPos var26 = BlockPos.containing(var20, var22, var24).above();
                  float var27 = var26.getX() + f_32267;
                  float var28 = var26.getY() + (f_32144 + f_32145) * f_32268;
                  float var29 = var26.getZ() + f_32269;
                  float var30 = f_32270 + f_32271 * Mth.sin(var6 * f_32272 + var15.f_32117 * f_32273);

                  for (RwHelper.alREtzPbGMoaP6IY var32 : f_32142) {
                     float var33 = (var32.m_8949() + f_32274 - f_32144) / var12;
                     float var34 = this.m_8972(var33, var18);
                     if (!(var34 <= f_32275)) {
                        BlockPos var35 = var26.offset(var32.m_8948(), var32.m_8949(), var32.m_8947());
                        float var36 = f_32276
                           + f_32277 * Mth.sin(var6 * f_32278 + var32.m_8948() * f_32279 + var32.m_8949() * f_32280 + var32.m_8947() * f_32281);
                        var13 += this.m_8984(
                           var1,
                           var2,
                           var3,
                           var35,
                           var32.axis(),
                           var32.positive(),
                           var27,
                           var28,
                           var29,
                           var17,
                           m_8981(var10, (f_32282 + f_32283 * var36 * var30) * var16 * var34)
                        );
                     }
                  }

                  for (RwHelper.x9aLodu5PIhQDhta var43 : f_32143) {
                     float var44 = (var43.m_8951() + var43.m_8953()) * f_32284;
                     float var45 = (var44 - f_32144) / var12;
                     float var46 = this.m_8972(var45, var18);
                     if (!(var46 <= f_32285)) {
                        float var47 = this.m_8986(var26.getX() + var43.m_8954(), var27, var17) - (float)var3.x;
                        float var37 = this.m_8986(var26.getY() + var43.m_8951(), var28, var17) - (float)var3.y;
                        float var38 = this.m_8986(var26.getZ() + var43.m_8950(), var29, var17) - (float)var3.z;
                        float var39 = this.m_8986(var26.getX() + var43.m_8952(), var27, var17) - (float)var3.x;
                        float var40 = this.m_8986(var26.getY() + var43.m_8953(), var28, var17) - (float)var3.y;
                        float var41 = this.m_8986(var26.getZ() + var43.m_8955(), var29, var17) - (float)var3.z;
                        var13 += this.m_8973(
                           var1,
                           var2,
                           var47,
                           var37,
                           var38,
                           var39,
                           var40,
                           var41,
                           f_32286 * (f_32287 + f_32288 * var17),
                           m_8981(var11, (f_32289 + f_32290 * var30) * var16 * var46),
                           m_8981(var10, (f_32291 + f_32292 * var30) * var16 * var46)
                        );
                     }
                  }
               }
            }
         }
      }

      return var13;
   }

   private static boolean m_8983(Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv var0) {
      return var0 == Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv.TRAP
         || var0 == Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv.ENDER_TRAP
         || var0 == Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv.STONE_TRAP
         || var0 == Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv.HELL_TRAP;
   }

   private int m_8984(
      BufferBuilder var1, Matrix4f var2, Vec3 var3, BlockPos var4, int var5, boolean var6, float var7, float var8, float var9, float var10, int var11
   ) {
      float var12 = f_32294;
      float var13 = this.m_8986(var4.getX() + var12, var7, var10) - (float)var3.x;
      float var14 = this.m_8986(var4.getX() + 1.0F - var12, var7, var10) - (float)var3.x;
      float var15 = this.m_8986(var4.getY() + var12, var8, var10) - (float)var3.y;
      float var16 = this.m_8986(var4.getY() + 1.0F - var12, var8, var10) - (float)var3.y;
      float var17 = this.m_8986(var4.getZ() + var12, var9, var10) - (float)var3.z;
      float var18 = this.m_8986(var4.getZ() + 1.0F - var12, var9, var10) - (float)var3.z;
      Vector4f var19 = Class_BftdentXEtGbugJw.m_2298(var11);
      switch (var5) {
         case 0:
            float var22 = var6 ? var14 : var13;
            this.m_8979(var1, var2, var22, var15, var17, var22, var16, var17, var22, var16, var18, var22, var15, var18, var19);
            break;
         case 1:
            float var21 = var6 ? var16 : var15;
            this.m_8979(var1, var2, var13, var21, var17, var14, var21, var17, var14, var21, var18, var13, var21, var18, var19);
            break;
         default:
            float var20 = var6 ? var18 : var17;
            this.m_8979(var1, var2, var13, var15, var20, var14, var15, var20, var14, var16, var20, var13, var16, var20, var19);
      }

      return 4;
   }

   public RwHelper() {
      super(f_32179, f_32180, Category.MISC);
      this.f_32147 = new IntegerSetting(f_32181);
      this.f_32148 = new IntegerSetting(f_32182);
      this.f_32149 = new IntegerSetting(f_32183);
      this.f_32150 = new IntegerSetting(f_32184);
      this.f_32151 = new IntegerSetting(f_32185);
      this.f_32152 = new IntegerSetting(f_32186);
      this.f_32153 = new SliderSetting(f_32187, f_32188, 2.0F, f_32189).m_828(f_32190);
      this.f_32154 = new CheckboxSetting(f_32191, true);
      this.f_32155 = new CheckboxSetting(f_32192, true);
      this.f_32156 = new CheckboxSetting(f_32193, true);
      this.f_32157 = new IntegerSetting(f_32194, -1, this.f_32156::m_8768);
      this.f_32158 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_32195)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_32196))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_32197))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2722();
      this.f_32159 = RwHelper.NzES1eNTXjIvLBnv.IDLE;
      this.f_32161 = -1;
      this.f_32162 = -1;
      this.f_32163 = -1;
      this.f_32164 = -1;
      this.f_32172 = f_32198;
      this.f_32174 = new ArrayList<>(2);
      this.f_32175 = this::m_8976;
      this.f_32176 = this::m_8998;
      this.f_32177 = this::m_8997;
      this.f_32178 = this::m_8975;
      this.m_795(
         this.f_32147,
         this.f_32148,
         this.f_32149,
         this.f_32150,
         this.f_32151,
         this.f_32152,
         this.f_32153,
         this.f_32154,
         this.f_32155,
         this.f_32156,
         this.f_32157
      );
   }

   private void m_8985(UUID var1) {
      for (RwHelper.y8hMpcnulALY81kb var3 : this.f_32174) {
         if (var3.f_32110.equals(var1)) {
            var3.m_8961();
            return;
         }
      }

      this.f_32174.add(new RwHelper.y8hMpcnulALY81kb(var1));
      int var5 = 0;

      for (RwHelper.y8hMpcnulALY81kb var4 : this.f_32174) {
         if (!var4.m_8959()) {
            var5++;
         }
      }

      if (var5 > 2) {
         for (RwHelper.y8hMpcnulALY81kb var8 : this.f_32174) {
            if (!var8.m_8959()) {
               var8.m_8960();
               break;
            }
         }
      }
   }

   private float m_8986(float var1, float var2, float var3) {
      return var2 + (var1 - var2) * var3;
   }

   private boolean m_8987(IntegerSetting var1, int var2) {
      return var1.m_8768() >= 0 && var1.m_8768() == var2;
   }

   private int m_8988(int var1) {
      return var1 < 9 ? var1 + 36 : var1;
   }

   private void m_8989() {
      if (this.f_32166) {
         this.m_8980();
      }

      this.f_32159 = RwHelper.NzES1eNTXjIvLBnv.IDLE;
      this.f_32160 = null;
      this.f_32161 = -1;
      this.f_32162 = -1;
      this.f_32163 = -1;
      this.f_32164 = -1;
      this.f_32165 = 0L;
   }

   private static double m_8991(double var0, double var2, double var4) {
      return var0 * var0 + var2 * var2 + var4 * var4;
   }

   private void m_8992() {
      if (this.f_32160 == null) {
         this.m_8989();
      } else {
         Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv var1 = Class_i7qN6fWCX6JrM0uQ.m_7234(f_11537.player.getOffhandItem());
         if (var1 != this.f_32160) {
            if (System.currentTimeMillis() - this.f_32165 > f_32207) {
               this.m_8989();
            }
         } else {
            this.m_9018();
            if (System.currentTimeMillis() - this.f_32165 >= f_32208) {
               this.m_8980();
               if (this.f_32164 != -1) {
                  this.f_32159 = RwHelper.NzES1eNTXjIvLBnv.RESTORE_OFFHAND;
                  this.f_32165 = System.currentTimeMillis();
               } else {
                  this.m_8989();
               }
            }
         }
      }
   }

   private float m_8993(float var1) {
      var1 = Mth.clamp(var1, 0.0F, 1.0F);
      return var1 * var1 * var1 * (var1 * (var1 * f_32301 - f_32302) + f_32303);
   }

   static {
      float var0 = Float.POSITIVE_INFINITY;
      float var1 = Float.NEGATIVE_INFINITY;

      for (BlockPos var3 : f_32140) {
         var0 = Math.min(var0, var3.getY());
         var1 = Math.max(var1, var3.getY() + 1.0F);
      }

      f_32144 = var0;
      f_32145 = var1;
   }

   private int m_8994(BufferBuilder var1, Matrix4f var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10) {
      Vector4f var11 = Class_BftdentXEtGbugJw.m_2298(var9);
      Vector4f var12 = Class_BftdentXEtGbugJw.m_2298(var10);
      this.m_9016(var1, var2, var3, var4, var5, var11);
      this.m_9016(var1, var2, var6, var4, var8, var11);
      this.m_9016(var1, var2, var6, var7, var8, var12);
      this.m_9016(var1, var2, var3, var7, var5, var12);
      return 4;
   }

   private void m_8995() {
      if (this.f_32162 != -1 && (this.f_32161 != -1 || this.f_32163 != -1)) {
         Class_8x4deAyjocMIBSj7.Class_8xzBZ83gOSc56UI6 var1 = this.f_32146.m_1901(() -> {
            if (this.f_32163 != -1) {
               f_11537.player.getInventory().selected = this.f_32162;
            } else {
               Class_B6vpBUNmRtH3JzmV.m_2129(this.f_32162, this.f_32161);
            }
         }, true);
         if (var1 == Class_8x4deAyjocMIBSj7.Class_8xzBZ83gOSc56UI6.SUCCESS) {
            this.m_8989();
         }
      } else {
         this.m_8989();
      }
   }

   private static List<RwHelper.alREtzPbGMoaP6IY> m_8996() {
      ArrayList var0 = new ArrayList();
      int[][] var1 = new int[][]{{1, 0, 0}, {-1, 0, 0}, {0, 1, 0}, {0, -1, 0}, {0, 0, 1}, {0, 0, -1}};

      for (BlockPos var3 : f_32140) {
         for (int var4 = 0; var4 < var1.length; var4++) {
            int var5 = var3.getX() + var1[var4][0];
            int var6 = var3.getY() + var1[var4][1];
            int var7 = var3.getZ() + var1[var4][2];
            if (!f_32141.contains(BlockPos.asLong(var5, var6, var7))) {
               int var8 = var4 / 2;
               boolean var9 = var4 % 2 == 0;
               var0.add(new RwHelper.alREtzPbGMoaP6IY(var3.getX(), var3.getY(), var3.getZ(), var8, var9));
            }
         }
      }

      return List.copyOf(var0);
   }

   private void m_8997(Class_wjdoxQGtI8mFyL6U var1) {
      if (var1.m_9372() == Class_wjdoxQGtI8mFyL6U.Class_327mRdjAqNoPaemJ.POST) {
         if (var1.m_9371() == f_11537.player) {
            if (var1.m_9370() instanceof Player var2) {
               if (var2.isAlive() && !var2.isSpectator()) {
                  if (this.m_9008() != null) {
                     if (!(f_11537.player.distanceTo(var2) > this.f_32153.m_8768() + f_32200)) {
                        this.m_8985(var2.getUUID());
                     }
                  }
               }
            }
         }
      }
   }

   private void m_8998(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null && f_11537.gameMode != null) {
         this.m_9001();
         this.m_9007();
         if (this.f_32166 && this.f_32159 == RwHelper.NzES1eNTXjIvLBnv.IDLE) {
            this.m_8980();
         }

         switch (this.f_32159) {
            case USE_TRAP:
               this.m_8966();
               break;
            case RESTORE_TRAP:
               this.m_8995();
               break;
            case SWAP_OFFHAND:
               this.m_9000();
               break;
            case SNEAK:
               this.m_8992();
               break;
            case RESTORE_OFFHAND:
               this.m_9005();
         }
      } else {
         this.m_8989();
         this.m_9003();
         this.f_32170 = false;
         this.f_32174.clear();
      }
   }

   private int m_8999(BufferBuilder var1, Matrix4f var2, Vec3 var3, float var4) {
      ChunkPos var5 = this.f_32167;
      double var6 = this.f_32168;
      float var8 = (var5.x() << 4) - (float)var3.x;
      float var9 = (var5.x() << 4) + 16 - (float)var3.x;
      float var10 = (var5.z() << 4) - (float)var3.z;
      float var11 = (var5.z() << 4) + 16 - (float)var3.z;
      float var12 = (float)(var6 - var3.y);
      float var13 = var12 - 1.0F;
      float var14 = var12 + f_32210;
      float var15 = Mth.clamp((float)(System.currentTimeMillis() - this.f_32171) / f_32211, 0.0F, 1.0F);
      float var16 = this.m_8993(var15);
      float var17 = this.m_9012(var15);
      float var18 = this.f_32172 < 0L ? 0.0F : Mth.clamp((float)(System.currentTimeMillis() - this.f_32172) / f_32212, 0.0F, 1.0F);
      float var19 = var16 * (1.0F - this.m_8993(var18));
      if (var19 <= f_32213) {
         return 0;
      }

      float var20 = (f_32214 + f_32215 * var17) * (1.0F - var18 * f_32216);
      float var21 = var13 + (var14 - var13) * var20;
      float var22 = Mth.sin(var15 * f_32217) * f_32218;
      float var23 = f_32219 * (f_32220 + f_32221 * var17);
      float var24 = ((float)f_11537.level.getGameTime() + var4) * f_32222;
      int var25 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
      int var26 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN_TWO);
      int var27 = Class_BftdentXEtGbugJw.m_2312(var25, f_32223, f_32224);
      int var28 = 0;
      var28 += this.m_8974(
         var1,
         var2,
         var8,
         var13 + f_32225,
         var10,
         var9,
         var13 + f_32226,
         var10,
         var9,
         var13 + f_32227,
         var11,
         var8,
         var13 + f_32228,
         var11,
         m_8981(var27, f_32229 * var19)
      );
      var28 += this.m_8974(
         var1,
         var2,
         var8,
         var13 + f_32230,
         var10,
         var8 + var23,
         var13 + f_32231,
         var10,
         var8 + var23,
         var13 + f_32232,
         var11,
         var8,
         var13 + f_32233,
         var11,
         m_8981(var25, f_32234 * var19)
      );
      var28 += this.m_8974(
         var1,
         var2,
         var9 - var23,
         var13 + f_32235,
         var10,
         var9,
         var13 + f_32236,
         var10,
         var9,
         var13 + f_32237,
         var11,
         var9 - var23,
         var13 + f_32238,
         var11,
         m_8981(var25, f_32239 * var19)
      );
      var28 += this.m_8974(
         var1,
         var2,
         var8,
         var13 + f_32240,
         var10,
         var9,
         var13 + f_32241,
         var10,
         var9,
         var13 + f_32242,
         var10 + var23,
         var8,
         var13 + f_32243,
         var10 + var23,
         m_8981(var25, f_32244 * var19)
      );
      var28 += this.m_8974(
         var1,
         var2,
         var8,
         var13 + f_32245,
         var11 - var23,
         var9,
         var13 + f_32246,
         var11 - var23,
         var9,
         var13 + f_32247,
         var11,
         var8,
         var13 + f_32248,
         var11,
         m_8981(var25, f_32249 * var19)
      );
      float var29 = f_32250 + f_32251 * Mth.sin(var24 * f_32252);
      int var30 = m_8981(var27, (f_32253 + f_32254 * var29) * var19);
      int var31 = m_8981(var26, f_32255 * var19);
      var28 += this.m_8994(var1, var2, var8, var13, var10, var9, var21, var10, var30, var31);
      var28 += this.m_8994(var1, var2, var9, var13, var10, var9, var21, var11, var30, var31);
      var28 += this.m_8994(var1, var2, var9, var13, var11, var8, var21, var11, var30, var31);
      var28 += this.m_8994(var1, var2, var8, var13, var11, var8, var21, var10, var30, var31);
      return var28
         + this.m_8974(
            var1,
            var2,
            var8,
            var21 + var22,
            var10,
            var9,
            var21 + var22,
            var10,
            var9,
            var21 + var22,
            var11,
            var8,
            var21 + var22,
            var11,
            m_8981(var25, f_32256 * var19)
         );
   }

   private void m_9000() {
      if (this.f_32160 == null) {
         this.m_8989();
      } else {
         Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv var1 = Class_i7qN6fWCX6JrM0uQ.m_7234(f_11537.player.getOffhandItem());
         if (var1 == this.f_32160) {
            this.f_32159 = RwHelper.NzES1eNTXjIvLBnv.SNEAK;
            this.f_32165 = System.currentTimeMillis();
         } else {
            int var2 = this.m_9011(this.f_32160);
            if (var2 == -1) {
               Class_ftHu9o3WzCU3Adxm.m_6731(this.f_32160.m_7226() + "");
               this.m_8989();
            } else if (var2 == 40) {
               this.f_32159 = RwHelper.NzES1eNTXjIvLBnv.SNEAK;
               this.f_32165 = System.currentTimeMillis();
            } else {
               this.f_32164 = this.m_8988(var2);
               f_11537.gameMode.handleContainerInput(f_11537.player.containerMenu.containerId, this.f_32164, 40, ContainerInput.SWAP, f_11537.player);
               if (f_11537.gui.screen() == null) {
                  f_11537.player.connection.send(new ServerboundContainerClosePacket(f_11537.player.containerMenu.containerId));
               }

               this.f_32159 = RwHelper.NzES1eNTXjIvLBnv.SNEAK;
               this.f_32165 = System.currentTimeMillis();
            }
         }
      }
   }

   private void m_9001() {
      boolean var1 = Class_i7qN6fWCX6JrM0uQ.m_7233().m_7239(Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv.ANTI_FLIGHT);
      long var2 = System.currentTimeMillis();
      if (var1 && !this.f_32170 && f_11537.player != null) {
         this.f_32169 = true;
         this.f_32171 = var2;
         this.f_32172 = f_32201;
         this.f_32167 = f_11537.player.chunkPosition();
         this.f_32168 = f_11537.player.getY();
      }

      this.f_32170 = var1;
      if (this.f_32169 || this.f_32172 >= 0L) {
         boolean var4 = this.f_32169 && var2 - this.f_32171 < f_32202;
         if (var4 && f_11537.player != null) {
            this.f_32167 = f_11537.player.chunkPosition();
            this.f_32168 = f_11537.player.getY();
         } else {
            if (this.f_32169) {
               this.f_32169 = false;
               this.f_32172 = var2;
            }

            if (this.f_32172 >= 0L && var2 - this.f_32172 >= f_32203) {
               this.m_9003();
            }
         }
      }
   }

   private void m_9003() {
      this.f_32167 = null;
      this.f_32169 = false;
      this.f_32171 = 0L;
      this.f_32172 = f_32204;
   }

   private static float[][] m_9004(RwHelper.alREtzPbGMoaP6IY var0) {
      return switch (var0.axis()) {
         case 0 -> {
            float var3 = var0.positive() ? 1.0F : 0.0F;
            yield new float[][]{{var3, 0.0F, 0.0F}, {var3, 1.0F, 0.0F}, {var3, 1.0F, 1.0F}, {var3, 0.0F, 1.0F}};
         }
         case 1 -> {
            float var2 = var0.positive() ? 1.0F : 0.0F;
            yield new float[][]{{0.0F, var2, 0.0F}, {1.0F, var2, 0.0F}, {1.0F, var2, 1.0F}, {0.0F, var2, 1.0F}};
         }
         default -> {
            float var1 = var0.positive() ? 1.0F : 0.0F;
            yield new float[][]{{0.0F, 0.0F, var1}, {1.0F, 0.0F, var1}, {1.0F, 1.0F, var1}, {0.0F, 1.0F, var1}};
         }
      };
   }

   private void m_9005() {
      if (this.f_32164 != -1 && f_11537.player != null) {
         if (System.currentTimeMillis() - this.f_32165 >= f_32209) {
            f_11537.gameMode.handleContainerInput(f_11537.player.containerMenu.containerId, this.f_32164, 40, ContainerInput.SWAP, f_11537.player);
            if (f_11537.gui.screen() == null) {
               f_11537.player.connection.send(new ServerboundContainerClosePacket(f_11537.player.containerMenu.containerId));
            }

            this.m_8989();
         }
      } else {
         this.m_8989();
      }
   }

   public float m_9006() {
      return this.f_32153.m_8768();
   }

   private void m_9007() {
      long var1 = System.currentTimeMillis();
      boolean var3 = this.m_9008() != null;
      float var4 = this.f_32153.m_8768() + f_32205;
      Iterator var5 = this.f_32174.iterator();

      while (var5.hasNext()) {
         RwHelper.y8hMpcnulALY81kb var6 = (RwHelper.y8hMpcnulALY81kb)var5.next();
         if (var6.m_8957()) {
            var5.remove();
         } else {
            Player var7 = this.m_8968(var6.f_32110);
            boolean var8 = !var3
               || var7 == null
               || !var7.isAlive()
               || var7.isSpectator()
               || f_11537.player.distanceTo(var7) > var4
               || var1 - var6.f_32112 > f_32206;
            if (var8) {
               if (!var6.m_8959()) {
                  var6.m_8960();
               }

               if (var6.m_8957()) {
                  var5.remove();
               }
            }
         }
      }
   }

   private Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv m_9008() {
      if (f_11537.player == null) {
         return null;
      }

      Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv var1 = Class_i7qN6fWCX6JrM0uQ.m_7234(f_11537.player.getMainHandItem());
      if (m_8983(var1)) {
         return var1;
      }

      Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv var2 = Class_i7qN6fWCX6JrM0uQ.m_7234(f_11537.player.getOffhandItem());
      return m_8983(var2) ? var2 : null;
   }

   private boolean m_9010() {
      return this.f_32155.m_8768() && this.f_32167 != null && (this.f_32169 || this.f_32172 >= 0L);
   }

   private int m_9011(Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv var1) {
      if (f_11537.player != null && var1 != null) {
         if (Class_i7qN6fWCX6JrM0uQ.m_7234(f_11537.player.getOffhandItem()) == var1) {
            return 40;
         }

         for (int var2 = 0; var2 < 36; var2++) {
            if (Class_i7qN6fWCX6JrM0uQ.m_7234(f_11537.player.getInventory().getItem(var2)) == var1) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   private float m_9012(float var1) {
      float var2 = 1.0F - Mth.clamp(var1, 0.0F, 1.0F);
      return 1.0F - var2 * var2 * var2;
   }

   private static Set<Long> m_9013(List<BlockPos> var0) {
      LinkedHashSet var1 = new LinkedHashSet();

      for (BlockPos var3 : var0) {
         var1.add(BlockPos.asLong(var3.getX(), var3.getY(), var3.getZ()));
      }

      return Set.copyOf(var1);
   }

   @Override
   public void m_732() {
      this.m_8989();
      this.m_9003();
      this.f_32170 = false;
      this.f_32174.clear();
   }

   private void m_9014() {
      if (f_11537.player != null) {
         BlockPos var1 = f_11537.player.blockPosition();
         Class_ftHu9o3WzCU3Adxm.m_6723("" + var1.getX() + var1.getY() + var1.getZ());
      }
   }

   public List<Class_PlAkZAQgfIOFZi5F> m_9015() {
      return List.of(
         new Class_PlAkZAQgfIOFZi5F(Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv.TRAP.m_7227(), this.f_32147.m_8768()),
         new Class_PlAkZAQgfIOFZi5F(Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv.ENDER_TRAP.m_7227(), this.f_32148.m_8768(), Class_wHRRCm2tlLY7DN4I.m_9311(f_32199)),
         new Class_PlAkZAQgfIOFZi5F(Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv.STONE_TRAP.m_7227(), this.f_32149.m_8768()),
         new Class_PlAkZAQgfIOFZi5F(Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv.HELL_TRAP.m_7227(), this.f_32150.m_8768()),
         new Class_PlAkZAQgfIOFZi5F(Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv.ANTI_FLIGHT.m_7227(), this.f_32151.m_8768()),
         new Class_PlAkZAQgfIOFZi5F(Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv.DARK_PULSE.m_7227(), this.f_32152.m_8768())
      );
   }

   private void m_9016(BufferBuilder var1, Matrix4f var2, float var3, float var4, float var5, Vector4f var6) {
      var1.addVertex(var2, var3, var4, var5).setUv(0.0F, 0.0F).setColor(var6.x, var6.y, var6.z, var6.w);
   }

   private static long m_9017(float var0, float var1, float var2, float var3, float var4, float var5) {
      int var6 = Math.round(var0 * 2.0F);
      int var7 = Math.round(var1 * 2.0F);
      int var8 = Math.round(var2 * 2.0F);
      int var9 = Math.round(var3 * 2.0F);
      int var10 = Math.round(var4 * 2.0F);
      int var11 = Math.round(var5 * 2.0F);
      long var12 = m_8970(var6, var7, var8);
      long var14 = m_8970(var9, var10, var11);
      return var12 <= var14 ? var12 << 32 | var14 & f_32306 : var14 << 32 | var12 & f_32307;
   }

   private void m_9018() {
      if (f_11537.options != null) {
         this.f_32166 = true;
         f_11537.options.keyShift.setDown(true);
      }
   }

   private enum NzES1eNTXjIvLBnv {
      IDLE,
      USE_TRAP,
      RESTORE_TRAP,
      SWAP_OFFHAND,
      SNEAK,
      RESTORE_OFFHAND;
   }

   private record alREtzPbGMoaP6IY(int ox, int oy, int oz, int axis, boolean positive) {
      public int m_8947() {
         return this.oz;
      }

      public int m_8948() {
         return this.ox;
      }

      public int m_8949() {
         return this.oy;
      }
   }

   private record x9aLodu5PIhQDhta(float x1, float y1, float z1, float x2, float y2, float z2) {
      public float m_8950() {
         return this.z1;
      }

      public float m_8951() {
         return this.y1;
      }

      public float m_8952() {
         return this.x2;
      }

      public float m_8953() {
         return this.y2;
      }

      public float m_8954() {
         return this.x1;
      }

      public float m_8955() {
         return this.z2;
      }
   }

   private static final class y8hMpcnulALY81kb {
      public final UUID f_32110;
      public final long f_32111;
      public long f_32112;
      public long f_32113;
      public double f_32114;
      public double f_32115;
      public double f_32116;
      public int f_32117;
      public static final long f_32118 = -1L;
      public static final long f_32119 = -1L;
      public static final long f_32120 = 380L;
      public static final float f_32121 = 420.0F;
      public static final float f_32122 = 380.0F;
      public static final float f_32123 = 6.0F;
      public static final float f_32124 = 15.0F;
      public static final float f_32125 = 10.0F;
      public static final float f_32126 = 6.0F;
      public static final float f_32127 = 15.0F;
      public static final float f_32128 = 10.0F;
      public static final float f_32129 = (float) Math.PI;
      public static final float f_32130 = 0.035F;
      public static final float f_32131 = 0.72F;
      public static final float f_32132 = 0.28F;
      public static final float f_32133 = 0.08F;

      public float m_8956() {
         return this.f_32113 < 0L ? 0.0F : Mth.clamp((float)(System.currentTimeMillis() - this.f_32113) / f_32122, 0.0F, 1.0F);
      }

      public boolean m_8957() {
         return this.f_32113 >= 0L && System.currentTimeMillis() - this.f_32113 >= f_32120;
      }

      public float m_8958() {
         float var1 = this.m_8963();
         float var2 = 1.0F - var1;
         float var3 = 1.0F - var2 * var2 * var2;
         float var4 = Mth.sin(var1 * f_32129) * f_32130;
         return f_32131 + var3 * f_32132 + var4 + this.m_8956() * f_32133;
      }

      public y8hMpcnulALY81kb(UUID var1) {
         this.f_32113 = f_32118;
         this.f_32110 = var1;
         long var2 = System.currentTimeMillis();
         this.f_32111 = var2;
         this.f_32112 = var2;
      }

      public boolean m_8959() {
         return this.f_32113 >= 0L;
      }

      public void m_8960() {
         if (this.f_32113 < 0L) {
            this.f_32113 = System.currentTimeMillis();
         }
      }

      public void m_8961() {
         this.f_32112 = System.currentTimeMillis();
         this.f_32113 = f_32119;
      }

      public float m_8962() {
         float var1 = this.m_8963();
         float var2 = 1.0F - var1;
         return 1.0F - var2 * var2 * var2;
      }

      public float m_8963() {
         return Mth.clamp((float)(System.currentTimeMillis() - this.f_32111) / f_32121, 0.0F, 1.0F);
      }

      public void m_8964(double var1, double var3, double var5, int var7) {
         this.f_32114 = var1;
         this.f_32115 = var3;
         this.f_32116 = var5;
         this.f_32117 = var7;
      }

      public float m_8965() {
         float var1 = this.m_8963();
         var1 = var1 * var1 * var1 * (var1 * (var1 * f_32123 - f_32124) + f_32125);
         float var2 = this.m_8956();
         var2 = var2 * var2 * var2 * (var2 * (var2 * f_32126 - f_32127) + f_32128);
         return var1 * (1.0F - var2);
      }
   }
}
