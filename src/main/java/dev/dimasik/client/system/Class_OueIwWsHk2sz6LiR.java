package dev.dimasik.client.system;

import com.mojang.blaze3d.platform.NativeImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.resources.Resource;
import org.joml.Vector4f;

public final class Class_OueIwWsHk2sz6LiR {
   private static final Map<Identifier, Class_OueIwWsHk2sz6LiR.Class_3Dfkc70kyiGhnGls> f_11652 = new HashMap<>();
   private static final Class_OueIwWsHk2sz6LiR.Class_3Dfkc70kyiGhnGls f_11653 = new Class_OueIwWsHk2sz6LiR.Class_3Dfkc70kyiGhnGls(
      Class_OueIwWsHk2sz6LiR.f_11657, Class_OueIwWsHk2sz6LiR.f_11658, Class_OueIwWsHk2sz6LiR.f_11659, Class_OueIwWsHk2sz6LiR.f_11660, 1.0F
   );
   private static final float f_11654 = 0.5F;
   private static final float f_11655 = 0.5F;
   private static final float f_11656 = 255.0F;
   private static final float f_11657 = 0.15625F;
   private static final float f_11658 = 0.15625F;
   private static final float f_11659 = 0.15625F;
   private static final float f_11660 = 0.15625F;

   private static Class_OueIwWsHk2sz6LiR.Class_3Dfkc70kyiGhnGls m_4076(Identifier var0) {
      Optional var1 = Minecraft.getInstance().getResourceManager().getResource(var0);
      if (var1.isEmpty()) {
         return f_11653;
      }

      try (InputStream var2 = ((Resource)var1.get()).open()) {
         NativeImage var3;
         Class_OueIwWsHk2sz6LiR.Class_3Dfkc70kyiGhnGls var21;
         label119: {
            var3 = NativeImage.read(var2);

            try {
               int var4 = var3.getWidth();
               int var5 = var3.getHeight();
               int var6 = (int)(var4 * f_11653.m_4075());
               int var7 = (int)(var5 * f_11653.m_4074());
               int var8 = Math.min(var4, (int)Math.ceil(var4 * (f_11653.m_4075() + f_11653.width())));
               int var9 = Math.min(var5, (int)Math.ceil(var5 * (f_11653.m_4074() + f_11653.height())));
               int var10 = var8;
               int var11 = var9;
               int var12 = var6 - 1;
               int var13 = var7 - 1;

               for (int var14 = var7; var14 < var9; var14++) {
                  for (int var15 = var6; var15 < var8; var15++) {
                     if (var3.getPixel(var15, var14) >>> 24 > 8) {
                        var10 = Math.min(var10, var15);
                        var11 = Math.min(var11, var14);
                        var12 = Math.max(var12, var15);
                        var13 = Math.max(var13, var14);
                     }
                  }
               }

               if (var12 < var10 || var13 < var11) {
                  var21 = f_11653;
                  break label119;
               }

               var21 = new Class_OueIwWsHk2sz6LiR.Class_3Dfkc70kyiGhnGls(
                  (float)var10 / var4,
                  (float)var11 / var5,
                  (float)(var12 - var10 + 1) / var4,
                  (float)(var13 - var11 + 1) / var5,
                  (float)(var12 - var10 + 1) / (var13 - var11 + 1)
               );
            } catch (Throwable var18) {
               if (var3 != null) {
                  try {
                     var3.close();
                  } catch (Throwable var17) {
                     var18.addSuppressed(var17);
                  }
               }

               throw var18;
            }

            if (var3 != null) {
               var3.close();
            }

            return var21;
         }

         if (var3 != null) {
            var3.close();
         }

         return var21;
      } catch (IOException var20) {
         return f_11653;
      }
   }

   public static void m_4077(Class_MTimUzoN9N9ZQr5T var0, float var1, float var2, float var3, float var4, float var5) {
      Class_OueIwWsHk2sz6LiR.Class_3Dfkc70kyiGhnGls var6 = f_11652.computeIfAbsent(var0.m_3891(), Class_OueIwWsHk2sz6LiR::m_4076);
      float var7 = Math.min(var3, var4 * var6.aspect());
      float var8 = var7 / var6.aspect();
      Class_Ssh31B3ljfKeWsvS.m_4806(
         var1 + (var3 - var7) * f_11654,
         var2 + (var4 - var8) * f_11655,
         var7,
         var8,
         0.0F,
         new Vector4f(var6.m_4075(), var6.m_4074(), var6.width(), var6.height()),
         Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_11656 * var5),
         var0.m_3891()
      );
   }

   private Class_OueIwWsHk2sz6LiR() {
   }

   public static void m_4078() {
      f_11652.clear();
   }

   private record Class_3Dfkc70kyiGhnGls(float u, float v, float width, float height, float aspect) {
      public float m_4074() {
         return this.v;
      }

      public float m_4075() {
         return this.u;
      }
   }
}
