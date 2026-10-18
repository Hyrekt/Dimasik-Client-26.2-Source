package dev.dimasik.client.system;

public class Class_gzdSiWflm7Qsz66p extends Class_t1vMTY2cIeX5NVrP<Class_ZDjQneqzX1YZpzLJ> {
   public void m_1312(Class_ZDjQneqzX1YZpzLJ var1) {
      try {
         byte[] var2 = var1.m_5464();
         byte[] var3 = Class_Mqs57M9JtorH46aE.m_3970(var2);
         if (var3 == null) {
            System.out.println("Signed data is null!");
            return;
         }

         var1.m_5462(Class_wOPwT7J4giBZsk46.m_9320().m_9322().m_5924());
         var1.m_5462(Class_wOPwT7J4giBZsk46.m_9320().m_9322().m_5923());
         var1.m_5460(var2);
         var1.m_5460(var3);
         Class_MShYn5g30ga7O60K.m_3889(var1);
      } catch (Exception var4) {
         System.out.println(var4.getMessage());
      }
   }
}
