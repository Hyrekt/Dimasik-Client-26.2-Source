package dev.dimasik.client.system;

import com.mojang.blaze3d.platform.InputConstants;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.manager.ModuleManager;
import dev.dimasik.client.module.Module;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;

public class Class_6yUSQ5tMyEFIGGuu extends Class_msKbTl6QleqYGoq3 {
   private static final String f_3031 = "bind";
   private static final String f_3032 = "b";
   private static final String f_3033 = "add";
   private static final String f_3034 = "module";
   private static final String f_3035 = "key";
   private static final String f_3036 = "remove";
   private static final String f_3037 = "target";
   private static final String f_3038 = "list";
   private static final String f_3039 = "clear";
   private static final String f_3040 = "Нельзя удалить бинд модуля ClickGui.";
   private static final String f_3041 = ", ";
   private static final String f_3042 = "У вас отсутствуют установленные бинды.";
   private static final String f_3043 = "Список биндов:";
   private static final String f_3044 = "Нет биндов для удаления. Бинд ClickGui сохранён.";
   private static final String f_3045 = "\"";
   private static final String f_3046 = " ";
   private static final String f_3047 = "_";
   private static final String f_3048 = "-";
   private static final String f_3049 = "\"";
   private static final String f_3050 = " ";
   private static final String f_3051 = "_";
   private static final String f_3052 = "-";
   private static final String f_3053 = "_";
   private static final String f_3054 = "CTRL";
   private static final String f_3055 = "CONTROL";
   private static final String f_3056 = "RCTRL";
   private static final String f_3057 = "RIGHTCTRL";
   private static final String f_3058 = "RIGHT_CTRL";
   private static final String f_3059 = "SHIFT";
   private static final String f_3060 = "LSHIFT";
   private static final String f_3061 = "RSHIFT";
   private static final String f_3062 = "RIGHTSHIFT";
   private static final String f_3063 = "ALT";
   private static final String f_3064 = "LALT";
   private static final String f_3065 = "RALT";
   private static final String f_3066 = "RIGHTALT";
   private static final String f_3067 = "WIN";
   private static final String f_3068 = "WINDOWS";
   private static final String f_3069 = "SUPER";
   private static final String f_3070 = "ESC";
   private static final String f_3071 = "DEL";
   private static final String f_3072 = "INS";
   private static final String f_3073 = "RETURN";
   private static final String f_3074 = "PGUP";
   private static final String f_3075 = "PGDOWN";
   private static final String f_3076 = "PGDN";
   private static final String f_3077 = "CAPS";
   private static final String f_3078 = "NUMLOCK";
   private static final String f_3079 = "SCROLLLOCK";
   private static final String f_3080 = "PRINTSCREEN";
   private static final String f_3081 = "PRTSC";
   private static final String f_3082 = "ARROW_UP";
   private static final String f_3083 = "ARROW_DOWN";
   private static final String f_3084 = "ARROW_LEFT";
   private static final String f_3085 = "ARROW_RIGHT";
   private static final String f_3086 = "LEFT_CONTROL";
   private static final String f_3087 = "RIGHT_CONTROL";
   private static final String f_3088 = "LEFT_SHIFT";
   private static final String f_3089 = "RIGHT_SHIFT";
   private static final String f_3090 = "LEFT_ALT";
   private static final String f_3091 = "RIGHT_ALT";
   private static final String f_3092 = "LEFT_SUPER";
   private static final String f_3093 = "ESCAPE";
   private static final String f_3094 = "DELETE";
   private static final String f_3095 = "INSERT";
   private static final String f_3096 = "ENTER";
   private static final String f_3097 = "PAGE_UP";
   private static final String f_3098 = "PAGE_DOWN";
   private static final String f_3099 = "CAPS_LOCK";
   private static final String f_3100 = "NUM_LOCK";
   private static final String f_3101 = "SCROLL_LOCK";
   private static final String f_3102 = "PRINT_SCREEN";
   private static final String f_3103 = "UP";
   private static final String f_3104 = "DOWN";
   private static final String f_3105 = "LEFT";
   private static final String f_3106 = "RIGHT";
   private static final String f_3107 = "NONE";
   private static final String f_3108 = "GLFW_KEY_";
   private static final String f_3109 = "GLFW_KEY_";
   private static final String f_3110 = "GLFW_KEY_";
   private static final String f_3111 = "GLFW_KEY_";
   private static final String f_3112 = " ";
   private static final String f_3113 = "\"";
   private static final String f_3114 = " ";
   private static final String f_3115 = "_";
   private static final String f_3116 = "-";
   private static final String f_3117 = "ClickGui";
   private static final String f_3118 = "target";
   private static final String f_3119 = "module";
   private static final String f_3120 = "key";

   private void m_1584(SuggestionsBuilder var1, String var2, String var3, boolean var4) {
      if (this.m_1590(var3).startsWith(var2)) {
         String var5 = var3.contains(f_3112) ? var3 + "" : var3;
         if (var4) {
            var5 = var5 + "";
         }

         var1.suggest(var5);
      }
   }

   private CompletableFuture<Suggestions> m_1586(SuggestionsBuilder var1) {
      String var2 = this.m_1590(var1.getRemaining());

      for (Module var4 : this.m_1596()) {
         this.m_1584(var1, var2, var4.m_793(), true);
         String var5 = var4.getClass().getSimpleName();
         if (!var5.equalsIgnoreCase(var4.m_793())) {
            this.m_1584(var1, var2, var5, true);
         }
      }

      return var1.buildFuture();
   }

   private int m_1587(String var1) {
      Module var2 = this.m_1606(var1);
      if (var2 != null) {
         if (this.m_1593(var2)) {
            Class_ftHu9o3WzCU3Adxm.m_6731(f_3040);
            return 1;
         } else if (var2.m_779().m_1369() == -1) {
            Class_ftHu9o3WzCU3Adxm.m_6731(var2.m_793() + "");
            return 1;
         } else {
            String var8 = this.m_1594(var2.m_779().m_1369());
            var2.m_779().m_1367(-1);
            this.m_1602();
            Class_ftHu9o3WzCU3Adxm.m_6731(var2.m_793() + var8);
            return 1;
         }
      } else {
         int var3 = this.m_1603(var1);
         if (var3 == -1) {
            Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
            return 1;
         }

         ArrayList var4 = new ArrayList();
         boolean var5 = false;

         for (Module var7 : this.m_1596()) {
            if (var7.m_779().m_1369() == var3) {
               if (this.m_1593(var7)) {
                  var5 = true;
               } else {
                  var7.m_779().m_1367(-1);
                  var4.add(var7.m_793());
               }
            }
         }

         if (var4.isEmpty()) {
            if (var5) {
               Class_ftHu9o3WzCU3Adxm.m_6731(this.m_1594(var3) + "");
            } else {
               Class_ftHu9o3WzCU3Adxm.m_6731(this.m_1594(var3) + "");
            }

            return 1;
         } else {
            this.m_1602();
            Class_ftHu9o3WzCU3Adxm.m_6731(this.m_1594(var3) + String.join(f_3041, var4));
            return 1;
         }
      }
   }

   private String m_1589(String var1) {
      return var1.trim().replace(f_3045, "").replace(f_3046, "").replace(f_3047, "").replace(f_3048, "").toLowerCase(Locale.ROOT);
   }

   private String m_1590(String var1) {
      return var1.trim().toLowerCase(Locale.ROOT).replace(f_3113, "").replace(f_3114, "").replace(f_3115, "").replace(f_3116, "");
   }

   private int m_1591() {
      int var1 = 0;

      for (Module var3 : this.m_1596()) {
         if (!this.m_1593(var3) && var3.m_779().m_1369() != -1) {
            var3.m_779().m_1367(-1);
            var1++;
         }
      }

      if (var1 == 0) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_3044);
         return 1;
      } else {
         this.m_1602();
         Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
         return 1;
      }
   }

   private boolean m_1593(Module var1) {
      return var1 == this.m_1596().m_3442() || var1.m_793().equalsIgnoreCase(f_3117);
   }

   private String m_1594(int var1) {
      if (var1 == -1) {
         return f_3107;
      }

      for (Field var5 : InputConstants.class.getFields()) {
         if (var5.getName().startsWith(f_3108) && var5.getType() == int.class && Modifier.isStatic(var5.getModifiers())) {
            try {
               if (var5.getInt(null) == var1) {
                  return var5.getName().substring(f_3109.length());
               }
            } catch (IllegalAccessException var7) {
            }
         }
      }

      return String.valueOf(var1);
   }

   @Override
   public void build(LiteralArgumentBuilder<ClientSuggestionProvider> var1) {
      var1.then(
         this.m_7628(f_3033)
            .then(
               this.m_7624(f_3034, StringArgumentType.string())
                  .suggests((var1x, var2) -> this.m_1586(var2))
                  .then(this.m_7624(f_3035, StringArgumentType.word()).suggests((var1x, var2) -> this.m_1605(var2)).executes(var1x -> {
                     String var2 = StringArgumentType.getString(var1x, f_3119);
                     String var3 = StringArgumentType.getString(var1x, f_3120);
                     return this.m_1597(var2, var3);
                  }))
            )
      );
      var1.then(this.m_7628(f_3036).then(this.m_7624(f_3037, StringArgumentType.string()).suggests((var1x, var2) -> this.m_1604(var2)).executes(var1x -> {
         String var2 = StringArgumentType.getString(var1x, f_3118);
         return this.m_1587(var2);
      })));
      var1.then(this.m_7628(f_3038).executes(var1x -> this.m_1598()));
      var1.then(this.m_7628(f_3039).executes(var1x -> this.m_1591()));
   }

   public Class_6yUSQ5tMyEFIGGuu() {
      super(f_3031, f_3032);
   }

   private ModuleManager m_1596() {
      return DimasikClient.m_9057().m_9049().m_2801();
   }

   private int m_1597(String var1, String var2) {
      Module var3 = this.m_1606(var1);
      if (var3 == null) {
         Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
         return 1;
      } else {
         int var4 = this.m_1603(var2);
         if (var4 == -1) {
            Class_ftHu9o3WzCU3Adxm.m_6731(var2 + "");
            return 1;
         } else {
            var3.m_779().m_1367(var4);
            this.m_1602();
            Class_ftHu9o3WzCU3Adxm.m_6731(var3.m_793() + this.m_1594(var4));
            return 1;
         }
      }
   }

   private int m_1598() {
      List var1 = this.m_1596()
         .stream()
         .filter(var0 -> var0.m_779().m_1369() != -1)
         .sorted(Comparator.comparing(Module::m_793, String.CASE_INSENSITIVE_ORDER))
         .toList();
      if (var1.isEmpty()) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_3042);
         return 1;
      }

      Class_ftHu9o3WzCU3Adxm.m_6731(f_3043);

      for (Module var3 : (Iterable<Module>) (Iterable) var1) {
         Class_ftHu9o3WzCU3Adxm.m_6731(var3.m_793() + Class_vAC0cSmAiUV3cskz.m_9251(var3.m_779().m_1369()));
      }

      return 1;
   }

   private void m_1602() {
      DimasikClient.m_9057().m_9049().m_2802().m_8851();
   }

   private int m_1603(String var1) {
      if (var1 != null && !var1.isBlank()) {
         String var2 = var1.trim().toUpperCase(Locale.ROOT).replace(f_3049, "").replace(f_3050, f_3051).replace(f_3052, f_3053);

         var2 = switch (var2) {
            case f_3054, f_3055 -> f_3086;
            case f_3056, f_3057, f_3058 -> f_3087;
            case f_3059, f_3060 -> f_3088;
            case f_3061, f_3062 -> f_3089;
            case f_3063, f_3064 -> f_3090;
            case f_3065, f_3066 -> f_3091;
            case f_3067, f_3068, f_3069 -> f_3092;
            case f_3070 -> f_3093;
            case f_3071 -> f_3094;
            case f_3072 -> f_3095;
            case f_3073 -> f_3096;
            case f_3074 -> f_3097;
            case f_3075, f_3076 -> f_3098;
            case f_3077 -> f_3099;
            case f_3078 -> f_3100;
            case f_3079 -> f_3101;
            case f_3080, f_3081 -> f_3102;
            case f_3082 -> f_3103;
            case f_3083 -> f_3104;
            case f_3084 -> f_3105;
            case f_3085 -> f_3106;
            default -> var2;
         };

         try {
            Field var7 = InputConstants.class.getField(var2 + "");
            return var7.getType() == int.class && Modifier.isStatic(var7.getModifiers()) ? var7.getInt(null) : -1;
         } catch (ReflectiveOperationException var5) {
            return -1;
         }
      } else {
         return -1;
      }
   }

   private CompletableFuture<Suggestions> m_1604(SuggestionsBuilder var1) {
      String var2 = this.m_1590(var1.getRemaining());

      for (Module var4 : this.m_1596()) {
         if (var4.m_779().m_1369() != -1) {
            this.m_1584(var1, var2, var4.m_793(), false);
            String var5 = var4.getClass().getSimpleName();
            if (!var5.equalsIgnoreCase(var4.m_793())) {
               this.m_1584(var1, var2, var5, false);
            }

            String var6 = this.m_1594(var4.m_779().m_1369());
            if (this.m_1590(var6).startsWith(var2)) {
               var1.suggest(var6);
            }
         }
      }

      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> m_1605(SuggestionsBuilder var1) {
      String var2 = var1.getRemaining().trim().toUpperCase(Locale.ROOT);

      for (Field var6 : InputConstants.class.getFields()) {
         if (var6.getName().startsWith(f_3110) && var6.getType() == int.class && Modifier.isStatic(var6.getModifiers())) {
            String var7 = var6.getName().substring(f_3111.length());
            if (var7.startsWith(var2)) {
               var1.suggest(var7);
            }
         }
      }

      return var1.buildFuture();
   }

   private Module m_1606(String var1) {
      String var2 = this.m_1589(var1);

      for (Module var4 : this.m_1596()) {
         String var5 = this.m_1589(var4.m_793());
         String var6 = this.m_1589(var4.getClass().getSimpleName());
         if (var5.equals(var2) || var6.equals(var2)) {
            return var4;
         }
      }

      return null;
   }
}
