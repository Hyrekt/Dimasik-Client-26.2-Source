package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_QmNR03reugBgWiPr;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_ftHu9o3WzCU3Adxm;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.screens.inventory.ContainerScreen;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.protocol.game.ClientboundLoginPacket;
import net.minecraft.network.protocol.game.ClientboundRespawnPacket;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import net.minecraft.network.protocol.game.ServerboundSetCarriedItemPacket;
import net.minecraft.util.StringUtil;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.ItemLore;
import net.minecraft.world.scores.DisplaySlot;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.scores.PlayerScoreEntry;
import net.minecraft.world.scores.PlayerTeam;
import net.minecraft.world.scores.Scoreboard;

public class AutoJoiner extends Module {
   private static final String f_31687 = "выбор сервера";
   private static final String f_31688 = "гриф выживание (1.16.5)";
   private static final String f_31689 = "гриф выживание (1.21.11)";
   private static final String f_31690 = "следующая страница";
   private static final String f_31691 = "выбор мира грифа";
   private static final String f_31692 = "выбор мира грифа 1/3";
   private static final String f_31693 = "выбор мира грифа 2/3";
   private static final String f_31694 = "выбор мира грифа 3/3";
   private static final Pattern f_31695 = Pattern.compile(AutoJoiner.f_31772);
   private static final Pattern f_31696 = Pattern.compile(AutoJoiner.f_31773);
   private static final Pattern f_31697 = Pattern.compile(AutoJoiner.f_31774);
   private final MultiChoiceSetting f_31698;
   private final SliderSetting f_31699;
   private final SliderSetting f_31700;
   private final SliderSetting f_31701;
   private final Class_QmNR03reugBgWiPr f_31702;
   private final Class_QmNR03reugBgWiPr f_31703;
   private boolean f_31704;
   private boolean f_31705;
   private boolean f_31706;
   private boolean f_31707;
   private AutoJoiner.VH0NOCViKrXI6IEe f_31708;
   private AutoJoiner.UFtxOEj3EQyyOrKf f_31709;
   private AutoJoiner.VvMbq2HgAukAg1I7 f_31710;
   private int f_31711;
   private ContainerScreen f_31712;
   private ClientLevel f_31713;
   private ClientLevel f_31714;
   private boolean f_31715;
   private boolean f_31716;
   private ClientLevel f_31717;
   private long f_31718;
   private long f_31719;
   private volatile int f_31720;
   private volatile boolean f_31721;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_31722;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_31723;
   private static final String f_31724 = "AutoJoiner";
   private static final String f_31725 = "Авто заход на гриф RW";
   private static final String f_31726 = "Режим";
   private static final String f_31727 = "Reallyworld 1.16.5";
   private static final String f_31728 = "Reallyworld 1.21.11";
   private static final String f_31729 = "Гриф";
   private static final float f_31730 = 96.0F;
   private static final String f_31731 = "Гриф 1.21.11";
   private static final float f_31732 = 24.0F;
   private static final String f_31733 = "Скорость";
   private static final float f_31734 = 3.0F;
   private static final float f_31735 = 20.0F;
   private static final long f_31736 = 1000L;
   private static final long f_31737 = 400L;
   private static final long f_31738 = 100L;
   private static final long f_31739 = 100L;
   private static final String f_31740 = "выбор сервера";
   private static final String f_31741 = "гриф выживание (1.21.11)";
   private static final String f_31742 = "гриф выживание (1.16.5)";
   private static final String f_31743 = "следующая страница";
   private static final String f_31744 = "hub";
   private static final String f_31745 = "hub";
   private static final String f_31746 = "лайт";
   private static final String f_31747 = "light";
   private static final String f_31748 = "анарх";
   private static final String f_31749 = "anarch";
   private static final String f_31750 = "выбор сервера";
   private static final String f_31751 = "выбор мира грифа";
   private static final String f_31752 = "гриф выживание (1.16.5)";
   private static final String f_31753 = "гриф выживание (1.21.11)";
   private static final String f_31754 = "\\n";
   private static final String f_31755 = " ";
   private static final String f_31756 = "не удалось подключиться к серверу newgrief-";
   private static final String f_31757 = "не удалось подключиться к серверу grief-";
   private static final String f_31758 = "большой поток игроков";
   private static final String f_31759 = "сервер переполнен";
   private static final String f_31760 = "reallyworld";
   private static final String f_31761 = "подождите несколько секунд";
   private static final String f_31762 = "подключением";
   private static final long f_31763 = 3000L;
   private static final long f_31764 = 100L;
   private static final String f_31765 = "AutoJoiner -> Ошибка при заходе на гриф. Ошибка: большой поток.";
   private static final String f_31766 = "AutoJoiner -> Ошибка при заходе на гриф. Ошибка: сервер переполнен.";
   private static final String f_31767 = "Reallyworld 1.21.11";
   private static final String f_31768 = "выбор мира грифа";
   private static final String f_31769 = "выбор мира грифа 2/3";
   private static final String f_31770 = "выбор мира грифа 3/3";
   private static final String f_31771 = "выбор мира грифа 1/3";
   private static final String f_31772 = "(?i)гриф\\s*#\\s*(\\d+)";
   private static final String f_31773 = "(?:#|№)\\s*(\\d+)";
   private static final String f_31774 = "(?<!\\d)1[.,]16(?!\\d)";

   private void m_8805(AutoJoiner.WPgHAS1dlXm5hvom var1) {
      long var2 = var1 == AutoJoiner.WPgHAS1dlXm5hvom.COOLDOWN ? f_31763 : this.f_31701.m_8768().intValue() * f_31764;
      this.f_31719 = Math.max(this.f_31719, System.currentTimeMillis() + var2);
      this.f_31702.m_4459();
      this.f_31703.m_4459();
      if (var1 == AutoJoiner.WPgHAS1dlXm5hvom.BUSY) {
         Class_ftHu9o3WzCU3Adxm.m_6720(f_31765);
      } else if (var1 == AutoJoiner.WPgHAS1dlXm5hvom.FULL) {
         Class_ftHu9o3WzCU3Adxm.m_6720(f_31766);
      }
   }

   @Override
   public void m_778() {
      super.m_778();
      this.m_8813();
      this.f_31702.m_4459();
      this.f_31703.m_4459();
      this.f_31704 = false;
      this.f_31707 = false;
      this.f_31711 = -1;
      if (!this.f_31705) {
         this.f_31706 = true;
         if (f_11537.player != null && f_11537.level != null) {
            this.m_8833();
         }

         if (this.f_31706) {
            this.m_8832();
         }
      }
   }

   private void m_8806(ChestMenu var1) {
      if (this.f_31709 != null && this.f_31710 != AutoJoiner.VvMbq2HgAukAg1I7.IDLE && this.f_31710 != AutoJoiner.VvMbq2HgAukAg1I7.WAITING_FOR_HUB) {
         if (var1.containerId != this.f_31711) {
            Slot var2 = this.m_8831(var1, true);
            if (var2 == null) {
               var2 = this.m_8831(var1, false);
            }

            if (var2 != null) {
               if (this.f_31710 == AutoJoiner.VvMbq2HgAukAg1I7.SELECT_SERVER) {
                  this.m_8818();
               }

               this.m_8810(var2.index);
               this.f_31711 = var1.containerId;
               this.f_31702.m_4459();

               this.f_31710 = switch (this.f_31710) {
                  case SELECT_LIGHT -> AutoJoiner.VvMbq2HgAukAg1I7.SELECT_CATEGORY;
                  case SELECT_CATEGORY -> AutoJoiner.VvMbq2HgAukAg1I7.SELECT_SERVER;
                  case SELECT_SERVER -> AutoJoiner.VvMbq2HgAukAg1I7.COMPLETE;
                  default -> this.f_31710;
               };
            }
         }
      }
   }

   private static String m_8807(String var0) {
      String var1 = StringUtil.stripColor(var0);
      if (var1 == null) {
         var1 = var0;
      }

      return var1.toLowerCase(Locale.ROOT).replace('ё', 'е');
   }

   private static String m_8808(ItemStack var0) {
      StringBuilder var1 = new StringBuilder(var0.getHoverName().getString());
      ItemLore var2 = (ItemLore)var0.getComponents().get(DataComponents.LORE);
      if (var2 != null) {
         for (Component var4 : var2.lines()) {
            var1.append(' ').append(var4.getString());
         }
      }

      return m_8807(var1.toString());
   }

   public boolean m_8809(AutoJoiner.UFtxOEj3EQyyOrKf var1) {
      if (var1 != null && var1.number() >= 1) {
         this.f_31708 = AutoJoiner.VH0NOCViKrXI6IEe.HOLY_WORLD;
         this.f_31709 = var1;
         this.f_31710 = AutoJoiner.VvMbq2HgAukAg1I7.WAITING_FOR_HUB;
         this.m_8813();
         this.f_31711 = -1;
         this.f_31705 = true;
         this.f_31706 = true;
         this.f_31707 = false;
         this.f_31704 = false;
         this.f_31702.m_4459();
         this.f_31703.m_4459();
         if (!this.m_776()) {
            this.m_792();
         }

         return true;
      } else {
         return false;
      }
   }

   public AutoJoiner() {
      super(f_31724, f_31725, Category.MISC);
      this.f_31698 = new MultiChoiceSetting(f_31726, new Class_2ZaVm8TGDJ68TnJB(f_31727), new Class_2ZaVm8TGDJ68TnJB(f_31728));
      this.f_31699 = new SliderSetting(f_31729, 1.0F, 1.0F, f_31730).m_828(1.0F).m_822(() -> !this.m_8826());
      this.f_31700 = new SliderSetting(f_31731, 1.0F, 1.0F, f_31732).m_828(1.0F).m_822(this::m_8826);
      this.f_31701 = new SliderSetting(f_31733, f_31734, 1.0F, f_31735).m_828(1.0F);
      this.f_31702 = new Class_QmNR03reugBgWiPr();
      this.f_31703 = new Class_QmNR03reugBgWiPr();
      this.f_31708 = AutoJoiner.VH0NOCViKrXI6IEe.REALLY_WORLD;
      this.f_31710 = AutoJoiner.VvMbq2HgAukAg1I7.IDLE;
      this.f_31711 = -1;
      this.f_31722 = this::m_8834;
      this.f_31723 = this::m_8840;
      this.m_795(this.f_31698, this.f_31699, this.f_31700, this.f_31701);
   }

   private void m_8810(int var1) {
      this.m_8835(var1);
      AbstractContainerMenu var2 = f_11537.player.containerMenu;
      if (!var2.getCarried().isEmpty()) {
         this.m_8835(var1);
      }
   }

   private void m_8811(String var1) {
      int var2 = this.m_8829().m_8768().intValue();
      String var3 = this.m_8819(var1);
      if (this.m_8826()) {
         this.f_31704 = var3.contains(f_31768);
      } else {
         if (var2 >= 33 && var2 <= 64) {
            this.f_31704 = var3.contains(f_31769);
         } else if (var2 >= 65) {
            this.f_31704 = var3.contains(f_31770);
         } else {
            this.f_31704 = var3.contains(f_31771);
         }
      }
   }

   public boolean m_8812(int var1) {
      if (f_11537.player == null || f_11537.player.connection == null) {
         return false;
      }

      if (!this.m_8817(var1)) {
         return false;
      }

      this.f_31716 = true;
      this.f_31717 = f_11537.level;
      f_11537.player.connection.sendCommand(f_31744);
      return true;
   }

   private void m_8813() {
      this.f_31720++;
      this.f_31712 = null;
      this.f_31713 = null;
      this.f_31714 = null;
      this.f_31716 = false;
      this.f_31717 = null;
      this.f_31718 = 0L;
      this.f_31715 = false;
      this.f_31719 = 0L;
      this.f_31721 = this.m_776() && this.f_31708 == AutoJoiner.VH0NOCViKrXI6IEe.REALLY_WORLD;
   }

   private static boolean m_8814(String var0, int var1) {
      Matcher var2 = f_31696.matcher(var0);

      while (var2.find()) {
         try {
            if (Integer.parseInt(var2.group(1)) == var1) {
               return true;
            }
         } catch (NumberFormatException var4) {
            return false;
         }
      }

      return false;
   }

   private static boolean m_8815(String var0) {
      return f_31697.matcher(var0).find();
   }

   public boolean m_8816(AbstractContainerScreen<?> var1) {
      return this.m_776()
         && f_11537.player != null
         && f_11537.level != null
         && f_11537.player.isAlive()
         && !f_11537.player.isRemoved()
         && !this.f_31715
         && !this.f_31716
         && (!this.f_31707 || this.f_31714 == f_11537.level)
         && f_11537.player.containerMenu == var1.getMenu()
         && this.m_8825(var1);
   }

   public boolean m_8817(int var1) {
      SliderSetting var2 = this.m_8829();
      if (!(var1 < var2.m_824()) && !(var1 > var2.m_813())) {
         var2.m_823((float)var1);
         this.f_31708 = AutoJoiner.VH0NOCViKrXI6IEe.REALLY_WORLD;
         this.f_31709 = null;
         this.f_31710 = AutoJoiner.VvMbq2HgAukAg1I7.IDLE;
         this.m_8813();
         this.f_31711 = -1;
         this.f_31705 = true;
         this.f_31706 = true;
         this.f_31707 = false;
         this.f_31704 = false;
         this.f_31702.m_4459();
         this.f_31703.m_4459();
         if (!this.m_776()) {
            this.m_792();
         }

         return true;
      } else {
         return false;
      }
   }

   private void m_8818() {
      if (!this.f_31707) {
         this.f_31714 = f_11537.level;
         this.f_31718 = System.currentTimeMillis();
      }

      this.f_31707 = true;
   }

   private String m_8819(String var1) {
      return m_8807(var1);
   }

   private int m_8820(Item var1) {
      if (f_11537.player == null) {
         return -1;
      }

      for (int var2 = 0; var2 < 9; var2++) {
         if (f_11537.player.getInventory().getItem(var2).is(var1)) {
            return var2;
         }
      }

      return -1;
   }

   private static boolean m_8821(String var0) {
      return var0.contains(f_31746) || var0.contains(f_31747);
   }

   private static AutoJoiner.UFtxOEj3EQyyOrKf m_8822(Scoreboard var0, Objective var1) {
      if (var1 == null) {
         return null;
      }

      AutoJoiner.UFtxOEj3EQyyOrKf var2 = m_8823(var1.getDisplayName().getString());
      if (var2 != null) {
         return var2;
      }

      for (PlayerScoreEntry var4 : var0.listPlayerScores(var1)) {
         var2 = m_8823(var4.ownerName().getString());
         if (var2 != null) {
            return var2;
         }

         MutableComponent var5 = PlayerTeam.formatNameForTeam(var0.getPlayersTeam(var4.owner()), var4.ownerName());
         var2 = m_8823(var5.getString());
         if (var2 != null) {
            return var2;
         }

         var2 = m_8823(var4.owner());
         if (var2 != null) {
            return var2;
         }
      }

      return null;
   }

   private static AutoJoiner.UFtxOEj3EQyyOrKf m_8823(String var0) {
      String var1 = m_8807(var0);
      if (!m_8821(var1)) {
         return null;
      }

      AutoJoiner.UFeHKqfJkvHs4Fns var2 = AutoJoiner.UFeHKqfJkvHs4Fns.m_8804(var1);
      if (var2 == null) {
         return null;
      }

      Matcher var3 = f_31696.matcher(var1);
      if (!var3.find()) {
         return null;
      }

      try {
         return new AutoJoiner.UFtxOEj3EQyyOrKf(var2, Integer.parseInt(var3.group(1)));
      } catch (NumberFormatException var5) {
         return null;
      }
   }

   public static int m_8824() {
      if (f_11537.level == null) {
         return -1;
      }

      for (Objective var1 : f_11537.level.getScoreboard().getObjectives()) {
         String var2 = var1.getDisplayName().getString();
         String var3 = StringUtil.stripColor(var2);
         if (var3 == null) {
            var3 = var2;
         }

         Matcher var4 = f_31695.matcher(var3);
         if (var4.find()) {
            try {
               return Integer.parseInt(var4.group(1));
            } catch (NumberFormatException var6) {
               return -1;
            }
         }
      }

      return -1;
   }

   private boolean m_8825(AbstractContainerScreen<?> var1) {
      if (!(var1 instanceof ContainerScreen)) {
         return false;
      }

      if (this.f_31708 == AutoJoiner.VH0NOCViKrXI6IEe.HOLY_WORLD) {
         return this.f_31705 && this.f_31710 != AutoJoiner.VvMbq2HgAukAg1I7.IDLE && this.f_31710 != AutoJoiner.VvMbq2HgAukAg1I7.WAITING_FOR_HUB;
      }

      String var2 = this.m_8819(var1.getTitle().getString());
      return var2.contains(f_31750) || var2.contains(f_31751) || var2.contains(f_31752) || var2.contains(f_31753);
   }

   private boolean m_8826() {
      return this.f_31698.m_7568(f_31767);
   }

   public static AutoJoiner.UFtxOEj3EQyyOrKf m_8827() {
      if (f_11537.level == null) {
         return null;
      }

      Scoreboard var0 = f_11537.level.getScoreboard();
      Objective var1 = var0.getDisplayObjective(DisplaySlot.SIDEBAR);
      AutoJoiner.UFtxOEj3EQyyOrKf var2 = m_8822(var0, var1);
      if (var2 != null) {
         return var2;
      }

      for (Objective var4 : var0.getObjectives()) {
         if (var4 != var1) {
            var2 = m_8822(var0, var4);
            if (var2 != null) {
               return var2;
            }
         }
      }

      return null;
   }

   private boolean m_8828() {
      return this.f_31708 != AutoJoiner.VH0NOCViKrXI6IEe.HOLY_WORLD
         ? m_8824() == this.m_8829().m_8768().intValue()
         : this.f_31709 != null && this.f_31709.equals(m_8827());
   }

   private SliderSetting m_8829() {
      return this.m_8826() ? this.f_31700 : this.f_31699;
   }

   private static boolean m_8830(String var0) {
      return var0.contains(f_31748) || var0.contains(f_31749);
   }

   private Slot m_8831(ChestMenu var1, boolean var2) {
      for (Slot var4 : var1.slots) {
         if (var4.container != f_11537.player.getInventory() && var4.hasItem()) {
            String var5 = var2 ? m_8807(var4.getItem().getHoverName().getString()) : m_8808(var4.getItem());

            boolean var6 = switch (this.f_31710) {
               case SELECT_LIGHT -> m_8821(var5) && m_8830(var5) && m_8815(var5);
               case SELECT_CATEGORY -> this.f_31709.category().m_8803(var5);
               case SELECT_SERVER -> this.f_31709.category().m_8803(var5) && m_8814(var5, this.f_31709.number());
               default -> false;
            };
            if (var6) {
               return var4;
            }
         }
      }

      return null;
   }

   private boolean m_8832() {
      if (f_11537.player != null && f_11537.gameMode != null) {
         int var1 = this.m_8820(Items.COMPASS);
         if (var1 == -1) {
            return false;
         }

         f_11537.player.getInventory().setSelectedSlot(var1);
         f_11537.player.connection.send(new ServerboundSetCarriedItemPacket(var1));
         f_11537.gameMode.useItem(f_11537.player, InteractionHand.MAIN_HAND);
         return true;
      } else {
         return false;
      }
   }

   private void m_8833() {
      if (f_11537.gui.screen() instanceof ContainerScreen var1 && var1.getMenu() == f_11537.player.containerMenu && this.m_8825(var1)) {
         this.f_31712 = var1;
         this.f_31713 = f_11537.level;
         this.f_31706 = false;
      } else if (this.f_31712 != null && this.f_31713 == f_11537.level && f_11537.player.containerMenu == this.f_31712.getMenu()) {
         f_11537.gui.setScreen(this.f_31712);
      } else {
         this.f_31712 = null;
         this.f_31713 = null;
         if (!this.f_31706) {
            this.f_31706 = true;
            this.f_31703.m_4459();
         }
      }
   }

   @Override
   public void m_732() {
      this.f_31721 = false;
      this.f_31720++;
      this.f_31712 = null;
      this.f_31713 = null;
      this.f_31714 = null;
      this.f_31716 = false;
      this.f_31717 = null;
      this.f_31715 = false;
      this.f_31718 = 0L;
      this.f_31719 = 0L;
      this.f_31702.m_4459();
      this.f_31703.m_4459();
      this.f_31704 = false;
      this.f_31705 = false;
      this.f_31706 = false;
      this.f_31707 = false;
      this.f_31708 = AutoJoiner.VH0NOCViKrXI6IEe.REALLY_WORLD;
      this.f_31709 = null;
      this.f_31710 = AutoJoiner.VvMbq2HgAukAg1I7.IDLE;
      this.f_31711 = -1;
      super.m_732();
   }

   public void m_8834(Class_XzpX8S5F5zd9jbuE var1) {
      int var2 = this.f_31720;
      if (this.f_31721 && var1.m_5619() instanceof ClientboundSystemChatPacket var3 && !var3.overlay()) {
         AutoJoiner.WPgHAS1dlXm5hvom var5 = m_8837(var3.content().getString());
         if (var5 != null) {
            var1.m_1582(true);
            f_11537.execute(() -> {
               if (this.m_776() && this.f_31720 == var2) {
                  this.m_8805(var5);
               }
            });
         }
      } else {
         if (var1.m_5619() instanceof ClientboundLoginPacket || var1.m_5619() instanceof ClientboundRespawnPacket) {
            f_11537.execute(() -> {
               if (this.m_776() && this.f_31720 == var2) {
                  this.f_31715 = this.f_31707;
                  this.f_31712 = null;
                  this.f_31713 = null;
                  if (!this.f_31707) {
                     this.f_31716 = false;
                     this.f_31706 = true;
                     this.f_31704 = false;
                     if (this.f_31708 == AutoJoiner.VH0NOCViKrXI6IEe.HOLY_WORLD) {
                        this.f_31710 = AutoJoiner.VvMbq2HgAukAg1I7.WAITING_FOR_HUB;
                     }

                     this.f_31703.m_4459();
                  }
               }
            });
         }
      }
   }

   private void m_8835(int var1) {
      if (f_11537.gameMode != null && f_11537.player != null) {
         f_11537.gameMode.handleContainerInput(f_11537.player.containerMenu.containerId, var1, 0, ContainerInput.PICKUP, f_11537.player);
      }
   }

   private static AutoJoiner.WPgHAS1dlXm5hvom m_8837(String var0) {
      String var1 = m_8807(var0).replace(f_31754, f_31755).strip();
      boolean var2 = var1.startsWith(f_31756) || var1.startsWith(f_31757);
      if (var2 && var1.contains(f_31758)) {
         return AutoJoiner.WPgHAS1dlXm5hvom.BUSY;
      } else if (var2 && var1.contains(f_31759)) {
         return AutoJoiner.WPgHAS1dlXm5hvom.FULL;
      } else {
         return var1.startsWith(f_31760) && var1.contains(f_31761) && var1.contains(f_31762) ? AutoJoiner.WPgHAS1dlXm5hvom.COOLDOWN : null;
      }
   }

   public void m_8840(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null && f_11537.gameMode != null) {
         if (!this.f_31707
            || !this.f_31715
               && this.f_31714 == f_11537.level
               && (this.f_31708 != AutoJoiner.VH0NOCViKrXI6IEe.HOLY_WORLD || System.currentTimeMillis() - this.f_31718 < f_31736 || !this.m_8828())) {
            if (f_11537.player.isAlive() && !f_11537.player.isRemoved()) {
               if (this.f_31716) {
                  if (f_11537.level == this.f_31717) {
                     return;
                  }

                  this.f_31716 = false;
                  this.f_31703.m_4459();
               }

               this.m_8833();
               if (System.currentTimeMillis() >= this.f_31719) {
                  if (this.f_31706) {
                     long var13 = Math.max(f_31737, this.f_31701.m_8768().intValue() * f_31738);
                     if (this.f_31703.m_4463(var13) && this.m_8832()) {
                        this.f_31711 = -1;
                        if (this.f_31708 == AutoJoiner.VH0NOCViKrXI6IEe.HOLY_WORLD) {
                           this.f_31710 = AutoJoiner.VvMbq2HgAukAg1I7.SELECT_LIGHT;
                        }

                        this.f_31703.m_4459();
                        this.f_31702.m_4459();
                     }
                  } else if (f_11537.gui.screen() instanceof ContainerScreen) {
                     if (f_11537.player.containerMenu instanceof ChestMenu var2) {
                        if (this.f_31702.m_4463(this.f_31701.m_8768().intValue() * f_31739)) {
                           if (this.f_31708 == AutoJoiner.VH0NOCViKrXI6IEe.HOLY_WORLD) {
                              this.m_8806(var2);
                           } else {
                              String var14 = this.m_8819(f_11537.gui.screen().getTitle().getString());
                              this.m_8811(var14);
                              boolean var4 = var14.contains(f_31740);
                              boolean var5 = this.m_8826();
                              Item var6 = var5 ? Items.TNT : Items.CRAFTING_TABLE;
                              String var7 = var5 ? f_31741 : f_31742;
                              String var8 = String.valueOf(this.m_8829().m_8768().intValue());

                              for (Slot var10 : var2.slots) {
                                 if (var10.container != f_11537.player.getInventory() && var10.hasItem()) {
                                    if (var4 && var10.getItem().is(var6)) {
                                       this.m_8835(var10.index);
                                       this.f_31702.m_4459();
                                       return;
                                    }

                                    String var11 = this.m_8819(var10.getItem().getHoverName().getString());
                                    if (var11.contains(var7)) {
                                       this.m_8835(var10.index);
                                       this.f_31702.m_4459();
                                       return;
                                    }

                                    if (!var5 && !this.f_31704 && var11.contains(f_31743)) {
                                       this.m_8835(var10.index);
                                       this.f_31702.m_4459();
                                       return;
                                    }

                                    Matcher var12 = f_31695.matcher(var11);
                                    if (this.f_31704 && var12.find() && var12.group(1).equals(var8)) {
                                       this.m_8818();
                                       this.m_8810(var10.index);
                                       this.f_31702.m_4459();
                                       return;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         } else {
            this.m_777();
         }
      }
   }

   public boolean m_8841(AutoJoiner.UFtxOEj3EQyyOrKf var1) {
      if (f_11537.player == null || f_11537.player.connection == null) {
         return false;
      }

      if (!this.m_8809(var1)) {
         return false;
      }

      this.f_31716 = true;
      this.f_31717 = f_11537.level;
      f_11537.player.connection.sendCommand(f_31745);
      return true;
   }

   public enum UFeHKqfJkvHs4Fns {
      SOLO("соло", "solo"),
      DUO("дуо", "duo"),
      TRIO("трио", "trio"),
      CLAN("клан", "clan");

      public final String[] f_31686;

      UFeHKqfJkvHs4Fns(String... var3) {
         this.f_31686 = var3;
      }

      public boolean m_8803(String var1) {
         for (String var5 : this.f_31686) {
            if (var1.contains(var5)) {
               return true;
            }
         }

         return false;
      }

      public static AutoJoiner.UFeHKqfJkvHs4Fns m_8804(String var0) {
         for (AutoJoiner.UFeHKqfJkvHs4Fns var4 : values()) {
            if (var4.m_8803(var0)) {
               return var4;
            }
         }

         return null;
      }
   }

   public record UFtxOEj3EQyyOrKf(AutoJoiner.UFeHKqfJkvHs4Fns category, int number) {
   }

   private enum VH0NOCViKrXI6IEe {
      REALLY_WORLD,
      HOLY_WORLD;
   }

   private enum VvMbq2HgAukAg1I7 {
      IDLE,
      WAITING_FOR_HUB,
      SELECT_LIGHT,
      SELECT_CATEGORY,
      SELECT_SERVER,
      COMPLETE;
   }

   private enum WPgHAS1dlXm5hvom {
      BUSY,
      FULL,
      COOLDOWN;
   }
}
