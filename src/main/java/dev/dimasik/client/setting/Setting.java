package dev.dimasik.client.setting;

import java.util.function.BooleanSupplier;
import lombok.Generated;

public abstract class Setting<T> {
   private final String f_31448;
   private T f_31449;
   private final T f_31450;
   private BooleanSupplier f_31451 = () -> true;

   @Generated
   public void m_823(T var1) {
      this.f_31449 = (T)var1;
   }

   @Generated
   public void m_8763(BooleanSupplier var1) {
      this.f_31451 = var1;
   }

   @Generated
   public String m_8764() {
      return this.f_31448;
   }

   public Setting(String var1, T var2) {
      this.f_31448 = var1;
      this.f_31449 = (T)var2;
      this.f_31450 = (T)var2;
   }

   @Generated
   public T m_8765() {
      return this.f_31450;
   }

   @Generated
   public BooleanSupplier m_8766() {
      return this.f_31451;
   }

   @Generated
   public T m_8768() {
      return this.f_31449;
   }

   public abstract Setting<T> m_822(BooleanSupplier var1);
}
