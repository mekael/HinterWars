package defpackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* renamed from: m  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:m.class */
class C0034m implements ActionListener {
    final /* synthetic */ GameStates a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0034m(GameStates gameStates) {
        this.a = gameStates;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (this.a.nz) {
            this.a.nz = false;
            this.a.ny = true;
        }
    }
}
