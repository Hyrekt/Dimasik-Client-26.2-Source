package dev.dimasik.client.system;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.Setting;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import java.io.File;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.ClickEvent.RunCommand;
import net.minecraft.network.chat.HoverEvent.ShowText;
import net.minecraft.util.Util;

public class Class_8wrHj8R3ffasKkji extends Class_msKbTl6QleqYGoq3 {
   private final Class_qivxiwjUY0GMkVgq f_4468 = new Class_qivxiwjUY0GMkVgq();
   private final Class_gEPk7yDw6CwIte87<Class_qUEA6tS6otjuY2Wk> f_4469 = this::m_1900;
   private static final String f_4470 = "config";
   private static final String f_4471 = "cfg";
   private static final String f_4472 = "saveall";
   private static final String f_4473 = "loadall";
   private static final String f_4474 = "save";
   private static final String f_4475 = "name";
   private static final String f_4476 = "load";
   private static final String f_4477 = "name";
   private static final String f_4478 = "module";
   private static final String f_4479 = "dir";
   private static final String f_4480 = "list";
   private static final String f_4481 = "remove";
   private static final String f_4482 = "config";
   private static final String f_4483 = "reset";
   private static final String f_4484 = "SystemDrive";
   private static final String f_4485 = "[+]";
   private static final String f_4486 = " ";
   private static final String f_4487 = "[x]";
   private static final String f_4488 = " ";
   private static final String f_4489 = "config";
   private static final String f_4490 = "Не удалось удалить конфиг!";
   private static final String f_4491 = "Данного файла не существует!";
   private static final String f_4492 = "У вас отсутствуют конфиги!";
   private static final String f_4493 = "SystemDrive";
   private static final String f_4494 = "SystemDrive";
   private static final String f_4495 = "/Dimas/dimasik/configs/custom/";
   private static final String f_4496 = "Успешно открыл папку с конфигами.";
   private static final String f_4497 = "module";
   private static final String f_4498 = "name";
   private static final String f_4499 = "dimasik/configs/custom";
   private static final String f_4500 = "Модуль не найден!";
   private static final String f_4501 = "name";
   private static final String f_4502 = "dimasik/configs/custom";
   private static final String f_4503 = "name";
   private static final String f_4504 = "dimasik/configs/custom";
   private static final String f_4505 = "Успешно загрузил все настройки.";
   private static final String f_4506 = "Успешно сохранил все настройки.";

   private static File m_1891(String var0) {
      return new File(System.getenv(f_4484) + "", var0 + "");
   }

   @Override
   public void build(LiteralArgumentBuilder<ClientSuggestionProvider> var1) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)var1.then(
                              this.m_7628(f_4472).executes(var0 -> {
                                 DimasikClient.m_9057().m_9049().m_2802().m_8851();
                                 Class_ftHu9o3WzCU3Adxm.m_6731(f_4506);
                                 return 1;
                              })
                           ))
                           .then(this.m_7628(f_4473).executes(var0 -> {
                              DimasikClient.m_9057().m_9049().m_2802().m_8855();
                              Class_ftHu9o3WzCU3Adxm.m_6731(f_4505);
                              return 1;
                           })))
                        .then(this.m_7628(f_4474).then(this.m_7624(f_4475, StringArgumentType.word()).executes(var0 -> {
                           String var1x = (String)var0.getArgument(f_4503, String.class);
                           new Class_45nqA0iofm7tcRxz(f_4504, var1x).m_5559();
                           Class_ftHu9o3WzCU3Adxm.m_6731(var1x + "");
                           return 1;
                        }))))
                     .then(this.m_7628(f_4476).then(((RequiredArgumentBuilder)this.m_7624(f_4477, this.f_4468).executes(var0 -> {
                        String var1x = (String)var0.getArgument(f_4501, String.class);
                        new Class_45nqA0iofm7tcRxz(f_4502, var1x).m_5560();
                        Class_ftHu9o3WzCU3Adxm.m_6731(var1x + "");
                        return 1;
                     })).then(this.m_7624(f_4478, Class_wcSgtfYfdlLujCgu.modules()).executes(var0 -> {
                        String var1x = (String)var0.getArgument(f_4497, String.class);
                        String var2 = (String)var0.getArgument(f_4498, String.class);
                        Module var3 = null;

                        for (Module var5 : DimasikClient.m_9057().m_9049().m_2801()) {
                           if (var5.m_793().equalsIgnoreCase(var1x)) {
                              var3 = var5;
                              break;
                           }
                        }

                        if (var3 != null) {
                           new Class_45nqA0iofm7tcRxz(f_4499, var2).m_1342(var3);
                           Class_ftHu9o3WzCU3Adxm.m_6731(var1x + var2);
                        } else {
                           Class_ftHu9o3WzCU3Adxm.m_6731(f_4500);
                        }

                        return 1;
                     })))))
                  .then(this.m_7628(f_4479).executes(var0 -> {
                     String var1x = System.getenv(f_4493) == null ? Minecraft.getInstance().gameDirectory.toString() : System.getenv(f_4494);
                     File var2 = new File(var1x, f_4495);
                     Util.getPlatform().openPath(var2.toPath());
                     Class_ftHu9o3WzCU3Adxm.m_6731(f_4496);
                     return 1;
                  })))
               .then(this.m_7628(f_4480).executes(var1x -> {
                  List<String> var2 = DimasikClient.m_9057().m_9049().m_2802().m_8862();
                  this.f_4468.setList(var2);
                  if (var2.isEmpty()) {
                     Class_ftHu9o3WzCU3Adxm.m_6731(f_4492);
                     return 1;
                  }

                  String var3 = DimasikClient.m_9057().m_9049().m_2809().m_6132().toString();

                  for (String var5 : var2) {
                     Class_ftHu9o3WzCU3Adxm.m_6731(m_1899(var3, var5));
                  }

                  return 1;
               })))
            .then(this.m_7628(f_4481).then(this.m_7624(f_4482, this.f_4468).executes(var1x -> {
               String var2 = (String)var1x.getArgument(f_4489, String.class);
               File var3 = m_1891(var2);
               if (var3.exists()) {
                  if (var3.delete()) {
                     this.f_4468.setList(DimasikClient.m_9057().m_9049().m_2802().m_8862());
                     Class_ftHu9o3WzCU3Adxm.m_6731(var2 + "");
                  } else {
                     Class_ftHu9o3WzCU3Adxm.m_6731(f_4490);
                  }
               } else {
                  Class_ftHu9o3WzCU3Adxm.m_6731(f_4491);
               }

               return 1;
            }))))
         .then(this.m_7628(f_4483).executes(var0 -> {
            for (Module var2 : DimasikClient.m_9057().m_9049().m_2801()) {
               for (Setting var4 : var2.m_780()) {
                  if (var4 instanceof MultiChoiceSetting var5) {
                     var5.m_1765();
                  } else if (var4 instanceof ItemListSetting var6) {
                     var6.m_7146();
                  } else {
                     m_1897(var4);
                     if (var4 instanceof CheckboxSetting var7) {
                        var7.m_5183().m_1367(-1);
                     }
                  }
               }

               if (var2.m_776()) {
                  var2.m_789();
               }

               var2.m_779().m_1367(-1);
            }

            return 1;
         }));
   }

   private static Component m_1892(String var0, int var1, String var2, String var3) {
      return Component.literal(var0)
         .setStyle(Style.EMPTY.withColor(var1).withBold(true).withClickEvent(new RunCommand(var2)).withHoverEvent(new ShowText(Component.literal(var3))));
   }

   public Class_8wrHj8R3ffasKkji() {
      super(f_4470, f_4471);
   }

   private static <T> void m_1897(Setting<T> var0) {
      var0.m_823(var0.m_8765());
   }

   private static Component m_1899(String var0, String var1) {
      return Component.empty()
         .append(m_1892(f_4485, Class_BftdentXEtGbugJw.m_2310(22, 251, 27), var0 + var1, var1 + ""))
         .append(Component.literal(f_4486))
         .append(m_1892(f_4487, Class_BftdentXEtGbugJw.m_2310(251, 22, 22), var0 + var1, var1 + ""))
         .append(Component.literal(f_4488))
         .append(Component.literal(var1));
   }

   public void m_1900(Class_qUEA6tS6otjuY2Wk var1) {
      this.f_4468.setList(DimasikClient.m_9057().m_9049().m_2802().m_8862());
   }
}
