package dev.dimasik.client.system;

import lombok.Generated;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

public final class Class_zPTPeXzpzYUQVVGj implements Class_W36DTOFJFiIifzGK {
   public static final Class_zPTPeXzpzYUQVVGj f_36113 = new Class_zPTPeXzpzYUQVVGj();
   private Class_zPTPeXzpzYUQVVGj.jyD49jIPu2IjINqm f_36114;
   private int f_36115;
   private ItemStack f_36116 = ItemStack.EMPTY;
   private LivingEntity f_36117;
   private HumanoidArm f_36118;

   private Class_zPTPeXzpzYUQVVGj() {
   }

   public Class_zPTPeXzpzYUQVVGj m_9809(int var1) {
      this.f_36114 = Class_zPTPeXzpzYUQVVGj.jyD49jIPu2IjINqm.SELECTED_SLOT;
      this.f_36115 = var1;
      this.f_36116 = ItemStack.EMPTY;
      this.f_36117 = null;
      this.f_36118 = null;
      return this;
   }

   public Class_zPTPeXzpzYUQVVGj m_9810(LivingEntity var1, HumanoidArm var2, ItemStack var3) {
      this.f_36114 = Class_zPTPeXzpzYUQVVGj.jyD49jIPu2IjINqm.STACK_IN_ARM;
      this.f_36115 = -1;
      this.f_36116 = var3;
      this.f_36117 = var1;
      this.f_36118 = var2;
      return this;
   }

   @Generated
   public ItemStack m_9811() {
      return this.f_36116;
   }

   @Generated
   public void m_9812(HumanoidArm var1) {
      this.f_36118 = var1;
   }

   @Generated
   public void m_9813(LivingEntity var1) {
      this.f_36117 = var1;
   }

   @Generated
   public void m_9814(Class_zPTPeXzpzYUQVVGj.jyD49jIPu2IjINqm var1) {
      this.f_36114 = var1;
   }

   @Generated
   public void m_9815(int var1) {
      this.f_36115 = var1;
   }

   @Generated
   public void m_9816(ItemStack var1) {
      this.f_36116 = var1;
   }

   @Generated
   public Class_zPTPeXzpzYUQVVGj.jyD49jIPu2IjINqm m_9817() {
      return this.f_36114;
   }

   @Generated
   public LivingEntity m_9818() {
      return this.f_36117;
   }

   public Class_zPTPeXzpzYUQVVGj m_9819(LivingEntity var1, ItemStack var2) {
      this.f_36114 = Class_zPTPeXzpzYUQVVGj.jyD49jIPu2IjINqm.MAIN_HAND_STACK;
      this.f_36115 = -1;
      this.f_36116 = var2;
      this.f_36117 = var1;
      this.f_36118 = null;
      return this;
   }

   @Generated
   public HumanoidArm m_9820() {
      return this.f_36118;
   }

   @Generated
   public int m_9821() {
      return this.f_36115;
   }

   public enum jyD49jIPu2IjINqm {
      SELECTED_SLOT,
      MAIN_HAND_STACK,
      STACK_IN_ARM;
   }
}
