package dev.dimasik.client.system;

import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import net.minecraft.client.player.AbstractClientPlayer;
import org.luaj.vm2.LuaError;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.Varargs;
import org.luaj.vm2.lib.ThreeArgFunction;
import org.luaj.vm2.lib.TwoArgFunction;
import org.luaj.vm2.lib.VarArgFunction;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;

public final class Class_6FM5pzADQHSIN2va extends LuaUserdata {
   private final LuaValue f_2715;
   private final LuaTable f_2716 = new LuaTable();
   private final Map<LuaValue, LuaValue> f_2717 = new HashMap<>();
   private static final String f_2718 = "get";
   private static final String f_2719 = "get";
   private static final String f_2720 = "sin";
   private static final String f_2721 = "cos";
   private static final String f_2722 = "floor";
   private static final String f_2723 = "abs";
   private static final String f_2724 = "ceil";
   private static final String f_2725 = "round";
   private static final String f_2726 = "pow";
   private static final String f_2727 = "clamp";
   private static final String f_2728 = "lerp";
   private static final String f_2729 = "easeInOutBack";
   private static final String f_2730 = "easeInSine";
   private static final String f_2731 = "easeOutSine";
   private static final String f_2732 = "easeInOutSine";
   private static final String f_2733 = "easeInQuad";
   private static final String f_2734 = "easeOutQuad";
   private static final String f_2735 = "easeInOutQuad";
   private static final String f_2736 = "easeInCubic";
   private static final String f_2737 = "easeOutCubic";
   private static final String f_2738 = "easeInOutCubic";
   private static final String f_2739 = "easeInQuart";
   private static final String f_2740 = "easeOutQuart";
   private static final String f_2741 = "easeInOutQuart";
   private static final String f_2742 = "easeInQuint";
   private static final String f_2743 = "easeOutQuint";
   private static final String f_2744 = "easeInOutQuint";
   private static final String f_2745 = "easeInExpo";
   private static final String f_2746 = "easeOutExpo";
   private static final String f_2747 = "easeInOutExpo";
   private static final String f_2748 = "easeInCirc";
   private static final String f_2749 = "easeOutCirc";
   private static final String f_2750 = "easeInOutCirc";
   private static final String f_2751 = "easeInBack";
   private static final String f_2752 = "easeOutBack";
   private static final String f_2753 = "easeInElastic";
   private static final String f_2754 = "easeOutElastic";
   private static final String f_2755 = "easeInOutElastic";
   private static final String f_2756 = "easeOutBounce";
   private static final String f_2757 = "easeInBounce";
   private static final String f_2758 = "easeInOutBounce";
   private static final String f_2759 = "cubicEase";
   private static final String f_2760 = "getHealth";
   private static final String f_2761 = "isSneaking";
   private static final String f_2762 = "isOnGround";
   private static final String f_2763 = "isSwimming";
   private static final String f_2764 = "isClimbing";
   private static final String f_2765 = "isCrawling";
   private static final String f_2766 = "isSubmergedInWater";
   private static final String f_2767 = "isTouchingWater";
   private static final String f_2768 = "isUsingSpyglass";
   private static final String f_2769 = "isUsingRiptide";
   private static final String f_2770 = "getX";
   private static final String f_2771 = "getY";
   private static final String f_2772 = "getZ";
   private static final String f_2773 = "getXSpeed";
   private static final String f_2774 = "getYSpeed";
   private static final String f_2775 = "getZSpeed";
   private static final String f_2776 = "getSpeed";
   private static final String f_2777 = "isUsingItem";
   private static final String f_2778 = "getYaw";
   private static final String f_2779 = "getPitch";
   private static final String f_2780 = "getMainItem";
   private static final String f_2781 = "getOffhandItem";
   private static final String f_2782 = "getActiveHand";
   private static final String f_2783 = "getAge";
   private static final String f_2784 = "getSwingCount";

   public static LuaValue m_1533(Object var0) {
      return new Class_6FM5pzADQHSIN2va(var0);
   }

   private void ternary(String var1, final Class_6FM5pzADQHSIN2va.BzV9fQ8c16CNxVus var2) {
      final LuaValue var3 = this.f_2715.get(var1);
      this.f_2716
         .set(
            var1,
            new VarArgFunction() {
               public Varargs invoke(Varargs var1) {
                  if (var1.arg1().touserdata() == Class_6FM5pzADQHSIN2va.this.m_instance
                     && var1.narg() == 4
                     && var1.arg(2).isnumber()
                     && var1.arg(3).isnumber()
                     && var1.arg(4).isnumber()) {
                     try {
                        return valueOf(var2.m_1532(var1.arg(2).todouble(), var1.arg(3).todouble(), var1.arg(4).todouble()));
                     } catch (RuntimeException var3x) {
                        throw new LuaError(var3x);
                     }
                  } else {
                     return var3.invoke(var1);
                  }
               }
            }
         );
   }

   public void set(LuaValue var1, LuaValue var2) {
      this.f_2715.set(var1, var2);
      this.f_2717.remove(var1);
   }

   public LuaValue get(LuaValue var1) {
      LuaValue var2 = this.f_2716.rawget(var1);
      if (!var2.isnil()) {
         return var2;
      }

      var2 = this.f_2717.get(var1);
      if (var2 != null) {
         return var2;
      }

      LuaValue var3 = this.f_2715.get(var1);
      if (var3.isfunction()) {
         if (this.f_2717.size() >= 256) {
            this.f_2717.clear();
         }

         this.f_2717.put(var1, var3);
      }

      return var3;
   }

   private void player(String var1, final Function<AbstractClientPlayer, Object> var2) {
      final LuaValue var3 = this.f_2715.get(var1);
      this.f_2716.set(var1, new TwoArgFunction() {
         public LuaValue call(LuaValue var1, LuaValue var2x) {
            if (var1.touserdata() == Class_6FM5pzADQHSIN2va.this.m_instance && var2x.isuserdata(AbstractClientPlayer.class)) {
               try {
                  return CoerceJavaToLua.coerce(var2.apply((AbstractClientPlayer)var2x.touserdata()));
               } catch (RuntimeException var4) {
                  throw new LuaError(var4);
               }
            } else {
               return var3.call(var1, var2x);
            }
         }
      });
   }

   private void binary(String var1, final DoubleBinaryOperator var2) {
      final LuaValue var3 = this.f_2715.get(var1);
      this.f_2716
         .set(
            var1,
            new ThreeArgFunction() {
               public LuaValue call(LuaValue var1, LuaValue var2x, LuaValue var3x) {
                  return (LuaValue)(var1.touserdata() == Class_6FM5pzADQHSIN2va.this.m_instance && var2x.isnumber() && var3x.isnumber()
                     ? valueOf(var2.applyAsDouble(var2x.todouble(), var3x.todouble()))
                     : var3.call(var1, var2x, var3x));
               }
            }
         );
   }

   private void unary(String var1, final DoubleUnaryOperator var2) {
      final LuaValue var3 = this.f_2715.get(var1);
      this.f_2716
         .set(
            var1,
            new TwoArgFunction() {
               public LuaValue call(LuaValue var1, LuaValue var2x) {
                  return (LuaValue)(var1.touserdata() == Class_6FM5pzADQHSIN2va.this.m_instance && var2x.isnumber()
                     ? valueOf(var2.applyAsDouble(var2x.todouble()))
                     : var3.call(var1, var2x));
               }
            }
         );
   }

   private Class_6FM5pzADQHSIN2va(Object var1) {
      super(var1);
      this.f_2715 = CoerceJavaToLua.coerce(var1);
      if (var1 instanceof Class_0LxIerIcmLyypyH2 var2) {
         final LuaValue var3 = this.f_2715.get(f_2718);
         final HashMap var4 = new HashMap();
         this.f_2716.set(f_2719, new TwoArgFunction() {
            public LuaValue call(LuaValue var1, LuaValue var2x) {
               if (var1.touserdata() == Class_6FM5pzADQHSIN2va.this.m_instance && var2x.type() == 4) {
                  LuaValue var3x = (LuaValue)var4.get(var2x);
                  if (var3x != null) {
                     return var3x;
                  }

                  try {
                     var3x = CoerceJavaToLua.coerce(var2.m_704(var2x.tojstring()));
                  } catch (RuntimeException var5) {
                     throw new LuaError(var5);
                  }

                  if (var4.size() >= 2048) {
                     var4.clear();
                  }

                  var4.put(var2x, var3x);
                  return var3x;
               } else {
                  return var3.call(var1, var2x);
               }
            }
         });
      }

      if (var1 instanceof Class_gDV1EanNF5x4bJxz var5) {
         this.unary(f_2720, var5::m_6779);
         this.unary(f_2721, var5::m_6764);
         this.unary(f_2722, var5::m_6776);
         this.unary(f_2723, var5::m_6765);
         this.unary(f_2724, var5::m_6771);
         this.unary(f_2725, var5::m_6769);
         this.binary(f_2726, var5::m_6763);
         this.ternary(f_2727, var5::m_6762);
         this.ternary(f_2728, var5::m_6782);
      }

      if (var1 instanceof Class_ctzSEzguA718d7QA var6) {
         this.unary(f_2729, var6::m_6263);
         this.unary(f_2730, var6::m_6265);
         this.unary(f_2731, var6::m_6270);
         this.unary(f_2732, var6::m_6274);
         this.unary(f_2733, var6::m_6281);
         this.unary(f_2734, var6::m_6280);
         this.unary(f_2735, var6::m_6273);
         this.unary(f_2736, var6::m_6279);
         this.unary(f_2737, var6::m_6259);
         this.unary(f_2738, var6::m_6282);
         this.unary(f_2739, var6::m_6258);
         this.unary(f_2740, var6::m_6267);
         this.unary(f_2741, var6::m_6286);
         this.unary(f_2742, var6::m_6261);
         this.unary(f_2743, var6::m_6287);
         this.unary(f_2744, var6::m_6264);
         this.unary(f_2745, var6::m_6262);
         this.unary(f_2746, var6::m_6275);
         this.unary(f_2747, var6::m_6288);
         this.unary(f_2748, var6::m_6260);
         this.unary(f_2749, var6::m_6283);
         this.unary(f_2750, var6::m_6276);
         this.unary(f_2751, var6::m_6277);
         this.unary(f_2752, var6::m_6269);
         this.unary(f_2753, var6::m_6271);
         this.unary(f_2754, var6::m_6284);
         this.unary(f_2755, var6::m_6272);
         this.unary(f_2756, var6::m_6278);
         this.unary(f_2757, var6::m_6285);
         this.unary(f_2758, var6::m_6266);
         this.unary(f_2759, var6::m_6268);
      }

      if (var1 instanceof Class_JE9HdjSNyReaEgTo var7) {
         this.player(f_2760, var7::m_3184);
         this.player(f_2761, var7::m_3189);
         this.player(f_2762, var7::m_3181);
         this.player(f_2763, var7::m_3191);
         this.player(f_2764, var7::m_3195);
         this.player(f_2765, var7::m_3170);
         this.player(f_2766, var7::m_3185);
         this.player(f_2767, var7::m_3198);
         this.player(f_2768, var7::m_3182);
         this.player(f_2769, var7::m_3172);
         this.player(f_2770, var7::m_3173);
         this.player(f_2771, var7::m_3187);
         this.player(f_2772, var7::m_3193);
         this.player(f_2773, var7::m_3175);
         this.player(f_2774, var7::m_3197);
         this.player(f_2775, var7::m_3177);
         this.player(f_2776, var7::m_3176);
         this.player(f_2777, var7::m_3188);
         this.player(f_2778, var7::m_3180);
         this.player(f_2779, var7::m_3174);
         this.player(f_2780, var7::m_3178);
         this.player(f_2781, var7::m_3179);
         this.player(f_2782, var7::m_3190);
         this.player(f_2783, var7::m_3194);
         this.player(f_2784, var7::m_3186);
      }
   }

   private interface BzV9fQ8c16CNxVus {
      double m_1532(double var1, double var3, double var5);
   }
}
