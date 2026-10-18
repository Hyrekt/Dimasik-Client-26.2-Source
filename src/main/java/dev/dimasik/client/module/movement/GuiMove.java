package dev.dimasik.client.module.movement;

import com.mojang.blaze3d.platform.InputConstants;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.ui.screen.Screen_7;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import lombok.Generated;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.client.gui.screens.inventory.SignEditScreen;

public class GuiMove extends Module {
   private final MultiChoiceSetting f_14588;
   private final MultiChoiceSetting f_14589;
   private final SliderSetting f_14590;
   private boolean f_14591;
   private final Set<Object> f_14592;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_14593;
   private static final String f_14594 = "GuiMove";
   private static final String f_14595 = "Свободное перемещение в гуишках";
   private static final String f_14596 = "Обход";
   private static final String f_14597 = "Никакой";
   private static final String f_14598 = "Grim";
   private static final String f_14599 = "Режим свапов";
   private static final String f_14600 = "Рейджовый";
   private static final String f_14601 = "Легитный";
   private static final String f_14602 = "Тики остановки";
   private static final float f_14603 = 4.0F;
   private static final float f_14604 = 20.0F;
   private static final String f_14605 = "Легитный";

   public boolean m_5148() {
      return this.f_14591 || !this.f_14592.isEmpty();
   }

   @Generated
   public Set<Object> m_5149() {
      return this.f_14592;
   }

   public void m_5150(Class_Xu9btcIeUN33XnMK var1) {
      KeyMapping[] var2 = new KeyMapping[]{
         f_11537.options.keyUp, f_11537.options.keyDown, f_11537.options.keyLeft, f_11537.options.keyRight, f_11537.options.keyJump
      };
      if (f_11537.gui.screen() instanceof Screen_7) {
         for (KeyMapping var11 : var2) {
            var11.setDown(false);
         }
      } else if (!this.m_5148() && !(f_11537.gui.screen() instanceof ChatScreen) && !(f_11537.gui.screen() instanceof SignEditScreen)) {
         for (KeyMapping var6 : var2) {
            boolean var7 = InputConstants.isKeyDown(f_11537.getWindow(), var6.key.getValue());
            var6.setDown(var7);
         }
      }
   }

   @Generated
   public MultiChoiceSetting m_5152() {
      return this.f_14589;
   }

   @Generated
   public SliderSetting m_5153() {
      return this.f_14590;
   }

   public GuiMove() {
      super(f_14594, f_14595, Category.MOVEMENT);
      this.f_14588 = new MultiChoiceSetting(f_14596, new Class_2ZaVm8TGDJ68TnJB(f_14597), new Class_2ZaVm8TGDJ68TnJB(f_14598));
      this.f_14589 = new MultiChoiceSetting(f_14599, new Class_2ZaVm8TGDJ68TnJB(f_14600), new Class_2ZaVm8TGDJ68TnJB(f_14601));
      this.f_14590 = new SliderSetting(f_14602, f_14603, 0.0F, f_14604).m_828(1.0F).m_822(() -> this.f_14589.m_7568(f_14605));
      this.f_14591 = false;
      this.f_14592 = Collections.newSetFromMap(new IdentityHashMap<>());
      this.f_14593 = this::m_5150;
      this.m_795(this.f_14588, this.f_14589, this.f_14590);
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> m_5154() {
      return this.f_14593;
   }

   public void m_5155(Object var1) {
      if (var1 != null) {
         this.f_14592.remove(var1);
      }
   }

   public void m_5156(Object var1) {
      if (var1 != null) {
         this.f_14592.add(var1);
      }
   }

   @Generated
   public MultiChoiceSetting m_5157() {
      return this.f_14588;
   }

   @Generated
   public void m_5158(boolean var1) {
      this.f_14591 = var1;
   }
}
