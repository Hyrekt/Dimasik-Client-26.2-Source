package dev.dimasik.client.system;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.resources.Resource;

public final class Class_isejn8Zjfd3YSXMb {
   private static final String[][] f_24591 = new String[][]{
      {Class_isejn8Zjfd3YSXMb.f_24596, Class_isejn8Zjfd3YSXMb.f_24597},
      {Class_isejn8Zjfd3YSXMb.f_24598, Class_isejn8Zjfd3YSXMb.f_24599},
      {Class_isejn8Zjfd3YSXMb.f_24600, Class_isejn8Zjfd3YSXMb.f_24601},
      {Class_isejn8Zjfd3YSXMb.f_24602, Class_isejn8Zjfd3YSXMb.f_24603},
      {Class_isejn8Zjfd3YSXMb.f_24604, Class_isejn8Zjfd3YSXMb.f_24605},
      {Class_isejn8Zjfd3YSXMb.f_24606, Class_isejn8Zjfd3YSXMb.f_24607},
      {Class_isejn8Zjfd3YSXMb.f_24608, Class_isejn8Zjfd3YSXMb.f_24609},
      {Class_isejn8Zjfd3YSXMb.f_24610, Class_isejn8Zjfd3YSXMb.f_24611},
      {Class_isejn8Zjfd3YSXMb.f_24612, Class_isejn8Zjfd3YSXMb.f_24613},
      {Class_isejn8Zjfd3YSXMb.f_24614, Class_isejn8Zjfd3YSXMb.f_24615},
      {Class_isejn8Zjfd3YSXMb.f_24616, Class_isejn8Zjfd3YSXMb.f_24617},
      {Class_isejn8Zjfd3YSXMb.f_24618, Class_isejn8Zjfd3YSXMb.f_24619},
      {Class_isejn8Zjfd3YSXMb.f_24620, Class_isejn8Zjfd3YSXMb.f_24621},
      {Class_isejn8Zjfd3YSXMb.f_24622, Class_isejn8Zjfd3YSXMb.f_24623},
      {Class_isejn8Zjfd3YSXMb.f_24624, Class_isejn8Zjfd3YSXMb.f_24625},
      {Class_isejn8Zjfd3YSXMb.f_24626, Class_isejn8Zjfd3YSXMb.f_24627},
      {Class_isejn8Zjfd3YSXMb.f_24628, Class_isejn8Zjfd3YSXMb.f_24629},
      {Class_isejn8Zjfd3YSXMb.f_24630, Class_isejn8Zjfd3YSXMb.f_24631},
      {Class_isejn8Zjfd3YSXMb.f_24632, Class_isejn8Zjfd3YSXMb.f_24633},
      {Class_isejn8Zjfd3YSXMb.f_24634, Class_isejn8Zjfd3YSXMb.f_24635},
      {Class_isejn8Zjfd3YSXMb.f_24636, Class_isejn8Zjfd3YSXMb.f_24637},
      {Class_isejn8Zjfd3YSXMb.f_24638, Class_isejn8Zjfd3YSXMb.f_24639},
      {Class_isejn8Zjfd3YSXMb.f_24640, Class_isejn8Zjfd3YSXMb.f_24641},
      {Class_isejn8Zjfd3YSXMb.f_24642, Class_isejn8Zjfd3YSXMb.f_24643}
   };
   private static final Map<String, Class_LzYTXb7R2jug6Pep> f_24592 = new LinkedHashMap<>();
   private static boolean f_24593;
   private static final String f_24594 = "dimasik";
   private static final String f_24595 = "dimasik";
   private static final String f_24596 = "chef";
   private static final String f_24597 = "Шеф-повар";
   private static final String f_24598 = "captain";
   private static final String f_24599 = "Капитан";
   private static final String f_24600 = "plumber";
   private static final String f_24601 = "Сантехник";
   private static final String f_24602 = "kings_guard";
   private static final String f_24603 = "Гвардеец";
   private static final String f_24604 = "mage";
   private static final String f_24605 = "Маг";
   private static final String f_24606 = "gibus";
   private static final String f_24607 = "Гибус";
   private static final String f_24608 = "clown_nose";
   private static final String f_24609 = "Нос клоуна";
   private static final String f_24610 = "ai_glasses";
   private static final String f_24611 = "AI-очки";
   private static final String f_24612 = "movie_shades";
   private static final String f_24613 = "Очки";
   private static final String f_24614 = "eye_patch";
   private static final String f_24615 = "Повязка";
   private static final String f_24616 = "garland";
   private static final String f_24617 = "Гирлянда";
   private static final String f_24618 = "crewmate";
   private static final String f_24619 = "Амонгус";
   private static final String f_24620 = "adventurer";
   private static final String f_24621 = "Авантюрист";
   private static final String f_24622 = "crying_baby";
   private static final String f_24623 = "Малыш";
   private static final String f_24624 = "egg_friend";
   private static final String f_24625 = "Яйцо-друг";
   private static final String f_24626 = "egged";
   private static final String f_24627 = "Яйцо";
   private static final String f_24628 = "flag";
   private static final String f_24629 = "Флаг";
   private static final String f_24630 = "funguy";
   private static final String f_24631 = "Грибок";
   private static final String f_24632 = "hellbreaker";
   private static final String f_24633 = "Визор";
   private static final String f_24634 = "magistrate";
   private static final String f_24635 = "Магистрат";
   private static final String f_24636 = "sponge";
   private static final String f_24637 = "Губка";
   private static final String f_24638 = "theater";
   private static final String f_24639 = "Театр";
   private static final String f_24640 = "master_adventurer";
   private static final String f_24641 = "Мастер-авантюрист";
   private static final String f_24642 = "ai_glasses_on";
   private static final String f_24643 = "AI-очки (вкл)";

   private Class_isejn8Zjfd3YSXMb() {
   }

   public static void m_7321() {
      f_24593 = false;
      f_24592.clear();
   }

   public static String m_7322() {
      return f_24591[0][0];
   }

   private static void m_7323() {
      if (!f_24593 || f_24592.size() != f_24591.length) {
         f_24593 = true;

         for (String[] var3 : f_24591) {
            if (!f_24592.containsKey(var3[0])) {
               Class_LzYTXb7R2jug6Pep var4 = m_7325(var3[0], var3[1]);
               if (var4 != null) {
                  f_24592.put(var4.key(), var4);
               }
            }
         }
      }
   }

   public static Class_LzYTXb7R2jug6Pep m_7324(String var0) {
      m_7323();
      return f_24592.get(var0);
   }

   private static Class_LzYTXb7R2jug6Pep m_7325(String var0, String var1) {
      Identifier var2 = Identifier.fromNamespaceAndPath(f_24594, var0 + "");
      Identifier var3 = Identifier.fromNamespaceAndPath(f_24595, var0 + "");
      Optional var4 = Minecraft.getInstance().getResourceManager().getResource(var2);
      if (var4.isEmpty()) {
         return null;
      }

      try (InputStream var5 = ((Resource)var4.get()).open()) {
         return new Class_LzYTXb7R2jug6Pep(var0, var1, var3, Class_oAq4PeD1FSXoIaXR.m_7726(var5));
      } catch (Exception var10) {
         return null;
      }
   }

   public static List<Class_LzYTXb7R2jug6Pep> m_7326() {
      m_7323();
      return new ArrayList<>(f_24592.values());
   }
}
