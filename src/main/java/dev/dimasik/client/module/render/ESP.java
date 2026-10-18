package dev.dimasik.client.module.render;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack.Pose;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ColorSetting;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_81oIJPtsDGdzRKcL;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_bhSc4OUnYWSe2vjL;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class ESP extends Module {
   private static final int f_10228 = 96;
   private static final int f_10229 = -13303968;
   private static final int f_10230 = -57312;
   private static final double f_10231 = 0.18;
   private static final double f_10232 = 0.06;
   private final ItemListSetting f_10233;
   private final SliderSetting f_10234;
   private final CheckboxSetting f_10235;
   private final ColorSetting f_10236;
   private final int[] f_10237;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_10238;
   private static final String f_10239 = "ESP";
   private static final String f_10240 = "Подцветка игроков";
   private static final String f_10241 = "Отображать";
   private static final String f_10242 = "Игроков";
   private static final String f_10243 = "Друзей";
   private static final String f_10244 = "Себя";
   private static final String f_10245 = "Мобов";
   private static final String f_10246 = "Дистанция";
   private static final float f_10247 = 72.0F;
   private static final float f_10248 = 8.0F;
   private static final float f_10249 = 200.0F;
   private static final String f_10250 = "Обводка";
   private static final String f_10251 = "Цвет друзей";
   private static final int f_10252 = -13303968;
   private static final String f_10253 = "Себя";
   private static final String f_10254 = "Друзей";
   private static final String f_10255 = "Игроков";
   private static final String f_10256 = "Мобов";
   private static final float f_10257 = 0.09F;
   private static final float f_10258 = 0.06F;
   private static final float f_10259 = 1.0869565F;
   private static final float f_10260 = 0.62F;
   private static final float f_10261 = 0.8F;
   private static final float f_10262 = 0.2F;
   private static final float f_10263 = 255.0F;
   private static final float f_10264 = 10.0F;
   private static final int f_10265 = -57312;
   private static final double f_10266 = 0.001;
   private static final double f_10267 = 0.24;
   private static final double f_10268 = 0.18;
   private static final float f_10269 = 0.5F;
   private static final String f_10270 = "Друзей";

   private int m_3382(Entity var1, float var2) {
      int var3;
      if (var1 instanceof Player var4 && var4 != f_11537.player && this.m_3383(var4)) {
         var3 = this.f_10236.m_8768();
      } else if (var1 instanceof Player) {
         var3 = Class_BftdentXEtGbugJw.m_2304(var1.getId() * 17);
      } else {
         var3 = Class_BftdentXEtGbugJw.m_2304(var1.getId() * 11);
      }

      if (var1 instanceof LivingEntity var6 && var6.hurtTime > 0) {
         float var5 = Mth.clamp((var6.hurtTime - var2) / f_10264, 0.0F, 1.0F);
         if (var5 > 0.0F) {
            var3 = Class_BftdentXEtGbugJw.m_2302(var3, f_10265, var5);
         }
      }

      return var3;
   }

   private boolean m_3383(Player var1) {
      return var1.getGameProfile() != null && var1.getGameProfile().name() != null
         ? DimasikClient.m_9057().m_9049().m_2804().m_2877(var1.getGameProfile().name())
         : false;
   }

   private int m_3384(int var1, int var2) {
      return Class_BftdentXEtGbugJw.m_2303(Class_BftdentXEtGbugJw.m_2309(var1), Class_BftdentXEtGbugJw.m_2299(var1), Class_BftdentXEtGbugJw.m_2308(var1), var2);
   }

   private int m_3385(int var1, float var2) {
      return Class_BftdentXEtGbugJw.m_2303(
         Mth.clamp(Math.round(Class_BftdentXEtGbugJw.m_2309(var1) * var2), 0, 255),
         Mth.clamp(Math.round(Class_BftdentXEtGbugJw.m_2299(var1) * var2), 0, 255),
         Mth.clamp(Math.round(Class_BftdentXEtGbugJw.m_2308(var1) * var2), 0, 255),
         Class_BftdentXEtGbugJw.m_2297(var1)
      );
   }

   private void m_3386(Pose var1, VertexConsumer var2, Entity var3, Vec3 var4, float var5, float var6) {
      Vec3 var7 = this.m_3392(var3, var5);
      AABB var8 = var3.getBoundingBox().move(var7.x - var3.getX(), var7.y - var3.getY(), var7.z - var3.getZ());
      float var9 = var3 instanceof Player ? f_10257 : f_10258;
      AABB var10 = var8.inflate(var9).move(-var4.x, -var4.y, -var4.z);
      int var11 = this.m_3382(var3, var5);
      float var12 = 1.0F - Mth.clamp(f_11537.player.distanceTo(var3) / var6, 0.0F, 1.0F);
      int var13 = this.m_3385(var11, f_10259);
      int var14 = this.m_3385(var11, f_10260);
      int var15 = this.m_3385(var11, f_10261);
      this.f_10237[0] = Class_BftdentXEtGbugJw.m_2300(var13, var15, 0, 10);
      this.f_10237[1] = Class_BftdentXEtGbugJw.m_2300(var15, var14, 90, 10);
      this.f_10237[2] = Class_BftdentXEtGbugJw.m_2300(var14, var15, 180, 10);
      this.f_10237[3] = Class_BftdentXEtGbugJw.m_2300(var15, var13, 270, 10);
      int var16 = Math.round(Mth.clamp(var12, f_10262, 1.0F) * f_10263);
      this.m_3391(var1, var2, var10, this.f_10237, var16);
   }

   public ESP() {
      super(f_10239, f_10240, Category.RENDER);
      this.f_10233 = new ItemListSetting(
         f_10241,
         new Class_2ZaVm8TGDJ68TnJB(f_10242, true),
         new Class_2ZaVm8TGDJ68TnJB(f_10243, true),
         new Class_2ZaVm8TGDJ68TnJB(f_10244, false),
         new Class_2ZaVm8TGDJ68TnJB(f_10245, true)
      );
      this.f_10234 = new SliderSetting(f_10246, f_10247, f_10248, f_10249).m_828(1.0F);
      this.f_10235 = new CheckboxSetting(f_10250, true);
      this.f_10236 = new ColorSetting(f_10251, false, f_10252).m_822(() -> this.f_10233.m_7145(f_10270));
      this.f_10237 = new int[4];
      this.f_10238 = this::m_3388;
      this.m_795(this.f_10233, this.f_10234, this.f_10235, this.f_10236);
   }

   private boolean m_3387(Entity var1) {
      if (var1 == null || !var1.isAlive() || var1.isRemoved()) {
         return false;
      }

      if (!(var1 instanceof LivingEntity)) {
         return false;
      }

      if (var1 != f_11537.player && var1 != f_11537.getCameraEntity()) {
         if (var1 instanceof Player var2) {
            if (this.m_3393(var2)) {
               return false;
            } else {
               return this.m_3383(var2) ? this.f_10233.m_7145(f_10254) : this.f_10233.m_7145(f_10255);
            }
         } else {
            return this.f_10233.m_7145(f_10256);
         }
      } else {
         return f_11537.options.getCameraType().isFirstPerson() ? false : this.f_10233.m_7145(f_10253);
      }
   }

   private void m_3388(Class_TZhU50s8XmBQCMP5 var1) {
      if (f_11537.level != null && f_11537.player != null) {
         if (this.f_10235.m_8768()) {
            Pose var2 = var1.m_5006().last();
            VertexConsumer var3 = var1.m_5008().m_881(Class_81oIJPtsDGdzRKcL.f_3816);
            float var4 = var1.m_5004();
            Vec3 var5 = var1.m_5010();
            int var6 = 0;
            float var7 = Math.max(this.f_10234.m_8768(), 1.0F);
            float var8 = var7 * var7;

            for (Entity var10 : f_11537.level.entitiesForRendering()) {
               if (var6 >= 96) {
                  break;
               }

               if (this.m_3387(var10) && !(f_11537.player.distanceToSqr(var10) > var8)) {
                  this.m_3386(var2, var3, var10, var5, var4, var7);
                  var6++;
               }
            }
         }
      }
   }

   private void m_3390(Pose var1, VertexConsumer var2, double var3, double var5, double var7, double var9, double var11, double var13, int var15, int var16) {
      double var17 = var9 - var3;
      double var19 = var11 - var5;
      double var21 = var13 - var7;
      double var23 = Math.sqrt(var17 * var17 + var19 * var19 + var21 * var21);
      if (!(var23 < f_10266)) {
         double var25 = var17 / var23;
         double var27 = var19 / var23;
         double var29 = var21 / var23;
         double var31 = f_10267;

         for (double var33 = 0.0; var33 < var23; var33 += var31) {
            double var35 = Math.min(var33 + f_10268, var23);
            if (!(var35 <= var33)) {
               float var37 = (float)(var33 / var23);
               float var38 = (float)(var35 / var23);
               Class_bhSc4OUnYWSe2vjL.m_6086(
                  var1,
                  var2,
                  (float)(var3 + var25 * var33),
                  (float)(var5 + var27 * var33),
                  (float)(var7 + var29 * var33),
                  (float)(var3 + var25 * var35),
                  (float)(var5 + var27 * var35),
                  (float)(var7 + var29 * var35),
                  Class_BftdentXEtGbugJw.m_2312(var15, var16, (var37 + var38) * f_10269)
               );
            }
         }
      }
   }

   private void m_3391(Pose var1, VertexConsumer var2, AABB var3, int[] var4, int var5) {
      int var6 = this.m_3384(var4[0], var5);
      int var7 = this.m_3384(var4[1], var5);
      int var8 = this.m_3384(var4[2], var5);
      int var9 = this.m_3384(var4[3], var5);
      double var10 = var3.minX;
      double var12 = var3.minY;
      double var14 = var3.minZ;
      double var16 = var3.maxX;
      double var18 = var3.maxY;
      double var20 = var3.maxZ;
      this.m_3390(var1, var2, var10, var12, var14, var16, var12, var14, var6, var7);
      this.m_3390(var1, var2, var16, var12, var14, var16, var12, var20, var7, var8);
      this.m_3390(var1, var2, var16, var12, var20, var10, var12, var20, var8, var9);
      this.m_3390(var1, var2, var10, var12, var20, var10, var12, var14, var9, var6);
      this.m_3390(var1, var2, var10, var18, var14, var16, var18, var14, var6, var7);
      this.m_3390(var1, var2, var16, var18, var14, var16, var18, var20, var7, var8);
      this.m_3390(var1, var2, var16, var18, var20, var10, var18, var20, var8, var9);
      this.m_3390(var1, var2, var10, var18, var20, var10, var18, var14, var9, var6);
      this.m_3390(var1, var2, var10, var12, var14, var10, var18, var14, var6, var6);
      this.m_3390(var1, var2, var16, var12, var14, var16, var18, var14, var7, var7);
      this.m_3390(var1, var2, var16, var12, var20, var16, var18, var20, var8, var8);
      this.m_3390(var1, var2, var10, var12, var20, var10, var18, var20, var9, var9);
   }

   private Vec3 m_3392(Entity var1, float var2) {
      return new Vec3(Mth.lerp(var2, var1.xOld, var1.getX()), Mth.lerp(var2, var1.yOld, var1.getY()), Mth.lerp(var2, var1.zOld, var1.getZ()));
   }

   private boolean m_3393(Player var1) {
      return DimasikClient.m_9057().m_9049().m_2801().m_3581().f_33163.contains(var1);
   }
}
