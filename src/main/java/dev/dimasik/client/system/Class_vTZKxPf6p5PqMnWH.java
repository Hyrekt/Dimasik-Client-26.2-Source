package dev.dimasik.client.system;

import com.mojang.blaze3d.preprocessor.GlslPreprocessor;
import com.mojang.blaze3d.shaders.ShaderSource;
import com.mojang.blaze3d.shaders.ShaderType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;
import net.minecraft.resources.Identifier;

public final class Class_vTZKxPf6p5PqMnWH {
   private static final ShaderSource f_31085 = Class_vTZKxPf6p5PqMnWH::m_8699;
   private static final String f_31086 = ".vsh";
   private static final String f_31087 = ".fsh";
   private static final String f_31088 = "/";
   private static final String f_31089 = ".";
   private static final String f_31090 = "..";
   private static final String f_31091 = "Shader path escapes its namespace";
   private static final String f_31092 = "/";

   private static String m_8697(String var0) {
      ArrayDeque var1 = new ArrayDeque();

      for (String var5 : var0.replace('\\', '/').split(f_31088)) {
         if (!var5.isEmpty() && !var5.equals(f_31089)) {
            if (var5.equals(f_31090)) {
               if (var1.isEmpty()) {
                  throw new IllegalArgumentException(f_31091);
               }

               var1.removeLast();
            } else {
               var1.addLast(var5);
            }
         }
      }

      return String.join(f_31092, var1);
   }

   public static ShaderSource m_8698() {
      return f_31085;
   }

   private Class_vTZKxPf6p5PqMnWH() {
   }

   private static String m_8699(final Identifier var0, ShaderType var1) {
      String var2 = var1 == ShaderType.VERTEX ? f_31086 : f_31087;
      String var3 = m_8697(var0.getPath() + var2);
      String var4 = m_8700(var0.getNamespace(), var3);
      if (var4 == null) {
         return null;
      }

      int var5 = var3.lastIndexOf(47);
      final String var6 = var5 < 0 ? "" : var3.substring(0, var5 + 1);
      GlslPreprocessor var7 = new GlslPreprocessor() {
         public final Set<String> f_34154 = new HashSet<>();

         public String applyImport(boolean var1, String var2x) {
            Identifier var3x;
            String var4x;
            try {
               if (var1) {
                  var3x = var0;
                  var4x = Class_vTZKxPf6p5PqMnWH.m_8697(var6 + var2x);
               } else {
                  var3x = Identifier.parse(var2x);
                  var4x = Class_vTZKxPf6p5PqMnWH.m_8697("include/" + var3x.getPath());
               }
            } catch (RuntimeException var7x) {
               return var7x.getMessage() + "";
            }

            String var5x = var3x.getNamespace() + ":shaders/" + var4x;
            if (!this.f_34154.add(var5x)) {
               return null;
            }

            String var6x = Class_vTZKxPf6p5PqMnWH.m_8700(var3x.getNamespace(), var4x);
            return var6x == null ? "#error Missing GLSL import " + var5x : var6x;
         }
      };
      return Class_RzDLx31sJx5BAYMk.m_4659(var0, String.join("", var7.process(var4)));
   }

   private static String m_8700(String var0, String var1) {
      String var2 = "/assets/" + var0 + "/shaders/" + var1;
      InputStream var3 = Class_vTZKxPf6p5PqMnWH.class.getResourceAsStream(var2);
      if (var3 == null) {
         try {
            var rm = net.minecraft.client.Minecraft.getInstance().getResourceManager();
            if (rm != null) {
               Identifier id = Identifier.fromNamespaceAndPath(var0, "shaders/" + var1);
               var res = rm.getResource(id);
               if (res.isPresent()) {
                  var3 = res.get().open();
               }
            }
         } catch (Throwable ignored) {
         }
      }

      if (var3 == null) {
         return null;
      }

      try (InputStream stream = var3; InputStream var4 = Class_yat3STEywmb0lNb5.m_9683(stream, var0 + ":shaders/" + var1)) {
         return new String(var4.readAllBytes(), StandardCharsets.UTF_8);
      } catch (IOException | GeneralSecurityException var11) {
         return null;
      }
   }
}
