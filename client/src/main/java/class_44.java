import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

// $VF: renamed from: N
class class_44 implements DocumentListener {
   class_44(GameStates var1) {
      this.field_1508 = var1;
   }

   @Override
   public void changedUpdate(DocumentEvent var1) {
      if (this.field_1508.field_928.getText() != "") {
         this.field_1508.field_930 = Integer.parseInt(this.field_1508.field_928.getText()) * this.field_1508.field_929;
      }
   }

   @Override
   public void insertUpdate(DocumentEvent var1) {
      if (this.field_1508.field_928.getText() != "") {
         this.field_1508.field_930 = Integer.parseInt(this.field_1508.field_928.getText()) * this.field_1508.field_929;
      }
   }

   @Override
   public void removeUpdate(DocumentEvent var1) {
      class_62.method_563("remove");
      if (this.field_1508.field_1031) {
         this.field_1508.field_1031 = false;
      } else if (!this.field_1508.field_928.getText().equals("")) {
         this.field_1508.field_930 = Integer.parseInt(this.field_1508.field_928.getText()) * this.field_1508.field_929;
      } else {
         this.field_1508.field_930 = this.field_1508.field_929;
      }
   }
}
