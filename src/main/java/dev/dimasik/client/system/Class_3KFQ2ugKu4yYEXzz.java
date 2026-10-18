package dev.dimasik.client.system;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.KeyStore;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.function.Consumer;
import javax.naming.InvalidNameException;
import javax.naming.ldap.LdapName;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509TrustManager;

public final class Class_3KFQ2ugKu4yYEXzz implements AutoCloseable {
   private static final int f_1358 = 8000;
   private static final String f_1359 = "boot-01.net.anydesk.com";
   private final Consumer<Class_3KFQ2ugKu4yYEXzz.DY8OyIiySD4NpM3P> f_1360;
   private volatile Class_Zu53NtHusCtdriRX f_1361 = Class_Zu53NtHusCtdriRX.NONE;
   private Class_3KFQ2ugKu4yYEXzz.Class_10sTl6Kxa0SEP7V6 f_1362;
   private static final String f_1363 = "Dimasik-AnyDesk";
   private static final String f_1364 = "Creating a fresh identity";
   private static final long f_1365 = 1000L;
   private static final String f_1366 = "Stopped";
   private static final String f_1367 = "Stopped";
   private static final String f_1368 = "Stopped";
   private static final String f_1369 = "Stopped";
   private static final String f_1370 = "boot-01.net.anydesk.com";
   private static final String f_1371 = "Relay redirect loop";
   private static final String f_1372 = "TLSv1.2";
   private static final String f_1373 = "Expected relay version offer";
   private static final String f_1374 = "Invalid registration channel";
   private static final String f_1375 = "Expected relay acknowledgement";
   private static final String f_1376 = "Registered; automatic acceptance enabled";
   private static final String f_1377 = "Relay redirect limit";
   private static final int f_1378 = 65534;
   private static final int f_1379 = 65534;
   private static final String f_1380 = "Unsupported channel closure revision";
   private static final String f_1381 = "Relay closed the transport; reconnecting";
   private static final String f_1382 = "Invalid session termination";
   private static final String f_1383 = "Session negotiation held open";
   private static final String f_1384 = "Approval sent; screen and input are not implemented";
   private static final long f_1385 = 6L;
   private static final String f_1386 = "Peer closed connection";
   private static final long f_1387 = 8000000000L;
   private static final int f_1388 = 65535;
   private static final String f_1389 = "Invalid frame length";
   private static final String f_1390 = "Packet deadline exceeded";
   private static final long f_1391 = 1000000L;
   private static final String f_1392 = "Peer closed connection";
   private static final String f_1393 = "/assets/dimasik/anydesk/anynet-root-ca-2.pem";
   private static final String f_1394 = "Missing AnyNet root certificate resource";
   private static final String f_1395 = "X.509";
   private static final String f_1396 = "anynet-root-ca-2";
   private static final String f_1397 = "TLS";

   private static byte[] m_1278(Socket var0, InputStream var1, int var2, long var3) throws IOException {
      byte[] var5 = new byte[var2];
      int var6 = 0;

      while (var6 < var2) {
         long var7 = var3 - System.nanoTime();
         if (var7 <= 0L) {
            throw new SocketTimeoutException(f_1390);
         }

         var0.setSoTimeout((int)Math.max(1L, var7 / f_1391));
         int var9 = var1.read(var5, var6, var2 - var6);
         if (var9 < 0) {
            throw new EOFException(f_1392);
         }

         var6 += var9;
      }

      return var5;
   }

   public static Class_b4eSpB4hig30Hstc.QDVpMCn9sXJ8MmPo m_1279(Socket var0, boolean var1) throws IOException {
      InputStream var2 = var0.getInputStream();
      var0.setSoTimeout(var1 ? 500 : 8000);

      int var3;
      try {
         var3 = var2.read();
      } catch (SocketTimeoutException var8) {
         if (var1) {
            return null;
         }

         throw var8;
      }

      if (var3 < 0) {
         throw new EOFException(f_1386);
      } else {
         long var4 = System.nanoTime() + f_1387;
         int var6 = var3 << 8 | m_1278(var0, var2, 1, var4)[0] & 255;
         if (var6 >= 3 && var6 < f_1388) {
            byte[] var7 = m_1278(var0, var2, var6, var4);
            return new Class_b4eSpB4hig30Hstc.QDVpMCn9sXJ8MmPo((var7[0] & 255) << 8 | var7[1] & 255, var7[2] & 255, Arrays.copyOfRange(var7, 3, var7.length));
         } else {
            throw new IOException(f_1389);
         }
      }
   }

   private static void m_1281(Socket var0, int var1, int var2, byte[] var3) throws IOException {
      m_1288(var0, var1, 0, Class_b4eSpB4hig30Hstc.m_5983(var2, var3));
   }

   public Class_3KFQ2ugKu4yYEXzz(Consumer<Class_3KFQ2ugKu4yYEXzz.DY8OyIiySD4NpM3P> var1) {
      this.f_1360 = var1;
   }

   private void m_1282(Class_3KFQ2ugKu4yYEXzz.Class_10sTl6Kxa0SEP7V6 var1, SSLSocket var2, long var3) throws IOException {
      HashMap var5 = new HashMap();
      HashMap var6 = new HashMap();
      HashMap<Integer, Class_b4eSpB4hig30Hstc.HXwikfalbHtKiadH> var7 = new HashMap<>();
      HashSet var8 = new HashSet();
      byte var9 = 1;

      while (!var1.f_1346) {
         Class_b4eSpB4hig30Hstc.QDVpMCn9sXJ8MmPo var10 = m_1279(var2, true);
         if (var10 != null) {
            int var11 = var10.channel();
            if (var11 == 0 && var10.type() == 10) {
               if (var5.size() < 4) {
                  Class_b4eSpB4hig30Hstc.a2pHXXJneXM9qKl8 var19 = Class_b4eSpB4hig30Hstc.m_5992(var10.body());

                  while (var5.containsKey(Integer.valueOf(var9))) {
                     var9 = (byte)(var9 == f_1378 ? 1 : var9 + 1);
                  }

                  var5.put(Integer.valueOf(var9), var19);
                  var6.put(Integer.valueOf(var9), Class_at8LAmyG6HvaHPq2.m_5942(var10.body()));
                  m_1288(var2, 0, 11, Class_b4eSpB4hig30Hstc.m_5991(var19.token(), var9));
                  var9 = (byte)(var9 == f_1379 ? 1 : var9 + 1);
               }
            } else if (var11 == 0 && var10.type() == 14) {
               Class_b4eSpB4hig30Hstc.G3oW5dpyVPTggMO0 var18 = new Class_b4eSpB4hig30Hstc.G3oW5dpyVPTggMO0(var10.body());
               if (var18.m_5970() != 0) {
                  throw new IOException(f_1380);
               }

               int var20 = var18.m_5971();
               int var21 = var18.m_5970();
               var18.m_5972();
               Class_b4eSpB4hig30Hstc.a2pHXXJneXM9qKl8 var22 = (Class_b4eSpB4hig30Hstc.a2pHXXJneXM9qKl8)var5.remove(var20);
               var6.remove(var20);
               var7.remove(var20);
               var8.remove(var20);
               if (var22 != null && var5.isEmpty()) {
                  this.m_1284(var1, Class_3KFQ2ugKu4yYEXzz.Awi1G1jsXYtlm7eR.ONLINE, var3, 0L, var21 + "");
               }
            } else {
               if (var11 == 0 && var10.type() == 3) {
                  throw new IOException(f_1381);
               }

               if (var5.containsKey(var11) && var10.type() == 0) {
                  for (Class_b4eSpB4hig30Hstc.Xy1fOUBjrcf6deKJ var13 : var7.computeIfAbsent(var11, var0 -> new Class_b4eSpB4hig30Hstc.HXwikfalbHtKiadH())
                     .m_5977(var10.body())) {
                     int var14 = var13.body()[0] & 255;
                     if (var14 == 2) {
                        if (var13.body().length != 2) {
                           throw new IOException(f_1382);
                        }

                        var5.remove(var11);
                        var6.remove(var11);
                        var7.remove(var11);
                        var8.remove(var11);
                        if (var5.isEmpty()) {
                           this.m_1284(var1, Class_3KFQ2ugKu4yYEXzz.Awi1G1jsXYtlm7eR.ONLINE, var3, 0L, (var13.body()[1] & 0xFF) + "");
                        }
                        break;
                     }

                     if (var14 == 0 && !var8.contains(var11)) {
                        int var15 = Class_b4eSpB4hig30Hstc.m_5989(var13.body());
                        Class_Zu53NtHusCtdriRX var16 = this.f_1361;
                        m_1291(var2, var11, var13.lane(), var15, var3, var16);
                        var8.add(var11);
                        String var17 = (String)var6.get(var11);
                        if (var16 == Class_Zu53NtHusCtdriRX.FREEZE) {
                           this.m_1283(
                              var1,
                              Class_3KFQ2ugKu4yYEXzz.Awi1G1jsXYtlm7eR.CONNECTING,
                              var3,
                              ((Class_b4eSpB4hig30Hstc.a2pHXXJneXM9qKl8)var5.get(var11)).peerId(),
                              var17,
                              f_1383
                           );
                        } else {
                           this.m_1283(
                              var1,
                              var16 == Class_Zu53NtHusCtdriRX.NONE
                                 ? Class_3KFQ2ugKu4yYEXzz.Awi1G1jsXYtlm7eR.APPROVED
                                 : Class_3KFQ2ugKu4yYEXzz.Awi1G1jsXYtlm7eR.SESSION_ERROR,
                              var3,
                              ((Class_b4eSpB4hig30Hstc.a2pHXXJneXM9qKl8)var5.get(var11)).peerId(),
                              var17,
                              var16 == Class_Zu53NtHusCtdriRX.NONE ? f_1384 : var16.m_5878()
                           );
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private synchronized void m_1283(
      Class_3KFQ2ugKu4yYEXzz.Class_10sTl6Kxa0SEP7V6 var1, Class_3KFQ2ugKu4yYEXzz.Awi1G1jsXYtlm7eR var2, long var3, long var5, String var7, String var8
   ) {
      if (this.f_1362 == var1 && !var1.f_1346) {
         this.f_1360.accept(new Class_3KFQ2ugKu4yYEXzz.DY8OyIiySD4NpM3P(var2, var3, var5, var7, var8));
      }
   }

   private synchronized void m_1284(
      Class_3KFQ2ugKu4yYEXzz.Class_10sTl6Kxa0SEP7V6 var1, Class_3KFQ2ugKu4yYEXzz.Awi1G1jsXYtlm7eR var2, long var3, long var5, String var7
   ) {
      this.m_1283(var1, var2, var3, var5, null, var7);
   }

   public static SSLContext m_1285() throws Exception {
      X509Certificate var0;
      try (InputStream var1 = Class_3KFQ2ugKu4yYEXzz.class.getResourceAsStream(f_1393)) {
         if (var1 == null) {
            throw new IOException(f_1394);
         }

         var0 = (X509Certificate)CertificateFactory.getInstance(f_1395).generateCertificate(var1);
      }

      var0.checkValidity();
      KeyStore var10 = KeyStore.getInstance(KeyStore.getDefaultType());
      var10.load(null, null);
      var10.setCertificateEntry(f_1396, var0);
      TrustManagerFactory var2 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
      var2.init(var10);
      final X509TrustManager var3 = (X509TrustManager)var2.getTrustManagers()[0];
      X509TrustManager var4 = new X509TrustManager() {
         public static final String f_1351 = "Unexpected AnyNet service certificate";
         public static final String f_1352 = "Invalid AnyNet service name";
         public static final String f_1353 = "CN";
         public static final String f_1354 = "AnyNet Relay";

         @Override
         public void checkClientTrusted(X509Certificate[] var1, String var2x) throws CertificateException {
            var3.checkClientTrusted(var1, var2x);
         }

         @Override
         public X509Certificate[] getAcceptedIssuers() {
            return var3.getAcceptedIssuers();
         }

         @Override
         public void checkServerTrusted(X509Certificate[] var1, String var2x) throws CertificateException {
            var3.checkServerTrusted(var1, var2x);

            try {
               boolean var3x = new LdapName(var1[0].getSubjectX500Principal().getName())
                  .getRdns()
                  .stream()
                  .anyMatch(var0x -> var0x.getType().equalsIgnoreCase(f_1353) && var0x.getValue().equals(f_1354));
               if (!var3x) {
                  throw new CertificateException(f_1351);
               }
            } catch (InvalidNameException var4x) {
               throw new CertificateException(f_1352, var4x);
            }
         }
      };
      final X509ExtendedKeyManager var5 = (X509ExtendedKeyManager)Class_SdKi3rS3HOcktY95.m_4703().getKeyManagers()[0];
      X509ExtendedKeyManager var6 = new X509ExtendedKeyManager() {
         public static final String f_1356 = "RSA";
         public static final String f_1357 = "ephemeral";

         @Override
         public String chooseEngineClientAlias(String[] var1, Principal[] var2x, SSLEngine var3x) {
            return this.m_1277(var1);
         }

         @Override
         public String chooseClientAlias(String[] var1, Principal[] var2x, Socket var3x) {
            return this.m_1277(var1);
         }

         public String m_1277(String[] var1) {
            return Arrays.asList(var1).contains(f_1356) ? f_1357 : null;
         }

         @Override
         public PrivateKey getPrivateKey(String var1) {
            return var5.getPrivateKey(var1);
         }

         @Override
         public String chooseServerAlias(String var1, Principal[] var2x, Socket var3x) {
            return null;
         }

         @Override
         public String[] getClientAliases(String var1, Principal[] var2x) {
            return var5.getClientAliases(var1, var2x);
         }

         @Override
         public String[] getServerAliases(String var1, Principal[] var2x) {
            return var5.getServerAliases(var1, var2x);
         }

         @Override
         public X509Certificate[] getCertificateChain(String var1) {
            return var5.getCertificateChain(var1);
         }
      };
      SSLContext var7 = SSLContext.getInstance(f_1397);
      var7.init(new KeyManager[]{var6}, new TrustManager[]{var4}, null);
      return var7;
   }

   public void m_1286(Class_Zu53NtHusCtdriRX var1) {
      this.f_1361 = Objects.requireNonNull(var1);
   }

   public synchronized void m_1287() {
      if (this.f_1362 == null) {
         Class_3KFQ2ugKu4yYEXzz.Class_10sTl6Kxa0SEP7V6 var1 = new Class_3KFQ2ugKu4yYEXzz.Class_10sTl6Kxa0SEP7V6();
         this.f_1362 = var1;
         var1.f_1347 = Thread.ofPlatform().daemon().name(f_1363).unstarted(() -> this.m_1289(var1));
         var1.f_1347.start();
      }
   }

   private static void m_1288(Socket var0, int var1, int var2, byte[] var3) throws IOException {
      var0.getOutputStream().write(Class_b4eSpB4hig30Hstc.m_5990(var1, var2, var3));
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void m_1289(Class_3KFQ2ugKu4yYEXzz.Class_10sTl6Kxa0SEP7V6 var1) {
      boolean var21 = false /* VF: Semaphore variable */;

      label250: {
         label251: {
            try {
               var21 = true;
               this.m_1283(var1, Class_3KFQ2ugKu4yYEXzz.Awi1G1jsXYtlm7eR.STARTING, 0L, 0L, "", f_1364);
               SSLContext var2 = m_1285();

               for (int var3 = 2; !var1.f_1346; var3 = Math.min(30, var3 * 2)) {
                  label231: {
                     try {
                        this.m_1292(var1, var2);
                        var3 = 2;
                        break label231;
                     } catch (Exception var35) {
                        if (!var1.f_1346) {
                           this.m_1283(
                              var1,
                              Class_3KFQ2ugKu4yYEXzz.Awi1G1jsXYtlm7eR.DISCONNECTED,
                              0L,
                              0L,
                              "",
                              var35.getMessage() == null ? var35.getClass().getSimpleName() : var35.getMessage()
                           );
                           break label231;
                        }
                     } finally {
                        var1.m_1273();
                     }

                     var21 = false;
                     break label250;
                  }

                  if (var1.f_1346) {
                     var21 = false;
                     break label250;
                  }

                  Thread.sleep(var3 * f_1365);
               }

               var21 = false;
               break label250;
            } catch (InterruptedException var37) {
               Thread.currentThread().interrupt();
               var21 = false;
            } catch (Exception var38) {
               this.m_1283(var1, Class_3KFQ2ugKu4yYEXzz.Awi1G1jsXYtlm7eR.ERROR, 0L, 0L, "", var38.toString());
               var21 = false;
               break label251;
            } finally {
               if (var21) {
                  var1.m_1273();
                  this.m_1283(var1, Class_3KFQ2ugKu4yYEXzz.Awi1G1jsXYtlm7eR.STOPPED, 0L, 0L, "", f_1369);
                  synchronized (this) {
                     if (this.f_1362 == var1) {
                        this.f_1362 = null;
                     }
                  }
               }
            }

            var1.m_1273();
            this.m_1283(var1, Class_3KFQ2ugKu4yYEXzz.Awi1G1jsXYtlm7eR.STOPPED, 0L, 0L, "", f_1367);
            synchronized (this) {
               if (this.f_1362 == var1) {
                  this.f_1362 = null;
               }

               return;
            }
         }

         var1.m_1273();
         this.m_1283(var1, Class_3KFQ2ugKu4yYEXzz.Awi1G1jsXYtlm7eR.STOPPED, 0L, 0L, "", f_1368);
         synchronized (this) {
            if (this.f_1362 == var1) {
               this.f_1362 = null;
            }

            return;
         }
      }

      var1.m_1273();
      this.m_1283(var1, Class_3KFQ2ugKu4yYEXzz.Awi1G1jsXYtlm7eR.STOPPED, 0L, 0L, "", f_1366);
      synchronized (this) {
         if (this.f_1362 == var1) {
            this.f_1362 = null;
         }
      }
   }

   public static void m_1291(Socket var0, int var1, int var2, int var3, long var4, Class_Zu53NtHusCtdriRX var6) throws IOException {
      Objects.requireNonNull(var6);
      if (var6 != Class_Zu53NtHusCtdriRX.FREEZE) {
         m_1281(var0, var1, var2, Class_b4eSpB4hig30Hstc.m_5987(var3, var4));
         if (var6 != Class_Zu53NtHusCtdriRX.NONE) {
            m_1281(var0, var1, 3, new byte[]{2, (byte)var6.m_5877()});
         } else {
            m_1281(var0, var1, 3, new byte[]{24, 0, 0, 0, 0, 0});
            m_1281(var0, var1, 3, new byte[]{5});

            for (int var10 : Class_b4eSpB4hig30Hstc.f_17559) {
               m_1281(var0, var1, 0, new Class_b4eSpB4hig30Hstc.foswAyT3VUTzdBQM().m_5981(f_1385, 1).m_5981(var10, 4).m_5981(0L, 4).m_5980());
            }

            m_1281(var0, var1, 3, new byte[]{8, 0, 0});
         }
      }
   }

   @Override
   public synchronized void close() {
      Class_3KFQ2ugKu4yYEXzz.Class_10sTl6Kxa0SEP7V6 var1 = this.f_1362;
      this.f_1362 = null;
      if (var1 != null) {
         var1.m_1275();
      }
   }

   private void m_1292(Class_3KFQ2ugKu4yYEXzz.Class_10sTl6Kxa0SEP7V6 var1, SSLContext var2) throws Exception {
      String var3 = f_1370;
      HashSet var4 = new HashSet();

      for (int var5 = 0; var5 < 3 && !var1.f_1346; var5++) {
         if (!var4.add(var3)) {
            throw new IOException(f_1371);
         }

         try (Socket var6 = new Socket()) {
            var1.m_1274(var6);
            var6.connect(new InetSocketAddress(var3, 443), 8000);

            try (SSLSocket var7 = (SSLSocket)var2.getSocketFactory().createSocket(var6, var3, 443, true)) {
               var1.m_1274(var7);
               var7.setEnabledProtocols(new String[]{f_1372});
               var7.setSoTimeout(8000);
               var7.startHandshake();
               Class_b4eSpB4hig30Hstc.QDVpMCn9sXJ8MmPo var8 = m_1279(var7, false);
               if (var8.channel() != 0 || var8.type() != 0) {
                  throw new IOException(f_1373);
               }

               m_1288(var7, 0, 1, Class_b4eSpB4hig30Hstc.m_5988(Class_b4eSpB4hig30Hstc.m_5984(var8.body())));
               Class_b4eSpB4hig30Hstc.QDVpMCn9sXJ8MmPo var9 = m_1279(var7, false);
               if (var9.channel() != 0) {
                  throw new IOException(f_1374);
               }

               if (var9.type() != 3) {
                  if (var9.type() != 2) {
                     throw new IOException(f_1375);
                  }

                  long var10 = Class_b4eSpB4hig30Hstc.m_5986(var9.body());
                  this.m_1284(var1, Class_3KFQ2ugKu4yYEXzz.Awi1G1jsXYtlm7eR.ONLINE, var10, 0L, f_1376);
                  this.m_1282(var1, var7, var10);
                  return;
               }

               var3 = Class_b4eSpB4hig30Hstc.m_5985(var9.body());
            }
         } finally {
            var1.m_1273();
         }
      }

      if (!var1.f_1346) {
         throw new IOException(f_1377);
      }
   }

   public enum Awi1G1jsXYtlm7eR {
      STARTING,
      ONLINE,
      APPROVED,
      SESSION_ERROR,
      DISCONNECTED,
      ERROR,
      STOPPED,
      CONNECTING;
   }

   private static final class Class_10sTl6Kxa0SEP7V6 {
      public volatile boolean f_1346;
      public Thread f_1347;
      public Socket f_1348;
      public static final String f_1349 = "Stopped";

      public synchronized void m_1273() {
         if (this.f_1348 != null) {
            try {
               this.f_1348.close();
            } catch (IOException var2) {
            }

            this.f_1348 = null;
         }
      }

      public synchronized void m_1274(Socket var1) throws IOException {
         if (this.f_1346) {
            var1.close();
            throw new IOException(f_1349);
         }

         this.f_1348 = var1;
      }

      public synchronized void m_1275() {
         this.f_1346 = true;
         this.m_1273();
         if (this.f_1347 != null) {
            this.f_1347.interrupt();
         }
      }

      public Class_10sTl6Kxa0SEP7V6() {
      }
   }

   public record DY8OyIiySD4NpM3P(Class_3KFQ2ugKu4yYEXzz.Awi1G1jsXYtlm7eR state, long clientId, long peerId, String peerIp, String detail) {
   }
}
