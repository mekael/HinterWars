

import java.util.Hashtable;

/* renamed from: h  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:h.class */
public class C0029h {
    Hashtable[] b;
    public static final byte c = 0;
    public static final byte d = 1;
    public static final byte e = 2;
    public static final byte f = 3;
    public static final byte g = 0;
    public static final byte h = 1;
    public static final byte i = 2;
    public static final byte j = 0;
    public static final byte k = 1;
    public static final byte l = 2;
    public static final byte m = 0;
    public static final byte n = 1;
    public static final byte o = 2;
    public static final byte p = 0;
    public static final byte q = 1;
    public static final byte r = 2;
    public static final byte s = 0;
    public static final byte t = 1;
    public static final byte u = 2;
    public static final byte v = 0;
    public static final byte w = 1;
    public static final byte x = 2;
    public static final byte y = 0;
    public static final byte z = 1;
    public static final byte A = 2;
    public static final byte B = 0;
    public static final byte C = 1;
    public static final byte D = 2;
    private final String[][] E = {new String[]{"res/items/humanHeadBlue.txt", "res/items/humanHeadRed.txt", "res/items/humanHeadYellow.txt"}, new String[]{"res/items/taikusHeadPurple.txt", "res/items/taikusHeadRed.txt", "res/items/taikusHeadGreen.txt"}, new String[]{"res/items/firanHeadPink.txt", "res/items/firanHeadPurple.txt", "res/items/firanHeadOrange.txt"}, new String[]{"res/items/brucianHeadBlue.txt", "res/items/brucianHeadRed.txt", "res/items/brucianHeadGreen.txt"}};
    private final String[][] F = {new String[]{"res/items/humanArmorBlue.txt", "res/items/humanArmorRed.txt", "res/items/humanArmorGreen.txt"}, new String[]{"res/items/taikusArmorPurple.txt", "res/items/taikusArmorRed.txt", "res/items/taikusArmorGreen.txt"}, new String[]{"res/items/firanArmorPink.txt", "res/items/firanArmorBlue.txt", "res/items/firanArmorGreen.txt"}, new String[]{"res/items/brucianArmorBlue.txt", "res/items/brucianArmorPurple.txt", "res/items/brucianArmorOrange.txt"}};
    Hashtable[] a = new Hashtable[4];

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String[], java.lang.String[][]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String[], java.lang.String[][]] */
    public C0029h() {
        this.a[0] = new Hashtable();
        this.a[1] = new Hashtable();
        this.a[2] = new Hashtable();
        this.a[3] = new Hashtable();
        this.b = new Hashtable[4];
        this.b[0] = new Hashtable();
        this.b[1] = new Hashtable();
        this.b[2] = new Hashtable();
        this.b[3] = new Hashtable();
    }

    public S a(int i2, int i3) {
        int i4 = i2 - 1;
        S s2 = (S) this.a[i4].get(new Integer(i3));
        if (s2 == null) {
            s2 = new S(this.E[i4][i3]);
            this.a[i4].put(new Integer(i3), s2);
        }
        return s2;
    }

    public S b(int i2, int i3) {
        int i4 = i2 - 1;
        S s2 = (S) this.b[i4].get(new Integer(i3));
        if (s2 == null) {
            s2 = new S(this.F[i4][i3]);
            this.b[i4].put(new Integer(i3), s2);
        }
        return s2;
    }
}
