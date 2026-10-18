package dev.dimasik.client.module.render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.module.misc.LootTracker;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ColorSetting;
import dev.dimasik.client.system.Class_81oIJPtsDGdzRKcL;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_bhSc4OUnYWSe2vjL;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_i7qN6fWCX6JrM0uQ;
import java.util.Optional;
import net.minecraft.client.Camera;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;

public class Tracers extends Module {
   private final ColorSetting f_391;
   private final ColorSetting f_392;
   private final CheckboxSetting f_393;
   private final CheckboxSetting f_394;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_395;
   private static final String f_396 = "Tracers";
   private static final String f_397 = "Рисует линии к энтити";
   private static final String f_398 = "Цвет";
   private static final String f_399 = "Цвет Друзей";
   private static final String f_400 = "Работать на людей";
   private static final String f_401 = "Работать на дон предметы";
   private static final double f_402 = 150.0;
   private static final int f_403 = -16777216;
   private static final long f_404 = 255L;
   private static final long f_405 = 255L;
   private static final long f_406 = 255L;

   private int m_772(Component var1, int var2) {
      long[] var3 = new long[4];
      var1.visit((var1x, var2x) -> {
         TextColor var3x = var1x.getColor();
         if (var3x != null && !var2x.isEmpty()) {
            int var4x = var3x.getValue();
            int var5x = var2x.codePointCount(0, var2x.length());
            var3[0] += (var4x >> 16 & f_404) * var5x;
            var3[1] += (var4x >> 8 & f_405) * var5x;
            var3[2] += (var4x & f_406) * var5x;
            var3[3] += var5x;
         }

         return Optional.empty();
      }, Style.EMPTY);
      if (var3[3] == 0L) {
         return var2;
      }

      int var4 = (int)(var3[0] / var3[3]);
      int var5 = (int)(var3[1] / var3[3]);
      int var6 = (int)(var3[2] / var3[3]);
      return f_403 | var4 << 16 | var5 << 8 | var6;
   }

   public Tracers() {
      super(f_396, f_397, Category.RENDER);
      this.f_391 = new ColorSetting(f_398, false, -1);
      this.f_392 = new ColorSetting(f_399, false, -1);
      this.f_393 = new CheckboxSetting(f_400, true);
      this.f_394 = new CheckboxSetting(f_401, false);
      this.f_395 = this::m_775;
      this.m_795(this.f_391, this.f_392, this.f_393, this.f_394);
   }

   private void m_773(PoseStack var1, VertexConsumer var2, Vec3 var3, Vec3 var4, float var5) {
      for (Entity var7 : f_11537.level.entitiesForRendering()) {
         if (var7 instanceof ItemEntity var8 && var8.isAlive() && !var8.isRemoved()) {
            ItemStack var9 = var8.getItem();
            if (LootTracker.m_2547(var9)) {
               Vec3 var10 = new Vec3(Mth.lerp(var5, var8.xo, var8.getX()), Mth.lerp(var5, var8.yo, var8.getY()), Mth.lerp(var5, var8.zo, var8.getZ()))
                  .subtract(var4);
               int var11 = this.m_772(var8.getCustomName() != null ? var8.getCustomName() : var9.getHoverName(), this.f_391.m_8768());
               Class_bhSc4OUnYWSe2vjL.m_6086(
                  var1.last(), var2, (float)var3.x, (float)var3.y, (float)var3.z, (float)var10.x, (float)var10.y, (float)var10.z, var11
               );
            }
         }
      }
   }

   private void m_775(Class_TZhU50s8XmBQCMP5 var1) {
      if (f_11537.level != null && f_11537.player != null) {
         PoseStack var2 = var1.m_5006();
         VertexConsumer var3 = var1.m_5008().m_881(Class_81oIJPtsDGdzRKcL.f_3816);
         Vec3 var4 = var1.m_5010();
         float var5 = var1.m_5004();
         Camera var6 = f_11537.gameRenderer.mainCamera();
         Vec3 var7 = new Vec3(0.0, 0.0, f_402).xRot((float)(-Math.toRadians(var6.xRot()))).yRot((float)(-Math.toRadians(var6.yRot())));
         if (this.f_393.m_8768()) {
            for (AbstractClientPlayer var9 : f_11537.level.players()) {
               if (var9 != f_11537.player && var9.isAlive() && !var9.isRemoved()) {
                  double var10 = Mth.lerp(var5, var9.xo, var9.getX());
                  double var12 = Mth.lerp(var5, var9.yo, var9.getY());
                  double var14 = Mth.lerp(var5, var9.zo, var9.getZ());
                  Vec3 var16 = new Vec3(var10, var12, var14).subtract(var4);
                  int var17 = this.f_391.m_8768();
                  if (DimasikClient.m_9057().m_9049().m_2804().m_2877(var9.getGameProfile().name())) {
                     var17 = this.f_392.m_8768();
                  }

                  Class_bhSc4OUnYWSe2vjL.m_6086(
                     var2.last(), var3, (float)var7.x, (float)var7.y, (float)var7.z, (float)var16.x, (float)var16.y, (float)var16.z, var17
                  );
               }
            }
         }

         if (this.f_394.m_8768() && Class_i7qN6fWCX6JrM0uQ.m_7233().m_7235()) {
            this.m_773(var2, var3, var7, var4, var5);
         }
      }
   }
}
