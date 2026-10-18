package dev.dimasik.client.module.movement;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_3LQSDrJ0WJYOQ7ck;
import dev.dimasik.client.system.Class_EndlYW7bFBb6ZTsy;
import dev.dimasik.client.system.Class_QBKwWNWLlChWViO9;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_ZPRMV6aCWVosHRWh;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_jfpiTZhNIuwDwqKr;
import dev.dimasik.client.system.Class_lTzchJDbvRVrnXlw;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import net.minecraft.network.protocol.game.ServerboundAcceptTeleportationPacket;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket.Pos;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;

public class Fly extends Module {
   private final MultiChoiceSetting f_17080;
   private final SliderSetting f_17081;
   private final SliderSetting f_17082;
   private final CheckboxSetting f_17083;
   private final MultiChoiceSetting f_17084;
   private final MultiChoiceSetting f_17085;
   private final CheckboxSetting f_17086;
   private final CheckboxSetting f_17087;
   private final SliderSetting f_17088;
   private final SliderSetting f_17089;
   private final SliderSetting f_17090;
   private final SliderSetting f_17091;
   private final SliderSetting f_17092;
   private final SliderSetting f_17093;
   private final SliderSetting f_17094;
   private int f_17095;
   private final ConcurrentHashMap<Integer, Fly.UBk2j2XNa72EBIOl> f_17096;
   private int f_17097;
   private boolean f_17098;
   private boolean f_17099;
   private float f_17100;
   private float f_17101;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_17102;
   private final Class_gEPk7yDw6CwIte87<Class_EndlYW7bFBb6ZTsy> f_17103;
   private final Class_gEPk7yDw6CwIte87<Class_jfpiTZhNIuwDwqKr> f_17104;
   private final Class_gEPk7yDw6CwIte87<Class_lTzchJDbvRVrnXlw> f_17105;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_17106;
   private static final String f_17107 = "Fly";
   private static final String f_17108 = "Полет";
   private static final String f_17109 = "Mode";
   private static final String f_17110 = "Vanilla";
   private static final String f_17111 = "Metahvh";
   private static final String f_17112 = "Horizontal";
   private static final float f_17113 = 0.1F;
   private static final float f_17114 = 5.0F;
   private static final float f_17115 = 0.1F;
   private static final String f_17116 = "Vertical";
   private static final float f_17117 = 0.5F;
   private static final float f_17118 = 3.0F;
   private static final float f_17119 = 0.1F;
   private static final String f_17120 = "Y-Jitter";
   private static final String f_17121 = "Type";
   private static final String f_17122 = "Bounds";
   private static final String f_17123 = "Phase";
   private static final String f_17124 = "Full";
   private static final String f_17125 = "Off";
   private static final String f_17126 = "Semi";
   private static final String f_17127 = "Limit";
   private static final String f_17128 = "AntiKick";
   private static final String f_17129 = "AntiKickOffset";
   private static final float f_17130 = 0.04F;
   private static final float f_17131 = 0.008F;
   private static final float f_17132 = 0.001F;
   private static final String f_17133 = "Speed";
   private static final float f_17134 = 0.5F;
   private static final float f_17135 = 10.0F;
   private static final float f_17136 = 0.01F;
   private static final String f_17137 = "UpSpeed";
   private static final float f_17138 = 0.06F;
   private static final float f_17139 = 0.01F;
   private static final float f_17140 = 0.01F;
   private static final String f_17141 = "Timer";
   private static final float f_17142 = 0.1F;
   private static final float f_17143 = 5.0F;
   private static final float f_17144 = 0.1F;
   private static final String f_17145 = "IncreaseTicks";
   private static final float f_17146 = 20.0F;
   private static final String f_17147 = "Factor";
   private static final float f_17148 = 10.0F;
   private static final String f_17149 = "Offset";
   private static final float f_17150 = 1337.0F;
   private static final float f_17151 = 1337.0F;
   private static final String f_17152 = "Vanilla";
   private static final double f_17153 = 0.1;
   private static final double f_17154 = -0.1;
   private static final String f_17155 = "Metahvh";
   private static final String f_17156 = "Metahvh";
   private static final String f_17157 = "Metahvh";
   private static final double f_17158 = -0.0625;
   private static final String f_17159 = "Full";
   private static final double f_17160 = 2.5;
   private static final double f_17161 = 1.5;
   private static final String f_17162 = "Full";
   private static final double f_17163 = 0.034444444444444444;
   private static final double f_17164 = 0.26;
   private static final double f_17165 = 20.0;
   private static final double f_17166 = 20.0;
   private static final String f_17167 = "Off";
   private static final String f_17168 = "Semi";
   private static final double f_17169 = 10.0;
   private static final double f_17170 = 255.0;
   private static final float f_17171 = -45.0F;
   private static final float f_17172 = 45.0F;
   private static final float f_17173 = 45.0F;
   private static final float f_17174 = -45.0F;
   private static final float f_17175 = -1.0F;
   private static final float f_17176 = 90.0F;
   private static final float f_17177 = 90.0F;
   private static final String f_17178 = "Metahvh";
   private static final String f_17179 = "Metahvh";
   private static final long f_17180 = 30000L;
   private static final String f_17181 = "Metahvh";
   private static final String f_17182 = "Metahvh";
   private static final String f_17183 = "Metahvh";
   private static final String f_17184 = "Metahvh";
   private static final String f_17185 = "Metahvh";
   private static final String f_17186 = "Metahvh";
   private static final String f_17187 = "Metahvh";
   private static final String f_17188 = "Metahvh";
   private static final String f_17189 = "Metahvh";
   private static final String f_17190 = "Metahvh";
   private static final String f_17191 = "Metahvh";
   private static final String f_17192 = "Vanilla";
   private static final String f_17193 = "Vanilla";
   private static final String f_17194 = "Vanilla";

   public Fly() {
      super(f_17107, f_17108, Category.MOVEMENT);
      this.f_17080 = new MultiChoiceSetting(f_17109, new Class_2ZaVm8TGDJ68TnJB(f_17110), new Class_2ZaVm8TGDJ68TnJB(f_17111));
      this.f_17081 = new SliderSetting(f_17112, 1.0F, f_17113, f_17114).m_828(f_17115).m_822(() -> this.f_17080.m_7568(f_17194));
      this.f_17082 = new SliderSetting(f_17116, f_17117, 0.0F, f_17118).m_828(f_17119).m_822(() -> this.f_17080.m_7568(f_17193));
      this.f_17083 = new CheckboxSetting(f_17120, false).m_822(() -> this.f_17080.m_7568(f_17192));
      this.f_17084 = new MultiChoiceSetting(f_17121, new Class_2ZaVm8TGDJ68TnJB(f_17122)).m_822(() -> this.f_17080.m_7568(f_17191));
      this.f_17085 = new MultiChoiceSetting(
            f_17123, new Class_2ZaVm8TGDJ68TnJB(f_17124), new Class_2ZaVm8TGDJ68TnJB(f_17125), new Class_2ZaVm8TGDJ68TnJB(f_17126)
         )
         .m_822(() -> this.f_17080.m_7568(f_17190));
      this.f_17086 = new CheckboxSetting(f_17127, true).m_822(() -> this.f_17080.m_7568(f_17189));
      this.f_17087 = new CheckboxSetting(f_17128, true).m_822(() -> this.f_17080.m_7568(f_17188));
      this.f_17088 = new SliderSetting(f_17129, f_17130, f_17131, 1.0F).m_828(f_17132).m_822(() -> this.f_17080.m_7568(f_17187) && this.f_17087.m_8768());
      this.f_17089 = new SliderSetting(f_17133, f_17134, 0.0F, f_17135).m_828(f_17136).m_822(() -> this.f_17080.m_7568(f_17186));
      this.f_17090 = new SliderSetting(f_17137, f_17138, f_17139, 1.0F).m_828(f_17140).m_822(() -> this.f_17080.m_7568(f_17185));
      this.f_17091 = new SliderSetting(f_17141, 1.0F, f_17142, f_17143).m_828(f_17144).m_822(() -> this.f_17080.m_7568(f_17184));
      this.f_17092 = new SliderSetting(f_17145, 1.0F, 1.0F, f_17146).m_828(1.0F).m_822(() -> this.f_17080.m_7568(f_17183));
      this.f_17093 = new SliderSetting(f_17147, 1.0F, 1.0F, f_17148).m_828(1.0F).m_822(() -> this.f_17080.m_7568(f_17182));
      this.f_17094 = new SliderSetting(f_17149, f_17150, 1.0F, f_17151).m_828(1.0F).m_822(() -> this.f_17080.m_7568(f_17181));
      this.f_17095 = -1;
      this.f_17096 = new ConcurrentHashMap<>();
      this.f_17102 = this::m_5895;
      this.f_17103 = this::m_5882;
      this.f_17104 = this::m_5897;
      this.f_17105 = this::m_5886;
      this.f_17106 = this::m_5885;
      this.m_795(
         this.f_17080,
         this.f_17081,
         this.f_17082,
         this.f_17083,
         this.f_17084,
         this.f_17085,
         this.f_17086,
         this.f_17087,
         this.f_17088,
         this.f_17089,
         this.f_17090,
         this.f_17091,
         this.f_17092,
         this.f_17093,
         this.f_17094
      );
   }

   private void m_5882(Class_EndlYW7bFBb6ZTsy var1) {
      if (this.f_17080.m_7568(f_17156) && f_11537.player != null) {
         f_11537.player.setDeltaMovement(Vec3.ZERO);
         var1.m_2545(Vec3.ZERO);
      }
   }

   private void m_5885(Class_XzpX8S5F5zd9jbuE var1) {
      if (this.f_17080.m_7568(f_17179) && f_11537.player != null && f_11537.level != null) {
         if (var1.m_5619() instanceof ClientboundPlayerPositionPacket var2) {
            Fly.UBk2j2XNa72EBIOl var6 = this.f_17096.remove(var2.id());
            Vec3 var4 = var2.change().position();
            boolean var5 = f_11537.level.hasChunk((int)f_11537.player.getX() >> 4, (int)f_11537.player.getZ() >> 4);
            if (f_11537.player.isAlive() && var5 && var6 != null && var6.x == var4.x && var6.y == var4.y && var6.z == var4.z) {
               var1.m_1582(true);
            } else {
               this.f_17100 = f_11537.player.getYRot();
               this.f_17101 = f_11537.player.getXRot();
               this.f_17099 = true;
               this.f_17095 = var2.id();
            }
         }
      }
   }

   private void m_5886(Class_lTzchJDbvRVrnXlw var1) {
      if (this.f_17080.m_7568(f_17178)) {
         if (var1.m_7532() instanceof ServerboundMovePlayerPacket) {
            var1.m_1582(true);
         }
      }
   }

   @Override
   public void m_778() {
      Class_ZPRMV6aCWVosHRWh.m_5820(1.0F);
      this.f_17095 = -1;
      this.f_17096.clear();
      this.f_17097 = 0;
      this.f_17098 = false;
      this.f_17099 = false;
      super.m_778();
   }

   @Override
   public void m_732() {
      Class_ZPRMV6aCWVosHRWh.m_5820(1.0F);
      if (f_11537.player != null) {
         f_11537.player.getAbilities().flying = false;
         f_11537.player.noPhysics = false;
         f_11537.player.setDeltaMovement(Vec3.ZERO);
      }

      super.m_732();
   }

   private Vec3 m_5890(Vec3 var1) {
      return new Vec3(var1.x, f_11537.player.getY() <= f_17169 ? f_17170 : 1.0, var1.z);
   }

   private double[] m_5894(double var1) {
      float var3 = f_11537.player.input.getMoveVector().y;
      float var4 = f_11537.player.input.getMoveVector().x;
      float var5 = f_11537.player.getYRot();
      if (var3 != 0.0F) {
         if (var4 > 0.0F) {
            var5 += var3 > 0.0F ? f_17171 : f_17172;
         } else if (var4 < 0.0F) {
            var5 += var3 > 0.0F ? f_17173 : f_17174;
         }

         var4 = 0.0F;
         if (var3 > 0.0F) {
            var3 = 1.0F;
         } else if (var3 < 0.0F) {
            var3 = f_17175;
         }
      }

      double var6 = Math.sin(Math.toRadians(var5 + f_17176));
      double var8 = Math.cos(Math.toRadians(var5 + f_17177));
      return new double[]{var3 * var1 * var8 + var4 * var1 * var6, var3 * var1 * var6 - var4 * var1 * var8};
   }

   private void m_5895(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null) {
         if (this.f_17099) {
            f_11537.player.setYRot(this.f_17100);
            f_11537.player.setXRot(this.f_17101);
            this.f_17099 = false;
         }

         if (this.f_17080.m_7568(f_17152)) {
            Class_QBKwWNWLlChWViO9.m_4264(this.f_17081.m_8768().floatValue());
            double var2 = 0.0;
            if (f_11537.options.keyJump.isDown()) {
               var2 = this.f_17082.m_8768().floatValue();
            }

            if (f_11537.options.keyShift.isDown()) {
               var2 = -this.f_17082.m_8768();
            }

            if (this.f_17083.m_8768()) {
               var2 += f_11537.player.tickCount % 2 == 0 ? f_17153 : f_17154;
            }

            Vec3 var4 = f_11537.player.getDeltaMovement();
            f_11537.player.setDeltaMovement(var4.x, var2, var4.z);
         } else {
            if (this.f_17080.m_7568(f_17155)) {
               this.f_17096.entrySet().removeIf(var0 -> System.currentTimeMillis() - var0.getValue().time > f_17180);
            }
         }
      }
   }

   private void m_5897(Class_jfpiTZhNIuwDwqKr var1) {
      if (this.f_17080.m_7568(f_17157) && f_11537.player != null && f_11537.level != null) {
         if (!var1.m_1581()) {
            if (this.f_17095 != 0) {
               if (this.f_17091.m_8768() != 1.0F) {
                  Class_ZPRMV6aCWVosHRWh.m_5820(this.f_17091.m_8768());
               }

               boolean var2 = f_11537.level.getBlockCollisions(f_11537.player, f_11537.player.getBoundingBox().inflate(f_17158)).iterator().hasNext();
               Vec2 var3 = f_11537.player.input.getMoveVector();
               boolean var4 = var3.y == 0.0F && var3.x == 0.0F;
               double var5 = 0.0;
               if (!f_11537.options.keyJump.isDown() || !var2 && !var4) {
                  if (f_11537.options.keyShift.isDown()) {
                     var5 = -this.f_17090.m_8768();
                  } else if (this.f_17087.m_8768() && !var2 && f_11537.player.tickCount % 20 == 0) {
                     var5 = -this.f_17088.m_8768();
                  }
               } else {
                  var5 = this.f_17090.m_8768().floatValue();
               }

               if (this.f_17085.m_7568(f_17159) && var2 && !var4 && var5 != 0.0) {
                  var5 = f_11537.options.keyJump.isDown() ? var5 / f_17160 : var5 / f_17161;
               }

               double var7 = this.f_17085.m_7568(f_17162) && var2 ? f_17163 : this.f_17089.m_8768().floatValue() * f_17164;
               double[] var9 = this.m_5894(var7);
               int var10 = 1;
               if (f_11537.player.tickCount % this.f_17092.m_8768().intValue() == 0) {
                  var10 = (int)Math.floor(this.f_17093.m_8768().floatValue());
                  this.f_17097++;
                  double var11 = this.f_17093.m_8768() - var10;
                  if (var11 != 0.0) {
                     double var13 = f_17165 / (var11 * f_17166);
                     if (this.f_17097 > (int)var13) {
                        var10++;
                        this.f_17097 = 0;
                     }
                  }
               }

               for (int var18 = 1; var18 <= var10; var18++) {
                  double var12 = var9[0] * var18;
                  double var14 = var5 * var18;
                  double var16 = var9[1] * var18;
                  if (this.f_17086.m_8768()) {
                     if (f_11537.player.tickCount % 2 == 0) {
                        if (this.f_17098 && var14 >= 0.0) {
                           this.f_17098 = false;
                           var14 = -this.f_17090.m_8768() / 2.0F;
                        }

                        f_11537.player.setDeltaMovement(var12, var14, var16);
                        this.m_5902(var12, var14, var16, false);
                     } else if (var14 < 0.0) {
                        this.f_17098 = true;
                     }
                  } else {
                     f_11537.player.setDeltaMovement(var12, var14, var16);
                     this.m_5902(var12, var14, var16, true);
                  }
               }

               if (!this.f_17085.m_7568(f_17167) && !this.f_17085.m_7568(f_17168) && var2) {
                  f_11537.player.noPhysics = true;
               }

               var1.m_7398(f_11537.player.position());
               var1.m_7395(f_11537.player.getYRot());
               var1.m_7400(f_11537.player.getXRot());
               var1.m_7393(f_11537.player.onGround());
               var1.m_1582(true);
            }
         }
      }
   }

   private void m_5902(double var1, double var3, double var5, boolean var7) {
      Vec3 var8 = f_11537.player.position().add(var1, var3, var5);
      Vec3 var9 = this.m_5890(var8);
      boolean var10 = f_11537.player.onGround();
      boolean var11 = f_11537.player.horizontalCollision;
      Class_3LQSDrJ0WJYOQ7ck.m_1293(new Pos(var8.x, var8.y, var8.z, var10, var11));
      Class_3LQSDrJ0WJYOQ7ck.m_1293(new Pos(var9.x, var9.y, var9.z, var10, var11));
      if (var7) {
         Class_3LQSDrJ0WJYOQ7ck.m_1293(new ServerboundAcceptTeleportationPacket(++this.f_17095));
         this.f_17096.put(this.f_17095, new Fly.UBk2j2XNa72EBIOl(var8.x, var8.y, var8.z, System.currentTimeMillis()));
      }
   }

   private record UBk2j2XNa72EBIOl(double x, double y, double z, long time) {
   }
}
