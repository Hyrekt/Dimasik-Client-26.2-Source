package dev.dimasik.client.module.misc;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.ui.screen.Screen_8;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.resources.sounds.SimpleSoundInstance;
import net.minecraft.client.resources.sounds.SoundInstance;
import net.minecraft.client.resources.sounds.SoundInstance.Attenuation;
import net.minecraft.client.sounds.SoundManager;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;

public class ClientSounds extends Module {
   private final MultiChoiceSetting f_34950;
   private final CheckboxSetting f_34951;
   private final SliderSetting f_34952;
   private final CheckboxSetting f_34953;
   private final SliderSetting f_34954;
   private final RandomSource f_34955;
   private long f_34956;
   private final List<SoundInstance> f_34957;
   private static final SoundEvent f_34958 = SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(ClientSounds.f_34998, ClientSounds.f_34999));
   private static final SoundEvent f_34959 = SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(ClientSounds.f_35000, ClientSounds.f_35001));
   private static final SoundEvent f_34960 = SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(ClientSounds.f_35002, ClientSounds.f_35003));
   private static final SoundEvent f_34961 = SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(ClientSounds.f_35004, ClientSounds.f_35005));
   private static final SoundEvent f_34962 = SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(ClientSounds.f_35006, ClientSounds.f_35007));
   private static final SoundEvent f_34963 = SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(ClientSounds.f_35008, ClientSounds.f_35009));
   private static final SoundEvent f_34964 = SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(ClientSounds.f_35010, ClientSounds.f_35011));
   private static final SoundEvent f_34965 = SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(ClientSounds.f_35012, ClientSounds.f_35013));
   private static final SoundEvent f_34966 = SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(ClientSounds.f_35014, ClientSounds.f_35015));
   private static SoundInstance f_34967;
   private static final String f_34968 = "ClientSounds";
   private static final String f_34969 = "Звуки модулей, клавиатуры и ClickGui";
   private static final String f_34970 = "Мод звука";
   private static final String f_34971 = "Первый";
   private static final String f_34972 = "Второй";
   private static final String f_34973 = "Третий";
   private static final String f_34974 = "Четвёртый";
   private static final String f_34975 = "Звук клавиатуры";
   private static final String f_34976 = "Громкость клавиатуры";
   private static final float f_34977 = 0.35F;
   private static final float f_34978 = 0.05F;
   private static final String f_34979 = "Звуки для ClickGui";
   private static final String f_34980 = "Громкость ClickGui";
   private static final float f_34981 = 0.35F;
   private static final float f_34982 = 0.05F;
   private static final float f_34983 = 0.5F;
   private static final float f_34984 = 0.97F;
   private static final float f_34985 = 0.08F;
   private static final float f_34986 = 0.95F;
   private static final float f_34987 = 0.14F;
   private static final float f_34988 = 0.95F;
   private static final float f_34989 = 0.15F;
   private static final float f_34990 = 0.9F;
   private static final float f_34991 = 0.35F;
   private static final float f_34992 = 1.25F;
   private static final float f_34993 = 0.35F;
   private static final String f_34994 = "Второй";
   private static final String f_34995 = "Третий";
   private static final String f_34996 = "Четвёртый";
   private static final float f_34997 = 44.0F;
   private static final String f_34998 = "dimasik";
   private static final String f_34999 = "module_enable";
   private static final String f_35000 = "dimasik";
   private static final String f_35001 = "module_disable";
   private static final String f_35002 = "dimasik";
   private static final String f_35003 = "module_enable1";
   private static final String f_35004 = "dimasik";
   private static final String f_35005 = "module_disable1";
   private static final String f_35006 = "dimasik";
   private static final String f_35007 = "module_enable2";
   private static final String f_35008 = "dimasik";
   private static final String f_35009 = "module_disable2";
   private static final String f_35010 = "dimasik";
   private static final String f_35011 = "module_enable3";
   private static final String f_35012 = "dimasik";
   private static final String f_35013 = "module_disable3";
   private static final String f_35014 = "dimasik";
   private static final String f_35015 = "keyboard_typing";

   public ClientSounds() {
      super(f_34968, f_34969, Category.MISC);
      this.f_34950 = new MultiChoiceSetting(
         f_34970,
         new Class_2ZaVm8TGDJ68TnJB(f_34971),
         new Class_2ZaVm8TGDJ68TnJB(f_34972),
         new Class_2ZaVm8TGDJ68TnJB(f_34973),
         new Class_2ZaVm8TGDJ68TnJB(f_34974)
      );
      this.f_34951 = new CheckboxSetting(f_34975, true);
      this.f_34952 = new SliderSetting(f_34976, f_34977, 0.0F, 1.0F).m_828(f_34978).m_822(this.f_34951::m_8768);
      this.f_34953 = new CheckboxSetting(f_34979, false);
      this.f_34954 = new SliderSetting(f_34980, f_34981, 0.0F, 1.0F).m_828(f_34982).m_822(this.f_34953::m_8768);
      this.f_34955 = RandomSource.create();
      this.f_34957 = new ArrayList<>();
      this.m_795(this.f_34950, this.f_34951, this.f_34952, this.f_34953, this.f_34954);
   }

   public static void m_9460(boolean var0) {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
         ClientSounds var1 = DimasikClient.m_9057().m_9049().m_2801().m_3441();
         if (var1 != null && var1.m_776() && f_11537.getSoundManager() != null) {
            if (f_34967 != null) {
               f_11537.getSoundManager().stop(f_34967);
            }

            SoundEvent var2;
            if (var1.f_34950.m_7568(f_34994)) {
               var2 = var0 ? f_34960 : f_34961;
            } else if (var1.f_34950.m_7568(f_34995)) {
               var2 = var0 ? f_34962 : f_34963;
            } else if (var1.f_34950.m_7568(f_34996)) {
               var2 = var0 ? f_34964 : f_34965;
            } else {
               var2 = var0 ? f_34958 : f_34959;
            }

            f_34967 = new SimpleSoundInstance(
               var2.location(), SoundSource.MASTER, f_34997, 1.0F, RandomSource.create(), false, 0, Attenuation.NONE, 0.0, 0.0, 0.0, true
            );
            f_11537.getSoundManager().play(f_34967);
         }
      }
   }

   public static void m_9461() {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
         ClientSounds var0 = DimasikClient.m_9057().m_9049().m_2801().m_3441();
         if (var0 != null && var0.m_776() && var0.f_34951.m_8768() && !CreamyKeys.m_5428() && f_11537.getSoundManager() != null) {
            SimpleSoundInstance var1 = new SimpleSoundInstance(
               f_34966.location(), SoundSource.MASTER, var0.f_34952.m_8768(), 1.0F, RandomSource.create(), false, 0, Attenuation.NONE, 0.0, 0.0, 0.0, true
            );
            f_11537.getSoundManager().play(var1);
         }
      }
   }

   public static void m_9462(ClientSounds.KG2FYhAQHwVAXDJG var0, float var1) {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
         ClientSounds var2 = DimasikClient.m_9057().m_9049().m_2801().m_3441();
         if (var2 != null
            && var2.m_776()
            && var2.f_34953.m_8768()
            && !(var2.f_34954.m_8768() <= 0.0F)
            && (f_11537.gui.screen() instanceof Screen_8 || var0 == ClientSounds.KG2FYhAQHwVAXDJG.OPEN)) {
            long var3 = System.nanoTime();
            if (var0.f_34949 > 0L) {
               if (var3 - var2.f_34956 < var0.f_34949) {
                  return;
               }

               var2.f_34956 = var3;
            }

            float var5 = Math.clamp(var1, 0.0F, 1.0F);

            float var6 = switch (var0) {
               case TAB -> f_34984 + f_34985 * var5;
               case THEME -> f_34986 + f_34987 * var5;
               default -> 1.0F;
               case MODE -> f_34988 + f_34989 * var5;
               case SLIDER, COLOR -> f_34990 + f_34991 * var5;
               case SLIDER_RELEASE -> f_34992;
            };
            SoundManager var7 = f_11537.getSoundManager();
            var2.f_34957.removeIf(var1x -> !var7.isActive(var1x));
            SimpleSoundInstance var8 = new SimpleSoundInstance(
               var0.f_34947,
               SoundSource.MASTER,
               var0.f_34948 * var2.f_34954.m_8768() / f_34993,
               var6,
               var2.f_34955,
               false,
               0,
               Attenuation.NONE,
               0.0,
               0.0,
               0.0,
               true
            );
            var7.play(var8);
            var2.f_34957.add(var8);
         }
      }
   }

   @Override
   public void m_732() {
      this.f_34957.forEach(f_11537.getSoundManager()::stop);
      this.f_34957.clear();
      this.f_34956 = 0L;
   }

   public static void m_9463(ClientSounds.KG2FYhAQHwVAXDJG var0) {
      m_9462(var0, f_34983);
   }

   public enum KG2FYhAQHwVAXDJG {
      OPEN("gui_open", 0.45F),
      CLOSE("gui_close", 0.45F),
      EDITOR("gui_anime", 0.4F),
      TAB("gui_category", 0.45F),
      THEME("gui_theme", 0.45F),
      SETTINGS_OPEN("gui_module_open", 0.45F),
      SETTINGS_CLOSE("gui_module_close", 0.45F),
      CHECKBOX_ON("gui_boolean_enable", 0.4F),
      CHECKBOX_OFF("gui_boolean_disable", 0.4F),
      MULTI_ON("gui_boolean2_enable", 0.4F),
      MULTI_OFF("gui_boolean2_disable", 0.4F),
      MODE("gui_mode_multi", 0.45F),
      BUTTON("gui_open_button", 0.4F),
      SLIDER_GRAB("gui_click", 0.35F),
      SLIDER("gui_slider", 0.35F, 22),
      SLIDER_RELEASE("gui_slider", 0.3F),
      COLOR("gui_slider", 0.3F, 28),
      PICKER_OPEN("gui_multi_open", 0.4F),
      PICKER_CLOSE("gui_multi_close", 0.4F),
      BIND_START("gui_binding", 0.45F),
      BIND_SET("gui_bind", 0.4F),
      BIND_RESET("gui_clear", 0.4F),
      SCROLL("gui_scroll", 0.35F, 55);

      public final Identifier f_34947;
      public final float f_34948;
      public final long f_34949;

      KG2FYhAQHwVAXDJG(String var3, float var4) {
         this(var3, var4, 0);
      }

      KG2FYhAQHwVAXDJG(String var3, float var4, int var5) {
         this.f_34947 = Identifier.fromNamespaceAndPath("dimasik", "clickgui." + var3);
         this.f_34948 = var4;
         this.f_34949 = var5 * 1000000L;
      }
   }
}
