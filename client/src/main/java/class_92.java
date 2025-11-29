import java.awt.Color;
import java.awt.Graphics;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.Icon;

// $VF: renamed from: H
public class class_92 extends class_86 {
   // $VF: renamed from: j javax.swing.Icon
   Icon field_3117;
   // $VF: renamed from: k javax.swing.Icon
   Icon field_3118;
   // $VF: renamed from: l javax.swing.Icon
   Icon field_3119;
   // $VF: renamed from: m int
   int field_3120;
   // $VF: renamed from: n int
   int field_3121;
   // $VF: renamed from: o java.util.Vector
   Vector field_3122;
   // $VF: renamed from: p java.util.Vector
   Vector field_3123;
   // $VF: renamed from: q int
   int field_3124;

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
      this.field_3120 = 0;
      this.field_3121 = 0;
      this.field_3124 = -1;
      this.field_3122 = new Vector();
      this.field_3123 = new Vector();
   }

   // $VF: renamed from: a (javax.swing.Icon, javax.swing.Icon, javax.swing.Icon) void
   public void method_876(Icon var1, Icon var2, Icon var3) {
      this.field_3117 = var1;
      this.field_3118 = var2;
      this.field_3119 = var3;
   }

   // $VF: renamed from: a (int, int) void
   public void method_877(int var1, int var2) {
      if (var1 < 207) {
         this.field_3120 = var1 + 200;
      } else {
         this.field_3120 = var1;
      }

      this.field_3121 = var2;
   }

   // $VF: renamed from: a (java.lang.String, java.lang.Object) void
   public void method_878(String var1, Object var2) {
      if (var1 != null) {
         if (MastersOfDestiny.field_2807.stringWidth(var1) > 175) {
            int var3 = 1;
            String var4 = "";

            while (MastersOfDestiny.field_2807.stringWidth(var4 = var1.substring(0, var1.length() - var3)) > 175) {
               var3++;
            }

            this.field_3122.add(var4 + "..");
         } else {
            this.field_3122.add(var1);
         }
      }

      if (var2 != null) {
         this.field_3123.add(var2);
      }
   }

   // $VF: renamed from: a (int) void
   public void method_879(int var1) {
      this.field_3124 = var1;
   }

   // $VF: renamed from: m () int
   public int method_880() {
      return this.field_3124;
   }

   // $VF: renamed from: n () java.lang.Object
   public Object method_881() {
      if (this.field_3123 == null) {
         return null;
      } else {
         return this.field_3124 >= 0 && this.field_3124 < this.field_3123.size() ? this.field_3123.elementAt(this.field_3124) : null;
      }
   }

   // $VF: renamed from: o () java.lang.Object
   public Object method_882() {
      if (this.field_3118 == null) {
         return null;
      } else {
         return this.field_3124 >= 0 && this.field_3124 < this.field_3122.size() ? this.field_3122.elementAt(this.field_3124) : null;
      }
   }

   // $VF: renamed from: b (int, int) boolean
   public boolean method_883(int var1, int var2) {
      if (this.field_3122.size() == 0) {
         return false;
      } else if (this.field_3123.size() == 0) {
         return false;
      } else {
         for (int var3 = 0; var3 < this.field_3122.size(); var3++) {
            if (var1 > this.field_3120 + 5
               && var1 < this.field_3120 + 5 + this.field_3118.getIconWidth()
               && var2 > this.field_3121 + this.field_3117.getIconHeight() + var3 * this.field_3118.getIconHeight()
               && var2 < this.field_3121 + this.field_3117.getIconHeight() + (var3 + 1) * this.field_3118.getIconHeight()) {
               this.method_879(var3);
               return true;
            }
         }

         this.method_879(-1);
         return false;
      }
   }

   // $VF: renamed from: a (java.awt.Graphics, MastersOfDestiny) void
   @Override
   public void method_793(Graphics var1, MastersOfDestiny var2) {
      int var3 = this.field_3121;
      this.field_3117.paintIcon(var2, var1, this.field_3120, var3);
      var3 += this.field_3117.getIconHeight();
      if (this.field_3122 != null) {
         Enumeration var4 = this.field_3122.elements();

         for (int var5 = 0; var4.hasMoreElements(); var5++) {
            this.field_3118.paintIcon(var2, var1, this.field_3120, var3);
            var1.setColor(new Color(0));
            var1.setFont(MastersOfDestiny.field_2806);
            var1.drawString(var4.nextElement().toString(), this.field_3120 + 9, var3 + this.field_3118.getIconHeight() - 5);
            if (this.field_3124 == var5) {
               var1.setColor(new Color(4247250));
               var1.drawRect(this.field_3120 + 5, var3, this.field_3118.getIconWidth() - 11, this.field_3118.getIconHeight() - 1);
            }

            var3 += this.field_3118.getIconHeight();
         }
      }

      this.field_3119.paintIcon(var2, var1, this.field_3120, var3);
   }

   // $VF: renamed from: h () void
   @Override
   public void method_798() {
      super.field_2992 = 2;
      this.field_3120 = 0;
      this.field_3121 = 0;
      this.field_3124 = -1;
      this.field_3122.clear();
      this.field_3123.clear();
   }
}
