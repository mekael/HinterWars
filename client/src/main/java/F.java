package defpackage;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/* renamed from: F  reason: default package */
/* loaded from: hinterwars.jar:F.class */
class F implements DocumentListener {
    final /* synthetic */ GameStates a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F(GameStates gameStates) {
        this.a = gameStates;
    }

    public void changedUpdate(DocumentEvent documentEvent) {
        if (!this.a.mU.getText().equals("") && !this.a.mV.getText().equals("") && !this.a.mR.getText().equals("") && !this.a.mS.getText().equals("") && !this.a.mT.getText().equals("") && !this.a.mW.getText().equals("") && !this.a.nz) {
            this.a.nz = true;
        }
        if ((this.a.mU.getText().equals("") || this.a.mV.getText().equals("") || this.a.mR.getText().equals("") || this.a.mS.getText().equals("") || this.a.mT.getText().equals("") || this.a.mW.getText().equals("")) && this.a.nz) {
            this.a.nz = false;
        }
    }

    public void insertUpdate(DocumentEvent documentEvent) {
        if (!this.a.mU.getText().equals("") && !this.a.mV.getText().equals("") && !this.a.mR.getText().equals("") && !this.a.mS.getText().equals("") && !this.a.mT.getText().equals("") && !this.a.mW.getText().equals("") && !this.a.nz) {
            this.a.nz = true;
        }
        if ((this.a.mU.getText().equals("") || this.a.mV.getText().equals("") || this.a.mR.getText().equals("") || this.a.mS.getText().equals("") || this.a.mT.getText().equals("") || this.a.mW.getText().equals("")) && this.a.nz) {
            this.a.nz = false;
        }
    }

    public void removeUpdate(DocumentEvent documentEvent) {
        if (!this.a.mU.getText().equals("") && !this.a.mV.getText().equals("") && !this.a.mR.getText().equals("") && !this.a.mS.getText().equals("") && !this.a.mT.getText().equals("") && !this.a.mW.getText().equals("") && !this.a.nz) {
            this.a.nz = true;
        }
        if ((this.a.mU.getText().equals("") || this.a.mV.getText().equals("") || this.a.mR.getText().equals("") || this.a.mS.getText().equals("") || this.a.mT.getText().equals("") || this.a.mW.getText().equals("")) && this.a.nz) {
            this.a.nz = false;
        }
    }
}
