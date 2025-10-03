

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: at  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:at.class */
public class C0018at implements FocusListener {
    final /* synthetic */ MastersOfDestiny a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0018at(MastersOfDestiny mastersOfDestiny) {
        this.a = mastersOfDestiny;
    }

    public void focusGained(FocusEvent focusEvent) {
        if (this.a.o.getText().startsWith("/add")) {
            String[] split = this.a.o.getText().split(" ", 3);
            if (split.length == 3 && split[2].equals("<invite message here>")) {
                this.a.o.setText(split[0] + " " + split[1] + " ");
            }
        }
    }

    public void focusLost(FocusEvent focusEvent) {
    }
}
