

import javax.swing.Icon;
import javax.swing.ImageIcon;

/* renamed from: D  reason: default package */
/* loaded from: hinterwars.jar:D.class */
public class D {
    private final int H = 0;
    private final int I = 1;
    private final int J = 2;
    private final int K = 3;
    private final int L = 4;
    static final int a = 0;
    static final int b = 1;
    static final int c = 2;
    static final int d = 3;
    static final int e = 4;
    static final int f = 5;
    static final int g = 6;
    static final int h = 7;
    static final int i = 8;
    static final int j = 0;
    static final int k = 1;
    static final int l = 2;
    static final int m = 3;
    static final int n = 4;
    static final int o = 5;
    static final int p = 6;
    static final int q = 7;
    static final int r = 8;
    static final int s = 9;
    static final int t = 10;
    static final int u = 11;
    static final int v = 12;
    static final int w = 13;
    static final int x = 14;
    static final int y = 15;
    static final int z = 16;
    static final int A = 17;
    static final int B = 18;
    static final int C = 19;
    private static final int M = 0;
    private static final int N = 1;
    private static final int O = 2;
    private static final int P = 3;
    private static final int Q = 4;
    private static final int R = 5;
    private static final int S = 6;
    private static final int T = 7;
    private static final int U = 8;
    private static final int V = 9;
    private static final int W = 10;
    private static final int X = 11;
    private static final int Y = 12;
    private static final int Z = 13;
    private static final int aa = 14;
    private static final int ab = 15;
    private static final int ac = 16;
    private static final int ad = 17;
    private static final int ae = 18;
    private static final int af = 19;
    private static final int ag = 20;
    private static final int ah = 21;
    private static final int ai = 22;
    private static final int aj = 23;
    private static final int ak = 24;
    private static final int al = 25;
    private static final int am = 26;
    private static final int an = 27;
    private static final int ao = 28;
    private static final int ap = 29;
    private static final int aq = 30;
    private static final int ar = 31;
    private static final int as = 32;
    private static final int at = 33;
    private static final int au = 34;
    private static final int av = 35;
    private long aw;
    private String ax;
    private Icon ay;
    private int[] az;
    private String[][] aA;
    private int aB;
    private int aC;
    private Icon[][] aD;
    private int aE;
    private int aF;
    private int aG;
    private int aH;
    private String aI;
    private String aJ;
    private int aK;
    private String aL;
    private int aM;
    private int aN;
    private int aO;
    private String aP;
    private String aQ;
    private String aR;
    private int aS;
    private String aT;
    private String aU;
    private String aV;
    private int aW;
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;

    public D(long j2) {
        this.aw = j2;
    }

    public long a() {
        return this.aw;
    }

    public void a(String str) {
        C0032k.a("graphics = " + str);
        this.ay = new ImageIcon(getClass().getResource(str));
    }

    public Icon b() {
        return this.ay;
    }

    public void b(String str) {
        this.ax = str;
    }

    public String c() {
        return this.ax;
    }

    public void c(String str) {
        this.aU = str;
    }

    public String d() {
        return this.aU;
    }

    public void d(String str) {
        this.aV = str;
    }

    public String e() {
        return this.aV;
    }

    public void e(String str) {
        this.aI = str;
    }

    public String f() {
        return this.aI;
    }

    public void f(String str) {
        this.aJ = str;
    }

    public String g() {
        return this.aJ;
    }

    public void a(int i2) {
        this.aK = i2;
    }

    public int h() {
        return this.aK;
    }

    public void g(String str) {
        this.aL = str;
    }

    public String i() {
        return this.aL;
    }

    public void b(int i2) {
        this.aM = i2;
    }

    public int j() {
        return this.aM;
    }

    public void c(int i2) {
        this.aN = i2;
    }

    public int k() {
        return this.aN;
    }

    public void h(String str) {
        this.aP = str;
    }

    public String l() {
        return this.aP;
    }

    public void i(String str) {
        this.aQ = str;
    }

    public String m() {
        return this.aQ;
    }

    public void j(String str) {
        this.aR = str;
    }

    public String n() {
        return this.aR;
    }

    public void k(String str) {
        this.aS = Integer.parseInt(str);
    }

    public int o() {
        return this.aS;
    }

    public void l(String str) {
        this.aT = str;
    }

    public String p() {
        return this.aT;
    }

    public void d(int i2) {
        this.az = new int[i2];
        for (int i3 = 0; i3 < this.az.length; i3++) {
            this.az[i3] = -1;
        }
    }

    public boolean e(int i2) {
        for (int i3 = 0; i3 < this.az.length; i3++) {
            if (this.az[i3] == -1) {
                this.az[i3] = i2;
                if (i3 != this.az.length - 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public void a(int i2, int i3) {
        this.aA = new String[i2][i3];
        this.aD = new Icon[i2][i3];
    }

    public boolean m(String str) {
        this.aA[this.aB][this.aC] = str;
        this.aC++;
        if (this.aC >= h(this.aB)) {
            this.aC = 0;
            this.aB++;
        }
        return this.aB >= this.aA.length;
    }

    private int h(int i2) {
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                C0032k.a("maxFrames = " + this.az);
                for (int i3 = 0; i3 < this.az.length; i3++) {
                    C0032k.a("maxFrames[" + i3 + "] = " + this.az[i3]);
                }
                return this.az[0] > this.az[1] ? this.az[0] : this.az[1];
            case 8:
            case 9:
            case 10:
            case C0000a.aW /* 11 */:
            case C0000a.aX /* 12 */:
            case C0000a.aY /* 13 */:
            case C0000a.aZ /* 14 */:
            case 15:
                return this.az[2];
            case C0000a.bb /* 16 */:
            case C0000a.bc /* 17 */:
            case C0000a.bd /* 18 */:
            case C0000a.be /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                return this.az[3];
            case 32:
            case 33:
            case 34:
            case 35:
                return this.az[4];
            default:
                C0032k.a("ItemDetails.getMaxFrameIndex: Error! - invalid state");
                return -1;
        }
    }

    private Icon[] i(int i2) {
        if (this.aD[i2][h(i2) - 1] == null) {
            for (int i3 = 0; i3 < this.aD[i2].length; i3++) {
                if (this.aA[i2][i3] != "" && this.aA[i2][i3] != null) {
                    C0032k.a("animationStr[" + i2 + "][" + i3 + "]");
                    C0032k.a("- " + this.aA[i2][i3]);
                    if (null == getClass().getResource(this.aA[i2][i3])) {
                        C0032k.a("GetResource is null");
                    }
                    this.aD[i2][i3] = new ImageIcon(getClass().getResource(this.aA[i2][i3]));
                    C0032k.a("Loaded successfully");
                }
            }
        }
        return this.aD[i2];
    }

    private Icon b(int i2, int i3) {
        if (this.aD[i2][i3] == null) {
            C0032k.a("animationStr[" + i2 + "][" + i3 + "]");
            C0032k.a("- \"" + this.aA[i2][i3] + "\"");
            if (this.aA[i2][i3].equals("")) {
                C0032k.a("empty string");
            }
            if (this.aA[i2][i3].length() > 2) {
                C0032k.a("got in");
                this.aD[i2][i3] = new ImageIcon(getClass().getResource(this.aA[i2][i3]));
            }
        }
        return this.aD[i2][i3];
    }

    public int[] q() {
        return new int[]{this.az[1], this.az[2], this.az[3], this.az[4], 3, 2, 3, 2, 4};
    }

    public Icon[][] f(int i2) {
        Icon[][] iconArr = new Icon[20][4];
        iconArr[0] = i(0);
        iconArr[1] = i(1);
        iconArr[2] = i(2);
        iconArr[3] = i(3);
        iconArr[4] = i(8);
        iconArr[5] = i(9);
        iconArr[6] = i(10);
        iconArr[7] = i(11);
        switch (i2) {
            case 0:
                iconArr[8] = i(16);
                iconArr[9] = i(17);
                iconArr[10] = i(18);
                iconArr[11] = i(19);
                break;
            case 1:
                for (int i3 = 0; i3 < this.aA.length; i3++) {
                    for (int i4 = 0; i4 < this.aA[0].length; i4++) {
                        C0032k.a("animationStr[" + i3 + "][" + i4 + "]" + this.aA[i3][i4]);
                    }
                }
                iconArr[8] = i(20);
                iconArr[9] = i(21);
                iconArr[10] = i(22);
                iconArr[11] = i(23);
                break;
            case 2:
                for (int i5 = 0; i5 < this.aA.length; i5++) {
                    for (int i6 = 0; i6 < this.aA[0].length; i6++) {
                        C0032k.a("animationStr[" + i5 + "][" + i6 + "]" + this.aA[i5][i6]);
                    }
                }
                iconArr[8] = i(24);
                iconArr[9] = i(25);
                iconArr[10] = i(26);
                iconArr[11] = i(27);
                break;
            case 3:
                iconArr[8] = i(28);
                iconArr[9] = i(29);
                iconArr[10] = i(30);
                iconArr[11] = i(31);
                break;
            default:
                C0032k.a("GameData.getCombatHumanHeadBaseGraphics: Error! - Invalid WeaponType ID");
                return null;
        }
        iconArr[12] = i(32);
        iconArr[13] = i(33);
        iconArr[14] = i(34);
        iconArr[15] = i(35);
        C0032k.a("before ue");
        iconArr[16][0] = b(20, 0);
        iconArr[17][0] = b(21, 0);
        iconArr[18][0] = b(22, 0);
        iconArr[19][0] = b(23, 0);
        return iconArr;
    }

    public int r() {
        return this.az[2];
    }

    public Icon[][] s() {
        Icon[][] iconArr = new Icon[16][4];
        iconArr[0][0] = b(0, 0);
        iconArr[1][0] = b(1, 0);
        iconArr[2][0] = b(2, 0);
        iconArr[3][0] = b(3, 0);
        iconArr[4][0] = b(4, 0);
        iconArr[5][0] = b(5, 0);
        iconArr[6][0] = b(6, 0);
        iconArr[7][0] = b(7, 0);
        iconArr[8] = i(8);
        iconArr[9] = i(9);
        iconArr[10] = i(10);
        iconArr[11] = i(11);
        iconArr[12] = i(12);
        iconArr[13] = i(13);
        iconArr[14] = i(14);
        iconArr[15] = i(15);
        return iconArr;
    }

    public Icon[] t() {
        Icon[] iconArr = new Icon[i(11).length + 1];
        iconArr[0] = b(3, 0);
        for (int i2 = 1; i2 < iconArr.length; i2++) {
            iconArr[i2] = i(11)[i2 - 1];
        }
        return iconArr;
    }

    public void n(String str) {
        this.aE = Integer.parseInt(str);
    }

    public int u() {
        return this.aE;
    }

    public void o(String str) {
        this.aF = Integer.parseInt(str);
    }

    public int v() {
        return this.aF;
    }

    public void p(String str) {
        this.aG = Integer.parseInt(str);
    }

    public int w() {
        return this.aG;
    }

    public void q(String str) {
        this.aH = Integer.parseInt(str);
    }

    public int x() {
        return this.aH;
    }

    public void g(int i2) {
        this.aW = i2;
    }

    public int y() {
        return this.aW;
    }

    public String z() {
        String[] split;
        String str = c().toUpperCase() + "\n\nRange: " + g() + " tiles\nRequired Level: " + l() + C0000a.w + "Race Restriction: " + e() + C0000a.w + "Weight: " + k() + C0000a.w + "Effect: \n";
        for (int i2 = 0; i2 < p().split(";").length; i2++) {
            str = str + "      " + split[i2] + C0000a.w;
        }
        return str;
    }

    public boolean equals(Object obj) {
        if (obj.getClass() == getClass()) {
            return this.aw == ((D) obj).aw;
        }
        C0032k.a("not true not same class");
        return false;
    }
}
