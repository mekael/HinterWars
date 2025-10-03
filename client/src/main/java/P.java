package defpackage;

/* renamed from: P  reason: default package */
/* loaded from: hinterwars.jar:P.class */
public class P extends C0000a {
    public static final String a = "N5";
    public static final String b = "N7";
    public static final String c = "N6";
    public static final String d = "N8";
    public static final String e = "N9";
    public static final String f = "Q1";
    public static final String g = "Q2";
    public static final String h = "Q3";
    public static final String i = "Q27";
    public static final String j = "Q28";
    public static final String k = "Q29";
    public static final String l = "Q30";
    public static final String m = "Q7";
    public static final String n = "Q9";
    public static final String o = "Q10";
    public static final byte p = 1;
    public static final byte q = 2;
    public static final byte r = 3;
    public static final byte s = 4;
    public static final byte t = 5;
    public static final byte u = 6;
    public static final byte bR = 7;
    public static final byte bS = 8;
    public static final byte bT = 9;
    public static final byte bU = 10;

    public static byte a(String[] strArr) {
        byte b2 = 0;
        if (strArr.length < 1) {
            return (byte) 0;
        }
        String str = strArr[0];
        if (str.equalsIgnoreCase(C0000a.aF)) {
            b2 = -1;
        } else if (str.equalsIgnoreCase(b)) {
            b2 = 1;
        } else if (str.equalsIgnoreCase(c)) {
            b2 = 2;
        } else if (str.equalsIgnoreCase(d)) {
            b2 = 3;
        } else if (str.equalsIgnoreCase(g)) {
            b2 = 4;
        } else if (str.equalsIgnoreCase(h)) {
            b2 = 5;
        } else if (str.equalsIgnoreCase(i)) {
            b2 = 6;
        } else if (str.equalsIgnoreCase(n)) {
            b2 = 7;
        } else if (str.equalsIgnoreCase(o)) {
            b2 = 8;
        } else if (str.equalsIgnoreCase("Q29")) {
            b2 = 9;
        } else if (str.equalsIgnoreCase("Q30")) {
            b2 = 10;
        }
        return b2;
    }

    public static String e() {
        return "N5\n";
    }

    public static String f() {
        return "N9\n";
    }

    public static String a(long j2) {
        return "Q1|" + j2 + C0000a.w;
    }

    public static String b(long j2) {
        return "Q7|" + j2 + C0000a.w;
    }

    public static String a(long j2, long j3) {
        return "Q28|" + j2 + C0000a.v + j3 + C0000a.w;
    }
}
