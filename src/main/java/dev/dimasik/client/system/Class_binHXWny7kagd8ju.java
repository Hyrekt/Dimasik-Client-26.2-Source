package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.render.GhostHit;
import dev.dimasik.client.module.render.Particles;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.WeakHashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelPart.Cube;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.spider.Spider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public final class Class_binHXWny7kagd8ju {
   private static final long f_17747 = 1500L;
   private static final double f_17748 = 0.2;
   private static final double f_17749 = 0.32;
   private static final double f_17750 = 0.12;
   private static final double f_17751 = 0.12;
   private static final Map<Integer, Class_binHXWny7kagd8ju.UKzMo1FYn7RX3Jjr> f_17752 = new HashMap<>();
   private static final Map<UUID, Class_binHXWny7kagd8ju.UKzMo1FYn7RX3Jjr> f_17753 = new HashMap<>();
   private static final Map<Integer, Long> f_17754 = new HashMap<>();
   private static final Map<UUID, Long> f_17755 = new HashMap<>();
   private static final Map<LivingEntityRenderState, Class_binHXWny7kagd8ju.OUU3gnBfRkwUnwJV> f_17756 = new WeakHashMap<>();
   private static final Map<LivingEntityRenderState, Object> f_17757 = new WeakHashMap<>();
   private static final double f_17758 = 0.9375;
   private static final long f_17759 = 31L;
   private static final long f_17760 = 1500L;
   private static final long f_17761 = 1500L;
   private static final double f_17762 = 0.2;
   private static final double f_17763 = 0.32;
   private static final double f_17764 = 0.12;
   private static final double f_17765 = 0.12;
   private static final double f_17766 = 0.12;
   private static final double f_17767 = 0.12;
   private static final double f_17768 = 0.16;
   private static final double f_17769 = 0.73;
   private static final double f_17770 = 0.27;
   private static final double f_17771 = 0.5;
   private static final double f_17772 = 0.8;
   private static final double f_17773 = 0.5;
   private static final double f_17774 = 0.36;
   private static final double f_17775 = 0.39;
   private static final double f_17776 = 0.5;
   private static final double f_17777 = 0.7;
   private static final double f_17778 = 0.35;
   private static final double f_17779 = 0.4;
   private static final double f_17780 = -1.0;
   private static final double f_17781 = 0.48;
   private static final double f_17782 = 0.42;
   private static final double f_17783 = 0.02;
   private static final double f_17784 = 0.36;
   private static final double f_17785 = -1.0;
   private static final double f_17786 = 0.12;
   private static final double f_17787 = 0.2;
   private static final double f_17788 = 0.5;
   private static final double f_17789 = 0.5;
   private static final double f_17790 = 0.72;
   private static final double f_17791 = 0.28;
   private static final double f_17792 = 0.68;
   private static final double f_17793 = 0.32;
   private static final double f_17794 = 0.5;
   private static final double f_17795 = 0.5;
   private static final double f_17796 = 0.62;
   private static final double f_17797 = 0.34;
   private static final double f_17798 = 0.34;
   private static final double f_17799 = 0.5;
   private static final double f_17800 = 0.78;
   private static final double f_17801 = 0.5;
   private static final double f_17802 = 0.78;
   private static final double f_17803 = 0.02;
   private static final double f_17804 = 0.32;
   private static final double f_17805 = -1.0;
   private static final double f_17806 = 0.18;
   private static final double f_17807 = 0.18;
   private static final double f_17808 = -1.0;
   private static final double f_17809 = 0.18;
   private static final double f_17810 = 0.18;
   private static final double f_17811 = 0.5;
   private static final double f_17812 = 0.24;
   private static final double f_17813 = 0.5;
   private static final double f_17814 = 0.58;
   private static final double f_17815 = 0.24;
   private static final double f_17816 = 0.3;
   private static final double f_17817 = 0.22;
   private static final double f_17818 = 0.3;
   private static final double f_17819 = 0.53;
   private static final double f_17820 = 0.5;
   private static final double f_17821 = 0.88;
   private static final double f_17822 = 0.25;
   private static final double f_17823 = 0.35;
   private static final double f_17824 = 0.03;
   private static final double f_17825 = 0.38;
   private static final double f_17826 = -1.0;
   private static final double f_17827 = 0.42;
   private static final double f_17828 = 0.16;
   private static final double f_17829 = 0.22;
   private static final double f_17830 = 0.08;
   private static final double f_17831 = 0.22;
   private static final double f_17832 = 1.5;
   private static final double f_17833 = 0.3;
   private static final double f_17834 = 0.5;
   private static final double f_17835 = 0.18;
   private static final double f_17836 = 0.5;
   private static final double f_17837 = 0.5;
   private static final double f_17838 = 0.5;
   private static final double f_17839 = 1.45;
   private static final double f_17840 = 0.4;
   private static final double f_17841 = 0.3;
   private static final double f_17842 = 0.5;
   private static final double f_17843 = 0.72;
   private static final double f_17844 = 0.68;
   private static final double f_17845 = 0.55;
   private static final double f_17846 = 0.3;
   private static final double f_17847 = 0.48;
   private static final double f_17848 = 0.3;
   private static final double f_17849 = 0.5;
   private static final double f_17850 = 0.66;
   private static final double f_17851 = -1.0;
   private static final double f_17852 = 0.38;
   private static final double f_17853 = 0.33;
   private static final double f_17854 = 0.02;
   private static final double f_17855 = 0.4;
   private static final double f_17856 = -1.0;
   private static final double f_17857 = 0.2;
   private static final double f_17858 = 0.18;
   private static final double f_17859 = 0.5;
   private static final long f_17860 = 1500L;
   private static final long f_17861 = 1500L;

   private static Class_binHXWny7kagd8ju.UKzMo1FYn7RX3Jjr m_6092(LivingEntityRenderState var0, Model var1, double var2) {
      ArrayList var4 = new ArrayList();
      m_6110(var1.root(), new PoseStack(), var4, 1.0);
      return m_6101(var4, var0, var2);
   }

   private static Vec3 m_6093(Random var0, double var1, double var3) {
      double var5 = var0.nextDouble();
      double var7;
      double var9;
      double var11;
      if (var5 < f_17791) {
         var9 = var3 * (f_17792 + var0.nextDouble() * f_17793);
         var7 = (var0.nextDouble() - f_17794) * var1;
         var11 = (var0.nextDouble() - f_17795) * var1;
      } else if (var5 < f_17796) {
         var9 = var3 * (f_17797 + var0.nextDouble() * f_17798);
         var7 = (var0.nextDouble() - f_17799) * var1 * f_17800;
         var11 = (var0.nextDouble() - f_17801) * var1 * f_17802;
      } else {
         var9 = var3 * (f_17803 + var0.nextDouble() * f_17804);
         var7 = (var0.nextBoolean() ? 1.0 : f_17805) * var1 * (f_17806 + var0.nextDouble() * f_17807);
         var11 = (var0.nextBoolean() ? 1.0 : f_17808) * var1 * (f_17809 + var0.nextDouble() * f_17810);
      }

      return new Vec3(var7, var9 - var3 * f_17811, var11);
   }

   private static Vec3 m_6094(Random var0, double var1, double var3) {
      double var5 = var0.nextDouble();
      double var7;
      double var9;
      if (var5 < f_17768) {
         var7 = var3 * (f_17769 + var0.nextDouble() * f_17770);
         var9 = (var0.nextDouble() - f_17771) * var1 * f_17772;
      } else if (var5 < f_17773) {
         var7 = var3 * (f_17774 + var0.nextDouble() * f_17775);
         var9 = (var0.nextDouble() - f_17776) * var1;
      } else if (var5 < f_17777) {
         var7 = var3 * (f_17778 + var0.nextDouble() * f_17779);
         var9 = (var0.nextBoolean() ? 1.0 : f_17780) * var1 * (f_17781 + var0.nextDouble() * f_17782);
      } else {
         var7 = var3 * (f_17783 + var0.nextDouble() * f_17784);
         var9 = (var0.nextBoolean() ? 1.0 : f_17785) * var1 * (f_17786 + var0.nextDouble() * f_17787);
      }

      return new Vec3(var9, var7 - var3 * f_17788, (var0.nextDouble() - f_17789) * var1 * f_17790);
   }

   public static void m_6095(LivingEntityRenderState var0, Object var1) {
      if (m_6108() && var0 != null && var1 instanceof Model && f_17756.containsKey(var0)) {
         f_17757.putIfAbsent(var0, var1);
      }
   }

   public static void m_6096() {
      long var0 = System.currentTimeMillis();
      f_17752.entrySet().removeIf(var2 -> var0 - var2.getValue().capturedAt > f_17861);
      f_17753.entrySet().removeIf(var2 -> var0 - var2.getValue().capturedAt > f_17860);
      f_17754.keySet().retainAll(f_17752.keySet());
      f_17755.keySet().retainAll(f_17753.keySet());
   }

   private static Class_binHXWny7kagd8ju.UKzMo1FYn7RX3Jjr m_6097(HumanoidRenderState var0, HumanoidModel<?> var1, double var2) {
      ArrayList var4 = new ArrayList();
      m_6107(var1.head, var4, f_17762);
      m_6107(var1.body, var4, f_17763);
      m_6107(var1.rightArm, var4, f_17764);
      m_6107(var1.leftArm, var4, f_17765);
      m_6107(var1.rightLeg, var4, f_17766);
      m_6107(var1.leftLeg, var4, f_17767);
      return m_6101(var4, var0, var2);
   }

   private static Vec3 m_6098(Random var0, double var1, double var3, Class_binHXWny7kagd8ju.Class_8Y0ZwGmiCyr4GuyB var5) {
      return switch (var5) {
         case HUMANOID -> m_6094(var0, var1, var3);
         case CREEPER -> m_6093(var0, var1, var3);
         case SPIDER -> m_6106(var0, var1, var3);
         case QUADRUPED -> m_6115(var0, var1, var3);
      };
   }

   public static void m_6099(AvatarRenderState var0, HumanoidModel<?> var1) {
      if (m_6108() && var0 != null && var1 != null && !GhostHit.m_9179(var0)) {
         Minecraft var2 = Minecraft.getInstance();
         if (var2.player == null || var0.id != var2.player.getId()) {
            if (m_6102(var0.id)) {
               Class_binHXWny7kagd8ju.UKzMo1FYn7RX3Jjr var3 = m_6097(var0, var1, f_17758);
               if (var3 != null) {
                  f_17752.put(var0.id, var3);
               }
            }
         }
      }
   }

   private Class_binHXWny7kagd8ju() {
   }

   private static AABB m_6100(LivingEntity var0, float var1) {
      double var2 = Mth.lerp(var1, var0.xOld, var0.getX());
      double var4 = Mth.lerp(var1, var0.yOld, var0.getY());
      double var6 = Mth.lerp(var1, var0.zOld, var0.getZ());
      return var0.getBoundingBox().move(var2 - var0.getX(), var4 - var0.getY(), var6 - var0.getZ());
   }

   private static Class_binHXWny7kagd8ju.UKzMo1FYn7RX3Jjr m_6101(
      List<Class_binHXWny7kagd8ju.Class_15Gum235atoab6xy> var0, LivingEntityRenderState var1, double var2
   ) {
      if (var0.isEmpty()) {
         return null;
      }

      double var4 = 0.0;

      for (Class_binHXWny7kagd8ju.Class_15Gum235atoab6xy var7 : var0) {
         var4 += var7.weight;
      }

      return var4 <= 0.0
         ? null
         : new Class_binHXWny7kagd8ju.UKzMo1FYn7RX3Jjr(
            List.copyOf(var0), var4, new Vec3(var1.x, var1.y, var1.z), var1.bodyRot, var2, System.currentTimeMillis()
         );
   }

   private static boolean m_6102(int var0) {
      Minecraft var1 = Minecraft.getInstance();
      if (var1.level == null) {
         return false;
      }

      long var2 = var1.level.getGameTime();
      Long var4 = f_17754.put(var0, var2);
      return var4 == null || var4 != var2;
   }

   public static void m_6103(LivingEntityRenderState var0, Object var1) {
      if (m_6108() && var0 != null && var1 instanceof Model var2) {
         if (f_17757.get(var0) == var1) {
            f_17757.remove(var0);
            Class_binHXWny7kagd8ju.OUU3gnBfRkwUnwJV var3 = f_17756.remove(var0);
            if (var3 != null) {
               Class_binHXWny7kagd8ju.UKzMo1FYn7RX3Jjr var4 = m_6113(var0, var2, var3.scale);
               if (var4 != null) {
                  if (var3.player) {
                     f_17752.put(var3.id, var4);
                  } else {
                     f_17753.put(var3.uuid, var4);
                  }
               }
            }
         }
      }
   }

   public static void m_6104() {
      f_17752.clear();
      f_17753.clear();
      f_17754.clear();
      f_17755.clear();
      f_17756.clear();
      f_17757.clear();
   }

   private static Vec3 m_6106(Random var0, double var1, double var3) {
      double var5 = var0.nextDouble();
      double var7;
      double var9;
      double var11;
      if (var5 < f_17812) {
         var7 = (var0.nextDouble() - f_17813) * var1 * f_17814;
         var9 = var3 * (f_17815 + var0.nextDouble() * f_17816);
         var11 = -var1 * (f_17817 + var0.nextDouble() * f_17818);
      } else if (var5 < f_17819) {
         var7 = (var0.nextDouble() - f_17820) * var1 * f_17821;
         var9 = var3 * (f_17822 + var0.nextDouble() * f_17823);
         var11 = var1 * (f_17824 + var0.nextDouble() * f_17825);
      } else {
         int var13 = var0.nextInt(8);
         int var14 = var13 / 2;
         double var15 = (var13 & 1) == 0 ? f_17826 : 1.0;
         var7 = var15 * var1 * (f_17827 + var14 * f_17828 + var0.nextDouble() * f_17829);
         var9 = var3 * (f_17830 + var0.nextDouble() * f_17831);
         var11 = (var14 - f_17832) * var1 * f_17833 + (var0.nextDouble() - f_17834) * var1 * f_17835;
      }

      return new Vec3(var7, var9 - var3 * f_17836, var11);
   }

   private static void m_6107(ModelPart var0, List<Class_binHXWny7kagd8ju.Class_15Gum235atoab6xy> var1, double var2) {
      m_6110(var0, new PoseStack(), var1, var2);
   }

   public static boolean m_6108() {
      try {
         if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
            Particles var0 = DimasikClient.m_9057().m_9049().m_2801().m_3504();
            return var0 != null && var0.m_776() && var0.m_1722();
         } else {
            return false;
         }
      } catch (Throwable var1) {
         return false;
      }
   }

   private static void m_6110(ModelPart var0, PoseStack var1, List<Class_binHXWny7kagd8ju.Class_15Gum235atoab6xy> var2, double var3) {
      if (var0 != null && var0.visible && !var0.skipDraw) {
         ArrayList<Class_binHXWny7kagd8ju.Class_15Gum235atoab6xy> var5 = new ArrayList<>();
         var0.visit(var1, (var1x, var2x, var3x, var4) -> var5.add(Class_binHXWny7kagd8ju.Class_15Gum235atoab6xy.from(var1x.pose(), var4)));
         double var6 = 0.0;

         for (Class_binHXWny7kagd8ju.Class_15Gum235atoab6xy var9 : var5) {
            var6 += var9.weight;
         }

         if (!(var6 <= 0.0)) {
            double var12 = var3 / var6;

            for (Class_binHXWny7kagd8ju.Class_15Gum235atoab6xy var11 : var5) {
               var2.add(var11.withWeight(var11.weight * var12));
            }
         }
      }
   }

   private static Class_binHXWny7kagd8ju.Class_8Y0ZwGmiCyr4GuyB m_6112(LivingEntity var0) {
      if (var0 instanceof Creeper) {
         return Class_binHXWny7kagd8ju.Class_8Y0ZwGmiCyr4GuyB.CREEPER;
      } else if (var0 instanceof Spider) {
         return Class_binHXWny7kagd8ju.Class_8Y0ZwGmiCyr4GuyB.SPIDER;
      } else {
         return var0 instanceof Animal ? Class_binHXWny7kagd8ju.Class_8Y0ZwGmiCyr4GuyB.QUADRUPED : Class_binHXWny7kagd8ju.Class_8Y0ZwGmiCyr4GuyB.HUMANOID;
      }
   }

   private static Class_binHXWny7kagd8ju.UKzMo1FYn7RX3Jjr m_6113(LivingEntityRenderState var0, Model var1, double var2) {
      return var1 instanceof HumanoidModel var4 && var0 instanceof HumanoidRenderState var5 ? m_6097(var5, var4, var2) : m_6092(var0, var1, var2);
   }

   private static Class_binHXWny7kagd8ju.UKzMo1FYn7RX3Jjr m_6114(LivingEntity var0) {
      long var1 = System.currentTimeMillis();
      if (var0 instanceof Player) {
         Class_binHXWny7kagd8ju.UKzMo1FYn7RX3Jjr var3 = f_17752.get(var0.getId());
         if (var3 != null && var1 - var3.capturedAt <= f_17760) {
            return var3;
         }
      }

      Class_binHXWny7kagd8ju.UKzMo1FYn7RX3Jjr var4 = f_17753.get(var0.getUUID());
      return var4 != null && var1 - var4.capturedAt <= f_17761 ? var4 : null;
   }

   private static Vec3 m_6115(Random var0, double var1, double var3) {
      double var5 = var0.nextDouble();
      double var7;
      double var9;
      double var11;
      if (var5 < f_17837) {
         var7 = (var0.nextDouble() - f_17838) * var1 * f_17839;
         var9 = var3 * (f_17840 + var0.nextDouble() * f_17841);
         var11 = (var0.nextDouble() - f_17842) * var1 * f_17843;
      } else if (var5 < f_17844) {
         var7 = var1 * (f_17845 + var0.nextDouble() * f_17846);
         var9 = var3 * (f_17847 + var0.nextDouble() * f_17848);
         var11 = (var0.nextDouble() - f_17849) * var1 * f_17850;
      } else {
         var7 = (var0.nextBoolean() ? 1.0 : f_17851) * var1 * (f_17852 + var0.nextDouble() * f_17853);
         var9 = var3 * (f_17854 + var0.nextDouble() * f_17855);
         var11 = (var0.nextBoolean() ? 1.0 : f_17856) * var1 * (f_17857 + var0.nextDouble() * f_17858);
      }

      return new Vec3(var7, var9 - var3 * f_17859, var11);
   }

   private static boolean m_6116(UUID var0) {
      Minecraft var1 = Minecraft.getInstance();
      if (var1.level == null) {
         return false;
      }

      long var2 = var1.level.getGameTime();
      Long var4 = f_17755.put(var0, var2);
      return var4 == null || var4 != var2;
   }

   public static List<Vec3> m_6117(LivingEntity var0, int var1) {
      ArrayList var2 = new ArrayList(var1);
      if (var0 != null && var1 > 0) {
         Class_binHXWny7kagd8ju.UKzMo1FYn7RX3Jjr var3 = m_6114(var0);
         Random var4 = new Random(var0.getId() * f_17759 ^ System.nanoTime());
         if (var3 != null) {
            for (int var16 = 0; var16 < var1; var16++) {
               var2.add(var3.sample(var4));
            }

            return var2;
         } else {
            float var5 = Minecraft.getInstance().getDeltaTracker().getGameTimeDeltaPartialTick(true);
            AABB var6 = m_6100(var0, var5);
            Vec3 var7 = var6.getCenter();
            double var8 = var6.getXsize();
            double var10 = var6.getYsize();
            Class_binHXWny7kagd8ju.Class_8Y0ZwGmiCyr4GuyB var12 = m_6112(var0);
            float var13 = var0.getViewYRot(var5);

            for (int var14 = 0; var14 < var1; var14++) {
               Vec3 var15 = m_6098(var4, var8, var10, var12).yRot((float)Math.toRadians(-var13));
               var2.add(var7.add(var15));
            }

            return var2;
         }
      } else {
         return var2;
      }
   }

   public static void m_6118(LivingEntity var0, LivingEntityRenderState var1) {
      if (m_6108() && var0 != null && var1 != null && !(var0 instanceof ArmorStand)) {
         Minecraft var2 = Minecraft.getInstance();
         if (var0 != var2.player && !(var0 instanceof Player)) {
            if (m_6116(var0.getUUID())) {
               f_17756.put(var1, new Class_binHXWny7kagd8ju.OUU3gnBfRkwUnwJV(var0.getUUID(), var0.getId(), false, var1.scale));
            }
         }
      }
   }

   private record Class_15Gum235atoab6xy(Matrix4f transform, float minX, float minY, float minZ, float maxX, float maxY, float maxZ, double weight) {
      public Vec3 sample(Random var1) {
         Vector3f var2 = new Vector3f(
            Mth.lerp(var1.nextFloat(), this.minX, this.maxX) / 16.0F,
            Mth.lerp(var1.nextFloat(), this.minY, this.maxY) / 16.0F,
            Mth.lerp(var1.nextFloat(), this.minZ, this.maxZ) / 16.0F
         );
         this.transform.transformPosition(var2);
         return new Vec3(var2.x, var2.y, var2.z);
      }

      public static Class_binHXWny7kagd8ju.Class_15Gum235atoab6xy from(Matrix4f var0, Cube var1) {
         double var2 = Math.max(1.0, (var1.maxX - var1.minX) * (var1.maxY - var1.minY) * (var1.maxZ - var1.minZ));
         return new Class_binHXWny7kagd8ju.Class_15Gum235atoab6xy(new Matrix4f(var0), var1.minX, var1.minY, var1.minZ, var1.maxX, var1.maxY, var1.maxZ, var2);
      }

      public Class_binHXWny7kagd8ju.Class_15Gum235atoab6xy withWeight(double var1) {
         return new Class_binHXWny7kagd8ju.Class_15Gum235atoab6xy(this.transform, this.minX, this.minY, this.minZ, this.maxX, this.maxY, this.maxZ, var1);
      }
   }

   private enum Class_8Y0ZwGmiCyr4GuyB {
      HUMANOID,
      CREEPER,
      SPIDER,
      QUADRUPED;
   }

   private record OUU3gnBfRkwUnwJV(UUID uuid, int id, boolean player, double scale) {
      public int m_6091() {
         return this.id;
      }
   }

   private record UKzMo1FYn7RX3Jjr(
      List<Class_binHXWny7kagd8ju.Class_15Gum235atoab6xy> cuboids, double totalWeight, Vec3 entityPosition, float bodyYaw, double modelScale, long capturedAt
   ) {
      public Vec3 toWorld(Vec3 var1) {
         Vec3 var2 = new Vec3(-var1.x * this.modelScale, (1.501 - var1.y) * this.modelScale, var1.z * this.modelScale);
         return this.entityPosition.add(var2.yRot((float)Math.toRadians(180.0F - this.bodyYaw)));
      }

      public Vec3 sample(Random var1) {
         double var2 = var1.nextDouble() * this.totalWeight;

         for (Class_binHXWny7kagd8ju.Class_15Gum235atoab6xy var5 : this.cuboids) {
            var2 -= var5.weight;
            if (var2 <= 0.0) {
               return this.toWorld(var5.sample(var1));
            }
         }

         return this.toWorld(this.cuboids.getLast().sample(var1));
      }
   }
}
