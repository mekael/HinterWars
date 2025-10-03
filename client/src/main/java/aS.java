package defpackage;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/* renamed from: aS  reason: default package */
/* loaded from: hinterwars.jar:aS.class */
public class aS extends A {
    private int bO;
    private int bP;
    private Icon bQ;
    private Icon bR;
    private Icon bS;
    private Icon bT;
    private int bU;
    private int bV;
    private int bW;
    private int bX;
    private final byte a = 0;
    private final byte b = 1;
    private final byte bx = 2;
    private final byte by = 3;
    private final byte bz = 4;
    private final byte bA = 5;
    private final byte bB = 6;
    private final byte bC = 7;
    private final byte bD = 8;
    private final byte bE = 9;
    private final byte bF = 10;
    private final byte bG = 11;
    private final byte bH = 12;
    private final byte bI = 13;
    private final byte bJ = 14;
    private final byte bK = 15;
    private final byte bL = 16;
    private final byte bM = 17;
    private int[][] bY = new int[1][9];
    private Icon[][] bN = new Icon[16][4];

    public aS(long j, long j2, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        this.p = j2;
        this.P = i;
        this.Q = i2;
        this.R = i3;
        this.S = i4;
        this.N = i3;
        this.O = i4;
        this.T = i5;
        this.A = i6;
        this.o = C0028g.M;
        b(C0012al.a(str).a(j));
        this.bY[0][4] = 3;
        this.bY[0][5] = 3;
        this.bY[0][6] = 3;
        this.bY[0][7] = 2;
        this.bY[0][8] = 4;
        this.bU = 0;
        this.y = null;
        C0032k.a("create new monster");
        super.a(this.bY);
    }

    private void b(String str) {
        this.bV = 0;
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '\n') {
                a(str.substring(i, i2 - 1), this.bV);
                this.bV++;
                i = i2 + 1;
            }
        }
    }

    private void a(String str, int i) {
        switch (i) {
            case 0:
                this.l = str;
                return;
            case 1:
                this.t = Integer.parseInt(str);
                return;
            case 2:
                this.u = Integer.parseInt(str);
                this.r = Integer.parseInt(str);
                return;
            case 3:
                this.v = Integer.parseInt(str);
                this.s = Integer.parseInt(str);
                return;
            case 4:
                this.w = Integer.parseInt(str);
                return;
            case 5:
                this.m = str;
                return;
            case 6:
                this.n = str;
                return;
            case 7:
                this.k = new ImageIcon(getClass().getResource(str));
                return;
            case 8:
                this.bO = Integer.parseInt(str);
                return;
            case 9:
                this.bP = Integer.parseInt(str);
                return;
            case 10:
                this.bY[0][0] = Integer.parseInt(str);
                this.bW = 0;
                this.bX = 0;
                return;
            case C0000a.aW /* 11 */:
                this.bN[this.bW][this.bX] = new ImageIcon(getClass().getResource(str));
                this.bX++;
                if (this.bX == this.bY[0][0] && this.bW != 3) {
                    this.bX = 0;
                    this.bW++;
                }
                if (this.bX == this.bY[0][0] || this.bW > 3) {
                    return;
                }
                this.bV--;
                return;
            case C0000a.aX /* 12 */:
                this.bY[0][1] = Integer.parseInt(str);
                this.bW = 4;
                this.bX = 0;
                return;
            case C0000a.aY /* 13 */:
                this.bN[this.bW][this.bX] = new ImageIcon(getClass().getResource(str));
                this.bX++;
                if (this.bX == this.bY[0][1] && this.bW != 7) {
                    this.bX = 0;
                    this.bW++;
                }
                if (this.bX == this.bY[0][1] || this.bW > 7) {
                    return;
                }
                this.bV--;
                return;
            case C0000a.aZ /* 14 */:
                this.bY[0][2] = Integer.parseInt(str);
                this.bW = 8;
                this.bX = 0;
                return;
            case 15:
                this.bN[this.bW][this.bX] = new ImageIcon(getClass().getResource(str));
                this.bX++;
                if (this.bX == this.bY[0][2] && this.bW != 11) {
                    this.bX = 0;
                    this.bW++;
                }
                if (this.bX == this.bY[0][2] || this.bW > 11) {
                    return;
                }
                this.bV--;
                return;
            case C0000a.bb /* 16 */:
                this.bY[0][3] = Integer.parseInt(str);
                this.bW = 12;
                this.bX = 0;
                return;
            case C0000a.bc /* 17 */:
                this.bN[this.bW][this.bX] = new ImageIcon(getClass().getResource(str));
                this.bX++;
                if (this.bX == this.bY[0][3] && this.bW != 15) {
                    this.bX = 0;
                    this.bW++;
                }
                if (this.bX == this.bY[0][3] || this.bW > 15) {
                    return;
                }
                this.bV--;
                return;
            default:
                return;
        }
    }

    public void a(C0001aa c0001aa) {
        this.bR = c0001aa.E;
        this.bS = c0001aa.R;
        this.bT = c0001aa.S;
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
    }

    public void a(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
        if (this.bN != null) {
            if (this.u <= 0) {
                l();
                return;
            }
            int i = this.R - this.bO;
            int i2 = this.S - this.bP;
            if (this.bN[this.T][this.U[0]] != null) {
                this.bN[this.T][this.U[0]].paintIcon(mastersOfDestiny, graphics, i, i2);
            } else if (this.T == 12 || this.T == 8 || this.T == 0 || this.T == 4) {
                this.bN[0][0].paintIcon(mastersOfDestiny, graphics, i, i2);
            } else if (this.T == 13 || this.T == 9 || this.T == 1 || this.T == 5) {
                this.bN[1][0].paintIcon(mastersOfDestiny, graphics, i, i2);
            } else if (this.T == 14 || this.T == 10 || this.T == 2 || this.T == 6) {
                this.bN[2][0].paintIcon(mastersOfDestiny, graphics, i, i2);
            } else if (this.T == 15 || this.T == 11 || this.T == 3 || this.T == 7) {
                this.bN[3][0].paintIcon(mastersOfDestiny, graphics, i, i2);
            }
            if (this.T >= 12 && this.T <= 15) {
                this.bR.paintIcon(mastersOfDestiny, graphics, (i + (this.bN[this.T][0].getIconWidth() / 2)) - (this.bR.getIconWidth() / 2), (i2 + this.bN[this.T][this.U[0]].getIconHeight()) - this.bR.getIconHeight());
            }
            if (this.ae != 5) {
                if (this.ae == 6) {
                    switch (this.an) {
                        case 0:
                            this.au[this.X].paintIcon(mastersOfDestiny, graphics, (i + (this.bN[this.T][0].getIconWidth() / 2)) - (this.au[this.X].getIconWidth() / 2), (i2 + (this.bN[this.T][0].getIconHeight() / 2)) - (this.au[this.X].getIconHeight() / 2));
                            break;
                        case 1:
                            this.aw[this.X].paintIcon(mastersOfDestiny, graphics, (i + (this.bN[this.T][0].getIconWidth() / 2)) - (this.aw[this.X].getIconWidth() / 2), (i2 + (this.bN[this.T][0].getIconHeight() / 2)) - (this.aw[this.X].getIconHeight() / 2));
                            break;
                        case 2:
                            this.ay[this.X].paintIcon(mastersOfDestiny, graphics, (i + (this.bN[this.T][0].getIconWidth() / 2)) - (this.ay[this.X].getIconWidth() / 2), (i2 + (this.bN[this.T][0].getIconHeight() / 2)) - (this.ay[this.X].getIconHeight() / 2));
                            break;
                        case 3:
                            this.aA[this.X].paintIcon(mastersOfDestiny, graphics, (i + (this.bN[this.T][0].getIconWidth() / 2)) - (this.aA[this.X].getIconWidth() / 2), (i2 + (this.bN[this.T][0].getIconHeight() / 2)) - (this.aA[this.X].getIconHeight() / 2));
                            break;
                        case 4:
                            this.aC[this.X].paintIcon(mastersOfDestiny, graphics, (i + (this.bN[this.T][0].getIconWidth() / 2)) - (this.aC[this.X].getIconWidth() / 2), (i2 + (this.bN[this.T][0].getIconHeight() / 2)) - (this.aC[this.X].getIconHeight() / 2));
                            break;
                    }
                }
            } else {
                switch (this.an) {
                    case 0:
                        this.at[this.X].paintIcon(mastersOfDestiny, graphics, (i + (this.bN[this.T][0].getIconWidth() / 2)) - (this.at[this.X].getIconWidth() / 2), (i2 + (this.bN[this.T][0].getIconHeight() / 2)) - (this.at[this.X].getIconHeight() / 2));
                        break;
                    case 1:
                        this.av[this.X].paintIcon(mastersOfDestiny, graphics, (i + (this.bN[this.T][0].getIconWidth() / 2)) - (this.av[this.X].getIconWidth() / 2), (i2 + (this.bN[this.T][0].getIconHeight() / 2)) - (this.av[this.X].getIconHeight() / 2));
                        break;
                    case 2:
                        this.ax[this.X].paintIcon(mastersOfDestiny, graphics, (i + (this.bN[this.T][0].getIconWidth() / 2)) - (this.ax[this.X].getIconWidth() / 2), (i2 + (this.bN[this.T][0].getIconHeight() / 2)) - (this.ax[this.X].getIconHeight() / 2));
                        break;
                    case 3:
                        this.az[this.X].paintIcon(mastersOfDestiny, graphics, (i + (this.bN[this.T][0].getIconWidth() / 2)) - (this.az[this.X].getIconWidth() / 2), (i2 + (this.bN[this.T][0].getIconHeight() / 2)) - (this.az[this.X].getIconHeight() / 2));
                        break;
                    case 4:
                        this.aB[this.X].paintIcon(mastersOfDestiny, graphics, (i + (this.bN[this.T][0].getIconWidth() / 2)) - (this.aB[this.X].getIconWidth() / 2), (i2 + (this.bN[this.T][0].getIconHeight() / 2)) - (this.aB[this.X].getIconHeight() / 2));
                        break;
                }
            }
            graphics.setFont(MastersOfDestiny.z);
            graphics.setColor(new Color(9963014));
            if (this.bS != null) {
                int iconWidth = (i + (this.bN[this.T][0].getIconWidth() / 2)) - (this.bS.getIconWidth() / 2);
                int height = (i2 - ((graphics.getFontMetrics().getHeight() * 3) / 4)) - this.bS.getIconHeight();
                this.bS.paintIcon(mastersOfDestiny, graphics, iconWidth, height);
                graphics.setClip(((this.u * this.bT.getIconWidth()) / this.r) + iconWidth, height, this.bS.getIconWidth(), this.bS.getIconHeight());
                this.bT.paintIcon(mastersOfDestiny, graphics, 1 + iconWidth, height + 1);
                graphics.setClip(0, 0, mastersOfDestiny.getWidth(), mastersOfDestiny.getHeight());
            }
            graphics.drawString(this.l, (i + (this.bN[this.T][0].getIconWidth() / 2)) - (graphics.getFontMetrics().stringWidth(this.l) / 2), i2);
            if (this.y != null) {
                graphics.setColor(new Color(16777215));
                graphics.setFont(MastersOfDestiny.O);
                graphics.drawString(this.y, (i + (this.bN[this.T][0].getIconWidth() / 2)) - (MastersOfDestiny.P.stringWidth(this.y) / 2), i2 - (MastersOfDestiny.P.getHeight() / 4));
                this.bU++;
                if (this.bU > 10) {
                    this.y = null;
                    this.bU = 0;
                }
            }
        }
    }
}
