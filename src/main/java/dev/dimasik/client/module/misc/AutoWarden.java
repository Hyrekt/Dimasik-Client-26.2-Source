package dev.dimasik.client.module.misc;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.module.render.WardenESP;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_I4ZLf1tdGfKiuaY4;
import dev.dimasik.client.system.Class_QmNR03reugBgWiPr;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_Zqqahn7tp91I2xsr;
import dev.dimasik.client.system.Class_ftHu9o3WzCU3Adxm;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_gXPXh2FDkuYBeJW2;
import dev.dimasik.client.system.Class_h78PE30BIJJYoUEk;
import dev.dimasik.client.system.Class_mRcJJZJYG5cvDAlU;
import dev.dimasik.client.system.Class_nio4jTv6m1ynGWq8;
import dev.dimasik.client.system.Class_uFQsmDRHM5w7NSH1;
import dev.dimasik.client.system.Class_x2jMdN8LP1dDHVdL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import net.minecraft.client.gui.screens.DeathScreen;
import net.minecraft.client.gui.screens.inventory.ContainerScreen;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.core.Direction.Plane;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.protocol.game.ClientboundSoundPacket;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlot.Type;
import net.minecraft.world.entity.monster.warden.Warden;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.equipment.Equippable;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.ChestType;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;

public final class AutoWarden extends Module {
   private final CheckboxSetting f_12106;
   private final CheckboxSetting f_12107;
   private final MultiChoiceSetting f_12108;
   private final List<Integer> f_12109;
   private final Map<BlockPos, Integer> f_12110;
   private final Map<BlockPos, Integer> f_12111;
   private final Class_nio4jTv6m1ynGWq8 f_12112;
   private final Class_I4ZLf1tdGfKiuaY4 f_12113;
   private final Class_I4ZLf1tdGfKiuaY4 f_12114;
   private final Class_QmNR03reugBgWiPr f_12115;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_12116;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_12117;
   private final Class_gEPk7yDw6CwIte87<Class_mRcJJZJYG5cvDAlU> f_12118;
   private int f_12119;
   private int f_12120;
   private boolean f_12121;
   private AABB f_12122;
   private BlockPos f_12123;
   private String f_12124;
   private AutoWarden.i1wIneDt6u4Ta10q f_12125;
   private boolean f_12126;
   private static final String f_12127 = "Auto Warden";
   private static final String f_12128 = "Автоматизирует фарм варденов на анархии";
   private static final String f_12129 = "Использовать скорость";
   private static final String f_12130 = "Репортить обидчиков";
   private static final String f_12131 = "Приоритеты лута";
   private static final String f_12132 = "Низкий";
   private static final String f_12133 = "Средний";
   private static final String f_12134 = "Высокий";
   private static final String f_12135 = "Shift + Пробел — быстрое выключение функции";
   private static final String f_12136 = "avoidance";
   private static final String f_12137 = "maxFallHeightNoWater";
   private static final String f_12138 = "turnSpeed";
   private static final float f_12139 = 75.0F;
   private static final String f_12140 = "blockFreeLook";
   private static final String f_12141 = "randomLooking";
   private static final String f_12142 = "randomLooking113";
   private static final String f_12143 = "allowBreak";
   private static final String f_12144 = "allowPlace";
   private static final String f_12145 = "avoidance";
   private static final String f_12146 = "maxFallHeightNoWater";
   private static final double f_12147 = 32.0;
   private static final String f_12148 = "warden.roar";
   private static final String f_12149 = "warden.angry";
   private static final String f_12150 = "warden.sonic";
   private static final String f_12151 = "Помянем. Вы погибли";
   private static final String f_12152 = "Вас убил";
   private static final String f_12153 = "нет";
   private static final double f_12154 = 2.0;
   private static final String f_12155 = "Вас убил ";
   private static final String f_12156 = ",";
   private static final double f_12157 = 3.0;
   private static final double f_12158 = 0.05;
   private static final double f_12159 = 0.05;
   private static final String f_12160 = "ОШИБКА -> .warden list пустой";
   private static final String f_12161 = "Низкий";
   private static final double f_12162 = 1.5;
   private static final String f_12163 = "Высокий";
   private static final double f_12164 = 0.8;
   private static final long f_12165 = 3L;
   private static final double f_12166 = 14.0;
   private static final String f_12167 = "home";
   private static final double f_12168 = 900.0;
   private static final double f_12169 = 16.0;
   private static final double f_12170 = 0.01;
   private static final double f_12171 = 360.0;
   private static final double f_12172 = 540.0;
   private static final double f_12173 = 360.0;
   private static final double f_12174 = 180.0;
   private static final double f_12175 = 10.0;
   private static final double f_12176 = 16.0;
   private static final double f_12177 = 2.0;
   private static final double f_12178 = -1.0;
   private static final double f_12179 = 25.0;
   private static final double f_12180 = 25.0;
   private static final double f_12181 = Double.MAX_VALUE;
   private static final long f_12182 = 25000L;
   private static final long f_12183 = 1000L;
   private static final long f_12184 = 1000L;
   private static final double f_12185 = 7.0;
   private static final double f_12186 = 2.0;
   private static final long f_12187 = 6000L;
   private static final double f_12188 = 20.0;
   private static final double f_12189 = 10.0;
   private static final double f_12190 = 40.0;
   private static final double f_12191 = 2.4;
   private static final double f_12192 = 10.0;
   private static final double f_12193 = 10.0;
   private static final long f_12194 = 45000L;
   private static final double f_12195 = Double.MAX_VALUE;
   private static final double f_12196 = 16.0;
   private static final double f_12197 = 25.0;
   private static final long f_12198 = 5000L;
   private static final double f_12199 = 144.0;
   private static final double f_12200 = 144.0;
   private static final long f_12201 = 15000L;
   private static final double f_12202 = 625.0;
   private static final double f_12203 = 0.5;
   private static final double f_12204 = 0.5;
   private static final double f_12205 = 0.5;
   private static final double f_12206 = Double.MAX_VALUE;
   private static final double f_12207 = -0.4;
   private static final double f_12208 = 0.41;
   private static final double f_12209 = -0.4;
   private static final double f_12210 = 0.41;
   private static final double f_12211 = -0.4;
   private static final double f_12212 = 0.41;
   private static final double f_12213 = 0.4;
   private static final double f_12214 = 0.4;
   private static final double f_12215 = 0.4;
   private static final double f_12216 = 25.0;
   private static final double f_12217 = 20.0;
   private static final float f_12218 = 90.0F;
   private static final float f_12219 = 90.0F;
   private static final double f_12220 = -1.0;
   private static final float f_12221 = 0.31F;
   private static final double f_12222 = 0.5;
   private static final float f_12223 = 0.73F;
   private static final float f_12224 = 1.1F;
   private static final double f_12225 = 0.3;
   private static final float f_12226 = 1.7F;
   private static final float f_12227 = 2.6F;
   private static final double f_12228 = 0.2;
   private static final double f_12229 = 8.0;
   private static final float f_12230 = 4.0F;
   private static final float f_12231 = -90.0F;
   private static final float f_12232 = 90.0F;
   private static final double f_12233 = 5.0;
   private static final double f_12234 = 0.0025;
   private static final String f_12235 = "Anarchies";
   private static final String f_12236 = "Anarchies";
   private static final String f_12237 = "Anarchies";

   private int m_4339(Predicate<ItemStack> var1) {
      for (int var2 = 0; var2 < 36; var2++) {
         if (var1.test(f_11537.player.getInventory().getItem(var2))) {
            return var2;
         }
      }

      return -1;
   }

   @Override
   public void m_791(JsonObject var1) {
      super.m_791(var1);
      this.f_12109.clear();
      if (var1 != null && var1.has(f_12236)) {
         for (JsonElement var3 : var1.getAsJsonArray(f_12237)) {
            this.f_12109.add(var3.getAsInt());
         }
      }
   }

   private void m_4340(Class_mRcJJZJYG5cvDAlU var1) {
      if (f_11537.player != null) {
         if (this.m_4393() && f_11537.player.getMainHandItem().isEmpty() && !this.m_4381(f_12157)) {
            int var2 = f_11537.player.tickCount % 10 <= ThreadLocalRandom.current().nextInt(3, 9) ? -1 : 1;
            var1.m_7590(var2);
            var1.m_7596(var2);
            var1.m_7587(var2 > 0);
            var1.m_7597(var2 < 0);
            var1.m_7599(var2 > 0);
            var1.m_7594(var2 < 0);
         }
      }
   }

   private boolean m_4341() {
      if (f_11537.gui.screen() instanceof ContainerScreen && f_11537.player.tickCount % 2 == 0) {
         f_11537.player.closeContainer();
      }

      return !(f_11537.gui.screen() instanceof ContainerScreen);
   }

   private double m_4342(int var1, int var2, boolean var3) {
      double var4 = f_12181;

      for (Entity var7 : f_11537.level.entitiesForRendering()) {
         if (var7 != f_11537.player && (var7 instanceof Player || var3 && var7 instanceof Warden)) {
            var4 = Math.min(var4, Math.hypot(var7.getX() - var1, var7.getZ() - var2));
         }
      }

      return var4;
   }

   private int m_4343() {
      return this.f_12109.isEmpty() ? -1 : this.f_12109.getFirst();
   }

   private boolean m_4344() {
      return f_11537.gui.screen() instanceof ContainerScreen var1 && !((ChestMenu)var1.getMenu()).getCarried().isEmpty();
   }

   private boolean m_4345(Warden var1) {
      double var2 = Math.toDegrees(Math.atan2(-(f_11537.player.getX() - var1.getX()), f_11537.player.getZ() - var1.getZ()));
      return Math.abs(((var1.getVisualRotationYInDegrees() - var2) % f_12171 + f_12172) % f_12173 - f_12174) < f_12175;
   }

   private boolean m_4346() {
      return this.m_4343() >= 0 && this.m_4343() == Class_x2jMdN8LP1dDHVdL.m_9441();
   }

   private void m_4347(boolean var1, boolean var2, AutoWarden.i1wIneDt6u4Ta10q var3) {
      if (!var1) {
         if (this.m_4341()) {
            this.f_12125 = var3;
         }
      } else if (f_11537.gui.screen() instanceof ContainerScreen var4) {
         if (var2) {
            this.m_4352(var4);
         } else {
            this.m_4376(var4);
         }
      } else {
         this.m_4391(this.m_4384(var2), 2);
      }
   }

   private void m_4349(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.gui.screen() instanceof DeathScreen && f_11537.player != null && f_11537.player.tickCount >= 5) {
         f_11537.player.respawn();
      }

      if (f_11537.player != null && f_11537.level != null && f_11537.gameMode != null && f_11537.player.connection != null) {
         this.f_12112.m_7695();
         if (f_11537.options.keyShift.isDown() && f_11537.options.keyJump.isDown()) {
            this.m_777();
         } else {
            for (Entity var3 : f_11537.level.entitiesForRendering()) {
               if (var3 instanceof Warden var4) {
                  this.f_12111.put(var4.blockPosition().immutable(), f_11537.player.tickCount + 100);
               }
            }

            this.f_12111.values().removeIf(var0 -> f_11537.player.tickCount > var0);
            if (this.f_12124 != null) {
               if (f_11537.player.tickCount >= 20 && f_11537.player.tickCount < 30) {
                  f_11537.player.connection.sendCommand(this.f_12124 + "");
                  this.f_12124 = null;
               }
            } else if (f_11537.player.tickCount < 5) {
               this.f_12120 = 0;
               this.f_12110.clear();
            } else if (Class_x2jMdN8LP1dDHVdL.m_9441() < 0) {
               if (f_11537.player.tickCount % 100 == 0 && this.m_4343() >= 0 && f_11537.player.tickCount > 300) {
                  f_11537.player.connection.sendCommand(this.m_4343() + "");
               }

               this.f_12125 = AutoWarden.i1wIneDt6u4Ta10q.SAVE;
            } else {
               if (f_11537.player.tickCount % 100 == 0 && Class_Zqqahn7tp91I2xsr.m_5859() && (this.f_12122 == null || !this.m_4373())) {
                  this.f_12122 = Class_Zqqahn7tp91I2xsr.m_5863(f_11537.player.blockPosition().getY());
               }

               if (f_11537.player.hasEffect(MobEffects.GLOWING) && this.m_4364(f_12147)) {
                  this.m_4363(false);
               } else {
                  switch (this.f_12125) {
                     case SAVE:
                        this.m_4387();
                        break;
                     case TAKE:
                        this.m_4375();
                        break;
                     case COLLECTING:
                        this.m_4366();
                        break;
                     case ESCAPE:
                        this.m_4394();
                  }

                  if (this.m_4393() && f_11537.player.tickCount % 15 == 0) {
                     Class_gXPXh2FDkuYBeJW2.m_6802();
                  }
               }
            }
         }
      }
   }

   private void m_4350(Class_XzpX8S5F5zd9jbuE var1) {
      if (var1.m_5619() instanceof ClientboundSoundPacket var2 && f_11537.player != null) {
         SoundEvent var10 = (SoundEvent)var2.getSound().value();
         String var11 = var10.location().getPath();
         if (var11.contains(f_12148)
            || var11.contains(f_12149)
            || var11.contains(f_12150)
            || var10 == SoundEvents.WARDEN_ROAR
            || var10 == SoundEvents.WARDEN_ANGRY
            || var10 == SoundEvents.WARDEN_SONIC_BOOM
            || var10 == SoundEvents.WARDEN_SONIC_CHARGE) {
            this.f_12120 = f_11537.player.tickCount + 100;
         }
      } else if (var1.m_5619() instanceof ClientboundSystemChatPacket var7) {
         String var9 = var7.content().getString();
         if (var9.contains(f_12151)) {
            this.f_12121 = true;
            if (this.f_12107.m_8768() && f_11537.player != null && var9.contains(f_12152)) {
               StringBuilder var4 = new StringBuilder();

               for (MobEffectInstance var6 : f_11537.player.getActiveEffects()) {
                  var4.append(((MobEffect)var6.getEffect().value()).getDisplayName().getString()).append(' ');
               }

               Class_ftHu9o3WzCU3Adxm.m_6731((var4.isEmpty() ? f_12153 : var4.toString().trim()) + "");
               if (!f_11537.player.hasEffect(MobEffects.GLOWING) && !this.m_4381(f_12154)) {
                  this.f_12124 = var9.split(f_12155)[1].split(f_12156)[0].trim();
               }
            }
         }
      }
   }

   public List<Integer> m_4351() {
      return this.f_12109;
   }

   private void m_4352(ContainerScreen var1) {
      if (f_11537.player.tickCount % 2 == 0) {
         boolean var2 = false;
         boolean var3 = false;
         int var4 = 0;

         for (Slot var6 : ((ChestMenu)var1.getMenu()).slots) {
            if (var4 >= 4) {
               return;
            }

            ItemStack var7 = var6.getItem();
            if (var6.container == f_11537.player.getInventory() && !var7.isEmpty() && (!this.f_12106.m_8768() || !Class_uFQsmDRHM5w7NSH1.m_9117(var7))) {
               if (!var2 && Class_uFQsmDRHM5w7NSH1.m_9124(var7)) {
                  var2 = true;
               } else if (!var3 && var7.is(Items.GOLDEN_CARROT)) {
                  var3 = true;
               } else {
                  this.m_4380(var1, var6, 0, ContainerInput.QUICK_MOVE);
                  var4++;
               }
            }
         }
      }
   }

   private BlockPos m_4353(BlockPos var1) {
      double var2 = f_11537.player.tickCount / f_12190 * f_12191;
      return new BlockPos(
         Class_Zqqahn7tp91I2xsr.m_5861(var1.getX() + (int)(Math.cos(var2) * f_12192), this.f_12122),
         var1.getY(),
         Class_Zqqahn7tp91I2xsr.m_5862(var1.getZ() + (int)(Math.sin(var2) * f_12193), this.f_12122)
      );
   }

   private void m_4354(boolean var1) {
      for (Block var3 : BuiltInRegistries.BLOCK) {
         if (var3.defaultBlockState().is(BlockTags.CANDLES)) {
            Class_gXPXh2FDkuYBeJW2.m_6820(var3, var1);
         }
      }
   }

   private BlockPos m_4355() {
      BlockPos var1 = null;
      long var2 = f_12194;

      for (BlockPos var5 : this.f_12112.m_7690()) {
         long var6 = this.f_12112.m_7698(var5);
         if (var6 >= 0L && var6 < var2 && this.m_4392(var5) && !this.m_4362(var5) && !this.m_4374(var5)) {
            var2 = var6;
            var1 = var5;
         }
      }

      return var1;
   }

   private boolean m_4357(BlockPos var1, BlockPos var2) {
      return this.m_4400(Vec3.atCenterOf(var1).add(0.0, f_11537.player.getEyeHeight() - f_12205, 0.0), var2) != null;
   }

   private boolean m_4358() {
      return f_11537.player.getDeltaMovement().horizontalDistanceSqr() > f_12234;
   }

   private boolean m_4359(BlockPos var1) {
      if (f_11537.level.getBlockState(var1.below()).is(Blocks.HOPPER)) {
         return true;
      }

      BlockState var2 = f_11537.level.getBlockState(var1);
      if (var2.hasProperty(BlockStateProperties.CHEST_TYPE) && var2.getValue(BlockStateProperties.CHEST_TYPE) != ChestType.SINGLE) {
         for (Direction var4 : Plane.HORIZONTAL) {
            BlockPos var5 = var1.relative(var4);
            BlockState var6 = f_11537.level.getBlockState(var5);
            if (var6.is(Blocks.CHEST)
               && var6.hasProperty(BlockStateProperties.CHEST_TYPE)
               && var6.getValue(BlockStateProperties.CHEST_TYPE) != ChestType.SINGLE
               && var6.getValue(BlockStateProperties.CHEST_TYPE) != var2.getValue(BlockStateProperties.CHEST_TYPE)
               && var6.getValue(BlockStateProperties.HORIZONTAL_FACING) == var2.getValue(BlockStateProperties.HORIZONTAL_FACING)
               && f_11537.level.getBlockState(var5.below()).is(Blocks.HOPPER)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private boolean m_4360(Player var1) {
      for (EquipmentSlot var5 : new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET}) {
         ItemStack var6 = var1.getItemBySlot(var5);
         Equippable var7 = (Equippable)var6.get(DataComponents.EQUIPPABLE);
         if (var7 != null && var7.slot().getType() == Type.HUMANOID_ARMOR) {
            return true;
         }
      }

      return false;
   }

   private boolean m_4361() {
      if (f_11537.player.tickCount >= this.f_12120) {
         return false;
      }

      for (Entity var2 : f_11537.level.entitiesForRendering()) {
         if (var2 instanceof Warden var3) {
            double var4 = f_11537.player.distanceToSqr(var3);
            if (var4 < f_12168 && this.m_4345(var3) && (var4 < f_12169 || this.m_4368(var3))) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean m_4362(BlockPos var1) {
      for (BlockPos var3 : this.f_12111.keySet()) {
         if (var3.distSqr(var1) < f_12216) {
            return true;
         }
      }

      return false;
   }

   private void m_4363(boolean var1) {
      this.m_4341();
      this.m_4386();
      BlockPos var2 = null;
      double var3 = f_12178;
      int var5 = f_11537.player.blockPosition().getY();

      for (int var6 = 0; var6 < 360; var6 += 30) {
         int var7 = Class_Zqqahn7tp91I2xsr.m_5861((int)(f_11537.player.getX() + Math.cos(Math.toRadians(var6)) * f_12179), this.f_12122);
         int var8 = Class_Zqqahn7tp91I2xsr.m_5862((int)(f_11537.player.getZ() + Math.sin(Math.toRadians(var6)) * f_12180), this.f_12122);
         double var9 = this.m_4342(var7, var8, var1);
         if (var9 > var3) {
            var3 = var9;
            var2 = new BlockPos(var7, var5, var8);
         }
      }

      this.m_4382(var2);
   }

   private boolean m_4364(double var1) {
      double var3 = var1 * var1;

      for (Player var6 : f_11537.level.players()) {
         if (var6 != f_11537.player && f_11537.player.distanceToSqr(var6) < var3) {
            return true;
         }
      }

      return false;
   }

   private int m_4365() {
      int var1 = 0;

      for (ItemStack var3 : f_11537.player.getInventory().getNonEquipmentItems()) {
         if (Class_uFQsmDRHM5w7NSH1.m_9124(var3)) {
            var1++;
         }
      }

      return var1;
   }

   private void m_4366() {
      if (!this.m_4377()) {
         if (this.f_12109.size() <= 1) {
            if (f_11537.player.tickCount % 20 == 0) {
               Class_ftHu9o3WzCU3Adxm.m_6731(f_12160);
            }
         } else {
            if (this.f_12119 >= this.f_12109.size()) {
               this.f_12119 = 1;
            }

            int var1 = this.f_12109.get(this.f_12119);
            if (Class_x2jMdN8LP1dDHVdL.m_9441() != var1) {
               if (f_11537.player.tickCount % 10 == 0 && f_11537.player.tickCount > 10) {
                  f_11537.player.connection.sendCommand(var1 + "");
               }
            } else {
               if (f_11537.player.tickCount > 5) {
                  this.m_4385();
               }
            }
         }
      }
   }

   private int m_4367(int var1) {
      double var2 = this.f_12108.m_7568(f_12161) ? f_12162 : (this.f_12108.m_7568(f_12163) ? f_12164 : 1.0);
      return (int)(var1 * var2);
   }

   private boolean m_4368(Warden var1) {
      return (f_11537.player.getX() - var1.getX()) * (var1.getX() - var1.xo) + (f_11537.player.getZ() - var1.getZ()) * (var1.getZ() - var1.zo) > f_12170;
   }

   private boolean m_4369(ItemStack var1) {
      return var1.isEmpty()
         ? false
         : Class_uFQsmDRHM5w7NSH1.m_9124(var1) && this.m_4365() < 1
            || var1.is(Items.GOLDEN_CARROT) && Class_h78PE30BIJJYoUEk.m_7078(Items.GOLDEN_CARROT) < 3
            || this.f_12106.m_8768() && Class_uFQsmDRHM5w7NSH1.m_9117(var1) && this.m_4339(Class_uFQsmDRHM5w7NSH1::m_9117) < 0;
   }

   private void m_4370(ContainerScreen var1) {
      if (this.m_4358()) {
         Class_gXPXh2FDkuYBeJW2.m_6802();
      } else if (f_11537.player.tickCount % 2 == 0) {
         Slot var2 = this.m_4371(var1, false, var1x -> !var1x.isEmpty() && !Class_uFQsmDRHM5w7NSH1.m_9122(var1x, this.f_12108.m_7564().m_1181()));
         if (var2 == null) {
            this.m_4341();
         } else {
            this.m_4380(var1, var2, 0, ContainerInput.QUICK_MOVE);
         }
      }
   }

   private Slot m_4371(ContainerScreen var1, boolean var2, Predicate<ItemStack> var3) {
      for (Slot var5 : ((ChestMenu)var1.getMenu()).slots) {
         if (var5.container == f_11537.player.getInventory() == var2 && var3.test(var5.getItem())) {
            return var5;
         }
      }

      return null;
   }

   @Override
   public void m_732() {
      Class_gXPXh2FDkuYBeJW2.m_6793(f_12143, false);
      Class_gXPXh2FDkuYBeJW2.m_6793(f_12144, false);
      Class_gXPXh2FDkuYBeJW2.m_6793(f_12145, false);
      Class_gXPXh2FDkuYBeJW2.m_6793(f_12146, 3);
      this.m_4354(false);
      Class_gXPXh2FDkuYBeJW2.m_6802();
      DimasikClient.m_9057().m_9049().m_2813().m_5164(this.f_12113);
      DimasikClient.m_9057().m_9049().m_2813().m_5164(this.f_12114);
      this.f_12126 = false;
      super.m_732();
   }

   private boolean m_4373() {
      return this.f_12122 != null
         && f_11537.player.getX() >= this.f_12122.minX
         && f_11537.player.getX() <= this.f_12122.maxX
         && f_11537.player.getZ() >= this.f_12122.minZ
         && f_11537.player.getZ() <= this.f_12122.maxZ;
   }

   @Override
   public void m_778() {
      int var1 = Class_x2jMdN8LP1dDHVdL.m_9441();
      if (var1 >= 0) {
         this.f_12109.remove(Integer.valueOf(var1));
         this.f_12109.add(0, var1);
      }

      this.f_12119 = 1;
      this.f_12125 = AutoWarden.i1wIneDt6u4Ta10q.COLLECTING;
      this.f_12111.clear();
      WardenESP var2 = DimasikClient.m_9057().m_9049().m_2801().m_3547();
      if (var2 != null && !var2.m_776()) {
         var2.m_792();
      }

      Class_ftHu9o3WzCU3Adxm.m_6731(f_12135);
      Class_gXPXh2FDkuYBeJW2.m_6793(f_12136, true);
      Class_gXPXh2FDkuYBeJW2.m_6793(f_12137, 256);
      Class_gXPXh2FDkuYBeJW2.m_6793(f_12138, f_12139);
      Class_gXPXh2FDkuYBeJW2.m_6793(f_12140, true);
      Class_gXPXh2FDkuYBeJW2.m_6793(f_12141, 1.0);
      Class_gXPXh2FDkuYBeJW2.m_6793(f_12142, 1.0);
      this.m_4354(true);
      super.m_778();
   }

   private boolean m_4374(BlockPos var1) {
      for (Player var3 : f_11537.level.players()) {
         if (var3 != f_11537.player && !(var3.distanceToSqr(Vec3.atCenterOf(var1)) >= f_12217) && this.m_4360(var3)) {
            return true;
         }
      }

      return false;
   }

   private void m_4375() {
      if (this.f_12121 && this.f_12109.size() > 1) {
         this.f_12119++;
         if (this.f_12119 >= this.f_12109.size()) {
            this.f_12119 = 1;
         }

         this.f_12121 = false;
      }

      this.f_12120 = 0;
      this.f_12110.clear();
      if (this.m_4346()) {
         this.m_4347(this.m_4383() || this.m_4344(), false, AutoWarden.i1wIneDt6u4Ta10q.COLLECTING);
      }
   }

   private void m_4376(ContainerScreen var1) {
      if (f_11537.player.tickCount % 2 == 0) {
         ItemStack var2 = ((ChestMenu)var1.getMenu()).getCarried();
         Predicate<ItemStack> var3 = var1x -> var1x.isEmpty() || ItemStack.isSameItemSameComponents(var1x, var2);
         if (!var2.isEmpty()) {
            if (!this.m_4369(var2)) {
               this.m_4380(var1, this.m_4371(var1, false, var3), 0, ContainerInput.PICKUP);
            } else {
               this.m_4380(var1, this.m_4371(var1, true, var3), 1, ContainerInput.PICKUP);
            }
         } else {
            this.m_4380(var1, this.m_4371(var1, false, this::m_4369), 0, ContainerInput.PICKUP);
         }
      }
   }

   private boolean m_4377() {
      boolean var1 = this.m_4361();
      if ((
            var1
               || this.m_4379() > this.m_4367(20)
               || f_11537.player.getFoodData().getFoodLevel() < 8
               || this.f_12110.values().stream().filter(var0 -> var0 >= 2).count() >= f_12165 && f_11537.player.tickCount % 30 == 0
         )
         && f_11537.player.tickCount > 100) {
         if (var1) {
            this.f_12121 = true;
         }

         this.f_12125 = AutoWarden.i1wIneDt6u4Ta10q.ESCAPE;
         return true;
      } else if (!Class_x2jMdN8LP1dDHVdL.m_9440() && this.m_4379() > this.m_4367(8)) {
         this.f_12125 = AutoWarden.i1wIneDt6u4Ta10q.ESCAPE;
         return true;
      } else {
         int var2 = Class_x2jMdN8LP1dDHVdL.m_9442();
         if (var2 >= 0 && var2 < 7 && !this.m_4364(f_12166) && this.m_4379() > this.m_4367(7)) {
            this.f_12125 = AutoWarden.i1wIneDt6u4Ta10q.ESCAPE;
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean m_4378(BlockPos var1, double var2) {
      double var4 = var2 * var2;

      for (Player var7 : f_11537.level.players()) {
         if (var7 != f_11537.player && var7.distanceToSqr(Vec3.atCenterOf(var1)) < var4) {
            return true;
         }
      }

      return false;
   }

   public AutoWarden() {
      super(f_12127, f_12128, Category.MISC);
      this.f_12106 = new CheckboxSetting(f_12129, false);
      this.f_12107 = new CheckboxSetting(f_12130, false);
      this.f_12108 = new MultiChoiceSetting(
         f_12131, 1, new Class_2ZaVm8TGDJ68TnJB(f_12132), new Class_2ZaVm8TGDJ68TnJB(f_12133), new Class_2ZaVm8TGDJ68TnJB(f_12134)
      );
      this.f_12109 = new ArrayList<>();
      this.f_12110 = new HashMap<>();
      this.f_12111 = new HashMap<>();
      this.f_12112 = new Class_nio4jTv6m1ynGWq8();
      this.f_12113 = new Class_I4ZLf1tdGfKiuaY4();
      this.f_12114 = new Class_I4ZLf1tdGfKiuaY4();
      this.f_12115 = new Class_QmNR03reugBgWiPr();
      this.f_12116 = this::m_4349;
      this.f_12117 = this::m_4350;
      this.f_12118 = this::m_4340;
      this.f_12119 = 1;
      this.f_12125 = AutoWarden.i1wIneDt6u4Ta10q.SAVE;
      this.m_795(this.f_12106, this.f_12107, this.f_12108);
   }

   private int m_4379() {
      int var1 = 0;

      for (ItemStack var3 : f_11537.player.getInventory().getNonEquipmentItems()) {
         if (!var3.isEmpty()) {
            var1++;
         }
      }

      return var1;
   }

   private void m_4380(ContainerScreen var1, Slot var2, int var3, ContainerInput var4) {
      if (var2 != null) {
         f_11537.gameMode.handleContainerInput(((ChestMenu)var1.getMenu()).containerId, var2.index, var3, var4, f_11537.player);
      }
   }

   private boolean m_4381(double var1) {
      double var3 = var1 * var1;

      for (BlockPos var6 : this.f_12112.m_7690()) {
         if (f_11537.player.distanceToSqr(Vec3.atCenterOf(var6)) <= var3) {
            return true;
         }
      }

      return false;
   }

   private void m_4382(BlockPos var1) {
      if (var1 != null) {
         if (f_11537.player.tickCount % 10 == 0 || !this.m_4358() && f_11537.player.tickCount % 5 == 0) {
            Class_gXPXh2FDkuYBeJW2.m_6796(
               Class_Zqqahn7tp91I2xsr.m_5861(var1.getX(), this.f_12122), var1.getY(), Class_Zqqahn7tp91I2xsr.m_5862(var1.getZ(), this.f_12122)
            );
         }
      }
   }

   private boolean m_4383() {
      return this.m_4365() < 1
         || Class_h78PE30BIJJYoUEk.m_7078(Items.GOLDEN_CARROT) < 3
         || this.f_12106.m_8768() && this.m_4339(Class_uFQsmDRHM5w7NSH1::m_9117) < 0;
   }

   private BlockPos m_4384(boolean var1) {
      BlockPos var2 = f_11537.player.blockPosition();
      MutableBlockPos var3 = new MutableBlockPos();

      for (int var4 = -4; var4 <= 4; var4++) {
         for (int var5 = -4; var5 <= 4; var5++) {
            for (int var6 = -4; var6 <= 4; var6++) {
               var3.set(var2.getX() + var4, var2.getY() + var5, var2.getZ() + var6);
               if (f_11537.level.getBlockState(var3).is(Blocks.CHEST) && this.m_4359(var3) == var1 && f_11537.level.getBlockState(var3.above()).isAir()) {
                  BlockHitResult var7 = f_11537.level
                     .clip(
                        new ClipContext(
                           f_11537.player.getEyePosition(),
                           Vec3.atCenterOf(var3),
                           net.minecraft.world.level.ClipContext.Block.COLLIDER,
                           Fluid.NONE,
                           f_11537.player
                        )
                     );
                  if (var7.getType() == net.minecraft.world.phys.HitResult.Type.BLOCK && var7.getBlockPos().equals(var3)) {
                     return var3.immutable();
                  }
               }
            }
         }
      }

      return null;
   }

   private void m_4385() {
      MobEffectInstance var1 = f_11537.player.getEffect(MobEffects.INVISIBILITY);
      boolean var2 = f_11537.player.hasEffect(MobEffects.GLOWING) || var1 != null && var1.getDuration() >= 400;
      if (!var2 && var1 == null && this.m_4365() < 1 && f_11537.player.tickCount % 5 == 0 && !Class_x2jMdN8LP1dDHVdL.m_9440()) {
         this.f_12125 = AutoWarden.i1wIneDt6u4Ta10q.ESCAPE;
      } else {
         if (!var2) {
            this.m_4396();
         }

         if (!Class_Zqqahn7tp91I2xsr.m_5859()) {
            if (f_11537.player.tickCount % 50 == 0) {
               f_11537.player.connection.sendCommand(f_12167);
            }
         } else if (var2) {
            int var3 = this.f_12106.m_8768() && f_11537.player.getEffect(MobEffects.SPEED) == null ? this.m_4339(Class_uFQsmDRHM5w7NSH1::m_9117) : -1;
            if (var3 < 0) {
               this.m_4398();
            } else {
               this.m_4395(var3);
            }
         }
      }
   }

   private void m_4386() {
      if (!f_11537.player.getMainHandItem().isEmpty()) {
         for (int var1 = 0; var1 < 9; var1++) {
            if (f_11537.player.getInventory().getItem(var1).isEmpty()) {
               f_11537.player.getInventory().selected = var1;
               return;
            }
         }

         for (int var2 = 9; var2 < 36; var2++) {
            if (f_11537.player.getInventory().getItem(var2).isEmpty()) {
               if (f_11537.player.tickCount % 10 >= 2 && this.m_4358()) {
                  Class_gXPXh2FDkuYBeJW2.m_6802();
               }

               if (f_11537.player.tickCount % 10 == 4) {
                  f_11537.gameMode
                     .handleContainerInput(
                        f_11537.player.inventoryMenu.containerId, var2, f_11537.player.getInventory().selected, ContainerInput.SWAP, f_11537.player
                     );
               }

               return;
            }
         }
      }
   }

   private void m_4387() {
      if (this.m_4343() >= 0
         && Class_x2jMdN8LP1dDHVdL.m_9441() != this.m_4343()
         && !Class_x2jMdN8LP1dDHVdL.m_9440()
         && f_11537.player.tickCount % 5 == 0
         && f_11537.player.tickCount > 5) {
         f_11537.player.connection.sendCommand(this.m_4343() + "");
      }

      if (this.m_4346()) {
         this.m_4386();
         this.m_4347(this.m_4388(), true, AutoWarden.i1wIneDt6u4Ta10q.TAKE);
      }
   }

   @Override
   public JsonObject m_782() {
      JsonObject var1 = super.m_782();
      JsonArray var2 = new JsonArray();

      for (int var4 : this.f_12109) {
         var2.add(var4);
      }

      var1.add(f_12235, var2);
      return var1;
   }

   private boolean m_4388() {
      boolean var1 = false;
      boolean var2 = false;

      for (ItemStack var4 : f_11537.player.getInventory().getNonEquipmentItems()) {
         if (!var4.isEmpty() && (!this.f_12106.m_8768() || !Class_uFQsmDRHM5w7NSH1.m_9117(var4))) {
            if (var1 || !Class_uFQsmDRHM5w7NSH1.m_9124(var4)) {
               if (var2 || !var4.is(Items.GOLDEN_CARROT)) {
                  return true;
               }

               var2 = true;
            } else {
               var1 = true;
            }
         }
      }

      return false;
   }

   private BlockPos m_4390(BlockPos var1) {
      if (var1 == null) {
         return null;
      }

      for (int var2 = -1; var2 <= 1; var2++) {
         for (int var3 = -1; var3 <= 1; var3++) {
            if (var2 != 0 || var3 != 0) {
               BlockPos var4 = var1.offset(var2, 0, var3);
               if (f_11537.level.getBlockState(var4).isAir()
                  && f_11537.level.getBlockState(var4.above()).isAir()
                  && !f_11537.level.getBlockState(var4.below()).isAir()
                  && this.m_4357(var4, var1)) {
                  return var4;
               }
            }
         }
      }

      return f_11537.level.getBlockState(var1.above()).isAir() && f_11537.level.getBlockState(var1.above(2)).isAir() && this.m_4357(var1.above(), var1)
         ? var1.above()
         : null;
   }

   private boolean m_4391(BlockPos var1, int var2) {
      if (var1 != null && !(f_11537.gui.screen() instanceof ContainerScreen)) {
         Vec3 var3 = f_11537.player.getEyePosition();
         Vec3 var4 = this.m_4400(var3, var1);
         if (var4 == null) {
            return false;
         }

         Vec3 var5 = var4.subtract(var3).normalize();
         float var6 = (float)Math.toDegrees(Math.atan2(-var5.x, var5.z));
         float var7 = (float)Math.toDegrees(-Math.asin(Mth.clamp(var5.y, f_12220, 1.0)));
         float var8 = f_11537.player.tickCount + f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(false);
         float var9 = (float)(
            (Math.sin(var8 * f_12221) * f_12222 + Math.sin(var8 * f_12223 + f_12224) * f_12225 + Math.sin(var8 * f_12226 + f_12227) * f_12228) * f_12229
         );
         this.f_12113.m_2950(var6 + var9, Mth.clamp(var7 + var9 / f_12230, f_12231, f_12232));
         DimasikClient.m_9057().m_9049().m_2813().m_5177(this.f_12113, 3, 1);
         if (f_11537.player.tickCount % var2 == 0 && !(Math.hypot(Mth.wrapDegrees(var6 - f_11537.player.getYRot()), var7 - f_11537.player.getXRot()) > f_12233)
            )
          {
            BlockHitResult var10 = f_11537.level
               .clip(new ClipContext(var3, var4, net.minecraft.world.level.ClipContext.Block.COLLIDER, Fluid.NONE, f_11537.player));
            if (var10.getType() == net.minecraft.world.phys.HitResult.Type.BLOCK && var10.getBlockPos().equals(var1)) {
               f_11537.gameMode.useItemOn(f_11537.player, InteractionHand.MAIN_HAND, var10);
               f_11537.player.swing(InteractionHand.MAIN_HAND);
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean m_4392(BlockPos var1) {
      return this.m_4390(var1) != null;
   }

   private boolean m_4393() {
      BlockState var1 = f_11537.level.getBlockState(f_11537.player.blockPosition());
      BlockState var2 = f_11537.level.getBlockState(f_11537.player.blockPosition().below());
      return !var1.is(BlockTags.CANDLES) && !var2.is(BlockTags.CANDLES)
         ? !this.m_4361()
            && this.f_12125 == AutoWarden.i1wIneDt6u4Ta10q.COLLECTING
            && Class_Zqqahn7tp91I2xsr.m_5859()
            && f_11537.gui.screen() == null
            && this.m_4399()
         : true;
   }

   private void m_4394() {
      if (this.m_4346()) {
         this.f_12125 = AutoWarden.i1wIneDt6u4Ta10q.SAVE;
      } else if (this.m_4361() && Class_x2jMdN8LP1dDHVdL.m_9440()) {
         this.m_4363(true);
      } else {
         BlockPos var1 = this.m_4397();
         if (!(f_11537.gui.screen() instanceof ContainerScreen)
            && (var1 == null || this.f_12112.m_7698(var1) >= 0L || !(f_11537.player.getEyePosition().distanceToSqr(Vec3.atCenterOf(var1)) <= f_12176))) {
            if (!Class_x2jMdN8LP1dDHVdL.m_9440()) {
               this.f_12125 = AutoWarden.i1wIneDt6u4Ta10q.SAVE;
            } else {
               if (this.m_4379() < 23 && !this.m_4364(f_12177) && Class_x2jMdN8LP1dDHVdL.m_9442() > 16 && var1 != null) {
                  this.m_4398();
               } else {
                  this.m_4363(true);
               }
            }
         } else {
            this.m_4398();
         }
      }
   }

   private void m_4395(int var1) {
      this.f_12114.m_2950(f_11537.player.getYRot(), f_12218);
      if (DimasikClient.m_9057().m_9049().m_2813().m_5177(this.f_12114, 10, 1)) {
         this.f_12126 = true;
         if (!(Math.abs(f_12219 - f_11537.player.getXRot()) > 1.0F)) {
            int var2 = f_11537.player.getInventory().selected;
            if (var1 < 9) {
               Class_h78PE30BIJJYoUEk.m_7082(var1);
               f_11537.gameMode.useItem(f_11537.player, InteractionHand.MAIN_HAND);
            } else {
               f_11537.gameMode.handleContainerInput(0, var1, var2, ContainerInput.SWAP, f_11537.player);
               Class_h78PE30BIJJYoUEk.m_7082(var2);
               f_11537.gameMode.useItem(f_11537.player, InteractionHand.MAIN_HAND);
               f_11537.gameMode.handleContainerInput(0, var1, var2, ContainerInput.SWAP, f_11537.player);
            }

            Class_h78PE30BIJJYoUEk.m_7082(var2);
            DimasikClient.m_9057().m_9049().m_2813().m_5175(this.f_12114);
            this.f_12126 = false;
         }
      }
   }

   private void m_4396() {
      int var1 = this.m_4339(Class_uFQsmDRHM5w7NSH1::m_9124);
      if (var1 >= 0 && f_11537.player.tickCount > 20) {
         this.m_4395(var1);
      }
   }

   private BlockPos m_4397() {
      BlockPos var1 = null;
      byte var2 = 99;
      double var3 = f_12195;

      for (BlockPos var6 : this.f_12112.m_7690()) {
         if (this.m_4392(var6) && !this.m_4374(var6)) {
            double var7 = f_11537.player.getEyePosition().distanceToSqr(Vec3.atCenterOf(var6));
            long var9 = this.f_12112.m_7698(var6);
            if ((!this.m_4362(var6) || var9 < 0L && var7 <= f_12196) && (var9 >= 0L || this.f_12110.getOrDefault(var6, 0) < 3)) {
               byte var11;
               if (var9 < 0L && var7 <= f_12197) {
                  var11 = 0;
               } else if (var9 >= 0L && var9 <= f_12198 && var7 <= f_12199) {
                  var11 = 1;
               } else if (var9 < 0L && var7 <= f_12200) {
                  var11 = 2;
               } else if (var9 >= 0L && var9 <= f_12201 && var7 <= f_12202) {
                  var11 = 3;
               } else {
                  if (var9 >= 0L) {
                     continue;
                  }

                  var11 = 4;
               }

               double var12 = Vec3.atCenterOf(var6).y - f_11537.player.getEyeY();
               double var14 = var6.getX() + f_12203 - f_11537.player.getX();
               double var16 = var6.getZ() + f_12204 - f_11537.player.getZ();
               double var18 = var14 * var14 + var16 * var16 + (var12 > 0.0 ? 2 : 1) * var12 * var12;
               if (var11 < var2 || var11 == var2 && var18 < var3) {
                  var2 = var11;
                  var3 = var18;
                  var1 = var6;
               }
            }
         }
      }

      return var1;
   }

   private void m_4398() {
      if (f_11537.gui.screen() instanceof ContainerScreen var9) {
         this.m_4370(var9);
      } else {
         BlockPos var1 = this.m_4397();
         if (var1 == null) {
            var1 = this.m_4355();
         }

         boolean var10 = var1 != null && this.f_12123 != null && !var1.equals(this.f_12123) && this.f_12112.m_7698(this.f_12123) > f_12182;
         if (!var10) {
            this.f_12115.m_4459();
         }

         if (!var10 || this.f_12115.m_4463(f_12183)) {
            this.f_12123 = var1;
         }

         BlockPos var3 = this.f_12123;
         if (var3 == null && f_11537.player.tickCount % 40 == 0) {
            this.f_12125 = AutoWarden.i1wIneDt6u4Ta10q.ESCAPE;
            this.f_12121 = true;
         } else if (var3 != null) {
            long var4 = this.f_12112.m_7698(var3);
            if (var4 > f_12184 && this.m_4378(var3, f_12185)) {
               BlockPos var11 = this.m_4390(var3);
               if (var11 != null) {
                  if (f_11537.player.distanceToSqr(Vec3.atCenterOf(var11)) > f_12186) {
                     this.m_4382(var11);
                  } else {
                     Class_gXPXh2FDkuYBeJW2.m_6802();
                  }
               }
            } else if (var4 > f_12187) {
               this.m_4382(this.m_4353(var3));
            } else {
               double var6 = f_11537.player.getEyePosition().distanceToSqr(Vec3.atCenterOf(var3));
               if (var6 <= f_12188) {
                  int var8 = var4 >= 0L ? 1 : 3;
                  if (this.f_12110.getOrDefault(var3, 0) < var8 && this.m_4391(var3, var4 >= 0L ? 6 : 1)) {
                     this.f_12110.merge(var3, 1, Integer::sum);
                  }
               } else {
                  if (var6 > f_12189) {
                     this.m_4386();
                  }

                  this.m_4382(this.m_4390(var3));
               }
            }
         }
      }
   }

   private boolean m_4399() {
      AABB var1 = f_11537.player.getBoundingBox().inflate(f_12158, 0.0, f_12159);

      for (BlockPos var3 : BlockPos.betweenClosed(BlockPos.containing(var1.minX, var1.minY, var1.minZ), BlockPos.containing(var1.maxX, var1.maxY, var1.maxZ))) {
         if (!f_11537.level.getBlockState(var3).isAir()) {
            return true;
         }
      }

      return false;
   }

   private Vec3 m_4400(Vec3 var1, BlockPos var2) {
      Vec3 var3 = Vec3.atCenterOf(var2);
      Vec3 var4 = null;
      double var5 = f_12206;

      for (double var7 = f_12207; var7 <= f_12208; var7 += f_12215) {
         for (double var9 = f_12209; var9 <= f_12210; var9 += f_12214) {
            for (double var11 = f_12211; var11 <= f_12212; var11 += f_12213) {
               Vec3 var13 = var3.add(var7, var9, var11);
               double var14 = var13.distanceToSqr(var3);
               if (!(var14 >= var5)) {
                  BlockHitResult var16 = f_11537.level
                     .clip(new ClipContext(var1, var13, net.minecraft.world.level.ClipContext.Block.COLLIDER, Fluid.NONE, f_11537.player));
                  if (var16.getType() == net.minecraft.world.phys.HitResult.Type.BLOCK && var16.getBlockPos().equals(var2)) {
                     var5 = var14;
                     var4 = var13;
                  }
               }
            }
         }
      }

      return var4;
   }

   private enum i1wIneDt6u4Ta10q {
      SAVE,
      TAKE,
      COLLECTING,
      ESCAPE;
   }
}
