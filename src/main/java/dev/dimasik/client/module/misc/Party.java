package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.IntegerSetting;
import dev.dimasik.client.setting.impl.ModeSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_B6JOzHnwhU3pe4AO;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_ftHu9o3WzCU3Adxm;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_kMaR2EHb1W57r60B;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import dev.dimasik.client.system.Class_zZgIgQUpIcqCwBUw;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;

public final class Party extends Module {
   private final IntegerSetting f_5136;
   private final IntegerSetting f_5137;
   private final ModeSetting f_5138;
   private final SliderSetting f_5139;
   private final Class_kMaR2EHb1W57r60B f_5140;
   private final Class_gEPk7yDw6CwIte87<Class_B6JOzHnwhU3pe4AO> f_5141;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_5142;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_5143;
   private static final String f_5144 = "Party";
   private static final String f_5145 = "Общие светящиеся метки для участников IRC-группы";
   private static final String f_5146 = "Поставить метку";
   private static final String f_5147 = "Убрать свою метку";
   private static final String f_5148 = "Название метки";
   private static final String f_5149 = "Метка";
   private static final String f_5150 = "Время метки (сек)";
   private static final float f_5151 = 60.0F;
   private static final float f_5152 = 15.0F;
   private static final float f_5153 = 180.0F;
   private static final float f_5154 = 5.0F;
   private static final String f_5155 = "Метка не отправлена: вы не состоите в .party.";
   private static final double f_5156 = 256.0;
   private static final double f_5157 = 256.0;
   private static final double f_5158 = 65536.0;
   private static final double f_5159 = 0.035;
   private static final double f_5160 = 0.035;
   private static final double f_5161 = 0.035;
   private static final double f_5162 = 0.035;
   private static final long f_5163 = 32L;
   private static final String f_5164 = "Метка";
   private static final float f_5165 = 1000.0F;
   private static final String f_5166 = "Метка не отправлена: данные игрока или группы ещё не готовы.";

   public void m_2086() {
      this.f_5140.m_7430();
   }

   public Party() {
      super(f_5144, f_5145, Category.MISC);
      this.f_5136 = new IntegerSetting(f_5146);
      this.f_5137 = new IntegerSetting(f_5147);
      this.f_5138 = new ModeSetting(f_5148, f_5149);
      this.f_5139 = new SliderSetting(f_5150, f_5151, f_5152, f_5153).m_828(f_5154);
      this.f_5140 = new Class_kMaR2EHb1W57r60B();
      this.f_5141 = this::m_2091;
      this.f_5142 = var1 -> this.f_5140.m_7435(var1, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN));
      this.f_5143 = var1 -> this.f_5140.m_7441(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN), var1.m_6083());
      this.m_795(this.f_5136, this.f_5137, this.f_5138, this.f_5139);
   }

   private void m_2091(Class_B6JOzHnwhU3pe4AO var1) {
      if (f_11537.gui.screen() == null && f_11537.player != null && f_11537.level != null && var1.m_2116() == 1) {
         if (this.f_5137.m_8768() >= 0 && var1.m_2117() == this.f_5137.m_8768()) {
            Class_zZgIgQUpIcqCwBUw.m_9905().m_9881();
         } else if (this.f_5136.m_8768() >= 0 && var1.m_2117() == this.f_5136.m_8768()) {
            Class_zZgIgQUpIcqCwBUw var2 = Class_zZgIgQUpIcqCwBUw.m_9905();
            if (!var2.m_9914()) {
               Class_ftHu9o3WzCU3Adxm.m_6731(f_5155);
            } else {
               long var3 = var2.m_9922();
               if (var3 > 0L) {
                  Class_ftHu9o3WzCU3Adxm.m_6731(var3 + "");
               } else {
                  HitResult var5 = f_11537.player.pick(f_5156, 1.0F, false);
                  Vec3 var6 = f_11537.player.getEyePosition();
                  Vec3 var7 = f_11537.player.getViewVector(1.0F).scale(f_5157);
                  double var8 = var5.getType() == Type.BLOCK ? var6.distanceToSqr(var5.getLocation()) : f_5158;
                  EntityHitResult var10 = ProjectileUtil.getEntityHitResult(
                     f_11537.player,
                     var6,
                     var6.add(var7),
                     f_11537.player.getBoundingBox().expandTowards(var7).inflate(1.0),
                     var0 -> var0 instanceof LivingEntity var1x && var1x.isAlive() && !var0.isSpectator(),
                     var8
                  );
                  Vec3 var11 = f_11537.player.position().add(0.0, f_5159, 0.0);
                  if (var5 instanceof BlockHitResult var12 && var5.getType() == Type.BLOCK) {
                     var11 = var12.getLocation()
                        .add(var12.getDirection().getStepX() * f_5160, var12.getDirection().getStepY() * f_5161, var12.getDirection().getStepZ() * f_5162);
                  }

                  StringBuilder var17 = new StringBuilder();
                  this.f_5138.m_8768().strip().codePoints().filter(var0 -> !Character.isISOControl(var0) && var0 != 167).limit(f_5163).forEach(var1x -> {
                     if (var17.length() + Character.charCount(var1x) <= 32) {
                        var17.appendCodePoint(var1x);
                     }
                  });
                  if (var17.isEmpty()) {
                     var17.append(f_5164);
                  }

                  int var13 = Math.round(this.f_5139.m_8768() * f_5165);
                  boolean var14 = var10 != null && var10.getEntity() instanceof LivingEntity var15
                     ? var2.m_9910(var17.toString(), var15, var13)
                     : var2.m_9932(var17.toString(), var11.x, var11.y, var11.z, var13);
                  if (!var14) {
                     Class_ftHu9o3WzCU3Adxm.m_6731(f_5166);
                  }
               }
            }
         }
      }
   }

   @Override
   public void m_732() {
      this.f_5140.m_7430();
   }
}
