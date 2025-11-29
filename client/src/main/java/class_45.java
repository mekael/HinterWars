import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// $VF: renamed from: o
class class_45 implements ActionListener {
   class_45(GameStates var1) {
      this.field_1509 = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (this.field_1509.field_1259) {
         class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
         this.field_1509.method_447();
      } else {
         class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_fail.wav");
      }
   }
}
