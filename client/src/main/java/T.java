package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;

/* renamed from: T  reason: default package */
/* loaded from: hinterwars.jar:T.class */
public class T {
    String c;
    String d;
    String e;
    String g;
    String i;
    Hashtable a = new Hashtable();
    Hashtable b = new Hashtable();
    Hashtable f = new Hashtable();
    Hashtable h = new Hashtable();

    public T(String str, String str2, String str3, String str4) {
        this.c = str;
        this.e = str2;
        this.g = str3;
        this.i = str4;
    }

    public am a(long j, String str, String str2, String str3) {
        am amVar = (am) this.a.get(Long.valueOf(j));
        if (amVar == null) {
            amVar = new am(j, str, str2, str3);
            this.a.put(Long.valueOf(j), amVar);
        }
        return amVar;
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
                } else {
                    C0032k.a("null");
                }
            } catch (IOException e) {
                C0032k.a(e.getMessage());
            }
            this.b.put(Long.valueOf(j), str);
        }
        return str;
    }

    public String b(long j) {
        String str = null;
        try {
            InputStream resourceAsStream = getClass().getResourceAsStream(this.e + j + ".txt");
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
            } else {
                C0032k.a("CafeObjectManager(newTrigger): Unable to create InputStream");
            }
        } catch (IOException e) {
            C0032k.a(e.getMessage());
        }
        return str;
    }

    public String c(long j) {
        String str = (String) this.h.get(Long.valueOf(j));
        if (str == null) {
            try {
                InputStream resourceAsStream = getClass().getResourceAsStream(this.i + j + ".txt");
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
                } else {
                    C0032k.a("null");
                }
            } catch (IOException e) {
                C0032k.a(e.getMessage());
            }
            this.h.put(Long.valueOf(j), str);
        }
        return str;
    }
}
