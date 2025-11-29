import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// $VF: renamed from: aC
class class_39 implements ActionListener {
   class_39(GameStates var1) {
      this.field_1503 = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (this.field_1503.field_1102) {
         this.field_1503.field_1102 = false;
         this.field_1503.field_1104 = true;
         this.field_1503
            .field_1234
            .write(
               "P1|"
                  + this.field_1503.field_1101.getText()
                  + "|"
                  + this.field_1503.field_1070
                  + "|"
                  + this.field_1503.field_1072
                  + "|"
                  + this.field_1503.field_1071
                  + "\n"
            );
         this.field_1503.field_1234.flush();
      }
   }
}
