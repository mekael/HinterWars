

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.Icon;

/* renamed from: A  reason: default package */
/* loaded from: hinterwars.jar:A.class */
public class A {
    public static final byte c = 0;
    public static final byte d = 1;
    public static final byte e = 2;
    public static final byte f = 3;
    public static final byte g = 4;
    public static final byte h = 5;
    public static final byte i = 6;
    public static final byte j = 7;
    protected Icon k;
    protected String l;
    protected String m;
    protected String n;
    protected String o;
    protected long p;
    protected int q;
    protected int r;
    protected int s;
    protected int t;
    protected int u;
    protected int v;
    protected int w;
    protected long x;
    protected String y;
    protected K z;
    protected int A;
    protected boolean C;
    protected Icon D;
    protected long E;
    protected String G;
    protected boolean H;
    protected Icon[] I;
    protected long J;
    protected int K;
    protected ArrayList L;
    protected int M;
    private int a_;
    private int b_;
    private int c_;
    private int d_;
    protected int N;
    protected int O;
    protected int P;
    protected int Q;
    protected int R;
    protected int S;
    protected int[] U;
    protected int[][] V;
    protected int W;
    protected int X;
    protected byte ae;
    protected static final byte af = -1;
    protected static final byte ag = 0;
    protected static final byte ah = 1;
    protected static final byte ai = 2;
    protected static final byte aj = 3;
    protected static final byte ak = 4;
    protected static final byte al = 5;
    protected static final byte am = 6;
    protected static final byte ao = 0;
    protected static final byte ap = 1;
    protected static final byte aq = 2;
    protected static final byte ar = 3;
    protected static final byte as = 4;
    protected Icon[] at;
    protected Icon[] au;
    protected Icon[] av;
    protected Icon[] aw;
    protected Icon[] ax;
    protected Icon[] ay;
    protected Icon[] az;
    protected Icon[] aA;
    protected Icon[] aB;
    protected Icon[] aC;
    protected static final byte aM = 0;
    protected static final byte aN = 1;
    protected static final byte aO = 2;
    protected static final byte aP = 3;
    protected static final byte aQ = 4;
    protected static final byte aR = 5;
    protected static final byte aS = 6;
    protected static final byte aT = 7;
    protected static final byte aU = 8;
    protected static final byte aV = 9;
    protected static final byte aW = 10;
    protected static final byte aX = 11;
    protected static final byte aY = 12;
    protected static final byte aZ = 13;
    protected static final byte ba = 14;
    protected static final byte bb = 15;
    protected static final byte bc = 16;
    protected static final byte bd = 17;
    protected static final byte be = 18;
    protected static final byte bf = 19;
    protected static final byte bg = 20;
    protected static final byte bh = 21;
    protected static final byte bi = 22;
    protected static final byte bj = 23;
    private A[] f_;
    private int g_;
    String bk;
    protected final long B = 5000;
    protected long ab = 115;
    protected long ac = 90;
    protected long ad = 250;
    protected byte an = -1;
    protected final byte aD = 0;
    protected final byte aE = 1;
    protected final byte aF = 2;
    protected final byte aG = 3;
    protected final byte aH = 4;
    protected final byte aI = 5;
    protected final byte aJ = 6;
    protected final byte aK = 7;
    protected final byte aL = 8;
    private int h_ = 0;
    private int i_ = 1;
    private String j_ = "";
    private String k_ = "";
    boolean bl = false;
    private boolean e_ = false;
    protected int T = 0;
    protected long Y = System.currentTimeMillis() + this.ab;
    protected long Z = System.currentTimeMillis() + this.ac;
    protected long aa = System.currentTimeMillis() + this.ad;
    protected C0011ak F = C0011ak.m();

    A(int i2, int i3, int i4, int i5) {
        this.ae = (byte) -1;
        this.t = i2;
        this.u = i3;
        this.v = i4;
        this.w = i5;
        this.ae = (byte) -1;
        this.F.a((byte) 1);
        this.C = false;
        this.H = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public A() {
        this.ae = (byte) -1;
        this.ae = (byte) -1;
        this.F.a((byte) 1);
        this.C = false;
        this.H = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int[][] iArr) {
        this.e_ = true;
        this.V = iArr;
        if (iArr.length > 1) {
            this.W = 1;
        } else {
            this.W = 0;
        }
        this.X = 0;
        this.U = new int[iArr.length];
        for (int i2 = 0; i2 < this.U.length; i2++) {
            this.U[i2] = 0;
        }
    }

    public boolean e() {
        return this.e_;
    }

    protected int b(int i2) {
        if (this.ae == 5) {
            return this.V[i2][6];
        }
        if (this.ae == 6) {
            return (this.an == 0 || this.an == 1) ? this.V[i2][6] : this.an == 2 ? this.V[i2][8] : this.V[i2][7];
        }
        switch (this.T) {
            case 0:
            case 1:
            case 2:
            case 3:
                return this.V[i2][0];
            case 4:
            case 5:
            case 6:
            case 7:
                return this.V[i2][1];
            case 8:
            case 9:
            case 10:
            case 11:
                return this.V[i2][2];
            case 12:
            case 13:
            case 14:
            case 15:
                return this.V[i2][3];
            case 16:
            case 17:
            case 18:
            case 19:
                return this.V[i2][4];
            case 20:
            case 21:
            case 22:
            case 23:
                return this.V[i2][5];
            default:
                return 99;
        }
    }

    public void a(ArrayList arrayList) {
        this.L = arrayList;
        this.M = 0;
        this.a_ = this.P;
        this.b_ = this.Q;
        this.N = this.R;
        this.O = this.S;
    }

    protected byte f() {
        if (this.M >= this.L.size()) {
            this.P = this.c_;
            this.Q = this.d_;
            this.M++;
            this.L = null;
            return (byte) 1;
        }
        C0002ab a = ((V) this.L.get(this.M)).a();
        this.c_ = a.f();
        this.d_ = a.g();
        this.N = a.j();
        this.O = a.k();
        if (this.c_ == this.a_) {
            if (this.d_ > this.b_) {
                this.T = 6;
                this.X = 0;
                for (int i2 = 0; i2 < this.U.length; i2++) {
                    this.U[i2] = 0;
                }
            } else if (this.d_ < this.b_) {
                this.T = 4;
                this.X = 0;
                for (int i3 = 0; i3 < this.U.length; i3++) {
                    this.U[i3] = 0;
                }
            }
        } else if (this.d_ == this.b_) {
            if (this.c_ > this.a_) {
                this.T = 7;
                this.X = 0;
                for (int i4 = 0; i4 < this.U.length; i4++) {
                    this.U[i4] = 0;
                }
            } else if (this.c_ < this.a_) {
                this.T = 5;
                this.X = 0;
                for (int i5 = 0; i5 < this.U.length; i5++) {
                    this.U[i5] = 0;
                }
            }
        }
        this.a_ = this.c_;
        this.b_ = this.d_;
        this.M++;
        return (byte) 0;
    }

    public void a(Graphics graphics, MastersOfDestiny mastersOfDestiny, int i2, int i3, int i4, int i5, int i6, int i7, Icon icon, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.k.paintIcon(mastersOfDestiny, graphics, i2, i3);
        graphics.setFont(MastersOfDestiny.ae);
        graphics.setColor(Color.BLACK);
        graphics.drawString("" + this.t, i4 - (MastersOfDestiny.af.stringWidth("" + this.t) / 2), i5);
        graphics.setFont(MastersOfDestiny.Q);
        graphics.setColor(Color.BLACK);
        graphics.drawString(this.l, i6 - (MastersOfDestiny.R.stringWidth(this.l) / 2), i7);
        graphics.setClip(i8 + ((this.w * icon.getIconWidth()) / this.q), i9, icon.getIconWidth(), icon.getIconHeight());
        icon.paintIcon(mastersOfDestiny, graphics, i8, i9);
        graphics.setClip(0, 0, mastersOfDestiny.getWidth(), mastersOfDestiny.getHeight());
        graphics.setFont(MastersOfDestiny.ag);
        graphics.setColor(Color.BLACK);
        graphics.drawString("AP: " + this.w, (i8 + (icon.getIconWidth() / 2)) - (MastersOfDestiny.ah.stringWidth("AP: " + this.w) / 2), i9 + (MastersOfDestiny.ah.getHeight() / 2) + 2);
        graphics.setClip(i10 + ((this.u * icon.getIconWidth()) / this.r), i11, icon.getIconWidth(), icon.getIconHeight());
        icon.paintIcon(mastersOfDestiny, graphics, i10, i11);
        graphics.setClip(0, 0, mastersOfDestiny.getWidth(), mastersOfDestiny.getHeight());
        graphics.setFont(MastersOfDestiny.ag);
        graphics.setColor(Color.BLACK);
        graphics.drawString("HP: " + this.u + " / " + this.r, (i10 + (icon.getIconWidth() / 2)) - (MastersOfDestiny.ah.stringWidth("HP: " + this.u + "/" + this.r) / 2), i11 + (MastersOfDestiny.ah.getHeight() / 2) + 2);
        graphics.setClip(i12 + ((this.v * icon.getIconWidth()) / this.s), i13, icon.getIconWidth(), icon.getIconHeight());
        icon.paintIcon(mastersOfDestiny, graphics, i12, i13);
        graphics.setClip(0, 0, mastersOfDestiny.getWidth(), mastersOfDestiny.getHeight());
        graphics.setFont(MastersOfDestiny.ag);
        graphics.setColor(Color.BLACK);
        graphics.drawString("EN: " + this.v + " / " + this.s, (i12 + (icon.getIconWidth() / 2)) - (MastersOfDestiny.ah.stringWidth("EN: " + this.v + "/" + this.s) / 2), i13 + (MastersOfDestiny.ah.getHeight() / 2) + 2);
    }

    public void a(Graphics graphics, MastersOfDestiny mastersOfDestiny, Icon icon, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Icon icon2, int i10, int i11, int i12, int i13) {
        icon.paintIcon(mastersOfDestiny, graphics, i2, i3);
        this.k.paintIcon(mastersOfDestiny, graphics, i4, i5);
        graphics.setFont(MastersOfDestiny.Q);
        graphics.setColor(Color.BLACK);
        graphics.drawString("" + this.t, i6 - (MastersOfDestiny.R.stringWidth("" + this.t) / 2), i7);
        graphics.setFont(MastersOfDestiny.ag);
        graphics.setColor(Color.BLACK);
        graphics.drawString(this.l, i8 - (MastersOfDestiny.ah.stringWidth(this.l) / 2), i9);
        graphics.setClip(i10 + ((this.u * icon2.getIconWidth()) / this.r), i11, icon2.getIconWidth(), icon2.getIconHeight());
        icon2.paintIcon(mastersOfDestiny, graphics, i10, i11);
        graphics.setClip(0, 0, mastersOfDestiny.getWidth(), mastersOfDestiny.getHeight());
        graphics.setFont(MastersOfDestiny.ai);
        graphics.setColor(Color.BLACK);
        graphics.drawString("HP: " + this.u + " / " + this.r, (i10 + (icon2.getIconWidth() / 2)) - (MastersOfDestiny.aj.stringWidth("HP: " + this.u + "/" + this.r) / 2), i11 + (MastersOfDestiny.aj.getHeight() / 2) + 2);
        if (this.s != 0) {
            graphics.setClip(i12 + ((this.v * icon2.getIconWidth()) / this.s), i13, icon2.getIconWidth(), icon2.getIconHeight());
        } else {
            graphics.setClip(i12, i13, icon2.getIconWidth(), icon2.getIconHeight());
        }
        icon2.paintIcon(mastersOfDestiny, graphics, i12, i13);
        graphics.setClip(0, 0, mastersOfDestiny.getWidth(), mastersOfDestiny.getHeight());
        graphics.setFont(MastersOfDestiny.ai);
        graphics.setColor(Color.BLACK);
        graphics.drawString("EN: " + this.v + " / " + this.s, (i12 + (icon2.getIconWidth() / 2)) - (MastersOfDestiny.aj.stringWidth("EN: " + this.v + "/" + this.s) / 2), i13 + (MastersOfDestiny.aj.getHeight() / 2) + 2);
    }

    public byte a(long j2) {
        if (this.e_) {
            switch (this.ae) {
                case -1:
                    if (g()) {
                        if (j2 > this.Y) {
                            this.R = this.N;
                            this.S = this.O;
                            switch (this.T) {
                                case 4:
                                    this.T = 0;
                                    break;
                                case 5:
                                    this.T = 1;
                                    break;
                                case 6:
                                    this.T = 2;
                                    break;
                                case 7:
                                    this.T = 3;
                                    break;
                            }
                            this.X = (this.X + 1) % b(this.W);
                            for (int i2 = 0; i2 < this.U.length; i2++) {
                                this.U[i2] = this.X % b(i2);
                            }
                            this.Y = j2 + this.ab;
                            break;
                        }
                    } else if (j2 > this.Z) {
                        h();
                        m();
                        this.X = (this.X + 1) % b(this.W);
                        for (int i3 = 0; i3 < this.U.length; i3++) {
                            this.U[i3] = this.X % b(i3);
                        }
                        this.Z = j2 + this.ac;
                        break;
                    }
                    break;
                case 0:
                    if (j2 > this.aa) {
                        if (this.X + 1 >= b(this.W)) {
                            switch (this.T) {
                                case 8:
                                    this.T = 0;
                                    break;
                                case 9:
                                    this.T = 1;
                                    break;
                                case 10:
                                    this.T = 2;
                                    break;
                                case 11:
                                    this.T = 3;
                                    break;
                                case 12:
                                    this.T = 0;
                                    break;
                                case 13:
                                    this.T = 1;
                                    break;
                                case 14:
                                    this.T = 2;
                                    break;
                                case 15:
                                    this.T = 3;
                                    break;
                            }
                            this.ae = (byte) -1;
                            this.X = 0;
                            n();
                            return (byte) 2;
                        }
                        m();
                        if (this.T >= 8 && this.T <= 11) {
                            for (int i4 = 0; i4 < this.f_.length; i4++) {
                                this.f_[i4].b(this.P, this.Q, this.g_);
                            }
                        }
                        this.X++;
                        for (int i5 = 0; i5 < this.U.length; i5++) {
                            this.U[i5] = this.X % b(i5);
                        }
                        this.aa = j2 + this.ad;
                        break;
                    }
                    break;
                case 1:
                    if (j2 > this.aa) {
                        if (this.X + 1 >= b(this.W)) {
                            switch (this.T) {
                                case 16:
                                    this.T = 0;
                                    break;
                                case 17:
                                    this.T = 1;
                                    break;
                                case 18:
                                    this.T = 2;
                                    break;
                                case 19:
                                    this.T = 3;
                                    break;
                            }
                            this.X = 0;
                            n();
                            this.ae = (byte) 4;
                            for (int i6 = 0; i6 < this.f_.length; i6++) {
                                this.f_[i6].a(this.P, this.Q);
                            }
                            return (byte) 3;
                        }
                        m();
                        this.X++;
                        for (int i7 = 0; i7 < this.U.length; i7++) {
                            this.U[i7] = 0;
                        }
                        this.aa = j2 + this.ad;
                        break;
                    }
                    break;
                case 2:
                    if (j2 > this.aa) {
                        if (this.X + 1 >= b(this.W)) {
                            switch (this.T) {
                                case 16:
                                    this.T = 0;
                                    break;
                                case 17:
                                    this.T = 1;
                                    break;
                                case 18:
                                    this.T = 2;
                                    break;
                                case 19:
                                    this.T = 3;
                                    break;
                            }
                            this.X = 0;
                            n();
                            this.ae = (byte) 4;
                            return (byte) 4;
                        }
                        m();
                        this.X++;
                        for (int i8 = 0; i8 < this.U.length; i8++) {
                            this.U[i8] = 0;
                        }
                        this.aa = j2 + this.ad;
                        break;
                    }
                    break;
                case 3:
                    if (j2 > this.aa) {
                        if (this.X + 1 >= b(this.W)) {
                            switch (this.T) {
                                case 20:
                                    this.T = 0;
                                    break;
                                case 21:
                                    this.T = 1;
                                    break;
                                case 22:
                                    this.T = 2;
                                    break;
                                case 23:
                                    this.T = 3;
                                    break;
                            }
                            this.X = 0;
                            n();
                            this.ae = (byte) -1;
                            return (byte) 5;
                        }
                        this.X++;
                        m();
                        for (int i9 = 0; i9 < this.U.length; i9++) {
                            this.U[i9] = 0;
                        }
                        this.aa = j2 + this.ad;
                        break;
                    }
                    break;
                case 5:
                    if (j2 > this.aa) {
                        if (this.X + 1 >= b(this.W)) {
                            switch (this.T) {
                                case 8:
                                    this.T = 0;
                                    break;
                                case 9:
                                    this.T = 1;
                                    break;
                                case 10:
                                    this.T = 2;
                                    break;
                                case 11:
                                    this.T = 3;
                                    break;
                                case 12:
                                    this.T = 0;
                                    break;
                                case 13:
                                    this.T = 1;
                                    break;
                                case 14:
                                    this.T = 2;
                                    break;
                                case 15:
                                    this.T = 3;
                                    break;
                            }
                            this.X = 0;
                            this.ae = (byte) -1;
                            n();
                            return (byte) 6;
                        }
                        m();
                        for (int i10 = 0; i10 < this.f_.length; i10++) {
                            this.f_[i10].b(this.P, this.Q, this.g_);
                        }
                        this.X++;
                        for (int i11 = 0; i11 < this.U.length; i11++) {
                            this.U[i11] = this.X % b(i11);
                        }
                        this.aa = j2 + this.ad;
                        break;
                    }
                    break;
                case 6:
                    if (j2 > this.aa) {
                        if (this.X + 1 >= b(this.W)) {
                            switch (this.T) {
                                case 8:
                                    this.T = 0;
                                    break;
                                case 9:
                                    this.T = 1;
                                    break;
                                case 10:
                                    this.T = 2;
                                    break;
                                case 11:
                                    this.T = 3;
                                    break;
                                case 12:
                                    this.T = 0;
                                    break;
                                case 13:
                                    this.T = 1;
                                    break;
                                case 14:
                                    this.T = 2;
                                    break;
                                case 15:
                                    this.T = 3;
                                    break;
                            }
                            this.X = 0;
                            n();
                            this.ae = (byte) -1;
                            return (byte) 7;
                        }
                        m();
                        this.X++;
                        for (int i12 = 0; i12 < this.U.length; i12++) {
                            this.U[i12] = this.X % b(i12);
                        }
                        this.aa = j2 + this.ad;
                        break;
                    }
                    break;
            }
            if (this.L == null || this.M > this.L.size() || !g()) {
                if (j2 > this.E && this.C) {
                    this.C = false;
                }
                if (j2 <= this.J || !this.H) {
                    return (byte) 0;
                }
                this.H = false;
                return (byte) 0;
            }
            return f();
        }
        return (byte) 0;
    }

    public boolean g() {
        if (this.R < this.N - 4 || this.R > this.N + 4 || this.S < this.O - 2 || this.S > this.O + 2) {
            return false;
        }
        n();
        return true;
    }

    protected void h() {
        switch (this.T) {
            case 4:
                this.R += 8;
                this.S -= 4;
                return;
            case 5:
                this.R -= 8;
                this.S -= 4;
                return;
            case 6:
                this.R -= 8;
                this.S += 4;
                return;
            case 7:
                this.R += 8;
                this.S += 4;
                return;
            default:
                return;
        }
    }

    public void b(int i2, int i3, int i4) {
        this.an = (byte) this.z.a(i4).g();
        if (this.an == -1 || this.an == 3 || this.an == 4 || i4 == 1) {
            switch (this.T) {
                case 0:
                    this.T = 12;
                    break;
                case 1:
                    this.T = 13;
                    break;
                case 2:
                    this.T = 14;
                    break;
                case 3:
                    this.T = 15;
                    break;
            }
        }
        this.X = 0;
        for (int i5 = 0; i5 < this.U.length; i5++) {
            this.U[i5] = 0;
        }
        if (this.an > -1) {
            this.ae = (byte) 6;
        } else {
            this.ae = (byte) 0;
        }
        this.aa = System.currentTimeMillis() + this.ad;
    }

    public void a(A[] aArr, int i2, int i3, int i4) {
        this.f_ = aArr;
        this.g_ = i4;
        this.an = (byte) this.z.a(i4).g();
        if (i2 == this.P && i3 == this.Q) {
            switch (this.T) {
                case 0:
                    this.T = 8;
                    break;
                case 1:
                    this.T = 9;
                    break;
                case 2:
                    this.T = 10;
                    break;
                case 3:
                    this.T = 11;
                    break;
            }
            this.X = 0;
            for (int i5 = 0; i5 < this.U.length; i5++) {
                this.U[i5] = 0;
            }
            if (this.an > -1) {
                this.ae = (byte) 5;
            } else {
                this.ae = (byte) 0;
            }
        } else if (i3 - this.Q >= Math.abs(this.P - i2)) {
            if (this.an == -1 || i4 == 1 || this.an == 3 || this.an == 4) {
                this.T = 10;
            } else {
                this.T = 2;
            }
            this.X = 0;
            for (int i6 = 0; i6 < this.U.length; i6++) {
                this.U[i6] = 0;
            }
            if (this.an > -1) {
                this.ae = (byte) 5;
            } else {
                this.ae = (byte) 0;
            }
        } else if (this.P - i2 > Math.abs(this.Q - i3)) {
            if (this.an == -1 || i4 == 1 || this.an == 3 || this.an == 4) {
                this.T = 9;
            } else {
                this.T = 1;
            }
            this.X = 0;
            for (int i7 = 0; i7 < this.U.length; i7++) {
                this.U[i7] = 0;
            }
            if (this.an > -1) {
                this.ae = (byte) 5;
            } else {
                this.ae = (byte) 0;
            }
        } else if (this.Q - i3 >= Math.abs(this.P - i2)) {
            if (this.an == -1 || i4 == 1 || this.an == 3 || this.an == 4) {
                this.T = 8;
            } else {
                this.T = 0;
            }
            this.X = 0;
            for (int i8 = 0; i8 < this.U.length; i8++) {
                this.U[i8] = 0;
            }
            if (this.an > -1) {
                this.ae = (byte) 5;
            } else {
                this.ae = (byte) 0;
            }
        } else if (i2 - this.P > Math.abs(this.Q - i3)) {
            if (this.an == -1 || i4 == 1 || this.an == 3 || this.an == 4) {
                this.T = 11;
            } else {
                this.T = 3;
            }
            this.X = 0;
            for (int i9 = 0; i9 < this.U.length; i9++) {
                this.U[i9] = 0;
            }
            if (this.an > -1) {
                this.ae = (byte) 5;
            } else {
                this.ae = (byte) 0;
            }
        }
        this.aa = System.currentTimeMillis() + this.ad;
    }

    public void a(A[] aArr, int i2, int i3, String str) {
        this.f_ = aArr;
        this.bk = str;
        if (i2 == this.P && i3 == this.Q) {
            switch (this.T) {
                case 0:
                    this.T = 16;
                    break;
                case 1:
                    this.T = 17;
                    break;
                case 2:
                    this.T = 18;
                    break;
                case 3:
                    this.T = 19;
                    break;
            }
            this.X = 0;
            for (int i4 = 0; i4 < this.U.length; i4++) {
                this.U[i4] = 0;
            }
            this.ae = (byte) 1;
        } else if (this.P - i2 > Math.abs(this.Q - i3)) {
            this.T = 17;
            this.X = 0;
            for (int i5 = 0; i5 < this.U.length; i5++) {
                this.U[i5] = 0;
            }
            this.ae = (byte) 1;
        } else if (this.Q - i3 >= Math.abs(this.P - i2)) {
            this.T = 16;
            this.X = 0;
            for (int i6 = 0; i6 < this.U.length; i6++) {
                this.U[i6] = 0;
            }
            this.ae = (byte) 1;
        } else if (i3 - this.Q >= Math.abs(this.P - i2)) {
            this.T = 18;
            this.X = 0;
            for (int i7 = 0; i7 < this.U.length; i7++) {
                this.U[i7] = 0;
            }
            this.ae = (byte) 1;
        } else if (i2 - this.P > Math.abs(this.Q - i3)) {
            this.T = 19;
            this.X = 0;
            for (int i8 = 0; i8 < this.U.length; i8++) {
                this.U[i8] = 0;
            }
            this.ae = (byte) 1;
        }
        this.aa = System.currentTimeMillis() + this.ad;
    }

    public void a(int i2, int i3) {
        this.X = 0;
        for (int i4 = 0; i4 < this.U.length; i4++) {
            this.U[i4] = 0;
        }
        this.ae = (byte) 2;
        switch (this.T) {
            case 0:
                this.T = 16;
                break;
            case 1:
                this.T = 17;
                break;
            case 2:
                this.T = 18;
                break;
            case 3:
                this.T = 19;
                break;
        }
        this.aa = System.currentTimeMillis() + this.ad;
    }

    public void i() {
        this.X = 0;
        for (int i2 = 0; i2 < this.U.length; i2++) {
            this.U[i2] = 0;
        }
        this.ae = (byte) 4;
    }

    public void j() {
        this.X = 0;
        for (int i2 = 0; i2 < this.U.length; i2++) {
            this.U[i2] = 0;
        }
        this.ae = (byte) -1;
    }

    public void k() {
        switch (this.T) {
            case 0:
                this.T = 20;
                break;
            case 1:
                this.T = 21;
                break;
            case 2:
                this.T = 22;
                break;
            case 3:
                this.T = 23;
                break;
        }
        this.X = 0;
        for (int i2 = 0; i2 < this.U.length; i2++) {
            this.U[i2] = 0;
        }
        this.ae = (byte) 3;
        this.aa = System.currentTimeMillis() + this.ad;
    }

    public void a(String str) {
        this.C = true;
        this.G = str;
        this.E = System.currentTimeMillis() + 5000;
    }

    public void c(int i2) {
        this.K = i2;
        this.J = System.currentTimeMillis() + 5000;
        this.H = true;
    }

    public boolean equals(Object obj) {
        return obj.getClass() == getClass() && ((A) obj).p == this.p;
    }

    private void m() {
        o();
        this.i_++;
        if (this.i_ == this.h_) {
            C0021aw.b.a(this.k_);
        }
    }

    private void n() {
        this.i_ = 1;
        this.h_ = 0;
    }

    private void o() {
        if (this.T >= 4 && this.T <= 7) {
            this.h_ = 2;
            this.k_ = this.n;
        } else if (this.ae == 1) {
            this.h_ = 2;
            this.k_ = C0028g.q;
        } else if (this.ae == 2) {
            this.h_ = 2;
            this.k_ = C0028g.r;
        } else if (this.T >= 20 && this.T <= 23) {
            this.h_ = 2;
            this.k_ = C0028g.p;
        } else if (this.ae == 5) {
            if (this.an == 0) {
                this.h_ = 2;
                this.k_ = C0028g.u;
            } else if (this.an == 1) {
                this.h_ = 2;
                this.k_ = C0028g.w;
            } else if (this.an == 2) {
                this.h_ = 2;
                this.k_ = C0028g.s;
            } else {
                this.h_ = 2;
                this.k_ = C0028g.y;
            }
        } else if (this.ae != 6) {
            if (this.T < 12 || this.T > 15) {
                this.h_ = 2;
                this.k_ = this.m;
            }
        } else if (this.an == 0) {
            this.h_ = 2;
            this.k_ = C0028g.v;
        } else if (this.an == 1) {
            this.h_ = 2;
            this.k_ = C0028g.x;
        } else if (this.an == 2) {
            this.h_ = 2;
            this.k_ = C0028g.t;
        } else {
            this.h_ = 2;
            this.k_ = C0028g.z;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l() {
        if (this.bl) {
            return;
        }
        this.bl = true;
        C0021aw.b.a(this.o);
    }
}
