package dev.dimasik.client.system;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import lombok.Generated;
import net.minecraft.network.protocol.game.ServerboundSetCarriedItemPacket;
import org.joml.Vector2f;

public class Class_7jZuvbaEmktaDNZV extends Class_4DhobBIM8lTNckKj {
   private final Queue<String> f_3809 = new ConcurrentLinkedQueue<>();
   private int f_3810 = 0;
   private final Vector2f f_3811 = new Vector2f();
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_3812 = this::m_1748;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_3813 = this::m_1749;

   public void m_1748(Class_Xu9btcIeUN33XnMK var1) {
      Class_hSBVBKos4AGYjXlc.m_7169();
      this.f_3811.y = this.f_3811.x;
      this.f_3811.x = f_11537.player.getXRot();
      this.f_3810++;

      String var2;
      while ((var2 = this.f_3809.poll()) != null) {
         Class_ftHu9o3WzCU3Adxm.m_6731(var2);
      }
   }

   public void m_1749(Class_XzpX8S5F5zd9jbuE var1) {
      if (var1.m_5619() instanceof ServerboundSetCarriedItemPacket var2) {
         Class_B6vpBUNmRtH3JzmV.m_2123(var2.getSlot());
      }
   }

   @Generated
   public int m_1750() {
      return this.f_3810;
   }

   @Generated
   public Vector2f m_1751() {
      return this.f_3811;
   }

   @Generated
   public Queue<String> m_1752() {
      return this.f_3809;
   }
}
