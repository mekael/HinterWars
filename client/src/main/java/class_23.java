import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// $VF: renamed from: aI
class class_23 implements KeyListener {
   class_23(MastersOfDestiny var1) {
      this.field_160 = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      switch (var1.getKeyCode()) {
         case 10:
            this.field_160.method_759();
      }
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }
}
