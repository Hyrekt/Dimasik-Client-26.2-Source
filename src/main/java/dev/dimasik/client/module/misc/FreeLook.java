package dev.dimasik.client.module.misc;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.system.Class_kkp256olqZ4F1qt3;

public class FreeLook extends Module {
   private static final String f_19235 = "FreeLook";
   private static final String f_19236 = "Позволяет осмотреться от третьего лица без отображения другим игрокам";

   @Override
   public void m_732() {
      DimasikClient.m_9057().m_9049().m_2813().m_5162(null);
   }

   public FreeLook() {
      super(f_19235, f_19236, Category.MISC);
   }

   @Override
   public void m_778() {
      DimasikClient.m_9057().m_9049().m_2813().m_5162(new Class_kkp256olqZ4F1qt3(null));
   }
}
