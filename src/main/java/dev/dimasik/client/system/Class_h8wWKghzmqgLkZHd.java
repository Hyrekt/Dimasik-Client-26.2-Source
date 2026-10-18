package dev.dimasik.client.system;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import net.minecraft.client.Minecraft;

public final class Class_h8wWKghzmqgLkZHd {
   private static final String f_23149 = "Sk3dGuardNew";
   private static final String f_23150 = "Dimas";
   private static final String f_23151 = "resourcepacks";
   private static final String f_23152 = "mods";
   private final List<Class_h8wWKghzmqgLkZHd.zxBOKMo2k2pSa52y> f_23153 = new ArrayList<>();
   private final List<Class_h8wWKghzmqgLkZHd.Class_3CdobBic65tfHTPv> f_23154 = new ArrayList<>();
   private Path f_23155;
   private Path f_23156;
   private boolean f_23157;
   private static final String f_23158 = "Dimas";
   private static final String f_23159 = "resourcepacks";
   private static final String f_23160 = "APPDATA";
   private static final String f_23161 = ".minecraft";
   private static final String f_23162 = "Minecraft";
   private static final String f_23163 = "WINEPREFIX";
   private static final String f_23164 = "STEAM_COMPAT_DATA_PATH";
   private static final String f_23165 = "pfx";
   private static final String f_23166 = "user.home";
   private static final String f_23167 = ".minecraft";
   private static final String f_23168 = ".wine";
   private static final String f_23169 = ".minecraft";
   private static final String f_23170 = ".minecraft";
   private static final String f_23171 = "drive_c";
   private static final String f_23172 = "users";
   private static final String f_23173 = "steamuser";
   private static final String f_23174 = "AppData";
   private static final String f_23175 = "Roaming";
   private static final String f_23176 = ".minecraft";
   private static final String f_23177 = "user.name";
   private static final String f_23178 = "AppData";
   private static final String f_23179 = "Roaming";
   private static final String f_23180 = ".minecraft";
   private static final String f_23181 = "AppData";
   private static final String f_23182 = "Roaming";
   private static final String f_23183 = ".minecraft";
   private static final String f_23184 = "Sk3dGuardNew";
   private static final String f_23185 = "SystemDrive";
   private static final String f_23186 = "WINEPREFIX";
   private static final String f_23187 = "drive_c";
   private static final String f_23188 = "STEAM_COMPAT_DATA_PATH";
   private static final String f_23189 = "pfx";
   private static final String f_23190 = "drive_c";
   private static final String f_23191 = "user.home";
   private static final String f_23192 = ".wine";
   private static final String f_23193 = "drive_c";
   private static final String f_23194 = "/";
   private static final String f_23195 = ".steam/steam/steamapps/compatdata";
   private static final String f_23196 = ".local/share/Steam/steamapps/compatdata";
   private static final String f_23197 = "pfx";
   private static final String f_23198 = "drive_c";
   private static final String f_23199 = "resourcepacks";
   private static final String f_23200 = "mods";
   private static final String f_23201 = ".jar";
   private static final String f_23202 = ".zip";
   private static final String f_23203 = "pack.mcmeta";
   private static final String f_23204 = "fabric.mod.json";
   private static final String f_23205 = "quilt.mod.json";
   private static final String f_23206 = "META-INF";
   private static final String f_23207 = "mods.toml";
   private static final String f_23208 = "META-INF";
   private static final String f_23209 = "neoforge.mods.toml";
   private static final String f_23210 = "fabric.mod.json";
   private static final String f_23211 = "quilt.mod.json";
   private static final String f_23212 = "META-INF/mods.toml";
   private static final String f_23213 = "META-INF/neoforge.mods.toml";
   private static final String f_23214 = "pack.mcmeta";
   private static final String f_23215 = ".";
   private static final String f_23216 = "WINEPREFIX";
   private static final String f_23217 = "STEAM_COMPAT_DATA_PATH";
   private static final String f_23218 = "os.name";
   private static final String f_23219 = "win";
   private static final String f_23220 = "run";
   private static final String f_23221 = "/ideaprojects/";
   private static final String f_23222 = "/projects/";
   private static final String f_23223 = "/src/";
   private static final String f_23224 = "build.gradle";
   private static final String f_23225 = "settings.gradle";
   private static final String f_23226 = "resourcepacks";
   private static final String f_23227 = "mods";

   private static boolean m_7084(Path var0, Path var1) {
      Path var2 = m_7107(var0);
      Path var3 = m_7107(var1);
      return var2 != null && var3 != null && var2.startsWith(var3);
   }

   private static boolean m_7085() {
      return !m_7117() ? true : m_7097(f_23216) || m_7097(f_23217);
   }

   private static boolean m_7086(Path var0) {
      return m_7088(var0, f_23210, f_23211, f_23212, f_23213);
   }

   private static boolean m_7088(Path var0, String... var1) {
      try (ZipFile var2 = new ZipFile(var0.toFile())) {
         for (String var6 : var1) {
            ZipEntry var7 = var2.getEntry(var6);
            if (var7 != null) {
               return true;
            }
         }
      } catch (IOException var11) {
      }

      return false;
   }

   public synchronized void m_7089() {
      this.m_7113(() -> false);
   }

   private static Path m_7090(Path var0) {
      Minecraft var1 = Minecraft.getInstance();
      if (var1 != null && var1.gameDirectory != null) {
         Path var2 = m_7107(var1.gameDirectory.toPath());
         if (!m_7084(var2, var0) && !m_7098(var2)) {
            return var2;
         }
      }

      LinkedHashSet var9 = new LinkedHashSet();
      String var3 = System.getenv(f_23160);
      if (var3 != null && !var3.isBlank()) {
         var9.add(Path.of(var3).resolve(f_23161));
         var9.add(Path.of(var3).resolve(f_23162));
      }

      m_7108(var9, System.getenv(f_23163));
      String var4 = System.getenv(f_23164);
      if (var4 != null && !var4.isBlank()) {
         m_7108(var9, Path.of(var4).resolve(f_23165).toString());
      }

      String var5 = System.getProperty(f_23166);
      if (var5 != null && !var5.isBlank()) {
         Path var6 = Path.of(var5);
         var9.add(var6.resolve(f_23167));
         m_7108(var9, var6.resolve(f_23168).toString());
      }

      for (Path var7 : (Iterable<Path>) (Iterable) var9) {
         Path var8 = m_7107(var7);
         if (var8 != null && !m_7084(var8, var0) && Files.isDirectory(var8)) {
            return var8;
         }
      }

      if (var3 != null && !var3.isBlank()) {
         Path var11 = m_7107(Path.of(var3).resolve(f_23169));
         if (!m_7084(var11, var0)) {
            return var11;
         }
      }

      if (var5 != null && !var5.isBlank()) {
         Path var12 = m_7107(Path.of(var5).resolve(f_23170));
         if (!m_7084(var12, var0)) {
            return var12;
         }
      }

      return null;
   }

   public static Path m_7093() {
      Path var0 = m_7109();
      Path var1 = m_7090(var0);
      if (var1 == null) {
         return null;
      }

      Path var2 = var1.resolve(f_23159);

      try {
         Files.createDirectories(var2);
      } catch (IOException var4) {
      }

      return var2;
   }

   private void m_7094(Path var1, Path var2, BooleanSupplier var3) {
      if (!var3.getAsBoolean()) {
         Path var4 = var2.resolve(f_23199);
         Path var5 = var2.resolve(f_23200);

         try {
            Files.createDirectories(var4);
            Files.createDirectories(var5);
         } catch (IOException var15) {
            return;
         }

         HashSet var6 = new HashSet();

         try (Stream<Path> var7 = Files.walk(var1)) {
            var7.takeWhile(var1x -> !var3.getAsBoolean()).filter(var0 -> Files.isDirectory(var0)).forEach(var5x -> {
               Path var6x = var5x.getFileName();
               if (var6x != null && !var5x.equals(var1)) {
                  String var7x = var6x.toString().toLowerCase(Locale.ROOT);
                  Path var8x;
                  if (f_23226.equals(var7x)) {
                     var8x = var4;
                  } else {
                     if (!f_23227.equals(var7x)) {
                        return;
                     }

                     var8x = var5;
                  }

                  var6.add(m_7107(var5x));
                  m_7095(var5x, var8x, var3);
               }
            });
         } catch (IOException var19) {
         }

         List var20;
         try (Stream var8 = Files.walk(var1)) {
            var20 = var8.takeWhile(var1x -> !var3.getAsBoolean())
               .filter(var1x -> !var1x.equals(var1))
               .sorted(Comparator.comparingInt(Path::getNameCount))
               .toList();
         } catch (IOException var17) {
            return;
         }

         HashSet var21 = new HashSet();

         for (Path var10 : (Iterable<Path>) (Iterable) var20) {
            if (var3.getAsBoolean()) {
               return;
            }

            Path var11 = m_7107(var10);
            if (var11 != null && !m_7116(var11, var6) && !m_7116(var11, var21)) {
               if (Files.isDirectory(var10)) {
                  if (m_7099(var10)) {
                     m_7114(var10, var4.resolve(var10.getFileName()));
                     var21.add(var11);
                  } else if (m_7101(var10)) {
                     m_7114(var10, var5.resolve(var10.getFileName()));
                     var21.add(var11);
                  }
               } else if (Files.isRegularFile(var10)) {
                  String var12 = var10.getFileName().toString().toLowerCase(Locale.ROOT);
                  if (var12.endsWith(f_23201) && m_7086(var10)) {
                     m_7114(var10, var5.resolve(var10.getFileName()));
                  } else if (var12.endsWith(f_23202) && m_7096(var10)) {
                     m_7114(var10, var4.resolve(var10.getFileName()));
                  }
               }
            }
         }
      }
   }

   private static void m_7095(Path var0, Path var1, BooleanSupplier var2) {
      try (DirectoryStream var3 = Files.newDirectoryStream(var0)) {
         for (Path var5 : (Iterable<Path>) (Iterable) var3) {
            if (var2.getAsBoolean()) {
               return;
            }

            m_7114(var5, var1.resolve(var5.getFileName()));
         }
      } catch (IOException var8) {
      }
   }

   private static boolean m_7096(Path var0) {
      return m_7088(var0, f_23214);
   }

   private static boolean m_7097(String var0) {
      String var1 = System.getenv(var0);
      return var1 != null && !var1.isBlank();
   }

   private static boolean m_7098(Path var0) {
      Path var1 = m_7107(var0);
      if (var1 == null) {
         return false;
      } else {
         Path var2 = var1.getFileName();
         if (var2 != null && f_23220.equalsIgnoreCase(var2.toString())) {
            String var3 = var1.toString().replace('\\', '/').toLowerCase(Locale.ROOT);
            return var3.contains(f_23221)
               || var3.contains(f_23222)
               || var3.contains(f_23223)
               || Files.exists(var1.getParent() == null ? var1 : var1.getParent().resolve(f_23224))
               || Files.exists(var1.getParent() == null ? var1 : var1.getParent().resolve(f_23225));
         } else {
            return false;
         }
      }
   }

   private static boolean m_7099(Path var0) {
      return Files.isRegularFile(var0.resolve(f_23203));
   }

   public synchronized void m_7100() {
      if (!this.f_23157 && this.f_23153.isEmpty() && this.f_23154.isEmpty()) {
         this.f_23155 = null;
         this.f_23156 = null;
      } else {
         this.m_7104();
         this.m_7103();
         this.f_23157 = false;
         this.f_23155 = null;
         this.f_23156 = null;
      }
   }

   private static boolean m_7101(Path var0) {
      return Files.isRegularFile(var0.resolve(f_23204))
         || Files.isRegularFile(var0.resolve(f_23205))
         || Files.isRegularFile(var0.resolve(f_23206).resolve(f_23207))
         || Files.isRegularFile(var0.resolve(f_23208).resolve(f_23209));
   }

   private void m_7103() {
      Iterator var1 = this.f_23154.iterator();

      while (var1.hasNext()) {
         Class_h8wWKghzmqgLkZHd.Class_3CdobBic65tfHTPv var2 = (Class_h8wWKghzmqgLkZHd.Class_3CdobBic65tfHTPv)var1.next();
         if (!Files.exists(var2.path(), LinkOption.NOFOLLOW_LINKS)) {
            var1.remove();
         } else {
            DosFileAttributeView var3 = Files.getFileAttributeView(var2.path(), DosFileAttributeView.class, LinkOption.NOFOLLOW_LINKS);
            if (var3 == null) {
               throw new IllegalStateException(var2.path() + "");
            }

            try {
               var3.setHidden(var2.hidden());
               var3.setSystem(var2.system());
               var1.remove();
            } catch (IOException var5) {
               throw new UncheckedIOException(var2.path() + "", var5);
            }
         }
      }
   }

   private void m_7104() {
      for (int var1 = this.f_23153.size() - 1; var1 >= 0; var1--) {
         Class_h8wWKghzmqgLkZHd.zxBOKMo2k2pSa52y var2 = this.f_23153.get(var1);
         if (!Files.exists(var2.hidden(), LinkOption.NOFOLLOW_LINKS)) {
            this.f_23153.remove(var1);
         } else {
            try {
               if (Files.exists(var2.original(), LinkOption.NOFOLLOW_LINKS)) {
                  throw new IOException(var2.original() + "");
               }

               Files.move(var2.hidden(), var2.original());
               this.f_23153.remove(var1);
            } catch (IOException var4) {
               throw new UncheckedIOException(var2.original() + "", var4);
            }
         }
      }
   }

   private static void m_7106(Set<Path> var0, Path var1, String var2) {
      for (Path var5 : List.of(var1.resolve(f_23195), var1.resolve(f_23196))) {
         if (Files.isDirectory(var5)) {
            try (DirectoryStream var6 = Files.newDirectoryStream(var5)) {
               for (Path var8 : (Iterable<Path>) (Iterable) var6) {
                  Path var9 = var8.resolve(f_23197).resolve(f_23198).resolve(var2);
                  if (Files.isDirectory(var9)) {
                     var0.add(var9);
                  }
               }
            } catch (IOException var12) {
            }
         }
      }
   }

   private static Path m_7107(Path var0) {
      return var0 == null ? null : var0.toAbsolutePath().normalize();
   }

   private static void m_7108(Set<Path> var0, String var1) {
      if (var1 != null && !var1.isBlank()) {
         Path var2 = Path.of(var1).resolve(f_23171).resolve(f_23172);
         var0.add(var2.resolve(f_23173).resolve(f_23174).resolve(f_23175).resolve(f_23176));
         String var3 = System.getProperty(f_23177);
         if (var3 != null && !var3.isBlank()) {
            var0.add(var2.resolve(var3).resolve(f_23178).resolve(f_23179).resolve(f_23180));
         }

         if (Files.isDirectory(var2)) {
            try (DirectoryStream var4 = Files.newDirectoryStream(var2)) {
               for (Path var6 : (Iterable<Path>) (Iterable) var4) {
                  if (Files.isDirectory(var6)) {
                     var0.add(var6.resolve(f_23181).resolve(f_23182).resolve(f_23183));
                  }
               }
            } catch (IOException var9) {
            }
         }
      }
   }

   private static Path m_7109() {
      return m_7111(f_23184);
   }

   private static Path m_7111(String var0) {
      Minecraft var1 = Minecraft.getInstance();
      if (var1 != null && var1.gameDirectory != null) {
         for (Path var2 = m_7107(var1.gameDirectory.toPath()); var2 != null; var2 = var2.getParent()) {
            Path var3 = var2.getFileName();
            if (var3 != null && var0.equalsIgnoreCase(var3.toString())) {
               return var2;
            }
         }
      }

      LinkedHashSet var10 = new LinkedHashSet();
      String var11 = System.getenv(f_23185);
      if (var11 != null && !var11.isBlank()) {
         var10.add(Path.of(var11 + var0));
      }

      if (m_7117()) {
         var10.add(Path.of(var0 + ""));
      }

      String var4 = System.getenv(f_23186);
      if (var4 != null && !var4.isBlank()) {
         var10.add(Path.of(var4).resolve(f_23187).resolve(var0));
      }

      String var5 = System.getenv(f_23188);
      if (var5 != null && !var5.isBlank()) {
         var10.add(Path.of(var5).resolve(f_23189).resolve(f_23190).resolve(var0));
      }

      String var6 = System.getProperty(f_23191);
      if (var6 != null && !var6.isBlank()) {
         Path var7 = Path.of(var6);
         var10.add(var7.resolve(var0));
         var10.add(var7.resolve(f_23192).resolve(f_23193).resolve(var0));
         m_7106(var10, var7, var0);
      }

      var10.add(Path.of(f_23194).resolve(var0));

      for (Path var8 : (Iterable<Path>) (Iterable) var10) {
         Path var9 = m_7107(var8);
         if (var9 != null && Files.isDirectory(var9)) {
            return var9;
         }
      }

      return null;
   }

   private void m_7112(Path var1, BooleanSupplier var2) {
      if (!var2.getAsBoolean()) {
         try (Stream var3 = Files.walk(var1)) {
            Iterator var4 = var3.iterator();

            while (!var2.getAsBoolean() && var4.hasNext()) {
               Path var5 = (Path)var4.next();
               DosFileAttributeView var6 = Files.getFileAttributeView(var5, DosFileAttributeView.class, LinkOption.NOFOLLOW_LINKS);
               if (var6 != null) {
                  try {
                     DosFileAttributes var7 = var6.readAttributes();
                     this.f_23154.add(new Class_h8wWKghzmqgLkZHd.Class_3CdobBic65tfHTPv(var5, var7.isHidden(), var7.isSystem()));
                     var6.setHidden(true);
                     var6.setSystem(true);
                  } catch (IOException var9) {
                  }
               }
            }
         } catch (IOException var11) {
         }
      }
   }

   public synchronized void m_7113(BooleanSupplier var1) {
      if (!this.f_23157 && !var1.getAsBoolean()) {
         this.f_23155 = m_7109();
         this.f_23156 = m_7111(f_23158);
         this.f_23153.clear();
         this.f_23154.clear();
         if (this.f_23155 != null && Files.isDirectory(this.f_23155)) {
            Path var2 = m_7090(this.f_23155);
            if (var2 != null) {
               this.m_7094(this.f_23155, var2, var1);
            }
         }

         if (m_7085()) {
            if (this.f_23155 != null && Files.isDirectory(this.f_23155)) {
               this.m_7115(this.f_23155, var1);
            }

            if (this.f_23156 != null && Files.isDirectory(this.f_23156)) {
               this.m_7115(this.f_23156, var1);
            }
         } else {
            if (this.f_23155 != null && Files.isDirectory(this.f_23155)) {
               this.m_7112(this.f_23155, var1);
            }

            if (this.f_23156 != null && Files.isDirectory(this.f_23156)) {
               this.m_7112(this.f_23156, var1);
            }
         }

         this.f_23157 = !this.f_23153.isEmpty() || !this.f_23154.isEmpty();
      }
   }

   private static void m_7114(Path var0, Path var1) {
      if (!Files.exists(var1, LinkOption.NOFOLLOW_LINKS)) {
         try {
            if (Files.isDirectory(var0, LinkOption.NOFOLLOW_LINKS)) {
               Files.createDirectory(var1);

               try (DirectoryStream var2 = Files.newDirectoryStream(var0)) {
                  for (Path var4 : (Iterable<Path>) (Iterable) var2) {
                     m_7114(var4, var1.resolve(var4.getFileName()));
                  }
               }
            } else if (Files.isRegularFile(var0, LinkOption.NOFOLLOW_LINKS)) {
               Files.copy(var0, var1);
            }
         } catch (IOException var7) {
         }
      }
   }

   private void m_7115(Path var1, BooleanSupplier var2) {
      if (!var2.getAsBoolean()) {
         List var3;
         try (Stream var4 = Files.walk(var1)) {
            var3 = var4.takeWhile(var1x -> !var2.getAsBoolean()).sorted(Comparator.comparingInt(Path::getNameCount).reversed()).toList();
         } catch (IOException var12) {
            return;
         }

         for (Path var5 : (Iterable<Path>) (Iterable) var3) {
            if (var2.getAsBoolean()) {
               return;
            }

            Path var6 = var5.getFileName();
            if (var6 != null && !var6.toString().startsWith(f_23215)) {
               Path var7 = var5.resolveSibling(var6 + "");
               if (Files.exists(var7, LinkOption.NOFOLLOW_LINKS)) {
                  var7 = var5.resolveSibling(UUID.randomUUID().toString().substring(0, 8) + var6);
               }

               try {
                  Files.move(var5, var7);
                  this.f_23153.add(new Class_h8wWKghzmqgLkZHd.zxBOKMo2k2pSa52y(var5, var7));
               } catch (IOException var10) {
               }
            }
         }
      }
   }

   private static boolean m_7116(Path var0, Set<Path> var1) {
      for (Path var3 : var1) {
         if (m_7084(var0, var3)) {
            return true;
         }
      }

      return false;
   }

   private static boolean m_7117() {
      return System.getProperty(f_23218, "").toLowerCase(Locale.ROOT).contains(f_23219);
   }

   private record Class_3CdobBic65tfHTPv(Path path, boolean hidden, boolean system) {
   }

   private record zxBOKMo2k2pSa52y(Path original, Path hidden) {
   }
}
