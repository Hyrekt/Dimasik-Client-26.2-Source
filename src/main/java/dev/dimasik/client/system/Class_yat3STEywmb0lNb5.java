package dev.dimasik.client.system;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Class_yat3STEywmb0lNb5 {
   private static final byte[] f_35469 = new byte[]{72, 67, 85, 49};
   private static final byte f_35470 = 1;
   private static final int f_35471 = 12;
   private static final int f_35472 = 128;
   private static final int f_35473 = f_35469.length + 1 + 12;
   private static final int f_35474 = f_35473 + 16;
   private static final byte[] f_35475 = Class_yat3STEywmb0lNb5.f_35519.getBytes(StandardCharsets.UTF_8);
   private static final byte[] f_35476 = Class_yat3STEywmb0lNb5.f_35520.getBytes(StandardCharsets.UTF_8);
   private static final byte[] f_35477 = Class_yat3STEywmb0lNb5.f_35521.getBytes(StandardCharsets.UTF_8);
   private static final byte[] f_35478 = Base64.getDecoder().decode(Class_yat3STEywmb0lNb5.f_35522);
   private static final String f_35479 = "scIej/F4xKYzCaLOJ8foi2JBh/56mLrb4WQwA45hBFI=";
   private static final String f_35480 = "cthckz58zUCvwpdZQNxDoOQXuwL2VEQy8c7wUakb4l8=";
   private static final String f_35481 = "+fnl0yJfvVY2VwTkHbslVEV+IU/y29RsQKALXWAf7gw=";
   private static final String f_35482 = "R5l4XDIL4QfF67Zk";
   private static final String f_35483 = "lgL2fFflxSMBXvpzcX9Z6MJSTBwyzb2EUG9CXOB6rv3W0vkwi+sqNVTj";
   private static final SecureRandom f_35484 = new SecureRandom();
   private static final String f_35485 = "asset";
   private static final String f_35486 = "asset";
   private static final String f_35487 = "plaintext";
   private static final String f_35488 = "Data is already encrypted by HasherUtils";
   private static final String f_35489 = "AES/GCM/NoPadding";
   private static final String f_35490 = "AES";
   private static final String f_35491 = "asset";
   private static final String f_35492 = "container";
   private static final String f_35493 = "Data is not a HasherUtils container";
   private static final String f_35494 = "Encrypted container is truncated";
   private static final String f_35495 = "AES/GCM/NoPadding";
   private static final String f_35496 = "AES";
   private static final String f_35497 = "input";
   private static final String f_35498 = "input";
   private static final String f_35499 = "input";
   private static final String f_35500 = "input";
   private static final String f_35501 = "input";
   private static final String f_35502 = "HmacSHA256";
   private static final String f_35503 = "HmacSHA256";
   private static final String f_35504 = "HmacSHA256";
   private static final String f_35505 = "HmacSHA256";
   private static final String f_35506 = "R5l4XDIL4QfF67Zk";
   private static final String f_35507 = "lgL2fFflxSMBXvpzcX9Z6MJSTBwyzb2EUG9CXOB6rv3W0vkwi+sqNVTj";
   private static final String f_35508 = "AES/GCM/NoPadding";
   private static final String f_35509 = "AES";
   private static final String f_35510 = "scIej/F4xKYzCaLOJ8foi2JBh/56mLrb4WQwA45hBFI=";
   private static final String f_35511 = "cthckz58zUCvwpdZQNxDoOQXuwL2VEQy8c7wUakb4l8=";
   private static final String f_35512 = "+fnl0yJfvVY2VwTkHbslVEV+IU/y29RsQKALXWAf7gw=";
   private static final String f_35513 = "SHA-256";
   private static final String f_35514 = "resourceContext";
   private static final String f_35515 = "/";
   private static final String f_35516 = "resourceContext must not be empty";
   private static final String f_35517 = "output";
   private static final String f_35518 = ".tmp";
   private static final String f_35519 = "HasherUtils.MasterKey.v1";
   private static final String f_35520 = "HasherUtils.Asset.v1";
   private static final String f_35521 = "HasherUtils.AssetKey.v1";
   private static final String f_35522 = "FrNjQZNRRPCHq8h+Kll0MgZNisPKPrfmYzzjEoL0s7I=";

   public static byte[] m_9671(InputStream var0, String var1) throws IOException, GeneralSecurityException {
      Objects.requireNonNull(var0, f_35498);
      return m_9674(var0.readAllBytes(), var1);
   }

   public static byte[] m_9672(byte[] var0) throws GeneralSecurityException {
      return m_9687(var0, f_35486);
   }

   private static String m_9673(String var0) {
      Objects.requireNonNull(var0, f_35514);
      String var1 = var0.trim().replace('\\', '/');

      while (var1.startsWith(f_35515)) {
         var1 = var1.substring(1);
      }

      if (var1.isEmpty()) {
         throw new IllegalArgumentException(f_35516);
      } else {
         return var1;
      }
   }

   public static byte[] m_9674(byte[] var0, String var1) throws GeneralSecurityException {
      Objects.requireNonNull(var0, f_35492);
      String var2 = m_9673(var1);
      if (!m_9680(var0)) {
         throw new IllegalArgumentException(f_35493);
      }

      if (var0.length < f_35474) {
         throw new IllegalArgumentException(f_35494);
      }

      ByteBuffer var3 = ByteBuffer.wrap(var0);
      var3.position(f_35469.length);
      byte var4 = var3.get();
      if (var4 != 1) {
         throw new IllegalArgumentException(var4 + "");
      }

      byte[] var5 = new byte[12];
      var3.get(var5);
      byte[] var6 = new byte[var3.remaining()];
      var3.get(var6);
      byte[] var7 = m_9675(var2);

      try {
         Cipher var8 = Cipher.getInstance(f_35495);
         var8.init(2, new SecretKeySpec(var7, f_35496), new GCMParameterSpec(128, var5));
         var8.updateAAD(m_9678(var2));
         return var8.doFinal(var6);
      } finally {
         Arrays.fill(var7, (byte)0);
         Arrays.fill(var6, (byte)0);
      }
   }

   private static byte[] m_9675(String var0) throws GeneralSecurityException {
      byte[] var1 = m_9685();
      byte[] var2 = null;

      try {
         Mac var3 = Mac.getInstance(f_35502);
         var3.init(new SecretKeySpec(f_35478, f_35503));
         var2 = var3.doFinal(var1);
         Mac var4 = Mac.getInstance(f_35504);
         var4.init(new SecretKeySpec(var2, f_35505));
         var4.update(f_35477);
         var4.update((byte)0);
         var4.update(var0.getBytes(StandardCharsets.UTF_8));
         var4.update((byte)1);
         return var4.doFinal();
      } finally {
         Arrays.fill(var1, (byte)0);
         if (var2 != null) {
            Arrays.fill(var2, (byte)0);
         }
      }
   }

   private Class_yat3STEywmb0lNb5() {
   }

   public static void m_9676(Path var0, Path var1, String var2) throws IOException, GeneralSecurityException {
      Objects.requireNonNull(var0, f_35500);
      byte[] var3 = Files.readAllBytes(var0);

      try {
         m_9681(var1, m_9687(var3, var2));
      } finally {
         Arrays.fill(var3, (byte)0);
      }
   }

   public static byte[] m_9677(byte[] var0) throws GeneralSecurityException {
      return m_9674(var0, f_35491);
   }

   private static byte[] m_9678(String var0) {
      byte[] var1 = var0.getBytes(StandardCharsets.UTF_8);
      ByteBuffer var2 = ByteBuffer.allocate(f_35476.length + 1 + var1.length);
      var2.put(f_35476);
      var2.put((byte)0);
      var2.put(var1);
      return var2.array();
   }

   private static byte[] m_9679() throws GeneralSecurityException {
      byte[] var0 = Base64.getDecoder().decode(f_35510);
      byte[] var1 = Base64.getDecoder().decode(f_35511);
      byte[] var2 = Base64.getDecoder().decode(f_35512);
      byte[] var3 = new byte[32];

      try {
         for (int var4 = 0; var4 < var3.length; var4++) {
            int var5 = Byte.toUnsignedInt(var0[var4]) ^ Byte.toUnsignedInt(var1[var4 * 7 + 3 & 31]);
            var5 = m_9682(var5, var4 & 7);
            var5 ^= Byte.toUnsignedInt(var2[var4 * 11 + 5 & 31]);
            var5 ^= var4 * 29 + 93 & 0xFF;
            var3[var4] = (byte)var5;
         }

         return MessageDigest.getInstance(f_35513).digest(var3);
      } finally {
         Arrays.fill(var0, (byte)0);
         Arrays.fill(var1, (byte)0);
         Arrays.fill(var2, (byte)0);
         Arrays.fill(var3, (byte)0);
      }
   }

   public static boolean m_9680(byte[] var0) {
      if (var0 != null && var0.length >= f_35469.length + 1) {
         for (int var1 = 0; var1 < f_35469.length; var1++) {
            if (var0[var1] != f_35469[var1]) {
               return false;
            }
         }

         return var0[f_35469.length] == 1;
      } else {
         return false;
      }
   }

   private static void m_9681(Path var0, byte[] var1) throws IOException {
      Objects.requireNonNull(var0, f_35517);
      Path var2 = var0.toAbsolutePath().normalize();
      Path var3 = var2.getParent();
      if (var3 == null) {
         throw new IOException(var0 + "");
      }

      Files.createDirectories(var3);
      Path var4 = Files.createTempFile(var3, var2.getFileName().toString(), f_35518);

      try {
         Files.write(var4, var1);

         try {
            Files.move(var4, var2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
         } catch (AtomicMoveNotSupportedException var9) {
            Files.move(var4, var2, StandardCopyOption.REPLACE_EXISTING);
         }
      } finally {
         Files.deleteIfExists(var4);
      }
   }

   private static int m_9682(int var0, int var1) {
      var0 &= 255;
      var1 &= 7;
      return var1 == 0 ? var0 : (var0 << var1 | var0 >>> 8 - var1) & 0xFF;
   }

   public static InputStream m_9683(InputStream var0, String var1) throws GeneralSecurityException, IOException {
      Objects.requireNonNull(var0, f_35499);
      byte[] var2 = var0.readAllBytes();
      byte[] var3 = m_9680(var2) ? m_9674(var2, var1) : var2;
      return new ByteArrayInputStream(var3);
   }

   public static void m_9684(Path var0, Path var1, String var2) throws IOException, GeneralSecurityException {
      Objects.requireNonNull(var0, f_35501);
      byte[] var3 = Files.readAllBytes(var0);
      byte[] var4 = null;

      try {
         var4 = m_9674(var3, var2);
         m_9681(var1, var4);
      } finally {
         Arrays.fill(var3, (byte)0);
         if (var4 != null) {
            Arrays.fill(var4, (byte)0);
         }
      }
   }

   private static byte[] m_9685() throws GeneralSecurityException {
      byte[] var0 = m_9679();
      byte[] var1 = Base64.getDecoder().decode(f_35506);
      byte[] var2 = Base64.getDecoder().decode(f_35507);

      try {
         Cipher var3 = Cipher.getInstance(f_35508);
         var3.init(2, new SecretKeySpec(var0, f_35509), new GCMParameterSpec(128, var1));
         var3.updateAAD(f_35475);
         return var3.doFinal(var2);
      } finally {
         Arrays.fill(var0, (byte)0);
         Arrays.fill(var1, (byte)0);
         Arrays.fill(var2, (byte)0);
      }
   }

   public static byte[] m_9686(InputStream var0, String var1) throws IOException, GeneralSecurityException {
      Objects.requireNonNull(var0, f_35497);
      return m_9687(var0.readAllBytes(), var1);
   }

   public static byte[] m_9687(byte[] var0, String var1) throws GeneralSecurityException {
      Objects.requireNonNull(var0, f_35487);
      String var2 = m_9673(var1);
      if (m_9680(var0)) {
         throw new IllegalArgumentException(f_35488);
      }

      byte[] var3 = new byte[12];
      f_35484.nextBytes(var3);
      byte[] var4 = m_9675(var2);

      try {
         Cipher var5 = Cipher.getInstance(f_35489);
         var5.init(1, new SecretKeySpec(var4, f_35490), new GCMParameterSpec(128, var3));
         var5.updateAAD(m_9678(var2));
         byte[] var6 = var5.doFinal(var0);
         ByteBuffer var7 = ByteBuffer.allocate(f_35473 + var6.length);
         var7.put(f_35469);
         var7.put((byte)1);
         var7.put(var3);
         var7.put(var6);
         return var7.array();
      } finally {
         Arrays.fill(var4, (byte)0);
      }
   }
}
