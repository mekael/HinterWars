

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/* renamed from: aX  reason: default package */
/* loaded from: hinterwars.jar:aX.class */
public class aX extends AbstractC0026e {
    private C0001aa g;
    private byte h;
    private Icon i;
    private Icon j;
    private int k;
    private int l;
    private Icon m;
    boolean a;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private Icon v;
    private int w;
    private int x;
    private int y;
    private int z;
    private Icon A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private Icon J;
    private int K;
    private int L;
    private String M;
    private int N;
    private int O;
    private Icon[] S;
    private int T;
    private int U;
    private String[] V;
    public Vector b;
    private int W;
    private int X;
    private int Y;
    private int Z;
    private int aa;
    private int ab;
    private int ac;
    private int[] ad;
    private int ae;
    private int af;
    private int ag;
    public Vector c;
    private int ah;
    private int ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private int[] ao;
    private int ap;
    private int aq;
    private int ar;
    private Vector as;
    private Vector at;
    private int ay;
    private int az;
    private int aA;
    private int aB;
    private int aC;
    private int aD;
    private Icon aE;
    private int aF;
    private Icon[] aG;
    private int aH;
    private int[] aI;
    private int aJ;
    private int aK;
    private int aL;
    private int aM;
    private int aN;
    private int aO;
    private int aP;
    private int aQ;
    private int aR;
    private int aS;
    private int aT;
    private int aU;
    private int aV;
    private int aW;
    private int aX;
    private Icon[] aY;
    private int bb;
    private int[] bc;
    private int bd;
    private int[] be;
    private int bf;
    private Vector[] bg;
    private Vector[] bh;
    private int bi;
    private int bj;
    private int bk;
    private int bl;
    private int bm;
    private int bn;
    private int bo;
    private int[] bp;
    private int bq;
    private int br;
    private int bs;
    private long bt;
    private C0009ai bu;
    private int bv;
    private int bw;
    private long bx;
    private int bz;
    private int bA;
    private int bB;
    private int bC;
    private Icon[] bD;
    private int bE;
    private int[] bF;
    private int[] bG;
    private GameStates bH;
    private byte bI;
    public static long d;
    public static String e;
    public static int f;
    private final byte P = 0;
    private final byte Q = 1;
    private final byte R = 2;
    private final byte au = -1;
    private final byte av = 0;
    private final byte aw = 1;
    private final byte ax = 2;
    private final byte aZ = 0;
    private final byte ba = 1;
    private final int by = 300;
    private final byte bJ = 0;
    private final byte bK = 1;
    private final byte bL = 2;
    private final byte bM = 3;
    private final byte bN = 4;

    public aX(GameStates gameStates) {
        this.bH = gameStates;
    }

    @Override // defpackage.AbstractC0026e
    public void a(C0001aa c0001aa, long j) {
        this.g = c0001aa;
        this.h = (byte) 18;
        GameStates gameStates = this.bH;
        switch (GameStates.W) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.i = new ImageIcon(getClass().getResource(c0001aa.f("en", 436)));
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                this.i = new ImageIcon(getClass().getResource(c0001aa.f("en", 1165)));
                break;
            case C0000a.aW /* 11 */:
            case C0000a.aX /* 12 */:
            case C0000a.aY /* 13 */:
            case C0000a.aZ /* 14 */:
            case 15:
                this.i = new ImageIcon(getClass().getResource(c0001aa.f("en", 1071)));
                break;
            case C0000a.bb /* 16 */:
            case C0000a.bc /* 17 */:
            case C0000a.bd /* 18 */:
            case C0000a.be /* 19 */:
                this.i = new ImageIcon(getClass().getResource(c0001aa.f("en", 1172)));
                break;
        }
        this.bD = new Icon[9];
        this.bD[0] = new ImageIcon(getClass().getResource(c0001aa.f("en", 1224)));
        this.bD[1] = new ImageIcon(getClass().getResource(c0001aa.f("en", 1225)));
        this.bD[2] = new ImageIcon(getClass().getResource(c0001aa.f("en", 1226)));
        this.bD[3] = new ImageIcon(getClass().getResource(c0001aa.f("en", 1227)));
        this.bD[4] = new ImageIcon(getClass().getResource(c0001aa.f("en", 1226)));
        this.bD[5] = new ImageIcon(getClass().getResource(c0001aa.f("en", 1228)));
        this.bD[6] = new ImageIcon(getClass().getResource(c0001aa.f("en", 1227)));
        this.bD[7] = new ImageIcon(getClass().getResource(c0001aa.f("en", 1225)));
        this.bD[8] = new ImageIcon(getClass().getResource(c0001aa.f("en", 1227)));
        this.j = new ImageIcon(getClass().getResource(c0001aa.f("en", 447)));
        this.k = c0001aa.d("en", 448);
        this.l = c0001aa.d("en", 449);
        this.m = new ImageIcon(getClass().getResource(c0001aa.f("en", 450)));
        this.a = false;
        this.n = c0001aa.d("en", 451);
        this.o = c0001aa.d("en", 452);
        this.p = c0001aa.d("en", 453);
        this.q = c0001aa.d("en", 454);
        this.r = this.n;
        this.s = this.p;
        this.t = c0001aa.d("en", 455);
        this.u = c0001aa.d("en", 456);
        this.v = new ImageIcon(getClass().getResource(c0001aa.f("en", 457)));
        this.w = c0001aa.d("en", 458);
        this.x = c0001aa.d("en", 459);
        this.y = c0001aa.d("en", 460);
        this.z = c0001aa.d("en", 461);
        this.A = new ImageIcon(getClass().getResource(c0001aa.f("en", 462)));
        this.B = c0001aa.d("en", 463);
        this.C = c0001aa.d("en", 464);
        this.D = c0001aa.d("en", 465);
        this.E = c0001aa.d("en", 466);
        this.F = this.B;
        this.G = this.D;
        this.H = c0001aa.d("en", 467);
        this.I = c0001aa.d("en", 468);
        this.J = new ImageIcon(getClass().getResource(c0001aa.f("en", 478)));
        this.K = c0001aa.d("en", 479);
        this.L = c0001aa.d("en", 480);
        this.M = "";
        this.N = c0001aa.d("en", 481);
        this.O = c0001aa.d("en", 482);
        this.S = new ImageIcon[4];
        this.S[0] = new ImageIcon(getClass().getResource(c0001aa.f("en", 483)));
        this.S[1] = new ImageIcon(getClass().getResource(c0001aa.f("en", 484)));
        this.S[2] = new ImageIcon(getClass().getResource(c0001aa.f("en", 485)));
        this.S[3] = new ImageIcon(getClass().getResource(c0001aa.f("en", 486)));
        this.T = c0001aa.d("en", 487);
        this.U = c0001aa.d("en", 488);
        this.V = this.bH.pP.a();
        this.b = new Vector();
        this.W = c0001aa.d("en", 489);
        this.X = c0001aa.d("en", 490);
        this.Y = c0001aa.d("en", 491);
        this.Z = c0001aa.d("en", 492);
        this.aa = c0001aa.d("en", 493);
        this.ab = -1;
        this.ac = c0001aa.d("en", 494);
        this.ad = c0001aa.e("en", 495);
        this.ae = c0001aa.d("en", 496);
        this.af = c0001aa.d("en", 497);
        this.ag = 0;
        this.c = new Vector();
        this.ah = c0001aa.d("en", 498);
        this.ai = c0001aa.d("en", 499);
        this.aj = c0001aa.d("en", 500);
        this.ak = c0001aa.d("en", 501);
        this.al = c0001aa.d("en", 502);
        this.am = 0;
        this.an = c0001aa.d("en", 503);
        this.ao = c0001aa.e("en", 504);
        this.ap = c0001aa.d("en", 505);
        this.aq = c0001aa.d("en", 506);
        this.ar = 0;
        this.as = new Vector();
        this.at = new Vector();
        this.ay = c0001aa.d("en", 507);
        this.az = c0001aa.d("en", 508);
        this.aA = c0001aa.d("en", 509);
        this.aB = c0001aa.d("en", 510);
        this.aC = c0001aa.d("en", 511);
        this.aD = 0;
        this.aE = new ImageIcon(getClass().getResource(c0001aa.f("en", 512)));
        this.aF = c0001aa.d("en", 513);
        this.aG = new Icon[3];
        this.aG[0] = new ImageIcon(getClass().getResource(c0001aa.f("en", 514)));
        this.aG[1] = new ImageIcon(getClass().getResource(c0001aa.f("en", 516)));
        this.aG[2] = new ImageIcon(getClass().getResource(c0001aa.f("en", 515)));
        this.aH = c0001aa.d("en", 517);
        this.aI = c0001aa.e("en", 518);
        this.aJ = c0001aa.d("en", 519);
        this.aK = c0001aa.d("en", 520);
        this.aL = 0;
        this.aM = c0001aa.d("en", 521);
        this.aN = c0001aa.d("en", 522);
        this.aO = c0001aa.d("en", 523);
        this.aP = c0001aa.d("en", 524);
        this.aQ = c0001aa.d("en", 525);
        this.aR = c0001aa.d("en", 526);
        this.aS = c0001aa.d("en", 527);
        this.aT = c0001aa.d("en", 528);
        this.aU = c0001aa.d("en", 529);
        this.aV = c0001aa.d("en", 530);
        this.aW = c0001aa.d("en", 531);
        this.aX = c0001aa.d("en", 532);
        this.aY = new Icon[2];
        this.aY[0] = new ImageIcon(getClass().getResource(c0001aa.f("en", 441)));
        this.aY[1] = new ImageIcon(getClass().getResource(c0001aa.f("en", 442)));
        this.bb = 0;
        this.bc = c0001aa.e("en", 443);
        this.bd = c0001aa.d("en", 444);
        this.be = c0001aa.e("en", 445);
        this.bf = c0001aa.d("en", 446);
        this.bg = new Vector[2];
        this.bg[0] = new Vector();
        this.bg[1] = new Vector();
        this.bh = new Vector[2];
        this.bh[0] = new Vector();
        this.bh[1] = new Vector();
        this.bi = c0001aa.d("en", 469);
        this.bj = c0001aa.d("en", 470);
        this.bk = c0001aa.d("en", 471);
        this.bl = c0001aa.d("en", 472);
        this.bm = c0001aa.d("en", 477);
        this.bn = 0;
        this.bo = c0001aa.d("en", 473);
        this.bp = c0001aa.e("en", 474);
        this.bq = c0001aa.d("en", 475);
        this.br = c0001aa.d("en", 476);
        this.bs = 0;
        this.bu = new C0009ai();
        this.bu.a(this.bi + 5, this.bj + (MastersOfDestiny.C.getHeight() / 2), this.bk, this.bm - this.bj, MastersOfDestiny.B, MastersOfDestiny.I);
        this.bz = c0001aa.d("en", 437);
        this.bA = c0001aa.d("en", 438);
        this.bB = c0001aa.d("en", 439);
        this.bC = c0001aa.d("en", 440);
        this.bF = new int[9];
        this.bG = new int[9];
        this.bF[0] = this.bz;
        this.bG[0] = this.bA;
        this.bF[1] = this.n;
        this.bG[1] = this.p;
        this.bF[2] = this.w;
        this.bG[2] = this.x;
        this.bF[3] = this.B;
        this.bG[3] = this.D;
        this.bF[4] = this.aM;
        this.bG[4] = this.aN;
        this.bF[5] = this.aQ;
        this.bG[5] = this.aR;
        this.bF[6] = this.aU;
        this.bG[6] = this.aV;
        this.bF[7] = this.o;
        this.bG[7] = this.q;
        this.bF[8] = this.C;
        this.bG[8] = this.E;
        this.bE = -1;
        this.bI = (byte) 0;
        a(C0022ax.e());
        a(C0022ax.i());
        a(C0022ax.h());
    }

    @Override // defpackage.AbstractC0026e
    public int b(C0001aa c0001aa, long j) {
        return this.h;
    }

    @Override // defpackage.AbstractC0026e
    public void a(byte b) {
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0576  */
    @Override // defpackage.AbstractC0026e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
        int i;
        int i2;
        this.i.paintIcon(mastersOfDestiny, graphics, 0, 0);
        this.aY[this.bb].paintIcon(mastersOfDestiny, graphics, this.bc[this.bb], this.bd);
        switch (this.bI) {
            case 0:
                this.j.paintIcon(mastersOfDestiny, graphics, this.k, this.l);
                graphics.setColor(new Color(8092539));
                graphics.setFont(MastersOfDestiny.z);
                graphics.drawString("Booking server...", this.r, this.s + this.u);
                break;
            case 1:
                this.j.paintIcon(mastersOfDestiny, graphics, this.k, this.l);
                graphics.setColor(new Color(15790320));
                graphics.fillRect(this.k + 2, this.l + 2, this.j.getIconWidth() - 4, this.j.getIconHeight() - 4);
                graphics.setColor(new Color(0));
                graphics.setFont(MastersOfDestiny.F);
                graphics.drawString("Sorry", (this.k + (this.j.getIconWidth() / 2)) - (graphics.getFontMetrics().stringWidth("Sorry") / 2), this.l + graphics.getFontMetrics().getHeight());
                graphics.setColor(new Color(8092539));
                graphics.setFont(MastersOfDestiny.B);
                graphics.drawString("There is no server available for mission", this.r, this.l + (graphics.getFontMetrics().getHeight() * 2));
                graphics.drawString("at the moment.", this.r, this.l + (graphics.getFontMetrics().getHeight() * 3));
                graphics.drawString("Please check back again", this.r, this.l + (graphics.getFontMetrics().getHeight() * 5));
                break;
            case 2:
                int i3 = this.bj;
                for (int i4 = this.bs; i4 < this.bg[this.bb].size(); i4++) {
                    if (this.bn == i4) {
                        graphics.setColor(new Color(6710886));
                        graphics.fillRect(this.bi, i3, this.bk, this.bl);
                    }
                    graphics.setColor(Color.WHITE);
                    graphics.setFont(MastersOfDestiny.B);
                    graphics.drawString((i4 + 1) + ". " + this.bg[this.bb].elementAt(i4).toString(), this.bi + MastersOfDestiny.C.getHeight(), i3 + MastersOfDestiny.C.getHeight());
                    i3 += this.bl;
                    if (i3 >= this.bm) {
                        this.j.paintIcon(mastersOfDestiny, graphics, this.k, this.l);
                        graphics.setColor(new Color(8092539));
                        graphics.setFont(MastersOfDestiny.z);
                        graphics.drawString("Double click on a misson to select.", this.r, this.s + this.u);
                        break;
                    }
                }
                this.j.paintIcon(mastersOfDestiny, graphics, this.k, this.l);
                graphics.setColor(new Color(8092539));
                graphics.setFont(MastersOfDestiny.z);
                graphics.drawString("Double click on a misson to select.", this.r, this.s + this.u);
            case 3:
                this.bu.a(graphics, mastersOfDestiny);
                this.j.paintIcon(mastersOfDestiny, graphics, this.k, this.l);
                this.m.paintIcon(mastersOfDestiny, graphics, this.r, this.s);
                this.v.paintIcon(mastersOfDestiny, graphics, this.w, this.x);
                this.A.paintIcon(mastersOfDestiny, graphics, this.F, this.G);
                break;
            case 4:
                this.bu.a(graphics, mastersOfDestiny);
                this.J.paintIcon(mastersOfDestiny, graphics, this.K, this.L);
                graphics.setColor(new Color(8092539));
                graphics.setFont(MastersOfDestiny.H);
                int i5 = this.X;
                for (int i6 = this.ag; i6 < this.b.size(); i6++) {
                    if (this.ab == i6) {
                        graphics.setColor(new Color(10461087));
                        graphics.fillRect(this.W, i5, this.Y, this.Z);
                    }
                    graphics.setColor(Color.BLACK);
                    String[] split = ((String) this.b.elementAt(i6)).split("\\|");
                    this.S[Integer.parseInt(split[0]) - 1].paintIcon(mastersOfDestiny, graphics, this.W + 1, i5 + ((this.Z - this.S[Integer.parseInt(split[0]) - 1].getIconHeight()) / 2));
                    graphics.setFont(MastersOfDestiny.ai);
                    graphics.drawString(split[1], this.W + 1 + this.T + ((this.U - graphics.getFontMetrics().stringWidth(split[1])) / 2), i5 + (4 * (this.Z / 5)));
                    graphics.setFont(MastersOfDestiny.B);
                    if (this.as.contains(this.b.elementAt(i6))) {
                        graphics.setFont(MastersOfDestiny.D);
                    }
                    graphics.drawString(split[2], this.W + 1 + this.S[Integer.parseInt(split[0]) - 1].getIconWidth() + 2, i5 + (4 * (this.Z / 5)));
                    i5 += this.Z;
                    if (i5 >= this.aa) {
                        int i7 = this.ai;
                        for (i = this.ar; i < this.c.size(); i++) {
                            if (this.am == i) {
                                graphics.setColor(new Color(10461087));
                                graphics.fillRect(this.ah, i7, this.aj, this.ak);
                            }
                            graphics.setColor(Color.BLACK);
                            String[] split2 = ((String) this.c.elementAt(i)).split("\\|");
                            this.S[Integer.parseInt(split2[0]) - 1].paintIcon(mastersOfDestiny, graphics, this.ah + 1, i7 + ((this.ak - this.S[Integer.parseInt(split2[0]) - 1].getIconHeight()) / 2));
                            graphics.setFont(MastersOfDestiny.ai);
                            graphics.drawString(split2[1], this.ah + 1 + this.T + ((this.U - graphics.getFontMetrics().stringWidth(split2[1])) / 2), i7 + (4 * (this.ak / 5)));
                            graphics.setFont(MastersOfDestiny.B);
                            if (this.as.contains(this.c.elementAt(i))) {
                                graphics.setFont(MastersOfDestiny.D);
                            }
                            graphics.drawString(split2[2], this.ah + 1 + this.S[Integer.parseInt(split2[0]) - 1].getIconWidth() + 2, i7 + (4 * (this.ak / 5)));
                            i7 += this.ak;
                            if (i7 >= this.al) {
                                int i8 = this.az;
                                for (i2 = this.aL; i2 < this.as.size(); i2++) {
                                    if (this.aD == i2) {
                                        graphics.setColor(new Color(10461087));
                                        graphics.fillRect(this.ay, i8, this.aA, this.aB);
                                    }
                                    graphics.setColor(Color.BLACK);
                                    String[] split3 = ((String) this.as.elementAt(i2)).split("\\|");
                                    this.S[Integer.parseInt(split3[0]) - 1].paintIcon(mastersOfDestiny, graphics, this.ay + 3, i8 + ((this.aB - this.S[Integer.parseInt(split3[0]) - 1].getIconHeight()) / 2));
                                    graphics.setFont(MastersOfDestiny.ai);
                                    graphics.drawString(split3[1], this.ay + 3 + this.T + ((this.U - graphics.getFontMetrics().stringWidth(split3[1])) / 2), i8 + (4 * (this.aB / 5)));
                                    graphics.setFont(MastersOfDestiny.B);
                                    graphics.drawString(split3[2], this.ay + 3 + this.S[Integer.parseInt(split3[0]) - 1].getIconWidth() + 2, i8 + (4 * (this.aB / 5)));
                                    this.aE.paintIcon(mastersOfDestiny, graphics, this.aF, i8 + ((this.aB - this.aE.getIconHeight()) / 2));
                                    byte byteValue = ((Byte) this.at.elementAt(i2)).byteValue();
                                    if (byteValue != -1) {
                                        this.aG[byteValue].paintIcon(mastersOfDestiny, graphics, this.aF + ((this.aE.getIconWidth() - this.aG[byteValue].getIconWidth()) / 2), i8 + ((this.aB - this.aG[byteValue].getIconHeight()) / 2));
                                    }
                                    i8 += this.aB;
                                    if (i8 >= this.aC) {
                                        break;
                                    }
                                }
                                break;
                            }
                        }
                        int i82 = this.az;
                        while (i2 < this.as.size()) {
                        }
                    }
                }
                int i72 = this.ai;
                while (i < this.c.size()) {
                }
                int i822 = this.az;
                while (i2 < this.as.size()) {
                }
        }
        if (this.bE != -1) {
            this.bD[this.bE].paintIcon(mastersOfDestiny, graphics, this.bF[this.bE], this.bG[this.bE]);
        }
    }

    @Override // defpackage.AbstractC0026e
    public void a(int i, Object obj) {
    }

    @Override // defpackage.AbstractC0026e
    public void a(String[] strArr) {
        switch (C0022ax.a(strArr)) {
            case C0000a.aS /* -1 */:
                a(C0000a.a(Long.toString(C0001aa.c), this.g.d));
                return;
            case 0:
            case 6:
            case 7:
            case 8:
            default:
                return;
            case 1:
                this.bg[1].add(a(Long.parseLong(strArr[1])));
                this.bh[1].add(Long.valueOf(strArr[1]));
                C0032k.a("added quest " + Long.valueOf(strArr[1]));
                return;
            case 2:
                this.bg[0].add(c(Long.parseLong(strArr[1])));
                this.bh[0].add(Long.valueOf(strArr[1]));
                return;
            case 3:
                C0032k.a("avail players: " + strArr[1]);
                int parseInt = Integer.parseInt(strArr[2]);
                int parseInt2 = Integer.parseInt(strArr[3]);
                this.V = this.bH.pP.a();
                for (int i = 0; i < this.V.length; i++) {
                    C0032k.a("buddies " + i + " : " + this.V[i]);
                    if (this.V[i].equalsIgnoreCase(strArr[1])) {
                        this.b.add(parseInt + C0000a.v + parseInt2 + C0000a.v + this.V[i]);
                        return;
                    }
                }
                this.c.add(parseInt + C0000a.v + parseInt2 + C0000a.v + strArr[1]);
                return;
            case 4:
                d = Long.parseLong(strArr[1]);
                e = strArr[2];
                f = Integer.parseInt(strArr[3]);
                this.bI = (byte) 2;
                return;
            case 5:
                if (this.bg != null) {
                    for (int i2 = 0; i2 < this.bg.length; i2++) {
                        this.bg[i2].clear();
                    }
                }
                this.bI = (byte) 1;
                return;
            case 9:
                if (strArr[4].equalsIgnoreCase("Y")) {
                    C0032k.a("ok.." + strArr[1] + " accepted");
                    Enumeration elements = this.as.elements();
                    int i3 = 0;
                    while (elements.hasMoreElements() && !((String) elements.nextElement()).endsWith(strArr[1])) {
                        i3++;
                    }
                    this.at.removeElementAt(i3);
                    this.at.insertElementAt((byte) 0, i3);
                    return;
                } else if (strArr[4].equalsIgnoreCase("N")) {
                    C0032k.a("ok.." + strArr[1] + " declined");
                    Enumeration elements2 = this.as.elements();
                    int i4 = 0;
                    while (elements2.hasMoreElements() && !((String) elements2.nextElement()).endsWith(strArr[1])) {
                        i4++;
                    }
                    this.at.removeElementAt(i4);
                    this.at.insertElementAt((byte) 1, i4);
                    return;
                } else {
                    return;
                }
            case 10:
                C0032k.a("ok.." + strArr[1] + " declined");
                Enumeration elements3 = this.as.elements();
                int i5 = 0;
                while (elements3.hasMoreElements() && !((String) elements3.nextElement()).endsWith(strArr[1])) {
                    i5++;
                }
                C0032k.a("hq test: index=" + i5);
                this.at.removeElementAt(i5);
                this.at.insertElementAt((byte) 1, i5);
                return;
        }
    }

    public void a(String str) {
        this.bH.U.write(str);
        this.bH.U.flush();
        C0032k.a("sent: " + str);
    }

    @Override // defpackage.AbstractC0026e
    public void a() {
    }

    private String a(long j) {
        return this.g.s.a(j).b();
    }

    private void b(long j) {
        this.bt = j;
        this.bu.b();
        for (String str : this.g.s.a(j).d()) {
            this.bu.a(str, 14274510, 16777215);
        }
        this.bu.a((byte) 2);
    }

    private String c(long j) {
        return this.g.t.a(j).b();
    }

    private void d(long j) {
        this.bt = j;
        this.bu.b();
        for (String str : this.g.t.a(j).d()) {
            this.bu.a(str, 14274510, 16777215);
        }
        this.bu.a((byte) 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:234:0x0773, code lost:
        if (r0 == 0) goto L285;
     */
    @Override // defpackage.AbstractC0026e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(MouseEvent mouseEvent) {
        if (this.bI != 3 && this.bI != 4) {
            for (int i = 0; i < this.aY.length; i++) {
                if (mouseEvent.getX() >= this.bc[i] && mouseEvent.getX() <= this.bc[i] + this.be[i] && mouseEvent.getY() >= this.bd && mouseEvent.getY() <= this.bd + this.bf) {
                    this.bb = i;
                    this.bn = 0;
                    this.bs = 0;
                    return;
                }
            }
        }
        if (this.bI == 2) {
            for (int i2 = 0; i2 <= (this.bm - this.bj) / this.bl; i2++) {
                if (mouseEvent.getX() >= this.bi && mouseEvent.getX() <= this.bi + this.bk && mouseEvent.getY() >= this.bj + (this.bl * i2) && mouseEvent.getY() <= this.bj + (this.bl * i2) + this.bl && this.bn != i2 + this.bs) {
                    this.bn = i2 + this.bs;
                    return;
                }
            }
        }
        for (int i3 = 0; i3 < this.bp.length; i3++) {
            if (mouseEvent.getX() >= this.bo && mouseEvent.getX() <= this.bo + this.bq && mouseEvent.getY() >= this.bp[i3] && mouseEvent.getY() <= this.bp[i3] + this.br) {
                if (this.bI == 2) {
                    switch (i3) {
                        case 0:
                            if (this.bs > 0) {
                                this.bs--;
                                return;
                            }
                            return;
                        case 1:
                            if (this.bg[this.bb].size() - this.bs > ((this.bm - this.bj) / this.bl) + 1) {
                                this.bs++;
                                return;
                            }
                            return;
                    }
                } else if (this.bI == 3) {
                    switch (i3) {
                        case 0:
                            this.bu.a((byte) 0);
                            return;
                        case 1:
                            this.bu.a((byte) 1);
                            return;
                    }
                } else {
                    continue;
                }
            }
        }
        if (this.bI == 4) {
            int i4 = this.X;
            int i5 = this.ag;
            while (true) {
                if (i5 < this.b.size()) {
                    if (mouseEvent.getX() <= this.W || mouseEvent.getX() >= this.W + this.Y || mouseEvent.getY() <= i4 || mouseEvent.getY() >= i4 + this.Z) {
                        i4 += this.Z;
                        if (i4 < this.aa) {
                            i5++;
                        }
                    } else {
                        this.ab = i5;
                        this.am = -1;
                    }
                }
            }
            for (int i6 = 0; i6 < this.ad.length; i6++) {
                if (mouseEvent.getX() > this.ac && mouseEvent.getX() < this.ac + this.ae && mouseEvent.getY() > this.ad[i6] && mouseEvent.getY() < this.ad[i6] + this.af) {
                    switch (i6) {
                        case 0:
                            if (this.ag > 0) {
                                this.ag--;
                                break;
                            } else {
                                continue;
                            }
                        case 1:
                            if (this.b.size() - this.ag <= ((this.aa - this.X) / this.Z) + 1) {
                                break;
                            } else {
                                this.ag++;
                                continue;
                            }
                    }
                }
            }
            int i7 = this.ai;
            int i8 = this.ar;
            while (true) {
                if (i8 < this.c.size()) {
                    if (mouseEvent.getX() <= this.ah || mouseEvent.getX() >= this.ah + this.aj || mouseEvent.getY() <= i7 || mouseEvent.getY() >= i7 + this.ak) {
                        i7 += this.ak;
                        if (i7 < this.al) {
                            i8++;
                        }
                    } else {
                        this.am = i8;
                        this.ab = -1;
                    }
                }
            }
            for (int i9 = 0; i9 < this.ao.length; i9++) {
                if (mouseEvent.getX() > this.an && mouseEvent.getX() < this.an + this.ap && mouseEvent.getY() > this.ao[i9] && mouseEvent.getY() < this.ao[i9] + this.aq) {
                    switch (i9) {
                        case 0:
                            if (this.ar > 0) {
                                this.ar--;
                                break;
                            } else {
                                continue;
                            }
                        case 1:
                            if (this.c.size() - this.ar <= ((this.al - this.ai) / this.ak) + 1) {
                                break;
                            } else {
                                this.ar++;
                                continue;
                            }
                    }
                }
            }
            int i10 = this.az;
            int i11 = this.aL;
            while (true) {
                if (i11 < this.as.size()) {
                    if (mouseEvent.getX() <= this.ay || mouseEvent.getX() >= this.ay + this.aA || mouseEvent.getY() <= i10 || mouseEvent.getY() >= i10 + this.aB) {
                        i10 += this.aB;
                        if (i10 < this.aC) {
                            i11++;
                        }
                    } else {
                        this.aD = i11;
                        C0032k.a("selectedPartySelection = " + this.aD);
                    }
                }
            }
            for (int i12 = 0; i12 < this.aI.length; i12++) {
                if (mouseEvent.getX() > this.aH && mouseEvent.getX() < this.aH + this.aJ && mouseEvent.getY() > this.aI[i12] && mouseEvent.getY() < this.aI[i12] + this.aK) {
                    switch (i12) {
                        case 0:
                            if (this.aL > 0) {
                                this.aL--;
                                break;
                            } else {
                                continue;
                            }
                        case 1:
                            if (this.as.size() - this.aL <= ((this.aC - this.az) / this.aB) + 1) {
                                break;
                            } else {
                                this.aL++;
                                continue;
                            }
                    }
                }
            }
            if (mouseEvent.getX() > this.aM && mouseEvent.getX() < this.aM + this.aO && mouseEvent.getY() > this.aN && mouseEvent.getY() < this.aN + this.aP) {
                if (this.am >= 0) {
                    if (this.as.contains((String) this.c.elementAt(this.am))) {
                        return;
                    }
                    String[] split = ((String) this.c.elementAt(this.am)).split("\\|");
                    switch (this.bb) {
                        case 0:
                            a(C0022ax.a(split[2], "A", this.bt));
                            break;
                        case 1:
                            a(C0022ax.a(split[2], "M", this.bt));
                            break;
                    }
                    this.as.add((String) this.c.elementAt(this.am));
                    this.at.add((byte) -1);
                    return;
                } else if (this.ab >= 0) {
                    if (this.as.contains((String) this.b.elementAt(this.ab))) {
                        return;
                    }
                    String[] split2 = ((String) this.b.elementAt(this.ab)).split("\\|");
                    switch (this.bb) {
                        case 0:
                            a(C0022ax.a(split2[2], "A", this.bt));
                            break;
                        case 1:
                            a(C0022ax.a(split2[2], "M", this.bt));
                            break;
                    }
                    this.as.add((String) this.b.elementAt(this.ab));
                    this.at.add((byte) -1);
                    return;
                }
            }
            if (mouseEvent.getX() > this.aQ && mouseEvent.getX() < this.aQ + this.aS && mouseEvent.getY() > this.aR && mouseEvent.getY() < this.aR + this.aT) {
                this.c.clear();
                this.b.clear();
                a(C0022ax.j());
            }
            if (mouseEvent.getX() > this.aU && mouseEvent.getX() < this.aU + this.aW && mouseEvent.getY() > this.aV && mouseEvent.getY() < this.aV + this.aX) {
                C0032k.a("sorry no remove protocol yet");
                int i13 = this.az;
                for (int i14 = this.aL; i14 < this.as.size(); i14++) {
                    if (this.aD == i14) {
                        byte byteValue = ((Byte) this.at.elementAt(i14)).byteValue();
                        getClass();
                        if (byteValue != -1) {
                            byte byteValue2 = ((Byte) this.at.elementAt(i14)).byteValue();
                            getClass();
                        }
                        String[] split3 = ((String) this.as.elementAt(i14)).split("\\|");
                        switch (this.bb) {
                            case 0:
                                a(C0022ax.e(split3[2], "M", this.bt));
                                break;
                            case 1:
                                a(C0022ax.e(split3[2], "A", this.bt));
                                break;
                        }
                        this.as.removeElementAt(i14);
                        this.at.removeElementAt(i14);
                    }
                    i13 += this.aB;
                    if (i13 < this.aC) {
                    }
                }
            }
        }
        if (!this.a && mouseEvent.getX() >= this.r && mouseEvent.getX() <= this.r + this.t && mouseEvent.getY() >= this.s && mouseEvent.getY() <= this.s + this.u) {
            switch (this.bI) {
                case 3:
                    switch (this.bb) {
                        case 0:
                            a(C0022ax.b(d, this.bt));
                            break;
                        case 1:
                            a(C0022ax.a(d, this.bt));
                            break;
                    }
                    a(C0022ax.a(d));
                    this.a = true;
                    break;
                case 4:
                    switch (this.bb) {
                        case 0:
                            a(C0022ax.b(d, this.bt));
                            break;
                        case 1:
                            a(C0022ax.a(d, this.bt));
                            break;
                    }
                    a(C0022ax.a(d));
                    this.a = true;
                    break;
            }
        }
        if (mouseEvent.getX() >= this.w && mouseEvent.getX() <= this.w + this.y && mouseEvent.getY() >= this.x && mouseEvent.getY() <= this.x + this.z) {
            switch (this.bI) {
                case 3:
                    this.bI = (byte) 4;
                    this.bE = -1;
                    this.r = this.o;
                    this.s = this.q;
                    this.F = this.C;
                    this.G = this.E;
                    this.M = "Requesting available players..";
                    this.c.clear();
                    this.b.clear();
                    this.as.clear();
                    a(C0022ax.j());
                    break;
            }
        }
        if (mouseEvent.getX() >= this.F && mouseEvent.getX() <= this.F + this.H && mouseEvent.getY() >= this.G && mouseEvent.getY() <= this.G + this.I) {
            this.bE = -1;
            switch (this.bI) {
                case 3:
                    this.bI = (byte) 2;
                    break;
                case 4:
                    this.as.removeAllElements();
                    this.at.removeAllElements();
                    a(C0022ax.c(d));
                    this.bI = (byte) 3;
                    this.r = this.n;
                    this.s = this.p;
                    this.F = this.B;
                    this.G = this.D;
                    break;
            }
        }
        if (mouseEvent.getX() > this.bz && mouseEvent.getX() < this.bz + this.bB && mouseEvent.getY() > this.bA && mouseEvent.getY() < this.bA + this.bC) {
            if (this.bI > 1) {
                a(C0022ax.b(d));
            }
            this.bE = -1;
            this.h = (byte) 5;
        } else if (mouseEvent.getX() == this.bv && mouseEvent.getY() == this.bw && this.bx >= System.currentTimeMillis()) {
            f(mouseEvent);
            this.bv = 0;
            this.bw = 0;
            this.bx = 0L;
        } else {
            this.bv = mouseEvent.getX();
            this.bw = mouseEvent.getY();
            this.bx = System.currentTimeMillis() + 300;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void f(MouseEvent mouseEvent) {
        int i;
        if (this.bI == 2) {
            for (int i2 = 0; i2 <= (this.bm - this.bj) / this.bl; i2++) {
                if (mouseEvent.getX() >= this.bi && mouseEvent.getX() <= this.bi + this.bk && mouseEvent.getY() >= this.bj + (this.bl * i2) && mouseEvent.getY() <= this.bj + (this.bl * i2) + this.bl) {
                    switch (this.bb) {
                        case 0:
                            d(((Long) this.bh[this.bb].elementAt(i2)).longValue());
                            this.bI = (byte) 3;
                            return;
                        case 1:
                            b(((Long) this.bh[this.bb].elementAt(i2)).longValue());
                            this.bI = (byte) 3;
                            return;
                    }
                }
            }
        }
        if (this.bI == 4) {
            int i3 = this.X;
            for (int i4 = this.ag; i4 < this.b.size(); i4++) {
                if (mouseEvent.getX() > this.W && mouseEvent.getX() < this.W + this.Y && mouseEvent.getY() > i3 && mouseEvent.getY() < i3 + this.Z) {
                    C0032k.a("invite players double click");
                    if (this.as.contains((String) this.b.elementAt(i4)) || this.as.size() >= 4) {
                        return;
                    }
                    String[] split = ((String) this.b.elementAt(i4)).split("\\|");
                    switch (this.bb) {
                        case 0:
                            a(C0022ax.a(split[2], "A", this.bt));
                            break;
                        case 1:
                            a(C0022ax.a(split[2], "M", this.bt));
                            break;
                    }
                    this.as.add((String) this.b.elementAt(i4));
                    this.at.add((byte) -1);
                    return;
                }
                i3 += this.Z;
                if (i3 >= this.aa) {
                    int i5 = this.ai;
                    for (i = this.ar; i < this.c.size(); i++) {
                        if (mouseEvent.getX() > this.ah && mouseEvent.getX() < this.ah + this.aj && mouseEvent.getY() > i5 && mouseEvent.getY() < i5 + this.ak) {
                            C0032k.a("avail players double click");
                            String[] split2 = ((String) this.c.elementAt(i)).split("\\|");
                            switch (this.bb) {
                                case 0:
                                    a(C0022ax.a(split2[2], "A", this.bt));
                                    break;
                                case 1:
                                    a(C0022ax.a(split2[2], "M", this.bt));
                                    break;
                            }
                            this.as.add((String) this.c.elementAt(i));
                            this.at.add((byte) -1);
                            return;
                        }
                        i5 += this.ak;
                        if (i5 >= this.al) {
                            return;
                        }
                    }
                }
            }
            int i52 = this.ai;
            while (i < this.c.size()) {
            }
        }
    }

    @Override // defpackage.AbstractC0026e
    public void b(MouseEvent mouseEvent) {
        this.bE = -1;
        if (mouseEvent.getX() > this.bz && mouseEvent.getX() < this.bz + this.bB && mouseEvent.getY() > this.bA && mouseEvent.getY() < this.bA + this.bC) {
            this.bE = 0;
            return;
        }
        if (this.bI == 3) {
            if (!this.a && mouseEvent.getX() >= this.bF[1] && mouseEvent.getX() <= this.bF[1] + this.t && mouseEvent.getY() >= this.bG[1] && mouseEvent.getY() <= this.bG[1] + this.u) {
                this.bE = 1;
                return;
            } else if (mouseEvent.getX() >= this.bF[2] && mouseEvent.getX() <= this.bF[2] + this.y && mouseEvent.getY() >= this.bG[2] && mouseEvent.getY() <= this.bG[2] + this.z) {
                this.bE = 2;
                return;
            } else if (mouseEvent.getX() >= this.bF[3] && mouseEvent.getX() <= this.bF[3] + this.H && mouseEvent.getY() >= this.bG[3] && mouseEvent.getY() <= this.bG[3] + this.I) {
                this.bE = 3;
                return;
            }
        }
        if (this.bI == 4) {
            if (!this.a && mouseEvent.getX() >= this.bF[7] && mouseEvent.getX() <= this.bF[7] + this.t && mouseEvent.getY() >= this.bG[7] && mouseEvent.getY() <= this.bG[7] + this.u) {
                this.bE = 7;
            } else if (mouseEvent.getX() >= this.bF[4] && mouseEvent.getX() <= this.bF[4] + this.y && mouseEvent.getY() >= this.bG[4] && mouseEvent.getY() <= this.bG[4] + this.z) {
                this.bE = 4;
            } else if (mouseEvent.getX() >= this.bF[8] && mouseEvent.getX() <= this.bF[8] + this.H && mouseEvent.getY() >= this.bG[8] && mouseEvent.getY() <= this.bG[8] + this.I) {
                this.bE = 8;
            } else if (mouseEvent.getX() > this.aQ && mouseEvent.getX() < this.aQ + this.aS && mouseEvent.getY() > this.aR && mouseEvent.getY() < this.aR + this.aT) {
                this.bE = 5;
            } else if (mouseEvent.getX() <= this.aU || mouseEvent.getX() >= this.aU + this.aW || mouseEvent.getY() <= this.aV || mouseEvent.getY() >= this.aV + this.aX) {
            } else {
                this.bE = 6;
            }
        }
    }

    @Override // defpackage.AbstractC0026e
    public void c(MouseEvent mouseEvent) {
    }

    @Override // defpackage.AbstractC0026e
    public void d(MouseEvent mouseEvent) {
    }

    @Override // defpackage.AbstractC0026e
    public void e(MouseEvent mouseEvent) {
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
