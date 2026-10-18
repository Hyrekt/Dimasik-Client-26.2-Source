package dev.dimasik.client.system;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import net.minecraft.world.entity.player.Player;

public final class Class_4y36uTdTYqMvUyjc extends Class_4DhobBIM8lTNckKj {
   private final Map<UUID, Class_h1oKCuzrzapIbcHG> f_2212 = new HashMap<>();
   private final Map<UUID, Class_CaVoGy5a20MKv97j> f_2213 = new HashMap<>();
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_2214 = this::m_1386;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_2215 = this::m_1385;
   private static final float f_2216 = 0.01F;

   private Class_CaVoGy5a20MKv97j m_1384(Player var1) {
      Class_CaVoGy5a20MKv97j var2 = Class_rsrLB4fiDOF3z0YM.m_8477(var1, Class_HSD91zSgdqsM5q0d.PETS);
      return var2 != null && var2.attach().m_3629() ? var2 : null;
   }

   private void m_1385(Class_TZhU50s8XmBQCMP5 var1) {
      if (f_11537.level != null) {
         for (Player var3 : f_11537.level.players()) {
            if (var3 != null && !var3.isRemoved() && this.m_1387(var3)) {
               Class_h1oKCuzrzapIbcHG var4 = this.f_2212.get(var3.getUUID());
               Class_CaVoGy5a20MKv97j var5 = this.f_2213.get(var3.getUUID());
               if (var4 != null && var5 != null) {
                  float var6 = f_11537.player != null && var3.getUUID().equals(f_11537.player.getUUID()) ? Class_rsrLB4fiDOF3z0YM.m_8519() : 1.0F;
                  if (!(var6 < f_2216)) {
                     var4.m_7053(var1.m_5006(), var1.m_5008(), var1.m_5010(), var1.m_5004(), var5, var6);
                  }
               }
            }
         }
      }
   }

   private void m_1386(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.level == null) {
         this.f_2212.values().forEach(Class_h1oKCuzrzapIbcHG::m_7045);
         this.f_2212.clear();
         this.f_2213.clear();
      } else {
         HashSet var2 = new HashSet();

         for (Player var4 : f_11537.level.players()) {
            if (var4 != null && !var4.isRemoved() && this.m_1387(var4)) {
               Class_CaVoGy5a20MKv97j var5 = this.m_1384(var4);
               if (var5 != null) {
                  var2.add(var4.getUUID());
                  this.f_2213.put(var4.getUUID(), var5);
                  this.f_2212.computeIfAbsent(var4.getUUID(), var0 -> new Class_h1oKCuzrzapIbcHG()).m_7054(var4);
               }
            }
         }

         this.f_2212.entrySet().removeIf(var2x -> {
            if (var2.contains(var2x.getKey())) {
               return false;
            }

            var2x.getValue().m_7045();
            this.f_2213.remove(var2x.getKey());
            return true;
         });
      }
   }

   private boolean m_1387(Player var1) {
      return Class_rsrLB4fiDOF3z0YM.m_8489(var1, f_11537);
   }
}
