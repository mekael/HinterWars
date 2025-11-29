import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// $VF: renamed from: au
class class_41 implements ActionListener {
   class_41(GameStates var1) {
      this.field_1505 = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
   }
}
