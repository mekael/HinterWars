import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// $VF: renamed from: R
class class_53 implements ActionListener {
   class_53(GameStates var1) {
      this.field_1517 = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (this.field_1517.field_1151) {
         this.field_1517.field_1151 = false;
         this.field_1517.field_1150 = true;
      }
   }
}
