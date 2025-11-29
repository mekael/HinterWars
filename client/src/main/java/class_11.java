import java.util.Arrays;

// $VF: renamed from: aT
public class class_11 {
   // $VF: renamed from: a V[]
   final class_12[] field_118;
   // $VF: renamed from: b int
   int field_119;
   // $VF: renamed from: c boolean
   boolean field_120;

   class_11(int var1) {
      this.field_118 = new class_12[var1];
   }

   // $VF: renamed from: a (V) boolean
   boolean method_99(class_12 var1) {
      if (this.field_119 == this.field_118.length) {
         return false;
      } else {
         this.field_120 = false;
         if (this.method_100(var1.method_110().method_164(), var1.method_110().method_166()) == -1) {
            this.field_118[this.field_119++] = var1;
         } else {
            class_12 var2 = this.method_102(var1.method_110().method_164(), var1.method_110().method_166());
            if (var1.field_125 < var2.field_125) {
               this.method_101(var2.method_110().method_164(), var2.method_110().method_166());
               this.field_118[this.field_119++] = var1;
            }
         }

         return true;
      }
   }

   // $VF: renamed from: a (int, int) int
   int method_100(int var1, int var2) {
      for (int var3 = 0; var3 < this.field_119; var3++) {
         if (this.field_118[var3].method_110().method_164() == var1 && this.field_118[var3].method_110().method_166() == var2) {
            return var3;
         }
      }

      return -1;
   }

   // $VF: renamed from: b (int, int) void
   void method_101(int var1, int var2) {
      int var3 = this.method_100(var1, var2);
      if (var3 != -1) {
         this.field_120 = false;
         this.field_118[var3] = this.field_118[--this.field_119];
         this.field_118[this.field_119] = null;
      }
   }

   // $VF: renamed from: c (int, int) V
   class_12 method_102(int var1, int var2) {
      int var3 = this.method_100(var1, var2);
      return var3 == -1 ? null : this.field_118[var3];
   }

   // $VF: renamed from: a () void
   void method_103() {
      for (int var1 = 0; var1 < this.field_119; var1++) {
         this.field_118[var1] = null;
      }

      this.field_119 = 0;
   }

   // $VF: renamed from: b () int
   int method_104() {
      return this.field_119;
   }

   // $VF: renamed from: c () boolean
   boolean method_105() {
      return this.field_119 == 0;
   }

   // $VF: renamed from: d () V
   class_12 method_106() {
      if (this.field_119 > 0 && !this.field_120) {
         Arrays.sort(this.field_118, 0, this.field_119);
         this.field_120 = true;
      }

      class_12 var1 = this.field_118[0];
      this.field_118[0] = this.field_118[--this.field_119];
      this.field_118[this.field_119] = null;
      return var1;
   }

   // $VF: renamed from: e () V
   public class_12 method_107() {
      int var1 = 0;
      class_12 var2 = null;
      if (this.field_119 > 0 && !this.field_120) {
         Arrays.sort(this.field_118, 0, this.field_119);
         this.field_120 = true;
      }

      if (this.field_119 > 0) {
         var2 = this.field_118[0];
         var1 = var2.field_125;

         for (int var3 = 0; var3 < this.field_119 && this.field_118[var3].field_125 <= var2.field_125; var3++) {
            if (this.field_118[var3].field_125 == var2.field_125) {
               var2 = this.method_108(this.field_118[var3], var2);
            } else {
               var2 = this.field_118[var3];
            }
         }

         this.method_101(var2.method_110().method_164(), var2.method_110().method_166());
      }

      return var2;
   }

   // $VF: renamed from: a (V, V) V
   public class_12 method_108(class_12 var1, class_12 var2) {
      class_12 var3 = null;
      if (var1.method_110().method_164() != var2.method_110().method_164()) {
         if (var1.method_110().method_164() < var2.method_110().method_164()) {
            var3 = var1;
         } else {
            var3 = var2;
         }
      } else if (var1.method_110().method_166() < var2.method_110().method_166()) {
         var3 = var1;
      } else {
         var3 = var2;
      }

      return var3;
   }

   // $VF: renamed from: f () void
   public void method_109() {
      for (int var1 = 0; var1 < this.field_119; var1++) {
         class_12 var2 = this.field_118[var1];
         class_62.method_563(
            "Pop head in open list x="
               + var2.method_110().method_164()
               + " y="
               + var2.method_110().method_166()
               + " f="
               + var2.field_125
               + " g="
               + var2.field_123
               + " h="
               + var2.field_124
         );
      }
   }
}
