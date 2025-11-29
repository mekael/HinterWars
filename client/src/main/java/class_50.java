import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

// $VF: renamed from: aK
class class_50 implements DocumentListener {
   class_50(GameStates var1) {
      this.field_1514 = var1;
   }

   @Override
   public void changedUpdate(DocumentEvent var1) {
      if (!this.field_1514.field_1120.getText().equals("")
         && !this.field_1514.field_1121.getText().equals("")
         && !this.field_1514.field_1117.getText().equals("")
         && !this.field_1514.field_1118.getText().equals("")
         && !this.field_1514.field_1119.getText().equals("")
         && !this.field_1514.field_1122.getText().equals("")
         && !this.field_1514.field_1151) {
         this.field_1514.field_1151 = true;
      }

      if ((
            this.field_1514.field_1120.getText().equals("")
               || this.field_1514.field_1121.getText().equals("")
               || this.field_1514.field_1117.getText().equals("")
               || this.field_1514.field_1118.getText().equals("")
               || this.field_1514.field_1119.getText().equals("")
               || this.field_1514.field_1122.getText().equals("")
         )
         && this.field_1514.field_1151) {
         this.field_1514.field_1151 = false;
      }
   }

   @Override
   public void insertUpdate(DocumentEvent var1) {
      if (!this.field_1514.field_1120.getText().equals("")
         && !this.field_1514.field_1121.getText().equals("")
         && !this.field_1514.field_1117.getText().equals("")
         && !this.field_1514.field_1118.getText().equals("")
         && !this.field_1514.field_1119.getText().equals("")
         && !this.field_1514.field_1122.getText().equals("")
         && !this.field_1514.field_1151) {
         this.field_1514.field_1151 = true;
      }

      if ((
            this.field_1514.field_1120.getText().equals("")
               || this.field_1514.field_1121.getText().equals("")
               || this.field_1514.field_1117.getText().equals("")
               || this.field_1514.field_1118.getText().equals("")
               || this.field_1514.field_1119.getText().equals("")
               || this.field_1514.field_1122.getText().equals("")
         )
         && this.field_1514.field_1151) {
         this.field_1514.field_1151 = false;
      }
   }

   @Override
   public void removeUpdate(DocumentEvent var1) {
      if (!this.field_1514.field_1120.getText().equals("")
         && !this.field_1514.field_1121.getText().equals("")
         && !this.field_1514.field_1117.getText().equals("")
         && !this.field_1514.field_1118.getText().equals("")
         && !this.field_1514.field_1119.getText().equals("")
         && !this.field_1514.field_1122.getText().equals("")
         && !this.field_1514.field_1151) {
         this.field_1514.field_1151 = true;
      }

      if ((
            this.field_1514.field_1120.getText().equals("")
               || this.field_1514.field_1121.getText().equals("")
               || this.field_1514.field_1117.getText().equals("")
               || this.field_1514.field_1118.getText().equals("")
               || this.field_1514.field_1119.getText().equals("")
               || this.field_1514.field_1122.getText().equals("")
         )
         && this.field_1514.field_1151) {
         this.field_1514.field_1151 = false;
      }
   }
}
