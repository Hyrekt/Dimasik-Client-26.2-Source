package dev.dimasik.client.system;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Generated;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder.Reference;
import net.minecraft.core.registries.Registries;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;
import org.jetbrains.annotations.Nullable;

public final class Class_54SEkpqYjEsUMrjI implements Class_NzJrN63M7QBpmAbi {
   private static final double f_2224 = 12.0;
   private static final EquipmentSlot[] f_2225 = new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET};
   private static final Map<Class_54SEkpqYjEsUMrjI.J9dxleSlNYwXcfxY, Float> f_2226 = new HashMap<>();
   private static final Map<BlockState, Float> f_2227 = new HashMap<>();
   private static boolean f_2228;
   private static final double f_2229 = 12.0;
   private static final double f_2230 = 0.5;
   private static final double f_2231 = 0.5;
   private static final double f_2232 = 0.5;
   private static final double f_2233 = 7.0;
   private static final double f_2234 = 2.0;
   private static final double f_2235 = 2.0;
   private static final double f_2236 = 2.0;
   private static final double f_2237 = 0.5;
   private static final double f_2238 = 0.5;
   private static final double f_2239 = 1.0E-8;
   private static final double f_2240 = 1.0E-4;
   private static final double f_2241 = 1.0E-4;
   private static final float f_2242 = 1.0E-4F;
   private static final float f_2243 = 4.0F;
   private static final float f_2244 = 0.2F;
   private static final float f_2245 = 20.0F;
   private static final float f_2246 = 25.0F;
   private static final float f_2247 = 25.0F;
   private static final float f_2248 = 0.2F;
   private static final String f_2249 = "This is a utility class and cannot be instantiated";

   private static float m_1396(LivingEntity var0, float var1) {
      float var2 = var0.getArmorValue();
      if (var2 <= 0.0F) {
         return var1;
      }

      float var3 = (float)var0.getAttributeValue(Attributes.ARMOR_TOUGHNESS);
      float var4 = 2.0F + var3 / f_2243;
      float var5 = Mth.clamp(var2 - var1 / var4, var2 * f_2244, f_2245);
      return var1 * (1.0F - var5 / f_2246);
   }

   public static int m_1397(BlockState var0) {
      if (var0 != null && f_11537.player != null) {
         int var1 = -1;
         ItemStack var2 = ItemStack.EMPTY;
         float var3 = m_1408(var2, var0);

         for (int var4 = 0; var4 < 9; var4++) {
            ItemStack var5 = f_11537.player.getInventory().getItem(var4);
            float var6 = m_1408(var5, var0);
            if (m_1410(var5, var2, var6, var3, var0)) {
               var1 = var4;
               var2 = var5;
               var3 = var6;
            }
         }

         return var1;
      } else {
         return -1;
      }
   }

   public static float m_1398(Vec3 var0, Entity var1) {
      return var1 == null ? 0.0F : m_1407(var0, var1, var1.getBoundingBox());
   }

   private static float m_1399(LivingEntity var0, float var1) {
      MobEffectInstance var2 = var0.getEffect(MobEffects.RESISTANCE);
      if (var2 == null) {
         return var1;
      }

      float var3 = Mth.clamp((var2.getAmplifier() + 1) * f_2248, 0.0F, 1.0F);
      return var1 * (1.0F - var3);
   }

   private static int m_1400(ItemStack var0) {
      if (var0 != null && !var0.isEmpty() && f_11537.level != null) {
         Registry var1 = f_11537.level.registryAccess().lookupOrThrow(Registries.ENCHANTMENT);
         return EnchantmentHelper.getItemEnchantmentLevel(var1.getOrThrow(Enchantments.EFFICIENCY), var0);
      } else {
         return 0;
      }
   }

   public static float m_1401(BlockState var0, BlockPos var1) {
      if (var0 != null && var1 != null && f_11537.player != null && f_11537.level != null) {
         Float var2 = f_2228 ? f_2227.get(var0) : null;
         if (var2 != null) {
            return var2;
         }

         int var3 = m_1397(var0);
         int var4 = f_11537.player.getInventory().getSelectedSlot();

         float var5;
         try {
            if (var3 >= 0) {
               f_11537.player.getInventory().setSelectedSlot(var3);
            }

            var5 = var0.getDestroyProgress(f_11537.player, f_11537.level, var1);
         } finally {
            f_11537.player.getInventory().setSelectedSlot(var4);
         }

         float var6 = var5 > 0.0F ? (float)Math.ceil(1.0F / var5) : Float.POSITIVE_INFINITY;
         if (f_2228) {
            f_2227.put(var0, var6);
         }

         return var6;
      } else {
         return Float.POSITIVE_INFINITY;
      }
   }

   public static float m_1402(Vec3 var0, LivingEntity var1, AABB var2, @Nullable AABB var3, List<BlockPos> var4) {
      return m_1404(var0, var1, var2, var3, var4, f_2229);
   }

   private static float m_1403(Vec3 var0, AABB var1, Entity var2, @Nullable AABB var3, List<BlockPos> var4) {
      double var5 = 1.0 / ((var1.maxX - var1.minX) * f_2234 + 1.0);
      double var7 = 1.0 / ((var1.maxY - var1.minY) * f_2235 + 1.0);
      double var9 = 1.0 / ((var1.maxZ - var1.minZ) * f_2236 + 1.0);
      if (!(var5 < 0.0) && !(var7 < 0.0) && !(var9 < 0.0)) {
         double var11 = (1.0 - Math.floor(1.0 / var5) * var5) * f_2237;
         double var13 = (1.0 - Math.floor(1.0 / var9) * var9) * f_2238;
         int var15 = 0;
         int var16 = 0;

         for (double var17 = 0.0; var17 <= 1.0; var17 += var5) {
            for (double var19 = 0.0; var19 <= 1.0; var19 += var7) {
               for (double var21 = 0.0; var21 <= 1.0; var21 += var9) {
                  Vec3 var23 = new Vec3(
                     Mth.lerp(var17, var1.minX, var1.maxX) + var11, Mth.lerp(var19, var1.minY, var1.maxY), Mth.lerp(var21, var1.minZ, var1.maxZ) + var13
                  );
                  if (m_1406(var23, var0, var2, var3, var4)) {
                     var15++;
                  }

                  var16++;
               }
            }
         }

         return var16 == 0 ? 0.0F : (float)var15 / var16;
      } else {
         return 0.0F;
      }
   }

   public static float m_1404(Vec3 var0, LivingEntity var1, AABB var2, @Nullable AABB var3, List<BlockPos> var4, double var5) {
      if (var0 == null || var1 == null || var2 == null || f_11537.level == null) {
         return 0.0F;
      }

      if (!var1.isAlive()) {
         return 0.0F;
      }

      Vec3 var7 = new Vec3((var2.minX + var2.maxX) * f_2230, var2.minY, (var2.minZ + var2.maxZ) * f_2231);
      double var8 = var7.distanceTo(var0);
      if (var8 > var5) {
         return 0.0F;
      }

      float var10 = m_1411(var0, var2, var1, var3, var4 == null ? List.of() : var4);
      double var11 = (1.0 - var8 / var5) * var10;
      float var13 = (float)((var11 * var11 + var11) * f_2232 * f_2233 * var5 + 1.0);
      var13 = m_1396(var1, var13);
      var13 = m_1412(var1, var13);
      var13 = m_1399(var1, var13);
      return Math.max(0.0F, var13);
   }

   public static void m_1405() {
      f_2226.clear();
      f_2227.clear();
      f_2228 = true;
   }

   private static boolean m_1406(Vec3 var0, Vec3 var1, Entity var2, @Nullable AABB var3, List<BlockPos> var4) {
      if (var3 != null && var3.clip(var0, var1).isPresent()) {
         return false;
      }

      Vec3 var5 = var0;
      int var6 = var4 == null ? 0 : var4.size();
      int var7 = 0;

      while (var7 <= var6) {
         BlockHitResult var8 = f_11537.level.clip(new ClipContext(var5, var1, Block.COLLIDER, Fluid.NONE, var2));
         if (var8.getType() == Type.MISS) {
            return true;
         }

         if (var4 != null && var4.contains(var8.getBlockPos())) {
            Vec3 var9 = var1.subtract(var0).normalize();
            Vec3 var10 = m_1415(var8.getLocation(), var9, var8.getBlockPos());
            if (var10 != null && !(var1.subtract(var10).dot(var9) <= 0.0)) {
               var5 = var10;
               var7++;
               continue;
            }

            return true;
         }

         return false;
      }

      return false;
   }

   public static float m_1407(Vec3 var0, Entity var1, AABB var2) {
      return var1 instanceof LivingEntity var3 ? m_1402(var0, var3, var2, null, List.of()) : 0.0F;
   }

   private static float m_1408(ItemStack var0, BlockState var1) {
      if (var0 != null && !var0.isEmpty()) {
         float var2 = var0.getDestroySpeed(var1);
         int var3 = m_1400(var0);
         if (var2 > 1.0F && var3 > 0) {
            var2 += var3 * var3 + 1.0F;
         }

         return var2;
      } else {
         return 1.0F;
      }
   }

   private static boolean m_1409(ItemStack var0) {
      return var0 != null && !var0.isEmpty() && var0.is(Items.SHEARS) && m_1400(var0) == 0;
   }

   @Generated
   private Class_54SEkpqYjEsUMrjI() {
      throw new UnsupportedOperationException(f_2249);
   }

   private static boolean m_1410(ItemStack var0, ItemStack var1, float var2, float var3, BlockState var4) {
      float var5 = f_2242;
      if (var2 > var3 + var5) {
         return true;
      }

      if (var2 + var5 < var3) {
         return false;
      }

      boolean var6 = m_1413(var0, var4);
      boolean var7 = m_1413(var1, var4);
      if (var6 != var7) {
         return var6;
      }

      int var8 = m_1400(var0);
      int var9 = m_1400(var1);
      if (var8 != var9) {
         return var8 > var9;
      }

      boolean var10 = m_1409(var0);
      boolean var11 = m_1409(var1);
      return var10 != var11 && !var10;
   }

   public static float m_1411(Vec3 var0, AABB var1, Entity var2, @Nullable AABB var3, List<BlockPos> var4) {
      boolean var5 = var3 != null || var4 != null && !var4.isEmpty();
      if (!var5 && f_2228) {
         Class_54SEkpqYjEsUMrjI.J9dxleSlNYwXcfxY var6 = new Class_54SEkpqYjEsUMrjI.J9dxleSlNYwXcfxY(var2.getId(), var0, var1);
         Float var7 = f_2226.get(var6);
         if (var7 != null) {
            return var7;
         }

         float var8 = m_1403(var0, var1, var2, null, List.of());
         f_2226.put(var6, var8);
         return var8;
      } else {
         return m_1403(var0, var1, var2, var3, var4 == null ? List.of() : var4);
      }
   }

   private static float m_1412(LivingEntity var0, float var1) {
      if (f_11537.level == null) {
         return var1;
      }

      Registry var2 = f_11537.level.registryAccess().lookupOrThrow(Registries.ENCHANTMENT);
      Reference var3 = var2.getOrThrow(Enchantments.PROTECTION);
      Reference var4 = var2.getOrThrow(Enchantments.BLAST_PROTECTION);
      int var5 = 0;

      for (EquipmentSlot var9 : f_2225) {
         ItemStack var10 = var0.getItemBySlot(var9);
         if (!var10.isEmpty()) {
            var5 += EnchantmentHelper.getItemEnchantmentLevel(var3, var10);
            var5 += EnchantmentHelper.getItemEnchantmentLevel(var4, var10) * 2;
         }
      }

      var5 = Mth.clamp(var5, 0, 20);
      return var1 * (1.0F - var5 / f_2247);
   }

   private static boolean m_1413(ItemStack var0, BlockState var1) {
      return !var1.requiresCorrectToolForDrops() || var0 != null && !var0.isEmpty() && var0.isCorrectToolForDrops(var1);
   }

   public static void m_1414() {
      f_2228 = false;
   }

   private static Vec3 m_1415(Vec3 var0, Vec3 var1, BlockPos var2) {
      AABB var3 = new AABB(var2);
      double var4 = Double.POSITIVE_INFINITY;
      double var6 = f_2239;
      if (var1.x > var6) {
         var4 = Math.min(var4, (var3.maxX - var0.x) / var1.x);
      } else if (var1.x < -var6) {
         var4 = Math.min(var4, (var3.minX - var0.x) / var1.x);
      }

      if (var1.y > var6) {
         var4 = Math.min(var4, (var3.maxY - var0.y) / var1.y);
      } else if (var1.y < -var6) {
         var4 = Math.min(var4, (var3.minY - var0.y) / var1.y);
      }

      if (var1.z > var6) {
         var4 = Math.min(var4, (var3.maxZ - var0.z) / var1.z);
      } else if (var1.z < -var6) {
         var4 = Math.min(var4, (var3.minZ - var0.z) / var1.z);
      }

      return Double.isFinite(var4) && !(var4 < 0.0) ? var0.add(var1.scale(var4 + f_2241)) : var0.add(var1.scale(f_2240));
   }

   private record J9dxleSlNYwXcfxY(int entityId, Vec3 explosion, AABB box) {
   }
}
