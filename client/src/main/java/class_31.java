import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

// $VF: renamed from: r
public class class_31 extends PlainDocument {
   // $VF: renamed from: a int
   private int field_329;

   public class_31(int var1) {
      this.method_247(var1);
   }

   // $VF: renamed from: a () int
   public final int method_246() {
      return this.field_329;
   }

   @Override
   public void insertString(int var1, String var2, AttributeSet var3) throws BadLocationException {
      if (var1 < this.field_329 && !var2.equals("\n")) {
         super.insertString(var1, var2, var3);
      }
   }

   // $VF: renamed from: a (int) void
   public final void method_247(int var1) {
      this.field_329 = var1;
   }
}
