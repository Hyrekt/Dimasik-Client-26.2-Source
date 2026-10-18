package dev.dimasik.client.module.misc;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_QmNR03reugBgWiPr;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_eXr9Fra2ad3yFXY8;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_h9gmP6jZeiKETGdh;
import dev.dimasik.client.system.Class_oDLvT3Io61u7HRHc;
import dev.dimasik.client.system.Class_qyFZUkNc6oUs6ojL;
import dev.dimasik.client.system.Class_w8fCJQ5ZtH5lQbWc;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicBoolean;
import lombok.Generated;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.util.StringUtil;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.ItemLore;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.ItemEnchantments;
import org.joml.Matrix4f;
import org.joml.Vector4i;

public class LootTracker extends Module {
   private static final int f_7086 = 5;
   private static final float f_7087 = 12.0F;
   private static final float f_7088 = 10.0F;
   private static final float f_7089 = 18.0F;
   private static final float f_7090 = 8.0F;
   private static final float f_7091 = 34.0F;
   private static final float f_7092 = 12.0F;
   private static final float f_7093 = 13.0F;
   private static final float f_7094 = 8.0F;
   private static final float f_7095 = 14.0F;
   private static final int f_7096 = Class_BftdentXEtGbugJw.m_2310(255, 40, 200);
   private static final int f_7097 = Class_BftdentXEtGbugJw.m_2310(40, 230, 255);
   private final SliderSetting f_7098;
   private final SliderSetting f_7099;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_7100;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_7101;
   private final Map<String, Integer> f_7102;
   private final List<LootTracker.NOVkgef1ZKUxsGUa> f_7103;
   private final Map<String, ItemStack> f_7104;
   private boolean f_7105;
   private static final String f_7106 = "LootTracker";
   private static final String f_7107 = "Плашка при подборе донатных предметов на ReallyWorld";
   private static final String f_7108 = "Длительность";
   private static final float f_7109 = 3.5F;
   private static final float f_7110 = 1.5F;
   private static final float f_7111 = 8.0F;
   private static final float f_7112 = 0.5F;
   private static final String f_7113 = "Размер";
   private static final float f_7114 = 0.6F;
   private static final float f_7115 = 0.05F;
   private static final float f_7116 = 1000.0F;
   private static final float f_7117 = -1.0F;
   private static final float f_7118 = 14.0F;
   private static final float f_7119 = 0.01F;
   private static final float f_7120 = 0.01F;
   private static final float f_7121 = 34.0F;
   private static final float f_7122 = 14.0F;
   private static final float f_7123 = 24.0F;
   private static final float f_7124 = 8.0F;
   private static final String f_7125 = "Донат";
   private static final float f_7126 = 34.0F;
   private static final float f_7127 = 14.0F;
   private static final float f_7128 = 34.0F;
   private static final float f_7129 = 220.0F;
   private static final float f_7130 = 14.0F;
   private static final float f_7131 = 255.0F;
   private static final float f_7132 = 18.0F;
   private static final float f_7133 = 12.0F;
   private static final float f_7134 = 8.0F;
   private static final float f_7135 = 13.0F;
   private static final float f_7136 = 0.5F;
   private static final float f_7137 = 16.0F;
   private static final float f_7138 = 0.5F;
   private static final String f_7139 = "Вы подобрали ";
   private static final float f_7140 = 12.0F;
   private static final float f_7141 = 0.5F;
   private static final float f_7142 = 14.0F;
   private static final float f_7143 = 1.6F;
   private static final float f_7144 = 22.0F;
   private static final double f_7145 = 255.0;
   private static final double f_7146 = 145.0;
   private static final double f_7147 = 125.0;
   private static final float f_7148 = 13.0F;
   private static final String f_7149 = "Вы подобрали ";
   private static final float f_7150 = 50.0F;
   private static final float f_7151 = 10.0F;

   private static String m_2546(ItemStack var0) {
      return var0.getItem().toString() + StringUtil.stripColor(var0.getHoverName().getString());
   }

   public static boolean m_2547(ItemStack var0) {
      if (var0 != null && !var0.isEmpty()) {
         Component var1 = (Component)var0.get(DataComponents.CUSTOM_NAME);
         String var2 = StringUtil.stripColor(var0.getHoverName().getString()).trim();
         String var3 = StringUtil.stripColor(Component.translatable(var0.getItem().getDescriptionId()).getString()).trim();
         boolean var4 = var1 != null || !var2.isEmpty() && !var2.equalsIgnoreCase(var3);
         if (!var4) {
            return false;
         } else if (var1 != null && m_2557(var1)) {
            return true;
         } else if (m_2557(var0.getHoverName())) {
            return true;
         } else if (var0.has(DataComponents.CUSTOM_DATA)) {
            return true;
         } else if (var0.has(DataComponents.ATTRIBUTE_MODIFIERS)) {
            return true;
         } else {
            ItemLore var5 = (ItemLore)var0.get(DataComponents.LORE);
            if (var5 != null && !var5.lines().isEmpty()) {
               return true;
            } else {
               return m_2566(var0) ? true : var1 != null;
            }
         }
      } else {
         return false;
      }
   }

   private void m_2548(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null) {
         HashMap var2 = new HashMap();
         this.f_7104.clear();
         this.m_2563(var2);
         if (this.f_7105) {
            for (Object var4_o : var2.entrySet()) {
            Entry var4 = (Entry) var4_o;
               int var5 = (Integer)var4.getValue() - this.f_7102.getOrDefault(var4.getKey(), 0);
               if (var5 > 0) {
                  ItemStack var6 = this.f_7104.get(var4.getKey());
                  if (var6 != null) {
                     this.m_2560(var6.copyWithCount(Math.min(var5, var6.getMaxStackSize())));
                  }
               }
            }
         }

         this.f_7102.clear();
         this.f_7102.putAll(var2);
         this.f_7105 = true;
      } else {
         this.m_2571();
      }
   }

   @Generated
   public SliderSetting m_2549() {
      return this.f_7099;
   }

   @Override
   public void m_732() {
      this.f_7102.clear();
      this.f_7104.clear();
      this.f_7103.clear();
      this.f_7105 = false;
   }

   private void m_2550(ItemStack var1, String var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      Class_Ssh31B3ljfKeWsvS.m_4864(f_7131 * var8);
      this.m_2570(var3, var4, var5, var6, var7);
      float var9 = f_7132 * var7;
      float var10 = f_7133 * var7;
      float var11 = f_7134 * var7;
      int var12 = Math.max(1, Math.round(f_7135 * var7));
      float var13 = var3 + var10;
      float var14 = var4 + (var6 - var9) * f_7136;
      Class_Ssh31B3ljfKeWsvS.m_4851(var1, var13, var14, var9 / f_7137, false);
      float var15 = var13 + var9 + var11;
      float var16 = var4 + (var6 - var12) * f_7138 - 1.0F;
      String var17 = f_7139;
      int var18 = Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT), var8);
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var17, var15, var16, var12, var18);
      float var19 = var15 + Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var17, var12);
      Class_Ssh31B3ljfKeWsvS.m_4873(Class_y1y6QpONhWEUIdEB.m_9588(), m_2567(var2), var19, var16, var12, -1);
      Class_Ssh31B3ljfKeWsvS.m_4844();
   }

   @Generated
   public List<LootTracker.NOVkgef1ZKUxsGUa> m_2551() {
      return this.f_7103;
   }

   private void m_2552(Map<String, Integer> var1, ItemStack var2) {
      if (var2 != null && !var2.isEmpty() && m_2547(var2)) {
         String var3 = m_2546(var2);
         var1.merge(var3, var2.getCount(), Integer::sum);
         if (!this.f_7104.containsKey(var3)) {
            this.f_7104.put(var3, var2.copy());
         }
      }
   }

   @Generated
   public SliderSetting m_2553() {
      return this.f_7098;
   }

   private Class_h9gmP6jZeiKETGdh m_2554() {
      try {
         if (DimasikClient.m_9057() == null || DimasikClient.m_9057().m_9049() == null) {
            return null;
         } else {
            return !DimasikClient.m_9057().m_9049().m_2808().m_5376() ? null : DimasikClient.m_9057().m_9049().m_2808().m_5355();
         }
      } catch (Throwable var2) {
         return null;
      }
   }

   private float m_2555(String var1, float var2) {
      int var3 = Math.max(1, Math.round(f_7148 * var2));
      String var4 = f_7149;
      return f_7150 * var2
         + Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var4, var3)
         + Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var1, var3)
         + f_7151 * var2;
   }

   private Vector4i m_2556() {
      int var1 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_BACKGROUND);
      int var2 = Class_BftdentXEtGbugJw.m_2309(var1);
      int var3 = Class_BftdentXEtGbugJw.m_2299(var1);
      int var4 = Class_BftdentXEtGbugJw.m_2308(var1);
      int var5 = Class_BftdentXEtGbugJw.m_2303(Math.min(255, var2 + 12), Math.min(255, var3 + 12), Math.min(255, var4 + 12), f_7146);
      int var6 = Class_BftdentXEtGbugJw.m_2303(var2, var3, var4, f_7147);
      return new Vector4i(var5, var5, var6, var6);
   }

   private static boolean m_2557(Component var0) {
      AtomicBoolean var1 = new AtomicBoolean(false);
      var0.visit((var1x, var2) -> {
         TextColor var3 = var1x.getColor();
         if (var3 != null) {
            var1.set(true);
         }

         return Optional.empty();
      }, Style.EMPTY);
      return var1.get();
   }

   private float m_2558() {
      Class_h9gmP6jZeiKETGdh var1 = this.m_2554();
      return var1 != null && var1.m_7120() != null
         ? var1.m_7120().m_8768() * Class_qyFZUkNc6oUs6ojL.m_8354()
         : this.f_7099.m_8768() * Class_qyFZUkNc6oUs6ojL.m_8354();
   }

   @Generated
   public Map<String, ItemStack> m_2559() {
      return this.f_7104;
   }

   public void m_2560(ItemStack var1) {
      String var2 = StringUtil.stripColor(var1.getHoverName().getString()).trim();
      if (!var2.isEmpty()) {
         LootTracker.NOVkgef1ZKUxsGUa var3 = new LootTracker.NOVkgef1ZKUxsGUa(var1, var2);
         var3.f_7082.m_9281(0.0F);
         var3.f_7083.m_9281(1.0F);
         this.f_7103.add(0, var3);

         while (this.f_7103.size() > 5) {
            this.f_7103.remove(this.f_7103.size() - 1);
         }
      }
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> m_2561() {
      return this.f_7100;
   }

   @Override
   public void m_778() {
      this.m_2571();
   }

   @Generated
   public boolean m_2562() {
      return this.f_7105;
   }

   public LootTracker() {
      super(f_7106, f_7107, Category.MISC);
      this.f_7098 = new SliderSetting(f_7108, f_7109, f_7110, f_7111).m_828(f_7112);
      this.f_7099 = new SliderSetting(f_7113, 1.0F, f_7114, 2.0F).m_828(f_7115);
      this.f_7100 = this::m_2548;
      this.f_7101 = this::m_2568;
      this.f_7102 = new HashMap<>();
      this.f_7103 = new ArrayList<>();
      this.f_7104 = new HashMap<>();
      this.m_795(this.f_7098, this.f_7099);
   }

   private void m_2563(Map<String, Integer> var1) {
      int var2 = f_11537.player.getInventory().getContainerSize();

      for (int var3 = 0; var3 < var2; var3++) {
         this.m_2552(var1, f_11537.player.getInventory().getItem(var3));
      }

      this.m_2552(var1, f_11537.player.getOffhandItem());
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> m_2564() {
      return this.f_7101;
   }

   private static boolean m_2566(ItemStack var0) {
      ItemEnchantments var1 = (ItemEnchantments)var0.get(DataComponents.ENCHANTMENTS);
      if (var1 == null || var1.isEmpty()) {
         var1 = (ItemEnchantments)var0.get(DataComponents.STORED_ENCHANTMENTS);
      }

      if (var1 != null && !var1.isEmpty()) {
         for (it.unimi.dsi.fastutil.objects.Object2IntMap.Entry var3 : var1.entrySet()) {
            if (var3.getIntValue() > ((Enchantment)((Holder)var3.getKey()).value()).getMaxLevel()) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private static Component m_2567(String var0) {
      MutableComponent var1 = Component.empty();
      int var2 = var0.length();

      for (int var3 = 0; var3 < var2; var3++) {
         float var4 = var2 == 1 ? 0.0F : (float)var3 / (var2 - 1);
         int var5 = Class_BftdentXEtGbugJw.m_2302(f_7096, f_7097, var4);
         var1.append(Component.literal(String.valueOf(var0.charAt(var3))).setStyle(Style.EMPTY.withColor(var5)));
      }

      return var1;
   }

   private void m_2568(Class_bhRaN0YSSLQRYjPo var1) {
      if (f_11537.player != null && f_11537.getWindow() != null) {
         float var2 = this.m_2558();
         long var3 = (long)(this.f_7098.m_8768() * f_7116);
         boolean var5 = f_11537.gui.screen() instanceof ChatScreen;
         Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
         float var6 = f_11537.getWindow().getScreenWidth();
         Class_h9gmP6jZeiKETGdh var7 = this.m_2554();
         boolean var8 = var7 != null && var7.m_7119();
         float var9 = var8 ? var7.m_3998() : f_7117;
         float var10 = var8 ? var7.m_3993() : f_7118;
         float var11 = var10;
         float var12 = var11;
         float var13 = 0.0F;
         float var14 = var9;
         int var15 = 0;
         Iterator var16 = this.f_7103.iterator();

         while (var16.hasNext()) {
            LootTracker.NOVkgef1ZKUxsGUa var17 = (LootTracker.NOVkgef1ZKUxsGUa)var16.next();
            boolean var18 = var17.f_7081.m_4463(var3);
            var17.f_7082.m_9283(var18 ? 0.0F : 1.0F);
            var17.f_7083.m_9283(var18 ? 1.0F : 0.0F);
            if (var18 && var17.f_7082.m_9280() && var17.f_7082.m_9288() < f_7119) {
               var16.remove();
            } else {
               float var19 = var17.f_7082.m_9288();
               if (!(var19 < f_7120)) {
                  float var20 = this.m_2555(var17.f_7080, var2);
                  float var21 = f_7121 * var2;
                  float var22 = var8 ? var9 : Math.max(0.0F, var6 - var20 - f_7122);
                  float var23 = var22 + var17.f_7083.m_9288() * (var20 + f_7123);
                  if (var15 == 0) {
                     var14 = var22;
                  }

                  this.m_2550(var17.f_7079, var17.f_7080, var23, var12, var20, var21, var2, var19);
                  var13 = Math.max(var13, var20);
                  var12 += var21 + f_7124 * var2;
                  var15++;
               }
            }
         }

         if (var15 == 0 && var5) {
            ItemStack var24 = f_11537.player.getMainHandItem();
            if (var24.isEmpty()) {
               var24 = Items.NETHERITE_SWORD.getDefaultInstance();
            }

            String var25 = StringUtil.stripColor(var24.getHoverName().getString()).trim();
            if (var25.isEmpty()) {
               var25 = f_7125;
            }

            float var26 = this.m_2555(var25, var2);
            float var27 = f_7126 * var2;
            float var28 = var8 ? var9 : Math.max(0.0F, var6 - var26 - f_7127);
            var14 = var28;
            this.m_2550(var24, var25, var28, var11, var26, var27, var2, 1.0F);
            var13 = var26;
            var12 = var11 + var27;
            var15 = 1;
         }

         if (var7 != null) {
            if (var15 > 0) {
               var7.m_7124(var14, var10, var13, Math.max(f_7128 * var2, var12 - var11));
            } else {
               var7.m_7124(var8 ? var9 : Math.max(0.0F, var6 - f_7129 * var2 - f_7130), var10, 0.0F, 0.0F);
            }
         }
      }
   }

   @Generated
   public Map<String, Integer> m_2569() {
      return this.f_7102;
   }

   private void m_2570(float var1, float var2, float var3, float var4, float var5) {
      float var6 = f_7140 * var5;
      if (Class_oDLvT3Io61u7HRHc.m_7743()) {
         int var7 = Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SHADOW), f_7141);
         Class_Ssh31B3ljfKeWsvS.m_4859(var1, var2, var3, var4, Math.max(f_7142, var6 * f_7143), var7);
         Class_Ssh31B3ljfKeWsvS.m_4858(var1, var2, var3, var4, f_7144, var6, Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_7145));
         Class_Ssh31B3ljfKeWsvS.m_4843(var1, var2, var3, var4, var6, this.m_2556());
         Class_Ssh31B3ljfKeWsvS.m_4854(var1, var2, var3, var4, 1.0F, var6, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE));
      } else {
         Class_Ssh31B3ljfKeWsvS.m_4817(var1, var2, var3, var4, var6, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_BACKGROUND));
      }
   }

   private void m_2571() {
      this.f_7102.clear();
      this.f_7104.clear();
      this.f_7105 = false;
   }

   public static final class NOVkgef1ZKUxsGUa {
      public final ItemStack f_7079;
      public final String f_7080;
      public final Class_QmNR03reugBgWiPr f_7081 = new Class_QmNR03reugBgWiPr();
      public final Class_w8fCJQ5ZtH5lQbWc f_7082;
      public final Class_w8fCJQ5ZtH5lQbWc f_7083;
      public static final float f_7084 = 10.0F;
      public static final float f_7085 = 10.0F;

      public NOVkgef1ZKUxsGUa(ItemStack var1, String var2) {
         this.f_7082 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_7084, Class_eXr9Fra2ad3yFXY8.f_19100);
         this.f_7083 = new Class_w8fCJQ5ZtH5lQbWc(1.0F, f_7085, Class_eXr9Fra2ad3yFXY8.f_19100);
         this.f_7079 = var1;
         this.f_7080 = var2;
      }
   }
}
