package defpackage;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/* renamed from: aW  reason: default package */
/* loaded from: hinterwars.jar:aW.class */
class aW implements DocumentListener {
    final /* synthetic */ GameStates a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aW(GameStates gameStates) {
        this.a = gameStates;
    }

    public void changedUpdate(DocumentEvent documentEvent) {
        if (!this.a.mB.getText().equals("") && !this.a.mC) {
            this.a.mC = true;
        }
        if (this.a.mB.getText().equals("") && this.a.mC) {
            this.a.mC = false;
        }
    }

    public void insertUpdate(DocumentEvent documentEvent) {
        if (!this.a.mB.getText().equals("") && !this.a.mC) {
            this.a.mC = true;
        }
        if (this.a.mB.getText().equals("") && this.a.mC) {
            this.a.mC = false;
        }
    }

    public void removeUpdate(DocumentEvent documentEvent) {
        if (!this.a.mB.getText().equals("") && !this.a.mC) {
            this.a.mC = true;
        }
        if (this.a.mB.getText().equals("") && this.a.mC) {
            this.a.mC = false;
        }
    }
}
