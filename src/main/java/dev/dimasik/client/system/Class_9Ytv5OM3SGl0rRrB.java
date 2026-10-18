package dev.dimasik.client.system;

import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.function.Consumer;

public class Class_9Ytv5OM3SGl0rRrB extends Class_XW95mdWXA8ASk6kb {
   private final RandomAccessFile f_4773;
   private final Consumer<Class_ymYHP3lFP8sH2Qwx> f_4774;

   private void m_1979(ByteBuffer var1) throws IOException {
      var1.rewind();

      while (this.f_4773.length() < var1.remaining()) {
         Thread.onSpinWait();

         try {
            Thread.sleep(100L);
         } catch (InterruptedException var3) {
            var3.printStackTrace();
         }
      }

      while (var1.hasRemaining()) {
         this.f_4773.getChannel().read(var1);
      }
   }

   public Class_9Ytv5OM3SGl0rRrB(String var1, Consumer<Class_ymYHP3lFP8sH2Qwx> var2) throws IOException {
      this.f_4773 = new RandomAccessFile(var1, "rw");
      this.f_4774 = var2;
      Thread var3 = new Thread(this::m_1981);
      var3.setName("Discord IPC - Read thread");
      var3.start();
   }

   @Override
   public void m_1980() {
      try {
         this.f_4773.close();
      } catch (IOException var2) {
         var2.printStackTrace();
      }
   }

   private void m_1981() {
      ByteBuffer var1 = ByteBuffer.allocate(4);

      try {
         while (true) {
            this.m_1979(var1);
            Class_1oU4qUSx9Czt18UL var2 = Class_1oU4qUSx9Czt18UL.m_852(Integer.reverseBytes(var1.getInt(0)));
            this.m_1979(var1);
            int var3 = Integer.reverseBytes(var1.getInt(0));
            ByteBuffer var4 = ByteBuffer.allocate(var3);
            this.m_1979(var4);
            String var5 = Charset.defaultCharset().decode(var4.rewind()).toString();
            this.f_4774.accept(new Class_ymYHP3lFP8sH2Qwx(var2, JsonParser.parseString(var5).getAsJsonObject()));
         }
      } catch (Exception var6) {
      }
   }

   @Override
   protected void m_1982(ByteBuffer var1) {
      try {
         this.f_4773.write(var1.array());
      } catch (IOException var3) {
         var3.printStackTrace();
      }
   }
}
