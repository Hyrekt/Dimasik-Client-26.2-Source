package dev.dimasik.client.setting.impl;

import dev.dimasik.client.setting.Setting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;
import lombok.Generated;

public class MultiChoiceSetting extends Setting<List<Class_2ZaVm8TGDJ68TnJB>> {
   private Class_2ZaVm8TGDJ68TnJB f_25458 = null;
   private String f_25459;
   private final String f_25460;

   public void m_7563(List<Class_2ZaVm8TGDJ68TnJB> var1) {
      String var2 = this.f_25459 != null ? this.f_25459 : (this.f_25458 != null ? this.f_25458.m_1181() : null);
      this.m_823(new ArrayList<>(var1));
      if (var2 != null) {
         this.m_1766(var2);
      } else if (!this.m_8768().isEmpty()) {
         this.f_25458 = this.m_8768().getFirst();
      } else {
         this.f_25458 = null;
      }
   }

   @Generated
   public Class_2ZaVm8TGDJ68TnJB m_7564() {
      return this.f_25458;
   }

   @Generated
   public void m_7565(String var1) {
      this.f_25459 = var1;
   }

   public void m_1765() {
      this.f_25459 = null;
      this.f_25458 = null;

      for (Class_2ZaVm8TGDJ68TnJB var2 : this.m_8768()) {
         var2.m_1189().m_1367(-1);
         if (this.f_25460 != null && var2.m_1181().equals(this.f_25460)) {
            this.f_25458 = var2;
         }
      }

      if (this.f_25458 == null && !this.m_8768().isEmpty()) {
         this.f_25458 = this.m_8768().getFirst();
      }
   }

   public MultiChoiceSetting m_822(BooleanSupplier var1) {
      this.m_8763(var1);
      return this;
   }

   @Generated
   public void m_1767(Class_2ZaVm8TGDJ68TnJB var1) {
      this.f_25458 = var1;
   }

   public void m_1766(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         for (Class_2ZaVm8TGDJ68TnJB var3 : this.m_8768()) {
            if (var3.m_1181().equals(var1)) {
               this.f_25458 = var3;
               this.f_25459 = null;
               return;
            }
         }

         this.f_25459 = var1;
      }
   }

   @Generated
   public String m_7566() {
      return this.f_25459;
   }

   public MultiChoiceSetting(String var1, int var2, Class_2ZaVm8TGDJ68TnJB... var3) {
      super(var1, new ArrayList<>(List.of(var3)));
      if (!this.m_8768().isEmpty()) {
         this.f_25458 = this.m_8768().get(Math.min(var2, this.m_8768().size() - 1));
      }

      this.f_25460 = this.f_25458 == null ? null : this.f_25458.m_1181();
   }

   @Generated
   public String m_7567() {
      return this.f_25460;
   }

   public boolean m_7568(String var1) {
      return this.f_25458 != null && this.f_25458.m_1181().equals(var1);
   }

   public MultiChoiceSetting(String var1, Class_2ZaVm8TGDJ68TnJB... var2) {
      this(var1, 0, var2);
   }
}
