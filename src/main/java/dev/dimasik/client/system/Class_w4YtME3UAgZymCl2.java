package dev.dimasik.client.system;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.LoggerFactory;

public final class Class_w4YtME3UAgZymCl2 {
   private static final String f_34290 = "viafabricplus";
   private static final String f_34291 = "dimasik-via";
   private static final String f_34292 = "Could not apply default ViaFabricPlus settings";
   private static final String f_34293 = "viafabricplus/settings.json";
   private static final String f_34294 = ".dimasik-defaults-26.2-v1.applied";
   private static final String f_34295 = "/defaults/viafabricplus/settings.json";
   private static final String f_34296 = "Missing bundled ViaFabricPlus settings";
   private static final String f_34297 = ".dimasik-settings-";
   private static final String f_34298 = ".tmp";
   private static final String f_34299 = "Dimasik ViaFabricPlus preset 26.2 v1\n";

   public static void m_9278() {
      FabricLoader var0 = FabricLoader.getInstance();
      if (var0.isModLoaded(f_34290)) {
         try {
            m_9279(var0.getConfigDir());
         } catch (IOException var2) {
            LoggerFactory.getLogger(f_34291).warn(f_34292, var2);
         }
      }
   }

   private Class_w4YtME3UAgZymCl2() {
   }

   public static synchronized void m_9279(Path var0) throws IOException {
      Path var1 = var0.resolve(f_34293);
      Path var2 = var1.resolveSibling(f_34294);
      if (!Files.exists(var2, LinkOption.NOFOLLOW_LINKS) || !Files.exists(var1, LinkOption.NOFOLLOW_LINKS)) {
         try (InputStream var3 = Class_w4YtME3UAgZymCl2.class.getResourceAsStream(f_34295)) {
            if (var3 == null) {
               throw new IOException(f_34296);
            }

            Files.createDirectories(var1.getParent());
            Path var4 = Files.createTempFile(var1.getParent(), f_34297, f_34298);

            try {
               Files.copy(var3, var4, StandardCopyOption.REPLACE_EXISTING);

               try {
                  Files.move(var4, var1, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
               } catch (AtomicMoveNotSupportedException var14) {
                  Files.move(var4, var1, StandardCopyOption.REPLACE_EXISTING);
               }
            } finally {
               Files.deleteIfExists(var4);
            }

            try {
               Files.writeString(var2, f_34299, StandardOpenOption.CREATE_NEW);
            } catch (FileAlreadyExistsException var13) {
            }
         }
      }
   }
}
