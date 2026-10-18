package dev.dimasik.client.system;

import de.maxhenkel.voicechat.api.VoicechatApi;
import de.maxhenkel.voicechat.api.VoicechatPlugin;
import de.maxhenkel.voicechat.api.events.ClientSoundEvent;
import de.maxhenkel.voicechat.api.events.ClientVoicechatConnectionEvent;
import de.maxhenkel.voicechat.api.events.EventRegistration;
import de.maxhenkel.voicechat.api.events.MergeClientSoundEvent;
import de.maxhenkel.voicechat.api.events.VoicechatDisableEvent;

public final class Class_A5DvREpOe2CmtAEr implements VoicechatPlugin {
   private static final String f_5087 = "dimasik";

   private static void onClientSound(ClientSoundEvent var0) {
      short[] var1 = Class_hSBVBKos4AGYjXlc.m_7166();
      if (var1 != null) {
         var0.setRawAudio(var1);
      }
   }

   private static void onConnection(ClientVoicechatConnectionEvent var0) {
      Class_NPndoKXjCINbafql.m_4021(var0.isConnected());
      Class_NPndoKXjCINbafql.m_4017(var0.isConnected() && var0.getVoicechat().isDisabled());
      if (!var0.isConnected()) {
         Class_hSBVBKos4AGYjXlc.m_7164();
      }
   }

   private static void onDisabled(VoicechatDisableEvent var0) {
      Class_NPndoKXjCINbafql.m_4017(var0.isDisabled());
      if (var0.isDisabled()) {
         Class_hSBVBKos4AGYjXlc.m_7164();
      }
   }

   private static void onMergeClientSound(MergeClientSoundEvent var0) {
      if (Class_hSBVBKos4AGYjXlc.m_7159()) {
         if (var0.getVoicechat().isDisconnected()) {
            Class_NPndoKXjCINbafql.m_4021(false);
            Class_hSBVBKos4AGYjXlc.m_7164();
         } else if (var0.getVoicechat().isDisabled()) {
            Class_NPndoKXjCINbafql.m_4017(true);
            Class_hSBVBKos4AGYjXlc.m_7164();
         } else {
            Class_NPndoKXjCINbafql.m_4021(true);
            Class_NPndoKXjCINbafql.m_4017(false);
            short[] var1 = Class_hSBVBKos4AGYjXlc.m_7163(960);
            if (var1 != null) {
               var0.mergeAudio(var1);
            }
         }
      }
   }

   public String getPluginId() {
      return f_5087;
   }

   public void initialize(VoicechatApi var1) {
      Class_NPndoKXjCINbafql.m_4016(true);
   }

   public void registerEvents(EventRegistration var1) {
      var1.registerEvent(MergeClientSoundEvent.class, Class_A5DvREpOe2CmtAEr::onMergeClientSound);
      var1.registerEvent(ClientSoundEvent.class, Class_A5DvREpOe2CmtAEr::onClientSound);
      var1.registerEvent(ClientVoicechatConnectionEvent.class, Class_A5DvREpOe2CmtAEr::onConnection);
      var1.registerEvent(VoicechatDisableEvent.class, Class_A5DvREpOe2CmtAEr::onDisabled);
   }
}
