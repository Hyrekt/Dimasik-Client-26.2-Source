package dev.dimasik.client.module.misc;

import com.mojang.blaze3d.platform.InputConstants;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.system.Class_QBKwWNWLlChWViO9;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import java.util.Locale;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.KeyMapping;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;

public final class AutoAccept extends Module {
   private static final Pattern f_25515 = Pattern.compile(AutoAccept.f_25536);
   private static final Pattern f_25516 = Pattern.compile(AutoAccept.f_25537);
   private static final Pattern f_25517 = Pattern.compile(AutoAccept.f_25538);
   private static final long f_25518 = 250L;
   private final CheckboxSetting f_25519;
   private int f_25520;
   private boolean f_25521;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_25522;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_25523;
   private static final String f_25524 = "AutoAccept";
   private static final String f_25525 = "Автоматически принимает запросы телепортации";
   private static final String f_25526 = "Только друзья";
   private static final String f_25527 = "Рейджовый";
   private static final String f_25528 = "tpaccept";
   private static final String f_25529 = "tpaccept";
   private static final String f_25530 = "телепорт";
   private static final String f_25531 = "teleport";
   private static final String f_25532 = "просит";
   private static final String f_25533 = "request";
   private static final String f_25534 = "want";
   private static final String f_25535 = "хочет";
   private static final String f_25536 = "§.";
   private static final String f_25537 = "^([a-zA-Z0-9_]{3,16})\\b";
   private static final String f_25538 = "(?i)\\b(?:ник|nick)\\s*:?\\s*([a-zA-Z0-9_]{3,16})\\b";

   private void m_7609(Class_XzpX8S5F5zd9jbuE var1) {
      if (f_11537.player != null && f_11537.getConnection() != null) {
         if (var1.m_5619() instanceof ClientboundSystemChatPacket var2) {
            String var6 = var2.content().getString();
            String var4 = m_7611(var6);
            if (!m_7612(var4)) {
               return;
            }

            Optional var5 = m_7613(var4);
            if (this.f_25519.m_8768()) {
               if (var5.isEmpty()) {
                  return;
               }

               if (!DimasikClient.m_9057().m_9049().m_2804().m_2877((String)var5.get())) {
                  return;
               }
            }

            if (DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5152().m_7568(f_25527)) {
               f_11537.getConnection().sendCommand(f_25528);
            } else if (!this.f_25521) {
               this.f_25521 = true;
               this.f_25520 = DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5153().m_8768().intValue();
            }
         }
      }
   }

   public AutoAccept() {
      super(f_25524, f_25525, Category.MISC);
      this.f_25519 = new CheckboxSetting(f_25526, false);
      this.f_25520 = 0;
      this.f_25522 = this::m_7609;
      this.f_25523 = this::m_7610;
      this.m_795(this.f_25519);
   }

   private void m_7610(Class_Xu9btcIeUN33XnMK var1) {
      if (this.f_25521) {
         KeyMapping[] var2 = new KeyMapping[]{
            f_11537.options.keyUp,
            f_11537.options.keyDown,
            f_11537.options.keyLeft,
            f_11537.options.keyRight,
            f_11537.options.keyJump,
            f_11537.options.keySprint
         };

         for (KeyMapping var6 : var2) {
            var6.setDown(false);
         }

         DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5158(true);
         if (!Class_QBKwWNWLlChWViO9.m_4256()) {
            if (this.f_25520 > 0) {
               this.f_25520--;
               return;
            }

            f_11537.getConnection().sendCommand(f_25529);
            this.f_25521 = false;
            DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5158(false);
            if (f_11537.gui.screen() == null) {
               for (KeyMapping var10 : var2) {
                  var10.setDown(InputConstants.isKeyDown(f_11537.getWindow(), var10.key.getValue()));
               }
            }
         }
      }
   }

   private static String m_7611(String var0) {
      if (var0 == null) {
         return "";
      }

      String var1 = f_25515.matcher(var0).replaceAll("");
      return var1.replace('\n', ' ').trim().toLowerCase(Locale.ROOT);
   }

   private static boolean m_7612(String var0) {
      boolean var1 = var0.contains(f_25530) || var0.contains(f_25531);
      if (!var1) {
         return false;
      } else {
         return !var0.contains(f_25532) ? false : var0.contains(f_25533) || var0.contains(f_25534) || var0.contains(f_25535);
      }
   }

   private static Optional<String> m_7613(String var0) {
      Matcher var1 = f_25517.matcher(var0);
      if (var1.find()) {
         return Optional.ofNullable(var1.group(1));
      }

      Matcher var2 = f_25516.matcher(var0);
      return var2.find() ? Optional.ofNullable(var2.group(1)) : Optional.empty();
   }
}
