package dev.dimasik.client.ui.screen;

import com.mojang.blaze3d.platform.Window;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.module.misc.ClientSounds;
import dev.dimasik.client.module.render.ClickGui;
import dev.dimasik.client.module.render.EntityESP;
import dev.dimasik.client.setting.Setting;
import dev.dimasik.client.system.Class_0p152hWffX3ippAf;
import dev.dimasik.client.system.Class_1gO7GkQ9aEvcObZ8;
import dev.dimasik.client.system.Class_2TFiP2yfi5iArGSw;
import dev.dimasik.client.system.Class_55WOGfS5cDac4HRi;
import dev.dimasik.client.system.Class_9LlsJl3SzHCxWd5g;
import dev.dimasik.client.system.Class_BPk0prpZnkzAPrbb;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_NzJrN63M7QBpmAbi;
import dev.dimasik.client.system.Class_S28VNLa83ybs05Nf;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_V7bm8pF2tjL9Evnq;
import dev.dimasik.client.system.Class_WhZ6MBDQaQZ0AZFd;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_eXr9Fra2ad3yFXY8;
import dev.dimasik.client.system.Class_fNfOCLAYY3BfMMDP;
import dev.dimasik.client.system.Class_fuGrtM7rHAJXPau4;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_oSOJGMYmM06Si32k;
import dev.dimasik.client.system.Class_p9MWnAhf4OARzZqV;
import dev.dimasik.client.system.Class_pWBPWEkbosJrpHg9;
import dev.dimasik.client.system.Class_q4EBgBLwGNBvADTN;
import dev.dimasik.client.system.Class_thRKDf0XD4Gy5SzG;
import dev.dimasik.client.system.Class_w8fCJQ5ZtH5lQbWc;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import lombok.Generated;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.CharacterEvent;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.network.chat.Component;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector4f;

public class Screen_8 extends Screen implements Class_NzJrN63M7QBpmAbi {
   public static final float f_29336 = 800.0F;
   public static final float f_29337 = 504.0F;
   private static final float f_29338 = 74.0F;
   private static final float f_29339 = 18.0F;
   private static final float f_29340 = 30.0F;
   private static final float f_29341 = 12.0F;
   private static final float f_29342 = 380.0F;
   private static final float f_29343 = 32.0F;
   private static final float f_29344 = 38.0F;
   private static final int f_29345 = 7;
   private static final float f_29346 = 20.0F;
   private static final float f_29347 = 14.0F;
   private static Category f_29348 = Category.COMBAT;
   private static final EnumMap<Category, Float> f_29349 = new EnumMap<>(Category.class);
   private final CopyOnWriteArrayList<Class_fNfOCLAYY3BfMMDP> f_29350 = new CopyOnWriteArrayList<>();
   private final ArrayList<Class_thRKDf0XD4Gy5SzG> f_29351 = new ArrayList<>();
   private final Class_pWBPWEkbosJrpHg9 f_29352 = new Class_pWBPWEkbosJrpHg9(this);
   private final Class_BPk0prpZnkzAPrbb f_29353 = new Class_BPk0prpZnkzAPrbb(this);
   private final Class_LsNSRvPKh5AwfAUe f_29354 = new Class_LsNSRvPKh5AwfAUe(this);
   private final Class_oSOJGMYmM06Si32k f_29355 = new Class_oSOJGMYmM06Si32k(this);
   private final Class_p9MWnAhf4OARzZqV f_29356 = new Class_p9MWnAhf4OARzZqV();
   private final Matrix4f f_29357 = new Matrix4f();
   private float f_29358;
   private float f_29359;
   private float f_29360;
   private final Class_9LlsJl3SzHCxWd5g f_29361 = new Class_9LlsJl3SzHCxWd5g(this);
   private final Class_q4EBgBLwGNBvADTN f_29362 = new Class_q4EBgBLwGNBvADTN();
   private final Class_1gO7GkQ9aEvcObZ8 f_29363 = new Class_1gO7GkQ9aEvcObZ8();
   private final Class_w8fCJQ5ZtH5lQbWc f_29364;
   private final Class_w8fCJQ5ZtH5lQbWc f_29365;
   private final Class_w8fCJQ5ZtH5lQbWc f_29366;
   private final Class_w8fCJQ5ZtH5lQbWc f_29367;
   private final Class_w8fCJQ5ZtH5lQbWc f_29368;
   private final Class_w8fCJQ5ZtH5lQbWc f_29369;
   private final ArrayList<Screen_8.hIEliDDYS7gMkjrm> f_29370;
   private final ArrayList<Screen_8.Class_8ydBRPfMEhjxMx5r> f_29371;
   private final HashSet<Screen_8.DHdvIXtrgGu5ANfN> f_29372;
   private final HashMap<Screen_8.DHdvIXtrgGu5ANfN, Integer> f_29373;
   private final EnumMap<Category, Float> f_29374;
   private boolean f_29375;
   private boolean f_29376;
   private float f_29377;
   private float f_29378;
   private float f_29379;
   private float f_29380;
   private float f_29381;
   private float f_29382;
   private float f_29383;
   private float f_29384;
   private float f_29385;
   private float f_29386;
   private boolean f_29387;
   private float f_29388;
   private long f_29389;
   private long f_29390;
   private long f_29391;
   private GuiGraphicsExtractor f_29392;
   private String f_29393;
   private String f_29394;
   private String f_29395;
   private long f_29396;
   private boolean f_29397;
   private int f_29398;
   private boolean f_29399;
   private boolean f_29400;
   private float f_29401;
   private float f_29402;
   private float f_29403;
   private float f_29404;
   private String f_29405;
   private int f_29406;
   private float f_29407;
   private float f_29408;
   private float f_29409;
   private float f_29410;
   private boolean f_29411;
   private Class_thRKDf0XD4Gy5SzG f_29412;
   private Class_thRKDf0XD4Gy5SzG f_29413;
   private Class_thRKDf0XD4Gy5SzG f_29414;
   private Category f_29415;
   private boolean f_29416;
   private final Class_w8fCJQ5ZtH5lQbWc f_29417;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo.LeCf1iKfPVPci6zr> f_29418;
   private static final String f_29419 = "selfcode";
   private static final float f_29420 = 8.0F;
   private static final float f_29421 = 7.5F;
   private static final float f_29422 = 9.0F;
   private static final float f_29423 = 10.0F;
   private static final float f_29424 = 9.0F;
   private static final float f_29425 = 9.0F;
   private static final float f_29426 = 8.0F;
   private static final float f_29427 = 0.001F;
   private static final float f_29428 = 0.22F;
   private static final float f_29429 = 0.16F;
   private static final float f_29430 = 0.9F;
   private static final float f_29431 = 0.1F;
   private static final float f_29432 = 0.18F;
   private static final float f_29433 = 24.0F;
   private static final float f_29434 = 12.0F;
   private static final float f_29435 = -20.0F;
   private static final float f_29436 = 255.0F;
   private static final float f_29437 = 24.0F;
   private static final float f_29438 = 22.0F;
   private static final float f_29439 = 20.0F;
   private static final double f_29440 = 255.0;
   private static final float f_29441 = 20.0F;
   private static final float f_29442 = 20.0F;
   private static final float f_29443 = 20.0F;
   private static final float f_29444 = 20.0F;
   private static final float f_29445 = 20.0F;
   private static final float f_29446 = 0.016666668F;
   private static final float f_29447 = 1.0E9F;
   private static final float f_29448 = 0.05F;
   private static final float f_29449 = 10.0F;
   private static final float f_29450 = 20.0F;
   private static final float f_29451 = 10.0F;
   private static final float f_29452 = 60.0F;
   private static final float f_29453 = 20.0F;
   private static final float f_29454 = 0.016666668F;
   private static final float f_29455 = 1.0E9F;
   private static final float f_29456 = 0.05F;
   private static final float f_29457 = 10.0F;
   private static final float f_29458 = 0.05F;
   private static final float f_29459 = 0.25F;
   private static final float f_29460 = 74.0F;
   private static final float f_29461 = 38.0F;
   private static final float f_29462 = 0.5F;
   private static final float f_29463 = 8.0F;
   private static final float f_29464 = 38.0F;
   private static final float f_29465 = 0.5F;
   private static final float f_29466 = 14.0F;
   private static final float f_29467 = 74.0F;
   private static final float f_29468 = 74.0F;
   private static final float f_29469 = 0.88F;
   private static final float f_29470 = 0.12F;
   private static final double f_29471 = Math.PI;
   private static final float f_29472 = 0.025F;
   private static final float f_29473 = -18.0F;
   private static final float f_29474 = 18.0F;
   private static final float f_29475 = 24.0F;
   private static final float f_29476 = 0.001F;
   private static final float f_29477 = 8.0F;
   private static final float f_29478 = 8.0F;
   private static final String f_29479 = "Нет избранных. Нажми на звезду на карточке модуля.";
   private static final String f_29480 = "No favorites. Tap the star on a module card.";
   private static final float f_29481 = 26.0F;
   private static final float f_29482 = 74.0F;
   private static final float f_29483 = 18.0F;
   private static final float f_29484 = 74.0F;
   private static final float f_29485 = 12.0F;
   private static final float f_29486 = 12.0F;
   private static final float f_29487 = 74.0F;
   private static final float f_29488 = 3.0F;
   private static final float f_29489 = 1.5F;
   private static final float f_29490 = 74.0F;
   private static final float f_29491 = 0.001F;
   private static final float f_29492 = 74.0F;
   private static final float f_29493 = 20.0F;
   private static final float f_29494 = 0.28F;
   private static final double f_29495 = Math.PI;
   private static final float f_29496 = 18.0F;
   private static final double f_29497 = Math.PI;
   private static final float f_29498 = 250.0F;
   private static final float f_29499 = 26.0F;
   private static final float f_29500 = 12.0F;
   private static final float f_29501 = 0.001F;
   private static final float f_29502 = 0.98F;
   private static final float f_29503 = 74.0F;
   private static final float f_29504 = 42.0F;
   private static final float f_29505 = 14.0F;
   private static final double f_29506 = 30.0;
   private static final float f_29507 = 18.0F;
   private static final double f_29508 = 30.0;
   private static final float f_29509 = 4.0F;
   private static final float f_29510 = 4.0F;
   private static final float f_29511 = 8.0F;
   private static final float f_29512 = 8.0F;
   private static final float f_29513 = 14.0F;
   private static final double f_29514 = 30.0;
   private static final float f_29515 = 42.0F;
   private static final float f_29516 = 32.0F;
   private static final float f_29517 = 74.0F;
   private static final float f_29518 = 42.0F;
   private static final float f_29519 = 74.0F;
   private static final float f_29520 = 0.001F;
   private static final float f_29521 = 255.0F;
   private static final float f_29522 = 27.0F;
   private static final String f_29523 = "P";
   private static final float f_29524 = 22.0F;
   private static final String f_29525 = "Client";
   private static final float f_29526 = 41.0F;
   private static final String f_29527 = "Client";
   private static final float f_29528 = 49.0F;
   private static final String f_29529 = "/";
   private static final String f_29530 = "Избранное";
   private static final String f_29531 = "Favorites";
   private static final String f_29532 = "*";
   private static final float f_29533 = 17.0F;
   private static final float f_29534 = 37.0F;
   private static final double f_29535 = Math.PI;
   private static final float f_29536 = 20.0F;
   private static final float f_29537 = 0.24F;
   private static final float f_29538 = 0.1F;
   private static final float f_29539 = 0.45F;
   private static final String f_29540 = "P";
   private static final float f_29541 = 0.5F;
   private static final String f_29542 = "P";
   private static final float f_29543 = 0.5F;
   private static final float f_29544 = 14.5F;
   private static final float f_29545 = 10.0F;
   private static final float f_29546 = 60.0F;
   private static final float f_29547 = 20.0F;
   private static final float f_29548 = 0.99F;
   private static final float f_29549 = 20.0F;
   private static final float f_29550 = 180.0F;
   private static final float f_29551 = 40.0F;
   private static final float f_29552 = 20.0F;
   private static final float f_29553 = 283.0F;
   private static final float f_29554 = 40.0F;
   private static final float f_29555 = 0.01F;
   private static final float f_29556 = 20.0F;
   private static final float f_29557 = 64.0F;
   private static final float f_29558 = 30.0F;
   private static final float f_29559 = 120.0F;
   private static final String f_29560 = "ГЛАВНОЕ";
   private static final String f_29561 = "MAIN";
   private static final float f_29562 = 24.0F;
   private static final float f_29563 = 77.0F;
   private static final String f_29564 = "ОБЩЕЕ";
   private static final String f_29565 = "COMMON";
   private static final float f_29566 = 24.0F;
   private static final float f_29567 = 180.0F;
   private static final String f_29568 = "ПРОЧЕЕ";
   private static final String f_29569 = "OTHER";
   private static final float f_29570 = 24.0F;
   private static final float f_29571 = 283.0F;
   private static final float f_29572 = 14.0F;
   private static final float f_29573 = 30.0F;
   private static final float f_29574 = 8.0F;
   private static final float f_29575 = 0.01F;
   private static final float f_29576 = 42.0F;
   private static final float f_29577 = 54.0F;
   private static final float f_29578 = 30.0F;
   private static final float f_29579 = 46.0F;
   private static final float f_29580 = 7.0F;
   private static final float f_29581 = 24.0F;
   private static final float f_29582 = 8.0F;
   private static final float f_29583 = 0.999F;
   private static final float f_29584 = 0.016666668F;
   private static final float f_29585 = 1.0E9F;
   private static final float f_29586 = 0.05F;
   private static final float f_29587 = 14.0F;
   private static final float f_29588 = 0.05F;
   private static final float f_29589 = 18.0F;
   private static final float f_29590 = 255.0F;
   private static final float f_29591 = 0.18F;
   private static final float f_29592 = 0.08F;
   private static final float f_29593 = 0.001F;
   private static final float f_29594 = 30.0F;
   private static final float f_29595 = 9.0F;
   private static final float f_29596 = 0.13F;
   private static final float f_29597 = 30.0F;
   private static final float f_29598 = 22.0F;
   private static final float f_29599 = 9.0F;
   private static final double f_29600 = 255.0;
   private static final float f_29601 = 30.0F;
   private static final float f_29602 = 9.0F;
   private static final float f_29603 = 30.0F;
   private static final float f_29604 = 9.0F;
   private static final String f_29605 = "t";
   private static final float f_29606 = 11.0F;
   private static final float f_29607 = 9.0F;
   private static final String f_29608 = "CTRL + F";
   private static final float f_29609 = 22.0F;
   private static final float f_29610 = 7.0F;
   private static final float f_29611 = 5.0F;
   private static final float f_29612 = 10.0F;
   private static final String f_29613 = "@";
   private static final float f_29614 = 8.0F;
   private static final float f_29615 = 46.0F;
   private static final float f_29616 = 14.0F;
   private static final float f_29617 = 0.05F;
   private static final float f_29618 = 29.0F;
   private static final float f_29619 = 37.0F;
   private static final float f_29620 = 30.0F;
   private static final float f_29621 = 32.0F;
   private static final float f_29622 = 7.0F;
   private static final float f_29623 = 4.0F;
   private static final float f_29624 = 16.0F;
   private static final float f_29625 = 0.55F;
   private static final float f_29626 = 34.0F;
   private static final String f_29627 = "Поиск...";
   private static final float f_29628 = 8.0F;
   private static final float f_29629 = 8.0F;
   private static final float f_29630 = 22.0F;
   private static final float f_29631 = 0.38F;
   private static final float f_29632 = 0.62F;
   private static final float f_29633 = 0.5F;
   private static final float f_29634 = 0.5F;
   private static final double f_29635 = 1.0E9;
   private static final double f_29636 = 5.4;
   private static final float f_29637 = 7.5F;
   private static final float f_29638 = 1.1F;
   private static final float f_29639 = 15.0F;
   private static final float f_29640 = 0.55F;
   private static final float f_29641 = 0.999F;
   private static final float f_29642 = 0.18F;
   private static final float f_29643 = 0.045F;
   private static final float f_29644 = 0.01F;
   private static final float f_29645 = 11.15F;
   private static final float f_29646 = 0.85F;
   private static final float f_29647 = 0.5F;
   private static final float f_29648 = 2.2F;
   private static final float f_29649 = 255.0F;
   private static final float f_29650 = 0.5F;
   private static final float f_29651 = 0.001F;
   private static final float f_29652 = 255.0F;
   private static final float f_29653 = 0.9F;
   private static final float f_29654 = 0.1F;
   private static final float f_29655 = 255.0F;
   private static final float f_29656 = 24.0F;
   private static final float f_29657 = 255.0F;
   private static final float f_29658 = 255.0F;
   private static final float f_29659 = 255.0F;
   private static final float f_29660 = 22.0F;
   private static final float f_29661 = 20.0F;
   private static final float f_29662 = 20.0F;
   private static final float f_29663 = 255.0F;
   private static final float f_29664 = 0.2F;
   private static final float f_29665 = 20.0F;
   private static final float f_29666 = 255.0F;
   private static final String f_29667 = "t";
   private static final float f_29668 = 15.0F;
   private static final float f_29669 = 13.0F;
   private static final float f_29670 = 255.0F;
   private static final float f_29671 = 0.999F;
   private static final String f_29672 = "Открыть";
   private static final float f_29673 = 15.0F;
   private static final float f_29674 = 13.0F;
   private static final float f_29675 = 255.0F;
   private static final float f_29676 = 12.0F;
   private static final float f_29677 = 38.0F;
   private static final float f_29678 = 5.0F;
   private static final float f_29679 = 24.0F;
   private static final float f_29680 = 0.5F;
   private static final float f_29681 = 255.0F;
   private static final float f_29682 = 38.0F;
   private static final float f_29683 = 38.0F;
   private static final float f_29684 = 7.0F;
   private static final float f_29685 = 6.0F;
   private static final float f_29686 = 12.0F;
   private static final float f_29687 = 0.999F;
   private static final float f_29688 = 224.0F;
   private static final float f_29689 = 32.0F;
   private static final float f_29690 = 24.0F;
   private static final float f_29691 = 5.0F;
   private static final float f_29692 = 255.0F;
   private static final float f_29693 = 0.001F;
   private static final String f_29694 = "Результаты поиска";
   private static final float f_29695 = 35.0F;
   private static final float f_29696 = 12.0F;
   private static final float f_29697 = 255.0F;
   private static final float f_29698 = 0.001F;
   private static final String f_29699 = "Ничего не найдено";
   private static final float f_29700 = 14.0F;
   private static final float f_29701 = 8.0F;
   private static final float f_29702 = 13.0F;
   private static final float f_29703 = 4.0F;
   private static final float f_29704 = 255.0F;
   private static final float f_29705 = 32.0F;
   private static final float f_29706 = 32.0F;
   private static final float f_29707 = 224.0F;
   private static final float f_29708 = 10.0F;
   private static final float f_29709 = 8.0F;
   private static final float f_29710 = 3.0F;
   private static final float f_29711 = 0.001F;
   private static final String f_29712 = "Ничего не найдено";
   private static final float f_29713 = 14.0F;
   private static final float f_29714 = 5.0F;
   private static final float f_29715 = 13.0F;
   private static final float f_29716 = 4.0F;
   private static final float f_29717 = 255.0F;
   private static final float f_29718 = 0.55F;
   private static final float f_29719 = 0.45F;
   private static final float f_29720 = 3.0F;
   private static final float f_29721 = 32.0F;
   private static final float f_29722 = 0.16F;
   private static final float f_29723 = 0.025F;
   private static final float f_29724 = 0.01F;
   private static final float f_29725 = 3.0F;
   private static final float f_29726 = 5.0F;
   private static final float f_29727 = 32.0F;
   private static final float f_29728 = 32.0F;
   private static final float f_29729 = 224.0F;
   private static final float f_29730 = 0.24F;
   private static final float f_29731 = 0.035F;
   private static final float f_29732 = 0.01F;
   private static final float f_29733 = 10.0F;
   private static final float f_29734 = 8.0F;
   private static final float f_29735 = 0.9F;
   private static final float f_29736 = 20.0F;
   private static final double f_29737 = 27.0;
   private static final float f_29738 = 0.001F;
   private static final float f_29739 = 20.0F;
   private static final float f_29740 = 27.0F;
   private static final float f_29741 = 6.0F;
   private static final float f_29742 = 255.0F;
   private static final String f_29743 = "Module";
   private static final float f_29744 = 24.0F;
   private static final float f_29745 = 0.52F;
   private static final float f_29746 = 18.0F;
   private static final float f_29747 = 18.0F;
   private static final float f_29748 = 78.0F;
   private static final float f_29749 = 12.0F;
   private static final float f_29750 = 8.0F;
   private static final float f_29751 = 255.0F;
   private static final float f_29752 = 36.0F;
   private static final float f_29753 = 7.0F;
   private static final float f_29754 = 255.0F;
   private static final float f_29755 = 8.0F;
   private static final float f_29756 = 9.0F;
   private static final float f_29757 = 8.0F;
   private static final float f_29758 = 255.0F;
   private static final float f_29759 = 0.001F;
   private static final long f_29760 = 110000000L;
   private static final float f_29761 = 0.98F;
   private static final float f_29762 = 38.0F;
   private static final float f_29763 = 32.0F;
   private static final float f_29764 = 288.0F;
   private static final float f_29765 = 380.0F;
   private static final float f_29766 = 48.0F;
   private static final float f_29767 = 0.5F;
   private static final float f_29768 = 0.5F;
   private static final float f_29769 = 269.0F;
   private static final float f_29770 = 32.0F;
   private static final float f_29771 = 0.001F;
   private static final float f_29772 = 20.0F;
   private static final float f_29773 = 128.0F;
   private static final double f_29774 = 0.1;
   private static final float f_29775 = 74.0F;
   private static final float f_29776 = 108.0F;
   private static final float f_29777 = 62.0F;
   private static final float f_29778 = 204.0F;
   private static final float f_29779 = 170.0F;
   private static final float f_29780 = 920.0F;
   private static final float f_29781 = 800.0F;
   private static final float f_29782 = 584.0F;
   private static final float f_29783 = 504.0F;
   private static final float f_29784 = 32.0F;
   private static final float f_29785 = 32.0F;
   private static final float f_29786 = 0.1F;
   private static final float f_29787 = 0.5F;
   private static final float f_29788 = 0.5F;
   private static final float f_29789 = 255.0F;
   private static final float f_29790 = 28.0F;
   private static final float f_29791 = 16.0F;
   private static final float f_29792 = 74.0F;
   private static final double f_29793 = 12.0;
   private static final float f_29794 = 74.0F;
   private static final float f_29795 = 74.0F;
   private static final float f_29796 = 97.0F;
   private static final float f_29797 = 132.0F;
   private static final float f_29798 = 200.0F;
   private static final float f_29799 = 235.0F;
   private static final float f_29800 = 303.0F;
   private static final float f_29801 = 338.0F;
   private static final float f_29802 = 373.0F;
   private static final double f_29803 = 1.0E9;
   private static final double f_29804 = 0.045;
   private static final double f_29805 = 0.32;
   private static final float f_29806 = 38.0F;
   private static final float f_29807 = 18.0F;
   private static final double f_29808 = 30.0;
   private static final double f_29809 = 30.0;
   private static final float f_29810 = 18.0F;
   private static final double f_29811 = 255.0;
   private static final double f_29812 = 255.0;
   private static final float f_29813 = 15.0F;
   private static final float f_29814 = 15.0F;
   private static final float f_29815 = 8.0F;

   public boolean keyReleased(KeyEvent var1) {
      if (this.f_29355.m_7780()) {
         return true;
      }

      if (this.f_29361.m_1957()) {
         return this.f_29361.m_1967(var1.key());
      }

      for (Class_thRKDf0XD4Gy5SzG var3 : this.f_29351) {
         var3.m_2331(var1.key());
      }

      return true;
   }

   public void clearFocusedModule() {
      if (this.f_29413 != null) {
         this.f_29413.m_8911(false);
      }

      this.f_29413 = null;
   }

   private void renderGui() {
      this.f_29411 = false;
      Window var1 = f_11537.getWindow();
      if (!var1.isIconified() && var1.getScreenWidth() > 0 && var1.getScreenHeight() > 0) {
         DimasikClient.m_9057().m_9049().m_2801().m_3442().m_8280();
         Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
         Class_Ssh31B3ljfKeWsvS.m_4830();
         this.f_29369.m_9283(this.f_29413 != null ? 1.0F : 0.0F);
         if (this.f_29413 == null && this.f_29369.m_9288() < f_29427) {
            this.f_29414 = null;
         }

         this.f_29363
            .m_848(0.0F, 1.0F, this.f_29375 ? f_29428 : f_29429, Class_55WOGfS5cDac4HRi.f_2285, f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true));

         for (Category var5 : Category.values()) {
            var5.m_8689().m_9283(var5 == this.f_29415 ? 1.0F : 0.0F);
         }

         float var41 = Math.clamp(this.f_29363.m_845(), 0.0F, 1.0F);
         float var42 = this.f_29375 ? 0.0F : 1.0F - var41;
         float var43 = this.f_29377;
         float var44 = this.f_29378;
         boolean var6 = this.f_29415 == Category.COSMETICS;
         float var7 = var6
            ? 1.0F
            : (
               this.f_29375
                  ? f_29430 + f_29431 * (float)Class_eXr9Fra2ad3yFXY8.f_19121.m_4476(var41)
                  : 1.0F - f_29432 * (float)Class_eXr9Fra2ad3yFXY8.f_19099.m_4476(var42)
            );
         if (!var6) {
            this.f_29377 = this.f_29377 + f_29433 * var42 * var42;
            this.f_29378 = this.f_29378 + (this.f_29375 ? f_29434 * (1.0F - var41) : f_29435 * var42 * var42);
         }

         var7 *= this.getInterfaceScale();
         Class_FvJXUGWpZo3zYBW4.m_2692(this.f_29377 - this.guiLeftInset(), this.f_29378, this.totalGuiWidth(), this.f_29380, var7);
         this.f_29357.set(Class_Ssh31B3ljfKeWsvS.m_4853());
         this.f_29358 = this.f_29377;
         this.f_29359 = this.f_29378;
         this.f_29360 = var41;
         Class_Ssh31B3ljfKeWsvS.m_4864(f_29436 * var41);
         float var8 = this.f_29379;
         if (!var6) {
            Class_Ssh31B3ljfKeWsvS.m_4859(this.f_29377, this.f_29378, var8, this.f_29380, f_29437, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SHADOW));
            if (Class_WhZ6MBDQaQZ0AZFd.m_5485() > 0) {
               Class_Ssh31B3ljfKeWsvS.m_4858(
                  this.f_29377, this.f_29378, var8, this.f_29380, f_29438, f_29439, Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_29440)
               );
            }

            Class_Ssh31B3ljfKeWsvS.m_4870(
               this.f_29377,
               this.f_29378,
               var8,
               this.f_29380,
               new Vector4f(f_29441, f_29442, f_29443, f_29444),
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.BACKGROUND)
            );
         }

         if (this.f_29361.m_1957()) {
            this.renderCategorySidebar();
            this.renderProfileBlock();
            this.f_29361.m_1969(this.f_29392, this.f_29381, this.f_29382, f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true));
            DimasikClient.m_9057().m_9049().m_2801().m_3442().m_8282(this.f_29377, this.f_29378, this.f_29379, this.f_29380, f_29445);
            Class_Ssh31B3ljfKeWsvS.m_4844();
            Class_FvJXUGWpZo3zYBW4.m_2694(this.f_29377 - this.guiLeftInset(), this.f_29378, this.totalGuiWidth(), this.f_29380, var7);
            this.f_29377 = var43;
            this.f_29378 = var44;
         } else if (this.f_29415 == Category.COSMETICS) {
            long var46 = System.nanoTime();
            float var11 = this.f_29389 == 0L ? f_29446 : Math.clamp((float)(var46 - this.f_29389) / f_29447, 0.0F, f_29448);
            this.f_29389 = var46;
            float var47 = 1.0F - (float)Math.exp(-var11 * f_29449);
            this.f_29383 = this.f_29383 + (this.f_29384 - this.f_29383) * var47;
            this.f_29353.m_2199(this.f_29392, this.f_29381, this.f_29382, this.f_29383);
            this.renderProfileBlock();
            this.renderLayoutAccent();
            this.f_29386 = this.f_29353.m_2194();
            float var48 = this.getMinScroll();
            this.f_29384 = Math.clamp(this.f_29384, var48, 0.0F);
            this.f_29383 = Math.clamp(this.f_29383, var48, 0.0F);
            Class_Ssh31B3ljfKeWsvS.m_4844();
            Class_FvJXUGWpZo3zYBW4.m_2694(this.f_29377 - this.guiLeftInset(), this.f_29378, this.totalGuiWidth(), this.f_29380, var7);
            this.f_29377 = var43;
            this.f_29378 = var44;
         } else {
            this.renderCategorySidebar();
            Class_Ssh31B3ljfKeWsvS.m_4854(
               this.f_29377 + this.getSidebarWidth(),
               this.f_29378,
               this.f_29379 - this.getSidebarWidth(),
               this.f_29380,
               1.0F,
               f_29450,
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE)
            );
            Class_Ssh31B3ljfKeWsvS.m_4817(
               this.f_29377 + this.getSidebarWidth() + f_29451,
               this.f_29378 + f_29452,
               this.f_29379 - this.getSidebarWidth() - f_29453,
               1.0F,
               0.0F,
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE)
            );
            this.renderBreadcrumb();
            this.renderProfileBlock();
            float var9 = this.getMinScroll();
            this.f_29384 = Math.clamp(this.f_29384, var9, 0.0F);
            long var10 = System.nanoTime();
            float var12 = this.f_29389 == 0L ? f_29454 : Math.clamp((float)(var10 - this.f_29389) / f_29455, 0.0F, f_29456);
            this.f_29389 = var10;
            float var13 = 1.0F - (float)Math.exp(-var12 * f_29457);
            this.f_29383 = this.f_29383 + (this.f_29384 - this.f_29383) * var13;
            if (Math.abs(this.f_29384 - this.f_29383) < f_29458) {
               this.f_29383 = this.f_29384;
            }

            if (Math.abs(this.f_29383 - this.f_29385) > f_29459) {
               this.closeSettingPopups();
            }

            this.f_29385 = this.f_29383;
            boolean var14 = !this.f_29416 && (this.f_29415 == Category.AUTOBUY || this.f_29415 == Category.COSMETICS || this.f_29415 == Category.THEMES);
            if (!var14) {
               Class_Ssh31B3ljfKeWsvS.m_4822(this.getModuleViewportX(), this.f_29378 + f_29460, this.getModuleViewportWidth(), this.getModuleViewportHeight());
            }

            int var15 = 0;
            int var16 = 0;
            float var17 = 0.0F;
            float var18 = 0.0F;
            float var19 = 0.0F;
            if (!this.f_29416 && this.f_29415 == Category.AUTOBUY) {
               this.f_29352.m_8088(this.f_29392, this.f_29381, this.f_29382, this.f_29383);
               this.f_29386 = this.f_29352.m_8095();
            } else if (!this.f_29416 && this.f_29415 == Category.COSMETICS) {
               this.f_29353.m_2199(this.f_29392, this.f_29381, this.f_29382, this.f_29383);
               this.f_29386 = this.f_29353.m_2194();
            } else if (!this.f_29416 && this.f_29415 == Category.THEMES) {
               this.f_29354.m_3829(this.f_29392, this.f_29381, this.f_29382, this.f_29383);
               this.f_29386 = this.f_29354.m_3841();
            } else {
               for (Class_thRKDf0XD4Gy5SzG var21 : this.f_29351) {
                  if (this.visibleInCurrentView(var21)) {
                     float var22 = 0.0F;
                     if (var15 % 2 != 0) {
                        var22 += (this.f_29379 - this.getSidebarWidth() - f_29461) * f_29462 + f_29463;
                     }

                     float var23 = var15 % 2 == 0 ? var18 : var19;
                     var21.m_2341((this.f_29379 - this.getSidebarWidth() - f_29464) * f_29465);
                     var21.m_8926(f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true));
                     float var24 = this.f_29377 + this.getSidebarWidth() + f_29466 + var22;
                     float var25 = this.f_29378 + var23 + f_29467 + this.f_29383;
                     float var26 = this.f_29378 + f_29468;
                     float var27 = var26 + this.getModuleViewportHeight();
                     boolean var28 = var25 + var21.m_2339() > var26 && var25 < var27;
                     float var29 = var28 ? this.getModuleEntrancePhase(var16++) : 1.0F;
                     float var30 = (float)Class_eXr9Fra2ad3yFXY8.f_19100.m_4476(var29);
                     float var31 = (float)Class_eXr9Fra2ad3yFXY8.f_19121.m_4476(var29);
                     float var32 = f_29469 + f_29470 * var31;
                     float var33 = (float)Math.sin(f_29471 * this.getLayoutReveal(var15));
                     var32 *= 1.0F - f_29472 * var33;
                     var21.m_2329(var24 + (var15 % 2 == 0 ? f_29473 : f_29474) * (1.0F - var30));
                     var21.m_2333(var25 + f_29475 * (1.0F - var30) + this.getLayoutOffset(var15));
                     float var34 = Class_Ssh31B3ljfKeWsvS.m_4821();
                     boolean var35 = var21 == this.f_29414 && this.f_29369.m_9288() > f_29476;
                     boolean var36 = !this.f_29375 && this.f_29414 != null && var21 != this.f_29414;
                     Matrix4f var37 = new Matrix4f(Class_Ssh31B3ljfKeWsvS.m_4853());

                     try {
                        Class_FvJXUGWpZo3zYBW4.m_2692(var21.m_2336(), var21.m_2338(), var21.m_2343(), var21.m_2339(), var32);
                        Class_Ssh31B3ljfKeWsvS.m_4864(!var35 && !var36 ? var34 * var30 * this.getLayoutContentAlpha(var15) : 0.0F);
                        var21.m_2337(this.f_29381, this.f_29382, f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true));
                     } finally {
                        Class_Ssh31B3ljfKeWsvS.m_4814(var37);
                        Class_Ssh31B3ljfKeWsvS.m_4864(var34);
                     }

                     if (var15 % 2 == 0) {
                        var18 += var21.m_2339() + f_29477;
                     } else {
                        var19 += var21.m_2339() + f_29478;
                     }

                     var15++;
                  }
               }
            }

            if (this.f_29416 && var15 == 0) {
               Class_Ssh31B3ljfKeWsvS.m_4866(
                  Class_y1y6QpONhWEUIdEB.m_9588(),
                  Class_0p152hWffX3ippAf.m_804(f_29479, f_29480),
                  this.f_29377 + this.getSidebarWidth() + f_29481,
                  this.f_29378 + f_29482 + f_29483,
                  13,
                  Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SUR_TEXT)
               );
            }

            if (!var14) {
               this.f_29386 = Math.max(var18, var19);
            }

            float var49 = this.getMinScroll();
            if (this.f_29412 != null && this.visibleInCurrentView(this.f_29412)) {
               float var50 = this.f_29412.m_2338() - this.f_29383;
               float var54 = this.f_29378 + f_29484 + f_29485 - var50;
               this.f_29384 = Math.clamp(var54, var49, 0.0F);
               this.f_29383 = this.f_29384;
               this.f_29412 = null;
            }

            this.f_29384 = Math.clamp(this.f_29384, var49, 0.0F);
            this.f_29383 = Math.clamp(this.f_29383, var49, 0.0F);
            if (this.f_29387) {
               this.updateScrollbar(this.f_29382);
            }

            if (!var14) {
               Class_Ssh31B3ljfKeWsvS.m_4830();
            }

            if (this.f_29415 != Category.COSMETICS && this.f_29386 > this.getModuleViewportHeight()) {
               float var51 = this.getScrollbarThumbHeight();
               float var55 = this.getModuleViewportHeight() - var51;
               float var58 = -this.f_29383 / Math.max(1.0F, this.f_29386 - this.getModuleViewportHeight());
               Class_Ssh31B3ljfKeWsvS.m_4817(
                  this.f_29377 + this.f_29379 - f_29486,
                  this.f_29378 + f_29487 + var55 * var58,
                  f_29488,
                  var51,
                  f_29489,
                  Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SCROLL)
               );
            }

            if (!var14) {
               Class_Ssh31B3ljfKeWsvS.m_4822(this.getModuleViewportX(), this.f_29378 + f_29490, this.getModuleViewportWidth(), this.getModuleViewportHeight());
            }

            for (Class_thRKDf0XD4Gy5SzG var56 : this.f_29351) {
               if (var14) {
                  break;
               }

               if (this.visibleInCurrentView(var56) && var56 != this.f_29413 && (this.f_29375 || this.f_29414 == null)) {
                  var56.m_2342(this.f_29381, this.f_29382, f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true));
               }
            }

            if (!var14) {
               Class_Ssh31B3ljfKeWsvS.m_4830();
            }

            for (Class_fNfOCLAYY3BfMMDP var57 : this.f_29350) {
               var57.m_2337(this.f_29381, this.f_29382, f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true));
            }

            if (this.f_29415 != Category.COSMETICS) {
               this.renderFavoritesButton();
            }

            this.renderModuleFocus();
            this.renderLayoutAccent();
            if (this.f_29414 != null && this.f_29369.m_9288() > f_29491) {
               Class_Ssh31B3ljfKeWsvS.m_4822(this.getModuleViewportX(), this.f_29378 + f_29492, this.getModuleViewportWidth(), this.getModuleViewportHeight());
               this.f_29414.m_2337(this.f_29381, this.f_29382, f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true));
               Class_Ssh31B3ljfKeWsvS.m_4830();
               this.f_29414.m_2342(this.f_29381, this.f_29382, f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true));
            }

            DimasikClient.m_9057().m_9049().m_2801().m_3442().m_8282(this.f_29377, this.f_29378, this.f_29379, this.f_29380, f_29493);
            if (this.f_29415 == Category.THEMES) {
               this.f_29354.m_3832(this.f_29392, this.f_29381, this.f_29382, this.f_29383);
            }

            if (this.f_29415 != Category.COSMETICS) {
               this.f_29407 = this.f_29377;
               this.f_29408 = this.f_29378;
               this.f_29409 = var7;
               this.f_29410 = var41;
               this.f_29411 = true;
               this.renderSearch();
            }

            Class_Ssh31B3ljfKeWsvS.m_4844();
            Class_FvJXUGWpZo3zYBW4.m_2694(this.f_29377 - this.guiLeftInset(), this.f_29378, this.totalGuiWidth(), this.f_29380, var7);
            this.f_29377 = var43;
            this.f_29378 = var44;
         }
      }
   }

   private void renderFavoritesButton() {
      this.f_29417.m_9283(this.f_29416 ? 1.0F : 0.0F);
      float var1 = this.favoritesButtonX();
      float var2 = this.f_29378 + f_29810;
      float var3 = this.f_29417.m_9288();
      int var4 = Class_BftdentXEtGbugJw.m_2302(
         Class_BftdentXEtGbugJw.m_2303(186, 190, 200, f_29811), Class_BftdentXEtGbugJw.m_2303(255, 210, 64, f_29812), var3
      );
      Class_Ssh31B3ljfKeWsvS.m_4835(var1 + f_29813, var2 + f_29814, f_29815, var4);
   }

   protected void init() {
      if (!this.f_29376) {
         ClientSounds.m_9463(ClientSounds.KG2FYhAQHwVAXDJG.OPEN);
      }

      this.f_29376 = true;
      this.f_29355.m_7789();
      if (this.f_29415 == Category.COSMETICS) {
         this.f_29415 = Category.COMBAT;
      }

      this.updateCoordinates();
      this.f_29361.m_1965();
      this.clearFocusedModule();
      this.f_29414 = null;
      this.f_29369.m_9281(0.0F);
      this.closeSettingPopups();
      this.f_29375 = true;
      this.restoreCategoryScroll();
      this.f_29391 = System.nanoTime();
      if (this.f_29415 == Category.THEMES) {
         this.f_29354.m_3836();
      }
   }

   private void renderSearch() {
      if (!this.f_29393.equals(this.f_29405)) {
         this.f_29406 = this.commonPrefixLength(this.f_29405, this.f_29393);
         this.f_29405 = this.f_29393;
         this.f_29367.m_9281(0.0F);
         this.f_29395 = this.f_29393.trim().toLowerCase(Locale.ROOT);
         this.f_29396 = System.nanoTime();
      }

      this.f_29364.m_9283(this.f_29399 ? 1.0F : 0.0F);
      this.f_29367.m_9283(1.0F);
      this.updateSearchResults();
      this.f_29365.m_9283(this.isSearchDropdownVisible() ? 1.0F : 0.0F);
      this.f_29366.m_9283(this.isSearchDropdownVisible() ? 1.0F : 0.0F);
      this.f_29368.m_9283(1.0F);
      if (this.f_29368.m_9288() >= f_29583) {
         this.f_29371.clear();
         this.f_29372.clear();
         this.f_29373.clear();
         this.f_29397 = false;
         this.f_29398 = 0;
      }

      long var1 = System.nanoTime();
      float var3 = this.f_29390 == 0L ? f_29584 : Math.clamp((float)(var1 - this.f_29390) / f_29585, 0.0F, f_29586);
      this.f_29390 = var1;
      this.f_29402 = Math.clamp(this.f_29402, 0.0F, this.getSearchMaxScroll());
      float var4 = 1.0F - (float)Math.exp(-var3 * f_29587);
      this.f_29401 = this.f_29401 + (this.f_29402 - this.f_29401) * var4;
      if (Math.abs(this.f_29402 - this.f_29401) < f_29588) {
         this.f_29401 = this.f_29402;
      }

      float var5 = Math.clamp(this.f_29364.m_9288(), 0.0F, 1.0F);
      float var6 = this.getSearchWidth();
      float var7 = this.searchX();
      float var8 = this.f_29378 + f_29589;
      float var9 = Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.BACKGROUND) / f_29590;
      int var10 = Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.BACKGROUND), var9 * (f_29591 + var5 * f_29592));
      if (var5 > f_29593) {
         Class_Ssh31B3ljfKeWsvS.m_4859(
            var7, var8, var6, f_29594, f_29595, Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN), f_29596 * var5)
         );
      }

      Class_Ssh31B3ljfKeWsvS.m_4858(var7, var8, var6, f_29597, f_29598, f_29599, Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_29600));
      Class_Ssh31B3ljfKeWsvS.m_4817(var7, var8, var6, f_29601, f_29602, var10);
      Class_Ssh31B3ljfKeWsvS.m_4854(
         var7,
         var8,
         var6,
         f_29603,
         1.0F,
         f_29604,
         Class_BftdentXEtGbugJw.m_2302(
            Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE), Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN), var5
         )
      );
      int var11 = Class_BftdentXEtGbugJw.m_2302(
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT), Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT), var5
      );
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9591(), f_29605, var7 + f_29606, var8 + f_29607, 12, var11);
      String var12 = f_29608;
      float var13 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var12, 9);
      float var14 = var7 + var6 - f_29609;
      float var15 = var14 - var13 - f_29610;
      int var16 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT);
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var12, var15 - f_29611, var8 + f_29612, 10, var16);
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9591(), f_29613, var14, var8 + f_29614, 13, var16);
      int var17 = this.f_29393.isEmpty()
         ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT)
         : Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT);
      float var18 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), this.f_29393, 12);
      float var19 = Math.max(0.0F, var15 - var7 - f_29615);
      float var20 = this.f_29393.isEmpty() ? 0.0F : Math.max(0.0F, var18 - var19);
      float var21 = 1.0F - (float)Math.exp(-var3 * f_29616);
      this.f_29403 = this.f_29403 + (var20 - this.f_29403) * var21;
      if (Math.abs(var20 - this.f_29403) < f_29617) {
         this.f_29403 = var20;
      }

      Class_Ssh31B3ljfKeWsvS.m_4822(var7 + f_29618, var8, Math.max(0.0F, var15 - var7 - f_29619), f_29620);
      if (this.f_29400 && !this.f_29393.isEmpty()) {
         float var22 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), this.f_29393, 12);
         Class_Ssh31B3ljfKeWsvS.m_4817(
            var7 + f_29621 - this.f_29403,
            var8 + f_29622,
            var22 + f_29623,
            f_29624,
            2.0F,
            Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN), f_29625)
         );
      }

      float var25 = var7 + f_29626 - this.f_29403;
      if (this.f_29393.isEmpty()) {
         Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), Class_0p152hWffX3ippAf.m_801(f_29627), var25, var8 + f_29628, 12, var17);
      } else {
         this.renderAnimatedSearchText(var25, var8 + f_29629, var17);
      }

      float var23 = var25 + var18 + 1.0F;
      if (!Float.isNaN(this.f_29404) && !(Math.abs(this.f_29404 - var23) > var6)) {
         this.f_29404 = this.f_29404 + (var23 - this.f_29404) * (1.0F - (float)Math.exp(-var3 * f_29630));
      } else {
         this.f_29404 = var23;
      }

      if (this.f_29399 && !this.f_29400) {
         float var24 = f_29631 + f_29632 * (f_29633 + f_29634 * (float)Math.sin(System.nanoTime() / f_29635 * f_29636));
         Class_Ssh31B3ljfKeWsvS.m_4817(
            this.f_29404,
            var8 + f_29637,
            f_29638,
            f_29639,
            f_29640,
            Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT), var24)
         );
      }

      Class_Ssh31B3ljfKeWsvS.m_4830();
   }

   public float getLayoutOffset(int var1) {
      float var2 = this.getLayoutReveal(var1);
      return f_29496 * (float)Math.sin(f_29497 * var2) * (1.0F - var2);
   }

   private void drawSearchTitle(float var1, float var2, int var3, float var4) {
      if (!(var4 <= f_29693)) {
         String var5 = Class_0p152hWffX3ippAf.m_801(f_29694) + var3;
         Class_Ssh31B3ljfKeWsvS.m_4866(
            Class_y1y6QpONhWEUIdEB.m_9588(),
            var5,
            var1 + f_29695,
            var2 + f_29696,
            12,
            Class_BftdentXEtGbugJw.m_2306(
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT),
               Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT) / f_29697 * var4
            )
         );
      }
   }

   public boolean isAutoBuyViewportHovered() {
      return Class_FvJXUGWpZo3zYBW4.m_2697(
         this.f_29381, this.f_29382, this.getModuleViewportX(), this.f_29378 + f_29503, this.getModuleViewportWidth(), this.getModuleViewportHeight()
      );
   }

   @Generated
   public CopyOnWriteArrayList<Class_fNfOCLAYY3BfMMDP> getBinds() {
      return this.f_29350;
   }

   public float getGuiScroll() {
      return this.f_29383;
   }

   private void drawSearchResultRow(Screen_8.hIEliDDYS7gMkjrm var1, float var2, float var3, float var4, float var5, boolean var6) {
      if (!(var5 <= f_29738)) {
         float var7 = var4 - f_29739;
         float var8 = var3 + 2.0F;
         float var9 = f_29740;
         if (var6) {
            Class_Ssh31B3ljfKeWsvS.m_4817(
               var2,
               var8,
               var7,
               var9,
               f_29741,
               Class_BftdentXEtGbugJw.m_2306(
                  Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SELECTED),
                  Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.SELECTED) / f_29742 * var5
               )
            );
         }

         Module var10 = var1.component().m_8923();
         String var11 = Class_0p152hWffX3ippAf.m_801(var10.m_793());
         String var12 = var1.setting() == null ? f_29743 : Class_0p152hWffX3ippAf.m_801(var1.setting().m_8764());
         float var13 = Math.max(f_29744, var7 * f_29745 - f_29746);
         var12 = this.fitSearchText(var12, var13, 11);
         float var14 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var12, 11);
         float var15 = var14 + f_29747;
         float var16 = Math.max(0.0F, var4 - var15 - f_29748);
         var11 = this.fitSearchText(var11, var16, 12);
         Class_Ssh31B3ljfKeWsvS.m_4860(var2 + 1.0F, var8 + 1.0F, var7 - 2.0F, var9 - 2.0F);
         Class_Ssh31B3ljfKeWsvS.m_4866(
            Class_y1y6QpONhWEUIdEB.m_9591(),
            var10.m_785().m_8688(),
            var2 + f_29749,
            var8 + f_29750,
            11,
            Class_BftdentXEtGbugJw.m_2306(
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN), Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.MAIN) / f_29751 * var5
            )
         );
         Class_y3cvEHXTSEF5dp8q var17 = var6 ? Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT : Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT;
         Class_Ssh31B3ljfKeWsvS.m_4866(
            Class_y1y6QpONhWEUIdEB.m_9588(),
            var11,
            var2 + f_29752,
            var8 + f_29753,
            12,
            Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(var17), Class_LsNSRvPKh5AwfAUe.m_3852(var17) / f_29754 * var5)
         );
         float var18 = var2 + var7 - var15 - f_29755;
         Class_y3cvEHXTSEF5dp8q var19 = var1.setting() == null ? Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT : Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT;
         Class_Ssh31B3ljfKeWsvS.m_4866(
            Class_y1y6QpONhWEUIdEB.m_9588(),
            var12,
            var18 + f_29756,
            var8 + f_29757,
            10,
            Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(var19), Class_LsNSRvPKh5AwfAUe.m_3852(var19) / f_29758 * var5)
         );
         Class_Ssh31B3ljfKeWsvS.m_4828();
      }
   }

   public boolean mouseDragged(MouseButtonEvent var1, double var2, double var4) {
      if (this.f_29355.m_7780()) {
         if (var1.button() == 0) {
            this.f_29355.m_7774(this.toGuiPosition(var1.x(), var1.y()).x);
         }

         return true;
      } else {
         return this.f_29361.m_1957() ? true : super.mouseDragged(var1, var2, var4);
      }
   }

   private float getSearchPanelY() {
      return this.f_29378 + (this.f_29380 - this.getSearchDropdownHeight()) * f_29768;
   }

   private boolean isExpandedLayout() {
      return this.areSettingsPinned() && !this.f_29361.m_1957();
   }

   private void updateSearchResults() {
      String var1 = this.f_29393.trim().toLowerCase(Locale.ROOT);
      if (var1.isEmpty()) {
         this.f_29394 = var1;
         if (this.f_29365.m_9288() <= f_29759) {
            this.f_29370.clear();
            this.f_29371.clear();
            this.f_29372.clear();
            this.f_29373.clear();
            this.f_29397 = false;
            this.f_29398 = 0;
         }
      } else if (!var1.equals(this.f_29395)) {
         this.f_29395 = var1;
         this.f_29396 = System.nanoTime();
      } else if (!var1.equals(this.f_29394)) {
         if (System.nanoTime() - this.f_29396 >= f_29760) {
            if (this.f_29394 == null || this.f_29394.isEmpty() || !(this.f_29368.m_9288() < f_29761)) {
               ArrayList<Screen_8.hIEliDDYS7gMkjrm> var2 = new ArrayList<>();

               for (Class_thRKDf0XD4Gy5SzG var4 : this.f_29351) {
                  Module var5 = var4.m_8923();
                  int var6 = this.searchScoreLocalized(var1, var5.m_793(), var5.m_794(), var5.m_785().m_8687());
                  if (var6 >= 0) {
                     var2.add(new Screen_8.hIEliDDYS7gMkjrm(var4, null, var6));
                  }

                  for (Setting var8 : var5.m_784()) {
                     int var9 = this.searchScoreLocalized(var1, var8.m_8764());
                     if (var9 >= 0) {
                        var2.add(new Screen_8.hIEliDDYS7gMkjrm(var4, var8, var9 - 5));
                     }
                  }
               }

               var2.sort(
                  Comparator.comparingInt(Screen_8.hIEliDDYS7gMkjrm::score)
                     .reversed()
                     .thenComparing(var0 -> var0.component().m_8923().m_793(), String.CASE_INSENSITIVE_ORDER)
                     .thenComparing(var0 -> var0.setting() == null ? "" : var0.setting().m_8764(), String.CASE_INSENSITIVE_ORDER)
               );
               HashMap var10 = new HashMap();

               for (Screen_8.hIEliDDYS7gMkjrm var13 : var2) {
                  var10.put(this.searchKey(var13), var13);
               }

               this.f_29398 = this.f_29370.size();
               this.f_29397 = this.f_29370.isEmpty() && !var2.isEmpty() && this.f_29394 != null && !this.f_29394.isEmpty();
               this.f_29371.clear();
               this.f_29372.clear();
               this.f_29373.clear();
               ArrayList var12 = new ArrayList();

               for (int var14 = 0; var14 < this.f_29370.size(); var14++) {
                  Screen_8.hIEliDDYS7gMkjrm var16 = this.f_29370.get(var14);
                  Screen_8.DHdvIXtrgGu5ANfN var18 = this.searchKey(var16);
                  Screen_8.hIEliDDYS7gMkjrm var20 = (Screen_8.hIEliDDYS7gMkjrm)var10.remove(var18);
                  if (var20 != null) {
                     this.f_29373.put(var18, var14);
                     var12.add(var20);
                  } else {
                     this.f_29371.add(new Screen_8.Class_8ydBRPfMEhjxMx5r(var16, var14));
                  }
               }

               for (Screen_8.hIEliDDYS7gMkjrm var17 : var2) {
                  Screen_8.DHdvIXtrgGu5ANfN var19 = this.searchKey(var17);
                  if (var10.remove(var19) != null) {
                     this.f_29372.add(var19);
                     var12.add(var17);
                  }
               }

               this.f_29370.clear();
               this.f_29370.addAll(var12);
               this.f_29394 = var1;
               if (this.f_29371.isEmpty() && this.f_29372.isEmpty() && !this.f_29397) {
                  this.f_29368.m_9281(1.0F);
                  this.f_29373.clear();
               } else {
                  this.f_29368.m_9281(0.0F);
               }

               this.f_29402 = 0.0F;
            }
         }
      }
   }

   public void renders(Class_bhRaN0YSSLQRYjPo.LeCf1iKfPVPci6zr var1) {
   }

   private void renderCategorySidebar() {
      float var1 = this.getSidebarWidth();
      Class_Ssh31B3ljfKeWsvS.m_4873(
         Class_y1y6QpONhWEUIdEB.m_9591(),
         Class_BftdentXEtGbugJw.m_2311(f_29540),
         this.f_29377 + var1 * f_29541 - Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9591(), f_29542, 30) * f_29543 + 2.0F,
         this.f_29378 + f_29544,
         30,
         -1
      );
      Class_Ssh31B3ljfKeWsvS.m_4817(
         this.f_29377 + f_29545, this.f_29378 + f_29546, var1 - f_29547, 1.0F, 0.0F, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE)
      );
      float var2 = this.getSidebarLabelAlpha();
      if (var2 < f_29548) {
         Class_Ssh31B3ljfKeWsvS.m_4817(
            this.f_29377 + f_29549, this.f_29378 + f_29550, var1 - f_29551, 1.0F, 0.0F, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.LINE)
         );
         Class_Ssh31B3ljfKeWsvS.m_4817(
            this.f_29377 + f_29552, this.f_29378 + f_29553, var1 - f_29554, 1.0F, 0.0F, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.LINE)
         );
      }

      float var3 = Class_Ssh31B3ljfKeWsvS.m_4821();
      if (var2 > f_29555) {
         Class_Ssh31B3ljfKeWsvS.m_4860(this.f_29377 + f_29556, this.f_29378 + f_29557, Math.max(0.0F, var1 - f_29558), this.f_29380 - f_29559);
         Class_Ssh31B3ljfKeWsvS.m_4864(var3 * var2);
         Class_Ssh31B3ljfKeWsvS.m_4866(
            Class_y1y6QpONhWEUIdEB.m_9588(),
            Class_0p152hWffX3ippAf.m_804(f_29560, f_29561),
            this.f_29377 + f_29562,
            this.f_29378 + f_29563,
            11,
            Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.CATEGORY_SURTEST)
         );
         Class_Ssh31B3ljfKeWsvS.m_4866(
            Class_y1y6QpONhWEUIdEB.m_9588(),
            Class_0p152hWffX3ippAf.m_804(f_29564, f_29565),
            this.f_29377 + f_29566,
            this.f_29378 + f_29567,
            11,
            Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.CATEGORY_SURTEST)
         );
         Class_Ssh31B3ljfKeWsvS.m_4866(
            Class_y1y6QpONhWEUIdEB.m_9588(),
            Class_0p152hWffX3ippAf.m_804(f_29568, f_29569),
            this.f_29377 + f_29570,
            this.f_29378 + f_29571,
            11,
            Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.CATEGORY_SURTEST)
         );
         Class_Ssh31B3ljfKeWsvS.m_4864(var3);
         Class_Ssh31B3ljfKeWsvS.m_4828();
      }

      for (Category var7 : Category.values()) {
         float var8 = this.categoryButtonY(var7);
         if (!Float.isNaN(var8)) {
            float var9 = var7.m_8689().m_9288();
            this.drawCategoryButton(this.f_29377 + f_29572, var8, this.categoryButtonWidth(), f_29573, f_29574, var9);
            if (var2 > f_29575) {
               Class_Ssh31B3ljfKeWsvS.m_4860(this.f_29377 + f_29576, var8, Math.max(0.0F, var1 - f_29577), f_29578);
               Class_Ssh31B3ljfKeWsvS.m_4864(var3 * var2);
               Class_Ssh31B3ljfKeWsvS.m_4866(
                  Class_y1y6QpONhWEUIdEB.m_9588(),
                  var7.m_8687(),
                  this.f_29377 + f_29579,
                  var8 + f_29580,
                  13,
                  Class_BftdentXEtGbugJw.m_2302(
                     Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DESELECT_CATEGORY_TEXT),
                     Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.CATEGORY_TEXT),
                     var9
                  )
               );
               Class_Ssh31B3ljfKeWsvS.m_4864(var3);
               Class_Ssh31B3ljfKeWsvS.m_4828();
            }

            Class_Ssh31B3ljfKeWsvS.m_4866(
               Class_y1y6QpONhWEUIdEB.m_9591(),
               var7.m_8688(),
               this.f_29377 + f_29581,
               var8 + f_29582,
               13,
               Class_BftdentXEtGbugJw.m_2302(
                  Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DESELECT_CATEGORY_TEXT),
                  Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN),
                  var9
               )
            );
         }
      }
   }

   public boolean isPauseScreen() {
      return false;
   }

   private void drawCategoryButton(float var1, float var2, float var3, float var4, float var5, float var6) {
      if (!(var6 <= f_29520)) {
         Class_Ssh31B3ljfKeWsvS.m_4817(
            var1,
            var2,
            var3,
            var4,
            var5,
            Class_BftdentXEtGbugJw.m_2306(
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SELECTED), Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.SELECTED) / f_29521 * var6
            )
         );
      }
   }

   private int searchScoreLocalized(String var1, String... var2) {
      return Class_S28VNLa83ybs05Nf.m_4679(var1, var2);
   }

   public boolean isSearchOverlayVisible() {
      return this.isSearchDropdownVisible() || this.f_29365.m_9288() > f_29501;
   }

   private float getSearchDropdownHeight() {
      return f_29769;
   }

   private void closeSettingPopups() {
      for (Class_thRKDf0XD4Gy5SzG var2 : this.f_29351) {
         var2.m_8914();
      }
   }

   private void renderLayoutAccent() {
      float var1 = this.f_29356.m_8037();
      if (!(var1 >= 1.0F)) {
         float var2 = (float)Math.sin(f_29535 * var1);
         Class_Ssh31B3ljfKeWsvS.m_4854(
            this.f_29377,
            this.f_29378,
            this.f_29379,
            this.f_29380,
            1.0F,
            f_29536,
            Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN), f_29537 * var2)
         );
         if (Class_WhZ6MBDQaQZ0AZFd.m_5485() > 0) {
            Class_Ssh31B3ljfKeWsvS.m_4824(this.f_29377, this.f_29378, this.f_29379, this.f_29380, var1, f_29538 * var2, f_29539);
         }
      }
   }

   public float getInterfaceScale() {
      float var1 = Math.min(
         (f_11537.getWindow().getScreenWidth() - f_29784) / this.totalGuiWidth(), (f_11537.getWindow().getScreenHeight() - f_29785) / this.f_29380
      );
      return Math.max(f_29786, Math.min(Class_WhZ6MBDQaQZ0AZFd.m_5487(), var1));
   }

   protected void extractBlurredBackground(GuiGraphicsExtractor var1) {
   }

   private float getSearchPanelX() {
      return this.f_29377 + (this.f_29379 - this.getSearchExpandedWidth()) * f_29767;
   }

   public float getSearchOverlayAlpha() {
      float var1 = Math.clamp(this.f_29365.m_9288(), 0.0F, 1.0F);
      return var1 > f_29502 ? 1.0F : var1;
   }

   private void renderProfileOverlay() {
      float var1 = this.f_29377;
      float var2 = this.f_29378;
      float var3 = Class_Ssh31B3ljfKeWsvS.m_4821();
      Matrix4f var4 = new Matrix4f(Class_Ssh31B3ljfKeWsvS.m_4853());
      this.f_29377 = this.f_29358;
      this.f_29378 = this.f_29359;
      Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f(this.f_29357));

      try {
         Class_Ssh31B3ljfKeWsvS.m_4864(f_29789 * this.f_29360);
         this.f_29355.m_7769(this.f_29381, this.f_29382);
      } finally {
         Class_Ssh31B3ljfKeWsvS.m_4864(var3);
         Class_Ssh31B3ljfKeWsvS.m_4814(var4);
         this.f_29377 = var1;
         this.f_29378 = var2;
      }
   }

   public void extractRenderState(GuiGraphicsExtractor var1, int var2, int var3, float var4) {
      this.f_29392 = var1;
      this.updateCoordinates();
      Vector2f var5 = this.toGuiPosition(var2, var3);
      this.f_29381 = var5.x;
      this.f_29382 = var5.y;
      Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
      Class_Ssh31B3ljfKeWsvS.m_4830();
      Class_fuGrtM7rHAJXPau4.f_20770.m_6737();
      this.renderBackdrop(var2, var3, this.getGuiAlpha());
      this.renderGui();
      Class_fuGrtM7rHAJXPau4.f_20770.m_6741();
      this.renderSearchOverlayTopmost();
      this.renderProfileOverlay();
   }

   public boolean keyPressed(KeyEvent var1) {
      if (this.f_29355.m_7776(var1.key())) {
         return true;
      }

      if (this.f_29361.m_1957()) {
         return this.f_29361.m_1946(var1.key());
      }

      if (this.f_29415 == Category.COSMETICS) {
         return this.f_29353.m_2221(var1.key(), var1.modifiers()) ? true : super.keyPressed(var1);
      }

      if (this.f_29415 == Category.AUTOBUY && this.f_29352.m_8100(var1.key())) {
         return true;
      }

      if (this.f_29415 == Category.THEMES && this.f_29354.m_3817()) {
         if (var1.key() == 256) {
            this.f_29354.m_3860(false);
            return true;
         } else {
            return true;
         }
      } else {
         if (this.f_29415 == Category.THEMES && this.f_29354.m_3809()) {
            return this.f_29354.m_3807().m_7683(var1);
         }

         if (this.f_29415 != Category.COSMETICS && var1.key() == 70 && (var1.modifiers() & 2) != 0) {
            this.f_29399 = true;
            this.f_29400 = !this.f_29393.isEmpty();
            return true;
         }

         if (this.f_29399) {
            if (var1.key() == 65 && (var1.modifiers() & 2) != 0) {
               this.f_29400 = !this.f_29393.isEmpty();
               return true;
            }

            if (var1.key() == 259) {
               if (this.f_29400) {
                  this.f_29393 = "";
               } else if (!this.f_29393.isEmpty()) {
                  int var5 = this.f_29393.offsetByCodePoints(this.f_29393.length(), -1);
                  this.f_29393 = this.f_29393.substring(0, var5);
               }

               this.f_29400 = false;
               this.f_29402 = 0.0F;
               return true;
            } else {
               if (var1.key() == 261) {
                  this.f_29393 = "";
                  this.f_29400 = false;
                  this.f_29402 = 0.0F;
                  return true;
               }

               if (var1.key() != 257 && var1.key() != 335 && var1.key() != 258) {
                  if (var1.key() == 256) {
                     this.f_29399 = false;
                     this.f_29400 = false;
                     return true;
                  } else {
                     return true;
                  }
               } else {
                  if (!this.f_29370.isEmpty()) {
                     this.activateSearchResult(this.f_29370.getFirst());
                  }

                  return true;
               }
            }
         } else {
            for (Class_thRKDf0XD4Gy5SzG var3 : this.f_29351) {
               if (this.visibleInCurrentView(var3)) {
                  var3.m_2340(var1.key());
               }
            }

            for (Class_fNfOCLAYY3BfMMDP var6 : this.f_29350) {
               var6.m_2340(var1.key());
            }

            return super.keyPressed(var1);
         }
      }
   }

   public boolean isUnderSearch(float var1, float var2, float var3, float var4) {
      if (!this.isSearchOverlayVisible()) {
         return false;
      }

      float var5 = this.getSearchPanelX();
      float var6 = this.getSearchPanelY();
      float var7 = this.getSearchExpandedWidth();
      float var8 = this.getSearchDropdownHeight();
      return var1 + var3 > var5 && var1 < var5 + var7 && var2 + var4 > var6 && var2 < var6 + var8;
   }

   private void renderProfileBlock() {
      this.f_29355.m_7792(this.f_29381, this.f_29382);
   }

   private void renderModuleFocus() {
      float var1 = Math.clamp(this.f_29369.m_9288(), 0.0F, 1.0F);
      if (!(var1 < f_29771) && this.f_29414 != null) {
         Class_Ssh31B3ljfKeWsvS.m_4817(this.f_29377, this.f_29378, this.f_29379, this.f_29380, f_29772, Class_BftdentXEtGbugJw.m_2303(3, 5, 10, f_29773 * var1));
      }
   }

   public void setLayout(Class_WhZ6MBDQaQZ0AZFd.K4ufvBpHGycE5Var var1) {
      if (var1 != Class_WhZ6MBDQaQZ0AZFd.m_5484()) {
         this.f_29355.m_7796();
         this.closeSettingPopups();
         this.clearFocusedModule();
         this.f_29414 = null;
         this.f_29369.m_9281(0.0F);

         for (Class_thRKDf0XD4Gy5SzG var3 : this.f_29351) {
            var3.m_8911(false);
         }

         Class_WhZ6MBDQaQZ0AZFd.m_5488(var1);
         this.f_29374.clear();
         f_29349.clear();
         this.resetGuiScroll();
         this.closeSearch();
         this.updateCoordinates();
         if (this.f_29415 == Category.THEMES) {
            this.f_29354.m_3836();
         }
      }
   }

   private boolean visibleInCurrentView(Class_thRKDf0XD4Gy5SzG var1) {
      return this.f_29416 ? var1.m_8923().m_786() : var1.m_8923().m_785() == this.f_29415;
   }

   private float getMinScroll() {
      float var1 = this.f_29415 == Category.COSMETICS ? this.f_29353.m_2200() : this.getModuleViewportHeight();
      return Math.min(0.0F, var1 - this.f_29386);
   }

   public boolean mouseClicked(MouseButtonEvent var1, boolean var2) {
      Vector2f var3 = this.toGuiPosition(var1.x(), var1.y());
      if (var1.button() == 0 && this.f_29355.m_7778(var3.x, var3.y)) {
         this.clearFocusedModule();
         this.closeSearch();
         this.closeSettingPopups();
         this.f_29387 = false;
         this.f_29354.m_3825(false);
         this.f_29354.m_3860(false);
         this.f_29355.m_7803();
         return true;
      }

      if (this.f_29355.m_7781(var3.x, var3.y, var1.button())) {
         return true;
      }

      if (this.f_29361.m_1957()) {
         this.f_29387 = false;
         if (var1.button() == 0) {
            for (Category var27 : Category.values()) {
               float var30 = this.categoryButtonY(var27);
               if (!Float.isNaN(var30) && Class_FvJXUGWpZo3zYBW4.m_2697(var3.x, var3.y, this.f_29377 + f_29505, var30, this.categoryButtonWidth(), f_29506)) {
                  this.f_29361.m_1965();
                  this.selectCategory(var27);
                  return true;
               }
            }
         }

         return this.f_29361.m_1958(var3.x, var3.y, var1.button());
      } else {
         if (this.f_29415 == Category.COSMETICS) {
            return this.f_29353.m_2189(var3.x, var3.y, var1.button()) ? true : super.mouseClicked(var1, var2);
         }

         boolean var4 = this.f_29415 == Category.THEMES && this.f_29354.m_3851();
         if (!var4 && this.isSearchDropdownVisible()) {
            float var5 = this.getSearchDropdownHeight();
            if (Class_FvJXUGWpZo3zYBW4.m_2697(var3.x, var3.y, this.getSearchPanelX(), this.getSearchPanelY(), this.getSearchExpandedWidth(), var5)) {
               if (var1.button() == 0) {
                  int var22 = this.getSearchResultIndex(var3.y);
                  if (var22 >= 0 && var22 < this.f_29370.size()) {
                     this.activateSearchResult(this.f_29370.get(var22));
                  }
               }

               return true;
            }

            if (var1.button() == 0) {
               this.f_29399 = false;
               this.f_29400 = false;
               return true;
            }
         }

         if (!var4
            && var1.button() == 0
            && Class_FvJXUGWpZo3zYBW4.m_2697(var3.x, var3.y, this.searchX(), this.f_29378 + f_29507, this.getSearchWidth(), f_29508)) {
            this.clearFocusedModule();
            this.f_29399 = true;
            this.f_29400 = false;
            return true;
         }

         for (Class_thRKDf0XD4Gy5SzG var6 : this.f_29351) {
            if (this.visibleInCurrentView(var6) && var6.m_2334(var3.x, var3.y, var1.button())) {
               this.f_29387 = false;
               return true;
            }
         }

         if (var1.button() == 0 && this.f_29386 > this.getModuleViewportHeight() && this.isScrollbarHovered(var3.x, var3.y)) {
            this.beginScrollbarDragging(var3.y);
            return true;
         }

         if (this.f_29415 != Category.COSMETICS) {
            for (Class_fNfOCLAYY3BfMMDP var17 : this.f_29350) {
               if (Class_FvJXUGWpZo3zYBW4.m_2697(var3.x, var3.y, var17.m_2336(), var17.m_2338(), var17.m_2343(), var17.m_2339())) {
                  var17.m_2335(var3.x, var3.y, var1.button());
                  return true;
               }
            }
         }

         if (!Class_FvJXUGWpZo3zYBW4.m_2697(var3.x, var3.y, this.f_29377, this.f_29378, this.f_29379, this.f_29380)) {
            Class_V7bm8pF2tjL9Evnq var14 = DimasikClient.m_9057().m_9049().m_2808();
            Vector2f var18 = Class_FvJXUGWpZo3zYBW4.m_2693(var1.x(), var1.y());
            if (var14 != null && (var14.m_5360(var18.x, var18.y, var1.button()) || var14.m_5365(var18.x, var18.y, var1.button()))) {
               return true;
            }
         }

         if (!var4 && var1.button() == 0 && this.isFavoritesButtonHovered(var3.x, var3.y)) {
            this.f_29416 = !this.f_29416;
            this.f_29399 = false;
            this.clearFocusedModule();
            this.restoreCategoryScroll();
            this.f_29391 = System.nanoTime();
            return true;
         }

         if (var1.button() == 0) {
            this.f_29399 = false;
            this.f_29400 = false;
         }

         boolean var15 = this.isModuleViewportHovered(var3.x, var3.y);
         if (var15) {
            for (Class_thRKDf0XD4Gy5SzG var7 : this.f_29351) {
               if (this.visibleInCurrentView(var7) && var7.m_2334(var3.x, var3.y, var1.button())) {
                  return true;
               }
            }
         }

         if (this.f_29413 != null
            && !Class_FvJXUGWpZo3zYBW4.m_2697(
               var3.x,
               var3.y,
               this.f_29413.m_2336() - f_29509,
               this.f_29413.m_2338() - f_29510,
               this.f_29413.m_2343() + f_29511,
               this.f_29413.m_2339() + f_29512
            )) {
            this.clearFocusedModule();
            return true;
         }

         for (Category var9 : Category.values()) {
            float var10 = this.categoryButtonY(var9);
            if (!Float.isNaN(var10) && Class_FvJXUGWpZo3zYBW4.m_2697(var3.x, var3.y, this.f_29377 + f_29513, var10, this.categoryButtonWidth(), f_29514)) {
               this.selectCategory(var9);
               break;
            }
         }

         if (!this.f_29416 && this.f_29415 == Category.AUTOBUY && this.f_29352.m_8062(var3.x, var3.y, var1.button())) {
            return true;
         }

         if (!this.f_29416 && this.f_29415 == Category.THEMES && this.f_29354.m_3811(var3.x, var3.y, var1.button())) {
            return true;
         }

         boolean var21 = false;
         if (var15) {
            for (Class_thRKDf0XD4Gy5SzG var28 : this.f_29351) {
               if (this.visibleInCurrentView(var28) && var28.m_2334(var3.x, var3.y, var1.button())) {
                  var21 = true;
                  break;
               }
            }
         }

         if (!var21 && var15) {
            for (Class_thRKDf0XD4Gy5SzG var29 : this.f_29351) {
               if (this.visibleInCurrentView(var29)) {
                  var29.m_2335(var3.x, var3.y, var1.button());
               }
            }
         }

         return true;
      }
   }

   private int commonPrefixLength(String var1, String var2) {
      int var3 = Math.min(var1.length(), var2.length());
      int var4 = 0;

      while (var4 < var3 && var1.charAt(var4) == var2.charAt(var4)) {
         var4++;
      }

      return var4;
   }

   private void activateSearchResult(Screen_8.hIEliDDYS7gMkjrm var1) {
      Class_thRKDf0XD4Gy5SzG var2 = var1.component();
      this.selectCategory(var2.m_8923().m_785());
      this.f_29383 = 0.0F;
      this.f_29384 = 0.0F;
      this.f_29412 = var2;
      var2.m_8912();
      this.f_29399 = false;
      this.f_29400 = false;
      this.f_29393 = "";
      this.resetSearchScroll();
   }

   public boolean mouseScrolled(double var1, double var3, double var5, double var7) {
      if (this.f_29355.m_7780()) {
         return true;
      }

      Vector2f var9 = this.toGuiPosition(var1, var3);
      if (this.f_29361.m_1957()) {
         return this.f_29361.m_1951(var9.x, var9.y, var7);
      }

      if (this.f_29415 == Category.COSMETICS) {
         if (this.f_29353.m_2173(var9.x, var9.y)) {
            float var15 = this.f_29384;
            this.f_29384 = Math.clamp(this.f_29384 + (float)var7 * f_29515, this.getMinScroll(), 0.0F);
            if (var15 != this.f_29384) {
               ClientSounds.m_9463(ClientSounds.KG2FYhAQHwVAXDJG.SCROLL);
            }
         }

         return true;
      } else if (this.isSearchDropdownVisible()
         && Class_FvJXUGWpZo3zYBW4.m_2697(
            var9.x, var9.y, this.getSearchPanelX(), this.getSearchPanelY(), this.getSearchExpandedWidth(), this.getSearchDropdownHeight()
         )) {
         float var14 = this.f_29402;
         this.f_29402 = Math.clamp(this.f_29402 - (float)var7 * f_29516 * 2.0F, 0.0F, this.getSearchMaxScroll());
         if (var14 != this.f_29402) {
            ClientSounds.m_9463(ClientSounds.KG2FYhAQHwVAXDJG.SCROLL);
         }

         return true;
      } else {
         for (Class_thRKDf0XD4Gy5SzG var11 : this.f_29351) {
            if (this.visibleInCurrentView(var11) && var11.m_8927(var9.x, var9.y, var7)) {
               return true;
            }
         }

         this.closeSettingPopups();
         if (!this.f_29416 && this.f_29415 == Category.AUTOBUY && this.f_29352.m_8085(var9.x, var9.y, (float)var7)) {
            return true;
         }

         if (this.f_29415 == Category.THEMES && this.f_29354.m_3850(var9.x, var9.y, var7)) {
            return true;
         }

         if (Class_FvJXUGWpZo3zYBW4.m_2697(
            var9.x, var9.y, this.getModuleViewportX(), this.f_29378 + f_29517, this.getModuleViewportWidth(), this.getModuleViewportHeight()
         )) {
            float var13 = this.getMinScroll();
            float var16 = this.f_29384;
            float var12 = this.f_29384 + (float)var7 * f_29518;
            this.f_29384 = Math.clamp(var12, var13, 0.0F);
            if (var16 != this.f_29384) {
               ClientSounds.m_9463(ClientSounds.KG2FYhAQHwVAXDJG.SCROLL);
            }

            if (this.f_29384 == 0.0F && this.f_29383 > 0.0F) {
               this.f_29383 = 0.0F;
            }

            if (this.f_29384 == var13 && this.f_29383 < var13) {
               this.f_29383 = var13;
            }

            return true;
         } else {
            return super.mouseScrolled(var1, var3, var5, var7);
         }
      }
   }

   private float favoritesButtonX() {
      return this.searchX() - f_29806;
   }

   private float getSearchMaxScroll() {
      return Math.max(0.0F, (this.f_29370.size() - 7) * f_29770);
   }

   public float getLayoutContentAlpha(int var1) {
      return 1.0F - f_29494 * (float)Math.sin(f_29495 * this.getLayoutReveal(var1));
   }

   private void resetSearchScroll() {
      this.f_29401 = 0.0F;
      this.f_29402 = 0.0F;
   }

   public float getGuiHeight() {
      return this.f_29380;
   }

   private void closeSearch() {
      this.f_29399 = false;
      this.f_29400 = false;
      this.f_29393 = "";
      this.resetSearchScroll();
   }

   public float getLayoutReveal(int var1) {
      return this.f_29356.m_8045(var1);
   }

   public float getModuleViewportY() {
      return this.f_29378 + f_29775;
   }

   public float getGuiX() {
      return this.f_29377;
   }

   public void focusModule(Class_thRKDf0XD4Gy5SzG var1) {
      if (!this.areSettingsPinned()) {
         if (var1 == null) {
            this.clearFocusedModule();
         } else {
            if (this.f_29413 != null && this.f_29413 != var1) {
               this.f_29413.m_8911(false);
            }

            this.f_29413 = var1;
            this.f_29414 = var1;
            this.closeSearch();
         }
      }
   }

   public float getGuiWidth() {
      return this.f_29379;
   }

   private void renderAnimatedSearchText(float var1, float var2, int var3) {
      float var4 = Math.clamp(this.f_29367.m_9288(), 0.0F, 1.0F);
      if (!(var4 >= f_29641) && this.f_29406 < this.f_29393.length()) {
         int var5 = Math.min(this.f_29406, this.f_29393.length());
         String var6 = this.f_29393.substring(0, var5);
         if (!var6.isEmpty()) {
            Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var6, var1, var2, 12, var3);
         }

         float var7 = var1 + Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var6, 12);
         int var8 = var5;

         for (int var9 = 0; var8 < this.f_29393.length(); var9++) {
            int var10 = this.f_29393.offsetByCodePoints(var8, 1);
            String var11 = this.f_29393.substring(var8, var10);
            float var12 = Math.min(f_29642, var9 * f_29643);
            float var13 = Math.clamp((var4 - var12) / Math.max(f_29644, 1.0F - var12), 0.0F, 1.0F);
            float var14 = (float)Class_eXr9Fra2ad3yFXY8.f_19100.m_4476(var13);
            float var15 = f_29645 + f_29646 * var14;
            float var16 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var11, 12);
            float var17 = Class_Ssh31B3ljfKeWsvS.m_4826(Class_y1y6QpONhWEUIdEB.m_9588(), var11, var15, 1.0F);
            Class_Ssh31B3ljfKeWsvS.m_4857(
               Class_y1y6QpONhWEUIdEB.m_9588(),
               var11,
               var7 + (var16 - var17) * f_29647,
               var2 + (1.0F - var14) * f_29648,
               var15,
               Class_BftdentXEtGbugJw.m_2306(var3, Class_BftdentXEtGbugJw.m_2297(var3) / f_29649 * var14),
               0.0F,
               f_29650,
               1.0F
            );
            var7 += var16;
            var8 = var10;
         }
      } else {
         Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), this.f_29393, var1, var2, 12, var3);
      }
   }

   private float getSearchExpandedWidth() {
      return Math.min(f_29765, this.f_29379 - f_29766);
   }

   private void renderDepartingSearchResults(float var1, float var2, float var3, float var4, float var5) {
      float var6 = Math.clamp(this.f_29366.m_9288(), 0.0F, 1.0F);
      float var7 = Math.clamp(var4 * (1.0F - var5), 0.0F, 1.0F);
      if (!(var7 <= f_29698)) {
         if (this.f_29371.isEmpty()) {
            if (this.f_29397) {
               float var11 = var7 * var6;
               Class_Ssh31B3ljfKeWsvS.m_4866(
                  Class_y1y6QpONhWEUIdEB.m_9588(),
                  Class_0p152hWffX3ippAf.m_801(f_29699),
                  var1 + f_29700 - f_29701 * var5,
                  var3 + f_29702 + (1.0F - var6) * f_29703,
                  12,
                  Class_BftdentXEtGbugJw.m_2306(
                     Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT),
                     Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT) / f_29704 * var11
                  )
               );
            }
         } else {
            for (Screen_8.Class_8ydBRPfMEhjxMx5r var9 : this.f_29371) {
               float var10 = var3 + var9.index() * f_29705 - this.f_29401;
               if (!(var10 + f_29706 < var3) && !(var10 > var3 + f_29707)) {
                  this.drawSearchResultRow(var9.result(), var1 + f_29708 - f_29709 * var5, var10, var2, var7 * var6, false);
               }
            }
         }
      }
   }

   private float guiLeftInset() {
      float var1 = this.f_29355.m_7771();
      return this.f_29415 == Category.COSMETICS ? Math.max(f_29498, var1) : var1;
   }

   public void adjustAutoBuyScroll(float var1) {
      this.f_29384 = Math.clamp(this.f_29384 + var1 * f_29504, this.getMinScroll(), 0.0F);
   }

   private void renderSearchDropdown(float var1) {
      float var2 = this.getSearchPanelX();
      float var3 = this.getSearchPanelY();
      float var4 = this.getSearchExpandedWidth();
      float var5 = this.getSearchDropdownHeight();
      float var6 = (float)Class_eXr9Fra2ad3yFXY8.f_19100.m_4476(var1);
      float var7 = f_29653 + f_29654 * var6;
      Class_FvJXUGWpZo3zYBW4.m_2692(var2, var3, var4, var5, var7);
      float var8 = Class_Ssh31B3ljfKeWsvS.m_4821();
      Class_Ssh31B3ljfKeWsvS.m_4864(f_29655);
      Class_Ssh31B3ljfKeWsvS.m_4859(
         var2,
         var3,
         var4,
         var5,
         f_29656,
         Class_BftdentXEtGbugJw.m_2306(
            Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SHADOW), Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.SHADOW) / f_29657 * var6
         )
      );
      int var9 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.BACKGROUND);
      float var10 = this.isSearchDropdownVisible() ? f_29658 : f_29659 * var1;
      Class_Ssh31B3ljfKeWsvS.m_4858(var2, var3, var4, var5, f_29660, f_29661, Class_BftdentXEtGbugJw.m_2303(255, 255, 255, var10));
      Class_Ssh31B3ljfKeWsvS.m_4817(
         var2,
         var3,
         var4,
         var5,
         f_29662,
         Class_BftdentXEtGbugJw.m_2306(var9, Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.BACKGROUND) / f_29663 * f_29664 * var6)
      );
      Class_Ssh31B3ljfKeWsvS.m_4854(
         var2,
         var3,
         var4,
         var5,
         1.0F,
         f_29665,
         Class_BftdentXEtGbugJw.m_2306(
            Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE), Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.OUTLINE) / f_29666 * var6
         )
      );
      Class_Ssh31B3ljfKeWsvS.m_4864(var8);
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9591(),
         f_29667,
         var2 + f_29668,
         var3 + f_29669,
         11,
         Class_BftdentXEtGbugJw.m_2306(
            Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN), Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.MAIN) / f_29670 * var1
         )
      );
      float var11 = Math.clamp(this.f_29368.m_9288(), 0.0F, 1.0F);
      float var12 = (float)Class_eXr9Fra2ad3yFXY8.f_19100.m_4476(var11);
      boolean var13 = !this.f_29371.isEmpty() || this.f_29397 || !this.f_29372.isEmpty();
      if (var13 && var12 < f_29671) {
         this.drawSearchTitle(var2, var3, this.f_29398, var1 * (1.0F - var12));
         this.drawSearchTitle(var2, var3, this.f_29370.size(), var1 * var12);
      } else {
         this.drawSearchTitle(var2, var3, this.f_29370.size(), var1);
      }

      String var14 = Class_0p152hWffX3ippAf.m_801(f_29672) + "";
      float var15 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var14, 10);
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         var14,
         var2 + var4 - var15 - f_29673,
         var3 + f_29674,
         10,
         Class_BftdentXEtGbugJw.m_2306(
            Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT),
            Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT) / f_29675 * var1
         )
      );
      Class_Ssh31B3ljfKeWsvS.m_4817(
         var2 + f_29676,
         var3 + f_29677 - f_29678,
         var4 - f_29679,
         1.0F,
         f_29680,
         Class_BftdentXEtGbugJw.m_2306(
            Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.LINE), Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.LINE) / f_29681 * var1
         )
      );
      float var16 = var3 + f_29682;
      float var17 = var5 - f_29683 - f_29684;
      Class_Ssh31B3ljfKeWsvS.m_4822(var2 + f_29685, var16, var4 - f_29686, var17);
      if ((!this.f_29371.isEmpty() || this.f_29397) && var12 < f_29687) {
         this.renderDepartingSearchResults(var2, var4, var16, var1, var12);
      }

      this.renderCurrentSearchResults(var2, var4, var16, var1, var11, var13);
      Class_Ssh31B3ljfKeWsvS.m_4830();
      float var18 = this.getSearchMaxScroll();
      if (var18 > 0.0F) {
         float var19 = f_29688;
         float var20 = this.f_29370.size() * f_29689;
         float var21 = Math.max(f_29690, var19 * var19 / var20);
         float var22 = var19 - var21;
         float var23 = this.f_29401 / var18;
         Class_Ssh31B3ljfKeWsvS.m_4817(
            var2 + var4 - f_29691,
            var16 + var22 * var23,
            2.0F,
            var21,
            1.0F,
            Class_BftdentXEtGbugJw.m_2306(
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SCROLL), Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.SCROLL) / f_29692 * var1
            )
         );
      }

      Class_FvJXUGWpZo3zYBW4.m_2694(var2, var3, var4, var5, var7);
   }

   public float getSidebarLabelAlpha() {
      return this.f_29356.m_8042();
   }

   public float getGuiAlpha() {
      return Math.clamp(this.f_29363.m_845(), 0.0F, 1.0F);
   }

   private Vector2f toGuiPosition(double var1, double var3) {
      Vector2f var5 = Class_FvJXUGWpZo3zYBW4.m_2693(var1, var3);
      float var6 = this.getInterfaceScale();
      float var7 = f_11537.getWindow().getScreenWidth() * f_29787;
      float var8 = f_11537.getWindow().getScreenHeight() * f_29788;
      return new Vector2f(var7 + (var5.x - var7) / var6, var8 + (var5.y - var8) / var6);
   }

   public boolean charTyped(CharacterEvent var1) {
      if (this.f_29355.m_7780()) {
         return true;
      }

      if (this.f_29361.m_1957()) {
         return this.f_29361.m_1954(var1.codepointAsString(), var1.codepoint(), Class_2TFiP2yfi5iArGSw.m_1179());
      }

      if (this.f_29415 != Category.COSMETICS) {
         if (this.f_29415 == Category.AUTOBUY && this.f_29352.m_8094(var1.codepointAsString())) {
            return true;
         }

         if (this.f_29415 == Category.THEMES && this.f_29354.m_3809()) {
            return this.f_29354.m_3807().m_7682(var1.codepointAsString());
         }

         if (this.f_29399) {
            if (!Character.isISOControl(var1.codepoint())) {
               if (this.f_29400) {
                  this.f_29393 = "";
                  this.f_29400 = false;
               }

               if (this.f_29393.codePointCount(0, this.f_29393.length()) < 64) {
                  this.f_29393 = this.f_29393 + var1.codepointAsString();
                  this.f_29402 = 0.0F;
                  ClientSounds.m_9461();
               }
            }

            return true;
         } else {
            for (Class_thRKDf0XD4Gy5SzG var3 : this.f_29351) {
               if (this.visibleInCurrentView(var3)) {
                  var3.m_2344(var1.codepointAsString(), var1.codepoint(), Class_2TFiP2yfi5iArGSw.m_1179());
               }
            }

            return super.charTyped(var1);
         }
      } else {
         return this.f_29353.m_2161(var1.codepointAsString()) || super.charTyped(var1);
      }
   }

   private boolean isModuleViewportHovered(float var1, float var2) {
      return Class_FvJXUGWpZo3zYBW4.m_2697(
         var1, var2, this.getModuleViewportX(), this.f_29378 + f_29519, this.getModuleViewportWidth(), this.getModuleViewportHeight()
      );
   }

   private void restoreCategoryScroll() {
      float var1 = this.f_29374.getOrDefault(this.f_29415, 0.0F);
      this.f_29383 = var1;
      this.f_29384 = var1;
      this.f_29387 = false;
   }

   private void updateScrollbar(float var1) {
      float var2 = this.getScrollbarOverflow();
      float var3 = this.getScrollbarThumbHeight();
      float var4 = this.getModuleViewportHeight() - var3;
      if (!(var2 <= 0.0F) && !(var4 <= 0.0F)) {
         float var5 = Math.clamp((var1 - this.f_29388 - (this.f_29378 + f_29795)) / var4, 0.0F, 1.0F);
         float var6 = this.f_29384;
         this.f_29383 = -var5 * var2;
         this.f_29384 = this.f_29383;
         if (var6 != this.f_29384) {
            ClientSounds.m_9463(ClientSounds.KG2FYhAQHwVAXDJG.SCROLL);
         }
      } else {
         this.f_29383 = 0.0F;
         this.f_29384 = 0.0F;
         this.f_29387 = false;
      }
   }

   private boolean isSearchDropdownVisible() {
      return this.f_29399 && !this.f_29393.isBlank();
   }

   private int searchScore(String var1, String var2, String var3) {
      return this.searchScoreLocalized(var1, var2, var3);
   }

   public boolean mouseReleased(MouseButtonEvent var1) {
      Vector2f var2 = this.toGuiPosition(var1.x(), var1.y());
      if (var1.button() == 0) {
         Class_V7bm8pF2tjL9Evnq var3 = DimasikClient.m_9057().m_9049().m_2808();
         if (var3 != null) {
            var3.m_5370();
         }
      }

      if (this.f_29355.m_7780()) {
         if (var1.button() == 0) {
            this.f_29355.m_7786();
         }

         return true;
      } else {
         if (this.f_29361.m_1957()) {
            return this.f_29361.m_1977(var2.x, var2.y, var1.button());
         }

         if (var1.button() == 0) {
            this.f_29387 = false;
         }

         if (this.f_29415 == Category.THEMES) {
            this.f_29354.m_3814(var2.x, var2.y, var1.button());
            return true;
         }

         for (Class_thRKDf0XD4Gy5SzG var4 : this.f_29351) {
            if (this.visibleInCurrentView(var4)) {
               var4.m_2330(var2.x, var2.y, var1.button());
            }
         }

         return true;
      }
   }

   public float getModuleViewportWidth() {
      return this.f_29379 - this.getSidebarWidth() - 2.0F;
   }

   private Screen_8.DHdvIXtrgGu5ANfN searchKey(Screen_8.hIEliDDYS7gMkjrm var1) {
      return new Screen_8.DHdvIXtrgGu5ANfN(var1.component(), var1.setting());
   }

   private String fitSearchText(String var1, float var2, int var3) {
      if (Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var1, var3) <= var2) {
         return var1;
      }

      String var4 = var1;

      while (!var4.isEmpty() && Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var4 + "", var3) > var2) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      return var4 + "";
   }

   private float totalGuiWidth() {
      return this.f_29379 + this.guiLeftInset() * (this.f_29415 == Category.COSMETICS ? 2.0F : 1.0F);
   }

   public void onClose() {
      if (this.f_29376) {
         ClientSounds.m_9463(ClientSounds.KG2FYhAQHwVAXDJG.CLOSE);
      }

      this.f_29376 = false;
      this.f_29355.m_7796();
      this.f_29353.m_2192();
      this.saveCategoryScroll();
      this.f_29375 = false;
   }

   public float getGuiY() {
      return this.f_29378;
   }

   private float getSearchWidth() {
      return f_29764;
   }

   protected void extractPanorama(GuiGraphicsExtractor var1, float var2) {
   }

   public Screen_8() {
      super(Component.nullToEmpty(f_29419));
      this.f_29364 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_29420, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_29365 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_29421, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_29366 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_29422, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_29367 = new Class_w8fCJQ5ZtH5lQbWc(1.0F, f_29423, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_29368 = new Class_w8fCJQ5ZtH5lQbWc(1.0F, f_29424, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_29369 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_29425, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_29370 = new ArrayList<>();
      this.f_29371 = new ArrayList<>();
      this.f_29372 = new HashSet<>();
      this.f_29373 = new HashMap<>();
      this.f_29374 = new EnumMap<>(Category.class);
      this.f_29375 = true;
      this.f_29391 = System.nanoTime();
      this.f_29393 = "";
      this.f_29395 = "";
      this.f_29404 = Float.NaN;
      this.f_29405 = "";
      this.f_29409 = 1.0F;
      this.f_29410 = 1.0F;
      this.f_29415 = f_29348;
      this.f_29417 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_29426, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_29418 = this::renders;
      this.f_29374.putAll(f_29349);

      for (Module var2 : DimasikClient.m_9057().m_9049().m_2801()) {
         this.f_29351.add(new Class_thRKDf0XD4Gy5SzG(var2, this));
      }

      DimasikClient.m_9057().m_9051().m_9713(this);
   }

   public void tick() {
      this.updateCoordinates();
      this.f_29363.m_843(this.f_29375);

      for (Class_thRKDf0XD4Gy5SzG var2 : this.f_29351) {
         var2.m_2332();
      }

      if (this.f_29361.m_1957()) {
         this.f_29361.m_1948();
      }

      if (this.f_29415 == Category.THEMES) {
         this.f_29354.m_3830();
      }

      for (Class_fNfOCLAYY3BfMMDP var4 : this.f_29350) {
         var4.m_2332();
      }

      if (!this.f_29375 && this.f_29363.m_845() < f_29774) {
         this.f_29375 = true;
         super.onClose();
      }
   }

   private float categoryButtonWidth() {
      return this.getSidebarWidth() - f_29499;
   }

   public void renderBackdrop(int var1, int var2, float var3) {
      ClickGui var4 = DimasikClient.m_9057().m_9049().m_2801().m_3442();
      if (var4.m_8276() && Class_WhZ6MBDQaQZ0AZFd.m_5485() == 2) {
         this.f_29362
            .m_8324(
               var1 * f_11537.getWindow().getGuiScale(),
               var2 * f_11537.getWindow().getGuiScale(),
               var3,
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN),
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN_TWO)
            );
      }
   }

   protected void extractMenuBackground(GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5) {
   }

   public void openEntityEsp1Editor(EntityESP var1) {
      this.clearFocusedModule();
      this.closeSearch();
      ClientSounds.m_9463(ClientSounds.KG2FYhAQHwVAXDJG.EDITOR);
      this.f_29361.m_1961(var1);
   }

   public float getSidebarWidth() {
      return this.f_29356.m_8038();
   }

   public boolean intersectsModuleViewport(float var1, float var2, float var3, float var4) {
      float var5 = this.getModuleViewportX();
      float var6 = this.getModuleViewportY();
      float var7 = var5 + this.getModuleViewportWidth();
      float var8 = var6 + this.getModuleViewportHeight();
      return var1 + var3 > var5 && var1 < var7 && var2 + var4 > var6 && var2 < var8;
   }

   private boolean isFavoritesButtonHovered(float var1, float var2) {
      return this.f_29415 != Category.COSMETICS && Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.favoritesButtonX(), this.f_29378 + f_29807, f_29808, f_29809);
   }

   private void renderCurrentSearchResults(float var1, float var2, float var3, float var4, float var5, boolean var6) {
      float var7 = Math.clamp(this.f_29366.m_9288(), 0.0F, 1.0F);
      float var8 = var5 * var5 * (f_29710 - 2.0F * var5);
      if (this.f_29370.isEmpty()) {
         float var28 = var4 * var7 * (var6 ? var8 : 1.0F);
         if (!(var28 <= f_29711)) {
            Class_Ssh31B3ljfKeWsvS.m_4866(
               Class_y1y6QpONhWEUIdEB.m_9588(),
               Class_0p152hWffX3ippAf.m_801(f_29712),
               var1 + f_29713 + (var6 ? f_29714 * (1.0F - var8) : 0.0F),
               var3 + f_29715 + (1.0F - var7) * f_29716,
               12,
               Class_BftdentXEtGbugJw.m_2306(
                  Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT),
                  Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT) / f_29717 * var28
               )
            );
         }
      } else {
         float var9 = Math.clamp((var5 - f_29718) / f_29719, 0.0F, 1.0F);
         var9 = var9 * var9 * (f_29720 - 2.0F * var9);
         int var10 = Math.max(0, (int)(this.f_29401 / f_29721));
         int var11 = Math.min(this.f_29370.size(), var10 + 7 + 2);
         int var12 = 0;

         for (int var13 = var10; var13 < var11; var13++) {
            Screen_8.hIEliDDYS7gMkjrm var14 = this.f_29370.get(var13);
            Screen_8.DHdvIXtrgGu5ANfN var15 = this.searchKey(var14);
            boolean var16 = this.f_29372.contains(var15);
            float var17 = 1.0F;
            float var18 = 0.0F;
            if (var16 && var6) {
               float var19 = Math.min(f_29722, var12++ * f_29723);
               float var20 = Math.clamp((var5 - var19) / Math.max(f_29724, 1.0F - var19), 0.0F, 1.0F);
               float var21 = var20 * var20 * (f_29725 - 2.0F * var20);
               var17 = var21;
               var18 = f_29726 * (1.0F - var21);
            }

            Integer var29 = this.f_29373.get(var15);
            float var30 = var29 == null ? var13 : var29.intValue() + (var13 - var29) * var9;
            float var31 = var3 + var30 * f_29727 - this.f_29401;
            if (!(var31 + f_29728 < var3) && !(var31 > var3 + f_29729)) {
               float var22 = Math.min(f_29730, (var13 - var10) * f_29731);
               float var23 = Math.clamp((var7 - var22) / Math.max(f_29732, 1.0F - var22), 0.0F, 1.0F);
               float var24 = var4 * var17 * (float)Class_eXr9Fra2ad3yFXY8.f_19100.m_4476(var23);
               float var25 = var1 + f_29733 + var18 + (1.0F - var7) * f_29734;
               boolean var26 = (!var6 || var5 > f_29735)
                  && Class_FvJXUGWpZo3zYBW4.m_2697(this.f_29381, this.f_29382, var25, var31 + 2.0F, var2 - f_29736, f_29737);
               this.drawSearchResultRow(var14, var25, var31, var2, var24, var26);
            }
         }
      }
   }

   public float getModuleViewportHeight() {
      return this.f_29380 - f_29776;
   }

   public void resetGuiScroll() {
      this.f_29383 = 0.0F;
      this.f_29384 = 0.0F;
      this.f_29374.put(this.f_29415, 0.0F);
      this.f_29387 = false;
   }

   private float getScrollbarOverflow() {
      return Math.max(0.0F, this.f_29386 - this.getModuleViewportHeight());
   }

   private void renderBreadcrumb() {
      float var1 = this.f_29378 + f_29522;
      int var2 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT);
      int var3 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT);
      int var4 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9591(), f_29523, this.f_29377 + this.getSidebarWidth() + f_29524, var1 - 2.0F, 15, var2);
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), f_29525, this.f_29377 + this.getSidebarWidth() + f_29526, var1, 13, var2);
      float var5 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), f_29527, 13);
      float var6 = this.f_29377 + this.getSidebarWidth() + f_29528 + var5;
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), f_29529, var6, var1, 13, var2);
      String var7 = this.f_29416 ? Class_0p152hWffX3ippAf.m_804(f_29530, f_29531) : this.f_29415.m_8687();
      String var8 = this.f_29416 ? f_29532 : this.f_29415.m_8688();
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9591(), var8, var6 + f_29533, var1, 13, var4);
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var7, var6 + f_29534, var1, 13, var3);
   }

   private float getModuleEntrancePhase(int var1) {
      double var2 = (System.nanoTime() - this.f_29391) / f_29803 - var1 * f_29804;
      return (float)Math.clamp(var2 / f_29805, 0.0, 1.0);
   }

   private void beginScrollbarDragging(float var1) {
      float var2 = this.getScrollbarOverflow();
      if (var2 <= 0.0F) {
         this.f_29387 = false;
      } else {
         float var3 = this.getScrollbarThumbHeight();
         float var4 = this.getModuleViewportHeight() - var3;
         float var5 = -this.f_29383 / var2;
         float var6 = this.f_29378 + f_29794 + var4 * var5;
         this.f_29388 = var1 >= var6 && var1 <= var6 + var3 ? var1 - var6 : var3 / 2.0F;
         this.f_29387 = true;
         this.updateScrollbar(var1);
      }
   }

   private boolean isScrollbarHovered(float var1, float var2) {
      return Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_29377 + this.f_29379 - f_29791, this.f_29378 + f_29792, f_29793, this.getModuleViewportHeight());
   }

   private int getSearchResultIndex(float var1) {
      float var2 = this.getSearchPanelY() + f_29762;
      float var3 = var1 - var2 + this.f_29401;
      return var3 < 0.0F ? -1 : (int)(var3 / f_29763);
   }

   public void clearFocus() {
   }

   private float searchX() {
      return this.f_29377 + this.f_29379 - f_29500 - this.getSearchWidth();
   }

   private void renderSearchOverlayTopmost() {
      float var1 = Math.clamp(this.f_29365.m_9288(), 0.0F, 1.0F);
      if (this.f_29411 && !(var1 <= f_29651)) {
         float var2 = this.f_29377;
         float var3 = this.f_29378;
         float var4 = Class_Ssh31B3ljfKeWsvS.m_4821();
         this.f_29377 = this.f_29407;
         this.f_29378 = this.f_29408;
         Class_FvJXUGWpZo3zYBW4.m_2692(this.f_29377 - this.guiLeftInset(), this.f_29378, this.totalGuiWidth(), this.f_29380, this.f_29409);
         Class_Ssh31B3ljfKeWsvS.m_4864(f_29652 * this.f_29410);
         this.renderSearchDropdown(var1);
         Class_Ssh31B3ljfKeWsvS.m_4864(var4);
         Class_FvJXUGWpZo3zYBW4.m_2694(this.f_29377 - this.guiLeftInset(), this.f_29378, this.totalGuiWidth(), this.f_29380, this.f_29409);
         this.f_29377 = var2;
         this.f_29378 = var3;
      }
   }

   private void saveCategoryScroll() {
      this.f_29374.put(this.f_29415, this.f_29384);
      f_29349.put(this.f_29415, this.f_29384);
      f_29348 = this.f_29415 == Category.COSMETICS ? Category.COMBAT : this.f_29415;
   }

   public boolean areSettingsPinned() {
      return Class_WhZ6MBDQaQZ0AZFd.m_5484().m_5483();
   }

   private void updateCoordinates() {
      this.f_29355.m_7782();
      boolean var1 = this.isExpandedLayout();
      float var2 = this.isSidebarCompact() ? f_29777 : (this.f_29415 == Category.COSMETICS ? f_29778 : f_29779);
      this.f_29356.m_8039(var1 ? f_29780 : f_29781, var1 ? f_29782 : f_29783, var2);
      this.f_29379 = this.f_29356.m_8041();
      this.f_29380 = this.f_29356.m_8040();
      this.f_29377 = f_11537.getWindow().getScreenWidth() / 2.0F - this.totalGuiWidth() / 2.0F + this.guiLeftInset();
      this.f_29378 = f_11537.getWindow().getScreenHeight() / 2.0F - this.f_29380 / 2.0F;
   }

   private float categoryButtonY(Category var1) {
      return this.f_29378 + switch (var1) {
         case COMBAT -> f_29796;
         case MOVEMENT -> f_29797;
         case RENDER -> f_29798;
         case MISC -> f_29799;
         case AUTOBUY -> f_29800;
         case COSMETICS -> f_29801;
         case THEMES -> f_29802;
      };
   }

   public boolean isSidebarCompact() {
      return Class_WhZ6MBDQaQZ0AZFd.m_5484().m_5482() && !this.f_29361.m_1957();
   }

   public float getModuleViewportX() {
      return this.f_29377 + this.getSidebarWidth() + 2.0F;
   }

   private float getScrollbarThumbHeight() {
      return Math.max(f_29790, this.getModuleViewportHeight() * this.getModuleViewportHeight() / Math.max(1.0F, this.f_29386));
   }

   private void selectCategory(Category var1) {
      if (this.f_29415 != var1) {
         ClientSounds.m_9462(ClientSounds.KG2FYhAQHwVAXDJG.TAB, (float)var1.ordinal() / Math.max(1, Category.values().length - 1));
         this.saveCategoryScroll();
         this.f_29415 = var1;
         this.f_29416 = false;
         f_29348 = var1 == Category.COSMETICS ? Category.COMBAT : var1;
         this.updateCoordinates();
         this.restoreCategoryScroll();
         this.f_29391 = System.nanoTime();
         this.f_29387 = false;
         this.clearFocusedModule();
         if (var1 == Category.THEMES) {
            this.f_29354.m_3836();
         }
      }
   }

   @Generated
   public GuiGraphicsExtractor getFrameContext() {
      return this.f_29392;
   }

   private record Class_8ydBRPfMEhjxMx5r(Screen_8.hIEliDDYS7gMkjrm result, int index) {
   }

   private record DHdvIXtrgGu5ANfN(Class_thRKDf0XD4Gy5SzG component, Setting<?> setting) {
   }

   private record hIEliDDYS7gMkjrm(Class_thRKDf0XD4Gy5SzG component, Setting<?> setting, int score) {
   }
}
