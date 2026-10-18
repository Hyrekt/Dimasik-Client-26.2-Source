package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.mixin.ChatComponentMixin_2;
import java.awt.Color;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import lombok.Generated;
import net.minecraft.client.multiplayer.chat.GuiMessage;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;

public final class Class_ftHu9o3WzCU3Adxm implements Class_NzJrN63M7QBpmAbi {
   private static final Set<Component> f_20765 = Collections.newSetFromMap(new IdentityHashMap<>());
   private static final String f_20766 = "Dimasik";
   private static final String f_20767 = " > ";
   private static final String f_20768 = "/";
   private static final String f_20769 = "This is a utility class and cannot be instantiated";

   public static void m_6720(String var0) {
      if (!f_11537.isSameThread()) {
         f_11537.execute(() -> m_6720(var0));
      } else if (f_11537.player != null && !Class_HKVFPtZz5yGHYty6.m_2883()) {
         m_6732(Component.nullToEmpty(var0));
      }
   }

   public static void m_6723(String var0) {
      if (f_11537.player != null) {
         if (!DimasikClient.m_9057().m_9049().m_2805().m_1652()) {
            var0 = Class_7gtB1wL4loVjK2Lw.m_1744(var0);
            if (var0.startsWith(DimasikClient.m_9057().m_9049().m_2809().m_6132().toString())) {
               DimasikClient.m_9057().m_9049().m_2809().m_6134(var0);
            } else if (var0.startsWith(f_20768)) {
               f_11537.player.connection.sendCommand(var0.substring(1));
            } else {
               f_11537.player.connection.sendChat(var0);
            }
         }
      }
   }

   public static void m_6725(Object var0, long var1) {
      if (!f_11537.isSameThread()) {
         f_11537.execute(() -> m_6725(var0, var1));
      } else if (f_11537.player != null && f_11537.gui.hud != null) {
         Component var3 = m_6732(m_6734(var0));
         if (var3 != null) {
            CompletableFuture.delayedExecutor(Math.max(0L, var1), TimeUnit.MILLISECONDS).execute(() -> f_11537.execute(() -> {
               if (f_11537.gui.hud != null && f_11537.gui.hud.getChat() instanceof ChatComponentMixin_2 var1x) {
                  if (var1x.getMessages().removeIf(var1xx -> var1xx.content() == var3)) {
                     var1x.invokeRefreshTrimmedMessages();
                  }

                  f_20765.remove(var3);
               }
            }));
         }
      }
   }

   public static void m_6729() {
      if (!f_11537.isSameThread()) {
         f_11537.execute(Class_ftHu9o3WzCU3Adxm::m_6729);
      } else {
         if (f_11537.gui.hud != null
            && f_11537.gui.hud.getChat() instanceof ChatComponentMixin_2 var0
            && var0.getMessages().removeIf(var0x -> f_20765.contains(var0x.content()))) {
            var0.invokeRefreshTrimmedMessages();
         }

         f_20765.clear();
      }
   }

   public static void m_6731(Object var0) {
      if (!f_11537.isSameThread()) {
         f_11537.execute(() -> m_6731(var0));
      } else if (f_11537.player != null && !Class_HKVFPtZz5yGHYty6.m_2883()) {
         m_6732(m_6734(var0));
      }
   }

   @Generated
   private Class_ftHu9o3WzCU3Adxm() {
      throw new UnsupportedOperationException(f_20769);
   }

   private static Component m_6732(Component var0) {
      if (f_11537.player != null && f_11537.gui.hud != null) {
         ChatComponentMixin_2 var1 = (ChatComponentMixin_2)f_11537.gui.hud.getChat();
         GuiMessage var2 = var1.getMessages().isEmpty() ? null : var1.getMessages().getFirst();
         f_11537.gui.hud.getChat().addClientSystemMessage(var0);
         f_20765.removeIf(var1x -> var1.getMessages().stream().noneMatch(var1xx -> var1xx.content() == var1x));
         if (!var1.getMessages().isEmpty() && var1.getMessages().getFirst() != var2) {
            Component var3 = var1.getMessages().getFirst().content();
            f_20765.add(var3);
            return var3;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private static MutableComponent m_6734(Object var0) {
      MutableComponent var1 = Component.literal("");
      var1.append(Class_BftdentXEtGbugJw.m_2311(f_20766)).setStyle(Style.EMPTY.withBold(true));
      var1.append(Component.literal(f_20767).setStyle(Style.EMPTY.withBold(false).withColor(TextColor.fromRgb(new Color(200, 200, 200).getRGB()))));
      if (var0 instanceof Component var2) {
         var1.append(var2).setStyle(Style.EMPTY.withBold(false));
      } else {
         var1.append(
            Component.literal(String.valueOf(var0)).setStyle(Style.EMPTY.withBold(false).withColor(TextColor.fromRgb(new Color(200, 200, 200).getRGB())))
         );
      }

      return var1;
   }
}
