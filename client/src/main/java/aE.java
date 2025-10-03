

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

/* renamed from: aE  reason: default package */
/* loaded from: hinterwars.jar:aE.class */
public class aE {
    String a;

    public aE(String str) {
        try {
            C0032k.a("Trying to load " + str);
            InputStream resourceAsStream = getClass().getResourceAsStream(str);
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
                this.a = new String(byteArrayOutputStream.toByteArray(), "utf-8");
            } else {
                C0032k.a("is = null");
            }
        } catch (IOException e) {
            C0032k.a(e.toString());
        }
    }

    String a(String str) {
        if ('\"' == str.charAt(0) && '\"' == str.charAt(str.length() - 1)) {
            str = str.substring(1, str.length() - 1);
        }
        return str;
    }

    public String a(String str, int i) {
        return a(d(str, i));
    }

    public int b(String str, int i) {
        return Integer.parseInt(d(str, i));
    }

    public char c(String str, int i) {
        return d(str, i).charAt(0);
    }

    public String d(String str, int i) {
        String num = Integer.toString(i);
        if (this.a == null) {
            return null;
        }
        String str2 = new String("[" + str.trim() + "]");
        int i2 = 0;
        while (i2 < this.a.length() && !this.a.regionMatches(true, i2, str2, 0, str2.length())) {
            i2++;
        }
        if (i2 == this.a.length()) {
            return "String not defined";
        }
        String str3 = num.trim() + "=";
        int length = i2 + str2.length();
        while (length < this.a.length() && !this.a.regionMatches(true, length, str3, 0, str3.length())) {
            length++;
        }
        if (length == this.a.length()) {
            C0032k.a("Key not found");
            return "String not defined";
        }
        return this.a.substring(length + str3.length(), this.a.indexOf(10, length + str3.length()) - 1).trim();
    }

    public int[] e(String str, int i) {
        String[] a = a(str, i, 0, 0);
        int[] iArr = new int[a.length];
        for (int i2 = 0; i2 < a.length; i2++) {
            iArr[i2] = Integer.parseInt(a[i2]);
        }
        return iArr;
    }

    public int a(String str, int i, int i2) {
        return e(str, i)[i2];
    }

    public String b(String str, int i, int i2) {
        return a(str, i, 0, 0)[i2];
    }

    public String[] a(String str, int i, int i2, int i3) {
        String d;
        if (this.a == null || null == (d = d(str, i))) {
            return null;
        }
        int i4 = 0;
        int i5 = 0;
        Vector vector = new Vector();
        int i6 = 0;
        while (i6 < d.length()) {
            boolean z = false;
            if ('\"' == d.charAt(i6)) {
                i4++;
            } else if (',' == d.charAt(i6) && 0 == i4 % 2) {
                z = true;
            }
            if (i6 == d.length() - 1) {
                i6++;
                z = true;
            }
            if (true == z) {
                String substring = d.substring(i5, i6);
                i5 = i6 + 1;
                vector.addElement(a(substring.trim()));
            }
            i6++;
        }
        String[] strArr = i3 == -1 ? new String[(vector.size() - 1) - i2] : (i3 == 0 || i3 > vector.size()) ? new String[vector.size() - i2] : new String[i3 - i2];
        int length = strArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            strArr[i7] = (String) vector.elementAt(i2);
            i2++;
        }
        vector.removeAllElements();
        return strArr;
    }

    public int[] b(String str) {
        String[] c = c(str);
        int[] iArr = new int[c.length];
        for (int i = 0; i < c.length; i++) {
            iArr[i] = Integer.parseInt(c[i]);
        }
        return iArr;
    }

    public String[] c(String str) {
        if (this.a == null) {
            return null;
        }
        C0032k.a("finding section");
        String str2 = new String("[" + str.trim() + "]");
        int i = 0;
        while (i < this.a.length() && !this.a.regionMatches(true, i, str2, 0, str2.length())) {
            i++;
        }
        if (i == this.a.length()) {
            C0032k.a("Section not found");
            return null;
        }
        int length = i + str2.length();
        while (length < this.a.length() && !this.a.regionMatches(true, length, "\n[", 0, "\n[".length())) {
            length++;
        }
        String substring = this.a.substring(i + str2.length() + 2, length - 1);
        C0032k.a(substring);
        String[] strArr = new String[Integer.parseInt(substring.substring(substring.lastIndexOf(10, length) + 1, substring.lastIndexOf(61, length))) + 1];
        int i2 = 0;
        int i3 = 0;
        while (i3 < substring.length()) {
            int indexOf = substring.indexOf(10, i3);
            C0032k.a(indexOf);
            if (indexOf == -1) {
                indexOf = substring.length() + 1;
            }
            strArr[i2] = substring.substring(substring.indexOf(61, i3) + 1, indexOf - 1);
            i2++;
            i3 = indexOf + 1;
        }
        return strArr;
    }
}
