package dev.dimasik.client.system;

import com.viaversion.viafabricplus.ViaFabricPlus;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import dev.dimasik.client.DimasikClient;
import lombok.Generated;

public final class Class_WCOf2iYDUGCRyVGl {
   private static final String f_15484 = "This is a utility class and cannot be instantiated";

   @Generated
   private Class_WCOf2iYDUGCRyVGl() {
      throw new UnsupportedOperationException(f_15484);
   }

   public static ProtocolVersion m_5424() {
      return DimasikClient.m_9057().m_9049().m_2806().m_4507() ? ViaFabricPlus.getImpl().getTargetVersion() : null;
   }
}
