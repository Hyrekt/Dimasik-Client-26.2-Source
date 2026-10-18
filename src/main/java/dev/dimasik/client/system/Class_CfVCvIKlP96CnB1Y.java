package dev.dimasik.client.system;

import lombok.Generated;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;

public class Class_CfVCvIKlP96CnB1Y extends Class_6u9LYKHM0SeJMktw implements Class_W36DTOFJFiIifzGK {
   private BlockState f_6286;
   private BlockPos f_6287;
   private Class_CfVCvIKlP96CnB1Y.Class_7LDFCrX8BWsvELV3 f_6288;
   private Direction f_6289;

   @Generated
   public Direction m_2424() {
      return this.f_6289;
   }

   @Generated
   public Class_CfVCvIKlP96CnB1Y.Class_7LDFCrX8BWsvELV3 m_2425() {
      return this.f_6288;
   }

   @Generated
   public BlockPos m_2426() {
      return this.f_6287;
   }

   @Generated
   public void m_2427(Direction var1) {
      this.f_6289 = var1;
   }

   @Generated
   public void m_2428(BlockState var1) {
      this.f_6286 = var1;
   }

   @Generated
   public void m_2429(Class_CfVCvIKlP96CnB1Y.Class_7LDFCrX8BWsvELV3 var1) {
      this.f_6288 = var1;
   }

   @Generated
   public Class_CfVCvIKlP96CnB1Y(BlockState var1, BlockPos var2, Class_CfVCvIKlP96CnB1Y.Class_7LDFCrX8BWsvELV3 var3, Direction var4) {
      this.f_6286 = var1;
      this.f_6287 = var2;
      this.f_6288 = var3;
      this.f_6289 = var4;
   }

   @Generated
   public BlockState m_2430() {
      return this.f_6286;
   }

   @Generated
   public void m_2431(BlockPos var1) {
      this.f_6287 = var1;
   }

   public enum Class_7LDFCrX8BWsvELV3 {
      START,
      STOP;
   }
}
