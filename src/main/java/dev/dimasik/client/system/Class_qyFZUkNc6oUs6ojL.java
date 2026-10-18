package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import lombok.Generated;

public final class Class_qyFZUkNc6oUs6ojL {
   private static final String f_30024 = "This is a utility class and cannot be instantiated";

   public static float m_8352(float var0, float var1) {
      return var1 + (var0 - var1) / m_8354();
   }

   public static float m_8353(float var0, float var1) {
      return var1 + (var0 - var1) / m_8354();
   }

   public static float m_8354() {
      try {
         return DimasikClient.m_9057() != null
               && DimasikClient.m_9057().m_9049() != null
               && DimasikClient.m_9057().m_9049().m_2801() != null
               && DimasikClient.m_9057().m_9049().m_2801().m_3433() != null
            ? DimasikClient.m_9057().m_9049().m_2801().m_3433().m_6165()
            : 1.0F;
      } catch (Throwable var1) {
         return 1.0F;
      }
   }

   @Generated
   private Class_qyFZUkNc6oUs6ojL() {
      throw new UnsupportedOperationException(f_30024);
   }
}
