

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* renamed from: ay  reason: default package */
/* loaded from: hinterwars.jar:ay.class */
class ay implements ActionListener {
    final /* synthetic */ GameStates a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ay(GameStates gameStates) {
        this.a = gameStates;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (this.a.nz) {
            this.a.nz = false;
            this.a.ny = true;
        }
    }
}
