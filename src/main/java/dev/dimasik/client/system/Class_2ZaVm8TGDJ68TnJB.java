package dev.dimasik.client.system;

import dev.dimasik.client.module.KeyBind;
import dev.dimasik.client.module.KeybindMode;
import java.util.function.BooleanSupplier;
import lombok.Generated;

public class Class_2ZaVm8TGDJ68TnJB {
   private final Class_w8fCJQ5ZtH5lQbWc f_1162;
   private final Class_1gO7GkQ9aEvcObZ8 f_1163;
   private final KeyBind f_1164;
   private final String f_1165;
   private boolean f_1166;
   private BooleanSupplier f_1167;
   private static final float f_1168 = 10.0F;
   private static final float f_1169 = 10.0F;

   @Generated
   public String m_1181() {
      return this.f_1165;
   }

   @Generated
   public Class_1gO7GkQ9aEvcObZ8 m_1182() {
      return this.f_1163;
   }

   @Generated
   public void m_1183(boolean var1) {
      this.f_1166 = var1;
   }

   @Generated
   public void m_1184(BooleanSupplier var1) {
      this.f_1167 = var1;
   }

   public Class_2ZaVm8TGDJ68TnJB m_1185(BooleanSupplier var1) {
      this.f_1167 = var1;
      return this;
   }

   @Generated
   public Class_w8fCJQ5ZtH5lQbWc m_1186() {
      return this.f_1162;
   }

   @Generated
   public boolean m_1187() {
      return this.f_1166;
   }

   @Generated
   public Class_2ZaVm8TGDJ68TnJB(String var1) {
      this.f_1162 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_1169);
      this.f_1163 = new Class_1gO7GkQ9aEvcObZ8();
      this.f_1164 = new KeyBind(KeybindMode.TOGGLE, -1);
      this.f_1167 = () -> true;
      this.f_1165 = var1;
   }

   @Generated
   public BooleanSupplier m_1188() {
      return this.f_1167;
   }

   public Class_2ZaVm8TGDJ68TnJB(String var1, boolean var2) {
      this.f_1162 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_1168);
      this.f_1163 = new Class_1gO7GkQ9aEvcObZ8();
      this.f_1164 = new KeyBind(KeybindMode.TOGGLE, -1);
      this.f_1167 = () -> true;
      this.f_1165 = var1;
      this.f_1166 = var2;
   }

   @Generated
   public KeyBind m_1189() {
      return this.f_1164;
   }
}
