

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/* renamed from: y  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:y.class */
class C0044y implements DocumentListener {
    final /* synthetic */ GameStates a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0044y(GameStates gameStates) {
        this.a = gameStates;
    }

    public void changedUpdate(DocumentEvent documentEvent) {
        if (!this.a.pp.getText().equals("") && !this.a.pq.getText().equals("") && !this.a.pD) {
            this.a.pD = true;
        }
        if ((this.a.pp.getText().equals("") || this.a.pq.getText().equals("")) && this.a.pD) {
            this.a.pD = false;
        }
    }

    public void insertUpdate(DocumentEvent documentEvent) {
        if (!this.a.pp.getText().equals("") && !this.a.pq.getText().equals("") && !this.a.pD) {
            this.a.pD = true;
        }
        if ((this.a.pp.getText().equals("") || this.a.pq.getText().equals("")) && this.a.pD) {
            this.a.pD = false;
        }
    }

    public void removeUpdate(DocumentEvent documentEvent) {
        if (!this.a.pp.getText().equals("") && !this.a.pq.getText().equals("") && !this.a.pD) {
            this.a.pD = true;
        }
        if ((this.a.pp.getText().equals("") || this.a.pq.getText().equals("")) && this.a.pD) {
            this.a.pD = false;
        }
    }
}
