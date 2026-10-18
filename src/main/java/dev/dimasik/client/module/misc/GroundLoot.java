package dev.dimasik.client.module.misc;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_81oIJPtsDGdzRKcL;
import dev.dimasik.client.system.Class_8UIDpbIRPAjhei7m;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_bhSc4OUnYWSe2vjL;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.client.Camera;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.util.Mth;
import net.minecraft.util.StringUtil;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class GroundLoot extends Module {
   private static final long f_18892 = 8000L;
   private final ItemListSetting f_18893;
   private final SliderSetting f_18894;
   private final CheckboxSetting f_18895;
   private final Map<Integer, Long> f_18896;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_18897;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_18898;
   private static final String f_18899 = "GroundLoot";
   private static final String f_18900 = "Подсветка и тост, если рядом на земле донат, осколки, элитры, тотем или голова";
   private static final String f_18901 = "Предметы";
   private static final String f_18902 = "Донат";
   private static final String f_18903 = "Осколки";
   private static final String f_18904 = "Элитры";
   private static final String f_18905 = "Тотем";
   private static final String f_18906 = "Голова";
   private static final String f_18907 = "Радиус";
   private static final float f_18908 = 24.0F;
   private static final float f_18909 = 8.0F;
   private static final float f_18910 = 48.0F;
   private static final String f_18911 = "Уведомление";
   private static final long f_18912 = 8000L;
   private static final double f_18913 = 150.0;
   private static final double f_18914 = 70.0;
   private static final double f_18915 = 255.0;
   private static final double f_18916 = 0.18;
   private static final double f_18917 = 220.0;
   private static final String f_18918 = "Донат";
   private static final String f_18919 = "донат";
   private static final String f_18920 = "Осколки";
   private static final String f_18921 = "осколок";
   private static final String f_18922 = "Тотем";
   private static final String f_18923 = "тотем";
   private static final String f_18924 = "Элитры";
   private static final String f_18925 = "элитры";
   private static final String f_18926 = "Голова";
   private static final String f_18927 = "голова";
   private static final String f_18928 = "лут";
   private static final String f_18929 = "осколок";

   private void m_6315(Class_TZhU50s8XmBQCMP5 var1) {
      if (f_11537.player != null && f_11537.level != null) {
         PoseStack var2 = var1.m_5006();
         Vec3 var3 = var1.m_5010();
         float var4 = var1.m_5004();
         Camera var5 = f_11537.gameRenderer.mainCamera();
         Vec3 var6 = new Vec3(0.0, 0.0, f_18913).xRot((float)(-Math.toRadians(var5.xRot()))).yRot((float)(-Math.toRadians(var5.yRot())));
         VertexConsumer var7 = var1.m_5008().m_881(Class_81oIJPtsDGdzRKcL.f_3816);
         VertexConsumer var8 = var1.m_5008().m_881(Class_81oIJPtsDGdzRKcL.f_3818);

         for (ItemEntity var10 : f_11537.level
            .getEntitiesOfClass(ItemEntity.class, f_11537.player.getBoundingBox().inflate(this.f_18894.m_8768().floatValue()), this::m_6316)) {
            int var11 = m_6317(var10.getItem());
            int var12 = Class_BftdentXEtGbugJw.m_2303(var11 >> 16 & 0xFF, var11 >> 8 & 0xFF, var11 & 0xFF, f_18914);
            int var13 = Class_BftdentXEtGbugJw.m_2303(var11 >> 16 & 0xFF, var11 >> 8 & 0xFF, var11 & 0xFF, f_18915);
            AABB var14 = var10.getBoundingBox().inflate(f_18916);
            Class_bhSc4OUnYWSe2vjL.m_6088(var2, var8, var3, var14.minX, var14.minY, var14.minZ, var14.maxX, var14.maxY, var14.maxZ, var12, true);
            Class_bhSc4OUnYWSe2vjL.m_6087(var2, var7, var3, var14.minX, var14.minY, var14.minZ, var14.maxX, var14.maxY, var14.maxZ, var13);
            Vec3 var15 = new Vec3(Mth.lerp(var4, var10.xo, var10.getX()), Mth.lerp(var4, var10.yo, var10.getY()), Mth.lerp(var4, var10.zo, var10.getZ()))
               .subtract(var3);
            Class_bhSc4OUnYWSe2vjL.m_6086(
               var2.last(),
               var7,
               (float)var6.x,
               (float)var6.y,
               (float)var6.z,
               (float)var15.x,
               (float)var15.y,
               (float)var15.z,
               Class_BftdentXEtGbugJw.m_2303(var11 >> 16 & 0xFF, var11 >> 8 & 0xFF, var11 & 0xFF, f_18917)
            );
         }
      }
   }

   private boolean m_6316(Entity var1) {
      if (!(var1 instanceof ItemEntity var2 && var2.isAlive() && !var2.isRemoved())) {
         return false;
      } else {
         return f_11537.player.distanceToSqr(var2) > this.f_18894.m_8768() * this.f_18894.m_8768() ? false : this.m_6323(var2.getItem()) != null;
      }
   }

   private static int m_6317(ItemStack var0) {
      int var1 = m_6319(var0);
      if (var1 != 0) {
         return var1;
      } else {
         Item var2 = var0.getItem();
         if (m_6324(var0)) {
            return Class_BftdentXEtGbugJw.m_2310(255, 230, 90);
         } else if (m_6325(var0)) {
            return Class_BftdentXEtGbugJw.m_2310(255, 210, 70);
         } else if (var2 == Items.ELYTRA) {
            return Class_BftdentXEtGbugJw.m_2310(90, 210, 255);
         } else {
            return m_6318(var2) ? Class_BftdentXEtGbugJw.m_2310(255, 170, 210) : Class_BftdentXEtGbugJw.m_2310(255, 40, 200);
         }
      }
   }

   private static boolean m_6318(Item var0) {
      return var0 == Items.PLAYER_HEAD
         || var0 == Items.ZOMBIE_HEAD
         || var0 == Items.CREEPER_HEAD
         || var0 == Items.SKELETON_SKULL
         || var0 == Items.WITHER_SKELETON_SKULL
         || var0 == Items.DRAGON_HEAD
         || var0 == Items.PIGLIN_HEAD;
   }

   private static int m_6319(ItemStack var0) {
      if (var0 != null && !var0.isEmpty()) {
         AtomicInteger var1 = new AtomicInteger(0);
         var0.getHoverName().visit((var1x, var2) -> {
            if (var1.get() == 0 && var2 != null && !var2.isBlank()) {
               TextColor var3 = var1x.getColor();
               if (var3 == null) {
                  return Optional.empty();
               }

               var1.set(var3.getValue());
               return Optional.of(Boolean.TRUE);
            } else {
               return Optional.empty();
            }
         }, Style.EMPTY);
         return var1.get();
      } else {
         return 0;
      }
   }

   private void m_6321(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null) {
         long var2 = System.currentTimeMillis();
         double var4 = this.f_18894.m_8768().floatValue();

         for (ItemEntity var7 : f_11537.level.getEntitiesOfClass(ItemEntity.class, f_11537.player.getBoundingBox().inflate(var4), this::m_6316)) {
            if (this.f_18895.m_8768()) {
               Long var8 = this.f_18896.get(var7.getId());
               if (var8 == null || var2 - var8 >= f_18912) {
                  this.f_18896.put(var7.getId(), var2);
                  ItemStack var9 = var7.getItem();
                  String var10 = this.m_6322(var9);
                  Class_8UIDpbIRPAjhei7m.m_1796("", Component.literal(var10 + ""), "", -1, var9.copy());
               }
            }
         }

         Iterator var11 = this.f_18896.entrySet().iterator();

         while (var11.hasNext()) {
            int var12 = (Integer)((Entry)var11.next()).getKey();
            if (f_11537.level.getEntity(var12) == null) {
               var11.remove();
            }
         }
      } else {
         this.f_18896.clear();
      }
   }

   private String m_6322(ItemStack var1) {
      String var2 = this.m_6323(var1);
      if (var2 == null) {
         return f_18928;
      }

      String var3 = StringUtil.stripColor(var1.getHoverName().getString()).trim();
      return var3.isEmpty() ? var2 : var3;
   }

   private String m_6323(ItemStack var1) {
      if (var1 != null && !var1.isEmpty()) {
         Item var2 = var1.getItem();
         if (this.f_18893.m_7145(f_18918) && LootTracker.m_2547(var1)) {
            return f_18919;
         } else if (this.f_18893.m_7145(f_18920) && m_6324(var1)) {
            return f_18921;
         } else if (this.f_18893.m_7145(f_18922) && m_6325(var1)) {
            return f_18923;
         } else if (this.f_18893.m_7145(f_18924) && var2 == Items.ELYTRA) {
            return f_18925;
         } else {
            return this.f_18893.m_7145(f_18926) && m_6318(var2) ? f_18927 : null;
         }
      } else {
         return null;
      }
   }

   private static boolean m_6324(ItemStack var0) {
      String var1 = StringUtil.stripColor(var0.getHoverName().getString()).trim();
      String var2 = var1.toLowerCase(Locale.ROOT).replace('ё', 'е');
      if (!var2.contains(f_18929)) {
         return false;
      }

      String var3 = StringUtil.stripColor(Component.translatable(var0.getItem().getDescriptionId()).getString()).trim();
      return !var1.equalsIgnoreCase(var3);
   }

   private static boolean m_6325(ItemStack var0) {
      if (var0 != null && !var0.isEmpty() && var0.is(Items.TOTEM_OF_UNDYING)) {
         String var1 = StringUtil.stripColor(var0.getHoverName().getString()).trim();
         String var2 = StringUtil.stripColor(Component.translatable(Items.TOTEM_OF_UNDYING.getDescriptionId()).getString()).trim();
         return !var1.equalsIgnoreCase(var2);
      } else {
         return false;
      }
   }

   @Override
   public void m_732() {
      this.f_18896.clear();
   }

   public GroundLoot() {
      super(f_18899, f_18900, Category.MISC);
      this.f_18893 = new ItemListSetting(
         f_18901,
         new Class_2ZaVm8TGDJ68TnJB(f_18902, true),
         new Class_2ZaVm8TGDJ68TnJB(f_18903, true),
         new Class_2ZaVm8TGDJ68TnJB(f_18904, true),
         new Class_2ZaVm8TGDJ68TnJB(f_18905, true),
         new Class_2ZaVm8TGDJ68TnJB(f_18906, true)
      );
      this.f_18894 = new SliderSetting(f_18907, f_18908, f_18909, f_18910).m_828(1.0F);
      this.f_18895 = new CheckboxSetting(f_18911, true);
      this.f_18896 = new HashMap<>();
      this.f_18897 = this::m_6321;
      this.f_18898 = this::m_6315;
      this.m_795(this.f_18893, this.f_18894, this.f_18895);
   }
}
