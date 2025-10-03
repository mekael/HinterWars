

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Hashtable;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/* renamed from: aa  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:aa.class */
public class C0001aa {
    public String a;
    public int b;
    public static long c;
    public String d;
    public long e;
    public String f;
    public int g;
    private String[] aO;
    public String h;
    public long i;
    public Hashtable j;
    public BufferedImage k;
    public Hashtable m;
    public Icon n;
    public Icon[] o;
    public C0031j p;
    public U q;
    public K r;
    public G s;
    public C0008ah t;
    public T u;
    public MastersOfDestiny v;
    public Object[] w;
    public aE x;
    public Icon y;
    public Icon z;
    public int A;
    public int B;
    BufferedImage C;
    Icon E;
    Icon[] F;
    Icon[] G;
    Icon[] H;
    Icon[] I;
    Icon[] J;
    Icon[] K;
    Icon[] L;
    Icon[] M;
    Icon[] N;
    Icon[] O;
    Icon[] P;
    Icon[] Q;
    Icon R;
    Icon S;
    Icon T;
    Icon U;
    Icon[][] W;
    Icon X;
    Icon Y;
    Icon Z;
    Icon[] aa;
    Icon[][] ab;
    Icon ac;
    Icon ad;
    Icon ae;
    Icon[] af;
    Icon[][] ag;
    Icon ah;
    Icon ai;
    Icon aj;
    Icon[] ak;
    Icon[][] al;
    Icon am;
    static final int an = 0;
    static final int ao = 1;
    static final int ap = 2;
    static final int aq = 3;
    static final int ar = 4;
    static final int as = 5;
    static final int at = 6;
    static final int au = 7;
    static final int av = 8;
    static final int aw = 9;
    static final int ax = 10;
    static final int ay = 11;
    static final int az = 12;
    static final int aA = 13;
    static final int aB = 14;
    static final int aC = 15;
    private int aT;
    public Socket aD;
    public BufferedReader aE;
    public PrintWriter aF;
    AudioClip aG;
    AudioClip aH;
    AudioClip aI;
    byte aJ;
    private final int aP = 1;
    private final int aQ = 2;
    private final int aR = 3;
    private final int aS = 4;
    final byte aK = 0;
    final byte aL = 1;
    final byte aM = 2;
    final byte aN = 3;
    public boolean l = false;
    public C0029h D = new C0029h();
    Icon[] V = new Icon[4];

    public Icon a(String str, int i) {
        return new ImageIcon(getClass().getResource(f(str, i)));
    }

    public BufferedImage b(String str, int i) {
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(getClass().getResource(f(str, i)));
        } catch (IOException e) {
            C0032k.a(" gameData.getImage IOException: " + e.getMessage());
            e.printStackTrace();
        }
        return bufferedImage;
    }

    public Icon[] c(String str, int i) {
        String[] a = this.x.a(str, i, 0, 0);
        Icon[] iconArr = new Icon[a.length];
        for (int i2 = 0; i2 < a.length; i2++) {
            iconArr[i2] = new ImageIcon(getClass().getResource(this.x.d("en", 0) + a[i2]));
        }
        return iconArr;
    }

    public int d(String str, int i) {
        return this.x.b(str, i);
    }

    public int[] e(String str, int i) {
        return this.x.e(str, i);
    }

    public String f(String str, int i) {
        return this.x.d("en", 0) + this.x.d(str, i);
    }

    public String g(String str, int i) {
        return this.x.d(str, i);
    }

    public C0001aa(C0031j c0031j, U u, K k, G g, C0008ah c0008ah, T t, MastersOfDestiny mastersOfDestiny, Object[] objArr) {
        this.p = c0031j;
        this.q = u;
        this.r = k;
        this.s = g;
        this.t = c0008ah;
        this.u = t;
        this.v = mastersOfDestiny;
        this.w = objArr;
        this.V[0] = new ImageIcon(getClass().getResource("res/items/humans/white_mask/stand_ne.png"));
        this.V[1] = new ImageIcon(getClass().getResource("res/items/humans/white_mask/stand_nw.png"));
        this.V[2] = new ImageIcon(getClass().getResource("res/items/humans/white_mask/stand_sw.png"));
        this.V[3] = new ImageIcon(getClass().getResource("res/items/humans/white_mask/stand_se.png"));
        this.W = new Icon[4][2];
        this.W[0][0] = new ImageIcon(getClass().getResource("res/items/humans/yellow_mask/stand_ne1.png"));
        this.W[0][1] = new ImageIcon(getClass().getResource("res/items/humans/yellow_mask/stand_ne2.png"));
        this.W[1][0] = new ImageIcon(getClass().getResource("res/items/humans/yellow_mask/stand_nw1.png"));
        this.W[1][1] = new ImageIcon(getClass().getResource("res/items/humans/yellow_mask/stand_nw2.png"));
        this.W[2][0] = new ImageIcon(getClass().getResource("res/items/humans/yellow_mask/stand_sw1.png"));
        this.W[2][1] = new ImageIcon(getClass().getResource("res/items/humans/yellow_mask/stand_sw2.png"));
        this.W[3][0] = new ImageIcon(getClass().getResource("res/items/humans/yellow_mask/stand_se1.png"));
        this.W[3][1] = new ImageIcon(getClass().getResource("res/items/humans/yellow_mask/stand_se2.png"));
        this.X = new ImageIcon(getClass().getResource("res/items/humans/human_die.png"));
        this.aa = new Icon[4];
        this.aa[0] = new ImageIcon(getClass().getResource("res/items/taikuus/white_mask/stand_ne.png"));
        this.aa[1] = new ImageIcon(getClass().getResource("res/items/taikuus/white_mask/stand_nw.png"));
        this.aa[2] = new ImageIcon(getClass().getResource("res/items/taikuus/white_mask/stand_sw.png"));
        this.aa[3] = new ImageIcon(getClass().getResource("res/items/taikuus/white_mask/stand_se.png"));
        this.ab = new Icon[4][2];
        this.ab[0][0] = new ImageIcon(getClass().getResource("res/items/taikuus/yellow_mask/stand_ne1.png"));
        this.ab[0][1] = new ImageIcon(getClass().getResource("res/items/taikuus/yellow_mask/stand_ne2.png"));
        this.ab[1][0] = new ImageIcon(getClass().getResource("res/items/taikuus/yellow_mask/stand_nw1.png"));
        this.ab[1][1] = new ImageIcon(getClass().getResource("res/items/taikuus/yellow_mask/stand_nw2.png"));
        this.ab[2][0] = new ImageIcon(getClass().getResource("res/items/taikuus/yellow_mask/stand_sw1.png"));
        this.ab[2][1] = new ImageIcon(getClass().getResource("res/items/taikuus/yellow_mask/stand_sw2.png"));
        this.ab[3][0] = new ImageIcon(getClass().getResource("res/items/taikuus/yellow_mask/stand_se1.png"));
        this.ab[3][1] = new ImageIcon(getClass().getResource("res/items/taikuus/yellow_mask/stand_se2.png"));
        this.ac = new ImageIcon(getClass().getResource("res/items/taikuus/taikus_die.png"));
        this.af = new Icon[4];
        this.af[0] = new ImageIcon(getClass().getResource("res/items/firan/white_mask/stand_ne.png"));
        this.af[1] = new ImageIcon(getClass().getResource("res/items/firan/white_mask/stand_nw.png"));
        this.af[2] = new ImageIcon(getClass().getResource("res/items/firan/white_mask/stand_sw.png"));
        this.af[3] = new ImageIcon(getClass().getResource("res/items/firan/white_mask/stand_se.png"));
        this.ag = new Icon[4][2];
        this.ag[0][0] = new ImageIcon(getClass().getResource("res/items/firan/yellow_mask/stand_ne1.png"));
        this.ag[0][1] = new ImageIcon(getClass().getResource("res/items/firan/yellow_mask/stand_ne2.png"));
        this.ag[1][0] = new ImageIcon(getClass().getResource("res/items/firan/yellow_mask/stand_nw1.png"));
        this.ag[1][1] = new ImageIcon(getClass().getResource("res/items/firan/yellow_mask/stand_nw2.png"));
        this.ag[2][0] = new ImageIcon(getClass().getResource("res/items/firan/yellow_mask/stand_sw1.png"));
        this.ag[2][1] = new ImageIcon(getClass().getResource("res/items/firan/yellow_mask/stand_sw2.png"));
        this.ag[3][0] = new ImageIcon(getClass().getResource("res/items/firan/yellow_mask/stand_se1.png"));
        this.ag[3][1] = new ImageIcon(getClass().getResource("res/items/firan/yellow_mask/stand_se2.png"));
        this.ah = new ImageIcon(getClass().getResource("res/items/firan/firan_die.png"));
        this.ak = new Icon[4];
        this.ak[0] = new ImageIcon(getClass().getResource("res/items/brucian/white_mask/stand_ne.png"));
        this.ak[1] = new ImageIcon(getClass().getResource("res/items/brucian/white_mask/stand_nw.png"));
        this.ak[2] = new ImageIcon(getClass().getResource("res/items/brucian/white_mask/stand_sw.png"));
        this.ak[3] = new ImageIcon(getClass().getResource("res/items/brucian/white_mask/stand_se.png"));
        this.al = new Icon[4][2];
        this.al[0][0] = new ImageIcon(getClass().getResource("res/items/brucian/yellow_mask/stand_ne1.png"));
        this.al[0][1] = new ImageIcon(getClass().getResource("res/items/brucian/yellow_mask/stand_ne2.png"));
        this.al[1][0] = new ImageIcon(getClass().getResource("res/items/brucian/yellow_mask/stand_nw1.png"));
        this.al[1][1] = new ImageIcon(getClass().getResource("res/items/brucian/yellow_mask/stand_nw2.png"));
        this.al[2][0] = new ImageIcon(getClass().getResource("res/items/brucian/yellow_mask/stand_sw1.png"));
        this.al[2][1] = new ImageIcon(getClass().getResource("res/items/brucian/yellow_mask/stand_sw2.png"));
        this.al[3][0] = new ImageIcon(getClass().getResource("res/items/brucian/yellow_mask/stand_se1.png"));
        this.al[3][1] = new ImageIcon(getClass().getResource("res/items/brucian/yellow_mask/stand_se2.png"));
        this.am = new ImageIcon(getClass().getResource("res/items/brucian/brucian_die.png"));
        this.E = new ImageIcon(getClass().getResource("res/effects/hit/effect_hit.png"));
        this.F = new Icon[3];
        this.F[0] = new ImageIcon(getClass().getResource("res/effects/UE_target/effect_useitem_target1.png"));
        this.F[1] = new ImageIcon(getClass().getResource("res/effects/UE_target/effect_useitem_target2.png"));
        this.F[2] = new ImageIcon(getClass().getResource("res/effects/UE_target/effect_useitem_target3.png"));
        this.G = new Icon[3];
        this.G[0] = new ImageIcon(getClass().getResource("res/effects/UE_caster/effect_useitem_caster1.png"));
        this.G[1] = new ImageIcon(getClass().getResource("res/effects/UE_caster/effect_useitem_caster2.png"));
        this.G[2] = new ImageIcon(getClass().getResource("res/effects/UE_caster/effect_useitem_caster3.png"));
        this.H = new Icon[3];
        this.H[0] = new ImageIcon(getClass().getResource("res/effects/skill_caster/effect_buff_caster1.png"));
        this.H[1] = new ImageIcon(getClass().getResource("res/effects/skill_caster/effect_buff_caster2.png"));
        this.H[2] = new ImageIcon(getClass().getResource("res/effects/skill_caster/effect_buff_caster3.png"));
        this.I = new Icon[3];
        this.I[0] = new ImageIcon(getClass().getResource("res/effects/skill_target/effect_buff_target1.png"));
        this.I[1] = new ImageIcon(getClass().getResource("res/effects/skill_target/effect_buff_target2.png"));
        this.I[2] = new ImageIcon(getClass().getResource("res/effects/skill_target/effect_buff_target3.png"));
        this.J = new Icon[3];
        this.J[0] = new ImageIcon(getClass().getResource("res/effects/skill_caster/effect_debuff_caster1.png"));
        this.J[1] = new ImageIcon(getClass().getResource("res/effects/skill_caster/effect_debuff_caster2.png"));
        this.J[2] = new ImageIcon(getClass().getResource("res/effects/skill_caster/effect_debuff_caster3.png"));
        this.K = new Icon[3];
        this.K[0] = new ImageIcon(getClass().getResource("res/effects/skill_target/effect_debuff_target1.png"));
        this.K[1] = new ImageIcon(getClass().getResource("res/effects/skill_target/effect_debuff_target2.png"));
        this.K[2] = new ImageIcon(getClass().getResource("res/effects/skill_target/effect_debuff_target3.png"));
        this.L = new Icon[3];
        this.L[0] = new ImageIcon(getClass().getResource("res/effects/skill_caster/effect_flame_caster1.png"));
        this.L[1] = new ImageIcon(getClass().getResource("res/effects/skill_caster/effect_flame_caster2.png"));
        this.L[2] = new ImageIcon(getClass().getResource("res/effects/skill_caster/effect_flame_caster3.png"));
        this.M = new Icon[4];
        this.M[0] = new ImageIcon(getClass().getResource("res/effects/skill_target/effect_flame_target1.png"));
        this.M[1] = new ImageIcon(getClass().getResource("res/effects/skill_target/effect_flame_target2.png"));
        this.M[2] = new ImageIcon(getClass().getResource("res/effects/skill_target/effect_flame_target3.png"));
        this.M[3] = new ImageIcon(getClass().getResource("res/effects/skill_target/effect_flame_target4.png"));
        this.N = new Icon[3];
        this.N[0] = new ImageIcon(getClass().getResource("res/effects/skill_caster/effect_melee_caster1.png"));
        this.N[1] = new ImageIcon(getClass().getResource("res/effects/skill_caster/effect_melee_caster2.png"));
        this.N[2] = new ImageIcon(getClass().getResource("res/effects/skill_caster/effect_melee_caster3.png"));
        this.O = new Icon[2];
        this.O[0] = new ImageIcon(getClass().getResource("res/effects/skill_target/effect_melee_target1.png"));
        this.O[1] = new ImageIcon(getClass().getResource("res/effects/skill_target/effect_melee_target2.png"));
        this.P = new Icon[3];
        this.P[0] = new ImageIcon(getClass().getResource("res/effects/skill_caster/effect_ranged_caster1.png"));
        this.P[1] = new ImageIcon(getClass().getResource("res/effects/skill_caster/effect_ranged_caster2.png"));
        this.P[2] = new ImageIcon(getClass().getResource("res/effects/skill_caster/effect_ranged_caster3.png"));
        this.Q = new Icon[2];
        this.Q[0] = new ImageIcon(getClass().getResource("res/effects/skill_target/effect_ranged_target1.png"));
        this.Q[1] = new ImageIcon(getClass().getResource("res/effects/skill_target/effect_ranged_target2.png"));
        this.R = new ImageIcon(getClass().getResource("res/missions/mini_hp.png"));
        this.S = new ImageIcon(getClass().getResource("res/missions/mini_hp1.png"));
        C0032k.a("gameData.miniLifeBar - " + this.R + " gameData.miniLifeDepleteBar - " + this.S);
        this.x = c0031j.b();
        this.aG = Applet.newAudioClip(getClass().getResource(this.x.a("en", 0) + this.x.d("en", 287)));
        this.aI = Applet.newAudioClip(getClass().getResource(this.x.a("en", 0) + this.x.d("en", 288)));
        this.aH = Applet.newAudioClip(getClass().getResource(this.x.a("en", 0) + this.x.d("en", 289)));
        this.aJ = (byte) 0;
        this.aO = this.x.a("en", 267, 0, 0);
        try {
            BufferedImage read = ImageIO.read(getClass().getResource(f("en", 88)));
            this.C = new BufferedImage(read.getWidth((ImageObserver) null), read.getHeight((ImageObserver) null), 1);
            this.C.createGraphics().drawImage(read, 0, 0, (ImageObserver) null);
        } catch (IOException e) {
        }
    }

    public String a(int i) {
        return this.aO[i];
    }

    public Icon b(int i) {
        switch (i) {
            case 1:
                return this.T;
            case 2:
                return this.Y;
            case 3:
                return this.ad;
            case 4:
                return this.ai;
            default:
                C0032k.a("GameDate.getClamourShot: Error! - invalid race id");
                return null;
        }
    }

    public Icon c(int i) {
        switch (i) {
            case 1:
                return this.U;
            case 2:
                return this.Z;
            case 3:
                return this.ae;
            case 4:
                return this.aj;
            default:
                C0032k.a("GameDate.getClamourShot: Error! - invalid race id");
                return null;
        }
    }

    public int a() {
        return this.aT;
    }

    public void a(String str) {
        a(b(str));
    }

    public String[] b(String str) {
        String[] split = str.split("\\|");
        c(C0000a.a(split[1]));
        String str2 = "";
        if (this.aT < Integer.parseInt(split[1])) {
            for (int i = 0; i < split.length; i++) {
                if (i != 1) {
                    str2 = str2 + split[i];
                    if (i != split.length - 1) {
                        str2 = str2 + C0000a.v;
                    }
                }
            }
            this.aT = Integer.parseInt(split[1]);
        }
        return str2.split("\\|");
    }

    public void a(String[] strArr) {
    }

    public void c(String str) {
        this.aF.write(str);
        this.aF.flush();
    }

    public void a(byte b) {
        if (this.aJ != 0) {
            switch (this.aJ) {
                case 1:
                    this.aG.stop();
                    break;
                case 2:
                    this.aI.stop();
                    break;
                case 3:
                    if (b == 1 || b == 2) {
                        this.aH.stop();
                        break;
                    }
                    break;
            }
        }
        switch (b) {
            case 1:
                try {
                    Thread.sleep(100L);
                    this.aG.play();
                    Thread.sleep(1000L);
                    this.aJ = (byte) 1;
                    return;
                } catch (InterruptedException e) {
                    C0032k.a(e.getMessage());
                    return;
                }
            case 2:
                this.aI.play();
                this.aJ = (byte) 2;
                return;
            case 3:
                this.aH.play();
                this.aJ = (byte) 3;
                return;
            default:
                return;
        }
    }
}
