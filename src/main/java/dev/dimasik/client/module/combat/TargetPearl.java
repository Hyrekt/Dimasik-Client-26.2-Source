package dev.dimasik.client.module.combat;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.manager.ModuleManager;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_3LQSDrJ0WJYOQ7ck;
import dev.dimasik.client.system.Class_3tFUGm5rgVT7VgqP;
import dev.dimasik.client.system.Class_B6vpBUNmRtH3JzmV;
import dev.dimasik.client.system.Class_FghX3TD0v55wW2U2;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_i7qN6fWCX6JrM0uQ;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.game.ClientboundAddEntityPacket;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket.PosRot;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Mth;
import net.minecraft.util.StringUtil;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.throwableitemprojectile.ThrownEnderpearl;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;

public class TargetPearl extends Module {
   private static final int f_12529 = 320;
   private static final double f_12530 = 0.03;
   private static final double f_12531 = 0.99;
   private static final double f_12532 = 0.8;
   private static final double f_12533 = 1.5;
   private static final double f_12534 = 0.1;
   private static final float f_12535 = (float) (Math.PI / 180.0);
   private static final double f_12536 = 0.42;
   private static final double f_12537 = 1.75;
   private static final double f_12538 = 16.0;
   private static final double f_12539 = 0.3;
   private final CheckboxSetting f_12540;
   private final SliderSetting f_12541;
   private final SliderSetting f_12542;
   private final CheckboxSetting f_12543;
   private final CheckboxSetting f_12544;
   private final CheckboxSetting f_12545;
   private final CheckboxSetting f_12546;
   private final MultiChoiceSetting f_12547;
   private final Set<Integer> f_12548;
   private final Set<Integer> f_12549;
   private UUID f_12550;
   private long f_12551;
   private boolean f_12552;
   private boolean f_12553;
   private int f_12554;
   private Vec3 f_12555;
   private int f_12556;
   private boolean f_12557;
   private Vec3 f_12558;
   private UUID f_12559;
   private long f_12560;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_12561;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_12562;
   private final Class_gEPk7yDw6CwIte87<Class_3tFUGm5rgVT7VgqP> f_12563;
   private static final String f_12564 = "TargetPearl";
   private static final String f_12565 = "Кидает пёрл в траекторию чужого эндер жемчуга";
   private static final String f_12566 = "Только за таргетом";
   private static final String f_12567 = "Память таргета";
   private static final float f_12568 = 12.0F;
   private static final float f_12569 = 30.0F;
   private static final String f_12570 = "Минимальная дистанция";
   private static final float f_12571 = 10.0F;
   private static final float f_12572 = 8.0F;
   private static final float f_12573 = 20.0F;
   private static final String f_12574 = "Компенсировать прыжком";
   private static final String f_12575 = "Не кидать в энтити";
   private static final String f_12576 = "Учитывать воду";
   private static final String f_12577 = "Авто ловушка";
   private static final String f_12578 = "Тип ловушки";
   private static final String f_12579 = "Эндер Ловушка";
   private static final String f_12580 = "Ловушка";
   private static final String f_12581 = "Любая";
   private static final int f_12582 = Integer.MAX_VALUE;
   private static final double f_12583 = 0.35;
   private static final String f_12584 = "Легитный";
   private static final long f_12585 = 4000L;
   private static final double f_12586 = 25.0;
   private static final long f_12587 = 1500L;
   private static final float f_12588 = 6.0F;
   private static final double f_12589 = 0.5;
   private static final float f_12590 = -90.0F;
   private static final float f_12591 = 90.0F;
   private static final String f_12592 = "ender";
   private static final String f_12593 = "trap";
   private static final String f_12594 = "Эндер Ловушка";
   private static final String f_12595 = "Ловушка";
   private static final String f_12596 = "\\s+";
   private static final String f_12597 = " ";
   private static final String f_12598 = "эндер ловушка";
   private static final String f_12599 = "ender";
   private static final String f_12600 = "ловушка";
   private static final String f_12601 = "trap";
   private static final double f_12602 = 0.25;
   private static final float f_12603 = 25.0F;
   private static final float f_12604 = 25.0F;
   private static final float f_12605 = 0.35F;
   private static final float f_12606 = 25.0F;
   private static final float f_12607 = 25.0F;
   private static final float f_12608 = 0.35F;
   private static final float f_12609 = -70.0F;
   private static final float f_12610 = 70.0F;
   private static final float f_12611 = -70.0F;
   private static final float f_12612 = 70.0F;
   private static final float f_12613 = -90.0F;
   private static final float f_12614 = 90.0F;
   private static final float f_12615 = -90.0F;
   private static final float f_12616 = 90.0F;
   private static final float f_12617 = -0.6F;
   private static final float f_12618 = 0.6F;
   private static final float f_12619 = 0.1F;
   private static final float f_12620 = 0.05F;
   private static final double f_12621 = 1.75;
   private static final double f_12622 = 3.5;
   private static final float f_12623 = -90.0F;
   private static final float f_12624 = 90.0F;
   private static final double f_12625 = 1.0E-4;
   private static final double f_12626 = 3.0;
   private static final double f_12627 = 2.0;
   private static final double f_12628 = 0.8;
   private static final double f_12629 = 0.99;
   private static final double f_12630 = -0.03;
   private static final double f_12631 = 0.1;
   private static final float f_12632 = (float) (Math.PI / 180.0);
   private static final float f_12633 = (float) (Math.PI / 180.0);
   private static final double f_12634 = 1.5;
   private static final double f_12635 = 0.1;
   private static final double f_12636 = 0.8;
   private static final double f_12637 = 0.99;
   private static final double f_12638 = -0.03;
   private static final double f_12639 = 1.3;
   private static final double f_12640 = Double.MAX_VALUE;
   private static final double f_12641 = 0.3;
   private static final double f_12642 = 1.0E-4;
   private static final double f_12643 = 3.0;
   private static final double f_12644 = 2.0;
   private static final double f_12645 = 256.0;
   private static final double f_12646 = 256.0;
   private static final double f_12647 = 1.0E-4;
   private static final double f_12648 = 6.0;
   private static final double f_12649 = 4.0;
   private static final double f_12650 = 64.0;
   private static final float f_12651 = 1000.0F;
   private static final double f_12652 = 0.1;
   private static final double f_12653 = 0.42;

   private boolean m_4526(ThrownEnderpearl var1, LivingEntity var2) {
      Vec3 var3 = var1.position();
      Vec3 var4 = var1.getDeltaMovement();
      if (var2.distanceToSqr(var3) <= f_12646) {
         return true;
      }

      if (var4.lengthSqr() < f_12647) {
         return false;
      }

      Vec3 var5 = var3.subtract(var4.normalize().scale(Math.min(f_12648, var4.length() * f_12649)));
      return var2.distanceToSqr(var5) <= f_12650;
   }

   private void m_4527() {
      this.m_4566();
      this.m_4539(false);
      this.f_12552 = false;
      this.f_12554 = -1;
      this.f_12555 = null;
      this.f_12556 = 0;
   }

   private void m_4528() {
      this.f_12556++;
      if (this.f_12545.m_8768() && this.m_4538()) {
         this.m_4527();
      } else if (f_11537.player.onGround()) {
         this.m_4537();
         if (this.f_12556 > 6) {
            this.m_4527();
         }
      } else {
         this.m_4566();
         Vec3 var1 = this.f_12555;
         if (f_11537.level.getEntity(this.f_12554) instanceof ThrownEnderpearl var3) {
            Vec3 var4 = this.m_4547(var3);
            if (var4 != null) {
               var1 = var4;
            }
         }

         TargetPearl.qAnIbGFYe25vDW8m var5 = this.m_4565(this.m_4544(), this.m_4554(false), var1);
         if (var5 == null) {
            var5 = this.m_4532(var1);
         }

         if (var5 == null) {
            this.m_4527();
         } else {
            this.f_12552 = false;
            this.f_12554 = -1;
            this.f_12555 = null;
            this.m_4568(var1, var5.f_12522, var5.f_12523);
         }
      }
   }

   private boolean m_4529(ThrownEnderpearl var1) {
      Entity var2 = this.m_4530(var1);
      if (var2 == f_11537.player) {
         return false;
      } else if (var2 != null && DimasikClient.m_9057().m_9049().m_2804().m_2877(var2.getName().getString())) {
         return false;
      } else if (!this.f_12540.m_8768()) {
         return true;
      } else {
         LivingEntity var3 = this.m_4561();
         if (var3 == null) {
            return false;
         } else {
            return var2 == null ? this.m_4526(var1, var3) : var2 == var3 || var2.getUUID().equals(var3.getUUID());
         }
      }
   }

   private Entity m_4530(ThrownEnderpearl var1) {
      Entity var2 = var1.getOwner();
      if (var2 != null) {
         return var2;
      }

      Vec3 var3 = var1.position();
      Vec3 var4 = var1.getDeltaMovement();
      Vec3 var5 = var4.lengthSqr() < f_12642 ? var3 : var3.subtract(var4.normalize().scale(Math.min(f_12643, var4.length() * f_12644)));
      Player var6 = null;
      double var7 = f_12645;

      for (Player var10 : f_11537.level.players()) {
         if (var10 != f_11537.player && var10.isAlive()) {
            double var11 = var10.distanceToSqr(var5);
            if (var11 < var7) {
               var7 = var11;
               var6 = var10;
            }
         }
      }

      return var6;
   }

   private void m_4531() {
      this.f_12557 = false;
      this.f_12558 = null;
      this.f_12559 = null;
      this.f_12560 = 0L;
   }

   private TargetPearl.qAnIbGFYe25vDW8m m_4532(Vec3 var1) {
      Vec3 var2 = this.m_4544();
      Vec3 var3 = var1.subtract(var2);
      float var4 = (float)Math.toDegrees(Math.atan2(-var3.x, var3.z));
      double var5 = Math.sqrt(var3.x * var3.x + var3.z * var3.z);
      float var7 = (float)(-Math.toDegrees(Math.atan2(var3.y, var5)));
      TargetPearl.qAnIbGFYe25vDW8m var8 = null;

      for (float var9 = var7 - f_12603; var9 <= var7 + f_12604; var9 += f_12605) {
         TargetPearl.qAnIbGFYe25vDW8m var10 = this.m_4536(var2, this.m_4554(false), var1, var4, var9);
         if (var10 != null && (!this.f_12544.m_8768() || !var10.f_12526) && (var8 == null || var10.f_12524 < var8.f_12524)) {
            var8 = var10;
         }
      }

      if (var8 != null) {
         return var8.m_4525(false);
      }

      for (float var11 = var7 - f_12606; var11 <= var7 + f_12607; var11 += f_12608) {
         TargetPearl.qAnIbGFYe25vDW8m var12 = this.m_4536(var2, this.m_4554(false), var1, var4, var11);
         if (var12 != null && (var8 == null || var12.f_12524 < var8.f_12524)) {
            var8 = var12;
         }
      }

      return var8 == null ? null : var8.m_4525(false);
   }

   private boolean m_4533(int var1) {
      if (Class_B6vpBUNmRtH3JzmV.m_2126(var1)) {
         int var3 = f_11537.player.getInventory().selected;
         Class_B6vpBUNmRtH3JzmV.m_2131(Class_B6vpBUNmRtH3JzmV.m_2127(var1));
         f_11537.gameMode.useItem(f_11537.player, InteractionHand.MAIN_HAND);
         Class_B6vpBUNmRtH3JzmV.m_2131(var3);
         return true;
      } else {
         int var2 = f_11537.player.getInventory().selected;
         Class_B6vpBUNmRtH3JzmV.m_2129(8, var1);
         Class_B6vpBUNmRtH3JzmV.m_2131(8);
         f_11537.gameMode.useItem(f_11537.player, InteractionHand.MAIN_HAND);
         Class_B6vpBUNmRtH3JzmV.m_2131(var2);
         Class_B6vpBUNmRtH3JzmV.m_2129(8, var1);
         return true;
      }
   }

   private void m_4534() {
      if (this.f_12557) {
         if (this.f_12546.m_8768() && Class_i7qN6fWCX6JrM0uQ.m_7233().m_7235()) {
            if (System.currentTimeMillis() > this.f_12560) {
               this.m_4531();
            } else if (this.f_12558 == null || !(f_11537.player.distanceToSqr(this.f_12558) > f_12586)) {
               LivingEntity var1 = this.m_4553();
               if (var1 != null && var1.isAlive()) {
                  float var2 = this.m_4557();
                  if (!(f_11537.player.distanceTo(var1) > var2)) {
                     if (this.m_4560(var1)) {
                        this.m_4531();
                     }
                  }
               } else {
                  if (System.currentTimeMillis() + f_12587 > this.f_12560) {
                     this.m_4531();
                  }
               }
            }
         } else {
            this.m_4531();
         }
      }
   }

   private Vec3 m_4535(Vec3 var1, Vec3 var2) {
      AABB var3 = new AABB(var1, var2).inflate(f_12639);
      List var4 = f_11537.level.getEntities(f_11537.player, var3, this::m_4555);
      if (var4.isEmpty()) {
         return null;
      }

      Vec3 var5 = null;
      double var6 = f_12640;

      for (Entity var9 : (Iterable<Entity>) (Iterable) var4) {
         Optional var10 = var9.getBoundingBox().inflate(f_12641).clip(var1, var2);
         if (!var10.isEmpty()) {
            double var11 = var1.distanceToSqr((Vec3)var10.get());
            if (!(var11 >= var6)) {
               var5 = (Vec3)var10.get();
               var6 = var11;
            }
         }
      }

      return var5;
   }

   private TargetPearl.qAnIbGFYe25vDW8m m_4536(Vec3 var1, Vec3 var2, Vec3 var3, float var4, float var5) {
      TargetPearl.sI7UhN2Ccz4SgMIs var6 = this.m_4559(var1, var2, var4, var5, true);
      return var6 == null
         ? null
         : new TargetPearl.qAnIbGFYe25vDW8m(var4, Mth.clamp(var5, f_12623, f_12624), var6.f_12527.distanceTo(var3), false, var6.f_12528);
   }

   private void m_4537() {
      f_11537.options.keyJump.setDown(true);
      this.f_12553 = true;
   }

   private boolean m_4538() {
      return f_11537.player.isUnderWater() || f_11537.player.isEyeInFluid(FluidTags.WATER);
   }

   @Override
   public void m_778() {
      this.m_4552();
   }

   private void m_4539(boolean var1) {
      Aura var2 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
      if (var2 != null) {
         var2.m_1043(var1);
      }
   }

   private Entity m_4540(UUID var1) {
      for (Entity var3 : f_11537.level.entitiesForRendering()) {
         if (var3.getUUID().equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   private void m_4541(Class_XzpX8S5F5zd9jbuE var1) {
      if (var1.m_5619() instanceof ClientboundAddEntityPacket var2) {
         if (var2.getType() == EntityTypes.ENDER_PEARL) {
            this.f_12549.add(var2.getId());
         }
      }
   }

   private TargetPearl.qAnIbGFYe25vDW8m m_4542(TargetPearl.qAnIbGFYe25vDW8m var1, TargetPearl.qAnIbGFYe25vDW8m var2) {
      if (var1 != null && var2 != null) {
         return var2.f_12524 + f_12602 < var1.f_12524 ? var2.m_4525(true) : var1.m_4525(false);
      } else if (var2 != null) {
         return var2.m_4525(true);
      } else {
         return var1 == null ? null : var1.m_4525(false);
      }
   }

   private static String m_4543(ItemStack var0) {
      if (var0 != null && !var0.isEmpty() && var0.is(Items.HEART_OF_THE_SEA)) {
         String var1 = StringUtil.stripColor(var0.getHoverName().getString()).toLowerCase(Locale.ROOT).replace('ё', 'е').replaceAll(f_12596, f_12597).trim();
         if (var1.equals(f_12598)) {
            return f_12599;
         } else {
            return var1.equals(f_12600) ? f_12601 : null;
         }
      } else {
         return null;
      }
   }

   private Vec3 m_4544() {
      return new Vec3(f_11537.player.getX(), f_11537.player.getEyeY() - f_12652, f_11537.player.getZ());
   }

   private void m_4545() {
      LivingEntity var1 = this.m_4563();
      if (var1 != null && var1.isAlive()) {
         this.f_12550 = var1.getUUID();
         this.f_12551 = System.currentTimeMillis();
      }
   }

   private int m_4546() {
      int var1 = -1;
      int var2 = -1;

      for (int var3 = 0; var3 < f_11537.player.getInventory().getNonEquipmentItems().size(); var3++) {
         ItemStack var4 = (ItemStack)f_11537.player.getInventory().getNonEquipmentItems().get(var3);
         String var5 = m_4543(var4);
         if (var5 != null) {
            int var6 = var3 < 9 ? var3 + 36 : var3;
            if (var5.equals(f_12592)) {
               var2 = var6;
            } else if (var5.equals(f_12593)) {
               var1 = var6;
            }
         }
      }

      if (this.f_12547.m_7568(f_12594)) {
         return var2;
      } else if (this.f_12547.m_7568(f_12595)) {
         return var1;
      } else {
         return var2 != -1 ? var2 : var1;
      }
   }

   private Vec3 m_4547(ThrownEnderpearl var1) {
      Vec3 var2 = var1.position();
      Vec3 var3 = var1.getDeltaMovement();

      for (int var4 = 0; var4 < 320; var4++) {
         Vec3 var5 = var2;
         var2 = var2.add(var3);
         var3 = var3.scale(var1.isInWater() ? f_12628 : f_12629).add(0.0, f_12630, 0.0);
         BlockHitResult var6 = f_11537.level.clip(new ClipContext(var5.add(0.0, f_12631, 0.0), var2, Block.COLLIDER, Fluid.NONE, f_11537.player));
         if (var6.getType() == Type.BLOCK) {
            return var6.getLocation();
         }
      }

      return var2;
   }

   private void m_4548(Class_3tFUGm5rgVT7VgqP var1) {
      if (this.f_12557) {
         this.m_4534();
      }
   }

   private boolean m_4549(Vec3 var1) {
      BlockPos var2 = BlockPos.containing(var1);
      FluidState var3 = f_11537.level.getFluidState(var2);
      return var3.is(FluidTags.WATER) && var3.getHeight(f_11537.level, var2) > 0.0;
   }

   private void m_4550() {
      if (Class_B6vpBUNmRtH3JzmV.m_2128(Items.ENDER_PEARL) != -1) {
         if (f_11537.gui.screen() == null) {
            if (!this.f_12545.m_8768() || !this.m_4538()) {
               ThrownEnderpearl var1 = null;
               Vec3 var2 = null;
               int var3 = f_12582;

               for (Integer var5 : Set.copyOf(this.f_12549)) {
                  if (f_11537.level.getEntity(var5) instanceof ThrownEnderpearl var7) {
                     this.f_12549.remove(var5);
                     if (!this.f_12548.contains(var7.getId()) && this.m_4529(var7)) {
                        Vec3 var8 = this.m_4547(var7);
                        if (var8 != null) {
                           if (this.m_4556(var7, var8)) {
                              var1 = var7;
                              var2 = var8;
                              var3 = -1;
                              break;
                           }

                           this.f_12548.add(var7.getId());
                        }
                     }
                  }
               }

               if (var1 == null) {
                  for (Entity var10 : f_11537.level.entitiesForRendering()) {
                     if (var10 instanceof ThrownEnderpearl var11 && !this.f_12548.contains(var11.getId()) && this.m_4529(var11)) {
                        Vec3 var12 = this.m_4547(var11);
                        if (var12 != null) {
                           if (!this.m_4556(var11, var12)) {
                              this.f_12548.add(var11.getId());
                           } else if (var11.tickCount < var3) {
                              var3 = var11.tickCount;
                              var1 = var11;
                              var2 = var12;
                           }
                        }
                     }
                  }
               }

               if (var1 != null && var2 != null) {
                  this.m_4558(var1, var2);
               }
            }
         }
      }
   }

   private Vec3 m_4551(ThrownEnderpearl var1) {
      Entity var2 = this.m_4530(var1);
      if (var2 != null) {
         return var2.position();
      }

      Vec3 var3 = var1.position();
      Vec3 var4 = var1.getDeltaMovement();
      return var4.lengthSqr() < f_12625 ? var3 : var3.subtract(var4.normalize().scale(Math.min(f_12626, var4.length() * f_12627)));
   }

   private void m_4552() {
      this.m_4527();
      this.m_4531();
      this.f_12548.clear();
      this.f_12549.clear();
      this.f_12550 = null;
      this.f_12551 = 0L;
   }

   public TargetPearl() {
      super(f_12564, f_12565, Category.COMBAT);
      this.f_12540 = new CheckboxSetting(f_12566, true);
      this.f_12541 = new SliderSetting(f_12567, f_12568, 1.0F, f_12569).m_828(1.0F).m_822(this.f_12540::m_8768);
      this.f_12542 = new SliderSetting(f_12570, f_12571, f_12572, f_12573).m_828(1.0F);
      this.f_12543 = new CheckboxSetting(f_12574, true);
      this.f_12544 = new CheckboxSetting(f_12575, true);
      this.f_12545 = new CheckboxSetting(f_12576, true);
      this.f_12546 = new CheckboxSetting(f_12577, false);
      this.f_12547 = new MultiChoiceSetting(
            f_12578, new Class_2ZaVm8TGDJ68TnJB(f_12579), new Class_2ZaVm8TGDJ68TnJB(f_12580), new Class_2ZaVm8TGDJ68TnJB(f_12581)
         )
         .m_822(this.f_12546::m_8768);
      this.f_12548 = new HashSet<>();
      this.f_12549 = new HashSet<>();
      this.f_12554 = -1;
      this.f_12561 = this::m_4567;
      this.f_12562 = this::m_4541;
      this.f_12563 = this::m_4548;
      this.m_795(this.f_12540, this.f_12541, this.f_12542, this.f_12543, this.f_12544, this.f_12545, this.f_12546, this.f_12547);
   }

   private LivingEntity m_4553() {
      if (this.f_12559 != null) {
         for (Player var2 : f_11537.level.players()) {
            if (var2.getUUID().equals(this.f_12559) && var2.isAlive() && !var2.isSpectator()) {
               return var2;
            }
         }

         if (this.m_4540(this.f_12559) instanceof LivingEntity var4 && var4.isAlive() && !var4.isSpectator()) {
            return var4;
         }
      }

      return this.m_4561();
   }

   private Vec3 m_4554(boolean var1) {
      Vec3 var2 = f_11537.player.getDeltaMovement();
      if (var1) {
         return new Vec3(var2.x, f_12653, var2.z);
      } else {
         return f_11537.player.onGround() ? new Vec3(var2.x, 0.0, var2.z) : var2;
      }
   }

   private boolean m_4555(Entity var1) {
      if (var1 == null || var1 == f_11537.player || !var1.isAlive() || var1.isSpectator()) {
         return false;
      } else {
         return var1 instanceof ThrownEnderpearl ? false : var1.canBeHitByProjectile();
      }
   }

   @Override
   public void m_732() {
      this.m_4552();
   }

   private boolean m_4556(ThrownEnderpearl var1, Vec3 var2) {
      Vec3 var3 = this.m_4551(var1);
      double var4 = var2.x - var3.x;
      double var6 = var2.z - var3.z;
      return Math.sqrt(var4 * var4 + var6 * var6) >= this.f_12542.m_8768().floatValue();
   }

   private float m_4557() {
      ModuleManager var1 = DimasikClient.m_9057().m_9049().m_2801();
      return var1.m_3543() != null ? var1.m_3543().m_9006() : f_12588;
   }

   private void m_4558(ThrownEnderpearl var1, Vec3 var2) {
      TargetPearl.qAnIbGFYe25vDW8m var3 = this.m_4565(this.m_4544(), this.m_4554(false), var2);
      TargetPearl.qAnIbGFYe25vDW8m var4 = this.f_12543.m_8768() && f_11537.player.onGround() ? this.m_4565(this.m_4544(), this.m_4554(true), var2) : null;
      TargetPearl.qAnIbGFYe25vDW8m var5 = this.m_4542(var3, var4);
      if (var5 == null) {
         var5 = this.m_4532(var2);
      }

      if (var5 != null) {
         if (this.f_12544.m_8768() && var5.f_12526 && var5.f_12524 > f_12583) {
            TargetPearl.qAnIbGFYe25vDW8m var6 = this.m_4565(this.m_4544(), this.m_4554(false), var2);
            if (var6 != null && !var6.f_12526) {
               var5 = var6;
            } else if (var5.f_12526) {
               return;
            }
         }

         if (var5.f_12525 && this.f_12543.m_8768() && f_11537.player.onGround()) {
            this.f_12548.add(var1.getId());
            this.f_12554 = var1.getId();
            this.f_12555 = var2;
            this.f_12552 = true;
            this.f_12556 = 0;
            this.m_4537();
            this.m_4539(true);
         } else {
            this.f_12548.add(var1.getId());
            this.m_4568(var2, var5.f_12522, var5.f_12523);
         }
      }
   }

   private TargetPearl.sI7UhN2Ccz4SgMIs m_4559(Vec3 var1, Vec3 var2, float var3, float var4, boolean var5) {
      float var6 = var3 * f_12632;
      float var7 = var4 * f_12633;
      Vec3 var8 = new Vec3(-Mth.sin(var6) * Mth.cos(var7), -Mth.sin(var7), Mth.cos(var6) * Mth.cos(var7)).normalize();
      Vec3 var9 = var1;
      Vec3 var10 = var8.scale(f_12634).add(var2);

      for (int var11 = 0; var11 < 320; var11++) {
         Vec3 var12 = var9;
         var9 = var9.add(var10);
         if (var5) {
            Vec3 var13 = this.m_4535(var12, var9);
            if (var13 != null) {
               return new TargetPearl.sI7UhN2Ccz4SgMIs(var13, true);
            }
         }

         BlockHitResult var16 = f_11537.level.clip(new ClipContext(var12.add(0.0, f_12635, 0.0), var9, Block.COLLIDER, Fluid.NONE, f_11537.player));
         if (var16.getType() != Type.MISS) {
            return new TargetPearl.sI7UhN2Ccz4SgMIs(var16.getLocation(), false);
         }

         double var14 = this.m_4549(var9) ? f_12636 : f_12637;
         var10 = var10.scale(var14).add(0.0, f_12638, 0.0);
      }

      return new TargetPearl.sI7UhN2Ccz4SgMIs(var9, false);
   }

   private boolean m_4560(LivingEntity var1) {
      int var2 = this.m_4546();
      if (var2 == -1) {
         return false;
      }

      Vec3 var3 = var1.position().add(0.0, var1.getBbHeight() * f_12589, 0.0);
      Vec3 var4 = f_11537.player.getEyePosition();
      Vec3 var5 = var3.subtract(var4);
      float var6 = (float)Math.toDegrees(Math.atan2(-var5.x, var5.z));
      float var7 = (float)(-Math.toDegrees(Math.atan2(var5.y, Math.sqrt(var5.x * var5.x + var5.z * var5.z))));
      var7 = Mth.clamp(var7, f_12590, f_12591);
      float var8 = f_11537.player.getYRot();
      float var9 = f_11537.player.getXRot();
      Class_FghX3TD0v55wW2U2 var10 = DimasikClient.m_9057().m_9052().m_6342();
      this.m_4539(true);
      f_11537.player.setYRot(var6);
      f_11537.player.setXRot(var7);
      Class_3LQSDrJ0WJYOQ7ck.m_1293(
         new PosRot(
            f_11537.player.getX(), f_11537.player.getY(), f_11537.player.getZ(), var6, var7, f_11537.player.onGround(), f_11537.player.horizontalCollision
         )
      );
      boolean var11 = this.m_4533(var2);
      f_11537.player.setYRot(var8);
      f_11537.player.setXRot(var9);
      var10.m_2654().set(var8, var9);
      this.m_4539(false);
      return var11;
   }

   private LivingEntity m_4561() {
      LivingEntity var1 = this.m_4563();
      if (var1 != null && var1.isAlive()) {
         return var1;
      }

      if (this.f_12550 == null) {
         return null;
      }

      long var2 = Math.round(this.f_12541.m_8768() * f_12651);
      if (System.currentTimeMillis() - this.f_12551 > var2) {
         this.f_12550 = null;
         return null;
      }

      for (Player var5 : f_11537.level.players()) {
         if (var5.getUUID().equals(this.f_12550) && var5.isAlive() && !var5.isSpectator()) {
            return var5;
         }
      }

      return this.m_4540(this.f_12550) instanceof LivingEntity var7 && var7.isAlive() && !var7.isSpectator() ? var7 : null;
   }

   private void m_4562(Vec3 var1) {
      if (Class_i7qN6fWCX6JrM0uQ.m_7233().m_7235()) {
         if (this.m_4546() != -1) {
            LivingEntity var2 = this.m_4561();
            this.f_12557 = true;
            this.f_12558 = var1;
            this.f_12559 = var2 != null ? var2.getUUID() : this.f_12550;
            this.f_12560 = System.currentTimeMillis() + f_12585;
         }
      }
   }

   private LivingEntity m_4563() {
      Aura var1 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
      return var1 != null && var1.m_776() ? var1.m_1114() : null;
   }

   private TargetPearl.qAnIbGFYe25vDW8m m_4565(Vec3 var1, Vec3 var2, Vec3 var3) {
      double var4 = var3.x - var1.x;
      double var6 = var3.z - var1.z;
      float var8 = (float)Math.toDegrees(Math.atan2(-var4, var6));
      TargetPearl.qAnIbGFYe25vDW8m var9 = null;

      for (float var10 = f_12609; var10 <= f_12610; var10++) {
         TargetPearl.qAnIbGFYe25vDW8m var11 = this.m_4536(var1, var2, var3, var8, var10);
         if (var11 != null && (!this.f_12544.m_8768() || !var11.f_12526) && (var9 == null || var11.f_12524 < var9.f_12524)) {
            var9 = var11;
         }
      }

      if (var9 == null) {
         for (float var15 = f_12611; var15 <= f_12612; var15++) {
            TargetPearl.qAnIbGFYe25vDW8m var17 = this.m_4536(var1, var2, var3, var8, var15);
            if (var17 != null && (var9 == null || var17.f_12524 < var9.f_12524)) {
               var9 = var17;
            }
         }
      }

      if (var9 == null) {
         return null;
      }

      float var16 = Mth.clamp(var9.f_12523 - 1.0F, f_12613, f_12614);
      float var18 = Mth.clamp(var9.f_12523 + 1.0F, f_12615, f_12616);

      for (float var12 = var16; var12 <= var18; var12 += f_12620) {
         for (float var13 = f_12617; var13 <= f_12618; var13 += f_12619) {
            TargetPearl.qAnIbGFYe25vDW8m var14 = this.m_4536(var1, var2, var3, var8 + var13, var12);
            if (var14 != null && (!this.f_12544.m_8768() || !var14.f_12526) && (var9 == null || var14.f_12524 < var9.f_12524)) {
               var9 = var14;
            }
         }
      }

      if (var9 == null) {
         return null;
      } else if (var9.f_12524 > f_12621) {
         return var9.f_12524 < f_12622 ? var9 : null;
      } else {
         return var9;
      }
   }

   private void m_4566() {
      if (this.f_12553) {
         f_11537.options.keyJump.setDown(false);
         this.f_12553 = false;
      }
   }

   private void m_4567(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null) {
         this.m_4545();
         this.f_12548.removeIf(var0 -> !(f_11537.level.getEntity(var0) instanceof ThrownEnderpearl));
         this.f_12549.removeIf(var1x -> this.f_12548.contains(var1x));
         if (this.f_12552) {
            this.m_4528();
         } else {
            this.m_4550();
            this.m_4534();
         }
      } else {
         this.m_4552();
      }
   }

   private void m_4568(Vec3 var1, float var2, float var3) {
      this.m_4539(true);
      float var4 = f_11537.player.getYRot();
      float var5 = f_11537.player.getXRot();
      Class_FghX3TD0v55wW2U2 var6 = DimasikClient.m_9057().m_9052().m_6342();
      f_11537.player.setYRot(var2);
      f_11537.player.setXRot(var3);
      Class_3LQSDrJ0WJYOQ7ck.m_1293(
         new PosRot(
            f_11537.player.getX(), f_11537.player.getY(), f_11537.player.getZ(), var2, var3, f_11537.player.onGround(), f_11537.player.horizontalCollision
         )
      );
      boolean var7 = this.m_4569();
      f_11537.player.setYRot(var4);
      f_11537.player.setXRot(var5);
      var6.m_2654().set(var4, var5);
      this.m_4539(false);
      this.m_4566();
      if (var7 && this.f_12546.m_8768()) {
         this.m_4562(var1);
      }
   }

   private boolean m_4569() {
      int var1 = Class_B6vpBUNmRtH3JzmV.m_2128(Items.ENDER_PEARL);
      if (var1 == -1) {
         return false;
      }

      if (DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5152().m_7568(f_12584) && !Class_B6vpBUNmRtH3JzmV.m_2126(var1)) {
      }

      if (Class_B6vpBUNmRtH3JzmV.m_2126(var1)) {
         int var3 = f_11537.player.getInventory().selected;
         Class_B6vpBUNmRtH3JzmV.m_2131(Class_B6vpBUNmRtH3JzmV.m_2127(var1));
         f_11537.gameMode.useItem(f_11537.player, InteractionHand.MAIN_HAND);
         Class_B6vpBUNmRtH3JzmV.m_2131(var3);
         return true;
      } else {
         int var2 = f_11537.player.getInventory().selected;
         Class_B6vpBUNmRtH3JzmV.m_2129(8, var1);
         Class_B6vpBUNmRtH3JzmV.m_2131(8);
         f_11537.gameMode.useItem(f_11537.player, InteractionHand.MAIN_HAND);
         Class_B6vpBUNmRtH3JzmV.m_2131(var2);
         Class_B6vpBUNmRtH3JzmV.m_2129(8, var1);
         return true;
      }
   }

   private static final class qAnIbGFYe25vDW8m {
      public final float f_12522;
      public final float f_12523;
      public final double f_12524;
      public final boolean f_12525;
      public final boolean f_12526;

      public qAnIbGFYe25vDW8m(float var1, float var2, double var3, boolean var5, boolean var6) {
         this.f_12522 = var1;
         this.f_12523 = var2;
         this.f_12524 = var3;
         this.f_12525 = var5;
         this.f_12526 = var6;
      }

      public TargetPearl.qAnIbGFYe25vDW8m m_4525(boolean var1) {
         return new TargetPearl.qAnIbGFYe25vDW8m(this.f_12522, this.f_12523, this.f_12524, var1, this.f_12526);
      }
   }

   private static final class sI7UhN2Ccz4SgMIs {
      public final Vec3 f_12527;
      public final boolean f_12528;

      public sI7UhN2Ccz4SgMIs(Vec3 var1, boolean var2) {
         this.f_12527 = var1;
         this.f_12528 = var2;
      }
   }
}
