package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.manager.ClientManagerRegistry;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.Setting;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.IntegerSetting;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import net.minecraft.client.Minecraft;

public final class Class_7NMsW3w2Lj5yGeG9 {
   private static final String f_3202 = "0123456789";
   private static final int f_3203 = 4;
   private static final Logger f_3204 = System.getLogger(Class_7NMsW3w2Lj5yGeG9.class.getName());
   private final SecureRandom f_3205 = new SecureRandom();
   private final Class_h8wWKghzmqgLkZHd f_3206 = new Class_h8wWKghzmqgLkZHd();
   private final Class_8RZa6amQedgEQOyz f_3207 = new Class_8RZa6amQedgEQOyz();
   private final Executor f_3208 = Executors.newSingleThreadExecutor(var0 -> {
      Thread var1 = new Thread(var0, f_3233);
      var1.setDaemon(true);
      return var1;
   });
   private final Set<Module> f_3209 = Collections.newSetFromMap(new IdentityHashMap<>());
   private final Map<Module, Integer> f_3210 = new IdentityHashMap<>();
   private final Map<IntegerSetting, Integer> f_3211 = new IdentityHashMap<>();
   private final Map<CheckboxSetting, Integer> f_3212 = new IdentityHashMap<>();
   private final Map<Class_2ZaVm8TGDJ68TnJB, Integer> f_3213 = new IdentityHashMap<>();
   private List<Class_q5Do365fnkZh6Wbu> f_3214 = List.of();
   private Map<String, Integer> f_3215 = Map.of();
   private boolean f_3216;
   private float f_3217;
   private volatile boolean f_3218;
   private volatile boolean f_3219;
   private volatile String f_3220;
   private static final long f_3221 = 10000L;
   private static final String f_3222 = "Failed to prepare unhook files";
   private static final String f_3223 = "Восстановление клиента...";
   private static final long f_3224 = 10000L;
   private static final String f_3225 = "Не удалось восстановить файлы. Введи код восстановления ещё раз, чтобы повторить.";
   private static final long f_3226 = 10000L;
   private static final String f_3227 = "Unhook отключён. Клиент восстановлен.";
   private static final String f_3228 = "0123456789";
   private static final String f_3229 = "0123456789";
   private static final String f_3230 = "Failed to restore unhook files";
   private static final String f_3231 = "Не удалось подготовить файлы для Unhook. Восстанавливаем клиент.";
   private static final long f_3232 = 10000L;
   private static final String f_3233 = "dimasik-unhook-files";

   private void m_1637(Module var1) {
      for (Setting var3 : var1.m_780()) {
         if (var3 instanceof IntegerSetting var9) {
            var9.m_823(-1);
         } else if (var3 instanceof CheckboxSetting var8) {
            var8.m_5183().m_1367(-1);
         } else if (var3 instanceof MultiChoiceSetting var7) {
            for (Class_2ZaVm8TGDJ68TnJB var11 : var7.m_8768()) {
               var11.m_1189().m_1367(-1);
            }
         } else if (var3 instanceof ItemListSetting var4) {
            for (Class_2ZaVm8TGDJ68TnJB var6 : var4.m_8768()) {
               var6.m_1189().m_1367(-1);
            }
         }
      }
   }

   private synchronized void m_1638() {
      ClientManagerRegistry var1 = DimasikClient.m_9057().m_9049();
      this.f_3210.forEach((var0, var1x) -> var0.m_779().m_1367(var1x));
      this.f_3211.forEach(Setting::m_823);
      this.f_3212.forEach((var0, var1x) -> var0.m_5183().m_1367(var1x));
      this.f_3213.forEach((var0, var1x) -> var0.m_1189().m_1367(var1x));
      var1.m_2807().clear();
      var1.m_2807().addAll(this.f_3214);
      var1.m_2803().m_5533(this.f_3215, this.f_3216, this.f_3217);
      this.f_3220 = null;

      for (Module var3 : this.f_3209) {
         if (!var3.m_776()) {
            var3.m_792();
         }
      }

      this.m_1639();
      this.f_3219 = false;
      this.f_3218 = false;
      Class_HKVFPtZz5yGHYty6.m_2882(false);
      this.f_3207.m_1763();
      Class_ftHu9o3WzCU3Adxm.m_6731(f_3227);
   }

   private void m_1639() {
      this.f_3209.clear();
      this.f_3210.clear();
      this.f_3211.clear();
      this.f_3212.clear();
      this.f_3213.clear();
      this.f_3214 = List.of();
      this.f_3215 = Map.of();
   }

   public synchronized void m_1640() {
      if (this.f_3218 && !this.f_3219) {
         this.f_3219 = true;
         Class_ftHu9o3WzCU3Adxm.m_6725(f_3223, f_3224);
         this.f_3208.execute(() -> {
            try {
               this.f_3206.m_7100();
            } catch (RuntimeException var2) {
               f_3204.log(Level.ERROR, f_3230, var2);
               Minecraft.getInstance().execute(this::m_1649);
               return;
            }

            Minecraft.getInstance().execute(this::m_1638);
         });
      }
   }

   private void m_1644(Setting<?> var1) {
      if (var1 instanceof IntegerSetting var7) {
         this.f_3211.put(var7, var7.m_8768());
      } else if (var1 instanceof CheckboxSetting var6) {
         this.f_3212.put(var6, var6.m_5183().m_1369());
      } else if (var1 instanceof MultiChoiceSetting var5) {
         for (Class_2ZaVm8TGDJ68TnJB var9 : var5.m_8768()) {
            this.f_3213.put(var9, var9.m_1189().m_1369());
         }
      } else {
         if (var1 instanceof ItemListSetting var2) {
            for (Class_2ZaVm8TGDJ68TnJB var4 : var2.m_8768()) {
               this.f_3213.put(var4, var4.m_1189().m_1369());
            }
         }
      }
   }

   private void m_1646() {
      try {
         this.f_3206.m_7113(() -> this.f_3219);
      } catch (RuntimeException var2) {
         f_3204.log(Level.ERROR, f_3222, var2);
         Minecraft.getInstance().execute(() -> {
            Class_ftHu9o3WzCU3Adxm.m_6725(f_3231, f_3232);
            this.m_1640();
         });
      }
   }

   public synchronized String m_1648() {
      if (this.f_3218) {
         return this.f_3220;
      }

      ClientManagerRegistry var1 = DimasikClient.m_9057().m_9049();
      this.m_1639();

      for (Module var3 : var1.m_2801()) {
         this.f_3210.put(var3, var3.m_779().m_1369());
         if (var3.m_776()) {
            this.f_3209.add(var3);
         }

         for (Setting var5 : var3.m_780()) {
            this.m_1644(var5);
         }
      }

      this.f_3214 = new ArrayList<>(var1.m_2807());
      Class_XHmGFP4pbXhGQRa5 var6 = var1.m_2803();
      this.f_3215 = new LinkedHashMap<>(var6.m_5547());
      this.f_3216 = var6.m_5551();
      this.f_3217 = var6.m_5550();
      this.f_3220 = this.m_1654();
      this.f_3218 = true;
      Class_HKVFPtZz5yGHYty6.m_2882(true);

      for (Module var9 : this.f_3209) {
         if (var9.m_776()) {
            var9.m_777();
         }
      }

      for (Module var10 : var1.m_2801()) {
         var10.m_779().m_1367(-1);
         this.m_1637(var10);
      }

      var1.m_2807().clear();
      var6.m_5533(Map.of(), this.f_3216, this.f_3217);
      var6.m_5542();
      this.f_3207.m_1762();
      Class_ftHu9o3WzCU3Adxm.m_6725(this.f_3220 + "", f_3221);
      this.f_3208.execute(this::m_1646);
      return this.f_3220;
   }

   private synchronized void m_1649() {
      this.f_3219 = false;
      Class_ftHu9o3WzCU3Adxm.m_6725(f_3225, f_3226);
   }

   public boolean m_1652() {
      return this.f_3218;
   }

   public String m_1653() {
      return this.f_3220;
   }

   private String m_1654() {
      StringBuilder var1 = new StringBuilder(4);

      for (int var2 = 0; var2 < 4; var2++) {
         var1.append(f_3228.charAt(this.f_3205.nextInt(f_3229.length())));
      }

      return var1.toString();
   }

   public synchronized boolean m_1655(String var1) {
      if (this.f_3218 && var1 != null) {
         String var2 = var1.trim();
         if (this.f_3220 != null && this.f_3220.equalsIgnoreCase(var2)) {
            this.m_1640();
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
