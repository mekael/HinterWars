import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

// $VF: renamed from: q
public class class_32 extends PlainDocument {
   // $VF: renamed from: a int
   private int field_330;
   // $VF: renamed from: b int
   private int field_331;

   public class_32(int var1) {
      this.method_248(var1);
   }

   // $VF: renamed from: a (int) void
   public final void method_248(int var1) {
      this.field_330 = var1;
   }

   // $VF: renamed from: a () int
   public final int method_249() {
      return this.field_330;
   }

   // $VF: renamed from: b (int) void
   public final void method_250(int var1) {
      this.field_331 = var1;
   }

   // $VF: renamed from: b () int
   public final int method_251() {
      return this.field_331;
   }

   @Override
   public void insertString(int var1, String var2, AttributeSet var3) throws BadLocationException {
      if (var1 < this.field_330) {
         var2 = var2.replaceAll("[^0-9]", "");
         if (super.getLength() == 0 && var2.equals("0")) {
            var2 = "1";
         }

         if (!var2.equals("\n")) {
            super.insertString(var1, var2, var3);
         }

         try {
            if (this.field_331 != -1 && Integer.parseInt(super.getText(0, super.getLength())) > this.field_331) {
               super.remove(0, super.getLength());
               super.insertString(0, "" + this.field_331, var3);
            }
         } catch (NumberFormatException var5) {
         }
      }
   }

   @Override
   public void remove(int var1, int var2) throws BadLocationException {
      super.remove(var1, var2);

      try {
         if (Integer.parseInt(super.getText(0, super.getLength())) == 0) {
            super.remove(0, super.getLength());
            this.insertString(0, "1", null);
         }
      } catch (NumberFormatException var4) {
      }
   }
}
