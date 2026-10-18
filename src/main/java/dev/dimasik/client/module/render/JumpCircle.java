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
import com.mojang.blaze3d.shaders.UniformType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.AutoStorageIndexBuffer;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.MeshData;
import com.mojang.blaze3d.vertex.MeshData.DrawState;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ColorSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_NzJrN63M7QBpmAbi;
import dev.dimasik.client.system.Class_PoKta0VE7AdhY1En;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.awt.Color;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Map.Entry;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.level.levelgen.Heightmap.Types;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;

public class JumpCircle extends Module {
   private static final Identifier f_21024 = Identifier.fromNamespaceAndPath(JumpCircle.f_21616, JumpCircle.f_21617);
   private static final Identifier f_21025 = Identifier.fromNamespaceAndPath(JumpCircle.f_21618, JumpCircle.f_21619);
   private static final int f_21026 = 200;
   private static final Identifier[] f_21027 = m_6892();
   private static final int f_21028 = 16;
   private static final int f_21029 = 32;
   private static final int f_21030 = 64;
   private static final int f_21031 = 1648;
   private final MultiChoiceSetting f_21032;
   private final SliderSetting f_21033;
   private final CheckboxSetting f_21034;
   private final ColorSetting f_21035;
   private final CheckboxSetting f_21036;
   private final SliderSetting f_21037;
   private final SliderSetting f_21038;
   private final SliderSetting f_21039;
   private final CheckboxSetting f_21040;
   private final MultiChoiceSetting f_21041;
   private final SliderSetting f_21042;
   private final SliderSetting f_21043;
   private final MultiChoiceSetting f_21044;
   private final ColorSetting f_21045;
   private final ColorSetting f_21046;
   private final CheckboxSetting f_21047;
   private final SliderSetting f_21048;
   private final SliderSetting f_21049;
   private final MultiChoiceSetting f_21050;
   private final SliderSetting f_21051;
   private final SliderSetting f_21052;
   private final SliderSetting f_21053;
   private final CheckboxSetting f_21054;
   private final SliderSetting f_21055;
   private final CheckboxSetting f_21056;
   private final SliderSetting f_21057;
   private final SliderSetting f_21058;
   private final SliderSetting f_21059;
   private final SliderSetting f_21060;
   private final SliderSetting f_21061;
   private final MultiChoiceSetting f_21062;
   private final CheckboxSetting f_21063;
   private final ColorSetting f_21064;
   private final ColorSetting f_21065;
   private final List<JumpCircle.XZJphWB0PEpxvmCO> f_21066;
   private final List<JumpCircle.Tn7GN7egil2JPY5d> f_21067;
   private final List<JumpCircle.L4HvMW3ewbw7kWEG> f_21068;
   private final List<JumpCircle.ekPSGMfqf8O4s4II> f_21069;
   private final List<JumpCircle.YER2Oe2xv4imdZce> f_21070;
   private final RenderPipeline f_21071;
   private final RenderPipeline f_21072;
   private final RenderPipeline f_21073;
   private final RenderPipeline f_21074;
   private final RenderPipeline f_21075;
   private final RenderPipeline f_21076;
   private final RenderPipeline f_21077;
   private final RenderPipeline f_21078;
   private boolean f_21079;
   private boolean f_21080;
   private boolean f_21081;
   private long f_21082;
   private AbstractTexture f_21083;
   private AbstractTexture f_21084;
   private TextureTarget f_21085;
   private TextureTarget f_21086;
   private final Matrix4f f_21087;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_21088;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_21089;
   private static final Direction[] f_21090 = new Direction[]{Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST};
   private final int[] f_21091;
   private static final String f_21092 = "dimasik";
   private static final String f_21093 = "JumpCircle";
   private static final String f_21094 = "Создаёт визуальный эффект при прыжке";
   private static final String f_21095 = "Форма";
   private static final String f_21096 = "Круг";
   private static final String f_21097 = "Ромб";
   private static final String f_21098 = "Молния";
   private static final String f_21099 = "Круг 2";
   private static final String f_21100 = "Пиявки";
   private static final String f_21101 = "Гибкий";
   private static final String f_21102 = "Радиус";
   private static final float f_21103 = 1.5F;
   private static final float f_21104 = 0.1F;
   private static final String f_21105 = "Авто цвет под тему";
   private static final String f_21106 = "Цвет свечения";
   private static final int f_21107 = -1661312;
   private static final String f_21108 = "Искажение";
   private static final String f_21109 = "Сила искажения";
   private static final float f_21110 = 18.0F;
   private static final float f_21111 = 3.0F;
   private static final float f_21112 = 40.0F;
   private static final String f_21113 = "Время жизни";
   private static final float f_21114 = 15.0F;
   private static final float f_21115 = 15.0F;
   private static final float f_21116 = 50.0F;
   private static final String f_21117 = "Радиус Круг 2";
   private static final float f_21118 = 1.25F;
   private static final float f_21119 = 0.5F;
   private static final float f_21120 = 2.5F;
   private static final float f_21121 = 0.1F;
   private static final String f_21122 = "Стекло";
   private static final String f_21123 = "Анимация";
   private static final String f_21124 = "FadeOutRotate";
   private static final String f_21125 = "FadeInOutRotate";
   private static final String f_21126 = "FadeInExponent";
   private static final String f_21127 = "Время жизни";
   private static final float f_21128 = 3500.0F;
   private static final float f_21129 = 500.0F;
   private static final float f_21130 = 5000.0F;
   private static final float f_21131 = 100.0F;
   private static final String f_21132 = "Дальность";
   private static final float f_21133 = 3.0F;
   private static final float f_21134 = 0.1F;
   private static final String f_21135 = "Режим цвета";
   private static final String f_21136 = "Радуга";
   private static final String f_21137 = "Клиент";
   private static final String f_21138 = "Свой";
   private static final String f_21139 = "Свой+Fade";
   private static final String f_21140 = "Цвет 1";
   private static final int f_21141 = -45056;
   private static final String f_21142 = "Цвет 2";
   private static final String f_21143 = "Глубокий свет";
   private static final String f_21144 = "Время";
   private static final float f_21145 = 1500.0F;
   private static final float f_21146 = 500.0F;
   private static final float f_21147 = 5000.0F;
   private static final float f_21148 = 50.0F;
   private static final String f_21149 = "Размер";
   private static final float f_21150 = 3.0F;
   private static final float f_21151 = 0.5F;
   private static final float f_21152 = 3.0F;
   private static final float f_21153 = 0.1F;
   private static final String f_21154 = "Тип анимации";
   private static final String f_21155 = "Эластичная";
   private static final String f_21156 = "Обычная";
   private static final String f_21157 = "Назад";
   private static final String f_21158 = "Сила волны";
   private static final float f_21159 = 0.2F;
   private static final float f_21160 = 3.0F;
   private static final float f_21161 = 0.1F;
   private static final String f_21162 = "Толщина волны";
   private static final float f_21163 = 0.5F;
   private static final float f_21164 = 0.3F;
   private static final float f_21165 = 0.8F;
   private static final float f_21166 = 0.05F;
   private static final String f_21167 = "Насыщенность";
   private static final float f_21168 = -1.0F;
   private static final float f_21169 = 0.05F;
   private static final String f_21170 = "Турбулентность";
   private static final String f_21171 = "Сила турбулентности";
   private static final float f_21172 = 0.5F;
   private static final float f_21173 = 0.1F;
   private static final float f_21174 = 0.1F;
   private static final String f_21175 = "Свечение волны";
   private static final String f_21176 = "Высота свечения";
   private static final float f_21177 = 22.0F;
   private static final float f_21178 = 15.0F;
   private static final float f_21179 = 45.0F;
   private static final String f_21180 = "Ширина свечения";
   private static final float f_21181 = 18.0F;
   private static final float f_21182 = 10.0F;
   private static final float f_21183 = 30.0F;
   private static final String f_21184 = "Сила цвета свечения";
   private static final float f_21185 = 70.0F;
   private static final float f_21186 = 30.0F;
   private static final float f_21187 = 100.0F;
   private static final String f_21188 = "Прозрачность свечения";
   private static final float f_21189 = 60.0F;
   private static final float f_21190 = 20.0F;
   private static final float f_21191 = 80.0F;
   private static final String f_21192 = "Сила цвета";
   private static final float f_21193 = 55.0F;
   private static final float f_21194 = 100.0F;
   private static final String f_21195 = "Режим цвета волны";
   private static final String f_21196 = "Радуга";
   private static final String f_21197 = "Клиент";
   private static final String f_21198 = "Свой";
   private static final String f_21199 = "Второй цвет";
   private static final String f_21200 = "Цвет волны";
   private static final String f_21201 = "Цвет волны 2";
   private static final int f_21202 = -1661312;
   private static final String f_21203 = "dimasik/jump_circle";
   private static final String f_21204 = "dead_chams";
   private static final String f_21205 = "dead_chams";
   private static final String f_21206 = "Sampler0";
   private static final String f_21207 = "dimasik/jump_circle_zenith";
   private static final String f_21208 = "dead_chams";
   private static final String f_21209 = "dead_chams";
   private static final String f_21210 = "Sampler0";
   private static final String f_21211 = "dimasik/jump_circle_zenith_glass";
   private static final String f_21212 = "Globals";
   private static final String f_21213 = "jump_frost";
   private static final String f_21214 = "jump_frost";
   private static final String f_21215 = "Sampler0";
   private static final String f_21216 = "dimasik/jump_circle_distortion";
   private static final String f_21217 = "jump_circle";
   private static final String f_21218 = "jump_circle_distortion";
   private static final String f_21219 = "JumpDistortion";
   private static final String f_21220 = "SceneSampler";
   private static final String f_21221 = "dimasik/jump_circle_distortion_glow";
   private static final String f_21222 = "jump_circle";
   private static final String f_21223 = "jump_circle_glow";
   private static final String f_21224 = "dimasik/jump_diamond";
   private static final String f_21225 = "jump_circle";
   private static final String f_21226 = "jump_diamond";
   private static final String f_21227 = "dimasik/jump_lightning";
   private static final String f_21228 = "jump_circle";
   private static final String f_21229 = "jump_lightning";
   private static final String f_21230 = "dimasik/jump_flex";
   private static final String f_21231 = "hands_fullscreen";
   private static final String f_21232 = "jump_flex";
   private static final String f_21233 = "JumpFlex";
   private static final String f_21234 = "SceneSampler";
   private static final String f_21235 = "DepthSampler";
   private static final String f_21236 = "Молния";
   private static final String f_21237 = "Ромб";
   private static final String f_21238 = "Круг 2";
   private static final String f_21239 = "Пиявки";
   private static final String f_21240 = "Гибкий";
   private static final String f_21241 = "FadeInOutRotate";
   private static final String f_21242 = "FadeInExponent";
   private static final float f_21243 = 0.5F;
   private static final float f_21244 = 0.5F;
   private static final double f_21245 = 90.0;
   private static final float f_21246 = 1.70158F;
   private static final double f_21247 = 3.0;
   private static final double f_21248 = 2.0;
   private static final float f_21249 = 0.5F;
   private static final double f_21250 = -90.0;
   private static final float f_21251 = 0.003921569F;
   private static final float f_21252 = 0.02F;
   private static final float f_21253 = 0.6F;
   private static final float f_21254 = 199.5F;
   private static final float f_21255 = 199.0F;
   private static final float f_21256 = 0.15F;
   private static final float f_21257 = 40.0F;
   private static final float f_21258 = 4.0F;
   private static final float f_21259 = 12.0F;
   private static final float f_21260 = 255.0F;
   private static final float f_21261 = 1.5F;
   private static final float f_21262 = 0.5F;
   private static final float f_21263 = 0.5F;
   private static final float f_21264 = 0.001F;
   private static final String f_21265 = "Sampler0";
   private static final String f_21266 = "Клиент";
   private static final String f_21267 = "Свой";
   private static final String f_21268 = "Свой+Fade";
   private static final float f_21269 = 255.0F;
   private static final float f_21270 = 255.0F;
   private static final float f_21271 = 255.0F;
   private static final float f_21272 = 0.08F;
   private static final float f_21273 = 300.0F;
   private static final float f_21274 = 0.5F;
   private static final float f_21275 = 8.0F;
   private static final float f_21276 = 360.0F;
   private static final float f_21277 = 360.0F;
   private static final float f_21278 = 0.65F;
   private static final int f_21279 = -16777216;
   private static final float f_21280 = 255.0F;
   private static final float f_21281 = 0.125F;
   private static final float f_21282 = 0.001F;
   private static final float f_21283 = 0.5F;
   private static final float f_21284 = 0.5F;
   private static final float f_21285 = -2.0F;
   private static final double f_21286 = 2.0;
   private static final double f_21287 = 2.0;
   private static final float f_21288 = (float) (Math.PI * 4.0 / 9.0);
   private static final float f_21289 = 0.5F;
   private static final double f_21290 = 2.0;
   private static final float f_21291 = 20.0F;
   private static final float f_21292 = 10.0F;
   private static final float f_21293 = 20.0F;
   private static final double f_21294 = 11.125;
   private static final double f_21295 = 2.0;
   private static final double f_21296 = 2.0;
   private static final float f_21297 = -20.0F;
   private static final float f_21298 = 10.0F;
   private static final float f_21299 = 20.0F;
   private static final double f_21300 = 11.125;
   private static final double f_21301 = 2.0;
   private static final float f_21302 = 0.5F;
   private static final double f_21303 = 2.0;
   private static final float f_21304 = 20.0F;
   private static final float f_21305 = 10.0F;
   private static final double f_21306 = 2.0;
   private static final double f_21307 = 2.0;
   private static final double f_21308 = 2.0;
   private static final float f_21309 = -20.0F;
   private static final float f_21310 = 10.0F;
   private static final double f_21311 = 2.0;
   private static final float f_21312 = (float) (Math.PI * 2.0 / 3.0);
   private static final double f_21313 = 2.0;
   private static final float f_21314 = -10.0F;
   private static final float f_21315 = 10.0F;
   private static final double f_21316 = 0.75;
   private static final float f_21317 = 1.70158F;
   private static final double f_21318 = 3.0;
   private static final double f_21319 = 2.0;
   private static final float f_21320 = 2.5F;
   private static final float f_21321 = 1250.0F;
   private static final float f_21322 = 0.34F;
   private static final float f_21323 = 0.66F;
   private static final float f_21324 = 0.34F;
   private static final float f_21325 = 0.4F;
   private static final float f_21326 = (float) Math.PI;
   private static final float f_21327 = 0.035F;
   private static final float f_21328 = 0.28F;
   private static final float f_21329 = 0.38F;
   private static final float f_21330 = (float) Math.PI;
   private static final float f_21331 = 0.012F;
   private static final float f_21332 = 0.14F;
   private static final float f_21333 = 0.86F;
   private static final float f_21334 = 0.15F;
   private static final float f_21335 = 0.55F;
   private static final float f_21336 = 1.4F;
   private static final float f_21337 = 72.0F;
   private static final float f_21338 = 0.06F;
   private static final long f_21339 = 1000000L;
   private static final float f_21340 = 1000.0F;
   private static final float f_21341 = 1.5F;
   private static final float f_21342 = 1.5F;
   private static final String f_21343 = "SceneSampler";
   private static final String f_21344 = "JumpDistortion";
   private static final String f_21345 = "Sampler0";
   private static final String f_21346 = "jump-circle-distortion-scene";
   private static final float f_21347 = 2.5F;
   private static final float f_21348 = 1250.0F;
   private static final float f_21349 = 0.34F;
   private static final float f_21350 = 0.66F;
   private static final float f_21351 = 0.34F;
   private static final float f_21352 = 0.4F;
   private static final float f_21353 = (float) Math.PI;
   private static final float f_21354 = 0.035F;
   private static final float f_21355 = 0.28F;
   private static final float f_21356 = 0.38F;
   private static final float f_21357 = (float) Math.PI;
   private static final float f_21358 = 0.012F;
   private static final float f_21359 = 0.14F;
   private static final float f_21360 = 0.86F;
   private static final float f_21361 = 0.15F;
   private static final float f_21362 = 0.55F;
   private static final float f_21363 = 72.0F;
   private static final float f_21364 = 0.06F;
   private static final long f_21365 = 100000L;
   private static final float f_21366 = 1000.0F;
   private static final float f_21367 = 1550.0F;
   private static final float f_21368 = 0.4F;
   private static final float f_21369 = 0.05F;
   private static final float f_21370 = 0.58F;
   private static final float f_21371 = 0.42000002F;
   private static final float f_21372 = 0.85F;
   private static final float f_21373 = 0.15F;
   private static final float f_21374 = 42.0F;
   private static final float f_21375 = 0.01F;
   private static final float f_21376 = 0.001F;
   private static final float f_21377 = 0.001F;
   private static final float f_21378 = 0.26F;
   private static final float f_21379 = 0.03F;
   private static final float f_21380 = 0.26F;
   private static final float f_21381 = 0.03F;
   private static final float f_21382 = 0.5F;
   private static final float f_21383 = 0.45F;
   private static final float f_21384 = 1.9F;
   private static final float f_21385 = 1.6F;
   private static final float f_21386 = 1.6F;
   private static final float f_21387 = 0.001F;
   private static final float f_21388 = 0.001F;
   private static final double f_21389 = 1.0E-4;
   private static final double f_21390 = 0.03;
   private static final double f_21391 = 0.5;
   private static final double f_21392 = 0.5;
   private static final double f_21393 = 0.5;
   private static final double f_21394 = 0.5;
   private static final double f_21395 = 0.5;
   private static final double f_21396 = 0.5;
   private static final double f_21397 = 0.5;
   private static final double f_21398 = 0.5;
   private static final double f_21399 = 0.01;
   private static final long f_21400 = 80L;
   private static final double f_21401 = 0.001;
   private static final String f_21402 = "Молния";
   private static final String f_21403 = "Пиявки";
   private static final String f_21404 = "Круг 2";
   private static final String f_21405 = "Гибкий";
   private static final float f_21406 = 0.5F;
   private static final double f_21407 = 2.0;
   private static final double f_21408 = 8.0;
   private static final long f_21409 = 100L;
   private static final float f_21410 = 3.0F;
   private static final int f_21411 = 16777215;
   private static final float f_21412 = 0.2F;
   private static final double f_21413 = 0.999;
   private static final double f_21414 = 0.999;
   private static final double f_21415 = 0.3;
   private static final double f_21416 = 2.8F;
   private static final double f_21417 = 0.6;
   private static final double f_21418 = 4.0;
   private static final double f_21419 = 4.0;
   private static final double f_21420 = 0.05;
   private static final double f_21421 = 0.5;
   private static final double f_21422 = 2.8F;
   private static final double f_21423 = 4.0;
   private static final double f_21424 = 0.6;
   private static final double f_21425 = 0.05;
   private static final double f_21426 = 0.2;
   private static final double f_21427 = 0.5;
   private static final double f_21428 = 0.5;
   private static final double f_21429 = 5.8F;
   private static final double f_21430 = 0.5;
   private static final double f_21431 = 0.5;
   private static final double f_21432 = 0.5;
   private static final double f_21433 = 0.5;
   private static final double f_21434 = 0.02;
   private static final double f_21435 = 0.02;
   private static final float f_21436 = 0.5F;
   private static final double f_21437 = 2.0;
   private static final float f_21438 = -2.55F;
   private static final float f_21439 = 5.8F;
   private static final double f_21440 = 2.55F;
   private static final double f_21441 = 2.8F;
   private static final float f_21442 = 0.04F;
   private static final float f_21443 = 1.0E-4F;
   private static final float f_21444 = 1.0E-4F;
   private static final float f_21445 = 1.0E-4F;
   private static final float f_21446 = 0.5F;
   private static final float f_21447 = 0.5F;
   private static final float f_21448 = 0.5F;
   private static final float f_21449 = 0.5F;
   private static final float f_21450 = 1.05F;
   private static final float f_21451 = 1.9F;
   private static final float f_21452 = 0.5F;
   private static final float f_21453 = 0.5F;
   private static final float f_21454 = 0.72F;
   private static final float f_21455 = (float) (Math.PI * 2);
   private static final float f_21456 = 48.0F;
   private static final float f_21457 = -Float.MAX_VALUE;
   private static final float f_21458 = 0.35F;
   private static final float f_21459 = -Float.MAX_VALUE;
   private static final float f_21460 = 0.35F;
   private static final double f_21461 = 2.3;
   private static final double f_21462 = 1.7;
   private static final double f_21463 = 1.1;
   private static final float f_21464 = 0.9F;
   private static final double f_21465 = 1.3;
   private static final double f_21466 = 2.9;
   private static final double f_21467 = 2.6;
   private static final float f_21468 = 1.3F;
   private static final double f_21469 = 3.7;
   private static final double f_21470 = 0.9;
   private static final double f_21471 = 1.8;
   private static final float f_21472 = 0.6F;
   private static final float f_21473 = 3.0F;
   private static final float f_21474 = 0.45F;
   private static final float f_21475 = 0.12F;
   private static final float f_21476 = 2.6F;
   private static final float f_21477 = 1.3F;
   private static final float f_21478 = 0.05F;
   private static final float f_21479 = 0.55F;
   private static final float f_21480 = 0.8F;
   private static final float f_21481 = 0.3F;
   private static final float f_21482 = 0.85F;
   private static final float f_21483 = 1.05F;
   private static final float f_21484 = 0.82F;
   private static final float f_21485 = 0.18F;
   private static final double f_21486 = 1.9;
   private static final double f_21487 = 7.3;
   private static final double f_21488 = 1.6;
   private static final double f_21489 = 2.1;
   private static final double f_21490 = 3.1;
   private static final float f_21491 = 1.4F;
   private static final float f_21492 = 1.0E-4F;
   private static final float f_21493 = 1.0E-4F;
   private static final float f_21494 = 0.5F;
   private static final float f_21495 = 0.5F;
   private static final float f_21496 = 0.5F;
   private static final float f_21497 = 0.5F;
   private static final float f_21498 = (float) (Math.PI * 2);
   private static final float f_21499 = 48.0F;
   private static final double f_21500 = 1.1;
   private static final float f_21501 = 4.0F;
   private static final float f_21502 = 4.0F;
   private static final float f_21503 = 6.0F;
   private static final float f_21504 = 6.0F;
   private static final float f_21505 = 360.0F;
   private static final float f_21506 = 48.0F;
   private static final double f_21507 = Math.PI;
   private static final float f_21508 = 0.001F;
   private static final float f_21509 = 0.001F;
   private static final float f_21510 = 1000.0F;
   private static final String f_21511 = "Sampler0";
   private static final String f_21512 = "Sampler0";
   private static final float f_21513 = 6.0F;
   private static final float f_21514 = 15.0F;
   private static final float f_21515 = 10.0F;
   private static final float f_21516 = 0.04F;
   private static final float f_21517 = 0.018F;
   private static final float f_21518 = 0.1F;
   private static final float f_21519 = 0.3F;
   private static final float f_21520 = 0.75F;
   private static final float f_21521 = 0.15F;
   private static final float f_21522 = 45.0F;
   private static final long f_21523 = 100000L;
   private static final float f_21524 = 1000.0F;
   private static final float f_21525 = 0.01F;
   private static final float f_21526 = 100.0F;
   private static final float f_21527 = 0.6F;
   private static final float f_21528 = 100.0F;
   private static final float f_21529 = 0.05F;
   private static final float f_21530 = 5.0F;
   private static final float f_21531 = 100.0F;
   private static final float f_21532 = 0.05F;
   private static final float f_21533 = 5.0F;
   private static final float f_21534 = 100.0F;
   private static final float f_21535 = 100.0F;
   private static final String f_21536 = "SceneSampler";
   private static final String f_21537 = "DepthSampler";
   private static final String f_21538 = "JumpFlex";
   private static final String f_21539 = "Назад";
   private static final String f_21540 = "Обычная";
   private static final String f_21541 = "Радуга";
   private static final float f_21542 = 8.0F;
   private static final float f_21543 = 360.0F;
   private static final float f_21544 = 360.0F;
   private static final int f_21545 = -16777216;
   private static final String f_21546 = "Клиент";
   private static final String f_21547 = "Свой";
   private static final int f_21548 = -16777216;
   private static final int f_21549 = -16777216;
   private static final long f_21550 = 8L;
   private static final long f_21551 = 360L;
   private static final float f_21552 = 180.0F;
   private static final String f_21553 = "Свой";
   private static final String f_21554 = "jump-flex-scene";
   private static final float f_21555 = 255.0F;
   private static final float f_21556 = 255.0F;
   private static final float f_21557 = 255.0F;
   private static final double f_21558 = 3.0E7;
   private static final String f_21559 = "jumpFlexWave";
   private static final String f_21560 = "jumpFlexWaveUniforms";
   private static final String f_21561 = "jumpCircle2";
   private static final String f_21562 = "jumpCircleZenithGlass";
   private static final String f_21563 = "jumpCircle2";
   private static final String f_21564 = "jumpShape";
   private static final String f_21565 = "jumpShapeVertices";
   private static final String f_21566 = "jumpCircle";
   private static final String f_21567 = "jumpCircleDistortionGlow";
   private static final String f_21568 = "jumpCircleDistortion";
   private static final String f_21569 = "jumpCircleDistortionUniforms";
   private static final String f_21570 = "jumpCircleVertices";
   private static final String f_21571 = "jumpLeeches";
   private static final String f_21572 = "jumpLeeches";
   private static final String f_21573 = "Гибкий";
   private static final String f_21574 = "Свой";
   private static final String f_21575 = "Гибкий";
   private static final String f_21576 = "Свой";
   private static final String f_21577 = "Гибкий";
   private static final String f_21578 = "Свой";
   private static final String f_21579 = "Гибкий";
   private static final String f_21580 = "Гибкий";
   private static final String f_21581 = "Гибкий";
   private static final String f_21582 = "Гибкий";
   private static final String f_21583 = "Гибкий";
   private static final String f_21584 = "Гибкий";
   private static final String f_21585 = "Гибкий";
   private static final String f_21586 = "Гибкий";
   private static final String f_21587 = "Гибкий";
   private static final String f_21588 = "Гибкий";
   private static final String f_21589 = "Гибкий";
   private static final String f_21590 = "Гибкий";
   private static final String f_21591 = "Гибкий";
   private static final String f_21592 = "Гибкий";
   private static final String f_21593 = "Гибкий";
   private static final String f_21594 = "Пиявки";
   private static final String f_21595 = "Пиявки";
   private static final String f_21596 = "Свой+Fade";
   private static final String f_21597 = "Пиявки";
   private static final String f_21598 = "Свой";
   private static final String f_21599 = "Свой+Fade";
   private static final String f_21600 = "Пиявки";
   private static final String f_21601 = "Пиявки";
   private static final String f_21602 = "Пиявки";
   private static final String f_21603 = "Пиявки";
   private static final String f_21604 = "Круг 2";
   private static final String f_21605 = "Круг 2";
   private static final String f_21606 = "Круг 2";
   private static final String f_21607 = "Круг";
   private static final String f_21608 = "Круг";
   private static final String f_21609 = "Пиявки";
   private static final String f_21610 = "Гибкий";
   private static final String f_21611 = "Пиявки";
   private static final String f_21612 = "Гибкий";
   private static final String f_21613 = "Пиявки";
   private static final String f_21614 = "Круг 2";
   private static final String f_21615 = "Гибкий";
   private static final String f_21616 = "dimasik";
   private static final String f_21617 = "icons/world_render/circle2.png";
   private static final String f_21618 = "dimasik";
   private static final String f_21619 = "textures/jumpcircles/zenith_circle.png";

   private void m_6828(int var1, int var2) {
      if (this.f_21086 == null) {
         this.f_21086 = new TextureTarget(f_21554, var1, var2, false, GpuFormat.RGBA8_UNORM);
      } else if (this.f_21086.width != var1 || this.f_21086.height != var2) {
         this.f_21086.resize(var1, var2);
      }
   }

   public JumpCircle() {
      super(f_21093, f_21094, Category.RENDER);
      this.f_21032 = new MultiChoiceSetting(
         f_21095,
         new Class_2ZaVm8TGDJ68TnJB(f_21096),
         new Class_2ZaVm8TGDJ68TnJB(f_21097),
         new Class_2ZaVm8TGDJ68TnJB(f_21098),
         new Class_2ZaVm8TGDJ68TnJB(f_21099),
         new Class_2ZaVm8TGDJ68TnJB(f_21100),
         new Class_2ZaVm8TGDJ68TnJB(f_21101)
      );
      this.f_21033 = new SliderSetting(f_21102, f_21103, 1.0F, 2.0F)
         .m_828(f_21104)
         .m_822(() -> !this.f_21032.m_7568(f_21613) && !this.f_21032.m_7568(f_21614) && !this.f_21032.m_7568(f_21615));
      this.f_21034 = new CheckboxSetting(f_21105, true).m_822(() -> !this.f_21032.m_7568(f_21611) && !this.f_21032.m_7568(f_21612));
      this.f_21035 = new ColorSetting(f_21106, false, f_21107)
         .m_822(() -> !this.f_21032.m_7568(f_21609) && !this.f_21032.m_7568(f_21610) && !this.f_21034.m_8768());
      this.f_21036 = new CheckboxSetting(f_21108, false).m_822(() -> this.f_21032.m_7568(f_21608));
      this.f_21037 = new SliderSetting(f_21109, f_21110, f_21111, f_21112).m_828(1.0F).m_822(() -> this.f_21032.m_7568(f_21607) && this.f_21036.m_8768());
      this.f_21038 = new SliderSetting(f_21113, f_21114, f_21115, f_21116).m_828(1.0F).m_822(() -> this.f_21032.m_7568(f_21606));
      this.f_21039 = new SliderSetting(f_21117, f_21118, f_21119, f_21120).m_828(f_21121).m_822(() -> this.f_21032.m_7568(f_21605));
      this.f_21040 = new CheckboxSetting(f_21122, false).m_822(() -> this.f_21032.m_7568(f_21604));
      this.f_21041 = new MultiChoiceSetting(
            f_21123, new Class_2ZaVm8TGDJ68TnJB(f_21124), new Class_2ZaVm8TGDJ68TnJB(f_21125), new Class_2ZaVm8TGDJ68TnJB(f_21126)
         )
         .m_822(() -> this.f_21032.m_7568(f_21603));
      this.f_21042 = new SliderSetting(f_21127, f_21128, f_21129, f_21130).m_828(f_21131).m_822(() -> this.f_21032.m_7568(f_21602));
      this.f_21043 = new SliderSetting(f_21132, 2.0F, 1.0F, f_21133).m_828(f_21134).m_822(() -> this.f_21032.m_7568(f_21601));
      this.f_21044 = new MultiChoiceSetting(
            f_21135,
            new Class_2ZaVm8TGDJ68TnJB(f_21136),
            new Class_2ZaVm8TGDJ68TnJB(f_21137),
            new Class_2ZaVm8TGDJ68TnJB(f_21138),
            new Class_2ZaVm8TGDJ68TnJB(f_21139)
         )
         .m_822(() -> this.f_21032.m_7568(f_21600));
      this.f_21045 = new ColorSetting(f_21140, false, f_21141)
         .m_822(() -> this.f_21032.m_7568(f_21597) && (this.f_21044.m_7568(f_21598) || this.f_21044.m_7568(f_21599)));
      this.f_21046 = new ColorSetting(f_21142, false, -29184).m_822(() -> this.f_21032.m_7568(f_21595) && this.f_21044.m_7568(f_21596));
      this.f_21047 = new CheckboxSetting(f_21143, true).m_822(() -> this.f_21032.m_7568(f_21594));
      this.f_21048 = new SliderSetting(f_21144, f_21145, f_21146, f_21147).m_828(f_21148).m_822(() -> this.f_21032.m_7568(f_21593));
      this.f_21049 = new SliderSetting(f_21149, f_21150, f_21151, f_21152).m_828(f_21153).m_822(() -> this.f_21032.m_7568(f_21592));
      this.f_21050 = new MultiChoiceSetting(
            f_21154, new Class_2ZaVm8TGDJ68TnJB(f_21155), new Class_2ZaVm8TGDJ68TnJB(f_21156), new Class_2ZaVm8TGDJ68TnJB(f_21157)
         )
         .m_822(() -> this.f_21032.m_7568(f_21591));
      this.f_21051 = new SliderSetting(f_21158, 1.0F, f_21159, f_21160).m_828(f_21161).m_822(() -> this.f_21032.m_7568(f_21590));
      this.f_21052 = new SliderSetting(f_21162, f_21163, f_21164, f_21165).m_828(f_21166).m_822(() -> this.f_21032.m_7568(f_21589));
      this.f_21053 = new SliderSetting(f_21167, 0.0F, f_21168, 1.0F).m_828(f_21169).m_822(() -> this.f_21032.m_7568(f_21588));
      this.f_21054 = new CheckboxSetting(f_21170, true).m_822(() -> this.f_21032.m_7568(f_21587));
      this.f_21055 = new SliderSetting(f_21171, f_21172, f_21173, 2.0F).m_828(f_21174).m_822(() -> this.f_21032.m_7568(f_21586) && this.f_21054.m_8768());
      this.f_21056 = new CheckboxSetting(f_21175, true).m_822(() -> this.f_21032.m_7568(f_21585));
      this.f_21057 = new SliderSetting(f_21176, f_21177, f_21178, f_21179).m_828(1.0F).m_822(() -> this.f_21032.m_7568(f_21584) && this.f_21056.m_8768());
      this.f_21058 = new SliderSetting(f_21180, f_21181, f_21182, f_21183).m_828(1.0F).m_822(() -> this.f_21032.m_7568(f_21583) && this.f_21056.m_8768());
      this.f_21059 = new SliderSetting(f_21184, f_21185, f_21186, f_21187).m_828(1.0F).m_822(() -> this.f_21032.m_7568(f_21582) && this.f_21056.m_8768());
      this.f_21060 = new SliderSetting(f_21188, f_21189, f_21190, f_21191).m_828(1.0F).m_822(() -> this.f_21032.m_7568(f_21581) && this.f_21056.m_8768());
      this.f_21061 = new SliderSetting(f_21192, f_21193, 0.0F, f_21194).m_828(1.0F).m_822(() -> this.f_21032.m_7568(f_21580));
      this.f_21062 = new MultiChoiceSetting(
            f_21195, new Class_2ZaVm8TGDJ68TnJB(f_21196), new Class_2ZaVm8TGDJ68TnJB(f_21197), new Class_2ZaVm8TGDJ68TnJB(f_21198)
         )
         .m_822(() -> this.f_21032.m_7568(f_21579));
      this.f_21063 = new CheckboxSetting(f_21199, false).m_822(() -> this.f_21032.m_7568(f_21577) && this.f_21062.m_7568(f_21578));
      this.f_21064 = new ColorSetting(f_21200, false, -1).m_822(() -> this.f_21032.m_7568(f_21575) && this.f_21062.m_7568(f_21576));
      this.f_21065 = new ColorSetting(f_21201, false, f_21202)
         .m_822(() -> this.f_21032.m_7568(f_21573) && this.f_21062.m_7568(f_21574) && this.f_21063.m_8768());
      this.f_21066 = new ArrayList<>();
      this.f_21067 = new ArrayList<>();
      this.f_21068 = new ArrayList<>();
      this.f_21069 = new ArrayList<>();
      this.f_21070 = new ArrayList<>();
      this.f_21071 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_21203)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_21204))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_21205))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2741(f_21206)
         .m_2732(BlendFunction.ADDITIVE)
         .m_2722();
      this.f_21072 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_21207)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_21208))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_21209))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2741(f_21210)
         .m_2732(BlendFunction.OVERLAY)
         .m_2722();
      this.f_21073 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_21211)
         .m_2729(f_21212, UniformType.UNIFORM_BUFFER)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_21213))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_21214))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2741(f_21215)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2722();
      this.f_21074 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_21216)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_21217))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_21218))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2729(f_21219, UniformType.UNIFORM_BUFFER)
         .m_2741(f_21220)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2722();
      this.f_21075 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_21221)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_21222))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_21223))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2732(BlendFunction.ADDITIVE)
         .m_2722();
      this.f_21076 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_21224)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_21225))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_21226))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2732(BlendFunction.ADDITIVE)
         .m_2722();
      this.f_21077 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_21227)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_21228))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_21229))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2732(BlendFunction.ADDITIVE)
         .m_2722();
      this.f_21078 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_21230)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_21231))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_21232))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2727()
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_21233, UniformType.UNIFORM_BUFFER)
         .m_2741(f_21234)
         .m_2741(f_21235)
         .m_2722();
      this.f_21079 = true;
      this.f_21087 = new Matrix4f();
      this.f_21088 = this::m_6898;
      this.f_21089 = this::m_6927;
      this.f_21091 = new int[49];
      this.m_795(
         this.f_21032,
         this.f_21033,
         this.f_21034,
         this.f_21035,
         this.f_21036,
         this.f_21037,
         this.f_21038,
         this.f_21039,
         this.f_21040,
         this.f_21041,
         this.f_21042,
         this.f_21043,
         this.f_21044,
         this.f_21045,
         this.f_21046,
         this.f_21047,
         this.f_21048,
         this.f_21049,
         this.f_21050,
         this.f_21051,
         this.f_21052,
         this.f_21053,
         this.f_21054,
         this.f_21055,
         this.f_21056,
         this.f_21057,
         this.f_21058,
         this.f_21059,
         this.f_21060,
         this.f_21061,
         this.f_21062,
         this.f_21063,
         this.f_21064,
         this.f_21065
      );
   }

   private JumpCircle.ekPSGMfqf8O4s4II m_6830(Entity var1, double var2, double var4, double var6, float var8) {
      float var9 = var8 + f_21436;
      int var10 = m_6885(var8);
      double var11 = var2 - var9;
      double var13 = var6 - var9;
      double var15 = f_21437 * var9 / (var10 - 1);
      float[] var17 = new float[var10 * var10];
      float[] var18 = new float[var10 * var10];
      boolean[] var19 = new boolean[var10 * var10];

      for (int var20 = 0; var20 < var10; var20++) {
         for (int var21 = 0; var21 < var10; var21++) {
            double var22 = var11 + var20 * var15;
            double var24 = var13 + var21 * var15;
            float var26 = this.m_6897(var1, var22, var24, var4);
            float var27 = var26 - (float)var4;
            int var28 = var20 * var10 + var21;
            var18[var28] = var27 >= f_21438 ? 1.0F : 0.0F;
            var19[var28] = var27 > f_21439;
            var17[var28] = Mth.clamp(var26, (float)(var4 - f_21440), (float)(var4 + f_21441));
         }
      }

      m_6905(var17, var18, var19, var10);
      return new JumpCircle.ekPSGMfqf8O4s4II(
         new Vec3(var2, var4, var6), var8, var11, var13, var15, var10, var17, var18, var19, this.m_6846(var1, var2, var4, var6, var8)
      );
   }

   private void m_6831(BufferBuilder var1, Identifier var2, int var3) {
      MeshData var4 = var1.build();
      if (var4 != null) {
         if (var3 == 0) {
            var4.close();
         } else {
            GpuBuffer var5 = null;

            try {
               DrawState var6 = var4.drawState();
               int var7 = var6.indexCount();
               AutoStorageIndexBuffer var8 = RenderSystem.getSequentialBuffer(var6.primitiveTopology());
               GpuBuffer var9 = var8.getBuffer(var7);
               IndexType var10 = var8.type();
               var5 = RenderSystem.getDevice().createBuffer(() -> f_21572, 32, var4.vertexBuffer());
               RenderTarget var11 = f_11537.gameRenderer.mainRenderTarget();
               CommandEncoder var12 = RenderSystem.getDevice().createCommandEncoder();
               AbstractTexture var13 = f_11537.getTextureManager().getTexture(var2);
               RenderPass var14 = var12.createRenderPass(
                  () -> f_21571, var11.getColorTextureView(), Optional.empty(), var11.getDepthTextureView(), OptionalDouble.empty()
               );

               try {
                  RenderSystem.bindDefaultUniforms(var14);
                  var14.bindTexture(f_21265, var13.getTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
                  var14.setPipeline(this.f_21071);
                  var14.setVertexBuffer(0, var5.slice());
                  var14.setIndexBuffer(var9, var10);
                  var14.drawIndexed(var7, 1, 0, 0, 0);
               } catch (Throwable var22) {
                  if (var14 != null) {
                     try {
                        var14.close();
                     } catch (Throwable var21) {
                        var22.addSuppressed(var21);
                     }
                  }

                  throw var22;
               }

               if (var14 != null) {
                  var14.close();
               }
            } finally {
               if (var5 != null) {
                  var5.close();
               }

               var4.close();
            }
         }
      }
   }

   private static float m_6833(float var0) {
      var0 = Mth.clamp(var0, 0.0F, 1.0F);
      if (var0 != 0.0F && var0 != 1.0F) {
         float var1 = f_21288;
         return var0 < f_21289
            ? (float)(-(Math.pow(f_21290, f_21291 * var0 - f_21292) * Math.sin((f_21293 * var0 - f_21294) * var1)) / f_21295)
            : (float)(Math.pow(f_21296, f_21297 * var0 + f_21298) * Math.sin((f_21299 * var0 - f_21300) * var1) / f_21301 + 1.0);
      } else {
         return var0;
      }
   }

   private BlockHitResult m_6835(Entity var1, double var2, double var4, double var6, double var8) {
      Vec3 var10 = new Vec3(var2, var6, var4);
      Vec3 var11 = new Vec3(var2, var8, var4);
      return f_11537.level.clip(new ClipContext(var10, var11, Block.COLLIDER, Fluid.NONE, var1));
   }

   private void m_6837(
      BufferBuilder var1, Matrix4f var2, JumpCircle.ekPSGMfqf8O4s4II var3, Vec3 var4, float var5, float var6, float var7, float[] var8, float var9, float var10
   ) {
      double var11 = Mth.lerp(var9, var8[0], var8[2]);
      double var13 = Mth.lerp(var9, var8[1], var8[3]);
      double var15 = var8[4] + var10;
      double var17 = var11 - var3.f_21007.x;
      double var19 = var13 - var3.f_21007.z;
      float var21 = (float)Math.sqrt(var17 * var17 + var19 * var19);
      float var22 = var21 / var5;
      float var23 = (float)(var15 - var3.f_21007.y);
      float var24 = m_6912(var11, var15, var13, var7);
      float var25 = var23 + f_21474 * var24;
      float var26 = var22 + f_21475 * var24;
      float var27 = Math.min(f_21476, Math.max(0.0F, var5 - var21) * f_21477);
      float var28 = var27 > f_21478 ? 1.0F - m_6849(var27 * f_21479, var27, var25) : 0.0F;
      float var29 = f_21480 * m_6849(0.0F, f_21481, var23) * var28 * (1.0F - m_6849(f_21482, f_21483, var26));
      float var30 = f_21484 + f_21485 * m_6912(var11 * f_21486 + f_21487, var15 * f_21488, var13 * f_21489 - f_21490, var7 * f_21491);
      float var31 = var6 * var29 * var30;
      float var32 = Math.min(var22, 1.0F);
      float var33 = var21 > f_21492 ? (float)(var17 / var21) : 0.0F;
      float var34 = var21 > f_21493 ? (float)(var19 / var21) : 0.0F;
      float var35 = f_21494 + var33 * var32 * f_21495;
      float var36 = f_21496 + var34 * var32 * f_21497;
      float var37 = (float)Math.atan2(var19, var17);
      int var38 = Math.floorMod(Math.round(var37 / f_21498 * f_21499), 48);
      int var39 = this.f_21034.m_8768() ? this.f_21091[var38] : this.m_6855();
      this.m_6913(
         var1,
         var2,
         (float)(var11 - var4.x),
         (float)(var15 - var4.y),
         (float)(var13 - var4.z),
         var35,
         var36,
         Class_BftdentXEtGbugJw.m_2298(m_6896(var39, var31))
      );
   }

   private void m_6840(Class_TZhU50s8XmBQCMP5 var1) {
      if (!this.f_21067.isEmpty()) {
         Vec3 var2 = f_11537.gameRenderer.mainCamera().position();
         Matrix4f var3 = var1.m_5006().last().pose();
         Vector4f var4 = Class_BftdentXEtGbugJw.m_2298(this.m_6855());
         BufferBuilder var5 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
         int var6 = 0;
         long var7 = System.currentTimeMillis();
         float var9 = (float)(var7 % f_21365) / f_21366;
         Iterator var10 = this.f_21067.iterator();

         while (var10.hasNext()) {
            JumpCircle.Tn7GN7egil2JPY5d var11 = (JumpCircle.Tn7GN7egil2JPY5d)var10.next();
            float var12 = (float)(var7 - var11.f_20972) / f_21367;
            if (var12 >= 1.0F) {
               var10.remove();
            } else {
               float var13 = this.m_6868(Mth.clamp(var12 / f_21368, 0.0F, 1.0F));
               float var14 = 1.0F - this.m_6868(Mth.clamp(var12 / f_21369, 0.0F, 1.0F));
               float var15 = this.m_6868(Mth.clamp((var12 - f_21370) / f_21371, 0.0F, 1.0F));
               float var16 = var13 >= 1.0F ? f_21372 + f_21373 * Mth.sin(var9 * f_21374 + var11.f_20973) : 1.0F;
               float var17 = (1.0F - var15) * var16;
               if (!(var17 <= f_21375) && !(var13 <= f_21376)) {
                  for (JumpCircle$tFkIfJnVOTxj2m2J var19 : var11.f_20974) {
                     Vec3[] var20 = var19.f_21022;
                     int var21 = var20.length - 1;
                     float var22 = Mth.clamp((var13 - var19.f_21023) / (1.0F - var19.f_21023), 0.0F, 1.0F);
                     if (!(var22 <= f_21377)) {
                        float var23 = var22 * var21;

                        for (int var24 = 0; var24 < var21 && !(var23 <= var24); var24++) {
                           float var25 = Mth.clamp(var23 - var24, 0.0F, 1.0F);
                           boolean var26 = var25 < 1.0F;
                           Vec3 var27 = var26 ? var20[var24].lerp(var20[var24 + 1], var25) : var20[var24 + 1];
                           float var28 = (float)var24 / var21;
                           float var29 = var28 + var25 / var21;
                           float var30 = Mth.lerp(var28, f_21378, f_21379) * this.f_21033.m_8768();
                           float var31 = Mth.lerp(var29, f_21380, f_21381) * this.f_21033.m_8768();
                           float var32 = Mth.lerp((var28 + var29) * f_21382, 1.0F, f_21383);
                           float var33 = var26 ? f_21384 : 1.0F;
                           float var34 = var17 * var32 * var4.w * (1.0F + var14 * f_21385) * var33;
                           float var35 = var26 ? 1.0F : Math.min(var28 * f_21386, 1.0F);
                           Vector4f var36 = new Vector4f(
                              Mth.lerp(var35, 1.0F, var4.x), Mth.lerp(var35, 1.0F, var4.y), Mth.lerp(var35, 1.0F, var4.z), Mth.clamp(var34, 0.0F, 1.0F)
                           );
                           if (var30 > f_21387 && var31 > f_21388) {
                              var6 += this.m_6931(var5, var3, var11.f_20971, var2, var20[var24], var27, var30, var31, var36);
                           }
                        }
                     }
                  }
               }
            }
         }

         this.m_6906(var5, var6, this.f_21077);
      }
   }

   private int m_6841(BufferBuilder var1, Matrix4f var2, JumpCircle.ekPSGMfqf8O4s4II var3, Vec3 var4, float var5, float var6, int var7, int var8) {
      int var9 = var3.f_21012;
      int var10 = var7 * var9 + var8;
      int var11 = var7 * var9 + var8 + 1;
      int var12 = (var7 + 1) * var9 + var8 + 1;
      int var13 = (var7 + 1) * var9 + var8;
      boolean var14 = var3.f_21015[var10];
      boolean var15 = var3.f_21015[var11];
      boolean var16 = var3.f_21015[var12];
      boolean var17 = var3.f_21015[var13];
      if (var14 && var15 && var16 && var17) {
         return 0;
      }

      float var18 = var3.f_21013[var10];
      float var19 = var3.f_21013[var11];
      float var20 = var3.f_21013[var12];
      float var21 = var3.f_21013[var13];
      float var22 = var3.f_21014[var10];
      float var23 = var3.f_21014[var11];
      float var24 = var3.f_21014[var12];
      float var25 = var3.f_21014[var13];
      if (var14 || var15 || var16 || var17) {
         float var26 = f_21457;
         if (!var14) {
            var26 = Math.max(var26, var18);
         }

         if (!var15) {
            var26 = Math.max(var26, var19);
         }

         if (!var16) {
            var26 = Math.max(var26, var20);
         }

         if (!var17) {
            var26 = Math.max(var26, var21);
         }

         if (var14) {
            var18 = var26;
         }

         if (var15) {
            var19 = var26;
         }

         if (var16) {
            var20 = var26;
         }

         if (var17) {
            var21 = var26;
         }
      }

      float var34 = Math.min(Math.min(var18, var19), Math.min(var20, var21));
      float var27 = Math.max(Math.max(var18, var19), Math.max(var20, var21));
      int var28 = Mth.clamp((int)Math.ceil((var27 - var34) / f_21458), 1, 8);
      boolean var29 = Math.abs(var18 - var21) + Math.abs(var19 - var20) >= Math.abs(var18 - var19) + Math.abs(var21 - var20);
      byte var30 = 0;

      for (int var31 = 0; var31 < var28; var31++) {
         float var32 = (float)var31 / var28;
         float var33 = (float)(var31 + 1) / var28;
         if (var29) {
            this.m_6881(var1, var2, var3, var4, var5, var6, var7, var8, var32, 0.0F, var18, var22);
            this.m_6881(var1, var2, var3, var4, var5, var6, var7, var8, var32, 1.0F, var21, var25);
            this.m_6881(var1, var2, var3, var4, var5, var6, var7, var8, var33, 1.0F, var20, var24);
            this.m_6881(var1, var2, var3, var4, var5, var6, var7, var8, var33, 0.0F, var19, var23);
         } else {
            this.m_6881(var1, var2, var3, var4, var5, var6, var7, var8, 0.0F, var32, var18, var22);
            this.m_6881(var1, var2, var3, var4, var5, var6, var7, var8, 0.0F, var33, var21, var25);
            this.m_6881(var1, var2, var3, var4, var5, var6, var7, var8, 1.0F, var33, var20, var24);
            this.m_6881(var1, var2, var3, var4, var5, var6, var7, var8, 1.0F, var32, var19, var23);
         }

         var30 += 4;
      }

      return var30;
   }

   private float m_6842(float var1) {
      float var2 = Mth.clamp(var1, 0.0F, 1.0F);
      if (this.f_21050.m_7568(f_21539)) {
         return m_6852(var2);
      } else {
         return this.f_21050.m_7568(f_21540) ? var2 : m_6910(var2);
      }
   }

   private static void m_6844(float[] var0, int var1, int var2) {
      var0[var1] = (var2 >> 16 & 0xFF) / f_21555;
      var0[var1 + 1] = (var2 >> 8 & 0xFF) / f_21556;
      var0[var1 + 2] = (var2 & 0xFF) / f_21557;
      var0[var1 + 3] = 1.0F;
   }

   private List<float[]> m_6846(Entity var1, double var2, double var4, double var6, float var8) {
      ArrayList var9 = new ArrayList();
      double var10 = var8 + f_21426;
      int var12 = Mth.floor(var2 - var10);
      int var13 = Mth.floor(var2 + var10);
      int var14 = Mth.floor(var6 - var10);
      int var15 = Mth.floor(var6 + var10);
      int var16 = Mth.floor(var4) - 1;
      int var17 = Mth.floor(var4) + 2;
      MutableBlockPos var18 = new MutableBlockPos();

      for (int var19 = var12; var19 <= var13; var19++) {
         for (int var20 = var14; var20 <= var15; var20++) {
            float var21 = this.m_6897(var1, var19 + f_21427, var20 + f_21428, var4);
            if (var21 - var4 <= f_21429) {
               for (int var22 = var16; var22 <= var17; var22++) {
                  var18.set(var19, var22, var20);
                  VoxelShape var23 = f_11537.level.getBlockState(var18).getCollisionShape(f_11537.level, var18);
                  if (m_6872(var23)) {
                     for (Direction var27 : f_21090) {
                        var18.set(var19 + var27.getStepX(), var22, var20 + var27.getStepZ());
                        VoxelShape var28 = f_11537.level.getBlockState(var18).getCollisionShape(f_11537.level, var18);
                        boolean var29 = var28.isEmpty() || !m_6872(var28);
                        var18.set(var19, var22, var20);
                        if (var29) {
                           double var30 = var19 + f_21430 + var27.getStepX() * f_21431;
                           double var32 = var20 + f_21432 + var27.getStepZ() * f_21433;
                           if (!((var2 - var30) * var27.getStepX() + (var6 - var32) * var27.getStepZ() <= 0.0)) {
                              float var34;
                              float var35;
                              float var36;
                              float var37;
                              if (var27.getStepZ() != 0) {
                                 var34 = var19;
                                 var36 = var19 + 1;
                                 var35 = var37 = (float)(var20 + (var27 == Direction.SOUTH ? 1.0 : 0.0) + var27.getStepZ() * f_21434);
                              } else {
                                 var35 = var20;
                                 var37 = var20 + 1;
                                 var34 = var36 = (float)(var19 + (var27 == Direction.EAST ? 1.0 : 0.0) + var27.getStepX() * f_21435);
                              }

                              double var38 = Mth.clamp(var2, Math.min(var34, var36), Math.max(var34, var36)) - var2;
                              double var40 = Mth.clamp(var6, Math.min(var35, var37), Math.max(var35, var37)) - var6;
                              if (!(var38 * var38 + var40 * var40 > var10 * var10)) {
                                 var9.add(new float[]{var34, var35, var36, var37, var22});
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var9;
   }

   private static float m_6849(float var0, float var1, float var2) {
      float var3 = Mth.clamp((var2 - var0) / (var1 - var0), 0.0F, 1.0F);
      return var3 * var3 * (f_21410 - 2.0F * var3);
   }

   private static float m_6852(float var0) {
      var0 = Mth.clamp(var0, 0.0F, 1.0F);
      float var1 = f_21317;
      float var2 = var1 + 1.0F;
      return 1.0F + var2 * (float)Math.pow(var0 - 1.0F, f_21318) + var1 * (float)Math.pow(var0 - 1.0F, f_21319);
   }

   private static float m_6854(float var0) {
      var0 = Mth.clamp(var0, 0.0F, 1.0F);
      return (float)Math.sqrt(1.0 - Math.pow(var0 - 1.0F, f_21287));
   }

   private int m_6855() {
      return this.f_21034.m_8768() ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : this.f_21035.m_8768();
   }

   private void m_6856(Class_TZhU50s8XmBQCMP5 var1) {
      if (!this.f_21066.isEmpty()) {
         if (this.f_21083 == null) {
            this.f_21083 = f_11537.getTextureManager().getTexture(f_21024);
         }

         if (this.f_21083 != null) {
            float var2 = var1.m_5005().getGameTimeDeltaPartialTick(true);
            float var3 = ((float)f_11537.level.getGameTime() + var2) * f_21320;
            Vec3 var4 = f_11537.gameRenderer.mainCamera().position();
            Matrix4f var5 = var1.m_5006().last().pose();
            boolean var6 = this.f_21036.m_8768();
            BufferBuilder var7 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
            byte var8 = 0;
            Iterator var9 = this.f_21066.iterator();

            while (var9.hasNext()) {
               JumpCircle.XZJphWB0PEpxvmCO var10 = (JumpCircle.XZJphWB0PEpxvmCO)var9.next();
               long var11 = System.currentTimeMillis() - var10.f_21000 - var10.f_21001;
               if (var11 >= 0L) {
                  float var13 = (float)var11 / f_21321;
                  if (var13 >= 1.0F) {
                     var9.remove();
                  } else {
                     float var14 = Mth.clamp(var13 / f_21322, 0.0F, 1.0F);
                     float var15 = Mth.clamp((var13 - f_21323) / f_21324, 0.0F, 1.0F);
                     float var16 = this.m_6868(var14);
                     float var17 = this.m_6868(var15);
                     float var18 = this.m_6934(Mth.clamp(var13 / f_21325, 0.0F, 1.0F));
                     float var19 = Mth.sin(var14 * f_21326) * f_21327;
                     float var20 = Mth.sin(Mth.clamp((var13 - f_21328) / f_21329, 0.0F, 1.0F) * f_21330) * f_21331;
                     float var21 = var16 * (1.0F - var17) * var10.f_21002;
                     float var22 = f_21332 + var18 * f_21333 + var19 + var20 + var17 * f_21334 + var10.f_21003;
                     float var23 = this.f_21033.m_8768() * f_21335;
                     float var24 = var23 * var22;
                     float var25 = var6 ? var24 * f_21336 : var24;
                     Vector4f var26 = Class_BftdentXEtGbugJw.m_2298(this.m_6855());
                     Vector4f var27 = new Vector4f(var26.x, var26.y, var26.z, var26.w * var21);
                     float var28 = var6 ? 0.0F : (float)Math.toRadians(var3 + var13 * f_21337 + (float)var10.f_21001 * f_21338);
                     this.m_6894(var7, var5, var10.f_20999, var4, var25, var25, var28, var27);
                     var8 += 4;
                  }
               }
            }

            MeshData var44 = var7.build();
            if (var44 != null) {
               if (var8 == 0) {
                  var44.close();
               } else {
                  RenderPass var45 = null;
                  GpuBuffer var12 = null;
                  GpuBuffer var46 = null;

                  try {
                     RenderTarget var47 = f_11537.gameRenderer.mainRenderTarget();
                     CommandEncoder var48 = RenderSystem.getDevice().createCommandEncoder();
                     float var49 = (float)(System.currentTimeMillis() % f_21339) / f_21340;
                     float var50 = Math.max(1.0F, f_11537.getWindow().getScreenHeight());
                     float var51 = f_21341 * (2.0F * (float)f_11537.mouseHandler.xpos() - f_11537.getWindow().getScreenWidth()) / var50;
                     float var52 = f_21342
                        * (2.0F * (f_11537.getWindow().getScreenHeight() - (float)f_11537.mouseHandler.ypos()) - f_11537.getWindow().getScreenHeight())
                        / var50;
                     DrawState var53 = var44.drawState();
                     int var54 = var53.indexCount();
                     AutoStorageIndexBuffer var55 = RenderSystem.getSequentialBuffer(var53.primitiveTopology());
                     GpuBuffer var56 = var55.getBuffer(var54);
                     IndexType var57 = var55.type();
                     var12 = RenderSystem.getDevice().createBuffer(() -> f_21570, 32, var44.vertexBuffer());
                     if (var6) {
                        TextureTarget var58 = this.m_6920(var47);
                        var48.copyTextureToTexture(var47.getColorTexture(), var58.getColorTexture(), 0, 0, 0, 0, 0, var47.width, var47.height);
                        MemoryStack var59 = MemoryStack.stackPush();

                        try {
                           ByteBuffer var62 = Std140Builder.onStack(var59, 32)
                              .putVec2(var47.width, var47.height)
                              .putFloat(this.f_21037.m_8768())
                              .putFloat(var49)
                              .putVec2(var51, var52)
                              .align(16)
                              .get();
                           var46 = RenderSystem.getDevice().createBuffer(() -> f_21569, 128, var62);
                        } catch (Throwable var42) {
                           if (var59 != null) {
                              try {
                                 var59.close();
                              } catch (Throwable var39) {
                                 var42.addSuppressed(var39);
                              }
                           }

                           throw var42;
                        }

                        if (var59 != null) {
                           var59.close();
                        }

                        RenderPass var60 = var48.createRenderPass(
                           () -> f_21568, var47.getColorTextureView(), Optional.empty(), var47.getDepthTextureView(), OptionalDouble.empty()
                        );

                        try {
                           RenderSystem.bindDefaultUniforms(var60);
                           var60.bindTexture(f_21343, var58.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
                           var60.setUniform(f_21344, var46);
                           var60.setPipeline(this.f_21074);
                           var60.setVertexBuffer(0, var12.slice());
                           var60.setIndexBuffer(var56, var57);
                           var60.drawIndexed(1, 0, var54, 0, 0);
                        } catch (Throwable var41) {
                           if (var60 != null) {
                              try {
                                 var60.close();
                              } catch (Throwable var38) {
                                 var41.addSuppressed(var38);
                              }
                           }

                           throw var41;
                        }

                        if (var60 != null) {
                           var60.close();
                        }

                        RenderPass var61 = var48.createRenderPass(
                           () -> f_21567, var47.getColorTextureView(), Optional.empty(), var47.getDepthTextureView(), OptionalDouble.empty()
                        );

                        try {
                           RenderSystem.bindDefaultUniforms(var61);
                           var61.setPipeline(this.f_21075);
                           var61.setVertexBuffer(0, var12.slice());
                           var61.setIndexBuffer(var56, var57);
                           var61.drawIndexed(1, 0, var54, 0, 0);
                        } catch (Throwable var40) {
                           if (var61 != null) {
                              try {
                                 var61.close();
                              } catch (Throwable var37) {
                                 var40.addSuppressed(var37);
                              }
                           }

                           throw var40;
                        }

                        if (var61 != null) {
                           var61.close();
                        }
                     }

                     if (!var6) {
                        var45 = var48.createRenderPass(
                           () -> f_21566, var47.getColorTextureView(), Optional.empty(), var47.getDepthTextureView(), OptionalDouble.empty()
                        );
                        RenderSystem.bindDefaultUniforms(var45);
                        var45.bindTexture(f_21345, this.f_21083.getTextureView(), this.f_21083.getSampler());
                        var45.setPipeline(this.f_21071);
                        var45.setVertexBuffer(0, var12.slice());
                        var45.setIndexBuffer(var56, var57);
                        var45.drawIndexed(var54, 1, 0, 0, 0);
                     }
                  } finally {
                     if (var45 != null) {
                        var45.close();
                     }

                     if (var12 != null) {
                        var12.close();
                     }

                     if (var46 != null) {
                        var46.close();
                     }

                     var44.close();
                  }
               }
            }
         }
      }
   }

   private int m_6857(BufferBuilder var1, Matrix4f var2, Vec3 var3, JumpCircle.UsHeToQdZEutJU8u var4) {
      float var5 = var4.f_20994 * f_21263;
      float var6 = (float)Math.toRadians(var4.f_20995);
      int var7 = var4.f_20997;
      float var8 = var4.f_20996;
      Vector4f var9 = Class_BftdentXEtGbugJw.m_2298(this.m_6935(var7, var8));
      Vector4f var10 = Class_BftdentXEtGbugJw.m_2298(this.m_6935(var7 + 324, var8));
      Vector4f var11 = Class_BftdentXEtGbugJw.m_2298(this.m_6935(var7 + 648, var8));
      Vector4f var12 = Class_BftdentXEtGbugJw.m_2298(this.m_6935(var7 + 972, var8));
      float var13 = Mth.cos(var6);
      float var14 = Mth.sin(var6);
      float var15 = (float)(var4.f_20993.y - var3.y) + f_21264;
      this.m_6911(var1, var2, var4.f_20993, var3, -var5, -var5, var15, var13, var14, 0.0F, 0.0F, var9);
      this.m_6911(var1, var2, var4.f_20993, var3, -var5, var5, var15, var13, var14, 0.0F, 1.0F, var10);
      this.m_6911(var1, var2, var4.f_20993, var3, var5, var5, var15, var13, var14, 1.0F, 1.0F, var11);
      this.m_6911(var1, var2, var4.f_20993, var3, var5, -var5, var15, var13, var14, 1.0F, 0.0F, var12);
      return 4;
   }

   private int m_6859(BufferBuilder var1, Matrix4f var2, JumpCircle.ekPSGMfqf8O4s4II var3, Vec3 var4, float var5, float var6, int var7, int var8) {
      int var9 = var3.f_21012;
      int var10 = var7 * var9 + var8;
      int var11 = var7 * var9 + var8 + 1;
      int var12 = (var7 + 1) * var9 + var8 + 1;
      int var13 = (var7 + 1) * var9 + var8;
      boolean var14 = var3.f_21015[var10];
      boolean var15 = var3.f_21015[var11];
      boolean var16 = var3.f_21015[var12];
      boolean var17 = var3.f_21015[var13];
      if (var14 && var15 && var16 && var17) {
         return 0;
      }

      float var18 = var3.f_21013[var10];
      float var19 = var3.f_21013[var11];
      float var20 = var3.f_21013[var12];
      float var21 = var3.f_21013[var13];
      float var22 = var3.f_21014[var10];
      float var23 = var3.f_21014[var11];
      float var24 = var3.f_21014[var12];
      float var25 = var3.f_21014[var13];
      if (var14 || var15 || var16 || var17) {
         float var26 = f_21459;
         if (!var14) {
            var26 = Math.max(var26, var18);
         }

         if (!var15) {
            var26 = Math.max(var26, var19);
         }

         if (!var16) {
            var26 = Math.max(var26, var20);
         }

         if (!var17) {
            var26 = Math.max(var26, var21);
         }

         if (var14) {
            var18 = var26;
         }

         if (var15) {
            var19 = var26;
         }

         if (var16) {
            var20 = var26;
         }

         if (var17) {
            var21 = var26;
         }
      }

      float var34 = Math.min(Math.min(var18, var19), Math.min(var20, var21));
      float var27 = Math.max(Math.max(var18, var19), Math.max(var20, var21));
      int var28 = Mth.clamp((int)Math.ceil((var27 - var34) / f_21460), 1, 8);
      boolean var29 = Math.abs(var18 - var21) + Math.abs(var19 - var20) >= Math.abs(var18 - var19) + Math.abs(var21 - var20);
      byte var30 = 0;

      for (int var31 = 0; var31 < var28; var31++) {
         float var32 = (float)var31 / var28;
         float var33 = (float)(var31 + 1) / var28;
         if (var29) {
            this.m_6917(var1, var2, var3, var4, var5, var6, var7, var8, var32, 0.0F, var18, var19, var20, var21, var22, var23, var24, var25);
            this.m_6917(var1, var2, var3, var4, var5, var6, var7, var8, var32, 1.0F, var18, var19, var20, var21, var22, var23, var24, var25);
            this.m_6917(var1, var2, var3, var4, var5, var6, var7, var8, var33, 1.0F, var18, var19, var20, var21, var22, var23, var24, var25);
            this.m_6917(var1, var2, var3, var4, var5, var6, var7, var8, var33, 0.0F, var18, var19, var20, var21, var22, var23, var24, var25);
         } else {
            this.m_6917(var1, var2, var3, var4, var5, var6, var7, var8, 0.0F, var32, var18, var19, var20, var21, var22, var23, var24, var25);
            this.m_6917(var1, var2, var3, var4, var5, var6, var7, var8, 0.0F, var33, var18, var19, var20, var21, var22, var23, var24, var25);
            this.m_6917(var1, var2, var3, var4, var5, var6, var7, var8, 1.0F, var33, var18, var19, var20, var21, var22, var23, var24, var25);
            this.m_6917(var1, var2, var3, var4, var5, var6, var7, var8, 1.0F, var32, var18, var19, var20, var21, var22, var23, var24, var25);
         }

         var30 += 4;
      }

      return var30;
   }

   private static boolean m_6861(double var0) {
      return Double.isFinite(var0) && Math.abs(var0) <= f_21558;
   }

   private void m_6862(Class_TZhU50s8XmBQCMP5 var1) {
      if (!this.f_21069.isEmpty()) {
         long var2 = System.currentTimeMillis();
         long var4 = this.m_6908();
         this.f_21069.removeIf(var4x -> var2 - var4x.f_21017 >= var4 || var4x.m_6825(var2));
         if (!this.f_21069.isEmpty()) {
            if (this.f_21084 == null) {
               this.f_21084 = f_11537.getTextureManager().getTexture(f_21025);
            }

            for (int var6 = 0; var6 <= 48; var6++) {
               this.f_21091[var6] = Class_BftdentXEtGbugJw.m_2304((int)(var6 * f_21505 / f_21506));
            }

            Vec3 var35 = f_11537.gameRenderer.mainCamera().position();
            Matrix4f var7 = var1.m_5006().last().pose();
            BufferBuilder var8 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
            int var9 = 0;

            for (JumpCircle.ekPSGMfqf8O4s4II var11 : this.f_21069) {
               float var12 = Mth.clamp((float)(var2 - var11.f_21017) / (float)var4, 0.0F, 1.0F);
               float var13 = m_6874(var12) * var11.f_21008;
               float var14 = (float)Math.sin(var12 * f_21507) * var11.m_6827(var2);
               if (!(var13 <= f_21508) && !(var14 <= f_21509)) {
                  double var15 = var11.f_21007.x;
                  double var17 = var11.f_21007.z;
                  double var19 = var13 * var13;
                  int var21 = Math.max(0, (int)Math.floor((var15 - var13 - var11.f_21009) / var11.f_21011));
                  int var22 = Math.max(0, (int)Math.floor((var17 - var13 - var11.f_21010) / var11.f_21011));
                  int var23 = Math.min(var11.f_21012 - 2, (int)Math.ceil((var15 + var13 - var11.f_21009) / var11.f_21011));
                  int var24 = Math.min(var11.f_21012 - 2, (int)Math.ceil((var17 + var13 - var11.f_21010) / var11.f_21011));

                  for (int var25 = var21; var25 <= var23; var25++) {
                     double var26 = var11.f_21009 + var25 * var11.f_21011;

                     for (int var28 = var22; var28 <= var24; var28++) {
                        double var29 = var11.f_21010 + var28 * var11.f_21011;
                        double var31 = Mth.clamp(var15, var26, var26 + var11.f_21011) - var15;
                        double var33 = Mth.clamp(var17, var29, var29 + var11.f_21011) - var17;
                        if (!(var31 * var31 + var33 * var33 >= var19)) {
                           var9 += this.m_6859(var8, var7, var11, var35, var13, var14, var25, var28);
                        }
                     }
                  }

                  float var36 = (float)(var2 - var11.f_21017) / f_21510;

                  for (float[] var27 : var11.f_21016) {
                     var9 += this.m_6879(var8, var7, var11, var35, var13, var14, var36, var27);
                  }
               }
            }

            this.m_6893(var8, var9);
         }
      }
   }

   private static int m_6863(int var0, float var1) {
      var1 = Mth.clamp(var1, 0.0F, 1.0F);
      return Class_BftdentXEtGbugJw.m_2303(
         (int)(Class_BftdentXEtGbugJw.m_2309(var0) * var1),
         (int)(Class_BftdentXEtGbugJw.m_2299(var0) * var1),
         (int)(Class_BftdentXEtGbugJw.m_2308(var0) * var1),
         Class_BftdentXEtGbugJw.m_2297(var0)
      );
   }

   private float m_6868(float var1) {
      return var1 * var1 * var1 * (var1 * (var1 * f_21513 - f_21514) + f_21515);
   }

   private void m_6869(Class_TZhU50s8XmBQCMP5 var1) {
      float var2 = Math.max(1.0F, this.f_21048.m_8768());
      long var3 = System.currentTimeMillis();
      this.f_21070.removeIf(var3x -> (float)(var3 - var3x.f_21006) / var2 > 1.0F || !m_6936(var3x.f_21004));
      if (!this.f_21070.isEmpty()) {
         this.m_6875(var1, var2);
      }
   }

   private static boolean m_6872(VoxelShape var0) {
      return !var0.isEmpty() && net.minecraft.world.level.block.Block.isShapeFullBlock(var0);
   }

   private void m_6873(
      BufferBuilder var1, Matrix4f var2, Vec3 var3, Vec3 var4, float var5, float var6, float var7, Vector4f var8, Vector4f var9, Vector4f var10, Vector4f var11
   ) {
      float var12 = Mth.cos(var7);
      float var13 = Mth.sin(var7);
      float var14 = (float)(var3.y - var4.y) + f_21282 + var6;
      this.m_6911(var1, var2, var3, var4, -var5, -var5, var14, var12, var13, 0.0F, 0.0F, var8);
      this.m_6911(var1, var2, var3, var4, -var5, var5, var14, var12, var13, 0.0F, 1.0F, var9);
      this.m_6911(var1, var2, var3, var4, var5, var5, var14, var12, var13, 1.0F, 1.0F, var10);
      this.m_6911(var1, var2, var3, var4, var5, -var5, var14, var12, var13, 1.0F, 0.0F, var11);
   }

   private static float m_6874(float var0) {
      float var1 = 1.0F - var0;
      return 1.0F - var1 * var1 * var1;
   }

   private void m_6875(Class_TZhU50s8XmBQCMP5 var1, float var2) {
      RenderTarget var3 = f_11537.gameRenderer.mainRenderTarget();
      if (var3 != null
         && var3.getColorTexture() != null
         && var3.getDepthTexture() != null
         && !var3.getDepthTexture().isClosed()
         && var3.width > 0
         && var3.height > 0) {
         Vec3 var4 = var1.m_5010();
         this.f_21087.set(var1.m_5009()).mul(var1.m_5007()).invert();
         long var5 = System.currentTimeMillis();
         float var7 = f_21517 * this.f_21051.m_8768();
         float var8 = (float)var3.width / Math.max(1, var3.height);
         boolean var9 = this.f_21056.m_8768();
         boolean var10 = this.m_6925();
         int var11 = var10 ? this.m_6899(0) : 0;
         this.m_6828(var3.width, var3.height);
         CommandEncoder var12 = RenderSystem.getDevice().createCommandEncoder();
         var12.copyTextureToTexture(var3.getColorTexture(), this.f_21086.getColorTexture(), 0, 0, 0, 0, 0, var3.width, var3.height);
         MemoryStack var13 = MemoryStack.stackPush();

         label152: {
            try {
               Std140Builder var14 = Std140Builder.onStack(var13, 1648);
               int var15 = 0;
               float var16 = 0.0F;
               float[] var17 = new float[128];
               float[] var18 = new float[256];

               for (JumpCircle.YER2Oe2xv4imdZce var20 : this.f_21070) {
                  if (var15 >= 16) {
                     break;
                  }

                  float var21 = (float)(var5 - var20.f_21006) / var2;
                  if (!(var21 < 0.0F) && !(var21 >= 1.0F) && m_6936(var20.f_21004)) {
                     float var22 = this.m_6842(var21);
                     float var23 = Mth.clamp(var21 / f_21518, 0.0F, 1.0F);
                     float var24 = Mth.clamp((1.0F - var21) / f_21519, 0.0F, 1.0F);
                     float var25 = var23 * var24;
                     float var26 = var20.f_21005 * f_21520;
                     float var27 = Math.max(f_21521, var26 * this.f_21052.m_8768() / 2.0F);
                     int var28 = var15 * 8;
                     var17[var28] = (float)(var20.f_21004.x - var4.x);
                     var17[var28 + 1] = (float)(var20.f_21004.y - var4.y);
                     var17[var28 + 2] = (float)(var20.f_21004.z - var4.z);
                     var17[var28 + 3] = var22 * var26;
                     var17[var28 + 4] = var27;
                     var17[var28 + 5] = var7 * var25;
                     var17[var28 + 6] = var26;
                     var17[var28 + 7] = var25;
                     int var29 = var15 * 16;
                     if (var10) {
                        m_6844(var18, var29, var11);
                        m_6844(var18, var29 + 4, var11);
                        m_6844(var18, var29 + 8, var11);
                        m_6844(var18, var29 + 12, var11);
                     } else {
                        int var30 = (int)var16;
                        m_6844(var18, var29, this.m_6899(var30));
                        m_6844(var18, var29 + 4, this.m_6899(90 + var30));
                        m_6844(var18, var29 + 8, this.m_6899(180 + var30));
                        m_6844(var18, var29 + 12, this.m_6899(270 + var30));
                     }

                     var16 += f_21522 * (1.0F - var21);
                     var15++;
                  }
               }

               if (var15 == 0) {
                  break label152;
               }

               var14.putVec4(var15, var8, (float)(var5 % f_21523) / f_21524, this.f_21054.m_8768() ? f_21525 * this.f_21055.m_8768() : 0.0F);
               var14.putVec4(
                  Mth.clamp(this.f_21061.m_8768() / f_21526, 0.0F, 1.0F), Mth.clamp(1.0F + this.f_21053.m_8768(), 0.0F, 2.0F), var9 ? 1.0F : 0.0F, f_21527
               );
               var14.putVec4(
                  Mth.clamp(this.f_21057.m_8768() / f_21528, f_21529, f_21530),
                  Mth.clamp(this.f_21058.m_8768() / f_21531, f_21532, f_21533),
                  Mth.clamp(this.f_21059.m_8768() / f_21534, 0.0F, 1.0F),
                  Mth.clamp(this.f_21060.m_8768() / f_21535, 0.0F, 1.0F)
               );
               var14.putMat4f(this.f_21087);

               for (int var37 = 0; var37 < 32; var37++) {
                  int var40 = var37 * 4;
                  var14.putVec4(var17[var40], var17[var40 + 1], var17[var40 + 2], var17[var40 + 3]);
               }

               for (int var38 = 0; var38 < 64; var38++) {
                  int var41 = var38 * 4;
                  var14.putVec4(var18[var41], var18[var41 + 1], var18[var41 + 2], var18[var41 + 3]);
               }

               ByteBuffer var39 = var14.get();
               GpuBuffer var42 = RenderSystem.getDevice().createBuffer(() -> f_21560, 128, var39);

               try {
                  RenderPass var43 = var12.createRenderPass(() -> f_21559, var3.getColorTextureView(), Optional.empty());

                  try {
                     var43.setPipeline(this.f_21078);
                     var43.bindTexture(f_21536, this.f_21086.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
                     var43.bindTexture(f_21537, var3.getDepthTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
                     var43.setUniform(f_21538, var42);
                     var43.draw(3, 1, 0, 0);
                  } catch (Throwable var34) {
                     if (var43 != null) {
                        try {
                           var43.close();
                        } catch (Throwable var33) {
                           var34.addSuppressed(var33);
                        }
                     }

                     throw var34;
                  }

                  if (var43 != null) {
                     var43.close();
                  }
               } catch (Throwable var35) {
                  if (var42 != null) {
                     try {
                        var42.close();
                     } catch (Throwable var32) {
                        var35.addSuppressed(var32);
                     }
                  }

                  throw var35;
               }

               if (var42 != null) {
                  var42.close();
               }
            } catch (Throwable var36) {
               if (var13 != null) {
                  try {
                     var13.close();
                  } catch (Throwable var31) {
                     var36.addSuppressed(var31);
                  }
               }

               throw var36;
            }

            if (var13 != null) {
               var13.close();
            }

            return;
         }

         if (var13 != null) {
            var13.close();
         }
      }
   }

   private void m_6877(Class_TZhU50s8XmBQCMP5 var1) {
      if (!this.f_21066.isEmpty()) {
         float var2 = var1.m_5005().getGameTimeDeltaPartialTick(true);
         float var3 = ((float)f_11537.level.getGameTime() + var2) * f_21347;
         Vec3 var4 = f_11537.gameRenderer.mainCamera().position();
         Matrix4f var5 = var1.m_5006().last().pose();
         BufferBuilder var6 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
         byte var7 = 0;
         Iterator var8 = this.f_21066.iterator();

         while (var8.hasNext()) {
            JumpCircle.XZJphWB0PEpxvmCO var9 = (JumpCircle.XZJphWB0PEpxvmCO)var8.next();
            long var10 = System.currentTimeMillis() - var9.f_21000 - var9.f_21001;
            if (var10 >= 0L) {
               float var12 = (float)var10 / f_21348;
               if (var12 >= 1.0F) {
                  var8.remove();
               } else {
                  float var13 = Mth.clamp(var12 / f_21349, 0.0F, 1.0F);
                  float var14 = Mth.clamp((var12 - f_21350) / f_21351, 0.0F, 1.0F);
                  float var15 = this.m_6868(var13);
                  float var16 = this.m_6868(var14);
                  float var17 = this.m_6934(Mth.clamp(var12 / f_21352, 0.0F, 1.0F));
                  float var18 = Mth.sin(var13 * f_21353) * f_21354;
                  float var19 = Mth.sin(Mth.clamp((var12 - f_21355) / f_21356, 0.0F, 1.0F) * f_21357) * f_21358;
                  float var20 = var15 * (1.0F - var16) * var9.f_21002;
                  float var21 = f_21359 + var17 * f_21360 + var18 + var19 + var16 * f_21361 + var9.f_21003;
                  float var22 = this.f_21033.m_8768() * f_21362;
                  float var23 = var22 * var21;
                  Vector4f var24 = Class_BftdentXEtGbugJw.m_2298(this.m_6855());
                  Vector4f var25 = new Vector4f(var24.x, var24.y, var24.z, var24.w * var20);
                  float var26 = (float)Math.toRadians(var3 + var12 * f_21363 + (float)var9.f_21001 * f_21364);
                  this.m_6894(var6, var5, var9.f_20999, var4, var23, var23, var26, var25);
                  var7 += 4;
               }
            }
         }

         this.m_6906(var6, var7, this.f_21076);
      }
   }

   private int m_6879(BufferBuilder var1, Matrix4f var2, JumpCircle.ekPSGMfqf8O4s4II var3, Vec3 var4, float var5, float var6, float var7, float[] var8) {
      double var9 = var3.f_21007.x;
      double var11 = var3.f_21007.z;
      double var13 = Mth.clamp(var9, Math.min(var8[0], var8[2]), Math.max(var8[0], var8[2])) - var9;
      double var15 = Mth.clamp(var11, Math.min(var8[1], var8[3]), Math.max(var8[1], var8[3])) - var11;
      if (var13 * var13 + var15 * var15 >= var5 * var5 * f_21500) {
         return 0;
      }

      byte var17 = 0;

      for (int var18 = 0; var18 < 4; var18++) {
         float var19 = var18 / f_21501;
         float var20 = (var18 + 1) / f_21502;

         for (int var21 = 0; var21 < 6; var21++) {
            float var22 = var21 / f_21503;
            float var23 = (var21 + 1) / f_21504;
            this.m_6837(var1, var2, var3, var4, var5, var6, var7, var8, var19, var22);
            this.m_6837(var1, var2, var3, var4, var5, var6, var7, var8, var20, var22);
            this.m_6837(var1, var2, var3, var4, var5, var6, var7, var8, var20, var23);
            this.m_6837(var1, var2, var3, var4, var5, var6, var7, var8, var19, var23);
            var17 += 4;
         }
      }

      return var17;
   }

   private void m_6881(
      BufferBuilder var1,
      Matrix4f var2,
      JumpCircle.ekPSGMfqf8O4s4II var3,
      Vec3 var4,
      float var5,
      float var6,
      int var7,
      int var8,
      float var9,
      float var10,
      float var11,
      float var12
   ) {
      double var13 = var3.f_21009 + (var7 + var9) * var3.f_21011;
      double var15 = var3.f_21010 + (var8 + var10) * var3.f_21011;
      double var17 = var11 + f_21442;
      double var19 = var13 - var3.f_21007.x;
      double var21 = var15 - var3.f_21007.z;
      float var23 = (float)Math.sqrt(var19 * var19 + var21 * var21);
      float var24 = var23 / Math.max(f_21443, var5);
      float var25 = Math.min(var24, 1.0F);
      float var26 = var23 > f_21444 ? (float)(var19 / var23) : 0.0F;
      float var27 = var23 > f_21445 ? (float)(var21 / var23) : 0.0F;
      float var28 = f_21446 + var26 * var25 * f_21447;
      float var29 = f_21448 + var27 * var25 * f_21449;
      float var30 = 1.0F - m_6849(f_21450, f_21451, var11 - (float)var3.f_21007.y);
      float var31 = (f_21452 + f_21453 * var25) * (1.0F - m_6849(f_21454, 1.0F, var24));
      float var32 = var6 * var12 * var30 * var31;
      float var33 = (float)Math.atan2(var21, var19);
      int var34 = Math.floorMod(Math.round(var33 / f_21455 * f_21456), 48);
      int var35 = this.f_21034.m_8768() ? this.f_21091[var34] : this.m_6855();
      this.m_6913(
         var1,
         var2,
         (float)(var13 - var4.x),
         (float)(var17 - var4.y),
         (float)(var15 - var4.z),
         var28,
         var29,
         Class_BftdentXEtGbugJw.m_2298(m_6896(var35, var32))
      );
   }

   private void m_6882() {
      boolean var1 = f_11537.player.onGround();
      boolean var2 = f_11537.options.keyJump.isDown();
      boolean var3 = var2 && !this.f_21080 && var1;
      boolean var4 = this.f_21079 && !var1 && f_11537.player.getDeltaMovement().y > f_21399;
      if (var1 && !this.f_21079) {
         this.f_21081 = false;
      }

      if ((var3 || var4) && !this.f_21081) {
         this.m_6919();
         this.f_21081 = true;
      }

      this.f_21079 = var1;
      this.f_21080 = var2;
   }

   private void m_6883() {
      int var1 = 0;

      for (JumpCircle.ekPSGMfqf8O4s4II var3 : this.f_21069) {
         if (!var3.f_21018) {
            var1++;
         }
      }

      for (JumpCircle.ekPSGMfqf8O4s4II var5 : this.f_21069) {
         if (var1 < 8) {
            break;
         }

         if (!var5.f_21018) {
            var5.m_6826();
            var1--;
         }
      }
   }

   private static int m_6885(float var0) {
      float var1 = var0 + f_21406;
      return Math.max(24, Math.min(56, (int)Math.ceil(f_21407 * var1 * f_21408) + 1));
   }

   private void m_6886(Class_TZhU50s8XmBQCMP5 var1) {
      if (!this.f_21068.isEmpty()) {
         long var2 = System.currentTimeMillis();
         float var4 = this.f_21042.m_8768();
         this.f_21068.removeIf(var3 -> (float)(var2 - var3.f_20965) / var4 >= 1.0F);
         if (!this.f_21068.isEmpty()) {
            Vec3 var5 = f_11537.gameRenderer.mainCamera().position();
            Matrix4f var6 = var1.m_5006().last().pose();
            float var7 = this.f_21043.m_8768();
            boolean var8 = this.f_21047.m_8768();
            String var9 = this.f_21041.m_7564().m_1181();
            HashMap<Integer, List<JumpCircle.UsHeToQdZEutJU8u>> var10 = new HashMap<>();
            ArrayList<JumpCircle.UsHeToQdZEutJU8u> var11 = new ArrayList<>();

            for (JumpCircle.L4HvMW3ewbw7kWEG var13 : this.f_21068) {
               float var14 = (float)(var2 - var13.f_20965) / var4;
               float var15 = 1.0F - var14;
               float var16 = m_6915(1.0F - var15);
               float var17;
               float var18;
               float var19;
               switch (var9) {
                  case f_21241:
                     var17 = m_6854(m_6915(1.0F - var15));
                     if (var15 < f_21243) {
                        var17 *= m_6924(var17);
                     }

                     float var47 = var16;
                     var18 = (var15 > f_21244 ? m_6910(var47 * var47) : m_6852(var47)) * var7;
                     var19 = (float)(m_6833(var47) * f_21245 / (1.0 + var47));
                     break;
                  case f_21242:
                     var17 = m_6890(var16);
                     float var22 = f_21246;
                     float var23 = var22 + 1.0F;
                     var18 = (float)(1.0 + var23 * Math.pow(var15 - 1.0, f_21247) + var22 * Math.pow(var15 - 1.0, f_21248)) * var7;
                     var19 = 0.0F;
                     break;
                  default:
                     var17 = var14 < f_21249 ? m_6890(var16) : var16;
                     var18 = (1.0F - m_6890(var14)) * var7;
                     var19 = (float)(m_6833(var16) * f_21250);
               }

               if (!(var17 < f_21251) && !(var18 < f_21252)) {
                  float var43 = (var15 + f_21253) % 1.0F;
                  if (var43 < 0.0F) {
                     var43++;
                  }

                  int var45 = Mth.clamp((int)Math.min(var43 * f_21254, f_21255), 0, 199);
                  int var48 = var13.f_20966 * 30;
                  JumpCircle.UsHeToQdZEutJU8u var50 = new JumpCircle.UsHeToQdZEutJU8u(var13.f_20964, var18, var19, var17, var48, var45);
                  var10.computeIfAbsent(var45, var0 -> new ArrayList<>()).add(var50);
                  if (var8) {
                     var11.add(var50);
                  }
               }
            }

            for (Entry<Integer, List<JumpCircle.UsHeToQdZEutJU8u>> var31 : var10.entrySet()) {
               BufferBuilder var33 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
               int var35 = 0;

               for (JumpCircle.UsHeToQdZEutJU8u var39 : var31.getValue()) {
                  var35 += this.m_6857(var33, var6, var5, var39);
               }

               this.m_6831(var33, f_21027[var31.getKey()], var35);
            }

            if (var8) {
               for (JumpCircle.UsHeToQdZEutJU8u var32 : var11) {
                  float var34 = f_21256;
                  float var36 = m_6890(var32.f_20996);
                  float var38 = Math.max(1.0F, f_21257 * var36);
                  float var40 = var32.f_20994 * var36 / f_21258;
                  float var41 = var32.f_20994 / f_21259;
                  float var42 = (float)Math.toRadians(var32.f_20995);
                  BufferBuilder var44 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
                  byte var46 = 0;
                  int var49 = var32.f_20997;
                  int[] var51 = new int[]{
                     this.m_6935(var49, 1.0F), this.m_6935(var49 + 324, 1.0F), this.m_6935(var49 + 648, 1.0F), this.m_6935(var49 + 972, 1.0F)
                  };

                  for (int var24 = 1; var24 < (int)var38; var24++) {
                     float var25 = var24 / var38;
                     float var26 = Mth.lerp(var25 * ((var38 - 1.0F) / var38), var36 * var34, 0.0F);
                     if (!(var26 * f_21260 < 1.0F)) {
                        float var27 = var32.f_20994 + m_6854(m_6915(var25 - f_21261 / var38)) * var41;
                        float var28 = var40 * var24 / var38 - var40 / var38;
                        this.m_6873(
                           var44,
                           var6,
                           var32.f_20993,
                           var5,
                           var27 * f_21262,
                           var28,
                           var42,
                           Class_BftdentXEtGbugJw.m_2298(m_6863(var51[0], var26)),
                           Class_BftdentXEtGbugJw.m_2298(m_6863(var51[1], var26)),
                           Class_BftdentXEtGbugJw.m_2298(m_6863(var51[2], var26)),
                           Class_BftdentXEtGbugJw.m_2298(m_6863(var51[3], var26))
                        );
                        var46 += 4;
                     }
                  }

                  this.m_6831(var44, f_21027[var32.f_20998], var46);
               }
            }
         }
      }
   }

   private static float m_6890(float var0) {
      var0 = Mth.clamp(var0, 0.0F, 1.0F);
      return var0 < f_21284 ? 2.0F * var0 * var0 : 1.0F - (float)Math.pow(f_21285 * var0 + 2.0F, f_21286) / 2.0F;
   }

   private static Identifier[] m_6892() {
      Identifier[] var0 = new Identifier[200];

      for (int var1 = 0; var1 < 200; var1++) {
         var0[var1] = Identifier.fromNamespaceAndPath(f_21092, var1 + 1 + "");
      }

      return var0;
   }

   private void m_6893(BufferBuilder var1, int var2) {
      MeshData var3 = var1.build();
      if (var3 != null) {
         if (var2 == 0) {
            var3.close();
         } else {
            GpuBuffer var4 = null;

            try {
               DrawState var5 = var3.drawState();
               int var6 = var5.indexCount();
               AutoStorageIndexBuffer var7 = RenderSystem.getSequentialBuffer(var5.primitiveTopology());
               GpuBuffer var8 = var7.getBuffer(var6);
               IndexType var9 = var7.type();
               var4 = RenderSystem.getDevice().createBuffer(() -> f_21563, 32, var3.vertexBuffer());
               RenderTarget var10 = f_11537.gameRenderer.mainRenderTarget();
               CommandEncoder var11 = RenderSystem.getDevice().createCommandEncoder();
               AbstractTexture var12 = this.f_21084 != null ? this.f_21084 : f_11537.getTextureManager().getTexture(f_21025);
               if (this.f_21040.m_8768()) {
                  TextureTarget var13 = this.m_6920(var10);
                  var11.copyTextureToTexture(var10.getColorTexture(), var13.getColorTexture(), 0, 0, 0, 0, 0, var10.width, var10.height);
                  RenderPass var14 = var11.createRenderPass(
                     () -> f_21562, var10.getColorTextureView(), Optional.empty(), var10.getDepthTextureView(), OptionalDouble.empty()
                  );

                  try {
                     RenderSystem.bindDefaultUniforms(var14);
                     var14.bindTexture(f_21511, var13.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
                     var14.setPipeline(this.f_21073);
                     var14.setVertexBuffer(0, var4.slice());
                     var14.setIndexBuffer(var8, var9);
                     var14.drawIndexed(1, 0, var6, 0, 0);
                  } catch (Throwable var26) {
                     if (var14 != null) {
                        try {
                           var14.close();
                        } catch (Throwable var24) {
                           var26.addSuppressed(var24);
                        }
                     }

                     throw var26;
                  }

                  if (var14 != null) {
                     var14.close();
                  }
               }

               RenderPass var28 = var11.createRenderPass(
                  () -> f_21561, var10.getColorTextureView(), Optional.empty(), var10.getDepthTextureView(), OptionalDouble.empty()
               );

               try {
                  RenderSystem.bindDefaultUniforms(var28);
                  var28.bindTexture(f_21512, var12.getTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
                  var28.setPipeline(this.f_21072);
                  var28.setVertexBuffer(0, var4.slice());
                  var28.setIndexBuffer(var8, var9);
                  var28.drawIndexed(var6, 1, 0, 0, 0);
               } catch (Throwable var25) {
                  if (var28 != null) {
                     try {
                        var28.close();
                     } catch (Throwable var23) {
                        var25.addSuppressed(var23);
                     }
                  }

                  throw var25;
               }

               if (var28 != null) {
                  var28.close();
               }
            } finally {
               if (var4 != null) {
                  var4.close();
               }

               var3.close();
            }
         }
      }
   }

   private void m_6894(BufferBuilder var1, Matrix4f var2, Vec3 var3, Vec3 var4, float var5, float var6, float var7, Vector4f var8) {
      float var9 = Mth.cos(var7);
      float var10 = Mth.sin(var7);
      this.m_6923(var1, var2, var3, var4, -var5, -var6, var9, var10, 0.0F, 0.0F, var8);
      this.m_6923(var1, var2, var3, var4, var5, -var6, var9, var10, 1.0F, 0.0F, var8);
      this.m_6923(var1, var2, var3, var4, var5, var6, var9, var10, 1.0F, 1.0F, var8);
      this.m_6923(var1, var2, var3, var4, -var5, var6, var9, var10, 0.0F, 1.0F, var8);
   }

   private static int m_6896(int var0, float var1) {
      int var2 = Math.round((var0 >>> 24 & 0xFF) * var1);
      var2 = Mth.clamp(var2, 0, 255);
      return var2 << 24 | var0 & f_21411;
   }

   private float m_6897(Entity var1, double var2, double var4, double var6) {
      double var8 = var6 + f_21416 + f_21417;

      for (int var10 = 0; var10 < 4; var10++) {
         BlockHitResult var11 = this.m_6835(var1, var2, var4, var8, var6 - f_21418);
         if (var11.getType() != Type.BLOCK) {
            return (float)var6;
         }

         float var12 = (float)var11.getLocation().y;
         if (var11.isInside()) {
            double var13 = var6 + 1.0;
            BlockHitResult var15 = this.m_6835(var1, var2, var4, var13, var6 - f_21419);
            if (var15.getType() != Type.BLOCK) {
               return (float)var6;
            }

            float var16 = (float)var15.getLocation().y;
            boolean var17 = var15.isInside();
            if (!var17 && var16 > var13 - f_21420) {
               BlockPos var18 = BlockPos.containing(var2, var13 + f_21421, var4);
               var17 = !f_11537.level.getBlockState(var18).getCollisionShape(f_11537.level, var18).isEmpty();
            }

            if (var17) {
               return (float)(var6 + f_21422 + f_21423);
            }

            var11 = var15;
            var12 = var16;
         }

         BlockPos var19 = var11.getBlockPos().below();
         boolean var14 = var12 - var6 > f_21424 && f_11537.level.getBlockState(var19).getCollisionShape(f_11537.level, var19).isEmpty();
         if (!var14) {
            return this.m_6940(var11.getBlockPos(), var2, var4, var12);
         }

         var8 = var12 - f_21425;
      }

      return (float)var6;
   }

   public void m_6898(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.level != null && f_11537.player != null) {
         if (this.f_21083 == null) {
            this.f_21083 = f_11537.getTextureManager().getTexture(f_21024);
         }

         this.m_6882();
      } else {
         this.f_21066.clear();
         this.f_21067.clear();
         this.f_21068.clear();
         this.f_21069.clear();
         this.f_21070.clear();
         this.f_21079 = true;
         this.f_21080 = false;
         this.f_21081 = false;
      }
   }

   private int m_6899(int var1) {
      if (this.f_21062.m_7568(f_21541)) {
         float var5 = ((float)System.currentTimeMillis() / f_21542 + var1) % f_21543 / f_21544;
         if (var5 < 0.0F) {
            var5++;
         }

         return Color.HSBtoRGB(var5, 1.0F, 1.0F) | f_21545;
      } else if (!this.f_21062.m_7568(f_21546) && this.f_21062.m_7568(f_21547)) {
         int var2 = this.f_21064.m_8768() | f_21548;
         int var3 = this.f_21063.m_8768() ? this.f_21065.m_8768() | f_21549 : var2;
         if (var2 == var3) {
            return var2;
         }

         int var4 = (int)((System.currentTimeMillis() / f_21550 + var1) % f_21551);
         if (var4 >= 180) {
            var4 = 360 - var4;
         }

         return Class_BftdentXEtGbugJw.m_2312(var2, var3, var4 / f_21552);
      } else {
         return Class_BftdentXEtGbugJw.m_2300(
            Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN), Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN_TWO), var1, 8
         );
      }
   }

   private static void m_6905(float[] var0, float[] var1, boolean[] var2, int var3) {
      float[] var4 = (float[])var0.clone();
      float[] var5 = (float[])var1.clone();

      for (int var6 = 0; var6 < var3; var6++) {
         for (int var7 = 0; var7 < var3; var7++) {
            int var8 = var6 * var3 + var7;
            if (!var2[var8]) {
               float var9 = var4[var8];
               float var10 = var5[var8];

               for (int var11 = -1; var11 <= 1; var11++) {
                  for (int var12 = -1; var12 <= 1; var12++) {
                     if (var11 != 0 || var12 != 0) {
                        int var13 = var6 + var11;
                        int var14 = var7 + var12;
                        if (var13 >= 0 && var14 >= 0 && var13 < var3 && var14 < var3) {
                           int var15 = var13 * var3 + var14;
                           if (!var2[var15] && var4[var15] > var9 + f_21412) {
                              var9 = var4[var15];
                              var10 = Math.max(var10, var5[var15]);
                           }
                        }
                     }
                  }
               }

               var0[var8] = var9;
               var1[var8] = var10;
            }
         }
      }
   }

   private void m_6906(BufferBuilder var1, int var2, RenderPipeline var3) {
      MeshData var4 = var1.build();
      if (var4 != null) {
         if (var2 == 0) {
            var4.close();
         } else {
            GpuBuffer var5 = null;

            try {
               DrawState var6 = var4.drawState();
               int var7 = var6.indexCount();
               AutoStorageIndexBuffer var8 = RenderSystem.getSequentialBuffer(var6.primitiveTopology());
               GpuBuffer var9 = var8.getBuffer(var7);
               IndexType var10 = var8.type();
               var5 = RenderSystem.getDevice().createBuffer(() -> f_21565, 32, var4.vertexBuffer());
               RenderTarget var11 = f_11537.gameRenderer.mainRenderTarget();
               CommandEncoder var12 = RenderSystem.getDevice().createCommandEncoder();
               RenderPass var13 = var12.createRenderPass(
                  () -> f_21564, var11.getColorTextureView(), Optional.empty(), var11.getDepthTextureView(), OptionalDouble.empty()
               );

               try {
                  RenderSystem.bindDefaultUniforms(var13);
                  var13.setPipeline(var3);
                  var13.setVertexBuffer(0, var5.slice());
                  var13.setIndexBuffer(var9, var10);
                  var13.drawIndexed(var7, 1, 0, 0, 0);
               } catch (Throwable var21) {
                  if (var13 != null) {
                     try {
                        var13.close();
                     } catch (Throwable var20) {
                        var21.addSuppressed(var20);
                     }
                  }

                  throw var21;
               }

               if (var13 != null) {
                  var13.close();
               }
            } finally {
               if (var5 != null) {
                  var5.close();
               }

               var4.close();
            }
         }
      }
   }

   private long m_6908() {
      return Math.round(this.f_21038.m_8768()) * f_21409;
   }

   private static float m_6910(float var0) {
      var0 = Mth.clamp(var0, 0.0F, 1.0F);
      if (var0 != 0.0F && var0 != 1.0F) {
         float var1 = f_21312;
         return (float)(Math.pow(f_21313, f_21314 * var0) * Math.sin((var0 * f_21315 - f_21316) * var1) + 1.0);
      } else {
         return var0;
      }
   }

   private void m_6911(
      BufferBuilder var1,
      Matrix4f var2,
      Vec3 var3,
      Vec3 var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      Vector4f var12
   ) {
      float var13 = var5 * var8 - var6 * var9;
      float var14 = var5 * var9 + var6 * var8;
      this.m_6913(var1, var2, (float)(var3.x - var4.x) + var13, var7, (float)(var3.z - var4.z) + var14, var10, var11, var12);
   }

   private static float m_6912(double var0, double var2, double var4, float var6) {
      float var7 = Mth.sin((float)(var0 * f_21461 + var4 * f_21462 + var2 * f_21463) + var6 * f_21464);
      float var8 = Mth.sin((float)(var0 * f_21465 - var4 * f_21466 + var2 * f_21467) - var6 * f_21468);
      float var9 = Mth.sin((float)(var0 * f_21469 + var4 * f_21470 - var2 * f_21471) + var6 * f_21472);
      return (var7 + var8 + var9) / f_21473;
   }

   private void m_6913(BufferBuilder var1, Matrix4f var2, float var3, float var4, float var5, float var6, float var7, Vector4f var8) {
      var1.addVertex(var2, var3, var4, var5).setUv(var6, var7).setColor(var8.x, var8.y, var8.z, var8.w);
   }

   private static float m_6915(float var0) {
      var0 = Mth.clamp(var0, 0.0F, 1.0F);
      return var0 > f_21283 ? (1.0F - var0) * 2.0F : var0 * 2.0F;
   }

   private void m_6917(
      BufferBuilder var1,
      Matrix4f var2,
      JumpCircle.ekPSGMfqf8O4s4II var3,
      Vec3 var4,
      float var5,
      float var6,
      int var7,
      int var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16,
      float var17,
      float var18
   ) {
      float var19 = Mth.lerp(var9, Mth.lerp(var10, var11, var12), Mth.lerp(var10, var14, var13));
      float var20 = Mth.lerp(var9, Mth.lerp(var10, var11, var12), Mth.lerp(var10, var14, var13));
      float var21 = Mth.lerp(var9, Mth.lerp(var10, var15, var16), Mth.lerp(var10, var18, var17));
      this.m_6881(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var20, var21);
   }

   private void m_6919() {
      long var1 = System.currentTimeMillis();
      if (var1 - this.f_21082 >= f_21400) {
         this.f_21082 = var1;
         Vec3 var3 = new Vec3(f_11537.player.getX(), f_11537.player.getY() + f_21401, f_11537.player.getZ());
         if (this.f_21032.m_7568(f_21402)) {
            this.f_21066.clear();
            this.f_21068.clear();
            this.f_21069.clear();
            this.f_21070.clear();
            this.f_21067.add(new JumpCircle.Tn7GN7egil2JPY5d(var3, this.f_21033.m_8768()));
         } else if (this.f_21032.m_7568(f_21403)) {
            this.f_21067.clear();
            this.f_21066.clear();
            this.f_21069.clear();
            this.f_21070.clear();
            this.f_21068.add(new JumpCircle.L4HvMW3ewbw7kWEG(var3, this.f_21068.size()));

            while (this.f_21068.size() > 16) {
               this.f_21068.removeFirst();
            }
         } else if (this.f_21032.m_7568(f_21404)) {
            this.f_21067.clear();
            this.f_21066.clear();
            this.f_21068.clear();
            this.f_21070.clear();
            this.f_21069.add(this.m_6830(f_11537.player, f_11537.player.getX(), f_11537.player.getY(), f_11537.player.getZ(), this.f_21039.m_8768()));
            this.m_6883();
         } else if (this.f_21032.m_7568(f_21405)) {
            this.f_21067.clear();
            this.f_21066.clear();
            this.f_21068.clear();
            this.f_21069.clear();
            this.f_21070.add(new JumpCircle.YER2Oe2xv4imdZce(var3, this.f_21049.m_8768()));

            while (this.f_21070.size() > 16) {
               this.f_21070.removeFirst();
            }
         } else {
            this.f_21067.clear();
            this.f_21068.clear();
            this.f_21069.clear();
            this.f_21070.clear();
            this.f_21066.add(new JumpCircle.XZJphWB0PEpxvmCO(var3, 0L, 1.0F, 0.0F));
         }
      }
   }

   private TextureTarget m_6920(RenderTarget var1) {
      if (this.f_21085 == null) {
         this.f_21085 = new TextureTarget(f_21346, var1.width, var1.height, false, GpuFormat.RGBA8_UNORM);
      } else if (this.f_21085.width != var1.width || this.f_21085.height != var1.height) {
         this.f_21085.resize(var1.width, var1.height);
      }

      return this.f_21085;
   }

   private void m_6923(
      BufferBuilder var1, Matrix4f var2, Vec3 var3, Vec3 var4, float var5, float var6, float var7, float var8, float var9, float var10, Vector4f var11
   ) {
      float var12 = var5 * var7 - var6 * var8;
      float var13 = var5 * var8 + var6 * var7;
      this.m_6913(var1, var2, (float)(var3.x - var4.x) + var12, (float)(var3.y - var4.y) + f_21516, (float)(var3.z - var4.z) + var13, var9, var10, var11);
   }

   private static float m_6924(float var0) {
      var0 = Mth.clamp(var0, 0.0F, 1.0F);
      if (var0 != 0.0F && var0 != 1.0F) {
         return var0 < f_21302
            ? (float)(Math.pow(f_21303, f_21304 * var0 - f_21305) / f_21306)
            : (float)((f_21307 - Math.pow(f_21308, f_21309 * var0 + f_21310)) / f_21311);
      } else {
         return var0;
      }
   }

   private boolean m_6925() {
      if (!this.f_21062.m_7568(f_21553)) {
         return false;
      } else {
         return !this.f_21063.m_8768() ? true : this.f_21064.m_8768() == this.f_21065.m_8768();
      }
   }

   public void m_6927(Class_TZhU50s8XmBQCMP5 var1) {
      if (f_11537.level != null && f_11537.player != null) {
         this.m_6882();
         if (this.f_21032.m_7568(f_21236)) {
            this.m_6840(var1);
         } else if (this.f_21032.m_7568(f_21237)) {
            this.m_6877(var1);
         } else if (this.f_21032.m_7568(f_21238)) {
            this.m_6862(var1);
         } else if (this.f_21032.m_7568(f_21239)) {
            this.m_6886(var1);
         } else if (this.f_21032.m_7568(f_21240)) {
            this.m_6869(var1);
         } else {
            this.m_6856(var1);
         }
      } else {
         this.f_21066.clear();
         this.f_21067.clear();
         this.f_21068.clear();
         this.f_21069.clear();
         this.f_21070.clear();
         this.f_21079 = true;
         this.f_21080 = false;
         this.f_21081 = false;
      }
   }

   @Override
   public void m_732() {
      this.f_21066.clear();
      this.f_21067.clear();
      this.f_21068.clear();
      this.f_21069.clear();
      this.f_21070.clear();
      this.f_21079 = true;
      this.f_21080 = false;
      this.f_21081 = false;
      this.f_21082 = 0L;
      this.f_21083 = null;
      this.f_21084 = null;
      if (this.f_21085 != null) {
         this.f_21085.destroyBuffers();
         this.f_21085 = null;
      }

      if (this.f_21086 != null) {
         this.f_21086.destroyBuffers();
         this.f_21086 = null;
      }
   }

   @Override
   public void m_778() {
      this.f_21066.clear();
      this.f_21067.clear();
      this.f_21068.clear();
      this.f_21069.clear();
      this.f_21070.clear();
      this.f_21079 = true;
      this.f_21080 = false;
      this.f_21081 = false;
      this.f_21082 = 0L;
      this.f_21083 = null;
      this.f_21084 = null;
   }

   private int m_6931(BufferBuilder var1, Matrix4f var2, Vec3 var3, Vec3 var4, Vec3 var5, Vec3 var6, float var7, float var8, Vector4f var9) {
      double var10 = var6.x - var5.x;
      double var12 = var6.z - var5.z;
      double var14 = Math.sqrt(var10 * var10 + var12 * var12);
      if (var14 < f_21389) {
         return 0;
      }

      double var16 = -var12 / var14;
      double var18 = var10 / var14;
      double var20 = var3.x - var4.x;
      double var22 = var3.y - var4.y + f_21390;
      double var24 = var3.z - var4.z;
      float var26 = (float)(var20 + var5.x + var16 * var7 * f_21391);
      float var27 = (float)(var24 + var5.z + var18 * var7 * f_21392);
      float var28 = (float)(var20 + var5.x - var16 * var7 * f_21393);
      float var29 = (float)(var24 + var5.z - var18 * var7 * f_21394);
      float var30 = (float)(var20 + var6.x + var16 * var8 * f_21395);
      float var31 = (float)(var24 + var6.z + var18 * var8 * f_21396);
      float var32 = (float)(var20 + var6.x - var16 * var8 * f_21397);
      float var33 = (float)(var24 + var6.z - var18 * var8 * f_21398);
      float var34 = (float)(var22 + var5.y);
      float var35 = (float)(var22 + var6.y);
      var1.addVertex(var2, var26, var34, var27).setUv(0.0F, 0.0F).setColor(var9.x, var9.y, var9.z, var9.w);
      var1.addVertex(var2, var30, var35, var31).setUv(1.0F, 0.0F).setColor(var9.x, var9.y, var9.z, var9.w);
      var1.addVertex(var2, var32, var35, var33).setUv(1.0F, 1.0F).setColor(var9.x, var9.y, var9.z, var9.w);
      var1.addVertex(var2, var28, var34, var29).setUv(0.0F, 1.0F).setColor(var9.x, var9.y, var9.z, var9.w);
      return 4;
   }

   private float m_6934(float var1) {
      float var2 = 1.0F - var1;
      return 1.0F - var2 * var2 * var2;
   }

   private int m_6935(int var1, float var2) {
      String var4 = this.f_21044.m_7564().m_1181();

      int var3 = switch (var4) {
         case f_21266 -> Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN), var2);
         case f_21267 -> Class_BftdentXEtGbugJw.m_2306(this.f_21045.m_8768(), Class_BftdentXEtGbugJw.m_2297(this.f_21045.m_8768()) / f_21269 * var2);
         case f_21268 -> {
            int var10 = Class_BftdentXEtGbugJw.m_2306(this.f_21045.m_8768(), Class_BftdentXEtGbugJw.m_2297(this.f_21045.m_8768()) / f_21270 * var2);
            int var8 = Class_BftdentXEtGbugJw.m_2306(this.f_21046.m_8768(), Class_BftdentXEtGbugJw.m_2297(this.f_21046.m_8768()) / f_21271 * var2);
            float var9 = (Mth.sin(var1 * f_21272 + (float)System.currentTimeMillis() / f_21273) + 1.0F) * f_21274;
            yield Class_BftdentXEtGbugJw.m_2302(var10, var8, var9);
         }
         default -> {
            float var7 = ((float)System.currentTimeMillis() / f_21275 + var1) % f_21276 / f_21277;
            yield Class_BftdentXEtGbugJw.m_2306(Color.HSBtoRGB(var7, f_21278, 1.0F) | f_21279, var2);
         }
      };
      return Class_BftdentXEtGbugJw.m_2302(var3, Class_BftdentXEtGbugJw.m_2306(-1, Class_BftdentXEtGbugJw.m_2297(var3) / f_21280), f_21281);
   }

   private static boolean m_6936(Vec3 var0) {
      return m_6861(var0.x) && m_6861(var0.y) && m_6861(var0.z);
   }

   private float m_6940(BlockPos var1, double var2, double var4, float var6) {
      double var7 = Mth.clamp(var2 - var1.getX(), 0.0, f_21413);
      double var9 = Mth.clamp(var4 - var1.getZ(), 0.0, f_21414);

      for (BlockPos var14 : new BlockPos[]{var1, var1.above()}) {
         VoxelShape var15 = f_11537.level.getBlockState(var14).getShape(f_11537.level, var14);
         if (!var15.isEmpty()) {
            double var16 = var14.getY() + var15.bounds().maxY;
            if (var16 > var6 && var16 - var6 <= f_21415) {
               var6 = (float)var16;
            }
         }
      }

      return var6;
   }

   private static final class L4HvMW3ewbw7kWEG {
      public final Vec3 f_20964;
      public final long f_20965 = System.currentTimeMillis();
      public final int f_20966;

      public L4HvMW3ewbw7kWEG(Vec3 var1, int var2) {
         this.f_20964 = var1;
         this.f_20966 = var2;
      }
   }

   private static final class Tn7GN7egil2JPY5d {
      public static final float f_20967 = 1550.0F;
      public static final float f_20968 = 0.4F;
      public static final float f_20969 = 0.58F;
      public static final float f_20970 = 1.4F;
      public final Vec3 f_20971;
      public final long f_20972;
      public final float f_20973;
      public final List<JumpCircle$tFkIfJnVOTxj2m2J> f_20974;
      public static final float f_20975 = 1000.0F;
      public static final double f_20976 = Math.PI * 2;
      public static final double f_20977 = -0.26;
      public static final double f_20978 = 0.26;
      public static final double f_20979 = 0.85;
      public static final double f_20980 = 0.7;
      public static final float f_20981 = 0.55F;
      public static final double f_20982 = 0.55;
      public static final double f_20983 = 0.45;
      public static final double f_20984 = 0.3;
      public static final double f_20985 = 0.25;
      public static final float f_20986 = 0.75F;
      public static final double f_20987 = -0.16;
      public static final double f_20988 = 0.16;
      public static final double f_20989 = 0.85;
      public static final double f_20990 = 0.3;
      public static final double f_20991 = -1.4F;
      public static final double f_20992 = 1.4F;

      public static Vec3 m_6822(Vec3 var0, Vec3 var1) {
         if (Class_NzJrN63M7QBpmAbi.f_11537.level == null) {
            return var1;
         }

         double var2 = var0.x + var1.x;
         double var4 = var0.z + var1.z;
         int var6 = Class_NzJrN63M7QBpmAbi.f_11537.level.getHeight(Types.MOTION_BLOCKING, Mth.floor(var2), Mth.floor(var4));
         double var7 = Mth.clamp(var6 - var0.y, f_20991, f_20992);
         return new Vec3(var1.x, var7, var1.z);
      }

      public static List<JumpCircle$tFkIfJnVOTxj2m2J> m_6823(Vec3 var0, float var1) {
         ThreadLocalRandom var2 = ThreadLocalRandom.current();
         int var3 = 7 + var2.nextInt(3);
         ArrayList var4 = new ArrayList(var3 * 2);

         for (int var5 = 0; var5 < var3; var5++) {
            double var6 = f_20976 / var3 * var5 + var2.nextDouble(f_20977, f_20978);
            double var8 = (f_20979 + var2.nextDouble() * f_20980) * var1;
            byte var10 = 6;
            Vec3[] var11 = m_6824(var0, Vec3.ZERO, var6, var8, var10, var2);
            var4.add(new JumpCircle$tFkIfJnVOTxj2m2J(var11, 0.0F));
            if (var11.length > 3 && var2.nextFloat() < f_20981) {
               int var12 = 2 + var2.nextInt(var11.length - 3);
               double var13 = var6 + (var2.nextBoolean() ? 1 : -1) * (f_20982 + var2.nextDouble() * f_20983);
               double var15 = var8 * (f_20984 + var2.nextDouble() * f_20985);
               Vec3[] var17 = m_6824(var0, var11[var12], var13, var15, 3, var2);
               float var18 = Mth.clamp((float)var12 / var10, 0.0F, f_20986);
               var4.add(new JumpCircle$tFkIfJnVOTxj2m2J(var17, var18));
            }
         }

         return var4;
      }

      public static Vec3[] m_6824(Vec3 var0, Vec3 var1, double var2, double var4, int var6, ThreadLocalRandom var7) {
         Vec3[] var8 = new Vec3[var6 + 1];
         var8[0] = m_6822(var0, var1);
         double var9 = var2;
         double var11 = var4 / var6;
         double var13 = var1.x;
         double var15 = var1.z;

         for (int var17 = 1; var17 <= var6; var17++) {
            var9 += var7.nextDouble(f_20987, f_20988);
            double var18 = var11 * (f_20989 + var7.nextDouble() * f_20990);
            var13 += Math.cos(var9) * var18;
            var15 += Math.sin(var9) * var18;
            var8[var17] = m_6822(var0, new Vec3(var13, 0.0, var15));
         }

         return var8;
      }

      public Tn7GN7egil2JPY5d(Vec3 var1, float var2) {
         this.f_20971 = var1;
         this.f_20972 = System.currentTimeMillis();
         this.f_20973 = ThreadLocalRandom.current().nextFloat() * f_20975;
         this.f_20974 = m_6823(var1, var2);
      }
   }

   private static final class UsHeToQdZEutJU8u {
      public final Vec3 f_20993;
      public final float f_20994;
      public final float f_20995;
      public final float f_20996;
      public final int f_20997;
      public final int f_20998;

      public UsHeToQdZEutJU8u(Vec3 var1, float var2, float var3, float var4, int var5, int var6) {
         this.f_20993 = var1;
         this.f_20994 = var2;
         this.f_20995 = var3;
         this.f_20996 = var4;
         this.f_20997 = var5;
         this.f_20998 = var6;
      }
   }

   private static final class XZJphWB0PEpxvmCO {
      public final Vec3 f_20999;
      public final long f_21000;
      public final long f_21001;
      public final float f_21002;
      public final float f_21003;

      public XZJphWB0PEpxvmCO(Vec3 var1, long var2, float var4, float var5) {
         this.f_20999 = var1;
         this.f_21000 = System.currentTimeMillis();
         this.f_21001 = var2;
         this.f_21002 = var4;
         this.f_21003 = var5;
      }
   }

   private static final class YER2Oe2xv4imdZce {
      public final Vec3 f_21004;
      public final float f_21005;
      public final long f_21006 = System.currentTimeMillis();

      public YER2Oe2xv4imdZce(Vec3 var1, float var2) {
         this.f_21004 = var1;
         this.f_21005 = var2;
      }
   }

   private static final class ekPSGMfqf8O4s4II {
      public final Vec3 f_21007;
      public final float f_21008;
      public final double f_21009;
      public final double f_21010;
      public final double f_21011;
      public final int f_21012;
      public final float[] f_21013;
      public final float[] f_21014;
      public final boolean[] f_21015;
      public final List<float[]> f_21016;
      public final long f_21017 = System.currentTimeMillis();
      public boolean f_21018;
      public long f_21019;
      public static final float f_21020 = 350.0F;
      public static final long f_21021 = 350L;

      public boolean m_6825(long var1) {
         return this.f_21018 && var1 - this.f_21019 >= f_21021;
      }

      public void m_6826() {
         if (!this.f_21018) {
            this.f_21018 = true;
            this.f_21019 = System.currentTimeMillis();
         }
      }

      public ekPSGMfqf8O4s4II(
         Vec3 var1, float var2, double var3, double var5, double var7, int var9, float[] var10, float[] var11, boolean[] var12, List<float[]> var13
      ) {
         this.f_21007 = var1;
         this.f_21008 = var2;
         this.f_21009 = var3;
         this.f_21010 = var5;
         this.f_21011 = var7;
         this.f_21012 = var9;
         this.f_21013 = var10;
         this.f_21014 = var11;
         this.f_21015 = var12;
         this.f_21016 = var13;
      }

      public float m_6827(long var1) {
         if (!this.f_21018) {
            return 1.0F;
         }

         float var3 = Mth.clamp((float)(var1 - this.f_21019) / f_21020, 0.0F, 1.0F);
         return 1.0F - var3;
      }
   }
}
