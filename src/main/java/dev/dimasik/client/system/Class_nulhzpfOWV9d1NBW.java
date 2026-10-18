package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.render.Ambience;
import dev.dimasik.client.module.render.Rain;
import lombok.Generated;

public final class Class_nulhzpfOWV9d1NBW {
   private static final String f_25997 = "This is a utility class and cannot be instantiated";

   public static boolean m_7705() {
      if (DimasikClient.m_9057() == null) {
         return false;
      }

      Ambience var0 = DimasikClient.m_9057().m_9049().m_2801().m_3511();
      return Rain.m_6679() || m_7706(Class_xYKqykPYp6IuC6PX.QfQnMomAbf3hjvZP.RAIN) || var0 != null && var0.m_3012();
   }

   @Generated
   private Class_nulhzpfOWV9d1NBW() {
      throw new UnsupportedOperationException(f_25997);
   }

   public static boolean m_7706(Class_xYKqykPYp6IuC6PX.QfQnMomAbf3hjvZP var0) {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9051() != null) {
         Class_xYKqykPYp6IuC6PX var1 = new Class_xYKqykPYp6IuC6PX(var0);
         DimasikClient.m_9057().m_9051().m_9708(var1);
         return var1.m_1581();
      } else {
         return false;
      }
   }
}
