package dev.dimasik.client.system;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Class_A0tdqGRgz6WCaYJj {
   private ArrayList<String> f_5086 = new ArrayList<>();

   public static <T> ArrayList<T> m_2072(ArrayList<T> var0) {
      LinkedHashSet var1 = new LinkedHashSet(var0);
      var0.clear();
      var0.addAll(var1);
      return var0;
   }

   public void m_2073() {
      this.f_5086.clear();
   }

   @Class_FUILRKIQ6wtWry59("out")
   public void m_2074(String var1) {
      this.f_5086.add(var1);
   }

   public ArrayList<String> m_2075() {
      return m_2072(this.f_5086);
   }
}
