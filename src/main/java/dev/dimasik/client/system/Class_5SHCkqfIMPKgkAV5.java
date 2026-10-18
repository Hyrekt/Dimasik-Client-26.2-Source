package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.Setting;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.IntegerSetting;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.network.chat.Component;

public final class Class_5SHCkqfIMPKgkAV5 {
   private static final double f_2515 = 220.0;
   private static final String f_2516 = ", ";
   private static final String f_2517 = "I";
   private static final String f_2518 = "Бинд ";
   private static final String f_2519 = "Bind ";
   private static final String f_2520 = " уже занят: ";
   private static final String f_2521 = " is already used by: ";

   public static int m_1477(int var0, boolean var1, int var2, int var3) {
      return m_1486(var0, var1, var2, var3, (Setting<?>)null);
   }

   public static boolean m_1478(int var0, Setting<?> var1) {
      Module var2 = m_1481(var1);
      return m_1485(var0, var2);
   }

   private static boolean m_1479(Setting<?> var0, int var1) {
      if (var0 instanceof IntegerSetting var7) {
         return var7.m_8768() == var1;
      } else if (var0 instanceof CheckboxSetting var6) {
         return var6.m_5183().m_1369() == var1;
      } else if (var0 instanceof MultiChoiceSetting var5) {
         for (Class_2ZaVm8TGDJ68TnJB var9 : var5.m_8768()) {
            if (var9.m_1189().m_1369() == var1) {
               return true;
            }
         }

         return false;
      } else {
         if (var0 instanceof ItemListSetting var2) {
            for (Class_2ZaVm8TGDJ68TnJB var4 : var2.m_8768()) {
               if (var4.m_1189().m_1369() == var1) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public static void m_1480(int var0) {
      if (m_1483(var0)) {
         List var1 = m_1487(var0);
         if (!var1.isEmpty()) {
            String var2 = String.join(f_2516, var1);
            Class_8UIDpbIRPAjhei7m.m_1787(
               f_2517,
               Component.literal(
                  Class_0p152hWffX3ippAf.m_804(f_2518, f_2519) + Class_vAC0cSmAiUV3cskz.m_9251(var0) + Class_0p152hWffX3ippAf.m_804(f_2520, f_2521) + var2
               ),
               -1
            );
         }
      }
   }

   private static Module m_1481(Setting<?> var0) {
      if (var0 != null && DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null) {
         for (Module var2 : DimasikClient.m_9057().m_9049().m_2801()) {
            if (var2.m_780().contains(var0)) {
               return var2;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private static boolean m_1482(Module var0, int var1) {
      if (var0.m_779().m_1369() == var1) {
         return true;
      }

      for (Setting var3 : var0.m_780()) {
         if (m_1479(var3, var1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean m_1483(int var0) {
      if (var0 >= 0 && DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null) {
         int var1 = 0;

         for (Module var3 : DimasikClient.m_9057().m_9049().m_2801()) {
            if (var3.m_776() && m_1482(var3, var0)) {
               if (++var1 > 1) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private Class_5SHCkqfIMPKgkAV5() {
   }

   private static boolean m_1484(Setting<?> var0) {
      if (var0 instanceof IntegerSetting var6) {
         return m_1483(var6.m_8768());
      } else if (var0 instanceof CheckboxSetting var5) {
         return m_1483(var5.m_5183().m_1369());
      } else if (var0 instanceof MultiChoiceSetting var4) {
         for (Class_2ZaVm8TGDJ68TnJB var8 : var4.m_8768()) {
            if (m_1483(var8.m_1189().m_1369())) {
               return true;
            }
         }

         return false;
      } else {
         if (var0 instanceof ItemListSetting var1) {
            for (Class_2ZaVm8TGDJ68TnJB var3 : var1.m_8768()) {
               if (m_1483(var3.m_1189().m_1369())) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public static boolean m_1485(int var0, Module var1) {
      return var1 != null && var1.m_776() && m_1483(var0);
   }

   public static int m_1486(int var0, boolean var1, int var2, int var3, Setting<?> var4) {
      if (var1) {
         return var3;
      }

      boolean var5 = var4 == null ? m_1483(var0) : m_1478(var0, var4);
      return var5 ? Class_BftdentXEtGbugJw.m_2303(255, 92, 92, f_2515) : var2;
   }

   public static List<String> m_1487(int var0) {
      ArrayList var1 = new ArrayList();
      if (var0 >= 0 && DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null) {
         for (Module var3 : DimasikClient.m_9057().m_9049().m_2801()) {
            if (var3.m_776()) {
               if (var3.m_779().m_1369() == var0) {
                  var1.add(var3.m_793());
               }

               for (Setting var5 : var3.m_780()) {
                  if (var5 instanceof IntegerSetting var6 && var6.m_8768() == var0) {
                     var1.add(var3.m_793() + var5.m_8764());
                  } else if (var5 instanceof CheckboxSetting var7 && var7.m_5183().m_1369() == var0) {
                     var1.add(var3.m_793() + var5.m_8764());
                  } else if (var5 instanceof MultiChoiceSetting var8) {
                     for (Class_2ZaVm8TGDJ68TnJB var13 : var8.m_8768()) {
                        if (var13.m_1189().m_1369() == var0) {
                           var1.add(var3.m_793() + var13.m_1181());
                        }
                     }
                  } else if (var5 instanceof ItemListSetting var9) {
                     for (Class_2ZaVm8TGDJ68TnJB var11 : var9.m_8768()) {
                        if (var11.m_1189().m_1369() == var0) {
                           var1.add(var3.m_793() + var11.m_1181());
                        }
                     }
                  }
               }
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   public static boolean m_1488(Module var0) {
      if (var0 != null && var0.m_776()) {
         if (m_1483(var0.m_779().m_1369())) {
            return true;
         }

         for (Setting var2 : var0.m_780()) {
            if (m_1484(var2)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }
}
