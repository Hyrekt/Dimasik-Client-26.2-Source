package dev.dimasik.client.system;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dev.dimasik.client.ui.screen.Screen_7;
import io.netty.channel.Channel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.Minecraft;

public final class Class_wrEVVKLbnt6Fm3mm {
   private static final Class_wrEVVKLbnt6Fm3mm f_34586 = new Class_wrEVVKLbnt6Fm3mm();
   private Channel f_34587;
   private boolean f_34588;
   private boolean f_34589;
   private boolean f_34590;
   private JsonObject f_34591 = new JsonObject();
   private JsonObject f_34592;
   private JsonObject f_34593;
   public final Map<String, String> f_34594 = new HashMap<>();
   private Runnable f_34595;
   private long f_34596;
   private long f_34597;
   private long f_34598;
   private String f_34599 = "";
   private String f_34600;
   private String f_34601;
   private String f_34602;
   private String f_34603;
   private long f_34604;
   private long f_34605;
   private long f_34606;
   private long f_34607;
   private static final String f_34608 = "global";
   private static final String f_34609 = "nonce";
   private static final String f_34610 = "self";
   private static final String f_34611 = "self";
   private static final String f_34612 = "id";
   private static final String f_34613 = "chats";
   private static final String f_34614 = "unread";
   private static final String f_34615 = "messages";
   private static final String f_34616 = "hasMore";
   private static final String f_34617 = "id";
   private static final String f_34618 = "Нет соединения с мессенджером";
   private static final String f_34619 = "Дождитесь ответа сервера";
   private static final String f_34620 = "action";
   private static final String f_34621 = "chat";
   private static final String f_34622 = "chat";
   private static final String f_34623 = "action";
   private static final String f_34624 = "chat";
   private static final String f_34625 = "text";
   private static final String f_34626 = "id";
   private static final String f_34627 = "reply";
   private static final String f_34628 = "sourceChat";
   private static final String f_34629 = "nonce";
   private static final String f_34630 = "nonce";
   private static final String f_34631 = "send";
   private static final String f_34632 = "forward";
   private static final String f_34633 = "v";
   private static final String f_34634 = "request";
   private static final String f_34635 = "role";
   private static final String f_34636 = "chat";
   private static final String f_34637 = "chat";
   private static final String f_34638 = "before";
   private static final String f_34639 = "query";
   private static final String f_34640 = "chat";
   private static final String f_34641 = "read";
   private static final int f_34642 = 1000000;
   private static final String f_34643 = "event";
   private static final String f_34644 = "banned";
   private static final String f_34645 = "until";
   private static final String f_34646 = "notice";
   private static final String f_34647 = "Доступ к IRC заблокирован";
   private static final String f_34648 = "notice";
   private static final String f_34649 = "notice";
   private static final String f_34650 = "request";
   private static final String f_34651 = "request";
   private static final String f_34652 = "!";
   private static final String f_34653 = "nonce";
   private static final String f_34654 = "nonce";
   private static final String f_34655 = "error";
   private static final String f_34656 = "error";
   private static final String f_34657 = "Ошибка сервера";
   private static final long f_34658 = 4000L;
   private static final String f_34659 = "messages";
   private static final String f_34660 = "self";
   private static final String f_34661 = "Несовместимая версия сервера";
   private static final String f_34662 = "notice";
   private static final String f_34663 = "notice";
   private static final String f_34664 = "Некорректный ответ сервера";
   private static final long f_34665 = 8000L;
   private static final long f_34666 = 12000L;
   private static final String f_34667 = "Сервер не ответил. Нужна новая сборка Netty-сервера";
   private static final long f_34668 = 8000L;
   private static final String f_34669 = "action";
   private static final String f_34670 = "profile";
   private static final String f_34671 = "skin";
   private static final String f_34672 = "action";
   private static final String f_34673 = "sync";
   private static final String f_34674 = "Не удалось отправить. Текст сохранён в поле ввода";

   public static long m_9399(JsonObject var0, String var1) {
      return var0.has(var1) ? var0.get(var1).getAsLong() : 0L;
   }

   public String m_9400() {
      return this.f_34599;
   }

   public String m_9401() {
      return m_9410(m_9403(this.f_34591, f_34611), f_34612, "");
   }

   public boolean m_9402() {
      return this.f_34606 > 0L;
   }

   public static JsonObject m_9403(JsonObject var0, String var1) {
      return var0.has(var1) && var0.get(var1).isJsonObject() ? var0.getAsJsonObject(var1) : new JsonObject();
   }

   public boolean m_9404() {
      return this.m_9411() && this.f_34591.has(f_34610);
   }

   public JsonObject m_9407() {
      return this.f_34591;
   }

   public void m_9408() {
      this.m_9434();
      this.f_34597 = 0L;
      Class_wOPwT7J4giBZsk46 var1 = Class_wOPwT7J4giBZsk46.m_9320();
      if (var1 != null && !var1.m_9315() && System.currentTimeMillis() >= this.f_34605) {
         var1.m_9321();
      }
   }

   public void m_9409() {
      JsonArray var1 = m_9428(this.f_34591, f_34615);
      if (!var1.isEmpty() && m_9418(this.f_34591, f_34616)) {
         this.f_34606 = m_9399(var1.get(0).getAsJsonObject(), f_34617);
         this.f_34597 = 0L;
      }
   }

   public static String m_9410(JsonObject var0, String var1, String var2) {
      return var0.has(var1) && !var0.get(var1).isJsonNull() ? var0.get(var1).getAsString() : var2;
   }

   public boolean m_9411() {
      return this.f_34589 && this.f_34587 != null && this.f_34587.isActive() && Class_wOPwT7J4giBZsk46.m_9320().m_9315();
   }

   public void m_9412(String var1) {
      this.f_34601 = var1;
      this.f_34597 = 0L;
   }

   public long m_9413() {
      return this.f_34598;
   }

   public int m_9414() {
      int var1 = 0;

      for (JsonElement var3 : m_9428(this.f_34591, f_34613)) {
         var1 += (int)m_9399(var3.getAsJsonObject(), f_34614);
      }

      return var1;
   }

   private void m_9416(JsonObject var1, Runnable var2) {
      var1.addProperty(f_34633, 1);
      var1.addProperty(f_34634, UUID.randomUUID().toString());
      var1.addProperty(f_34635, Class_tjZiOwNclsIk6HpU.m_8934());
      if (!var1.has(f_34636)) {
         var1.addProperty(f_34637, this.f_34600);
      }

      var1.addProperty(f_34638, this.f_34606);
      var1.addProperty(f_34639, this.f_34601);
      if (Minecraft.getInstance().gui.screen() instanceof Screen_7 && this.f_34607 > 0L && this.f_34600.equals(m_9410(var1, f_34640, ""))) {
         var1.addProperty(f_34641, this.f_34607);
      }

      this.f_34592 = var1;
      this.f_34595 = var2;
      this.f_34596 = System.currentTimeMillis();
      this.f_34599 = "";
      Channel var3 = this.f_34587;
      var3.writeAndFlush(new Class_wrEVVKLbnt6Fm3mm.bncgw6UJpkjfC3Tm(var1.toString(), null)).addListener(var3x -> {
         if (!var3x.isSuccess()) {
            Minecraft.getInstance().execute(() -> {
               if (this.f_34587 == var3 && this.f_34592 == var1) {
                  this.f_34592 = null;
                  this.f_34595 = null;
                  this.f_34599 = f_34674;
               }
            });
         }
      });
   }

   public static boolean m_9418(JsonObject var0, String var1) {
      return var0.has(var1) && var0.get(var1).getAsBoolean();
   }

   public void m_9419(String var1) {
      this.f_34599 = var1;
   }

   public Class_wrEVVKLbnt6Fm3mm() {
      this.f_34600 = f_34608;
      this.f_34601 = "";
      this.f_34602 = "";
      this.f_34603 = "";
   }

   public static Class_wrEVVKLbnt6Fm3mm m_9420() {
      return f_34586;
   }

   public boolean m_9421(String var1) {
      return this.f_34592 != null && var1.equals(m_9410(this.f_34592, f_34609, ""));
   }

   public void m_9422(String var1) {
      this.f_34600 = var1;
      this.f_34606 = this.f_34607 = 0L;
      this.f_34597 = 0L;
      this.f_34599 = "";
   }

   private void m_9424(String var1) {
      this.f_34602 = var1;
      this.f_34604 = System.currentTimeMillis() + f_34665;
   }

   private void m_9425(Channel var1, String var2) {
      if (this.f_34587 == var1 && var2 != null && var2.length() <= f_34642) {
         try {
            JsonObject var3 = JsonParser.parseString(var2).getAsJsonObject();
            String var4 = m_9410(var3, f_34643, "");
            if (var4.equals(f_34644)) {
               this.f_34605 = m_9399(var3, f_34645);
               this.f_34603 = m_9410(var3, f_34646, f_34647);
               this.f_34592 = null;
               this.f_34595 = null;
               this.f_34599 = this.f_34603;
               this.f_34591 = new JsonObject();
               this.f_34598++;
               Class_ftHu9o3WzCU3Adxm.m_6731(this.f_34603);
               return;
            }

            if (var4.equals(f_34648)) {
               this.m_9424(m_9410(var3, f_34649, ""));
               Class_ftHu9o3WzCU3Adxm.m_6731(this.f_34602);
               return;
            }

            if (this.f_34592 == null || !m_9410(this.f_34592, f_34650, "").equals(m_9410(var3, f_34651, f_34652))) {
               return;
            }

            Runnable var5 = this.f_34595;
            if (this.f_34593 != null && Objects.equals(this.f_34592.get(f_34653), this.f_34593.get(f_34654))) {
               this.f_34593 = null;
            }

            this.f_34592 = null;
            this.f_34595 = null;
            if (var3.has(f_34655)) {
               this.f_34599 = m_9410(var3, f_34656, f_34657);
               this.f_34597 = System.currentTimeMillis() + f_34658;
               return;
            }

            if (!var3.has(f_34659) || !var3.has(f_34660)) {
               this.f_34599 = f_34661;
               return;
            }

            this.f_34591 = var3;
            this.f_34598++;
            this.f_34599 = "";
            if (var3.has(f_34662)) {
               this.m_9424(m_9410(var3, f_34663, ""));
            }

            if (var5 != null) {
               var5.run();
            }
         } catch (RuntimeException var6) {
            this.f_34592 = null;
            this.f_34595 = null;
            this.f_34599 = f_34664;
         }
      }
   }

   public boolean m_9426(String var1, JsonObject var2, Runnable var3) {
      if (System.currentTimeMillis() < this.f_34605) {
         this.f_34599 = this.f_34603;
         return false;
      }

      if (!this.m_9411()) {
         this.f_34599 = f_34618;
         return false;
      }

      if (this.f_34592 != null) {
         this.f_34599 = f_34619;
         return false;
      }

      var2.addProperty(f_34620, var1);
      if (!var2.has(f_34621)) {
         var2.addProperty(f_34622, this.f_34600);
      }

      boolean var4 = this.f_34593 != null;

      for (String var6 : List.of(f_34623, f_34624, f_34625, f_34626, f_34627, f_34628)) {
         if (var4 && !Objects.equals(var2.get(var6), this.f_34593.get(var6))) {
            var4 = false;
         }
      }

      var2.addProperty(f_34629, var4 ? m_9410(this.f_34593, f_34630, UUID.randomUUID().toString()) : UUID.randomUUID().toString());
      if (var1.equals(f_34631) || var1.equals(f_34632)) {
         this.f_34593 = var2.deepCopy();
         this.f_34606 = 0L;
      }

      this.m_9416(var2, var3);
      return true;
   }

   private void m_9427(Minecraft var1) {
      Class_wOPwT7J4giBZsk46 var2 = Class_wOPwT7J4giBZsk46.m_9320();
      Channel var3 = var2 == null ? null : var2.m_9323();
      if (var3 != null && !var3.isActive()) {
         var3 = null;
      }

      if (var3 != this.f_34587) {
         this.f_34587 = var3;
         this.f_34589 = this.f_34590 = false;
         this.f_34592 = null;
         this.f_34595 = null;
         this.f_34591 = new JsonObject();
         this.f_34598++;
         this.f_34607 = this.f_34606 = 0L;
         if (var3 != null) {
            Channel var4 = var3;
            var4.eventLoop().execute(() -> {
               if (var2.m_9323() == var4) {
                  Class_UmlsjJVsbloY4Viy var4x = var2.m_9319().m_2110();
                  var4x.removeIf(var0 -> var0 instanceof Class_wrEVVKLbnt6Fm3mm.bncgw6UJpkjfC3Tm);
                  var4x.add(new Class_wrEVVKLbnt6Fm3mm.bncgw6UJpkjfC3Tm("", var3xx -> var1.execute(() -> this.m_9425(var4, var3xx))));
                  var1.execute(() -> {
                     if (this.f_34587 == var4) {
                        this.f_34589 = true;
                        this.f_34597 = 0L;
                     }
                  });
               }
            });
         }
      }

      long var7 = System.currentTimeMillis();
      if (var7 < this.f_34605) {
         this.f_34599 = this.f_34603;
      } else {
         if (this.f_34605 > 0L) {
            this.f_34605 = 0L;
            this.f_34603 = "";
            this.f_34599 = "";
            this.f_34597 = 0L;
         }

         if (this.f_34592 != null && var7 - this.f_34596 > f_34666) {
            this.f_34592 = null;
            this.f_34595 = null;
            this.f_34599 = f_34667;
            this.f_34597 = var7 + f_34668;
         }

         if (this.m_9411() && this.f_34592 == null && var7 >= this.f_34597) {
            this.f_34597 = var7 + (var1.gui.screen() instanceof Screen_7 ? 2000 : 10000);
            JsonObject var6 = new JsonObject();
            if (!this.f_34590) {
               this.f_34590 = true;
               var6.addProperty(f_34669, f_34670);
               var6.addProperty(f_34671, var1.getUser().getProfileId().toString());
            } else {
               var6.addProperty(f_34672, f_34673);
            }

            this.m_9416(var6, null);
         }
      }
   }

   public static JsonArray m_9428(JsonObject var0, String var1) {
      return var0.has(var1) && var0.get(var1).isJsonArray() ? var0.getAsJsonArray(var1) : new JsonArray();
   }

   public String m_9430() {
      return System.currentTimeMillis() < this.f_34604 ? this.f_34602 : "";
   }

   public boolean m_9431() {
      return this.f_34592 != null;
   }

   public void m_9433() {
      this.f_34606 = 0L;
      this.f_34597 = 0L;
   }

   public void m_9434() {
      if (!this.f_34588) {
         this.f_34588 = true;
         ClientTickEvents.END_CLIENT_TICK.register(this::m_9427);
      }
   }

   public void m_9435(long var1) {
      if (this.f_34606 == 0L && var1 > this.f_34607) {
         this.f_34607 = var1;
         this.f_34597 = 0L;
      }
   }

   public String m_9436() {
      return this.f_34600;
   }

   private static final class bncgw6UJpkjfC3Tm extends Class_F9yc8RZksnyRaiHz {
      public final Consumer<String> f_34584;
      public static final String f_34585 = "dimasik_messenger_v1";

      @Override
      public void m_2589() {
         if (this.f_34584 != null) {
            this.f_34584.accept(this.m_2590().m_6193());
         }
      }

      public bncgw6UJpkjfC3Tm(String var1, Consumer<String> var2) {
         super(new Class_cYFL1WImRhToowYo(f_34585, Class_DX04kDXg593u6q7Y.USER_ONLY, var1));
         this.f_34584 = var2;
      }
   }
}
