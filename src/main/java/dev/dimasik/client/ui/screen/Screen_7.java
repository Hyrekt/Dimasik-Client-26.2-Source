package dev.dimasik.client.ui.screen;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.textures.FilterMode;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_D5QXX7zTSc2gvuya;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_WhZ6MBDQaQZ0AZFd;
import dev.dimasik.client.system.Class_eXr9Fra2ad3yFXY8;
import dev.dimasik.client.system.Class_tjZiOwNclsIk6HpU;
import dev.dimasik.client.system.Class_w8fCJQ5ZtH5lQbWc;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_wrEVVKLbnt6Fm3mm;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.stream.IntStream;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.CharacterEvent;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector4f;
import org.joml.Vector4i;

public final class Screen_7 extends Screen {
   private static final float f_21876 = 0.7F;
   private static final float f_21877 = 20.0F;
   private static final float f_21878 = 27.0F;
   private static final float f_21879 = 16.0F;
   private static final float f_21880 = 38.0F;
   private static final float f_21881 = 34.0F;
   private static final float f_21882 = 24.0F;
   private static final float f_21883 = 16.0F;
   private static final float f_21884 = 6.0F;
   private static final float f_21885 = 15.0F;
   private static final float f_21886 = 28.0F;
   private static final float f_21887 = 18.0F;
   private static final float f_21888 = 12.0F;
   private static final int f_21889 = -1;
   private int f_21890;
   private int f_21891;
   private int f_21892;
   private int f_21893;
   private int f_21894;
   private int f_21895;
   private int f_21896;
   private int f_21897;
   private int f_21898;
   private int f_21899;
   private int f_21900;
   private int f_21901;
   private int f_21902;
   private int f_21903;
   private final Map<String, String> f_21904 = new HashMap<>();
   private final Map<String, JsonObject> f_21905 = new HashMap<>();
   private long f_21906;
   private final long f_21907;
   private float f_21908;
   private static final Map<String, Identifier> f_21909 = new HashMap<>();
   private final Map<Long, String> f_21910;
   private static final String[] f_21911 = new String[]{
      Screen_7.f_22972, Screen_7.f_22973, Screen_7.f_22974, Screen_7.f_22975, Screen_7.f_22976, Screen_7.f_22977, Screen_7.f_22978
   };
   private static final Identifier[] f_21912 = IntStream.range(0, 7).mapToObj(var0 -> Class_wHRRCm2tlLY7DN4I.m_9311(var0 + "")).toArray(Identifier[]::new);
   private static final Vector4f[] f_21913 = new Vector4f[]{
      new Vector4f(Screen_7.f_22979, Screen_7.f_22980, Screen_7.f_22981, Screen_7.f_22982).div(Screen_7.f_22983),
      new Vector4f(Screen_7.f_22984, 0.0F, Screen_7.f_22985, Screen_7.f_22986).div(Screen_7.f_22987),
      new Vector4f(Screen_7.f_22988, 0.0F, Screen_7.f_22989, Screen_7.f_22990).div(Screen_7.f_22991),
      new Vector4f(Screen_7.f_22992, 0.0F, Screen_7.f_22993, Screen_7.f_22994).div(Screen_7.f_22995),
      new Vector4f(Screen_7.f_22996, 0.0F, Screen_7.f_22997, Screen_7.f_22998).div(Screen_7.f_22999),
      new Vector4f(Screen_7.f_23000, 2.0F, Screen_7.f_23001, Screen_7.f_23002).div(Screen_7.f_23003),
      new Vector4f(Screen_7.f_23004, 0.0F, Screen_7.f_23005, Screen_7.f_23006).div(Screen_7.f_23007)
   };
   private static final DateTimeFormatter f_21914 = DateTimeFormatter.ofPattern(Screen_7.f_23008);
   private final Screen f_21915;
   private final Class_wrEVVKLbnt6Fm3mm f_21916;
   private final List<Screen_7.UyHw3Vp5U7VilHxq> f_21917;
   private final Map<String, EditBox> f_21918;
   private final Map<String, Identifier> f_21919;
   private final Set<String> f_21920;
   private final Set<Long> f_21921;
   private static final Map<String, List<String>> f_21922 = new LinkedHashMap<>();
   private EditBox f_21923;
   private EditBox f_21924;
   private EditBox f_21925;
   private String f_21926;
   private String f_21927;
   private JsonObject f_21928;
   private JsonObject f_21929;
   private JsonObject f_21930;
   private JsonObject f_21931;
   private JsonObject f_21932;
   private float f_21933;
   private float f_21934;
   private float f_21935;
   private float f_21936;
   private float f_21937;
   private float f_21938;
   private float f_21939;
   private float f_21940;
   private float f_21941;
   private float f_21942;
   private float f_21943;
   private float f_21944;
   private float f_21945;
   private long f_21946;
   private float f_21947;
   private boolean f_21948;
   private boolean f_21949;
   private boolean f_21950;
   private boolean f_21951;
   private boolean f_21952;
   private final Class_w8fCJQ5ZtH5lQbWc f_21953;
   private final Class_w8fCJQ5ZtH5lQbWc f_21954;
   private final Class_w8fCJQ5ZtH5lQbWc f_21955;
   private final Class_w8fCJQ5ZtH5lQbWc f_21956;
   private final Screen_7.swwpeAJU95vIH9KE f_21957;
   private final Screen_7.swwpeAJU95vIH9KE f_21958;
   private final Screen_7.swwpeAJU95vIH9KE f_21959;
   private final Class_w8fCJQ5ZtH5lQbWc[] f_21960;
   private String f_21961;
   private final List<Screen_7.uCbhk2YgEhpFVejs> f_21962;
   private static final String f_21963 = "Мессенджер";
   private static final long f_21964 = -1L;
   private static final String f_21965 = "global";
   private static final long f_21966 = -1L;
   private static final float f_21967 = 10.0F;
   private static final float f_21968 = 12.0F;
   private static final float f_21969 = 12.0F;
   private static final float f_21970 = 12.0F;
   private static final float f_21971 = 0.28F;
   private static final float f_21972 = 0.2F;
   private static final float f_21973 = 0.55F;
   private static final float f_21974 = 0.22F;
   private static final float f_21975 = 255.0F;
   private static final float f_21976 = 0.12F;
   private static final String f_21977 = "chats";
   private static final String f_21978 = "profile";
   private static final String f_21979 = "people";
   private static final String f_21980 = "peer";
   private static final String f_21981 = "self";
   private static final String f_21982 = "id";
   private static final String f_21983 = "role";
   private static final String f_21984 = "role";
   private static final String f_21985 = "author";
   private static final String f_21986 = "DEFAULT";
   private static final String f_21987 = "MEDIA";
   private static final String f_21988 = "YOUTUBER";
   private static final float f_21989 = 15.0F;
   private static final float f_21990 = 1.5F;
   private static final String f_21991 = "ADMIN";
   private static final String f_21992 = "BETA";
   private static final String f_21993 = "YOUTUBER";
   private static final int f_21994 = -36495;
   private static final int f_21995 = -10101362;
   private static final int f_21996 = -8992001;
   private static final String f_21997 = "author";
   private static final String f_21998 = "id";
   private static final String f_21999 = "id";
   private static final String f_22000 = "id";
   private static final String f_22001 = "deleted";
   private static final String f_22002 = "ADMIN";
   private static final String f_22003 = "BETA";
   private static final String f_22004 = "YOUTUBER";
   private static final int f_22005 = -2424858;
   private static final int f_22006 = -2494209;
   private static final float f_22007 = 15.0F;
   private static final float f_22008 = 15.0F;
   private static final String f_22009 = "name";
   private static final String f_22010 = "author";
   private static final float f_22011 = 8.0F;
   private static final float f_22012 = 15.0F;
   private static final float f_22013 = 8.0F;
   private static final float f_22014 = 15.0F;
   private static final float f_22015 = 0.001F;
   private static final long f_22016 = 2000000000L;
   private static final float f_22017 = 2.0E9F;
   private static final float f_22018 = 32.0F;
   private static final float f_22019 = 800.0F;
   private static final float f_22020 = 32.0F;
   private static final float f_22021 = 504.0F;
   private static final float f_22022 = 0.1F;
   private static final float f_22023 = 0.7F;
   private static final float f_22024 = 0.97F;
   private static final float f_22025 = 0.03F;
   private static final float f_22026 = 1142.8572F;
   private static final float f_22027 = 720.0F;
   private static final float f_22028 = 330.0F;
   private static final float f_22029 = 12.0F;
   private static final float f_22030 = 255.0F;
   private static final float f_22031 = 24.0F;
   private static final float f_22032 = 31.428572F;
   private static final float f_22033 = 28.571428F;
   private static final float f_22034 = 28.571428F;
   private static final float f_22035 = 28.571428F;
   private static final float f_22036 = 0.001F;
   private static final float f_22037 = 18.0F;
   private static final float f_22038 = 36.0F;
   private static final float f_22039 = 16.0F;
   private static final float f_22040 = 19.0F;
   private static final float f_22041 = 44.0F;
   private static final String f_22042 = "back";
   private static final String f_22043 = "Чаты";
   private static final float f_22044 = 30.0F;
   private static final float f_22045 = 22.0F;
   private static final float f_22046 = 62.0F;
   private static final float f_22047 = 19.0F;
   private static final float f_22048 = 46.0F;
   private static final String f_22049 = "compose";
   private static final float f_22050 = 16.0F;
   private static final float f_22051 = 78.0F;
   private static final float f_22052 = 32.0F;
   private static final float f_22053 = 38.0F;
   private static final String f_22054 = "Найти пользователя";
   private static final String f_22055 = "Поиск";
   private static final String f_22056 = "search";
   private static final float f_22057 = 128.0F;
   private static final float f_22058 = 87.0F;
   private static final String f_22059 = "chat";
   private static final float f_22060 = 79.0F;
   private static final float f_22061 = 78.0F;
   private static final float f_22062 = 78.0F;
   private static final String f_22063 = "profile";
   private static final float f_22064 = 16.0F;
   private static final float f_22065 = 8.0F;
   private static final float f_22066 = 60.0F;
   private static final String f_22067 = "global";
   private static final String f_22068 = "title";
   private static final float f_22069 = 151.0F;
   private static final float f_22070 = 17.0F;
   private static final float f_22071 = 89.0F;
   private static final float f_22072 = 10.0F;
   private static final float f_22073 = 17.0F;
   private static final String f_22074 = "preview";
   private static final String f_22075 = "Начните переписку";
   private static final float f_22076 = 126.0F;
   private static final float f_22077 = 15.0F;
   private static final float f_22078 = 89.0F;
   private static final float f_22079 = 37.0F;
   private static final float f_22080 = 15.0F;
   private static final String f_22081 = "unread";
   private static final float f_22082 = 42.0F;
   private static final float f_22083 = 38.0F;
   private static final float f_22084 = 25.0F;
   private static final float f_22085 = 20.0F;
   private static final float f_22086 = 10.0F;
   private static final long f_22087 = 99L;
   private static final String f_22088 = "99+";
   private static final float f_22089 = 29.5F;
   private static final float f_22090 = 41.0F;
   private static final float f_22091 = 12.0F;
   private static final String f_22092 = "time";
   private static final String f_22093 = "time";
   private static final float f_22094 = 54.0F;
   private static final float f_22095 = 12.0F;
   private static final float f_22096 = 12.0F;
   private static final float f_22097 = 78.0F;
   private static final float f_22098 = 89.0F;
   private static final float f_22099 = 78.0F;
   private static final float f_22100 = 105.0F;
   private static final float f_22101 = 0.7F;
   private static final float f_22102 = 79.0F;
   private static final String f_22103 = "Никого не найдено";
   private static final String f_22104 = "Подключение…";
   private static final float f_22105 = 22.0F;
   private static final float f_22106 = 25.0F;
   private static final float f_22107 = 12.0F;
   private static final float f_22108 = 77.0F;
   private static final float f_22109 = 16.0F;
   private static final float f_22110 = 32.0F;
   private static final float f_22111 = 61.0F;
   private static final float f_22112 = 30.0F;
   private static final float f_22113 = 4.0F;
   private static final float f_22114 = 3.0F;
   private static final float f_22115 = 4.0F;
   private static final float f_22116 = 3.0F;
   private static final float f_22117 = 8.0F;
   private static final float f_22118 = 53.0F;
   private static final float f_22119 = 16.0F;
   private static final float f_22120 = 3.0F;
   private static final String f_22121 = "people";
   private static final String f_22122 = "Контакты";
   private static final float f_22123 = 3.0F;
   private static final float f_22124 = 3.0F;
   private static final String f_22125 = "chat";
   private static final String f_22126 = "Чаты";
   private static final float f_22127 = 3.0F;
   private static final float f_22128 = 3.0F;
   private static final String f_22129 = "person";
   private static final String f_22130 = "Профиль";
   private static final String f_22131 = "chats";
   private static final String f_22132 = "title";
   private static final String f_22133 = "chat";
   private static final String f_22134 = "global";
   private static final String f_22135 = "chat";
   private static final String f_22136 = "global";
   private static final String f_22137 = "title";
   private static final String f_22138 = "Общий чат";
   private static final String f_22139 = "preview";
   private static final String f_22140 = "Все пользователи Dimasik";
   private static final String f_22141 = "people";
   private static final String f_22142 = "id";
   private static final String f_22143 = "chat";
   private static final String f_22144 = "title";
   private static final String f_22145 = "name";
   private static final String f_22146 = "preview";
   private static final String f_22147 = "online";
   private static final String f_22148 = "В сети";
   private static final String f_22149 = "seen";
   private static final String f_22150 = "profile";
   private static final String f_22151 = "global";
   private static final String f_22152 = "chat";
   private static final String f_22153 = "peer";
   private static final String f_22154 = "Общий чат";
   private static final String f_22155 = "name";
   private static final String f_22156 = "pinned";
   private static final String f_22157 = "id";
   private static final String f_22158 = "messages";
   private static final String f_22159 = "author";
   private static final String f_22160 = "id";
   private static final String f_22161 = "middle";
   private static final String f_22162 = "bottom";
   private static final String f_22163 = "top";
   private static final String f_22164 = "single";
   private static final String f_22165 = "hasMore";
   private static final float f_22166 = 44.0F;
   private static final float f_22167 = 8.0F;
   private static final float f_22168 = 38.0F;
   private static final float f_22169 = 35.0F;
   private static final float f_22170 = 7.0F;
   private static final float f_22171 = 14.0F;
   private static final float f_22172 = 14.0F;
   private static final String f_22173 = "hasMore";
   private static final float f_22174 = 85.0F;
   private static final float f_22175 = 170.0F;
   private static final float f_22176 = 30.0F;
   private static final String f_22177 = "Ранние сообщения";
   private static final float f_22178 = 44.0F;
   private static final float f_22179 = 8.0F;
   private static final String f_22180 = "time";
   private static final float f_22181 = 12.0F;
   private static final float f_22182 = 26.0F;
   private static final float f_22183 = 25.0F;
   private static final float f_22184 = 13.0F;
   private static final float f_22185 = 6.0F;
   private static final float f_22186 = 12.0F;
   private static final float f_22187 = 38.0F;
   private static final String f_22188 = "Загружаем переписку…";
   private static final String f_22189 = "Пока нет сообщений";
   private static final float f_22190 = 15.0F;
   private static final float f_22191 = 36.0F;
   private static final float f_22192 = 22.0F;
   private static final float f_22193 = 42.0F;
   private static final float f_22194 = 21.0F;
   private static final float f_22195 = 8.0F;
   private static final float f_22196 = 15.0F;
   private static final float f_22197 = 4.0F;
   private static final float f_22198 = 95.0F;
   private static final float f_22199 = 220.0F;
   private static final float f_22200 = 330.0F;
   private static final float f_22201 = 18.0F;
   private static final float f_22202 = 85.0F;
   private static final float f_22203 = 18.0F;
   private static final float f_22204 = 54.0F;
   private static final float f_22205 = 27.0F;
   private static final float f_22206 = 28.0F;
   private static final float f_22207 = 18.0F;
   private static final float f_22208 = 25.0F;
   private static final float f_22209 = 18.0F;
   private static final String f_22210 = "Сообщество Dimasik";
   private static final float f_22211 = 49.0F;
   private static final float f_22212 = 13.0F;
   private static final float f_22213 = 18.0F;
   private static final float f_22214 = 54.0F;
   private static final float f_22215 = 70.0F;
   private static final float f_22216 = 18.0F;
   private static final float f_22217 = 54.0F;
   private static final float f_22218 = 54.0F;
   private static final float f_22219 = 27.0F;
   private static final float f_22220 = 66.0F;
   private static final float f_22221 = 22.0F;
   private static final float f_22222 = 46.0F;
   private static final float f_22223 = 70.0F;
   private static final float f_22224 = 18.0F;
   private static final float f_22225 = 54.0F;
   private static final float f_22226 = 54.0F;
   private static final String f_22227 = "id";
   private static final float f_22228 = 20.0F;
   private static final float f_22229 = 88.0F;
   private static final float f_22230 = 40.0F;
   private static final float f_22231 = 50.0F;
   private static final float f_22232 = 25.0F;
   private static final float f_22233 = 39.0F;
   private static final float f_22234 = 98.0F;
   private static final float f_22235 = 8.0F;
   private static final String f_22236 = "Закреплённое сообщение";
   private static final float f_22237 = 51.0F;
   private static final float f_22238 = 95.0F;
   private static final float f_22239 = 15.0F;
   private static final String f_22240 = "text";
   private static final float f_22241 = 135.0F;
   private static final float f_22242 = 13.0F;
   private static final float f_22243 = 51.0F;
   private static final float f_22244 = 116.0F;
   private static final float f_22245 = 13.0F;
   private static final String f_22246 = "pin";
   private static final float f_22247 = 58.0F;
   private static final float f_22248 = 101.0F;
   private static final float f_22249 = 24.0F;
   private static final float f_22250 = 20.0F;
   private static final float f_22251 = 88.0F;
   private static final float f_22252 = 40.0F;
   private static final float f_22253 = 50.0F;
   private static final float f_22254 = 197.0F;
   private static final float f_22255 = 39.0F;
   private static final float f_22256 = 176.0F;
   private static final float f_22257 = 31.0F;
   private static final String f_22258 = "К новым сообщениям";
   private static final float f_22259 = 100.0F;
   private static final float f_22260 = 61.0F;
   private static final float f_22261 = 47.0F;
   private static final float f_22262 = 39.0F;
   private static final String f_22263 = "down";
   private static final float f_22264 = 8.0F;
   private static final String f_22265 = "id";
   private static final float f_22266 = 109.0F;
   private static final float f_22267 = 108.0F;
   private static final float f_22268 = 76.0F;
   private static final float f_22269 = 117.0F;
   private static final float f_22270 = 153.0F;
   private static final float f_22271 = 37.0F;
   private static final float f_22272 = 15.0F;
   private static final String f_22273 = "edit";
   private static final String f_22274 = "select";
   private static final String f_22275 = "reply";
   private static final float f_22276 = 88.0F;
   private static final float f_22277 = 108.0F;
   private static final float f_22278 = 19.0F;
   private static final String f_22279 = "Изменить: ";
   private static final String f_22280 = "Ответ: ";
   private static final String f_22281 = "text";
   private static final float f_22282 = 245.0F;
   private static final float f_22283 = 12.0F;
   private static final float f_22284 = 119.0F;
   private static final float f_22285 = 105.0F;
   private static final float f_22286 = 12.0F;
   private static final float f_22287 = 76.0F;
   private static final float f_22288 = 117.0F;
   private static final float f_22289 = 195.0F;
   private static final float f_22290 = 37.0F;
   private static final float f_22291 = 111.0F;
   private static final float f_22292 = 111.0F;
   private static final float f_22293 = 25.0F;
   private static final String f_22294 = "close";
   private static final float f_22295 = 20.0F;
   private static final float f_22296 = 69.0F;
   private static final float f_22297 = 47.0F;
   private static final String f_22298 = "smile";
   private static final float f_22299 = 76.0F;
   private static final float f_22300 = 69.0F;
   private static final float f_22301 = 153.0F;
   private static final float f_22302 = 47.0F;
   private static final String f_22303 = "Сообщение";
   private static final float f_22304 = 67.0F;
   private static final float f_22305 = 69.0F;
   private static final float f_22306 = 47.0F;
   private static final String f_22307 = "more";
   private static final String f_22308 = "send";
   private static final String f_22309 = "muted";
   private static final String f_22310 = "muteUntil";
   private static final String f_22311 = "Подключение…";
   private static final String f_22312 = "muteUntil";
   private static final String f_22313 = "muteReason";
   private static final float f_22314 = 45.0F;
   private static final float f_22315 = 10.0F;
   private static final float f_22316 = 16.0F;
   private static final float f_22317 = 10.0F;
   private static final String f_22318 = "author";
   private static final float f_22319 = 540.0F;
   private static final float f_22320 = 125.0F;
   private static final float f_22321 = 32.0F;
   private static final String f_22322 = "deleted";
   private static final String f_22323 = "Сообщение удалено";
   private static final String f_22324 = "text";
   private static final float f_22325 = 38.0F;
   private static final float f_22326 = 20.0F;
   private static final float f_22327 = 27.0F;
   private static final float f_22328 = 20.0F;
   private static final float f_22329 = 210.0F;
   private static final float f_22330 = 28.0F;
   private static final float f_22331 = 15.0F;
   private static final float f_22332 = 8.0F;
   private static final String f_22333 = "name";
   private static final String f_22334 = "author";
   private static final float f_22335 = 15.0F;
   private static final String f_22336 = "forwarded";
   private static final float f_22337 = 24.0F;
   private static final float f_22338 = 240.0F;
   private static final String f_22339 = "reply";
   private static final float f_22340 = 51.0F;
   private static final float f_22341 = 260.0F;
   private static final String f_22342 = "edited";
   private static final String f_22343 = "ред. ";
   private static final String f_22344 = "time";
   private static final float f_22345 = 12.0F;
   private static final float f_22346 = 12.0F;
   private static final float f_22347 = 12.0F;
   private static final String f_22348 = "reactions";
   private static final String f_22349 = "count";
   private static final float f_22350 = 58.0F;
   private static final float f_22351 = 46.0F;
   private static final float f_22352 = 16.0F;
   private static final float f_22353 = 40.0F;
   private static final String f_22354 = "emoji";
   private static final String f_22355 = "mine";
   private static final float f_22356 = 6.0F;
   private static final float f_22357 = 34.0F;
   private static final float f_22358 = 22.0F;
   private static final float f_22359 = 8.0F;
   private static final String f_22360 = "author";
   private static final float f_22361 = 22.0F;
   private static final String f_22362 = "global";
   private static final float f_22363 = 18.0F;
   private static final float f_22364 = 24.0F;
   private static final String f_22365 = "pending";
   private static final float f_22366 = 0.999F;
   private static final String f_22367 = "global";
   private static final float f_22368 = 30.0F;
   private static final float f_22369 = 18.0F;
   private static final float f_22370 = 32.0F;
   private static final float f_22371 = 30.0F;
   private static final float f_22372 = 17.0F;
   private static final float f_22373 = 32.0F;
   private static final float f_22374 = 32.0F;
   private static final float f_22375 = 32.0F;
   private static final float f_22376 = 9.0F;
   private static final float f_22377 = 18.0F;
   private static final float f_22378 = 12.0F;
   private static final float f_22379 = 28.0F;
   private static final float f_22380 = 8.0F;
   private static final float f_22381 = 16.0F;
   private static final float f_22382 = 34.0F;
   private static final float f_22383 = 34.0F;
   private static final String f_22384 = "author";
   private static final String f_22385 = "deleted";
   private static final String f_22386 = "id";
   private static final String f_22387 = "extracted";
   private static final String f_22388 = "id";
   private static final String f_22389 = "single";
   private static final float f_22390 = 12.0F;
   private static final float f_22391 = 16.0F;
   private static final float f_22392 = 32.0F;
   private static final float f_22393 = 28.0F;
   private static final String f_22394 = "forwarded";
   private static final String f_22395 = "forwarded";
   private static final float f_22396 = 32.0F;
   private static final float f_22397 = 14.0F;
   private static final float f_22398 = 16.0F;
   private static final float f_22399 = 14.0F;
   private static final float f_22400 = 24.0F;
   private static final String f_22401 = "reply";
   private static final float f_22402 = 9.0F;
   private static final float f_22403 = 18.0F;
   private static final float f_22404 = 44.0F;
   private static final float f_22405 = 5.0F;
   private static final float f_22406 = 9.0F;
   private static final float f_22407 = 44.0F;
   private static final String f_22408 = "replyName";
   private static final float f_22409 = 38.0F;
   private static final float f_22410 = 13.0F;
   private static final float f_22411 = 18.0F;
   private static final float f_22412 = 4.0F;
   private static final float f_22413 = 13.0F;
   private static final String f_22414 = "replyText";
   private static final float f_22415 = 38.0F;
   private static final float f_22416 = 15.0F;
   private static final float f_22417 = 18.0F;
   private static final float f_22418 = 24.0F;
   private static final float f_22419 = 15.0F;
   private static final float f_22420 = 51.0F;
   private static final float f_22421 = 16.0F;
   private static final float f_22422 = 12.0F;
   private static final String f_22423 = "edited";
   private static final String f_22424 = "ред. ";
   private static final String f_22425 = "time";
   private static final float f_22426 = 16.0F;
   private static final float f_22427 = 12.0F;
   private static final float f_22428 = 12.0F;
   private static final String f_22429 = "pending";
   private static final String f_22430 = "more";
   private static final String f_22431 = "read";
   private static final String f_22432 = "checks";
   private static final String f_22433 = "check";
   private static final float f_22434 = 16.0F;
   private static final float f_22435 = 18.0F;
   private static final float f_22436 = 3.0F;
   private static final float f_22437 = 18.0F;
   private static final float f_22438 = 8.0F;
   private static final float f_22439 = 16.0F;
   private static final float f_22440 = 34.0F;
   private static final float f_22441 = 17.0F;
   private static final float f_22442 = 8.0F;
   private static final float f_22443 = 5.0F;
   private static final float f_22444 = 24.0F;
   private static final float f_22445 = 8.0F;
   private static final float f_22446 = 6.0F;
   private static final float f_22447 = 16.0F;
   private static final float f_22448 = 17.0F;
   private static final String f_22449 = "0";
   private static final float f_22450 = 16.0F;
   private static final float f_22451 = 8.0F;
   private static final float f_22452 = 24.0F;
   private static final float f_22453 = 6.0F;
   private static final float f_22454 = 16.0F;
   private static final String f_22455 = "time";
   private static final String f_22456 = "time";
   private static final float f_22457 = 3.0F;
   private static final float f_22458 = 9.0F;
   private static final String f_22459 = "author";
   private static final String f_22460 = "author";
   private static final String f_22461 = "time";
   private static final String f_22462 = "time";
   private static final long f_22463 = 300000L;
   private static final String f_22464 = "time";
   private static final String f_22465 = "time";
   private static final String f_22466 = "out_";
   private static final String f_22467 = "in_";
   private static final float f_22468 = 18.0F;
   private static final float f_22469 = 24.0F;
   private static final float f_22470 = 42.0F;
   private static final float f_22471 = 10.0F;
   private static final float f_22472 = 4.0F;
   private static final float f_22473 = 43.0F;
   private static final float f_22474 = 19.0F;
   private static final float f_22475 = 20.0F;
   private static final float f_22476 = 37.0F;
   private static final float f_22477 = 19.0F;
   private static final float f_22478 = 17.0F;
   private static final float f_22479 = 43.0F;
   private static final float f_22480 = 37.0F;
   private static final float f_22481 = 43.0F;
   private static final float f_22482 = 37.0F;
   private static final String f_22483 = "Сегодня";
   private static final String f_22484 = "Вчера";
   private static final String f_22485 = "d MMMM";
   private static final String f_22486 = "ru";
   private static final String f_22487 = "online";
   private static final String f_22488 = "в сети";
   private static final String f_22489 = "seen";
   private static final String f_22490 = "был(а) недавно";
   private static final long f_22491 = 60000L;
   private static final String f_22492 = "был(а) только что";
   private static final long f_22493 = 60L;
   private static final String f_22494 = "author";
   private static final String f_22495 = "deleted";
   private static final float f_22496 = 24.0F;
   private static final float f_22497 = 26.0F;
   private static final float f_22498 = 26.0F;
   private static final int f_22499 = -1862270976;
   private static final String f_22500 = "reply";
   private static final String f_22501 = "Ответить";
   private static final String f_22502 = "copy";
   private static final String f_22503 = "Копировать";
   private static final String f_22504 = "edit";
   private static final String f_22505 = "Изменить";
   private static final String f_22506 = "canPin";
   private static final String f_22507 = "pinned";
   private static final String f_22508 = "id";
   private static final String f_22509 = "id";
   private static final String f_22510 = "pin";
   private static final String f_22511 = "Открепить";
   private static final String f_22512 = "Закрепить";
   private static final String f_22513 = "forward";
   private static final String f_22514 = "Переслать";
   private static final String f_22515 = "admin";
   private static final String f_22516 = "global";
   private static final String f_22517 = "delete";
   private static final String f_22518 = "Удалить";
   private static final String f_22519 = "select";
   private static final String f_22520 = "Выбрать";
   private static final float f_22521 = 240.0F;
   private static final float f_22522 = 510.0F;
   private static final float f_22523 = 124.0F;
   private static final String f_22524 = "text";
   private static final String f_22525 = "\n";
   private static final String f_22526 = "reactions";
   private static final String f_22527 = "reply";
   private static final String f_22528 = "forwarded";
   private static final float f_22529 = 510.0F;
   private static final float f_22530 = 358.0F;
   private static final float f_22531 = 12.0F;
   private static final float f_22532 = 16.0F;
   private static final float f_22533 = 20.0F;
   private static final float f_22534 = 56.0F;
   private static final float f_22535 = 18.0F;
   private static final float f_22536 = 18.0F;
   private static final float f_22537 = 12.0F;
   private static final float f_22538 = 46.0F;
   private static final float f_22539 = 23.0F;
   private static final float f_22540 = 6.0F;
   private static final float f_22541 = 4.0F;
   private static final float f_22542 = 44.0F;
   private static final float f_22543 = 46.0F;
   private static final float f_22544 = 30.0F;
   private static final float f_22545 = 14.0F;
   private static final float f_22546 = 36.0F;
   private static final float f_22547 = 5.0F;
   private static final float f_22548 = 36.0F;
   private static final float f_22549 = 4.0F;
   private static final float f_22550 = 44.0F;
   private static final float f_22551 = 46.0F;
   private static final float f_22552 = 42.0F;
   private static final float f_22553 = 7.0F;
   private static final float f_22554 = 32.0F;
   private static final float f_22555 = 32.0F;
   private static final float f_22556 = 16.0F;
   private static final String f_22557 = "down";
   private static final float f_22558 = 36.0F;
   private static final float f_22559 = 13.0F;
   private static final float f_22560 = 20.0F;
   private static final float f_22561 = 42.0F;
   private static final float f_22562 = 7.0F;
   private static final float f_22563 = 32.0F;
   private static final float f_22564 = 32.0F;
   private static final float f_22565 = 56.0F;
   private static final float f_22566 = 12.0F;
   private static final float f_22567 = 30.0F;
   private static final float f_22568 = 11.0F;
   private static final String f_22569 = "read";
   private static final String f_22570 = "checks";
   private static final String f_22571 = "check";
   private static final float f_22572 = 24.5F;
   private static final float f_22573 = 11.0F;
   private static final float f_22574 = 23.0F;
   private static final String f_22575 = "read";
   private static final String f_22576 = "Прочитано";
   private static final String f_22577 = "Доставлено";
   private static final float f_22578 = 60.0F;
   private static final float f_22579 = 14.0F;
   private static final float f_22580 = 14.0F;
   private static final float f_22581 = 22.0F;
   private static final float f_22582 = 44.0F;
   private static final float f_22583 = 44.0F;
   private static final float f_22584 = 0.8F;
   private static final float f_22585 = 53.0F;
   private static final float f_22586 = 22.0F;
   private static final float f_22587 = 44.0F;
   private static final float f_22588 = 0.8F;
   private static final float f_22589 = 8.0F;
   private static final float f_22590 = 7.0F;
   private static final float f_22591 = 14.0F;
   private static final float f_22592 = 43.0F;
   private static final float f_22593 = 7.0F;
   private static final float f_22594 = 14.0F;
   private static final float f_22595 = 43.0F;
   private static final float f_22596 = 12.0F;
   private static final int f_22597 = -43687;
   private static final float f_22598 = 24.0F;
   private static final float f_22599 = 10.0F;
   private static final float f_22600 = 24.0F;
   private static final float f_22601 = 60.0F;
   private static final float f_22602 = 13.0F;
   private static final float f_22603 = 17.0F;
   private static final float f_22604 = 7.0F;
   private static final float f_22605 = 14.0F;
   private static final float f_22606 = 43.0F;
   private static final float f_22607 = 44.0F;
   private static final float f_22608 = 425.0F;
   private static final float f_22609 = 133.0F;
   private static final float f_22610 = 10.0F;
   private static final float f_22611 = 330.0F;
   private static final float f_22612 = 54.0F;
   private static final float f_22613 = 27.0F;
   private static final float f_22614 = 7.0F;
   private static final float f_22615 = 5.0F;
   private static final float f_22616 = 11.0F;
   private static final float f_22617 = 32.0F;
   private static final float f_22618 = 4.0F;
   private static final float f_22619 = 44.0F;
   private static final float f_22620 = 46.0F;
   private static final float f_22621 = 22.0F;
   private static final float f_22622 = 26.0F;
   private static final float f_22623 = 26.0F;
   private static final int f_22624 = -1862270976;
   private static final float f_22625 = 185.0F;
   private static final float f_22626 = 35.0F;
   private static final float f_22627 = 14.0F;
   private static final float f_22628 = 370.0F;
   private static final float f_22629 = 70.0F;
   private static final float f_22630 = 28.0F;
   private static final String f_22631 = "Переслать сообщение";
   private static final float f_22632 = 22.0F;
   private static final float f_22633 = 20.0F;
   private static final float f_22634 = 18.0F;
   private static final float f_22635 = 370.0F;
   private static final float f_22636 = 70.0F;
   private static final float f_22637 = 322.0F;
   private static final float f_22638 = 15.0F;
   private static final float f_22639 = 30.0F;
   private static final String f_22640 = "close";
   private static final float f_22641 = 64.0F;
   private static final String f_22642 = "chats";
   private static final String f_22643 = "chat";
   private static final String f_22644 = "people";
   private static final String f_22645 = "id";
   private static final String f_22646 = "chat";
   private static final String f_22647 = "title";
   private static final String f_22648 = "name";
   private static final float f_22649 = 45.0F;
   private static final float f_22650 = 10.0F;
   private static final float f_22651 = 350.0F;
   private static final String f_22652 = "chat";
   private static final String f_22653 = "global";
   private static final float f_22654 = 36.0F;
   private static final float f_22655 = 16.0F;
   private static final float f_22656 = 338.0F;
   private static final float f_22657 = 36.0F;
   private static final String f_22658 = "title";
   private static final float f_22659 = 43.0F;
   private static final float f_22660 = 22.0F;
   private static final float f_22661 = 26.0F;
   private static final float f_22662 = 26.0F;
   private static final int f_22663 = Integer.MIN_VALUE;
   private static final float f_22664 = 510.0F;
   private static final float f_22665 = 642.0F;
   private static final float f_22666 = 15.0F;
   private static final float f_22667 = 14.0F;
   private static final float f_22668 = 29.0F;
   private static final float f_22669 = 0.28F;
   private static final float f_22670 = 0.16F;
   private static final float f_22671 = 338.0F;
   private static final float f_22672 = 28.0F;
   private static final float f_22673 = 310.0F;
   private static final float f_22674 = 28.0F;
   private static final float f_22675 = 22.0F;
   private static final float f_22676 = 19.0F;
   private static final float f_22677 = 44.0F;
   private static final String f_22678 = "back";
   private static final String f_22679 = "id";
   private static final float f_22680 = 92.0F;
   private static final float f_22681 = 21.0F;
   private static final float f_22682 = 71.0F;
   private static final float f_22683 = 40.0F;
   private static final String f_22684 = "Править";
   private static final String f_22685 = "Чат";
   private static final float f_22686 = 60.0F;
   private static final float f_22687 = 38.0F;
   private static final float f_22688 = 120.0F;
   private static final String f_22689 = "name";
   private static final String f_22690 = "Профиль";
   private static final float f_22691 = 50.0F;
   private static final float f_22692 = 30.0F;
   private static final float f_22693 = 178.0F;
   private static final float f_22694 = 30.0F;
   private static final float f_22695 = 219.0F;
   private static final float f_22696 = 17.0F;
   private static final float f_22697 = 66.0F;
   private static final float f_22698 = 3.0F;
   private static final float f_22699 = 21.0F;
   private static final float f_22700 = 265.0F;
   private static final String f_22701 = "chat";
   private static final String f_22702 = "Мои чаты";
   private static final String f_22703 = "Сообщение";
   private static final float f_22704 = 33.0F;
   private static final float f_22705 = 265.0F;
   private static final String f_22706 = "copy";
   private static final String f_22707 = "Копировать ник";
   private static final float f_22708 = 45.0F;
   private static final float f_22709 = 265.0F;
   private static final String f_22710 = "edit";
   private static final String f_22711 = "search";
   private static final String f_22712 = "Статус";
   private static final String f_22713 = "Найти";
   private static final float f_22714 = 365.0F;
   private static final float f_22715 = 21.0F;
   private static final float f_22716 = 42.0F;
   private static final float f_22717 = 172.0F;
   private static final float f_22718 = 24.0F;
   private static final String f_22719 = "имя пользователя";
   private static final float f_22720 = 42.0F;
   private static final float f_22721 = 19.0F;
   private static final float f_22722 = 15.0F;
   private static final String f_22723 = "id";
   private static final float f_22724 = 42.0F;
   private static final float f_22725 = 46.0F;
   private static final float f_22726 = 18.0F;
   private static final float f_22727 = 65.0F;
   private static final float f_22728 = 30.0F;
   private static final float f_22729 = 27.0F;
   private static final String f_22730 = "copy";
   private static final float f_22731 = 42.0F;
   private static final float f_22732 = 81.0F;
   private static final float f_22733 = 84.0F;
   private static final float f_22734 = 0.7F;
   private static final String f_22735 = "статус";
   private static final float f_22736 = 42.0F;
   private static final float f_22737 = 99.0F;
   private static final float f_22738 = 15.0F;
   private static final float f_22739 = 32.0F;
   private static final float f_22740 = 122.0F;
   private static final float f_22741 = 64.0F;
   private static final float f_22742 = 37.0F;
   private static final String f_22743 = "Ваш статус";
   private static final String f_22744 = "status";
   private static final String f_22745 = "Не указан";
   private static final String f_22746 = "status";
   private static final float f_22747 = 86.0F;
   private static final float f_22748 = 16.0F;
   private static final float f_22749 = 42.0F;
   private static final float f_22750 = 128.0F;
   private static final float f_22751 = 16.0F;
   private static final float f_22752 = 21.0F;
   private static final float f_22753 = 566.0F;
   private static final float f_22754 = 42.0F;
   private static final float f_22755 = 48.0F;
   private static final String f_22756 = "Сохранить статус";
   private static final float f_22757 = 21.0F;
   private static final float f_22758 = 566.0F;
   private static final float f_22759 = 42.0F;
   private static final float f_22760 = 49.0F;
   private static final float f_22761 = 25.0F;
   private static final float f_22762 = 26.0F;
   private static final float f_22763 = 571.0F;
   private static final float f_22764 = 54.0F;
   private static final float f_22765 = 39.0F;
   private static final float f_22766 = 14.0F;
   private static final String f_22767 = "Профиль";
   private static final float f_22768 = 21.0F;
   private static final float f_22769 = 42.0F;
   private static final float f_22770 = 4.0F;
   private static final float f_22771 = 581.0F;
   private static final float f_22772 = 16.0F;
   private static final String f_22773 = "Переписка";
   private static final float f_22774 = 21.0F;
   private static final float f_22775 = 42.0F;
   private static final float f_22776 = 3.0F;
   private static final float f_22777 = 4.0F;
   private static final float f_22778 = 581.0F;
   private static final float f_22779 = 16.0F;
   private static final float f_22780 = 566.0F;
   private static final float f_22781 = 21.0F;
   private static final float f_22782 = 49.0F;
   private static final float f_22783 = 29.0F;
   private static final float f_22784 = 62.0F;
   private static final float f_22785 = 20.0F;
   private static final float f_22786 = 62.0F;
   private static final float f_22787 = 27.0F;
   private static final float f_22788 = 8.0F;
   private static final float f_22789 = 27.0F;
   private static final float f_22790 = 42.0F;
   private static final float f_22791 = 12.0F;
   private static final float f_22792 = 62.0F;
   private static final String f_22793 = "author";
   private static final String f_22794 = "self";
   private static final String f_22795 = "peer";
   private static final String f_22796 = "id";
   private static final String f_22797 = "people";
   private static final String f_22798 = "id";
   private static final String f_22799 = "id";
   private static final String f_22800 = "name";
   private static final String f_22801 = "name";
   private static final String f_22802 = "id";
   private static final String f_22803 = "author";
   private static final String f_22804 = "self";
   private static final String f_22805 = "peer";
   private static final String f_22806 = "id";
   private static final String f_22807 = "people";
   private static final String f_22808 = "id";
   private static final String f_22809 = "(?is)^/(ban|mute)(?:\\s.*)?$";
   private static final String f_22810 = "global";
   private static final String f_22811 = "Команды /ban и /mute доступны только ADMIN в общем чате";
   private static final String f_22812 = "global";
   private static final String f_22813 = "muted";
   private static final String f_22814 = "muteUntil";
   private static final String f_22815 = "muteUntil";
   private static final String f_22816 = "muteReason";
   private static final String f_22817 = "text";
   private static final String f_22818 = "id";
   private static final String f_22819 = "id";
   private static final String f_22820 = "reply";
   private static final String f_22821 = "id";
   private static final String f_22822 = "id";
   private static final String f_22823 = "author";
   private static final String f_22824 = "name";
   private static final String f_22825 = "self";
   private static final String f_22826 = "name";
   private static final String f_22827 = "role";
   private static final String f_22828 = "time";
   private static final String f_22829 = "pending";
   private static final String f_22830 = "replyText";
   private static final String f_22831 = "text";
   private static final String f_22832 = "replyName";
   private static final String f_22833 = "name";
   private static final String f_22834 = "edit";
   private static final String f_22835 = "send";
   private static final String f_22836 = "nonce";
   private static final String f_22837 = "id";
   private static final String f_22838 = "id";
   private static final String f_22839 = "emoji";
   private static final String f_22840 = "react";
   private static final String f_22841 = "id";
   private static final String f_22842 = "\n";
   private static final float f_22843 = 16.0F;
   private static final float f_22844 = 40.0F;
   private static final float f_22845 = 12.0F;
   private static final float f_22846 = 19.0F;
   private static final float f_22847 = 19.0F;
   private static final float f_22848 = 20.0F;
   private static final float f_22849 = 18.0F;
   private static final float f_22850 = 14.0F;
   private static final float f_22851 = 20.0F;
   private static final float f_22852 = 4.0F;
   private static final float f_22853 = 9.0F;
   private static final float f_22854 = 8.0F;
   private static final float f_22855 = 20.0F;
   private static final float f_22856 = 9.0F;
   private static final float f_22857 = 20.0F;
   private static final float f_22858 = 18.0F;
   private static final float f_22859 = 20.0F;
   private static final float f_22860 = 20.0F;
   private static final long f_22861 = 1000L;
   private static final long f_22862 = 600L;
   private static final float f_22863 = 20.0F;
   private static final float f_22864 = 10.0F;
   private static final float f_22865 = 1.2F;
   private static final float f_22866 = 20.0F;
   private static final String f_22867 = "globe";
   private static final float f_22868 = 0.23F;
   private static final float f_22869 = 0.23F;
   private static final float f_22870 = 0.54F;
   private static final String f_22871 = "skin";
   private static final float f_22872 = 0.125F;
   private static final float f_22873 = 0.625F;
   private static final float f_22874 = 0.125F;
   private static final float f_22875 = 0.125F;
   private static final float f_22876 = 0.125F;
   private static final String f_22877 = "name";
   private static final String f_22878 = "?";
   private static final String f_22879 = "?";
   private static final float f_22880 = 0.3F;
   private static final float f_22881 = 0.25F;
   private static final float f_22882 = 0.45F;
   private static final String f_22883 = "online";
   private static final float f_22884 = 11.0F;
   private static final float f_22885 = 11.0F;
   private static final float f_22886 = 12.0F;
   private static final float f_22887 = 12.0F;
   private static final float f_22888 = 6.0F;
   private static final float f_22889 = 9.0F;
   private static final float f_22890 = 9.0F;
   private static final float f_22891 = 8.0F;
   private static final float f_22892 = 8.0F;
   private static final float f_22893 = 4.0F;
   private static final int f_22894 = -10037428;
   private static final float f_22895 = 18.0F;
   private static final float f_22896 = 37.0F;
   private static final float f_22897 = 15.0F;
   private static final float f_22898 = 12.0F;
   private static final float f_22899 = 37.0F;
   private static final float f_22900 = 37.0F;
   private static final float f_22901 = 15.0F;
   private static final float f_22902 = 12.0F;
   private static final String f_22903 = "person";
   private static final String f_22904 = "people";
   private static final float f_22905 = 61.0F;
   private static final float f_22906 = 24.0F;
   private static final float f_22907 = 9.0F;
   private static final float f_22908 = 24.0F;
   private static final float f_22909 = 39.0F;
   private static final float f_22910 = 11.0F;
   private static final float f_22911 = 61.0F;
   private static final float f_22912 = 0.23F;
   private static final float f_22913 = 0.23F;
   private static final float f_22914 = 0.54F;
   private static final float f_22915 = 0.8F;
   private static final float f_22916 = 17.142857F;
   private static final float f_22917 = 0.7F;
   private static final int f_22918 = -16777216;
   private static final int f_22919 = 16777215;
   private static final float f_22920 = 3.0F;
   private static final String f_22921 = "H";
   private static final float f_22922 = 0.5F;
   private static final int f_22923 = 65039;
   private static final float f_22924 = 0.5F;
   private static final float f_22925 = 3.0F;
   private static final int f_22926 = 65039;
   private static final int f_22927 = 65039;
   private static final String f_22928 = "\n";
   private static final String f_22929 = " ";
   private static final String f_22930 = "недавно";
   private static final float f_22931 = 43.0F;
   private static final double f_22932 = 42.0;
   private static final float f_22933 = 46.0F;
   private static final float f_22934 = 14.0F;
   private static final String f_22935 = "name";
   private static final String f_22936 = "Player";
   private static final float f_22937 = 20.0F;
   private static final String f_22938 = "name";
   private static final String f_22939 = "text";
   private static final String f_22940 = "id";
   private static final String f_22941 = "resultId";
   private static final String f_22942 = "id";
   private static final String f_22943 = "status";
   private static final String f_22944 = "profile";
   private static final String f_22945 = "self";
   private static final String f_22946 = "id";
   private static final String f_22947 = "status";
   private static final String f_22948 = "id";
   private static final String f_22949 = "name";
   private static final String f_22950 = "id";
   private static final String f_22951 = "status";
   private static final String f_22952 = "id";
   private static final String f_22953 = "chat";
   private static final String f_22954 = "sourceChat";
   private static final String f_22955 = "id";
   private static final String f_22956 = "id";
   private static final String f_22957 = "forward";
   private static final String f_22958 = "id";
   private static final String f_22959 = "delete";
   private static final String f_22960 = "hide";
   private static final String f_22961 = "id";
   private static final String f_22962 = "pin";
   private static final String f_22963 = "id";
   private static final String f_22964 = "text";
   private static final String f_22965 = "text";
   private static final String f_22966 = "id";
   private static final float f_22967 = 0.999F;
   private static final String f_22968 = "chat";
   private static final String f_22969 = "global";
   private static final String f_22970 = "self";
   private static final float f_22971 = 16.0F;
   private static final String f_22972 = "❤";
   private static final String f_22973 = "\ud83d\udc4d";
   private static final String f_22974 = "\ud83d\udc4e";
   private static final String f_22975 = "\ud83d\udd25";
   private static final String f_22976 = "\ud83e\udd70";
   private static final String f_22977 = "\ud83d\udc4f";
   private static final String f_22978 = "\ud83d\ude01";
   private static final float f_22979 = 9.0F;
   private static final float f_22980 = 12.0F;
   private static final float f_22981 = 78.0F;
   private static final float f_22982 = 68.0F;
   private static final float f_22983 = 96.0F;
   private static final float f_22984 = 17.0F;
   private static final float f_22985 = 62.0F;
   private static final float f_22986 = 75.0F;
   private static final float f_22987 = 96.0F;
   private static final float f_22988 = 18.0F;
   private static final float f_22989 = 61.0F;
   private static final float f_22990 = 75.0F;
   private static final float f_22991 = 96.0F;
   private static final float f_22992 = 17.0F;
   private static final float f_22993 = 59.0F;
   private static final float f_22994 = 75.0F;
   private static final float f_22995 = 96.0F;
   private static final float f_22996 = 7.0F;
   private static final float f_22997 = 83.0F;
   private static final float f_22998 = 80.0F;
   private static final float f_22999 = 96.0F;
   private static final float f_23000 = 9.0F;
   private static final float f_23001 = 78.0F;
   private static final float f_23002 = 78.0F;
   private static final float f_23003 = 96.0F;
   private static final float f_23004 = 9.0F;
   private static final float f_23005 = 78.0F;
   private static final float f_23006 = 78.0F;
   private static final float f_23007 = 96.0F;
   private static final String f_23008 = "HH:mm";

   private void closeProfile() {
      this.f_21932 = null;
      this.focus(this.f_21923);
   }

   public boolean mouseClicked(MouseButtonEvent var1, boolean var2) {
      if (this.f_21952) {
         return true;
      }

      Vector2f var3 = Class_FvJXUGWpZo3zYBW4.m_2693(var1.x(), var1.y());
      this.f_21938 = var3.x / this.f_21947;
      this.f_21939 = var3.y / this.f_21947;

      for (int var4 = this.f_21917.size() - 1; var4 >= 0; var4--) {
         Screen_7.UyHw3Vp5U7VilHxq var5 = this.f_21917.get(var4);
         if (this.hovered(var5.x, var5.y, var5.w, var5.h)) {
            Runnable var6 = var1.button() == 1 ? var5.right : (var1.button() == 0 ? var5.left : null);
            if (var6 != null) {
               var6.run();
               return true;
            }
         }
      }

      return true;
   }

   public void removed() {
      this.f_21918.forEach((var1, var2) -> this.f_21916.f_34594.put(var1, var2.getValue()));
   }

   private void button(float var1, float var2, float var3, float var4, String var5, Runnable var6) {
      this.pill(var1, var2, var3, var4, var5, var6);
   }

   private void drawForward() {
      float var1 = Class_Ssh31B3ljfKeWsvS.m_4821();
      float var2 = this.f_21958.f_21861.m_9288();
      Class_Ssh31B3ljfKeWsvS.m_4864(var1 * var2);
      JsonObject var3 = this.f_21958.f_21862;
      this.f_21917.clear();
      this.blur(this.f_21933, this.f_21934, this.f_21935, this.f_21936, f_22621, f_22622);
      this.rect(this.f_21933, this.f_21934, this.f_21935, this.f_21936, f_22623, f_22624);
      this.hit(this.f_21933, this.f_21934, this.f_21935, this.f_21936, () -> this.f_21931 = null, null);
      float var4 = this.f_21933 + this.f_21935 / 2.0F - f_22625;
      float var5 = this.f_21934 + f_22626 + f_22627 * (1.0F - var2);
      this.glass(var4, var5, f_22628, this.f_21936 - f_22629, f_22630);
      this.text(f_22631, var4 + f_22632, var5 + f_22633, f_22634, this.f_21890);
      this.hit(var4, var5, f_22635, this.f_21936 - f_22636, () -> {}, null);
      this.iconButton(var4 + f_22637, var5 + f_22638, f_22639, f_22640, () -> this.f_21931 = null);
      float var6 = var5 + f_22641;
      HashSet var7 = new HashSet();
      ArrayList var8 = new ArrayList();

      for (JsonElement var10 : Class_wrEVVKLbnt6Fm3mm.m_9428(this.f_21916.m_9407(), f_22642)) {
         JsonObject var11 = var10.getAsJsonObject();
         if (var7.add(Class_wrEVVKLbnt6Fm3mm.m_9410(var11, f_22643, ""))) {
            var8.add(var11);
         }
      }

      for (JsonElement var17 : Class_wrEVVKLbnt6Fm3mm.m_9428(this.f_21916.m_9407(), f_22644)) {
         JsonObject var19 = var17.getAsJsonObject();
         String var12 = Class_wrEVVKLbnt6Fm3mm.m_9410(var19, f_22645, "");
         if (var7.add(var12)) {
            JsonObject var13 = new JsonObject();
            var13.addProperty(f_22646, var12);
            var13.addProperty(f_22647, Class_wrEVVKLbnt6Fm3mm.m_9410(var19, f_22648, var12));
            var8.add(var13);
         }
      }

      float var16 = var6;
      float var18 = this.f_21934 + this.f_21936 - f_22649;
      this.f_21945 = Math.clamp(this.f_21945, 0.0F, Math.max(0.0F, var8.size() * 43 - (var18 - var16)));
      var6 -= this.f_21945;
      this.scissor(var4 + f_22650, var16, f_22651, var18 - var16);

      for (Object var21_obj : var8) {
          JsonObject var21 = (JsonObject)var21_obj;
         String var22 = Class_wrEVVKLbnt6Fm3mm.m_9410(var21, f_22652, f_22653);
         if (var6 >= var16 && var6 + f_22654 <= var18) {
            this.button(var4 + f_22655, var6, f_22656, f_22657, Class_wrEVVKLbnt6Fm3mm.m_9410(var21, f_22658, var22), () -> {
               JsonObject var3x = new JsonObject();
               var3x.addProperty(f_22953, var22);
               var3x.addProperty(f_22954, this.f_21916.m_9436());
               var3x.addProperty(f_22955, Class_wrEVVKLbnt6Fm3mm.m_9399(var3, f_22956));
               this.f_21916.m_9426(f_22957, var3x, () -> {
                  this.f_21931 = null;
                  this.choose(var22);
               });
            });
         }

         var6 += f_22659;
      }

      Class_Ssh31B3ljfKeWsvS.m_4828();
      Class_Ssh31B3ljfKeWsvS.m_4864(var1);
   }

   private void glass(float var1, float var2, float var3, float var4, float var5) {
      float var6 = Math.min(var5, f_22916);
      this.rect(var1, var2, var3, var4, var6, this.f_21896);
      Class_Ssh31B3ljfKeWsvS.m_4854(
         var1 * this.f_21947, var2 * this.f_21947, var3 * this.f_21947, var4 * this.f_21947, this.f_21947 / f_22917, var6 * this.f_21947, this.f_21897
      );
   }

   private boolean hasProfileOverlay() {
      return this.f_21932 != null || this.f_21959.f_21862 != null;
   }

   private void scissor(float var1, float var2, float var3, float var4) {
      Class_Ssh31B3ljfKeWsvS.m_4860(var1 * this.f_21947, var2 * this.f_21947, var3 * this.f_21947, var4 * this.f_21947);
   }

   public Screen_7(Screen var1) {
      super(Component.literal(f_21963));
      this.f_21906 = f_21964;
      this.f_21907 = System.nanoTime();
      this.f_21910 = new HashMap<>();
      this.f_21916 = Class_wrEVVKLbnt6Fm3mm.m_9420();
      this.f_21917 = new ArrayList<>();
      this.f_21918 = new HashMap<>();
      this.f_21919 = new HashMap<>();
      this.f_21920 = new HashSet<>();
      this.f_21921 = new LinkedHashSet<>();
      this.f_21926 = f_21965;
      this.f_21927 = "";
      this.f_21946 = f_21966;
      this.f_21947 = 1.0F;
      this.f_21953 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_21967, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_21954 = new Class_w8fCJQ5ZtH5lQbWc(1.0F, f_21968, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_21955 = new Class_w8fCJQ5ZtH5lQbWc(1.0F, f_21969, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_21956 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_21970, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_21957 = new Screen_7.swwpeAJU95vIH9KE();
      this.f_21958 = new Screen_7.swwpeAJU95vIH9KE();
      this.f_21959 = new Screen_7.swwpeAJU95vIH9KE();
      this.f_21960 = IntStream.range(0, 7)
         .mapToObj(var0 -> new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_22971, Class_eXr9Fra2ad3yFXY8.f_19100))
         .toArray(Class_w8fCJQ5ZtH5lQbWc[]::new);
      this.f_21962 = new ArrayList<>();
      this.f_21915 = var1;
   }

   private void choose(String var1) {
      if (!var1.equals(this.f_21916.m_9436())) {
         this.f_21961 = null;
         this.f_21954.m_9281(0.0F);
      }

      this.f_21918.put(this.f_21926, this.f_21923);
      this.f_21923.setFocused(false);
      this.f_21916.m_9422(var1);
      this.f_21926 = var1;
      this.f_21923 = this.f_21918.computeIfAbsent(var1, this::draft);
      this.focus(this.f_21923);
      this.f_21940 = 0.0F;
      this.f_21951 = false;
      this.f_21929 = this.f_21930 = this.f_21928 = null;
      this.f_21948 = false;
      this.f_21921.clear();
   }

   private void drawContext() {
      JsonObject var1 = this.f_21957.f_21862;
      float var2 = Class_Ssh31B3ljfKeWsvS.m_4821();
      float var3 = this.f_21957.f_21861.m_9288();
      Class_Ssh31B3ljfKeWsvS.m_4864(var2 * var3);
      boolean var4 = Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_22494, "").equals(this.f_21916.m_9401());
      boolean var5 = Class_wrEVVKLbnt6Fm3mm.m_9418(var1, f_22495);
      this.f_21917.clear();
      this.blur(this.f_21933, this.f_21934, this.f_21935, this.f_21936, f_22496, f_22497);
      this.rect(this.f_21933, this.f_21934, this.f_21935, this.f_21936, f_22498, f_22499);
      this.hit(this.f_21933, this.f_21934, this.f_21935, this.f_21936, () -> this.f_21928 = null, () -> this.f_21928 = null);
      ArrayList var6 = new ArrayList();
      if (!var5) {
         var6.add(new Screen_7.zQCCjClMJviwuram(f_22500, f_22501, () -> {
            this.f_21929 = var1;
            this.f_21930 = null;
            this.focus(this.f_21923);
         }, false));
         var6.add(
            new Screen_7.zQCCjClMJviwuram(
               f_22502, f_22503, () -> this.minecraft.keyboardHandler.setClipboard(Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_22965, "")), false
            )
         );
         if (var4) {
            var6.add(new Screen_7.zQCCjClMJviwuram(f_22504, f_22505, () -> {
               this.f_21930 = var1;
               this.f_21929 = null;
               this.f_21923.setValue(Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_22964, ""));
               this.focus(this.f_21923);
            }, false));
         }

         if (Class_wrEVVKLbnt6Fm3mm.m_9418(this.f_21916.m_9407(), f_22506)) {
            boolean var7 = Class_wrEVVKLbnt6Fm3mm.m_9399(Class_wrEVVKLbnt6Fm3mm.m_9403(this.f_21916.m_9407(), f_22507), f_22508)
               == Class_wrEVVKLbnt6Fm3mm.m_9399(var1, f_22509);
            var6.add(
               new Screen_7.zQCCjClMJviwuram(
                  f_22510, var7 ? f_22511 : f_22512, () -> this.command(f_22962, Class_wrEVVKLbnt6Fm3mm.m_9399(var1, f_22963), null), false
               )
            );
         }

         var6.add(new Screen_7.zQCCjClMJviwuram(f_22513, f_22514, () -> {
            this.f_21931 = var1;
            this.f_21945 = 0.0F;
         }, false));
         boolean var24 = var4 || Class_wrEVVKLbnt6Fm3mm.m_9418(this.f_21916.m_9407(), f_22515) && this.f_21916.m_9436().equals(f_22516);
         var6.add(
            new Screen_7.zQCCjClMJviwuram(
               f_22517, f_22518, () -> this.command(var24 ? f_22959 : f_22960, Class_wrEVVKLbnt6Fm3mm.m_9399(var1, f_22961), null), true
            )
         );
      }

      var6.add(new Screen_7.zQCCjClMJviwuram(f_22519, f_22520, () -> {
         this.f_21948 = true;
         this.toggle(Class_wrEVVKLbnt6Fm3mm.m_9399(var1, f_22958));
      }, false));
      float var25 = f_22521;
      float var8 = var6.size() * 44 + 30 + (var4 && !var5 ? 53 : 0);
      Screen_7.iqnmR7ugq4MQ2zKl var9 = this.bubbleLayout(var1, f_22522);
      JsonObject var10 = var1.deepCopy();
      if (var9.height > f_22523) {
         if (var9.lines.size() > 3) {
            var10.addProperty(f_22524, String.join(f_22525, var9.lines.subList(0, 3)) + "");
         }

         var10.remove(f_22526);
         var10.remove(f_22527);
         var10.remove(f_22528);
      }

      Screen_7.iqnmR7ugq4MQ2zKl var11 = this.bubbleLayout(var10, f_22529);
      float var12 = f_22530;
      float var13 = Math.max(var12, var11.width);
      float var14 = (var5 ? 0 : 56) + var11.height + f_22531 + var8;
      float var15 = Math.clamp(this.f_21942, this.f_21933 + this.f_21937 + var13 + f_22532, this.f_21933 + this.f_21935 - f_22533);
      float var16 = var15 - var13;
      float var17 = Math.clamp(this.f_21943 - f_22534, this.f_21934 + f_22535, this.f_21934 + this.f_21936 - var14 - f_22536) + f_22537 * (1.0F - var3);
      if (!var5) {
         this.glass(var15 - var12, var17, var12, f_22538, f_22539);

         for (int var18 = 0; var18 < f_21911.length; var18++) {
            String var19 = f_21911[var18];
            float var20 = var15 - var12 + f_22540 + var18 * 44;
            this.f_21960[var18].m_9283(this.f_21928 != null && this.hovered(var20 - f_22541, var17, f_22542, f_22543) ? 1.0F : 0.0F);
            float var21 = f_22544 + f_22545 * this.f_21960[var18].m_9288();
            this.emoji(var18, var20 + (f_22546 - var21) / 2.0F, var17 + f_22547 + (f_22548 - var21), var21, -1);
            this.hit(var20 - f_22549, var17, f_22550, f_22551, () -> {
               this.react(var1, var19);
               this.f_21928 = null;
            }, null);
         }

         this.rect(var15 - f_22552, var17 + f_22553, f_22554, f_22555, f_22556, this.f_21895);
         this.icon(f_22557, var15 - f_22558, var17 + f_22559, f_22560, this.f_21890);
         this.hit(var15 - f_22561, var17 + f_22562, f_22563, f_22564, () -> this.f_21928 = null, null);
         var17 += f_22565;
      }

      this.bubbleBody(var10, var4 ? var15 - var11.width : var16, var17, var11, true);
      var17 += var11.height + f_22566;
      float var27 = var4 ? var15 - var25 : var16;
      this.glass(var27, var17, var25, var8, f_22567);
      this.hit(var27, var17, var25, var8, () -> {}, null);
      float var28 = var17 + f_22568;
      if (var4 && !var5) {
         this.icon(Class_wrEVVKLbnt6Fm3mm.m_9418(var1, f_22569) ? f_22570 : f_22571, var27 + f_22572, var28 + f_22573, f_22574, this.f_21890);
         this.text(Class_wrEVVKLbnt6Fm3mm.m_9418(var1, f_22575) ? f_22576 : f_22577, var27 + f_22578, var28 + f_22579, f_22580, this.f_21890);
         this.rect(var27 + f_22581, var28 + f_22582, var25 - f_22583, f_22584, 0.0F, this.f_21898);
         var28 += f_22585;
      }

      for (int var29 = 0; var29 < var6.size(); var29++) {
         Screen_7.zQCCjClMJviwuram var30 = (Screen_7.zQCCjClMJviwuram)var6.get(var29);
         if (var29 == var6.size() - 1) {
            this.rect(var27 + f_22586, var28 + 1.0F, var25 - f_22587, f_22588, 0.0F, this.f_21898);
            var28 += f_22589;
         }

         float var22 = var28;
         if (this.hovered(var27 + f_22590, var28, var25 - f_22591, f_22592)) {
            this.rect(var27 + f_22593, var28, var25 - f_22594, f_22595, f_22596, this.f_21901);
         }

         int var23 = var30.danger ? f_22597 : this.f_21890;
         this.icon(var30.icon, var27 + f_22598, var28 + f_22599, f_22600, var23);
         this.text(var30.label, var27 + f_22601, var28 + f_22602, f_22603, var23);
         this.hit(var27 + f_22604, var22, var25 - f_22605, f_22606, () -> {
            this.f_21928 = null;
            var30.action.run();
         }, null);
         var28 += f_22607;
      }

      Class_Ssh31B3ljfKeWsvS.m_4864(var2);
   }

   private void drawSidebar() {
      this.rect(this.f_21933 + this.f_21937 - 1.0F, this.f_21934 + f_22037, 1.0F, this.f_21936 - f_22038, 0.0F, this.f_21898);
      this.iconButton(this.f_21933 + f_22039, this.f_21934 + f_22040, f_22041, f_22042, this::onClose);
      this.centered(f_22043, this.f_21933 + this.f_21937 / 2.0F, this.f_21934 + f_22044, f_22045, this.f_21890);
      this.iconButton(this.f_21933 + this.f_21937 - f_22046, this.f_21934 + f_22047, f_22048, f_22049, () -> {
         this.f_21949 = !this.f_21949;
         this.focus(this.f_21924);
      });
      this.input(this.f_21924, this.f_21933 + f_22050, this.f_21934 + f_22051, this.f_21937 - f_22052, f_22053, this.f_21949 ? f_22054 : f_22055, f_22056);
      if (!this.f_21924.getValue().equals(this.f_21927)) {
         this.f_21927 = this.f_21924.getValue();
         this.f_21916.m_9412(this.f_21927);
         this.f_21941 = 0.0F;
      }

      float var1 = this.f_21934 + f_22057;
      float var2 = this.f_21934 + this.f_21936 - f_22058;
      List var3 = this.rows();
      this.f_21941 = Math.clamp(this.f_21941, 0.0F, Math.max(0.0F, var3.size() * 79 - (var2 - var1)));
      this.scissor(this.f_21933 + 1.0F, var1, this.f_21937 - 2.0F, var2 - var1);
      float var4 = var1 - this.f_21941;

      for (Object var6_obj : var3) {
          JsonObject var6 = (JsonObject)var6_obj;
         String var7 = Class_wrEVVKLbnt6Fm3mm.m_9410(var6, f_22059, "");
         if (var4 + f_22060 >= var1 && var4 <= var2) {
            boolean var8 = var7.equals(this.f_21916.m_9436());
            if (var8 || this.hovered(this.f_21933 + 1.0F, var4, this.f_21937 - 2.0F, f_22061)) {
               this.rect(this.f_21933 + 1.0F, var4, this.f_21937 - 2.0F, f_22062, 0.0F, var8 ? this.f_21900 : this.f_21901);
            }

            this.avatar(Class_wrEVVKLbnt6Fm3mm.m_9403(var6, f_22063), this.f_21933 + f_22064, var4 + f_22065, f_22066, var7.equals(f_22067));
            this.text(
               trim(Class_wrEVVKLbnt6Fm3mm.m_9410(var6, f_22068, var7), this.f_21937 - f_22069, f_22070),
               this.f_21933 + f_22071,
               var4 + f_22072,
               f_22073,
               this.f_21890
            );
            this.text(
               trim(Class_wrEVVKLbnt6Fm3mm.m_9410(var6, f_22074, f_22075), this.f_21937 - f_22076, f_22077),
               this.f_21933 + f_22078,
               var4 + f_22079,
               f_22080,
               this.f_21891
            );
            long var9 = Class_wrEVVKLbnt6Fm3mm.m_9399(var6, f_22081);
            if (var9 > 0L) {
               this.rect(this.f_21933 + this.f_21937 - f_22082, var4 + f_22083, f_22084, f_22085, f_22086, this.f_21900);
               this.centered(var9 > f_22087 ? f_22088 : var9 + "", this.f_21933 + this.f_21937 - f_22089, var4 + f_22090, f_22091, this.f_21892);
            }

            if (Class_wrEVVKLbnt6Fm3mm.m_9399(var6, f_22092) > 0L) {
               this.text(time(Class_wrEVVKLbnt6Fm3mm.m_9399(var6, f_22093)), this.f_21933 + this.f_21937 - f_22094, var4 + f_22095, f_22096, this.f_21891);
            }

            this.hit(
               this.f_21933 + 1.0F,
               Math.max(var1, var4),
               this.f_21937 - 2.0F,
               Math.min(var2, var4 + f_22097) - Math.max(var1, var4),
               () -> this.choose(var7),
               null
            );
            this.rect(this.f_21933 + f_22098, var4 + f_22099, this.f_21937 - f_22100, f_22101, 0.0F, this.f_21898);
         }

         var4 += f_22102;
      }

      if (var3.isEmpty()) {
         this.text(this.f_21916.m_9404() ? f_22103 : f_22104, this.f_21933 + f_22105, var1 + f_22106, f_22107, this.f_21891);
      }

      Class_Ssh31B3ljfKeWsvS.m_4828();
      float var11 = this.f_21934 + this.f_21936 - f_22108;
      float var12 = this.f_21933 + f_22109;
      float var13 = this.f_21937 - f_22110;
      this.glass(var12, var11, var13, f_22111, f_22112);
      this.rect(var12 + f_22113 + this.f_21955.m_9288() * var13 / f_22114, var11 + f_22115, var13 / f_22116 - f_22117, f_22118, f_22119, this.f_21900);
      this.nav(var12, var11, var13 / f_22120, f_22121, f_22122, () -> {
         this.f_21949 = true;
         this.focus(this.f_21924);
      });
      this.nav(var12 + var13 / f_22123, var11, var13 / f_22124, f_22125, f_22126, () -> {
         this.f_21949 = false;
         this.f_21924.setValue("");
         this.focus(this.f_21923);
      });
      this.nav(
         var12 + var13 * 2.0F / f_22127,
         var11,
         var13 / f_22128,
         f_22129,
         f_22130,
         () -> this.showProfile(Class_wrEVVKLbnt6Fm3mm.m_9403(this.f_21916.m_9407(), f_22970))
      );
   }

   protected void extractMenuBackground(GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5) {
   }

   private void text(String var1, float var2, float var3, float var4, int var5) {
      StringBuilder var6 = new StringBuilder();
      float var7 = var2;

      for (int var11 : var1.codePoints().toArray()) {
         int var12 = reactionIndex(var11);
         if (var12 < 0 && !fallbackPunctuation(var11)) {
            if (var11 != f_22923) {
               var6.appendCodePoint(var11);
            }
         } else {
            if (!var6.isEmpty()) {
               String var13 = var6.toString();
               this.plainText(var13, var7, var3, var4, var5);
               var7 += width(var13, var4);
               var6.setLength(0);
            }

            if (var12 >= 0) {
               float var15 = var4 + f_22920;
               float var14 = var3 + Class_y1y6QpONhWEUIdEB.m_9589().m_7383().m_2154(f_22921, var4) - var15 / 2.0F;
               this.emoji(var12, var7, var14, var15, var5);
               var7 += var15;
            } else {
               String var16 = Character.toString(var11);
               Class_Ssh31B3ljfKeWsvS.m_4857(
                  Class_y1y6QpONhWEUIdEB.m_9588(), var16, var7 * this.f_21947, var3 * this.f_21947, var4 * this.f_21947, var5, 0.0F, f_22922, 1.0F
               );
               var7 += Class_Ssh31B3ljfKeWsvS.m_4826(Class_y1y6QpONhWEUIdEB.m_9588(), var16, var4, 1.0F);
            }
         }
      }

      if (!var6.isEmpty()) {
         this.plainText(var6.toString(), var7, var3, var4, var5);
      }
   }

   private void profileTile(float var1, float var2, float var3, String var4, String var5, Runnable var6) {
      this.rect(var1, var2, var3, f_22784, f_22785, this.hovered(var1, var2, var3, f_22786) ? this.f_21900 : this.f_21895);
      this.icon(var4, var1 + (var3 - f_22787) / 2.0F, var2 + f_22788, f_22789, this.f_21890);
      this.centered(var5, var1 + var3 / 2.0F, var2 + f_22790, f_22791, this.f_21890);
      this.hit(var1, var2, var3, f_22792, var6, null);
   }

   private boolean hasMessageOverlay() {
      return this.f_21928 != null || this.f_21931 != null || this.f_21957.f_21862 != null || this.f_21958.f_21862 != null;
   }

   protected void extractPanorama(GuiGraphicsExtractor var1, float var2) {
   }

   private static boolean emojiOnly(String var0) {
      int var1 = 0;
      int var2 = 0;

      while (var2 < var0.length()) {
         int var3 = var0.codePointAt(var2);
         var2 += Character.charCount(var3);
         if (var3 != f_22927 && !Character.isWhitespace(var3)) {
            if (reactionIndex(var3) < 0 || ++var1 > 3) {
               return false;
            }
         }
      }

      return var1 > 0;
   }

   private boolean hovered(float var1, float var2, float var3, float var4) {
      return this.f_21938 >= var1 && this.f_21938 <= var1 + var3 && this.f_21939 >= var2 && this.f_21939 <= var2 + var4;
   }

   private void gradient(float var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      Class_Ssh31B3ljfKeWsvS.m_4843(
         var1 * this.f_21947, var2 * this.f_21947, var3 * this.f_21947, var4 * this.f_21947, var5 * this.f_21947, new Vector4i(var7, var6, var7, var6)
      );
   }

   private void messageAuthor(JsonObject var1, float var2, float var3, float var4) {
      String var5 = this.roleLabel(var1);
      float var6 = width(var5, f_21989);
      float var7 = var3 + f_21990;

      int var8 = switch (var5) {
         case f_21991 -> f_21994;
         case f_21992 -> f_21995;
         case f_21993 -> -30065;
         default -> f_21996;
      };
      JsonObject var13 = this.f_21905.get(Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_21997, ""));
      if (var13 != null
         && (
            var13 == var1
               || Class_wrEVVKLbnt6Fm3mm.m_9399(var1, f_21998) > 0L
                  && Class_wrEVVKLbnt6Fm3mm.m_9399(var13, f_21999) == Class_wrEVVKLbnt6Fm3mm.m_9399(var1, f_22000)
         )
         && !Class_wrEVVKLbnt6Fm3mm.m_9418(var1, f_22001)) {
         int var14 = switch (var5) {
            case f_22002 -> -11309;
            case f_22003 -> f_22005;
            case f_22004 -> -8992;
            default -> f_22006;
         };
         Class_Ssh31B3ljfKeWsvS.m_4861(
            Class_y1y6QpONhWEUIdEB.m_9589(), var5, var2 * this.f_21947, var7 * this.f_21947, f_22007 * this.f_21947, var8, var14, this.f_21908
         );
      } else {
         this.text(var5, var2, var7, f_22008, var8);
      }

      String var15 = Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_22009, Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_22010, ""));
      this.text(trim(var15, Math.max(0.0F, var4 - var6 - f_22011), f_22012), var2 + var6 + f_22013, var7, f_22014, this.f_21892);
   }

   public void extractRenderState(GuiGraphicsExtractor var1, int var2, int var3, float var4) {
      if (this.f_21915 != null && !(this.f_21915 instanceof Screen_8)) {
         this.f_21915.extractRenderState(var1, var2, var3, var4);
      }

      Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
      Class_Ssh31B3ljfKeWsvS.m_4830();
      Class_Ssh31B3ljfKeWsvS.m_4844();
      this.f_21953.m_9283(this.f_21952 ? 0.0F : 1.0F);
      if (this.f_21952 && this.f_21953.m_9288() < f_22015) {
         this.minecraft.gui.setScreen(this.f_21915);
      } else {
         this.f_21957.m_7041(this.f_21928);
         this.f_21958.m_7041(this.f_21931);
         this.f_21959.m_7041(this.f_21932);
         this.f_21956.m_9283(this.f_21951 && !this.hasMessageOverlay() && !this.hasProfileOverlay() ? 1.0F : 0.0F);
         this.f_21955.m_9283(this.f_21932 != null ? 2.0F : (this.f_21949 ? 0.0F : 1.0F));
         float var5 = this.f_21953.m_9288();
         this.updateColors();
         this.updateRoles();
         this.f_21908 = (float)((System.nanoTime() - this.f_21907) % f_22016) / f_22017;
         if (this.f_21915 instanceof Screen_8 var6) {
            var6.renderBackdrop(var2, var3, var5);
         }

         float var15 = this.minecraft.getWindow().getScreenWidth();
         float var16 = this.minecraft.getWindow().getScreenHeight();
         float var8 = Math.min((var15 - f_22018) / f_22019, (var16 - f_22020) / f_22021);
         float var9 = this.f_21915 instanceof Screen_8 var10 ? var10.getInterfaceScale() : Math.max(f_22022, Math.min(Class_WhZ6MBDQaQZ0AZFd.m_5487(), var8));
         this.f_21947 = var9 * f_22023 * (f_22024 + f_22025 * var5);
         Vector2f var17 = Class_FvJXUGWpZo3zYBW4.m_2693(var2, var3);
         this.f_21938 = var17.x / this.f_21947;
         this.f_21939 = var17.y / this.f_21947;
         this.f_21935 = f_22026;
         this.f_21936 = f_22027;
         this.f_21937 = f_22028;
         this.f_21933 = (var15 / this.f_21947 - this.f_21935) / 2.0F;
         this.f_21934 = (var16 / this.f_21947 - this.f_21936) / 2.0F + f_22029 * (1.0F - var5);
         this.f_21917.clear();
         Class_Ssh31B3ljfKeWsvS.m_4864(f_22030 * var5);

         try {
            Class_Ssh31B3ljfKeWsvS.m_4859(
               this.f_21933 * this.f_21947, this.f_21934 * this.f_21947, this.f_21935 * this.f_21947, this.f_21936 * this.f_21947, f_22031 * var9, this.f_21899
            );
            this.blur(this.f_21933, this.f_21934, this.f_21935, this.f_21936, f_22032, f_22033);
            this.rect(this.f_21933, this.f_21934, this.f_21935, this.f_21936, f_22034, this.f_21894);
            this.drawSidebar();
            this.drawConversation();
            this.outline(this.f_21933, this.f_21934, this.f_21935, this.f_21936, f_22035, this.f_21897);
            if (this.f_21956.m_9288() > f_22036) {
               int var18 = this.f_21917.size();
               this.drawEmojiPicker();
               if (!this.f_21951) {
                  this.f_21917.subList(var18, this.f_21917.size()).clear();
               }
            }

            if (this.f_21957.f_21862 != null) {
               this.drawContext();
               if (this.f_21928 == null) {
                  this.f_21917.clear();
               }
            }

            if (this.f_21958.f_21862 != null) {
               this.drawForward();
               if (this.f_21931 == null) {
                  this.f_21917.clear();
               }
            }

            if (this.f_21959.f_21862 != null) {
               this.drawProfile();
               if (this.f_21932 == null) {
                  this.f_21917.clear();
               }
            }
         } finally {
            Class_Ssh31B3ljfKeWsvS.m_4844();
            Class_Ssh31B3ljfKeWsvS.m_4830();
            Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
         }
      }
   }

   private EditBox draft(String var1) {
      EditBox var2 = this.field(2000);
      var2.setValue(this.f_21916.f_34594.getOrDefault(var1, ""));
      return var2;
   }

   private void command(String var1, long var2, Runnable var4) {
      JsonObject var5 = new JsonObject();
      var5.addProperty(f_22841, var2);
      this.f_21916.m_9426(var1, var5, var4);
   }

   private Screen_7.iqnmR7ugq4MQ2zKl bubbleLayout(JsonObject var1, float var2) {
      boolean var3 = Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_22318, "").equals(this.f_21916.m_9401());
      float var4 = Math.min(f_22319, var2 - f_22320);
      float var5 = f_22321;
      String var6 = Class_wrEVVKLbnt6Fm3mm.m_9418(var1, f_22322) ? f_22323 : Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_22324, "");
      float var7 = emojiOnly(var6) ? f_22325 : f_22326;
      float var8 = f_22327 + var7 - f_22328;
      List var9 = wrap(var6, var4, var7);
      float var10 = f_22329;

      for (Object var12_obj : var9) {
          String var12 = (String)var12_obj;
         var10 = Math.max(var10, width(var12, var7) + var5);
      }

      float var27 = f_22330;
      float var28 = width(this.roleLabel(var1), f_22331)
         + f_22332
         + width(Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_22333, Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_22334, "")), f_22335);
      var10 = Math.max(var10, (float)Math.ceil(var28 + var5) + 2.0F);
      if (!Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_22336, "").isEmpty()) {
         var27 += f_22337;
         var10 = Math.max(var10, f_22338);
      }

      if (Class_wrEVVKLbnt6Fm3mm.m_9399(var1, f_22339) > 0L) {
         var27 += f_22340;
         var10 = Math.max(var10, f_22341);
      }

      float var13 = width((Class_wrEVVKLbnt6Fm3mm.m_9399(var1, f_22342) > 0L ? f_22343 : "") + time(Class_wrEVVKLbnt6Fm3mm.m_9399(var1, f_22344)), f_22345)
         + (var3 ? 25 : 0);
      float var14 = width((String)var9.getLast(), var7);
      boolean var15 = var14 + var13 + f_22346 <= var4;
      if (var15) {
         var10 = Math.max(var10, var14 + var13 + f_22347 + var5);
      }

      JsonArray var16 = Class_wrEVVKLbnt6Fm3mm.m_9428(var1, f_22348);
      List var17 = var16.isEmpty() ? List.of() : new ArrayList(var16.size());
      float var18 = 0.0F;
      float var19 = 0.0F;
      float var20 = 0.0F;

      for (JsonElement var22 : var16) {
         JsonObject var23 = var22.getAsJsonObject();
         String var24 = Long.toString(Class_wrEVVKLbnt6Fm3mm.m_9399(var23, f_22349));
         float var25 = Math.min(var4, Math.max(f_22350, f_22351 + width(var24, f_22352)));
         if (var18 > 0.0F && var18 + var25 > var4) {
            var18 = 0.0F;
            var19 += f_22353;
         }

         var17.add(
            new Screen_7.EYDX2vsGvoXtqfop(
               Class_wrEVVKLbnt6Fm3mm.m_9410(var23, f_22354, ""), var24, Class_wrEVVKLbnt6Fm3mm.m_9418(var23, f_22355), var18, var19, var25
            )
         );
         var10 = Math.max(var10, var18 + var25 + var5);
         var18 += var25 + f_22356;
         var20 = var19 + f_22357;
      }

      float var29 = f_22358 + var27 + var9.size() * var8 + (var15 ? 0 : 18) + (var17.isEmpty() ? 0.0F : var20 + f_22359);
      return new Screen_7.iqnmR7ugq4MQ2zKl(var9, Math.min(var4 + var5, var10), var29, var7, var8, var15, var17, var20);
   }

   private void nav(float var1, float var2, float var3, String var4, String var5, Runnable var6) {
      boolean var7 = var4.equals(f_22903) ? this.f_21932 != null : this.f_21932 == null && (var4.equals(f_22904) ? this.f_21949 : !this.f_21949);
      int var8 = var7 ? this.f_21892 : (this.hovered(var1, var2, var3, f_22905) ? this.f_21890 : this.f_21891);
      this.icon(var4, var1 + (var3 - f_22906) / 2.0F, var2 + f_22907, f_22908, var8);
      this.centered(var5, var1 + var3 / 2.0F, var2 + f_22909, f_22910, var8);
      this.hit(var1, var2, var3, f_22911, var6, null);
   }

   private static String time(long var0) {
      return var0 <= 0L ? f_22930 : f_21914.format(Instant.ofEpochMilli(var0).atZone(ZoneId.systemDefault()));
   }

   private void showProfile(JsonObject var1) {
      if (var1.has(f_22802)) {
         this.f_21951 = false;
         this.f_21932 = var1;
         this.f_21950 = false;
         this.f_21928 = null;
      }
   }

   private void drawBubble(JsonObject var1, float var2, float var3, float var4, Screen_7.iqnmR7ugq4MQ2zKl var5, float var6, float var7) {
      boolean var8 = Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_22360, "").equals(this.f_21916.m_9401());
      float var9 = var8 ? var2 + var4 - var5.width - f_22361 : var2 + (this.f_21916.m_9436().equals(f_22362) ? 57 : 22);
      float var10 = this.sendProgress(var1);
      float var11 = Class_Ssh31B3ljfKeWsvS.m_4821();
      Class_Ssh31B3ljfKeWsvS.m_4864(var11 * var10);

      try {
         this.bubbleBody(var1, var9 + f_22363 * (1.0F - var10), var3 + f_22364 * (1.0F - var10), var5, false);
      } finally {
         Class_Ssh31B3ljfKeWsvS.m_4864(var11);
      }

      if (!Class_wrEVVKLbnt6Fm3mm.m_9418(var1, f_22365) && !(var10 < f_22366)) {
         float var12 = Math.max(var6, var3);
         float var13 = Math.min(var7, var3 + var5.height);
         this.hit(var9, var12, var5.width, var13 - var12, () -> {
            if (this.f_21948) {
               this.toggle(Class_wrEVVKLbnt6Fm3mm.m_9399(var1, f_22966));
            }
         }, () -> {
            this.f_21928 = var1;
            this.f_21942 = var9 + var5.width;
            this.f_21943 = var3;
         });
         if (this.f_21916.m_9436().equals(f_22367) && !var8) {
            JsonObject var14 = this.author(var1);
            if (var3 >= var6 && var3 + f_22368 <= var7) {
               this.avatar(var14, var2 + f_22369, var3 + var5.height - f_22370, f_22371, false);
               this.hit(var2 + f_22372, var3 + var5.height - f_22373, f_22374, f_22375, () -> this.showProfile(var14), null);
            }

            this.hit(
               var9 + f_22376,
               Math.max(var6, var3),
               var5.width - f_22377,
               Math.max(0.0F, Math.min(var7, var3 + f_22378 + f_22379) - Math.max(var6, var3)),
               () -> this.showAuthor(var1),
               null
            );
         }

         float var21 = var3 + var5.height - var5.reactionHeight - f_22380;

         for (Screen_7.EYDX2vsGvoXtqfop var16 : var5.reactions) {
            float var17 = var9 + f_22381 + var16.x;
            float var18 = var21 + var16.y;
            if (var18 >= var6 && var18 + f_22382 <= var7) {
               this.hit(var17, var18, var16.width, f_22383, () -> this.react(var1, var16.emoji), null);
            }
         }
      }
   }

   public boolean charTyped(CharacterEvent var1) {
      if (this.f_21952 || this.hasMessageOverlay()) {
         return true;
      }

      if (this.hasProfileOverlay()) {
         if (this.f_21932 != null && this.f_21950) {
            this.f_21925.charTyped(var1);
         }

         return true;
      } else {
         return this.f_21924.isFocused() ? this.f_21924.charTyped(var1) : this.f_21923.charTyped(var1);
      }
   }

   private void bubbleBody(JsonObject var1, float var2, float var3, Screen_7.iqnmR7ugq4MQ2zKl var4, boolean var5) {
      boolean var6 = Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_22384, "").equals(this.f_21916.m_9401());
      boolean var7 = Class_wrEVVKLbnt6Fm3mm.m_9418(var1, f_22385);
      int var8 = this.f_21921.contains(Class_wrEVVKLbnt6Fm3mm.m_9399(var1, f_22386)) ? this.f_21900 : (var6 ? this.f_21902 : this.f_21903);
      String var9 = var5 ? f_22387 : this.f_21910.getOrDefault(Class_wrEVVKLbnt6Fm3mm.m_9399(var1, f_22388), f_22389);
      this.bubbleShape(var2, var3, var4.width, var4.height, var6, var9, var8);
      float var10 = var3 + f_22390;
      this.messageAuthor(var1, var2 + f_22391, var10, var4.width - f_22392);
      var10 += f_22393;
      if (!Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_22394, "").isEmpty()) {
         this.text(trim(Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_22395, "") + "", var4.width - f_22396, f_22397), var2 + f_22398, var10, f_22399, this.f_21892);
         var10 += f_22400;
      }

      if (Class_wrEVVKLbnt6Fm3mm.m_9399(var1, f_22401) > 0L) {
         this.rect(var2 + f_22402, var10, var4.width - f_22403, f_22404, f_22405, this.f_21901);
         this.rect(var2 + f_22406, var10, 2.0F, f_22407, 1.0F, this.f_21892);
         this.text(
            trim(Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_22408, ""), var4.width - f_22409, f_22410), var2 + f_22411, var10 + f_22412, f_22413, this.f_21892
         );
         this.text(
            trim(Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_22414, ""), var4.width - f_22415, f_22416), var2 + f_22417, var10 + f_22418, f_22419, this.f_21890
         );
         var10 += f_22420;
      }

      for (String var12 : var4.lines) {
         this.text(var12, var2 + f_22421, var10, var4.font, var7 ? this.f_21891 : this.f_21890);
         var10 += var4.lineHeight;
      }

      float var21 = var10 + (var4.inlineStamp ? -var4.lineHeight + var4.font - f_22422 : 0.0F);
      String var22 = (Class_wrEVVKLbnt6Fm3mm.m_9399(var1, f_22423) > 0L ? f_22424 : "") + time(Class_wrEVVKLbnt6Fm3mm.m_9399(var1, f_22425));
      this.text(var22, var2 + var4.width - f_22426 - width(var22, f_22427) - (var6 ? 25 : 0), var21, f_22428, this.f_21891);
      if (var6) {
         this.icon(
            Class_wrEVVKLbnt6Fm3mm.m_9418(var1, f_22429) ? f_22430 : (Class_wrEVVKLbnt6Fm3mm.m_9418(var1, f_22431) ? f_22432 : f_22433),
            var2 + var4.width - f_22434 - f_22435,
            var21 - f_22436,
            f_22437,
            this.f_21892
         );
      }

      float var13 = var3 + var4.height - var4.reactionHeight - f_22438;

      for (Screen_7.EYDX2vsGvoXtqfop var15 : var4.reactions) {
         float var16 = var2 + f_22439 + var15.x;
         float var17 = var13 + var15.y;
         this.rect(var16, var17, var15.width, f_22440, f_22441, var15.mine ? this.f_21900 : this.f_21895);
         int var18 = var15.emoji.isEmpty() ? -1 : reactionIndex(var15.emoji.codePointAt(0));
         if (var18 >= 0) {
            this.emoji(var18, var16 + f_22442, var17 + f_22443, f_22444, -1);
         } else {
            this.text(var15.emoji, var16 + f_22445, var17 + f_22446, f_22447, this.f_21890);
         }

         float var19 = var17 + f_22448 - Class_y1y6QpONhWEUIdEB.m_9589().m_7383().m_2154(f_22449, f_22450);
         this.text(var15.count, var16 + f_22451 + f_22452 + f_22453, var19, f_22454, this.f_21890);
      }
   }

   private void toggle(long var1) {
      if (!this.f_21921.remove(var1)) {
         this.f_21921.add(var1);
      }
   }

   private void updateColors() {
      this.f_21890 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT);
      this.f_21891 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT);
      this.f_21892 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
      this.f_21893 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN_TWO);
      this.f_21894 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.BACKGROUND);
      this.f_21897 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE);
      this.f_21898 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.LINE);
      this.f_21899 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SHADOW);
      this.f_21900 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SELECTED);
      this.f_21895 = Class_BftdentXEtGbugJw.m_2302(this.f_21894, this.f_21900, f_21971);
      this.f_21896 = Class_BftdentXEtGbugJw.m_2306(this.f_21894, f_21972);
      this.f_21903 = Class_BftdentXEtGbugJw.m_2302(this.f_21894, this.f_21900, f_21973);
      this.f_21902 = Class_BftdentXEtGbugJw.m_2302(this.f_21894, this.f_21892, f_21974);
      this.f_21901 = Class_BftdentXEtGbugJw.m_2306(this.f_21892, (this.f_21892 >>> 24) / f_21975 * f_21976);
   }

   private void centered(String var1, float var2, float var3, float var4, int var5) {
      this.text(var1, var2 - width(var1, var4) / 2.0F, var3, var4, var5);
   }

   private static String presence(JsonObject var0) {
      if (Class_wrEVVKLbnt6Fm3mm.m_9418(var0, f_22487)) {
         return f_22488;
      }

      long var1 = Class_wrEVVKLbnt6Fm3mm.m_9399(var0, f_22489);
      if (var1 <= 0L) {
         return f_22490;
      }

      long var3 = Math.max(0L, (System.currentTimeMillis() - var1) / f_22491);
      return var3 < 1L ? f_22492 : (var3 < f_22493 ? var3 + "" : time(var1) + "");
   }

   private float sendProgress(JsonObject var1) {
      for (Screen_7.uCbhk2YgEhpFVejs var3 : this.f_21962) {
         if (var3.f_21867.equals(this.f_21916.m_9436()) && var3.m_7044(var1)) {
            return var3.f_21869.m_9288();
         }
      }

      return 1.0F;
   }

   public boolean mouseScrolled(double var1, double var3, double var5, double var7) {
      if (this.f_21952) {
         return true;
      }

      if (this.f_21931 != null) {
         this.f_21945 = Math.max(0.0F, this.f_21945 - (float)var7 * f_22931);
         return true;
      }

      if (!this.hasMessageOverlay() && !this.hasProfileOverlay()) {
         Vector2f var9 = Class_FvJXUGWpZo3zYBW4.m_2693(var1, var3);
         if (var9.x / this.f_21947 < this.f_21933 + this.f_21937) {
            this.f_21941 = (float)(this.f_21941 - var7 * f_22932);
         } else {
            this.f_21940 = Math.max(0.0F, this.f_21940 + (float)var7 * f_22933);
         }

         return true;
      } else {
         return true;
      }
   }

   private static float width(String var0, float var1) {
      float var2 = 0.0F;
      StringBuilder var3 = new StringBuilder();

      for (int var7 : var0.codePoints().toArray()) {
         if (reactionIndex(var7) >= 0) {
            var2 += var1 + f_22925;
         } else if (fallbackPunctuation(var7)) {
            var2 += Class_Ssh31B3ljfKeWsvS.m_4826(Class_y1y6QpONhWEUIdEB.m_9588(), Character.toString(var7), var1, 1.0F);
         } else if (var7 != f_22926) {
            var3.appendCodePoint(var7);
         }
      }

      return var2 + Class_Ssh31B3ljfKeWsvS.m_4826(Class_y1y6QpONhWEUIdEB.m_9589(), var3.toString(), var1, 1.0F);
   }

   private void plainText(String var1, float var2, float var3, float var4, int var5) {
      Class_Ssh31B3ljfKeWsvS.m_4857(
         Class_y1y6QpONhWEUIdEB.m_9589(), var1, var2 * this.f_21947, var3 * this.f_21947, var4 * this.f_21947, var5, 0.0F, f_22924, 1.0F
      );
   }

   private void send() {
      if (!this.f_21923.getValue().isBlank()) {
         EditBox var1 = this.f_21923;
         String var2 = this.f_21923.getValue();
         boolean var3 = var2.stripLeading().matches(f_22809);
         if (!var3 || this.f_21916.m_9436().equals(f_22810) && Class_tjZiOwNclsIk6HpU.m_8939()) {
            if (!var3
               && this.f_21916.m_9436().equals(f_22812)
               && Class_wrEVVKLbnt6Fm3mm.m_9418(this.f_21916.m_9407(), f_22813)
               && Class_wrEVVKLbnt6Fm3mm.m_9399(this.f_21916.m_9407(), f_22814) > System.currentTimeMillis()) {
               this.f_21916
                  .m_9419(
                     time(Class_wrEVVKLbnt6Fm3mm.m_9399(this.f_21916.m_9407(), f_22815)) + Class_wrEVVKLbnt6Fm3mm.m_9410(this.f_21916.m_9407(), f_22816, "")
                  );
            } else {
               JsonObject var4 = new JsonObject();
               var4.addProperty(f_22817, var2);
               if (this.f_21930 != null) {
                  var4.addProperty(f_22818, Class_wrEVVKLbnt6Fm3mm.m_9399(this.f_21930, f_22819));
               }

               if (this.f_21929 != null) {
                  var4.addProperty(f_22820, Class_wrEVVKLbnt6Fm3mm.m_9399(this.f_21929, f_22821));
               }

               JsonObject var5 = var4.deepCopy();
               var5.addProperty(f_22822, -1);
               var5.addProperty(f_22823, this.f_21916.m_9401());
               var5.addProperty(f_22824, Class_wrEVVKLbnt6Fm3mm.m_9410(Class_wrEVVKLbnt6Fm3mm.m_9403(this.f_21916.m_9407(), f_22825), f_22826, ""));
               var5.addProperty(f_22827, this.f_21904.getOrDefault(this.f_21916.m_9401(), Class_tjZiOwNclsIk6HpU.m_8934()));
               var5.addProperty(f_22828, System.currentTimeMillis());
               var5.addProperty(f_22829, true);
               if (this.f_21929 != null) {
                  var5.addProperty(f_22830, Class_wrEVVKLbnt6Fm3mm.m_9410(this.f_21929, f_22831, ""));
                  var5.addProperty(f_22832, Class_wrEVVKLbnt6Fm3mm.m_9410(this.f_21929, f_22833, ""));
               }

               Screen_7.uCbhk2YgEhpFVejs var6 = this.f_21930 == null && !var3 ? new Screen_7.uCbhk2YgEhpFVejs(this.f_21916.m_9436(), var5) : null;
               boolean var7 = this.f_21916.m_9426(this.f_21930 != null ? f_22834 : f_22835, var4, () -> {
                  if (var6 != null) {
                     var6.m_7043(Class_wrEVVKLbnt6Fm3mm.m_9399(this.f_21916.m_9407(), f_22941));
                  }

                  if (var1.getValue().equals(var2)) {
                     var1.setValue("");
                  }

                  if (this.f_21923 == var1) {
                     this.f_21929 = this.f_21930 = null;
                     this.f_21940 = 0.0F;
                     this.f_21916.m_9433();
                  }
               });
               if (var7 && var6 != null) {
                  var6.f_21871 = Class_wrEVVKLbnt6Fm3mm.m_9410(var4, f_22836, "");
                  this.f_21962.add(var6);
                  this.f_21940 = 0.0F;
                  this.f_21916.m_9433();
               }
            }
         } else {
            this.f_21916.m_9419(f_22811);
         }
      }
   }

   private void input(EditBox var1, float var2, float var3, float var4, float var5, String var6, String var7) {
      this.glass(var2, var3, var4, var5, var5 / 2.0F);
      float var8 = var7 == null ? f_22843 : f_22844;
      if (var7 != null) {
         this.icon(var7, var2 + f_22845, var3 + (var5 - f_22846) / 2.0F, f_22847, this.f_21891);
      }

      String var9 = var1.getValue();
      int var10 = var1.getCursorPosition();
      int var11 = 0;

      while (var11 < var10 && width(var9.substring(var11, var10), f_22848) > var4 - var8 - f_22849) {
         var11 = var9.offsetByCodePoints(var11, 1);
      }

      String var12 = trim(var9.substring(var11), var4 - var8 - f_22850, f_22851);
      this.scissor(var2 + var8, var3 + f_22852, var4 - var8 - f_22853, var5 - f_22854);
      if (var1.isFocused()) {
         String var13 = var1.getHighlighted();
         if (!var13.isEmpty()) {
            int var14 = var9.indexOf(var13, Math.max(0, var10 - var13.length()));
            if (var14 >= var11) {
               this.rect(var2 + var8 + width(var9.substring(var11, var14), f_22855), var3 + f_22856, width(var13, f_22857), var5 - f_22858, 2.0F, this.f_21900);
            }
         }
      }

      this.text(var9.isEmpty() ? var6 : var12, var2 + var8, var3 + (var5 - f_22859) / 2.0F, f_22860, var9.isEmpty() ? this.f_21891 : this.f_21890);
      if (var1.isFocused() && System.currentTimeMillis() % f_22861 < f_22862) {
         this.rect(var2 + var8 + width(var9.substring(var11, var10), f_22863), var3 + f_22864, f_22865, var5 - f_22866, 0.0F, this.f_21890);
      }

      Class_Ssh31B3ljfKeWsvS.m_4828();
      int var15 = var11;
      this.hit(var2, var3, var4, var5, () -> {
         this.focus(var1);
         int var6x = var15;

         while (var6x < var9.length() && width(var9.substring(var15, var6x), f_22937) < this.f_21938 - var2 - var8) {
            var6x = var9.offsetByCodePoints(var6x, 1);
         }

         var1.moveCursorTo(var6x, false);
      }, null);
   }

   private JsonObject author(JsonObject var1) {
      String var2 = Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_22793, "");
      if (var2.equals(this.f_21916.m_9401())) {
         return Class_wrEVVKLbnt6Fm3mm.m_9403(this.f_21916.m_9407(), f_22794);
      }

      JsonObject var3 = Class_wrEVVKLbnt6Fm3mm.m_9403(this.f_21916.m_9407(), f_22795);
      if (var2.equals(Class_wrEVVKLbnt6Fm3mm.m_9410(var3, f_22796, ""))) {
         return var3;
      }

      for (JsonElement var5 : Class_wrEVVKLbnt6Fm3mm.m_9428(this.f_21916.m_9407(), f_22797)) {
         if (var2.equals(Class_wrEVVKLbnt6Fm3mm.m_9410(var5.getAsJsonObject(), f_22798, ""))) {
            return var5.getAsJsonObject();
         }
      }

      JsonObject var6 = new JsonObject();
      var6.addProperty(f_22799, var2);
      var6.addProperty(f_22800, Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_22801, var2));
      return var6;
   }

   protected void init() {
      if (this.f_21924 == null) {
         this.f_21924 = this.field(64);
         this.f_21925 = this.field(80);
         this.f_21923 = this.f_21918.computeIfAbsent(this.f_21916.m_9436(), this::draft);
         this.f_21926 = this.f_21916.m_9436();
         this.f_21923.setFocused(true);
      }

      for (KeyMapping var4 : new KeyMapping[]{
         this.minecraft.options.keyUp,
         this.minecraft.options.keyDown,
         this.minecraft.options.keyLeft,
         this.minecraft.options.keyRight,
         this.minecraft.options.keyJump,
         this.minecraft.options.keyShift,
         this.minecraft.options.keySprint
      }) {
         var4.setDown(false);
      }

      this.f_21916.m_9408();
   }

   private void copySelection(List<JsonObject> var1) {
      StringJoiner var2 = new StringJoiner(f_22842);
      var1.stream()
         .filter(var1x -> this.f_21921.contains(Class_wrEVVKLbnt6Fm3mm.m_9399(var1x, f_22940)))
         .forEach(var1x -> var2.add(Class_wrEVVKLbnt6Fm3mm.m_9410(var1x, f_22938, "") + Class_wrEVVKLbnt6Fm3mm.m_9410(var1x, f_22939, "")));
      this.minecraft.keyboardHandler.setClipboard(var2.toString());
   }

   private void blur(float var1, float var2, float var3, float var4, float var5, float var6) {
      if (Class_WhZ6MBDQaQZ0AZFd.m_5485() > 0) {
         Class_Ssh31B3ljfKeWsvS.m_4858(
            var1 * this.f_21947, var2 * this.f_21947, var3 * this.f_21947, var4 * this.f_21947, var5 * this.f_21947, var6 * this.f_21947, -1
         );
      }
   }

   private void hit(float var1, float var2, float var3, float var4, Runnable var5, Runnable var6) {
      if (var4 > 0.0F) {
         this.f_21917.add(new Screen_7.UyHw3Vp5U7VilHxq(var1, var2, var3, var4, var5, var6));
      }
   }

   private void plainIconButton(float var1, float var2, float var3, String var4, Runnable var5) {
      if (this.hovered(var1, var2, var3, var3)) {
         this.rect(var1, var2, var3, var3, var3 / 2.0F, this.f_21901);
      }

      this.icon(var4, var1 + var3 * f_22912, var2 + var3 * f_22913, var3 * f_22914, this.f_21890);
      this.hit(var1, var2, var3, var3, var5, null);
   }

   private void focus(EditBox var1) {
      this.f_21924.setFocused(var1 == this.f_21924);
      this.f_21923.setFocused(var1 == this.f_21923);
      this.f_21925.setFocused(var1 == this.f_21925);
   }

   private void icon(String var1, float var2, float var3, float var4, int var5) {
      Class_D5QXX7zTSc2gvuya.m_2446(var1, var2 * this.f_21947, var3 * this.f_21947, var4 * this.f_21947, var5);
   }

   private void texture(float var1, float var2, float var3, float var4, float var5, int var6, Identifier var7) {
      Class_Ssh31B3ljfKeWsvS.m_4806(
         var1 * this.f_21947,
         var2 * this.f_21947,
         var3 * this.f_21947,
         var4 * this.f_21947,
         var5 * this.f_21947,
         new Vector4f(0.0F, 0.0F, 1.0F, 1.0F),
         var6,
         var7
      );
   }

   private void bubbleShape(float var1, float var2, float var3, float var4, boolean var5, String var6, int var7) {
      String var8 = (var5 ? f_22466 : f_22467) + var6;
      Identifier var9 = f_21909.computeIfAbsent(var8, var0 -> Class_wHRRCm2tlLY7DN4I.m_9311(var0 + ""));
      float var10 = var5 ? f_22468 : f_22469;
      float var11 = f_22470 - var10;
      float var12 = var3 + f_22471;
      float var13 = var4 + f_22472;
      float[] var14 = new float[]{0.0F, var10, var10 + 1.0F, f_22473};
      float[] var15 = new float[]{0.0F, f_22474, f_22475, f_22476};
      float[] var16 = new float[]{0.0F, var10, var12 - var11, var12};
      float[] var17 = new float[]{0.0F, f_22477, var13 - f_22478, var13};
      float var18 = var1 - (var5 ? 2 : 8);
      float var19 = var2 - 2.0F;

      for (int var20 = 0; var20 < 3; var20++) {
         for (int var21 = 0; var21 < 3; var21++) {
            Class_Ssh31B3ljfKeWsvS.m_4806(
               (var18 + var16[var21]) * this.f_21947,
               (var19 + var17[var20]) * this.f_21947,
               (var16[var21 + 1] - var16[var21]) * this.f_21947,
               (var17[var20 + 1] - var17[var20]) * this.f_21947,
               0.0F,
               new Vector4f(
                  var14[var21] / f_22479, var15[var20] / f_22480, (var14[var21 + 1] - var14[var21]) / f_22481, (var15[var20 + 1] - var15[var20]) / f_22482
               ),
               var7,
               var9
            );
         }
      }
   }

   private static List<String> wrap(String var0, float var1, float var2) {
      String var3 = "" + var1 + var2 + var0;
      List var4 = f_21922.get(var3);
      if (var4 != null) {
         return var4;
      }

      ArrayList var5 = new ArrayList();

      for (String var9 : var0.split(f_22928, -1)) {
         StringBuilder var10 = new StringBuilder();

         for (int var14 : var9.codePoints().toArray()) {
            String var15 = new String(Character.toChars(var14));

            while (!var10.isEmpty() && width(var10 + var15, var2) > var1) {
               int var16 = var10.lastIndexOf(f_22929);
               if (var16 > 0) {
                  var5.add(var10.substring(0, var16));
                  var10.delete(0, var16 + 1);
               } else {
                  var5.add(var10.toString());
                  var10.setLength(0);
               }
            }

            var10.append(var15);
         }

         var5.add(var10.toString());
      }

      if (f_21922.size() > 512) {
         f_21922.clear();
      }

      f_21922.put(var3, var5);
      return var5;
   }

   public void onClose() {
      if (!this.f_21952) {
         this.f_21952 = true;
         this.f_21953.m_9286(f_22934);
      }
   }

   private void drawConversation() {
      float var1 = this.f_21933 + this.f_21937;
      float var2 = this.f_21935 - this.f_21937;
      JsonObject var3 = this.f_21916.m_9407();
      boolean var4 = this.f_21916.m_9436().equals(f_22151);
      boolean var5 = this.f_21916.m_9436().equals(Class_wrEVVKLbnt6Fm3mm.m_9410(var3, f_22152, ""));
      if (var5 && !this.f_21916.m_9436().equals(this.f_21961)) {
         this.f_21961 = this.f_21916.m_9436();
         this.f_21954.m_9281(0.0F);
      }

      this.f_21954.m_9283(1.0F);
      JsonObject var6 = var5 ? Class_wrEVVKLbnt6Fm3mm.m_9403(var3, f_22153) : new JsonObject();
      String var7 = var4 ? f_22154 : Class_wrEVVKLbnt6Fm3mm.m_9410(var6, f_22155, this.f_21916.m_9436());
      JsonObject var8 = var5 ? Class_wrEVVKLbnt6Fm3mm.m_9403(var3, f_22156) : new JsonObject();
      boolean var9 = this.f_21929 != null || this.f_21930 != null || this.f_21948;
      float var10 = this.f_21934 + (var8.has(f_22157) ? 144 : 88);
      float var11 = this.f_21934 + this.f_21936 - (var9 ? 123 : 86);
      ArrayList var12 = new ArrayList();
      if (var5) {
         for (JsonElement var14 : Class_wrEVVKLbnt6Fm3mm.m_9428(var3, f_22158)) {
            var12.add(var14.getAsJsonObject());
         }
      }

      this.f_21962.forEach(var0 -> var0.f_21869.m_9283(1.0F));
      this.f_21962
         .removeIf(var1x -> var1x.f_21870 < 0L || var1x.m_7042() && !this.f_21916.m_9421(var1x.f_21871) || !var1x.m_7042() && var1x.f_21869.m_9288() >= f_22967);
      if (var5) {
         for (Screen_7.uCbhk2YgEhpFVejs var25 : this.f_21962) {
            if (var25.m_7042() && var25.f_21867.equals(this.f_21916.m_9436())) {
               var12.add(var25.f_21868);
            }
         }
      }

      this.f_21910.clear();
      this.f_21905.clear();

      for (int var23 = 0; var23 < var12.size(); var23++) {
         JsonObject var26 = (JsonObject)var12.get(var23);
         String var15 = Class_wrEVVKLbnt6Fm3mm.m_9410(var26, f_22159, "");
         if (!var15.isEmpty()) {
            this.f_21905.put(var15, var26);
         }

         boolean var16 = var23 > 0 && joined((JsonObject)var12.get(var23 - 1), (JsonObject)var12.get(var23));
         boolean var17 = var23 + 1 < var12.size() && joined((JsonObject)var12.get(var23), (JsonObject)var12.get(var23 + 1));
         this.f_21910
            .put(Class_wrEVVKLbnt6Fm3mm.m_9399((JsonObject)var12.get(var23), f_22160), var16 ? (var17 ? f_22161 : f_22162) : (var17 ? f_22163 : f_22164));
      }

      float var24 = Class_wrEVVKLbnt6Fm3mm.m_9418(var3, f_22165) ? f_22166 : f_22167;

      for (int var27 = 0; var27 < var12.size(); var27++) {
         float var29 = this.sendProgress((JsonObject)var12.get(var27));
         if (dayStart(var12, var27)) {
            var24 += f_22168 * var29;
         }

         var24 += (this.bubbleLayout((JsonObject)var12.get(var27), var2).height + messageGap(var12, var27)) * var29;
      }

      this.f_21944 = var24;
      if (this.f_21946 != this.f_21916.m_9413()) {
         this.f_21946 = this.f_21916.m_9413();
         if (this.f_21940 < f_22169) {
            this.f_21940 = 0.0F;
         }
      }

      this.f_21940 = Math.clamp(this.f_21940, 0.0F, Math.max(0.0F, var24 - (var11 - var10)));
      float var28 = Class_Ssh31B3ljfKeWsvS.m_4821();
      Class_Ssh31B3ljfKeWsvS.m_4864(var28 * this.f_21954.m_9288());
      this.scissor(var1 + f_22170, var10, var2 - f_22171, var11 - var10);
      float var30 = var11 - var24 + this.f_21940 + f_22172 * (1.0F - this.f_21954.m_9288());
      if (var5 && Class_wrEVVKLbnt6Fm3mm.m_9418(var3, f_22173)) {
         this.pill(var1 + var2 / 2.0F - f_22174, Math.max(var10, var30), f_22175, f_22176, f_22177, () -> {
            this.f_21916.m_9409();
            this.f_21940 = 0.0F;
         });
         var30 += f_22178;
      } else {
         var30 += f_22179;
      }

      for (int var32 = 0; var32 < var12.size(); var32++) {
         JsonObject var35 = (JsonObject)var12.get(var32);
         float var18 = this.sendProgress(var35);
         if (dayStart(var12, var32)) {
            String var19 = date(Class_wrEVVKLbnt6Fm3mm.m_9399(var35, f_22180));
            float var20 = width(var19, f_22181) + f_22182;
            float var21 = Class_Ssh31B3ljfKeWsvS.m_4821();
            Class_Ssh31B3ljfKeWsvS.m_4864(var21 * var18);
            this.rect(var1 + (var2 - var20) / 2.0F, var30, var20, f_22183, f_22184, this.f_21895);
            this.centered(var19, var1 + var2 / 2.0F, var30 + f_22185, f_22186, this.f_21891);
            var30 += f_22187 * var18;
            Class_Ssh31B3ljfKeWsvS.m_4864(var21);
         }

         Screen_7.iqnmR7ugq4MQ2zKl var41 = this.bubbleLayout(var35, var2);
         if (var30 + var41.height > var10 && var30 < var11) {
            this.drawBubble(var35, var1, var30, var2, var41, var10, var11);
         }

         var30 += (var41.height + messageGap(var12, var32)) * var18;
      }

      if (var12.isEmpty()) {
         String var33 = !var5 ? f_22188 : f_22189;
         float var36 = width(var33, f_22190) + f_22191;
         this.rect(var1 + (var2 - var36) / 2.0F, this.f_21934 + this.f_21936 / 2.0F - f_22192, var36, f_22193, f_22194, this.f_21895);
         this.centered(var33, var1 + var2 / 2.0F, this.f_21934 + this.f_21936 / 2.0F - f_22195, f_22196, this.f_21890);
      }

      Class_Ssh31B3ljfKeWsvS.m_4828();
      Class_Ssh31B3ljfKeWsvS.m_4864(var28);
      this.gradient(var1 + 2.0F, this.f_21934 + 1.0F, var2 - f_22197, f_22198, 0.0F, this.f_21894, Class_BftdentXEtGbugJw.m_2306(this.f_21894, 0.0F));
      float var34 = Math.max(f_22199, Math.min(f_22200, width(var7, f_22201) + f_22202));
      float var37 = var1 + (var2 - var34) / 2.0F;
      this.glass(var37, this.f_21934 + f_22203, var34, f_22204, f_22205);
      this.centered(trim(var7, var34 - f_22206, f_22207), var1 + var2 / 2.0F, this.f_21934 + f_22208, f_22209, this.f_21890);
      this.centered(var4 ? f_22210 : presence(var6), var1 + var2 / 2.0F, this.f_21934 + f_22211, f_22212, this.f_21891);
      if (!var4) {
         this.hit(var37, this.f_21934 + f_22213, var34, f_22214, () -> this.showProfile(var6), null);
      }

      this.glass(var1 + var2 - f_22215, this.f_21934 + f_22216, f_22217, f_22218, f_22219);
      this.avatar(var6, var1 + var2 - f_22220, this.f_21934 + f_22221, f_22222, var4);
      this.hit(var1 + var2 - f_22223, this.f_21934 + f_22224, f_22225, f_22226, () -> {
         if (!var4) {
            this.showProfile(var6);
         }
      }, null);
      if (var8.has(f_22227)) {
         this.glass(var1 + f_22228, this.f_21934 + f_22229, var2 - f_22230, f_22231, f_22232);

         for (int var38 = 0; var38 < 3; var38++) {
            this.rect(var1 + f_22233, this.f_21934 + f_22234 + var38 * 11, 2.0F, f_22235, 1.0F, this.f_21892);
         }

         this.text(f_22236, var1 + f_22237, this.f_21934 + f_22238, f_22239, this.f_21890);
         this.text(
            trim(Class_wrEVVKLbnt6Fm3mm.m_9410(var8, f_22240, ""), var2 - f_22241, f_22242), var1 + f_22243, this.f_21934 + f_22244, f_22245, this.f_21891
         );
         this.icon(f_22246, var1 + var2 - f_22247, this.f_21934 + f_22248, f_22249, this.f_21890);
         this.hit(var1 + f_22250, this.f_21934 + f_22251, var2 - f_22252, f_22253, () -> {
            this.f_21928 = var8;
            this.f_21942 = this.f_21938;
            this.f_21943 = this.f_21939;
         }, null);
      }

      if (this.f_21916.m_9402()) {
         this.pill(var1 + var2 - f_22254, var11 - f_22255, f_22256, f_22257, f_22258, () -> {
            this.f_21916.m_9433();
            this.f_21940 = 0.0F;
         });
      } else if (this.f_21940 > f_22259) {
         this.iconButton(var1 + var2 - f_22260, var11 - f_22261, f_22262, f_22263, () -> this.f_21940 = 0.0F);
      }

      if (var5 && !var12.isEmpty() && this.f_21940 < f_22264 && !this.f_21952 && !this.hasMessageOverlay() && !this.hasProfileOverlay()) {
         this.f_21916.m_9435(Class_wrEVVKLbnt6Fm3mm.m_9399((JsonObject)var12.getLast(), f_22265));
      }

      this.gradient(
         var1 + 1.0F, this.f_21934 + this.f_21936 - f_22266, var2 - 2.0F, f_22267, 0.0F, Class_BftdentXEtGbugJw.m_2306(this.f_21894, 0.0F), this.f_21894
      );
      if (var9) {
         this.glass(var1 + f_22268, this.f_21934 + this.f_21936 - f_22269, var2 - f_22270, f_22271, f_22272);
         this.icon(
            this.f_21930 != null ? f_22273 : (this.f_21948 ? f_22274 : f_22275), var1 + f_22276, this.f_21934 + this.f_21936 - f_22277, f_22278, this.f_21892
         );
         String var39 = this.f_21948
            ? this.f_21921.size() + ""
            : (this.f_21930 != null ? f_22279 : f_22280) + Class_wrEVVKLbnt6Fm3mm.m_9410(this.f_21930 != null ? this.f_21930 : this.f_21929, f_22281, "");
         this.text(trim(var39, var2 - f_22282, f_22283), var1 + f_22284, this.f_21934 + this.f_21936 - f_22285, f_22286, this.f_21890);
         this.hit(var1 + f_22287, this.f_21934 + this.f_21936 - f_22288, var2 - f_22289, f_22290, () -> {
            if (this.f_21948) {
               this.copySelection(var12);
            }
         }, null);
         this.plainIconButton(var1 + var2 - f_22291, this.f_21934 + this.f_21936 - f_22292, f_22293, f_22294, () -> {
            this.f_21929 = this.f_21930 = null;
            this.f_21948 = false;
            this.f_21921.clear();
         });
      }

      this.iconButton(var1 + f_22295, this.f_21934 + this.f_21936 - f_22296, f_22297, f_22298, () -> this.f_21951 = !this.f_21951);
      this.input(this.f_21923, var1 + f_22299, this.f_21934 + this.f_21936 - f_22300, var2 - f_22301, f_22302, f_22303, null);
      this.iconButton(var1 + var2 - f_22304, this.f_21934 + this.f_21936 - f_22305, f_22306, this.f_21916.m_9431() ? f_22307 : f_22308, this::send);
      boolean var40 = var5 && var4 && Class_wrEVVKLbnt6Fm3mm.m_9418(var3, f_22309) && Class_wrEVVKLbnt6Fm3mm.m_9399(var3, f_22310) > System.currentTimeMillis();
      if (!this.f_21916.m_9400().isEmpty() || !this.f_21916.m_9404() || var40 || !this.f_21916.m_9430().isEmpty()) {
         String var42 = !this.f_21916.m_9400().isEmpty()
            ? this.f_21916.m_9400()
            : (
               !this.f_21916.m_9404()
                  ? f_22311
                  : (
                     !this.f_21916.m_9430().isEmpty()
                        ? this.f_21916.m_9430()
                        : time(Class_wrEVVKLbnt6Fm3mm.m_9399(var3, f_22312)) + Class_wrEVVKLbnt6Fm3mm.m_9410(var3, f_22313, "")
                  )
            );
         this.centered(
            trim(var42, var2 - f_22314, f_22315),
            var1 + var2 / 2.0F,
            this.f_21934 + this.f_21936 - f_22316,
            f_22317,
            this.f_21916.m_9400().isEmpty() ? this.f_21891 : -27500
         );
      }
   }

   private static String trim(String var0, float var1, float var2) {
      if (var1 <= 0.0F) {
         return "";
      }

      if (width(var0, var2) <= var1) {
         return var0;
      }

      int var3 = var0.length();

      while (var3 > 0 && width(var0.substring(0, var3) + "", var2) > var1) {
         var3 = var0.offsetByCodePoints(var3, -1);
      }

      return var0.substring(0, var3) + "";
   }

   private static boolean fallbackPunctuation(int var0) {
      return var0 == 8230 || var0 == 183;
   }

   private void rect(float var1, float var2, float var3, float var4, float var5, int var6) {
      Class_Ssh31B3ljfKeWsvS.m_4817(var1 * this.f_21947, var2 * this.f_21947, var3 * this.f_21947, var4 * this.f_21947, var5 * this.f_21947, var6);
   }

   private void rememberRole(JsonObject var1) {
      String var2 = Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_21982, "");
      String var3 = Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_21983, "");
      if (!var2.isEmpty() && !var3.isBlank()) {
         this.f_21904.put(var2, var3);
      }
   }

   private void avatar(JsonObject var1, float var2, float var3, float var4, boolean var5) {
      if (var5) {
         this.gradient(var2, var3, var4, var4, var4 / 2.0F, this.f_21892, this.f_21893);
         this.icon(f_22867, var2 + var4 * f_22868, var3 + var4 * f_22869, var4 * f_22870, this.f_21890);
      } else {
         String var6 = Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_22871, "");
         Identifier var7 = this.f_21919.get(var6);
         if (var7 == null && !var6.isEmpty()) {
            try {
               UUID var8 = UUID.fromString(var6);
               var7 = DefaultPlayerSkin.get(var8).body().texturePath();
               if (this.f_21920.add(var6)) {
                  CompletableFuture.<GameProfile>supplyAsync(
                        () -> this.minecraft
                           .services()
                           .profileResolver()
                           .fetchById(var8)
                           .orElse(new GameProfile(var8, Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_22935, f_22936)))
                     )
                     .thenCompose(var1x -> this.minecraft.getSkinManager().get(var1x))
                     .thenAccept(var2x -> this.minecraft.execute(() -> var2x.ifPresent(var2xxx -> this.f_21919.put(var6, var2xxx.body().texturePath()))))
                     .exceptionally(var0 -> null);
               }
            } catch (RuntimeException var9) {
            }
         }

         this.gradient(var2, var3, var4, var4, var4 / 2.0F, this.f_21892, this.f_21893);
         if (var7 != null) {
            Class_Ssh31B3ljfKeWsvS.m_4850(
               var2 * this.f_21947,
               var3 * this.f_21947,
               var4 * this.f_21947,
               var4 * this.f_21947,
               new Vector4f(var4 * this.f_21947 / 2.0F),
               new Vector4f(f_22872),
               new Vector4i(-1),
               var7,
               FilterMode.NEAREST
            );
            Class_Ssh31B3ljfKeWsvS.m_4850(
               var2 * this.f_21947,
               var3 * this.f_21947,
               var4 * this.f_21947,
               var4 * this.f_21947,
               new Vector4f(var4 * this.f_21947 / 2.0F),
               new Vector4f(f_22873, f_22874, f_22875, f_22876),
               new Vector4i(-1),
               var7,
               FilterMode.NEAREST
            );
         } else {
            String var10 = Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_22877, f_22878);
            if (var10.isBlank()) {
               var10 = f_22879;
            }

            this.text(
               var10.substring(0, var10.offsetByCodePoints(0, 1)).toUpperCase(Locale.ROOT),
               var2 + var4 * f_22880,
               var3 + var4 * f_22881,
               var4 * f_22882,
               this.f_21890
            );
         }

         if (Class_wrEVVKLbnt6Fm3mm.m_9418(var1, f_22883)) {
            this.rect(var2 + var4 - f_22884, var3 + var4 - f_22885, f_22886, f_22887, f_22888, this.f_21894);
            this.rect(var2 + var4 - f_22889, var3 + var4 - f_22890, f_22891, f_22892, f_22893, f_22894);
         }
      }
   }

   private static int reactionIndex(int var0) {
      for (int var1 = 0; var1 < f_21911.length; var1++) {
         if (f_21911[var1].codePointAt(0) == var0) {
            return var1;
         }
      }

      return -1;
   }

   private void updateRoles() {
      if (this.f_21906 != this.f_21916.m_9413()) {
         this.f_21906 = this.f_21916.m_9413();
         this.f_21904.clear();
         JsonObject var1 = this.f_21916.m_9407();

         for (JsonElement var3 : Class_wrEVVKLbnt6Fm3mm.m_9428(var1, f_21977)) {
            this.rememberRole(Class_wrEVVKLbnt6Fm3mm.m_9403(var3.getAsJsonObject(), f_21978));
         }

         for (JsonElement var5 : Class_wrEVVKLbnt6Fm3mm.m_9428(var1, f_21979)) {
            this.rememberRole(var5.getAsJsonObject());
         }

         this.rememberRole(Class_wrEVVKLbnt6Fm3mm.m_9403(var1, f_21980));
         this.rememberRole(Class_wrEVVKLbnt6Fm3mm.m_9403(var1, f_21981));
         if (!this.f_21916.m_9401().isEmpty()) {
            this.f_21904.putIfAbsent(this.f_21916.m_9401(), Class_tjZiOwNclsIk6HpU.m_8934());
         }
      }
   }

   private static String date(long var0) {
      LocalDate var2 = Instant.ofEpochMilli(var0).atZone(ZoneId.systemDefault()).toLocalDate();
      if (var2.equals(LocalDate.now())) {
         return f_22483;
      } else {
         return var2.equals(LocalDate.now().minusDays(1L)) ? f_22484 : DateTimeFormatter.ofPattern(f_22485, Locale.forLanguageTag(f_22486)).format(var2);
      }
   }

   private void iconButton(float var1, float var2, float var3, String var4, Runnable var5) {
      this.glass(var1, var2, var3, var3, var3 / 2.0F);
      this.plainIconButton(var1, var2, var3, var4, var5);
   }

   private void pill(float var1, float var2, float var3, float var4, String var5, Runnable var6) {
      this.glass(var1, var2, var3, var4, var4 / 2.0F);
      if (this.hovered(var1, var2, var3, var4)) {
         this.rect(var1, var2, var3, var4, var4 / 2.0F, this.f_21901);
      }

      String var7 = trim(var5, var3 - f_22895, var4 > f_22896 ? f_22897 : f_22898);
      this.centered(var7, var1 + var3 / 2.0F, var2 + (var4 - (var4 > f_22899 ? 15 : 12)) / 2.0F, var4 > f_22900 ? f_22901 : f_22902, this.f_21890);
      this.hit(var1, var2, var3, var4, var6, null);
   }

   private void outline(float var1, float var2, float var3, float var4, float var5, int var6) {
      Class_Ssh31B3ljfKeWsvS.m_4854(
         var1 * this.f_21947, var2 * this.f_21947, var3 * this.f_21947, var4 * this.f_21947, f_22915 * this.f_21947, var5 * this.f_21947, var6
      );
   }

   private List<JsonObject> rows() {
      ArrayList var1 = new ArrayList();
      HashSet var2 = new HashSet();

      for (JsonElement var4 : Class_wrEVVKLbnt6Fm3mm.m_9428(this.f_21916.m_9407(), f_22131)) {
         JsonObject var5 = var4.getAsJsonObject();
         if (!this.f_21949 && Class_wrEVVKLbnt6Fm3mm.m_9410(var5, f_22132, "").toLowerCase(Locale.ROOT).contains(this.f_21927.toLowerCase(Locale.ROOT))) {
            var1.add(var5);
            var2.add(Class_wrEVVKLbnt6Fm3mm.m_9410(var5, f_22133, ""));
         }
      }

      if (!var2.contains(f_22134) && this.f_21927.isEmpty() && !this.f_21949) {
         JsonObject var8 = new JsonObject();
         var8.addProperty(f_22135, f_22136);
         var8.addProperty(f_22137, f_22138);
         var8.addProperty(f_22139, f_22140);
         var1.addFirst(var8);
      }

      if (this.f_21949 || !this.f_21927.isBlank()) {
         for (JsonElement var10 : Class_wrEVVKLbnt6Fm3mm.m_9428(this.f_21916.m_9407(), f_22141)) {
            JsonObject var11 = var10.getAsJsonObject();
            String var6 = Class_wrEVVKLbnt6Fm3mm.m_9410(var11, f_22142, "");
            if (var2.add(var6)) {
               JsonObject var7 = new JsonObject();
               var7.addProperty(f_22143, var6);
               var7.addProperty(f_22144, Class_wrEVVKLbnt6Fm3mm.m_9410(var11, f_22145, var6));
               var7.addProperty(f_22146, Class_wrEVVKLbnt6Fm3mm.m_9418(var11, f_22147) ? f_22148 : time(Class_wrEVVKLbnt6Fm3mm.m_9399(var11, f_22149)) + "");
               var7.add(f_22150, var11);
               var1.add(var7);
            }
         }
      }

      var1.sort(Comparator.comparingInt(var0 -> Class_wrEVVKLbnt6Fm3mm.m_9410((JsonObject)var0, f_22968, "").equals(f_22969) ? 0 : 1));
      return var1;
   }

   private void drawEmojiPicker() {
      float var1 = Class_Ssh31B3ljfKeWsvS.m_4821();
      float var2 = this.f_21956.m_9288();
      Class_Ssh31B3ljfKeWsvS.m_4864(var1 * var2);
      float var3 = this.f_21933 + this.f_21935 - f_22608;
      float var4 = this.f_21934 + this.f_21936 - f_22609 + f_22610 * (1.0F - var2);
      this.glass(var3, var4, f_22611, f_22612, f_22613);

      for (int var5 = 0; var5 < f_21911.length; var5++) {
         String var6 = f_21911[var5];
         float var7 = var3 + f_22614 + var5 * 45;
         this.emoji(var5, var7 + f_22615, var4 + f_22616, f_22617, -1);
         this.hit(var7, var4 + f_22618, f_22619, f_22620, () -> {
            this.f_21923.insertText(var6);
            this.f_21951 = false;
            this.focus(this.f_21923);
         }, null);
      }

      Class_Ssh31B3ljfKeWsvS.m_4864(var1);
   }

   private EditBox field(int var1) {
      EditBox var2 = new EditBox(this.minecraft.font, Component.empty());
      var2.setMaxLength(var1);
      var2.setBordered(false);
      return var2;
   }

   public boolean isPauseScreen() {
      return false;
   }

   private static boolean dayStart(List<JsonObject> var0, int var1) {
      return var1 == 0
         || !date(Class_wrEVVKLbnt6Fm3mm.m_9399((JsonObject)var0.get(var1 - 1), f_22455))
            .equals(date(Class_wrEVVKLbnt6Fm3mm.m_9399((JsonObject)var0.get(var1), f_22456)));
   }

   private static boolean joined(JsonObject var0, JsonObject var1) {
      return Class_wrEVVKLbnt6Fm3mm.m_9410(var0, f_22459, "").equals(Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_22460, ""))
         && Math.abs(Class_wrEVVKLbnt6Fm3mm.m_9399(var0, f_22461) - Class_wrEVVKLbnt6Fm3mm.m_9399(var1, f_22462)) < f_22463
         && date(Class_wrEVVKLbnt6Fm3mm.m_9399(var0, f_22464)).equals(date(Class_wrEVVKLbnt6Fm3mm.m_9399(var1, f_22465)));
   }

   private String roleLabel(JsonObject var1) {
      String var2 = Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_21984, "");
      if (var2.isBlank()) {
         var2 = this.f_21904.getOrDefault(Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_21985, ""), f_21986);
      }

      String var3 = Class_tjZiOwNclsIk6HpU.m_8945(var2);
      return var3.equals(f_21987) ? f_21988 : var3;
   }

   private void drawProfile() {
      float var1 = Class_Ssh31B3ljfKeWsvS.m_4821();
      float var2 = this.f_21959.f_21861.m_9288();
      Class_Ssh31B3ljfKeWsvS.m_4864(var1 * var2);
      JsonObject var3 = this.f_21959.f_21862;
      this.f_21917.clear();
      this.blur(this.f_21933, this.f_21934, this.f_21935, this.f_21936, f_22660, f_22661);
      this.rect(this.f_21933, this.f_21934, this.f_21935, this.f_21936, f_22662, f_22663);
      this.hit(this.f_21933, this.f_21934, this.f_21935, this.f_21936, this::closeProfile, null);
      float var4 = f_22664;
      float var5 = f_22665;
      float var6 = this.f_21933 + this.f_21937 + (this.f_21935 - this.f_21937 - var4) / f_22666;
      float var7 = this.f_21934 + (this.f_21936 - var5) / 2.0F + f_22667 * (1.0F - var2);
      this.rect(var6, var7, var4, var5, f_22668, this.f_21894);
      this.hit(var6, var7, var4, var5, () -> {}, null);
      int var8 = Class_BftdentXEtGbugJw.m_2302(this.f_21894, this.f_21892, f_22669);
      int var9 = Class_BftdentXEtGbugJw.m_2302(this.f_21894, this.f_21893, f_22670);
      this.gradient(var6, var7, var4, f_22671, f_22672, var8, var9);
      this.rect(var6, var7 + f_22673, var4, f_22674, 0.0F, var9);
      this.iconButton(var6 + f_22675, var7 + f_22676, f_22677, f_22678, this::closeProfile);
      boolean var10 = Class_wrEVVKLbnt6Fm3mm.m_9410(var3, f_22679, "").equals(this.f_21916.m_9401());
      this.pill(var6 + var4 - f_22680, var7 + f_22681, f_22682, f_22683, var10 ? f_22684 : f_22685, () -> {
         if (var10) {
            this.f_21950 = true;
            this.f_21925.setValue(Class_wrEVVKLbnt6Fm3mm.m_9410(var3, f_22951, ""));
            this.focus(this.f_21925);
         } else {
            this.choose(Class_wrEVVKLbnt6Fm3mm.m_9410(var3, f_22952, ""));
            this.f_21932 = null;
         }
      });
      this.avatar(var3, var6 + var4 / 2.0F - f_22686, var7 + f_22687, f_22688, false);
      String var11 = trim(Class_wrEVVKLbnt6Fm3mm.m_9410(var3, f_22689, f_22690), var4 - f_22691, f_22692);
      this.centered(var11, var6 + var4 / 2.0F, var7 + f_22693, f_22694, this.f_21890);
      this.centered(presence(var3), var6 + var4 / 2.0F, var7 + f_22695, f_22696, this.f_21891);
      float var12 = (var4 - f_22697) / f_22698;
      this.profileTile(var6 + f_22699, var7 + f_22700, var12, f_22701, var10 ? f_22702 : f_22703, () -> {
         if (!var10) {
            this.choose(Class_wrEVVKLbnt6Fm3mm.m_9410(var3, f_22950, ""));
         }

         this.f_21932 = null;
      });
      this.profileTile(
         var6 + f_22704 + var12,
         var7 + f_22705,
         var12,
         f_22706,
         f_22707,
         () -> this.minecraft.keyboardHandler.setClipboard(Class_wrEVVKLbnt6Fm3mm.m_9410(var3, f_22949, ""))
      );
      this.profileTile(var6 + f_22708 + var12 * 2.0F, var7 + f_22709, var12, var10 ? f_22710 : f_22711, var10 ? f_22712 : f_22713, () -> {
         if (var10) {
            this.f_21950 = true;
            this.f_21925.setValue(Class_wrEVVKLbnt6Fm3mm.m_9410(var3, f_22947, ""));
            this.focus(this.f_21925);
         } else {
            this.f_21924.setValue(Class_wrEVVKLbnt6Fm3mm.m_9410(var3, f_22948, ""));
            this.f_21949 = true;
            this.focus(this.f_21924);
            this.f_21932 = null;
         }
      });
      float var13 = var7 + f_22714;
      this.rect(var6 + f_22715, var13, var4 - f_22716, f_22717, f_22718, this.f_21895);
      this.text(f_22719, var6 + f_22720, var13 + f_22721, f_22722, this.f_21890);
      this.text(Class_wrEVVKLbnt6Fm3mm.m_9410(var3, f_22723, "") + "", var6 + f_22724, var13 + f_22725, f_22726, this.f_21891);
      this.plainIconButton(
         var6 + var4 - f_22727,
         var13 + f_22728,
         f_22729,
         f_22730,
         () -> this.minecraft.keyboardHandler.setClipboard(Class_wrEVVKLbnt6Fm3mm.m_9410(var3, f_22946, ""))
      );
      this.rect(var6 + f_22731, var13 + f_22732, var4 - f_22733, f_22734, 0.0F, this.f_21898);
      this.text(f_22735, var6 + f_22736, var13 + f_22737, f_22738, this.f_21890);
      if (var10 && this.f_21950) {
         this.input(this.f_21925, var6 + f_22739, var13 + f_22740, var4 - f_22741, f_22742, f_22743, null);
      } else {
         this.text(
            trim(
               Class_wrEVVKLbnt6Fm3mm.m_9410(var3, f_22744, "").isBlank() ? f_22745 : Class_wrEVVKLbnt6Fm3mm.m_9410(var3, f_22746, ""), var4 - f_22747, f_22748
            ),
            var6 + f_22749,
            var13 + f_22750,
            f_22751,
            this.f_21891
         );
      }

      if (var10 && this.f_21950) {
         this.pill(var6 + f_22752, var7 + f_22753, var4 - f_22754, f_22755, f_22756, () -> {
            JsonObject var1x = new JsonObject();
            var1x.addProperty(f_22943, this.f_21925.getValue());
            this.f_21916.m_9426(f_22944, var1x, () -> {
               this.f_21932 = Class_wrEVVKLbnt6Fm3mm.m_9403(this.f_21916.m_9407(), f_22945);
               this.f_21950 = false;
            });
         });
      } else {
         this.glass(var6 + f_22757, var7 + f_22758, var4 - f_22759, f_22760, f_22761);
         this.rect(var6 + f_22762, var7 + f_22763, (var4 - f_22764) / 2.0F, f_22765, f_22766, this.f_21900);
         this.centered(f_22767, var6 + f_22768 + (var4 - f_22769) / f_22770, var7 + f_22771, f_22772, this.f_21890);
         this.centered(f_22773, var6 + f_22774 + (var4 - f_22775) * f_22776 / f_22777, var7 + f_22778, f_22779, this.f_21890);
         this.hit(var6 + var4 / 2.0F, var7 + f_22780, var4 / 2.0F - f_22781, f_22782, () -> {
            if (!var10) {
               this.choose(Class_wrEVVKLbnt6Fm3mm.m_9410(var3, f_22942, ""));
            }

            this.f_21932 = null;
         }, null);
      }

      this.outline(var6, var7, var4, var5, f_22783, this.f_21897);
      Class_Ssh31B3ljfKeWsvS.m_4864(var1);
   }

   private static float messageGap(List<JsonObject> var0, int var1) {
      return var1 + 1 < var0.size() && joined((JsonObject)var0.get(var1), (JsonObject)var0.get(var1 + 1)) ? f_22457 : f_22458;
   }

   private void react(JsonObject var1, String var2) {
      JsonObject var3 = new JsonObject();
      var3.addProperty(f_22837, Class_wrEVVKLbnt6Fm3mm.m_9399(var1, f_22838));
      var3.addProperty(f_22839, var2);
      this.f_21916.m_9426(f_22840, var3, null);
   }

   private void emoji(int var1, float var2, float var3, float var4, int var5) {
      Vector4f var6 = f_21913[var1];
      float var7 = var4 / Math.max(var6.z, var6.w);
      float var8 = var6.z * var7;
      float var9 = var6.w * var7;
      Class_Ssh31B3ljfKeWsvS.m_4829(
         (var2 + (var4 - var8) / 2.0F) * this.f_21947,
         (var3 + (var4 - var9) / 2.0F) * this.f_21947,
         var8 * this.f_21947,
         var9 * this.f_21947,
         0.0F,
         var6,
         var5 & f_22918 | f_22919,
         f_21912[var1],
         FilterMode.LINEAR
      );
   }

   private void showAuthor(JsonObject var1) {
      String var2 = Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_22803, "");
      if (var2.equals(this.f_21916.m_9401())) {
         this.showProfile(Class_wrEVVKLbnt6Fm3mm.m_9403(this.f_21916.m_9407(), f_22804));
      } else {
         JsonObject var3 = Class_wrEVVKLbnt6Fm3mm.m_9403(this.f_21916.m_9407(), f_22805);
         if (var2.equals(Class_wrEVVKLbnt6Fm3mm.m_9410(var3, f_22806, ""))) {
            this.showProfile(var3);
         } else {
            for (JsonElement var5 : Class_wrEVVKLbnt6Fm3mm.m_9428(this.f_21916.m_9407(), f_22807)) {
               if (var2.equals(Class_wrEVVKLbnt6Fm3mm.m_9410(var5.getAsJsonObject(), f_22808, ""))) {
                  this.showProfile(var5.getAsJsonObject());
                  return;
               }
            }
         }
      }
   }

   public boolean keyPressed(KeyEvent var1) {
      if (this.f_21952) {
         return true;
      }

      if (var1.key() != 256) {
         if (this.hasMessageOverlay()) {
            return true;
         }

         if (this.hasProfileOverlay()) {
            if (this.f_21932 != null && this.f_21950) {
               this.f_21925.keyPressed(var1);
            }

            return true;
         } else {
            if (var1.key() != 257 && var1.key() != 335) {
               return this.f_21924.isFocused() ? this.f_21924.keyPressed(var1) : this.f_21923.keyPressed(var1);
            }

            if (this.f_21923.isFocused()) {
               this.send();
            }

            return true;
         }
      } else {
         if (this.f_21932 != null) {
            this.closeProfile();
         } else if (this.f_21931 != null) {
            this.f_21931 = null;
         } else if (this.f_21928 != null) {
            this.f_21928 = null;
         } else {
            if (this.hasMessageOverlay() || this.hasProfileOverlay()) {
               return true;
            }

            if (this.f_21951) {
               this.f_21951 = false;
            } else if (this.f_21948) {
               this.f_21948 = false;
               this.f_21921.clear();
            } else {
               this.onClose();
            }
         }

         return true;
      }
   }

   private record EYDX2vsGvoXtqfop(String emoji, String count, boolean mine, float x, float y, float width) {
   }

   private record UyHw3Vp5U7VilHxq(float x, float y, float w, float h, Runnable left, Runnable right) {
      public float m_7039() {
         return this.h;
      }

      public float m_7040() {
         return this.w;
      }
   }

   private record iqnmR7ugq4MQ2zKl(
      List<String> lines,
      float width,
      float height,
      float font,
      float lineHeight,
      boolean inlineStamp,
      List<Screen_7.EYDX2vsGvoXtqfop> reactions,
      float reactionHeight
   ) {
   }

   private static final class swwpeAJU95vIH9KE {
      public final Class_w8fCJQ5ZtH5lQbWc f_21861;
      public JsonObject f_21862;
      public static final float f_21863 = 12.0F;
      public static final String f_21864 = "id";
      public static final String f_21865 = "id";
      public static final float f_21866 = 0.001F;

      public swwpeAJU95vIH9KE() {
         this.f_21861 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_21863, Class_eXr9Fra2ad3yFXY8.f_19100);
      }

      public void m_7041(JsonObject var1) {
         if (var1 != null) {
            if (this.f_21862 != null && !Class_wrEVVKLbnt6Fm3mm.m_9410(this.f_21862, f_21864, "").equals(Class_wrEVVKLbnt6Fm3mm.m_9410(var1, f_21865, ""))) {
               this.f_21861.m_9281(0.0F);
            }

            this.f_21862 = var1;
         }

         this.f_21861.m_9283(var1 == null ? 0.0F : 1.0F);
         if (var1 == null && this.f_21861.m_9288() < f_21866) {
            this.f_21862 = null;
         }
      }
   }

   private static final class uCbhk2YgEhpFVejs {
      public final String f_21867;
      public final JsonObject f_21868;
      public final Class_w8fCJQ5ZtH5lQbWc f_21869;
      public long f_21870;
      public String f_21871;
      public static final float f_21872 = 7.0F;
      public static final long f_21873 = -1L;
      public static final String f_21874 = "id";
      public static final long f_21875 = -1L;

      public boolean m_7042() {
         return this.f_21870 == 0L;
      }

      public uCbhk2YgEhpFVejs(String var1, JsonObject var2) {
         this.f_21869 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_21872, Class_eXr9Fra2ad3yFXY8.f_19100);
         this.f_21871 = "";
         this.f_21867 = var1;
         this.f_21868 = var2;
      }

      public void m_7043(long var1) {
         this.f_21870 = var1 > 0L ? var1 : f_21873;
      }

      public boolean m_7044(JsonObject var1) {
         return Class_wrEVVKLbnt6Fm3mm.m_9399(var1, f_21874) == (this.m_7042() ? f_21875 : this.f_21870);
      }
   }

   private record zQCCjClMJviwuram(String icon, String label, Runnable action, boolean danger) {
   }
}
