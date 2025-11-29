import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// $VF: renamed from: ao
class class_22 implements KeyListener {
   class_22(MastersOfDestiny var1) {
      this.field_159 = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      switch (var1.getKeyCode()) {
         case 10:
            this.field_159.method_760();
      }
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }
}
