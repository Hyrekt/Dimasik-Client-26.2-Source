package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_B6vpBUNmRtH3JzmV;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult.Type;

public class AutoTool extends Module {
   private final MultiChoiceSetting f_8084;
   private int f_8085;
   private int f_8086;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_8087;
   private static final String f_8088 = "AutoTool";
   private static final String f_8089 = "Автоматически берет в руку лучший инструмент для ломания блока";
   private static final String f_8090 = "Режим";
   private static final String f_8091 = "Обычный";
   private static final String f_8092 = "Скрытый";
   private static final String f_8093 = "Обычный";

   public void m_2884(Class_Xu9btcIeUN33XnMK var1) {
      if (this.m_2886()) {
         if (this.f_8084.m_7568(f_8093)) {
            this.m_2885();
         }
      }
   }

   public AutoTool() {
      super(f_8088, f_8089, Category.MISC);
      this.f_8084 = new MultiChoiceSetting(f_8090, new Class_2ZaVm8TGDJ68TnJB(f_8091), new Class_2ZaVm8TGDJ68TnJB(f_8092));
      this.f_8085 = -1;
      this.f_8086 = -1;
      this.f_8087 = this::m_2884;
      this.m_795(this.f_8084);
   }

   private void m_2885() {
      f_11537.player.getInventory().setSelectedSlot(this.f_8085);
      this.f_8085 = -1;
   }

   private boolean m_2886() {
      if (f_11537.options.keyAttack.isDown()) {
         if (f_11537.hitResult instanceof BlockHitResult var1 && var1.getType().equals(Type.BLOCK)) {
            this.f_8085 = Class_B6vpBUNmRtH3JzmV.m_2134(f_11537.level.getBlockState(var1.getBlockPos()));
            if (this.f_8086 == -1) {
               this.f_8086 = f_11537.player.getInventory().selected;
            }
         }
      } else if (this.f_8086 != -1) {
         this.f_8085 = this.f_8086;
         this.f_8086 = -1;
      }

      return this.f_8085 >= 0;
   }
}
