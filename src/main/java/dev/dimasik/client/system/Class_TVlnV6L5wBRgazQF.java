package dev.dimasik.client.system;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.AudioFormat.Encoding;

public final class Class_TVlnV6L5wBRgazQF {
   private static final String f_13998 = "/assets/dimasik/sounds/";
   private static final String f_13999 = ".wav";
   private static final int f_14000 = 4096;
   private static final int f_14001 = 16;
   private final String f_14002;
   private byte[] f_14003;
   private boolean f_14004;

   private AudioInputStream m_4997(AudioInputStream var1) {
      AudioFormat var2 = var1.getFormat();
      if (var2.getEncoding() == Encoding.PCM_SIGNED && var2.getSampleSizeInBits() == 16 && !var2.isBigEndian()) {
         return var1;
      }

      int var3 = var2.getChannels();
      AudioFormat var4 = new AudioFormat(Encoding.PCM_SIGNED, var2.getSampleRate(), 16, var3, var3 * 16 / 8, var2.getSampleRate(), false);
      return AudioSystem.getAudioInputStream(var4, var1);
   }

   private void m_4998(AudioInputStream var1, float var2) throws LineUnavailableException, IOException {
      AudioFormat var3 = var1.getFormat();

      try (SourceDataLine var4 = AudioSystem.getSourceDataLine(var3)) {
         var4.open(var3);
         var4.start();
         byte[] var5 = new byte[4096];

         int var6;
         while ((var6 = var1.read(var5)) > 0) {
            this.m_5000(var5, var6, var3, var2);
            var4.write(var5, 0, var6);
         }

         var4.drain();
         var4.stop();
      }
   }

   public boolean m_4999() {
      return this.f_14004;
   }

   public Class_TVlnV6L5wBRgazQF(String var1) {
      this.f_14002 = var1;
   }

   private void m_5000(byte[] var1, int var2, AudioFormat var3, float var4) {
      if (var4 != 1.0F) {
         if (var3.getSampleSizeInBits() == 16 && !var3.isBigEndian()) {
            for (int var5 = 0; var5 + 1 < var2; var5 += 2) {
               short var6 = (short)(var1[var5] & 0xFF | var1[var5 + 1] << 8);
               int var7 = Math.clamp(Math.round(var6 * var4), -32768, 32767);
               var1[var5] = (byte)var7;
               var1[var5 + 1] = (byte)(var7 >> 8);
            }
         }
      }
   }

   private synchronized byte[] m_5001() {
      if (this.f_14003 == null && !this.f_14004) {
         try (InputStream var1 = Class_TVlnV6L5wBRgazQF.class.getResourceAsStream(this.f_14002 + "")) {
            if (var1 == null) {
               this.f_14004 = true;
               return null;
            }

            this.f_14003 = var1.readAllBytes();
         } catch (IOException var6) {
            this.f_14004 = true;
         }

         return this.f_14003;
      } else {
         return this.f_14003;
      }
   }

   public void m_5002(float var1) {
      byte[] var2 = this.m_5001();
      if (var2 != null) {
         try (
            AudioInputStream var3 = AudioSystem.getAudioInputStream(new ByteArrayInputStream(var2));
            AudioInputStream var4 = this.m_4997(var3);
         ) {
            this.m_4998(var4, var1);
         } catch (UnsupportedAudioFileException | LineUnavailableException | IOException | IllegalArgumentException var11) {
            this.f_14004 = true;
         }
      }
   }

   public String m_5003() {
      return this.f_14002;
   }
}
