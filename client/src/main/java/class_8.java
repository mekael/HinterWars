import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.Vector;

// $VF: renamed from: aP
public class class_8 {
   // $VF: renamed from: a int[]
   private int[] field_102;
   // $VF: renamed from: b int[]
   private int[] field_103;
   // $VF: renamed from: c java.util.Vector
   private Vector field_104;
   // $VF: renamed from: d int
   private int field_105;
   // $VF: renamed from: e int[]
   private int[] field_106;
   // $VF: renamed from: f byte
   private final byte field_107 = 0;
   // $VF: renamed from: g byte
   private final byte field_108 = 1;
   // $VF: renamed from: h int
   private int field_109;
   // $VF: renamed from: i int
   private int field_110;
   // $VF: renamed from: j int
   private int field_111;
   // $VF: renamed from: k boolean
   private boolean field_112;

   public class_8(int[] var1, int[] var2, Vector var3) {
      this.field_102 = var1;
      this.field_103 = var2;
      this.field_104 = var3;
   }

   // $VF: renamed from: a (int, int[], int, int) void
   public void method_78(int var1, int[] var2, int var3, int var4) {
      this.field_105 = var1;
      this.field_106 = var2;
      this.field_109 = var3;
      this.field_110 = var4;
      this.field_111 = 0;
   }

   // $VF: renamed from: a (java.awt.Graphics, MastersOfDestiny) void
   public void method_79(Graphics var1, MastersOfDestiny var2) {
      int var3 = this.field_111 * this.field_102.length;

      for (int var4 = 0; var4 < this.field_103.length; var4++) {
         for (int var5 = 0; var5 < this.field_102.length; var5++) {
            if (var3 < this.field_104.size()) {
               var3++;
            }
         }
      }
   }

   // $VF: renamed from: a (java.awt.event.MouseEvent) void
   public void method_80(MouseEvent var1) {
      for (int var2 = 0; var2 < this.field_106.length; var2++) {
         if (var1.getX() >= this.field_105
            && var1.getX() <= this.field_105 + this.field_109
            && var1.getY() >= this.field_106[var2]
            && var1.getY() <= this.field_106[var2] + this.field_110) {
            switch (var2) {
               case 0:
                  if (this.field_111 > 0) {
                     this.field_111--;
                  }

                  return;
               case 1:
                  if (this.field_102.length * (this.field_111 + this.field_103.length) < this.field_104.size()) {
                     this.field_111++;
                  }

                  return;
            }
         }
      }
   }

   // $VF: renamed from: a () void
   public void method_81() {
   }
}
