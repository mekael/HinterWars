

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* renamed from: aC  reason: default package */
/* loaded from: hinterwars.jar:aC.class */
class aC implements ActionListener {
    final /* synthetic */ GameStates a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aC(GameStates gameStates) {
        this.a = gameStates;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (this.a.mC) {
            this.a.mC = false;
            this.a.mE = true;
            this.a.pe.write("P1|" + this.a.mB.getText() + C0000a.v + this.a.lW + C0000a.v + this.a.lY + C0000a.v + this.a.lX + C0000a.w);
            this.a.pe.flush();
        }
    }
}
