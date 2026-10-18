package dev.dimasik.client.module.combat;

import com.google.gson.JsonObject;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.manager.ModuleManager;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ColorSetting;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_3LQSDrJ0WJYOQ7ck;
import dev.dimasik.client.system.Class_3VHxwfI2NZKoxzIi;
import dev.dimasik.client.system.Class_9rb49jlyiwFNOlTd;
import dev.dimasik.client.system.Class_B6JOzHnwhU3pe4AO;
import dev.dimasik.client.system.Class_ETHFYgDAWb9l6f3g;
import dev.dimasik.client.system.Class_FghX3TD0v55wW2U2;
import dev.dimasik.client.system.Class_FrHk789UOFu9WpSr;
import dev.dimasik.client.system.Class_KezuRebad8hkzRXp;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_QBKwWNWLlChWViO9;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_U3Ilecg2NrGaJJQx;
import dev.dimasik.client.system.Class_Xsbjx1SxvnHy6q8B;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_ftHu9o3WzCU3Adxm;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_gJeXlympVy5r92wv;
import dev.dimasik.client.system.Class_h78PE30BIJJYoUEk;
import dev.dimasik.client.system.Class_kkp256olqZ4F1qt3;
import dev.dimasik.client.system.Class_lwIe74mLf6HOTjku;
import dev.dimasik.client.system.Class_mRcJJZJYG5cvDAlU;
import dev.dimasik.client.system.Class_oV1nLcU0paHSE9Oj;
import dev.dimasik.client.system.Class_pYAz0kgoyIbaaR5n;
import dev.dimasik.client.system.Class_uHPXr81r5AZlFeJr;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.util.HashSet;
import java.util.List;
import lombok.Generated;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket;
import net.minecraft.network.protocol.game.ServerboundSetCarriedItemPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.Action;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector2f;

public class Aura extends Module {
   public final SliderSetting f_719; //>> src by @setsprinting @pointdlc
   public final SliderSetting f_720;//>> src by @setsprinting @pointdlc
   private final MultiChoiceSetting f_721;//>> src by @setsprinting @pointdlc
   private final SliderSetting f_722;//>> src by @setsprinting @pointdlc
   private final SliderSetting f_723;//>> src by @setsprinting @pointdlc
   private final MultiChoiceSetting f_724;//>> src by @setsprinting @pointdlc
   private final SliderSetting f_725;//>> src by @setsprinting @pointdlc
   private final SliderSetting f_726;
   private final SliderSetting f_727;//>> src by @setsprinting @pointdlc
   private final SliderSetting f_728;
   private final SliderSetting f_729;//>> src by @setsprinting @pointdlc
   private final SliderSetting f_730;
   private final SliderSetting f_731;//>> src by @setsprinting @pointdlc
   private final SliderSetting f_732;
   private final SliderSetting f_733;//>> src by @setsprinting @pointdlc
   private final MultiChoiceSetting f_734;//>> src by @setsprinting @pointdlc
   private final MultiChoiceSetting f_735;
   private final SliderSetting f_736;
   private final SliderSetting f_737;
   public ItemListSetting f_738;
   private final MultiChoiceSetting f_739;
   private final ItemListSetting f_740;
   private final CheckboxSetting f_741;
   private final MultiChoiceSetting f_742;
   private final CheckboxSetting f_743;
   private final SliderSetting f_744;
   private final SliderSetting f_745;
   private final MultiChoiceSetting f_746;
   private final MultiChoiceSetting f_747;
   private final MultiChoiceSetting f_748;
   private final MultiChoiceSetting f_749;
   private final CheckboxSetting f_750;
   private final MultiChoiceSetting f_751;
   private final CheckboxSetting f_752;
   private final CheckboxSetting f_753;
   private final SliderSetting f_754;
   private final SliderSetting f_755;
   private final CheckboxSetting f_756;
   private final CheckboxSetting f_757;
   private final ColorSetting f_758;
   private final ColorSetting f_759;
   private final CheckboxSetting f_760;
   private final CheckboxSetting f_761;
   private final CheckboxSetting f_762;
   private final SliderSetting f_763;
   private final Aura.YDpJTAQ9lTQkTB5d f_764;
   private Class_kkp256olqZ4F1qt3 f_765;
   private LivingEntity f_766;
   private boolean f_767;
   private final Class_gEPk7yDw6CwIte87<Class_mRcJJZJYG5cvDAlU> f_768;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK.Class_07sbU45IoaK910B1> f_769;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_770;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_771;
   private final Class_gEPk7yDw6CwIte87<Class_ETHFYgDAWb9l6f3g> f_772;
   private final Class_gEPk7yDw6CwIte87<Class_pYAz0kgoyIbaaR5n> f_773;
   private final Class_gEPk7yDw6CwIte87<Class_B6JOzHnwhU3pe4AO> f_774;
   private int f_775;
   private long f_776;
   private long f_777;
   private int f_778;
   private long f_779;
   private float f_780;
   private float f_781;
   private float f_782;
   private float f_783;
   private long f_784;
   private float f_785;
   private float f_786;
   private float f_787;
   private float f_788;
   private boolean f_789;
   private long f_790;
   private boolean f_791;
   private boolean f_792;
   private final Class_gEPk7yDw6CwIte87<Class_Xsbjx1SxvnHy6q8B> f_793;
   private static final String f_794 = "Aura";
   private static final String f_795 = "Автоматически наводится и бьет таргетов";
   private static final String f_796 = "Дистанция атаки";
   private static final float f_797 = 3.0F;
   private static final float f_798 = 5.0F;
   private static final float f_799 = 0.1F;
   private static final String f_800 = "Дистанция ротации";
   private static final float f_801 = 1.5F;
   private static final float f_802 = 5.0F;
   private static final float f_803 = 0.1F;
   private static final String f_804 = "Тип ротации";
   private static final String f_805 = "Smooth";
   private static final String f_806 = "Snap";
   private static final String f_807 = "Sloth";
   private static final String f_808 = "FuntimeSnap";
   private static final String f_809 = "BMW";
   private static final String f_810 = "Legit";
   private static final String f_811 = "HvH";
   private static final String f_812 = "Neuro";
   private static final String f_813 = "Фактор высоты";
   private static final float f_814 = 0.5F;
   private static final float f_815 = 0.05F;
   private static final String f_816 = "Скорость Генерации";
   private static final float f_817 = 1.5F;
   private static final float f_818 = 6.0F;
   private static final float f_819 = 0.1F;
   private static final String f_820 = "Вид ротации";
   private static final String f_821 = "Обычная";
   private static final String f_822 = "Дефенсив";
   private static final String f_823 = "Джиттер";
   private static final String f_824 = "Предсказание";
   private static final float f_825 = 0.15F;
   private static final float f_826 = 0.01F;
   private static final String f_827 = "Скорость аима";
   private static final float f_828 = 3.5F;
   private static final float f_829 = 0.5F;
   private static final float f_830 = 20.0F;
   private static final float f_831 = 0.1F;
   private static final String f_832 = "FOV аима";
   private static final float f_833 = 40.0F;
   private static final float f_834 = 5.0F;
   private static final float f_835 = 120.0F;
   private static final String f_836 = "Множитель скорости";
   private static final float f_837 = 4.3F;
   private static final float f_838 = 5.0F;
   private static final float f_839 = 60.0F;
   private static final float f_840 = 0.1F;
   private static final String f_841 = "Доля вертикали";
   private static final float f_842 = 0.1F;
   private static final float f_843 = 0.1F;
   private static final float f_844 = 1.5F;
   private static final float f_845 = 0.05F;
   private static final String f_846 = "Резкость доводки";
   private static final float f_847 = 12.0F;
   private static final float f_848 = 15.0F;
   private static final float f_849 = 0.5F;
   private static final String f_850 = "Плавность";
   private static final float f_851 = 0.45F;
   private static final float f_852 = 0.05F;
   private static final float f_853 = 0.5F;
   private static final float f_854 = 0.01F;
   private static final String f_855 = "Дрожание гориз.";
   private static final float f_856 = 3.0F;
   private static final float f_857 = 0.1F;
   private static final String f_858 = "Дрожание верт.";
   private static final float f_859 = 3.0F;
   private static final float f_860 = 3.0F;
   private static final float f_861 = 0.1F;
   private static final String f_862 = "Точка прицела";
   private static final String f_863 = "Проекция";
   private static final String f_864 = "Центр тела";
   private static final String f_865 = "Голова";
   private static final String f_866 = "Ближайшая точка";
   private static final String f_867 = "Тип сортировки";
   private static final String f_868 = "Умная";
   private static final String f_869 = "Дистанция";
   private static final String f_870 = "Здоровье";
   private static final String f_871 = "Броня";
   private static final String f_872 = "Ускорение";
   private static final float f_873 = 6.0F;
   private static final float f_874 = 0.1F;
   private static final String f_875 = "Тики";
   private static final float f_876 = 8.0F;
   private static final String f_877 = "Настройки";
   private static final String f_878 = "Только криты";
   private static final String f_879 = "Только в прыжке";
   private static final String f_880 = "Проверять кулдаун";
   private static final String f_881 = "Проверять наводку";
   private static final String f_882 = "Ломать щит";
   private static final String f_883 = "Отжимать щит";
   private static final String f_884 = "Не бить когда ешь";
   private static final String f_885 = "Обход через стены";
   private static final String f_886 = "Тпс синх";
   private static final String f_887 = "Коррекция движения";
   private static final String f_888 = "Полноценная";
   private static final String f_889 = "Сфокусированная";
   private static final String f_890 = "Незаметная";
   private static final String f_891 = "Таргеты";
   private static final String f_892 = "Игроки";
   private static final String f_893 = "Голые";
   private static final String f_894 = "Друзья";
   private static final String f_895 = "Мобы";
   private static final String f_896 = "Включить ClientLook";
   private static final String f_897 = "Отображение цели";
   private static final String f_898 = "Квадрат";
   private static final String f_899 = "Кольцо";
   private static final String f_900 = "Кристалики";
   private static final String f_901 = "Куб";
   private static final String f_902 = "Молнии";
   private static final String f_903 = "Обруч";
   private static final String f_904 = "Пентограмма";
   private static final String f_905 = "Призраки";
   private static final String f_906 = "Ромбики";
   private static final String f_907 = "Треугольник";
   private static final String f_908 = "Сквозь стены";
   private static final String f_909 = "Размер частиц желе";
   private static final float f_910 = 0.2F;
   private static final float f_911 = 0.08F;
   private static final float f_912 = 0.45F;
   private static final float f_913 = 0.01F;
   private static final String f_914 = "Слои желе";
   private static final float f_915 = 14.0F;
   private static final float f_916 = 6.0F;
   private static final float f_917 = 22.0F;
   private static final String f_918 = "Тип кольца";
   private static final String f_919 = "Тип 1";
   private static final String f_920 = "Тип 2";
   private static final String f_921 = "Тип 3";
   private static final String f_922 = "Тип квадрата";
   private static final String f_923 = "Тип 1";
   private static final String f_924 = "Тип 2";
   private static final String f_925 = "Тип призраков";
   private static final String f_926 = "Тип 1";
   private static final String f_927 = "Тип 2";
   private static final String f_928 = "Тип 3";
   private static final String f_929 = "Тип 4";
   private static final String f_930 = "Тип 5";
   private static final String f_931 = "Тип 6";
   private static final String f_932 = "Тип 7";
   private static final String f_933 = "Тип 8";
   private static final String f_934 = "Тип кристалликов";
   private static final String f_935 = "Тип 1";
   private static final String f_936 = "Тип 2";
   private static final String f_937 = "Тип 3";
   private static final String f_938 = "Тип 4";
   private static final String f_939 = "Просвечивать кристаллы";
   private static final String f_940 = "Тип молний";
   private static final String f_941 = "Тип 1";
   private static final String f_942 = "Тип 2";
   private static final String f_943 = "Тип 3";
   private static final String f_944 = "Просвечивать";
   private static final String f_945 = "Освещение";
   private static final String f_946 = "Скорость кольца";
   private static final float f_947 = 1.2F;
   private static final float f_948 = 0.1F;
   private static final float f_949 = 5.0F;
   private static final float f_950 = 0.1F;
   private static final String f_951 = "Кол-во душ";
   private static final float f_952 = 3.0F;
   private static final float f_953 = 4.0F;
   private static final String f_954 = "Красный при ударе";
   private static final String f_955 = "Авто цвет под тему";
   private static final String f_956 = "Цвет отображения";
   private static final int f_957 = -65400;
   private static final String f_958 = "Цвет градиента кристаллов";
   private static final int f_959 = -11486721;
   private static final String f_960 = "Свечение";
   private static final String f_961 = "Просвечивать";
   private static final String f_962 = "Искажение";
   private static final String f_963 = "Сила искажения";
   private static final float f_964 = 12.0F;
   private static final float f_965 = 3.0F;
   private static final float f_966 = 30.0F;
   private static final String f_967 = "FuntimeSnap";
   private static final double f_968 = 0.5;
   private static final double f_969 = 1.0E-6;
   private static final float f_970 = -90.0F;
   private static final float f_971 = 90.0F;
   private static final float f_972 = 1.0E-9F;
   private static final float f_973 = 0.05F;
   private static final float f_974 = 7.5F;
   private static final float f_975 = -7.5F;
   private static final float f_976 = -90.0F;
   private static final float f_977 = 90.0F;
   private static final String f_978 = "Кольцо";
   private static final String f_979 = "Тип 3";
   private static final String f_980 = "Желе";
   private static final String f_981 = "Кольцо";
   private static final String f_982 = "Тип 3";
   private static final String f_983 = "FuntimeSnap";
   private static final float f_984 = 6.0F;
   private static final String f_985 = "FuntimeSnap";
   private static final String f_986 = "Legit";
   private static final String f_987 = "Spooky";
   private static final String f_988 = "BMW";
   private static final String f_989 = "Snap";
   private static final String f_990 = "Snap";
   private static final String f_991 = "Только криты";
   private static final String f_992 = "Только в прыжке";
   private static final String f_993 = "Проверять кулдаун";
   private static final float f_994 = 20.0F;
   private static final String f_995 = "Model loaded successfully!";
   private static final String f_996 = "FuntimeSnap";
   private static final String f_997 = "BMW";
   private static final String f_998 = "Snap";
   private static final String f_999 = "FuntimeSnap";
   private static final String f_1000 = "BMW";
   private static final String f_1001 = "Snap";
   private static final String f_1002 = "Legit";
   private static final String f_1003 = "Сфокусированная";
   private static final String f_1004 = "Незаметная";
   private static final String f_1005 = "Полноценная";
   private static final String f_1006 = "Spooky";
   private static final String f_1007 = "FuntimeSnap";
   private static final String f_1008 = "HvH";
   private static final String f_1009 = "HvH";
   private static final String f_1010 = "Smooth";
   private static final String f_1011 = "Snap";
   private static final String f_1012 = "FuntimeSnap";
   private static final String f_1013 = "Sloth";
   private static final String f_1014 = "Funtime";
   private static final String f_1015 = "Human";
   private static final String f_1016 = "Smooth";
   private static final String f_1017 = "Snap";
   private static final String f_1018 = "Neuro";
   private static final String f_1019 = "Не бить когда ешь";
   private static final String f_1020 = "Только криты";
   private static final String f_1021 = "Только в прыжке";
   private static final String f_1022 = "Проверять кулдаун";
   private static final String f_1023 = "Отжимать щит";
   private static final String f_1024 = "HvH";
   private static final String f_1025 = "Smooth";
   private static final String f_1026 = "Ломать щит";
   private static final String f_1027 = "FuntimeSnap";
   private static final double f_1028 = 1.0E-4;
   private static final double f_1029 = 1.25;
   private static final String f_1030 = "HvH";
   private static final String f_1031 = "Smooth";
   private static final String f_1032 = "Только криты";
   private static final String f_1033 = "Только в прыжке";
   private static final String f_1034 = "Проверять кулдаун";
   private static final String f_1035 = "Только криты";
   private static final String f_1036 = "Только в прыжке";
   private static final String f_1037 = "Проверять кулдаун";
   private static final String f_1038 = "FuntimeSnap";
   private static final double f_1039 = 1.0E-8;
   private static final float f_1040 = 90.0F;
   private static final String f_1041 = "Проверять наводку";
   private static final String f_1042 = "Игроки";
   private static final String f_1043 = "Голые";
   private static final String f_1044 = "Друзья";
   private static final String f_1045 = "Мобы";
   private static final double f_1046 = Double.MAX_VALUE;
   private static final double f_1047 = 1.0E-6;
   private static final double f_1048 = 80.0;
   private static final double f_1049 = 0.01;
   private static final double f_1050 = 10000.0;
   private static final float f_1051 = 6.0F;
   private static final String f_1052 = "Игроки";
   private static final String f_1053 = "Голые";
   private static final String f_1054 = "Друзья";
   private static final String f_1055 = "Мобы";
   private static final String f_1056 = "Игроки";
   private static final String f_1057 = "Голые";
   private static final String f_1058 = "Друзья";
   private static final String f_1059 = "Мобы";
   private static final String f_1060 = "Не бить когда ешь";
   private static final String f_1061 = "Только криты";
   private static final String f_1062 = "Только в прыжке";
   private static final String f_1063 = "Проверять кулдаун";
   private static final float f_1064 = 0.5F;
   private static final float f_1065 = 0.5F;
   private static final double f_1066 = 90.0;
   private static final float f_1067 = 1.0E9F;
   private static final float f_1068 = 0.05F;
   private static final long f_1069 = 4166666L;
   private static final long f_1070 = 4166666L;
   private static final String f_1071 = "Legit";
   private static final String f_1072 = "Spooky";
   private static final float f_1073 = 1.0E9F;
   private static final float f_1074 = 0.05F;
   private static final double f_1075 = 90.0;
   private static final long f_1076 = 140000000L;
   private static final float f_1077 = -1.1F;
   private static final float f_1078 = 1.1F;
   private static final float f_1079 = -0.9F;
   private static final float f_1080 = 0.9F;
   private static final float f_1081 = -90.0F;
   private static final float f_1082 = 90.0F;
   private static final float f_1083 = 650.0F;
   private static final float f_1084 = 11.0F;
   private static final float f_1085 = -9.5F;
   private static final float f_1086 = 1.0E-5F;
   private static final float f_1087 = -90.0F;
   private static final float f_1088 = 90.0F;
   private static final double f_1089 = 0.6;
   private static final double f_1090 = 0.6;
   private static final String f_1091 = "Центр тела";
   private static final String f_1092 = "Голова";
   private static final double f_1093 = 0.5;
   private static final double f_1094 = 0.15;
   private static final double f_1095 = 0.5;
   private static final String f_1096 = "Ближайшая точка";
   private static final double f_1097 = 1.0E-4;
   private static final double f_1098 = 0.5;
   private static final double f_1099 = 90.0;
   private static final double f_1100 = Double.MAX_VALUE;
   private static final float f_1101 = -1.0F;
   private static final float f_1102 = -1.0F;
   private static final float f_1103 = 0.02F;
   private static final String f_1104 = "Обход через стены";
   private static final String f_1105 = "BMW";
   private static final String f_1106 = "HvH";
   private static final String f_1107 = "Smooth";
   private static final float f_1108 = 20.0F;
   private static final float f_1109 = 5.0F;
   private static final String f_1110 = "Призраки";
   private static final String f_1111 = "Тип 2";
   private static final String f_1112 = "Тип 4";
   private static final String f_1113 = "Тип 5";
   private static final String f_1114 = "Призраки";
   private static final String f_1115 = "Тип 2";
   private static final String f_1116 = "Тип 4";
   private static final String f_1117 = "Тип 5";
   private static final String f_1118 = "Призраки";
   private static final String f_1119 = "Тип 2";
   private static final String f_1120 = "Тип 4";
   private static final String f_1121 = "Тип 5";
   private static final String f_1122 = "Призраки";
   private static final String f_1123 = "Тип 2";
   private static final String f_1124 = "Ромбики";
   private static final String f_1125 = "Кольцо";
   private static final String f_1126 = "Тип 2";
   private static final String f_1127 = "Призраки";
   private static final String f_1128 = "Тип 2";
   private static final String f_1129 = "Тип 3";
   private static final String f_1130 = "Тип 4";
   private static final String f_1131 = "Тип 5";
   private static final String f_1132 = "Призраки";
   private static final String f_1133 = "Тип 6";
   private static final String f_1134 = "Кольцо";
   private static final String f_1135 = "Призраки";
   private static final String f_1136 = "Кристалики";
   private static final String f_1137 = "Молнии";
   private static final String f_1138 = "Молнии";
   private static final String f_1139 = "Молнии";
   private static final String f_1140 = "Кристалики";
   private static final String f_1141 = "Кристалики";
   private static final String f_1142 = "Призраки";
   private static final String f_1143 = "Квадрат";
   private static final String f_1144 = "Кольцо";
   private static final String f_1145 = "Только криты";
   private static final String f_1146 = "Snap";
   private static final String f_1147 = "Sloth";
   private static final String f_1148 = "Legit";
   private static final String f_1149 = "Legit";
   private static final String f_1150 = "Legit";
   private static final String f_1151 = "Legit";
   private static final String f_1152 = "Legit";
   private static final String f_1153 = "Legit";
   private static final String f_1154 = "Legit";
   private static final String f_1155 = "Legit";
   private static final String f_1156 = "Legit";
   private static final String f_1157 = "HvH";
   private static final String f_1158 = "Обычная";
   private static final String f_1159 = "HvH";
   private static final String f_1160 = "Neuro";
   private static final String f_1161 = "Neuro";

   public LivingEntity m_1008(float var1) {
      if (f_11537.player != null && f_11537.level != null && !(var1 <= 0.0F)) {
         List var2 = Class_lwIe74mLf6HOTjku.m_7570(
            var1, this.f_740.m_7145(f_1042), this.f_740.m_7145(f_1043), this.f_740.m_7145(f_1044), this.f_740.m_7145(f_1045)
         );
         Vec3 var3 = f_11537.player.position();
         Vec3 var4 = f_11537.player.getDeltaMovement();
         LivingEntity var5 = null;
         double var6 = f_1046;

         for (LivingEntity var9 : (Iterable<LivingEntity>) (Iterable) var2) {
            Vec3 var10 = var9.position().subtract(var3);
            Vec3 var11 = var9.getDeltaMovement().subtract(var4);
            double var12 = var11.lengthSqr();
            double var14 = var12 < f_1047 ? 0.0 : -var10.dot(var11) / var12;
            var14 = Mth.clamp(var14, 0.0, f_1048);
            Vec3 var16 = var10.add(var11.scale(var14));
            double var17 = var10.dot(var4);
            double var19 = var16.lengthSqr() + var14 * f_1049 + (var17 <= 0.0 ? f_1050 : 0.0);
            if (var19 < var6) {
               var6 = var19;
               var5 = var9;
            }
         }

         return var5;
      } else {
         return null;
      }
   }

   private void m_1009() {
      long var1 = System.nanoTime();
      if (this.f_777 == 0L) {
         this.f_777 = var1;
      }

      long var3 = var1 - this.f_777;
      this.f_778 = this.f_778 + (int)(var3 / f_1069);
      this.f_777 = this.f_777 + this.f_778 * f_1070;

      for (this.f_778 = Math.min(this.f_778, 240); this.f_778 > 0; this.f_778--) {
         if (this.f_721.m_7568(f_1071) && !this.f_767) {
            this.m_1113();
         }

         if (this.f_721.m_7568(f_1072) && !this.f_767) {
            this.m_1018();
         }
      }
   }

   public double[] m_1011(double var1, double var3) {
      if (f_11537.player != null && this.f_766 != null) {
         double var5 = this.f_766.getX() - f_11537.player.getX();
         double var7 = this.f_766.getZ() - f_11537.player.getZ();
         double var9 = Math.hypot(var5, var7);
         if (!(var9 < f_1028) && !(var9 > this.f_719.m_8768().floatValue() + f_1029)) {
            double var11 = var5 / var9;
            double var13 = var7 / var9;
            double var15 = var1 * var11 + var3 * var13;
            if (var15 < 0.0) {
               var1 -= var11 * var15;
               var3 -= var13 * var15;
            }

            return new double[]{var1, var3};
         } else {
            return new double[]{var1, var3};
         }
      } else {
         return new double[]{var1, var3};
      }
   }

   @Generated
   public CheckboxSetting m_1012() {
      return this.f_756;
   }

   public boolean m_1013() {
      return this.m_776() && (this.f_721.m_7568(f_1030) || this.f_721.m_7568(f_1031)) && this.f_766 != null;
   }

   private void m_1014() {
      Class_U3Ilecg2NrGaJJQx var1 = DimasikClient.m_9057().m_9049().m_2813();
      if (this.f_765 == var1.m_5171() || var1.m_5180() == var1.m_5171()) {
         Class_FghX3TD0v55wW2U2 var2 = DimasikClient.m_9057().m_9052().m_6342();
         var2.m_2663().set(var2.m_2654());
         if (f_11537.player != null) {
            f_11537.player.setYRot(var2.m_2654().x);
            f_11537.player.setXRot(var2.m_2654().y);
         }
      }
   }

   @Generated
   public MultiChoiceSetting m_1016() {
      return this.f_739;
   }

   @Generated
   public void m_1017(long var1) {
      this.f_779 = var1;
   }

   private void m_1018() {
      if (this.f_766 != null && f_11537.gui.screen() == null) {
         long var1 = System.nanoTime();
         float var3 = this.f_779 == 0L ? 0.0F : (float)(var1 - this.f_779) / f_1073;
         this.f_779 = var1;
         var3 = Mth.clamp(var3, 0.0F, f_1074);
         if (!(var3 <= 0.0F)) {
            Vec3 var4 = this.m_1118(this.f_766);
            float var5 = (float)Mth.wrapDegrees(Math.toDegrees(Math.atan2(var4.z, var4.x)) - f_1075);
            float var6 = (float)(-Math.toDegrees(Math.atan2(var4.y, Math.hypot(var4.x, var4.z))));
            long var7 = f_1076;
            if (var1 - this.f_784 >= var7) {
               this.f_785 = Class_3VHxwfI2NZKoxzIi.m_1302(f_1077, f_1078);
               this.f_786 = Class_3VHxwfI2NZKoxzIi.m_1302(f_1079, f_1080);
               this.f_784 = var1;
            }

            float var9 = f_11537.player.getYRot();
            float var10 = f_11537.player.getXRot();
            float var11;
            float var12;
            if (Class_gJeXlympVy5r92wv.m_6784(var9, var10, this.f_719.m_8768().floatValue(), this.f_766, false)) {
               var11 = 0.0F;
               var12 = 0.0F;
            } else {
               var11 = Mth.wrapDegrees(var5 + this.f_785 - var9);
               var12 = Mth.wrapDegrees(var6 + this.f_786 - var10);
               var12 = Mth.clamp(var10 + var12, f_1081, f_1082) - var10;
            }

            float var13 = f_1083;
            float var14 = f_1084;
            float var15 = Mth.clamp(Math.abs(var11) * var14, 0.0F, var13) * Math.signum(var11);
            float var16 = Mth.clamp(Math.abs(var12) * var14, 0.0F, var13) * Math.signum(var12);
            float var17 = 1.0F - (float)Math.exp(f_1085 * var3);
            this.f_780 = this.f_780 + (var15 - this.f_780) * var17;
            this.f_781 = this.f_781 + (var16 - this.f_781) * var17;
            float var18 = this.f_780 * var3;
            float var19 = this.f_781 * var3;
            if (Math.abs(var18) > Math.abs(var11)) {
               var18 = var11;
            }

            if (Math.abs(var19) > Math.abs(var12)) {
               var19 = var12;
            }

            float var20 = Class_uHPXr81r5AZlFeJr.m_9139();
            if (var20 > f_1086) {
               float var21 = var18 + this.f_782;
               float var22 = Math.round(var21 / var20) * var20;
               this.f_782 = var21 - var22;
               var18 = var22;
               float var23 = var19 + this.f_783;
               float var24 = Math.round(var23 / var20) * var20;
               this.f_783 = var23 - var24;
               var19 = var24;
            }

            float var27 = var9 + var18;
            float var28 = Mth.clamp(var10 + var19, f_1087, f_1088);
            this.f_764.m_7466(this.f_766.position().add(0.0, this.f_766.getBbHeight() * f_1089, 0.0));
            this.f_764.m_1005(var27, var28);
            if (DimasikClient.m_9057().m_9049().m_2813().m_5177(this.f_764, 1, 6)) {
               DimasikClient.m_9057().m_9052().m_6342().m_2654().set(var27, var28);
               f_11537.player.setYRot(var27);
               f_11537.player.setXRot(var28);
            }
         }
      } else {
         this.f_779 = System.nanoTime();
         this.f_780 = 0.0F;
         this.f_781 = 0.0F;
         this.f_782 = 0.0F;
         this.f_783 = 0.0F;
      }
   }

   @Generated
   public SliderSetting m_1019() {
      return this.f_733;
   }

   @Generated
   public SliderSetting m_1021() {
      return this.f_720;
   }

   @Generated
   public float m_1022() {
      return this.f_781;
   }

   @Override
   public void m_732() {
      this.f_767 = false;
      this.m_1014();
      this.m_1071();
      this.f_766 = null;
      this.f_765 = null;
      this.f_775 = 0;
      this.f_776 = 0L;
      this.f_777 = 0L;
      this.f_778 = 0;
      this.f_779 = 0L;
      this.f_780 = 0.0F;
      this.f_781 = 0.0F;
      this.f_782 = 0.0F;
      this.f_783 = 0.0F;
      this.f_784 = 0L;
      this.f_785 = 0.0F;
      this.f_786 = 0.0F;
      this.f_789 = false;
      this.f_790 = 0L;
      DimasikClient.m_9057().m_9049().m_2813().m_5160().m_1801();
      if (this.f_721.m_7568(f_1105)) {
         DimasikClient.m_9057().m_9049().m_2813().m_5162(null);
      }
   }

   @Generated
   public SliderSetting m_1023() {
      return this.f_731;
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK.Class_07sbU45IoaK910B1> m_1024() {
      return this.f_769;
   }

   private boolean m_1025(float var1) {
      Class_U3Ilecg2NrGaJJQx var2 = DimasikClient.m_9057().m_9049().m_2813();
      Class_9rb49jlyiwFNOlTd var3 = var2.m_5176();
      if (!this.m_1075()) {
         if (var3.m_2016()) {
            return true;
         }

         var2.m_5164(var3);
         DimasikClient.m_9057().m_9052().m_6342().m_2662(var3);
         this.f_792 = true;
         return false;
      } else {
         if (this.f_792) {
            var3.m_2039();
            this.f_792 = false;
         }

         if (this.f_766 != null
            && !DimasikClient.m_9057().m_9049().m_2801().m_3544().m_5580()
            && (!f_11537.player.isUsingItem() || f_11537.player.isBlocking() || !this.f_738.m_7145(f_1060))) {
            ElytraTarget var4 = DimasikClient.m_9057().m_9049().m_2801().m_3574();
            float var5 = f_11537.player.isFallFlying()
                  && var4.m_776()
                  && this.f_766.isFallFlying()
                  && Class_3VHxwfI2NZKoxzIi.m_1306(this.f_766) > var4.m_5076().m_8768().floatValue()
                  && var4.m_5086().m_8768()
               ? var4.m_5090().m_8768()
               : var1;
            int var6 = Class_KezuRebad8hkzRXp.m_3381(this.f_766, this.f_738.m_7145(f_1061), this.f_738.m_7145(f_1062), true, var5, this.f_738.m_7145(f_1063), 5);
            var3.m_2017(this.f_766, var6);
            return true;
         } else {
            var3.m_2017(this.f_766, -1);
            return true;
         }
      }
   }

   @Generated
   public void m_1026(boolean var1) {
      this.f_792 = var1;
   }

   private boolean m_1027() {
      ModuleManager var1 = DimasikClient.m_9057().m_9049().m_2801();
      return this.f_766 != null && this.f_738.m_7145(f_1104) && !f_11537.player.hasLineOfSight(this.f_766) && !var1.m_3590().m_776() && !var1.m_3460().m_776();
   }

   @Generated
   public void m_1028(boolean var1) {
      this.f_789 = var1;
   }

   @Generated
   public SliderSetting m_1029() {
      return this.f_722;
   }

   @Generated
   public SliderSetting m_1031() {
      return this.f_725;
   }

   @Generated
   public MultiChoiceSetting m_1032() {
      return this.f_735;
   }

   @Generated
   public boolean m_1033() {
      return this.f_767;
   }

   @Generated
   public void m_1035(float var1) {
      this.f_787 = var1;
   }

   @Generated
   public CheckboxSetting m_1036() {
      return this.f_762;
   }

   @Generated
   public SliderSetting m_1037() {
      return this.f_726;
   }

   @Generated
   public float m_1038() {
      return this.f_785;
   }

   @Generated
   public CheckboxSetting m_1039() {
      return this.f_750;
   }

   @Generated
   public void m_1040(LivingEntity var1) {
      this.f_766 = var1;
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> m_1041() {
      return this.f_771;
   }

   @Generated
   public ColorSetting m_1042() {
      return this.f_759;
   }

   public void m_1043(boolean var1) {
      this.f_767 = var1;
      if (var1) {
         this.m_1071();
      }
   }

   @Generated
   public void m_1044(long var1) {
      this.f_790 = var1;
   }

   private void m_1045(Class_mRcJJZJYG5cvDAlU var1) {
      float var2 = var1.m_7588();
      float var3 = var1.m_7603();
      if (var2 != 0.0F || var3 != 0.0F) {
         double var4 = this.f_766.getX() - f_11537.player.getX();
         double var6 = this.f_766.getZ() - f_11537.player.getZ();
         float var8 = (float)Mth.wrapDegrees(Math.toDegrees(Math.atan2(var6, var4)) - f_1099);
         double var9 = Mth.wrapDegrees(Math.toDegrees(Class_QBKwWNWLlChWViO9.m_4262(var8, var2, var3)));
         float var11 = var2;
         float var12 = var3;
         double var13 = f_1100;

         for (float var15 = f_1101; var15 <= 1.0F; var15++) {
            for (float var16 = f_1102; var16 <= 1.0F; var16++) {
               if (var15 != 0.0F || var16 != 0.0F) {
                  double var17 = Mth.wrapDegrees(Math.toDegrees(Class_QBKwWNWLlChWViO9.m_4262(f_11537.player.getYRot(), var15, var16)));
                  double var19 = Math.abs(Mth.wrapDegrees(var9 - var17));
                  if (var19 < var13) {
                     var13 = var19;
                     var11 = var15;
                     var12 = var16;
                  }
               }
            }
         }

         var1.m_7590(var11);
         var1.m_7596(var12);
      }
   }

   @Generated
   public CheckboxSetting m_1047() {
      return this.f_761;
   }

   @Generated
   public void m_1049(float var1) {
      this.f_781 = var1;
   }

   @Generated
   public SliderSetting m_1050() {
      return this.f_728;
   }

   @Generated
   public void m_1051(int var1) {
      this.f_778 = var1;
   }

   private void m_1053() {
      if (this.f_765 != null && this.f_766 != null && !this.f_767) {
         ElytraTarget var1 = DimasikClient.m_9057().m_9049().m_2801().m_3574();
         this.f_765
            .m_7466(
               var1.m_5099(this.f_766, this.f_766.position().add(0.0, this.f_766.getBbHeight() / 2.0F + (f_11537.player.isFallFlying() ? f_1065 : 0.0F), 0.0))
            );
         DimasikClient.m_9057().m_9049().m_2813().m_5162(this.f_765);
      }
   }

   @Generated
   public SliderSetting m_1054() {
      return this.f_744;
   }

   @Generated
   public float m_1055() {
      return this.f_787;
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> m_1056() {
      return this.f_770;
   }

   private void m_1057() {
      ElytraTarget var1 = DimasikClient.m_9057().m_9049().m_2801().m_3574();
      float var2 = this.f_719.m_8768();
      if (var1.m_776()) {
         var2 = var1.m_5090().m_8768();
      }

      if (DimasikClient.m_9057().m_9049().m_2801().m_3590().m_776() || DimasikClient.m_9057().m_9049().m_2801().m_3460().m_776()) {
         var2 = f_1051;
      }

      if (f_11537.player.isFallFlying() && var1.m_776()) {
         this.f_766 = Class_lwIe74mLf6HOTjku.m_7574(
            this.f_766,
            var2 + var1.m_5087().m_8768(),
            this.f_740.m_7145(f_1052),
            this.f_740.m_7145(f_1053),
            this.f_740.m_7145(f_1054),
            this.f_740.m_7145(f_1055),
            this.f_735
         );
      } else {
         this.f_766 = Class_lwIe74mLf6HOTjku.m_7574(
            this.f_766,
            var2 + this.f_720.m_8768(),
            this.f_740.m_7145(f_1056),
            this.f_740.m_7145(f_1057),
            this.f_740.m_7145(f_1058),
            this.f_740.m_7145(f_1059),
            this.f_735
         );
      }
   }

   public void m_1058(float var1) {
      if (!this.m_1128()) {
         this.f_789 = false;
         this.f_790 = 0L;
      } else {
         Vec3 var2 = f_11537.player.getEyePosition(var1);
         Vec3 var3 = this.f_766.getPosition(var1).add(0.0, this.f_766.getBbHeight() * f_968, 0.0);
         Vec3 var4 = var3.subtract(var2);
         double var5 = Math.sqrt(var4.x * var4.x + var4.z * var4.z);
         float var7 = (float)Math.toDegrees(Math.atan2(-var4.x, var4.z));
         float var8 = (float)Math.toDegrees(-Math.atan2(var4.y, Math.max(var5, f_969)));
         var8 = Mth.clamp(var8, f_970, f_971);
         long var9 = System.nanoTime();
         Class_FghX3TD0v55wW2U2 var11 = DimasikClient.m_9057().m_9052().m_6342();
         if (!this.f_789) {
            Vector2f var12 = var11.m_2663();
            if (var11.m_2656() != null) {
               this.f_787 = var12.x;
               this.f_788 = var12.y;
            } else {
               this.f_787 = f_11537.player.getYRot();
               this.f_788 = f_11537.player.getXRot();
            }

            this.f_789 = true;
            this.f_790 = var9;
         }

         float var16 = (float)(var9 - this.f_790) * f_972;
         this.f_790 = var9;
         var16 = Mth.clamp(var16, 0.0F, f_973);
         float var13 = f_974;
         float var14 = 1.0F - (float)Math.exp(f_975 * var16);
         this.f_787 = this.f_787 + Mth.wrapDegrees(var7 - this.f_787) * var14;
         this.f_788 = this.f_788 + (var8 - this.f_788) * var14;
         this.f_788 = Mth.clamp(this.f_788, f_976, f_977);
         var11.m_2663().set(this.f_787, this.f_788);
      }
   }

   @Generated
   public void m_1059(float var1) {
      this.f_782 = var1;
   }

   @Generated
   public MultiChoiceSetting m_1060() {
      return this.f_742;
   }

   public Aura() {
      super(f_794, f_795, Category.COMBAT);
      this.f_719 = new SliderSetting(f_796, f_797, 1.0F, f_798).m_828(f_799);
      this.f_720 = new SliderSetting(f_800, f_801, 0.0F, f_802).m_828(f_803);
      this.f_721 = new MultiChoiceSetting(
         f_804,
         new Class_2ZaVm8TGDJ68TnJB(f_805),
         new Class_2ZaVm8TGDJ68TnJB(f_806),
         new Class_2ZaVm8TGDJ68TnJB(f_807),
         new Class_2ZaVm8TGDJ68TnJB(f_808),
         new Class_2ZaVm8TGDJ68TnJB(f_809),
         new Class_2ZaVm8TGDJ68TnJB(f_810),
         new Class_2ZaVm8TGDJ68TnJB(f_811),
         new Class_2ZaVm8TGDJ68TnJB(f_812)
      );
      this.f_722 = new SliderSetting(f_813, f_814, 0.0F, 1.0F).m_828(f_815).m_822(() -> this.f_721.m_7568(f_1161));
      this.f_723 = new SliderSetting(f_816, f_817, 1.0F, f_818)
         .m_828(f_819)
         .m_822(() -> this.f_721.m_7568(f_1160) && FabricLoader.getInstance().isDevelopmentEnvironment());
      this.f_724 = new MultiChoiceSetting(f_820, new Class_2ZaVm8TGDJ68TnJB(f_821), new Class_2ZaVm8TGDJ68TnJB(f_822), new Class_2ZaVm8TGDJ68TnJB(f_823))
         .m_822(() -> this.f_721.m_7568(f_1159));
      this.f_725 = new SliderSetting(f_824, f_825, 0.0F, 1.0F).m_828(f_826).m_822(() -> this.f_721.m_7568(f_1157) && this.f_724.m_7568(f_1158));
      this.f_726 = new SliderSetting(f_827, f_828, f_829, f_830).m_828(f_831).m_822(() -> this.f_721.m_7568(f_1156));
      this.f_727 = new SliderSetting(f_832, f_833, f_834, f_835).m_828(1.0F).m_822(() -> this.f_721.m_7568(f_1155));
      this.f_728 = new SliderSetting(f_836, f_837, f_838, f_839).m_828(f_840).m_822(() -> this.f_721.m_7568(f_1154));
      this.f_729 = new SliderSetting(f_841, f_842, f_843, f_844).m_828(f_845).m_822(() -> this.f_721.m_7568(f_1153));
      this.f_730 = new SliderSetting(f_846, f_847, 1.0F, f_848).m_828(f_849).m_822(() -> this.f_721.m_7568(f_1152));
      this.f_731 = new SliderSetting(f_850, f_851, f_852, f_853).m_828(f_854).m_822(() -> this.f_721.m_7568(f_1151));
      this.f_732 = new SliderSetting(f_855, 1.0F, 0.0F, f_856).m_828(f_857).m_822(() -> this.f_721.m_7568(f_1150));
      this.f_733 = new SliderSetting(f_858, f_859, 0.0F, f_860).m_828(f_861).m_822(() -> this.f_721.m_7568(f_1149));
      this.f_734 = new MultiChoiceSetting(
            f_862,
            2,
            new Class_2ZaVm8TGDJ68TnJB(f_863),
            new Class_2ZaVm8TGDJ68TnJB(f_864),
            new Class_2ZaVm8TGDJ68TnJB(f_865),
            new Class_2ZaVm8TGDJ68TnJB(f_866)
         )
         .m_822(() -> this.f_721.m_7568(f_1148));
      this.f_735 = new MultiChoiceSetting(
         f_867, new Class_2ZaVm8TGDJ68TnJB(f_868), new Class_2ZaVm8TGDJ68TnJB(f_869), new Class_2ZaVm8TGDJ68TnJB(f_870), new Class_2ZaVm8TGDJ68TnJB(f_871)
      );
      this.f_736 = new SliderSetting(f_872, 1.0F, 1.0F, f_873).m_828(f_874).m_822(() -> this.f_721.m_7568(f_1147));
      this.f_737 = new SliderSetting(f_875, 2.0F, 1.0F, f_876).m_828(1.0F).m_822(() -> this.f_721.m_7568(f_1146));
      this.f_738 = new ItemListSetting(
         f_877,
         new Class_2ZaVm8TGDJ68TnJB(f_878, true),
         new Class_2ZaVm8TGDJ68TnJB(f_879, true).m_1185(() -> this.f_738.m_7145(f_1145)),
         new Class_2ZaVm8TGDJ68TnJB(f_880, true),
         new Class_2ZaVm8TGDJ68TnJB(f_881, false),
         new Class_2ZaVm8TGDJ68TnJB(f_882, true),
         new Class_2ZaVm8TGDJ68TnJB(f_883, true),
         new Class_2ZaVm8TGDJ68TnJB(f_884, false),
         new Class_2ZaVm8TGDJ68TnJB(f_885, false),
         new Class_2ZaVm8TGDJ68TnJB(f_886, false)
      );
      this.f_739 = new MultiChoiceSetting(f_887, new Class_2ZaVm8TGDJ68TnJB(f_888), new Class_2ZaVm8TGDJ68TnJB(f_889), new Class_2ZaVm8TGDJ68TnJB(f_890));
      this.f_740 = new ItemListSetting(
         f_891,
         new Class_2ZaVm8TGDJ68TnJB(f_892, true),
         new Class_2ZaVm8TGDJ68TnJB(f_893, true),
         new Class_2ZaVm8TGDJ68TnJB(f_894, false),
         new Class_2ZaVm8TGDJ68TnJB(f_895, true)
      );
      this.f_741 = new CheckboxSetting(f_896, false);
      this.f_742 = new MultiChoiceSetting(
         f_897,
         new Class_2ZaVm8TGDJ68TnJB(f_898),
         new Class_2ZaVm8TGDJ68TnJB(f_899),
         new Class_2ZaVm8TGDJ68TnJB(f_900),
         new Class_2ZaVm8TGDJ68TnJB(f_901),
         new Class_2ZaVm8TGDJ68TnJB(f_902),
         new Class_2ZaVm8TGDJ68TnJB(f_903),
         new Class_2ZaVm8TGDJ68TnJB(f_904),
         new Class_2ZaVm8TGDJ68TnJB(f_905),
         new Class_2ZaVm8TGDJ68TnJB(f_906),
         new Class_2ZaVm8TGDJ68TnJB(f_907)
      );
      this.f_743 = new CheckboxSetting(f_908, true).m_822(this::m_1077);
      this.f_744 = new SliderSetting(f_909, f_910, f_911, f_912).m_828(f_913).m_822(this::m_1077);
      this.f_745 = new SliderSetting(f_914, f_915, f_916, f_917).m_828(1.0F).m_822(this::m_1077);
      this.f_746 = new MultiChoiceSetting(f_918, new Class_2ZaVm8TGDJ68TnJB(f_919), new Class_2ZaVm8TGDJ68TnJB(f_920), new Class_2ZaVm8TGDJ68TnJB(f_921))
         .m_822(() -> this.f_742.m_7568(f_1144));
      this.f_747 = new MultiChoiceSetting(f_922, new Class_2ZaVm8TGDJ68TnJB(f_923), new Class_2ZaVm8TGDJ68TnJB(f_924)).m_822(() -> this.f_742.m_7568(f_1143));
      this.f_748 = new MultiChoiceSetting(
            f_925,
            new Class_2ZaVm8TGDJ68TnJB(f_926),
            new Class_2ZaVm8TGDJ68TnJB(f_927),
            new Class_2ZaVm8TGDJ68TnJB(f_928),
            new Class_2ZaVm8TGDJ68TnJB(f_929),
            new Class_2ZaVm8TGDJ68TnJB(f_930),
            new Class_2ZaVm8TGDJ68TnJB(f_931),
            new Class_2ZaVm8TGDJ68TnJB(f_932),
            new Class_2ZaVm8TGDJ68TnJB(f_933)
         )
         .m_822(() -> this.f_742.m_7568(f_1142));
      this.f_749 = new MultiChoiceSetting(
            f_934, new Class_2ZaVm8TGDJ68TnJB(f_935), new Class_2ZaVm8TGDJ68TnJB(f_936), new Class_2ZaVm8TGDJ68TnJB(f_937), new Class_2ZaVm8TGDJ68TnJB(f_938)
         )
         .m_822(() -> this.f_742.m_7568(f_1141));
      this.f_750 = new CheckboxSetting(f_939, true).m_822(() -> this.f_742.m_7568(f_1140));
      this.f_751 = new MultiChoiceSetting(f_940, new Class_2ZaVm8TGDJ68TnJB(f_941), new Class_2ZaVm8TGDJ68TnJB(f_942), new Class_2ZaVm8TGDJ68TnJB(f_943))
         .m_822(() -> this.f_742.m_7568(f_1139));
      this.f_752 = new CheckboxSetting(f_944, false).m_822(() -> this.f_742.m_7568(f_1138));
      this.f_753 = new CheckboxSetting(f_945, true).m_822(() -> this.f_742.m_7568(f_1135) || this.f_742.m_7568(f_1136) || this.f_742.m_7568(f_1137));
      this.f_754 = new SliderSetting(f_946, f_947, f_948, f_949).m_828(f_950).m_822(() -> this.f_742.m_7568(f_1134) && !this.m_1077());
      this.f_755 = new SliderSetting(f_951, f_952, 2.0F, f_953).m_828(1.0F).m_822(() -> this.f_742.m_7568(f_1132) && this.f_748.m_7568(f_1133));
      this.f_756 = new CheckboxSetting(f_954, true);
      this.f_757 = new CheckboxSetting(f_955, true);
      this.f_758 = new ColorSetting(f_956, false, f_957).m_822(() -> !this.f_757.m_8768());
      this.f_759 = new ColorSetting(f_958, false, f_959)
         .m_822(
            () -> (
                  this.f_742.m_7568(f_1124)
                     || this.f_742.m_7568(f_1125) && this.f_746.m_7568(f_1126)
                     || this.f_742.m_7568(f_1127)
                        && (this.f_748.m_7568(f_1128) || this.f_748.m_7568(f_1129) || this.f_748.m_7568(f_1130) || this.f_748.m_7568(f_1131))
               )
               && !this.f_757.m_8768()
         );
      this.f_760 = new CheckboxSetting(f_960, false).m_822(() -> this.f_742.m_7568(f_1122) && this.f_748.m_7568(f_1123));
      this.f_761 = new CheckboxSetting(f_961, true)
         .m_822(() -> this.f_742.m_7568(f_1118) && (this.f_748.m_7568(f_1119) || this.f_748.m_7568(f_1120) || this.f_748.m_7568(f_1121)));
      this.f_762 = new CheckboxSetting(f_962, true)
         .m_822(() -> !this.m_1077() && (!this.f_742.m_7568(f_1114) || !this.f_748.m_7568(f_1115) && !this.f_748.m_7568(f_1116) && !this.f_748.m_7568(f_1117)));
      this.f_763 = new SliderSetting(f_963, f_964, f_965, f_966)
         .m_828(1.0F)
         .m_822(
            () -> !this.m_1077()
               && (!this.f_742.m_7568(f_1110) || !this.f_748.m_7568(f_1111) && !this.f_748.m_7568(f_1112) && !this.f_748.m_7568(f_1113))
               && this.f_762.m_8768()
         );
      this.f_764 = new Aura.YDpJTAQ9lTQkTB5d();
      this.f_768 = this::m_1143;
      this.f_769 = this::m_1106;
      this.f_770 = this::m_1154;
      this.f_771 = this::m_1122;
      this.f_772 = this::m_1174;
      this.f_773 = this::m_1094;
      this.f_774 = this::m_1091;
      this.f_791 = false;
      this.f_793 = this::m_1175;
      this.f_720.m_814(() -> !this.f_721.m_7568(f_1106) && !this.f_721.m_7568(f_1107) ? f_1109 : f_1108);
      this.m_795(
         this.f_721,
         this.f_724,
         this.f_723,
         this.f_722,
         this.f_725,
         this.f_726,
         this.f_727,
         this.f_728,
         this.f_729,
         this.f_730,
         this.f_731,
         this.f_732,
         this.f_733,
         this.f_734,
         this.f_735,
         this.f_738,
         this.f_719,
         this.f_720,
         this.f_736,
         this.f_737,
         this.f_739,
         this.f_740,
         this.f_741,
         this.f_742,
         this.f_747,
         this.f_746,
         this.f_748,
         this.f_749,
         this.f_750,
         this.f_751,
         this.f_752,
         this.f_753,
         this.f_754,
         this.f_755,
         this.f_757,
         this.f_758,
         this.f_759,
         this.f_760,
         this.f_761,
         this.f_762,
         this.f_763,
         this.f_756,
         this.f_743,
         this.f_744,
         this.f_745
      );
   }

   @Generated
   public MultiChoiceSetting m_1061() {
      return this.f_749;
   }

   @Generated
   public void m_1064(long var1) {
      this.f_784 = var1;
   }

   public boolean m_1065() {
      return false;
   }

   public boolean m_1066(Entity var1) {
      return this.m_1013() && var1 == this.f_766;
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_ETHFYgDAWb9l6f3g> m_1067() {
      return this.f_772;
   }

   @Generated
   public SliderSetting m_1069() {
      return this.f_755;
   }

   @Generated
   public long m_1070() {
      return this.f_777;
   }

   private void m_1071() {
      Class_U3Ilecg2NrGaJJQx var1 = DimasikClient.m_9057().m_9049().m_2813();
      if (this.f_765 == this.f_764 || var1.m_5180() == this.f_764 || var1.m_5174(this.f_764)) {
         this.m_1158();
      } else if (this.f_765 != var1.m_5176() && var1.m_5180() != var1.m_5176() && !var1.m_5174(var1.m_5176())) {
         if (this.f_765 == var1.m_5160() || var1.m_5180() == var1.m_5160()) {
            var1.m_5160().m_1801();
         }

         var1.m_5162(null);
      } else {
         this.m_1098();
      }
   }

   @Generated
   public boolean m_1072() {
      return this.f_792;
   }

   @Generated
   public boolean m_1073() {
      return this.f_789;
   }

   @Generated
   public SliderSetting m_1074() {
      return this.f_763;
   }

   private boolean m_1075() {
      if (!this.f_721.m_7568(f_1038)) {
         return true;
      }

      if (f_11537.player != null && this.f_766 != null) {
         Vec3 var1 = this.f_766.getBoundingBox().getCenter().subtract(f_11537.player.getEyePosition());
         if (var1.x * var1.x + var1.z * var1.z < f_1039) {
            return true;
         }

         float var2 = (float)Math.toDegrees(Math.atan2(-var1.x, var1.z));
         float var3 = DimasikClient.m_9057().m_9052().m_6342().m_2663().x;
         return Math.abs(Mth.wrapDegrees(var2 - var3)) <= f_1040;
      } else {
         return false;
      }
   }

   @Generated
   public void m_1076(int var1) {
      this.f_775 = var1;
   }

   private boolean m_1077() {
      return this.f_742.m_7568(f_978) && this.f_746.m_7568(f_979);
   }

   @Generated
   public void m_1078(float var1) {
      this.f_783 = var1;
   }

   @Generated
   public long m_1082() {
      return this.f_784;
   }

   @Generated
   public ColorSetting m_1083() {
      return this.f_758;
   }

   @Generated
   public MultiChoiceSetting m_1084() {
      return this.f_748;
   }

   @Generated
   public long m_1085() {
      return this.f_779;
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_B6JOzHnwhU3pe4AO> m_1086() {
      return this.f_774;
   }

   @Generated
   public CheckboxSetting m_1087() {
      return this.f_741;
   }

   private void m_1088() {
      if (this.m_1027()) {
         Vec3 var1 = f_11537.player.getEyePosition();
         Vec3 var2 = this.f_766.position().add(0.0, this.f_766.getBbHeight() / 2.0F, 0.0);
         double var3 = var1.distanceTo(var2);
         HashSet<BlockPos> var5 = new HashSet<>();

         for (float var6 = 0.0F; var6 <= 1.0F; var6 += f_1103) {
            Vec3 var7 = Class_3VHxwfI2NZKoxzIi.m_1303(var1, var2, var6);
            BlockPos var8 = BlockPos.containing(var7);
            if (!f_11537.level.getBlockState(var8).isAir()) {
               var5.add(var8);
            }
         }

         BlockPos var11 = null;

         for (BlockPos var14 : var5) {
            if (var11 != null && var11.equals(var14)) {
               var5.remove(var14);
               var11 = var14;
            } else if (var11 == null) {
               var11 = var14;
            }
         }

         for (BlockPos var15 : var5) {
            Vec3 var9 = var1.subtract(var2);
            Direction var10 = Direction.getApproximateNearest(var9);
            Class_3LQSDrJ0WJYOQ7ck.m_1295(new ServerboundPlayerActionPacket(Action.START_DESTROY_BLOCK, var15, var10));
            Class_3LQSDrJ0WJYOQ7ck.m_1295(new ServerboundPlayerActionPacket(Action.STOP_DESTROY_BLOCK, var15, var10));
         }
      }
   }

   @Generated
   public SliderSetting m_1090() {
      return this.f_732;
   }

   public void m_1091(Class_B6JOzHnwhU3pe4AO var1) {
      if (f_11537.gui.screen() == null && var1.m_2116() == 1 && var1.m_2117() == 295 && this.f_765 instanceof Class_FrHk789UOFu9WpSr var2 && var2.m_2680()) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_995);
      }
   }

   @Generated
   public float m_1093() {
      return this.f_782;
   }

   public void m_1094(Class_pYAz0kgoyIbaaR5n var1) {
      if (!this.f_721.m_7568(f_996)) {
         if (this.f_765 != null
            && this.f_765.m_7467() == Class_kkp256olqZ4F1qt3.HLSsfEOz1OozGlGI.MEDIUM
            && !this.f_721.m_7568(f_997)
            && !this.f_721.m_7568(f_998)) {
            this.m_1152();
         }
      } else {
         Class_U3Ilecg2NrGaJJQx var2 = DimasikClient.m_9057().m_9049().m_2813();
         if (this.f_765 != null
            && (this.f_765.m_7467() == Class_kkp256olqZ4F1qt3.HLSsfEOz1OozGlGI.FAST || this.f_765 == var2.m_5169())
            && this.m_1025(this.f_719.m_8768())) {
            this.m_1053();
         }
      }
   }

   @Generated
   public long m_1095() {
      return this.f_790;
   }

   @Generated
   public SliderSetting m_1096() {
      return this.f_723;
   }

   @Generated
   public ItemListSetting m_1097() {
      return this.f_738;
   }

   private void m_1098() {
      Class_U3Ilecg2NrGaJJQx var1 = DimasikClient.m_9057().m_9049().m_2813();
      Class_FghX3TD0v55wW2U2 var2 = DimasikClient.m_9057().m_9052().m_6342();
      Vector2f var3 = f_11537.player == null ? new Vector2f(var2.m_2654()) : new Vector2f(f_11537.player.getYRot(), f_11537.player.getXRot());
      var2.m_2663().set(var3);
      Class_9rb49jlyiwFNOlTd var4 = var1.m_5176();
      var1.m_5164(var4);
      var2.m_2662(var4);
      var2.m_2654().set(var3);
      var4.m_1801();
      if (f_11537.player != null) {
         f_11537.player.setYRot(var3.x);
         f_11537.player.setXRot(var3.y);
      }
   }

   @Generated
   public long m_1099() {
      return this.f_776;
   }

   @Generated
   public void m_1100(long var1) {
      this.f_777 = var1;
   }

   @Generated
   public void m_1101(boolean var1) {
      this.f_791 = var1;
   }

   @Override
   public void m_791(JsonObject var1) {
      super.m_791(var1);
      if (f_980.equals(this.f_742.m_7566())) {
         this.f_742.m_1766(f_981);
         this.f_746.m_1766(f_982);
      }
   }

   @Generated
   public MultiChoiceSetting m_1102() {
      return this.f_724;
   }

   @Generated
   public SliderSetting m_1103() {
      return this.f_737;
   }

   @Generated
   public float m_1104() {
      return this.f_780;
   }

   @Generated
   public CheckboxSetting m_1105() {
      return this.f_743;
   }

   public void m_1106(Class_Xu9btcIeUN33XnMK.Class_07sbU45IoaK910B1 var1) {
      if (DimasikClient.m_9057().m_9049().m_2801().m_3548().m_5013()) {
         this.m_1163();
      }
   }

   @Generated
   public float m_1107() {
      return this.f_783;
   }

   @Generated
   public CheckboxSetting m_1108() {
      return this.f_760;
   }

   @Generated
   public SliderSetting m_1109() {
      return this.f_727;
   }

   @Generated
   public SliderSetting m_1110() {
      return this.f_745;
   }

   public boolean m_1111() {
      return this.f_766 != null
         && this.m_1075()
         && Class_KezuRebad8hkzRXp.m_3380(
            this.f_766, this.f_738.m_7145(f_1035), this.f_738.m_7145(f_1036), false, true, this.f_719.m_8768(), this.m_1140(), this.f_738.m_7145(f_1037)
         );
   }

   @Generated
   public void m_1112(ItemListSetting var1) {
      this.f_738 = var1;
   }

   private void m_1113() {
      if (this.f_766 != null && f_11537.gui.screen() == null) {
         Vec3 var1 = this.m_1133(this.f_766);
         float var2 = (float)Mth.wrapDegrees(Math.toDegrees(Math.atan2(var1.z, var1.x)) - f_1066);
         float var3 = (float)(-Math.toDegrees(Math.atan2(var1.y, Math.hypot(var1.x, var1.z))));
         float var4 = Mth.wrapDegrees(var2 - f_11537.player.getYRot());
         float var5 = Mth.wrapDegrees(var3 - f_11537.player.getXRot());
         if ((float)Math.hypot(var4, var5) > this.f_727.m_8768()) {
            this.f_776 = System.nanoTime();
         } else {
            long var6 = System.nanoTime();
            float var8 = this.f_776 == 0L ? 0.0F : (float)(var6 - this.f_776) / f_1067;
            this.f_776 = var6;
            var8 = Mth.clamp(var8, 0.0F, f_1068);
            if (!(var8 <= 0.0F)) {
               if (this.f_732.m_8768() > 0.0F) {
                  var4 += Class_3VHxwfI2NZKoxzIi.m_1302(-this.f_732.m_8768(), this.f_732.m_8768());
               }

               if (this.f_733.m_8768() > 0.0F) {
                  var5 += Class_3VHxwfI2NZKoxzIi.m_1302(-this.f_733.m_8768(), this.f_733.m_8768());
               }

               float var9 = this.f_726.m_8768() * this.f_728.m_8768();
               float var10 = var9 * this.f_729.m_8768();
               float var11 = this.f_730.m_8768();
               float var12 = Mth.clamp(var4 * var11, -var9, var9);
               float var13 = Mth.clamp(var5 * var11, -var10, var10);
               float var14 = this.f_731.m_8768();
               f_11537.player.turn(var12 * var8 / var14, var13 * var8 / var14);
            }
         }
      } else {
         this.f_776 = System.nanoTime();
      }
   }

   @Generated
   public LivingEntity m_1114() {
      return this.f_766;
   }

   @Generated
   public MultiChoiceSetting m_1115() {
      return this.f_721;
   }

   @Generated
   public boolean m_1116() {
      return this.f_791;
   }

   private Vec3 m_1118(LivingEntity var1) {
      Vec3 var2 = f_11537.player.getEyePosition();
      AABB var3 = var1.getBoundingBox();
      double var4 = Mth.clamp(var2.x, var3.minX, var3.maxX);
      double var6 = Mth.clamp(var2.z, var3.minZ, var3.maxZ);
      double var8 = var3.minY + (var3.maxY - var3.minY) * f_1090;
      return new Vec3(var4, var8, var6).subtract(var2);
   }

   @Generated
   public int m_1119() {
      return this.f_775;
   }

   @Generated
   public SliderSetting m_1120() {
      return this.f_719;
   }

   private void m_1122(Class_TZhU50s8XmBQCMP5 var1) {
      this.m_1009();
      Class_oV1nLcU0paHSE9Oj.m_7905(this.f_762.m_8768(), this.f_763.m_8768());
      Class_oV1nLcU0paHSE9Oj.m_7919(this.f_760.m_8768(), this.f_761.m_8768());
      Class_oV1nLcU0paHSE9Oj.m_7889(this.f_743.m_8768(), this.f_744.m_8768(), this.f_745.m_8768().intValue());
      Class_oV1nLcU0paHSE9Oj.m_7921(
         this.f_754.m_8768(),
         this.f_746.m_7564().m_1181(),
         this.f_755.m_8768().intValue(),
         this.f_756.m_8768(),
         this.f_748.m_7564().m_1181(),
         this.f_749.m_7564().m_1181(),
         this.f_750.m_8768(),
         this.f_751.m_7564().m_1181(),
         this.f_752.m_8768(),
         this.f_753.m_8768(),
         this.f_747.m_7564().m_1181()
      );
      int var2 = this.f_757.m_8768() ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : this.f_758.m_8768();
      int var3 = this.f_757.m_8768() ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN_TWO) : this.f_759.m_8768();
      Class_oV1nLcU0paHSE9Oj.m_7914(var1, this.f_766, this.f_742.m_7564().m_1181(), var2, var3);
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_mRcJJZJYG5cvDAlU> m_1124() {
      return this.f_768;
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_Xsbjx1SxvnHy6q8B> m_1125() {
      return this.f_793;
   }

   @Generated
   public Aura.YDpJTAQ9lTQkTB5d m_1126() {
      return this.f_764;
   }

   @Generated
   public SliderSetting m_1127() {
      return this.f_729;
   }

   public boolean m_1128() {
      if (!this.m_776() || !this.f_741.m_8768() || this.f_766 == null || f_11537.player == null) {
         return false;
      } else {
         return this.f_721.m_7568(f_967) && !this.m_1075() ? false : !DimasikClient.m_9057().m_9049().m_2801().m_3460().m_776();
      }
   }

   private void m_1130(Vec3 var1) {
      if (f_11537.player != null && this.f_766 != null && var1 != null) {
         double var2 = var1.x;
         double var4 = var1.z;
         double[] var6 = this.m_1011(var2, var4);
         f_11537.player.setDeltaMovement(var6[0], f_11537.player.getDeltaMovement().y, var6[1]);
      }
   }

   @Generated
   public void m_1131(float var1) {
      this.f_785 = var1;
   }

   @Generated
   public float m_1132() {
      return this.f_788;
   }

   private Vec3 m_1133(LivingEntity var1) {
      Vec3 var2 = f_11537.player.getEyePosition();
      AABB var3 = var1.getBoundingBox();
      if (this.f_734.m_7568(f_1091)) {
         return var3.getCenter().subtract(var2);
      } else if (this.f_734.m_7568(f_1092)) {
         Vec3 var16 = new Vec3((var3.minX + var3.maxX) * f_1093, var3.maxY - var1.getEyeHeight(var1.getPose()) * f_1094, (var3.minZ + var3.maxZ) * f_1095);
         return var16.subtract(var2);
      } else if (this.f_734.m_7568(f_1096)) {
         double var15 = Mth.clamp(var2.x, var3.minX, var3.maxX);
         double var17 = Mth.clamp(var2.y, var3.minY, var3.maxY);
         double var18 = Mth.clamp(var2.z, var3.minZ, var3.maxZ);
         return new Vec3(var15, var17, var18).subtract(var2);
      } else {
         double var4 = Mth.clamp(var2.x, var3.minX, var3.maxX);
         double var6 = Mth.clamp(var2.z, var3.minZ, var3.maxZ);
         Vec3 var8 = f_11537.player.getViewVector(1.0F);
         double var9 = Math.hypot(var4 - var2.x, var6 - var2.z);
         double var11 = Math.hypot(var8.x, var8.z);
         double var13 = var11 > f_1097 ? var2.y + var8.y * (var9 / var11) : var3.minY + (var3.maxY - var3.minY) * f_1098;
         var13 = Mth.clamp(var13, var3.minY, var3.maxY);
         return new Vec3(var4, var13, var6).subtract(var2);
      }
   }

   @Generated
   public CheckboxSetting m_1134() {
      return this.f_757;
   }

   @Generated
   public MultiChoiceSetting m_1135() {
      return this.f_751;
   }

   @Generated
   public void m_1136(long var1) {
      this.f_776 = var1;
   }

   private void m_1137() {
      if (!this.f_721.m_7568(f_1006) && this.f_765 == this.f_764) {
         this.m_1158();
         this.f_765 = null;
      }

      Class_U3Ilecg2NrGaJJQx var1 = DimasikClient.m_9057().m_9049().m_2813();
      if (!this.f_721.m_7568(f_1007) && (this.f_765 == var1.m_5176() || var1.m_5180() == var1.m_5176())) {
         this.m_1098();
         this.f_765 = null;
      }

      if (!this.f_721.m_7568(f_1008) && (this.f_765 == var1.m_5160() || var1.m_5180() == var1.m_5160())) {
         var1.m_5160().m_1801();
         if (var1.m_5180() == var1.m_5160()) {
            var1.m_5162(null);
         }

         this.f_765 = null;
      }

      if (this.f_721.m_7568(f_1009)) {
         this.f_765 = var1.m_5160();
      } else if ((this.f_721.m_7568(f_1010) || this.f_721.m_7568(f_1011)) && !f_11537.player.isFallFlying()) {
         this.f_765 = DimasikClient.m_9057().m_9049().m_2813().m_5178();
      } else if (this.f_721.m_7568(f_1012)) {
         this.f_765 = DimasikClient.m_9057().m_9049().m_2813().m_5176();
      } else if (this.f_721.m_7568(f_1013)) {
         this.f_765 = DimasikClient.m_9057().m_9049().m_2813().m_5170();
      } else if (this.f_721.m_7568(f_1014)) {
         this.f_765 = DimasikClient.m_9057().m_9049().m_2813().m_5163();
      } else if (this.f_721.m_7568(f_1015)) {
         this.f_765 = DimasikClient.m_9057().m_9049().m_2813().m_5171();
      } else if ((this.f_721.m_7568(f_1016) || this.f_721.m_7568(f_1017)) && f_11537.player.isFallFlying()) {
         this.f_765 = DimasikClient.m_9057().m_9049().m_2813().m_5169();
      } else if (this.f_721.m_7568(f_1018)) {
         this.f_765 = DimasikClient.m_9057().m_9049().m_2813().m_5165();
      }
   }

   @Generated
   public MultiChoiceSetting m_1138() {
      return this.f_747;
   }

   @Generated
   public void m_1139(float var1) {
      this.f_780 = var1;
   }

   private boolean m_1140() {
      ElytraTarget var1 = DimasikClient.m_9057().m_9049().m_2801().m_3574();
      return this.f_738.m_7145(f_1041) && (!var1.m_776() || f_11537.player == null || !f_11537.player.isFallFlying());
   }

   @Generated
   public CheckboxSetting m_1141() {
      return this.f_752;
   }

   @Generated
   public void m_1142(float var1) {
      this.f_786 = var1;
   }

   public void m_1143(Class_mRcJJZJYG5cvDAlU var1) {
      if (!this.f_767) {
         Class_kkp256olqZ4F1qt3 var2 = DimasikClient.m_9057().m_9049().m_2813().m_5180();
         if (var2 == null || !var2.m_7468()) {
            if (this.f_721.m_7568(f_1002) && this.f_739.m_7568(f_1003) && this.f_766 != null) {
               this.m_1045(var1);
            } else if (this.f_739.m_7568(f_1004)) {
               Class_QBKwWNWLlChWViO9.m_4255(var1);
            } else if (this.f_739.m_7568(f_1005) && this.f_766 != null) {
               Vec3 var3 = f_11537.player.getEyePosition();
               Vec3 var4 = this.f_766.position().add(0.0, this.f_766.getBbHeight() / 2.0F, 0.0);
               Vec3 var5 = var4.subtract(var3).normalize();
               float var6 = (float)Math.toDegrees(Math.atan2(-var5.x, var5.z));
               Class_QBKwWNWLlChWViO9.m_4265(var1, var6);
            }
         }
      }
   }

   @Generated
   public SliderSetting m_1144() {
      return this.f_730;
   }

   @Generated
   public ItemListSetting m_1146() {
      return this.f_740;
   }

   @Generated
   public float m_1147() {
      return this.f_786;
   }

   @Generated
   public Class_kkp256olqZ4F1qt3 m_1148() {
      return this.f_765;
   }

   public int m_1149(int var1) {
      if (this.f_766 != null && var1 >= 0 && this.m_1075()) {
         ElytraTarget var2 = DimasikClient.m_9057().m_9049().m_2801().m_3574();
         float var3 = f_11537.player.isFallFlying()
               && var2.m_776()
               && this.f_766.isFallFlying()
               && Class_3VHxwfI2NZKoxzIi.m_1306(this.f_766) > var2.m_5076().m_8768().floatValue()
               && var2.m_5086().m_8768()
            ? var2.m_5090().m_8768()
            : this.f_719.m_8768();
         return Class_KezuRebad8hkzRXp.m_3381(this.f_766, this.f_738.m_7145(f_1032), this.f_738.m_7145(f_1033), true, var3, this.f_738.m_7145(f_1034), var1);
      } else {
         return -1;
      }
   }

   private void m_1152() {
      if (this.f_765 != null && this.f_766 != null && !this.f_767) {
         ElytraTarget var1 = DimasikClient.m_9057().m_9049().m_2801().m_3574();
         this.f_765
            .m_7466(
               var1.m_5099(this.f_766, this.f_766.position().add(0.0, this.f_766.getBbHeight() / 2.0F + (f_11537.player.isFallFlying() ? f_1064 : 0.0F), 0.0))
            );
         DimasikClient.m_9057().m_9049().m_2813().m_5162(this.f_765);
      }
   }

   public void m_1154(Class_Xu9btcIeUN33XnMK var1) {
      if (this.f_721.m_7568(f_983)) {
         this.m_1057();
      }

      if (this.f_766 == null) {
         this.m_1014();
         this.m_1071();
      } else if (this.f_767) {
         this.m_1071();
         if (!DimasikClient.m_9057().m_9049().m_2801().m_3548().m_5013()) {
            this.m_1163();
         }
      } else {
         this.m_1137();
         if (this.f_765 != null) {
            float var2 = this.f_719.m_8768();
            if (DimasikClient.m_9057().m_9049().m_2801().m_3590().m_776() || DimasikClient.m_9057().m_9049().m_2801().m_3460().m_776()) {
               var2 = f_984;
            }

            boolean var3 = !this.f_721.m_7568(f_985) || this.m_1025(var2);
            if (this.f_721.m_7568(f_986)) {
               this.m_1071();
               this.f_765 = null;
            } else if (this.f_721.m_7568(f_987)) {
               this.f_765 = this.f_764;
            } else if (this.f_765.m_7467() == Class_kkp256olqZ4F1qt3.HLSsfEOz1OozGlGI.SLOW && !this.f_721.m_7568(f_988) && !this.f_721.m_7568(f_989) && var3) {
               this.m_1152();
            }

            if (this.f_721.m_7568(f_990) && !f_11537.player.isFallFlying()) {
               if (Class_KezuRebad8hkzRXp.m_3380(
                  this.f_766, this.f_738.m_7145(f_991), this.f_738.m_7145(f_992), false, true, var2, this.m_1140(), this.f_738.m_7145(f_993)
               )) {
                  this.f_775 = this.f_737.m_8768().intValue();
               }

               if (this.f_775 > 0) {
                  this.m_1152();
                  this.f_775--;
               } else {
                  this.m_1071();
               }
            }
         }

         if (!DimasikClient.m_9057().m_9049().m_2801().m_3548().m_5013()) {
            this.m_1163();
         }
      }
   }

   @Generated
   public void m_1155(float var1) {
      this.f_788 = var1;
   }

   private void m_1158() {
      Class_U3Ilecg2NrGaJJQx var1 = DimasikClient.m_9057().m_9049().m_2813();
      Class_FghX3TD0v55wW2U2 var2 = DimasikClient.m_9057().m_9052().m_6342();
      Vector2f var3 = f_11537.player == null ? new Vector2f(var2.m_2654()) : new Vector2f(f_11537.player.getYRot(), f_11537.player.getXRot());
      var2.m_2663().set(var3);
      var1.m_5164(this.f_764);
      var2.m_2662(this.f_764);
      var2.m_2654().set(var3);
      if (f_11537.player != null) {
         f_11537.player.setYRot(var3.x);
         f_11537.player.setXRot(var3.y);
      }
   }

   @Generated
   public SliderSetting m_1159() {
      return this.f_736;
   }

   @Generated
   public MultiChoiceSetting m_1161() {
      return this.f_734;
   }

   @Generated
   public void m_1162(Class_kkp256olqZ4F1qt3 var1) {
      this.f_765 = var1;
   }

   private void m_1163() {
      if (!DimasikClient.m_9057().m_9049().m_2801().m_3544().m_5580()) {
         if (!this.m_1075()) {
            this.f_791 = false;
         } else {
            ElytraTarget var1 = DimasikClient.m_9057().m_9049().m_2801().m_3574();
            float var2 = f_11537.player.isFallFlying()
                  && var1.m_776()
                  && this.f_766.isFallFlying()
                  && Class_3VHxwfI2NZKoxzIi.m_1306(this.f_766) > var1.m_5076().m_8768().floatValue()
                  && var1.m_5086().m_8768()
               ? var1.m_5090().m_8768()
               : this.f_719.m_8768();
            boolean var3 = f_11537.player.getMainHandItem().is(Items.MACE);
            if (!f_11537.player.isUsingItem() || f_11537.player.isBlocking() || !this.f_738.m_7145(f_1019)) {
               this.f_791 = Class_KezuRebad8hkzRXp.m_3380(
                  this.f_766, this.f_738.m_7145(f_1020), this.f_738.m_7145(f_1021), true, true, var2, this.m_1140(), this.f_738.m_7145(f_1022)
               );
               if (this.f_791) {
                  this.m_1088();
                  if (this.f_738.m_7145(f_1023) && f_11537.player.isBlocking()) {
                     f_11537.player.releaseUsingItem();
                  }

                  Vec3 var4 = f_11537.player.getDeltaMovement();
                  f_11537.gameMode.attack(f_11537.player, this.f_766);
                  f_11537.player.swing(InteractionHand.MAIN_HAND);
                  if ((this.f_721.m_7568(f_1024) || this.f_721.m_7568(f_1025))
                     && DimasikClient.m_9057().m_9049().m_2801().m_3552().m_776()
                     && !f_11537.player.isFallFlying()) {
                     this.m_1130(var4);
                  }

                  if (this.f_738.m_7145(f_1026)) {
                     this.m_1168();
                  }

                  if (this.f_721.m_7568(f_1027)) {
                     DimasikClient.m_9057().m_9049().m_2813().m_5176().m_2033();
                  }
               }
            }
         }
      }
   }

   @Generated
   public SliderSetting m_1164() {
      return this.f_754;
   }

   @Generated
   public MultiChoiceSetting m_1165() {
      return this.f_746;
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_pYAz0kgoyIbaaR5n> m_1166() {
      return this.f_773;
   }

   private void m_1168() {
      int var1 = Class_h78PE30BIJJYoUEk.m_7079();
      if (this.f_766.getUseItem().getItem() == Items.SHIELD && var1 != -1) {
         if (var1 < 9) {
            f_11537.getConnection().send(new ServerboundSetCarriedItemPacket(var1));
            f_11537.gameMode.attack(f_11537.player, this.f_766);
            f_11537.player.swing(InteractionHand.MAIN_HAND);
            f_11537.getConnection().send(new ServerboundSetCarriedItemPacket(f_11537.player.getInventory().selected));
         } else {
            f_11537.gameMode
               .handleContainerInput(
                  f_11537.player.inventoryMenu.containerId, var1, f_11537.player.getInventory().selected, ContainerInput.SWAP, f_11537.player
               );
            f_11537.gameMode.attack(f_11537.player, this.f_766);
            f_11537.player.swing(InteractionHand.MAIN_HAND);
            f_11537.gameMode
               .handleContainerInput(
                  f_11537.player.inventoryMenu.containerId, var1, f_11537.player.getInventory().selected, ContainerInput.SWAP, f_11537.player
               );
         }
      }
   }

   @Generated
   public CheckboxSetting m_1170() {
      return this.f_753;
   }

   @Generated
   public int m_1173() {
      return this.f_778;
   }

   public void m_1174(Class_ETHFYgDAWb9l6f3g var1) {
      if (!this.f_721.m_7568(f_999)) {
         this.m_1057();
         if (this.f_765 != null
            && this.f_765.m_7467() == Class_kkp256olqZ4F1qt3.HLSsfEOz1OozGlGI.FAST
            && !this.f_721.m_7568(f_1000)
            && !this.f_721.m_7568(f_1001)) {
            this.m_1152();
         }
      }
   }

   public void m_1175(Class_Xsbjx1SxvnHy6q8B var1) {
      if (this.m_1027() && !this.f_791) {
         Vector2f var10000 = var1.m_5615();
         var10000.x = var10000.x + f_994;
      }
   }

   private static final class YDpJTAQ9lTQkTB5d extends Class_kkp256olqZ4F1qt3 {
      public final Vector2f f_718 = new Vector2f();

      public YDpJTAQ9lTQkTB5d() {
         super(Vec3.ZERO);
      }

      public void m_1005(float var1, float var2) {
         this.f_718.set(var1, var2);
      }

      @Override
      public Vector2f m_1006(Vector2f var1, Vector2f var2) {
         return new Vector2f(var2);
      }

      @Override
      public Vector2f m_1007() {
         return new Vector2f(this.f_718);
      }
   }
}
