

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/* renamed from: aB  reason: default package */
/* loaded from: hinterwars.jar:aB.class */
public class aB {
    private File b = new File("config.conf");
    private Properties c = new Properties();
    public static final aB a = new aB();

    public aB() {
        try {
            FileInputStream fileInputStream = new FileInputStream(this.b);
            this.c.load(fileInputStream);
            fileInputStream.close();
        } catch (Exception e) {
            C0032k.a("GameSettings(Constructor): Problem initializing settings, using defaults");
            d();
        }
    }

    private void d() {
        this.c.setProperty("USERNAME", "");
        this.c.setProperty("SFX_VOLUME", "5");
        this.c.setProperty("MUSIC_VOLUME", "5");
        e();
    }

    private void e() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.b);
            this.c.store(fileOutputStream, "");
            fileOutputStream.close();
        } catch (Exception e) {
            C0032k.a("GameSettings(saveChanges): Problem saving changes =>" + e);
        }
    }

    public String a() {
        return this.c.getProperty("USERNAME");
    }

    public int b() {
        return Integer.parseInt(this.c.getProperty("SFX_VOLUME"));
    }

    public int c() {
        return Integer.parseInt(this.c.getProperty("MUSIC_VOLUME"));
    }

    public void a(String str) {
        this.c.setProperty("USERNAME", str);
        e();
    }

    public void b(String str) {
        this.c.setProperty("SFX_VOLUME", str);
        e();
    }

    public void c(String str) {
        this.c.setProperty("MUSIC_VOLUME", str);
        e();
    }
}
