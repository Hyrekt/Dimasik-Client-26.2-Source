package dev.dimasik.client.system;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

public class Class_HC4FxlQBDqG2aUiU extends CopyOnWriteArrayList<Class_GOZclSP08fljqFSO> {
   private final AtomicInteger f_8079 = new AtomicInteger();

   @Override
   public boolean removeIf(Predicate<? super Class_GOZclSP08fljqFSO> var1) {
      boolean var2 = super.removeIf(var1);
      if (var2) {
         this.f_8079.incrementAndGet();
      }

      return var2;
   }

   public Optional<Class_GOZclSP08fljqFSO> m_2870(String var1) {
      return this.stream().filter(var1x -> var1x.m_2795().equalsIgnoreCase(var1)).findFirst();
   }

   public boolean m_2871(Class_GOZclSP08fljqFSO var1) {
      boolean var2 = super.add(var1);
      if (var2) {
         this.f_8079.incrementAndGet();
      }

      return var2;
   }

   public int m_2872() {
      return this.f_8079.get();
   }

   public void m_2873(String var1, String var2) {
      this.removeIf(var1x -> var1x.m_2795().equalsIgnoreCase(var1));
      this.m_2871(new Class_GOZclSP08fljqFSO(var1, var2));
   }

   @Override
   public boolean remove(Object var1) {
      boolean var2 = super.remove(var1);
      if (var2) {
         this.f_8079.incrementAndGet();
      }

      return var2;
   }

   @Override
   public boolean addAll(Collection<? extends Class_GOZclSP08fljqFSO> var1) {
      boolean var2 = super.addAll(var1);
      if (var2) {
         this.f_8079.incrementAndGet();
      }

      return var2;
   }

   public List<String> m_2876() {
      ArrayList var1 = new ArrayList();

      for (Class_GOZclSP08fljqFSO var3 : this) {
         var1.add(var3.m_2795());
      }

      return var1;
   }

   @Override
   public void clear() {
      if (!this.isEmpty()) {
         super.clear();
         this.f_8079.incrementAndGet();
      }
   }

   public boolean m_2877(String var1) {
      return this.m_2870(var1).isPresent();
   }
}
