package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.LootTracker;
import dev.dimasik.client.setting.impl.SliderSetting;
import java.util.Locale;
import lombok.Generated;
import net.minecraft.client.gui.screens.ChatScreen;

public class Class_h9gmP6jZeiKETGdh extends Class_NO6SuGqq3FB7jQDZ implements Class_OJntZb8PWlU5XrDj {
   private final SliderSetting f_23228;
   private final Class_u8iL1f1cFf6CucWB f_23229;
   private boolean f_23230;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_23231 = this::m_7123;
   private static final String f_23232 = "LootTracker";
   private static final String f_23233 = "LootTracker";
   private static final String f_23234 = "Размер";
   private static final String f_23235 = "%.2fx";

   @Override
   public void m_1333() {
      this.f_23229.m_9093();
   }

   @Override
   public float m_1757() {
      return this.m_4009();
   }

   @Override
   public boolean m_1340(float var1, float var2, int var3) {
      if (!this.m_7122()) {
         return false;
      } else if (var3 == 1
         && this.m_1757() > 0.0F
         && this.m_1758() > 0.0F
         && Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.m_3998(), this.m_3993(), this.m_1757(), this.m_1758())) {
         this.f_23229.m_9060(var1, var2);
         return true;
      } else {
         return this.f_23229.m_9070(var1, var2, var3);
      }
   }

   public Class_h9gmP6jZeiKETGdh(SliderSetting var1) {
      super(f_23232, 0.0F, 0.0F, 0.0F, 0.0F);
      this.f_23228 = var1;
      this.f_23229 = new Class_u8iL1f1cFf6CucWB(f_23233, f_23234, var1, var0 -> String.format(Locale.US, f_23235, var0));
   }

   public boolean m_7119() {
      return this.f_23230 && (this.f_11518 != 0.0F || this.f_11519 != 0.0F);
   }

   @Generated
   public SliderSetting m_7120() {
      return this.f_23228;
   }

   @Generated
   public Class_u8iL1f1cFf6CucWB m_7121() {
      return this.f_23229;
   }

   private boolean m_7122() {
      try {
         LootTracker var1 = DimasikClient.m_9057().m_9049().m_2801().m_3524();
         return var1 != null && var1.m_776();
      } catch (Throwable var2) {
         return false;
      }
   }

   private void m_7123(Class_bhRaN0YSSLQRYjPo var1) {
      if (!(f_11537.gui.screen() instanceof ChatScreen) || !this.m_7122()) {
         this.f_23229.m_9093();
      }
   }

   @Override
   public void m_3992() {
      this.f_23229.m_9082();
   }

   public void m_7124(float var1, float var2, float var3, float var4) {
      if (!this.f_23230 && this.f_11518 == 0.0F && this.f_11519 == 0.0F) {
         this.f_11518 = var1;
         this.f_11519 = var2;
         this.f_23230 = true;
      }

      if (var3 > 0.0F && var4 > 0.0F) {
         this.m_4012(var3);
         this.m_4007(var4);
      } else if (!(f_11537.gui.screen() instanceof ChatScreen)) {
         this.m_4012(0.0F);
         this.m_4007(0.0F);
      }
   }

   @Override
   public float m_1758() {
      return this.m_4010();
   }
}
