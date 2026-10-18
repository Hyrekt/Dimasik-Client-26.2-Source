package dev.dimasik.client.module.render;

import com.google.gson.JsonObject;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_0p152hWffX3ippAf;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_WhZ6MBDQaQZ0AZFd;
import lombok.Generated;

public class ClickGui extends Module {
   private final CheckboxSetting f_29222;
   private final SliderSetting f_29223;
   private final CheckboxSetting f_29224;
   private static final String f_29225 = "ClickGui";
   private static final String f_29226 = "Главное меню чита";
   private static final String f_29227 = "Блик";
   private static final String f_29228 = "Скорость анимации";
   private static final float f_29229 = 0.1F;
   private static final float f_29230 = 3.0F;
   private static final float f_29231 = 0.1F;
   private static final String f_29232 = "Фоновый шейдер";
   private static final String f_29233 = "Interface";
   private static final String f_29234 = "Interface";
   private static final String f_29235 = "Interface";
   private static final String f_29236 = "Interface";
   private static final String f_29237 = "Settings";
   private static final String f_29238 = "Settings";
   private static final String f_29239 = "Settings";
   private static final String f_29240 = "Язык";
   private static final String f_29241 = "English";
   private static final String f_29242 = "Язык";
   private static final float f_29243 = 0.1F;
   private static final float f_29244 = 2000.0F;
   private static final float f_29245 = 0.55F;
   private static final float f_29246 = 255.0F;
   private static final float f_29247 = 0.001F;
   private static final float f_29248 = 0.45F;

   public float m_8275() {
      float var1 = Math.max(f_29243, this.f_29223.m_8768());
      float var2 = f_29244 / var1;
      return (float)(System.currentTimeMillis() % (long)var2) / var2;
   }

   @Override
   public void m_789() {
      this.m_8280();
      f_11537.gui.setScreen(DimasikClient.m_9057().m_9053().m_2276());
   }

   public boolean m_8276() {
      return this.f_29224.m_8768();
   }

   @Generated
   public SliderSetting m_8277() {
      return this.f_29223;
   }

   public float m_8278() {
      return f_29245 * (Class_Ssh31B3ljfKeWsvS.m_4821() / f_29246);
   }

   public boolean m_8279() {
      return this.f_29222.m_8768();
   }

   @Override
   public void m_791(JsonObject var1) {
      super.m_791(var1);
      if (var1 != null) {
         if (var1.has(f_29234) && var1.get(f_29235).isJsonObject()) {
            Class_WhZ6MBDQaQZ0AZFd.m_5494(var1.getAsJsonObject(f_29236));
         } else if (var1.has(f_29237) && var1.get(f_29238).isJsonObject()) {
            JsonObject var2 = var1.getAsJsonObject(f_29239);
            if (var2.has(f_29240)) {
               Class_WhZ6MBDQaQZ0AZFd.m_5490(f_29241.equals(var2.get(f_29242).getAsString()));
            }
         }

         this.m_8280();
      }
   }

   public ClickGui() {
      super(f_29225, f_29226, Category.RENDER);
      this.f_29222 = new CheckboxSetting(f_29227, false);
      this.f_29223 = new SliderSetting(f_29228, 1.0F, f_29229, f_29230).m_828(f_29231).m_822(this.f_29222::m_8768);
      this.f_29224 = new CheckboxSetting(f_29232, true);
      this.m_779().m_1367(344);
      this.m_795(this.f_29223, this.f_29224);
   }

   public void m_8280() {
      Class_0p152hWffX3ippAf.m_803(this.m_8284());
   }

   @Override
   public JsonObject m_782() {
      JsonObject var1 = super.m_782();
      var1.add(f_29233, Class_WhZ6MBDQaQZ0AZFd.m_5486());
      return var1;
   }

   @Generated
   public CheckboxSetting m_8281() {
      return this.f_29222;
   }

   public void m_8282(float var1, float var2, float var3, float var4, float var5) {
      if (this.m_8279()) {
         float var6 = this.m_8278();
         if (!(var6 <= f_29247)) {
            Class_Ssh31B3ljfKeWsvS.m_4805(var1, var2, var3, var4, this.m_8275(), var6, f_29248, var5);
         }
      }
   }

   @Generated
   public CheckboxSetting m_8283() {
      return this.f_29224;
   }

   public boolean m_8284() {
      return Class_WhZ6MBDQaQZ0AZFd.m_5495();
   }
}
