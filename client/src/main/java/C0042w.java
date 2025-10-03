package defpackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* renamed from: w  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:w.class */
class C0042w implements ActionListener {
    final /* synthetic */ GameStates a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0042w(GameStates gameStates) {
        this.a = gameStates;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (!this.a.pD) {
            C0021aw.b.a(C0028g.b);
            return;
        }
        C0021aw.b.a(C0028g.a);
        this.a.h();
    }
}
