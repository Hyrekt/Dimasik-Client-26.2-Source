package dev.dimasik.client.ui.screen;

import dev.dimasik.client.module.misc.InventorySort;
import dev.dimasik.client.system.Class_0p152hWffX3ippAf;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_cxtVSustGMvg4Bq0;
import dev.dimasik.client.system.Class_eXr9Fra2ad3yFXY8;
import dev.dimasik.client.system.Class_jZQ0pP9BTU3L7miy;
import dev.dimasik.client.system.Class_w8fCJQ5ZtH5lQbWc;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.util.List;
import java.util.Locale;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.CharacterEvent;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import org.joml.Vector2f;

public final class Screen_10 extends Screen {
   private static final float f_33427 = 940.0F;
   private static final float f_33428 = 654.0F;
   private static final float f_33429 = 64.0F;
   private static final float f_33430 = 38.0F;
   private static final float f_33431 = 43.0F;
   private static final float f_33432 = 38.0F;
   private static final float f_33433 = 244.0F;
   private static final float f_33434 = 396.0F;
   private static final float f_33435 = 476.0F;
   private static final float f_33436 = 154.0F;
   private static final float f_33437 = 64.0F;
   private static final float f_33438 = 70.0F;
   private static final int f_33439 = 6;
   private static final int f_33440 = 4;
   private static final float f_33441 = 414.0F;
   private static final float f_33442 = 274.0F;
   private static final int f_33443 = -986118;
   private static final int f_33444 = -6576196;
   private static final int f_33445 = -13616564;
   private static final int[] f_33446 = new int[]{39, 38, 37, 36, 40};
   private static final String[] f_33447 = new String[]{Screen_10.f_34149, Screen_10.f_34150, Screen_10.f_34151, Screen_10.f_34152, Screen_10.f_34153};
   private final InventorySort f_33448;
   private final Class_w8fCJQ5ZtH5lQbWc f_33449;
   private List<InventorySort.mA278GQ37c0o7Z5q> f_33450;
   private List<InventorySort.mA278GQ37c0o7Z5q> f_33451;
   private float f_33452;
   private float f_33453;
   private float f_33454;
   private float f_33455;
   private float f_33456;
   private int f_33457;
   private int f_33458;
   private String f_33459;
   private String f_33460;
   private boolean f_33461;
   private int f_33462;
   private float f_33463;
   private Screen_10.fXJ2oHU7lrOs7X4T f_33464;
   private String f_33465;
   private String f_33466;
   private int f_33467;
   private int f_33468;
   private String f_33469;
   private boolean f_33470;
   private boolean f_33471;
   private int f_33472;
   private InventorySort.mA278GQ37c0o7Z5q f_33473;
   private InventorySort.moe13vRLIOivvpKs f_33474;
   private float f_33475;
   private float f_33476;
   private boolean f_33477;
   private static final String f_33478 = "InventorySort";
   private static final float f_33479 = 7.0F;
   private static final float f_33480 = 0.1F;
   private static final float f_33481 = 32.0F;
   private static final float f_33482 = 940.0F;
   private static final float f_33483 = 32.0F;
   private static final float f_33484 = 654.0F;
   private static final float f_33485 = 940.0F;
   private static final float f_33486 = 0.5F;
   private static final float f_33487 = 654.0F;
   private static final float f_33488 = 0.5F;
   private static final float f_33489 = 255.0F;
   private static final int f_33490 = -16777216;
   private static final int f_33491 = -5453057;
   private static final float f_33492 = 0.35F;
   private static final float f_33493 = 0.2F;
   private static final int f_33494 = 1711671568;
   private static final float f_33495 = 940.0F;
   private static final float f_33496 = 654.0F;
   private static final float f_33497 = 28.0F;
   private static final int f_33498 = -1207959552;
   private static final float f_33499 = 940.0F;
   private static final float f_33500 = 654.0F;
   private static final float f_33501 = 18.0F;
   private static final float f_33502 = 20.0F;
   private static final float f_33503 = 940.0F;
   private static final float f_33504 = 654.0F;
   private static final float f_33505 = 20.0F;
   private static final int f_33506 = -233629403;
   private static final float f_33507 = 940.0F;
   private static final float f_33508 = 654.0F;
   private static final float f_33509 = 20.0F;
   private static final int f_33510 = -12958376;
   private static final float f_33511 = -1.0F;
   private static final float f_33512 = -1.0F;
   private static final float f_33513 = 64.0F;
   private static final float f_33514 = 64.0F;
   private static final float f_33515 = 24.0F;
   private static final float f_33516 = 24.0F;
   private static final float f_33517 = 40.0F;
   private static final float f_33518 = 40.0F;
   private static final float f_33519 = 12.0F;
   private static final float f_33520 = 5.0F;
   private static final float f_33521 = 5.0F;
   private static final float f_33522 = 1.5F;
   private static final String f_33523 = "InventorySort";
   private static final float f_33524 = 78.0F;
   private static final float f_33525 = 23.0F;
   private static final int f_33526 = -986118;
   private static final String f_33527 = "Твой инвентарь. Твой порядок.";
   private static final float f_33528 = 79.0F;
   private static final float f_33529 = 52.0F;
   private static final int f_33530 = -6576196;
   private static final float f_33531 = 432.0F;
   private static final float f_33532 = 26.0F;
   private static final float f_33533 = 256.0F;
   private static final float f_33534 = 38.0F;
   private static final float f_33535 = 11.0F;
   private static final int f_33536 = -15788252;
   private static final float f_33537 = 436.0F;
   private static final float f_33538 = 126.0F;
   private static final float f_33539 = 566.0F;
   private static final float f_33540 = 118.0F;
   private static final float f_33541 = 706.0F;
   private static final float f_33542 = 30.0F;
   private static final float f_33543 = 142.0F;
   private static final float f_33544 = 28.0F;
   private static final float f_33545 = 14.0F;
   private static final int f_33546 = -14537667;
   private static final String f_33547 = " / 41 слотов";
   private static final float f_33548 = 706.0F;
   private static final float f_33549 = 38.0F;
   private static final float f_33550 = 142.0F;
   private static final int f_33551 = -6576196;
   private static final float f_33552 = 868.0F;
   private static final float f_33553 = 26.0F;
   private static final float f_33554 = 44.0F;
   private static final float f_33555 = 36.0F;
   private static final String f_33556 = "×";
   private static final float f_33557 = 24.0F;
   private static final float f_33558 = 84.0F;
   private static final float f_33559 = 892.0F;
   private static final int f_33560 = -13616564;
   private static final float f_33561 = 24.0F;
   private static final float f_33562 = 102.0F;
   private static final float f_33563 = 414.0F;
   private static final float f_33564 = 394.0F;
   private static final float f_33565 = 14.0F;
   private static final int f_33566 = -15130321;
   private static final String f_33567 = "01";
   private static final String f_33568 = "Раскладка";
   private static final float f_33569 = 38.0F;
   private static final float f_33570 = 114.0F;
   private static final String f_33571 = "ЭКИПИРОВКА";
   private static final float f_33572 = 38.0F;
   private static final float f_33573 = 145.0F;
   private static final int f_33574 = -6576196;
   private static final float f_33575 = 166.0F;
   private static final float f_33576 = 5.0F;
   private static final float f_33577 = 209.0F;
   private static final float f_33578 = 48.0F;
   private static final int f_33579 = -6576196;
   private static final String f_33580 = "ИНВЕНТАРЬ";
   private static final float f_33581 = 38.0F;
   private static final float f_33582 = 227.0F;
   private static final int f_33583 = -6576196;
   private static final float f_33584 = 38.0F;
   private static final float f_33585 = 43.0F;
   private static final float f_33586 = 244.0F;
   private static final float f_33587 = 43.0F;
   private static final String f_33588 = "БЫСТРЫЙ ДОСТУП";
   private static final float f_33589 = 38.0F;
   private static final float f_33590 = 376.0F;
   private static final int f_33591 = -6576196;
   private static final float f_33592 = 38.0F;
   private static final float f_33593 = 43.0F;
   private static final float f_33594 = 396.0F;
   private static final float f_33595 = 38.0F;
   private static final float f_33596 = 43.0F;
   private static final float f_33597 = 439.0F;
   private static final float f_33598 = 38.0F;
   private static final int f_33599 = -6576196;
   private static final String f_33600 = "Зажми ЛКМ и перетащи предмет в нужный слот";
   private static final float f_33601 = 38.0F;
   private static final float f_33602 = 458.0F;
   private static final int f_33603 = -6576196;
   private static final String f_33604 = "ПКМ / Del  очистить   ·   Ctrl+Z  отменить";
   private static final float f_33605 = 38.0F;
   private static final float f_33606 = 477.0F;
   private static final int f_33607 = -6576196;
   private static final float f_33608 = 30.0F;
   private static final float f_33609 = 30.0F;
   private static final float f_33610 = 30.0F;
   private static final float f_33611 = 30.0F;
   private static final float f_33612 = 8.0F;
   private static final int f_33613 = -14076085;
   private static final float f_33614 = 39.0F;
   private static final int f_33615 = -6576196;
   private static final float f_33616 = 24.0F;
   private static final float f_33617 = 100.0F;
   private static final float f_33618 = 282.0F;
   private static final float f_33619 = 36.0F;
   private static final float f_33620 = 226.0F;
   private static final float f_33621 = 38.0F;
   private static final float f_33622 = 111.0F;
   private static final int f_33623 = -986118;
   private static final String f_33624 = "−";
   private static final String f_33625 = "+";
   private static final float f_33626 = 281.0F;
   private static final float f_33627 = 111.0F;
   private static final float f_33628 = 320.0F;
   private static final float f_33629 = 100.0F;
   private static final float f_33630 = 176.0F;
   private static final float f_33631 = 36.0F;
   private static final String f_33632 = "Сохранить как…";
   private static final float f_33633 = 508.0F;
   private static final float f_33634 = 100.0F;
   private static final float f_33635 = 146.0F;
   private static final float f_33636 = 36.0F;
   private static final String f_33637 = "Переименовать";
   private static final float f_33638 = 666.0F;
   private static final float f_33639 = 100.0F;
   private static final float f_33640 = 94.0F;
   private static final float f_33641 = 36.0F;
   private static final String f_33642 = "Удалить";
   private static final float f_33643 = 796.0F;
   private static final float f_33644 = 114.0F;
   private static final float f_33645 = 6.0F;
   private static final float f_33646 = 6.0F;
   private static final float f_33647 = 3.0F;
   private static final int f_33648 = -7944026;
   private static final String f_33649 = "Сохранено";
   private static final float f_33650 = 812.0F;
   private static final float f_33651 = 111.0F;
   private static final int f_33652 = -7944026;
   private static final float f_33653 = 780.0F;
   private static final float f_33654 = 100.0F;
   private static final float f_33655 = 136.0F;
   private static final float f_33656 = 36.0F;
   private static final String f_33657 = "Повторить запись";
   private static final String f_33658 = "Изменения выбранного пресета сохраняются автоматически";
   private static final String f_33659 = "Не удалось сохранить на диск. Нажми «Повторить запись».";
   private static final float f_33660 = 38.0F;
   private static final float f_33661 = 143.0F;
   private static final int f_33662 = -6576196;
   private static final float f_33663 = 24.0F;
   private static final float f_33664 = 140.0F;
   private static final float f_33665 = 282.0F;
   private static final float f_33666 = 12.0F;
   private static final int f_33667 = -15788252;
   private static final float f_33668 = 24.0F;
   private static final float f_33669 = 140.0F;
   private static final float f_33670 = 282.0F;
   private static final float f_33671 = 12.0F;
   private static final int f_33672 = -11312518;
   private static final float f_33673 = 30.0F;
   private static final float f_33674 = 270.0F;
   private static final float f_33675 = 32.0F;
   private static final float f_33676 = 30.0F;
   private static final float f_33677 = 270.0F;
   private static final float f_33678 = 32.0F;
   private static final float f_33679 = 8.0F;
   private static final int f_33680 = -14076085;
   private static final float f_33681 = 232.0F;
   private static final float f_33682 = 42.0F;
   private static final float f_33683 = 10.0F;
   private static final int f_33684 = -986118;
   private static final float f_33685 = 281.0F;
   private static final float f_33686 = 14.0F;
   private static final float f_33687 = 5.0F;
   private static final float f_33688 = 5.0F;
   private static final float f_33689 = 2.5F;
   private static final float f_33690 = 302.0F;
   private static final float f_33691 = 148.0F;
   private static final float f_33692 = 214.0F;
   private static final float f_33693 = 940.0F;
   private static final float f_33694 = 654.0F;
   private static final float f_33695 = 20.0F;
   private static final int f_33696 = -1257697768;
   private static final float f_33697 = 252.0F;
   private static final float f_33698 = 436.0F;
   private static final float f_33699 = 226.0F;
   private static final float f_33700 = 16.0F;
   private static final int f_33701 = -15129806;
   private static final float f_33702 = 252.0F;
   private static final float f_33703 = 436.0F;
   private static final float f_33704 = 226.0F;
   private static final float f_33705 = 16.0F;
   private static final int f_33706 = -11312518;
   private static final String f_33707 = "Сохранить раскладку как…";
   private static final String f_33708 = "Переименовать пресет";
   private static final String f_33709 = "Удалить пресет?";
   private static final float f_33710 = 274.0F;
   private static final float f_33711 = 22.0F;
   private static final int f_33712 = -986118;
   private static final String f_33713 = "Новый пресет получит текущую раскладку";
   private static final String f_33714 = "Название до 32 символов";
   private static final String f_33715 = "Другие пресеты останутся на месте";
   private static final float f_33716 = 274.0F;
   private static final float f_33717 = 54.0F;
   private static final int f_33718 = -6576196;
   private static final float f_33719 = 352.0F;
   private static final float f_33720 = 274.0F;
   private static final float f_33721 = 94.0F;
   private static final int f_33722 = -986118;
   private static final float f_33723 = 274.0F;
   private static final float f_33724 = 82.0F;
   private static final float f_33725 = 392.0F;
   private static final float f_33726 = 38.0F;
   private static final float f_33727 = 9.0F;
   private static final int f_33728 = -15853788;
   private static final float f_33729 = 274.0F;
   private static final float f_33730 = 82.0F;
   private static final float f_33731 = 392.0F;
   private static final float f_33732 = 38.0F;
   private static final float f_33733 = 9.0F;
   private static final float f_33734 = 362.0F;
   private static final float f_33735 = 284.0F;
   private static final float f_33736 = 84.0F;
   private static final float f_33737 = 372.0F;
   private static final float f_33738 = 34.0F;
   private static final float f_33739 = 286.0F;
   private static final float f_33740 = 91.0F;
   private static final float f_33741 = 19.0F;
   private static final String f_33742 = "Например, Burrr";
   private static final float f_33743 = 286.0F;
   private static final float f_33744 = 94.0F;
   private static final int f_33745 = -6576196;
   private static final int f_33746 = -986118;
   private static final long f_33747 = 500L;
   private static final long f_33748 = 2L;
   private static final float f_33749 = 286.0F;
   private static final float f_33750 = 91.0F;
   private static final float f_33751 = 18.0F;
   private static final float f_33752 = 274.0F;
   private static final float f_33753 = 132.0F;
   private static final float f_33754 = 274.0F;
   private static final float f_33755 = 166.0F;
   private static final float f_33756 = 182.0F;
   private static final float f_33757 = 38.0F;
   private static final String f_33758 = "Отмена";
   private static final float f_33759 = 468.0F;
   private static final float f_33760 = 166.0F;
   private static final float f_33761 = 198.0F;
   private static final float f_33762 = 38.0F;
   private static final String f_33763 = "Удалить";
   private static final String f_33764 = "Сохранить";
   private static final float f_33765 = 38.0F;
   private static final float f_33766 = 38.0F;
   private static final float f_33767 = 38.0F;
   private static final float f_33768 = 38.0F;
   private static final float f_33769 = 9.0F;
   private static final int f_33770 = -13615791;
   private static final int f_33771 = -15656667;
   private static final float f_33772 = 38.0F;
   private static final float f_33773 = 38.0F;
   private static final float f_33774 = 9.0F;
   private static final int f_33775 = -10390643;
   private static final int f_33776 = -13616564;
   private static final float f_33777 = 38.0F;
   private static final float f_33778 = 38.0F;
   private static final float f_33779 = 9.0F;
   private static final int f_33780 = -7944026;
   private static final float f_33781 = 6.0F;
   private static final float f_33782 = 5.0F;
   private static final float f_33783 = 26.0F;
   private static final float f_33784 = 6.0F;
   private static final float f_33785 = 38.0F;
   private static final float f_33786 = 38.0F;
   private static final float f_33787 = 14.0F;
   private static final float f_33788 = 12.0F;
   private static final float f_33789 = 4.0F;
   private static final int f_33790 = -267578336;
   private static final float f_33791 = 38.0F;
   private static final float f_33792 = 38.0F;
   private static final float f_33793 = 13.0F;
   private static final int f_33794 = -986118;
   private static final String f_33795 = "+";
   private static final String f_33796 = "·";
   private static final float f_33797 = 11.0F;
   private static final float f_33798 = 38.0F;
   private static final int f_33799 = -12430998;
   private static final float f_33800 = 36.0F;
   private static final float f_33801 = 36.0F;
   private static final float f_33802 = 8.0F;
   private static final int f_33803 = -1609492187;
   private static final String f_33804 = "Перетащи сюда предмет или выбери справа";
   private static final String f_33805 = "ЛКМ: перетащить  ·  Колесо: количество";
   private static final float f_33806 = 458.0F;
   private static final float f_33807 = 102.0F;
   private static final float f_33808 = 458.0F;
   private static final float f_33809 = 334.0F;
   private static final float f_33810 = 14.0F;
   private static final int f_33811 = -15130321;
   private static final String f_33812 = "02";
   private static final String f_33813 = "Предметы";
   private static final float f_33814 = 476.0F;
   private static final float f_33815 = 114.0F;
   private static final float f_33816 = 678.0F;
   private static final float f_33817 = 111.0F;
   private static final float f_33818 = 216.0F;
   private static final float f_33819 = 28.0F;
   private static final float f_33820 = 8.0F;
   private static final int f_33821 = -15722203;
   private static final float f_33822 = 678.0F;
   private static final float f_33823 = 111.0F;
   private static final float f_33824 = 216.0F;
   private static final float f_33825 = 28.0F;
   private static final float f_33826 = 8.0F;
   private static final int f_33827 = -13616564;
   private static final float f_33828 = 686.0F;
   private static final float f_33829 = 116.0F;
   private static final float f_33830 = 174.0F;
   private static final float f_33831 = 17.0F;
   private static final String f_33832 = "Поиск предметов…";
   private static final float f_33833 = 174.0F;
   private static final float f_33834 = 687.0F;
   private static final float f_33835 = 120.0F;
   private static final int f_33836 = -6576196;
   private static final int f_33837 = -986118;
   private static final String f_33838 = "×";
   private static final float f_33839 = 875.0F;
   private static final float f_33840 = 118.0F;
   private static final int f_33841 = -6576196;
   private static final float f_33842 = 476.0F;
   private static final float f_33843 = 154.0F;
   private static final float f_33844 = 414.0F;
   private static final float f_33845 = 274.0F;
   private static final float f_33846 = 476.0F;
   private static final float f_33847 = 70.0F;
   private static final float f_33848 = 154.0F;
   private static final float f_33849 = 70.0F;
   private static final float f_33850 = 64.0F;
   private static final float f_33851 = 154.0F;
   private static final float f_33852 = 428.0F;
   private static final float f_33853 = 476.0F;
   private static final float f_33854 = 154.0F;
   private static final float f_33855 = 414.0F;
   private static final float f_33856 = 274.0F;
   private static final float f_33857 = 64.0F;
   private static final float f_33858 = 64.0F;
   private static final float f_33859 = 64.0F;
   private static final float f_33860 = 64.0F;
   private static final float f_33861 = 10.0F;
   private static final int f_33862 = -13615014;
   private static final int f_33863 = -14537668;
   private static final float f_33864 = 64.0F;
   private static final float f_33865 = 64.0F;
   private static final float f_33866 = 10.0F;
   private static final float f_33867 = 18.0F;
   private static final float f_33868 = 8.0F;
   private static final float f_33869 = 28.0F;
   private static final String f_33870 = "Перетащи в слот или нажми для выбора";
   private static final String f_33871 = "Ничего не найдено";
   private static final float f_33872 = 476.0F;
   private static final float f_33873 = 244.0F;
   private static final float f_33874 = 414.0F;
   private static final int f_33875 = -6576196;
   private static final float f_33876 = 75076.0F;
   private static final float f_33877 = 274.0F;
   private static final float f_33878 = 900.0F;
   private static final float f_33879 = 154.0F;
   private static final float f_33880 = 3.0F;
   private static final float f_33881 = 274.0F;
   private static final float f_33882 = 1.5F;
   private static final int f_33883 = -13616564;
   private static final float f_33884 = 900.0F;
   private static final float f_33885 = 154.0F;
   private static final float f_33886 = 274.0F;
   private static final float f_33887 = 3.0F;
   private static final float f_33888 = 1.5F;
   private static final float f_33889 = 58.0F;
   private static final String f_33890 = " ";
   private static final float f_33891 = 3.0F;
   private static final float f_33892 = 46.0F;
   private static final int f_33893 = -986118;
   private static final float f_33894 = 3.0F;
   private static final float f_33895 = 42.0F;
   private static final int f_33896 = -6576196;
   private static final float f_33897 = 3.0F;
   private static final float f_33898 = 53.0F;
   private static final int f_33899 = -986118;
   private static final float f_33900 = 458.0F;
   private static final float f_33901 = 446.0F;
   private static final float f_33902 = 458.0F;
   private static final float f_33903 = 50.0F;
   private static final float f_33904 = 12.0F;
   private static final int f_33905 = -14537408;
   private static final float f_33906 = 474.0F;
   private static final float f_33907 = 455.0F;
   private static final String f_33908 = "Нажми на предмет, чтобы назначить";
   private static final float f_33909 = 240.0F;
   private static final float f_33910 = 474.0F;
   private static final float f_33911 = 474.0F;
   private static final int f_33912 = -6576196;
   private static final int f_33913 = -986118;
   private static final float f_33914 = 786.0F;
   private static final float f_33915 = 455.0F;
   private static final float f_33916 = 28.0F;
   private static final float f_33917 = 30.0F;
   private static final String f_33918 = "−";
   private static final String f_33919 = "—";
   private static final float f_33920 = 819.0F;
   private static final float f_33921 = 464.0F;
   private static final float f_33922 = 42.0F;
   private static final int f_33923 = -986118;
   private static final float f_33924 = 866.0F;
   private static final float f_33925 = 455.0F;
   private static final float f_33926 = 28.0F;
   private static final float f_33927 = 30.0F;
   private static final String f_33928 = "+";
   private static final float f_33929 = 24.0F;
   private static final float f_33930 = 512.0F;
   private static final float f_33931 = 892.0F;
   private static final int f_33932 = -13616564;
   private static final float f_33933 = 24.0F;
   private static final float f_33934 = 530.0F;
   private static final float f_33935 = 204.0F;
   private static final float f_33936 = 38.0F;
   private static final String f_33937 = "Взять текущий инвентарь";
   private static final float f_33938 = 238.0F;
   private static final float f_33939 = 530.0F;
   private static final float f_33940 = 100.0F;
   private static final float f_33941 = 38.0F;
   private static final String f_33942 = "Очистить";
   private static final float f_33943 = 350.0F;
   private static final float f_33944 = 530.0F;
   private static final float f_33945 = 174.0F;
   private static final float f_33946 = 38.0F;
   private static final String f_33947 = "Отменить · Ctrl+Z";
   private static final String f_33948 = "Колесо: кол-во";
   private static final float f_33949 = 544.0F;
   private static final float f_33950 = 543.0F;
   private static final int f_33951 = -6576196;
   private static final float f_33952 = 704.0F;
   private static final float f_33953 = 528.0F;
   private static final float f_33954 = 212.0F;
   private static final float f_33955 = 42.0F;
   private static final String f_33956 = "Применить раскладку";
   private static final float f_33957 = 24.0F;
   private static final float f_33958 = 24.0F;
   private static final float f_33959 = 7.0F;
   private static final float f_33960 = 6.0F;
   private static final float f_33961 = 24.0F;
   private static final float f_33962 = 34.0F;
   private static final float f_33963 = 4.0F;
   private static final int f_33964 = -986118;
   private static final float f_33965 = 0.18F;
   private static final int f_33966 = -13286050;
   private static final int f_33967 = -14471874;
   private static final float f_33968 = 10.0F;
   private static final float f_33969 = 10.0F;
   private static final int f_33970 = -13616564;
   private static final float f_33971 = 12.0F;
   private static final float f_33972 = 0.5F;
   private static final int f_33973 = -9931123;
   private static final int f_33974 = -15722203;
   private static final int f_33975 = -986118;
   private static final float f_33976 = 300.0F;
   private static final float f_33977 = 300.0F;
   private static final float f_33978 = 24.0F;
   private static final float f_33979 = 14.0F;
   private static final float f_33980 = 8.0F;
   private static final float f_33981 = 940.0F;
   private static final float f_33982 = 8.0F;
   private static final float f_33983 = 18.0F;
   private static final float f_33984 = 8.0F;
   private static final float f_33985 = 600.0F;
   private static final float f_33986 = 46.0F;
   private static final float f_33987 = 10.0F;
   private static final int f_33988 = -15985888;
   private static final float f_33989 = 46.0F;
   private static final float f_33990 = 10.0F;
   private static final int f_33991 = -11312518;
   private static final float f_33992 = 12.0F;
   private static final float f_33993 = 8.0F;
   private static final int f_33994 = -986118;
   private static final float f_33995 = 12.0F;
   private static final float f_33996 = 27.0F;
   private static final int f_33997 = -6576196;
   private static final float f_33998 = 214.0F;
   private static final float f_33999 = 274.0F;
   private static final float f_34000 = 166.0F;
   private static final float f_34001 = 182.0F;
   private static final float f_34002 = 38.0F;
   private static final float f_34003 = 468.0F;
   private static final float f_34004 = 166.0F;
   private static final float f_34005 = 198.0F;
   private static final float f_34006 = 38.0F;
   private static final float f_34007 = 274.0F;
   private static final float f_34008 = 82.0F;
   private static final float f_34009 = 392.0F;
   private static final float f_34010 = 38.0F;
   private static final float f_34011 = 30.0F;
   private static final float f_34012 = 146.0F;
   private static final float f_34013 = 270.0F;
   private static final float f_34014 = 146.0F;
   private static final float f_34015 = 34.0F;
   private static final float f_34016 = 868.0F;
   private static final float f_34017 = 26.0F;
   private static final float f_34018 = 44.0F;
   private static final float f_34019 = 36.0F;
   private static final float f_34020 = 436.0F;
   private static final float f_34021 = 30.0F;
   private static final float f_34022 = 126.0F;
   private static final float f_34023 = 30.0F;
   private static final float f_34024 = 566.0F;
   private static final float f_34025 = 30.0F;
   private static final float f_34026 = 118.0F;
   private static final float f_34027 = 30.0F;
   private static final float f_34028 = 24.0F;
   private static final float f_34029 = 100.0F;
   private static final float f_34030 = 282.0F;
   private static final float f_34031 = 36.0F;
   private static final float f_34032 = 320.0F;
   private static final float f_34033 = 100.0F;
   private static final float f_34034 = 176.0F;
   private static final float f_34035 = 36.0F;
   private static final float f_34036 = 508.0F;
   private static final float f_34037 = 100.0F;
   private static final float f_34038 = 146.0F;
   private static final float f_34039 = 36.0F;
   private static final float f_34040 = 666.0F;
   private static final float f_34041 = 100.0F;
   private static final float f_34042 = 94.0F;
   private static final float f_34043 = 36.0F;
   private static final float f_34044 = 780.0F;
   private static final float f_34045 = 100.0F;
   private static final float f_34046 = 136.0F;
   private static final float f_34047 = 36.0F;
   private static final float f_34048 = 64.0F;
   private static final float f_34049 = 678.0F;
   private static final float f_34050 = 111.0F;
   private static final float f_34051 = 216.0F;
   private static final float f_34052 = 28.0F;
   private static final float f_34053 = 868.0F;
   private static final float f_34054 = 111.0F;
   private static final float f_34055 = 26.0F;
   private static final float f_34056 = 28.0F;
   private static final float f_34057 = 24.0F;
   private static final float f_34058 = 530.0F;
   private static final float f_34059 = 204.0F;
   private static final float f_34060 = 38.0F;
   private static final float f_34061 = 238.0F;
   private static final float f_34062 = 530.0F;
   private static final float f_34063 = 100.0F;
   private static final float f_34064 = 38.0F;
   private static final float f_34065 = 350.0F;
   private static final float f_34066 = 530.0F;
   private static final float f_34067 = 174.0F;
   private static final float f_34068 = 38.0F;
   private static final float f_34069 = 786.0F;
   private static final float f_34070 = 455.0F;
   private static final float f_34071 = 28.0F;
   private static final float f_34072 = 30.0F;
   private static final float f_34073 = 866.0F;
   private static final float f_34074 = 455.0F;
   private static final float f_34075 = 28.0F;
   private static final float f_34076 = 30.0F;
   private static final float f_34077 = 704.0F;
   private static final float f_34078 = 528.0F;
   private static final float f_34079 = 212.0F;
   private static final float f_34080 = 42.0F;
   private static final float f_34081 = 20.0F;
   private static final float f_34082 = 20.0F;
   private static final float f_34083 = 40.0F;
   private static final float f_34084 = 40.0F;
   private static final float f_34085 = 10.0F;
   private static final int f_34086 = -433967808;
   private static final float f_34087 = 20.0F;
   private static final float f_34088 = 20.0F;
   private static final float f_34089 = 40.0F;
   private static final float f_34090 = 40.0F;
   private static final float f_34091 = 10.0F;
   private static final float f_34092 = 15.0F;
   private static final float f_34093 = 16.0F;
   private static final float f_34094 = 30.0F;
   private static final float f_34095 = 8.0F;
   private static final float f_34096 = 9.0F;
   private static final int f_34097 = -986118;
   private static final float f_34098 = 64.0F;
   private static final float f_34099 = 16.0F;
   private static final float f_34100 = 64.0F;
   private static final float f_34101 = 16.0F;
   private static final float f_34102 = 64.0F;
   private static final float f_34103 = 476.0F;
   private static final float f_34104 = 154.0F;
   private static final float f_34105 = 414.0F;
   private static final float f_34106 = 274.0F;
   private static final float f_34107 = 70.0F;
   private static final float f_34108 = 166.0F;
   private static final float f_34109 = 38.0F;
   private static final float f_34110 = 38.0F;
   private static final float f_34111 = 38.0F;
   private static final float f_34112 = 43.0F;
   private static final float f_34113 = 244.0F;
   private static final float f_34114 = 43.0F;
   private static final float f_34115 = 38.0F;
   private static final float f_34116 = 38.0F;
   private static final float f_34117 = 38.0F;
   private static final float f_34118 = 43.0F;
   private static final float f_34119 = 396.0F;
   private static final float f_34120 = 38.0F;
   private static final float f_34121 = 38.0F;
   private static final float f_34122 = 476.0F;
   private static final float f_34123 = 154.0F;
   private static final float f_34124 = 414.0F;
   private static final float f_34125 = 274.0F;
   private static final float f_34126 = 476.0F;
   private static final float f_34127 = 70.0F;
   private static final float f_34128 = 154.0F;
   private static final float f_34129 = 70.0F;
   private static final float f_34130 = 64.0F;
   private static final float f_34131 = 64.0F;
   private static final float f_34132 = 70.0F;
   private static final float f_34133 = 6.0F;
   private static final float f_34134 = 274.0F;
   private static final float f_34135 = 382.0F;
   private static final float f_34136 = 38.0F;
   private static final float f_34137 = 57.0F;
   private static final String f_34138 = "Голова";
   private static final String f_34139 = "Корпус";
   private static final String f_34140 = "Ноги";
   private static final String f_34141 = "Ступни";
   private static final String f_34142 = "Левая рука";
   private static final String f_34143 = "Быстрый доступ · ";
   private static final String f_34144 = "Инвентарь · ";
   private static final int f_34145 = 16777215;
   private static final float f_34146 = 16.0F;
   private static final float f_34147 = 0.5F;
   private static final float f_34148 = 0.5F;
   private static final String f_34149 = "Голова";
   private static final String f_34150 = "Корпус";
   private static final String f_34151 = "Ноги";
   private static final String f_34152 = "Ступни";
   private static final String f_34153 = "Левая рука";

   public Screen_10(InventorySort var1) {
      super(Component.literal(f_33478));
      this.f_33449 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_33479, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_33450 = List.of();
      this.f_33451 = List.of();
      this.f_33454 = 1.0F;
      this.f_33464 = Screen_10.fXJ2oHU7lrOs7X4T.NONE;
      this.f_33465 = "";
      this.f_33466 = "";
      this.f_33469 = "";
      this.f_33472 = -1;
      this.f_33448 = var1;
   }

   private void openDialog(Screen_10.fXJ2oHU7lrOs7X4T var1) {
      this.cancelDrag();
      this.f_33470 = false;
      this.f_33461 = false;
      this.f_33464 = var1;
      this.f_33466 = "";
      this.f_33465 = var1 == Screen_10.fXJ2oHU7lrOs7X4T.RENAME ? this.f_33448.m_8593() : "";
      this.f_33467 = this.f_33465.length();
      this.f_33468 = 0;
   }

   private float m_9257(float var1) {
      return this.f_33453 + (var1 + this.f_33463) * this.f_33454;
   }

   private void confirmDialog() {
      try {
         switch (this.f_33464) {
            case CREATE:
               this.f_33448.m_8580(this.f_33465);
               break;
            case RENAME:
               this.f_33448.m_8527(this.f_33465);
               break;
            case DELETE:
               this.f_33448.m_8544();
               break;
            default:
               return;
         }

         this.f_33464 = Screen_10.fXJ2oHU7lrOs7X4T.NONE;
         this.refreshEntries();
      } catch (IllegalArgumentException var2) {
         this.f_33466 = var2.getMessage();
      }
   }

   public void onClose() {
      this.cancelDrag();
      super.onClose();
   }

   protected void init() {
      this.cancelDrag();
      this.refreshEntries();
      this.layout();
   }

   private static boolean hovered(Vector2f var0, float var1, float var2, float var3, float var4) {
      return var0.x >= var1 && var0.x < var1 + var3 && var0.y >= var2 && var0.y < var2 + var4;
   }

   public boolean mouseDragged(MouseButtonEvent var1, double var2, double var4) {
      if (var1.button() == 0 && this.f_33474 != null) {
         Vector2f var6 = this.mouse(var1.x(), var1.y());
         var6.y = var6.y - f_34098;
         if (var6.distanceSquared(this.f_33475, this.f_33476) >= f_34099) {
            this.f_33477 = true;
         }

         return true;
      } else {
         return super.mouseDragged(var1, var2, var4);
      }
   }

   private static float equipmentX(int var0) {
      return var0 == 4 ? f_34135 : f_34136 + var0 * f_34137;
   }

   private Vector2f mouse(double var1, double var3) {
      Vector2f var5 = Class_FvJXUGWpZo3zYBW4.m_2693(var1, var3);
      return new Vector2f((var5.x - this.f_33452) / this.f_33454, (var5.y - this.f_33453) / this.f_33454);
   }

   private void button(Vector2f var1, float var2, float var3, float var4, float var5, String var6, boolean var7, boolean var8) {
      boolean var9 = var8 && hovered(var1, var2, var3, var4, var5);
      int var10 = var7 && var8 ? (var9 ? Class_BftdentXEtGbugJw.m_2312(this.f_33458, -1, f_33965) : this.f_33458) : (var9 ? f_33966 : f_33967);
      this.rect(var2, var3, var4, var5, f_33968, var10);
      if (!var7) {
         this.outline(var2, var3, var4, var5, f_33969, var9 ? tint(this.f_33458, 140) : f_33970);
      }

      this.centered(var6, var2, var3 + (var5 - f_33971) * f_33972 - 1.0F, var4, 12, !var8 ? f_33973 : (var7 ? f_33974 : f_33975));
   }

   private void filterEntries() {
      String var1 = this.f_33469.toLowerCase(Locale.ROOT).replace('ё', 'е').strip();
      this.f_33450 = this.f_33451
         .stream()
         .filter(
            var1x -> var1x.label().toLowerCase(Locale.ROOT).replace('ё', 'е').contains(var1)
               || Class_0p152hWffX3ippAf.m_801(var1x.label()).toLowerCase(Locale.ROOT).replace('ё', 'е').contains(var1)
         )
         .toList();
      this.f_33455 = this.f_33456 = 0.0F;
   }

   private void drawPicker(Vector2f var1) {
      this.rect(f_33806, f_33807, f_33808, f_33809, f_33810, f_33811);
      this.section(f_33812, Class_0p152hWffX3ippAf.m_801(f_33813), f_33814, f_33815);
      this.rect(f_33816, f_33817, f_33818, f_33819, f_33820, f_33821);
      this.outline(f_33822, f_33823, f_33824, f_33825, f_33826, this.f_33470 ? this.f_33458 : f_33827);
      if (this.f_33470 && this.f_33471) {
         this.rect(f_33828, f_33829, f_33830, f_33831, 2.0F, tint(this.f_33458, 60));
      }

      this.text(
         Class_y1y6QpONhWEUIdEB.m_9590(),
         this.f_33469.isEmpty() ? Class_0p152hWffX3ippAf.m_801(f_33832) : fit(this.f_33469, f_33833, 11),
         f_33834,
         f_33835,
         11,
         this.f_33469.isEmpty() ? f_33836 : f_33837
      );
      if (!this.f_33469.isEmpty()) {
         this.text(Class_y1y6QpONhWEUIdEB.m_9588(), f_33838, f_33839, f_33840, 13, f_33841);
      }

      Class_Ssh31B3ljfKeWsvS.m_4860(this.m_9258(f_33842), this.m_9257(f_33843), f_33844 * this.f_33454, f_33845 * this.f_33454);

      try {
         for (int var2 = 0; var2 < this.f_33450.size(); var2++) {
            float var3 = f_33846 + var2 % 6 * f_33847;
            float var4 = f_33848 + var2 / 6 * f_33849 - this.f_33455;
            if (!(var4 + f_33850 <= f_33851) && !(var4 >= f_33852)) {
               InventorySort.mA278GQ37c0o7Z5q var5 = this.f_33450.get(var2);
               boolean var6 = hovered(var1, f_33853, f_33854, f_33855, f_33856) && hovered(var1, var3, var4, f_33857, f_33858);
               InventorySort.moe13vRLIOivvpKs var7 = this.f_33448.m_8595()[this.f_33457];
               boolean var8 = var7 != null && var7.kind() == var5.kind() && var7.name().equals(var5.name());
               this.rect(var3, var4, f_33859, f_33860, f_33861, var6 ? f_33862 : (var8 ? tint(this.f_33458, 28) : f_33863));
               if (var6 || var8) {
                  this.outline(var3, var4, f_33864, f_33865, f_33866, var6 ? this.f_33458 : tint(this.f_33458, 110));
               }

               this.stack(var5.stack(), var3 + f_33867, var4 + f_33868, f_33869);
               this.drawEntryLabel(Class_0p152hWffX3ippAf.m_801(var5.label()), var3, var4);
               if (var6) {
                  this.f_33459 = Class_0p152hWffX3ippAf.m_801(var5.label());
                  this.f_33460 = Class_0p152hWffX3ippAf.m_801(f_33870);
               }
            }
         }

         if (this.f_33450.isEmpty()) {
            this.centered(Class_0p152hWffX3ippAf.m_801(f_33871), f_33872, f_33873, f_33874, 13, f_33875);
         }
      } finally {
         Class_Ssh31B3ljfKeWsvS.m_4828();
      }

      if (this.maxScroll() > 0.0F) {
         float var12 = f_33876 / (f_33877 + this.maxScroll());
         this.rect(f_33878, f_33879, f_33880, f_33881, f_33882, f_33883);
         this.rect(f_33884, f_33885 + this.f_33455 / this.maxScroll() * (f_33886 - var12), f_33887, var12, f_33888, this.f_33458);
      }
   }

   private void drawPresetList(Vector2f var1) {
      List var2 = this.f_33448.m_8586();
      int var3 = Math.min(6, var2.size());
      this.f_33462 = Math.clamp(this.f_33462, 0, Math.max(0, var2.size() - var3));
      this.rect(f_33663, f_33664, f_33665, var3 * 34 + 12, f_33666, f_33667);
      this.outline(f_33668, f_33669, f_33670, var3 * 34 + 12, f_33671, f_33672);

      for (int var4 = 0; var4 < var3; var4++) {
         String var5 = (String)var2.get(this.f_33462 + var4);
         float var6 = 146 + var4 * 34;
         boolean var7 = var5.equals(this.f_33448.m_8593());
         if (var7 || hovered(var1, f_33673, var6, f_33674, f_33675)) {
            this.rect(f_33676, var6, f_33677, f_33678, f_33679, var7 ? tint(this.f_33458, 40) : f_33680);
         }

         this.text(Class_y1y6QpONhWEUIdEB.m_9588(), fit(var5, f_33681, 12), f_33682, var6 + f_33683, 12, var7 ? this.f_33458 : f_33684);
         if (var7) {
            this.rect(f_33685, var6 + f_33686, f_33687, f_33688, f_33689, this.f_33458);
         }
      }

      if (var2.size() > var3) {
         float var8 = var3 * 34 - 4;
         float var9 = var8 * var3 / var2.size();
         this.rect(f_33690, f_33691 + (var8 - var9) * this.f_33462 / (var2.size() - var3), 2.0F, var9, 1.0F, this.f_33458);
      }
   }

   private void drawDialog(Vector2f var1) {
      float var2 = f_33692;
      this.rect(0.0F, 0.0F, f_33693, f_33694, f_33695, f_33696);
      this.rect(f_33697, var2, f_33698, f_33699, f_33700, f_33701);
      this.outline(f_33702, var2, f_33703, f_33704, f_33705, f_33706);

      String var3 = switch (this.f_33464) {
         case CREATE -> Class_0p152hWffX3ippAf.m_801(f_33707);
         case RENAME -> Class_0p152hWffX3ippAf.m_801(f_33708);
         default -> Class_0p152hWffX3ippAf.m_801(f_33709);
      };
      this.text(Class_y1y6QpONhWEUIdEB.m_9588(), var3, f_33710, var2 + f_33711, 19, f_33712);
      this.text(
         Class_y1y6QpONhWEUIdEB.m_9590(),
         this.f_33464 == Screen_10.fXJ2oHU7lrOs7X4T.CREATE
            ? Class_0p152hWffX3ippAf.m_801(f_33713)
            : (this.f_33464 == Screen_10.fXJ2oHU7lrOs7X4T.RENAME ? Class_0p152hWffX3ippAf.m_801(f_33714) : Class_0p152hWffX3ippAf.m_801(f_33715)),
         f_33716,
         var2 + f_33717,
         12,
         f_33718
      );
      if (this.f_33464 == Screen_10.fXJ2oHU7lrOs7X4T.DELETE) {
         this.text(Class_y1y6QpONhWEUIdEB.m_9588(), fit(this.f_33448.m_8593(), f_33719, 15) + "", f_33720, var2 + f_33721, 15, f_33722);
      } else {
         this.rect(f_33723, var2 + f_33724, f_33725, f_33726, f_33727, f_33728);
         this.outline(f_33729, var2 + f_33730, f_33731, f_33732, f_33733, this.f_33458);
         int var4 = 0;

         while (var4 < this.f_33467 && textWidth(Class_y1y6QpONhWEUIdEB.m_9590(), this.f_33465.substring(var4, this.f_33467), 13) > f_33734) {
            var4 = this.f_33465.offsetByCodePoints(var4, 1);
         }

         Class_Ssh31B3ljfKeWsvS.m_4860(this.m_9258(f_33735), this.m_9257(var2 + f_33736), f_33737 * this.f_33454, f_33738 * this.f_33454);

         try {
            int var5 = Math.max(var4, Math.min(this.f_33467, this.f_33468));
            int var6 = Math.max(var4, Math.max(this.f_33467, this.f_33468));
            float var7 = f_33739 + textWidth(Class_y1y6QpONhWEUIdEB.m_9590(), this.f_33465.substring(var4, var5), 13);
            if (var5 != var6) {
               this.rect(
                  var7,
                  var2 + f_33740,
                  textWidth(Class_y1y6QpONhWEUIdEB.m_9590(), this.f_33465.substring(var5, var6), 13),
                  f_33741,
                  2.0F,
                  tint(this.f_33458, 75)
               );
            }

            this.text(
               Class_y1y6QpONhWEUIdEB.m_9590(),
               this.f_33465.isEmpty() ? Class_0p152hWffX3ippAf.m_801(f_33742) : this.f_33465.substring(var4),
               f_33743,
               var2 + f_33744,
               13,
               this.f_33465.isEmpty() ? f_33745 : f_33746
            );
            if (System.currentTimeMillis() / f_33747 % f_33748 == 0L) {
               this.rect(
                  f_33749 + textWidth(Class_y1y6QpONhWEUIdEB.m_9590(), this.f_33465.substring(var4, this.f_33467), 13),
                  var2 + f_33750,
                  1.0F,
                  f_33751,
                  0.0F,
                  this.f_33458
               );
            }
         } finally {
            Class_Ssh31B3ljfKeWsvS.m_4828();
         }
      }

      this.text(Class_y1y6QpONhWEUIdEB.m_9590(), Class_0p152hWffX3ippAf.m_801(this.f_33466), f_33752, var2 + f_33753, 11, -20310);
      this.button(var1, f_33754, var2 + f_33755, f_33756, f_33757, Class_0p152hWffX3ippAf.m_801(f_33758), false, true);
      this.button(
         var1,
         f_33759,
         var2 + f_33760,
         f_33761,
         f_33762,
         this.f_33464 == Screen_10.fXJ2oHU7lrOs7X4T.DELETE ? Class_0p152hWffX3ippAf.m_801(f_33763) : Class_0p152hWffX3ippAf.m_801(f_33764),
         true,
         true
      );
   }

   public boolean mouseScrolled(double var1, double var3, double var5, double var7) {
      if (this.f_33464 != Screen_10.fXJ2oHU7lrOs7X4T.NONE || this.f_33474 != null) {
         return true;
      }

      if (var7 == 0.0) {
         return false;
      }

      Vector2f var9 = this.mouse(var1, var3);
      if (this.f_33461) {
         this.f_33462 = Math.clamp(this.f_33462 + (var7 < 0.0 ? 1 : -1), 0, Math.max(0, this.f_33448.m_8586().size() - 6));
         return true;
      }

      var9.y = var9.y - f_34102;
      int var10 = this.inventorySlot(var9);
      if (var10 >= 0) {
         this.f_33457 = var10;
         this.f_33448.m_8539(var10, var7 > 0.0 ? 1 : -1);
      } else if (hovered(var9, f_34103, f_34104, f_34105, f_34106)) {
         this.f_33456 = Math.clamp(this.f_33456 - (float)var7 * f_34107, 0.0F, this.maxScroll());
      }

      return true;
   }

   private void drawEntryLabel(String var1, float var2, float var3) {
      float var4 = f_33889;
      if (!(textWidth(Class_y1y6QpONhWEUIdEB.m_9588(), var1, 10) <= var4) && var1.contains(f_33890)) {
         int var5 = var1.indexOf(32);

         for (int var6 = var1.indexOf(32, var5 + 1);
            var6 >= 0 && !(textWidth(Class_y1y6QpONhWEUIdEB.m_9588(), var1.substring(0, var6), 9) > var4);
            var6 = var1.indexOf(32, var6 + 1)
         ) {
            var5 = var6;
         }

         this.centered(fit(var1.substring(0, var5), var4, 9), var2 + f_33894, var3 + f_33895, var4, 9, f_33896);
         this.centered(fit(var1.substring(var5 + 1), var4, 9), var2 + f_33897, var3 + f_33898, var4, 9, f_33899);
      } else {
         this.centered(fit(var1, var4, 10), var2 + f_33891, var3 + f_33892, var4, 10, f_33893);
      }
   }

   private float m_9258(float var1) {
      return this.f_33452 + var1 * this.f_33454;
   }

   private void drawTooltip(Vector2f var1) {
      if (this.f_33459 != null) {
         String var2 = fit(this.f_33459, f_33976, 12);
         String var3 = fit(this.f_33460 == null ? "" : this.f_33460, f_33977, 10);
         float var4 = Math.max(textWidth(Class_y1y6QpONhWEUIdEB.m_9588(), var2, 12), textWidth(Class_y1y6QpONhWEUIdEB.m_9588(), var3, 10)) + f_33978;
         float var5 = Math.clamp(var1.x + f_33979, f_33980, f_33981 - var4 - f_33982);
         float var6 = Math.clamp(var1.y + f_33983, f_33984, f_33985);
         this.rect(var5, var6, var4, f_33986, f_33987, f_33988);
         this.outline(var5, var6, var4, f_33989, f_33990, f_33991);
         this.text(Class_y1y6QpONhWEUIdEB.m_9588(), var2, var5 + f_33992, var6 + f_33993, 12, f_33994);
         this.text(Class_y1y6QpONhWEUIdEB.m_9588(), var3, var5 + f_33995, var6 + f_33996, 10, f_33997);
      }
   }

   private int inventorySlot(Vector2f var1) {
      for (int var2 = 0; var2 < f_33446.length; var2++) {
         if (hovered(var1, equipmentX(var2), f_34108, f_34109, f_34110)) {
            return f_33446[var2];
         }
      }

      for (int var3 = 0; var3 < 27; var3++) {
         if (hovered(var1, f_34111 + var3 % 9 * f_34112, f_34113 + var3 / 9 * f_34114, f_34115, f_34116)) {
            return var3 + 9;
         }
      }

      for (int var4 = 0; var4 < 9; var4++) {
         if (hovered(var1, f_34117 + var4 * f_34118, f_34119, f_34120, f_34121)) {
            return var4;
         }
      }

      return -1;
   }

   private boolean dialogKey(KeyEvent var1) {
      int var2 = var1.key();
      if (var2 == 256) {
         this.f_33464 = Screen_10.fXJ2oHU7lrOs7X4T.NONE;
         return true;
      }

      if (var2 == 257 || var2 == 335) {
         this.confirmDialog();
         return true;
      }

      if (this.f_33464 == Screen_10.fXJ2oHU7lrOs7X4T.DELETE) {
         return true;
      }

      boolean var3 = (var1.modifiers() & 2) != 0;
      boolean var4 = (var1.modifiers() & 1) != 0;
      if (var3 && var2 == 65) {
         this.f_33468 = 0;
         this.f_33467 = this.f_33465.length();
      } else if (var3 && var2 == 86) {
         this.insertName(this.minecraft.keyboardHandler.getClipboard());
      } else if (!var3 || var2 != 67 && var2 != 88) {
         if (var2 != 259 && var2 != 261) {
            if (var2 == 268 || var2 == 269 || var2 == 263 || var2 == 262) {
               if (var2 == 268) {
                  this.f_33467 = 0;
               } else if (var2 == 269) {
                  this.f_33467 = this.f_33465.length();
               } else if (!var4 && this.f_33467 != this.f_33468) {
                  this.f_33467 = var2 == 263 ? Math.min(this.f_33467, this.f_33468) : Math.max(this.f_33467, this.f_33468);
               } else if (var2 == 263 && this.f_33467 > 0) {
                  this.f_33467 = this.f_33465.offsetByCodePoints(this.f_33467, -1);
               } else if (var2 == 262 && this.f_33467 < this.f_33465.length()) {
                  this.f_33467 = this.f_33465.offsetByCodePoints(this.f_33467, 1);
               }

               if (!var4) {
                  this.f_33468 = this.f_33467;
               }
            }
         } else {
            if (this.f_33467 == this.f_33468) {
               if (var2 == 259 && this.f_33467 > 0) {
                  this.f_33468 = this.f_33465.offsetByCodePoints(this.f_33467, -1);
               }

               if (var2 == 261 && this.f_33467 < this.f_33465.length()) {
                  this.f_33468 = this.f_33465.offsetByCodePoints(this.f_33467, 1);
               }
            }

            this.insertName("");
         }
      } else if (this.f_33467 != this.f_33468) {
         this.minecraft.keyboardHandler.setClipboard(this.f_33465.substring(Math.min(this.f_33467, this.f_33468), Math.max(this.f_33467, this.f_33468)));
         if (var2 == 88) {
            this.insertName("");
         }
      }

      return true;
   }

   private static String slotName(int var0) {
      return switch (var0) {
         case 36 -> Class_0p152hWffX3ippAf.m_801(f_34141);
         case 37 -> Class_0p152hWffX3ippAf.m_801(f_34140);
         case 38 -> Class_0p152hWffX3ippAf.m_801(f_34139);
         case 39 -> Class_0p152hWffX3ippAf.m_801(f_34138);
         case 40 -> Class_0p152hWffX3ippAf.m_801(f_34142);
         default -> var0 < 9 ? Class_0p152hWffX3ippAf.m_801(f_34143) + (var0 + 1) : Class_0p152hWffX3ippAf.m_801(f_34144) + (var0 - 8);
      };
   }

   private void stack(ItemStack var1, float var2, float var3, float var4) {
      Class_Ssh31B3ljfKeWsvS.m_4851(var1, this.m_9258(var2), this.m_9257(var3), var4 / f_34146 * this.f_33454, false);
   }

   private float maxScroll() {
      int var1 = (this.f_33450.size() + 6 - 1) / 6;
      return Math.max(0.0F, var1 * f_34132 - f_34133 - f_34134);
   }

   public boolean charTyped(CharacterEvent var1) {
      if (this.f_33464 == Screen_10.fXJ2oHU7lrOs7X4T.CREATE || this.f_33464 == Screen_10.fXJ2oHU7lrOs7X4T.RENAME) {
         this.insertName(var1.codepointAsString());
         return true;
      } else if (this.f_33464 == Screen_10.fXJ2oHU7lrOs7X4T.NONE && this.f_33470 && !this.f_33461) {
         this.insertSearch(var1.codepointAsString());
         return true;
      } else {
         return this.f_33464 != Screen_10.fXJ2oHU7lrOs7X4T.NONE || super.charTyped(var1);
      }
   }

   private static String fit(String var0, float var1, int var2) {
      if (textWidth(Class_y1y6QpONhWEUIdEB.m_9588(), var0, var2) <= var1) {
         return var0;
      }

      int var3 = var0.length();

      while (var3 > 0 && textWidth(Class_y1y6QpONhWEUIdEB.m_9588(), var0.substring(0, var3) + "", var2) > var1) {
         var3--;
      }

      return var0.substring(0, var3) + "";
   }

   public boolean mouseClicked(MouseButtonEvent var1, boolean var2) {
      Vector2f var3 = this.mouse(var1.x(), var1.y());
      if (this.f_33474 != null && var1.button() != 0) {
         this.cancelDrag();
         return true;
      }

      if (this.f_33464 != Screen_10.fXJ2oHU7lrOs7X4T.NONE) {
         float var8 = f_33998;
         if (var1.button() == 0) {
            if (hovered(var3, f_33999, var8 + f_34000, f_34001, f_34002)) {
               this.f_33464 = Screen_10.fXJ2oHU7lrOs7X4T.NONE;
            } else if (hovered(var3, f_34003, var8 + f_34004, f_34005, f_34006)) {
               this.confirmDialog();
            } else if (this.f_33464 != Screen_10.fXJ2oHU7lrOs7X4T.DELETE && hovered(var3, f_34007, var8 + f_34008, f_34009, f_34010)) {
               this.f_33467 = this.f_33465.length();
               this.f_33468 = var2 ? 0 : this.f_33467;
            }
         }

         return true;
      } else if (this.f_33461) {
         if (var1.button() == 0 && hovered(var3, f_34011, f_34012, f_34013, Math.min(6, this.f_33448.m_8586().size()) * 34)) {
            int var7 = this.f_33462 + (int)((var3.y - f_34014) / f_34015);
            this.f_33448.m_8560(this.f_33448.m_8586().get(var7));
            this.f_33469 = "";
            this.refreshEntries();
         }

         this.f_33461 = false;
         return true;
      } else {
         if (var1.button() == 0) {
            this.cancelDrag();
            this.f_33470 = false;
            if (hovered(var3, f_34016, f_34017, f_34018, f_34019)) {
               this.onClose();
               return true;
            }

            if (hovered(var3, f_34020, f_34021, f_34022, f_34023)) {
               this.selectMode(Class_cxtVSustGMvg4Bq0.Znq8jzbHPgtGpXuG.REALLY_WORLD);
               return true;
            }

            if (hovered(var3, f_34024, f_34025, f_34026, f_34027)) {
               this.selectMode(Class_cxtVSustGMvg4Bq0.Znq8jzbHPgtGpXuG.FUNTIME);
               return true;
            }

            if (hovered(var3, f_34028, f_34029, f_34030, f_34031)) {
               this.f_33461 = true;
               this.f_33462 = Math.clamp(this.f_33448.m_8586().indexOf(this.f_33448.m_8593()), 0, Math.max(0, this.f_33448.m_8586().size() - 6));
               return true;
            }

            if (hovered(var3, f_34032, f_34033, f_34034, f_34035)) {
               this.openDialog(Screen_10.fXJ2oHU7lrOs7X4T.CREATE);
               return true;
            }

            if (hovered(var3, f_34036, f_34037, f_34038, f_34039)) {
               this.openDialog(Screen_10.fXJ2oHU7lrOs7X4T.RENAME);
               return true;
            }

            if (hovered(var3, f_34040, f_34041, f_34042, f_34043) && this.f_33448.m_8586().size() > 1) {
               this.openDialog(Screen_10.fXJ2oHU7lrOs7X4T.DELETE);
               return true;
            }

            if (hovered(var3, f_34044, f_34045, f_34046, f_34047) && !this.f_33448.m_8563()) {
               this.f_33448.m_8579();
               return true;
            }
         }

         var3.y = var3.y - f_34048;
         if (var1.button() == 0 && hovered(var3, f_34049, f_34050, f_34051, f_34052)) {
            this.f_33470 = true;
            this.f_33471 = var2;
            if (hovered(var3, f_34053, f_34054, f_34055, f_34056)) {
               this.f_33469 = "";
               this.filterEntries();
            }

            return true;
         } else {
            int var4 = this.inventorySlot(var3);
            if (var4 < 0 || var1.button() != 0 && var1.button() != 1) {
               if (var1.button() != 0) {
                  return super.mouseClicked(var1, var2);
               }

               int var5 = this.pickerEntry(var3);
               if (var5 >= 0) {
                  InventorySort.mA278GQ37c0o7Z5q var6 = this.f_33450.get(var5);
                  this.beginDrag(var3, -1, var6, new InventorySort.moe13vRLIOivvpKs(var6.stack(), var6.name(), 1, var6.kind()));
               } else if (hovered(var3, f_34057, f_34058, f_34059, f_34060)) {
                  this.f_33448.m_8569();
                  this.refreshEntries();
               } else if (hovered(var3, f_34061, f_34062, f_34063, f_34064)) {
                  this.f_33448.m_8574();
               } else if (hovered(var3, f_34065, f_34066, f_34067, f_34068)) {
                  this.f_33448.m_8583();
               } else if (hovered(var3, f_34069, f_34070, f_34071, f_34072)) {
                  this.f_33448.m_8539(this.f_33457, -1);
               } else if (hovered(var3, f_34073, f_34074, f_34075, f_34076)) {
                  this.f_33448.m_8539(this.f_33457, 1);
               } else if (hovered(var3, f_34077, f_34078, f_34079, f_34080) && this.f_33448.m_8532()) {
                  this.f_33448.m_8529();
                  this.onClose();
               }

               return true;
            } else {
               this.f_33457 = var4;
               if (var1.button() == 1) {
                  this.f_33448.m_8573(var4);
               } else if (this.f_33448.m_8595()[var4] != null) {
                  this.beginDrag(var3, var4, null, this.f_33448.m_8595()[var4]);
               }

               return true;
            }
         }
      }
   }

   private void drawPresetBar(Vector2f var1) {
      this.button(var1, f_33616, f_33617, f_33618, f_33619, "", false, true);
      this.text(Class_y1y6QpONhWEUIdEB.m_9588(), fit(this.f_33448.m_8593(), f_33620, 13), f_33621, f_33622, 13, f_33623);
      this.text(Class_y1y6QpONhWEUIdEB.m_9588(), this.f_33461 ? f_33624 : f_33625, f_33626, f_33627, 13, this.f_33458);
      this.button(var1, f_33628, f_33629, f_33630, f_33631, Class_0p152hWffX3ippAf.m_801(f_33632), false, true);
      this.button(var1, f_33633, f_33634, f_33635, f_33636, Class_0p152hWffX3ippAf.m_801(f_33637), false, true);
      this.button(var1, f_33638, f_33639, f_33640, f_33641, Class_0p152hWffX3ippAf.m_801(f_33642), false, this.f_33448.m_8586().size() > 1);
      if (this.f_33448.m_8563()) {
         this.rect(f_33643, f_33644, f_33645, f_33646, f_33647, f_33648);
         this.text(Class_y1y6QpONhWEUIdEB.m_9588(), Class_0p152hWffX3ippAf.m_801(f_33649), f_33650, f_33651, 12, f_33652);
      } else {
         this.button(var1, f_33653, f_33654, f_33655, f_33656, Class_0p152hWffX3ippAf.m_801(f_33657), false, true);
      }

      this.text(
         Class_y1y6QpONhWEUIdEB.m_9590(),
         this.f_33448.m_8563() ? Class_0p152hWffX3ippAf.m_801(f_33658) : Class_0p152hWffX3ippAf.m_801(f_33659),
         f_33660,
         f_33661,
         10,
         this.f_33448.m_8563() ? f_33662 : -20310
      );
   }

   private void insertSearch(String var1) {
      if (this.f_33471) {
         this.f_33469 = "";
      }

      this.f_33471 = false;
      StringBuilder var2 = new StringBuilder(this.f_33469);
      var1.codePoints()
         .filter(var0 -> !Character.isISOControl(var0) && var0 != 167)
         .limit(Math.max(0, 40 - this.f_33469.codePointCount(0, this.f_33469.length())))
         .forEach(var2::appendCodePoint);
      this.f_33469 = var2.toString();
      this.filterEntries();
   }

   private void drawFooter(Vector2f var1) {
      this.rect(f_33929, f_33930, f_33931, 1.0F, 0.0F, f_33932);
      this.button(var1, f_33933, f_33934, f_33935, f_33936, Class_0p152hWffX3ippAf.m_801(f_33937), false, true);
      this.button(var1, f_33938, f_33939, f_33940, f_33941, Class_0p152hWffX3ippAf.m_801(f_33942), false, this.f_33448.m_8532());
      this.button(var1, f_33943, f_33944, f_33945, f_33946, Class_0p152hWffX3ippAf.m_801(f_33947), false, this.f_33448.m_8561());
      this.text(Class_y1y6QpONhWEUIdEB.m_9590(), Class_0p152hWffX3ippAf.m_801(f_33948), f_33949, f_33950, 11, f_33951);
      this.button(var1, f_33952, f_33953, f_33954, f_33955, Class_0p152hWffX3ippAf.m_801(f_33956), true, this.f_33448.m_8532());
   }

   private void rect(float var1, float var2, float var3, float var4, float var5, int var6) {
      Class_Ssh31B3ljfKeWsvS.m_4817(this.m_9258(var1), this.m_9257(var2), var3 * this.f_33454, var4 * this.f_33454, var5 * this.f_33454, var6);
   }

   private void text(Class_jZQ0pP9BTU3L7miy var1, String var2, float var3, float var4, int var5, int var6) {
      Class_Ssh31B3ljfKeWsvS.m_4857(var1, var2, this.m_9258(var3), this.m_9257(var4), var5 * this.f_33454, var6, 0.0F, f_34147, 1.0F);
   }

   private void drawInventory(Vector2f var1) {
      this.rect(f_33561, f_33562, f_33563, f_33564, f_33565, f_33566);
      this.section(f_33567, Class_0p152hWffX3ippAf.m_801(f_33568), f_33569, f_33570);
      this.text(Class_y1y6QpONhWEUIdEB.m_9590(), Class_0p152hWffX3ippAf.m_801(f_33571), f_33572, f_33573, 10, f_33574);

      for (int var2 = 0; var2 < f_33446.length; var2++) {
         float var3 = equipmentX(var2);
         this.drawSlot(var1, f_33446[var2], var3, f_33575);
         this.centered(Class_0p152hWffX3ippAf.m_801(f_33447[var2]), var3 - f_33576, f_33577, f_33578, 9, f_33579);
      }

      this.text(Class_y1y6QpONhWEUIdEB.m_9590(), Class_0p152hWffX3ippAf.m_801(f_33580), f_33581, f_33582, 10, f_33583);

      for (int var4 = 0; var4 < 27; var4++) {
         this.drawSlot(var1, var4 + 9, f_33584 + var4 % 9 * f_33585, f_33586 + var4 / 9 * f_33587);
      }

      this.text(Class_y1y6QpONhWEUIdEB.m_9590(), Class_0p152hWffX3ippAf.m_801(f_33588), f_33589, f_33590, 10, f_33591);

      for (int var5 = 0; var5 < 9; var5++) {
         this.drawSlot(var1, var5, f_33592 + var5 * f_33593, f_33594);
         this.centered(String.valueOf(var5 + 1), f_33595 + var5 * f_33596, f_33597, f_33598, 10, this.f_33457 == var5 ? this.f_33458 : f_33599);
      }

      this.text(Class_y1y6QpONhWEUIdEB.m_9590(), Class_0p152hWffX3ippAf.m_801(f_33600), f_33601, f_33602, 11, f_33603);
      this.text(Class_y1y6QpONhWEUIdEB.m_9590(), Class_0p152hWffX3ippAf.m_801(f_33604), f_33605, f_33606, 10, f_33607);
   }

   private static int tint(int var0, int var1) {
      return var0 & f_34145 | var1 << 24;
   }

   private void selectMode(Class_cxtVSustGMvg4Bq0.Znq8jzbHPgtGpXuG var1) {
      this.cancelDrag();
      this.f_33469 = "";
      this.f_33470 = this.f_33471 = false;
      this.f_33448.m_8567(var1);
      this.refreshEntries();
   }

   public boolean keyPressed(KeyEvent var1) {
      if (this.f_33464 != Screen_10.fXJ2oHU7lrOs7X4T.NONE) {
         return this.dialogKey(var1);
      }

      if (this.f_33474 != null && var1.key() == 256) {
         this.cancelDrag();
         return true;
      }

      if (this.f_33461) {
         if (var1.key() == 256) {
            this.f_33461 = false;
         }

         return true;
      } else {
         boolean var2 = (var1.modifiers() & 2) != 0;
         if (!var2 || var1.key() != 90 && var1.key() != 89) {
            if (!this.f_33470) {
               if (var1.key() != 261 && var1.key() != 259) {
                  return super.keyPressed(var1);
               }

               this.f_33448.m_8573(this.f_33457);
               return true;
            } else {
               if (var1.key() == 256 || var1.key() == 257) {
                  this.f_33470 = false;
               } else if (var2 && var1.key() == 65) {
                  this.f_33471 = true;
               } else if (var2 && var1.key() == 86) {
                  this.insertSearch(this.minecraft.keyboardHandler.getClipboard());
               } else if (var1.key() == 259 || var1.key() == 261) {
                  if (this.f_33471) {
                     this.f_33469 = "";
                  } else if (!this.f_33469.isEmpty()) {
                     this.f_33469 = this.f_33469.substring(0, this.f_33469.offsetByCodePoints(this.f_33469.length(), -1));
                  }

                  this.f_33471 = false;
                  this.filterEntries();
               }

               return true;
            }
         } else {
            this.cancelDrag();
            if (var1.key() != 89 && (var1.modifiers() & 1) == 0) {
               this.f_33448.m_8583();
            } else {
               this.f_33448.m_8534();
            }

            return true;
         }
      }
   }

   public void clearFocus() {
   }

   private boolean validDrop(int var1) {
      return this.f_33474 != null && (this.f_33472 >= 0 ? this.f_33448.m_8538(this.f_33472, var1) : this.f_33448.m_8554(var1, this.f_33474.stack()));
   }

   public boolean mouseReleased(MouseButtonEvent var1) {
      if (var1.button() == 0 && this.f_33474 != null) {
         Vector2f var2 = this.mouse(var1.x(), var1.y());
         var2.y = var2.y - f_34100;
         this.f_33477 = this.f_33477 | var2.distanceSquared(this.f_33475, this.f_33476) >= f_34101;
         int var3 = this.inventorySlot(var2);
         if (this.f_33477 && this.validDrop(var3)) {
            if (this.f_33472 >= 0) {
               this.f_33448.m_8525(this.f_33472, var3);
            } else {
               this.f_33448.m_8526(var3, this.f_33473.stack(), this.f_33473.name(), this.f_33473.kind());
            }

            this.f_33457 = var3;
         } else if (!this.f_33477 && this.f_33473 != null) {
            int var4 = this.pickerEntry(var2);
            if (var4 >= 0 && this.f_33450.get(var4) == this.f_33473) {
               this.f_33448.m_8526(this.f_33457, this.f_33473.stack(), this.f_33473.name(), this.f_33473.kind());
            }
         }

         this.cancelDrag();
         return true;
      } else {
         return super.mouseReleased(var1);
      }
   }

   private void insertName(String var1) {
      int var2 = Math.min(this.f_33467, this.f_33468);
      int var3 = Math.max(this.f_33467, this.f_33468);
      int var4 = 32 - this.f_33465.codePointCount(0, var2) - this.f_33465.codePointCount(var3, this.f_33465.length());
      StringBuilder var5 = new StringBuilder();
      var1.codePoints().filter(var0 -> !Character.isISOControl(var0) && var0 != 167).limit(Math.max(0, var4)).forEach(var5::appendCodePoint);
      this.f_33465 = this.f_33465.substring(0, var2) + var5 + this.f_33465.substring(var3);
      this.f_33467 = var2 + var5.length();
      this.f_33468 = this.f_33467;
      this.f_33466 = "";
   }

   private int pickerEntry(Vector2f var1) {
      if (!hovered(var1, f_34122, f_34123, f_34124, f_34125)) {
         return -1;
      }

      for (int var2 = 0; var2 < this.f_33450.size(); var2++) {
         if (hovered(var1, f_34126 + var2 % 6 * f_34127, f_34128 + var2 / 6 * f_34129 - this.f_33455, f_34130, f_34131)) {
            return var2;
         }
      }

      return -1;
   }

   private void outline(float var1, float var2, float var3, float var4, float var5, int var6) {
      Class_Ssh31B3ljfKeWsvS.m_4854(this.m_9258(var1), this.m_9257(var2), var3 * this.f_33454, var4 * this.f_33454, this.f_33454, var5 * this.f_33454, var6);
   }

   private static float textWidth(Class_jZQ0pP9BTU3L7miy var0, String var1, int var2) {
      return Class_Ssh31B3ljfKeWsvS.m_4847(var0, var1, var2);
   }

   public boolean isPauseScreen() {
      return false;
   }

   private void cancelDrag() {
      this.f_33472 = -1;
      this.f_33473 = null;
      this.f_33474 = null;
      this.f_33477 = false;
      this.setDragging(false);
   }

   private void beginDrag(Vector2f var1, int var2, InventorySort.mA278GQ37c0o7Z5q var3, InventorySort.moe13vRLIOivvpKs var4) {
      this.f_33472 = var2;
      this.f_33473 = var3;
      this.f_33474 = var4;
      this.f_33475 = var1.x;
      this.f_33476 = var1.y;
      this.f_33477 = false;
      this.setDragging(true);
   }

   protected void extractBlurredBackground(GuiGraphicsExtractor var1) {
   }

   public void extractRenderState(GuiGraphicsExtractor var1, int var2, int var3, float var4) {
      this.layout();
      Class_Ssh31B3ljfKeWsvS.m_4815();
      Class_Ssh31B3ljfKeWsvS.m_4830();
      this.f_33449.m_9283(1.0F);
      Class_Ssh31B3ljfKeWsvS.m_4864(f_33489 * Math.clamp(this.f_33449.m_9288(), 0.0F, 1.0F));

      try {
         Vector2f var5 = this.mouse(var2, var3);
         this.f_33459 = null;
         this.f_33460 = null;
         this.f_33458 = Class_BftdentXEtGbugJw.m_2312(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) | f_33490, f_33491, f_33492);
         this.f_33456 = Math.clamp(this.f_33456, 0.0F, this.maxScroll());
         this.f_33455 = this.f_33455 + (this.f_33456 - this.f_33455) * f_33493;
         Class_Ssh31B3ljfKeWsvS.m_4817(0.0F, 0.0F, this.minecraft.getWindow().getScreenWidth(), this.minecraft.getWindow().getScreenHeight(), 0.0F, f_33494);
         Class_Ssh31B3ljfKeWsvS.m_4859(this.f_33452, this.f_33453, f_33495 * this.f_33454, f_33496 * this.f_33454, f_33497 * this.f_33454, f_33498);
         Class_Ssh31B3ljfKeWsvS.m_4858(this.f_33452, this.f_33453, f_33499 * this.f_33454, f_33500 * this.f_33454, f_33501, f_33502 * this.f_33454, -1);
         this.rect(0.0F, 0.0F, f_33503, f_33504, f_33505, f_33506);
         this.outline(0.0F, 0.0F, f_33507, f_33508, f_33509, f_33510);
         this.drawHeader(var5);
         this.drawPresetBar(var5);
         Vector2f var6 = this.f_33464 == Screen_10.fXJ2oHU7lrOs7X4T.NONE && !this.f_33461
            ? new Vector2f(var5.x, var5.y - f_33513)
            : new Vector2f(f_33511, f_33512);
         this.f_33463 = f_33514;
         this.drawInventory(var6);
         this.drawPicker(var6);
         this.drawSelection(var6);
         this.drawFooter(var6);
         this.f_33463 = 0.0F;
         if (this.f_33477) {
            this.drawDrag(var5);
         } else if (this.f_33464 == Screen_10.fXJ2oHU7lrOs7X4T.NONE && !this.f_33461) {
            this.drawTooltip(var5);
         }

         if (this.f_33461) {
            this.drawPresetList(var5);
         }

         if (this.f_33464 != Screen_10.fXJ2oHU7lrOs7X4T.NONE) {
            this.drawDialog(var5);
         }
      } finally {
         this.f_33463 = 0.0F;
         Class_Ssh31B3ljfKeWsvS.m_4830();
         Class_Ssh31B3ljfKeWsvS.m_4844();
         Class_Ssh31B3ljfKeWsvS.m_4815();
      }
   }

   private void refreshEntries() {
      this.f_33451 = this.f_33448.m_8546();
      this.filterEntries();
   }

   private void layout() {
      float var1 = this.minecraft.getWindow().getScreenWidth();
      float var2 = this.minecraft.getWindow().getScreenHeight();
      this.f_33454 = Math.max(f_33480, Math.min(1.0F, Math.min((var1 - f_33481) / f_33482, (var2 - f_33483) / f_33484)));
      this.f_33452 = (var1 - f_33485 * this.f_33454) * f_33486;
      this.f_33453 = (var2 - f_33487 * this.f_33454) * f_33488;
   }

   private void drawDrag(Vector2f var1) {
      if (this.f_33474 != null) {
         this.rect(var1.x - f_34081, var1.y - f_34082, f_34083, f_34084, f_34085, f_34086);
         this.outline(var1.x - f_34087, var1.y - f_34088, f_34089, f_34090, f_34091, this.f_33458);
         this.stack(this.f_33474.stack(), var1.x - f_34092, var1.y - f_34093, f_34094);
         if (this.f_33474.count() > 1) {
            this.text(Class_y1y6QpONhWEUIdEB.m_9588(), String.valueOf(this.f_33474.count()), var1.x + f_34095, var1.y + f_34096, 10, f_34097);
         }
      }
   }

   private void drawHeader(Vector2f var1) {
      this.rect(f_33515, f_33516, f_33517, f_33518, f_33519, tint(this.f_33458, 36));

      for (int var2 = 0; var2 < 9; var2++) {
         this.rect(34 + var2 % 3 * 8, 34 + var2 / 3 * 8, f_33520, f_33521, f_33522, this.f_33458);
      }

      this.text(Class_y1y6QpONhWEUIdEB.m_9588(), f_33523, f_33524, f_33525, 23, f_33526);
      this.text(Class_y1y6QpONhWEUIdEB.m_9590(), Class_0p152hWffX3ippAf.m_801(f_33527), f_33528, f_33529, 12, f_33530);
      this.rect(f_33531, f_33532, f_33533, f_33534, f_33535, f_33536);
      this.modeButton(var1, f_33537, f_33538, Class_cxtVSustGMvg4Bq0.Znq8jzbHPgtGpXuG.REALLY_WORLD);
      this.modeButton(var1, f_33539, f_33540, Class_cxtVSustGMvg4Bq0.Znq8jzbHPgtGpXuG.FUNTIME);
      int var7 = 0;

      for (InventorySort.moe13vRLIOivvpKs var6 : this.f_33448.m_8595()) {
         if (var6 != null && !var6.stack().isEmpty()) {
            var7++;
         }
      }

      this.rect(f_33541, f_33542, f_33543, f_33544, f_33545, f_33546);
      this.centered(var7 + Class_0p152hWffX3ippAf.m_801(f_33547), f_33548, f_33549, f_33550, 12, f_33551);
      this.button(var1, f_33552, f_33553, f_33554, f_33555, f_33556, false, true);
      this.rect(f_33557, f_33558, f_33559, 1.0F, 0.0F, f_33560);
   }

   private void section(String var1, String var2, float var3, float var4) {
      this.rect(var3, var4, f_33957, f_33958, f_33959, tint(this.f_33458, 28));
      this.centered(var1, var3, var4 + f_33960, f_33961, 11, this.f_33458);
      this.text(Class_y1y6QpONhWEUIdEB.m_9588(), var2, var3 + f_33962, var4 + f_33963, 16, f_33964);
   }

   private void drawSelection(Vector2f var1) {
      InventorySort.moe13vRLIOivvpKs var2 = this.f_33448.m_8595()[this.f_33457];
      this.rect(f_33900, f_33901, f_33902, f_33903, f_33904, f_33905);
      this.text(Class_y1y6QpONhWEUIdEB.m_9588(), slotName(this.f_33457), f_33906, f_33907, 12, this.f_33458);
      this.text(
         Class_y1y6QpONhWEUIdEB.m_9590(),
         var2 == null ? Class_0p152hWffX3ippAf.m_801(f_33908) : fit(Class_0p152hWffX3ippAf.m_801(var2.label()), f_33909, 11),
         f_33910,
         f_33911,
         11,
         var2 == null ? f_33912 : f_33913
      );
      this.button(var1, f_33914, f_33915, f_33916, f_33917, f_33918, false, var2 != null && var2.count() > 1);
      this.centered(var2 == null ? f_33919 : String.valueOf(var2.count()), f_33920, f_33921, f_33922, 12, f_33923);
      this.button(var1, f_33924, f_33925, f_33926, f_33927, f_33928, false, var2 != null && var2.count() < var2.stack().getMaxStackSize());
   }

   private void centered(String var1, float var2, float var3, float var4, int var5, int var6) {
      this.text(Class_y1y6QpONhWEUIdEB.m_9588(), var1, var2 + (var4 - textWidth(Class_y1y6QpONhWEUIdEB.m_9588(), var1, var5)) * f_34148, var3, var5, var6);
   }

   private void drawSlot(Vector2f var1, int var2, float var3, float var4) {
      boolean var5 = var2 == this.f_33457;
      boolean var6 = hovered(var1, var3, var4, f_33765, f_33766);
      this.rect(var3, var4, f_33767, f_33768, f_33769, var5 ? tint(this.f_33458, 42) : (var6 ? f_33770 : f_33771));
      this.outline(var3, var4, f_33772, f_33773, f_33774, var5 ? this.f_33458 : (var6 ? f_33775 : f_33776));
      if (this.f_33477 && var6) {
         this.outline(var3, var4, f_33777, f_33778, f_33779, this.validDrop(var2) ? f_33780 : -29299);
      }

      InventorySort.moe13vRLIOivvpKs var7 = this.f_33448.m_8595()[var2];
      if (var7 != null && !var7.stack().isEmpty()) {
         this.stack(var7.stack(), var3 + f_33781, var4 + f_33782, f_33783);
         if (var7.count() > 1) {
            String var8 = String.valueOf(var7.count());
            float var9 = textWidth(Class_y1y6QpONhWEUIdEB.m_9588(), var8, 10) + f_33784;
            this.rect(var3 + f_33785 - var9 - 2.0F, var4 + f_33786 - f_33787, var9, f_33788, f_33789, f_33790);
            this.text(Class_y1y6QpONhWEUIdEB.m_9588(), var8, var3 + f_33791 - var9 + 1.0F, var4 + f_33792 - f_33793, 10, f_33794);
         }
      } else {
         this.centered(var5 ? f_33795 : f_33796, var3, var4 + f_33797, f_33798, 17, var5 ? this.f_33458 : f_33799);
      }

      if (this.f_33477 && this.f_33472 == var2) {
         this.rect(var3 + 1.0F, var4 + 1.0F, f_33800, f_33801, f_33802, f_33803);
      }

      if (var6) {
         this.f_33459 = var7 == null ? slotName(var2) : Class_0p152hWffX3ippAf.m_801(var7.label());
         this.f_33460 = var7 == null ? Class_0p152hWffX3ippAf.m_801(f_33804) : Class_0p152hWffX3ippAf.m_801(f_33805);
      }
   }

   private void modeButton(Vector2f var1, float var2, float var3, Class_cxtVSustGMvg4Bq0.Znq8jzbHPgtGpXuG var4) {
      boolean var5 = this.f_33448.m_8571() == var4;
      if (var5 || hovered(var1, var2, f_33608, var3, f_33609)) {
         this.rect(var2, f_33610, var3, f_33611, f_33612, var5 ? tint(this.f_33458, 42) : f_33613);
      }

      this.centered(var4.m_6289(), var2, f_33614, var3, 12, var5 ? this.f_33458 : f_33615);
   }

   private enum fXJ2oHU7lrOs7X4T {
      NONE,
      CREATE,
      RENAME,
      DELETE;
   }
}
