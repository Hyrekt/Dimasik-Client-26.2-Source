package dev.dimasik.client.system;

import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.platform.Window;
import dev.dimasik.client.module.render.EntityESP;
import dev.dimasik.client.setting.Setting;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ColorSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.ui.screen.Screen_8;
import java.util.ArrayList;
import java.util.UUID;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.entity.state.ItemEntityRenderState;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.zombie.Zombie;
import net.minecraft.world.entity.npc.villager.Villager;
import net.minecraft.world.entity.player.PlayerSkin;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.lwjgl.glfw.GLFW;

public final class Class_9LlsJl3SzHCxWd5g implements Class_NzJrN63M7QBpmAbi {
   private static final float f_4594 = 0.0F;
   private static final float f_4595 = 0.0F;
   private static final float f_4596 = 48.0F;
   private static final float f_4597 = 0.97F;
   private static final float f_4598 = 70.0F;
   private static final float f_4599 = 25.0F;
   private static final float f_4600 = 3.0F;
   private static final float f_4601 = 4.0F;
   private static final float f_4602 = 0.8F;
   private static final float f_4603 = 10.0F;
   private static final float f_4604 = 12.0F;
   private static final float f_4605 = 5.0F;
   private static final float f_4606 = 26.0F;
   private final Screen_8 f_4607;
   private final Class_w8fCJQ5ZtH5lQbWc f_4608;
   private final Class_w8fCJQ5ZtH5lQbWc f_4609;
   private final Class_w8fCJQ5ZtH5lQbWc f_4610;
   private final ArrayList<Class_c7bxavYluZ02uW8X<? extends Setting<?>>> f_4611;
   private EntityESP f_4612;
   private Class_y7LCUoWgFH6Mz8SR f_4613;
   private Class_9LlsJl3SzHCxWd5g.sdhCix01CMbbZmRw f_4614;
   private Class_9LlsJl3SzHCxWd5g.UUDjQj7ygMV3aEAv f_4615;
   private final Class_w8fCJQ5ZtH5lQbWc[] f_4616;
   private Class_9LlsJl3SzHCxWd5g.sdhCix01CMbbZmRw f_4617;
   private RemotePlayer f_4618;
   private Zombie f_4619;
   private Villager f_4620;
   private ItemEntity f_4621;
   private int f_4622;
   private boolean f_4623;
   private boolean f_4624;
   private float f_4625;
   private float f_4626;
   private long f_4627;
   private long f_4628;
   private float f_4629;
   private float f_4630;
   private float f_4631;
   private float f_4632;
   private float f_4633;
   private float f_4634;
   private float f_4635;
   private boolean f_4636;
   private boolean f_4637;
   private static final float f_4638 = 5.5F;
   private static final float f_4639 = 10.0F;
   private static final float f_4640 = 14.0F;
   private static final float f_4641 = 170.0F;
   private static final float f_4642 = 170.0F;
   private static final float f_4643 = 180.0F;
   private static final float f_4644 = 60.0F;
   private static final float f_4645 = 344.0F;
   private static final float f_4646 = 20.0F;
   private static final float f_4647 = 324.0F;
   private static final float f_4648 = 324.0F;
   private static final float f_4649 = 16.0F;
   private static final float f_4650 = 162.0F;
   private static final float f_4651 = 18.0F;
   private static final float f_4652 = 0.029999971F;
   private static final float f_4653 = 0.97F;
   private static final float f_4654 = 0.029999971F;
   private static final float f_4655 = 48.0F;
   private static final float f_4656 = 48.0F;
   private static final String f_4657 = "EntityESP";
   private static final float f_4658 = 184.0F;
   private static final float f_4659 = 12.0F;
   private static final String f_4660 = "Подсвечивает выбранные сущности";
   private static final float f_4661 = 184.0F;
   private static final float f_4662 = 12.0F;
   private static final float f_4663 = 23.5F;
   private static final float f_4664 = 170.0F;
   private static final float f_4665 = 170.0F;
   private static final float f_4666 = 314.0F;
   private static final float f_4667 = 28.0F;
   private static final float f_4668 = 70.0F;
   private static final float f_4669 = 8.0F;
   private static final double f_4670 = 32.0;
   private static final float f_4671 = 32.0F;
   private static final float f_4672 = 12.0F;
   private static final float f_4673 = 10.0F;
   private static final float f_4674 = 5.0F;
   private static final float f_4675 = 10.0F;
   private static final float f_4676 = 12.0F;
   private static final float f_4677 = 3.0F;
   private static final float f_4678 = 32.0F;
   private static final double f_4679 = 29.0;
   private static final float f_4680 = 0.01F;
   private static final float f_4681 = 1.4F;
   private static final float f_4682 = 3.2F;
   private static final float f_4683 = 3.2F;
   private static final float f_4684 = 0.5F;
   private static final float f_4685 = 0.5F;
   private static final float f_4686 = 2.2F;
   private static final float f_4687 = -1.0F;
   private static final float f_4688 = 0.5F;
   private static final float f_4689 = 0.5F;
   private static final float f_4690 = 0.5F;
   private static final float f_4691 = 0.001F;
   private static final float f_4692 = 170.0F;
   private static final float f_4693 = 170.0F;
   private static final float f_4694 = 314.0F;
   private static final float f_4695 = 70.0F;
   private static final float f_4696 = 3.0F;
   private static final float f_4697 = 35.0F;
   private static final float f_4698 = 28.0F;
   private static final float f_4699 = 44.0F;
   private static final float f_4700 = -4.0F;
   private static final float f_4701 = 73.0F;
   private static final double f_4702 = 70.0;
   private static final double f_4703 = 25.0;
   private static final float f_4704 = 70.0F;
   private static final float f_4705 = 25.0F;
   private static final float f_4706 = 5.0F;
   private static final float f_4707 = 11.0F;
   private static final float f_4708 = 35.0F;
   private static final float f_4709 = 7.0F;
   private static final float f_4710 = 170.0F;
   private static final float f_4711 = 324.0F;
   private static final float f_4712 = 170.0F;
   private static final float f_4713 = 12.0F;
   private static final float f_4714 = 76.0F;
   private static final float f_4715 = 120.0F;
   private static final float f_4716 = 24.0F;
   private static final float f_4717 = 40.0F;
   private static final float f_4718 = 88.0F;
   private static final String f_4719 = "Настройки: ";
   private static final float f_4720 = 22.0F;
   private static final float f_4721 = 18.0F;
   private static final float f_4722 = 22.0F;
   private static final float f_4723 = 15.0F;
   private static final float f_4724 = 0.2F;
   private static final float f_4725 = 0.001F;
   private static final float f_4726 = 5.0F;
   private static final float f_4727 = 0.001F;
   private static final float f_4728 = 18.0F;
   private static final float f_4729 = 125.0F;
   private static final float f_4730 = 150.0F;
   private static final float f_4731 = (float) Math.PI;
   private static final int f_4732 = 15728880;
   private static final float f_4733 = 180.0F;
   private static final float f_4734 = -0.0F;
   private static final float f_4735 = 0.05F;
   private static final float f_4736 = 20.0F;
   private static final int f_4737 = -2147483647;
   private static final float f_4738 = 170.0F;
   private static final float f_4739 = 170.0F;
   private static final float f_4740 = 314.0F;
   private static final float f_4741 = 28.0F;
   private static final float f_4742 = 70.0F;
   private static final float f_4743 = 0.01F;
   private static final float f_4744 = 3.0F;
   private static final float f_4745 = 44.0F;
   private static final float f_4746 = -4.0F;
   private static final float f_4747 = 3.0F;
   private static final double f_4748 = 25.0;
   private static final float f_4749 = 8.0F;
   private static final double f_4750 = 32.0;
   private static final float f_4751 = 26.0F;
   private static final float f_4752 = 1.0E9F;
   private static final float f_4753 = 0.05F;
   private static final float f_4754 = 0.8F;
   private static final float f_4755 = -10.0F;
   private static final float f_4756 = 0.01F;
   private static final float f_4757 = 162.0F;
   private static final float f_4758 = 18.0F;
   private static final float f_4759 = 125.0F;
   private static final float f_4760 = 150.0F;
   private static final double f_4761 = 250.0;
   private static final double f_4762 = 300.0;
   private static final float f_4763 = 5.0E7F;
   private static final float f_4764 = 360.0F;
   private static final float f_4765 = 180.0F;
   private static final float f_4766 = 360.0F;
   private static final float f_4767 = -180.0F;
   private static final float f_4768 = 360.0F;
   private static final float f_4769 = 10.0F;
   private static final int f_4770 = 16777215;
   private static final int f_4771 = 16777215;
   private static final int f_4772 = 16777215;

   private void m_1934() {
      final PlayerSkin var1 = f_11537.player.getSkin();
      ClientLevel var10004 = f_11537.level;
      UUID var10007 = UUID.randomUUID();
      Object var10008 = null;
      var10008 = null;
      this.f_4618 = new RemotePlayer(var10004, new GameProfile(var10007, "Unavailable")) {
         public PlayerSkin getSkin() {
            return var1;
         }
      };
      this.f_4618.setHealth(f_4736);
      this.f_4618.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Items.NETHERITE_SWORD));
      this.f_4618.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(Items.TOTEM_OF_UNDYING));
      this.f_4618.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Items.NETHERITE_HELMET));
      this.f_4618.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Items.NETHERITE_CHESTPLATE));
      this.f_4618.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Items.NETHERITE_LEGGINGS));
      this.f_4618.setItemSlot(EquipmentSlot.FEET, new ItemStack(Items.NETHERITE_BOOTS));
      this.f_4619 = new Zombie(EntityTypes.ZOMBIE, f_11537.level);
      this.f_4620 = new Villager(EntityTypes.VILLAGER, f_11537.level);
      this.f_4621 = new Class_9LlsJl3SzHCxWd5g.Class_00db39ZjqTTKMAQA(f_11537.level, new ItemStack(Items.ENDER_PEARL, 16));
      this.f_4621.setNoGravity(true);
      this.f_4621.setNeverPickUp();
      int var2 = f_4737;

      for (Entity var6 : new Entity[]{this.f_4618, this.f_4619, this.f_4620, this.f_4621}) {
         while (f_11537.level.getEntity(var2) != null) {
            var2++;
         }

         var6.setId(var2++);
      }
   }

   private void m_1935(float var1, float var2, float var3, float var4, int var5) {
      float var6 = (var1 + var3) * f_4684;
      float var7 = (var2 + var4) * f_4685;
      float var8 = f_4686;
      float var9 = (float)Math.hypot(var3 - var1, var4 - var2) + var8;
      float var10 = f_11537.getWindow().getScreenWidth();
      float var11 = f_11537.getWindow().getScreenHeight();
      float var12 = var6 * 2.0F / var10 - 1.0F;
      float var13 = 1.0F - var7 * 2.0F / var11;
      Matrix4f var14 = Class_Ssh31B3ljfKeWsvS.m_4853();
      Matrix4f var15 = new Matrix4f(var14);

      try {
         var14.translate(var12, var13, 0.0F)
            .scale(1.0F / var10, f_4687 / var11, 1.0F)
            .rotateZ((float)Math.atan2(var4 - var2, var3 - var1))
            .scale(var10, -var11, 1.0F)
            .translate(-var12, -var13, 0.0F);
         Class_Ssh31B3ljfKeWsvS.m_4817(var6 - var9 * f_4688, var7 - var8 * f_4689, var9, var8, var8 * f_4690, var5);
      } finally {
         var14.set(var15);
      }
   }

   private void m_1936(Class_9LlsJl3SzHCxWd5g.sdhCix01CMbbZmRw var1) {
      if (var1 != this.f_4614) {
         this.f_4617 = this.f_4614;
         this.f_4622 = Integer.compare(var1.ordinal(), this.f_4614.ordinal());
         if (this.f_4622 == 0) {
            this.f_4622 = 1;
         }

         this.f_4614 = var1;
         this.f_4608.m_9281(0.0F);
      }
   }

   private void m_1937(float var1, float var2, float var3) {
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(), f_4657, var1 + f_4658, var2 + f_4659, 15, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.TEXT)
      );
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         Class_0p152hWffX3ippAf.m_801(f_4660),
         var1 + f_4661,
         var2 + f_4662 + f_4663,
         13,
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SUR_TEXT)
      );
   }

   private void m_1938(GuiGraphicsExtractor var1, Class_9LlsJl3SzHCxWd5g.sdhCix01CMbbZmRw var2, float var3, float var4, float var5, float var6) {
      if (!(var6 <= f_4727)) {
         Entity var7 = this.m_1960(var2);
         Class_y7LCUoWgFH6Mz8SR var8 = this.m_1972(var2);
         if (var7 != null && var8 != null) {
            this.m_1968(var1, var7, var8, var3, var4, var2.f_4593, var5, var6);
            float var9 = var4 + (1.0F - var5) * var2.f_4593;
            float var10 = var9 - var2.f_4593 * var5 - f_4728;
            if (var8.m_9635().m_8768()) {
               this.f_4612.m_4066().m_4336(var7, var8, var3, var10, var6);
            }
         }
      }
   }

   private void m_1939(float var1) {
      long var2 = System.nanoTime();
      float var4 = this.f_4627 == 0L ? 0.0F : Math.min((float)(var2 - this.f_4627) / f_4752, f_4753);
      this.f_4627 = var2;
      if (this.f_4624) {
         boolean var5 = GLFW.glfwGetMouseButton(f_11537.getWindow().handle(), 1) == 1;
         if (!var5) {
            this.f_4624 = false;
         } else {
            float var6 = var1 - this.f_4626;
            this.f_4625 = m_1949(this.f_4625 + var6 * f_4754);
         }

         this.f_4626 = var1;
      }

      if (!this.f_4624 && var4 > 0.0F) {
         float var7 = 1.0F - (float)Math.exp(f_4755 * var4);
         this.f_4625 = this.f_4625 + (0.0F - this.f_4625) * var7;
         if (Math.abs(this.f_4625) < f_4756) {
            this.f_4625 = 0.0F;
         }
      }
   }

   private boolean m_1940(float var1, float var2, int var3) {
      for (Class_c7bxavYluZ02uW8X var5 : this.f_4611) {
         if (var5 instanceof Class_tC5Oe0Pn191pu0bo var6 && var6.m_8795()) {
            var6.m_2319(var1, var2, var3);
            if (var6.m_6147().m_849()) {
               var6.m_700(var1, var2, var3);
            }

            return true;
         }
      }

      boolean var7 = false;

      for (Class_c7bxavYluZ02uW8X var10 : this.f_4611) {
         if (var10.m_2319(var1, var2, var3)) {
            var7 = true;
            break;
         }
      }

      if (!var7 && !this.m_1947(var1, var2)) {
         return false;
      }

      for (Class_c7bxavYluZ02uW8X var11 : this.f_4611) {
         if (var11.m_6147().m_849()) {
            var11.m_700(var1, var2, var3);
         }
      }

      return true;
   }

   private void m_1941(float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.m_1974();
      if (this.f_4613 != null) {
         float var8 = var3 - f_4710;
         float var9 = var8 - f_4711;
         float var10 = var1 + f_4712 + f_4713;
         float var11 = var2 + f_4714;
         float var12 = Math.max(f_4715, var9 - f_4716);
         float var13 = Math.max(f_4717, var4 - f_4718);
         Class_Ssh31B3ljfKeWsvS.m_4866(
            Class_y1y6QpONhWEUIdEB.m_9588(),
            Class_0p152hWffX3ippAf.m_801(f_4719) + Class_0p152hWffX3ippAf.m_801(this.f_4613.m_9628()),
            var10,
            var11,
            13,
            Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.TEXT)
         );
         this.f_4632 = var10;
         this.f_4633 = var11 + f_4720;
         this.f_4634 = var12;
         this.f_4635 = Math.max(f_4721, var13 - f_4722);
         this.f_4630 = Math.clamp(this.f_4630, 0.0F, this.f_4631);
         this.f_4610.m_9283(this.f_4630);
         this.f_4629 = this.f_4610.m_9288();
         Class_Ssh31B3ljfKeWsvS.m_4860(this.f_4632, this.f_4633, this.f_4634 + f_4723, this.f_4635);
         float var14 = 0.0F;

         for (Class_c7bxavYluZ02uW8X var16 : this.f_4611) {
            var16.m_6147().m_848(0.0F, 1.0F, f_4724, Class_55WOGfS5cDac4HRi.f_2285, var7);
            float var17 = Math.clamp(var16.m_6147().m_845(), 0.0F, 1.0F);
            if (!(var17 <= f_4725)) {
               var16.m_6138(this.f_4632);
               var16.m_6140(this.f_4633 + var14 - this.f_4629);
               var16.m_6143(this.f_4634);
               if (var16.m_6144() + var16.m_6139() >= this.f_4633 && var16.m_6144() <= this.f_4633 + this.f_4635) {
                  float var18 = Class_Ssh31B3ljfKeWsvS.m_4821();
                  Class_Ssh31B3ljfKeWsvS.m_4864(var18 * var17);
                  var16.m_701(var5, var6, var7);
                  Class_Ssh31B3ljfKeWsvS.m_4864(var18);
               }

               var14 += (var16.m_6139() + f_4726) * var17;
            }
         }

         Class_Ssh31B3ljfKeWsvS.m_4828();
         this.f_4631 = Math.max(0.0F, var14 - this.f_4635);
         this.f_4630 = Math.clamp(this.f_4630, 0.0F, this.f_4631);
         if (this.f_4631 <= 0.0F) {
            this.m_1978();
         } else if (this.f_4629 > this.f_4631) {
            this.f_4629 = this.f_4631;
            this.f_4610.m_9281(this.f_4631);
         }
      }
   }

   private void m_1942(float var1, float var2, float var3, float var4, float var5) {
      float var6 = var1 + f_4664 + var3 - f_4665 - f_4666;
      float var7 = var2 + f_4667;
      Class_9LlsJl3SzHCxWd5g.sdhCix01CMbbZmRw[] var8 = Class_9LlsJl3SzHCxWd5g.sdhCix01CMbbZmRw.values();
      float var9 = f_4668;
      boolean var10 = false;

      for (int var11 = 0; var11 < var8.length; var11++) {
         Class_9LlsJl3SzHCxWd5g.sdhCix01CMbbZmRw var12 = var8[var11];
         float var13 = var6 + var11 * (var9 + f_4669);
         boolean var14 = this.f_4614 == var12;
         boolean var15 = Class_FvJXUGWpZo3zYBW4.m_2697(var4, var5, var13, var7, var9, f_4670);
         if (var12 == Class_9LlsJl3SzHCxWd5g.sdhCix01CMbbZmRw.PLAYERS) {
            var10 = var15;
         }

         int var16;
         if (var14) {
            var16 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
         } else {
            var16 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE);
         }

         Class_Ssh31B3ljfKeWsvS.m_4817(var13, var7 + f_4671, var9, 1.0F, 0.0F, var16);
         int var17 = var14 ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.TEXT) : Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SUR_TEXT);
         String var18 = Class_0p152hWffX3ippAf.m_801(var12.f_4591);
         float var19 = Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var18, f_4672, 0.0F);
         boolean var20 = var12 == Class_9LlsJl3SzHCxWd5g.sdhCix01CMbbZmRw.PLAYERS;
         float var21 = f_4673;
         float var22 = f_4674;
         float var23 = var19 + (var20 ? var22 + var21 : 0.0F);
         float var24 = var13 + (var9 - var23) / 2.0F;
         float var25 = var7 + f_4675;
         Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var18, var24, var25, 12, var17);
         if (var20) {
            float var26 = Math.clamp(this.f_4609.m_9288(), 0.0F, 1.0F);
            int var27 = m_1945(var17, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN), var15 ? 1.0F : var26);
            float var28 = var25 + Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2154(var18, f_4676);
            this.m_1975(var24 + var19 + var22 + var21 / 2.0F, var28, var26, var27);
         }
      }

      float var29 = Class_9LlsJl3SzHCxWd5g.UUDjQj7ygMV3aEAv.values().length * var9 + (Class_9LlsJl3SzHCxWd5g.UUDjQj7ygMV3aEAv.values().length - 1) * f_4677;
      float var30 = var6 + var9 / 2.0F - var29 / 2.0F;
      boolean var31 = Class_FvJXUGWpZo3zYBW4.m_2697(var4, var5, var30, var7 + f_4678, var29, f_4679);
      boolean var32 = this.f_4623 || this.f_4614 != Class_9LlsJl3SzHCxWd5g.sdhCix01CMbbZmRw.PLAYERS && (var10 || this.f_4609.m_9288() > f_4680 && var31);
      this.f_4609.m_9283(var32 ? 1.0F : 0.0F);
   }

   private static int m_1943(int var0, float var1) {
      int var2 = var0 >>> 24;
      if (var2 == 0 && (var0 & f_4771) != 0) {
         var2 = 255;
      }

      int var3 = Math.round(var2 * Math.clamp(var1, 0.0F, 1.0F));
      return var3 << 24 | var0 & f_4772;
   }

   private void m_1944(float var1, float var2, float var3, float var4, float var5) {
      float var6 = Math.clamp(this.f_4609.m_9288(), 0.0F, 1.0F);
      if (!(var6 <= f_4691)) {
         Class_9LlsJl3SzHCxWd5g.UUDjQj7ygMV3aEAv[] var7 = Class_9LlsJl3SzHCxWd5g.UUDjQj7ygMV3aEAv.values();
         float var8 = var1 + f_4692 + var3 - f_4693 - f_4694;
         float var9 = var7.length * f_4695 + (var7.length - 1) * f_4696;
         float var10 = var8 + f_4697 - var9 / 2.0F;
         float var11 = var2 + f_4698 + f_4699;
         float var12 = (1.0F - var6) * f_4700;

         for (int var13 = 0; var13 < var7.length; var13++) {
            Class_9LlsJl3SzHCxWd5g.UUDjQj7ygMV3aEAv var14 = var7[var13];
            float var15 = var10 + var13 * f_4701;
            float var16 = var11 + var12;
            boolean var17 = Class_FvJXUGWpZo3zYBW4.m_2697(var4, var5, var15, var16, f_4702, f_4703);
            boolean var18 = this.f_4615 == var14;
            Class_w8fCJQ5ZtH5lQbWc var19 = this.f_4616[var13];
            var19.m_9283(!var18 && !var17 ? 0.0F : 1.0F);
            float var20 = Math.clamp(var19.m_9288(), 0.0F, 1.0F);
            int var21 = m_1945(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE), Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN), var20);
            int var22 = m_1945(
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SUR_TEXT), Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.TEXT), var20
            );
            Class_Ssh31B3ljfKeWsvS.m_4817(var15, var16, f_4704, f_4705, f_4706, m_1943(var21, var6));
            String var23 = Class_0p152hWffX3ippAf.m_801(var14.f_4590);
            float var24 = Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var23, f_4707, 0.0F);
            Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var23, var15 + f_4708 - var24 / 2.0F, var16 + f_4709, 11, m_1943(var22, var6));
         }
      }
   }

   private static int m_1945(int var0, int var1, float var2) {
      float var3 = Math.clamp(var2, 0.0F, 1.0F);
      int var4 = m_1953(var0);
      int var5 = m_1953(var1);
      int var6 = Math.round(var4 + (var5 - var4) * var3);
      int var7 = Math.round((var0 >> 16 & 0xFF) + ((var1 >> 16 & 0xFF) - (var0 >> 16 & 0xFF)) * var3);
      int var8 = Math.round((var0 >> 8 & 0xFF) + ((var1 >> 8 & 0xFF) - (var0 >> 8 & 0xFF)) * var3);
      int var9 = Math.round((var0 & 0xFF) + ((var1 & 0xFF) - (var0 & 0xFF)) * var3);
      return var6 << 24 | var7 << 16 | var8 << 8 | var9;
   }

   public boolean m_1946(int var1) {
      if (!this.m_1957()) {
         return false;
      }

      for (Class_c7bxavYluZ02uW8X var3 : this.f_4611) {
         var3.m_698(var1);
      }

      if (var1 == 256) {
         this.m_1965();
         return true;
      } else {
         return true;
      }
   }

   private boolean m_1947(float var1, float var2) {
      return Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_4632, this.f_4633, this.f_4634, this.f_4635);
   }

   public void m_1948() {
      if (this.m_1957()) {
         this.m_1974();

         for (Class_c7bxavYluZ02uW8X var2 : this.f_4611) {
            var2.m_6147().m_843(var2.m_6149().m_8766().getAsBoolean());
            var2.m_694();
         }
      }
   }

   public Class_9LlsJl3SzHCxWd5g(Screen_8 var1) {
      this.f_4608 = new Class_w8fCJQ5ZtH5lQbWc(1.0F, f_4638, Class_eXr9Fra2ad3yFXY8.f_19110);
      this.f_4609 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_4639, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_4610 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_4640, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_4611 = new ArrayList<>();
      this.f_4614 = Class_9LlsJl3SzHCxWd5g.sdhCix01CMbbZmRw.PLAYERS;
      this.f_4615 = Class_9LlsJl3SzHCxWd5g.UUDjQj7ygMV3aEAv.SELF;
      this.f_4616 = m_1955();
      this.f_4622 = 1;
      this.f_4607 = var1;
   }

   private static float m_1949(float var0) {
      float var1 = var0 % f_4764;
      if (var1 >= f_4765) {
         var1 -= f_4766;
      }

      if (var1 < f_4767) {
         var1 += f_4768;
      }

      return var1;
   }

   private Class_y7LCUoWgFH6Mz8SR m_1950() {
      return this.m_1972(this.f_4614);
   }

   public boolean m_1951(double var1, double var3, double var5) {
      if (!this.m_1957()) {
         return false;
      }

      for (Class_c7bxavYluZ02uW8X var8 : this.f_4611) {
         if (var8.m_2320((float)var1, (float)var3, var5)) {
            return true;
         }
      }

      if (this.m_1947((float)var1, (float)var3) && !(this.f_4631 <= 0.0F)) {
         this.f_4630 = Math.clamp(this.f_4630 - (float)var5 * f_4751, 0.0F, this.f_4631);
         return true;
      } else {
         return false;
      }
   }

   private void m_1952() {
      for (Class_c7bxavYluZ02uW8X var2 : this.f_4611) {
         var2.m_2322();
      }
   }

   private static int m_1953(int var0) {
      int var1 = var0 >>> 24;
      return var1 == 0 && (var0 & f_4770) != 0 ? 255 : var1;
   }

   public boolean m_1954(String var1, int var2, int var3) {
      if (!this.m_1957()) {
         return false;
      }

      for (Class_c7bxavYluZ02uW8X var5 : this.f_4611) {
         var5.m_2935(var1, var2, var3);
      }

      return true;
   }

   private static Class_w8fCJQ5ZtH5lQbWc[] m_1955() {
      Class_9LlsJl3SzHCxWd5g.UUDjQj7ygMV3aEAv[] var0 = Class_9LlsJl3SzHCxWd5g.UUDjQj7ygMV3aEAv.values();
      Class_w8fCJQ5ZtH5lQbWc[] var1 = new Class_w8fCJQ5ZtH5lQbWc[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2] = new Class_w8fCJQ5ZtH5lQbWc(
            var2 == Class_9LlsJl3SzHCxWd5g.UUDjQj7ygMV3aEAv.SELF.ordinal() ? 1.0F : 0.0F, f_4769, Class_eXr9Fra2ad3yFXY8.f_19100
         );
      }

      return var1;
   }

   private void m_1956(float var1, float var2) {
      if (this.f_4636) {
         boolean var3 = GLFW.glfwGetMouseButton(f_11537.getWindow().handle(), 0) == 1;
         if (!var3) {
            this.m_1971(var1, var2, 0);
            this.f_4636 = false;
         }
      }
   }

   public boolean m_1957() {
      return this.f_4637 && this.f_4612 != null;
   }

   public boolean m_1958(double var1, double var3, int var5) {
      if (!this.m_1957()) {
         return false;
      }

      if (var5 == 1) {
         if (!this.m_1973((float)var1, (float)var3)) {
            return false;
         }

         this.f_4624 = true;
         this.f_4626 = (float)var1;
         this.f_4627 = System.nanoTime();
         return true;
      } else {
         if (var5 != 0) {
            return false;
         }

         if (this.m_1940((float)var1, (float)var3, var5)) {
            this.f_4636 = true;
            return true;
         }

         float var6 = this.f_4607.getGuiX();
         float var7 = this.f_4607.getGuiY();
         float var8 = this.f_4607.getGuiWidth();
         float var9 = var6 + f_4738 + var8 - f_4739 - f_4740;
         float var10 = var7 + f_4741;
         Class_9LlsJl3SzHCxWd5g.sdhCix01CMbbZmRw[] var11 = Class_9LlsJl3SzHCxWd5g.sdhCix01CMbbZmRw.values();
         float var12 = f_4742;
         if (this.f_4609.m_9288() > f_4743) {
            float var13 = Math.clamp(this.f_4609.m_9288(), 0.0F, 1.0F);
            Class_9LlsJl3SzHCxWd5g.UUDjQj7ygMV3aEAv[] var14 = Class_9LlsJl3SzHCxWd5g.UUDjQj7ygMV3aEAv.values();
            float var15 = var14.length * var12 + (var14.length - 1) * f_4744;
            float var16 = var9 + var12 / 2.0F - var15 / 2.0F;
            float var17 = var10 + f_4745;
            float var18 = (1.0F - var13) * f_4746;
            float var19 = var17 + var18;

            for (int var20 = 0; var20 < var14.length; var20++) {
               float var21 = var16 + var20 * (var12 + f_4747);
               if (Class_FvJXUGWpZo3zYBW4.m_2697((float)var1, (float)var3, var21, var19, var12, f_4748)) {
                  this.f_4615 = var14[var20];
                  this.f_4623 = false;
                  this.m_1936(Class_9LlsJl3SzHCxWd5g.sdhCix01CMbbZmRw.PLAYERS);
                  return true;
               }
            }
         }

         for (int var22 = 0; var22 < var11.length; var22++) {
            float var23 = var9 + var22 * (var12 + f_4749);
            if (Class_FvJXUGWpZo3zYBW4.m_2697((float)var1, (float)var3, var23, var10, var12, f_4750)) {
               Class_9LlsJl3SzHCxWd5g.sdhCix01CMbbZmRw var24 = var11[var22];
               if (var24 == Class_9LlsJl3SzHCxWd5g.sdhCix01CMbbZmRw.PLAYERS && this.f_4614 == Class_9LlsJl3SzHCxWd5g.sdhCix01CMbbZmRw.PLAYERS) {
                  this.f_4623 = !this.f_4623;
                  return true;
               }

               this.f_4623 = false;
               this.m_1936(var24);
               if (var24 == Class_9LlsJl3SzHCxWd5g.sdhCix01CMbbZmRw.PLAYERS) {
                  this.f_4609.m_9281(0.0F);
               }

               return true;
            }
         }

         return true;
      }
   }

   private float m_1959() {
      return this.f_4628 == 0L ? 0.0F : (float)(System.nanoTime() - this.f_4628) / f_4763;
   }

   private Entity m_1960(Class_9LlsJl3SzHCxWd5g.sdhCix01CMbbZmRw var1) {
      return (Entity)(switch (var1) {
         case PLAYERS -> this.f_4618;
         case MOBS -> this.f_4619;
         case VILLAGERS -> this.f_4620;
         case ITEMS -> this.f_4621;
      });
   }

   public void m_1961(EntityESP var1) {
      if (var1 != null && f_11537.level != null && f_11537.player != null) {
         this.f_4612 = var1;
         this.f_4614 = Class_9LlsJl3SzHCxWd5g.sdhCix01CMbbZmRw.PLAYERS;
         this.f_4617 = null;
         this.f_4608.m_9281(1.0F);
         this.f_4609.m_9281(0.0F);
         this.m_1966();
         this.f_4623 = false;
         this.f_4613 = null;
         this.m_1978();
         this.f_4631 = 0.0F;
         this.f_4636 = false;
         this.m_1976();
         this.f_4628 = System.nanoTime();
         this.f_4637 = true;
         this.m_1934();
      }
   }

   private void m_1962(float var1, float var2, float var3) {
      for (Class_c7bxavYluZ02uW8X var5 : this.f_4611) {
         if (var5.m_6147().m_849()) {
            var5.m_2317(var1, var2, var3);
         }
      }
   }

   public Class_9LlsJl3SzHCxWd5g.UUDjQj7ygMV3aEAv m_1963() {
      return this.f_4615;
   }

   public static boolean m_1964(ItemEntity var0) {
      return var0 instanceof Class_9LlsJl3SzHCxWd5g.Class_00db39ZjqTTKMAQA;
   }

   public void m_1965() {
      this.m_1952();
      this.f_4611.clear();
      this.f_4613 = null;
      this.f_4637 = false;
      this.f_4612 = null;
      this.f_4617 = null;
      this.f_4618 = null;
      this.f_4619 = null;
      this.f_4620 = null;
      this.f_4621 = null;
      this.f_4608.m_9281(1.0F);
      this.f_4609.m_9281(0.0F);
      this.m_1966();
      this.f_4623 = false;
      this.m_1978();
      this.f_4631 = 0.0F;
      this.f_4636 = false;
      this.m_1976();
      this.f_4628 = 0L;
   }

   private void m_1966() {
      for (int var1 = 0; var1 < this.f_4616.length; var1++) {
         float var2 = var1 == this.f_4615.ordinal() ? 1.0F : 0.0F;
         this.f_4616[var1].m_9281(var2);
      }
   }

   public boolean m_1967(int var1) {
      if (!this.m_1957()) {
         return false;
      }

      for (Class_c7bxavYluZ02uW8X var3 : this.f_4611) {
         var3.m_5916(var1);
      }

      return true;
   }

   private void m_1968(GuiGraphicsExtractor var1, Entity var2, Class_y7LCUoWgFH6Mz8SR var3, float var4, float var5, int var6, float var7, float var8) {
      Window var9 = f_11537.getWindow();
      if (!var9.isIconified() && var9.getScreenWidth() > 0 && var9.getScreenHeight() > 0) {
         float var10 = var9.getGuiScale();
         if (Float.isFinite(var10) && !(var10 <= 0.0F) && Float.isFinite(var7) && !(var7 <= 0.0F)) {
            float var11 = f_4729;
            float var12 = f_4730;
            float var13 = var5 + (1.0F - var7) * var6;
            Vector2f var14 = Class_FvJXUGWpZo3zYBW4.m_2699(var4 - var11, var13 - var12);
            Vector2f var15 = Class_FvJXUGWpZo3zYBW4.m_2699(var4 + var11, var13 + var12);
            if (Float.isFinite(var14.x) && Float.isFinite(var14.y) && Float.isFinite(var15.x) && Float.isFinite(var15.y)) {
               float var16 = (var15.x - var14.x) / (var11 * 2.0F);
               int var17 = Math.round(var14.x / var10);
               int var18 = Math.round(var14.y / var10);
               int var19 = Math.round(var15.x / var10);
               int var20 = Math.round(var15.y / var10);
               if (var19 > var17 && var20 > var18) {
                  int var21 = Math.max(1, Math.round(var6 * var7 * var16 / var10));
                  this.m_1970(var1, var2, var3, var17, var18, var19, var20, var21, var8);
               }
            }
         }
      }
   }

   public void m_1969(GuiGraphicsExtractor var1, float var2, float var3, float var4) {
      if (this.m_1957()) {
         this.m_1956(var2, var3);
         if (f_11537.level == null) {
            this.m_1965();
         } else {
            float var5 = this.f_4607.getGuiX();
            float var6 = this.f_4607.getGuiY();
            float var7 = this.f_4607.getGuiWidth();
            float var8 = this.f_4607.getGuiHeight();
            this.m_1939(var2);
            float var9 = var5 + f_4641;
            float var10 = var6;
            float var11 = var7 - f_4642;
            float var12 = var8;
            Class_Ssh31B3ljfKeWsvS.m_4817(
               var5 + f_4643, var6 + f_4644, var11 - f_4645, 1.0F, 0.0F, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE)
            );
            Class_Ssh31B3ljfKeWsvS.m_4854(var9, var10, var11, var12, 1.0F, f_4646, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE));
            Class_Ssh31B3ljfKeWsvS.m_4854(
               var9 + var11 - f_4647, var10, f_4648, var12, 1.0F, f_4649, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE)
            );
            this.m_1937(var5, var6, var7);
            this.m_1942(var5, var6, var7, var2, var3);
            this.m_1941(var5, var6, var7, var8, var2, var3, var4);
            float var13 = var9 + var11 - f_4650;
            float var14 = var10 + var12 / 2.0F + f_4651;
            if (this.f_4617 != null) {
               this.f_4608.m_9283(1.0F);
               float var15 = Math.clamp(this.f_4608.m_9288(), 0.0F, 1.0F);
               float var16 = 1.0F - var15;
               float var17 = var15;
               float var18 = 1.0F - f_4652 * var15;
               float var19 = f_4653 + f_4654 * var15;
               float var20 = -this.f_4622 * f_4655 * var15;
               float var21 = this.f_4622 * f_4656 * (1.0F - var15);
               if (!this.f_4608.m_9280()) {
                  this.m_1938(var1, this.f_4617, var13 + var20, var14, var18, var16);
                  this.m_1938(var1, this.f_4614, var13 + var21, var14, var19, var17);
               } else {
                  this.f_4617 = null;
                  this.f_4608.m_9281(1.0F);
                  this.m_1938(var1, this.f_4614, var13, var14, 1.0F, 1.0F);
               }
            } else {
               this.m_1938(var1, this.f_4614, var13, var14, 1.0F, 1.0F);
            }

            this.m_1944(var5, var6, var7, var2, var3);
            this.m_1962(var2, var3, var4);
         }
      }
   }

   private void m_1970(GuiGraphicsExtractor var1, Entity var2, Class_y7LCUoWgFH6Mz8SR var3, int var4, int var5, int var6, int var7, int var8, float var9) {
      Quaternionf var10 = new Quaternionf().rotateZ(f_4731 + (float)Math.toRadians(0.0));
      Quaternionf var11 = new Quaternionf().rotateY((float)Math.toRadians(this.f_4625));
      var10.mul(var11);
      EntityRenderDispatcher var12 = f_11537.getEntityRenderDispatcher();
      EntityRenderState var13 = var12.extractEntity(var2, 1.0F);
      var13.lightCoords = f_4732;
      var13.shadowPieces.clear();
      var13.outlineColor = 0;
      if (var13 instanceof ItemEntityRenderState var14 && var2 instanceof ItemEntity var15 && m_1964(var15)) {
         var14.ageInTicks = this.m_1959();
      }

      if (var13 instanceof LivingEntityRenderState var16) {
         var16.isInvisible = false;
         var16.isInvisibleToPlayer = false;
         var16.bodyRot = f_4733;
         var16.yRot = f_4734;
         var16.xRot = 0.0F;
         var16.pose = Pose.STANDING;
         if (var16.scale != 0.0F) {
            var16.boundingBoxWidth = var16.boundingBoxWidth / var16.scale;
            var16.boundingBoxHeight = var16.boundingBoxHeight / var16.scale;
         }

         var16.scale = 1.0F;
      }

      if (var3.m_9635().m_8768()) {
         Class_UGcsFaMz4KDfzWIg.m_5228(var13, var9, this.f_4612.m_4055(), var3);
      } else {
         Class_UGcsFaMz4KDfzWIg.m_5226(var13, var9);
      }

      Vector3f var17 = new Vector3f(0.0F, var13.boundingBoxHeight / 2.0F + f_4735, 0.0F);
      var1.entity(var13, var8, var17, var10, var11, var4, var5, var6, var7);
   }

   private void m_1971(float var1, float var2, int var3) {
      for (Class_c7bxavYluZ02uW8X var5 : this.f_4611) {
         var5.m_2083(var1, var2, var3);
      }
   }

   private Class_y7LCUoWgFH6Mz8SR m_1972(Class_9LlsJl3SzHCxWd5g.sdhCix01CMbbZmRw var1) {
      if (this.f_4612 != null && var1 != null) {
         return switch (var1) {
            case PLAYERS -> {
               switch (this.f_4615) {
                  case SELF:
                     yield this.f_4612.m_4059();
                  case FRIENDS:
                     yield this.f_4612.m_4057();
                  case PLAYERS:
                     yield this.f_4612.m_4061();
                  default:
                     throw new MatchException(null, null);
               }
            }
            case MOBS -> this.f_4612.m_4054();
            case VILLAGERS -> this.f_4612.m_4062();
            case ITEMS -> this.f_4612.m_4068();
         };
      } else {
         return null;
      }
   }

   private boolean m_1973(float var1, float var2) {
      float var3 = this.f_4607.getGuiX();
      float var4 = this.f_4607.getGuiY();
      float var5 = this.f_4607.getGuiWidth();
      float var6 = this.f_4607.getGuiHeight();
      float var7 = var3 + var5 - f_4757;
      float var8 = var4 + var6 / 2.0F + f_4758;
      return Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var7 - f_4759, var8 - f_4760, f_4761, f_4762);
   }

   private void m_1974() {
      Class_y7LCUoWgFH6Mz8SR var1 = this.m_1950();
      if (var1 != this.f_4613) {
         this.m_1952();
         this.f_4611.clear();
         this.f_4613 = var1;
         this.m_1978();
         this.f_4631 = 0.0F;
         if (var1 != null) {
            for (Setting var3 : var1.m_9621()) {
               if (var3 instanceof CheckboxSetting var4) {
                  this.f_4611.add(new Class_hSt5uZDKU4Jry0hN(var4));
               } else if (var3 instanceof ColorSetting var5) {
                  this.f_4611.add(new Class_afTyQIoehSrCObZi(var5));
               } else if (var3 instanceof SliderSetting var6) {
                  this.f_4611.add(new Class_aYLlnnpGIkgjpBzZ(var6));
               } else if (var3 instanceof MultiChoiceSetting var7) {
                  this.f_4611.add(new Class_tC5Oe0Pn191pu0bo(var7));
               }
            }
         }
      }
   }

   private void m_1975(float var1, float var2, float var3, int var4) {
      float var5 = f_4681 * (1.0F - 2.0F * var3);
      this.m_1935(var1 - f_4682, var2 - var5, var1, var2 + var5, var4);
      this.m_1935(var1, var2 + var5, var1 + f_4683, var2 - var5, var4);
   }

   private void m_1976() {
      this.f_4624 = false;
      this.f_4625 = 0.0F;
      this.f_4626 = 0.0F;
      this.f_4627 = 0L;
   }

   public boolean m_1977(double var1, double var3, int var5) {
      this.m_1971((float)var1, (float)var3, var5);
      if (var5 == 0) {
         this.f_4636 = false;
      }

      if (!this.m_1957()) {
         return false;
      } else if (var5 == 1 && this.f_4624) {
         this.f_4624 = false;
         this.f_4627 = System.nanoTime();
         return true;
      } else {
         return this.m_1947((float)var1, (float)var3);
      }
   }

   private void m_1978() {
      this.f_4629 = 0.0F;
      this.f_4630 = 0.0F;
      this.f_4610.m_9281(0.0F);
   }

   private static final class Class_00db39ZjqTTKMAQA extends ItemEntity {
      public Class_00db39ZjqTTKMAQA(Level var1, ItemStack var2) {
         super(var1, 0.0, 0.0, 0.0, var2);
      }
   }

   public enum UUDjQj7ygMV3aEAv {
      SELF("Себя"),
      FRIENDS("Друзей"),
      PLAYERS("Игроков");

      public final String f_4590;

      UUDjQj7ygMV3aEAv(String var3) {
         this.f_4590 = var3;
      }
   }

   private enum sdhCix01CMbbZmRw {
      PLAYERS("Игроки", "Player763", 94),
      MOBS("Мобы", "Зомби", 94),
      VILLAGERS("Жители", "Житель", 80),
      ITEMS("Предметы", "Эндер-жемчуг ×16", 80);

      public final String f_4591;
      public final String f_4592;
      public final int f_4593;

      sdhCix01CMbbZmRw(String var3, String var4, int var5) {
         this.f_4591 = var3;
         this.f_4592 = var4;
         this.f_4593 = var5;
      }
   }
}
