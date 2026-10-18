package dev.dimasik.client.system;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public interface Class_oo743SqrvnZTh2xw {
   Map<Class<? extends Class_dvQPdkxIrHFluhTN>, Class_PGmLFb5tSDtU5wMz> f_28046 = new ConcurrentHashMap<>();

   default void m_7997(String... var1) {
      Class_PGmLFb5tSDtU5wMz var2 = f_28046.get(this.getClass());
      if (var2 != null) {
         var2.m_4111(var1);
      }
   }

   static <T extends Class_dvQPdkxIrHFluhTN> void m_7998(Class<T> var0, Class_PGmLFb5tSDtU5wMz var1) {
      f_28046.put(var0, var1);
   }
}
