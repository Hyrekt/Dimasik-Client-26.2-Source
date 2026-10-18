package dev.dimasik.client.module.misc;

import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.IntegerSetting;
import dev.dimasik.client.system.Class_81oIJPtsDGdzRKcL;
import dev.dimasik.client.system.Class_B6JOzHnwhU3pe4AO;
import dev.dimasik.client.system.Class_TGvi8ClmBcOOJSG4;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_bhSc4OUnYWSe2vjL;
import dev.dimasik.client.system.Class_ftHu9o3WzCU3Adxm;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_gXPXh2FDkuYBeJW2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

public class AutoBrewerBuilder extends Module {
   public static volatile boolean f_35031 = false;
   public static volatile boolean f_35032 = false;
   private static final int f_35033 = -16718337;
   private static final int f_35034 = -26624;
   private static final int f_35035 = -2080517;
   private final CheckboxSetting f_35036;
   private final IntegerSetting f_35037;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_35038;
   private final Class_gEPk7yDw6CwIte87<Class_B6JOzHnwhU3pe4AO> f_35039;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_35040;
   private AutoBrewerBuilder.Class_8PQxylopfZAapUNb f_35041;
   private Class_TGvi8ClmBcOOJSG4 f_35042;
   private BlockPos f_35043;
   private int f_35044;
   private boolean f_35045;
   private String f_35046;
   private boolean f_35047;
   private boolean f_35048;
   private static final String f_35049 = "AutoBrewerBuilder";
   private static final String f_35050 = "Каркас автозельеварки через Baritone (сундуки/воронки/стойки — руками)";
   private static final String f_35051 = "Заменять траву/снег";
   private static final String f_35052 = "Клавиша отключения";
   private static final String f_35053 = "Выключено биндом.";
   private static final int f_35054 = -16718337;
   private static final int f_35055 = -2080517;
   private static final String f_35056 = "Нет игрока или мира";
   private static final String f_35057 = "Нужен Baritone в mods";
   private static final String f_35058 = "allowBreak";
   private static final String f_35059 = "allowPlace";
   private static final String f_35060 = "allowInventory";
   private static final String f_35061 = "buildInLayers";
   private static final String f_35062 = "layerOrder";
   private static final String f_35063 = "distanceTrim";
   private static final String f_35064 = "rightClickContainerOnArrival";
   private static final String f_35065 = "AutoBrewer";
   private static final String f_35066 = "Baritone: булыжник / редстоун / повторители / рычаг / факела.";
   private static final String f_35067 = "Сундуки(голубой) / воронки(оранж) / стойки(розовый) — ставь сам.";
   private static final String f_35068 = "AutoBrewer";
   private static final String f_35069 = "?";
   private static final String f_35070 = "Каркас готов. Сундуки / воронки / стойки — по цвету, руками.";
   private static final String f_35071 = ", ";

   private void m_9476() {
      if (!Class_gXPXh2FDkuYBeJW2.m_6800()) {
         this.m_9482(f_35057);
      } else {
         Class_TGvi8ClmBcOOJSG4.YUyDnrU2lUsT07Dz var1 = Class_TGvi8ClmBcOOJSG4.YUyDnrU2lUsT07Dz.OBYCHNAYA_PITEVYE;
         Direction var2 = f_11537.player.getDirection();

         try {
            this.f_35042 = Class_TGvi8ClmBcOOJSG4.m_4974(var1, f_11537.player.blockPosition(), var2);
            this.f_35043 = this.f_35042.m_4956();
         } catch (Throwable var5) {
            var5.printStackTrace();
            this.m_9482(var5.getMessage() + "");
            return;
         }

         String var3 = this.m_9491();
         if (var3 != null) {
            this.m_9482(var3);
         } else {
            var3 = this.m_9490();
            if (var3 != null) {
               this.m_9482(var3);
            } else {
               try {
                  Class_gXPXh2FDkuYBeJW2.m_6789();
                  Class_gXPXh2FDkuYBeJW2.m_6798(f_35058, true);
                  Class_gXPXh2FDkuYBeJW2.m_6798(f_35059, true);
                  Class_gXPXh2FDkuYBeJW2.m_6798(f_35060, true);
                  Class_gXPXh2FDkuYBeJW2.m_6798(f_35061, true);
                  Class_gXPXh2FDkuYBeJW2.m_6798(f_35062, false);
                  Class_gXPXh2FDkuYBeJW2.m_6798(f_35063, false);
                  Class_gXPXh2FDkuYBeJW2.m_6798(f_35064, false);
                  Class_gXPXh2FDkuYBeJW2.m_6802();
                  var3 = Class_gXPXh2FDkuYBeJW2.m_6810(f_35065, this.f_35042, this.f_35043);
                  if (var3 != null) {
                     this.m_9482(var3);
                     return;
                  }

                  Class_gXPXh2FDkuYBeJW2.m_6819();
               } catch (Throwable var6) {
                  var6.printStackTrace();
                  this.m_9482(var6.getMessage() + "");
                  return;
               }

               this.f_35045 = true;
               this.f_35044 = 0;
               this.f_35048 = false;
               this.f_35041 = AutoBrewerBuilder.Class_8PQxylopfZAapUNb.BUILD_STRUCTURE;
               this.m_9492(var1.f_13960 + var2.name() + this.f_35042.m_4967() + this.f_35042.m_4971() + this.f_35042.m_4953());
               this.m_9492(f_35066);
               this.m_9492(f_35067);
            }
         }
      }
   }

   private boolean m_9477(BlockState var1, BlockState var2) {
      if (Class_TGvi8ClmBcOOJSG4.m_4954(var2)) {
         return Class_TGvi8ClmBcOOJSG4.m_4954(var1);
      } else if (var1.getBlock() != var2.getBlock()) {
         return false;
      } else {
         return !var2.is(Blocks.REDSTONE_WIRE) && !var2.is(Blocks.REPEATER) && !var2.is(Blocks.LEVER) ? var1.equals(var2) : true;
      }
   }

   private boolean m_9478(BlockPos var1, Block var2) {
      return f_11537.level.getBlockState(var1).is(var2);
   }

   @Override
   public void m_732() {
      f_35031 = false;
      f_35032 = false;
      if (this.f_35045) {
         try {
            Class_gXPXh2FDkuYBeJW2.m_6809();
            Class_gXPXh2FDkuYBeJW2.m_6802();
         } catch (Throwable var2) {
         }
      }

      this.m_9481();
      super.m_732();
   }

   private void m_9479(Item var1) {
      try {
         for (int var2 = 0; var2 < 9; var2++) {
            if (f_11537.player.getInventory().getItem(var2).is(var1)) {
               return;
            }
         }

         for (int var6 = 9; var6 < 36; var6++) {
            if (f_11537.player.getInventory().getItem(var6).is(var1)) {
               int var3 = 0;

               for (int var4 = 0; var4 < 9; var4++) {
                  if (f_11537.player.getInventory().getItem(var4).isEmpty()) {
                     var3 = var4;
                     break;
                  }
               }

               f_11537.gameMode.handleContainerInput(f_11537.player.inventoryMenu.containerId, var6, var3, ContainerInput.SWAP, f_11537.player);
               return;
            }
         }
      } catch (Throwable var5) {
      }
   }

   public AutoBrewerBuilder() {
      super(f_35049, f_35050, Category.MISC);
      this.f_35036 = new CheckboxSetting(f_35051, true);
      this.f_35037 = new IntegerSetting(f_35052, -1);
      this.f_35038 = this::m_9485;
      this.f_35039 = this::m_9480;
      this.f_35040 = this::m_9484;
      this.f_35041 = AutoBrewerBuilder.Class_8PQxylopfZAapUNb.IDLE;
      this.m_795(this.f_35036, this.f_35037);
   }

   private void m_9480(Class_B6JOzHnwhU3pe4AO var1) {
      int var2 = this.f_35037.m_8768();
      if (var2 != -1 && var2 == var1.m_2117() && var1.m_2116() == 1) {
         if (this.m_776()) {
            this.m_9492(f_35053);
            this.m_9482(null);
         }
      }
   }

   private void m_9481() {
      f_35031 = false;
      f_35032 = false;
      this.f_35041 = AutoBrewerBuilder.Class_8PQxylopfZAapUNb.IDLE;
      this.f_35042 = null;
      this.f_35043 = null;
      this.f_35044 = 0;
      this.f_35045 = false;
      this.f_35046 = null;
      this.f_35047 = false;
      this.f_35048 = false;
   }

   private void m_9482(String var1) {
      f_35031 = false;
      f_35032 = false;
      this.f_35046 = var1;
      this.f_35041 = AutoBrewerBuilder.Class_8PQxylopfZAapUNb.STOP_PENDING;
   }

   private int m_9483(Item var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < 36; var3++) {
         ItemStack var4 = f_11537.player.getInventory().getItem(var3);
         if (var4.is(var1)) {
            var2 += var4.getCount();
         }
      }

      ItemStack var5 = f_11537.player.getOffhandItem();
      if (var5.is(var1)) {
         var2 += var5.getCount();
      }

      return var2;
   }

   private void m_9484(Class_TZhU50s8XmBQCMP5 var1) {
      if (this.m_776() && this.f_35042 != null && f_11537.level != null) {
         try {
            VertexConsumer var2 = var1.m_5008().m_881(Class_81oIJPtsDGdzRKcL.f_3816);
            Vec3 var3 = var1.m_5010();

            for (BlockPos var5 : this.f_35042.m_4965()) {
               if (!this.m_9478(var5, Blocks.CHEST)) {
                  this.m_9488(var1, var2, var3, var5, f_35054);
               }
            }

            for (BlockPos var9 : this.f_35042.m_4947()) {
               if (!this.m_9478(var9, Blocks.HOPPER)) {
                  this.m_9488(var1, var2, var3, var9, -26624);
               }
            }

            for (BlockPos var10 : this.f_35042.m_4960()) {
               if (!this.m_9478(var10, Blocks.BREWING_STAND)) {
                  this.m_9488(var1, var2, var3, var10, f_35055);
               }
            }
         } catch (Throwable var6) {
         }
      }
   }

   private void m_9485(Class_Xu9btcIeUN33XnMK var1) {
      if (!this.f_35047 && this.m_776()) {
         try {
            if (f_11537.player == null || f_11537.level == null) {
               this.m_9482(f_35056);
               return;
            }

            switch (this.f_35041) {
               case START_PENDING:
                  this.m_9476();
                  break;
               case BUILD_STRUCTURE:
                  this.m_9489();
                  break;
               case STOP_PENDING:
                  this.m_9486();
            }
         } catch (Throwable var3) {
            var3.printStackTrace();
            this.m_9482(var3.getClass().getSimpleName() + var3.getMessage());
         }
      }
   }

   private void m_9486() {
      if (!this.f_35047) {
         this.f_35047 = true;
         f_35031 = false;
         f_35032 = false;

         try {
            if (this.f_35045) {
               Class_gXPXh2FDkuYBeJW2.m_6809();
               Class_gXPXh2FDkuYBeJW2.m_6802();
            }
         } catch (Throwable var2) {
         }

         if (this.f_35046 != null && !this.f_35046.isEmpty()) {
            this.m_9492(this.f_35046 + "");
         }

         if (this.m_776()) {
            this.m_777();
         }
      }
   }

   private List<BlockPos> m_9487(int var1) {
      ArrayList var2 = new ArrayList();

      for (BlockPos var4 : this.f_35042.m_4962()) {
         BlockState var5 = this.f_35042.m_4968(var4);
         if (var5 != null && !Class_TGvi8ClmBcOOJSG4.m_4966(var5) && !this.m_9477(f_11537.level.getBlockState(var4), var5)) {
            var2.add(var4.immutable());
            if (var2.size() >= var1) {
               break;
            }
         }
      }

      return var2;
   }

   private void m_9488(Class_TZhU50s8XmBQCMP5 var1, VertexConsumer var2, Vec3 var3, BlockPos var4, int var5) {
      Class_bhSc4OUnYWSe2vjL.m_6088(
         var1.m_5006(), var2, var3, var4.getX(), var4.getY(), var4.getZ(), var4.getX() + 1, var4.getY() + 1, var4.getZ() + 1, var5, false
      );
   }

   private void m_9489() {
      boolean var1 = Class_gXPXh2FDkuYBeJW2.m_6792();
      if (var1) {
         if (!this.f_35048) {
            this.m_9479(Items.COBBLESTONE);
            this.m_9479(Items.REPEATER);
            this.m_9479(Items.REDSTONE);
            this.m_9479(Items.LEVER);
            this.m_9479(Items.REDSTONE_TORCH);
         }

         Class_gXPXh2FDkuYBeJW2.m_6819();
      }

      this.f_35048 = var1;
      List var2 = this.m_9487(20);
      boolean var3 = Class_gXPXh2FDkuYBeJW2.m_6815() && !var1;
      if (!var2.isEmpty()) {
         if (var3) {
            this.f_35044 = 0;
         } else {
            this.f_35044++;
            if (this.f_35044 == 60 || this.f_35044 == 140) {
               try {
                  this.m_9479(Items.COBBLESTONE);
                  this.m_9479(Items.REPEATER);
                  this.m_9479(Items.REDSTONE);
                  this.m_9479(Items.REDSTONE_TORCH);
                  Class_gXPXh2FDkuYBeJW2.m_6819();
                  Class_gXPXh2FDkuYBeJW2.m_6810(f_35068, this.f_35042, this.f_35043);
               } catch (Throwable var6) {
               }
            }

            if (this.f_35044 > 500) {
               BlockPos var4 = (BlockPos)var2.get(0);
               BlockState var5 = this.f_35042.m_4968(var4);
               this.m_9482((var5 == null ? f_35069 : var5.getBlock().getName().getString()) + var4.toShortString());
            }
         }
      } else {
         Class_gXPXh2FDkuYBeJW2.m_6802();
         Class_gXPXh2FDkuYBeJW2.m_6809();
         this.m_9492(f_35070);
         this.m_9482(null);
      }
   }

   private String m_9490() {
      ArrayList var1 = new ArrayList();

      for (Entry var3 : this.f_35042.m_4961().entrySet()) {
         Item var4 = (Item)var3.getKey();
         if (var4 != Items.CHEST && var4 != Items.HOPPER && var4 != Items.BREWING_STAND) {
            int var5 = this.m_9483(var4);
            if (var4 == Items.REDSTONE_TORCH) {
               for (BlockPos var7 : this.f_35042.m_4978()) {
                  if (Class_TGvi8ClmBcOOJSG4.m_4954(f_11537.level.getBlockState(var7))) {
                     var5++;
                  }
               }
            }

            if (var5 < (Integer)var3.getValue()) {
               var1.add(var4.getDefaultInstance().getItemName().getString() + ((Integer)var3.getValue() - var5));
            }
         }
      }

      return var1.isEmpty() ? null : String.join(f_35071, var1) + "";
   }

   private String m_9491() {
      for (BlockPos var2 : this.f_35042.m_4962()) {
         BlockState var3 = f_11537.level.getBlockState(var2);
         if (!var3.isAir() && (!this.f_35036.m_8768() || !var3.canBeReplaced())) {
            BlockState var4 = this.f_35042.m_4968(var2);
            if ((var4 == null || var3.getBlock() != var4.getBlock()) && (var4 == null || !Class_TGvi8ClmBcOOJSG4.m_4966(var4))) {
               return var3.getBlock().getName().getString() + var2.toShortString();
            }
         }
      }

      return null;
   }

   private void m_9492(String var1) {
      try {
         if (f_11537.player != null) {
            Class_ftHu9o3WzCU3Adxm.m_6731(var1);
         }
      } catch (Throwable var3) {
      }
   }

   @Override
   public void m_778() {
      super.m_778();
      this.m_9481();
      this.f_35041 = AutoBrewerBuilder.Class_8PQxylopfZAapUNb.START_PENDING;
   }

   private enum Class_8PQxylopfZAapUNb {
      IDLE,
      START_PENDING,
      BUILD_STRUCTURE,
      STOP_PENDING;
   }
}
