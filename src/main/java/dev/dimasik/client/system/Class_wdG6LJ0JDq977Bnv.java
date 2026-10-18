package dev.dimasik.client.system;

import ai.onnxruntime.NodeInfo;
import ai.onnxruntime.OnnxTensor;
import ai.onnxruntime.OnnxValue;
import ai.onnxruntime.OrtEnvironment;
import ai.onnxruntime.OrtException;
import ai.onnxruntime.OrtSession;
import ai.onnxruntime.TensorInfo;
import ai.onnxruntime.OrtSession.Result;
import ai.onnxruntime.OrtSession.SessionOptions;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Class_wdG6LJ0JDq977Bnv implements AutoCloseable {
   private static final String f_34461 = "sequence";
   private static final String f_34462 = "trajectory";
   private static final String f_34463 = "mixture_logits";
   private static final String f_34464 = "means";
   private static final String f_34465 = "log_scales";
   private static final OrtEnvironment f_34466 = OrtEnvironment.getEnvironment();
   private final OrtSession f_34467;
   private final Class_wdG6LJ0JDq977Bnv.TgvNTa03GUC8xDmj f_34468;
   private final FloatBuffer f_34469;
   private final Random f_34470 = new Random();
   private static final long f_34471 = 60L;
   private static final String f_34472 = "sequence";
   private static final String f_34473 = "trajectory";
   private static final String f_34474 = "mixture_logits";
   private static final String f_34475 = "means";
   private static final String f_34476 = "sequence";
   private static final String f_34477 = "Missing ONNX input: sequence";
   private static final String f_34478 = "sequence";
   private static final long f_34479 = 60L;
   private static final String f_34480 = "trajectory";
   private static final String f_34481 = "mixture_logits";
   private static final String f_34482 = "means";
   private static final String f_34483 = "log_scales";
   private static final String f_34484 = "Expected 60 frames";
   private static final double f_34485 = 0.05;
   private static final double f_34486 = -Double.MAX_VALUE;

   private static float[][] m_9360(float[][] var0) {
      if (var0.length != 15) {
         throw new IllegalStateException(var0.length + "");
      }

      for (int var1 = 0; var1 < var0.length; var1++) {
         if (var0[var1].length < 2 || !Float.isFinite(var0[var1][0]) || !Float.isFinite(var0[var1][1])) {
            throw new IllegalStateException(var1 + "");
         }
      }

      return var0;
   }

   private Class_wdG6LJ0JDq977Bnv.TgvNTa03GUC8xDmj m_9361() throws OrtException {
      Set var1 = this.f_34467.getOutputNames();
      if (var1.contains(f_34480)) {
         return Class_wdG6LJ0JDq977Bnv.TgvNTa03GUC8xDmj.BASELINE;
      } else if (var1.containsAll(Set.of(f_34481, f_34482, f_34483))) {
         return Class_wdG6LJ0JDq977Bnv.TgvNTa03GUC8xDmj.MDN;
      } else {
         throw new IllegalStateException(var1 + "");
      }
   }

   private static float[][] m_9362(float[][] var0) {
      float[][] var1 = new float[var0.length][2];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2][0] = var0[var2][0];
         var1[var2][1] = var0[var2][1];
      }

      return var1;
   }

   private void m_9364(float[][] var1) {
      if (var1.length != 60) {
         throw new IllegalArgumentException(f_34484);
      }

      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2].length != Class_WvVvQwpWLdnJMMi9.f_15738) {
            throw new IllegalArgumentException("" + Class_WvVvQwpWLdnJMMi9.f_15738 + var2);
         }
      }
   }

   private int m_9365(float[] var1, double var2) {
      double var4 = Math.max(f_34485, var2);
      double var6 = f_34486;
      double var8 = 0.0;

      for (float var13 : var1) {
         var6 = Math.max(var6, var13 / var4);
      }

      double[] var14 = new double[var1.length];

      for (int var15 = 0; var15 < var1.length; var15++) {
         var8 += var14[var15] = Math.exp(var1[var15] / var4 - var6);
      }

      double var16 = this.f_34470.nextDouble() * var8;

      for (int var17 = 0; var17 < var14.length; var17++) {
         if ((var16 -= var14[var17]) <= 0.0) {
            return var17;
         }
      }

      return var14.length - 1;
   }

   @Override
   public synchronized void close() throws OrtException {
      this.f_34467.close();
   }

   private static Object m_9366(Result var0, String var1) throws OrtException {
      return ((OnnxValue)var0.get(var1).orElseThrow(() -> new IllegalStateException(var1 + ""))).getValue();
   }

   public Class_wdG6LJ0JDq977Bnv.TgvNTa03GUC8xDmj m_9367() {
      return this.f_34468;
   }

   public synchronized Class_wdG6LJ0JDq977Bnv.rbPQ7fRer1tNKqxQ m_9368(float[][] var1, double var2) throws OrtException {
      this.m_9364(var1);
      this.f_34469.clear();

      for (float[] var7 : var1) {
         this.f_34469.put(var7);
      }

      this.f_34469.flip();
      OnnxTensor var14 = OnnxTensor.createTensor(f_34466, this.f_34469, new long[]{1L, f_34471, Class_WvVvQwpWLdnJMMi9.f_15738});

      Class_wdG6LJ0JDq977Bnv.rbPQ7fRer1tNKqxQ var18;
      label82: {
         Class_wdG6LJ0JDq977Bnv.rbPQ7fRer1tNKqxQ var9;
         try {
            Result var15 = this.f_34467.run(Map.of(f_34472, var14));

            label84: {
               try {
                  if (this.f_34468 != Class_wdG6LJ0JDq977Bnv.TgvNTa03GUC8xDmj.BASELINE) {
                     float[][] var17 = (float[][])m_9366(var15, f_34474);
                     float[][][][] var19 = (float[][][][])m_9366(var15, f_34475);
                     int var8 = this.m_9365(var17[0], var2);
                     var9 = new Class_wdG6LJ0JDq977Bnv.rbPQ7fRer1tNKqxQ(var8, m_9360(m_9362(var19[0][var8])));
                     break label84;
                  }

                  float[][][] var16 = (float[][][])m_9366(var15, f_34473);
                  var18 = new Class_wdG6LJ0JDq977Bnv.rbPQ7fRer1tNKqxQ(-1, m_9360(m_9362(var16[0])));
               } catch (Throwable var12) {
                  if (var15 != null) {
                     try {
                        var15.close();
                     } catch (Throwable var11) {
                        var12.addSuppressed(var11);
                     }
                  }

                  throw var12;
               }

               if (var15 != null) {
                  var15.close();
               }
               break label82;
            }

            if (var15 != null) {
               var15.close();
            }
         } catch (Throwable var13) {
            if (var14 != null) {
               try {
                  var14.close();
               } catch (Throwable var10) {
                  var13.addSuppressed(var10);
               }
            }

            throw var13;
         }

         if (var14 != null) {
            var14.close();
         }

         return var9;
      }

      if (var14 != null) {
         var14.close();
      }

      return var18;
   }

   private void m_9369() throws OrtException {
      if (!this.f_34467.getInputNames().contains(f_34476)) {
         throw new IllegalStateException(f_34477);
      } else {
         long[] var1 = ((TensorInfo)((NodeInfo)this.f_34467.getInputInfo().get(f_34478)).getInfo()).getShape();
         if (var1.length != 3 || var1[0] != 1L || var1[1] != f_34479 || var1[2] != Class_WvVvQwpWLdnJMMi9.f_15738) {
            throw new IllegalStateException(Class_WvVvQwpWLdnJMMi9.f_15738 + Arrays.toString(var1));
         }
      }
   }

   public Class_wdG6LJ0JDq977Bnv(Path var1) throws IOException, OrtException {
      if (!Files.isRegularFile(var1)) {
         throw new IOException(var1 + "");
      }

      Class_1QRAvI1JBZFSOzme.m_841(var1);
      SessionOptions var2 = new SessionOptions();

      try {
         var2.setIntraOpNumThreads(1);
         var2.setInterOpNumThreads(1);
         this.f_34467 = f_34466.createSession(Files.readAllBytes(var1), var2);
      } catch (Throwable var7) {
         try {
            var2.close();
         } catch (Throwable var5) {
            var7.addSuppressed(var5);
         }

         throw var7;
      }

      var2.close();

      try {
         this.m_9369();
         this.f_34468 = this.m_9361();
      } catch (RuntimeException | OrtException var6) {
         this.f_34467.close();
         throw var6;
      }

      this.f_34469 = ByteBuffer.allocateDirect(240 * Class_WvVvQwpWLdnJMMi9.f_15738).order(ByteOrder.nativeOrder()).asFloatBuffer();
   }

   enum TgvNTa03GUC8xDmj {
      BASELINE,
      MDN;
   }

   public record rbPQ7fRer1tNKqxQ(int mixtureComponent, float[][] trajectory) {
   }
}
