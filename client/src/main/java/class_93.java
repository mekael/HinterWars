import java.awt.Graphics;
import java.util.Enumeration;
import javax.swing.Icon;

// $VF: renamed from: af
public class class_93 extends class_86 {
   // $VF: renamed from: j javax.swing.Icon
   Icon field_3125;
   // $VF: renamed from: k javax.swing.Icon[]
   Icon[] field_3126;
   // $VF: renamed from: l int
   int field_3127;
   // $VF: renamed from: m long
   long field_3128;
   // $VF: renamed from: n int
   int field_3129;
   // $VF: renamed from: o int
   int field_3130;
   // $VF: renamed from: p int
   int field_3131;
   // $VF: renamed from: q int
   int field_3132;

   // $VF: renamed from: a () int
   @Override
   public int method_784() {
      return 1;
   }

   // $VF: renamed from: a (ac) boolean
   @Override
   public boolean method_785(class_86 var1) {
      return false;
   }

   // $VF: renamed from: b (ac) boolean
   @Override
   public boolean method_786(class_86 var1) {
      return false;
   }

   // $VF: renamed from: b () java.util.Enumeration
   @Override
   public Enumeration method_787() {
      return null;
   }

   // $VF: renamed from: d () void
   @Override
   public void method_790() {
      this.field_3125 = null;
      this.field_3126 = null;
      this.field_3127 = 0;
      this.field_3128 = 0L;
      this.field_3129 = 0;
      this.field_3130 = 0;
   }

   // $VF: renamed from: a (int, int) void
   void method_884(int var1, int var2) {
      this.field_3129 = var1;
      this.field_3130 = var2;
   }

   // $VF: renamed from: a (javax.swing.Icon) void
   void method_885(Icon var1) {
      this.field_3125 = var1;
   }

   // $VF: renamed from: a (javax.swing.Icon[], int, int) void
   void method_886(Icon[] var1, int var2, int var3) {
      this.field_3126 = var1;
      this.field_3127 = 0;
      this.field_3131 = var2;
      this.field_3132 = var3;
   }

   // $VF: renamed from: i () int
   @Override
   public int method_799() {
      return this.field_3125 != null ? this.field_3125.getIconWidth() : 0;
   }

   // $VF: renamed from: a (int) int
   public int method_887(int var1) {
      return this.field_3126[var1] != null ? this.field_3126[var1].getIconWidth() : 0;
   }

   // $VF: renamed from: j () int
   @Override
   public int method_800() {
      return this.field_3125 != null ? this.field_3125.getIconHeight() : 0;
   }

   // $VF: renamed from: b (int) int
   public int method_888(int var1) {
      return this.field_3126[var1] != null ? this.field_3126[var1].getIconHeight() : 0;
   }

   // $VF: renamed from: k () int
   @Override
   public int method_801() {
      return this.field_3129;
   }

   // $VF: renamed from: l () int
   @Override
   public int method_802() {
      return this.field_3130;
   }

   // $VF: renamed from: a (long) void
   @Override
   public void method_791(long var1) {
      if (this.field_3126 != null) {
         if (System.currentTimeMillis() > this.field_3128) {
            this.field_3127 = (this.field_3127 + 1) % this.field_3126.length;
            this.field_3128 = System.currentTimeMillis() + 200L;
         }
      }
   }

   // $VF: renamed from: a (java.awt.Graphics, MastersOfDestiny) void
   @Override
   public void method_793(Graphics var1, MastersOfDestiny var2) {
      if (this.field_3125 != null) {
         this.field_3125.paintIcon(GameStates.field_1274, var1, this.field_3129, this.field_3130);
      }

      if (this.field_3126 != null) {
         this.field_3126[this.field_3127].paintIcon(GameStates.field_1274, var1, this.field_3131, this.field_3132);
      }
   }
}
