package dev.dimasik.client.module.combat;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.IntegerSetting;
import dev.dimasik.client.setting.impl.ModeSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.system.Class_21JsiqqLzgnqk2Dg;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_8UIDpbIRPAjhei7m;
import dev.dimasik.client.system.Class_8x4deAyjocMIBSj7;
import dev.dimasik.client.system.Class_B6JOzHnwhU3pe4AO;
import dev.dimasik.client.system.Class_B6vpBUNmRtH3JzmV;
import dev.dimasik.client.system.Class_GKE8JpI4Qs4PXIz2;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.ui.screen.Screen_5;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;
import java.util.Locale;
import net.minecraft.core.NonNullList;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.NbtOps;
import net.minecraft.nbt.SnbtPrinterTagVisitor;
import net.minecraft.nbt.Tag;
import net.minecraft.network.chat.Component;
import net.minecraft.util.StringUtil;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class AutoSwap extends Module {
   private static final String f_25192 = "minecraft:player_head@count=1#746f5fd026d01d8bf903146741d073afd590a109d4e459a9019a1d5f76571356";
   private final MultiChoiceSetting f_25193;
   private final MultiChoiceSetting f_25194;
   private final MultiChoiceSetting f_25195;
   private final MultiChoiceSetting f_25196;
   private final ModeSetting f_25197;
   private final ModeSetting f_25198;
   private final CheckboxSetting f_25199;
   private final IntegerSetting f_25200;
   private final IntegerSetting f_25201;
   private AutoSwap.Class_3zMOriHcgr2XRdXk f_25202;
   private boolean f_25203;
   private Screen_5 f_25204;
   private final Class_21JsiqqLzgnqk2Dg f_25205;
   private final Class_8x4deAyjocMIBSj7 f_25206;
   private int f_25207;
   private final ItemStack[] f_25208;
   private final String[] f_25209;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_25210;
   private final Class_gEPk7yDw6CwIte87<Class_B6JOzHnwhU3pe4AO> f_25211;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_25212;
   private static final String f_25213 = "AutoSwap";
   private static final String f_25214 = "Автоматически перемещает предметы между главной и второй руками";
   private static final String f_25215 = "Режим";
   private static final String f_25216 = "Обычный";
   private static final String f_25217 = "Тройной";
   private static final String f_25218 = "Первый предмет";
   private static final String f_25219 = "Сфера, Шар";
   private static final String f_25220 = "Талисман";
   private static final String f_25221 = "Щит";
   private static final String f_25222 = "Золотое яблоко";
   private static final String f_25223 = "Второй предмет";
   private static final String f_25224 = "Сфера, Шар";
   private static final String f_25225 = "Талисман";
   private static final String f_25226 = "Щит";
   private static final String f_25227 = "Золотое яблоко";
   private static final String f_25228 = "Третий предмет";
   private static final String f_25229 = "Сфера, Шар";
   private static final String f_25230 = "Талисман";
   private static final String f_25231 = "Щит";
   private static final String f_25232 = "Золотое яблоко";
   private static final String f_25233 = "Cerberus Item Signature";
   private static final String f_25234 = "minecraft:player_head@count=1#746f5fd026d01d8bf903146741d073afd590a109d4e459a9019a1d5f76571356";
   private static final String f_25235 = "Cerberus Item Data Signature";
   private static final String f_25236 = "Игнорировать обычные тотемы";
   private static final String f_25237 = "Клавиша свапа";
   private static final String f_25238 = "Свап Сферы Цербера";
   private static final String f_25239 = "Тройной";
   private static final String f_25240 = "Легитный";
   private static final String f_25241 = "Рейджовый";
   private static final String f_25242 = "swap";
   private static final String f_25243 = "M";
   private static final String f_25244 = "В левой руке";
   private static final String f_25245 = "Сфера, Шар";
   private static final String f_25246 = "Талисман";
   private static final String f_25247 = "Щит";
   private static final String f_25248 = "Любая еда";
   private static final String f_25249 = "Золотое яблоко";
   private static final String f_25250 = "Сфера, Шар";
   private static final String f_25251 = "Талисман";
   private static final String f_25252 = "Щит";
   private static final String f_25253 = "Любая еда";
   private static final String f_25254 = "Золотое яблоко";
   private static final String f_25255 = "Сфера, Шар";
   private static final String f_25256 = "Талисман";
   private static final String f_25257 = "Щит";
   private static final String f_25258 = "Любая еда";
   private static final String f_25259 = "Золотое яблоко";
   private static final String f_25260 = "\\s+";
   private static final String f_25261 = " ";
   private static final String f_25262 = "сфера цербера";
   private static final String f_25263 = "cerberus sphere";
   private static final String f_25264 = "SHA-256";
   private static final String f_25265 = "Талисман";
   private static final String f_25266 = "Талисман";
   private static final String f_25267 = "Тройной";
   private static final String f_25268 = "Талисман";
   private static final String f_25269 = "Тройной";

   private boolean m_7489(ItemStack var1) {
      return var1 != null && !var1.isEmpty() && var1.is(Items.TOTEM_OF_UNDYING) && !this.m_7516(var1);
   }

   private int m_7490(ItemStack var1, String var2) {
      if (var1 != null && !var1.isEmpty() && f_11537.player != null && !this.m_7529(var1)) {
         NonNullList var3 = f_11537.player.getInventory().getNonEquipmentItems();

         for (int var4 = 0; var4 < var3.size(); var4++) {
            ItemStack var5 = (ItemStack)var3.get(var4);
            if (!this.m_7529(var5)
               && (ItemStack.isSameItemSameComponents(var5, var1) || !var2.isBlank() && var5.getHoverName().getString().equalsIgnoreCase(var2))) {
               return this.m_7507(var4);
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   private boolean m_7491() {
      return this.f_25201.m_8768() >= 0;
   }

   private int m_7492() {
      if (f_11537.player == null) {
         return -1;
      }

      for (int var1 = 0; var1 < 36; var1++) {
         ItemStack var2 = f_11537.player.getInventory().getItem(var1);
         if (this.m_7496(var2)) {
            this.m_7521(var2);
            return this.m_7507(var1);
         }
      }

      for (int var3 = 0; var3 < 36; var3++) {
         ItemStack var4 = f_11537.player.getInventory().getItem(var3);
         if (this.m_7528(var4)) {
            return this.m_7507(var3);
         }
      }

      return -1;
   }

   private Item m_7493() {
      return switch (this.f_25194.m_7564().m_1181()) {
         case f_25245 -> Items.PLAYER_HEAD;
         case f_25246 -> Items.TOTEM_OF_UNDYING;
         case f_25247 -> Items.SHIELD;
         case f_25248 -> null;
         case f_25249 -> Items.GOLDEN_APPLE;
         default -> Items.AIR;
      };
   }

   private String m_7494(ItemStack var1) {
      if (var1 != null && !var1.isEmpty() && f_11537.level != null) {
         ItemStack var2 = var1.copy();
         var2.setCount(1);
         Tag var3 = (Tag)ItemStack.CODEC.encodeStart(f_11537.level.registryAccess().createSerializationContext(NbtOps.INSTANCE), var2).result().orElse(null);
         if (var3 == null) {
            return "";
         }

         String var4 = new SnbtPrinterTagVisitor().visit(var3);
         String var5 = BuiltInRegistries.ITEM.getKey(var2.getItem()).toString();

         try {
            byte[] var6 = MessageDigest.getInstance(f_25264).digest(var4.getBytes(StandardCharsets.UTF_8));
            return var5 + HexFormat.of().formatHex(var6);
         } catch (NoSuchAlgorithmException var7) {
            return "";
         }
      } else {
         return "";
      }
   }

   private boolean m_7495(ItemStack var1, String var2) {
      if (f_11537.player != null && var1 != null && !var1.isEmpty() && !this.m_7529(var1)) {
         ItemStack var3 = f_11537.player.getOffhandItem();
         return !var3.isEmpty() && !this.m_7529(var3)
            ? ItemStack.isSameItemSameComponents(var3, var1) || !var2.isBlank() && var3.getHoverName().getString().equalsIgnoreCase(var2)
            : false;
      } else {
         return false;
      }
   }

   private boolean m_7496(ItemStack var1) {
      if (var1 != null && !var1.isEmpty() && var1.is(Items.PLAYER_HEAD)) {
         String var2 = StringUtil.stripColor(var1.getHoverName().getString())
            .toLowerCase(Locale.ROOT)
            .replace('ё', 'е')
            .replace(' ', ' ')
            .trim()
            .replaceAll(f_25260, f_25261);
         return var2.contains(f_25262) || var2.contains(f_25263);
      } else {
         return false;
      }
   }

   public boolean m_7497(int var1, ItemStack var2) {
      if (var1 >= 0 && var1 < this.f_25208.length && var2 != null && !var2.isEmpty() && !this.m_7529(var2)) {
         ItemStack var3 = var2.copy();
         var3.setCount(1);
         this.f_25208[var1] = var3;
         this.f_25209[var1] = var2.getHoverName().getString();
         return true;
      } else {
         return false;
      }
   }

   private void m_7499() {
      int var1 = this.f_25207;
      this.f_25205.m_923(f_25242, () -> this.f_25205.m_925(40, var1), this.f_25205::m_921);
      this.f_25207 = -1;
   }

   public boolean m_7500(int var1) {
      return var1 >= 0
         && var1 < this.f_25208.length
         && !this.f_25208[var1].isEmpty()
         && !this.m_7529(this.f_25208[var1])
         && (this.m_7495(this.f_25208[var1], this.f_25209[var1]) || this.m_7490(this.f_25208[var1], this.f_25209[var1]) != -1);
   }

   private Item m_7502() {
      return switch (this.f_25195.m_7564().m_1181()) {
         case f_25250 -> Items.PLAYER_HEAD;
         case f_25251 -> Items.TOTEM_OF_UNDYING;
         case f_25252 -> Items.SHIELD;
         case f_25253 -> null;
         case f_25254 -> Items.GOLDEN_APPLE;
         default -> Items.AIR;
      };
   }

   public void m_7503(int var1) {
      if (var1 >= 0 && var1 < this.f_25208.length && !this.f_25208[var1].isEmpty() && !this.m_7529(this.f_25208[var1])) {
         if (!this.m_7495(this.f_25208[var1], this.f_25209[var1])) {
            ItemStack var2 = this.f_25208[var1].copy();
            String var3 = this.f_25209[var1];
            if (this.m_7490(var2, var3) != -1) {
               boolean[] var4 = new boolean[]{false};
               int var5 = DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5153().m_8768().intValue();
               Class_GKE8JpI4Qs4PXIz2.m_2792(() -> {
                  if (!this.m_7495(var2, var3)) {
                     int var4x = this.m_7490(var2, var3);
                     if (var4x != -1) {
                        Class_B6vpBUNmRtH3JzmV.m_2129(40, var4x);
                        var4[0] = true;
                     }
                  }
               }, () -> {
                  if (var4[0] && f_11537.player != null) {
                     this.m_7519();
                  }
               }, var5);
            }
         }
      }
   }

   private int m_7504() {
      int var1 = -1;
      int var2 = -1;

      for (int var3 = 0; var3 < 36; var3++) {
         ItemStack var4 = f_11537.player.getInventory().getItem(var3);
         if (!this.m_7529(var4)) {
            FoodProperties var5 = (FoodProperties)var4.get(DataComponents.FOOD);
            if (var5 != null && var5.nutrition() > var2) {
               var2 = var5.nutrition();
               var1 = this.m_7507(var3);
            }
         }
      }

      return var1;
   }

   public void m_7505(Class_B6JOzHnwhU3pe4AO var1) {
      if (var1.m_2117() == this.f_25201.m_8768() && this.f_25201.m_8768() >= 0) {
         if (var1.m_2116() == 1 && f_11537.gui.screen() == null) {
            int var4 = this.m_7492();
            if (var4 != -1) {
               this.f_25207 = var4;
            }
         }
      } else if (var1.m_2117() == this.f_25200.m_8768() && this.f_25200.m_8768() >= 0) {
         if (!this.f_25193.m_7568(f_25239)) {
            if (f_11537.gui.screen() == null && var1.m_2116() == 1) {
               this.f_25203 = true;
            }
         } else {
            if (var1.m_2116() == 1 && f_11537.gui.screen() == null) {
               f_11537.gui.setScreen(new Screen_5(this, this.f_25200.m_8768()));
            } else if (var1.m_2116() == 0 && f_11537.gui.screen() instanceof Screen_5 var2) {
               var2.finish(true);
            }
         }
      }
   }

   public void m_7506(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null && this.f_25198.m_8768().isBlank()) {
         for (ItemStack var3 : f_11537.player.getInventory().getNonEquipmentItems()) {
            if (this.m_7496(var3)) {
               this.m_7521(var3);
               if (!this.f_25198.m_8768().isBlank()) {
                  break;
               }
            }
         }

         if (this.m_7496(f_11537.player.getOffhandItem())) {
            this.m_7521(f_11537.player.getOffhandItem());
         }
      }

      if (f_11537.gui.screen() == null) {
         if (this.f_25203) {
            this.m_7527();
         }

         if (this.f_25207 != -1) {
            if (DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5152().m_7568(f_25240)) {
               this.m_7499();
            } else if (DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5152().m_7568(f_25241)) {
               this.m_7510();
            }
         }
      }
   }

   private int m_7507(int var1) {
      return var1 < 9 ? var1 + 36 : var1;
   }

   private Item m_7509() {
      return this.m_7520(this.f_25196);
   }

   private void m_7510() {
      this.f_25205.m_925(40, this.f_25207);
      this.f_25205.m_921();
      this.f_25207 = -1;
   }

   private String m_7511(ItemStack var1) {
      ItemStack var2 = var1.copy();
      var2.setCount(1);
      var2.remove(DataComponents.CUSTOM_NAME);
      var2.remove(DataComponents.ITEM_NAME);
      var2.remove(DataComponents.REPAIR_COST);
      ItemStack var3 = new ItemStack(Items.PLAYER_HEAD);
      var3.remove(DataComponents.ITEM_NAME);
      return ItemStack.isSameItemSameComponents(var2, var3) ? "" : this.m_7494(var2);
   }

   private int m_7512() {
      for (int var1 = 0; var1 < 36; var1++) {
         ItemStack var2 = f_11537.player.getInventory().getItem(var1);
         if (!this.m_7529(var2) && this.m_7489(var2)) {
            return this.m_7507(var1);
         }
      }

      return -1;
   }

   private void m_7513(Class_bhRaN0YSSLQRYjPo var1) {
      if (this.f_25204 != null && var1.m_6083() != null) {
         if (this.f_25204.renderClosing(var1.m_6083())) {
            this.f_25204 = null;
         }
      }
   }

   public Screen_5 m_7514() {
      return this.f_25204;
   }

   public ItemStack m_7515(int var1) {
      if (var1 >= 0 && var1 < this.f_25208.length) {
         ItemStack var2 = this.f_25208[var1];
         return this.m_7529(var2) ? ItemStack.EMPTY : var2;
      } else {
         return ItemStack.EMPTY;
      }
   }

   private boolean m_7516(ItemStack var1) {
      if (var1 != null && !var1.isEmpty() && var1.is(Items.TOTEM_OF_UNDYING)) {
         String var2 = StringUtil.stripColor(var1.getHoverName().getString()).trim();
         String var3 = StringUtil.stripColor(Component.translatable(Items.TOTEM_OF_UNDYING.getDescriptionId()).getString()).trim();
         return var2.equalsIgnoreCase(var3);
      } else {
         return false;
      }
   }

   @Override
   public void m_732() {
      if (f_11537.gui.screen() instanceof Screen_5 var1) {
         var1.finish(false);
      }

      this.f_25204 = null;
      this.f_25203 = false;
      this.f_25207 = -1;
   }

   private int m_7518(Item var1) {
      if (var1 == Items.TOTEM_OF_UNDYING && this.f_25199.m_8768()) {
         return this.m_7512();
      } else {
         return var1 == null ? this.m_7504() : this.m_7522(var1);
      }
   }

   private void m_7519() {
      ItemStack var1 = f_11537.player.getOffhandItem();
      Class_8UIDpbIRPAjhei7m.m_1796(f_25243, var1.getHoverName(), f_25244, -1, var1);
   }

   private Item m_7520(MultiChoiceSetting var1) {
      return switch (var1.m_7564().m_1181()) {
         case f_25255 -> Items.PLAYER_HEAD;
         case f_25256 -> Items.TOTEM_OF_UNDYING;
         case f_25257 -> Items.SHIELD;
         case f_25258 -> null;
         case f_25259 -> Items.GOLDEN_APPLE;
         default -> Items.AIR;
      };
   }

   private void m_7521(ItemStack var1) {
      String var2 = this.m_7511(var1);
      if (!var2.isEmpty()) {
         this.f_25198.m_823(var2);
      }
   }

   private int m_7522(Item var1) {
      for (int var2 = 0; var2 < 36; var2++) {
         ItemStack var3 = f_11537.player.getInventory().getItem(var2);
         if (!this.m_7529(var3) && var3.getItem() == var1) {
            return this.m_7507(var2);
         }
      }

      return -1;
   }

   public AutoSwap() {
      super(f_25213, f_25214, Category.COMBAT);
      this.f_25193 = new MultiChoiceSetting(f_25215, new Class_2ZaVm8TGDJ68TnJB(f_25216), new Class_2ZaVm8TGDJ68TnJB(f_25217));
      this.f_25194 = new MultiChoiceSetting(
         f_25218,
         new Class_2ZaVm8TGDJ68TnJB(f_25219),
         new Class_2ZaVm8TGDJ68TnJB(f_25220),
         new Class_2ZaVm8TGDJ68TnJB(f_25221),
         new Class_2ZaVm8TGDJ68TnJB(f_25222)
      );
      this.f_25195 = new MultiChoiceSetting(
         f_25223,
         new Class_2ZaVm8TGDJ68TnJB(f_25224),
         new Class_2ZaVm8TGDJ68TnJB(f_25225),
         new Class_2ZaVm8TGDJ68TnJB(f_25226),
         new Class_2ZaVm8TGDJ68TnJB(f_25227)
      );
      this.f_25196 = new MultiChoiceSetting(
            f_25228,
            new Class_2ZaVm8TGDJ68TnJB(f_25229),
            new Class_2ZaVm8TGDJ68TnJB(f_25230),
            new Class_2ZaVm8TGDJ68TnJB(f_25231),
            new Class_2ZaVm8TGDJ68TnJB(f_25232)
         )
         .m_822(() -> this.f_25193.m_7568(f_25269));
      this.f_25197 = new ModeSetting(f_25233, f_25234).m_822(() -> false);
      this.f_25198 = new ModeSetting(f_25235, "").m_822(() -> false);
      this.f_25199 = new CheckboxSetting(f_25236, true)
         .m_822(() -> this.f_25194.m_7568(f_25265) || this.f_25195.m_7568(f_25266) || this.f_25193.m_7568(f_25267) && this.f_25196.m_7568(f_25268));
      this.f_25200 = new IntegerSetting(f_25237, -1);
      this.f_25201 = new IntegerSetting(f_25238, 71);
      this.f_25202 = AutoSwap.Class_3zMOriHcgr2XRdXk.FIRST;
      this.f_25203 = false;
      this.f_25205 = new Class_21JsiqqLzgnqk2Dg();
      this.f_25206 = new Class_8x4deAyjocMIBSj7();
      this.f_25207 = -1;
      this.f_25208 = new ItemStack[]{ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY};
      this.f_25209 = new String[]{"", "", ""};
      this.f_25210 = this::m_7506;
      this.f_25211 = this::m_7505;
      this.f_25212 = this::m_7513;
      this.m_795(this.f_25193, this.f_25194, this.f_25195, this.f_25196, this.f_25199, this.f_25200, this.f_25201, this.f_25197, this.f_25198);
   }

   public void m_7526(Screen_5 var1) {
      this.f_25204 = var1;
   }

   private void m_7527() {
      if (this.f_25203) {
         if (this.f_25202 == AutoSwap.Class_3zMOriHcgr2XRdXk.FIRST) {
            int var1 = this.m_7518(this.m_7493());
            if (var1 != -1) {
               this.f_25207 = var1;
            }

            this.f_25202 = AutoSwap.Class_3zMOriHcgr2XRdXk.SECOND;
         } else if (this.f_25202 == AutoSwap.Class_3zMOriHcgr2XRdXk.SECOND) {
            int var2 = this.m_7518(this.m_7502());
            if (var2 != -1) {
               this.f_25207 = var2;
            }

            this.f_25202 = AutoSwap.Class_3zMOriHcgr2XRdXk.FIRST;
         }

         this.f_25203 = false;
      }
   }

   private boolean m_7528(ItemStack var1) {
      if (var1 == null || var1.isEmpty() || !var1.is(Items.PLAYER_HEAD)) {
         return false;
      } else if (this.m_7496(var1)) {
         this.m_7521(var1);
         return true;
      } else {
         String var2 = this.f_25198.m_8768();
         if (var2 != null && !var2.isBlank() && var2.equals(this.m_7511(var1))) {
            return true;
         } else {
            String var3 = this.f_25197.m_8768();
            if (var3 != null && !var3.isBlank() && var3.equals(this.m_7494(var1))) {
               this.m_7521(var1);
               return true;
            } else {
               return false;
            }
         }
      }
   }

   private boolean m_7529(ItemStack var1) {
      return this.m_7491() && this.m_7528(var1);
   }

   public enum Class_3zMOriHcgr2XRdXk {
      FIRST,
      SECOND;
   }
}
