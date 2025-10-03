

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/* renamed from: x  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:x.class */
public class C0043x extends AbstractC0026e {
    private C0001aa k;
    private byte l;
    private int m = 0;
    private int n = 1;
    private int o = 2;
    private int p;
    private int q;
    private int r;
    private int[][] s;
    private Dimension t;
    private Dimension u;
    private Dimension v;
    private Dimension[] w;
    private Dimension x;
    private Dimension y;
    private Dimension z;
    private Dimension A;
    private int B;
    private double C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private Icon H;
    private Icon I;
    private Icon J;
    private Icon K;
    private Icon L;
    private Icon M;
    private Icon N;
    private Icon[] O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int X;
    private int Y;
    private int Z;
    private int aa;
    private int ab;
    private Icon ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private int ai;
    private boolean aj;
    private String ak;
    private int al;
    private int am;
    private GameStates an;
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 30;
    public static final int[] j = {10000, 1000, 150, 0, 75, 40, 0, 20, 10, 0, 3, 1, 0, 300, 100, 250, 150, 70, 40, 45, 0, 175, 160, 150};

    public C0043x(GameStates gameStates) {
        this.an = gameStates;
    }

    @Override // defpackage.AbstractC0026e
    public void a(C0001aa c0001aa, long j2) {
        this.k = c0001aa;
        this.l = (byte) 32;
        this.s = new int[15][15];
        for (int i2 = 0; i2 < 15; i2++) {
            for (int i3 = 0; i3 < 15; i3++) {
                this.s[i2][i3] = this.m;
            }
        }
        this.t = new Dimension(97, 165);
        this.u = new Dimension(270, 270);
        this.v = new Dimension(-1, -1);
        this.z = new Dimension(-1, -1);
        this.A = new Dimension(-1, -1);
        a(18);
        this.r = 0;
        this.w = new Dimension[5];
        this.w[0] = new Dimension(0, 0);
        this.w[1] = new Dimension(1, 0);
        this.w[2] = new Dimension(1, 1);
        this.w[3] = new Dimension(0, 1);
        this.w[4] = new Dimension(-1, 1);
        this.q = this.n;
        this.p = this.n;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = true;
        GameStates gameStates = this.an;
        switch (GameStates.W) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.H = new ImageIcon(getClass().getResource(c0001aa.f("en", 1292)));
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                this.H = new ImageIcon(getClass().getResource(c0001aa.f("en", 1295)));
                break;
            case C0000a.aW /* 11 */:
            case C0000a.aX /* 12 */:
            case C0000a.aY /* 13 */:
            case C0000a.aZ /* 14 */:
            case 15:
                this.H = new ImageIcon(getClass().getResource(c0001aa.f("en", 1297)));
                break;
            case C0000a.bb /* 16 */:
            case C0000a.bc /* 17 */:
            case C0000a.bd /* 18 */:
            case C0000a.be /* 19 */:
                this.H = new ImageIcon(getClass().getResource(c0001aa.f("en", 1296)));
                break;
        }
        this.I = new ImageIcon(getClass().getResource(c0001aa.f("en", 1293)));
        this.J = new ImageIcon(getClass().getResource(c0001aa.f("en", 1294)));
        this.K = new ImageIcon(getClass().getResource(c0001aa.f("en", 1293)));
        this.L = new ImageIcon(getClass().getResource(c0001aa.f("en", 1294)));
        this.M = new ImageIcon(getClass().getResource(c0001aa.f("en", 1293)));
        this.N = new ImageIcon(getClass().getResource(c0001aa.f("en", 1294)));
        this.O = new Icon[2];
        this.O[0] = new ImageIcon(getClass().getResource(c0001aa.f("en", 1224)));
        this.O[1] = new ImageIcon(getClass().getResource(c0001aa.f("en", 1223)));
        this.P = -1;
        this.Q = 0;
        this.R = 0;
        this.U = c0001aa.d("en", 1359);
        this.V = c0001aa.d("en", 1360);
        this.S = c0001aa.d("en", 1361);
        this.T = c0001aa.d("en", 1362);
        this.W = c0001aa.d("en", 1363);
        this.X = c0001aa.d("en", 1364);
        this.Y = c0001aa.d("en", 1355);
        this.Z = c0001aa.d("en", 1356);
        this.aa = c0001aa.d("en", 1357);
        this.ab = c0001aa.d("en", 1358);
        this.ac = new ImageIcon(getClass().getResource(c0001aa.f("en", 1370)));
        this.ad = c0001aa.d("en", 1371);
        this.ae = c0001aa.d("en", 1372);
        this.af = c0001aa.d("en", 1373);
        this.ag = c0001aa.d("en", 1374);
        this.ah = c0001aa.d("en", 1375);
        this.ai = c0001aa.d("en", 1376);
        this.aj = false;
        this.al = 0;
        this.am = 287;
    }

    @Override // defpackage.AbstractC0026e
    public int b(C0001aa c0001aa, long j2) {
        return this.l;
    }

    @Override // defpackage.AbstractC0026e
    public void a(byte b2) {
    }

    @Override // defpackage.AbstractC0026e
    public void a(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
        if (this.E) {
            C0032k.a("Game Pause");
            do {
            } while (System.currentTimeMillis() - System.currentTimeMillis() < 500);
            this.E = false;
        }
        this.H.paintIcon(mastersOfDestiny, graphics, 0, 0);
        graphics.setFont(MastersOfDestiny.U);
        graphics.setColor(Color.white);
        if (this.p == this.o) {
            this.K.paintIcon(mastersOfDestiny, graphics, 119, 129);
            this.L.paintIcon(mastersOfDestiny, graphics, 259, 129);
        } else {
            this.L.paintIcon(mastersOfDestiny, graphics, 119, 129);
            this.K.paintIcon(mastersOfDestiny, graphics, 259, 129);
        }
        graphics.drawString("-  " + this.k.f, 143, 142);
        graphics.drawString("-  Computer", 279, 142);
        if (this.q == this.o) {
            this.M.paintIcon(mastersOfDestiny, graphics, 166, 455);
        } else {
            this.N.paintIcon(mastersOfDestiny, graphics, 166, 455);
        }
        if (this.q == this.p) {
            graphics.drawString("Your Turn Now", 191, 469);
        } else {
            graphics.drawString("Computer's Turn", 189, 469);
        }
        for (int i2 = 0; i2 < 15; i2++) {
            for (int i3 = 0; i3 < 15; i3++) {
                if (this.s[i2][i3] == this.n) {
                    this.J.paintIcon(mastersOfDestiny, graphics, (this.B * i2) + this.t.width + 3, (this.B * i3) + this.t.height + 1);
                } else if (this.s[i2][i3] == this.o) {
                    this.I.paintIcon(mastersOfDestiny, graphics, (this.B * i2) + this.t.width + 3, (this.B * i3) + this.t.height + 1);
                }
            }
        }
        if (this.aj) {
            this.ac.paintIcon(mastersOfDestiny, graphics, this.ad, this.ae);
            graphics.setFont(MastersOfDestiny.ac);
            graphics.setColor(new Color(13127326));
            graphics.drawString(this.ak, this.al, this.am);
        }
        if (this.P != -1) {
            this.O[this.P].paintIcon(mastersOfDestiny, graphics, this.Q, this.R);
        }
        if (this.p != this.q) {
            this.v = d();
            this.A.width = this.v.width;
            this.A.height = this.v.height;
            b();
            this.E = true;
        }
    }

    @Override // defpackage.AbstractC0026e
    public void a(int i2, Object obj) {
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
        if (!this.aj) {
            if (this.p == this.q) {
                this.v.width = (int) Math.floor((x - this.t.width) / this.C);
                this.v.height = (int) Math.floor((y - this.t.height) / this.C);
                if (this.v.width >= 0 && this.v.width < 15 && this.v.height >= 0 && this.v.height < 15) {
                    if (this.s[this.v.width][this.v.height] == this.m) {
                        this.z.width = this.v.width;
                        this.z.height = this.v.height;
                        b();
                        return;
                    }
                    return;
                }
            }
            if (!this.G && mouseEvent.getX() >= this.S && mouseEvent.getX() <= this.S + this.W && mouseEvent.getY() >= this.T && mouseEvent.getY() <= this.T + this.X) {
                this.s[this.z.width][this.z.height] = this.m;
                this.r--;
                this.s[this.A.width][this.A.height] = this.m;
                this.r--;
                return;
            } else if (mouseEvent.getX() >= this.U && mouseEvent.getX() <= this.U + this.W && mouseEvent.getY() >= this.V && mouseEvent.getY() <= this.V + this.X) {
                this.P = -1;
                this.l = (byte) 19;
                return;
            }
        } else if (mouseEvent.getX() >= this.af && mouseEvent.getX() <= this.af + this.ah && mouseEvent.getY() >= this.ag && mouseEvent.getY() <= this.ag + this.ai) {
            this.P = -1;
            g();
            f();
            this.aj = false;
        }
        if (mouseEvent.getX() < this.Y || mouseEvent.getX() > this.Y + this.aa || mouseEvent.getY() < this.Z || mouseEvent.getY() > this.Z + this.ab) {
            return;
        }
        this.P = -1;
        this.l = (byte) 5;
    }

    @Override // defpackage.AbstractC0026e
    public void b(MouseEvent mouseEvent) {
        this.P = -1;
        if (this.aj) {
            if (mouseEvent.getX() >= this.af && mouseEvent.getX() <= this.af + this.ah && mouseEvent.getY() >= this.ag && mouseEvent.getY() <= this.ag + this.ai) {
                this.P = 1;
                this.Q = this.af;
                this.R = this.ag;
                return;
            }
        } else if (!this.G && mouseEvent.getX() >= this.S && mouseEvent.getX() <= this.S + this.W && mouseEvent.getY() >= this.T && mouseEvent.getY() <= this.T + this.X) {
            this.P = 1;
            this.Q = this.S;
            this.R = this.T;
            return;
        } else if (mouseEvent.getX() >= this.U && mouseEvent.getX() <= this.U + this.W && mouseEvent.getY() >= this.V && mouseEvent.getY() <= this.V + this.X) {
            this.P = 1;
            this.Q = this.U;
            this.R = this.V;
            return;
        }
        if (mouseEvent.getX() < this.Y || mouseEvent.getX() > this.Y + this.aa || mouseEvent.getY() < this.Z || mouseEvent.getY() > this.Z + this.ab) {
            return;
        }
        this.P = 0;
        this.Q = this.Y;
        this.R = this.Z;
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

    public void a(int i2, int i3) {
        this.t.width = i2;
        this.t.height = i3;
    }

    public void b(int i2, int i3) {
        this.u.width = i2;
        this.u.height = i3;
    }

    public void a(int i2) {
        this.B = i2;
        this.C = i2;
    }

    public void b() {
        this.s[this.v.width][this.v.height] = this.q;
        this.r++;
        this.D = false;
        if (c()) {
            return;
        }
        e();
    }

    public boolean c() {
        if (this.r == 225) {
            this.q = this.p;
            this.ak = "Draw!";
            this.al = 199;
            this.aj = true;
            return true;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            if (a(this.v, this.w[i2], this.q) >= 5) {
                if (this.q == this.n) {
                    this.q = this.p;
                    if (this.p == this.n) {
                        this.ak = "You Win!";
                        this.al = 177;
                        this.aj = true;
                        return true;
                    }
                    this.ak = "You Lose!";
                    this.al = 170;
                    this.aj = true;
                    return true;
                } else if (this.q == this.o) {
                    this.q = this.p;
                    if (this.p == this.o) {
                        this.ak = "You Win!";
                        this.al = 177;
                        this.aj = true;
                        return true;
                    }
                    this.ak = "You Lose!";
                    this.al = 170;
                    this.aj = true;
                    return true;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public int a(int i2, int i3, int i4, int i5, int i6) {
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        switch (i5) {
            case 0:
                i7 = 0;
                i8 = -1;
                break;
            case 1:
                i7 = 1;
                i8 = -1;
                break;
            case 2:
                i7 = 1;
                i8 = 0;
                break;
            case 3:
                i7 = 1;
                i8 = 1;
                break;
            case 4:
                i7 = 0;
                i8 = 1;
                break;
            case 5:
                i7 = -1;
                i8 = 1;
                break;
            case 6:
                i7 = -1;
                i8 = 0;
                break;
            case 7:
                i7 = -1;
                i8 = -1;
                break;
        }
        if (i6 == 1) {
            do {
                i3 += i7;
                i4 += i8;
                if (i3 >= 15 || i4 >= 15 || i3 < 0 || i4 < 0) {
                    i9 = 0;
                } else if (this.s[i3][i4] == i2) {
                    i9++;
                }
            } while (this.s[i3][i4] == i2);
        } else if (i6 == 2) {
            i9 = 1;
            do {
                i3 += i7;
                i4 += i8;
                if (i3 >= 15 || i4 >= 15 || i3 < 0 || i4 < 0) {
                    i9 = 0;
                } else if (this.s[i3][i4] != this.m) {
                    i9++;
                }
            } while (this.s[i3][i4] != this.m);
        }
        return i9;
    }

    public int a(int i2, int i3, int i4, int i5) {
        int i6 = 0;
        int i7 = 0;
        switch (i5) {
            case 0:
                i6 = 0;
                i7 = -1;
                break;
            case 1:
                i6 = 1;
                i7 = -1;
                break;
            case 2:
                i6 = 1;
                i7 = 0;
                break;
            case 3:
                i6 = 1;
                i7 = 1;
                break;
            case 4:
                i6 = 0;
                i7 = 1;
                break;
            case 5:
                i6 = -1;
                i7 = 1;
                break;
            case 6:
                i6 = -1;
                i7 = 0;
                break;
            case 7:
                i6 = -1;
                i7 = -1;
                break;
        }
        while (i4 > 0) {
            i2 += i6;
            i3 += i7;
            if (i2 >= 15 || i3 >= 15 || i2 < 0 || i3 < 0) {
                return -1;
            }
            i4--;
        }
        return this.s[i2][i3];
    }

    public Dimension d() {
        if (this.F) {
            this.F = false;
            return new Dimension(7, 7);
        }
        int i2 = 0;
        int i3 = 0;
        int[] iArr = new int[4];
        iArr[0] = -1;
        iArr[1] = -1;
        iArr[2] = -1;
        iArr[3] = -1;
        int[] iArr2 = new int[4];
        iArr2[0] = -1;
        iArr2[1] = -1;
        iArr2[2] = -1;
        iArr2[3] = -1;
        int i4 = 0;
        int i5 = 0;
        Dimension dimension = new Dimension();
        Dimension dimension2 = new Dimension();
        int i6 = 0;
        int i7 = 0;
        int[][] iArr3 = new int[15][15];
        int[][] iArr4 = new int[15][15];
        for (int i8 = 0; i8 < 15; i8++) {
            for (int i9 = 0; i9 < 15; i9++) {
                iArr3[i8][i9] = -1;
                iArr4[i8][i9] = -1;
                if (this.s[i8][i9] == this.m) {
                    iArr3[i8][i9] = 0;
                    iArr4[i8][i9] = 0;
                    for (int i10 = 0; i10 <= 3; i10++) {
                        switch (i10) {
                            case 0:
                                i6 = 0;
                                i7 = -1;
                                break;
                            case 1:
                                i6 = 1;
                                i7 = -1;
                                break;
                            case 2:
                                i6 = 1;
                                i7 = 0;
                                break;
                            case 3:
                                i6 = 1;
                                i7 = 1;
                                break;
                            case 4:
                                i6 = 0;
                                i7 = 1;
                                break;
                            case 5:
                                i6 = -1;
                                i7 = 1;
                                break;
                            case 6:
                                i6 = -1;
                                i7 = 0;
                                break;
                            case 7:
                                i6 = -1;
                                i7 = -1;
                                break;
                        }
                        iArr[i10] = -1;
                        iArr2[i10] = -1;
                        int a2 = a(3 - this.p, i8, i9, i10, 1);
                        int a3 = a(3 - this.p, i8, i9, (i10 + 4) % 8, 1);
                        int a4 = a(this.p, i8, i9, i10, 1);
                        int a5 = a(this.p, i8, i9, (i10 + 4) % 8, 1);
                        int a6 = a(3 - this.p, i8, i9, i10, 2);
                        int a7 = a(3 - this.p, i8, i9, (i10 + 4) % 8, 2);
                        switch (a2 + a3) {
                            case 0:
                                if (a6 != 1 || a7 != 1) {
                                    if (a6 != 1 && a7 != 1) {
                                        iArr[i10] = 12;
                                        break;
                                    } else if (a6 == 1) {
                                        int a8 = a(3 - this.p, i8 + (a6 * i6), i9 + (a6 * i7), i10, 1);
                                        if (a8 == 3) {
                                            if (a(i8, i9, 5, i10) == this.p) {
                                                iArr[i10] = 16;
                                                break;
                                            } else {
                                                iArr[i10] = 15;
                                                break;
                                            }
                                        } else if (a8 == 2) {
                                            if (a(i8, i9, 4, i10) == this.p) {
                                                iArr[i10] = 20;
                                                break;
                                            } else {
                                                iArr[i10] = 19;
                                                break;
                                            }
                                        } else {
                                            iArr[i10] = 11;
                                            break;
                                        }
                                    } else {
                                        int a9 = a(3 - this.p, i8 - (a7 * i6), i9 - (a7 * i7), (i10 + 4) % 8, 1);
                                        if (a9 == 3) {
                                            if (a(i8, i9, 5, (i10 + 4) % 8) == this.p) {
                                                iArr[i10] = 16;
                                                break;
                                            } else {
                                                iArr[i10] = 15;
                                                break;
                                            }
                                        } else if (a9 == 2) {
                                            if (a(i8, i9, 4, (i10 + 4) % 8) == this.p) {
                                                iArr[i10] = 20;
                                                break;
                                            } else {
                                                iArr[i10] = 19;
                                                break;
                                            }
                                        } else {
                                            iArr[i10] = 11;
                                            break;
                                        }
                                    }
                                } else {
                                    int a10 = a(3 - this.p, i8 + (a6 * i6), i9 + (a6 * i7), i10, 1);
                                    int a11 = a(3 - this.p, i8 - (a7 * i6), i9 - (a7 * i7), (i10 + 4) % 8, 1);
                                    if (a10 == 3) {
                                        if (a(i8, i9, 5, i10) == this.p) {
                                            iArr[i10] = 14;
                                            break;
                                        } else {
                                            iArr[i10] = 13;
                                            break;
                                        }
                                    } else if (a11 == 3) {
                                        if (a(i8, i9, 5, (i10 + 4) % 8) == this.p) {
                                            iArr[i10] = 14;
                                            break;
                                        } else {
                                            iArr[i10] = 13;
                                            break;
                                        }
                                    } else if (a10 == 2) {
                                        if (a(i8, i9, 4, i10) == this.p) {
                                            iArr[i10] = 18;
                                            break;
                                        } else {
                                            iArr[i10] = 17;
                                            break;
                                        }
                                    } else if (a11 == 2) {
                                        if (a(i8, i9, 4, (i10 + 4) % 8) == this.p) {
                                            iArr[i10] = 18;
                                            break;
                                        } else {
                                            iArr[i10] = 17;
                                            break;
                                        }
                                    } else {
                                        iArr[i10] = 10;
                                        break;
                                    }
                                }
                                break;
                            case 1:
                                if (a6 != a2 + 1 || a7 != a3 + 1) {
                                    if (a6 != a2 + 1 && a7 != a3 + 1) {
                                        iArr[i10] = 9;
                                        break;
                                    } else {
                                        iArr[i10] = 8;
                                        break;
                                    }
                                } else {
                                    iArr[i10] = 7;
                                    break;
                                }
                                break;
                            case 2:
                                if (a6 != a2 + 1 || a7 != a3 + 1) {
                                    if (a6 != a2 + 1 && a7 != a3 + 1) {
                                        iArr[i10] = 6;
                                        break;
                                    } else {
                                        iArr[i10] = 5;
                                        break;
                                    }
                                } else {
                                    iArr[i10] = 4;
                                    break;
                                }
                                break;
                            case 3:
                                if (a6 != a2 + 1 || a7 != a3 + 1) {
                                    if (a6 != a2 + 1 && a7 != a3 + 1) {
                                        iArr[i10] = 3;
                                        break;
                                    } else {
                                        iArr[i10] = 2;
                                        break;
                                    }
                                } else {
                                    iArr[i10] = 1;
                                    break;
                                }
                                break;
                            default:
                                iArr[i10] = 0;
                                break;
                        }
                        int[] iArr5 = iArr3[i8];
                        int i11 = i9;
                        iArr5[i11] = iArr5[i11] + j[iArr[i10]];
                        switch (a4 + a5) {
                            case 0:
                                if (a6 != 1 || a7 != 1) {
                                    if (a6 != 1 && a7 != 1) {
                                        iArr2[i10] = 12;
                                        break;
                                    } else if (a6 == 1) {
                                        int a12 = a(this.p, i8 + (a6 * i6), i9 + (a6 * i7), i10, 1);
                                        if (a12 == 3) {
                                            if (a(i8, i9, 5, i10) == 3 - this.p) {
                                                iArr2[i10] = 16;
                                                break;
                                            } else {
                                                iArr2[i10] = 15;
                                                break;
                                            }
                                        } else if (a12 == 2) {
                                            if (a(i8, i9, 4, i10) == 3 - this.p) {
                                                iArr2[i10] = 20;
                                                break;
                                            } else {
                                                iArr2[i10] = 19;
                                                break;
                                            }
                                        } else {
                                            iArr2[i10] = 11;
                                            break;
                                        }
                                    } else {
                                        int a13 = a(this.p, i8 - (a7 * i6), i9 - (a7 * i7), (i10 + 4) % 8, 1);
                                        if (a13 == 3) {
                                            if (a(i8, i9, 5, (i10 + 4) % 8) == 3 - this.p) {
                                                iArr2[i10] = 16;
                                                break;
                                            } else {
                                                iArr2[i10] = 15;
                                                break;
                                            }
                                        } else if (a13 == 2) {
                                            if (a(i8, i9, 4, (i10 + 4) % 8) == 3 - this.p) {
                                                iArr2[i10] = 20;
                                                break;
                                            } else {
                                                iArr2[i10] = 19;
                                                break;
                                            }
                                        } else {
                                            iArr2[i10] = 11;
                                            break;
                                        }
                                    }
                                } else {
                                    int a14 = a(this.p, i8 + (a6 * i6), i9 + (a6 * i7), i10, 1);
                                    int a15 = a(this.p, i8 - (a7 * i6), i9 - (a7 * i7), (i10 + 4) % 8, 1);
                                    if (a14 == 3) {
                                        if (a(i8, i9, 5, i10) == 3 - this.p) {
                                            iArr2[i10] = 14;
                                            break;
                                        } else {
                                            iArr2[i10] = 13;
                                            break;
                                        }
                                    } else if (a15 == 3) {
                                        if (a(i8, i9, 5, (i10 + 4) % 8) == 3 - this.p) {
                                            iArr2[i10] = 14;
                                            break;
                                        } else {
                                            iArr2[i10] = 13;
                                            break;
                                        }
                                    } else if (a14 == 2) {
                                        if (a(i8, i9, 4, i10) == 3 - this.p) {
                                            iArr2[i10] = 18;
                                            break;
                                        } else {
                                            iArr2[i10] = 17;
                                            break;
                                        }
                                    } else if (a15 == 2) {
                                        if (a(i8, i9, 4, (i10 + 4) % 8) == 3 - this.p) {
                                            iArr2[i10] = 18;
                                            break;
                                        } else {
                                            iArr2[i10] = 17;
                                            break;
                                        }
                                    } else {
                                        iArr2[i10] = 10;
                                        break;
                                    }
                                }
                                break;
                            case 1:
                                if (a6 != a4 + 1 || a7 != a5 + 1) {
                                    if (a6 != a4 + 1 && a7 != a5 + 1) {
                                        iArr2[i10] = 9;
                                        break;
                                    } else {
                                        iArr2[i10] = 8;
                                        break;
                                    }
                                } else {
                                    iArr2[i10] = 7;
                                    break;
                                }
                                break;
                            case 2:
                                if (a6 != a4 + 1 || a7 != a5 + 1) {
                                    if (a6 != a4 + 1 && a7 != a5 + 1) {
                                        iArr2[i10] = 6;
                                        break;
                                    } else {
                                        iArr2[i10] = 5;
                                        break;
                                    }
                                } else {
                                    iArr2[i10] = 4;
                                    break;
                                }
                                break;
                            case 3:
                                if (a6 != a4 + 1 || a7 != a5 + 1) {
                                    if (a6 != a4 + 1 && a7 != a5 + 1) {
                                        iArr2[i10] = 3;
                                        break;
                                    } else {
                                        iArr2[i10] = 2;
                                        break;
                                    }
                                } else {
                                    iArr2[i10] = 1;
                                    break;
                                }
                                break;
                            default:
                                iArr2[i10] = 0;
                                break;
                        }
                        int[] iArr6 = iArr4[i8];
                        int i12 = i9;
                        iArr6[i12] = iArr6[i12] + j[iArr2[i10]];
                        if (i10 == 3) {
                            int[] iArr7 = iArr3[i8];
                            int i13 = i9;
                            iArr7[i13] = iArr7[i13] + a(iArr);
                            i4 += iArr3[i8][i9];
                            int[] iArr8 = iArr4[i8];
                            int i14 = i9;
                            iArr8[i14] = iArr8[i14] + a(iArr2);
                            i5 += iArr4[i8][i9];
                            if (i2 < iArr3[i8][i9]) {
                                dimension.width = i8;
                                dimension.height = i9;
                                i2 = iArr3[i8][i9];
                            }
                            if (i3 < iArr4[i8][i9]) {
                                dimension2.width = i8;
                                dimension2.height = i9;
                                i3 = iArr4[i8][i9];
                            }
                        }
                    }
                }
            }
        }
        C0032k.a("Computer's value gameGrids: ");
        for (int i15 = 0; i15 < 15; i15++) {
            for (int i16 = 0; i16 < 15; i16++) {
                C0032k.a(iArr3[i16][i15] + "  ");
            }
        }
        C0032k.a("\nPlayer's value gameGrids: ");
        for (int i17 = 0; i17 < 15; i17++) {
            for (int i18 = 0; i18 < 15; i18++) {
                C0032k.a(iArr4[i18][i17] + "  ");
            }
        }
        C0032k.a("My overall power: " + i4);
        C0032k.a("Oppo overall power: " + i5);
        if (iArr3[dimension.width][dimension.height] + (i4 >= i5 ? 30 : 5) >= iArr4[dimension2.width][dimension2.height]) {
            C0032k.a("Point (" + dimension + ") ");
            return dimension;
        }
        C0032k.a("Point (" + dimension2 + ") ");
        return dimension2;
    }

    private int a(int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            i2 += j[iArr[i3]];
        }
        if (i2 > j[4] * 1.5d) {
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < 4; i6++) {
                if (iArr[i6] == 4 || iArr[i6] == 17) {
                    i4++;
                } else if (iArr[i6] == 2 || iArr[i6] == 14 || iArr[i6] == 15 || iArr[i6] == 16) {
                    i5++;
                }
            }
            if (i4 > 0 && i5 > 0) {
                C0032k.a("4-3!!!!");
                return 500;
            } else if (i4 > 1) {
                C0032k.a("3-3!!!!");
                return 300;
            } else if (i5 > 1) {
                C0032k.a("4-4!!!!");
                return 600;
            } else {
                return 0;
            }
        }
        return 0;
    }

    public int a(Dimension dimension, Dimension dimension2, int i2) {
        int i3 = 1;
        int i4 = dimension.width + dimension2.width;
        int i5 = dimension.height;
        int i6 = dimension2.height;
        while (true) {
            int i7 = i5 + i6;
            if (i4 <= -1 || i7 <= -1 || i4 >= 15 || i7 >= 15 || this.s[i4][i7] != i2) {
                break;
            }
            i3++;
            i4 += dimension2.width;
            i5 = i7;
            i6 = dimension2.height;
        }
        int i8 = dimension.width - dimension2.width;
        int i9 = dimension.height;
        int i10 = dimension2.height;
        while (true) {
            int i11 = i9 - i10;
            if (i8 < 0 || i11 < 0 || i8 >= 15 || i11 >= 15 || this.s[i8][i11] != i2) {
                break;
            }
            i3++;
            i8 -= dimension2.width;
            i9 = i11;
            i10 = dimension2.height;
        }
        return i3;
    }

    public void e() {
        if (this.q == this.o) {
            this.q = this.n;
        } else if (this.q == this.n) {
            this.q = this.o;
        }
        if (this.p == this.q) {
            this.G = false;
        } else {
            this.G = true;
        }
    }

    public void f() {
        this.p = 3 - this.p;
        if (this.p == this.o) {
            this.F = true;
        }
    }

    public void g() {
        C0032k.a("method: reset 1712");
        for (int i2 = 0; i2 < 15; i2++) {
            for (int i3 = 0; i3 < 15; i3++) {
                this.s[i2][i3] = this.m;
            }
        }
        this.q = this.n;
        this.r = 0;
        this.G = true;
    }
}
