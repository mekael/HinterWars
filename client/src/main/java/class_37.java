import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// $VF: renamed from: E
class class_37 implements ActionListener {
   class_37(GameStates var1) {
      this.field_1501 = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (this.field_1501.field_1151) {
         this.field_1501.field_1151 = false;
         this.field_1501.field_1150 = true;
      }
   }
}
