package dev.dimasik.client.system;

import java.util.Arrays;
import lombok.Generated;

public class Class_TLKj0wt8AJxKO3Vd {
   private final String f_13991;
   private final String f_13992;
   private final boolean f_13993;
   private int[] f_13994;
   private static final String f_13995 = "Unknown";

   public void m_4979(int[] var1) {
      this.f_13994 = Arrays.copyOf(var1, var1.length);
   }

   public Class_TLKj0wt8AJxKO3Vd(String var1, String var2, boolean var3, int[] var4) {
      this.f_13991 = var1;
      this.f_13992 = var2 == null ? f_13995 : var2;
      this.f_13993 = var3;
      this.f_13994 = Arrays.copyOf(var4, var4.length);
   }

   public int[] m_4980() {
      return Arrays.copyOf(this.f_13994, this.f_13994.length);
   }

   @Generated
   public boolean m_4981() {
      return this.f_13993;
   }

   @Generated
   public int[] m_4982() {
      return this.f_13994;
   }

   @Generated
   public String m_4983() {
      return this.f_13991;
   }

   @Generated
   public String m_4984() {
      return this.f_13992;
   }
}
