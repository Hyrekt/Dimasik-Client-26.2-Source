package dev.dimasik.client.system;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.ChannelPromise;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.util.ReferenceCountUtil;
import io.netty.util.concurrent.DefaultThreadFactory;
import io.netty.util.concurrent.ScheduledFuture;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

public class Class_wOPwT7J4giBZsk46 implements AutoCloseable {
   private static volatile Class_wOPwT7J4giBZsk46 f_34371;
   private final Class_Aw7lyJgq47TxJz61 f_34372 = new Class_Aw7lyJgq47TxJz61();
   private final Class_af3Ycb5na5ILQiHH f_34373 = new Class_af3Ycb5na5ILQiHH();
   private final EventLoopGroup f_34374 = new NioEventLoopGroup(1, new DefaultThreadFactory("dimasik-irc", true));
   private final String f_34375;
   private final int f_34376;
   private volatile Channel f_34377;
   private volatile boolean f_34378;
   private volatile boolean f_34379;
   private volatile boolean f_34380;
   private volatile String f_34381 = "";
   private boolean f_34382;
   private int f_34383;
   private ScheduledFuture<?> f_34384;

   public Class_wOPwT7J4giBZsk46(String var1, int var2, String var3, String var4) {
      this(var1, var2, var3, var4, true);
   }

   public String m_9314() {
      return this.f_34381;
   }

   public boolean m_9315() {
      return !this.f_34379 && !this.f_34380 && this.f_34378 && this.f_34377 != null && this.f_34377.isActive();
   }

   private void m_9316() {
      if (!this.f_34379 && !this.f_34380 && !this.f_34382 && (this.f_34377 == null || !this.f_34377.isActive())) {
         if (this.f_34384 != null) {
            this.f_34384.cancel(false);
         }

         this.f_34384 = null;
         this.f_34382 = true;
         this.f_34378 = false;
         ((Bootstrap)((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group(this.f_34374)).channel(NioSocketChannel.class))
                  .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 5000))
               .handler(
                  new ChannelInitializer<NioSocketChannel>() {
                     protected void initChannel(final NioSocketChannel var1) {
                        if (!Class_wOPwT7J4giBZsk46.this.f_34379 && !Class_wOPwT7J4giBZsk46.this.f_34380) {
                           Class_wOPwT7J4giBZsk46.this.f_34377 = var1;
                           Class_wOPwT7J4giBZsk46.this.f_34373.m_5920(var1);
                           final ChannelPipeline var2 = var1.pipeline();
                           Class_wOPwT7J4giBZsk46.this.f_34373.m_5921(var2);
                           var2.addLast("pause", new ChannelDuplexHandler() {
                              public void channelRead(ChannelHandlerContext var1, Object var2x) throws Exception {
                                 if (!Class_wOPwT7J4giBZsk46.this.f_34380 && !Class_wOPwT7J4giBZsk46.this.f_34379) {
                                    super.channelRead(var1, var2x);
                                 } else {
                                    ReferenceCountUtil.release(var2x);
                                 }
                              }

                              public void write(ChannelHandlerContext var1, Object var2x, ChannelPromise var3) throws Exception {
                                 if (!Class_wOPwT7J4giBZsk46.this.f_34380 && !Class_wOPwT7J4giBZsk46.this.f_34379) {
                                    super.write(var1, var2x, var3);
                                 } else {
                                    ReferenceCountUtil.release(var2x);
                                    var3.tryFailure(new ClosedChannelException());
                                 }
                              }
                           });
                           var2.addLast(new ChannelHandler[]{new LengthFieldBasedFrameDecoder(1048576, 0, 4, 0, 4)});
                           var2.addLast(new ChannelHandler[]{new LengthFieldPrepender(4)});
                           var2.addLast("inbound", new Class_kS0M4HubRdfgnz9w());
                           var2.addLast(
                              "connection",
                              new ChannelInboundHandlerAdapter() {
                                 public ScheduledFuture<?> f_34366;

                                 public void channelActive(ChannelHandlerContext var1x) throws Exception {
                                    if (!Class_wOPwT7J4giBZsk46.this.f_34379 && !Class_wOPwT7J4giBZsk46.this.f_34380) {
                                       this.f_34366 = var1x.executor().schedule(() -> {
                                          if (!Class_wOPwT7J4giBZsk46.this.f_34378) {
                                             Class_wOPwT7J4giBZsk46.this.f_34381 = "IRC authorization timed out";
                                             var1x.close();
                                          }
                                       }, 15L, TimeUnit.SECONDS);
                                       super.channelActive(var1x);
                                    } else {
                                       var1x.close();
                                    }
                                 }

                                 public void channelInactive(ChannelHandlerContext var1x) throws Exception {
                                    if (this.f_34366 != null) {
                                       this.f_34366.cancel(false);
                                    }

                                    if (Class_wOPwT7J4giBZsk46.this.f_34377 == var1) {
                                       Class_wOPwT7J4giBZsk46.this.f_34378 = false;
                                       Class_wOPwT7J4giBZsk46.this.f_34382 = false;
                                       Class_wOPwT7J4giBZsk46.this.m_9324();
                                    }

                                    super.channelInactive(var1x);
                                 }

                                 public void channelRead(ChannelHandlerContext var1x, Object var2x) throws Exception {
                                    if (!Class_wOPwT7J4giBZsk46.this.f_34380 && !Class_wOPwT7J4giBZsk46.this.f_34379) {
                                       super.channelRead(var1x, var2x);
                                       if (var2x instanceof Class_Su2v52eSNvYVtuLd
                                          && var2.get("encrypt") != null
                                          && var2.get("decrypt") != null
                                          && var1.isActive()
                                          && !Class_wOPwT7J4giBZsk46.this.f_34380
                                          && !Class_wOPwT7J4giBZsk46.this.f_34379) {
                                          Class_wOPwT7J4giBZsk46.this.f_34378 = true;
                                          Class_wOPwT7J4giBZsk46.this.f_34381 = "";
                                          Class_wOPwT7J4giBZsk46.this.f_34383 = 0;
                                          if (this.f_34366 != null) {
                                             this.f_34366.cancel(false);
                                          }
                                       }
                                    } else {
                                       ReferenceCountUtil.release(var2x);
                                    }
                                 }
                              }
                           );
                           var2.addLast("main", new Class_UZpRlDx9kxfAt12V());
                           var2.addLast("custom", new Class_qc67OST5mvXox4Tu());
                           var2.addLast("outbound", new Class_cKA8UR5jmkeiP9hs());
                           var2.addLast("errors", new ChannelInboundHandlerAdapter() {
                              public void exceptionCaught(ChannelHandlerContext var1, Throwable var2x) {
                                 Class_wOPwT7J4giBZsk46.this.f_34381 = var2x.getClass().getSimpleName() + ": " + var2x.getMessage();
                                 var1.close();
                              }
                           });
                        } else {
                           var1.close();
                        }
                     }
                  }
               ))
            .connect(this.f_34375, this.f_34376)
            .addListener(var1 -> {
               this.f_34382 = false;
               if (!var1.isSuccess()) {
                  this.f_34381 = String.valueOf(var1.cause());
                  this.m_9324();
               }
            });
      }
   }

   public void m_9317(boolean var1) {
      if (!this.f_34379 && this.f_34380 != var1) {
         this.f_34380 = var1;
         if (!var1) {
            this.m_9321();
         } else {
            this.f_34378 = false;

            try {
               this.f_34374.next().execute(() -> {
                  if (this.f_34380) {
                     if (this.f_34384 != null) {
                        this.f_34384.cancel(false);
                     }

                     this.f_34384 = null;
                     if (this.f_34377 != null) {
                        this.f_34377.close();
                     }
                  }
               });
            } catch (RejectedExecutionException var3) {
               if (!this.f_34379) {
                  throw var3;
               }
            }
         }
      }
   }

   public boolean m_9318() {
      return this.f_34380;
   }

   public Class_Aw7lyJgq47TxJz61 m_9319() {
      return this.f_34372;
   }

   public static Class_wOPwT7J4giBZsk46 m_9320() {
      return f_34371;
   }

   public void m_9321() {
      if (!this.f_34379 && !this.f_34380) {
         try {
            this.f_34374.next().execute(this::m_9316);
         } catch (RejectedExecutionException var2) {
            if (!this.f_34379) {
               throw var2;
            }
         }
      }
   }

   public Class_af3Ycb5na5ILQiHH m_9322() {
      return this.f_34373;
   }

   public Channel m_9323() {
      return this.f_34380 ? null : this.f_34377;
   }

   private void m_9324() {
      if (!this.f_34379 && !this.f_34380 && (this.f_34384 == null || this.f_34384.isDone())) {
         long var1 = Math.min(30L, 1L << Math.min(this.f_34383++, 5));
         this.f_34384 = this.f_34374.next().schedule(this::m_9316, var1, TimeUnit.SECONDS);
      }
   }

   @Override
   public void close() {
      this.f_34379 = true;
      this.f_34378 = false;
      if (this.f_34377 != null) {
         this.f_34377.close();
      }

      this.f_34374.shutdownGracefully(0L, 2L, TimeUnit.SECONDS);
   }

   public Class_wOPwT7J4giBZsk46(String var1, int var2, String var3, String var4, boolean var5) {
      this.f_34375 = var1;
      this.f_34376 = var2;
      this.f_34373.m_5918(var3);
      this.f_34373.m_5919(var4);
      Class_wOPwT7J4giBZsk46 var6 = f_34371;
      if (var6 != null) {
         var6.close();
      }

      f_34371 = this;
      if (var5) {
         this.m_9321();
      }
   }
}
