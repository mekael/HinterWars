package defpackage;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/* renamed from: l  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:l.class */
class C0033l implements DocumentListener {
    final /* synthetic */ GameStates a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0033l(GameStates gameStates) {
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
