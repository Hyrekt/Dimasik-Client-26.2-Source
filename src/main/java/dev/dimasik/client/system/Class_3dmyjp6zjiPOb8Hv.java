package dev.dimasik.client.system;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;

public final class Class_3dmyjp6zjiPOb8Hv<T> {
   private static volatile int f_1424;
   private final int f_1425;
   private final LinkedHashMap<List<Class_3dmyjp6zjiPOb8Hv.p1yJC0HYVHF8b9Ty>, T> f_1426;
   private int f_1427;
   private static final float f_1428 = 0.75F;

   public void m_1316() {
      this.f_1426.clear();
   }

   public static void m_1317() {
      f_1424++;
   }

   public T m_1318(Component var1, Function<Component, T> var2) {
      if (this.f_1427 != f_1424) {
         this.m_1316();
         this.f_1427 = f_1424;
      }

      ArrayList var3 = new ArrayList();
      var1.visit((var1x, var2x) -> {
         if (!var2x.isEmpty()) {
            var3.add(new Class_3dmyjp6zjiPOb8Hv.p1yJC0HYVHF8b9Ty(var2x, var1x));
         }

         return Optional.empty();
      }, Style.EMPTY);
      if (var3.size() > 128) {
         return (T)var2.apply(var1);
      }

      List var4 = List.copyOf(var3);
      Object var5 = this.f_1426.get(var4);
      if (var5 != null) {
         return (T)var5;
      }

      Object var6 = var2.apply(var1);
      if (this.f_1426.size() >= this.f_1425) {
         this.f_1426.remove(this.f_1426.keySet().iterator().next());
      }

      this.f_1426.put(var4, (T)var6);
      return (T)var6;
   }

   public Class_3dmyjp6zjiPOb8Hv(int var1) {
      this.f_1426 = new LinkedHashMap<>(64, f_1428, true);
      this.f_1427 = f_1424;
      this.f_1425 = Math.max(1, var1);
   }

   private record p1yJC0HYVHF8b9Ty(String text, Style style) {
   }
}
