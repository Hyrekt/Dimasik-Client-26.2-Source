package dev.dimasik.client.system;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public final class Class_qK16bqpf5bjnS3Wo {
   private static Method f_29875;
   private static Method f_29876;
   private static Method f_29877;
   private static Method f_29878;
   private static boolean f_29879;
   private static final String f_29880 = "de.maxhenkel.voicechat.voice.client.ClientManager";
   private static final String f_29881 = "de.maxhenkel.voicechat.voice.common.PlayerState";
   private static final String f_29882 = "getPlayerStateManager";
   private static final String f_29883 = "getPlayerStates";
   private static final String f_29884 = "getUuid";
   private static final String f_29885 = "getName";

   public static List<Class_qK16bqpf5bjnS3Wo.GxXjmRPjEtErXC79> m_8327() {
      if (!m_8328()) {
         return List.of();
      }

      try {
         Object var0 = f_29875.invoke(null);
         if (var0 == null) {
            return List.of();
         }

         if (f_29876.invoke(var0, false) instanceof Collection var2) {
            ArrayList var3 = new ArrayList(var2.size());

            for (Object var5 : var2) {
               UUID var6 = (UUID)f_29877.invoke(var5);
               String var7 = (String)f_29878.invoke(var5);
               if (var6 != null && var7 != null && !var7.isBlank()) {
                  var3.add(new Class_qK16bqpf5bjnS3Wo.GxXjmRPjEtErXC79(var6, var7));
               }
            }

            return var3;
         } else {
            return List.of();
         }
      } catch (ReflectiveOperationException | LinkageError var8) {
         return List.of();
      }
   }

   private Class_qK16bqpf5bjnS3Wo() {
   }

   private static boolean m_8328() {
      if (f_29879) {
         return f_29875 != null;
      }

      f_29879 = true;

      try {
         Class var0 = Class.forName(f_29880);
         Class var1 = Class.forName(f_29881);
         f_29875 = var0.getMethod(f_29882);
         f_29876 = f_29875.getReturnType().getMethod(f_29883, boolean.class);
         f_29877 = var1.getMethod(f_29884);
         f_29878 = var1.getMethod(f_29885);
         return true;
      } catch (ReflectiveOperationException | LinkageError var2) {
         f_29875 = null;
         return false;
      }
   }

   public record GxXjmRPjEtErXC79(UUID uuid, String name) {
   }
}
