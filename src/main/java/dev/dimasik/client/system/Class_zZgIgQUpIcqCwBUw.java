package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.Party;
import io.netty.channel.Channel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public final class Class_zZgIgQUpIcqCwBUw {
   private static final Class_zZgIgQUpIcqCwBUw f_36421 = new Class_zZgIgQUpIcqCwBUw();
   private final Class_j5mXQe9R4XoxPbCp f_36422 = new Class_j5mXQe9R4XoxPbCp();
   private final ArrayBlockingQueue<Class_zZgIgQUpIcqCwBUw.ftnOb09QRMZhFsGJ> f_36423 = new ArrayBlockingQueue<>(512);
   private final Map<UUID, LivingEntity> f_36424 = new HashMap<>();
   private Channel f_36425;
   private Class_SurII2wPoqIgB3n9 f_36426;
   private boolean f_36427;
   private boolean f_36428;
   private Class_zZgIgQUpIcqCwBUw.IfD4TyK5kedzlWqA f_36429;
   private static final long f_36430 = 999999L;
   private static final long f_36431 = 1000000L;
   private static final String f_36432 = "Дождитесь ответа на предыдущую операцию с группой.";
   private static final String f_36433 = "Название и пароль группы: до 128 символов, латиница, цифры, _, -, + и точка.";
   private static final String f_36434 = "Сначала покиньте текущую группу.";
   private static final String f_36435 = "IRC ещё не инициализирован.";
   private static final String f_36436 = "Ожидаю готовности IRC; запрос группы поставлен в очередь.";
   private static final String f_36437 = "IRC недоступен. Операция с группой не отправлена.";
   private static final String f_36438 = "Операция с группой уже выполняется или содержит неверные данные.";
   private static final String f_36439 = "IRC недоступен или ещё проходит авторизацию. Сообщение не отправлено.";
   private static final String f_36440 = "Вы не состоите в подтверждённой группе.";
   private static final String f_36441 = "Дождитесь завершения операции с группой.";
   private static final String f_36442 = "Сообщение должно содержать от 1 до 512 символов без управляющих кодов и §.";
   private static final String f_36443 = "IRC недоступен или ещё проходит авторизацию. Сообщение не отправлено.";
   private static final String f_36444 = "Сообщение должно содержать от 1 до 512 символов без управляющих кодов и §.";
   private static final String f_36445 = "[\\p{Cntrl}]";
   private static final String f_36446 = "Соединение потеряно до ответа на операцию с группой. Результат неизвестен.";
   private static final String f_36447 = ":25565";
   private static final long f_36448 = 30000000000L;
   private static final String f_36449 = "IRC не подтвердил операцию с группой. Результат неизвестен; соединение будет обновлено.";
   private static final long f_36450 = 30000000000L;
   private static final String f_36451 = "Не удалось дождаться IRC. Запрос группы отменён.";
   private static final String f_36452 = "tracking-tick";
   private static final long f_36453 = 5000L;
   private static final String f_36454 = "TICK_STATUS";
   private static final String f_36455 = "null";
   private static final String f_36456 = "none";
   private static final String f_36457 = "null";
   private static final String f_36458 = "dimasik-party";
   private static final String f_36459 = "dimasik-party";
   private static final String f_36460 = "inbound";
   private static final String f_36461 = "dimasik-party";
   private static final String f_36462 = ":";
   private static final String f_36463 = "party.disbanded";
   private static final String f_36464 = "Не удалось отправить сообщение в IRC.";
   private static final String f_36465 = "Не удалось отправить сообщение в группу.";
   private static final String f_36466 = "Не удалось отправить операцию с группой. Соединение будет восстановлено.";

   private void m_9880() {
      DimasikClient var1 = DimasikClient.m_9057();
      if (var1 != null && var1.m_9049() != null && var1.m_9049().m_2801() != null) {
         Party var2 = var1.m_9049().m_2801().m_3573();
         if (var2 != null && !var2.m_776()) {
            var2.m_792();
         }
      }
   }

   public void m_9881() {
      if (this.f_36426 != null) {
         this.f_36426.m_4888(System.nanoTime());
      }
   }

   public LivingEntity m_9882(Class_8GkQlkemKscT6O8F var1) {
      LivingEntity var2 = this.f_36424.get(var1.entityUuid());
      return var2 != null && !var2.isRemoved() && var2.isAlive() ? var2 : null;
   }

   public boolean m_9883(String var1, String var2, UUID var3, UUID var4) {
      return var1 != null && !var1.isEmpty() && var1.equalsIgnoreCase(this.m_9934()) && this.f_36426 != null && this.f_36426.m_4896(var2, var3, var4);
   }

   public List<String> m_9885() {
      return this.m_9934().isEmpty() ? List.of() : this.f_36426.m_4902(System.nanoTime());
   }

   private static boolean m_9886(String var0) {
      Class_ftHu9o3WzCU3Adxm.m_6731(var0);
      return false;
   }

   public void m_9890() {
      if (!this.f_36427) {
         this.f_36427 = true;
         this.m_9933();
         ClientTickEvents.END_CLIENT_TICK.register(this::m_9925);
      }
   }

   private boolean m_9892(Class_j5mXQe9R4XoxPbCp.Class_1gqYQOQvWPDqM8ku var1, String var2, String var3) {
      this.m_9933();
      if (this.m_9926()) {
         return m_9886(f_36432);
      }

      boolean var4 = var1 == Class_j5mXQe9R4XoxPbCp.Class_1gqYQOQvWPDqM8ku.JOIN || var1 == Class_j5mXQe9R4XoxPbCp.Class_1gqYQOQvWPDqM8ku.CREATE;
      if (!var4 || Class_j5mXQe9R4XoxPbCp.m_7364(var2) && Class_j5mXQe9R4XoxPbCp.m_7359(var3)) {
         if (var4 && this.m_9914()) {
            return m_9886(f_36434);
         }

         if (!this.m_9912()) {
            Class_wOPwT7J4giBZsk46 var5 = Class_wOPwT7J4giBZsk46.m_9320();
            if (var5 == null) {
               return m_9886(f_36435);
            }

            if (!var4) {
               this.f_36422.m_7361();
            }

            this.f_36429 = new Class_zZgIgQUpIcqCwBUw.IfD4TyK5kedzlWqA(var1, var2, var3, System.nanoTime());
            var5.m_9321();
            Class_ftHu9o3WzCU3Adxm.m_6731(f_36436);
            return true;
         } else {
            return this.m_9920(var1, var2, var3, false);
         }
      } else {
         return m_9886(f_36433);
      }
   }

   public String m_9893() {
      Class_wOPwT7J4giBZsk46 var1 = Class_wOPwT7J4giBZsk46.m_9320();
      return ""
         + (this.f_36425 == null ? f_36455 : this.f_36425.id())
         + (var1 != null && var1.m_9315())
         + this.f_36428
         + (this.f_36422.m_7362() == null ? f_36456 : this.f_36422.m_7362().action())
         + (this.f_36426 == null ? f_36457 : this.f_36426.m_4903());
   }

   public boolean m_9895(Class_4LPzBXcCHZRVScpS var1) {
      return this.f_36426 != null && this.f_36426.m_4912(var1);
   }

   public boolean m_9897(String var1) {
      this.m_9933();
      if (!this.m_9912()) {
         return m_9886(f_36443);
      } else if (var1 != null && !var1.isBlank() && var1.length() <= 512 && !var1.codePoints().anyMatch(var0 -> Character.isISOControl(var0) || var0 == 167)) {
         this.f_36425.writeAndFlush(new Class_brUVHpScUAES9FD7(Class_tjZiOwNclsIk6HpU.m_8943(var1))).addListener(var0 -> {
            if (!var0.isSuccess()) {
               Class_ftHu9o3WzCU3Adxm.m_6731(f_36464);
            }
         });
         return true;
      } else {
         return m_9886(f_36444);
      }
   }

   public UUID m_9899() {
      return this.f_36425 != null && this.f_36425.isActive() && this.f_36426 != null ? this.f_36426.m_4898() : null;
   }

   public boolean m_9900(String var1) {
      this.m_9933();
      if (!this.m_9912()) {
         return m_9886(f_36439);
      }

      if (!this.m_9914()) {
         return m_9886(f_36440);
      }

      if (this.m_9926()) {
         return m_9886(f_36441);
      }

      Class_SurII2wPoqIgB3n9 var2 = this.f_36426;
      Class_YWsKkU1Pvrv9cQed var3 = var2.m_4897(var1 == null ? "" : var1.strip());
      if (var3 == null) {
         return m_9886(f_36442);
      }

      Channel var4 = this.f_36425;
      var4.writeAndFlush(new Class_KEMhklTewkRHnUkM.taOOtUpmplJCspKg(var3.encode(), null)).addListener(var3x -> Minecraft.getInstance().execute(() -> {
         if (!var3x.isSuccess()) {
            Class_ftHu9o3WzCU3Adxm.m_6731(f_36465);
         } else if (this.f_36426 == var2 && var2.m_4922(var3)) {
            Class_ftHu9o3WzCU3Adxm.m_6731(Class_tjZiOwNclsIk6HpU.m_8938(var3));
         }
      }));
      return true;
   }

   public boolean m_9902(String var1) {
      return !this.m_9934().isEmpty() && this.f_36426.m_4926(var1);
   }

   public static Class_zZgIgQUpIcqCwBUw m_9905() {
      return f_36421;
   }

   public Map<String, Class_SurII2wPoqIgB3n9.zTgXnNfGgpaJC7i2> m_9906() {
      return this.f_36426 == null ? Map.of() : this.f_36426.m_4905();
   }

   public boolean m_9907(Class_8GkQlkemKscT6O8F var1) {
      return this.f_36426 != null && this.f_36426.m_4892(var1);
   }

   public boolean m_9908(String var1, String var2, boolean var3) {
      return this.m_9892(var3 ? Class_j5mXQe9R4XoxPbCp.Class_1gqYQOQvWPDqM8ku.CREATE : Class_j5mXQe9R4XoxPbCp.Class_1gqYQOQvWPDqM8ku.JOIN, var1, var2);
   }

   public boolean m_9910(String var1, LivingEntity var2, int var3) {
      if (this.m_9912() && !this.m_9926() && this.f_36426 != null && var2 != null && var2.isAlive()) {
         String var4 = var2.getName().getString().replaceAll(f_36445, "").strip();
         if (var4.isEmpty()) {
            var4 = var2.getType().getDescription().getString();
         }

         if (var4.length() > 64) {
            var4 = var4.substring(0, 64);
         }

         boolean var5 = this.f_36426
            .m_4920(
               var1,
               var2.getX(),
               var2.getY(),
               var2.getZ(),
               var3,
               var2.getUUID(),
               BuiltInRegistries.ENTITY_TYPE.getKey(var2.getType()).toString(),
               var4,
               System.nanoTime()
            );
         if (var5) {
            this.f_36424.put(var2.getUUID(), var2);
         }

         return var5;
      } else {
         return false;
      }
   }

   public boolean m_9911(UUID var1, String var2) {
      return this.f_36426 != null && this.f_36426.m_4925(var1, var2);
   }

   private boolean m_9912() {
      Class_wOPwT7J4giBZsk46 var1 = Class_wOPwT7J4giBZsk46.m_9320();
      return this.f_36428
         && var1 != null
         && var1.m_9315()
         && var1.m_9323() == this.f_36425
         && this.f_36425 != null
         && this.f_36425.isActive()
         && this.f_36425.isWritable();
   }

   public boolean m_9914() {
      return !this.m_9934().isEmpty();
   }

   public boolean m_9915() {
      return this.m_9892(Class_j5mXQe9R4XoxPbCp.Class_1gqYQOQvWPDqM8ku.LEAVE, "", "");
   }

   public String m_9916(UUID var1, String var2) {
      return this.f_36426 == null ? null : this.f_36426.m_4913(var1, var2);
   }

   public boolean m_9917() {
      return this.m_9892(Class_j5mXQe9R4XoxPbCp.Class_1gqYQOQvWPDqM8ku.DISBAND, "", "");
   }

   private boolean m_9920(Class_j5mXQe9R4XoxPbCp.Class_1gqYQOQvWPDqM8ku var1, String var2, String var3, boolean var4) {
      if (this.m_9912() && this.f_36426 != null) {
         Class_SurII2wPoqIgB3n9 var5 = this.f_36426;
         Channel var6 = this.f_36425;
         Class_j5mXQe9R4XoxPbCp.Class_9aKAwHTXkq8bnrnG var7 = this.f_36422.m_7358(var5, var1, var2, var3, var4, System.nanoTime());
         if (var7 == null) {
            return m_9886(f_36438);
         }

         String var8 = var3.isEmpty() ? var2 : var2 + var3;

         Class_WWrbI1EUeG9pWFgH var9 = switch (var1) {
            case JOIN -> new Class_Xp6IwOTgwNxD98By(var8);
            case CREATE -> new Class_pxYrtsTsdcdlgnR5(var8);
            case LEAVE -> new Class_nRqOrkzB2uuae30Y();
            case DISBAND -> new Class_w1MxNWyKmJZ05xaX();
         };
         var6.writeAndFlush(var9).addListener(var4x -> {
            if (!var4x.isSuccess()) {
               Minecraft.getInstance().execute(() -> {
                  if (this.f_36425 == var6 && this.f_36422.m_7360(var5, var7)) {
                     Class_ftHu9o3WzCU3Adxm.m_6731(f_36466);
                     var6.close();
                  }
               });
            }
         });
         return true;
      } else {
         return m_9886(f_36437);
      }
   }

   public long m_9922() {
      return this.f_36426 == null ? 0L : (this.f_36426.m_4911(System.nanoTime()) + f_36430) / f_36431;
   }

   public Class_s9VSzIQN9qIany9o m_9923(UUID var1, String var2) {
      return this.f_36426 == null ? null : this.f_36426.m_4917(var1, var2);
   }

   public void m_9924() {
      this.m_9915();
   }

   private void m_9925(Minecraft var1) {
      this.m_9933();
      long var2 = System.nanoTime();
      if (this.f_36426 != null) {
         Class_4LPzBXcCHZRVScpS var4 = null;
         ServerData var5 = var1.getConnection() == null ? null : var1.getConnection().getServerData();
         if (var1.level != null && var1.player != null && !var1.isLocalServer() && var5 != null) {
            String var6 = var5.ip.trim().toLowerCase(Locale.ROOT);
            if (var6.endsWith(f_36447)) {
               var6 = var6.substring(0, var6.length() - 6);
            }

            var4 = new Class_4LPzBXcCHZRVScpS(
               1,
               Class_wOPwT7J4giBZsk46.m_9320().m_9322().m_5924(),
               var1.player.getUUID(),
               var1.player.getGameProfile().name(),
               var6,
               var1.level.dimension().identifier().toString(),
               var1.player.getX(),
               var1.player.getY(),
               var1.player.getZ(),
               true
            );
         }

         for (int var13 = 0; var13 < 128; var13++) {
            Class_zZgIgQUpIcqCwBUw.ftnOb09QRMZhFsGJ var7 = this.f_36423.poll();
            if (var7 == null) {
               break;
            }

            if (var7.channel == this.f_36425 && var2 - var7.received < f_36448) {
               if (var7.packet instanceof Class_qIhWiIlTIdXu1lBw var8) {
                  this.f_36426.m_4924(var8, var7.received);
               } else if (var7.packet instanceof Class_YWsKkU1Pvrv9cQed var9 && this.f_36426.m_4915(var9, var7.received)) {
                  Class_ftHu9o3WzCU3Adxm.m_6731(Class_tjZiOwNclsIk6HpU.m_8938(var9));
               }
            }
         }

         this.f_36426.m_4901(var4, Class_rsrLB4fiDOF3z0YM.m_8498(), var2);
         this.m_9930(var1, var4);

         for (Class_YWsKkU1Pvrv9cQed var15 : this.f_36426.m_4889(var2)) {
            Class_ftHu9o3WzCU3Adxm.m_6731(Class_tjZiOwNclsIk6HpU.m_8938(var15));
         }

         if (this.f_36422.m_7367(var2)) {
            this.f_36422.m_7360(this.f_36426, this.f_36422.m_7362());
            Class_ftHu9o3WzCU3Adxm.m_6731(f_36449);
            this.f_36425.close();
            return;
         }
      }

      if (this.f_36429 != null) {
         Class_zZgIgQUpIcqCwBUw.IfD4TyK5kedzlWqA var11 = this.f_36429;
         if (var2 - var11.started >= f_36450) {
            this.f_36429 = null;
            Class_ftHu9o3WzCU3Adxm.m_6731(f_36451);
         } else if (this.m_9912()) {
            this.f_36429 = null;
            this.m_9920(var11.action, var11.name, var11.password, false);
         }
      } else if (this.m_9912() && this.f_36422.m_7362() == null && this.f_36422.m_7366() != null) {
         Class_j5mXQe9R4XoxPbCp.AMOkMd2svcTT0tRb var12 = this.f_36422.m_7366();
         this.m_9920(Class_j5mXQe9R4XoxPbCp.Class_1gqYQOQvWPDqM8ku.JOIN, var12.name(), var12.password(), true);
      }

      if (Class_BRwgyCXa8ZQRcJH3.m_2270(f_36452, f_36453)) {
         Class_BRwgyCXa8ZQRcJH3.m_2273(f_36454, this.m_9893());
      }
   }

   public boolean m_9926() {
      return this.f_36422.m_7362() != null || this.f_36429 != null;
   }

   public Map<UUID, Class_SurII2wPoqIgB3n9.LSyoMROniHgdEQeH> m_9929() {
      return this.f_36426 == null ? Map.of() : this.f_36426.m_4891();
   }

   private void m_9930(Minecraft var1, Class_4LPzBXcCHZRVScpS var2) {
      this.f_36424.clear();
      if (var2 != null && var1.level != null) {
         HashSet var3 = new HashSet();

         for (Class_SurII2wPoqIgB3n9.zTgXnNfGgpaJC7i2 var5 : this.f_36426.m_4905().values()) {
            Class_8GkQlkemKscT6O8F var6 = var5.m_4884();
            if (var6.entityUuid() != null && this.f_36426.m_4892(var6)) {
               var3.add(var6.entityUuid());
            }
         }

         if (!var3.isEmpty()) {
            for (Entity var9 : var1.level.entitiesForRendering()) {
               if (var9 instanceof LivingEntity var11 && var11.isAlive() && var3.contains(var9.getUUID())) {
                  this.f_36424.put(var9.getUUID(), var11);
               }
            }

            Class_8GkQlkemKscT6O8F var8 = this.f_36426.m_4887();
            if (var8 != null && var8.entityUuid() != null) {
               LivingEntity var10 = this.f_36424.get(var8.entityUuid());
               if (var10 != null) {
                  this.f_36426.m_4893(var10.getUUID(), var10.getX(), var10.getY(), var10.getZ());
               }
            }
         }
      }
   }

   public Class_4LPzBXcCHZRVScpS m_9931(String var1) {
      return this.m_9934().isEmpty() ? null : this.f_36426.m_4916(var1, System.nanoTime());
   }

   public boolean m_9932(String var1, double var2, double var4, double var6, int var8) {
      return this.m_9912() && !this.m_9926() && this.f_36426 != null && this.f_36426.m_4899(var1, var2, var4, var6, var8, System.nanoTime());
   }

   private void m_9933() {
      Class_wOPwT7J4giBZsk46 var1 = Class_wOPwT7J4giBZsk46.m_9320();
      Channel var2 = var1 == null ? null : var1.m_9323();
      if (var2 != null && !var2.isActive()) {
         var2 = null;
      }

      if (this.f_36425 != var2) {
         if (this.f_36426 != null) {
            if (this.f_36422.m_7362() != null) {
               Class_ftHu9o3WzCU3Adxm.m_6731(f_36446);
            }

            this.f_36422.m_7363(this.f_36426);
         }

         this.f_36425 = var2;
         this.f_36426 = null;
         this.f_36428 = false;
         this.f_36424.clear();
         this.f_36423.clear();
         if (var2 != null) {
            Channel var3 = var2;
            Minecraft var4 = Minecraft.getInstance();
            Class_SurII2wPoqIgB3n9 var5 = new Class_SurII2wPoqIgB3n9(var1.m_9322().m_5924(), var2x -> {
               if (this.f_36425 == var3 && this.m_9912()) {
                  var3.writeAndFlush(new Class_KEMhklTewkRHnUkM.Class_2P7ina2Dxl2cTleC(var2x.encode(), null)).addListener(var1xx -> {
                     if (!var1xx.isSuccess()) {
                        var3.close();
                     }
                  });
               }
            });
            this.f_36426 = var5;
            var3.eventLoop()
               .execute(
                  () -> {
                     if (var1.m_9323() == var3 && var3.isActive()) {
                        Class_UmlsjJVsbloY4Viy var5x = var1.m_9319().m_2110();
                        var5x.removeIf(
                           var0 -> var0 instanceof Class_KEMhklTewkRHnUkM.Class_2P7ina2Dxl2cTleC || var0 instanceof Class_KEMhklTewkRHnUkM.taOOtUpmplJCspKg
                        );
                        var5x.add(
                           new Class_KEMhklTewkRHnUkM.Class_2P7ina2Dxl2cTleC(
                              "", var2xx -> this.f_36423.offer(new Class_zZgIgQUpIcqCwBUw.ftnOb09QRMZhFsGJ(var3, var2xx, System.nanoTime()))
                           )
                        );
                        var5x.add(
                           new Class_KEMhklTewkRHnUkM.taOOtUpmplJCspKg(
                              "", var2xx -> this.f_36423.offer(new Class_zZgIgQUpIcqCwBUw.ftnOb09QRMZhFsGJ(var3, var2xx, System.nanoTime()))
                           )
                        );
                        if (var3.pipeline().get(f_36458) != null) {
                           var3.pipeline().remove(f_36459);
                        }

                        var3.pipeline().addAfter(f_36460, f_36461, new Class_KEMhklTewkRHnUkM(var4xx -> var4.execute(() -> {
                           if (this.f_36425 == var3 && var3.isActive()) {
                              boolean var4xxx = var5.m_4918();
                              this.f_36422.m_7357(var5, var4xx, System.nanoTime());
                              if (!var4xxx && var5.m_4918()) {
                                 this.m_9880();
                              }

                              if (!var5.m_4918()) {
                                 this.f_36424.clear();
                              }
                           }
                        }), var4xx -> var4.execute(() -> {
                           if (this.f_36425 == var3 && var3.isActive()) {
                              boolean var4xxx = var5.m_4918();
                              var5.m_4890(var4xx);
                              if (var4xxx && !var5.m_4918()) {
                                 this.f_36422.m_7357(var5, f_36463, System.nanoTime());
                                 this.f_36424.clear();
                              }
                           }
                        }), () -> var4.execute(this::m_9933)));
                        String var6 = String.join(f_36462, var1.m_9319().m_2105().stream().map(var0 -> var0.m_7462()).toList());
                        var4.execute(() -> {
                           if (this.f_36425 == var3 && var3.isActive()) {
                              var5.m_4890(var6);
                              this.f_36428 = true;
                           }
                        });
                     }
                  }
               );
         }
      }
   }

   public String m_9934() {
      return this.f_36425 != null && this.f_36425.isActive() && this.f_36426 != null && this.f_36426.m_4918() ? this.f_36426.m_4909() : "";
   }

   private record IfD4TyK5kedzlWqA(Class_j5mXQe9R4XoxPbCp.Class_1gqYQOQvWPDqM8ku action, String name, String password, long started) {
   }

   private record ftnOb09QRMZhFsGJ(Channel channel, Object packet, long received) {
   }
}
