package dev.dimasik.mixin;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.suggestion.Suggestions;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.system.Class_HKVFPtZz5yGHYty6;
import java.util.concurrent.CompletableFuture;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.CommandSuggestions;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.CommandSuggestions.SuggestionsList;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CommandSuggestions.class)
public class CommandSuggestionsMixin {
   @Final
   @Shadow
   public EditBox input;
   @Final
   @Shadow
   public Minecraft minecraft;
   @Final
   @Shadow
   private boolean onlyShowIfCursorPastError;
   @Shadow
   public boolean keepSuggestions;
   @Shadow
   private @Nullable ParseResults<ClientSuggestionProvider> currentParse;
   @Shadow
   private @Nullable CompletableFuture<Suggestions> pendingSuggestions;
   @Shadow
   private SuggestionsList/* @Nullable */ suggestions;

   @Inject(method = "updateCommandInfo", at = @At(value = "INVOKE", target = "Lcom/mojang/brigadier/StringReader;canRead()Z", shift = Shift.AFTER))
   private void refresh(CallbackInfo var1) {
      String var2 = this.input.getValue();
      StringReader var3 = new StringReader(var2);
      boolean var4 = var3.canRead() && var3.peek() == DimasikClient.m_9057().m_9049().m_2809().m_6132() && !Class_HKVFPtZz5yGHYty6.m_2883();
      int var5 = this.input.getCursorPosition();
      if (var4) {
         var3.skip();
         CommandDispatcher var6 = DimasikClient.m_9057().m_9049().m_2809().m_6135();
         this.currentParse = var6.parse(var3, this.minecraft.player.connection.getSuggestionsProvider());
         int var7 = this.onlyShowIfCursorPastError ? var3.getCursor() : 1;
         if (var5 >= var7 && (this.suggestions == null || !this.keepSuggestions)) {
            this.pendingSuggestions = var6.getCompletionSuggestions(this.currentParse, var5);
            CompletableFuture var8 = this.pendingSuggestions;
            String var9 = var2;
            int var10 = var5;
            var8.thenRun(() -> this.minecraft.execute(() -> {
               if (this.input.getValue().equals(var9) && this.input.getCursorPosition() == var10) {
                  this.pendingSuggestions = var8;
                  ((CommandSuggestions)(Object)this).updateUsageInfo(this.currentParse, (Suggestions)var8.join());
               }
            }));
         }
      }
   }
}
