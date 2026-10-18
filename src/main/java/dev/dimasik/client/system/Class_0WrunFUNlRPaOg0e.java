package dev.dimasik.client.system;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.ChatFormatting;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;

public class Class_0WrunFUNlRPaOg0e extends Class_msKbTl6QleqYGoq3 implements ArgumentType<String>, Class_NzJrN63M7QBpmAbi {
   public static boolean f_264 = false;
   public static double f_265 = 0.0;
   public static double f_266 = 0.0;
   private static final String f_267 = "gps";
   private static final String f_268 = "x";
   private static final String f_269 = "z";
   private static final String f_270 = "off";
   private static final String f_271 = "info";
   private static final String f_272 = "Сейчас GPS отключен!";
   private static final String f_273 = "Информация о текущем GPS: ";
   private static final String f_274 = "x: ";
   private static final String f_275 = "%.1f";
   private static final String f_276 = ",";
   private static final String f_277 = ".";
   private static final String f_278 = " z: ";
   private static final String f_279 = "%.1f";
   private static final String f_280 = ",";
   private static final String f_281 = ".";
   private static final String f_282 = "x";
   private static final String f_283 = "z";

   public Class_0WrunFUNlRPaOg0e() {
      super(f_267);
   }

   public String parse(StringReader var1) throws CommandSyntaxException {
      return var1.readString();
   }

   @Override
   public void build(LiteralArgumentBuilder<ClientSuggestionProvider> var1) {
      var1.then(
         this.m_7624(f_268, Class_1Fp8MHrFcExS5fry.coordinate(Class_1Fp8MHrFcExS5fry.L8l4X9BRIyc3YbU9.f_486))
            .then(this.m_7624(f_269, Class_1Fp8MHrFcExS5fry.coordinate(Class_1Fp8MHrFcExS5fry.L8l4X9BRIyc3YbU9.f_488)).executes(var0 -> {
               int var1x = (Integer)var0.getArgument(f_282, Integer.class);
               int var2 = (Integer)var0.getArgument(f_283, Integer.class);
               f_264 = true;
               f_265 = var1x;
               f_266 = var2;
               return 1;
            }))
      );
      var1.then(this.m_7628(f_270).executes(var0 -> {
         f_264 = false;
         f_265 = 0.0;
         f_266 = 0.0;
         return 1;
      }));
      var1.then(
         this.m_7628(f_271)
            .executes(
               var0 -> {
                  if (!f_264) {
                     MutableComponent var1x = Component.literal(f_272).setStyle(Style.EMPTY.applyFormat(ChatFormatting.GRAY));
                     Class_ftHu9o3WzCU3Adxm.m_6731(var1x);
                  } else {
                     MutableComponent var6 = Component.literal(f_273).setStyle(Style.EMPTY.applyFormat(ChatFormatting.GRAY));
                     MutableComponent var2 = Component.literal(f_274).setStyle(Style.EMPTY.applyFormat(ChatFormatting.GRAY));
                     MutableComponent var3 = Component.literal(String.format(f_275, f_265).replace(f_276, f_277))
                        .setStyle(Style.EMPTY.applyFormat(ChatFormatting.WHITE));
                     MutableComponent var4 = Component.literal(f_278).setStyle(Style.EMPTY.applyFormat(ChatFormatting.GRAY));
                     MutableComponent var5 = Component.literal(String.format(f_279, f_266).replace(f_280, f_281))
                        .setStyle(Style.EMPTY.applyFormat(ChatFormatting.WHITE));
                     Class_ftHu9o3WzCU3Adxm.m_6731(Component.literal("").append(var6).append(var2).append(var3).append(var4).append(var5));
                  }

                  return 1;
               }
            )
      );
   }

   private static class QSGdcJpHnq7XFDKP implements ArgumentType<Double> {
      public Double parse(StringReader var1) throws CommandSyntaxException {
         try {
            return var1.readDouble();
         } catch (CommandSyntaxException var3) {
            throw new DynamicCommandExceptionType(var0 -> Component.literal(var0 + "")).create(var1.getString());
         }
      }

      public QSGdcJpHnq7XFDKP() {
      }
   }
}
