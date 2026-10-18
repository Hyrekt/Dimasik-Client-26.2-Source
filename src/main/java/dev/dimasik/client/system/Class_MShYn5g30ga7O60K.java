package dev.dimasik.client.system;

import lombok.Generated;

public final class Class_MShYn5g30ga7O60K {
   @Generated
   private Class_MShYn5g30ga7O60K() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   public static void m_3889(Object var0) {
      if (!(var0 instanceof Class_WWrbI1EUeG9pWFgH) && !(var0 instanceof Class_F9yc8RZksnyRaiHz)) {
         System.out.println("Cannot send not packet!");
      } else {
         Class_wOPwT7J4giBZsk46.m_9320().m_9322().m_5922().writeAndFlush(var0);
      }
   }
}
