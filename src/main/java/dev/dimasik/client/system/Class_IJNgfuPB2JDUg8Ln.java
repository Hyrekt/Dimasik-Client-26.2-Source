package dev.dimasik.client.system;

import io.netty.channel.Channel;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.world.entity.player.Player;

public final class Class_IJNgfuPB2JDUg8Ln {
   private static final Class_IJNgfuPB2JDUg8Ln f_8261 = new Class_IJNgfuPB2JDUg8Ln();
   private static final Map<String, Class_sIga32lGjUfDbarq> f_8262 = Class_sIga32lGjUfDbarq.ALL
      .stream()
      .collect(Collectors.toUnmodifiableMap(Class_sIga32lGjUfDbarq::m_8684, var0 -> (Class_sIga32lGjUfDbarq)var0));
   private final Class_oBixj9CjP0K3d7AM f_8263 = new Class_oBixj9CjP0K3d7AM();
   private final UUID f_8264 = UUID.randomUUID();
   private BooleanSupplier f_8265 = () -> false;
   private BooleanSupplier f_8266 = () -> false;
   private BooleanSupplier f_8267 = () -> false;
   private boolean f_8268;
   private boolean f_8269;
   private Channel f_8270;
   private Class_IJNgfuPB2JDUg8Ln.M3t3buHBqLj7u8LG f_8271;
   private Class_ihAt1VjcwWMm2sNx f_8272;
   private long f_8273;
   private long f_8274;
   private long f_8275;
   private static final long f_8276 = 1000000000L;
   private static final String f_8277 = ":25565";
   private static final long f_8278 = 1000000000L;
   private static final String f_8279 = "Эмоция видна только вам: нет подтверждённой IRC-пати.";
   private static final String f_8280 = "Эмоция видна только вам: IRC не подключён или ещё проходит авторизацию.";
   private static final long f_8281 = 1000000L;
   private static final long f_8282 = 1000000L;
   private static final String f_8283 = "encrypt";
   private static final String f_8284 = "decrypt";
   private static final long f_8285 = 3500L;
   private static final String f_8286 = "Не удалось отправить эмоцию в IRC; синхронизация временно недоступна.";

   public boolean m_2951() {
      return this.f_8265.getAsBoolean();
   }

   public void m_2952() {
      Minecraft var1 = Minecraft.getInstance();
      Class_wOPwT7J4giBZsk46 var2 = Class_wOPwT7J4giBZsk46.m_9320();
      Channel var3 = var2 == null ? null : var2.m_9322().m_5922();
      if (var3 != null && !var3.isActive()) {
         var3 = null;
      }

      if (this.f_8270 != var3) {
         this.m_2971();
         this.f_8270 = var3;
         if (var3 != null) {
            this.m_2968(var2, var3, var1);
         }
      }

      if (var3 != null && System.nanoTime() - this.f_8275 >= f_8276) {
         this.f_8275 = System.nanoTime();
         this.m_2968(var2, var3, var1);
      }

      Class_IJNgfuPB2JDUg8Ln.M3t3buHBqLj7u8LG var4 = this.m_2964(var1, var2);
      if (!Objects.equals(this.f_8271, var4)) {
         this.m_2971();
         this.f_8271 = var4;
      }

      if (!this.m_2951()) {
         this.m_2971();
      } else if (this.f_8272 != null && this.f_8272.scope() != this.m_2979()) {
         this.m_2956();
      }
   }

   private void m_2953(Channel var1, Class_ihAt1VjcwWMm2sNx var2) {
      var1.writeAndFlush(new Class_S0ocPWvF7FQkKOGx(var2.encode(), var2.scope(), null)).addListener(var2x -> Minecraft.getInstance().execute(() -> {
         if (this.f_8270 == var1) {
            if (var2x.isSuccess()) {
               this.f_8269 = false;
            } else {
               this.m_2958(f_8286);
            }
         }
      }));
   }

   public void m_2956() {
      Class_ihAt1VjcwWMm2sNx var1 = this.f_8272;
      this.f_8272 = null;
      this.f_8274 = 0L;
      if (var1 != null && this.m_2957(this.f_8270)) {
         if (var1.scope() != Class_ihAt1VjcwWMm2sNx.Class_8QwRzQunfxrDe6RE.PARTY
            || var1.party().equalsIgnoreCase(Class_zZgIgQUpIcqCwBUw.m_9905().m_9934())
               && Objects.equals(var1.partySession(), Class_zZgIgQUpIcqCwBUw.m_9905().m_9899())) {
            this.m_2953(
               this.f_8270,
               new Class_ihAt1VjcwWMm2sNx(
                  1,
                  this.f_8264,
                  ++this.f_8273,
                  var1.m_7297(),
                  var1.player(),
                  var1.name(),
                  var1.member(),
                  var1.server(),
                  var1.dimension(),
                  var1.party(),
                  var1.partySession(),
                  var1.scope(),
                  var1.emote(),
                  var1.variant(),
                  Class_ihAt1VjcwWMm2sNx.k19EOlI5xzmGXgut.CLEAR,
                  var1.elapsedMillis(),
                  var1.stopAgeMillis(),
                  System.currentTimeMillis()
               )
            );
         }
      }
   }

   private boolean m_2957(Channel var1) {
      return var1 != null && var1.isActive() && var1.isWritable() && var1.pipeline().get(f_8283) != null && var1.pipeline().get(f_8284) != null;
   }

   private void m_2958(String var1) {
      if (!this.f_8269) {
         this.f_8269 = true;
         Class_ftHu9o3WzCU3Adxm.m_6731(var1);
      }
   }

   public void m_2959() {
      this.m_2952();
      this.m_2978(true);
   }

   public boolean m_2962(UUID var1, long var2) {
      Class_ihAt1VjcwWMm2sNx var4 = this.f_8263.m_7730(var1, var2);
      return var4 != null && var1.equals(this.m_2963(var4));
   }

   private UUID m_2963(Class_ihAt1VjcwWMm2sNx var1) {
      Minecraft var2 = Minecraft.getInstance();
      if (this.m_2951()
         && this.f_8271 != null
         && this.f_8271.world == var2.level
         && var2.player != null
         && !var1.player().equals(var2.player.getUUID())
         && this.f_8271.server.equals(var1.server())
         && this.f_8271.dimension.equals(var1.dimension())) {
         Player var3 = var2.level.getPlayerByUUID(var1.player());
         if (var3 == null || !var3.getGameProfile().name().equalsIgnoreCase(var1.name())) {
            var3 = var2.level.players().stream().filter(var1x -> var1x.getGameProfile().name().equalsIgnoreCase(var1.name())).findFirst().orElse(null);
         }

         if (var3 != null && var3 != var2.player && !var3.getUUID().equals(var2.player.getUUID())) {
            boolean var4 = Class_zZgIgQUpIcqCwBUw.m_9905().m_9883(var1.party(), var1.member(), var1.player(), var1.partySession());
            return var1.visibleTo(this.f_8266.getAsBoolean(), var4) ? var3.getUUID() : null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private Class_IJNgfuPB2JDUg8Ln.M3t3buHBqLj7u8LG m_2964(Minecraft var1, Class_wOPwT7J4giBZsk46 var2) {
      if (var1.player != null && var1.level != null) {
         ServerData var3 = var1.getConnection() == null ? null : var1.getConnection().getServerData();
         String var4 = var3 != null && !var1.isLocalServer() ? var3.ip.trim().toLowerCase(Locale.ROOT) : "";
         if (var4.endsWith(f_8277)) {
            var4 = var4.substring(0, var4.length() - 6);
         }

         Class_zZgIgQUpIcqCwBUw var5 = Class_zZgIgQUpIcqCwBUw.m_9905();
         String var6 = var5.m_9934();
         return new Class_IJNgfuPB2JDUg8Ln.M3t3buHBqLj7u8LG(
            var1.level,
            var1.player.getUUID(),
            var1.player.getGameProfile().name(),
            var2 == null ? "" : var2.m_9322().m_5924(),
            var4,
            var1.level.dimension().identifier().toString(),
            var6,
            var6.isEmpty() ? null : var5.m_9899()
         );
      } else {
         return null;
      }
   }

   private void m_2968(Class_wOPwT7J4giBZsk46 var1, Channel var2, Minecraft var3) {
      var2.eventLoop()
         .execute(
            () -> {
               if (var1.m_9322().m_5922() == var2 && var2.isActive()) {
                  Class_UmlsjJVsbloY4Viy var4 = var1.m_9319().m_2110();
                  boolean var5 = var4.stream()
                     .anyMatch(var0 -> var0 instanceof Class_S0ocPWvF7FQkKOGx var1xx && var1xx.m_4660() == Class_ihAt1VjcwWMm2sNx.Class_8QwRzQunfxrDe6RE.ALL);
                  boolean var6 = var4.stream()
                     .anyMatch(var0 -> var0 instanceof Class_S0ocPWvF7FQkKOGx var1xx && var1xx.m_4660() == Class_ihAt1VjcwWMm2sNx.Class_8QwRzQunfxrDe6RE.PARTY);
                  if (!var5 || !var6) {
                     var4.removeIf(var0 -> var0 instanceof Class_S0ocPWvF7FQkKOGx);

                     for (Class_ihAt1VjcwWMm2sNx.Class_8QwRzQunfxrDe6RE var10 : Class_ihAt1VjcwWMm2sNx.Class_8QwRzQunfxrDe6RE.values()) {
                        var4.add(new Class_S0ocPWvF7FQkKOGx("", var10, var3xx -> {
                           long var4x = System.currentTimeMillis();
                           var3.execute(() -> {
                              if (this.f_8270 == var2 && var2.isActive()) {
                                 this.m_2974(var3xx, var4x);
                              }
                           });
                        }));
                     }
                  }
               }
            }
         );
   }

   private boolean m_2969(Class_IJNgfuPB2JDUg8Ln.M3t3buHBqLj7u8LG var1) {
      Class_zZgIgQUpIcqCwBUw var2 = Class_zZgIgQUpIcqCwBUw.m_9905();
      return !var1.party.isEmpty() && var1.party.equalsIgnoreCase(var2.m_9934()) && Objects.equals(var1.partySession, var2.m_9899());
   }

   public void m_2970(BooleanSupplier var1, BooleanSupplier var2, BooleanSupplier var3) {
      this.f_8265 = var1;
      this.f_8266 = var2;
      this.f_8267 = var3;
      if (!this.f_8268) {
         this.f_8268 = true;
         ClientTickEvents.END_CLIENT_TICK.register(this::m_2980);
      }
   }

   public void m_2971() {
      this.m_2956();
      Class_GGEo7U6LC2t9Tb5z.m_2763();
      this.f_8263.m_7732();
      this.f_8269 = false;
   }

   public static Class_IJNgfuPB2JDUg8Ln m_2973() {
      return f_8261;
   }

   private void m_2974(Class_ihAt1VjcwWMm2sNx var1, long var2) {
      UUID var4 = this.m_2963(var1);
      if (var4 != null) {
         Class_sIga32lGjUfDbarq var5 = f_8262.get(var1.emote());
         if (var5 != null && var5.animations().contains(var1.variant())) {
            long var6 = Math.max(0L, System.currentTimeMillis() - var2);
            if (var6 < f_8285) {
               long var8 = System.nanoTime();
               if (this.f_8263.m_7729(var4, var1, var8)) {
                  Class_GGEo7U6LC2t9Tb5z.m_2759(var4, var1, var5, var8, var1.transitMillis(var2) + var6);
               }
            }
         }
      }
   }

   private void m_2978(boolean var1) {
      Class_GGEo7U6LC2t9Tb5z.xwEztf4lk4uL6X0r var2 = Class_GGEo7U6LC2t9Tb5z.m_2754();
      if (this.m_2951() && var2 != null && this.f_8271 != null) {
         long var3 = System.nanoTime();
         if (var1 || this.f_8272 == null || var3 - this.f_8274 >= f_8278) {
            if (this.m_2979() == Class_ihAt1VjcwWMm2sNx.Class_8QwRzQunfxrDe6RE.PARTY && !this.m_2969(this.f_8271)) {
               if (var1) {
                  this.m_2958(f_8279);
               }
            } else if (!this.m_2957(this.f_8270)) {
               if (var1) {
                  this.m_2958(f_8280);
               }
            } else {
               Class_ihAt1VjcwWMm2sNx.Class_8QwRzQunfxrDe6RE var5 = this.m_2979();
               String var6 = var5 == Class_ihAt1VjcwWMm2sNx.Class_8QwRzQunfxrDe6RE.PARTY ? this.f_8271.party : "";
               UUID var7 = var5 == Class_ihAt1VjcwWMm2sNx.Class_8QwRzQunfxrDe6RE.PARTY ? this.f_8271.partySession : null;
               Class_ihAt1VjcwWMm2sNx var8 = new Class_ihAt1VjcwWMm2sNx(
                  1,
                  this.f_8264,
                  ++this.f_8273,
                  var2.f_7685,
                  this.f_8271.player,
                  this.f_8271.name,
                  this.f_8271.member,
                  this.f_8271.server,
                  this.f_8271.dimension,
                  var6,
                  var7,
                  var5,
                  var2.f_7686.m_8684(),
                  var2.f_7687,
                  var2.f_7689.f_25503 == 0L ? Class_ihAt1VjcwWMm2sNx.k19EOlI5xzmGXgut.PLAY : Class_ihAt1VjcwWMm2sNx.k19EOlI5xzmGXgut.STOP,
                  Math.max(0L, (var3 - var2.f_7689.f_25502) / f_8281),
                  var2.f_7689.f_25503 == 0L ? 0L : Math.max(0L, (var3 - var2.f_7689.f_25503) / f_8282),
                  System.currentTimeMillis()
               );
               if (var8.valid()) {
                  this.f_8272 = var8;
                  this.f_8274 = var3;
                  this.m_2953(this.f_8270, var8);
               }
            }
         }
      }
   }

   private Class_ihAt1VjcwWMm2sNx.Class_8QwRzQunfxrDe6RE m_2979() {
      return this.f_8266.getAsBoolean() ? Class_ihAt1VjcwWMm2sNx.Class_8QwRzQunfxrDe6RE.PARTY : Class_ihAt1VjcwWMm2sNx.Class_8QwRzQunfxrDe6RE.ALL;
   }

   private void m_2980(Minecraft var1) {
      this.m_2952();
      if (this.m_2951() && this.f_8271 != null) {
         Class_GGEo7U6LC2t9Tb5z.m_2753(this.f_8267.getAsBoolean());
         this.m_2978(false);
         this.f_8263.m_7734(System.nanoTime());
      }
   }

   private record M3t3buHBqLj7u8LG(Object world, UUID player, String name, String member, String server, String dimension, String party, UUID partySession) {
   }
}
