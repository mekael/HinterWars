import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

// $VF: renamed from: aO
class class_82 extends JLabel implements ListCellRenderer {
   @Override
   public Component getListCellRendererComponent(JList var1, Object var2, int var3, boolean var4, boolean var5) {
      String var6 = var2.toString();
      this.setText(var6);
      if (var4) {
         this.setBackground(var1.getSelectionBackground());
      } else {
         this.setBackground(var1.getBackground());
      }

      this.setEnabled(var1.isEnabled());
      this.setFont(var1.getFont());
      this.setOpaque(true);
      return this;
   }
}
