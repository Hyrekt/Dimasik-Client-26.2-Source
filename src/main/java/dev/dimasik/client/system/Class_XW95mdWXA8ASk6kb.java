package dev.dimasik.client.system;

import com.google.gson.JsonObject;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.function.Consumer;

public abstract class Class_XW95mdWXA8ASk6kb {
   private static final String[] f_15970 = new String[]{"XDG_RUNTIME_DIR", "TMPDIR", "TMP", "TEMP"};

   public static Class_XW95mdWXA8ASk6kb m_5552(Consumer<Class_ymYHP3lFP8sH2Qwx> var0) {
      String var1 = System.getProperty("os.name").toLowerCase();
      if (var1.contains("win")) {
         for (int var10 = 0; var10 < 10; var10++) {
            try {
               return new Class_9Ytv5OM3SGl0rRrB("\\\\.\\pipe\\discord-ipc-" + var10, var0);
            } catch (IOException var7) {
            }
         }
      } else {
         String var2 = null;

         for (String var6 : f_15970) {
            var2 = System.getenv(var6);
            if (var2 != null) {
               break;
            }
         }

         if (var2 == null) {
            var2 = "/tmp";
         }

         var2 = var2 + "/discord-ipc-";

         for (int var11 = 0; var11 < 10; var11++) {
            try {
               return new Class_T7m6mz5hYZaZBqxQ(var2 + var11, var0);
            } catch (IOException var8) {
            }
         }
      }

      return null;
   }

   public void m_5553(Class_1oU4qUSx9Czt18UL var1, JsonObject var2) {
      var2.addProperty("nonce", UUID.randomUUID().toString());
      byte[] var3 = var2.toString().getBytes();
      ByteBuffer var4 = ByteBuffer.allocate(var3.length + 8);
      var4.putInt(Integer.reverseBytes(var1.ordinal()));
      var4.putInt(Integer.reverseBytes(var3.length));
      var4.put(var3);
      var4.rewind();
      this.m_1982(var4);
   }

   public abstract void m_1980();

   protected abstract void m_1982(ByteBuffer var1);
}
