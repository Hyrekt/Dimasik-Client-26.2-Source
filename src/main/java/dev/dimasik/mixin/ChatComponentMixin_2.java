package dev.dimasik.mixin;

import java.util.List;
import net.minecraft.client.gui.components.ChatComponent;
import net.minecraft.client.multiplayer.chat.GuiMessage;
import net.minecraft.client.multiplayer.chat.GuiMessage.Line;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(ChatComponent.class)
public interface ChatComponentMixin_2 {
   @Accessor("trimmedMessages")
   List<Line> getVisibleMessages();

   @Accessor("allMessages")
   List<GuiMessage> getMessages();

   @Accessor("chatScrollbarPos")
   int getScrolledLines();

   @Invoker("getLineHeight")
   int invokeGetLineHeight();

   @Invoker("getScale")
   double invokeGetChatScale();

   @Invoker("getWidth")
   int invokeGetWidth();

   @Invoker("getHeight")
   int invokeGetHeight();

   @Invoker("refreshTrimmedMessages")
   void invokeRefreshTrimmedMessages();
}
