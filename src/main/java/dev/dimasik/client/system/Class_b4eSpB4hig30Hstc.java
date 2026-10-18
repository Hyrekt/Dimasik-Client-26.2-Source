package dev.dimasik.client.system;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class Class_b4eSpB4hig30Hstc {
   public static final int f_17558 = 1048576;
   public static final int[] f_17559 = new int[]{1, 2, 3, 4, 7, 9, 10, 11, 12, 13, 14, 15};
   private static final int f_17560 = 65535;
   private static final int f_17561 = 65535;
   private static final String f_17562 = "Invalid relay frame";
   private static final String f_17563 = "No supported relay version";
   private static final long f_17564 = 6L;
   private static final long f_17565 = 5L;
   private static final String f_17566 = "Unsupported ACK revision";
   private static final String f_17567 = "Unknown ACK flags";
   private static final long f_17568 = 6L;
   private static final long f_17569 = 16L;
   private static final long f_17570 = 6L;
   private static final long f_17571 = 16L;
   private static final long f_17572 = 8L;
   private static final String f_17573 = "Relay did not assign an ID";
   private static final String f_17574 = "Unsupported relay terminal revision";
   private static final String f_17575 = ".net.anydesk.com";
   private static final String f_17576 = "Unsupported incoming request revision";
   private static final long f_17577 = 7L;
   private static final long f_17578 = 8L;
   private static final long f_17579 = 8L;
   private static final String f_17580 = "Expected session request";
   private static final String f_17581 = "Invalid excluded version count";
   private static final long f_17582 = 2L;
   private static final long f_17583 = 2L;
   private static final long f_17584 = 2L;
   private static final long f_17585 = 10L;
   private static final long f_17586 = 8L;
   private static final long f_17587 = 6L;
   private static final String f_17588 = "No supported session version";
   private static final String f_17589 = "Python transport test";
   private static final String f_17590 = "No screen or input access";
   private static final long f_17591 = 2L;
   private static final long f_17592 = 6L;
   private static final long f_17593 = 5L;
   private static final int f_17594 = 60000;
   private static final String f_17595 = "Invalid outgoing stream message";

   public static byte[] m_5983(int var0, byte[] var1) {
      if (var0 >= 0 && var0 <= 10 && var1.length != 0 && var1.length <= f_17594) {
         byte[] var2 = new Class_b4eSpB4hig30Hstc.foswAyT3VUTzdBQM().m_5982(var1.length).m_5978(var1).m_5980();
         byte[] var3 = new Class_b4eSpB4hig30Hstc.foswAyT3VUTzdBQM().m_5981(var0, 1).m_5982(var2.length).m_5978(var2).m_5980();
         return new Class_b4eSpB4hig30Hstc.foswAyT3VUTzdBQM().m_5982(var3.length).m_5978(var3).m_5980();
      } else {
         throw new IllegalArgumentException(f_17595);
      }
   }

   public static int m_5984(byte[] var0) throws IOException {
      Class_b4eSpB4hig30Hstc.G3oW5dpyVPTggMO0 var1 = new Class_b4eSpB4hig30Hstc.G3oW5dpyVPTggMO0(var0);
      int var2 = var1.m_5971();
      int var3 = var1.m_5971();
      int var4 = var1.m_5971();
      HashSet var5 = new HashSet();

      for (int var6 = 0; var6 < var4; var6++) {
         var5.add(var1.m_5971());
      }

      var1.m_5972();

      for (int var9 : new int[]{3, 2}) {
         if (var2 <= var9 && var9 <= var3 && !var5.contains(var9)) {
            return var9;
         }
      }

      throw new IOException(f_17563);
   }

   public static String m_5985(byte[] var0) throws IOException {
      Class_b4eSpB4hig30Hstc.G3oW5dpyVPTggMO0 var1 = new Class_b4eSpB4hig30Hstc.G3oW5dpyVPTggMO0(var0);
      if (var1.m_5970() != 1) {
         throw new IOException(f_17574);
      }

      int var2 = var1.m_5970();
      var1.m_5969();
      String var3 = null;
      int var4 = var1.m_5970();

      for (int var5 = 0; var5 < var4; var5++) {
         var1.m_5968(var1.m_5970());
         int var6 = var1.m_5970();

         for (int var7 = 0; var7 < var6; var7++) {
            var1.m_5969();
            String var8 = new String(var1.m_5968(var1.m_5970()), StandardCharsets.US_ASCII);
            int var9 = var1.m_5970();

            for (int var10 = 0; var10 < var9; var10++) {
               int var11 = var1.m_5971();
               if (var3 == null && var11 == 443 && var8.endsWith(f_17575)) {
                  var3 = var8;
               }
            }
         }
      }

      var1.m_5972();
      if (var3 == null) {
         throw new IOException(var2 + "");
      } else {
         return var3;
      }
   }

   public static long m_5986(byte[] var0) throws IOException {
      Class_b4eSpB4hig30Hstc.G3oW5dpyVPTggMO0 var1 = new Class_b4eSpB4hig30Hstc.G3oW5dpyVPTggMO0(var0);
      if (var1.m_5970() != 0) {
         throw new IOException(f_17566);
      }

      int var2 = var1.m_5971();
      if ((var2 & -256) != 0) {
         throw new IOException(f_17567);
      }

      long var3 = 0L;
      if ((var2 & 1) != 0) {
         var3 = var1.m_5969();
         var1.m_5975();
      }

      if ((var2 & 2) != 0) {
         var1.m_5968(f_17568);
      }

      if ((var2 & 4) != 0) {
         var1.m_5970();
         var1.m_5975();
         var1.m_5968(f_17569);
      }

      if ((var2 & 8) != 0) {
         var1.m_5968(f_17570);
      }

      if ((var2 & 16) != 0) {
         var1.m_5968(var1.m_5970());
      }

      if ((var2 & 32) != 0) {
         var1.m_5968(var1.m_5969() * f_17571);
      }

      if ((var2 & 64) != 0) {
         var1.m_5968(var1.m_5970() * f_17572);
      }

      if ((var2 & 128) != 0) {
         var1.m_5975();
      }

      var1.m_5972();
      if (var3 == 0L) {
         throw new IOException(f_17573);
      } else {
         return var3;
      }
   }

   public static byte[] m_5987(int var0, long var1) {
      return new Class_b4eSpB4hig30Hstc.foswAyT3VUTzdBQM()
         .m_5981(1L, 1)
         .m_5981(var0, 4)
         .m_5981(var1, 4)
         .m_5979(f_17589.getBytes(StandardCharsets.UTF_8))
         .m_5979(f_17590.getBytes(StandardCharsets.UTF_8))
         .m_5981(0L, 1)
         .m_5981(0L, 8)
         .m_5981(0L, 2)
         .m_5981(f_17591, 4)
         .m_5981(f_17592, 2)
         .m_5981(0L, 2)
         .m_5981(f_17593, 2)
         .m_5980();
   }

   public static byte[] m_5988(int var0) {
      return new Class_b4eSpB4hig30Hstc.foswAyT3VUTzdBQM()
         .m_5981(0L, 1)
         .m_5981(var0, 2)
         .m_5981(f_17564, 2)
         .m_5981(0L, 2)
         .m_5981(f_17565, 2)
         .m_5981(0L, 2)
         .m_5981(1L, 2)
         .m_5980();
   }

   public static int m_5989(byte[] var0) throws IOException {
      Class_b4eSpB4hig30Hstc.G3oW5dpyVPTggMO0 var1 = new Class_b4eSpB4hig30Hstc.G3oW5dpyVPTggMO0(var0);
      if (var1.m_5970() != 0) {
         throw new IOException(f_17580);
      }

      long var2 = var1.m_5969();
      var1.m_5969();
      var1.m_5975();
      var1.m_5975();
      if (var1.m_5970() != 0) {
         var1.m_5975();
      }

      long var4 = 1L;
      HashSet var6 = new HashSet();
      if (var1.m_5973() > 0) {
         var4 = var1.m_5969();
         long var7 = var1.m_5969();
         if (var7 > var1.m_5973() / 4) {
            throw new IOException(f_17581);
         }

         for (long var9 = 0L; var9 < var7; var9++) {
            var6.add(var1.m_5969());
         }

         if (var2 <= f_17582 && var4 >= f_17583 && !var6.contains(f_17584)) {
            var1.m_5970();
         }

         if (var1.m_5973() > 0) {
            var1.m_5968(f_17585);
         }

         if (var1.m_5973() > 0) {
            var1.m_5975();
            var1.m_5968(f_17586);
         }

         long var12 = var1.m_5973() > 0 ? var1.m_5969() : 0L;
         if ((var12 & 1L) != 0L) {
            var1.m_5968(f_17587);
         }
      }

      for (int var11 = 4; var11 >= 1; var11--) {
         if (var2 <= var11 && var11 <= var4 && !var6.contains((long)var11)) {
            return var11;
         }
      }

      throw new IOException(f_17588);
   }

   public static byte[] m_5990(int var0, int var1, byte[] var2) {
      if (var0 >= 0 && var0 < f_17560 && var2.length + 3 < f_17561) {
         return new Class_b4eSpB4hig30Hstc.foswAyT3VUTzdBQM().m_5981(var2.length + 3, 2).m_5981(var0, 2).m_5981(var1, 1).m_5978(var2).m_5980();
      } else {
         throw new IllegalArgumentException(f_17562);
      }
   }

   public static byte[] m_5991(long var0, int var2) {
      return new Class_b4eSpB4hig30Hstc.foswAyT3VUTzdBQM().m_5981(0L, 1).m_5981(var0, 4).m_5981(1L, 1).m_5981(var2, 2).m_5981(0L, 4).m_5980();
   }

   public static Class_b4eSpB4hig30Hstc.a2pHXXJneXM9qKl8 m_5992(byte[] var0) throws IOException {
      Class_b4eSpB4hig30Hstc.G3oW5dpyVPTggMO0 var1 = new Class_b4eSpB4hig30Hstc.G3oW5dpyVPTggMO0(var0);
      if (var1.m_5970() != 0) {
         throw new IOException(f_17576);
      }

      long var2 = var1.m_5969();
      int var4 = var1.m_5970();
      long var5 = var1.m_5969();
      var1.m_5971();
      var1.m_5968(var1.m_5969() * f_17577);
      if ((var4 & 8) != 0) {
         var1.m_5968(f_17578);
      }

      if ((var4 & 16) != 0) {
         var1.m_5968(f_17579);
      }

      var1.m_5972();
      return new Class_b4eSpB4hig30Hstc.a2pHXXJneXM9qKl8(var2, var5);
   }

   static final class Class_6A6oQ1sPI3qyiUAX {
      public byte[] f_17541 = new byte[0];
      public static final long f_17542 = 1048576L;
      public static final String f_17543 = "Stream buffer limit";
      public static final String f_17544 = "Varint32 overflow";
      public static final long f_17545 = 1048576L;
      public static final String f_17546 = "Invalid stream record length";

      public Class_6A6oQ1sPI3qyiUAX() {
      }

      public List<byte[]> m_5967(byte[] var1) throws IOException {
         if ((long)this.f_17541.length + var1.length > f_17542) {
            throw new IOException(f_17543);
         }

         byte[] var2 = Arrays.copyOf(this.f_17541, this.f_17541.length + var1.length);
         System.arraycopy(var1, 0, var2, this.f_17541.length, var1.length);
         ArrayList var3 = new ArrayList();
         int var4 = 0;

         label50:
         while (var4 < var2.length) {
            int var5 = var4;
            long var6 = 0L;
            boolean var8 = false;
            int var9 = 0;

            while (true) {
               if (var9 < 5 && var5 < var2.length) {
                  int var10 = var2[var5++] & 255;
                  if (var9 == 4 && var10 > 15) {
                     throw new IOException(f_17544);
                  }

                  var6 |= (long)(var10 & 127) << var9 * 7;
                  if (var10 >= 128) {
                     var9++;
                     continue;
                  }

                  var8 = true;
               }

               if (var8) {
                  if (var6 < 1L || var6 > f_17545) {
                     throw new IOException(f_17546);
                  }

                  if (var6 <= var2.length - var5) {
                     var3.add(Arrays.copyOfRange(var2, var5, var5 + (int)var6));
                     var4 = var5 + (int)var6;
                     break;
                  }
               }
               break label50;
            }
         }

         this.f_17541 = Arrays.copyOfRange(var2, var4, var2.length);
         return var3;
      }
   }

   static final class G3oW5dpyVPTggMO0 {
      public final byte[] f_17547;
      public int f_17548;
      public static final String f_17549 = "Truncated packet";
      public static final String f_17550 = "Truncated packet";
      public static final String f_17551 = "Varint32 overflow";
      public static final String f_17552 = "Unterminated varint";
      public static final String f_17553 = "Unexpected trailing data";

      public byte[] m_5968(long var1) throws IOException {
         if (var1 >= 0L && var1 <= this.m_5973()) {
            byte[] var3 = Arrays.copyOfRange(this.f_17547, this.f_17548, this.f_17548 + (int)var1);
            this.f_17548 += (int)var1;
            return var3;
         } else {
            throw new IOException(f_17549);
         }
      }

      public G3oW5dpyVPTggMO0(byte[] var1) {
         this.f_17547 = var1;
      }

      public long m_5969() throws IOException {
         return (long)this.m_5971() << 16 | this.m_5971();
      }

      public int m_5970() throws IOException {
         if (this.m_5973() == 0) {
            throw new IOException(f_17550);
         } else {
            return this.f_17547[this.f_17548++] & 0xFF;
         }
      }

      public int m_5971() throws IOException {
         return this.m_5970() << 8 | this.m_5970();
      }

      public void m_5972() throws IOException {
         if (this.m_5973() != 0) {
            throw new IOException(f_17553);
         }
      }

      public int m_5973() {
         return this.f_17547.length - this.f_17548;
      }

      public long m_5974() throws IOException {
         long var1 = 0L;

         for (int var3 = 0; var3 < 5; var3++) {
            int var4 = this.m_5970();
            if (var3 == 4 && var4 > 15) {
               throw new IOException(f_17551);
            }

            var1 |= (long)(var4 & 127) << 7 * var3;
            if (var4 < 128) {
               return var1;
            }
         }

         throw new IOException(f_17552);
      }

      public void m_5975() throws IOException {
         this.m_5968(this.m_5969());
      }
   }

   static final class HXwikfalbHtKiadH {
      public final Class_b4eSpB4hig30Hstc.Class_6A6oQ1sPI3qyiUAX f_17554 = new Class_b4eSpB4hig30Hstc.Class_6A6oQ1sPI3qyiUAX();
      public final Map<Integer, Class_b4eSpB4hig30Hstc.Class_6A6oQ1sPI3qyiUAX> f_17555 = new HashMap<>();
      public static final String f_17556 = "Unsupported stream lane";

      public HXwikfalbHtKiadH() {
      }

      public List<Class_b4eSpB4hig30Hstc.Xy1fOUBjrcf6deKJ> m_5977(byte[] var1) throws IOException {
         ArrayList var2 = new ArrayList();

         for (byte[] var4 : this.f_17554.m_5967(var1)) {
            Class_b4eSpB4hig30Hstc.G3oW5dpyVPTggMO0 var5 = new Class_b4eSpB4hig30Hstc.G3oW5dpyVPTggMO0(var4);

            while (var5.m_5973() > 0) {
               int var6 = var5.m_5970();
               if (var6 > 10) {
                  throw new IOException(f_17556);
               }

               byte[] var7 = var5.m_5968(var5.m_5974());

               for (byte[] var9 : this.f_17555.computeIfAbsent(var6, var0 -> new Class_b4eSpB4hig30Hstc.Class_6A6oQ1sPI3qyiUAX()).m_5967(var7)) {
                  var2.add(new Class_b4eSpB4hig30Hstc.Xy1fOUBjrcf6deKJ(var6, var9));
               }
            }
         }

         return var2;
      }
   }

   record QDVpMCn9sXJ8MmPo(int channel, int type, byte[] body) {
   }

   record Xy1fOUBjrcf6deKJ(int lane, byte[] body) {
   }

   record a2pHXXJneXM9qKl8(long token, long peerId) {
   }

   static final class foswAyT3VUTzdBQM {
      public final ByteArrayOutputStream f_17557 = new ByteArrayOutputStream();

      public Class_b4eSpB4hig30Hstc.foswAyT3VUTzdBQM m_5978(byte[] var1) {
         this.f_17557.writeBytes(var1);
         return this;
      }

      public Class_b4eSpB4hig30Hstc.foswAyT3VUTzdBQM m_5979(byte[] var1) {
         return this.m_5981(var1.length, 4).m_5978(var1);
      }

      public byte[] m_5980() {
         return this.f_17557.toByteArray();
      }

      public Class_b4eSpB4hig30Hstc.foswAyT3VUTzdBQM m_5981(long var1, int var3) {
         for (int var4 = var3 - 1; var4 >= 0; var4--) {
            this.f_17557.write((int)(var1 >>> 8 * var4));
         }

         return this;
      }

      public Class_b4eSpB4hig30Hstc.foswAyT3VUTzdBQM m_5982(int var1) {
         while (var1 >= 128) {
            this.f_17557.write(var1 & 127 | 128);
            var1 >>>= 7;
         }

         this.f_17557.write(var1);
         return this;
      }

      public foswAyT3VUTzdBQM() {
      }
   }
}
