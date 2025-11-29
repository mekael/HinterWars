import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

// $VF: renamed from: aW
class class_40 implements DocumentListener {
   class_40(GameStates var1) {
      this.field_1504 = var1;
   }

   @Override
   public void changedUpdate(DocumentEvent var1) {
      if (!this.field_1504.field_1101.getText().equals("") && !this.field_1504.field_1102) {
         this.field_1504.field_1102 = true;
      }

      if (this.field_1504.field_1101.getText().equals("") && this.field_1504.field_1102) {
         this.field_1504.field_1102 = false;
      }
   }

   @Override
   public void insertUpdate(DocumentEvent var1) {
      if (!this.field_1504.field_1101.getText().equals("") && !this.field_1504.field_1102) {
         this.field_1504.field_1102 = true;
      }

      if (this.field_1504.field_1101.getText().equals("") && this.field_1504.field_1102) {
         this.field_1504.field_1102 = false;
      }
   }

   @Override
   public void removeUpdate(DocumentEvent var1) {
      if (!this.field_1504.field_1101.getText().equals("") && !this.field_1504.field_1102) {
         this.field_1504.field_1102 = true;
      }

      if (this.field_1504.field_1101.getText().equals("") && this.field_1504.field_1102) {
         this.field_1504.field_1102 = false;
      }
   }
}
