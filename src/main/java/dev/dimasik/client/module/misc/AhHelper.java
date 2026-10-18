package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.IntegerSetting;
import dev.dimasik.client.system.Class_B6JOzHnwhU3pe4AO;
import dev.dimasik.client.system.Class_Ml5wz5ZzsIO8LGs2;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.core.NonNullList;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.ItemLore;

public final class AhHelper extends Module {
   private static final long f_16025 = 60100L;
   private static AhHelper f_16026;
   private final IntegerSetting f_16027;
   private final CheckboxSetting f_16028;
   private final CheckboxSetting f_16029;
   private final CheckboxSetting f_16030;
   private final CheckboxSetting f_16031;
   private final Class_gEPk7yDw6CwIte87<Class_B6JOzHnwhU3pe4AO> f_16032;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_16033;
   private Set<Integer> f_16034;
   private Set<Integer> f_16035;
   private long f_16036;
   private long f_16037;
   private static final String f_16038 = "AhHelper";
   private static final String f_16039 = "Помощник аукциона";
   private static final String f_16040 = "Поиск предмета в руке";
   private static final String f_16041 = "Четыре самых дешёвых";
   private static final String f_16042 = "Четыре выгодных за штуку";
   private static final String f_16043 = "Цена за 1 предмет";
   private static final String f_16044 = "Перевыставление предметов";
   private static final long f_16045 = -1L;
   private static final long f_16046 = 300L;
   private static final long f_16047 = 4L;
   private static final long f_16048 = 4L;
   private static final String f_16049 = "хранилище";
   private static final String f_16050 = "storage";
   private static final long f_16051 = -1L;
   private static final long f_16052 = 60100L;
   private static final String f_16053 = "причин";
   private static final String f_16054 = "reason";
   private static final String f_16055 = "продано";
   private static final String f_16056 = "sold";
   private static final double f_16057 = Double.MAX_VALUE;
   private static final double f_16058 = Double.MAX_VALUE;
   private static final String f_16059 = "Цена за 1 шт:";
   private static final String f_16060 = "Цена";
   private static final String f_16061 = ".*\\$\\s*[\\d,.]+.*";
   private static final String f_16062 = "аукцион";
   private static final String f_16063 = "аукционы";
   private static final String f_16064 = "auction";
   private static final String f_16065 = "поиск";
   private static final String f_16066 = "search";
   private static final String f_16067 = "п:";
   private static final String f_16068 = "0a2z";
   private static final String f_16069 = "^\\[★\\]\\s*";
   private static final String f_16070 = "[★]";
   private static final String f_16071 = "^\\[.*?]\\s*";
   private static final String f_16072 = "\\s+";
   private static final String f_16073 = " ";
   private static final String f_16074 = "(?i)§[0-9A-FK-OR]";
   private static final String f_16075 = "(?i)&[0-9A-FK-OR]";
   private static final String f_16076 = "\\[[^]]*]";
   private static final String f_16077 = "\\s+";
   private static final String f_16078 = " ";

   private void m_5588() {
      if (f_11537.gui.screen() instanceof AbstractContainerScreen var1 && m_5603(var1)) {
         List<Slot> var6 = this.m_5604(var1);
         if (this.f_16028.m_8768()) {
            this.f_16034 = var6.stream()
               .filter(this::m_5595)
               .map(var1x -> new AhHelper.am7zQAkzqcjJsWYv(var1x.index, Class_Ml5wz5ZzsIO8LGs2.m_3969(var1x.getItem()), this.m_5605(var1x)))
               .sorted(Comparator.comparingInt(AhHelper.am7zQAkzqcjJsWYv::price))
               .limit(f_16047)
               .map(AhHelper.am7zQAkzqcjJsWYv::m_5586)
               .collect(Collectors.toUnmodifiableSet());
         } else {
            this.f_16034 = Set.of();
         }

         if (this.f_16029.m_8768()) {
            this.f_16035 = var6.stream()
               .filter(this::m_5595)
               .filter(var0 -> var0.getItem().getCount() > 1)
               .map(var1x -> new AhHelper.am7zQAkzqcjJsWYv(var1x.index, Class_Ml5wz5ZzsIO8LGs2.m_3969(var1x.getItem()), this.m_5605(var1x)))
               .sorted(Comparator.comparingDouble(AhHelper.am7zQAkzqcjJsWYv::unitPrice))
               .limit(f_16048)
               .map(AhHelper.am7zQAkzqcjJsWYv::m_5586)
               .collect(Collectors.toUnmodifiableSet());
         } else {
            this.f_16035 = Set.of();
         }

         if (this.f_16030.m_8768()) {
            for (Slot var4 : var6) {
               ItemStack var5 = var4.getItem();
               if (var5 != null && !var5.isEmpty() && var5.getCount() > 1) {
                  this.m_5598(var5);
               }
            }
         }
      } else {
         this.f_16034 = Set.of();
         this.f_16035 = Set.of();
      }
   }

   private static String m_5589(int var0) {
      String var1 = Integer.toString(var0);
      StringBuilder var2 = new StringBuilder();
      int var3 = 0;

      for (int var4 = var1.length() - 1; var4 >= 0; var4--) {
         if (var3 > 0 && var3 % 3 == 0) {
            var2.insert(0, '.');
         }

         var2.insert(0, var1.charAt(var4));
         var3++;
      }

      return var2.toString();
   }

   private static String m_5592(String var0) {
      return var0 == null ? "" : var0.replaceAll(f_16074, "").replaceAll(f_16075, "").replaceAll(f_16076, "").replaceAll(f_16077, f_16078).trim();
   }

   private void m_5593() {
      this.m_5588();
      this.m_5597();
   }

   public static boolean m_5594(int var0) {
      return f_16026 != null && f_16026.m_776() && f_16026.f_16028.m_8768() && f_16026.f_16034.contains(var0);
   }

   private boolean m_5595(Slot var1) {
      if (var1 == null || !var1.hasItem()) {
         return false;
      } else {
         return this.m_5599(var1.getItem()) ? false : Class_Ml5wz5ZzsIO8LGs2.m_3969(var1.getItem()) > 0;
      }
   }

   private void m_5596(Class_B6JOzHnwhU3pe4AO var1) {
      if (f_11537.gui.screen() == null || f_11537.gui.screen() instanceof AbstractContainerScreen) {
         if (var1.m_2116() == 1) {
            if (var1.m_2117() == this.f_16027.m_8768()) {
               if (System.currentTimeMillis() - this.f_16036 >= f_16046) {
                  if (f_11537.player != null) {
                     ItemStack var2 = f_11537.player.getMainHandItem();
                     if (var2 != null && !var2.isEmpty()) {
                        String var3 = m_5606(var2);
                        if (!var3.isBlank()) {
                           f_11537.player.connection.sendCommand(var3 + "");
                           this.f_16036 = System.currentTimeMillis();
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void m_5597() {
      if (this.f_16031.m_8768()) {
         if (f_11537.gui.screen() instanceof AbstractContainerScreen var1) {
            if (f_11537.player != null && f_11537.gameMode != null) {
               String var7 = m_5600(var1.getTitle().getString());
               if (var7.contains(f_16049) || var7.contains(f_16050)) {
                  long var3 = System.currentTimeMillis();
                  if (this.f_16037 == f_16051 || var3 - this.f_16037 >= f_16052) {
                     NonNullList var5 = var1.getMenu().slots;
                     if (var5.size() > 52) {
                        Slot var6 = (Slot)var5.get(52);
                        if (var6 != null && var6.hasItem()) {
                           f_11537.gameMode.handleContainerInput(var1.getMenu().containerId, 52, 0, ContainerInput.QUICK_MOVE, f_11537.player);
                           this.f_16037 = var3;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void m_5598(ItemStack var1) {
      int var2 = Class_Ml5wz5ZzsIO8LGs2.m_3969(var1);
      if (var2 > 0) {
         int var3 = var1.getCount();
         if (var3 > 1) {
            int var4 = var2 / var3;
            String var5 = m_5589(var4) + "";
            ItemLore var6 = (ItemLore)var1.get(DataComponents.LORE);
            ArrayList var7 = new ArrayList();
            if (var6 != null) {
               for (Component var9 : var6.lines()) {
                  if (var9.getString().contains(f_16059)) {
                     return;
                  }

                  var7.add(var9);
               }
            }

            boolean var13 = false;
            ArrayList var14 = new ArrayList();

            for (Component var11 : (Iterable<Component>) (Iterable) var7) {
               var14.add(var11);
               if (!var13) {
                  String var12 = var11.getString();
                  if (var12.contains(f_16060) || var12.matches(f_16061)) {
                     var14.add(Component.literal(var5));
                     var13 = true;
                  }
               }
            }

            if (!var13) {
               var14.add(Component.literal(var5));
            }

            var1.set(DataComponents.LORE, new ItemLore(var14));
         }
      }
   }

   private boolean m_5599(ItemStack var1) {
      if (var1 != null && !var1.isEmpty()) {
         ItemLore var2 = (ItemLore)var1.get(DataComponents.LORE);
         if (var2 == null) {
            return false;
         }

         for (Component var4 : var2.lines()) {
            String var5 = m_5600(var4.getString());
            boolean var6 = var5.contains(f_16053) || var5.contains(f_16054);
            boolean var7 = var5.contains(f_16055) || var5.contains(f_16056);
            if (var6 && var7) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private static String m_5600(String var0) {
      return var0 == null ? "" : var0.toLowerCase(Locale.ROOT).replace(' ', ' ').trim();
   }

   public static boolean m_5601(int var0) {
      return f_16026 != null && f_16026.m_776() && f_16026.f_16029.m_8768() && f_16026.f_16035.contains(var0);
   }

   public AhHelper() {
      super(f_16038, f_16039, Category.MISC);
      this.f_16027 = new IntegerSetting(f_16040);
      this.f_16028 = new CheckboxSetting(f_16041, true);
      this.f_16029 = new CheckboxSetting(f_16042, true);
      this.f_16030 = new CheckboxSetting(f_16043, true);
      this.f_16031 = new CheckboxSetting(f_16044, false);
      this.f_16032 = this::m_5596;
      this.f_16033 = var1 -> this.m_5593();
      this.f_16034 = Set.of();
      this.f_16035 = Set.of();
      this.f_16037 = f_16045;
      f_16026 = this;
      this.m_795(this.f_16027, this.f_16028, this.f_16029, this.f_16030, this.f_16031);
   }

   private static boolean m_5603(AbstractContainerScreen<?> var0) {
      String var1 = m_5600(var0.getTitle().getString());
      return var1.contains(f_16062)
         || var1.contains(f_16063)
         || var1.contains(f_16064)
         || var1.contains(f_16065)
         || var1.contains(f_16066)
         || var1.contains(f_16067)
         || var1.contains(f_16068);
   }

   private List<Slot> m_5604(AbstractContainerScreen<?> var1) {
      NonNullList var2 = var1.getMenu().slots;
      return var2 != null && !var2.isEmpty() ? var2.subList(0, Math.min(54, var2.size())) : List.of();
   }

   private double m_5605(Slot var1) {
      if (var1 != null && var1.hasItem()) {
         int var2 = Class_Ml5wz5ZzsIO8LGs2.m_3969(var1.getItem());
         if (var2 <= 0) {
            return f_16058;
         }

         int var3 = Math.max(1, var1.getItem().getCount());
         return (double)var2 / var3;
      } else {
         return f_16057;
      }
   }

   private static String m_5606(ItemStack var0) {
      String var1 = m_5592(var0.getHoverName().getString());
      if (var1.isBlank()) {
         var1 = m_5592(var0.getItemName().getString());
      }

      return var1.replaceAll(f_16069, "").replace(f_16070, "").replaceAll(f_16071, "").replaceAll(f_16072, f_16073).trim();
   }

   private record am7zQAkzqcjJsWYv(int id, int price, double unitPrice) {
      public int m_5586() {
         return this.id;
      }
   }
}
