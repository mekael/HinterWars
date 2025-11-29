import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

// $VF: renamed from: aR
class class_52 implements DocumentListener {
   class_52(GameStates var1) {
      this.field_1516 = var1;
   }

   @Override
   public void changedUpdate(DocumentEvent var1) {
      if (!this.field_1516.field_1120.getText().equals("")
         && !this.field_1516.field_1121.getText().equals("")
         && !this.field_1516.field_1117.getText().equals("")
         && !this.field_1516.field_1118.getText().equals("")
         && !this.field_1516.field_1119.getText().equals("")
         && !this.field_1516.field_1122.getText().equals("")
         && !this.field_1516.field_1151) {
         this.field_1516.field_1151 = true;
      }

      if ((
            this.field_1516.field_1120.getText().equals("")
               || this.field_1516.field_1121.getText().equals("")
               || this.field_1516.field_1117.getText().equals("")
               || this.field_1516.field_1118.getText().equals("")
               || this.field_1516.field_1119.getText().equals("")
               || this.field_1516.field_1122.getText().equals("")
         )
         && this.field_1516.field_1151) {
         this.field_1516.field_1151 = false;
      }
   }

   @Override
   public void insertUpdate(DocumentEvent var1) {
      if (!this.field_1516.field_1120.getText().equals("")
         && !this.field_1516.field_1121.getText().equals("")
         && !this.field_1516.field_1117.getText().equals("")
         && !this.field_1516.field_1118.getText().equals("")
         && !this.field_1516.field_1119.getText().equals("")
         && !this.field_1516.field_1122.getText().equals("")
         && !this.field_1516.field_1151) {
         this.field_1516.field_1151 = true;
      }

      if ((
            this.field_1516.field_1120.getText().equals("")
               || this.field_1516.field_1121.getText().equals("")
               || this.field_1516.field_1117.getText().equals("")
               || this.field_1516.field_1118.getText().equals("")
               || this.field_1516.field_1119.getText().equals("")
               || this.field_1516.field_1122.getText().equals("")
         )
         && this.field_1516.field_1151) {
         this.field_1516.field_1151 = false;
      }
   }

   @Override
   public void removeUpdate(DocumentEvent var1) {
      if (!this.field_1516.field_1120.getText().equals("")
         && !this.field_1516.field_1121.getText().equals("")
         && !this.field_1516.field_1117.getText().equals("")
         && !this.field_1516.field_1118.getText().equals("")
         && !this.field_1516.field_1119.getText().equals("")
         && !this.field_1516.field_1122.getText().equals("")
         && !this.field_1516.field_1151) {
         this.field_1516.field_1151 = true;
      }

      if ((
            this.field_1516.field_1120.getText().equals("")
               || this.field_1516.field_1121.getText().equals("")
               || this.field_1516.field_1117.getText().equals("")
               || this.field_1516.field_1118.getText().equals("")
               || this.field_1516.field_1119.getText().equals("")
               || this.field_1516.field_1122.getText().equals("")
         )
         && this.field_1516.field_1151) {
         this.field_1516.field_1151 = false;
      }
   }
}
