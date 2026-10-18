package dev.dimasik.client.system;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.InventorySort;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Class_cJQku3bWqxTcFxbA extends Class_XWvsgVpnvA3CjeNU {
   private static final Logger f_18153 = LoggerFactory.getLogger(Class_cJQku3bWqxTcFxbA.class);
   private boolean f_18154;
   private boolean f_18155;
   private static final String f_18156 = "dimasik/client";
   private static final String f_18157 = "inventorysort";
   private static final String f_18158 = "inventorysort-";
   private static final String f_18159 = ".tmp";
   private static final String f_18160 = "Could not save inventory presets";
   private static final String f_18161 = "Could not read inventory presets from {}";
   private static final String f_18162 = "inventorysort.conf.bak";

   private Path m_6150() {
      return this.m_5555().resolveSibling(f_18162);
   }

   private InventorySort m_6151() {
      return DimasikClient.m_9057().m_9049().m_2801().m_3514();
   }

   @Override
   protected void m_809() {
      this.m_6152();
   }

   public Class_cJQku3bWqxTcFxbA() {
      super(f_18156, f_18157);
   }

   @Override
   protected synchronized void m_808() {
      Path var1 = this.m_5555();
      if (!Files.exists(var1) && !Files.exists(this.m_6150())) {
         this.f_18154 = true;
      } else {
         for (Path var5 : new Path[]{var1, this.m_6150()}) {
            if (Files.exists(var5)) {
               try {
                  Class_cxtVSustGMvg4Bq0 var6 = Class_cxtVSustGMvg4Bq0.m_6309(JsonParser.parseString(Files.readString(var5)).getAsJsonObject());
                  this.m_6151().m_8568(var6);
                  this.f_18154 = true;
                  this.f_18155 = var5.equals(var1);
                  return;
               } catch (Exception var7) {
                  f_18153.warn(f_18161, var5, var7);
               }
            }
         }

         this.f_18154 = false;
      }
   }

   public synchronized boolean m_6152() {
      if (!this.f_18154) {
         return false;
      }

      Path var1 = this.m_5555();
      Path var2 = null;

      try {
         String var3 = new GsonBuilder().setPrettyPrinting().create().toJson(this.m_6151().m_8592());
         Files.createDirectories(var1.getParent());
         var2 = Files.createTempFile(var1.getParent(), f_18158, f_18159);
         Files.writeString(var2, var3);
         if (this.f_18155 && Files.exists(var1)) {
            Files.copy(var1, this.m_6150(), StandardCopyOption.REPLACE_EXISTING);
         }

         try {
            Files.move(var2, var1, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
         } catch (AtomicMoveNotSupportedException var15) {
            Files.move(var2, var1, StandardCopyOption.REPLACE_EXISTING);
         }

         this.f_18155 = true;
         return true;
      } catch (Exception var16) {
         f_18153.error(f_18160, var16);
         return false;
      } finally {
         if (var2 != null) {
            try {
               Files.deleteIfExists(var2);
            } catch (Exception var14) {
            }
         }
      }
   }
}
