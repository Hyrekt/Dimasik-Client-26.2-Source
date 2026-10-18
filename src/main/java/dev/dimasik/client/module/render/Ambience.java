package dev.dimasik.client.module.render;

import com.google.gson.JsonObject;
import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.pipeline.TextureTarget;
import com.mojang.blaze3d.platform.BlendFactor;
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
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.module.misc.HpHelper;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ColorSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_B4b08mhJ5vKzLj3f;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_NzJrN63M7QBpmAbi;
import dev.dimasik.client.system.Class_PoKta0VE7AdhY1En;
import dev.dimasik.client.system.Class_TwRQEhCOrGjBfPHM;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_hE5HYN1IW4q63o2z;
import dev.dimasik.client.system.Class_iPYWEF3PJUsktYTP;
import dev.dimasik.client.system.Class_r9kQ4gX1JiW2lKoS;
import dev.dimasik.client.system.Class_sULPxrOl7TpPlaX6;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.Camera;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.resources.sounds.AbstractTickableSoundInstance;
import net.minecraft.client.resources.sounds.SoundInstance.Attenuation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.Heightmap.Types;
import net.minecraft.world.level.material.FogType;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;

public class Ambience extends Module {
   private final Class_r9kQ4gX1JiW2lKoS f_8410 = new Class_r9kQ4gX1JiW2lKoS();
   private final Class_iPYWEF3PJUsktYTP f_8411 = new Class_iPYWEF3PJUsktYTP();
   private final Class_B4b08mhJ5vKzLj3f f_8412 = new Class_B4b08mhJ5vKzLj3f();
   private static final BlendFunction f_8413 = new BlendFunction(BlendFactor.DST_COLOR, BlendFactor.SRC_COLOR, BlendFactor.ZERO, BlendFactor.ONE);
   private static final int f_8414 = 240;
   private static final int f_8415 = 80;
   private static final int f_8416 = 160;
   private static final int f_8417 = 32;
   private static final int f_8418 = 48;
   private static final int f_8419 = 144;
   private static final long f_8420 = 131072L;
   private static final int f_8421 = 1;
   private static final int f_8422 = 64;
   private static final int f_8423 = 8192;
   private static final int f_8424 = 400;
   private static final int f_8425 = 2;
   private final RenderPipeline f_8426;
   private final RenderPipeline f_8427;
   private final RenderPipeline f_8428;
   private final RenderPipeline f_8429;
   private final RenderPipeline f_8430;
   private final RenderPipeline f_8431;
   private final RenderPipeline f_8432;
   private final RenderPipeline f_8433;
   private final RenderPipeline f_8434;
   private final RenderPipeline f_8435;
   private final RenderPipeline f_8436;
   private final RenderPipeline f_8437;
   private final RenderPipeline f_8438;
   private final RenderPipeline f_8439;
   private final RenderPipeline f_8440;
   private final RenderPipeline f_8441;
   private final RenderPipeline f_8442;
   private final RenderPipeline f_8443;
   private GpuBuffer f_8444;
   private int f_8445;
   private float f_8446;
   private TextureTarget f_8447;
   private GpuBuffer f_8448;
   private GpuBuffer f_8449;
   private GpuBuffer f_8450;
   private GpuBuffer f_8451;
   private TextureTarget f_8452;
   private GpuBuffer f_8453;
   private int f_8454;
   private long f_8455;
   private TextureTarget f_8456;
   private TextureTarget f_8457;
   private TextureTarget f_8458;
   private GpuBuffer f_8459;
   private GpuBuffer f_8460;
   private GpuBuffer f_8461;
   private GpuBuffer f_8462;
   private final GpuBuffer[] f_8463;
   private final long[] f_8464;
   private final GpuBuffer[] f_8465;
   private final List<Ambience.TzSMY0NlqKxPK3T3> f_8466;
   private final Matrix4f f_8467;
   private final Matrix4f f_8468;
   private final Matrix4f f_8469;
   private final Matrix4f f_8470;
   private double f_8471;
   private long f_8472;
   private double f_8473;
   private double f_8474;
   private double f_8475;
   private double f_8476;
   private long f_8477;
   private long f_8478;
   private Vec3 f_8479;
   private Vec3 f_8480;
   private int f_8481;
   private Vec3 f_8482;
   private Ambience.xjEHgoF49w8Sc100 f_8483;
   private final MultiChoiceSetting f_8484;
   private final SliderSetting f_8485;
   private final SliderSetting f_8486;
   private final CheckboxSetting f_8487;
   private final ColorSetting f_8488;
   private final MultiChoiceSetting f_8489;
   private final SliderSetting f_8490;
   private final SliderSetting f_8491;
   private final CheckboxSetting f_8492;
   private final SliderSetting f_8493;
   private final SliderSetting f_8494;
   private final SliderSetting f_8495;
   private final SliderSetting f_8496;
   private final SliderSetting f_8497;
   private final SliderSetting f_8498;
   private final SliderSetting f_8499;
   private final SliderSetting f_8500;
   private final ColorSetting f_8501;
   private final ColorSetting f_8502;
   private final CheckboxSetting f_8503;
   private final MultiChoiceSetting f_8504;
   private final Class_TwRQEhCOrGjBfPHM f_8505;
   private final MultiChoiceSetting f_8506;
   private final ColorSetting f_8507;
   private final SliderSetting f_8508;
   private final SliderSetting f_8509;
   private final SliderSetting f_8510;
   private final SliderSetting f_8511;
   private final SliderSetting f_8512;
   private final SliderSetting f_8513;
   private final SliderSetting f_8514;
   private final CheckboxSetting f_8515;
   private final SliderSetting f_8516;
   private final SliderSetting f_8517;
   private final ColorSetting f_8518;
   private final ColorSetting f_8519;
   private final CheckboxSetting f_8520;
   private final SliderSetting f_8521;
   private final SliderSetting f_8522;
   private final CheckboxSetting f_8523;
   private final SliderSetting f_8524;
   private final CheckboxSetting f_8525;
   private final Class_gEPk7yDw6CwIte87<Class_hE5HYN1IW4q63o2z> f_8526;
   private final Class_gEPk7yDw6CwIte87<Class_sULPxrOl7TpPlaX6> f_8527;
   private static final String f_8528 = "Ambience";
   private static final String f_8529 = "Изменение погоды мира";
   private static final String f_8530 = "dimasik/weather_particles";
   private static final String f_8531 = "weather_particles";
   private static final String f_8532 = "weather_particles";
   private static final String f_8533 = "Weather";
   private static final String f_8534 = "Fog";
   private static final String f_8535 = "dimasik/weather_rain";
   private static final String f_8536 = "weather_particles";
   private static final String f_8537 = "weather_particles";
   private static final String f_8538 = "DIMASIK_RAIN";
   private static final String f_8539 = "Weather";
   private static final String f_8540 = "Fog";
   private static final String f_8541 = "RainRoof";
   private static final String f_8542 = "RoofSampler";
   private static final String f_8543 = "dimasik/weather_rain_ground";
   private static final String f_8544 = "weather_ground";
   private static final String f_8545 = "weather_ground";
   private static final String f_8546 = "DIMASIK_RAIN";
   private static final String f_8547 = "Weather";
   private static final String f_8548 = "Fog";
   private static final String f_8549 = "RainRoof";
   private static final String f_8550 = "DepthSampler";
   private static final String f_8551 = "RoofSampler";
   private static final String f_8552 = "dimasik/weather_ground";
   private static final String f_8553 = "weather_ground";
   private static final String f_8554 = "weather_ground";
   private static final String f_8555 = "Weather";
   private static final String f_8556 = "Fog";
   private static final String f_8557 = "DepthSampler";
   private static final String f_8558 = "dimasik/ambience_blizzard";
   private static final String f_8559 = "hands_fullscreen";
   private static final String f_8560 = "ambience_blizzard";
   private static final String f_8561 = "Blizzard";
   private static final String f_8562 = "DepthSampler";
   private static final String f_8563 = "dimasik/ambience_shader_fog";
   private static final String f_8564 = "hands_fullscreen";
   private static final String f_8565 = "ambience_shader_fog";
   private static final String f_8566 = "ShaderFog";
   private static final String f_8567 = "DepthSampler";
   private static final String f_8568 = "dimasik/shader_mist_pulsar";
   private static final String f_8569 = "hands_fullscreen";
   private static final String f_8570 = "shader_mist_pulsar";
   private static final String f_8571 = "ShaderMist";
   private static final String f_8572 = "DepthSampler";
   private static final String f_8573 = "dimasik/shader_mist_galaxy";
   private static final String f_8574 = "hands_fullscreen";
   private static final String f_8575 = "shader_mist_galaxy";
   private static final String f_8576 = "ShaderMist";
   private static final String f_8577 = "DepthSampler";
   private static final String f_8578 = "dimasik/shader_mist_juice";
   private static final String f_8579 = "hands_fullscreen";
   private static final String f_8580 = "shader_mist_juice";
   private static final String f_8581 = "SkyShaderData";
   private static final String f_8582 = "DepthSampler";
   private static final String f_8583 = "dimasik/ambience_shader_sky_composite";
   private static final String f_8584 = "hands_fullscreen";
   private static final String f_8585 = "ambience_shader_sky_composite";
   private static final String f_8586 = "SkySampler";
   private static final String f_8587 = "DepthSampler";
   private static final String f_8588 = "dimasik/ambience_world_color";
   private static final String f_8589 = "hands_fullscreen";
   private static final String f_8590 = "ambience_world_color";
   private static final String f_8591 = "WorldColor";
   private static final String f_8592 = "dimasik/ambience_lightning";
   private static final String f_8593 = "ambience_lightning";
   private static final String f_8594 = "ambience_lightning";
   private static final String f_8595 = "Lightning";
   private static final String f_8596 = "dimasik/ambience_lightning_core";
   private static final String f_8597 = "ambience_lightning";
   private static final String f_8598 = "ambience_lightning_core";
   private static final String f_8599 = "Lightning";
   private static final String f_8600 = "dimasik/ambience_lightning_flash";
   private static final String f_8601 = "hands_fullscreen";
   private static final String f_8602 = "ambience_lightning_flash";
   private static final String f_8603 = "LightningFlash";
   private static final String f_8604 = "DepthSampler";
   private static final String f_8605 = "dimasik/weather_ground_composite";
   private static final String f_8606 = "hands_pass";
   private static final String f_8607 = "weather_ground_composite";
   private static final String f_8608 = "Sampler0";
   private static final String f_8609 = "dimasik/ambience_lightning_glow_mask";
   private static final String f_8610 = "hands_fullscreen";
   private static final String f_8611 = "ambience_lightning_glow_mask";
   private static final String f_8612 = "InSampler";
   private static final String f_8613 = "dimasik/ambience_lightning_glow_blur";
   private static final String f_8614 = "hands_fullscreen";
   private static final String f_8615 = "ambience_lightning_glow_blur";
   private static final String f_8616 = "LightningGlowBlur";
   private static final String f_8617 = "InSampler";
   private static final String f_8618 = "dimasik/ambience_lightning_glow_composite";
   private static final String f_8619 = "hands_fullscreen";
   private static final String f_8620 = "ambience_lightning_glow_composite";
   private static final String f_8621 = "LightningGlowComposite";
   private static final String f_8622 = "BloomSampler";
   private static final int f_8623 = Integer.MIN_VALUE;
   private static final long f_8624 = -1L;
   private static final String f_8625 = "Туман";
   private static final String f_8626 = "Ничего не делать";
   private static final String f_8627 = "Очистить";
   private static final String f_8628 = "Переопределить";
   private static final String f_8629 = "Конец тумана";
   private static final float f_8630 = 0.1F;
   private static final float f_8631 = 1.5F;
   private static final float f_8632 = 0.1F;
   private static final String f_8633 = "Начало тумана";
   private static final float f_8634 = 0.5F;
   private static final float f_8635 = 0.1F;
   private static final float f_8636 = 1.4F;
   private static final float f_8637 = 0.1F;
   private static final String f_8638 = "Авто цвет под тему";
   private static final String f_8639 = "Цвет тумана";
   private static final String f_8640 = "Шейдер неба";
   private static final String f_8641 = "Ничего";
   private static final String f_8642 = "Пульсар";
   private static final String f_8643 = "Галактика";
   private static final String f_8644 = "Сок";
   private static final String f_8645 = "Космос";
   private static final String f_8646 = "Млечный Путь";
   private static final String f_8647 = "Purple";
   private static final String f_8648 = "Аврора";
   private static final String f_8649 = "Аврора 2";
   private static final String f_8650 = "Туманность";
   private static final String f_8651 = "Плазма";
   private static final String f_8652 = "Источник";
   private static final String f_8653 = "Небула";
   private static final String f_8654 = "Интенсивность шейдера";
   private static final float f_8655 = 1.5F;
   private static final float f_8656 = 0.05F;
   private static final String f_8657 = "Скорость шейдера";
   private static final float f_8658 = 0.1F;
   private static final float f_8659 = 5.0F;
   private static final float f_8660 = 0.05F;
   private static final String f_8661 = "Звёзды";
   private static final String f_8662 = "Скорость неба";
   private static final float f_8663 = 0.1F;
   private static final float f_8664 = 5.0F;
   private static final float f_8665 = 0.1F;
   private static final String f_8666 = "Размер неба";
   private static final float f_8667 = 5.0F;
   private static final float f_8668 = 20.0F;
   private static final float f_8669 = 0.5F;
   private static final String f_8670 = "Интенсивность неба";
   private static final float f_8671 = 0.01F;
   private static final float f_8672 = 0.001F;
   private static final float f_8673 = 0.05F;
   private static final float f_8674 = 0.001F;
   private static final String f_8675 = "Прозрачность неба";
   private static final float f_8676 = 0.3F;
   private static final float f_8677 = 0.05F;
   private static final String f_8678 = "Сила Авроры";
   private static final float f_8679 = 0.1F;
   private static final float f_8680 = 0.05F;
   private static final String f_8681 = "Скорость Авроры";
   private static final float f_8682 = 0.1F;
   private static final float f_8683 = 3.0F;
   private static final float f_8684 = 0.1F;
   private static final String f_8685 = "Масштаб Авроры";
   private static final float f_8686 = 1.1F;
   private static final float f_8687 = 0.45F;
   private static final float f_8688 = 3.0F;
   private static final float f_8689 = 0.05F;
   private static final String f_8690 = "Звёзды Авроры";
   private static final float f_8691 = 0.75F;
   private static final float f_8692 = 0.05F;
   private static final String f_8693 = "Цвет Авроры 1";
   private static final int f_8694 = -8788225;
   private static final String f_8695 = "Цвет Авроры 2";
   private static final int f_8696 = -34074;
   private static final String f_8697 = "Ванильное небо";
   private static final String f_8698 = "Погода";
   private static final String f_8699 = "Ничего не делать";
   private static final String f_8700 = "Очистить";
   private static final String f_8701 = "Дождь";
   private static final String f_8702 = "Снег";
   private static final String f_8703 = "Пурга";
   private static final String f_8704 = "Время";
   private static final String f_8705 = "Обычное";
   private static final String f_8706 = "Утро";
   private static final String f_8707 = "День";
   private static final String f_8708 = "Вечер";
   private static final String f_8709 = "Закат";
   private static final String f_8710 = "Ночь";
   private static final String f_8711 = "Цвет мира";
   private static final String f_8712 = "Ничего";
   private static final String f_8713 = "Тема";
   private static final String f_8714 = "Свой";
   private static final String f_8715 = "Оттенок мира";
   private static final String f_8716 = "Сила цвета мира";
   private static final float f_8717 = 0.08F;
   private static final float f_8718 = 0.25F;
   private static final float f_8719 = 0.01F;
   private static final String f_8720 = "Интенсивность погоды";
   private static final float f_8721 = 0.65F;
   private static final float f_8722 = 0.1F;
   private static final float f_8723 = 0.05F;
   private static final String f_8724 = "Дальность погоды";
   private static final float f_8725 = 32.0F;
   private static final float f_8726 = 12.0F;
   private static final float f_8727 = 64.0F;
   private static final String f_8728 = "Скорость падения";
   private static final float f_8729 = 0.25F;
   private static final float f_8730 = 0.05F;
   private static final String f_8731 = "Размер частиц погоды";
   private static final float f_8732 = 0.5F;
   private static final float f_8733 = 0.05F;
   private static final String f_8734 = "Скорость ветра";
   private static final float f_8735 = 1.5F;
   private static final float f_8736 = 12.0F;
   private static final float f_8737 = 0.1F;
   private static final String f_8738 = "Направление ветра";
   private static final float f_8739 = -180.0F;
   private static final float f_8740 = 180.0F;
   private static final float f_8741 = 5.0F;
   private static final String f_8742 = "Эффекты погоды на земле";
   private static final String f_8743 = "Время эффекта на земле";
   private static final float f_8744 = 0.6F;
   private static final float f_8745 = 0.15F;
   private static final float f_8746 = 1.5F;
   private static final float f_8747 = 0.05F;
   private static final String f_8748 = "Размер эффекта на земле";
   private static final float f_8749 = 0.45F;
   private static final float f_8750 = 0.15F;
   private static final float f_8751 = 1.2F;
   private static final float f_8752 = 0.05F;
   private static final String f_8753 = "Цвет дождя";
   private static final int f_8754 = -4799020;
   private static final String f_8755 = "Цвет снега";
   private static final String f_8756 = "Молнии";
   private static final String f_8757 = "Скорость появления";
   private static final float f_8758 = 0.25F;
   private static final float f_8759 = 4.0F;
   private static final float f_8760 = 0.05F;
   private static final String f_8761 = "Количество молний";
   private static final float f_8762 = 6.0F;
   private static final String f_8763 = "Звуки грома";
   private static final String f_8764 = "Громкость грома";
   private static final float f_8765 = 0.5F;
   private static final float f_8766 = 0.05F;
   private static final String f_8767 = "Удалять Облака";
   private static final String f_8768 = "Settings";
   private static final String f_8769 = "Settings";
   private static final String f_8770 = "Шейдерное небо";
   private static final String f_8771 = "Шейдерное небо";
   private static final String f_8772 = "Пульсар";
   private static final String f_8773 = "Шейдер тумана";
   private static final String f_8774 = "Шейдер тумана";
   private static final String f_8775 = "Ничего";
   private static final String f_8776 = "Очистить";
   private static final String f_8777 = "Переопределить";
   private static final String f_8778 = "Ничего не делать";
   private static final String f_8779 = "Дождь";
   private static final float f_8780 = 0.4F;
   private static final String f_8781 = "Дождь";
   private static final String f_8782 = "Снег";
   private static final String f_8783 = "Пурга";
   private static final String f_8784 = "Пурга";
   private static final String f_8785 = "Ничего не делать";
   private static final float f_8786 = 1.0E7F;
   private static final float f_8787 = 1.0E7F;
   private static final float f_8788 = 16.0F;
   private static final float f_8789 = 1.0E7F;
   private static final float f_8790 = 1.0000001E7F;
   private static final int f_8791 = -16777216;
   private static final float f_8792 = 0.1F;
   private static final float f_8793 = 0.85F;
   private static final float f_8794 = 0.38F;
   private static final float f_8795 = 0.12F;
   private static final int f_8796 = -3418914;
   private static final float f_8797 = 96.0F;
   private static final float f_8798 = 16.0F;
   private static final float f_8799 = 16.0F;
   private static final float f_8800 = 4.0F;
   private static final float f_8801 = 8.0F;
   private static final long f_8802 = 240000L;
   private static final float f_8803 = 20.0F;
   private static final long f_8804 = -1L;
   private static final String f_8805 = "Тема";
   private static final int f_8806 = -16777216;
   private static final float f_8807 = 0.2126F;
   private static final float f_8808 = 0.7152F;
   private static final float f_8809 = 0.0722F;
   private static final float f_8810 = 0.08F;
   private static final float f_8811 = 0.32F;
   private static final float f_8812 = 0.32F;
   private static final float f_8813 = 0.32F;
   private static final String f_8814 = "WorldColor";
   private static final String f_8815 = "Ничего";
   private static final long f_8816 = 16L;
   private static final int f_8817 = Integer.MIN_VALUE;
   private static final int f_8818 = Integer.MIN_VALUE;
   private static final float f_8819 = 0.25F;
   private static final float f_8820 = 0.25F;
   private static final float f_8821 = 0.25F;
   private static final double f_8822 = 255.0;
   private static final String f_8823 = "SkySampler";
   private static final String f_8824 = "DepthSampler";
   private static final float f_8825 = 1000.0F;
   private static final float f_8826 = 0.999999F;
   private static final String f_8827 = "DepthSampler";
   private static final String f_8828 = "ShaderMist";
   private static final float f_8829 = 1000.0F;
   private static final int f_8830 = -16777216;
   private static final int f_8831 = -16777216;
   private static final float f_8832 = 0.5F;
   private static final int f_8833 = -16777216;
   private static final String f_8834 = "DepthSampler";
   private static final String f_8835 = "SkyShaderData";
   private static final String f_8836 = "Ambience shader sky layer";
   private static final long f_8837 = 80L;
   private static final long f_8838 = 240L;
   private static final long f_8839 = 160L;
   private static final long f_8840 = -1L;
   private static final long f_8841 = 240000L;
   private static final float f_8842 = 20.0F;
   private static final String f_8843 = "Источник";
   private static final String f_8844 = "Небула";
   private static final String f_8845 = "Космос";
   private static final String f_8846 = "Purple";
   private static final String f_8847 = "Аврора";
   private static final String f_8848 = "Плазма";
   private static final String f_8849 = "Млечный Путь";
   private static final int f_8850 = -16777216;
   private static final int f_8851 = -16777216;
   private static final float f_8852 = 0.5F;
   private static final int f_8853 = -16777216;
   private static final int f_8854 = -16777216;
   private static final long f_8855 = 1000000L;
   private static final float f_8856 = 1000.0F;
   private static final float f_8857 = 0.999999F;
   private static final float f_8858 = 0.5222222F;
   private static final String f_8859 = "DepthSampler";
   private static final String f_8860 = "ShaderFog";
   private static final String f_8861 = "Пурга";
   private static final float f_8862 = 4.0F;
   private static final float f_8863 = 3.5F;
   private static final float f_8864 = 0.7F;
   private static final float f_8865 = 2.2F;
   private static final float f_8866 = 0.23F;
   private static final float f_8867 = 1.7F;
   private static final float f_8868 = 3.0F;
   private static final float f_8869 = 0.11F;
   private static final float f_8870 = 14.0F;
   private static final float f_8871 = 12.0F;
   private static final float f_8872 = 0.55F;
   private static final float f_8873 = 1.25F;
   private static final double f_8874 = 4096.0;
   private static final double f_8875 = 4096.0;
   private static final double f_8876 = 4096.0;
   private static final double f_8877 = 4096.0;
   private static final String f_8878 = "DepthSampler";
   private static final String f_8879 = "Blizzard";
   private static final float f_8880 = 2.0E9F;
   private static final float f_8881 = 0.52F;
   private static final float f_8882 = 0.001F;
   private static final int f_8883 = -16777216;
   private static final float f_8884 = 0.28F;
   private static final float f_8885 = 0.72F;
   private static final float f_8886 = 0.34F;
   private static final float f_8887 = 3.8F;
   private static final float f_8888 = 4.6F;
   private static final float f_8889 = 0.105F;
   private static final float f_8890 = 0.034F;
   private static final float f_8891 = 0.27F;
   private static final long f_8892 = 48L;
   private static final String f_8893 = "DepthSampler";
   private static final String f_8894 = "LightningFlash";
   private static final float f_8895 = 1.0E-4F;
   private static final float f_8896 = 0.5F;
   private static final float f_8897 = 0.5F;
   private static final float f_8898 = 0.5F;
   private static final float f_8899 = 0.5F;
   private static final String f_8900 = "Ambience lightning glow";
   private static final float f_8901 = 0.001F;
   private static final String f_8902 = "InSampler";
   private static final String f_8903 = "BloomSampler";
   private static final String f_8904 = "LightningGlowComposite";
   private static final String f_8905 = "InSampler";
   private static final String f_8906 = "LightningGlowBlur";
   private static final float f_8907 = 12.0F;
   private static final float f_8908 = 10.0F;
   private static final float f_8909 = 12.0F;
   private static final float f_8910 = 10.0F;
   private static final int f_8911 = -16777216;
   private static final int f_8912 = -16777216;
   private static final String f_8913 = "Ambience lightning glow horizontal";
   private static final String f_8914 = "Ambience lightning glow vertical";
   private static final long f_8915 = 32L;
   private static final long f_8916 = 32L;
   private static final long f_8917 = 48L;
   private static final double f_8918 = 1.0E-8;
   private static final double f_8919 = 0.5;
   private static final double f_8920 = 1.0E-8;
   private static final double f_8921 = 1.0E-8;
   private static final double f_8922 = 2.0;
   private static final float f_8923 = 0.1F;
   private static final float f_8924 = 1.35F;
   private static final float f_8925 = 1.5F;
   private static final float f_8926 = -1.0F;
   private static final float f_8927 = -1.0F;
   private static final String f_8928 = "Lightning";
   private static final long f_8929 = 131072L;
   private static final long f_8930 = 144L;
   private static final double f_8931 = 343.0;
   private static final double f_8932 = 20.0;
   private static final double f_8933 = -1.7278759594743864;
   private static final double f_8934 = 1.7278759594743864;
   private static final double f_8935 = 52.0;
   private static final double f_8936 = 96.0;
   private static final double f_8937 = 6.0;
   private static final double f_8938 = 58.0;
   private static final double f_8939 = 92.0;
   private static final double f_8940 = 36.0;
   private static final double f_8941 = -8.0;
   private static final double f_8942 = 8.0;
   private static final double f_8943 = -8.0;
   private static final double f_8944 = 8.0;
   private static final double f_8945 = 0.5;
   private static final double f_8946 = 8.5;
   private static final double f_8947 = 8.5;
   private static final double f_8948 = 0.5;
   private static final float f_8949 = 0.68F;
   private static final double f_8950 = Math.PI * 2;
   private static final float f_8951 = 0.7F;
   private static final double f_8952 = 1.35;
   private static final double f_8953 = 0.34;
   private static final double f_8954 = -0.65;
   private static final double f_8955 = 0.65;
   private static final double f_8956 = 1.7;
   private static final double f_8957 = 3.5;
   private static final double f_8958 = -0.65;
   private static final double f_8959 = 0.65;
   private static final float f_8960 = 0.18F;
   private static final double f_8961 = 0.5;
   private static final double f_8962 = 2.0;
   private static final double f_8963 = 0.57;
   private static final double f_8964 = 0.57;
   private static final double f_8965 = 0.82;
   private static final double f_8966 = 1.18;
   private static final float f_8967 = 0.25F;
   private static final float f_8968 = 0.25F;
   private static final double f_8969 = 1.0E9;
   private static final float f_8970 = 0.045F;
   private static final float f_8971 = 0.045F;
   private static final float f_8972 = 0.095F;
   private static final float f_8973 = 0.165F;
   private static final float f_8974 = 0.095F;
   private static final float f_8975 = 0.07F;
   private static final float f_8976 = 0.58F;
   private static final float f_8977 = 0.52F;
   private static final float f_8978 = 0.165F;
   private static final float f_8979 = 0.355F;
   private static final float f_8980 = 0.58F;
   private static final float f_8981 = 3.0F;
   private static final String f_8982 = "Дождь";
   private static final String f_8983 = "Снег";
   private static final float f_8984 = 1.0E9F;
   private static final float f_8985 = 0.05F;
   private static final float f_8986 = 4.0F;
   private static final float f_8987 = 3.5F;
   private static final float f_8988 = 0.7F;
   private static final float f_8989 = 2.2F;
   private static final float f_8990 = 0.23F;
   private static final float f_8991 = 1.7F;
   private static final float f_8992 = 3.0F;
   private static final float f_8993 = 0.11F;
   private static final float f_8994 = 14.0F;
   private static final float f_8995 = -18.0F;
   private static final float f_8996 = -4.5F;
   private static final float f_8997 = 0.01F;
   private static final float f_8998 = 0.35F;
   private static final float f_8999 = 1.0E-4F;
   private static final float f_9000 = 18.0F;
   private static final float f_9001 = 4.5F;
   private static final float f_9002 = 1.8F;
   private static final float f_9003 = 0.001F;
   private static final float f_9004 = 1.1F;
   private static final float f_9005 = 20.0F;
   private static final float f_9006 = 48.0F;
   private static final float f_9007 = 64.0F;
   private static final float f_9008 = 0.5F;
   private static final double f_9009 = 32.0;
   private static final double f_9010 = 32.0;
   private static final double f_9011 = 4096.0;
   private static final double f_9012 = 4096.0;
   private static final float f_9013 = 0.85F;
   private static final float f_9014 = 2.6F;
   private static final float f_9015 = 1.25F;
   private static final double f_9016 = 4096.0;
   private static final float f_9017 = 0.12F;
   private static final float f_9018 = 0.88F;
   private static final float f_9019 = 8192.0F;
   private static final double f_9020 = 4096.0;
   private static final double f_9021 = 4096.0;
   private static final double f_9022 = 4096.0;
   private static final float f_9023 = 0.38F;
   private static final float f_9024 = 0.39999998F;
   private static final String f_9025 = "Дождь";
   private static final String f_9026 = "Weather";
   private static final String f_9027 = "Fog";
   private static final String f_9028 = "Дождь";
   private static final String f_9029 = "DepthSampler";
   private static final String f_9030 = "Weather";
   private static final String f_9031 = "Fog";
   private static final String f_9032 = "Sampler0";
   private static final long f_9033 = 400L;
   private static final String f_9034 = "Ambience weather ground layer";
   private static final String f_9035 = "Ничего";
   private static final String f_9036 = "Origin";
   private static final String f_9037 = "Источник";
   private static final String f_9038 = "Nebula";
   private static final String f_9039 = "Небула";
   private static final String f_9040 = "Origin";
   private static final String f_9041 = "Источник";
   private static final String f_9042 = "Nebula";
   private static final String f_9043 = "Небула";
   private static final String f_9044 = "Источник";
   private static final String f_9045 = "Небула";
   private static final String f_9046 = "Пульсар";
   private static final String f_9047 = "Галактика";
   private static final String f_9048 = "Аврора 2";
   private static final String f_9049 = "Сок";
   private static final float f_9050 = 1.0E-4F;
   private static final float f_9051 = 70.0F;
   private static final double f_9052 = 2.0;
   private static final float f_9053 = -1.0F;
   private static final float f_9054 = -1.0F;
   private static final float f_9055 = -1.0F;
   private static final float f_9056 = -1.0F;
   private static final String f_9057 = "Ambience shared fullscreen quad";
   private static final String f_9058 = "Ambience custom weather uniforms";
   private static final String f_9059 = "Ambience custom weather ground composite";
   private static final String f_9060 = "Ambience custom weather ground effects";
   private static final String f_9061 = "Ambience custom weather particles";
   private static final String f_9062 = "Ambience lightning";
   private static final String f_9063 = "Ambience lightning glow composite uniforms";
   private static final String f_9064 = "Ambience lightning vertical glow uniforms";
   private static final String f_9065 = "Ambience lightning horizontal glow uniforms";
   private static final String f_9066 = "Ambience lightning dual glow blur";
   private static final String f_9067 = "Ambience lightning glow composite";
   private static final String f_9068 = "Ambience lightning glow mask";
   private static final String f_9069 = "Ambience lightning flash";
   private static final String f_9070 = "Ambience lightning flash uniforms";
   private static final String f_9071 = "Ambience blizzard overlay";
   private static final String f_9072 = "Ambience blizzard overlay uniforms";
   private static final String f_9073 = "Ambience procedural sky";
   private static final String f_9074 = "Ambience juice sky uniforms";
   private static final String f_9075 = "Ambience procedural sky uniforms";
   private static final String f_9076 = "Ambience shader sky uniforms";
   private static final String f_9077 = "Ambience juice sky";
   private static final String f_9078 = "Ambience shader sky";
   private static final String f_9079 = "Ambience shader sky composite";
   private static final String f_9080 = "Ambience world color uniforms";
   private static final String f_9081 = "Ambience world color";
   private static final String f_9082 = "Снег";
   private static final String f_9083 = "Пурга";
   private static final String f_9084 = "Дождь";
   private static final String f_9085 = "Ничего";
   private static final String f_9086 = "Свой";
   private static final String f_9087 = "Переопределить";
   private static final String f_9088 = "Переопределить";
   private static final String f_9089 = "Переопределить";

   public boolean m_2984() {
      return this.m_776() && this.f_8484.m_7568(f_8777);
   }

   private void m_2985(JsonObject var1) {
      if (var1.has(this.f_8489.m_8764())) {
         com.google.gson.JsonElement el = var1.get(this.f_8489.m_8764());
         if (el != null && el.isJsonPrimitive()) {
            String var2 = el.getAsString();
            if (f_9036.equals(var2)) {
               var1.addProperty(this.f_8489.m_8764(), f_9037);
            } else if (f_9038.equals(var2)) {
               var1.addProperty(this.f_8489.m_8764(), f_9039);
            }
         }
      }

      String var4 = this.f_8489.m_8764() + "";
      if (var1.has(var4) && var1.get(var4).isJsonObject()) {
         JsonObject var3 = var1.getAsJsonObject(var4);
         m_3007(var3, f_9040, f_9041);
         m_3007(var3, f_9042, f_9043);
      }
   }

   private void m_2986() {
      if (this.f_8452 != null) {
         this.f_8452.destroyBuffers();
         this.f_8452 = null;
      }
   }

   private void m_2988() {
      if (this.f_8449 == null || this.f_8449.isClosed()) {
         this.f_8449 = RenderSystem.getDevice().createBuffer(() -> f_9076, 136, f_8837);
      }

      if (this.f_8448 == null || this.f_8448.isClosed()) {
         this.f_8448 = RenderSystem.getDevice().createBuffer(() -> f_9075, 136, f_8838);
      }

      if (this.f_8450 == null || this.f_8450.isClosed()) {
         this.f_8450 = RenderSystem.getDevice().createBuffer(() -> f_9074, 136, f_8839);
      }
   }

   private void m_2989(RenderTarget var1, GpuBuffer var2, GpuBufferSlice var3, CommandEncoder var4, int var5) {
      RenderPass var6 = var4.createRenderPass(() -> f_9061, var1.getColorTextureView(), Optional.empty(), var1.getDepthTextureView(), OptionalDouble.empty());

      try {
         boolean var7 = this.f_8504.m_7568(f_9025);
         var6.setPipeline(var7 ? this.f_8427 : this.f_8426);
         if (var7) {
            this.f_8412.m_2113(var6);
         }

         var6.setUniform(f_9026, var2);
         var6.setUniform(f_9027, var3);
         this.m_3009(var6, var5);
      } catch (Throwable var10) {
         if (var6 != null) {
            try {
               var6.close();
            } catch (Throwable var9) {
               var10.addSuppressed(var9);
            }
         }

         throw var10;
      }

      if (var6 != null) {
         var6.close();
      }
   }

   private boolean m_2992() {
      return this.f_8489.m_7568(f_9049);
   }

   private void m_2993(RenderTarget var1, CommandEncoder var2, Matrix4f var3, Matrix4f var4, DeltaTracker var5, int var6, int var7, float var8) {
      this.f_8467.set(var3).invert();
      this.f_8468.set(var4).invert();
      float var9 = ((float)(f_11537.level.getGameTime() % f_8841) + var5.getGameTimeDeltaPartialTick(false)) / f_8842;
      float var10 = (float)Math.toRadians(-f_11537.gameRenderer.mainCamera().yRot());
      float var11 = (float)Math.toRadians(f_11537.gameRenderer.mainCamera().xRot());
      float var12 = var8;
      boolean var13 = this.f_8489.m_7568(f_8843);
      boolean var14 = this.f_8489.m_7568(f_8844);
      int var15 = this.f_8489.m_7568(f_8845)
         ? 1
         : (
            this.f_8489.m_7568(f_8846)
               ? 2
               : (this.f_8489.m_7568(f_8847) ? 3 : (this.f_8489.m_7568(f_8848) ? 5 : (this.f_8489.m_7568(f_8849) ? 6 : (var13 ? 7 : (var14 ? 8 : 4)))))
         );
      int var16 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) | f_8850;
      int var17 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN_TWO) | f_8851;
      Vector4f var18 = Class_BftdentXEtGbugJw.m_2298(var16);
      Vector4f var19 = Class_BftdentXEtGbugJw.m_2298(var17);
      Vector4f var20 = Class_BftdentXEtGbugJw.m_2298(Class_BftdentXEtGbugJw.m_2312(var16, var17, f_8852));
      float var21 = this.m_3019() && this.f_8492.m_8768() ? 1.0F : 0.0F;
      if (var13 || var14) {
         Vector4f var22 = Class_BftdentXEtGbugJw.m_2298(var16 | f_8853);
         Vector4f var23 = Class_BftdentXEtGbugJw.m_2298(var17 | f_8854);
         var19 = var22;
         var20 = var22;
         var18 = var23;
      }

      float var34 = this.f_8505.m_5146(f_11537.level.getOverworldClockTime());
      float var35 = f_11537.level.getRainLevel(var5.getGameTimeDeltaPartialTick(false));
      float var24 = !var13 && !var14 ? (float)(System.currentTimeMillis() % f_8855) / f_8856 : var21;
      MemoryStack var25 = MemoryStack.stackPush();

      try {
         ByteBuffer var26 = Std140Builder.onStack(var25, 240)
            .putMat4f(this.f_8467)
            .putMat4f(this.f_8468)
            .putVec4(var10, var11, var12, var9)
            .putVec4(var6, var7, var15, this.f_8490.m_8768())
            .putVec4(var18.x, var18.y, var18.z, var18.w)
            .putVec4(this.f_8491.m_8768(), f_8857, 1.0F, var24)
            .putVec4(var19.x, var19.y, var19.z, var19.w)
            .putVec4(var20.x, var20.y, var20.z, var20.w)
            .putVec4(var21, var34, var35, f_8858)
            .get();
         var2.writeToBuffer(this.f_8448.slice(), var26);
         RenderPass var27 = var2.createRenderPass(() -> f_9073, this.f_8447.getColorTextureView(), Optional.empty());

         try {
            var27.setPipeline(this.f_8431);
            var27.bindTexture(f_8859, var1.getDepthTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
            var27.setUniform(f_8860, this.f_8448);
            var27.draw(3, 1, 0, 0);
         } catch (Throwable var32) {
            if (var27 != null) {
               try {
                  var27.close();
               } catch (Throwable var31) {
                  var32.addSuppressed(var31);
               }
            }

            throw var32;
         }

         if (var27 != null) {
            var27.close();
         }
      } catch (Throwable var33) {
         if (var25 != null) {
            try {
               var25.close();
            } catch (Throwable var30) {
               var33.addSuppressed(var30);
            }
         }

         throw var33;
      }

      if (var25 != null) {
         var25.close();
      }
   }

   private boolean m_2994() {
      return !this.f_8489.m_7568(f_9035);
   }

   private Vector4f m_2995(Vec3 var1, Vec3 var2, Matrix4f var3, Matrix4f var4) {
      Vec3 var5 = var1.subtract(var2);
      Vector4f var6 = new Vector4f((float)var5.x, (float)var5.y, (float)var5.z, 1.0F).mul(var4).mul(var3);
      if (var6.w <= f_8895) {
         return null;
      }

      var6.div(var6.w);
      return new Vector4f(var6.x * f_8896 + f_8897, var6.y * f_8898 + f_8899, 0.0F, 0.0F);
   }

   private int m_2996(int var1) {
      return this.m_3103(var1, Class_y3cvEHXTSEF5dp8q.MAIN);
   }

   private boolean m_2997() {
      return this.f_8504.m_7568(f_8784) && this.f_8484.m_7568(f_8785);
   }

   private void m_2998(RenderTarget var1, Matrix4f var2, Matrix4f var3, Vec3 var4, float var5, Vector4f var6) {
      if (this.f_8479 != null && this.f_8480 != null) {
         Vector4f var7 = this.m_2995(this.f_8479, var4, var2, var3);
         Vector4f var8 = this.m_2995(this.f_8480, var4, var2, var3);
         if (var7 != null && var8 != null) {
            MemoryStack var9 = MemoryStack.stackPush();

            try {
               ByteBuffer var10 = Std140Builder.onStack(var9, 48)
                  .putVec4(var7.x, var7.y, var8.x, var8.y)
                  .putVec4(var5, (float)var1.width / Math.max(1, var1.height), f_8891, 0.0F)
                  .putVec4(var6.x, var6.y, var6.z, 1.0F)
                  .get();
               if (this.f_8462 == null || this.f_8462.isClosed()) {
                  this.f_8462 = RenderSystem.getDevice().createBuffer(() -> f_9070, 136, f_8892);
               }

               CommandEncoder var11 = RenderSystem.getDevice().createCommandEncoder();
               var11.writeToBuffer(this.f_8462.slice(), var10);
               RenderPass var12 = var11.createRenderPass(() -> f_9069, var1.getColorTextureView(), Optional.empty());

               try {
                  var12.setPipeline(this.f_8439);
                  var12.bindTexture(f_8893, var1.getDepthTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
                  var12.setUniform(f_8894, this.f_8462);
                  var12.draw(3, 1, 0, 0);
               } catch (Throwable var17) {
                  if (var12 != null) {
                     try {
                        var12.close();
                     } catch (Throwable var16) {
                        var17.addSuppressed(var16);
                     }
                  }

                  throw var17;
               }

               if (var12 != null) {
                  var12.close();
               }
            } catch (Throwable var18) {
               if (var9 != null) {
                  try {
                     var9.close();
                  } catch (Throwable var15) {
                     var18.addSuppressed(var15);
                  }
               }

               throw var18;
            }

            if (var9 != null) {
               var9.close();
            }
         }
      }
   }

   private boolean m_2999() {
      return this.m_2994() && !this.m_3036() && !this.m_2992() && !this.m_3095();
   }

   private void m_3001() {
      this.f_8481 = -1;
      this.f_8482 = null;
      if (this.f_8483 != null) {
         this.f_8483.finish();
         f_11537.getSoundManager().stop(this.f_8483);
         this.f_8483 = null;
      }
   }

   private GpuBuffer m_3002(int var1) {
      GpuBuffer var2 = this.f_8465[var1];
      if (var2 != null && !var2.isClosed()) {
         return var2;
      }

      var2 = RenderSystem.getDevice().createBuffer(() -> var1 + "", 136, f_8930);
      this.f_8465[var1] = var2;
      return var2;
   }

   private void m_3003(RenderPass var1) {
      this.m_3009(var1, 1);
   }

   private GpuBuffer m_3006() {
      if (this.f_8451 == null || this.f_8451.isClosed()) {
         this.f_8451 = RenderSystem.getDevice().createBuffer(() -> f_9058, 136, f_9033);
      }

      return this.f_8451;
   }

   private static void m_3007(JsonObject var0, String var1, String var2) {
      if (var0.has(var1) && !var0.has(var2)) {
         var0.add(var2, var0.get(var1));
         var0.remove(var1);
      }
   }

   public long m_3008(long var1) {
      return this.m_776() && !this.f_8505.m_5142() ? this.f_8505.m_5144(var1) : var1;
   }

   private void m_3009(RenderPass var1, int var2) {
      GpuBuffer var3 = this.m_3104();
      AutoStorageIndexBuffer var4 = RenderSystem.getSequentialBuffer(PrimitiveTopology.QUADS);
      GpuBuffer var5 = var4.getBuffer(this.f_8454);
      var1.setVertexBuffer(0, var3.slice());
      var1.setIndexBuffer(var5, var4.type());
      var1.drawIndexed(this.f_8454, var2, 0, 0, 0);
   }

   private GpuBuffer m_3010(int var1, int var2) {
      GpuBuffer var3 = this.f_8463[var1];
      if (var3 != null && !var3.isClosed() && this.f_8464[var1] >= var2) {
         return var3;
      }

      if (var3 != null && !var3.isClosed()) {
         var3.close();
      }

      long var4 = f_8929;

      while (var4 < var2) {
         var4 <<= 1;
      }

      var3 = RenderSystem.getDevice().createBuffer(() -> var1 + "", 40, var4);
      this.f_8463[var1] = var3;
      this.f_8464[var1] = var4;
      return var3;
   }

   public boolean m_3012() {
      return this.m_776() && !this.f_8504.m_7568(f_8778);
   }

   private void m_3014() {
      if (this.f_8444 != null) {
         this.f_8444.close();
         this.f_8444 = null;
      }

      this.f_8445 = f_8818;
      this.f_8446 = Float.NaN;
   }

   private int m_3016(int var1) {
      int var2 = this.m_2996(var1);
      return this.m_3055() && this.f_8487.m_8768() ? Class_BftdentXEtGbugJw.m_2312(var1, var2, f_8780) : var2;
   }

   private boolean m_3019() {
      return this.f_8489.m_7568(f_9044) || this.f_8489.m_7568(f_9045);
   }

   public boolean m_3023() {
      return this.m_776() && this.f_8484.m_7568(f_8776);
   }

   private static float m_3024(float var0) {
      if (var0 < f_8970) {
         return m_3044(var0 / f_8971);
      } else if (var0 < f_8972) {
         return 1.0F;
      } else if (var0 < f_8973) {
         float var2 = m_3044((var0 - f_8974) / f_8975);
         return Mth.lerp(var2, 1.0F, f_8976);
      } else if (var0 < f_8977) {
         float var1 = m_3044((var0 - f_8978) / f_8979);
         return f_8980 * (1.0F - var1);
      } else {
         return 0.0F;
      }
   }

   public boolean m_3025() {
      return this.m_776() && this.f_8504.m_7568(f_8779);
   }

   public boolean m_3026() {
      return this.m_776() && (this.f_8525.m_8768() || this.m_2994());
   }

   private void m_3028() {
      if (this.f_8451 != null && !this.f_8451.isClosed()) {
         this.f_8451.close();
      }

      this.f_8451 = null;
   }

   private void m_3029(RenderTarget var1, Matrix4f var2, Matrix4f var3, Vec3 var4, float var5, Vector4f var6, int var7) {
      BufferBuilder var8 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX);
      Matrix4f var9 = new Matrix4f();

      for (Ambience.TzSMY0NlqKxPK3T3 var11 : this.f_8466) {
         Vec3 var12 = var11.start.subtract(var4);
         Vec3 var13 = var11.end.subtract(var4);
         Vec3 var14 = var13.subtract(var12);
         if (!(var14.lengthSqr() < f_8918)) {
            Vec3 var15 = var12.add(var13).scale(f_8919);
            Vec3 var16 = var15.lengthSqr() > f_8920 ? var15.normalize() : new Vec3(0.0, 0.0, 1.0);
            Vec3 var17 = var14.normalize().cross(var16);
            var17 = var17.lengthSqr() < f_8921 ? new Vec3(1.0, 0.0, 0.0) : var17.normalize();
            float var18 = (float)(f_8922 * Math.max(1.0, var15.length()) / Math.max(1.0, Math.abs(var2.m11()) * var1.height));
            float var19 = var5 <= f_8923 ? f_8924 : f_8925;
            float var20 = Math.max(var5 * var11.strength, var18 * var19);
            Vec3 var21 = var17.scale(var20);
            Vec3 var22 = var12.subtract(var21);
            Vec3 var23 = var12.add(var21);
            Vec3 var24 = var13.add(var21);
            Vec3 var25 = var13.subtract(var21);
            var8.addVertex(var9, (float)var22.x, (float)var22.y, (float)var22.z).setUv(f_8926, 0.0F);
            var8.addVertex(var9, (float)var23.x, (float)var23.y, (float)var23.z).setUv(1.0F, 0.0F);
            var8.addVertex(var9, (float)var24.x, (float)var24.y, (float)var24.z).setUv(1.0F, 1.0F);
            var8.addVertex(var9, (float)var25.x, (float)var25.y, (float)var25.z).setUv(f_8927, 1.0F);
         }
      }

      MeshData var32 = var8.buildOrThrow();

      try {
         MemoryStack var33 = MemoryStack.stackPush();

         try {
            DrawState var34 = var32.drawState();
            AutoStorageIndexBuffer var35 = RenderSystem.getSequentialBuffer(var34.primitiveTopology());
            GpuBuffer var36 = var35.getBuffer(var34.indexCount());
            ByteBuffer var37 = Std140Builder.onStack(var33, 144).putMat4f(var2).putMat4f(var3).putVec4(var6).get();
            ByteBuffer var38 = var32.vertexBuffer();
            int var40 = var38.remaining();
            GpuBuffer var41 = this.m_3010(var7, var40);
            GpuBuffer var42 = this.m_3002(var7);
            CommandEncoder var43 = RenderSystem.getDevice().createCommandEncoder();
            var43.writeToBuffer(var41.slice(0L, var40), var38);
            var43.writeToBuffer(var42.slice(), var37);
            RenderPass var44 = var43.createRenderPass(
               () -> f_9062, var1.getColorTextureView(), Optional.empty(), var1.getDepthTextureView(), OptionalDouble.empty()
            );

            try {
               var44.setPipeline(var7 == 2 ? this.f_8438 : this.f_8437);
               var44.setUniform(f_8928, var42);
               var44.setVertexBuffer(0, var41.slice());
               var44.setIndexBuffer(var36, var35.type());
               var44.drawIndexed(var34.indexCount(), 1, 0, 0, 0);
            } catch (Throwable var29) {
               if (var44 != null) {
                  try {
                     var44.close();
                  } catch (Throwable var28) {
                     var29.addSuppressed(var28);
                  }
               }

               throw var29;
            }

            if (var44 != null) {
               var44.close();
            }
         } catch (Throwable var30) {
            if (var33 != null) {
               try {
                  var33.close();
               } catch (Throwable var27) {
                  var30.addSuppressed(var27);
               }
            }

            throw var30;
         }

         if (var33 != null) {
            var33.close();
         }
      } catch (Throwable var31) {
         if (var32 != null) {
            try {
               var32.close();
            } catch (Throwable var26) {
               var31.addSuppressed(var26);
            }
         }

         throw var31;
      }

      if (var32 != null) {
         var32.close();
      }
   }

   private void m_3030() {
      if (this.f_8453 != null && !this.f_8453.isClosed()) {
         this.f_8453.close();
      }

      this.f_8453 = null;
      this.f_8454 = 0;
   }

   private void m_3031(Matrix4f var1, Matrix4f var2, GpuBufferSlice var3) {
      if (this.m_3048() && var1 != null && var2 != null && var3 != null) {
         RenderTarget var4 = f_11537.gameRenderer.mainRenderTarget();
         if (var4 != null && var4.getColorTexture() != null && var4.getDepthTexture() != null && !var4.getDepthTexture().isClosed()) {
            Camera var5 = f_11537.gameRenderer.mainCamera();
            Vec3 var6 = var5.position();
            Matrix4f var7 = this.f_8469.set(var1).invert();
            Matrix4f var8 = this.f_8470.set(var2).invert();
            int var9 = this.f_8504.m_7568(f_8982) ? 1 : (this.f_8504.m_7568(f_8983) ? 2 : 3);
            long var10 = System.nanoTime();
            float var12 = this.f_8472 == 0L ? 0.0F : Math.clamp((float)(var10 - this.f_8472) / f_8984, 0.0F, f_8985);
            this.f_8472 = var10;
            float var13 = !f_11537.isPaused() && !f_11537.level.tickRateManager().isFrozen() ? var12 : 0.0F;
            this.f_8471 += var13;
            float var14 = (float)this.f_8471;
            float var15 = this.f_8513.m_8768();
            float var16 = this.f_8514.m_8768();
            if (var9 == 3) {
               var15 = Math.max(var15, f_8986) + f_8987 + (float)Math.sin(var14 * f_8988) * f_8989 + (float)Math.sin(var14 * f_8990 + f_8991) * f_8992;
               var16 += (float)Math.sin(var14 * f_8993) * f_8994;
            }

            float var17 = (float)Math.toRadians(var16);
            float var18 = (float)Math.sin(var17) * var15;
            float var19 = (float)Math.cos(var17) * var15;
            float var20 = (var9 == 1 ? f_8995 : f_8996) * Math.max(this.f_8511.m_8768(), f_8997);
            float var21 = var9 == 1 ? f_8998 : 1.0F;
            float var22 = var18 * var21;
            float var23 = var19 * var21;
            float var24 = (float)Math.sqrt(var22 * var22 + var20 * var20 + var23 * var23);
            float var25 = 1.0F / Math.max(var24, f_8999);
            float var26 = var22 * var25;
            float var27 = var20 * var25;
            float var28 = var23 * var25;
            float var29 = (float)Math.sqrt(var18 * var18 + var19 * var19);
            Vector4f var30 = Class_BftdentXEtGbugJw.m_2298(this.m_3016(var9 == 1 ? this.f_8518.m_8768() : this.f_8519.m_8768()));
            float var31 = var9 == 1 ? f_9000 : (var9 == 3 ? f_9001 : f_9002);
            this.f_8473 = this.f_8473 + var31 * this.f_8511.m_8768() * var13;
            this.f_8474 += var22 * var13;
            this.f_8475 += var23 * var13;
            this.f_8476 = this.f_8476 + this.f_8511.m_8768() * var13;
            if (!(var30.w <= f_9003)) {
               float var32 = this.f_8510.m_8768();
               float var33 = Math.clamp(var32 * f_9004, f_9005, f_9006);
               float var34 = var32 * 2.0F / f_9007;
               float var35 = m_3064(var6.y + var33 * f_9008, var33);
               double var36 = Math.floor((var6.x - this.f_8474) / var34) - f_9009;
               double var38 = Math.floor((var6.z - this.f_8475) / var34) - f_9010;
               float var40 = (float)(var36 * var34 + this.f_8474 - var6.x);
               float var41 = (float)(var38 * var34 + this.f_8475 - var6.z);
               float var42 = m_3064(var36, f_9011);
               float var43 = m_3064(var38, f_9012);
               float var44 = var9 == 1 ? Math.max(f_9013, this.f_8517.m_8768() * f_9014) : f_9015;
               double var45 = var44 * f_9016;
               float var47 = m_3064(var6.x, var45);
               float var48 = m_3064(var6.z, var45);
               int var49 = Math.max(1, var4.width);
               int var50 = Math.max(1, var4.height);
               float var51 = f_9017 + f_9018 * Math.clamp(this.f_8509.m_8768(), 0.0F, 1.0F);
               int var52 = Math.clamp(Math.round(f_9019 * var51), 1, 8192);
               MemoryStack var53 = MemoryStack.stackPush();

               try {
                  ByteBuffer var54 = Std140Builder.onStack(var53, 400)
                     .putMat4f(var1)
                     .putMat4f(var2)
                     .putMat4f(var7)
                     .putMat4f(var8)
                     .putVec4(var47, (float)var6.y, var48, var14)
                     .putVec4(var49, var50, var9, this.f_8509.m_8768())
                     .putVec4(this.f_8511.m_8768(), this.f_8512.m_8768(), this.f_8510.m_8768(), this.m_3055() ? 1.0F : 0.0F)
                     .putVec4(var18, var19, this.f_8516.m_8768(), this.f_8517.m_8768())
                     .putVec4(var30)
                     .putVec4(m_3064(this.f_8473, var33), (float)(this.f_8474 % f_9020), (float)(this.f_8475 % f_9021), m_3064(this.f_8476, f_9022))
                     .putVec4(var40, var41, var42, var43)
                     .putVec4(var26, var27, var28, var29)
                     .putVec4(var33, var34, var35, (f_9023 + f_9024 * this.f_8509.m_8768()) * var30.w)
                     .get();
                  CommandEncoder var55 = RenderSystem.getDevice().createCommandEncoder();
                  if (var9 == 1) {
                     this.f_8412.m_2111(f_11537.level, var6, var55);
                  } else {
                     this.f_8412.close();
                  }

                  this.f_8451 = this.m_3006();
                  var55.writeToBuffer(this.f_8451.slice(), var54);
                  if (this.f_8515.m_8768()) {
                     this.m_3058(var4, this.f_8451, var3, var55);
                  }

                  this.m_2989(var4, this.f_8451, var3, var55, var52);
               } catch (Throwable var57) {
                  if (var53 != null) {
                     try {
                        var53.close();
                     } catch (Throwable var56) {
                        var57.addSuppressed(var56);
                     }
                  }

                  throw var57;
               }

               if (var53 != null) {
                  var53.close();
               }
            }
         } else {
            this.f_8472 = 0L;
         }
      } else {
         this.f_8472 = 0L;
         this.f_8412.close();
      }
   }

   private void m_3033(Class_hE5HYN1IW4q63o2z var1) {
      if (this.m_3074(var1.m_7143())) {
         if (this.m_3023()) {
            var1.m_7141(f_8786, f_8787);
         } else {
            float var2 = Math.max(f_8788, var1.m_7139());
            if (this.m_2984()) {
               var1.m_7141(f_8789, f_8790);
               var1.m_7142(this.f_8488.m_8768() | f_8791);
            } else {
               float var3 = Math.clamp(this.f_8509.m_8768(), f_8792, 1.0F);
               float var4 = var2 * Mth.lerp(var3, f_8793, f_8794);
               var1.m_7141(var4 * f_8795, var4);
               var1.m_7142(f_8796);
            }
         }
      }
   }

   private void m_3034(Matrix4f var1, Matrix4f var2) {
      if (this.m_3048() && this.f_8504.m_7568(f_8861) && var1 != null && var2 != null) {
         RenderTarget var3 = f_11537.gameRenderer.mainRenderTarget();
         if (var3 != null && var3.getColorTexture() != null && var3.getDepthTexture() != null && !var3.getDepthTexture().isClosed()) {
            Vec3 var4 = f_11537.gameRenderer.mainCamera().position();
            Matrix4f var5 = this.f_8469.set(var1).invert();
            Matrix4f var6 = this.f_8470.set(var2).invert();
            float var7 = (float)this.f_8471;
            float var8 = Math.max(this.f_8513.m_8768(), f_8862)
               + f_8863
               + (float)Math.sin(var7 * f_8864) * f_8865
               + (float)Math.sin(var7 * f_8866 + f_8867) * f_8868;
            float var9 = this.f_8514.m_8768() + (float)Math.sin(var7 * f_8869) * f_8870;
            float var10 = (float)Math.toRadians(var9);
            float var11 = (float)Math.sin(var10);
            float var12 = (float)Math.cos(var10);
            float var13 = Math.clamp(var8 / f_8871, f_8872, f_8873);
            Vector4f var14 = Class_BftdentXEtGbugJw.m_2298(this.m_3016(this.f_8519.m_8768()));
            MemoryStack var15 = MemoryStack.stackPush();

            try {
               ByteBuffer var16 = Std140Builder.onStack(var15, 208)
                  .putMat4f(var5)
                  .putMat4f(var6)
                  .putVec4(m_3064(var4.x, f_8874), (float)var4.y, m_3064(var4.z, f_8875), var7)
                  .putVec4(this.f_8509.m_8768(), var13, this.f_8510.m_8768(), 0.0F)
                  .putVec4((float)(this.f_8474 % f_8876), (float)(this.f_8475 % f_8877), var11, var12)
                  .putVec4(var14.x, var14.y, var14.z, 1.0F)
                  .get();
               GpuBuffer var17 = RenderSystem.getDevice().createBuffer(() -> f_9072, 128, var16);

               try {
                  RenderPass var18 = RenderSystem.getDevice()
                     .createCommandEncoder()
                     .createRenderPass(() -> f_9071, var3.getColorTextureView(), Optional.empty());

                  try {
                     var18.setPipeline(this.f_8430);
                     var18.bindTexture(f_8878, var3.getDepthTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
                     var18.setUniform(f_8879, var17);
                     var18.draw(3, 1, 0, 0);
                  } catch (Throwable var24) {
                     if (var18 != null) {
                        try {
                           var18.close();
                        } catch (Throwable var23) {
                           var24.addSuppressed(var23);
                        }
                     }

                     throw var24;
                  }

                  if (var18 != null) {
                     var18.close();
                  }
               } catch (Throwable var25) {
                  if (var17 != null) {
                     try {
                        var17.close();
                     } catch (Throwable var22) {
                        var25.addSuppressed(var22);
                     }
                  }

                  throw var25;
               }

               if (var17 != null) {
                  var17.close();
               }
            } catch (Throwable var26) {
               if (var15 != null) {
                  try {
                     var15.close();
                  } catch (Throwable var21) {
                     var26.addSuppressed(var21);
                  }
               }

               throw var26;
            }

            if (var15 != null) {
               var15.close();
            }
         }
      }
   }

   public void m_3035(Matrix4f var1, Matrix4f var2, DeltaTracker var3) {
      if (this.m_3055() && var1 != null && var2 != null && var3 != null) {
         RenderTarget var4 = f_11537.gameRenderer.mainRenderTarget();
         if (var4 != null && var4.getColorTexture() != null && var4.getDepthTexture() != null && !var4.getDepthTexture().isClosed()) {
            if (this.f_8455 < 0L) {
               this.f_8455 = System.currentTimeMillis();
            }

            int var5 = Math.max(1, (var4.width + 1 - 1) / 1);
            int var6 = Math.max(1, (var4.height + 1 - 1) / 1);
            this.m_3093(var5, var6);
            this.m_2988();
            CommandEncoder var7 = RenderSystem.getDevice().createCommandEncoder();
            var7.clearColorTexture(this.f_8447.getColorTexture(), new Vector4f(0.0F));
            float var8 = m_3071(var1);
            if (this.m_3037()) {
               this.m_3062(var4, var7, var5, var6, var8, this.f_8432);
            } else if (this.m_3053()) {
               this.m_3062(var4, var7, var5, var6, var8, this.f_8433);
            } else if (this.m_3095()) {
               int var9 = this.f_8487.m_8768() ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : this.f_8501.m_8768();
               int var10 = this.f_8487.m_8768()
                  ? Class_BftdentXEtGbugJw.m_2303(
                     Math.round(Class_BftdentXEtGbugJw.m_2309(var9) * f_8819),
                     Math.round(Class_BftdentXEtGbugJw.m_2299(var9) * f_8820),
                     Math.round(Class_BftdentXEtGbugJw.m_2308(var9) * f_8821),
                     f_8822
                  )
                  : this.f_8502.m_8768();
               this.f_8410
                  .m_8355(
                     this.f_8447,
                     var1,
                     var2,
                     this.f_8455,
                     this.f_8497.m_8768(),
                     this.f_8498.m_8768(),
                     this.f_8499.m_8768(),
                     this.f_8500.m_8768(),
                     var9,
                     var10,
                     this.f_8503.m_8768()
                  );
            } else if (this.m_2992()) {
               this.m_3089(var4, var7, var5, var6, var8);
            } else {
               this.m_2993(var4, var7, var1, var2, var3, var5, var6, var8);
            }

            RenderPass var14 = var7.createRenderPass(() -> f_9079, var4.getColorTextureView(), Optional.empty());

            try {
               var14.setPipeline(this.f_8435);
               var14.bindTexture(f_8823, this.f_8447.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
               var14.bindTexture(f_8824, var4.getDepthTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
               var14.draw(3, 1, 0, 0);
            } catch (Throwable var13) {
               if (var14 != null) {
                  try {
                     var14.close();
                  } catch (Throwable var12) {
                     var13.addSuppressed(var12);
                  }
               }

               throw var13;
            }

            if (var14 != null) {
               var14.close();
            }
         }
      } else {
         this.m_3111();
      }
   }

   private boolean m_3036() {
      return this.m_3037() || this.m_3053();
   }

   private boolean m_3037() {
      return this.f_8489.m_7568(f_9046);
   }

   private TextureTarget m_3038(int var1, int var2) {
      if (this.f_8452 == null || this.f_8452.width != var1 || this.f_8452.height != var2) {
         this.m_2986();
         this.f_8452 = new TextureTarget(f_9034, var1, var2, false, GpuFormat.RGBA8_UNORM);
      }

      return this.f_8452;
   }

   private void m_3040() {
      if (this.f_8444 == null || this.f_8444.isClosed()) {
         this.f_8444 = RenderSystem.getDevice().createBuffer(() -> f_9080, 136, f_8816);
         this.f_8445 = f_8817;
         this.f_8446 = Float.NaN;
      }
   }

   private static float m_3044(float var0) {
      var0 = Math.clamp(var0, 0.0F, 1.0F);
      return var0 * var0 * (f_8981 - 2.0F * var0);
   }

   private void m_3045(Vec3 var1) {
      if (this.f_8523.m_8768() && !(this.f_8524.m_8768() <= 0.0F) && !f_11537.isPaused() && !Rain.m_6679() && this.f_8480 != null) {
         if (this.f_8481 < 0 && (this.f_8483 == null || !f_11537.getSoundManager().isActive(this.f_8483))) {
            this.f_8482 = this.f_8480;
            this.f_8481 = Math.clamp((int)Math.ceil(var1.distanceTo(this.f_8480) / f_8931 * f_8932), 2, 12);
         }
      }
   }

   public float m_3047() {
      return this.f_8485.m_8768();
   }

   private boolean m_3048() {
      return this.m_776()
         && this.m_3049()
         && f_11537.player != null
         && f_11537.level != null
         && f_11537.gameRenderer != null
         && f_11537.gameRenderer.mainCamera() != null
         && f_11537.gameRenderer.mainCamera().getFluidInCamera() == FogType.NONE;
   }

   private boolean m_3049() {
      return this.f_8504.m_7568(f_8781) || this.f_8504.m_7568(f_8782) || this.f_8504.m_7568(f_8783);
   }

   public boolean m_3052() {
      return this.m_776() && this.m_2994() && (!this.m_3095() || !this.f_8503.m_8768());
   }

   private boolean m_3053() {
      return this.f_8489.m_7568(f_9047);
   }

   private boolean m_3055() {
      return HpHelper.m_7672()
         ? false
         : this.m_776()
            && this.m_2994()
            && (!this.m_2999() && !this.m_2992() || this.f_8490.m_8768() > 0.0F)
            && f_11537.player != null
            && f_11537.level != null
            && f_11537.gameRenderer != null
            && m_3059(f_11537.gameRenderer.mainCamera());
   }

   private void m_3056(Matrix4f var1, Matrix4f var2, DeltaTracker var3) {
      if (this.m_2984() && f_11537.level != null && f_11537.player != null && this.m_3074(f_11537.gameRenderer.mainCamera()) && !Rain.m_6679()) {
         float var4 = Math.min(f_8797, Math.max(f_8798, f_11537.options.getEffectiveRenderDistance() * f_8799));
         float var5 = this.m_3079() * f_8800;
         float var6 = Math.max(var5 + f_8801, this.m_3047() * var4);
         float var7 = ((float)(f_11537.level.getGameTime() % f_8802) + var3.getGameTimeDeltaPartialTick(false)) / f_8803;
         this.f_8411
            .m_7289(f_11537.gameRenderer.mainRenderTarget(), var1, var2, f_11537.gameRenderer.mainCamera().position(), var7, this.f_8488.m_8768(), var5, var6);
      } else {
         this.f_8411.close();
      }
   }

   private void m_3057() {
      if (this.f_8459 == null || this.f_8459.isClosed()) {
         this.f_8459 = RenderSystem.getDevice().createBuffer(() -> f_9065, 136, f_8915);
      }

      if (this.f_8460 == null || this.f_8460.isClosed()) {
         this.f_8460 = RenderSystem.getDevice().createBuffer(() -> f_9064, 136, f_8916);
      }

      if (this.f_8461 == null || this.f_8461.isClosed()) {
         this.f_8461 = RenderSystem.getDevice().createBuffer(() -> f_9063, 136, f_8917);
      }
   }

   private void m_3058(RenderTarget var1, GpuBuffer var2, GpuBufferSlice var3, CommandEncoder var4) {
      TextureTarget var5 = this.m_3038(Math.max(1, (var1.width + 2 - 1) / 2), Math.max(1, (var1.height + 2 - 1) / 2));
      RenderPass var6 = var4.createRenderPass(() -> f_9060, var5.getColorTextureView(), Optional.of(new Vector4f(0.0F)));

      try {
         boolean var7 = this.f_8504.m_7568(f_9028);
         var6.setPipeline(var7 ? this.f_8428 : this.f_8429);
         if (var7) {
            this.f_8412.m_2113(var6);
         }

         var6.bindTexture(f_9029, var1.getDepthTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
         var6.setUniform(f_9030, var2);
         var6.setUniform(f_9031, var3);
         this.m_3009(var6, 1);
      } catch (Throwable var12) {
         if (var6 != null) {
            try {
               var6.close();
            } catch (Throwable var10) {
               var12.addSuppressed(var10);
            }
         }

         throw var12;
      }

      if (var6 != null) {
         var6.close();
      }

      var6 = var4.createRenderPass(() -> f_9059, var1.getColorTextureView(), Optional.empty());

      try {
         var6.setPipeline(this.f_8440);
         var6.bindTexture(f_9032, var5.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
         this.m_3003(var6);
      } catch (Throwable var11) {
         if (var6 != null) {
            try {
               var6.close();
            } catch (Throwable var9) {
               var11.addSuppressed(var9);
            }
         }

         throw var11;
      }

      if (var6 != null) {
         var6.close();
      }
   }

   @Override
   public void m_732() {
      super.m_732();
      this.m_3001();
      this.f_8471 = 0.0;
      this.f_8472 = 0L;
      this.f_8473 = 0.0;
      this.f_8474 = 0.0;
      this.f_8475 = 0.0;
      this.f_8476 = 0.0;
      this.f_8466.clear();
      this.f_8477 = 0L;
      this.f_8478 = 0L;
      this.f_8479 = null;
      this.f_8480 = null;
      if (this.f_8456 != null) {
         this.f_8456.destroyBuffers();
         this.f_8456 = null;
      }

      this.m_3088();
      this.m_3108();
      this.m_3111();
      this.m_3014();
      this.f_8411.close();
      this.f_8412.close();
      this.m_3028();
      this.m_2986();
      this.m_3030();
   }

   @Override
   public void m_791(JsonObject var1) {
      String var2 = null;
      if (var1 != null && var1.has(f_8768)) {
         JsonObject var3 = var1.getAsJsonObject(f_8769);
         this.m_2985(var3);
         if (!var3.has(this.f_8489.m_8764())) {
            if (var3.has(f_8770) && var3.get(f_8771).getAsBoolean()) {
               var2 = f_8772;
            } else if (var3.has(f_8773)) {
               String var4 = var3.get(f_8774).getAsString();
               if (!var4.equals(f_8775)) {
                  var2 = var4;
               }
            }
         }
      }

      super.m_791(var1);
      if (var2 != null) {
         this.m_3061(var2);
      }
   }

   private static boolean m_3059(Camera var0) {
      if (var0 == null) {
         return false;
      }

      FogType var1 = var0.getFluidInCamera();
      return var1 == FogType.NONE || var1 == FogType.WATER;
   }

   private void m_3061(String var1) {
      for (Class_2ZaVm8TGDJ68TnJB var3 : this.f_8489.m_8768()) {
         if (var3.m_1181().equals(var1)) {
            this.f_8489.m_1767(var3);
            return;
         }
      }
   }

   private void m_3062(RenderTarget var1, CommandEncoder var2, int var3, int var4, float var5, RenderPipeline var6) {
      float var7 = (float)(System.currentTimeMillis() - this.f_8455) / f_8825;
      Vector4f var8 = Class_BftdentXEtGbugJw.m_2298(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN));
      float var9 = (float)Math.toRadians(-f_11537.gameRenderer.mainCamera().yRot());
      float var10 = (float)Math.toRadians(f_11537.gameRenderer.mainCamera().xRot());
      float var11 = var5;
      MemoryStack var12 = MemoryStack.stackPush();

      try {
         ByteBuffer var13 = Std140Builder.onStack(var12, 80)
            .putVec4(var3, var4, var7, var11)
            .putVec4(var8.x, var8.y, var8.z, this.f_8496.m_8768())
            .putVec4(this.f_8493.m_8768(), this.f_8494.m_8768(), this.f_8495.m_8768(), 0.0F)
            .putVec4(var9, var10, 0.0F, 0.0F)
            .putVec4(0.0F, f_8826, 1.0F, 0.0F)
            .get();
         var2.writeToBuffer(this.f_8449.slice(), var13);
         RenderPass var14 = var2.createRenderPass(() -> f_9078, this.f_8447.getColorTextureView(), Optional.empty());

         try {
            var14.setPipeline(var6);
            var14.bindTexture(f_8827, var1.getDepthTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
            var14.setUniform(f_8828, this.f_8449);
            var14.draw(3, 1, 0, 0);
         } catch (Throwable var19) {
            if (var14 != null) {
               try {
                  var14.close();
               } catch (Throwable var18) {
                  var19.addSuppressed(var18);
               }
            }

            throw var19;
         }

         if (var14 != null) {
            var14.close();
         }
      } catch (Throwable var20) {
         if (var12 != null) {
            try {
               var12.close();
            } catch (Throwable var17) {
               var20.addSuppressed(var17);
            }
         }

         throw var20;
      }

      if (var12 != null) {
         var12.close();
      }
   }

   private static float m_3064(double var0, double var2) {
      return (float)(var0 - Math.floor(var0 / var2) * var2);
   }

   private static void m_3066(double[] var0, int var1, int var2, double var3, Random var5) {
      if (var2 - var1 > 1) {
         int var6 = var1 + var2 >>> 1;
         var0[var6] = (var0[var1] + var0[var2]) * f_8961 + (var5.nextDouble() * f_8962 - 1.0) * var3;
         m_3066(var0, var1, var6, var3 * f_8963, var5);
         m_3066(var0, var6, var2, var3 * f_8964, var5);
      }
   }

   private TextureTarget m_3067(int var1, int var2) {
      var1 = Math.max(1, var1);
      var2 = Math.max(1, var2);
      if (this.f_8456 == null) {
         this.f_8456 = new TextureTarget(f_8900, var1, var2, true, GpuFormat.RGBA8_UNORM);
      } else if (this.f_8456.width != var1 || this.f_8456.height != var2) {
         this.f_8456.resize(var1, var2);
      }

      return this.f_8456;
   }

   private static float m_3071(Matrix4f var0) {
      float var1 = Math.abs(var0.m11());
      return var1 < f_9050 ? f_9051 : (float)Math.toDegrees(f_9052 * Math.atan(1.0 / var1));
   }

   public boolean m_3074(Camera var1) {
      return this.m_776() && !this.m_3102() && m_3059(var1) && (this.m_3023() || this.m_2984() || var1.getFluidInCamera() == FogType.NONE && this.m_2997());
   }

   public void m_3075(Matrix4f var1, Matrix4f var2) {
      this.m_3087(var1, var2);
   }

   private void m_3076(long var1) {
      double var3 = ThreadLocalRandom.current().nextDouble(f_8965, f_8966);
      float var5 = Math.max(f_8967, 2.0F / Math.max(f_8968, this.f_8521.m_8768()));
      this.f_8478 = var1 + (long)(var5 * var3 * f_8969);
   }

   private void m_3077(RenderTarget var1, RenderTarget var2, int var3, int var4, float var5, float var6) {
      if (var1 != null && var2 != null && var1.getColorTextureView() != null && var2.getColorTextureView() != null && !(Math.max(var5, var6) <= f_8901)) {
         int var7 = Math.max(1, var1.width / 2);
         int var8 = Math.max(1, var1.height / 2);
         this.m_3080(var7, var8);
         this.m_3057();
         CommandEncoder var9 = RenderSystem.getDevice().createCommandEncoder();
         this.m_3091(var9, var7, var8, var3, var4, var5, var6);
         RenderPass var10 = var9.createRenderPass(() -> f_9068, this.f_8457.getColorTextureView(), Optional.empty());

         try {
            var10.setPipeline(this.f_8441);
            var10.bindTexture(f_8902, var1.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
            var10.draw(3, 1, 0, 0);
         } catch (Throwable var16) {
            if (var10 != null) {
               try {
                  var10.close();
               } catch (Throwable var14) {
                  var16.addSuppressed(var14);
               }
            }

            throw var16;
         }

         if (var10 != null) {
            var10.close();
         }

         this.m_3094(var9, this.f_8457, this.f_8458, this.f_8459);
         this.m_3094(var9, this.f_8458, this.f_8457, this.f_8460);
         var10 = var9.createRenderPass(() -> f_9067, var2.getColorTextureView(), Optional.empty());

         try {
            var10.setPipeline(this.f_8443);
            var10.bindTexture(f_8903, this.f_8457.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
            var10.setUniform(f_8904, this.f_8461);
            var10.draw(3, 1, 0, 0);
         } catch (Throwable var15) {
            if (var10 != null) {
               try {
                  var10.close();
               } catch (Throwable var13) {
                  var15.addSuppressed(var13);
               }
            }

            throw var15;
         }

         if (var10 != null) {
            var10.close();
         }
      }
   }

   private void m_3078() {
      if (!this.m_3083()) {
         this.m_3014();
      } else {
         RenderTarget var1 = f_11537.gameRenderer.mainRenderTarget();
         if (var1 != null && var1.getColorTexture() != null && var1.getColorTextureView() != null) {
            this.m_3040();
            CommandEncoder var2 = RenderSystem.getDevice().createCommandEncoder();
            int var3 = this.f_8506.m_7568(f_8805) ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : this.f_8507.m_8768();
            float var4 = this.f_8508.m_8768();
            if (var3 != this.f_8445 || Float.compare(var4, this.f_8446) != 0) {
               Vector4f var5 = Class_BftdentXEtGbugJw.m_2298(var3 | f_8806);
               float var6 = Math.max(var5.x * f_8807 + var5.y * f_8808 + var5.z * f_8809, f_8810);
               float var7 = Mth.lerp(f_8811, 1.0F, var5.x / var6);
               float var8 = Mth.lerp(f_8812, 1.0F, var5.y / var6);
               float var9 = Mth.lerp(f_8813, 1.0F, var5.z / var6);
               MemoryStack var10 = MemoryStack.stackPush();

               try {
                  ByteBuffer var11 = Std140Builder.onStack(var10, 16)
                     .putVec4(Mth.lerp(var4, 1.0F, var7), Mth.lerp(var4, 1.0F, var8), Mth.lerp(var4, 1.0F, var9), 1.0F)
                     .get();
                  var2.writeToBuffer(this.f_8444.slice(), var11);
               } catch (Throwable var16) {
                  if (var10 != null) {
                     try {
                        var10.close();
                     } catch (Throwable var14) {
                        var16.addSuppressed(var14);
                     }
                  }

                  throw var16;
               }

               if (var10 != null) {
                  var10.close();
               }

               this.f_8445 = var3;
               this.f_8446 = var4;
            }

            RenderPass var17 = var2.createRenderPass(() -> f_9081, var1.getColorTextureView(), Optional.empty());

            try {
               var17.setPipeline(this.f_8436);
               var17.setUniform(f_8814, this.f_8444);
               var17.draw(3, 1, 0, 0);
            } catch (Throwable var15) {
               if (var17 != null) {
                  try {
                     var17.close();
                  } catch (Throwable var13) {
                     var15.addSuppressed(var13);
                  }
               }

               throw var15;
            }

            if (var17 != null) {
               var17.close();
            }
         }
      }
   }

   public float m_3079() {
      return this.f_8486.m_8768();
   }

   private void m_3080(int var1, int var2) {
      if (this.f_8457 == null || this.f_8458 == null) {
         this.f_8457 = new TextureTarget(f_8913, var1, var2, false, GpuFormat.RGBA8_UNORM);
         this.f_8458 = new TextureTarget(f_8914, var1, var2, false, GpuFormat.RGBA8_UNORM);
      } else if (this.f_8457.width != var1 || this.f_8457.height != var2) {
         this.f_8457.resize(var1, var2);
         this.f_8458.resize(var1, var2);
      }
   }

   public Ambience() {
      super(f_8528, f_8529, Category.RENDER);
      this.f_8426 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_8530)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_8531))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_8532))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.LIGHTNING)
         .m_2739(DefaultVertexFormat.POSITION, PrimitiveTopology.QUADS)
         .m_2729(f_8533, UniformType.UNIFORM_BUFFER)
         .m_2729(f_8534, UniformType.UNIFORM_BUFFER)
         .m_2722();
      this.f_8427 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_8535)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_8536))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_8537))
         .m_2736(f_8538)
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(DefaultVertexFormat.POSITION, PrimitiveTopology.QUADS)
         .m_2729(f_8539, UniformType.UNIFORM_BUFFER)
         .m_2729(f_8540, UniformType.UNIFORM_BUFFER)
         .m_2729(f_8541, UniformType.UNIFORM_BUFFER)
         .m_2741(f_8542)
         .m_2722();
      this.f_8428 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_8543)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_8544))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_8545))
         .m_2736(f_8546)
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2727()
         .m_2739(DefaultVertexFormat.POSITION, PrimitiveTopology.QUADS)
         .m_2729(f_8547, UniformType.UNIFORM_BUFFER)
         .m_2729(f_8548, UniformType.UNIFORM_BUFFER)
         .m_2729(f_8549, UniformType.UNIFORM_BUFFER)
         .m_2741(f_8550)
         .m_2741(f_8551)
         .m_2722();
      this.f_8429 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_8552)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_8553))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_8554))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2727()
         .m_2739(DefaultVertexFormat.POSITION, PrimitiveTopology.QUADS)
         .m_2729(f_8555, UniformType.UNIFORM_BUFFER)
         .m_2729(f_8556, UniformType.UNIFORM_BUFFER)
         .m_2741(f_8557)
         .m_2722();
      this.f_8430 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_8558)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_8559))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_8560))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_8561, UniformType.UNIFORM_BUFFER)
         .m_2741(f_8562)
         .m_2722();
      this.f_8431 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_8563)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_8564))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_8565))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2727()
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_8566, UniformType.UNIFORM_BUFFER)
         .m_2741(f_8567)
         .m_2722();
      this.f_8432 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_8568)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_8569))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_8570))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2727()
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_8571, UniformType.UNIFORM_BUFFER)
         .m_2741(f_8572)
         .m_2722();
      this.f_8433 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_8573)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_8574))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_8575))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2727()
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_8576, UniformType.UNIFORM_BUFFER)
         .m_2741(f_8577)
         .m_2722();
      this.f_8434 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_8578)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_8579))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_8580))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2727()
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_8581, UniformType.UNIFORM_BUFFER)
         .m_2741(f_8582)
         .m_2722();
      this.f_8435 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_8583)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_8584))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_8585))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2741(f_8586)
         .m_2741(f_8587)
         .m_2722();
      this.f_8436 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_8588)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_8589))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_8590))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(f_8413)
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_8591, UniformType.UNIFORM_BUFFER)
         .m_2722();
      this.f_8437 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_8592)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_8593))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_8594))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.LIGHTNING)
         .m_2739(DefaultVertexFormat.POSITION_TEX, PrimitiveTopology.QUADS)
         .m_2729(f_8595, UniformType.UNIFORM_BUFFER)
         .m_2722();
      this.f_8438 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_8596)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_8597))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_8598))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(DefaultVertexFormat.POSITION_TEX, PrimitiveTopology.QUADS)
         .m_2729(f_8599, UniformType.UNIFORM_BUFFER)
         .m_2722();
      this.f_8439 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_8600)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_8601))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_8602))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.LIGHTNING)
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_8603, UniformType.UNIFORM_BUFFER)
         .m_2741(f_8604)
         .m_2722();
      this.f_8440 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_8605)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_8606))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_8607))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(DefaultVertexFormat.POSITION, PrimitiveTopology.QUADS)
         .m_2741(f_8608)
         .m_2722();
      this.f_8441 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_8609)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_8610))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_8611))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2727()
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2741(f_8612)
         .m_2722();
      this.f_8442 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_8613)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_8614))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_8615))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2727()
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_8616, UniformType.UNIFORM_BUFFER)
         .m_2741(f_8617)
         .m_2722();
      this.f_8443 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_8618)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_8619))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_8620))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.LIGHTNING)
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_8621, UniformType.UNIFORM_BUFFER)
         .m_2741(f_8622)
         .m_2722();
      this.f_8445 = f_8623;
      this.f_8446 = Float.NaN;
      this.f_8455 = f_8624;
      this.f_8463 = new GpuBuffer[3];
      this.f_8464 = new long[3];
      this.f_8465 = new GpuBuffer[3];
      this.f_8466 = new ArrayList<>();
      this.f_8467 = new Matrix4f();
      this.f_8468 = new Matrix4f();
      this.f_8469 = new Matrix4f();
      this.f_8470 = new Matrix4f();
      this.f_8481 = -1;
      this.f_8484 = new MultiChoiceSetting(f_8625, new Class_2ZaVm8TGDJ68TnJB(f_8626), new Class_2ZaVm8TGDJ68TnJB(f_8627), new Class_2ZaVm8TGDJ68TnJB(f_8628));
      this.f_8485 = new SliderSetting(f_8629, 1.0F, f_8630, f_8631).m_828(f_8632).m_822(() -> this.f_8484.m_7568(f_9089));
      this.f_8486 = new SliderSetting(f_8633, f_8634, f_8635, f_8636).m_828(f_8637).m_822(() -> this.f_8484.m_7568(f_9088)).m_826(this.f_8485);
      this.f_8487 = new CheckboxSetting(f_8638, true);
      this.f_8488 = new ColorSetting(f_8639, false, -1).m_822(() -> this.f_8484.m_7568(f_9087));
      this.f_8489 = new MultiChoiceSetting(
         f_8640,
         new Class_2ZaVm8TGDJ68TnJB(f_8641),
         new Class_2ZaVm8TGDJ68TnJB(f_8642),
         new Class_2ZaVm8TGDJ68TnJB(f_8643),
         new Class_2ZaVm8TGDJ68TnJB(f_8644),
         new Class_2ZaVm8TGDJ68TnJB(f_8645),
         new Class_2ZaVm8TGDJ68TnJB(f_8646),
         new Class_2ZaVm8TGDJ68TnJB(f_8647),
         new Class_2ZaVm8TGDJ68TnJB(f_8648),
         new Class_2ZaVm8TGDJ68TnJB(f_8649),
         new Class_2ZaVm8TGDJ68TnJB(f_8650),
         new Class_2ZaVm8TGDJ68TnJB(f_8651),
         new Class_2ZaVm8TGDJ68TnJB(f_8652),
         new Class_2ZaVm8TGDJ68TnJB(f_8653)
      );
      this.f_8490 = new SliderSetting(f_8654, 1.0F, 0.0F, f_8655).m_828(f_8656).m_822(() -> this.m_2999() || this.m_2992());
      this.f_8491 = new SliderSetting(f_8657, f_8658, 0.0F, f_8659).m_828(f_8660).m_822(this::m_2999);
      this.f_8492 = new CheckboxSetting(f_8661, false).m_822(this::m_3019);
      this.f_8493 = new SliderSetting(f_8662, 1.0F, f_8663, f_8664).m_828(f_8665).m_822(() -> this.m_3036() || this.m_2992());
      this.f_8494 = new SliderSetting(f_8666, f_8667, 1.0F, f_8668).m_828(f_8669).m_822(this::m_3037);
      this.f_8495 = new SliderSetting(f_8670, f_8671, f_8672, f_8673).m_828(f_8674).m_822(this::m_3037);
      this.f_8496 = new SliderSetting(f_8675, 1.0F, f_8676, 1.0F).m_828(f_8677).m_822(() -> this.m_3036() || this.m_2992());
      this.f_8497 = new SliderSetting(f_8678, 1.0F, f_8679, 1.0F).m_828(f_8680).m_822(this::m_3095);
      this.f_8498 = new SliderSetting(f_8681, 1.0F, f_8682, f_8683).m_828(f_8684).m_822(this::m_3095);
      this.f_8499 = new SliderSetting(f_8685, f_8686, f_8687, f_8688).m_828(f_8689).m_822(this::m_3095);
      this.f_8500 = new SliderSetting(f_8690, f_8691, 0.0F, 1.0F).m_828(f_8692).m_822(this::m_3095);
      this.f_8501 = new ColorSetting(f_8693, false, f_8694).m_822(() -> this.m_3095() && !this.f_8487.m_8768());
      this.f_8502 = new ColorSetting(f_8695, false, f_8696).m_822(() -> this.m_3095() && !this.f_8487.m_8768());
      this.f_8503 = new CheckboxSetting(f_8697, false).m_822(this::m_3095);
      this.f_8504 = new MultiChoiceSetting(
         f_8698,
         new Class_2ZaVm8TGDJ68TnJB(f_8699),
         new Class_2ZaVm8TGDJ68TnJB(f_8700),
         new Class_2ZaVm8TGDJ68TnJB(f_8701),
         new Class_2ZaVm8TGDJ68TnJB(f_8702),
         new Class_2ZaVm8TGDJ68TnJB(f_8703)
      );
      this.f_8505 = new Class_TwRQEhCOrGjBfPHM(
         f_8704,
         new Class_2ZaVm8TGDJ68TnJB(f_8705),
         new Class_2ZaVm8TGDJ68TnJB(f_8706),
         new Class_2ZaVm8TGDJ68TnJB(f_8707),
         new Class_2ZaVm8TGDJ68TnJB(f_8708),
         new Class_2ZaVm8TGDJ68TnJB(f_8709),
         new Class_2ZaVm8TGDJ68TnJB(f_8710)
      );
      this.f_8506 = new MultiChoiceSetting(f_8711, new Class_2ZaVm8TGDJ68TnJB(f_8712), new Class_2ZaVm8TGDJ68TnJB(f_8713), new Class_2ZaVm8TGDJ68TnJB(f_8714));
      this.f_8507 = new ColorSetting(f_8715, false, -1).m_822(() -> this.f_8506.m_7568(f_9086));
      this.f_8508 = new SliderSetting(f_8716, f_8717, 0.0F, f_8718).m_828(f_8719).m_822(() -> !this.f_8506.m_7568(f_9085));
      this.f_8509 = new SliderSetting(f_8720, f_8721, f_8722, 1.0F).m_828(f_8723).m_822(this::m_3049);
      this.f_8510 = new SliderSetting(f_8724, f_8725, f_8726, f_8727).m_828(1.0F).m_822(this::m_3049);
      this.f_8511 = new SliderSetting(f_8728, 1.0F, f_8729, 2.0F).m_828(f_8730).m_822(this::m_3049);
      this.f_8512 = new SliderSetting(f_8731, 1.0F, f_8732, 2.0F).m_828(f_8733).m_822(this::m_3049);
      this.f_8513 = new SliderSetting(f_8734, f_8735, 0.0F, f_8736).m_828(f_8737).m_822(this::m_3049);
      this.f_8514 = new SliderSetting(f_8738, 0.0F, f_8739, f_8740).m_828(f_8741).m_822(this::m_3049);
      this.f_8515 = new CheckboxSetting(f_8742, true).m_822(this::m_3049);
      this.f_8516 = new SliderSetting(f_8743, f_8744, f_8745, f_8746).m_828(f_8747).m_822(() -> this.m_3049() && this.f_8515.m_8768());
      this.f_8517 = new SliderSetting(f_8748, f_8749, f_8750, f_8751).m_828(f_8752).m_822(() -> this.m_3049() && this.f_8515.m_8768());
      this.f_8518 = new ColorSetting(f_8753, false, f_8754).m_822(() -> this.f_8504.m_7568(f_9084) && !this.f_8487.m_8768());
      this.f_8519 = new ColorSetting(f_8755, false, -1).m_822(() -> (this.f_8504.m_7568(f_9082) || this.f_8504.m_7568(f_9083)) && !this.f_8487.m_8768());
      this.f_8520 = new CheckboxSetting(f_8756, true);
      this.f_8521 = new SliderSetting(f_8757, 1.0F, f_8758, f_8759).m_828(f_8760).m_822(this.f_8520::m_8768);
      this.f_8522 = new SliderSetting(f_8761, 1.0F, 1.0F, f_8762).m_828(1.0F).m_822(this.f_8520::m_8768);
      this.f_8523 = new CheckboxSetting(f_8763, false).m_822(this.f_8520::m_8768);
      this.f_8524 = new SliderSetting(f_8764, f_8765, 0.0F, 1.0F).m_828(f_8766).m_822(() -> this.f_8520.m_8768() && this.f_8523.m_8768());
      this.f_8525 = new CheckboxSetting(f_8767, false);
      this.f_8526 = this::m_3033;
      this.f_8527 = var1 -> this.m_3105();
      this.m_795(
         this.f_8484,
         this.f_8486,
         this.f_8485,
         this.f_8487,
         this.f_8488,
         this.f_8489,
         this.f_8490,
         this.f_8491,
         this.f_8492,
         this.f_8493,
         this.f_8494,
         this.f_8495,
         this.f_8496,
         this.f_8497,
         this.f_8498,
         this.f_8499,
         this.f_8500,
         this.f_8501,
         this.f_8502,
         this.f_8503,
         this.f_8505,
         this.f_8506,
         this.f_8507,
         this.f_8508,
         this.f_8504,
         this.f_8509,
         this.f_8510,
         this.f_8511,
         this.f_8512,
         this.f_8513,
         this.f_8514,
         this.f_8515,
         this.f_8516,
         this.f_8517,
         this.f_8518,
         this.f_8519,
         this.f_8520,
         this.f_8521,
         this.f_8522,
         this.f_8523,
         this.f_8524,
         this.f_8525
      );
   }

   public void m_3081() {
      this.f_8410.close();
      if (this.m_3095()) {
         this.f_8455 = f_8804;
      }

      this.m_3001();
      this.f_8411.close();
      this.f_8412.close();
      this.f_8472 = 0L;
   }

   private boolean m_3083() {
      return this.m_776() && !this.f_8506.m_7568(f_8815) && this.f_8508.m_8768() > 0.0F && f_11537.level != null;
   }

   private void m_3086(Vec3 var1) {
      ThreadLocalRandom var2 = ThreadLocalRandom.current();
      double var3 = Math.toRadians(-f_11537.gameRenderer.mainCamera().yRot());
      double var5 = var3 + var2.nextDouble(f_8933, f_8934);
      double var7 = var2.nextDouble(f_8935, f_8936);
      double var9 = var1.x + Math.sin(var5) * var7;
      double var11 = var1.z + Math.cos(var5) * var7;
      int var13 = f_11537.level.getHeight(Types.WORLD_SURFACE, Mth.floor(var9), Mth.floor(var11));
      if (var13 <= f_11537.level.getMinY() + 2) {
         var13 = Mth.floor(var1.y - f_8937);
      }

      double var14 = Math.max(var13 + var2.nextDouble(f_8938, f_8939), var1.y + f_8940);
      double var16 = var9 + var2.nextDouble(f_8941, f_8942);
      double var18 = var11 + var2.nextDouble(f_8943, f_8944);
      this.f_8479 = new Vec3(var16, var14, var18);
      this.f_8480 = new Vec3(var9, var13 + f_8945, var11);
      byte var20 = 25;
      double[] var21 = new double[var20];
      double[] var22 = new double[var20];
      Random var23 = new Random(var2.nextLong());
      m_3066(var21, 0, var20 - 1, f_8946, var23);
      m_3066(var22, 0, var20 - 1, f_8947, var23);
      ArrayList var24 = new ArrayList(var20);

      for (int var25 = 0; var25 < var20; var25++) {
         double var26 = (double)var25 / (var20 - 1);
         double var28 = Mth.lerp(var26, var16, var9) + var21[var25];
         double var30 = Mth.lerp(var26, var14, var13 + f_8948);
         double var32 = Mth.lerp(var26, var18, var11) + var22[var25];
         var24.add(new Vec3(var28, var30, var32));
         if (var25 > 0) {
            this.f_8466.add(new Ambience.TzSMY0NlqKxPK3T3((Vec3)var24.get(var25 - 1), (Vec3)var24.get(var25), 1.0F));
         }
      }

      for (int var35 = 3; var35 < var20 - 3; var35 += var2.nextInt(3, 6)) {
         if (!(var2.nextFloat() > f_8949)) {
            Vec3 var36 = (Vec3)var24.get(var35);
            double var27 = var2.nextDouble(0.0, f_8950);
            int var29 = var2.nextInt(3, 7);

            for (int var37 = 0; var37 < var29; var37++) {
               float var31 = f_8951 * (1.0F - (float)var37 / var29);
               double var38 = f_8952 + var37 * f_8953;
               Vec3 var34 = var36.add(
                  Math.sin(var27) * var38 + var2.nextDouble(f_8954, f_8955),
                  -var2.nextDouble(f_8956, f_8957),
                  Math.cos(var27) * var38 + var2.nextDouble(f_8958, f_8959)
               );
               this.f_8466.add(new Ambience.TzSMY0NlqKxPK3T3(var36, var34, Math.max(f_8960, var31)));
               var36 = var34;
            }
         }
      }
   }

   private void m_3087(Matrix4f var1, Matrix4f var2) {
      if (this.m_3090() && var1 != null && var2 != null) {
         long var3 = System.nanoTime();
         if (this.f_8478 == 0L) {
            this.m_3076(var3);
         }

         if (this.f_8477 == 0L && var3 >= this.f_8478) {
            this.m_3106(f_11537.gameRenderer.mainCamera().position(), var3);
         }

         if (this.f_8477 != 0L && !this.f_8466.isEmpty()) {
            float var5 = (float)(var3 - this.f_8477) / f_8880;
            if (var5 >= f_8881) {
               this.f_8466.clear();
               this.f_8477 = 0L;
               this.f_8479 = null;
               this.f_8480 = null;
               this.m_3076(var3);
            } else {
               float var6 = m_3024(var5);
               if (!(var6 <= f_8882)) {
                  RenderTarget var7 = f_11537.gameRenderer.mainRenderTarget();
                  if (var7 != null && var7.getColorTexture() != null && var7.getDepthTexture() != null && !var7.getDepthTexture().isClosed()) {
                     Vec3 var8 = f_11537.gameRenderer.mainCamera().position();
                     int var9 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) | f_8883;
                     int var10 = Class_BftdentXEtGbugJw.m_2312(var9, Class_BftdentXEtGbugJw.m_2310(255, 255, 255), f_8884);
                     int var11 = Class_BftdentXEtGbugJw.m_2312(var9, Class_BftdentXEtGbugJw.m_2310(255, 255, 255), f_8885);
                     Vector4f var12 = Class_BftdentXEtGbugJw.m_2298(var9);
                     Vector4f var13 = Class_BftdentXEtGbugJw.m_2298(var10);
                     Vector4f var14 = Class_BftdentXEtGbugJw.m_2298(var11);
                     this.m_2998(var7, var1, var2, var8, var6, var12);
                     TextureTarget var15 = this.m_3067(var7.width, var7.height);
                     CommandEncoder var16 = RenderSystem.getDevice().createCommandEncoder();
                     float var17 = m_3044(var6);
                     var16.clearColorTexture(var15.getColorTexture(), new Vector4f(0.0F));
                     var15.copyDepthFrom(var7);
                     this.m_3029(var15, var1, var2, var8, f_8886, new Vector4f(var12.x, var12.y, var12.z, 1.0F), 0);
                     this.m_3077(var15, var7, var9, var10, f_8887 * var17, f_8888 * var17);
                     this.m_3029(var7, var1, var2, var8, f_8889, new Vector4f(var13.x, var13.y, var13.z, var6), 1);
                     this.m_3029(var7, var1, var2, var8, f_8890, new Vector4f(var14.x, var14.y, var14.z, var6), 2);
                  }
               }
            }
         }
      } else {
         this.f_8466.clear();
         this.f_8477 = 0L;
         this.f_8478 = 0L;
         this.f_8479 = null;
         this.f_8480 = null;
      }
   }

   private void m_3088() {
      if (this.f_8457 != null) {
         this.f_8457.destroyBuffers();
      }

      if (this.f_8458 != null) {
         this.f_8458.destroyBuffers();
      }

      this.f_8457 = null;
      this.f_8458 = null;
      if (this.f_8459 != null && !this.f_8459.isClosed()) {
         this.f_8459.close();
      }

      if (this.f_8460 != null && !this.f_8460.isClosed()) {
         this.f_8460.close();
      }

      if (this.f_8461 != null && !this.f_8461.isClosed()) {
         this.f_8461.close();
      }

      this.f_8459 = null;
      this.f_8460 = null;
      this.f_8461 = null;
   }

   private void m_3089(RenderTarget var1, CommandEncoder var2, int var3, int var4, float var5) {
      float var6 = (float)(System.currentTimeMillis() - this.f_8455) / f_8829;
      Quaternionf var7 = f_11537.gameRenderer.mainCamera().rotation();
      int var8 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) | f_8830;
      int var9 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN_TWO) | f_8831;
      Vector4f var10 = Class_BftdentXEtGbugJw.m_2298(var8);
      Vector4f var11 = Class_BftdentXEtGbugJw.m_2298(var9);
      Vector4f var12 = Class_BftdentXEtGbugJw.m_2298(Class_BftdentXEtGbugJw.m_2312(var8, -8054, f_8832));
      Vector4f var13 = Class_BftdentXEtGbugJw.m_2298(this.m_2996(this.f_8488.m_8768()) | f_8833);
      MemoryStack var14 = MemoryStack.stackPush();

      try {
         ByteBuffer var15 = Std140Builder.onStack(var14, 160)
            .putVec4(var3, var4, var6, this.f_8493.m_8768())
            .putVec4(this.f_8490.m_8768(), this.f_8496.m_8768(), var5, 0.0F)
            .putVec4(var7.x, var7.y, var7.z, var7.w)
            .putVec4(var10.x, var10.y, var10.z, var10.w)
            .putVec4(var11.x, var11.y, var11.z, var11.w)
            .putVec4(var10.x, var10.y, var10.z, var10.w)
            .putVec4(var11.x, var11.y, var11.z, var11.w)
            .putVec4(var12.x, var12.y, var12.z, var12.w)
            .putVec4(var13.x, var13.y, var13.z, var13.w)
            .putVec4(this.f_8486.m_8768(), this.f_8485.m_8768(), 0.0F, 0.0F)
            .get();
         var2.writeToBuffer(this.f_8450.slice(), var15);
         RenderPass var16 = var2.createRenderPass(() -> f_9077, this.f_8447.getColorTextureView(), Optional.empty());

         try {
            var16.setPipeline(this.f_8434);
            var16.bindTexture(f_8834, var1.getDepthTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
            var16.setUniform(f_8835, this.f_8450);
            var16.draw(3, 1, 0, 0);
         } catch (Throwable var21) {
            if (var16 != null) {
               try {
                  var16.close();
               } catch (Throwable var20) {
                  var21.addSuppressed(var20);
               }
            }

            throw var21;
         }

         if (var16 != null) {
            var16.close();
         }
      } catch (Throwable var22) {
         if (var14 != null) {
            try {
               var14.close();
            } catch (Throwable var19) {
               var22.addSuppressed(var19);
            }
         }

         throw var22;
      }

      if (var14 != null) {
         var14.close();
      }
   }

   private boolean m_3090() {
      return this.m_776()
         && this.f_8520.m_8768()
         && f_11537.player != null
         && f_11537.level != null
         && f_11537.gameRenderer != null
         && f_11537.gameRenderer.mainCamera() != null
         && f_11537.gameRenderer.mainCamera().getFluidInCamera() == FogType.NONE;
   }

   private void m_3091(CommandEncoder var1, int var2, int var3, int var4, int var5, float var6, float var7) {
      MemoryStack var8 = MemoryStack.stackPush();

      try {
         ByteBuffer var9 = Std140Builder.onStack(var8, 32).putVec2(1.0F / var2, 1.0F / var3).putVec2(1.0F, 0.0F).putVec2(f_8907, f_8908).align(16).get();
         var1.writeToBuffer(this.f_8459.slice(), var9);
         ByteBuffer var10 = Std140Builder.onStack(var8, 32).putVec2(1.0F / var2, 1.0F / var3).putVec2(0.0F, 1.0F).putVec2(f_8909, f_8910).align(16).get();
         var1.writeToBuffer(this.f_8460.slice(), var10);
         Vector4f var11 = Class_BftdentXEtGbugJw.m_2298(var4 | f_8911);
         Vector4f var12 = Class_BftdentXEtGbugJw.m_2298(var5 | f_8912);
         ByteBuffer var13 = Std140Builder.onStack(var8, 48)
            .putVec4(var6, var7, 0.0F, 0.0F)
            .putVec4(var11.x, var11.y, var11.z, 1.0F)
            .putVec4(var12.x, var12.y, var12.z, 1.0F)
            .get();
         var1.writeToBuffer(this.f_8461.slice(), var13);
      } catch (Throwable var15) {
         if (var8 != null) {
            try {
               var8.close();
            } catch (Throwable var14) {
               var15.addSuppressed(var14);
            }
         }

         throw var15;
      }

      if (var8 != null) {
         var8.close();
      }
   }

   private void m_3093(int var1, int var2) {
      if (this.f_8447 == null) {
         this.f_8447 = new TextureTarget(f_8836, var1, var2, false, GpuFormat.RGBA8_UNORM);
      } else if (this.f_8447.width != var1 || this.f_8447.height != var2) {
         this.f_8447.resize(var1, var2);
      }
   }

   private void m_3094(CommandEncoder var1, RenderTarget var2, RenderTarget var3, GpuBuffer var4) {
      RenderPass var5 = var1.createRenderPass(() -> f_9066, var3.getColorTextureView(), Optional.empty());

      try {
         var5.setPipeline(this.f_8442);
         var5.bindTexture(f_8905, var2.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
         var5.setUniform(f_8906, var4);
         var5.draw(3, 1, 0, 0);
      } catch (Throwable var9) {
         if (var5 != null) {
            try {
               var5.close();
            } catch (Throwable var8) {
               var9.addSuppressed(var8);
            }
         }

         throw var9;
      }

      if (var5 != null) {
         var5.close();
      }
   }

   private boolean m_3095() {
      return this.f_8489.m_7568(f_9048);
   }

   public void m_3099(Matrix4f var1, Matrix4f var2, DeltaTracker var3) {
      this.m_3034(var1, var2);
      this.m_3078();
      this.m_3056(var1, var2, var3);
   }

   private boolean m_3102() {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
         FogAtmosphere var1 = DimasikClient.m_9057().m_9049().m_2801().m_3464();
         return var1 != null && var1.m_776();
      } else {
         return false;
      }
   }

   private int m_3103(int var1, Class_y3cvEHXTSEF5dp8q var2) {
      return this.f_8487.m_8768() ? Class_LsNSRvPKh5AwfAUe.m_3820(var2) : var1;
   }

   private GpuBuffer m_3104() {
      if (this.f_8453 == null || this.f_8453.isClosed()) {
         Matrix4f var1 = new Matrix4f();
         BufferBuilder var2 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION);
         var2.addVertex(var1, f_9053, f_9054, 0.0F);
         var2.addVertex(var1, 1.0F, f_9055, 0.0F);
         var2.addVertex(var1, 1.0F, 1.0F, 0.0F);
         var2.addVertex(var1, f_9056, 1.0F, 0.0F);
         MeshData var3 = var2.buildOrThrow();

         try {
            this.f_8454 = var3.drawState().indexCount();
            this.f_8453 = RenderSystem.getDevice().createBuffer(() -> f_9057, 32, var3.vertexBuffer());
         } catch (Throwable var7) {
            if (var3 != null) {
               try {
                  var3.close();
               } catch (Throwable var6) {
                  var7.addSuppressed(var6);
               }
            }

            throw var7;
         }

         if (var3 != null) {
            var3.close();
         }
      }

      return this.f_8453;
   }

   private void m_3105() {
      if (!this.m_3090() || !this.f_8523.m_8768() || this.f_8524.m_8768() <= 0.0F) {
         this.m_3001();
      } else if (!f_11537.isPaused() && this.f_8481 >= 0) {
         if (this.f_8481-- <= 0) {
            this.f_8483 = new Ambience.xjEHgoF49w8Sc100(this.f_8482);
            this.f_8482 = null;
            f_11537.getSoundManager().play(this.f_8483);
         }
      }
   }

   private void m_3106(Vec3 var1, long var2) {
      this.f_8466.clear();
      int var4 = Math.max(1, Math.round(this.f_8522.m_8768()));

      for (int var5 = 0; var5 < var4; var5++) {
         this.m_3086(var1);
      }

      this.f_8477 = var2;
      this.m_3045(var1);
   }

   private void m_3108() {
      for (int var1 = 0; var1 < this.f_8463.length; var1++) {
         GpuBuffer var2 = this.f_8463[var1];
         if (var2 != null && !var2.isClosed()) {
            var2.close();
         }

         this.f_8463[var1] = null;
         this.f_8464[var1] = 0L;
         GpuBuffer var3 = this.f_8465[var1];
         if (var3 != null && !var3.isClosed()) {
            var3.close();
         }

         this.f_8465[var1] = null;
      }

      if (this.f_8462 != null && !this.f_8462.isClosed()) {
         this.f_8462.close();
      }

      this.f_8462 = null;
   }

   public void m_3109(Matrix4f var1, Matrix4f var2, GpuBufferSlice var3) {
      this.m_3031(var1, var2, var3);
   }

   private void m_3111() {
      this.f_8410.close();
      this.f_8455 = f_8840;
      if (this.f_8447 != null) {
         this.f_8447.destroyBuffers();
         this.f_8447 = null;
      }

      if (this.f_8449 != null) {
         this.f_8449.close();
         this.f_8449 = null;
      }

      if (this.f_8448 != null) {
         this.f_8448.close();
         this.f_8448 = null;
      }

      if (this.f_8450 != null) {
         this.f_8450.close();
         this.f_8450 = null;
      }
   }

   private record TzSMY0NlqKxPK3T3(Vec3 start, Vec3 end, float strength) {
   }

   private final class xjEHgoF49w8Sc100 extends AbstractTickableSoundInstance {
      public final ClientLevel f_8406 = Class_NzJrN63M7QBpmAbi.f_11537.level;
      public static final float f_8408 = 0.85F;
      public static final float f_8409 = 0.2F;

      public xjEHgoF49w8Sc100(Vec3 var2) {
         super(SoundEvents.LIGHTNING_BOLT_THUNDER, SoundSource.MASTER, RandomSource.create());
         this.x = var2.x;
         this.y = var2.y;
         this.z = var2.z;
         this.volume = Ambience.this.f_8524.m_8768();
         this.pitch = f_8408 + this.random.nextFloat() * f_8409;
         this.attenuation = Attenuation.NONE;
      }

      public void tick() {
         if (Class_NzJrN63M7QBpmAbi.f_11537.level == this.f_8406 && Ambience.this.m_3090() && Ambience.this.f_8523.m_8768()) {
            this.volume = Ambience.this.f_8524.m_8768();
         } else {
            this.stop();
         }
      }

      public void finish() {
         this.stop();
      }
   }
}
