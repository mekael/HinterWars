

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: K  reason: default package */
/* loaded from: hinterwars.jar:K.class */
public class K {
    String a;
    String b;
    Hashtable c;
    aQ d;
    private final byte e = 0;
    private final byte f = 1;
    private final byte g = 2;
    private final byte h = 3;
    private final byte i = 4;
    private final byte j = 5;
    private final byte k = 6;
    private final byte l = 7;
    private final byte m = 8;
    private final byte n = 9;
    private final byte o = 10;
    private final byte p = 11;
    private final byte q = 12;
    private final byte r = 13;
    private final byte s = 14;

    public K(String str, String str2) {
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
        } catch (IOException e) {
            C0032k.a(e.getMessage());
        }
        this.a = str;
        this.c = new Hashtable();
    }

    public aQ a(long j) {
        if (this.c.containsKey(Long.valueOf(j))) {
            return (aQ) this.c.get(new Long(j));
        }
        this.d = new aQ(j);
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
                String str = new String(byteArrayOutputStream.toByteArray(), "utf-8");
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < str.length(); i3++) {
                    if (str.charAt(i3) == '\n') {
                        C0032k.a("read from item file = " + str.substring(i2, i3));
                        boolean a = a(str.substring(i2, i3 - 1), i);
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
        this.c.put(new Long(j), this.d);
        return this.d;
    }

    public Vector a(String str) {
        Vector vector = new Vector();
        try {
            InputStream resourceAsStream = getClass().getResourceAsStream(this.a + str);
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
                Vector vector2 = new Vector();
                for (int i2 = 0; i2 < str2.length(); i2++) {
                    if (str2.charAt(i2) == '\n') {
                        C0032k.a("read from item file = " + str2.substring(i, i2));
                        C0039s c0039s = new C0039s(str2.substring(i, i2 - 1));
                        if (!c0039s.a().contains("llama")) {
                            vector2.add(c0039s);
                        }
                        i = i2 + 1;
                    }
                }
                String[] strArr = new String[vector2.size()];
                int i3 = 0;
                for (int i4 = 0; i4 < vector2.size(); i4++) {
                    String a = ((C0039s) vector2.get(i4)).a();
                    C0032k.a("skill name = " + a);
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i3) {
                            break;
                        } else if (a.compareToIgnoreCase(strArr[i6]) < 0) {
                            i5 = i6;
                            break;
                        } else {
                            i5 = i6 + 1;
                            i6++;
                        }
                    }
                    C0032k.a("total skills = " + (i3 + 1) + "; skill order = " + i5);
                    String str3 = strArr[i5];
                    strArr[i5] = a;
                    for (int i7 = i5 + 1; i7 < i3 + 1; i7++) {
                        if (str3 != null) {
                            String str4 = strArr[i7];
                            strArr[i7] = str3;
                            str3 = str4;
                        }
                    }
                    i3++;
                }
                C0032k.a("skill name order:");
                for (int i8 = 0; i8 < strArr.length; i8++) {
                    String str5 = strArr[i8];
                    C0032k.a(i8 + ". " + str5);
                    int i9 = 0;
                    while (true) {
                        if (i9 < vector2.size()) {
                            C0039s c0039s2 = (C0039s) vector2.get(i9);
                            if (str5.compareToIgnoreCase(c0039s2.a()) == 0) {
                                vector.add(c0039s2);
                                break;
                            }
                            i9++;
                        }
                    }
                }
            }
        } catch (IOException e) {
            C0032k.a(e.getMessage());
        }
        return vector;
    }

    public boolean a(String str, int i) {
        switch (i) {
            case 0:
                this.d.a(str);
                return true;
            case 1:
                this.d.a(Long.parseLong(str));
                return true;
            case 2:
                this.d.b(str);
                return true;
            case 3:
                this.d.b(Long.parseLong(str));
                return true;
            case 4:
                this.d.c(str);
                return true;
            case 5:
                this.d.e(Long.parseLong(str));
                return true;
            case 6:
                this.d.d(str);
                return true;
            case 7:
                String str2 = null;
                long j = 1;
                int i2 = 0;
                long parseLong = Long.parseLong(str);
                C0032k.a("set details graphics = " + parseLong);
                int i3 = 0;
                while (true) {
                    if (i3 < this.b.length()) {
                        if (this.b.charAt(i3) == '\n') {
                            if (j == parseLong) {
                                String substring = this.b.substring(i2, i3 - 1);
                                str2 = substring.substring(str.length() + 1, substring.length());
                            } else {
                                j++;
                                i2 = i3 + 1;
                            }
                        }
                        i3++;
                    }
                }
                C0032k.a("graphics of skill = " + str2);
                this.d.e(str2);
                return true;
            case 8:
                this.d.f(str);
                return true;
            case 9:
                this.d.g(Long.parseLong(str));
                return true;
            case 10:
                this.d.h(Long.parseLong(str));
                return true;
            case C0000a.aW /* 11 */:
                this.d.i(Long.parseLong(str));
                return true;
            case C0000a.aX /* 12 */:
                this.d.f(Long.parseLong(str));
                return true;
            case C0000a.aY /* 13 */:
                this.d.d(Long.parseLong(str));
                return true;
            case C0000a.aZ /* 14 */:
                this.d.c(Long.parseLong(str));
                return true;
            default:
                C0032k.a("ItemDetailsManager.setDetails: Error! - invalid details index");
                return true;
        }
    }
}
