package dev.dimasik.mixin;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.autobuy.AutoBuy;
import dev.dimasik.client.module.misc.AhHelper;
import dev.dimasik.client.module.misc.AutoJoiner;
import dev.dimasik.client.module.misc.EcExploit;
import dev.dimasik.client.module.render.ShulkerView;
import dev.dimasik.client.system.Class_fFSER1OTAD5huhkq;
import dev.dimasik.client.system.Class_zFd1aKtwR3Hz00EA;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.inventory.HopperMenu;
import net.minecraft.world.inventory.ShulkerBoxMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractContainerScreen.class)
public abstract class AbstractContainerScreenMixin extends Screen {
   @Shadow
   protected int leftPos;
   @Shadow
   protected int topPos;
   @Shadow
   protected int imageWidth;
   @Shadow
   @Final
   protected int imageHeight;
   @Shadow
   protected Slot hoveredSlot;
   @Unique
   private Button takeAllButton;
   @Unique
   private Button putAllButton;
   @Unique
   private Button throwAllButton;
   @Unique
   private Button autoBuyButton;
   @Unique
   private Button autoJoinerStopButton;
   @Unique
   private long lastHoveredDropAt;
   private static final String f_36624 = "Взять";
   private static final String f_36625 = "Сложить";
   private static final String f_36626 = "Выбросить";
   private static final String f_36627 = "Остановить AutoJoiner";
   private static final String f_36628 = "Авто-бай: ВКЛ";
   private static final String f_36629 = "Авто-бай: ВЫКЛ";
   private static final String f_36630 = "Авто-бай: ВКЛ";
   private static final String f_36631 = "Авто-бай: ВЫКЛ";
   private static final long f_36632 = 50L;
   private static final int f_36633 = 1883756543;

   @Shadow
   protected abstract void slotClicked(Slot var1, int var2, int var3, ContainerInput var4);

   protected AbstractContainerScreenMixin(Component var1) {
      super(var1);
   }

   @Unique
   private AbstractContainerMenu handler() {
      return ((AbstractContainerScreen)(Object)this).getMenu();
   }

   @Inject(method = "init", at = @At("TAIL"))
   private void addContainerButtons(CallbackInfo var1) {
      if (!this.isStorageContainer()) {
         byte var2 = 80;
         byte var3 = 20;
         byte var4 = 2;
         int var5 = this.leftPos + this.imageWidth + 4;
         int var6 = this.topPos;
         this.takeAllButton = Button.builder(Component.literal(f_36624), var1x -> this.actOnRange(0, this.getContainerSlotCount(), ContainerInput.QUICK_MOVE))
            .bounds(var5, var6, var2, var3)
            .build();
         this.putAllButton = Button.builder(
               Component.literal(f_36625), var1x -> this.actOnRange(this.getContainerSlotCount(), this.handler().slots.size(), ContainerInput.QUICK_MOVE)
            )
            .bounds(var5, var6 + var3 + var4, var2, var3)
            .build();
         this.throwAllButton = Button.builder(Component.literal(f_36626), var1x -> this.actOnRange(0, this.getContainerSlotCount(), ContainerInput.THROW))
            .bounds(var5, var6 + (var3 + var4) * 2, var2, var3)
            .build();
         this.addRenderableWidget(this.takeAllButton);
         this.addRenderableWidget(this.putAllButton);
         this.addRenderableWidget(this.throwAllButton);
         this.autoJoinerStopButton = Button.builder(Component.literal(f_36627), var1x -> {
            AutoJoiner var2x = DimasikClient.m_9057().m_9049().m_2801().m_3451();
            if (var2x.m_8816((AbstractContainerScreen<?>)(Object)this)) {
               var2x.m_777();
               this.minecraft.player.closeContainer();
            }
         }).bounds(this.leftPos + (this.imageWidth - 154) / 2, Math.max(4, Math.min(this.height - 24, this.topPos + this.imageHeight + 4)), 154, 20).build();
         boolean var7 = DimasikClient.m_9057().m_9049().m_2801().m_3451().m_8816((AbstractContainerScreen<?>)(Object)this);
         this.autoJoinerStopButton.visible = this.autoJoinerStopButton.active = var7;
         this.addRenderableWidget(this.autoJoinerStopButton);
         if (Class_fFSER1OTAD5huhkq.m_6468(this.title.getString())) {
            AutoBuy var8 = DimasikClient.m_9057().m_9049().m_2801().m_3503();
            int var9 = this.leftPos - var2 - 4;
            this.autoBuyButton = Button.builder(Component.literal(var8.m_3942() ? f_36628 : f_36629), var1x -> {
               if (var8.m_3942()) {
                  var8.m_3941(false);
               } else {
                  if (!var8.m_776()) {
                     var8.m_792();
                  }

                  var8.m_3941(true);
               }
            }).bounds(var9, var6, var2, var3).build();
            this.addRenderableWidget(this.autoBuyButton);
         }
      }
   }

   @Inject(method = "extractRenderState", at = @At("HEAD"))
   private void updateButtonStates(GuiGraphicsExtractor var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (!this.isStorageContainer()) {
         boolean var6 = DimasikClient.m_9057().m_9049().m_2801().m_3451().m_8816((AbstractContainerScreen<?>)(Object)this);
         if (this.autoJoinerStopButton != null) {
            this.autoJoinerStopButton.visible = this.autoJoinerStopButton.active = var6;
         }

         if (this.takeAllButton != null) {
            this.takeAllButton.visible = !var6;
         }

         if (this.putAllButton != null) {
            this.putAllButton.visible = !var6;
         }

         if (this.throwAllButton != null) {
            this.throwAllButton.visible = !var6;
         }

         if (this.takeAllButton != null) {
            this.takeAllButton.active = !var6 && this.hasItems(0, this.getContainerSlotCount());
         }

         if (this.putAllButton != null) {
            this.putAllButton.active = !var6 && this.hasItems(this.getContainerSlotCount(), this.handler().slots.size());
         }

         if (this.throwAllButton != null) {
            this.throwAllButton.active = !var6 && this.hasItems(0, this.getContainerSlotCount());
         }

         if (this.autoBuyButton != null) {
            AutoBuy var7 = DimasikClient.m_9057().m_9049().m_2801().m_3503();
            this.autoBuyButton.setMessage(Component.literal(var7.m_3942() ? f_36630 : f_36631));
         }
      }
   }

   @Inject(method = "extractContents(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", at = @At("HEAD"))
   private void handleHoveredSlot(GuiGraphicsExtractor var1, int var2, int var3, float var4, CallbackInfo var5) {
      AbstractContainerScreen var6 = (AbstractContainerScreen)(Object)this;
      Slot var7 = var6.getHoveredSlot(var2, var3);
      if (!this.dropHoveredStack(var6, var7)) {
         Class_zFd1aKtwR3Hz00EA var8 = new Class_zFd1aKtwR3Hz00EA(var6, var7, () -> {
            if (var7 != null) {
               this.slotClicked(var7, var7.index, 1, ContainerInput.QUICK_MOVE);
            }
         });
         DimasikClient.m_9057().m_9051().m_9708(var8);
      }
   }

   @Unique
   private boolean dropHoveredStack(AbstractContainerScreen<?> var1, Slot var2) {
      if (this.minecraft != null
         && this.minecraft.player != null
         && this.minecraft.gameMode != null
         && this.minecraft.gui.screen() == var1
         && this.minecraft.isWindowActive()) {
         long var3 = this.minecraft.getWindow().handle();
         boolean var5 = GLFW.glfwGetKey(var3, 341) == 1 || GLFW.glfwGetKey(var3, 345) == 1;
         boolean var6 = GLFW.glfwGetKey(var3, 340) == 1 || GLFW.glfwGetKey(var3, 344) == 1;
         if (var5 && !var6 && GLFW.glfwGetKey(var3, 81) == 1) {
            if (var2 != null && var2.isActive() && var2.hasItem() && this.handler().getCarried().isEmpty()) {
               long var7 = System.currentTimeMillis();
               if (var7 - this.lastHoveredDropAt >= f_36632) {
                  this.slotClicked(var2, var2.index, 1, ContainerInput.THROW);
                  this.lastHoveredDropAt = var7;
               }
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Inject(method = "extractRenderState", at = @At("TAIL"))
   private void renderAuctionHighlights(GuiGraphicsExtractor var1, int var2, int var3, float var4, CallbackInfo var5) {
      for (Slot var7 : this.handler().slots) {
         if (AhHelper.m_5594(var7.index)) {
            var1.fill(this.leftPos + var7.x - 1, this.topPos + var7.y - 1, this.leftPos + var7.x + 17, this.topPos + var7.y + 17, f_36633);
         }
      }

      if (!((Object)this instanceof InventoryScreen)) {
         ShulkerView.m_9695(var1, ((AbstractContainerScreen)(Object)this).getHoveredSlot(var2, var3), var2, var3);
      }
   }

   @Inject(method = "keyPressed", at = @At("HEAD"), cancellable = true)
   private void onKeyPressed(KeyEvent var1, CallbackInfoReturnable<Boolean> var2) {
      int var3 = var1.modifiers();
      boolean var4 = (var3 & 2) != 0;
      boolean var5 = (var3 & 1) != 0;
      if (var1.key() == 81 && var4 && var5) {
         this.dropAllSimilarItems();
         var2.setReturnValue(true);
      }
   }

   @Inject(method = "onClose", at = @At("HEAD"), cancellable = true)
   private void hideEnderChestClientSide(CallbackInfo var1) {
      if (DimasikClient.m_9057().m_9049().m_2801().m_3451().m_8816((AbstractContainerScreen<?>)(Object)this)) {
         var1.cancel();
      } else {
         EcExploit var2 = DimasikClient.m_9057().m_9049().m_2801().m_3461();
         if (var2.m_7384((AbstractContainerScreen<?>)(Object)this)) {
            this.minecraft.gui.setScreen(null);
            var1.cancel();
         }
      }
   }

   @Unique
   private boolean isStorageContainer() {
      AbstractContainerMenu var1 = this.handler();
      return !(var1 instanceof ChestMenu) && !(var1 instanceof ShulkerBoxMenu) && !(var1 instanceof HopperMenu);
   }

   @Unique
   private int getContainerSlotCount() {
      AbstractContainerMenu var1 = this.handler();
      if (var1 instanceof ChestMenu var2) {
         return var2.getRowCount() * 9;
      } else if (var1 instanceof ShulkerBoxMenu) {
         return 27;
      } else {
         return var1 instanceof HopperMenu ? 5 : 0;
      }
   }

   @Unique
   private boolean hasItems(int var1, int var2) {
      for (int var3 = var1; var3 < var2; var3++) {
         if (((Slot)this.handler().slots.get(var3)).hasItem()) {
            return true;
         }
      }

      return false;
   }

   @Unique
   private void actOnRange(int var1, int var2, ContainerInput var3) {
      AbstractContainerMenu var4 = this.handler();

      for (int var5 = var1; var5 < var2; var5++) {
         Slot var6 = (Slot)var4.slots.get(var5);
         if (var6.hasItem()) {
            this.slotClicked(var6, var6.index, var3 == ContainerInput.THROW ? 1 : 0, var3);
         }
      }
   }

   @Unique
   private void dropAllSimilarItems() {
      if (this.hoveredSlot != null && this.hoveredSlot.hasItem()) {
         ItemStack var1 = this.hoveredSlot.getItem().copy();

         for (Slot var3 : this.handler().slots) {
            if (var3.hasItem() && var3.getItem().getItem().equals(var1.getItem())) {
               this.slotClicked(var3, var3.index, 1, ContainerInput.THROW);
            }
         }
      }
   }
}
