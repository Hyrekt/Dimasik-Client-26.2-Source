package dev.dimasik.client.system;

import net.fabricmc.fabric.impl.tag.convention.v2.TagRegistration;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class Class_M7uQljRJ3WKrXqme {
   @Class_FUILRKIQ6wtWry59("getVanillaTag")
   public TagKey<Item> m_3881(String var1) {
      return TagKey.create(Registries.ITEM, Identifier.withDefaultNamespace(var1));
   }

   @Class_FUILRKIQ6wtWry59("getFabricTag")
   public TagKey<Item> m_3882(String var1) {
      return TagRegistration.ITEM_TAG.registerC(var1);
   }
}
