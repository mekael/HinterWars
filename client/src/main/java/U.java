

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;

/* renamed from: U  reason: default package */
/* loaded from: hinterwars.jar:U.class */
public class U {
    String a;
    String b;
    String c;
    String d;
    Hashtable e;
    D f;
    String[][] g;
    int h = 0;
    int i = 0;
    private final byte v = 0;
    private final byte w = 1;
    private final byte x = 2;
    private final byte y = 3;
    private final byte z = 4;
    private final byte A = 5;
    private final byte B = 6;
    private final byte C = 7;
    private final byte D = 8;
    private final byte E = 9;
    private final byte F = 10;
    private final byte G = 11;
    private final byte H = 12;
    private final byte I = 13;
    private final byte J = 14;
    private final byte K = 15;
    private final byte L = 16;
    private final byte M = 17;
    private final byte N = 18;
    private final byte O = 19;
    private final byte P = 20;
    private final byte Q = 21;
    private final byte R = 22;
    public static final byte j = 1;
    public static final byte k = 2;
    public static final byte l = 3;
    public static final byte m = 4;
    public static final byte n = 5;
    public static final byte o = 6;
    public static final byte p = 7;
    public static final byte q = 8;
    public static final byte r = 9;
    public static final byte s = 10;
    public static final byte t = 0;
    public static final byte u = 15;

    public U(String str, String str2, String str3, String str4) {
        try {
            InputStream resourceAsStream = getClass().getResourceAsStream(str + str2);
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
                this.b = new String(byteArrayOutputStream.toByteArray(), "utf-8");
                C0032k.a(this.b);
            } else {
                C0032k.a("graphics mapping null");
            }
            InputStream resourceAsStream2 = getClass().getResourceAsStream(str + str3);
            if (resourceAsStream2 != null) {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                while (true) {
                    int read2 = resourceAsStream2.read();
                    if (read2 == -1) {
                        break;
                    }
                    byteArrayOutputStream2.write(read2);
                }
                resourceAsStream2.close();
                this.c = new String(byteArrayOutputStream2.toByteArray(), "utf-8");
            } else {
                C0032k.a("item class mapping null");
            }
            InputStream resourceAsStream3 = getClass().getResourceAsStream(str + str4);
            if (resourceAsStream3 != null) {
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                while (true) {
                    int read3 = resourceAsStream3.read();
                    if (read3 == -1) {
                        break;
                    }
                    byteArrayOutputStream3.write(read3);
                }
                resourceAsStream3.close();
                this.d = new String(byteArrayOutputStream3.toByteArray(), "utf-8");
            } else {
                C0032k.a("item class mapping null");
            }
        } catch (IOException e) {
            C0032k.a(e.getMessage());
        }
        this.a = str;
        this.e = new Hashtable();
    }

    public D a(String str) {
        if (this.e.containsKey(new Long(str))) {
            return (D) this.e.get(new Long(str));
        }
        this.f = new D(Long.parseLong(str));
        this.g = new String[16][6];
        this.h = 0;
        this.i = 0;
        try {
            InputStream resourceAsStream = getClass().getResourceAsStream(this.a + str + ".txt");
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
                String str2 = new String(byteArrayOutputStream.toByteArray(), "utf-8");
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < str2.length(); i3++) {
                    if (str2.charAt(i3) == '\n') {
                        C0032k.a("read from item file = " + str2.substring(i2, i3));
                        boolean a = a(str2.substring(i2, i3 - 1), i);
                        i2 = i3 + 1;
                        if (a) {
                            i++;
                        }
                    }
                }
            } else {
                C0032k.a("null");
            }
        } catch (IOException e) {
            C0032k.a(e.getMessage());
        }
        this.e.put(new Long(str), this.f);
        return this.f;
    }

    public boolean a(String str, int i) {
        switch (i) {
            case 0:
                String str2 = null;
                int i2 = 1;
                int i3 = 0;
                int parseInt = Integer.parseInt(str);
                C0032k.a("set details graphics = " + parseInt);
                int i4 = 0;
                while (true) {
                    if (i4 < this.b.length()) {
                        if (this.b.charAt(i4) == '\n') {
                            if (i2 == parseInt) {
                                String substring = this.b.substring(i3, i4 - 1);
                                str2 = substring.substring(str.length() + 1, substring.length());
                            } else {
                                i2++;
                                i3 = i4 + 1;
                            }
                        }
                        i4++;
                    }
                }
                this.f.a(str2);
                return true;
            case 1:
                this.f.b(str);
                return true;
            case 2:
                this.f.e(str);
                return true;
            case 3:
                this.f.f(str);
                return true;
            case 4:
                int i5 = -1;
                String[] split = str.split("\\|");
                int i6 = 1;
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    if (i8 < this.c.length()) {
                        if (this.c.charAt(i8) == '\n') {
                            String substring2 = this.c.substring(i7, i8 - 1);
                            if (substring2.startsWith(split[0])) {
                                i5 = Integer.parseInt(substring2.substring(split[0].length() + 1, substring2.length()).trim());
                            } else {
                                i6++;
                                i7 = i8 + 1;
                            }
                        }
                        i8++;
                    }
                }
                this.f.g(split[1]);
                this.f.a(i5);
                return true;
            case 5:
                int i9 = -1;
                int i10 = 1;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i12 < this.d.length()) {
                        if (this.d.charAt(i12) == '\n') {
                            String substring3 = this.d.substring(i11, i12 - 1);
                            if (substring3.startsWith(str)) {
                                i9 = Integer.parseInt(substring3.substring(str.length() + 1, substring3.length()).trim());
                            } else {
                                i10++;
                                i11 = i12 + 1;
                            }
                        }
                        i12++;
                    }
                }
                this.f.b(i9);
                return true;
            case 6:
                this.f.c(Integer.parseInt(str));
                return true;
            case 7:
                this.f.h(str);
                return true;
            case 8:
                this.f.i(str);
                return true;
            case 9:
                this.f.j(str);
                return true;
            case 10:
                this.f.k(str);
                return true;
            case C0000a.aW /* 11 */:
                this.f.l(str);
                return true;
            case C0000a.aX /* 12 */:
                this.f.c(str);
                return true;
            case C0000a.aY /* 13 */:
                this.f.d(str);
                return true;
            case C0000a.aZ /* 14 */:
                this.f.n(str);
                return true;
            case 15:
                this.f.o(str);
                return true;
            case C0000a.bb /* 16 */:
                this.f.p(str);
                return true;
            case C0000a.bc /* 17 */:
                this.f.q(str);
                return true;
            case C0000a.bd /* 18 */:
                this.f.d(Integer.parseInt(str));
                return true;
            case C0000a.be /* 19 */:
                return this.f.e(Integer.parseInt(str));
            case C0000a.bf /* 20 */:
                String[] split2 = str.split(",");
                this.f.a(Integer.parseInt(split2[0]), Integer.parseInt(split2[1]));
                return true;
            case C0000a.bg /* 21 */:
                return this.f.m(str);
            case C0000a.bh /* 22 */:
                if (str.equals("")) {
                    return true;
                }
                this.f.g(Integer.parseInt(str));
                return true;
            default:
                C0032k.a("ItemDetailsManager.setDetails: Error! - invalid details index");
                return true;
        }
    }
}
