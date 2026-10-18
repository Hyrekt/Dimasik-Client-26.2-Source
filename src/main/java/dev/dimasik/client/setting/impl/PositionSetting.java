package dev.dimasik.client.setting.impl;

import dev.dimasik.client.setting.Setting;
import dev.dimasik.client.system.Class_dJj2SGO1fl9bUExQ;
import java.util.function.BooleanSupplier;
import lombok.Generated;
import org.joml.Vector2f;

public class PositionSetting extends Setting<Vector2f> {
   private final Vector2f f_28047 = new Vector2f();
   private float f_28048 = 0.0F;
   private float f_28049 = 0.0F;
   private Class_dJj2SGO1fl9bUExQ f_28050;

   @Generated
   public float m_8000() {
      return this.f_28049;
   }

   public PositionSetting m_8001(Class_dJj2SGO1fl9bUExQ var1) {
      this.f_28050 = var1;
      return this;
   }

   public PositionSetting m_8002(float var1) {
      this.f_28048 = var1;
      return this;
   }

   public PositionSetting(String var1, Vector2f var2, float var3, float var4) {
      super(var1, var2);
      this.f_28047.set(var3, var4);
   }

   @Generated
   public Vector2f m_8003() {
      return this.f_28047;
   }

   public PositionSetting m_822(BooleanSupplier var1) {
      this.m_8763(var1);
      return this;
   }

   @Generated
   public Class_dJj2SGO1fl9bUExQ m_8004() {
      return this.f_28050;
   }

   public PositionSetting m_8005(float var1) {
      this.f_28049 = var1;
      return this;
   }

   @Generated
   public float m_8006() {
      return this.f_28048;
   }
}
