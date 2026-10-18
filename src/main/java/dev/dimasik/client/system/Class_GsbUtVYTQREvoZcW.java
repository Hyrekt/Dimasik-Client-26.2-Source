package dev.dimasik.client.system;

import lombok.Generated;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.phys.BlockHitResult;

public class Class_GsbUtVYTQREvoZcW extends Class_6u9LYKHM0SeJMktw implements Class_W36DTOFJFiIifzGK {
   private final LocalPlayer f_8073;
   private final InteractionHand f_8074;
   private final BlockHitResult f_8075;

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Class_GsbUtVYTQREvoZcW var2)) {
         return false;
      } else {
         if (!var2.m_2865(this)) {
            return false;
         }

         LocalPlayer var3 = this.m_2867();
         LocalPlayer var4 = var2.m_2867();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            InteractionHand var5 = this.m_2866();
            InteractionHand var6 = var2.m_2866();
            if (var5 == null ? var6 == null : var5.equals(var6)) {
               BlockHitResult var7 = this.m_2868();
               BlockHitResult var8 = var2.m_2868();
               return var7 == null ? var8 == null : var7.equals(var8);
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   @Generated
   protected boolean m_2865(Object var1) {
      return var1 instanceof Class_GsbUtVYTQREvoZcW;
   }

   @Generated
   public InteractionHand m_2866() {
      return this.f_8074;
   }

   @Generated
   public LocalPlayer m_2867() {
      return this.f_8073;
   }

   @Generated
   public BlockHitResult m_2868() {
      return this.f_8075;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      LocalPlayer var3 = this.m_2867();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      InteractionHand var4 = this.m_2866();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      BlockHitResult var5 = this.m_2868();
      return var2 * 59 + (var5 == null ? 43 : var5.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "" + this.m_2867() + this.m_2866() + this.m_2868();
   }

   @Generated
   public Class_GsbUtVYTQREvoZcW(LocalPlayer var1, InteractionHand var2, BlockHitResult var3) {
      this.f_8073 = var1;
      this.f_8074 = var2;
      this.f_8075 = var3;
   }
}
