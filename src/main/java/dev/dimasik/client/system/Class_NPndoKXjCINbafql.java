package dev.dimasik.client.system;

import net.fabricmc.loader.api.FabricLoader;

public final class Class_NPndoKXjCINbafql {
   private static volatile boolean f_11522;
   private static volatile boolean f_11523;
   private static volatile boolean f_11524;
   private static final String f_11525 = "voicechat";
   private static final String f_11526 = "voicechat_api";

   public static boolean m_4014() {
      return f_11524;
   }

   private Class_NPndoKXjCINbafql() {
   }

   public static boolean m_4015() {
      return f_11523;
   }

   public static void m_4016(boolean var0) {
      f_11522 = var0;
      if (!var0) {
         f_11523 = false;
         f_11524 = false;
      }
   }

   public static void m_4017(boolean var0) {
      f_11524 = var0;
   }

   public static boolean m_4018() {
      FabricLoader var0 = FabricLoader.getInstance();
      return var0.isModLoaded(f_11525) && var0.isModLoaded(f_11526);
   }

   public static boolean m_4019() {
      return m_4018() && f_11522 && f_11523 && !f_11524;
   }

   public static boolean m_4020() {
      return f_11522;
   }

   public static void m_4021(boolean var0) {
      f_11523 = var0;
      if (!var0) {
         f_11524 = false;
      }
   }
}
