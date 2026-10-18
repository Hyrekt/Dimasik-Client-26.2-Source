package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import java.util.Set;
import lombok.Generated;
import net.minecraft.world.level.block.AbstractChestBlock;
import net.minecraft.world.level.block.AnvilBlock;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.BeaconBlock;
import net.minecraft.world.level.block.BlastFurnaceBlock;
import net.minecraft.world.level.block.BrewingStandBlock;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.CartographyTableBlock;
import net.minecraft.world.level.block.CopperChestBlock;
import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraft.world.level.block.FurnaceBlock;
import net.minecraft.world.level.block.GrindstoneBlock;
import net.minecraft.world.level.block.LecternBlock;
import net.minecraft.world.level.block.LeverBlock;
import net.minecraft.world.level.block.LoomBlock;
import net.minecraft.world.level.block.ShulkerBoxBlock;
import net.minecraft.world.level.block.SmokerBlock;
import net.minecraft.world.level.block.StonecutterBlock;

public class OpenWalls extends Module {
   private final Set<Class<?>> f_15557 = Set.of(
      AbstractChestBlock.class,
      FurnaceBlock.class,
      CraftingTableBlock.class,
      CopperChestBlock.class,
      ShulkerBoxBlock.class,
      BaseEntityBlock.class,
      AnvilBlock.class,
      BeaconBlock.class,
      BlastFurnaceBlock.class,
      BrewingStandBlock.class,
      CampfireBlock.class,
      CartographyTableBlock.class,
      GrindstoneBlock.class,
      LecternBlock.class,
      LoomBlock.class,
      SmokerBlock.class,
      StonecutterBlock.class,
      LeverBlock.class
   );
   private static final String f_15558 = "Open Walls";
   private static final String f_15559 = "Позволяет открывать сундуки через стены";

   public OpenWalls() {
      super(f_15558, f_15559, Category.MISC);
   }

   @Generated
   public Set<Class<?>> m_5441() {
      return this.f_15557;
   }
}
