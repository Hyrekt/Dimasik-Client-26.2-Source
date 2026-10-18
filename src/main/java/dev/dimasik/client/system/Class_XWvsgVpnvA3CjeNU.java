package dev.dimasik.client.system;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import dev.dimasik.client.DimasikClient;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import net.minecraft.client.Minecraft;
import org.slf4j.LoggerFactory;

public abstract class Class_XWvsgVpnvA3CjeNU {
   private final String f_15977;
   private final String f_15978;
   private final File f_15979;
   private final File f_15980;
   private static final String f_15981 = ".conf";
   private static final String f_15982 = "SystemDrive";
   private static final String f_15983 = "SystemDrive";
   private static final String f_15984 = "Could not load config {}";

   protected final Path m_5555() {
      return this.f_15980.toPath();
   }

   private void m_5556() {
      if (!this.f_15979.exists()) {
         boolean var1 = this.f_15979.mkdirs();
         if (!var1) {
            System.out.println(this.f_15979.getAbsolutePath() + "");
         }
      }
   }

   public Class_XWvsgVpnvA3CjeNU(String var1, String var2) {
      this.f_15978 = f_15981;
      String var3 = System.getenv(f_15982) == null ? Minecraft.getInstance().gameDirectory.toString() : System.getenv(f_15983);
      this.f_15979 = new File(var3 + "", var1);
      this.f_15980 = new File(this.f_15979, var2 + "");
      this.f_15977 = var2;
   }

   protected String m_5557() {
      String var1 = "";

      try {
         var1 = Files.readString(this.f_15980.toPath());
      } catch (Exception var3) {
         System.out.println(var3.getMessage());
      }

      return var1;
   }

   protected abstract void m_809();

   protected abstract void m_808();

   protected void m_5558(JsonObject var1) {
      String var2 = new GsonBuilder().setPrettyPrinting().create().toJson(var1);

      try {
         Files.writeString(this.f_15980.toPath(), var2);
      } catch (Exception var4) {
         System.out.println(var4.getMessage());
      }
   }

   public void m_5559() {
      this.m_5556();

      try {
         this.m_809();
         if (this instanceof Class_45nqA0iofm7tcRxz) {
            DimasikClient.m_9057().m_9049().m_2802().m_8849(this.f_15977);
         }
      } catch (Exception var2) {
         System.out.println(var2.getMessage());
      }
   }

   public void m_5560() {
      this.m_5556();

      try {
         this.m_808();
      } catch (Exception var2) {
         LoggerFactory.getLogger(Class_XWvsgVpnvA3CjeNU.class).error(f_15984, this.f_15980, var2);
      }
   }
}
