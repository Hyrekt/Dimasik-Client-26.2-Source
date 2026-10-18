package dev.dimasik.client.module.render;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.system.Class_15puspGa4UwNUgkr;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.world.entity.LivingEntity;

public class SeeInvisible extends Module {
   private final MultiChoiceSetting f_15457;
   private final Class_gEPk7yDw6CwIte87<Class_15puspGa4UwNUgkr> f_15458;
   private static final String f_15459 = "SeeInvisible";
   private static final String f_15460 = "Показывает невидимых сущностей";
   private static final String f_15461 = "Режим";
   private static final String f_15462 = "Прозрачный";
   private static final String f_15463 = "Непрозрачный";
   private static final String f_15464 = "Непрозрачный";

   public SeeInvisible() {
      super(f_15459, f_15460, Category.RENDER);
      this.f_15457 = new MultiChoiceSetting(f_15461, new Class_2ZaVm8TGDJ68TnJB(f_15462), new Class_2ZaVm8TGDJ68TnJB(f_15463));
      this.f_15458 = this::m_5401;
      this.m_795(this.f_15457);
   }

   private void m_5401(Class_15puspGa4UwNUgkr var1) {
      if (this.m_776() && f_11537.player != null && f_11537.level != null) {
         if (var1.m_838() instanceof LivingEntity var3 && var3 != f_11537.player && var3.isInvisible()) {
            if (var1.m_837() instanceof LivingEntityRenderState var4) {
               if (this.f_15457.m_7568(f_15464)) {
                  var4.isInvisible = false;
                  var4.isInvisibleToPlayer = false;
               } else {
                  var4.isInvisible = true;
                  var4.isInvisibleToPlayer = false;
               }
            }
         }
      }
   }
}
