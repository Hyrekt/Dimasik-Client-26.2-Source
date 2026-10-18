package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.system.Class_21JsiqqLzgnqk2Dg;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.network.protocol.game.ClientboundContainerSetContentPacket;
import net.minecraft.network.protocol.game.ClientboundContainerSetSlotPacket;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class AntiServerSwap extends Module {
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_35198 = this::m_9567;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_35199 = this::m_9566;
   private static final String f_35200 = "AntiServerSwap";
   private static final String f_35201 = "Эксперементальная функция для предотврашения визуальных несоответсвий между сервером и клиентом";

   public AntiServerSwap() {
      super(f_35200, f_35201, Category.MISC);
   }

   public void m_9566(Class_Xu9btcIeUN33XnMK var1) {
      Class_21JsiqqLzgnqk2Dg.m_910().removeIf(var0 -> var0.m_890().m_7443(20));
   }

   @Override
   public void m_778() {
      Class_21JsiqqLzgnqk2Dg.m_910().clear();
   }

   public void m_9567(Class_XzpX8S5F5zd9jbuE var1) {
      if (var1.m_5619() instanceof ClientboundContainerSetSlotPacket var2) {
         if (var2.getContainerId() != 0) {
            return;
         }

         boolean var20 = false;

         for (Class_21JsiqqLzgnqk2Dg.K0xlgnhw27vo9DjG var10 : Class_21JsiqqLzgnqk2Dg.m_910()) {
            if (var10.m_892() == var2.getSlot() || var10.m_891() == var2.getSlot()) {
               var20 = true;
               break;
            }
         }

         var1.m_1582(var20);
      } else if (var1.m_5619() instanceof ClientboundContainerSetContentPacket var3) {
         int var4 = var3.containerId();
         int var5 = var3.stateId();
         List<ItemStack> var6 = var3.items();

         if (var4 != 0) {
            return;
         }

         boolean var22 = false;
         ArrayList<Integer> var26 = new ArrayList<>();

               for (Class_21JsiqqLzgnqk2Dg.K0xlgnhw27vo9DjG var11 : Class_21JsiqqLzgnqk2Dg.m_910()) {
                  for (int var12 = 0; var12 < var6.size(); var12++) {
                     if (var12 == var11.m_891() || var12 == var11.m_892()) {
                        var11.m_890().m_7442();
                        var22 = true;
                        var26.add(var12);
                     }
                  }
               }

               for (int var28 = 0; var28 < var6.size(); var28++) {
                  ItemStack var29 = (ItemStack)var6.get(var28);
                  ItemStack var30 = f_11537.player.inventoryMenu.getSlot(var28).getItem();
                  if (ItemStack.isSameItemSameComponents(var29, var30) && var29.getCount() != var30.getCount()) {
                     var30.setCount(var29.getCount());
                  }

                  if (!var26.contains(var28)) {
                     f_11537.player.inventoryMenu.setItem(var28, var5, (ItemStack)var6.get(var28));
                  } else {
                     boolean var13 = false;

                     for (int var15 : var26) {
                        if (!((ItemStack)var6.get(var15)).getItem().equals(Items.AIR)) {
                           var13 = false;
                           break;
                        }

                        var13 = true;
                     }

                     if (var13 && !((ItemStack)var6.get(var28)).getItem().equals(Items.PLAYER_HEAD)) {
                        f_11537.player.inventoryMenu.setItem(var28, var5, (ItemStack)var6.get(var28));
                     }
                  }
               }

               var1.m_1582(var22);
            }
         }
      }
