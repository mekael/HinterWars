import java.util.ArrayList;

// $VF: renamed from: aV
public class class_97 {
   // $VF: renamed from: f int
   private final int field_3142;
   // $VF: renamed from: g aT
   private final class_11 field_3143;
   // $VF: renamed from: h aT
   private final class_11 field_3144;
   // $VF: renamed from: i I
   private final class_17 field_3145;
   // $VF: renamed from: j java.util.ArrayList
   private ArrayList field_3146 = new ArrayList(4);
   // $VF: renamed from: k V
   private class_12 field_3147;
   // $VF: renamed from: l V
   private class_12 field_3148;
   // $VF: renamed from: m int
   private int field_3149;
   // $VF: renamed from: n java.util.ArrayList
   private ArrayList field_3150;
   // $VF: renamed from: o int
   private int field_3151 = 0;
   // $VF: renamed from: a int
   public static final int field_3152 = 0;
   // $VF: renamed from: b int
   public static final int field_3153 = 1;
   // $VF: renamed from: c int
   public static final int field_3154 = 2;
   // $VF: renamed from: d int
   public static final int field_3155 = 3;
   // $VF: renamed from: e int
   public static final int field_3156 = 4;

   public class_97(class_17 var1, int var2) {
      this.field_3145 = var1;
      this.field_3142 = var2;
      this.field_3143 = new class_11(var2);
      this.field_3144 = new class_11(var2);
   }

   // $VF: renamed from: a (ab, ab) void
   public synchronized void method_893(class_27 var1, class_27 var2) {
      this.method_896();
      this.field_3149 = 0;
      this.field_3150 = new ArrayList(this.field_3145.method_134() * this.field_3145.method_135());
      this.field_3151 = 1;
      this.field_3148 = new class_12(var1, null);
      this.field_3143.method_99(this.field_3148);
      this.field_3148.field_123 = 0;
      this.field_3148.field_124 = this.field_3145.method_129(var1, var2);
      this.field_3148.field_125 = this.field_3148.field_124;
      this.field_3147 = new class_12(var2, null);
   }

   // $VF: renamed from: a () java.util.ArrayList
   public ArrayList method_894() {
      return this.field_3150;
   }

   // $VF: renamed from: b () void
   public synchronized void method_895() {
      this.field_3151 = 4;
      this.method_896();
   }

   // $VF: renamed from: d () void
   private void method_896() {
      this.field_3143.method_103();
      this.field_3144.method_103();
      this.field_3146.clear();
   }

   // $VF: renamed from: c () int
   public synchronized int method_897() {
      if (this.field_3151 != 2 && this.field_3151 != 3 && this.field_3151 != 4) {
         if (this.field_3151 == 1) {
            if (this.field_3143.method_105()) {
               this.field_3151 = 2;
               class_62.method_563("search has failed");
               this.method_896();
               return this.field_3151;
            }

            this.field_3149++;
            class_12 var1 = this.field_3143.method_107();
            if (var1.equals(this.field_3147)) {
               this.method_898(var1);
            } else {
               this.method_899(var1);
            }
         }

         return this.field_3151;
      } else {
         return this.field_3151;
      }
   }

   // $VF: renamed from: a (V) void
   private void method_898(class_12 var1) {
      this.field_3147.field_121 = var1.field_121;
      this.field_3150.clear();
      if (var1 != this.field_3148) {
         class_12 var2 = var1;
         class_12 var3 = var1.field_121;

         do {
            var3.field_122 = var2;
            var2 = var3;
            var3 = var3.field_121;
         } while (!var2.equals(this.field_3148));

         var1 = this.field_3148;

         do {
            var1 = var1.field_122;
            if (var1 != null) {
               this.field_3150.add(var1);
            }
         } while (!var1.equals(this.field_3147));
      }

      this.field_3151 = 3;
      this.method_896();
   }

   // $VF: renamed from: b (V) void
   private void method_899(class_12 var1) {
      this.field_3145.method_130(var1.method_110(), var1.field_121 != null ? var1.field_121.method_110() : null, this.field_3146);
      int var2 = this.field_3146.size();

      for (int var3 = 0; var3 < var2; var3++) {
         class_27 var4 = (class_27)this.field_3146.get(var3);
         int var5 = var1.field_123 + this.field_3145.method_133(var1.method_110(), var4);
         class_12 var6 = this.field_3143.method_102(var4.method_164(), var4.method_166());
         if (var6 == null || var6.field_123 > var5) {
            class_12 var7 = this.field_3144.method_102(var4.method_164(), var4.method_166());
            if (var7 == null || var7.field_123 > var5) {
               if (var7 != null) {
                  this.field_3144.method_101(var7.method_110().method_164(), var7.method_110().method_166());
               }

               if (var6 != null) {
                  this.field_3143.method_101(var6.method_110().method_164(), var6.method_110().method_166());
               }

               class_12 var8 = new class_12(var4, var1);
               var8.field_123 = var5;
               var8.field_124 = this.field_3145.method_129(var4, this.field_3147.method_110());
               var8.field_125 = var8.field_123 + var8.field_124;
               if (!this.field_3143.method_99(var8)) {
                  this.field_3151 = 2;
                  this.method_896();
                  break;
               }
            }
         }
      }

      this.field_3146.clear();
      if (!this.field_3144.method_99(var1)) {
         this.field_3151 = 2;
         this.method_896();
      }
   }
}
