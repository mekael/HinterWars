// $VF: renamed from: V
public class class_12 implements Comparable {
   // $VF: renamed from: a V
   protected class_12 field_121;
   // $VF: renamed from: b V
   protected class_12 field_122;
   // $VF: renamed from: c int
   int field_123;
   // $VF: renamed from: d int
   int field_124;
   // $VF: renamed from: e int
   int field_125;
   // $VF: renamed from: f ab
   private class_27 field_126;

   class_12(class_27 var1, class_12 var2) {
      this.field_126 = var1;
      this.field_121 = var2;
   }

   // $VF: renamed from: a () ab
   public class_27 method_110() {
      return this.field_126;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof class_12)) {
         return false;
      } else {
         class_12 var2 = (class_12)var1;
         return var2.method_110().method_164() == this.field_126.method_164() && var2.method_110().method_166() == this.field_126.method_166();
      }
   }

   @Override
   public int compareTo(Object var1) {
      class_12 var2 = (class_12)var1;
      if (this == var2) {
         return 0;
      } else if (var2 == null) {
         return 1;
      } else {
         return this.field_125 > var2.field_125 ? 1 : (this.field_125 == var2.field_125 ? 0 : -1);
      }
   }

   // $VF: renamed from: a (V) void
   void method_111(class_12 var1) {
      this.field_123 = var1.field_123;
      this.field_124 = var1.field_124;
      this.field_125 = var1.field_125;
   }
}
