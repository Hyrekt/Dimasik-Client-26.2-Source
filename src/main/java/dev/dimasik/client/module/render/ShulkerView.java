package dev.dimasik.client.module.render;

import com.mojang.blaze3d.textures.FilterMode;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import java.util.List;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.ItemContainerContents;
import net.minecraft.world.level.block.ShulkerBoxBlock;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector4f;

public final class ShulkerView extends Module {
   private static final Identifier f_35523 = Class_wHRRCm2tlLY7DN4I.m_9311(ShulkerView.f_35558);
   private static final Vector4f f_35524 = new Vector4f(0.0F, 0.0F, ShulkerView.f_35559, ShulkerView.f_35560);
   private static final int f_35525 = 175;
   private static final int f_35526 = 70;
   private static final int f_35527 = 27;
   private static ShulkerView f_35528;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_35529 = this::m_9688;
   private static final String f_35530 = "ShulkerView";
   private static final String f_35531 = "Показывает содержимое шалкеров в инвентаре и на земле";
   private static final float f_35532 = 8.0F;
   private static final float f_35533 = 16.0F;
   private static final float f_35534 = 175.0F;
   private static final float f_35535 = 8.0F;
   private static final float f_35536 = 175.0F;
   private static final float f_35537 = 70.0F;
   private static final float f_35538 = 0.5F;
   private static final double f_35539 = 64.0;
   private static final double f_35540 = 0.5;
   private static final float f_35541 = 175.0F;
   private static final float f_35542 = 0.5F;
   private static final float f_35543 = 70.0F;
   private static final float f_35544 = 175.0F;
   private static final float f_35545 = 70.0F;
   private static final float f_35546 = 10.0F;
   private static final float f_35547 = 18.0F;
   private static final float f_35548 = 10.0F;
   private static final float f_35549 = 18.0F;
   private static final float f_35550 = 0.75F;
   private static final float f_35551 = 10.0F;
   private static final float f_35552 = 18.0F;
   private static final float f_35553 = 10.0F;
   private static final float f_35554 = 18.0F;
   private static final float f_35555 = 0.75F;
   private static final float f_35556 = 0.75F;
   private static final double f_35557 = 255.0;
   private static final String f_35558 = "shulker/3x9";
   private static final float f_35559 = 0.68359375F;
   private static final float f_35560 = 0.2734375F;

   public ShulkerView() {
      super(f_35530, f_35531, Category.RENDER);
      f_35528 = this;
   }

   private void m_9688(Class_bhRaN0YSSLQRYjPo var1) {
      if (var1.m_6083() != null && f_11537.level != null && f_11537.player != null && f_11537.gui.screen() == null) {
         float var2 = f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true);
         float var3 = f_35538 * f_11537.getWindow().getGuiScale();

         for (ItemEntity var5 : f_11537.level.getEntitiesOfClass(ItemEntity.class, f_11537.player.getBoundingBox().inflate(f_35539), var0 -> true)) {
            ItemStack var6 = var5.getItem();
            if (m_9691(var6)) {
               ItemContainerContents var7 = (ItemContainerContents)var6.get(DataComponents.CONTAINER);
               if (var7 != null) {
                  List var8 = var7.allItemsCopyStream().toList();
                  if (!var8.isEmpty()) {
                     Vec3 var9 = new Vec3(var5.xo, var5.yo, var5.zo).lerp(var5.position(), var2).add(0.0, f_35540, 0.0);
                     Vector2f var10 = Class_FvJXUGWpZo3zYBW4.m_2690(var9);
                     if (var10 != null) {
                        float var11 = var10.x - f_35541 * var3 * f_35542;
                        float var12 = var10.y - f_35543 * var3;
                        this.m_9696(var1.m_6083(), var6, var8, var11, var12, var3, false);
                     }
                  }
               }
            }
         }
      }
   }

   private ItemStack m_9689(Slot var1) {
      if (var1 != null && var1.hasItem()) {
         return var1.getItem();
      }

      if (f_11537.player == null) {
         return ItemStack.EMPTY;
      }

      ItemStack var2 = f_11537.player.containerMenu.getCarried();
      return var2.isEmpty() ? ItemStack.EMPTY : var2;
   }

   private static int m_9690(ItemStack var0) {
      if (var0.getItem() instanceof BlockItem var1) {
         int var3 = var1.getBlock().defaultMapColor().col;
         return Class_BftdentXEtGbugJw.m_2303(var3 >> 16 & 0xFF, var3 >> 8 & 0xFF, var3 & 0xFF, f_35557);
      } else {
         return Class_BftdentXEtGbugJw.m_2310(152, 106, 155);
      }
   }

   private static boolean m_9691(ItemStack var0) {
      return var0 != null && !var0.isEmpty() && var0.getItem() instanceof BlockItem var1 && var1.getBlock() instanceof ShulkerBoxBlock;
   }

   private void m_9693(GuiGraphicsExtractor var1, Slot var2, int var3, int var4) {
      ItemStack var5 = this.m_9689(var2);
      if (m_9691(var5)) {
         ItemContainerContents var6 = (ItemContainerContents)var5.get(DataComponents.CONTAINER);
         if (var6 != null) {
            float var7 = var3 + f_35532;
            float var8 = var4 - 70 - f_35533;
            float var9 = f_11537.getWindow().getGuiScaledWidth();
            float var10 = f_11537.getWindow().getGuiScaledHeight();
            if (var7 + f_35534 > var9) {
               var7 = var3 - 175 - f_35535;
            }

            var7 = Math.clamp(var7, 0.0F, Math.max(0.0F, var9 - f_35536));
            var8 = Math.clamp(var8, 0.0F, Math.max(0.0F, var10 - f_35537));
            this.m_9694(var1, var5, var6.allItemsCopyStream().toList(), var7, var8);
         }
      }
   }

   private void m_9694(GuiGraphicsExtractor var1, ItemStack var2, List<ItemStack> var3, float var4, float var5) {
      var1.nextStratum();
      var1.pose().pushMatrix();
      var1.pose().translate(var4, var5);
      var1.blit(RenderPipelines.GUI_TEXTURED, f_35523, 0, 0, 0.0F, 0.0F, 175, 70, 256, 256, m_9690(var2));

      for (int var6 = 0; var6 < Math.min(var3.size(), 27); var6++) {
         ItemStack var7 = (ItemStack)var3.get(var6);
         if (var7 != null && !var7.isEmpty()) {
            float var8 = f_35551 + var6 % 9 * f_35552;
            float var9 = f_35553 + var6 / 9 * f_35554;
            var1.pose().pushMatrix();
            var1.pose().translate(var8, var9);
            var1.pose().scale(f_35555, f_35556);
            var1.item(var7, 0, 0);
            var1.itemDecorations(f_11537.font, var7, 0, 0);
            var1.pose().popMatrix();
         }
      }

      var1.pose().popMatrix();
   }

   public static void m_9695(GuiGraphicsExtractor var0, Slot var1, int var2, int var3) {
      if (f_35528 != null && f_35528.m_776()) {
         f_35528.m_9693(var0, var1, var2, var3);
      }
   }

   private void m_9696(GuiGraphicsExtractor var1, ItemStack var2, List<ItemStack> var3, float var4, float var5, float var6, boolean var7) {
      Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
      Class_Ssh31B3ljfKeWsvS.m_4829(var4, var5, f_35544 * var6, f_35545 * var6, 0.0F, f_35524, m_9690(var2), f_35523, FilterMode.NEAREST);

      for (int var8 = 0; var8 < Math.min(var3.size(), 27); var8++) {
         ItemStack var9 = (ItemStack)var3.get(var8);
         if (var9 != null && !var9.isEmpty()) {
            float var10 = var4 + (f_35546 + var8 % 9 * f_35547) * var6;
            float var11 = var5 + (f_35548 + var8 / 9 * f_35549) * var6;
            Class_Ssh31B3ljfKeWsvS.m_4832(var1, var9, var10, var11, f_35550 * var6, var7);
         }
      }
   }
}
