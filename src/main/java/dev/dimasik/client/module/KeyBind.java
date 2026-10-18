package dev.dimasik.client.module;

import java.util.concurrent.atomic.AtomicLong;
import lombok.Generated;

public class KeyBind {
   private static final AtomicLong f_2174 = new AtomicLong();
   private KeybindMode f_2175;
   private int f_2176;

   public void m_1367(int var1) {
      if (this.f_2176 != var1) {
         this.f_2176 = var1;
         f_2174.incrementAndGet();
      }
   }

   public static long m_1368() {
      return f_2174.get();
   }

   @Generated
   public int m_1369() {
      return this.f_2176;
   }

   @Generated
   public KeyBind(KeybindMode var1, int var2) {
      this.f_2175 = var1;
      this.f_2176 = var2;
   }

   @Generated
   public void m_1370(KeybindMode var1) {
      this.f_2175 = var1;
   }

   @Generated
   public KeybindMode m_1371() {
      return this.f_2175;
   }
}
