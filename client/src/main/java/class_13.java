import javax.swing.Icon;
import javax.swing.ImageIcon;

// $VF: renamed from: am
public class class_13 {
   // $VF: renamed from: a long
   private long field_127;
   // $VF: renamed from: b java.lang.String
   private String field_128;
   // $VF: renamed from: c javax.swing.Icon
   private Icon field_129;
   // $VF: renamed from: d javax.swing.Icon
   private Icon field_130;

   public class_13(long var1, String var3, String var4, String var5) {
      this.field_127 = var1;
      this.field_128 = var3;
      this.field_129 = new ImageIcon(this.getClass().getResource(var4));
      this.field_130 = new ImageIcon(this.getClass().getResource(var5));
   }

   // $VF: renamed from: a () long
   public long method_112() {
      return this.field_127;
   }

   // $VF: renamed from: b () java.lang.String
   public String method_113() {
      return this.field_128;
   }

   // $VF: renamed from: c () int
   public int method_114() {
      return 69;
   }

   // $VF: renamed from: d () int
   public int method_115() {
      return 149;
   }

   // $VF: renamed from: e () javax.swing.Icon
   public Icon method_116() {
      return this.field_129;
   }

   // $VF: renamed from: f () javax.swing.Icon
   public Icon method_117() {
      return this.field_130;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1.getClass() != this.getClass()) {
         return false;
      } else {
         class_13 var2 = (class_13)var1;
         return this.field_127 == var2.method_112();
      }
   }
}
