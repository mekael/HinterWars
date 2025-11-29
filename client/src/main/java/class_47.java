import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// $VF: renamed from: m
class class_47 implements ActionListener {
   class_47(GameStates var1) {
      this.field_1511 = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (this.field_1511.field_1151) {
         this.field_1511.field_1151 = false;
         this.field_1511.field_1150 = true;
      }
   }
}
