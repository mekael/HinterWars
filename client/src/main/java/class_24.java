import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

// $VF: renamed from: at
class class_24 implements FocusListener {
   class_24(MastersOfDestiny var1) {
      this.field_161 = var1;
   }

   @Override
   public void focusGained(FocusEvent var1) {
      if (this.field_161.field_2793.getText().startsWith("/add")) {
         String[] var2 = this.field_161.field_2793.getText().split(" ", 3);
         if (var2.length == 3 && var2[2].equals("<invite message here>")) {
            this.field_161.field_2793.setText(var2[0] + " " + var2[1] + " ");
         }
      }
   }

   @Override
   public void focusLost(FocusEvent var1) {
   }
}
