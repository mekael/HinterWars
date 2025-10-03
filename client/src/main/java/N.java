

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/* renamed from: N  reason: default package */
/* loaded from: hinterwars.jar:N.class */
class N implements DocumentListener {
    final /* synthetic */ GameStates a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N(GameStates gameStates) {
        this.a = gameStates;
    }

    public void changedUpdate(DocumentEvent documentEvent) {
        if (this.a.jk.getText() != "") {
            this.a.jm = Integer.parseInt(this.a.jk.getText()) * this.a.jl;
        }
    }

    public void insertUpdate(DocumentEvent documentEvent) {
        if (this.a.jk.getText() != "") {
            this.a.jm = Integer.parseInt(this.a.jk.getText()) * this.a.jl;
        }
    }

    public void removeUpdate(DocumentEvent documentEvent) {
        C0032k.a("remove");
        if (this.a.lj) {
            this.a.lj = false;
        } else if (this.a.jk.getText().equals("")) {
            this.a.jm = this.a.jl;
        } else {
            this.a.jm = Integer.parseInt(this.a.jk.getText()) * this.a.jl;
        }
    }
}
