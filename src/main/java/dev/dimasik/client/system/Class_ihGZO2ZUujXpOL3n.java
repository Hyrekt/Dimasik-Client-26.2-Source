package dev.dimasik.client.system;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.lang.management.ManagementFactory;
import java.util.function.BiConsumer;

public class Class_ihGZO2ZUujXpOL3n {
   private static final Gson f_24570 = new Gson();
   private static BiConsumer<Integer, String> f_24571 = Class_ihGZO2ZUujXpOL3n::m_7300;
   private static Class_XW95mdWXA8ASk6kb f_24572;
   private static Runnable f_24573;
   private static boolean f_24574;
   private static JsonObject f_24575;
   private static Class_UKD8vq1GEiDw5nq3 f_24576;

   public static void m_7298(BiConsumer<Integer, String> var0) {
      f_24571 = var0;
   }

   public static boolean m_7299() {
      return f_24572 != null;
   }

   private static void m_7300(int var0, String var1) {
      System.err.println("Discord IPC error " + var0 + " with message: " + var1);
   }

   private static int m_7301() {
      String var0 = ManagementFactory.getRuntimeMXBean().getName();
      return Integer.parseInt(var0.substring(0, var0.indexOf(64)));
   }

   private static void m_7302() {
      JsonObject var0 = new JsonObject();
      var0.addProperty("pid", m_7301());
      var0.add("activity", f_24575);
      JsonObject var1 = new JsonObject();
      var1.addProperty("cmd", "SET_ACTIVITY");
      var1.add("args", var0);
      f_24572.m_5553(Class_1oU4qUSx9Czt18UL.Frame, var1);
      f_24575 = null;
   }

   private static void m_7303(Class_ymYHP3lFP8sH2Qwx var0) {
      if (var0.opcode() == Class_1oU4qUSx9Czt18UL.Close) {
         if (f_24571 != null) {
            f_24571.accept(var0.data().get("code").getAsInt(), var0.data().get("message").getAsString());
         }

         m_7307();
      } else if (var0.opcode() == Class_1oU4qUSx9Czt18UL.Frame) {
         if (var0.data().has("evt") && var0.data().get("evt").getAsString().equals("ERROR")) {
            JsonObject var1 = var0.data().getAsJsonObject("data");
            if (f_24571 != null) {
               f_24571.accept(var1.get("code").getAsInt(), var1.get("message").getAsString());
            }
         } else if (var0.data().has("cmd") && var0.data().get("cmd").getAsString().equals("DISPATCH")) {
            f_24574 = true;
            f_24576 = (Class_UKD8vq1GEiDw5nq3)f_24570.fromJson(var0.data().getAsJsonObject("data").getAsJsonObject("user"), Class_UKD8vq1GEiDw5nq3.class);
            if (f_24573 != null) {
               f_24573.run();
            }

            if (f_24575 != null) {
               m_7302();
            }
         }
      }
   }

   public static Class_UKD8vq1GEiDw5nq3 m_7304() {
      return f_24576;
   }

   public static void m_7305(Class_nqIPwf7m22Ne6Hwn var0) {
      if (f_24572 != null) {
         f_24575 = var0.m_2880();
         if (f_24574) {
            m_7302();
         }
      }
   }

   public static boolean m_7306(long var0, Runnable var2) {
      f_24572 = Class_XW95mdWXA8ASk6kb.m_5552(Class_ihGZO2ZUujXpOL3n::m_7303);
      if (f_24572 == null) {
         return false;
      }

      f_24573 = var2;
      JsonObject var3 = new JsonObject();
      var3.addProperty("v", 1);
      var3.addProperty("client_id", Long.toString(var0));
      f_24572.m_5553(Class_1oU4qUSx9Czt18UL.Handshake, var3);
      return true;
   }

   public static void m_7307() {
      if (f_24572 != null) {
         f_24572.m_1980();
         f_24572 = null;
         f_24573 = null;
         f_24574 = false;
         f_24575 = null;
         f_24576 = null;
      }
   }
}
