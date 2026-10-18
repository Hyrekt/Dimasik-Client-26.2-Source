package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;

public final class Class_rsrLB4fiDOF3z0YM {
   private static boolean f_30364;
   private static Class_WzvV6cpDDR1F4aeD f_30365 = Class_WzvV6cpDDR1F4aeD.ANGEL;
   private static boolean f_30366;
   private static boolean f_30367 = true;
   private static boolean f_30368 = true;
   private static boolean f_30369 = true;
   private static Class_m52tuSNQY8S356Ab f_30370 = Class_m52tuSNQY8S356Ab.ABOMINABLE_BLADE;
   private static Class_m52tuSNQY8S356Ab f_30371 = Class_m52tuSNQY8S356Ab.ABOMINABLE_BLADE;
   private static boolean f_30372;
   private static String f_30373 = Class_isejn8Zjfd3YSXMb.m_7322();
   private static boolean f_30374;
   private static Class_MTimUzoN9N9ZQr5T f_30375 = Class_MTimUzoN9N9ZQr5T.SMILING_SUNGLASSES;
   private static boolean f_30376;
   private static Class_LdeJaBYCxAYq5SO6 f_30377 = Class_LdeJaBYCxAYq5SO6.LEATHER;
   private static boolean f_30378;
   private static final Map<Class_HSD91zSgdqsM5q0d, String> f_30379 = new EnumMap<>(Class_HSD91zSgdqsM5q0d.class);
   private static final EnumSet<Class_HSD91zSgdqsM5q0d> f_30380 = EnumSet.noneOf(Class_HSD91zSgdqsM5q0d.class);
   private static final EnumSet<Class_HSD91zSgdqsM5q0d> f_30381 = EnumSet.noneOf(Class_HSD91zSgdqsM5q0d.class);
   private static final Map<Class_HSD91zSgdqsM5q0d, Class_w8fCJQ5ZtH5lQbWc> f_30382 = new EnumMap<>(Class_HSD91zSgdqsM5q0d.class);
   private static final Class_w8fCJQ5ZtH5lQbWc f_30383 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, Class_rsrLB4fiDOF3z0YM.f_30391, Class_eXr9Fra2ad3yFXY8.f_19100);
   private static final Class_w8fCJQ5ZtH5lQbWc f_30384 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, Class_rsrLB4fiDOF3z0YM.f_30392, Class_eXr9Fra2ad3yFXY8.f_19100);
   private static final Class_w8fCJQ5ZtH5lQbWc f_30385 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, Class_rsrLB4fiDOF3z0YM.f_30393, Class_eXr9Fra2ad3yFXY8.f_19100);
   private static final Class_w8fCJQ5ZtH5lQbWc f_30386 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, Class_rsrLB4fiDOF3z0YM.f_30394, Class_eXr9Fra2ad3yFXY8.f_19100);
   private static final Class_w8fCJQ5ZtH5lQbWc f_30387 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, Class_rsrLB4fiDOF3z0YM.f_30395, Class_eXr9Fra2ad3yFXY8.f_19100);
   private static final String f_30388 = "@";
   private static final String f_30389 = "@";
   private static final float f_30390 = 8.0F;
   private static final float f_30391 = 8.0F;
   private static final float f_30392 = 8.0F;
   private static final float f_30393 = 8.0F;
   private static final float f_30394 = 8.0F;
   private static final float f_30395 = 8.0F;

   public static boolean m_8468() {
      return f_30376;
   }

   public static boolean m_8469() {
      return f_30364;
   }

   public static void m_8470() {
      f_30364 = !f_30364;
   }

   public static void m_8471(Class_HSD91zSgdqsM5q0d var0) {
      f_30379.remove(var0);
      f_30380.remove(var0);
   }

   public static String m_8472(Class_HSD91zSgdqsM5q0d var0) {
      return f_30379.get(var0);
   }

   public static boolean m_8473(Class_HSD91zSgdqsM5q0d var0) {
      return f_30380.contains(var0);
   }

   public static boolean m_8474() {
      return f_30369;
   }

   public static float m_8475(Class_HSD91zSgdqsM5q0d var0) {
      return switch (var0) {
         case HATS -> m_8493();
         case MASKS -> m_8509();
         case WINGS -> m_8490();
         case BACKPACKS -> m_8491();
         case PETS -> m_8519();
         case EARS, TAILS, PAWS, STOCKINGS, HEADS -> m_8511(var0);
      };
   }

   public static void m_8476(Class_CaVoGy5a20MKv97j var0) {
      if (var0 != null) {
         m_8523(var0.category(), var0.name());
      }
   }

   public static Class_CaVoGy5a20MKv97j m_8477(Player var0, Class_HSD91zSgdqsM5q0d var1) {
      Minecraft var2 = Minecraft.getInstance();
      if (var2.player != null && !var0.getUUID().equals(var2.player.getUUID())) {
         Class_s9VSzIQN9qIany9o var3 = Class_zZgIgQUpIcqCwBUw.m_9905().m_9923(var0.getUUID(), var0.getGameProfile().name());
         if (var3 != null && var3.valid()) {
            String var4 = var3.models().get(var1.m_2888());
            return var4 != null && !var4.startsWith(f_30388) ? Class_YaEsaeS2vWKCkc5L.m_5698(var1, var4) : null;
         } else {
            return null;
         }
      } else {
         return m_8473(var1) && m_8480(var1) ? m_8516(var1) : null;
      }
   }

   public static boolean m_8478() {
      return f_30367;
   }

   public static boolean m_8479() {
      return f_30378;
   }

   public static boolean m_8480(Class_HSD91zSgdqsM5q0d var0) {
      return switch (var0) {
         case HATS -> f_30372;
         case MASKS -> f_30374;
         case WINGS -> f_30364;
         case BACKPACKS -> f_30376;
         case PETS -> f_30378;
         case EARS, TAILS, PAWS, STOCKINGS, HEADS -> f_30381.contains(var0);
      };
   }

   public static Class_m52tuSNQY8S356Ab m_8481() {
      return f_30370;
   }

   public static void m_8482(Class_m52tuSNQY8S356Ab var0) {
      if (var0 != null) {
         f_30371 = var0;
      }
   }

   public static Class_m52tuSNQY8S356Ab m_8483() {
      return f_30371;
   }

   public static Class_WzvV6cpDDR1F4aeD m_8484() {
      return f_30365;
   }

   public static void m_8485(boolean var0) {
      f_30367 = var0;
   }

   public static void m_8486(Class_m52tuSNQY8S356Ab var0) {
      f_30370 = var0;
   }

   public static void m_8487(boolean var0) {
      f_30369 = var0;
   }

   public static Class_m52tuSNQY8S356Ab m_8488() {
      return f_30370;
   }

   public static boolean m_8489(Player var0, Minecraft var1) {
      if (var1.player != null && var0.getUUID().equals(var1.player.getUUID())) {
         return f_30367;
      }

      if (m_8500(var0)) {
         return true;
      }

      boolean var2 = DimasikClient.m_9057() != null
         && DimasikClient.m_9057().m_9049() != null
         && DimasikClient.m_9057().m_9049().m_2804().m_2877(var0.getGameProfile().name());
      return var2 ? f_30368 : f_30369;
   }

   public static float m_8490() {
      f_30383.m_9283(f_30364 ? 1.0F : 0.0F);
      return f_30383.m_9288();
   }

   public static float m_8491() {
      f_30386.m_9283(f_30376 ? 1.0F : 0.0F);
      return f_30386.m_9288();
   }

   public static void m_8492(boolean var0) {
      f_30368 = var0;
   }

   public static float m_8493() {
      f_30384.m_9283(f_30372 ? 1.0F : 0.0F);
      return f_30384.m_9288();
   }

   public static void m_8494(Class_m52tuSNQY8S356Ab var0) {
      if (var0 != null) {
         f_30370 = var0;
      }
   }

   public static void m_8495(boolean var0) {
      f_30374 = var0;
   }

   public static boolean m_8496() {
      return f_30366;
   }

   public static boolean m_8497() {
      return f_30368;
   }

   public static Class_s9VSzIQN9qIany9o m_8498() {
      HashMap var0 = new HashMap();

      for (Class_HSD91zSgdqsM5q0d var4 : Class_HSD91zSgdqsM5q0d.values()) {
         if (m_8480(var4) && m_8473(var4)) {
            String var5 = m_8472(var4);
            if (var5 != null && !var5.isBlank()) {
               var0.put(var4.m_2888(), var5);
            }
         }
      }

      if (f_30364 && !m_8473(Class_HSD91zSgdqsM5q0d.WINGS)) {
         var0.put(Class_HSD91zSgdqsM5q0d.WINGS.m_2888(), f_30365.name() + "");
      }

      if (f_30372 && !m_8473(Class_HSD91zSgdqsM5q0d.HATS)) {
         var0.put(Class_HSD91zSgdqsM5q0d.HATS.m_2888(), f_30373 + "");
      }

      if (f_30374 && !m_8473(Class_HSD91zSgdqsM5q0d.MASKS)) {
         var0.put(Class_HSD91zSgdqsM5q0d.MASKS.m_2888(), f_30375.name() + "");
      }

      if (f_30376 && !m_8473(Class_HSD91zSgdqsM5q0d.BACKPACKS)) {
         var0.put(Class_HSD91zSgdqsM5q0d.BACKPACKS.m_2888(), f_30377.name() + "");
      }

      return new Class_s9VSzIQN9qIany9o(1, Map.copyOf(var0));
   }

   private Class_rsrLB4fiDOF3z0YM() {
   }

   public static boolean m_8499() {
      return f_30372;
   }

   public static boolean m_8500(Player var0) {
      Minecraft var1 = Minecraft.getInstance();
      return var1.player != null
         && !var0.getUUID().equals(var1.player.getUUID())
         && Class_zZgIgQUpIcqCwBUw.m_9905().m_9923(var0.getUUID(), var0.getGameProfile().name()) != null;
   }

   public static String m_8501(Player var0, Class_HSD91zSgdqsM5q0d var1) {
      Minecraft var2 = Minecraft.getInstance();
      if (var2.player != null && !var0.getUUID().equals(var2.player.getUUID())) {
         Class_s9VSzIQN9qIany9o var3 = Class_zZgIgQUpIcqCwBUw.m_9905().m_9923(var0.getUUID(), var0.getGameProfile().name());
         if (var3 != null && var3.valid()) {
            String var4 = var3.models().get(var1.m_2888());
            return var4 != null && var4.startsWith(f_30389) ? var4.substring(1) : null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public static void m_8502(Class_LdeJaBYCxAYq5SO6 var0) {
      if (var0 != null) {
         f_30377 = var0;
         f_30380.remove(Class_HSD91zSgdqsM5q0d.BACKPACKS);
      }
   }

   public static void m_8503(boolean var0) {
      f_30376 = var0;
   }

   public static void m_8504(Class_WzvV6cpDDR1F4aeD var0) {
      f_30365 = var0;
      f_30380.remove(Class_HSD91zSgdqsM5q0d.WINGS);
   }

   public static void m_8505(Class_MTimUzoN9N9ZQr5T var0) {
      if (var0 != null) {
         f_30375 = var0;
         f_30380.remove(Class_HSD91zSgdqsM5q0d.MASKS);
      }
   }

   public static String m_8506() {
      return f_30366 ? f_30370.m_7577() : "";
   }

   public static void m_8507(boolean var0) {
      f_30366 = var0;
   }

   public static boolean m_8508() {
      return f_30374;
   }

   public static float m_8509() {
      f_30385.m_9283(f_30374 ? 1.0F : 0.0F);
      return f_30385.m_9288();
   }

   public static Class_MTimUzoN9N9ZQr5T m_8510() {
      return f_30375;
   }

   private static float m_8511(Class_HSD91zSgdqsM5q0d var0) {
      Class_w8fCJQ5ZtH5lQbWc var1 = f_30382.computeIfAbsent(var0, var0x -> new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_30390, Class_eXr9Fra2ad3yFXY8.f_19100));
      var1.m_9283(f_30381.contains(var0) ? 1.0F : 0.0F);
      return var1.m_9288();
   }

   public static String m_8512() {
      return f_30373;
   }

   public static void m_8513(Class_HSD91zSgdqsM5q0d var0, boolean var1) {
      switch (var0) {
         case HATS:
            m_8521(var1);
            break;
         case MASKS:
            m_8495(var1);
            break;
         case WINGS:
            m_8514(var1);
            break;
         case BACKPACKS:
            m_8503(var1);
            break;
         case PETS:
            m_8520(var1);
            break;
         case EARS:
         case TAILS:
         case PAWS:
         case STOCKINGS:
         case HEADS:
            if (var1) {
               f_30381.add(var0);
            } else {
               f_30381.remove(var0);
            }
      }
   }

   public static void m_8514(boolean var0) {
      f_30364 = var0;
   }

   public static boolean m_8515(Player var0, Minecraft var1) {
      return !f_30364 ? false : m_8489(var0, var1);
   }

   public static Class_CaVoGy5a20MKv97j m_8516(Class_HSD91zSgdqsM5q0d var0) {
      String var1 = f_30379.computeIfAbsent(var0, Class_YaEsaeS2vWKCkc5L::m_5696);
      Class_CaVoGy5a20MKv97j var2 = Class_YaEsaeS2vWKCkc5L.m_5698(var0, var1);
      if (var2 != null) {
         return var2;
      }

      String var3 = Class_YaEsaeS2vWKCkc5L.m_5696(var0);
      f_30379.put(var0, var3);
      return Class_YaEsaeS2vWKCkc5L.m_5698(var0, var3);
   }

   public static Class_LdeJaBYCxAYq5SO6 m_8518() {
      return f_30377;
   }

   public static float m_8519() {
      f_30387.m_9283(f_30378 ? 1.0F : 0.0F);
      return f_30387.m_9288();
   }

   public static void m_8520(boolean var0) {
      f_30378 = var0;
   }

   public static void m_8521(boolean var0) {
      f_30372 = var0;
   }

   public static void m_8522(String var0) {
      if (Class_isejn8Zjfd3YSXMb.m_7324(var0) != null) {
         f_30373 = var0;
         f_30380.remove(Class_HSD91zSgdqsM5q0d.HATS);
      }
   }

   public static void m_8523(Class_HSD91zSgdqsM5q0d var0, String var1) {
      if (var0 != null && var1 != null && !var1.isEmpty()) {
         f_30379.put(var0, var1);
         f_30380.add(var0);
      }
   }
}
