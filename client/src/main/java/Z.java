

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* renamed from: Z  reason: default package */
/* loaded from: hinterwars.jar:Z.class */
class Z implements ActionListener {
    final /* synthetic */ GameStates a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Z(GameStates gameStates) {
        this.a = gameStates;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (this.a.nz) {
            this.a.nz = false;
            this.a.ny = true;
        }
    }
}
