package dev.dimasik.client.module;

import com.google.gson.JsonObject;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.ClientSounds;
import dev.dimasik.client.setting.Setting;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ColorSetting;
import dev.dimasik.client.setting.impl.IntegerSetting;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.setting.impl.ModeSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.PositionSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.setting.impl.StringSetting;
import dev.dimasik.client.system.Class_0p152hWffX3ippAf;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_8UIDpbIRPAjhei7m;
import dev.dimasik.client.system.Class_HKVFPtZz5yGHYty6;
import dev.dimasik.client.system.Class_MP0Q3Izlf2HSndyS;
import dev.dimasik.client.system.Class_NzJrN63M7QBpmAbi;
import dev.dimasik.client.system.Class_w8fCJQ5ZtH5lQbWc;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import lombok.Generated;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import org.joml.Vector2f;

public class Module implements Class_NzJrN63M7QBpmAbi {
   private final ArrayList<Setting<?>> f_407 = new ArrayList<>();
   private final Consumer<Throwable> f_408 = Throwable::printStackTrace;
   private final KeyBind f_409 = new KeyBind(KeybindMode.TOGGLE, -1);
   private final Class_w8fCJQ5ZtH5lQbWc f_410;
   private final String f_411;
   private final String f_412;
   private final Category f_413;
   public boolean f_414;
   private boolean f_415;
   private static final float f_416 = 15.0F;
   private static final String f_417 = "Модуль ";
   private static final String f_418 = " включён";
   private static final String f_419 = "H";
   private static final String f_420 = "Модуль ";
   private static final String f_421 = " выключен";
   private static final String f_422 = "I";
   private static final String f_423 = "State";
   private static final String f_424 = "Favorite";
   private static final String f_425 = "Key";
   private static final String f_426 = "Type";
   private static final String f_427 = ":";
   private static final String f_428 = "Settings";
   private static final String f_429 = "State";
   private static final String f_430 = "State";
   private static final String f_431 = "Favorite";
   private static final String f_432 = "Favorite";
   private static final String f_433 = "Key";
   private static final String f_434 = "Key";
   private static final String f_435 = "Type";
   private static final String f_436 = "Type";
   private static final String f_437 = "Settings";
   private static final String f_438 = "Settings";
   private static final String f_439 = ":";
   private static final String f_440 = ":";

   @Generated
   public boolean m_776() {
      return this.f_414;
   }

   public void m_777() {
      this.f_414 = false;

      try {
         this.m_732();
      } catch (Throwable var2) {
         this.f_408.accept(var2);
      }

      DimasikClient.m_9057().m_9051().m_9715(this);
      if (!Class_HKVFPtZz5yGHYty6.m_2883() && f_11537.level != null && f_11537.player != null) {
         MutableComponent var1 = Component.empty()
            .append(Component.literal(Class_0p152hWffX3ippAf.m_801(f_420)))
            .append(Component.literal(this.f_411))
            .append(Component.literal(Class_0p152hWffX3ippAf.m_801(f_421)));
         Class_8UIDpbIRPAjhei7m.m_1784(f_422, var1, -1, Class_MP0Q3Izlf2HSndyS.MODULES);
         ClientSounds.m_9460(false);
      }
   }

   public void m_778() {
   }

   @Generated
   public KeyBind m_779() {
      return this.f_409;
   }

   @Generated
   public ArrayList<Setting<?>> m_780() {
      return this.f_407;
   }

   public void m_781() {
      this.f_415 = !this.f_415;
   }

   public JsonObject m_782() {
      JsonObject var1 = new JsonObject();
      JsonObject var2 = new JsonObject();
      var1.addProperty(f_423, this.f_414);
      var1.addProperty(f_424, this.f_415);
      var1.addProperty(f_425, this.f_409.m_1369());
      var1.addProperty(f_426, this.f_409.m_1371().m_5840());

      for (Setting var4 : this.f_407) {
         if (var4 instanceof CheckboxSetting var5) {
            var2.addProperty(var5.m_8764(), var5.m_8768());
            var2.addProperty(var5.m_8764() + "", var5.m_5183().m_1369());
         } else if (var4 instanceof ColorSetting var6) {
            var2.addProperty(var6.m_8764(), var6.m_8768());
         } else if (var4 instanceof SliderSetting var7) {
            var2.addProperty(var7.m_8764(), Math.clamp(var7.m_8768(), var7.m_824(), var7.m_813()));
         } else if (var4 instanceof ModeSetting var8) {
            var2.addProperty(var8.m_8764(), var8.m_8768());
         } else if (var4 instanceof IntegerSetting var9) {
            var2.addProperty(var9.m_8764(), var9.m_8768());
         } else if (var4 instanceof PositionSetting var10) {
            var2.addProperty(var10.m_8764(), "" + var10.m_8768().x + var10.m_8768().y);
         } else if (var4 instanceof MultiChoiceSetting var11) {
            JsonObject var17 = new JsonObject();
            var2.addProperty(var11.m_8764(), var11.m_7564().m_1181());

            for (Class_2ZaVm8TGDJ68TnJB var19 : var11.m_8768()) {
               var17.addProperty(var19.m_1181(), var19.m_1189().m_1369());
            }

            var2.add(var11.m_8764() + "", var17);
         } else if (var4 instanceof ItemListSetting var12) {
            JsonObject var13 = new JsonObject();
            StringBuilder var14 = new StringBuilder();

            for (Class_2ZaVm8TGDJ68TnJB var16 : var12.m_8768()) {
               var13.addProperty(var16.m_1181(), var16.m_1189().m_1369());
               if (var16.m_1187()) {
                  var14.append(var16.m_1181());
                  if (var16 != var12.m_8768().getLast()) {
                     var14.append(f_427);
                  }
               }
            }

            var2.addProperty(var12.m_8764(), var14.toString());
            var2.add(var12.m_8764() + "", var13);
         }
      }

      var1.add(f_428, var2);
      return var1;
   }

   @Generated
   public Class_w8fCJQ5ZtH5lQbWc m_783() {
      return this.f_410;
   }

   public List<Setting<?>> m_784() {
      return this.f_407;
   }

   @Generated
   public Category m_785() {
      return this.f_413;
   }

   @Generated
   public boolean m_786() {
      return this.f_415;
   }

   public void m_732() {
   }

   public void m_787(boolean var1) {
      this.f_415 = var1;
   }

   @Generated
   public Consumer<Throwable> m_788() {
      return this.f_408;
   }

   public void m_789() {
      if (this.f_414) {
         this.m_777();
      } else {
         this.m_792();
      }
   }

   @Generated
   public void m_790(boolean var1) {
      this.f_414 = var1;
   }

   public void m_791(JsonObject var1) {
      if (var1 != null) {
         if (var1.has(f_429) && this.f_414 != var1.get(f_430).getAsBoolean()) {
            this.m_789();
         }

         if (var1.has(f_431)) {
            this.f_415 = var1.get(f_432).getAsBoolean();
         }

         if (var1.has(f_433)) {
            this.f_409.m_1367(var1.get(f_434).getAsInt());
         } else {
            this.f_409.m_1367(-1);
         }

         if (var1.has(f_435)) {
            this.f_409.m_1370(KeybindMode.m_5839(var1.get(f_436).getAsString()));
         }

         if (var1.has(f_437)) {
            JsonObject var2 = var1.getAsJsonObject(f_438);

            for (Setting var4 : this.f_407) {
               if (!(var4 instanceof StringSetting) && var2.has(var4.m_8764())) {
                  try {
                     switch (var4) {
                        case CheckboxSetting var7:
                           var7.m_823(var2.get(var4.m_8764()).getAsBoolean());
                           var7.m_5183().m_1367(-1);
                           if (var2.has(var7.m_8764() + "")) {
                              var7.m_5183().m_1367(var2.get(var7.m_8764() + "").getAsInt());
                           }
                           break;
                        case ColorSetting var8:
                           var8.m_823(var2.get(var4.m_8764()).getAsInt());
                           break;
                        case SliderSetting var9:
                           var9.m_829(var2.get(var9.m_8764()).getAsFloat());
                           break;
                        case ModeSetting var10:
                           var10.m_823(var2.get(var4.m_8764()).getAsString());
                           break;
                        case IntegerSetting var11:
                           var11.m_823(var2.get(var4.m_8764()).getAsInt());
                           break;
                        case PositionSetting var12:
                           String[] var23 = var2.get(var4.m_8764()).getAsString().split(f_439);
                           Vector2f var25 = new Vector2f(Float.parseFloat(var23[0]), Float.parseFloat(var23[1]));
                           var12.m_823(var25);
                           break;
                        case MultiChoiceSetting var13:
                           String var24 = var2.get(var4.m_8764()).getAsString();

                           for (Class_2ZaVm8TGDJ68TnJB var29 : var13.m_8768()) {
                              var29.m_1189().m_1367(-1);
                           }

                           var13.m_1766(var24);
                           if (var2.has(var13.m_8764() + "")) {
                              JsonObject var27 = var2.getAsJsonObject(var13.m_8764() + "");

                              for (Class_2ZaVm8TGDJ68TnJB var32 : var13.m_8768()) {
                                 if (var27.has(var32.m_1181())) {
                                    var32.m_1189().m_1367(var27.get(var32.m_1181()).getAsInt());
                                 }
                              }
                           }
                           break;
                        case ItemListSetting var14:
                           String[] var15 = var2.get(var4.m_8764()).getAsString().split(f_440);

                           for (Class_2ZaVm8TGDJ68TnJB var17 : var14.m_8768()) {
                              var17.m_1183(false);
                              var17.m_1189().m_1367(-1);

                              for (String var21 : var15) {
                                 if (var17.m_1181().equals(var21)) {
                                    var17.m_1183(true);
                                 }
                              }
                           }

                           if (var2.has(var14.m_8764() + "")) {
                              JsonObject var28 = var2.getAsJsonObject(var14.m_8764() + "");

                              for (Class_2ZaVm8TGDJ68TnJB var33 : var14.m_8768()) {
                                 if (var28.has(var33.m_1181())) {
                                    var33.m_1189().m_1367(var28.get(var33.m_1181()).getAsInt());
                                 }
                              }
                           }
                           continue;
                        default:
                     }
                  } catch (Exception var22) {
                     System.out.println(var22.getMessage());
                  }
               }
            }
         }
      }
   }

   public void m_792() {
      this.f_414 = true;

      try {
         this.m_778();
      } catch (Throwable var2) {
         this.f_408.accept(var2);
      }

      DimasikClient.m_9057().m_9051().m_9713(this);
      if (!Class_HKVFPtZz5yGHYty6.m_2883() && f_11537.level != null && f_11537.player != null) {
         MutableComponent var1 = Component.empty()
            .append(Component.literal(Class_0p152hWffX3ippAf.m_801(f_417)))
            .append(Component.literal(this.f_411))
            .append(Component.literal(Class_0p152hWffX3ippAf.m_801(f_418)));
         Class_8UIDpbIRPAjhei7m.m_1784(f_419, var1, -1, Class_MP0Q3Izlf2HSndyS.MODULES);
         ClientSounds.m_9460(true);
      }
   }

   @Generated
   public String m_793() {
      return this.f_411;
   }

   public Module(String var1, String var2, Category var3) {
      this.f_410 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_416);
      this.f_414 = false;
      this.f_415 = false;
      this.f_411 = var1;
      this.f_412 = var2;
      this.f_413 = var3;
   }

   @Generated
   public String m_794() {
      return this.f_412;
   }

   public void m_795(Setting<?>... var1) {
      this.f_407.addAll(List.of(var1));
   }
}
