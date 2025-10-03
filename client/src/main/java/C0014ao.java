package defpackage;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ao  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:ao.class */
public class C0014ao implements KeyListener {
    final /* synthetic */ MastersOfDestiny a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0014ao(MastersOfDestiny mastersOfDestiny) {
        this.a = mastersOfDestiny;
    }

    public void keyPressed(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case 10:
                this.a.c();
                return;
            default:
                return;
        }
    }

    public void keyReleased(KeyEvent keyEvent) {
    }

    public void keyTyped(KeyEvent keyEvent) {
    }
}
