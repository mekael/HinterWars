import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.Icon;

// $VF: renamed from: I
public class class_17 {
   // $VF: renamed from: a javax.swing.Icon
   private Icon field_136;
   // $VF: renamed from: b ab[][]
   private class_27[][] field_137;
   // $VF: renamed from: c java.lang.String
   private String field_138;
   // $VF: renamed from: d java.lang.String
   private String field_139;
   // $VF: renamed from: e int
   private int field_140;
   // $VF: renamed from: f int
   private int field_141;
   // $VF: renamed from: g int
   private int field_142 = 1;

   public class_17(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field_140 = var1;
      this.field_141 = var2;
      this.field_137 = new class_27[var1][var2];

      for (int var7 = 0; var7 < var1; var7++) {
         for (int var8 = 0; var8 < var2; var8++) {
            class_27 var9 = new class_27();
            var9.method_165(var7);
            var9.method_167(var8);
            var9.method_169(var3 + (var7 - var8) * (var5 / 2));
            var9.method_171(var4 + (var7 + var8) * (var6 / 2));
            var9.method_173(var9.method_168() + var5 / 2);
            var9.method_175(var9.method_170() + var6 / 2);
            var9.method_161(true);
            var9.method_163(false);
            this.field_137[var7][var8] = var9;
         }
      }
   }

   // $VF: renamed from: a () int
   public int method_120() {
      return this.field_137.length;
   }

   // $VF: renamed from: b () int
   public int method_121() {
      return this.field_137[0].length;
   }

   // $VF: renamed from: c () java.util.Vector
   public Vector method_122() {
      Vector var1 = new Vector();

      for (int var2 = 0; var2 < this.field_140; var2++) {
         for (int var3 = 0; var3 < this.field_141; var3++) {
            if (!this.field_137[var2][var3].method_160() && this.field_137[var2][var3].method_162()) {
               var1.add(this.field_137[var2][var3]);
            }
         }
      }

      return var1;
   }

   // $VF: renamed from: a (javax.swing.Icon) void
   public void method_123(Icon var1) {
      this.field_136 = var1;
   }

   // $VF: renamed from: a (java.awt.Graphics, MastersOfDestiny) void
   public void method_124(Graphics var1, MastersOfDestiny var2) {
      this.field_136.paintIcon(var2, var1, 0, 0);
   }

   // $VF: renamed from: a (int, int) ab
   public class_27 method_125(int var1, int var2) {
      return var1 < this.field_140 && var2 < this.field_141 && var1 >= 0 && var2 >= 0 ? this.field_137[var1][var2] : null;
   }

   // $VF: renamed from: a (int, int, ab) void
   public void method_126(int var1, int var2, class_27 var3) {
      if (var1 < this.field_140 && var2 < this.field_141 && var1 >= 0 && var2 >= 0) {
         this.field_137[var1][var2] = var3;
      }
   }

   // $VF: renamed from: b (int, int) java.lang.Object
   public Object method_127(int var1, int var2) {
      return var1 < this.field_140 && var2 < this.field_141 ? this.method_125(var1, var2).method_154() : null;
   }

   // $VF: renamed from: a (int, int, java.lang.Object) void
   public void method_128(int var1, int var2, Object var3) {
      if (var1 < this.field_140 && var2 < this.field_141 && var1 >= 0 && var2 >= 0) {
         this.method_125(var1, var2).method_155(var3);
      }
   }

   // $VF: renamed from: a (ab, ab) int
   public int method_129(class_27 var1, class_27 var2) {
      int var3 = 0;
      if (var1.method_164() > var2.method_164()) {
         var3 = var1.method_164() - var2.method_164();
      } else {
         var3 = var2.method_164() - var1.method_164();
      }

      if (var1.method_166() > var2.method_166()) {
         var3 += var1.method_166() - var2.method_166();
      } else {
         var3 += var2.method_166() - var1.method_166();
      }

      return var3 * this.field_142;
   }

   // $VF: renamed from: a (ab, ab, java.util.ArrayList) void
   public void method_130(class_27 var1, class_27 var2, ArrayList var3) {
      if (this.method_132(var1.method_164() - 1, var1.method_166(), var2)) {
         var3.add(this.field_137[var1.method_164() - 1][var1.method_166()]);
      }

      if (this.method_132(var1.method_164(), var1.method_166() - 1, var2)) {
         var3.add(this.field_137[var1.method_164()][var1.method_166() - 1]);
      }

      if (this.method_132(var1.method_164() + 1, var1.method_166(), var2)) {
         var3.add(this.field_137[var1.method_164() + 1][var1.method_166()]);
      }

      if (this.method_132(var1.method_164(), var1.method_166() + 1, var2)) {
         var3.add(this.field_137[var1.method_164()][var1.method_166() + 1]);
      }
   }

   // $VF: renamed from: b (ab, ab) boolean
   public boolean method_131(class_27 var1, class_27 var2) {
      if (var1.method_164() - 1 == var2.method_164() && var1.method_166() == var2.method_166()) {
         return true;
      } else if (var1.method_164() + 1 == var2.method_164() && var1.method_166() == var2.method_166()) {
         return true;
      } else {
         return var1.method_164() == var2.method_164() && var1.method_166() + 1 == var2.method_166()
            ? true
            : var1.method_164() == var2.method_164() && var1.method_166() - 1 == var2.method_166();
      }
   }

   // $VF: renamed from: b (int, int, ab) boolean
   public boolean method_132(int var1, int var2, class_27 var3) {
      if (var1 >= 0 && var1 < this.field_140 && var2 >= 0 && var2 < this.field_141 && this.field_137[var1][var2].method_160()) {
         if (var3 == null) {
            return true;
         }

         if (var1 != var3.method_164() || var2 != var3.method_166()) {
            return true;
         }
      }

      return false;
   }

   // $VF: renamed from: c (ab, ab) int
   public int method_133(class_27 var1, class_27 var2) {
      int var3 = 0;
      if (var1.method_164() > var2.method_164()) {
         var3 = var1.method_164() - var2.method_164();
      } else {
         var3 = var2.method_164() - var1.method_164();
      }

      if (var1.method_166() > var2.method_166()) {
         var3 += var1.method_166() - var2.method_166();
      } else {
         var3 += var2.method_166() - var1.method_166();
      }

      return var3 * this.field_142;
   }

   // $VF: renamed from: d () int
   public int method_134() {
      return this.field_140;
   }

   // $VF: renamed from: e () int
   public int method_135() {
      return this.field_141;
   }
}
