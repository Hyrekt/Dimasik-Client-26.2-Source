package dev.dimasik.client.module.combat;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.manager.ClientManagerRegistry;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.system.Class_0s5WQhNSSkdI2aVQ;
import dev.dimasik.client.system.Class_6Ip9yVjlyDc0jiat;
import dev.dimasik.client.system.Class_BYfjHaSHGXpfcI6Q;
import dev.dimasik.client.system.Class_FyutImIC8oFoGKuH;
import dev.dimasik.client.system.Class_TT9n584oSK6xnBdz;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_fxhpRYkQvkLGygap;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_hDYugYZW8b426Ynk;
import dev.dimasik.client.system.Class_izMBLqd5r0wrVpYz;
import dev.dimasik.client.system.Class_jfpiTZhNIuwDwqKr;
import dev.dimasik.client.system.Class_kkp256olqZ4F1qt3;
import dev.dimasik.client.system.Class_qT3a68ZR9cAz3wbe;
import dev.dimasik.client.system.Class_uHPXr81r5AZlFeJr;
import dev.dimasik.mixin.FireworkRocketEntityMixin_2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult.Success;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.FireworkRocketEntity;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector2f;

public class AutoWebTrap extends Module {
   private static final double f_30502 = 4.5;
   private static final int f_30503 = 20;
   private static final double f_30504 = 0.25;
   private final CheckboxSetting f_30505;
   private final AutoWebTrap.MbapvgJn7ErEQCiM f_30506;
   private final Class_0s5WQhNSSkdI2aVQ f_30507;
   private final Class_fxhpRYkQvkLGygap f_30508;
   private final Class_hDYugYZW8b426Ynk f_30509;
   private final Map<BlockPos, Integer> f_30510;
   private final Map<BlockPos, Integer> f_30511;
   private final List<BlockPos> f_30512;
   private ClientLevel f_30513;
   private Player f_30514;
   private Class_BYfjHaSHGXpfcI6Q f_30515;
   private BlockPos f_30516;
   private int f_30517;
   private int f_30518;
   private int f_30519;
   private double f_30520;
   private Vec3 f_30521;
   private final Map<BlockPos, Integer> f_30522;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_30523;
   private final Class_gEPk7yDw6CwIte87<Class_jfpiTZhNIuwDwqKr> f_30524;
   private final Class_gEPk7yDw6CwIte87<Class_jfpiTZhNIuwDwqKr.Class_13dQBetjQQOBNsco> f_30525;
   private static final String f_30526 = "AutoWebTrap";
   private static final String f_30527 = "Ловит цель в паутину и передаёт её CrystalAura";
   private static final String f_30528 = "Обход Matrix";
   private static final double f_30529 = 2.0;
   private static final double f_30530 = 4.5;
   private static final double f_30531 = 4.0;
   private static final double f_30532 = 0.91F;
   private static final double f_30533 = 0.98F;
   private static final double f_30534 = 3.0;
   private static final double f_30535 = 0.25;
   private static final double f_30536 = 3.0;
   private static final double f_30537 = Double.MAX_VALUE;
   private static final double f_30538 = 3.0;
   private static final double f_30539 = 0.25;
   private static final double f_30540 = 0.75;
   private static final double f_30541 = 2.0;
   private static final double f_30542 = 0.5;
   private static final double f_30543 = 0.02;
   private static final double f_30544 = 1.0E-10;
   private static final double f_30545 = 4.5;
   private static final double f_30546 = 4.5;
   private static final double f_30547 = 0.5;
   private static final double f_30548 = 0.15;
   private static final double f_30549 = 0.05;
   private static final double f_30550 = 4.5;
   private static final double f_30551 = 4.5;
   private static final double f_30552 = 256.0;
   private static final double f_30553 = Double.MAX_VALUE;
   private static final double f_30554 = 64.0;
   private static final double f_30555 = 2.0;
   private static final double f_30556 = 4.5;

   @Override
   public void m_778() {
      this.m_8612();
   }

   private Class_hDYugYZW8b426Ynk.dS9M4r6823hmtWBk m_8597() {
      Vec3 var1 = m_8606(this.f_30514);
      Class_qT3a68ZR9cAz3wbe.GHJVGUMVTdUYTniZ var2 = this.f_30509.m_7132(this.f_30514.getId(), f_11537.player.tickCount, var1, this.f_30514.getKnownMovement());
      this.f_30521 = var1;
      MobEffectInstance var3 = this.f_30514.getEffect(MobEffects.LEVITATION);
      boolean var4 = this.f_30514.isFallFlying()
         && f_11537.level
            .getEntitiesOfClass(FireworkRocketEntity.class, this.f_30514.getBoundingBox().inflate(f_30531), Entity::isAlive)
            .stream()
            .anyMatch(var1x -> ((FireworkRocketEntityMixin_2)var1x).dimasik$getAttachedEntity() == this.f_30514);
      Class_FyutImIC8oFoGKuH.at09eCJZBjEw7bSk var5 = new Class_FyutImIC8oFoGKuH.at09eCJZBjEw7bSk(
         this.f_30514.onGround(),
         this.f_30514.isFallFlying(),
         this.f_30514.getAbilities().flying,
         this.f_30514.isInWater() || this.f_30514.isInLava(),
         this.f_30514.onClimbable(),
         this.f_30514.hasEffect(MobEffects.SLOW_FALLING),
         var3 == null ? -1 : var3.getAmplifier(),
         var4,
         this.f_30514.isNoGravity() ? 0.0 : this.f_30514.getGravity(),
         f_30532,
         f_30533,
         this.f_30514.maxUpStep(),
         this.f_30514.getInterpolation().yRot(),
         this.f_30514.getInterpolation().xRot()
      );
      return Class_hDYugYZW8b426Ynk.m_7134(
         m_8608(this.f_30514),
         var2,
         var5,
         this.f_30520,
         this.f_30505.m_8768(),
         (var1x, var2x) -> Entity.collideBoundingBox(this.f_30514, var2x, var1x, f_11537.level, List.of()),
         var1x -> Class_6Ip9yVjlyDc0jiat.m_1540(var1x, this::m_8618)
      );
   }

   private void m_8598() {
      this.f_30518 = -1;
      this.f_30507.m_811();
      this.f_30515 = null;
      this.f_30516 = null;
      DimasikClient.m_9057().m_9049().m_2813().m_5164(this.f_30506);
      DimasikClient.m_9057().m_9052().m_6342().m_2662(this.f_30506);
   }

   private int m_8599() {
      if (f_11537.player == null) {
         return -1;
      }

      for (int var1 = 0; var1 < 9; var1++) {
         if (f_11537.player.getInventory().getItem(var1).is(Items.COBWEB)) {
            return var1;
         }
      }

      return -1;
   }

   private List<BlockPos> m_8601(Class_hDYugYZW8b426Ynk.dS9M4r6823hmtWBk var1, int var2) {
      double var3 = var1.readyAt(1);
      double var5 = var1.readyAt(var2) + f_30536;
      ArrayList var7 = new ArrayList();

      for (BlockPos var9 : Class_6Ip9yVjlyDc0jiat.m_1537(var1.boxes(), var3, var5)) {
         if (this.m_8611(var9)) {
            Class_6Ip9yVjlyDc0jiat.Hrog8pZIHRFGqVca var10 = Class_6Ip9yVjlyDc0jiat.m_1535(var1.boxes(), var9, var3, var5);
            if (var10 != null) {
               var7.add(new AutoWebTrap.hJ5IcrJG7PyUvMh1(var9, var10.enter()));
            }
         }
      }

      var7.sort(Comparator.comparingDouble(AutoWebTrap.hJ5IcrJG7PyUvMh1::arrival));
      HashMap var21 = new HashMap();
      List var22 = List.of();
      double var23 = f_30537;
      int var12 = 0;

      for (AutoWebTrap.hJ5IcrJG7PyUvMh1 var14 : (Iterable<AutoWebTrap.hJ5IcrJG7PyUvMh1>) (Iterable) var7) {
         if (var12++ >= 24) {
            break;
         }

         List var15 = Class_6Ip9yVjlyDc0jiat.m_1539(var14.position(), var2, this::m_8611, var1x -> {
            if (!var21.containsKey(var1x)) {
               var21.put(var1x, Class_TT9n584oSK6xnBdz.m_4991(var1x, f_11537.player.getEyePosition(), f_30556, true));
            }

            return var21.get(var1x) != null;
         });
         if (!var15.isEmpty()) {
            double var16 = var1.readyAt(var15.size());
            Class_6Ip9yVjlyDc0jiat.Hrog8pZIHRFGqVca var18 = Class_6Ip9yVjlyDc0jiat.m_1535(var1.boxes(), var14.position(), var16, var16 + f_30538);
            if (var18 != null && !(var18.exit() - var18.enter() < f_30539)) {
               double var19 = var18.enter()
                  - var3
                  + (var15.size() - 1) * f_30540
                  - Math.min(f_30541, var18.exit() - var18.enter()) * f_30542
                  + f_11537.player.getEyePosition().distanceToSqr(Vec3.atCenterOf((Vec3i)var15.getFirst())) * f_30543;
               if (var19 < var23) {
                  var23 = var19;
                  var22 = var15;
               }
            }
         }
      }

      return var22;
   }

   private boolean m_8602(Player var1) {
      return Class_6Ip9yVjlyDc0jiat.m_1534(m_8608(var1), this::m_8618);
   }

   private boolean m_8604(Class_hDYugYZW8b426Ynk.dS9M4r6823hmtWBk var1) {
      int var2 = this.f_30512.size();
      double var3 = 0.0;
      Integer var5 = this.f_30522.get(this.f_30512.getFirst());
      if (var5 != null) {
         var2--;
         var3 = Math.max(0.0, this.f_30520 - (f_11537.player.tickCount - var5)) + 1.0;
      }

      double var6 = var1.readyAt(var2) + var3;
      Class_6Ip9yVjlyDc0jiat.Hrog8pZIHRFGqVca var8 = Class_6Ip9yVjlyDc0jiat.m_1535(var1.boxes(), this.f_30512.getLast(), var6, var6 + f_30534);
      return var8 != null && var8.exit() - var8.enter() >= f_30535;
   }

   private static Vec3 m_8606(Player var0) {
      Vec3 var1 = var0.getPositionCodec().getBase();
      return Double.isFinite(var1.lengthSqr()) && var1.distanceToSqr(var0.position()) <= f_30552 ? var1 : var0.position();
   }

   private boolean m_8607(Player var1) {
      return Class_6Ip9yVjlyDc0jiat.m_1540(m_8608(var1), this::m_8618);
   }

   private static AABB m_8608(Player var0) {
      return Class_hDYugYZW8b426Ynk.m_7133(var0.getBoundingBox(), var0.position(), m_8606(var0));
   }

   private void m_8609() {
      if (this.f_30513 != f_11537.level || f_11537.player != null && f_11537.player.tickCount < this.f_30519) {
         this.m_8612();
         this.f_30513 = f_11537.level;
      }

      if (f_11537.player != null && f_11537.level != null && f_11537.gameMode != null && !f_11537.player.isSpectator()) {
         this.f_30519 = f_11537.player.tickCount;
         if (!DimasikClient.m_9057().m_9049().m_2801().m_3527().m_8895()) {
            int var1 = this.m_8599();
            if (!this.m_8616(this.f_30514)) {
               this.m_8612();
               this.f_30513 = f_11537.level;
               if (var1 >= 0) {
                  this.f_30514 = this.m_8621();
               }
            }

            if (this.f_30514 != null) {
               this.f_30510.values().removeIf(var0 -> var0 <= f_11537.player.tickCount);
               this.m_8610();
               boolean var2 = this.m_8602(this.f_30514);
               this.f_30508.m_6751(this.f_30514.getUUID(), f_11537.player.tickCount, var2, this.m_8607(this.f_30514));
               if (var2 || this.f_30508.m_6752(this.f_30514.getUUID()) || var1 < 0) {
                  this.f_30512.clear();
                  this.m_8598();
               } else if (this.f_30522.size() >= 6) {
                  this.m_8598();
               } else if (f_11537.player.isUsingItem()) {
                  this.f_30512.clear();
                  this.m_8598();
               } else {
                  Class_hDYugYZW8b426Ynk.dS9M4r6823hmtWBk var3 = this.m_8597();

                  while (!this.f_30512.isEmpty() && this.m_8618(this.f_30512.getFirst())) {
                     this.f_30512.removeFirst();
                  }

                  if (this.f_30512.size() == 1 && this.f_30522.containsKey(this.f_30512.getFirst())) {
                     this.f_30512.clear();
                  }

                  if (!this.f_30512.isEmpty() && !this.m_8604(var3)) {
                     this.f_30512.clear();
                  }

                  if (!this.f_30512.isEmpty() && Class_TT9n584oSK6xnBdz.m_4995(this.f_30512.getFirst())) {
                     List var4 = this.m_8601(var3, 1);
                     if (var4.isEmpty()) {
                        this.m_8598();
                        return;
                     }

                     this.f_30512.clear();
                     this.f_30512.addAll(var4);
                  }

                  if (this.f_30512.isEmpty()) {
                     this.f_30512.addAll(this.m_8601(var3, 3));
                  }

                  if (this.f_30512.isEmpty()) {
                     this.m_8598();
                  } else {
                     BlockPos var5 = this.f_30512.getFirst();
                     if (!var5.equals(this.f_30516)) {
                        this.f_30516 = var5;
                        this.f_30517 = f_11537.player.tickCount;
                     } else if (f_11537.player.tickCount - this.f_30517 > 20) {
                        this.m_8617(var5);
                        this.m_8598();
                        return;
                     }

                     if (!this.m_8611(var5)) {
                        this.f_30512.clear();
                        this.m_8598();
                     } else {
                        this.f_30515 = Class_TT9n584oSK6xnBdz.m_4991(var5, f_11537.player.getEyePosition(), f_30530, true);
                        if (this.f_30515 == null) {
                           this.f_30512.clear();
                           this.m_8598();
                        } else {
                           this.f_30506.m_7466(this.f_30515.hitVec());
                           if (!DimasikClient.m_9057().m_9049().m_2813().m_5177(this.f_30506, 2, 35)) {
                              this.m_8598();
                           } else {
                              this.f_30507.m_812(var1, this.f_30505.m_8768());
                           }
                        }
                     }
                  }
               }
            }
         }
      } else {
         this.m_8612();
      }
   }

   private void m_8610() {
      Iterator var1 = this.f_30522.entrySet().iterator();

      while (var1.hasNext()) {
         Entry var2 = (Entry)var1.next();
         BlockPos var3 = (BlockPos)var2.getKey();
         if (this.m_8618(var3)) {
            double var6 = Math.clamp(f_11537.player.tickCount - (Integer)var2.getValue(), 1, 8);
            this.f_30520 = this.f_30520 + (var6 - this.f_30520) * (var6 > this.f_30520 ? f_30547 : f_30548);
            this.f_30511.remove(var3);
            var1.remove();
         } else {
            int var4 = f_11537.player.tickCount - (Integer)var2.getValue();
            if (var4 > 20 || var4 >= 2 && !Class_TT9n584oSK6xnBdz.m_4995(var3)) {
               this.m_8617(var3);
               var1.remove();
            }
         }
      }
   }

   private boolean m_8611(BlockPos var1) {
      return f_11537.level != null
         && f_11537.player != null
         && !this.f_30510.containsKey(var1)
         && !this.f_30522.containsKey(var1)
         && f_11537.level.getBlockState(var1).canBeReplaced()
         && !f_11537.player.getBoundingBox().inflate(f_30549).intersects(new AABB(var1))
         && Class_izMBLqd5r0wrVpYz.m_7340(f_11537.player.getEyePosition(), var1)
            <= Class_TT9n584oSK6xnBdz.m_4989(f_30550) * Class_TT9n584oSK6xnBdz.m_4989(f_30551);
   }

   private void m_8612() {
      this.m_8598();
      this.f_30514 = null;
      this.f_30522.clear();
      this.f_30509.m_7130();
      this.f_30521 = null;
      this.f_30520 = f_30555;
      this.f_30508.m_6748();
      this.f_30512.clear();
      this.f_30510.clear();
      this.f_30511.clear();
   }

   public boolean m_8613() {
      return this.m_776()
         && this.m_8616(this.f_30514)
         && this.m_8614() == null
         && (this.f_30515 != null || !this.f_30522.isEmpty() || this.f_30508.m_6749(this.f_30514.getUUID()));
   }

   public Player m_8614() {
      return this.m_776() && this.m_8616(this.f_30514) && this.f_30508.m_6752(this.f_30514.getUUID()) && this.m_8607(this.f_30514) ? this.f_30514 : null;
   }

   @Override
   public void m_732() {
      this.m_8612();
   }

   private void m_8615(Class_jfpiTZhNIuwDwqKr var1) {
      this.f_30518 = -1;
      if (!DimasikClient.m_9057().m_9049().m_2801().m_3527().m_8895()) {
         if (this.f_30515 != null && !this.f_30512.isEmpty() && this.m_8616(this.f_30514) && !f_11537.player.isUsingItem()) {
            if (!var1.m_1581() && DimasikClient.m_9057().m_9049().m_2813().m_5180() == this.f_30506) {
               if (this.m_8599() < 0) {
                  this.m_8612();
               } else if ((this.f_30521 == null || m_8606(this.f_30514).distanceToSqr(this.f_30521) > f_30544) && !this.m_8604(this.m_8597())) {
                  this.f_30512.clear();
                  this.m_8598();
               } else {
                  Vec3 var2 = var1.m_7399().add(0.0, f_11537.player.getEyeHeight(), 0.0);
                  Class_BYfjHaSHGXpfcI6Q var3 = Class_TT9n584oSK6xnBdz.m_4991(this.f_30512.getFirst(), var2, f_30545, true);
                  if (var3 == null) {
                     this.f_30512.clear();
                     this.m_8598();
                  } else {
                     this.f_30515 = var3;
                     this.f_30506.m_7466(var3.hitVec());
                     this.f_30518 = f_11537.player.tickCount;
                  }
               }
            }
         }
      }
   }

   private boolean m_8616(Player var1) {
      if (f_11537.player != null
         && f_11537.level != null
         && var1 != null
         && var1 != f_11537.player
         && var1.level() == f_11537.level
         && var1.isAlive()
         && !var1.isRemoved()
         && !var1.isSpectator()
         && !var1.isCreative()
         && var1.tickCount >= 3
         && !(Class_izMBLqd5r0wrVpYz.m_7339(f_11537.player.getEyePosition(), var1.getBoundingBox()) > f_30554)) {
         ClientManagerRegistry var2 = DimasikClient.m_9057().m_9049();
         return !var2.m_2804().m_2877(var1.getGameProfile().name()) && !var2.m_2801().m_3581().f_33163.contains(var1);
      } else {
         return false;
      }
   }

   private void m_8617(BlockPos var1) {
      int var2 = this.f_30511.merge(var1.immutable(), 1, Integer::sum);
      this.f_30510.put(var1.immutable(), f_11537.player.tickCount + (var2 >= 3 ? 40 : 6));
      this.f_30512.clear();
   }

   private boolean m_8618(BlockPos var1) {
      return f_11537.level != null && f_11537.level.getBlockState(var1).is(Blocks.COBWEB) && !Class_TT9n584oSK6xnBdz.m_4995(var1);
   }

   public AutoWebTrap() {
      super(f_30526, f_30527, Category.COMBAT);
      this.f_30505 = new CheckboxSetting(f_30528, false);
      this.f_30506 = new AutoWebTrap.MbapvgJn7ErEQCiM();
      this.f_30507 = new Class_0s5WQhNSSkdI2aVQ();
      this.f_30508 = new Class_fxhpRYkQvkLGygap();
      this.f_30509 = new Class_hDYugYZW8b426Ynk();
      this.f_30510 = new HashMap<>();
      this.f_30511 = new HashMap<>();
      this.f_30512 = new ArrayList<>();
      this.f_30518 = -1;
      this.f_30519 = -1;
      this.f_30520 = f_30529;
      this.f_30522 = new HashMap<>();
      this.f_30523 = new Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK>() {
         public void m_1781(Class_Xu9btcIeUN33XnMK var1) {
            AutoWebTrap.this.m_8609();
         }

         @Override
         public int m_1780() {
            return 50;
         }
      };
      this.f_30524 = new Class_gEPk7yDw6CwIte87<Class_jfpiTZhNIuwDwqKr>() {
         public void m_1781(Class_jfpiTZhNIuwDwqKr var1) {
            AutoWebTrap.this.m_8615(var1);
         }

         @Override
         public int m_1780() {
            return -100;
         }
      };
      this.f_30525 = this::m_8622;
      this.m_795(this.f_30505);
   }

   private Player m_8621() {
      Player var1 = null;
      double var2 = f_30553;

      for (Player var5 : f_11537.level.players()) {
         if (this.m_8616(var5)) {
            double var6 = f_11537.player.distanceToSqr(var5);
            if (var6 < var2) {
               var2 = var6;
               var1 = var5;
            }
         }
      }

      return var1;
   }

   private void m_8622(Class_jfpiTZhNIuwDwqKr.Class_13dQBetjQQOBNsco var1) {
      if (!DimasikClient.m_9057().m_9049().m_2801().m_3527().m_8895()) {
         if (this.f_30515 != null && !this.f_30512.isEmpty() && this.m_8616(this.f_30514) && f_11537.gameMode != null && !f_11537.player.isUsingItem()) {
            if (this.f_30518 == f_11537.player.tickCount && !var1.m_1581() && DimasikClient.m_9057().m_9049().m_2813().m_5180() == this.f_30506) {
               this.f_30518 = -1;
               BlockPos var2 = this.f_30512.getFirst();
               if (this.m_8611(var2)) {
                  int var3 = this.m_8599();
                  if (var3 < 0) {
                     this.m_8612();
                  } else if (this.f_30507.m_812(var3, this.f_30505.m_8768())) {
                     BlockHitResult var4 = Class_TT9n584oSK6xnBdz.m_4988(this.f_30515, f_30546, var1);
                     if (var4 != null) {
                        if (!Class_TT9n584oSK6xnBdz.m_4987(var2, var4, f_11537.player.getMainHandItem())) {
                           this.f_30512.clear();
                           this.m_8598();
                        } else {
                           try {
                              if (f_11537.gameMode.useItemOn(f_11537.player, InteractionHand.MAIN_HAND, var4) instanceof Success var6
                                 && var6.wasItemInteraction()
                                 && f_11537.level.getBlockState(var2).is(Blocks.COBWEB)) {
                                 this.f_30522.putIfAbsent(var2.immutable(), f_11537.player.tickCount);
                                 f_11537.player.swing(InteractionHand.MAIN_HAND);
                              } else {
                                 this.m_8617(var2);
                              }
                           } finally {
                              this.m_8598();
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private static final class MbapvgJn7ErEQCiM extends Class_kkp256olqZ4F1qt3 {
      public static final float f_30495 = 1.0E-6F;
      public static final float f_30496 = -180.0F;
      public static final float f_30497 = 180.0F;
      public static final float f_30498 = -90.0F;
      public static final float f_30499 = 90.0F;

      public MbapvgJn7ErEQCiM() {
         super(null);
         this.m_7470(true);
      }

      @Override
      public Vector2f m_1006(Vector2f var1, Vector2f var2) {
         float var3 = Mth.wrapDegrees(var2.x - var1.x);
         float var4 = var2.y - var1.y;
         float var5 = Class_uHPXr81r5AZlFeJr.m_9139();
         if (var5 > f_30495) {
            var3 = Math.round(var3 / var5) * var5;
            var4 = Math.round(var4 / var5) * var5;
         }

         return new Vector2f(var1.x + Mth.clamp(var3, f_30496, f_30497), Mth.clamp(var1.y + var4, f_30498, f_30499));
      }
   }

   private record hJ5IcrJG7PyUvMh1(BlockPos position, double arrival) {
   }
}
