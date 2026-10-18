package dev.dimasik.client.system;

import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.resources.Identifier;

public final class Class_J32sUe2fy1OIemnb {
   private final CopyOnWriteArrayList<Class_J32sUe2fy1OIemnb.Oybn1scxKSxj8sN9> f_9306 = new CopyOnWriteArrayList<>();
   private final AtomicInteger f_9307 = new AtomicInteger();
   private static final int f_9308 = 16777215;
   private static final int f_9309 = 16777215;
   private static final String f_9310 = ":";

   public void m_3161(Collection<Class_J32sUe2fy1OIemnb.Oybn1scxKSxj8sN9> var1) {
      this.f_9306.clear();
      if (var1 != null) {
         for (Class_J32sUe2fy1OIemnb.Oybn1scxKSxj8sN9 var3 : var1) {
            if (var3 != null) {
               String var4 = m_3169(var3.target());
               if (var4 != null) {
                  this.f_9306.removeIf(var1x -> var1x.target().equalsIgnoreCase(var4));
                  this.f_9306.add(new Class_J32sUe2fy1OIemnb.Oybn1scxKSxj8sN9(var4, var3.color() & f_9309));
               }
            }
         }
      }

      this.f_9307.incrementAndGet();
   }

   public boolean m_3164(String var1, int var2) {
      String var3 = m_3169(var1);
      if (var3 == null) {
         return false;
      }

      this.f_9306.removeIf(var1x -> var1x.target().equalsIgnoreCase(var3));
      this.f_9306.add(new Class_J32sUe2fy1OIemnb.Oybn1scxKSxj8sN9(var3, var2 & f_9308));
      this.f_9307.incrementAndGet();
      return true;
   }

   public int m_3165() {
      return this.f_9307.get();
   }

   public List<Class_J32sUe2fy1OIemnb.Oybn1scxKSxj8sN9> m_3166() {
      return List.copyOf(this.f_9306);
   }

   public int m_3167() {
      int var1 = this.f_9306.size();
      if (var1 == 0) {
         return 0;
      }

      this.f_9306.clear();
      this.f_9307.incrementAndGet();
      return var1;
   }

   public boolean m_3168(String var1) {
      String var2 = m_3169(var1);
      if (var2 == null) {
         return false;
      }

      boolean var3 = this.f_9306.removeIf(var1x -> var1x.target().equalsIgnoreCase(var2));
      if (var3) {
         this.f_9307.incrementAndGet();
      }

      return var3;
   }

   public static String m_3169(String var0) {
      if (var0 != null && !var0.isBlank()) {
         String var1 = var0.trim().toLowerCase(Locale.ROOT);
         if (!var1.contains(f_9310)) {
            var1 = var1 + "";
         }

         Identifier var2 = Identifier.tryParse(var1);
         return var2 == null ? null : var2.toString();
      } else {
         return null;
      }
   }

   public record Oybn1scxKSxj8sN9(String target, int color) {
   }
}
