package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.resources.Identifier;
import net.minecraft.world.InteractionHand;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

public class Class_jj0Ru6m7Bx7aGp7g {
   private static final String f_24799 = "KEYFRAME";

   @Class_FUILRKIQ6wtWry59("addParticle")
   public void m_7403(
      ArrayList<Class_uGNFApwy8sUjPdk5> var1,
      boolean var2,
      double var3,
      double var5,
      double var7,
      double var9,
      double var11,
      double var13,
      double var15,
      double var17,
      double var19,
      double var21,
      double var23,
      double var25,
      double var27,
      Identifier var29,
      String var30,
      InteractionHand var31,
      String var32,
      String var33,
      double var34,
      double var36
   ) {
      var33 = var33.intern();
      var32 = var32.intern();
      var30 = var30.intern();
      var1.add(
         new Class_uGNFApwy8sUjPdk5(
            var2, var3, var5, var7, var9, var11, var13, var15, var17, var19, var21, var23, var25, var27, var29, var30, var31, var32, var33, var34, var36
         )
      );
   }

   @Class_FUILRKIQ6wtWry59("addParticle")
   public void m_7405(
      ArrayList<Class_uGNFApwy8sUjPdk5> var1,
      boolean var2,
      double var3,
      double var5,
      double var7,
      double var9,
      double var11,
      double var13,
      double var15,
      double var17,
      double var19,
      double var21,
      double var23,
      double var25,
      double var27,
      Identifier var29,
      List<Identifier> var30,
      String var31,
      InteractionHand var32,
      String var33,
      String var34,
      double var35,
      double var37,
      LuaValue var39
   ) {
      var34 = var34.intern();
      var33 = var33.intern();
      var31 = var31.intern();
      Class_jgHLHv9px2bYn3hD var40 = null;
      if (var39.isfunction()) {
         var40 = new Class_jgHLHv9px2bYn3hD((LuaFunction)var39);
      }

      if (var1.stream().noneMatch(var1x -> var1x.f_32745 == f_24799 && var1x.f_32769 == var32)) {
         var1.add(
            new Class_uGNFApwy8sUjPdk5(
               var2,
               var3,
               var5,
               var7,
               var9,
               var11,
               var13,
               var15,
               var17,
               var19,
               var21,
               var23,
               var25,
               var27,
               var29,
               var30,
               var31,
               var32,
               var33,
               var34,
               var35,
               var37,
               var40
            )
         );
      }
   }

   @Class_FUILRKIQ6wtWry59("addParticle")
   public void m_7406(
      ArrayList<Class_uGNFApwy8sUjPdk5> var1,
      boolean var2,
      double var3,
      double var5,
      double var7,
      double var9,
      double var11,
      double var13,
      double var15,
      double var17,
      double var19,
      double var21,
      double var23,
      double var25,
      double var27,
      Identifier var29,
      String var30,
      InteractionHand var31,
      String var32,
      String var33,
      double var34,
      double var36,
      LuaValue var38
   ) {
      var33 = var33.intern();
      var32 = var32.intern();
      var30 = var30.intern();
      Class_jgHLHv9px2bYn3hD var39 = null;
      if (var38.isfunction()) {
         var39 = new Class_jgHLHv9px2bYn3hD((LuaFunction)var38);
      }

      var1.add(
         new Class_uGNFApwy8sUjPdk5(
            var2, var3, var5, var7, var9, var11, var13, var15, var17, var19, var21, var23, var25, var27, var29, var30, var31, var32, var33, var34, var36, var39
         )
      );
   }

   @Class_FUILRKIQ6wtWry59("addParticle")
   public void m_7407(
      ArrayList<Class_uGNFApwy8sUjPdk5> var1,
      boolean var2,
      double var3,
      double var5,
      double var7,
      double var9,
      double var11,
      double var13,
      double var15,
      double var17,
      double var19,
      double var21,
      double var23,
      double var25,
      double var27,
      Identifier var29,
      String var30,
      InteractionHand var31,
      String var32,
      String var33,
      double var34,
      double var36,
      LuaValue var38,
      PoseStack var39
   ) {
      var33 = var33.intern();
      var32 = var32.intern();
      var30 = var30.intern();
      Class_jgHLHv9px2bYn3hD var40 = null;
      if (var38.isfunction()) {
         var40 = new Class_jgHLHv9px2bYn3hD((LuaFunction)var38);
      }

      var1.add(
         new Class_uGNFApwy8sUjPdk5(
            var2,
            var3,
            var5,
            var7,
            var9,
            var11,
            var13,
            var15,
            var17,
            var19,
            var21,
            var23,
            var25,
            var27,
            var29,
            var30,
            var31,
            var32,
            var33,
            var34,
            var36,
            var40,
            var39
         )
      );
   }
}
