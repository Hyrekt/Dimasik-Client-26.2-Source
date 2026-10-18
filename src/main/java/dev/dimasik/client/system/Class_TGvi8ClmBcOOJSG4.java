package dev.dimasik.client.system;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Direction.Axis;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BrewingStandBlock;
import net.minecraft.world.level.block.HopperBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.LeverBlock;
import net.minecraft.world.level.block.RedStoneWireBlock;
import net.minecraft.world.level.block.RedstoneTorchBlock;
import net.minecraft.world.level.block.RedstoneWallTorchBlock;
import net.minecraft.world.level.block.RepeaterBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.RedstoneSide;

public final class Class_TGvi8ClmBcOOJSG4 implements Class_gXPXh2FDkuYBeJW2.N48QC1or2G8EIFjb {
   private static final Map<String, Class_TGvi8ClmBcOOJSG4.DmXyejbKknQHckcI> f_13961 = new HashMap<>();
   private final BlockState[][][] f_13962;
   private final int f_13963;
   private final int f_13964;
   private final int f_13965;
   private final BlockPos f_13966;
   private final Direction f_13967;
   private final Map<Item, Integer> f_13968;
   private final List<BlockPos> f_13969;
   private final List<BlockPos> f_13970;
   private final List<BlockPos> f_13971;
   private final List<BlockPos> f_13972;
   private final List<BlockPos> f_13973;
   private final Class_TGvi8ClmBcOOJSG4.YUyDnrU2lUsT07Dz f_13974;
   private static final int f_13975 = Integer.MAX_VALUE;
   private static final int f_13976 = Integer.MAX_VALUE;
   private static final int f_13977 = Integer.MAX_VALUE;
   private static final int f_13978 = Integer.MIN_VALUE;
   private static final int f_13979 = Integer.MIN_VALUE;
   private static final int f_13980 = Integer.MIN_VALUE;
   private static final String f_13981 = ", ";
   private static final String f_13982 = "none";
   private static final String f_13983 = "blocks";
   private static final String f_13984 = "props";
   private static final String f_13985 = "props";
   private static final String f_13986 = "props";
   private static final String f_13987 = "x";
   private static final String f_13988 = "y";
   private static final String f_13989 = "z";
   private static final String f_13990 = "block";

   public List<BlockPos> m_4947() {
      return this.f_13972;
   }

   private static int m_4948(Direction var0) {
      return Math.floorMod(var0.get2DDataValue() - Direction.SOUTH.get2DDataValue(), 4);
   }

   private static Item m_4949(BlockState var0) {
      Block var1 = var0.getBlock();
      if (var1 == Blocks.REDSTONE_WALL_TORCH || var1 == Blocks.REDSTONE_TORCH) {
         return Items.REDSTONE_TORCH;
      }

      if (var1 == Blocks.REDSTONE_WIRE) {
         return Items.REDSTONE;
      }

      Item var2 = var1.asItem();
      return var2 == null ? Items.AIR : var2;
   }

   @Override
   public BlockState m_4950(int var1, int var2, int var3, BlockState var4, List<BlockState> var5) {
      if (var1 >= 0 && var2 >= 0 && var3 >= 0 && var1 < this.f_13963 && var2 < this.f_13964 && var3 < this.f_13965) {
         BlockState var6 = this.f_13962[var1][var2][var3];
         if (var6 == null || m_4966(var6)) {
            return var4 != null ? var4 : Blocks.AIR.defaultBlockState();
         }

         if (m_4954(var6)) {
            if (var4 != null && m_4954(var4)) {
               return var4;
            }

            if (var5 != null) {
               for (BlockState var13 : var5) {
                  if (var13 != null && m_4954(var13)) {
                     return var13;
                  }
               }
            }

            return var6;
         } else {
            if (var4 != null && var4.getBlock() == var6.getBlock()) {
               Block var7 = var6.getBlock();
               if (var7 == Blocks.REDSTONE_WIRE || var7 == Blocks.REPEATER || var7 == Blocks.LEVER) {
                  return var4;
               }

               if (var4.equals(var6)) {
                  return var4;
               }
            }

            if (var5 != null) {
               for (BlockState var8 : var5) {
                  if (var8 != null && var8.getBlock() == var6.getBlock() && m_4977(var6, var8)) {
                     return var8;
                  }
               }

               for (BlockState var12 : var5) {
                  if (var12 != null && var12.getBlock() == var6.getBlock()) {
                     return var12;
                  }
               }
            }

            return var6;
         }
      } else {
         return var4 != null ? var4 : Blocks.AIR.defaultBlockState();
      }
   }

   public String m_4951() {
      ArrayList var1 = new ArrayList();
      this.f_13968
         .entrySet()
         .stream()
         .sorted(
            (var0, var1x) -> var0.getKey()
               .getDefaultInstance()
               .getItemName()
               .getString()
               .compareToIgnoreCase(var1x.getKey().getDefaultInstance().getItemName().getString())
         )
         .forEach(var1x -> var1.add(var1x.getKey().getDefaultInstance().getItemName().getString() + var1x.getValue()));
      return String.join(f_13981, var1);
   }

   private static Direction m_4952(Direction var0, int var1) {
      if (var0.getAxis() == Axis.Y) {
         return var0;
      }

      Direction var2 = var0;

      for (int var3 = 0; var3 < Math.floorMod(var1, 4); var3++) {
         var2 = var2.getClockWise();
      }

      return var2;
   }

   private Class_TGvi8ClmBcOOJSG4(
      Class_TGvi8ClmBcOOJSG4.YUyDnrU2lUsT07Dz var1,
      BlockState[][][] var2,
      int var3,
      int var4,
      int var5,
      BlockPos var6,
      Direction var7,
      Map<Item, Integer> var8,
      List<BlockPos> var9,
      List<BlockPos> var10,
      List<BlockPos> var11,
      List<BlockPos> var12,
      List<BlockPos> var13
   ) {
      this.f_13974 = var1;
      this.f_13962 = var2;
      this.f_13963 = var3;
      this.f_13964 = var4;
      this.f_13965 = var5;
      this.f_13966 = var6;
      this.f_13967 = var7;
      this.f_13968 = var8;
      this.f_13969 = var9;
      this.f_13970 = var10;
      this.f_13971 = var11;
      this.f_13972 = var12;
      this.f_13973 = var13;
   }

   @Override
   public int m_4953() {
      return this.f_13965;
   }

   public static boolean m_4954(BlockState var0) {
      return var0.is(Blocks.REDSTONE_TORCH) || var0.is(Blocks.REDSTONE_WALL_TORCH);
   }

   private static BlockState m_4955(BlockState var0) {
      BlockState var1 = var0;
      if (var1.hasProperty(RedStoneWireBlock.POWER)) {
         var1 = (BlockState)var1.setValue(RedStoneWireBlock.POWER, 0);
      }

      if (var1.hasProperty(RepeaterBlock.POWERED)) {
         var1 = (BlockState)var1.setValue(RepeaterBlock.POWERED, false);
      }

      if (var1.hasProperty(RepeaterBlock.LOCKED)) {
         var1 = (BlockState)var1.setValue(RepeaterBlock.LOCKED, false);
      }

      if (var1.hasProperty(LeverBlock.POWERED)) {
         var1 = (BlockState)var1.setValue(LeverBlock.POWERED, false);
      }

      if (var1.hasProperty(HopperBlock.ENABLED)) {
         var1 = (BlockState)var1.setValue(HopperBlock.ENABLED, true);
      }

      if (var1.hasProperty(RedstoneTorchBlock.LIT)) {
         var1 = (BlockState)var1.setValue(RedstoneTorchBlock.LIT, true);
      }

      if (var1.hasProperty(BrewingStandBlock.HAS_BOTTLE[0])) {
         var1 = (BlockState)((BlockState)((BlockState)var1.setValue(BrewingStandBlock.HAS_BOTTLE[0], false)).setValue(BrewingStandBlock.HAS_BOTTLE[1], false))
            .setValue(BrewingStandBlock.HAS_BOTTLE[2], false);
      }

      return var1;
   }

   public BlockPos m_4956() {
      return this.f_13966;
   }

   private static BlockState m_4957(String var0, Map<String, String> var1) {
      Identifier var2 = Identifier.tryParse(var0);
      if (var2 == null) {
         return Blocks.AIR.defaultBlockState();
      }

      Block var3 = (Block)BuiltInRegistries.BLOCK.getValue(var2);
      BlockState var4 = var3.defaultBlockState();
      if (var1 != null && !var1.isEmpty()) {
         for (Entry var6 : var1.entrySet()) {
            Property var7 = var3.getStateDefinition().getProperty((String)var6.getKey());
            if (var7 != null) {
               Optional var8 = var7.getValue((String)var6.getValue());
               if (var8.isPresent()) {
                  var4 = (BlockState)var4.setValue(var7, (Comparable)var8.get());
               }
            }
         }

         return m_4955(var4);
      } else {
         return m_4955(var4);
      }
   }

   @Override
   public boolean m_4958(int var1, int var2, int var3) {
      if (var1 >= 0 && var2 >= 0 && var3 >= 0 && var1 < this.f_13963 && var2 < this.f_13964 && var3 < this.f_13965) {
         BlockState var4 = this.f_13962[var1][var2][var3];
         return var4 == null ? false : !m_4966(var4);
      } else {
         return false;
      }
   }

   private static String m_4959(BlockState var0, Direction var1) {
      return switch (var1) {
         case NORTH -> ((RedstoneSide)var0.getValue(RedStoneWireBlock.NORTH)).getSerializedName();
         case EAST -> ((RedstoneSide)var0.getValue(RedStoneWireBlock.EAST)).getSerializedName();
         case SOUTH -> ((RedstoneSide)var0.getValue(RedStoneWireBlock.SOUTH)).getSerializedName();
         case WEST -> ((RedstoneSide)var0.getValue(RedStoneWireBlock.WEST)).getSerializedName();
         default -> f_13982;
      };
   }

   public List<BlockPos> m_4960() {
      return this.f_13973;
   }

   public Map<Item, Integer> m_4961() {
      return this.f_13968;
   }

   public List<BlockPos> m_4962() {
      return this.f_13969;
   }

   private static Class_TGvi8ClmBcOOJSG4.DmXyejbKknQHckcI m_4963(String var0) {
      Class_TGvi8ClmBcOOJSG4.DmXyejbKknQHckcI var1 = f_13961.get(var0);
      if (var1 != null) {
         return var1;
      }

      String var2 = var0 + "";

      try (InputStream var3 = Class_TGvi8ClmBcOOJSG4.class.getClassLoader().getResourceAsStream(var2)) {
         if (var3 == null) {
            throw new IllegalStateException(var2 + "");
         }

         JsonObject var4 = JsonParser.parseReader(new InputStreamReader(var3, StandardCharsets.UTF_8)).getAsJsonObject();
         JsonArray var5 = var4.getAsJsonArray(f_13983);
         ArrayList var6 = new ArrayList(var5.size());

         for (JsonElement var8 : var5) {
            JsonObject var9 = var8.getAsJsonObject();
            HashMap var10 = new HashMap();
            if (var9.has(f_13984) && var9.get(f_13985).isJsonObject()) {
               for (Entry var12 : var9.getAsJsonObject(f_13986).entrySet()) {
                  var10.put((String)var12.getKey(), ((JsonElement)var12.getValue()).getAsString());
               }
            }

            var6.add(
               new Class_TGvi8ClmBcOOJSG4.i5IPmGeNYyN3LCJN(
                  var9.get(f_13987).getAsInt(), var9.get(f_13988).getAsInt(), var9.get(f_13989).getAsInt(), var9.get(f_13990).getAsString(), var10
               )
            );
         }

         Class_TGvi8ClmBcOOJSG4.DmXyejbKknQHckcI var17 = new Class_TGvi8ClmBcOOJSG4.DmXyejbKknQHckcI(var6);
         f_13961.put(var0, var17);
         return var17;
      } catch (IllegalStateException var15) {
         throw var15;
      } catch (Exception var16) {
         throw new IllegalStateException(var0 + var16.getMessage(), var16);
      }
   }

   private static BlockState m_4964(BlockState var0, Direction var1, String var2) {
      EnumProperty var3 = switch (var1) {
         case NORTH -> RedStoneWireBlock.NORTH;
         case EAST -> RedStoneWireBlock.EAST;
         case SOUTH -> RedStoneWireBlock.SOUTH;
         case WEST -> RedStoneWireBlock.WEST;
         default -> null;
      };
      if (var3 == null) {
         return var0;
      }

      Optional var4 = var3.getValue(var2);
      return var4.isPresent() ? (BlockState)var0.setValue(var3, (Comparable)var4.get()) : var0;
   }

   public List<BlockPos> m_4965() {
      return this.f_13970;
   }

   public static boolean m_4966(BlockState var0) {
      return var0.is(Blocks.CHEST) || var0.is(Blocks.HOPPER) || var0.is(Blocks.BREWING_STAND);
   }

   @Override
   public int m_4967() {
      return this.f_13963;
   }

   public BlockState m_4968(BlockPos var1) {
      int var2 = var1.getX() - this.f_13966.getX();
      int var3 = var1.getY() - this.f_13966.getY();
      int var4 = var1.getZ() - this.f_13966.getZ();
      return var2 >= 0 && var3 >= 0 && var4 >= 0 && var2 < this.f_13963 && var3 < this.f_13964 && var4 < this.f_13965 ? this.f_13962[var2][var3][var4] : null;
   }

   private static int[] m_4969(int var0, int var1, int var2) {
      return switch (Math.floorMod(var2, 4)) {
         case 1 -> new int[]{var1, -var0};
         case 2 -> new int[]{-var0, -var1};
         case 3 -> new int[]{-var1, var0};
         default -> new int[]{var0, var1};
      };
   }

   @Override
   public int m_4971() {
      return this.f_13964;
   }

   public Class_TGvi8ClmBcOOJSG4.YUyDnrU2lUsT07Dz m_4972() {
      return this.f_13974;
   }

   public static Class_TGvi8ClmBcOOJSG4 m_4974(Class_TGvi8ClmBcOOJSG4.YUyDnrU2lUsT07Dz var0, BlockPos var1, Direction var2) {
      Class_TGvi8ClmBcOOJSG4.DmXyejbKknQHckcI var3 = m_4963(var0.f_13959);
      int var4 = m_4948(var2);
      LinkedHashMap var5 = new LinkedHashMap();
      int var6 = f_13975;
      int var7 = f_13976;
      int var8 = f_13977;
      int var9 = f_13978;
      int var10 = f_13979;
      int var11 = f_13980;

      for (Class_TGvi8ClmBcOOJSG4.i5IPmGeNYyN3LCJN var13 : var3.blocks) {
         int[] var14 = m_4969(var13.x, var13.z, var4);
         BlockPos var15 = new BlockPos(var14[0], var13.y, var14[1]);
         BlockState var16 = m_4976(m_4957(var13.block, var13.props), var4);
         var5.put(var15, var16);
         var6 = Math.min(var6, var15.getX());
         var7 = Math.min(var7, var15.getY());
         var8 = Math.min(var8, var15.getZ());
         var9 = Math.max(var9, var15.getX());
         var10 = Math.max(var10, var15.getY());
         var11 = Math.max(var11, var15.getZ());
      }

      int var29 = var9 - var6 + 1;
      int var30 = var10 - var7 + 1;
      int var31 = var11 - var8 + 1;
      BlockState[][][] var32 = new BlockState[var29][var30][var31];
      ArrayList var33 = new ArrayList(var5.size());
      ArrayList var17 = new ArrayList();
      ArrayList var18 = new ArrayList();
      ArrayList var19 = new ArrayList();
      ArrayList var20 = new ArrayList();
      HashMap<Item, Integer> var21 = new HashMap<>();
      BlockPos var22 = var1;

      for (Object var24_o : var5.entrySet()) {
         Entry var24 = (Entry) var24_o;
         BlockPos var25 = ((BlockPos)var24.getKey()).offset(-var6, -var7, -var8);
         BlockState var26 = (BlockState)var24.getValue();
         var32[var25.getX()][var25.getY()][var25.getZ()] = var26;
         BlockPos var27 = var22.offset(var25.getX(), var25.getY(), var25.getZ());
         var33.add(var27);
         if (var26.is(Blocks.CHEST)) {
            var17.add(var27);
         }

         if (m_4954(var26)) {
            var18.add(var27);
         }

         if (var26.is(Blocks.HOPPER)) {
            var19.add(var27);
         }

         if (var26.is(Blocks.BREWING_STAND)) {
            var20.add(var27);
         }

         Item var28 = m_4949(var26);
         if (var28 != Items.AIR) {
            var21.merge(var28, 1, Integer::sum);
         }
      }

      return new Class_TGvi8ClmBcOOJSG4(var0, var32, var29, var30, var31, var22, var2, var21, var33, var17, var18, var19, var20);
   }

   public Direction m_4975() {
      return this.f_13967;
   }

   private static BlockState m_4976(BlockState var0, int var1) {
      if (var1 != 0 && var0 != null) {
         BlockState var2 = var0;
         if (var2.hasProperty(HopperBlock.FACING)) {
            var2 = (BlockState)var2.setValue(HopperBlock.FACING, m_4952((Direction)var2.getValue(HopperBlock.FACING), var1));
         }

         if (var2.hasProperty(HorizontalDirectionalBlock.FACING)) {
            var2 = (BlockState)var2.setValue(HorizontalDirectionalBlock.FACING, m_4952((Direction)var2.getValue(HorizontalDirectionalBlock.FACING), var1));
         }

         if (var2.hasProperty(RedstoneWallTorchBlock.FACING)) {
            var2 = (BlockState)var2.setValue(RedstoneWallTorchBlock.FACING, m_4952((Direction)var2.getValue(RedstoneWallTorchBlock.FACING), var1));
         }

         if (var2.hasProperty(LeverBlock.FACING)) {
            var2 = (BlockState)var2.setValue(LeverBlock.FACING, m_4952((Direction)var2.getValue(LeverBlock.FACING), var1));
         }

         if (var2.is(Blocks.REDSTONE_WIRE)) {
            String var3 = m_4959(var2, Direction.NORTH);
            String var4 = m_4959(var2, Direction.EAST);
            String var5 = m_4959(var2, Direction.SOUTH);
            String var6 = m_4959(var2, Direction.WEST);
            String[] var7 = new String[4];
            String[] var8 = new String[]{var3, var4, var5, var6};

            for (int var9 = 0; var9 < 4; var9++) {
               var7[(var9 + var1) % 4] = var8[var9];
            }

            var2 = m_4964(var2, Direction.NORTH, var7[0]);
            var2 = m_4964(var2, Direction.EAST, var7[1]);
            var2 = m_4964(var2, Direction.SOUTH, var7[2]);
            var2 = m_4964(var2, Direction.WEST, var7[3]);
         }

         return var2;
      } else {
         return var0;
      }
   }

   private static boolean m_4977(BlockState var0, BlockState var1) {
      if (var0.hasProperty(HopperBlock.FACING) && var1.hasProperty(HopperBlock.FACING)) {
         return var0.getValue(HopperBlock.FACING) == var1.getValue(HopperBlock.FACING);
      } else if (var0.hasProperty(HorizontalDirectionalBlock.FACING) && var1.hasProperty(HorizontalDirectionalBlock.FACING)) {
         return var0.getValue(HorizontalDirectionalBlock.FACING) == var1.getValue(HorizontalDirectionalBlock.FACING);
      } else {
         return var0.hasProperty(RedstoneWallTorchBlock.FACING) && var1.hasProperty(RedstoneWallTorchBlock.FACING)
            ? var0.getValue(RedstoneWallTorchBlock.FACING) == var1.getValue(RedstoneWallTorchBlock.FACING)
            : true;
      }
   }

   public List<BlockPos> m_4978() {
      return this.f_13971;
   }

   private record DmXyejbKknQHckcI(List<Class_TGvi8ClmBcOOJSG4.i5IPmGeNYyN3LCJN> blocks) {
   }

   public enum YUyDnrU2lUsT07Dz {
      OBYCHNAYA_PITEVYE("obychnaya_pitevye", "Обычная питьевые");

      public final String f_13959;
      public final String f_13960;

      YUyDnrU2lUsT07Dz(String var3, String var4) {
         this.f_13959 = var3;
         this.f_13960 = var4;
      }

      public static Class_TGvi8ClmBcOOJSG4.YUyDnrU2lUsT07Dz m_4946(String var0) {
         return OBYCHNAYA_PITEVYE;
      }
   }

   private record i5IPmGeNYyN3LCJN(int x, int y, int z, String block, Map<String, String> props) {
   }
}
