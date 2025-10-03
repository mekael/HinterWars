

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: aI  reason: default package */
/* loaded from: hinterwars.jar:aI.class */
public class aI implements KeyListener {
    final /* synthetic */ MastersOfDestiny a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aI(MastersOfDestiny mastersOfDestiny) {
        this.a = mastersOfDestiny;
    }

    public void keyPressed(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case 10:
                this.a.b();
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
