package dev.dimasik.client.system;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.CorruptedFrameException;
import java.nio.charset.StandardCharsets;

public abstract class Class_WWrbI1EUeG9pWFgH {
   protected final Class_21mnc3xFjAMgFoyX f_15673;
   private final ByteBuf f_15674 = Unpooled.buffer(0, 1048576);

   public void m_5460(byte[] var1) {
      this.f_15674.writeInt(var1.length);
      this.f_15674.writeBytes(var1);
   }

   public String m_5461() {
      return new String(this.m_5464(), StandardCharsets.UTF_8);
   }

   @Override
   public String toString() {
      return "Packet[name=" + this.f_15673.m_927() + ", bound=" + this.f_15673.m_928() + "]";
   }

   public abstract void m_805();

   public Class_WWrbI1EUeG9pWFgH(Class_21mnc3xFjAMgFoyX var1) {
      this.f_15673 = var1;
   }

   public void m_5462(String var1) {
      this.m_5460(var1.getBytes(StandardCharsets.UTF_8));
   }

   public Class_21mnc3xFjAMgFoyX m_5463() {
      return this.f_15673;
   }

   public byte[] m_5464() {
      if (this.f_15674.readableBytes() < 4) {
         throw new CorruptedFrameException("Missing IRC packet field");
      } else {
         int var1 = this.f_15674.readInt();
         if (var1 >= 0 && var1 <= this.f_15674.readableBytes()) {
            byte[] var2 = new byte[var1];
            this.f_15674.readBytes(var2);
            return var2;
         } else {
            throw new CorruptedFrameException("Invalid IRC packet field length");
         }
      }
   }

   public ByteBuf m_5465() {
      return this.f_15674;
   }
}
