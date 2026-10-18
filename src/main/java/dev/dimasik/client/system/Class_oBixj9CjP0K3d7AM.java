package dev.dimasik.client.system;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class Class_oBixj9CjP0K3d7AM {
   public static final long f_26166 = 3500000000L;
   private final Map<UUID, Class_oBixj9CjP0K3d7AM.Class_7M3yZjcGgTabGDg6> f_26167 = new HashMap<>();
   private final Map<UUID, Long> f_26168 = new HashMap<>();
   private static final long f_26169 = 30000000000L;
   private static final long f_26170 = 3500000000L;
   private static final long f_26171 = 30000000000L;

   public boolean m_7729(UUID var1, Class_ihAt1VjcwWMm2sNx var2, long var3) {
      if (var2.valid() && !this.f_26168.containsKey(var2.session())) {
         Class_oBixj9CjP0K3d7AM.Class_7M3yZjcGgTabGDg6 var5 = this.f_26167.get(var1);
         if (var5 != null) {
            if (var5.message.session().equals(var2.session())) {
               if (var2.sequence() <= var5.message.sequence()) {
                  return false;
               }
            } else {
               if (this.f_26168.size() >= 512) {
                  return false;
               }

               this.f_26168.put(var5.message.session(), var3 + f_26169);
            }
         } else if (this.f_26167.size() >= 256) {
            return false;
         }

         this.f_26167.put(var1, new Class_oBixj9CjP0K3d7AM.Class_7M3yZjcGgTabGDg6(var2, var3));
         return true;
      } else {
         return false;
      }
   }

   public Class_ihAt1VjcwWMm2sNx m_7730(UUID var1, long var2) {
      Class_oBixj9CjP0K3d7AM.Class_7M3yZjcGgTabGDg6 var4 = this.f_26167.get(var1);
      return var4 != null && var2 - var4.received < f_26170 && var4.message.state() != Class_ihAt1VjcwWMm2sNx.k19EOlI5xzmGXgut.CLEAR ? var4.message : null;
   }

   public void m_7732() {
      this.f_26167.clear();
      this.f_26168.clear();
   }

   public void m_7734(long var1) {
      this.f_26167.values().removeIf(var2 -> var1 - var2.received >= f_26171);
      this.f_26168.values().removeIf(var2 -> var1 >= var2);
   }

   private record Class_7M3yZjcGgTabGDg6(Class_ihAt1VjcwWMm2sNx message, long received) {
   }
}
