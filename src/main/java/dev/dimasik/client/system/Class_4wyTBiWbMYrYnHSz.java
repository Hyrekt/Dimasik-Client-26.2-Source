package dev.dimasik.client.system;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import dev.dimasik.client.DimasikClient;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen;
import net.minecraft.network.chat.Component;

public final class Class_4wyTBiWbMYrYnHSz {
   private static final String f_2189 = "ru.fiw.proxyserver.ProxyServer";
   private static final String f_2190 = "ru.fiw.proxyserver.GuiProxy";
   private static final String f_2191 = "com.viaversion.viafabricplus.screen.impl.ProtocolSelectionScreen";
   private static Field f_2192;
   private static Field f_2193;
   private static Method f_2194;
   private static boolean f_2195;
   private static final String f_2196 = "ru.fiw.proxyserver.ProxyServer";
   private static final String f_2197 = "proxyMenuButton";
   private static final String f_2198 = "proxyEnabled";
   private static final String f_2199 = "getLastUsedProxyIp";
   private static final String f_2200 = "Proxy: none";
   private static final String f_2201 = "Via";
   private static final String f_2202 = "Прокси";
   private static final String f_2203 = "none";
   private static final String f_2204 = "null";
   private static final String f_2205 = "Прокси: выкл";
   private static final String f_2206 = "Прокси";
   private static final String f_2207 = "com.viaversion.viafabricplus.screen.impl.ProtocolSelectionScreen";
   private static final String f_2208 = "INSTANCE";
   private static final String f_2209 = "open";
   private static final String f_2210 = "prevScreen";
   private static final String f_2211 = "ru.fiw.proxyserver.GuiProxy";

   public static boolean m_1373() {
      return f_2195;
   }

   public static void m_1375() {
      try {
         if (f_2192 == null) {
            Class var0 = Class.forName(f_2196);
            f_2192 = var0.getField(f_2197);
            f_2193 = var0.getField(f_2198);
            f_2194 = var0.getMethod(f_2199);
            f_2195 = true;
         }

         if (f_2192.get(null) == null) {
            f_2192.set(null, Button.builder(Component.literal(f_2200), var0x -> {}).bounds(0, 0, 120, 20).build());
         }
      } catch (Throwable var1) {
         f_2195 = false;
      }
   }

   public static String m_1376() {
      m_1375();
      if (!f_2195) {
         return f_2202;
      }

      try {
         boolean var0 = f_2193.getBoolean(null);
         String var1 = String.valueOf(f_2194.invoke(null));
         return var0 && !var1.isBlank() && !f_2203.equalsIgnoreCase(var1) && !f_2204.equalsIgnoreCase(var1) ? var1 + "" : f_2205;
      } catch (Throwable var2) {
         return f_2206;
      }
   }

   private Class_4wyTBiWbMYrYnHSz() {
   }

   public static String m_1377() {
      try {
         ProtocolVersion var0 = Class_WCOf2iYDUGCRyVGl.m_5424();
         if (var0 != null && var0.getName() != null && !var0.getName().isBlank()) {
            return var0.getName();
         }
      } catch (Throwable var1) {
      }

      return f_2201;
   }

   public static boolean m_1378(Screen var0) {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2806().m_4507()) {
         try {
            Class var1 = Class.forName(f_2207);
            Object var2 = var1.getField(f_2208).get(null);
            Method var3 = m_1380(var1, f_2209, Screen.class);
            if (var3 != null) {
               var3.setAccessible(true);
               var3.invoke(var2, var0);
               return true;
            }

            Field var4 = m_1383(var1, f_2210);
            if (var4 != null) {
               var4.setAccessible(true);
               var4.set(var2, var0);
            }

            Minecraft.getInstance().gui.setScreen((Screen)var2);
            return true;
         } catch (Throwable var5) {
            return false;
         }
      } else {
         return false;
      }
   }

   private static Screen m_1379(Class<?> var0, Screen var1) {
      try {
         Constructor var5 = var0.getConstructor(Screen.class);
         return (Screen)var5.newInstance(var1);
      } catch (Throwable var4) {
         try {
            Constructor var2 = var0.getConstructor(JoinMultiplayerScreen.class);
            return (Screen)var2.newInstance(new JoinMultiplayerScreen(var1));
         } catch (Throwable var3) {
            return null;
         }
      }
   }

   private static Method m_1380(Class<?> var0, String var1, Class<?>... var2) {
      for (Class var3 = var0; var3 != null; var3 = var3.getSuperclass()) {
         try {
            return var3.getDeclaredMethod(var1, var2);
         } catch (NoSuchMethodException var5) {
         }
      }

      return null;
   }

   public static void m_1381() {
      m_1375();
   }

   public static boolean m_1382(Screen var0) {
      m_1375();

      try {
         Class var1 = Class.forName(f_2211);
         Screen var2 = m_1379(var1, var0);
         if (var2 == null) {
            return false;
         }

         Minecraft.getInstance().gui.setScreen(var2);
         return true;
      } catch (Throwable var3) {
         return false;
      }
   }

   private static Field m_1383(Class<?> var0, String var1) {
      for (Class var2 = var0; var2 != null; var2 = var2.getSuperclass()) {
         try {
            return var2.getDeclaredField(var1);
         } catch (NoSuchFieldException var4) {
         }
      }

      return null;
   }
}
