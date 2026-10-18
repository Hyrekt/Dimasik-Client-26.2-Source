package dev.dimasik.client.module.misc;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_B6JOzHnwhU3pe4AO;
import dev.dimasik.client.system.Class_dJj2SGO1fl9bUExQ;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.resources.sounds.SimpleSoundInstance;
import net.minecraft.client.resources.sounds.SoundInstance.Attenuation;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;

public class CreamyKeys extends Module {
   private final MultiChoiceSetting f_15485;
   private final MultiChoiceSetting f_15486;
   private final CheckboxSetting f_15487;
   private final CheckboxSetting f_15488;
   private final SliderSetting f_15489;
   private final SliderSetting f_15490;
   private final Class_gEPk7yDw6CwIte87<Class_B6JOzHnwhU3pe4AO> f_15491;
   private static final String f_15492 = "Blue ABS";
   private static final String f_15493 = "Blue ABS 2";
   private static final String f_15494 = "Black ABS";
   private static final String f_15495 = "Black PBT";
   private static final String f_15496 = "Brown ABS";
   private static final String f_15497 = "Brown PBT";
   private static final String f_15498 = "Red ABS";
   private static final String f_15499 = "CreamyKeys";
   private static final String f_15500 = "Механические звуки нажатий клавиатуры и мыши";
   private static final String f_15501 = "Клавиатура";
   private static final String f_15502 = "Мышь";
   private static final String f_15503 = "Все клавиши";
   private static final String f_15504 = "Звуки мыши";
   private static final String f_15505 = "Громкость";
   private static final float f_15506 = 0.05F;
   private static final String f_15507 = "Усиление";
   private static final float f_15508 = 8.0F;
   private static final String f_15509 = "dimasik";
   private static final String f_15510 = "Blue ABS";
   private static final String f_15511 = "cherrymx_blue_abs";
   private static final String f_15512 = "Blue ABS 2";
   private static final String f_15513 = "cherrymx_blue_abs_2";
   private static final String f_15514 = "Black ABS";
   private static final String f_15515 = "cherrymx_black_abs";
   private static final String f_15516 = "Black PBT";
   private static final String f_15517 = "cherrymx_black_pbt";
   private static final String f_15518 = "Brown ABS";
   private static final String f_15519 = "cherrymx_brown_abs";
   private static final String f_15520 = "Brown PBT";
   private static final String f_15521 = "cherrymx_brown_pbt";
   private static final String f_15522 = "Red ABS";
   private static final String f_15523 = "cherrymx_red_abs";
   private static final String f_15524 = "cherrymx_black_pbt";

   private static Class_2ZaVm8TGDJ68TnJB[] m_5425() {
      return new Class_2ZaVm8TGDJ68TnJB[]{
         new Class_2ZaVm8TGDJ68TnJB(f_15492),
         new Class_2ZaVm8TGDJ68TnJB(f_15493),
         new Class_2ZaVm8TGDJ68TnJB(f_15494),
         new Class_2ZaVm8TGDJ68TnJB(f_15495),
         new Class_2ZaVm8TGDJ68TnJB(f_15496),
         new Class_2ZaVm8TGDJ68TnJB(f_15497),
         new Class_2ZaVm8TGDJ68TnJB(f_15498)
      };
   }

   private void m_5426(Class_B6JOzHnwhU3pe4AO var1) {
      if (var1.m_2116() == 1) {
         int var2 = var1.m_2117();
         if (var2 >= 0 && var2 <= 7) {
            if (this.f_15488.m_8768() && (var2 == 0 || var2 == 1)) {
               this.m_5429(m_5427(this.f_15486));
            }
         } else {
            if (this.f_15487.m_8768() && var2 != -1) {
               this.m_5429(m_5427(this.f_15485));
            }
         }
      }
   }

   private static String m_5427(MultiChoiceSetting var0) {
      if (var0.m_7568(f_15510)) {
         return f_15511;
      } else if (var0.m_7568(f_15512)) {
         return f_15513;
      } else if (var0.m_7568(f_15514)) {
         return f_15515;
      } else if (var0.m_7568(f_15516)) {
         return f_15517;
      } else if (var0.m_7568(f_15518)) {
         return f_15519;
      } else if (var0.m_7568(f_15520)) {
         return f_15521;
      } else {
         return var0.m_7568(f_15522) ? f_15523 : f_15524;
      }
   }

   public CreamyKeys() {
      super(f_15499, f_15500, Category.MISC);
      this.f_15485 = new MultiChoiceSetting(f_15501, 3, m_5425());
      this.f_15486 = new MultiChoiceSetting(f_15502, 1, m_5425());
      this.f_15487 = new CheckboxSetting(f_15503, true);
      this.f_15488 = new CheckboxSetting(f_15504, true);
      this.f_15489 = new SliderSetting(f_15505, 1.0F, 0.0F, 1.0F).m_828(f_15506);
      this.f_15490 = new SliderSetting(f_15507, 1.0F, 1.0F, f_15508).m_828(1.0F).m_815(Class_dJj2SGO1fl9bUExQ.INTEGER);
      this.f_15491 = this::m_5426;
      this.m_795(this.f_15485, this.f_15486, this.f_15487, this.f_15488, this.f_15489, this.f_15490);
   }

   public static boolean m_5428() {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
         CreamyKeys var0 = DimasikClient.m_9057().m_9049().m_2801().m_3534();
         return var0 != null && var0.m_776();
      } else {
         return false;
      }
   }

   private void m_5429(String var1) {
      if (f_11537.getSoundManager() != null && var1 != null) {
         int var2 = ThreadLocalRandom.current().nextInt(1, 41);
         String var3 = var2 < 10 ? var2 + "" : Integer.toString(var2);
         Identifier var4 = Identifier.fromNamespaceAndPath(f_15509, var1 + var3);
         float var5 = Math.max(0.0F, Math.min(1.0F, this.f_15489.m_8768()));
         int var6 = Math.max(1, Math.round(this.f_15490.m_8768()));

         for (int var7 = 0; var7 < var6; var7++) {
            SimpleSoundInstance var8 = new SimpleSoundInstance(
               var4, SoundSource.MASTER, var5, 1.0F, RandomSource.create(), false, 0, Attenuation.NONE, 0.0, 0.0, 0.0, true
            );
            f_11537.getSoundManager().play(var8);
         }
      }
   }
}
