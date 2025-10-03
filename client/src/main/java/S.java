

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/* renamed from: S  reason: default package */
/* loaded from: hinterwars.jar:S.class */
public class S {
    static final int a = 0;
    static final int b = 1;
    static final int c = 2;
    static final int d = 3;
    static final int e = 4;
    static final int f = 5;
    static final int g = 6;
    static final int h = 7;
    static final int i = 8;
    static final int j = 9;
    static final int k = 10;
    static final int l = 11;
    static final int m = 12;
    static final int n = 13;
    static final int o = 14;
    static final int p = 15;
    static final int q = 16;
    static final int r = 17;
    static final int s = 18;
    static final int t = 19;
    private static final int N = 0;
    private static final int O = 1;
    private static final int P = 2;
    private static final int Q = 3;
    private static final int R = 4;
    private static final int S = 5;
    private static final int T = 6;
    private static final int U = 7;
    private static final int V = 8;
    private static final int W = 9;
    private static final int X = 10;
    private static final int Y = 11;
    private static final int Z = 12;
    private static final int aa = 13;
    private static final int ab = 14;
    private static final int ac = 15;
    private static final int ad = 16;
    private static final int ae = 17;
    private static final int af = 18;
    private static final int ag = 19;
    private static final int ah = 20;
    private static final int ai = 21;
    private static final int aj = 22;
    private static final int ak = 23;
    private static final int al = 24;
    private static final int am = 25;
    private static final int an = 26;
    private static final int ao = 27;
    private static final int ap = 28;
    private static final int aq = 29;
    private static final int ar = 30;
    private static final int as = 31;
    private static final int at = 32;
    private static final int au = 33;
    private static final int av = 34;
    private static final int aw = 35;
    private Icon[][] ax;
    private int ay;
    private int az;
    private int[] aA;
    static final int u = 0;
    static final int v = 1;
    static final int w = 2;
    static final int x = 3;
    static final int y = 4;
    static final int z = 5;
    static final int A = 6;
    static final int B = 7;
    static final int C = 8;
    int D;
    int E;
    int F;
    int G;
    public static final byte H = 2;
    public static final byte I = 3;
    private int aH;
    public static final int J = 0;
    public static final int K = 1;
    public static final int L = 2;
    public static final int M = 3;
    private final int aB = 0;
    private final int aC = 1;
    private final int aD = 2;
    private final int aE = 3;
    private final int aF = 4;
    private final int aG = 5;
    private final byte aI = 0;
    private final byte aJ = 1;
    private final byte aK = 2;
    private final byte aL = 3;
    private final byte aM = 4;
    private final byte aN = 5;

    public S(String str) {
        if (str == null) {
            C0032k.a("BasePlayerGraphics.load: Error! - null txtFile dir");
        } else {
            b(a(str));
        }
    }

    private String a(String str) {
        String str2 = null;
        try {
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
                str2 = new String(byteArrayOutputStream.toByteArray(), "utf-8");
            } else {
                C0032k.a("BasePlayerGraphics.loadFileContents: Error! - problem with loading graphics for " + str);
            }
        } catch (IOException e2) {
            C0032k.a(e2.getMessage());
        }
        return str2;
    }

    private void b(String str) {
        this.ax = new Icon[36][4];
        this.ay = 0;
        this.az = 0;
        this.aA = new int[6];
        for (int i2 = 0; i2 < this.aA.length; i2++) {
            this.aA[i2] = -1;
        }
        this.aH = 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            if (str.charAt(i5) == '\n') {
                C0032k.a(str.substring(i4, i5 - 1));
                if (a(i3, str.substring(i4, i5 - 1))) {
                    i3++;
                }
                i4 = i5 + 1;
            }
        }
    }

    private boolean a(int i2, String str) {
        switch (i2) {
            case 0:
                this.D = Integer.parseInt(str);
                return true;
            case 1:
                this.E = Integer.parseInt(str);
                return true;
            case 2:
                this.F = Integer.parseInt(str);
                return true;
            case 3:
                this.G = Integer.parseInt(str);
                return true;
            case 4:
                int i3 = 0;
                while (i3 < this.aA.length) {
                    if (this.aA[i3] < 0) {
                        this.aA[i3] = Integer.parseInt(str);
                        return i3 == this.aA.length - 1;
                    }
                    i3++;
                }
                return true;
            case 5:
                if (!str.equalsIgnoreCase("") && str != null) {
                    C0032k.a("baseGraphics[" + this.ay + "][" + this.az + "] - ");
                    this.ax[this.ay][this.az] = new ImageIcon(getClass().getResource(str));
                    C0032k.a(this.ax[this.ay][this.az]);
                }
                this.az++;
                if (this.az >= this.aA[this.aH]) {
                    this.az = 0;
                    this.ay++;
                    if (this.ay == 0 || this.ay % 8 != 0) {
                        return false;
                    }
                    this.aH++;
                    return false;
                }
                return false;
            default:
                C0032k.a("BasePlayer parseString: invalid currentIndex");
                return false;
        }
    }

    public int a() {
        return this.aA[2];
    }

    public Icon[][] b() {
        Icon[][] iconArr = new Icon[16][4];
        iconArr[0][0] = this.ax[0][0];
        iconArr[1][0] = this.ax[1][0];
        iconArr[2][0] = this.ax[2][0];
        iconArr[3][0] = this.ax[3][0];
        iconArr[4][0] = this.ax[4][0];
        iconArr[5][0] = this.ax[5][0];
        iconArr[6][0] = this.ax[6][0];
        iconArr[7][0] = this.ax[7][0];
        iconArr[8] = this.ax[8];
        iconArr[9] = this.ax[9];
        iconArr[10] = this.ax[10];
        iconArr[11] = this.ax[11];
        iconArr[12] = this.ax[12];
        iconArr[13] = this.ax[13];
        iconArr[14] = this.ax[14];
        iconArr[15] = this.ax[15];
        return iconArr;
    }

    public int[] c() {
        int[] iArr = {this.aA[1], this.aA[2], this.aA[3], this.aA[5], 3, 2, 3, 2, 4};
        for (int i2 = 0; i2 < this.aA.length; i2++) {
            C0032k.a("baseFrames[" + i2 + "] - " + this.aA[i2]);
        }
        for (int i3 = 0; i3 < iArr.length; i3++) {
            C0032k.a("maxFrames[" + i3 + "] - " + iArr[i3]);
        }
        return iArr;
    }

    public Icon[] d() {
        Icon[] iconArr = new Icon[this.ax[11].length + 1];
        iconArr[0] = this.ax[3][0];
        for (int i2 = 1; i2 < iconArr.length; i2++) {
            iconArr[i2] = this.ax[11][i2 - 1];
        }
        return iconArr;
    }

    public Icon e() {
        return this.ax[5][0];
    }

    public Icon[][] a(int i2) {
        Icon[][] iconArr = new Icon[20][4];
        iconArr[0] = this.ax[0];
        iconArr[1] = this.ax[1];
        iconArr[2] = this.ax[2];
        iconArr[3] = this.ax[3];
        iconArr[4] = this.ax[8];
        iconArr[5] = this.ax[9];
        iconArr[6] = this.ax[10];
        iconArr[7] = this.ax[11];
        switch (i2) {
            case 0:
                iconArr[8] = this.ax[16];
                iconArr[9] = this.ax[17];
                iconArr[10] = this.ax[18];
                iconArr[11] = this.ax[19];
                break;
            case 1:
                iconArr[8] = this.ax[20];
                iconArr[9] = this.ax[21];
                iconArr[10] = this.ax[22];
                iconArr[11] = this.ax[23];
                break;
            case 2:
                iconArr[8] = this.ax[24];
                iconArr[9] = this.ax[25];
                iconArr[10] = this.ax[26];
                iconArr[11] = this.ax[27];
                break;
            case 3:
                iconArr[8] = this.ax[28];
                iconArr[9] = this.ax[29];
                iconArr[10] = this.ax[30];
                iconArr[11] = this.ax[31];
                break;
            default:
                C0032k.a("GameData.getCombatHumanHeadBaseGraphics: Error! - Invalid WeaponType ID");
                return null;
        }
        iconArr[12] = this.ax[32];
        iconArr[13] = this.ax[33];
        iconArr[14] = this.ax[34];
        iconArr[15] = this.ax[35];
        iconArr[16][0] = this.ax[20][0];
        iconArr[17][0] = this.ax[21][0];
        iconArr[18][0] = this.ax[22][0];
        iconArr[19][0] = this.ax[23][0];
        return iconArr;
    }

    public int f() {
        return this.D;
    }

    public int g() {
        return this.E;
    }

    public int h() {
        return this.F;
    }

    public int i() {
        return this.G;
    }
}
