package dev.dimasik.client.system;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class Class_ayeYIPFHssYN0qd9 {
   private static final Class_ayeYIPFHssYN0qd9 f_17536 = new Class_ayeYIPFHssYN0qd9();
   private static final int f_17537 = 4;
   private final Map<String, Class_TVlnV6L5wBRgazQF> f_17538 = new ConcurrentHashMap<>();
   private final AtomicInteger f_17539 = new AtomicInteger();
   private final ExecutorService f_17540 = Executors.newCachedThreadPool(new Class_ayeYIPFHssYN0qd9.KyRBm46DdXZKjCj2());

   private Class_ayeYIPFHssYN0qd9() {
   }

   public void m_5965(String var1, float var2) {
      if (!(var2 <= 0.0F)) {
         Class_TVlnV6L5wBRgazQF var3 = this.f_17538.computeIfAbsent(var1, Class_TVlnV6L5wBRgazQF::new);
         if (!var3.m_4999()) {
            if (this.f_17539.get() < 4) {
               this.f_17539.incrementAndGet();
               this.f_17540.execute(() -> {
                  try {
                     var3.m_5002(var2);
                  } finally {
                     this.f_17539.decrementAndGet();
                  }
               });
            }
         }
      }
   }

   public static Class_ayeYIPFHssYN0qd9 m_5966() {
      return f_17536;
   }

   private static final class KyRBm46DdXZKjCj2 implements ThreadFactory {
      public final AtomicInteger f_17535 = new AtomicInteger();

      public KyRBm46DdXZKjCj2() {
      }

      @Override
      public Thread newThread(Runnable var1) {
         Thread var2 = new Thread(var1, this.f_17535.incrementAndGet() + "");
         var2.setDaemon(true);
         var2.setPriority(1);
         return var2;
      }
   }
}
