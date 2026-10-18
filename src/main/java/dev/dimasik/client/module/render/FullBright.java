package dev.dimasik.client.module.render;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import net.minecraft.core.BlockPos;
import net.minecraft.util.LightCoordsUtil;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.phys.Vec3;

public class FullBright extends Module {
   private final MultiChoiceSetting f_17037;
   private final SliderSetting f_17038;
   private float f_17039;
   private long f_17040;
   private volatile Vec3 f_17041;
   private volatile int f_17042;
   private Vec3 f_17043;
   private int f_17044;
   private long f_17045;
   private static final String f_17046 = "FullBright";
   private static final String f_17047 = "Плавно осветляет тёмные места и сохраняет атмосферу мира";
   private static final String f_17048 = "Режим";
   private static final String f_17049 = "Обычный";
   private static final String f_17050 = "Адаптивный";
   private static final String f_17051 = "Яркость";
   private static final float f_17052 = 0.05F;
   private static final String f_17053 = "Адаптивный";
   private static final float f_17054 = 0.96F;
   private static final String f_17055 = "Адаптивный";
   private static final float f_17056 = 15.0F;
   private static final double f_17057 = 0.01;
   private static final long f_17058 = 50000000L;
   private static final double f_17059 = 0.5;
   private static final double f_17060 = 0.5;
   private static final double f_17061 = 0.5;
   private static final double f_17062 = 0.5;
   private static final float f_17063 = 15.0F;
   private static final float f_17064 = 15.0F;
   private static final float f_17065 = 15.0F;
   private static final float f_17066 = 0.08F;
   private static final float f_17067 = 0.76F;
   private static final float f_17068 = 0.68F;
   private static final float f_17069 = 0.016666668F;
   private static final float f_17070 = 1.0E9F;
   private static final float f_17071 = 0.1F;
   private static final float f_17072 = 3.4F;
   private static final float f_17073 = 1.55F;
   private static final float f_17074 = 0.001F;
   private static final float f_17075 = 3.0F;
   private static final String f_17076 = "Обычный";

   private float m_5865() {
      BlockPos var1 = BlockPos.containing(f_11537.player.getEyePosition());
      float var2 = f_11537.level.getBrightness(LightLayer.BLOCK, var1) / f_17063;
      float var3 = f_11537.level.getBrightness(LightLayer.SKY, var1) / f_17064;
      float var4 = 1.0F - Math.clamp(f_11537.level.getSkyDarken() / f_17065, 0.0F, 1.0F);
      float var5 = var3 * var4;
      float var6 = Math.max(var2, var5);
      float var7 = 1.0F - m_5874(f_17066, f_17067, var6);
      boolean var8 = !f_11537.level.canSeeSky(var1);
      float var9 = var7 * (var8 ? 1.0F : f_17068);
      return Math.clamp(var9, 0.0F, 1.0F);
   }

   public float m_5866(float var1) {
      if (!this.m_776() || f_11537.player == null || f_11537.level == null) {
         this.m_5868();
         return var1;
      }

      if (this.f_17037.m_7568(f_17053)) {
         return var1;
      }

      float var2 = this.f_17038.m_8768();
      this.m_5867(var2);
      float var3 = this.f_17039 * f_17054;
      return Math.max(var1, var3);
   }

   @Override
   public void m_732() {
      this.m_5872();
      this.m_5868();
   }

   public FullBright() {
      super(f_17046, f_17047, Category.RENDER);
      this.f_17037 = new MultiChoiceSetting(f_17048, new Class_2ZaVm8TGDJ68TnJB(f_17049), new Class_2ZaVm8TGDJ68TnJB(f_17050));
      this.f_17038 = new SliderSetting(f_17051, 1.0F, 0.0F, 1.0F).m_828(f_17052).m_822(() -> this.f_17037.m_7568(f_17076));
      this.m_795(this.f_17037, this.f_17038);
   }

   private void m_5867(float var1) {
      long var2 = System.nanoTime();
      float var4 = this.f_17040 == 0L ? f_17069 : Math.clamp((float)(var2 - this.f_17040) / f_17070, 0.0F, f_17071);
      this.f_17040 = var2;
      float var5 = var1 > this.f_17039 ? f_17072 : f_17073;
      float var6 = 1.0F - (float)Math.exp(-var5 * var4);
      this.f_17039 = this.f_17039 + (var1 - this.f_17039) * var6;
      if (Math.abs(var1 - this.f_17039) < f_17074) {
         this.f_17039 = var1;
      }
   }

   @Override
   public void m_778() {
      this.m_5868();
   }

   private void m_5868() {
      this.f_17039 = 0.0F;
      this.f_17040 = 0L;
   }

   public void m_5869(float var1) {
      if (!this.m_776() || f_11537.player == null || f_11537.level == null) {
         this.m_5872();
      } else if (!this.f_17037.m_7568(f_17055)) {
         this.m_5872();
      } else {
         this.m_5867(this.m_5865());
         Vec3 var2 = f_11537.player.getEyePosition(var1);
         int var3 = Math.clamp(Math.round(this.f_17039 * f_17056), 0, 15);
         this.f_17041 = var2;
         this.f_17042 = var3;
         long var4 = System.nanoTime();
         boolean var6 = this.f_17043 == null || var2.distanceToSqr(this.f_17043) >= f_17057;
         boolean var7 = var3 != this.f_17044;
         if (this.f_17043 == null || (var6 || var7) && var4 - this.f_17045 >= f_17058) {
            this.m_5871(this.f_17043, var2, Math.max(this.f_17044, var3));
            this.f_17043 = var2;
            this.f_17044 = var3;
            this.f_17045 = var4;
         }
      }
   }

   public int m_5870(int var1, BlockPos var2) {
      return this.m_5875(var1, new Vec3(var2.getX() + f_17059, var2.getY() + f_17060, var2.getZ() + f_17061));
   }

   private void m_5871(Vec3 var1, Vec3 var2, int var3) {
      if (var2 != null && var3 > 0 && f_11537.levelRenderer != null) {
         int var4 = var3 + 2;
         Vec3 var5 = var1 == null ? var2 : var1;
         f_11537.levelExtractor
            .setBlocksDirty(
               (int)Math.floor(Math.min(var5.x, var2.x)) - var4,
               (int)Math.floor(Math.min(var5.y, var2.y)) - var4,
               (int)Math.floor(Math.min(var5.z, var2.z)) - var4,
               (int)Math.floor(Math.max(var5.x, var2.x)) + var4,
               (int)Math.floor(Math.max(var5.y, var2.y)) + var4,
               (int)Math.floor(Math.max(var5.z, var2.z)) + var4
            );
      }
   }

   private void m_5872() {
      Vec3 var1 = this.f_17043;
      int var2 = this.f_17044;
      this.f_17041 = null;
      this.f_17042 = 0;
      this.f_17043 = null;
      this.f_17044 = 0;
      this.f_17045 = 0L;
      if (var1 != null && var2 > 0) {
         this.m_5871(var1, var1, var2);
      }
   }

   private static float m_5874(float var0, float var1, float var2) {
      float var3 = Math.clamp((var2 - var0) / (var1 - var0), 0.0F, 1.0F);
      return var3 * var3 * (f_17075 - 2.0F * var3);
   }

   public int m_5875(int var1, Vec3 var2) {
      Vec3 var3 = this.f_17041;
      int var4 = this.f_17042;
      if (var3 != null && var4 > 0) {
         double var5 = var2.distanceTo(var3);
         int var7 = Math.clamp((int)Math.floor(var4 - var5 + f_17062), 0, 15);
         int var8 = LightCoordsUtil.block(var1);
         if (var7 <= var8) {
            return var1;
         }

         int var9 = LightCoordsUtil.sky(var1);
         return LightCoordsUtil.pack(var7, var9);
      } else {
         return var1;
      }
   }
}
