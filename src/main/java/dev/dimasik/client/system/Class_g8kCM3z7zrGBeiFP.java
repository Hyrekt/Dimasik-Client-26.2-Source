package dev.dimasik.client.system;

import com.mojang.blaze3d.platform.InputConstants;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.KeybindMode;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.Setting;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import net.minecraft.client.KeyMapping;

public class Class_g8kCM3z7zrGBeiFP extends Class_4DhobBIM8lTNckKj {
   private String f_20842 = null;
   private int f_20843 = 0;
   private final Class_gEPk7yDw6CwIte87<Class_B6JOzHnwhU3pe4AO> f_20844 = this::m_6760;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_20845 = this::m_6758;
   private static final String f_20846 = "Никакой";
   private static final String f_20847 = "Grim";

   public void m_6758(Class_Xu9btcIeUN33XnMK var1) {
      if (DimasikClient.m_9057().m_9049().m_2805().m_1652()) {
         this.f_20842 = null;
         this.f_20843 = 0;
      } else {
         if (this.f_20842 != null && !this.f_20842.isEmpty() && DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5157().m_7568(f_20847)) {
            KeyMapping[] var2 = new KeyMapping[]{
               f_11537.options.keyUp,
               f_11537.options.keyDown,
               f_11537.options.keyLeft,
               f_11537.options.keyRight,
               f_11537.options.keyJump,
               f_11537.options.keySprint
            };

            for (KeyMapping var6 : var2) {
               var6.setDown(false);
            }

            DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5158(true);
            if (!Class_QBKwWNWLlChWViO9.m_4256()) {
               if (this.f_20843 > 0) {
                  this.f_20843--;
                  return;
               }

               Class_ftHu9o3WzCU3Adxm.m_6723(this.f_20842);
               this.f_20842 = null;
               DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5158(false);
               if (f_11537.gui.screen() == null) {
                  for (KeyMapping var10 : var2) {
                     var10.setDown(InputConstants.isKeyDown(f_11537.getWindow(), var10.key.getValue()));
                  }
               }
            }
         }
      }
   }

   private void m_6759(int var1) {
      for (Module var3 : DimasikClient.m_9057().m_9049().m_2801()) {
         if (var3.m_779().m_1369() == var1 && var3.m_779().m_1371() == KeybindMode.HOLD && var3.m_776()) {
            var3.m_777();
         }
      }
   }

   public void m_6760(Class_B6JOzHnwhU3pe4AO var1) {
      if (!DimasikClient.m_9057().m_9049().m_2805().m_1652()) {
         if (var1.m_2117() >= 0) {
            int var2 = var1.m_2116();
            if (var2 == 1 || var2 == 0) {
               if (var2 == 0) {
                  this.m_6759(var1.m_2117());
               } else if (f_11537.gui.screen() == null) {
                  DimasikClient.m_9057().m_9049().m_2803().m_5540(var1.m_2117());

                  for (Module var4 : DimasikClient.m_9057().m_9049().m_2801()) {
                     if (var4.m_779().m_1369() == var1.m_2117()) {
                        if (var4.m_779().m_1371() == KeybindMode.HOLD) {
                           if (!var4.m_776()) {
                              var4.m_792();
                           }
                        } else {
                           var4.m_789();
                        }
                     }

                     for (Setting var6 : var4.m_780()) {
                        if (var6 instanceof ItemListSetting var7) {
                           for (Class_2ZaVm8TGDJ68TnJB var17 : var7.m_8768()) {
                              int var18 = var17.m_1189().m_1369();
                              if (var18 >= 0 && var18 == var1.m_2117()) {
                                 var17.m_1183(!var17.m_1187());
                              }
                           }
                        } else if (var6 instanceof MultiChoiceSetting var8) {
                           for (Class_2ZaVm8TGDJ68TnJB var11 : var8.m_8768()) {
                              int var12 = var11.m_1189().m_1369();
                              if (var12 >= 0 && var12 == var1.m_2117()) {
                                 var8.m_1767(var11);
                                 break;
                              }
                           }
                        } else if (var6 instanceof CheckboxSetting var9) {
                           int var10 = var9.m_5183().m_1369();
                           if (var10 >= 0 && var10 == var1.m_2117()) {
                              var9.m_823(!var9.m_8768());
                           }
                        }
                     }
                  }

                  for (Class_q5Do365fnkZh6Wbu var14 : DimasikClient.m_9057().m_9049().m_2807()) {
                     if (var14.m_8326() == var1.m_2117()) {
                        if (DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5157().m_7568(f_20846)) {
                           Class_ftHu9o3WzCU3Adxm.m_6723(var14.m_8325());
                        } else {
                           this.f_20842 = var14.m_8325();
                           this.f_20843 = 2;
                        }
                     }
                  }

                  if (var1.m_2117() == 344) {
                     f_11537.gui.setScreen(DimasikClient.m_9057().m_9053().m_2276());
                  }
               }
            }
         }
      }
   }
}
