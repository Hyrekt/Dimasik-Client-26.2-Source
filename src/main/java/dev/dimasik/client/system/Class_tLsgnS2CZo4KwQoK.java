package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents.ClientStarted;
import net.minecraft.client.Minecraft;

public class Class_tLsgnS2CZo4KwQoK extends ArrayList<Class_XWvsgVpnvA3CjeNU> {
   private String f_31802;
   private final Class_45nqA0iofm7tcRxz f_31803;
   private final Class_XQX01nM8iTANXGPn f_31804;
   private final Class_pZElkB6ygH79lgXP f_31805;
   private final Class_gDB0tHqpVfvOykZx f_31806;
   private final Class_0rpJ2A1OAYfEQxm8 f_31807;
   private final Class_TgwuxY7A2jBHEHu1 f_31808;
   private final Class_cJQku3bWqxTcFxbA f_31809;
   private final Class_DrbZuNmIFKyuiwnJ f_31810;
   private final Class_8jWMtShKXpT6Bwm7 f_31811;
   private final Class_JJ2rV4BR05zxdDVz f_31812;
   private final Class_quxPIL1zsi4ypAOk f_31813;
   private final Class_NemBs7k8zCRBUucm f_31814;
   private final Class_rpKWQ1k3x4TuZQdK f_31815;
   private final Class_3DEWOEl8zI8DBsJL f_31816;
   private static final String f_31817 = "auto";
   private static final String f_31818 = "Auto Save Thread";
   private static final String f_31819 = "SystemDrive";
   private static final String f_31820 = "SystemDrive";
   private static final String f_31821 = "dimasik/configs/custom";
   private static final String f_31822 = "Created configs folder.";
   private static final String f_31823 = "Failed to create configs folder.";
   private static final String f_31824 = ".conf";

   @Generated
   public Class_quxPIL1zsi4ypAOk m_8842() {
      return this.f_31813;
   }

   @Generated
   public Class_gDB0tHqpVfvOykZx m_8843() {
      return this.f_31806;
   }

   @Generated
   public Class_45nqA0iofm7tcRxz m_8844() {
      return this.f_31803;
   }

   @Generated
   public Class_TgwuxY7A2jBHEHu1 m_8845() {
      return this.f_31808;
   }

   @Generated
   public Class_0rpJ2A1OAYfEQxm8 m_8846() {
      return this.f_31807;
   }

   public void m_8847() {
      Minecraft var1 = Minecraft.getInstance();
      if (var1.getResourceManager() != null) {
         var1.execute(this::m_8855);
      } else {
         ClientLifecycleEvents.CLIENT_STARTED.register((ClientStarted)var1x -> var1x.execute(this::m_8855));
      }
   }

   @Generated
   public Class_8jWMtShKXpT6Bwm7 m_8848() {
      return this.f_31811;
   }

   @Generated
   public void m_8849(String var1) {
      this.f_31802 = var1;
   }

   public void m_8851() {
      if (DimasikClient.m_9057() == null
         || DimasikClient.m_9057().m_9049() == null
         || DimasikClient.m_9057().m_9049().m_2805() == null
         || !DimasikClient.m_9057().m_9049().m_2805().m_1652()) {
         for (Class_XWvsgVpnvA3CjeNU var2 : this) {
            var2.m_5559();
         }
      }
   }

   @Generated
   public Class_DrbZuNmIFKyuiwnJ m_8852() {
      return this.f_31810;
   }

   private void m_8853() {
      Thread var1 = new Thread(f_31818) {
         public static final String f_31801 = "Thread finished.";

         @Override
         public void run() {
            Class_tLsgnS2CZo4KwQoK.this.m_8851();
            System.out.println(f_31801);
         }
      };
      Runtime.getRuntime().addShutdownHook(var1);
   }

   @Generated
   public Class_cJQku3bWqxTcFxbA m_8854() {
      return this.f_31809;
   }

   public void m_8855() {
      for (Class_XWvsgVpnvA3CjeNU var2 : this) {
         var2.m_5560();
      }

      this.f_31816.m_1249();
   }

   @Generated
   public Class_NemBs7k8zCRBUucm m_8856() {
      return this.f_31814;
   }

   @Generated
   public Class_3DEWOEl8zI8DBsJL m_8857() {
      return this.f_31816;
   }

   public Class_tLsgnS2CZo4KwQoK(Class_3DEWOEl8zI8DBsJL var1, Class_XHmGFP4pbXhGQRa5 var2) {
      this.f_31802 = f_31817;
      this.f_31816 = var1;
      this.f_31803 = new Class_45nqA0iofm7tcRxz();
      this.f_31804 = new Class_XQX01nM8iTANXGPn();
      this.f_31805 = new Class_pZElkB6ygH79lgXP();
      this.f_31806 = new Class_gDB0tHqpVfvOykZx();
      this.f_31807 = new Class_0rpJ2A1OAYfEQxm8();
      this.f_31808 = new Class_TgwuxY7A2jBHEHu1();
      this.f_31809 = new Class_cJQku3bWqxTcFxbA();
      this.f_31810 = new Class_DrbZuNmIFKyuiwnJ();
      this.f_31811 = new Class_8jWMtShKXpT6Bwm7();
      this.f_31812 = new Class_JJ2rV4BR05zxdDVz(var1);
      this.f_31813 = new Class_quxPIL1zsi4ypAOk(var2);
      this.f_31814 = new Class_NemBs7k8zCRBUucm();
      this.f_31815 = new Class_rpKWQ1k3x4TuZQdK();
      this.add(this.f_31812);
      this.add(this.f_31803);
      this.add(this.f_31804);
      this.add(this.f_31805);
      this.add(this.f_31806);
      this.add(this.f_31807);
      this.add(this.f_31808);
      this.add(this.f_31809);
      this.add(this.f_31810);
      this.add(this.f_31811);
      this.add(this.f_31813);
      this.add(this.f_31814);
      this.add(this.f_31815);
      var1.m_1258(this.f_31812::m_5559);
      var2.m_5532(this.f_31813::m_5559);
      this.m_8853();
   }

   @Generated
   public Class_JJ2rV4BR05zxdDVz m_8858() {
      return this.f_31812;
   }

   @Generated
   public Class_XQX01nM8iTANXGPn m_8859() {
      return this.f_31804;
   }

   @Generated
   public Class_rpKWQ1k3x4TuZQdK m_8860() {
      return this.f_31815;
   }

   @Generated
   public Class_pZElkB6ygH79lgXP m_8861() {
      return this.f_31805;
   }

   public List<String> m_8862() {
      ArrayList var1 = new ArrayList();
      String var2 = System.getenv(f_31819) == null ? Minecraft.getInstance().gameDirectory.toString() : System.getenv(f_31820);
      File var3 = new File(var2 + "", f_31821);
      if (!var3.exists()) {
         if (var3.mkdirs()) {
            System.out.println(f_31822);
         } else {
            System.out.println(f_31823);
         }
      }

      File[] var4 = var3.listFiles();
      if (var4 == null) {
         return var1;
      }

      for (File var8 : var4) {
         if (var8.isFile() && var8.getName().endsWith(f_31824)) {
            var1.add(var8.getName().substring(0, var8.getName().length() - 5));
         }
      }

      return var1;
   }

   @Generated
   public String m_8863() {
      return this.f_31802;
   }
}
