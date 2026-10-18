package dev.dimasik.client.system;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.network.chat.Component;
import net.minecraft.util.StringUtil;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public final class Class_i7qN6fWCX6JrM0uQ implements Class_NzJrN63M7QBpmAbi {
   private static Class_i7qN6fWCX6JrM0uQ f_23561;
   private final Map<Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv, Long> f_23562 = new EnumMap<>(Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv.class);
   private boolean f_23563;
   private static final String f_23564 = "reallyworld";
   private static final float f_23565 = 1000.0F;
   private static final long f_23566 = 500L;
   private static final float f_23567 = 1000.0F;
   private static final String f_23568 = "\\s+";
   private static final String f_23569 = " ";

   public void m_7229() {
      if (this.m_7235() && f_11537.player != null && f_11537.gui.screen() == null) {
         Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv var1 = m_7237(f_11537.player.getMainHandItem(), Class_i7qN6fWCX6JrM0uQ.EO1PV73dTsElS2tH.USE);
         if (var1 == null) {
            var1 = m_7237(f_11537.player.getOffhandItem(), Class_i7qN6fWCX6JrM0uQ.EO1PV73dTsElS2tH.USE);
         }

         if (var1 != null) {
            this.m_7238(var1);
         }
      }
   }

   public boolean m_7230(Item var1) {
      if (!this.m_7235()) {
         return false;
      }

      long var2 = System.currentTimeMillis();

      for (Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv var7 : Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv.values()) {
         if (var7.f_23557 == var1) {
            Long var8 = this.f_23562.get(var7);
            if (var8 != null && var8 > var2) {
               return true;
            }
         }
      }

      return false;
   }

   public List<Class_i7qN6fWCX6JrM0uQ.Class_17CWr7BjGPqwVJoH> m_7231() {
      ArrayList var1 = new ArrayList();
      if (this.m_7235() && f_11537.player != null) {
         long var2 = System.currentTimeMillis();

         for (Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv var7 : Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv.values()) {
            Long var8 = this.f_23562.get(var7);
            if (var8 != null) {
               float var9 = (float)(var8 - var2) / f_23565;
               if (!(var9 <= 0.0F)) {
                  var1.add(new Class_i7qN6fWCX6JrM0uQ.Class_17CWr7BjGPqwVJoH(var7, Component.literal(var7.f_23555), var9, var7.f_23557));
               }
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   public static String m_7232(String var0) {
      return var0 == null ? "" : var0.toLowerCase(Locale.ROOT).replace('ё', 'е').replaceAll(f_23568, f_23569).trim();
   }

   public static Class_i7qN6fWCX6JrM0uQ m_7233() {
      if (f_23561 == null) {
         f_23561 = new Class_i7qN6fWCX6JrM0uQ();
      }

      return f_23561;
   }

   private Class_i7qN6fWCX6JrM0uQ() {
   }

   public static Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv m_7234(ItemStack var0) {
      if (var0 != null && !var0.isEmpty()) {
         String var1 = m_7232(StringUtil.stripColor(var0.getHoverName().getString()));
         if (var1.isEmpty()) {
            return null;
         }

         for (Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv var5 : Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv.values()) {
            if (var0.getItem() == var5.f_23557 && var5.m_7225(var1)) {
               return var5;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public boolean m_7235() {
      if (f_11537.getConnection() == null) {
         return false;
      }

      ServerData var1 = f_11537.getConnection().getServerData();
      return var1 != null && var1.ip != null ? var1.ip.toLowerCase(Locale.ROOT).contains(f_23564) : false;
   }

   private static Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv m_7237(ItemStack var0, Class_i7qN6fWCX6JrM0uQ.EO1PV73dTsElS2tH var1) {
      Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv var2 = m_7234(var0);
      return var2 != null && var2.f_23558 == var1 ? var2 : null;
   }

   private void m_7238(Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv var1) {
      Long var2 = this.f_23562.get(var1);
      long var3 = System.currentTimeMillis();
      if (var2 == null || var2 <= var3 + f_23566) {
         this.f_23562.put(var1, var3 + (long)(var1.f_23559 * f_23567));
      }
   }

   public boolean m_7239(Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv var1) {
      if (var1 != null && this.m_7235()) {
         Long var2 = this.f_23562.get(var1);
         return var2 != null && var2 > System.currentTimeMillis();
      } else {
         return false;
      }
   }

   public void m_7240() {
      if (this.m_7235() && f_11537.player != null) {
         boolean var1 = f_11537.player.isShiftKeyDown() || f_11537.options.keyShift.isDown();
         if (var1 && !this.f_23563 && f_11537.gui.screen() == null) {
            Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv var2 = m_7237(f_11537.player.getOffhandItem(), Class_i7qN6fWCX6JrM0uQ.EO1PV73dTsElS2tH.SNEAK_OFFHAND);
            if (var2 != null) {
               this.m_7238(var2);
            }
         }

         this.f_23563 = var1;
         long var4 = System.currentTimeMillis();
         this.f_23562.entrySet().removeIf(var2x -> var2x.getValue() <= var4);
      } else {
         this.f_23563 = false;
         this.f_23562.clear();
      }
   }

   public record Class_17CWr7BjGPqwVJoH(Class_i7qN6fWCX6JrM0uQ.LoKKlnZQ2TbAeIWv item, Component name, float remaining, Item icon) {
   }

   public enum EO1PV73dTsElS2tH {
      USE,
      SNEAK_OFFHAND;
   }

   public enum LoKKlnZQ2TbAeIWv {
      TRAP("Ловушка", Items.HEART_OF_THE_SEA, Class_i7qN6fWCX6JrM0uQ.EO1PV73dTsElS2tH.USE, 60.0F),
      ENDER_TRAP("Эндер Ловушка", Items.HEART_OF_THE_SEA, Class_i7qN6fWCX6JrM0uQ.EO1PV73dTsElS2tH.USE, 60.0F),
      ANTI_FLIGHT("Анти Полет", Items.FIREWORK_STAR, Class_i7qN6fWCX6JrM0uQ.EO1PV73dTsElS2tH.SNEAK_OFFHAND, 1800.0F),
      DARK_PULSE("Тёмный Пульс", Items.FIREWORK_STAR, Class_i7qN6fWCX6JrM0uQ.EO1PV73dTsElS2tH.SNEAK_OFFHAND, 180.0F),
      STONE_TRAP("Каменная ловушка", Items.FIREWORK_STAR, Class_i7qN6fWCX6JrM0uQ.EO1PV73dTsElS2tH.USE, 90.0F, true),
      HELL_TRAP("Адская ловушка", Items.NETHERITE_SCRAP, Class_i7qN6fWCX6JrM0uQ.EO1PV73dTsElS2tH.USE, 120.0F, true);

      public final String f_23555;
      public final String f_23556;
      public final Item f_23557;
      public final Class_i7qN6fWCX6JrM0uQ.EO1PV73dTsElS2tH f_23558;
      public final float f_23559;
      public final boolean f_23560;

      LoKKlnZQ2TbAeIWv(String var3, Item var4, Class_i7qN6fWCX6JrM0uQ.EO1PV73dTsElS2tH var5, float var6) {
         this(var3, var4, var5, var6, false);
      }

      LoKKlnZQ2TbAeIWv(String var3, Item var4, Class_i7qN6fWCX6JrM0uQ.EO1PV73dTsElS2tH var5, float var6, boolean var7) {
         this.f_23555 = var3;
         this.f_23556 = Class_i7qN6fWCX6JrM0uQ.m_7232(var3);
         this.f_23557 = var4;
         this.f_23558 = var5;
         this.f_23559 = var6;
         this.f_23560 = var7;
      }

      public boolean m_7225(String var1) {
         return this.f_23560 ? var1.contains(this.f_23556) : var1.equals(this.f_23556);
      }

      public String m_7226() {
         return this.f_23555;
      }

      public Item m_7227() {
         return this.f_23557;
      }

      public Class_i7qN6fWCX6JrM0uQ.EO1PV73dTsElS2tH m_7228() {
         return this.f_23558;
      }
   }
}
