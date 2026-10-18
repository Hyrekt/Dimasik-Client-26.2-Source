package dev.dimasik.client.system;

import javax.crypto.spec.SecretKeySpec;

public class Class_StNioT8aEM86gsyW extends Class_t1vMTY2cIeX5NVrP<Class_Su2v52eSNvYVtuLd> {
   public void m_1312(Class_Su2v52eSNvYVtuLd var1) {
      String var2 = var1.m_5461();
      byte[] var3 = var1.m_5464();
      SecretKeySpec var4 = new SecretKeySpec(var3, var2);
      Class_wOPwT7J4giBZsk46.m_9320().m_9322().m_5925().addBefore("inbound", "decrypt", new Class_uZvKZJZVQvrFFtCv(var4));
      Class_wOPwT7J4giBZsk46.m_9320().m_9322().m_5925().addBefore("outbound", "encrypt", new Class_G44Ve1waobatiVFY(var4));
      System.out.println("Encryption enabled!");
   }
}
