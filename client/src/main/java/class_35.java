import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// $VF: renamed from: as
class class_35 implements ActionListener {
   class_35(GameStates var1) {
      this.field_1499 = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (this.field_1499.field_1151) {
         this.field_1499.field_1151 = false;
         this.field_1499.field_1150 = true;
      }
   }
}
