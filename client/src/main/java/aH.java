package defpackage;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.Icon;

/* renamed from: aH  reason: default package */
/* loaded from: hinterwars.jar:aH.class */
public class aH extends A {
    private int bm;
    private int bn;
    private int bo;
    public int a;
    public int b;
    private Vector bp;
    private Vector[] bq;
    private Vector br;
    private Icon[][] bs;
    private int bt;
    private int bu;
    private Icon[][] bv;
    private int bw;
    private int bx;
    private Icon[][] by;
    private int bz;
    private int bA;
    private int bB;
    private Icon bC;
    private Icon bD;
    private Icon[] bE;
    private Icon[] bF;
    private Icon[] bG;
    private Icon[][] bH;
    private Icon bI;
    private Icon bJ;
    private int bK;
    private int[][] bL = new int[3][9];
    private final byte bM = 0;
    private final byte bN = 1;
    private final byte bO = 2;

    public aH(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Icon icon, int i10) {
        this.p = j;
        this.l = str;
        this.t = i;
        this.P = i5;
        this.Q = i6;
        this.R = i7;
        this.S = i8;
        this.N = i7;
        this.O = i8;
        this.T = i9;
        this.k = icon;
        this.bm = i2;
        this.n = C0028g.C[i2];
        this.o = C0028g.D[i2];
        this.bn = i3;
        this.bo = i4;
        this.A = i10;
        this.bp = new Vector();
        this.bq = new Vector[4];
        this.bq[0] = new Vector();
        this.bq[1] = new Vector();
        this.bq[2] = new Vector();
        this.bq[3] = new Vector();
        this.br = new Vector();
        this.bK = 0;
        this.y = null;
        this.bB = 1;
        this.a = -1;
        this.b = -1;
    }

    public void a(aQ aQVar) {
        this.br.add(aQVar);
    }

    public Vector a() {
        return this.br;
    }

    public void a(C0020av c0020av) {
        this.bp.add(c0020av);
        switch (c0020av.d()) {
            case 3:
                this.bB = c0020av.a().y();
                C0032k.a("weapon type = " + this.bB);
                this.m = c0020av.a().i();
                return;
            default:
                return;
        }
    }

    public void b(C0020av c0020av) {
        this.bp.remove(c0020av);
    }

    public void c(C0020av c0020av) {
        D a = c0020av.a();
        Vector vector = this.bq[c0020av.a().h()];
        for (int i = 0; i < vector.size(); i++) {
            if (a.a() == ((C0020av) vector.get(i)).a().a()) {
                a(a.h(), i, c0020av.b());
                return;
            }
        }
        vector.add(c0020av);
    }

    public int d(C0020av c0020av) {
        return this.bq[c0020av.a().h()].indexOf(c0020av);
    }

    public void a(int i, int i2, int i3) {
        ((C0020av) this.bq[i].elementAt(i2)).a(((C0020av) this.bq[i].elementAt(i2)).b() + i3);
        if (((C0020av) this.bq[i].elementAt(i2)).b() <= 0) {
            this.bq[i].removeElementAt(i2);
        }
    }

    public Vector b() {
        return (Vector) this.bq[3].clone();
    }

    public Vector c() {
        return (Vector) this.bq[0].clone();
    }

    public C0020av a(int i) {
        Enumeration elements = this.bp.elements();
        while (elements.hasMoreElements()) {
            C0020av c0020av = (C0020av) elements.nextElement();
            if (c0020av.d() == i) {
                return c0020av;
            }
        }
        return null;
    }

    public C0020av d() {
        Enumeration elements = this.bp.elements();
        while (elements.hasMoreElements()) {
            C0020av c0020av = (C0020av) elements.nextElement();
            if (c0020av.d() == 3) {
                return c0020av;
            }
        }
        return null;
    }

    public void a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.u = i;
        this.r = i2;
        this.q = i3;
        this.w = i3;
        this.x = i4;
        this.v = i5;
        this.s = i6;
    }

    public void a(C0001aa c0001aa) {
        this.bs = null;
        this.bv = null;
        this.by = null;
        Enumeration elements = this.bp.elements();
        while (elements.hasMoreElements()) {
            C0020av c0020av = (C0020av) elements.nextElement();
            switch (c0020av.d()) {
                case 1:
                    this.bL[0] = c0020av.a().q();
                    this.bs = c0020av.a().f(this.bB);
                    this.bt = c0020av.a().w();
                    this.bu = c0020av.a().x();
                    break;
                case 2:
                    this.bL[1] = c0020av.a().q();
                    this.bv = c0020av.a().f(this.bB);
                    this.bw = c0020av.a().w();
                    this.bx = c0020av.a().x();
                    break;
                case 3:
                    this.bL[2] = c0020av.a().q();
                    this.by = c0020av.a().f(this.bB);
                    this.bz = c0020av.a().w();
                    this.bA = c0020av.a().x();
                    break;
            }
        }
        if (this.bs == null) {
            S a = c0001aa.D.a(this.bm, this.bn);
            this.bs = a.a(this.bB);
            this.bL[0] = a.c();
            this.bt = a.h();
            this.bu = a.i();
        }
        if (this.bv == null) {
            S b = c0001aa.D.b(this.bm, this.bo);
            this.bv = b.a(this.bB);
            this.bL[1] = b.c();
            this.bw = b.h();
            this.bx = b.i();
        }
        if (this.by == null) {
            this.bL[2] = this.bL[1];
        }
        switch (this.bm) {
            case 1:
                this.bC = c0001aa.X;
                this.bG = c0001aa.V;
                this.bH = c0001aa.W;
                break;
            case 2:
                this.bC = c0001aa.ac;
                this.bG = c0001aa.aa;
                this.bH = c0001aa.ab;
                break;
            case 3:
                this.bC = c0001aa.ah;
                this.bG = c0001aa.af;
                this.bH = c0001aa.ag;
                break;
            case 4:
                this.bC = c0001aa.am;
                this.bG = c0001aa.ak;
                this.bH = c0001aa.al;
                break;
        }
        this.bD = c0001aa.E;
        this.bE = c0001aa.G;
        this.bF = c0001aa.F;
        this.at = c0001aa.H;
        this.au = c0001aa.I;
        this.av = c0001aa.J;
        this.aw = c0001aa.K;
        this.ax = c0001aa.L;
        this.ay = c0001aa.M;
        this.az = c0001aa.N;
        this.aA = c0001aa.O;
        this.aB = c0001aa.P;
        this.aC = c0001aa.Q;
        this.z = new K("res/skills/", "graphicsMapping.txt");
        this.bI = c0001aa.R;
        this.bJ = c0001aa.S;
        this.D = c0001aa.n;
        this.I = c0001aa.o;
        super.a(this.bL);
    }

    public void a(Graphics graphics, MastersOfDestiny mastersOfDestiny, int i) {
        int i2;
        int i3;
        if (this.bs == null || this.bv == null) {
            C0032k.a(this.p + " playerHead = " + this.bs + " playerArmor = " + this.bv);
            return;
        }
        int i4 = this.T;
        if (this.ae == 2 || this.ae == 3) {
            switch (this.T) {
                case C0000a.bb /* 16 */:
                case C0000a.bf /* 20 */:
                    i4 = 0;
                    break;
                case C0000a.bc /* 17 */:
                case C0000a.bg /* 21 */:
                    i4 = 1;
                    break;
                case C0000a.bd /* 18 */:
                case C0000a.bh /* 22 */:
                    i4 = 2;
                    break;
                case C0000a.be /* 19 */:
                case C0000a.bi /* 23 */:
                    i4 = 3;
                    break;
            }
        }
        if (this.u <= 0) {
            l();
            i2 = this.R - (this.bC.getIconWidth() / 2);
            i3 = this.S - (this.bC.getIconHeight() / 2);
            this.bC.paintIcon(mastersOfDestiny, graphics, i2, i3);
        } else {
            int i5 = this.R - this.bt;
            int i6 = this.S - this.bu;
            int i7 = this.R - this.bw;
            int i8 = this.S - this.bx;
            int i9 = this.R - this.bz;
            int i10 = this.S - this.bA;
            i2 = i5;
            i3 = i6;
            switch (i4) {
                case 0:
                case 4:
                case 8:
                case C0000a.aX /* 12 */:
                    if (this.by != null) {
                        if (this.by[i4][this.U[2]] != null) {
                            this.by[i4][this.U[2]].paintIcon(mastersOfDestiny, graphics, i9, i10);
                        } else {
                            this.by[0][0].paintIcon(mastersOfDestiny, graphics, i9, i10);
                        }
                    }
                    if (this.bv[i4][this.U[1]] != null) {
                        this.bv[i4][this.U[1]].paintIcon(mastersOfDestiny, graphics, i7, i8);
                    } else {
                        this.bv[0][0].paintIcon(mastersOfDestiny, graphics, i7, i8);
                    }
                    if (this.bs[i4][this.U[0]] == null) {
                        this.bs[0][0].paintIcon(mastersOfDestiny, graphics, i5, i6);
                        break;
                    } else {
                        this.bs[i4][this.U[0]].paintIcon(mastersOfDestiny, graphics, i5, i6);
                        break;
                    }
                case 1:
                case 5:
                case 9:
                case C0000a.aY /* 13 */:
                    if (this.by != null) {
                        if (this.by[i4][this.U[2]] != null) {
                            this.by[i4][this.U[2]].paintIcon(mastersOfDestiny, graphics, i9, i10);
                        } else {
                            this.by[1][0].paintIcon(mastersOfDestiny, graphics, i9, i10);
                        }
                    }
                    if (this.bv[i4][this.U[1]] != null) {
                        this.bv[i4][this.U[1]].paintIcon(mastersOfDestiny, graphics, i7, i8);
                    } else {
                        this.bv[1][0].paintIcon(mastersOfDestiny, graphics, i7, i8);
                    }
                    if (this.bs[i4][this.U[0]] != null) {
                        this.bs[i4][this.U[0]].paintIcon(mastersOfDestiny, graphics, i5, i6);
                    } else {
                        this.bs[1][0].paintIcon(mastersOfDestiny, graphics, i5, i6);
                    }
                    if (this.bm == 3 && ((this.bB == 1 || this.bB == 3) && this.by != null)) {
                        if (this.by[i4][this.U[2]] == null) {
                            this.by[1][0].paintIcon(mastersOfDestiny, graphics, i9, i10);
                            break;
                        } else {
                            this.by[i4][this.U[2]].paintIcon(mastersOfDestiny, graphics, i9, i10);
                            break;
                        }
                    }
                    break;
                case 2:
                case 6:
                case 10:
                case C0000a.aZ /* 14 */:
                    if (this.bv[i4][this.U[1]] != null) {
                        this.bv[i4][this.U[1]].paintIcon(mastersOfDestiny, graphics, i7, i8);
                    } else {
                        this.bv[2][0].paintIcon(mastersOfDestiny, graphics, i7, i8);
                    }
                    if (this.bs[i4][this.U[0]] != null) {
                        this.bs[i4][this.U[0]].paintIcon(mastersOfDestiny, graphics, i5, i6);
                    } else {
                        this.bs[2][0].paintIcon(mastersOfDestiny, graphics, i5, i6);
                    }
                    if (this.by != null) {
                        if (this.by[i4][this.U[2]] == null) {
                            this.by[2][0].paintIcon(mastersOfDestiny, graphics, i9, i10);
                            break;
                        } else {
                            this.by[i4][this.U[2]].paintIcon(mastersOfDestiny, graphics, i9, i10);
                            break;
                        }
                    }
                    break;
                case 3:
                case 7:
                case C0000a.aW /* 11 */:
                case 15:
                    if (this.bv[i4][this.U[1]] != null) {
                        this.bv[i4][this.U[1]].paintIcon(mastersOfDestiny, graphics, i7, i8);
                    } else {
                        this.bv[3][0].paintIcon(mastersOfDestiny, graphics, i7, i8);
                    }
                    if (this.bs[i4][this.U[0]] != null) {
                        this.bs[i4][this.U[0]].paintIcon(mastersOfDestiny, graphics, i5, i6);
                    } else {
                        this.bs[3][0].paintIcon(mastersOfDestiny, graphics, i5, i6);
                    }
                    if (this.by != null) {
                        if (this.by[i4][this.U[2]] == null) {
                            this.by[3][0].paintIcon(mastersOfDestiny, graphics, i9, i10);
                            break;
                        } else {
                            this.by[i4][this.U[2]].paintIcon(mastersOfDestiny, graphics, i9, i10);
                            break;
                        }
                    }
                    break;
                case C0000a.bb /* 16 */:
                case C0000a.bc /* 17 */:
                case C0000a.bd /* 18 */:
                case C0000a.be /* 19 */:
                    if (this.bv[i4][this.U[1]] != null) {
                        this.bv[i4][this.U[1]].paintIcon(mastersOfDestiny, graphics, i7, i8);
                    }
                    if (this.bs[i4][this.U[0]] != null) {
                        this.bs[i4][this.U[0]].paintIcon(mastersOfDestiny, graphics, i5, i6);
                        break;
                    }
                    break;
                default:
                    C0032k.a("no player!!! cos state is wrong!!!!");
                    break;
            }
            switch (this.ae) {
                case 0:
                    int iconWidth = (i7 + (this.bv[i4][this.U[1]].getIconWidth() / 2)) - (this.bD.getIconWidth() / 2);
                    int iconHeight = (i8 + (this.bv[i4][this.U[1]].getIconHeight() / 2)) - (this.bD.getIconHeight() / 2);
                    switch (this.T) {
                        case C0000a.aX /* 12 */:
                            this.bD.paintIcon(mastersOfDestiny, graphics, iconWidth, iconHeight);
                            break;
                        case C0000a.aY /* 13 */:
                            this.bD.paintIcon(mastersOfDestiny, graphics, iconWidth, iconHeight);
                            break;
                        case C0000a.aZ /* 14 */:
                            this.bD.paintIcon(mastersOfDestiny, graphics, iconWidth, iconHeight);
                            break;
                        case 15:
                            this.bD.paintIcon(mastersOfDestiny, graphics, iconWidth, iconHeight);
                            break;
                    }
                case 1:
                    this.bE[this.X].paintIcon(mastersOfDestiny, graphics, (i5 + (this.bs[i4][0].getIconWidth() / 2)) - (this.bE[this.X].getIconWidth() / 2), i6 - (this.bE[this.X].getIconHeight() / 2));
                    break;
                case 2:
                    switch (this.T) {
                        case C0000a.bb /* 16 */:
                            this.bG[0].paintIcon(mastersOfDestiny, graphics, i7, i6);
                            break;
                        case C0000a.bc /* 17 */:
                            this.bG[1].paintIcon(mastersOfDestiny, graphics, i7, i6);
                            break;
                        case C0000a.bd /* 18 */:
                            this.bG[2].paintIcon(mastersOfDestiny, graphics, i7, i6);
                            break;
                        case C0000a.be /* 19 */:
                            this.bG[3].paintIcon(mastersOfDestiny, graphics, i7, i6);
                            break;
                    }
                    this.bF[this.X].paintIcon(mastersOfDestiny, graphics, (i7 + (this.bv[i4][0].getIconWidth() / 2)) - (this.bF[this.X].getIconWidth() / 2), (i6 + (((i8 + this.bv[i4][0].getIconHeight()) - i6) / 2)) - (this.bF[this.X].getIconHeight() / 2));
                    break;
                case 5:
                    switch (this.an) {
                        case 0:
                            this.at[this.X].paintIcon(mastersOfDestiny, graphics, (i7 + (this.bv[i4][0].getIconWidth() / 2)) - (this.at[this.X].getIconWidth() / 2), (i6 + (((i8 + this.bv[i4][0].getIconHeight()) - i6) / 2)) - (this.at[this.X].getIconHeight() / 2));
                            break;
                        case 1:
                            this.av[this.X].paintIcon(mastersOfDestiny, graphics, (i7 + (this.bv[i4][0].getIconWidth() / 2)) - (this.av[this.X].getIconWidth() / 2), (i6 + (((i8 + this.bv[i4][0].getIconHeight()) - i6) / 2)) - (this.av[this.X].getIconHeight() / 2));
                            break;
                        case 2:
                            this.ax[this.X].paintIcon(mastersOfDestiny, graphics, (i7 + (this.bv[i4][0].getIconWidth() / 2)) - (this.ax[this.X].getIconWidth() / 2), (i6 + (((i8 + this.bv[i4][0].getIconHeight()) - i6) / 2)) - (this.ax[this.X].getIconHeight() / 2));
                            break;
                        case 3:
                            this.az[this.X].paintIcon(mastersOfDestiny, graphics, (i7 + (this.bv[i4][0].getIconWidth() / 2)) - (this.az[this.X].getIconWidth() / 2), (i6 + (((i8 + this.bv[i4][0].getIconHeight()) - i6) / 2)) - (this.az[this.X].getIconHeight() / 2));
                            break;
                        case 4:
                            this.aB[this.X].paintIcon(mastersOfDestiny, graphics, (i7 + (this.bv[i4][0].getIconWidth() / 2)) - (this.aB[this.X].getIconWidth() / 2), (i6 + (((i8 + this.bv[i4][0].getIconHeight()) - i6) / 2)) - (this.aB[this.X].getIconHeight() / 2));
                            break;
                    }
                case 6:
                    switch (this.an) {
                        case 0:
                            this.au[this.X].paintIcon(mastersOfDestiny, graphics, (i7 + (this.bv[i4][0].getIconWidth() / 2)) - (this.au[this.X].getIconWidth() / 2), (i6 + (((i8 + this.bv[i4][0].getIconHeight()) - i6) / 2)) - (this.au[this.X].getIconHeight() / 2));
                            break;
                        case 1:
                            this.aw[this.X].paintIcon(mastersOfDestiny, graphics, (i7 + (this.bv[i4][0].getIconWidth() / 2)) - (this.aw[this.X].getIconWidth() / 2), (i6 + (((i8 + this.bv[i4][0].getIconHeight()) - i6) / 2)) - (this.aw[this.X].getIconHeight() / 2));
                            break;
                        case 2:
                            this.ay[this.X].paintIcon(mastersOfDestiny, graphics, (i7 + (this.bv[i4][0].getIconWidth() / 2)) - (this.ay[this.X].getIconWidth() / 2), (i6 + (((i8 + this.bv[i4][0].getIconHeight()) - i6) / 2)) - (this.ay[this.X].getIconHeight() / 2));
                            break;
                        case 3:
                            this.aA[this.X].paintIcon(mastersOfDestiny, graphics, (i7 + (this.bv[i4][0].getIconWidth() / 2)) - (this.aA[this.X].getIconWidth() / 2), (i6 + (((i8 + this.bv[i4][0].getIconHeight()) - i6) / 2)) - (this.aA[this.X].getIconHeight() / 2));
                            break;
                        case 4:
                            this.aC[this.X].paintIcon(mastersOfDestiny, graphics, (i7 + (this.bv[i4][0].getIconWidth() / 2)) - (this.aC[this.X].getIconWidth() / 2), (i6 + (((i8 + this.bv[i4][0].getIconHeight()) - i6) / 2)) - (this.aC[this.X].getIconHeight() / 2));
                            break;
                    }
            }
            if (this.T < 12 || this.T <= 15) {
            }
        }
        graphics.setFont(MastersOfDestiny.z);
        graphics.setColor(Color.BLACK);
        int iconWidth2 = this.bs[i4][0].getIconWidth() / 2;
        if (this.H) {
            this.I[this.K].paintIcon(mastersOfDestiny, graphics, (i2 + iconWidth2) - (this.I[this.K].getIconWidth() / 2), (i3 - this.I[this.K].getIconHeight()) - 4);
        }
        if (this.C) {
            this.D.paintIcon(mastersOfDestiny, graphics, (i2 + iconWidth2) - (this.D.getIconWidth() / 2), (i3 - this.D.getIconHeight()) - 4);
            this.F.a(this.G, ((i2 + iconWidth2) - (this.D.getIconWidth() / 2)) + 5, ((i3 - this.D.getIconHeight()) - 4) + 10, 163, 17, MastersOfDestiny.ap, null);
            this.F.a(graphics, mastersOfDestiny);
        }
        int iconWidth3 = (i2 + iconWidth2) - (this.bI.getIconWidth() / 2);
        int height = (i3 - ((graphics.getFontMetrics().getHeight() * 3) / 4)) - this.bI.getIconHeight();
        this.bI.paintIcon(mastersOfDestiny, graphics, iconWidth3, height);
        if (this.r > 0) {
            graphics.setClip(((this.u * this.bJ.getIconWidth()) / this.r) + iconWidth3, height, this.bI.getIconWidth(), this.bI.getIconHeight());
        }
        this.bJ.paintIcon(mastersOfDestiny, graphics, 1 + iconWidth3, height + 1);
        graphics.setClip(0, 0, mastersOfDestiny.getWidth(), mastersOfDestiny.getHeight());
        if (i != this.A) {
            graphics.setColor(Color.RED);
        }
        graphics.drawString(this.l, (i2 + iconWidth2) - (graphics.getFontMetrics().stringWidth(this.l) / 2), i3);
        if (this.y != null) {
            graphics.setColor(Color.WHITE);
            graphics.setFont(MastersOfDestiny.O);
            graphics.drawString(this.y, (i2 + iconWidth2) - (MastersOfDestiny.P.stringWidth(this.y) / 2), i3 - (MastersOfDestiny.P.getHeight() / 4));
            this.bK++;
            if (this.bK > 10) {
                this.y = null;
                this.bK = 0;
            }
        }
    }
}
