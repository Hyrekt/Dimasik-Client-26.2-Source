package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ModeSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.system.Class_29BIBbZyd5QWCwS1;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_BQT9PXBvcSf9Per8;
import dev.dimasik.client.system.Class_CPqSaXQtUSOKX1Z4;
import dev.dimasik.client.system.Class_JInbhwbvIxCoRpXA;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_lvSdQbZIK6LWhOfu;
import java.util.Objects;

public class NameProtect extends Module {
   private static final String f_5050 = "Protected";
   private static final String f_5051 = "dimasik";
   private final ModeSetting f_5052;
   private final MultiChoiceSetting f_5053;
   private final CheckboxSetting f_5054;
   private final ModeSetting f_5055;
   private final CheckboxSetting f_5056;
   private final CheckboxSetting f_5057;
   private final CheckboxSetting f_5058;
   private final Class_gEPk7yDw6CwIte87<Class_CPqSaXQtUSOKX1Z4> f_5059;
   private final Class_gEPk7yDw6CwIte87<Class_lvSdQbZIK6LWhOfu> f_5060;
   private static final String f_5061 = "NameProtect";
   private static final String f_5062 = "Скрывает ваш ник и ники друзей";
   private static final String f_5063 = "Custom name";
   private static final String f_5064 = "Protected";
   private static final String f_5065 = "Донат";
   private static final String f_5066 = "Заменять клан";
   private static final String f_5067 = "Клан";
   private static final String f_5068 = "dimasik";
   private static final String f_5069 = "Скрыть гриф";
   private static final String f_5070 = "Скрыть ссылки";
   private static final String f_5071 = "Полный Кастом";
   private static final String f_5072 = "dimasik";
   private static final String f_5073 = "dimasik";
   private static final String f_5074 = "Protected";
   private static final String f_5075 = "Protected";
   private static final String f_5076 = "Default";
   private static final String f_5077 = "Default";

   public int m_2049(int var1) {
      return this.m_2052() && Class_JInbhwbvIxCoRpXA.m_3256(var1) ? this.m_2050() : var1;
   }

   public char m_2050() {
      return Class_JInbhwbvIxCoRpXA.m_3260(this.f_5053.m_7564().m_1181());
   }

   public boolean m_2051() {
      return this.f_5058.m_8768();
   }

   public boolean m_2052() {
      return !this.f_5053.m_7568(f_5076);
   }

   private static Class_2ZaVm8TGDJ68TnJB[] m_2053() {
      String[] var0 = Class_JInbhwbvIxCoRpXA.m_3255();
      Class_2ZaVm8TGDJ68TnJB[] var1 = new Class_2ZaVm8TGDJ68TnJB[var0.length + 1];
      var1[0] = new Class_2ZaVm8TGDJ68TnJB(f_5077);

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2 + 1] = new Class_2ZaVm8TGDJ68TnJB(var0[var2]);
      }

      return var1;
   }

   public String m_2054() {
      String var1 = this.f_5055.m_8768();
      return var1 != null && !var1.isBlank() ? var1.trim() : f_5072;
   }

   public String m_2055(String var1) {
      if (var1 != null && !var1.isEmpty() && this.m_2052()) {
         char var2 = this.m_2050();
         StringBuilder var3 = null;

         for (int var4 = 0; var4 < var1.length(); var4++) {
            char var5 = var1.charAt(var4);
            if (Class_JInbhwbvIxCoRpXA.m_3256(var5)) {
               if (var3 == null) {
                  var3 = new StringBuilder(var1);
               }

               var3.setCharAt(var4, var2);
            }
         }

         return var3 == null ? var1 : var3.toString();
      } else {
         return var1;
      }
   }

   @Override
   public void m_732() {
      Class_BQT9PXBvcSf9Per8.m_2257();
   }

   public void m_2056(String var1) {
      String var2 = Objects.requireNonNullElse(var1, "").trim();
      this.f_5052.m_823(var2.isEmpty() ? f_5075 : var2);
      Class_29BIBbZyd5QWCwS1.m_941();
   }

   public String m_2057() {
      String var1 = this.f_5052.m_8768();
      return var1 != null && !var1.isBlank() ? var1 : f_5074;
   }

   public boolean m_2058() {
      return this.f_5057.m_8768();
   }

   public void m_2059(String var1) {
      String var2 = Objects.requireNonNullElse(var1, "").trim();
      this.f_5055.m_823(var2.isEmpty() ? f_5073 : var2);
   }

   public NameProtect() {
      super(f_5061, f_5062, Category.MISC);
      this.f_5052 = new ModeSetting(f_5063, f_5064);
      this.f_5053 = new MultiChoiceSetting(f_5065, m_2053());
      this.f_5054 = new CheckboxSetting(f_5066, false);
      this.f_5055 = new ModeSetting(f_5067, f_5068).m_822(() -> this.f_5054.m_8768());
      this.f_5056 = new CheckboxSetting(f_5069, false);
      this.f_5057 = new CheckboxSetting(f_5070, false);
      this.f_5058 = new CheckboxSetting(f_5071, false);
      this.f_5059 = this::m_2063;
      this.f_5060 = var0 -> Class_BQT9PXBvcSf9Per8.m_2257();
      this.m_795(this.f_5052, this.f_5053, this.f_5054, this.f_5055, this.f_5056, this.f_5057, this.f_5058);
   }

   public boolean m_2060() {
      return this.f_5056.m_8768();
   }

   private void m_2063(Class_CPqSaXQtUSOKX1Z4 var1) {
      if (!var1.m_1581()) {
         if (Class_BQT9PXBvcSf9Per8.m_2239(var1.m_2413(), var1.m_2414(), var1.m_2415())) {
            var1.m_1582(true);
         }
      }
   }

   public boolean m_2064() {
      return this.f_5054.m_8768();
   }
}
