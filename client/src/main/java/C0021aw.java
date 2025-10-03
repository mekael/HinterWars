package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.BooleanControl;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;

/* renamed from: aw  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:aw.class */
class C0021aw {
    private int e;
    private int f;
    public static final C0021aw b = new C0021aw();
    private Clip c = null;
    private Hashtable d = new Hashtable();
    String a = "config.conf";

    public C0021aw() {
        e();
    }

    public void a(String str) {
        C0032k.a("SYSTEM MEMORY LEFT =>" + Runtime.getRuntime().freeMemory() + " of " + Runtime.getRuntime().maxMemory());
        Vector vector = new Vector();
        C0032k.a("SoundManager(playSoundEffect): Attempting to play file =>" + str);
        if (this.d.containsKey(str)) {
            vector = (Vector) this.d.get(str);
            for (int i = 0; i < vector.size(); i++) {
                Clip clip = (Clip) vector.get(i);
                if (!clip.isRunning() && !clip.isActive()) {
                    C0032k.a("SoundManager(playSoundEffect): Now playing clip number =>" + i);
                    a(clip, this.e * 0.1d);
                    return;
                }
            }
        }
        Clip b2 = b(str);
        if (b2 == null) {
            C0032k.a("SoundManager(playSoundEffect): Could not play " + str);
            return;
        }
        a(b2, this.e * 0.1d);
        vector.add(b2);
        this.d.put(str, vector);
    }

    public void a(String str, boolean z) {
        a();
        this.c = b(str);
        b(this.c, this.f * 0.1d);
        this.c.loop(-1);
        if (z) {
            d();
        }
    }

    public void a() {
        if (this.c == null || !this.c.isRunning()) {
            return;
        }
        this.c.stop();
        this.c.close();
        this.c = null;
    }

    public void a(int i) {
        this.e = i;
        a(C0028g.a);
        aB.a.b(i + "");
    }

    public void b(int i) {
        this.f = i;
        b(this.c, i * 0.1d);
        aB.a.c(i + "");
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

    private void a(Clip clip, double d) {
        new L(this, clip, d).start();
    }

    private Clip b(String str) {
        Clip clip = null;
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(b.getClass().getClassLoader().getResource(str).openStream());
            clip = (Clip) AudioSystem.getLine(new DataLine.Info(Clip.class, audioInputStream.getFormat()));
            clip.open(audioInputStream);
        } catch (Exception e) {
            C0032k.a("SoundManager(playSoundEffect): " + e);
        }
        return clip;
    }

    private void d() {
        Enumeration elements = this.d.elements();
        while (elements.hasMoreElements()) {
            Vector vector = (Vector) elements.nextElement();
            for (int i = 0; i < vector.size(); i++) {
                ((Clip) vector.get(i)).close();
            }
        }
        this.d = null;
        this.d = new Hashtable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Clip clip, double d) {
        clip.getControl(FloatControl.Type.MASTER_GAIN).setValue((float) ((Math.log(d) / Math.log(10.0d)) * 20.0d));
        clip.getControl(BooleanControl.Type.MUTE).setValue(false);
    }

    private void e() {
        this.e = aB.a.b();
        this.f = aB.a.c();
    }
}
