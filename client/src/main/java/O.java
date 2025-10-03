

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/* renamed from: O  reason: default package */
/* loaded from: hinterwars.jar:O.class */
public class O extends AbstractC0026e {
    private C0001aa k;
    private byte l;
    private Icon m;
    private Icon[] n;
    private int o;
    private int p;
    public int a;
    public int b;
    public I c;
    public Hashtable d;
    public Hashtable e;
    private String q;
    private String r;
    final int f = 245;
    final int g = C0002ab.m;
    final int h = 0;
    final int i = 244;
    GameStates j;

    public O(GameStates gameStates) {
        this.j = gameStates;
    }

    @Override // defpackage.AbstractC0026e
    public void a(C0001aa c0001aa, long j) {
        this.k = c0001aa;
        this.l = (byte) 21;
        C0032k.a("state of loading mission = " + ((int) this.l));
        a(C0022ax.f());
        try {
            InputStream resourceAsStream = getClass().getResourceAsStream("res/missions/tileIdMapping.txt");
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
                this.q = new String(byteArrayOutputStream.toByteArray(), "utf-8");
                C0032k.a(this.q);
            } else {
                C0032k.a("tile graphics mapping null");
            }
        } catch (IOException e) {
            C0032k.a(e.getMessage());
        }
        this.c = new I(12, 12, c0001aa.d("en", 536), c0001aa.d("en", 537), c0001aa.d("en", 538), c0001aa.d("en", 539));
        this.d = new Hashtable();
        this.e = new Hashtable();
        b();
        this.n = c0001aa.c("en", 225);
        this.o = c0001aa.d("en", 226);
        this.p = c0001aa.d("en", 227);
        this.b = this.n.length - 1;
        this.j.a(aX.e, aX.f);
    }

    private void b() {
        int i = 0;
        switch (Math.abs(new Random().nextInt()) % 5) {
            case 0:
                i = 220;
                break;
            case 1:
                i = 221;
                break;
            case 2:
                i = 222;
                break;
            case 3:
                i = 223;
                break;
            case 4:
                i = 224;
                break;
        }
        this.m = this.k.a("en", i);
    }

    @Override // defpackage.AbstractC0026e
    public int b(C0001aa c0001aa, long j) {
        return this.l;
    }

    @Override // defpackage.AbstractC0026e
    public void a(byte b) {
    }

    @Override // defpackage.AbstractC0026e
    public void a(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
        this.m.paintIcon(mastersOfDestiny, graphics, 0, 0);
        this.n[this.a].paintIcon(mastersOfDestiny, graphics, this.o, this.p);
    }

    @Override // defpackage.AbstractC0026e
    public void a(int i, Object obj) {
    }

    @Override // defpackage.AbstractC0026e
    public void a(String[] strArr) {
        switch (C0000a.a(strArr)) {
            case C0000a.aS /* -1 */:
                C0001aa c0001aa = this.k;
                a(C0000a.a(Long.toString(C0001aa.c), this.k.d));
                return;
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 10:
            case C0000a.bh /* 22 */:
            case C0000a.bi /* 23 */:
            case C0000a.bj /* 24 */:
            case C0000a.bk /* 25 */:
            case C0000a.bl /* 26 */:
            case C0000a.bm /* 27 */:
            case C0000a.bn /* 28 */:
            case C0000a.bo /* 29 */:
            case 30:
            case C0000a.bq /* 31 */:
            case C0000a.br /* 32 */:
            case C0000a.bs /* 33 */:
            case C0000a.bt /* 34 */:
            case C0000a.bu /* 35 */:
            case C0000a.bv /* 36 */:
            case C0000a.bw /* 37 */:
            case C0000a.bx /* 38 */:
            case C0000a.by /* 39 */:
            case C0000a.bz /* 40 */:
            case C0000a.bA /* 41 */:
            case C0000a.bB /* 42 */:
            case C0000a.bC /* 43 */:
            case 44:
            case C0000a.bD /* 45 */:
            case C0000a.bE /* 46 */:
            default:
                return;
            case 1:
                C0001aa c0001aa2 = this.k;
                a(C0000a.b(Long.toString(C0001aa.c), this.k.d));
                return;
            case 6:
                C0032k.a("received TF in loading mission");
                Enumeration elements = this.e.elements();
                while (elements.hasMoreElements()) {
                    ((aH) elements.nextElement()).a(this.k);
                }
                this.k.w = new Object[1];
                this.k.w[0] = this;
                this.l = (byte) 22;
                return;
            case 8:
                if (!strArr[1].equalsIgnoreCase("Y") && strArr[1].equalsIgnoreCase("N")) {
                    this.j.a(this.k.a, this.k.b);
                    this.l = (byte) 27;
                    if (this.j.eP != null) {
                        this.j.eP.a("You cannot start this mission!", 16711680, 16711680);
                        this.j.eP.a((byte) 3);
                    }
                }
                this.a = 1;
                return;
            case 9:
                b(strArr[1]);
                return;
            case C0000a.aW /* 11 */:
                int parseInt = Integer.parseInt(strArr[3]);
                int parseInt2 = Integer.parseInt(strArr[4]);
                aS aSVar = new aS(Long.parseLong(strArr[1]), Long.parseLong(strArr[2]), this.k.f("en", 535), parseInt, parseInt2, this.c.a(parseInt, parseInt2).j(), this.c.a(parseInt, parseInt2).k(), Integer.parseInt(strArr[5]), Integer.parseInt(strArr[6]));
                aSVar.a(this.k);
                this.d.put(new Long(strArr[2]), aSVar);
                this.c.a(parseInt, parseInt2, aSVar);
                this.c.a(parseInt, parseInt2).a(false);
                this.c.a(parseInt, parseInt2).b(false);
                this.a = 2;
                return;
            case C0000a.aX /* 12 */:
                int parseInt3 = Integer.parseInt(strArr[2]);
                int parseInt4 = Integer.parseInt(strArr[3]);
                aH aHVar = new aH(this.k.e, strArr[1], Integer.parseInt(strArr[5]), GameStates.oK, GameStates.oL, GameStates.oM, parseInt3, parseInt4, this.c.a(parseInt3, parseInt4).j(), this.c.a(parseInt3, parseInt4).k(), Integer.parseInt(strArr[4]), this.k.b(GameStates.oK), Integer.parseInt(strArr[12]));
                this.e.put(new Long(this.k.e), aHVar);
                this.c.a(parseInt3, parseInt4, aHVar);
                this.c.a(parseInt3, parseInt4).a(false);
                this.c.a(parseInt3, parseInt4).b(false);
                this.a = 3;
                return;
            case C0000a.aY /* 13 */:
                int parseInt5 = Integer.parseInt(strArr[3]);
                int parseInt6 = Integer.parseInt(strArr[4]);
                int parseInt7 = Integer.parseInt(strArr[7]);
                aH aHVar2 = new aH(Long.parseLong(strArr[1]), strArr[2], Integer.parseInt(strArr[6]), parseInt7, Integer.parseInt(strArr[8]), Integer.parseInt(strArr[9]), parseInt5, parseInt6, this.c.a(parseInt5, parseInt6).j(), this.c.a(parseInt5, parseInt6).k(), Integer.parseInt(strArr[5]), this.k.c(parseInt7), Integer.parseInt(strArr[13]));
                if (Integer.parseInt(strArr[10]) != -1) {
                    D a = this.k.q.a(strArr[10]);
                    C0020av c0020av = new C0020av();
                    c0020av.a(a);
                    c0020av.a(1);
                    c0020av.a(1, (byte) 1);
                    aHVar2.a(c0020av);
                }
                if (Integer.parseInt(strArr[11]) != -1) {
                    D a2 = this.k.q.a(strArr[11]);
                    C0020av c0020av2 = new C0020av();
                    c0020av2.a(a2);
                    c0020av2.a(1);
                    c0020av2.a(2, (byte) 1);
                    aHVar2.a(c0020av2);
                }
                if (Integer.parseInt(strArr[12]) != -1) {
                    D a3 = this.k.q.a(strArr[12]);
                    C0020av c0020av3 = new C0020av();
                    c0020av3.a(a3);
                    c0020av3.a(1);
                    c0020av3.a(3, (byte) 1);
                    aHVar2.a(c0020av3);
                }
                this.e.put(new Long(strArr[1]), aHVar2);
                this.c.a(parseInt5, parseInt6, aHVar2);
                this.c.a(parseInt5, parseInt6).a(false);
                this.c.a(parseInt5, parseInt6).b(false);
                return;
            case C0000a.aZ /* 14 */:
                int parseInt8 = Integer.parseInt(strArr[3]);
                int parseInt9 = Integer.parseInt(strArr[4]);
                int parseInt10 = Integer.parseInt(strArr[7]);
                aH aHVar3 = new aH(Long.parseLong(strArr[1]), strArr[2], Integer.parseInt(strArr[6]), parseInt10, Integer.parseInt(strArr[8]), Integer.parseInt(strArr[9]), parseInt8, parseInt9, this.c.a(parseInt8, parseInt9).j(), this.c.a(parseInt8, parseInt9).k(), Integer.parseInt(strArr[5]), this.k.c(parseInt10), Integer.parseInt(strArr[13]));
                if (Integer.parseInt(strArr[10]) != -1) {
                    D a4 = this.k.q.a(strArr[10]);
                    C0020av c0020av4 = new C0020av();
                    c0020av4.a(a4);
                    c0020av4.a(1);
                    c0020av4.a(1, (byte) 1);
                    aHVar3.a(c0020av4);
                }
                if (Integer.parseInt(strArr[11]) != -1) {
                    D a5 = this.k.q.a(strArr[11]);
                    C0020av c0020av5 = new C0020av();
                    c0020av5.a(a5);
                    c0020av5.a(1);
                    c0020av5.a(2, (byte) 1);
                    aHVar3.a(c0020av5);
                }
                if (Integer.parseInt(strArr[12]) != -1) {
                    D a6 = this.k.q.a(strArr[12]);
                    C0020av c0020av6 = new C0020av();
                    c0020av6.a(a6);
                    c0020av6.a(1);
                    c0020av6.a(3, (byte) 1);
                    aHVar3.a(c0020av6);
                }
                this.e.put(new Long(strArr[1]), aHVar3);
                this.c.a(parseInt8, parseInt9, aHVar3);
                this.c.a(parseInt8, parseInt9).a(false);
                this.c.a(parseInt8, parseInt9).b(false);
                return;
            case 15:
                int parseInt11 = Integer.parseInt(strArr[3]);
                int parseInt12 = Integer.parseInt(strArr[2]);
                if (parseInt11 > 0 && parseInt12 > 0) {
                    D a7 = this.k.q.a(strArr[1]);
                    C0020av c0020av7 = new C0020av();
                    c0020av7.a(a7);
                    c0020av7.a(1);
                    c0020av7.a(parseInt11, (byte) 1);
                    ((aH) this.e.get(Long.valueOf(this.k.e))).a(c0020av7);
                    if (parseInt12 > 1) {
                        C0020av c0020av8 = new C0020av();
                        c0020av8.a(a7);
                        c0020av8.a(parseInt12 - 1);
                        ((aH) this.e.get(Long.valueOf(this.k.e))).c(c0020av8);
                    }
                }
                if (parseInt11 == 0 && parseInt12 > 0) {
                    D a8 = this.k.q.a(strArr[1]);
                    C0020av c0020av9 = new C0020av();
                    c0020av9.a(a8);
                    c0020av9.a(parseInt12);
                    ((aH) this.e.get(Long.valueOf(this.k.e))).c(c0020av9);
                }
                this.a = 4;
                return;
            case C0000a.bb /* 16 */:
                int parseInt13 = Integer.parseInt(strArr[3]);
                if (parseInt13 > 0) {
                    D a9 = this.k.q.a(strArr[2]);
                    C0020av c0020av10 = new C0020av();
                    c0020av10.a(a9);
                    c0020av10.a(1);
                    c0020av10.a(parseInt13, (byte) 1);
                    ((aH) this.e.get(Long.valueOf(strArr[1]))).a(c0020av10);
                    return;
                }
                return;
            case C0000a.bc /* 17 */:
                int parseInt14 = Integer.parseInt(strArr[3]);
                if (parseInt14 > 0) {
                    D a10 = this.k.q.a(strArr[2]);
                    C0020av c0020av11 = new C0020av();
                    c0020av11.a(a10);
                    c0020av11.a(1);
                    c0020av11.a(parseInt14, (byte) 1);
                    ((aH) this.e.get(Long.valueOf(strArr[1]))).a(c0020av11);
                    return;
                }
                return;
            case C0000a.bd /* 18 */:
                aQ a11 = this.k.r.a(Long.parseLong(strArr[1]));
                C0032k.a("skill type = " + a11.n());
                if (a11.e() && a11.a() != 1) {
                    C0020av d = ((aH) this.e.get(Long.valueOf(this.k.e))).d();
                    if (d != null) {
                        String f = d.a().f();
                        C0032k.a("weapon = " + f);
                        if (f.equalsIgnoreCase("gun")) {
                            if (a11.n().startsWith("Close Combat")) {
                                a11.a(true);
                            } else {
                                a11.a(false);
                            }
                        } else if (f.equalsIgnoreCase("knife")) {
                            if (a11.n().startsWith("Gunnery")) {
                                a11.a(true);
                            } else {
                                a11.a(false);
                            }
                        } else if (f.equalsIgnoreCase("sword")) {
                            if (a11.n().startsWith("Bow Crafts")) {
                                a11.a(true);
                            } else {
                                a11.a(false);
                            }
                        } else if (f.equalsIgnoreCase("bow")) {
                            if (a11.n().startsWith("Sword Crafts")) {
                                a11.a(true);
                            } else {
                                a11.a(false);
                            }
                        } else if (f.equalsIgnoreCase("book")) {
                            if (a11.n().startsWith("Combat Magic")) {
                                a11.a(true);
                            } else {
                                a11.a(false);
                            }
                        } else if (f.equalsIgnoreCase("staff")) {
                            if (a11.n().startsWith("Support Magic")) {
                                a11.a(true);
                            } else {
                                a11.a(false);
                            }
                        } else if (f.equalsIgnoreCase("claw")) {
                            if (a11.n().startsWith("Knuckles Training")) {
                                a11.a(true);
                            } else {
                                a11.a(false);
                            }
                        } else if (!f.equalsIgnoreCase("knuckles")) {
                            a11.a(false);
                        } else if (a11.n().startsWith("Claws Training")) {
                            a11.a(true);
                        } else {
                            a11.a(false);
                        }
                    } else if (a11.n().startsWith("Close Combat") || a11.n().startsWith("Gunnery") || a11.n().startsWith("Bow Crafts") || a11.n().startsWith("Sword Crafts") || a11.n().startsWith("Combat Magic") || a11.n().startsWith("Support Magic") || a11.n().startsWith("Knuckles Training") || a11.n().startsWith("Claws Training")) {
                        a11.a(true);
                    } else {
                        a11.a(false);
                    }
                    C0032k.a("skill disable = " + a11.r());
                    ((aH) this.e.get(Long.valueOf(this.k.e))).a(a11);
                }
                this.a = 5;
                return;
            case C0000a.be /* 19 */:
                ((aH) this.e.get(Long.valueOf(this.k.e))).a(Integer.parseInt(strArr[1]), Integer.parseInt(strArr[5]), Integer.parseInt(strArr[2]), Integer.parseInt(strArr[4]), Integer.parseInt(strArr[3]), Integer.parseInt(strArr[6]));
                return;
            case C0000a.bf /* 20 */:
                if (this.e.get(Long.valueOf(strArr[1])) != null) {
                    ((aH) this.e.get(Long.valueOf(strArr[1]))).a(Integer.parseInt(strArr[2]), Integer.parseInt(strArr[6]), Integer.parseInt(strArr[3]), Integer.parseInt(strArr[5]), Integer.parseInt(strArr[4]), Integer.parseInt(strArr[7]));
                    return;
                }
                return;
            case C0000a.bg /* 21 */:
                if (this.e.get(Long.valueOf(strArr[1])) != null) {
                    ((aH) this.e.get(Long.valueOf(strArr[1]))).a(Integer.parseInt(strArr[2]), Integer.parseInt(strArr[6]), Integer.parseInt(strArr[3]), Integer.parseInt(strArr[5]), Integer.parseInt(strArr[4]), Integer.parseInt(strArr[7]));
                    return;
                }
                return;
            case C0000a.bF /* 47 */:
                this.j.a(this.k.a, this.k.b);
                this.l = (byte) 27;
                return;
        }
    }

    public void a(String str) {
        this.j.U.write(str);
        this.j.U.flush();
    }

    @Override // defpackage.AbstractC0026e
    public void a() {
    }

    public void b(String str) {
        String str2 = "res/missions/mapText/" + str + ".txt";
        C0032k.a("dir=" + str2);
        try {
            String str3 = "";
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
                str3 = new String(byteArrayOutputStream.toByteArray(), "utf-8");
                C0032k.a("map: " + str3);
            }
            if (str3 != null && str3.length() > 0) {
                String[] split = str3.split("\r\n");
                this.c.a(new ImageIcon(getClass().getResource("res/missions/Maps/" + split[0] + ".png")));
                if (Integer.parseInt(split[1]) > 0) {
                    for (int i = 2; i < split.length; i++) {
                        String[] split2 = split[i].split("\\|");
                        int parseInt = Integer.parseInt(split2[0]);
                        int parseInt2 = Integer.parseInt(split2[1]);
                        int e = parseInt2 / this.c.e();
                        int e2 = parseInt2 % this.c.e();
                        int i2 = 1;
                        int i3 = 0;
                        String str4 = "";
                        int i4 = 0;
                        while (true) {
                            if (i4 < this.q.length()) {
                                if (this.q.charAt(i4) == '\n') {
                                    if (i2 == parseInt) {
                                        String substring = this.q.substring(i3, i4 - 1);
                                        str4 = substring.substring(split2[0].length() + 1, substring.length());
                                    } else {
                                        i2++;
                                        i3 = i4 + 1;
                                    }
                                }
                                i4++;
                            }
                        }
                        if (str4.length() > 0) {
                            this.c.a(e, e2).a(str4);
                        }
                        if (parseInt >= 0 && parseInt <= 244) {
                            this.c.a(e, e2).a(false);
                            this.c.a(e, e2).b(true);
                        } else if (parseInt >= 245 && parseInt <= 255) {
                            this.c.a(e, e2).a(true);
                            this.c.a(e, e2).b(false);
                        }
                        switch (parseInt) {
                            case C0002ab.m /* 255 */:
                                this.c.a(e, e2).a(this.k.f("en", 534));
                                this.c.a(e, e2).a(C0002ab.m);
                                break;
                        }
                    }
                }
            }
            C0032k.a("map created");
        } catch (IOException e3) {
            C0032k.a(e3.getMessage());
        }
    }

    @Override // defpackage.AbstractC0026e
    public void a(MouseEvent mouseEvent) {
    }

    @Override // defpackage.AbstractC0026e
    public void b(MouseEvent mouseEvent) {
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
