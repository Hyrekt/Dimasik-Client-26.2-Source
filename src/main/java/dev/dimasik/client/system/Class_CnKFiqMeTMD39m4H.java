package dev.dimasik.client.system;

import com.mojang.blaze3d.platform.InputConstants;
import dev.dimasik.client.DimasikClient;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.network.chat.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Class_CnKFiqMeTMD39m4H implements Class_NzJrN63M7QBpmAbi {
   private static final Logger f_6290 = LoggerFactory.getLogger(Class_CnKFiqMeTMD39m4H.f_6303);
   private static Class_CnKFiqMeTMD39m4H f_6291;
   private final Class_rKigBcd41TJyzS0H f_6292 = new Class_rKigBcd41TJyzS0H();
   private final Class_FDIjwAsPHVABPHnJ f_6293 = new Class_FDIjwAsPHVABPHnJ();
   private Class_Ja79cp8QmiWLo2Xv f_6294;
   private Class_RbvmfdZGDKvZ8eBF f_6295;
   private ClientLevel f_6296;
   private boolean f_6297;
   private boolean f_6298;
   private boolean f_6299;
   private boolean f_6300;
   private static final String f_6301 = "ONNX Aim initialized: rate={} Hz, sequence={}, horizon={}, features={}";
   private static final String f_6302 = "выключен";
   private static final String f_6303 = "standalone-onnx-aim-60hz";

   private void m_2432(float var1) {
      if (this.f_6297
         && f_11537.player != null
         && f_11537.level != null
         && f_11537.gui.screen() == null
         && f_11537.isWindowActive()
         && f_11537.mouseHandler.isMouseGrabbed()) {
         long var2 = System.nanoTime();
         if (DimasikClient.m_9057().m_9049().m_2801().m_3576().m_1114() instanceof AbstractClientPlayer var4) {
            this.f_6295.m_4518(var4, var1, var2);
         } else {
            this.f_6295.m_4508();
         }
      } else {
         this.m_2442();
      }
   }

   private void m_2433() {
      boolean var1 = InputConstants.isKeyDown(f_11537.getWindow(), 295);
      boolean var2 = InputConstants.isKeyDown(f_11537.getWindow(), 298);
      if (var1 && !this.f_6298) {
         this.m_2441();
      }

      if (var2 && !this.f_6299) {
         this.m_2438();
      }

      this.f_6298 = var1;
      this.f_6299 = var2;
   }

   private void m_2434(String var1) {
      if (f_11537.player != null) {
         f_11537.player.sendOverlayMessage(Component.literal(var1 + ""));
      }
   }

   public static void m_2435(float var0) {
      Class_CnKFiqMeTMD39m4H var1 = f_6291;
      if (var1 != null) {
         var1.m_2432(var0);
      }
   }

   public void m_2436() {
      this.f_6297 = false;
      if (this.f_6295 != null) {
         this.f_6295.close();
      }

      if (f_6291 == this) {
         f_6291 = null;
      }
   }

   public void m_2437() {
      f_6291 = this;
      this.m_2440(false);
      f_6290.info(f_6301, new Object[]{60, 60, 15, Class_WvVvQwpWLdnJMMi9.f_15738});
   }

   private void m_2438() {
      boolean var1 = this.f_6297;
      this.f_6297 = false;
      this.m_2440(var1);
      this.m_2434(this.f_6295.m_4517() ? this.f_6295.m_4523() + "" : this.f_6295.m_4519() + "");
   }

   public void m_2439() {
      this.m_2433();
      if (f_11537.level != this.f_6296) {
         this.f_6296 = f_11537.level;
         this.m_2442();
      }
   }

   private void m_2440(boolean var1) {
      if (this.f_6295 != null) {
         this.f_6295.close();
      }

      this.f_6294 = Class_Ja79cp8QmiWLo2Xv.m_3333(f_6290);
      this.f_6295 = new Class_RbvmfdZGDKvZ8eBF(this.f_6294, f_6290);
      boolean var2 = this.f_6295.m_4522();
      this.f_6297 = var2 && (var1 || this.f_6294.f_9953);
      this.m_2442();
   }

   private void m_2441() {
      if (this.f_6297) {
         this.f_6297 = false;
         this.m_2442();
         this.m_2434(f_6302);
      } else if (!this.f_6295.m_4517() && !this.f_6295.m_4522()) {
         this.m_2434(this.f_6295.m_4519() + "");
      } else {
         this.f_6297 = true;
         this.m_2442();
         this.m_2434(this.f_6295.m_4523() + "");
      }
   }

   private void m_2442() {
      this.f_6292.m_8426();
      this.f_6293.m_2593();
      this.f_6300 = false;
      if (this.f_6295 != null) {
         this.f_6295.m_4508();
      }
   }
}
