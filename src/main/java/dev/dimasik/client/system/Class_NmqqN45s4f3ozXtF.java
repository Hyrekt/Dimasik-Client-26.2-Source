package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.AutoJoiner;

public final class Class_NmqqN45s4f3ozXtF extends Class_4DhobBIM8lTNckKj {
   private static final int f_11534 = 40;
   private int f_11535;
   private final Class_gEPk7yDw6CwIte87<Class_sULPxrOl7TpPlaX6> f_11536 = this::m_4025;

   private void m_4025(Class_sULPxrOl7TpPlaX6 var1) {
      if (f_11537.level != null && f_11537.player != null) {
         if (++this.f_11535 >= 40) {
            this.f_11535 = 0;
            Class_mqwnQ7i1Iw9tXynj var2 = Class_mqwnQ7i1Iw9tXynj.m_7620();
            if (var2 != null) {
               Class_rpKWQ1k3x4TuZQdK var3 = DimasikClient.m_9057().m_9049().m_2802().m_8860();
               if (var2 == Class_mqwnQ7i1Iw9tXynj.HOLY_WORLD) {
                  AutoJoiner.UFtxOEj3EQyyOrKf var5 = AutoJoiner.m_8827();
                  if (var5 != null) {
                     var3.m_8467(var2, var5);
                  }
               } else {
                  int var4 = AutoJoiner.m_8824();
                  if (var4 > 0) {
                     var3.m_8464(var2, var4);
                  }
               }
            }
         }
      } else {
         this.f_11535 = 0;
      }
   }
}
