package dev.dimasik.client.module.combat;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;

public class NoFriendDamage extends Module {
   private static final String f_31474 = "NoFriendDamage";
   private static final String f_31475 = "Отменяет урон по друзьям";

   public NoFriendDamage() {
      super(f_31474, f_31475, Category.COMBAT);
   }
}
