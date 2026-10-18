package dev.dimasik.client.setting.impl;

import dev.dimasik.client.setting.Setting;
import dev.dimasik.client.system.Class_3VHxwfI2NZKoxzIi;
import dev.dimasik.client.system.Class_dJj2SGO1fl9bUExQ;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import lombok.Generated;
import org.joml.Vector2f;

public class SliderSetting extends Setting<Float> {
   private final Vector2f f_457 = new Vector2f();
   private float f_458 = 0.0F;
   private Class_dJj2SGO1fl9bUExQ f_459;
   private Supplier<Float> f_460;
   private Supplier<Float> f_461;

   public float m_813() {
      return this.f_461 == null ? this.f_457.y : this.f_461.get();
   }

   public SliderSetting m_814(Supplier<Float> var1) {
      this.f_461 = var1;
      this.m_823(this.m_8768());
      return this;
   }

   public SliderSetting m_815(Class_dJj2SGO1fl9bUExQ var1) {
      this.f_459 = var1;
      return this;
   }

   @Generated
   public Vector2f m_816() {
      return this.f_457;
   }

   @Generated
   public float m_817() {
      return this.f_458;
   }

   public void m_818(float var1) {
      super.m_823(Math.clamp(var1, this.m_824(), this.m_813()));
   }

   @Generated
   public Class_dJj2SGO1fl9bUExQ m_819() {
      return this.f_459;
   }

   public SliderSetting m_820(SliderSetting var1) {
      return this.m_821(var1::m_8768);
   }

   public SliderSetting m_821(Supplier<Float> var1) {
      this.f_460 = var1;
      this.m_823(this.m_8768());
      return this;
   }

   public SliderSetting m_822(BooleanSupplier var1) {
      this.m_8763(var1);
      return this;
   }

   public float m_824() {
      return this.f_460 == null ? this.f_457.x : this.f_460.get();
   }

   public SliderSetting(String var1, float var2, float var3, float var4) {
      super(var1, var2);
      this.f_457.set(var3, var4);
   }

   @Generated
   public Supplier<Float> m_825() {
      return this.f_460;
   }

   public SliderSetting m_826(SliderSetting var1) {
      this.f_461 = var1::m_8768;
      var1.m_820(this);
      this.m_823(this.m_8768());
      return this;
   }

   public void m_823(Float var1) {
      float var2 = this.m_824();
      float var3 = this.m_813();
      float var4 = this.f_458 > 0.0F ? (float)Class_3VHxwfI2NZKoxzIi.m_1308(var1.floatValue(), this.f_458) : var1;
      super.m_823(Math.clamp(var4, var2, var3));
   }

   @Generated
   public Supplier<Float> m_827() {
      return this.f_461;
   }

   public SliderSetting m_828(float var1) {
      this.f_458 = var1;
      return this;
   }

   public void m_829(float var1) {
      super.m_823(var1);
   }
}
