package dev.dimasik.client.system;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import lombok.Generated;

public class Class_fCHjdXAWhJKgAVQd {
   private final String f_19343;

   @Generated
   public String m_6459() {
      return this.f_19343;
   }

   @Generated
   public Class_fCHjdXAWhJKgAVQd(String var1) {
      this.f_19343 = var1;
   }

   public String m_6460() {
      try (InputStream var1 = this.getClass().getResourceAsStream("/lang/" + this.f_19343)) {
         return var1 == null ? null : new String(var1.readAllBytes(), StandardCharsets.UTF_8);
      } catch (Exception var6) {
         System.out.println(var6.getMessage());
         return null;
      }
   }
}
