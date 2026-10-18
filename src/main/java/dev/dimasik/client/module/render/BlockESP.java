package dev.dimasik.client.module.render;

import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_81oIJPtsDGdzRKcL;
import dev.dimasik.client.system.Class_J32sUe2fy1OIemnb;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_bhSc4OUnYWSe2vjL;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public final class BlockESP extends Module {
   private static final int f_4520 = 70000;
   private static final double f_4521 = 0.002;
   private final SliderSetting f_4522;
   private final Map<Integer, List<BlockPos>> f_4523;
   private final Map<Block, Integer> f_4524;
   private final Map<EntityType<?>, Integer> f_4525;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_4526;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_4527;
   private BlockESP.brB0V8gxekb7i1CY f_4528;
   private int f_4529;
   private int f_4530;
   private int f_4531;
   private int f_4532;
   private static final String f_4533 = "BlockESP";
   private static final String f_4534 = "Подсвечивает выбранные блоки и сущности";
   private static final String f_4535 = "Радиус";
   private static final float f_4536 = 48.0F;
   private static final float f_4537 = 8.0F;
   private static final float f_4538 = 64.0F;
   private static final int f_4539 = Integer.MIN_VALUE;
   private static final int f_4540 = Integer.MIN_VALUE;
   private static final int f_4541 = Integer.MIN_VALUE;
   private static final int f_4542 = 16777215;
   private static final int f_4543 = 70000;
   private static final int f_4544 = -16777216;
   private static final double f_4545 = 0.002;
   private static final double f_4546 = 0.002;
   private static final double f_4547 = 0.002;
   private static final double f_4548 = 0.002;
   private static final double f_4549 = 0.002;
   private static final double f_4550 = 0.002;
   private static final double f_4551 = 0.002;
   private static final int f_4552 = -16777216;
   private static final int f_4553 = Integer.MIN_VALUE;
   private static final int f_4554 = Integer.MIN_VALUE;
   private static final int f_4555 = Integer.MIN_VALUE;

   private void m_1908() {
      if (this.f_4528 != null && f_11537.level != null) {
         MutableBlockPos var1 = new MutableBlockPos();
         int var2 = 0;

         while (var2++ < f_4543 && this.f_4528.f_4519 < this.f_4528.f_4516) {
            int var3 = this.f_4528.f_4519++;
            int var4 = this.f_4528.f_4514 * this.f_4528.f_4515;
            int var5 = var3 / var4;
            int var6 = var3 % var4;
            int var7 = var6 / this.f_4528.f_4515;
            int var8 = var6 % this.f_4528.f_4515;
            var1.set(this.f_4528.f_4510 + var5, this.f_4528.f_4511 + var7, this.f_4528.f_4512 + var8);
            BlockState var9 = f_11537.level.getBlockState(var1);
            if (!var9.isAir()) {
               Integer var10 = this.f_4528.f_4517.get(var9.getBlock());
               if (var10 != null) {
                  this.f_4528.f_4518.computeIfAbsent(var10, var0 -> new ArrayList<>()).add(var1.immutable());
               }
            }
         }

         if (this.f_4528.f_4519 >= this.f_4528.f_4516) {
            this.f_4523.clear();
            this.f_4523.putAll(this.f_4528.f_4518);
            this.f_4528 = null;
         }
      }
   }

   public BlockESP() {
      super(f_4533, f_4534, Category.RENDER);
      this.f_4522 = new SliderSetting(f_4535, f_4536, f_4537, f_4538).m_828(1.0F);
      this.f_4523 = new HashMap<>();
      this.f_4524 = new IdentityHashMap<>();
      this.f_4525 = new IdentityHashMap<>();
      this.f_4526 = this::m_1914;
      this.f_4527 = this::m_1911;
      this.f_4529 = f_4539;
      this.f_4530 = f_4540;
      this.f_4531 = f_4541;
      this.f_4532 = -1;
      this.m_795(this.f_4522);
   }

   @Override
   public void m_778() {
      this.m_1909();
      super.m_778();
   }

   private void m_1909() {
      this.f_4529 = f_4553;
      this.f_4530 = f_4554;
      this.f_4531 = f_4555;
      this.f_4532 = -1;
      this.f_4528 = null;
   }

   private void m_1910(List<Class_J32sUe2fy1OIemnb.Oybn1scxKSxj8sN9> var1, BlockPos var2, int var3) {
      this.f_4524.clear();
      this.f_4525.clear();

      for (Class_J32sUe2fy1OIemnb.Oybn1scxKSxj8sN9 var5 : var1) {
         Identifier var6 = Identifier.tryParse(var5.target());
         if (var6 != null) {
            int var7 = var5.color() & f_4542;
            if (BuiltInRegistries.BLOCK.containsKey(var6)) {
               this.f_4524.put((Block)BuiltInRegistries.BLOCK.getValue(var6), var7);
            }

            if (BuiltInRegistries.ENTITY_TYPE.containsKey(var6)) {
               this.f_4525.put((EntityType<?>)BuiltInRegistries.ENTITY_TYPE.getValue(var6), var7);
            }
         }
      }

      if (this.f_4524.isEmpty()) {
         this.f_4523.clear();
         this.f_4528 = null;
      } else {
         int var8 = Math.max(f_11537.level.getMinY(), var2.getY() - var3);
         int var9 = Math.min(f_11537.level.getMaxY(), var2.getY() + var3);
         int var10 = var3 * 2 + 1;
         this.f_4528 = new BlockESP.brB0V8gxekb7i1CY(
            var2.getX() - var3, var8, var2.getZ() - var3, var10, var9 - var8 + 1, var10, new IdentityHashMap<>(this.f_4524)
         );
      }
   }

   private void m_1911(Class_TZhU50s8XmBQCMP5 var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (!this.f_4523.isEmpty() || !this.f_4525.isEmpty()) {
            VertexConsumer var2 = var1.m_5008().m_881(Class_81oIJPtsDGdzRKcL.f_3816);
            Vec3 var3 = var1.m_5010();
            this.m_1917(var1, var2, var3);
            this.m_1913(var1, var2, var3);
         }
      }
   }

   private void m_1912() {
      this.f_4523.clear();
      this.f_4524.clear();
      this.f_4525.clear();
      this.m_1909();
   }

   private void m_1913(Class_TZhU50s8XmBQCMP5 var1, VertexConsumer var2, Vec3 var3) {
      if (!this.f_4525.isEmpty()) {
         float var4 = var1.m_5004();

         for (Entity var6 : f_11537.level.entitiesForRendering()) {
            if (var6 != f_11537.player && !var6.isRemoved()) {
               Integer var7 = this.f_4525.get(var6.getType());
               if (var7 != null) {
                  Vec3 var8 = new Vec3(Mth.lerp(var4, var6.xo, var6.getX()), Mth.lerp(var4, var6.yo, var6.getY()), Mth.lerp(var4, var6.zo, var6.getZ()));
                  AABB var9 = var6.getBoundingBox().move(var8.x - var6.getX(), var8.y - var6.getY(), var8.z - var6.getZ()).inflate(f_4551);
                  Class_bhSc4OUnYWSe2vjL.m_6088(
                     var1.m_5006(), var2, var3, var9.minX, var9.minY, var9.minZ, var9.maxX, var9.maxY, var9.maxZ, f_4552 | var7, false
                  );
               }
            }
         }
      }
   }

   private void m_1914(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null) {
         Class_J32sUe2fy1OIemnb var2 = this.m_1915();
         int var3 = var2.m_3165();
         int var4 = this.f_4522.m_8768().intValue();
         BlockPos var5 = f_11537.player.blockPosition();
         int var6 = var5.getX() >> 4;
         int var7 = var5.getZ() >> 4;
         if (var3 != this.f_4529 || var6 != this.f_4530 || var7 != this.f_4531 || var4 != this.f_4532) {
            this.m_1910(var2.m_3166(), var5, var4);
            this.f_4529 = var3;
            this.f_4530 = var6;
            this.f_4531 = var7;
            this.f_4532 = var4;
         }

         this.m_1908();
      } else {
         this.m_1912();
      }
   }

   private Class_J32sUe2fy1OIemnb m_1915() {
      return DimasikClient.m_9057().m_9049().m_2810();
   }

   private void m_1917(Class_TZhU50s8XmBQCMP5 var1, VertexConsumer var2, Vec3 var3) {
      for (Entry var5 : this.f_4523.entrySet()) {
         int var6 = f_4544 | (Integer)var5.getKey();
         Iterator var7 = ((List)var5.getValue()).iterator();

         while (var7.hasNext()) {
            BlockPos var8 = (BlockPos)var7.next();
            BlockState var9 = f_11537.level.getBlockState(var8);
            Integer var10 = this.f_4524.get(var9.getBlock());
            if (var10 != null && var10 == (Integer)var5.getKey()) {
               Class_bhSc4OUnYWSe2vjL.m_6088(
                  var1.m_5006(),
                  var2,
                  var3,
                  var8.getX() - f_4545,
                  var8.getY() - f_4546,
                  var8.getZ() - f_4547,
                  var8.getX() + 1.0 + f_4548,
                  var8.getY() + 1.0 + f_4549,
                  var8.getZ() + 1.0 + f_4550,
                  var6,
                  false
               );
            } else {
               var7.remove();
            }
         }
      }
   }

   @Override
   public void m_732() {
      this.m_1912();
      super.m_732();
   }

   private static final class brB0V8gxekb7i1CY {
      public final int f_4510;
      public final int f_4511;
      public final int f_4512;
      public final int f_4513;
      public final int f_4514;
      public final int f_4515;
      public final int f_4516;
      public final Map<Block, Integer> f_4517;
      public final Map<Integer, List<BlockPos>> f_4518 = new HashMap<>();
      public int f_4519;

      public brB0V8gxekb7i1CY(int var1, int var2, int var3, int var4, int var5, int var6, Map<Block, Integer> var7) {
         this.f_4510 = var1;
         this.f_4511 = var2;
         this.f_4512 = var3;
         this.f_4513 = var4;
         this.f_4514 = var5;
         this.f_4515 = var6;
         this.f_4516 = var4 * var5 * var6;
         this.f_4517 = var7;
      }
   }
}
