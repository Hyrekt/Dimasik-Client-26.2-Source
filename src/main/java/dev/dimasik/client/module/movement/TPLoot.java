package dev.dimasik.client.module.movement;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_QmNR03reugBgWiPr;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import java.util.HashSet;
import java.util.Set;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket.Pos;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.status.ChunkStatus;
import net.minecraft.world.level.levelgen.Heightmap.Types;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class TPLoot extends Module {
   private static final Set<Item> f_28051 = Set.of(
      Items.TOTEM_OF_UNDYING,
      Items.CRYING_OBSIDIAN,
      Items.ENCHANTED_GOLDEN_APPLE,
      Items.GOLDEN_APPLE,
      Items.ELYTRA,
      Items.NAME_TAG,
      Items.NETHERITE_INGOT,
      Items.NETHERITE_CHESTPLATE,
      Items.NETHERITE_HELMET,
      Items.NETHERITE_BOOTS,
      Items.NETHERITE_LEGGINGS,
      Items.NETHERITE_SWORD,
      Items.PLAYER_HEAD
   );
   private static final double f_28052 = 65.0;
   private static final double f_28053 = 0.001;
   private static final double f_28054 = 0.25;
   private static final double f_28055 = 0.29;
   private static final double f_28056 = 1.8;
   private static final long f_28057 = 250000000L;
   private static final long f_28058 = 450000000L;
   private static final long f_28059 = 900000000L;
   private static final int f_28060 = 10;
   private static final int f_28061 = 10;
   private static final int f_28062 = 1;
   private static final int f_28063 = 1;
   private static final int f_28064 = 2;
   private static final int f_28065 = 8;
   private static final int f_28066 = 40;
   private static final int f_28067 = 100;
   private final MultiChoiceSetting f_28068;
   private final SliderSetting f_28069;
   private final SliderSetting f_28070;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_28071;
   private final Class_QmNR03reugBgWiPr f_28072;
   private final Set<Integer> f_28073;
   private TPLoot.Class_6KhbgTuOpznLMBnM f_28074;
   private Vec3 f_28075;
   private Vec3 f_28076;
   private boolean f_28077;
   private boolean f_28078;
   private int f_28079;
   private int f_28080;
   private int f_28081;
   private long f_28082;
   private long f_28083;
   private static final String f_28084 = "TPLoot";
   private static final String f_28085 = "Телепортируется к ценным предметам";
   private static final String f_28086 = "Возврат";
   private static final String f_28087 = "Назад";
   private static final String f_28088 = "/home";
   private static final String f_28089 = "Никуда";
   private static final String f_28090 = "Задержка /home";
   private static final float f_28091 = 100.0F;
   private static final float f_28092 = 50.0F;
   private static final float f_28093 = 200.0F;
   private static final float f_28094 = 10.0F;
   private static final String f_28095 = "Радиус";
   private static final float f_28096 = 100.0F;
   private static final float f_28097 = 10.0F;
   private static final float f_28098 = 150.0F;
   private static final float f_28099 = 5.0F;
   private static final String f_28100 = "Назад";
   private static final long f_28101 = 900000000L;
   private static final String f_28102 = "/home";
   private static final long f_28103 = 450000000L;
   private static final String f_28104 = "/home";
   private static final String f_28105 = "home home";
   private static final long f_28106 = 450000000L;
   private static final double f_28107 = -Double.MAX_VALUE;
   private static final double f_28108 = 10000.0;
   private static final double f_28109 = 0.5;
   private static final double f_28110 = 0.5;
   private static final double f_28111 = 65.0;
   private static final long f_28112 = 250000000L;
   private static final long f_28113 = 250000000L;
   private static final double f_28114 = 65.0;
   private static final double f_28115 = Double.MAX_VALUE;
   private static final double f_28116 = 0.5;
   private static final double f_28117 = 0.5;
   private static final double f_28118 = 0.5;
   private static final double f_28119 = 0.5;
   private static final double f_28120 = 0.001;
   private static final double f_28121 = 65.0;
   private static final double f_28122 = 0.001;
   private static final double f_28123 = Double.MAX_VALUE;
   private static final double f_28124 = 0.5;
   private static final double f_28125 = 0.5;
   private static final double f_28126 = 65.001;
   private static final double f_28127 = 0.25;
   private static final double f_28128 = 0.29;
   private static final double f_28129 = 0.29;
   private static final double f_28130 = 0.29;
   private static final double f_28131 = 1.8;
   private static final double f_28132 = 0.29;
   private static final double f_28133 = 0.16;
   private static final String f_28134 = "/home";

   @Override
   public void m_778() {
      this.m_8025();
   }

   private void m_8007() {
      if (this.f_28075 != null) {
         TPLoot.IIWsT0PHRxaK8g3N var1 = this.m_8023(this.f_28075, f_28106);
         if (var1 == TPLoot.IIWsT0PHRxaK8g3N.REACHED) {
            this.f_28075 = null;
            this.m_8029();
         } else if (var1 == TPLoot.IIWsT0PHRxaK8g3N.MOVED) {
            this.f_28081 = 0;
         } else {
            if (var1 == TPLoot.IIWsT0PHRxaK8g3N.BLOCKED && ++this.f_28081 >= 100) {
               this.f_28075 = null;
               this.m_8029();
            }
         }
      }
   }

   private boolean m_8008(TPLoot.Class_44wqj3cGxjrPztRG var1) {
      double var2 = f_11537.player.getX() - var1.x();
      double var4 = f_11537.player.getY() - var1.feetY();
      double var6 = f_11537.player.getZ() - var1.z();
      return var2 * var2 + var4 * var4 + var6 * var6 <= f_28133;
   }

   private void m_8009(ItemEntity var1) {
      this.f_28073.add(var1.getId());
      this.m_8035();
   }

   private TPLoot.Class_44wqj3cGxjrPztRG m_8010(double var1, double var3) {
      double var5 = f_11537.player.getX();
      double var7 = f_11537.player.getZ();
      double var9 = var1 - var5;
      double var11 = var3 - var7;
      double var13 = Math.hypot(var9, var11);
      if (var13 <= f_28120) {
         return null;
      }

      for (double var15 = Math.min(var13, f_28121); var15 > f_28122; var15 -= Math.min(1.0, var15)) {
         double var17 = var15 / var13;
         double var19 = var5 + var9 * var17;
         double var21 = var7 + var11 * var17;
         TPLoot.Class_44wqj3cGxjrPztRG var23 = this.m_8030(var5, var7, var19, var21, var1, var3);
         if (var23 != null) {
            return var23;
         }
      }

      return null;
   }

   private TPLoot.IIWsT0PHRxaK8g3N m_8011(ItemEntity var1) {
      double var2 = Math.floor(var1.getX()) + f_28109;
      double var4 = Math.floor(var1.getZ()) + f_28110;
      double var6 = this.m_8026(var2, var4);
      if (var6 > f_28111) {
         if (this.m_8033(f_28112)) {
            return TPLoot.IIWsT0PHRxaK8g3N.WAITING;
         }

         TPLoot.Class_44wqj3cGxjrPztRG var9 = this.m_8010(var2, var4);
         if (var9 == null) {
            return TPLoot.IIWsT0PHRxaK8g3N.BLOCKED;
         }

         this.m_8027(var9);
         return TPLoot.IIWsT0PHRxaK8g3N.MOVED;
      } else {
         TPLoot.Class_44wqj3cGxjrPztRG var8 = this.m_8022(var1.getX(), var1.getY(), var1.getZ());
         if (var8 == null) {
            return TPLoot.IIWsT0PHRxaK8g3N.BLOCKED;
         }

         if (this.m_8008(var8)) {
            return TPLoot.IIWsT0PHRxaK8g3N.REACHED;
         }

         if (this.m_8033(f_28113)) {
            return TPLoot.IIWsT0PHRxaK8g3N.WAITING;
         }

         this.m_8027(var8);
         return TPLoot.IIWsT0PHRxaK8g3N.MOVED;
      }
   }

   private void m_8012() {
      if (this.f_28076 == null) {
         this.m_8029();
      } else if (System.nanoTime() >= this.f_28083) {
         TPLoot.IIWsT0PHRxaK8g3N var1 = this.m_8023(this.f_28076, f_28103);
         if (var1 == TPLoot.IIWsT0PHRxaK8g3N.REACHED) {
            this.m_8029();
         } else if (var1 == TPLoot.IIWsT0PHRxaK8g3N.MOVED) {
            this.f_28081 = 0;
         } else {
            if (var1 == TPLoot.IIWsT0PHRxaK8g3N.BLOCKED && ++this.f_28081 >= 100) {
               this.m_8029();
            }
         }
      }
   }

   private void m_8013() {
      ItemEntity var1 = this.m_8019();
      if (var1 == null) {
         this.m_8035();
         if (this.f_28077) {
            this.m_8024();
         } else {
            this.f_28076 = null;
         }
      } else {
         if (this.f_28076 == null) {
            this.f_28076 = f_11537.player.position();
         }

         this.f_28077 = true;
         this.m_8036(var1);
         switch (this.m_8011(var1)) {
            case WAITING:
            default:
               break;
            case MOVED:
               this.f_28081 = 0;
               this.f_28080 = 0;
               break;
            case REACHED:
               this.f_28081 = 0;
               this.f_28080++;
               if (this.f_28080 >= 40) {
                  this.m_8009(var1);
               }
               break;
            case BLOCKED:
               this.f_28081++;
               this.f_28080 = 0;
               if (this.f_28081 >= 100) {
                  this.m_8009(var1);
               }
         }
      }
   }

   private void m_8014() {
      if (!this.f_28068.m_7568(f_28104)) {
         this.m_8024();
      } else if (this.f_28072.m_4463(this.f_28069.m_8768().longValue())) {
         if (f_11537.getConnection() != null) {
            f_11537.getConnection().sendCommand(f_28105);
         }

         this.m_8029();
      }
   }

   private boolean m_8015(ItemEntity var1) {
      return var1.isAlive() && !var1.getItem().isEmpty() && !this.f_28073.contains(var1.getId()) && f_28051.contains(var1.getItem().getItem());
   }

   private boolean m_8016(double var1, double var3, double var5) {
      AABB var7 = new AABB(var1 - f_28128, var3, var5 - f_28129, var1 + f_28130, var3 + f_28131, var5 + f_28132);
      return f_11537.level.noCollision(f_11537.player, var7);
   }

   private void m_8017(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (f_11537.player.getHealth() <= 0.0F) {
            if (this.f_28075 == null) {
               this.f_28075 = f_11537.player.position();
            }

            this.m_8029();
         } else if (this.f_28075 != null) {
            this.m_8007();
         } else {
            switch (this.f_28074) {
               case SEARCH:
                  this.m_8013();
                  break;
               case RETURN:
                  this.m_8012();
                  break;
               case HOME:
                  this.m_8014();
            }
         }
      }
   }

   private void m_8018(double var1, double var3, double var5, int var7) {
      boolean var8 = f_11537.player.onGround();
      boolean var9 = f_11537.player.horizontalCollision;

      for (int var10 = 0; var10 < var7; var10++) {
         f_11537.player.connection.send(new Pos(var1, var3, var5, var8, var9));
      }
   }

   private ItemEntity m_8019() {
      double var1 = this.f_28070.m_8768().floatValue();
      double var3 = var1 * var1;
      ItemEntity var5 = null;
      double var6 = f_28107;

      for (Entity var9 : f_11537.level.entitiesForRendering()) {
         if (var9 instanceof ItemEntity var10 && this.m_8015(var10)) {
            double var11 = f_11537.player.distanceToSqr(var10);
            if (!(var11 > var3)) {
               double var13 = this.m_8034(var10.getItem().getItem()) * f_28108 - var11;
               if (!(var13 <= var6)) {
                  var6 = var13;
                  var5 = var10;
               }
            }
         }
      }

      return var5;
   }

   private boolean m_8020(int var1, int var2, int var3) {
      BlockPos var4 = new BlockPos(var1, var2, var3);
      BlockState var5 = f_11537.level.getBlockState(var4);
      return var5.getCollisionShape(f_11537.level, var4).isEmpty() ? false : this.m_8016(var1 + f_28118, var2 + 1.0, var3 + f_28119);
   }

   private TPLoot.Class_44wqj3cGxjrPztRG m_8022(double var1, double var3, double var5) {
      int var7 = Mth.floor(var1);
      int var8 = Mth.floor(var3) - 1;
      int var9 = Mth.floor(var5);
      TPLoot.Class_44wqj3cGxjrPztRG var10 = null;
      double var11 = f_28115;

      for (int var13 = -1; var13 <= 1; var13++) {
         for (int var14 = -1; var14 <= 1; var14++) {
            int var15 = var7 + var13;
            int var16 = var9 + var14;
            double var17 = var15 + f_28116;
            double var19 = var16 + f_28117;
            if (this.m_8032(var17, var19)) {
               for (int var21 = 2; var21 >= -8; var21--) {
                  int var22 = var8 + var21;
                  double var23 = var22 + 1.0;
                  if (this.m_8020(var15, var22, var16)) {
                     double var25 = var17 - var1;
                     double var27 = var23 - var3;
                     double var29 = var19 - var5;
                     double var31 = var25 * var25 + var27 * var27 + var29 * var29;
                     if (!(var31 >= var11)) {
                        var11 = var31;
                        var10 = new TPLoot.Class_44wqj3cGxjrPztRG(var17, var23, var19);
                     }
                  }
               }
            }
         }
      }

      return var10;
   }

   private TPLoot.IIWsT0PHRxaK8g3N m_8023(Vec3 var1, long var2) {
      double var4 = var1.x;
      double var6 = var1.z;
      double var8 = this.m_8026(var4, var6);
      if (var8 > f_28114) {
         if (this.m_8033(var2)) {
            return TPLoot.IIWsT0PHRxaK8g3N.WAITING;
         }

         TPLoot.Class_44wqj3cGxjrPztRG var11 = this.m_8010(var4, var6);
         if (var11 == null) {
            return TPLoot.IIWsT0PHRxaK8g3N.BLOCKED;
         }

         this.m_8027(var11);
         return TPLoot.IIWsT0PHRxaK8g3N.MOVED;
      } else {
         if (!this.m_8032(var4, var6)) {
            return TPLoot.IIWsT0PHRxaK8g3N.BLOCKED;
         }

         TPLoot.Class_44wqj3cGxjrPztRG var10 = this.m_8031(var1);
         if (var10 == null) {
            return TPLoot.IIWsT0PHRxaK8g3N.BLOCKED;
         }

         if (this.m_8008(var10)) {
            return TPLoot.IIWsT0PHRxaK8g3N.REACHED;
         }

         if (this.m_8033(var2)) {
            return TPLoot.IIWsT0PHRxaK8g3N.WAITING;
         }

         this.m_8027(var10);
         return TPLoot.IIWsT0PHRxaK8g3N.MOVED;
      }
   }

   private void m_8024() {
      this.m_8035();
      if (this.f_28068.m_7568(f_28100) && this.f_28076 != null) {
         this.f_28074 = TPLoot.Class_6KhbgTuOpznLMBnM.RETURN;
         this.f_28081 = 0;
         this.f_28083 = System.nanoTime() + f_28101;
      } else if (this.f_28068.m_7568(f_28102)) {
         this.f_28074 = TPLoot.Class_6KhbgTuOpznLMBnM.HOME;
         this.f_28072.m_4459();
      } else {
         this.m_8029();
      }
   }

   private void m_8025() {
      this.f_28075 = null;
      this.m_8029();
   }

   private double m_8026(double var1, double var3) {
      return Math.hypot(var1 - f_11537.player.getX(), var3 - f_11537.player.getZ());
   }

   @Override
   public void m_732() {
      this.m_8025();
      super.m_732();
   }

   private void m_8027(TPLoot.Class_44wqj3cGxjrPztRG var1) {
      if (f_11537.player != null && f_11537.player.connection != null) {
         Vec3 var2 = f_11537.player.position();
         this.m_8018(var2.x, var2.y, var2.z, 10);
         f_11537.player.setDeltaMovement(Vec3.ZERO);
         this.m_8018(var1.x(), var1.feetY(), var1.z(), 10);
         f_11537.player.setPos(var1.x(), var1.feetY(), var1.z());
         this.f_28078 = true;
         this.f_28082 = System.nanoTime();
      }
   }

   private Integer m_8028(int var1, int var2) {
      int var3 = Math.min(f_11537.level.getHeight(Types.WORLD_SURFACE, var1, var2) - 1, f_11537.level.getMaxY());

      for (int var4 = var3; var4 >= f_11537.level.getMinY(); var4--) {
         BlockPos var5 = new BlockPos(var1, var4, var2);
         if (!f_11537.level.getBlockState(var5).getCollisionShape(f_11537.level, var5).isEmpty()) {
            return var4;
         }
      }

      return null;
   }

   public TPLoot() {
      super(f_28084, f_28085, Category.MOVEMENT);
      this.f_28068 = new MultiChoiceSetting(
         f_28086, new Class_2ZaVm8TGDJ68TnJB(f_28087), new Class_2ZaVm8TGDJ68TnJB(f_28088), new Class_2ZaVm8TGDJ68TnJB(f_28089)
      );
      this.f_28069 = new SliderSetting(f_28090, f_28091, f_28092, f_28093).m_828(f_28094).m_822(() -> this.f_28068.m_7568(f_28134));
      this.f_28070 = new SliderSetting(f_28095, f_28096, f_28097, f_28098).m_828(f_28099);
      this.f_28071 = this::m_8017;
      this.f_28072 = new Class_QmNR03reugBgWiPr();
      this.f_28073 = new HashSet<>();
      this.f_28074 = TPLoot.Class_6KhbgTuOpznLMBnM.SEARCH;
      this.f_28079 = -1;
      this.m_795(this.f_28068, this.f_28069, this.f_28070);
   }

   private void m_8029() {
      this.f_28074 = TPLoot.Class_6KhbgTuOpznLMBnM.SEARCH;
      this.f_28076 = null;
      this.f_28077 = false;
      this.f_28073.clear();
      this.m_8035();
      this.f_28078 = false;
      this.f_28082 = 0L;
      this.f_28083 = 0L;
      this.f_28072.m_4459();
   }

   private TPLoot.Class_44wqj3cGxjrPztRG m_8030(double var1, double var3, double var5, double var7, double var9, double var11) {
      int var13 = Mth.floor(var5);
      int var14 = Mth.floor(var7);
      TPLoot.Class_44wqj3cGxjrPztRG var15 = null;
      double var16 = f_28123;
      double var18 = Math.hypot(var9 - var1, var11 - var3);

      for (int var20 = -1; var20 <= 1; var20++) {
         for (int var21 = -1; var21 <= 1; var21++) {
            int var22 = var13 + var20;
            int var23 = var14 + var21;
            double var24 = var22 + f_28124;
            double var26 = var23 + f_28125;
            if (!(Math.hypot(var24 - var1, var26 - var3) > f_28126)
               && !(Math.hypot(var9 - var24, var11 - var26) > var18 - f_28127)
               && this.m_8032(var24, var26)) {
               Integer var28 = this.m_8028(var22, var23);
               if (var28 != null) {
                  double var29 = var28.intValue() + 1.0;
                  if (this.m_8016(var24, var29, var26)) {
                     double var31 = var24 - var5;
                     double var33 = var26 - var7;
                     double var35 = var31 * var31 + var33 * var33;
                     if (!(var35 >= var16)) {
                        var16 = var35;
                        var15 = new TPLoot.Class_44wqj3cGxjrPztRG(var24, var29, var26);
                     }
                  }
               }
            }
         }
      }

      return var15;
   }

   private TPLoot.Class_44wqj3cGxjrPztRG m_8031(Vec3 var1) {
      return this.m_8032(var1.x, var1.z) && this.m_8016(var1.x, var1.y, var1.z)
         ? new TPLoot.Class_44wqj3cGxjrPztRG(var1.x, var1.y, var1.z)
         : this.m_8022(var1.x, var1.y, var1.z);
   }

   private boolean m_8032(double var1, double var3) {
      int var5 = Mth.floor(var1) >> 4;
      int var6 = Mth.floor(var3) >> 4;
      return f_11537.level.getChunkSource().getChunk(var5, var6, ChunkStatus.FULL, false) != null;
   }

   private boolean m_8033(long var1) {
      return this.f_28078 && System.nanoTime() - this.f_28082 < var1;
   }

   private int m_8034(Item var1) {
      if (var1 == Items.PLAYER_HEAD) {
         return 10;
      } else if (var1 == Items.ENCHANTED_GOLDEN_APPLE) {
         return 8;
      } else if (var1 == Items.TOTEM_OF_UNDYING || var1 == Items.ELYTRA) {
         return 5;
      } else {
         return var1 == Items.NETHERITE_INGOT ? 4 : 1;
      }
   }

   private void m_8035() {
      this.f_28079 = -1;
      this.f_28080 = 0;
      this.f_28081 = 0;
   }

   private void m_8036(ItemEntity var1) {
      if (this.f_28079 != var1.getId()) {
         this.f_28079 = var1.getId();
         this.f_28080 = 0;
         this.f_28081 = 0;
      }
   }

   private record Class_44wqj3cGxjrPztRG(double x, double feetY, double z) {
   }

   private enum Class_6KhbgTuOpznLMBnM {
      SEARCH,
      RETURN,
      HOME;
   }

   private enum IIWsT0PHRxaK8g3N {
      WAITING,
      MOVED,
      REACHED,
      BLOCKED;
   }
}
