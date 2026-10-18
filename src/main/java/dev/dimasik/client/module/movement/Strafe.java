package dev.dimasik.client.module.movement;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.module.combat.Aura;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_QBKwWNWLlChWViO9;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_ZPRMV6aCWVosHRWh;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_jfpiTZhNIuwDwqKr;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Strafe extends Module {
   private final MultiChoiceSetting f_4792;
   private final MultiChoiceSetting f_4793;
   private final SliderSetting f_4794;
   private final CheckboxSetting f_4795;
   private final CheckboxSetting f_4796;
   private final CheckboxSetting f_4797;
   private final SliderSetting f_4798;
   private final CheckboxSetting f_4799;
   private final SliderSetting f_4800;
   private final CheckboxSetting f_4801;
   private final SliderSetting f_4802;
   private final CheckboxSetting f_4803;
   private final SliderSetting f_4804;
   private boolean f_4805;
   private long f_4806;
   private boolean f_4807;
   private final Class_gEPk7yDw6CwIte87<Class_jfpiTZhNIuwDwqKr> f_4808;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_4809;
   private static final String f_4810 = "Strafe";
   private static final String f_4811 = "Быстрое перемещение";
   private static final String f_4812 = "Тип";
   private static final String f_4813 = "MetaHvH";
   private static final String f_4814 = "Meta Strafe";
   private static final String f_4815 = "Режим";
   private static final String f_4816 = "Smart";
   private static final String f_4817 = "Custom";
   private static final String f_4818 = "Скорость";
   private static final float f_4819 = 0.8F;
   private static final float f_4820 = 0.3F;
   private static final float f_4821 = 1.5F;
   private static final float f_4822 = 0.01F;
   private static final String f_4823 = "Притягивание";
   private static final String f_4824 = "Ускорение таймера";
   private static final String f_4825 = "Буст с дамагом";
   private static final String f_4826 = "Сила буста";
   private static final float f_4827 = 0.01F;
   private static final String f_4828 = "Буст от энтити";
   private static final String f_4829 = "Сила энтити";
   private static final float f_4830 = 0.5F;
   private static final float f_4831 = 0.1F;
   private static final float f_4832 = 0.01F;
   private static final String f_4833 = "Предикт цели";
   private static final String f_4834 = "Дистанция предикта";
   private static final float f_4835 = 6.0F;
   private static final float f_4836 = 0.1F;
   private static final String f_4837 = "Буст прыжка";
   private static final String f_4838 = "Сила прыжка";
   private static final float f_4839 = 1.5F;
   private static final float f_4840 = 1.5F;
   private static final float f_4841 = 0.05F;
   private static final String f_4842 = "MetaHvH";
   private static final float f_4843 = 0.19F;
   private static final float f_4844 = 0.25F;
   private static final float f_4845 = 0.37F;
   private static final float f_4846 = 0.46F;
   private static final float f_4847 = 0.7F;
   private static final float f_4848 = 0.75F;
   private static final float f_4849 = 0.05F;
   private static final float f_4850 = 0.1F;
   private static final String f_4851 = "Meta Strafe";
   private static final String f_4852 = "Smart";
   private static final String f_4853 = "Custom";
   private static final float f_4854 = 0.2245F;
   private static final float f_4855 = 0.0055F;
   private static final double f_4856 = 0.004999F;
   private static final float f_4857 = 1.03F;
   private static final double f_4858 = 0.1;
   private static final double f_4859 = 0.08;
   private static final float f_4860 = 0.2245F;
   private static final long f_4861 = 50L;
   private static final float f_4862 = 0.365F;
   private static final float f_4863 = 1.65F;
   private static final float f_4864 = 1.41F;
   private static final float f_4865 = 1.21F;
   private static final float f_4866 = 0.66F;
   private static final String f_4867 = "Шар CHAMPION";
   private static final float f_4868 = 1.05F;
   private static final String f_4869 = "Шар KING";
   private static final float f_4870 = 1.1F;
   private static final String f_4871 = "Шар GOD";
   private static final float f_4872 = 1.15F;
   private static final String f_4873 = "Шар YT";
   private static final String f_4874 = "Шар HELPER";
   private static final String f_4875 = "Шар Скорости";
   private static final float f_4876 = 1.2F;
   private static final String f_4877 = "Шлем GLADIATOR";
   private static final String f_4878 = "Шлем Мага";
   private static final float f_4879 = 1.15F;
   private static final float f_4880 = -45.0F;
   private static final float f_4881 = 45.0F;
   private static final float f_4882 = 45.0F;
   private static final float f_4883 = -45.0F;
   private static final float f_4884 = -1.0F;
   private static final float f_4885 = 90.0F;
   private static final float f_4886 = -45.0F;
   private static final float f_4887 = 45.0F;
   private static final float f_4888 = 45.0F;
   private static final float f_4889 = -45.0F;
   private static final float f_4890 = -1.0F;
   private static final float f_4891 = 90.0F;
   private static final double f_4892 = 2.0;
   private static final double f_4893 = 0.199;
   private static final double f_4894 = 0.199;
   private static final float f_4895 = 90.0F;
   private static final double f_4896 = 0.3;
   private static final double f_4897 = 0.3;
   private static final double f_4898 = 0.3;
   private static final double f_4899 = 0.3;
   private static final double f_4900 = 0.3;
   private static final double f_4901 = 0.1;
   private static final double f_4902 = 0.3;
   private static final double f_4903 = 0.3;
   private static final double f_4904 = 1.1;
   private static final double f_4905 = 0.3;
   private static final String f_4906 = "Meta Strafe";
   private static final String f_4907 = "Meta Strafe";
   private static final String f_4908 = "Meta Strafe";
   private static final String f_4909 = "Meta Strafe";
   private static final String f_4910 = "Meta Strafe";
   private static final String f_4911 = "Meta Strafe";
   private static final String f_4912 = "Meta Strafe";
   private static final String f_4913 = "Meta Strafe";
   private static final String f_4914 = "Meta Strafe";
   private static final String f_4915 = "Meta Strafe";
   private static final String f_4916 = "Meta Strafe";
   private static final String f_4917 = "Custom";
   private static final String f_4918 = "Meta Strafe";

   @Override
   public void m_732() {
      Class_ZPRMV6aCWVosHRWh.m_5820(1.0F);
      this.f_4805 = false;
      this.f_4806 = 0L;
      this.f_4807 = true;
      super.m_732();
   }

   private double[] m_1992(double var1) {
      Vec2 var3 = f_11537.player.input.getMoveVector();
      float var4 = var3.y;
      float var5 = var3.x;
      float var6 = this.m_1999();
      if (var4 != 0.0F) {
         if (var5 > 0.0F) {
            var6 += var4 > 0.0F ? f_4886 : f_4887;
         } else if (var5 < 0.0F) {
            var6 += var4 > 0.0F ? f_4888 : f_4889;
         }

         var5 = 0.0F;
         if (var4 > 0.0F) {
            var4 = 1.0F;
         } else if (var4 < 0.0F) {
            var4 = f_4890;
         }
      }

      double var7 = Math.toRadians(var6 + f_4891);
      double var9 = Math.sin(var7);
      double var11 = Math.cos(var7);
      return new double[]{var4 * var1 * var11 + var5 * var1 * var9, var4 * var1 * var9 - var5 * var1 * var11};
   }

   private float m_1999() {
      Aura var1 = this.m_2013();
      return this.f_4801.m_8768() && var1 != null && var1.m_776() && var1.m_1114() != null ? this.m_2003(var1.m_1114()) : f_11537.player.getYRot();
   }

   private void m_2000(Class_Xu9btcIeUN33XnMK var1) {
      if (this.f_4792.m_7568(f_4851) && f_11537.player != null && f_11537.level != null) {
         if (this.f_4793.m_7568(f_4852)) {
            this.m_2009();
         }

         if (this.f_4793.m_7568(f_4853)) {
            if (!Class_QBKwWNWLlChWViO9.m_4256() || f_11537.player.isInWater() || f_11537.player.isFallFlying()) {
               this.f_4805 = f_11537.player.onGround();
               this.f_4806 = 0L;
               this.f_4807 = true;
               if (this.f_4796.m_8768()) {
                  Class_ZPRMV6aCWVosHRWh.m_5820(1.0F);
               }

               return;
            }

            float var2 = this.f_4794.m_8768() - f_4854;
            float var3 = this.f_4794.m_8768() - f_4855;
            this.m_2004(var2, var3);
         }

         LivingEntity var8 = this.m_2006();
         if (!f_11537.player.horizontalCollision
            && !this.m_2011()
            && f_11537.player.getEffect(MobEffects.SLOWNESS) == null
            && this.f_4795.m_8768()
            && var8 == null
            && !this.m_2010()) {
            Vec3 var9 = f_11537.player.getDeltaMovement();
            f_11537.player.setDeltaMovement(var9.x, var9.y - f_4856, var9.z);
         }

         if (f_11537.player.getDeltaMovement().y < 0.0 && this.f_4796.m_8768() && var8 == null && !this.m_2010()) {
            Class_ZPRMV6aCWVosHRWh.m_5820(f_4857);
         } else if (this.f_4796.m_8768()) {
            Class_ZPRMV6aCWVosHRWh.m_5820(1.0F);
         }

         if (this.f_4799.m_8768() && !this.m_2010()) {
            AABB var10 = f_11537.player.getBoundingBox().inflate(f_4858);
            boolean var4 = false;

            for (Entity var6 : f_11537.level.entitiesForRendering()) {
               if (var6 != f_11537.player
                  && !(var6 instanceof ArmorStand)
                  && (var6 instanceof LivingEntity || var6 instanceof Boat)
                  && var10.intersects(var6.getBoundingBox())) {
                  var4 = true;
                  break;
               }
            }

            double[] var11 = this.m_1992(f_4859 * (var4 ? 1 : 0));
            double var12 = this.f_4800.m_8768().floatValue();
            f_11537.player.push(var11[0] * var12, 0.0, var11[1] * var12);
         }
      }
   }

   public Strafe() {
      super(f_4810, f_4811, Category.MOVEMENT);
      this.f_4792 = new MultiChoiceSetting(f_4812, new Class_2ZaVm8TGDJ68TnJB(f_4813), new Class_2ZaVm8TGDJ68TnJB(f_4814));
      this.f_4793 = new MultiChoiceSetting(f_4815, new Class_2ZaVm8TGDJ68TnJB(f_4816), new Class_2ZaVm8TGDJ68TnJB(f_4817))
         .m_822(() -> this.f_4792.m_7568(f_4918));
      this.f_4794 = new SliderSetting(f_4818, f_4819, f_4820, f_4821).m_828(f_4822).m_822(() -> this.f_4792.m_7568(f_4916) && this.f_4793.m_7568(f_4917));
      this.f_4795 = new CheckboxSetting(f_4823, false).m_822(() -> this.f_4792.m_7568(f_4915));
      this.f_4796 = new CheckboxSetting(f_4824, false).m_822(() -> this.f_4792.m_7568(f_4914));
      this.f_4797 = new CheckboxSetting(f_4825, false).m_822(() -> this.f_4792.m_7568(f_4913));
      this.f_4798 = new SliderSetting(f_4826, 1.0F, 1.0F, 2.0F).m_828(f_4827).m_822(() -> this.f_4792.m_7568(f_4912) && this.f_4797.m_8768());
      this.f_4799 = new CheckboxSetting(f_4828, false).m_822(() -> this.f_4792.m_7568(f_4911));
      this.f_4800 = new SliderSetting(f_4829, f_4830, f_4831, 1.0F).m_828(f_4832).m_822(() -> this.f_4792.m_7568(f_4910) && this.f_4799.m_8768());
      this.f_4801 = new CheckboxSetting(f_4833, false).m_822(() -> this.f_4792.m_7568(f_4909));
      this.f_4802 = new SliderSetting(f_4834, 1.0F, 1.0F, f_4835).m_828(f_4836).m_822(() -> this.f_4792.m_7568(f_4908) && this.f_4801.m_8768());
      this.f_4803 = new CheckboxSetting(f_4837, true).m_822(() -> this.f_4792.m_7568(f_4907));
      this.f_4804 = new SliderSetting(f_4838, f_4839, 1.0F, f_4840).m_828(f_4841).m_822(() -> this.f_4792.m_7568(f_4906) && this.f_4803.m_8768());
      this.f_4807 = true;
      this.f_4808 = this::m_2007;
      this.f_4809 = this::m_2000;
      this.m_795(
         this.f_4792,
         this.f_4793,
         this.f_4794,
         this.f_4795,
         this.f_4796,
         this.f_4797,
         this.f_4798,
         this.f_4799,
         this.f_4800,
         this.f_4801,
         this.f_4802,
         this.f_4803,
         this.f_4804
      );
   }

   private void m_2002(float var1) {
      Vec2 var2 = f_11537.player.input.getMoveVector();
      float var3 = var2.y;
      float var4 = var2.x;
      float var5 = this.m_1999();
      if (var3 == 0.0F && var4 == 0.0F) {
         f_11537.player.setDeltaMovement(0.0, f_11537.player.getDeltaMovement().y, 0.0);
      } else {
         if (var3 != 0.0F) {
            if (var4 > 0.0F) {
               var5 += var3 > 0.0F ? f_4880 : f_4881;
            } else if (var4 < 0.0F) {
               var5 += var3 > 0.0F ? f_4882 : f_4883;
            }

            var4 = 0.0F;
            var3 = var3 > 0.0F ? 1.0F : f_4884;
         }

         double var6 = Math.toRadians(var5 + f_4885);
         double var8 = var3 * var1 * Math.cos(var6) + var4 * var1 * Math.sin(var6);
         double var10 = var3 * var1 * Math.sin(var6) - var4 * var1 * Math.cos(var6);
         f_11537.player.setDeltaMovement(var8, f_11537.player.getDeltaMovement().y, var10);
      }
   }

   private float m_2003(LivingEntity var1) {
      Vec3 var2 = var1.position();
      double var3 = var2.x - f_11537.player.getX();
      double var5 = var2.y + var1.getEyeHeight(var1.getPose()) / f_4892 - (f_11537.player.getY() + f_11537.player.getEyeHeight(f_11537.player.getPose()));
      double var7 = var2.z - f_11537.player.getZ();
      Vec3 var9 = new Vec3(var3, var5, var7);
      if (!f_11537.player.isFallFlying()) {
         boolean var10 = Class_QBKwWNWLlChWViO9.m_4256();
         boolean var11 = Math.abs(var2.x - var1.xo) > f_4893 || Math.abs(var2.z - var1.zo) > f_4894;
         if (var10 && var11) {
            float var12 = var1.getYRot();
            float var13 = var1.getXRot();
            double var14 = -Math.sin(Math.toRadians(var12)) * Math.cos(Math.toRadians(var13));
            double var16 = -Math.sin(Math.toRadians(var13));
            double var18 = Math.cos(Math.toRadians(var12)) * Math.cos(Math.toRadians(var13));
            var9 = var9.add(new Vec3(var14, var16, var18).scale(this.f_4802.m_8768().floatValue()));
         }
      }

      return (float)Math.toDegrees(Math.atan2(var9.z, var9.x)) - f_4895;
   }

   private void m_2004(float var1, float var2) {
      if (this.f_4797.m_8768() && f_11537.player.hurtTime > 0) {
         float var3 = this.f_4798.m_8768();
         var1 *= var3;
         var2 *= var3;
      }

      boolean var8 = f_11537.player.onGround();
      boolean var4 = f_11537.options.keyJump.isDown();
      long var5 = System.currentTimeMillis();
      if (var8 && var4 && !this.f_4805) {
         if (this.f_4807) {
            this.f_4807 = false;
         } else {
            this.f_4806 = var5 + f_4861;
         }
      }

      if (var8 && !var4) {
         this.f_4807 = true;
      }

      if (this.f_4803.m_8768() && var5 < this.f_4806) {
         float var7 = this.f_4804.m_8768();
         var2 *= var7;
         var1 *= var7;
      }

      if (var4 && !this.m_2010()) {
         this.m_2002(var2);
      }

      if (var8 && !this.m_2010()) {
         this.m_2002(var1);
      }

      this.f_4805 = var8 && var4;
   }

   private LivingEntity m_2006() {
      Aura var1 = this.m_2013();
      return var1 != null && var1.m_776() ? var1.m_1114() : null;
   }

   public void m_2007(Class_jfpiTZhNIuwDwqKr var1) {
      if (f_11537.player != null && this.f_4792.m_7568(f_4842)) {
         if (!f_11537.player.isFallFlying() && (!f_11537.player.isInWater() || !f_11537.player.isSwimming()) && Class_QBKwWNWLlChWViO9.m_4256()) {
            float var2 = f_4843;
            MobEffectInstance var3 = f_11537.player.getEffect(MobEffects.SPEED);
            if (var3 != null) {
               int var4 = var3.getAmplifier();
               switch (var4) {
                  case 0:
                     var2 = f_4844;
                     break;
                  case 1:
                     var2 = f_4845;
                     break;
                  case 2:
                     var2 = f_4846;
                     break;
                  case 3:
                     var2 = f_4847;
                     break;
                  default:
                     var2 = f_4848 + (var4 - 3) * f_4849;
               }
            }

            if (f_11537.options.keyJump.isDown()) {
               var2 += f_4850;
            }

            Class_QBKwWNWLlChWViO9.m_4264(var2);
         }
      }
   }

   private void m_2009() {
      if (Class_QBKwWNWLlChWViO9.m_4256() && !f_11537.player.isInWater() && !f_11537.player.isFallFlying()) {
         MobEffectInstance var1 = f_11537.player.getEffect(MobEffects.SPEED);
         MobEffectInstance var2 = f_11537.player.getEffect(MobEffects.SLOWNESS);
         String var3 = f_11537.player.getOffhandItem().getHoverName().getString();
         ItemStack var4 = f_11537.player.getItemBySlot(EquipmentSlot.HEAD);
         String var5 = var4.getHoverName().getString();
         float var6 = this.m_2012(var1, var2, var3, var5);
         this.m_2004(var6 - f_4860, var6);
      } else {
         this.f_4805 = f_11537.player.onGround();
         this.f_4806 = 0L;
         this.f_4807 = true;
      }
   }

   private boolean m_2010() {
      return f_11537.player.isInWater() || f_11537.player.isInLava() || f_11537.player.isFallFlying();
   }

   private boolean m_2011() {
      if (f_11537.level != null && f_11537.player != null) {
         double var1 = f_11537.player.getX();
         double var3 = f_11537.player.getY();
         double var5 = f_11537.player.getZ();
         double var7 = f_11537.player.getBbHeight();
         AABB var9 = new AABB(var1 - f_4896, var3, var5 - f_4897, var1 + f_4898, var3 + var7, var5 + f_4899);
         AABB var10 = new AABB(var1 - f_4900, var3 + var7 + f_4901, var5 - f_4902, var1 + f_4903, var3 + var7 + f_4904, var5 + f_4905);
         boolean var11 = true;

         for (VoxelShape var13 : f_11537.level.getBlockCollisions(f_11537.player, var9)) {
            if (!var13.isEmpty()) {
               var11 = false;
               break;
            }
         }

         boolean var15 = false;

         for (VoxelShape var14 : f_11537.level.getBlockCollisions(f_11537.player, var10)) {
            if (!var14.isEmpty()) {
               var15 = true;
               break;
            }
         }

         return var11 && var15;
      } else {
         return false;
      }
   }

   private float m_2012(MobEffectInstance var1, MobEffectInstance var2, String var3, String var4) {
      float var5 = f_4862;
      if (var1 != null) {
         int var6 = var1.getAmplifier();
         if (var6 == 2) {
            var5 *= f_4863;
         } else if (var6 == 1) {
            var5 *= f_4864;
         } else if (var6 == 0) {
            var5 *= f_4865;
         }
      }

      if (var2 != null) {
         var5 *= f_4866;
      }

      if (var3 != null) {
         if (var3.contains(f_4867)) {
            var5 *= f_4868;
         }

         if (var3.contains(f_4869)) {
            var5 *= f_4870;
         }

         if (var3.contains(f_4871)) {
            var5 *= f_4872;
         }

         if (var3.contains(f_4873) || var3.contains(f_4874) || var3.contains(f_4875)) {
            var5 *= f_4876;
         }
      }

      if (var4 != null && (var4.contains(f_4877) || var4.contains(f_4878))) {
         var5 *= f_4879;
      }

      return var5;
   }

   private Aura m_2013() {
      return DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null
         ? DimasikClient.m_9057().m_9049().m_2801().m_3576()
         : null;
   }
}
