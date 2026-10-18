package dev.dimasik.client.system;

import com.mojang.blaze3d.platform.NativeImage;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.resources.ResourceManager;

public final class Class_io22eRA7pjGbGIOA {
   private static final int f_24577 = 1;
   private final Identifier f_24578;
   private final int f_24579;
   private final DynamicTexture f_24580;
   private final Map<Identifier, Class_io22eRA7pjGbGIOA.RPbo2rllLQHpk88Z> f_24581 = new HashMap<>();
   private final Set<Identifier> f_24582 = ConcurrentHashMap.newKeySet();
   private final Set<Identifier> f_24583 = ConcurrentHashMap.newKeySet();
   private final Queue<Class_io22eRA7pjGbGIOA.fPU1goBSdykyZjry> f_24584 = new ConcurrentLinkedQueue<>();
   private final ExecutorService f_24585 = Executors.newSingleThreadExecutor(var0 -> {
      Thread var1x = new Thread(var0, f_24590);
      var1x.setDaemon(true);
      return var1x;
   });
   private int f_24586 = 1;
   private int f_24587 = 1;
   private int f_24588;
   private static final String f_24589 = "Atlas full";
   private static final String f_24590 = "Atlas-Loader";

   private Class_io22eRA7pjGbGIOA.RdkIKvWNvkaMgg1G m_7313(int var1, int var2) {
      if (this.f_24586 + var1 + 1 > this.f_24579) {
         this.f_24586 = 1;
         this.f_24587 = this.f_24587 + this.f_24588 + 1;
         this.f_24588 = 0;
      }

      if (this.f_24587 + var2 + 1 > this.f_24579) {
         throw new IllegalStateException(f_24589);
      }

      Class_io22eRA7pjGbGIOA.RdkIKvWNvkaMgg1G var3 = new Class_io22eRA7pjGbGIOA.RdkIKvWNvkaMgg1G(this.f_24586, this.f_24587);
      this.f_24586 += var1 + 1;
      this.f_24588 = Math.max(this.f_24588, var2);
      return var3;
   }

   public Identifier m_7314() {
      return this.f_24578;
   }

   public Class_io22eRA7pjGbGIOA.RPbo2rllLQHpk88Z m_7316(Identifier var1) {
      Class_io22eRA7pjGbGIOA.RPbo2rllLQHpk88Z var2 = this.f_24581.get(var1);
      if (var2 != null || this.f_24583.contains(var1)) {
         return var2;
      }

      if (!this.f_24582.add(var1)) {
         return null;
      }

      ResourceManager var3 = Minecraft.getInstance().getResourceManager();
      this.f_24585.execute(() -> {
         try (
            InputStream var3x = var3.open(var1);
            InputStream var4 = Class_yat3STEywmb0lNb5.m_9683(var3x, var1.toString());
         ) {
            this.f_24584.add(new Class_io22eRA7pjGbGIOA.fPU1goBSdykyZjry(var1, NativeImage.read(var4)));
         } catch (Exception var11) {
            this.f_24583.add(var1);
            this.f_24582.remove(var1);
         }
      });
      return null;
   }

   public Class_io22eRA7pjGbGIOA(Identifier var1, int var2) {
      this.f_24578 = var1;
      this.f_24579 = var2;
      this.f_24580 = new DynamicTexture(var1.toString(), var2, var2, false);
      NativeImage var3 = this.f_24580.getPixels();
      if (var3 != null) {
         var3.fillRect(0, 0, var2, var2, 0);
      }

      this.f_24580.upload();
      Minecraft.getInstance().getTextureManager().register(var1, this.f_24580);
   }

   public DynamicTexture m_7318() {
      return this.f_24580;
   }

   public void m_7319() {
      this.f_24585.shutdownNow();

      Class_io22eRA7pjGbGIOA.fPU1goBSdykyZjry var1;
      while ((var1 = this.f_24584.poll()) != null) {
         var1.image().close();
      }

      Minecraft.getInstance().getTextureManager().release(this.f_24578);
   }

   public void m_7320(int var1) {
      if (!this.f_24584.isEmpty()) {
         for (int var2 = 0; var2 < var1; var2++) {
            Class_io22eRA7pjGbGIOA.fPU1goBSdykyZjry var3 = this.f_24584.poll();
            if (var3 == null) {
               return;
            }

            try {
               NativeImage var4 = var3.image();

               try {
                  int var5 = var4.getWidth();
                  int var6 = var4.getHeight();
                  Class_io22eRA7pjGbGIOA.RdkIKvWNvkaMgg1G var7 = this.m_7313(var5, var6);
                  RenderSystem.getDevice().createCommandEncoder().writeToTexture(this.f_24580.getTexture(), var4, 0, 0, var7.x(), var7.y());
                  this.f_24581
                     .put(
                        var3.m_7312(),
                        new Class_io22eRA7pjGbGIOA.RPbo2rllLQHpk88Z(
                           (float)var7.x() / this.f_24579,
                           (float)var7.y() / this.f_24579,
                           (float)(var7.x() + var5) / this.f_24579,
                           (float)(var7.y() + var6) / this.f_24579,
                           var5,
                           var6
                        )
                     );
               } catch (Throwable var14) {
                  if (var4 != null) {
                     try {
                        var4.close();
                     } catch (Throwable var13) {
                        var14.addSuppressed(var13);
                     }
                  }

                  throw var14;
               }

               if (var4 != null) {
                  var4.close();
               }
            } catch (Exception var15) {
               this.f_24583.add(var3.m_7312());
            } finally {
               this.f_24582.remove(var3.m_7312());
            }
         }
      }
   }

   public record RPbo2rllLQHpk88Z(float u0, float v0, float u1, float v1, int width, int height) {
      public float m_7308() {
         return this.u1;
      }

      public float m_7309() {
         return this.u0;
      }

      public float m_7310() {
         return this.v1;
      }

      public float m_7311() {
         return this.v0;
      }
   }

   private record RdkIKvWNvkaMgg1G(int x, int y) {
   }

   private record fPU1goBSdykyZjry(Identifier id, NativeImage image) {
      public Identifier m_7312() {
         return this.id;
      }
   }
}
