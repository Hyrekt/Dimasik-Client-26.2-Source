package dev.dimasik.client.module.render;

import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.IndexType;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.pipeline.TextureTarget;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.platform.NativeImage;
import com.mojang.blaze3d.shaders.UniformType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.AutoStorageIndexBuffer;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.MeshData;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.MeshData.DrawState;
import com.mojang.math.Axis;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ColorSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_8eJhbT3fP9R0tMrZ;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_HV2MJjonZTp2hb9E;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_NzJrN63M7QBpmAbi;
import dev.dimasik.client.system.Class_PoKta0VE7AdhY1En;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_rG6KJzJWXQjNHCHC;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.awt.Color;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.Map.Entry;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;

public class Trails extends Module {
   private static final Identifier f_19855 = Identifier.fromNamespaceAndPath(Trails.f_20255, Trails.f_20256);
   private static final Identifier f_19856 = Identifier.fromNamespaceAndPath(Trails.f_20257, Trails.f_20258);
   private static final Identifier f_19857 = Identifier.fromNamespaceAndPath(Trails.f_20259, Trails.f_20260);
   private static final int[] f_19858 = new int[]{11, 23, 32, 16, 32};
   private static final int f_19859 = 160;
   private static final int f_19860 = 220;
   private static final double f_19861 = 0.12;
   private final MultiChoiceSetting f_19862;
   private final SliderSetting f_19863;
   private final SliderSetting f_19864;
   private final SliderSetting f_19865;
   private final CheckboxSetting f_19866;
   private final ColorSetting f_19867;
   private final CheckboxSetting f_19868;
   private final CheckboxSetting f_19869;
   private final CheckboxSetting f_19870;
   private final CheckboxSetting f_19871;
   private final MultiChoiceSetting f_19872;
   private final ColorSetting f_19873;
   private final SliderSetting f_19874;
   private final CheckboxSetting f_19875;
   private final CheckboxSetting f_19876;
   private final CheckboxSetting f_19877;
   private final CheckboxSetting f_19878;
   private final SliderSetting f_19879;
   private final MultiChoiceSetting f_19880;
   private final SliderSetting f_19881;
   private final SliderSetting f_19882;
   private final CheckboxSetting f_19883;
   private final ColorSetting f_19884;
   private final ColorSetting f_19885;
   private final ColorSetting f_19886;
   private final SliderSetting f_19887;
   private final SliderSetting f_19888;
   private final SliderSetting f_19889;
   private final Class_HV2MJjonZTp2hb9E f_19890;
   private ClientLevel f_19891;
   private static final Identifier f_19892 = Class_wHRRCm2tlLY7DN4I.m_9311(Trails.f_20261);
   private final RenderPipeline f_19893;
   private final List<Trails.oJj2HqDwZQ01gcY5> f_19894;
   private final List<Trails.ORcHdDpjfTPMbngF> f_19895;
   private final Map<Integer, Vec3> f_19896;
   private final List<Trails.t5bTcAeukGu2cUSl> f_19897;
   private final List<List<Trails.t5bTcAeukGu2cUSl>> f_19898;
   private final List<Trails.PPyg3nrQoqpsQVSY> f_19899;
   private final Random f_19900;
   private boolean f_19901;
   private long f_19902;
   private TextureTarget f_19903;
   private final RenderPipeline f_19904;
   private final RenderPipeline f_19905;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_19906;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_19907;
   private Vec3 f_19908;
   private ClientLevel f_19909;
   private static final String f_19910 = "Trails";
   private static final String f_19911 = "Шлейф рывка";
   private static final String f_19912 = "Режим";
   private static final String f_19913 = "Дима";
   private static final String f_19914 = "Рывок";
   private static final String f_19915 = "Энергия";
   private static final String f_19916 = "Призраки";
   private static final String f_19917 = "Время жизни";
   private static final float f_19918 = 1.1F;
   private static final float f_19919 = 0.35F;
   private static final float f_19920 = 2.5F;
   private static final float f_19921 = 0.05F;
   private static final String f_19922 = "Плотность";
   private static final float f_19923 = 12.0F;
   private static final float f_19924 = 4.0F;
   private static final float f_19925 = 20.0F;
   private static final float f_19926 = 0.5F;
   private static final String f_19927 = "Масштаб";
   private static final float f_19928 = 0.55F;
   private static final float f_19929 = 1.8F;
   private static final float f_19930 = 0.05F;
   private static final String f_19931 = "Цвет темы";
   private static final String f_19932 = "Цвет";
   private static final int f_19933 = -2342913;
   private static final String f_19934 = "Себе";
   private static final String f_19935 = "В первом лице";
   private static final String f_19936 = "Игроки";
   private static final String f_19937 = "Друзья";
   private static final String f_19938 = "Режим цвета";
   private static final String f_19939 = "Случайная палитра";
   private static final String f_19940 = "Свой";
   private static final String f_19941 = "Клиент";
   private static final String f_19942 = "Радуга";
   private static final String f_19943 = "Выбранный цвет";
   private static final double f_19944 = 255.0;
   private static final String f_19945 = "Максимальная дистанция";
   private static final float f_19946 = 25.0F;
   private static final float f_19947 = 15.0F;
   private static final float f_19948 = 100.0F;
   private static final String f_19949 = "Сглаживание движения";
   private static final String f_19950 = "Сегменты";
   private static final String f_19951 = "Точки";
   private static final String f_19952 = "Освещение";
   private static final String f_19953 = "Длина следа";
   private static final float f_19954 = 0.75F;
   private static final float f_19955 = 0.5F;
   private static final float f_19956 = 1.5F;
   private static final float f_19957 = 0.05F;
   private static final String f_19958 = "Качество отрисовки";
   private static final String f_19959 = "Производительность";
   private static final String f_19960 = "Качество";
   private static final String f_19961 = "Максимальное качество";
   private static final String f_19962 = "Длина";
   private static final float f_19963 = 1.9F;
   private static final float f_19964 = 0.35F;
   private static final float f_19965 = 0.05F;
   private static final String f_19966 = "Ширина";
   private static final float f_19967 = 0.38F;
   private static final float f_19968 = 0.08F;
   private static final float f_19969 = 0.6F;
   private static final float f_19970 = 0.02F;
   private static final String f_19971 = "Авто цвет под тему";
   private static final String f_19972 = "Цвет 1";
   private static final int f_19973 = -2342913;
   private static final String f_19974 = "Цвет 2";
   private static final int f_19975 = -10709505;
   private static final String f_19976 = "Цвет 3";
   private static final int f_19977 = -44927;
   private static final String f_19978 = "Длина шлейфа";
   private static final float f_19979 = 25.0F;
   private static final float f_19980 = 10.0F;
   private static final float f_19981 = 50.0F;
   private static final String f_19982 = "Размер частиц";
   private static final float f_19983 = 0.6F;
   private static final float f_19984 = 0.3F;
   private static final float f_19985 = 1.2F;
   private static final float f_19986 = 0.05F;
   private static final String f_19987 = "Скорость призраков";
   private static final float f_19988 = 3.0F;
   private static final float f_19989 = 10.0F;
   private static final float f_19990 = 0.5F;
   private static final String f_19991 = "dimasik/trails_ghosts";
   private static final long f_19992 = 1234567891L;
   private static final String f_19993 = "dimasik/dima_trails";
   private static final String f_19994 = "dead_chams";
   private static final String f_19995 = "dead_chams";
   private static final String f_19996 = "Sampler0";
   private static final String f_19997 = "dimasik/trails_ribbon";
   private static final String f_19998 = "trails_ribbon";
   private static final String f_19999 = "trails_ribbon";
   private static final String f_20000 = "TrailsStyle";
   private static final String f_20001 = "dimasik";
   private static final String f_20002 = "dimasik";
   private static final String f_20003 = "Призраки";
   private static final String f_20004 = "Рывок";
   private static final double f_20005 = 0.08;
   private static final double f_20006 = 0.08;
   private static final float f_20007 = 16.0F;
   private static final float f_20008 = 0.05F;
   private static final String f_20009 = "Производительность";
   private static final String f_20010 = "Максимальное качество";
   private static final float f_20011 = 0.3333333F;
   private static final float f_20012 = 5.0F;
   private static final String f_20013 = "Производительность";
   private static final String f_20014 = "Максимальное качество";
   private static final float f_20015 = 1.1F;
   private static final float f_20016 = 0.333333F;
   private static final float f_20017 = 0.035F;
   private static final String f_20018 = "Производительность";
   private static final String f_20019 = "Максимальное качество";
   private static final float f_20020 = 0.5F;
   private static final String f_20021 = "Свой";
   private static final String f_20022 = "Случайная палитра";
   private static final String f_20023 = "Радуга";
   private static final float f_20024 = 360.0F;
   private static final int f_20025 = -16777216;
   private static final long f_20026 = 1000L;
   private static final float f_20027 = 1000.0F;
   private static final float f_20028 = 0.8F;
   private static final int f_20029 = -16777216;
   private static final String f_20030 = "Призраки";
   private static final String f_20031 = "Рывок";
   private static final String f_20032 = "Энергия";
   private static final double f_20033 = 20.0;
   private static final double f_20034 = 2.0;
   private static final float f_20035 = 0.65F;
   private static final double f_20036 = 40.0;
   private static final float f_20037 = 0.6F;
   private static final float f_20038 = 1.25F;
   private static final double f_20039 = 0.8;
   private static final float f_20040 = 220.0F;
   private static final double f_20041 = 0.015;
   private static final double f_20042 = 0.5;
   private static final double f_20043 = 50.0;
   private static final double f_20044 = 360.0;
   private static final double f_20045 = 0.1;
   private static final double f_20046 = 1.7;
   private static final double f_20047 = 1.8;
   private static final double f_20048 = 1.7;
   private static final float f_20049 = 0.08F;
   private static final float f_20050 = 0.16F;
   private static final float f_20051 = 0.3F;
   private static final float f_20052 = 0.56F;
   private static final float f_20053 = 12.0F;
   private static final float f_20054 = 12.0F;
   private static final float f_20055 = 12.0F;
   private static final float f_20056 = 0.05F;
   private static final double f_20057 = 100.0;
   private static final double f_20058 = 360.0;
   private static final double f_20059 = 180.0;
   private static final double f_20060 = 360.0;
   private static final double f_20061 = 180.0;
   private static final float f_20062 = 0.25F;
   private static final float f_20063 = 0.05F;
   private static final float f_20064 = 0.033F;
   private static final float f_20065 = 0.1F;
   private static final float f_20066 = 0.45F;
   private static final float f_20067 = 0.033F;
   private static final float f_20068 = 0.1F;
   private static final float f_20069 = 0.15F;
   private static final float f_20070 = 1.75F;
   private static final float f_20071 = 1.75F;
   private static final float f_20072 = 0.21568628F;
   private static final float f_20073 = 6.0F;
   private static final float f_20074 = 4.0F;
   private static final float f_20075 = 0.43137255F;
   private static final float f_20076 = 0.8F;
   private static final float f_20077 = 0.02F;
   private static final float f_20078 = 255.0F;
   private static final float f_20079 = 255.0F;
   private static final float f_20080 = 1.33333F;
   private static final float f_20081 = 0.5F;
   private static final float f_20082 = 0.5F;
   private static final double f_20083 = 0.008;
   private static final long f_20084 = 8L;
   private static final long f_20085 = 16L;
   private static final double f_20086 = 0.0025;
   private static final float f_20087 = 1000.0F;
   private static final double f_20088 = 0.9;
   private static final double f_20089 = 1.0E-8;
   private static final long f_20090 = 1000000L;
   private static final float f_20091 = 0.001F;
   private static final float f_20092 = 0.5F;
   private static final float f_20093 = 1.1F;
   private static final float f_20094 = 3.0F;
   private static final float f_20095 = 3.0F;
   private static final float f_20096 = 0.35F;
   private static final float f_20097 = 1.9F;
   private static final float f_20098 = 0.06F;
   private static final float f_20099 = 0.94F;
   private static final float f_20100 = 0.024F;
   private static final float f_20101 = 0.06F;
   private static final double f_20102 = 1.0E-8;
   private static final float f_20103 = 1.7F;
   private static final float f_20104 = 0.35F;
   private static final float f_20105 = 1.4F;
   private static final float f_20106 = 1.2F;
   private static final float f_20107 = 1.1F;
   private static final float f_20108 = 0.7F;
   private static final float f_20109 = 1.7F;
   private static final float f_20110 = 0.58F;
   private static final float f_20111 = 1.05F;
   private static final double f_20112 = 0.5;
   private static final float f_20113 = 0.1F;
   private static final float f_20114 = 0.02F;
   private static final float f_20115 = 0.6F;
   private static final float f_20116 = 0.4F;
   private static final float f_20117 = (float) (Math.PI * 2);
   private static final float f_20118 = 2.65F;
   private static final float f_20119 = (float) (Math.PI * 2);
   private static final float f_20120 = 1.45F;
   private static final float f_20121 = 1.8F;
   private static final float f_20122 = (float) (Math.PI * 2);
   private static final float f_20123 = 0.72F;
   private static final float f_20124 = 0.46F;
   private static final float f_20125 = 0.14F;
   private static final float f_20126 = 0.42F;
   private static final float f_20127 = 0.68F;
   private static final float f_20128 = 0.08F;
   private static final double f_20129 = 1.0E-8;
   private static final float f_20130 = 0.28F;
   private static final float f_20131 = 0.72F;
   private static final float f_20132 = (float) (Math.PI * 2);
   private static final float f_20133 = 0.86F;
   private static final float f_20134 = 3.0F;
   private static final double f_20135 = 1.0E-8;
   private static final double f_20136 = 1.0E-8;
   private static final double f_20137 = 1.0E-6;
   private static final double f_20138 = 1.22;
   private static final double f_20139 = 0.5;
   private static final double f_20140 = 0.92;
   private static final double f_20141 = 1.0E-8;
   private static final double f_20142 = 0.2;
   private static final double f_20143 = 0.6;
   private static final double f_20144 = 0.2;
   private static final float f_20145 = 255.0F;
   private static final long f_20146 = 1000000L;
   private static final float f_20147 = 1000.0F;
   private static final float f_20148 = 0.5F;
   private static final float f_20149 = 1.1F;
   private static final float f_20150 = 3.0F;
   private static final float f_20151 = 0.7F;
   private static final float f_20152 = 2.6F;
   private static final float f_20153 = 0.5F;
   private static final float f_20154 = 3.0F;
   private static final float f_20155 = 0.35F;
   private static final float f_20156 = 1.9F;
   private static final float f_20157 = 4.0F;
   private static final String f_20158 = "TrailsStyle";
   private static final float f_20159 = 5.5F;
   private static final float f_20160 = 1.35F;
   private static final String f_20161 = "TrailsStyle";
   private static final String f_20162 = "trails-glow-mask";
   private static final float f_20163 = -1.0F;
   private static final float f_20164 = 0.02F;
   private static final float f_20165 = 255.0F;
   private static final float f_20166 = 0.2F;
   private static final float f_20167 = 1.05F;
   private static final float f_20168 = 0.12F;
   private static final float f_20169 = 0.28F;
   private static final double f_20170 = 1.55;
   private static final double f_20171 = 0.2;
   private static final double f_20172 = 1.15;
   private static final float f_20173 = 0.95F;
   private static final float f_20174 = 0.65F;
   private static final double f_20175 = 0.002;
   private static final double f_20176 = 0.004;
   private static final double f_20177 = 0.72;
   private static final double f_20178 = 0.72;
   private static final double f_20179 = 4.0;
   private static final double f_20180 = 0.12;
   private static final double f_20181 = -1.0;
   private static final double f_20182 = 1.0E-4;
   private static final float f_20183 = 0.15F;
   private static final double f_20184 = 0.06;
   private static final double f_20185 = 0.12;
   private static final double f_20186 = 12.0;
   private static final double f_20187 = 4.0;
   private static final double f_20188 = 0.2;
   private static final long f_20189 = 350L;
   private static final float f_20190 = 1000.0F;
   private static final double f_20191 = 8.0;
   private static final double f_20192 = 0.1;
   private static final double f_20193 = 0.7;
   private static final double f_20194 = 0.5;
   private static final double f_20195 = 0.22;
   private static final double f_20196 = 0.12;
   private static final double f_20197 = 0.14;
   private static final double f_20198 = 0.12;
   private static final double f_20199 = 0.5;
   private static final double f_20200 = 0.3;
   private static final double f_20201 = 0.5;
   private static final double f_20202 = 0.14;
   private static final double f_20203 = 1.0E-4;
   private static final float f_20204 = 0.42F;
   private static final float f_20205 = 0.14F;
   private static final float f_20206 = 0.08F;
   private static final float f_20207 = 0.9F;
   private static final float f_20208 = 0.1F;
   private static final double f_20209 = 0.5;
   private static final double f_20210 = 12.0;
   private static final String f_20211 = "Sampler0";
   private static final double f_20212 = 0.5;
   private static final double f_20213 = 0.5;
   private static final float f_20214 = 0.5F;
   private static final float f_20215 = -2.0F;
   private static final double f_20216 = 2.0;
   private static final float f_20217 = 360.0F;
   private static final float f_20218 = 180.0F;
   private static final float f_20219 = 360.0F;
   private static final String f_20220 = "trails";
   private static final String f_20221 = "trailsVertices";
   private static final String f_20222 = "trailsCore";
   private static final String f_20223 = "trailsGlowMask";
   private static final String f_20224 = "trailsStyleUniforms";
   private static final String f_20225 = "trailsRibbonVertices";
   private static final float f_20226 = 0.02F;
   private static final String f_20227 = "Призраки";
   private static final String f_20228 = "Призраки";
   private static final String f_20229 = "Призраки";
   private static final String f_20230 = "Энергия";
   private static final String f_20231 = "Энергия";
   private static final String f_20232 = "Энергия";
   private static final String f_20233 = "Энергия";
   private static final String f_20234 = "Энергия";
   private static final String f_20235 = "Энергия";
   private static final String f_20236 = "Рывок";
   private static final String f_20237 = "Рывок";
   private static final String f_20238 = "Рывок";
   private static final String f_20239 = "Рывок";
   private static final String f_20240 = "Рывок";
   private static final String f_20241 = "Рывок";
   private static final String f_20242 = "Рывок";
   private static final String f_20243 = "Рывок";
   private static final String f_20244 = "Свой";
   private static final String f_20245 = "Рывок";
   private static final String f_20246 = "Рывок";
   private static final String f_20247 = "Рывок";
   private static final String f_20248 = "Рывок";
   private static final String f_20249 = "Рывок";
   private static final String f_20250 = "Дима";
   private static final String f_20251 = "Дима";
   private static final String f_20252 = "Дима";
   private static final String f_20253 = "Дима";
   private static final String f_20254 = "Дима";
   private static final String f_20255 = "dimasik";
   private static final String f_20256 = "images/particles/bloom.png";
   private static final String f_20257 = "dimasik";
   private static final String f_20258 = "images/trails/waithporno.png";
   private static final String f_20259 = "dimasik";
   private static final String f_20260 = "images/dashtrail/dashbloomsample.png";
   private static final String f_20261 = "targetesp/glow";

   private void m_6549(Class_TZhU50s8XmBQCMP5 var1) {
      if (f_11537.options.getCameraType().isFirstPerson()) {
         this.m_6585();
      } else {
         long var2 = System.currentTimeMillis();
         float var4 = var1.m_5005().getGameTimeDeltaPartialTick(true);
         Vec3 var5 = new Vec3(
            Mth.lerp(var4, f_11537.player.xo, f_11537.player.getX()),
            Mth.lerp(var4, f_11537.player.yo, f_11537.player.getY()),
            Mth.lerp(var4, f_11537.player.zo, f_11537.player.getZ())
         );
         Vec3 var6 = f_11537.player.getDeltaMovement();
         double var7 = Math.sqrt(var6.x * var6.x + var6.z * var6.z);
         if (var7 > f_20083 && var2 - this.f_19902 >= f_20084) {
            if (!this.f_19899.isEmpty() && this.f_19899.getLast().position.distanceToSqr(var5) > 1.0) {
               this.f_19899.clear();
            }

            if (this.f_19899.isEmpty()) {
               this.f_19899.add(new Trails.PPyg3nrQoqpsQVSY(new Vec3(f_11537.player.xo, f_11537.player.yo, f_11537.player.zo), var2 - f_20085));
            }

            if (this.f_19899.getLast().position.distanceToSqr(var5) > f_20086) {
               this.f_19899.add(new Trails.PPyg3nrQoqpsQVSY(var5, var2));
               if (this.f_19899.size() > 220) {
                  this.f_19899.removeFirst();
               }
            } else {
               this.f_19899.set(this.f_19899.size() - 1, new Trails.PPyg3nrQoqpsQVSY(var5, var2));
            }

            this.f_19902 = var2;
         }

         long var9 = Math.round(this.f_19881.m_8768() * f_20087);
         this.f_19899.removeIf(var4x -> var2 - var4x.time > var9);
         if (this.f_19899.size() >= 2) {
            BufferBuilder var11 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.TRIANGLES, DefaultVertexFormat.POSITION_TEX_COLOR);
            Matrix4f var12 = var1.m_5006().last().pose();
            Vec3 var13 = f_11537.gameRenderer.mainCamera().position();
            int var14 = this.m_6607(var11, var12, var13, var2, var9);
            this.m_6610(var11, var14, var2);
         }
      }
   }

   private static void m_6551(BufferBuilder var0, Matrix4f var1, Vec3 var2, float var3, float var4, int var5) {
      Vector4f var6 = Class_BftdentXEtGbugJw.m_2298(var5);
      var0.addVertex(var1, (float)var2.x, (float)var2.y, (float)var2.z).setUv(var3, var4).setColor(var6.x, var6.y, var6.z, var6.w);
   }

   private static float m_6553(float var0, float var1) {
      float var2 = Math.abs(var0 - var1) % f_20217;
      return var2 > f_20218 ? f_20219 - var2 : var2;
   }

   private void m_6556(Class_Xu9btcIeUN33XnMK var1) {
      if (!this.f_19862.m_7568(f_20003)) {
         this.m_6560();
      }

      if (this.f_19862.m_7568(f_20004) && f_11537.player != null && f_11537.level != null) {
         this.m_6603();

         for (Player var3 : f_11537.level.players()) {
            if (this.m_6599(var3)) {
               Vec3 var4 = var3.position();
               Vec3 var5 = this.f_19896.get(var3.getId());
               this.f_19896.put(var3.getId(), var4);
               if (var5 != null) {
                  double var6 = var4.x - var5.x;
                  double var8 = var4.y - var5.y;
                  double var10 = var4.z - var5.z;
                  double var12 = Math.sqrt(var6 * var6 + var10 * var10);
                  if (!(var12 < f_20005)) {
                     float var14 = this.m_6600();
                     double var15 = Math.sqrt(var6 * var6 + var8 * var8 + var10 * var10);
                     int var17 = Mth.clamp((int)(var15 / f_20006 * var14), 1, (int)(f_20007 * var14));
                     boolean var18 = this.f_19876.m_8768() || this.f_19877.m_8768();

                     for (int var19 = 0; var19 < var17; var19++) {
                        float var20 = (float)var19 / var17;

                        while (this.f_19895.size() >= 220) {
                           this.f_19895.removeFirst();
                        }

                        this.f_19895.add(new Trails.ORcHdDpjfTPMbngF(var3, var5, var4, var20, this.m_6596(), var18));
                     }
                  }
               }
            }
         }

         this.f_19896.keySet().removeIf(var0 -> f_11537.level.getEntity(var0) == null);

         for (Trails.ORcHdDpjfTPMbngF var23 : this.f_19895) {
            if (var23.m_6529() >= 1.0F && var23.f_19794 != 0.0F) {
               var23.f_19794 = 0.0F;
            }
         }

         this.f_19895.removeIf(var0 -> var0.m_6529() >= 1.0F && var0.f_19794 == 0.0F && var0.f_19793 < f_20226);
         boolean var22 = this.f_19875.m_8768();
         Trails.ORcHdDpjfTPMbngF var24 = null;

         for (Trails.ORcHdDpjfTPMbngF var26 : this.f_19895) {
            if (var26.f_19793 > f_20008) {
               if (var24 != null) {
                  var24.m_6525(var22 ? var26 : null);
               }

               var24 = var26;
            }
         }

         if (var24 != null) {
            var24.m_6525(null);
         }
      }
   }

   private static int m_6557(float var0) {
      return Class_BftdentXEtGbugJw.m_2303(255, 255, 255, Math.round(f_20145 * Mth.clamp(var0, 0.0F, 1.0F)));
   }

   private void m_6560() {
      this.f_19890.m_2890();
      this.f_19891 = null;
   }

   @Override
   public void m_778() {
      this.m_6576();
      this.m_6603();
   }

   private Vec3[] m_6561(Vec3[] var1) {
      Vec3[] var2 = new Vec3[var1.length + 1];
      var2[0] = var1[0];
      var2[var2.length - 1] = var1[var1.length - 1];

      for (int var3 = 1; var3 < var2.length - 1; var3++) {
         Vec3 var4 = var1[var3 - 1].add(var1[var3]);
         if (var4.lengthSqr() < f_20137) {
            var2[var3] = var1[var3];
         } else {
            Vec3 var5 = var4.normalize();
            double var6 = Math.abs(var5.dot(var1[var3]));
            double var8 = Math.min(f_20138, 1.0 / Math.max(f_20139, var6));
            var2[var3] = var5.scale(var8);
         }
      }

      return var2;
   }

   private int m_6562(
      BufferBuilder var1,
      Matrix4f var2,
      Vec3 var3,
      Vec3 var4,
      Vec3 var5,
      Vec3 var6,
      double var7,
      double var9,
      double var11,
      int var13,
      int var14,
      int var15,
      int var16
   ) {
      double var17 = var9 * f_20212;
      double var19 = var11 * f_20213;
      Vec3 var21 = var3.add(var6.scale(var7));
      Vec3 var22 = var21.add(var4.scale(-var17)).add(var5.scale(var19));
      Vec3 var23 = var21.add(var4.scale(var17)).add(var5.scale(var19));
      Vec3 var24 = var21.add(var4.scale(var17)).add(var5.scale(-var19));
      Vec3 var25 = var21.add(var4.scale(-var17)).add(var5.scale(-var19));
      this.m_6564(var1, var2, var22, 0.0F, 0.0F, var13);
      this.m_6564(var1, var2, var23, 1.0F, 0.0F, var14);
      this.m_6564(var1, var2, var24, 1.0F, 1.0F, var15);
      this.m_6564(var1, var2, var25, 0.0F, 1.0F, var16);
      return 4;
   }

   private void m_6563(Class_TZhU50s8XmBQCMP5 var1) {
      if (f_11537.options.getCameraType().isFirstPerson()) {
         this.m_6560();
      } else {
         if (this.f_19891 != f_11537.level) {
            this.m_6560();
         }

         this.f_19891 = f_11537.level;
         int var2 = this.f_19887.m_8768().intValue() * 30;
         float var3 = var1.m_5005().getGameTimeDeltaPartialTick(true);
         double var4 = ((double)f_11537.level.getGameTime() + var3) / f_20033;
         Vec3 var6 = new Vec3(
            Mth.lerp(var3, f_11537.player.xo, f_11537.player.getX()),
            Mth.lerp(var3, f_11537.player.yo, f_11537.player.getY()),
            Mth.lerp(var3, f_11537.player.zo, f_11537.player.getZ())
         );
         this.f_19890.m_2891(var6, var4, var2);
         Class_HV2MJjonZTp2hb9E.DMX2EoiuFSpe34po var7 = this.f_19890.m_2892(var2);
         Camera var8 = f_11537.gameRenderer.mainCamera();
         Vec3 var9 = m_6588(new Vector3f(1.0F, 0.0F, 0.0F).rotate(var8.rotation()));
         Vec3 var10 = m_6588(new Vector3f(0.0F, 1.0F, 0.0F).rotate(var8.rotation()));
         Matrix4f var11 = var1.m_5006().last().pose();
         BufferBuilder var12 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
         int var13 = 0;
         double var14 = var4 * f_20034 * this.f_19889.m_8768().floatValue();
         float var16 = f_20035;
         int var17 = var7.points().size();
         float var18 = (float)Math.min(1.0, f_20036 / var7.length());
         float var19 = this.f_19888.m_8768() / f_20037 * f_20038;

         for (int var20 = 0; var20 < 3; var16 = -var16) {
            for (int var21 = 0; var21 < var17; var21++) {
               Class_HV2MJjonZTp2hb9E.jnaMQ9nFLbpv6JGN var22 = var7.points().get(var21);
               float var23 = (float)Mth.clamp((var4 - var22.time()) / f_20039, 0.0, 1.0);
               float var24 = 1.0F - var21 / (float)var7.length();
               float var25 = 1.0F - var23 * var23;
               int var26 = (int)(f_20040 * var24 * var25 * var18);
               if (var26 > 5) {
                  double var27 = var14 - var21 * f_20041;
                  double var29 = (Math.sin(var27) + 1.0) * f_20042;
                  double var31 = Math.toRadians(var20 * 90 + var27 * f_20043 % f_20044);
                  Vec3 var33 = var22.position()
                     .subtract(var8.position())
                     .add(Math.cos(var31) * var16, var20 % 2 == 0 ? f_20045 + f_20046 * var29 : f_20047 - f_20048 * var29, Math.sin(var31) * var16);
                  float var34 = (f_20049 + f_20050 * var24) * var25 * var19;
                  float var35 = (f_20051 + f_20052 * var24) * var25 * var19;
                  var33 = var33.add(-var34 / f_20053, -var34 / f_20054, 0.0).add(var9.scale(var34 / f_20055)).add(var10.scale(var34 / 2.0F));
                  int var36 = Math.round(var26 * f_20056);
                  var13 += this.m_6562(
                     var12,
                     var11,
                     var33,
                     var9,
                     var10,
                     Vec3.ZERO,
                     0.0,
                     var35,
                     var35,
                     this.m_6612(var21 * 2, var36, var4),
                     this.m_6612(var21 * 4, var36, var4),
                     this.m_6612(var21 * 8, var36, var4),
                     this.m_6612(var21 * 16, var36, var4)
                  );
                  var13 += this.m_6562(
                     var12,
                     var11,
                     var33,
                     var9,
                     var10,
                     Vec3.ZERO,
                     0.0,
                     var34,
                     var34,
                     this.m_6612(var21 * 2, var26, var4),
                     this.m_6612(var21 * 4, var26, var4),
                     this.m_6612(var21 * 8, var26, var4),
                     this.m_6612(var21 * 16, var26, var4)
                  );
               }
            }

            var20++;
         }

         this.m_6608(var12, f_19892, var13, this.f_19893);
      }
   }

   private void m_6564(BufferBuilder var1, Matrix4f var2, Vec3 var3, float var4, float var5, int var6) {
      Vector4f var7 = Class_BftdentXEtGbugJw.m_2298(var6);
      var1.addVertex(var2, (float)var3.x, (float)var3.y, (float)var3.z).setUv(var4, var5).setColor(var7.x, var7.y, var7.z, var7.w);
   }

   private float m_6566() {
      return switch (this.f_19880.m_7564().m_1181()) {
         case f_20013 -> f_20015;
         case f_20014 -> f_20016;
         default -> 1.0F;
      };
   }

   private Vec3[] m_6570(Vec3[] var1) {
      Vec3[] var2 = new Vec3[var1.length];
      Vec3 var3 = this.m_6623(this.m_6594(var1, 0));

      for (int var4 = 0; var4 < var1.length; var4++) {
         Vec3 var5 = this.m_6594(var1, var4);
         Vec3 var6 = var3.subtract(var5.scale(var3.dot(var5)));
         if (var6.lengthSqr() < f_20136) {
            var6 = this.m_6623(var5);
         }

         var6 = var6.normalize();
         if (var6.dot(var3) < 0.0) {
            var6 = var6.reverse();
         }

         var2[var4] = var6;
         var3 = var6;
      }

      return var2;
   }

   private void m_6572() {
      long var1 = System.currentTimeMillis();
      this.f_19894.removeIf(var2 -> var2.m_6532(var1));
   }

   private void m_6576() {
      this.m_6560();
      this.f_19894.clear();
      this.f_19895.clear();
      this.f_19896.clear();
      this.f_19908 = null;
      this.f_19909 = null;
      this.m_6585();
   }

   private float m_6577(Trails.PPyg3nrQoqpsQVSY var1, long var2, long var4) {
      return 1.0F - Mth.clamp((float)(var2 - var1.time) / (float)var4, 0.0F, 1.0F);
   }

   private void m_6578(Vec3 var1, Vec3 var2, Vec3 var3, float var4, double var5) {
      while (this.f_19894.size() >= 160) {
         this.f_19894.removeFirst();
      }

      ThreadLocalRandom var7 = ThreadLocalRandom.current();
      long var8 = Math.max(f_20189, (long)(this.f_19863.m_8768() * f_20190));
      float var10 = this.f_19865.m_8768();
      float var11 = Mth.clamp((float)(var5 * f_20191), 0.0F, 1.0F);
      int var12 = 2 + var7.nextInt(2);

      for (int var13 = 0; var13 < var12; var13++) {
         if (this.f_19894.size() >= 160) {
            this.f_19894.removeFirst();
         }

         double var14 = (var7.nextDouble() - f_20192) * var4 * f_20193;
         double var16 = (var7.nextDouble() - f_20194) * (f_20195 + var11 * f_20196);
         double var18 = var7.nextDouble() * (f_20197 + var11 * f_20198);
         Vec3 var20 = var1.add(0.0, var14, 0.0).add(var3.scale(var16)).add(var2.scale(var18));
         Vec3 var21 = var2.add(var3.scale((var7.nextDouble() - f_20199) * f_20200)).add(0.0, (var7.nextDouble() - f_20201) * f_20202, 0.0);
         var21 = var21.lengthSqr() < f_20203 ? var2 : var21.normalize();
         float var22 = var10 * (f_20204 + var7.nextFloat() * f_20205 + var11 * f_20206);
         float var23 = var22 * (f_20207 + var7.nextFloat() * f_20208);
         float var24 = (float)((var7.nextDouble() - f_20209) * f_20210);
         this.f_19894.add(new Trails.oJj2HqDwZQ01gcY5(var20, var21, var22, var23, var24, var8));
      }
   }

   private void m_6579(BufferBuilder var1, Identifier var2, int var3) {
      this.m_6608(var1, var2, var3, this.f_19904);
   }

   private static float m_6581(float var0) {
      var0 = Mth.clamp(var0, 0.0F, 1.0F);
      return var0 < f_20214 ? 2.0F * var0 * var0 : 1.0F - (float)Math.pow(f_20215 * var0 + 2.0F, f_20216) / 2.0F;
   }

   private int m_6582(BufferBuilder var1, PoseStack var2, double var3, double var5, double var7, float var9, float var10, float var11, float var12, int var13) {
      float var14 = var9 * f_20081;
      float var15 = var10 * f_20082;
      var2.pushPose();
      var2.translate(var3, var5, var7);
      var2.mulPose(Axis.YP.rotationDegrees(-var11));
      var2.mulPose(Axis.XP.rotationDegrees(var12));
      Matrix4f var16 = var2.last().pose();
      Vector4f var17 = Class_BftdentXEtGbugJw.m_2298(var13);
      var1.addVertex(var16, -var14, -var15, 0.0F).setUv(0.0F, 0.0F).setColor(var17.x, var17.y, var17.z, var17.w);
      var1.addVertex(var16, -var14, var15, 0.0F).setUv(0.0F, 1.0F).setColor(var17.x, var17.y, var17.z, var17.w);
      var1.addVertex(var16, var14, var15, 0.0F).setUv(1.0F, 1.0F).setColor(var17.x, var17.y, var17.z, var17.w);
      var1.addVertex(var16, var14, -var15, 0.0F).setUv(1.0F, 0.0F).setColor(var17.x, var17.y, var17.z, var17.w);
      var2.popPose();
      return 4;
   }

   private int m_6583() {
      return switch (this.f_19872.m_7564().m_1181()) {
         case f_20021 -> this.f_19873.m_8768();
         case f_20022 -> Color.getHSBColor(this.f_19900.nextInt(361) / f_20024, 1.0F, 1.0F).getRGB() | f_20025;
         case f_20023 -> Color.getHSBColor((float)(System.currentTimeMillis() % f_20026) / f_20027, f_20028, 1.0F).getRGB() | f_20029;
         default -> Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
      };
   }

   private void m_6585() {
      this.f_19899.clear();
      this.f_19902 = 0L;
   }

   private static Vec3 m_6588(Vector3f var0) {
      return new Vec3(var0.x(), var0.y(), var0.z());
   }

   private int m_6589(int var1, float var2) {
      var2 = Mth.clamp(var2, 0.0F, 1.0F);
      return Class_BftdentXEtGbugJw.m_2303(
         (int)(Class_BftdentXEtGbugJw.m_2309(var1) * var2),
         (int)(Class_BftdentXEtGbugJw.m_2299(var1) * var2),
         (int)(Class_BftdentXEtGbugJw.m_2308(var1) * var2),
         Class_BftdentXEtGbugJw.m_2297(var1)
      );
   }

   private void m_6590(Class_TZhU50s8XmBQCMP5 var1) {
      if (!f_11537.options.getCameraType().isFirstPerson()) {
         float var2 = var1.m_5005().getGameTimeDeltaPartialTick(true);
         Vec3 var3 = new Vec3(
            Mth.lerp(var2, f_11537.player.xo, f_11537.player.getX()),
            Mth.lerp(var2, f_11537.player.yo, f_11537.player.getY()),
            Mth.lerp(var2, f_11537.player.zo, f_11537.player.getZ())
         );
         this.m_6615(var3);
         this.m_6572();
         if (!this.f_19894.isEmpty()) {
            Camera var4 = f_11537.gameRenderer.mainCamera();
            Vec3 var5 = var4.position();
            Vec3 var6 = m_6588(new Vector3f(0.0F, 1.0F, 0.0F).rotate(var4.rotation())).normalize();
            Vec3 var7 = m_6588(new Vector3f(f_20163, 0.0F, 0.0F).rotate(var4.rotation())).normalize();
            Vec3 var8 = m_6588(new Vector3f(0.0F, 0.0F, 1.0F).rotate(var4.rotation())).normalize();
            Matrix4f var9 = var1.m_5006().last().pose();
            int var10 = this.f_19866.m_8768() ? Class_BftdentXEtGbugJw.m_2304(0) : this.f_19867.m_8768();
            int var11 = Class_BftdentXEtGbugJw.m_2309(var10);
            int var12 = Class_BftdentXEtGbugJw.m_2299(var10);
            int var13 = Class_BftdentXEtGbugJw.m_2308(var10);
            long var14 = System.currentTimeMillis();
            this.m_6611(var9, var5, var7, var6, var8, var14, var11, var12, var13, true);
            this.m_6611(var9, var5, var7, var6, var8, var14, var11, var12, var13, false);
         }
      }
   }

   private Vec3 m_6594(Vec3[] var1, int var2) {
      Vec3 var3 = var1[Math.max(0, var2 - 1)];
      Vec3 var4 = var1[Math.min(var1.length - 1, var2 + 1)];
      Vec3 var5 = var4.subtract(var3);
      return var5.lengthSqr() < f_20135 ? new Vec3(0.0, 0.0, 1.0) : var5.normalize();
   }

   private void m_6595(Class_TZhU50s8XmBQCMP5 var1) {
      this.m_6603();
      if (!this.f_19895.isEmpty()) {
         float var2 = var1.m_5005().getGameTimeDeltaPartialTick(true);
         Camera var3 = f_11537.gameRenderer.mainCamera();
         Vec3 var4 = var3.position();
         PoseStack var5 = var1.m_5006();
         float var6 = this.m_6566();
         float var7 = this.f_19878.m_8768() ? 1.0F : 0.0F;
         boolean var8 = this.f_19877.m_8768() || this.f_19876.m_8768();
         ArrayList<Trails.ORcHdDpjfTPMbngF> var9 = new ArrayList<>();

         for (Trails.ORcHdDpjfTPMbngF var11 : this.f_19895) {
            var11.m_6530();
            if (var11.f_19793 >= f_20063 && var11.f_19778.m_6538() != null) {
               var9.add(var11);
            }
         }

         if (!var9.isEmpty()) {
            HashMap<Identifier, List<Trails.ORcHdDpjfTPMbngF>> var32 = new HashMap<>();

            for (Trails.ORcHdDpjfTPMbngF var12 : var9) {
               var32.computeIfAbsent(var12.f_19778.m_6538().id, var0 -> new ArrayList<>()).add(var12);
            }

            for (Entry<Identifier, List<Trails.ORcHdDpjfTPMbngF>> var36 : var32.entrySet()) {
               BufferBuilder var13 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
               int var14 = 0;

               for (Trails.ORcHdDpjfTPMbngF var16 : var36.getValue()) {
                  Trails.t5bTcAeukGu2cUSl var17 = var16.f_19778.m_6538();
                  if (var17 != null) {
                     float var18 = var16.f_19793;
                     double var19 = var16.m_6531(var2) - var4.x;
                     double var21 = var16.m_6527(var2) - var4.y;
                     double var23 = var16.m_6524(var2) - var4.z;
                     float var25 = f_20064 * var18 * var6 * f_20065;
                     float var26 = var17.w * var25;
                     float var27 = var17.h * var25;
                     int var28 = Class_BftdentXEtGbugJw.m_2302(var16.f_19777, -1, f_20066);
                     var28 = Class_BftdentXEtGbugJw.m_2306(this.m_6589(var28, 1.0F), var18);
                     var14 += this.m_6582(var13, var5, var19, var21, var23, var26, var27, var16.f_19782[0], var16.f_19782[1], var28);
                  }
               }

               this.m_6579(var13, (Identifier)var36.getKey(), var14);
            }

            BufferBuilder var35 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
            int var37 = 0;

            for (Trails.ORcHdDpjfTPMbngF var40 : var9) {
               Trails.t5bTcAeukGu2cUSl var43 = var40.f_19778.m_6538();
               if (var43 != null) {
                  float var45 = var40.f_19793;
                  double var47 = var40.m_6531(var2) - var4.x;
                  double var50 = var40.m_6527(var2) - var4.y;
                  double var51 = var40.m_6524(var2) - var4.z;
                  float var52 = f_20067 * var45 * var6 * f_20068;
                  float var24 = var43.w * var52;
                  float var54 = var43.h * var52;
                  float var56 = (float)Math.sqrt(var24 * var24 + var54 * var54);
                  float var58 = 1.0F - var40.m_6529();
                  int var61 = Class_BftdentXEtGbugJw.m_2302(var40.f_19777, -1, f_20069);
                  var37 += this.m_6582(
                     var35,
                     var5,
                     var47,
                     var50,
                     var51,
                     var56 / f_20070 * 2.0F,
                     var56 / f_20071 * 2.0F,
                     var3.yRot(),
                     var3.xRot(),
                     Class_BftdentXEtGbugJw.m_2306(var61, f_20072 * var45)
                  );
                  if (var7 > 0.0F) {
                     float var29 = var45 * var7;
                     float var30 = var56 * (1.0F + f_20073 * var58 * var29);
                     int var31 = Class_BftdentXEtGbugJw.m_2306(this.m_6589(var61, var29 / f_20074), Math.min(var29 / 2.0F / var6, 1.0F) * f_20075);
                     var37 += this.m_6582(var35, var5, var47, var50, var51, var30, var30, var3.yRot(), var3.xRot(), var31);
                  }
               }
            }

            this.m_6579(var35, f_19857, var37);
            if (var8) {
               BufferBuilder var39 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
               int var41 = 0;

               for (Trails.ORcHdDpjfTPMbngF var46 : var9) {
                  if (!var46.f_19783.isEmpty()) {
                     float var48 = var46.f_19793;
                     double var49 = var46.m_6531(var2) - var4.x;
                     double var20 = var46.m_6527(var2) - var4.y;
                     double var22 = var46.m_6524(var2) - var4.z;
                     float var53 = this.m_6605() * (f_20076 + var48);

                     for (Trails.xoZ2FYFe78sabeQp var57 : var46.f_19783) {
                        float var59 = m_6581((float)(var57.m_6545() * var48));
                        if (!(var59 < f_20077)) {
                           int var62 = Class_BftdentXEtGbugJw.m_2302(
                              var46.f_19777, Class_BftdentXEtGbugJw.m_2306(-1, Class_BftdentXEtGbugJw.m_2297(var46.f_19777) / f_20078), var59
                           );
                           var62 = Class_BftdentXEtGbugJw.m_2306(var62, Class_BftdentXEtGbugJw.m_2297(var62) / f_20079 * var59 / f_20080);
                           var41 += this.m_6582(
                              var39,
                              var5,
                              var49 + var57.m_6539(var2),
                              var20 + var57.m_6543(var2),
                              var22 + var57.m_6542(var2),
                              var53,
                              var53,
                              var3.yRot(),
                              var3.xRot(),
                              var62
                           );
                           var41 += this.m_6582(
                              var39,
                              var5,
                              var49 - var57.m_6539(var2),
                              var20 - var57.m_6543(var2),
                              var22 - var57.m_6542(var2),
                              var53,
                              var53,
                              var3.yRot(),
                              var3.xRot(),
                              var62
                           );
                        }
                     }
                  }
               }

               this.m_6579(var39, f_19857, var41);
            }
         }
      }
   }

   private int m_6596() {
      return (int)((550 + this.f_19900.nextInt(300)) * this.f_19879.m_8768());
   }

   private int m_6597(BufferBuilder var1, Matrix4f var2, Vec3 var3, Vec3[][] var4, float var5, long var6, long var8, float var10) {
      byte var11 = 0;
      int var12 = var4.length;
      int var13 = var4[0].length;

      for (int var14 = 1; var14 < var12; var14++) {
         float var15 = this.m_6577(this.f_19899.get(var14 - 1), var6, var8);
         float var16 = this.m_6577(this.f_19899.get(var14), var6, var8);
         float var17 = 1.0F - var15;
         float var18 = 1.0F - var16;
         int var19 = m_6557(var15 * var10);
         int var20 = m_6557(var16 * var10);

         for (int var21 = 0; var21 < var13; var21++) {
            int var22 = (var21 + 1) % var13;
            Vec3 var23 = var4[var14 - 1][var21].subtract(var3);
            Vec3 var24 = var4[var14 - 1][var22].subtract(var3);
            Vec3 var25 = var4[var14][var21].subtract(var3);
            Vec3 var26 = var4[var14][var22].subtract(var3);
            m_6551(var1, var2, var23, var17, var5, var19);
            m_6551(var1, var2, var24, var17, var5, var19);
            m_6551(var1, var2, var26, var18, var5, var20);
            m_6551(var1, var2, var23, var17, var5, var19);
            m_6551(var1, var2, var26, var18, var5, var20);
            m_6551(var1, var2, var25, var18, var5, var20);
            var11 += 6;
         }
      }

      return var11;
   }

   private boolean m_6599(Player var1) {
      boolean var2 = var1 == f_11537.player;
      if (var2) {
         return !this.f_19868.m_8768() ? false : this.f_19869.m_8768() || !f_11537.options.getCameraType().isFirstPerson();
      }

      double var3 = f_11537.player.distanceTo(var1);
      if (var3 > this.f_19874.m_8768().floatValue()) {
         return false;
      }

      boolean var5 = DimasikClient.m_9057().m_9049().m_2804().m_2877(var1.getGameProfile().name());
      return var5 ? this.f_19871.m_8768() : this.f_19870.m_8768();
   }

   private float m_6600() {
      return switch (this.f_19880.m_7564().m_1181()) {
         case f_20009 -> f_20011;
         case f_20010 -> f_20012;
         default -> 1.0F;
      };
   }

   private float m_6601(float var1, float var2, float var3) {
      float var4 = Mth.clamp((var3 - var1) / (var2 - var1), 0.0F, 1.0F);
      return var4 * var4 * (f_20134 - 2.0F * var4);
   }

   private void m_6603() {
      if (!this.f_19901) {
         this.f_19901 = true;
         this.f_19897.clear();
         this.f_19898.clear();

         for (int var1 = 1; var1 <= 21; var1++) {
            this.f_19897.add(this.m_6614(Identifier.fromNamespaceAndPath(f_20001, var1 + "")));
         }

         for (int var5 = 0; var5 < f_19858.length; var5++) {
            ArrayList var2 = new ArrayList();
            int var3 = f_19858[var5];

            for (int var4 = 1; var4 <= var3; var4++) {
               var2.add(this.m_6614(Identifier.fromNamespaceAndPath(f_20002, "" + (var5 + 1) + var4)));
            }

            this.f_19898.add(var2);
         }
      }
   }

   private void m_6604(int var1, int var2) {
      if (this.f_19903 == null) {
         this.f_19903 = new TextureTarget(f_20162, var1, var2, true, GpuFormat.RGBA8_UNORM);
      } else if (this.f_19903.width != var1 || this.f_19903.height != var2) {
         this.f_19903.resize(var1, var2);
      }
   }

   private float m_6605() {
      float var1 = f_20017;

      return switch (this.f_19880.m_7564().m_1181()) {
         case f_20018 -> var1 * 2.0F;
         case f_20019 -> var1 * f_20020;
         default -> var1;
      };
   }

   public Trails() {
      super(f_19910, f_19911, Category.RENDER);
      this.f_19862 = new MultiChoiceSetting(
         f_19912,
         new Class_2ZaVm8TGDJ68TnJB(f_19913),
         new Class_2ZaVm8TGDJ68TnJB(f_19914),
         new Class_2ZaVm8TGDJ68TnJB(f_19915),
         new Class_2ZaVm8TGDJ68TnJB(f_19916)
      );
      this.f_19863 = new SliderSetting(f_19917, f_19918, f_19919, f_19920).m_828(f_19921).m_822(() -> this.f_19862.m_7568(f_20254));
      this.f_19864 = new SliderSetting(f_19922, f_19923, f_19924, f_19925).m_828(f_19926).m_822(() -> this.f_19862.m_7568(f_20253));
      this.f_19865 = new SliderSetting(f_19927, 1.0F, f_19928, f_19929).m_828(f_19930).m_822(() -> this.f_19862.m_7568(f_20252));
      this.f_19866 = new CheckboxSetting(f_19931, true).m_822(() -> this.f_19862.m_7568(f_20251));
      this.f_19867 = new ColorSetting(f_19932, false, f_19933).m_822(() -> this.f_19862.m_7568(f_20250) && !this.f_19866.m_8768());
      this.f_19868 = new CheckboxSetting(f_19934, true).m_822(() -> this.f_19862.m_7568(f_20249));
      this.f_19869 = new CheckboxSetting(f_19935, true).m_822(() -> this.f_19862.m_7568(f_20248) && this.f_19868.m_8768());
      this.f_19870 = new CheckboxSetting(f_19936, false).m_822(() -> this.f_19862.m_7568(f_20247));
      this.f_19871 = new CheckboxSetting(f_19937, true).m_822(() -> this.f_19862.m_7568(f_20246));
      this.f_19872 = new MultiChoiceSetting(
            f_19938,
            0,
            new Class_2ZaVm8TGDJ68TnJB(f_19939),
            new Class_2ZaVm8TGDJ68TnJB(f_19940),
            new Class_2ZaVm8TGDJ68TnJB(f_19941),
            new Class_2ZaVm8TGDJ68TnJB(f_19942)
         )
         .m_822(() -> this.f_19862.m_7568(f_20245));
      this.f_19873 = new ColorSetting(f_19943, false, Class_BftdentXEtGbugJw.m_2303(170, 40, 255, f_19944))
         .m_822(() -> this.f_19862.m_7568(f_20243) && this.f_19872.m_7568(f_20244));
      this.f_19874 = new SliderSetting(f_19945, f_19946, f_19947, f_19948)
         .m_828(1.0F)
         .m_822(() -> this.f_19862.m_7568(f_20242) && (this.f_19870.m_8768() || this.f_19871.m_8768()));
      this.f_19875 = new CheckboxSetting(f_19949, false).m_822(() -> this.f_19862.m_7568(f_20241));
      this.f_19876 = new CheckboxSetting(f_19950, false).m_822(() -> this.f_19862.m_7568(f_20240));
      this.f_19877 = new CheckboxSetting(f_19951, true).m_822(() -> this.f_19862.m_7568(f_20239));
      this.f_19878 = new CheckboxSetting(f_19952, true).m_822(() -> this.f_19862.m_7568(f_20238));
      this.f_19879 = new SliderSetting(f_19953, f_19954, f_19955, f_19956).m_828(f_19957).m_822(() -> this.f_19862.m_7568(f_20237));
      this.f_19880 = new MultiChoiceSetting(
            f_19958, 1, new Class_2ZaVm8TGDJ68TnJB(f_19959), new Class_2ZaVm8TGDJ68TnJB(f_19960), new Class_2ZaVm8TGDJ68TnJB(f_19961)
         )
         .m_822(() -> this.f_19862.m_7568(f_20236));
      this.f_19881 = new SliderSetting(f_19962, f_19963, f_19964, 2.0F).m_828(f_19965).m_822(() -> this.f_19862.m_7568(f_20235));
      this.f_19882 = new SliderSetting(f_19966, f_19967, f_19968, f_19969).m_828(f_19970).m_822(() -> this.f_19862.m_7568(f_20234));
      this.f_19883 = new CheckboxSetting(f_19971, true).m_822(() -> this.f_19862.m_7568(f_20233));
      this.f_19884 = new ColorSetting(f_19972, false, f_19973).m_822(() -> this.f_19862.m_7568(f_20232) && !this.f_19883.m_8768());
      this.f_19885 = new ColorSetting(f_19974, false, f_19975).m_822(() -> this.f_19862.m_7568(f_20231) && !this.f_19883.m_8768());
      this.f_19886 = new ColorSetting(f_19976, false, f_19977).m_822(() -> this.f_19862.m_7568(f_20230) && !this.f_19883.m_8768());
      this.f_19887 = new SliderSetting(f_19978, f_19979, f_19980, f_19981).m_828(1.0F).m_822(() -> this.f_19862.m_7568(f_20229));
      this.f_19888 = new SliderSetting(f_19982, f_19983, f_19984, f_19985).m_828(f_19986).m_822(() -> this.f_19862.m_7568(f_20228));
      this.f_19889 = new SliderSetting(f_19987, f_19988, 1.0F, f_19989).m_828(f_19990).m_822(() -> this.f_19862.m_7568(f_20227));
      this.f_19890 = new Class_HV2MJjonZTp2hb9E();
      this.f_19893 = Class_8eJhbT3fP9R0tMrZ.m_1814(f_19991, CompareOp.ALWAYS_PASS);
      this.f_19894 = new ArrayList<>();
      this.f_19895 = new ArrayList<>();
      this.f_19896 = new HashMap<>();
      this.f_19897 = new ArrayList<>();
      this.f_19898 = new ArrayList<>();
      this.f_19899 = new ArrayList<>();
      this.f_19900 = new Random(f_19992);
      this.f_19904 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_19993)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_19994))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_19995))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.ADDITIVE)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2741(f_19996)
         .m_2722();
      this.f_19905 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_19997)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_19998))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_19999))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.ADDITIVE)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.TRIANGLES)
         .m_2729(f_20000, UniformType.UNIFORM_BUFFER)
         .m_2722();
      this.f_19906 = this::m_6556;
      this.f_19907 = this::m_6622;
      this.m_795(
         this.f_19862,
         this.f_19863,
         this.f_19864,
         this.f_19865,
         this.f_19866,
         this.f_19867,
         this.f_19868,
         this.f_19869,
         this.f_19870,
         this.f_19871,
         this.f_19872,
         this.f_19873,
         this.f_19874,
         this.f_19875,
         this.f_19876,
         this.f_19877,
         this.f_19878,
         this.f_19879,
         this.f_19880,
         this.f_19881,
         this.f_19882,
         this.f_19883,
         this.f_19884,
         this.f_19885,
         this.f_19886,
         this.f_19887,
         this.f_19888,
         this.f_19889
      );
   }

   private int m_6607(BufferBuilder var1, Matrix4f var2, Vec3 var3, long var4, long var6) {
      int var8 = this.f_19899.size();
      if (var8 < 2) {
         return 0;
      }

      Vec3[] var9 = new Vec3[var8];

      for (int var10 = 0; var10 < var8; var10++) {
         var9[var10] = this.m_6625(var10).add(0.0, f_20088, 0.0);
      }

      Vec3[] var52 = new Vec3[var8 - 1];
      Vec3 var11 = null;

      for (int var12 = 0; var12 < var52.length; var12++) {
         Vec3 var13 = var9[var12 + 1].subtract(var9[var12]);
         if (var13.lengthSqr() < f_20089) {
            var52[var12] = var11 == null ? new Vec3(1.0, 0.0, 0.0) : var11;
         } else {
            Vec3 var14 = this.m_6623(var13.normalize());
            if (var11 != null && var14.dot(var11) < 0.0) {
               var14 = var14.reverse();
            }

            var52[var12] = var14;
            var11 = var14;
         }
      }

      Vec3[] var53 = this.m_6561(var52);
      int var54 = 0;
      byte var55 = 4;
      byte var15 = 7;
      float var16 = (float)(var4 % f_20090) * f_20091;
      float var17 = f_20092;
      float var18 = f_20093;
      float var19 = f_20094;
      float var20 = f_20095;
      float var21 = f_20096;
      float var22 = f_20097;
      float var23 = f_20098 + var21 * f_20099;
      float var24 = f_20100 + this.f_19882.m_8768() * f_20101;

      for (int var25 = 0; var25 < var55; var25++) {
         Vec3[] var26 = new Vec3[var8];

         for (int var27 = 0; var27 < var8; var27++) {
            float var28 = 1.0F - this.m_6577(this.f_19899.get(var27), var4, var6);
            Vec3 var29 = this.m_6594(var9, var27);
            Vec3 var30 = var53[var27].normalize();
            Vec3 var31 = var30.cross(var29);
            if (var31.lengthSqr() < f_20102) {
               var31 = new Vec3(0.0, 1.0, 0.0);
            }

            var31 = var31.normalize();
            float var32 = var25;
            float var33 = var28 * 2.0F / var22;
            float var34 = var32 * f_20103 * var20;
            float var35 = (2.0F + var32 * f_20104) * var19;
            float var36 = f_20105 + var32 * f_20106;
            float var37 = var16 * var17;
            float var38 = var33 * var35 + var37 * var36 + var34;
            float var39 = var33 * var35 * f_20107 - var37 * var36 * f_20108 + var34 * f_20109;
            float var40 = (float)Math.pow(Math.max(1.0F - this.m_6601(f_20110, f_20111, var33), 0.0F), f_20112);
            float var41 = (f_20113 + f_20114 * var23) * var40 * var18;
            float var42 = Mth.sin(var38) * f_20115 + Mth.sin(var39) * f_20116;
            float var43 = this.f_19882.m_8768() * 2.0F * var22;
            float var44 = var25 * f_20117 / var55;
            float var45 = var16 * f_20118 + var33 * f_20119 * f_20120 + var44;
            float var46 = var16 * f_20121 - var33 * f_20122 * f_20123 + var44 * 2.0F;
            float var47 = this.f_19882.m_8768() * f_20124 * var40;
            float var48 = Mth.sin(var46) * this.f_19882.m_8768() * f_20125 * var40;
            float var49 = Mth.sin(var45) * var47 + var48 + var42 * var41 * var43 * f_20126;
            float var50 = Mth.cos(var45) * var47 * f_20127 + Mth.cos(var46) * this.f_19882.m_8768() * f_20128 * var40;
            Vec3 var51 = var30.scale(var49).add(var31.scale(var50));
            var26[var27] = var9[var27].add(var51);
         }

         Vec3[] var56 = this.m_6570(var26);
         Vec3[][] var57 = new Vec3[var8][var15];

         for (int var58 = 0; var58 < var8; var58++) {
            Vec3 var60 = this.m_6594(var26, var58);
            Vec3 var62 = var56[var58];
            Vec3 var63 = var62.cross(var60);
            if (var63.lengthSqr() < f_20129) {
               var63 = new Vec3(0.0, 1.0, 0.0);
            }

            var63 = var63.normalize();
            float var65 = this.m_6577(this.f_19899.get(var58), var4, var6);
            float var66 = var24 * (f_20130 + var65 * f_20131);

            for (int var67 = 0; var67 < var15; var67++) {
               float var68 = f_20132 * var67 / var15;
               Vec3 var69 = var62.scale(Mth.cos(var68)).add(var63.scale(Mth.sin(var68)));
               var57[var58][var67] = var26[var58].add(var69.scale(var66));
            }
         }

         float var59 = (float)var25 / var55;
         var54 += this.m_6597(var1, var2, var3, var57, var59, var4, var6, f_20133);
      }

      return var54;
   }

   private void m_6608(BufferBuilder var1, Identifier var2, int var3, RenderPipeline var4) {
      MeshData var5 = var1.build();
      if (var5 != null) {
         if (var3 == 0) {
            var5.close();
         } else {
            GpuBuffer var6 = null;

            try {
               DrawState var7 = var5.drawState();
               int var8 = var7.indexCount();
               AutoStorageIndexBuffer var9 = RenderSystem.getSequentialBuffer(var7.primitiveTopology());
               GpuBuffer var10 = var9.getBuffer(var8);
               IndexType var11 = var9.type();
               var6 = RenderSystem.getDevice().createBuffer(() -> f_20221, 32, var5.vertexBuffer());
               RenderTarget var12 = f_11537.gameRenderer.mainRenderTarget();
               CommandEncoder var13 = RenderSystem.getDevice().createCommandEncoder();
               AbstractTexture var14 = f_11537.getTextureManager().getTexture(var2);
               RenderPass var15 = var13.createRenderPass(
                  () -> f_20220, var12.getColorTextureView(), Optional.empty(), var12.getDepthTextureView(), OptionalDouble.empty()
               );

               try {
                  RenderSystem.bindDefaultUniforms(var15);
                  var15.setPipeline(var4);
                  var15.bindTexture(f_20211, var14.getTextureView(), var14.getSampler());
                  var15.setVertexBuffer(0, var6.slice());
                  var15.setIndexBuffer(var10, var11);
                  var15.drawIndexed(var8, 1, 0, 0, 0);
               } catch (Throwable var23) {
                  if (var15 != null) {
                     try {
                        var15.close();
                     } catch (Throwable var22) {
                        var23.addSuppressed(var22);
                     }
                  }

                  throw var23;
               }

               if (var15 != null) {
                  var15.close();
               }
            } finally {
               if (var6 != null) {
                  var6.close();
               }

               var5.close();
            }
         }
      }
   }

   private void m_6610(BufferBuilder var1, int var2, long var3) {
      MeshData var5 = var1.build();
      if (var5 != null) {
         if (var2 == 0) {
            var5.close();
         } else {
            GpuBuffer var6 = null;
            GpuBuffer var7 = null;

            try {
               DrawState var8 = var5.drawState();
               int var9 = var8.indexCount();
               AutoStorageIndexBuffer var10 = RenderSystem.getSequentialBuffer(var8.primitiveTopology());
               GpuBuffer var11 = var10.getBuffer(var9);
               IndexType var12 = var10.type();
               var6 = RenderSystem.getDevice().createBuffer(() -> f_20225, 32, var5.vertexBuffer());
               RenderTarget var13 = f_11537.gameRenderer.mainRenderTarget();
               this.m_6604(var13.width, var13.height);
               CommandEncoder var14 = RenderSystem.getDevice().createCommandEncoder();
               int var15 = this.f_19883.m_8768() ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : this.f_19884.m_8768();
               int var16 = this.f_19883.m_8768() ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN_TWO) : this.f_19885.m_8768();
               int var17 = this.f_19883.m_8768() ? Class_BftdentXEtGbugJw.m_2304(0) : this.f_19886.m_8768();
               MemoryStack var18 = MemoryStack.stackPush();

               try {
                  ByteBuffer var19 = Std140Builder.onStack(var18, 112)
                     .putVec4(Class_BftdentXEtGbugJw.m_2298(var15))
                     .putVec4(Class_BftdentXEtGbugJw.m_2298(var16))
                     .putVec4(Class_BftdentXEtGbugJw.m_2298(var17))
                     .putVec4((float)(var3 % f_20146) / f_20147, f_20148, f_20149, f_20150)
                     .putVec4(f_20151, f_20152, f_20153, f_20154)
                     .putVec4(0.0F, f_20155, 1.0F, f_20156)
                     .putVec4(2.0F, f_20157, 0.0F, 0.0F)
                     .get();
                  var7 = RenderSystem.getDevice().createBuffer(() -> f_20224, 128, var19);
               } catch (Throwable var34) {
                  if (var18 != null) {
                     try {
                        var18.close();
                     } catch (Throwable var31) {
                        var34.addSuppressed(var31);
                     }
                  }

                  throw var34;
               }

               if (var18 != null) {
                  var18.close();
               }

               RenderPass var36 = var14.createRenderPass(
                  () -> f_20223, this.f_19903.getColorTextureView(), Optional.of(new Vector4f(0.0F)), var13.getDepthTextureView(), OptionalDouble.empty()
               );

               try {
                  RenderSystem.bindDefaultUniforms(var36);
                  var36.setUniform(f_20158, var7);
                  var36.setPipeline(this.f_19905);
                  var36.setVertexBuffer(0, var6.slice());
                  var36.setIndexBuffer(var11, var12);
                  var36.drawIndexed(var9, 1, 0, 0, 0);
               } catch (Throwable var33) {
                  if (var36 != null) {
                     try {
                        var36.close();
                     } catch (Throwable var30) {
                        var33.addSuppressed(var30);
                     }
                  }

                  throw var33;
               }

               if (var36 != null) {
                  var36.close();
               }

               Class_rG6KJzJWXQjNHCHC.m_8389(this.f_19903, var13, var15, f_20159, 2.0F, f_20160);
               RenderPass var37 = var14.createRenderPass(
                  () -> f_20222, var13.getColorTextureView(), Optional.empty(), var13.getDepthTextureView(), OptionalDouble.empty()
               );

               try {
                  RenderSystem.bindDefaultUniforms(var37);
                  var37.setUniform(f_20161, var7);
                  var37.setPipeline(this.f_19905);
                  var37.setVertexBuffer(0, var6.slice());
                  var37.setIndexBuffer(var11, var12);
                  var37.drawIndexed(var9, 1, 0, 0, 0);
               } catch (Throwable var32) {
                  if (var37 != null) {
                     try {
                        var37.close();
                     } catch (Throwable var29) {
                        var32.addSuppressed(var29);
                     }
                  }

                  throw var32;
               }

               if (var37 != null) {
                  var37.close();
               }
            } finally {
               if (var6 != null) {
                  var6.close();
               }

               if (var7 != null) {
                  var7.close();
               }

               var5.close();
            }
         }
      }
   }

   private void m_6611(Matrix4f var1, Vec3 var2, Vec3 var3, Vec3 var4, Vec3 var5, long var6, int var8, int var9, int var10, boolean var11) {
      BufferBuilder var12 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
      int var13 = 0;

      for (Trails.oJj2HqDwZQ01gcY5 var15 : this.f_19894) {
         float var16 = var15.m_6534(var6);
         float var17 = var15.m_6533(var6);
         if (!(var17 <= f_20164)) {
            int var18 = Mth.clamp((int)(f_20165 * var17), 0, 255);
            if (var18 > 4) {
               Vec3 var19 = var15.f_19825.subtract(var2);
               float var20 = (float)var15.f_19826.dot(var3);
               float var21 = (float)var15.f_19826.dot(var4);
               float var22 = (float)Math.toDegrees(Math.atan2(var21, var20)) + var15.f_19829;
               double var23 = Math.toRadians(var22);
               double var25 = Math.cos(var23);
               double var27 = Math.sin(var23);
               Vec3 var29 = var3.scale(var25).add(var4.scale(-var27));
               Vec3 var30 = var3.scale(var27).add(var4.scale(var25));
               float var31 = 1.0F - var16 * f_20166;
               double var32 = var15.f_19827 * var31;
               double var34 = var15.f_19828 * (f_20167 - var16 * f_20168);
               if (var11) {
                  int var36 = Class_BftdentXEtGbugJw.m_2303(var8, var9, var10, Mth.clamp((int)(var18 * f_20169), 0, 255));
                  double var37 = var32 * (f_20170 - var16 * f_20171);
                  var13 += this.m_6562(var12, var1, var19, var29, var30, var5, 0.0, var37, var37, var36, var36, var36, var36);
               } else {
                  double var41 = Math.max(var32, var34) * f_20172;
                  int var38 = Class_BftdentXEtGbugJw.m_2303(var8, var9, var10, Mth.clamp((int)(var18 * f_20173), 0, 255));
                  int var39 = Class_BftdentXEtGbugJw.m_2303(255, 255, 255, Mth.clamp((int)(var18 * f_20174), 0, 255));
                  var13 += this.m_6562(var12, var1, var19, var29, var30, var5, f_20175, var41, var41, var38, var38, var38, var38);
                  var13 += this.m_6562(var12, var1, var19, var29, var30, var5, f_20176, var41 * f_20177, var41 * f_20178, var39, var39, var39, var39);
               }
            }
         }
      }

      this.m_6579(var12, var11 ? f_19855 : f_19856, var13);
   }

   private int m_6612(int var1, int var2, double var3) {
      double var5 = (var3 * f_20057 + var1) % f_20058;
      float var7 = (float)((var5 >= f_20059 ? f_20060 - var5 : var5) / f_20061);
      int var8 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
      int var9 = Class_BftdentXEtGbugJw.m_2302(var8, this.m_6589(var8, f_20062), var7);
      return Class_BftdentXEtGbugJw.m_2303(Class_BftdentXEtGbugJw.m_2309(var9), Class_BftdentXEtGbugJw.m_2299(var9), Class_BftdentXEtGbugJw.m_2308(var9), var2);
   }

   private Trails.t5bTcAeukGu2cUSl m_6614(Identifier var1) {
      int var2 = 48;
      int var3 = 48;

      try {
         Optional var4 = f_11537.getResourceManager().getResource(var1);
         if (var4.isPresent()) {
            try (InputStream var5 = ((Resource)var4.get()).open()) {
               NativeImage var6 = NativeImage.read(var5);

               try {
                  var2 = var6.getWidth();
                  var3 = var6.getHeight();
               } catch (Throwable var11) {
                  if (var6 != null) {
                     try {
                        var6.close();
                     } catch (Throwable var10) {
                        var11.addSuppressed(var10);
                     }
                  }

                  throw var11;
               }

               if (var6 != null) {
                  var6.close();
               }
            }
         }
      } catch (Exception var13) {
      }

      return new Trails.t5bTcAeukGu2cUSl(var1, var2, var3);
   }

   private void m_6615(Vec3 var1) {
      if (f_11537.player.isHandsBusy()) {
         this.f_19908 = var1;
      } else if (this.f_19908 == null) {
         this.f_19908 = var1;
      } else if (this.f_19908.distanceToSqr(var1) > f_20179) {
         this.f_19908 = var1;
      } else {
         Vec3 var2 = var1.subtract(this.f_19908);
         double var3 = var2.length();
         if (!(var3 < f_20180)) {
            Vec3 var5 = var2.scale(1.0 / var3);
            Vec3 var6 = var5.scale(f_20181);
            Vec3 var7 = new Vec3(-var5.z, 0.0, var5.x);
            var7 = var7.lengthSqr() < f_20182 ? new Vec3(1.0, 0.0, 0.0) : var7.normalize();
            float var8 = f_11537.player.getBbHeight() - (f_11537.player.isShiftKeyDown() ? f_20183 : 0.0F);
            double var9 = Math.max(f_20184, f_20185 * (f_20186 / Math.max(f_20187, this.f_19864.m_8768().floatValue())));
            int var11 = Mth.clamp((int)Math.floor(var3 / var9), 1, 12);

            for (int var12 = 1; var12 <= var11; var12++) {
               double var13 = (double)var12 / var11;
               Vec3 var15 = this.f_19908.add(var2.scale(var13)).add(0.0, var8 * f_20188, 0.0);
               this.m_6578(var15, var6, var7, var8, var9);
            }

            this.f_19908 = var1;
         }
      }
   }

   private void m_6622(Class_TZhU50s8XmBQCMP5 var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (this.f_19909 != null && this.f_19909 != f_11537.level) {
            this.f_19894.clear();
            this.f_19895.clear();
            this.f_19908 = null;
            this.f_19896.clear();
            this.m_6585();
         }

         this.f_19909 = f_11537.level;
         if (this.f_19862.m_7568(f_20030)) {
            this.m_6585();
            this.f_19894.clear();
            this.f_19895.clear();
            this.f_19908 = null;
            this.m_6563(var1);
         } else if (this.f_19862.m_7568(f_20031)) {
            this.m_6585();
            this.m_6595(var1);
         } else if (this.f_19862.m_7568(f_20032)) {
            this.f_19894.clear();
            this.f_19908 = null;
            this.m_6549(var1);
         } else {
            this.m_6585();
            this.m_6590(var1);
         }
      } else {
         this.m_6576();
      }
   }

   private Vec3 m_6623(Vec3 var1) {
      Vec3 var2 = Math.abs(var1.y) < f_20140 ? new Vec3(0.0, 1.0, 0.0) : new Vec3(1.0, 0.0, 0.0);
      Vec3 var3 = var1.cross(var2);
      return var3.lengthSqr() < f_20141 ? new Vec3(1.0, 0.0, 0.0) : var3.normalize();
   }

   @Override
   public void m_732() {
      this.m_6576();
   }

   private Vec3 m_6625(int var1) {
      Vec3 var2 = this.f_19899.get(var1).position;
      Vec3 var3 = this.f_19899.get(Math.max(0, var1 - 1)).position;
      Vec3 var4 = this.f_19899.get(Math.min(this.f_19899.size() - 1, var1 + 1)).position;
      return var3.scale(f_20142).add(var2.scale(f_20143)).add(var4.scale(f_20144));
   }

   private final class ORcHdDpjfTPMbngF {
      public final Player f_19775;
      public final int f_19776;
      public final int f_19777;
      public final Trails.vvQAAUQxC5e74yHO f_19778;
      public final long f_19779 = System.currentTimeMillis();
      public final int f_19780;
      public final boolean f_19781;
      public final float[] f_19782 = new float[2];
      public final List<Trails.xoZ2FYFe78sabeQp> f_19783 = new ArrayList<>();
      public double f_19784;
      public double f_19785;
      public double f_19786;
      public double f_19787;
      public double f_19788;
      public double f_19789;
      public double f_19790;
      public double f_19791;
      public double f_19792;
      public float f_19793 = 0.0F;
      public float f_19794 = 1.0F;
      public static final double f_19796 = -0.0875;
      public static final double f_19797 = 0.175;
      public static final double f_19798 = 3.0;
      public static final double f_19799 = 4.0;
      public static final double f_19800 = 0.7;
      public static final double f_19801 = -0.0875;
      public static final double f_19802 = 0.175;
      public static final double f_19803 = 0.04;
      public static final double f_19804 = 0.04;
      public static final double f_19805 = 0.04;
      public static final float f_19806 = 0.035F;
      public static final double f_19807 = 90.0;
      public static final double f_19808 = 5.0E-4;
      public static final double f_19809 = 360.0;
      public static final float f_19810 = 3.0F;
      public static final float f_19811 = 45.0F;
      public static final float f_19812 = 15.0F;
      public static final float f_19813 = 26.3F;
      public static final float f_19814 = 10.0F;
      public static final float f_19815 = 160.0F;
      public static final float f_19816 = -90.0F;
      public static final double f_19817 = 1.05;
      public static final double f_19818 = 1.05;
      public static final double f_19819 = 1.05;
      public static final double f_19820 = 5.0;
      public static final double f_19821 = 5.0;
      public static final double f_19822 = 3.5;
      public static final double f_19823 = 5.0;
      public static final float f_19824 = 0.3F;

      public double m_6524(float var1) {
         return this.f_19792 + (this.f_19789 - this.f_19792) * var1;
      }

      public void m_6525(Trails.ORcHdDpjfTPMbngF var1) {
         if (var1 != null && var1.f_19776 != this.f_19776) {
            var1 = null;
         }

         this.f_19790 = this.f_19787;
         this.f_19791 = this.f_19788;
         this.f_19792 = this.f_19789;
         this.f_19784 = (var1 != null ? var1.f_19784 : this.f_19784) / f_19817;
         this.f_19785 = (var1 != null ? var1.f_19785 : this.f_19785) / f_19818;
         this.f_19786 = (var1 != null ? var1.f_19786 : this.f_19786) / f_19819;
         this.f_19787 = this.f_19787 + f_19820 * this.f_19784;
         this.f_19788 = this.f_19788 + f_19821 * this.f_19785 / (this.f_19785 < 0.0 ? 1.0 : f_19822);
         this.f_19789 = this.f_19789 + f_19823 * this.f_19786;
         this.m_6526();
         if (this.f_19781) {
            if (this.m_6529() < f_19824 && Trails.this.f_19900.nextInt(12) > 5) {
               int var2 = Trails.this.f_19876.m_8768() ? 1 : 2;

               for (int var3 = 0; var3 < var2; var3++) {
                  this.f_19783.add(new Trails.xoZ2FYFe78sabeQp(Trails.this.m_6566()));
               }
            }

            this.f_19783.forEach(Trails.xoZ2FYFe78sabeQp::m_6544);
            this.f_19783.removeIf(Trails.xoZ2FYFe78sabeQp::m_6541);
         } else {
            this.f_19783.clear();
         }
      }

      public void m_6526() {
         Camera var1 = Class_NzJrN63M7QBpmAbi.f_11537.gameRenderer.mainCamera();
         if (Math.sqrt(this.f_19784 * this.f_19784 + this.f_19786 * this.f_19786) < f_19808) {
            this.f_19782[0] = (float)(f_19809 * Math.random());
            this.f_19782[1] = var1.xRot();
         } else {
            float var2 = this.m_6528();
            float var3 = this.f_19775 == null ? 0.0F : (this.f_19775.yRotO - this.f_19775.getYRot()) * f_19810;
            this.f_19782[0] = var2 - f_19811 - f_19812 - var3;
            float var4 = Trails.m_6553(var2 + f_19813, this.f_19775 != null ? this.f_19775.getYRot() : var2);
            this.f_19782[1] = !(var4 < f_19814) && !(var4 > f_19815) ? var1.xRot() : f_19816;
         }
      }

      public double m_6527(float var1) {
         return this.f_19791 + (this.f_19788 - this.f_19791) * var1;
      }

      public int m_6528() {
         int var1 = (int)Math.toDegrees(Math.atan2(this.f_19786, this.f_19784) - f_19807);
         return var1 < 0 ? var1 + 360 : var1;
      }

      public float m_6529() {
         return Math.min((float)(System.currentTimeMillis() - this.f_19779) / this.f_19780, 1.0F);
      }

      public ORcHdDpjfTPMbngF(Player var2, Vec3 var3, Vec3 var4, float var5, int var6, boolean var7) {
         this.f_19775 = var2;
         this.f_19776 = var2.getId();
         this.f_19777 = Trails.this.m_6583();
         this.f_19778 = Trails.this.new vvQAAUQxC5e74yHO();
         this.f_19780 = Math.max(200, var6);
         this.f_19781 = var7;
         this.f_19784 = var4.x - var3.x;
         this.f_19785 = var4.y - var3.y;
         this.f_19786 = var4.z - var3.z;
         double var8 = var2.getBbHeight();
         this.f_19787 = var3.x - this.f_19784 * var5 + (f_19796 + f_19797 * Math.random());
         this.f_19788 = var3.y - this.f_19785 * var5 + (var8 / f_19798 + var8 / f_19799 * Math.random() * f_19800);
         this.f_19789 = var3.z - this.f_19786 * var5 + (f_19801 + f_19802 * Math.random());
         this.f_19790 = this.f_19787;
         this.f_19791 = this.f_19788;
         this.f_19792 = this.f_19789;
         this.f_19784 = this.f_19784 * f_19803;
         this.f_19785 = this.f_19785 * f_19804;
         this.f_19786 = this.f_19786 * f_19805;
         this.m_6526();
      }

      public void m_6530() {
         float var1 = f_19806;
         if (this.f_19793 < this.f_19794) {
            this.f_19793 = Math.min(this.f_19794, this.f_19793 + var1);
         } else if (this.f_19793 > this.f_19794) {
            this.f_19793 = Math.max(this.f_19794, this.f_19793 - var1);
         }
      }

      public double m_6531(float var1) {
         return this.f_19790 + (this.f_19787 - this.f_19790) * var1;
      }
   }

   private record PPyg3nrQoqpsQVSY(Vec3 position, long time) {
   }

   private static final class oJj2HqDwZQ01gcY5 {
      public final Vec3 f_19825;
      public final Vec3 f_19826;
      public final float f_19827;
      public final float f_19828;
      public final float f_19829;
      public final long f_19830;
      public final long f_19831;
      public static final double f_19832 = Math.PI;
      public static final double f_19833 = 0.5;
      public static final double f_19834 = 0.85;

      public boolean m_6532(long var1) {
         return var1 - this.f_19830 >= this.f_19831;
      }

      public float m_6533(long var1) {
         float var3 = this.m_6534(var1);
         float var4 = 1.0F - var3;
         return Mth.clamp((float)Math.pow(Math.sin(var4 * f_19832 * f_19833), f_19834), 0.0F, 1.0F);
      }

      public oJj2HqDwZQ01gcY5(Vec3 var1, Vec3 var2, float var3, float var4, float var5, long var6) {
         this.f_19825 = var1;
         this.f_19826 = var2;
         this.f_19827 = var3;
         this.f_19828 = var4;
         this.f_19829 = var5;
         this.f_19830 = System.currentTimeMillis();
         this.f_19831 = var6;
      }

      public float m_6534(long var1) {
         return Mth.clamp((float)(var1 - this.f_19830) / (float)this.f_19831, 0.0F, 1.0F);
      }
   }

   private record t5bTcAeukGu2cUSl(Identifier id, int w, int h) {
      public int m_6535() {
         return this.h;
      }

      public int m_6536() {
         return this.w;
      }

      public Identifier m_6537() {
         return this.id;
      }
   }

   private final class vvQAAUQxC5e74yHO {
      public final List<Trails.t5bTcAeukGu2cUSl> f_19835;
      public final boolean f_19836 = !Trails.this.f_19897.isEmpty() && Trails.this.f_19900.nextInt(100) > 40 && !Trails.this.f_19898.isEmpty();
      public final long f_19837 = System.currentTimeMillis();
      public final long f_19838;

      public Trails.t5bTcAeukGu2cUSl m_6538() {
         if (this.f_19836 && !this.f_19835.isEmpty()) {
            float var1 = this.f_19835.size();
            int var2 = (int)(System.currentTimeMillis() - this.f_19837);
            float var3 = var2 % (int)Math.max(this.f_19838, 1L) / (float)Math.max(this.f_19838, 1L);
            int var4 = Mth.clamp((int)(var3 * var1), 0, this.f_19835.size() - 1);
            return this.f_19835.get(var4);
         } else {
            return this.f_19835.isEmpty() ? null : this.f_19835.getFirst();
         }
      }

      public vvQAAUQxC5e74yHO() {
         if (this.f_19836) {
            this.f_19835 = Trails.this.f_19898.get(Trails.this.f_19900.nextInt(Trails.this.f_19898.size()));
            this.f_19838 = Trails.this.m_6596();
         } else {
            this.f_19835 = List.of(Trails.this.f_19897.get(Trails.this.f_19900.nextInt(Trails.this.f_19897.size())));
            this.f_19838 = 1L;
         }
      }
   }

   private static final class xoZ2FYFe78sabeQp {
      public double f_19839;
      public double f_19840;
      public double f_19841;
      public double f_19842;
      public double f_19843;
      public double f_19844;
      public double f_19845;
      public final float f_19846;
      public final float f_19847;
      public final long f_19848;
      public static final float f_19849 = 360.0F;
      public static final float f_19850 = -90.0F;
      public static final float f_19851 = 180.0F;
      public static final double f_19852 = 50.0;
      public static final double f_19853 = 1000.0;
      public static final float f_19854 = 90.0F;

      public double m_6539(float var1) {
         return this.f_19842 + (this.f_19839 - this.f_19842) * var1;
      }

      public double m_6540() {
         return Mth.clamp((System.currentTimeMillis() - this.f_19848) / f_19853, 0.0, 1.0);
      }

      public boolean m_6541() {
         return this.m_6540() >= 1.0;
      }

      public double m_6542(float var1) {
         return this.f_19844 + (this.f_19841 - this.f_19844) * var1;
      }

      public double m_6543(float var1) {
         return this.f_19843 + (this.f_19840 - this.f_19843) * var1;
      }

      public xoZ2FYFe78sabeQp(float var1) {
         this.f_19846 = (float)Math.random() * f_19849;
         this.f_19847 = f_19850 + (float)Math.random() * f_19851;
         this.f_19848 = System.currentTimeMillis();
         this.f_19845 = Math.random() / f_19852 * var1;
      }

      public void m_6544() {
         float var1 = (float)Math.toRadians(this.f_19846);
         this.f_19842 = this.f_19839;
         this.f_19843 = this.f_19840;
         this.f_19844 = this.f_19841;
         this.f_19839 = this.f_19839 + Mth.sin(var1) * this.f_19845;
         this.f_19840 = this.f_19840 + Mth.cos((float)Math.toRadians(this.f_19847 - f_19854)) * this.f_19845;
         this.f_19841 = this.f_19841 + Mth.cos(var1) * this.f_19845;
      }

      public double m_6545() {
         return 1.0 - this.m_6540();
      }
   }
}
