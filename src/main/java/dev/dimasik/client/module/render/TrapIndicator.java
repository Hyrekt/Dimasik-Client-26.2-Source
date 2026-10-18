package dev.dimasik.client.module.render;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.piston.PistonBaseBlock;
import net.minecraft.world.level.block.piston.PistonHeadBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.chunk.LevelChunkSection;
import net.minecraft.world.level.chunk.status.ChunkStatus;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector4f;
import org.joml.Vector4i;

public final class TrapIndicator extends Module {
   private static final Identifier f_8139 = Class_wHRRCm2tlLY7DN4I.m_9311(TrapIndicator.f_8238);
   private static final int f_8140 = 3;
   private static final int f_8141 = 70000;
   private static final int f_8142 = 40;
   private static final int f_8143 = 4;
   private final MultiChoiceSetting f_8144;
   private final SliderSetting f_8145;
   private final SliderSetting f_8146;
   private final ItemListSetting f_8147;
   private final CheckboxSetting f_8148;
   private final CheckboxSetting f_8149;
   private final SliderSetting f_8150;
   private final CheckboxSetting f_8151;
   private final Map<Long, TrapIndicator.xovRdRMYMRdaBy3F> f_8152;
   private final List<TrapIndicator.X4FKLu04sO0AlcAQ> f_8153;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_8154;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_8155;
   private ClientLevel f_8156;
   private TrapIndicator.lB9vJpjCzh0T7ak9 f_8157;
   private int f_8158;
   private int f_8159;
   private int f_8160;
   private int f_8161;
   private static final String f_8162 = "TrapIndicator";
   private static final String f_8163 = "Указывает направление на трапки рядом";
   private static final String f_8164 = "Область";
   private static final String f_8165 = "Радиус";
   private static final String f_8166 = "Чанк";
   private static final String f_8167 = "Радиус";
   private static final float f_8168 = 50.0F;
   private static final float f_8169 = 16.0F;
   private static final float f_8170 = 80.0F;
   private static final String f_8171 = "Порог";
   private static final float f_8172 = 20.0F;
   private static final float f_8173 = 8.0F;
   private static final float f_8174 = 80.0F;
   private static final String f_8175 = "Искать";
   private static final String f_8176 = "Стойки";
   private static final String f_8177 = "Поршни";
   private static final String f_8178 = "Верстаки";
   private static final String f_8179 = "Ворота";
   private static final String f_8180 = "Метка";
   private static final String f_8181 = "GPS-указатель";
   private static final String f_8182 = "Размер указателя";
   private static final float f_8183 = 5.0F;
   private static final float f_8184 = 0.1F;
   private static final String f_8185 = "Игнор. голограммы";
   private static final int f_8186 = Integer.MIN_VALUE;
   private static final int f_8187 = Integer.MIN_VALUE;
   private static final String f_8188 = "TRAP";
   private static final String f_8189 = "Трапка";
   private static final float f_8190 = 16.0F;
   private static final float f_8191 = 12.0F;
   private static final float f_8192 = 12.0F;
   private static final float f_8193 = 16.0F;
   private static final float f_8194 = 32.0F;
   private static final float f_8195 = 0.5F;
   private static final float f_8196 = 0.5F;
   private static final float f_8197 = 10.0F;
   private static final float f_8198 = 16.0F;
   private static final float f_8199 = 11.0F;
   private static final float f_8200 = 13.0F;
   private static final float f_8201 = 9.0F;
   private static final double f_8202 = 255.0;
   private static final float f_8203 = 12.0F;
   private static final float f_8204 = 11.0F;
   private static final float f_8205 = 0.5F;
   private static final float f_8206 = 90.0F;
   private static final float f_8207 = 0.5F;
   private static final float f_8208 = 0.5F;
   private static final float f_8209 = 60.0F;
   private static final float f_8210 = 60.0F;
   private static final float f_8211 = 30.0F;
   private static final float f_8212 = -1.0F;
   private static final float f_8213 = 0.5F;
   private static final float f_8214 = 0.5F;
   private static final float f_8215 = 6.0F;
   private static final String f_8216 = "Трапка";
   private static final float f_8217 = 0.5F;
   private static final float f_8218 = 14.0F;
   private static final float f_8219 = 0.5F;
   private static final float f_8220 = 6.0F;
   private static final String f_8221 = "Чанк";
   private static final String f_8222 = "Поршни";
   private static final String f_8223 = "Верстаки";
   private static final String f_8224 = "Ворота";
   private static final int f_8225 = 70000;
   private static final int f_8226 = 70000;
   private static final double f_8227 = 0.5;
   private static final double f_8228 = 0.5;
   private static final double f_8229 = 0.5;
   private static final String f_8230 = "Стойки";
   private static final String f_8231 = "Чанк";
   private static final String f_8232 = "Чанк";
   private static final String f_8233 = "Чанк";
   private static final long f_8234 = 4294967295L;
   private static final int f_8235 = Integer.MIN_VALUE;
   private static final int f_8236 = Integer.MIN_VALUE;
   private static final String f_8237 = "Радиус";
   private static final String f_8238 = "hud/arrow";

   private static void m_2914(Map<Long, Long> var0, long var1, long var3) {
      if (var0.containsKey(var3)) {
         long var5 = m_2932(var0, var1);
         long var7 = m_2932(var0, var3);
         if (var5 != var7) {
            var0.put(var5, var7);
         }
      }
   }

   private void m_2915(Map<Long, TrapIndicator.xovRdRMYMRdaBy3F> var1, BlockPos var2, int var3) {
      if (this.f_8147.m_7145(f_8230) && f_11537.level != null && f_11537.player != null) {
         int var4 = Math.max(f_11537.level.getMinY(), var2.getY() - var3);
         int var5 = Math.min(f_11537.level.getMaxY(), var2.getY() + var3);
         AABB var6;
         if (this.f_8144.m_7568(f_8231)) {
            int var7 = var2.getX() >> 4 << 4;
            int var8 = var2.getZ() >> 4 << 4;
            var6 = new AABB(var7, var4, var8, var7 + 16, var5 + 1, var8 + 16);
         } else {
            var6 = f_11537.player.getBoundingBox().inflate(var3);
         }

         boolean var13 = this.f_8151.m_8768();
         double var14 = (double)var3 * var3;

         for (ArmorStand var11 : f_11537.level.getEntitiesOfClass(ArmorStand.class, var6, var0 -> true)) {
            if (var11.isAlive()
               && (!var13 || var11.getCustomName() == null)
               && (
                  this.f_8144.m_7568(f_8232)
                     ? var11.getBlockX() >> 4 == var2.getX() >> 4 && var11.getBlockZ() >> 4 == var2.getZ() >> 4
                     : !(var11.distanceToSqr(f_11537.player) > var14)
               )) {
               Vec3 var12 = var11.position();
               var1.computeIfAbsent(m_2928(var11.getBlockX(), var11.getBlockZ()), var0 -> new TrapIndicator.xovRdRMYMRdaBy3F())
                  .m_2908(var12.x, var12.y, var12.z, TrapIndicator.MMyom7wbwV27S0Z0.STAND);
            }
         }
      }
   }

   private int m_2918() {
      return this.f_8144.m_7568(f_8233) ? 16 : Math.round(this.f_8145.m_8768());
   }

   private void m_2919() {
      if (this.f_8157 != null && f_11537.level != null) {
         boolean var1 = this.f_8147.m_7145(f_8222);
         boolean var2 = this.f_8147.m_7145(f_8223);
         boolean var3 = this.f_8147.m_7145(f_8224);
         int var4 = 0;

         while (var4 < f_8225 && this.f_8157.f_8128 < this.f_8157.f_8120.size()) {
            ChunkPos var5 = this.f_8157.f_8120.get(this.f_8157.f_8128);
            if (!f_11537.level.hasChunk(var5.x(), var5.z())) {
               this.f_8157.f_8128++;
               this.f_8157.f_8129 = 0;
               this.f_8157.f_8130 = 0;
            } else {
               LevelChunk var6 = (LevelChunk)f_11537.level.getChunk(var5.x(), var5.z(), ChunkStatus.FULL, false);
               if (var6 == null) {
                  this.f_8157.f_8128++;
                  this.f_8157.f_8129 = 0;
                  this.f_8157.f_8130 = 0;
               } else {
                  LevelChunkSection[] var7 = var6.getSections();
                  if (this.f_8157.f_8129 >= var7.length) {
                     this.f_8157.f_8128++;
                     this.f_8157.f_8129 = 0;
                     this.f_8157.f_8130 = 0;
                  } else {
                     LevelChunkSection var8 = var7[this.f_8157.f_8129];
                     int var9 = f_11537.level.getSectionYFromSectionIndex(this.f_8157.f_8129) << 4;
                     if (var8 != null && !var8.hasOnlyAir() && var9 <= this.f_8157.f_8126 && var9 + 15 >= this.f_8157.f_8123) {
                        int var10 = var5.x() << 4;
                        int var11 = var5.z() << 4;

                        while (var4 < f_8226 && this.f_8157.f_8130 < 4096) {
                           int var12 = this.f_8157.f_8130++;
                           var4++;
                           int var13 = var12 & 15;
                           int var14 = var12 >> 4 & 15;
                           int var15 = var12 >> 8;
                           int var16 = var10 + var13;
                           int var17 = var9 + var15;
                           int var18 = var11 + var14;
                           if (var16 >= this.f_8157.f_8122
                              && var16 <= this.f_8157.f_8125
                              && var17 >= this.f_8157.f_8123
                              && var17 <= this.f_8157.f_8126
                              && var18 >= this.f_8157.f_8124
                              && var18 <= this.f_8157.f_8127) {
                              BlockState var19 = var8.getBlockState(var13, var15, var14);
                              if (!var19.isAir()) {
                                 TrapIndicator.MMyom7wbwV27S0Z0 var20 = m_2933(var19.getBlock(), var1, var2, var3);
                                 if (var20 != null) {
                                    this.f_8157
                                       .f_8121
                                       .computeIfAbsent(m_2928(var16, var18), var0 -> new TrapIndicator.xovRdRMYMRdaBy3F())
                                       .m_2908(var16 + f_8227, var17 + f_8228, var18 + f_8229, var20);
                                 }
                              }
                           }
                        }

                        if (this.f_8157.f_8130 >= 4096) {
                           this.f_8157.f_8129++;
                           this.f_8157.f_8130 = 0;
                        }
                     } else {
                        this.f_8157.f_8129++;
                        this.f_8157.f_8130 = 0;
                     }
                  }
               }
            }
         }

         if (this.f_8157.f_8128 >= this.f_8157.f_8120.size()) {
            this.f_8152.clear();
            this.f_8152.putAll(this.f_8157.f_8121);
            this.f_8157 = null;
            this.f_8161 = 0;
         }
      }
   }

   private void m_2920(BlockPos var1, int var2) {
      if (f_11537.level != null) {
         int var3;
         int var4;
         int var5;
         int var6;
         if (this.f_8144.m_7568(f_8221)) {
            var3 = var1.getX() >> 4 << 4;
            var5 = var1.getZ() >> 4 << 4;
            var4 = var3 + 15;
            var6 = var5 + 15;
         } else {
            var3 = var1.getX() - var2;
            var4 = var1.getX() + var2;
            var5 = var1.getZ() - var2;
            var6 = var1.getZ() + var2;
         }

         int var7 = Math.max(f_11537.level.getMinY(), var1.getY() - var2);
         int var8 = Math.min(f_11537.level.getMaxY(), var1.getY() + var2);
         ArrayList var9 = new ArrayList();

         for (int var10 = var3 >> 4; var10 <= var4 >> 4; var10++) {
            for (int var11 = var5 >> 4; var11 <= var6 >> 4; var11++) {
               var9.add(new ChunkPos(var10, var11));
            }
         }

         this.f_8157 = new TrapIndicator.lB9vJpjCzh0T7ak9(var9, var3, var7, var5, var4, var8, var6);
         this.f_8161 = 0;
      }
   }

   private void m_2921(TrapIndicator.X4FKLu04sO0AlcAQ var1, Vec3 var2, float var3) {
      double var4 = var1.pos.x - var2.x;
      double var6 = var1.pos.z - var2.z;
      int var8 = (int)Math.round(Math.sqrt(var4 * var4 + var6 * var6));
      float var9 = Mth.wrapDegrees((float)Math.toDegrees(Math.atan2(var6, var4)) - var3 - f_8206);
      float var10 = this.f_8150.m_8768();
      float var11 = f_11537.getWindow().getScreenWidth() * f_8207;
      float var12 = f_11537.getWindow().getScreenHeight() * f_8208;
      float var13 = var11 + f_8209 * var10 * (float)Math.sin(Math.toRadians(var9));
      float var14 = var12 - f_8210 * var10 * (float)Math.cos(Math.toRadians(var9));
      float var15 = f_8211 * var10;
      int var16 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
      Matrix4f var17 = Class_Ssh31B3ljfKeWsvS.m_4853();
      float var18 = f_8212 + var13 * 2.0F / f_11537.getWindow().getScreenWidth();
      float var19 = 1.0F - var14 * 2.0F / f_11537.getWindow().getScreenHeight();
      float var20 = (float)f_11537.getWindow().getScreenWidth() / f_11537.getWindow().getScreenHeight();
      var17.translate(var18, var19, 0.0F)
         .scale(1.0F, var20, 1.0F)
         .rotateZ((float)(-Math.toRadians(var9)))
         .scale(1.0F, 1.0F / var20, 1.0F)
         .translate(-var18, -var19, 0.0F);
      Class_Ssh31B3ljfKeWsvS.m_4842(var13 - var15 * f_8213, var14 - var15 * f_8214, var15 + 1.0F, var15 + 1.0F, new Vector4f(0.0F), new Vector4i(var16), f_8139);
      Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
      int var21 = Math.max(1, Math.round(f_8215 * var10));
      String var22 = f_8216;
      String var23 = var8 + "";
      float var24 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var22, var21);
      float var25 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var23, var21);
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var22, var13 - var24 * f_8217, var14 - f_8218 * var10, var21, -1);
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var23, var13 - var25 * f_8219, var14 + f_8220 * var10, var21, -1);
   }

   private void m_2922(Vector2f var1, TrapIndicator.X4FKLu04sO0AlcAQ var2, Vec3 var3) {
      String var4 = f_8188;
      String var5 = f_8189;
      String var6 = Math.round(var3.distanceTo(var2.pos)) + "";
      float var7 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var4, 10);
      float var8 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var5, 13);
      float var9 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9590(), var6, 11);
      float var10 = f_8190 + var7 + f_8191 + var8 + f_8192 + var9 + f_8193;
      float var11 = f_8194;
      float var12 = var1.x - var10 * f_8195;
      float var13 = var1.y - var11 * f_8196;
      Class_Ssh31B3ljfKeWsvS.m_4848(var12, var13, var10, var11, f_8197);
      float var14 = var12 + f_8198;
      int var15 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var4, var14, var13 + f_8199, 11, var15);
      float var16 = var14 + var7 + f_8200;
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var5, var16, var13 + f_8201, 13, Class_BftdentXEtGbugJw.m_2303(235, 239, 247, f_8202));
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9590(), var6, var16 + var8 + f_8203, var13 + f_8204, 11, Class_BftdentXEtGbugJw.m_2306(var15, f_8205)
      );
   }

   private static boolean m_2923(Block var0) {
      return var0 instanceof PistonBaseBlock || var0 instanceof PistonHeadBlock || var0 == Blocks.MOVING_PISTON;
   }

   private void m_2924() {
      this.f_8152.clear();
      this.f_8153.clear();
      this.f_8157 = null;
      this.f_8156 = null;
      this.f_8158 = f_8235;
      this.f_8159 = f_8236;
      this.f_8160 = -1;
      this.f_8161 = 0;
   }

   private void m_2925(BlockPos var1, int var2) {
      this.f_8153.clear();
      HashMap<Long, TrapIndicator.xovRdRMYMRdaBy3F> var3 = new HashMap<>(this.f_8152.size() + 8);

      for (Entry var5 : this.f_8152.entrySet()) {
         var3.put((Long)var5.getKey(), ((TrapIndicator.xovRdRMYMRdaBy3F)var5.getValue()).m_2913());
      }

      this.m_2915(var3, var1, var2);
      int var13 = Math.round(this.f_8146.m_8768());
      ArrayList<Long> var14 = new ArrayList<>();

      for (Entry<Long, TrapIndicator.xovRdRMYMRdaBy3F> var7 : var3.entrySet()) {
         if (((TrapIndicator.xovRdRMYMRdaBy3F)var7.getValue()).m_2910(var13)) {
            var14.add((Long)var7.getKey());
         }
      }

      if (!var14.isEmpty()) {
         HashMap var15 = new HashMap();

         for (long var8 : var14) {
            var15.put(var8, var8);
         }

         for (long var19 : var14) {
            int var10 = (int)(var19 >> 32);
            int var11 = (int)var19;
            m_2914(var15, var19, m_2928(var10 + 1 << 3, var11 << 3));
            m_2914(var15, var19, m_2928(var10 - 1 << 3, var11 << 3));
            m_2914(var15, var19, m_2928(var10 << 3, var11 + 1 << 3));
            m_2914(var15, var19, m_2928(var10 << 3, var11 - 1 << 3));
         }

         HashMap<Long, TrapIndicator.xovRdRMYMRdaBy3F> var18 = new HashMap<>();

         for (long var9 : var14) {
            long var25 = m_2932(var15, var9);
            var18.computeIfAbsent(var25, var0 -> new TrapIndicator.xovRdRMYMRdaBy3F()).m_2911(var3.get(var9));
         }

         Vec3 var21 = f_11537.player.position();
         ArrayList<TrapIndicator.X4FKLu04sO0AlcAQ> var22 = new ArrayList<>(var18.size());

         for (TrapIndicator.xovRdRMYMRdaBy3F var26 : var18.values()) {
            var22.add(var26.m_2912());
         }

         var22.sort(Comparator.comparingDouble(var1x -> var1x.pos.distanceToSqr(var21)));
         int var24 = Math.min(4, var22.size());

         for (int var27 = 0; var27 < var24; var27++) {
            this.f_8153.add((TrapIndicator.X4FKLu04sO0AlcAQ)var22.get(var27));
         }
      }
   }

   private static long m_2928(int var0, int var1) {
      return (long)(var0 >> 3) << 32 | var1 >> 3 & f_8234;
   }

   @Override
   public void m_732() {
      this.m_2924();
   }

   private void m_2930(Class_bhRaN0YSSLQRYjPo var1) {
      if (var1.m_6083() != null && f_11537.player != null && f_11537.level != null && !this.f_8153.isEmpty()) {
         float var2 = f_11537.gameRenderer.mainCamera().yRot();
         float var3 = f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true);
         Vec3 var4 = new Vec3(
            Mth.lerp(var3, f_11537.player.xOld, f_11537.player.getX()),
            Mth.lerp(var3, f_11537.player.yOld, f_11537.player.getY()),
            Mth.lerp(var3, f_11537.player.zOld, f_11537.player.getZ())
         );
         Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());

         for (TrapIndicator.X4FKLu04sO0AlcAQ var6 : this.f_8153) {
            if (this.f_8149.m_8768()) {
               this.m_2921(var6, var4, var2);
            }

            Vector2f var7 = Class_FvJXUGWpZo3zYBW4.m_2690(var6.pos);
            if (var7 != null && this.f_8148.m_8768()) {
               this.m_2922(var7, var6, var4);
            }
         }
      }
   }

   public TrapIndicator() {
      super(f_8162, f_8163, Category.RENDER);
      this.f_8144 = new MultiChoiceSetting(f_8164, new Class_2ZaVm8TGDJ68TnJB(f_8165), new Class_2ZaVm8TGDJ68TnJB(f_8166));
      this.f_8145 = new SliderSetting(f_8167, f_8168, f_8169, f_8170).m_828(1.0F).m_822(() -> this.f_8144.m_7568(f_8237));
      this.f_8146 = new SliderSetting(f_8171, f_8172, f_8173, f_8174).m_828(1.0F);
      this.f_8147 = new ItemListSetting(
         f_8175,
         new Class_2ZaVm8TGDJ68TnJB(f_8176, true),
         new Class_2ZaVm8TGDJ68TnJB(f_8177, true),
         new Class_2ZaVm8TGDJ68TnJB(f_8178, true),
         new Class_2ZaVm8TGDJ68TnJB(f_8179, true)
      );
      this.f_8148 = new CheckboxSetting(f_8180, true);
      this.f_8149 = new CheckboxSetting(f_8181, true);
      this.f_8150 = new SliderSetting(f_8182, 2.0F, 1.0F, f_8183).m_828(f_8184).m_822(this.f_8149::m_8768);
      this.f_8151 = new CheckboxSetting(f_8185, true);
      this.f_8152 = new HashMap<>();
      this.f_8153 = new ArrayList<>();
      this.f_8154 = this::m_2934;
      this.f_8155 = this::m_2930;
      this.f_8158 = f_8186;
      this.f_8159 = f_8187;
      this.f_8160 = -1;
      this.m_795(this.f_8144, this.f_8145, this.f_8146, this.f_8147, this.f_8148, this.f_8149, this.f_8150, this.f_8151);
   }

   private static long m_2932(Map<Long, Long> var0, long var1) {
      long var3 = var0.getOrDefault(var1, var1);
      if (var3 != var1) {
         var3 = m_2932(var0, var3);
         var0.put(var1, var3);
      }

      return var3;
   }

   private static TrapIndicator.MMyom7wbwV27S0Z0 m_2933(Block var0, boolean var1, boolean var2, boolean var3) {
      if (var1 && m_2923(var0)) {
         return TrapIndicator.MMyom7wbwV27S0Z0.PISTON;
      } else if (var2 && var0 == Blocks.CRAFTING_TABLE) {
         return TrapIndicator.MMyom7wbwV27S0Z0.TABLE;
      } else {
         return var3 && var0 instanceof FenceGateBlock ? TrapIndicator.MMyom7wbwV27S0Z0.GATE : null;
      }
   }

   private void m_2934(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (this.f_8156 != f_11537.level) {
            this.m_2924();
            this.f_8156 = f_11537.level;
         }

         int var2 = this.m_2918();
         BlockPos var3 = f_11537.player.blockPosition();
         int var4 = var3.getX() >> 4;
         int var5 = var3.getZ() >> 4;
         boolean var6 = var4 != this.f_8158 || var5 != this.f_8159 || var2 != this.f_8160;
         if (var6) {
            this.f_8158 = var4;
            this.f_8159 = var5;
            this.f_8160 = var2;
            this.m_2920(var3, var2);
         }

         this.m_2919();
         if (this.f_8157 == null && ++this.f_8161 >= 40) {
            this.m_2920(var3, var2);
         }

         this.m_2925(var3, var2);
      } else {
         this.m_2924();
      }
   }

   @Override
   public void m_778() {
      this.m_2924();
   }

   private enum MMyom7wbwV27S0Z0 {
      STAND,
      PISTON,
      TABLE,
      GATE;
   }

   private record X4FKLu04sO0AlcAQ(Vec3 pos, int score) {
   }

   private static final class lB9vJpjCzh0T7ak9 {
      public final List<ChunkPos> f_8120;
      public final Map<Long, TrapIndicator.xovRdRMYMRdaBy3F> f_8121 = new HashMap<>();
      public final int f_8122;
      public final int f_8123;
      public final int f_8124;
      public final int f_8125;
      public final int f_8126;
      public final int f_8127;
      public int f_8128;
      public int f_8129;
      public int f_8130;

      public lB9vJpjCzh0T7ak9(List<ChunkPos> var1, int var2, int var3, int var4, int var5, int var6, int var7) {
         this.f_8120 = var1;
         this.f_8122 = var2;
         this.f_8123 = var3;
         this.f_8124 = var4;
         this.f_8125 = var5;
         this.f_8126 = var6;
         this.f_8127 = var7;
      }
   }

   private static final class xovRdRMYMRdaBy3F {
      public int f_8131;
      public int f_8132;
      public int f_8133;
      public int f_8134;
      public double f_8135;
      public double f_8136;
      public double f_8137;
      public int f_8138;

      public void m_2908(double var1, double var3, double var5, TrapIndicator.MMyom7wbwV27S0Z0 var7) {
         switch (var7) {
            case STAND:
               this.f_8131++;
               break;
            case PISTON:
               this.f_8132++;
               break;
            case TABLE:
               this.f_8133++;
               break;
            case GATE:
               this.f_8134++;
         }

         this.f_8135 += var1;
         this.f_8136 += var3;
         this.f_8137 += var5;
         this.f_8138++;
      }

      public int m_2909() {
         return this.f_8131 * 3 + this.f_8132 * 2 + this.f_8133 * 2 + this.f_8134;
      }

      public xovRdRMYMRdaBy3F() {
      }

      public boolean m_2910(int var1) {
         return this.f_8138 > 0 && this.m_2909() >= var1 ? this.f_8132 > 0 || this.f_8133 > 0 || this.f_8131 >= 4 : false;
      }

      public void m_2911(TrapIndicator.xovRdRMYMRdaBy3F var1) {
         if (var1 != null) {
            this.f_8131 = this.f_8131 + var1.f_8131;
            this.f_8132 = this.f_8132 + var1.f_8132;
            this.f_8133 = this.f_8133 + var1.f_8133;
            this.f_8134 = this.f_8134 + var1.f_8134;
            this.f_8135 = this.f_8135 + var1.f_8135;
            this.f_8136 = this.f_8136 + var1.f_8136;
            this.f_8137 = this.f_8137 + var1.f_8137;
            this.f_8138 = this.f_8138 + var1.f_8138;
         }
      }

      public TrapIndicator.X4FKLu04sO0AlcAQ m_2912() {
         double var1 = this.f_8138 == 0 ? 1.0 : 1.0 / this.f_8138;
         return new TrapIndicator.X4FKLu04sO0AlcAQ(new Vec3(this.f_8135 * var1, this.f_8136 * var1, this.f_8137 * var1), this.m_2909());
      }

      public TrapIndicator.xovRdRMYMRdaBy3F m_2913() {
         TrapIndicator.xovRdRMYMRdaBy3F var1 = new TrapIndicator.xovRdRMYMRdaBy3F();
         var1.m_2911(this);
         return var1;
      }
   }
}
