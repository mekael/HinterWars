

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;

/* renamed from: ah  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:ah.class */
public class C0008ah {
    String a;
    C0030i c;
    private final byte d = 0;
    private final byte e = 1;
    Hashtable b = new Hashtable();

    public C0008ah(String str) {
        this.a = str;
    }

    public C0030i a(long j) {
        if (this.b.containsKey(Long.valueOf(j))) {
            return (C0030i) this.b.get(new Long(j));
        }
        this.c = new C0030i(j);
        try {
            InputStream resourceAsStream = getClass().getResourceAsStream(this.a + j + ".txt");
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
                String[] split = new String(byteArrayOutputStream.toByteArray(), "utf-8").split("\r\n", 2);
                C0032k.a("read from item file = " + split[0]);
                C0032k.a("read from item file = " + split[1]);
                a(split[0], 0);
                a(split[1], 1);
            } else {
                C0032k.a("null");
            }
        } catch (IOException e) {
            C0032k.a(e.getMessage());
        }
        this.b.put(new Long(j), this.c);
        return this.c;
    }

    public boolean a(String str, int i) {
        switch (i) {
            case 0:
                this.c.a(str);
                return true;
            case 1:
                this.c.b(str);
                return true;
            default:
                this.c.c(str);
                return true;
        }
    }
}
