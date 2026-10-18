package dev.dimasik.client.module.render;

import com.mojang.blaze3d.textures.GpuTextureView;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ColorSetting;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_4LPzBXcCHZRVScpS;
import dev.dimasik.client.system.Class_BRwgyCXa8ZQRcJH3;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_SurII2wPoqIgB3n9;
import dev.dimasik.client.system.Class_U4Qsm43RVlUI3Pre;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_eXr9Fra2ad3yFXY8;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_w8fCJQ5ZtH5lQbWc;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import dev.dimasik.client.system.Class_zZgIgQUpIcqCwBUw;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.joml.Vector4i;

public class Arrows extends Module {
   private static final Pattern f_4321 = Pattern.compile(Arrows.f_4403);
   private static final Identifier f_4322 = Class_wHRRCm2tlLY7DN4I.m_9311(Arrows.f_4404);
   private static final Vector4f f_4323 = new Vector4f(0.0F);
   private static final Vector4f f_4324 = new Vector4f(0.0F, 0.0F, 1.0F, 1.0F);
   private final ItemListSetting f_4325;
   private final SliderSetting f_4326;
   private final CheckboxSetting f_4327;
   private final ColorSetting f_4328;
   private final Map<Integer, Vec3> f_4329;
   private final Map<Integer, Vec3> f_4330;
   private final List<Arrows.ik8czntdT9Dy3qz4> f_4331;
   private final Matrix4f f_4332;
   private final Matrix4f f_4333;
   private final Vector4i f_4334;
   private long f_4335;
   private int f_4336;
   private int f_4337;
   private int f_4338;
   private String f_4339;
   private final Class_w8fCJQ5ZtH5lQbWc f_4340;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_4341;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_4342;
   private static final String f_4343 = "Arrows";
   private static final String f_4344 = "Указатели на игроков";
   private static final String f_4345 = "Настройки";
   private static final String f_4346 = "Имя";
   private static final String f_4347 = "Дистанция";
   private static final String f_4348 = "Размер";
   private static final float f_4349 = 5.0F;
   private static final float f_4350 = 0.1F;
   private static final String f_4351 = "Игроки группы";
   private static final String f_4352 = "Цвет игроков группы";
   private static final int f_4353 = -9840385;
   private static final String f_4354 = "never-rendered";
   private static final float f_4355 = 6.6667F;
   private static final String f_4356 = "arrows-frame";
   private static final long f_4357 = 5000L;
   private static final String f_4358 = "no-world-or-player";
   private static final String f_4359 = "ARROWS_SKIP";
   private static final float f_4360 = 0.1F;
   private static final float f_4361 = 0.5F;
   private static final float f_4362 = 0.5F;
   private static final float f_4363 = 30.0F;
   private static final float f_4364 = 6.0F;
   private static final String f_4365 = "Имя";
   private static final String f_4366 = "Дистанция";
   private static final String f_4367 = "rendering";
   private static final String f_4368 = "party-visibility-off";
   private static final String f_4369 = "ARROWS_READ";
   private static final String f_4370 = "ARROW_FILTER";
   private static final String f_4371 = "ARROW_FILTER";
   private static final String f_4372 = "ARROW_QUEUE";
   private static final String f_4373 = "ARROW_FILTER";
   private static final String f_4374 = "ARROW_FILTER";
   private static final String f_4375 = "ARROW_DEDUP";
   private static final String f_4376 = "ARROW_QUEUE";
   private static final String f_4377 = "loaded-entity";
   private static final String f_4378 = "stored-irc-position";
   private static final String f_4379 = "no-arrow-entries";
   private static final String f_4380 = "party-visibility-off";
   private static final String f_4381 = "ARROWS_EMPTY";
   private static final float f_4382 = -1.0F;
   private static final float f_4383 = 0.5F;
   private static final float f_4384 = 0.5F;
   private static final String f_4385 = "ARROW_SUBMIT";
   private static final float f_4386 = 0.5F;
   private static final float f_4387 = 14.0F;
   private static final float f_4388 = 0.5F;
   private static final float f_4389 = 6.0F;
   private static final String f_4390 = "batch-completed";
   private static final String f_4391 = "ARROWS_BATCH_END";
   private static final String f_4392 = "ARROWS_ENABLE";
   private static final String f_4393 = "ARROWS_DISABLE";
   private static final double f_4394 = 90.0;
   private static final float f_4395 = 60.0F;
   private static final float f_4396 = 1.15F;
   private static final float f_4397 = 0.5F;
   private static final String f_4398 = "ARROW_FILTER";
   private static final double f_4399 = 150.0;
   private static final String f_4400 = "ARROW_FILTER";
   private static final long f_4401 = -1L;
   private static final long f_4402 = 1000000L;
   private static final String f_4403 = "^\\w{3,16}$";
   private static final String f_4404 = "hud/arrow";

   private int m_1871(
      int var1,
      String var2,
      String var3,
      double var4,
      double var6,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      int var13,
      int var14,
      int var15,
      int var16,
      boolean var17,
      boolean var18,
      boolean var19,
      boolean var20
   ) {
      float var21 = (float)(Math.toDegrees(Math.atan2(var6, var4)) - var8 - f_4394);
      double var22 = Math.toRadians(var21);
      float var24 = f_4395 * var11 * (var19 ? f_4396 : 1.0F);
      float var25 = var9 + var24 * (float)Math.sin(var22);
      float var26 = var10 - var24 * (float)Math.cos(var22);
      float var27 = (var12 + 1.0F) * f_4397;
      if (!(var25 + var27 <= 0.0F) && !(var25 - var27 >= var13) && !(var26 + var27 <= 0.0F) && !(var26 - var27 >= var14)) {
         int var28 = var19
            ? this.f_4328.m_8768()
            : (DimasikClient.m_9057().m_9049().m_2804().m_2877(var2) ? Class_BftdentXEtGbugJw.m_2303(0, 255, 0, f_4399) : var15);
         if (var28 >>> 24 == 0) {
            if (var20) {
               Class_BRwgyCXa8ZQRcJH3.m_2273(f_4400, var2 + "");
            }

            return var1;
         } else {
            Arrows.ik8czntdT9Dy3qz4 var29;
            if (var1 < this.f_4331.size()) {
               var29 = this.f_4331.get(var1);
            } else {
               var29 = new Arrows.ik8czntdT9Dy3qz4();
               this.f_4331.add(var29);
            }

            var29.m_1869(
               var25,
               var26,
               var12,
               var21,
               var11,
               var28,
               var16,
               var3,
               (int)Mth.sqrt((float)(var4 * var4 + var6 * var6)),
               var17 && var3 != null && !var3.isBlank(),
               var18
            );
            return var1 + 1;
         }
      } else {
         if (var20) {
            Class_BRwgyCXa8ZQRcJH3.m_2273(f_4398, var2 + var25 + var26);
         }

         return var1;
      }
   }

   public Arrows() {
      super(f_4343, f_4344, Category.RENDER);
      this.f_4325 = new ItemListSetting(f_4345, new Class_2ZaVm8TGDJ68TnJB(f_4346, true), new Class_2ZaVm8TGDJ68TnJB(f_4347, true));
      this.f_4326 = new SliderSetting(f_4348, 2.0F, 1.0F, f_4349).m_828(f_4350);
      this.f_4327 = new CheckboxSetting(f_4351, true);
      this.f_4328 = new ColorSetting(f_4352, true, f_4353).m_822(this.f_4327::m_8768);
      this.f_4329 = new HashMap<>();
      this.f_4330 = new HashMap<>();
      this.f_4331 = new ArrayList<>();
      this.f_4332 = new Matrix4f();
      this.f_4333 = new Matrix4f();
      this.f_4334 = new Vector4i();
      this.f_4339 = f_4354;
      this.f_4340 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_4355, Class_eXr9Fra2ad3yFXY8.f_19097);
      this.f_4341 = this::m_1872;
      this.f_4342 = this::m_1875;
      this.m_795(this.f_4325, this.f_4327, this.f_4328, this.f_4326);
   }

   private void m_1872(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.level != null && f_11537.player != null) {
         for (Player var3 : f_11537.level.players()) {
            if (var3 != f_11537.player) {
               this.f_4329.put(var3.getId(), this.f_4330.getOrDefault(var3.getId(), var3.position()));
               this.f_4330.put(var3.getId(), var3.position());
            }
         }

         this.f_4329.keySet().removeIf(var0 -> f_11537.level.getEntity(var0) == null);
         this.f_4330.keySet().removeIf(var0 -> f_11537.level.getEntity(var0) == null);
      }
   }

   public String m_1874() {
      return ""
         + this.m_776()
         + this.f_4327.m_8768()
         + this.f_4336
         + this.f_4337
         + this.f_4338
         + this.f_4339
         + (this.f_4335 == 0L ? f_4401 : (System.nanoTime() - this.f_4335) / f_4402);
   }

   private void m_1875(Class_bhRaN0YSSLQRYjPo var1) {
      this.f_4335 = System.nanoTime();
      this.f_4337 = 0;
      this.f_4338 = 0;
      boolean var2 = Class_BRwgyCXa8ZQRcJH3.m_2270(f_4356, f_4357);
      if (f_11537.level != null && f_11537.player != null) {
         this.f_4340.m_9283(this.f_4340.m_9284());
         float var3 = f_11537.gameRenderer.mainCamera().yRot();
         if (Math.abs(var3 - this.f_4340.m_9284()) >= f_4360) {
            this.f_4340.m_9283(var3);
         }

         float var4 = f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true);
         double var5 = Mth.lerp(var4, f_11537.player.xOld, f_11537.player.getX());
         double var7 = Mth.lerp(var4, f_11537.player.zOld, f_11537.player.getZ());
         float var9 = this.f_4326.m_8768();
         int var10 = f_11537.getWindow().getScreenWidth();
         int var11 = f_11537.getWindow().getScreenHeight();
         float var12 = var10 * f_4361;
         float var13 = var11 * f_4362;
         float var14 = f_4363 * var9;
         float var15 = (float)var10 / var11;
         float var16 = this.f_4340.m_9288();
         int var17 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
         int var18 = Math.max(1, Math.round(f_4364 * var9));
         boolean var19 = this.f_4325.m_7145(f_4365);
         boolean var20 = this.f_4325.m_7145(f_4366);
         int var21 = 0;
         Class_zZgIgQUpIcqCwBUw var22 = Class_zZgIgQUpIcqCwBUw.m_9905();
         boolean var23 = this.f_4327.m_8768();
         this.f_4336 = var22.m_9929().size();
         this.f_4339 = var23 ? f_4367 : f_4368;
         if (var2) {
            Class_BRwgyCXa8ZQRcJH3.m_2273(f_4369, this.m_1874() + var10 + var11);
         }

         HashSet var24 = new HashSet();

         for (Player var26 : f_11537.level.players()) {
            if (var26 != f_11537.player && var26.getId() != 1337 && !var26.isRemoved()) {
               String var27 = var26.getGameProfile().name();
               boolean var28 = var22.m_9911(var26.getUUID(), var27);
               if (var28) {
                  var24.add(var26.getUUID());
               }

               if (var28 && !var23) {
                  if (var2) {
                     Class_BRwgyCXa8ZQRcJH3.m_2273(f_4370, var26.getUUID() + "");
                  }
               } else if (var28 || var26.isAlive() && !var26.isSpectator() && !var26.isInvisible()) {
                  if (!f_4321.matcher(var27).matches()) {
                     if (var2 && var28) {
                        Class_BRwgyCXa8ZQRcJH3.m_2273(f_4371, var27 + "");
                     }
                  } else {
                     Vec3 var29 = this.f_4330.getOrDefault(var26.getId(), var26.position());
                     Vec3 var30 = this.f_4329.getOrDefault(var26.getId(), var29);
                     double var31 = Mth.lerp(var4, var30.x, var29.x) - var5;
                     double var33 = Mth.lerp(var4, var30.z, var29.z) - var7;
                     int var35 = var21;
                     String var36 = var28 ? var22.m_9916(var26.getUUID(), var27) : var27;
                     var21 = this.m_1871(
                        var21, var27, var36, var31, var33, var16, var12, var13, var9, var14, var10, var11, var17, var18, var19, var20, var28, var2 && var28
                     );
                     if (var21 > var35 && var28) {
                        this.f_4331.get(var35).f_4319 = true;
                        this.f_4337++;
                        if (var2) {
                           Class_BRwgyCXa8ZQRcJH3.m_2273(f_4372, var26.getUUID() + var27);
                        }
                     }
                  }
               }
            }
         }

         long var38 = System.nanoTime();

         for (Class_SurII2wPoqIgB3n9.LSyoMROniHgdEQeH var41 : var22.m_9929().values()) {
            if (!var23) {
               if (var2) {
                  Class_BRwgyCXa8ZQRcJH3.m_2273(f_4373, this.f_4336 + "");
               }
               break;
            }

            Class_4LPzBXcCHZRVScpS var43 = var41.m_4876();
            if (var43.uuid().equals(f_11537.player.getUUID())) {
               if (var2) {
                  Class_BRwgyCXa8ZQRcJH3.m_2273(f_4374, var43.uuid() + "");
               }
            } else if (var24.contains(var43.uuid())) {
               if (var2) {
                  Class_BRwgyCXa8ZQRcJH3.m_2273(f_4375, var43.uuid() + "");
               }
            } else {
               boolean var46 = var22.m_9895(var43);
               if (var46) {
                  Player var49 = var46 ? f_11537.level.getPlayerByUUID(var43.uuid()) : null;
                  double var32 = var41.m_4878(var38);
                  double var34 = var41.m_4879(var38);
                  if (var49 != null && !var49.isRemoved()) {
                     Vec3 var55 = this.f_4330.getOrDefault(var49.getId(), var49.position());
                     Vec3 var37 = this.f_4329.getOrDefault(var49.getId(), var55);
                     var32 = Mth.lerp(var4, var37.x, var55.x);
                     var34 = Mth.lerp(var4, var37.z, var55.z);
                  }

                  int var56 = var21;
                  var21 = this.m_1871(
                     var21,
                     var43.name(),
                     var43.member(),
                     var32 - var5,
                     var34 - var7,
                     var16,
                     var12,
                     var13,
                     var9,
                     var14,
                     var10,
                     var11,
                     var17,
                     var18,
                     var19,
                     var20,
                     true,
                     var2
                  );
                  if (var21 > var56) {
                     Arrows.ik8czntdT9Dy3qz4 var57 = this.f_4331.get(var56);
                     var57.f_4319 = true;
                     this.f_4337++;
                     if (var2) {
                        Class_BRwgyCXa8ZQRcJH3.m_2273(
                           f_4376,
                           var43.member()
                              + var43.uuid()
                              + (var49 != null && !var49.isRemoved() ? f_4377 : f_4378)
                              + var46
                              + var32
                              + var34
                              + var57.f_4306
                              + var57.f_4307
                              + var57.f_4309
                              + (var57.f_4311 >>> 24)
                        );
                     }
                  }
               }
            }
         }

         if (var21 == 0) {
            this.f_4339 = var23 ? f_4379 : f_4380;
            if (var2) {
               Class_BRwgyCXa8ZQRcJH3.m_2273(f_4381, this.m_1874());
            }
         } else {
            Class_Ssh31B3ljfKeWsvS.m_4814(this.f_4332.identity());
            this.f_4333.set(Class_Ssh31B3ljfKeWsvS.m_4853());
            Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588());
            Class_U4Qsm43RVlUI3Pre.m_5204(true);
            GpuTextureView var40 = f_11537.getTextureManager().getTexture(f_4322).getTextureView();
            Matrix4f var42 = Class_Ssh31B3ljfKeWsvS.m_4853();

            for (int var44 = 0; var44 < var21; var44++) {
               Arrows.ik8czntdT9Dy3qz4 var47 = this.f_4331.get(var44);
               float var50 = f_4382 + var47.f_4306 * 2.0F / var10;
               float var53 = 1.0F - var47.f_4307 * 2.0F / var11;
               var42.set(this.f_4333)
                  .translate(var50, var53, 0.0F)
                  .scale(1.0F, var15, 1.0F)
                  .rotateZ((float)(-Math.toRadians(var47.f_4309)))
                  .scale(1.0F, 1.0F / var15, 1.0F)
                  .translate(-var50, -var53, 0.0F);
               this.f_4334.set(var47.f_4311);
               Class_U4Qsm43RVlUI3Pre.m_5194(
                  var47.f_4306 - var47.f_4308 * f_4383,
                  var47.f_4307 - var47.f_4308 * f_4384,
                  var47.f_4308 + 1.0F,
                  var47.f_4308 + 1.0F,
                  f_4323,
                  f_4324,
                  this.f_4334,
                  var40
               );
               if (var47.f_4319) {
                  this.f_4338++;
                  if (var2) {
                     Class_BRwgyCXa8ZQRcJH3.m_2273(f_4385, var47.f_4313 + var47.f_4306 + var47.f_4307 + (var47.f_4311 >>> 24));
                  }
               }
            }

            var42.set(this.f_4333);
            Class_U4Qsm43RVlUI3Pre.m_5204(false);

            for (int var45 = 0; var45 < var21; var45++) {
               Arrows.ik8czntdT9Dy3qz4 var48 = this.f_4331.get(var45);
               if (var48.f_4317) {
                  float var51 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var48.f_4313, var48.f_4312);
                  Class_U4Qsm43RVlUI3Pre.m_5186(
                     Class_y1y6QpONhWEUIdEB.m_9588(), var48.f_4313, var48.f_4306 - var51 * f_4386, var48.f_4307 - f_4387 * var48.f_4310, var48.f_4312, -1
                  );
               }

               if (var48.f_4318) {
                  String var52 = var48.m_1870();
                  float var54 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var52, var48.f_4312);
                  Class_U4Qsm43RVlUI3Pre.m_5186(
                     Class_y1y6QpONhWEUIdEB.m_9588(), var52, var48.f_4306 - var54 * f_4388, var48.f_4307 + f_4389 * var48.f_4310, var48.f_4312, -1
                  );
               }
            }

            Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588());
            var42.set(this.f_4333);
            this.f_4339 = f_4390;
            if (var2) {
               Class_BRwgyCXa8ZQRcJH3.m_2273(f_4391, var21 + this.m_1874());
            }
         }
      } else {
         this.f_4339 = f_4358;
         if (var2) {
            Class_BRwgyCXa8ZQRcJH3.m_2273(f_4359, this.m_1874());
         }
      }
   }

   @Override
   public void m_778() {
      Class_BRwgyCXa8ZQRcJH3.m_2273(f_4392, this.m_1874());
   }

   @Override
   public void m_732() {
      Class_BRwgyCXa8ZQRcJH3.m_2273(f_4393, this.m_1874());
      this.f_4329.clear();
      this.f_4330.clear();
   }

   private static final class ik8czntdT9Dy3qz4 {
      public float f_4306;
      public float f_4307;
      public float f_4308;
      public float f_4309;
      public float f_4310;
      public int f_4311;
      public int f_4312;
      public String f_4313;
      public int f_4314;
      public int f_4315;
      public String f_4316;
      public boolean f_4317;
      public boolean f_4318;
      public boolean f_4319;
      public static final int f_4320 = Integer.MIN_VALUE;

      public ik8czntdT9Dy3qz4() {
         this.f_4315 = f_4320;
      }

      public void m_1869(float var1, float var2, float var3, float var4, float var5, int var6, int var7, String var8, int var9, boolean var10, boolean var11) {
         this.f_4306 = var1;
         this.f_4307 = var2;
         this.f_4308 = var3;
         this.f_4309 = var4;
         this.f_4310 = var5;
         this.f_4311 = var6;
         this.f_4312 = var7;
         this.f_4313 = var8;
         this.f_4314 = var9;
         this.f_4317 = var10;
         this.f_4318 = var11;
         this.f_4319 = false;
      }

      public String m_1870() {
         if (this.f_4314 != this.f_4315) {
            this.f_4315 = this.f_4314;
            this.f_4316 = this.f_4314 + "";
         }

         return this.f_4316;
      }
   }
}
