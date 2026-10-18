package dev.dimasik.client.module.autobuy;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_SluWNIC7qlm0dHwu;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_fFSER1OTAD5huhkq;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.gui.screens.inventory.ContainerScreen;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.HashedStack;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.game.ClientboundContainerSetContentPacket;
import net.minecraft.network.protocol.game.ClientboundContainerSetSlotPacket;
import net.minecraft.network.protocol.game.ClientboundSoundPacket;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import net.minecraft.network.protocol.game.ServerboundContainerClickPacket;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.Mth;
import net.minecraft.util.StringUtil;
import net.minecraft.world.entity.player.Input;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.ItemLore;

public class AutoBuy extends Module {
   private static final long f_11149 = 900L;//>> src by @setsprinting @pointdlc
   private static final long f_11150 = 100L;
   private static final long f_11151 = 100L;
   private static final long f_11152 = 100L;//>> src by @setsprinting @pointdlc//>> src by @setsprinting @pointdlc//>> src by @setsprinting @pointdlc
   private static final long f_11153 = 350L;
   private static final long f_11154 = 150L;
   private static final long f_11155 = 8000L;
   private static final int f_11156 = 2;
   private static final long f_11157 = 12000L;
   private static final long f_11158 = 120000L;//>> src by @setsprinting @pointdlc//>> src by @setsprinting @pointdlc//>> src by @setsprinting @pointdlc//>> src by @setsprinting @pointdlc
   private static final long f_11159 = 80000L;
   private static final long f_11160 = 30000L;
   private static final long f_11161 = 350L;//>> src by @setsprinting @pointdlc//>> src by @setsprinting @pointdlc//>> src by @setsprinting @pointdlc//>> src by @setsprinting @pointdlc
   private static final long f_11162 = 3500L;//>> src by @setsprinting @pointdlc//>> src by @setsprinting @pointdlc//>> src by @setsprinting @pointdlc//>> src by @setsprinting @pointdlc
   private static final long f_11163 = 250L;
   private static final int f_11164 = 49;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_11165 = this::m_3915;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_11166 = this::m_3932;
   private boolean f_11167;
   private final List<AutoBuy.EfEV0McZpW4GEOT8> f_11168 = new ArrayList<>();
   private final CheckboxSetting f_11169;
   private final CheckboxSetting f_11170;
   private final CheckboxSetting f_11171;
   private final SliderSetting f_11172;
   private boolean f_11173;
   private boolean f_11174;
   private int f_11175;
   private long f_11176;
   private long f_11177;
   private long f_11178;
   private long f_11179;
   private volatile long f_11180;
   private volatile long f_11181;
   private volatile int f_11182;
   private volatile int f_11183;
   private volatile int f_11184;
   private int f_11185;
   private double f_11186;
   private int f_11187;
   private int f_11188;
   private long f_11189;
   private volatile boolean f_11190;
   private long f_11191;
   private int f_11192;
   private long f_11193;
   private String f_11194;
   private final Map<String, Long> f_11195;
   private boolean f_11196;
   private long f_11197;
   private double f_11198;
   private double f_11199;
   private boolean f_11200;
   private int f_11201;
   private int f_11202;
   private long f_11203;
   private long f_11204;
   private static final String f_11205 = "FunTime";
   private static final String f_11206 = "AutoBuy";
   private static final String f_11207 = "Авто-бай";
   private static final String f_11208 = "Парсить цены";
   private static final String f_11209 = "Авто-ReParse";
   private static final String f_11210 = "Скидка парсинга";
   private static final float f_11211 = 30.0F;
   private static final float f_11212 = 100.0F;
   private static final long f_11213 = 120000L;
   private static final String f_11214 = "выкл";
   private static final long f_11215 = 1000000L;
   private static final double f_11216 = 1000000.0;
   private static final long f_11217 = 1000L;
   private static final double f_11218 = 1000.0;
   private static final String f_11219 = "%,d";
   private static final long f_11220 = 120000L;
   private static final String f_11221 = "block.note_block.basedrum";
   private static final String f_11222 = "sound";
   private static final String f_11223 = "inventory";
   private static final long f_11224 = 1000L;
   private static final String f_11225 = "вы успешно купили";
   private static final String f_11226 = "вы купили";
   private static final String f_11227 = "недостаточно";
   private static final String f_11228 = "не хватает";
   private static final long f_11229 = 30000L;
   private static final float f_11230 = 1.0E9F;
   private static final float f_11231 = 100.0F;
   private static final long f_11232 = 8000L;
   private static final long f_11233 = 8000L;
   private static final long f_11234 = 100L;
   private static final long f_11235 = 100L;
   private static final long f_11236 = 100L;
   private static final long f_11237 = 900L;
   private static final long f_11238 = 900L;
   private static final String f_11239 = "ah";
   private static final long f_11240 = 120000L;
   private static final long f_11241 = 80000L;
   private static final long f_11242 = 120000L;
   private static final long f_11243 = 120000L;
   private static final long f_11244 = 12000L;
   private static final long f_11245 = 350L;
   private static final double f_11246 = 150.0;
   private static final double f_11247 = 0.9;
   private static final double f_11248 = 0.1;
   private static final String f_11249 = "подтверждение покупки";
   private static final String f_11250 = "подозрительная цена";
   private static final String f_11251 = "[^\\p{L}\\p{N}$¤]+";
   private static final String f_11252 = " ";
   private static final String f_11253 = "[★]";
   private static final String f_11254 = "[⚡]";
   private static final String f_11255 = "xxx";
   private static final double f_11256 = 0.05;
   private static final String f_11257 = "%.0f";
   private static final String f_11258 = "%.1f";
   private static final String f_11259 = "\\.0$";
   private static final long f_11260 = 75L;
   private static final double f_11261 = 0.0025;
   private static final double f_11262 = 4.0;
   private static final long f_11263 = 350L;
   private static final long f_11264 = 3500L;
   private static final long f_11265 = 250L;
   private static final long f_11266 = -1L;
   private static final long f_11267 = -1L;

   public void m_3895() {
      this.f_11174 = !this.f_11174;
      this.f_11171.m_823(this.f_11174);
      long var1 = System.currentTimeMillis();
      this.f_11191 = this.f_11174 ? var1 + f_11213 : 0L;
      this.f_11193 = var1;
   }

   private boolean m_3896(ItemStack var1) {
      return var1 != null && !var1.isEmpty() && !this.m_3916(var1);
   }

   private boolean m_3897(AutoBuy.EfEV0McZpW4GEOT8 var1, ItemStack var2) {
      return this.m_3904(var1, this.m_3930(var2)) && var1.catalogEntry().matches(var2);
   }

   private void m_3898(long var1) {
      f_11537.player.connection.sendCommand(f_11239);
      this.f_11176 = var1;
      this.f_11189 = 0L;
   }

   private boolean m_3899(String var1) {
      Long var2 = this.f_11195.get(var1);
      if (var2 == null) {
         return false;
      } else if (System.currentTimeMillis() >= var2) {
         this.f_11195.remove(var1);
         return false;
      } else {
         return true;
      }
   }

   private void m_3900(long var1) {
      int var3;
      do {
         var3 = 901 + ThreadLocalRandom.current().nextInt(3);
      } while (var3 == this.f_11192);

      this.m_3905(var3, var1);
      this.f_11191 = var1 + f_11242;
      this.f_11193 = var1;
   }

   public String m_3901(long var1) {
      if (var1 <= 0L) {
         return f_11214;
      } else if (var1 >= f_11215) {
         double var5 = var1 / f_11216;
         return this.m_3938(var5) + "";
      } else if (var1 >= f_11217) {
         double var3 = var1 / f_11218;
         return this.m_3938(var3) + "";
      } else {
         return String.format(Locale.ROOT, f_11219, var1).replace(',', ' ');
      }
   }

   private void m_3902(boolean var1, boolean var2) {
      if (f_11537.options != null && f_11537.player != null) {
         f_11537.options.keyUp.setDown(false);
         f_11537.options.keyDown.setDown(false);
         f_11537.options.keyLeft.setDown(var1);
         f_11537.options.keyRight.setDown(var2);
         this.m_3931(false, false, var1, var2);
      }
   }

   private String m_3903(String var1) {
      return StringUtil.stripColor(var1 == null ? "" : var1).toLowerCase(Locale.ROOT).replace('ё', 'е').replaceAll(f_11251, f_11252).trim();
   }

   private boolean m_3904(AutoBuy.EfEV0McZpW4GEOT8 var1, String var2) {
      if (var2.contains(var1.normalizedName())) {
         return true;
      }

      for (String var6 : var1.aliases()) {
         if (!var6.isEmpty() && var2.contains(var6)) {
            return true;
         }
      }

      return false;
   }

   private void m_3905(int var1, long var2) {
      this.f_11192 = var1;
      this.m_3940();
      this.f_11184 = -1;
      this.f_11185 = -1;
      this.f_11178 = 0L;
      this.m_3945();
      this.f_11190 = false;
      if (f_11537.gui.screen() != null) {
         f_11537.player.clientSideCloseContainer();
      }

      f_11537.player.connection.sendCommand(var1 + "");
      this.f_11176 = var2;
      this.f_11189 = var2 + f_11244;
   }

   public void m_3906() {
      this.m_3941(!this.f_11173);
   }

   private int m_3907(AbstractContainerMenu var1) {
      return Math.max(0, Math.min(54, var1.slots.size() - 36));
   }

   public List<AutoBuy.EfEV0McZpW4GEOT8> m_3908() {
      return Collections.unmodifiableList(this.f_11168);
   }

   @Override
   public void m_778() {
      this.m_3909();
   }

   private void m_3909() {
      long var1 = System.currentTimeMillis();
      this.f_11176 = 0L;
      this.f_11177 = 0L;
      this.f_11178 = 0L;
      this.f_11179 = 0L;
      this.f_11193 = var1;
      this.f_11194 = null;
      this.m_3940();
      this.f_11184 = -1;
      this.f_11185 = -1;
      this.m_3945();
      this.f_11190 = false;
      this.f_11189 = 0L;
      this.f_11195.clear();
   }

   private boolean m_3911() {
      if (!this.f_11174) {
         return false;
      }

      long var1 = System.currentTimeMillis();
      if (this.f_11191 == 0L) {
         this.f_11191 = var1 + f_11240;
         this.f_11193 = var1;
         return false;
      }

      boolean var3 = this.m_3934() && var1 - this.f_11193 >= f_11241;
      boolean var4 = var1 >= this.f_11191;
      if (!var3 && !var4) {
         return false;
      }

      this.m_3900(var1);
      return true;
   }

   private void m_3912() {
      if (this.f_11169.m_8768() != this.f_11173) {
         this.f_11173 = this.f_11169.m_8768();
         this.m_3909();
      }

      if (this.f_11170.m_8768() != this.f_11200) {
         if (this.f_11170.m_8768()) {
            this.f_11201 = 0;
            this.f_11202 = 0;
            this.f_11203 = 0L;
            this.f_11204 = 0L;
            this.f_11200 = true;
         } else {
            this.f_11200 = false;
            this.m_3922();
         }
      }

      if (this.f_11171.m_8768() != this.f_11174) {
         this.f_11174 = this.f_11171.m_8768();
         long var1 = System.currentTimeMillis();
         this.f_11191 = this.f_11174 ? var1 + f_11220 : 0L;
         this.f_11193 = var1;
      }

      this.f_11175 = Mth.clamp(Math.round(this.f_11172.m_8768()), 0, 100);
   }

   private void m_3913() {
      if (f_11537.options != null) {
         f_11537.options.keyUp.setDown(false);
         f_11537.options.keyDown.setDown(false);
         f_11537.options.keyLeft.setDown(false);
         f_11537.options.keyRight.setDown(false);
      }

      this.m_3931(false, false, false, false);
   }

   private void m_3914(String var1, long var2) {
      if (this.f_11180 != 0L) {
         this.f_11180 = 0L;
         this.f_11182 = -1;
         this.f_11183 = -1;
      }
   }

   public void m_3915(Class_Xu9btcIeUN33XnMK var1) {
      this.m_3912();
      if (f_11537.player != null && f_11537.level != null && f_11537.player.connection != null) {
         if (this.f_11200) {
            this.m_3936();
         } else {
            this.m_3946();
            if (this.f_11173) {
               if (this.m_3911()) {
                  return;
               }

               this.m_3947();
            }
         }
      } else {
         if (this.f_11196) {
            this.m_3922();
         }
      }
   }

   private boolean m_3916(ItemStack var1) {
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

   public int m_3917() {
      int var1 = 0;

      for (AutoBuy.EfEV0McZpW4GEOT8 var3 : this.f_11168) {
         if (var3.enabled()) {
            var1++;
         }
      }

      return var1;
   }

   private static String m_3918(String var0) {
      return var0.replace(f_11253, "").replace(f_11254, "").replace(f_11255, "").trim();
   }

   public void m_3919(int var1) {
      this.f_11175 = Mth.clamp(var1, 0, 100);
      this.f_11172.m_823((float)this.f_11175);
   }

   private long m_3920(AutoBuy.EfEV0McZpW4GEOT8 var1) {
      if (f_11537.player != null && f_11537.player.containerMenu != null) {
         AbstractContainerMenu var2 = f_11537.player.containerMenu;
         long var3 = f_11267;
         int var5 = Math.min(45, this.m_3907(var2));

         for (int var6 = 0; var6 < var5; var6++) {
            ItemStack var7 = var2.getSlot(var6).getItem();
            if (this.m_3896(var7) && this.m_3897(var1, var7)) {
               long var8 = Class_fFSER1OTAD5huhkq.m_6475(var7);
               if (var8 > 0L && (var3 < 0L || var8 < var3)) {
                  var3 = var8;
               }
            }
         }

         return var3;
      } else {
         return f_11266;
      }
   }

   private boolean m_3921() {
      return f_11537.gui.screen() != null && f_11537.gui.screen().getTitle() != null
         ? Class_fFSER1OTAD5huhkq.m_6468(f_11537.gui.screen().getTitle().getString())
         : false;
   }

   private void m_3922() {
      this.f_11196 = false;
      this.m_3913();
   }

   private void m_3923(long var1) {
      int var3;
      do {
         var3 = ThreadLocalRandom.current().nextBoolean() ? ThreadLocalRandom.current().nextInt(205, 231) : ThreadLocalRandom.current().nextInt(305, 325);
      } while (var3 == this.f_11192);

      this.m_3905(var3, var1);
      this.f_11193 = var1;
      if (this.f_11174) {
         this.f_11191 = var1 + f_11243;
      }
   }

   private synchronized void m_3924(String var1, long var2) {
      boolean var4 = var2 >= f_11245;
      boolean var5 = this.f_11187 >= 2 && var2 >= this.f_11186 + f_11246;
      if (!var4 && !var5) {
         this.f_11188 = 0;
         this.f_11186 = this.f_11187 == 0 ? var2 : this.f_11186 * f_11247 + var2 * f_11248;
         this.f_11187++;
      } else {
         this.f_11188++;
      }

      this.f_11190 = this.f_11188 >= 2;
   }

   public boolean m_3925() {
      return this.f_11174;
   }

   private void m_3926(long var1) {
      this.f_11201++;
      this.f_11202 = 0;
      this.f_11203 = var1;
      this.f_11204 = var1 + f_11265;
   }

   private Boolean m_3927(boolean var1) {
      if (f_11537.player == null) {
         return var1;
      } else {
         double var2 = f_11537.player.getX() - this.f_11198;
         double var4 = f_11537.player.getZ() - this.f_11199;
         double var6 = var2 * var2 + var4 * var4;
         if (var6 <= 1.0) {
            return var1;
         } else {
            double var8 = Math.toRadians(f_11537.player.getYRot());
            double var10 = Math.cos(var8) * -var2 + Math.sin(var8) * -var4;
            if (Math.abs(var10) > f_11261) {
               return var10 > 0.0;
            } else {
               return var6 >= f_11262 ? null : var1;
            }
         }
      }
   }

   private boolean m_3928(ContainerScreen var1) {
      String var2 = this.m_3903(var1.getTitle().getString());
      return var2.contains(f_11249) || var2.contains(f_11250);
   }

   private AutoBuy.EfEV0McZpW4GEOT8 m_3929(ItemStack var1) {
      String var2 = this.m_3930(var1);

      for (AutoBuy.EfEV0McZpW4GEOT8 var4 : this.f_11168) {
         if (var4.enabled() && this.m_3904(var4, var2) && var4.catalogEntry().matches(var1)) {
            return var4;
         }
      }

      return null;
   }

   private String m_3930(ItemStack var1) {
      StringBuilder var2 = new StringBuilder(this.m_3903(var1.getHoverName().getString()));
      ItemLore var3 = (ItemLore)var1.getComponents().get(DataComponents.LORE);
      if (var3 != null) {
         for (Component var5 : var3.lines()) {
            var2.append(' ').append(this.m_3903(var5.getString()));
         }
      }

      return var2.toString();
   }

   private void m_3931(boolean var1, boolean var2, boolean var3, boolean var4) {
      if (f_11537.player != null && f_11537.player.input != null) {
         Input var5 = f_11537.player.input.keyPresses;
         if (var5 != null) {
            f_11537.player.input.keyPresses = new Input(var1, var2, var3, var4, var5.jump(), var5.shift(), var5.sprint());
         }
      }
   }

   public void m_3932(Class_XzpX8S5F5zd9jbuE var1) {
      long var2 = System.currentTimeMillis();
      if (var1.m_5619() instanceof ClientboundSoundPacket var11) {
         if (this.f_11173
            && f_11537.player != null
            && f_11537.gui.screen() instanceof ContainerScreen
            && ((SoundEvent)var11.getSound().value()).location().getPath().equals(f_11221)
            && this.m_3921()) {
            long var16 = this.f_11181;
            if (var16 != 0L) {
               this.f_11181 = 0L;
               this.m_3924(f_11222, var2 - var16);
            }

            this.f_11184 = f_11537.player.containerMenu.containerId;
         }
      } else if (var1.m_5619() instanceof ClientboundContainerSetContentPacket var10) {
         if (this.f_11173 && this.f_11180 != 0L && var10.containerId() == this.f_11182) {
            this.m_3914(f_11223, var2);
         }
      } else if (var1.m_5619() instanceof ClientboundContainerSetSlotPacket var9) {
         if (this.f_11173 && this.f_11180 != 0L && var9.getContainerId() == this.f_11182 && var9.getSlot() >= 0 && var9.getSlot() < 45) {
            this.m_3914(var9.getSlot() + "", var2);
         }
      } else if (var1.m_5619() instanceof ClientboundSystemChatPacket var4) {
         String var15 = StringUtil.stripColor(var4.content().getString());
         String var6 = var15.toLowerCase(Locale.ROOT).replace('ё', 'е');
         long var7 = Class_fFSER1OTAD5huhkq.m_6467(var15);
         if (var7 > 0L) {
            this.f_11204 = var2 + var7 * f_11224;
         }

         if (var6.contains(f_11225) || var6.contains(f_11226)) {
            this.f_11193 = var2;
         }

         if (this.f_11194 != null && (var6.contains(f_11227) || var6.contains(f_11228))) {
            this.f_11195.put(this.f_11194, var2 + f_11229);
            this.f_11194 = null;
         }
      }
   }

   @Override
   public void m_732() {
      this.f_11173 = false;
      this.f_11200 = false;
      this.m_3940();
      this.f_11184 = -1;
      this.f_11185 = -1;
      this.m_3945();
      this.f_11189 = 0L;
      this.f_11190 = false;
      this.m_3922();
   }

   private void m_3933(Class_SluWNIC7qlm0dHwu.Class_3w2x36ewkoAH3rZP var1) {
      String var2 = var1.name();
      SliderSetting var3 = new SliderSetting(var2, 0.0F, 0.0F, f_11230).m_828(f_11231);
      this.f_11168.add(new AutoBuy.EfEV0McZpW4GEOT8(var2, var3, this.m_3903(var2), new String[0], var1));
   }

   private boolean m_3934() {
      for (AutoBuy.EfEV0McZpW4GEOT8 var2 : this.f_11168) {
         if (var2.enabled()) {
            return true;
         }
      }

      return false;
   }

   public int m_3935() {
      return this.f_11175;
   }

   private void m_3936() {
      if (f_11537.player != null && f_11537.player.connection != null) {
         long var1 = System.currentTimeMillis();
         if (var1 >= this.f_11204) {
            if (this.f_11201 >= this.f_11168.size()) {
               this.f_11200 = false;
               this.f_11170.m_823(false);
            } else {
               AutoBuy.EfEV0McZpW4GEOT8 var3 = this.f_11168.get(this.f_11201);
               if (this.f_11202 == 0) {
                  f_11537.player.connection.sendCommand(m_3918(var3.name()) + "");
                  this.f_11202 = 1;
                  this.f_11203 = var1;
               } else {
                  boolean var4 = f_11537.gui.screen() instanceof ContainerScreen && this.m_3921();
                  if (this.f_11202 == 1) {
                     if (var4 && var1 - this.f_11203 >= f_11263) {
                        this.f_11202 = 2;
                     } else {
                        if (var1 - this.f_11203 >= f_11264) {
                           this.m_3926(var1);
                        }
                     }
                  } else {
                     if (this.f_11202 == 2) {
                        if (var4) {
                           long var5 = this.m_3920(var3);
                           if (var5 > 0L) {
                              byte var7 = 1;
                              long var8 = Math.max(1L, (var5 + var7 - 1L) / var7);
                              var3.setting().m_823((float)Class_fFSER1OTAD5huhkq.m_6463(var8, this.f_11175));
                           }

                           f_11537.player.clientSideCloseContainer();
                        }

                        this.m_3926(var1);
                     }
                  }
               }
            }
         }
      } else {
         this.f_11200 = false;
      }
   }

   private int m_3937(AbstractContainerMenu var1) {
      String var2 = f_11537.player.getName().getString();
      int var3 = Math.min(45, this.m_3907(var1));

      for (int var4 = 0; var4 < var3; var4++) {
         ItemStack var5 = var1.getSlot(var4).getItem();
         if (this.m_3896(var5)) {
            long var6 = Class_fFSER1OTAD5huhkq.m_6475(var5);
            if (var6 > 0L) {
               String var8 = Class_fFSER1OTAD5huhkq.m_6483(var5);
               if (var8 == null || !var8.equalsIgnoreCase(var2)) {
                  int var9 = Math.max(1, var5.getCount());
                  long var10 = Math.max(1L, (var6 + var9 - 1L) / var9);
                  AutoBuy.EfEV0McZpW4GEOT8 var12 = this.m_3929(var5);
                  if (var12 != null && var10 <= var12.price() && !this.m_3899(var12.name())) {
                     this.f_11194 = var12.name();
                     return var4;
                  }
               }
            }
         }
      }

      return -1;
   }

   private String m_3938(double var1) {
      return Math.abs(var1 - Math.rint(var1)) < f_11256
         ? String.format(Locale.ROOT, f_11257, var1)
         : String.format(Locale.ROOT, f_11258, var1).replaceAll(f_11259, "");
   }

   public void m_3939() {
      if (this.f_11200) {
         this.f_11200 = false;
         this.f_11170.m_823(false);
         this.m_3922();
      } else {
         this.f_11170.m_823(true);
         this.f_11200 = true;
         this.f_11201 = 0;
         this.f_11202 = 0;
         this.f_11203 = 0L;
         this.f_11204 = 0L;
      }
   }

   public AutoBuy() {
      super(f_11205, f_11206, Category.AUTOBUY);
      this.f_11169 = new CheckboxSetting(f_11207, false);
      this.f_11170 = new CheckboxSetting(f_11208, false);
      this.f_11171 = new CheckboxSetting(f_11209, false);
      this.f_11172 = new SliderSetting(f_11210, f_11211, 0.0F, f_11212).m_828(1.0F);
      this.f_11175 = 25;
      this.f_11182 = -1;
      this.f_11183 = -1;
      this.f_11184 = -1;
      this.f_11185 = -1;
      this.f_11192 = -1;
      this.f_11195 = new HashMap<>();

      for (Class_SluWNIC7qlm0dHwu.Class_3w2x36ewkoAH3rZP var2 : Class_SluWNIC7qlm0dHwu.f_13386) {
         this.m_3933(var2);
      }

      this.m_795(this.f_11169);
      this.m_795(this.f_11168.stream().map(AutoBuy.EfEV0McZpW4GEOT8::setting).toArray(SliderSetting[]::new));
   }

   private void m_3940() {
      this.f_11180 = 0L;
      this.f_11181 = 0L;
      this.f_11182 = -1;
      this.f_11183 = -1;
   }

   public void m_3941(boolean var1) {
      this.f_11173 = var1;
      this.f_11169.m_823(var1);
      this.m_3909();
   }

   public boolean m_3942() {
      return this.f_11173;
   }

   public boolean m_3943() {
      return this.f_11200;
   }

   private void m_3944(AbstractContainerMenu var1, int var2, ContainerInput var3) {
      HashedStack var4 = HashedStack.create(var1.getCarried(), f_11537.player.connection.decoratedHashOpsGenenerator());
      f_11537.player
         .connection
         .send(new ServerboundContainerClickPacket(var1.containerId, var1.getStateId(), (short)var2, (byte)0, var3, Int2ObjectMaps.emptyMap(), var4));
   }

   private synchronized void m_3945() {
      this.f_11186 = 0.0;
      this.f_11187 = 0;
      this.f_11188 = 0;
   }

   private void m_3946() {
      boolean var1 = false;
      if (!var1) {
         if (this.f_11196) {
            this.m_3922();
         }
      } else {
         if (!this.f_11196) {
            this.f_11196 = true;
            this.f_11197 = System.currentTimeMillis();
            this.f_11198 = f_11537.player.getX();
            this.f_11199 = f_11537.player.getZ();
         }

         long var2 = Math.max(0L, System.currentTimeMillis() - this.f_11197);
         boolean var4 = (var2 / f_11260 & 1L) == 0L;
         Boolean var5 = this.m_3927(var4);
         if (var5 == null) {
            this.m_3913();
         } else {
            this.m_3902(var5, !var5);
         }
      }
   }

   private void m_3947() {
      if (f_11537.gameMode != null && f_11537.player.containerMenu != null) {
         if (this.m_3934()) {
            long var1 = System.currentTimeMillis();
            if (this.f_11180 != 0L && var1 - this.f_11180 >= f_11232 || this.f_11181 != 0L && var1 - this.f_11181 >= f_11233) {
               this.f_11190 = true;
            }

            if (this.f_11190) {
               this.m_3923(var1);
            } else if (var1 >= this.f_11189) {
               if (f_11537.gui.screen() instanceof ContainerScreen var3) {
                  AbstractContainerMenu var7 = var3.getMenu();
                  if (this.m_3928(var3)) {
                     this.m_3940();
                     this.f_11184 = -1;
                     this.f_11185 = -1;
                     this.f_11178 = 0L;
                     this.m_3945();
                     if (var1 - this.f_11179 >= f_11234) {
                        if (var7.slots.size() > 1) {
                           this.m_3944(var7, 1, ContainerInput.QUICK_MOVE);
                        }

                        this.f_11179 = var1;
                     }
                  } else if (this.m_3921()) {
                     if (this.f_11185 != var7.containerId) {
                        long var5 = this.f_11181;
                        if (var5 != 0L) {
                           this.f_11181 = 0L;
                           this.m_3924("" + this.f_11185 + var7.containerId, var1 - var5);
                           if (this.f_11190) {
                              this.m_3923(var1);
                              return;
                           }
                        }

                        this.m_3940();
                        this.f_11185 = var7.containerId;
                        this.f_11184 = var7.containerId;
                     }

                     if (this.f_11180 != 0L && this.f_11182 == var7.containerId && this.f_11183 != var7.getStateId()) {
                        this.m_3914("" + this.f_11183 + var7.getStateId(), var1);
                     }

                     int var8 = this.m_3937(var7);
                     if (var8 != -1) {
                        this.m_3940();
                        this.f_11178 = 0L;
                        this.m_3945();
                        if (var1 - this.f_11177 >= f_11235) {
                           this.m_3944(var7, var8, ContainerInput.QUICK_MOVE);
                           this.f_11177 = var1;
                        }
                     } else {
                        if (var7.slots.size() > 49 && this.f_11184 == var7.containerId && var1 - this.f_11178 >= f_11236) {
                           ContainerInput var6 = ThreadLocalRandom.current().nextInt(100) < 25 ? ContainerInput.QUICK_MOVE : ContainerInput.PICKUP;
                           this.m_3944(var7, 49, var6);
                           this.f_11178 = var1;
                           this.f_11184 = -1;
                           this.f_11180 = var1;
                           this.f_11181 = var1;
                           this.f_11182 = var7.containerId;
                           this.f_11183 = var7.getStateId();
                        }
                     }
                  } else {
                     this.m_3940();
                     this.f_11184 = -1;
                     this.f_11185 = -1;
                     this.f_11178 = 0L;
                     this.m_3945();
                     if (var1 - this.f_11176 >= f_11237) {
                        f_11537.player.clientSideCloseContainer();
                        this.m_3898(var1);
                     }
                  }
               } else {
                  if (f_11537.gui.screen() == null && var1 - this.f_11176 >= f_11238) {
                     this.m_3898(var1);
                  }
               }
            }
         }
      }
   }

   public record EfEV0McZpW4GEOT8(
      String name, SliderSetting setting, String normalizedName, String[] aliases, Class_SluWNIC7qlm0dHwu.Class_3w2x36ewkoAH3rZP catalogEntry
   ) {
      public ItemStack stack() {
         ItemStack var1 = Class_fFSER1OTAD5huhkq.m_6478(AutoBuy.m_3918(this.name));
         return var1 != null ? var1.copy() : this.catalogEntry.stack();
      }

      public long price() {
         return this.setting.m_8768().longValue();
      }

      public boolean enabled() {
         return this.price() > 0L;
      }
   }
}
