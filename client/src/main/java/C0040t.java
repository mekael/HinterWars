

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/* renamed from: t  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:t.class */
public class C0040t extends AbstractC0026e {
    private C0001aa w;
    private byte x;
    boolean a;
    private int y;
    private long z;
    private long A;
    boolean b;
    private I B;
    private Icon C;
    private Icon D;
    private Icon E;
    private Icon F;
    private int G;
    private int H;
    private boolean I;
    private String J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private C0009ai Q;
    private int R;
    private int[] S;
    private int T;
    private int U;
    private int V;
    private Icon W;
    private int X;
    private int Y;
    private int Z;
    private int aa;
    private boolean ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private Icon ag;
    private Icon ah;
    private int ai;
    private int aj;
    private Icon ak;
    private Icon al;
    private int am;
    private int an;
    private byte at;
    private boolean au;
    private int av;
    private int aw;
    private byte ax;
    private boolean ay;
    private int az;
    private int aA;
    private byte aB;
    private boolean aC;
    private int aD;
    private int aE;
    private byte aF;
    private boolean aG;
    private int aH;
    private int aI;
    private byte aJ;
    private boolean aK;
    private int aL;
    private int aM;
    private byte aN;
    private boolean aO;
    private int aP;
    private int aQ;
    private byte aR;
    private boolean aS;
    private int aT;
    private int aU;
    private Icon aV;
    private int aW;
    private int aX;
    private Icon aY;
    private int aZ;
    private int ba;
    private int bb;
    private int[] bc;
    private int bf;
    private int bg;
    private int bh;
    private C0011ak bi;
    private int bl;
    private int bm;
    private int bn;
    private int bo;
    private int bp;
    private int bq;
    private int[] br;
    private int[] bs;
    private int[] bt;
    private int[] bu;
    private int[] bv;
    private int[] bw;
    private int bx;
    private int by;
    private Vector bz;
    private C0020av bA;
    private int bB;
    private int bC;
    private C0020av bD;
    private int bE;
    private int bF;
    private boolean bG;
    private long bH;
    private int bI;
    private int bJ;
    C0009ai l;
    int m;
    int n;
    int o;
    int p;
    int q;
    int r;
    private int bK;
    private String bL;
    private int bM;
    private int bN;
    private int bO;
    private int bP;
    private int bQ;
    private int bR;
    private Icon bS;
    private int bT;
    private int bU;
    private int bV;
    private int bW;
    private int bX;
    private int bY;
    private Icon bZ;
    private Icon ca;
    private int cb;
    private int cc;
    private int cd;
    private int ce;
    private int cf;
    private int cg;
    private int ch;
    private int ci;
    private Icon cj;
    private int ck;
    private int cl;
    private int cm;
    private int cn;
    private long co;
    private boolean cp;
    private Icon cq;
    private int cr;
    private int cs;
    private int ct;
    private int cu;
    private int cv;
    private int cw;
    private Hashtable cx;
    private Hashtable cy;
    private long[] cz;
    private long[] cA;
    private C0009ai cB;
    private int cC;
    private int cD;
    private int cE;
    private int[] cF;
    private int cG;
    private int cH;
    private int cI;
    private int cJ;
    private int cK;
    private int cL;
    boolean s;
    private Icon cM;
    private static int cN;
    private static int cO;
    private static int cP;
    private static int cQ;
    private int cR;
    private int cS;
    private Icon cT;
    private boolean cU;
    private Icon cV;
    private long[][] cW;
    private Icon cX;
    private long[][] cY;
    private Icon cZ;
    private long[][] da;
    private long[][] db;
    private ArrayList dc;
    private aV dd;
    private Icon de;
    private int df;
    private int dg;
    private Icon dh;
    private int di;
    private int dj;
    private boolean dk;
    private long dl;
    byte t;
    byte u;
    private int dm;
    private int dn;

    /* renamed from: do  reason: not valid java name */
    private long f2do;
    GameStates v;
    private int dr;
    private long ds;
    private boolean du;
    public final byte c = 1;
    public final byte d = 2;
    public final byte e = 3;
    public final byte f = 4;
    public final byte g = 5;
    public final byte h = 6;
    public final byte i = 7;
    public final byte j = 8;
    public final byte k = 9;
    private final byte ao = 0;
    private final byte ap = 1;
    private final byte aq = 2;
    private final byte ar = 3;
    private final byte as = 4;
    private final int bd = 0;
    private final int be = 1;
    private final byte bj = 0;
    private final byte bk = 1;
    private final int dp = 300;
    private Vector dq = new Vector();
    private final int dt = 30;

    public C0040t(GameStates gameStates) {
        this.v = gameStates;
    }

    @Override // defpackage.AbstractC0026e
    public void a(C0001aa c0001aa, long j) {
        C0032k.a("in mission state");
        this.w = c0001aa;
        this.x = (byte) 22;
        this.cx = ((O) c0001aa.w[0]).d;
        this.cy = ((O) c0001aa.w[0]).e;
        this.a = false;
        this.z = -1L;
        this.A = -1L;
        this.y = -1;
        this.b = false;
        this.B = ((O) c0001aa.w[0]).c;
        this.C = new ImageIcon(getClass().getResource("res/missions/missionmap01_tiles.png"));
        c0001aa.v.o.setBounds(24, 572, 310, 21);
        c0001aa.v.o.setBorder(BorderFactory.createLineBorder(new Color(14870248)));
        c0001aa.v.add(c0001aa.v.o);
        this.K = c0001aa.d("en", 640);
        this.L = c0001aa.d("en", 641);
        this.M = c0001aa.d("en", 642);
        this.N = c0001aa.d("en", 643);
        this.O = c0001aa.d("en", 644);
        this.P = c0001aa.d("en", 645);
        this.Q = new C0009ai();
        this.Q.a(30, 477, 340, 51, MastersOfDestiny.am, MastersOfDestiny.an);
        this.cB = new C0009ai();
        this.cB.a(209, 144, 385, 106, MastersOfDestiny.B, MastersOfDestiny.C);
        this.cC = c0001aa.d("en", 1152);
        this.cD = c0001aa.d("en", 1153);
        this.cE = c0001aa.d("en", 1154);
        this.cF = c0001aa.e("en", 1155);
        this.cG = c0001aa.d("en", 1156);
        this.cH = c0001aa.d("en", 1157);
        this.cI = c0001aa.d("en", 1158);
        this.cJ = c0001aa.d("en", 1159);
        this.cK = c0001aa.d("en", 1160);
        this.cL = c0001aa.d("en", 1161);
        this.s = false;
        this.cM = new ImageIcon(getClass().getResource(c0001aa.f("en", 1162)));
        this.R = 0;
        this.S = c0001aa.e("en", 207);
        this.T = c0001aa.d("en", 725);
        this.U = c0001aa.d("en", 209);
        this.V = c0001aa.d("en", 210);
        this.W = new ImageIcon(getClass().getResource(c0001aa.f("en", 609)));
        this.X = c0001aa.d("en", 318);
        this.Y = c0001aa.d("en", 319);
        this.Z = c0001aa.d("en", 320);
        this.aa = c0001aa.d("en", 321);
        this.ab = false;
        this.ac = c0001aa.d("en", 635);
        this.ad = c0001aa.d("en", 637);
        this.ae = c0001aa.d("en", 638);
        this.af = c0001aa.d("en", 639);
        this.de = new ImageIcon(getClass().getResource(c0001aa.f("en", 1298)));
        this.df = c0001aa.d("en", 1299);
        this.dg = c0001aa.d("en", 1300);
        this.ag = new ImageIcon(getClass().getResource(c0001aa.f("en", 606)));
        this.ah = new ImageIcon(getClass().getResource(c0001aa.f("en", 605)));
        this.ai = c0001aa.d("en", 548);
        this.aj = c0001aa.d("en", 549);
        this.ak = new ImageIcon(getClass().getResource(c0001aa.f("en", 608)));
        this.al = new ImageIcon(getClass().getResource(c0001aa.f("en", 607)));
        this.am = c0001aa.d("en", 550);
        this.an = c0001aa.d("en", 551);
        this.at = (byte) 4;
        this.au = false;
        this.av = c0001aa.d("en", 552);
        this.aw = c0001aa.d("en", 553);
        this.ax = (byte) 4;
        this.ay = false;
        this.az = c0001aa.d("en", 554);
        this.aA = c0001aa.d("en", 555);
        this.aB = (byte) 4;
        this.aC = false;
        this.aD = c0001aa.d("en", 558);
        this.aE = c0001aa.d("en", 559);
        this.aF = (byte) 4;
        this.aG = false;
        this.aH = c0001aa.d("en", 560);
        this.aI = c0001aa.d("en", 561);
        this.aJ = (byte) 4;
        this.aK = false;
        this.aL = c0001aa.d("en", 562);
        this.aM = c0001aa.d("en", 563);
        this.aN = (byte) 4;
        this.aO = false;
        this.aP = c0001aa.d("en", 564);
        this.aQ = c0001aa.d("en", 565);
        this.aR = (byte) 4;
        this.aS = false;
        this.aT = c0001aa.d("en", 556);
        this.aU = c0001aa.d("en", 557);
        this.aV = new ImageIcon(getClass().getResource(c0001aa.f("en", 618)));
        this.aW = c0001aa.d("en", 619);
        this.aX = c0001aa.d("en", 620);
        this.aY = new ImageIcon(getClass().getResource(c0001aa.f("en", 611)));
        this.aZ = c0001aa.d("en", 612);
        this.ba = c0001aa.d("en", 613);
        this.bb = c0001aa.d("en", 625);
        this.bc = new int[2];
        this.bc[0] = c0001aa.d("en", 626);
        this.bc[1] = c0001aa.d("en", 627);
        this.bf = c0001aa.d("en", 628);
        this.bg = c0001aa.d("en", 629);
        this.bh = 0;
        this.bi = C0011ak.m();
        this.bi.a((byte) 2);
        this.bi.g();
        this.bp = 150;
        this.bq = 17;
        this.br = null;
        this.bs = null;
        this.bt = c0001aa.e("en", 621);
        this.bu = c0001aa.e("en", 622);
        this.bv = c0001aa.e("en", 616);
        this.bw = c0001aa.e("en", 617);
        this.bB = c0001aa.d("en", 614);
        this.bC = c0001aa.d("en", 615);
        this.bx = c0001aa.d("en", 623);
        this.by = c0001aa.d("en", 624);
        this.bz = new Vector();
        this.bD = null;
        this.bE = 0;
        this.bF = 0;
        this.bG = true;
        this.bK = 0;
        this.bI = c0001aa.d("en", 541);
        this.bJ = c0001aa.d("en", 542);
        c();
        this.dl = 0L;
        this.m = c0001aa.d("en", 908);
        this.n = c0001aa.d("en", 909);
        this.o = c0001aa.d("en", 910);
        this.p = c0001aa.d("en", 911);
        this.q = c0001aa.d("en", 912);
        this.r = c0001aa.d("en", 913);
        this.l = new C0009ai();
        this.l.a(30, 434, 340, 34, MastersOfDestiny.D, MastersOfDestiny.E);
        this.l.a("Waiting for new turn...", 0, 0);
        this.l.a((byte) 3);
        this.D = new ImageIcon(getClass().getResource(c0001aa.f("en", 905)));
        this.E = new ImageIcon(getClass().getResource(c0001aa.f("en", 904)));
        this.F = new ImageIcon(getClass().getResource(c0001aa.f("en", 881)));
        this.G = -1;
        this.H = -1;
        this.bM = c0001aa.d("en", 577);
        this.bN = c0001aa.d("en", 578);
        this.bO = c0001aa.d("en", 579);
        this.bP = c0001aa.d("en", 580);
        this.bQ = c0001aa.d("en", 581);
        this.bR = c0001aa.d("en", 582);
        this.bS = new ImageIcon(getClass().getResource(c0001aa.f("en", 583)));
        this.bT = c0001aa.d("en", 584);
        this.bU = c0001aa.d("en", 585);
        this.bV = c0001aa.d("en", 586);
        this.bW = c0001aa.d("en", 587);
        this.bX = c0001aa.d("en", 588);
        this.bY = c0001aa.d("en", 589);
        this.bZ = new ImageIcon(getClass().getResource(c0001aa.f("en", 590)));
        this.ca = new ImageIcon(getClass().getResource(c0001aa.f("en", 591)));
        this.cb = c0001aa.d("en", 592);
        this.cc = c0001aa.d("en", 593);
        this.cd = c0001aa.d("en", 594);
        this.ce = c0001aa.d("en", 595);
        this.cf = c0001aa.d("en", 596);
        this.cg = c0001aa.d("en", 597);
        this.ch = c0001aa.d("en", 598);
        this.ci = c0001aa.d("en", 599);
        this.cj = new ImageIcon(getClass().getResource(c0001aa.f("en", 600)));
        this.ck = c0001aa.d("en", 601);
        this.cl = c0001aa.d("en", 602);
        this.cm = c0001aa.d("en", 603);
        this.cn = c0001aa.d("en", 604);
        this.cq = new ImageIcon(getClass().getResource(c0001aa.f("en", 646)));
        this.cr = 250;
        this.cs = 254;
        this.ct = 334;
        this.cu = 313;
        this.cv = 131;
        this.cw = 19;
        cN = c0001aa.d("en", 536);
        cO = c0001aa.d("en", 537);
        cP = c0001aa.d("en", 538);
        cQ = c0001aa.d("en", 539);
        int i = ((A) this.cy.get(Long.valueOf(c0001aa.e))).P;
        int i2 = ((A) this.cy.get(Long.valueOf(c0001aa.e))).Q;
        this.cR = this.B.a(i, i2).h();
        this.cS = this.B.a(i, i2).i();
        this.cT = new ImageIcon(getClass().getResource(c0001aa.f("en", 566)));
        this.cU = false;
        this.cV = new ImageIcon(getClass().getResource(c0001aa.f("en", 567)));
        this.cW = new long[this.B.d()][this.B.e()];
        this.cX = new ImageIcon(getClass().getResource(c0001aa.f("en", 568)));
        this.cY = new long[this.B.d()][this.B.e()];
        this.cZ = new ImageIcon(getClass().getResource(c0001aa.f("en", 569)));
        this.da = new long[this.B.d()][this.B.e()];
        this.db = new long[this.B.d()][this.B.e()];
        f();
        g();
        i();
        h();
        this.dd = new aV(this.B, this.B.d() * this.B.e());
        this.dc = new ArrayList(this.B.d() * this.B.e());
        this.dh = new ImageIcon(getClass().getResource(c0001aa.f("en", 572)));
        this.dk = false;
        ((O) c0001aa.w[0]).a++;
        C0032k.a("current stage = " + ((O) c0001aa.w[0]).a);
        C0032k.a("max stage = " + ((O) c0001aa.w[0]).b);
        C0032k.a("finish splash = " + this.a);
        this.t = (byte) 0;
        this.u = (byte) -1;
        C0032k.a("mission state finish entering");
    }

    @Override // defpackage.AbstractC0026e
    public int b(C0001aa c0001aa, long j) {
        a(j);
        Enumeration elements = this.cx.elements();
        while (elements.hasMoreElements()) {
            A a = (A) elements.nextElement();
            byte a2 = a.a(System.currentTimeMillis());
            if (a2 == 1) {
                this.di = this.B.a(a.P, a.Q).h();
                this.dj = this.B.a(a.P, a.Q).i();
                this.B.a(a.P, a.Q).a(false);
                this.B.a(a.P, a.Q).b(false);
            }
            if (a2 != 0) {
                this.t = (byte) (this.t + 1);
                C0032k.a("monster update animationDone: " + ((int) this.t) + " / " + ((int) this.u));
                if (this.t >= this.u) {
                    if (this.cz != null || this.cA != null) {
                        Enumeration elements2 = this.cx.elements();
                        while (elements2.hasMoreElements()) {
                            ((A) elements2.nextElement()).j();
                        }
                        Enumeration elements3 = this.cy.elements();
                        while (elements3.hasMoreElements()) {
                            ((A) elements3.nextElement()).j();
                        }
                    }
                    this.cz = null;
                    this.cA = null;
                    a(C0000a.a());
                    this.cU = false;
                }
            }
        }
        Enumeration elements4 = this.cy.elements();
        while (elements4.hasMoreElements()) {
            A a3 = (A) elements4.nextElement();
            byte a4 = a3.a(System.currentTimeMillis());
            if (a4 == 1) {
                this.di = this.B.a(a3.P, a3.Q).h();
                this.dj = this.B.a(a3.P, a3.Q).i();
                this.B.a(a3.P, a3.Q).a(false);
                this.B.a(a3.P, a3.Q).b(false);
            }
            if (a4 == 5) {
                ((aH) a3).a(this.w);
            }
            if (a4 != 0) {
                this.t = (byte) (this.t + 1);
                C0032k.a("player update animationDone: " + ((int) this.t) + " / " + ((int) this.u));
                if (this.t >= this.u) {
                    if (this.cz != null || this.cA != null) {
                        Enumeration elements5 = this.cx.elements();
                        while (elements5.hasMoreElements()) {
                            ((A) elements5.nextElement()).j();
                        }
                        Enumeration elements6 = this.cy.elements();
                        while (elements6.hasMoreElements()) {
                            ((A) elements6.nextElement()).j();
                        }
                    }
                    this.cz = null;
                    this.cA = null;
                    a(C0000a.a());
                    this.cU = false;
                }
            }
        }
        if (this.dl != 0 && System.currentTimeMillis() - this.dl > 30000) {
            this.v.a(this.w.a, this.w.b);
            this.x = (byte) 27;
        }
        return this.x;
    }

    @Override // defpackage.AbstractC0026e
    public void a(byte b) {
    }

    @Override // defpackage.AbstractC0026e
    public void a(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
        Icon b;
        Icon b2;
        if (!this.a) {
            ((O) this.w.w[0]).a(graphics, mastersOfDestiny);
            if (((O) this.w.w[0]).a == ((O) this.w.w[0]).b) {
                this.a = true;
                a(C0000a.b());
                return;
            }
            return;
        }
        this.B.a(graphics, mastersOfDestiny);
        for (int i = 0; i < this.B.d(); i++) {
            for (int i2 = 0; i2 < this.B.e(); i2++) {
                C0002ab a = this.B.a(i, i2);
                Icon b3 = a.b();
                if (b3 != null && (a.d() || a.a() != null)) {
                    b3.paintIcon(mastersOfDestiny, graphics, a.j() - (b3.getIconWidth() / 2), (a.k() + 16) - b3.getIconHeight());
                }
            }
        }
        if (this.dk) {
            this.dh.paintIcon(mastersOfDestiny, graphics, this.di, this.dj);
        }
        for (int i3 = 0; i3 < this.cW.length; i3++) {
            for (int i4 = 0; i4 < this.cW[0].length; i4++) {
                if (this.cW[i3][i4] > 0) {
                    this.cV.paintIcon(mastersOfDestiny, graphics, this.B.a(i3, i4).h(), this.B.a(i3, i4).i());
                }
            }
        }
        for (int i5 = 0; i5 < this.cY.length; i5++) {
            for (int i6 = 0; i6 < this.cY[0].length; i6++) {
                if (this.cY[i5][i6] > 0) {
                    this.cX.paintIcon(mastersOfDestiny, graphics, this.B.a(i5, i6).h(), this.B.a(i5, i6).i());
                }
            }
        }
        for (int i7 = 0; i7 < this.da.length; i7++) {
            for (int i8 = 0; i8 < this.da.length; i8++) {
                if (this.da[i7][i8] > 0 && (this.B.a(i7, i8).h() != this.di || this.dj != this.B.a(i7, i8).i())) {
                    this.cZ.paintIcon(mastersOfDestiny, graphics, this.B.a(i7, i8).h(), this.B.a(i7, i8).i());
                }
            }
        }
        for (int i9 = 0; i9 < this.db.length; i9++) {
            for (int i10 = 0; i10 < this.db.length; i10++) {
                if (this.db[i9][i10] > 0 && (this.B.a(i9, i10).h() != this.di || this.dj != this.B.a(i9, i10).i())) {
                    this.cZ.paintIcon(mastersOfDestiny, graphics, this.B.a(i9, i10).h(), this.B.a(i9, i10).i());
                }
            }
        }
        if (this.cR != 0 && this.cS != 0) {
            this.cT.paintIcon(mastersOfDestiny, graphics, this.cR, this.cS);
        }
        graphics.setFont(MastersOfDestiny.M);
        graphics.setColor(new Color(11594998));
        graphics.drawString("" + this.dr, this.bI - (MastersOfDestiny.N.stringWidth("" + this.dr) / 2), this.bJ + (MastersOfDestiny.N.getHeight() / 4));
        graphics.setFont(MastersOfDestiny.ai);
        graphics.setColor(Color.BLACK);
        int i11 = ((aH) this.cy.get(Long.valueOf(this.w.e))).A;
        try {
            Map synchronizedMap = Collections.synchronizedMap(new TreeMap(new J(this)));
            Enumeration elements = this.cx.elements();
            while (elements.hasMoreElements()) {
                aS aSVar = (aS) elements.nextElement();
                Vector vector = new Vector();
                vector.add(aSVar);
                Object put = synchronizedMap.put(new Integer(aSVar.S), vector);
                if (put != null) {
                    if (put.getClass() == Class.forName("aS") || put.getClass() == Class.forName("aH") || put.getClass() == Class.forName("ab")) {
                        vector.add(put);
                    } else {
                        Enumeration elements2 = ((Vector) put).elements();
                        while (elements2.hasMoreElements()) {
                            Object nextElement = elements2.nextElement();
                            if (nextElement.getClass() == Class.forName("aS") || nextElement.getClass() == Class.forName("aH")) {
                                A a2 = (A) nextElement;
                                if (a2.U.length > 1) {
                                    vector.add((aH) a2);
                                } else {
                                    vector.add((aS) a2);
                                }
                            } else if (nextElement.getClass() == Class.forName("ab")) {
                                vector.add((C0002ab) nextElement);
                            }
                        }
                    }
                    synchronizedMap.put(new Integer(aSVar.S), vector);
                }
            }
            Enumeration elements3 = this.cy.elements();
            while (elements3.hasMoreElements()) {
                aH aHVar = (aH) elements3.nextElement();
                Vector vector2 = new Vector();
                vector2.add(aHVar);
                Object put2 = synchronizedMap.put(new Integer(aHVar.S), vector2);
                if (put2 != null) {
                    if (put2.getClass() == Class.forName("aS") || put2.getClass() == Class.forName("aH") || put2.getClass() == Class.forName("ab")) {
                        vector2.add(put2);
                    } else {
                        Enumeration elements4 = ((Vector) put2).elements();
                        while (elements4.hasMoreElements()) {
                            Object nextElement2 = elements4.nextElement();
                            if (nextElement2.getClass() == Class.forName("aS") || nextElement2.getClass() == Class.forName("aH")) {
                                A a3 = (A) nextElement2;
                                if (a3.U.length > 1) {
                                    vector2.add((aH) a3);
                                } else {
                                    vector2.add((aS) a3);
                                }
                            } else if (nextElement2.getClass() == Class.forName("ab")) {
                                vector2.add((C0002ab) nextElement2);
                            }
                        }
                    }
                    synchronizedMap.put(new Integer(aHVar.S), vector2);
                }
            }
            for (int i12 = 0; i12 < this.B.d(); i12++) {
                for (int i13 = 0; i13 < this.B.e(); i13++) {
                    C0002ab a4 = this.B.a(i12, i13);
                    if (a4.b() != null && !a4.d() && a4.a() == null) {
                        Vector vector3 = new Vector();
                        vector3.add(a4);
                        Object put3 = synchronizedMap.put(new Integer(a4.g), vector3);
                        if (put3 != null) {
                            if (put3.getClass() == Class.forName("aS") || put3.getClass() == Class.forName("aH") || put3.getClass() == Class.forName("ab")) {
                                vector3.add(put3);
                            } else {
                                Enumeration elements5 = ((Vector) put3).elements();
                                while (elements5.hasMoreElements()) {
                                    Object nextElement3 = elements5.nextElement();
                                    if (nextElement3.getClass() == Class.forName("aS") || nextElement3.getClass() == Class.forName("aH")) {
                                        A a5 = (A) nextElement3;
                                        if (a5.U.length > 1) {
                                            vector3.add((aH) a5);
                                        } else {
                                            vector3.add((aS) a5);
                                        }
                                    } else if (nextElement3.getClass() == Class.forName("ab")) {
                                        vector3.add((C0002ab) nextElement3);
                                    }
                                }
                            }
                            synchronizedMap.put(new Integer(a4.g), vector3);
                        }
                    }
                }
            }
            for (Object obj : synchronizedMap.values()) {
                if (obj.getClass() == Class.forName("aS")) {
                    ((aS) obj).a(graphics, mastersOfDestiny);
                } else if (obj.getClass() == Class.forName("aH")) {
                    ((aH) obj).a(graphics, mastersOfDestiny, i11);
                } else if (obj.getClass() == Class.forName("ab")) {
                    Icon b4 = ((C0002ab) obj).b();
                    if (b4 != null) {
                        b4.paintIcon(mastersOfDestiny, graphics, ((C0002ab) obj).j() - (b4.getIconWidth() / 2), (((C0002ab) obj).k() + 16) - b4.getIconHeight());
                    }
                } else {
                    Enumeration elements6 = ((Vector) obj).elements();
                    while (elements6.hasMoreElements()) {
                        Object nextElement4 = elements6.nextElement();
                        if (nextElement4.getClass() == Class.forName("aS") || nextElement4.getClass() == Class.forName("aH")) {
                            A a6 = (A) nextElement4;
                            if (a6.e()) {
                                if (a6.U.length > 1) {
                                    ((aH) a6).a(graphics, mastersOfDestiny, i11);
                                } else {
                                    ((aS) a6).a(graphics, mastersOfDestiny);
                                }
                            }
                        } else if (nextElement4.getClass() == Class.forName("ab") && (b2 = ((C0002ab) nextElement4).b()) != null) {
                            b2.paintIcon(mastersOfDestiny, graphics, ((C0002ab) nextElement4).j() - (b2.getIconWidth() / 2), (((C0002ab) nextElement4).k() + 16) - b2.getIconHeight());
                        }
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            C0032k.a(e.getMessage());
        }
        if (this.cA != null || this.cz != null) {
            graphics.setColor(new Color(0, 0, 0, 100));
            graphics.fillRect(0, 0, 800, 600);
            try {
                Map synchronizedMap2 = Collections.synchronizedMap(new TreeMap(new C0005ae(this)));
                if (this.cz != null) {
                    for (int i14 = 0; i14 < this.cz.length; i14++) {
                        aS aSVar2 = (aS) this.cx.get(new Long(this.cz[i14]));
                        Vector vector4 = new Vector();
                        vector4.add(aSVar2);
                        Object put4 = synchronizedMap2.put(new Integer(aSVar2.S), vector4);
                        if (put4 != null) {
                            if (put4.getClass() == Class.forName("aS") || put4.getClass() == Class.forName("aH")) {
                                vector4.add(put4);
                            } else {
                                Enumeration elements7 = ((Vector) put4).elements();
                                while (elements7.hasMoreElements()) {
                                    Object nextElement5 = elements7.nextElement();
                                    if (nextElement5.getClass() == Class.forName("aS") || nextElement5.getClass() == Class.forName("aH")) {
                                        A a7 = (A) nextElement5;
                                        if (a7.U.length > 1) {
                                            vector4.add((aH) a7);
                                        } else {
                                            vector4.add((aS) a7);
                                        }
                                    } else if (nextElement5.getClass() == Class.forName("ab")) {
                                        vector4.add((C0002ab) nextElement5);
                                    }
                                }
                            }
                            synchronizedMap2.put(new Integer(aSVar2.S), vector4);
                        }
                    }
                }
                if (this.cA != null) {
                    for (int i15 = 0; i15 < this.cA.length; i15++) {
                        aH aHVar2 = (aH) this.cy.get(new Long(this.cA[i15]));
                        Vector vector5 = new Vector();
                        vector5.add(aHVar2);
                        Object put5 = synchronizedMap2.put(new Integer(aHVar2.S), vector5);
                        if (put5 != null) {
                            if (put5.getClass() == Class.forName("aS") || put5.getClass() == Class.forName("aH")) {
                                vector5.add(put5);
                            } else {
                                Enumeration elements8 = ((Vector) put5).elements();
                                while (elements8.hasMoreElements()) {
                                    Object nextElement6 = elements8.nextElement();
                                    if (nextElement6.getClass() == Class.forName("aS") || nextElement6.getClass() == Class.forName("aH")) {
                                        A a8 = (A) nextElement6;
                                        if (a8.U.length > 1) {
                                            vector5.add((aH) a8);
                                        } else {
                                            vector5.add((aS) a8);
                                        }
                                    } else if (nextElement6.getClass() == Class.forName("ab")) {
                                        vector5.add((C0002ab) nextElement6);
                                    }
                                }
                            }
                            synchronizedMap2.put(new Integer(aHVar2.S), vector5);
                        }
                    }
                }
                for (int i16 = 0; i16 < this.B.d(); i16++) {
                    for (int i17 = 0; i17 < this.B.e(); i17++) {
                        C0002ab a9 = this.B.a(i16, i17);
                        if (a9.b() != null && !a9.d() && a9.a() == null) {
                            Vector vector6 = new Vector();
                            vector6.add(a9);
                            Object put6 = synchronizedMap2.put(new Integer(a9.g), vector6);
                            if (put6 != null) {
                                if (put6.getClass() == Class.forName("aS") || put6.getClass() == Class.forName("aH") || put6.getClass() == Class.forName("ab")) {
                                    vector6.add(put6);
                                } else {
                                    Enumeration elements9 = ((Vector) put6).elements();
                                    while (elements9.hasMoreElements()) {
                                        Object nextElement7 = elements9.nextElement();
                                        if (nextElement7.getClass() == Class.forName("aS") || nextElement7.getClass() == Class.forName("aH")) {
                                            A a10 = (A) nextElement7;
                                            if (a10.U.length > 1) {
                                                vector6.add((aH) a10);
                                            } else {
                                                vector6.add((aS) a10);
                                            }
                                        } else if (nextElement7.getClass() == Class.forName("ab")) {
                                            vector6.add((C0002ab) nextElement7);
                                        }
                                    }
                                }
                                synchronizedMap2.put(new Integer(a9.g), vector6);
                            }
                        }
                    }
                }
                for (Object obj2 : synchronizedMap2.values()) {
                    if (obj2.getClass() == Class.forName("aS")) {
                        ((aS) obj2).a(graphics, mastersOfDestiny);
                    } else if (obj2.getClass() == Class.forName("aH")) {
                        ((aH) obj2).a(graphics, mastersOfDestiny, i11);
                    } else if (obj2.getClass() == Class.forName("ab")) {
                        Icon b5 = ((C0002ab) obj2).b();
                        if (b5 != null) {
                            b5.paintIcon(mastersOfDestiny, graphics, ((C0002ab) obj2).j() - (b5.getIconWidth() / 2), (((C0002ab) obj2).k() + 16) - b5.getIconHeight());
                        }
                    } else {
                        Enumeration elements10 = ((Vector) obj2).elements();
                        while (elements10.hasMoreElements()) {
                            Object nextElement8 = elements10.nextElement();
                            if (nextElement8.getClass() == Class.forName("aS") || nextElement8.getClass() == Class.forName("aH")) {
                                A a11 = (A) nextElement8;
                                if (a11.e()) {
                                    if (a11.U.length > 1) {
                                        ((aH) a11).a(graphics, mastersOfDestiny, i11);
                                    } else {
                                        ((aS) a11).a(graphics, mastersOfDestiny);
                                    }
                                }
                            } else if (nextElement8.getClass() == Class.forName("ab") && (b = ((C0002ab) nextElement8).b()) != null) {
                                b.paintIcon(mastersOfDestiny, graphics, ((C0002ab) nextElement8).j() - (b.getIconWidth() / 2), (((C0002ab) nextElement8).k() + 16) - b.getIconHeight());
                            }
                        }
                    }
                }
            } catch (ClassNotFoundException e2) {
                C0032k.a(e2.getMessage());
            }
        }
        ((A) this.cy.get(Long.valueOf(this.w.e))).a(graphics, mastersOfDestiny, this.bM, this.bN, this.bO, this.bP, this.bQ, this.bR, this.bS, this.bT, this.bU, this.bV, this.bW, this.bX, this.bY);
        if (this.co > 0) {
            if (this.cp) {
                ((A) this.cx.get(Long.valueOf(this.co))).a(graphics, mastersOfDestiny, this.bZ, this.cb, this.cc, this.cd, this.ce, this.cf, this.cg, this.ch, this.ci, this.cj, this.ck, this.cl, this.cm, this.cn);
            } else {
                ((A) this.cy.get(Long.valueOf(this.co))).a(graphics, mastersOfDestiny, this.ca, this.cb, this.cc, this.cd, this.ce, this.cf, this.cg, this.ch, this.ci, this.cj, this.ck, this.cl, this.cm, this.cn);
            }
        } else if (this.co == 0 && this.cp) {
            ((A) this.cx.get(Long.valueOf(this.co))).a(graphics, mastersOfDestiny, this.bZ, this.cb, this.cc, this.cd, this.ce, this.cf, this.cg, this.ch, this.ci, this.cj, this.ck, this.cl, this.cm, this.cn);
        }
        this.w.y.paintIcon(mastersOfDestiny, graphics, -1, 430);
        this.de.paintIcon(mastersOfDestiny, graphics, this.df, this.dg);
        if (this.R != -1) {
            this.W.paintIcon(mastersOfDestiny, graphics, this.S[this.R] + 2, this.T);
        }
        this.Q.a(graphics, mastersOfDestiny);
        if (this.ab) {
            this.w.z.paintIcon(mastersOfDestiny, graphics, 397, 369);
            if (this.at == 4 || this.at == 1) {
                this.ag.paintIcon(mastersOfDestiny, graphics, this.av, this.aw);
            }
            if (this.au) {
                this.ah.paintIcon(mastersOfDestiny, graphics, this.av, this.aw);
            }
            if (this.ax == 4 || this.ax == 1) {
                this.ag.paintIcon(mastersOfDestiny, graphics, this.az, this.aA);
            }
            if (this.ay) {
                this.ah.paintIcon(mastersOfDestiny, graphics, this.az, this.aA);
            }
            if (this.aB == 4 || this.aB == 1) {
                this.ak.paintIcon(mastersOfDestiny, graphics, this.aD, this.aE);
            }
            if (this.aC) {
                this.al.paintIcon(mastersOfDestiny, graphics, this.aD, this.aE);
            }
            if (this.aF == 4 || this.aF == 1) {
                this.ak.paintIcon(mastersOfDestiny, graphics, this.aH, this.aI);
            }
            if (this.aG) {
                this.al.paintIcon(mastersOfDestiny, graphics, this.aH, this.aI);
            }
            if (this.aJ == 4 || this.aJ == 1) {
                this.ak.paintIcon(mastersOfDestiny, graphics, this.aL, this.aM);
            }
            if (this.aK) {
                this.al.paintIcon(mastersOfDestiny, graphics, this.aL, this.aM);
            }
            if (this.aN == 4 || this.aN == 1) {
                this.ak.paintIcon(mastersOfDestiny, graphics, this.aP, this.aQ);
            }
            if (this.aO) {
                this.al.paintIcon(mastersOfDestiny, graphics, this.aP, this.aQ);
            }
            if (this.aR == 4 || this.aR == 1) {
                this.ag.paintIcon(mastersOfDestiny, graphics, this.aT, this.aU);
            }
            if (this.aS) {
                this.ah.paintIcon(mastersOfDestiny, graphics, this.aT, this.aU);
            }
            if (this.aF == 2 || this.aF == 3) {
                this.aV.paintIcon(mastersOfDestiny, graphics, this.aW, this.aX);
                int length = this.bh * this.br.length;
                for (int i18 = 0; i18 < this.bs.length; i18++) {
                    for (int i19 = 0; i19 < this.br.length; i19++) {
                        if (length < this.bz.size()) {
                            aQ aQVar = (aQ) this.bz.elementAt(length);
                            aQVar.m().paintIcon(mastersOfDestiny, graphics, this.br[i19], this.bs[i18]);
                            if (aQVar.q() == 0) {
                                graphics.setColor(new Color(16777215));
                                graphics.setFont(MastersOfDestiny.ag);
                                graphics.drawString("" + aQVar.c(), this.br[i19] + 35, this.bs[i18] + 43);
                            } else {
                                this.D.paintIcon(mastersOfDestiny, graphics, this.br[i19] + 33, this.bs[i18] + 33);
                            }
                            if (aQVar.o() > ((aH) this.cy.get(new Long(this.w.e))).v || aQVar.r()) {
                                this.E.paintIcon(mastersOfDestiny, graphics, this.br[i19] - 1, this.bs[i18]);
                            }
                            length++;
                        }
                    }
                }
                if (this.G != -1 && this.H != -1) {
                    this.F.paintIcon(mastersOfDestiny, graphics, this.G, this.H);
                }
            }
            if (this.aJ == 2) {
                this.aV.paintIcon(mastersOfDestiny, graphics, this.aW, this.aX);
            }
            if (this.aN == 2) {
                this.aY.paintIcon(mastersOfDestiny, graphics, this.aW, this.aX);
                if (this.bA != null) {
                    this.bA.a().b().paintIcon(mastersOfDestiny, graphics, this.bB + 2, this.bC);
                }
            }
            if (this.aJ == 2) {
                int length2 = this.bh * this.br.length;
                for (int i20 = 0; i20 < this.bs.length; i20++) {
                    for (int i21 = 0; i21 < this.br.length; i21++) {
                        if (length2 < this.bz.size()) {
                            ((C0020av) this.bz.elementAt(length2)).a().b().paintIcon(mastersOfDestiny, graphics, this.br[i21], this.bs[i20]);
                            int b6 = ((C0020av) this.bz.elementAt(length2)).b();
                            graphics.setColor(new Color(16777215));
                            graphics.setFont(MastersOfDestiny.ag);
                            graphics.drawString(b6 + "", this.br[i21] + 2, this.bs[i20] + 9);
                            if (Integer.parseInt(((C0020av) this.bz.elementAt(length2)).a().l()) > ((aH) this.cy.get(new Long(this.w.e))).t) {
                                this.E.paintIcon(mastersOfDestiny, graphics, this.br[i21] - 1, this.bs[i20]);
                            }
                        }
                        length2++;
                    }
                }
            }
            if (this.aN == 2) {
                int length3 = this.bh * this.br.length;
                for (int i22 = 0; i22 < this.bs.length; i22++) {
                    for (int i23 = 0; i23 < this.br.length; i23++) {
                        if (length3 < this.bz.size()) {
                            ((C0020av) this.bz.elementAt(length3)).a().b().paintIcon(mastersOfDestiny, graphics, this.br[i23] + 2, this.bs[i22]);
                            int b7 = ((C0020av) this.bz.elementAt(length3)).b();
                            graphics.setColor(new Color(16777215));
                            graphics.setFont(MastersOfDestiny.ag);
                            graphics.drawString(b7 + "", this.br[i23] + 3, this.bs[i22] + 9);
                        }
                        length3++;
                    }
                }
                if (this.bD != null) {
                    this.bD.a().b().paintIcon(mastersOfDestiny, graphics, this.bE, this.bF);
                }
            }
            if (this.bi.j != null) {
                graphics.setFont(MastersOfDestiny.B);
                this.bi.a(graphics, mastersOfDestiny);
            }
        }
        this.l.a(graphics, mastersOfDestiny);
        if (this.I) {
            this.cq.paintIcon(mastersOfDestiny, graphics, this.cr, this.cs);
            graphics.setColor(new Color(8838126));
            graphics.setFont(MastersOfDestiny.O);
            graphics.drawString(this.J, (this.cr + (this.cq.getIconWidth() / 2)) - (MastersOfDestiny.N.stringWidth(this.J) / 2), this.cs + (5 * (MastersOfDestiny.P.getHeight() / 4)));
        }
        if (this.s) {
            this.cM.paintIcon(mastersOfDestiny, graphics, this.cC, this.cD);
            this.cB.a(graphics, mastersOfDestiny);
        }
    }

    @Override // defpackage.AbstractC0026e
    public void a(int i, Object obj) {
    }

    @Override // defpackage.AbstractC0026e
    public void a(String[] strArr) {
        int c;
        V v;
        int c2;
        V v2;
        C0032k.a("mission state received: " + strArr[0]);
        switch (C0000a.a(strArr)) {
            case C0000a.aS /* -1 */:
                a(C0000a.a(Long.toString(C0001aa.c), this.w.d));
                return;
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case C0000a.aX /* 12 */:
            case C0000a.aY /* 13 */:
            case 15:
            case C0000a.bb /* 16 */:
            case C0000a.bd /* 18 */:
            case C0000a.be /* 19 */:
            case 44:
            default:
                return;
            case 6:
                a(C0000a.b());
                return;
            case C0000a.aW /* 11 */:
                int parseInt = Integer.parseInt(strArr[3]);
                int parseInt2 = Integer.parseInt(strArr[4]);
                aS aSVar = new aS(Long.parseLong(strArr[1]), Long.parseLong(strArr[2]), this.w.f("en", 535), parseInt, parseInt2, this.B.a(parseInt, parseInt2).j(), this.B.a(parseInt, parseInt2).k(), Integer.parseInt(strArr[5]), Integer.parseInt(strArr[6]));
                aSVar.a(this.w);
                this.cx.put(new Long(strArr[2]), aSVar);
                this.B.a(parseInt, parseInt2, aSVar);
                this.B.a(parseInt, parseInt2).a(false);
                this.B.a(parseInt, parseInt2).b(false);
                return;
            case C0000a.aZ /* 14 */:
                int parseInt3 = Integer.parseInt(strArr[3]);
                int parseInt4 = Integer.parseInt(strArr[4]);
                int parseInt5 = Integer.parseInt(strArr[7]);
                aH aHVar = new aH(Long.parseLong(strArr[1]), strArr[2], Integer.parseInt(strArr[6]), parseInt5, Integer.parseInt(strArr[8]), Integer.parseInt(strArr[9]), parseInt3, parseInt4, this.B.a(parseInt3, parseInt4).j(), this.B.a(parseInt3, parseInt4).k(), Integer.parseInt(strArr[5]), this.w.c(parseInt5), Integer.parseInt(strArr[13]));
                if (Integer.parseInt(strArr[10]) != -1) {
                    D a = this.w.q.a(strArr[10]);
                    C0020av c0020av = new C0020av();
                    c0020av.a(a);
                    c0020av.a(1);
                    c0020av.a(1, (byte) 1);
                    aHVar.a(c0020av);
                }
                if (Integer.parseInt(strArr[11]) != -1) {
                    D a2 = this.w.q.a(strArr[11]);
                    C0020av c0020av2 = new C0020av();
                    c0020av2.a(a2);
                    c0020av2.a(1);
                    c0020av2.a(2, (byte) 1);
                    aHVar.a(c0020av2);
                }
                if (Integer.parseInt(strArr[12]) != -1) {
                    D a3 = this.w.q.a(strArr[12]);
                    C0020av c0020av3 = new C0020av();
                    c0020av3.a(a3);
                    c0020av3.a(1);
                    c0020av3.a(3, (byte) 1);
                    aHVar.a(c0020av3);
                }
                this.cy.put(new Long(strArr[1]), aHVar);
                this.B.a(parseInt3, parseInt4, aHVar);
                this.B.a(parseInt3, parseInt4).a(false);
                this.B.a(parseInt3, parseInt4).b(false);
                return;
            case C0000a.bc /* 17 */:
                int parseInt6 = Integer.parseInt(strArr[3]);
                if (parseInt6 > 0) {
                    D a4 = this.w.q.a(strArr[2]);
                    C0020av c0020av4 = new C0020av();
                    c0020av4.a(a4);
                    c0020av4.a(1);
                    c0020av4.a(parseInt6, (byte) 1);
                    C0032k.a("item = " + c0020av4);
                    C0032k.a("((Player)missionPlayers.get(Long.valueOf(messageParts[1]))) = " + ((aH) this.cy.get(Long.valueOf(strArr[1]))));
                    ((aH) this.cy.get(Long.valueOf(strArr[1]))).a(c0020av4);
                    return;
                }
                return;
            case C0000a.bf /* 20 */:
                if (this.cy.get(Long.valueOf(strArr[1])) != null) {
                    ((aH) this.cy.get(Long.valueOf(strArr[1]))).a(Integer.parseInt(strArr[2]), Integer.parseInt(strArr[6]), Integer.parseInt(strArr[3]), Integer.parseInt(strArr[5]), Integer.parseInt(strArr[4]), Integer.parseInt(strArr[7]));
                    return;
                }
                return;
            case C0000a.bg /* 21 */:
                if (this.cy.get(Long.valueOf(strArr[1])) != null) {
                    ((aH) this.cy.get(Long.valueOf(strArr[1]))).a(Integer.parseInt(strArr[2]), Integer.parseInt(strArr[6]), Integer.parseInt(strArr[3]), Integer.parseInt(strArr[5]), Integer.parseInt(strArr[4]), Integer.parseInt(strArr[7]));
                    return;
                }
                return;
            case C0000a.bh /* 22 */:
                int parseInt7 = Integer.parseInt(strArr[1]);
                if (parseInt7 == 1) {
                    C0032k.a("new round");
                    C0032k.a("missionPlayer = " + this.cy);
                    C0032k.a("missionPlayer.size = " + this.cy.size());
                    Enumeration elements = this.cy.elements();
                    while (elements.hasMoreElements()) {
                        ((aH) elements.nextElement()).a(this.w);
                    }
                }
                this.bK = parseInt7;
                if (this.l != null) {
                    this.l.a("Round: " + this.bK + "...", 0, 0);
                    this.l.a((byte) 3);
                    return;
                }
                return;
            case C0000a.bi /* 23 */:
                this.bL = ((A) this.cy.get(Long.valueOf(strArr[1]))).l;
                int i = ((A) this.cy.get(Long.valueOf(strArr[1]))).P;
                int i2 = ((A) this.cy.get(Long.valueOf(strArr[1]))).Q;
                C0032k.a("turnTileX " + this.di + " turnTileY " + this.dj);
                this.di = this.B.a(i, i2).h();
                this.dj = this.B.a(i, i2).i();
                this.dk = true;
                this.cR = this.di;
                this.cS = this.dj;
                if (Long.parseLong(strArr[1]) == this.w.e) {
                    if (((aH) this.cy.get(Long.valueOf(this.w.e))).a != -1) {
                        ((aH) this.cy.get(Long.valueOf(this.w.e))).b = ((A) this.cy.get(Long.valueOf(this.w.e))).q;
                        ((A) this.cy.get(Long.valueOf(this.w.e))).q = ((aH) this.cy.get(Long.valueOf(this.w.e))).a;
                    }
                    ((A) this.cy.get(Long.valueOf(this.w.e))).w = ((A) this.cy.get(Long.valueOf(this.w.e))).q;
                    this.ab = true;
                    this.at = (byte) 0;
                    this.ax = (byte) 0;
                    this.aB = (byte) 4;
                    this.aF = (byte) 4;
                    this.aJ = (byte) 4;
                    this.aN = (byte) 4;
                    this.aR = (byte) 0;
                    d();
                }
                if (this.l != null) {
                    this.l.a("Round: " + this.bK + " - " + this.bL + "'s turn", 0, 0);
                    this.l.a((byte) 3);
                    return;
                }
                return;
            case C0000a.bj /* 24 */:
                c();
                this.at = (byte) 4;
                this.ax = (byte) 4;
                this.aB = (byte) 4;
                this.aF = (byte) 4;
                this.aJ = (byte) 4;
                this.aN = (byte) 4;
                this.aR = (byte) 4;
                this.ab = false;
                return;
            case C0000a.bk /* 25 */:
                this.bL = ((A) this.cx.get(Long.valueOf(strArr[1]))).l;
                int i3 = ((A) this.cx.get(Long.valueOf(strArr[1]))).P;
                int i4 = ((A) this.cx.get(Long.valueOf(strArr[1]))).Q;
                this.di = this.B.a(i3, i4).h();
                this.dj = this.B.a(i3, i4).i();
                this.dk = true;
                this.cR = this.di;
                this.cS = this.dj;
                this.l.a("Round: " + this.bK + " - " + this.bL + "'s turn", 0, 0);
                this.l.a((byte) 3);
                return;
            case C0000a.bl /* 26 */:
                C0032k.a("player walk type");
                C0032k.a("x: " + ((A) this.cy.get(Long.valueOf(strArr[1]))).P);
                C0032k.a("y: " + ((A) this.cy.get(Long.valueOf(strArr[1]))).Q);
                aH aHVar2 = (aH) this.cy.get(Long.valueOf(strArr[1]));
                int i5 = aHVar2.P;
                int i6 = aHVar2.Q;
                C0002ab a5 = this.B.a(i5, i6);
                this.B.a(i5, i6, (Object) null);
                this.B.a(i5, i6).a(true);
                this.B.a(i5, i6).b(false);
                int parseInt8 = Integer.parseInt(strArr[2]);
                int parseInt9 = Integer.parseInt(strArr[3]);
                C0002ab a6 = this.B.a(parseInt8, parseInt9);
                this.cR = a6.h();
                this.cS = a6.i();
                this.B.a(parseInt8, parseInt9, aHVar2);
                this.dd.a(a5, a6);
                do {
                    c2 = this.dd.c();
                } while (c2 == 1);
                C0032k.a("searchStats = " + c2);
                this.dc = this.dd.a();
                for (int i7 = 0; i7 < this.dc.size(); i7++) {
                    if (((V) this.dc.get(i7)) != null) {
                        C0032k.a("x " + v2.a().f() + " Y " + v2.a().g());
                    }
                }
                ((A) this.cy.get(Long.valueOf(strArr[1]))).a(this.dc);
                this.t = (byte) 0;
                this.u = (byte) 1;
                if (aHVar2.p == this.w.e) {
                    this.at = (byte) 4;
                    ((A) this.cy.get(Long.valueOf(this.w.e))).w -= this.dc.size();
                }
                this.cU = true;
                return;
            case C0000a.bm /* 27 */:
                C0032k.a("monster walk type");
                aS aSVar2 = (aS) this.cx.get(Long.valueOf(strArr[1]));
                int i8 = aSVar2.P;
                int i9 = aSVar2.Q;
                C0032k.a("old - x: " + i8 + " | y: " + i9);
                C0002ab a7 = this.B.a(i8, i9);
                this.B.a(i8, i9, (Object) null);
                this.B.a(i8, i9).a(true);
                this.B.a(i8, i9).b(false);
                int parseInt10 = Integer.parseInt(strArr[2]);
                int parseInt11 = Integer.parseInt(strArr[3]);
                C0032k.a("new - x: " + parseInt10 + " | y: " + parseInt11);
                C0002ab a8 = this.B.a(parseInt10, parseInt11);
                this.cR = a8.h();
                this.cS = a8.i();
                this.B.a(parseInt10, parseInt11, aSVar2);
                this.dd.a(a7, a8);
                do {
                    c = this.dd.c();
                } while (c == 1);
                C0032k.a("searchStats = " + c);
                this.dc = this.dd.a();
                for (int i10 = 0; i10 < this.dc.size(); i10++) {
                    if (((V) this.dc.get(i10)) != null) {
                        C0032k.a("x " + v.a().f() + " Y " + v.a().g());
                    }
                }
                ((A) this.cx.get(Long.valueOf(strArr[1]))).a(this.dc);
                this.t = (byte) 0;
                this.u = (byte) 1;
                this.cU = true;
                return;
            case C0000a.bn /* 28 */:
                C0032k.a("monster attacking...");
                int parseInt12 = Integer.parseInt(strArr[2]);
                Vector vector = new Vector();
                if (!strArr[5].equals("-1")) {
                    String[] split = strArr[5].split(" ");
                    for (int i11 = 0; i11 < split.length; i11++) {
                        C0032k.a("affected player " + split[i11]);
                        vector.add((A) this.cy.get(Long.valueOf(split[i11])));
                    }
                }
                if (!strArr[6].equals("-1")) {
                    String[] split2 = strArr[6].split(" ");
                    for (int i12 = 0; i12 < split2.length; i12++) {
                        C0032k.a("affected monster " + split2[i12]);
                        if (!split2[i12].equals(strArr[1])) {
                            vector.add((A) this.cx.get(Long.valueOf(split2[i12])));
                        }
                    }
                }
                A[] aArr = new A[vector.size()];
                for (int i13 = 0; i13 < vector.size(); i13++) {
                    aArr[i13] = (A) vector.get(i13);
                }
                this.t = (byte) 0;
                this.u = (byte) (vector.size() + 1);
                ((aS) this.cx.get(Long.valueOf(strArr[1]))).a(aArr, Integer.parseInt(strArr[3]), Integer.parseInt(strArr[4]), parseInt12);
                this.cR = this.B.a(Integer.parseInt(strArr[3]), Integer.parseInt(strArr[4])).h();
                this.cS = this.B.a(Integer.parseInt(strArr[3]), Integer.parseInt(strArr[4])).i();
                this.cU = true;
                return;
            case C0000a.bo /* 29 */:
                aH aHVar3 = (aH) this.cy.get(Long.valueOf(strArr[1]));
                if (strArr.length == 8) {
                    if (!strArr[7].equalsIgnoreCase("null")) {
                        aHVar3.y = strArr[7];
                    }
                } else if (aHVar3.u != Integer.parseInt(strArr[2])) {
                    aHVar3.y = "HP " + (Integer.parseInt(strArr[2]) - aHVar3.u);
                }
                aHVar3.u = Integer.parseInt(strArr[2]);
                aHVar3.w = Integer.parseInt(strArr[3]);
                aHVar3.x = Integer.parseInt(strArr[5]);
                aHVar3.v = Integer.parseInt(strArr[4]);
                if (aHVar3.u <= 0) {
                    this.B.a(aHVar3.P, aHVar3.Q, (Object) null);
                    this.B.a(aHVar3.P, aHVar3.Q).a(true);
                    this.B.a(aHVar3.P, aHVar3.Q).b(false);
                    if (Long.parseLong(strArr[1]) == this.co) {
                        this.co = -1L;
                    }
                    if (Long.parseLong(strArr[1]) == this.w.e) {
                        a(C0000a.d());
                        c();
                        ((aH) this.cy.get(Long.valueOf(this.w.e))).a = -1;
                        if (((aH) this.cy.get(Long.valueOf(this.w.e))).b != -1) {
                            ((A) this.cy.get(Long.valueOf(this.w.e))).q = ((aH) this.cy.get(Long.valueOf(this.w.e))).b;
                            ((aH) this.cy.get(Long.valueOf(this.w.e))).b = -1;
                        }
                        g();
                        f();
                        this.at = (byte) 4;
                        this.ax = (byte) 4;
                        this.aB = (byte) 4;
                        this.aF = (byte) 4;
                        this.aJ = (byte) 4;
                        this.aN = (byte) 4;
                        this.aR = (byte) 4;
                        this.ab = false;
                        return;
                    }
                    return;
                }
                return;
            case 30:
                aS aSVar3 = (aS) this.cx.get(Long.valueOf(strArr[1]));
                if (strArr.length == 5) {
                    if (!strArr[4].equalsIgnoreCase("null")) {
                        aSVar3.y = strArr[4];
                    }
                } else if (aSVar3.u != Integer.parseInt(strArr[2])) {
                    aSVar3.y = "HP " + (Integer.parseInt(strArr[2]) - aSVar3.u);
                }
                aSVar3.u = Integer.parseInt(strArr[2]);
                if (aSVar3.u <= 0) {
                    this.B.a(aSVar3.P, aSVar3.Q, (Object) null);
                    this.B.a(aSVar3.P, aSVar3.Q).a(true);
                    this.B.a(aSVar3.P, aSVar3.Q).b(false);
                    if (Long.parseLong(strArr[1]) == this.co) {
                        this.co = -1L;
                        return;
                    }
                    return;
                }
                return;
            case C0000a.bq /* 31 */:
                C0032k.a("player attacking...");
                int parseInt13 = Integer.parseInt(strArr[2]);
                Vector vector2 = new Vector();
                if (!strArr[5].equals("-1")) {
                    String[] split3 = strArr[5].split(" ");
                    for (int i14 = 0; i14 < split3.length; i14++) {
                        C0032k.a("affected player " + split3[i14]);
                        if (!split3[i14].equals(strArr[1])) {
                            vector2.add((A) this.cy.get(Long.valueOf(split3[i14])));
                        }
                    }
                }
                if (!strArr[6].equals("-1")) {
                    String[] split4 = strArr[6].split(" ");
                    for (int i15 = 0; i15 < split4.length; i15++) {
                        C0032k.a("affected monster " + split4[i15]);
                        vector2.add((A) this.cx.get(Long.valueOf(split4[i15])));
                    }
                }
                A[] aArr2 = new A[vector2.size()];
                for (int i16 = 0; i16 < vector2.size(); i16++) {
                    aArr2[i16] = (A) vector2.get(i16);
                }
                aH aHVar4 = (aH) this.cy.get(Long.valueOf(strArr[1]));
                this.t = (byte) 0;
                this.u = (byte) (vector2.size() + 1);
                aHVar4.a(aArr2, Integer.parseInt(strArr[3]), Integer.parseInt(strArr[4]), parseInt13);
                this.cR = this.B.a(Integer.parseInt(strArr[3]), Integer.parseInt(strArr[4])).h();
                this.cS = this.B.a(Integer.parseInt(strArr[3]), Integer.parseInt(strArr[4])).i();
                if (aHVar4.p == this.w.e) {
                    this.ax = (byte) 4;
                    this.aB = (byte) 4;
                    this.aF = (byte) 4;
                    this.aJ = (byte) 4;
                    this.aN = (byte) 4;
                }
                this.cU = true;
                return;
            case C0000a.br /* 32 */:
                if (this.at != 4 || this.ax != 4) {
                    if (this.at == 1) {
                        this.at = (byte) 0;
                    }
                    if (this.ax == 1) {
                        this.ax = (byte) 0;
                        this.aB = (byte) 4;
                        this.aF = (byte) 4;
                        this.aJ = (byte) 4;
                        this.aN = (byte) 4;
                    }
                    this.aR = (byte) 0;
                    this.ab = true;
                    d();
                    return;
                }
                a(C0000a.d());
                ((aH) this.cy.get(Long.valueOf(this.w.e))).a = -1;
                if (((aH) this.cy.get(Long.valueOf(this.w.e))).b != -1) {
                    ((A) this.cy.get(Long.valueOf(this.w.e))).q = ((aH) this.cy.get(Long.valueOf(this.w.e))).b;
                    ((aH) this.cy.get(Long.valueOf(this.w.e))).b = -1;
                }
                c();
                g();
                f();
                i();
                this.at = (byte) 4;
                this.ax = (byte) 4;
                this.aB = (byte) 4;
                this.aF = (byte) 4;
                this.aJ = (byte) 4;
                this.aN = (byte) 4;
                this.aR = (byte) 4;
                this.ab = false;
                return;
            case C0000a.bs /* 33 */:
                b(Long.parseLong(strArr[1]), strArr[2]);
                return;
            case C0000a.bt /* 34 */:
                a(Long.parseLong(strArr[1]), Integer.parseInt(strArr[2]));
                return;
            case C0000a.bu /* 35 */:
                C0021aw.b.a(C0028g.B);
                this.J = "Mission Cleared!";
                for (int i17 = 0; i17 < this.B.d(); i17++) {
                    for (int i18 = 0; i18 < this.B.e(); i18++) {
                        if (this.B.a(i17, i18).c() == 255) {
                            int f = this.B.a(i17, i18).f();
                            int g = this.B.a(i17, i18).g();
                            Enumeration elements2 = this.cy.elements();
                            while (elements2.hasMoreElements()) {
                                aH aHVar5 = (aH) elements2.nextElement();
                                if (aHVar5.P == f && aHVar5.Q == g) {
                                    this.J = "Mission Aborted.";
                                }
                            }
                        }
                    }
                }
                this.I = true;
                a(C0000a.a());
                return;
            case C0000a.bv /* 36 */:
                C0021aw.b.a(C0028g.A);
                this.J = "Mission Failed!";
                this.I = true;
                a(C0000a.a());
                return;
            case C0000a.bw /* 37 */:
                C0032k.a("player using item...");
                a(Long.parseLong(strArr[1]), Integer.parseInt(strArr[3]), Integer.parseInt(strArr[4]), strArr[2]);
                return;
            case C0000a.bx /* 38 */:
                aH aHVar6 = (aH) this.cy.get(Long.valueOf(strArr[1]));
                C0032k.a(aHVar6.p + aHVar6.l + " changing equipment");
                int parseInt14 = Integer.parseInt(strArr[3]);
                C0032k.a("bodyslotID = " + parseInt14);
                if (parseInt14 > 0) {
                    C0020av a9 = aHVar6.a(parseInt14);
                    if (a9 != null) {
                        int d = aHVar6.d(a9);
                        if (d == -1) {
                            aHVar6.c(a9);
                        } else {
                            aHVar6.a(a9.a().h(), d, 1);
                        }
                        aHVar6.b(a9);
                    }
                    D a10 = this.w.q.a(strArr[2]);
                    C0020av c0020av5 = new C0020av();
                    c0020av5.a(a10);
                    c0020av5.a(1);
                    c0020av5.a(parseInt14, (byte) 1);
                    aHVar6.a(c0020av5);
                    this.l.a(aHVar6.l + " have equipped " + c0020av5.a().c(), 9765735, 9765735);
                    this.l.a((byte) 3);
                    int d2 = aHVar6.d(c0020av5);
                    if (d2 != -1) {
                        aHVar6.a(c0020av5.a().h(), d2, -1);
                    }
                    this.cU = true;
                    this.t = (byte) 0;
                    this.u = (byte) 1;
                    aHVar6.k();
                    if (parseInt14 == 3 && Long.parseLong(strArr[1]) == this.w.e) {
                        C0020av d3 = ((aH) this.cy.get(Long.valueOf(this.w.e))).d();
                        String f2 = d3.a().f();
                        C0032k.a(f2);
                        for (int i19 = 0; i19 < ((aH) this.cy.get(Long.valueOf(this.w.e))).a().size(); i19++) {
                            aQ aQVar = (aQ) ((aH) this.cy.get(Long.valueOf(this.w.e))).a().get(i19);
                            if (d3 != null) {
                                if (f2.equalsIgnoreCase("gun")) {
                                    if (aQVar.n().startsWith("Close Combat")) {
                                        C0032k.a("disabled");
                                        aQVar.a(true);
                                    } else {
                                        C0032k.a("enabled");
                                        aQVar.a(false);
                                    }
                                } else if (f2.equalsIgnoreCase("knife")) {
                                    if (aQVar.n().startsWith("Gunnery")) {
                                        C0032k.a("disabled");
                                        aQVar.a(true);
                                    } else {
                                        C0032k.a("enabled");
                                        aQVar.a(false);
                                    }
                                } else if (f2.equalsIgnoreCase("sword")) {
                                    if (aQVar.n().startsWith("Bow Crafts")) {
                                        aQVar.a(true);
                                    } else {
                                        aQVar.a(false);
                                    }
                                } else if (f2.equalsIgnoreCase("bow")) {
                                    if (aQVar.n().startsWith("Sword Crafts")) {
                                        aQVar.a(true);
                                    } else {
                                        aQVar.a(false);
                                    }
                                } else if (f2.equalsIgnoreCase("book")) {
                                    if (aQVar.n().startsWith("Combat Magic")) {
                                        aQVar.a(true);
                                    } else {
                                        aQVar.a(false);
                                    }
                                } else if (f2.equalsIgnoreCase("staff")) {
                                    if (aQVar.n().startsWith("Support Magic")) {
                                        aQVar.a(true);
                                    } else {
                                        aQVar.a(false);
                                    }
                                } else if (f2.equalsIgnoreCase("claw")) {
                                    if (aQVar.n().startsWith("Knuckles Training")) {
                                        aQVar.a(true);
                                    } else {
                                        aQVar.a(false);
                                    }
                                } else if (!f2.equalsIgnoreCase("knuckles")) {
                                    aQVar.a(false);
                                } else if (aQVar.n().startsWith("Claws Training")) {
                                    aQVar.a(true);
                                } else {
                                    aQVar.a(false);
                                }
                            } else if (aQVar.n().startsWith("Close Combat") || aQVar.n().startsWith("Gunnery") || aQVar.n().startsWith("Bow Crafts") || aQVar.n().startsWith("Sword Crafts") || aQVar.n().startsWith("Combat Magic") || aQVar.n().startsWith("Support Magic") || aQVar.n().startsWith("Knuckles Training") || aQVar.n().startsWith("Claws Training")) {
                                aQVar.a(true);
                            } else {
                                aQVar.a(false);
                            }
                        }
                    }
                } else if (aHVar6.d().a().a() == Long.parseLong(strArr[2])) {
                    C0020av d4 = aHVar6.d();
                    String f3 = d4.a().f();
                    int d5 = aHVar6.d(d4);
                    if (d5 == -1) {
                        aHVar6.c(d4);
                    } else {
                        aHVar6.a(d4.a().h(), d5, 1);
                    }
                    aHVar6.b(d4);
                    this.l.a(aHVar6.l + " have unequipped " + d4.a().c(), 9765735, 9765735);
                    this.l.a((byte) 3);
                    this.cU = true;
                    this.t = (byte) 0;
                    this.u = (byte) 1;
                    aHVar6.k();
                    if (Long.parseLong(strArr[1]) == this.w.e) {
                        for (int i20 = 0; i20 < ((aH) this.cy.get(Long.valueOf(this.w.e))).a().size(); i20++) {
                            aQ aQVar2 = (aQ) ((aH) this.cy.get(Long.valueOf(this.w.e))).a().get(i20);
                            if (f3.equalsIgnoreCase("gun")) {
                                if (aQVar2.n().startsWith("Gunnery")) {
                                    aQVar2.a(true);
                                }
                            } else if (f3.equalsIgnoreCase("knife")) {
                                if (aQVar2.n().startsWith("Close Combat")) {
                                    aQVar2.a(true);
                                }
                            } else if (f3.equalsIgnoreCase("sword")) {
                                if (aQVar2.n().startsWith("Sword Crafts")) {
                                    aQVar2.a(true);
                                }
                            } else if (f3.equalsIgnoreCase("bow")) {
                                if (aQVar2.n().startsWith("Bow Crafts")) {
                                    aQVar2.a(true);
                                }
                            } else if (f3.equalsIgnoreCase("book")) {
                                if (aQVar2.n().startsWith("Support Magic")) {
                                    aQVar2.a(true);
                                }
                            } else if (f3.equalsIgnoreCase("staff")) {
                                if (aQVar2.n().startsWith("Combat Magic")) {
                                    aQVar2.a(true);
                                }
                            } else if (f3.equalsIgnoreCase("claw")) {
                                if (aQVar2.n().startsWith("Claws Training")) {
                                    aQVar2.a(true);
                                }
                            } else if (f3.equalsIgnoreCase("knuckles") && aQVar2.n().startsWith("Knuckles Training")) {
                                aQVar2.a(true);
                            }
                        }
                    }
                }
                a(C0000a.c());
                if (aHVar6.p == this.w.e) {
                    if (this.at == 0) {
                        this.at = (byte) 1;
                    }
                    this.ax = (byte) 4;
                    this.aB = (byte) 4;
                    this.aF = (byte) 4;
                    this.aJ = (byte) 4;
                    this.aN = (byte) 4;
                    this.ab = false;
                    return;
                }
                return;
            case C0000a.by /* 39 */:
                this.l.a("Failed to change equipment to " + this.w.q.a(strArr[1]).c(), 16711680, 16711680);
                this.l.a((byte) 3);
                C0032k.a(this.bL + " vs. " + this.w.f);
                if (this.bL.equalsIgnoreCase(this.w.f)) {
                    C0032k.a("me");
                    if (this.at == 1) {
                        this.at = (byte) 0;
                    }
                    this.ax = (byte) 0;
                    this.aB = (byte) 4;
                    this.aF = (byte) 4;
                    this.aJ = (byte) 4;
                    this.aN = (byte) 4;
                    this.aR = (byte) 0;
                    this.ab = true;
                    return;
                }
                return;
            case C0000a.bz /* 40 */:
                C0032k.a("missionPlayers size = " + this.cy.size());
                if (this.cy.containsKey(Long.valueOf(strArr[1]))) {
                    this.B.a(((aH) this.cy.get(Long.valueOf(strArr[1]))).P, ((aH) this.cy.get(Long.valueOf(strArr[1]))).Q, (Object) null);
                    this.B.a(((aH) this.cy.get(Long.valueOf(strArr[1]))).P, ((aH) this.cy.get(Long.valueOf(strArr[1]))).Q).a(true);
                    this.B.a(((aH) this.cy.get(Long.valueOf(strArr[1]))).P, ((aH) this.cy.get(Long.valueOf(strArr[1]))).Q).b(false);
                    this.cy.remove(Long.valueOf(strArr[1]));
                    C0032k.a("player " + strArr[1] + " left");
                    return;
                }
                return;
            case C0000a.bA /* 41 */:
                int indexOf = strArr[1].indexOf(".");
                a(strArr[1].substring(0, indexOf), Integer.parseInt(strArr[1].substring(indexOf + 1, strArr[1].length())));
                b();
                this.cB.a((byte) 2);
                this.s = true;
                return;
            case C0000a.bB /* 42 */:
                b(strArr[2] + " " + strArr[3]);
                return;
            case C0000a.bC /* 43 */:
                int parseInt15 = Integer.parseInt(strArr[1]);
                int parseInt16 = Integer.parseInt(strArr[2]);
                if (parseInt15 != 0) {
                    b(parseInt15 + " experience");
                }
                if (parseInt16 != 0) {
                    b(parseInt16 + " sidos");
                    return;
                }
                return;
            case C0000a.bD /* 45 */:
                this.z = -1L;
                this.A = -1L;
                this.y = -1;
                this.b = false;
                this.ab = false;
                this.bK = 0;
                f();
                g();
                i();
                c();
                this.cU = false;
                this.t = (byte) 0;
                this.u = (byte) -1;
                this.cx.clear();
                a(C0000a.a());
                return;
            case C0000a.bE /* 46 */:
                int parseInt17 = Integer.parseInt(strArr[2]);
                int parseInt18 = Integer.parseInt(strArr[3]);
                aH aHVar7 = (aH) this.cy.get(new Long(strArr[1]));
                aHVar7.T = Integer.parseInt(strArr[4]);
                if (this.B.b(aHVar7.P, aHVar7.Q) != null && this.B.b(aHVar7.P, aHVar7.Q).equals(aHVar7)) {
                    this.B.a(aHVar7.P, aHVar7.Q, (Object) null);
                    this.B.a(aHVar7.P, aHVar7.Q).a(true);
                    this.B.a(aHVar7.P, aHVar7.Q).b(false);
                }
                aHVar7.P = parseInt17;
                aHVar7.Q = parseInt18;
                aHVar7.R = this.B.a(parseInt17, parseInt18).j();
                aHVar7.S = this.B.a(parseInt17, parseInt18).k();
                aHVar7.N = this.B.a(parseInt17, parseInt18).j();
                aHVar7.O = this.B.a(parseInt17, parseInt18).k();
                this.B.a(parseInt17, parseInt18, aHVar7);
                this.B.a(parseInt17, parseInt18).a(false);
                this.B.a(parseInt17, parseInt18).b(false);
                return;
            case C0000a.bF /* 47 */:
                if (this.I) {
                    this.dl = System.currentTimeMillis();
                    return;
                }
                this.v.a(this.w.a, this.w.b);
                this.x = (byte) 27;
                return;
            case C0000a.bG /* 48 */:
                String str = "The server will shut down in " + strArr[1];
                String str2 = Integer.parseInt(strArr[1]) > 1 ? str + " minutes." : str + " minute.";
                C0032k.a(str2);
                if (this.l != null) {
                    C0032k.a("add to system info");
                    this.l.a(str2, 7683328, 7683328);
                    this.l.a((byte) 3);
                    return;
                }
                return;
            case C0000a.bH /* 49 */:
                String str3 = strArr[2];
                if (this.l != null) {
                    this.l.a(str3, 7683328, 7683328);
                    this.l.a((byte) 3);
                    return;
                }
                return;
            case C0000a.bI /* 50 */:
                String str4 = ((A) this.cy.get(Long.valueOf(strArr[1]))).l + " received " + strArr[4] + " " + strArr[3];
                a(strArr[1], strArr[2], strArr[4]);
                if (this.l != null) {
                    this.l.a(str4, 7683328, 7683328);
                    this.l.a((byte) 3);
                    return;
                }
                return;
            case C0000a.bJ /* 51 */:
                String str5 = ((A) this.cy.get(Long.valueOf(strArr[1]))).l + " received " + strArr[2] + " sidos";
                if (this.l != null) {
                    this.l.a(str5, 7683328, 7683328);
                    this.l.a((byte) 3);
                    return;
                }
                return;
            case C0000a.bK /* 52 */:
                if (Integer.parseInt(strArr[3]) == this.bK + 1 && Long.parseLong(strArr[1]) == this.w.e) {
                    ((aH) this.cy.get(Long.valueOf(strArr[1]))).a = Integer.parseInt(strArr[2]);
                    return;
                }
                return;
            case C0000a.bL /* 53 */:
                ((aH) this.cy.get(Long.valueOf(strArr[1]))).r = Integer.parseInt(strArr[2]);
                if (((aH) this.cy.get(Long.valueOf(strArr[1]))).r < ((aH) this.cy.get(Long.valueOf(strArr[1]))).u) {
                    ((aH) this.cy.get(Long.valueOf(strArr[1]))).u = ((aH) this.cy.get(Long.valueOf(strArr[1]))).r;
                    return;
                }
                return;
            case C0000a.bM /* 54 */:
                ((aH) this.cy.get(Long.valueOf(strArr[1]))).s = Integer.parseInt(strArr[2]);
                if (((aH) this.cy.get(Long.valueOf(strArr[1]))).s < ((aH) this.cy.get(Long.valueOf(strArr[1]))).v) {
                    ((aH) this.cy.get(Long.valueOf(strArr[1]))).v = ((aH) this.cy.get(Long.valueOf(strArr[1]))).s;
                    return;
                }
                return;
            case C0000a.bN /* 55 */:
                C0021aw.b.a(C0028g.B);
                this.J = "Battle Won!";
                this.I = true;
                a(C0000a.a());
                return;
            case C0000a.bO /* 56 */:
                C0021aw.b.a(C0028g.A);
                this.J = "Battle Lost!";
                this.I = true;
                a(C0000a.a());
                return;
            case C0000a.bP /* 57 */:
                C0021aw.b.a(C0028g.A);
                this.J = "Battle Draw!";
                this.I = true;
                a(C0000a.a());
                return;
            case C0000a.bQ /* 58 */:
                a(strArr[1], strArr[2]);
                return;
        }
    }

    public void a(String str) {
        this.v.U.write(str);
        this.v.U.flush();
        C0032k.a("sent: " + str);
    }

    @Override // defpackage.AbstractC0026e
    public void a() {
    }

    public void a(String str, int i) {
        String str2 = "res/missions/captions/" + str + ".txt";
        C0032k.a("dir=" + str2);
        String str3 = "";
        try {
            String str4 = "";
            InputStream resourceAsStream = getClass().getResourceAsStream(str2);
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
                str4 = new String(byteArrayOutputStream.toByteArray(), "utf-8");
                C0032k.a("caption: " + str4);
            }
            str3 = (str4 == null || str4.length() < 1) ? "Caption read exception" : str4.split("\r\n")[i];
            C0032k.a("read from item file = " + str3);
        } catch (IOException e) {
            C0032k.a(e.getMessage());
        }
        C0032k.a("Caption Text => " + str3);
        this.cB.a(str3, 16777215, 16777215);
    }

    private void b(String str) {
        this.dq.add(str);
    }

    private void b() {
        if (this.dq.size() > 0) {
            this.cB.a("--------------", 16777215, 16777215);
            this.cB.a("Quest Rewards", 16777215, 16777215);
            for (int i = 0; i < this.dq.size(); i++) {
                this.cB.a((String) this.dq.get(i), 16777215, 16777215);
            }
        }
    }

    private void c() {
        this.dr = 30;
        this.du = false;
    }

    private void d() {
        this.ds = System.currentTimeMillis() + 1000;
        this.dr = 30;
        this.du = true;
    }

    private void a(long j) {
        if (!this.du || j <= this.ds) {
            return;
        }
        if (this.dr <= 0) {
            e();
            return;
        }
        this.dr--;
        this.ds = j + 1000;
    }

    private void e() {
        this.du = false;
        this.ab = false;
        g();
        f();
        i();
        this.at = (byte) 4;
        this.ax = (byte) 4;
        this.aB = (byte) 4;
        this.aF = (byte) 4;
        this.aJ = (byte) 4;
        this.aN = (byte) 4;
        this.aR = (byte) 4;
        C0032k.a("time's up!");
        c();
        a(C0000a.d());
        ((aH) this.cy.get(Long.valueOf(this.w.e))).a = -1;
        if (((aH) this.cy.get(Long.valueOf(this.w.e))).b != -1) {
            ((A) this.cy.get(Long.valueOf(this.w.e))).q = ((aH) this.cy.get(Long.valueOf(this.w.e))).b;
            ((aH) this.cy.get(Long.valueOf(this.w.e))).b = -1;
        }
    }

    public static int a(int i, int i2) {
        return cN + ((i - i2) * (cP / 2));
    }

    public static int b(int i, int i2) {
        return cO + ((i + i2) * (cQ / 2));
    }

    public static int c(int i, int i2) {
        return a(i, i2) + (cP / 2);
    }

    public static int d(int i, int i2) {
        return b(i, i2) + (cQ / 2);
    }

    private void f() {
        for (int i = 0; i < this.cW.length; i++) {
            for (int i2 = 0; i2 < this.cW[0].length; i2++) {
                this.cW[i][i2] = 0;
            }
        }
    }

    private void a(int i, int i2, long j) {
        if (j != 0 && i >= 0 && i < this.cW.length && i2 >= 0 && i2 < this.cW[0].length && this.B.a(i, i2).d() && this.cW[i][i2] < j) {
            this.cW[i][i2] = j;
            long j2 = j - 1;
            a(i, i2 + 1, j2);
            a(i, i2 - 1, j2);
            a(i + 1, i2, j2);
            a(i - 1, i2, j2);
        }
    }

    private void g() {
        for (int i = 0; i < this.cY.length; i++) {
            for (int i2 = 0; i2 < this.cY[0].length; i2++) {
                this.cY[i][i2] = 0;
            }
        }
    }

    private void b(int i, int i2, long j) {
        if (j != 0 && i >= 0 && i < this.cY.length && i2 >= 0 && i2 < this.cY[0].length) {
            if ((this.B.a(i, i2).d() || !this.B.a(i, i2).e()) && this.cY[i][i2] < j) {
                this.cY[i][i2] = j;
                long j2 = j - 1;
                b(i, i2 + 1, j2);
                b(i, i2 - 1, j2);
                b(i + 1, i2, j2);
                b(i - 1, i2, j2);
            } else if (this.B.a(i, i2).d() || !this.B.a(i, i2).e() || this.cY[i][i2] >= j) {
            } else {
                long j3 = j - 1;
                b(i, i2 + 1, j3);
                b(i, i2 - 1, j3);
                b(i + 1, i2, j3);
                b(i - 1, i2, j3);
            }
        }
    }

    private void h() {
        for (int i = 0; i < this.db.length; i++) {
            for (int i2 = 0; i2 < this.db[0].length; i2++) {
                this.db[i][i2] = 0;
            }
        }
    }

    private void c(int i, int i2, long j) {
        if (j != 0 && i >= 0 && i < this.db.length && i2 >= 0 && i2 < this.db[0].length) {
            if ((this.B.a(i, i2).d() || !this.B.a(i, i2).e()) && this.db[i][i2] < j) {
                this.db[i][i2] = j;
                long j2 = j - 1;
                c(i, i2 + 1, j2);
                c(i, i2 - 1, j2);
                c(i + 1, i2, j2);
                c(i - 1, i2, j2);
                c(i - 1, i2 - 1, j2);
                c(i - 1, i2 + 1, j2);
                c(i + 1, i2 - 1, j2);
                c(i + 1, i2 + 1, j2);
            } else if (this.B.a(i, i2).d() || !this.B.a(i, i2).e() || this.db[i][i2] >= j) {
            } else {
                long j3 = j - 1;
                c(i, i2 + 1, j3);
                c(i, i2 - 1, j3);
                c(i + 1, i2, j3);
                c(i - 1, i2, j3);
                c(i - 1, i2 - 1, j3);
                c(i - 1, i2 + 1, j3);
                c(i + 1, i2 - 1, j3);
                c(i + 1, i2 + 1, j3);
            }
        }
    }

    private void i() {
        for (int i = 0; i < this.cY.length; i++) {
            for (int i2 = 0; i2 < this.cY[0].length; i2++) {
                this.da[i][i2] = 0;
            }
        }
    }

    private void d(int i, int i2, long j) {
        if (j != 0 && i >= 0 && i < this.da.length && i2 >= 0 && i2 < this.da[0].length) {
            if ((this.B.a(i, i2).d() || !this.B.a(i, i2).e()) && this.da[i][i2] < j) {
                this.da[i][i2] = j;
                long j2 = j - 1;
                d(i, i2 + 1, j2);
                d(i, i2 - 1, j2);
                d(i + 1, i2, j2);
                d(i - 1, i2, j2);
            }
        }
    }

    private Dimension e(int i, int i2) {
        for (int i3 = 0; i3 < this.cW.length; i3++) {
            for (int i4 = 0; i4 < this.cW[0].length; i4++) {
                if (i > this.B.a(i3, i4).h() && i < this.B.a(i3, i4).h() + cP && i2 > this.B.a(i3, i4).i() && i2 < this.B.a(i3, i4).i() + cQ) {
                    try {
                        int[] iArr = new int[1];
                        this.w.C.getRGB(i - this.B.a(i3, i4).h(), i2 - this.B.a(i3, i4).i(), 1, 1, iArr, 0, 1);
                        for (int i5 : iArr) {
                            if (i5 != -1) {
                                return new Dimension(i3, i4);
                            }
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                    }
                }
            }
        }
        return null;
    }

    public void a(long j, String str) {
        C0032k.a("playerchat message = " + str);
        ((A) this.cy.get(Long.valueOf(j))).a(str);
        String str2 = str;
        try {
            str2 = new String(str2.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            C0032k.a(e);
        }
        C0032k.a("playerchat message2 = " + str2);
        this.Q.a(((A) this.cy.get(Long.valueOf(j))).l + ": " + str2, 16711680, 0);
    }

    public void b(long j, String str) {
        this.Q.a(((A) this.cy.get(Long.valueOf(j))).l + ": " + str, 16711680, 0);
        String str2 = str;
        try {
            str2 = new String(str2.getBytes(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C0032k.a(e);
        }
        ((A) this.cy.get(Long.valueOf(j))).a(str2);
    }

    public void a(String str, String str2) {
        C0021aw.b.a(C0028g.e);
        this.Q.a(str + " speaks to you: " + str2, 9831166, 0);
        this.Q.a((byte) 3);
    }

    public void a(long j, int i) {
        this.R = i;
        String str = ((A) this.cy.get(Long.valueOf(j))).l;
        switch (this.R) {
            case 0:
                this.Q.a(str + ": *smiles*", 16711680, 16777011);
                break;
            case 1:
                this.Q.a(str + ": *frowns*", 16711680, 16777011);
                break;
            case 2:
                this.Q.a(str + ": *SOS*", 16711680, 16777011);
                break;
            case 3:
                this.Q.a(str + ": *grateful*", 16711680, 16777011);
                break;
            case 4:
                this.Q.a(str + ": *sobs*", 16711680, 16777011);
                break;
            case 5:
                this.Q.a(str + ": *heart flutters*", 16711680, 16777011);
                break;
            case 6:
                this.Q.a(str + ": *blushes*", 16711680, 16777011);
                break;
            case 7:
                this.Q.a(str + ": *shocked*", 16711680, 16777011);
                break;
            case 8:
                this.Q.a(str + ": *grins*", 16711680, 16777011);
                break;
            case 9:
                this.Q.a(str + ": *yawns*", 16711680, 16777011);
                break;
            case 10:
                this.Q.a(str + ": *waves*", 16711680, 16777011);
                break;
        }
        ((A) this.cy.get(Long.valueOf(j))).c(this.R);
    }

    public void a(long j, int i, int i2, String str) {
        Enumeration elements = this.cx.elements();
        while (elements.hasMoreElements()) {
            ((A) elements.nextElement()).i();
        }
        Enumeration elements2 = this.cy.elements();
        while (elements2.hasMoreElements()) {
            ((A) elements2.nextElement()).i();
        }
        aH aHVar = (aH) this.cy.get(Long.valueOf(j));
        D a = this.w.q.a(str);
        int o = a.o();
        Vector b = aHVar.b();
        int i3 = 0;
        while (true) {
            if (i3 >= b.size()) {
                break;
            } else if (((C0020av) b.get(i3)).a().a() == Long.parseLong(str)) {
                aHVar.a(3, i3, -1);
                break;
            } else {
                i3++;
            }
        }
        String c = a.c();
        A[] a2 = a(Long.valueOf(j), i, i2, o);
        aHVar.a(a2, i, i2, c);
        this.t = (byte) 0;
        this.u = (byte) (a2.length + 1);
        this.cR = this.B.a(aHVar.P, aHVar.Q).h();
        this.cS = this.B.a(aHVar.P, aHVar.Q).i();
        if (aHVar.p == this.w.e) {
            this.ax = (byte) 4;
            this.aB = (byte) 4;
            this.aF = (byte) 4;
            this.aJ = (byte) 4;
            this.aN = (byte) 4;
        }
        this.cU = true;
    }

    public A[] a(Long l, int i, int i2, int i3) {
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        vector2.add(l);
        try {
            Object b = this.B.b(i, i2);
            if (b != null) {
                if (b.getClass() == Class.forName("aH")) {
                    vector2.add(new Long(((A) b).p));
                    vector.add((A) b);
                } else if (b.getClass() == Class.forName("aS")) {
                    vector3.add(new Long(((A) b).p));
                    vector.add((A) b);
                }
            }
            if (i3 > 0) {
                for (int i4 = 1; i4 <= i3; i4++) {
                    for (int i5 = 0 - i4; i5 < i4 * 2; i5 += i4) {
                        for (int i6 = 0 - i4; i6 < i4 * 2; i6 += i4) {
                            Object b2 = this.B.b(i + i5, i2 + i6);
                            if (b2 != null) {
                                if (b2.getClass() == Class.forName("aH")) {
                                    vector2.add(new Long(((A) b2).p));
                                    vector.add((A) b2);
                                } else if (b2.getClass() == Class.forName("aS")) {
                                    vector3.add(new Long(((A) b2).p));
                                    vector.add((A) b2);
                                }
                            }
                        }
                    }
                }
            }
        } catch (ClassNotFoundException e) {
        }
        if (vector.size() == 0) {
            this.cz = null;
            this.cA = null;
            return null;
        }
        A[] aArr = new A[vector.size()];
        for (int i7 = 0; i7 < aArr.length; i7++) {
            aArr[i7] = (A) vector.elementAt(i7);
        }
        if (vector3.size() == 0) {
            this.cz = null;
        } else {
            this.cz = new long[vector3.size()];
            for (int i8 = 0; i8 < this.cz.length; i8++) {
                this.cz[i8] = ((Long) vector3.elementAt(i8)).longValue();
            }
        }
        if (vector2.size() == 0) {
            this.cA = null;
        } else {
            this.cA = new long[vector2.size()];
            for (int i9 = 0; i9 < this.cA.length; i9++) {
                this.cA[i9] = ((Long) vector2.elementAt(i9)).longValue();
            }
        }
        return aArr;
    }

    public void a(String str, byte b, byte b2) {
        int i = this.bl;
        int i2 = this.bm - this.by;
        switch (b) {
            case 0:
                i -= this.bp;
                break;
            case 1:
                i += 45;
                break;
        }
        switch (b2) {
            case 2:
                this.bi.a(str, i, i2, this.bp, this.bq, MastersOfDestiny.C, null);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.AbstractC0026e
    public void a(MouseEvent mouseEvent) {
        if (this.I && mouseEvent.getX() > this.ct && mouseEvent.getX() < this.ct + this.cv && mouseEvent.getY() > this.cu && mouseEvent.getY() < this.cu + this.cw) {
            this.x = (byte) 27;
            this.v.a(this.w.a, this.w.b);
        }
        if (mouseEvent.getX() >= this.K && mouseEvent.getX() <= this.K + this.O && mouseEvent.getY() >= this.L && mouseEvent.getY() <= this.L + this.P) {
            this.Q.a((byte) 0);
        } else if (mouseEvent.getX() >= this.M && mouseEvent.getX() <= this.M + this.O && mouseEvent.getY() >= this.N && mouseEvent.getY() <= this.N + this.P) {
            this.Q.a((byte) 1);
        } else if (mouseEvent.getX() > this.m && mouseEvent.getX() < this.m + this.q && mouseEvent.getY() > this.n && mouseEvent.getY() < this.n + this.r) {
            this.l.a((byte) 0);
        } else if (mouseEvent.getX() > this.o && mouseEvent.getX() < this.o + this.q && mouseEvent.getY() > this.p && mouseEvent.getY() < this.p + this.r) {
            this.l.a((byte) 1);
        } else {
            for (int i = 0; i < this.S.length; i++) {
                if (mouseEvent.getX() >= this.S[i] && mouseEvent.getX() <= this.S[i] + this.U && mouseEvent.getY() >= this.T && mouseEvent.getY() <= this.T + this.V) {
                    a(this.w.e, i);
                    a(C0000a.a(i));
                    return;
                }
            }
            if (mouseEvent.getX() >= this.X && mouseEvent.getX() <= this.X + this.Z && mouseEvent.getY() >= this.Y && mouseEvent.getY() <= this.Y + this.aa) {
                this.w.v.a();
                return;
            }
            if (this.s) {
                if (mouseEvent.getX() >= this.cE && mouseEvent.getX() <= this.cE + this.cG && mouseEvent.getY() >= this.cF[0] && mouseEvent.getY() <= this.cF[0] + this.cH) {
                    this.cB.a((byte) 0);
                    return;
                } else if (mouseEvent.getX() >= this.cE && mouseEvent.getX() <= this.cE + this.cG && mouseEvent.getY() >= this.cF[1] && mouseEvent.getY() <= this.cF[1] + this.cH) {
                    this.cB.a((byte) 1);
                    return;
                } else if (mouseEvent.getX() >= this.cI && mouseEvent.getX() <= this.cI + this.cK && mouseEvent.getY() >= this.cJ && mouseEvent.getY() <= this.cJ + this.cL) {
                    this.s = false;
                    this.cB.b();
                    return;
                }
            }
            if (mouseEvent.getX() >= this.ac && mouseEvent.getX() <= this.ac + this.ae && mouseEvent.getY() >= this.ad && mouseEvent.getY() <= this.ad + this.af) {
                if (this.ab) {
                    this.ab = false;
                    return;
                }
                this.ab = true;
                if (this.at == 2) {
                    f();
                    this.at = (byte) 0;
                }
                if (this.ax == 2) {
                    if (this.aB == 2 || this.aF == 3) {
                        g();
                    }
                    if (this.aJ == 3) {
                        i();
                    }
                    this.ax = (byte) 0;
                    this.aB = (byte) 4;
                    this.aF = (byte) 4;
                    this.aJ = (byte) 4;
                    this.aN = (byte) 4;
                    return;
                }
                return;
            }
            if (this.ab) {
                C0020av d = ((aH) this.cy.get(new Long(this.w.e))).d();
                if (this.at == 0 && mouseEvent.getX() >= this.av && mouseEvent.getX() <= this.av + this.ai && mouseEvent.getY() >= this.aw && mouseEvent.getY() <= this.aw + this.aj) {
                    C0032k.a("moveBtn clicked");
                    int i2 = ((A) this.cy.get(Long.valueOf(this.w.e))).P;
                    int i3 = ((A) this.cy.get(Long.valueOf(this.w.e))).Q;
                    C0032k.a("startTileX " + i2 + " startTileY " + i3);
                    f();
                    int i4 = ((A) this.cy.get(Long.valueOf(this.w.e))).w;
                    C0032k.a("availableAP = " + i4);
                    a(i2, i3 + 1, i4);
                    a(i2, i3 - 1, i4);
                    a(i2 + 1, i3, i4);
                    a(i2 - 1, i3, i4);
                    this.at = (byte) 2;
                    this.ab = false;
                    return;
                } else if (this.ax == 0 && mouseEvent.getX() >= this.az && mouseEvent.getX() <= this.az + this.ai && mouseEvent.getY() >= this.aA && mouseEvent.getY() <= this.aA + this.aj) {
                    this.ax = (byte) 2;
                    if (d == null || Integer.parseInt(d.a().m()) > ((aH) this.cy.get(new Long(this.w.e))).v) {
                        this.aB = (byte) 4;
                    } else {
                        this.aB = (byte) 0;
                    }
                    this.aF = (byte) 0;
                    this.aJ = (byte) 0;
                    this.aN = (byte) 0;
                    C0032k.a("((Player)missionPlayers.get(new Long(gameData.characterID))).getSkills().size() - " + ((aH) this.cy.get(new Long(this.w.e))).a().size());
                    Enumeration elements = ((aH) this.cy.get(new Long(this.w.e))).a().elements();
                    while (elements.hasMoreElements()) {
                        C0032k.a("Skill - " + ((aQ) elements.nextElement()).b());
                    }
                    return;
                } else if (this.ax == 2 && this.aB == 0 && mouseEvent.getX() >= this.aD && mouseEvent.getX() <= this.aD + this.am && mouseEvent.getY() >= this.aE && mouseEvent.getY() <= this.aE + this.an) {
                    int i5 = ((A) this.cy.get(Long.valueOf(this.w.e))).P;
                    int i6 = ((A) this.cy.get(Long.valueOf(this.w.e))).Q;
                    g();
                    b(i5, i6, d != null ? Integer.parseInt(d.a().g()) + 1 : 2);
                    this.bH = 1L;
                    this.aB = (byte) 2;
                    this.aF = (byte) 4;
                    this.aJ = (byte) 4;
                    this.aN = (byte) 4;
                    this.ab = false;
                    return;
                } else if (this.ax == 2 && this.aF == 0 && mouseEvent.getX() >= this.aH && mouseEvent.getX() <= this.aH + this.am && mouseEvent.getY() >= this.aI && mouseEvent.getY() <= this.aI + this.an) {
                    this.ax = (byte) 2;
                    if (d == null || Integer.parseInt(d.a().m()) > ((aH) this.cy.get(new Long(this.w.e))).v) {
                        this.aB = (byte) 4;
                    } else {
                        this.aB = (byte) 0;
                    }
                    this.aF = (byte) 2;
                    this.aJ = (byte) 0;
                    this.aN = (byte) 0;
                    this.bh = 0;
                    this.br = this.bt;
                    this.bs = this.bu;
                    this.G = -1;
                    this.H = -1;
                    this.bz = ((aH) this.cy.get(new Long(this.w.e))).a();
                    return;
                } else if (this.ax == 2 && this.aJ == 0 && mouseEvent.getX() >= this.aL && mouseEvent.getX() <= this.aL + this.am && mouseEvent.getY() >= this.aM && mouseEvent.getY() <= this.aM + this.an) {
                    this.ax = (byte) 2;
                    if (d == null || Integer.parseInt(d.a().m()) > ((aH) this.cy.get(new Long(this.w.e))).v) {
                        this.aB = (byte) 4;
                    } else {
                        this.aB = (byte) 0;
                    }
                    this.aF = (byte) 0;
                    this.aJ = (byte) 2;
                    this.aN = (byte) 0;
                    this.bh = 0;
                    this.br = this.bt;
                    this.bs = this.bu;
                    this.G = -1;
                    this.H = -1;
                    this.bz = ((aH) this.cy.get(new Long(this.w.e))).b();
                    C0032k.a("player inventory size 3 = " + ((aH) this.cy.get(new Long(this.w.e))).b().size());
                    C0032k.a("itemForSelect.size() = " + this.bz.size());
                    return;
                } else if (this.ax == 2 && this.aN == 0 && mouseEvent.getX() >= this.aP && mouseEvent.getX() <= this.aP + this.am && mouseEvent.getY() >= this.aQ && mouseEvent.getY() <= this.aQ + this.an) {
                    this.ax = (byte) 2;
                    if (d == null || Integer.parseInt(d.a().m()) > ((aH) this.cy.get(new Long(this.w.e))).v) {
                        this.aB = (byte) 4;
                    } else {
                        this.aB = (byte) 0;
                    }
                    this.aF = (byte) 0;
                    this.aJ = (byte) 0;
                    this.aN = (byte) 2;
                    this.bh = 0;
                    this.br = this.bv;
                    this.bs = this.bw;
                    this.G = -1;
                    this.H = -1;
                    this.bz = ((aH) this.cy.get(new Long(this.w.e))).c();
                    C0032k.a("itemForSelect.size() = " + this.bz.size());
                    this.bA = ((aH) this.cy.get(new Long(this.w.e))).d();
                    return;
                } else if (this.aR == 0 && mouseEvent.getX() >= this.aT && mouseEvent.getX() <= this.aT + this.ai && mouseEvent.getY() >= this.aU && mouseEvent.getY() <= this.aU + this.aj) {
                    a(C0000a.d());
                    ((aH) this.cy.get(Long.valueOf(this.w.e))).a = -1;
                    if (((aH) this.cy.get(Long.valueOf(this.w.e))).b != -1) {
                        ((A) this.cy.get(Long.valueOf(this.w.e))).q = ((aH) this.cy.get(Long.valueOf(this.w.e))).b;
                        ((aH) this.cy.get(Long.valueOf(this.w.e))).b = -1;
                    }
                    c();
                    g();
                    f();
                    this.at = (byte) 4;
                    this.ax = (byte) 4;
                    this.aB = (byte) 4;
                    this.aF = (byte) 4;
                    this.aJ = (byte) 4;
                    this.aN = (byte) 4;
                    this.aR = (byte) 4;
                    this.ab = false;
                    return;
                } else {
                    if (this.aF == 2 || this.aJ == 2 || this.aN == 2) {
                        for (int i7 = 0; i7 < this.bc.length; i7++) {
                            if (mouseEvent.getX() >= this.bb && mouseEvent.getX() <= this.bb + this.bf && mouseEvent.getY() >= this.bc[i7] && mouseEvent.getY() <= this.bc[i7] + this.bg) {
                                switch (i7) {
                                    case 0:
                                        if (this.bh > 0) {
                                            this.bh--;
                                            return;
                                        }
                                        return;
                                    case 1:
                                        if (this.br.length * (this.bh + this.bs.length) < this.bz.size()) {
                                            this.bh++;
                                            return;
                                        }
                                        return;
                                }
                            }
                        }
                    }
                    if (this.aJ == 2) {
                        int length = this.bh * this.br.length;
                        for (int i8 = 0; i8 < this.bs.length; i8++) {
                            for (int i9 = 0; i9 < this.br.length; i9++) {
                                if (mouseEvent.getX() >= this.br[i9] && mouseEvent.getX() <= this.br[i9] + this.bx && mouseEvent.getY() >= this.bs[i8] && mouseEvent.getY() <= this.bs[i8] + this.by) {
                                    C0032k.a("x=" + i9 + "; y=" + i8);
                                    int length2 = length + (i8 * this.br.length) + i9;
                                    C0032k.a("indx=" + length2);
                                    C0032k.a("itemForSelect.size()=" + this.bz.size());
                                    if (length2 < this.bz.size()) {
                                        C0020av c0020av = (C0020av) this.bz.elementAt(length2);
                                        aH aHVar = (aH) this.cy.get(Long.valueOf(this.w.e));
                                        if (aHVar.t < Integer.parseInt(c0020av.a().l())) {
                                            if (this.l != null) {
                                                this.l.a("You haven't reached the level requirement of this item!", 16711680, 16711680);
                                                this.l.a((byte) 3);
                                                return;
                                            }
                                            return;
                                        }
                                        int i10 = ((A) this.cy.get(Long.valueOf(this.w.e))).P;
                                        int i11 = ((A) this.cy.get(Long.valueOf(this.w.e))).Q;
                                        g();
                                        int parseInt = Integer.parseInt(c0020av.a().g()) + 1;
                                        C0032k.a("range=" + parseInt);
                                        this.bH = c0020av.a().a();
                                        if (parseInt == 1) {
                                            c();
                                            if (this.at == 0) {
                                                this.at = (byte) 1;
                                            }
                                            this.ax = (byte) 1;
                                            this.aB = (byte) 1;
                                            this.aF = (byte) 1;
                                            this.aJ = (byte) 1;
                                            this.aN = (byte) 1;
                                            this.aR = (byte) 1;
                                            this.A = this.bH;
                                            a(C0000a.b(this.bH, aHVar.P, aHVar.Q));
                                        } else {
                                            b(i10, i11, parseInt);
                                            this.G = this.br[i9];
                                            this.H = this.bs[i8];
                                            this.y = length2;
                                            this.aJ = (byte) 3;
                                        }
                                        this.ab = false;
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                    if (this.aF == 2) {
                        C0032k.a("skill in progress");
                        int length3 = this.bh * this.br.length;
                        C0032k.a("itemIndx=" + length3);
                        for (int i12 = 0; i12 < this.bs.length; i12++) {
                            for (int i13 = 0; i13 < this.br.length; i13++) {
                                if (mouseEvent.getX() >= this.br[i13] && mouseEvent.getX() <= this.br[i13] + this.bx && mouseEvent.getY() >= this.bs[i12] && mouseEvent.getY() <= this.bs[i12] + this.by) {
                                    C0032k.a("x=" + i13 + "; y=" + i12);
                                    int length4 = length3 + (i12 * this.br.length) + i13;
                                    C0032k.a("indx=" + length4);
                                    C0032k.a("itemForSelect.size()=" + this.bz.size());
                                    if (length4 < this.bz.size()) {
                                        aQ aQVar = (aQ) this.bz.elementAt(length4);
                                        if (aQVar.o() > ((aH) this.cy.get(new Long(this.w.e))).v || aQVar.r()) {
                                            if (aQVar.o() <= ((aH) this.cy.get(new Long(this.w.e))).v || aQVar.r() || this.l == null) {
                                                return;
                                            }
                                            this.l.a("You don't have enough energy to execute this skill!", 16711680, 16711680);
                                            this.l.a((byte) 3);
                                            return;
                                        }
                                        int i14 = ((A) this.cy.get(Long.valueOf(this.w.e))).P;
                                        int i15 = ((A) this.cy.get(Long.valueOf(this.w.e))).Q;
                                        g();
                                        int f = ((int) aQVar.f()) + 1;
                                        if (f != 1) {
                                            if (f == 0) {
                                                f = Integer.parseInt(((aH) this.cy.get(new Long(this.w.e))).d().a().g()) + 1;
                                                b(i14, i15, f);
                                            } else {
                                                b(i14, i15, f);
                                            }
                                            C0032k.a("range=" + f);
                                            C0032k.a("skillid=" + aQVar.a());
                                            this.bH = aQVar.a();
                                            this.G = this.br[i13];
                                            this.H = this.bs[i12];
                                            this.y = length4;
                                            this.aF = (byte) 3;
                                            this.ab = false;
                                            return;
                                        }
                                        g();
                                        c();
                                        this.ab = false;
                                        this.bH = aQVar.a();
                                        this.G = this.br[i13];
                                        this.H = this.bs[i12];
                                        this.y = length4;
                                        if (this.at == 0) {
                                            this.at = (byte) 1;
                                        }
                                        this.ax = (byte) 1;
                                        this.aB = (byte) 1;
                                        this.aF = (byte) 1;
                                        this.aJ = (byte) 1;
                                        this.aN = (byte) 1;
                                        this.aR = (byte) 1;
                                        this.z = this.bH;
                                        a(C0000a.a(this.bH, i14, i15));
                                        C0032k.a("aoe skill used: x=" + i14 + "; y=" + i15);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            Dimension e = e(mouseEvent.getX(), mouseEvent.getY());
            h();
            if (this.aJ == 3) {
                if (e == null) {
                    g();
                    this.ax = (byte) 0;
                    this.aB = (byte) 4;
                    this.aF = (byte) 4;
                    this.aJ = (byte) 4;
                    this.aN = (byte) 4;
                    this.ab = true;
                } else if (this.cY[e.width][e.height] > 0) {
                    g();
                    byte parseByte = Byte.parseByte(((C0020av) this.bz.elementAt(this.y)).a().d());
                    aH aHVar2 = (aH) this.cy.get(Long.valueOf(this.w.e));
                    if (parseByte == 1) {
                        try {
                            Object b = this.B.b(e.width, e.height);
                            if (b == null) {
                                this.ax = (byte) 0;
                                this.aB = (byte) 4;
                                this.aF = (byte) 4;
                                this.aJ = (byte) 4;
                                this.aN = (byte) 4;
                                this.ab = true;
                            } else if (b.getClass() == Class.forName("aS") || (b.getClass() == Class.forName("aH") && ((A) b).A != aHVar2.A)) {
                                c();
                                if (this.at == 0) {
                                    this.at = (byte) 1;
                                }
                                this.ax = (byte) 1;
                                this.aB = (byte) 1;
                                this.aF = (byte) 1;
                                this.aJ = (byte) 1;
                                this.aN = (byte) 1;
                                this.aR = (byte) 1;
                                this.A = this.bH;
                                a(C0000a.b(this.bH, e.width, e.height));
                            }
                        } catch (ClassNotFoundException e2) {
                        }
                    } else if (parseByte == 2) {
                        try {
                            Object b2 = this.B.b(e.width, e.height);
                            if (b2 == null) {
                                this.ax = (byte) 0;
                                this.aB = (byte) 4;
                                this.aF = (byte) 4;
                                this.aJ = (byte) 4;
                                this.aN = (byte) 4;
                                this.ab = true;
                            } else if (b2.getClass() == Class.forName("aH") && ((A) b2).A == aHVar2.A) {
                                c();
                                if (this.at == 0) {
                                    this.at = (byte) 1;
                                }
                                this.ax = (byte) 1;
                                this.aB = (byte) 1;
                                this.aF = (byte) 1;
                                this.aJ = (byte) 1;
                                this.aN = (byte) 1;
                                this.aR = (byte) 1;
                                this.A = this.bH;
                                a(C0000a.b(this.bH, e.width, e.height));
                            }
                        } catch (ClassNotFoundException e3) {
                        }
                    }
                }
                this.y = -1;
            } else if (this.aB == 2) {
                try {
                    if (e == null) {
                        g();
                        this.ax = (byte) 0;
                        this.aB = (byte) 4;
                        this.aF = (byte) 4;
                        this.aJ = (byte) 4;
                        this.aN = (byte) 4;
                        this.ab = true;
                    } else if (this.cY[e.width][e.height] > 0) {
                        g();
                        Object b3 = this.B.b(e.width, e.height);
                        C0032k.a("object on tile = " + b3);
                        aH aHVar3 = (aH) this.cy.get(Long.valueOf(this.w.e));
                        if (b3 == null) {
                            this.ax = (byte) 0;
                            this.aB = (byte) 4;
                            this.aF = (byte) 4;
                            this.aJ = (byte) 4;
                            this.aN = (byte) 4;
                            this.ab = true;
                        } else if (b3.getClass() == Class.forName("aS") || (b3.getClass() == Class.forName("aH") && ((A) b3).A != aHVar3.A)) {
                            c();
                            if (this.at == 0) {
                                this.at = (byte) 1;
                            }
                            this.ax = (byte) 1;
                            this.aB = (byte) 1;
                            this.aF = (byte) 1;
                            this.aJ = (byte) 1;
                            this.aN = (byte) 1;
                            this.aR = (byte) 1;
                            a(C0000a.a(this.bH, e.width, e.height));
                        }
                    }
                } catch (ClassNotFoundException e4) {
                }
            } else if (this.aF != 3) {
                if (this.at == 2) {
                    if (e == null) {
                        f();
                        this.at = (byte) 0;
                        this.ab = true;
                        return;
                    } else if (this.cW[e.width][e.height] <= 0) {
                        f();
                        this.at = (byte) 0;
                        this.ab = true;
                        return;
                    } else {
                        f();
                        int i16 = ((A) this.cy.get(Long.valueOf(this.w.e))).P;
                        int i17 = ((A) this.cy.get(Long.valueOf(this.w.e))).Q;
                        int i18 = e.width > i16 ? e.height > i17 ? 2 : 3 : e.height > i17 ? 1 : 0;
                        c();
                        this.at = (byte) 1;
                        if (this.ax == 0) {
                            this.ax = (byte) 1;
                            this.aB = (byte) 1;
                            this.aF = (byte) 1;
                            this.aJ = (byte) 1;
                            this.aN = (byte) 1;
                        }
                        this.aR = (byte) 1;
                        a(C0000a.a(e.width, e.height, i18));
                        return;
                    }
                }
                try {
                    if (e == null) {
                        this.co = -1L;
                        return;
                    }
                    Object b4 = this.B.b(e.width, e.height);
                    if (b4 == null) {
                        this.co = -1L;
                    } else if (b4.getClass() == Class.forName("aH")) {
                        this.cp = false;
                        this.co = ((A) b4).p;
                        if (this.co == this.w.e) {
                            this.co = -1L;
                        }
                    } else if (b4.getClass() == Class.forName("aS")) {
                        this.cp = true;
                        this.co = ((A) b4).p;
                        C0032k.a("mouseOver monster - " + this.co);
                    } else {
                        this.co = -1L;
                    }
                } catch (ClassNotFoundException e5) {
                    if (mouseEvent.getX() != this.dm || mouseEvent.getY() != this.dn || this.f2do < System.currentTimeMillis()) {
                        this.dm = mouseEvent.getX();
                        this.dn = mouseEvent.getY();
                        this.f2do = System.currentTimeMillis() + 300;
                        C0032k.a("first click");
                        return;
                    }
                    f(mouseEvent);
                    C0032k.a("double click ");
                    this.dm = 0;
                    this.dn = 0;
                    this.f2do = 0L;
                }
            } else {
                aH aHVar4 = (aH) this.cy.get(Long.valueOf(this.w.e));
                if (e == null) {
                    g();
                    this.ax = (byte) 0;
                    this.aB = (byte) 4;
                    this.aF = (byte) 4;
                    this.aJ = (byte) 4;
                    this.aN = (byte) 4;
                    this.ab = true;
                } else if (this.cY[e.width][e.height] > 0) {
                    g();
                    byte h = (byte) ((aQ) this.bz.elementAt(this.y)).h();
                    if (h == 1) {
                        try {
                            Object b5 = this.B.b(e.width, e.height);
                            if (b5 == null) {
                                this.ax = (byte) 0;
                                this.aB = (byte) 4;
                                this.aF = (byte) 4;
                                this.aJ = (byte) 4;
                                this.aN = (byte) 4;
                                this.ab = true;
                            } else if (b5.getClass() == Class.forName("aS") || (b5.getClass() == Class.forName("aH") && ((A) b5).A != aHVar4.A)) {
                                c();
                                if (this.at == 0) {
                                    this.at = (byte) 1;
                                }
                                this.ax = (byte) 1;
                                this.aB = (byte) 1;
                                this.aF = (byte) 1;
                                this.aJ = (byte) 1;
                                this.aN = (byte) 1;
                                this.aR = (byte) 1;
                                this.z = this.bH;
                                a(C0000a.a(this.bH, e.width, e.height));
                            }
                        } catch (ClassNotFoundException e6) {
                        }
                    } else if (h == 2) {
                        try {
                            Object b6 = this.B.b(e.width, e.height);
                            if (b6 == null) {
                                this.ax = (byte) 0;
                                this.aB = (byte) 4;
                                this.aF = (byte) 4;
                                this.aJ = (byte) 4;
                                this.aN = (byte) 4;
                                this.ab = true;
                            } else if (b6.getClass() == Class.forName("aH") && ((A) b6).A == aHVar4.A) {
                                c();
                                if (this.at == 0) {
                                    this.at = (byte) 1;
                                }
                                this.ax = (byte) 1;
                                this.aB = (byte) 1;
                                this.aF = (byte) 1;
                                this.aJ = (byte) 1;
                                this.aN = (byte) 1;
                                this.aR = (byte) 1;
                                this.z = this.bH;
                                a(C0000a.a(this.bH, e.width, e.height));
                            }
                        } catch (ClassNotFoundException e7) {
                        }
                    } else {
                        c();
                        if (this.at == 0) {
                            this.at = (byte) 1;
                        }
                        this.ax = (byte) 1;
                        this.aB = (byte) 1;
                        this.aF = (byte) 1;
                        this.aJ = (byte) 1;
                        this.aN = (byte) 1;
                        this.aR = (byte) 1;
                        this.z = this.bH;
                        a(C0000a.a(this.bH, e.width, e.height));
                    }
                }
                this.y = -1;
            }
        }
    }

    public void f(MouseEvent mouseEvent) {
        if (this.ab) {
            if (this.ax == 2 && this.aF == 2) {
                int length = this.bh * this.br.length;
                for (int i = 0; i < this.bs.length; i++) {
                    for (int i2 = 0; i2 < this.br.length; i2++) {
                        if (mouseEvent.getX() >= this.br[i2] && mouseEvent.getX() <= this.br[i2] + this.bx && mouseEvent.getY() >= this.bs[i] && mouseEvent.getY() <= this.bs[i] + this.by && length < this.bz.size()) {
                            this.bH = ((aQ) this.bz.elementAt(length)).a();
                            int i3 = ((A) this.cy.get(Long.valueOf(this.w.e))).P;
                            int i4 = ((A) this.cy.get(Long.valueOf(this.w.e))).Q;
                            long f = ((aQ) this.bz.elementAt(length)).f();
                            b(i3, i4 + 1, f);
                            b(i3, i4 - 1, f);
                            b(i3 + 1, i4, f);
                            b(i3 - 1, i4, f);
                            this.ab = false;
                            this.aF = (byte) 3;
                        }
                    }
                }
            } else if (this.ax == 2 && this.aJ == 2) {
                int length2 = this.bh * this.br.length;
                for (int i5 = 0; i5 < this.bs.length; i5++) {
                    for (int i6 = 0; i6 < this.br.length; i6++) {
                        if (mouseEvent.getX() >= this.br[i6] && mouseEvent.getX() <= this.br[i6] + this.bx && mouseEvent.getY() >= this.bs[i5] && mouseEvent.getY() <= this.bs[i5] + this.by && length2 < this.bz.size()) {
                            this.bH = ((C0020av) this.bz.elementAt(length2)).a.a();
                            int i7 = ((A) this.cy.get(Long.valueOf(this.w.e))).P;
                            int i8 = ((A) this.cy.get(Long.valueOf(this.w.e))).Q;
                            long parseLong = Long.parseLong(((C0020av) this.bz.elementAt(length2)).a().g());
                            d(i7, i8 + 1, parseLong);
                            d(i7, i8 - 1, parseLong);
                            d(i7 + 1, i8, parseLong);
                            d(i7 - 1, i8, parseLong);
                            this.ab = false;
                            this.aJ = (byte) 3;
                        }
                    }
                }
            } else if (this.ax == 2 && this.aN == 2) {
                int length3 = this.bh * this.br.length;
                for (int i9 = 0; i9 < this.bs.length; i9++) {
                    for (int i10 = 0; i10 < this.br.length; i10++) {
                        if (mouseEvent.getX() >= this.br[i10] && mouseEvent.getX() <= this.br[i10] + this.bx && mouseEvent.getY() >= this.bs[i9] && mouseEvent.getY() <= this.bs[i9] + this.by) {
                            C0032k.a("change equip = " + length3);
                            if (length3 < this.bz.size()) {
                                a(C0000a.a(((C0020av) this.bz.elementAt(length3)).a.a(), this.bA.d()));
                                if (this.at == 0) {
                                    this.at = (byte) 1;
                                }
                                this.ax = (byte) 1;
                                this.aB = (byte) 1;
                                this.aF = (byte) 1;
                                this.aJ = (byte) 1;
                                this.aN = (byte) 1;
                                this.aR = (byte) 1;
                                this.ab = false;
                                return;
                            }
                            return;
                        }
                        length3++;
                    }
                }
            }
        }
    }

    @Override // defpackage.AbstractC0026e
    public void b(MouseEvent mouseEvent) {
        int p;
        if (!this.cU) {
            h();
            Dimension e = e(mouseEvent.getX(), mouseEvent.getY());
            if (e == null) {
                this.cR = 0;
                this.cS = 0;
            } else {
                this.cR = this.B.a(e.width, e.height).h();
                this.cS = this.B.a(e.width, e.height).i();
            }
            if (this.aJ == 3 && e != null && this.cY[e.width][e.height] > 0) {
                int o = ((C0020av) this.bz.elementAt(this.y)).a().o();
                if (o > 0) {
                    c(e.width, e.height, o);
                    return;
                }
                return;
            } else if (this.aF == 3 && e != null && this.cY[e.width][e.height] > 0) {
                if (((int) ((aQ) this.bz.elementAt(this.y)).p()) > 0) {
                    c(e.width, e.height, p + 1);
                    return;
                }
                return;
            } else {
                if (this.aF == 2) {
                    int length = this.bh * this.br.length;
                    for (int i = 0; i < this.bs.length; i++) {
                        for (int i2 = 0; i2 < this.br.length; i2++) {
                            if (mouseEvent.getX() >= this.br[i2] && mouseEvent.getX() <= this.br[i2] + this.bx && mouseEvent.getY() >= this.bs[i] && mouseEvent.getY() <= this.bs[i] + this.by) {
                                if (length < this.bz.size()) {
                                    this.bl = this.br[i2];
                                    this.bm = this.bs[i];
                                    if (this.bl + this.bx + this.bp < 760) {
                                        a(((aQ) this.bz.elementAt(length)).s(), (byte) 1, this.bi.z);
                                        return;
                                    } else {
                                        a(((aQ) this.bz.elementAt(length)).s(), (byte) 0, this.bi.z);
                                        return;
                                    }
                                }
                                return;
                            }
                            length++;
                        }
                    }
                }
                if (this.aJ == 2) {
                    int length2 = this.bh * this.br.length;
                    for (int i3 = 0; i3 < this.bs.length; i3++) {
                        for (int i4 = 0; i4 < this.br.length; i4++) {
                            if (mouseEvent.getX() >= this.br[i4] && mouseEvent.getX() <= this.br[i4] + this.bx && mouseEvent.getY() >= this.bs[i3] && mouseEvent.getY() <= this.bs[i3] + this.by) {
                                if (length2 < this.bz.size()) {
                                    this.bl = this.br[i4];
                                    this.bm = this.bs[i3];
                                    if (i4 < this.br.length / 2) {
                                        a(((C0020av) this.bz.elementAt(length2)).f(), (byte) 1, this.bi.z);
                                        return;
                                    } else {
                                        a(((C0020av) this.bz.elementAt(length2)).f(), (byte) 0, this.bi.z);
                                        return;
                                    }
                                }
                                return;
                            }
                            length2++;
                        }
                    }
                }
                if (this.aN == 2) {
                    int length3 = this.bh * this.br.length;
                    for (int i5 = 0; i5 < this.bs.length; i5++) {
                        for (int i6 = 0; i6 < this.br.length; i6++) {
                            if (mouseEvent.getX() >= this.br[i6] && mouseEvent.getX() <= this.br[i6] + this.bx && mouseEvent.getY() >= this.bs[i5] && mouseEvent.getY() <= this.bs[i5] + this.by) {
                                if (length3 < this.bz.size()) {
                                    this.bl = this.br[i6];
                                    this.bm = this.bs[i5];
                                    if (i6 < this.br.length / 2) {
                                        a(((C0020av) this.bz.elementAt(length3)).f(), (byte) 1, this.bi.z);
                                        return;
                                    } else {
                                        a(((C0020av) this.bz.elementAt(length3)).f(), (byte) 0, this.bi.z);
                                        return;
                                    }
                                }
                                return;
                            }
                            length3++;
                        }
                    }
                    if (mouseEvent.getX() >= this.bB && mouseEvent.getX() <= this.bB + this.bx && mouseEvent.getY() >= this.bC && mouseEvent.getY() <= this.bC + this.by) {
                        this.bl = this.bB;
                        this.bm = this.bC;
                        if (this.bA != null) {
                            a(this.bA.f(), (byte) 1, this.bi.z);
                            return;
                        }
                        return;
                    }
                }
                a((String) null, (byte) 1, this.bi.z);
            }
        }
        this.R = -1;
        for (int i7 = 0; i7 < this.S.length; i7++) {
            if (mouseEvent.getX() >= this.S[i7] && mouseEvent.getX() <= this.S[i7] + this.U && mouseEvent.getY() >= this.T && mouseEvent.getY() <= this.T + this.V) {
                this.R = i7;
                return;
            }
        }
    }

    @Override // defpackage.AbstractC0026e
    public void c(MouseEvent mouseEvent) {
        if (this.ab && this.aN == 2) {
            int length = this.bh * this.br.length;
            for (int i = 0; i < this.bs.length; i++) {
                for (int i2 = 0; i2 < this.br.length; i2++) {
                    if (mouseEvent.getX() >= this.br[i2] && mouseEvent.getX() <= this.br[i2] + this.bx && mouseEvent.getY() >= this.bs[i] && mouseEvent.getY() <= this.bs[i] + this.by) {
                        if (length < this.bz.size()) {
                            this.bD = (C0020av) this.bz.elementAt(length);
                            this.bE = this.br[i2];
                            this.bF = this.bs[i];
                            this.bG = true;
                            a((String) null, (byte) 1, this.bi.z);
                            return;
                        }
                        return;
                    }
                    length++;
                }
            }
            if (mouseEvent.getX() >= this.bB && mouseEvent.getX() <= this.bB + this.bx && mouseEvent.getY() >= this.bC && mouseEvent.getY() <= this.bC + this.by) {
                this.bD = this.bA;
                this.bE = this.bB;
                this.bF = this.bC;
                this.bA = null;
                this.bG = false;
                a((String) null, (byte) 1, this.bi.z);
                return;
            }
        }
        if (mouseEvent.getX() != this.dm || mouseEvent.getY() != this.dn || this.f2do < System.currentTimeMillis()) {
            this.dm = mouseEvent.getX();
            this.dn = mouseEvent.getY();
            this.f2do = System.currentTimeMillis() + 300;
            C0032k.a("first click");
            return;
        }
        f(mouseEvent);
        C0032k.a("double click ");
        this.dm = 0;
        this.dn = 0;
        this.f2do = 0L;
    }

    @Override // defpackage.AbstractC0026e
    public void d(MouseEvent mouseEvent) {
        if (this.ab && this.aN == 2 && this.bD != null) {
            if (this.bG) {
                if (mouseEvent.getX() >= this.bB && mouseEvent.getX() <= this.bB + this.bx && mouseEvent.getY() >= this.bC && mouseEvent.getY() <= this.bC + this.by) {
                    a(C0000a.a(this.bD.a.a(), 3));
                    if (this.at == 0) {
                        this.at = (byte) 1;
                    }
                    this.ax = (byte) 1;
                    this.aB = (byte) 1;
                    this.aF = (byte) 1;
                    this.aJ = (byte) 1;
                    this.aN = (byte) 1;
                    this.aR = (byte) 1;
                    this.ab = false;
                }
            } else if (mouseEvent.getX() < this.br[0] || mouseEvent.getX() > this.br[2] + this.bx || mouseEvent.getY() < this.bs[0] || mouseEvent.getY() > this.bs[1] + this.by) {
                this.bA = this.bD;
            } else {
                a(C0000a.a(this.bD.a().a(), 0));
                if (this.at == 0) {
                    this.at = (byte) 1;
                }
                this.ax = (byte) 1;
                this.aB = (byte) 1;
                this.aF = (byte) 1;
                this.aJ = (byte) 1;
                this.aN = (byte) 1;
                this.aR = (byte) 1;
                this.ab = false;
            }
            this.bD = null;
        }
    }

    @Override // defpackage.AbstractC0026e
    public void e(MouseEvent mouseEvent) {
        if (this.bD != null) {
            this.bE = mouseEvent.getX() - 22;
            this.bF = mouseEvent.getY() - 22;
        }
    }

    private void a(String str, String str2, String str3) {
        D a = this.w.q.a(str2);
        C0020av c0020av = new C0020av();
        c0020av.a(a);
        c0020av.a(Integer.parseInt(str3));
        ((aH) this.cy.get(Long.valueOf(str))).c(c0020av);
    }

    @Override // defpackage.AbstractC0026e
    public void a(KeyEvent keyEvent) {
    }

    @Override // defpackage.AbstractC0026e
    public void b(KeyEvent keyEvent) {
    }

    @Override // defpackage.AbstractC0026e
    public void c(KeyEvent keyEvent) {
    }
}
