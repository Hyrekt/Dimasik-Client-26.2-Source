package dev.dimasik.client.system;

import ai.onnxruntime.OrtException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.UUID;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.util.Mth;
import org.slf4j.Logger;

public final class Class_RbvmfdZGDKvZ8eBF implements Class_NzJrN63M7QBpmAbi, AutoCloseable {
   private static final long f_12494 = 50000000L;
   private static final float f_12495 = 1.5F;
   private final Class_Ja79cp8QmiWLo2Xv f_12496;
   private final Logger f_12497;
   private final Class_dSYEfAT7aJC05RrC f_12498;
   private final Deque<float[]> f_12499 = new ArrayDeque<>(60);
   private Class_wdG6LJ0JDq977Bnv f_12500;
   private Class_wdG6LJ0JDq977Bnv.rbPQ7fRer1tNKqxQ f_12501;
   private UUID f_12502;
   private float f_12503;
   private float f_12504;
   private float f_12505;
   private float f_12506;
   private float f_12507;
   private boolean f_12508;
   private long f_12509;
   private long f_12510;
   private String f_12511;
   private static final String f_12512 = "Loaded {} model from {}; input=[1,{},{}], horizon={}";
   private static final String f_12513 = "Could not load ONNX model from {}";
   private static final long f_12514 = 50000000L;
   private static final String f_12515 = "none";
   private static final float f_12516 = -90.0F;
   private static final float f_12517 = 90.0F;
   private static final float f_12518 = 1.5F;
   private static final long f_12519 = 5000000000L;
   private static final String f_12520 = "ONNX inference failed; rotation is held";
   private static final String f_12521 = "Could not close ONNX runtime";

   public void m_4508() {
      this.f_12502 = null;
      this.f_12509 = 0L;
      this.f_12498.m_6335();
      this.m_4514();
   }

   private void m_4509() {
      Class_wdG6LJ0JDq977Bnv var1 = this.f_12500;
      this.f_12500 = null;
      this.m_4508();
      if (var1 != null) {
         try {
            var1.close();
         } catch (OrtException var3) {
            this.f_12497.warn(f_12521, var3);
         }
      }
   }

   private void m_4511(LocalPlayer var1) {
   }

   private void m_4512(float[] var1) {
      if (var1.length != Class_WvVvQwpWLdnJMMi9.f_15738) {
         throw new IllegalArgumentException(Class_WvVvQwpWLdnJMMi9.f_15738 + "");
      }

      if (this.f_12499.isEmpty() && this.f_12496.f_9954) {
         for (int var2 = 0; var2 < 60; var2++) {
            this.f_12499.addLast((float[])var1.clone());
         }
      } else {
         if (this.f_12499.size() == 60) {
            this.f_12499.removeFirst();
         }

         this.f_12499.addLast((float[])var1.clone());
      }
   }

   public int m_4513() {
      return this.f_12499.size();
   }

   private void m_4514() {
      this.f_12499.clear();
      this.m_4524();
   }

   public int m_4515() {
      return this.f_12501 == null ? -1 : this.f_12501.mixtureComponent();
   }

   @Override
   public void close() {
      this.m_4509();
   }

   private void m_4516(Exception var1) {
      long var2 = System.nanoTime();
      if (var2 - this.f_12510 >= f_12519) {
         this.f_12510 = var2;
         this.f_12497.error(f_12520, var1);
      }
   }

   public boolean m_4517() {
      return this.f_12500 != null;
   }

   public void m_4518(AbstractClientPlayer var1, float var2, long var3) {
      LocalPlayer var5 = f_11537.player;
      if (this.f_12500 != null && var5 != null && f_11537.level != null && m_4521(var5, var1)) {
         UUID var6 = var1.getUUID();
         if (!var6.equals(this.f_12502)) {
            this.m_4508();
            this.f_12502 = var6;
         }

         if (this.f_12509 != 0L && var3 - this.f_12509 > f_12514) {
            this.f_12498.m_6335();
            this.m_4514();
         }

         this.f_12509 = var3;
         boolean var7 = f_11537.crosshairPickEntity == var1;
         this.m_4511(var5);
         Class_dSYEfAT7aJC05RrC.TEKbDjGhGLlvYtoY var8 = this.f_12498.m_6337(var5, var1, var2, var3);
         if (var8.resetHistory()) {
            this.m_4514();
         }

         if (var8.features() != null) {
            this.m_4512(var8.features());
            if (this.f_12499.size() >= 60) {
               try {
                  this.m_4520(var5);
               } catch (OrtException | RuntimeException var10) {
                  this.m_4524();
                  this.m_4516(var10);
               }
            }
         }
      } else {
         this.m_4508();
      }
   }

   public String m_4519() {
      return this.f_12511;
   }

   private void m_4520(LocalPlayer var1) throws OrtException {
      if (this.f_12501 == null) {
         this.f_12501 = this.f_12500.m_9368(this.f_12499.toArray(float[][]::new), this.f_12496.f_9956);
         this.f_12503 = 0.0F;
         this.f_12504 = var1.getYRot();
         this.f_12505 = var1.getXRot();
      }

      float[][] var2 = this.f_12501.trajectory();
      int var3 = var2.length - 1;
      int var4 = Math.min((int)this.f_12503, var3);
      int var5 = Math.min(var4 + 1, var3);
      float var6 = this.f_12503 - var4;
      float var7 = Mth.lerp(var6, var2[var4][0], var2[var5][0]);
      float var8 = Mth.lerp(var6, var2[var4][1], var2[var5][1]);
      float var9 = this.f_12504 + var7;
      float var10 = this.f_12505 + var8;
      var1.setYRot(Class_uHPXr81r5AZlFeJr.m_9128(var1.getYRot() + Mth.wrapDegrees(var9 - var1.getYRot())));
      var1.setXRot(Class_uHPXr81r5AZlFeJr.m_9128(Mth.clamp(var10, f_12516, f_12517)));
      if (this.f_12503 >= var3) {
         this.f_12501 = null;
         this.f_12503 = 0.0F;
      } else {
         this.f_12503 = Math.min(this.f_12503 + f_12518, var3);
      }
   }

   private static boolean m_4521(LocalPlayer var0, AbstractClientPlayer var1) {
      return var1 != null && var1 != var0 && var1.isAlive() && !var1.isRemoved() && !var1.isSpectator();
   }

   public boolean m_4522() {
      this.m_4509();

      try {
         this.f_12500 = new Class_wdG6LJ0JDq977Bnv(this.f_12496.f_9952);
         this.f_12511 = null;
         this.f_12497.info(f_12512, new Object[]{this.f_12500.m_9367(), this.f_12496.f_9952, 60, Class_WvVvQwpWLdnJMMi9.f_15738, 15});
         return true;
      } catch (IOException | OrtException | RuntimeException var2) {
         this.f_12500 = null;
         this.f_12511 = var2.getMessage();
         this.f_12497.error(f_12513, this.f_12496.f_9952, var2);
         return false;
      }
   }

   public Class_RbvmfdZGDKvZ8eBF(Class_Ja79cp8QmiWLo2Xv var1, Logger var2) {
      this.f_12496 = var1;
      this.f_12497 = var2;
      this.f_12498 = new Class_dSYEfAT7aJC05RrC();
   }

   public String m_4523() {
      return this.f_12500 == null ? f_12515 : this.f_12500.m_9367().name();
   }

   private void m_4524() {
      this.f_12501 = null;
      this.f_12503 = 0.0F;
      this.f_12508 = false;
   }
}
