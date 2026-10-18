package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.system.Class_EfLx94d5XE1k6Uo2;
import dev.dimasik.client.system.Class_RkPHTrEabUVnPKss;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;

public class DiscordRPC extends Module {
   private final Class_RkPHTrEabUVnPKss f_11513 = new Class_RkPHTrEabUVnPKss(Class_EfLx94d5XE1k6Uo2.f_7068, f_11537);
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_11514 = this::m_4004;
   private static final String f_11515 = "DiscordRPC";
   private static final String f_11516 = "Отображает клиент в активности дискорда";

   private void m_4004(Class_Xu9btcIeUN33XnMK var1) {
      this.f_11513.m_4573();
   }

   @Override
   public void m_732() {
      this.f_11513.m_4576();
      super.m_732();
   }

   @Override
   public void m_778() {
      super.m_778();
      this.f_11513.m_4575();
   }

   public DiscordRPC() {
      super(f_11515, f_11516, Category.MISC);
   }
}
