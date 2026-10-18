package dev.dimasik.client.system;

import lombok.Generated;
import net.minecraft.resources.Identifier;

public final class Class_wHRRCm2tlLY7DN4I {
   private static final String f_34360 = "dimasik";
   private static final String f_34361 = "dimasik";
   private static final String f_34362 = "dimasik";
   private static final String f_34363 = "This is a utility class and cannot be instantiated";

   public static Identifier m_9310(String var0) {
      String path = var0.startsWith("fonts/") ? var0 : "fonts/" + var0;
      return Identifier.fromNamespaceAndPath(f_34361, path);
   }

   @Generated
   private Class_wHRRCm2tlLY7DN4I() {
      throw new UnsupportedOperationException(f_34363);
   }

   public static Identifier m_9311(String var0) {
      String path = var0.startsWith("images/") ? var0 : "images/" + var0;
      if (!path.endsWith(".png")) {
         path = path + ".png";
      }
      return Identifier.fromNamespaceAndPath(f_34362, path);
   }

   public static Identifier m_9312(String var0) {
      String path = var0.startsWith("core/") ? var0 : "core/" + var0;
      return Identifier.fromNamespaceAndPath(f_34360, path);
   }
}
