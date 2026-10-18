package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import lombok.Generated;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;

public final class Class_lwIe74mLf6HOTjku implements Class_NzJrN63M7QBpmAbi {
   private static final String f_25461 = "Умная";
   private static final String f_25462 = "This is a utility class and cannot be instantiated";
   private static final String f_25463 = "Дистанция";
   private static final String f_25464 = "Броня";

   private static boolean m_7569(LivingEntity var0, float var1) {
      if (var0 instanceof Player var2 && DimasikClient.m_9057().m_9049().m_2801().m_3581().f_33163.contains(var2)) {
         return false;
      } else {
         return !var0.isAlive() ? false : var0.distanceTo(f_11537.player) <= var1;
      }
   }

   @Generated
   private Class_lwIe74mLf6HOTjku() {
      throw new UnsupportedOperationException(f_25462);
   }

   public static List<LivingEntity> m_7570(float var0, boolean var1, boolean var2, boolean var3, boolean var4) {
      return new ArrayList<>(m_7571(var0, var1, var2, var3, var4));
   }

   private static List<LivingEntity> m_7571(float var0, boolean var1, boolean var2, boolean var3, boolean var4) {
      ArrayList var5 = new ArrayList();

      for (Entity var7 : f_11537.level.entitiesForRendering()) {
         if (var7 != f_11537.player && !(var7 instanceof LivingEntity var8 && !m_7569(var8, var0))) {
            if (Class_Xc9oMkiIE6eeApEo.m_5567()) {
               if (var7 instanceof Player var10 && Class_Xc9oMkiIE6eeApEo.m_5565(var10)) {
                  var5.add(var10);
               }
            } else if (var7 instanceof Player var11) {
               if (DimasikClient.m_9057().m_9049().m_2804().m_2877(var11.getGameProfile().name())) {
                  if (var3) {
                     var5.add(var11);
                  }
               } else if (var11.getArmorValue() == 0) {
                  if (var2) {
                     var5.add(var11);
                  }
               } else if (var1) {
                  var5.add(var11);
               }
            } else if (var7 instanceof Mob var9 && var4) {
               var5.add(var9);
            }
         }
      }

      return var5;
   }

   public static LivingEntity m_7574(LivingEntity var0, float var1, boolean var2, boolean var3, boolean var4, boolean var5, MultiChoiceSetting var6) {
      return var6.m_7568(f_25461)
         ? m_7571(var1, var2, var3, var4, var5)
            .stream()
            .min(
               Comparator.<LivingEntity, Boolean>comparing(var1x -> var1x != var0)
                  .thenComparingDouble(LivingEntity::getArmorValue)
                  .thenComparingDouble(Class_g3Fg4YmMuzK7loFX::m_6757)
                  .thenComparingDouble(var0x -> var0x.distanceTo(f_11537.player))
                  .thenComparingInt(Entity::getId)
            )
            .orElse(null)
         : m_7571(var1, var2, var3, var4, var5)
            .stream()
            .min(
               Comparator.<LivingEntity, Boolean>comparing(var1x -> var1x != var0)
                  .thenComparingDouble(
                     var1x -> var6.m_7568(f_25463)
                        ? var1x.distanceTo(f_11537.player)
                        : (var6.m_7568(f_25464) ? var1x.getArmorValue() : Class_g3Fg4YmMuzK7loFX.m_6757(var1x))
                  )
                  .thenComparingInt(Entity::getId)
            )
            .orElse(null);
   }
}
