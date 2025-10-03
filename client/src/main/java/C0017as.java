

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* renamed from: as  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:as.class */
class C0017as implements ActionListener {
    final /* synthetic */ GameStates a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0017as(GameStates gameStates) {
        this.a = gameStates;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (this.a.nz) {
            this.a.nz = false;
            this.a.ny = true;
        }
    }
}
