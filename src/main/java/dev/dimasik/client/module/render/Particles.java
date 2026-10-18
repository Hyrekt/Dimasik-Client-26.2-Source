package dev.dimasik.client.module.render;

import com.mojang.blaze3d.IndexType;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.AutoStorageIndexBuffer;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.MeshData;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.MeshData.DrawState;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.module.combat.Aura;
import dev.dimasik.client.module.misc.Optimization;
import dev.dimasik.client.setting.impl.BooleanSetting;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ColorSetting;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_HtEPOqGrAYrUdumw;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_NzJrN63M7QBpmAbi;
import dev.dimasik.client.system.Class_PoKta0VE7AdhY1En;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_ZaxOIoJW5RKgQbqm;
import dev.dimasik.client.system.Class_binHXWny7kagd8ju;
import dev.dimasik.client.system.Class_ftHu9o3WzCU3Adxm;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_wjdoxQGtI8mFyL6U;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.game.ClientboundEntityEventPacket;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.FireworkRocketEntity;
import net.minecraft.world.entity.projectile.ThrowableProjectile;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector4f;

public class Particles extends Module {
   private final Map<Identifier, List<Particles.aGUbKDRTs5PvAI8k>> f_3363 = new LinkedHashMap<>();
   private final List<Identifier> f_3364 = new ArrayList<>();
   private final List<Particles.aGUbKDRTs5PvAI8k> f_3365 = new ArrayList<>();
   private final Matrix4f f_3366 = new Matrix4f();
   private final Quaternionf f_3367 = new Quaternionf();
   private final Quaternionf f_3368 = new Quaternionf();
   private final Quaternionf f_3369 = new Quaternionf();
   private float f_3370 = Float.NaN;
   private float f_3371 = Float.NaN;
   private static final int f_3372 = 3600;
   private static final int f_3373 = 260;
   private static final long f_3374 = 2500L;
   private static final long f_3375 = 4000L;
   private static final float f_3376 = 2.2F;
   private static final float f_3377 = 0.45F;
   private static final float f_3378 = 0.55F;
   private static final float f_3379 = 1.0F;
   private static final float f_3380 = 0.36F;
   private static final int[] f_3381 = new int[]{
      Particles.f_3777,
      Particles.f_3778,
      -256,
      Particles.f_3779,
      Particles.f_3780,
      Particles.f_3781,
      Particles.f_3782,
      Particles.f_3783,
      Particles.f_3784,
      -1,
      Particles.f_3785,
      Particles.f_3786
   };
   private static final int[] f_3382 = new int[]{
      Particles.f_3787, Particles.f_3788, Particles.f_3789, Particles.f_3790, Particles.f_3791, Particles.f_3792, Particles.f_3793, Particles.f_3794
   };
   private final Class_2ZaVm8TGDJ68TnJB[] f_3383;
   private final Class_2ZaVm8TGDJ68TnJB f_3384;
   private final Map<String, Class_2ZaVm8TGDJ68TnJB> f_3385;
   private final MultiChoiceSetting f_3386;
   private final MultiChoiceSetting f_3387;
   private final BooleanSetting f_3388;
   private final ItemListSetting f_3389;
   private final SliderSetting f_3390;
   private final SliderSetting f_3391;
   private final SliderSetting f_3392;
   private final SliderSetting f_3393;
   private final SliderSetting f_3394;
   private final SliderSetting f_3395;
   private final CheckboxSetting f_3396;
   private final CheckboxSetting f_3397;
   private final CheckboxSetting f_3398;
   private final ColorSetting f_3399;
   private final ItemListSetting f_3400;
   private final MultiChoiceSetting f_3401;
   private final SliderSetting f_3402;
   private final SliderSetting f_3403;
   private final ItemListSetting f_3404;
   private final CheckboxSetting f_3405;
   private final CheckboxSetting f_3406;
   private final MultiChoiceSetting f_3407;
   private final List<Particles.aGUbKDRTs5PvAI8k> f_3408;
   private final Identifier[] f_3409;
   private final List<Particles.pQ7Ybsc06keXySFK> f_3410;
   private final List<Particles.bo8EXFtwSv4O39pW> f_3411;
   private final Map<Integer, Long> f_3412;
   private final RenderPipeline f_3413;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_3414;
   private final Class_gEPk7yDw6CwIte87<Class_wjdoxQGtI8mFyL6U> f_3415;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_3416;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_3417;
   private float f_3418;
   private int f_3419;
   private static final String f_3420 = "Particles";
   private static final String f_3421 = "Частицы от ударов, тотемов и движения";
   private static final String f_3422 = "Корона";
   private static final String f_3423 = "Взрыв куба";
   private static final String f_3424 = "Доллар";
   private static final String f_3425 = "Сердце";
   private static final String f_3426 = "Молния";
   private static final String f_3427 = "Линия";
   private static final String f_3428 = "Ромб";
   private static final String f_3429 = "Снежинка";
   private static final String f_3430 = "Звезда";
   private static final String f_3431 = "Звезда 2";
   private static final String f_3432 = "Треугольник";
   private static final String f_3433 = "Рандом";
   private static final String f_3434 = "Режим";
   private static final String f_3435 = "1";
   private static final String f_3436 = "2";
   private static final String f_3437 = "Форма";
   private static final String f_3438 = "Загрузить свои";
   private static final String f_3439 = "Триггеры";
   private static final String f_3440 = "Удар";
   private static final String f_3441 = "Тотем";
   private static final String f_3442 = "Ходьба";
   private static final String f_3443 = "Летящие предметы";
   private static final String f_3444 = "Количество";
   private static final float f_3445 = 40.0F;
   private static final float f_3446 = 10.0F;
   private static final float f_3447 = 40.0F;
   private static final String f_3448 = "Количество при ходьбе";
   private static final float f_3449 = 30.0F;
   private static final float f_3450 = 10.0F;
   private static final float f_3451 = 30.0F;
   private static final String f_3452 = "Разброс";
   private static final float f_3453 = 0.5F;
   private static final float f_3454 = 3.0F;
   private static final float f_3455 = 0.1F;
   private static final String f_3456 = "Скорость";
   private static final float f_3457 = 0.1F;
   private static final float f_3458 = 3.0F;
   private static final float f_3459 = 0.1F;
   private static final String f_3460 = "Время жизни";
   private static final float f_3461 = 2.5F;
   private static final float f_3462 = 0.5F;
   private static final float f_3463 = 10.0F;
   private static final float f_3464 = 0.1F;
   private static final String f_3465 = "Размер";
   private static final float f_3466 = 0.1F;
   private static final float f_3467 = 0.05F;
   private static final String f_3468 = "Оригинальный цвет";
   private static final String f_3469 = "Случайный цвет";
   private static final String f_3470 = "Авто цвет под тему";
   private static final String f_3471 = "Цвет";
   private static final int f_3472 = -10962689;
   private static final String f_3473 = "Спавнить при";
   private static final String f_3474 = "Ударе";
   private static final String f_3475 = "Поп тотема";
   private static final String f_3476 = "Бездействие";
   private static final String f_3477 = "Ходьбе";
   private static final String f_3478 = "Эндер жемчуг";
   private static final String f_3479 = "Стрела";
   private static final String f_3480 = "Цвет частиц";
   private static final String f_3481 = "От темы";
   private static final String f_3482 = "Радужные";
   private static final String f_3483 = "Спавнить при ударе";
   private static final float f_3484 = 15.0F;
   private static final float f_3485 = 5.0F;
   private static final float f_3486 = 50.0F;
   private static final String f_3487 = "Спавнить в мире";
   private static final float f_3488 = 20.0F;
   private static final float f_3489 = 3.0F;
   private static final float f_3490 = 50.0F;
   private static final String f_3491 = "Элементы";
   private static final String f_3492 = "Орбиз";
   private static final String f_3493 = "Звезды";
   private static final String f_3494 = "Сердечки";
   private static final String f_3495 = "Доллары";
   private static final String f_3496 = "Снежинки";
   private static final String f_3497 = "Короны";
   private static final String f_3498 = "Молнии";
   private static final String f_3499 = "Линии";
   private static final String f_3500 = "Кругляши";
   private static final String f_3501 = "Ромбы";
   private static final String f_3502 = "Искры";
   private static final String f_3503 = "Свечение";
   private static final String f_3504 = "От Убийства/Тотема";
   private static final String f_3505 = "Цвет убийства";
   private static final String f_3506 = "От темы";
   private static final String f_3507 = "Радужные";
   private static final String f_3508 = "dimasik/particles";
   private static final String f_3509 = "dead_chams";
   private static final String f_3510 = "dead_chams";
   private static final String f_3511 = "Sampler0";
   private static final String f_3512 = "explorer.exe";
   private static final String f_3513 = "2";
   private static final String f_3514 = "Ходьба";
   private static final String f_3515 = "Летящие предметы";
   private static final double f_3516 = 6400.0;
   private static final String f_3517 = "Ходьбе";
   private static final String f_3518 = "Эндер жемчуг";
   private static final String f_3519 = "Стрела";
   private static final String f_3520 = "Бездействие";
   private static final double f_3521 = 4.0E-4;
   private static final float f_3522 = 20.0F;
   private static final float f_3523 = 90.0F;
   private static final double f_3524 = 0.5;
   private static final double f_3525 = 0.5;
   private static final float f_3526 = 0.05F;
   private static final double f_3527 = -0.15;
   private static final double f_3528 = 0.15;
   private static final double f_3529 = 0.3;
   private static final double f_3530 = 0.3;
   private static final double f_3531 = -0.15;
   private static final double f_3532 = 0.15;
   private static final double f_3533 = -0.5;
   private static final double f_3534 = 0.5;
   private static final double f_3535 = -0.5;
   private static final double f_3536 = 0.5;
   private static final double f_3537 = 0.5;
   private static final double f_3538 = -0.5;
   private static final double f_3539 = 0.5;
   private static final float f_3540 = 0.6F;
   private static final float f_3541 = 0.5F;
   private static final float f_3542 = 0.99F;
   private static final float f_3543 = 40.0F;
   private static final float f_3544 = 0.45F;
   private static final double f_3545 = 4096.0;
   private static final double f_3546 = 0.004;
   private static final double f_3547 = 0.002;
   private static final double f_3548 = 0.5;
   private static final double f_3549 = 0.5;
   private static final double f_3550 = 1.0E-8;
   private static final double f_3551 = 1.0E-8;
   private static final float f_3552 = 0.45F;
   private static final float f_3553 = 0.37F;
   private static final float f_3554 = 0.07F;
   private static final float f_3555 = 0.04F;
   private static final double f_3556 = 2.0;
   private static final double f_3557 = 4.0;
   private static final float f_3558 = 0.12F;
   private static final double f_3559 = 0.025;
   private static final double f_3560 = 1.0E-5;
   private static final double f_3561 = -0.012;
   private static final double f_3562 = 0.6;
   private static final double f_3563 = 1.1;
   private static final double f_3564 = -1.0;
   private static final double f_3565 = 0.008;
   private static final double f_3566 = -1.0;
   private static final double f_3567 = 0.008;
   private static final float f_3568 = 0.7F;
   private static final float f_3569 = 0.35F;
   private static final float f_3570 = 0.18F;
   private static final float f_3571 = 0.12F;
   private static final float f_3572 = 0.96F;
   private static final double f_3573 = 4.0;
   private static final double f_3574 = 10.0;
   private static final double f_3575 = 2.0;
   private static final double f_3576 = 0.5;
   private static final double f_3577 = 1.1;
   private static final double f_3578 = -0.012;
   private static final double f_3579 = 0.03;
   private static final double f_3580 = 0.006;
   private static final float f_3581 = 0.55F;
   private static final float f_3582 = 0.28F;
   private static final float f_3583 = 0.975F;
   private static final double f_3584 = 8.0;
   private static final double f_3585 = 14.0;
   private static final double f_3586 = 1.5;
   private static final double f_3587 = Math.PI * 2;
   private static final double f_3588 = 0.01;
   private static final double f_3589 = 0.06;
   private static final double f_3590 = 0.02;
   private static final double f_3591 = 0.07;
   private static final double f_3592 = -0.02;
   private static final double f_3593 = 0.03;
   private static final double f_3594 = 0.008;
   private static final double f_3595 = 0.035;
   private static final double f_3596 = 0.3;
   private static final double f_3597 = 0.48;
   private static final double f_3598 = 0.1;
   private static final double f_3599 = 0.2;
   private static final float f_3600 = 0.95F;
   private static final double f_3601 = 12.0;
   private static final double f_3602 = 22.0;
   private static final double f_3603 = 0.99;
   private static final double f_3604 = 1.0E-8;
   private static final String f_3605 = "Ударе";
   private static final float f_3606 = 0.12F;
   private static final float f_3607 = 0.08F;
   private static final float f_3608 = 0.5F;
   private static final double f_3609 = 0.35;
   private static final float f_3610 = 0.35F;
   private static final float f_3611 = 0.2F;
   private static final double f_3612 = 0.25;
   private static final float f_3613 = 0.5F;
   private static final double f_3614 = 0.35;
   private static final double f_3615 = 0.2;
   private static final double f_3616 = 0.5;
   private static final double f_3617 = 0.5;
   private static final double f_3618 = 0.1;
   private static final double f_3619 = 0.5;
   private static final double f_3620 = 0.5;
   private static final float f_3621 = 2.2F;
   private static final float f_3622 = 20.0F;
   private static final float f_3623 = 0.9F;
   private static final float f_3624 = 4.0F;
   private static final float f_3625 = 8.0F;
   private static final String f_3626 = "Удар";
   private static final float f_3627 = 0.15F;
   private static final double f_3628 = -1.0;
   private static final double f_3629 = -1.0;
   private static final double f_3630 = -1.0;
   private static final float f_3631 = 0.99F;
   private static final String f_3632 = "Поп тотема";
   private static final String f_3633 = "Тотем";
   private static final float f_3634 = 0.5F;
   private static final double f_3635 = -1.0;
   private static final double f_3636 = -1.0;
   private static final double f_3637 = -1.0;
   private static final double f_3638 = 0.5;
   private static final double f_3639 = 0.5;
   private static final double f_3640 = 0.5;
   private static final double f_3641 = 0.5;
   private static final double f_3642 = 0.22;
   private static final double f_3643 = 0.45;
   private static final double f_3644 = 0.18;
   private static final double f_3645 = 0.42;
   private static final double f_3646 = 0.05;
   private static final double f_3647 = 0.14;
   private static final float f_3648 = 0.85F;
   private static final float f_3649 = 0.8F;
   private static final float f_3650 = 0.98F;
   private static final long f_3651 = 4000L;
   private static final double f_3652 = 4096.0;
   private static final double f_3653 = 31.0;
   private static final double f_3654 = 17.0;
   private static final double f_3655 = 1.0E-4;
   private static final double f_3656 = 0.55F;
   private static final double f_3657 = 0.55;
   private static final double f_3658 = 0.95;
   private static final double f_3659 = 0.55F;
   private static final double f_3660 = 0.2;
   private static final double f_3661 = 0.6;
   private static final float f_3662 = 0.36F;
   private static final float f_3663 = 0.85F;
   private static final float f_3664 = 1.15F;
   private static final float f_3665 = 2.2F;
   private static final double f_3666 = 0.5;
   private static final double f_3667 = 0.2;
   private static final double f_3668 = 0.5;
   private static final String f_3669 = "Радужные";
   private static final float f_3670 = 0.01F;
   private static final int f_3671 = -16777216;
   private static final float f_3672 = 1000.0F;
   private static final double f_3673 = 4.0E-4;
   private static final double f_3674 = -0.5;
   private static final double f_3675 = 0.5;
   private static final double f_3676 = -0.5;
   private static final double f_3677 = 0.5;
   private static final double f_3678 = -0.1;
   private static final double f_3679 = 0.1;
   private static final double f_3680 = -0.1;
   private static final double f_3681 = 0.1;
   private static final double f_3682 = 0.07;
   private static final float f_3683 = 0.1F;
   private static final float f_3684 = 0.125F;
   private static final float f_3685 = 0.8F;
   private static final float f_3686 = 0.98F;
   private static final float f_3687 = 3.0F;
   private static final String f_3688 = "Эндер жемчуг";
   private static final String f_3689 = "Стрела";
   private static final double f_3690 = 4096.0;
   private static final double f_3691 = 0.35;
   private static final double f_3692 = 0.07;
   private static final float f_3693 = 0.1F;
   private static final float f_3694 = 0.125F;
   private static final float f_3695 = 0.98F;
   private static final float f_3696 = 8.0F;
   private static final float f_3697 = 29.0F;
   private static final float f_3698 = 360.0F;
   private static final double f_3699 = -15.0;
   private static final double f_3700 = 15.0;
   private static final double f_3701 = -3.0;
   private static final double f_3702 = 3.0;
   private static final double f_3703 = -1.0;
   private static final double f_3704 = -3.0;
   private static final double f_3705 = 3.0;
   private static final double f_3706 = 0.07;
   private static final float f_3707 = 0.1F;
   private static final float f_3708 = 0.125F;
   private static final float f_3709 = 2.5F;
   private static final float f_3710 = 0.98F;
   private static final double f_3711 = -0.4;
   private static final double f_3712 = 0.4;
   private static final double f_3713 = 0.5;
   private static final double f_3714 = -0.3;
   private static final double f_3715 = 0.3;
   private static final double f_3716 = -0.4;
   private static final double f_3717 = 0.4;
   private static final double f_3718 = -0.55;
   private static final double f_3719 = 0.55;
   private static final double f_3720 = 0.12;
   private static final double f_3721 = 0.55;
   private static final double f_3722 = -0.55;
   private static final double f_3723 = 0.55;
   private static final float f_3724 = 0.1F;
   private static final float f_3725 = 0.225F;
   private static final double f_3726 = 0.12;
   private static final float f_3727 = 2.15F;
   private static final float f_3728 = 1.35F;
   private static final float f_3729 = 0.97F;
   private static final float f_3730 = 10.0F;
   private static final String f_3731 = "Радужные";
   private static final int f_3732 = -16777216;
   private static final String f_3733 = "Орбиз";
   private static final String f_3734 = "Кругляши";
   private static final String f_3735 = "Звезды";
   private static final String f_3736 = "Сердечки";
   private static final String f_3737 = "Доллары";
   private static final String f_3738 = "Снежинки";
   private static final String f_3739 = "Короны";
   private static final String f_3740 = "Молнии";
   private static final String f_3741 = "Линии";
   private static final String f_3742 = "Ромбы";
   private static final String f_3743 = "Искры";
   private static final String f_3744 = "Рандом";
   private static final String f_3745 = "Корона";
   private static final String f_3746 = "Взрыв куба";
   private static final String f_3747 = "Доллар";
   private static final String f_3748 = "Сердце";
   private static final String f_3749 = "Молния";
   private static final String f_3750 = "Линия";
   private static final String f_3751 = "Ромб";
   private static final String f_3752 = "Снежинка";
   private static final String f_3753 = "Звезда 2";
   private static final String f_3754 = "Треугольник";
   private static final double f_3755 = 4096.0;
   private static final float f_3756 = 0.01F;
   private static final float f_3757 = 0.5F;
   private static final int f_3758 = 16777215;
   private static final float f_3759 = 255.0F;
   private static final float f_3760 = 7.5F;
   private static final float f_3761 = 0.2F;
   private static final float f_3762 = 1.35F;
   private static final int f_3763 = 16777215;
   private static final float f_3764 = 255.0F;
   private static final float f_3765 = 0.65F;
   private static final float f_3766 = 0.549F;
   private static final String f_3767 = "Sampler0";
   private static final float f_3768 = 0.5F;
   private static final float f_3769 = (float) (Math.PI / 180.0);
   private static final float f_3770 = (float) (Math.PI / 180.0);
   private static final float f_3771 = (float) (Math.PI / 180.0);
   private static final String f_3772 = "particles";
   private static final long f_3773 = 16000L;
   private static final String f_3774 = "Бездействие";
   private static final String f_3775 = "Ударе";
   private static final String f_3776 = "Ходьба";
   private static final int f_3777 = -65536;
   private static final int f_3778 = -33024;
   private static final int f_3779 = -16711936;
   private static final int f_3780 = -16711681;
   private static final int f_3781 = -16776961;
   private static final int f_3782 = -7667457;
   private static final int f_3783 = -65281;
   private static final int f_3784 = -60269;
   private static final int f_3785 = -16711809;
   private static final int f_3786 = -40121;
   private static final int f_3787 = -16711936;
   private static final int f_3788 = -13447886;
   private static final int f_3789 = -8586240;
   private static final int f_3790 = -5374161;
   private static final int f_3791 = -16711809;
   private static final int f_3792 = -12976364;
   private static final int f_3793 = -10027264;
   private static final int f_3794 = -6619392;

   private void m_1680() {
      ArrayList var1 = new ArrayList<>(List.of(this.f_3383));
      HashSet var2 = new HashSet<>(Class_ZaxOIoJW5RKgQbqm.m_5832());
      this.f_3385.keySet().removeIf(var1x -> !var2.contains(var1x));

      for (String var4 : Class_ZaxOIoJW5RKgQbqm.m_5832()) {
         var1.add(this.f_3385.computeIfAbsent(var4, Class_2ZaVm8TGDJ68TnJB::new));
      }

      var1.add(this.f_3384);
      this.f_3387.m_7563(var1);
   }

   private void m_1681(LivingEntity var1, boolean var2) {
      if (this.f_3406.m_8768() && var1 != null && f_11537.level != null) {
         if (f_11537.player == null || !(var1.distanceToSqr(f_11537.player) > f_3652)) {
            if (Optimization.m_5849(var1.getX(), var1.getY(), var1.getZ())) {
               if (var2 || this.m_1695(var1.getId())) {
                  int var3 = Optimization.m_5843(260);
                  int var4 = Optimization.m_5843(3600);
                  List var5 = Class_binHXWny7kagd8ju.m_6117(var1, var3);
                  if (!var5.isEmpty()) {
                     int var6 = Math.min(var5.size(), var3);
                     int var7 = this.f_3408.size() + var6 - var4;
                     if (var7 > 0) {
                        this.f_3408.subList(0, Math.min(var7, this.f_3408.size())).clear();
                     }

                     Vec3 var8 = this.m_1707(var1);
                     Random var9 = new Random(Double.doubleToLongBits(var8.x + var8.y * f_3653 + var8.z * f_3654) ^ System.currentTimeMillis());
                     int var10 = 0;

                     for (Vec3 var12 : (Iterable<Vec3>) (Iterable) var5) {
                        if (var10 >= var6 || !this.m_1688()) {
                           break;
                        }

                        Vec3 var13 = var12.subtract(var8);
                        Vec3 var14 = var13.lengthSqr() < f_3655 ? m_1720(var9) : var13.normalize();
                        Vec3 var15 = var14.scale(f_3656 * (f_3657 + var9.nextDouble() * f_3658)).add(0.0, f_3659 * (f_3660 + var9.nextDouble() * f_3661), 0.0);
                        float var16 = f_3662 * (f_3663 + var9.nextFloat() * f_3664);
                        int var17 = var2 ? this.m_1684() : this.m_1702(var1, var12);
                        this.m_1700(
                           var12, var15, var17, var16, f_3665, 1.0F, Particles.UFLKbKZRjugLFQeB.MODEL, 0.0F, Particles.VaFl3cf8ablKPZzq.ORB.f_3236, false
                        );
                        var10++;
                     }
                  }
               }
            }
         }
      }
   }

   private Identifier m_1683() {
      Class_2ZaVm8TGDJ68TnJB var1 = this.f_3387.m_7564();
      if (var1 == null) {
         return Particles.VaFl3cf8ablKPZzq.STAR.f_3236;
      }

      String var2 = var1.m_1181();
      if (f_3744.equals(var2)) {
         return this.m_1721();
      }

      Identifier var3 = Class_ZaxOIoJW5RKgQbqm.m_5836(var2);
      if (var3 != null) {
         return var3;
      }

      return switch (var2) {
         case f_3745 -> Particles.VaFl3cf8ablKPZzq.CROWN.f_3236;
         case f_3746 -> Particles.VaFl3cf8ablKPZzq.CUBE_BLAST.f_3236;
         case f_3747 -> Particles.VaFl3cf8ablKPZzq.DOLLAR.f_3236;
         case f_3748 -> Particles.VaFl3cf8ablKPZzq.HEART.f_3236;
         case f_3749 -> Particles.VaFl3cf8ablKPZzq.LIGHTNING.f_3236;
         case f_3750 -> Particles.VaFl3cf8ablKPZzq.LINE.f_3236;
         case f_3751 -> Particles.VaFl3cf8ablKPZzq.RHOMBUS.f_3236;
         case f_3752 -> Particles.VaFl3cf8ablKPZzq.SNOWFLAKE.f_3236;
         case f_3753 -> Particles.VaFl3cf8ablKPZzq.STAR_ALT.f_3236;
         case f_3754 -> Particles.VaFl3cf8ablKPZzq.TRIANGLE.f_3236;
         default -> Particles.VaFl3cf8ablKPZzq.STAR.f_3236;
      };
   }

   private int m_1684() {
      return f_3382[ThreadLocalRandom.current().nextInt(f_3382.length)];
   }

   private void m_1685() {
      try {
         Aura var1 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
         if (var1 != null && var1.m_776() && var1.m_1114() != null && var1.m_1114().isAlive()) {
            this.m_1719(var1.m_1114(), false);
         }
      } catch (Throwable var5) {
      }

      Iterator var6 = this.f_3411.iterator();

      while (var6.hasNext()) {
         Particles.bo8EXFtwSv4O39pW var2 = (Particles.bo8EXFtwSv4O39pW)var6.next();
         if (!var2.m_1676()) {
            var6.remove();
         } else {
            LivingEntity var3 = var2.f_3353;
            boolean var4 = f_11537.level.getEntity(var3.getId()) == null;
            if (var3.getHealth() <= 0.0F || !var3.isAlive() || var4) {
               this.m_1706(var3);
               var6.remove();
            }
         }
      }

      this.f_3411.removeIf(var0 -> !var0.m_1676());
   }

   public Particles() {
      super(f_3420, f_3421, Category.RENDER);
      this.f_3383 = new Class_2ZaVm8TGDJ68TnJB[]{
         new Class_2ZaVm8TGDJ68TnJB(f_3422),
         new Class_2ZaVm8TGDJ68TnJB(f_3423),
         new Class_2ZaVm8TGDJ68TnJB(f_3424),
         new Class_2ZaVm8TGDJ68TnJB(f_3425),
         new Class_2ZaVm8TGDJ68TnJB(f_3426),
         new Class_2ZaVm8TGDJ68TnJB(f_3427),
         new Class_2ZaVm8TGDJ68TnJB(f_3428),
         new Class_2ZaVm8TGDJ68TnJB(f_3429),
         new Class_2ZaVm8TGDJ68TnJB(f_3430),
         new Class_2ZaVm8TGDJ68TnJB(f_3431),
         new Class_2ZaVm8TGDJ68TnJB(f_3432)
      };
      this.f_3384 = new Class_2ZaVm8TGDJ68TnJB(f_3433);
      this.f_3385 = new LinkedHashMap<>();
      this.f_3386 = new MultiChoiceSetting(f_3434, new Class_2ZaVm8TGDJ68TnJB(f_3435), new Class_2ZaVm8TGDJ68TnJB(f_3436));
      this.f_3387 = new MultiChoiceSetting(f_3437, 8, this.m_1728(this.f_3383)).m_822(this::m_1690);
      this.f_3388 = new BooleanSetting(f_3438).m_1474(this::m_1713).m_1472().m_822(this::m_1690);
      this.f_3389 = new ItemListSetting(
            f_3439,
            new Class_2ZaVm8TGDJ68TnJB(f_3440, true),
            new Class_2ZaVm8TGDJ68TnJB(f_3441, true),
            new Class_2ZaVm8TGDJ68TnJB(f_3442, true),
            new Class_2ZaVm8TGDJ68TnJB(f_3443, true)
         )
         .m_822(this::m_1690);
      this.f_3390 = new SliderSetting(f_3444, f_3445, f_3446, f_3447).m_828(1.0F).m_822(this::m_1690);
      this.f_3391 = new SliderSetting(f_3448, f_3449, f_3450, f_3451).m_828(1.0F).m_822(() -> this.m_1690() && this.f_3389.m_7145(f_3776));
      this.f_3392 = new SliderSetting(f_3452, 1.0F, f_3453, f_3454).m_828(f_3455).m_822(this::m_1690);
      this.f_3393 = new SliderSetting(f_3456, 2.0F, f_3457, f_3458).m_828(f_3459).m_822(this::m_1690);
      this.f_3394 = new SliderSetting(f_3460, f_3461, f_3462, f_3463).m_828(f_3464).m_822(this::m_1690);
      this.f_3395 = new SliderSetting(f_3465, 1.0F, f_3466, 1.0F).m_828(f_3467).m_822(this::m_1690);
      this.f_3396 = new CheckboxSetting(f_3468, true).m_822(() -> this.m_1690() && this.m_1715());
      this.f_3397 = new CheckboxSetting(f_3469, false).m_822(() -> this.m_1690() && !this.m_1692());
      this.f_3398 = new CheckboxSetting(f_3470, true).m_822(() -> this.m_1690() && !this.m_1692() && !this.f_3397.m_8768());
      this.f_3399 = new ColorSetting(f_3471, false, f_3472).m_822(() -> this.m_1690() && !this.m_1692() && !this.f_3397.m_8768() && !this.f_3398.m_8768());
      this.f_3400 = new ItemListSetting(
            f_3473,
            new Class_2ZaVm8TGDJ68TnJB(f_3474, true),
            new Class_2ZaVm8TGDJ68TnJB(f_3475, true),
            new Class_2ZaVm8TGDJ68TnJB(f_3476, false),
            new Class_2ZaVm8TGDJ68TnJB(f_3477, true),
            new Class_2ZaVm8TGDJ68TnJB(f_3478, false),
            new Class_2ZaVm8TGDJ68TnJB(f_3479, false)
         )
         .m_822(this::m_1726);
      this.f_3401 = new MultiChoiceSetting(f_3480, 1, new Class_2ZaVm8TGDJ68TnJB(f_3481), new Class_2ZaVm8TGDJ68TnJB(f_3482)).m_822(this::m_1726);
      this.f_3402 = new SliderSetting(f_3483, f_3484, f_3485, f_3486).m_828(1.0F).m_822(() -> this.m_1726() && this.f_3400.m_7145(f_3775));
      this.f_3403 = new SliderSetting(f_3487, f_3488, f_3489, f_3490).m_828(1.0F).m_822(() -> this.m_1726() && this.f_3400.m_7145(f_3774));
      this.f_3404 = new ItemListSetting(
            f_3491,
            new Class_2ZaVm8TGDJ68TnJB(f_3492, true),
            new Class_2ZaVm8TGDJ68TnJB(f_3493, false),
            new Class_2ZaVm8TGDJ68TnJB(f_3494, false),
            new Class_2ZaVm8TGDJ68TnJB(f_3495, false),
            new Class_2ZaVm8TGDJ68TnJB(f_3496, false),
            new Class_2ZaVm8TGDJ68TnJB(f_3497, false),
            new Class_2ZaVm8TGDJ68TnJB(f_3498, false),
            new Class_2ZaVm8TGDJ68TnJB(f_3499, false),
            new Class_2ZaVm8TGDJ68TnJB(f_3500, false),
            new Class_2ZaVm8TGDJ68TnJB(f_3501, false),
            new Class_2ZaVm8TGDJ68TnJB(f_3502, false)
         )
         .m_822(this::m_1726);
      this.f_3405 = new CheckboxSetting(f_3503, false).m_822(this::m_1726);
      this.f_3406 = new CheckboxSetting(f_3504, true);
      this.f_3407 = new MultiChoiceSetting(f_3505, new Class_2ZaVm8TGDJ68TnJB(f_3506), new Class_2ZaVm8TGDJ68TnJB(f_3507)).m_822(this.f_3406::m_8768);
      this.f_3408 = new ArrayList<>();
      this.f_3409 = new Identifier[11];
      this.f_3410 = new ArrayList<>();
      this.f_3411 = new ArrayList<>();
      this.f_3412 = new HashMap<>();
      this.f_3413 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_3508)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_3509))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_3510))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.ADDITIVE)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2741(f_3511)
         .m_2722();
      this.f_3414 = this::m_1724;
      this.f_3415 = this::m_1714;
      this.f_3416 = this::m_1717;
      this.f_3417 = this::m_1703;
      this.m_795(
         this.f_3386,
         this.f_3406,
         this.f_3407,
         this.f_3387,
         this.f_3388,
         this.f_3389,
         this.f_3390,
         this.f_3391,
         this.f_3392,
         this.f_3393,
         this.f_3394,
         this.f_3395,
         this.f_3396,
         this.f_3397,
         this.f_3398,
         this.f_3399,
         this.f_3400,
         this.f_3401,
         this.f_3402,
         this.f_3403,
         this.f_3404,
         this.f_3405
      );
      Class_ZaxOIoJW5RKgQbqm.m_5835();
      Class_ZaxOIoJW5RKgQbqm.m_5831(false, this::m_1680);
   }

   private int m_1687() {
      if (this.m_1692()) {
         return -1;
      } else if (this.f_3397.m_8768()) {
         return f_3381[ThreadLocalRandom.current().nextInt(f_3381.length)];
      } else {
         return this.f_3398.m_8768() ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : this.f_3399.m_8768();
      }
   }

   private boolean m_1688() {
      return this.f_3408.size() < Optimization.m_5843(3600);
   }

   private boolean m_1690() {
      return !this.m_1726();
   }

   private static double m_1691(double var0, double var2) {
      return !(var2 > var0) ? var0 : ThreadLocalRandom.current().nextDouble(var0, var2);
   }

   private boolean m_1692() {
      return this.m_1715() && this.f_3396.m_8768();
   }

   private void m_1694() {
      if ((this.f_3419 & 1) == 0) {
         float var1 = this.f_3392.m_8768();
         float var2 = this.f_3393.m_8768();
         float var3 = this.f_3390.m_8768() / f_3543;
         float var4 = this.f_3395.m_8768() * f_3544;
         float var5 = this.f_3394.m_8768();
         int var6 = this.m_1687();
         int var7 = 0;

         for (Entity var9 : f_11537.level.entitiesForRendering()) {
            if (var7 >= 48 || !this.m_1688()) {
               break;
            }

            if ((var9 instanceof ThrowableProjectile || var9 instanceof AbstractArrow || var9 instanceof FireworkRocketEntity)
               && !(var9.distanceToSqr(f_11537.player) > f_3545)) {
               Vec3 var10 = var9.getDeltaMovement();
               double var11 = var10.lengthSqr();
               double var13 = var9.getX() - var9.xo;
               double var15 = var9.getY() - var9.yo;
               double var17 = var9.getZ() - var9.zo;
               double var19 = Math.sqrt(var13 * var13 + var15 * var15 + var17 * var17);
               if (!(var19 < f_3546) || !(var11 < f_3547)) {
                  var7++;
                  Vec3 var21 = new Vec3(var9.xo, var9.yo + var9.getBbHeight() * f_3548, var9.zo);
                  Vec3 var22 = new Vec3(var9.getX(), var9.getY() + var9.getBbHeight() * f_3549, var9.getZ());
                  Vec3 var23 = var11 > f_3550
                     ? var10.normalize()
                     : (var19 > f_3551 ? new Vec3(var13 / var19, var15 / var19, var17 / var19) : new Vec3(0.0, 0.0, 1.0));
                  Vec3[] var24 = m_1710(var23);
                  Vec3 var25 = var24[0];
                  Vec3 var26 = var24[1];
                  double var27 = Math.max(Math.sqrt(var11), var19);
                  float var29 = this.f_3419 * f_3552 + var9.getId() * f_3553;
                  float var30 = f_3554 + var1 * f_3555;
                  int var31 = Mth.clamp((int)((f_3556 + var27 * f_3557) * var3), 2, 7);
                  int var32 = Class_BftdentXEtGbugJw.m_2312(var6, -1, f_3558);

                  for (int var33 = 0; var33 < var31 && this.m_1688(); var33++) {
                     double var34 = var31 == 1 ? 1.0 : (double)var33 / (var31 - 1);
                     double var36 = (1.0 - var34) * f_3559;
                     Vec3 var38 = var21.lerp(var22, var34);
                     if (var36 > f_3560) {
                        var38 = var38.add(var25.scale(m_1691(-var36, var36)).add(var26.scale(m_1691(-var36, var36))));
                     }

                     Vec3 var39 = var23.scale(f_3561 * var2 * m_1691(f_3562, f_3563))
                        .add(var25.scale(m_1691(f_3564, 1.0) * f_3565 * var1))
                        .add(var26.scale(m_1691(f_3566, 1.0) * f_3567 * var1));
                     this.m_1711(
                        var38,
                        var39,
                        var32,
                        var4 * (f_3568 + (float)var34 * f_3569),
                        var5 * (f_3570 + (float)var34 * f_3571),
                        f_3572,
                        Particles.UFLKbKZRjugLFQeB.COMET,
                        (float)m_1691(f_3573, f_3574)
                     );
                  }

                  int var43 = Mth.clamp((int)(f_3575 + var27 * var3), 2, 4);

                  for (int var44 = 0; var44 < var43 && this.m_1688(); var44++) {
                     double var35 = var43 == 1 ? f_3576 : (double)var44 / (var43 - 1);
                     double var37 = var29 + var35 * f_3577;
                     Vec3 var49 = var25.scale(Math.cos(var37) * var30).add(var26.scale(Math.sin(var37) * var30));
                     Vec3 var40 = var21.lerp(var22, var35).add(var49);
                     Vec3 var41 = var25.scale(-Math.sin(var37)).add(var26.scale(Math.cos(var37)));
                     Vec3 var42 = var23.scale(f_3578 * var2).add(var41.scale(f_3579 * var2)).add(var49.normalize().scale(f_3580 * var1));
                     this.m_1711(var40, var42, var6, var4 * f_3581, var5 * f_3582, f_3583, Particles.UFLKbKZRjugLFQeB.SWIRL, (float)m_1691(f_3584, f_3585));
                  }

                  int var45 = Mth.clamp((int)((1.0 + var27 * f_3586) * var3), 1, 3);

                  for (int var46 = 0; var46 < var45 && this.m_1688(); var46++) {
                     double var47 = m_1691(0.0, f_3587);
                     Vec3 var48 = var25.scale(Math.cos(var47)).add(var26.scale(Math.sin(var47)));
                     Vec3 var50 = var22.add(var48.scale(m_1691(f_3588, f_3589 * var1)));
                     Vec3 var51 = var48.scale(m_1691(f_3590, f_3591) * var1 * var2)
                        .add(var23.scale(m_1691(f_3592, f_3593) * var2))
                        .add(0.0, m_1691(f_3594, f_3595) * var2, 0.0);
                     this.m_1711(
                        var50,
                        var51,
                        var32,
                        var4 * (float)m_1691(f_3596, f_3597),
                        var5 * (float)m_1691(f_3598, f_3599),
                        f_3600,
                        Particles.UFLKbKZRjugLFQeB.SPARK,
                        (float)m_1691(f_3601, f_3602)
                     );
                  }
               }
            }
         }
      }
   }

   private boolean m_1695(int var1) {
      long var2 = System.currentTimeMillis();
      this.f_3412.entrySet().removeIf(var2x -> var2 - var2x.getValue() > f_3773);
      Long var4 = this.f_3412.get(var1);
      if (var4 != null && var2 - var4 < f_3651) {
         return false;
      }

      this.f_3412.put(var1, var2);
      return true;
   }

   private void m_1697() {
      this.f_3408.clear();
      this.f_3363.clear();
      this.f_3364.clear();
      this.f_3365.clear();
      this.f_3410.clear();
      this.f_3411.clear();
      this.f_3412.clear();
      Class_binHXWny7kagd8ju.m_6104();
      this.f_3418 = 0.0F;
      this.f_3419 = 0;
   }

   private void m_1699(Particles.pQ7Ybsc06keXySFK var1) {
      Entity var2 = var1.f_3360;
      if (var2 != null && !var2.isRemoved()) {
         float var3 = 1.0F - var1.m_1679() * f_3634;
         float var4 = this.f_3393.m_8768();

         for (int var5 = 0; var5 < 8 && this.m_1688(); var5++) {
            double var6 = m_1691(f_3635, 1.0);
            double var8 = m_1691(f_3636, 1.0);
            double var10 = m_1691(f_3637, 1.0);
            if (!(var6 * var6 + var8 * var8 + var10 * var10 > 1.0)) {
               Vec3 var12 = new Vec3(
                  var2.getX() + var6 * var2.getBbWidth() * f_3638,
                  var2.getY(f_3639) + var8 * var2.getBbHeight() * f_3640,
                  var2.getZ() + var10 * var2.getBbWidth() * f_3641
               );
               double var13 = this.f_3392.m_8768().floatValue() * f_3642 * var3 * var4;
               double var15 = Math.random() < f_3643 ? m_1691(f_3644, f_3645) * var4 : m_1691(f_3646, f_3647) * var4;
               Vec3 var17 = new Vec3(var6 * var13, var15, var10 * var13);
               this.m_1704(var12, var17, this.m_1684(), this.f_3395.m_8768() * f_3648, this.f_3394.m_8768() * f_3649, f_3650);
            }
         }
      }
   }

   private void m_1700(
      Vec3 var1, Vec3 var2, int var3, float var4, float var5, float var6, Particles.UFLKbKZRjugLFQeB var7, float var8, Identifier var9, boolean var10
   ) {
      if (this.m_1688() && Optimization.m_5849(var1.x, var1.y, var1.z)) {
         this.f_3408.add(new Particles.aGUbKDRTs5PvAI8k(var1, var2, var3, var4, (long)(var5 * f_3672), var6, var9, var7, var8, var10));
      }
   }

   private void m_1701() {
      if (!(f_11537.player.getDeltaMovement().horizontalDistanceSqr() <= f_3673)) {
         for (int var1 = 0; var1 < 2 && this.m_1688(); var1++) {
            float var2 = f_11537.player.getBbHeight() * ThreadLocalRandom.current().nextFloat();
            Vec3 var3 = new Vec3(f_11537.player.getX() + m_1691(f_3674, f_3675), f_11537.player.getY() + var2, f_11537.player.getZ() + m_1691(f_3676, f_3677));
            Vec3 var4 = new Vec3(
                  f_11537.player.getDeltaMovement().x + m_1691(f_3678, f_3679), 0.0, f_11537.player.getDeltaMovement().z + m_1691(f_3680, f_3681)
               )
               .scale(f_3682);
            float var5 = f_3683 + ThreadLocalRandom.current().nextFloat() * f_3684;
            this.m_1700(
               var3, var4, this.m_1739(), var5 * 2.0F, f_3685, f_3686, Particles.UFLKbKZRjugLFQeB.ZENITH_FLOAT, f_3687, this.m_1718(), this.f_3405.m_8768()
            );
         }
      }
   }

   private int m_1702(LivingEntity var1, Vec3 var2) {
      if (this.f_3407.m_7568(f_3669)) {
         float var3 = var1.getBbHeight() <= f_3670
            ? ThreadLocalRandom.current().nextFloat()
            : Mth.clamp((float)((var2.y - var1.getY()) / var1.getBbHeight()), 0.0F, 1.0F);
         return Color.HSBtoRGB(var3, 1.0F, 1.0F) | f_3671;
      } else {
         return Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
      }
   }

   private void m_1703(Class_TZhU50s8XmBQCMP5 var1) {
      if (!this.f_3408.isEmpty()) {
         this.f_3363.values().forEach(List::clear);
         this.f_3364.clear();
         this.f_3365.clear();
         float var2 = var1.m_5005().getGameTimeDeltaPartialTick(true);
         Vec3 var3 = f_11537.gameRenderer.mainCamera().position();
         double var4 = Optimization.m_5851(f_3755);
         long var6 = System.currentTimeMillis();
         boolean var8 = this.m_1726();
         boolean var9 = this.m_1690() || this.f_3405.m_8768();

         for (Particles.aGUbKDRTs5PvAI8k var11 : this.f_3408) {
            double var12;
            double var14;
            double var16;
            if (var11.f_3263 == Particles.UFLKbKZRjugLFQeB.MODEL) {
               var11.m_1657(var6);
               var12 = var11.f_3237;
               var14 = var11.f_3238;
               var16 = var11.f_3239;
            } else {
               var12 = Mth.lerp(var2, var11.f_3240, var11.f_3237);
               var14 = Mth.lerp(var2, var11.f_3241, var11.f_3238);
               var16 = Mth.lerp(var2, var11.f_3242, var11.f_3239);
            }

            double var18 = var12 - var3.x;
            double var20 = var14 - var3.y;
            double var22 = var16 - var3.z;
            if (!(var18 * var18 + var20 * var20 + var22 * var22 > var4)) {
               float var24 = var11.m_1660(var6);
               if (!(var24 <= f_3756)) {
                  float var25 = Mth.clamp((float)(var6 - var11.f_3259) / (float)Math.max(1L, var11.f_3260), 0.0F, 1.0F);
                  float var26 = var11.m_1663(var25, var6);
                  var11.f_3246 = var18;
                  var11.f_3247 = var20;
                  var11.f_3248 = var22;
                  var11.f_3249 = var11.f_3257 * f_3757 * var26;
                  var11.f_3251 = var11.f_3256 & f_3758 | (int)(f_3759 * var24) << 24;
                  List var27 = this.f_3363.computeIfAbsent(var11.f_3262, var0 -> new ArrayList<>());
                  if (var27.isEmpty()) {
                     this.f_3364.add(var11.f_3262);
                  }

                  var27.add(var11);
                  if (var9 && var11.f_3263 != Particles.UFLKbKZRjugLFQeB.MODEL && (!var8 || var11.f_3265)) {
                     var11.f_3250 = var11.f_3249 * f_3760 * f_3761 * var11.m_1665() * (var11.f_3265 ? f_3762 : 1.0F);
                     var11.f_3252 = var11.f_3256 & f_3763 | (int)(f_3764 * (var24 * (var11.f_3265 ? f_3765 : f_3766))) << 24;
                     this.f_3365.add(var11);
                  }
               }
            }
         }

         this.f_3363.values().removeIf(List::isEmpty);

         try {
            for (Identifier var32 : this.f_3364) {
               this.m_1738(var1, var32, this.f_3363.get(var32), false);
            }

            if (!this.f_3365.isEmpty()) {
               this.m_1738(var1, Particles.VaFl3cf8ablKPZzq.f_3235, this.f_3365, true);
            }
         } finally {
            this.f_3363.values().forEach(List::clear);
            this.f_3364.clear();
            this.f_3365.clear();
         }
      }
   }

   private void m_1704(Vec3 var1, Vec3 var2, int var3, float var4, float var5, float var6) {
      this.m_1700(var1, var2, var3, var4, var5, var6, Particles.UFLKbKZRjugLFQeB.NORMAL, 2.0F, this.m_1683(), false);
   }

   private void m_1706(LivingEntity var1) {
      if (this.f_3406.m_8768() && var1 != null && var1 != f_11537.player) {
         Particles.bo8EXFtwSv4O39pW var2 = null;

         for (Particles.bo8EXFtwSv4O39pW var4 : this.f_3411) {
            if (var4.f_3353.getId() == var1.getId()) {
               var2 = var4;
               break;
            }
         }

         if (var2 != null && var2.f_3356 && !var2.f_3357) {
            var2.f_3357 = true;
            this.m_1681(var1, false);
         }
      }
   }

   private Vec3 m_1707(LivingEntity var1) {
      float var2 = f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true);
      double var3 = Mth.lerp(var2, var1.xOld, var1.getX());
      double var5 = Mth.lerp(var2, var1.yOld, var1.getY());
      double var7 = Mth.lerp(var2, var1.zOld, var1.getZ());
      return var1.getBoundingBox().move(var3 - var1.getX(), var5 - var1.getY(), var7 - var1.getZ()).getCenter();
   }

   @Override
   public void m_732() {
      this.m_1697();
      Class_binHXWny7kagd8ju.m_6104();
   }

   private void m_1709(Particles.pQ7Ybsc06keXySFK var1) {
      Entity var2 = var1.f_3360;
      if (var2 != null && !var2.isRemoved()) {
         for (int var3 = 0; var3 < 10 && this.m_1688(); var3++) {
            Vec3 var4 = new Vec3(var2.getX() + m_1691(f_3711, f_3712), var2.getY(f_3713) + m_1691(f_3714, f_3715), var2.getZ() + m_1691(f_3716, f_3717));
            Vec3 var5 = new Vec3(m_1691(f_3718, f_3719), m_1691(f_3720, f_3721), m_1691(f_3722, f_3723));
            float var6 = ThreadLocalRandom.current().nextFloat(f_3724, f_3725);
            this.m_1700(
               var4,
               var5.scale(f_3726),
               this.m_1684(),
               var6 * f_3727,
               f_3728,
               f_3729,
               Particles.UFLKbKZRjugLFQeB.ZENITH_FLOAT,
               f_3730,
               this.m_1718(),
               this.f_3405.m_8768()
            );
         }
      }
   }

   private static Vec3[] m_1710(Vec3 var0) {
      Vec3 var1 = Math.abs(var0.y) < f_3603 ? new Vec3(0.0, 1.0, 0.0) : new Vec3(1.0, 0.0, 0.0);
      Vec3 var2 = var0.cross(var1);
      if (var2.lengthSqr() < f_3604) {
         var2 = new Vec3(1.0, 0.0, 0.0);
      } else {
         var2 = var2.normalize();
      }

      Vec3 var3 = var2.cross(var0).normalize();
      return new Vec3[]{var2, var3};
   }

   private void m_1711(Vec3 var1, Vec3 var2, int var3, float var4, float var5, float var6, Particles.UFLKbKZRjugLFQeB var7, float var8) {
      this.m_1700(var1, var2, var3, var4, var5, var6, var7, var8, this.m_1683(), false);
   }

   private void m_1713() {
      try {
         Class_ZaxOIoJW5RKgQbqm.m_5835();
         new ProcessBuilder(f_3512, Class_ZaxOIoJW5RKgQbqm.f_16954.getAbsolutePath()).start();
         Class_ZaxOIoJW5RKgQbqm.m_5831(true, this::m_1680);
      } catch (Exception var3) {
         String var2 = var3.getMessage() != null ? var3.getMessage() : var3.getClass().getSimpleName();
         if (f_11537.player != null) {
            Class_ftHu9o3WzCU3Adxm.m_6731(var2 + "");
            Class_ftHu9o3WzCU3Adxm.m_6731(Class_ZaxOIoJW5RKgQbqm.f_16954.getAbsolutePath() + "");
         }
      }
   }

   private void m_1714(Class_wjdoxQGtI8mFyL6U var1) {
      if (var1.m_9372() == Class_wjdoxQGtI8mFyL6U.Class_327mRdjAqNoPaemJ.POST && var1.m_9370() != null) {
         if (var1.m_9370() instanceof LivingEntity var2 && var2.isAlive() && !(var2.getHealth() <= 0.0F)) {
            if (this.f_3406.m_8768() && var1.m_9371() == f_11537.player) {
               this.m_1719(var2, true);
            }

            if (this.m_1726()) {
               if (this.f_3400.m_7145(f_3605)) {
                  Entity var19 = var1.m_9370();
                  Vec3 var20 = var19.getDeltaMovement();
                  int var21 = Math.max(1, Math.round(this.f_3402.m_8768()));

                  for (int var22 = 0; var22 < var21 && this.m_1688(); var22++) {
                     float var23 = f_3606 + ThreadLocalRandom.current().nextFloat() * f_3607;
                     int var24 = 40 + ThreadLocalRandom.current().nextInt(20);
                     double var25 = (ThreadLocalRandom.current().nextFloat() * 2.0F - 1.0F) * f_3608 + var20.x * f_3609;
                     double var11 = ThreadLocalRandom.current().nextFloat() * f_3610 - f_3611 + Math.max(0.0, var20.y) * f_3612;
                     double var13 = (ThreadLocalRandom.current().nextFloat() * 2.0F - 1.0F) * f_3613 + var20.z * f_3614;
                     double var15 = Math.max(f_3615, var19.getBbHeight());
                     Vec3 var17 = new Vec3(
                        var19.getX() + (ThreadLocalRandom.current().nextDouble() - f_3616) * f_3617,
                        var19.getY() + f_3618 + ThreadLocalRandom.current().nextDouble() * var15,
                        var19.getZ() + (ThreadLocalRandom.current().nextDouble() - f_3619) * f_3620
                     );
                     this.m_1700(
                        var17,
                        new Vec3(var25, var11, var13),
                        this.m_1739(),
                        var23 * f_3621,
                        var24 / f_3622,
                        f_3623,
                        Particles.UFLKbKZRjugLFQeB.ZENITH,
                        f_3624 + ThreadLocalRandom.current().nextFloat() * f_3625,
                        this.m_1718(),
                        this.f_3405.m_8768()
                     );
                  }
               }
            } else if (this.f_3389.m_7145(f_3626)) {
               Entity var18 = var1.m_9370();
               float var4 = this.f_3392.m_8768() * f_3627;
               float var5 = this.f_3393.m_8768();
               int var6 = Math.round(this.f_3390.m_8768());

               for (int var7 = 0; var7 < var6 && this.m_1688(); var7++) {
                  Vec3 var8 = new Vec3(var18.getX(), var18.getY() + Math.random() * var18.getBbHeight(), var18.getZ());
                  Vec3 var9 = new Vec3(m_1691(f_3628, 1.0) * var4 * var5, m_1691(f_3629, 1.0) * var4 * var5, m_1691(f_3630, 1.0) * var4 * var5);
                  this.m_1704(var8, var9, this.m_1687(), this.f_3395.m_8768(), this.f_3394.m_8768(), f_3631);
               }
            }
         }
      }
   }

   private boolean m_1715() {
      Class_2ZaVm8TGDJ68TnJB var1 = this.f_3387.m_7564();
      return var1 != null && Class_ZaxOIoJW5RKgQbqm.m_5838(var1.m_1181());
   }

   private void m_1716(BufferBuilder var1, Identifier var2, int var3) {
      MeshData var4 = var1.build();
      if (var4 != null) {
         if (var3 == 0) {
            var4.close();
         } else {
            try {
               DrawState var5 = var4.drawState();
               int var6 = var5.indexCount();
               AutoStorageIndexBuffer var7 = RenderSystem.getSequentialBuffer(var5.primitiveTopology());
               GpuBuffer var8 = var7.getBuffer(var6);
               IndexType var9 = var7.type();
               GpuBufferSlice var10 = Class_HtEPOqGrAYrUdumw.m_2944(var4.vertexBuffer(), var5.format().getVertexSize());
               RenderTarget var11 = f_11537.gameRenderer.mainRenderTarget();
               CommandEncoder var12 = RenderSystem.getDevice().createCommandEncoder();
               AbstractTexture var13 = f_11537.getTextureManager().getTexture(var2);
               RenderPass var14 = var12.createRenderPass(
                  () -> f_3772, var11.getColorTextureView(), Optional.empty(), var11.getDepthTextureView(), OptionalDouble.empty()
               );

               try {
                  RenderSystem.bindDefaultUniforms(var14);
                  var14.setPipeline(this.f_3413);
                  var14.bindTexture(f_3767, var13.getTextureView(), var13.getSampler());
                  var14.setVertexBuffer(0, var10);
                  var14.setIndexBuffer(var8, var9);
                  var14.drawIndexed(var6, 1, 0, 0, 0);
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
               var4.close();
            }
         }
      }
   }

   @Override
   public void m_778() {
      Class_ZaxOIoJW5RKgQbqm.m_5831(false, this::m_1680);
   }

   private void m_1717(Class_XzpX8S5F5zd9jbuE var1) {
      if (f_11537.level != null) {
         if (var1.m_5619() instanceof ClientboundEntityEventPacket var2) {
            Entity var7 = var2.getEntity(f_11537.level);
            if (var7 != null) {
               if (var2.getEventId() == 35) {
                  boolean var5 = this.m_1726() ? this.f_3400.m_7145(f_3632) : this.f_3389.m_7145(f_3633);
                  if (this.f_3406.m_8768() && var7 instanceof LivingEntity var6) {
                     f_11537.execute(() -> this.m_1681(var6, true));
                  } else if (var5) {
                     f_11537.execute(() -> this.f_3410.add(new Particles.pQ7Ybsc06keXySFK(var7)));
                  }
               } else if (var2.getEventId() == 3 && this.f_3406.m_8768() && var7 instanceof LivingEntity var4) {
                  f_11537.execute(() -> this.m_1706(var4));
               }
            }
         }
      }
   }

   private Identifier m_1718() {
      int var1 = 0;
      if (this.f_3404.m_7145(f_3733)) {
         this.f_3409[var1++] = Particles.VaFl3cf8ablKPZzq.ORB.f_3236;
      }

      if (this.f_3404.m_7145(f_3734)) {
         this.f_3409[var1++] = Particles.VaFl3cf8ablKPZzq.GLOW.f_3236;
      }

      if (this.f_3404.m_7145(f_3735)) {
         this.f_3409[var1++] = Particles.VaFl3cf8ablKPZzq.STAR.f_3236;
      }

      if (this.f_3404.m_7145(f_3736)) {
         this.f_3409[var1++] = Particles.VaFl3cf8ablKPZzq.HEART.f_3236;
      }

      if (this.f_3404.m_7145(f_3737)) {
         this.f_3409[var1++] = Particles.VaFl3cf8ablKPZzq.DOLLAR.f_3236;
      }

      if (this.f_3404.m_7145(f_3738)) {
         this.f_3409[var1++] = Particles.VaFl3cf8ablKPZzq.SNOWFLAKE.f_3236;
      }

      if (this.f_3404.m_7145(f_3739)) {
         this.f_3409[var1++] = Particles.VaFl3cf8ablKPZzq.CROWN.f_3236;
      }

      if (this.f_3404.m_7145(f_3740)) {
         this.f_3409[var1++] = Particles.VaFl3cf8ablKPZzq.LIGHTNING.f_3236;
      }

      if (this.f_3404.m_7145(f_3741)) {
         this.f_3409[var1++] = Particles.VaFl3cf8ablKPZzq.LINE.f_3236;
      }

      if (this.f_3404.m_7145(f_3742)) {
         this.f_3409[var1++] = Particles.VaFl3cf8ablKPZzq.RHOMBUS.f_3236;
      }

      if (this.f_3404.m_7145(f_3743)) {
         this.f_3409[var1++] = Particles.VaFl3cf8ablKPZzq.TRIANGLE.f_3236;
      }

      if (var1 == 0) {
         this.f_3409[var1++] = Particles.VaFl3cf8ablKPZzq.STAR.f_3236;
      }

      return this.f_3409[ThreadLocalRandom.current().nextInt(var1)];
   }

   private void m_1719(LivingEntity var1, boolean var2) {
      if (var1 != null && var1 != f_11537.player) {
         if (var1.isAlive() && !(var1.getHealth() <= 0.0F)) {
            for (Particles.bo8EXFtwSv4O39pW var4 : this.f_3411) {
               if (var4.f_3353.getId() == var1.getId()) {
                  if (var4.f_3357) {
                     return;
                  }

                  var4.m_1675(var1);
                  if (var2) {
                     var4.m_1677();
                  }

                  return;
               }
            }

            if (var2) {
               Particles.bo8EXFtwSv4O39pW var5 = new Particles.bo8EXFtwSv4O39pW(var1);
               var5.m_1677();
               this.f_3411.add(var5);
            }
         }
      }
   }

   private static Vec3 m_1720(Random var0) {
      return new Vec3(var0.nextDouble() - f_3666, var0.nextDouble() - f_3667, var0.nextDouble() - f_3668).normalize();
   }

   private Identifier m_1721() {
      List var1 = Class_ZaxOIoJW5RKgQbqm.m_5829();
      int var2 = Particles.VaFl3cf8ablKPZzq.f_3234.length + var1.size();
      if (var2 == 0) {
         return Particles.VaFl3cf8ablKPZzq.STAR.f_3236;
      }

      int var3 = ThreadLocalRandom.current().nextInt(var2);
      return var3 < Particles.VaFl3cf8ablKPZzq.f_3234.length
         ? Particles.VaFl3cf8ablKPZzq.f_3234[var3].f_3236
         : (Identifier)var1.get(var3 - Particles.VaFl3cf8ablKPZzq.f_3234.length);
   }

   public boolean m_1722() {
      return this.f_3406.m_8768();
   }

   private void m_1723(BufferBuilder var1, Matrix4f var2, float var3, float var4, float var5, float var6, float var7, Vector4f var8) {
      var1.addVertex(var2, var3, var4, var5).setUv(var6, var7).setColor(var8.x, var8.y, var8.z, var8.w);
   }

   private void m_1724(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null) {
         this.f_3419++;
         int var2 = this.f_3408.size() - Optimization.m_5843(3600);
         if (var2 > 0) {
            this.f_3408.subList(0, var2).clear();
         }

         if (this.f_3406.m_8768()) {
            Class_binHXWny7kagd8ju.m_6096();
            this.m_1685();
         }

         if (this.m_1726()) {
            this.m_1729();
         } else {
            if (this.f_3389.m_7145(f_3514)) {
               this.m_1727();
            }

            if (this.f_3389.m_7145(f_3515)) {
               this.m_1694();
            }

            Iterator var3 = this.f_3410.iterator();

            while (var3.hasNext()) {
               Particles.pQ7Ybsc06keXySFK var4 = (Particles.pQ7Ybsc06keXySFK)var3.next();
               var4.f_3361++;
               if (var4.m_1678()) {
                  this.m_1699(var4);
               } else {
                  var3.remove();
               }
            }
         }

         long var11 = System.currentTimeMillis();
         Vec3 var5 = f_11537.player.position();
         Vec3 var6 = f_11537.gameRenderer.mainCamera().position();
         double var7 = Optimization.m_5851(Double.POSITIVE_INFINITY);
         Iterator var9 = this.f_3408.iterator();

         while (var9.hasNext()) {
            Particles.aGUbKDRTs5PvAI8k var10 = (Particles.aGUbKDRTs5PvAI8k)var9.next();
            if (!var10.m_1669(var11) && !(var10.m_1659(var5) > f_3516) && !(var10.m_1659(var6) > var7)) {
               var10.m_1656();
            } else {
               var9.remove();
            }
         }
      } else {
         this.m_1697();
      }
   }

   private boolean m_1726() {
      return this.f_3386.m_7568(f_3513);
   }

   private void m_1727() {
      if (!(f_11537.player.getDeltaMovement().horizontalDistanceSqr() <= f_3521) && !f_11537.player.isShiftKeyDown()) {
         this.f_3418 = this.f_3418 + this.f_3391.m_8768() / f_3522;
         int var1 = (int)this.f_3418;
         this.f_3418 -= var1;
         if (var1 > 0) {
            double var2 = Math.toRadians(f_11537.player.getYRot() + f_3523);
            double var4 = Math.cos(var2) * f_3524;
            double var6 = Math.sin(var2) * f_3525;
            float var8 = this.f_3392.m_8768() * f_3526;
            float var9 = this.f_3393.m_8768();

            for (int var10 = 0; var10 < var1 && this.m_1688(); var10++) {
               Vec3 var11 = new Vec3(
                  f_11537.player.getX() - var4 + m_1691(f_3527, f_3528),
                  f_11537.player.getY() + f_3529 + Math.random() * (f_11537.player.getBbHeight() - f_3530),
                  f_11537.player.getZ() - var6 + m_1691(f_3531, f_3532)
               );
               Vec3 var12 = new Vec3(m_1691(f_3533, f_3534) * var8 * var9, m_1691(f_3535, f_3536) * var8 * f_3537 * var9, m_1691(f_3538, f_3539) * var8 * var9);
               this.m_1704(var11, var12, this.m_1687(), this.f_3395.m_8768() * f_3540, this.f_3394.m_8768() * f_3541, f_3542);
            }
         }
      } else {
         this.f_3418 = 0.0F;
      }
   }

   private Class_2ZaVm8TGDJ68TnJB[] m_1728(Class_2ZaVm8TGDJ68TnJB[] var1) {
      Class_2ZaVm8TGDJ68TnJB[] var2 = new Class_2ZaVm8TGDJ68TnJB[var1.length + 1];
      System.arraycopy(var1, 0, var2, 0, var1.length);
      var2[var1.length] = this.f_3384;
      return var2;
   }

   private void m_1729() {
      if (this.f_3400.m_7145(f_3517)) {
         this.m_1701();
      }

      if (this.f_3400.m_7145(f_3518) || this.f_3400.m_7145(f_3519)) {
         this.m_1735();
      }

      if (this.f_3400.m_7145(f_3520)) {
         this.m_1737();
      }

      Iterator var1 = this.f_3410.iterator();

      while (var1.hasNext()) {
         Particles.pQ7Ybsc06keXySFK var2 = (Particles.pQ7Ybsc06keXySFK)var1.next();
         var2.f_3361++;
         if (var2.m_1678()) {
            this.m_1709(var2);
         } else {
            var1.remove();
         }
      }
   }

   private void m_1735() {
      if ((this.f_3419 & 1) == 0) {
         boolean var1 = this.f_3400.m_7145(f_3688);
         boolean var2 = this.f_3400.m_7145(f_3689);
         int var3 = 0;

         for (Entity var5 : f_11537.level.entitiesForRendering()) {
            if (var3 >= 32 || !this.m_1688()) {
               break;
            }

            boolean var6 = var1 && var5 instanceof ThrowableProjectile || var2 && var5 instanceof AbstractArrow;
            if (var6 && !(var5.distanceToSqr(f_11537.player) > f_3690)) {
               Vec3 var7 = var5.getDeltaMovement();
               if (!(var7.length() < f_3691)) {
                  var3++;

                  for (int var8 = 0; var8 < 5 && this.m_1688(); var8++) {
                     float var9 = ThreadLocalRandom.current().nextFloat();
                     Vec3 var10 = var5.position();
                     Vec3 var11 = new Vec3(m_1691(-var9, var9) + var7.x, m_1691(-var9, var9) + var7.y, m_1691(-var9, var9) + var7.z).scale(f_3692);
                     float var12 = f_3693 + ThreadLocalRandom.current().nextFloat() * f_3694;
                     this.m_1700(
                        var10,
                        var11,
                        this.m_1739(),
                        var12 * 2.0F,
                        1.0F,
                        f_3695,
                        Particles.UFLKbKZRjugLFQeB.ZENITH_FLOAT,
                        f_3696,
                        this.m_1718(),
                        this.f_3405.m_8768()
                     );
                  }
               }
            }
         }
      }
   }

   private int m_1736(BufferBuilder var1, PoseStack var2, double var3, double var5, double var7, float var9, float var10, float var11, float var12, int var13) {
      Vector4f var14 = Class_BftdentXEtGbugJw.m_2298(var13);
      float var15 = var9 * f_3768;
      if (var11 != this.f_3370) {
         this.f_3367.rotationY(-var11 * f_3769);
         this.f_3370 = var11;
      }

      if (var12 != this.f_3371) {
         this.f_3368.rotationX(var12 * f_3770);
         this.f_3371 = var12;
      }

      Matrix4f var16 = this.f_3366.set(var2.last().pose()).translate((float)var3, (float)var5, (float)var7).rotate(this.f_3367).rotate(this.f_3368);
      if (var10 != 0.0F) {
         var16.rotate(this.f_3369.rotationZ(var10 * f_3771));
      }

      this.m_1723(var1, var16, -var15, -var15, 0.0F, 0.0F, 0.0F, var14);
      this.m_1723(var1, var16, -var15, var15, 0.0F, 0.0F, 1.0F, var14);
      this.m_1723(var1, var16, var15, var15, 0.0F, 1.0F, 1.0F, var14);
      this.m_1723(var1, var16, var15, -var15, 0.0F, 1.0F, 0.0F, var14);
      return 4;
   }

   private void m_1737() {
      if (this.f_3419 % 15 == 0) {
         Vec3 var1 = f_11537.gameRenderer.mainCamera().position();
         int var2 = Math.max(1, Math.round(this.f_3403.m_8768())) * 10;

         for (int var3 = 0; var3 < var2 && this.m_1688(); var3++) {
            double var4 = 1.0 + ThreadLocalRandom.current().nextFloat() * f_3697;
            double var6 = Math.toRadians(ThreadLocalRandom.current().nextFloat() * f_3698);
            double var8 = var1.x - Math.sin(var6) * var4;
            double var10 = var1.z + Math.cos(var6) * var4;
            double var12 = var1.y + m_1691(f_3699, f_3700);
            Vec3 var14 = new Vec3(m_1691(f_3701, f_3702), m_1691(f_3703, 1.0), m_1691(f_3704, f_3705)).scale(f_3706);
            float var15 = f_3707 + ThreadLocalRandom.current().nextFloat() * f_3708;
            this.m_1700(
               new Vec3(var8, var12, var10),
               var14,
               this.m_1739(),
               var15 * 2.0F,
               f_3709,
               f_3710,
               Particles.UFLKbKZRjugLFQeB.ZENITH_FLOAT,
               2.0F,
               this.m_1718(),
               this.f_3405.m_8768()
            );
         }
      }
   }

   private void m_1738(Class_TZhU50s8XmBQCMP5 var1, Identifier var2, List<Particles.aGUbKDRTs5PvAI8k> var3, boolean var4) {
      float var5 = f_11537.gameRenderer.mainCamera().yRot();
      float var6 = f_11537.gameRenderer.mainCamera().xRot();
      BufferBuilder var7 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
      int var8 = 0;

      for (Particles.aGUbKDRTs5PvAI8k var10 : var3) {
         var8 += this.m_1736(
            var7,
            var1.m_5006(),
            var10.f_3246,
            var10.f_3247,
            var10.f_3248,
            var4 ? var10.f_3250 : var10.f_3249,
            var4 ? 0.0F : var10.f_3267,
            var5,
            var6,
            var4 ? var10.f_3252 : var10.f_3251
         );
      }

      this.m_1716(var7, var2, var8);
   }

   private int m_1739() {
      return this.f_3401.m_7568(f_3731)
         ? Color.HSBtoRGB(ThreadLocalRandom.current().nextFloat(), 1.0F, 1.0F) | f_3732
         : Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
   }

   private enum UFLKbKZRjugLFQeB {
      NORMAL,
      COMET,
      SWIRL,
      SPARK,
      ZENITH,
      ZENITH_FLOAT,
      MODEL;
   }

   private enum VaFl3cf8ablKPZzq {
      CROWN("crown.png"),
      CUBE_BLAST("cubeblast1.png"),
      DOLLAR("dollar.png"),
      HEART("heart.png"),
      LIGHTNING("lightning.png"),
      LINE("line.png"),
      RHOMBUS("rhombus.png"),
      SNOWFLAKE("snowflake.png"),
      STAR("star.png"),
      STAR_ALT("star1.png"),
      TRIANGLE("triangle.png"),
      GLOW("glow.png"),
      ORB("dashbloomsample.png");

      public static final Particles.VaFl3cf8ablKPZzq[] f_3234 = new Particles.VaFl3cf8ablKPZzq[]{
         CROWN, CUBE_BLAST, DOLLAR, HEART, LIGHTNING, LINE, RHOMBUS, SNOWFLAKE, STAR, STAR_ALT, TRIANGLE
      };
      public static final Identifier f_3235 = Identifier.fromNamespaceAndPath("dimasik", "textures/world/dashbloomsample.png");
      public final Identifier f_3236;

      VaFl3cf8ablKPZzq(String var3) {
         this.f_3236 = Identifier.fromNamespaceAndPath("dimasik", "textures/world/" + var3);
      }
   }

   private static final class aGUbKDRTs5PvAI8k {
      public double f_3237;
      public double f_3238;
      public double f_3239;
      public double f_3240;
      public double f_3241;
      public double f_3242;
      public double f_3243;
      public double f_3244;
      public double f_3245;
      public double f_3246;
      public double f_3247;
      public double f_3248;
      public float f_3249;
      public float f_3250;
      public int f_3251;
      public int f_3252;
      public final double f_3253;
      public final double f_3254;
      public final double f_3255;
      public final int f_3256;
      public final float f_3257;
      public final float f_3258;
      public final long f_3259 = System.currentTimeMillis();
      public final long f_3260;
      public final float f_3261;
      public final Identifier f_3262;
      public final Particles.UFLKbKZRjugLFQeB f_3263;
      public final float f_3264;
      public final boolean f_3265;
      public final float f_3266;
      public float f_3267;
      public double f_3268;
      public float f_3269;
      public boolean f_3270;
      public static final float f_3271 = (float) (Math.PI * 2);
      public static final float f_3272 = 360.0F;
      public static final float f_3273 = 1.95F;
      public static final float f_3274 = 0.42F;
      public static final float f_3275 = 0.18F;
      public static final double f_3276 = 0.004;
      public static final double f_3277 = 0.2;
      public static final double f_3278 = 0.2;
      public static final double f_3279 = 0.2;
      public static final double f_3280 = 0.012;
      public static final double f_3281 = 0.28;
      public static final double f_3282 = 0.035;
      public static final double f_3283 = 0.88;
      public static final double f_3284 = 0.88;
      public static final float f_3285 = 0.012F;
      public static final double f_3286 = 1.7;
      public static final double f_3287 = 0.0011;
      public static final double f_3288 = 1.9;
      public static final double f_3289 = 0.0011;
      public static final double f_3290 = 0.0012;
      public static final double f_3291 = 0.14;
      public static final double f_3292 = 0.0018;
      public static final double f_3293 = 0.02;
      public static final double f_3294 = 9.0E-4;
      public static final double f_3295 = 0.02;
      public static final double f_3296 = 9.0E-4;
      public static final double f_3297 = 0.0065;
      public static final double f_3298 = 0.15;
      public static final double f_3299 = 0.15;
      public static final double f_3300 = 0.15;
      public static final double f_3301 = 0.02;
      public static final double f_3302 = 0.22;
      public static final double f_3303 = 0.04;
      public static final double f_3304 = 0.75;
      public static final double f_3305 = 0.75;
      public static final double f_3306 = 0.008;
      public static final double f_3307 = 0.04;
      public static final double f_3308 = 0.25;
      public static final double f_3309 = 0.08;
      public static final double f_3310 = 0.5;
      public static final double f_3311 = 1.0E-7;
      public static final double f_3312 = 1.0E-7;
      public static final double f_3313 = 1.0E-7;
      public static final double f_3314 = 0.01;
      public static final double f_3315 = 0.2;
      public static final float f_3316 = 0.9F;
      public static final double f_3317 = 0.055;
      public static final double f_3318 = 0.7;
      public static final double f_3319 = 0.7;
      public static final float f_3320 = 0.9F;
      public static final float f_3321 = 0.9F;
      public static final float f_3322 = 0.9F;
      public static final double f_3323 = 0.18;
      public static final float f_3324 = 450.0F;
      public static final float f_3325 = 50.0F;
      public static final float f_3326 = 3.0F;
      public static final double f_3327 = 0.0014;
      public static final float f_3328 = 0.85F;
      public static final float f_3329 = 0.25F;
      public static final double f_3330 = Math.PI;
      public static final float f_3331 = 0.9F;
      public static final float f_3332 = 0.15F;
      public static final double f_3333 = 0.02;
      public static final float f_3334 = 1.05F;
      public static final float f_3335 = 0.45F;
      public static final float f_3336 = 0.95F;
      public static final float f_3337 = 0.25F;
      public static final float f_3338 = 1.25F;
      public static final float f_3339 = 1.15F;
      public static final float f_3340 = 1.1F;
      public static final float f_3341 = 55.0F;
      public static final float f_3342 = 150.0F;
      public static final float f_3343 = 180.0F;
      public static final float f_3344 = 250.0F;
      public static final float f_3345 = 0.82F;
      public static final float f_3346 = 0.18F;
      public static final double f_3347 = 0.05;
      public static final long f_3348 = 250L;
      public static final float f_3349 = 0.5F;
      public static final float f_3350 = -2.0F;
      public static final double f_3351 = 2.0;
      public static final float f_3352 = 0.5F;

      public void m_1656() {
         this.f_3240 = this.f_3237;
         this.f_3241 = this.f_3238;
         this.f_3242 = this.f_3239;
         switch (this.f_3263) {
            case COMET:
               this.m_1667();
               break;
            case SWIRL:
               this.m_1671();
               break;
            case SPARK:
               this.m_1670();
               break;
            case ZENITH:
               this.m_1662();
               break;
            case ZENITH_FLOAT:
               this.m_1666();
               break;
            case MODEL:
               this.m_1673();
               break;
            default:
               this.m_1661();
         }
      }

      public void m_1657(long var1) {
         float var3 = this.m_1668(var1);
         float var4 = m_1674(var3);
         this.f_3237 = this.f_3253 + this.f_3243 * var4;
         this.f_3238 = this.f_3254 + this.f_3244 * var4 - f_3323 * var3 * var3;
         this.f_3239 = this.f_3255 + this.f_3245 * var4;
      }

      public float m_1658(float var1) {
         return var1 < f_3349 ? 2.0F * var1 * var1 : 1.0F - (float)Math.pow(f_3350 * var1 + 2.0F, f_3351) * f_3352;
      }

      public double m_1659(Vec3 var1) {
         double var2 = this.f_3237 - var1.x;
         double var4 = this.f_3238 - var1.y;
         double var6 = this.f_3239 - var1.z;
         return var2 * var2 + var4 * var4 + var6 * var6;
      }

      public float m_1660(long var1) {
         if (this.f_3263 == Particles.UFLKbKZRjugLFQeB.MODEL) {
            return (1.0F - m_1674(this.m_1672(var1))) * this.f_3258;
         }

         long var3 = var1 - this.f_3259;
         float var5 = this.f_3263 != Particles.UFLKbKZRjugLFQeB.COMET && this.f_3263 != Particles.UFLKbKZRjugLFQeB.SPARK ? f_3342 : f_3341;
         float var6 = this.f_3263 == Particles.UFLKbKZRjugLFQeB.SPARK ? f_3343 : f_3344;
         float var7 = this.m_1658(Mth.clamp((float)var3 / var5, 0.0F, 1.0F));
         float var8 = 1.0F - this.m_1658(Mth.clamp((float)(var3 - this.f_3260) / var6, 0.0F, 1.0F));
         float var9 = this.f_3263 == Particles.UFLKbKZRjugLFQeB.SPARK ? f_3345 + f_3346 * (float)Math.sin((var1 - this.f_3259) * f_3347 + this.f_3266) : 1.0F;
         return var7 * var8 * var9;
      }

      public void m_1661() {
         this.f_3244 = this.f_3244 - f_3276;
         this.f_3237 = this.f_3237 + this.f_3243;
         this.f_3238 = this.f_3238 + this.f_3244;
         this.f_3239 = this.f_3239 + this.f_3245;
         if (this.f_3244 <= 0.0 && this.m_1664(this.f_3237, this.f_3238 - this.f_3257 * f_3277, this.f_3239)) {
            double var1 = Math.abs(this.f_3244);
            this.f_3238 = Math.floor(this.f_3238 - this.f_3257 * f_3278) + 1.0 + this.f_3257 * f_3279;
            this.f_3244 = var1 > f_3280 ? Math.min(var1 * f_3281, f_3282) : 0.0;
            this.f_3243 = this.f_3243 * f_3283;
            this.f_3245 = this.f_3245 * f_3284;
         }

         this.f_3243 = this.f_3243 * this.f_3261;
         this.f_3244 = this.f_3244 * this.f_3261;
         this.f_3245 = this.f_3245 * this.f_3261;
         this.f_3267 = this.f_3267 + this.f_3264;
      }

      public void m_1662() {
         if (!this.f_3270 && Class_NzJrN63M7QBpmAbi.f_11537.level != null) {
            this.f_3244 = this.f_3244 - f_3306;
            double var1 = Math.max(f_3307, this.f_3257 * f_3308);
            double var3 = Math.max(f_3309, this.f_3257 * f_3310);
            AABB var5 = new AABB(this.f_3237 - var1, this.f_3238, this.f_3239 - var1, this.f_3237 + var1, this.f_3238 + var3, this.f_3239 + var1);
            Vec3 var6 = new Vec3(this.f_3243, this.f_3244, this.f_3245);
            Vec3 var7 = Entity.collideBoundingBox((Entity)null, var6, var5, Class_NzJrN63M7QBpmAbi.f_11537.level, List.of());
            this.f_3237 = this.f_3237 + var7.x;
            this.f_3238 = this.f_3238 + var7.y;
            this.f_3239 = this.f_3239 + var7.z;
            this.f_3268 = Math.max(this.f_3268, this.f_3238);
            boolean var8 = Math.abs(var6.y - var7.y) > f_3311;
            boolean var9 = Math.abs(var6.x - var7.x) > f_3312;
            boolean var10 = Math.abs(var6.z - var7.z) > f_3313;
            if (var8) {
               if (var6.y < 0.0) {
                  double var11 = Math.sqrt(Math.max(this.f_3268 - this.f_3238, f_3314)) * f_3315 * this.f_3269;
                  this.f_3269 = this.f_3269 * f_3316;
                  if (!(var11 > f_3317)) {
                     this.f_3243 = 0.0;
                     this.f_3244 = 0.0;
                     this.f_3245 = 0.0;
                     this.f_3270 = true;
                     this.f_3267 = this.f_3267 + this.f_3264;
                     return;
                  }

                  this.f_3244 = var11;
                  this.f_3243 = this.f_3243 * f_3318;
                  this.f_3245 = this.f_3245 * f_3319;
               } else {
                  this.f_3244 = -Math.abs(var6.y) * this.f_3269;
                  this.f_3269 = this.f_3269 * f_3320;
               }
            }

            if (var9) {
               this.f_3243 = -var6.x * this.f_3269;
               this.f_3269 = this.f_3269 * f_3321;
            }

            if (var10) {
               this.f_3245 = -var6.z * this.f_3269;
               this.f_3269 = this.f_3269 * f_3322;
            }

            this.f_3243 = this.f_3243 * this.f_3261;
            this.f_3244 = this.f_3244 * this.f_3261;
            this.f_3245 = this.f_3245 * this.f_3261;
            this.f_3267 = this.f_3267 + this.f_3264;
         } else {
            this.f_3267 = this.f_3267 + this.f_3264;
         }
      }

      public float m_1663(float var1, long var2) {
         return switch (this.f_3263) {
            case COMET -> f_3328 + f_3329 * (float)Math.sin(var1 * f_3330);
            case SWIRL -> f_3331 + f_3332 * (float)Math.sin((var2 - this.f_3259) * f_3333 + this.f_3266);
            case SPARK -> f_3334 - f_3335 * var1;
            case ZENITH -> 1.0F;
            case ZENITH_FLOAT -> 1.0F;
            case MODEL -> f_3336 + this.m_1672(var2) * f_3337;
            default -> 1.0F;
         };
      }

      public boolean m_1664(double var1, double var3, double var5) {
         if (Class_NzJrN63M7QBpmAbi.f_11537.level == null) {
            return false;
         }

         BlockPos var7 = BlockPos.containing(var1, var3, var5);
         return Class_NzJrN63M7QBpmAbi.f_11537.level.getBlockState(var7).isCollisionShapeFullBlock(Class_NzJrN63M7QBpmAbi.f_11537.level, var7);
      }

      public float m_1665() {
         return switch (this.f_3263) {
            case COMET -> f_3338;
            case SWIRL -> f_3339;
            case SPARK -> f_3340;
            case ZENITH -> 1.0F;
            case ZENITH_FLOAT -> 1.0F;
            case MODEL -> 1.0F;
            default -> 1.0F;
         };
      }

      public void m_1666() {
         this.f_3244 = this.f_3244 - f_3327;
         this.f_3237 = this.f_3237 + this.f_3243;
         this.f_3238 = this.f_3238 + this.f_3244;
         this.f_3239 = this.f_3239 + this.f_3245;
         this.f_3243 = this.f_3243 * this.f_3261;
         this.f_3244 = this.f_3244 * this.f_3261;
         this.f_3245 = this.f_3245 * this.f_3261;
         this.f_3267 = this.f_3267 + this.f_3264;
      }

      public void m_1667() {
         float var1 = (float)(System.currentTimeMillis() - this.f_3259) * f_3285 + this.f_3266;
         this.f_3243 = this.f_3243 + Math.sin(var1 * f_3286) * f_3287;
         this.f_3245 = this.f_3245 + Math.cos(var1 * f_3288) * f_3289;
         this.f_3244 = this.f_3244 - f_3290;
         this.f_3237 = this.f_3237 + this.f_3243;
         this.f_3238 = this.f_3238 + this.f_3244;
         this.f_3239 = this.f_3239 + this.f_3245;
         this.f_3243 = this.f_3243 * this.f_3261;
         this.f_3244 = this.f_3244 * this.f_3261;
         this.f_3245 = this.f_3245 * this.f_3261;
         this.f_3267 = this.f_3267 + this.f_3264;
      }

      public float m_1668(long var1) {
         float var3 = Math.min(f_3324, Math.max(0.0F, (float)this.f_3260 - f_3325));
         float var4 = Math.max(1.0F, (float)this.f_3260 - var3);
         return Mth.clamp(((float)(var1 - this.f_3259) - var3) / var4, 0.0F, 1.0F);
      }

      public boolean m_1669(long var1) {
         return this.f_3263 == Particles.UFLKbKZRjugLFQeB.MODEL ? this.m_1672(var1) >= 1.0F : var1 - this.f_3259 > this.f_3260 + f_3348;
      }

      public void m_1670() {
         this.f_3244 = this.f_3244 - f_3297;
         this.f_3237 = this.f_3237 + this.f_3243;
         this.f_3238 = this.f_3238 + this.f_3244;
         this.f_3239 = this.f_3239 + this.f_3245;
         if (this.f_3244 <= 0.0 && this.m_1664(this.f_3237, this.f_3238 - this.f_3257 * f_3298, this.f_3239)) {
            double var1 = Math.abs(this.f_3244);
            this.f_3238 = Math.floor(this.f_3238 - this.f_3257 * f_3299) + 1.0 + this.f_3257 * f_3300;
            this.f_3244 = var1 > f_3301 ? Math.min(var1 * f_3302, f_3303) : 0.0;
            this.f_3243 = this.f_3243 * f_3304;
            this.f_3245 = this.f_3245 * f_3305;
         }

         this.f_3243 = this.f_3243 * this.f_3261;
         this.f_3244 = this.f_3244 * this.f_3261;
         this.f_3245 = this.f_3245 * this.f_3261;
         this.f_3267 = this.f_3267 + this.f_3264;
      }

      public aGUbKDRTs5PvAI8k(
         Vec3 var1, Vec3 var2, int var3, float var4, long var5, float var7, Identifier var8, Particles.UFLKbKZRjugLFQeB var9, float var10, boolean var11
      ) {
         this.f_3266 = ThreadLocalRandom.current().nextFloat() * f_3271;
         this.f_3267 = ThreadLocalRandom.current().nextFloat() * f_3272;
         this.f_3269 = f_3273;
         this.f_3253 = this.f_3237 = this.f_3240 = var1.x;
         this.f_3254 = this.f_3238 = this.f_3241 = var1.y;
         this.f_3255 = this.f_3239 = this.f_3242 = var1.z;
         this.f_3243 = var2.x;
         this.f_3244 = var2.y;
         this.f_3245 = var2.z;
         this.f_3256 = var3;
         this.f_3257 = var4;
         this.f_3258 = var9 == Particles.UFLKbKZRjugLFQeB.MODEL ? f_3274 + ThreadLocalRandom.current().nextFloat() * f_3275 : 1.0F;
         this.f_3260 = var5;
         this.f_3261 = var7;
         this.f_3262 = var8;
         this.f_3263 = var9;
         this.f_3264 = var10;
         this.f_3265 = var11;
         this.f_3268 = this.f_3238;
         if (var9 == Particles.UFLKbKZRjugLFQeB.MODEL) {
            this.f_3267 = 0.0F;
         }
      }

      public void m_1671() {
         double var1 = f_3291 * Math.signum(this.f_3264 == 0.0F ? 1.0F : this.f_3264);
         double var3 = Math.cos(var1);
         double var5 = Math.sin(var1);
         double var7 = this.f_3243 * var3 - this.f_3245 * var5;
         double var9 = this.f_3243 * var5 + this.f_3245 * var3;
         this.f_3243 = var7;
         this.f_3245 = var9;
         this.f_3244 = this.f_3244 - f_3292;
         this.f_3243 = this.f_3243 + Math.cos(this.f_3266 + this.f_3267 * f_3293) * f_3294;
         this.f_3245 = this.f_3245 + Math.sin(this.f_3266 + this.f_3267 * f_3295) * f_3296;
         this.f_3237 = this.f_3237 + this.f_3243;
         this.f_3238 = this.f_3238 + this.f_3244;
         this.f_3239 = this.f_3239 + this.f_3245;
         this.f_3243 = this.f_3243 * this.f_3261;
         this.f_3244 = this.f_3244 * this.f_3261;
         this.f_3245 = this.f_3245 * this.f_3261;
         this.f_3267 = this.f_3267 + this.f_3264;
      }

      public float m_1672(long var1) {
         return Mth.clamp((float)(var1 - this.f_3259) / (float)Math.max(1L, this.f_3260), 0.0F, 1.0F);
      }

      public void m_1673() {
         this.m_1657(System.currentTimeMillis());
      }

      public static float m_1674(float var0) {
         return var0 * var0 * (f_3326 - 2.0F * var0);
      }
   }

   private static final class bo8EXFtwSv4O39pW {
      public LivingEntity f_3353;
      public long f_3354 = System.currentTimeMillis();
      public long f_3355;
      public boolean f_3356;
      public boolean f_3357;
      public static final long f_3358 = 2500L;
      public static final long f_3359 = 2500L;

      public void m_1675(LivingEntity var1) {
         this.f_3353 = var1;
         this.f_3354 = System.currentTimeMillis();
         this.f_3355 = f_3359;
      }

      public boolean m_1676() {
         return this.f_3353 != null && System.currentTimeMillis() - this.f_3354 < this.f_3355;
      }

      public void m_1677() {
         this.f_3356 = true;
         this.f_3354 = System.currentTimeMillis();
      }

      public bo8EXFtwSv4O39pW(LivingEntity var1) {
         this.f_3355 = f_3358;
         this.f_3353 = var1;
      }
   }

   private static final class pQ7Ybsc06keXySFK {
      public final Entity f_3360;
      public int f_3361;
      public static final float f_3362 = 20.0F;

      public pQ7Ybsc06keXySFK(Entity var1) {
         this.f_3360 = var1;
      }

      public boolean m_1678() {
         return this.f_3361 < 20 && this.f_3360 != null && !this.f_3360.isRemoved();
      }

      public float m_1679() {
         return this.f_3361 / f_3362;
      }
   }
}
