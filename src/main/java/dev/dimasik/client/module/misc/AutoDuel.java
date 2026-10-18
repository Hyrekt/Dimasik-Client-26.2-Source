package dev.dimasik.client.module.misc;

import com.mojang.authlib.GameProfile;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.IntegerSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_B6JOzHnwhU3pe4AO;
import dev.dimasik.client.system.Class_QmNR03reugBgWiPr;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.inventory.ContainerInput;

public final class AutoDuel extends Module {
   private static final Pattern f_2807 = Pattern.compile(AutoDuel.f_2838);
   private final MultiChoiceSetting f_2808;
   private final IntegerSetting f_2809;
   private final List<String> f_2810;
   private final Class_QmNR03reugBgWiPr f_2811;
   private int f_2812;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_2813;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_2814;
   private final Class_gEPk7yDw6CwIte87<Class_B6JOzHnwhU3pe4AO> f_2815;
   private static final String f_2816 = "AutoDuel";
   private static final String f_2817 = "Автоматически отправляет вызов на дуэль игрокам";
   private static final String f_2818 = "Режим";
   private static final String f_2819 = "Ball";
   private static final String f_2820 = "Shield";
   private static final String f_2821 = "Spikes";
   private static final String f_2822 = "Netherite";
   private static final String f_2823 = "CheatParadise";
   private static final String f_2824 = "Bow";
   private static final String f_2825 = "Classic";
   private static final String f_2826 = "Totems";
   private static final String f_2827 = "NoDebuff";
   private static final String f_2828 = "Клавиша отключения";
   private static final long f_2829 = 800L;
   private static final long f_2830 = 1000L;
   private static final String f_2831 = "Выбор набора (1/1)";
   private static final long f_2832 = 150L;
   private static final String f_2833 = "Настройка поединка";
   private static final long f_2834 = 150L;
   private static final String f_2835 = "начало";
   private static final String f_2836 = "через";
   private static final String f_2837 = "секунд!";
   private static final String f_2838 = "^\\w{3,16}$";

   private void m_1543(Class_XzpX8S5F5zd9jbuE var1) {
      if (var1.m_5619() instanceof ClientboundSystemChatPacket var2) {
         String var4 = var2.content().getString().toLowerCase(Locale.ROOT);
         if (var4.contains(f_2835) && var4.contains(f_2836) && var4.contains(f_2837) || var4.isEmpty()) {
            this.m_789();
         }
      }
   }

   private void m_1545(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.getConnection() != null && f_11537.gameMode != null) {
         List var2 = f_11537.getConnection()
            .getOnlinePlayers()
            .stream()
            .map(PlayerInfo::getProfile)
            .<String>map(GameProfile::name)
            .filter(var0 -> f_2807.matcher(var0).matches())
            .collect(Collectors.toList());
         if (this.f_2811.m_4463(f_2829 * var2.size())) {
            this.f_2810.clear();
            this.f_2812 = 0;
            this.f_2811.m_4459();
         }

         if (!var2.isEmpty() && this.f_2811.m_4463(f_2830)) {
            if (this.f_2812 >= var2.size()) {
               this.f_2812 = 0;
            }

            String var3 = (String)var2.get(this.f_2812);
            String var4 = f_11537.player.getGameProfile().name();
            if (!this.f_2810.contains(var3) && !var3.equals(var4)) {
               f_11537.getConnection().sendCommand(var3 + "");
               this.f_2810.add(var3);
            }

            this.f_2812++;
            this.f_2811.m_4459();
         }

         if (f_11537.player.containerMenu instanceof ChestMenu var6) {
            if (f_11537.gui.screen() != null) {
               String var8 = f_11537.gui.screen().getTitle().getString();
               if (var8.contains(f_2831)) {
                  if (!this.f_2811.m_4463(f_2832)) {
                     return;
                  }

                  AutoDuel.BNf8UHksfBQ6KG79 var5 = AutoDuel.BNf8UHksfBQ6KG79.valueOf(this.f_2808.m_7564().m_1181());
                  f_11537.gameMode.handleContainerInput(var6.containerId, var5.ordinal(), 0, ContainerInput.QUICK_MOVE, f_11537.player);
                  this.f_2811.m_4459();
               } else if (var8.contains(f_2833)) {
                  if (!this.f_2811.m_4463(f_2834)) {
                     return;
                  }

                  f_11537.gameMode.handleContainerInput(var6.containerId, 0, 0, ContainerInput.QUICK_MOVE, f_11537.player);
                  this.f_2811.m_4459();
               }
            }
         }
      }
   }

   public AutoDuel() {
      super(f_2816, f_2817, Category.MISC);
      this.f_2808 = new MultiChoiceSetting(
         f_2818,
         new Class_2ZaVm8TGDJ68TnJB(f_2819),
         new Class_2ZaVm8TGDJ68TnJB(f_2820),
         new Class_2ZaVm8TGDJ68TnJB(f_2821),
         new Class_2ZaVm8TGDJ68TnJB(f_2822),
         new Class_2ZaVm8TGDJ68TnJB(f_2823),
         new Class_2ZaVm8TGDJ68TnJB(f_2824),
         new Class_2ZaVm8TGDJ68TnJB(f_2825),
         new Class_2ZaVm8TGDJ68TnJB(f_2826),
         new Class_2ZaVm8TGDJ68TnJB(f_2827)
      );
      this.f_2809 = new IntegerSetting(f_2828, -1);
      this.f_2810 = new ArrayList<>();
      this.f_2811 = new Class_QmNR03reugBgWiPr();
      this.f_2813 = this::m_1545;
      this.f_2814 = this::m_1543;
      this.f_2815 = this::m_1546;
      this.m_795(this.f_2808, this.f_2809);
   }

   @Override
   public void m_778() {
      this.f_2810.clear();
      this.f_2812 = 0;
      this.f_2811.m_4459();
      super.m_778();
   }

   @Override
   public void m_732() {
      this.f_2810.clear();
      this.f_2812 = 0;
      this.f_2811.m_4459();
      super.m_732();
   }

   private void m_1546(Class_B6JOzHnwhU3pe4AO var1) {
      if (this.f_2809.m_8768() == var1.m_2117() && var1.m_2116() == 1) {
         this.m_789();
      }
   }

   public enum BNf8UHksfBQ6KG79 {
      Shield,
      Spikes,
      Bow,
      Totems,
      NoDebuff,
      Ball,
      Classic,
      CheatParadise,
      Netherite;
   }
}
