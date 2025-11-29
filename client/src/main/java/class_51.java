import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// $VF: renamed from: ay
class class_51 implements ActionListener {
   class_51(GameStates var1) {
      this.field_1515 = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (this.field_1515.field_1151) {
         this.field_1515.field_1151 = false;
         this.field_1515.field_1150 = true;
      }
   }
}
