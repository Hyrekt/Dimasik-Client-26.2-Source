package dev.dimasik.client.system;

import dev.dimasik.mixin.ChatComponentMixin_2;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.ChatComponent;
import net.minecraft.client.multiplayer.chat.GuiMessage;
import net.minecraft.client.multiplayer.chat.GuiMessage.Line;
import net.minecraft.network.chat.Component;
import net.minecraft.util.FormattedCharSequence;
import net.minecraft.util.Mth;

public final class Class_wYdPm8P52As8DnF0 {
   private static final int f_34423 = 40;
   private static FormattedCharSequence f_34424;
   private static final String f_34425 = "H";
   private static final String f_34426 = "Скопировано";
   private static final double f_34427 = 4.0;
   private static final double f_34428 = 40.0;

   public static void m_9346(FormattedCharSequence var0) {
      f_34424 = var0;
   }

   private static int m_9347(List<Line> var0, FormattedCharSequence var1) {
      if (var1 == null) {
         return -1;
      }

      for (int var2 = 0; var2 < var0.size(); var2++) {
         if (((Line)var0.get(var2)).content() == var1) {
            return var2;
         }
      }

      String var4 = m_9350(var1);
      if (var4.isEmpty()) {
         return -1;
      }

      for (int var3 = 0; var3 < var0.size(); var3++) {
         if (var4.equals(m_9350(((Line)var0.get(var3)).content()))) {
            return var3;
         }
      }

      return -1;
   }

   public static boolean m_9348() {
      Minecraft var0 = Minecraft.getInstance();
      if (var0 != null && var0.gui.hud != null) {
         ChatComponent var1 = var0.gui.hud.getChat();
         ChatComponentMixin_2 var2 = (ChatComponentMixin_2)var1;
         List var3 = var2.getVisibleMessages();
         if (var3 != null && !var3.isEmpty()) {
            int var4 = m_9347(var3, f_34424);
            if (var4 < 0) {
               var4 = m_9353(var0, var1, var2, var3);
            }

            if (var4 < 0) {
               return false;
            } else {
               String var5 = m_9349(var2, var3, var4);
               if (var5 != null && !var5.isBlank()) {
                  var0.keyboardHandler.setClipboard(var5);
                  Class_8UIDpbIRPAjhei7m.m_1792(f_34425, Class_0p152hWffX3ippAf.m_801(f_34426), -1);
                  return true;
               } else {
                  return false;
               }
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private static String m_9349(ChatComponentMixin_2 var0, List<Line> var1, int var2) {
      int var3 = var2;

      while (var3 > 0 && !((Line)var1.get(var3)).endOfEntry()) {
         var3--;
      }

      List var4 = var0.getMessages();
      if (var4 != null && !var4.isEmpty()) {
         int var5 = 0;

         for (int var6 = 0; var6 < var3; var6++) {
            if (((Line)var1.get(var6)).endOfEntry()) {
               var5++;
            }
         }

         if (var5 >= 0 && var5 < var4.size()) {
            Component var9 = ((GuiMessage)var4.get(var5)).content();
            if (var9 != null) {
               String var7 = var9.getString();
               if (var7 != null && !var7.isBlank()) {
                  return var7.strip();
               }
            }
         }
      }

      int var8 = var3;

      while (var8 + 1 < var1.size() && !((Line)var1.get(var8 + 1)).endOfEntry()) {
         var8++;
      }

      StringBuilder var10 = new StringBuilder();

      for (int var11 = var8; var11 >= var3; var11--) {
         var10.append(m_9350(((Line)var1.get(var11)).content()));
      }

      return var10.toString().strip();
   }

   private static String m_9350(FormattedCharSequence var0) {
      if (var0 == null) {
         return "";
      }

      StringBuilder var1 = new StringBuilder();
      var0.accept((var1x, var2, var3) -> {
         var1.appendCodePoint(var3);
         return true;
      });
      return var1.toString();
   }

   public static void m_9351() {
      f_34424 = null;
   }

   private static int m_9353(Minecraft var0, ChatComponent var1, ChatComponentMixin_2 var2, List<Line> var3) {
      double var4 = var2.invokeGetChatScale();
      if (var4 <= 0.0) {
         return -1;
      } else {
         double var6 = var0.mouseHandler.xpos() * var0.getWindow().getGuiScaledWidth() / var0.getWindow().getScreenWidth();
         double var8 = var0.mouseHandler.ypos() * var0.getWindow().getGuiScaledHeight() / var0.getWindow().getScreenHeight();
         double var10 = var6 / var4 - f_34427;
         double var12 = (var0.getWindow().getGuiScaledHeight() - var8 - f_34428) / (var2.invokeGetLineHeight() * var4);
         if (!(var10 < 0.0) && !(var10 > var2.invokeGetWidth() / var4) && !(var12 < 0.0)) {
            int var14 = Mth.floor(var12 + var2.getScrolledLines());
            int var15 = Math.min(var1.getLinesPerPage(), var3.size());
            return var14 >= 0 && var14 < var3.size() && var14 < var15 + var2.getScrolledLines() ? var14 : -1;
         } else {
            return -1;
         }
      }
   }

   private Class_wYdPm8P52As8DnF0() {
   }
}
