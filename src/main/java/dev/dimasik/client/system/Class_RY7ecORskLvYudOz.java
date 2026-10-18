package dev.dimasik.client.system;

import lombok.Generated;
import net.fabricmc.loader.api.FabricLoader;

public class Class_RY7ecORskLvYudOz {
   private boolean f_12491 = false;
   private static final String f_12492 = "viafabricplus";
   private static final String f_12493 = "Found ViaFabricPlus!";

   @Generated
   public boolean m_4507() {
      return this.f_12491;
   }

   public Class_RY7ecORskLvYudOz() {
      if (FabricLoader.getInstance().getModContainer(f_12492).isPresent()) {
         System.out.println(f_12493);
         this.f_12491 = true;
      }

      Class_4wyTBiWbMYrYnHSz.m_1381();
   }
}
