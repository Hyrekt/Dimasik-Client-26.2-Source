package dev.dimasik.client.module.misc;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.module.autobuy.AutoBuy;
import dev.dimasik.client.setting.impl.BooleanSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_NzJrN63M7QBpmAbi;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_fFSER1OTAD5huhkq;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.ui.screen.Screen_3;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.gui.screens.inventory.ContainerScreen;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.HashedStack;
import net.minecraft.network.protocol.game.ServerboundContainerClickPacket;
import net.minecraft.util.StringUtil;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.ItemLore;

public final class AutoInventory extends Module {
   private static final Pattern f_11806 = Pattern.compile(AutoInventory.f_11898);
   private static final Pattern f_11807 = Pattern.compile(AutoInventory.f_11899);
   private static final long f_11808 = 100L;
   private static final long f_11809 = 100L;
   private static final long f_11810 = 100L;
   private static final int f_11811 = 49;
   private final AutoInventory.FA2KVor5csX1hjXb[][] f_11812 = new AutoInventory.FA2KVor5csX1hjXb[2][36];
   private final MultiChoiceSetting f_11813;
   private final BooleanSetting f_11814;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_11815;
   private AutoInventory.YtHknNpjyuGSplfv f_11816;
   private AutoInventory.FA2KVor5csX1hjXb f_11817;
   private long f_11818;
   private int f_11819;
   private int f_11820;
   private final List<AutoInventory.zexGFY9HRpaauCNM> f_11821;
   private final List<AutoInventory.GRHIGyJL5StNlDi5> f_11822;
   private boolean f_11823;
   private AutoInventory.GRHIGyJL5StNlDi5 f_11824;
   private int f_11825;
   private final List<AutoInventory.lhpQyFImmqnLmb8Z> f_11826;
   private AutoInventory.lhpQyFImmqnLmb8Z f_11827;
   private final Map<String, Integer> f_11828;
   private final Map<String, Integer> f_11829;
   private int f_11830;
   private int f_11831;
   private int f_11832;
   private long f_11833;
   private static final String f_11834 = "AutoInventory";
   private static final String f_11835 = "Автоматически собирает инвентарь";
   private static final String f_11836 = "Сервер";
   private static final String f_11837 = "Funtime 1.21";
   private static final String f_11838 = "Открыть панель";
   private static final long f_11839 = 1000L;
   private static final long f_11840 = 3500L;
   private static final long f_11841 = 100L;
   private static final long f_11842 = 300L;
   private static final long f_11843 = 100L;
   private static final long f_11844 = 300L;
   private static final long f_11845 = 100L;
   private static final long f_11846 = 1500L;
   private static final long f_11847 = 5000L;
   private static final String f_11848 = "������������� �������";
   private static final long f_11849 = 100L;
   private static final String f_11850 = "������� ��������";
   private static final long f_11851 = 100L;
   private static final long f_11852 = 300L;
   private static final long f_11853 = 3000L;
   private static final long f_11854 = 700L;
   private static final float f_11855 = 0.5F;
   private static final long f_11856 = Long.MAX_VALUE;
   private static final long f_11857 = Long.MAX_VALUE;
   private static final String f_11858 = "следующая страница";
   private static final String f_11859 = "следующая страница";
   private static final String f_11860 = "предыдущая страница";
   private static final long f_11861 = Long.MAX_VALUE;
   private static final String f_11862 = "подтверждение покупки";
   private static final String f_11863 = "подозрительная цена";
   private static final String f_11864 = "купить";
   private static final String f_11865 = "подтвердить";
   private static final String f_11866 = "[������]";
   private static final String f_11867 = "�������";
   private static final String f_11868 = "[★]";
   private static final String f_11869 = "[⚡]";
   private static final String f_11870 = "xxx";
   private static final String f_11871 = "[^\\p{L}\\p{N}$¤]+";
   private static final String f_11872 = " ";
   private static final long f_11873 = Long.MAX_VALUE;
   private static final String f_11874 = " ";
   private static final String f_11875 = ",";
   private static final String f_11876 = " ";
   private static final String f_11877 = "\\s+";
   private static final String f_11878 = " ";
   private static final String f_11879 = "HolyWorld";
   private static final float f_11880 = 0.5F;
   private static final String f_11881 = "Name";
   private static final String f_11882 = "Enabled";
   private static final String f_11883 = "Scan";
   private static final String f_11884 = "Count";
   private static final String f_11885 = "Loadout";
   private static final String f_11886 = "Loadout";
   private static final String f_11887 = "Loadout";
   private static final String f_11888 = "Loadout";
   private static final String f_11889 = "Name";
   private static final String f_11890 = "Name";
   private static final String f_11891 = "Enabled";
   private static final String f_11892 = "Enabled";
   private static final String f_11893 = "Scan";
   private static final String f_11894 = "Scan";
   private static final String f_11895 = "Count";
   private static final String f_11896 = "Count";
   private static final String f_11897 = "Funtime 1.21";
   private static final String f_11898 = "(?:\\$|¤)\\s*(?:Цена:?\\s*)?([0-9][\\d, ]*)";
   private static final String f_11899 = "(\\d+)\\s*/\\s*(\\d+)";

   private int m_4172() {
      return this.f_11817 == null ? 0 : Math.max(0, this.m_4215(this.f_11817) - this.f_11831);
   }

   public void m_4173(int var1) {
      if (var1 >= 0 && var1 < 36) {
         this.m_4190()[var1] = null;
      }
   }

   private boolean m_4174(ItemStack var1) {
      Item var2 = var1.getItem();
      return var2 == Items.BARRIER
         || var2 == Items.CHEST
         || var2 == Items.ENDER_CHEST
         || var2 == Items.HOPPER
         || var2 == Items.COMPASS
         || var2 == Items.ARROW
         || var2 == Items.SPECTRAL_ARROW
         || var2 == Items.PAPER
         || var2 == Items.STAINED_GLASS_PANE.green()
         || var2 == Items.STAINED_GLASS_PANE.black()
         || var2 == Items.STAINED_GLASS_PANE.lime()
         || var2 == Items.STAINED_GLASS_PANE.red()
         || var2 == Items.STAINED_GLASS_PANE.gray()
         || var2 == Items.STAINED_GLASS_PANE.white()
         || var2 == Items.STAINED_GLASS_PANE.orange()
         || var2 == Items.STAINED_GLASS_PANE.yellow()
         || var2 == Items.DYE.gray();
   }

   private int m_4175(AbstractContainerMenu var1, String var2) {
      int var3 = Math.max(0, var1.slots.size() - 36);

      for (int var4 = 0; var4 < var3; var4++) {
         Slot var5 = var1.getSlot(var4);
         if (var5.hasItem() && this.m_4214(var5.getItem().getHoverName().getString()).equals(var2)) {
            return var4;
         }
      }

      return -1;
   }

   public void m_4176(int var1, int var2) {
      if (var1 >= 0 && var1 < 36) {
         AutoInventory.FA2KVor5csX1hjXb var3 = this.m_4190()[var1];
         if (var3 != null) {
            int var4 = Math.clamp(var3.count() + var2, 1, var3.stack().getMaxStackSize());
            this.m_4190()[var1] = new AutoInventory.FA2KVor5csX1hjXb(var3.stack(), var3.name(), var4, var3.durability());
         }
      }
   }

   private boolean m_4177(AbstractContainerMenu var1) {
      String var2 = this.m_4214(f_11537.gui.screen().getTitle().getString());
      return var2.contains(f_11862) || var2.contains(f_11863);
   }

   public List<AutoInventory.zexGFY9HRpaauCNM> m_4178() {
      return List.copyOf(this.f_11821);
   }

   public boolean m_4180() {
      return this.f_11823;
   }

   private void m_4181(AbstractContainerMenu var1, int var2, int var3) {
      f_11537.gameMode.handleContainerInput(var1.containerId, var2, var3, ContainerInput.PICKUP, f_11537.player);
   }

   private void m_4182() {
      this.f_11830 = 0;
      this.f_11831 = 0;
      this.f_11832 = -1;
      this.f_11833 = 0L;
   }

   private String m_4183(String var1) {
      return var1 == null ? "" : var1.replace(f_11868, "").replace(f_11869, "").replace(f_11870, "").trim();
   }

   private int[] m_4184() {
      if (f_11537.gui.screen() != null && f_11537.gui.screen().getTitle() != null) {
         Matcher var1 = f_11807.matcher(this.m_4214(f_11537.gui.screen().getTitle().getString()));
         if (!var1.find()) {
            return null;
         }

         try {
            return new int[]{Integer.parseInt(var1.group(1)), Integer.parseInt(var1.group(2))};
         } catch (NumberFormatException var3) {
            return null;
         }
      } else {
         return null;
      }
   }

   private int m_4185(AbstractContainerMenu var1, AutoInventory.FA2KVor5csX1hjXb var2) {
      String var3 = f_11537.player.getName().getString();
      int var4 = Math.min(45, this.m_4206(var1));
      int var5 = -1;
      long var6 = f_11857;

      for (int var8 = 0; var8 < var4; var8++) {
         ItemStack var9 = var1.getSlot(var8).getItem();
         if (this.m_4223(var9) && this.m_4216(var2, var9) && var9.getCount() <= var2.count()) {
            String var10 = Class_fFSER1OTAD5huhkq.m_6483(var9);
            if (var10 == null || !var10.equalsIgnoreCase(var3)) {
               long var11 = Class_fFSER1OTAD5huhkq.m_6475(var9);
               if (var11 > 0L && var11 < var6) {
                  var6 = var11;
                  var5 = var8;
               }
            }
         }
      }

      return var5;
   }

   private void m_4186(ItemStack var1, int var2, long var3) {
      this.f_11830 = var1 != null && !var1.isEmpty() ? Math.max(1, var1.getCount()) : 1;
      this.f_11831 = this.f_11817 == null ? 0 : this.m_4215(this.f_11817);
      this.f_11832 = var2;
      this.f_11833 = var3;
   }

   @Override
   public void m_732() {
      this.f_11823 = false;
      this.m_4204();
   }

   private boolean m_4187(AbstractContainerMenu var1) {
      return var1.slots.size() >= 45 && !this.m_4214(f_11537.gui.screen().getTitle().getString()).contains(f_11867);
   }

   public void m_4188(int var1) {
      if (f_11537.player != null && var1 >= 0 && var1 < 36) {
         ItemStack var2 = f_11537.player.getMainHandItem();
         if (!var2.isEmpty()) {
            float var3 = var2.isDamageableItem() ? (float)(var2.getMaxDamage() - var2.getDamageValue()) / var2.getMaxDamage() : 0.0F;
            this.m_4190()[var1] = new AutoInventory.FA2KVor5csX1hjXb(var2.copyWithCount(1), var2.getHoverName().getString(), Math.max(1, var2.getCount()), var3);
         }
      }
   }

   private AutoInventory.FA2KVor5csX1hjXb m_4189() {
      List<AutoInventory.GRHIGyJL5StNlDi5> var1 = this.m_4212();
      this.f_11825 = 0;

      for (AutoInventory.GRHIGyJL5StNlDi5 var3 : var1) {
         if (var3.m_4169()) {
            AutoInventory.FA2KVor5csX1hjXb var4 = new AutoInventory.FA2KVor5csX1hjXb(
               var3.m_4167(), var3.m_4168(), var3.m_4164(), var3.m_4167().isDamageableItem() ? f_11855 : 0.0F
            );
            int var5 = this.m_4215(var4);
            int var6 = this.f_11828.getOrDefault(var3.m_4168(), var5) + this.f_11829.getOrDefault(var3.m_4168(), 0);
            int var7 = Math.max(var5, var6);
            if (var7 < var4.count()) {
               this.f_11824 = var3;
               return new AutoInventory.FA2KVor5csX1hjXb(var4.stack(), var4.name(), var4.count() - var7, var4.durability());
            }

            this.f_11825++;
         }
      }

      this.f_11824 = null;
      return null;
   }

   @Override
   public void m_778() {
      this.m_4207();
   }

   public AutoInventory.FA2KVor5csX1hjXb[] m_4190() {
      return this.f_11812[this.f_11813.m_7568(f_11879) ? 1 : 0];
   }

   public void m_4192() {
      AutoInventory.FA2KVor5csX1hjXb[] var1 = this.m_4190();

      for (int var2 = 0; var2 < 36; var2++) {
         ItemStack var3 = f_11537.player.getInventory().getItem(var2);
         float var4 = var3.isDamageableItem() ? (float)(var3.getMaxDamage() - var3.getDamageValue()) / var3.getMaxDamage() : 0.0F;
         var1[var2] = var3.isEmpty() ? null : new AutoInventory.FA2KVor5csX1hjXb(var3.copyWithCount(1), var3.getHoverName().getString(), var3.getCount(), var4);
      }
   }

   private boolean m_4193(AbstractContainerMenu var1, String var2) {
      int var3 = this.m_4206(var1);

      for (int var4 = 0; var4 < var3; var4++) {
         ItemStack var5 = var1.getSlot(var4).getItem();
         if (!var5.isEmpty() && this.m_4214(var5.getHoverName().getString()).contains(var2)) {
            this.m_4197(var1, var4, ContainerInput.QUICK_MOVE);
            return true;
         }
      }

      return false;
   }

   private void m_4194(int var1, long var2) {
      AutoInventory.GRHIGyJL5StNlDi5 var4 = this.f_11824;
      this.m_4209(var1);
      AutoInventory.FA2KVor5csX1hjXb var5 = this.m_4189();
      if (var5 == null) {
         this.f_11823 = false;
         if (f_11537.gui.screen() != null) {
            f_11537.player.closeContainer();
         }

         this.m_4204();
      } else {
         this.f_11817 = var5;
         if (var4 == this.f_11824 && this.m_4201()) {
            this.f_11816 = AutoInventory.YtHknNpjyuGSplfv.WAIT_AUCTION;
            this.f_11818 = var2;
         } else {
            if (f_11537.gui.screen() != null) {
               f_11537.player.closeContainer();
            }

            f_11537.player.connection.sendCommand(this.m_4183(this.f_11817.name()) + "");
            this.f_11816 = AutoInventory.YtHknNpjyuGSplfv.WAIT_AUCTION;
            this.f_11818 = var2;
            this.f_11819 = -1;
         }
      }
   }

   private boolean m_4195(AbstractContainerMenu var1, AutoInventory.FA2KVor5csX1hjXb var2, long var3) {
      int[] var5 = this.m_4184();
      if (var5 == null) {
         return false;
      }

      int var6 = var5[0];
      int var7 = Math.min(4, var5[1]);
      if (this.f_11827 == null) {
         boolean var8 = this.f_11826.stream().anyMatch(var1x -> var1x.page() == var6);
         if (!var8) {
            int var9 = Math.min(45, this.m_4206(var1));

            for (int var10 = 0; var10 < var9; var10++) {
               ItemStack var11 = var1.getSlot(var10).getItem();
               if (this.m_4223(var11) && this.m_4216(var2, var11) && var11.getCount() <= var2.count()) {
                  long var12 = Class_fFSER1OTAD5huhkq.m_6475(var11);
                  if (var12 > 0L) {
                     this.f_11826.add(new AutoInventory.lhpQyFImmqnLmb8Z(var6, var12));
                  }
               }
            }
         }

         if (var6 < var7) {
            if (this.m_4193(var1, f_11858)) {
               this.f_11818 = var3;
            }

            return true;
         }

         this.f_11827 = this.f_11826.stream().min((var0, var1x) -> Long.compare(var0.price(), var1x.price())).orElse(null);
         if (this.f_11827 == null) {
            this.f_11826.clear();
            return false;
         }
      }

      if (var6 != this.f_11827.page()) {
         if (this.m_4193(var1, var6 < this.f_11827.page() ? f_11859 : f_11860)) {
            this.f_11818 = var3;
         }

         return true;
      } else {
         int var16 = Math.min(45, this.m_4206(var1));
         int var17 = -1;
         long var18 = f_11861;

         for (int var19 = 0; var19 < var16; var19++) {
            ItemStack var13 = var1.getSlot(var19).getItem();
            if (this.m_4223(var13) && this.m_4216(var2, var13) && var13.getCount() <= var2.count()) {
               long var14 = Class_fFSER1OTAD5huhkq.m_6475(var13);
               if (var14 == this.f_11827.price()) {
                  this.m_4186(var13, var19, var3);
                  this.m_4197(var1, var19, ContainerInput.QUICK_MOVE);
                  this.f_11816 = AutoInventory.YtHknNpjyuGSplfv.WAIT_PURCHASE;
                  this.f_11818 = var3;
                  return true;
               }

               if (var14 > 0L && var14 < var18) {
                  var18 = var14;
                  var17 = var19;
               }
            }
         }

         if (var17 >= 0) {
            this.m_4186(var1.getSlot(var17).getItem(), var17, var3);
            this.m_4197(var1, var17, ContainerInput.QUICK_MOVE);
            this.f_11816 = AutoInventory.YtHknNpjyuGSplfv.WAIT_PURCHASE;
            this.f_11818 = var3;
            return true;
         } else {
            this.f_11827 = null;
            this.f_11826.clear();
            return false;
         }
      }
   }

   public String m_4196() {
      return this.f_11813.m_7564().m_1181();
   }

   private void m_4197(AbstractContainerMenu var1, int var2, ContainerInput var3) {
      HashedStack var4 = HashedStack.create(var1.getCarried(), f_11537.player.connection.decoratedHashOpsGenenerator());
      f_11537.player
         .connection
         .send(new ServerboundContainerClickPacket(var1.containerId, var1.getStateId(), (short)var2, (byte)0, var3, Int2ObjectMaps.emptyMap(), var4));
   }

   public int m_4198() {
      return this.m_4227();
   }

   private void m_4199(long var1) {
      this.f_11816 = AutoInventory.YtHknNpjyuGSplfv.IDLE;
      this.f_11817 = null;
      this.f_11818 = var1;
      this.f_11819 = -1;
      this.m_4182();
      this.f_11826.clear();
      this.f_11827 = null;
   }

   public void m_4200() {
      AutoInventory.FA2KVor5csX1hjXb[] var1 = this.m_4190();

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = null;
      }
   }

   private boolean m_4201() {
      return f_11537.gui.screen() != null
         && f_11537.gui.screen().getTitle() != null
         && Class_fFSER1OTAD5huhkq.m_6468(f_11537.gui.screen().getTitle().getString());
   }

   public AutoInventory() {
      super(f_11834, f_11835, Category.MISC);
      this.f_11813 = new MultiChoiceSetting(f_11836, new Class_2ZaVm8TGDJ68TnJB(f_11837));
      this.f_11814 = new BooleanSetting(f_11838).m_1474(this::m_4207).m_1472();
      this.f_11815 = this::m_4220;
      this.f_11816 = AutoInventory.YtHknNpjyuGSplfv.IDLE;
      this.f_11819 = -1;
      this.f_11821 = new ArrayList<>();
      this.f_11822 = new ArrayList<>();
      this.f_11826 = new ArrayList<>();
      this.f_11828 = new HashMap<>();
      this.f_11829 = new HashMap<>();
      this.f_11832 = -1;
      this.m_795(this.f_11813, this.f_11814);
   }

   private long m_4203(ItemStack var1) {
      Matcher var2 = f_11806.matcher(this.m_4221(var1));
      long var3 = f_11873;

      while (var2.find()) {
         try {
            var3 = Math.min(var3, Long.parseLong(var2.group(1).replace(f_11874, "").replace(f_11875, "")));
         } catch (NumberFormatException var6) {
         }
      }

      return var3;
   }

   private void m_4204() {
      this.f_11816 = AutoInventory.YtHknNpjyuGSplfv.IDLE;
      this.f_11817 = null;
      this.f_11818 = System.currentTimeMillis();
      this.f_11819 = -1;
      this.f_11820 = 0;
      this.m_4182();
      this.f_11824 = null;
      this.f_11826.clear();
      this.f_11827 = null;
   }

   private int m_4205(AbstractContainerMenu var1, AutoInventory.FA2KVor5csX1hjXb var2) {
      int var3 = Math.min(45, Math.max(0, var1.slots.size() - 36));
      int var4 = -1;
      long var5 = f_11856;

      for (int var7 = 0; var7 < var3; var7++) {
         Slot var8 = var1.getSlot(var7);
         if (var8.hasItem() && this.m_4216(var2, var8.getItem())) {
            long var9 = this.m_4203(var8.getItem());
            if (var9 < var5) {
               var5 = var9;
               var4 = var7;
            }
         }
      }

      return var4;
   }

   private int m_4206(AbstractContainerMenu var1) {
      return Math.max(0, Math.min(54, var1.slots.size() - 36));
   }

   private void m_4207() {
      if (f_11537.player != null) {
         if (!this.m_776()) {
            this.m_792();
         } else {
            this.m_4204();
            this.f_11823 = false;
            this.f_11821.clear();
            if (f_11537.player != null) {
               f_11537.gui.setScreen(new Screen_3(this));
            }
         }
      }
   }

   @Override
   public void m_791(JsonObject var1) {
      super.m_791(var1);
      if (var1 != null && var1.has(f_11886) && var1.get(f_11887).isJsonArray()) {
         List<AutoInventory.GRHIGyJL5StNlDi5> var2 = this.m_4212();

         for (JsonElement var4 : var1.getAsJsonArray(f_11888)) {
            if (var4.isJsonObject()) {
               JsonObject var5 = var4.getAsJsonObject();
               if (var5.has(f_11889)) {
                  String var6 = var5.get(f_11890).getAsString();
                  AutoInventory.GRHIGyJL5StNlDi5 var7 = var2.stream().filter(var1x -> var1x.m_4168().equals(var6)).findFirst().orElse(null);
                  if (var7 != null) {
                     if (var5.has(f_11891)) {
                        var7.m_4163(var5.get(f_11892).getAsBoolean());
                     }

                     if (var5.has(f_11893)) {
                        var7.m_4171(var5.get(f_11894).getAsBoolean());
                     }

                     if (var5.has(f_11895)) {
                        var7.m_4170(var5.get(f_11896).getAsInt());
                     }
                  }
               }
            }
         }
      }
   }

   private boolean m_4208() {
      return this.f_11813.m_7568(f_11897);
   }

   private void m_4209(int var1) {
      if (this.f_11817 != null) {
         var1 = Math.max(1, var1);
         if (this.f_11824 != null) {
            this.f_11829.merge(this.f_11824.m_4168(), var1, Integer::sum);
         }

         this.f_11821.add(new AutoInventory.zexGFY9HRpaauCNM(this.f_11817.stack().copy(), this.f_11817.name(), var1, System.currentTimeMillis()));
         this.m_4182();
      }
   }

   private int m_4210(AbstractContainerMenu var1) {
      int var2 = Math.max(0, var1.slots.size() - 36);

      for (int var3 = 0; var3 < var2; var3++) {
         Slot var4 = var1.getSlot(var3);
         if (var4.hasItem()) {
            String var5 = this.m_4214(var4.getItem().getHoverName().getString());
            if (var5.contains(f_11864) || var5.contains(f_11865)) {
               return var3;
            }
         }
      }

      return var2 == 27 ? 0 : this.m_4175(var1, f_11866);
   }

   private String m_4211(String var1) {
      return StringUtil.stripColor(var1 == null ? "" : var1).toLowerCase(Locale.ROOT).replace('ё', 'е').replaceAll(f_11871, f_11872).trim();
   }

   @Override
   public JsonObject m_782() {
      JsonObject var1 = super.m_782();
      JsonArray var2 = new JsonArray();

      for (AutoInventory.GRHIGyJL5StNlDi5 var4 : this.m_4212()) {
         JsonObject var5 = new JsonObject();
         var5.addProperty(f_11881, var4.m_4168());
         var5.addProperty(f_11882, var4.m_4169());
         var5.addProperty(f_11883, var4.m_4165());
         var5.addProperty(f_11884, var4.m_4164());
         var2.add(var5);
      }

      var1.add(f_11885, var2);
      return var1;
   }

   public List<AutoInventory.GRHIGyJL5StNlDi5> m_4212() {
      for (AutoBuy.EfEV0McZpW4GEOT8 var3 : DimasikClient.m_9057().m_9049().m_2801().m_3503().m_3908()) {
         boolean var4 = this.f_11822.stream().anyMatch(var1 -> var1.m_4168().equals(var3.name()));
         if (!var4) {
            this.f_11822.add(new AutoInventory.GRHIGyJL5StNlDi5(var3));
         }
      }

      return this.f_11822;
   }

   private String m_4214(String var1) {
      return StringUtil.stripColor(var1 == null ? "" : var1).toLowerCase(Locale.ROOT).replaceAll(f_11877, f_11878).trim();
   }

   private int m_4215(AutoInventory.FA2KVor5csX1hjXb var1) {
      if (f_11537.player == null) {
         return 0;
      }

      int var2 = 0;

      for (int var3 = 0; var3 < f_11537.player.getInventory().getContainerSize(); var3++) {
         ItemStack var4 = f_11537.player.getInventory().getItem(var3);
         if (this.m_4216(var1, var4)) {
            var2 += var4.getCount();
         }
      }

      return var2;
   }

   private boolean m_4216(AutoInventory.FA2KVor5csX1hjXb var1, ItemStack var2) {
      if (var2 != null && !var2.isEmpty() && var2.getItem() == var1.stack().getItem()) {
         if (var1.durability() > 0.0F && var2.isDamageableItem()) {
            float var3 = (float)(var2.getMaxDamage() - var2.getDamageValue()) / var2.getMaxDamage();
            if (var3 < var1.durability()) {
               return false;
            }
         }

         AutoInventory.GRHIGyJL5StNlDi5 var5 = this.m_4212().stream().filter(var1x -> var1x.m_4168().equals(var1.name())).findFirst().orElse(null);
         if (var5 != null) {
            return var5.m_4166(var2, this.m_4211(this.m_4221(var2)));
         }

         String var4 = this.m_4214(this.m_4183(var1.name()));
         return (var4.isEmpty() || this.m_4221(var2).contains(var4)) && Class_fFSER1OTAD5huhkq.m_6464(this.m_4183(var1.name()), var2);
      } else {
         return false;
      }
   }

   public void m_4217() {
      if (this.m_4227() != 0) {
         this.m_4204();
         this.f_11828.clear();
         this.f_11829.clear();

         for (AutoInventory.GRHIGyJL5StNlDi5 var2 : this.m_4212()) {
            if (var2.m_4169()) {
               AutoInventory.FA2KVor5csX1hjXb var3 = new AutoInventory.FA2KVor5csX1hjXb(
                  var2.m_4167(), var2.m_4168(), var2.m_4164(), var2.m_4167().isDamageableItem() ? f_11880 : 0.0F
               );
               this.f_11828.put(var2.m_4168(), this.m_4215(var3));
            }
         }

         this.f_11823 = true;
         this.f_11818 = 0L;
      }
   }

   public int m_4218() {
      return this.f_11825;
   }

   private void m_4220(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null && f_11537.gameMode != null && f_11537.player.connection != null) {
         long var2 = System.currentTimeMillis();
         if (!(f_11537.gui.screen() instanceof Screen_3)) {
            if (this.f_11823) {
               if (f_11537.player.getInventory().getFreeSlot() == -1 && this.m_4189() != null) {
                  this.f_11823 = false;
                  if (f_11537.gui.screen() != null) {
                     f_11537.player.closeContainer();
                  }

                  this.m_4204();
               } else if (this.f_11816 == AutoInventory.YtHknNpjyuGSplfv.IDLE) {
                  if (var2 - this.f_11818 >= f_11839) {
                     this.f_11817 = this.m_4189();
                     if (this.f_11817 == null) {
                        this.f_11823 = false;
                        this.m_4204();
                     } else {
                        f_11537.player.connection.sendCommand(this.m_4183(this.f_11817.name()) + "");
                        this.f_11816 = AutoInventory.YtHknNpjyuGSplfv.WAIT_AUCTION;
                        this.f_11818 = var2;
                     }
                  }
               } else {
                  if (this.f_11816 == AutoInventory.YtHknNpjyuGSplfv.WAIT_PURCHASE) {
                     int var4 = this.m_4172();
                     if (var4 > 0) {
                        this.m_4194(var4, var2);
                        return;
                     }
                  }

                  if (!(f_11537.gui.screen() instanceof ContainerScreen)) {
                     if (var2 - this.f_11818 > f_11840) {
                        this.m_4199(var2);
                     }
                  } else {
                     AbstractContainerMenu var10 = f_11537.player.containerMenu;
                     if (this.f_11816 == AutoInventory.YtHknNpjyuGSplfv.WAIT_AUCTION) {
                        if (this.f_11819 != var10.containerId) {
                           this.f_11819 = var10.containerId;
                           this.f_11818 = var2;
                        }

                        long var11 = this.m_4208() ? f_11841 : f_11842;
                        if (var2 - this.f_11818 >= var11) {
                           if (!this.m_4208() || this.f_11824 == null || !this.f_11824.m_4165() || !this.m_4195(var10, this.f_11817, var2)) {
                              int var7 = this.m_4208() ? this.m_4185(var10, this.f_11817) : this.m_4205(var10, this.f_11817);
                              if (var7 >= 0) {
                                 ItemStack var8 = var10.getSlot(var7).getItem();
                                 this.m_4186(var8, var7, var2);
                                 boolean var9 = !this.m_4208() && var8.getCount() > this.f_11817.count();
                                 this.f_11820 = var9 ? Math.max(0, this.f_11817.count() - 1) : 0;
                                 if (this.m_4208()) {
                                    this.m_4197(var10, var7, ContainerInput.QUICK_MOVE);
                                 } else {
                                    this.m_4181(var10, var7, var9 ? 1 : 0);
                                 }

                                 this.f_11816 = AutoInventory.YtHknNpjyuGSplfv.WAIT_PURCHASE;
                                 this.f_11818 = var2;
                              } else if (this.m_4208() && var10.slots.size() > 49 && var2 - this.f_11818 >= f_11843) {
                                 ContainerInput var12 = ThreadLocalRandom.current().nextInt(100) < 25 ? ContainerInput.QUICK_MOVE : ContainerInput.PICKUP;
                                 this.m_4197(var10, 49, var12);
                                 this.f_11818 = var2;
                              } else if (this.m_4208()) {
                                 this.f_11818 = var2;
                              } else if (this.m_4222(var10) && var2 - this.f_11818 >= f_11844) {
                                 this.m_4181(var10, 50, 0);
                                 this.f_11818 = var2;
                                 this.f_11819 = -1;
                              } else if (!this.m_4222(var10)) {
                                 f_11537.player.closeContainer();
                                 this.m_4199(var2);
                              }
                           }
                        }
                     } else if (this.f_11816 == AutoInventory.YtHknNpjyuGSplfv.WAIT_PURCHASE) {
                        if (this.m_4208()) {
                           if (this.m_4177(var10)) {
                              if (var2 - this.f_11833 >= f_11845 && var10.slots.size() > 1) {
                                 this.m_4197(var10, 1, ContainerInput.QUICK_MOVE);
                                 this.f_11833 = var2;
                              }
                           } else if (this.m_4201()) {
                              if (var2 - this.f_11818 > f_11846) {
                                 this.m_4182();
                                 this.f_11816 = AutoInventory.YtHknNpjyuGSplfv.WAIT_AUCTION;
                                 this.f_11818 = var2;
                              }
                           } else if (var2 - this.f_11818 > f_11847) {
                              if (f_11537.gui.screen() != null) {
                                 f_11537.player.closeContainer();
                              }

                              this.m_4182();
                              this.m_4199(var2);
                           }
                        } else {
                           String var5 = this.m_4214(f_11537.gui.screen().getTitle().getString());
                           if (this.m_4208() && var5.contains(f_11848)) {
                              if (var2 - this.f_11818 >= f_11849) {
                                 int var6 = this.m_4210(var10);
                                 if (var6 >= 0) {
                                    this.m_4181(var10, var6, 0);
                                    this.m_4224();
                                    this.f_11816 = AutoInventory.YtHknNpjyuGSplfv.VERIFY;
                                    this.f_11818 = var2;
                                 }
                              }
                           } else if (!this.m_4208() && var5.contains(f_11850) && var2 - this.f_11818 >= f_11851) {
                              if (this.f_11820 >= 10) {
                                 this.m_4181(var10, 4, 0);
                                 this.f_11820 -= 10;
                              } else if (this.f_11820 > 0) {
                                 this.m_4181(var10, 3, 0);
                                 this.f_11820--;
                              } else if (var10.slots.size() > 2) {
                                 this.m_4181(var10, 2, 0);
                                 this.m_4224();
                                 this.f_11816 = AutoInventory.YtHknNpjyuGSplfv.VERIFY;
                              }

                              this.f_11818 = var2;
                           } else if (this.m_4187(var10) && var2 - this.f_11818 >= f_11852) {
                              this.f_11816 = AutoInventory.YtHknNpjyuGSplfv.WAIT_AUCTION;
                              this.f_11818 = var2;
                           } else if (var2 - this.f_11818 > f_11853) {
                              f_11537.player.closeContainer();
                              this.m_4199(var2);
                           }
                        }
                     } else {
                        if (this.f_11816 == AutoInventory.YtHknNpjyuGSplfv.VERIFY && var2 - this.f_11818 >= f_11854) {
                           if (f_11537.gui.screen() != null) {
                              f_11537.player.closeContainer();
                           }

                           this.m_4199(var2);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private String m_4221(ItemStack var1) {
      ArrayList var2 = new ArrayList();
      var2.add(var1.getHoverName().getString());
      ItemLore var3 = (ItemLore)var1.getComponents().get(DataComponents.LORE);
      if (var3 != null) {
         var3.lines().forEach(var1x -> var2.add(var1x.getString()));
      }

      return this.m_4214(String.join(f_11876, var2));
   }

   private boolean m_4222(AbstractContainerMenu var1) {
      return var1.slots.size() > 50 && var1.getSlot(50).hasItem() && var1.getSlot(50).getItem().is(Items.ARROW);
   }

   private boolean m_4223(ItemStack var1) {
      return var1 != null && !var1.isEmpty() && !this.m_4174(var1);
   }

   private void m_4224() {
      this.m_4209(Math.max(1, this.f_11830));
   }

   public void m_4226(int var1, ItemStack var2, String var3) {
      if (var1 >= 0 && var1 < 36 && var2 != null && !var2.isEmpty()) {
         float var4 = var2.isDamageableItem() ? 1.0F : 0.0F;
         this.m_4190()[var1] = new AutoInventory.FA2KVor5csX1hjXb(var2.copyWithCount(1), var3, Math.max(1, var2.getCount()), var4);
      }
   }

   public int m_4227() {
      int var1 = 0;

      for (AutoInventory.GRHIGyJL5StNlDi5 var3 : this.m_4212()) {
         if (var3.m_4169()) {
            var1++;
         }
      }

      return var1;
   }

   public record FA2KVor5csX1hjXb(ItemStack stack, String name, int count, float durability) {
   }

   public static final class GRHIGyJL5StNlDi5 {
      public final AutoBuy.EfEV0McZpW4GEOT8 f_11801;
      public boolean f_11802;
      public boolean f_11803;
      public int f_11804 = 1;
      public boolean f_11805;

      public GRHIGyJL5StNlDi5(AutoBuy.EfEV0McZpW4GEOT8 var1) {
         this.f_11801 = var1;
      }

      public void m_4163(boolean var1) {
         this.f_11802 = var1;
      }

      public int m_4164() {
         if (this.f_11805 && Class_NzJrN63M7QBpmAbi.f_11537.level != null) {
            this.m_4170(this.f_11804);
         }

         return this.f_11804;
      }

      public boolean m_4165() {
         return this.f_11803;
      }

      public boolean m_4166(ItemStack var1, String var2) {
         if (!this.f_11801.catalogEntry().matches(var1)) {
            return false;
         }

         if (var2.contains(this.f_11801.normalizedName())) {
            return true;
         }

         for (String var6 : this.f_11801.aliases()) {
            if (!var6.isEmpty() && var2.contains(var6)) {
               return true;
            }
         }

         return false;
      }

      public ItemStack m_4167() {
         return this.f_11801.stack();
      }

      public String m_4168() {
         return this.f_11801.name();
      }

      public boolean m_4169() {
         return this.f_11802;
      }

      public void m_4170(int var1) {
         this.f_11805 = Class_NzJrN63M7QBpmAbi.f_11537.level == null;
         this.f_11804 = this.f_11805 ? Math.max(1, var1) : Math.clamp(var1, 1, Math.max(1, this.m_4167().getMaxStackSize() * 4));
      }

      public void m_4171(boolean var1) {
         this.f_11803 = var1;
      }
   }

   private enum YtHknNpjyuGSplfv {
      IDLE,
      WAIT_AUCTION,
      WAIT_PURCHASE,
      VERIFY;
   }

   private record lhpQyFImmqnLmb8Z(int page, long price) {
   }

   public record zexGFY9HRpaauCNM(ItemStack stack, String name, int count, long time) {
   }
}
