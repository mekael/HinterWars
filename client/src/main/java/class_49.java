import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// $VF: renamed from: Z
class class_49 implements ActionListener {
   class_49(GameStates var1) {
      this.field_1513 = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (this.field_1513.field_1151) {
         this.field_1513.field_1151 = false;
         this.field_1513.field_1150 = true;
      }
   }
}
