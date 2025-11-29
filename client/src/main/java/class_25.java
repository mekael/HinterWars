import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// $VF: renamed from: ar
class class_25 implements KeyListener {
   class_25(MastersOfDestiny var1) {
      this.field_162 = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      switch (var1.getKeyCode()) {
         case 10:
            this.field_162.method_758();
      }
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }
}
