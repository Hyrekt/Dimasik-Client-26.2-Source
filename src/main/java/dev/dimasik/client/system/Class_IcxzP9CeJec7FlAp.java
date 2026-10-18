package dev.dimasik.client.system;

import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.yggdrasil.YggdrasilUserApiService;
import java.lang.reflect.Field;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import net.minecraft.util.Util;

public final class Class_IcxzP9CeJec7FlAp {
   private static final long f_9090 = TimeUnit.MINUTES.toNanos(Class_IcxzP9CeJec7FlAp.f_9097);
   private static final Field f_9091 = m_3115();
   private final UserApiService f_9092;
   private volatile Set<?> f_9093 = Set.of();
   private long f_9094;
   private static final String f_9095 = "Cannot read the cached player block list";
   private static final String f_9096 = "blockList";
   private static final long f_9097 = 2L;

   public static boolean m_3113(UserApiService var0) {
      return f_9091 != null && var0 instanceof YggdrasilUserApiService;
   }

   private static Field m_3115() {
      try {
         Field var0 = YggdrasilUserApiService.class.getDeclaredField(f_9096);
         return var0.trySetAccessible() ? var0 : null;
      } catch (NoSuchFieldException | SecurityException var1) {
         return null;
      }
   }

   public boolean m_3116(UUID var1) {
      return var1 != null && (var1.getMostSignificantBits() != 0L || var1.getLeastSignificantBits() != 0L) && this.f_9093.contains(var1);
   }

   public CompletableFuture<?> m_3117(CompletableFuture<?> var1) {
      this.f_9094 = System.nanoTime() + f_9090;
      return var1.handleAsync((var1x, var2) -> {
         this.m_3118();
         return null;
      }, Util.nonCriticalIoPool());
   }

   private void m_3118() {
      try {
         if (f_9091.get(this.f_9092) instanceof Set var2) {
            this.f_9093 = Set.copyOf(var2);
         }
      } catch (IllegalAccessException var3) {
         throw new IllegalStateException(f_9095, var3);
      }
   }

   public CompletableFuture<?> m_3119(CompletableFuture<?> var1) {
      if (var1.isDone() && System.nanoTime() - this.f_9094 >= 0L) {
         this.f_9094 = System.nanoTime() + f_9090;
         return var1.handleAsync((var1x, var2) -> {
            this.f_9092.refreshBlockList();
            this.m_3118();
            return null;
         }, Util.nonCriticalIoPool());
      } else {
         return var1;
      }
   }

   public Class_IcxzP9CeJec7FlAp(UserApiService var1) {
      this.f_9092 = var1;
   }
}
