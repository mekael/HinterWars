package defpackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/* renamed from: aj  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:aj.class */
public class C0010aj extends AbstractC0026e {
    private C0001aa c;
    private byte d;
    private int e;
    private int f;
    private int[][] j;
    private int k;
    private int l;
    private Dimension m;
    private Dimension n;
    private Dimension o;
    private Dimension[] p;
    private Dimension q;
    private Dimension r;
    private Dimension s;
    private int t;
    private double u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private Icon z;
    private Icon A;
    private Icon B;
    private Icon C;
    private Icon D;
    private Icon E;
    private Icon[] F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private Icon R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int X;
    private boolean Y;
    private String Z;
    private int aa;
    private int ab;
    private GameStates ac;
    private int g = 0;
    private int h = 1;
    private int i = 2;
    Color a = new Color(21, 175, 195);
    Color b = new Color(153, 51, 0);

    public C0010aj(GameStates gameStates) {
        this.ac = gameStates;
    }

    @Override // defpackage.AbstractC0026e
    public void a(C0001aa c0001aa, long j) {
        this.c = c0001aa;
        this.d = (byte) 31;
        this.e = this.h;
        this.j = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int i2 = 0; i2 < 8; i2++) {
                this.j[i][i2] = this.g;
            }
        }
        this.j[3][3] = this.i;
        this.j[4][4] = this.i;
        this.j[3][4] = this.h;
        this.j[4][3] = this.h;
        this.k = 2;
        this.l = 2;
        this.p = new Dimension[9];
        this.p[0] = new Dimension(0, 0);
        this.p[1] = new Dimension(0, -1);
        this.p[2] = new Dimension(1, -1);
        this.p[3] = new Dimension(1, 0);
        this.p[4] = new Dimension(1, 1);
        this.p[5] = new Dimension(0, 1);
        this.p[6] = new Dimension(-1, 1);
        this.p[7] = new Dimension(-1, 0);
        this.p[8] = new Dimension(-1, -1);
        this.q = new Dimension(-1, -1);
        this.f = this.h;
        GameStates gameStates = this.ac;
        switch (GameStates.W) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.z = new ImageIcon(getClass().getResource(c0001aa.f("en", 1283)));
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                this.z = new ImageIcon(getClass().getResource(c0001aa.f("en", 1287)));
                break;
            case C0000a.aW /* 11 */:
            case C0000a.aX /* 12 */:
            case C0000a.aY /* 13 */:
            case C0000a.aZ /* 14 */:
            case 15:
                this.z = new ImageIcon(getClass().getResource(c0001aa.f("en", 1288)));
                break;
            case C0000a.bb /* 16 */:
            case C0000a.bc /* 17 */:
            case C0000a.bd /* 18 */:
            case C0000a.be /* 19 */:
                this.z = new ImageIcon(getClass().getResource(c0001aa.f("en", 1291)));
                break;
        }
        this.A = new ImageIcon(getClass().getResource(c0001aa.f("en", 1284)));
        this.B = new ImageIcon(getClass().getResource(c0001aa.f("en", 1285)));
        this.C = new ImageIcon(getClass().getResource(c0001aa.f("en", 1286)));
        this.D = new ImageIcon(getClass().getResource(c0001aa.f("en", 1289)));
        this.E = new ImageIcon(getClass().getResource(c0001aa.f("en", 1290)));
        this.F = new Icon[3];
        this.F[0] = new ImageIcon(getClass().getResource(c0001aa.f("en", 1224)));
        this.F[1] = new ImageIcon(getClass().getResource(c0001aa.f("en", 1223)));
        this.G = -1;
        this.H = 0;
        this.I = 0;
        this.J = c0001aa.d("en", 1351);
        this.K = c0001aa.d("en", 1352);
        this.L = c0001aa.d("en", 1353);
        this.M = c0001aa.d("en", 1354);
        this.N = c0001aa.d("en", 1355);
        this.O = c0001aa.d("en", 1356);
        this.P = c0001aa.d("en", 1357);
        this.Q = c0001aa.d("en", 1358);
        this.m = new Dimension(93, 160);
        this.n = new Dimension(280, 280);
        this.o = new Dimension(-1, -1);
        a(35);
        this.v = true;
        this.w = true;
        this.x = false;
        this.y = false;
        this.R = new ImageIcon(getClass().getResource(c0001aa.f("en", 1370)));
        this.S = c0001aa.d("en", 1371);
        this.T = c0001aa.d("en", 1372);
        this.U = c0001aa.d("en", 1373);
        this.V = c0001aa.d("en", 1374);
        this.W = c0001aa.d("en", 1375);
        this.X = c0001aa.d("en", 1376);
        this.Y = false;
        this.aa = 0;
        this.ab = 287;
    }

    @Override // defpackage.AbstractC0026e
    public int b(C0001aa c0001aa, long j) {
        return this.d;
    }

    @Override // defpackage.AbstractC0026e
    public void a(byte b) {
    }

    @Override // defpackage.AbstractC0026e
    public void a(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
        if (this.y) {
            C0032k.a("Game Pause");
            do {
            } while (System.currentTimeMillis() - System.currentTimeMillis() < 500);
            this.y = false;
        }
        this.z.paintIcon(mastersOfDestiny, graphics, 0, 0);
        if (this.q.width >= 0) {
            if (((this.q.width < 8) & (this.q.height >= 0)) && this.q.height < 8) {
                this.C.paintIcon(mastersOfDestiny, graphics, this.m.width + (this.q.width * this.t) + 1, this.m.height + (this.q.height * this.t) + 1);
            }
        }
        graphics.setFont(MastersOfDestiny.U);
        graphics.setColor(Color.white);
        graphics.drawString(this.c.f + ": " + this.l, 140, 142);
        graphics.drawString("Computer: " + this.k, 282, 142);
        if (this.f == this.i) {
            this.D.paintIcon(mastersOfDestiny, graphics, 160, 455);
        } else {
            this.E.paintIcon(mastersOfDestiny, graphics, 160, 455);
        }
        graphics.setFont(MastersOfDestiny.Y);
        if (this.f == this.e) {
            graphics.drawString("Your Turn Now", 186, 468);
        } else {
            graphics.drawString("Computer's Turn", 184, 468);
        }
        for (int i = 0; i < 8; i++) {
            for (int i2 = 0; i2 < 8; i2++) {
                if (this.j[i][i2] == this.h) {
                    this.B.paintIcon(mastersOfDestiny, graphics, (this.t * i) + this.m.width + 3, (this.t * i2) + this.m.height + 3);
                } else if (this.j[i][i2] == this.i) {
                    this.A.paintIcon(mastersOfDestiny, graphics, (this.t * i) + this.m.width + 3, (this.t * i2) + this.m.height + 3);
                }
            }
        }
        if (this.Y) {
            this.R.paintIcon(mastersOfDestiny, graphics, this.S, this.T);
            graphics.setFont(MastersOfDestiny.ac);
            graphics.setColor(new Color(13127326));
            graphics.drawString(this.Z, this.aa, this.ab);
        }
        if (this.G != -1) {
            this.F[this.G].paintIcon(mastersOfDestiny, graphics, this.H, this.I);
        }
        if (this.e != this.f) {
            this.o = g();
            if (this.o.width != -1 && this.o.height != -1) {
                this.q.width = this.o.width;
                this.q.height = this.o.height;
            }
            b();
            this.y = true;
        }
    }

    @Override // defpackage.AbstractC0026e
    public void a(int i, Object obj) {
    }

    @Override // defpackage.AbstractC0026e
    public void a(String[] strArr) {
    }

    @Override // defpackage.AbstractC0026e
    public void a() {
    }

    @Override // defpackage.AbstractC0026e
    public void a(MouseEvent mouseEvent) {
        int x = mouseEvent.getX();
        int y = mouseEvent.getY();
        if (!this.Y) {
            if (this.e == this.f) {
                this.o.width = (int) Math.floor((x - this.m.width) / this.u);
                this.o.height = (int) Math.floor((y - this.m.height) / this.u);
                if (this.o.width >= 0 && this.o.width < 8 && this.o.height >= 0 && this.o.height < 8) {
                    if (this.j[this.o.width][this.o.height] == this.g) {
                        b();
                        return;
                    }
                    return;
                }
            }
            if (mouseEvent.getX() >= this.J && mouseEvent.getX() <= this.J + this.L && mouseEvent.getY() >= this.K && mouseEvent.getY() <= this.K + this.M) {
                this.G = -1;
                this.d = (byte) 19;
                return;
            }
        } else if (mouseEvent.getX() >= this.U && mouseEvent.getX() <= this.U + this.W && mouseEvent.getY() >= this.V && mouseEvent.getY() <= this.V + this.X) {
            this.G = -1;
            h();
            this.Y = false;
        }
        if (mouseEvent.getX() < this.N || mouseEvent.getX() > this.N + this.P || mouseEvent.getY() < this.O || mouseEvent.getY() > this.O + this.Q) {
            return;
        }
        this.G = -1;
        this.d = (byte) 5;
    }

    @Override // defpackage.AbstractC0026e
    public void b(MouseEvent mouseEvent) {
        int floor = (int) Math.floor((mouseEvent.getX() - this.m.width) / this.u);
        int floor2 = (int) Math.floor((mouseEvent.getY() - this.m.height) / this.u);
        this.G = -1;
        if (this.Y) {
            if (mouseEvent.getX() >= this.U && mouseEvent.getX() <= this.U + this.W && mouseEvent.getY() >= this.V && mouseEvent.getY() <= this.V + this.X) {
                this.G = 1;
                this.H = this.U;
                this.I = this.V;
                return;
            }
        } else if (this.e == this.f && floor >= 0 && floor < 8 && floor2 >= 0 && floor2 < 8) {
            if (this.j[floor][floor2] == this.g) {
                if (c(floor, floor2)) {
                    this.q.setSize(floor, floor2);
                    return;
                } else {
                    this.q.setSize(-1, -1);
                    return;
                }
            }
            return;
        } else if (mouseEvent.getX() >= this.J && mouseEvent.getX() <= this.J + this.L && mouseEvent.getY() >= this.K && mouseEvent.getY() <= this.K + this.M) {
            this.G = 1;
            this.H = this.J;
            this.I = this.K;
            return;
        }
        if (mouseEvent.getX() < this.N || mouseEvent.getX() > this.N + this.P || mouseEvent.getY() < this.O || mouseEvent.getY() > this.O + this.Q) {
            return;
        }
        this.G = 0;
        this.H = this.N;
        this.I = this.O;
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

    public void a(int i, int i2) {
        this.m.width = i;
        this.m.height = i2;
    }

    public void b(int i, int i2) {
        this.n.width = i;
        this.n.height = i2;
    }

    public void a(int i) {
        this.t = i;
        this.u = i;
    }

    public void b() {
        boolean z = false;
        for (int i = 1; i <= 8; i++) {
            if (b(this.o, this.p[i])) {
                z = true;
                C0032k.a("reversed:true");
            }
        }
        if (z) {
            C0032k.a("Reversed");
            f();
            c();
            C0032k.a("OpponentMoved " + this.x);
        }
        e();
        if (!this.v || !this.w) {
            e();
        }
        this.x = false;
        d();
        C0032k.a("method: updateStatus 943 " + ((int) this.d));
    }

    public void c() {
        this.k = 0;
        this.l = 0;
        for (int i = 0; i < 8; i++) {
            for (int i2 = 0; i2 < 8; i2++) {
                if (this.j[i][i2] != this.g) {
                    if (this.j[i][i2] == this.i) {
                        this.k++;
                    } else if (this.j[i][i2] == this.h) {
                        this.l++;
                    }
                }
            }
        }
    }

    public void d() {
        C0032k.a("Check winner method");
        C0032k.a("White is alive " + this.v);
        C0032k.a("Black is alive " + this.w);
        if (this.k == 0) {
            this.f = this.e;
            C0032k.a("whiteScore = 0");
            this.Z = "You Win!";
            this.aa = 177;
            this.Y = true;
        } else if (this.l == 0) {
            this.f = this.e;
            C0032k.a("blackScore = 0");
            this.Z = "You Lose!";
            this.aa = 170;
            this.Y = true;
        } else if (!this.v && !this.w && this.k + this.l != 64) {
            this.f = this.e;
            C0032k.a("Both Parties are not Alive");
            if (this.k > this.l) {
                this.Z = "You Lose!";
                this.aa = 170;
                this.Y = true;
            } else if (this.k < this.l) {
                this.Z = "You Win!";
                this.aa = 177;
                this.Y = true;
            } else {
                this.Z = "Draw!";
                this.aa = 199;
                this.Y = true;
            }
        } else if (this.k + this.l == 64) {
            this.f = this.e;
            C0032k.a("the board is full");
            if (this.k > this.l) {
                this.Z = "You Lose!";
                this.aa = 170;
                this.Y = true;
            } else if (this.k < this.l) {
                this.Z = "You Win!";
                this.aa = 177;
                this.Y = true;
            } else {
                this.Z = "Draw!";
                this.aa = 199;
                this.Y = true;
            }
        }
    }

    public void e() {
        C0032k.a("Check Available Step Method");
        boolean z = false;
        int i = 0;
        loop0: while (true) {
            if (i >= 8) {
                break;
            }
            for (int i2 = 0; i2 < 8; i2++) {
                if (this.j[i][i2] == this.g && c(i, i2)) {
                    z = true;
                    a(true);
                    break loop0;
                }
            }
            i++;
        }
        if (z) {
            return;
        }
        a(false);
        f();
    }

    private void a(boolean z) {
        if (this.f == this.i) {
            this.v = z;
        } else if (this.f == this.h) {
            this.w = z;
        }
        C0032k.a("method: setAliveState 1154 " + this.v + " " + this.w);
    }

    public boolean c(int i, int i2) {
        Dimension dimension = new Dimension(i, i2);
        for (int i3 = 1; i3 <= 8; i3++) {
            if (a(dimension, this.p[i3])) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(Dimension dimension, Dimension dimension2) {
        int i = dimension.width + dimension2.width;
        int i2 = dimension.height + dimension2.height;
        if (i2 > 7 || i2 < 0 || i < 0 || i > 7 || this.j[i][i2] == this.g || this.j[i][i2] == this.f) {
            return false;
        }
        int i3 = i;
        int i4 = i2;
        while (this.j[i3][i4] != this.f) {
            i3 += dimension2.width;
            i4 += dimension2.height;
            if (i3 > 7 || i3 < 0 || i4 < 0 || i4 > 7 || this.j[i3][i4] == this.g) {
                return false;
            }
            while (this.j[i3][i4] != this.f) {
            }
        }
        return true;
    }

    public void f() {
        C0032k.a("method: reverseturn 1227");
        if (this.f == this.i) {
            this.f = this.h;
        } else if (this.f == this.h) {
            this.f = this.i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b(Dimension dimension, Dimension dimension2) {
        int i = dimension.width + dimension2.width;
        int i2 = dimension.height + dimension2.height;
        if ((dimension.width == -1 && dimension.height == -1) || i2 > 7 || i2 < 0 || i < 0 || i > 7 || this.j[i][i2] == this.f || this.j[i][i2] == this.g) {
            return false;
        }
        while (this.j[i][i2] != this.f) {
            i += dimension2.width;
            i2 += dimension2.height;
            if (i > 7 || i < 0 || i2 < 0 || i2 > 7 || this.j[i][i2] == this.g) {
                return false;
            }
            while (this.j[i][i2] != this.f) {
            }
        }
        int i3 = dimension.width;
        int i4 = dimension.height;
        while (true) {
            int i5 = i4;
            if (i3 == i && i5 == i2) {
                return true;
            }
            this.j[i3][i5] = this.f;
            i3 += dimension2.width;
            i4 = i5 + dimension2.height;
        }
    }

    public Dimension g() {
        int d;
        int d2;
        int d3;
        int d4;
        int d5;
        int d6;
        int i = 0;
        Dimension dimension = new Dimension(-1, -1);
        if (c(0, 0) && this.j[0][0] == this.g) {
            i = d(0, 0);
            dimension = new Dimension(0, 0);
        }
        if (c(0, 7) && this.j[0][7] == this.g && (d6 = d(0, 7)) > i) {
            i = d6;
            dimension = new Dimension(0, 7);
        }
        if (c(7, 7) && this.j[7][7] == this.g && (d5 = d(7, 7)) > i) {
            i = d5;
            dimension = new Dimension(7, 7);
        }
        if (c(7, 0) && this.j[7][0] == this.g && (d4 = d(7, 0)) > i) {
            i = d4;
            dimension = new Dimension(7, 0);
        }
        if (i != 0) {
            C0032k.a("(" + dimension.width + ", " + dimension.height + ")");
            return dimension;
        }
        for (int i2 = 2; i2 < 6; i2++) {
            for (int i3 = 0; i3 < 1; i3++) {
                if (c(i2, i3) && this.j[i2][i3] == this.g) {
                    C0032k.a("1110");
                    int d7 = d(i2, i3);
                    if (d7 > i) {
                        i = d7;
                        dimension = new Dimension(i2, i3);
                    }
                }
            }
        }
        for (int i4 = 2; i4 < 6; i4++) {
            for (int i5 = 7; i5 < 8; i5++) {
                if (c(i4, i5) && this.j[i4][i5] == this.g && (d3 = d(i4, i5)) > i) {
                    i = d3;
                    dimension = new Dimension(i4, i5);
                }
            }
        }
        for (int i6 = 0; i6 < 1; i6++) {
            for (int i7 = 2; i7 < 6; i7++) {
                if (c(i6, i7) && this.j[i6][i7] == this.g && (d2 = d(i6, i7)) > i) {
                    i = d2;
                    dimension = new Dimension(i6, i7);
                }
            }
        }
        for (int i8 = 7; i8 < 8; i8++) {
            for (int i9 = 2; i9 < 6; i9++) {
                if (c(i8, i9) && this.j[i8][i9] == this.g && (d = d(i8, i9)) > i) {
                    i = d;
                    dimension = new Dimension(i8, i9);
                }
            }
        }
        if (i != 0) {
            C0032k.a("(" + dimension.width + ", " + dimension.height + ")");
            return dimension;
        }
        for (int i10 = 0; i10 < 8; i10++) {
            for (int i11 = 0; i11 < 8; i11++) {
                int d8 = d(i10, i11);
                if (this.j[i10][i11] == this.g && d8 > i) {
                    i = d8;
                    dimension = new Dimension(i10, i11);
                }
            }
        }
        C0032k.a("(" + dimension.width + ", " + dimension.height + ")");
        return dimension;
    }

    public int d(int i, int i2) {
        Dimension dimension = new Dimension(i, i2);
        int i3 = 0;
        for (int i4 = 1; i4 <= 8; i4++) {
            i3 += c(dimension, this.p[i4]);
        }
        if (i3 > 0 && this.j[i][i2] == this.g) {
            C0032k.a("(" + i + ", " + i2 + "): " + i3);
        }
        return i3;
    }

    public int c(Dimension dimension, Dimension dimension2) {
        int i = dimension.width + dimension2.width;
        int i2 = dimension.height + dimension2.height;
        if (i2 > 7 || i2 < 0 || i < 0 || i > 7 || this.j[i][i2] == this.g || this.j[i][i2] == this.f) {
            return 0;
        }
        int i3 = i;
        int i4 = i2;
        int i5 = 0;
        while (this.j[i3][i4] != this.f) {
            i3 += dimension2.width;
            i4 += dimension2.height;
            if (i3 > 7 || i3 < 0 || i4 < 0 || i4 > 7 || this.j[i3][i4] == this.g) {
                return 0;
            }
            i5++;
        }
        return i5;
    }

    public void h() {
        C0032k.a("method: reset 1712");
        for (int i = 0; i < 8; i++) {
            for (int i2 = 0; i2 < 8; i2++) {
                this.j[i][i2] = this.g;
            }
        }
        this.j[3][3] = this.i;
        this.j[4][4] = this.i;
        this.j[3][4] = this.h;
        this.j[4][3] = this.h;
        this.f = this.h;
        this.k = 2;
        this.l = 2;
    }
}
