package dev.dimasik.client.system;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.resources.Identifier;

public final class Class_RzDLx31sJx5BAYMk {
   private static final String f_12920 = "dimasik";
   private static final String f_12921 = "#version";
   private static final String f_12922 = "(value)";
   private static final String f_12923 = "((value) * 2.0 - 1.0)";

   private Class_RzDLx31sJx5BAYMk() {
   }

   public static String m_4659(Identifier var0, String var1) {
      if (var1 != null && var0.getNamespace().equals(f_12920)) {
         int var2 = var1.indexOf(f_12921);
         int var3 = var2 < 0 ? -1 : var1.indexOf(10, var2);
         if (var3 < 0) {
            return var1;
         }

         String var4 = RenderSystem.getDevice().getDeviceInfo().isZZeroToOne() ? f_12922 : f_12923;
         return var1.substring(0, var3 + 1) + "#define DIMASIK_DEPTH_TO_CLIP(value) " + var4 + "\n" + var1.substring(var3 + 1);
      } else {
         return var1;
      }
   }
}
