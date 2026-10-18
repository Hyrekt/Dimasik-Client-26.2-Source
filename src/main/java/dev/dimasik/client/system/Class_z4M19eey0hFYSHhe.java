package dev.dimasik.client.system;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Class_z4M19eey0hFYSHhe {
   private final ConcurrentHashMap<Type, CopyOnWriteArrayList<Class_gEPk7yDw6CwIte87<?>>> f_35668 = new ConcurrentHashMap<>();
   private final Map<Class<?>, Field[]> f_35669 = new HashMap<>();
   private final Comparator<Class_gEPk7yDw6CwIte87<?>> f_35670 = Comparator.<Class_gEPk7yDw6CwIte87<?>>comparingInt(var0 -> var0.m_1780()).reversed();
   private final BiConsumer<List<Class_gEPk7yDw6CwIte87<?>>, Comparator<Class_gEPk7yDw6CwIte87<?>>> f_35671 = List::sort;
   private final Consumer<Throwable> f_35672 = Throwable::printStackTrace;

   public <T extends Class_W36DTOFJFiIifzGK> void m_9708(T var1) {
      Class var2 = var1.getClass();
      CopyOnWriteArrayList var3 = this.f_35668.get(var2);
      if (var3 != null) {
         for (Class_gEPk7yDw6CwIte87 var5 : (Iterable<Class_gEPk7yDw6CwIte87>) (Iterable) var3) {
            try {
               Class_gEPk7yDw6CwIte87 var6 = var5;
               var6.m_1781(var1);
            } catch (Throwable var7) {
               this.f_35672.accept(var7);
            }
         }
      }
   }

   private Field[] m_9709(Class<?> var1) {
      return this.f_35669.computeIfAbsent(var1, Class::getDeclaredFields);
   }

   private void m_9710(Object var1, BiConsumer<Type, Class_gEPk7yDw6CwIte87<?>> var2) {
      Class var3 = var1.getClass();

      for (Field var7 : this.m_9709(var3)) {
         if (var7.getType() == Class_gEPk7yDw6CwIte87.class) {
            Class_gEPk7yDw6CwIte87 var8 = this.m_9711(var1, var7);
            Type var9 = ((ParameterizedType)var7.getGenericType()).getActualTypeArguments()[0];
            var2.accept(var9, var8);
         }
      }
   }

   private Class_gEPk7yDw6CwIte87<?> m_9711(Object var1, Field var2) {
      boolean var3 = var2.canAccess(var1);
      var2.setAccessible(true);
      Class_gEPk7yDw6CwIte87 var4 = null;

      try {
         var4 = (Class_gEPk7yDw6CwIte87)var2.get(var1);
      } catch (IllegalAccessException var9) {
         var9.printStackTrace();
      } finally {
         var2.setAccessible(var3);
      }

      return var4;
   }

   public void m_9713(Object var1) {
      this.m_9710(var1, (var1x, var2) -> {
         this.f_35668.computeIfAbsent(var1x, var0 -> new CopyOnWriteArrayList<>()).add(var2);
         this.f_35671.accept(this.f_35668.get(var1x), this.f_35670);
      });
   }

   public void m_9715(Object var1) {
      this.m_9710(var1, (var1x, var2) -> {
         CopyOnWriteArrayList var3 = this.f_35668.get(var1x);
         if (var3 != null) {
            var3.remove(var2);
            if (var3.isEmpty()) {
               this.f_35668.remove(var1x);
            }
         }
      });
   }
}
