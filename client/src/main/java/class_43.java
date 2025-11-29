import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

// $VF: renamed from: y
class class_43 implements DocumentListener {
   class_43(GameStates var1) {
      this.field_1507 = var1;
   }

   @Override
   public void changedUpdate(DocumentEvent var1) {
      if (!this.field_1507.field_1245.getText().equals("") && !this.field_1507.field_1246.getText().equals("") && !this.field_1507.field_1259) {
         this.field_1507.field_1259 = true;
      }

      if ((this.field_1507.field_1245.getText().equals("") || this.field_1507.field_1246.getText().equals("")) && this.field_1507.field_1259) {
         this.field_1507.field_1259 = false;
      }
   }

   @Override
   public void insertUpdate(DocumentEvent var1) {
      if (!this.field_1507.field_1245.getText().equals("") && !this.field_1507.field_1246.getText().equals("") && !this.field_1507.field_1259) {
         this.field_1507.field_1259 = true;
      }

      if ((this.field_1507.field_1245.getText().equals("") || this.field_1507.field_1246.getText().equals("")) && this.field_1507.field_1259) {
         this.field_1507.field_1259 = false;
      }
   }

   @Override
   public void removeUpdate(DocumentEvent var1) {
      if (!this.field_1507.field_1245.getText().equals("") && !this.field_1507.field_1246.getText().equals("") && !this.field_1507.field_1259) {
         this.field_1507.field_1259 = true;
      }

      if ((this.field_1507.field_1245.getText().equals("") || this.field_1507.field_1246.getText().equals("")) && this.field_1507.field_1259) {
         this.field_1507.field_1259 = false;
      }
   }
}
