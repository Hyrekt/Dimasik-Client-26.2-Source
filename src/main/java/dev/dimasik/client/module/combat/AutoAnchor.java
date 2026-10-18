package dev.dimasik.client.module.combat;

import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_81oIJPtsDGdzRKcL;
import dev.dimasik.client.system.Class_8eBbS8V7lQU0fpQj;
import dev.dimasik.client.system.Class_BYfjHaSHGXpfcI6Q;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_HC4FxlQBDqG2aUiU;
import dev.dimasik.client.system.Class_QmNR03reugBgWiPr;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_bhSc4OUnYWSe2vjL;
import dev.dimasik.client.system.Class_dJj2SGO1fl9bUExQ;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_izMBLqd5r0wrVpYz;
import dev.dimasik.client.system.Class_vHNpk6NDOYyuwWmv;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.protocol.game.ServerboundSetCarriedItemPacket;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RespawnAnchorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;

public class AutoAnchor extends Module {
   private static final int f_30223 = Class_BftdentXEtGbugJw.m_2310(255, 90, 40);
   private static final int f_30224 = 20;
   private final SliderSetting f_30225;
   private final SliderSetting f_30226;
   private final SliderSetting f_30227;
   private final SliderSetting f_30228;
   private final SliderSetting f_30229;
   private final SliderSetting f_30230;
   private final CheckboxSetting f_30231;
   private final CheckboxSetting f_30232;
   private final CheckboxSetting f_30233;
   private final CheckboxSetting f_30234;
   private final Class_QmNR03reugBgWiPr f_30235;
   private final Class_8eBbS8V7lQU0fpQj f_30236;
   private BlockPos f_30237;
   private int f_30238;
   private int f_30239;
   private int f_30240;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_30241;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_30242;
   private static final String f_30243 = "AutoAnchor";
   private static final String f_30244 = "Взрывает якорь возрождения рядом с целью";
   private static final String f_30245 = "Радиус цели";
   private static final float f_30246 = 8.0F;
   private static final float f_30247 = 4.0F;
   private static final float f_30248 = 12.0F;
   private static final float f_30249 = 0.5F;
   private static final String f_30250 = "Дальность установки";
   private static final float f_30251 = 4.5F;
   private static final float f_30252 = 3.0F;
   private static final float f_30253 = 6.0F;
   private static final float f_30254 = 0.1F;
   private static final String f_30255 = "Дальность взрыва";
   private static final float f_30256 = 6.0F;
   private static final float f_30257 = 10.0F;
   private static final float f_30258 = 0.1F;
   private static final String f_30259 = "Мин. урон врагу";
   private static final float f_30260 = 6.0F;
   private static final float f_30261 = 20.0F;
   private static final float f_30262 = 0.5F;
   private static final String f_30263 = "Макс. урон себе";
   private static final float f_30264 = 8.0F;
   private static final float f_30265 = 20.0F;
   private static final float f_30266 = 0.5F;
   private static final String f_30267 = "Задержка";
   private static final float f_30268 = 500.0F;
   private static final float f_30269 = 10.0F;
   private static final String f_30270 = "Ставить обсидиан";
   private static final String f_30271 = "Анти-суицид";
   private static final String f_30272 = "Рендер позиции";
   private static final String f_30273 = "Логи";
   private static final float f_30274 = Float.MAX_VALUE;
   private static final float f_30275 = 8.0F;
   private static final double f_30276 = 0.5;
   private static final double f_30277 = 0.5;
   private static final double f_30278 = 0.5;
   private static final double f_30279 = Double.MAX_VALUE;
   private static final double f_30280 = 0.001;
   private static final double f_30281 = 0.001;
   private static final double f_30282 = 0.001;
   private static final double f_30283 = 0.001;
   private static final double f_30284 = 0.001;
   private static final double f_30285 = 0.001;
   private static final double f_30286 = 1.0E-7;
   private static final double f_30287 = 1.0E-4;

   private void m_8430(String var1) {
      if (this.f_30234.m_8768()) {
         System.out.println(var1 + "");
      }
   }

   private BlockHitResult m_8431(BlockPos var1, double var2) {
      if (f_11537.level == null) {
         return null;
      }

      BlockHitResult var4 = null;
      double var5 = f_30279;
      Vec3 var7 = f_11537.player.getEyePosition();

      for (Direction var11 : Direction.values()) {
         BlockPos var12 = var1.relative(var11);
         BlockState var13 = f_11537.level.getBlockState(var12);
         if (var13.isAir() || var13.canBeReplaced()) {
            BlockHitResult var14 = this.m_8437(var1, var11, var2);
            if (var14 != null) {
               double var15 = Math.min(Math.max(var14.getLocation().x, var1.getX() + f_30280), var1.getX() + 1.0 - f_30281);
               double var17 = Math.min(Math.max(var14.getLocation().y, var1.getY() + f_30282), var1.getY() + 1.0 - f_30283);
               double var19 = Math.min(Math.max(var14.getLocation().z, var1.getZ() + f_30284), var1.getZ() + 1.0 - f_30285);
               BlockHitResult var21 = new BlockHitResult(new Vec3(var15, var17, var19), var14.getDirection(), var14.getBlockPos(), false);
               double var22 = var7.distanceToSqr(var21.getLocation());
               if (var22 < var5) {
                  var5 = var22;
                  var4 = var21;
               }
            }
         }
      }

      return var4;
   }

   private List<Player> m_8432(float var1) {
      ArrayList<Player> var2 = new ArrayList<>();
      if (f_11537.level != null && f_11537.player != null) {
         Class_HC4FxlQBDqG2aUiU var3 = DimasikClient.m_9057().m_9049().m_2804();

         for (Player var5 : f_11537.level.players()) {
            if (var5 != f_11537.player
               && var5.isAlive()
               && !var5.isSpectator()
               && !(Class_izMBLqd5r0wrVpYz.m_7339(f_11537.player.getEyePosition(), var5.getBoundingBox()) > var1 * var1)
               && var3.m_2877(var5.getGameProfile().name())) {
               var2.add(var5);
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   private void m_8433(Class_TZhU50s8XmBQCMP5 var1) {
      if (this.f_30233.m_8768() && this.f_30237 != null && f_11537.level != null) {
         VertexConsumer var2 = var1.m_5008().m_881(Class_81oIJPtsDGdzRKcL.f_3816);
         AABB var3 = new AABB(
            this.f_30237.getX(), this.f_30237.getY(), this.f_30237.getZ(), this.f_30237.getX() + 1.0, this.f_30237.getY() + 1.0, this.f_30237.getZ() + 1.0
         );
         Class_bhSc4OUnYWSe2vjL.m_6088(var1.m_5006(), var2, var1.m_5010(), var3.minX, var3.minY, var3.minZ, var3.maxX, var3.maxY, var3.maxZ, f_30223, true);
      }
   }

   public AutoAnchor() {
      super(f_30243, f_30244, Category.COMBAT);
      this.f_30225 = new SliderSetting(f_30245, f_30246, f_30247, f_30248).m_828(f_30249);
      this.f_30226 = new SliderSetting(f_30250, f_30251, f_30252, f_30253).m_828(f_30254);
      this.f_30227 = new SliderSetting(f_30255, f_30256, 1.0F, f_30257).m_828(f_30258);
      this.f_30228 = new SliderSetting(f_30259, f_30260, 1.0F, f_30261).m_828(f_30262);
      this.f_30229 = new SliderSetting(f_30263, f_30264, 0.0F, f_30265).m_828(f_30266);
      this.f_30230 = new SliderSetting(f_30267, 0.0F, 0.0F, f_30268).m_828(f_30269).m_815(Class_dJj2SGO1fl9bUExQ.INTEGER);
      this.f_30231 = new CheckboxSetting(f_30270, true);
      this.f_30232 = new CheckboxSetting(f_30271, true);
      this.f_30233 = new CheckboxSetting(f_30272, true);
      this.f_30234 = new CheckboxSetting(f_30273, false);
      this.f_30235 = new Class_QmNR03reugBgWiPr();
      this.f_30236 = Class_8eBbS8V7lQU0fpQj.m_1803();
      this.f_30238 = -100;
      this.f_30240 = -1;
      this.f_30241 = this::m_8434;
      this.f_30242 = this::m_8433;
      this.m_795(this.f_30225, this.f_30226, this.f_30227, this.f_30228, this.f_30229, this.f_30230, this.f_30231, this.f_30232, this.f_30233, this.f_30234);
   }

   private void m_8434(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null && f_11537.gameMode != null && !f_11537.player.isSpectator()) {
         if (f_11537.level.dimension().identifier().equals(Level.NETHER.identifier())) {
            this.m_8444();
            this.m_8438();
         } else {
            List var2 = this.m_8447(this.f_30225.m_8768());
            if (var2.isEmpty()) {
               this.m_8444();
               this.m_8438();
            } else if (this.f_30235.m_4464(this.f_30230.m_8768().longValue())) {
               float var3 = this.f_30232.m_8768() ? Math.max(0.0F, f_11537.player.getHealth() + f_11537.player.getAbsorptionAmount() - 1.0F) : f_30274;
               if (this.f_30237 != null) {
                  BlockState var6 = f_11537.level.getBlockState(this.f_30237);
                  if (!(var6.getBlock() instanceof RespawnAnchorBlock)) {
                     if (f_11537.player.tickCount - this.f_30238 > 20) {
                        this.m_8444();
                     }
                  } else if (this.f_30239 == 1) {
                     if (this.m_8445(Items.GLOWSTONE) != -1 && !this.m_8435(this.f_30237)) {
                        this.f_30235.m_4459();
                     } else {
                        this.f_30239 = 2;
                        this.f_30235.m_4459();
                     }
                  } else if (this.f_30239 == 2) {
                     if (this.m_8441(this.f_30237)) {
                        this.m_8444();
                     }

                     this.f_30235.m_4459();
                  } else {
                     if (this.m_8441(this.f_30237)) {
                        this.m_8444();
                     }

                     this.f_30235.m_4459();
                  }
               } else if (this.m_8445(Items.RESPAWN_ANCHOR) == -1) {
                  this.m_8438();
               } else {
                  List var4 = this.m_8432(this.f_30225.m_8768() + f_30275);
                  Class_vHNpk6NDOYyuwWmv.fga36R7KxHrH3aap var5 = Class_vHNpk6NDOYyuwWmv.m_9256(
                     var2,
                     f_11537.player.getEyePosition(),
                     this.f_30226.m_8768(),
                     this.f_30227.m_8768(),
                     this.f_30229.m_8768(),
                     this.f_30228.m_8768(),
                     this.f_30231.m_8768(),
                     var3,
                     var4
                  );
                  if (var5 == null) {
                     this.m_8438();
                  } else if (var5.needsObsidian()) {
                     if (this.m_8445(Items.OBSIDIAN) == -1) {
                        this.m_8438();
                     } else {
                        if (this.m_8442(var5.base(), Items.OBSIDIAN)) {
                           this.f_30235.m_4459();
                        }
                     }
                  } else {
                     if (this.m_8436(var5.anchorPos())) {
                        this.f_30237 = var5.anchorPos().immutable();
                        this.f_30238 = f_11537.player.tickCount;
                        this.f_30239 = 1;
                        this.f_30235.m_4459();
                     }
                  }
               }
            }
         }
      } else {
         this.m_8444();
         this.m_8438();
      }
   }

   private boolean m_8435(BlockPos var1) {
      return this.m_8439(var1, Items.GLOWSTONE);
   }

   private boolean m_8436(BlockPos var1) {
      return this.m_8442(var1, Items.RESPAWN_ANCHOR);
   }

   private BlockHitResult m_8437(BlockPos var1, Direction var2, double var3) {
      if (f_11537.player != null && var1 != null && var2 != null && !(var3 <= 0.0)) {
         Vec3 var5 = f_11537.player.getEyePosition();
         Vec3 var6 = Vec3.directionFromRotation(f_11537.player.getXRot(), f_11537.player.getYRot());
         double var7;
         double var9;
         double var11;
         switch (var2.getAxis()) {
            case X:
               var7 = var1.getX() + (var2 == Direction.EAST ? 1.0 : 0.0);
               var9 = var5.x;
               var11 = var6.x;
               break;
            case Y:
               var7 = var1.getY() + (var2 == Direction.UP ? 1.0 : 0.0);
               var9 = var5.y;
               var11 = var6.y;
               break;
            case Z:
               var7 = var1.getZ() + (var2 == Direction.SOUTH ? 1.0 : 0.0);
               var9 = var5.z;
               var11 = var6.z;
               break;
            default:
               return null;
         }

         if (Math.abs(var11) < f_30286) {
            return null;
         }

         double var13 = (var7 - var9) / var11;
         if (!(var13 < 0.0) && !(var13 > var3)) {
            Vec3 var15 = var5.add(var6.scale(var13));
            double var16 = f_30287;

            boolean var18 = switch (var2.getAxis()) {
               case X -> var15.y >= var1.getY() - var16
                  && var15.y <= var1.getY() + 1.0 + var16
                  && var15.z >= var1.getZ() - var16
                  && var15.z <= var1.getZ() + 1.0 + var16;
               case Y -> var15.x >= var1.getX() - var16
                  && var15.x <= var1.getX() + 1.0 + var16
                  && var15.z >= var1.getZ() - var16
                  && var15.z <= var1.getZ() + 1.0 + var16;
               case Z -> var15.x >= var1.getX() - var16
                  && var15.x <= var1.getX() + 1.0 + var16
                  && var15.y >= var1.getY() - var16
                  && var15.y <= var1.getY() + 1.0 + var16;
               default -> throw new MatchException(null, null);
            };
            return !var18 ? null : new BlockHitResult(var15, var2, var1, false);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private void m_8438() {
      if (this.f_30240 != -1 && f_11537.player != null) {
         this.m_8443(this.f_30240);
      }

      this.f_30240 = -1;
   }

   private boolean m_8439(BlockPos var1, Item var2) {
      int var3 = this.m_8445(var2);
      if (var3 == -1) {
         return false;
      }

      Vec3 var4 = new Vec3(var1.getX() + f_30276, var1.getY() + f_30277, var1.getZ() + f_30278);
      if (!this.m_8446(var4)) {
         return false;
      }

      double var5 = f_11537.player.getEyePosition().distanceTo(var4) + 1.0;
      BlockHitResult var7 = this.m_8431(var1, var5);
      if (var7 == null) {
         return false;
      }

      this.m_8443(var3);
      InteractionResult var8 = f_11537.gameMode.useItemOn(f_11537.player, InteractionHand.MAIN_HAND, var7);
      boolean var9 = var8 != null && var8.consumesAction();
      if (var9) {
         f_11537.player.swing(InteractionHand.MAIN_HAND);
      }

      return var9;
   }

   private boolean m_8441(BlockPos var1) {
      int var2 = f_11537.player.getInventory().getSelectedSlot();
      Item var3 = f_11537.player.getInventory().getItem(var2).getItem();
      int var4;
      if (var3 != Items.GLOWSTONE && var3 != Items.RESPAWN_ANCHOR) {
         var4 = var2;
      } else {
         var4 = -1;

         for (int var5 = 0; var5 < 9; var5++) {
            Item var6 = f_11537.player.getInventory().getItem(var5).getItem();
            if (var6 != Items.GLOWSTONE && var6 != Items.RESPAWN_ANCHOR) {
               var4 = var5;
               break;
            }
         }

         if (var4 == -1) {
            for (int var7 = 0; var7 < 9; var7++) {
               if (!f_11537.player.getInventory().getItem(var7).is(Items.GLOWSTONE)) {
                  var4 = var7;
                  break;
               }
            }
         }
      }

      return var4 == -1 ? false : this.m_8439(var1, f_11537.player.getInventory().getItem(var4).getItem());
   }

   @Override
   public void m_732() {
      this.m_8448();
      this.m_8438();
      this.m_8444();
      super.m_732();
   }

   private boolean m_8442(BlockPos var1, Item var2) {
      Class_BYfjHaSHGXpfcI6Q var3 = Class_izMBLqd5r0wrVpYz.m_7349(var1, f_11537.player.getEyePosition(), this.f_30226.m_8768());
      if (var3 == null) {
         return false;
      }

      int var4 = this.m_8445(var2);
      if (var4 == -1) {
         return false;
      }

      if (!this.m_8446(var3.hitVec())) {
         return false;
      }

      double var5 = f_11537.player.getEyePosition().distanceTo(var3.hitVec()) + 1.0;
      BlockHitResult var7 = this.m_8437(var3.neighbor(), var3.side(), var5);
      if (var7 == null) {
         return false;
      }

      this.m_8443(var4);
      InteractionResult var8 = f_11537.gameMode.useItemOn(f_11537.player, InteractionHand.MAIN_HAND, var7);
      boolean var9 = var8 != null && var8.consumesAction();
      if (var9) {
         f_11537.player.swing(InteractionHand.MAIN_HAND);
      }

      return var9;
   }

   private void m_8443(int var1) {
      if (f_11537.player != null && var1 >= 0 && var1 <= 8) {
         if (f_11537.player.getInventory().getSelectedSlot() != var1) {
            if (this.f_30240 == -1) {
               this.f_30240 = f_11537.player.getInventory().getSelectedSlot();
            }

            f_11537.player.getInventory().setSelectedSlot(var1);
            f_11537.player.connection.send(new ServerboundSetCarriedItemPacket(var1));
         }
      }
   }

   private void m_8444() {
      this.f_30237 = null;
      this.f_30239 = 0;
      this.m_8438();
   }

   private int m_8445(Item var1) {
      if (f_11537.player == null) {
         return -1;
      }

      for (int var2 = 0; var2 < 9; var2++) {
         if (f_11537.player.getInventory().getItem(var2).is(var1)) {
            return var2;
         }
      }

      return -1;
   }

   private boolean m_8446(Vec3 var1) {
      return this.f_30236.m_1810(this, var1);
   }

   private List<Player> m_8447(float var1) {
      ArrayList<Player> var2 = new ArrayList<>();
      if (f_11537.level != null && f_11537.player != null) {
         AntiBot var3 = DimasikClient.m_9057().m_9049().m_2801().m_3581();
         Class_HC4FxlQBDqG2aUiU var4 = DimasikClient.m_9057().m_9049().m_2804();

         for (Player var6 : f_11537.level.players()) {
            if (var6 != f_11537.player
               && var6.isAlive()
               && !var6.isSpectator()
               && !(Class_izMBLqd5r0wrVpYz.m_7339(f_11537.player.getEyePosition(), var6.getBoundingBox()) > var1 * var1)
               && !var4.m_2877(var6.getGameProfile().name())
               && !var3.f_33163.contains(var6)) {
               var2.add(var6);
            }
         }

         var2.sort(Comparator.comparingDouble(var0 -> Class_izMBLqd5r0wrVpYz.m_7339(f_11537.player.getEyePosition(), var0.getBoundingBox())));
         return var2;
      } else {
         return var2;
      }
   }

   private void m_8448() {
      this.f_30236.m_1811(this);
   }
}
