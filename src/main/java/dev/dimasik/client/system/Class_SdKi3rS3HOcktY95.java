package dev.dimasik.client.system;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.HexFormat;
import javax.net.ssl.KeyManagerFactory;

public final class Class_SdKi3rS3HOcktY95 {
   private static final byte[] f_13297 = HexFormat.of().parseHex(Class_SdKi3rS3HOcktY95.f_13308);
   private static final String f_13298 = "RSA";
   private static final String f_13299 = "0603550403";
   private static final String f_13300 = "AnyDesk Client";
   private static final long f_13301 = 60L;
   private static final long f_13302 = 31536000L;
   private static final String f_13303 = "SHA256withRSA";
   private static final String f_13304 = "X.509";
   private static final String f_13305 = "PKCS12";
   private static final String f_13306 = "ephemeral";
   private static final String f_13307 = "yyyyMMddHHmmss'Z'";
   private static final String f_13308 = "300d06092a864886f70d01010b0500";

   private Class_SdKi3rS3HOcktY95() {
   }

   private static byte[] m_4701(Instant var0) {
      return m_4702(24, DateTimeFormatter.ofPattern(f_13307).withZone(ZoneOffset.UTC).format(var0).getBytes(StandardCharsets.US_ASCII));
   }

   private static byte[] m_4702(int var0, byte[]... var1) {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();

      for (byte[] var6 : var1) {
         var2.writeBytes(var6);
      }

      ByteArrayOutputStream var7 = new ByteArrayOutputStream();
      var7.write(var0);
      int var8 = var2.size();
      if (var8 < 128) {
         var7.write(var8);
      } else {
         int var9 = (32 - Integer.numberOfLeadingZeros(var8) + 7) / 8;
         var7.write(128 | var9);

         for (int var10 = var9 - 1; var10 >= 0; var10--) {
            var7.write(var8 >>> 8 * var10);
         }
      }

      var7.writeBytes(var2.toByteArray());
      return var7.toByteArray();
   }

   public static KeyManagerFactory m_4703() throws Exception {
      KeyPairGenerator var0 = KeyPairGenerator.getInstance(f_13298);
      var0.initialize(2048);
      KeyPair var1 = var0.generateKeyPair();
      byte[] var2 = m_4702(48, m_4702(49, m_4702(48, HexFormat.of().parseHex(f_13299), m_4702(12, f_13300.getBytes(StandardCharsets.UTF_8)))));
      Instant var3 = Instant.now();
      byte[] var4 = m_4702(
         48,
         m_4702(160, m_4702(2, new byte[]{2})),
         m_4702(2, new BigInteger(159, new SecureRandom()).add(BigInteger.ONE).toByteArray()),
         f_13297,
         var2,
         m_4702(48, m_4701(var3.minusSeconds(f_13301)), m_4701(var3.plusSeconds(f_13302))),
         var2,
         var1.getPublic().getEncoded()
      );
      Signature var5 = Signature.getInstance(f_13303);
      var5.initSign(var1.getPrivate());
      var5.update(var4);
      byte[] var6 = m_4702(48, var4, f_13297, m_4702(3, new byte[]{0}, var5.sign()));
      X509Certificate var7 = (X509Certificate)CertificateFactory.getInstance(f_13304).generateCertificate(new ByteArrayInputStream(var6));
      var7.checkValidity();
      var7.verify(var1.getPublic());
      KeyStore var8 = KeyStore.getInstance(f_13305);
      var8.load(null, null);
      char[] var9 = new char[0];
      var8.setKeyEntry(f_13306, var1.getPrivate(), var9, new X509Certificate[]{var7});
      KeyManagerFactory var10 = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
      var10.init(var8, var9);
      return var10;
   }
}
