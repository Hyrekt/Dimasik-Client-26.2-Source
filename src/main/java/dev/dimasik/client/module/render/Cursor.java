package dev.dimasik.client.module.render;

import com.mojang.blaze3d.platform.NativeImage;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Optional;
import net.minecraft.server.packs.resources.Resource;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public class Cursor extends Module {
   private static final int f_2688 = 18;
   private static final int f_2689 = 1;
   private long f_2690 = 0L;
   private boolean f_2691;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_2692 = this::m_1528;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo.LeCf1iKfPVPci6zr> f_2693 = this::m_1530;
   private static final String f_2694 = "Cursor";
   private static final String f_2695 = "Курсор красной морды";
   private static final String f_2696 = "gui/cursor";
   private static final int f_2697 = 208897;
   private static final int f_2698 = 212993;

   private void m_1527() {
      if (f_11537.getWindow() != null) {
         GLFW.glfwSetCursor(f_11537.getWindow().handle(), 0L);
      }
   }

   @Override
   public void m_732() {
      this.m_1527();
   }

   private void m_1528(Class_Xu9btcIeUN33XnMK var1) {
      this.m_1531();
      this.m_1529();
   }

   public Cursor() {
      super(f_2694, f_2695, Category.RENDER);
   }

   private void m_1529() {
      if (this.f_2690 != 0L && f_11537.getWindow() != null) {
         long var1 = f_11537.getWindow().handle();
         if (f_11537.gui.screen() != null && GLFW.glfwGetInputMode(var1, f_2697) == f_2698) {
            GLFW.glfwSetCursor(var1, this.f_2690);
         }
      }
   }

   @Override
   public void m_778() {
      this.m_1531();
      this.m_1529();
   }

   private void m_1530(Class_bhRaN0YSSLQRYjPo.LeCf1iKfPVPci6zr var1) {
      this.m_1531();
      this.m_1529();
   }

   private void m_1531() {
      if (!this.f_2691 && this.f_2690 == 0L) {
         if (f_11537.getWindow() != null && f_11537.getResourceManager() != null) {
            this.f_2691 = true;

            try {
               Optional var1 = f_11537.getResourceManager().getResource(Class_wHRRCm2tlLY7DN4I.m_9311(f_2696));
               if (var1.isEmpty()) {
                  return;
               }

               try (InputStream var2 = ((Resource)var1.get()).open()) {
                  NativeImage var3 = NativeImage.read(var2);

                  try {
                     int var4 = var3.getWidth();
                     int var5 = var3.getHeight();
                     ByteBuffer var6 = MemoryUtil.memAlloc(var4 * var5 * 4);

                     try {
                        for (int var7 = 0; var7 < var5; var7++) {
                           for (int var8 = 0; var8 < var4; var8++) {
                              int var9 = var3.getPixel(var8, var7);
                              var6.put((byte)(var9 >> 16 & 0xFF));
                              var6.put((byte)(var9 >> 8 & 0xFF));
                              var6.put((byte)(var9 & 0xFF));
                              var6.put((byte)(var9 >> 24 & 0xFF));
                           }
                        }

                        var6.flip();
                        MemoryStack var27 = MemoryStack.stackPush();

                        try {
                           GLFWImage var28 = GLFWImage.malloc(var27);
                           var28.set(var4, var5, var6);
                           this.f_2690 = GLFW.glfwCreateCursor(var28, 18, 1);
                        } catch (Throwable var22) {
                           if (var27 != null) {
                              try {
                                 var27.close();
                              } catch (Throwable var21) {
                                 var22.addSuppressed(var21);
                              }
                           }

                           throw var22;
                        }

                        if (var27 != null) {
                           var27.close();
                        }
                     } finally {
                        MemoryUtil.memFree(var6);
                     }
                  } catch (Throwable var24) {
                     if (var3 != null) {
                        try {
                           var3.close();
                        } catch (Throwable var20) {
                           var24.addSuppressed(var20);
                        }
                     }

                     throw var24;
                  }

                  if (var3 != null) {
                     var3.close();
                  }
               }
            } catch (Throwable var26) {
               var26.printStackTrace();
               this.f_2690 = 0L;
            }
         }
      }
   }
}
