package dev.dimasik.client.module.misc;

import com.google.gson.JsonObject;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.BooleanSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.StringSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_3KFQ2ugKu4yYEXzz;
import dev.dimasik.client.system.Class_Zu53NtHusCtdriRX;
import dev.dimasik.client.system.Class_ftHu9o3WzCU3Adxm;
import java.util.Arrays;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents.ClientStopping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class AnyDesk extends Module {
   private static final Logger f_3842 = LoggerFactory.getLogger(AnyDesk.f_3884);
   private volatile long f_3843;
   private volatile String f_3844;
   private long f_3845;
   private Class_3KFQ2ugKu4yYEXzz f_3846;
   private final MultiChoiceSetting f_3847;
   private final StringSetting f_3848;
   private final StringSetting f_3849;
   private final BooleanSetting f_3850;
   private static final String f_3851 = "AnyDesk";
   private static final String f_3852 = "Обход проверок через AnyDesk";
   private static final String f_3853 = "Выключен";
   private static final String f_3854 = "Ошибка подключения";
   private static final String f_3855 = "AnyDesk ID";
   private static final String f_3856 = "Состояние";
   private static final String f_3857 = "Скопировать ID";
   private static final String f_3858 = "Settings";
   private static final String f_3859 = "Settings";
   private static final String f_3860 = "Settings";
   private static final String f_3861 = "Ошибка Wayland";
   private static final String f_3862 = "Ошибка Wayland";
   private static final String f_3863 = "Ошибка Wayland";
   private static final String f_3864 = "Settings";
   private static final String f_3865 = "Ошибка Wayland";
   private static final String f_3866 = "Регистрация…";
   private static final String f_3867 = "Выключен";
   private static final String f_3868 = " (публичный IP не передан)";
   private static final String f_3869 = "Регистрация…";
   private static final String f_3870 = "Ожидание подключения";
   private static final String f_3871 = " · Автопринятие включено";
   private static final String f_3872 = " · Freeze: ожидание соединения";
   private static final String f_3873 = "AnyDesk registered with ID {}";
   private static final String f_3874 = "Принятие отправлено";
   private static final String f_3875 = "Идёт соединение…";
   private static final String f_3876 = "Ошибка отправлена";
   private static final String f_3877 = "Переподключение…";
   private static final String f_3878 = "AnyDesk reconnecting: {}";
   private static final String f_3879 = "Ошибка запуска";
   private static final String f_3880 = "AnyDesk: ошибка запуска, подробности в журнале";
   private static final String f_3881 = "AnyDesk failed: {}";
   private static final String f_3882 = "Остановлен";
   private static final String f_3883 = "AnyDesk: дождись регистрации";
   private static final String f_3884 = "dimasik-anydesk";

   private void m_1769() {
      Class_3KFQ2ugKu4yYEXzz var1 = this.f_3846;
      if (var1 != null) {
         var1.m_1286(this.m_1779());
      }
   }

   @Override
   public void m_732() {
      this.m_1778();
   }

   public AnyDesk() {
      super(f_3851, f_3852, Category.MISC);
      this.f_3844 = f_3853;
      this.f_3847 = new MultiChoiceSetting(
         f_3854, Arrays.stream(Class_Zu53NtHusCtdriRX.values()).map(var0 -> new Class_2ZaVm8TGDJ68TnJB(var0.m_5876())).toArray(Class_2ZaVm8TGDJ68TnJB[]::new)
      ) {
         @Override
         public void m_1765() {
            super.m_1765();
            AnyDesk.this.m_1769();
         }

         @Override
         public void m_1766(String var1) {
            super.m_1766(var1);
            AnyDesk.this.m_1769();
         }

         @Override
         public void m_1767(Class_2ZaVm8TGDJ68TnJB var1) {
            super.m_1767(var1);
            AnyDesk.this.m_1769();
         }
      };
      this.f_3848 = new StringSetting(f_3855) {
         public static final String f_3841 = "—";

         public String m_1768() {
            return (AnyDesk.this.f_3843 == 0L ? f_3841 : AnyDesk.this.f_3843) + "";
         }
      };
      this.f_3849 = new StringSetting(f_3856) {
         public String m_1764() {
            return AnyDesk.this.f_3844;
         }
      };
      this.f_3850 = new BooleanSetting(f_3857).m_1472().m_1474(() -> {
         if (this.f_3843 != 0L) {
            f_11537.keyboardHandler.setClipboard(Long.toString(this.f_3843));
            Class_ftHu9o3WzCU3Adxm.m_6731(this.f_3843 + "");
         } else {
            Class_ftHu9o3WzCU3Adxm.m_6731(f_3883);
         }
      });
      this.m_795(this.f_3848, this.f_3849, this.f_3850, this.f_3847);
      ClientLifecycleEvents.CLIENT_STOPPING.register((ClientStopping)var1 -> this.m_1778());
   }

   @Override
   public void m_778() {
      this.m_1778();
      long var1 = this.f_3845;
      this.f_3844 = f_3866;
      this.f_3846 = new Class_3KFQ2ugKu4yYEXzz(var3 -> f_11537.execute(() -> {
         if (var1 == this.f_3845 && this.m_776()) {
            this.m_1774(var3);
         }
      }));
      this.m_1769();
      this.f_3846.m_1287();
   }

   private void m_1774(Class_3KFQ2ugKu4yYEXzz.DY8OyIiySD4NpM3P var1) {
      boolean var2 = this.f_3843 != var1.clientId();
      this.f_3843 = var1.clientId();
      String var3 = var1.peerId() + (var1.peerIp() != null && !var1.peerIp().isBlank() ? var1.peerIp() + "" : f_3868);
      switch (var1.state()) {
         case STARTING:
            this.f_3844 = f_3869;
            break;
         case ONLINE:
            this.f_3844 = f_3870;
            if (var2) {
               Class_Zu53NtHusCtdriRX var4 = this.m_1779();
               Class_ftHu9o3WzCU3Adxm.m_6731(
                  this.f_3843 + (var4 == Class_Zu53NtHusCtdriRX.NONE ? f_3871 : (var4 == Class_Zu53NtHusCtdriRX.FREEZE ? f_3872 : var4.m_5876() + ""))
               );
               f_3842.info(f_3873, this.f_3843);
            }
            break;
         case APPROVED:
            this.f_3844 = f_3874;
            Class_ftHu9o3WzCU3Adxm.m_6731(var3 + "");
            break;
         case CONNECTING:
            this.f_3844 = f_3875;
            break;
         case SESSION_ERROR:
            this.f_3844 = f_3876;
            Class_ftHu9o3WzCU3Adxm.m_6731(var3 + Class_Zu53NtHusCtdriRX.m_5880(var1.detail()).m_5876());
            break;
         case DISCONNECTED:
            this.f_3844 = f_3877;
            f_3842.info(f_3878, var1.detail());
            break;
         case ERROR:
            this.f_3844 = f_3879;
            Class_ftHu9o3WzCU3Adxm.m_6731(f_3880);
            f_3842.warn(f_3881, var1.detail());
            this.m_777();
            break;
         case STOPPED:
            this.f_3844 = f_3882;
            this.m_777();
      }
   }

   public long m_1775() {
      return this.f_3843;
   }

   @Override
   public void m_791(JsonObject var1) {
      if (var1 != null && var1.has(f_3858) && var1.get(f_3859).isJsonObject()) {
         JsonObject var2 = var1.getAsJsonObject(f_3860);
         if (!var2.has(this.f_3847.m_8764()) && var2.has(f_3861) && var2.get(f_3862).isJsonPrimitive() && var2.getAsJsonPrimitive(f_3863).isBoolean()) {
            var1 = var1.deepCopy();
            var1.getAsJsonObject(f_3864)
               .addProperty(this.f_3847.m_8764(), (var2.get(f_3865).getAsBoolean() ? Class_Zu53NtHusCtdriRX.WAYLAND : Class_Zu53NtHusCtdriRX.NONE).m_5876());
         }
      }

      super.m_791(var1);
      this.m_1769();
   }

   private void m_1778() {
      this.f_3845++;
      if (this.f_3846 != null) {
         this.f_3846.close();
         this.f_3846 = null;
      }

      this.f_3843 = 0L;
      this.f_3844 = f_3867;
   }

   private Class_Zu53NtHusCtdriRX m_1779() {
      Class_2ZaVm8TGDJ68TnJB var1 = this.f_3847.m_7564();
      return var1 == null ? Class_Zu53NtHusCtdriRX.NONE : Class_Zu53NtHusCtdriRX.m_5879(var1.m_1181());
   }
}
