package dev.dimasik.client.setting.impl;

import dev.dimasik.client.setting.Setting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BooleanSupplier;

public class ItemListSetting extends Setting<List<Class_2ZaVm8TGDJ68TnJB>> {
   private final Map<String, Boolean> f_23276 = new LinkedHashMap<>();
   private final Map<String, Class_2ZaVm8TGDJ68TnJB> f_23277 = new HashMap<>();
   private boolean f_23278;

   public ItemListSetting m_822(BooleanSupplier var1) {
      this.m_8763(var1);
      return this;
   }

   public boolean m_7145(String var1) {
      List var2 = this.m_8768();
      if (var2 == this.m_8765() && !this.f_23278) {
         Class_2ZaVm8TGDJ68TnJB var5 = this.f_23277.get(var1);
         return var5 != null && var5.m_1187();
      }

      for (int var3 = 0; var3 < var2.size(); var3++) {
         Class_2ZaVm8TGDJ68TnJB var4 = (Class_2ZaVm8TGDJ68TnJB)var2.get(var3);
         if (var4.m_1181().equals(var1) && var4.m_1187()) {
            return true;
         }
      }

      return false;
   }

   public ItemListSetting(String var1, Class_2ZaVm8TGDJ68TnJB... var2) {
      super(var1, List.of(var2));

      for (Class_2ZaVm8TGDJ68TnJB var6 : var2) {
         this.f_23276.put(var6.m_1181(), var6.m_1187());
         this.f_23278 = this.f_23278 | this.f_23277.putIfAbsent(var6.m_1181(), var6) != null;
      }
   }

   public void m_7146() {
      for (Class_2ZaVm8TGDJ68TnJB var2 : this.m_8768()) {
         var2.m_1183(this.f_23276.getOrDefault(var2.m_1181(), false));
         var2.m_1189().m_1367(-1);
      }
   }
}
