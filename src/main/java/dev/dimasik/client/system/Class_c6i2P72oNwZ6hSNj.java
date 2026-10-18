package dev.dimasik.client.system;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import dev.dimasik.client.DimasikClient;
import java.util.ArrayList;
import java.util.function.Consumer;
import lombok.Generated;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;

public class Class_c6i2P72oNwZ6hSNj extends ArrayList<Class_msKbTl6QleqYGoq3> {
   private final CommandDispatcher<ClientSuggestionProvider> f_17924 = new CommandDispatcher();
   private final Consumer<Throwable> f_17925 = Throwable::printStackTrace;
   private Character f_17926 = '.';
   private static final String f_17927 = "Показывает список всех команд и их описания";
   private static final String f_17928 = "Показать список команд клиента";
   private static final String f_17929 = "Выделяет регион вокруг участника IRC-пати по синхронизированным координатам";
   private static final String f_17930 = "<nickname> <radius>";
   private static final String f_17931 = "Minecraft-ник участника пати и радиус выделения по всем осям";
   private static final String f_17932 = "Сохраняет и загружает конфигурации клиента";
   private static final String f_17933 = "saveall";
   private static final String f_17934 = "Сохранить все текущие настройки";
   private static final String f_17935 = "loadall";
   private static final String f_17936 = "Загрузить все основные настройки";
   private static final String f_17937 = "save <name>";
   private static final String f_17938 = "Сохранить пользовательский конфиг";
   private static final String f_17939 = "load <name>";
   private static final String f_17940 = "Загрузить пользовательский конфиг";
   private static final String f_17941 = "load <name> <module>";
   private static final String f_17942 = "Загрузить настройки одного модуля из конфига";
   private static final String f_17943 = "remove <name>";
   private static final String f_17944 = "Удалить пользовательский конфиг";
   private static final String f_17945 = "list";
   private static final String f_17946 = "Показать сохранённые конфиги";
   private static final String f_17947 = "dir";
   private static final String f_17948 = "Открыть папку конфигов";
   private static final String f_17949 = "reset";
   private static final String f_17950 = "Сбросить настройки модулей к значениям по умолчанию";
   private static final String f_17951 = "Задаёт отображаемый ник для NameProtect";
   private static final String f_17952 = "Показать текущий отображаемый ник";
   private static final String f_17953 = "<ник>";
   private static final String f_17954 = "Установить отображаемый ник; поддерживаются русский и английский";
   private static final String f_17955 = "off";
   private static final String f_17956 = "Сбросить кастомный ник, не выключая NameProtect";
   private static final String f_17957 = "Управляет списком друзей";
   private static final String f_17958 = "add <nick> [fakeName]";
   private static final String f_17959 = "Добавить друга; fakeName задаёт отображаемый ник";
   private static final String f_17960 = "remove <nick>";
   private static final String f_17961 = "Удалить друга";
   private static final String f_17962 = "list";
   private static final String f_17963 = "Показать друзей и их отображаемые ники";
   private static final String f_17964 = "clear";
   private static final String f_17965 = "Очистить список друзей";
   private static final String f_17966 = "Фиксирует Aura на одном игроке и красит его неймтег";
   private static final String f_17967 = "Показать текущую цель";
   private static final String f_17968 = "<ник>";
   private static final String f_17969 = "Зафиксировать Aura только на этом игроке";
   private static final String f_17970 = "off";
   private static final String f_17971 = "Снять фиксацию цели";
   private static final String f_17972 = "Создаёт и удаляет макросы на клавиши";
   private static final String f_17973 = "add <key> <command...>";
   private static final String f_17974 = "Назначить выполнение команды на клавишу";
   private static final String f_17975 = "remove <key>";
   private static final String f_17976 = "Удалить макрос с клавиши";
   private static final String f_17977 = "clear";
   private static final String f_17978 = "Удалить все макросы";
   private static final String f_17979 = "Перемещает игрока по вертикали";
   private static final String f_17980 = "up";
   private static final String f_17981 = "Переместиться вверх";
   private static final String f_17982 = "down";
   private static final String f_17983 = "Переместиться вниз";
   private static final String f_17984 = "<blocks>";
   private static final String f_17985 = "Переместиться на указанное число блоков";
   private static final String f_17986 = "Перемещает игрока к указанным координатам";
   private static final String f_17987 = "<nick>";
   private static final String f_17988 = "Телепортироваться к загруженному игроку";
   private static final String f_17989 = "<x> <y> <z>";
   private static final String f_17990 = "Телепортироваться по координатам";
   private static final String f_17991 = "rw <nick>";
   private static final String f_17992 = "Телепортировать ноги в ближайший к игроку блок";
   private static final String f_17993 = "rw <x> <z>";
   private static final String f_17994 = "Запустить пошаговый маршрут TP RW";
   private static final String f_17995 = "stop";
   private static final String f_17996 = "Остановить активный маршрут TP RW";
   private static final String f_17997 = "Перемещает игрока по горизонтали";
   private static final String f_17998 = "<distance>";
   private static final String f_17999 = "Переместиться вперёд на расстояние от 1 до 10000 блоков";
   private static final String f_18000 = "Управляет сохранёнными точками мира";
   private static final String f_18001 = "Показать сохранённые точки";
   private static final String f_18002 = "add <name>";
   private static final String f_18003 = "Сохранить текущую позицию";
   private static final String f_18004 = "add <name> <x> <y> <z>";
   private static final String f_18005 = "Сохранить точку с указанными координатами";
   private static final String f_18006 = "remove <name>";
   private static final String f_18007 = "Удалить точку";
   private static final String f_18008 = "delete <name>";
   private static final String f_18009 = "Удалить точку";
   private static final String f_18010 = "list";
   private static final String f_18011 = "Показать сохранённые точки";
   private static final String f_18012 = "clear";
   private static final String f_18013 = "Удалить все точки";
   private static final String f_18014 = "clearall";
   private static final String f_18015 = "Удалить все точки";
   private static final String f_18016 = "Устанавливает или отключает GPS-указатель";
   private static final String f_18017 = "<x> <z>";
   private static final String f_18018 = "Установить GPS на координаты";
   private static final String f_18019 = "info";
   private static final String f_18020 = "Показать текущую цель GPS";
   private static final String f_18021 = "off";
   private static final String f_18022 = "Отключить GPS";
   private static final String f_18023 = "Устанавливает бинды функций на кнопки";
   private static final String f_18024 = "add <module> <key>";
   private static final String f_18025 = "Назначить модулю клавишу";
   private static final String f_18026 = "remove <module|key>";
   private static final String f_18027 = "Удалить бинд по модулю или клавише";
   private static final String f_18028 = "list";
   private static final String f_18029 = "Показать активные бинды";
   private static final String f_18030 = "clear";
   private static final String f_18031 = "Очистить бинды; бинд ClickGui сохранится";
   private static final String f_18032 = "Временно отключает клиент до ввода кода восстановления в чат";
   private static final String f_18033 = "Отключить модули, команды и бинды и получить код восстановления";
   private static final String f_18034 = "Перезаходит на текущий гриф через Auto Joiner";
   private static final String f_18035 = "Начать перезаход на текущий гриф или анархию";
   private static final String f_18036 = "<grief>";
   private static final String f_18037 = "Перезайти на указанный гриф от 1 до 96";
   private static final String f_18038 = "Задаёт цель для модуля AutoContract";
   private static final String f_18039 = "Показать текущую цель";
   private static final String f_18040 = "<nickname>";
   private static final String f_18041 = "Установить ник цели";
   private static final String f_18042 = "Ищет предмет в руке на аукционе или выставляет его по цене рынка";
   private static final String f_18043 = "Найти предмет из основной руки на аукционе";
   private static final String f_18044 = "sell";
   private static final String f_18045 = "Выставить донатный предмет по рассчитанной цене";
   private static final String f_18046 = "sell <процент>";
   private static final String f_18047 = "Выставить предмет со скидкой от рассчитанной цены";
   private static final String f_18048 = "Управляет списком анархий для Auto Warden";
   private static final String f_18049 = "add <анархия>";
   private static final String f_18050 = "Добавить анархию в список фарма";
   private static final String f_18051 = "remove <анархия>";
   private static final String f_18052 = "Удалить анархию из списка";
   private static final String f_18053 = "list";
   private static final String f_18054 = "Показать список анархий";
   private static final String f_18055 = "clear";
   private static final String f_18056 = "Очистить список анархий";
   private static final String f_18057 = "Настраивает список предметов ChestStealer";
   private static final String f_18058 = "Показать выбранные предметы";
   private static final String f_18059 = "add <item>";
   private static final String f_18060 = "Добавить предмет для лутания";
   private static final String f_18061 = "remove <item>";
   private static final String f_18062 = "Удалить предмет из списка";
   private static final String f_18063 = "list";
   private static final String f_18064 = "Показать выбранные предметы";
   private static final String f_18065 = "clear";
   private static final String f_18066 = "Очистить список предметов";
   private static final String f_18067 = "Настраивает предмет для HeadSwap";
   private static final String f_18068 = "Показать текущий предмет";
   private static final String f_18069 = "add";
   private static final String f_18070 = "Добавить предмет из руки";
   private static final String f_18071 = "remove";
   private static final String f_18072 = "Удалить текущий предмет";
   private static final String f_18073 = "clear";
   private static final String f_18074 = "Удалить текущий предмет";
   private static final String f_18075 = "list";
   private static final String f_18076 = "Показать текущий предмет";
   private static final String f_18077 = "Настраивает подсветку блоков и сущностей";
   private static final String f_18078 = "add <block|entity> <color>";
   private static final String f_18079 = "Добавить подсветку; цвет — имя или #RRGGBB";
   private static final String f_18080 = "add shulkers <color>";
   private static final String f_18081 = "Добавить подсветку всех шалкеров";
   private static final String f_18082 = "remove <block|entity>";
   private static final String f_18083 = "Удалить блок или сущность из подсветки";
   private static final String f_18084 = "list";
   private static final String f_18085 = "Показать настройки BlockESP";
   private static final String f_18086 = "clear";
   private static final String f_18087 = "Очистить настройки BlockESP";
   private static final String f_18088 = "Управляет фейковыми игроками и их экипировкой";
   private static final String f_18089 = "Показать фейковых игроков";
   private static final String f_18090 = "add [name]";
   private static final String f_18091 = "Создать фейкового игрока";
   private static final String f_18092 = "remove <name>";
   private static final String f_18093 = "Удалить фейкового игрока";
   private static final String f_18094 = "equip <name> <slot> <item> [count]";
   private static final String f_18095 = "Надеть предмет в выбранный слот";
   private static final String f_18096 = "give <name> <item> [count]";
   private static final String f_18097 = "Добавить предмет в инвентарь";
   private static final String f_18098 = "copy <name>";
   private static final String f_18099 = "Скопировать экипировку на игрока";
   private static final String f_18100 = "list";
   private static final String f_18101 = "Показать фейковых игроков";
   private static final String f_18102 = "clear";
   private static final String f_18103 = "Удалить всех фейковых игроков";
   private static final String f_18104 = "Добавляет сообщения после убийства для KillMessage";
   private static final String f_18105 = "Показать kill-сообщения";
   private static final String f_18106 = "add <text...>";
   private static final String f_18107 = "Добавить сообщение после убийства";
   private static final String f_18108 = "remove <index>";
   private static final String f_18109 = "Удалить сообщение по номеру";
   private static final String f_18110 = "list";
   private static final String f_18111 = "Показать kill-сообщения";
   private static final String f_18112 = "clear";
   private static final String f_18113 = "Очистить kill-сообщения";
   private static final String f_18114 = "Добавляет сообщения после сноса тотема для KillMessage";
   private static final String f_18115 = "Показать сообщения после сноса тотема";
   private static final String f_18116 = "add <text...>";
   private static final String f_18117 = "Добавить сообщение после сноса тотема";
   private static final String f_18118 = "remove <index>";
   private static final String f_18119 = "Удалить сообщение по номеру";
   private static final String f_18120 = "list";
   private static final String f_18121 = "Показать pt-сообщения";
   private static final String f_18122 = "clear";
   private static final String f_18123 = "Очистить pt-сообщения";
   private static final String f_18124 = "Отправляет сообщения в общий IRC-чат клиента";
   private static final String f_18125 = "<сообщение...>";
   private static final String f_18126 = "Отправить сообщение; модуль IRC должен быть включён";
   private static final String f_18127 = "Управляет IRC-пати и отправляет сообщения её участникам";
   private static final String f_18128 = "create <name> [password]";
   private static final String f_18129 = "Создать пати с необязательным паролем";
   private static final String f_18130 = "join <name> [password]";
   private static final String f_18131 = "Войти в пати; указать пароль, если он установлен";
   private static final String f_18132 = "leave";
   private static final String f_18133 = "Выйти из пати";
   private static final String f_18134 = "disband";
   private static final String f_18135 = "Распустить свою пати";
   private static final String f_18136 = "<сообщение...>";
   private static final String f_18137 = "Отправить сообщение участникам пати";
   private static final String f_18138 = "trace";
   private static final String f_18139 = "Показать состояние подключения и синхронизации пати";
   private static final String f_18140 = "\\s+";
   private static final String f_18141 = "Команда не найдена";

   private void m_6126(Class_msKbTl6QleqYGoq3 var1) {
      this.m_6137(var1, var1.m_7629());

      for (String var5 : var1.m_7626()) {
         this.m_6137(var1, var5);
      }

      DimasikClient.m_9057().m_9051().m_9713(var1);
   }

   @Generated
   public Consumer<Throwable> m_6127() {
      return this.f_17925;
   }

   public Class_c6i2P72oNwZ6hSNj() {
      Class_3GDSJINRhi8zNlKp.m_1271().m_1264();
      this.m_6133(new Class_JgwYILKpisTnKDkX(), f_17927, m_6130("", f_17928));
      this.m_6133(new Class_0IFmNFhRWCQvp94J(), f_17929, m_6130(f_17930, f_17931));
      this.m_6133(
         new Class_8wrHj8R3ffasKkji(),
         f_17932,
         m_6130(f_17933, f_17934),
         m_6130(f_17935, f_17936),
         m_6130(f_17937, f_17938),
         m_6130(f_17939, f_17940),
         m_6130(f_17941, f_17942),
         m_6130(f_17943, f_17944),
         m_6130(f_17945, f_17946),
         m_6130(f_17947, f_17948),
         m_6130(f_17949, f_17950)
      );
      this.m_6133(new Class_FscpulZmHVKtCBZj(), f_17951, m_6130("", f_17952), m_6130(f_17953, f_17954), m_6130(f_17955, f_17956));
      this.m_6133(new Class_jKuy36ldPyOlDSZL(), f_17957, m_6130(f_17958, f_17959), m_6130(f_17960, f_17961), m_6130(f_17962, f_17963), m_6130(f_17964, f_17965));
      this.m_6133(new Class_G54cvubX647RpgUo(), f_17966, m_6130("", f_17967), m_6130(f_17968, f_17969), m_6130(f_17970, f_17971));
      this.m_6133(new Class_hBzI1MVdR1T4m2sP(), f_17972, m_6130(f_17973, f_17974), m_6130(f_17975, f_17976), m_6130(f_17977, f_17978));
      this.m_6133(new Class_QKNJdceZaZX0EDkg(), f_17979, m_6130(f_17980, f_17981), m_6130(f_17982, f_17983), m_6130(f_17984, f_17985));
      this.m_6133(
         new Class_iIkbGn13xFkduDs0(),
         f_17986,
         m_6130(f_17987, f_17988),
         m_6130(f_17989, f_17990),
         m_6130(f_17991, f_17992),
         m_6130(f_17993, f_17994),
         m_6130(f_17995, f_17996)
      );
      this.m_6133(new Class_kAwUR6aHTAAWiWAv(), f_17997, m_6130(f_17998, f_17999));
      this.m_6133(
         new Class_L2HIS1I1uLjErVeN(),
         f_18000,
         m_6130("", f_18001),
         m_6130(f_18002, f_18003),
         m_6130(f_18004, f_18005),
         m_6130(f_18006, f_18007),
         m_6130(f_18008, f_18009),
         m_6130(f_18010, f_18011),
         m_6130(f_18012, f_18013),
         m_6130(f_18014, f_18015)
      );
      this.m_6133(new Class_0WrunFUNlRPaOg0e(), f_18016, m_6130(f_18017, f_18018), m_6130(f_18019, f_18020), m_6130(f_18021, f_18022));
      this.m_6133(new Class_6yUSQ5tMyEFIGGuu(), f_18023, m_6130(f_18024, f_18025), m_6130(f_18026, f_18027), m_6130(f_18028, f_18029), m_6130(f_18030, f_18031));
      this.m_6133(new Class_QH78paBGzrFcFcFX(), f_18032, m_6130("", f_18033));
      this.m_6133(new Class_UUhccKhvddKDEMkI(), f_18034, m_6130("", f_18035), m_6130(f_18036, f_18037));
      this.m_6133(new Class_leVCNCyuwEBdJnL8(), f_18038, m_6130("", f_18039), m_6130(f_18040, f_18041));
      this.m_6133(new Class_91IbAUVir9fW6CS3(), f_18042, m_6130("", f_18043), m_6130(f_18044, f_18045), m_6130(f_18046, f_18047));
      this.m_6133(new Class_56PWi2R0KZTyQfiX(), f_18048, m_6130(f_18049, f_18050), m_6130(f_18051, f_18052), m_6130(f_18053, f_18054), m_6130(f_18055, f_18056));
      this.m_6133(
         new Class_rDgULSgEpLrIruzt(),
         f_18057,
         m_6130("", f_18058),
         m_6130(f_18059, f_18060),
         m_6130(f_18061, f_18062),
         m_6130(f_18063, f_18064),
         m_6130(f_18065, f_18066)
      );
      this.m_6133(
         new Class_HYg96YCVqFI747aQ(),
         f_18067,
         m_6130("", f_18068),
         m_6130(f_18069, f_18070),
         m_6130(f_18071, f_18072),
         m_6130(f_18073, f_18074),
         m_6130(f_18075, f_18076)
      );
      this.m_6133(
         new Class_wmuo6mXRz9Dzb0cI(),
         f_18077,
         m_6130(f_18078, f_18079),
         m_6130(f_18080, f_18081),
         m_6130(f_18082, f_18083),
         m_6130(f_18084, f_18085),
         m_6130(f_18086, f_18087)
      );
      this.m_6133(
         new Class_bFyrsdfJijUF7flU(),
         f_18088,
         m_6130("", f_18089),
         m_6130(f_18090, f_18091),
         m_6130(f_18092, f_18093),
         m_6130(f_18094, f_18095),
         m_6130(f_18096, f_18097),
         m_6130(f_18098, f_18099),
         m_6130(f_18100, f_18101),
         m_6130(f_18102, f_18103)
      );
      this.m_6133(
         new Class_ekncwv4FkVk520Fk(),
         f_18104,
         m_6130("", f_18105),
         m_6130(f_18106, f_18107),
         m_6130(f_18108, f_18109),
         m_6130(f_18110, f_18111),
         m_6130(f_18112, f_18113)
      );
      this.m_6133(
         new Class_xK1Qs7RDmmUxLgFq(),
         f_18114,
         m_6130("", f_18115),
         m_6130(f_18116, f_18117),
         m_6130(f_18118, f_18119),
         m_6130(f_18120, f_18121),
         m_6130(f_18122, f_18123)
      );
      this.m_6133(new Class_0cTrLQ0cZeOKj0Wa(), f_18124, m_6130(f_18125, f_18126));
      this.m_6133(
         new Class_5nnqHgusCl0RX1Qv(),
         f_18127,
         m_6130(f_18128, f_18129),
         m_6130(f_18130, f_18131),
         m_6130(f_18132, f_18133),
         m_6130(f_18134, f_18135),
         m_6130(f_18136, f_18137),
         m_6130(f_18138, f_18139)
      );
      this.forEach(this::m_6126);
   }

   private Class_msKbTl6QleqYGoq3 m_6128(String var1) {
      String var2 = var1.split(f_18140, 2)[0];

      for (Class_msKbTl6QleqYGoq3 var4 : this) {
         if (var2.equals(var4.m_7629())) {
            return var4;
         }

         for (String var8 : var4.m_7626()) {
            if (var2.equals(var8)) {
               return var4;
            }
         }
      }

      return null;
   }

   public boolean m_6129(String var1) {
      String var2 = var1.startsWith(this.f_17926.toString()) ? var1.substring(1) : var1;
      return this.m_6128(var2) != null;
   }

   private static Class_msKbTl6QleqYGoq3.Class_31eL8BZtvyg7lnQC m_6130(String var0, String var1) {
      return new Class_msKbTl6QleqYGoq3.Class_31eL8BZtvyg7lnQC(var0, var1);
   }

   @Generated
   public void m_6131(Character var1) {
      this.f_17926 = var1;
   }

   @Generated
   public Character m_6132() {
      return this.f_17926;
   }

   private void m_6133(Class_msKbTl6QleqYGoq3 var1, String var2, Class_msKbTl6QleqYGoq3.Class_31eL8BZtvyg7lnQC... var3) {
      var1.m_7630(var2);
      var1.m_7623(var3);
      this.add(var1);
   }

   public void m_6134(String var1) {
      try {
         if (DimasikClient.m_9057().m_9049().m_2805().m_1652()) {
            return;
         }

         if (!var1.startsWith(this.f_17926.toString())) {
            return;
         }

         var1 = var1.substring(1);
         if (var1.isEmpty()) {
            return;
         }

         try {
            this.f_17924.execute(var1, null);
         } catch (CommandSyntaxException var4) {
            Class_msKbTl6QleqYGoq3 var3 = this.m_6128(var1);
            if (var3 == null) {
               Class_ftHu9o3WzCU3Adxm.m_6731(f_18141);
            } else {
               var3.m_7632(this.f_17926.toString());
            }
         }
      } catch (Throwable var5) {
         this.f_17925.accept(var5);
      }
   }

   @Generated
   public CommandDispatcher<ClientSuggestionProvider> m_6135() {
      return this.f_17924;
   }

   private void m_6137(Class_msKbTl6QleqYGoq3 var1, String var2) {
      LiteralArgumentBuilder var3 = var1.m_7628(var2);
      var1.build(var3);
      var1.m_7622(var3, () -> this.f_17926.toString());
      this.f_17924.register(var3);
   }
}
