package dev.dimasik.client.module.combat;

import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_0s5WQhNSSkdI2aVQ;
import dev.dimasik.client.system.Class_81oIJPtsDGdzRKcL;
import dev.dimasik.client.system.Class_8eBbS8V7lQU0fpQj;
import dev.dimasik.client.system.Class_B6vpBUNmRtH3JzmV;
import dev.dimasik.client.system.Class_BYfjHaSHGXpfcI6Q;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_CWDgYIJS0DdP16bO;
import dev.dimasik.client.system.Class_EKJCmS6xh0Ri3UKL;
import dev.dimasik.client.system.Class_HC4FxlQBDqG2aUiU;
import dev.dimasik.client.system.Class_KnZ6JjkNfseuDLb0;
import dev.dimasik.client.system.Class_Pz8IezfODFKid4ag;
import dev.dimasik.client.system.Class_QmNR03reugBgWiPr;
import dev.dimasik.client.system.Class_TT9n584oSK6xnBdz;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_bhSc4OUnYWSe2vjL;
import dev.dimasik.client.system.Class_dJj2SGO1fl9bUExQ;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_izMBLqd5r0wrVpYz;
import dev.dimasik.client.system.Class_jfpiTZhNIuwDwqKr;
import dev.dimasik.client.system.Class_r4AHZOK7QWNZveVe;
import dev.dimasik.client.system.Class_sS4M8u1p9l0dNe0C;
import dev.dimasik.mixin.MultiPlayerGameModeMixin;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResult.Success;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;

public class CrystalAura extends Module {
   private static final int f_16810 = 6;
   private static final int f_16811 = 10;
   private static final int f_16812 = 40;
   private static final int f_16813 = 80;
   private static final long f_16814 = 300L;
   private static final long f_16815 = 140L;
   private static final long f_16816 = 160L;
   private static final int f_16817 = Class_BftdentXEtGbugJw.m_2310(45, 125, 255);
   private static final int f_16818 = Class_BftdentXEtGbugJw.m_2310(180, 70, 255);
   private static final int f_16819 = Class_BftdentXEtGbugJw.m_2310(255, 55, 55);
   private final SliderSetting f_16820;
   private final SliderSetting f_16821;
   private final SliderSetting f_16822;
   private final SliderSetting f_16823;
   private final SliderSetting f_16824;
   private final SliderSetting f_16825;
   private final SliderSetting f_16826;
   private final CheckboxSetting f_16827;
   private final CheckboxSetting f_16828;
   private final CheckboxSetting f_16829;
   private final CheckboxSetting f_16830;
   private final CheckboxSetting f_16831;
   private final CheckboxSetting f_16832;
   private final CheckboxSetting f_16833;
   private final CheckboxSetting f_16834;
   private final Class_QmNR03reugBgWiPr f_16835;
   private final Class_8eBbS8V7lQU0fpQj f_16836;
   private final Class_0s5WQhNSSkdI2aVQ f_16837;
   private ClientLevel f_16838;
   private int f_16839;
   private BlockPos f_16840;
   private float f_16841;
   private int f_16842;
   private final Map<BlockPos, Integer> f_16843;
   private final Map<BlockPos, Integer> f_16844;
   private final Map<BlockPos, Integer> f_16845;
   private final Map<BlockPos, Integer> f_16846;
   private BlockPos f_16847;
   private int f_16848;
   private BlockPos f_16849;
   private CrystalAura.vn5L5yLVImPs8Zmg f_16850;
   private int f_16851;
   private final List<Class_EKJCmS6xh0Ri3UKL> f_16852;
   private BlockPos f_16853;
   private float f_16854;
   private long f_16855;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_16856;
   private final Class_gEPk7yDw6CwIte87<Class_jfpiTZhNIuwDwqKr> f_16857;
   private final Class_gEPk7yDw6CwIte87<Class_jfpiTZhNIuwDwqKr.Class_13dQBetjQQOBNsco> f_16858;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_16859;
   private final Class_gEPk7yDw6CwIte87<Class_CWDgYIJS0DdP16bO> f_16860;
   private static final String f_16861 = "CrystalAura";
   private static final String f_16862 = "Автоматически ставит обсидиан/кристал в выгодных условиях";
   private static final String f_16863 = "Радиус цели";
   private static final float f_16864 = 8.0F;
   private static final float f_16865 = 4.0F;
   private static final float f_16866 = 12.0F;
   private static final float f_16867 = 0.5F;
   private static final String f_16868 = "Дальность установки";
   private static final float f_16869 = 4.5F;
   private static final float f_16870 = 3.0F;
   private static final float f_16871 = 6.0F;
   private static final float f_16872 = 0.1F;
   private static final String f_16873 = "Дальность взрыва";
   private static final float f_16874 = 3.0F;
   private static final float f_16875 = 6.0F;
   private static final float f_16876 = 0.1F;
   private static final String f_16877 = "Мин. урон врагу";
   private static final float f_16878 = 6.0F;
   private static final float f_16879 = 20.0F;
   private static final float f_16880 = 0.5F;
   private static final String f_16881 = "Макс. урон себе";
   private static final float f_16882 = 8.0F;
   private static final float f_16883 = 20.0F;
   private static final float f_16884 = 0.5F;
   private static final String f_16885 = "Задержка";
   private static final float f_16886 = 500.0F;
   private static final float f_16887 = 10.0F;
   private static final String f_16888 = "Предикт тиков";
   private static final float f_16889 = 4.0F;
   private static final String f_16890 = "Ставить обсидиан";
   private static final String f_16891 = "Обход Matrix";
   private static final String f_16892 = "Легитный";
   private static final String f_16893 = "Анти-суицид";
   private static final String f_16894 = "Авто подкоп";
   private static final String f_16895 = "Рендер позиции";
   private static final String f_16896 = "Логи";
   private static final String f_16897 = "Сейвить себя";
   private static final String f_16898 = "action timeout";
   private static final float f_16899 = 8.0F;
   private static final float f_16900 = Float.MAX_VALUE;
   private static final float f_16901 = 300.0F;
   private static final float f_16902 = 0.4F;
   private static final float f_16903 = 0.6F;
   private static final float f_16904 = 0.39215687F;
   private static final long f_16905 = 140L;
   private static final long f_16906 = 140L;
   private static final float f_16907 = 160.0F;
   private static final float f_16908 = 0.55F;
   private static final float f_16909 = 0.45F;
   private static final float f_16910 = 0.45F;
   private static final float f_16911 = 0.4F;
   private static final float f_16912 = 0.5F;
   private static final double f_16913 = 0.5;
   private static final double f_16914 = 0.5;
   private static final double f_16915 = 0.5;
   private static final double f_16916 = 0.5;
   private static final float f_16917 = 0.05F;
   private static final double f_16918 = 0.1;
   private static final double f_16919 = 0.1;
   private static final double f_16920 = 0.1;
   private static final double f_16921 = Double.MAX_VALUE;
   private static final double f_16922 = 1.5;
   private static final String f_16923 = "crystal is gone or out of range";
   private static final String f_16924 = "item missing";
   private static final float f_16925 = 8.0F;
   private static final String f_16926 = "unsafe crystal or out of range";
   private static final String f_16927 = "mining no longer allowed";
   private static final String f_16928 = "placement invalidated";
   private static final float f_16929 = 1.0E-5F;
   private static final double f_16930 = 2.0;

   private List<Player> m_5778(float var1) {
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

   public boolean m_5779() {
      return this.m_776() && this.f_16840 != null;
   }

   private void m_5780(Class_TZhU50s8XmBQCMP5 var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (!this.f_16832.m_8768()) {
            this.f_16852.clear();
            this.f_16853 = null;
         } else if (!this.f_16852.isEmpty() || this.f_16853 != null) {
            VertexConsumer var2 = var1.m_5008().m_881(Class_81oIJPtsDGdzRKcL.f_3816);
            VertexConsumer var3 = var1.m_5008().m_881(Class_81oIJPtsDGdzRKcL.f_3818);
            Vec3 var4 = var1.m_5010();
            long var5 = System.currentTimeMillis();
            Iterator var7 = this.f_16852.iterator();

            while (var7.hasNext()) {
               Class_EKJCmS6xh0Ri3UKL var8 = (Class_EKJCmS6xh0Ri3UKL)var7.next();
               float var9 = (float)(var5 - var8.createdAt()) / f_16901;
               if (var9 >= 1.0F) {
                  var7.remove();
               } else {
                  float var10 = f_16902 + f_16903 * var9;
                  float var11 = (1.0F - var9) * f_16904;
                  int var12 = var8.crystal() ? f_16818 : f_16817;
                  int var13 = Class_BftdentXEtGbugJw.m_2306(var12, var11);
                  int var14 = Class_BftdentXEtGbugJw.m_2306(var12, var11);
                  AABB var15 = this.m_5815(var8.pos(), var10);
                  Class_bhSc4OUnYWSe2vjL.m_6088(var1.m_5006(), var3, var4, var15.minX, var15.minY, var15.minZ, var15.maxX, var15.maxY, var15.maxZ, var14, true);
               }
            }

            this.m_5785(var1, var2, var4, var5);
         }
      }
   }

   @Override
   public void m_732() {
      this.m_5818();
      super.m_732();
   }

   private int m_5782(Item var1) {
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

   private int m_5783(CrystalAura.vn5L5yLVImPs8Zmg var1) {
      return switch (var1.kind()) {
         case OBSIDIAN -> this.m_5782(Items.OBSIDIAN);
         case CRYSTAL -> this.m_5782(Items.END_CRYSTAL);
         case ATTACK -> this.f_16829.m_8768() ? this.m_5782(Items.END_CRYSTAL) : f_11537.player.getInventory().getSelectedSlot();
         case DIG -> {
            int var2 = Class_B6vpBUNmRtH3JzmV.m_2134(f_11537.level.getBlockState(var1.pos()));
            yield var2 >= 0 ? var2 : f_11537.player.getInventory().getSelectedSlot();
         }
      };
   }

   private boolean m_5784(BlockPos var1) {
      if (!this.f_16845.containsKey(var1) && Class_izMBLqd5r0wrVpYz.m_7348(var1)) {
         Class_BYfjHaSHGXpfcI6Q var2 = Class_TT9n584oSK6xnBdz.m_4985(var1, f_11537.player.getEyePosition(), this.f_16821.m_8768().floatValue());
         return this.m_5810(CrystalAura.r4eWPTHdRnFpO9mj.CRYSTAL, var1, var2, null);
      } else {
         return false;
      }
   }

   private void m_5785(Class_TZhU50s8XmBQCMP5 var1, VertexConsumer var2, Vec3 var3, long var4) {
      if (this.f_16853 != null) {
         long var6 = var4 - this.f_16855;
         float var8;
         if (var6 <= f_16905) {
            var8 = 1.0F;
         } else {
            float var9 = (float)(var6 - f_16906) / f_16907;
            if (var9 >= 1.0F) {
               this.f_16853 = null;
               return;
            }

            var8 = 1.0F - var9;
         }

         float var15 = f_16908 + f_16909 * this.f_16854;
         float var10 = (f_16910 + f_16911 * this.f_16854) * var8 * f_16912;
         int var11 = Class_BftdentXEtGbugJw.m_2306(f_16819, var10);
         int var12 = Class_BftdentXEtGbugJw.m_2306(f_16819, var10);
         AABB var13 = this.m_5815(this.f_16853, var15);
         VertexConsumer var14 = var1.m_5008().m_881(Class_81oIJPtsDGdzRKcL.f_3818);
         Class_bhSc4OUnYWSe2vjL.m_6088(var1.m_5006(), var14, var3, var13.minX, var13.minY, var13.minZ, var13.maxX, var13.maxY, var13.maxZ, var12, true);
      }
   }

   private void m_5786() {
      this.f_16837.m_811();
   }

   private boolean m_5787() {
      return this.f_16828.m_8768();
   }

   private void m_5788(Class_jfpiTZhNIuwDwqKr.Class_13dQBetjQQOBNsco var1) {
      if (!DimasikClient.m_9057().m_9049().m_2801().m_3527().m_8895()) {
         if (this.f_16850 != null && f_11537.player != null && f_11537.level != null && f_11537.gameMode != null && !f_11537.player.isUsingItem()) {
            AutoWebTrap var2 = DimasikClient.m_9057().m_9049().m_2801().m_3510();
            if (var2 != null && var2.m_8613()) {
               this.m_5799();
            } else if (this.f_16851 == f_11537.player.tickCount && !var1.m_1581() && this.f_16836.m_1804(this)) {
               this.f_16851 = -1;
               CrystalAura.vn5L5yLVImPs8Zmg var3 = this.f_16850;
               int var4 = this.m_5783(var3);
               if (var4 < 0) {
                  this.m_5805(f_16924);
               } else if (this.f_16837.m_812(var4, this.m_5787())) {
                  if (var3.kind() == CrystalAura.r4eWPTHdRnFpO9mj.ATTACK) {
                     Player var17 = var2 == null ? null : var2.m_8614();
                     List var18 = var17 != null ? List.of(var17) : this.m_5792(this.f_16820.m_8768());
                     EndCrystal var19 = var3.crystal();
                     if (Class_izMBLqd5r0wrVpYz.m_7345(var19, f_11537.player.getEyePosition(), this.f_16822.m_8768().floatValue()) != null
                        && Class_izMBLqd5r0wrVpYz.m_7346(
                           var19, var18, this.f_16824.m_8768(), this.f_16823.m_8768(), this.m_5813(), this.m_5778(this.f_16820.m_8768() + f_16925)
                        )) {
                        this.f_16850 = null;

                        try {
                           f_11537.gameMode.attack(f_11537.player, var19);
                           f_11537.player.swing(InteractionHand.MAIN_HAND);
                           this.f_16835.m_4459();
                        } finally {
                           if (!this.f_16829.m_8768()) {
                              this.f_16837.m_811();
                           }
                        }
                     } else {
                        this.m_5805(f_16926);
                     }
                  } else {
                     BlockHitResult var5 = Class_TT9n584oSK6xnBdz.m_4988(var3.hit(), this.f_16821.m_8768().floatValue(), var1);
                     if (var5 != null) {
                        if (var3.kind() == CrystalAura.r4eWPTHdRnFpO9mj.DIG) {
                           if (this.f_16831.m_8768() && Class_izMBLqd5r0wrVpYz.m_7337(f_11537.level.getBlockState(var3.pos()))) {
                              this.f_16850 = null;
                              this.m_5808(var3.pos(), var5);
                           } else {
                              this.m_5805(f_16927);
                           }
                        } else {
                           boolean var6 = var3.kind() == CrystalAura.r4eWPTHdRnFpO9mj.CRYSTAL
                              ? !this.f_16845.containsKey(var3.pos()) && Class_izMBLqd5r0wrVpYz.m_7348(var3.pos())
                              : Class_TT9n584oSK6xnBdz.m_4987(var3.pos(), var5, f_11537.player.getMainHandItem()) && !Class_izMBLqd5r0wrVpYz.m_7343(var3.pos());
                           if (!var6) {
                              this.m_5805(f_16928);
                           } else {
                              this.f_16850 = null;

                              try {
                                 InteractionResult var7 = f_11537.gameMode.useItemOn(f_11537.player, InteractionHand.MAIN_HAND, var5);
                                 if (this.f_16833.m_8768()) {
                                    this.m_5812(
                                       var3.kind()
                                          + var3.pos().toShortString()
                                          + var5.getBlockPos().toShortString()
                                          + var5.getDirection()
                                          + var5.getLocation().subtract(Vec3.atLowerCornerOf(var5.getBlockPos()))
                                          + var1.m_7396()
                                          + var1.m_7397()
                                          + var7
                                    );
                                 }

                                 boolean var8 = var7 instanceof Success var9
                                    && var9.wasItemInteraction()
                                    && (var3.kind() == CrystalAura.r4eWPTHdRnFpO9mj.CRYSTAL || f_11537.level.getBlockState(var3.pos()).is(Blocks.OBSIDIAN));
                                 if (var8) {
                                    f_11537.player.swing(InteractionHand.MAIN_HAND);
                                    this.f_16835.m_4459();
                                    if (var3.kind() == CrystalAura.r4eWPTHdRnFpO9mj.CRYSTAL) {
                                       this.f_16845.putIfAbsent(var3.pos(), f_11537.player.tickCount);
                                    } else {
                                       this.f_16846.putIfAbsent(var3.pos(), f_11537.player.tickCount);
                                    }
                                 } else {
                                    this.f_16844.put(var3.pos(), f_11537.player.tickCount + 12);
                                    if (this.f_16833.m_8768()) {
                                       this.m_5812(var3.pos().toShortString() + "");
                                    }
                                 }
                              } finally {
                                 if (var3.kind() != CrystalAura.r4eWPTHdRnFpO9mj.CRYSTAL || !this.f_16829.m_8768()) {
                                    this.f_16837.m_811();
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void m_5789(Class_CWDgYIJS0DdP16bO var1) {
      if (!this.m_5787() && this.f_16840 != null && var1.m_2417() > 0) {
         var1.m_2418(true);
      }
   }

   private List<Player> m_5792(float var1) {
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

   private boolean m_5793(EndCrystal var1) {
      if (var1 != null && var1.isAlive()) {
         this.m_5798();
         return this.m_5810(CrystalAura.r4eWPTHdRnFpO9mj.ATTACK, var1.blockPosition(), null, var1);
      } else {
         return false;
      }
   }

   private void m_5794() {
      this.f_16836.m_1811(this);
   }

   private void m_5795(BlockPos var1, boolean var2) {
      if (this.f_16832.m_8768()) {
         this.f_16852.add(new Class_EKJCmS6xh0Ri3UKL(var1, var2, System.currentTimeMillis()));
      }
   }

   private void m_5796(Class_jfpiTZhNIuwDwqKr var1) {
      this.f_16851 = -1;
      if (!DimasikClient.m_9057().m_9049().m_2801().m_3527().m_8895()) {
         if (this.f_16850 != null && f_11537.player != null && f_11537.level != null && !f_11537.player.isUsingItem()) {
            AutoWebTrap var2 = DimasikClient.m_9057().m_9049().m_2801().m_3510();
            if (var2 != null && var2.m_8613()) {
               this.m_5799();
            } else if (!var1.m_1581() && this.f_16836.m_1804(this)) {
               Vec3 var3 = var1.m_7399().add(0.0, f_11537.player.getEyeHeight(), 0.0);
               CrystalAura.vn5L5yLVImPs8Zmg var4 = this.f_16850;
               Vec3 var5;
               if (var4.kind() == CrystalAura.r4eWPTHdRnFpO9mj.ATTACK) {
                  var5 = Class_izMBLqd5r0wrVpYz.m_7345(var4.crystal(), var3, this.f_16822.m_8768().floatValue());
               } else {
                  Class_BYfjHaSHGXpfcI6Q var6 = switch (var4.kind()) {
                     case OBSIDIAN -> Class_TT9n584oSK6xnBdz.m_4991(var4.pos(), var3, this.f_16821.m_8768().floatValue(), false);
                     case CRYSTAL -> Class_TT9n584oSK6xnBdz.m_4985(var4.pos(), var3, this.f_16821.m_8768().floatValue());
                     default -> Class_TT9n584oSK6xnBdz.m_4992(var4.pos(), var3, this.f_16821.m_8768().floatValue());
                  };
                  var5 = var6 == null ? null : var6.hitVec();
                  this.f_16850 = new CrystalAura.vn5L5yLVImPs8Zmg(var4.kind(), var4.pos(), var6, var4.crystal(), var4.tick());
               }

               if (var5 == null) {
                  this.f_16850 = null;
                  this.m_5798();
                  this.f_16837.m_811();
                  this.m_5794();
               } else {
                  this.f_16851 = f_11537.player.tickCount;
               }
            }
         }
      }
   }

   private void m_5797() {
      int var1 = f_11537.player.tickCount;
      this.f_16843.values().removeIf(var1x -> var1 >= var1x);
      this.f_16844.values().removeIf(var1x -> var1 >= var1x);
   }

   private void m_5798() {
      if (this.f_16840 != null) {
         if (f_11537.gameMode != null && f_11537.gameMode.isDestroying()) {
            f_11537.gameMode.stopDestroyBlock();
         }

         if (this.f_16850 != null && this.f_16850.kind() == CrystalAura.r4eWPTHdRnFpO9mj.DIG) {
            this.f_16850 = null;
         }

         this.f_16840 = null;
         this.f_16837.m_811();
      }
   }

   private void m_5799() {
      this.f_16851 = -1;
      this.f_16850 = null;
      this.m_5798();
      this.f_16837.m_811();
      this.m_5794();
   }

   private void m_5800() {
      int var1 = f_11537.player.tickCount;
      Iterator var2 = this.f_16846.entrySet().iterator();

      while (var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         BlockPos var4 = (BlockPos)var3.getKey();
         int var5 = var1 - (Integer)var3.getValue();
         if (!Class_TT9n584oSK6xnBdz.m_4995(var4) && f_11537.level.getBlockState(var4).is(Blocks.OBSIDIAN)) {
            this.f_16847 = var4;
            this.f_16848 = var1;
            this.m_5795(var4, false);
            var2.remove();
         } else if (var5 > Class_TT9n584oSK6xnBdz.m_4990() || var5 >= 2 && !Class_TT9n584oSK6xnBdz.m_4995(var4)) {
            this.f_16844.put(var4, var1 + 4);
            if (this.f_16833.m_8768()) {
               this.m_5812(var4.toShortString() + "");
            }

            var2.remove();
         }
      }

      Iterator var6 = this.f_16845.entrySet().iterator();

      while (var6.hasNext()) {
         Entry var7 = (Entry)var6.next();
         BlockPos var8 = (BlockPos)var7.getKey();
         if (this.m_5802(var8.above()) != null) {
            this.m_5795(var8.above(), true);
            var6.remove();
         } else if (var1 - (Integer)var7.getValue() > Class_TT9n584oSK6xnBdz.m_4990()) {
            this.f_16844.put(var8, var1 + 4);
            if (this.f_16833.m_8768()) {
               this.m_5812(var8.above().toShortString() + "");
            }

            var6.remove();
         }
      }
   }

   private boolean m_5801(Vec3 var1) {
      if (this.f_16840 == null) {
         return false;
      }

      BlockPos var2 = this.f_16840;
      BlockState var3 = f_11537.level.getBlockState(var2);
      if (!var3.isAir() && !var3.canBeReplaced()) {
         if (this.f_16831.m_8768()
            && Class_izMBLqd5r0wrVpYz.m_7337(var3)
            && !(Class_izMBLqd5r0wrVpYz.m_7340(var1, var2) > Math.pow(Class_TT9n584oSK6xnBdz.m_4989(this.f_16821.m_8768().floatValue()), f_16930))
            && f_11537.player.tickCount - this.f_16842 <= Math.max(10, this.f_16828.m_8768() ? 16 : 10)) {
            this.m_5811(var2);
            return this.f_16840 != null;
         } else {
            this.f_16843.put(var2, f_11537.player.tickCount + 40);
            this.m_5798();
            return false;
         }
      } else {
         this.m_5798();
         return false;
      }
   }

   private EndCrystal m_5802(BlockPos var1) {
      AABB var2 = new AABB(var1.getX(), var1.getY(), var1.getZ(), var1.getX() + 1, var1.getY() + 2, var1.getZ() + 1);
      List var3 = f_11537.level.getEntitiesOfClass(EndCrystal.class, var2, var1x -> var1x.isAlive() && var1x.blockPosition().equals(var1));
      return var3.isEmpty() ? null : (EndCrystal)var3.getFirst();
   }

   private void m_5804(Class_Xu9btcIeUN33XnMK var1) {
      if (this.f_16838 != f_11537.level || f_11537.player != null && f_11537.player.tickCount < this.f_16839) {
         this.m_5818();
         this.f_16838 = f_11537.level;
      }

      if (f_11537.player != null && f_11537.level != null && f_11537.gameMode != null && !f_11537.player.isSpectator()) {
         this.f_16839 = f_11537.player.tickCount;
         if (!DimasikClient.m_9057().m_9049().m_2801().m_3527().m_8895()) {
            AutoWebTrap var2 = DimasikClient.m_9057().m_9049().m_2801().m_3510();
            Player var3 = var2 != null && var2.m_776() ? var2.m_8614() : null;
            if (var2 != null && var2.m_8613()) {
               this.m_5799();
            } else {
               this.m_5797();
               Class_izMBLqd5r0wrVpYz.f_24648 = this.f_16833.m_8768();
               List var4 = var3 != null ? List.of(var3) : this.m_5792(this.f_16820.m_8768());
               if (!var4.isEmpty() && !f_11537.player.isUsingItem()) {
                  this.m_5800();
                  if (this.f_16850 != null) {
                     if (f_11537.player.tickCount - this.f_16850.tick() <= Class_TT9n584oSK6xnBdz.m_4990()) {
                        this.m_5807();
                        return;
                     }

                     this.m_5805(f_16898);
                  }

                  Vec3 var5 = f_11537.player.getEyePosition();
                  if (this.f_16825.m_8768() > 0.0F && !this.f_16835.m_4464(this.f_16825.m_8768().longValue())) {
                     this.m_5801(var5);
                  } else {
                     float var6 = this.m_5813();
                     List var7 = this.m_5778(this.f_16820.m_8768() + f_16899);
                     Class_Pz8IezfODFKid4ag var8 = Class_izMBLqd5r0wrVpYz.m_7328(
                        var4, var5, this.f_16822.m_8768(), this.f_16824.m_8768(), this.f_16823.m_8768(), var6, var7
                     );
                     if (var8 == null || !this.m_5793(var8.crystal())) {
                        if (!this.m_5816(var4)) {
                           boolean var9 = this.m_5782(Items.END_CRYSTAL) >= 0;
                           boolean var10 = this.f_16827.m_8768() && this.m_5782(Items.OBSIDIAN) >= 0;
                           List var11 = this.m_5817(var4);
                           float var12 = (float)Class_TT9n584oSK6xnBdz.m_4989(this.f_16821.m_8768().floatValue());
                           float var13 = this.f_16822.m_8768();
                           BlockPos var14 = this.f_16849 != null
                              ? this.f_16849
                              : (this.f_16847 != null && f_11537.player.tickCount - this.f_16848 <= 80 ? this.f_16847 : null);
                           ArrayList var15 = new ArrayList<>(this.f_16843.keySet());
                           var15.addAll(this.f_16844.keySet());
                           var15.addAll(this.f_16845.keySet());
                           Class_r4AHZOK7QWNZveVe var16 = var9
                              ? Class_izMBLqd5r0wrVpYz.m_7329(
                                 var11, var5, var12, var13, this.f_16824.m_8768(), this.f_16823.m_8768(), var10, false, var6, var7, null, 0.0F, var14, var15
                              )
                              : null;
                           if (var16 != null) {
                              this.m_5798();
                              this.f_16849 = var16.pos();
                              if (var16.needsObsidian()) {
                                 this.m_5809(var16.pos(), Items.OBSIDIAN);
                              } else {
                                 this.m_5784(var16.pos());
                              }
                           } else if (!this.f_16845.isEmpty()) {
                              this.m_5798();
                              this.f_16837.m_811();
                              this.m_5794();
                           } else {
                              if (!this.f_16831.m_8768() || !var9) {
                                 this.m_5798();
                              }

                              if (!this.m_5801(var5)) {
                                 var16 = var9 && this.f_16831.m_8768()
                                    ? Class_izMBLqd5r0wrVpYz.m_7329(
                                       var11,
                                       var5,
                                       var12,
                                       var13,
                                       this.f_16824.m_8768(),
                                       this.f_16823.m_8768(),
                                       var10,
                                       true,
                                       var6,
                                       var7,
                                       null,
                                       0.0F,
                                       var14,
                                       var15
                                    )
                                    : null;
                                 if (this.f_16833.m_8768()) {
                                    this.m_5812(Class_izMBLqd5r0wrVpYz.f_24649);
                                 }

                                 if (var16 == null) {
                                    this.f_16837.m_811();
                                    this.m_5794();
                                 } else {
                                    this.f_16849 = var16.pos();
                                    if (var16.digPos() != null) {
                                       this.m_5811(var16.digPos());
                                    } else if (var16.needsObsidian()) {
                                       this.m_5809(var16.pos(), Items.OBSIDIAN);
                                    } else {
                                       this.m_5784(var16.pos());
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               } else {
                  this.m_5799();
                  this.f_16849 = null;
               }
            }
         }
      } else {
         this.m_5818();
      }
   }

   private void m_5805(String var1) {
      if (this.f_16850 != null) {
         if (this.f_16833.m_8768()) {
            this.m_5812(var1 + this.f_16850.pos().toShortString());
         }

         if (this.f_16850.kind() == CrystalAura.r4eWPTHdRnFpO9mj.DIG) {
            this.f_16843.put(this.f_16850.pos(), f_11537.player.tickCount + 40);
            this.m_5798();
         } else if (this.f_16850.kind() != CrystalAura.r4eWPTHdRnFpO9mj.ATTACK) {
            this.f_16844.put(this.f_16850.pos(), f_11537.player.tickCount + 12);
         }

         this.f_16850 = null;
         this.f_16837.m_811();
         this.m_5794();
      }
   }

   private void m_5807() {
      if (this.f_16850 != null) {
         Vec3 var1 = this.f_16850.kind() == CrystalAura.r4eWPTHdRnFpO9mj.ATTACK
            ? Class_izMBLqd5r0wrVpYz.m_7345(this.f_16850.crystal(), f_11537.player.getEyePosition(), this.f_16822.m_8768().floatValue())
            : this.f_16850.hit().hitVec();
         if (var1 == null) {
            this.m_5805(f_16923);
         } else if (!this.f_16836.m_1810(this, var1) && !this.f_16836.m_1804(this)) {
            this.f_16837.m_811();
         } else {
            if (this.m_5787()) {
               int var2 = this.m_5783(this.f_16850);
               if (var2 >= 0) {
                  this.f_16837.m_812(var2, true);
               }
            }
         }
      }
   }

   private void m_5808(BlockPos var1, BlockHitResult var2) {
      boolean var3 = f_11537.gameMode.continueDestroyBlock(var1, var2.getDirection());
      if (var3) {
         f_11537.player.swing(InteractionHand.MAIN_HAND);
      }

      float var4 = Mth.clamp(((MultiPlayerGameModeMixin)f_11537.gameMode).getCurrentBreakingProgress(), 0.0F, 1.0F);
      if (var4 > this.f_16841 + f_16929) {
         this.f_16841 = var4;
         this.f_16842 = f_11537.player.tickCount;
      }

      if (this.f_16832.m_8768()) {
         this.f_16853 = var1;
         this.f_16854 = var4;
         this.f_16855 = System.currentTimeMillis();
      }

      if (this.f_16833.m_8768()) {
         this.m_5812(var1.toShortString() + var4);
      }
   }

   private boolean m_5809(BlockPos var1, Item var2) {
      Class_BYfjHaSHGXpfcI6Q var3 = Class_TT9n584oSK6xnBdz.m_4991(var1, f_11537.player.getEyePosition(), this.f_16821.m_8768().floatValue(), false);
      return this.m_5810(CrystalAura.r4eWPTHdRnFpO9mj.OBSIDIAN, var1, var3, null);
   }

   public CrystalAura() {
      super(f_16861, f_16862, Category.COMBAT);
      this.f_16820 = new SliderSetting(f_16863, f_16864, f_16865, f_16866).m_828(f_16867);
      this.f_16821 = new SliderSetting(f_16868, f_16869, f_16870, f_16871).m_828(f_16872);
      this.f_16822 = new SliderSetting(f_16873, f_16874, 1.0F, f_16875).m_828(f_16876);
      this.f_16823 = new SliderSetting(f_16877, f_16878, 1.0F, f_16879).m_828(f_16880);
      this.f_16824 = new SliderSetting(f_16881, f_16882, 0.0F, f_16883).m_828(f_16884);
      this.f_16825 = new SliderSetting(f_16885, 0.0F, 0.0F, f_16886).m_828(f_16887).m_815(Class_dJj2SGO1fl9bUExQ.INTEGER);
      this.f_16826 = new SliderSetting(f_16888, 2.0F, 0.0F, f_16889).m_828(1.0F).m_815(Class_dJj2SGO1fl9bUExQ.INTEGER);
      this.f_16827 = new CheckboxSetting(f_16890, true);
      this.f_16828 = new CheckboxSetting(f_16891, false);
      this.f_16829 = new CheckboxSetting(f_16892, false);
      this.f_16830 = new CheckboxSetting(f_16893, true);
      this.f_16831 = new CheckboxSetting(f_16894, true);
      this.f_16832 = new CheckboxSetting(f_16895, true);
      this.f_16833 = new CheckboxSetting(f_16896, false);
      this.f_16834 = new CheckboxSetting(f_16897, false);
      this.f_16835 = new Class_QmNR03reugBgWiPr();
      this.f_16836 = Class_8eBbS8V7lQU0fpQj.m_1803();
      this.f_16837 = new Class_0s5WQhNSSkdI2aVQ();
      this.f_16839 = -1;
      this.f_16843 = new HashMap<>();
      this.f_16844 = new HashMap<>();
      this.f_16845 = new HashMap<>();
      this.f_16846 = new HashMap<>();
      this.f_16851 = -1;
      this.f_16852 = new ArrayList<>();
      this.f_16856 = this::m_5804;
      this.f_16857 = new Class_gEPk7yDw6CwIte87<Class_jfpiTZhNIuwDwqKr>() {
         public void m_1781(Class_jfpiTZhNIuwDwqKr var1) {
            CrystalAura.this.m_5796(var1);
         }

         @Override
         public int m_1780() {
            return -90;
         }
      };
      this.f_16858 = this::m_5788;
      this.f_16859 = this::m_5780;
      this.f_16860 = this::m_5789;
      this.m_795(
         this.f_16820,
         this.f_16821,
         this.f_16822,
         this.f_16823,
         this.f_16824,
         this.f_16825,
         this.f_16826,
         this.f_16827,
         this.f_16829,
         this.f_16828,
         this.f_16830,
         this.f_16831,
         this.f_16832,
         this.f_16833,
         this.f_16834
      );
   }

   private boolean m_5810(CrystalAura.r4eWPTHdRnFpO9mj var1, BlockPos var2, Class_BYfjHaSHGXpfcI6Q var3, EndCrystal var4) {
      if (var1 != CrystalAura.r4eWPTHdRnFpO9mj.ATTACK && var3 == null) {
         this.f_16844.put(var2.immutable(), f_11537.player.tickCount + 6);
         if (this.f_16833.m_8768()) {
            this.m_5812(var2.toShortString() + "");
         }

         return false;
      } else {
         this.f_16850 = new CrystalAura.vn5L5yLVImPs8Zmg(var1, var2.immutable(), var3, var4, f_11537.player.tickCount);
         this.m_5807();
         return true;
      }
   }

   private void m_5811(BlockPos var1) {
      if (!this.f_16843.containsKey(var1) && Class_izMBLqd5r0wrVpYz.m_7337(f_11537.level.getBlockState(var1))) {
         Class_BYfjHaSHGXpfcI6Q var2 = Class_TT9n584oSK6xnBdz.m_4992(var1, f_11537.player.getEyePosition(), this.f_16821.m_8768().floatValue());
         if (var2 == null) {
            this.f_16843.put(var1.immutable(), f_11537.player.tickCount + 10);
            this.m_5798();
         } else {
            if (!var1.equals(this.f_16840)) {
               this.m_5798();
               this.f_16840 = var1.immutable();
               this.f_16842 = f_11537.player.tickCount;
               this.f_16841 = 0.0F;
            }

            this.m_5810(CrystalAura.r4eWPTHdRnFpO9mj.DIG, var1, var2, null);
         }
      } else {
         this.m_5798();
      }
   }

   private void m_5812(String var1) {
      System.out.println(var1 + "");
   }

   private float m_5813() {
      return this.f_16830.m_8768() ? Math.max(0.0F, f_11537.player.getHealth() + f_11537.player.getAbsorptionAmount() - 1.0F) : f_16900;
   }

   private boolean m_5814(AABB var1) {
      int var2 = Mth.floor(var1.minX);
      int var3 = Mth.floor(var1.minY);
      int var4 = Mth.floor(var1.minZ);
      int var5 = Mth.floor(var1.maxX);
      int var6 = Mth.floor(var1.maxY);
      int var7 = Mth.floor(var1.maxZ);

      for (BlockPos var9 : BlockPos.betweenClosed(var2, var3, var4, var5, var6, var7)) {
         if (f_11537.level.getBlockState(var9).is(Blocks.COBWEB)) {
            return true;
         }
      }

      return false;
   }

   private AABB m_5815(BlockPos var1, float var2) {
      double var3 = var1.getX() + f_16913;
      double var5 = var1.getY() + f_16914;
      double var7 = var1.getZ() + f_16915;
      double var9 = f_16916 * Mth.clamp(var2, f_16917, 1.0F);
      return new AABB(var3 - var9, var5 - var9, var7 - var9, var3 + var9, var5 + var9, var7 + var9);
   }

   private boolean m_5816(List<Player> var1) {
      if (!this.f_16834.m_8768()) {
         return false;
      }

      if (this.m_5782(Items.OBSIDIAN) == -1) {
         return false;
      }

      Player var2 = null;
      double var3 = f_16921;

      for (Player var6 : var1) {
         double var7 = f_11537.player.distanceToSqr(var6);
         if (var7 < var3) {
            var3 = var7;
            var2 = var6;
         }
      }

      if (var2 == null) {
         return false;
      }

      double var11 = var2.getX() - f_11537.player.getX();
      double var12 = var2.getZ() - f_11537.player.getZ();
      if (Math.sqrt(var11 * var11 + var12 * var12) > this.f_16821.m_8768().floatValue() + f_16922) {
         return false;
      }

      if (Math.abs(var2.getY() - f_11537.player.getY()) > 1.0) {
         return false;
      }

      Direction var9 = Math.abs(var11) > Math.abs(var12) ? (var11 > 0.0 ? Direction.EAST : Direction.WEST) : (var12 > 0.0 ? Direction.SOUTH : Direction.NORTH);
      BlockPos var10 = f_11537.player.blockPosition().relative(var9);
      if (!f_11537.level.getBlockState(var10).canBeReplaced()) {
         return false;
      }

      if (Class_izMBLqd5r0wrVpYz.m_7343(var10)) {
         return false;
      }

      this.m_5786();
      return this.m_5809(var10, Items.OBSIDIAN);
   }

   private List<Class_KnZ6JjkNfseuDLb0> m_5817(List<Player> var1) {
      int var2 = this.f_16826.m_8768().intValue();
      ArrayList<Player> var3 = new ArrayList<>(var1);
      var3.sort(Comparator.comparingDouble(var0 -> Class_izMBLqd5r0wrVpYz.m_7339(f_11537.player.getEyePosition(), var0.getBoundingBox())));
      ArrayList var4 = new ArrayList();
      int var5 = Math.min(var3.size(), 6);

      for (int var6 = 0; var6 < var5; var6++) {
         Player var7 = (Player)var3.get(var6);
         AABB var8 = var7.getBoundingBox();
         if (var2 > 0 && !this.m_5814(var8)) {
            AABB var9 = Class_sS4M8u1p9l0dNe0C.m_8706(var7, var2);
            if (var9 != null && var9.getXsize() >= f_16918 && var9.getYsize() >= f_16919 && var9.getZsize() >= f_16920) {
               var8 = var9;
            }
         }

         var4.add(new Class_KnZ6JjkNfseuDLb0(var7, var8));
      }

      return var4;
   }

   private void m_5818() {
      this.f_16851 = -1;
      this.f_16850 = null;
      this.m_5798();
      this.f_16837.m_811();
      this.m_5794();
      this.f_16846.clear();
      this.f_16845.clear();
      this.f_16847 = null;
      this.f_16849 = null;
      this.f_16843.clear();
      this.f_16844.clear();
      this.f_16852.clear();
      this.f_16853 = null;
   }

   private enum r4eWPTHdRnFpO9mj {
      OBSIDIAN,
      CRYSTAL,
      ATTACK,
      DIG;
   }

   private record vn5L5yLVImPs8Zmg(CrystalAura.r4eWPTHdRnFpO9mj kind, BlockPos pos, Class_BYfjHaSHGXpfcI6Q hit, EndCrystal crystal, int tick) {
   }
}
