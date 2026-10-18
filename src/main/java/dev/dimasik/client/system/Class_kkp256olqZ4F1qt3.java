package dev.dimasik.client.system;

import lombok.Generated;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector2f;

public class Class_kkp256olqZ4F1qt3 implements Class_NzJrN63M7QBpmAbi {
   private Class_kkp256olqZ4F1qt3.HLSsfEOz1OozGlGI f_25111 = Class_kkp256olqZ4F1qt3.HLSsfEOz1OozGlGI.SLOW;
   private boolean f_25112 = false;
   private boolean f_25113 = false;
   protected boolean f_25114 = false;
   protected Vec3 f_25115;

   @Generated
   public boolean m_7463() {
      return this.f_25114;
   }

   public Vector2f m_1007() {
      Vec3 var1 = f_11537.player.getEyePosition();
      Vec3 var2 = this.f_25115.subtract(var1).normalize();
      float var3 = (float)Math.toDegrees(Math.atan2(-var2.x, var2.z));
      float var4 = (float)Math.toDegrees(Math.asin(var2.y));
      return new Vector2f(var3, -var4);
   }

   @Generated
   public void m_7464(boolean var1) {
      this.f_25114 = var1;
   }

   @Generated
   public Vec3 m_7465() {
      return this.f_25115;
   }

   public void m_7466(Vec3 var1) {
      this.f_25115 = var1;
      this.f_25114 = false;
   }

   public void m_3874() {
   }

   @Generated
   public Class_kkp256olqZ4F1qt3.HLSsfEOz1OozGlGI m_7467() {
      return this.f_25111;
   }

   public Vector2f m_1006(Vector2f var1, Vector2f var2) {
      return new Vector2f();
   }

   @Generated
   public boolean m_7468() {
      return this.f_25113;
   }

   public Class_kkp256olqZ4F1qt3(Vec3 var1) {
      this.f_25115 = var1;
   }

   @Generated
   public void m_7469(Class_kkp256olqZ4F1qt3.HLSsfEOz1OozGlGI var1) {
      this.f_25111 = var1;
   }

   public void m_1801() {
   }

   @Generated
   public void m_7470(boolean var1) {
      this.f_25113 = var1;
   }

   public Vector2f m_4621(Vector2f var1, Vector2f var2) {
      return new Vector2f();
   }

   @Generated
   public boolean m_2678() {
      return this.f_25112;
   }

   public Class_kkp256olqZ4F1qt3(Vec3 var1, Class_kkp256olqZ4F1qt3.HLSsfEOz1OozGlGI var2) {
      this.f_25115 = var1;
      this.f_25111 = var2;
   }

   @Generated
   public void m_7471(boolean var1) {
      this.f_25112 = var1;
   }

   public enum HLSsfEOz1OozGlGI {
      SLOW,
      MEDIUM,
      FAST;
   }
}
