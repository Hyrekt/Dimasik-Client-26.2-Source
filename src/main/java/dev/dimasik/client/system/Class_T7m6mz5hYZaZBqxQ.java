package dev.dimasik.client.system;

import com.google.gson.JsonParser;
import java.io.IOException;
import java.net.UnixDomainSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.function.Consumer;

public class Class_T7m6mz5hYZaZBqxQ extends Class_XW95mdWXA8ASk6kb {
   private final Selector f_13949 = Selector.open();
   private final SocketChannel f_13950;
   private final Consumer<Class_ymYHP3lFP8sH2Qwx> f_13951;

   public Class_T7m6mz5hYZaZBqxQ(String var1, Consumer<Class_ymYHP3lFP8sH2Qwx> var2) throws IOException {
      this.f_13950 = SocketChannel.open(UnixDomainSocketAddress.of(var1));
      this.f_13951 = var2;
      this.f_13950.configureBlocking(false);
      this.f_13950.register(this.f_13949, 1);
      Thread var3 = new Thread(this::m_4943);
      var3.setName("Discord IPC - Read thread");
      var3.start();
   }

   private void m_4943() {
      Class_T7m6mz5hYZaZBqxQ.pu3uOcgoQFnX9RDA var1 = Class_T7m6mz5hYZaZBqxQ.pu3uOcgoQFnX9RDA.Opcode;
      ByteBuffer var2 = ByteBuffer.allocate(4);
      ByteBuffer var3 = null;
      Class_1oU4qUSx9Czt18UL var4 = null;

      try {
         while (true) {
            this.f_13949.select();
            switch (var1) {
               case Opcode:
                  this.f_13950.read(var2);
                  if (!var2.hasRemaining()) {
                     var4 = Class_1oU4qUSx9Czt18UL.m_852(Integer.reverseBytes(var2.getInt(0)));
                     var1 = Class_T7m6mz5hYZaZBqxQ.pu3uOcgoQFnX9RDA.Length;
                     var2.rewind();
                  }
                  break;
               case Length:
                  this.f_13950.read(var2);
                  if (!var2.hasRemaining()) {
                     var3 = ByteBuffer.allocate(Integer.reverseBytes(var2.getInt(0)));
                     var1 = Class_T7m6mz5hYZaZBqxQ.pu3uOcgoQFnX9RDA.Data;
                     var2.rewind();
                  }
                  break;
               case Data:
                  this.f_13950.read(var3);
                  if (!var3.hasRemaining()) {
                     String var5 = Charset.defaultCharset().decode(var3.rewind()).toString();
                     this.f_13951.accept(new Class_ymYHP3lFP8sH2Qwx(var4, JsonParser.parseString(var5).getAsJsonObject()));
                     var3 = null;
                     var1 = Class_T7m6mz5hYZaZBqxQ.pu3uOcgoQFnX9RDA.Opcode;
                  }
            }
         }
      } catch (Exception var6) {
      }
   }

   @Override
   public void m_1980() {
      try {
         this.f_13949.close();
         this.f_13950.close();
      } catch (IOException var2) {
         var2.printStackTrace();
      }
   }

   @Override
   protected void m_1982(ByteBuffer var1) {
      try {
         this.f_13950.write(var1);
      } catch (IOException var3) {
         var3.printStackTrace();
      }
   }

   private enum pu3uOcgoQFnX9RDA {
      Opcode,
      Length,
      Data;
   }
}
