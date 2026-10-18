package dev.dimasik.client.system;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.HeadSwap;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;
import net.minecraft.world.item.ItemStack;

public final class Class_HYg96YCVqFI747aQ extends Class_msKbTl6QleqYGoq3 implements Class_NzJrN63M7QBpmAbi {
   private static final String f_8107 = "hs";
   private static final String f_8108 = "headswap";
   private static final String f_8109 = "add";
   private static final String f_8110 = "remove";
   private static final String f_8111 = "clear";
   private static final String f_8112 = "list";
   private static final String f_8113 = "Возьми предмет в руку";
   private static final String f_8114 = "HeadSwap: список пуст";
   private static final String f_8115 = "HeadSwap: предмет не добавлен. .hs add";

   private int m_2894() {
      HeadSwap var1 = this.m_2895();
      if (!var1.m_5410()) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_8115);
         return 1;
      } else {
         Class_ftHu9o3WzCU3Adxm.m_6731(var1.m_5411() + "");
         return 1;
      }
   }

   private HeadSwap m_2895() {
      return DimasikClient.m_9057().m_9049().m_2801().m_3466();
   }

   private int m_2897() {
      if (f_11537.player == null) {
         return 1;
      }

      ItemStack var1 = f_11537.player.getMainHandItem();
      if (var1.isEmpty()) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_8113);
         return 1;
      }

      HeadSwap var2 = this.m_2895();
      String var3 = var2.m_5410() ? var2.m_5411() : null;
      var2.m_5413(var1);
      this.m_2898();
      if (var3 != null && !var3.equalsIgnoreCase(var1.getHoverName().getString())) {
         Class_ftHu9o3WzCU3Adxm.m_6731(var3 + var1.getHoverName().getString());
      } else {
         Class_ftHu9o3WzCU3Adxm.m_6731(var1.getHoverName().getString() + "");
      }

      return 1;
   }

   private void m_2898() {
      DimasikClient.m_9057().m_9049().m_2802().m_8845().m_5559();
   }

   @Override
   public void build(LiteralArgumentBuilder<ClientSuggestionProvider> var1) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)var1.executes(var1x -> this.m_2894()))
                  .then(this.m_7628(f_8109).executes(var1x -> this.m_2897())))
               .then(this.m_7628(f_8110).executes(var1x -> this.m_2902())))
            .then(this.m_7628(f_8111).executes(var1x -> this.m_2902())))
         .then(this.m_7628(f_8112).executes(var1x -> this.m_2894()));
   }

   public Class_HYg96YCVqFI747aQ() {
      super(f_8107, f_8108);
   }

   private int m_2902() {
      HeadSwap var1 = this.m_2895();
      if (!var1.m_5410()) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_8114);
         return 1;
      } else {
         String var2 = var1.m_5411();
         var1.m_5407();
         this.m_2898();
         Class_ftHu9o3WzCU3Adxm.m_6731(var2 + "");
         return 1;
      }
   }
}
