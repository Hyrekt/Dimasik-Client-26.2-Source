package dev.dimasik.client.module.misc;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.module.combat.Aura;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_FghX3TD0v55wW2U2;
import dev.dimasik.client.system.Class_Wb2zlgDaESbnT0hQ;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_dpBlC70x4optBWBD;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import net.minecraft.client.model.geom.builders.UVPair;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.Vec3;

public class AimingItems extends Module {
   private final ItemListSetting f_16152;
   private ItemEntity f_16153;
   private float f_16154;
   private float f_16155;
   private boolean f_16156;
   private long f_16157;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_16158;
   private final Class_gEPk7yDw6CwIte87<Class_dpBlC70x4optBWBD> f_16159;
   private final Class_gEPk7yDw6CwIte87<Class_Wb2zlgDaESbnT0hQ> f_16160;
   private static final String f_16161 = "AimingItems";
   private static final String f_16162 = "Автоматически прицеливается на ценные предметы";
   private static final String f_16163 = "Элементы";
   private static final String f_16164 = "Шары";
   private static final String f_16165 = "Элитра";
   private static final String f_16166 = "Чарки";
   private static final String f_16167 = "Осколки";
   private static final String f_16168 = "Ауры";
   private static final String f_16169 = "Шары";
   private static final String f_16170 = "Осколки";
   private static final String f_16171 = "Осколок";
   private static final String f_16172 = "Элитра";
   private static final String f_16173 = "Чарки";
   private static final String f_16174 = "Ауры";
   private static final float f_16175 = 1.0E-9F;
   private static final float f_16176 = 0.05F;
   private static final float f_16177 = -7.5F;
   private static final float f_16178 = -90.0F;
   private static final float f_16179 = 90.0F;
   private static final String f_16180 = "Аура Охотника";
   private static final String f_16181 = "Аура Твёрдости Брони";
   private static final String f_16182 = "Аура Телепортации";
   private static final String f_16183 = "Аура Богача";
   private static final String f_16184 = "Аура Защиты От Падения";
   private static final double f_16185 = 2.0;
   private static final double f_16186 = 90.0;

   @Override
   public void m_732() {
      this.m_5642();
   }

   private boolean m_5636(ItemStack var1, String var2) {
      return var1.is(Items.SUNFLOWER) && var2.contains(f_16180)
         || var1.is(Items.CLAY_BALL) && var2.contains(f_16181)
         || var1.is(Items.POPPED_CHORUS_FRUIT) && var2.contains(f_16182)
         || var1.is(Items.GOLD_NUGGET) && var2.contains(f_16183)
         || var1.is((Item)Items.DYE.white()) && var2.contains(f_16184);
   }

   public void m_5637(Class_Xu9btcIeUN33XnMK var1) {
      LocalPlayer var2 = f_11537.player;
      ClientLevel var3 = f_11537.level;
      if (var2 != null && var3 != null) {
         this.f_16153 = null;

         for (Entity var5 : var3.entitiesForRendering()) {
            if (var5 instanceof ItemEntity var6 && !var6.isRemoved()) {
               ItemStack var7 = var6.getItem();
               String var8 = var7.getHoverName().getString();
               boolean var9 = this.f_16152.m_7145(f_16169) && var7.is(Items.PLAYER_HEAD);
               boolean var10 = this.f_16152.m_7145(f_16170) && var8.contains(f_16171);
               boolean var11 = this.f_16152.m_7145(f_16172) && var7.is(Items.ELYTRA);
               boolean var12 = this.f_16152.m_7145(f_16173) && var7.is(Items.ENCHANTED_GOLDEN_APPLE);
               boolean var13 = this.f_16152.m_7145(f_16174) && this.m_5636(var7, var8);
               if (var9 || var10 || var11 || var12 || var13) {
                  this.f_16153 = var6;
               }
            }
         }

         if (!this.m_5640()) {
            this.m_5642();
         }
      } else {
         this.m_5642();
      }
   }

   private void m_5638(Class_Wb2zlgDaESbnT0hQ var1) {
      if (this.m_5640()) {
         var1.m_1582(true);
      }
   }

   public AimingItems() {
      super(f_16161, f_16162, Category.MISC);
      this.f_16152 = new ItemListSetting(
         f_16163,
         new Class_2ZaVm8TGDJ68TnJB(f_16164, true),
         new Class_2ZaVm8TGDJ68TnJB(f_16165, true),
         new Class_2ZaVm8TGDJ68TnJB(f_16166, true),
         new Class_2ZaVm8TGDJ68TnJB(f_16167, true),
         new Class_2ZaVm8TGDJ68TnJB(f_16168, true)
      );
      this.f_16158 = this::m_5637;
      this.f_16159 = this::m_5641;
      this.f_16160 = this::m_5638;
      this.m_795(this.f_16152);
   }

   private UVPair m_5639(LocalPlayer var1, Entity var2, float var3) {
      Vec3 var4 = var1.getEyePosition(var3);
      Vec3 var5 = var2.getPosition(var3);
      double var6 = var5.x;
      double var8 = var5.y + var2.getBbHeight() / f_16185;
      double var10 = var5.z;
      double var12 = var6 - var4.x;
      double var14 = var8 - var4.y;
      double var16 = var10 - var4.z;
      double var18 = Math.sqrt(var12 * var12 + var16 * var16);
      float var20 = (float)(Math.toDegrees(Math.atan2(var16, var12)) - f_16186);
      float var21 = (float)(-Math.toDegrees(Math.atan2(var14, var18)));
      return new UVPair(var20, var21);
   }

   private boolean m_5640() {
      if (f_11537.player != null
         && f_11537.level != null
         && !f_11537.isPaused()
         && this.f_16153 != null
         && !this.f_16153.isRemoved()
         && this.f_16153.level() == f_11537.level) {
         Aura var1 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
         return (var1 == null || var1.m_1114() == null) && !DimasikClient.m_9057().m_9049().m_2801().m_3460().m_776();
      } else {
         return false;
      }
   }

   private void m_5641(Class_dpBlC70x4optBWBD var1) {
      if (!this.m_5640()) {
         this.m_5642();
      } else {
         LocalPlayer var2 = f_11537.player;
         float var3 = f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true);
         UVPair var4 = this.m_5639(var2, this.f_16153, var3);
         Class_FghX3TD0v55wW2U2 var5 = DimasikClient.m_9057().m_9052().m_6342();
         long var6 = System.nanoTime();
         if (!this.f_16156) {
            this.f_16154 = var5.m_2656() != null ? var5.m_2663().x : var2.getYRot();
            this.f_16155 = var5.m_2656() != null ? var5.m_2663().y : var2.getXRot();
            this.f_16156 = true;
            this.f_16157 = var6;
         }

         float var8 = Mth.clamp((float)(var6 - this.f_16157) * f_16175, 0.0F, f_16176);
         this.f_16157 = var6;
         float var9 = 1.0F - (float)Math.exp(f_16177 * var8);
         this.f_16154 = this.f_16154 + Mth.wrapDegrees(var4.u() - this.f_16154) * var9;
         this.f_16155 = this.f_16155 + (var4.v() - this.f_16155) * var9;
         this.f_16155 = Mth.clamp(this.f_16155, f_16178, f_16179);
         var2.setYRot(this.f_16154);
         var2.setXRot(this.f_16155);
         var2.yRotO = this.f_16154;
         var2.xRotO = this.f_16155;
         var5.m_2663().set(this.f_16154, this.f_16155);
         var5.m_2654().set(this.f_16154, this.f_16155);
         var1.m_6349(this.f_16154);
         var1.m_6350(this.f_16155);
      }
   }

   private void m_5642() {
      this.f_16153 = null;
      this.f_16156 = false;
      this.f_16157 = 0L;
   }
}
