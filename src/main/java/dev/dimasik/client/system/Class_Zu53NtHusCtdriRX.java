package dev.dimasik.client.system;

public enum Class_Zu53NtHusCtdriRX {
   NONE("Без ошибки", 0, ""),
   WAYLAND("Wayland", 18, "display_server_not_supported"),
   REJECTED("Подключение отклонено", 6, "desk_rt_rejected"),
   AUTH_FAILED("Ошибка авторизации", 3, "desk_rt_auth_failed"),
   ACL_DENIED("Доступ запрещён", 14, "desk_rt_acl_denied"),
   NO_CAPTURE_PERMISSIONS("Нет разрешения на захват экрана", 21, "desk_rt_no_capture_permissions"),
   INVALID_VERSION("Несовместимая версия", 5, "desk_rt_invalid_ver"),
   LOGON_DISABLED("Удалённый вход отключён", 7, "desk_rt_logon_disabled"),
   TWO_FACTOR_FAILED("Ошибка двухфакторной авторизации", 23, "desk_rt_two_factor_auth_failed"),
   TWO_FACTOR_UNSUPPORTED("Двухфакторная авторизация не поддерживается", 24, "desk_rt_two_factor_auth_not_supported"),
   RESTARTING("Удалённый клиент перезапускается", 13, "desk_rt_restarting"),
   USER_CLOSE("Сеанс завершён пользователем", 4, "desk_rt_user_close"),
   PROTOCOL_ERROR("Ошибка протокола", 25, "desk_rt_protocol_error"),
   INTERNAL_ERROR("Внутренняя ошибка", 26, "desk_rt_internal_error"),
   FREEZE("Freeze", -1, "freeze");

   private final String f_17077;
   private final int f_17078;
   private final String f_17079;

   Class_Zu53NtHusCtdriRX(String var3, int var4, String var5) {
      this.f_17077 = var3;
      this.f_17078 = var4;
      this.f_17079 = var5;
   }

   public String m_5876() {
      return this.f_17077;
   }

   public int m_5877() {
      return this.f_17078;
   }

   public String m_5878() {
      return this.f_17079;
   }

   public static Class_Zu53NtHusCtdriRX m_5879(String var0) {
      for (Class_Zu53NtHusCtdriRX var4 : values()) {
         if (var4.f_17077.equals(var0)) {
            return var4;
         }
      }

      return NONE;
   }

   public static Class_Zu53NtHusCtdriRX m_5880(String var0) {
      for (Class_Zu53NtHusCtdriRX var4 : values()) {
         if (var4.f_17079.equals(var0)) {
            return var4;
         }
      }

      return NONE;
   }
}
