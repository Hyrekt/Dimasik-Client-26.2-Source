package dev.dimasik.client.module.movement;

import com.google.gson.JsonObject;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.module.combat.ElytraTarget;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.setting.impl.StringSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_U4Qsm43RVlUI3Pre;
import dev.dimasik.client.system.Class_XqyHOyiq0ROk9HLU;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;

public class ElytraBooster extends Module {
   private static final long f_14052 = 190000000L;
   private static final float f_14053 = 6.0F;
   private static final int f_14054 = 20;
   public final MultiChoiceSetting f_14055;
   public final CheckboxSetting f_14056;
   public final StringSetting f_14057;
   public final SliderSetting f_14058;
   public final SliderSetting f_14059;
   public final SliderSetting f_14060;
   public final SliderSetting f_14061;
   public final SliderSetting f_14062;
   public final SliderSetting f_14063;
   public final SliderSetting f_14064;
   public final SliderSetting f_14065;
   public final SliderSetting f_14066;
   public final StringSetting f_14067;
   public final SliderSetting f_14068;
   public final SliderSetting f_14069;
   public final SliderSetting f_14070;
   public final SliderSetting f_14071;
   public final SliderSetting f_14072;
   public final SliderSetting f_14073;
   public final SliderSetting f_14074;
   public final SliderSetting f_14075;
   public final SliderSetting f_14076;
   private final ElytraBooster.COQsHqPFOihHlKCz f_14077;
   private final ElytraBooster.COQsHqPFOihHlKCz f_14078;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_14079;
   private final Class_gEPk7yDw6CwIte87<Class_XqyHOyiq0ROk9HLU> f_14080;
   private static final String f_14081 = "ElytraBooster";
   private static final String f_14082 = "Усиливает ускорение от фейерверков при полёте на элитрах";
   private static final String f_14083 = "Мод";
   private static final String f_14084 = "ReallyWorld 1.16.5";
   private static final String f_14085 = "ReallyWorld 1.21.11";
   private static final String f_14086 = "BravoHvH";
   private static final String f_14087 = "Custom";
   private static final String f_14088 = "Рисовать текущий Yaw или Pitch";
   private static final String f_14089 = "Бустер по X";
   private static final String f_14090 = "0-5 По X";
   private static final float f_14091 = 1.5F;
   private static final float f_14092 = 1.5F;
   private static final float f_14093 = 2.5F;
   private static final float f_14094 = 0.01F;
   private static final String f_14095 = "5-10 По X";
   private static final float f_14096 = 1.5F;
   private static final float f_14097 = 1.5F;
   private static final float f_14098 = 2.5F;
   private static final float f_14099 = 0.01F;
   private static final String f_14100 = "10-15 По X";
   private static final float f_14101 = 1.5F;
   private static final float f_14102 = 1.5F;
   private static final float f_14103 = 2.5F;
   private static final float f_14104 = 0.01F;
   private static final String f_14105 = "15-20 По X";
   private static final float f_14106 = 1.5F;
   private static final float f_14107 = 1.5F;
   private static final float f_14108 = 2.5F;
   private static final float f_14109 = 0.01F;
   private static final String f_14110 = "20-25 По X";
   private static final float f_14111 = 1.5F;
   private static final float f_14112 = 1.5F;
   private static final float f_14113 = 2.5F;
   private static final float f_14114 = 0.01F;
   private static final String f_14115 = "25-30 По X";
   private static final float f_14116 = 1.5F;
   private static final float f_14117 = 1.5F;
   private static final float f_14118 = 2.5F;
   private static final float f_14119 = 0.01F;
   private static final String f_14120 = "30-35 По X";
   private static final float f_14121 = 1.5F;
   private static final float f_14122 = 1.5F;
   private static final float f_14123 = 2.5F;
   private static final float f_14124 = 0.01F;
   private static final String f_14125 = "35-40 По X";
   private static final float f_14126 = 1.5F;
   private static final float f_14127 = 1.5F;
   private static final float f_14128 = 2.5F;
   private static final float f_14129 = 0.01F;
   private static final String f_14130 = "40-45 По X";
   private static final float f_14131 = 1.5F;
   private static final float f_14132 = 1.5F;
   private static final float f_14133 = 2.5F;
   private static final float f_14134 = 0.01F;
   private static final String f_14135 = "Бустер по Y";
   private static final String f_14136 = "0-5 По Y";
   private static final float f_14137 = 1.5F;
   private static final float f_14138 = 1.5F;
   private static final float f_14139 = 2.5F;
   private static final float f_14140 = 0.01F;
   private static final String f_14141 = "5-10 По Y";
   private static final float f_14142 = 1.5F;
   private static final float f_14143 = 1.5F;
   private static final float f_14144 = 2.5F;
   private static final float f_14145 = 0.01F;
   private static final String f_14146 = "10-15 По Y";
   private static final float f_14147 = 1.5F;
   private static final float f_14148 = 1.5F;
   private static final float f_14149 = 2.5F;
   private static final float f_14150 = 0.01F;
   private static final String f_14151 = "15-20 По Y";
   private static final float f_14152 = 1.5F;
   private static final float f_14153 = 1.5F;
   private static final float f_14154 = 2.5F;
   private static final float f_14155 = 0.01F;
   private static final String f_14156 = "20-25 По Y";
   private static final float f_14157 = 1.5F;
   private static final float f_14158 = 1.5F;
   private static final float f_14159 = 2.5F;
   private static final float f_14160 = 0.01F;
   private static final String f_14161 = "25-30 По Y";
   private static final float f_14162 = 1.5F;
   private static final float f_14163 = 1.5F;
   private static final float f_14164 = 2.5F;
   private static final float f_14165 = 0.01F;
   private static final String f_14166 = "30-35 По Y";
   private static final float f_14167 = 1.5F;
   private static final float f_14168 = 1.5F;
   private static final float f_14169 = 2.5F;
   private static final float f_14170 = 0.01F;
   private static final String f_14171 = "35-40 По Y";
   private static final float f_14172 = 1.5F;
   private static final float f_14173 = 1.5F;
   private static final float f_14174 = 2.5F;
   private static final float f_14175 = 0.01F;
   private static final String f_14176 = "40-45 По Y";
   private static final float f_14177 = 1.5F;
   private static final float f_14178 = 1.5F;
   private static final float f_14179 = 2.5F;
   private static final float f_14180 = 0.01F;
   private static final String f_14181 = "Settings";
   private static final String f_14182 = "Settings";
   private static final String f_14183 = "Settings";
   private static final String f_14184 = "ReallyWorld";
   private static final String f_14185 = "ReallyWorld 1.16.5";
   private static final String f_14186 = "ReallyWorld";
   private static final String f_14187 = "ReallyWorld 1.16.5";
   private static final String f_14188 = "ReallyWorld 1.16.5";
   private static final String f_14189 = "ReallyWorld";
   private static final String f_14190 = "Yaw: ";
   private static final float f_14191 = 40.0F;
   private static final String f_14192 = "Pitch: ";
   private static final float f_14193 = 70.0F;
   private static final float f_14194 = 20.0F;
   private static final float f_14195 = 1.05F;
   private static final double f_14196 = 3.0;
   private static final float f_14197 = 6.0F;
   private static final double f_14198 = Math.PI;
   private static final float f_14199 = 0.28F;
   private static final float f_14200 = 6.0F;
   private static final float f_14201 = 6.0F;
   private static final String f_14202 = "°";
   private static final float f_14203 = 20.0F;
   private static final float f_14204 = 1.5F;
   private static final float f_14205 = 1.5F;
   private static final float f_14206 = 45.0F;
   private static final float f_14207 = 90.0F;
   private static final float f_14208 = 45.0F;
   private static final float f_14209 = 90.0F;
   private static final String f_14210 = "ReallyWorld 1.16.5";
   private static final float f_14211 = 5.0F;
   private static final float f_14212 = 5.0F;
   private static final float f_14213 = 10.0F;
   private static final float f_14214 = 10.0F;
   private static final float f_14215 = 15.0F;
   private static final float f_14216 = 15.0F;
   private static final float f_14217 = 20.0F;
   private static final float f_14218 = 20.0F;
   private static final float f_14219 = 25.0F;
   private static final float f_14220 = 25.0F;
   private static final float f_14221 = 30.0F;
   private static final float f_14222 = 30.0F;
   private static final float f_14223 = 35.0F;
   private static final float f_14224 = 35.0F;
   private static final float f_14225 = 40.0F;
   private static final float f_14226 = 40.0F;
   private static final float f_14227 = 45.0F;
   private static final float f_14228 = 45.0F;
   private static final float f_14229 = 1.81F;
   private static final float f_14230 = 1.81F;
   private static final float f_14231 = 1.81F;
   private static final float f_14232 = 1.81F;
   private static final float f_14233 = 1.73F;
   private static final float f_14234 = 1.71F;
   private static final float f_14235 = 1.66F;
   private static final float f_14236 = 1.63F;
   private static final float f_14237 = 1.6F;
   private static final float f_14238 = 5.0F;
   private static final float f_14239 = 1.6F;
   private static final float f_14240 = 10.0F;
   private static final float f_14241 = 1.62F;
   private static final float f_14242 = 15.0F;
   private static final float f_14243 = 1.6F;
   private static final float f_14244 = 20.0F;
   private static final float f_14245 = 1.62F;
   private static final float f_14246 = 25.0F;
   private static final float f_14247 = 1.64F;
   private static final float f_14248 = 30.0F;
   private static final float f_14249 = 1.68F;
   private static final float f_14250 = 35.0F;
   private static final float f_14251 = 1.75F;
   private static final float f_14252 = 40.0F;
   private static final float f_14253 = 1.9F;
   private static final float f_14254 = 43.0F;
   private static final float f_14255 = 45.0F;
   private static final float f_14256 = 2.26F;
   private static final float f_14257 = 2.16F;
   private static final String f_14258 = "ReallyWorld 1.21.11";
   private static final float f_14259 = 30.0F;
   private static final float f_14260 = 30.0F;
   private static final float f_14261 = 1.53F;
   private static final float f_14262 = 40.0F;
   private static final float f_14263 = 40.0F;
   private static final float f_14264 = 2.04F;
   private static final float f_14265 = 2.059F;
   private static final float f_14266 = 30.0F;
   private static final float f_14267 = 1.53F;
   private static final float f_14268 = 2.02F;
   private static final String f_14269 = "BravoHvH";
   private static final float f_14270 = 5.0F;
   private static final float f_14271 = 5.0F;
   private static final float f_14272 = 10.0F;
   private static final float f_14273 = 10.0F;
   private static final float f_14274 = 15.0F;
   private static final float f_14275 = 15.0F;
   private static final float f_14276 = 20.0F;
   private static final float f_14277 = 20.0F;
   private static final float f_14278 = 25.0F;
   private static final float f_14279 = 25.0F;
   private static final float f_14280 = 30.0F;
   private static final float f_14281 = 30.0F;
   private static final float f_14282 = 35.0F;
   private static final float f_14283 = 35.0F;
   private static final float f_14284 = 40.0F;
   private static final float f_14285 = 40.0F;
   private static final float f_14286 = 45.0F;
   private static final float f_14287 = 45.0F;
   private static final float f_14288 = 2.05F;
   private static final float f_14289 = 2.05F;
   private static final float f_14290 = 2.01F;
   private static final float f_14291 = 1.87F;
   private static final float f_14292 = 1.77F;
   private static final float f_14293 = 1.73F;
   private static final float f_14294 = 1.68F;
   private static final float f_14295 = 1.67F;
   private static final float f_14296 = 1.64F;
   private static final float f_14297 = 5.0F;
   private static final float f_14298 = 1.65F;
   private static final float f_14299 = 10.0F;
   private static final float f_14300 = 1.7F;
   private static final float f_14301 = 15.0F;
   private static final float f_14302 = 1.71F;
   private static final float f_14303 = 20.0F;
   private static final float f_14304 = 1.74F;
   private static final float f_14305 = 25.0F;
   private static final float f_14306 = 1.79F;
   private static final float f_14307 = 30.0F;
   private static final float f_14308 = 1.91F;
   private static final float f_14309 = 35.0F;
   private static final float f_14310 = 2.01F;
   private static final float f_14311 = 40.0F;
   private static final float f_14312 = 2.02F;
   private static final float f_14313 = 2.02F;
   private static final String f_14314 = "Custom";
   private static final float f_14315 = 5.0F;
   private static final float f_14316 = 5.0F;
   private static final float f_14317 = 10.0F;
   private static final float f_14318 = 10.0F;
   private static final float f_14319 = 15.0F;
   private static final float f_14320 = 15.0F;
   private static final float f_14321 = 20.0F;
   private static final float f_14322 = 20.0F;
   private static final float f_14323 = 25.0F;
   private static final float f_14324 = 25.0F;
   private static final float f_14325 = 30.0F;
   private static final float f_14326 = 30.0F;
   private static final float f_14327 = 35.0F;
   private static final float f_14328 = 35.0F;
   private static final float f_14329 = 40.0F;
   private static final float f_14330 = 40.0F;
   private static final float f_14331 = 45.0F;
   private static final float f_14332 = 45.0F;
   private static final float f_14333 = 5.0F;
   private static final float f_14334 = 10.0F;
   private static final float f_14335 = 15.0F;
   private static final float f_14336 = 20.0F;
   private static final float f_14337 = 25.0F;
   private static final float f_14338 = 30.0F;
   private static final float f_14339 = 35.0F;
   private static final float f_14340 = 40.0F;
   private static final float f_14341 = 1.5F;
   private static final float f_14342 = 1.5F;
   private static final float f_14343 = 1.5F;
   private static final float f_14344 = 180.0F;
   private static final float f_14345 = 90.0F;
   private static final float f_14346 = 180.0F;
   private static final float f_14347 = -90.0F;
   private static final float f_14348 = 180.0F;
   private static final String f_14349 = "Custom";
   private static final String f_14350 = "Custom";
   private static final String f_14351 = "Custom";
   private static final String f_14352 = "Custom";
   private static final String f_14353 = "Custom";
   private static final String f_14354 = "Custom";
   private static final String f_14355 = "Custom";
   private static final String f_14356 = "Custom";
   private static final String f_14357 = "Custom";
   private static final String f_14358 = "Custom";
   private static final String f_14359 = "Custom";
   private static final String f_14360 = "Custom";
   private static final String f_14361 = "Custom";
   private static final String f_14362 = "Custom";
   private static final String f_14363 = "Custom";
   private static final String f_14364 = "Custom";
   private static final String f_14365 = "Custom";
   private static final String f_14366 = "Custom";
   private static final String f_14367 = "Custom";
   private static final String f_14368 = "Custom";

   @Override
   public void m_791(JsonObject var1) {
      if (var1 != null && var1.has(f_14181) && var1.get(f_14182).isJsonObject()) {
         var1 = var1.deepCopy();
         JsonObject var2 = var1.getAsJsonObject(f_14183);
         if (var2.has(this.f_14055.m_8764())
            && var2.get(this.f_14055.m_8764()).isJsonPrimitive()
            && f_14184.equals(var2.get(this.f_14055.m_8764()).getAsString())) {
            var2.addProperty(this.f_14055.m_8764(), f_14185);
         }

         String var3 = this.f_14055.m_8764() + "";
         if (var2.has(var3) && var2.get(var3).isJsonObject()) {
            JsonObject var4 = var2.getAsJsonObject(var3);
            if (var4.has(f_14186) && !var4.has(f_14187)) {
               var4.add(f_14188, var4.get(f_14189));
            }
         }
      }

      super.m_791(var1);
   }

   public ElytraBooster() {
      super(f_14081, f_14082, Category.MOVEMENT);
      this.f_14055 = new MultiChoiceSetting(
         f_14083,
         new Class_2ZaVm8TGDJ68TnJB(f_14084),
         new Class_2ZaVm8TGDJ68TnJB(f_14085),
         new Class_2ZaVm8TGDJ68TnJB(f_14086),
         new Class_2ZaVm8TGDJ68TnJB(f_14087)
      );
      this.f_14056 = new CheckboxSetting(f_14088, false);
      this.f_14057 = new StringSetting(f_14089, () -> this.f_14055.m_7568(f_14368));
      this.f_14058 = new SliderSetting(f_14090, f_14091, f_14092, f_14093).m_828(f_14094).m_822(() -> this.f_14055.m_7568(f_14367));
      this.f_14059 = new SliderSetting(f_14095, f_14096, f_14097, f_14098).m_828(f_14099).m_822(() -> this.f_14055.m_7568(f_14366));
      this.f_14060 = new SliderSetting(f_14100, f_14101, f_14102, f_14103).m_828(f_14104).m_822(() -> this.f_14055.m_7568(f_14365));
      this.f_14061 = new SliderSetting(f_14105, f_14106, f_14107, f_14108).m_828(f_14109).m_822(() -> this.f_14055.m_7568(f_14364));
      this.f_14062 = new SliderSetting(f_14110, f_14111, f_14112, f_14113).m_828(f_14114).m_822(() -> this.f_14055.m_7568(f_14363));
      this.f_14063 = new SliderSetting(f_14115, f_14116, f_14117, f_14118).m_828(f_14119).m_822(() -> this.f_14055.m_7568(f_14362));
      this.f_14064 = new SliderSetting(f_14120, f_14121, f_14122, f_14123).m_828(f_14124).m_822(() -> this.f_14055.m_7568(f_14361));
      this.f_14065 = new SliderSetting(f_14125, f_14126, f_14127, f_14128).m_828(f_14129).m_822(() -> this.f_14055.m_7568(f_14360));
      this.f_14066 = new SliderSetting(f_14130, f_14131, f_14132, f_14133).m_828(f_14134).m_822(() -> this.f_14055.m_7568(f_14359));
      this.f_14067 = new StringSetting(f_14135, () -> this.f_14055.m_7568(f_14358));
      this.f_14068 = new SliderSetting(f_14136, f_14137, f_14138, f_14139).m_828(f_14140).m_822(() -> this.f_14055.m_7568(f_14357));
      this.f_14069 = new SliderSetting(f_14141, f_14142, f_14143, f_14144).m_828(f_14145).m_822(() -> this.f_14055.m_7568(f_14356));
      this.f_14070 = new SliderSetting(f_14146, f_14147, f_14148, f_14149).m_828(f_14150).m_822(() -> this.f_14055.m_7568(f_14355));
      this.f_14071 = new SliderSetting(f_14151, f_14152, f_14153, f_14154).m_828(f_14155).m_822(() -> this.f_14055.m_7568(f_14354));
      this.f_14072 = new SliderSetting(f_14156, f_14157, f_14158, f_14159).m_828(f_14160).m_822(() -> this.f_14055.m_7568(f_14353));
      this.f_14073 = new SliderSetting(f_14161, f_14162, f_14163, f_14164).m_828(f_14165).m_822(() -> this.f_14055.m_7568(f_14352));
      this.f_14074 = new SliderSetting(f_14166, f_14167, f_14168, f_14169).m_828(f_14170).m_822(() -> this.f_14055.m_7568(f_14351));
      this.f_14075 = new SliderSetting(f_14171, f_14172, f_14173, f_14174).m_828(f_14175).m_822(() -> this.f_14055.m_7568(f_14350));
      this.f_14076 = new SliderSetting(f_14176, f_14177, f_14178, f_14179).m_828(f_14180).m_822(() -> this.f_14055.m_7568(f_14349));
      this.f_14077 = new ElytraBooster.COQsHqPFOihHlKCz();
      this.f_14078 = new ElytraBooster.COQsHqPFOihHlKCz();
      this.f_14079 = this::m_5048;
      this.f_14080 = this::m_5053;
      this.m_795(
         this.f_14055,
         this.f_14057,
         this.f_14058,
         this.f_14059,
         this.f_14060,
         this.f_14061,
         this.f_14062,
         this.f_14063,
         this.f_14064,
         this.f_14065,
         this.f_14066,
         this.f_14067,
         this.f_14068,
         this.f_14069,
         this.f_14070,
         this.f_14071,
         this.f_14072,
         this.f_14073,
         this.f_14074,
         this.f_14075,
         this.f_14076,
         this.f_14056
      );
   }

   private float m_5038(String var1) {
      return Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var1, f_14203, 0.0F);
   }

   public float m_5040() {
      Class_XqyHOyiq0ROk9HLU var1 = new Class_XqyHOyiq0ROk9HLU(f_14341, f_14342, f_14343);
      this.m_5053(var1);
      return var1.m_5614();
   }

   public void m_5048(Class_bhRaN0YSSLQRYjPo var1) {
      if (this.f_14056.m_8768() && f_11537.player != null && f_11537.level != null) {
         int var2 = (int)this.m_5049(f_11537.player.getYRot());
         int var3 = (int)this.m_5049(f_11537.player.getXRot());
         this.f_14077.m_5025(var2);
         this.f_14078.m_5025(var3);
         float var4 = f_11537.getWindow().getScreenWidth() / 2.0F;
         float var5 = f_11537.getWindow().getScreenHeight() / 2.0F;
         Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588());
         this.m_5051(f_14190, this.f_14077, var4, var5 + f_14191);
         this.m_5051(f_14192, this.f_14078, var4, var5 + f_14193);
         Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588());
      }
   }

   private float m_5049(float var1) {
      float var2 = var1 % f_14344;
      if (var2 > f_14345) {
         var2 -= f_14346;
      } else if (var2 < f_14347) {
         var2 += f_14348;
      }

      return var2;
   }

   private void m_5051(String var1, ElytraBooster.COQsHqPFOihHlKCz var2, float var3, float var4) {
      String var5 = var2.m_5023();
      String var6 = var1 + var5;
      float var7 = var3 - Class_Ssh31B3ljfKeWsvS.m_4826(Class_y1y6QpONhWEUIdEB.m_9588(), var6, f_14194, f_14195) / 2.0F;
      int var8 = Class_BftdentXEtGbugJw.m_2310(235, 235, 235);
      int var9 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
      Class_U4Qsm43RVlUI3Pre.m_5186(Class_y1y6QpONhWEUIdEB.m_9588(), var1, var7, var4, 20, var8);
      float var10 = var7 + this.m_5038(var1);
      long var11 = System.nanoTime();

      for (int var13 = 0; var13 < var2.f_14045.size(); var13++) {
         ElytraBooster.kbOTP2GtGkLto1xV var14 = var2.f_14045.get(var13);
         float var15 = var10 + this.m_5038(var5.substring(0, var13));
         float var16 = var14.m_5027(var11);
         float var17 = 1.0F - (float)Math.pow(1.0F - var16, f_14196);
         if (var16 < 1.0F) {
            Class_U4Qsm43RVlUI3Pre.m_5186(
               Class_y1y6QpONhWEUIdEB.m_9588(), var14.f_14048, var15, var4 + var17 * f_14197, 20, Class_BftdentXEtGbugJw.m_2306(var8, 1.0F - var17)
            );
            float var18 = (float)Math.sin(var16 * f_14198);
            int var19 = Class_BftdentXEtGbugJw.m_2312(var8, var9, var18 * f_14199);
            Class_U4Qsm43RVlUI3Pre.m_5186(
               Class_y1y6QpONhWEUIdEB.m_9588(), var14.f_14049, var15, var4 - f_14200 + var17 * f_14201, 20, Class_BftdentXEtGbugJw.m_2306(var19, var17)
            );
         } else {
            Class_U4Qsm43RVlUI3Pre.m_5186(Class_y1y6QpONhWEUIdEB.m_9588(), var14.f_14049, var15, var4, 20, var8);
         }
      }

      float var20 = var10 + this.m_5038(var5);
      Class_U4Qsm43RVlUI3Pre.m_5186(Class_y1y6QpONhWEUIdEB.m_9588(), f_14202, var20, var4, 20, var8);
   }

   public void m_5053(Class_XqyHOyiq0ROk9HLU var1) {
      ElytraTarget var2 = DimasikClient.m_9057().m_9049().m_2801().m_3574();
      LivingEntity var3 = DimasikClient.m_9057().m_9049().m_2801().m_3576().m_1114();
      float var4 = Mth.wrapDegrees(f_11537.player.getYRot());
      float var5 = f_11537.player.getXRot();
      float var6 = this.m_5049(var4);
      float var7 = Math.abs(var6);
      float var8 = f_14204;
      float var9 = f_14205;
      if (var7 > f_14206) {
         var7 = f_14207 - var7;
      }

      float var10 = this.m_5049(var5);
      float var11 = Math.abs(var10);
      if (var11 > f_14208) {
         var11 = f_14209 - var11;
      }

      if (this.f_14055.m_7568(f_14210)) {
         if (var7 <= f_14211 && var11 <= f_14212) {
            var8 = f_14237;
         } else if (var7 <= f_14213 && var11 <= f_14214) {
            var8 = f_14236;
         } else if (var7 <= f_14215 && var11 <= f_14216) {
            var8 = f_14235;
         } else if (var7 <= f_14217 && var11 <= f_14218) {
            var8 = f_14234;
         } else if (var7 <= f_14219 && var11 <= f_14220) {
            var8 = f_14233;
         } else if (var7 <= f_14221 && var11 <= f_14222) {
            var8 = f_14232;
         } else if (var7 <= f_14223 && var11 <= f_14224) {
            var8 = f_14231;
         } else if (var7 <= f_14225 && var11 <= f_14226) {
            var8 = f_14230;
         } else if (var7 <= f_14227 || var11 <= f_14228) {
            var8 = f_14229;
         }

         if (var11 <= f_14238) {
            var9 = f_14239;
         } else if (var11 <= f_14240) {
            var9 = f_14241;
         } else if (var11 <= f_14242) {
            var9 = f_14243;
         } else if (var11 <= f_14244) {
            var9 = f_14245;
         } else if (var11 <= f_14246) {
            var9 = f_14247;
         } else if (var11 <= f_14248) {
            var9 = f_14249;
         } else if (var11 <= f_14250) {
            var9 = f_14251;
         } else if (var11 <= f_14252) {
            var9 = f_14253;
         } else if (var11 >= f_14254 && var11 <= f_14255) {
            var9 = f_14256;
         } else {
            var9 = f_14257;
         }

         if (var9 > var8) {
            var8 = var9;
         }
      }

      if (this.f_14055.m_7568(f_14258)) {
         if (var7 <= f_14259 && var11 <= f_14260) {
            var8 = f_14261;
         } else if (var7 <= f_14262 && var11 <= f_14263) {
            var8 = f_14264;
         } else {
            var8 = f_14265;
         }

         var9 = var11 <= f_14266 ? f_14267 : f_14268;
         var8 = Math.max(var8, var9);
      }

      if (this.f_14055.m_7568(f_14269)) {
         if (var7 <= f_14270 && var11 <= f_14271) {
            var8 = f_14296;
         } else if (var7 <= f_14272 && var11 <= f_14273) {
            var8 = f_14295;
         } else if (var7 <= f_14274 && var11 <= f_14275) {
            var8 = f_14294;
         } else if (var7 <= f_14276 && var11 <= f_14277) {
            var8 = f_14293;
         } else if (var7 <= f_14278 && var11 <= f_14279) {
            var8 = f_14292;
         } else if (var7 <= f_14280 && var11 <= f_14281) {
            var8 = f_14291;
         } else if (var7 <= f_14282 && var11 <= f_14283) {
            var8 = f_14290;
         } else if (var7 <= f_14284 && var11 <= f_14285) {
            var8 = f_14289;
         } else if (var7 <= f_14286 || var11 <= f_14287) {
            var8 = f_14288;
         }

         if (var11 <= f_14297) {
            var9 = f_14298;
         } else if (var11 <= f_14299) {
            var9 = f_14300;
         } else if (var11 <= f_14301) {
            var9 = f_14302;
         } else if (var11 <= f_14303) {
            var9 = f_14304;
         } else if (var11 <= f_14305) {
            var9 = f_14306;
         } else if (var11 <= f_14307) {
            var9 = f_14308;
         } else if (var11 <= f_14309) {
            var9 = f_14310;
         } else if (var11 <= f_14311) {
            var9 = f_14312;
         } else {
            var9 = f_14313;
         }
      }

      if (this.f_14055.m_7568(f_14314)) {
         if (var7 <= f_14315 && var11 <= f_14316) {
            var8 = this.f_14058.m_8768();
         } else if (var7 <= f_14317 && var11 <= f_14318) {
            var8 = this.f_14059.m_8768();
         } else if (var7 <= f_14319 && var11 <= f_14320) {
            var8 = this.f_14060.m_8768();
         } else if (var7 <= f_14321 && var11 <= f_14322) {
            var8 = this.f_14061.m_8768();
         } else if (var7 <= f_14323 && var11 <= f_14324) {
            var8 = this.f_14062.m_8768();
         } else if (var7 <= f_14325 && var11 <= f_14326) {
            var8 = this.f_14063.m_8768();
         } else if (var7 <= f_14327 && var11 <= f_14328) {
            var8 = this.f_14064.m_8768();
         } else if (var7 <= f_14329 && var11 <= f_14330) {
            var8 = this.f_14065.m_8768();
         } else if (var7 <= f_14331 || var11 <= f_14332) {
            var8 = this.f_14066.m_8768();
         }

         if (var11 <= f_14333) {
            var9 = this.f_14068.m_8768();
         } else if (var11 <= f_14334) {
            var9 = this.f_14069.m_8768();
         } else if (var11 <= f_14335) {
            var9 = this.f_14070.m_8768();
         } else if (var11 <= f_14336) {
            var9 = this.f_14071.m_8768();
         } else if (var11 <= f_14337) {
            var9 = this.f_14072.m_8768();
         } else if (var11 <= f_14338) {
            var9 = this.f_14073.m_8768();
         } else if (var11 <= f_14339) {
            var9 = this.f_14074.m_8768();
         } else if (var11 <= f_14340) {
            var9 = this.f_14075.m_8768();
         } else {
            var9 = this.f_14076.m_8768();
         }

         if (var9 > var8) {
            var8 = var9;
         }
      }

      var1.m_5609(var8);
      var1.m_5611(var9);
      var1.m_5612(var8);
   }

   private static final class COQsHqPFOihHlKCz {
      public final List<ElytraBooster.kbOTP2GtGkLto1xV> f_14045 = new ArrayList<>();
      public String f_14046 = "";
      public Integer f_14047;

      public boolean m_5021() {
         long var1 = System.nanoTime();

         for (ElytraBooster.kbOTP2GtGkLto1xV var4 : this.f_14045) {
            if (var4.m_5027(var1) < 1.0F) {
               return true;
            }
         }

         return false;
      }

      public void m_5022(String var1) {
         if (var1.length() != this.f_14045.size()) {
            this.f_14046 = var1;
            this.m_5024(var1);
         } else {
            long var2 = System.nanoTime();

            for (int var4 = 0; var4 < var1.length(); var4++) {
               this.f_14045.get(var4).m_5026(var1.charAt(var4), var2);
            }

            this.f_14046 = var1;
         }
      }

      public String m_5023() {
         return this.f_14046;
      }

      public COQsHqPFOihHlKCz() {
      }

      public void m_5024(String var1) {
         this.f_14045.clear();

         for (int var2 = 0; var2 < var1.length(); var2++) {
            this.f_14045.add(new ElytraBooster.kbOTP2GtGkLto1xV(var1.charAt(var2)));
         }
      }

      public void m_5025(int var1) {
         String var2 = Integer.toString(var1);
         if (this.f_14046.isEmpty()) {
            this.f_14046 = var2;
            this.m_5024(var2);
         } else {
            this.f_14047 = this.f_14046.equals(var2) ? null : var1;
            if (!this.m_5021() && this.f_14047 != null) {
               String var3 = Integer.toString(this.f_14047);
               this.f_14047 = null;
               this.m_5022(var3);
            }
         }
      }
   }

   private static final class kbOTP2GtGkLto1xV {
      public String f_14048;
      public String f_14049;
      public long f_14050;
      public static final float f_14051 = 1.9E8F;

      public void m_5026(char var1, long var2) {
         String var4 = Character.toString(var1);
         if (!this.f_14049.equals(var4)) {
            this.f_14048 = this.f_14049;
            this.f_14049 = var4;
            this.f_14050 = var2;
         }
      }

      public float m_5027(long var1) {
         if (this.f_14050 == 0L) {
            return 1.0F;
         }

         float var3 = (float)(var1 - this.f_14050) / f_14051;
         return Math.max(0.0F, Math.min(1.0F, var3));
      }

      public kbOTP2GtGkLto1xV(char var1) {
         this.f_14048 = Character.toString(var1);
         this.f_14049 = this.f_14048;
         this.f_14050 = 0L;
      }
   }
}
