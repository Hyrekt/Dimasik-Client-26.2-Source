package dev.dimasik.client.module.render;

import com.google.gson.Gson;
import com.mojang.math.Axis;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.BooleanSetting;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ModeSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_0p152hWffX3ippAf;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_KxBUtZUr1gpu62Tc;
import dev.dimasik.client.system.Class_LFCWJ1yB8IfrtaTe;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_Qv1GEdpG9ZCawiMf;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_eXr9Fra2ad3yFXY8;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_w8fCJQ5ZtH5lQbWc;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.CharacterEvent;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.item.Items;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.lwjgl.glfw.GLFW;

public class SwingAnimations extends Module {
   public MultiChoiceSetting f_24134;
   private SliderSetting f_24135;
   private SliderSetting f_24136;
   private SliderSetting f_24137;
   private CheckboxSetting f_24138;
   private CheckboxSetting f_24139;
   private SliderSetting f_24140;
   public CheckboxSetting f_24141;
   public CheckboxSetting f_24142;
   private final BooleanSetting f_24143;
   private final SliderSetting f_24144;
   private final SliderSetting f_24145;
   private final SliderSetting f_24146;
   private final SliderSetting f_24147;
   private final SliderSetting f_24148;
   private final SliderSetting f_24149;
   private final SliderSetting f_24150;
   private final SliderSetting f_24151;
   private final SliderSetting f_24152;
   private final SliderSetting f_24153;
   private final SliderSetting f_24154;
   private final SliderSetting f_24155;
   private final SliderSetting f_24156;
   private final SliderSetting f_24157;
   private final SliderSetting f_24158;
   private final SliderSetting f_24159;
   private final CheckboxSetting f_24160;
   private final SliderSetting f_24161;
   private final SliderSetting f_24162;
   private final ModeSetting f_24163;
   public MultiChoiceSetting f_24164;
   private final Class_gEPk7yDw6CwIte87<Class_KxBUtZUr1gpu62Tc> f_24165;
   private final Class_gEPk7yDw6CwIte87<Class_Qv1GEdpG9ZCawiMf> f_24166;
   private final Class_gEPk7yDw6CwIte87<Class_LFCWJ1yB8IfrtaTe> f_24167;
   private static final String f_24168 = "SwingAnimations";
   private static final String f_24169 = "Анимирует вашу руку";
   private static final String f_24170 = "Свинги";
   private static final String f_24171 = "Обычный";
   private static final String f_24172 = "Мод 1";
   private static final String f_24173 = "Мод 2";
   private static final String f_24174 = "Мод 3";
   private static final String f_24175 = "Мод 4";
   private static final String f_24176 = "Мод 5";
   private static final String f_24177 = "Мод 6";
   private static final String f_24178 = "Мод 7";
   private static final String f_24179 = "Мод 8";
   private static final String f_24180 = "Мод 9";
   private static final String f_24181 = "Мод 10";
   private static final String f_24182 = "Мод 11";
   private static final String f_24183 = "Мод 12";
   private static final String f_24184 = "Мод 13";
   private static final String f_24185 = "Мод 14";
   private static final String f_24186 = "Custom";
   private static final String f_24187 = "HMI";
   private static final String f_24188 = "Угол";
   private static final float f_24189 = 100.0F;
   private static final float f_24190 = 10.0F;
   private static final float f_24191 = 180.0F;
   private static final String f_24192 = "Размер предмета";
   private static final float f_24193 = 0.2F;
   private static final float f_24194 = 0.05F;
   private static final String f_24195 = "Сила наклона";
   private static final float f_24196 = 5.0F;
   private static final float f_24197 = 10.0F;
   private static final String f_24198 = "Менять скорость свинга";
   private static final String f_24199 = "Кубическое ускорение";
   private static final String f_24200 = "Скорость";
   private static final float f_24201 = 7.0F;
   private static final float f_24202 = 10.0F;
   private static final String f_24203 = "Только с аурой";
   private static final String f_24204 = "Только при ударе";
   private static final String f_24205 = "Open";
   private static final String f_24206 = "Custom Start X";
   private static final float f_24207 = -2.0F;
   private static final String f_24208 = "Custom Start Y";
   private static final float f_24209 = 0.08F;
   private static final float f_24210 = -2.0F;
   private static final String f_24211 = "Custom Start Z";
   private static final float f_24212 = -0.05F;
   private static final float f_24213 = -2.0F;
   private static final String f_24214 = "Custom Start Pitch";
   private static final float f_24215 = -65.0F;
   private static final float f_24216 = -180.0F;
   private static final float f_24217 = 180.0F;
   private static final String f_24218 = "Custom Start Yaw";
   private static final float f_24219 = 24.0F;
   private static final float f_24220 = -180.0F;
   private static final float f_24221 = 180.0F;
   private static final String f_24222 = "Custom Start Roll";
   private static final float f_24223 = -4.0F;
   private static final float f_24224 = -180.0F;
   private static final float f_24225 = 180.0F;
   private static final String f_24226 = "Custom End X";
   private static final float f_24227 = 0.04F;
   private static final float f_24228 = -2.0F;
   private static final String f_24229 = "Custom End Y";
   private static final float f_24230 = -0.92F;
   private static final float f_24231 = -2.0F;
   private static final String f_24232 = "Custom End Z";
   private static final float f_24233 = -0.32F;
   private static final float f_24234 = -2.0F;
   private static final String f_24235 = "Custom End Pitch";
   private static final float f_24236 = -142.0F;
   private static final float f_24237 = -180.0F;
   private static final float f_24238 = 180.0F;
   private static final String f_24239 = "Custom End Yaw";
   private static final float f_24240 = 34.0F;
   private static final float f_24241 = -180.0F;
   private static final float f_24242 = 180.0F;
   private static final String f_24243 = "Custom End Roll";
   private static final float f_24244 = -16.0F;
   private static final float f_24245 = -180.0F;
   private static final float f_24246 = 180.0F;
   private static final String f_24247 = "Custom Curve 1 X";
   private static final float f_24248 = 0.18F;
   private static final String f_24249 = "Custom Curve 1 Y";
   private static final float f_24250 = 0.02F;
   private static final String f_24251 = "Custom Curve 2 X";
   private static final float f_24252 = 0.58F;
   private static final String f_24253 = "Custom Curve 2 Y";
   private static final String f_24254 = "Custom Back";
   private static final String f_24255 = "Custom Back Speed";
   private static final float f_24256 = 8.0F;
   private static final float f_24257 = 10.0F;
   private static final String f_24258 = "Custom Preset";
   private static final float f_24259 = 2.1474836E9F;
   private static final String f_24260 = "Custom Preset Data";
   private static final String f_24261 = "Анимация использования";
   private static final String f_24262 = "Обычная";
   private static final String f_24263 = "Укороченная";
   private static final String f_24264 = "Полная отмена";
   private static final String f_24265 = "Обычная";
   private static final String f_24266 = "Укороченная";
   private static final String f_24267 = "Полная отмена";
   private static final float f_24268 = 0.02F;
   private static final String f_24269 = "HMI";
   private static final double f_24270 = Math.PI;
   private static final String f_24271 = "Мод 13";
   private static final String f_24272 = "Мод 14";
   private static final String f_24273 = "Custom";
   private static final String f_24274 = "Мод 1";
   private static final String f_24275 = "Мод 2";
   private static final String f_24276 = "Мод 3";
   private static final String f_24277 = "Мод 4";
   private static final String f_24278 = "Мод 5";
   private static final String f_24279 = "Мод 12";
   private static final String f_24280 = "Мод 6";
   private static final String f_24281 = "Мод 7";
   private static final String f_24282 = "Мод 8";
   private static final String f_24283 = "Мод 9";
   private static final String f_24284 = "Мод 10";
   private static final String f_24285 = "Мод 11";
   private static final float f_24286 = 10.0F;
   private static final float f_24287 = 5.0F;
   private static final double f_24288 = 0.1;
   private static final float f_24289 = 360.0F;
   private static final double f_24290 = -0.1;
   private static final float f_24291 = 45.0F;
   private static final float f_24292 = (float) Math.PI;
   private static final float f_24293 = 4.0F;
   private static final float f_24294 = -20.0F;
   private static final float f_24295 = (float) Math.PI;
   private static final float f_24296 = -20.0F;
   private static final float f_24297 = (float) Math.PI;
   private static final float f_24298 = 10.0F;
   private static final float f_24299 = (float) Math.PI;
   private static final float f_24300 = 10.0F;
   private static final double f_24301 = 0.15;
   private static final double f_24302 = -0.3F;
   private static final float f_24303 = -90.0F;
   private static final float f_24304 = 90.0F;
   private static final float f_24305 = 60.0F;
   private static final float f_24306 = -60.0F;
   private static final float f_24307 = 10.0F;
   private static final double f_24308 = 0.15;
   private static final double f_24309 = -0.3F;
   private static final float f_24310 = -70.0F;
   private static final float f_24311 = 70.0F;
   private static final float f_24312 = 10.0F;
   private static final float f_24313 = -10.0F;
   private static final float f_24314 = 10.0F;
   private static final double f_24315 = 0.15;
   private static final double f_24316 = -0.3F;
   private static final float f_24317 = -70.0F;
   private static final float f_24318 = 70.0F;
   private static final float f_24319 = 10.0F;
   private static final float f_24320 = -10.0F;
   private static final float f_24321 = -70.0F;
   private static final float f_24322 = 10.0F;
   private static final float f_24323 = -1.0F;
   private static final float f_24324 = (float) Math.PI;
   private static final float f_24325 = 0.56F;
   private static final float f_24326 = 0.72F;
   private static final float f_24327 = 0.72F;
   private static final float f_24328 = 0.56F;
   private static final float f_24329 = -0.52F;
   private static final float f_24330 = 24.0F;
   private static final float f_24331 = -0.72F;
   private static final float f_24332 = 90.0F;
   private static final float f_24333 = -30.0F;
   private static final float f_24334 = -90.0F;
   private static final double f_24335 = 0.15;
   private static final double f_24336 = -0.3F;
   private static final float f_24337 = -70.0F;
   private static final float f_24338 = 20.0F;
   private static final float f_24339 = 70.0F;
   private static final float f_24340 = 20.0F;
   private static final float f_24341 = 10.0F;
   private static final float f_24342 = 60.0F;
   private static final float f_24343 = -10.0F;
   private static final float f_24344 = 60.0F;
   private static final float f_24345 = -100.0F;
   private static final float f_24346 = 10.0F;
   private static final double f_24347 = 0.15;
   private static final double f_24348 = -0.3F;
   private static final float f_24349 = -90.0F;
   private static final float f_24350 = 90.0F;
   private static final float f_24351 = 60.0F;
   private static final float f_24352 = -60.0F;
   private static final float f_24353 = 10.0F;
   private static final float f_24354 = -50.0F;
   private static final float f_24355 = 0.5F;
   private static final float f_24356 = -0.15F;
   private static final float f_24357 = -0.65F;
   private static final float f_24358 = 45.0F;
   private static final float f_24359 = (float) Math.PI;
   private static final float f_24360 = (float) Math.PI;
   private static final float f_24361 = -20.0F;
   private static final float f_24362 = -20.0F;
   private static final float f_24363 = 10.0F;
   private static final float f_24364 = -0.5F;
   private static final float f_24365 = 0.2F;
   private static final float f_24366 = -80.0F;
   private static final float f_24367 = 45.0F;
   private static final float f_24368 = -20.0F;
   private static final float f_24369 = -20.0F;
   private static final float f_24370 = -80.0F;
   private static final float f_24371 = 0.4F;
   private static final float f_24372 = 0.2F;
   private static final float f_24373 = 0.2F;
   private static final float f_24374 = -0.5F;
   private static final float f_24375 = 0.08F;
   private static final float f_24376 = 20.0F;
   private static final float f_24377 = -80.0F;
   private static final float f_24378 = 20.0F;
   private static final double f_24379 = 0.5;
   private static final double f_24380 = -0.15F;
   private static final double f_24381 = -0.65F;
   private static final float f_24382 = -0.2F;
   private static final float f_24383 = (float) Math.PI;
   private static final float f_24384 = 45.0F;
   private static final float f_24385 = (float) Math.PI;
   private static final float f_24386 = -20.0F;
   private static final float f_24387 = -20.0F;
   private static final float f_24388 = -80.0F;
   private static final float f_24389 = 30.0F;
   private static final float f_24390 = -80.0F;
   private static final float f_24391 = 60.0F;
   private static final long f_24392 = 255L;
   private static final long f_24393 = 255L;
   private static final long f_24394 = 127L;
   private static final long f_24395 = 255L;
   private static final long f_24396 = 255L;
   private static final long f_24397 = 255L;
   private static final long f_24398 = 2L;
   private static final double f_24399 = 0.5;
   private static final float f_24400 = 90.0F;
   private static final float f_24401 = -90.0F;
   private static final float f_24402 = -10.0F;
   private static final float f_24403 = 10.0F;
   private static final float f_24404 = 10.0F;
   private static final float f_24405 = 110.0F;
   private static final float f_24406 = 10.0F;
   private static final float f_24407 = 0.8F;
   private static final float f_24408 = 1.25F;
   private static final float f_24409 = 0.8F;
   private static final float f_24410 = 5.0F;
   private static final String f_24411 = "Обычный";
   private static final float f_24412 = 9.0F;
   private static final float f_24413 = 0.45F;
   private static final float f_24414 = 0.78F;
   private static final float f_24415 = 0.5F;
   private static final float f_24416 = 0.5F;
   private static final float f_24417 = 3.0F;
   private static final float f_24418 = 3.0F;
   private static final String f_24419 = "HMI";
   private static final String f_24420 = "Custom";
   private static final String f_24421 = "HMI";
   private static final String f_24422 = "HMI";
   private static final String f_24423 = "HMI";
   private static final String f_24424 = "Custom";
   private static final String f_24425 = "HMI";
   private static final String f_24426 = "Custom";
   private static final String f_24427 = "Мод 3";
   private static final String f_24428 = "Мод 4";

   public SwingAnimations() {
      super(f_24168, f_24169, Category.RENDER);
      this.f_24134 = new MultiChoiceSetting(
         f_24170,
         new Class_2ZaVm8TGDJ68TnJB(f_24171),
         new Class_2ZaVm8TGDJ68TnJB(f_24172),
         new Class_2ZaVm8TGDJ68TnJB(f_24173),
         new Class_2ZaVm8TGDJ68TnJB(f_24174),
         new Class_2ZaVm8TGDJ68TnJB(f_24175),
         new Class_2ZaVm8TGDJ68TnJB(f_24176),
         new Class_2ZaVm8TGDJ68TnJB(f_24177),
         new Class_2ZaVm8TGDJ68TnJB(f_24178),
         new Class_2ZaVm8TGDJ68TnJB(f_24179),
         new Class_2ZaVm8TGDJ68TnJB(f_24180),
         new Class_2ZaVm8TGDJ68TnJB(f_24181),
         new Class_2ZaVm8TGDJ68TnJB(f_24182),
         new Class_2ZaVm8TGDJ68TnJB(f_24183),
         new Class_2ZaVm8TGDJ68TnJB(f_24184),
         new Class_2ZaVm8TGDJ68TnJB(f_24185),
         new Class_2ZaVm8TGDJ68TnJB(f_24186),
         new Class_2ZaVm8TGDJ68TnJB(f_24187)
      );
      this.f_24135 = new SliderSetting(f_24188, f_24189, f_24190, f_24191)
         .m_822(() -> this.f_24134.m_7568(f_24427) || this.f_24134.m_7568(f_24428))
         .m_828(1.0F);
      this.f_24136 = new SliderSetting(f_24192, 1.0F, f_24193, 2.0F).m_828(f_24194);
      this.f_24137 = new SliderSetting(f_24195, f_24196, 1.0F, f_24197).m_822(() -> !this.f_24134.m_7568(f_24425) && !this.f_24134.m_7568(f_24426)).m_828(1.0F);
      this.f_24138 = new CheckboxSetting(f_24198, false);
      this.f_24139 = new CheckboxSetting(f_24199, false).m_822(() -> !this.f_24134.m_7568(f_24423) && !this.f_24134.m_7568(f_24424));
      this.f_24140 = new SliderSetting(f_24200, f_24201, 0.0F, f_24202).m_828(1.0F);
      this.f_24141 = new CheckboxSetting(f_24203, true).m_822(() -> !this.f_24134.m_7568(f_24422));
      this.f_24142 = new CheckboxSetting(f_24204, false).m_822(() -> !this.f_24134.m_7568(f_24421));
      this.f_24143 = new BooleanSetting(f_24205).m_1474(this::m_7284).m_1472().m_822(() -> this.f_24134.m_7568(f_24420));
      this.f_24144 = m_7280(f_24206, 0.0F, f_24207, 2.0F);
      this.f_24145 = m_7280(f_24208, f_24209, f_24210, 2.0F);
      this.f_24146 = m_7280(f_24211, f_24212, f_24213, 2.0F);
      this.f_24147 = m_7280(f_24214, f_24215, f_24216, f_24217);
      this.f_24148 = m_7280(f_24218, f_24219, f_24220, f_24221);
      this.f_24149 = m_7280(f_24222, f_24223, f_24224, f_24225);
      this.f_24150 = m_7280(f_24226, f_24227, f_24228, 2.0F);
      this.f_24151 = m_7280(f_24229, f_24230, f_24231, 2.0F);
      this.f_24152 = m_7280(f_24232, f_24233, f_24234, 2.0F);
      this.f_24153 = m_7280(f_24235, f_24236, f_24237, f_24238);
      this.f_24154 = m_7280(f_24239, f_24240, f_24241, f_24242);
      this.f_24155 = m_7280(f_24243, f_24244, f_24245, f_24246);
      this.f_24156 = m_7280(f_24247, f_24248, 0.0F, 1.0F);
      this.f_24157 = m_7280(f_24249, f_24250, 0.0F, 1.0F);
      this.f_24158 = m_7280(f_24251, f_24252, 0.0F, 1.0F);
      this.f_24159 = m_7280(f_24253, 1.0F, 0.0F, 1.0F);
      this.f_24160 = new CheckboxSetting(f_24254, true).m_822(() -> false);
      this.f_24161 = m_7280(f_24255, f_24256, 1.0F, f_24257);
      this.f_24162 = m_7280(f_24258, 1.0F, 0.0F, f_24259);
      this.f_24163 = new ModeSetting(f_24260, "").m_822(() -> false);
      this.f_24164 = new MultiChoiceSetting(
         f_24261, new Class_2ZaVm8TGDJ68TnJB(f_24262), new Class_2ZaVm8TGDJ68TnJB(f_24263), new Class_2ZaVm8TGDJ68TnJB(f_24264)
      );
      this.f_24165 = this::m_7266;
      this.f_24166 = this::m_7282;
      this.f_24167 = this::m_7283;
      this.m_795(
         this.f_24134,
         this.f_24143,
         this.f_24135,
         this.f_24136,
         this.f_24137,
         this.f_24138,
         this.f_24139,
         this.f_24140,
         this.f_24141,
         this.f_24142,
         this.f_24164,
         this.f_24144,
         this.f_24145,
         this.f_24146,
         this.f_24147,
         this.f_24148,
         this.f_24149,
         this.f_24150,
         this.f_24151,
         this.f_24152,
         this.f_24153,
         this.f_24154,
         this.f_24155,
         this.f_24156,
         this.f_24157,
         this.f_24158,
         this.f_24159,
         this.f_24160,
         this.f_24161,
         this.f_24162,
         this.f_24163
      );
   }

   public static boolean m_7265(Screen var0) {
      return var0 instanceof SwingAnimations.Z1BZkZCV4oiAFXcH;
   }

   public void m_7266(Class_KxBUtZUr1gpu62Tc var1) {
      if (!this.f_24134.m_7568(f_24269)) {
         if (this.m_7285()) {
            int var2 = var1.f_10272 == HumanoidArm.RIGHT ? 1 : -1;
            float var3 = Mth.clamp(var1.f_10273, 0.0F, 1.0F);
            float var4 = this.f_24139.m_8768() ? m_7273(var3) : var3;
            float var5 = (float)Math.sin(var4 * f_24270);
            if (!this.f_24141.m_8768() || DimasikClient.m_9057().m_9049().m_2801().m_3576().m_1114() != null) {
               var1.f_10271.scale(this.f_24136.m_8768(), this.f_24136.m_8768(), this.f_24136.m_8768());
               if (var1.f_10272 == f_11537.player.getMainArm()) {
                  switch (this.f_24134.m_7564().m_1181()) {
                     case f_24271:
                        var1.f_10271.translate(0.0F, 0.0F, -var5 * this.f_24137.m_8768() / f_24286);
                        var1.f_10271.mulPose(Axis.YP.rotationDegrees(var2 * var5 * this.f_24137.m_8768() * f_24287));
                        break;
                     case f_24272:
                        var1.f_10271.translate(0.0, f_24288, 0.0);
                        var1.f_10271.mulPose(Axis.XP.rotationDegrees(var4 * f_24289));
                        var1.f_10271.translate(0.0, f_24290, 0.0);
                        break;
                     case f_24273:
                        this.m_7275(var1, var2, var3);
                        break;
                     case f_24274:
                        float var16 = Mth.sqrt(var4);
                        var1.f_10271.mulPose(Axis.YP.rotationDegrees(var2 * (f_24291 + Mth.sin(var4 * var4 * f_24292) / f_24293 * f_24294)));
                        var1.f_10271.mulPose(Axis.ZP.rotationDegrees(var2 * Mth.sin(var16 * f_24295) * f_24296));
                        var1.f_10271.mulPose(Axis.XP.rotationDegrees(Mth.sin(var16 * f_24297) * -this.f_24137.m_8768() * f_24298));
                        var1.f_10271.mulPose(Axis.YP.rotationDegrees(-var2 * 45));
                        break;
                     case f_24275:
                        var1.f_10271.mulPose(Axis.XP.rotationDegrees(var2 * (var4 * f_24299 - this.f_24137.m_8768() * f_24300 * var5)));
                        break;
                     case f_24276:
                        var1.f_10271.translate(0.0, f_24301, f_24302);
                        var1.f_10271.mulPose(Axis.YP.rotationDegrees(var1.f_10272 == HumanoidArm.LEFT ? f_24303 : f_24304));
                        var1.f_10271.mulPose(Axis.ZP.rotationDegrees(var1.f_10272 == HumanoidArm.LEFT ? f_24305 : f_24306));
                        var1.f_10271.mulPose(Axis.XP.rotationDegrees(-this.f_24135.m_8768() - this.f_24137.m_8768() * f_24307 * var5));
                        break;
                     case f_24277:
                        var1.f_10271.translate(0.0, f_24308, f_24309);
                        var1.f_10271.mulPose(Axis.YP.rotationDegrees(var1.f_10272 == HumanoidArm.LEFT ? f_24310 : f_24311));
                        var1.f_10271.mulPose(Axis.ZP.rotationDegrees(var1.f_10272 == HumanoidArm.LEFT ? f_24312 : f_24313));
                        var1.f_10271.mulPose(Axis.XP.rotationDegrees(-this.f_24135.m_8768() - this.f_24137.m_8768() * f_24314 * var5));
                        break;
                     case f_24278:
                        var1.f_10271.translate(0.0, f_24315, f_24316);
                        var1.f_10271.mulPose(Axis.YP.rotationDegrees(var1.f_10272 == HumanoidArm.LEFT ? f_24317 : f_24318));
                        var1.f_10271.mulPose(Axis.ZP.rotationDegrees(var1.f_10272 == HumanoidArm.LEFT ? f_24319 : f_24320));
                        var1.f_10271.mulPose(Axis.XP.rotationDegrees(f_24321 - this.f_24137.m_8768() * f_24322 * var5));
                        break;
                     case f_24279:
                        float var15 = var1.f_10272 == HumanoidArm.LEFT ? f_24323 : 1.0F;
                        float var19 = Mth.sin(Mth.sqrt(var4) * f_24324);
                        var1.f_10271.translate(-var15 * f_24325, f_24326, f_24327);
                        var1.f_10271.translate(f_24328 * var15, f_24329 - var19 * this.f_24137.m_8768() / f_24330, f_24331);
                        var1.f_10271.mulPose(Axis.YP.rotationDegrees(f_24332 * var15));
                        var1.f_10271.mulPose(Axis.ZP.rotationDegrees(f_24333 * var15));
                        var1.f_10271.mulPose(Axis.XP.rotationDegrees(f_24334));
                        break;
                     case f_24280:
                        var1.f_10271.translate(0.0, f_24335, f_24336);
                        var1.f_10271.mulPose(Axis.YP.rotationDegrees(var1.f_10272 == HumanoidArm.LEFT ? f_24337 - f_24338 * var5 : f_24339 + f_24340 * var5));
                        var1.f_10271.mulPose(Axis.ZP.rotationDegrees(var1.f_10272 == HumanoidArm.LEFT ? f_24341 + f_24342 * var5 : f_24343 - f_24344 * var5));
                        var1.f_10271.mulPose(Axis.XP.rotationDegrees(f_24345 - this.f_24137.m_8768() * f_24346 * var5));
                        break;
                     case f_24281:
                        var1.f_10271.translate(0.0, f_24347, f_24348);
                        var1.f_10271.mulPose(Axis.YP.rotationDegrees(var1.f_10272 == HumanoidArm.LEFT ? f_24349 : f_24350));
                        var1.f_10271
                           .mulPose(Axis.ZP.rotationDegrees(var1.f_10272 == HumanoidArm.LEFT ? f_24351 : f_24352 - this.f_24137.m_8768() * f_24353 * var5));
                        var1.f_10271.mulPose(Axis.XP.rotationDegrees(f_24354));
                        break;
                     case f_24282:
                        var1.f_10271.translate(f_24355, f_24356, f_24357);
                        var1.f_10271.mulPose(Axis.YP.rotationDegrees(f_24358));
                        float var14 = Mth.sin(var4 * var4 * f_24359);
                        float var18 = Mth.sin(Mth.sqrt(var4) * f_24360);
                        var1.f_10271.mulPose(Axis.YP.rotationDegrees(var14 * f_24361));
                        var1.f_10271.mulPose(Axis.ZP.rotationDegrees(var18 * f_24362));
                        var1.f_10271.mulPose(Axis.XP.rotationDegrees(var18 * (-this.f_24137.m_8768() * f_24363)));
                        var1.f_10271.translate(f_24364, f_24365, 0.0F);
                        var1.f_10271.mulPose(Axis.YP.rotationDegrees(var1.f_10272 == HumanoidArm.LEFT ? -60 : 30));
                        var1.f_10271.mulPose(Axis.XP.rotationDegrees(f_24366));
                        var1.f_10271.mulPose(Axis.YP.rotationDegrees(var1.f_10272 == HumanoidArm.LEFT ? -60 : 60));
                        break;
                     case f_24283:
                        var1.f_10271.mulPose(Axis.YP.rotationDegrees(var2 * f_24367));
                        var1.f_10271.mulPose(Axis.XP.rotationDegrees(var5 * f_24368));
                        var1.f_10271.mulPose(Axis.ZP.rotationDegrees(var2 * var5 * f_24369));
                        var1.f_10271.mulPose(Axis.XP.rotationDegrees(var5 * f_24370));
                        var1.f_10271.translate(var2 * f_24371, f_24372, f_24373);
                        var1.f_10271.translate(var2 * f_24374, f_24375, 0.0F);
                        var1.f_10271.mulPose(Axis.YP.rotationDegrees(var2 * f_24376));
                        var1.f_10271.mulPose(Axis.XP.rotationDegrees(f_24377));
                        var1.f_10271.mulPose(Axis.YP.rotationDegrees(var2 * f_24378));
                        break;
                     case f_24284:
                        var1.f_10271.translate(f_24379, f_24380, f_24381);
                        float var13 = f_24382 * Mth.sin(var4 * f_24383);
                        var1.f_10271.mulPose(Axis.YP.rotationDegrees(f_24384));
                        float var17 = Mth.sin(0.0);
                        float var10 = Mth.sin(Mth.sqrt(0.0F) * f_24385);
                        var1.f_10271.mulPose(Axis.YP.rotationDegrees(var17 * f_24386));
                        var1.f_10271.mulPose(Axis.ZP.rotationDegrees(var10 * f_24387));
                        var1.f_10271.mulPose(Axis.XP.rotationDegrees(var10 * f_24388));
                        var1.f_10271.mulPose(Axis.YP.rotationDegrees(f_24389));
                        var1.f_10271.mulPose(Axis.XP.rotationDegrees(f_24390));
                        var1.f_10271.mulPose(Axis.YP.rotationDegrees(f_24391));
                        int var11 = (int)Math.min(
                           f_24392,
                           (
                                 System.currentTimeMillis() % f_24393 > f_24394
                                    ? Math.abs(Math.abs(System.currentTimeMillis()) % f_24395 - f_24396)
                                    : System.currentTimeMillis() % f_24397
                              )
                              * f_24398
                        );
                        float var12 = var13 > f_24399 ? 1.0F - var13 : var13;
                        var1.f_10271.mulPose(Axis.ZP.rotationDegrees(0.0F));
                        var1.f_10271.mulPose(Axis.XP.rotationDegrees(f_24400));
                        var1.f_10271.mulPose(Axis.XP.rotationDegrees(f_24401));
                        var1.f_10271.mulPose(Axis.XP.rotationDegrees(f_24402));
                        var1.f_10271.mulPose(Axis.XP.rotationDegrees(-var12 * f_24403));
                        var1.f_10271.mulPose(Axis.YP.rotationDegrees(f_24404));
                        var1.f_10271.mulPose(Axis.ZP.rotationDegrees(f_11537.player.swinging ? -var11 / (f_24405 - this.f_24137.m_8768() * f_24406) : 1.0F));
                        break;
                     case f_24285:
                        float var8;
                        if (var4 < f_24407) {
                           var8 = -var4 * f_24408;
                        } else {
                           float var9 = (var4 - f_24409) * f_24410;
                           var8 = -(1.0F - var9);
                        }

                        var1.f_10271.translate(0.0F, var8, 0.0F);
                  }

                  if (!this.f_24134.m_7568(f_24411)) {
                     var1.m_1582(true);
                  }
               }
            }
         }
      }
   }

   public float m_7268() {
      return this.f_24136.m_8768();
   }

   private float m_7270(float var1) {
      float var2 = 0.0F;
      float var3 = 1.0F;

      for (int var4 = 0; var4 < 12; var4++) {
         float var5 = (var2 + var3) * f_24415;
         if (m_7286(var5, 0.0F, this.f_24156.m_8768(), this.f_24158.m_8768(), 1.0F) < var1) {
            var2 = var5;
         } else {
            var3 = var5;
         }
      }

      return Math.clamp(m_7286((var2 + var3) * f_24416, 0.0F, this.f_24157.m_8768(), this.f_24159.m_8768(), 1.0F), 0.0F, 1.0F);
   }

   private static float m_7273(float var0) {
      var0 = Mth.clamp(var0, 0.0F, 1.0F);
      float var1 = 1.0F - var0;
      return 1.0F - var1 * var1 * var1;
   }

   private float m_7274(float var1) {
      if (this.f_24160.m_8768()) {
         float var2 = Mth.lerp((this.f_24161.m_8768() - 1.0F) / f_24412, f_24413, f_24414);
         if (var1 <= var2) {
            return this.m_7270(Mth.clamp(var1 / var2, 0.0F, 1.0F));
         }

         float var3 = Mth.clamp((var1 - var2) / (1.0F - var2), 0.0F, 1.0F);
         float var4 = 1.0F - var3;
         return var4 * var4 * var4;
      } else {
         return this.m_7270(Mth.clamp(var1, 0.0F, 1.0F));
      }
   }

   private void m_7275(Class_KxBUtZUr1gpu62Tc var1, int var2, float var3) {
      float var4 = this.m_7274(var3);
      float var5 = Mth.lerp(var4, this.f_24144.m_8768(), this.f_24150.m_8768()) * var2;
      float var6 = Mth.lerp(var4, this.f_24145.m_8768(), this.f_24151.m_8768());
      float var7 = Mth.lerp(var4, this.f_24146.m_8768(), this.f_24152.m_8768());
      float var8 = Mth.lerp(var4, this.f_24147.m_8768(), this.f_24153.m_8768());
      float var9 = Mth.lerp(var4, this.f_24148.m_8768(), this.f_24154.m_8768()) * var2;
      float var10 = Mth.lerp(var4, this.f_24149.m_8768(), this.f_24155.m_8768()) * var2;
      var1.f_10271.translate(var5, var6, var7);
      var1.f_10271.mulPose(Axis.YP.rotationDegrees(var9));
      var1.f_10271.mulPose(Axis.ZP.rotationDegrees(var10));
      var1.f_10271.mulPose(Axis.XP.rotationDegrees(var8));
   }

   private static SliderSetting m_7280(String var0, float var1, float var2, float var3) {
      return new SliderSetting(var0, var1, var2, var3).m_822(() -> false);
   }

   public void m_7282(Class_Qv1GEdpG9ZCawiMf var1) {
      if (!this.f_24134.m_7568(f_24419)) {
         if (this.m_7285()) {
            if (!this.f_24141.m_8768() || DimasikClient.m_9057().m_9049().m_2801().m_3576().m_1114() != null) {
               if (var1.m_4470() == InteractionHand.MAIN_HAND && this.f_24138.m_8768()) {
                  var1.m_4468(this.f_24140.m_8768().intValue());
                  var1.m_1582(true);
               }
            }
         }
      }
   }

   public void m_7283(Class_LFCWJ1yB8IfrtaTe var1) {
      if (!this.f_24164.m_7568(f_24265)) {
         switch (this.f_24164.m_7564().m_1181()) {
            case f_24266:
               var1.m_3622(f_24268);
               break;
            case f_24267:
               var1.m_3622(0.0F);
         }
      }
   }

   private void m_7284() {
      Screen var1 = f_11537.gui.screen();
      f_11537.gui.setScreen(new SwingAnimations.Z1BZkZCV4oiAFXcH(this, var1));
   }

   public boolean m_7285() {
      return !this.f_24142.m_8768() || f_11537.player != null && f_11537.player.swinging;
   }

   private static float m_7286(float var0, float var1, float var2, float var3, float var4) {
      float var5 = 1.0F - var0;
      return var5 * var5 * var5 * var1 + f_24417 * var5 * var5 * var0 * var2 + f_24418 * var5 * var0 * var0 * var3 + var0 * var0 * var0 * var4;
   }

   private static final class Z1BZkZCV4oiAFXcH extends Screen {
      public static final Gson f_23626 = new Gson();
      public static int f_23627 = Class_BftdentXEtGbugJw.m_2303(15, 19, 28, SwingAnimations.Z1BZkZCV4oiAFXcH.f_24121);
      public static int f_23628 = Class_BftdentXEtGbugJw.m_2303(15, 19, 28, SwingAnimations.Z1BZkZCV4oiAFXcH.f_24122);
      public static int f_23629 = Class_BftdentXEtGbugJw.m_2303(255, 255, 255, SwingAnimations.Z1BZkZCV4oiAFXcH.f_24123);
      public static int f_23630 = Class_BftdentXEtGbugJw.m_2303(244, 244, 247, SwingAnimations.Z1BZkZCV4oiAFXcH.f_24124);
      public static int f_23631 = Class_BftdentXEtGbugJw.m_2303(116, 117, 126, SwingAnimations.Z1BZkZCV4oiAFXcH.f_24125);
      public static int f_23632 = Class_BftdentXEtGbugJw.m_2303(246, 145, 255, SwingAnimations.Z1BZkZCV4oiAFXcH.f_24126);
      public static final float f_23633 = 220.0F;
      public static final float f_23634 = 303.0F;
      public static final float f_23635 = 250.0F;
      public static final float f_23636 = 352.0F;
      public static final float f_23637 = 346.0F;
      public static final float f_23638 = 328.0F;
      public static final float f_23639 = 16.0F;
      public static final float f_23640 = 848.0F;
      public static final Identifier f_23641 = Class_wHRRCm2tlLY7DN4I.m_9311(SwingAnimations.Z1BZkZCV4oiAFXcH.f_24127);
      public static final Identifier f_23642 = Class_wHRRCm2tlLY7DN4I.m_9311(SwingAnimations.Z1BZkZCV4oiAFXcH.f_24128);
      public static final Identifier f_23643 = Class_wHRRCm2tlLY7DN4I.m_9311(SwingAnimations.Z1BZkZCV4oiAFXcH.f_24129);
      public static final Identifier f_23644 = Class_wHRRCm2tlLY7DN4I.m_9311(SwingAnimations.Z1BZkZCV4oiAFXcH.f_24130);
      public static final Identifier f_23645 = Class_wHRRCm2tlLY7DN4I.m_9311(SwingAnimations.Z1BZkZCV4oiAFXcH.f_24131);
      public static final Identifier f_23646 = Class_wHRRCm2tlLY7DN4I.m_9311(SwingAnimations.Z1BZkZCV4oiAFXcH.f_24132);
      public static final Identifier f_23647 = Class_wHRRCm2tlLY7DN4I.m_9311(SwingAnimations.Z1BZkZCV4oiAFXcH.f_24133);
      public final SwingAnimations f_23648;
      public final Screen f_23649;
      public final Class_w8fCJQ5ZtH5lQbWc f_23650;
      public final Class_w8fCJQ5ZtH5lQbWc f_23651;
      public final Class_w8fCJQ5ZtH5lQbWc f_23652;
      public final Class_w8fCJQ5ZtH5lQbWc f_23653;
      public final List<SwingAnimations$ZQeH4sWembRd4HkY> f_23654;
      public final List<Class_w8fCJQ5ZtH5lQbWc> f_23655;
      public final List<Class_w8fCJQ5ZtH5lQbWc> f_23656;
      public SwingAnimations$ImkoK7HlTtifMMWy f_23657;
      public float f_23658;
      public float f_23659;
      public float f_23660;
      public float f_23661;
      public int f_23662;
      public SwingAnimations$xnNvZDqm7jEDufZj f_23663;
      public boolean f_23664;
      public String f_23665;
      public float f_23666;
      public float f_23667;
      public float f_23668;
      public float f_23669;
      public float f_23670;
      public float f_23671;
      public float f_23672;
      public float f_23673;
      public static final String f_23674 = "Custom Swing";
      public static final float f_23675 = 7.0F;
      public static final float f_23676 = 9.0F;
      public static final float f_23677 = 10.0F;
      public static final float f_23678 = 12.0F;
      public static final float f_23679 = 11.0F;
      public static final float f_23680 = 9.0F;
      public static final float f_23681 = 848.0F;
      public static final float f_23682 = 0.5F;
      public static final float f_23683 = 352.0F;
      public static final float f_23684 = 0.5F;
      public static final float f_23685 = 12.0F;
      public static final float f_23686 = 255.0F;
      public static final float f_23687 = 220.0F;
      public static final float f_23688 = 303.0F;
      public static final float f_23689 = 250.0F;
      public static final float f_23690 = 352.0F;
      public static final float f_23691 = 346.0F;
      public static final float f_23692 = 328.0F;
      public static final float f_23693 = 9.0F;
      public static final float f_23694 = 220.0F;
      public static final float f_23695 = 303.0F;
      public static final float f_23696 = 250.0F;
      public static final float f_23697 = 352.0F;
      public static final float f_23698 = 346.0F;
      public static final float f_23699 = 328.0F;
      public static final float f_23700 = 255.0F;
      public static final float f_23701 = 255.0F;
      public static final float f_23702 = 0.5F;
      public static final float f_23703 = 0.08F;
      public static final float f_23704 = 40.0F;
      public static final float f_23705 = 30.0F;
      public static final float f_23706 = 20.0F;
      public static final double f_23707 = 255.0;
      public static final float f_23708 = 20.0F;
      public static final float f_23709 = 220.0F;
      public static final float f_23710 = 16.0F;
      public static final float f_23711 = 250.0F;
      public static final float f_23712 = 16.0F;
      public static final String f_23713 = "Presets";
      public static final float f_23714 = 15.0F;
      public static final float f_23715 = 14.0F;
      public static final float f_23716 = 44.0F;
      public static final float f_23717 = 220.0F;
      public static final float f_23718 = 259.0F;
      public static final float f_23719 = 20.0F;
      public static final float f_23720 = 220.0F;
      public static final float f_23721 = 259.0F;
      public static final float f_23722 = 0.5F;
      public static final float f_23723 = 20.0F;
      public static final float f_23724 = 48.0F;
      public static final float f_23725 = 220.0F;
      public static final float f_23726 = 197.0F;
      public static final float f_23727 = 52.0F;
      public static final float f_23728 = 8.0F;
      public static final float f_23729 = 245.0F;
      public static final float f_23730 = 6.0F;
      public static final float f_23731 = 16.0F;
      public static final float f_23732 = 257.0F;
      public static final float f_23733 = 154.0F;
      public static final float f_23734 = 30.0F;
      public static final float f_23735 = 10.0F;
      public static final float f_23736 = 154.0F;
      public static final float f_23737 = 30.0F;
      public static final float f_23738 = 0.5F;
      public static final float f_23739 = 10.0F;
      public static final String f_23740 = "New CFG name...";
      public static final float f_23741 = 8.0F;
      public static final float f_23742 = 10.0F;
      public static final long f_23743 = 450L;
      public static final long f_23744 = 2L;
      public static final float f_23745 = 8.0F;
      public static final float f_23746 = 8.0F;
      public static final float f_23747 = 14.0F;
      public static final float f_23748 = 0.5F;
      public static final float f_23749 = 173.0F;
      public static final float f_23750 = 256.0F;
      public static final float f_23751 = 30.0F;
      public static final float f_23752 = 30.0F;
      public static final float f_23753 = 10.0F;
      public static final float f_23754 = 173.0F;
      public static final float f_23755 = 256.0F;
      public static final float f_23756 = 30.0F;
      public static final float f_23757 = 30.0F;
      public static final float f_23758 = 0.5F;
      public static final float f_23759 = 10.0F;
      public static final float f_23760 = 183.0F;
      public static final float f_23761 = 266.0F;
      public static final float f_23762 = 10.0F;
      public static final float f_23763 = 10.0F;
      public static final float f_23764 = 208.0F;
      public static final float f_23765 = 36.0F;
      public static final float f_23766 = 0.12F;
      public static final float f_23767 = 208.0F;
      public static final float f_23768 = 36.0F;
      public static final float f_23769 = 6.0F;
      public static final float f_23770 = 0.1F;
      public static final float f_23771 = 208.0F;
      public static final float f_23772 = 36.0F;
      public static final float f_23773 = 0.5F;
      public static final float f_23774 = 6.0F;
      public static final float f_23775 = 0.72F;
      public static final float f_23776 = 0.4F;
      public static final float f_23777 = 7.0F;
      public static final float f_23778 = 10.0F;
      public static final float f_23779 = 153.0F;
      public static final float f_23780 = 9.0F;
      public static final float f_23781 = 48.0F;
      public static final float f_23782 = 18.0F;
      public static final float f_23783 = 4.0F;
      public static final float f_23784 = 9.0F;
      public static final float f_23785 = 48.0F;
      public static final float f_23786 = 18.0F;
      public static final float f_23787 = 0.5F;
      public static final float f_23788 = 4.0F;
      public static final String f_23789 = "Save";
      public static final String f_23790 = "Load";
      public static final float f_23791 = 48.0F;
      public static final float f_23792 = 0.5F;
      public static final float f_23793 = 12.0F;
      public static final String f_23794 = "Main";
      public static final float f_23795 = 18.0F;
      public static final float f_23796 = 14.0F;
      public static final String f_23797 = "Тайминг атаки — перетаскивай обе точки.";
      public static final float f_23798 = 17.0F;
      public static final float f_23799 = 46.0F;
      public static final float f_23800 = 16.0F;
      public static final float f_23801 = 65.0F;
      public static final float f_23802 = 218.0F;
      public static final float f_23803 = 218.0F;
      public static final float f_23804 = 20.0F;
      public static final float f_23805 = 16.0F;
      public static final float f_23806 = 65.0F;
      public static final float f_23807 = 218.0F;
      public static final float f_23808 = 218.0F;
      public static final float f_23809 = 0.5F;
      public static final float f_23810 = 20.0F;
      public static final float f_23811 = 60.0F;
      public static final float f_23812 = 109.0F;
      public static final float f_23813 = 130.0F;
      public static final float f_23814 = 130.0F;
      public static final float f_23815 = 12.0F;
      public static final float f_23816 = 77.0F;
      public static final float f_23817 = 123.0F;
      public static final float f_23818 = 104.0F;
      public static final float f_23819 = 103.0F;
      public static final String f_23820 = "Плавный возврат назад";
      public static final float f_23821 = 16.0F;
      public static final float f_23822 = 292.0F;
      public static final float f_23823 = 213.0F;
      public static final float f_23824 = 293.0F;
      public static final String f_23825 = "Скорость возрата";
      public static final float f_23826 = 16.0F;
      public static final float f_23827 = 315.0F;
      public static final float f_23828 = 234.0F;
      public static final float f_23829 = 315.0F;
      public static final float f_23830 = 16.0F;
      public static final float f_23831 = 332.0F;
      public static final float f_23832 = 218.0F;
      public static final float f_23833 = 4.0F;
      public static final float f_23834 = 0.1F;
      public static final float f_23835 = 0.16F;
      public static final float f_23836 = 9.0F;
      public static final float f_23837 = 218.0F;
      public static final float f_23838 = 4.0F;
      public static final float f_23839 = 3.0F;
      public static final float f_23840 = 218.0F;
      public static final float f_23841 = 5.0F;
      public static final float f_23842 = 3.0F;
      public static final float f_23843 = 10.0F;
      public static final float f_23844 = 10.0F;
      public static final float f_23845 = 5.0F;
      public static final float f_23846 = 256.0F;
      public static final float f_23847 = 4.0F;
      public static final float f_23848 = 4.0F;
      public static final float f_23849 = 4.0F;
      public static final float f_23850 = 4.0F;
      public static final float f_23851 = 20.0F;
      public static final float f_23852 = 0.5F;
      public static final float f_23853 = 0.5F;
      public static final float f_23854 = 0.5F;
      public static final float f_23855 = 0.42F;
      public static final float f_23856 = 4.0F;
      public static final float f_23857 = 4.0F;
      public static final float f_23858 = 8.0F;
      public static final float f_23859 = 8.0F;
      public static final float f_23860 = 4.0F;
      public static final String f_23861 = "Editor";
      public static final float f_23862 = 18.0F;
      public static final float f_23863 = 14.0F;
      public static final float f_23864 = 43.0F;
      public static final float f_23865 = 16.0F;
      public static final float f_23866 = 99.0F;
      public static final float f_23867 = 123.0F;
      public static final float f_23868 = 99.0F;
      public static final float f_23869 = 230.0F;
      public static final float f_23870 = 99.0F;
      public static final float f_23871 = 16.0F;
      public static final float f_23872 = 82.0F;
      public static final float f_23873 = 314.0F;
      public static final float f_23874 = 222.0F;
      public static final float f_23875 = 16.0F;
      public static final float f_23876 = 16.0F;
      public static final float f_23877 = 82.0F;
      public static final float f_23878 = 314.0F;
      public static final float f_23879 = 222.0F;
      public static final float f_23880 = 0.5F;
      public static final float f_23881 = 16.0F;
      public static final float f_23882 = 16.0F;
      public static final float f_23883 = 82.0F;
      public static final float f_23884 = 314.0F;
      public static final float f_23885 = 174.0F;
      public static final float f_23886 = 173.0F;
      public static final float f_23887 = 174.0F;
      public static final float f_23888 = 173.0F;
      public static final float f_23889 = 64.0F;
      public static final float f_23890 = 174.0F;
      public static final float f_23891 = 64.0F;
      public static final String f_23892 = "Select Start or End to edit";
      public static final float f_23893 = 173.0F;
      public static final float f_23894 = 0.5F;
      public static final float f_23895 = 283.0F;
      public static final float f_23896 = 91.0F;
      public static final float f_23897 = 268.0F;
      public static final float f_23898 = 164.0F;
      public static final float f_23899 = 24.0F;
      public static final float f_23900 = 24.0F;
      public static final float f_23901 = 8.0F;
      public static final float f_23902 = 0.16F;
      public static final float f_23903 = 24.0F;
      public static final float f_23904 = 0.7F;
      public static final float f_23905 = 8.0F;
      public static final float f_23906 = 0.78F;
      public static final String f_23907 = "Copy Start → End";
      public static final float f_23908 = 0.5F;
      public static final float f_23909 = 6.0F;
      public static final float f_23910 = 0.82F;
      public static final float f_23911 = 30.0F;
      public static final float f_23912 = 30.0F;
      public static final float f_23913 = 10.0F;
      public static final float f_23914 = 0.1F;
      public static final float f_23915 = 30.0F;
      public static final float f_23916 = 0.5F;
      public static final float f_23917 = 10.0F;
      public static final float f_23918 = 12.0F;
      public static final float f_23919 = 14.0F;
      public static final float f_23920 = 10.0F;
      public static final float f_23921 = 30.0F;
      public static final float f_23922 = 0.5F;
      public static final float f_23923 = 14.0F;
      public static final float f_23924 = 32.0F;
      public static final float f_23925 = 9.0F;
      public static final long f_23926 = 1500000000L;
      public static final float f_23927 = 1.5E9F;
      public static final float f_23928 = 64.0F;
      public static final float f_23929 = 64.0F;
      public static final float f_23930 = 0.45F;
      public static final float f_23931 = 0.68F;
      public static final float f_23932 = 1.35F;
      public static final float f_23933 = 88.0F;
      public static final float f_23934 = 0.5F;
      public static final float f_23935 = 0.5F;
      public static final float f_23936 = 16.0F;
      public static final double f_23937 = 255.0;
      public static final double f_23938 = 255.0;
      public static final double f_23939 = 255.0;
      public static final float f_23940 = 25.0F;
      public static final float f_23941 = 54.0F;
      public static final float f_23942 = 54.0F;
      public static final float f_23943 = 25.0F;
      public static final float f_23944 = 48.0F;
      public static final float f_23945 = 48.0F;
      public static final String f_23946 = "X";
      public static final float f_23947 = 62.0F;
      public static final String f_23948 = "Y";
      public static final float f_23949 = 62.0F;
      public static final String f_23950 = "Z";
      public static final float f_23951 = 40.0F;
      public static final float f_23952 = 42.0F;
      public static final float f_23953 = -1.0F;
      public static final float f_23954 = 3.4F;
      public static final float f_23955 = 2.6F;
      public static final float f_23956 = 0.98F;
      public static final float f_23957 = 0.72F;
      public static final float f_23958 = 10.0F;
      public static final float f_23959 = 9.0F;
      public static final float f_23960 = 6.0F;
      public static final float f_23961 = 6.0F;
      public static final float f_23962 = 12.0F;
      public static final float f_23963 = 12.0F;
      public static final float f_23964 = 6.0F;
      public static final float f_23965 = 0.88F;
      public static final float f_23966 = 0.5F;
      public static final float f_23967 = 4.0F;
      public static final float f_23968 = 25.0F;
      public static final float f_23969 = 54.0F;
      public static final float f_23970 = 54.0F;
      public static final float f_23971 = 25.0F;
      public static final float f_23972 = 48.0F;
      public static final float f_23973 = 48.0F;
      public static final float f_23974 = 5.0F;
      public static final float f_23975 = 220.0F;
      public static final float f_23976 = 303.0F;
      public static final float f_23977 = 250.0F;
      public static final float f_23978 = 352.0F;
      public static final float f_23979 = 346.0F;
      public static final float f_23980 = 328.0F;
      public static final float f_23981 = 52.0F;
      public static final float f_23982 = 48.0F;
      public static final float f_23983 = 220.0F;
      public static final float f_23984 = 197.0F;
      public static final float f_23985 = 6.0F;
      public static final float f_23986 = 208.0F;
      public static final float f_23987 = 36.0F;
      public static final float f_23988 = 159.0F;
      public static final float f_23989 = 9.0F;
      public static final float f_23990 = 48.0F;
      public static final float f_23991 = 18.0F;
      public static final float f_23992 = 16.0F;
      public static final float f_23993 = 257.0F;
      public static final float f_23994 = 154.0F;
      public static final float f_23995 = 30.0F;
      public static final float f_23996 = 173.0F;
      public static final float f_23997 = 256.0F;
      public static final float f_23998 = 30.0F;
      public static final float f_23999 = 30.0F;
      public static final float f_24000 = 77.0F;
      public static final float f_24001 = 123.0F;
      public static final float f_24002 = 104.0F;
      public static final float f_24003 = 103.0F;
      public static final float f_24004 = 104.0F;
      public static final float f_24005 = 103.0F;
      public static final float f_24006 = 14.0F;
      public static final float f_24007 = 14.0F;
      public static final float f_24008 = 213.0F;
      public static final float f_24009 = 291.0F;
      public static final float f_24010 = 25.0F;
      public static final float f_24011 = 13.0F;
      public static final float f_24012 = 16.0F;
      public static final float f_24013 = 327.0F;
      public static final float f_24014 = 218.0F;
      public static final float f_24015 = 18.0F;
      public static final float f_24016 = 43.0F;
      public static final float f_24017 = 16.0F;
      public static final float f_24018 = 99.0F;
      public static final float f_24019 = 30.0F;
      public static final float f_24020 = 123.0F;
      public static final float f_24021 = 99.0F;
      public static final float f_24022 = 30.0F;
      public static final float f_24023 = 230.0F;
      public static final float f_24024 = 99.0F;
      public static final float f_24025 = 30.0F;
      public static final float f_24026 = 91.0F;
      public static final float f_24027 = 268.0F;
      public static final float f_24028 = 164.0F;
      public static final float f_24029 = 24.0F;
      public static final float f_24030 = 16.0F;
      public static final float f_24031 = 82.0F;
      public static final float f_24032 = 314.0F;
      public static final float f_24033 = 174.0F;
      public static final float f_24034 = 173.0F;
      public static final float f_24035 = 64.0F;
      public static final float f_24036 = 174.0F;
      public static final float f_24037 = 64.0F;
      public static final float f_24038 = 42.0F;
      public static final float f_24039 = 64.0F;
      public static final float f_24040 = 64.0F;
      public static final double f_24041 = Math.PI;
      public static final float f_24042 = (float) (Math.PI * 2);
      public static final double f_24043 = -Math.PI;
      public static final float f_24044 = (float) (Math.PI * 2);
      public static final float f_24045 = 25.0F;
      public static final float f_24046 = 54.0F;
      public static final float f_24047 = 48.0F;
      public static final float f_24048 = 54.0F;
      public static final float f_24049 = 25.0F;
      public static final float f_24050 = 48.0F;
      public static final float f_24051 = 180.0F;
      public static final float f_24052 = 360.0F;
      public static final float f_24053 = -180.0F;
      public static final float f_24054 = 360.0F;
      public static final float f_24055 = 77.0F;
      public static final float f_24056 = 104.0F;
      public static final float f_24057 = 123.0F;
      public static final float f_24058 = 103.0F;
      public static final float f_24059 = 0.04F;
      public static final float f_24060 = 0.04F;
      public static final float f_24061 = 16.0F;
      public static final float f_24062 = 327.0F;
      public static final float f_24063 = 218.0F;
      public static final float f_24064 = 18.0F;
      public static final float f_24065 = 44.0F;
      public static final float f_24066 = 220.0F;
      public static final float f_24067 = 205.0F;
      public static final float f_24068 = 34.0F;
      public static final float f_24069 = 16.0F;
      public static final float f_24070 = 82.0F;
      public static final float f_24071 = 314.0F;
      public static final float f_24072 = 174.0F;
      public static final float f_24073 = 4.0F;
      public static final float f_24074 = 0.08F;
      public static final float f_24075 = 16.0F;
      public static final float f_24076 = 218.0F;
      public static final float f_24077 = 9.0F;
      public static final float f_24078 = 0.25F;
      public static final String f_24079 = "Smooth";
      public static final float f_24080 = -82.0F;
      public static final float f_24081 = 30.0F;
      public static final float f_24082 = 0.12F;
      public static final float f_24083 = -0.34F;
      public static final float f_24084 = -0.22F;
      public static final float f_24085 = -128.0F;
      public static final float f_24086 = 54.0F;
      public static final float f_24087 = -48.0F;
      public static final float f_24088 = 0.26F;
      public static final float f_24089 = 0.04F;
      public static final float f_24090 = 0.68F;
      public static final float f_24091 = 0.94F;
      public static final float f_24092 = 8.0F;
      public static final String f_24093 = "Down";
      public static final float f_24094 = 0.08F;
      public static final float f_24095 = -0.05F;
      public static final float f_24096 = -65.0F;
      public static final float f_24097 = 24.0F;
      public static final float f_24098 = -4.0F;
      public static final float f_24099 = 0.04F;
      public static final float f_24100 = -0.92F;
      public static final float f_24101 = -0.32F;
      public static final float f_24102 = -142.0F;
      public static final float f_24103 = 34.0F;
      public static final float f_24104 = -16.0F;
      public static final float f_24105 = 0.18F;
      public static final float f_24106 = 0.02F;
      public static final float f_24107 = 0.58F;
      public static final float f_24108 = 8.0F;
      public static final float f_24109 = 0.35F;
      public static final float f_24110 = 0.35F;
      public static final float f_24111 = 11.0F;
      public static final float f_24112 = 9.0F;
      public static final float f_24113 = 25.0F;
      public static final float f_24114 = 13.0F;
      public static final float f_24115 = 4.0F;
      public static final float f_24116 = 0.12F;
      public static final float f_24117 = 2.5F;
      public static final float f_24118 = 8.0F;
      public static final float f_24119 = 8.0F;
      public static final float f_24120 = 4.0F;
      public static final double f_24121 = 199.0;
      public static final double f_24122 = 80.0;
      public static final double f_24123 = 33.0;
      public static final double f_24124 = 255.0;
      public static final double f_24125 = 255.0;
      public static final double f_24126 = 255.0;
      public static final String f_24127 = "swing/presets";
      public static final String f_24128 = "swing/main";
      public static final String f_24129 = "swing/editor";
      public static final String f_24130 = "swing/start";
      public static final String f_24131 = "swing/end";
      public static final String f_24132 = "swing/preview";
      public static final String f_24133 = "swing/pencil";

      public void drawPresets(float var1, float var2, float var3) {
         float var4 = this.f_23658 + var3;
         Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), f_23713, var4 + f_23714, this.f_23659 + f_23715, 17, f_23630);
         float var5 = this.f_23659 + f_23716;
         Class_Ssh31B3ljfKeWsvS.m_4817(var4, var5, f_23717, f_23718, f_23719, f_23628);
         Class_Ssh31B3ljfKeWsvS.m_4854(var4, var5, f_23720, f_23721, f_23722, f_23723, f_23629);
         this.f_23652.m_9283(this.f_23666);
         Class_Ssh31B3ljfKeWsvS.m_4860(var4, this.f_23659 + f_23724, f_23725, f_23726);

         for (int var6 = 0; var6 < this.f_23654.size(); var6++) {
            float var7 = this.f_23659 + f_23727 + var6 * 40 - this.f_23652.m_9288();
            if (var7 > this.f_23659 + f_23728 && var7 < this.f_23659 + f_23729) {
               SwingAnimations$ZQeH4sWembRd4HkY var8 = this.f_23654.get(var6);
               this.drawPresetRow(var6, var8.name(), var4 + f_23730, var7, var1, var2);
            }
         }

         Class_Ssh31B3ljfKeWsvS.m_4828();
         float var10 = var4 + f_23731;
         float var11 = this.f_23659 + f_23732;
         Class_Ssh31B3ljfKeWsvS.m_4817(var10, var11, f_23733, f_23734, f_23735, f_23628);
         Class_Ssh31B3ljfKeWsvS.m_4854(var10, var11, f_23736, f_23737, f_23738, f_23739, f_23629);
         String var12 = this.f_23665.isEmpty() ? f_23740 : this.f_23665;
         Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9590(), var12, var10 + f_23741, var11 + f_23742, 11, this.f_23665.isEmpty() ? f_23631 : f_23630);
         if (this.f_23664 && System.currentTimeMillis() / f_23743 % f_23744 == 0L) {
            float var9 = var10 + f_23745 + Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9590(), this.f_23665, 11);
            Class_Ssh31B3ljfKeWsvS.m_4817(var9, var11 + f_23746, 1.0F, f_23747, f_23748, f_23632);
         }

         Class_Ssh31B3ljfKeWsvS.m_4817(var4 + f_23749, this.f_23659 + f_23750, f_23751, f_23752, f_23753, f_23628);
         Class_Ssh31B3ljfKeWsvS.m_4854(var4 + f_23754, this.f_23659 + f_23755, f_23756, f_23757, f_23758, f_23759, f_23629);
         drawIcon(var4 + f_23760, this.f_23659 + f_23761, f_23762, f_23763, f_23631, f_23647);
      }

      public SwingAnimations$ZQeH4sWembRd4HkY capturePreset(String var1) {
         return new SwingAnimations$ZQeH4sWembRd4HkY(
            var1,
            this.f_23648.f_24144.m_8768(),
            this.f_23648.f_24145.m_8768(),
            this.f_23648.f_24146.m_8768(),
            this.f_23648.f_24147.m_8768(),
            this.f_23648.f_24148.m_8768(),
            this.f_23648.f_24149.m_8768(),
            this.f_23648.f_24150.m_8768(),
            this.f_23648.f_24151.m_8768(),
            this.f_23648.f_24152.m_8768(),
            this.f_23648.f_24153.m_8768(),
            this.f_23648.f_24154.m_8768(),
            this.f_23648.f_24155.m_8768(),
            this.f_23648.f_24156.m_8768(),
            this.f_23648.f_24157.m_8768(),
            this.f_23648.f_24158.m_8768(),
            this.f_23648.f_24159.m_8768(),
            this.f_23648.f_24160.m_8768(),
            this.f_23648.f_24161.m_8768()
         );
      }

      public boolean mouseReleased(MouseButtonEvent var1) {
         this.f_23662 = 0;
         this.f_23663 = SwingAnimations$xnNvZDqm7jEDufZj.NONE;
         return true;
      }

      public static void drawIcon(float var0, float var1, float var2, float var3, int var4, Identifier var5) {
         Class_Ssh31B3ljfKeWsvS.m_4838(var0, var1, var2, var3, 0.0F, var4, var5);
      }

      public boolean keyPressed(KeyEvent var1) {
         if (this.f_23664 && var1.key() == 259 && !this.f_23665.isEmpty()) {
            int var2 = this.f_23665.offsetByCodePoints(this.f_23665.length(), -1);
            this.f_23665 = this.f_23665.substring(0, var2);
            return true;
         }

         if (!this.f_23664 || var1.key() != 257 && var1.key() != 335) {
            if (var1.key() != 256) {
               return super.keyPressed(var1);
            } else if (this.f_23664) {
               this.f_23664 = false;
               return true;
            } else {
               this.onClose();
               return true;
            }
         } else {
            this.createPreset();
            this.f_23664 = false;
            return true;
         }
      }

      public void drawMain(float var1, float var2, float var3) {
         float var4 = this.mainX() + var3;
         Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), f_23794, var4 + f_23795, this.f_23659 + f_23796, 17, f_23630);
         Class_Ssh31B3ljfKeWsvS.m_4866(
            Class_y1y6QpONhWEUIdEB.m_9590(), Class_0p152hWffX3ippAf.m_801(f_23797), var4 + f_23798, this.f_23659 + f_23799, 10, f_23631
         );
         Class_Ssh31B3ljfKeWsvS.m_4817(var4 + f_23800, this.f_23659 + f_23801, f_23802, f_23803, f_23804, f_23628);
         Class_Ssh31B3ljfKeWsvS.m_4854(var4 + f_23805, this.f_23659 + f_23806, f_23807, f_23808, f_23809, f_23810, f_23629);
         Class_Ssh31B3ljfKeWsvS.m_4854(var4 + f_23811, this.f_23659 + f_23812, f_23813, f_23814, 1.0F, f_23815, f_23629);
         this.drawBezier(var4 + f_23816, this.f_23659 + f_23817, f_23818, f_23819);
         Class_Ssh31B3ljfKeWsvS.m_4866(
            Class_y1y6QpONhWEUIdEB.m_9590(), Class_0p152hWffX3ippAf.m_801(f_23820), var4 + f_23821, this.f_23659 + f_23822, 12, f_23630
         );
         this.f_23653.m_9283(this.f_23648.f_24160.m_8768() ? 1.0F : 0.0F);
         this.drawSwitch(var4 + f_23823, this.f_23659 + f_23824, this.f_23653.m_9288());
         int var5 = Class_BftdentXEtGbugJw.m_2302(f_23631, f_23630, this.f_23653.m_9288());
         Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9590(), Class_0p152hWffX3ippAf.m_801(f_23825), var4 + f_23826, this.f_23659 + f_23827, 11, var5);
         String var6 = String.valueOf(this.f_23648.f_24161.m_8768().intValue());
         Class_Ssh31B3ljfKeWsvS.m_4866(
            Class_y1y6QpONhWEUIdEB.m_9590(),
            var6,
            var4 + f_23828 - Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9590(), var6, 11),
            this.f_23659 + f_23829,
            11,
            var5
         );
         float var7 = var4 + f_23830;
         float var8 = this.f_23659 + f_23831;
         Class_Ssh31B3ljfKeWsvS.m_4817(
            var7,
            var8,
            f_23832,
            f_23833,
            2.0F,
            Class_BftdentXEtGbugJw.m_2302(
               Class_BftdentXEtGbugJw.m_2306(f_23631, f_23834), Class_BftdentXEtGbugJw.m_2306(f_23632, f_23835), this.f_23653.m_9288()
            )
         );
         float var9 = (this.f_23648.f_24161.m_8768() - 1.0F) / f_23836;
         Class_Ssh31B3ljfKeWsvS.m_4817(var7, var8, f_23837 * var9, f_23838, f_23839, Class_BftdentXEtGbugJw.m_2302(f_23631, f_23632, this.f_23653.m_9288()));
         Class_Ssh31B3ljfKeWsvS.m_4817(var7 + f_23840 * var9 - f_23841, var8 - f_23842, f_23843, f_23844, f_23845, var5);
      }

      public boolean isPauseScreen() {
         return false;
      }

      public void drawEditorTab(SwingAnimations$ImkoK7HlTtifMMWy var1, float var2, float var3, float var4, float var5, float var6) {
         boolean var7 = this.f_23657 == var1;
         boolean var8 = inside(var5, var6, var2, var3, var4, f_23911);
         Class_Ssh31B3ljfKeWsvS.m_4817(var2, var3, var4, f_23912, f_23913, var8 ? Class_BftdentXEtGbugJw.m_2306(f_23630, f_23914) : f_23628);
         Class_Ssh31B3ljfKeWsvS.m_4854(var2, var3, var4, f_23915, f_23916, f_23917, var7 ? f_23632 : f_23629);
         int var9 = var7 ? f_23630 : f_23631;
         Identifier var10 = var1 == SwingAnimations$ImkoK7HlTtifMMWy.START ? f_23644 : (var1 == SwingAnimations$ImkoK7HlTtifMMWy.END ? f_23645 : f_23646);
         float var11 = var1 == SwingAnimations$ImkoK7HlTtifMMWy.PREVIEW ? f_23918 : f_23919;
         drawIcon(var2 + f_23920, var3 + (f_23921 - var11) * f_23922, f_23923, var11, var9, var10);
         Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9590(), var1.f_23625, var2 + f_23924, var3 + f_23925, 11, var9);
      }

      public boolean shiftDown() {
         long var1 = this.minecraft.getWindow().handle();
         return GLFW.glfwGetKey(var1, 340) == 1 || GLFW.glfwGetKey(var1, 344) == 1;
      }

      public void applyPresetValues(SwingAnimations$ZQeH4sWembRd4HkY var1) {
         set(this.f_23648.f_24144, var1.startX());
         set(this.f_23648.f_24145, var1.startY());
         set(this.f_23648.f_24146, var1.startZ());
         set(this.f_23648.f_24147, var1.startPitch());
         set(this.f_23648.f_24148, var1.startYaw());
         set(this.f_23648.f_24149, var1.startRoll());
         set(this.f_23648.f_24150, var1.endX());
         set(this.f_23648.f_24151, var1.endY());
         set(this.f_23648.f_24152, var1.endZ());
         set(this.f_23648.f_24153, var1.endPitch());
         set(this.f_23648.f_24154, var1.endYaw());
         set(this.f_23648.f_24155, var1.endRoll());
         set(this.f_23648.f_24156, var1.curve1X());
         set(this.f_23648.f_24157, var1.curve1Y());
         set(this.f_23648.f_24158, var1.curve2X());
         set(this.f_23648.f_24159, var1.curve2Y());
         this.f_23648.f_24160.m_823(var1.back());
         set(this.f_23648.f_24161, var1.backSpeed());
      }

      public boolean editorClicked(float var1, float var2, int var3) {
         float var4 = this.editorX();
         float var5 = this.f_23659 + f_24016;
         if (var3 == 0) {
            if (inside(var1, var2, var4 + f_24017, var5, f_24018, f_24019)) {
               this.selectEditorTab(SwingAnimations$ImkoK7HlTtifMMWy.START);
            } else if (inside(var1, var2, var4 + f_24020, var5, f_24021, f_24022)) {
               this.selectEditorTab(SwingAnimations$ImkoK7HlTtifMMWy.END);
            } else if (inside(var1, var2, var4 + f_24023, var5, f_24024, f_24025)) {
               this.selectEditorTab(SwingAnimations$ImkoK7HlTtifMMWy.PREVIEW);
            } else if (this.f_23657 != SwingAnimations$ImkoK7HlTtifMMWy.PREVIEW && inside(var1, var2, var4 + f_24026, this.f_23659 + f_24027, f_24028, f_24029)
               )
             {
               this.copyStartToEnd();
            } else if (this.f_23657 != SwingAnimations$ImkoK7HlTtifMMWy.PREVIEW && inside(var1, var2, var4 + f_24030, this.f_23659 + f_24031, f_24032, f_24033)
               )
             {
               SwingAnimations$fHYK0tWh3o108StE var6 = this.currentTransform();
               float var7 = var4 + f_24034 + var6.x * f_24035;
               float var8 = this.f_23659 + f_24036 - var6.y * f_24037;
               SwingAnimations$xnNvZDqm7jEDufZj var9 = this.hitRotationRing(var1, var2, var7, var8);
               if (var9 != SwingAnimations$xnNvZDqm7jEDufZj.NONE) {
                  this.beginSwordControl(var9, var1, var2, var7, var8);
               } else if (distance(var1, var2, var7, var8) <= f_24038) {
                  this.beginSwordControl(SwingAnimations$xnNvZDqm7jEDufZj.MOVE, var1, var2, var7, var8);
               }
            }
         }

         return true;
      }

      protected void extractBlurredBackground(GuiGraphicsExtractor var1) {
      }

      public SliderSetting zSetting() {
         return this.f_23657 == SwingAnimations$ImkoK7HlTtifMMWy.START ? this.f_23648.f_24146 : this.f_23648.f_24152;
      }

      public void drawWindow(float var1, float var2, float var3, float var4) {
         if (DimasikClient.m_9057().m_9049().m_2801().m_3433().m_6157().m_8768()) {
            Class_Ssh31B3ljfKeWsvS.m_4859(var1, var2, var3, var4, f_23704, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SHADOW));
         }

         Class_Ssh31B3ljfKeWsvS.m_4858(var1, var2, var3, var4, f_23705, f_23706, Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_23707));
         Class_Ssh31B3ljfKeWsvS.m_4817(var1, var2, var3, var4, f_23708, f_23627);
      }

      public void storePresets() {
         this.f_23648.f_24163.m_823(f_23626.toJson(this.f_23654));
         DimasikClient.m_9057().m_9049().m_2802().m_8859().m_5559();
      }

      public void updateSwordControl(float var1, float var2) {
         float var3 = var1 - this.f_23667;
         float var4 = var2 - this.f_23668;
         switch (this.f_23663) {
            case MOVE:
               this.xSetting().m_818(this.f_23669 + var3 / f_24039);
               this.ySetting().m_818(this.f_23670 - var4 / f_24040);
               break;
            case ROTATE_X:
            case ROTATE_Y:
            case ROTATE_Z:
               float var5 = this.rotationAngle(this.f_23663, var1, var2, this.f_23672, this.f_23673);
               float var6 = var5 - this.f_23671;

               while (var6 > f_24041) {
                  var6 -= f_24042;
               }

               while (var6 < f_24043) {
                  var6 += f_24044;
               }

               float var7 = this.wrapAngle(this.f_23669 + (float)Math.toDegrees(var6));
               if (this.f_23663 == SwingAnimations$xnNvZDqm7jEDufZj.ROTATE_X) {
                  this.pitchSetting().m_818(var7);
               } else if (this.f_23663 == SwingAnimations$xnNvZDqm7jEDufZj.ROTATE_Y) {
                  this.yawSetting().m_818(var7);
               } else {
                  this.rollSetting().m_818(var7);
               }
         }
      }

      public void drawBezier(float var1, float var2, float var3, float var4) {
         this.drawHandleLine(var1, var2 + var4, var1 + this.f_23648.f_24156.m_8768() * var3, var2 + (1.0F - this.f_23648.f_24157.m_8768()) * var4);
         this.drawHandleLine(var1 + var3, var2, var1 + this.f_23648.f_24158.m_8768() * var3, var2 + (1.0F - this.f_23648.f_24159.m_8768()) * var4);

         for (int var5 = 0; var5 <= 256; var5++) {
            float var6 = var5 / f_23846;
            float var7 = SwingAnimations.m_7286(var6, 0.0F, this.f_23648.f_24156.m_8768(), this.f_23648.f_24158.m_8768(), 1.0F);
            float var8 = SwingAnimations.m_7286(var6, 0.0F, this.f_23648.f_24157.m_8768(), this.f_23648.f_24159.m_8768(), 1.0F);
            Class_Ssh31B3ljfKeWsvS.m_4817(var1 + var7 * var3 - 1.0F, var2 + (1.0F - var8) * var4 - 1.0F, 2.0F, 2.0F, 1.0F, f_23630);
         }

         Class_Ssh31B3ljfKeWsvS.m_4817(var1 - 2.0F, var2 + var4 - 2.0F, f_23847, f_23848, 2.0F, f_23631);
         Class_Ssh31B3ljfKeWsvS.m_4817(var1 + var3 - 2.0F, var2 - 2.0F, f_23849, f_23850, 2.0F, f_23631);
         this.drawCurvePoint(var1 + this.f_23648.f_24156.m_8768() * var3, var2 + (1.0F - this.f_23648.f_24157.m_8768()) * var4);
         this.drawCurvePoint(var1 + this.f_23648.f_24158.m_8768() * var3, var2 + (1.0F - this.f_23648.f_24159.m_8768()) * var4);
      }

      public float wrapAngle(float var1) {
         while (var1 > f_24051) {
            var1 -= f_24052;
         }

         while (var1 < f_24053) {
            var1 += f_24054;
         }

         return var1;
      }

      public boolean presetsClicked(float var1, float var2, int var3) {
         if (var3 != 0 && var3 != 1) {
            return true;
         }

         for (int var4 = 0; var4 < this.f_23654.size(); var4++) {
            float var5 = this.f_23659 + f_23981 + var4 * 40 - this.f_23652.m_9288();
            if (inside(var1, var2, this.f_23658, this.f_23659 + f_23982, f_23983, f_23984)
               && inside(var1, var2, this.f_23658 + f_23985, var5, f_23986, f_23987)) {
               if (var3 == 1) {
                  this.deletePreset(var4);
                  this.f_23664 = false;
                  return true;
               }

               if (inside(var1, var2, this.f_23658 + f_23988, var5 + f_23989, f_23990, f_23991)) {
                  if (Math.round(this.f_23648.f_24162.m_8768()) == var4) {
                     this.savePreset(var4);
                  } else {
                     this.selectPreset(var4);
                  }
               } else {
                  this.selectPreset(var4);
               }

               this.f_23664 = false;
               return true;
            }
         }

         if (var3 != 0) {
            return true;
         }

         if (inside(var1, var2, this.f_23658 + f_23992, this.f_23659 + f_23993, f_23994, f_23995)) {
            this.f_23664 = true;
            return true;
         }

         if (inside(var1, var2, this.f_23658 + f_23996, this.f_23659 + f_23997, f_23998, f_23999)) {
            this.createPreset();
            this.f_23664 = false;
         }

         return true;
      }

      public SwingAnimations$fHYK0tWh3o108StE currentTransform() {
         if (this.f_23657 == SwingAnimations$ImkoK7HlTtifMMWy.START) {
            return this.readTransform(true);
         }

         if (this.f_23657 == SwingAnimations$ImkoK7HlTtifMMWy.END) {
            return this.readTransform(false);
         }

         float var1 = (float)(System.nanoTime() % f_23926) / f_23927;
         float var2 = this.f_23648.m_7274(var1);
         return SwingAnimations$fHYK0tWh3o108StE.lerp(this.readTransform(true), this.readTransform(false), var2);
      }

      public void copyStartToEnd() {
         set(this.f_23648.f_24150, this.f_23648.f_24144.m_8768());
         set(this.f_23648.f_24151, this.f_23648.f_24145.m_8768());
         set(this.f_23648.f_24152, this.f_23648.f_24146.m_8768());
         set(this.f_23648.f_24153, this.f_23648.f_24147.m_8768());
         set(this.f_23648.f_24154, this.f_23648.f_24148.m_8768());
         set(this.f_23648.f_24155, this.f_23648.f_24149.m_8768());
         this.selectEditorTab(SwingAnimations$ImkoK7HlTtifMMWy.END);
      }

      public void drawAxisBadge(String var1, float var2, float var3, int var4, boolean var5) {
         float var6 = var5 ? f_23958 : f_23959;
         Class_Ssh31B3ljfKeWsvS.m_4817(var2 - f_23960, var3 - f_23961, f_23962, f_23963, f_23964, Class_BftdentXEtGbugJw.m_2306(f_23627, f_23965));
         float var7 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var1, (int)var6);
         Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var1, var2 - var7 * f_23966, var3 - f_23967, (int)var6, var4);
      }

      public float editorX() {
         return this.mainX() + f_23711 + f_23712;
      }

      public void clearFocus() {
      }

      public void drawPresetRow(int var1, String var2, float var3, float var4, float var5, float var6) {
         boolean var7 = inside(var5, var6, var3, var4, f_23764, f_23765);
         this.f_23655.get(var1).m_9283(var7 ? 1.0F : 0.0F);
         boolean var8 = Math.round(this.f_23648.f_24162.m_8768()) == var1;
         this.f_23656.get(var1).m_9283(var8 ? 1.0F : 0.0F);
         float var9 = this.f_23655.get(var1).m_9288();
         float var10 = this.f_23656.get(var1).m_9288();
         int var11 = Class_BftdentXEtGbugJw.m_2302(f_23628, Class_BftdentXEtGbugJw.m_2306(f_23632, f_23766), var10);
         Class_Ssh31B3ljfKeWsvS.m_4817(
            var3, var4, f_23767, f_23768, f_23769, Class_BftdentXEtGbugJw.m_2302(var11, Class_BftdentXEtGbugJw.m_2306(f_23630, f_23770), var9)
         );
         Class_Ssh31B3ljfKeWsvS.m_4854(
            var3, var4, f_23771, f_23772, f_23773, f_23774, Class_BftdentXEtGbugJw.m_2302(f_23629, f_23632, Math.max(var10 * f_23775, var9 * f_23776))
         );
         int var12 = Class_BftdentXEtGbugJw.m_2302(f_23631, f_23630, var10);
         Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9590(), var2, var3 + f_23777, var4 + f_23778, 13, var12);
         float var13 = var3 + f_23779;
         if (!var8) {
            Class_Ssh31B3ljfKeWsvS.m_4817(var13, var4 + f_23780, f_23781, f_23782, f_23783, f_23632);
         } else {
            Class_Ssh31B3ljfKeWsvS.m_4854(var13, var4 + f_23784, f_23785, f_23786, f_23787, f_23788, f_23632);
         }

         String var14 = var8 ? f_23789 : f_23790;
         float var15 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9590(), var14, 10);
         Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9590(), var14, var13 + (f_23791 - var15) * f_23792, var4 + f_23793, 10, f_23630);
      }

      public void createPreset() {
         String var1 = this.f_23665.trim();
         if (!var1.isEmpty()) {
            this.f_23654.add(this.capturePreset(var1));
            this.f_23655.add(new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_24111, Class_eXr9Fra2ad3yFXY8.f_19100));
            this.f_23656.add(new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_24112, Class_eXr9Fra2ad3yFXY8.f_19100));
            int var2 = this.f_23654.size() - 1;
            this.f_23648.f_24162.m_818(var2);
            this.f_23665 = "";
            this.f_23666 = Math.max(0, this.f_23654.size() * 40 - 193);
            this.storePresets();
            this.f_23651.m_9281(0.0F);
         }
      }

      public static boolean inside(float var0, float var1, float var2, float var3, float var4, float var5) {
         return var0 >= var2 && var1 >= var3 && var0 <= var2 + var4 && var1 <= var3 + var5;
      }

      public SliderSetting rollSetting() {
         return this.f_23657 == SwingAnimations$ImkoK7HlTtifMMWy.START ? this.f_23648.f_24149 : this.f_23648.f_24155;
      }

      public void extractRenderState(GuiGraphicsExtractor var1, int var2, int var3, float var4) {
         Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
         Class_Ssh31B3ljfKeWsvS.m_4830();
         this.f_23650.m_9283(1.0F);
         this.f_23651.m_9283(1.0F);
         this.syncTheme();
         Vector2f var5 = Class_FvJXUGWpZo3zYBW4.m_2693(var2, var3);
         this.f_23660 = var5.x;
         this.f_23661 = var5.y;
         float var6 = this.minecraft.getWindow().getScreenWidth();
         float var7 = this.minecraft.getWindow().getScreenHeight();
         this.f_23658 = (var6 - f_23681) * f_23682;
         this.f_23659 = (var7 - f_23683) * f_23684 + (1.0F - this.f_23650.m_9288()) * f_23685;
         Class_Ssh31B3ljfKeWsvS.m_4864(f_23686 * this.f_23650.m_9288());
         float var8 = this.mainX();
         float var9 = this.editorX();
         this.drawWindow(this.f_23658, this.f_23659, f_23687, f_23688);
         this.drawWindow(var8, this.f_23659, f_23689, f_23690);
         this.drawWindow(var9, this.f_23659, f_23691, f_23692);
         float var10 = (1.0F - this.f_23651.m_9288()) * f_23693;
         Class_Ssh31B3ljfKeWsvS.m_4860(this.f_23658, this.f_23659, f_23694, f_23695);
         this.drawPresets(var5.x, var5.y, 0.0F);
         Class_Ssh31B3ljfKeWsvS.m_4828();
         Class_Ssh31B3ljfKeWsvS.m_4860(var8, this.f_23659, f_23696, f_23697);
         this.drawMain(var5.x, var5.y, 0.0F);
         Class_Ssh31B3ljfKeWsvS.m_4828();
         Class_Ssh31B3ljfKeWsvS.m_4860(var9, this.f_23659, f_23698, f_23699);
         Class_Ssh31B3ljfKeWsvS.m_4864(f_23700 * this.f_23650.m_9288() * this.f_23651.m_9288());
         this.drawEditor(var5.x, var5.y, var10);
         Class_Ssh31B3ljfKeWsvS.m_4828();
         Class_Ssh31B3ljfKeWsvS.m_4864(f_23701 * this.f_23650.m_9288());
         Class_Ssh31B3ljfKeWsvS.m_4844();
      }

      public boolean mouseDragged(MouseButtonEvent var1, double var2, double var4) {
         Vector2f var6 = Class_FvJXUGWpZo3zYBW4.m_2693(var1.x(), var1.y());
         if (this.f_23663 != SwingAnimations$xnNvZDqm7jEDufZj.NONE) {
            this.updateSwordControl(var6.x, var6.y);
            return true;
         }

         if (this.f_23662 != 0) {
            float var7 = Math.clamp((var6.x - (this.mainX() + f_24055)) / f_24056, 0.0F, 1.0F);
            float var8 = Math.clamp(1.0F - (var6.y - (this.f_23659 + f_24057)) / f_24058, 0.0F, 1.0F);
            if (this.f_23662 == 1) {
               this.f_23648.f_24156.m_818(Math.min(var7, this.f_23648.f_24158.m_8768() - f_24059));
               this.f_23648.f_24157.m_818(var8);
            } else {
               this.f_23648.f_24158.m_818(Math.max(var7, this.f_23648.f_24156.m_8768() + f_24060));
               this.f_23648.f_24159.m_818(var8);
            }

            return true;
         } else if (this.f_23648.f_24160.m_8768() && inside(var6.x, var6.y, this.mainX() + f_24061, this.f_23659 + f_24062, f_24063, f_24064)) {
            this.updateBackSpeed(var6.x);
            return true;
         } else {
            return true;
         }
      }

      public void loadPresets() {
         String var1 = this.f_23648.f_24163.m_8768();
         boolean var2 = false;
         if (!var1.isBlank()) {
            try {
               SwingAnimations$ZQeH4sWembRd4HkY[] var3 = (SwingAnimations$ZQeH4sWembRd4HkY[])f_23626.fromJson(var1, SwingAnimations$ZQeH4sWembRd4HkY[].class);
               if (var3 != null) {
                  var2 = true;

                  for (SwingAnimations$ZQeH4sWembRd4HkY var7 : var3) {
                     if (var7 != null && var7.name() != null) {
                        this.f_23654.add(var7);
                     }
                  }
               }
            } catch (RuntimeException var8) {
               this.f_23654.clear();
            }
         }

         if (!var2 && this.f_23654.isEmpty()) {
            this.f_23654
               .add(
                  new SwingAnimations$ZQeH4sWembRd4HkY(
                     f_24079,
                     0.0F,
                     0.0F,
                     0.0F,
                     f_24080,
                     f_24081,
                     0.0F,
                     f_24082,
                     f_24083,
                     f_24084,
                     f_24085,
                     f_24086,
                     f_24087,
                     f_24088,
                     f_24089,
                     f_24090,
                     f_24091,
                     true,
                     f_24092
                  )
               );
            this.f_23654
               .add(
                  new SwingAnimations$ZQeH4sWembRd4HkY(
                     f_24093,
                     0.0F,
                     f_24094,
                     f_24095,
                     f_24096,
                     f_24097,
                     f_24098,
                     f_24099,
                     f_24100,
                     f_24101,
                     f_24102,
                     f_24103,
                     f_24104,
                     f_24105,
                     f_24106,
                     f_24107,
                     1.0F,
                     true,
                     f_24108
                  )
               );
         }
      }

      public float mainX() {
         return this.f_23658 + f_23709 + f_23710;
      }

      public void drawEditor(float var1, float var2, float var3) {
         float var4 = this.editorX() + var3;
         Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), f_23861, var4 + f_23862, this.f_23659 + f_23863, 17, f_23630);
         float var5 = this.f_23659 + f_23864;
         this.drawEditorTab(SwingAnimations$ImkoK7HlTtifMMWy.START, var4 + f_23865, var5, f_23866, var1, var2);
         this.drawEditorTab(SwingAnimations$ImkoK7HlTtifMMWy.END, var4 + f_23867, var5, f_23868, var1, var2);
         this.drawEditorTab(SwingAnimations$ImkoK7HlTtifMMWy.PREVIEW, var4 + f_23869, var5, f_23870, var1, var2);
         Class_Ssh31B3ljfKeWsvS.m_4817(var4 + f_23871, this.f_23659 + f_23872, f_23873, f_23874, f_23875, f_23628);
         Class_Ssh31B3ljfKeWsvS.m_4854(var4 + f_23876, this.f_23659 + f_23877, f_23878, f_23879, f_23880, f_23881, f_23629);
         SwingAnimations$fHYK0tWh3o108StE var6 = this.currentTransform();
         Class_Ssh31B3ljfKeWsvS.m_4860(var4 + f_23882, this.f_23659 + f_23883, f_23884, f_23885);
         this.drawSword(var4 + f_23886, this.f_23659 + f_23887, var6);
         if (this.f_23657 != SwingAnimations$ImkoK7HlTtifMMWy.PREVIEW) {
            float var7 = var4 + f_23888 + var6.x * f_23889;
            float var8 = this.f_23659 + f_23890 - var6.y * f_23891;
            this.drawSwordControl(var7, var8, var1, var2);
         }

         Class_Ssh31B3ljfKeWsvS.m_4828();
         if (this.f_23657 == SwingAnimations$ImkoK7HlTtifMMWy.PREVIEW) {
            String var13 = f_23892;
            float var15 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9590(), var13, 9);
            Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9590(), var13, var4 + f_23893 - var15 * f_23894, this.f_23659 + f_23895, 9, f_23631);
         } else {
            float var14 = var4 + f_23896;
            float var16 = this.f_23659 + f_23897;
            float var9 = f_23898;
            boolean var10 = inside(var1, var2, var14, var16, var9, f_23899);
            Class_Ssh31B3ljfKeWsvS.m_4817(var14, var16, var9, f_23900, f_23901, var10 ? Class_BftdentXEtGbugJw.m_2306(f_23632, f_23902) : f_23628);
            Class_Ssh31B3ljfKeWsvS.m_4854(var14, var16, var9, f_23903, f_23904, f_23905, var10 ? Class_BftdentXEtGbugJw.m_2306(f_23632, f_23906) : f_23629);
            String var11 = f_23907;
            float var12 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9590(), var11, 10);
            Class_Ssh31B3ljfKeWsvS.m_4866(
               Class_y1y6QpONhWEUIdEB.m_9590(),
               var11,
               var14 + (var9 - var12) * f_23908,
               var16 + f_23909,
               10,
               var10 ? f_23630 : Class_BftdentXEtGbugJw.m_2306(f_23630, f_23910)
            );
         }
      }

      public void syncTheme() {
         f_23627 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_BACKGROUND);
         f_23628 = Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_BACKGROUND_TWO), f_23702);
         f_23628 = Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_BACKGROUND_TWO), 0.0F);
         f_23629 = Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE), f_23703);
         f_23630 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT);
         f_23631 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT);
         f_23632 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
      }

      public void drawRotationRing(float var1, float var2, float var3, float var4, int var5, boolean var6) {
         float var7 = Math.max(var3, var4);
         float var8 = this.minecraft.getWindow().getScreenWidth();
         float var9 = this.minecraft.getWindow().getScreenHeight();
         float var10 = f_23953 + var1 * 2.0F / var8;
         float var11 = 1.0F - var2 * 2.0F / var9;
         Matrix4f var12 = new Matrix4f(Class_Ssh31B3ljfKeWsvS.m_4853());
         Matrix4f var13 = new Matrix4f().translate(var10, var11, 0.0F).scale(var3 / var7, var4 / var7, 1.0F).translate(-var10, -var11, 0.0F);
         Class_Ssh31B3ljfKeWsvS.m_4814(var13);
         Class_Ssh31B3ljfKeWsvS.m_4854(
            var1 - var7, var2 - var7, var7 * 2.0F, var7 * 2.0F, var6 ? f_23954 : f_23955, var7, Class_BftdentXEtGbugJw.m_2306(var5, var6 ? f_23956 : f_23957)
         );
         Class_Ssh31B3ljfKeWsvS.m_4814(var12);
      }

      public boolean mainClicked(float var1, float var2, int var3) {
         if (var3 != 0) {
            return true;
         }

         float var4 = this.mainX();
         float var5 = var4 + f_24000;
         float var6 = this.f_23659 + f_24001;
         float var7 = var5 + this.f_23648.f_24156.m_8768() * f_24002;
         float var8 = var6 + (1.0F - this.f_23648.f_24157.m_8768()) * f_24003;
         float var9 = var5 + this.f_23648.f_24158.m_8768() * f_24004;
         float var10 = var6 + (1.0F - this.f_23648.f_24159.m_8768()) * f_24005;
         if (distance(var1, var2, var7, var8) <= f_24006) {
            this.f_23662 = 1;
         } else if (distance(var1, var2, var9, var10) <= f_24007) {
            this.f_23662 = 2;
         } else if (inside(var1, var2, var4 + f_24008, this.f_23659 + f_24009, f_24010, f_24011)) {
            this.f_23648.f_24160.m_823(!this.f_23648.f_24160.m_8768());
         } else if (this.f_23648.f_24160.m_8768() && inside(var1, var2, var4 + f_24012, this.f_23659 + f_24013, f_24014, f_24015)) {
            this.updateBackSpeed(var1);
         }

         return true;
      }

      public SliderSetting xSetting() {
         return this.f_23657 == SwingAnimations$ImkoK7HlTtifMMWy.START ? this.f_23648.f_24144 : this.f_23648.f_24150;
      }

      public void deletePreset(int var1) {
         if (var1 >= 0 && var1 < this.f_23654.size()) {
            int var2 = Math.round(this.f_23648.f_24162.m_8768());
            this.f_23654.remove(var1);
            this.f_23655.remove(var1);
            this.f_23656.remove(var1);
            if (this.f_23654.isEmpty()) {
               this.f_23648.f_24162.m_818(0.0F);
            } else {
               int var3 = var2 > var1 ? var2 - 1 : Math.min(var2, this.f_23654.size() - 1);
               this.f_23648.f_24162.m_818(var3);
               if (var2 == var1) {
                  this.applyPresetValues(this.f_23654.get(var3));
               }
            }

            float var4 = Math.max(0, this.f_23654.size() * 40 - 193);
            this.f_23666 = Math.clamp(this.f_23666, 0.0F, var4);
            this.storePresets();
            this.f_23651.m_9281(f_24110);
         }
      }

      public void drawCurvePoint(float var1, float var2) {
         Class_Ssh31B3ljfKeWsvS.m_4817(var1 - f_23856, var2 - f_23857, f_23858, f_23859, f_23860, f_23630);
      }

      public void drawSword(float var1, float var2, SwingAnimations$fHYK0tWh3o108StE var3) {
         float var4 = var1 + var3.x * f_23928;
         float var5 = var2 - var3.y * f_23929;
         float var6 = Math.clamp(1.0F / (1.0F - var3.z * f_23930), f_23931, f_23932);
         float var7 = f_23933 * var6;
         Class_Ssh31B3ljfKeWsvS.m_4818(
            Items.DIAMOND_SWORD.getDefaultInstance(), var4 - var7 * f_23934, var5 - var7 * f_23935, var7 / f_23936, var3.pitch, var3.yaw, var3.roll
         );
      }

      public void drawHandleLine(float var1, float var2, float var3, float var4) {
         for (int var5 = 0; var5 <= 20; var5++) {
            float var6 = var5 / f_23851;
            Class_Ssh31B3ljfKeWsvS.m_4817(
               Mth.lerp(var6, var1, var3) - f_23852, Mth.lerp(var6, var2, var4) - f_23853, 1.0F, 1.0F, f_23854, Class_BftdentXEtGbugJw.m_2306(f_23631, f_23855)
            );
         }
      }

      public Z1BZkZCV4oiAFXcH(SwingAnimations var1, Screen var2) {
         super(Component.literal(f_23674));
         this.f_23650 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_23675, Class_eXr9Fra2ad3yFXY8.f_19100);
         this.f_23651 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_23676, Class_eXr9Fra2ad3yFXY8.f_19100);
         this.f_23652 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_23677, Class_eXr9Fra2ad3yFXY8.f_19100);
         this.f_23654 = new ArrayList<>();
         this.f_23655 = new ArrayList<>();
         this.f_23656 = new ArrayList<>();
         this.f_23657 = SwingAnimations$ImkoK7HlTtifMMWy.START;
         this.f_23663 = SwingAnimations$xnNvZDqm7jEDufZj.NONE;
         this.f_23665 = "";
         this.f_23648 = var1;
         this.f_23649 = var2;
         this.f_23653 = new Class_w8fCJQ5ZtH5lQbWc(var1.f_24160.m_8768() ? 1.0F : 0.0F, f_23678, Class_eXr9Fra2ad3yFXY8.f_19100);
         this.loadPresets();
         int var3 = this.f_23654.isEmpty() ? 0 : Math.clamp(Math.round(var1.f_24162.m_8768()), 0, this.f_23654.size() - 1);
         var1.f_24162.m_818(var3);

         for (int var4 = 0; var4 < this.f_23654.size(); var4++) {
            this.f_23655.add(new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_23679, Class_eXr9Fra2ad3yFXY8.f_19100));
            this.f_23656.add(new Class_w8fCJQ5ZtH5lQbWc(var4 == var3 ? 1.0F : 0.0F, f_23680, Class_eXr9Fra2ad3yFXY8.f_19100));
         }
      }

      public void savePreset(int var1) {
         if (var1 >= 0 && var1 < this.f_23654.size()) {
            SwingAnimations$ZQeH4sWembRd4HkY var2 = this.f_23654.get(var1);
            this.f_23654.set(var1, this.capturePreset(var2.name()));
            this.storePresets();
            this.f_23656.get(var1).m_9281(f_24109);
         }
      }

      public void removed() {
         this.storePresets();
         super.removed();
      }

      public void updateBackSpeed(float var1) {
         float var2 = 1.0F + Math.clamp((var1 - (this.mainX() + f_24075)) / f_24076, 0.0F, 1.0F) * f_24077;
         this.f_23648.f_24161.m_818(var2);
      }

      public SwingAnimations$xnNvZDqm7jEDufZj hitRotationRing(float var1, float var2, float var3, float var4) {
         float var5 = this.ellipseDistance(var1 - var3, var2 - var4, f_23968, f_23969);
         float var6 = this.ellipseDistance(var1 - var3, var2 - var4, f_23970, f_23971);
         float var7 = this.ellipseDistance(var1 - var3, var2 - var4, f_23972, f_23973);
         float var8 = Math.min(var5, Math.min(var6, var7));
         if (var8 > f_23974) {
            return SwingAnimations$xnNvZDqm7jEDufZj.NONE;
         } else if (var8 == var5) {
            return SwingAnimations$xnNvZDqm7jEDufZj.ROTATE_X;
         } else {
            return var8 == var6 ? SwingAnimations$xnNvZDqm7jEDufZj.ROTATE_Y : SwingAnimations$xnNvZDqm7jEDufZj.ROTATE_Z;
         }
      }

      public float rotationAngle(SwingAnimations$xnNvZDqm7jEDufZj var1, float var2, float var3, float var4, float var5) {
         float var6 = var1 == SwingAnimations$xnNvZDqm7jEDufZj.ROTATE_X ? f_24045 : (var1 == SwingAnimations$xnNvZDqm7jEDufZj.ROTATE_Y ? f_24046 : f_24047);
         float var7 = var1 == SwingAnimations$xnNvZDqm7jEDufZj.ROTATE_X ? f_24048 : (var1 == SwingAnimations$xnNvZDqm7jEDufZj.ROTATE_Y ? f_24049 : f_24050);
         return (float)Math.atan2((var3 - var5) / var7, (var2 - var4) / var6);
      }

      public void beginSwordControl(SwingAnimations$xnNvZDqm7jEDufZj var1, float var2, float var3, float var4, float var5) {
         this.f_23663 = var1;
         this.f_23667 = var2;
         this.f_23668 = var3;
         this.f_23672 = var4;
         this.f_23673 = var5;

         this.f_23669 = switch (var1) {
            case MOVE -> this.xSetting().m_8768();
            case ROTATE_X -> this.pitchSetting().m_8768();
            case ROTATE_Y -> this.yawSetting().m_8768();
            case ROTATE_Z -> this.rollSetting().m_8768();
            default -> 0.0F;
         };
         this.f_23670 = this.ySetting().m_8768();
         this.f_23671 = this.rotationAngle(var1, var2, var3, var4, var5);
      }

      public void selectPreset(int var1) {
         if (var1 >= 0 && var1 < this.f_23654.size()) {
            this.f_23648.f_24162.m_818(var1);
            this.applyPresetValues(this.f_23654.get(var1));
            this.storePresets();
            this.f_23651.m_9281(0.0F);
         }
      }

      public void drawSwitch(float var1, float var2, float var3) {
         Class_Ssh31B3ljfKeWsvS.m_4817(
            var1, var2, f_24113, f_24114, f_24115, Class_BftdentXEtGbugJw.m_2302(Class_BftdentXEtGbugJw.m_2306(f_23632, f_24116), f_23632, var3)
         );
         Class_Ssh31B3ljfKeWsvS.m_4817(var1 + Mth.lerpInt(var3, 2, 15), var2 + f_24117, f_24118, f_24119, f_24120, f_23630);
      }

      public boolean mouseScrolled(double var1, double var3, double var5, double var7) {
         Vector2f var9 = Class_FvJXUGWpZo3zYBW4.m_2693(var1, var3);
         if (inside(var9.x, var9.y, this.f_23658, this.f_23659 + f_24065, f_24066, f_24067)) {
            float var10 = Math.max(0, this.f_23654.size() * 40 - 193);
            this.f_23666 = Math.clamp(this.f_23666 - (float)var7 * f_24068, 0.0F, var10);
            return true;
         }

         if (this.f_23657 != SwingAnimations$ImkoK7HlTtifMMWy.PREVIEW
            && inside(var9.x, var9.y, this.editorX() + f_24069, this.f_23659 + f_24070, f_24071, f_24072)) {
            if (this.shiftDown()) {
               this.rollSetting().m_818(this.rollSetting().m_8768() + (float)var7 * f_24073);
            } else {
               this.zSetting().m_818(this.zSetting().m_8768() + (float)var7 * f_24074);
            }

            return true;
         } else {
            return true;
         }
      }

      public SliderSetting yawSetting() {
         return this.f_23657 == SwingAnimations$ImkoK7HlTtifMMWy.START ? this.f_23648.f_24148 : this.f_23648.f_24154;
      }

      public void selectEditorTab(SwingAnimations$ImkoK7HlTtifMMWy var1) {
         if (this.f_23657 != var1) {
            this.f_23657 = var1;
            this.f_23663 = SwingAnimations$xnNvZDqm7jEDufZj.NONE;
            this.f_23651.m_9281(f_24078);
         }
      }

      public void drawSwordControl(float var1, float var2, float var3, float var4) {
         SwingAnimations$xnNvZDqm7jEDufZj var5 = this.f_23663 == SwingAnimations$xnNvZDqm7jEDufZj.NONE
            ? this.hitRotationRing(var3, var4, var1, var2)
            : this.f_23663;
         int var6 = Class_BftdentXEtGbugJw.m_2303(242, 104, 124, f_23937);
         int var7 = Class_BftdentXEtGbugJw.m_2303(91, 210, 151, f_23938);
         int var8 = Class_BftdentXEtGbugJw.m_2303(99, 158, 255, f_23939);
         this.drawRotationRing(var1, var2, f_23940, f_23941, var6, var5 == SwingAnimations$xnNvZDqm7jEDufZj.ROTATE_X);
         this.drawRotationRing(var1, var2, f_23942, f_23943, var7, var5 == SwingAnimations$xnNvZDqm7jEDufZj.ROTATE_Y);
         this.drawRotationRing(var1, var2, f_23944, f_23945, var8, var5 == SwingAnimations$xnNvZDqm7jEDufZj.ROTATE_Z);
         this.drawAxisBadge(f_23946, var1, var2 - f_23947, var6, var5 == SwingAnimations$xnNvZDqm7jEDufZj.ROTATE_X);
         this.drawAxisBadge(f_23948, var1 + f_23949, var2, var7, var5 == SwingAnimations$xnNvZDqm7jEDufZj.ROTATE_Y);
         this.drawAxisBadge(f_23950, var1 - f_23951, var2 + f_23952, var8, var5 == SwingAnimations$xnNvZDqm7jEDufZj.ROTATE_Z);
      }

      public SliderSetting ySetting() {
         return this.f_23657 == SwingAnimations$ImkoK7HlTtifMMWy.START ? this.f_23648.f_24145 : this.f_23648.f_24151;
      }

      public static void set(SliderSetting var0, float var1) {
         var0.m_818(var1);
      }

      public float ellipseDistance(float var1, float var2, float var3, float var4) {
         float var5 = (float)Math.sqrt(var1 * var1 / (var3 * var3) + var2 * var2 / (var4 * var4));
         return Math.abs(var5 - 1.0F) * Math.min(var3, var4);
      }

      public SwingAnimations$fHYK0tWh3o108StE readTransform(boolean var1) {
         return new SwingAnimations$fHYK0tWh3o108StE(
            (var1 ? this.f_23648.f_24144 : this.f_23648.f_24150).m_8768(),
            (var1 ? this.f_23648.f_24145 : this.f_23648.f_24151).m_8768(),
            (var1 ? this.f_23648.f_24146 : this.f_23648.f_24152).m_8768(),
            (var1 ? this.f_23648.f_24147 : this.f_23648.f_24153).m_8768(),
            (var1 ? this.f_23648.f_24148 : this.f_23648.f_24154).m_8768(),
            (var1 ? this.f_23648.f_24149 : this.f_23648.f_24155).m_8768()
         );
      }

      public static float distance(float var0, float var1, float var2, float var3) {
         float var4 = var0 - var2;
         float var5 = var1 - var3;
         return (float)Math.sqrt(var4 * var4 + var5 * var5);
      }

      public SliderSetting pitchSetting() {
         return this.f_23657 == SwingAnimations$ImkoK7HlTtifMMWy.START ? this.f_23648.f_24147 : this.f_23648.f_24153;
      }

      public boolean mouseClicked(MouseButtonEvent var1, boolean var2) {
         Vector2f var3 = Class_FvJXUGWpZo3zYBW4.m_2693(var1.x(), var1.y());
         if (inside(var3.x, var3.y, this.f_23658, this.f_23659, f_23975, f_23976)) {
            return this.presetsClicked(var3.x, var3.y, var1.button());
         }

         if (inside(var3.x, var3.y, this.mainX(), this.f_23659, f_23977, f_23978)) {
            return this.mainClicked(var3.x, var3.y, var1.button());
         }

         if (inside(var3.x, var3.y, this.editorX(), this.f_23659, f_23979, f_23980)) {
            return this.editorClicked(var3.x, var3.y, var1.button());
         }

         this.f_23664 = false;
         return true;
      }

      public void onClose() {
         this.minecraft.gui.setScreen(this.f_23649);
      }

      public boolean charTyped(CharacterEvent var1) {
         if (this.f_23664 && this.f_23665.length() < 18) {
            int var2 = var1.codepoint();
            if (!Character.isISOControl(var2)) {
               this.f_23665 = this.f_23665 + var1.codepointAsString();
            }

            return true;
         } else {
            return true;
         }
      }
   }
}
