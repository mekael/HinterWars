package defpackage;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/* renamed from: aO  reason: default package */
/* loaded from: hinterwars.jar:aO.class */
class aO extends JLabel implements ListCellRenderer {
    aO() {
    }

    public Component getListCellRendererComponent(JList jList, Object obj, int i, boolean z, boolean z2) {
        setText(obj.toString());
        if (z) {
            setBackground(jList.getSelectionBackground());
        } else {
            setBackground(jList.getBackground());
        }
        setEnabled(jList.isEnabled());
        setFont(jList.getFont());
        setOpaque(true);
        return this;
    }
}
