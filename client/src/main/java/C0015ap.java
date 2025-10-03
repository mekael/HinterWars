

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/* renamed from: ap  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:ap.class */
class C0015ap implements DocumentListener {
    final /* synthetic */ GameStates a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0015ap(GameStates gameStates) {
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
