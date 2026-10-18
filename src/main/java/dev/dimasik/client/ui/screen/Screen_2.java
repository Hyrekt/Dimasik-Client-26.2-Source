package dev.dimasik.client.ui.screen;

import com.mojang.blaze3d.textures.FilterMode;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_NzJrN63M7QBpmAbi;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_ZYgBPcxFNip8f3dv;
import dev.dimasik.client.system.Class_eXr9Fra2ad3yFXY8;
import dev.dimasik.client.system.Class_w8fCJQ5ZtH5lQbWc;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import dev.dimasik.mixin.MinecraftMixin_2;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.User;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.CharacterEvent;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.network.chat.Component;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector4f;
import org.joml.Vector4i;

public final class Screen_2 extends Screen implements Class_NzJrN63M7QBpmAbi {
   private static final float f_1680 = 799.0F;
   private static final float f_1681 = 437.0F;
   private static final float f_1682 = 175.0F;
   private static final float f_1683 = 177.0F;
   private static final float f_1684 = 48.0F;
   private static final float f_1685 = 16.0F;
   private static final float f_1686 = 14.0F;
   private static final DateTimeFormatter f_1687 = DateTimeFormatter.ofPattern(Screen_2.f_2017);
   private static final String[] f_1688 = new String[]{
      Screen_2.f_2018,
      Screen_2.f_2019,
      Screen_2.f_2020,
      Screen_2.f_2021,
      Screen_2.f_2022,
      Screen_2.f_2023,
      Screen_2.f_2024,
      Screen_2.f_2025,
      Screen_2.f_2026,
      Screen_2.f_2027,
      Screen_2.f_2028,
      Screen_2.f_2029,
      Screen_2.f_2030,
      Screen_2.f_2031,
      Screen_2.f_2032,
      Screen_2.f_2033
   };
   private static final String[] f_1689 = new String[]{
      Screen_2.f_2034,
      Screen_2.f_2035,
      Screen_2.f_2036,
      Screen_2.f_2037,
      Screen_2.f_2038,
      Screen_2.f_2039,
      Screen_2.f_2040,
      Screen_2.f_2041,
      Screen_2.f_2042,
      Screen_2.f_2043,
      Screen_2.f_2044,
      Screen_2.f_2045,
      Screen_2.f_2046,
      Screen_2.f_2047,
      Screen_2.f_2048,
      Screen_2.f_2049
   };
   private final Screen f_1690;
   private final Class_ZYgBPcxFNip8f3dv f_1691 = new Class_ZYgBPcxFNip8f3dv();
   private final List<Screen_2.BzfU4OcdweBlGNUF> f_1692 = new ArrayList<>();
   private final Class_w8fCJQ5ZtH5lQbWc f_1693;
   private final Class_w8fCJQ5ZtH5lQbWc f_1694;
   private final Class_w8fCJQ5ZtH5lQbWc f_1695;
   private final Class_w8fCJQ5ZtH5lQbWc f_1696;
   private final Class_w8fCJQ5ZtH5lQbWc[] f_1697;
   private final Class_w8fCJQ5ZtH5lQbWc[] f_1698;
   private String f_1699;
   private String f_1700;
   private boolean f_1701;
   private boolean f_1702;
   private boolean f_1703;
   private long f_1704;
   private long f_1705;
   private long f_1706;
   private float f_1707;
   private float f_1708;
   private long f_1709;
   private float f_1710;
   private float f_1711;
   private static final String f_1712 = "Account Manager";
   private static final float f_1713 = 5.5F;
   private static final float f_1714 = 9.0F;
   private static final float f_1715 = 8.0F;
   private static final float f_1716 = 8.0F;
   private static final float f_1717 = 9.0F;
   private static final float f_1718 = 9.0F;
   private static final float f_1719 = 9.0F;
   private static final float f_1720 = 13.0F;
   private static final float f_1721 = 13.0F;
   private static final float f_1722 = 13.0F;
   private static final float f_1723 = 799.0F;
   private static final float f_1724 = 0.5F;
   private static final float f_1725 = 437.0F;
   private static final float f_1726 = 0.5F;
   private static final float f_1727 = 0.016666668F;
   private static final float f_1728 = 1.0E9F;
   private static final float f_1729 = 0.05F;
   private static final float f_1730 = 18.0F;
   private static final float f_1731 = 0.05F;
   private static final float f_1732 = 10.0F;
   private static final float f_1733 = 210.0F;
   private static final float f_1734 = 46.0F;
   private static final float f_1735 = 0.94F;
   private static final float f_1736 = 0.06F;
   private static final float f_1737 = 799.0F;
   private static final float f_1738 = 437.0F;
   private static final float f_1739 = 255.0F;
   private static final float f_1740 = 799.0F;
   private static final float f_1741 = 437.0F;
   private static final float f_1742 = 0.01F;
   private static final float f_1743 = 24.0F;
   private static final float f_1744 = 799.0F;
   private static final float f_1745 = 437.0F;
   private static final float f_1746 = 30.0F;
   private static final float f_1747 = 799.0F;
   private static final float f_1748 = 437.0F;
   private static final double f_1749 = 25.0;
   private static final float f_1750 = 174.0F;
   private static final float f_1751 = 99.0F;
   private static final float f_1752 = 23.0F;
   private static final float f_1753 = 23.0F;
   private static final float f_1754 = 51.0F;
   private static final float f_1755 = 799.0F;
   private static final float f_1756 = 437.0F;
   private static final float f_1757 = 175.0F;
   private static final float f_1758 = 436.0F;
   private static final float f_1759 = 100.0F;
   private static final float f_1760 = 174.0F;
   private static final String f_1761 = "accounts";
   private static final float f_1762 = 71.0F;
   private static final float f_1763 = 37.0F;
   private static final float f_1764 = 34.0F;
   private static final float f_1765 = 34.0F;
   private static final String f_1766 = "Account Create";
   private static final float f_1767 = 45.0F;
   private static final float f_1768 = 110.0F;
   private static final float f_1769 = 255.0F;
   private static final float f_1770 = 11.0F;
   private static final float f_1771 = 130.0F;
   private static final double f_1772 = 120.0;
   private static final double f_1773 = 30.0;
   private static final float f_1774 = 120.0F;
   private static final float f_1775 = 30.0F;
   private static final float f_1776 = 4.0F;
   private static final float f_1777 = 10.0F;
   private static final float f_1778 = 255.0F;
   private static final float f_1779 = 33.0F;
   private static final float f_1780 = 22.0F;
   private static final float f_1781 = 190.0F;
   private static final float f_1782 = 120.0F;
   private static final float f_1783 = 30.0F;
   private static final float f_1784 = 0.5F;
   private static final float f_1785 = 10.0F;
   private static final String f_1786 = "Write nick...";
   private static final float f_1787 = 255.0F;
   private static final float f_1788 = 255.0F;
   private static final float f_1789 = 9.0F;
   private static final float f_1790 = 4.0F;
   private static final float f_1791 = 102.0F;
   private static final float f_1792 = 22.0F;
   private static final float f_1793 = 10.0F;
   private static final float f_1794 = 8.0F;
   private static final long f_1795 = 500L;
   private static final long f_1796 = 2L;
   private static final float f_1797 = 10.0F;
   private static final float f_1798 = 7.0F;
   private static final float f_1799 = 16.0F;
   private static final String f_1800 = "Other";
   private static final float f_1801 = 70.0F;
   private static final float f_1802 = 169.0F;
   private static final float f_1803 = 255.0F;
   private static final String f_1804 = "Generate random";
   private static final float f_1805 = 189.0F;
   private static final String f_1806 = "random";
   private static final String f_1807 = "Clear all";
   private static final float f_1808 = 223.0F;
   private static final String f_1809 = "trash";
   private static final float f_1810 = 135.0F;
   private static final float f_1811 = 130.0F;
   private static final double f_1812 = 30.0;
   private static final double f_1813 = 30.0;
   private static final float f_1814 = 30.0F;
   private static final float f_1815 = 30.0F;
   private static final float f_1816 = 4.0F;
   private static final float f_1817 = 10.0F;
   private static final float f_1818 = 255.0F;
   private static final float f_1819 = 30.0F;
   private static final float f_1820 = 30.0F;
   private static final float f_1821 = 0.5F;
   private static final float f_1822 = 10.0F;
   private static final float f_1823 = 33.0F;
   private static final float f_1824 = 18.0F;
   private static final float f_1825 = 12.0F;
   private static final float f_1826 = 1.5F;
   private static final String f_1827 = "add";
   private static final float f_1828 = 30.0F;
   private static final float f_1829 = 0.5F;
   private static final float f_1830 = 30.0F;
   private static final float f_1831 = 0.5F;
   private static final float f_1832 = 11.0F;
   private static final double f_1833 = 154.0;
   private static final double f_1834 = 30.0;
   private static final float f_1835 = 154.0F;
   private static final float f_1836 = 30.0F;
   private static final float f_1837 = 4.0F;
   private static final float f_1838 = 10.0F;
   private static final float f_1839 = 255.0F;
   private static final float f_1840 = 154.0F;
   private static final float f_1841 = 30.0F;
   private static final float f_1842 = 10.0F;
   private static final float f_1843 = 26.0F;
   private static final float f_1844 = 14.0F;
   private static final float f_1845 = 18.0F;
   private static final float f_1846 = 255.0F;
   private static final float f_1847 = 154.0F;
   private static final float f_1848 = 30.0F;
   private static final float f_1849 = 10.0F;
   private static final float f_1850 = 0.035F;
   private static final float f_1851 = 0.08F;
   private static final float f_1852 = 154.0F;
   private static final float f_1853 = 30.0F;
   private static final float f_1854 = 0.5F;
   private static final float f_1855 = 10.0F;
   private static final float f_1856 = 33.0F;
   private static final float f_1857 = 16.0F;
   private static final float f_1858 = 108.0F;
   private static final float f_1859 = 50.0F;
   private static final float f_1860 = 255.0F;
   private static final float f_1861 = 255.0F;
   private static final float f_1862 = 10.0F;
   private static final float f_1863 = 7.0F;
   private static final float f_1864 = 132.0F;
   private static final float f_1865 = 9.0F;
   private static final float f_1866 = 12.0F;
   private static final String f_1867 = "trash";
   private static final float f_1868 = 13.0F;
   private static final float f_1869 = 12.0F;
   private static final float f_1870 = 0.01F;
   private static final double f_1871 = 255.0;
   private static final float f_1872 = 268.0F;
   private static final float f_1873 = 4.0F;
   private static final float f_1874 = 11.0F;
   private static final float f_1875 = 188.0F;
   private static final float f_1876 = 18.0F;
   private static final float f_1877 = 599.0F;
   private static final float f_1878 = 371.0F;
   private static final float f_1879 = 0.01F;
   private static final float f_1880 = 206.0F;
   private static final float f_1881 = 193.0F;
   private static final float f_1882 = 30.0F;
   private static final float f_1883 = 62.0F;
   private static final float f_1884 = 14.0F;
   private static final float f_1885 = 5.0F;
   private static final double f_1886 = 177.0;
   private static final double f_1887 = 48.0;
   private static final float f_1888 = 5.0F;
   private static final float f_1889 = 4.0F;
   private static final float f_1890 = 4.0F;
   private static final float f_1891 = 5.0F;
   private static final float f_1892 = 51.0F;
   private static final float f_1893 = 20.0F;
   private static final float f_1894 = 177.0F;
   private static final float f_1895 = 48.0F;
   private static final float f_1896 = 12.0F;
   private static final float f_1897 = 177.0F;
   private static final float f_1898 = 48.0F;
   private static final float f_1899 = 0.5F;
   private static final float f_1900 = 12.0F;
   private static final float f_1901 = 31.0F;
   private static final float f_1902 = 17.0F;
   private static final float f_1903 = 10.0F;
   private static final float f_1904 = 10.0F;
   private static final float f_1905 = 28.0F;
   private static final double f_1906 = 255.0;
   private static final double f_1907 = 255.0;
   private static final float f_1908 = 255.0F;
   private static final float f_1909 = 84.0F;
   private static final float f_1910 = 44.0F;
   private static final float f_1911 = 9.0F;
   private static final float f_1912 = 44.0F;
   private static final float f_1913 = 26.0F;
   private static final double f_1914 = 255.0;
   private static final String f_1915 = "copy";
   private static final float f_1916 = 135.0F;
   private static final float f_1917 = 17.0F;
   private static final float f_1918 = 12.0F;
   private static final float f_1919 = 14.0F;
   private static final float f_1920 = 12.0F;
   private static final float f_1921 = 0.16F;
   private static final String f_1922 = "star";
   private static final String f_1923 = "star_inactive";
   private static final float f_1924 = 161.0F;
   private static final float f_1925 = 0.5F;
   private static final float f_1926 = 24.0F;
   private static final float f_1927 = 0.5F;
   private static final float f_1928 = 12.0F;
   private static final float f_1929 = 396.0F;
   private static final float f_1930 = 28.0F;
   private static final float f_1931 = 112.0F;
   private static final String f_1932 = "Current session:";
   private static final float f_1933 = 49.0F;
   private static final float f_1934 = 398.0F;
   private static final float f_1935 = 255.0F;
   private static final float f_1936 = 48.0F;
   private static final float f_1937 = 407.0F;
   private static final float f_1938 = 255.0F;
   private static final float f_1939 = 6.0F;
   private static final float f_1940 = 0.125F;
   private static final float f_1941 = 0.125F;
   private static final float f_1942 = 0.125F;
   private static final float f_1943 = 0.125F;
   private static final float f_1944 = 255.0F;
   private static final String f_1945 = "mainmenu/account_manager/demo_skin";
   private static final String f_1946 = "accounts";
   private static final String f_1947 = "trash";
   private static final float f_1948 = 255.0F;
   private static final float f_1949 = 188.0F;
   private static final float f_1950 = 18.0F;
   private static final double f_1951 = 599.0;
   private static final double f_1952 = 371.0;
   private static final double f_1953 = 177.0;
   private static final double f_1954 = 48.0;
   private static final float f_1955 = 11.0F;
   private static final float f_1956 = 130.0F;
   private static final double f_1957 = 120.0;
   private static final double f_1958 = 30.0;
   private static final float f_1959 = 135.0F;
   private static final float f_1960 = 130.0F;
   private static final double f_1961 = 30.0;
   private static final double f_1962 = 30.0;
   private static final float f_1963 = 11.0F;
   private static final float f_1964 = 189.0F;
   private static final double f_1965 = 154.0;
   private static final double f_1966 = 30.0;
   private static final float f_1967 = 11.0F;
   private static final float f_1968 = 223.0F;
   private static final double f_1969 = 154.0;
   private static final double f_1970 = 30.0;
   private static final float f_1971 = 188.0F;
   private static final float f_1972 = 18.0F;
   private static final double f_1973 = 599.0;
   private static final double f_1974 = 371.0;
   private static final double f_1975 = 177.0;
   private static final double f_1976 = 48.0;
   private static final float f_1977 = 128.0F;
   private static final float f_1978 = 10.0F;
   private static final double f_1979 = 25.0;
   private static final double f_1980 = 28.0;
   private static final float f_1981 = 151.0F;
   private static final float f_1982 = 10.0F;
   private static final double f_1983 = 25.0;
   private static final double f_1984 = 28.0;
   private static final float f_1985 = 0.35F;
   private static final float f_1986 = 0.65F;
   private static final String f_1987 = "Added to favorites";
   private static final String f_1988 = "Removed from favorites";
   private static final float f_1989 = 188.0F;
   private static final float f_1990 = 18.0F;
   private static final double f_1991 = 599.0;
   private static final double f_1992 = 371.0;
   private static final float f_1993 = 62.0F;
   private static final float f_1994 = 14.0F;
   private static final float f_1995 = 351.0F;
   private static final float f_1996 = 42.0F;
   private static final long f_1997 = 700L;
   private static final String f_1998 = "Use 3-16 letters, numbers or _";
   private static final long f_1999 = 700L;
   private static final String f_2000 = "This account already exists";
   private static final String f_2001 = "Account added";
   private static final String f_2002 = "No accounts to clear";
   private static final String f_2003 = "Accounts cleared";
   private static final float f_2004 = 62.0F;
   private static final float f_2005 = 14.0F;
   private static final float f_2006 = 351.0F;
   private static final float f_2007 = 0.25F;
   private static final String f_2008 = "_";
   private static final float f_2009 = 0.58F;
   private static final int f_2010 = 100000;
   private static final int f_2011 = 1000000;
   private static final float f_2012 = 98.0F;
   private static final String f_2013 = "...";
   private static final String f_2014 = "[A-Za-z0-9_]+";
   private static final long f_2015 = 1800L;
   private static final float f_2016 = 0.01F;
   private static final String f_2017 = "dd.MM.yyyy";
   private static final String f_2018 = "Silent";
   private static final String f_2019 = "Night";
   private static final String f_2020 = "Void";
   private static final String f_2021 = "Lunar";
   private static final String f_2022 = "Neon";
   private static final String f_2023 = "Frost";
   private static final String f_2024 = "Shadow";
   private static final String f_2025 = "Pixel";
   private static final String f_2026 = "Nova";
   private static final String f_2027 = "Dark";
   private static final String f_2028 = "Wild";
   private static final String f_2029 = "Ghost";
   private static final String f_2030 = "Crimson";
   private static final String f_2031 = "Aero";
   private static final String f_2032 = "Cyber";
   private static final String f_2033 = "Velvet";
   private static final String f_2034 = "Fox";
   private static final String f_2035 = "Soul";
   private static final String f_2036 = "Byte";
   private static final String f_2037 = "Raven";
   private static final String f_2038 = "Wolf";
   private static final String f_2039 = "Bloom";
   private static final String f_2040 = "Storm";
   private static final String f_2041 = "Echo";
   private static final String f_2042 = "Flame";
   private static final String f_2043 = "Blade";
   private static final String f_2044 = "Mist";
   private static final String f_2045 = "Viper";
   private static final String f_2046 = "Comet";
   private static final String f_2047 = "Shade";
   private static final String f_2048 = "Pulse";
   private static final String f_2049 = "Dream";

   public void extractRenderState(GuiGraphicsExtractor var1, int var2, int var3, float var4) {
      if (this.f_1690 != null) {
         this.f_1690.extractRenderState(var1, var2, var3, var4);
      }

      Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
      Class_Ssh31B3ljfKeWsvS.m_4830();
      Class_Ssh31B3ljfKeWsvS.m_4844();
      Vector2f var5 = Class_FvJXUGWpZo3zYBW4.m_2693(var2, var3);
      float var6 = this.minecraft.getWindow().getScreenWidth();
      float var7 = this.minecraft.getWindow().getScreenHeight();
      this.f_1710 = (float)Math.floor((var6 - f_1723) * f_1724);
      this.f_1711 = Math.round((var7 - f_1725) * f_1726);
      this.f_1693.m_9283(this.f_1703 ? 0.0F : 1.0F);
      this.f_1695.m_9283(System.currentTimeMillis() < this.f_1705 ? 1.0F : 0.0F);
      this.f_1696.m_9283(System.currentTimeMillis() < this.f_1704 ? 1.0F : 0.0F);
      long var8 = System.nanoTime();
      float var10 = this.f_1709 == 0L ? f_1727 : Math.clamp((float)(var8 - this.f_1709) / f_1728, 0.0F, f_1729);
      this.f_1709 = var8;
      float var11 = 1.0F - (float)Math.exp(-var10 * f_1730);
      this.f_1708 = this.f_1708 + (this.f_1707 - this.f_1708) * var11;
      if (Math.abs(this.f_1707 - this.f_1708) < f_1731) {
         this.f_1708 = this.f_1707;
      }

      float var12 = this.f_1693.m_9288();
      Class_Ssh31B3ljfKeWsvS.m_4837(0.0F, 0.0F, var6, var7, f_1732, 0.0F, new Vector4i(Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_1733 * var12)));
      Class_Ssh31B3ljfKeWsvS.m_4817(0.0F, 0.0F, var6, var7, 0.0F, Class_BftdentXEtGbugJw.m_2303(4, 6, 9, f_1734 * var12));
      float var13 = f_1735 + f_1736 * var12;
      Class_FvJXUGWpZo3zYBW4.m_2692(this.f_1710, this.f_1711, f_1737, f_1738, var13);
      Class_Ssh31B3ljfKeWsvS.m_4864(f_1739 * var12);
      this.drawPanel(var5.x, var5.y, var12);
      Class_Ssh31B3ljfKeWsvS.m_4844();
      Class_FvJXUGWpZo3zYBW4.m_2694(this.f_1710, this.f_1711, f_1740, f_1741, var13);
      this.f_1692.removeIf(var0 -> var0.f_1670 && var0.f_1663.m_9288() <= f_2016 && var0.f_1663.m_9280());
      if (this.f_1703 && var12 <= f_1742 && this.f_1693.m_9280()) {
         if (this.f_1690 instanceof Screen_1 var14) {
            var14.resumeFromOverlay();
         }

         this.minecraft.gui.setScreen(this.f_1690);
      }
   }

   private void deleteAccount(Screen_2.BzfU4OcdweBlGNUF var1) {
      var1.f_1670 = true;
      this.saveAccounts();
      int var2 = (int)this.f_1692.stream().filter(var0 -> !var0.f_1670).count();
      int var3 = (var2 + 2) / 3;
      float var4 = var3 == 0 ? 0.0F : var3 * f_2004 - f_2005;
      this.f_1707 = Math.min(this.f_1707, Math.max(0.0F, var4 - f_2006));
      this.showFeedback(var1.f_1660 + "", false);
   }

   private String sanitize(String var1) {
      if (var1 == null) {
         return "";
      }

      StringBuilder var2 = new StringBuilder();

      for (int var3 = 0; var3 < var1.length() && var2.length() < 16; var3++) {
         char var4 = var1.charAt(var3);
         if (var4 < 128 && (Character.isLetterOrDigit(var4) || var4 == '_')) {
            var2.append(var4);
         }
      }

      return var2.toString();
   }

   public boolean shouldCloseOnEsc() {
      return false;
   }

   private boolean isValid(String var1) {
      return var1.length() >= 3 && var1.length() <= 16 && var1.matches(f_2014);
   }

   private void drawIcon(String var1, float var2, float var3, float var4, float var5, float var6) {
      boolean var7 = var1.equals(f_1946) || var1.equals(f_1947);
      int var8 = var7
         ? Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN), var6)
         : Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_1948 * var6);
      float var9 = Math.round(var2);
      float var10 = Math.round(var3);
      float var11 = Math.max(1, Math.round(var4));
      float var12 = Math.max(1, Math.round(var5));
      Class_Ssh31B3ljfKeWsvS.m_4829(
         var9, var10, var11, var12, 0.0F, new Vector4f(0.0F, 0.0F, 1.0F, 1.0F), var8, Class_wHRRCm2tlLY7DN4I.m_9311(var1 + ""), FilterMode.LINEAR
      );
   }

   private void drawCurrentSession(float var1) {
      this.drawFace(this.f_1710 + f_1928, this.f_1711 + f_1929, f_1930, var1);
      String var2 = this.fitText(this.minecraft.getUser().getName(), f_1931, 12);
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(), f_1932, this.f_1710 + f_1933, this.f_1711 + f_1934, 9, Class_BftdentXEtGbugJw.m_2303(108, 108, 108, f_1935 * var1)
      );
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(), var2, this.f_1710 + f_1936, this.f_1711 + f_1937, 12, Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_1938 * var1)
      );
   }

   private Screen_2.BzfU4OcdweBlGNUF findAccount(String var1) {
      String var2 = var1.toLowerCase(Locale.ROOT);

      for (Screen_2.BzfU4OcdweBlGNUF var4 : this.f_1692) {
         if (!var4.f_1670 && var4.f_1660.toLowerCase(Locale.ROOT).equals(var2)) {
            return var4;
         }
      }

      return null;
   }

   private void showFeedback(String var1, boolean var2) {
      this.f_1700 = var1;
      this.f_1701 = var2;
      this.f_1704 = System.currentTimeMillis() + f_2015;
      this.f_1696.m_9281(0.0F);
   }

   private void drawFace(float var1, float var2, float var3, float var4) {
      Class_Ssh31B3ljfKeWsvS.m_4829(
         var1,
         var2,
         var3,
         var3,
         f_1939,
         new Vector4f(f_1940, f_1941, f_1942, f_1943),
         Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_1944 * var4),
         Class_wHRRCm2tlLY7DN4I.m_9311(f_1945),
         FilterMode.NEAREST
      );
   }

   protected void extractPanorama(GuiGraphicsExtractor var1, float var2) {
   }

   private void drawAccount(Screen_2.BzfU4OcdweBlGNUF var1, float var2) {
      float var3 = var1.f_1663.m_9288();
      float var4 = var1.f_1664.m_9288();
      float var5 = var1.f_1665.m_9288();
      float var6 = var1.f_1666.m_9288();
      float var7 = var1.f_1672;
      float var8 = var1.f_1673 + f_1888 * (1.0F - var3);
      Class_Ssh31B3ljfKeWsvS.m_4864(var2 * var3);
      int var9 = Class_BftdentXEtGbugJw.m_2303(15 + (int)(f_1889 * var4), 19 + (int)(f_1890 * var4), 28 + (int)(f_1891 * var4), f_1892 + f_1893 * var4);
      Class_Ssh31B3ljfKeWsvS.m_4817(var7, var8, f_1894, f_1895, f_1896, var9);
      Class_Ssh31B3ljfKeWsvS.m_4854(var7, var8, f_1897, f_1898, f_1899, f_1900, Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_1901 + f_1902 * var4));
      this.drawFace(var7 + f_1903, var8 + f_1904, f_1905, 1.0F);
      int var10 = Class_BftdentXEtGbugJw.m_2302(
         Class_BftdentXEtGbugJw.m_2303(190, 190, 195, f_1906), Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_1907), var4
      );
      int var11 = Class_BftdentXEtGbugJw.m_2302(var10, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN), var5);
      var11 = Class_BftdentXEtGbugJw.m_2306(var11, var3 * var2 / f_1908);
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), this.fitText(var1.f_1660, f_1909, 12), var7 + f_1910, var8 + f_1911, 12, var11);
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(), var1.f_1661, var7 + f_1912, var8 + f_1913, 10, Class_BftdentXEtGbugJw.m_2303(108, 108, 108, f_1914)
      );
      this.drawIcon(f_1915, var7 + f_1916, var8 + f_1917, f_1918, f_1919, 1.0F);
      float var12 = f_1920 * (1.0F + f_1921 * var6);
      this.drawIcon(var1.f_1669 ? f_1922 : f_1923, var7 + f_1924 - var12 * f_1925, var8 + f_1926 - var12 * f_1927, var12, var12, 1.0F);
      Class_Ssh31B3ljfKeWsvS.m_4864(var2);
   }

   public Screen_2(Screen var1) {
      super(Component.literal(f_1712));
      this.f_1693 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_1713, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_1694 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_1714, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_1695 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_1715, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_1696 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_1716, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_1697 = new Class_w8fCJQ5ZtH5lQbWc[]{
         new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_1717, Class_eXr9Fra2ad3yFXY8.f_19100),
         new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_1718, Class_eXr9Fra2ad3yFXY8.f_19100),
         new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_1719, Class_eXr9Fra2ad3yFXY8.f_19100)
      };
      this.f_1698 = new Class_w8fCJQ5ZtH5lQbWc[]{
         new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_1720, Class_eXr9Fra2ad3yFXY8.f_19100),
         new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_1721, Class_eXr9Fra2ad3yFXY8.f_19100),
         new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_1722, Class_eXr9Fra2ad3yFXY8.f_19100)
      };
      this.f_1699 = "";
      this.f_1700 = "";
      this.f_1690 = var1;
      this.f_1691.m_5560();

      for (Class_ZYgBPcxFNip8f3dv.WwQ3Cc1ZPUG2jZTW var3 : this.f_1691.m_5823()) {
         String var4 = this.sanitize(var3.name());
         if (this.isValid(var4) && this.findAccount(var4) == null) {
            this.f_1692.add(new Screen_2.BzfU4OcdweBlGNUF(var4, var3.date(), var3.favorite(), this.f_1706++));
         }
      }

      this.sortAccounts();
   }

   private void drawAccounts(float var1, float var2, float var3) {
      int var4 = 0;
      float var5 = Class_Ssh31B3ljfKeWsvS.m_4821();
      Class_Ssh31B3ljfKeWsvS.m_4860(this.f_1710 + f_1875, this.f_1711 + f_1876, f_1877, f_1878);

      for (Screen_2.BzfU4OcdweBlGNUF var7 : this.f_1692) {
         var7.f_1663.m_9283(var7.f_1670 ? 0.0F : 1.0F);
         if (!var7.f_1670 || !(var7.f_1663.m_9288() <= f_1879)) {
            int var8 = var4 % 3;
            int var9 = var4 / 3;
            float var10 = this.f_1710 + f_1880 + var8 * f_1881;
            float var11 = this.f_1711 + f_1882 + var9 * f_1883;
            if (!var7.f_1671) {
               var7.f_1667.m_9281(var10 + f_1884);
               var7.f_1668.m_9281(var11 + f_1885);
               var7.f_1671 = true;
            }

            var7.f_1667.m_9283(var10);
            var7.f_1668.m_9283(var11);
            var7.f_1672 = var7.f_1667.m_9288();
            var7.f_1673 = var7.f_1668.m_9288() - this.f_1708;
            boolean var12 = Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var7.f_1672, var7.f_1673, f_1886, f_1887);
            var7.f_1664.m_9283(var12 ? 1.0F : 0.0F);
            boolean var13 = this.minecraft.getUser().getName().equalsIgnoreCase(var7.f_1660);
            var7.f_1665.m_9283(var13 ? 1.0F : 0.0F);
            var7.f_1666.m_9283(var7.f_1669 ? 1.0F : 0.0F);
            this.drawAccount(var7, var5);
            var4++;
         }
      }

      Class_Ssh31B3ljfKeWsvS.m_4864(var5);
      Class_Ssh31B3ljfKeWsvS.m_4828();
   }

   public boolean charTyped(CharacterEvent var1) {
      if (this.f_1702 && this.f_1699.length() < 16) {
         int var2 = var1.codepoint();
         if (var2 < 128 && (Character.isLetterOrDigit(var2) || var2 == 95)) {
            this.f_1699 = this.f_1699 + var1.codepointAsString();
         }

         return true;
      } else {
         return true;
      }
   }

   private void clearAccounts() {
      if (this.f_1692.stream().noneMatch(var0 -> !var0.f_1670)) {
         this.showFeedback(f_2002, true);
      } else {
         for (Screen_2.BzfU4OcdweBlGNUF var2 : this.f_1692) {
            var2.f_1670 = true;
         }

         this.f_1707 = 0.0F;
         this.saveAccounts();
         this.showFeedback(f_2003, false);
      }
   }

   private void drawSidebarButton(int var1, String var2, float var3, float var4, float var5, float var6, String var7, boolean var8) {
      float var9 = this.f_1710 + f_1832;
      boolean var10 = Class_FvJXUGWpZo3zYBW4.m_2697(var4, var5, var9, var3, f_1833, f_1834);
      this.f_1697[var1].m_9283(var10 ? 1.0F : 0.0F);
      this.f_1698[var1].m_9283(0.0F);
      float var11 = this.f_1697[var1].m_9288();
      float var12 = this.f_1698[var1].m_9288();
      Class_Ssh31B3ljfKeWsvS.m_4858(var9, var3, f_1835, f_1836, f_1837, f_1838, Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_1839 * var6));
      if (var8) {
         Class_Ssh31B3ljfKeWsvS.m_4817(
            var9,
            var3,
            f_1840,
            f_1841,
            f_1842,
            Class_BftdentXEtGbugJw.m_2306(
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN), (f_1843 + f_1844 * var11 + f_1845 * var12) / f_1846 * var6
            )
         );
      } else {
         Class_Ssh31B3ljfKeWsvS.m_4817(
            var9,
            var3,
            f_1847,
            f_1848,
            f_1849,
            Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN), (f_1850 * var11 + f_1851 * var12) * var6)
         );
      }

      Class_Ssh31B3ljfKeWsvS.m_4854(var9, var3, f_1852, f_1853, f_1854, f_1855, Class_BftdentXEtGbugJw.m_2303(255, 255, 255, (f_1856 + f_1857 * var11) * var6));
      int var13 = Math.round(f_1858 + f_1859 * var11);
      int var14 = var8 ? Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_1860 * var6) : Class_BftdentXEtGbugJw.m_2303(var13, var13, var13, f_1861 * var6);
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var2, var9 + f_1862, var3 + f_1863, 13, var14);
      this.drawIcon(var7, var9 + f_1864, var3 + f_1865, f_1866, var7.equals(f_1867) ? f_1868 : f_1869, var6);
   }

   protected void init() {
      this.f_1693.m_9281(0.0F);
      this.f_1702 = false;
      this.f_1703 = false;
      this.f_1709 = 0L;
   }

   public boolean isPauseScreen() {
      return false;
   }

   private String visibleNickname() {
      String var1 = this.f_1699;

      while (!var1.isEmpty() && Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var1, 13) > f_2012) {
         var1 = var1.substring(1);
      }

      return var1;
   }

   private void drawSquareButton(float var1, float var2, float var3) {
      float var4 = this.f_1710 + f_1810;
      float var5 = this.f_1711 + f_1811;
      boolean var6 = Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var4, var5, f_1812, f_1813);
      this.f_1697[0].m_9283(var6 ? 1.0F : 0.0F);
      this.f_1698[0].m_9283(0.0F);
      float var7 = this.f_1697[0].m_9288();
      float var8 = this.f_1698[0].m_9288();
      Class_Ssh31B3ljfKeWsvS.m_4858(var4, var5, f_1814, f_1815, f_1816, f_1817, Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_1818 * var3));
      Class_Ssh31B3ljfKeWsvS.m_4854(var4, var5, f_1819, f_1820, f_1821, f_1822, Class_BftdentXEtGbugJw.m_2303(255, 255, 255, (f_1823 + f_1824 * var7) * var3));
      float var9 = f_1825 - var8 * f_1826;
      this.drawIcon(f_1827, var4 + (f_1828 - var9) * f_1829, var5 + (f_1830 - var9) * f_1831, var9, var9, var3);
   }

   public boolean mouseScrolled(double var1, double var3, double var5, double var7) {
      Vector2f var9 = Class_FvJXUGWpZo3zYBW4.m_2693(var1, var3);
      if (!Class_FvJXUGWpZo3zYBW4.m_2697(var9.x, var9.y, this.f_1710 + f_1989, this.f_1711 + f_1990, f_1991, f_1992)) {
         return true;
      }

      int var10 = (int)this.f_1692.stream().filter(var0 -> !var0.f_1670).count();
      int var11 = (var10 + 2) / 3;
      float var12 = var11 == 0 ? 0.0F : var11 * f_1993 - f_1994;
      float var13 = Math.max(0.0F, var12 - f_1995);
      this.f_1707 = Math.clamp(this.f_1707 - (float)var7 * f_1996, 0.0F, var13);
      return true;
   }

   protected void extractMenuBackground(GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5) {
   }

   private void sortAccounts() {
      this.f_1692.sort(Comparator.<Screen_2.BzfU4OcdweBlGNUF, Boolean>comparing(var0 -> !var0.f_1669).thenComparingLong(var0 -> var0.f_1662));
   }

   private void switchSession(Screen_2.BzfU4OcdweBlGNUF var1) {
      UUID var2 = UUID.nameUUIDFromBytes((var1.f_1660 + "").getBytes(StandardCharsets.UTF_8));
      User var3 = new User(var1.f_1660, var2, "", Optional.empty(), Optional.empty());
      ((MinecraftMixin_2)this.minecraft).dimasik$setSession(var3);
      var1.f_1665.m_9281(f_2007);
      this.showFeedback(var1.f_1660 + "", false);
   }

   private void saveAccounts() {
      List var1 = this.f_1692
         .stream()
         .filter(var0 -> !var0.f_1670)
         .map(var0 -> new Class_ZYgBPcxFNip8f3dv.WwQ3Cc1ZPUG2jZTW(var0.f_1660, var0.f_1661, var0.f_1669))
         .toList();
      this.f_1691.m_5824(var1);
   }

   private void drawPanel(float var1, float var2, float var3) {
      float var4 = f_1743;
      Class_Ssh31B3ljfKeWsvS.m_4837(this.f_1710, this.f_1711, f_1744, f_1745, f_1746, var4, new Vector4i(-1));
      Class_Ssh31B3ljfKeWsvS.m_4817(this.f_1710, this.f_1711, f_1747, f_1748, var4, Class_BftdentXEtGbugJw.m_2303(0, 0, 0, f_1749));
      Class_Ssh31B3ljfKeWsvS.m_4870(
         this.f_1710 + 1.0F,
         this.f_1711 + 1.0F,
         f_1750,
         f_1751,
         new Vector4f(f_1752, f_1753, 0.0F, 0.0F),
         Class_BftdentXEtGbugJw.m_2303(15, 19, 28, f_1754 * var3)
      );
      Class_Ssh31B3ljfKeWsvS.m_4854(this.f_1710, this.f_1711, f_1755, f_1756, 1.0F, var4, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE));
      Class_Ssh31B3ljfKeWsvS.m_4817(
         Math.round(this.f_1710 + f_1757), this.f_1711, 1.0F, f_1758, 0.0F, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE)
      );
      Class_Ssh31B3ljfKeWsvS.m_4817(
         this.f_1710 + 1.0F, Math.round(this.f_1711 + f_1759), f_1760, 1.0F, 0.0F, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE)
      );
      this.drawIcon(f_1761, this.f_1710 + f_1762, this.f_1711 + f_1763, f_1764, f_1765, var3);
      this.drawSidebar(var1, var2, var3);
      this.drawAccounts(var1, var2, var3);
      this.drawCurrentSession(var3);
   }

   private void drawSidebar(float var1, float var2, float var3) {
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(), f_1766, this.f_1710 + f_1767, this.f_1711 + f_1768, 13, Class_BftdentXEtGbugJw.m_2303(108, 108, 108, f_1769 * var3)
      );
      float var4 = this.f_1710 + f_1770;
      float var5 = this.f_1711 + f_1771;
      boolean var6 = Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var4, var5, f_1772, f_1773);
      this.f_1694.m_9283(!this.f_1702 && !var6 ? 0.0F : 1.0F);
      float var7 = this.f_1694.m_9288();
      float var8 = this.f_1695.m_9288();
      Class_Ssh31B3ljfKeWsvS.m_4858(var4, var5, f_1774, f_1775, f_1776, f_1777, Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_1778 * var3));
      int var9 = Class_BftdentXEtGbugJw.m_2303(255, 255, 255, (f_1779 + f_1780 * var7) * var3);
      int var10 = Class_BftdentXEtGbugJw.m_2303(214, 91, 101, f_1781 * var3);
      Class_Ssh31B3ljfKeWsvS.m_4854(var4, var5, f_1782, f_1783, f_1784, f_1785, Class_BftdentXEtGbugJw.m_2302(var9, var10, var8));
      String var11 = this.visibleNickname();
      if (var11.isEmpty()) {
         var11 = f_1786;
      }

      int var12 = this.f_1699.isEmpty()
         ? Class_BftdentXEtGbugJw.m_2303(108, 108, 108, f_1787 * var3)
         : Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_1788 * var3);
      Class_Ssh31B3ljfKeWsvS.m_4860(var4 + f_1789, var5 + f_1790, f_1791, f_1792);
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var11, var4 + f_1793, var5 + f_1794, 13, var12);
      if (this.f_1702 && System.currentTimeMillis() / f_1795 % f_1796 == 0L) {
         float var13 = var4 + f_1797 + Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var11, 13) + 1.0F;
         Class_Ssh31B3ljfKeWsvS.m_4817(var13, var5 + f_1798, 1.0F, f_1799, 0.0F, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN));
      }

      Class_Ssh31B3ljfKeWsvS.m_4828();
      this.drawSquareButton(var1, var2, var3);
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(), f_1800, this.f_1710 + f_1801, this.f_1711 + f_1802, 13, Class_BftdentXEtGbugJw.m_2303(108, 108, 108, f_1803 * var3)
      );
      this.drawSidebarButton(1, f_1804, this.f_1711 + f_1805, var1, var2, var3, f_1806, false);
      this.drawSidebarButton(2, f_1807, this.f_1711 + f_1808, var1, var2, var3, f_1809, true);
      this.drawFeedback(var3);
   }

   public boolean mouseClicked(MouseButtonEvent var1, boolean var2) {
      if (this.f_1703) {
         return true;
      }

      Vector2f var3 = Class_FvJXUGWpZo3zYBW4.m_2693(var1.x(), var1.y());
      if (var1.button() == 1) {
         this.f_1702 = false;
         if (!Class_FvJXUGWpZo3zYBW4.m_2697(var3.x, var3.y, this.f_1710 + f_1949, this.f_1711 + f_1950, f_1951, f_1952)) {
            return true;
         }

         for (int var6 = this.f_1692.size() - 1; var6 >= 0; var6--) {
            Screen_2.BzfU4OcdweBlGNUF var7 = this.f_1692.get(var6);
            if (!var7.f_1670 && Class_FvJXUGWpZo3zYBW4.m_2697(var3.x, var3.y, var7.f_1672, var7.f_1673, f_1953, f_1954)) {
               this.deleteAccount(var7);
               return true;
            }
         }

         return true;
      } else {
         if (var1.button() != 0) {
            return true;
         }

         this.f_1702 = Class_FvJXUGWpZo3zYBW4.m_2697(var3.x, var3.y, this.f_1710 + f_1955, this.f_1711 + f_1956, f_1957, f_1958);
         if (Class_FvJXUGWpZo3zYBW4.m_2697(var3.x, var3.y, this.f_1710 + f_1959, this.f_1711 + f_1960, f_1961, f_1962)) {
            this.f_1698[0].m_9281(1.0F);
            this.addAccount();
            return true;
         }

         if (Class_FvJXUGWpZo3zYBW4.m_2697(var3.x, var3.y, this.f_1710 + f_1963, this.f_1711 + f_1964, f_1965, f_1966)) {
            this.f_1698[1].m_9281(1.0F);
            this.f_1699 = this.generateNickname();
            this.f_1702 = true;
            this.showFeedback(this.f_1699 + "", false);
            return true;
         }

         if (Class_FvJXUGWpZo3zYBW4.m_2697(var3.x, var3.y, this.f_1710 + f_1967, this.f_1711 + f_1968, f_1969, f_1970)) {
            this.f_1698[2].m_9281(1.0F);
            this.clearAccounts();
            return true;
         }

         if (!Class_FvJXUGWpZo3zYBW4.m_2697(var3.x, var3.y, this.f_1710 + f_1971, this.f_1711 + f_1972, f_1973, f_1974)) {
            return true;
         }

         for (int var4 = this.f_1692.size() - 1; var4 >= 0; var4--) {
            Screen_2.BzfU4OcdweBlGNUF var5 = this.f_1692.get(var4);
            if (!var5.f_1670 && Class_FvJXUGWpZo3zYBW4.m_2697(var3.x, var3.y, var5.f_1672, var5.f_1673, f_1975, f_1976)) {
               if (Class_FvJXUGWpZo3zYBW4.m_2697(var3.x, var3.y, var5.f_1672 + f_1977, var5.f_1673 + f_1978, f_1979, f_1980)) {
                  this.minecraft.keyboardHandler.setClipboard(var5.f_1660);
                  this.showFeedback(var5.f_1660 + "", false);
               } else if (Class_FvJXUGWpZo3zYBW4.m_2697(var3.x, var3.y, var5.f_1672 + f_1981, var5.f_1673 + f_1982, f_1983, f_1984)) {
                  var5.f_1669 = !var5.f_1669;
                  var5.f_1666.m_9281(var5.f_1669 ? f_1985 : f_1986);
                  this.sortAccounts();
                  this.saveAccounts();
                  this.showFeedback(var5.f_1669 ? f_1987 : f_1988, false);
               } else {
                  this.switchSession(var5);
               }

               return true;
            }
         }

         return true;
      }
   }

   private String fitText(String var1, float var2, int var3) {
      if (var1 != null && !var1.isEmpty()) {
         if (Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var1, var3) <= var2) {
            return var1;
         }

         String var4 = f_2013;
         float var5 = Math.max(0.0F, var2 - Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var4, var3));
         int var6 = 0;

         while (var6 < var1.length()) {
            int var7 = var1.offsetByCodePoints(var6, 1);
            if (Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var1.substring(0, var7), var3) > var5) {
               break;
            }

            var6 = var7;
         }

         return var1.substring(0, var6) + var4;
      } else {
         return "";
      }
   }

   private void drawFeedback(float var1) {
      float var2 = this.f_1696.m_9288();
      if (!(var2 <= f_1870) && !this.f_1700.isEmpty()) {
         int var3 = this.f_1701 ? Class_BftdentXEtGbugJw.m_2303(214, 91, 101, f_1871) : Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
         float var4 = this.f_1711 + f_1872 - f_1873 * (1.0F - var2);
         Class_Ssh31B3ljfKeWsvS.m_4866(
            Class_y1y6QpONhWEUIdEB.m_9588(), this.f_1700, this.f_1710 + f_1874, var4, 11, Class_BftdentXEtGbugJw.m_2306(var3, var2 * var1)
         );
      }
   }

   private String generateNickname() {
      ThreadLocalRandom var1 = ThreadLocalRandom.current();

      for (int var2 = 0; var2 < 100; var2++) {
         String var3 = var1.nextBoolean() ? "" : f_2008;
         String var4 = f_1688[var1.nextInt(f_1688.length)] + var3 + f_1689[var1.nextInt(f_1689.length)];
         if (var1.nextFloat() < f_2009) {
            var4 = var4 + var1.nextInt(10, 1000);
         }

         if (var4.length() > 16) {
            var4 = var4.substring(0, 16);
         }

         if (this.findAccount(var4) == null) {
            return var4;
         }
      }

      return var1.nextInt(f_2010, f_2011) + "";
   }

   public boolean keyPressed(KeyEvent var1) {
      if (var1.key() == 256) {
         this.f_1703 = true;
         this.f_1702 = false;
         return true;
      } else if (!this.f_1702) {
         return true;
      } else if (var1.key() == 257 || var1.key() == 335) {
         this.addAccount();
         return true;
      } else if (var1.key() == 259 && !this.f_1699.isEmpty()) {
         int var2 = this.f_1699.offsetByCodePoints(this.f_1699.length(), -1);
         this.f_1699 = this.f_1699.substring(0, var2);
         return true;
      } else if (var1.key() == 86 && (var1.modifiers() & 2) != 0) {
         this.f_1699 = this.sanitize(this.minecraft.keyboardHandler.getClipboard());
         return true;
      } else {
         return true;
      }
   }

   private void addAccount() {
      String var1 = this.sanitize(this.f_1699);
      if (!this.isValid(var1)) {
         this.f_1705 = System.currentTimeMillis() + f_1997;
         this.showFeedback(f_1998, true);
      } else if (this.findAccount(var1) != null) {
         this.f_1705 = System.currentTimeMillis() + f_1999;
         this.showFeedback(f_2000, true);
      } else {
         Screen_2.BzfU4OcdweBlGNUF var2 = new Screen_2.BzfU4OcdweBlGNUF(var1, LocalDate.now().format(f_1687), false, this.f_1706++);
         this.f_1692.add(var2);
         this.sortAccounts();
         this.f_1699 = "";
         this.saveAccounts();
         this.switchSession(var2);
         this.showFeedback(f_2001, false);
      }
   }

   private static final class BzfU4OcdweBlGNUF {
      public final String f_1660;
      public final String f_1661;
      public final long f_1662;
      public final Class_w8fCJQ5ZtH5lQbWc f_1663;
      public final Class_w8fCJQ5ZtH5lQbWc f_1664;
      public final Class_w8fCJQ5ZtH5lQbWc f_1665;
      public final Class_w8fCJQ5ZtH5lQbWc f_1666;
      public final Class_w8fCJQ5ZtH5lQbWc f_1667;
      public final Class_w8fCJQ5ZtH5lQbWc f_1668;
      public boolean f_1669;
      public boolean f_1670;
      public boolean f_1671;
      public float f_1672;
      public float f_1673;
      public static final float f_1674 = 7.0F;
      public static final float f_1675 = 10.0F;
      public static final float f_1676 = 9.0F;
      public static final float f_1677 = 4.5F;
      public static final float f_1678 = 4.5F;
      public static final float f_1679 = 11.0F;

      public BzfU4OcdweBlGNUF(String var1, String var2, boolean var3, long var4) {
         this.f_1663 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_1674, Class_eXr9Fra2ad3yFXY8.f_19100);
         this.f_1664 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_1675, Class_eXr9Fra2ad3yFXY8.f_19100);
         this.f_1665 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_1676, Class_eXr9Fra2ad3yFXY8.f_19100);
         this.f_1667 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_1677, Class_eXr9Fra2ad3yFXY8.f_19101);
         this.f_1668 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_1678, Class_eXr9Fra2ad3yFXY8.f_19101);
         this.f_1660 = var1;
         this.f_1661 = var2;
         this.f_1669 = var3;
         this.f_1662 = var4;
         this.f_1666 = new Class_w8fCJQ5ZtH5lQbWc(var3 ? 1.0F : 0.0F, f_1679, Class_eXr9Fra2ad3yFXY8.f_19100);
      }
   }
}
