

/* renamed from: ax  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:ax.class */
public class C0022ax extends C0000a {
    public static final String a = "AM";
    public static final String b = "MX";
    public static final String c = "AA";
    public static final String d = "AC";
    public static final String e = "RP";
    public static final String f = "PC";
    public static final String g = "CI1";
    public static final String h = "MR";
    public static final String i = "SB";
    public static final String j = "BF";
    public static final String k = "CM";
    public static final String l = "CA";
    public static final String m = "EC";
    public static final String n = "SM";
    public static final String o = "SR";
    public static final String p = "ME";
    public static final String q = "IP";
    public static final String r = "AI";
    public static final String s = "TG";
    public static final String t = "BP";
    public static final String u = "RM";
    public static final String bR = "BC";
    public static final String bS = "MC";
    public static final String bT = "LO";
    public static final byte bU = 1;
    public static final byte bV = 2;
    public static final byte bW = 3;
    public static final byte bX = 4;
    public static final byte bY = 5;
    public static final byte bZ = 6;
    public static final byte ca = 7;
    public static final byte cb = 8;
    public static final byte cc = 9;
    public static final byte cd = 10;

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
        } else if (str.equalsIgnoreCase(f)) {
            b2 = 3;
        } else if (str.equalsIgnoreCase(i)) {
            b2 = 4;
        } else if (str.equalsIgnoreCase(j)) {
            b2 = 5;
        } else if (str.equalsIgnoreCase(o)) {
            b2 = 6;
        } else if (str.equalsIgnoreCase("ME")) {
            b2 = 7;
        } else if (str.equalsIgnoreCase(q)) {
            b2 = 8;
        } else if (str.equalsIgnoreCase(r)) {
            b2 = 9;
        } else if (str.equalsIgnoreCase(d)) {
            b2 = 2;
        } else if (str.equalsIgnoreCase(u)) {
            b2 = 10;
        }
        return b2;
    }

    public static String e() {
        return "MR\n";
    }

    public static String a(long j2, long j3) {
        return "CM|" + j2 + C0000a.v + j3 + C0000a.w;
    }

    public static String b(long j2, long j3) {
        return "CA|" + j2 + C0000a.v + j3 + C0000a.w;
    }

    public static String a(long j2, String str) {
        return "EC|" + j2 + C0000a.v + str + C0000a.w;
    }

    public static String a(long j2) {
        return "SM|" + j2 + C0000a.w;
    }

    public static String a(String str, String str2, long j2) {
        return "IP|" + str + C0000a.v + str2 + C0000a.v + j2 + C0000a.w;
    }

    public static String b(String str, String str2, long j2) {
        return "AI|" + str + C0000a.v + str2 + C0000a.v + j2 + C0000a.v + "Y" + C0000a.w;
    }

    public static String c(String str, String str2, long j2) {
        return "AI|" + str + C0000a.v + str2 + C0000a.v + j2 + C0000a.v + "N" + C0000a.w;
    }

    public static String d(String str, String str2, long j2) {
        return "RM|" + str + C0000a.v + str2 + C0000a.v + j2 + C0000a.v + "N" + C0000a.w;
    }

    public static String a(String str, String str2, long j2, String str3, int i2) {
        return "TG|" + str + C0000a.v + str2 + C0000a.v + j2 + C0000a.v + str3 + C0000a.v + i2 + C0000a.w;
    }

    public static String f() {
        return "BP\n";
    }

    public static String b(long j2) {
        return "BC|" + j2 + C0000a.w;
    }

    public static String c(long j2) {
        return "MC|" + j2 + C0000a.w;
    }

    public static String g() {
        return "LO\n";
    }

    public static String h() {
        return "AM\n";
    }

    public static String i() {
        return "AA\n";
    }

    public static String j() {
        return "RP\n";
    }

    public static String e(String str, String str2, long j2) {
        return "CI1|" + str + C0000a.v + str2 + C0000a.v + j2 + C0000a.w;
    }
}
