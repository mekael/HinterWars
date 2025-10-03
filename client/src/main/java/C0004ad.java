

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.Icon;

/* renamed from: ad  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:ad.class */
public class C0004ad extends AbstractC0003ac {
    private int aC;
    private int aD;
    private int aE;
    private long aF;
    private long aG;
    private long aH;
    private long aI;
    private long aJ;
    private long aK;
    private long aL;
    private long aM;
    private long aN;
    private long aO;
    private long aP;
    private long aQ;
    private long aR;
    private long aS;
    private long aT;
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
    long D;
    String E;
    Color F;
    PrintWriter G;
    Vector[] H;
    static final byte I = 0;
    static final byte J = 1;
    static final byte K = 2;
    static final byte L = 3;
    Vector M;
    Icon[][] N;
    int O;
    int P;
    int Q;
    Icon[][] R;
    int S;
    int T;
    int U;
    BufferedImage V;
    Icon W;
    Icon[] X;
    int Y;
    long Z;
    long aa;
    boolean ab;
    long ac;
    C0011ak ad;
    int ae;
    long ag;
    boolean ah;
    int ai;
    long aj;
    boolean ak;
    int al;
    int am;
    int an;
    int ao;
    int ap;
    int aq;
    int ar;
    int as;
    int at;
    int au;
    int av;
    int aw;
    int ax;
    int ay;
    int aA;
    int aB;
    final byte z = 16;
    final byte A = 17;
    int B = 132;
    int C = 172;
    String af = "";
    Vector az = new Vector();

    public void a(int i) {
        this.aC = i;
    }

    public int m() {
        return this.aC;
    }

    public void b(long j2) {
        this.aF = j2;
    }

    public long n() {
        return this.aF;
    }

    public void c(long j2) {
        this.aG = j2;
    }

    public long o() {
        return this.aG;
    }

    public void d(long j2) {
        this.aQ = j2;
    }

    public long p() {
        return this.aQ;
    }

    public void e(long j2) {
        this.aP = j2;
    }

    public long q() {
        return this.aP;
    }

    public void f(long j2) {
        this.aI = j2;
    }

    public long r() {
        return this.aI;
    }

    public void g(long j2) {
        this.aH = j2;
    }

    public long s() {
        return this.aH;
    }

    public void h(long j2) {
        this.aK = j2;
    }

    public long t() {
        return this.aK;
    }

    public void i(long j2) {
        this.aL = j2;
    }

    public long u() {
        return this.aL;
    }

    public void j(long j2) {
        this.aO = j2;
    }

    public long v() {
        return this.aO;
    }

    public void k(long j2) {
        this.aJ = j2;
    }

    public long w() {
        return this.aJ;
    }

    public void l(long j2) {
        this.aM = j2;
    }

    public long x() {
        return this.aM;
    }

    public void m(long j2) {
        this.aR = j2;
    }

    public long y() {
        return this.aR;
    }

    public void n(long j2) {
        this.aS = j2;
    }

    public long z() {
        return this.aS;
    }

    public void o(long j2) {
        this.aT = j2;
    }

    public long A() {
        return this.aT;
    }

    public void p(long j2) {
        this.aN = j2;
    }

    public long B() {
        return this.aN;
    }

    public int C() {
        return this.aD;
    }

    public void b(int i) {
        this.aD = i;
    }

    public int D() {
        return this.aE;
    }

    public void c(int i) {
        this.aE = i;
    }

    @Override // defpackage.AbstractC0003ac
    public int a() {
        return 1;
    }

    @Override // defpackage.AbstractC0003ac
    public boolean a(AbstractC0003ac abstractC0003ac) {
        return false;
    }

    @Override // defpackage.AbstractC0003ac
    public boolean b(AbstractC0003ac abstractC0003ac) {
        return false;
    }

    @Override // defpackage.AbstractC0003ac
    public Enumeration b() {
        return null;
    }

    @Override // defpackage.AbstractC0003ac
    public void d() {
        this.H = new Vector[4];
        this.H[0] = new Vector();
        this.H[1] = new Vector();
        this.H[2] = new Vector();
        this.H[3] = new Vector();
        this.M = new Vector();
    }

    public void a(Icon[][] iconArr, int i, int i2, int i3, Icon[][] iconArr2, int i4, int i5, int i6, BufferedImage bufferedImage, Icon icon, Icon[] iconArr3) {
        this.N = iconArr;
        this.O = i2;
        this.P = i3;
        this.Q = i;
        this.R = iconArr2;
        this.S = i5;
        this.T = i6;
        this.U = i4;
        this.V = bufferedImage;
        this.W = icon;
        this.X = iconArr3;
        this.ad = C0011ak.m();
        this.ad.a((byte) 1);
        this.Y = 0;
        this.Z = 0L;
        this.aa = 0L;
        this.ab = false;
        this.ac = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i) {
        this.ae = i;
    }

    public void a(String str) {
        C0032k.a("ID - " + this.D + " says:" + str);
        this.af = str;
        this.ag = System.currentTimeMillis() + 5000;
        this.ah = true;
    }

    public void e(int i) {
        this.ai = i;
        this.aj = System.currentTimeMillis() + 5000;
        this.ak = true;
    }

    @Override // defpackage.AbstractC0003ac
    public int k() {
        return this.ap;
    }

    @Override // defpackage.AbstractC0003ac
    public int l() {
        return this.aq;
    }

    @Override // defpackage.AbstractC0003ac
    public int i() {
        return this.ar;
    }

    @Override // defpackage.AbstractC0003ac
    public int j() {
        return this.as;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f(int i) {
        return (0 - i) + this.B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g(int i) {
        return (0 - i) + this.C;
    }

    int h(int i) {
        return (0 - this.al) + this.B;
    }

    int i(int i) {
        return ((0 - this.am) + this.C) - 13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2) {
        this.an = i;
        this.ao = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i, int i2) {
        this.ar = i;
        this.as = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E() {
        this.ap = this.al + this.an;
        this.aq = this.am + this.ao + 12;
        this.at = this.ap + (this.ar / 2);
        this.au = this.aq + (this.as / 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(int i, int i2) {
        this.az.add(new Dimension(i + this.an + (this.ar / 2), i2 + this.ao + (this.as / 2)));
        if (this.az.size() == 1) {
            F();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i, int i2) {
        this.ax = i;
        this.ay = i2;
        this.av = this.ax - (this.ar / 2);
        this.aw = this.ay - (this.as / 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F() {
        if (this.az.size() != 0) {
            Dimension dimension = (Dimension) this.az.get(0);
            d(dimension.width, dimension.height);
            this.az.remove(0);
            return;
        }
        this.ab = false;
        switch (this.ae) {
            case 8:
                this.ae = 0;
                break;
            case 9:
                this.ae = 1;
                break;
            case 10:
                this.ae = 2;
                break;
            case 11:
                this.ae = 3;
                break;
            case 12:
                this.ae = 4;
                break;
            case 13:
                this.ae = 5;
                break;
            case 14:
                this.ae = 6;
                break;
            case 15:
                this.ae = 7;
                break;
        }
        this.Y = 0;
        d(this.at, this.au);
        if (this.G != null) {
            this.G.write("WK|" + h(this.al) + C0000a.v + i(this.am) + C0000a.v + this.ae + C0000a.w);
            this.G.flush();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G() {
        this.ay -= (this.as / 2) + 4;
        d(this.ax, this.ay);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H() {
        this.ay += (this.as / 2) + 4;
        d(this.ax, this.ay);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I() {
        this.ax -= (this.ar / 2) + 4;
        d(this.ax, this.ay);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J() {
        this.ax += (this.ar / 2) + 4;
        d(this.ax, this.ay);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K() {
        G();
        J();
        this.ay += 4;
        d(this.ax, this.ay);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L() {
        G();
        I();
        this.ay += 4;
        d(this.ax, this.ay);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M() {
        H();
        J();
        this.ay -= 4;
        d(this.ax, this.ay);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N() {
        H();
        I();
        this.ay -= 4;
        d(this.ax, this.ay);
    }

    public void e(int i, int i2) {
        this.aA = i;
        this.aB = i2;
    }

    private boolean f(int i, int i2) {
        int[] iArr = new int[this.aA * this.aB];
        E();
        this.V.getRGB((this.ap - (this.aA / 2)) + i, (this.aq - (this.aB / 2)) + i2, this.aA, this.aB, iArr, 0, this.aA);
        for (int i3 : iArr) {
            if (i3 != -16777216) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC0003ac
    public void a(long j2) {
        if (this.av > this.at || this.av + this.ar < this.ap || this.aw > this.au || this.aw + this.as < this.au) {
            if (j2 > this.aa) {
                if ((this.av > this.at || this.av + this.ar < this.ap) && (this.aw > this.au || this.aw + this.as < this.au)) {
                    if (this.av > this.at && this.aw > this.au) {
                        if (f(8, 4)) {
                            this.al += 8;
                            this.am += 4;
                        }
                        if (this.ae != 11) {
                            if (this.G != null) {
                                this.G.write("WK|" + h(this.al) + C0000a.v + i(this.am) + C0000a.v + this.ae + C0000a.w);
                                this.G.flush();
                            }
                            this.ae = 11;
                            if (this.G != null) {
                                this.G.write("WK|" + h(this.al) + C0000a.v + i(this.am) + C0000a.v + this.ae + C0000a.w);
                                this.G.flush();
                            }
                        }
                    } else if (this.av > this.at && this.aw + this.as < this.au) {
                        if (f(8, -4)) {
                            this.al += 8;
                            this.am -= 4;
                        }
                        if (this.ae != 8) {
                            if (this.G != null) {
                                this.G.write("WK|" + h(this.al) + C0000a.v + i(this.am) + C0000a.v + this.ae + C0000a.w);
                                this.G.flush();
                            }
                            this.ae = 8;
                            if (this.G != null) {
                                this.G.write("WK|" + h(this.al) + C0000a.v + i(this.am) + C0000a.v + this.ae + C0000a.w);
                                this.G.flush();
                            }
                        }
                    } else if (this.av + this.ar < this.at && this.aw > this.au) {
                        if (f(-8, 4)) {
                            this.al -= 8;
                            this.am += 4;
                        }
                        if (this.ae != 10) {
                            if (this.G != null) {
                                this.G.write("WK|" + h(this.al) + C0000a.v + i(this.am) + C0000a.v + this.ae + C0000a.w);
                                this.G.flush();
                            }
                            this.ae = 10;
                            if (this.G != null) {
                                this.G.write("WK|" + h(this.al) + C0000a.v + i(this.am) + C0000a.v + this.ae + C0000a.w);
                                this.G.flush();
                            }
                        }
                    } else if (this.av + this.ar >= this.at || this.aw + this.as >= this.au) {
                        C0032k.a("WHAT THE ?!!!! *cross eyed* ");
                    } else {
                        if (f(-8, -4)) {
                            this.al -= 8;
                            this.am -= 4;
                        }
                        if (this.ae != 9) {
                            if (this.G != null) {
                                this.G.write("WK|" + h(this.al) + C0000a.v + i(this.am) + C0000a.v + this.ae + C0000a.w);
                                this.G.flush();
                            }
                            this.ae = 9;
                            if (this.G != null) {
                                this.G.write("WK|" + h(this.al) + C0000a.v + i(this.am) + C0000a.v + this.ae + C0000a.w);
                                this.G.flush();
                            }
                        }
                    }
                } else if (this.aw > this.au) {
                    if (f(0, 8)) {
                        this.am += 8;
                    }
                    if (this.ae != 13) {
                        if (this.G != null) {
                            this.G.write("WK|" + h(this.al) + C0000a.v + i(this.am) + C0000a.v + this.ae + C0000a.w);
                            this.G.flush();
                        }
                        this.ae = 13;
                        if (this.G != null) {
                            this.G.write("WK|" + h(this.al) + C0000a.v + i(this.am) + C0000a.v + this.ae + C0000a.w);
                            this.G.flush();
                        }
                    }
                } else if (this.aw + this.as < this.au) {
                    if (f(0, -8)) {
                        this.am -= 8;
                    }
                    if (this.ae != 12) {
                        if (this.G != null) {
                            this.G.write("WK|" + h(this.al) + C0000a.v + i(this.am) + C0000a.v + this.ae + C0000a.w);
                            this.G.flush();
                        }
                        this.ae = 12;
                        if (this.G != null) {
                            this.G.write("WK|" + h(this.al) + C0000a.v + i(this.am) + C0000a.v + this.ae + C0000a.w);
                            this.G.flush();
                        }
                    }
                } else if (this.av > this.at) {
                    if (f(8, 0)) {
                        this.al += 8;
                    }
                    if (this.ae != 15) {
                        if (this.G != null) {
                            this.G.write("WK|" + h(this.al) + C0000a.v + i(this.am) + C0000a.v + this.ae + C0000a.w);
                            this.G.flush();
                        }
                        this.ae = 15;
                        if (this.G != null) {
                            this.G.write("WK|" + h(this.al) + C0000a.v + i(this.am) + C0000a.v + this.ae + C0000a.w);
                            this.G.flush();
                        }
                    }
                } else if (this.av + this.ar < this.at) {
                    if (f(-8, 0)) {
                        this.al -= 8;
                    }
                    if (this.ae != 14) {
                        if (this.G != null) {
                            this.G.write("WK|" + h(this.al) + C0000a.v + i(this.am) + C0000a.v + this.ae + C0000a.w);
                            this.G.flush();
                        }
                        this.ae = 14;
                        if (this.G != null) {
                            this.G.write("WK|" + h(this.al) + C0000a.v + i(this.am) + C0000a.v + this.ae + C0000a.w);
                            this.G.flush();
                        }
                    }
                }
                E();
                if (!this.ab && this.D == GameStates.V) {
                    this.ac = j2 + 1000;
                    this.ab = true;
                }
                this.aa = j2 + 60;
            }
            if (j2 > this.Z) {
                this.Y = (this.Y + 1) % 4;
                this.Z = j2 + 100;
            }
        } else {
            this.ab = false;
            switch (this.ae) {
                case 8:
                    this.ae = 0;
                    break;
                case 9:
                    this.ae = 1;
                    break;
                case 10:
                    this.ae = 2;
                    break;
                case 11:
                    this.ae = 3;
                    break;
                case 12:
                    this.ae = 4;
                    break;
                case 13:
                    this.ae = 5;
                    break;
                case 14:
                    this.ae = 6;
                    break;
                case 15:
                    this.ae = 7;
                    break;
            }
            this.Y = 0;
            d(this.at, this.au);
        }
        if (j2 > this.ag && this.ah) {
            this.ah = false;
        }
        if (j2 > this.aj && this.ak) {
            this.ak = false;
        }
        if (j2 <= this.ac || !this.ab) {
            return;
        }
        this.ac = j2 + 1000;
        if (this.G != null) {
            C0032k.a("send update");
            this.G.write("WK|" + h(this.al) + C0000a.v + i(this.am) + C0000a.v + this.ae + C0000a.w);
            this.G.flush();
        }
    }

    @Override // defpackage.AbstractC0003ac
    public void a(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
        b(graphics);
        a(graphics);
    }

    public void a(Graphics graphics) {
        this.N[this.ae][this.Y % this.Q].paintIcon(GameStates.pS, graphics, this.al + this.O, this.am + this.P);
    }

    public void b(Graphics graphics) {
        this.R[this.ae][this.Y % this.U].paintIcon(GameStates.pS, graphics, this.al + this.S, this.am + this.T);
    }

    @Override // defpackage.AbstractC0003ac
    public void d(AbstractC0003ac abstractC0003ac) {
        try {
            if (abstractC0003ac.getClass() == Class.forName("C")) {
                C c = (C) abstractC0003ac;
                c.a(this.ap, this.aq, this.ar, this.as);
                if (this.G != null) {
                    C0031j.a().a(101, c);
                }
            }
        } catch (ClassNotFoundException e) {
        }
    }

    @Override // defpackage.AbstractC0003ac
    public void b(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
        this.am += 10;
        if (this.ak) {
            this.X[this.ai].paintIcon(GameStates.pS, graphics, ((this.al + (this.N[0][0].getIconWidth() / 2)) - (this.X[this.ai].getIconWidth() / 2)) + 8, this.am - this.X[this.ai].getIconHeight());
        }
        if (this.ah) {
            int iconWidth = ((this.al + (this.N[0][0].getIconWidth() / 2)) - (this.W.getIconWidth() / 2)) + 5;
            int iconHeight = this.am - this.W.getIconHeight();
            this.W.paintIcon(GameStates.pS, graphics, iconWidth, iconHeight);
            graphics.setColor(Color.BLACK);
            this.ad.a(this.af, iconWidth + 5, iconHeight + 10, 163, 17, MastersOfDestiny.ap, null);
            this.ad.a(graphics, mastersOfDestiny);
        }
        graphics.setFont(new Font((String) null, 0, 9));
        graphics.setColor(this.F);
        graphics.drawString(this.E, ((this.al + (this.N[0][0].getIconWidth() / 2)) - (graphics.getFontMetrics().stringWidth(this.E) / 2)) + 8, this.am + 1);
        this.am -= 10;
    }

    public boolean equals(Object obj) {
        return obj.getClass() == getClass() && this.D == ((C0004ad) obj).D;
    }
}
