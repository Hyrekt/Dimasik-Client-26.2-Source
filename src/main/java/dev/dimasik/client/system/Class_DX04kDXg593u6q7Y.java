package dev.dimasik.client.system;

import lombok.Generated;

public enum Class_DX04kDXg593u6q7Y {
   ALL_USERS("all_users"),
   PARTY_ONLY("party_only"),
   USER_ONLY("user_only"),
   PARTY_USER_ONLY("party_user");

   private final String f_6411;

   public static Class_DX04kDXg593u6q7Y m_2453(String var0) {
      for (Class_DX04kDXg593u6q7Y var4 : values()) {
         if (var4.m_2454().equals(var0)) {
            return var4;
         }
      }

      return null;
   }

   @Generated
   public String m_2454() {
      return this.f_6411;
   }

   @Generated
   Class_DX04kDXg593u6q7Y(String var3) {
      this.f_6411 = var3;
   }
}
