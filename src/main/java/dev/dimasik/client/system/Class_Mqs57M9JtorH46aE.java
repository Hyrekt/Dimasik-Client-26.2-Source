package dev.dimasik.client.system;

import java.io.InputStream;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import lombok.Generated;

public final class Class_Mqs57M9JtorH46aE {
   public static byte[] m_3970(byte[] var0) {
      try {
         PrivateKey var1 = m_3971();
         if (var1 == null) {
            return null;
         }

         Signature var2 = Signature.getInstance("Ed25519");
         var2.initSign(var1);
         var2.update(var0);
         return var2.sign();
      } catch (Exception var3) {
         System.out.println(var3.getMessage());
         return null;
      }
   }

   private static PrivateKey m_3971() {
      try (InputStream var0 = Class_Mqs57M9JtorH46aE.class.getResourceAsStream("/certificate/private.key")) {
         if (var0 == null) {
            return null;
         }

         byte[] var1 = var0.readAllBytes();
         PKCS8EncodedKeySpec var2 = new PKCS8EncodedKeySpec(var1);
         KeyFactory var3 = KeyFactory.getInstance("Ed25519");
         return var3.generatePrivate(var2);
      } catch (Exception var7) {
         System.out.println(var7.getMessage());
         return null;
      }
   }

   @Generated
   private Class_Mqs57M9JtorH46aE() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
