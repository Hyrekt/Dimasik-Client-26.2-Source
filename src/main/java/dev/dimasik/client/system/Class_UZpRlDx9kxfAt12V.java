package dev.dimasik.client.system;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class Class_UZpRlDx9kxfAt12V extends SimpleChannelInboundHandler<Class_WWrbI1EUeG9pWFgH> {
   protected void channelRead0(ChannelHandlerContext var1, Class_WWrbI1EUeG9pWFgH var2) throws Exception {
      if (var2.m_5463().m_928().equals(Class_48kabFIKnaUEE9DR.BOTH) || var2.m_5463().m_928().equals(Class_48kabFIKnaUEE9DR.CLIENT)) {
         var2.m_805();
         if (var2 instanceof Class_dvQPdkxIrHFluhTN var3) {
            for (Class_dvQPdkxIrHFluhTN var5 : Class_wOPwT7J4giBZsk46.m_9320().m_9319().m_2108()) {
               if (var3.m_5463().equals(var5.m_5463())) {
                  var5.m_6353().m_4111(var3.m_5463().m_929());
                  Class_wOPwT7J4giBZsk46.m_9320().m_9319().m_2108().remove(var5);
               }
            }
         }
      }
   }
}
