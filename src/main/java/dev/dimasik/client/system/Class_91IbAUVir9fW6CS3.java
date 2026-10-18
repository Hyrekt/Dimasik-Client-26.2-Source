package dev.dimasik.client.system;

import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;
import net.minecraft.network.protocol.game.ClientboundContainerSetContentPacket;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Item.TooltipContext;

public final class Class_91IbAUVir9fW6CS3 extends Class_msKbTl6QleqYGoq3 implements Class_NzJrN63M7QBpmAbi {
   private final List<Class_91IbAUVir9fW6CS3.GHNnSIM8fTUdKkO7> f_4556 = new ArrayList<>();
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_4557 = this::m_1925;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_4558 = this::m_1921;
   private String f_4559;
   private Class_91IbAUVir9fW6CS3.tUwSkh1go39kcLhR f_4560;
   private static final String f_4561 = "ah";
   private static final String f_4562 = "sell";
   private static final String f_4563 = "процент";
   private static final String f_4564 = "Авто-продажа недоступна для обычных предметов — только для донатных";
   private static final double f_4565 = 100.0;
   private static final String f_4566 = "(?i)§[0-9A-FK-ORX]";
   private static final String f_4567 = " ";
   private static final String f_4568 = "\\[\\d+x\\d+]";
   private static final String f_4569 = " ";
   private static final String f_4570 = "\\[[^\\]]*]";
   private static final String f_4571 = " ";
   private static final String f_4572 = "(?i)\\bxxx\\b";
   private static final String f_4573 = " ";
   private static final String f_4574 = "[^\\p{L}\\p{N}\\-\\s]";
   private static final String f_4575 = " ";
   private static final String f_4576 = "\\s+";
   private static final String f_4577 = " ";
   private static final String f_4578 = "Товар не актуален";
   private static final String f_4579 = "$ Ценa: ";
   private static final String f_4580 = "$ Ценa: ";
   private static final String f_4581 = "$ Ценa: ";
   private static final String f_4582 = ",";
   private static final String f_4583 = "$";
   private static final String f_4584 = "\\s+";
   private static final long f_4585 = 15000L;
   private static final double f_4586 = 0.75;
   private static final String f_4587 = "Нажмите, чтобы забрать";
   private static final String f_4588 = "процент";

   private void m_1921(Class_Xu9btcIeUN33XnMK var1) {
      if (this.f_4559 != null && f_11537.player != null) {
         if (f_11537.gui.screen() != null) {
            f_11537.player.closeContainer();
         } else {
            f_11537.player.connection.sendCommand(this.f_4559);
            this.f_4559 = null;
         }
      }
   }

   @Override
   public void build(LiteralArgumentBuilder<ClientSuggestionProvider> var1) {
      ((LiteralArgumentBuilder)var1.executes(var1x -> {
         ItemStack var2 = f_11537.player.getMainHandItem();
         if (!var2.isEmpty()) {
            f_11537.player.connection.sendCommand(this.m_1929(var2) + "");
         }

         return 1;
      })).then(((LiteralArgumentBuilder)this.m_7628(f_4562).executes(var1x -> {
         this.m_1933(0.0F);
         return 1;
      })).then(this.m_7624(f_4563, FloatArgumentType.floatArg()).executes(var1x -> {
         this.m_1933(FloatArgumentType.getFloat(var1x, f_4588));
         return 1;
      })));
   }

   private void m_1924(Class_91IbAUVir9fW6CS3.tUwSkh1go39kcLhR var1, int var2) {
      long var3 = Math.max(1L, Math.round(var2 * (1.0 - var1.percent() / f_4565) * Math.max(1, var1.count())));
      String var5 = var1.entry().name();
      Class_ftHu9o3WzCU3Adxm.m_6731(var5 + var3 + var5 + (int)var1.percent());
      this.f_4559 = var3 + "";
   }

   private void m_1925(Class_XzpX8S5F5zd9jbuE var1) {
      if (this.f_4560 != null && this.f_4559 == null && var1.m_5619() != null) {
         if (var1.m_5619() instanceof ClientboundContainerSetContentPacket var2 && var2.containerId() != 0) {
            List<ItemStack> var7 = var2.items();
            List<Integer> var4 = var7.subList(0, Math.max(0, var7.size() - 36))
               .stream()
               .filter(
                  var1x -> this.f_4560.entry().matches(var1x)
                     && var1x.getTooltipLines(TooltipContext.EMPTY, f_11537.player, TooltipFlag.NORMAL)
                        .stream()
                        .noneMatch(var0 -> var0.getString().contains(f_4587))
               )
               .mapToInt(Class_91IbAUVir9fW6CS3::m_1932)
               .filter(var0 -> var0 > 0)
               .sorted()
               .boxed()
               .toList();
            if (!var4.isEmpty()) {
               int var5 = (Integer)var4.get(Math.min(2, var4.size() - 1));
               int var6 = var4.stream().filter(var1x -> var1x.intValue() >= var5 * f_4586).findFirst().orElse(var5);
               this.f_4556.removeIf(var1x -> var1x.entry() == this.f_4560.entry());
               this.f_4556.add(new Class_91IbAUVir9fW6CS3.GHNnSIM8fTUdKkO7(this.f_4560.entry(), var6, System.currentTimeMillis()));
               this.m_1924(this.f_4560, var6);
            }

            this.f_4560 = null;
         }
      }
   }

   public Class_91IbAUVir9fW6CS3() {
      super(f_4561);
   }

   private String m_1929(ItemStack var1) {
      String var2 = var1.getHoverName().getString();
      return var2.replaceAll(f_4566, f_4567)
         .replaceAll(f_4568, f_4569)
         .replaceAll(f_4570, f_4571)
         .replaceAll(f_4572, f_4573)
         .replaceAll(f_4574, f_4575)
         .trim()
         .replaceAll(f_4576, f_4577);
   }

   private static int m_1932(ItemStack var0) {
      if (var0.isEmpty()) {
         return -1;
      }

      List<String> var1 = var0.getTooltipLines(TooltipContext.EMPTY, f_11537.player, TooltipFlag.NORMAL).stream().skip(1L).map(var0x -> var0x.getString()).toList();
      if (!var0.getItemName().getString().contains(f_4578) && var0.getItem() != Items.DYE.gray()) {
         for (String var3 : var1) {
            if (var3.contains(f_4579)) {
               String var4 = var3.substring(var3.indexOf(f_4580) + f_4581.length()).trim().replace(f_4582, "").replace(f_4583, "").replaceAll(f_4584, "");
               if (!var4.isEmpty()) {
                  try {
                     return Integer.parseInt(var4) / (var0.getCount() > 0 ? var0.getCount() : 1);
                  } catch (NumberFormatException var6) {
                     return -1;
                  }
               }
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   private void m_1933(float var1) {
      ItemStack var2 = f_11537.player.getMainHandItem();
      Class_SluWNIC7qlm0dHwu.Class_3w2x36ewkoAH3rZP var3 = Class_SluWNIC7qlm0dHwu.m_4731(var2);
      if (var3 == null) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_4564);
      } else {
         Class_91IbAUVir9fW6CS3.tUwSkh1go39kcLhR var4 = new Class_91IbAUVir9fW6CS3.tUwSkh1go39kcLhR(var3, var2.getCount(), var1);
         Class_91IbAUVir9fW6CS3.GHNnSIM8fTUdKkO7 var5 = this.f_4556
            .stream()
            .filter(var1x -> var1x.entry() == var3 && System.currentTimeMillis() - var1x.timestamp() < f_4585)
            .findFirst()
            .orElse(null);
         if (var5 != null) {
            this.m_1924(var4, var5.price());
         } else {
            f_11537.player.connection.sendCommand(this.m_1929(var2) + "");
            this.f_4560 = var4;
         }
      }
   }

   private record GHNnSIM8fTUdKkO7(Class_SluWNIC7qlm0dHwu.Class_3w2x36ewkoAH3rZP entry, int price, long timestamp) {
   }

   private record tUwSkh1go39kcLhR(Class_SluWNIC7qlm0dHwu.Class_3w2x36ewkoAH3rZP entry, int count, float percent) {
   }
}
