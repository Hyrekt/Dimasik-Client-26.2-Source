package dev.dimasik.client;

import dev.dimasik.client.manager.ClientManagerRegistry;
import dev.dimasik.client.system.Class_52bTWQf99nqpls93;
import dev.dimasik.client.system.Class_9m8OaCNv7wnhL0Uj;
import dev.dimasik.client.system.Class_BbdTtaiu8j25O9PS;
import dev.dimasik.client.system.Class_brUVHpScUAES9FD7;
import dev.dimasik.client.system.Class_dclU5UZlRE5UQfh5;
import dev.dimasik.client.system.Class_ftHu9o3WzCU3Adxm;
import dev.dimasik.client.system.Class_ndLkV1wCwjpoTTBd;
import dev.dimasik.client.system.Class_oo743SqrvnZTh2xw;
import dev.dimasik.client.system.Class_tjZiOwNclsIk6HpU;
import dev.dimasik.client.system.Class_wOPwT7J4giBZsk46;
import dev.dimasik.client.system.Class_wrEVVKLbnt6Fm3mm;
import dev.dimasik.client.system.Class_z4M19eey0hFYSHhe;
import dev.dimasik.client.system.Class_zZgIgQUpIcqCwBUw;
import lombok.Generated;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents.ClientStopping;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;

public class DimasikClient {
   private static DimasikClient f_32383;
   private final ClientManagerRegistry f_32384;
   private final Class_dclU5UZlRE5UQfh5 f_32385;
   private final Class_z4M19eey0hFYSHhe f_32386;
   private final Class_BbdTtaiu8j25O9PS f_32387;
   private static final String f_32388 = "jold1k1";
   private static final String f_32389 = "217.60.245.54";
   private static final String f_32390 = "dimasik";
   private static final String f_32391 = "Inited!";

   @Generated
   public ClientManagerRegistry m_9049() {
      return this.f_32384;
   }

   public void m_9050() {
      this.f_32384.m_2802().m_8847();
   }

   @Generated
   public Class_z4M19eey0hFYSHhe m_9051() {
      return this.f_32386;
   }

   @Generated
   public Class_dclU5UZlRE5UQfh5 m_9052() {
      return this.f_32385;
   }

   @Generated
   public Class_BbdTtaiu8j25O9PS m_9053() {
      return this.f_32387;
   }

   public DimasikClient() {
      f_32383 = this;
      Class_ndLkV1wCwjpoTTBd.m_7679();
      this.f_32386 = new Class_z4M19eey0hFYSHhe();
      this.f_32384 = new ClientManagerRegistry();
      this.f_32385 = new Class_dclU5UZlRE5UQfh5();
      this.f_32387 = new Class_BbdTtaiu8j25O9PS();
      Object var10004 = null;
      var10004 = null;
      Class_wOPwT7J4giBZsk46 var1 = new Class_wOPwT7J4giBZsk46(f_32389, 4892, "cracked by @soezproject & Vkontakt3 >> src by @setsprinting @pointdlc", f_32390, false);
      var1.m_9319().m_2106().m_2647(new Class_52bTWQf99nqpls93());
      Class_zZgIgQUpIcqCwBUw.m_9905().m_9890();
      Class_wrEVVKLbnt6Fm3mm.m_9420().m_9434();
      Class_oo743SqrvnZTh2xw.m_7998(Class_brUVHpScUAES9FD7.class, var1x -> {
         if (this.f_32384.m_2801().m_3416().m_776()) {
            Component var2x = Class_tjZiOwNclsIk6HpU.m_8942(var1x[0], var1x[2]);
            Minecraft.getInstance().execute(() -> Class_ftHu9o3WzCU3Adxm.m_6731(var2x));
         }
      });
      Class_oo743SqrvnZTh2xw.m_7998(Class_9m8OaCNv7wnhL0Uj.class, var1x -> {
         if (Integer.parseInt(var1x[0]) == 1) {
            this.f_32385.m_6340().m_1752().add(var1x[1]);
         } else if (Integer.parseInt(var1x[0]) == 2) {
            System.out.println(var1x[1]);
         }
      });
      ClientLifecycleEvents.CLIENT_STOPPING.register((ClientStopping)var1x -> var1.close());
      var1.m_9321();
      this.m_9050();
      System.out.println(f_32391);
   }

   @Generated
   public static DimasikClient m_9057() {
      return f_32383;
   }
}
