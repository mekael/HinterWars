

import javax.sound.sampled.Clip;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: L  reason: default package */
/* loaded from: hinterwars.jar:L.class */
public class L extends Thread {
    final /* synthetic */ Clip a;
    final /* synthetic */ double b;
    final /* synthetic */ C0021aw c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L(C0021aw c0021aw, Clip clip, double d) {
        this.c = c0021aw;
        this.a = clip;
        this.b = d;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.c.b(this.a, this.b);
        this.a.setFramePosition(0);
        this.a.loop(0);
    }
}
