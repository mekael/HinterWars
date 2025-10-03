

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/* renamed from: c  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:c.class */
public class C0024c extends AbstractC0026e {
    private C0001aa b;
    private Icon c;
    private int e;
    private Icon l;
    private int m;
    private int n;
    private Icon o;
    private String p;
    private String q;
    private int r;
    private int s;
    private Icon[] t;
    private int u;
    private int[] w;
    private int x;
    private int[] y;
    private int z;
    private Vector A;
    private String B;
    private String C;
    private String D;
    private long E;
    private int[] F;
    private int[] G;
    private int H;
    private int I;
    private C0011ak J;
    private int K;
    private int L;
    private int M;
    private int N;
    private Icon O;
    private int P;
    private int Q;
    private Vector R;
    private Icon S;
    private int T;
    private int U;
    private int V;
    private Icon W;
    private int X;
    private int Y;
    private long Z;
    private long aa;
    private C0009ai ab;
    private int ac;
    private int[] ad;
    private int ae;
    private int af;
    private Icon ag;
    private int ah;
    private int ai;
    private Icon aj;
    private int ak;
    private int al;
    private Icon am;
    private int an;
    private int ao;
    private Icon ap;
    private int aq;
    private int ar;
    private Icon as;
    private int at;
    private int au;
    private int av;
    private int aw;
    private int[] ax;
    private int aA;
    private int aB;
    private Icon aC;
    private Icon aD;
    private int aE;
    private Icon[] aF;
    private int aG;
    private int aH;
    private int aI;
    private int aJ;
    private int aK;
    private int aL;
    private int aM;
    private int aN;
    private int aO;
    private long aP;
    GameStates a;
    private final byte f = 0;
    private final byte g = 1;
    private final byte h = 2;
    private final byte i = 3;
    private final byte j = 4;
    private final byte k = 5;
    private final byte v = 0;
    private final byte ay = 0;
    private final byte az = 1;
    private final int aQ = 300;
    private byte d = 0;

    public C0024c(GameStates gameStates) {
        this.a = gameStates;
    }

    @Override // defpackage.AbstractC0026e
    public void a(C0001aa c0001aa, long j) {
        C0032k.a("CafeState(enterState): Initiating initial cafe settings.");
        this.b = c0001aa;
        this.d = (byte) 17;
        GameStates gameStates = this.a;
        switch (GameStates.W) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                C0032k.a("CafeState(enterState): Human Colony Cafe detected, setting cafe host and background");
                this.c = new ImageIcon(getClass().getResource(c0001aa.f("en", 647)));
                this.l = new ImageIcon(getClass().getResource(c0001aa.f("en", 655)));
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                C0032k.a("CafeState(enterState): Firan Colony Cafe detected, setting cafe host and background");
                this.c = new ImageIcon(getClass().getResource(c0001aa.f("en", 1168)));
                this.l = new ImageIcon(getClass().getResource(c0001aa.f("en", 1169)));
                break;
            case C0000a.aW /* 11 */:
            case C0000a.aX /* 12 */:
            case C0000a.aY /* 13 */:
            case C0000a.aZ /* 14 */:
            case 15:
                C0032k.a("CafeState(enterState): Taikuus Colony Cafe detected, setting cafe host and background");
                this.c = new ImageIcon(getClass().getResource(c0001aa.f("en", 1074)));
                this.l = new ImageIcon(getClass().getResource(c0001aa.f("en", 1075)));
                break;
            case C0000a.bb /* 16 */:
            case C0000a.bc /* 17 */:
            case C0000a.bd /* 18 */:
            case C0000a.be /* 19 */:
                C0032k.a("CafeState(enterState): Brucian Colony Cafe detected, setting cafe host and background");
                this.c = new ImageIcon(getClass().getResource(c0001aa.f("en", 1175)));
                this.l = new ImageIcon(getClass().getResource(c0001aa.f("en", 1176)));
                break;
        }
        this.m = c0001aa.d("en", 656);
        this.n = c0001aa.d("en", 657);
        this.e = 0;
        this.aF = new Icon[4];
        this.aF[0] = new ImageIcon(getClass().getResource(c0001aa.f("en", 1224)));
        this.aF[1] = new ImageIcon(getClass().getResource(c0001aa.f("en", 1231)));
        this.aF[2] = new ImageIcon(getClass().getResource(c0001aa.f("en", 1232)));
        this.aF[3] = new ImageIcon(getClass().getResource(c0001aa.f("en", 1233)));
        this.aG = 0;
        this.aH = 0;
        this.aI = -1;
        this.o = new ImageIcon(getClass().getResource(c0001aa.f("en", 658)));
        this.p = "";
        this.q = "";
        C0032k.a("str is empty");
        this.r = c0001aa.d("en", 659);
        this.s = c0001aa.d("en", 660);
        this.t = new Icon[1];
        this.t[0] = new ImageIcon(getClass().getResource(c0001aa.f("en", 648)));
        this.u = 0;
        this.w = c0001aa.e("en", 651);
        this.x = c0001aa.d("en", 652);
        this.y = c0001aa.e("en", 653);
        this.z = c0001aa.d("en", 654);
        this.F = new int[2];
        this.F[0] = 99;
        this.F[1] = 250;
        this.G = new int[2];
        this.G[0] = 140;
        this.G[1] = 325;
        this.H = 137;
        this.I = 166;
        this.A = new Vector();
        this.B = c0001aa.f("en", 661);
        this.C = c0001aa.g("en", 662);
        this.D = c0001aa.g("en", 663);
        this.J = new C0011ak();
        this.J.a((byte) -1);
        this.K = 452;
        this.L = 259;
        this.M = 241;
        this.N = 10;
        this.O = new ImageIcon(getClass().getResource(c0001aa.f("en", 670)));
        this.P = c0001aa.d("en", 671);
        this.Q = c0001aa.d("en", 672);
        this.R = new Vector();
        this.S = new ImageIcon(getClass().getResource(c0001aa.f("en", 673)));
        this.V = this.S.getIconHeight() + 3;
        this.W = new ImageIcon(getClass().getResource(c0001aa.f("en", 674)));
        this.X = c0001aa.d("en", 675);
        this.Y = c0001aa.d("en", 676);
        this.ab = new C0009ai();
        this.ab.a(c0001aa.d("en", 677), c0001aa.d("en", 678), c0001aa.d("en", 679), c0001aa.d("en", 680), MastersOfDestiny.B, MastersOfDestiny.C);
        this.ac = c0001aa.d("en", 681);
        this.ad = c0001aa.e("en", 682);
        this.ae = c0001aa.d("en", 683);
        this.af = c0001aa.d("en", 684);
        this.ag = new ImageIcon(getClass().getResource(c0001aa.f("en", 688)));
        this.ah = c0001aa.d("en", 689);
        this.ai = c0001aa.d("en", 690);
        this.aj = new ImageIcon(getClass().getResource(c0001aa.f("en", 691)));
        this.ak = c0001aa.d("en", 692);
        this.al = c0001aa.d("en", 693);
        this.am = new ImageIcon(getClass().getResource(c0001aa.f("en", 685)));
        this.an = c0001aa.d("en", 686);
        this.ao = c0001aa.d("en", 687);
        this.ap = new ImageIcon(getClass().getResource(c0001aa.f("en", 694)));
        this.aq = c0001aa.d("en", 695);
        this.ar = c0001aa.d("en", 696);
        this.as = new ImageIcon(getClass().getResource(c0001aa.f("en", 668)));
        this.at = this.F[0] - 2;
        this.au = this.G[0] - 2;
        this.av = 0;
        this.aw = c0001aa.d("en", 664);
        this.ax = c0001aa.e("en", 665);
        this.aA = c0001aa.d("en", 666);
        this.aB = c0001aa.d("en", 667);
        this.aC = new ImageIcon(getClass().getResource(c0001aa.f("en", 1365)));
        this.aD = new ImageIcon(getClass().getResource(c0001aa.f("en", 1366)));
        this.aE = 0;
        this.aJ = c0001aa.d("en", 1234);
        this.aK = c0001aa.d("en", 438);
        this.aL = c0001aa.d("en", 439);
        this.aM = c0001aa.d("en", 440);
        a(P.e());
        C0032k.a(P.e());
    }

    @Override // defpackage.AbstractC0026e
    public int b(C0001aa c0001aa, long j) {
        return this.d;
    }

    @Override // defpackage.AbstractC0026e
    public void a(byte b) {
        this.d = b;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0ac1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0b41  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0818  */
    @Override // defpackage.AbstractC0026e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
        this.c.paintIcon(mastersOfDestiny, graphics, 0, 0);
        this.t[this.u].paintIcon(mastersOfDestiny, graphics, this.w[this.u], this.x);
        switch (this.u) {
            case 0:
                switch (this.e) {
                    case 0:
                        this.l.paintIcon(mastersOfDestiny, graphics, this.m, this.n);
                        this.o.paintIcon(mastersOfDestiny, graphics, this.r, this.s);
                        graphics.setColor(new Color(5066061));
                        graphics.setFont(MastersOfDestiny.H);
                        graphics.drawString(this.p, this.r + 20, this.s + (MastersOfDestiny.I.getHeight() / 2) + MastersOfDestiny.I.getHeight());
                        graphics.drawString(this.q, this.r + 20, this.s + (MastersOfDestiny.I.getHeight() / 2) + (MastersOfDestiny.I.getHeight() * 2));
                        if (this.A.size() > 0) {
                            graphics.setColor(Color.WHITE);
                            graphics.setFont(MastersOfDestiny.D);
                            int length = this.av * this.F.length;
                            for (int i = 0; i < this.G.length; i++) {
                                for (int i2 = 0; i2 < this.F.length; i2++) {
                                    if (length < this.A.size()) {
                                        ((am) this.A.elementAt(length)).e().paintIcon(mastersOfDestiny, graphics, this.F[i2], this.G[i]);
                                        graphics.drawString(((am) this.A.elementAt(length)).b(), (this.F[i2] + ((am) this.A.elementAt(length)).c()) - (MastersOfDestiny.E.stringWidth(((am) this.A.elementAt(length)).b()) / 2), this.G[i] + ((am) this.A.elementAt(length)).d());
                                        length++;
                                    }
                                }
                            }
                            this.as.paintIcon(mastersOfDestiny, graphics, this.at, this.au);
                            break;
                        }
                        break;
                    case 1:
                        am amVar = null;
                        Enumeration elements = this.A.elements();
                        while (elements.hasMoreElements()) {
                            amVar = (am) elements.nextElement();
                            if (amVar.a() == this.E) {
                                if (amVar != null) {
                                    amVar.f().paintIcon(mastersOfDestiny, graphics, this.m, this.n);
                                    this.O.paintIcon(mastersOfDestiny, graphics, this.P, this.Q);
                                    int iconHeight = this.R.size() <= 4 ? this.Q + ((this.O.getIconHeight() - ((this.J.o - graphics.getFontMetrics().getHeight()) + (this.R.size() * (this.S.getIconHeight() + 3)))) / 2) : this.Q + ((this.O.getIconHeight() - ((this.J.o - graphics.getFontMetrics().getHeight()) + (4 * (this.S.getIconHeight() + 3)))) / 2);
                                    graphics.setColor(new Color(5066061));
                                    graphics.setFont(MastersOfDestiny.D);
                                    graphics.drawString(amVar.b() + ":", this.K, iconHeight);
                                    this.J.l = iconHeight + graphics.getFontMetrics().getHeight();
                                    graphics.setColor(new Color(5066061));
                                    graphics.setFont(MastersOfDestiny.B);
                                    this.J.a(graphics, mastersOfDestiny);
                                    this.T = (this.P + (this.O.getIconWidth() / 2)) - (this.S.getIconWidth() / 2);
                                    this.U = (this.J.l + this.J.o) - graphics.getFontMetrics().getHeight();
                                    int i3 = this.U;
                                    Enumeration elements2 = this.R.elements();
                                    if (this.R.size() <= 4) {
                                        while (elements2.hasMoreElements()) {
                                            String[] split = elements2.nextElement().toString().split("\\|");
                                            this.S.paintIcon(mastersOfDestiny, graphics, this.T, i3);
                                            graphics.drawString(split[0], (this.T + (this.S.getIconWidth() / 2)) - (graphics.getFontMetrics().stringWidth(split[0]) / 2), i3 + (2 * (this.S.getIconHeight() / 3)));
                                            i3 += this.V;
                                        }
                                    } else {
                                        int iconWidth = this.T + this.S.getIconWidth() + 10;
                                        int i4 = this.U + 2;
                                        int i5 = this.U + (3 * this.V) + 5;
                                        this.aC.paintIcon(mastersOfDestiny, graphics, iconWidth, i4);
                                        this.aD.paintIcon(mastersOfDestiny, graphics, iconWidth, i5);
                                        int i6 = 0;
                                        while (elements2.hasMoreElements()) {
                                            String obj = elements2.nextElement().toString();
                                            if (i6 >= this.aE && i6 < this.aE + 4) {
                                                String[] split2 = obj.split("\\|");
                                                C0032k.a(obj);
                                                this.S.paintIcon(mastersOfDestiny, graphics, this.T, i3);
                                                graphics.drawString(split2[0], (this.T + (this.S.getIconWidth() / 2)) - (graphics.getFontMetrics().stringWidth(split2[0]) / 2), i3 + (2 * (this.S.getIconHeight() / 3)));
                                                i3 += this.V;
                                            }
                                            i6++;
                                        }
                                    }
                                }
                                if (this.A.size() > 0) {
                                    graphics.setColor(Color.WHITE);
                                    graphics.setFont(MastersOfDestiny.D);
                                    int length2 = this.av * this.F.length;
                                    for (int i7 = 0; i7 < this.G.length; i7++) {
                                        for (int i8 = 0; i8 < this.F.length; i8++) {
                                            if (length2 < this.A.size()) {
                                                ((am) this.A.elementAt(length2)).e().paintIcon(mastersOfDestiny, graphics, this.F[i8], this.G[i7]);
                                                graphics.drawString(((am) this.A.elementAt(length2)).b(), (this.F[i8] + ((am) this.A.elementAt(length2)).c()) - (MastersOfDestiny.E.stringWidth(((am) this.A.elementAt(length2)).b()) / 2), this.G[i7] + ((am) this.A.elementAt(length2)).d());
                                                length2++;
                                            }
                                        }
                                    }
                                    this.as.paintIcon(mastersOfDestiny, graphics, this.at, this.au);
                                    break;
                                }
                            }
                        }
                        if (amVar != null) {
                        }
                        if (this.A.size() > 0) {
                        }
                        break;
                    case 2:
                        am amVar2 = null;
                        Enumeration elements3 = this.A.elements();
                        while (elements3.hasMoreElements()) {
                            amVar2 = (am) elements3.nextElement();
                            if (amVar2.a() == this.E) {
                                if (amVar2 != null) {
                                    amVar2.f().paintIcon(mastersOfDestiny, graphics, this.m, this.n);
                                    this.W.paintIcon(mastersOfDestiny, graphics, this.X, this.Y);
                                    graphics.setColor(new Color(5066061));
                                    graphics.setFont(MastersOfDestiny.D);
                                    graphics.drawString(amVar2.b() + ":", this.ab.g - 5, this.ab.h - graphics.getFontMetrics().getHeight());
                                    this.ab.a(graphics, mastersOfDestiny);
                                    this.ag.paintIcon(mastersOfDestiny, graphics, this.ah, this.ai);
                                    this.aj.paintIcon(mastersOfDestiny, graphics, this.ak, this.al);
                                }
                                if (this.A.size() > 0) {
                                    graphics.setColor(Color.WHITE);
                                    graphics.setFont(MastersOfDestiny.D);
                                    int length3 = this.av * this.F.length;
                                    for (int i9 = 0; i9 < this.G.length; i9++) {
                                        for (int i10 = 0; i10 < this.F.length; i10++) {
                                            if (length3 < this.A.size()) {
                                                ((am) this.A.elementAt(length3)).e().paintIcon(mastersOfDestiny, graphics, this.F[i10], this.G[i9]);
                                                graphics.drawString(((am) this.A.elementAt(length3)).b(), (this.F[i10] + ((am) this.A.elementAt(length3)).c()) - (MastersOfDestiny.E.stringWidth(((am) this.A.elementAt(length3)).b()) / 2), this.G[i9] + ((am) this.A.elementAt(length3)).d());
                                                length3++;
                                            }
                                        }
                                    }
                                    this.as.paintIcon(mastersOfDestiny, graphics, this.at, this.au);
                                    break;
                                }
                            }
                        }
                        if (amVar2 != null) {
                        }
                        if (this.A.size() > 0) {
                        }
                        break;
                    case 3:
                        am amVar3 = null;
                        Enumeration elements4 = this.A.elements();
                        while (elements4.hasMoreElements()) {
                            amVar3 = (am) elements4.nextElement();
                            if (amVar3.a() == this.E) {
                                if (amVar3 != null) {
                                    amVar3.f().paintIcon(mastersOfDestiny, graphics, this.m, this.n);
                                    this.W.paintIcon(mastersOfDestiny, graphics, this.X, this.Y);
                                    graphics.setColor(new Color(5066061));
                                    graphics.setFont(MastersOfDestiny.D);
                                    graphics.drawString(amVar3.b() + ":", this.ab.g - 5, this.ab.h - graphics.getFontMetrics().getHeight());
                                    this.ab.a(graphics, mastersOfDestiny);
                                    this.am.paintIcon(mastersOfDestiny, graphics, this.an, this.ao);
                                }
                                if (this.A.size() > 0) {
                                    graphics.setColor(Color.WHITE);
                                    graphics.setFont(MastersOfDestiny.D);
                                    int length4 = this.av * this.F.length;
                                    for (int i11 = 0; i11 < this.G.length; i11++) {
                                        for (int i12 = 0; i12 < this.F.length; i12++) {
                                            if (length4 < this.A.size()) {
                                                ((am) this.A.elementAt(length4)).e().paintIcon(mastersOfDestiny, graphics, this.F[i12], this.G[i11]);
                                                graphics.drawString(((am) this.A.elementAt(length4)).b(), (this.F[i12] + ((am) this.A.elementAt(length4)).c()) - (MastersOfDestiny.E.stringWidth(((am) this.A.elementAt(length4)).b()) / 2), this.G[i11] + ((am) this.A.elementAt(length4)).d());
                                                length4++;
                                            }
                                        }
                                    }
                                    this.as.paintIcon(mastersOfDestiny, graphics, this.at, this.au);
                                    break;
                                }
                            }
                        }
                        if (amVar3 != null) {
                        }
                        if (this.A.size() > 0) {
                        }
                        break;
                    case 4:
                        am amVar4 = null;
                        Enumeration elements5 = this.A.elements();
                        while (elements5.hasMoreElements()) {
                            amVar4 = (am) elements5.nextElement();
                            if (amVar4.a() == this.E) {
                                if (amVar4 != null) {
                                    amVar4.f().paintIcon(mastersOfDestiny, graphics, this.m, this.n);
                                    this.ap.paintIcon(mastersOfDestiny, graphics, this.aq, this.ar);
                                    graphics.setColor(new Color(5066061));
                                    graphics.setFont(MastersOfDestiny.D);
                                    graphics.drawString("You have accepted the quest.", this.aq + 10, this.ar + 10 + graphics.getFontMetrics().getHeight());
                                    graphics.drawString("Please check your updated quest log.", this.aq + 10, this.ar + 10 + (graphics.getFontMetrics().getHeight() * 2));
                                }
                                if (this.A.size() > 0) {
                                    graphics.setColor(Color.WHITE);
                                    graphics.setFont(MastersOfDestiny.D);
                                    int length5 = this.av * this.F.length;
                                    for (int i13 = 0; i13 < this.G.length; i13++) {
                                        for (int i14 = 0; i14 < this.F.length; i14++) {
                                            if (length5 < this.A.size()) {
                                                ((am) this.A.elementAt(length5)).e().paintIcon(mastersOfDestiny, graphics, this.F[i14], this.G[i13]);
                                                graphics.drawString(((am) this.A.elementAt(length5)).b(), (this.F[i14] + ((am) this.A.elementAt(length5)).c()) - (MastersOfDestiny.E.stringWidth(((am) this.A.elementAt(length5)).b()) / 2), this.G[i13] + ((am) this.A.elementAt(length5)).d());
                                                length5++;
                                            }
                                        }
                                    }
                                    this.as.paintIcon(mastersOfDestiny, graphics, this.at, this.au);
                                    break;
                                }
                            }
                        }
                        if (amVar4 != null) {
                        }
                        if (this.A.size() > 0) {
                        }
                        break;
                    case 5:
                        am amVar5 = null;
                        Enumeration elements6 = this.A.elements();
                        while (elements6.hasMoreElements()) {
                            amVar5 = (am) elements6.nextElement();
                            if (amVar5.a() == this.E) {
                                if (amVar5 != null) {
                                    amVar5.f().paintIcon(mastersOfDestiny, graphics, this.m, this.n);
                                    this.ap.paintIcon(mastersOfDestiny, graphics, this.aq, this.ar);
                                    graphics.setColor(new Color(5066061));
                                    graphics.setFont(MastersOfDestiny.D);
                                    graphics.drawString("You are already undertaking.", this.aq + 10, this.ar + 10 + graphics.getFontMetrics().getHeight());
                                    graphics.drawString("this quest.", this.aq + 10, this.ar + 10 + (graphics.getFontMetrics().getHeight() * 2));
                                }
                                if (this.A.size() > 0) {
                                    graphics.setColor(Color.WHITE);
                                    graphics.setFont(MastersOfDestiny.D);
                                    int length6 = this.av * this.F.length;
                                    for (int i15 = 0; i15 < this.G.length; i15++) {
                                        for (int i16 = 0; i16 < this.F.length; i16++) {
                                            if (length6 < this.A.size()) {
                                                ((am) this.A.elementAt(length6)).e().paintIcon(mastersOfDestiny, graphics, this.F[i16], this.G[i15]);
                                                graphics.drawString(((am) this.A.elementAt(length6)).b(), (this.F[i16] + ((am) this.A.elementAt(length6)).c()) - (MastersOfDestiny.E.stringWidth(((am) this.A.elementAt(length6)).b()) / 2), this.G[i15] + ((am) this.A.elementAt(length6)).d());
                                                length6++;
                                            }
                                        }
                                    }
                                    this.as.paintIcon(mastersOfDestiny, graphics, this.at, this.au);
                                    break;
                                }
                            }
                        }
                        if (amVar5 != null) {
                        }
                        if (this.A.size() > 0) {
                        }
                        break;
                }
        }
        if (this.aI != -1) {
            this.aF[this.aI].paintIcon(mastersOfDestiny, graphics, this.aG, this.aH);
        }
    }

    @Override // defpackage.AbstractC0026e
    public void a(int i, Object obj) {
    }

    @Override // defpackage.AbstractC0026e
    public void a(String[] strArr) {
        C0032k.a("CafeState(processServerMessage): Received server message");
        switch (P.a(strArr)) {
            case C0000a.aS /* -1 */:
                a(C0000a.a(Long.toString(C0001aa.c), this.b.d));
                return;
            case 0:
            default:
                return;
            case 1:
                C0032k.a("CafeState(processServerMessage): Cafe is closed");
                this.p = "Sorry, adventurer.";
                this.q = "Our cafe is closed for the day.";
                return;
            case 2:
                C0032k.a("CafeState(processServerMessage): Cafe is open");
                this.p = "Welcome, adventurer.";
                this.q = "How may I serve you?";
                return;
            case 3:
                C0032k.a("CafeState(processServerMessage): NPC presence detected");
                C0032k.a("CafeState(processServerMessage): Name =>" + strArr[2]);
                C0032k.a("CafeState(processServerMessage): Image ID =>" + strArr[3]);
                C0032k.a("CafeState(processServerMessage): " + this.B + strArr[3] + this.C);
                C0032k.a("CafeState(processServerMessage): " + this.B + strArr[3] + this.D);
                this.A.add(this.b.u.a(Long.parseLong(strArr[1]), strArr[2], this.B + strArr[3] + this.C, this.B + strArr[3] + this.D));
                return;
            case 4:
                C0032k.a("CafeState(processServerMessage): Conversation received");
                C0032k.a("CafeState(processServerMessage): Server Message=>" + strArr[0] + C0000a.v + strArr[1]);
                C0032k.a("CafeState(processServerMessage): Conversation Number" + strArr[1]);
                this.J.a(this.b.u.a(Long.parseLong(strArr[1])), this.K, this.L, this.M, this.N, MastersOfDestiny.C, null);
                return;
            case 5:
                String b = this.b.u.b(Long.parseLong(strArr[1]));
                C0032k.a(b);
                C0032k.a("CafeState(processServerMessage): Quest Trigger Type =>" + b);
                String str = b + C0000a.v + 2 + C0000a.v + strArr[2] + C0000a.v + strArr[3];
                if (this.R.contains(str)) {
                    return;
                }
                this.R.add(str);
                return;
            case 6:
                String b2 = this.b.u.b(Long.parseLong(strArr[1]));
                C0032k.a("CafeState(processServerMessage): Quest Trigger =>" + b2);
                String str2 = b2 + C0000a.v + 3 + C0000a.v + strArr[1] + C0000a.v + strArr[2];
                if (this.R.contains(str2)) {
                    return;
                }
                this.R.add(str2);
                return;
            case 7:
                C0032k.a("CafeState(processServerMessage): Quest accepted successfully");
                this.e = 4;
                return;
            case 8:
                C0032k.a("CafeState(processServerMessage): Accept quest failed");
                this.e = 5;
                return;
            case 9:
                this.a.G.h(this.a.G.t() + Long.parseLong(strArr[1]));
                GameStates gameStates = this.a;
                GameStates.X += Long.parseLong(strArr[2]);
                return;
            case 10:
                int parseInt = Integer.parseInt(strArr[2]);
                long parseLong = Long.parseLong(strArr[1]);
                boolean z = false;
                for (int i = 0; i < this.a.G.H.length; i++) {
                    Enumeration elements = this.a.G.H[i].elements();
                    int i2 = 0;
                    while (elements.hasMoreElements()) {
                        if (((C0020av) elements.nextElement()).a().a() == parseLong) {
                            ((C0020av) this.a.G.H[i].elementAt(i2)).a(((C0020av) this.a.G.H[i].elementAt(i2)).b() + parseInt);
                            z = true;
                        }
                        i2++;
                    }
                }
                if (z || parseInt <= 0) {
                    return;
                }
                D a = this.a.pT.a(strArr[1]);
                C0020av c0020av = new C0020av();
                c0020av.a(a);
                c0020av.a(parseInt);
                this.a.G.H[a.h()].add(c0020av);
                return;
        }
    }

    public void a(String str) {
        this.a.b(str);
    }

    @Override // defpackage.AbstractC0026e
    public void a() {
    }

    @Override // defpackage.AbstractC0026e
    public void a(MouseEvent mouseEvent) {
        for (int i = 0; i < this.t.length; i++) {
            if (mouseEvent.getX() > this.w[i] && mouseEvent.getX() < this.w[i] + this.y[i] && mouseEvent.getY() > this.x && mouseEvent.getY() < this.x + this.z) {
                this.u = i;
                this.av = 0;
                this.at = this.F[0] - 2;
                this.au = this.G[0] - 2;
                return;
            }
        }
        switch (this.u) {
            case 0:
                if (this.A.size() > 0) {
                    int length = this.av * this.F.length;
                    for (int i2 = 0; i2 < this.G.length; i2++) {
                        for (int i3 = 0; i3 < this.F.length; i3++) {
                            if (length < this.A.size()) {
                                if (mouseEvent.getX() > this.F[i3] && mouseEvent.getX() < this.F[i3] + this.H && mouseEvent.getY() > this.G[i2] && mouseEvent.getY() < this.G[i2] + this.I) {
                                    this.at = this.F[i3] - 2;
                                    this.au = this.G[i2] - 2;
                                    this.R.clear();
                                    this.aE = 0;
                                    this.E = ((am) this.A.elementAt(length)).a();
                                    a(P.a(this.E));
                                    this.e = 1;
                                }
                                length++;
                            }
                        }
                    }
                }
                for (int i4 = 0; i4 < this.ax.length; i4++) {
                    if (mouseEvent.getX() > this.aw && mouseEvent.getX() < this.aw + this.aA && mouseEvent.getY() > this.ax[i4] && mouseEvent.getY() < this.ax[i4] + this.aB) {
                        switch (i4) {
                            case 0:
                                if (this.av > 0) {
                                    this.av--;
                                    return;
                                }
                                return;
                            case 1:
                                if (this.F.length * (this.av + this.G.length) < this.A.size()) {
                                    this.av++;
                                    return;
                                }
                                return;
                        }
                    }
                }
                switch (this.e) {
                    case 1:
                        if (this.R.size() > 4) {
                            int iconWidth = this.T + this.S.getIconWidth() + 10;
                            int i5 = this.U + 2;
                            int i6 = this.U + (3 * this.V) + 5;
                            if (mouseEvent.getX() < iconWidth || mouseEvent.getX() > iconWidth + this.aC.getIconWidth() || mouseEvent.getY() < i5 || mouseEvent.getY() > i5 + this.aC.getIconHeight()) {
                                if (mouseEvent.getX() < iconWidth || mouseEvent.getX() > iconWidth + this.aD.getIconWidth() || mouseEvent.getY() < i6 || mouseEvent.getY() > i6 + this.aD.getIconHeight()) {
                                    for (int i7 = 0; i7 < 4; i7++) {
                                        if (mouseEvent.getX() > this.T && mouseEvent.getX() < this.T + this.S.getIconWidth() && mouseEvent.getY() > this.U + (i7 * this.V) && mouseEvent.getY() < this.U + (i7 * this.V) + this.S.getIconHeight()) {
                                            String[] split = ((String) this.R.elementAt(i7 + this.aE)).split("\\|");
                                            this.e = Byte.parseByte(split[1]);
                                            this.aI = -1;
                                            String str = null;
                                            switch (this.e) {
                                                case 2:
                                                    this.aa = Long.parseLong(split[2]);
                                                    long parseLong = Long.parseLong(split[3]);
                                                    C0032k.a("CafeState(mouseClicked): Selected Quest ID =>" + this.aa);
                                                    C0032k.a("CafeState(mouseClicked): Selected SubQuest ID =>" + parseLong);
                                                    str = this.b.u.c(parseLong);
                                                    break;
                                                case 3:
                                                    this.Z = Long.parseLong(split[2]);
                                                    this.aa = Long.parseLong(split[3]);
                                                    str = this.b.u.c(this.aa);
                                                    break;
                                            }
                                            this.ab.b();
                                            this.ab.a(str.substring(0, str.length() - 1), 5066061, 5066061);
                                            this.ab.a((byte) 2);
                                            return;
                                        }
                                    }
                                    break;
                                } else {
                                    if (this.aE + 4 < this.R.size()) {
                                        this.aE++;
                                        return;
                                    }
                                    return;
                                }
                            } else {
                                if (this.aE > 0) {
                                    this.aE--;
                                    return;
                                }
                                return;
                            }
                        } else {
                            for (int i8 = 0; i8 < this.R.size(); i8++) {
                                if (mouseEvent.getX() > this.T && mouseEvent.getX() < this.T + this.S.getIconWidth() && mouseEvent.getY() > this.U + (i8 * this.V) && mouseEvent.getY() < this.U + (i8 * this.V) + this.S.getIconHeight()) {
                                    String[] split2 = ((String) this.R.elementAt(i8)).split("\\|");
                                    this.e = Byte.parseByte(split2[1]);
                                    this.aI = -1;
                                    String str2 = null;
                                    switch (this.e) {
                                        case 2:
                                            this.aa = Long.parseLong(split2[2]);
                                            long parseLong2 = Long.parseLong(split2[3]);
                                            C0032k.a("CafeState(mouseClicked): Selected Quest ID =>" + this.aa);
                                            C0032k.a("CafeState(mouseClicked): Selected SubQuest ID =>" + parseLong2);
                                            str2 = this.b.u.c(parseLong2);
                                            break;
                                        case 3:
                                            this.Z = Long.parseLong(split2[2]);
                                            this.aa = Long.parseLong(split2[3]);
                                            str2 = this.b.u.c(this.aa);
                                            break;
                                    }
                                    this.ab.b();
                                    this.ab.a(str2.substring(0, str2.length() - 1), 5066061, 5066061);
                                    this.ab.a((byte) 2);
                                    return;
                                }
                            }
                            break;
                        }
                        break;
                    case 2:
                        for (int i9 = 0; i9 < this.ad.length; i9++) {
                            if (mouseEvent.getX() > this.ac && mouseEvent.getX() < this.ac + this.ae && mouseEvent.getY() > this.ad[i9] && mouseEvent.getY() < this.ad[i9] + this.af) {
                                switch (i9) {
                                    case 0:
                                        this.ab.a((byte) 0);
                                        return;
                                    case 1:
                                        this.ab.a((byte) 1);
                                        return;
                                }
                            }
                        }
                        if (mouseEvent.getX() > this.ah && mouseEvent.getX() < this.ah + this.ag.getIconWidth() && mouseEvent.getY() > this.ai && mouseEvent.getY() < this.ai + this.ag.getIconHeight()) {
                            a(P.b(this.aa));
                            this.aI = -1;
                        }
                        if (mouseEvent.getX() > this.ak && mouseEvent.getX() < this.ak + this.aj.getIconWidth() && mouseEvent.getY() > this.al && mouseEvent.getY() < this.al + this.aj.getIconHeight()) {
                            this.e = 1;
                            this.aI = -1;
                            break;
                        }
                        break;
                    case 3:
                        for (int i10 = 0; i10 < this.ad.length; i10++) {
                            if (mouseEvent.getX() > this.ac && mouseEvent.getX() < this.ac + this.ae && mouseEvent.getY() > this.ad[i10] && mouseEvent.getY() < this.ad[i10] + this.af) {
                                switch (i10) {
                                    case 0:
                                        this.ab.a((byte) 0);
                                        return;
                                    case 1:
                                        this.ab.a((byte) 1);
                                        return;
                                }
                            }
                        }
                        if (mouseEvent.getX() > this.an && mouseEvent.getX() < this.an + this.am.getIconWidth() && mouseEvent.getY() > this.ao && mouseEvent.getY() < this.ao + this.am.getIconHeight()) {
                            a(P.a(this.Z, this.aa));
                            this.e = 4;
                            this.aI = -1;
                            break;
                        }
                        break;
                    case 4:
                    case 5:
                        if (mouseEvent.getX() > this.an && mouseEvent.getX() < this.an + this.am.getIconWidth() && mouseEvent.getY() > this.ao && mouseEvent.getY() < this.ao + this.am.getIconHeight()) {
                            this.e = 0;
                            this.aI = -1;
                            break;
                        }
                        break;
                }
        }
        if (mouseEvent.getX() <= this.aJ || mouseEvent.getX() >= this.aJ + this.aL || mouseEvent.getY() <= this.aK || mouseEvent.getY() >= this.aK + this.aM) {
            return;
        }
        C0032k.a("back to colony");
        this.aI = -1;
        this.d = (byte) 5;
    }

    @Override // defpackage.AbstractC0026e
    public void b(MouseEvent mouseEvent) {
        this.aI = -1;
        if (this.u == 0) {
            if (this.e == 1) {
                if (this.R.size() <= 4) {
                    for (int i = 0; i < this.R.size(); i++) {
                        if (mouseEvent.getX() > this.T && mouseEvent.getX() < this.T + this.S.getIconWidth() && mouseEvent.getY() > this.U + (i * this.V) && mouseEvent.getY() < this.U + (i * this.V) + this.S.getIconHeight()) {
                            this.aI = 3;
                            this.aG = this.T;
                            this.aH = this.U + (i * this.V);
                            return;
                        }
                    }
                } else {
                    for (int i2 = 0; i2 < 4; i2++) {
                        if (mouseEvent.getX() > this.T && mouseEvent.getX() < this.T + this.S.getIconWidth() && mouseEvent.getY() > this.U + (i2 * this.V) && mouseEvent.getY() < this.U + (i2 * this.V) + this.S.getIconHeight()) {
                            this.aI = 3;
                            this.aG = this.T;
                            this.aH = this.U + (i2 * this.V);
                            return;
                        }
                    }
                }
            } else if (this.e == 2) {
                if (mouseEvent.getX() > this.ah && mouseEvent.getX() < this.ah + this.ag.getIconWidth() && mouseEvent.getY() > this.ai && mouseEvent.getY() < this.ai + this.ag.getIconHeight()) {
                    this.aI = 1;
                    this.aG = this.ah;
                    this.aH = this.ai;
                    return;
                } else if (mouseEvent.getX() > this.ak && mouseEvent.getX() < this.ak + this.aj.getIconWidth() && mouseEvent.getY() > this.al && mouseEvent.getY() < this.al + this.aj.getIconHeight()) {
                    this.aI = 1;
                    this.aG = this.ak;
                    this.aH = this.al;
                    return;
                }
            } else if (this.e == 3) {
                if (mouseEvent.getX() > this.an && mouseEvent.getX() < this.an + this.am.getIconWidth() && mouseEvent.getY() > this.ao && mouseEvent.getY() < this.ao + this.am.getIconHeight()) {
                    this.aI = 2;
                    this.aG = this.an;
                    this.aH = this.ao;
                    return;
                }
            } else if ((this.e == 5 || this.e == 4) && mouseEvent.getX() > this.an && mouseEvent.getX() < this.an + this.am.getIconWidth() && mouseEvent.getY() > this.ao && mouseEvent.getY() < this.ao + this.am.getIconHeight()) {
                this.aI = 2;
                this.aG = this.an;
                this.aH = this.ao;
                return;
            }
        }
        if (mouseEvent.getX() <= this.aJ || mouseEvent.getX() >= this.aJ + this.aL || mouseEvent.getY() <= this.aK || mouseEvent.getY() >= this.aK + this.aM) {
            return;
        }
        this.aI = 0;
        this.aG = this.aJ;
        this.aH = this.aK;
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
