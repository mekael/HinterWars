package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;

/* renamed from: al  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:al.class */
public class C0012al {
    private static C0012al a;
    private Hashtable b = new Hashtable();
    private String c;

    public C0012al(String str) {
        this.c = str;
    }

    public static C0012al a(String str) {
        if (a == null) {
            a = new C0012al(str);
        }
        return a;
    }

    public String a(long j) {
        String str = (String) this.b.get(Long.valueOf(j));
        if (str == null) {
            try {
                InputStream resourceAsStream = getClass().getResourceAsStream(this.c + j + ".txt");
                if (resourceAsStream != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int read = resourceAsStream.read();
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(read);
                    }
                    resourceAsStream.close();
                    str = new String(byteArrayOutputStream.toByteArray(), "utf-8");
                }
            } catch (IOException e) {
            }
            if (str != null) {
                this.b.put(Long.valueOf(j), str);
            } else {
                C0032k.a("MonsterDetailsManager.getMonsterDetails: Error! - Problem loading monster details string");
            }
        }
        return str;
    }
}
