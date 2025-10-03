

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

/* renamed from: GameStates  reason: default package */
/* loaded from: hinterwars.jar:GameStates.class */
public class GameStates implements Runnable, aN {
    String a;
    String b;
    int c;
    int d;
    String g;
    BufferedImage h;
    BufferedImage i;
    Image j;
    Hashtable k;
    Hashtable l;
    Icon m;
    Icon[] n;
    Icon o;
    az p;
    C q;
    C r;
    C s;
    C t;
    C u;
    C v;
    C w;
    az x;
    C0006af y;
    C0006af z;
    C0006af A;
    C0006af B;
    C0006af C;
    C0006af D;
    C0006af E;
    az F;
    C0004ad G;
    az H;
    C0006af I;
    C0006af J;
    C0006af K;
    C0006af L;
    az M;
    C0011ak N;
    H O;
    Socket S;
    static long V;
    static int W;
    static long X;
    static String Y;
    static String Z;
    C0025d aa;
    byte ab;
    W ac;
    String ad;
    int ae;
    int af;
    int ag;
    int ah;
    String[] ai;
    int[] aj;
    int[] ak;
    int[] al;
    Object[] am;
    int[] an;
    Object[] ao;
    Icon[] ap;
    int[] aq;
    int[] ar;
    int[] as;
    int[] at;
    Icon aC;
    int[] aD;
    int aE;
    int aF;
    int aG;
    int aH;
    int[] aI;
    int aJ;
    int aK;
    Icon[] aL;
    int[] aM;
    int aN;
    int[] aO;
    int aP;
    int aW;
    int aX;
    int aY;
    int aZ;
    int ba;
    int bb;
    int bc;
    int bd;
    int be;
    int bf;
    int bi;
    int bj;
    int bk;
    int bl;
    int bm;
    int bn;
    Vector bq;
    Vector br;
    Icon bs;
    Icon bt;
    Icon bu;
    int[] bv;
    int[] bw;
    int bx;
    int by;
    Icon[] bz;
    int bA;
    int bB;
    int bC;
    int[] bD;
    int bE;
    int bF;
    int bG;
    int bH;
    int bI;
    int bJ;
    Icon[] bK;
    int[] bN;
    int bO;
    int[] bP;
    int bQ;
    Icon bR;
    int bS;
    int bT;
    Icon bY;
    C0011ak cg;
    String ch;
    Icon ci;
    int ck;
    int[] cl;
    int cm;
    int cn;
    int cq;
    int cr;
    int cs;
    int ct;
    int cu;
    int cx;
    int cy;
    int cz;
    int cA;
    Icon cB;
    int cD;
    int cE;
    int cF;
    int cG;
    Icon cH;
    int[] cK;
    int cL;
    int cM;
    int cN;
    int[] cO;
    int cP;
    int cQ;
    int cR;
    int cS;
    Vector cT;
    Vector cU;
    int cV;
    int cW;
    int cX;
    int cY;
    int cZ;
    int da;
    Icon[] db;
    int[] dd;
    int de;
    int[] df;
    int dg;
    int[] dh;
    int[] di;
    int dj;
    int dk;
    int dl;
    int[] dm;
    int dn;

    /* renamed from: do  reason: not valid java name */
    int f0do;
    String dp;
    int dq;
    int dr;
    int ds;
    int dt;
    Icon dx;
    int dy;
    int dz;
    int[] dA;
    int dB;
    int[] dC;
    int dD;
    int dE;
    int[] dF;
    int dG;
    int dH;
    C0020av dI;
    Icon dM;
    Icon dN;
    Icon[] dO;
    int dP;
    int[] dQ;
    int dR;
    int[] dS;
    int dT;
    Icon dU;
    int dV;
    int dW;
    Icon[] dX;
    Icon dY;
    int[] dZ;
    int ea;
    int eb;
    int ec;
    int[] ed;
    int ee;
    int ef;
    int eg;
    int eh;
    int ei;
    int ej;
    int[] ek;
    int el;
    int em;
    int en;
    int eo;
    int ep;
    int eq;
    int er;
    int es;
    int et;
    int eu;
    int ev;
    int ew;
    int ex;
    C0009ai ey;
    boolean ez;
    Vector eA;
    String[] eB;
    int eC;
    int eD;
    int eE;
    int eF;
    int eG;
    int eH;
    C0009ai eI;
    int eJ;
    int eK;
    int eL;
    int eM;
    int eN;
    int eO;
    C0009ai eP;
    Icon[] eS;
    int[] eW;
    int[] eX;
    int[] eY;
    int eZ;
    int fb;
    int fc;
    int fd;
    int fe;
    int ff;
    int fj;
    int fk;
    int fl;
    int fm;
    int fn;
    int fo;
    int fp;
    int fq;
    Icon fr;
    int[] fs;
    int ft;
    int fu;
    int fv;
    int fw;
    int fx;
    int fy;
    int fz;
    int fA;
    Icon[] fB;
    int[] fC;
    int fD;
    int[] fE;
    int fF;
    String[] fG;
    int[] fH;
    int[] fI;
    int[] fJ;
    int[] fK;
    int fL;
    int fM;
    Icon fN;
    int fO;
    int fP;
    int fQ;
    int fR;
    int[] fS;
    int fT;
    int fU;
    Icon fV;
    int fW;
    int fX;
    int fY;
    int fZ;
    Icon ga;
    int gb;
    long gc;
    String[] gd;
    C0011ak gg;
    String gh;
    C0020av gi;
    C0020av gj;
    int gk;
    int gl;
    boolean gm;
    C0009ai gn;
    int go;
    int gp;
    int gq;
    int[] gr;
    int gs;
    int gt;
    int gu;
    int gv;
    int gw;
    int gx;
    boolean gy;
    Icon gz;
    String gA;
    Icon gB;
    Icon gC;
    Icon gD;
    Icon[] gE;
    boolean gF;
    boolean gG;
    int gH;
    int gI;
    Icon[] gJ;
    static int gK;
    static int gL;
    boolean gM;
    boolean gN;
    private Icon ul;
    Icon gP;
    Icon gQ;
    Icon gR;
    int[] gS;
    int[] gT;
    Icon[] gU;
    int[] gV;
    int[] gW;
    Icon gX;
    int gY;
    int gZ;
    int[] ha;
    int[] hb;
    int hc;
    int hd;
    int he;
    int hf;
    Icon hg;
    int hh;
    int hi;
    int hj;
    int hk;
    int hl;
    int hm;
    Icon[] hn;
    int ho;
    int hp;
    int hq;
    boolean hr;
    Vector hs;
    Vector ht;
    Icon hu;
    Icon[] hv;
    int hw;
    int[] hx;
    int hy;
    int[] hz;
    int hA;
    Icon[] hB;
    int hC;
    int[] hD;
    int hE;
    int[] hF;
    int hG;
    Icon[] hH;
    int[] hI;
    int hJ;
    int[] hK;
    int hL;
    Icon[] hM;
    int hN;
    int[] hO;
    int hP;
    int[] hQ;
    int hR;
    int[] hS;
    int hT;
    int hU;
    Vector[] hV;
    Vector[] hW;
    int[] hX;
    int[] hY;
    int hZ;
    int ia;
    int ib;
    int[] ic;
    int id;
    int ie;
    Icon ij;
    int ik;
    int il;
    C0011ak im;
    int in;
    int io;
    int is;
    int it;
    C0011ak iu;
    Icon iv;
    int iw;
    int ix;
    int iy;
    int iz;
    Icon iA;
    int iB;
    int iC;
    long iD;
    boolean iE;
    boolean iF;
    int iG;
    int iH;
    Icon iI;
    int iJ;
    int iK;
    int iL;
    int[] iM;
    int iN;
    int iO;
    Icon iP;
    int iQ;
    int iR;
    int iS;
    int iT;
    Icon iU;
    int iV;
    int iW;
    boolean iX;
    int iY;
    int iZ;
    int ja;
    int jb;
    int jc;
    int jd;
    long je;
    Icon[] jg;
    int jh;
    int ji;
    int jj;
    JTextField jk;
    long jl;
    long jm;
    long jn;
    String jo;
    JScrollPane jp;
    JScrollBar jq;
    JTextPane jr;
    Document js;
    Icon jt;
    Icon ju;
    int jv;
    int jw;
    Icon[] jx;
    int jy;
    int[] jz;
    int jA;
    int jB;
    int jC;
    Icon jD;
    int jE;
    int jF;
    int jG;
    int[] jH;
    int jI;
    Icon jJ;
    Icon jK;
    int jL;
    int jM;
    Icon[] jN;
    String[] jO;
    String[] jP;
    int jQ;
    int jR;
    int jS;
    int[] jT;
    Icon jU;
    int jV;
    int jW;
    int jX;
    int[] jY;
    int jZ;
    int ka;
    String kb;
    String[] kc;
    Icon[] kd;
    int ke;
    int kf;
    Icon kg;
    int kh;
    int ki;
    int kj;
    int kk;
    int[] kl;
    int km;
    int kn;
    Vector ko;
    int[] kp;
    int[] kq;
    int kr;
    int ks;
    int kt;
    int[] ku;
    int kv;
    int kw;
    Icon kB;
    int kC;
    int kD;
    C0011ak kE;
    int kF;
    int kG;
    int kK;
    int kL;
    C0011ak kM;
    Icon kN;
    int kO;
    int kP;
    boolean kQ;
    Icon kR;
    int kS;
    int kT;
    Icon kU;
    int kV;
    int kW;
    int kX;
    int[] kY;
    int kZ;
    int la;
    Icon lb;
    int lc;
    int ld;
    int le;
    int lf;
    Icon lg;
    int lh;
    int li;
    boolean lj;
    int lk;
    int ll;
    long lm;
    Icon[] lo;
    int lp;
    int lq;
    int lr;
    boolean ls;
    aX lt;
    O lu;
    C0040t lv;
    Icon lw;
    Icon[] lx;
    int ly;
    int lz;
    int lA;
    int lB;
    int lC;
    int lD;
    int lE;
    C0010aj lF;
    C0043x lG;
    C0024c lH;
    Icon lI;
    aJ lJ;
    Icon[][] lK;
    Icon[][] lL;
    int[] lM;
    int[] lN;
    int[] lO;
    int[] lP;
    int lQ;
    int lR;
    int lU;
    int lW;
    int lX;
    int lY;
    Icon lZ;
    Icon ma;
    Icon mb;
    Icon mc;
    Icon[] md;
    int me;
    int mf;
    int mg;
    int mh;
    int mi;
    int mj;
    int mk;
    int ml;
    int mm;
    int mn;
    int mo;
    int mp;
    int mq;
    int mr;
    int[] ms;
    int[] mt;
    int mu;
    int mv;
    int mw;
    int[] mx;
    int my;
    int mz;
    int mA;
    JTextField mB;
    boolean mC;
    boolean mD;
    boolean mE;
    S mF;
    Icon[] mG;
    int mH;
    int mI;
    int mJ;
    Icon mK;
    Icon mL;
    Icon mM;
    Icon mN;
    Icon mO;
    int mQ;
    JTextField mR;
    JTextField mS;
    JTextField mT;
    JTextField mU;
    JPasswordField mV;
    JPasswordField mW;
    int mX;
    int mY;
    int mZ;
    int na;
    int nb;
    int nc;
    int nd;
    int ne;
    int nf;
    int ng;
    int nh;
    int ni;
    int nj;
    int nk;
    int nl;
    int nm;
    int nn;
    int no;
    int np;
    int nq;
    int nr;
    int ns;
    int nt;
    int nu;
    int nv;
    int nw;
    int nx;
    boolean ny;
    boolean nz;
    boolean nA;
    boolean nB;
    Icon[] nC;
    int nD;
    int nE;
    int nF;
    Icon nG;
    int[] nH;
    int[] nI;
    int nJ;
    int nK;
    JLabel[] nL;
    Icon nZ;
    Icon[][] oa;
    int[] ob;
    int[] oc;
    int[] od;
    Icon[][] oe;
    int[] of;
    int[] og;
    int[] oh;
    int[] oi;
    int[] oj;
    int ok;
    int ol;
    int om;
    Icon on;
    JLabel oo;
    String op;
    int oq;
    long or;
    long os;
    Icon[] ot;
    int ou;
    int ov;
    int ow;
    int ox;
    int oy;
    int oz;
    int oA;
    int oB;
    int oC;
    boolean oD;
    boolean oE;
    Icon oF;
    int oG;
    int oH;
    static int oI;
    static String oJ;
    static int oK;
    static int oL;
    static int oM;
    int oO;
    int oP;
    int oQ;
    int oR;
    Icon oS;
    Icon[] oT;
    int[] oU;
    int[] oV;
    int oW;
    int oX;
    int oY;
    Socket pb;
    Y pc;
    JTextField pf;
    String pg;
    Icon ph;
    int pi;
    long pl;
    long pm;
    Icon pn;
    Icon po;
    JTextField pp;
    JPasswordField pq;
    int pr;
    int ps;
    int pt;
    int pu;
    int pv;
    int pw;
    int px;
    int py;
    Icon[] pz;
    int pA;
    int pB;
    int pC;
    boolean pD;
    Icon pE;
    Icon[] pF;
    int[] pG;
    int[] pH;
    int pI;
    int pJ;
    int pK;
    long pN;
    Icon pO;
    public C0045z pP;
    public aA pQ;
    public Q pR;
    public U pT;
    private K um;
    private G un;
    private C0008ah uo;
    private T up;
    private static X uq;
    private C0001aa ur;
    Thread pU;
    aE pW;
    C0031j pX;
    String[] pY;
    boolean pZ;
    AudioClip qa;
    AudioClip qb;
    AudioClip qc;
    byte qd;
    C0021aw qi;
    byte qk;
    boolean ql;
    static final String qr = "CS";
    static final String qs = "VC";
    static final String qt = "WV";
    static final String qu = "CP";
    static final String qv = "WP";
    static final String qw = "CV";
    static final String qx = "LI";
    byte qz;
    static final String qA = "RC";
    static final String qB = "CR";
    static final String qC = "TF";
    static final String qD = "SI";
    static final String qE = "CN";
    static final String qF = "IS";
    static final String qG = "R1";
    static final String qH = "R2";
    static final String qI = "R3";
    static final String qJ = "R4";
    static final String qK = "R5";
    static final String qL = "R6";
    static final String qM = "P1";
    static final String qN = "P2";
    static final String qO = "P3";
    static final String qP = "P4";
    static final String qQ = "P5";
    static final String qR = "P6";
    static final String qS = "RD";
    static final String qT = "BA";
    boolean rc;
    static final String rd = "|";
    static final String re = "\n";
    static final String rf = "CI";
    static final String rg = "ST";
    static final String rh = "AP";
    static final String ri = "IS";
    static final String rj = "I1";
    static final String rk = "I2";
    static final String rl = "I3";
    static final String rm = "I4";
    static final String rn = "I5";
    static final String ro = "I6";
    static final String rp = "LU";
    static final String rq = "KA";
    static final String rr = "AF";
    static final String rs = "CT";
    static final String rt = "EM";
    static final String ru = "WS";
    static final String rv = "WK";
    static final String rw = "LV";
    static final String rx = "KO";
    static final String ry = "P1|H\n";
    static final String rz = "P1|D\n";
    static final String rA = "P2";
    static final String rB = "P3";
    static final String rC = "P4";
    static final String rD = "P5";
    static final String rE = "P6";
    static final String rF = "P7";
    static final String rG = "P8";
    static final String rH = "S1";
    static final String rI = "SN";
    static final String rJ = "SY";
    static final String rK = "S2";
    static final String rL = "S19";
    static final String rM = "S3";
    static final String rN = "S5";
    static final String rO = "S9";
    static final String rP = "S10";
    static final String rQ = "S6";
    static final String rR = "S20";
    static final String rS = "S21";
    static final String rT = "S11";
    static final String rU = "S12";
    static final String rV = "S14";
    static final String rW = "S13";
    static final String rX = "S15";
    static final String rY = "S16";
    static final String rZ = "S7";
    static final String sa = "S17";
    static final String sb = "S8";
    static final String sc = "S4";
    static final String sd = "BS";
    static final String se = "BR";
    static final String sf = "BO";
    static final String sg = "BA";
    static final String sh = "BD";
    static final String si = "C1";
    static final String sj = "C2";
    static final String sk = "C3";
    static final String sl = "C4";
    static final String sm = "";
    static final String sn = "H1";
    static final String so = "H2";
    static final String sp = "H3";
    static final String sq = "H4";
    static final String sr = "H5";
    static final String ss = "H6";
    static final String st = "H7";
    static final String su = "H8";
    static final String sv = "H9";
    static final String sw = "H10";
    static final String sx = "H11";
    static final String sy = "H12";
    static final String sz = "H16";
    static final String sA = "H17";
    static final String sB = "H18";
    static final String sC = "H19";
    static final String sD = "H20";
    static final String sE = "H21";
    static final String sF = "H22";
    static final String sG = "H23";
    static final String sH = "H24";
    static final String sI = "H13";
    static final String sJ = "H14";
    static final String sK = "H15";
    static final String sL = "H25";
    static final String sM = "H26";
    static final String sN = "H27";
    static final String sO = "H28";
    static final String sP = "O1";
    static final String sQ = "O3";
    static final String sR = "O2";
    static final String sS = "O4";
    static final String sT = "PI";
    static final String sU = "PS";
    static final String sV = "AS";
    static final String sW = "LS";
    static final String sX = "SL";
    static final String sY = "LE1";
    static final String sZ = "LE2";
    static final String ta = "LE3";
    static final String tb = "LE5";
    static final String tc = "LE4";
    static final String td = "LE6";
    static final String te = "RC";
    static final String tf = "WR";
    static final String tg = "PW";
    static final String th = "PCD";
    static final String ti = "RPD";
    static final String tj = "T1";
    static final String tk = "T2";
    static final String tl = "T11";
    static final String tm = "T10";
    static final String tn = "T3";
    static final String to = "T4";
    static final String tp = "T5";
    static final String tq = "T6";
    static final String tr = "T7";
    static final String ts = "T8";
    static final String tt = "T9";
    static final String tu = "T12";
    static final String tv = "T13";
    static final String tw = "T14";
    static final String tx = "T15";
    static final String ty = "T16";
    static final String tz = "T17";
    static final String tA = "T18";
    static final String tB = "T19";
    static final String tC = "T20";
    static final String tD = "T21";
    static final String tE = "T22";
    static final String tF = "L1";
    static final String tG = "L2";
    static final String tH = "L3";
    static final String tI = "L4";
    static final String tJ = "L5";
    static final String tK = "L6";
    static final String tL = "L7";
    static final String tM = "L8";
    static final String tN = "L9";
    static final String tO = "L10";
    static final String tP = "L11";
    static final String tQ = "L12";
    static final String tR = "L13";
    static final String tS = "L14";
    static final String tT = "L15";
    static final String tU = "OW";
    static final String tV = "U1";
    static final String tW = "U2";
    static final String tX = "U3";
    static final String tY = "PSR";
    static final String tZ = "G1";
    static final String ua = "G2";
    JLabel uc;
    static int cp = 11;
    static int fi = 11;
    static String[] mP = {"                 Registration Successful!", "This email address has been registered already!", "        This userID has been registered already!", "UserID and email address have been used already!", "         Please fill in all the fields required!", "  Please restrict your user ID to 10 characters!", " Please restrict your password to 10 characters!", "                Different set of passwords!"};
    public static MastersOfDestiny pS = null;
    boolean e = false;
    int f = 0;
    boolean P = false;
    boolean Q = false;
    boolean R = false;
    BufferedReader T = null;
    PrintWriter U = null;
    private final byte ud = 0;
    private final byte ue = 1;
    private final byte uf = 2;
    private final byte ug = 3;
    private final byte uh = 4;
    private final byte ui = 5;
    private final byte uj = 6;
    private final byte uk = 7;
    final byte au = 0;
    final byte av = 1;
    final byte aw = 2;
    final byte ax = 3;
    final byte ay = 4;
    final byte az = 5;
    int aA = -1;
    int aB = -1;
    final byte aQ = 0;
    final byte aR = 1;
    int aS = 0;
    int aT = 0;
    int aU = 0;
    int aV = 0;
    int bg = 0;
    int bh = 8;
    int bo = 0;
    int bp = 0;
    final byte bL = 0;
    final byte bM = 1;
    int bU = 0;
    boolean bV = false;
    int bW = -1;
    int bX = -1;
    Vector bZ = new Vector();
    Vector ca = new Vector();
    int cb = -1;
    int cc = 0;
    int cd = -1;
    int ce = 0;
    int cf = 0;
    final byte cj = 1;
    int co = -1;
    int cv = 0;
    int cw = 0;
    boolean cC = false;
    boolean cI = false;
    boolean cJ = false;
    int dc = 0;
    int du = -1;
    int dv = -1;
    boolean dw = false;
    boolean dJ = false;
    boolean dK = false;
    boolean dL = false;
    String eQ = null;
    String eR = null;
    final byte eT = 0;
    final byte eU = 1;
    final byte eV = 2;
    int fa = -1;
    int fg = 0;
    int fh = 0;
    final byte ge = 0;
    final byte gf = 1;
    byte gO = 0;

    /* renamed from: if  reason: not valid java name */
    final int f1if = 0;
    final int ig = 1;
    final int ih = 2;
    final int ii = 3;
    final byte ip = 0;
    final byte iq = 1;
    final byte ir = 2;
    final int jf = 300;
    final int kx = 0;
    final int ky = 1;
    final int kz = 2;
    final int kA = 3;
    final byte kH = 0;
    final byte kI = 1;
    final byte kJ = 2;
    final int ln = 300;
    String[] lS = {"  Human", " Taikuus", "    Firan", "Brucian"};
    String[] lT = {"          Character creation successful!", "This character name has already been used!", "You cannot create more than 5 characters!", "No spacing is allowed in character name!"};
    String lV = sm;
    final int nM = 0;
    final int nN = 1;
    final int nO = 2;
    final int nP = 3;
    final int nQ = 4;
    final int nR = 0;
    final int nS = 1;
    final int nT = 0;
    final int nU = 1;
    final int nV = 0;
    final int nW = 1;
    final int nX = 0;
    final int nY = 1;
    int oN = 0;
    final int oZ = 0;
    final int pa = 1;
    BufferedReader pd = null;
    PrintWriter pe = null;
    final int pj = 3;
    boolean pk = false;
    final int pL = 0;
    final int pM = 1;
    boolean pV = true;
    final byte qe = 0;
    final byte qf = 1;
    final byte qg = 2;
    final byte qh = 3;
    boolean qj = false;
    byte qm = 0;
    byte qn = 0;
    boolean qo = false;
    final String qp = e("res/patch/buildVer.txt") + "." + e("res/patch/idList.txt");
    final String qq = "gameThread";
    long qy = 2000;
    String[] qU = new String[5];
    String[] qV = new String[5];
    int[] qW = new int[5];
    String[] qX = new String[5];
    int[] qY = new int[5];
    int[] qZ = new int[5];
    int ra = 0;
    boolean rb = false;
    Vector ub = new Vector();

    public void a(Object obj) {
        C0021aw.b.a(C0028g.f, true);
        p();
        C0032k.a("initializing...........................");
        this.f = 0;
        this.m = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 221)));
        C0032k.a("loadingSplash = " + this.m);
        String[] a = this.pW.a("en", 225, 0, 0);
        this.n = new Icon[a.length];
        for (int i = 0; i < a.length; i++) {
            this.n[i] = new ImageIcon(getClass().getResource(this.g + a[i]));
            C0032k.a("animation = " + this.n[i]);
        }
        try {
            gK = pS.getWidth();
            gL = pS.getHeight();
            this.j = ImageIO.read(getClass().getResource(this.g + this.pW.d("en", 27)));
            this.i = new BufferedImage(gK, gL, 1);
            this.h = new BufferedImage(gK, gL, 1);
            this.i.createGraphics().drawImage(this.j, 0, 0, (ImageObserver) null);
            this.ur.n = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 36)));
            String[] a2 = this.pW.a("en", 215, 0, 0);
            this.ur.o = new Icon[a2.length];
            for (int i2 = 0; i2 < a2.length; i2++) {
                this.ur.o[i2] = new ImageIcon(getClass().getResource(this.g + a2[i2]));
            }
        } catch (IOException e) {
        }
        Enumeration elements = this.k.elements();
        while (elements.hasMoreElements()) {
            C0004ad c0004ad = (C0004ad) elements.nextElement();
            if (c0004ad.D == oI) {
                c0004ad.V = this.i;
            }
        }
        a((byte) 7, (Object) null);
    }

    public void a(Graphics graphics) {
        String[] a;
        String[] a2;
        String[] a3;
        this.m.paintIcon(pS, graphics, 0, 0);
        if (this.qm != 7) {
            return;
        }
        if (this.e) {
            C0032k.a("go to colony");
            a((byte) 5, (Object) null);
            return;
        }
        try {
            switch (this.f) {
                case 0:
                    C0032k.a("initialize = " + this.f);
                    this.o = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 2)));
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    this.f++;
                    break;
                case 1:
                    C0032k.a("initialize = " + this.f);
                    BufferedImage read = ImageIO.read(getClass().getResource(this.g + this.pW.d("en", 88)));
                    BufferedImage bufferedImage = new BufferedImage(read.getWidth((ImageObserver) null), read.getHeight((ImageObserver) null), 1);
                    bufferedImage.createGraphics().drawImage(read, 0, 0, (ImageObserver) null);
                    Icon imageIcon = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 87)));
                    this.q = (C) this.pX.a(Class.forName("C"));
                    this.q.a((byte) 0);
                    this.q.a(imageIcon, bufferedImage);
                    this.q.a(this.pW.b("en", 89), this.pW.b("en", 90));
                    this.q.g();
                    this.p.a(this.q);
                    this.r = (C) this.pX.a(Class.forName("C"));
                    this.r.a((byte) 1);
                    this.r.a(imageIcon, bufferedImage);
                    this.r.a(this.pW.b("en", 91), this.pW.b("en", 92));
                    this.r.g();
                    this.p.a(this.r);
                    this.s = (C) this.pX.a(Class.forName("C"));
                    this.s.a((byte) 2);
                    this.s.a(imageIcon, bufferedImage);
                    this.s.a(this.pW.b("en", 93), this.pW.b("en", 94));
                    this.s.g();
                    this.p.a(this.s);
                    this.t = (C) this.pX.a(Class.forName("C"));
                    this.t.a((byte) 3);
                    this.t.a(imageIcon, bufferedImage);
                    this.t.a(this.pW.b("en", 95), this.pW.b("en", 96));
                    this.t.g();
                    this.p.a(this.t);
                    this.u = (C) this.pX.a(Class.forName("C"));
                    this.u.a((byte) 4);
                    this.u.a(imageIcon, bufferedImage);
                    this.u.a(this.pW.b("en", 97), this.pW.b("en", 98));
                    this.u.g();
                    this.p.a(this.u);
                    this.v = (C) this.pX.a(Class.forName("C"));
                    this.v.a((byte) 5);
                    this.v.a(imageIcon, bufferedImage);
                    this.v.a(this.pW.b("en", 99), this.pW.b("en", 100));
                    this.v.g();
                    this.p.a(this.v);
                    this.w = (C) this.pX.a(Class.forName("C"));
                    this.w.a((byte) 6);
                    this.w.a(imageIcon, bufferedImage);
                    this.w.a(this.pW.b("en", 101), this.pW.b("en", 102));
                    this.w.g();
                    this.p.a(this.w);
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    this.f++;
                    break;
                case 2:
                    C0032k.a("initialize = " + this.f);
                    this.y = (C0006af) this.pX.a(Class.forName("af"));
                    this.y.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 61))));
                    this.y.a(this.pW.b("en", 64), this.pW.b("en", 65));
                    this.y.g();
                    this.x.a(this.y);
                    this.z = (C0006af) this.pX.a(Class.forName("af"));
                    this.z.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 66))));
                    this.z.a(this.pW.b("en", 67), this.pW.b("en", 68));
                    Icon[] iconArr = new Icon[this.pW.a("en", 183, 0, 0).length];
                    for (int i = 0; i < iconArr.length; i++) {
                        iconArr[i] = new ImageIcon(getClass().getResource(this.g + a3[i]));
                    }
                    this.z.a(iconArr, this.pW.b("en", 184), this.pW.b("en", 185));
                    this.z.g();
                    this.x.a(this.z);
                    this.A = (C0006af) this.pX.a(Class.forName("af"));
                    this.A.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 61))));
                    this.A.a(this.pW.b("en", 62), this.pW.b("en", 63));
                    this.A.g();
                    this.x.a(this.A);
                    this.B = (C0006af) this.pX.a(Class.forName("af"));
                    this.B.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 69))));
                    this.B.a(this.pW.b("en", 70), this.pW.b("en", 71));
                    this.B.g();
                    this.x.a(this.B);
                    this.C = (C0006af) this.pX.a(Class.forName("af"));
                    this.C.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 72))));
                    this.C.a(this.pW.b("en", 73), this.pW.b("en", 74));
                    this.C.g();
                    this.x.a(this.C);
                    this.D = (C0006af) this.pX.a(Class.forName("af"));
                    this.D.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 75))));
                    this.D.a(this.pW.b("en", 76), this.pW.b("en", 77));
                    this.D.g();
                    this.x.a(this.D);
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    this.f++;
                    break;
                case 3:
                    C0032k.a("initialize = " + this.f);
                    this.I = (C0006af) this.pX.a(Class.forName("af"));
                    this.I.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 78))));
                    this.I.a(this.pW.b("en", 79), this.pW.b("en", 80));
                    Icon[] iconArr2 = new Icon[this.pW.a("en", 189, 0, 0).length];
                    for (int i2 = 0; i2 < iconArr2.length; i2++) {
                        iconArr2[i2] = new ImageIcon(getClass().getResource(this.g + a[i2]));
                    }
                    this.I.a(iconArr2, this.pW.b("en", 190), this.pW.b("en", 191));
                    this.I.g();
                    this.H.a(this.I);
                    this.J = (C0006af) this.pX.a(Class.forName("af"));
                    this.J.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 84))));
                    this.J.a(this.pW.b("en", 85), this.pW.b("en", 86));
                    this.J.g();
                    this.H.a(this.J);
                    this.K = (C0006af) this.pX.a(Class.forName("af"));
                    this.K.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 81))));
                    this.K.a(this.pW.b("en", 82), this.pW.b("en", 83));
                    Icon[] iconArr3 = new Icon[this.pW.a("en", 186, 0, 0).length];
                    for (int i3 = 0; i3 < iconArr3.length; i3++) {
                        iconArr3[i3] = new ImageIcon(getClass().getResource(this.g + a2[i3]));
                    }
                    this.K.a(iconArr3, this.pW.b("en", 187), this.pW.b("en", 188));
                    this.K.g();
                    this.H.a(this.K);
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    this.f++;
                    break;
                case 4:
                    C0032k.a("initialize = " + this.f);
                    this.O = (H) this.pX.a(Class.forName("H"));
                    this.O.a(new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 216))), new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 217))), new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 218))));
                    this.M.a(this.O);
                    this.M.a(this.N);
                    this.p.g();
                    this.x.g();
                    this.F.g();
                    this.H.g();
                    this.M.g();
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    this.f++;
                    break;
                case 5:
                    C0032k.a("initialize = " + this.f);
                    this.ur.y = new ImageIcon(getClass().getResource(this.ur.f("en", 540)));
                    this.ur.z = new ImageIcon(getClass().getResource(this.ur.f("en", 547)));
                    this.ur.T = new ImageIcon(getClass().getResource(this.ur.f("en", 543)));
                    this.ur.Y = new ImageIcon(getClass().getResource(this.ur.f("en", 544)));
                    this.ur.ad = new ImageIcon(getClass().getResource(this.ur.f("en", 545)));
                    this.ur.ai = new ImageIcon(getClass().getResource(this.ur.f("en", 546)));
                    this.ur.U = new ImageIcon(getClass().getResource(this.ur.f("en", 573)));
                    this.ur.Z = new ImageIcon(getClass().getResource(this.ur.f("en", 574)));
                    this.ur.ae = new ImageIcon(getClass().getResource(this.ur.f("en", 575)));
                    this.ur.aj = new ImageIcon(getClass().getResource(this.ur.f("en", 576)));
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    this.f++;
                    break;
                case 6:
                    C0001aa c0001aa = this.ur;
                    C0001aa.c = V;
                    this.ur.e = oI;
                    this.ur.d = Y;
                    this.ur.f = oJ;
                    C0032k.a("initialize = " + this.f);
                    this.ur.q = this.pT;
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    this.e = true;
                    C0032k.a("finish init go to colony");
                    a((byte) 5, (Object) null);
                    break;
            }
        } catch (IOException e) {
            C0032k.a("[Colony State] IOException: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e2) {
            C0032k.a("[Colony State] ClassNotFoundException: " + e2.getMessage());
        } catch (Exception e3) {
            C0032k.a("init Exception " + e3.getMessage());
            e3.printStackTrace();
        }
    }

    public void b(Object obj) {
        C0021aw.b.a(C0028g.h, true);
        p();
        C0032k.a("initializing...........................");
        this.f = 0;
        this.m = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 220)));
        C0032k.a("loadingSplash = " + this.m);
        String[] a = this.pW.a("en", 225, 0, 0);
        this.n = new Icon[a.length];
        for (int i = 0; i < a.length; i++) {
            this.n[i] = new ImageIcon(getClass().getResource(this.g + a[i]));
            C0032k.a("animation = " + this.n[i]);
        }
        try {
            gK = pS.getWidth();
            gL = pS.getHeight();
            this.j = ImageIO.read(getClass().getResource(this.g + this.pW.d("en", 819)));
            this.i = new BufferedImage(gK, gL, 1);
            this.h = new BufferedImage(gK, gL, 1);
            this.i.createGraphics().drawImage(this.j, 0, 0, (ImageObserver) null);
            this.ur.n = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 36)));
            String[] a2 = this.pW.a("en", 215, 0, 0);
            this.ur.o = new Icon[a2.length];
            for (int i2 = 0; i2 < a2.length; i2++) {
                this.ur.o[i2] = new ImageIcon(getClass().getResource(this.g + a2[i2]));
            }
        } catch (IOException e) {
        }
        Enumeration elements = this.k.elements();
        while (elements.hasMoreElements()) {
            C0004ad c0004ad = (C0004ad) elements.nextElement();
            if (c0004ad.D == oI) {
                c0004ad.V = this.i;
            }
        }
        a((byte) 27, (Object) null);
    }

    public void b(Graphics graphics) {
        String[] a;
        String[] a2;
        String[] a3;
        this.m.paintIcon(pS, graphics, 0, 0);
        if (this.qm != 27) {
            return;
        }
        if (this.P) {
            C0032k.a("go to colony");
            a((byte) 5, (Object) null);
            return;
        }
        try {
            switch (this.f) {
                case 0:
                    C0032k.a("initialize = " + this.f);
                    this.o = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 824)));
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    this.f++;
                    break;
                case 1:
                    C0032k.a("initialize = " + this.f);
                    BufferedImage read = ImageIO.read(getClass().getResource(this.g + this.pW.d("en", 770)));
                    BufferedImage bufferedImage = new BufferedImage(read.getWidth((ImageObserver) null), read.getHeight((ImageObserver) null), 1);
                    bufferedImage.createGraphics().drawImage(read, 0, 0, (ImageObserver) null);
                    Icon imageIcon = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 771)));
                    this.q = (C) this.pX.a(Class.forName("C"));
                    this.q.a((byte) 0);
                    this.q.a(imageIcon, bufferedImage);
                    this.q.a(this.pW.b("en", 772), this.pW.b("en", 773));
                    this.q.g();
                    this.p.a(this.q);
                    this.r = (C) this.pX.a(Class.forName("C"));
                    this.r.a((byte) 1);
                    this.r.a(imageIcon, bufferedImage);
                    this.r.a(this.pW.b("en", 774), this.pW.b("en", 775));
                    this.r.g();
                    this.p.a(this.r);
                    this.s = (C) this.pX.a(Class.forName("C"));
                    this.s.a((byte) 2);
                    this.s.a(imageIcon, bufferedImage);
                    this.s.a(this.pW.b("en", 776), this.pW.b("en", 777));
                    this.s.g();
                    this.p.a(this.s);
                    this.t = (C) this.pX.a(Class.forName("C"));
                    this.t.a((byte) 3);
                    this.t.a(imageIcon, bufferedImage);
                    this.t.a(this.pW.b("en", 778), this.pW.b("en", 779));
                    this.t.g();
                    this.p.a(this.t);
                    this.u = (C) this.pX.a(Class.forName("C"));
                    this.u.a((byte) 4);
                    this.u.a(imageIcon, bufferedImage);
                    this.u.a(this.pW.b("en", 780), this.pW.b("en", 781));
                    this.u.g();
                    this.p.a(this.u);
                    this.v = (C) this.pX.a(Class.forName("C"));
                    this.v.a((byte) 5);
                    this.v.a(imageIcon, bufferedImage);
                    this.v.a(this.pW.b("en", 782), this.pW.b("en", 783));
                    this.v.g();
                    this.p.a(this.v);
                    this.w = (C) this.pX.a(Class.forName("C"));
                    this.w.a((byte) 6);
                    this.w.a(imageIcon, bufferedImage);
                    this.w.a(this.pW.b("en", 784), this.pW.b("en", 785));
                    this.w.g();
                    this.p.a(this.w);
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    this.f++;
                    break;
                case 2:
                    C0032k.a("initialize = " + this.f);
                    this.J = (C0006af) this.pX.a(Class.forName("af"));
                    this.J.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 786))));
                    this.J.a(this.pW.b("en", 787), this.pW.b("en", 788));
                    Icon[] iconArr = new Icon[this.pW.a("en", 789, 0, 0).length];
                    for (int i = 0; i < iconArr.length; i++) {
                        iconArr[i] = new ImageIcon(getClass().getResource(this.g + a[i]));
                    }
                    this.J.a(iconArr, this.pW.b("en", 790), this.pW.b("en", 791));
                    this.J.g();
                    this.x.a(this.J);
                    this.z = (C0006af) this.pX.a(Class.forName("af"));
                    this.z.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 792))));
                    this.z.a(this.pW.b("en", 793), this.pW.b("en", 794));
                    Icon[] iconArr2 = new Icon[this.pW.a("en", 795, 0, 0).length];
                    for (int i2 = 0; i2 < iconArr2.length; i2++) {
                        iconArr2[i2] = new ImageIcon(getClass().getResource(this.g + a2[i2]));
                    }
                    this.z.a(iconArr2, this.pW.b("en", 796), this.pW.b("en", 797));
                    this.z.g();
                    this.x.a(this.z);
                    this.B = (C0006af) this.pX.a(Class.forName("af"));
                    this.B.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 798))));
                    this.B.a(this.pW.b("en", 799), this.pW.b("en", 800));
                    Icon[] iconArr3 = new Icon[this.pW.a("en", 801, 0, 0).length];
                    for (int i3 = 0; i3 < iconArr3.length; i3++) {
                        iconArr3[i3] = new ImageIcon(getClass().getResource(this.g + a3[i3]));
                    }
                    this.B.a(iconArr3, this.pW.b("en", 802), this.pW.b("en", 803));
                    this.B.g();
                    this.x.a(this.B);
                    this.D = (C0006af) this.pX.a(Class.forName("af"));
                    this.D.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 804))));
                    this.D.a(this.pW.b("en", 805), this.pW.b("en", 806));
                    this.D.g();
                    this.x.a(this.D);
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    this.f++;
                    break;
                case 3:
                    C0032k.a("initialize = " + this.f);
                    this.K = (C0006af) this.pX.a(Class.forName("af"));
                    this.K.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 807))));
                    this.K.a(this.pW.b("en", 808), this.pW.b("en", 809));
                    this.K.g();
                    this.H.a(this.K);
                    this.I = (C0006af) this.pX.a(Class.forName("af"));
                    this.I.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 810))));
                    this.I.a(this.pW.b("en", 811), this.pW.b("en", 812));
                    this.I.g();
                    this.H.a(this.I);
                    this.C = (C0006af) this.pX.a(Class.forName("af"));
                    this.C.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 813))));
                    this.C.a(this.pW.b("en", 814), this.pW.b("en", 815));
                    this.C.g();
                    this.H.a(this.C);
                    this.E = (C0006af) this.pX.a(Class.forName("af"));
                    this.E.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 816))));
                    this.E.a(this.pW.b("en", 817), this.pW.b("en", 818));
                    this.E.g();
                    this.H.a(this.E);
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    this.f++;
                    break;
                case 4:
                    C0032k.a("initialize = " + this.f);
                    this.O = (H) this.pX.a(Class.forName("H"));
                    this.O.a(new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 216))), new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 217))), new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 218))));
                    this.M.a(this.O);
                    this.M.a(this.N);
                    this.p.g();
                    this.x.g();
                    this.F.g();
                    this.H.g();
                    this.M.g();
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    this.f++;
                    break;
                case 5:
                    C0032k.a("initialize = " + this.f);
                    this.ur.y = new ImageIcon(getClass().getResource(this.ur.f("en", 540)));
                    this.ur.z = new ImageIcon(getClass().getResource(this.ur.f("en", 547)));
                    this.ur.T = new ImageIcon(getClass().getResource(this.ur.f("en", 543)));
                    this.ur.Y = new ImageIcon(getClass().getResource(this.ur.f("en", 544)));
                    this.ur.ad = new ImageIcon(getClass().getResource(this.ur.f("en", 545)));
                    this.ur.ai = new ImageIcon(getClass().getResource(this.ur.f("en", 546)));
                    this.ur.U = new ImageIcon(getClass().getResource(this.ur.f("en", 573)));
                    this.ur.Z = new ImageIcon(getClass().getResource(this.ur.f("en", 574)));
                    this.ur.ae = new ImageIcon(getClass().getResource(this.ur.f("en", 575)));
                    this.ur.aj = new ImageIcon(getClass().getResource(this.ur.f("en", 576)));
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    this.f++;
                    break;
                case 6:
                    C0001aa c0001aa = this.ur;
                    C0001aa.c = V;
                    this.ur.e = oI;
                    this.ur.d = Y;
                    this.ur.f = oJ;
                    C0032k.a("initialize = " + this.f);
                    this.ur.q = this.pT;
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    this.P = true;
                    C0032k.a("finish init go to colony");
                    a((byte) 5, (Object) null);
                    break;
            }
        } catch (IOException e) {
            C0032k.a("[Colony State] IOException: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e2) {
            C0032k.a("[Colony State] ClassNotFoundException: " + e2.getMessage());
        } catch (Exception e3) {
            C0032k.a("init Exception " + e3.getMessage());
            e3.printStackTrace();
        }
    }

    public void c(Object obj) {
        C0021aw.b.a(C0028g.g, true);
        p();
        C0032k.a("initializing...........................");
        this.f = 0;
        this.m = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 223)));
        C0032k.a("loadingSplash = " + this.m);
        String[] a = this.pW.a("en", 225, 0, 0);
        this.n = new Icon[a.length];
        for (int i = 0; i < a.length; i++) {
            this.n[i] = new ImageIcon(getClass().getResource(this.g + a[i]));
            C0032k.a("animation = " + this.n[i]);
        }
        try {
            gK = pS.getWidth();
            gL = pS.getHeight();
            this.j = ImageIO.read(getClass().getResource(this.g + this.pW.d("en", 822)));
            this.i = new BufferedImage(gK, gL, 1);
            this.h = new BufferedImage(gK, gL, 1);
            this.i.createGraphics().drawImage(this.j, 0, 0, (ImageObserver) null);
            this.ur.n = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 36)));
            String[] a2 = this.pW.a("en", 215, 0, 0);
            this.ur.o = new Icon[a2.length];
            for (int i2 = 0; i2 < a2.length; i2++) {
                this.ur.o[i2] = new ImageIcon(getClass().getResource(this.g + a2[i2]));
            }
        } catch (IOException e) {
        }
        Enumeration elements = this.k.elements();
        while (elements.hasMoreElements()) {
            C0004ad c0004ad = (C0004ad) elements.nextElement();
            if (c0004ad.D == oI) {
                c0004ad.V = this.i;
            }
        }
        a((byte) 25, (Object) null);
    }

    public void c(Graphics graphics) {
        String[] a;
        String[] a2;
        String[] a3;
        String[] a4;
        this.m.paintIcon(pS, graphics, 0, 0);
        if (this.qm != 25) {
            return;
        }
        try {
            switch (this.f) {
                case 0:
                    C0032k.a("initialize = " + this.f);
                    this.o = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 823)));
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    this.f++;
                    break;
                case 1:
                    C0032k.a("initialize = " + this.f);
                    BufferedImage read = ImageIO.read(getClass().getResource(this.g + this.pW.d("en", 825)));
                    BufferedImage bufferedImage = new BufferedImage(read.getWidth((ImageObserver) null), read.getHeight((ImageObserver) null), 1);
                    bufferedImage.createGraphics().drawImage(read, 0, 0, (ImageObserver) null);
                    Icon imageIcon = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 826)));
                    this.q = (C) this.pX.a(Class.forName("C"));
                    this.q.a((byte) 0);
                    this.q.a(imageIcon, bufferedImage);
                    this.q.a(this.pW.b("en", 827), this.pW.b("en", 828));
                    this.q.g();
                    this.p.a(this.q);
                    this.r = (C) this.pX.a(Class.forName("C"));
                    this.r.a((byte) 1);
                    this.r.a(imageIcon, bufferedImage);
                    this.r.a(this.pW.b("en", 829), this.pW.b("en", 830));
                    this.r.g();
                    this.p.a(this.r);
                    this.s = (C) this.pX.a(Class.forName("C"));
                    this.s.a((byte) 2);
                    this.s.a(imageIcon, bufferedImage);
                    this.s.a(this.pW.b("en", 831), this.pW.b("en", 832));
                    this.s.g();
                    this.p.a(this.s);
                    this.t = (C) this.pX.a(Class.forName("C"));
                    this.t.a((byte) 3);
                    this.t.a(imageIcon, bufferedImage);
                    this.t.a(this.pW.b("en", 833), this.pW.b("en", 834));
                    this.t.g();
                    this.p.a(this.t);
                    this.u = (C) this.pX.a(Class.forName("C"));
                    this.u.a((byte) 4);
                    this.u.a(imageIcon, bufferedImage);
                    this.u.a(this.pW.b("en", 835), this.pW.b("en", 836));
                    this.u.g();
                    this.p.a(this.u);
                    this.v = (C) this.pX.a(Class.forName("C"));
                    this.v.a((byte) 5);
                    this.v.a(imageIcon, bufferedImage);
                    this.v.a(this.pW.b("en", 837), this.pW.b("en", 838));
                    this.v.g();
                    this.p.a(this.v);
                    this.w = (C) this.pX.a(Class.forName("C"));
                    this.w.a((byte) 6);
                    this.w.a(imageIcon, bufferedImage);
                    this.w.a(this.pW.b("en", 839), this.pW.b("en", 840));
                    this.w.g();
                    this.p.a(this.w);
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    this.f++;
                    break;
                case 2:
                    C0032k.a("initialize = " + this.f);
                    this.J = (C0006af) this.pX.a(Class.forName("af"));
                    this.J.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 841))));
                    this.J.a(this.pW.b("en", 845), this.pW.b("en", 846));
                    Icon[] iconArr = new Icon[this.pW.a("en", 842, 0, 0).length];
                    for (int i = 0; i < iconArr.length; i++) {
                        iconArr[i] = new ImageIcon(getClass().getResource(this.g + a4[i]));
                    }
                    this.J.a(iconArr, this.pW.b("en", 843), this.pW.b("en", 844));
                    this.J.g();
                    this.x.a(this.J);
                    this.B = (C0006af) this.pX.a(Class.forName("af"));
                    this.B.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 853))));
                    this.B.a(this.pW.b("en", 854), this.pW.b("en", 855));
                    this.B.g();
                    this.x.a(this.B);
                    this.K = (C0006af) this.pX.a(Class.forName("af"));
                    this.K.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 859))));
                    this.K.a(this.pW.b("en", 860), this.pW.b("en", 861));
                    this.K.g();
                    this.x.a(this.K);
                    this.D = (C0006af) this.pX.a(Class.forName("af"));
                    this.D.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 856))));
                    this.D.a(this.pW.b("en", 857), this.pW.b("en", 858));
                    this.D.g();
                    this.x.a(this.D);
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    this.f++;
                    break;
                case 3:
                    C0032k.a("initialize = " + this.f);
                    this.I = (C0006af) this.pX.a(Class.forName("af"));
                    this.I.a((Icon) null);
                    Icon[] iconArr2 = new Icon[this.pW.a("en", 862, 0, 0).length];
                    for (int i2 = 0; i2 < iconArr2.length; i2++) {
                        iconArr2[i2] = new ImageIcon(getClass().getResource(this.g + a[i2]));
                    }
                    this.I.a(iconArr2, this.pW.b("en", 863), this.pW.b("en", 864));
                    this.I.g();
                    this.H.a(this.I);
                    this.z = (C0006af) this.pX.a(Class.forName("af"));
                    this.z.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 847))));
                    this.z.a(this.pW.b("en", 851), this.pW.b("en", 852));
                    Icon[] iconArr3 = new Icon[this.pW.a("en", 848, 0, 0).length];
                    for (int i3 = 0; i3 < iconArr3.length; i3++) {
                        iconArr3[i3] = new ImageIcon(getClass().getResource(this.g + a2[i3]));
                    }
                    this.z.a(iconArr3, this.pW.b("en", 849), this.pW.b("en", 850));
                    this.z.g();
                    this.H.a(this.z);
                    this.C = (C0006af) this.pX.a(Class.forName("af"));
                    this.C.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 865))));
                    this.C.a(this.pW.b("en", 866), this.pW.b("en", 867));
                    Icon[] iconArr4 = new Icon[this.pW.a("en", 1247, 0, 0).length];
                    for (int i4 = 0; i4 < iconArr4.length; i4++) {
                        iconArr4[i4] = new ImageIcon(getClass().getResource(this.g + a3[i4]));
                    }
                    this.C.a(iconArr4, this.pW.b("en", 1248), this.pW.b("en", 1249));
                    this.C.g();
                    this.H.a(this.C);
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    this.f++;
                    break;
                case 4:
                    C0032k.a("initialize = " + this.f);
                    this.O = (H) this.pX.a(Class.forName("H"));
                    this.O.a(new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 216))), new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 217))), new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 218))));
                    this.M.a(this.O);
                    this.M.a(this.N);
                    this.p.g();
                    this.x.g();
                    this.F.g();
                    this.H.g();
                    this.M.g();
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    this.f++;
                    break;
                case 5:
                    C0032k.a("initialize = " + this.f);
                    this.ur.y = new ImageIcon(getClass().getResource(this.ur.f("en", 540)));
                    this.ur.z = new ImageIcon(getClass().getResource(this.ur.f("en", 547)));
                    this.ur.T = new ImageIcon(getClass().getResource(this.ur.f("en", 543)));
                    this.ur.Y = new ImageIcon(getClass().getResource(this.ur.f("en", 544)));
                    this.ur.ad = new ImageIcon(getClass().getResource(this.ur.f("en", 545)));
                    this.ur.ai = new ImageIcon(getClass().getResource(this.ur.f("en", 546)));
                    this.ur.U = new ImageIcon(getClass().getResource(this.ur.f("en", 573)));
                    this.ur.Z = new ImageIcon(getClass().getResource(this.ur.f("en", 574)));
                    this.ur.ae = new ImageIcon(getClass().getResource(this.ur.f("en", 575)));
                    this.ur.aj = new ImageIcon(getClass().getResource(this.ur.f("en", 576)));
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    this.f++;
                    break;
                case 6:
                    C0001aa c0001aa = this.ur;
                    C0001aa.c = V;
                    this.ur.e = oI;
                    this.ur.d = Y;
                    this.ur.f = oJ;
                    C0032k.a("initialize = " + this.f);
                    this.pT = new U(this.g + this.pW.a("en", 291), "graphicsMapping.txt", "itemClassMapping.txt", "bodySlotMapping.txt");
                    this.ur.q = this.pT;
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    C0032k.a("finish init go to colony");
                    a((byte) 5, (Object) null);
                    break;
            }
        } catch (IOException e) {
            C0032k.a("[Colony State] IOException: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e2) {
            C0032k.a("[Colony State] ClassNotFoundException: " + e2.getMessage());
        } catch (Exception e3) {
            C0032k.a("init Exception " + e3.getMessage());
            e3.printStackTrace();
        }
    }

    public void d(Object obj) {
        C0021aw.b.a(C0028g.i, true);
        p();
        C0032k.a("initializing...........................");
        this.f = 0;
        this.m = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 222)));
        C0032k.a("loadingSplash = " + this.m);
        String[] a = this.pW.a("en", 225, 0, 0);
        this.n = new Icon[a.length];
        for (int i = 0; i < a.length; i++) {
            this.n[i] = new ImageIcon(getClass().getResource(this.g + a[i]));
            C0032k.a("animation = " + this.n[i]);
        }
        try {
            gK = pS.getWidth();
            gL = pS.getHeight();
            this.j = ImageIO.read(getClass().getResource(this.g + this.pW.d("en", 982)));
            this.i = new BufferedImage(gK, gL, 1);
            this.h = new BufferedImage(gK, gL, 1);
            this.i.createGraphics().drawImage(this.j, 0, 0, (ImageObserver) null);
            this.ur.n = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 36)));
            String[] a2 = this.pW.a("en", 215, 0, 0);
            this.ur.o = new Icon[a2.length];
            for (int i2 = 0; i2 < a2.length; i2++) {
                this.ur.o[i2] = new ImageIcon(getClass().getResource(this.g + a2[i2]));
            }
        } catch (IOException e) {
        }
        Enumeration elements = this.k.elements();
        while (elements.hasMoreElements()) {
            C0004ad c0004ad = (C0004ad) elements.nextElement();
            if (c0004ad.D == oI) {
                c0004ad.V = this.i;
            }
        }
        a((byte) 29, (Object) null);
    }

    public void d(Graphics graphics) {
        String[] a;
        String[] a2;
        String[] a3;
        this.m.paintIcon(pS, graphics, 0, 0);
        if (this.qm != 29) {
            return;
        }
        if (this.R) {
            C0032k.a("go to colony");
            a((byte) 5, (Object) null);
            return;
        }
        try {
            switch (this.f) {
                case 0:
                    C0032k.a("initialize = " + this.f);
                    this.o = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 983)));
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    this.f++;
                    break;
                case 1:
                    C0032k.a("initialize = " + this.f);
                    BufferedImage read = ImageIO.read(getClass().getResource(this.g + this.pW.d("en", 984)));
                    BufferedImage bufferedImage = new BufferedImage(read.getWidth((ImageObserver) null), read.getHeight((ImageObserver) null), 1);
                    bufferedImage.createGraphics().drawImage(read, 0, 0, (ImageObserver) null);
                    Icon imageIcon = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 985)));
                    this.q = (C) this.pX.a(Class.forName("C"));
                    this.q.a((byte) 0);
                    this.q.a(imageIcon, bufferedImage);
                    this.q.a(this.pW.b("en", 992), this.pW.b("en", 993));
                    this.q.g();
                    this.p.a(this.q);
                    this.r = (C) this.pX.a(Class.forName("C"));
                    this.r.a((byte) 1);
                    this.r.a(imageIcon, bufferedImage);
                    this.r.a(this.pW.b("en", 988), this.pW.b("en", 989));
                    this.r.g();
                    this.p.a(this.r);
                    this.s = (C) this.pX.a(Class.forName("C"));
                    this.s.a((byte) 2);
                    this.s.a(imageIcon, bufferedImage);
                    this.s.a(this.pW.b("en", 986), this.pW.b("en", 987));
                    this.s.g();
                    this.p.a(this.s);
                    this.t = (C) this.pX.a(Class.forName("C"));
                    this.t.a((byte) 3);
                    this.t.a(imageIcon, bufferedImage);
                    this.t.a(this.pW.b("en", 998), this.pW.b("en", 999));
                    this.t.g();
                    this.p.a(this.t);
                    this.u = (C) this.pX.a(Class.forName("C"));
                    this.u.a((byte) 4);
                    this.u.a(imageIcon, bufferedImage);
                    this.u.a(this.pW.b("en", 990), this.pW.b("en", 991));
                    this.u.g();
                    this.p.a(this.u);
                    this.v = (C) this.pX.a(Class.forName("C"));
                    this.v.a((byte) 5);
                    this.v.a(imageIcon, bufferedImage);
                    this.v.a(this.pW.b("en", 994), this.pW.b("en", 995));
                    this.v.g();
                    this.p.a(this.v);
                    this.w = (C) this.pX.a(Class.forName("C"));
                    this.w.a((byte) 6);
                    this.w.a(imageIcon, bufferedImage);
                    this.w.a(this.pW.b("en", 996), this.pW.b("en", 997));
                    this.w.g();
                    this.p.a(this.w);
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    this.f++;
                    break;
                case 2:
                    C0032k.a("initialize = " + this.f);
                    this.B = (C0006af) this.pX.a(Class.forName("af"));
                    this.B.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1003))));
                    this.B.a(this.pW.b("en", 1004), this.pW.b("en", 1005));
                    this.B.g();
                    this.x.a(this.B);
                    this.C = (C0006af) this.pX.a(Class.forName("af"));
                    this.C.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1000))));
                    this.C.a(this.pW.b("en", 1001), this.pW.b("en", 1002));
                    this.C.g();
                    this.x.a(this.C);
                    this.J = (C0006af) this.pX.a(Class.forName("af"));
                    this.J.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1006))));
                    this.J.a(this.pW.b("en", 1007), this.pW.b("en", 1008));
                    Icon[] iconArr = new Icon[this.pW.a("en", 1024, 0, 0).length];
                    for (int i = 0; i < iconArr.length; i++) {
                        iconArr[i] = new ImageIcon(getClass().getResource(this.g + a3[i]));
                    }
                    this.J.a(iconArr, this.pW.b("en", 1025), this.pW.b("en", 1026));
                    this.J.g();
                    this.x.a(this.J);
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    this.f++;
                    break;
                case 3:
                    C0032k.a("initialize = " + this.f);
                    this.z = (C0006af) this.pX.a(Class.forName("af"));
                    this.z.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1009))));
                    this.z.a(this.pW.b("en", 1010), this.pW.b("en", 1011));
                    Icon[] iconArr2 = new Icon[this.pW.a("en", 1027, 0, 0).length];
                    for (int i2 = 0; i2 < iconArr2.length; i2++) {
                        iconArr2[i2] = new ImageIcon(getClass().getResource(this.g + a[i2]));
                    }
                    this.z.a(iconArr2, this.pW.b("en", 1028), this.pW.b("en", 1029));
                    this.z.g();
                    this.H.a(this.z);
                    this.D = (C0006af) this.pX.a(Class.forName("af"));
                    this.D.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1018))));
                    this.D.a(this.pW.b("en", 1019), this.pW.b("en", 1020));
                    this.D.g();
                    this.H.a(this.D);
                    this.I = (C0006af) this.pX.a(Class.forName("af"));
                    this.I.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1015))));
                    this.I.a(this.pW.b("en", 1016), this.pW.b("en", 1017));
                    Icon[] iconArr3 = new Icon[this.pW.a("en", 1030, 0, 0).length];
                    for (int i3 = 0; i3 < iconArr3.length; i3++) {
                        iconArr3[i3] = new ImageIcon(getClass().getResource(this.g + a2[i3]));
                    }
                    this.I.a(iconArr3, this.pW.b("en", 1031), this.pW.b("en", 1032));
                    this.I.g();
                    this.H.a(this.I);
                    this.K = (C0006af) this.pX.a(Class.forName("af"));
                    this.K.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1012))));
                    this.K.a(this.pW.b("en", 1013), this.pW.b("en", 1014));
                    this.K.g();
                    this.H.a(this.K);
                    this.L = (C0006af) this.pX.a(Class.forName("af"));
                    this.L.a((Icon) new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1021))));
                    this.L.a(this.pW.b("en", 1022), this.pW.b("en", 1023));
                    this.L.g();
                    this.H.a(this.L);
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    this.f++;
                    break;
                case 4:
                    C0032k.a("initialize = " + this.f);
                    this.O = (H) this.pX.a(Class.forName("H"));
                    this.O.a(new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 216))), new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 217))), new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 218))));
                    this.M.a(this.O);
                    this.M.a(this.N);
                    this.p.g();
                    this.x.g();
                    this.F.g();
                    this.H.g();
                    this.M.g();
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    this.f++;
                    break;
                case 5:
                    C0032k.a("initialize = " + this.f);
                    this.ur.y = new ImageIcon(getClass().getResource(this.ur.f("en", 540)));
                    this.ur.z = new ImageIcon(getClass().getResource(this.ur.f("en", 547)));
                    this.ur.T = new ImageIcon(getClass().getResource(this.ur.f("en", 543)));
                    this.ur.Y = new ImageIcon(getClass().getResource(this.ur.f("en", 544)));
                    this.ur.ad = new ImageIcon(getClass().getResource(this.ur.f("en", 545)));
                    this.ur.ai = new ImageIcon(getClass().getResource(this.ur.f("en", 546)));
                    this.ur.U = new ImageIcon(getClass().getResource(this.ur.f("en", 573)));
                    this.ur.Z = new ImageIcon(getClass().getResource(this.ur.f("en", 574)));
                    this.ur.ae = new ImageIcon(getClass().getResource(this.ur.f("en", 575)));
                    this.ur.aj = new ImageIcon(getClass().getResource(this.ur.f("en", 576)));
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    this.f++;
                    break;
                case 6:
                    C0001aa c0001aa = this.ur;
                    C0001aa.c = V;
                    this.ur.e = oI;
                    this.ur.d = Y;
                    this.ur.f = oJ;
                    C0032k.a("initialize = " + this.f);
                    this.ur.q = this.pT;
                    this.n[this.f].paintIcon(pS, graphics, this.pW.b("en", 226), this.pW.b("en", 227));
                    this.R = true;
                    C0032k.a("finish init go to colony");
                    a((byte) 5, (Object) null);
                    break;
            }
        } catch (IOException e) {
            C0032k.a("[Colony State] IOException: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e2) {
            C0032k.a("[Colony State] ClassNotFoundException: " + e2.getMessage());
        } catch (Exception e3) {
            C0032k.a("init Exception " + e3.getMessage());
            e3.printStackTrace();
        }
    }

    public void e(Object obj) {
        this.pR.d();
        this.go = this.ur.d("en", 1205);
        this.gp = this.ur.d("en", 1206);
        this.gq = this.ur.d("en", 1207);
        this.gr = this.ur.e("en", 1208);
        this.gs = this.ur.d("en", 1156);
        this.gt = this.ur.d("en", 1157);
        this.gu = this.ur.d("en", 1209);
        this.gv = this.ur.d("en", 1210);
        this.gw = this.ur.d("en", 1160);
        this.gx = this.ur.d("en", 1161);
        this.gz = new ImageIcon(getClass().getResource(this.ur.f("en", 1162)));
        this.gB = new ImageIcon(getClass().getResource(this.ur.f("en", 1219)));
        this.gC = new ImageIcon(getClass().getResource(this.ur.f("en", 1220)));
        this.gD = new ImageIcon(getClass().getResource(this.ur.f("en", 1221)));
        this.gE = new Icon[2];
        this.gE[0] = new ImageIcon(getClass().getResource(this.ur.f("en", 1222)));
        this.gE[1] = new ImageIcon(getClass().getResource(this.ur.f("en", 1223)));
        this.gF = false;
        this.gG = false;
        this.gH = -1;
        this.gI = -1;
        this.ul = new ImageIcon(getClass().getResource(this.ur.f("en", 1377)));
        this.ac = new W(this.pW.b("en", 4), this.pW.b("en", 5), (byte) 1, (byte) 0);
        this.ad = this.g + this.pW.d("en", 3);
        this.ae = this.pW.b("en", 6);
        this.af = this.pW.b("en", 7);
        this.ag = this.pW.b("en", 8);
        this.ah = this.pW.b("en", 9);
        this.ai = new String[3];
        this.ai[0] = this.g + this.pW.d("en", 10);
        this.ai[1] = this.g + this.pW.d("en", 13);
        this.ai[2] = this.g + this.pW.d("en", 16);
        this.aj = new int[3];
        this.aj[0] = this.pW.b("en", 11);
        this.aj[1] = this.pW.b("en", 14);
        this.aj[2] = this.pW.b("en", 17);
        this.ak = new int[3];
        this.ak[0] = this.pW.b("en", 12);
        this.ak[1] = this.pW.b("en", 15);
        this.ak[2] = this.pW.b("en", 18);
        this.al = null;
        this.am = null;
        this.ao = null;
        this.an = null;
        pS.o.setBounds(24, 572, 310, 21);
        pS.o.setBorder(BorderFactory.createLineBorder(new Color(14870248)));
        pS.add(pS.o);
        pS.p.setBounds(680, 500, 70, 15);
        pS.p.setForeground(new Color(11725047));
        pS.p.setBorder(BorderFactory.createLineBorder(new Color(0)));
        pS.q.setBounds(484, 330, 90, 15);
        pS.q.setForeground(new Color(0));
        pS.q.setBorder(BorderFactory.createLineBorder(new Color(14737632)));
        pS.r.setBounds(575, 254, 67, 14);
        pS.r.setForeground(new Color(0));
        pS.r.setBorder(BorderFactory.createLineBorder(new Color(16777215)));
        this.eC = this.ur.d("en", 640);
        this.eD = this.ur.d("en", 641);
        this.eE = this.ur.d("en", 642);
        this.eF = this.ur.d("en", 643);
        this.eG = this.ur.d("en", 644);
        this.eH = this.ur.d("en", 645);
        this.eI = new C0009ai();
        this.eI.a(30, 477, 340, 51, MastersOfDestiny.am, MastersOfDestiny.an);
        this.eJ = this.ur.d("en", 908);
        this.eK = this.ur.d("en", 909);
        this.eL = this.ur.d("en", 910);
        this.eM = this.ur.d("en", 911);
        this.eN = this.ur.d("en", 912);
        this.eO = this.ur.d("en", 913);
        this.eP = new C0009ai();
        this.eP.a(30, 434, 340, 34, MastersOfDestiny.D, MastersOfDestiny.E);
        if (this.eR != null) {
            this.eP.a(this.eR, 13960102, 13960102);
            this.eP.a((byte) 3);
            this.eR = null;
        }
        if (this.eQ != null) {
            this.eP.a(this.eQ, 16711680, 16711680);
            this.eP.a((byte) 3);
            this.eQ = null;
        }
        this.fq = 0;
        this.fs = this.ur.e("en", 207);
        this.ft = this.ur.d("en", 725);
        this.fu = this.ur.d("en", 209);
        this.fv = this.ur.d("en", 210);
        this.fr = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 609)));
        this.fw = this.ur.d("en", 318);
        this.fx = this.ur.d("en", 319);
        this.fy = this.ur.d("en", 320);
        this.fz = this.ur.d("en", 321);
        this.ap = new Icon[6];
        this.ap[0] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 697)));
        this.ap[1] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 706)));
        this.ap[2] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 872)));
        this.ap[3] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 703)));
        this.ap[4] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 914)));
        this.ap[5] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1250)));
        this.aq = new int[6];
        this.ar = new int[6];
        this.as = new int[6];
        this.at = new int[6];
        this.aq[0] = this.ur.d("en", 713);
        this.ar[0] = this.ur.d("en", 714);
        this.as[0] = this.ur.d("en", 715);
        this.at[0] = this.ur.d("en", 716);
        this.aq[1] = this.ur.d("en", 717);
        this.ar[1] = this.ur.d("en", 718);
        this.as[1] = this.ur.d("en", 719);
        this.at[1] = this.ur.d("en", 720);
        this.aq[2] = this.ur.d("en", 873);
        this.ar[2] = this.ur.d("en", 874);
        this.as[2] = this.ur.d("en", 875);
        this.at[2] = this.ur.d("en", 876);
        this.aq[3] = this.ur.d("en", 721);
        this.ar[3] = this.ur.d("en", 722);
        this.as[3] = this.ur.d("en", 723);
        this.at[3] = this.ur.d("en", 724);
        this.aq[4] = this.ur.d("en", 915);
        this.ar[4] = this.ur.d("en", 916);
        this.as[4] = this.ur.d("en", 917);
        this.at[4] = this.ur.d("en", 918);
        this.aq[5] = this.ur.d("en", 717);
        this.ar[5] = this.ur.d("en", 718);
        this.as[5] = this.ur.d("en", 719);
        this.at[5] = this.ur.d("en", 720);
        this.aC = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 610)));
        this.aD = new int[6];
        this.aD[0] = this.ur.d("en", 709);
        this.aD[1] = this.ur.d("en", 710);
        this.aD[2] = this.ur.d("en", 877);
        this.aD[3] = this.ur.d("en", 711);
        this.aD[4] = this.ur.d("en", 919);
        this.aD[5] = this.ur.d("en", 1251);
        this.aE = this.ur.d("en", 712);
        this.aF = this.ur.d("en", 638);
        this.aG = this.ur.d("en", 639);
        this.fG = new String[6];
        this.fG[0] = " Inventory";
        this.fG[1] = " Quest Log";
        this.fG[2] = "Char Stats";
        this.fG[3] = "Buddy List";
        this.fG[4] = "Player List";
        this.fG[5] = "   Options";
        this.gJ = new ImageIcon[4];
        this.gJ[0] = new ImageIcon(getClass().getResource(this.ur.f("en", 483)));
        this.gJ[1] = new ImageIcon(getClass().getResource(this.ur.f("en", 484)));
        this.gJ[2] = new ImageIcon(getClass().getResource(this.ur.f("en", 485)));
        this.gJ[3] = new ImageIcon(getClass().getResource(this.ur.f("en", 486)));
        this.aH = this.ur.d("en", 868);
        this.aI = this.ur.e("en", 869);
        this.aJ = this.ur.d("en", 870);
        this.aK = this.ur.d("en", 871);
        try {
            InputStream resourceAsStream = getClass().getResourceAsStream("res/HUD/options/help.txt");
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
                String str = new String(byteArrayOutputStream.toByteArray(), "utf-8");
                C0032k.a(str);
                String[] split = str.split("\n");
                this.eB = new String[split.length];
                this.eA = new Vector();
                for (int i = 0; i < split.length; i++) {
                    String[] split2 = split[i].split("\\|");
                    this.eB[i] = split2[0];
                    String[][] strArr = new String[split2.length - 1][2];
                    for (int i2 = 1; i2 < split2.length; i2++) {
                        String[] split3 = split2[i2].split(">");
                        strArr[i2 - 1][0] = split3[0];
                        split3[1] = split3[1].replaceAll("<", "\n");
                        strArr[i2 - 1][1] = split3[1];
                    }
                    this.eA.add(strArr);
                }
            } else {
                C0032k.a("tile graphics mapping null");
            }
        } catch (IOException e) {
            C0032k.a(e.getMessage());
        }
        this.dO = new Icon[2];
        this.dO[0] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1252)));
        this.dO[1] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1253)));
        this.dP = 0;
        this.dQ = this.ur.e("en", 1254);
        this.dR = this.ur.d("en", 1255);
        this.dS = this.ur.e("en", 1256);
        this.dT = this.ur.d("en", 1257);
        this.dU = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1258)));
        this.dV = this.ur.d("en", 1259);
        this.dW = this.ur.d("en", 1260);
        this.dX = new Icon[2];
        this.dX[0] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1261)));
        this.dX[1] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1262)));
        this.dY = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1263)));
        this.dZ = this.ur.e("en", 1264);
        this.ea = this.ur.d("en", 1265);
        this.eb = C0021aw.b.c();
        this.ec = C0021aw.b.b();
        this.ed = this.ur.e("en", 1266);
        this.ee = this.ur.d("en", 1267);
        this.ef = this.ur.d("en", 1268);
        this.eg = this.ur.d("en", 1269);
        this.eh = 0;
        this.ei = -1;
        this.ej = this.ur.d("en", 1270);
        this.ek = this.ur.e("en", 1271);
        this.el = this.ur.d("en", 1272);
        this.em = this.ur.d("en", 1273);
        this.en = this.ur.d("en", 1274);
        this.eo = this.ur.d("en", 1275);
        this.ep = this.ur.d("en", 1276);
        this.eq = this.ur.d("en", 1277);
        this.er = this.ur.d("en", 1278);
        this.es = this.ur.d("en", 1279);
        this.et = this.ur.d("en", 1280);
        this.eu = this.ur.d("en", 1281);
        this.ev = this.ur.d("en", 1282);
        this.ew = 0;
        this.ex = 0;
        this.ey = new C0009ai();
        this.ey.a(this.es + 13, this.et + (MastersOfDestiny.C.getHeight() / 2), this.eu, this.ev - 25, MastersOfDestiny.B, MastersOfDestiny.I);
        this.ez = false;
        this.bz = new Icon[4];
        this.bz[0] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 878)));
        this.bz[1] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1211)));
        this.bz[2] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1212)));
        this.bz[3] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1213)));
        this.bA = this.ur.d("en", 879);
        this.bB = this.ur.d("en", 880);
        this.bC = this.ur.d("en", 896);
        this.bD = this.ur.e("en", 897);
        this.bE = this.ur.d("en", 898);
        this.bF = this.ur.d("en", 899);
        this.bG = this.ur.d("en", 900);
        this.bH = this.ur.d("en", 901);
        this.bI = this.ur.d("en", 902);
        this.bJ = this.ur.d("en", 903);
        this.bs = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 881)));
        this.bv = this.ur.e("en", 882);
        this.bw = this.ur.e("en", 883);
        this.bx = this.ur.d("en", 884);
        this.by = this.ur.d("en", 885);
        this.bt = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 904)));
        this.bu = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 905)));
        this.bK = new Icon[2];
        this.bK[0] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 891)));
        this.bK[1] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 886)));
        this.bN = this.ur.e("en", 887);
        this.bO = this.ur.d("en", 888);
        this.bP = this.ur.e("en", 889);
        this.bQ = this.ur.d("en", 890);
        this.bR = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 892)));
        this.bS = this.ur.d("en", 893);
        this.bT = this.ur.d("en", 894);
        this.bY = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 895)));
        this.cg = C0011ak.m();
        this.cg.a((byte) 6);
        this.ch = this.g + this.pW.d("en", 906);
        this.eS = new Icon[3];
        this.eS[0] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 704)));
        this.eS[1] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 704)));
        this.eS[2] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 705)));
        this.eW = new int[3];
        this.eW[0] = this.ur.d("en", 726);
        this.eW[1] = this.ur.d("en", 726);
        this.eW[2] = this.ur.d("en", 279);
        this.eX = new int[3];
        this.eX[0] = this.ur.d("en", 727);
        this.eX[1] = this.ur.d("en", 728);
        this.eX[2] = this.ur.d("en", 280);
        this.eY = new int[3];
        this.eY[0] = this.ur.d("en", 729);
        this.eY[1] = this.ur.d("en", 729);
        this.eY[2] = this.ur.d("en", 281);
        this.eZ = this.ur.d("en", 730);
        this.fb = this.ur.d("en", 731);
        this.fc = this.ur.d("en", 732);
        this.fd = this.ur.d("en", 733);
        this.fe = this.ur.d("en", 734);
        this.ff = this.ur.d("en", 735);
        this.fj = this.ur.d("en", 736);
        this.fk = this.ur.d("en", 737);
        this.fl = this.ur.d("en", 738);
        this.fm = this.ur.d("en", 739);
        this.fn = -1;
        this.aL = new Icon[2];
        this.aL[0] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 742)));
        this.aL[1] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 743)));
        this.aM = new int[2];
        this.aM[0] = this.ur.d("en", 744);
        this.aM[1] = this.ur.d("en", 745);
        this.aN = this.ur.d("en", 746);
        this.aO = new int[2];
        this.aO[0] = this.ur.d("en", 747);
        this.aO[1] = this.ur.d("en", 748);
        this.aP = this.ur.d("en", 749);
        this.aW = this.ur.d("en", 750);
        this.aX = this.ur.d("en", 751);
        this.aY = this.ur.d("en", 752);
        this.aZ = this.ur.d("en", 753);
        this.ba = this.ur.d("en", 754);
        this.bb = this.ur.d("en", 755);
        this.bc = this.ur.d("en", 751);
        this.bd = this.ur.d("en", 752);
        this.be = this.ur.d("en", 753);
        this.bf = this.ur.d("en", 754);
        this.bi = this.ur.d("en", 756);
        this.bj = this.ur.d("en", 757);
        this.bk = this.ur.d("en", 758);
        this.bl = this.ur.d("en", 759);
        this.bm = this.ur.d("en", 760);
        this.bn = this.ur.d("en", 761);
        this.ci = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 920)));
        this.ck = this.ur.d("en", 921);
        this.cl = this.pW.e("en", 922);
        this.cm = this.ur.d("en", 923);
        this.cn = this.ur.d("en", 924);
        this.cq = this.ur.d("en", 925);
        this.cr = this.ur.d("en", 926);
        this.cs = this.ur.d("en", 927);
        this.ct = this.ur.d("en", 928);
        this.cu = this.ur.d("en", 929);
        this.cx = this.ur.d("en", 930);
        this.cy = this.ur.d("en", 931);
        this.cz = this.ur.d("en", 932);
        this.cA = this.ur.d("en", 933);
        this.cB = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 934)));
        this.cD = this.ur.d("en", 935);
        this.cE = this.ur.d("en", 936);
        this.cF = this.ur.d("en", 937);
        this.cG = this.ur.d("en", 938);
        this.cH = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 939)));
        this.cK = this.pW.e("en", 940);
        this.cL = this.ur.d("en", 941);
        this.cM = this.ur.d("en", 942);
        this.cN = this.ur.d("en", 943);
        this.dN = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 980)));
        this.dM = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 981)));
        this.cO = this.pW.e("en", 944);
        this.cP = this.ur.d("en", 945);
        this.cQ = this.ur.d("en", 946);
        this.cR = this.ur.d("en", 947);
        this.cS = this.ur.d("en", 948);
        this.cX = this.ur.d("en", 949);
        this.cY = this.ur.d("en", 950);
        this.cZ = this.ur.d("en", 951);
        this.da = this.ur.d("en", 952);
        this.db = new Icon[4];
        this.db[0] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 976)));
        this.db[1] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 977)));
        this.db[2] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 978)));
        this.db[3] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 979)));
        this.dc = 0;
        this.dd = this.pW.e("en", 953);
        this.de = this.ur.d("en", 954);
        this.df = this.pW.e("en", 955);
        this.dg = this.ur.d("en", 956);
        this.dh = this.pW.e("en", 957);
        this.di = this.pW.e("en", 958);
        this.dj = this.ur.d("en", 959);
        this.dk = this.ur.d("en", 960);
        this.dl = this.ur.d("en", 961);
        this.dm = this.pW.e("en", 962);
        this.dn = this.ur.d("en", 963);
        this.f0do = this.ur.d("en", 964);
        this.cU = new Vector();
        this.cT = new Vector();
        this.cW = 0;
        this.cV = 0;
        this.dq = 0;
        this.dr = 0;
        this.ds = this.dh[0] - 2;
        this.dt = this.di[0] - 2;
        this.dx = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 965)));
        this.dy = this.ur.d("en", 966);
        this.dz = this.ur.d("en", 967);
        this.dA = this.pW.e("en", 968);
        this.dB = this.ur.d("en", 969);
        this.dC = this.pW.e("en", 970);
        this.dD = this.ur.d("en", 971);
        this.dE = this.ur.d("en", 972);
        this.dF = this.pW.e("en", 973);
        this.dG = this.ur.d("en", 974);
        this.dH = this.ur.d("en", 975);
        this.fB = new Icon[4];
        this.fB[0] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 702)));
        this.fB[1] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 699)));
        this.fB[2] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 701)));
        this.fB[3] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 700)));
        this.fA = 0;
        this.fC = this.pW.e("en", 361);
        this.fD = this.pW.b("en", 362);
        this.fE = this.pW.e("en", 363);
        this.fF = this.pW.b("en", 364);
        this.fH = this.pW.e("en", 326);
        this.fI = this.pW.e("en", 327);
        this.fJ = this.pW.e("en", 349);
        this.fK = this.pW.e("en", 350);
        this.fL = this.pW.b("en", 328);
        this.fM = this.pW.b("en", 329);
        this.fQ = 0;
        this.fN = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 293)));
        this.fO = this.fH[0] - 2;
        this.fP = this.fI[0] - 2;
        this.fR = this.pW.b("en", 330);
        this.fS = this.pW.e("en", 331);
        this.fT = this.pW.b("en", 332);
        this.fU = this.pW.b("en", 333);
        this.gg = C0011ak.m();
        this.gg.a((byte) 4);
        this.gh = this.g + this.pW.d("en", 334);
        this.fV = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1200)));
        this.fW = this.pW.b("en", 1201);
        this.fX = this.pW.b("en", 1202);
        this.fY = this.pW.b("en", 1203);
        this.fZ = this.pW.b("en", 1204);
        this.ga = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 881)));
        this.gb = -1;
        this.gc = -1L;
        this.gd = new String[6];
        this.gd[0] = "You don't have such an item to use!";
        this.gd[1] = "This item cannot be used in colony!";
        this.gd[2] = "You cannot use this item to this target!";
        this.gd[3] = "You don't have enough energy to use this item!";
        this.gd[4] = "Your race cannot use this item!";
        this.gd[5] = "You haven't reached the required level to use this item!";
        this.gi = null;
        this.gj = null;
        this.gk = 0;
        this.gl = 0;
        this.gm = true;
        this.gN = false;
        this.ql = false;
        this.gM = false;
    }

    public void e(Graphics graphics) {
        C0020av c0020av;
        C0020av c0020av2;
        switch (this.ab) {
            case 1:
                f(graphics);
                return;
            case 2:
                h(graphics);
                return;
            case 3:
                g(graphics);
                return;
            case 4:
                o(graphics);
                return;
            case 5:
                i(graphics);
                return;
            case 6:
                l(graphics);
                return;
            case 7:
                p(graphics);
                return;
            default:
                this.o.paintIcon(pS, graphics, 0, 0);
                this.pX.a(graphics, pS);
                graphics.setFont(new Font((String) null, 1, 11));
                this.pX.b(graphics, pS);
                this.ur.y.paintIcon(pS, graphics, -1, 430);
                this.ul.paintIcon(pS, graphics, 689, 542);
                this.eI.a(graphics, pS);
                this.eP.a(graphics, pS);
                if (this.aB != -1) {
                    this.aC.paintIcon(pS, graphics, this.aD[this.aB], this.aE);
                }
                if (this.aA != -1) {
                    this.ap[this.aA].paintIcon(pS, graphics, this.aq[this.aA] - 2, this.ar[this.aA]);
                }
                if (this.aB != -1) {
                    graphics.setColor(new Color(2304558));
                    graphics.fillRect(this.aD[this.aB] - 5, 519, 60, 15);
                    graphics.setColor(new Color(16777215));
                    MastersOfDestiny mastersOfDestiny = pS;
                    graphics.setFont(MastersOfDestiny.ag);
                    graphics.drawString(this.fG[this.aB], this.aD[this.aB], 530);
                }
                if (this.fq != -1) {
                    this.fr.paintIcon(pS, graphics, this.fs[this.fq] + 2, this.ft);
                }
                if (this.aA == 3) {
                    String[] a = this.pP.a();
                    String[] b = this.pP.b();
                    int length = a.length + b.length;
                    graphics.setColor(new Color(11725031));
                    MastersOfDestiny mastersOfDestiny2 = pS;
                    graphics.setFont(MastersOfDestiny.z);
                    graphics.drawString(a.length + " Online", 684, 249);
                    graphics.setColor(new Color(13356237));
                    MastersOfDestiny mastersOfDestiny3 = pS;
                    graphics.setFont(MastersOfDestiny.z);
                    graphics.drawString(b.length + " Offline", 684, 456);
                    if (length - this.fh > fi) {
                        if (this.fg >= this.fh && this.fg < this.fh + fi && length != 0) {
                            graphics.setColor(new Color(9605778));
                            graphics.fillRect(676, C0002ab.m + ((this.fg - this.fh) * 17), 111, 17);
                        }
                    } else if (this.fg >= this.fh && this.fg < length - this.fh && length != 0) {
                        graphics.setColor(new Color(9605778));
                        graphics.fillRect(676, C0002ab.m + ((this.fg - this.fh) * 17), 111, 17);
                    }
                    for (int i = 0; i < a.length; i++) {
                        if (i >= this.fh && i < this.fh + fi) {
                            graphics.setColor(new Color(11725031));
                            MastersOfDestiny mastersOfDestiny4 = pS;
                            graphics.setFont(MastersOfDestiny.D);
                            graphics.drawString(a[i], 684, 269 + ((i - this.fh) * 17));
                        }
                    }
                    for (int i2 = 0; i2 < b.length; i2++) {
                        if (i2 + a.length >= this.fh && i2 + a.length < this.fh + fi) {
                            graphics.setColor(new Color(13356237));
                            MastersOfDestiny mastersOfDestiny5 = pS;
                            graphics.setFont(MastersOfDestiny.D);
                            graphics.drawString(b[i2], 684, 269 + (((i2 + a.length) - this.fh) * 17));
                        }
                    }
                    if (this.fa != -1) {
                        this.eS[this.fa].paintIcon(pS, graphics, this.eW[this.fa] - 1, this.eX[this.fa] - 1);
                    }
                    if (this.fn != -1) {
                        if (a.length - this.fh > fi) {
                            if (this.fn >= this.fh && this.fn < this.fh + fi && length != 0) {
                                graphics.setColor(new Color(16777215));
                                graphics.fillRect(this.fo + 9, this.fp + 9, 77, 19);
                                graphics.setColor(new Color(0));
                                graphics.fillRect(this.fo + 10, this.fp + 10, 75, 17);
                                String b2 = this.pP.b(a[this.fn]);
                                graphics.setColor(new Color(16777215));
                                MastersOfDestiny mastersOfDestiny6 = pS;
                                graphics.setFont(MastersOfDestiny.B);
                                graphics.drawString(b2, this.fo + 15, this.fp + 22);
                            }
                        } else if (a.length - this.fh > 0 && a.length - this.fh <= fi && this.fn >= this.fh && this.fn < a.length && length != 0) {
                            graphics.setColor(new Color(16777215));
                            graphics.fillRect(this.fo + 9, this.fp + 9, 77, 19);
                            graphics.setColor(new Color(0));
                            graphics.fillRect(this.fo + 10, this.fp + 10, 75, 17);
                            String b3 = this.pP.b(a[this.fn]);
                            graphics.setColor(new Color(16777215));
                            MastersOfDestiny mastersOfDestiny7 = pS;
                            graphics.setFont(MastersOfDestiny.B);
                            graphics.drawString(b3, this.fo + 15, this.fp + 22);
                        }
                    }
                }
                if (this.aA == 5) {
                    this.dO[this.dP].paintIcon(pS, graphics, this.dQ[this.dP], this.dR);
                    if (this.dP == 0) {
                        graphics.setColor(new Color(6710886));
                        if (this.eh >= this.ew && this.eh < this.ew + 8) {
                            graphics.fillRect(this.eo, this.ep + ((this.eh - this.ew) * 17), this.eq, 17);
                        }
                        graphics.setColor(new Color(16777215));
                        MastersOfDestiny mastersOfDestiny8 = pS;
                        graphics.setFont(MastersOfDestiny.D);
                        if (this.eB.length - this.ew <= 8) {
                            for (int i3 = this.ew; i3 < this.eB.length; i3++) {
                                graphics.drawString(this.eB[i3], 419, 370 + ((i3 - this.ew) * 17));
                            }
                        } else {
                            for (int i4 = this.ew; i4 < 8 + this.ew; i4++) {
                                graphics.drawString(this.eB[i4], 419, 370 + ((i4 - this.ew) * 17));
                            }
                        }
                        if (this.ei != -1) {
                            if (this.ei >= this.ex && this.ei < this.ex + 8) {
                                graphics.setColor(new Color(6710886));
                                graphics.fillRect(this.es, this.et + ((this.ei - this.ex) * 17), this.eu, 17);
                            }
                            graphics.setColor(new Color(16777215));
                            MastersOfDestiny mastersOfDestiny9 = pS;
                            graphics.setFont(MastersOfDestiny.D);
                            String[][] strArr = (String[][]) this.eA.get(this.eh);
                            if (strArr.length - this.ex > 8) {
                                for (int i5 = this.ex; i5 < this.ex + 8; i5++) {
                                    graphics.drawString(strArr[i5][0], 557, 370 + ((i5 - this.ex) * 17));
                                }
                            } else {
                                for (int i6 = this.ex; i6 < strArr.length; i6++) {
                                    graphics.drawString(strArr[i6][0], 557, 370 + ((i6 - this.ex) * 17));
                                }
                            }
                        }
                        if (this.ez) {
                            this.ey.a(graphics, pS);
                        }
                    } else {
                        this.dU.paintIcon(pS, graphics, this.dV, this.dW);
                        graphics.setColor(new Color(16777215));
                        MastersOfDestiny mastersOfDestiny10 = pS;
                        graphics.setFont(MastersOfDestiny.D);
                        graphics.drawString("Music Vol:", 435, 376);
                        graphics.drawString("Sound:", 614, 376);
                        this.dY.paintIcon(pS, graphics, this.dZ[0], this.ea);
                        this.dY.paintIcon(pS, graphics, this.dZ[1], this.ea);
                        graphics.drawString(this.eb + sm, 534, 376);
                        graphics.drawString(this.ec + sm, 694, 376);
                        if (this.ec > 0) {
                            this.dX[0].paintIcon(pS, graphics, this.ed[2], this.ee);
                        }
                        if (this.ec < 9) {
                            this.dX[1].paintIcon(pS, graphics, this.ed[3], this.ee);
                        }
                        if (this.eb > 0) {
                            this.dX[0].paintIcon(pS, graphics, this.ed[0], this.ee);
                        }
                        if (this.eb < 9) {
                            this.dX[1].paintIcon(pS, graphics, this.ed[1], this.ee);
                        }
                    }
                }
                if (this.aA == 4) {
                    graphics.setColor(new Color(11725031));
                    MastersOfDestiny mastersOfDestiny11 = pS;
                    graphics.setFont(MastersOfDestiny.z);
                    graphics.drawString(Z, 684, 249);
                    String[] b4 = this.pR.b();
                    int length2 = b4.length;
                    if (this.cv >= this.cw && this.cv < this.cw + cp && length2 != 0) {
                        graphics.setColor(new Color(9605778));
                        graphics.fillRect(676, C0002ab.m + ((this.cv - this.cw) * 17), 111, 17);
                    }
                    for (int i7 = 0; i7 < b4.length; i7++) {
                        if (i7 >= this.cw && i7 < this.cw + cp) {
                            String[] split = b4[i7].split("\\|");
                            this.gJ[Integer.parseInt(split[1]) - 1].paintIcon(pS, graphics, 676, 257 + ((i7 - this.cw) * 17));
                            graphics.setColor(new Color(0));
                            MastersOfDestiny mastersOfDestiny12 = pS;
                            graphics.setFont(MastersOfDestiny.ai);
                            graphics.drawString(split[2], 697, 268 + ((i7 - this.cw) * 17));
                            graphics.setColor(new Color(11725031));
                            MastersOfDestiny mastersOfDestiny13 = pS;
                            graphics.setFont(MastersOfDestiny.D);
                            graphics.drawString(split[0], 710, 269 + ((i7 - this.cw) * 17));
                        }
                    }
                    if (this.co != -1) {
                        this.ci.paintIcon(pS, graphics, this.ck - 1, this.cl[this.co]);
                    }
                }
                if (this.cC) {
                    this.cB.paintIcon(pS, graphics, this.cD, this.cE);
                    if (this.dL) {
                        this.dM.paintIcon(pS, graphics, 416, 269);
                    }
                    if (this.dK) {
                        this.dM.paintIcon(pS, graphics, 416, 191);
                    }
                    if (this.cI) {
                        this.cH.paintIcon(pS, graphics, this.cK[0] + 1, this.cL);
                    }
                    if (this.cJ) {
                        this.dN.paintIcon(pS, graphics, this.cK[0] + 1, this.cL);
                    }
                    this.db[this.dc].paintIcon(pS, graphics, this.dd[this.dc], this.de);
                    for (int i8 = 0; i8 < this.dh.length; i8++) {
                        if (i8 + this.dq < this.G.H[this.dc].size()) {
                            ((C0020av) this.G.H[this.dc].elementAt(i8 + this.dq)).a().b().paintIcon(pS, graphics, this.dh[i8], this.di[i8]);
                            graphics.setColor(new Color(16777215));
                            MastersOfDestiny mastersOfDestiny14 = pS;
                            graphics.setFont(MastersOfDestiny.ag);
                            graphics.drawString(sm + ((C0020av) this.G.H[this.dc].elementAt(i8 + this.dq)).b(), this.dh[i8] + 1, this.di[i8] + 9);
                        }
                    }
                    for (int i9 = 0; i9 < this.cU.size(); i9++) {
                        ((C0020av) this.cU.get(i9)).a().b().paintIcon(pS, graphics, this.cO[i9] - 1, this.cQ - 1);
                        graphics.setColor(new Color(0));
                        MastersOfDestiny mastersOfDestiny15 = pS;
                        graphics.setFont(MastersOfDestiny.ag);
                        graphics.drawString(sm + c0020av2.b(), this.cO[i9] + 1, this.cQ + 9);
                    }
                    for (int i10 = 0; i10 < this.cT.size(); i10++) {
                        if (this.cT.get(i10) != null) {
                            ((C0020av) this.cT.get(i10)).a().b().paintIcon(pS, graphics, this.cO[i10] - 1, this.cP - 1);
                            graphics.setColor(new Color(0));
                            MastersOfDestiny mastersOfDestiny16 = pS;
                            graphics.setFont(MastersOfDestiny.ag);
                            graphics.drawString(sm + c0020av.b(), this.cO[i10] + 1, this.cP + 9);
                        }
                    }
                    graphics.setColor(new Color(0));
                    MastersOfDestiny mastersOfDestiny17 = pS;
                    graphics.setFont(MastersOfDestiny.z);
                    graphics.drawString(this.cV + sm, 575, 188);
                    graphics.setColor(new Color(16777215));
                    MastersOfDestiny mastersOfDestiny18 = pS;
                    graphics.setFont(MastersOfDestiny.z);
                    graphics.drawString("Balance: " + X, 562, 361);
                    this.fN.paintIcon(pS, graphics, this.ds - 1, this.dt);
                    if (this.gH != -1) {
                        this.gD.paintIcon(pS, graphics, this.cK[this.gH], this.cL);
                    }
                    MastersOfDestiny mastersOfDestiny19 = pS;
                    graphics.setFont(MastersOfDestiny.z);
                    if (this.gg.j != null) {
                        this.gg.a(graphics, pS);
                    }
                    if (this.gi != null) {
                        this.gi.a().b().paintIcon(pS, graphics, this.gk, this.gl);
                    }
                    if (this.dw) {
                        this.dx.paintIcon(pS, graphics, this.dy, this.dz);
                        if (this.gI != -1) {
                            this.gE[this.gI].paintIcon(pS, graphics, this.dA[this.gI], this.dB);
                        }
                    }
                }
                if (this.aA == 1) {
                    this.aL[this.bg].paintIcon(pS, graphics, this.aM[this.bg] - 1, this.aN);
                    if (this.bg == 0) {
                        if (this.pQ.a() > 0) {
                            graphics.setColor(new Color(6710886));
                            graphics.fillRect(this.bi - 2, this.bj + ((this.aS - this.aU) * 17), this.bk + 2, 17);
                            String[] a2 = this.pQ.a(this.bq);
                            if (a2.length - this.aU < 8) {
                                for (int i11 = this.aU; i11 < a2.length; i11++) {
                                    graphics.setColor(new Color(16777215));
                                    MastersOfDestiny mastersOfDestiny20 = pS;
                                    graphics.setFont(MastersOfDestiny.B);
                                    if (a2[i11].length() > 15) {
                                        graphics.drawString(a2[i11].substring(0, 15) + "...", this.bi + 15, this.bj + 12 + ((i11 - this.aU) * 17));
                                    } else {
                                        graphics.drawString(a2[i11], this.bi + 15, this.bj + 12 + ((i11 - this.aU) * 17));
                                    }
                                }
                            } else {
                                for (int i12 = this.aU; i12 < 8 + this.aU; i12++) {
                                    graphics.setColor(new Color(16777215));
                                    MastersOfDestiny mastersOfDestiny21 = pS;
                                    graphics.setFont(MastersOfDestiny.B);
                                    if (a2[i12].length() > 15) {
                                        graphics.drawString(a2[i12].substring(0, 15) + "...", this.bi + 15, this.bj + 12 + ((i12 - this.aU) * 17));
                                    } else {
                                        graphics.drawString(a2[i12], this.bi + 15, this.bj + 12 + ((i12 - this.aU) * 17));
                                    }
                                }
                            }
                            if (this.bq.size() > 0) {
                                String a3 = this.pQ.a(((Long) this.bq.get(this.aS)).longValue());
                                if (a3 != null || a3 != sm) {
                                    graphics.setColor(new Color(16777215));
                                    MastersOfDestiny mastersOfDestiny22 = pS;
                                    graphics.setFont(MastersOfDestiny.B);
                                    String[] a4 = a(a3, graphics, 200);
                                    this.bp = a4.length;
                                    if (a4.length - this.bo < 7) {
                                        for (int i13 = this.bo; i13 < a4.length; i13++) {
                                            graphics.drawString(a4[i13], this.bm + 20, this.bn + 20 + ((i13 - this.bo) * 17));
                                        }
                                    } else {
                                        for (int i14 = this.bo; i14 < this.bo + 7; i14++) {
                                            graphics.drawString(a4[i14], this.bm + 20, this.bn + 20 + ((i14 - this.bo) * 17));
                                        }
                                    }
                                }
                            }
                        }
                    } else if (this.bg == 1 && this.pQ.b() > 0) {
                        graphics.setColor(new Color(6710886));
                        graphics.fillRect(this.bi - 2, (this.bj + ((this.aT - this.aV) * 17)) - 1, this.bk + 2, 17);
                        String[] b5 = this.pQ.b(this.br);
                        if (b5.length - this.aV < 8) {
                            for (int i15 = this.aU; i15 < b5.length; i15++) {
                                graphics.setColor(new Color(16777215));
                                MastersOfDestiny mastersOfDestiny23 = pS;
                                graphics.setFont(MastersOfDestiny.B);
                                if (b5[i15].length() > 15) {
                                    graphics.drawString(b5[i15].substring(0, 15) + "...", this.bi + 15, this.bj + 12 + ((i15 - this.aV) * 17));
                                } else {
                                    graphics.drawString(b5[i15], this.bi + 15, this.bj + 12 + ((i15 - this.aV) * 17));
                                }
                            }
                        } else {
                            for (int i16 = this.aV; i16 < 8 + this.aV; i16++) {
                                graphics.setColor(new Color(16777215));
                                MastersOfDestiny mastersOfDestiny24 = pS;
                                graphics.setFont(MastersOfDestiny.B);
                                if (b5[i16].length() > 15) {
                                    graphics.drawString(b5[i16].substring(0, 15) + "...", this.bi + 15, this.bj + 12 + ((i16 - this.aV) * 17));
                                } else {
                                    graphics.drawString(b5[i16], this.bi + 15, this.bj + 12 + ((i16 - this.aV) * 17));
                                }
                            }
                        }
                        if (this.br.size() > 0) {
                            String a5 = this.pQ.a(((Long) this.br.get(this.aT)).longValue());
                            if (a5 != null || a5 != sm) {
                                graphics.setColor(new Color(16777215));
                                MastersOfDestiny mastersOfDestiny25 = pS;
                                graphics.setFont(MastersOfDestiny.B);
                                String[] a6 = a(a5, graphics, 200);
                                if (a6.length - this.bo <= 7) {
                                    for (int i17 = this.bo; i17 < a6.length; i17++) {
                                        graphics.drawString(a6[i17], this.bm + 20, this.bn + 20 + ((i17 - this.bo) * 17));
                                    }
                                } else {
                                    for (int i18 = this.bo; i18 < this.bo + 7; i18++) {
                                        graphics.drawString(a6[i18], this.bm + 20, this.bn + 20 + ((i18 - this.bo) * 17));
                                    }
                                }
                            }
                        }
                    }
                }
                if (this.aA == 0) {
                    MastersOfDestiny mastersOfDestiny26 = pS;
                    graphics.setFont(MastersOfDestiny.z);
                    Enumeration elements = this.G.M.elements();
                    while (elements.hasMoreElements()) {
                        graphics.setColor(new Color(14277081));
                        C0020av c0020av3 = (C0020av) elements.nextElement();
                        long e = c0020av3.e();
                        if (e > 0 && e <= 3) {
                            c0020av3.a().b().paintIcon(pS, graphics, this.fJ[c0020av3.e() - 1], this.fK[c0020av3.e() - 1]);
                        } else if (e > 4) {
                            c0020av3.a().b().paintIcon(pS, graphics, this.fJ[c0020av3.e() - 2], this.fK[c0020av3.e() - 2]);
                        }
                    }
                    this.fB[this.fA].paintIcon(pS, graphics, this.fC[this.fA], this.fD);
                    int length3 = this.fQ * this.fH.length;
                    for (int i19 = 0; i19 < this.fI.length; i19++) {
                        for (int i20 = 0; i20 < this.fH.length; i20++) {
                            if (length3 < this.G.H[this.fA].size()) {
                                ((C0020av) this.G.H[this.fA].elementAt(length3)).a().b().paintIcon(pS, graphics, this.fH[i20] - 1, this.fI[i19]);
                                graphics.setColor(new Color(16777215));
                                MastersOfDestiny mastersOfDestiny27 = pS;
                                graphics.setFont(MastersOfDestiny.z);
                                graphics.drawString(sm + ((C0020av) this.G.H[this.fA].elementAt(length3)).b(), this.fH[i20] + 2, this.fI[i19] + 9);
                                if (this.fA == 3 && length3 == this.gb) {
                                    this.ga.paintIcon(pS, graphics, this.fH[i20] - 1, this.fI[i19]);
                                }
                            }
                            length3++;
                        }
                    }
                    graphics.setColor(new Color(16777215));
                    MastersOfDestiny mastersOfDestiny28 = pS;
                    graphics.setFont(MastersOfDestiny.x);
                    graphics.drawString("Wt: " + this.G.q() + " / " + this.G.p(), 417, 476);
                    graphics.drawString("Sidos: " + X, 417, 491);
                    graphics.drawString("AP: " + this.G.w(), 417, 507);
                    graphics.drawString("Arm: " + this.G.z(), 488, 476);
                    graphics.drawString("Acc: " + this.G.A(), 488, 491);
                    graphics.drawString("Dmg: " + this.G.y(), 488, 507);
                    if (this.fA == 3) {
                        this.fV.paintIcon(pS, graphics, this.fW, this.fX);
                    }
                    this.fN.paintIcon(pS, graphics, this.fO - 1, this.fP);
                    if (this.gF) {
                        this.gB.paintIcon(pS, graphics, this.fW - 1, this.fX - 1);
                    }
                    MastersOfDestiny mastersOfDestiny29 = pS;
                    graphics.setFont(MastersOfDestiny.z);
                    if (this.gg.j != null) {
                        this.gg.a(graphics, pS);
                    }
                    if (this.gi != null) {
                        this.gi.a().b().paintIcon(pS, graphics, this.gk, this.gl);
                    }
                }
                if (this.aA == 2) {
                    this.bz[oK - 1].paintIcon(pS, graphics, this.bA - 1, this.bB);
                    MastersOfDestiny mastersOfDestiny30 = pS;
                    graphics.setFont(MastersOfDestiny.D);
                    graphics.setColor(new Color(12441572));
                    graphics.drawString("Name: " + oJ, 430, 420);
                    MastersOfDestiny mastersOfDestiny31 = pS;
                    graphics.setFont(MastersOfDestiny.z);
                    graphics.drawString("LV: " + this.G.B(), 430, 435);
                    graphics.drawString("HP: " + this.G.n() + "/" + this.G.o(), 430, 450);
                    graphics.drawString("Energy: " + this.G.s() + "/" + this.G.r(), 430, 465);
                    graphics.drawString("AP: " + this.G.w(), 430, 480);
                    if (this.G.u() != 0) {
                        graphics.drawString("XP: " + this.G.t() + "/" + this.G.u(), 430, 495);
                    } else {
                        graphics.drawString("XP: " + this.G.t(), 430, 495);
                    }
                    graphics.drawString("XP Debt: " + this.G.v(), 430, 510);
                    MastersOfDestiny mastersOfDestiny32 = pS;
                    graphics.setFont(MastersOfDestiny.z);
                    graphics.setColor(new Color(16777215));
                    graphics.drawString("Skill Point: " + this.G.x(), 550, 513);
                    if (this.cf == 0) {
                        this.bK[0].paintIcon(pS, graphics, this.bN[0] - 1, this.bO + 1);
                        if (this.ca.size() - this.cc > 20) {
                            for (int i21 = this.cc; i21 < this.cc + 20; i21++) {
                                aQ aQVar = (aQ) this.ca.get(i21);
                                aQVar.m().paintIcon(pS, graphics, this.bv[i21 - this.cc] - 1, this.bw[i21 - this.cc]);
                                this.bY.paintIcon(pS, graphics, this.bv[i21 - this.cc] + 32, this.bw[i21 - this.cc] + 33);
                                if (aQVar.q() == 0) {
                                    MastersOfDestiny mastersOfDestiny33 = pS;
                                    graphics.setFont(MastersOfDestiny.ag);
                                    graphics.drawString(sm + aQVar.c(), this.bv[i21 - this.cc] + 36, this.bw[i21 - this.cc] + 43);
                                } else {
                                    this.bu.paintIcon(pS, graphics, this.bv[i21 - this.cc] + 33, this.bw[i21 - this.cc] + 33);
                                }
                            }
                        } else {
                            for (int i22 = this.cc; i22 < this.ca.size(); i22++) {
                                aQ aQVar2 = (aQ) this.ca.get(i22);
                                aQVar2.m().paintIcon(pS, graphics, this.bv[i22 - this.cc] - 1, this.bw[i22 - this.cc]);
                                this.bY.paintIcon(pS, graphics, this.bv[i22 - this.cc] + 32, this.bw[i22 - this.cc] + 33);
                                if (aQVar2.q() == 0) {
                                    MastersOfDestiny mastersOfDestiny34 = pS;
                                    graphics.setFont(MastersOfDestiny.ag);
                                    graphics.drawString(sm + aQVar2.c(), this.bv[i22 - this.cc] + 36, this.bw[i22 - this.cc] + 43);
                                } else {
                                    this.bu.paintIcon(pS, graphics, this.bv[i22 - this.cc] + 33, this.bw[i22 - this.cc] + 33);
                                }
                            }
                        }
                    } else if (this.cf == 1) {
                        this.bK[1].paintIcon(pS, graphics, this.bN[1] - 1, this.bO + 1);
                        if (this.bZ.size() - this.ce > 20) {
                            for (int i23 = this.ce; i23 < this.ce + 20; i23++) {
                                C0039s c0039s = (C0039s) this.bZ.get(i23);
                                aQ a7 = this.um.a(c0039s.a(((int) c0039s.c()) - 1));
                                a7.m().paintIcon(pS, graphics, this.bv[i23 - this.ce] - 1, this.bw[i23 - this.ce]);
                                this.bY.paintIcon(pS, graphics, this.bv[i23 - this.ce] + 32, this.bw[i23 - this.ce] + 33);
                                MastersOfDestiny mastersOfDestiny35 = pS;
                                graphics.setFont(MastersOfDestiny.ag);
                                graphics.drawString(sm + a7.c(), this.bv[i23 - this.ce] + 36, this.bw[i23 - this.ce] + 43);
                                if (!c0039s.d() || a7.k() > this.G.x()) {
                                    c0039s.a(false);
                                    this.bt.paintIcon(pS, graphics, this.bv[i23 - this.ce] - 1, this.bw[i23 - this.ce]);
                                } else if (this.bX == i23) {
                                    this.bs.paintIcon(pS, graphics, this.bv[i23 - this.ce] - 1, this.bw[i23 - this.ce]);
                                }
                            }
                        } else {
                            for (int i24 = this.ce; i24 < this.bZ.size(); i24++) {
                                C0039s c0039s2 = (C0039s) this.bZ.get(i24);
                                aQ a8 = this.um.a(c0039s2.a(((int) c0039s2.c()) - 1));
                                a8.m().paintIcon(pS, graphics, this.bv[i24 - this.ce] - 1, this.bw[i24 - this.ce]);
                                this.bY.paintIcon(pS, graphics, this.bv[i24 - this.ce] + 32, this.bw[i24 - this.ce] + 33);
                                MastersOfDestiny mastersOfDestiny36 = pS;
                                graphics.setFont(MastersOfDestiny.ag);
                                graphics.drawString(sm + a8.c(), this.bv[i24 - this.ce] + 36, this.bw[i24 - this.ce] + 43);
                                if (!c0039s2.d() || a8.k() > this.G.x()) {
                                    c0039s2.a(false);
                                    this.bt.paintIcon(pS, graphics, this.bv[i24 - this.ce] - 1, this.bw[i24 - this.ce]);
                                } else if (this.bX == i24) {
                                    this.bs.paintIcon(pS, graphics, this.bv[i24 - this.ce] - 1, this.bw[i24 - this.ce]);
                                }
                            }
                        }
                        if (this.gG) {
                            this.gC.paintIcon(pS, graphics, this.bG - 1, this.bH - 1);
                        }
                    }
                    boolean z = false;
                    int i25 = 0;
                    while (true) {
                        if (i25 < this.bZ.size()) {
                            if (((C0039s) this.bZ.get(i25)).d()) {
                                z = true;
                            } else {
                                i25++;
                            }
                        }
                    }
                    if (z) {
                        if (this.bU == 3) {
                            this.bR.paintIcon(pS, graphics, this.bS - 1, this.bT - 1);
                            this.bU = 0;
                        }
                        this.bU++;
                    }
                    MastersOfDestiny mastersOfDestiny37 = pS;
                    graphics.setFont(MastersOfDestiny.z);
                    if (this.cg.j != null) {
                        this.cg.a(graphics, pS);
                    }
                }
                if (this.gy) {
                    this.gz.paintIcon(pS, graphics, this.go, this.gp);
                    this.gn.a(graphics, pS);
                }
                this.ac.a(graphics, pS);
                return;
        }
    }

    public String a(String str) {
        String str2 = "read failed";
        try {
            InputStream resourceAsStream = getClass().getResourceAsStream(str);
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
                str2 = new String(byteArrayOutputStream.toByteArray(), "utf-8");
            }
            C0032k.a("read from item file = " + str2);
        } catch (IOException e) {
            C0032k.a(e.getMessage());
        }
        return str2;
    }

    public String[] a(String str, Graphics graphics, int i) {
        String str2;
        Vector vector = new Vector();
        FontMetrics fontMetrics = graphics.getFontMetrics();
        String[] split = str.split(" ");
        String str3 = sm;
        int i2 = 0;
        while (i2 < split.length) {
            if (fontMetrics.stringWidth(str3 + split[i2]) > i) {
                vector.add(str3);
                i2--;
                str2 = sm;
            } else {
                str2 = str3 + split[i2] + " ";
            }
            str3 = str2;
            i2++;
        }
        vector.add(str3);
        return (String[]) vector.toArray(new String[vector.size()]);
    }

    public void a(long j) {
        switch (this.ab) {
            case 1:
                return;
            case 2:
                return;
            case 3:
                return;
            case 4:
                f(this.ur, System.currentTimeMillis());
                return;
            case 5:
                a(this.ur, System.currentTimeMillis());
                return;
            case 6:
                return;
            case 7:
                g(this.ur, System.currentTimeMillis());
                return;
            default:
                if (this.G == null) {
                    return;
                }
                return;
        }
    }

    private void b(byte b, Object obj) {
        this.ab = b;
        C0032k.a("here");
        if (this.ab == 0) {
            pS.add(pS.o);
            return;
        }
        pS.remove(pS.o);
        pS.remove(pS.p);
        switch (this.ab) {
            case 1:
                f(obj);
                return;
            case 2:
                h(obj);
                return;
            case 3:
                g(obj);
                return;
            case 4:
                o(obj);
                return;
            case 5:
                i(obj);
                return;
            case 6:
                l(obj);
                return;
            case 7:
                p(obj);
                return;
            default:
                return;
        }
    }

    public void b(String str) {
        this.U.write(str);
        this.U.flush();
        C0032k.a("sent: " + str);
    }

    public void a(MouseEvent mouseEvent) {
        switch (this.ab) {
            case 1:
                f(mouseEvent);
                return;
            case 2:
                s(mouseEvent);
                return;
            case 3:
                k(mouseEvent);
                return;
            case 4:
                ab(mouseEvent);
                return;
            case 5:
                x(mouseEvent);
                return;
            case 6:
                M(mouseEvent);
                return;
            case 7:
                ag(mouseEvent);
                return;
            default:
                this.fn = -1;
                this.aB = -1;
                this.fa = -1;
                this.gF = false;
                this.gG = false;
                this.gH = -1;
                this.gI = -1;
                for (int i = 0; i < this.aD.length; i++) {
                    if (mouseEvent.getX() >= this.aD[i] + 2 && mouseEvent.getX() <= this.aD[i] + this.aF + 2 && mouseEvent.getY() >= this.aE + 2 && mouseEvent.getY() <= this.aE + this.aG + 2) {
                        this.aB = i;
                        return;
                    }
                }
                this.fq = -1;
                for (int i2 = 0; i2 < this.fs.length; i2++) {
                    if (mouseEvent.getX() >= this.fs[i2] && mouseEvent.getX() <= this.fs[i2] + this.fu && mouseEvent.getY() >= this.ft && mouseEvent.getY() <= this.ft + this.fv) {
                        this.fq = i2;
                        return;
                    }
                }
                if (this.O.e()) {
                    int m = this.O.m();
                    if (this.O.b(mouseEvent.getX(), mouseEvent.getY()) && m != this.O.m()) {
                        C0021aw.b.a(C0028g.c);
                        pS.repaint();
                        return;
                    }
                }
                if (this.aA == 3) {
                    if (mouseEvent.getX() >= this.eW[0] && mouseEvent.getX() <= this.eW[0] + this.eY[0] && mouseEvent.getY() >= this.eX[0] && mouseEvent.getY() <= this.eX[0] + this.eZ) {
                        this.fa = 0;
                        return;
                    } else if (mouseEvent.getX() >= this.eW[1] && mouseEvent.getX() <= this.eW[1] + this.eY[1] && mouseEvent.getY() >= this.eX[1] && mouseEvent.getY() <= this.eX[1] + this.eZ) {
                        this.fa = 1;
                        return;
                    } else if (mouseEvent.getX() >= this.eW[2] && mouseEvent.getX() <= this.eW[2] + this.eY[2] && mouseEvent.getY() >= this.eX[2] && mouseEvent.getY() <= this.eX[2] + this.eZ) {
                        this.fa = 2;
                        return;
                    } else if (mouseEvent.getX() >= this.fj && mouseEvent.getX() <= this.fj + this.fl && mouseEvent.getY() >= this.fk && mouseEvent.getY() <= this.fk + this.fm) {
                        this.fn = this.fh + ((int) Math.floor((mouseEvent.getY() - this.fk) / 17));
                        this.fo = mouseEvent.getX();
                        this.fp = mouseEvent.getY();
                        return;
                    }
                }
                if (this.aA == 0) {
                    if (this.fA == 3 && mouseEvent.getX() >= this.fW && mouseEvent.getX() <= this.fW + this.fY && mouseEvent.getY() >= this.fX && mouseEvent.getY() <= this.fX + this.fZ) {
                        this.gF = true;
                        return;
                    }
                    int length = this.fQ * this.fH.length;
                    for (int i3 = 0; i3 < this.fI.length; i3++) {
                        for (int i4 = 0; i4 < this.fH.length; i4++) {
                            if (mouseEvent.getX() > this.fH[i4] && mouseEvent.getX() < this.fH[i4] + this.fL && mouseEvent.getY() > this.fI[i3] && mouseEvent.getY() < this.fI[i3] + this.fM) {
                                this.fO = this.fH[i4] - 2;
                                this.fP = this.fI[i3] - 2;
                                if (length < this.G.H[this.fA].size()) {
                                    this.gg.a((byte) 4);
                                    int i5 = this.fO + this.fL;
                                    int i6 = this.fP + ((this.fM / 3) * 2);
                                    if (i5 + 130 > 780) {
                                        i5 -= 130;
                                    }
                                    if (i6 + 150 > 580) {
                                        i6 -= 100;
                                    }
                                    MastersOfDestiny mastersOfDestiny = pS;
                                    this.gg.a(((C0020av) this.G.H[this.fA].elementAt(length)).f(), i5, i6, 150, 88, MastersOfDestiny.C, null);
                                    return;
                                }
                            }
                            length++;
                        }
                    }
                    for (int i7 = 0; i7 < this.fJ.length; i7++) {
                        if (mouseEvent.getX() > this.fJ[i7] && mouseEvent.getX() < this.fJ[i7] + this.fL && mouseEvent.getY() > this.fK[i7] && mouseEvent.getY() < this.fK[i7] + this.fM) {
                            this.fO = this.fJ[i7] - 2;
                            this.fP = this.fK[i7] - 2;
                            if (i7 < 3) {
                                for (int i8 = 0; i8 < this.G.M.size(); i8++) {
                                    if (((C0020av) this.G.M.elementAt(i8)).d() == i7 + 1) {
                                        this.gg.a((byte) 4);
                                        int i9 = this.fO + this.fL;
                                        int i10 = this.fP + ((this.fM / 3) * 2);
                                        if (i9 + 130 > 780) {
                                            i9 -= 130;
                                        }
                                        if (i10 + 100 > 580) {
                                            i10 -= 100;
                                        }
                                        MastersOfDestiny mastersOfDestiny2 = pS;
                                        this.gg.a(((C0020av) this.G.M.elementAt(i8)).f(), i9, i10, 150, 88, MastersOfDestiny.C, null);
                                        return;
                                    }
                                }
                                continue;
                            } else {
                                for (int i11 = 0; i11 < this.G.M.size(); i11++) {
                                    if (((C0020av) this.G.M.elementAt(i11)).d() == i7 + 2) {
                                        this.gg.a((byte) 4);
                                        int i12 = this.fO + this.fL;
                                        int i13 = this.fP + ((this.fM / 3) * 2);
                                        if (i12 + 130 > 780) {
                                            i12 -= 130;
                                        }
                                        if (i13 + 100 > 580) {
                                            i13 -= 100;
                                        }
                                        MastersOfDestiny mastersOfDestiny3 = pS;
                                        this.gg.a(((C0020av) this.G.M.elementAt(i11)).f(), i12, i13, 150, 88, MastersOfDestiny.C, null);
                                        return;
                                    }
                                }
                                continue;
                            }
                        }
                    }
                    C0011ak c0011ak = this.gg;
                    MastersOfDestiny mastersOfDestiny4 = pS;
                    c0011ak.a(null, 575, 307, 130, 88, MastersOfDestiny.C, null);
                }
                if (this.cC) {
                    if (mouseEvent.getX() >= this.cK[0] && mouseEvent.getX() <= this.cK[0] + this.cM && mouseEvent.getY() >= this.cL && mouseEvent.getY() <= this.cL + this.cN && !this.cJ) {
                        this.gH = 0;
                        return;
                    } else if (mouseEvent.getX() >= this.cK[1] && mouseEvent.getX() <= this.cK[1] + this.cM && mouseEvent.getY() >= this.cL && mouseEvent.getY() <= this.cL + this.cN) {
                        this.gH = 1;
                        return;
                    } else {
                        if (this.dw) {
                            if (mouseEvent.getX() >= this.dA[0] && mouseEvent.getX() <= this.dA[0] + this.dC[0] && mouseEvent.getY() >= this.dB && mouseEvent.getY() <= this.dB + this.dD) {
                                this.gI = 0;
                                return;
                            } else if (mouseEvent.getX() >= this.dA[1] && mouseEvent.getX() <= this.dA[1] + this.dC[1] && mouseEvent.getY() >= this.dB && mouseEvent.getY() <= this.dB + this.dD) {
                                this.gI = 1;
                                return;
                            }
                        }
                        for (int i14 = 0; i14 < this.dh.length; i14++) {
                            if (mouseEvent.getX() > this.dh[i14] && mouseEvent.getX() < this.dh[i14] + this.dj && mouseEvent.getY() > this.di[i14] && mouseEvent.getY() < this.di[i14] + this.dk) {
                                this.dr = i14 + this.dq;
                                this.ds = this.dh[i14] - 2;
                                this.dt = this.di[i14] - 2;
                                if (this.dr < this.G.H[this.dc].size()) {
                                    this.gg.a((byte) 4);
                                    int i15 = this.ds + this.dj;
                                    int i16 = this.dt + ((this.dk / 3) * 2);
                                    if (i15 + 130 > 780) {
                                        i15 -= 130;
                                    }
                                    if (i16 + 120 > 580) {
                                        i16 -= 120;
                                    }
                                    MastersOfDestiny mastersOfDestiny5 = pS;
                                    this.gg.a(((C0020av) this.G.H[this.dc].elementAt(this.dr)).f(), i15, i16, 150, 88, MastersOfDestiny.C, null);
                                    return;
                                }
                            }
                        }
                        C0011ak c0011ak2 = this.gg;
                        MastersOfDestiny mastersOfDestiny6 = pS;
                        c0011ak2.a(null, 575, 307, 130, 88, MastersOfDestiny.C, null);
                    }
                }
                if (this.aA == 2) {
                    if (this.cf == 0) {
                        for (int i17 = 0; i17 < this.bv.length; i17++) {
                            if (mouseEvent.getX() > this.bv[i17] && mouseEvent.getX() < this.bv[i17] + this.bx && mouseEvent.getY() > this.bw[i17] && mouseEvent.getY() < this.bw[i17] + this.by) {
                                if (i17 + this.cc >= this.ca.size()) {
                                    this.cb = -1;
                                    C0011ak c0011ak3 = this.cg;
                                    MastersOfDestiny mastersOfDestiny7 = pS;
                                    c0011ak3.a(null, 575, 307, 130, 88, MastersOfDestiny.C, null);
                                    return;
                                }
                                this.cb = i17 + this.cc;
                                this.cg.a((byte) 6);
                                aQ aQVar = (aQ) this.ca.get(this.cb);
                                int i18 = this.bv[i17] + this.bx;
                                int i19 = this.bw[i17] + ((this.by / 3) * 2);
                                if (i18 + 180 > 780) {
                                    i18 -= 180;
                                }
                                if (i17 > 9) {
                                    i19 -= 150;
                                }
                                MastersOfDestiny mastersOfDestiny8 = pS;
                                this.cg.a(aQVar.s(), i18, i19, 150, 88, MastersOfDestiny.C, null);
                                return;
                            }
                        }
                        C0011ak c0011ak4 = this.cg;
                        MastersOfDestiny mastersOfDestiny9 = pS;
                        c0011ak4.a(null, 575, 307, 130, 88, MastersOfDestiny.C, null);
                    } else if (this.cf == 1) {
                        if (mouseEvent.getX() > this.bG && mouseEvent.getX() < this.bG + this.bI && mouseEvent.getY() > this.bH && mouseEvent.getY() < this.bH + this.bJ) {
                            this.gG = true;
                            return;
                        }
                        for (int i20 = 0; i20 < this.bv.length; i20++) {
                            if (mouseEvent.getX() > this.bv[i20] && mouseEvent.getX() < this.bv[i20] + this.bx && mouseEvent.getY() > this.bw[i20] && mouseEvent.getY() < this.bw[i20] + this.by && i20 + this.ce < this.bZ.size()) {
                                this.cd = i20 + this.ce;
                                this.cg.a((byte) 6);
                                C0039s c0039s = (C0039s) this.bZ.get(this.cd);
                                aQ a = this.um.a(c0039s.a(((int) c0039s.c()) - 1));
                                int i21 = this.bv[i20] + this.bx;
                                int i22 = this.bw[i20] + ((this.by / 3) * 2);
                                if (i21 + 130 > 780) {
                                    i21 -= 180;
                                }
                                if (i20 > 9) {
                                    i22 -= 150;
                                }
                                MastersOfDestiny mastersOfDestiny10 = pS;
                                this.cg.a(a.s(), i21, i22, 150, 88, MastersOfDestiny.C, null);
                                return;
                            }
                        }
                        this.cd = -1;
                        C0011ak c0011ak5 = this.cg;
                        MastersOfDestiny mastersOfDestiny11 = pS;
                        c0011ak5.a(null, 575, 307, 130, 88, MastersOfDestiny.C, null);
                    }
                }
                if (this.aA == 4) {
                    this.co = -1;
                    for (int i23 = 0; i23 < this.cl.length; i23++) {
                        if (mouseEvent.getX() > this.ck && mouseEvent.getX() < this.ck + this.cm && mouseEvent.getY() > this.cl[i23] && mouseEvent.getY() < this.cl[i23] + this.cn) {
                            this.co = i23;
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public void b(MouseEvent mouseEvent) {
        int parseInt;
        int b;
        int parseInt2;
        String[] split;
        switch (this.ab) {
            case 1:
                g(mouseEvent);
                return;
            case 2:
                q(mouseEvent);
                return;
            case 3:
                l(mouseEvent);
                return;
            case 4:
                aa(mouseEvent);
                return;
            case 5:
                w(mouseEvent);
                return;
            case 6:
                L(mouseEvent);
                return;
            case 7:
                af(mouseEvent);
                return;
            default:
                if (this.gy) {
                    if (mouseEvent.getX() >= this.gq && mouseEvent.getX() <= this.gq + this.gs && mouseEvent.getY() >= this.gr[0] && mouseEvent.getY() <= this.gr[0] + this.gt) {
                        this.gn.a((byte) 0);
                        return;
                    } else if (mouseEvent.getX() >= this.gq && mouseEvent.getX() <= this.gq + this.gs && mouseEvent.getY() >= this.gr[1] && mouseEvent.getY() <= this.gr[1] + this.gt) {
                        this.gn.a((byte) 1);
                        return;
                    } else if (mouseEvent.getX() >= this.gu && mouseEvent.getX() <= this.gu + this.gw && mouseEvent.getY() >= this.gv && mouseEvent.getY() <= this.gv + this.gx) {
                        this.gn.b();
                        if (this.gA == null) {
                            this.gy = false;
                            return;
                        }
                        this.gn.a(this.gA, 16777215, 16777215);
                        this.gn.a((byte) 2);
                        this.rc = true;
                        this.gA = null;
                        return;
                    }
                }
                if (this.aB != -1) {
                    if (this.aB == this.aA) {
                        this.aA = -1;
                        if (this.aB == 3) {
                            pS.remove(pS.p);
                            return;
                        }
                        return;
                    }
                    this.aA = this.aB;
                    if (this.aA == 3) {
                        this.fh = 0;
                        this.fg = 0;
                        pS.add(pS.p);
                        pS.p.requestFocusInWindow();
                    } else {
                        pS.remove(pS.p);
                    }
                    if (this.aA == 1) {
                        this.bq = new Vector();
                        this.br = new Vector();
                        this.aU = 0;
                        this.aV = 0;
                        this.aS = 0;
                        this.aT = 0;
                        this.bg = 0;
                        this.bo = 0;
                        this.bp = 0;
                        this.U.write("O1\n");
                        this.U.flush();
                        this.U.write("O3\n");
                        this.U.flush();
                        C0032k.a("quest request sent");
                    }
                    if (this.aA == 0) {
                        this.fA = 0;
                        this.U.write("PSR\n");
                        this.U.flush();
                        this.U.write("WR\n");
                        this.U.flush();
                    }
                    if (this.aA == 2) {
                        this.cb = -1;
                        this.cc = 0;
                        this.cd = -1;
                        this.ce = 0;
                        this.cf = 0;
                        this.bW = -1;
                        this.bX = -1;
                        this.U.write("RC\n");
                        this.U.flush();
                        C0032k.a("char skill request sent");
                    }
                    if (this.aA == 4) {
                        this.cw = 0;
                        this.cv = 0;
                        this.U.write("RPD\n");
                        this.U.flush();
                        C0032k.a("planet player list request sent");
                    }
                    if (this.aA == 5) {
                        this.ew = 0;
                        this.ex = 0;
                        this.eh = 0;
                        this.ei = -1;
                        this.ez = false;
                        return;
                    }
                    return;
                }
                if (this.aA == 3) {
                    if (mouseEvent.getX() >= this.eW[0] && mouseEvent.getX() <= this.eW[0] + this.eY[0] && mouseEvent.getY() >= this.eX[0] && mouseEvent.getY() <= this.eX[0] + this.eZ) {
                        String[] a = this.pP.a();
                        String[] b2 = this.pP.b();
                        if (this.fg < a.length) {
                            pS.o.setText("/w " + a[this.fg] + " ");
                            pS.o.requestFocusInWindow();
                            return;
                        } else if (this.fg < a.length || this.fg >= this.pP.c()) {
                            return;
                        } else {
                            pS.o.setText("/w " + b2[this.fg - a.length] + " ");
                            pS.o.requestFocusInWindow();
                            return;
                        }
                    } else if (mouseEvent.getX() >= this.eW[1] && mouseEvent.getX() <= this.eW[1] + this.eY[1] && mouseEvent.getY() >= this.eX[1] && mouseEvent.getY() <= this.eX[1] + this.eZ) {
                        String[] a2 = this.pP.a();
                        String[] b3 = this.pP.b();
                        if (this.fg < a2.length) {
                            String str = a2[this.fg];
                            this.U.write("BD|" + str + "\n");
                            this.U.flush();
                            this.pP.a(str);
                            C0032k.a("remove buddy " + str);
                            return;
                        } else if (this.fg < a2.length || this.fg >= this.pP.c()) {
                            return;
                        } else {
                            String str2 = b3[this.fg - a2.length];
                            this.U.write("BD|" + str2 + "\n");
                            this.U.flush();
                            this.pP.a(str2);
                            C0032k.a("remove buddy " + str2);
                            return;
                        }
                    } else if (mouseEvent.getX() >= this.eW[2] && mouseEvent.getX() <= this.eW[2] + this.eY[2] && mouseEvent.getY() >= this.eX[2] && mouseEvent.getY() <= this.eX[2] + this.eZ) {
                        String trim = pS.p.getText().trim();
                        C0032k.a("add buddy " + trim);
                        if (!trim.equals(sm)) {
                            C0032k.a("add buddy 2");
                            pS.p.setText(sm);
                            this.U.write("BR|" + trim + "| |\n");
                            this.U.flush();
                        }
                        C0032k.a("add buddy");
                        return;
                    } else if (mouseEvent.getX() >= this.fj && mouseEvent.getX() <= this.fj + this.fl && mouseEvent.getY() >= this.fk && mouseEvent.getY() <= this.fk + this.fm) {
                        this.fg = this.fh + ((int) Math.floor((mouseEvent.getY() - this.fk) / 17));
                        return;
                    } else if (mouseEvent.getX() >= this.fb && mouseEvent.getX() <= this.fb + this.fe && mouseEvent.getY() >= this.fc && mouseEvent.getY() <= this.fc + this.ff) {
                        if (this.fh > 0) {
                            this.fh--;
                        }
                        if (this.fg >= this.fh + fi) {
                            this.fg = (this.fh + fi) - 1;
                            return;
                        }
                        return;
                    } else if (mouseEvent.getX() >= this.fb && mouseEvent.getX() <= this.fb + this.fe && mouseEvent.getY() >= this.fd && mouseEvent.getY() <= this.fd + this.ff) {
                        if ((this.fh + fi) - 1 < this.pP.c()) {
                            this.fh++;
                        }
                        if (this.fg < this.fh) {
                            this.fg = this.fh;
                            return;
                        }
                        return;
                    } else if (mouseEvent.getX() >= this.aH && mouseEvent.getX() <= this.aH + this.aJ && mouseEvent.getY() >= this.aI[3] && mouseEvent.getY() <= this.aI[3] + this.aK) {
                        this.aA = -1;
                        pS.remove(pS.p);
                        return;
                    }
                }
                if (this.aA == 4) {
                    if (this.co == 0) {
                        pS.o.setText("/w " + this.pR.b()[this.cv].split("\\|")[0] + " ");
                        pS.o.requestFocusInWindow();
                        return;
                    } else if (this.co == 1) {
                        this.U.write("T1|" + this.pR.a()[this.cv] + "\n");
                        this.U.flush();
                        return;
                    } else if (this.co == 2) {
                        if (this.pR.b()[this.cv].split("\\|").equals(sm)) {
                            return;
                        }
                        C0032k.a("add buddy 2");
                        pS.p.setText(sm);
                        this.U.write("BR|" + split[0] + "| |\n");
                        this.U.flush();
                        return;
                    } else if (mouseEvent.getX() >= this.cx && mouseEvent.getX() <= this.cx + this.cz && mouseEvent.getY() >= this.cy && mouseEvent.getY() <= this.cy + this.cA) {
                        this.cv = this.cw + ((int) Math.floor((mouseEvent.getY() - this.cy) / 17));
                        return;
                    } else if (mouseEvent.getX() >= this.cq && mouseEvent.getX() <= this.cq + this.ct && mouseEvent.getY() >= this.cr && mouseEvent.getY() <= this.cr + this.cu) {
                        if (this.cw > 0) {
                            this.cw--;
                        }
                        if (this.cv >= this.cw + cp) {
                            this.cv = (this.cw + cp) - 1;
                            return;
                        }
                        return;
                    } else if (mouseEvent.getX() >= this.cq && mouseEvent.getX() <= this.cq + this.ct && mouseEvent.getY() >= this.cs && mouseEvent.getY() <= this.cs + this.cu) {
                        if ((this.cw + cp) - 1 < this.pR.c()) {
                            this.cw++;
                        }
                        if (this.cv < this.cw) {
                            this.cv = this.cw;
                            return;
                        }
                        return;
                    } else if (mouseEvent.getX() >= this.aH && mouseEvent.getX() <= this.aH + this.aJ && mouseEvent.getY() >= this.aI[4] && mouseEvent.getY() <= this.aI[4] + this.aK) {
                        this.aA = -1;
                        return;
                    }
                }
                if (this.cC) {
                    if (this.dw) {
                        if (mouseEvent.getX() >= this.dE && mouseEvent.getX() <= this.dE + this.dG && mouseEvent.getY() >= this.dF[1] && mouseEvent.getY() <= this.dF[1] + this.dH) {
                            pS.q.setText(sm + (Integer.parseInt(pS.q.getText().trim()) > 1 ? parseInt2 - 1 : 1));
                            return;
                        } else if (mouseEvent.getX() >= this.dE && mouseEvent.getX() <= this.dE + this.dG && mouseEvent.getY() >= this.dF[0] && mouseEvent.getY() <= this.dF[0] + this.dH) {
                            pS.q.setText(sm + (Integer.parseInt(pS.q.getText().trim()) < ((C0020av) this.G.H[this.dc].elementAt(this.dv + this.dq)).b() ? parseInt + 1 : b));
                            return;
                        } else if (mouseEvent.getX() >= this.dA[0] && mouseEvent.getX() <= this.dA[0] + this.dC[0] && mouseEvent.getY() >= this.dB && mouseEvent.getY() <= this.dB + this.dD) {
                            this.gI = -1;
                            pS.c();
                            return;
                        } else if (mouseEvent.getX() >= this.dA[1] && mouseEvent.getX() <= this.dA[1] + this.dC[1] && mouseEvent.getY() >= this.dB && mouseEvent.getY() <= this.dB + this.dD) {
                            this.dw = false;
                            this.du = -1;
                            this.dI = null;
                            this.gI = -1;
                            pS.remove(pS.q);
                            pS.q.setText("1");
                            return;
                        }
                    } else if (mouseEvent.getX() >= this.cK[0] && mouseEvent.getX() <= this.cK[0] + this.cM && mouseEvent.getY() >= this.cL && mouseEvent.getY() <= this.cL + this.cN && !this.cI && !this.cJ) {
                        this.cI = true;
                        for (int i = 0; i < this.cU.size(); i++) {
                            if (this.cU.get(i) != null) {
                                C0020av c0020av = (C0020av) this.cU.get(i);
                                long a3 = c0020av.a().a();
                                int b4 = c0020av.b();
                                this.U.write("T8|" + this.dp + "|" + a3 + "|" + b4 + "\n");
                                this.U.flush();
                                C0032k.a("sent T8|" + this.dp + "|" + a3 + "|" + b4);
                            }
                        }
                        String trim2 = pS.r.getText().trim();
                        this.cW = 0;
                        if (trim2 != null) {
                            this.cW = Integer.parseInt(trim2);
                        }
                        if (this.cW > ((int) X)) {
                            this.cW = (int) X;
                        }
                        if (this.cW < 0) {
                            this.cW = 0;
                        }
                        X -= this.cW;
                        this.U.write("T16|" + this.dp + "|" + this.cW + "\n");
                        this.U.flush();
                        C0032k.a("sent T16|" + this.dp + "|" + this.cW);
                        return;
                    } else if (mouseEvent.getX() >= this.cK[0] && mouseEvent.getX() <= this.cK[0] + this.cM && mouseEvent.getY() >= this.cL && mouseEvent.getY() <= this.cL + this.cN && this.cI && !this.cJ) {
                        this.cJ = true;
                        this.cI = false;
                        this.dL = true;
                        this.gH = -1;
                        this.U.write("T12|" + this.dp + "\n");
                        this.U.flush();
                        return;
                    } else if (mouseEvent.getX() >= this.cK[1] && mouseEvent.getX() <= this.cK[1] + this.cM && mouseEvent.getY() >= this.cL && mouseEvent.getY() <= this.cL + this.cN) {
                        this.cC = false;
                        this.dK = false;
                        this.dL = false;
                        this.cJ = false;
                        for (int i2 = 0; i2 < this.cU.size(); i2++) {
                            C0020av c0020av2 = (C0020av) this.cU.get(i2);
                            int indexOf = this.G.H[c0020av2.a().h()].indexOf(c0020av2);
                            if (indexOf == -1) {
                                this.G.H[c0020av2.a().h()].add((C0020av) c0020av2.clone());
                            } else {
                                ((C0020av) this.G.H[c0020av2.a().h()].elementAt(indexOf)).a(((C0020av) this.G.H[c0020av2.a().h()].elementAt(indexOf)).b() + c0020av2.b());
                            }
                        }
                        this.cU = new Vector();
                        this.cT = new Vector();
                        this.cI = false;
                        X += this.cW;
                        this.cW = 0;
                        this.cV = 0;
                        pS.remove(pS.r);
                        this.dc = 0;
                        this.eP.a("Trade cancelled", 7549, 7549);
                        this.eP.a((byte) 3);
                        this.U.write("T15|" + this.dp + "\n");
                        this.U.flush();
                        this.dp = null;
                        return;
                    } else {
                        for (int i3 = 0; i3 < this.dd.length; i3++) {
                            if (mouseEvent.getX() >= this.dd[i3] && mouseEvent.getX() <= this.dd[i3] + this.df[i3] && mouseEvent.getY() >= this.de && mouseEvent.getY() <= this.de + this.dg) {
                                this.dc = i3;
                                this.dq = 0;
                                this.dr = 0;
                                this.ds = this.dh[0] - 2;
                                this.dt = this.di[0] - 2;
                                return;
                            }
                        }
                        for (int i4 = 0; i4 < this.dm.length; i4++) {
                            if (mouseEvent.getX() >= this.dl && mouseEvent.getX() <= this.dl + this.dn && mouseEvent.getY() >= this.dm[i4] && mouseEvent.getY() <= this.dm[i4] + this.f0do) {
                                switch (i4) {
                                    case 0:
                                        if (this.dq > 0) {
                                            this.dq -= 5;
                                            return;
                                        }
                                        return;
                                    case 1:
                                        if (this.dq + 10 < this.G.H[this.dc].size()) {
                                            this.dq += 5;
                                            return;
                                        }
                                        return;
                                }
                            }
                        }
                    }
                    if (mouseEvent.getX() >= this.cX && mouseEvent.getX() <= this.cX + this.cZ && mouseEvent.getY() >= this.cY && mouseEvent.getY() <= this.cY + this.da) {
                        this.cC = false;
                        this.dK = false;
                        this.dL = false;
                        this.cJ = false;
                        for (int i5 = 0; i5 < this.cU.size(); i5++) {
                            C0020av c0020av3 = (C0020av) this.cU.get(i5);
                            int indexOf2 = this.G.H[c0020av3.a().h()].indexOf(c0020av3);
                            if (indexOf2 == -1) {
                                this.G.H[c0020av3.a().h()].add((C0020av) c0020av3.clone());
                            } else {
                                ((C0020av) this.G.H[c0020av3.a().h()].elementAt(indexOf2)).a(((C0020av) this.G.H[c0020av3.a().h()].elementAt(indexOf2)).b() + c0020av3.b());
                            }
                        }
                        this.cU = new Vector();
                        this.cT = new Vector();
                        this.cI = false;
                        X += this.cW;
                        this.cW = 0;
                        this.cV = 0;
                        pS.remove(pS.r);
                        this.dc = 0;
                        this.eP.a("Trade cancelled", 7549, 7549);
                        this.eP.a((byte) 3);
                        this.U.write("T15|" + this.dp + "\n");
                        this.U.flush();
                        this.dp = null;
                        return;
                    }
                }
                if (this.aA == 5) {
                    if (mouseEvent.getX() >= this.dQ[0] && mouseEvent.getX() <= this.dQ[0] + this.dS[0] && mouseEvent.getY() >= this.dR && mouseEvent.getY() <= this.dR + this.dT) {
                        this.dP = 0;
                        return;
                    } else if (mouseEvent.getX() >= this.dQ[1] && mouseEvent.getX() <= this.dQ[1] + this.dS[1] && mouseEvent.getY() >= this.dR && mouseEvent.getY() <= this.dR + this.dT) {
                        if (this.dP == 0) {
                            this.ez = false;
                            this.ei = -1;
                            this.eh = 0;
                            this.ew = 0;
                            this.ex = 0;
                        }
                        this.dP = 1;
                        return;
                    } else {
                        if (this.dP == 0) {
                            if (mouseEvent.getX() >= this.eo && mouseEvent.getX() <= this.eo + this.eq && mouseEvent.getY() >= this.ep && mouseEvent.getY() <= this.ep + this.er) {
                                int floor = (int) Math.floor((mouseEvent.getY() - this.ep) / 17);
                                if (floor < this.eB.length - this.ew) {
                                    this.eh = floor + this.ew;
                                    this.ei = 0;
                                    this.ez = false;
                                    return;
                                }
                                return;
                            } else if (mouseEvent.getX() >= this.es && mouseEvent.getX() <= this.es + this.eu && mouseEvent.getY() >= this.et && mouseEvent.getY() <= this.et + this.ev && !this.ez) {
                                int floor2 = (int) Math.floor((mouseEvent.getY() - this.et) / 17);
                                String[][] strArr = (String[][]) this.eA.get(this.eh);
                                if (floor2 < strArr.length - this.ex) {
                                    this.ei = floor2 + this.ex;
                                    this.ey.b();
                                    C0032k.a(strArr[this.ei][1]);
                                    this.ey.a(strArr[this.ei][1], 16777215, 16777215);
                                    this.ey.a((byte) 2);
                                    this.ei = -1;
                                    this.ez = true;
                                    return;
                                }
                                return;
                            } else if (mouseEvent.getX() >= this.ej && mouseEvent.getX() <= this.ej + this.el && mouseEvent.getY() >= this.ek[0] && mouseEvent.getY() <= this.ek[0] + this.em) {
                                if (this.ew > 0) {
                                    this.ew--;
                                    return;
                                }
                                return;
                            } else if (mouseEvent.getX() >= this.ej && mouseEvent.getX() <= this.ej + this.el && mouseEvent.getY() >= this.ek[1] && mouseEvent.getY() <= this.ek[1] + this.em) {
                                if (this.eB.length - this.ew > 8) {
                                    this.ew++;
                                    return;
                                }
                                return;
                            } else if (mouseEvent.getX() >= this.en && mouseEvent.getX() <= this.en + this.el && mouseEvent.getY() >= this.ek[0] && mouseEvent.getY() <= this.ek[0] + this.em && this.ei != -1) {
                                if (this.ex > 0) {
                                    this.ex--;
                                    return;
                                }
                                return;
                            } else if (mouseEvent.getX() >= this.en && mouseEvent.getX() <= this.en + this.el && mouseEvent.getY() >= this.ek[1] && mouseEvent.getY() <= this.ek[1] + this.em && this.ei != -1) {
                                if (((String[][]) this.eA.get(this.eh)).length - this.ex > 8) {
                                    this.ex++;
                                    return;
                                }
                                return;
                            } else if (mouseEvent.getX() >= this.en && mouseEvent.getX() <= this.en + this.el && mouseEvent.getY() >= this.ek[0] && mouseEvent.getY() <= this.ek[0] + this.em && this.ez) {
                                this.ey.a((byte) 0);
                                return;
                            } else if (mouseEvent.getX() >= this.en && mouseEvent.getX() <= this.en + this.el && mouseEvent.getY() >= this.ek[1] && mouseEvent.getY() <= this.ek[1] + this.em && this.ez) {
                                this.ey.a((byte) 1);
                                return;
                            }
                        } else if (mouseEvent.getX() >= this.ed[0] && mouseEvent.getX() <= this.ed[0] + this.ef && mouseEvent.getY() >= this.ee && mouseEvent.getY() <= this.ee + this.eg) {
                            if (this.eb > 0) {
                                this.eb--;
                                C0021aw.b.b(this.eb);
                                return;
                            }
                            return;
                        } else if (mouseEvent.getX() >= this.ed[1] && mouseEvent.getX() <= this.ed[1] + this.ef && mouseEvent.getY() >= this.ee && mouseEvent.getY() <= this.ee + this.eg) {
                            if (this.eb < 9) {
                                this.eb++;
                                C0021aw.b.b(this.eb);
                                return;
                            }
                            return;
                        } else if (mouseEvent.getX() >= this.ed[2] && mouseEvent.getX() <= this.ed[2] + this.ef && mouseEvent.getY() >= this.ee && mouseEvent.getY() <= this.ee + this.eg) {
                            if (this.ec > 0) {
                                this.ec--;
                                C0021aw.b.a(this.ec);
                                return;
                            }
                            return;
                        } else if (mouseEvent.getX() >= this.ed[3] && mouseEvent.getX() <= this.ed[3] + this.ef && mouseEvent.getY() >= this.ee && mouseEvent.getY() <= this.ee + this.eg) {
                            if (this.ec < 9) {
                                this.ec++;
                                C0021aw.b.a(this.ec);
                                return;
                            }
                            return;
                        }
                        if (mouseEvent.getX() >= this.aH && mouseEvent.getX() <= this.aH + this.aJ && mouseEvent.getY() >= this.aI[5] && mouseEvent.getY() <= this.aI[5] + this.aK) {
                            this.aA = -1;
                            this.eh = 0;
                            this.ei = -1;
                            this.ew = 0;
                            this.ex = 0;
                            this.ez = false;
                            return;
                        }
                    }
                }
                if (this.aA == 1) {
                    if (mouseEvent.getX() >= this.aM[0] && mouseEvent.getX() <= this.aM[0] + this.aO[0] && mouseEvent.getY() >= this.aN && mouseEvent.getY() <= this.aN + this.aP) {
                        if (this.bg != 0) {
                            this.aU = 0;
                            this.aV = 0;
                            this.aS = 0;
                            this.aT = 0;
                            this.bo = 0;
                        }
                        this.bg = 0;
                        return;
                    } else if (mouseEvent.getX() >= this.aM[1] && mouseEvent.getX() <= this.aM[1] + this.aO[1] && mouseEvent.getY() >= this.aN && mouseEvent.getY() <= this.aN + this.aP) {
                        if (this.bg != 1) {
                            this.aU = 0;
                            this.aV = 0;
                            this.aS = 0;
                            this.aT = 0;
                            this.bo = 0;
                        }
                        this.bg = 1;
                        return;
                    } else if (mouseEvent.getX() >= this.aH && mouseEvent.getX() <= this.aH + this.aJ && mouseEvent.getY() >= this.aI[1] && mouseEvent.getY() <= this.aI[1] + this.aK) {
                        this.aA = -1;
                        return;
                    } else if (this.bg == 0) {
                        if (mouseEvent.getX() >= this.aW && mouseEvent.getX() <= this.aW + this.aZ && mouseEvent.getY() >= this.aX && mouseEvent.getY() <= this.aX + this.ba) {
                            if (this.aU > 0) {
                                this.aU--;
                            }
                            if (this.aS >= this.aU + this.bh) {
                                this.aS = (this.aU + this.bh) - 1;
                                return;
                            }
                            return;
                        } else if (mouseEvent.getX() >= this.aW && mouseEvent.getX() <= this.aW + this.aZ && mouseEvent.getY() >= this.aY && mouseEvent.getY() <= this.aY + this.ba) {
                            if (this.aU + this.bh < this.pQ.a()) {
                                this.aU++;
                            }
                            if (this.aS < this.aU) {
                                this.aS = this.aU;
                                return;
                            }
                            return;
                        } else if (mouseEvent.getX() >= this.bi && mouseEvent.getX() <= this.bi + this.bk && mouseEvent.getY() >= this.bj && mouseEvent.getY() <= this.bj + this.bl) {
                            this.aS = this.aU + ((int) Math.floor((mouseEvent.getY() - this.bj) / 17));
                            C0032k.a("Current Quest Index = " + this.aS);
                            return;
                        } else if (mouseEvent.getX() >= this.bb && mouseEvent.getX() <= this.bb + this.be && mouseEvent.getY() >= this.bc && mouseEvent.getY() <= this.bc + this.bf) {
                            if (this.bo > 0) {
                                this.bo--;
                                return;
                            }
                            return;
                        } else if (mouseEvent.getX() >= this.bb && mouseEvent.getX() <= this.bb + this.be && mouseEvent.getY() >= this.bd && mouseEvent.getY() <= this.bd + this.bf) {
                            if (this.bo + 7 < this.bp) {
                                this.bo++;
                                return;
                            }
                            return;
                        }
                    } else if (this.bg == 1) {
                        if (mouseEvent.getX() >= this.aW && mouseEvent.getX() <= this.aW + this.aZ && mouseEvent.getY() >= this.aX && mouseEvent.getY() <= this.aX + this.ba) {
                            if (this.aV > 0) {
                                this.aV--;
                            }
                            if (this.aT >= this.aV + this.bh) {
                                this.aT = (this.aV + this.bh) - 1;
                                return;
                            }
                            return;
                        } else if (mouseEvent.getX() >= this.aW && mouseEvent.getX() <= this.aW + this.aZ && mouseEvent.getY() >= this.aY && mouseEvent.getY() <= this.aY + this.ba) {
                            if (this.aV + this.bh < this.pQ.b()) {
                                this.aV++;
                            }
                            if (this.aT < this.aV) {
                                this.aT = this.aV;
                                return;
                            }
                            return;
                        } else if (mouseEvent.getX() >= this.bi && mouseEvent.getX() <= this.bi + this.bk && mouseEvent.getY() >= this.bj && mouseEvent.getY() <= this.bj + this.bl) {
                            this.aT = this.aV + ((int) Math.floor((mouseEvent.getY() - this.bj) / 17));
                            C0032k.a("Completed Quest Index = " + this.aT);
                            return;
                        } else if (mouseEvent.getX() >= this.bb && mouseEvent.getX() <= this.bb + this.be && mouseEvent.getY() >= this.bc && mouseEvent.getY() <= this.bc + this.bf) {
                            if (this.bo > 0) {
                                this.bo--;
                                return;
                            }
                            return;
                        } else if (mouseEvent.getX() >= this.bb && mouseEvent.getX() <= this.bb + this.be && mouseEvent.getY() >= this.bd && mouseEvent.getY() <= this.bd + this.bf) {
                            if (this.bo + 7 < this.bp) {
                                this.bo++;
                                return;
                            }
                            return;
                        }
                    }
                }
                if (this.aA == 0) {
                    for (int i6 = 0; i6 < this.fC.length; i6++) {
                        if (mouseEvent.getX() >= this.fC[i6] && mouseEvent.getX() <= this.fC[i6] + this.fE[i6] && mouseEvent.getY() >= this.fD && mouseEvent.getY() <= this.fD + this.fF) {
                            this.fA = i6;
                            this.fQ = 0;
                            this.fO = this.fH[0] - 2;
                            this.fP = this.fI[0] - 2;
                            return;
                        }
                    }
                    if (this.fA == 3) {
                        int length = this.fQ * this.fH.length;
                        for (int i7 = 0; i7 < this.fI.length; i7++) {
                            for (int i8 = 0; i8 < this.fH.length; i8++) {
                                if (mouseEvent.getX() >= this.fH[i8] && mouseEvent.getX() <= this.fH[i8] + this.fL && mouseEvent.getY() >= this.fI[i7] && mouseEvent.getY() <= this.fI[i7] + this.fM && length < this.G.H[this.fA].size()) {
                                    this.gb = length;
                                    this.gc = ((C0020av) this.G.H[this.fA].elementAt(length)).a().a();
                                    return;
                                }
                                length++;
                            }
                        }
                        if (mouseEvent.getX() >= this.fW && mouseEvent.getX() <= this.fW + this.fY && mouseEvent.getY() >= this.fX && mouseEvent.getY() <= this.fX + this.fZ && this.gc != -1) {
                            this.U.write("U1|" + this.gc + "\n");
                            this.U.flush();
                            C0032k.a("colony use item " + this.gc);
                            return;
                        }
                    }
                    for (int i9 = 0; i9 < this.fS.length; i9++) {
                        if (mouseEvent.getX() >= this.fR && mouseEvent.getX() <= this.fR + this.fT && mouseEvent.getY() >= this.fS[i9] && mouseEvent.getY() <= this.fS[i9] + this.fU) {
                            switch (i9) {
                                case 0:
                                    if (this.fQ > 0) {
                                        this.fQ--;
                                        return;
                                    }
                                    return;
                                case 1:
                                    if (this.fH.length * (this.fQ + this.fI.length) < this.G.H[this.fA].size()) {
                                        this.fQ++;
                                        return;
                                    }
                                    return;
                            }
                        }
                    }
                    if (mouseEvent.getX() >= this.aH && mouseEvent.getX() <= this.aH + this.aJ && mouseEvent.getY() >= this.aI[0] && mouseEvent.getY() <= this.aI[0] + this.aK) {
                        this.aA = -1;
                        return;
                    }
                }
                if (this.aA == 2) {
                    for (int i10 = 0; i10 < this.bN.length; i10++) {
                        if (mouseEvent.getX() > this.bN[i10] && mouseEvent.getX() < this.bN[i10] + this.bP[i10] && mouseEvent.getY() > this.bO && mouseEvent.getY() < this.bO + this.bQ) {
                            this.cf = i10;
                            this.cb = 0;
                            this.cc = 0;
                            this.cd = 0;
                            this.ce = 0;
                            this.bW = -1;
                            this.bX = -1;
                            return;
                        }
                    }
                    if (this.cf == 0) {
                        if (mouseEvent.getX() > this.bC && mouseEvent.getX() < this.bC + this.bE && mouseEvent.getY() > this.bD[0] && mouseEvent.getY() < this.bD[0] + this.bF) {
                            if (this.cc > 0) {
                                this.cc -= 5;
                                return;
                            }
                            return;
                        } else if (mouseEvent.getX() > this.bC && mouseEvent.getX() < this.bC + this.bE && mouseEvent.getY() > this.bD[1] && mouseEvent.getY() < this.bD[1] + this.bF) {
                            if (this.ca.size() <= 20 || this.cc >= this.ca.size() - 20) {
                                return;
                            }
                            this.cc += 5;
                            return;
                        }
                    }
                    if (this.cf == 1) {
                        if (this.cd != -1) {
                            C0039s c0039s = (C0039s) this.bZ.get(this.cd);
                            if (c0039s.d()) {
                                this.bW = (int) c0039s.a(((int) c0039s.c()) - 1);
                                this.bX = this.cd;
                                C0032k.a("Skill " + this.bW + " selected");
                                return;
                            }
                            return;
                        } else if (mouseEvent.getX() > this.bG && mouseEvent.getX() < this.bG + this.bI && mouseEvent.getY() > this.bH && mouseEvent.getY() < this.bH + this.bJ) {
                            if (this.bW != -1) {
                                this.U.write("LS|" + this.bW + "\n");
                                this.U.flush();
                                C0032k.a("Skill " + this.bW + " learning request sent");
                                this.bW = -1;
                                this.bX = -1;
                                return;
                            }
                            return;
                        } else if (mouseEvent.getX() > this.bC && mouseEvent.getX() < this.bC + this.bE && mouseEvent.getY() > this.bD[0] && mouseEvent.getY() < this.bD[0] + this.bF) {
                            if (this.ce > 0) {
                                this.ce -= 5;
                                return;
                            }
                            return;
                        } else if (mouseEvent.getX() > this.bC && mouseEvent.getX() < this.bC + this.bE && mouseEvent.getY() > this.bD[1] && mouseEvent.getY() < this.bD[1] + this.bF) {
                            if (this.bZ.size() <= 20 || this.ce >= this.bZ.size() - 20) {
                                return;
                            }
                            this.ce += 5;
                            return;
                        }
                    }
                    if (mouseEvent.getX() >= this.aH && mouseEvent.getX() <= this.aH + this.aJ && mouseEvent.getY() >= this.aI[2] && mouseEvent.getY() <= this.aI[2] + this.aK) {
                        this.aA = -1;
                        return;
                    }
                }
                if (mouseEvent.getX() > this.eC && mouseEvent.getX() < this.eC + this.eG && mouseEvent.getY() > this.eD && mouseEvent.getY() < this.eD + this.eH) {
                    this.eI.a((byte) 0);
                    return;
                } else if (mouseEvent.getX() > this.eE && mouseEvent.getX() < this.eE + this.eG && mouseEvent.getY() > this.eF && mouseEvent.getY() < this.eF + this.eH) {
                    this.eI.a((byte) 1);
                    return;
                } else if (mouseEvent.getX() > this.eJ && mouseEvent.getX() < this.eJ + this.eN && mouseEvent.getY() > this.eK && mouseEvent.getY() < this.eK + this.eO) {
                    this.eP.a((byte) 0);
                    return;
                } else if (mouseEvent.getX() > this.eL && mouseEvent.getX() < this.eL + this.eN && mouseEvent.getY() > this.eM && mouseEvent.getY() < this.eM + this.eO) {
                    this.eP.a((byte) 1);
                    return;
                } else if (this.fq != -1) {
                    a((byte) this.fq);
                    return;
                } else if (mouseEvent.getX() >= this.fw && mouseEvent.getX() <= this.fw + this.fy && mouseEvent.getY() >= this.fx && mouseEvent.getY() <= this.fx + this.fz) {
                    pS.a();
                    return;
                } else if (this.G == null) {
                    return;
                } else {
                    this.gM = false;
                    pS.requestFocusInWindow();
                    String str3 = (String) this.ac.a(mouseEvent);
                    if (str3 == null) {
                        this.ac.a(this.ac.b());
                        if (this.O.e() && this.O.b(mouseEvent.getX(), mouseEvent.getY())) {
                            C0021aw.b.a(C0028g.a);
                            C0032k.a("menu selectted state = " + ((int) this.qk));
                            if (this.qk != 5) {
                                b(this.qk, this.O.n());
                                return;
                            } else if (this.G.q() <= this.G.p()) {
                                b(this.qk, this.O.n());
                                return;
                            } else {
                                this.eP.a("You cannot go to mission before you lighten your inventory!", 16711680, 16711680);
                                this.eP.a((byte) 3);
                                return;
                            }
                        }
                        return;
                    }
                    b(str3);
                    C0032k.a("sending params..");
                    String[] split2 = str3.split("\\|");
                    if (split2[0].equalsIgnoreCase(C0022ax.r)) {
                        C0032k.a("param sent = AI");
                        if (!split2[split2.length - 1].equalsIgnoreCase("Y\n")) {
                            if (split2[split2.length - 1].equalsIgnoreCase("N\n")) {
                                C0032k.a("param set = AI no");
                                this.ac.a(this.ac.b());
                                return;
                            }
                            return;
                        }
                        C0032k.a("param set = AI yes");
                        this.ac.b().a(new int[]{1}, new Object[]{C0022ax.d(split2[1], split2[2], Long.parseLong(split2[3]))});
                        String[] split3 = ((String) this.am[1]).split("\\|");
                        if (!split3[2].equalsIgnoreCase("M")) {
                            if (split3[2].equalsIgnoreCase("A")) {
                            }
                            return;
                        }
                        C0032k.a("param set = AI M");
                        this.ac.b().b("Waiting for " + split3[1] + " to start mission:\n" + this.un.a(Long.parseLong(split3[3])).b() + "\n");
                        return;
                    } else if (split2[0].equalsIgnoreCase(C0022ax.u)) {
                        C0032k.a("param set = RM reject mission");
                        this.ac.a(this.ac.b());
                        return;
                    } else if (split2[0].equalsIgnoreCase("BA")) {
                        if (split2[2].equalsIgnoreCase("Y")) {
                            this.pP.a(split2[1], "online", split2[3]);
                            C0032k.a("add buddy " + split2[1]);
                        }
                        this.ac.a(this.ac.b());
                        return;
                    } else if (!split2[0].equalsIgnoreCase(tp)) {
                        if (split2[0].equalsIgnoreCase(to)) {
                            this.ac.a(this.ac.b());
                            return;
                        }
                        return;
                    } else {
                        this.cC = true;
                        this.aA = -1;
                        this.dp = split2[1].substring(0, split2[1].length() - 1);
                        pS.add(pS.r);
                        pS.r.setText("0");
                        this.ac.a(this.ac.b());
                        return;
                    }
                }
        }
    }

    public void a(byte b) {
        this.fq = b;
        this.U.write("EM|" + this.fq + "\n");
        this.U.flush();
        switch (this.fq) {
            case 0:
                this.eI.a(this.G.E + ": *smiles*", 16711680, 0);
                break;
            case 1:
                this.eI.a(this.G.E + ": *frowns*", 16711680, 0);
                break;
            case 2:
                this.eI.a(this.G.E + ": *SOS*", 16711680, 0);
                break;
            case 3:
                this.eI.a(this.G.E + ": *grateful*", 16711680, 0);
                break;
            case 4:
                this.eI.a(this.G.E + ": *sobs*", 16711680, 0);
                break;
            case 5:
                this.eI.a(this.G.E + ": *heart flutters*", 16711680, 0);
                break;
            case 6:
                this.eI.a(this.G.E + ": *blushes*", 16711680, 0);
                break;
            case 7:
                this.eI.a(this.G.E + ": *shocked*", 16711680, 0);
                break;
            case 8:
                this.eI.a(this.G.E + ": *grins*", 16711680, 0);
                break;
            case 9:
                this.eI.a(this.G.E + ": *yawns*", 16711680, 0);
                break;
            case 10:
                this.eI.a(this.G.E + ": *waves*", 16711680, 0);
                break;
        }
        this.eI.a((byte) 3);
        this.G.e(this.fq);
    }

    public void c(MouseEvent mouseEvent) {
        switch (this.ab) {
            case 1:
                h(mouseEvent);
                return;
            case 2:
                t(mouseEvent);
                return;
            case 3:
                n(mouseEvent);
                return;
            case 4:
                ac(mouseEvent);
                return;
            case 5:
                y(mouseEvent);
                return;
            case 6:
                N(mouseEvent);
                return;
            case 7:
                ah(mouseEvent);
                return;
            default:
                if (this.G == null) {
                    return;
                }
                this.gM = false;
                pS.requestFocusInWindow();
                if (this.O.e() && this.O.b(mouseEvent.getX(), mouseEvent.getY())) {
                    return;
                }
                if (this.aA == 0) {
                    for (int i = 0; i < this.fJ.length; i++) {
                        if (mouseEvent.getX() >= this.fJ[i] && mouseEvent.getX() <= this.fJ[i] + this.fL && mouseEvent.getY() >= this.fK[i] && mouseEvent.getY() <= this.fK[i] + this.fM) {
                            int i2 = 0;
                            Enumeration elements = this.G.M.elements();
                            while (elements.hasMoreElements()) {
                                int e = ((C0020av) elements.nextElement()).e() - 1;
                                if (e > 2) {
                                    e--;
                                }
                                if (e == i) {
                                    this.gi = (C0020av) ((C0020av) this.G.M.elementAt(i2)).clone();
                                    this.G.M.removeElementAt(i2);
                                    this.gk = this.fJ[i];
                                    this.gl = this.fK[i];
                                    this.gm = false;
                                    return;
                                }
                                i2++;
                            }
                            continue;
                        }
                    }
                    if (this.fA != 3) {
                        int length = this.fQ * this.fH.length;
                        for (int i3 = 0; i3 < this.fI.length; i3++) {
                            for (int i4 = 0; i4 < this.fH.length; i4++) {
                                if (mouseEvent.getX() >= this.fH[i4] && mouseEvent.getX() <= this.fH[i4] + this.fL && mouseEvent.getY() >= this.fI[i3] && mouseEvent.getY() <= this.fI[i3] + this.fM && length < this.G.H[this.fA].size() && ((C0020av) this.G.H[this.fA].elementAt(length)).b() > 0) {
                                    this.gi = (C0020av) ((C0020av) this.G.H[this.fA].elementAt(length)).clone();
                                    if (((C0020av) this.G.H[this.fA].elementAt(length)).b() == 1) {
                                        this.G.H[this.fA].removeElementAt(length);
                                    } else {
                                        this.gi.a(1);
                                        ((C0020av) this.G.H[this.fA].elementAt(length)).a(((C0020av) this.G.H[this.fA].elementAt(length)).b() - 1);
                                    }
                                    this.gk = this.fH[i4];
                                    this.gl = this.fI[i3];
                                    this.gm = true;
                                    return;
                                }
                                length++;
                            }
                        }
                    }
                }
                if (this.cC) {
                    for (int i5 = 0; i5 < this.cO.length; i5++) {
                        if (mouseEvent.getX() >= this.cO[i5] && mouseEvent.getX() <= this.cO[i5] + this.cR && mouseEvent.getY() >= this.cQ && mouseEvent.getY() <= this.cQ + this.cS && i5 < this.cU.size() && this.cU.get(i5) != null && !this.cI && !this.cJ) {
                            this.gi = (C0020av) ((C0020av) this.cU.get(i5)).clone();
                            this.cU.remove(i5);
                            this.gk = this.cO[i5];
                            this.gl = this.cQ;
                            this.dJ = false;
                            return;
                        }
                    }
                    for (int i6 = 0; i6 < this.dh.length; i6++) {
                        if (mouseEvent.getX() >= this.dh[i6] && mouseEvent.getX() <= this.dh[i6] + this.dj && mouseEvent.getY() >= this.di[i6] && mouseEvent.getY() <= this.di[i6] + this.dk && !this.cI && !this.cJ && i6 + this.dq < this.G.H[this.dc].size() && ((C0020av) this.G.H[this.dc].elementAt(i6 + this.dq)).b() > 0) {
                            this.gi = (C0020av) ((C0020av) this.G.H[this.dc].elementAt(i6 + this.dq)).clone();
                            this.gk = this.dh[i6];
                            this.gl = this.di[i6];
                            this.dv = i6;
                            this.dJ = true;
                            return;
                        }
                    }
                    if (mouseEvent.getY() >= this.cE && mouseEvent.getX() >= this.cD && mouseEvent.getX() <= this.cD + this.cF) {
                        return;
                    }
                }
                if (mouseEvent.getY() > 535) {
                    return;
                }
                if (mouseEvent.getX() >= 19 || mouseEvent.getY() <= 449) {
                    if (this.aA != -1) {
                        if (this.aA == 3 || this.aA == 4) {
                            if (mouseEvent.getY() >= this.ar[3] && mouseEvent.getX() >= 666) {
                                return;
                            }
                        } else if (mouseEvent.getY() >= this.ar[this.aA] && mouseEvent.getX() >= this.aq[this.aA]) {
                            return;
                        }
                    }
                    if (!this.gy || mouseEvent.getX() <= this.go || mouseEvent.getX() >= this.go + 412 || mouseEvent.getY() <= this.gp || mouseEvent.getY() >= this.gp + 142) {
                        this.G.d(mouseEvent.getX(), mouseEvent.getY());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public void d(MouseEvent mouseEvent) {
        switch (this.ab) {
            case 1:
                i(mouseEvent);
                return;
            case 2:
                v(mouseEvent);
                return;
            case 3:
                p(mouseEvent);
                return;
            case 4:
                ae(mouseEvent);
                return;
            case 5:
                A(mouseEvent);
                return;
            case 6:
                O(mouseEvent);
                return;
            case 7:
                ai(mouseEvent);
                return;
            default:
                if (this.G == null) {
                    return;
                }
                if (this.gi == null || this.cC) {
                    if (this.gi == null || !this.cC) {
                        this.G.F();
                        return;
                    }
                    if (this.dJ) {
                        if (mouseEvent.getX() < this.cO[0] || mouseEvent.getX() > this.cO[4] + this.cR || mouseEvent.getY() < this.cQ || mouseEvent.getY() > this.cQ + this.cS || this.cI || this.cJ) {
                            this.dI = null;
                            this.dv = -1;
                        } else if (this.cU.size() < 5) {
                            this.dw = true;
                            pS.add(pS.q);
                            pS.q.setText("1");
                            this.dI = (C0020av) this.gi.clone();
                        } else {
                            this.dI = null;
                            this.dv = -1;
                        }
                    } else if (mouseEvent.getX() < this.dh[0] || mouseEvent.getX() > this.dh[this.dh.length - 1] + this.dj || mouseEvent.getY() < this.di[0] || mouseEvent.getY() > this.di[this.di.length - 1] + this.dk) {
                        this.cU.add((C0020av) this.gi.clone());
                    } else {
                        int indexOf = this.G.H[this.gi.a().h()].indexOf(this.gi);
                        if (indexOf == -1) {
                            this.G.H[this.gi.a().h()].add((C0020av) this.gi.clone());
                        } else {
                            ((C0020av) this.G.H[this.gi.a().h()].elementAt(indexOf)).a(((C0020av) this.G.H[this.gi.a().h()].elementAt(indexOf)).b() + this.gi.b());
                        }
                    }
                    this.gi = null;
                    return;
                }
                if (this.gm) {
                    C0032k.a("item name = " + this.gi.a().c());
                    C0032k.a("item bodyslot = " + this.gi.a().j());
                    int j = this.gi.a().j() - 1;
                    if (j <= -1 || j >= 3) {
                        if (j > 3) {
                            j--;
                            if (mouseEvent.getX() < this.fJ[j] || mouseEvent.getX() > this.fJ[j] + this.fL || mouseEvent.getY() < this.fK[j] || mouseEvent.getY() > this.fK[j] + this.fM) {
                                j = -1;
                            } else {
                                C0032k.a("to body");
                                this.gi.b(j + 2);
                                this.gj = (C0020av) this.gi.clone();
                                this.U.write("C1|" + this.gi.a().a() + "|" + (j + 2) + "\n");
                                this.U.flush();
                            }
                        }
                    } else if (mouseEvent.getX() < this.fJ[j] || mouseEvent.getX() > this.fJ[j] + this.fL || mouseEvent.getY() < this.fK[j] || mouseEvent.getY() > this.fK[j] + this.fM) {
                        j = -1;
                    } else {
                        C0032k.a("to body");
                        this.gi.b(j + 1);
                        this.gj = (C0020av) this.gi.clone();
                        this.U.write("C1|" + this.gi.a().a() + "|" + (j + 1) + "\n");
                        this.U.flush();
                    }
                    if (j < 0) {
                        C0032k.a("back to inv");
                        int indexOf2 = this.G.H[this.gi.a().h()].indexOf(this.gi);
                        if (indexOf2 == -1) {
                            this.G.H[this.gi.a().h()].add((C0020av) this.gi.clone());
                        } else {
                            ((C0020av) this.G.H[this.gi.a().h()].elementAt(indexOf2)).a(((C0020av) this.G.H[this.gi.a().h()].elementAt(indexOf2)).b() + 1);
                        }
                    }
                } else if (mouseEvent.getX() < this.fH[0] || mouseEvent.getX() > this.fH[this.fH.length - 1] + this.fL || mouseEvent.getY() < this.fI[0] || mouseEvent.getY() > this.fI[this.fI.length - 1] + this.fM) {
                    this.G.M.add((C0020av) this.gi.clone());
                } else {
                    this.gj = (C0020av) this.gi.clone();
                    this.U.write("C1|" + this.gi.a().a() + "|0\n");
                    this.U.flush();
                }
                this.gi = null;
                return;
        }
    }

    public void e(MouseEvent mouseEvent) {
        switch (this.ab) {
            case 1:
                j(mouseEvent);
                return;
            case 2:
                u(mouseEvent);
                return;
            case 3:
                o(mouseEvent);
                return;
            case 4:
                ad(mouseEvent);
                return;
            case 5:
                z(mouseEvent);
                return;
            case 6:
                P(mouseEvent);
                return;
            case 7:
                aj(mouseEvent);
                return;
            default:
                if (this.G == null) {
                    return;
                }
                this.gM = false;
                if (this.gi != null) {
                    this.gk = mouseEvent.getX() - 22;
                    this.gl = mouseEvent.getY() - 22;
                    return;
                } else if (mouseEvent.getY() > 535) {
                    return;
                } else {
                    if (this.aA != -1) {
                        if (this.aA == 3 || this.aA == 4) {
                            if (mouseEvent.getY() >= this.ar[3] && mouseEvent.getX() >= 666) {
                                return;
                            }
                        } else if (mouseEvent.getY() >= this.ar[this.aA] && mouseEvent.getX() >= this.aq[this.aA]) {
                            return;
                        }
                    }
                    if (!this.cC || mouseEvent.getY() < this.cE || mouseEvent.getX() < this.cD || mouseEvent.getX() > this.cD + this.cF) {
                        this.G.d(mouseEvent.getX(), mouseEvent.getY());
                        return;
                    }
                    return;
                }
        }
    }

    public void a(KeyEvent keyEvent) {
        if (this.G == null) {
            return;
        }
        if (!this.gM) {
            this.G.F();
            this.gM = true;
        }
        char keyChar = keyEvent.getKeyChar();
        if (keyChar == this.pW.c("en", 28)) {
            if (pS.o.isFocusOwner()) {
                return;
            }
            this.G.G();
        } else if (keyChar == this.pW.c("en", 29)) {
            if (pS.o.isFocusOwner()) {
                return;
            }
            this.G.K();
        } else if (keyChar == this.pW.c("en", 30)) {
            if (pS.o.isFocusOwner()) {
                return;
            }
            this.G.J();
        } else if (keyChar == this.pW.c("en", 31)) {
            if (pS.o.isFocusOwner()) {
                return;
            }
            this.G.M();
        } else if (keyChar == this.pW.c("en", 32)) {
            if (pS.o.isFocusOwner()) {
                return;
            }
            this.G.H();
        } else if (keyChar == this.pW.c("en", 33)) {
            if (pS.o.isFocusOwner()) {
                return;
            }
            this.G.N();
        } else if (keyChar == this.pW.c("en", 34)) {
            if (pS.o.isFocusOwner()) {
                return;
            }
            this.G.I();
        } else if (keyChar != this.pW.c("en", 35)) {
            pS.o.setText(pS.o.getText() + keyChar);
            pS.o.requestFocusInWindow();
        } else if (pS.o.isFocusOwner()) {
        } else {
            this.G.L();
        }
    }

    public void b(KeyEvent keyEvent) {
        if (this.G == null) {
            return;
        }
        C0032k.a(keyEvent.getKeyCode());
        if (this.O.e()) {
            if (keyEvent.getKeyCode() == 112 || keyEvent.getKeyCode() == 113 || keyEvent.getKeyCode() == 114 || keyEvent.getKeyCode() == 115 || keyEvent.getKeyCode() == 116 || keyEvent.getKeyCode() == 117 || keyEvent.getKeyCode() == 118 || keyEvent.getKeyCode() == 119) {
                switch (keyEvent.getKeyCode()) {
                    case 112:
                        this.O.a(0);
                        break;
                    case 113:
                        this.O.a(1);
                        break;
                    case 114:
                        this.O.a(2);
                        break;
                    case 115:
                        this.O.a(3);
                        break;
                    case 116:
                        this.O.a(4);
                        break;
                    case 117:
                        this.O.a(5);
                        break;
                    case 118:
                        this.O.a(6);
                        break;
                    case 119:
                        this.O.a(7);
                        break;
                }
                pS.repaint();
                if (this.O.n() == null) {
                    C0021aw.b.a(C0028g.b);
                    return;
                }
                C0021aw.b.a(C0028g.a);
                if (this.qk != 5) {
                    b(this.qk, this.O.n());
                } else if (this.G.q() <= this.G.p()) {
                    b(this.qk, this.O.n());
                } else {
                    this.eP.a("You cannot go to mission before you lighten your inventory!", 16711680, 16711680);
                    this.eP.a((byte) 3);
                }
            }
        }
    }

    public void c(KeyEvent keyEvent) {
        if (this.G == null) {
            return;
        }
        this.G.F();
    }

    public void f(Object obj) {
        String[] a;
        C0032k.a("in spaceport");
        if (obj != null) {
            switch (W) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    this.gP = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 219)));
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    this.gP = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 820)));
                    break;
                case C0000a.aW /* 11 */:
                case C0000a.aX /* 12 */:
                case C0000a.aY /* 13 */:
                case C0000a.aZ /* 14 */:
                case 15:
                    this.gP = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 821)));
                    break;
                case C0000a.bb /* 16 */:
                case C0000a.bc /* 17 */:
                case C0000a.bd /* 18 */:
                case C0000a.be /* 19 */:
                    this.gP = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1177)));
                    break;
            }
            this.hn = new Icon[3];
            this.hn[0] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1224)));
            this.hn[1] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1230)));
            this.hn[2] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1230)));
            this.ho = 0;
            this.hp = 0;
            this.hq = -1;
            this.gQ = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 229)));
            this.gR = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 228)));
            this.gS = this.pW.e("en", 233);
            this.gT = this.pW.e("en", 234);
            this.gU = new Icon[this.pW.a("en", 230, 0, 0).length];
            for (int i = 0; i < this.gU.length; i++) {
                this.gU[i] = new ImageIcon(getClass().getResource(this.g + a[i]));
            }
            this.gV = this.pW.e("en", 231);
            this.gW = this.pW.e("en", 232);
            this.gY = this.pW.b("en", 261);
            this.gZ = this.pW.b("en", 262);
            this.ha = this.pW.e("en", 263);
            this.hb = this.pW.e("en", 264);
            this.hc = this.pW.b("en", 265);
            this.hd = this.pW.b("en", 266);
            this.hg = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 268)));
            this.hh = this.pW.b("en", 269);
            this.hi = this.pW.b("en", 270);
            this.hj = this.pW.b("en", 271);
            this.hk = this.pW.b("en", 272);
            this.hl = this.pW.b("en", 273);
            this.hm = this.pW.b("en", 274);
            C0032k.a("out = " + obj.toString());
            this.U.write(obj.toString());
            this.U.flush();
            this.hs = new Vector();
            this.ht = new Vector();
        }
        this.he = -1;
        this.hr = false;
    }

    public void f(Graphics graphics) {
        this.gP.paintIcon(pS, graphics, 0, 0);
        a(graphics, W);
        b(graphics, W);
        graphics.setFont(new Font("Arial", 0, 14));
        graphics.setColor(new Color(16777215));
        graphics.drawString("Bal: " + X + " sidos", 414, 119);
        if (this.he > 0) {
            a(graphics, W, this.he);
            a(graphics, this.he);
        }
        Enumeration elements = this.hs.elements();
        while (elements.hasMoreElements()) {
            b(graphics, Integer.parseInt(elements.nextElement().toString()));
        }
        if (this.hr) {
            graphics.setColor(new Color(0));
            graphics.drawString("Please wait.", 536, 429);
        } else if (this.he != -2) {
            MastersOfDestiny mastersOfDestiny = pS;
            graphics.setFont(MastersOfDestiny.H);
            graphics.setColor(new Color(6710886));
            graphics.drawString("Welcome adventurer.", 476, 396);
            graphics.drawString("Please select your destination.", 476, 417);
            if (this.he != -1) {
                graphics.setColor(new Color(0));
                graphics.drawString("Destination: " + this.pY[this.he - 1], 476, 443);
                graphics.drawString("Fare: " + this.ht.elementAt(this.hs.indexOf(sm + this.he)) + " sidos", 476, 463);
            }
        } else {
            a(graphics, W, this.hf);
            a(graphics, this.hf);
            MastersOfDestiny mastersOfDestiny2 = pS;
            graphics.setFont(MastersOfDestiny.H);
            graphics.setColor(new Color(6710886));
            graphics.drawString("Please confirm your destination.", 476, 396);
            graphics.setColor(new Color(0));
            graphics.drawString("Destination: " + this.pY[this.hf - 1], 476, 423);
            graphics.drawString("Fare: " + this.ht.elementAt(this.hs.indexOf(sm + this.hf)) + " sidos", 476, 440);
            this.hg.paintIcon(pS, graphics, this.hh, this.hi);
        }
        if (this.hq != -1) {
            this.hn[this.hq].paintIcon(pS, graphics, this.ho, this.hp);
        }
    }

    public void a(Graphics graphics, int i) {
        switch (i) {
            case 1:
                this.gQ.paintIcon(pS, graphics, this.gS[i - 1], this.gT[i - 1]);
                return;
            case 6:
                this.gQ.paintIcon(pS, graphics, this.gS[i - 1], this.gT[i - 1]);
                return;
            case C0000a.aW /* 11 */:
                this.gQ.paintIcon(pS, graphics, this.gS[i - 1], this.gT[i - 1]);
                return;
            case C0000a.bb /* 16 */:
                this.gQ.paintIcon(pS, graphics, this.gS[i - 1], this.gT[i - 1]);
                return;
            default:
                this.gR.paintIcon(pS, graphics, this.gS[i - 1], this.gT[i - 1]);
                return;
        }
    }

    public void b(Graphics graphics, int i) {
        this.gU[i - 1].paintIcon(pS, graphics, this.gV[i - 1], this.gW[i - 1]);
    }

    public void a(Graphics graphics, int i, int i2) {
        if ((i == 9 && i2 == 7) || (i == 7 && i2 == 9)) {
            this.gX = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 235)));
            this.gX.paintIcon(pS, graphics, this.gY, this.gZ);
        } else if ((i == 16 && i2 == 17) || (i == 17 && i2 == 16)) {
            this.gX = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 236)));
            this.gX.paintIcon(pS, graphics, this.gY, this.gZ);
        } else if ((i == 16 && i2 == 18) || (i == 18 && i2 == 16)) {
            this.gX = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 237)));
            this.gX.paintIcon(pS, graphics, this.gY, this.gZ);
        } else if ((i == 5 && i2 == 4) || (i == 4 && i2 == 5)) {
            this.gX = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 238)));
            this.gX.paintIcon(pS, graphics, this.gY, this.gZ);
        } else if ((i == 17 && i2 == 3) || (i == 3 && i2 == 17)) {
            this.gX = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 239)));
            this.gX.paintIcon(pS, graphics, this.gY, this.gZ);
        } else if ((i == 17 && i2 == 19) || (i == 19 && i2 == 17)) {
            this.gX = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 240)));
            this.gX.paintIcon(pS, graphics, this.gY, this.gZ);
        } else if ((i == 15 && i2 == 13) || (i == 13 && i2 == 15)) {
            this.gX = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 241)));
            this.gX.paintIcon(pS, graphics, this.gY, this.gZ);
        } else if ((i == 12 && i2 == 13) || (i == 13 && i2 == 12)) {
            this.gX = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 242)));
            this.gX.paintIcon(pS, graphics, this.gY, this.gZ);
        } else if ((i == 2 && i2 == 5) || (i == 5 && i2 == 2)) {
            this.gX = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 243)));
            this.gX.paintIcon(pS, graphics, this.gY, this.gZ);
        } else if ((i == 6 && i2 == 9) || (i == 9 && i2 == 6)) {
            this.gX = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 244)));
            this.gX.paintIcon(pS, graphics, this.gY, this.gZ);
        } else if ((i == 6 && i2 == 8) || (i == 8 && i2 == 6)) {
            this.gX = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 245)));
            this.gX.paintIcon(pS, graphics, this.gY, this.gZ);
        } else if ((i == 6 && i2 == 16) || (i == 16 && i2 == 6)) {
            this.gX = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 246)));
            this.gX.paintIcon(pS, graphics, this.gY, this.gZ);
        } else if ((i == 6 && i2 == 1) || (i == 1 && i2 == 6)) {
            this.gX = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 247)));
            this.gX.paintIcon(pS, graphics, this.gY, this.gZ);
        } else if ((i == 10 && i2 == 9) || (i == 9 && i2 == 10)) {
            this.gX = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 248)));
            this.gX.paintIcon(pS, graphics, this.gY, this.gZ);
        } else if ((i == 10 && i2 == 8) || (i == 8 && i2 == 10)) {
            this.gX = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 249)));
            this.gX.paintIcon(pS, graphics, this.gY, this.gZ);
        } else if ((i == 4 && i2 == 3) || (i == 3 && i2 == 4)) {
            this.gX = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 250)));
            this.gX.paintIcon(pS, graphics, this.gY, this.gZ);
        } else if ((i == 11 && i2 == 8) || (i == 8 && i2 == 11)) {
            this.gX = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 251)));
            this.gX.paintIcon(pS, graphics, this.gY, this.gZ);
        } else if ((i == 11 && i2 == 15) || (i == 15 && i2 == 11)) {
            this.gX = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 252)));
            this.gX.paintIcon(pS, graphics, this.gY, this.gZ);
        } else if ((i == 11 && i2 == 1) || (i == 1 && i2 == 11)) {
            this.gX = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 253)));
            this.gX.paintIcon(pS, graphics, this.gY, this.gZ);
        } else if ((i == 11 && i2 == 12) || (i == 12 && i2 == 11)) {
            this.gX = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 254)));
            this.gX.paintIcon(pS, graphics, this.gY, this.gZ);
        } else if ((i == 1 && i2 == 5) || (i == 5 && i2 == 1)) {
            this.gX = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", C0002ab.m)));
            this.gX.paintIcon(pS, graphics, this.gY, this.gZ);
        } else if ((i == 1 && i2 == 2) || (i == 2 && i2 == 1)) {
            this.gX = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 256)));
            this.gX.paintIcon(pS, graphics, this.gY, this.gZ);
        } else if ((i == 1 && i2 == 4) || (i == 4 && i2 == 1)) {
            this.gX = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 257)));
            this.gX.paintIcon(pS, graphics, this.gY, this.gZ);
        } else if ((i == 1 && i2 == 3) || (i == 3 && i2 == 1)) {
            this.gX = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 258)));
            this.gX.paintIcon(pS, graphics, this.gY, this.gZ);
        } else if ((i == 19 && i2 == 18) || (i == 18 && i2 == 19)) {
            this.gX = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 259)));
            this.gX.paintIcon(pS, graphics, this.gY, this.gZ);
        } else if ((i == 14 && i2 == 13) || (i == 13 && i2 == 14)) {
            this.gX = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 260)));
            this.gX.paintIcon(pS, graphics, this.gY, this.gZ);
        }
    }

    public void f(MouseEvent mouseEvent) {
        if (this.hr) {
            return;
        }
        this.hq = -1;
        if (mouseEvent.getX() > this.pW.b("en", 275) && mouseEvent.getX() < this.pW.b("en", 275) + this.pW.b("en", 277) && mouseEvent.getY() > this.pW.b("en", 276) && mouseEvent.getY() < this.pW.b("en", 276) + this.pW.b("en", 278)) {
            this.hq = 0;
            this.ho = this.pW.b("en", 275);
            this.hp = this.pW.b("en", 276);
            return;
        }
        if (this.he == -2) {
            if (mouseEvent.getX() > this.hh && mouseEvent.getX() < this.hh + this.hl && mouseEvent.getY() > this.hi && mouseEvent.getY() < this.hi + this.hm) {
                this.hq = 1;
                this.ho = this.hh;
                this.hp = this.hi;
                return;
            } else if (mouseEvent.getX() > this.hj && mouseEvent.getX() < this.hj + this.hl && mouseEvent.getY() > this.hk && mouseEvent.getY() < this.hk + this.hm) {
                this.hq = 2;
                this.ho = this.hj;
                this.hp = this.hk;
                return;
            }
        }
        if (this.he != -2) {
            boolean z = false;
            for (int i = 0; i < this.ha.length; i++) {
                if (mouseEvent.getX() > this.ha[i] && mouseEvent.getX() < this.ha[i] + this.hc && mouseEvent.getY() > this.hb[i] && mouseEvent.getY() < this.hb[i] + this.hd && this.hs.contains(sm + (i + 1))) {
                    int i2 = this.he;
                    this.he = i + 1;
                    z = true;
                    if (i2 != this.he) {
                        C0021aw.b.a(C0028g.c);
                    }
                }
            }
            if (z) {
                return;
            }
            this.he = -1;
        }
    }

    public void g(MouseEvent mouseEvent) {
        if (this.hr) {
            return;
        }
        if (this.he > 0) {
            this.hf = this.he;
            this.he = -2;
            C0021aw.b.a(C0028g.a);
            return;
        }
        if (this.he == -2) {
            if (mouseEvent.getX() > this.hh && mouseEvent.getX() < this.hh + this.hl && mouseEvent.getY() > this.hi && mouseEvent.getY() < this.hi + this.hm) {
                C0021aw.b.a(C0028g.a);
                this.U.write("P4|" + this.hf + "\n");
                this.U.flush();
                this.hq = -1;
                this.hr = true;
                return;
            } else if (mouseEvent.getX() > this.hj && mouseEvent.getX() < this.hj + this.hl && mouseEvent.getY() > this.hk && mouseEvent.getY() < this.hk + this.hm) {
                this.he = -1;
                this.hq = -1;
                C0021aw.b.a(C0028g.a);
                return;
            }
        }
        if (mouseEvent.getX() <= this.pW.b("en", 275) || mouseEvent.getX() >= this.pW.b("en", 275) + this.pW.b("en", 277) || mouseEvent.getY() <= this.pW.b("en", 276) || mouseEvent.getY() >= this.pW.b("en", 276) + this.pW.b("en", 278)) {
            return;
        }
        C0021aw.b.a(C0028g.a);
        this.O.h();
        this.hq = -1;
        C0032k.a("spaceport test 1");
        b((byte) 0, (Object) null);
        this.qm = (byte) 5;
    }

    public void h(MouseEvent mouseEvent) {
    }

    public void i(MouseEvent mouseEvent) {
    }

    public void j(MouseEvent mouseEvent) {
    }

    public void d(KeyEvent keyEvent) {
    }

    public void g(Object obj) {
        switch (W) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.hu = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 290)));
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                this.hu = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1163)));
                break;
            case C0000a.aW /* 11 */:
            case C0000a.aX /* 12 */:
            case C0000a.aY /* 13 */:
            case C0000a.aZ /* 14 */:
            case 15:
                this.hu = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1069)));
                break;
            case C0000a.bb /* 16 */:
            case C0000a.bc /* 17 */:
            case C0000a.bd /* 18 */:
            case C0000a.be /* 19 */:
                this.hu = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1170)));
                break;
        }
        this.jg = new Icon[3];
        this.jg[0] = new ImageIcon(getClass().getResource(this.ur.f("en", 1224)));
        this.jg[1] = new ImageIcon(getClass().getResource(this.ur.f("en", 1222)));
        this.jg[2] = new ImageIcon(getClass().getResource(this.ur.f("en", 1223)));
        this.jh = 0;
        this.ji = 0;
        this.jj = -1;
        this.hv = new Icon[2];
        this.hv[0] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 404)));
        this.hv[1] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 405)));
        this.hw = 0;
        this.hx = this.pW.e("en", 406);
        this.hy = this.pW.b("en", 407);
        this.hz = this.pW.e("en", 408);
        this.hA = this.pW.b("en", 409);
        this.hB = new Icon[3];
        this.hB[0] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 375)));
        this.hB[1] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 376)));
        this.hB[2] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 377)));
        this.hC = 0;
        this.hD = this.pW.e("en", 410);
        this.hE = this.pW.b("en", 411);
        this.hF = this.pW.e("en", 412);
        this.hG = this.pW.b("en", 413);
        this.hH = new Icon[4];
        this.hH[0] = this.hB[0];
        this.hH[1] = this.hB[1];
        this.hH[2] = this.hB[2];
        this.hH[3] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 378)));
        this.hI = this.pW.e("en", 426);
        this.hJ = this.pW.b("en", 427);
        this.hK = this.pW.e("en", 428);
        this.hL = this.pW.b("en", 429);
        this.hM = new Icon[4];
        this.hM[0] = this.hB[0];
        this.hM[1] = this.hB[1];
        this.hM[2] = this.hB[2];
        this.hM[3] = this.hH[3];
        this.hN = 0;
        this.hO = this.pW.e("en", 414);
        this.hP = this.pW.b("en", 415);
        this.hQ = this.pW.e("en", 416);
        this.hR = this.pW.b("en", 417);
        this.hS = this.pW.e("en", 352);
        this.hT = this.pW.b("en", 355);
        this.hU = this.pW.b("en", 356);
        this.hV = new Vector[4];
        this.hV[0] = new Vector();
        this.hV[1] = new Vector();
        this.hV[2] = new Vector();
        this.hV[3] = new Vector();
        this.hW = new Vector[4];
        this.hW[0] = new Vector();
        this.hW[1] = new Vector();
        this.hW[2] = new Vector();
        this.hW[3] = new Vector();
        this.hX = this.pW.e("en", 353);
        this.hY = this.pW.e("en", 354);
        this.hZ = 0;
        this.ia = 0;
        this.ib = this.pW.b("en", 418);
        this.ic = this.pW.e("en", 419);
        this.id = this.pW.b("en", 420);
        this.ie = this.pW.b("en", 421);
        this.ij = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 293)));
        this.ik = this.hS[0] - 2;
        this.il = this.hX[0] - 2;
        this.im = C0011ak.m();
        this.im.a((byte) 2);
        this.im.g();
        this.in = 150;
        this.io = 17;
        this.iu = C0011ak.m();
        this.iu.a((byte) 3);
        this.iu.g();
        this.iv = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 393)));
        this.iw = 0;
        this.ix = 0;
        this.iy = this.pW.b("en", 394);
        this.iz = this.pW.b("en", 395);
        this.iE = true;
        this.iF = true;
        this.iG = this.pW.b("en", 387);
        this.iH = this.pW.b("en", 388);
        b();
        a();
        this.jp.setVisible(false);
        try {
            this.js.remove(0, this.js.getLength());
            this.js.insertString(this.js.getLength(), " Shop Transaction History", pS.i);
        } catch (BadLocationException e) {
            C0032k.a(e.getMessage());
        }
        this.iI = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 434)));
        this.iL = this.pW.b("en", 400);
        this.iM = this.pW.e("en", 401);
        this.iN = this.pW.b("en", 402);
        this.iO = this.pW.b("en", 403);
        this.iP = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 433)));
        this.iU = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 435)));
        this.iX = false;
        this.iY = this.pW.b("en", 389);
        this.iZ = this.pW.b("en", 390);
        this.ja = this.pW.b("en", 391);
        this.jb = this.pW.b("en", 392);
        this.jc = 0;
        this.jd = 0;
        this.je = 0L;
        this.U.write("S19|" + obj.toString() + "\n");
        C0032k.a("S19|" + obj.toString() + "\n");
        this.U.flush();
        this.U.write("S20|" + obj.toString() + "\n");
        this.U.flush();
        this.U.write("L1\n");
        this.U.flush();
    }

    public void a(C0020av c0020av) {
        this.hV[c0020av.a().h()].add(c0020av);
    }

    public void b(C0020av c0020av) {
        this.hW[c0020av.a().h()].add(c0020av);
    }

    public void g(Graphics graphics) {
        this.hu.paintIcon(pS, graphics, 0, 0);
        this.hv[this.hw].paintIcon(pS, graphics, this.hx[this.hw], this.hy);
        switch (this.hw) {
            case 0:
                this.hB[this.hC].paintIcon(pS, graphics, this.hD[this.hC], this.hE);
                graphics.setColor(new Color(0));
                graphics.fillRect(274, 101, 55, 19);
                int length = this.hZ * this.hS.length;
                for (int i = 0; i < this.hX.length; i++) {
                    for (int i2 = 0; i2 < this.hS.length; i2++) {
                        if (length < this.hV[this.hC].size()) {
                            ((C0020av) this.hV[this.hC].elementAt(length)).a().b().paintIcon(pS, graphics, this.hS[i2], this.hX[i]);
                            long b = ((C0020av) this.hV[this.hC].elementAt(length)).b();
                            if (b > 0) {
                                graphics.setColor(new Color(16777215));
                                MastersOfDestiny mastersOfDestiny = pS;
                                graphics.setFont(MastersOfDestiny.z);
                                graphics.drawString(b + sm, this.hS[i2] + 2, this.hX[i] + 9);
                            }
                            length++;
                        }
                    }
                }
                break;
            case 1:
                this.hH[this.hC].paintIcon(pS, graphics, this.hI[this.hC], this.hJ);
                int length2 = this.hZ * this.hS.length;
                for (int i3 = 0; i3 < this.hX.length; i3++) {
                    for (int i4 = 0; i4 < this.hS.length; i4++) {
                        if (length2 < this.hW[this.hC].size()) {
                            ((C0020av) this.hW[this.hC].elementAt(length2)).a().b().paintIcon(pS, graphics, this.hS[i4], this.hX[i3]);
                            graphics.setColor(new Color(16777215));
                            MastersOfDestiny mastersOfDestiny2 = pS;
                            graphics.setFont(MastersOfDestiny.z);
                            graphics.drawString(sm + ((C0020av) this.hW[this.hC].elementAt(length2)).b(), this.hS[i4] + 2, this.hX[i3] + 9);
                            length2++;
                        }
                    }
                }
                break;
        }
        this.hM[this.hN].paintIcon(pS, graphics, this.hO[this.hN], this.hP);
        int length3 = this.ia * this.hS.length;
        for (int i5 = 0; i5 < this.hY.length; i5++) {
            for (int i6 = 0; i6 < this.hS.length; i6++) {
                if (length3 < this.G.H[this.hN].size()) {
                    ((C0020av) this.G.H[this.hN].elementAt(length3)).a().b().paintIcon(pS, graphics, this.hS[i6], this.hY[i5]);
                    graphics.setColor(new Color(16777215));
                    MastersOfDestiny mastersOfDestiny3 = pS;
                    graphics.setFont(MastersOfDestiny.z);
                    graphics.drawString(sm + ((C0020av) this.G.H[this.hN].elementAt(length3)).b(), this.hS[i6] + 2, this.hY[i5] + 9);
                    length3++;
                }
            }
        }
        long q = this.G.q();
        graphics.setColor(new Color(0));
        MastersOfDestiny mastersOfDestiny4 = pS;
        graphics.setFont(MastersOfDestiny.D);
        graphics.drawString(sm + q + "/" + this.G.p(), 139, 520);
        graphics.setColor(new Color(0));
        MastersOfDestiny mastersOfDestiny5 = pS;
        graphics.setFont(MastersOfDestiny.D);
        graphics.drawString(sm + X, 284, 520);
        graphics.setColor(new Color(0));
        MastersOfDestiny mastersOfDestiny6 = pS;
        graphics.setFont(MastersOfDestiny.F);
        int b2 = this.pW.b("en", 430);
        int b3 = this.pW.b("en", 432);
        MastersOfDestiny mastersOfDestiny7 = pS;
        int stringWidth = b2 + ((b3 - MastersOfDestiny.G.stringWidth(this.O.o().toString())) / 2);
        int b4 = this.pW.b("en", 431);
        MastersOfDestiny mastersOfDestiny8 = pS;
        graphics.drawString(sm + this.O.o(), stringWidth, b4 + MastersOfDestiny.G.getHeight());
        this.ij.paintIcon(pS, graphics, this.ik, this.il);
        if (this.im.j != null) {
            MastersOfDestiny mastersOfDestiny9 = pS;
            graphics.setFont(MastersOfDestiny.B);
            this.im.a(graphics, pS);
        }
        if (this.iu.j != null) {
            this.ij.paintIcon(pS, graphics, this.is, this.it);
            MastersOfDestiny mastersOfDestiny10 = pS;
            graphics.setFont(MastersOfDestiny.B);
            this.iu.a(graphics, pS);
            graphics.setColor(new Color(16777215));
            MastersOfDestiny mastersOfDestiny11 = pS;
            graphics.setFont(MastersOfDestiny.B);
            graphics.drawString("Quantity:", this.iJ, this.iK - 4);
            this.iI.paintIcon(pS, graphics, this.iJ, this.iK);
            graphics.setColor(new Color(16777215));
            MastersOfDestiny mastersOfDestiny12 = pS;
            graphics.setFont(MastersOfDestiny.B);
            if (this.hw == 1) {
                graphics.drawString("Deposit Cost:", this.iQ, this.iR - 4);
            } else {
                graphics.drawString("Cost:", this.iQ, this.iR - 4);
            }
            this.iP.paintIcon(pS, graphics, this.iQ, this.iR);
            graphics.setColor(new Color(0));
            MastersOfDestiny mastersOfDestiny13 = pS;
            graphics.setFont(MastersOfDestiny.D);
            graphics.drawString(sm + this.jm, this.iS, this.iT);
            this.iU.paintIcon(pS, graphics, this.iV, this.iW);
        }
        if (this.jj != -1) {
            this.jg[this.jj].paintIcon(pS, graphics, this.jh, this.ji);
        }
        if (this.iA != null) {
            this.iA.paintIcon(pS, graphics, this.iB, this.iC);
        }
    }

    public void k(MouseEvent mouseEvent) {
        this.jj = -1;
        if (mouseEvent.getX() > this.pW.b("en", 383) && mouseEvent.getX() < this.pW.b("en", 383) + this.pW.b("en", 385) && mouseEvent.getY() > this.pW.b("en", 384) && mouseEvent.getY() < this.pW.b("en", 384) + this.pW.b("en", 386)) {
            this.jj = 0;
            this.jh = this.pW.b("en", 383);
            this.ji = this.pW.b("en", 384);
            return;
        }
        if (this.iu.j != null) {
            if (!this.jk.getText().trim().equals(sm) && mouseEvent.getX() > this.iV && mouseEvent.getX() < this.iV + this.pW.b("en", 424) && mouseEvent.getY() > this.iW && mouseEvent.getY() < this.iW + this.pW.b("en", 425)) {
                this.jj = 1;
                this.jh = this.iV;
                this.ji = this.iW;
                return;
            } else if (mouseEvent.getX() > this.iV + this.pW.b("en", 424) + 3 && mouseEvent.getX() < this.iV + this.pW.b("en", 424) + 3 + this.pW.b("en", 391) && mouseEvent.getY() > this.iW && mouseEvent.getY() < this.iW + this.pW.b("en", 392)) {
                this.jj = 2;
                this.jh = this.iV + this.pW.b("en", 424) + 3;
                this.ji = this.iW;
                return;
            }
        }
        if (this.iu.j == null || !this.iE) {
            switch (this.hw) {
                case 0:
                    int length = this.hZ * this.hS.length;
                    for (int i = 0; i < this.hX.length; i++) {
                        for (int i2 = 0; i2 < this.hS.length; i2++) {
                            if (mouseEvent.getX() >= this.hS[i2] && mouseEvent.getX() <= this.hS[i2] + this.hT && mouseEvent.getY() >= this.hX[i] && mouseEvent.getY() <= this.hX[i] + this.hU) {
                                this.ik = this.hS[i2] - 2;
                                this.il = this.hX[i] - 2;
                                if (length < this.hV[this.hC].size()) {
                                    if (i2 < this.hS.length / 2) {
                                        a(((C0020av) this.hV[this.hC].elementAt(length)).b("Out of Stock"), (byte) 1, this.im.z);
                                        return;
                                    } else {
                                        a(((C0020av) this.hV[this.hC].elementAt(length)).b("Out of Stock"), (byte) 0, this.im.z);
                                        return;
                                    }
                                }
                                return;
                            }
                            length++;
                        }
                    }
                    break;
                case 1:
                    int length2 = this.hZ * this.hS.length;
                    for (int i3 = 0; i3 < this.hX.length; i3++) {
                        for (int i4 = 0; i4 < this.hS.length; i4++) {
                            if (mouseEvent.getX() >= this.hS[i4] && mouseEvent.getX() <= this.hS[i4] + this.hT && mouseEvent.getY() >= this.hX[i3] && mouseEvent.getY() <= this.hX[i3] + this.hU) {
                                this.ik = this.hS[i4] - 2;
                                this.il = this.hX[i3] - 2;
                                if (length2 < this.hW[this.hC].size()) {
                                    if (i4 < this.hS.length / 2) {
                                        a(((C0020av) this.hW[this.hC].elementAt(length2)).b("In Locker"), (byte) 1, this.im.z);
                                        return;
                                    } else {
                                        a(((C0020av) this.hW[this.hC].elementAt(length2)).b("In Locker"), (byte) 0, this.im.z);
                                        return;
                                    }
                                }
                                return;
                            }
                            length2++;
                        }
                    }
                    break;
            }
        }
        if (this.iu.j == null || this.iE) {
            int length3 = this.ia * this.hS.length;
            for (int i5 = 0; i5 < this.hY.length; i5++) {
                for (int i6 = 0; i6 < this.hS.length; i6++) {
                    if (mouseEvent.getX() >= this.hS[i6] && mouseEvent.getX() <= this.hS[i6] + this.hT && mouseEvent.getY() >= this.hY[i5] && mouseEvent.getY() <= this.hY[i5] + this.hU) {
                        this.ik = this.hS[i6] - 2;
                        this.il = this.hY[i5] - 2;
                        if (length3 < this.G.H[this.hN].size()) {
                            if (i6 < this.hS.length / 2) {
                                a(((C0020av) this.G.H[this.hN].elementAt(length3)).b("0"), (byte) 1, this.im.z);
                                return;
                            } else {
                                a(((C0020av) this.G.H[this.hN].elementAt(length3)).b("0"), (byte) 0, this.im.z);
                                return;
                            }
                        }
                        return;
                    }
                    length3++;
                }
            }
        }
        a((String) null, (byte) 1, this.im.z);
    }

    public void l(MouseEvent mouseEvent) {
        if (this.iu.j != null) {
            for (int i = 0; i < this.iM.length; i++) {
                if (mouseEvent.getX() >= this.iL && mouseEvent.getX() <= this.iL + this.iN && mouseEvent.getY() >= this.iM[i] && mouseEvent.getY() <= this.iM[i] + this.iO) {
                    if (this.jk.getText().equals(sm)) {
                        this.jk.setText("1");
                    } else if (i == 0) {
                        this.jk.setText(sm + (Integer.parseInt(this.jk.getText()) + 1));
                    } else if (Integer.parseInt(this.jk.getText()) > 1) {
                        this.jk.setText(sm + (Integer.parseInt(this.jk.getText()) - 1));
                    }
                    this.iX = true;
                    return;
                }
            }
            if (!this.jk.getText().trim().equals(sm) && mouseEvent.getX() > this.iV && mouseEvent.getX() < this.iV + this.pW.b("en", 424) && mouseEvent.getY() > this.iW && mouseEvent.getY() < this.iW + this.pW.b("en", 425)) {
                C0032k.a("buy!");
                this.iu.j = null;
                this.jk.setVisible(false);
                this.jj = -1;
                if (!this.jp.isVisible()) {
                    this.jp.setVisible(true);
                }
                if (this.hw == 0) {
                    if (this.iE) {
                        C0032k.a("S5|" + this.O.n().toString() + "|" + this.jn + "|" + this.jk.getText() + "\n");
                        this.U.write("S5|" + this.O.n().toString() + "|" + this.jn + "|" + this.jk.getText() + "\n");
                        this.U.flush();
                        return;
                    }
                    C0032k.a("S13|" + this.O.n().toString() + "|" + this.jn + "|" + this.jk.getText() + "\n");
                    this.U.write("S13|" + this.O.n().toString() + "|" + this.jn + "|" + this.jk.getText() + "\n");
                    this.U.flush();
                    return;
                } else if (this.hw == 1) {
                    if (this.iF) {
                        C0032k.a("L8|" + this.jn + "|" + this.jk.getText() + "\n");
                        this.U.write("L8|" + this.jn + "|" + this.jk.getText() + "\n");
                        this.U.flush();
                        return;
                    }
                    C0032k.a("L3|" + this.jn + "|" + this.jk.getText() + "\n");
                    this.U.write("L3|" + this.jn + "|" + this.jk.getText() + "\n");
                    this.U.flush();
                    return;
                } else {
                    return;
                }
            } else if (mouseEvent.getX() > this.iV + this.pW.b("en", 424) + 3 && mouseEvent.getX() < this.iV + this.pW.b("en", 424) + 3 + this.pW.b("en", 391) && mouseEvent.getY() > this.iW && mouseEvent.getY() < this.iW + this.pW.b("en", 392)) {
                this.iu.j = null;
                this.jk.setVisible(false);
                this.jj = -1;
                return;
            }
        }
        if (this.iu.j == null) {
            for (int i2 = 0; i2 < this.hv.length; i2++) {
                if (mouseEvent.getX() >= this.hx[i2] && mouseEvent.getX() <= this.hx[i2] + this.hz[i2] && mouseEvent.getY() >= this.hy && mouseEvent.getY() <= this.hy + this.hA) {
                    this.hw = i2;
                    this.hC = 0;
                    this.hZ = 0;
                    this.ik = this.hS[0] - 2;
                    this.il = this.hX[0] - 2;
                    return;
                }
            }
            switch (this.hw) {
                case 0:
                    for (int i3 = 0; i3 < this.hB.length; i3++) {
                        if (mouseEvent.getX() >= this.hD[i3] && mouseEvent.getX() <= this.hD[i3] + this.hF[i3] && mouseEvent.getY() >= this.hE && mouseEvent.getY() <= this.hE + this.hG) {
                            this.hC = i3;
                            this.ik = this.hS[0] - 2;
                            this.il = this.hX[0] - 2;
                            this.hZ = 0;
                            C0032k.a("currentShopItemTab = " + this.hC);
                            return;
                        }
                    }
                    break;
                case 1:
                    for (int i4 = 0; i4 < this.hH.length; i4++) {
                        if (mouseEvent.getX() >= this.hI[i4] && mouseEvent.getX() <= this.hI[i4] + this.hK[i4] && mouseEvent.getY() >= this.hJ && mouseEvent.getY() <= this.hJ + this.hL) {
                            this.hC = i4;
                            this.hZ = 0;
                            this.ik = this.hS[0] - 2;
                            this.il = this.hX[0] - 2;
                            return;
                        }
                    }
                    break;
            }
        }
        if (this.iu.j == null) {
            for (int i5 = 0; i5 < this.hM.length; i5++) {
                if (mouseEvent.getX() >= this.hO[i5] && mouseEvent.getX() <= this.hO[i5] + this.hQ[i5] && mouseEvent.getY() >= this.hP && mouseEvent.getY() <= this.hP + this.hR) {
                    this.hN = i5;
                    this.hZ = 0;
                    this.ik = this.hS[0] - 2;
                    this.il = this.hY[0] - 2;
                    return;
                }
            }
        }
        for (int i6 = 0; i6 < this.ic.length; i6++) {
            if (mouseEvent.getX() >= this.ib && mouseEvent.getX() <= this.ib + this.id && mouseEvent.getY() >= this.ic[i6] && mouseEvent.getY() <= this.ic[i6] + this.ie) {
                switch (i6) {
                    case 0:
                        if (!(this.iu.j != null && this.iE && this.iF) && this.hZ > 0) {
                            this.hZ--;
                            return;
                        }
                        return;
                    case 1:
                        if (this.iu.j != null && this.iE && this.iF) {
                            return;
                        }
                        switch (this.hw) {
                            case 0:
                                if (this.hS.length * (this.hZ + this.hX.length) < this.hV[this.hC].size()) {
                                    this.hZ++;
                                    return;
                                }
                                return;
                            case 1:
                                if (this.hS.length * (this.hZ + this.hX.length) < this.hW[this.hC].size()) {
                                    this.hZ++;
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    case 2:
                        if ((this.iu.j == null || this.iE || this.iF) && this.ia > 0) {
                            this.ia--;
                            return;
                        }
                        return;
                    case 3:
                        if ((this.iu.j == null || this.iE || this.iF) && this.hS.length * (this.ia + this.hX.length) < this.G.H[this.hN].size()) {
                            this.ia++;
                            return;
                        }
                        return;
                }
            }
        }
        if (mouseEvent.getX() > this.pW.b("en", 383) && mouseEvent.getX() < this.pW.b("en", 383) + this.pW.b("en", 385) && mouseEvent.getY() > this.pW.b("en", 384) && mouseEvent.getY() < this.pW.b("en", 384) + this.pW.b("en", 386)) {
            this.U.write("S4\n");
            this.U.flush();
            this.jp.setVisible(false);
            this.jk.setVisible(false);
            this.jj = -1;
            C0021aw.b.a(C0028g.a);
            this.O.h();
            b((byte) 0, (Object) null);
        } else if (mouseEvent.getX() == this.jc && mouseEvent.getY() == this.jd && this.je >= System.currentTimeMillis()) {
            m(mouseEvent);
            this.jc = 0;
            this.jd = 0;
            this.je = 0L;
        } else {
            this.jc = mouseEvent.getX();
            this.jd = mouseEvent.getY();
            this.je = System.currentTimeMillis() + 300;
        }
    }

    public void m(MouseEvent mouseEvent) {
        if (this.iu.j != null) {
            return;
        }
        if (this.hw == 0) {
            int length = this.hZ * this.hS.length;
            for (int i = 0; i < this.hX.length; i++) {
                for (int i2 = 0; i2 < this.hS.length; i2++) {
                    if (mouseEvent.getX() >= this.hS[i2] && mouseEvent.getX() <= this.hS[i2] + this.hT && mouseEvent.getY() >= this.hX[i] && mouseEvent.getY() <= this.hX[i] + this.hU) {
                        this.iE = true;
                        this.is = this.hS[i2] - 2;
                        this.it = this.hX[i] - 2;
                        if (length < this.hV[this.hC].size()) {
                            if (i2 < this.hS.length / 2) {
                                a(((C0020av) this.hV[this.hC].elementAt(length)).b("Out of Stock"), (byte) 1, this.iu.z);
                            } else {
                                a(((C0020av) this.hV[this.hC].elementAt(length)).b("Out of Stock"), (byte) 0, this.iu.z);
                            }
                        }
                        this.jk.setText("1");
                        this.jk.getDocument().b(((C0020av) this.hV[this.hC].elementAt(length)).b());
                        this.jn = ((C0020av) this.hV[this.hC].elementAt(length)).a().a();
                        this.jo = ((C0020av) this.hV[this.hC].elementAt(length)).a().c();
                        this.jl = ((C0020av) this.hV[this.hC].elementAt(length)).c();
                        return;
                    }
                    length++;
                }
            }
        } else if (this.hw == 1) {
            int length2 = this.hZ * this.hS.length;
            for (int i3 = 0; i3 < this.hX.length; i3++) {
                for (int i4 = 0; i4 < this.hS.length; i4++) {
                    if (mouseEvent.getX() >= this.hS[i4] && mouseEvent.getX() <= this.hS[i4] + this.hT && mouseEvent.getY() >= this.hX[i3] && mouseEvent.getY() <= this.hX[i3] + this.hU) {
                        this.iF = true;
                        this.is = this.hS[i4] - 2;
                        this.it = this.hX[i3] - 2;
                        if (length2 < this.hW[this.hC].size()) {
                            if (i4 < this.hS.length / 2) {
                                a(((C0020av) this.hW[this.hC].elementAt(length2)).b("Out of Stock"), (byte) 1, this.iu.z);
                            } else {
                                a(((C0020av) this.hW[this.hC].elementAt(length2)).b("Out of Stock"), (byte) 0, this.iu.z);
                            }
                        }
                        this.jk.setText("1");
                        this.jk.getDocument().b(((C0020av) this.hW[this.hC].elementAt(length2)).b());
                        this.jn = ((C0020av) this.hW[this.hC].elementAt(length2)).a().a();
                        this.jo = ((C0020av) this.hW[this.hC].elementAt(length2)).a().c();
                        this.jl = ((C0020av) this.hW[this.hC].elementAt(length2)).c();
                        return;
                    }
                    length2++;
                }
            }
        }
        int length3 = this.ia * this.hS.length;
        for (int i5 = 0; i5 < this.hY.length; i5++) {
            for (int i6 = 0; i6 < this.hS.length; i6++) {
                if (mouseEvent.getX() >= this.hS[i6] && mouseEvent.getX() <= this.hS[i6] + this.hT && mouseEvent.getY() >= this.hY[i5] && mouseEvent.getY() <= this.hY[i5] + this.hU) {
                    if (this.hw == 0) {
                        this.iE = false;
                    } else if (this.hw == 1) {
                        this.iF = false;
                    }
                    this.is = this.hS[i6] - 2;
                    this.it = this.hY[i5] - 2;
                    if (length3 < this.G.H[this.hN].size()) {
                        if (i6 < this.hS.length / 2) {
                            a(((C0020av) this.G.H[this.hN].elementAt(length3)).b("0"), (byte) 1, this.iu.z);
                        } else if (i6 == this.hS.length - 1) {
                            a(((C0020av) this.G.H[this.hN].elementAt(length3)).b("0"), (byte) 2, this.iu.z);
                        } else {
                            a(((C0020av) this.G.H[this.hN].elementAt(length3)).b("0"), (byte) 0, this.iu.z);
                        }
                    }
                    this.jk.getDocument().b(((C0020av) this.G.H[this.hN].elementAt(length3)).b());
                    switch (this.hN) {
                        case 0:
                            this.jk.setText("1");
                            break;
                        case 1:
                            this.jk.setText("1");
                            break;
                        case 2:
                            this.jk.setText(sm + this.jk.getDocument().b());
                            break;
                        case 3:
                            this.jk.setText(sm + this.jk.getDocument().b());
                            break;
                    }
                    this.jn = ((C0020av) this.G.H[this.hN].elementAt(length3)).a().a();
                    this.jo = ((C0020av) this.G.H[this.hN].elementAt(length3)).a().c();
                    this.jl = ((C0020av) this.G.H[this.hN].elementAt(length3)).c();
                    return;
                }
                length3++;
            }
        }
    }

    public void a(String str, byte b, byte b2) {
        int i = this.ik + (this.hT / 2);
        int i2 = this.il + ((this.hU / 3) * 2);
        if (i2 + 150 > 580) {
            i2 -= 150;
        }
        switch (b) {
            case 0:
                i = (i - this.in) - 15;
                break;
            case 2:
                i = (i - this.in) - (this.hT / 2);
                break;
        }
        switch (b2) {
            case 2:
                int i3 = this.in;
                int i4 = this.io;
                MastersOfDestiny mastersOfDestiny = pS;
                this.im.a(str, i, i2, i3, i4, MastersOfDestiny.C, null);
                return;
            case 3:
                if (i + 300 > 420) {
                    i -= 70;
                }
                int i5 = this.in;
                int i6 = this.io;
                MastersOfDestiny mastersOfDestiny2 = pS;
                this.iu.a(str, i, i2, i5, i6, MastersOfDestiny.C, null);
                this.iJ = i + this.in + 6 + 2;
                MastersOfDestiny mastersOfDestiny3 = pS;
                int height = i2 + MastersOfDestiny.C.getHeight();
                MastersOfDestiny mastersOfDestiny4 = pS;
                this.iK = height + (MastersOfDestiny.C.getHeight() / 2);
                this.jk.setBounds(this.iJ + 3, this.iK + 5, this.pW.b("en", 398), this.pW.b("en", 399));
                this.jk.setVisible(true);
                this.jk.requestFocusInWindow();
                this.iL = this.iJ + this.pW.b("en", 398) + 4;
                this.iM[0] = this.iK;
                this.iM[1] = this.iK + this.iN;
                this.iQ = this.iJ;
                int iconHeight = this.iK + this.iI.getIconHeight();
                MastersOfDestiny mastersOfDestiny5 = pS;
                int height2 = iconHeight + MastersOfDestiny.C.getHeight();
                MastersOfDestiny mastersOfDestiny6 = pS;
                this.iR = height2 + (MastersOfDestiny.C.getHeight() / 2);
                this.iS = this.iQ + 1 + 5;
                this.iT = ((this.iR + this.iP.getIconHeight()) - 1) - 3;
                this.iV = this.iQ + 1;
                int iconHeight2 = (i2 + this.iu.o) - this.iU.getIconHeight();
                MastersOfDestiny mastersOfDestiny7 = pS;
                this.iW = iconHeight2 - (MastersOfDestiny.C.getHeight() / 2);
                return;
            default:
                return;
        }
    }

    public void n(MouseEvent mouseEvent) {
        if (this.iu.j != null) {
            return;
        }
        switch (this.hw) {
            case 0:
                int length = this.hZ * this.hS.length;
                for (int i = 0; i < this.hX.length; i++) {
                    for (int i2 = 0; i2 < this.hS.length; i2++) {
                        if (mouseEvent.getX() >= this.hS[i2] && mouseEvent.getX() <= this.hS[i2] + this.hT && mouseEvent.getY() >= this.hX[i] && mouseEvent.getY() <= this.hX[i] + this.hU && length < this.hV[this.hC].size()) {
                            C0020av c0020av = (C0020av) this.hV[this.hC].elementAt(length);
                            if (c0020av.b() != 0) {
                                this.iB = mouseEvent.getX();
                                this.iC = mouseEvent.getY();
                                this.iE = true;
                                this.iA = c0020av.a().b();
                                this.jk.getDocument().b(c0020av.b());
                                this.jn = c0020av.a().a();
                                this.jo = c0020av.a().c();
                                this.jl = c0020av.c();
                            }
                        }
                        length++;
                    }
                }
                break;
            case 1:
                int length2 = this.hZ * this.hS.length;
                for (int i3 = 0; i3 < this.hX.length; i3++) {
                    for (int i4 = 0; i4 < this.hS.length; i4++) {
                        if (mouseEvent.getX() >= this.hS[i4] && mouseEvent.getX() <= this.hS[i4] + this.hT && mouseEvent.getY() >= this.hX[i3] && mouseEvent.getY() <= this.hX[i3] + this.hU && length2 < this.hW[this.hC].size()) {
                            C0020av c0020av2 = (C0020av) this.hW[this.hC].elementAt(length2);
                            if (c0020av2.b() != 0) {
                                this.iB = mouseEvent.getX();
                                this.iC = mouseEvent.getY();
                                this.iF = true;
                                this.iA = c0020av2.a().b();
                                this.jk.getDocument().b(c0020av2.b());
                                this.jn = c0020av2.a().a();
                                this.jo = c0020av2.a().c();
                                this.jl = 0L;
                            }
                        }
                        length2++;
                    }
                }
                break;
        }
        int length3 = this.ia * this.hS.length;
        for (int i5 = 0; i5 < this.hY.length; i5++) {
            for (int i6 = 0; i6 < this.hS.length; i6++) {
                if (mouseEvent.getX() >= this.hS[i6] && mouseEvent.getX() <= this.hS[i6] + this.hT && mouseEvent.getY() >= this.hY[i5] && mouseEvent.getY() <= this.hY[i5] + this.hU && length3 < this.G.H[this.hN].size()) {
                    C0020av c0020av3 = (C0020av) this.G.H[this.hN].elementAt(length3);
                    if (c0020av3.b() != 0) {
                        this.iB = mouseEvent.getX();
                        this.iC = mouseEvent.getY();
                        this.iE = false;
                        this.iF = false;
                        this.iA = c0020av3.a().b();
                        this.jk.getDocument().b(c0020av3.b());
                        this.jn = c0020av3.a().a();
                        this.jo = c0020av3.a().c();
                        if (this.hw == 0) {
                            this.jl = c0020av3.c();
                        } else {
                            this.jl = 10L;
                        }
                    }
                }
                length3++;
            }
        }
    }

    public void o(MouseEvent mouseEvent) {
        if (this.iA != null) {
            this.iB = mouseEvent.getX();
            this.iC = mouseEvent.getY();
        }
    }

    public void p(MouseEvent mouseEvent) {
        if (this.iA != null) {
            if (this.hw != 0) {
                if (this.hw == 1) {
                    if (!this.iF) {
                        if (mouseEvent.getX() >= this.hS[0] && mouseEvent.getX() <= this.hS[this.hS.length - 1] + this.hT && mouseEvent.getY() >= this.hX[0] && mouseEvent.getY() <= this.hX[this.hX.length - 1] + this.hU) {
                            this.is = this.ik;
                            this.it = this.il;
                            if (this.is < this.hS[(this.hS.length - 1) / 2]) {
                                a(this.im.j.substring(0), (byte) 1, this.iu.z);
                            } else {
                                a(this.im.j.substring(0), (byte) 0, this.iu.z);
                            }
                            switch (this.hN) {
                                case 0:
                                    this.jk.setText("1");
                                    break;
                                case 1:
                                    this.jk.setText("1");
                                    break;
                                case 2:
                                    this.jk.setText(sm + this.jk.getDocument().b());
                                    break;
                                case 3:
                                    this.jk.setText(sm + this.jk.getDocument().b());
                                    break;
                            }
                        }
                    } else if (mouseEvent.getX() >= this.hS[0] && mouseEvent.getX() <= this.hS[this.hS.length - 1] + this.hT && mouseEvent.getY() >= this.hY[0] && mouseEvent.getY() <= this.hY[this.hY.length - 1] + this.hU) {
                        this.is = this.ik;
                        this.it = this.il;
                        if (this.is < this.hS[(this.hS.length - 1) / 2]) {
                            a(this.im.j.substring(0), (byte) 1, this.iu.z);
                        } else {
                            a(this.im.j.substring(0), (byte) 0, this.iu.z);
                        }
                        this.jk.setText("1");
                    }
                }
            } else if (!this.iE) {
                if (mouseEvent.getX() >= this.hS[0] && mouseEvent.getX() <= this.hS[this.hS.length - 1] + this.hT && mouseEvent.getY() >= this.hX[0] && mouseEvent.getY() <= this.hX[this.hX.length - 1] + this.hU) {
                    this.is = this.ik;
                    this.it = this.il;
                    if (this.is < this.hS[(this.hS.length - 1) / 2]) {
                        a(this.im.j.substring(0), (byte) 1, this.iu.z);
                    } else {
                        a(this.im.j.substring(0), (byte) 0, this.iu.z);
                    }
                    switch (this.hN) {
                        case 0:
                            this.jk.setText("1");
                            break;
                        case 1:
                            this.jk.setText("1");
                            break;
                        case 2:
                            this.jk.setText(sm + this.jk.getDocument().b());
                            break;
                        case 3:
                            this.jk.setText(sm + this.jk.getDocument().b());
                            break;
                    }
                }
            } else if (mouseEvent.getX() >= this.hS[0] && mouseEvent.getX() <= this.hS[this.hS.length - 1] + this.hT && mouseEvent.getY() >= this.hY[0] && mouseEvent.getY() <= this.hY[this.hY.length - 1] + this.hU) {
                this.is = this.ik;
                this.it = this.il;
                if (this.is < this.hS[(this.hS.length - 1) / 2]) {
                    a(this.im.j.substring(0), (byte) 1, this.iu.z);
                } else {
                    a(this.im.j.substring(0), (byte) 0, this.iu.z);
                }
                this.jk.setText("1");
            }
            this.iA = null;
        }
    }

    public void e(KeyEvent keyEvent) {
    }

    public void a() {
        this.jr = new JTextPane();
        this.jr.setEditable(false);
        this.jr.setSelectionColor(new Color(14540253));
        this.jr.setOpaque(false);
        this.jr.addKeyListener(new aL(this));
        this.js = this.jr.getDocument();
        this.jp = new JScrollPane(this.jr, 20, 31);
        this.jq = this.jp.getVerticalScrollBar();
        this.jp.setOpaque(false);
        int b = this.pW.b("en", 431);
        MastersOfDestiny mastersOfDestiny = pS;
        this.jp.setBounds(this.pW.b("en", 430) + 2, b + MastersOfDestiny.G.getHeight() + 2, this.pW.b("en", 432) - 4, 59);
        pS.add(this.jp);
        this.jp.setVisible(false);
    }

    public void b() {
        if (this.jk == null) {
            this.kR = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 434)));
            this.jk = new JTextField();
            this.jk.setBounds(this.pW.b("en", 396), this.pW.b("en", 397), this.pW.b("en", 398), this.pW.b("en", 399));
            this.jk.setBackground(new Color(14737632));
            this.jk.setBorder(BorderFactory.createLineBorder(new Color(14737632)));
            this.jk.setForeground(new Color(8092539));
            this.jk.setSelectedTextColor(new Color(8092539));
            this.jk.setSelectionColor(new Color(11711154));
            this.jk.setCaretColor(new Color(8092539));
            this.jk.setVisible(false);
            pS.add(this.jk);
            this.jk.setDocument(new C0037q(5));
            this.jk.getDocument().addDocumentListener(new N(this));
            this.jk.addActionListener(new C0019au(this));
        }
    }

    public void h(Object obj) {
        switch (W) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.jt = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 351)));
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                this.jt = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1166)));
                break;
            case C0000a.aW /* 11 */:
            case C0000a.aX /* 12 */:
            case C0000a.aY /* 13 */:
            case C0000a.aZ /* 14 */:
            case 15:
                this.jt = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1072)));
                break;
            case C0000a.bb /* 16 */:
            case C0000a.bc /* 17 */:
            case C0000a.bd /* 18 */:
            case C0000a.be /* 19 */:
                this.jt = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1173)));
                break;
        }
        this.ju = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1185)));
        this.jv = this.pW.b("en", 1186);
        this.jw = this.pW.b("en", 1187);
        this.lo = new Icon[4];
        this.lo[0] = new ImageIcon(getClass().getResource(this.ur.f("en", 1224)));
        this.lo[1] = new ImageIcon(getClass().getResource(this.ur.f("en", 1229)));
        this.lo[2] = new ImageIcon(getClass().getResource(this.ur.f("en", 1222)));
        this.lo[3] = new ImageIcon(getClass().getResource(this.ur.f("en", 1223)));
        this.lr = -1;
        this.lp = 0;
        this.lq = 0;
        this.jx = new Icon[2];
        this.jx[0] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 369)));
        this.jx[1] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 370)));
        this.jy = 0;
        this.jz = new int[2];
        this.jz = this.pW.e("en", 371);
        this.jA = this.pW.b("en", 372);
        this.jB = this.pW.b("en", 373);
        this.jC = this.pW.b("en", 374);
        this.jD = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 378)));
        try {
            InputStream resourceAsStream = getClass().getResourceAsStream("res/hospital/heal.txt");
            if (resourceAsStream != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int read = resourceAsStream.read();
                    if (read != -1) {
                        byteArrayOutputStream.write(read);
                    } else {
                        resourceAsStream.close();
                        this.kb = new String(byteArrayOutputStream.toByteArray(), "utf-8");
                        C0032k.a(this.kb);
                    }
                }
            } else {
                C0032k.a("heal txt null");
            }
        } catch (IOException e) {
            C0032k.a(e.getMessage());
        }
        this.jJ = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1179)));
        this.jK = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1178)));
        if (this.kb != null) {
            this.kc = this.kb.split("\n");
            int length = this.kc.length;
            this.jN = new Icon[length];
            this.jO = new String[length];
            this.jP = new String[length];
            this.jL = 0;
            this.jM = 0;
            for (int i = 0; i < length; i++) {
                String[] split = this.kc[i].split("\\|");
                if (split[0].equalsIgnoreCase("H")) {
                    this.jN[i] = this.jJ;
                    this.jL++;
                } else {
                    this.jN[i] = this.jK;
                    this.jM++;
                }
                this.jO[i] = split[1];
                this.jP[i] = split[2];
            }
        } else {
            this.jN = new Icon[6];
            this.jN[0] = this.jJ;
            this.jN[1] = this.jJ;
            this.jN[2] = this.jJ;
            this.jN[3] = this.jK;
            this.jN[4] = this.jK;
            this.jN[5] = this.jK;
            this.jO = new String[6];
            this.jO[0] = "Light HP Heal";
            this.jO[1] = "Medium HP Heal";
            this.jO[2] = "Large HP Heal";
            this.jO[3] = "Light Energy Recovery";
            this.jO[4] = "Medium Energy Recovery";
            this.jO[5] = "Large Energy Recovery";
            this.jP = new String[6];
            this.jP[0] = "Heals 20 HP. 7 Sidos.";
            this.jP[1] = "Heals 50 HP. 12 Sidos.";
            this.jP[2] = "Heals 100 HP. 17 Sidos.";
            this.jP[3] = "Recovers 20 Energy. 7 Sidos.";
            this.jP[4] = "Recovers 50 Energy. 12 Sidos.";
            this.jP[5] = "Recovers 100 Energy. 17 Sidos.";
            this.jL = 3;
            this.jM = 3;
        }
        this.jQ = -1;
        this.jR = 0;
        this.jS = this.pW.b("en", 1180);
        this.jT = this.pW.e("en", 1181);
        this.jX = this.pW.b("en", 1188);
        this.jY = this.pW.e("en", 1189);
        this.jZ = this.pW.b("en", 1190);
        this.ka = this.pW.b("en", 1191);
        this.jU = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1182)));
        this.jV = this.pW.b("en", 1183);
        this.jW = this.pW.b("en", 1184);
        this.kd = new Icon[4];
        this.kd[0] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1192)));
        this.kd[1] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1214)));
        this.kd[2] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1215)));
        this.kd[3] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1216)));
        this.ke = this.pW.b("en", 1193);
        this.kf = this.pW.b("en", 1194);
        this.kg = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1195)));
        this.kh = this.pW.b("en", 1196);
        this.ki = this.pW.b("en", 1197);
        this.kj = this.pW.b("en", 1198);
        this.kk = this.pW.b("en", 1199);
        this.jE = 0;
        this.jF = 86;
        this.jG = this.pW.b("en", 380);
        this.jH = this.pW.e("en", 381);
        this.jI = this.pW.b("en", 382);
        this.kl = this.pW.e("en", 352);
        this.km = this.pW.b("en", 355);
        this.kn = this.pW.b("en", 356);
        this.ko = new Vector();
        this.kp = this.pW.e("en", 353);
        this.kq = this.pW.e("en", 354);
        this.kr = 0;
        this.ks = 0;
        this.kt = this.pW.b("en", 357);
        this.ku = this.pW.e("en", 358);
        this.kv = this.pW.b("en", 359);
        this.kw = this.pW.b("en", 360);
        this.kB = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 293)));
        this.kC = this.kl[0] - 2;
        this.kD = this.kp[0] - 2;
        this.kE = C0011ak.m();
        this.kE.a((byte) 2);
        this.kE.g();
        this.kF = 158;
        this.kG = 17;
        this.kM = C0011ak.m();
        this.kM.a((byte) 3);
        this.kM.g();
        this.kQ = true;
        this.kS = this.pW.b("en", 387);
        this.kT = this.pW.b("en", 388);
        b();
        a();
        int b = this.pW.b("en", 431);
        MastersOfDestiny mastersOfDestiny = pS;
        this.jp.setBounds(this.pW.b("en", 430) + 2, (b + MastersOfDestiny.G.getHeight()) - 30, this.pW.b("en", 432) - 4, 59);
        this.jp.setVisible(false);
        try {
            this.js.remove(0, this.js.getLength());
            this.js.insertString(this.js.getLength(), "Hospital Transaction History", pS.i);
        } catch (BadLocationException e2) {
            C0032k.a(e2.getMessage());
        }
        this.kU = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 434)));
        this.kX = this.pW.b("en", 400);
        this.kY = this.pW.e("en", 401);
        this.kZ = this.pW.b("en", 402);
        this.la = this.pW.b("en", 403);
        this.lb = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 433)));
        this.lg = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 435)));
        this.lj = false;
        this.lk = 0;
        this.ll = 0;
        this.lm = 0L;
        this.ls = false;
        this.U.write("H1\n");
        this.U.flush();
        this.U.write("H13\n");
        this.U.flush();
    }

    public void c(C0020av c0020av) {
        this.ko.add(c0020av);
    }

    public void h(Graphics graphics) {
        this.jt.paintIcon(pS, graphics, 0, 0);
        this.jx[this.jy].paintIcon(pS, graphics, this.jz[this.jy], this.jA);
        if (!this.jp.isVisible()) {
            graphics.setColor(new Color(7763574));
            MastersOfDestiny mastersOfDestiny = pS;
            graphics.setFont(MastersOfDestiny.W);
            graphics.drawString("Welcome, adventurer.", 455, 409);
            graphics.drawString("What would you like to buy?", 455, 430);
        }
        if (this.jy == 0) {
            int length = this.kr * this.kl.length;
            for (int i = 0; i < this.kp.length; i++) {
                for (int i2 = 0; i2 < this.kl.length; i2++) {
                    if (length < this.ko.size()) {
                        ((C0020av) this.ko.elementAt(length)).a().b().paintIcon(pS, graphics, this.kl[i2], this.kp[i]);
                        long b = ((C0020av) this.ko.elementAt(length)).b();
                        if (b > 0) {
                            graphics.setColor(new Color(16777215));
                            MastersOfDestiny mastersOfDestiny2 = pS;
                            graphics.setFont(MastersOfDestiny.z);
                            graphics.drawString(b + sm, this.kl[i2] + 2, this.kp[i] + 9);
                        }
                        length++;
                    }
                }
            }
            this.jD.paintIcon(pS, graphics, this.jF, this.jG);
            int length2 = this.ks * this.kl.length;
            for (int i3 = 0; i3 < this.kq.length; i3++) {
                for (int i4 = 0; i4 < this.kl.length; i4++) {
                    if (length2 < this.G.H[3].size()) {
                        ((C0020av) this.G.H[3].elementAt(length2)).a().b().paintIcon(pS, graphics, this.kl[i4], this.kq[i3]);
                        graphics.setColor(new Color(16777215));
                        MastersOfDestiny mastersOfDestiny3 = pS;
                        graphics.setFont(MastersOfDestiny.z);
                        graphics.drawString(sm + ((C0020av) this.G.H[3].elementAt(length2)).b(), this.kl[i4] + 2, this.kq[i3] + 9);
                        length2++;
                    }
                }
            }
            long q = this.G.q();
            graphics.setColor(new Color(0));
            MastersOfDestiny mastersOfDestiny4 = pS;
            graphics.setFont(MastersOfDestiny.D);
            graphics.drawString(sm + q + "/" + this.G.p(), 139, 520);
            this.kB.paintIcon(pS, graphics, this.kC, this.kD);
            if (this.kE.j != null) {
                MastersOfDestiny mastersOfDestiny5 = pS;
                graphics.setFont(MastersOfDestiny.B);
                this.kE.a(graphics, pS);
            }
            if (this.kM.j != null) {
                this.kB.paintIcon(pS, graphics, this.kK, this.kL);
                MastersOfDestiny mastersOfDestiny6 = pS;
                graphics.setFont(MastersOfDestiny.B);
                this.kM.a(graphics, pS);
                graphics.setColor(new Color(16777215));
                MastersOfDestiny mastersOfDestiny7 = pS;
                graphics.setFont(MastersOfDestiny.B);
                graphics.drawString("Quantity:", this.kV, this.kW - 4);
                this.kU.paintIcon(pS, graphics, this.kV, this.kW);
                graphics.setColor(new Color(16777215));
                MastersOfDestiny mastersOfDestiny8 = pS;
                graphics.setFont(MastersOfDestiny.B);
                graphics.drawString("Cost:", this.lc, this.ld - 4);
                this.lb.paintIcon(pS, graphics, this.lc, this.ld);
                graphics.setColor(new Color(0));
                MastersOfDestiny mastersOfDestiny9 = pS;
                graphics.setFont(MastersOfDestiny.D);
                graphics.drawString(sm + this.jm, this.le, this.lf);
                this.lg.paintIcon(pS, graphics, this.lh, this.li);
            }
            if (this.kN != null) {
                this.kN.paintIcon(pS, graphics, this.kO, this.kP);
            }
        } else {
            this.ju.paintIcon(pS, graphics, this.jv, this.jw);
            if (this.jQ >= this.jR) {
                this.jU.paintIcon(pS, graphics, this.jS - 14, this.jT[this.jQ - this.jR] - 3);
            }
            this.kg.paintIcon(pS, graphics, this.kh, this.ki);
            if (this.jN.length - this.jR > 4) {
                for (int i5 = 0; i5 < 4; i5++) {
                    this.jN[i5 + this.jR].paintIcon(pS, graphics, this.jS, this.jT[i5]);
                    graphics.setColor(new Color(8254201));
                    graphics.setFont(MastersOfDestiny.D);
                    graphics.drawString(this.jO[i5 + this.jR], this.jS + 54, this.jT[i5] + 12);
                    graphics.setColor(new Color(16777215));
                    graphics.drawString(this.jP[i5 + this.jR], this.jS + 54, this.jT[i5] + 31);
                }
            } else {
                for (int i6 = this.jR; i6 < this.jN.length; i6++) {
                    this.jN[i6].paintIcon(pS, graphics, this.jS, this.jT[i6 - this.jR]);
                    graphics.setColor(new Color(8254201));
                    graphics.setFont(MastersOfDestiny.D);
                    graphics.drawString(this.jO[i6], this.jS + 54, this.jT[i6 - this.jR] + 12);
                    graphics.setColor(new Color(16777215));
                    graphics.drawString(this.jP[i6], this.jS + 54, this.jT[i6 - this.jR] + 31);
                }
            }
            this.kd[oK - 1].paintIcon(pS, graphics, this.ke, this.kf);
            graphics.setColor(new Color(16777215));
            graphics.setFont(MastersOfDestiny.F);
            graphics.drawString(oJ, 224, 426);
            graphics.drawString("HP: " + this.G.n() + "/" + this.G.o(), 224, 448);
            graphics.drawString("EN: " + this.G.s() + "/" + this.G.r(), 224, 470);
        }
        graphics.setColor(new Color(0));
        MastersOfDestiny mastersOfDestiny10 = pS;
        graphics.setFont(MastersOfDestiny.D);
        graphics.drawString(sm + X, 284, 520);
        if (this.lr != -1) {
            this.lo[this.lr].paintIcon(pS, graphics, this.lp, this.lq);
        }
        if (this.ls) {
            graphics.setColor(new Color(15790320));
            graphics.fillRect(447, 393, 236, 77);
            graphics.setColor(new Color(0));
            graphics.setFont(MastersOfDestiny.F);
            graphics.drawString("Sorry", 565 - (graphics.getFontMetrics().stringWidth("Sorry") / 2), 393 + graphics.getFontMetrics().getHeight());
            graphics.setColor(new Color(8092539));
            graphics.setFont(MastersOfDestiny.B);
            graphics.drawString("There is no hospital available", 452, 393 + (graphics.getFontMetrics().getHeight() * 2));
            graphics.drawString("at the moment.", 452, 393 + (graphics.getFontMetrics().getHeight() * 3));
            graphics.drawString("Please check back again", 452, 447 + (graphics.getFontMetrics().getHeight() * 5));
        }
    }

    public void q(MouseEvent mouseEvent) {
        if (mouseEvent.getX() == this.lk && mouseEvent.getY() == this.ll && this.lm >= System.currentTimeMillis()) {
            r(mouseEvent);
            this.lk = 0;
            this.ll = 0;
            this.lm = 0L;
            return;
        }
        if (this.kM.j == null) {
            for (int i = 0; i < this.jx.length; i++) {
                if (mouseEvent.getX() >= this.jz[i] && mouseEvent.getX() <= this.jz[i] + this.jB && mouseEvent.getY() >= this.jA && mouseEvent.getY() <= this.jA + this.jC) {
                    this.jy = i;
                    return;
                }
            }
        }
        if (this.jy == 0) {
            if (this.kM.j != null) {
                for (int i2 = 0; i2 < this.kY.length; i2++) {
                    if (mouseEvent.getX() >= this.kX && mouseEvent.getX() <= this.kX + this.kZ && mouseEvent.getY() >= this.kY[i2] && mouseEvent.getY() <= this.kY[i2] + this.la) {
                        if (this.jk.getText().equals(sm)) {
                            this.jk.setText("1");
                        } else if (i2 == 0) {
                            this.jk.setText(sm + (Integer.parseInt(this.jk.getText()) + 1));
                        } else if (Integer.parseInt(this.jk.getText()) > 1) {
                            this.jk.setText(sm + (Integer.parseInt(this.jk.getText()) - 1));
                        }
                        this.lj = true;
                        return;
                    }
                }
                if (!this.jk.getText().trim().equals(sm) && mouseEvent.getX() > this.lh && mouseEvent.getX() < this.lh + this.pW.b("en", 424) && mouseEvent.getY() > this.li && mouseEvent.getY() < this.li + this.pW.b("en", 425)) {
                    C0032k.a("buy!");
                    this.kM.j = null;
                    this.jk.setVisible(false);
                    this.lr = -1;
                    if (!this.jp.isVisible()) {
                        this.jp.setVisible(true);
                    }
                    if (this.kQ) {
                        C0032k.a("buy");
                        C0032k.a("H6|" + this.jn + "|" + this.jk.getText() + "\n");
                        this.U.write("H6|" + this.jn + "|" + this.jk.getText() + "\n");
                        this.U.flush();
                        return;
                    }
                    C0032k.a("sell");
                    C0032k.a("H19|" + this.jn + "|" + this.jk.getText() + "\n");
                    this.U.write("H19|" + this.jn + "|" + this.jk.getText() + "\n");
                    this.U.flush();
                    return;
                } else if (mouseEvent.getX() > this.lh + this.pW.b("en", 424) + 3 && mouseEvent.getX() < this.lh + this.pW.b("en", 424) + 3 + this.pW.b("en", 391) && mouseEvent.getY() > this.li && mouseEvent.getY() < this.li + this.pW.b("en", 392)) {
                    this.kM.j = null;
                    this.jk.setVisible(false);
                    this.lr = -1;
                    return;
                }
            } else {
                for (int i3 = 0; i3 < this.ku.length; i3++) {
                    if (mouseEvent.getX() >= this.kt && mouseEvent.getX() <= this.kt + this.kv && mouseEvent.getY() >= this.ku[i3] && mouseEvent.getY() <= this.ku[i3] + this.kw) {
                        switch (i3) {
                            case 0:
                                if ((this.kM.j == null || !this.kQ) && this.kr > 0) {
                                    this.kr--;
                                    return;
                                }
                                return;
                            case 1:
                                if ((this.kM.j == null || !this.kQ) && this.kl.length * (this.kr + this.kp.length) < this.ko.size()) {
                                    this.kr++;
                                    return;
                                }
                                return;
                            case 2:
                                if ((this.kM.j == null || this.kQ) && this.ks > 0) {
                                    this.ks--;
                                    return;
                                }
                                return;
                            case 3:
                                if ((this.kM.j == null || this.kQ) && this.kl.length * (this.ks + this.kq.length) < this.G.H[3].size()) {
                                    this.ks++;
                                    return;
                                }
                                return;
                        }
                    }
                }
            }
        } else if (mouseEvent.getX() >= this.kh && mouseEvent.getX() <= this.kh + this.kj && mouseEvent.getY() >= this.ki && mouseEvent.getY() <= this.ki + this.kk) {
            if (this.jQ < this.jL && this.jQ > -1) {
                this.U.write("H25|" + (this.jQ + 1) + "\n");
                this.U.flush();
            } else if (this.jQ >= this.jL) {
                this.U.write("H26|" + ((this.jQ + 1) - this.jL) + "\n");
                this.U.flush();
            }
            if (this.jp.isVisible()) {
                return;
            }
            this.jp.setVisible(true);
            return;
        } else {
            for (int i4 = 0; i4 < 4; i4++) {
                if (mouseEvent.getX() >= this.jS && mouseEvent.getX() <= this.jS + 257 && mouseEvent.getY() >= this.jT[i4] && mouseEvent.getY() <= this.jT[i4] + 45) {
                    if (i4 < this.jN.length - this.jR) {
                        this.jQ = i4 + this.jR;
                        return;
                    }
                    return;
                }
            }
            if (mouseEvent.getX() >= this.jX && mouseEvent.getX() <= this.jX + this.jZ && mouseEvent.getY() >= this.jY[0] && mouseEvent.getY() <= this.jY[0] + this.ka) {
                if (this.jR > 0) {
                    this.jR--;
                }
                if (this.jQ >= this.jR + 4) {
                    this.jQ = this.jR + 3;
                    return;
                }
                return;
            } else if (mouseEvent.getX() >= this.jX && mouseEvent.getX() <= this.jX + this.jZ && mouseEvent.getY() >= this.jY[1] && mouseEvent.getY() <= this.jY[1] + this.ka) {
                if (this.jR + 4 < this.jN.length) {
                    this.jR++;
                }
                if (this.jQ - this.jR < 0) {
                    this.jQ = this.jR;
                    return;
                }
                return;
            }
        }
        if (mouseEvent.getX() <= this.pW.b("en", 383) || mouseEvent.getX() >= this.pW.b("en", 383) + this.pW.b("en", 385) || mouseEvent.getY() <= this.pW.b("en", 384) || mouseEvent.getY() >= this.pW.b("en", 384) + this.pW.b("en", 386)) {
            this.lk = mouseEvent.getX();
            this.ll = mouseEvent.getY();
            this.lm = System.currentTimeMillis() + 300;
            return;
        }
        this.jp.setVisible(false);
        this.jk.setVisible(false);
        this.lr = -1;
        this.U.write("H5\n");
        this.U.flush();
        C0021aw.b.a(C0028g.a);
        this.O.h();
        b((byte) 0, (Object) null);
    }

    public void r(MouseEvent mouseEvent) {
        if (this.kM.j == null && this.jy == 0) {
            int length = this.kr * this.kl.length;
            for (int i = 0; i < this.kp.length; i++) {
                for (int i2 = 0; i2 < this.kl.length; i2++) {
                    if (mouseEvent.getX() >= this.kl[i2] && mouseEvent.getX() <= this.kl[i2] + this.km && mouseEvent.getY() >= this.kp[i] && mouseEvent.getY() <= this.kp[i] + this.kn) {
                        this.kQ = true;
                        this.kK = this.kl[i2] - 2;
                        this.kL = this.kp[i] - 2;
                        if (length < this.ko.size()) {
                            if (i2 < this.kl.length / 2) {
                                b(((C0020av) this.ko.elementAt(length)).b("Out of Stock"), (byte) 1, this.kM.z);
                            } else {
                                b(((C0020av) this.ko.elementAt(length)).b("Out of Stock"), (byte) 0, this.kM.z);
                            }
                        }
                        this.jk.setText("1");
                        this.jk.getDocument().b(((C0020av) this.ko.elementAt(length)).b());
                        this.jn = ((C0020av) this.ko.elementAt(length)).a().a();
                        this.jo = ((C0020av) this.ko.elementAt(length)).a().c();
                        this.jl = ((C0020av) this.ko.elementAt(length)).c();
                        return;
                    }
                    length++;
                }
            }
            int length2 = this.ks * this.kl.length;
            for (int i3 = 0; i3 < this.kq.length; i3++) {
                for (int i4 = 0; i4 < this.kl.length; i4++) {
                    if (mouseEvent.getX() >= this.kl[i4] && mouseEvent.getX() <= this.kl[i4] + this.km && mouseEvent.getY() >= this.kq[i3] && mouseEvent.getY() <= this.kq[i3] + this.kn) {
                        this.kQ = false;
                        this.kK = this.kl[i4] - 2;
                        this.kL = this.kq[i3] - 2;
                        if (length2 < this.G.H[3].size()) {
                            if (i4 < this.kl.length / 2) {
                                b(((C0020av) this.G.H[3].elementAt(length2)).b("0"), (byte) 1, this.kM.z);
                            } else if (i4 == this.kl.length - 1) {
                                b(((C0020av) this.G.H[3].elementAt(length2)).b("0"), (byte) 2, this.kM.z);
                            } else {
                                b(((C0020av) this.G.H[3].elementAt(length2)).b("0"), (byte) 0, this.kM.z);
                            }
                        }
                        this.jk.getDocument().b(((C0020av) this.G.H[3].elementAt(length2)).b());
                        switch (3) {
                            case 0:
                                this.jk.setText("1");
                                break;
                            case 1:
                                this.jk.setText("1");
                                break;
                            case 2:
                                this.jk.setText(sm + this.jk.getDocument().b());
                                break;
                            case 3:
                                this.jk.setText(sm + this.jk.getDocument().b());
                                break;
                        }
                        this.jn = ((C0020av) this.G.H[3].elementAt(length2)).a().a();
                        this.jo = ((C0020av) this.G.H[3].elementAt(length2)).a().c();
                        this.jl = ((C0020av) this.G.H[3].elementAt(length2)).c();
                        return;
                    }
                    length2++;
                }
            }
        }
    }

    public void s(MouseEvent mouseEvent) {
        this.lr = -1;
        if (mouseEvent.getX() > this.pW.b("en", 383) && mouseEvent.getX() < this.pW.b("en", 383) + this.pW.b("en", 385) && mouseEvent.getY() > this.pW.b("en", 384) && mouseEvent.getY() < this.pW.b("en", 384) + this.pW.b("en", 386)) {
            this.lr = 0;
            this.lp = this.pW.b("en", 383);
            this.lq = this.pW.b("en", 384);
            return;
        }
        if (this.jy == 0) {
            if (this.kM.j != null) {
                if (!this.jk.getText().trim().equals(sm) && mouseEvent.getX() > this.lh && mouseEvent.getX() < this.lh + this.pW.b("en", 424) && mouseEvent.getY() > this.li && mouseEvent.getY() < this.li + this.pW.b("en", 425)) {
                    this.lr = 2;
                    this.lp = this.lh;
                    this.lq = this.li;
                    return;
                } else if (mouseEvent.getX() > this.lh + this.pW.b("en", 424) + 3 && mouseEvent.getX() < this.lh + this.pW.b("en", 424) + 3 + this.pW.b("en", 391) && mouseEvent.getY() > this.li && mouseEvent.getY() < this.li + this.pW.b("en", 392)) {
                    this.lr = 3;
                    this.lp = this.lh + this.pW.b("en", 424) + 3;
                    this.lq = this.li;
                    return;
                }
            }
        } else if (mouseEvent.getX() >= this.kh && mouseEvent.getX() <= this.kh + this.kj && mouseEvent.getY() >= this.ki && mouseEvent.getY() <= this.ki + this.kk) {
            this.lr = 1;
            this.lp = this.kh;
            this.lq = this.ki;
            return;
        }
        if ((this.kM.j == null || !this.kQ) && this.jy == 0) {
            int length = this.kr * this.kl.length;
            for (int i = 0; i < this.kp.length; i++) {
                for (int i2 = 0; i2 < this.kl.length; i2++) {
                    if (mouseEvent.getX() >= this.kl[i2] && mouseEvent.getX() <= this.kl[i2] + this.km && mouseEvent.getY() >= this.kp[i] && mouseEvent.getY() <= this.kp[i] + this.kn) {
                        this.kC = this.kl[i2] - 2;
                        this.kD = this.kp[i] - 2;
                        if (length < this.ko.size()) {
                            if (i2 < this.kl.length / 2) {
                                b(((C0020av) this.ko.elementAt(length)).b("Out of Stock"), (byte) 1, this.kE.z);
                                return;
                            } else {
                                b(((C0020av) this.ko.elementAt(length)).b("Out of Stock"), (byte) 0, this.kE.z);
                                return;
                            }
                        }
                        return;
                    }
                    length++;
                }
            }
        }
        if (this.kM.j == null || this.kQ) {
            int length2 = this.ks * this.kl.length;
            for (int i3 = 0; i3 < this.kq.length; i3++) {
                for (int i4 = 0; i4 < this.kl.length; i4++) {
                    if (mouseEvent.getX() >= this.kl[i4] && mouseEvent.getX() <= this.kl[i4] + this.km && mouseEvent.getY() >= this.kq[i3] && mouseEvent.getY() <= this.kq[i3] + this.kn) {
                        this.kC = this.kl[i4] - 2;
                        this.kD = this.kq[i3] - 2;
                        if (length2 < this.G.H[3].size()) {
                            if (i4 < this.kl.length / 2) {
                                b(((C0020av) this.G.H[3].elementAt(length2)).b("0"), (byte) 1, this.kE.z);
                                return;
                            } else {
                                b(((C0020av) this.G.H[3].elementAt(length2)).b("0"), (byte) 0, this.kE.z);
                                return;
                            }
                        }
                        return;
                    }
                    length2++;
                }
            }
        }
        b(null, (byte) 1, this.kE.z);
    }

    public void b(String str, byte b, byte b2) {
        int i = this.kC + (this.km / 2);
        int i2 = this.kD + ((this.kn / 3) * 2);
        if (i2 + 150 > 580) {
            i2 -= 150;
        }
        switch (b) {
            case 0:
                i = (i - this.kF) - 15;
                break;
            case 2:
                i = (i - this.kF) - (this.km / 2);
                break;
        }
        switch (b2) {
            case 2:
                int i3 = this.kF;
                int i4 = this.kG;
                MastersOfDestiny mastersOfDestiny = pS;
                this.kE.a(str, i, i2, i3, i4, MastersOfDestiny.C, null);
                return;
            case 3:
                if (i + 300 > 420) {
                    i -= 70;
                }
                int i5 = this.kF;
                int i6 = this.kG;
                MastersOfDestiny mastersOfDestiny2 = pS;
                this.kM.a(str, i, i2, i5, i6, MastersOfDestiny.C, null);
                this.kV = i + this.kF + 6 + 2;
                MastersOfDestiny mastersOfDestiny3 = pS;
                int height = i2 + MastersOfDestiny.C.getHeight();
                MastersOfDestiny mastersOfDestiny4 = pS;
                this.kW = height + (MastersOfDestiny.C.getHeight() / 2);
                this.jk.setBounds(this.kV + 3, this.kW + 5, this.pW.b("en", 398), this.pW.b("en", 399));
                this.jk.setVisible(true);
                this.jk.requestFocusInWindow();
                this.kX = this.kV + this.pW.b("en", 398) + 4;
                this.kY[0] = this.kW;
                this.kY[1] = this.kW + this.kZ;
                this.lc = this.kV;
                int iconHeight = this.kW + this.kU.getIconHeight();
                MastersOfDestiny mastersOfDestiny5 = pS;
                int height2 = iconHeight + MastersOfDestiny.C.getHeight();
                MastersOfDestiny mastersOfDestiny6 = pS;
                this.ld = height2 + (MastersOfDestiny.C.getHeight() / 2);
                this.le = this.lc + 1 + 5;
                this.lf = ((this.ld + this.lb.getIconHeight()) - 1) - 3;
                this.lh = this.lc + 1;
                int iconHeight2 = (i2 + this.kM.o) - this.lg.getIconHeight();
                MastersOfDestiny mastersOfDestiny7 = pS;
                this.li = iconHeight2 - (MastersOfDestiny.C.getHeight() / 2);
                return;
            default:
                return;
        }
    }

    public void t(MouseEvent mouseEvent) {
        if (this.kM.j != null) {
            return;
        }
        if (this.jy == 0) {
            int length = this.kr * this.kl.length;
            for (int i = 0; i < this.kp.length; i++) {
                for (int i2 = 0; i2 < this.kl.length; i2++) {
                    if (mouseEvent.getX() >= this.kl[i2] && mouseEvent.getX() <= this.kl[i2] + this.km && mouseEvent.getY() >= this.kp[i] && mouseEvent.getY() <= this.kp[i] + this.kn && length < this.ko.size()) {
                        C0020av c0020av = (C0020av) this.ko.elementAt(length);
                        if (c0020av.b() != 0) {
                            this.kO = mouseEvent.getX();
                            this.kP = mouseEvent.getY();
                            this.kQ = true;
                            this.kN = c0020av.a().b();
                            this.jk.getDocument().b(c0020av.b());
                            this.jn = c0020av.a().a();
                            this.jo = c0020av.a().c();
                            this.jl = c0020av.c();
                        }
                    }
                    length++;
                }
            }
        }
        int length2 = this.ks * this.kl.length;
        for (int i3 = 0; i3 < this.kq.length; i3++) {
            for (int i4 = 0; i4 < this.kl.length; i4++) {
                if (mouseEvent.getX() >= this.kl[i4] && mouseEvent.getX() <= this.kl[i4] + this.km && mouseEvent.getY() >= this.kq[i3] && mouseEvent.getY() <= this.kq[i3] + this.kn && length2 < this.G.H[3].size()) {
                    C0020av c0020av2 = (C0020av) this.G.H[3].elementAt(length2);
                    if (c0020av2.b() != 0) {
                        this.kO = mouseEvent.getX();
                        this.kP = mouseEvent.getY();
                        this.kQ = false;
                        this.kN = c0020av2.a().b();
                        this.jk.getDocument().b(c0020av2.b());
                        this.jn = c0020av2.a().a();
                        this.jo = c0020av2.a().c();
                        this.jl = c0020av2.c();
                    }
                }
                length2++;
            }
        }
    }

    public void u(MouseEvent mouseEvent) {
        if (this.kN != null) {
            this.kO = mouseEvent.getX();
            this.kP = mouseEvent.getY();
        }
    }

    public void v(MouseEvent mouseEvent) {
        if (this.kN != null) {
            if (!this.kQ) {
                if (mouseEvent.getX() >= this.kl[0] && mouseEvent.getX() <= this.kl[this.kl.length - 1] + this.km && mouseEvent.getY() >= this.kp[0] && mouseEvent.getY() <= this.kp[this.kp.length - 1] + this.kn) {
                    this.kK = this.kC;
                    this.kL = this.kD;
                    if (this.kK < this.kl[(this.kl.length - 1) / 2]) {
                        b(this.kE.j.substring(0), (byte) 1, this.kM.z);
                    } else {
                        b(this.kE.j.substring(0), (byte) 0, this.kM.z);
                    }
                    switch (3) {
                        case 0:
                            this.jk.setText("1");
                            break;
                        case 1:
                            this.jk.setText("1");
                            break;
                        case 2:
                            this.jk.setText(sm + this.jk.getDocument().b());
                            break;
                        case 3:
                            this.jk.setText(sm + this.jk.getDocument().b());
                            break;
                    }
                }
            } else if (mouseEvent.getX() >= this.kl[0] && mouseEvent.getX() <= this.kl[this.kl.length - 1] + this.km && mouseEvent.getY() >= this.kq[0] && mouseEvent.getY() <= this.kq[this.kq.length - 1] + this.kn) {
                this.kK = this.kC;
                this.kL = this.kD;
                if (this.kK < this.kl[(this.kl.length - 1) / 2]) {
                    b(this.kE.j.substring(0), (byte) 1, this.kM.z);
                } else {
                    b(this.kE.j.substring(0), (byte) 0, this.kM.z);
                }
                this.jk.setText("1");
            }
            this.kN = null;
        }
    }

    public void i(Object obj) {
        this.lt = new aX(this);
        this.lt.a(this.ur, System.currentTimeMillis());
    }

    public void i(Graphics graphics) {
        this.lt.a(graphics, pS);
    }

    public void a(C0001aa c0001aa, long j) {
        int b;
        if (this.lt == null || (b = this.lt.b(c0001aa, j)) == 18 || b == 0) {
            return;
        }
        C0021aw.b.a(C0028g.a);
        this.O.h();
        C0032k.a("changing state from mission: " + b);
        if (b != 5) {
            a((byte) b, (Object) null);
            return;
        }
        b((byte) 0, (Object) null);
        this.qm = (byte) 5;
    }

    public void w(MouseEvent mouseEvent) {
        this.lt.a(mouseEvent);
    }

    public void x(MouseEvent mouseEvent) {
        this.lt.b(mouseEvent);
    }

    public void y(MouseEvent mouseEvent) {
        this.lt.c(mouseEvent);
    }

    public void z(MouseEvent mouseEvent) {
        this.lt.e(mouseEvent);
    }

    public void A(MouseEvent mouseEvent) {
        this.lt.d(mouseEvent);
    }

    public void a(String[] strArr) {
        this.lt.a(strArr);
    }

    public void j(Object obj) {
        int random = (int) (Math.random() * 5.0d);
        if (random == 1) {
            C0021aw.b.a(C0028g.j, true);
        } else if (random == 2) {
            C0021aw.b.a(C0028g.k, true);
        } else if (random == 3) {
            C0021aw.b.a(C0028g.l, true);
        } else if (random == 4) {
            C0021aw.b.a(C0028g.m, true);
        } else {
            C0021aw.b.a(C0028g.n, true);
        }
        this.lu = new O(this);
        this.ur.e = oI;
        this.lu.a(this.ur, System.currentTimeMillis());
    }

    public void a(String str, int i) {
        C0032k.a("new connection");
        try {
            C0032k.a("terminating colony reader - " + this.aa);
            if (this.aa != null) {
                this.aa.a();
            }
            C0032k.a("colonyReader terminated");
            this.aa = null;
            this.T = null;
            this.U = null;
            this.S.close();
            this.S = null;
            C0032k.a("colony closed");
            C0032k.a("connecting to: " + str + " port: " + i);
            this.S = new Socket(str, i);
            this.U = new PrintWriter(this.S.getOutputStream(), true);
            this.T = new BufferedReader(new InputStreamReader(this.S.getInputStream()));
            C0032k.a("~~~~~~~~~~~~~~~~~~~~connecting~~~~~~~~~~~~~~~~~~~~~~~~~");
            this.aa = new C0025d(this);
            this.aa.start();
        } catch (IOException e) {
            C0032k.a("connection error = " + e.getMessage());
            a("Unable to connect to the server.\nPlease try again.\n[Press Any Key]", (byte) 8, (Object) null);
        }
    }

    public void j(Graphics graphics) {
        this.lu.a(graphics, pS);
    }

    public void b(C0001aa c0001aa, long j) {
        int b;
        if (this.lu == null || (b = this.lu.b(c0001aa, j)) == 21 || b == 0) {
            return;
        }
        C0032k.a("changing state from hq: " + b);
        a((byte) b, (Object) null);
    }

    public void B(MouseEvent mouseEvent) {
        this.lu.a(mouseEvent);
    }

    public void C(MouseEvent mouseEvent) {
        this.lu.b(mouseEvent);
    }

    public void D(MouseEvent mouseEvent) {
        this.lu.c(mouseEvent);
    }

    public void E(MouseEvent mouseEvent) {
        this.lu.e(mouseEvent);
    }

    public void F(MouseEvent mouseEvent) {
        this.lu.d(mouseEvent);
    }

    public void b(String[] strArr) {
        this.lu.a(strArr);
    }

    public void k(Object obj) {
        this.lv = new C0040t(this);
        this.lv.a(this.ur, System.currentTimeMillis());
    }

    public void k(Graphics graphics) {
        this.lv.a(graphics, pS);
    }

    public void c(C0001aa c0001aa, long j) {
        int b;
        if (this.lv == null || (b = this.lv.b(c0001aa, j)) == 22 || b == 0) {
            return;
        }
        C0032k.a("changing state from mission: " + b);
        if (b == 27) {
            this.ab = (byte) 0;
        }
        a((byte) b, (Object) null);
    }

    public void G(MouseEvent mouseEvent) {
        this.lv.a(mouseEvent);
    }

    public void H(MouseEvent mouseEvent) {
        this.lv.b(mouseEvent);
    }

    public void I(MouseEvent mouseEvent) {
        this.lv.c(mouseEvent);
    }

    public void J(MouseEvent mouseEvent) {
        this.lv.e(mouseEvent);
    }

    public void K(MouseEvent mouseEvent) {
        this.lv.d(mouseEvent);
    }

    public void c(String[] strArr) {
        this.lv.a(strArr);
    }

    public void l(Object obj) {
        switch (W) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.lw = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1246)));
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                this.lw = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1167)));
                break;
            case C0000a.aW /* 11 */:
            case C0000a.aX /* 12 */:
            case C0000a.aY /* 13 */:
            case C0000a.aZ /* 14 */:
            case 15:
                this.lw = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1073)));
                break;
            case C0000a.bb /* 16 */:
            case C0000a.bc /* 17 */:
            case C0000a.bd /* 18 */:
            case C0000a.be /* 19 */:
                this.lw = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1174)));
                break;
        }
        this.lx = new Icon[2];
        this.lx[0] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1224)));
        this.lx[1] = new ImageIcon(getClass().getResource(this.g + this.pW.d("en", 1223)));
        this.ly = 0;
        this.lz = 0;
        this.lA = -1;
        this.lB = this.pW.b("en", 437);
        this.lC = this.pW.b("en", 438);
        this.lD = this.pW.b("en", 439);
        this.lE = this.pW.b("en", 440);
    }

    public void l(Graphics graphics) {
        this.lw.paintIcon(pS, graphics, 0, 0);
        if (this.lA != -1) {
            this.lx[this.lA].paintIcon(pS, graphics, this.ly, this.lz);
        }
    }

    public void L(MouseEvent mouseEvent) {
        if (mouseEvent.getX() >= 212 && mouseEvent.getX() <= 266 && mouseEvent.getY() >= 183 && mouseEvent.getY() <= 200) {
            C0021aw.b.a(C0028g.a);
            this.O.h();
            a((byte) 32, (Object) null);
        } else if (mouseEvent.getX() >= 212 && mouseEvent.getX() <= 266 && mouseEvent.getY() >= 321 && mouseEvent.getY() <= 338) {
            C0021aw.b.a(C0028g.a);
            this.O.h();
            a((byte) 31, (Object) null);
        } else if (mouseEvent.getX() <= this.lB || mouseEvent.getX() >= this.lB + this.lD || mouseEvent.getY() <= this.lC || mouseEvent.getY() >= this.lC + this.lE) {
        } else {
            C0021aw.b.a(C0028g.a);
            this.O.h();
            b((byte) 0, (Object) null);
            this.qm = (byte) 5;
        }
    }

    public void M(MouseEvent mouseEvent) {
        this.lA = -1;
        if (mouseEvent.getX() >= 212 && mouseEvent.getX() <= 266 && mouseEvent.getY() >= 183 && mouseEvent.getY() <= 200) {
            this.lA = 1;
            this.ly = 212;
            this.lz = 183;
        } else if (mouseEvent.getX() >= 212 && mouseEvent.getX() <= 266 && mouseEvent.getY() >= 321 && mouseEvent.getY() <= 338) {
            this.lA = 1;
            this.ly = 212;
            this.lz = 321;
        } else if (mouseEvent.getX() <= this.lB || mouseEvent.getX() >= this.lB + this.lD || mouseEvent.getY() <= this.lC || mouseEvent.getY() >= this.lC + this.lE) {
        } else {
            this.lA = 0;
            this.ly = this.lB;
            this.lz = this.lC;
        }
    }

    public void N(MouseEvent mouseEvent) {
    }

    public void O(MouseEvent mouseEvent) {
    }

    public void P(MouseEvent mouseEvent) {
    }

    public void d(C0001aa c0001aa, long j) {
        int b;
        if (this.lF == null || (b = this.lF.b(c0001aa, j)) == 31 || b == 0) {
            return;
        }
        C0021aw.b.a(C0028g.a);
        this.O.h();
        if (b != 5) {
            a((byte) b, (Object) null);
            return;
        }
        b((byte) 0, (Object) null);
        this.qm = (byte) 5;
    }

    public void Q(MouseEvent mouseEvent) {
        this.lF.a(mouseEvent);
    }

    public void R(MouseEvent mouseEvent) {
        this.lF.b(mouseEvent);
    }

    public void S(MouseEvent mouseEvent) {
        this.lF.c(mouseEvent);
    }

    public void T(MouseEvent mouseEvent) {
        this.lF.e(mouseEvent);
    }

    public void U(MouseEvent mouseEvent) {
        this.lF.d(mouseEvent);
    }

    public void d(String[] strArr) {
        this.lF.a(strArr);
    }

    public void m(Object obj) {
        this.lF = new C0010aj(this);
        this.lF.a(this.ur, System.currentTimeMillis());
    }

    public void m(Graphics graphics) {
        this.lF.a(graphics, pS);
    }

    public void e(C0001aa c0001aa, long j) {
        int b;
        if (this.lG == null || (b = this.lG.b(c0001aa, j)) == 32 || b == 0) {
            return;
        }
        C0021aw.b.a(C0028g.a);
        this.O.h();
        if (b != 5) {
            a((byte) b, (Object) null);
            return;
        }
        b((byte) 0, (Object) null);
        this.qm = (byte) 5;
    }

    public void V(MouseEvent mouseEvent) {
        this.lG.a(mouseEvent);
    }

    public void W(MouseEvent mouseEvent) {
        this.lG.b(mouseEvent);
    }

    public void X(MouseEvent mouseEvent) {
        this.lG.c(mouseEvent);
    }

    public void Y(MouseEvent mouseEvent) {
        this.lG.e(mouseEvent);
    }

    public void Z(MouseEvent mouseEvent) {
        this.lG.d(mouseEvent);
    }

    public void e(String[] strArr) {
        this.lG.a(strArr);
    }

    public void n(Object obj) {
        this.lG = new C0043x(this);
        this.lG.a(this.ur, System.currentTimeMillis());
    }

    public void n(Graphics graphics) {
        this.lG.a(graphics, pS);
    }

    public void o(Object obj) {
        this.lH = new C0024c(this);
        this.lH.a(this.ur, System.currentTimeMillis());
    }

    public void o(Graphics graphics) {
        this.lH.a(graphics, pS);
    }

    public void f(C0001aa c0001aa, long j) {
        int b;
        if (this.lH == null || (b = this.lH.b(c0001aa, j)) == 17 || b == 0) {
            return;
        }
        C0021aw.b.a(C0028g.a);
        this.O.h();
        C0032k.a("changing state from cafe: " + b);
        if (b == 5) {
            b((byte) 0, (Object) null);
        } else {
            a((byte) b, (Object) null);
        }
        this.lH.a((byte) 0);
    }

    public void aa(MouseEvent mouseEvent) {
        this.lH.a(mouseEvent);
    }

    public void ab(MouseEvent mouseEvent) {
        this.lH.b(mouseEvent);
    }

    public void ac(MouseEvent mouseEvent) {
        this.lH.c(mouseEvent);
    }

    public void ad(MouseEvent mouseEvent) {
        this.lH.e(mouseEvent);
    }

    public void ae(MouseEvent mouseEvent) {
        this.lH.d(mouseEvent);
    }

    public void f(String[] strArr) {
        this.lH.a(strArr);
    }

    public void p(Object obj) {
        this.lJ = new aJ(this);
        this.lJ.a(this.ur, System.currentTimeMillis());
    }

    public void p(Graphics graphics) {
        this.lJ.a(graphics, pS);
    }

    public void g(C0001aa c0001aa, long j) {
        int b;
        if (this.lJ == null || (b = this.lJ.b(c0001aa, j)) == 20 || b == 0) {
            return;
        }
        C0021aw.b.a(C0028g.a);
        this.O.h();
        C0032k.a("changing state from stadium: " + b);
        if (b != 5) {
            a((byte) b, (Object) null);
            return;
        }
        b((byte) 0, (Object) null);
        this.qm = (byte) 5;
    }

    public void af(MouseEvent mouseEvent) {
        this.lJ.a(mouseEvent);
    }

    public void ag(MouseEvent mouseEvent) {
        this.lJ.b(mouseEvent);
    }

    public void ah(MouseEvent mouseEvent) {
        this.lJ.c(mouseEvent);
    }

    public void ai(MouseEvent mouseEvent) {
        this.lJ.d(mouseEvent);
    }

    public void aj(MouseEvent mouseEvent) {
        this.lJ.e(mouseEvent);
    }

    public void g(String[] strArr) {
        this.lJ.a(strArr);
    }

    public void q(Object obj) {
        this.lW = 1;
        this.lX = 0;
        this.lY = 0;
        this.lL = new Icon[4][3];
        this.lL[0][0] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1112)));
        this.lL[0][1] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1113)));
        this.lL[0][2] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1114)));
        this.lL[2][0] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1115)));
        this.lL[2][1] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1116)));
        this.lL[2][2] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1117)));
        this.lL[1][0] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1118)));
        this.lL[1][1] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1119)));
        this.lL[1][2] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1120)));
        this.lL[3][0] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1121)));
        this.lL[3][1] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1122)));
        this.lL[3][2] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1123)));
        this.lK = new Icon[4][3];
        this.lK[0][0] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1124)));
        this.lK[0][1] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1125)));
        this.lK[0][2] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1126)));
        this.lK[2][0] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1127)));
        this.lK[2][1] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1128)));
        this.lK[2][2] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1129)));
        this.lK[1][0] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1130)));
        this.lK[1][1] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1131)));
        this.lK[1][2] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1132)));
        this.lK[3][0] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1133)));
        this.lK[3][1] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1134)));
        this.lK[3][2] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1135)));
        this.lM = new int[4];
        this.lM[0] = this.pW.b("en", 1136);
        this.lM[2] = this.pW.b("en", 1137);
        this.lM[1] = this.pW.b("en", 1138);
        this.lM[3] = this.pW.b("en", 1139);
        this.lN = new int[4];
        this.lN[0] = this.pW.b("en", 1140);
        this.lN[2] = this.pW.b("en", 1141);
        this.lN[1] = this.pW.b("en", 1142);
        this.lN[3] = this.pW.b("en", 1143);
        this.lO = new int[4];
        this.lO[0] = this.pW.b("en", 1144);
        this.lO[2] = this.pW.b("en", 1145);
        this.lO[1] = this.pW.b("en", 1146);
        this.lO[3] = this.pW.b("en", 1147);
        this.lP = new int[4];
        this.lP[0] = this.pW.b("en", 1148);
        this.lP[2] = this.pW.b("en", 1149);
        this.lP[1] = this.pW.b("en", 1150);
        this.lP[3] = this.pW.b("en", 1151);
        this.lQ = 400;
        this.lR = 234;
        this.lU = 0;
        this.mC = false;
        this.mD = false;
        this.mE = false;
        this.lZ = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1076)));
        this.mb = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1077)));
        this.mc = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1078)));
        this.ma = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1079)));
        this.md = new Icon[2];
        this.md[0] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1080)));
        this.md[1] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1081)));
        this.mw = -1;
        this.mg = this.pW.b("en", 1082);
        this.mh = this.pW.b("en", 1083);
        this.mi = this.pW.b("en", 1084);
        this.mj = this.pW.b("en", 1085);
        this.mk = this.pW.b("en", 1086);
        this.ml = this.pW.b("en", 1243);
        this.me = this.pW.b("en", 1087);
        this.mf = this.pW.b("en", 1088);
        this.mm = this.pW.b("en", 1089);
        this.mn = this.pW.b("en", 1090);
        this.mo = this.pW.b("en", 1091);
        this.mp = this.pW.b("en", 1092);
        this.mq = this.pW.b("en", 1093);
        this.mr = this.pW.b("en", 1094);
        this.ms = new int[2];
        this.ms[0] = this.pW.b("en", 1095);
        this.ms[1] = this.pW.b("en", 1096);
        this.mt = new int[3];
        this.mt[0] = this.pW.b("en", 1097);
        this.mt[1] = this.pW.b("en", 1098);
        this.mt[2] = this.pW.b("en", 1099);
        this.mu = this.pW.b("en", 1110);
        this.mv = this.pW.b("en", 1111);
        this.mx = new int[3];
        this.mx[0] = this.pW.b("en", 1104);
        this.mx[1] = this.pW.b("en", 1105);
        this.mx[2] = this.pW.b("en", 1106);
        this.my = this.pW.b("en", 1107);
        this.mz = this.pW.b("en", 1108);
        this.mA = this.pW.b("en", 1109);
        this.mG = new Icon[2];
        this.mG[1] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1217)));
        this.mG[0] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1218)));
        this.mJ = -1;
        this.mH = 0;
        this.mI = 0;
        this.mB = new JTextField();
        this.mB.setBounds(this.pW.b("en", 1100), this.pW.b("en", 1101), this.pW.b("en", 1102), this.pW.b("en", 1103));
        this.mB.setBackground(new Color(5338761));
        this.mB.setBorder(BorderFactory.createLineBorder(new Color(5338761)));
        this.mB.setForeground(new Color(8838126));
        this.mB.setSelectedTextColor(new Color(4810614));
        this.mB.setSelectionColor(new Color(6591140));
        this.mB.setCaretColor(new Color(8838126));
        pS.add(this.mB);
        this.mB.requestFocus();
        this.mB.getDocument().addDocumentListener(new aW(this));
        this.mB.addActionListener(new aC(this));
    }

    public void q(Graphics graphics) {
        y(graphics);
        this.ma.paintIcon(pS, graphics, this.me, this.mf);
        this.lL[this.lW - 1][this.lY].paintIcon(pS, graphics, this.lQ - this.lM[this.lW - 1], this.lR - this.lN[this.lW - 1]);
        this.lK[this.lW - 1][this.lX].paintIcon(pS, graphics, this.lQ - this.lO[this.lW - 1], this.lR - this.lP[this.lW - 1]);
        graphics.setColor(new Color(12711676));
        MastersOfDestiny mastersOfDestiny = pS;
        graphics.setFont(MastersOfDestiny.ae);
        graphics.drawString(this.lS[this.lW - 1], 397, 358);
        graphics.drawString(sm + (this.lX + 1), 419, 384);
        graphics.drawString(sm + (this.lY + 1), 419, 411);
        if (this.mC) {
            this.lZ.paintIcon(pS, graphics, this.mg, this.mh);
        }
        if (!this.mD && !this.mE && this.mw != -1) {
            this.md[0].paintIcon(pS, graphics, this.ms[0], this.mt[this.mw]);
            this.md[1].paintIcon(pS, graphics, this.ms[1], this.mt[this.mw]);
        }
        if (this.mD) {
            this.mc.paintIcon(pS, graphics, this.mm, this.mn);
            graphics.setColor(new Color(12711676));
            MastersOfDestiny mastersOfDestiny2 = pS;
            graphics.setFont(MastersOfDestiny.U);
            graphics.drawString(this.lT[this.lU], 264, 240);
        }
        if (this.mE) {
            this.mb.paintIcon(pS, graphics, this.mm, this.mn);
            graphics.setColor(new Color(12711676));
            MastersOfDestiny mastersOfDestiny3 = pS;
            graphics.setFont(MastersOfDestiny.Y);
            graphics.drawString("Processing your request, please wait...", 264, 254);
        }
        if (this.mJ != -1) {
            this.mG[this.mJ].paintIcon(pS, graphics, this.mH, this.mI);
        }
    }

    public void ak(MouseEvent mouseEvent) {
        if (this.mD && mouseEvent.getX() >= this.mo && mouseEvent.getX() <= this.mo + this.mq && mouseEvent.getY() >= this.mp && mouseEvent.getY() <= this.mp + this.mr) {
            C0021aw.b.a(C0028g.a);
            this.mJ = -1;
            this.mD = false;
            if (this.lU == 0) {
                pS.remove(this.mB);
                a((byte) 2, (Object) null);
            }
        } else if (this.mD || this.mE) {
        } else {
            if (mouseEvent.getX() >= this.ms[0] && mouseEvent.getX() <= this.ms[0] + this.mu && mouseEvent.getY() >= this.mt[0] && mouseEvent.getY() <= this.mt[0] + this.mv) {
                if (this.lW > 1) {
                    this.lW--;
                }
            } else if (mouseEvent.getX() >= this.ms[1] && mouseEvent.getX() <= this.ms[1] + this.mu && mouseEvent.getY() >= this.mt[0] && mouseEvent.getY() <= this.mt[0] + this.mv) {
                if (this.lW < 4) {
                    this.lW++;
                }
            } else if (mouseEvent.getX() >= this.ms[0] && mouseEvent.getX() <= this.ms[0] + this.mu && mouseEvent.getY() >= this.mt[1] && mouseEvent.getY() <= this.mt[1] + this.mv) {
                if (this.lX > 0) {
                    this.lX--;
                }
            } else if (mouseEvent.getX() >= this.ms[1] && mouseEvent.getX() <= this.ms[1] + this.mu && mouseEvent.getY() >= this.mt[1] && mouseEvent.getY() <= this.mt[1] + this.mv) {
                if (this.lX < 2) {
                    this.lX++;
                }
            } else if (mouseEvent.getX() >= this.ms[0] && mouseEvent.getX() <= this.ms[0] + this.mu && mouseEvent.getY() >= this.mt[2] && mouseEvent.getY() <= this.mt[2] + this.mv) {
                if (this.lY > 0) {
                    this.lY--;
                }
            } else if (mouseEvent.getX() >= this.ms[1] && mouseEvent.getX() <= this.ms[1] + this.mu && mouseEvent.getY() >= this.mt[2] && mouseEvent.getY() <= this.mt[2] + this.mv) {
                if (this.lY < 2) {
                    this.lY++;
                }
            } else if (mouseEvent.getX() >= this.mk && mouseEvent.getX() <= this.mk + this.mi && mouseEvent.getY() >= this.mh && mouseEvent.getY() <= this.mh + this.mj) {
                C0021aw.b.a(C0028g.b);
                this.mB.setText(sm);
                this.lW = 1;
                this.lX = 0;
                this.lY = 0;
            } else if (!this.mC || mouseEvent.getX() < this.mg || mouseEvent.getX() > this.mg + this.mi || mouseEvent.getY() < this.mh || mouseEvent.getY() > this.mh + this.mj) {
                if (mouseEvent.getX() < this.ml || mouseEvent.getX() > this.ml + this.mi || mouseEvent.getY() < this.mh || mouseEvent.getY() > this.mh + this.mj) {
                    return;
                }
                C0021aw.b.a(C0028g.b);
                this.mJ = -1;
                pS.remove(this.mB);
                a((byte) 2, (Object) null);
                pS.repaint();
            } else {
                C0021aw.b.a(C0028g.a);
                this.mC = false;
                this.mJ = -1;
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= this.mB.getText().length()) {
                        break;
                    } else if (this.mB.getText().substring(i, i + 1).equals(" ")) {
                        this.lU = 3;
                        this.mE = false;
                        this.mD = true;
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    return;
                }
                this.mE = true;
                this.pe.write("P1|" + this.mB.getText() + "|" + this.lW + "|" + this.lY + "|" + this.lX + "\n");
                this.pe.flush();
                C0032k.a("sent create char request P1|" + this.mB.getText() + "|" + this.lW + "|" + this.lY + "|" + this.lX);
            }
        }
    }

    public void al(MouseEvent mouseEvent) {
        this.mw = -1;
        this.mJ = -1;
        if (!this.mD && !this.mE) {
            for (int i = 0; i < this.mx.length; i++) {
                if (mouseEvent.getX() >= this.my && mouseEvent.getX() <= this.my + this.mz && mouseEvent.getY() >= this.mx[i] && mouseEvent.getY() <= this.mx[i] + this.mA) {
                    C0032k.a("test in line " + i);
                    this.mw = i;
                    return;
                }
            }
            if (mouseEvent.getX() >= this.mg && mouseEvent.getX() <= this.mg + this.mi && mouseEvent.getY() >= this.mh && mouseEvent.getY() <= this.mh + this.mj && this.mC) {
                this.mJ = 0;
                this.mH = this.mg;
                this.mI = this.mh;
                return;
            } else if (mouseEvent.getX() >= this.mk && mouseEvent.getX() <= this.mk + this.mi && mouseEvent.getY() >= this.mh && mouseEvent.getY() <= this.mh + this.mj) {
                this.mJ = 0;
                this.mH = this.mk;
                this.mI = this.mh;
                return;
            } else if (mouseEvent.getX() >= this.ml && mouseEvent.getX() <= this.ml + this.mi && mouseEvent.getY() >= this.mh && mouseEvent.getY() <= this.mh + this.mj) {
                this.mJ = 0;
                this.mH = this.ml;
                this.mI = this.mh;
                return;
            }
        }
        if (!this.mD || mouseEvent.getX() < this.mo || mouseEvent.getX() > this.mo + this.mq || mouseEvent.getY() < this.mp || mouseEvent.getY() > this.mp + this.mr) {
            return;
        }
        this.mJ = 1;
        this.mH = this.mo;
        this.mI = this.mp;
    }

    public void f(KeyEvent keyEvent) {
        if (this.mC) {
            switch (keyEvent.getKeyCode()) {
                case 10:
                    this.mC = false;
                    this.mJ = -1;
                    this.mE = true;
                    this.pe.write("P1|" + this.mB.getText() + "|" + this.lW + "|" + this.lY + "|" + this.lX + "\n");
                    this.pe.flush();
                    return;
                default:
                    return;
            }
        }
    }

    public void r(Object obj) {
        this.ny = false;
        this.nz = false;
        this.nA = false;
        this.mK = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1033)));
        this.mL = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1034)));
        this.mM = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1035)));
        this.mN = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1036)));
        this.mO = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1068)));
        this.mQ = 0;
        this.nD = -1;
        this.nC = new Icon[2];
        this.nC[0] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1217)));
        this.nC[1] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1218)));
        this.nE = 0;
        this.nF = 0;
        this.mU = new JTextField();
        this.mU.setBounds(this.pW.b("en", 1037), this.pW.b("en", 1038), this.pW.b("en", 1039), this.pW.b("en", 1040));
        this.mU.setBackground(new Color(5338761));
        this.mU.setBorder(BorderFactory.createLineBorder(new Color(5338761)));
        this.mU.setForeground(new Color(8838126));
        this.mU.setSelectedTextColor(new Color(4810614));
        this.mU.setSelectionColor(new Color(6591140));
        this.mU.setCaretColor(new Color(8838126));
        pS.add(this.mU);
        this.mU.getDocument().addDocumentListener(new C0033l(this));
        this.mU.addActionListener(new E(this));
        this.mR = new JTextField();
        this.mR.setBounds(this.pW.b("en", 1037), this.pW.b("en", 1041), this.pW.b("en", 1039), this.pW.b("en", 1040));
        this.mR.setBackground(new Color(5338761));
        this.mR.setBorder(BorderFactory.createLineBorder(new Color(5338761)));
        this.mR.setForeground(new Color(8838126));
        this.mR.setSelectedTextColor(new Color(4810614));
        this.mR.setSelectionColor(new Color(6591140));
        this.mR.setCaretColor(new Color(8838126));
        pS.add(this.mR);
        this.mR.requestFocus();
        this.mR.getDocument().addDocumentListener(new M(this));
        this.mR.addActionListener(new C0017as(this));
        this.mS = new JTextField();
        this.mS.setBounds(this.pW.b("en", 1037), this.pW.b("en", 1042), this.pW.b("en", 1039), this.pW.b("en", 1040));
        this.mS.setBackground(new Color(5338761));
        this.mS.setBorder(BorderFactory.createLineBorder(new Color(5338761)));
        this.mS.setForeground(new Color(8838126));
        this.mS.setSelectedTextColor(new Color(4810614));
        this.mS.setSelectionColor(new Color(6591140));
        this.mS.setCaretColor(new Color(8838126));
        pS.add(this.mS);
        this.mS.getDocument().addDocumentListener(new F(this));
        this.mS.addActionListener(new R(this));
        this.mT = new JTextField();
        this.mT.setBounds(this.pW.b("en", 1037), this.pW.b("en", 1043), this.pW.b("en", 1039), this.pW.b("en", 1040));
        this.mT.setBackground(new Color(5338761));
        this.mT.setBorder(BorderFactory.createLineBorder(new Color(5338761)));
        this.mT.setForeground(new Color(8838126));
        this.mT.setSelectedTextColor(new Color(4810614));
        this.mT.setSelectionColor(new Color(6591140));
        this.mT.setCaretColor(new Color(8838126));
        pS.add(this.mT);
        this.mT.getDocument().addDocumentListener(new aR(this));
        this.mT.addActionListener(new ay(this));
        this.mV = new JPasswordField();
        this.mV.setBounds(this.pW.b("en", 1037), this.pW.b("en", 1044), this.pW.b("en", 1039), this.pW.b("en", 1040));
        this.mV.setBackground(new Color(5338761));
        this.mV.setBorder(BorderFactory.createLineBorder(new Color(5338761)));
        this.mV.setForeground(new Color(8838126));
        this.mV.setSelectedTextColor(new Color(4810614));
        this.mV.setSelectionColor(new Color(6591140));
        this.mV.setCaretColor(new Color(8838126));
        pS.add(this.mV);
        this.mV.getDocument().addDocumentListener(new aK(this));
        this.mV.addActionListener(new Z(this));
        this.mW = new JPasswordField();
        this.mW.setBounds(this.pW.b("en", 1037), this.pW.b("en", 1045), this.pW.b("en", 1039), this.pW.b("en", 1040));
        this.mW.setBackground(new Color(5338761));
        this.mW.setBorder(BorderFactory.createLineBorder(new Color(5338761)));
        this.mW.setForeground(new Color(8838126));
        this.mW.setSelectedTextColor(new Color(4810614));
        this.mW.setSelectionColor(new Color(6591140));
        this.mW.setCaretColor(new Color(8838126));
        pS.add(this.mW);
        this.mW.getDocument().addDocumentListener(new C0023b(this));
        this.mW.addActionListener(new C0034m(this));
        this.mX = this.pW.b("en", 1046);
        this.mY = this.pW.b("en", 1047);
        this.mZ = this.pW.b("en", 1048);
        this.na = this.pW.b("en", 1049);
        this.nb = this.pW.b("en", 1239);
        this.nc = this.pW.b("en", 1240);
        this.nd = this.pW.b("en", 1241);
        this.ne = this.pW.b("en", 1242);
        this.nh = this.pW.b("en", 1050);
        this.ni = this.pW.b("en", 1051);
        this.nj = this.pW.b("en", 1052);
        this.nk = this.pW.b("en", 1053);
        this.nf = this.pW.b("en", 1054);
        this.ng = this.pW.b("en", 1055);
        this.nl = this.pW.b("en", 1056);
        this.nm = this.pW.b("en", 1057);
        this.nn = this.pW.b("en", 1058);
        this.no = this.pW.b("en", 1059);
        this.np = this.pW.b("en", 1060);
        this.nq = this.pW.b("en", 1061);
        this.nr = this.pW.b("en", 1062);
        this.ns = this.pW.b("en", 1063);
        this.nt = this.pW.b("en", 1064);
        this.nu = this.pW.b("en", 1065);
        this.nv = this.pW.b("en", 1066);
        this.nw = this.pW.b("en", 1067);
    }

    public void r(Graphics graphics) {
        y(graphics);
        this.mK.paintIcon(pS, graphics, this.nv, this.nw);
        if (this.nz) {
            this.mM.paintIcon(pS, graphics, this.mX, this.mY);
        }
        if (this.ny) {
            this.mL.paintIcon(pS, graphics, this.nf, this.ng);
        }
        if (this.nB) {
            this.mO.paintIcon(pS, graphics, this.nt, this.nu);
            graphics.setColor(new Color(12711676));
            MastersOfDestiny mastersOfDestiny = pS;
            graphics.setFont(MastersOfDestiny.Y);
            graphics.drawString("Processing your request, please wait...", 260, 260);
        }
        if (this.nA) {
            this.mN.paintIcon(pS, graphics, this.nt, this.nu);
            graphics.setColor(new Color(12711676));
            MastersOfDestiny mastersOfDestiny2 = pS;
            graphics.setFont(MastersOfDestiny.U);
            graphics.drawString(mP[this.mQ], 254, 250);
        }
        if (this.nD != -1) {
            this.nC[this.nD].paintIcon(pS, graphics, this.nE, this.nF);
        }
    }

    public void am(MouseEvent mouseEvent) {
        this.nD = -1;
        if (!this.ny && !this.nA) {
            if (mouseEvent.getX() >= this.nb && mouseEvent.getX() <= this.nb + this.nd && mouseEvent.getY() >= this.nc && mouseEvent.getY() <= this.nc + this.ne) {
                C0021aw.b.a(C0028g.c);
                this.nD = 1;
                this.nE = this.nb;
                this.nF = this.nc;
                return;
            } else if (this.nz && mouseEvent.getX() >= this.mX && mouseEvent.getX() <= this.mX + this.mZ && mouseEvent.getY() >= this.mY && mouseEvent.getY() <= this.mY + this.na) {
                C0021aw.b.a(C0028g.c);
                this.nD = 0;
                this.nE = this.mX;
                this.nF = this.mY;
                return;
            }
        }
        if (this.ny) {
            if (mouseEvent.getX() >= this.nh && mouseEvent.getX() <= this.nh + this.nj && mouseEvent.getY() >= this.ni && mouseEvent.getY() <= this.ni + this.nk) {
                C0021aw.b.a(C0028g.c);
                this.nD = 0;
                this.nE = this.nh;
                this.nF = this.ni;
                return;
            } else if (mouseEvent.getX() >= this.nl && mouseEvent.getX() <= this.nl + this.nn && mouseEvent.getY() >= this.nm && mouseEvent.getY() <= this.nm + this.no) {
                C0021aw.b.a(C0028g.c);
                this.nD = 0;
                this.nE = this.nl;
                this.nF = this.nm;
                return;
            }
        }
        if (!this.nA || mouseEvent.getX() < this.np || mouseEvent.getX() > this.np + this.nr || mouseEvent.getY() < this.nq || mouseEvent.getY() > this.nq + this.ns) {
            return;
        }
        C0021aw.b.a(C0028g.c);
        this.nD = 0;
        this.nE = this.np;
        this.nF = this.nq;
    }

    public void an(MouseEvent mouseEvent) {
        if (!this.ny && !this.nA) {
            if (this.nz && mouseEvent.getX() >= this.mX && mouseEvent.getX() <= this.mX + this.mZ && mouseEvent.getY() >= this.mY && mouseEvent.getY() <= this.mY + this.na) {
                C0021aw.b.a(C0028g.a);
                this.nz = false;
                this.ny = true;
                this.nD = -1;
                return;
            } else if (mouseEvent.getX() >= this.nb && mouseEvent.getX() <= this.nb + this.nd && mouseEvent.getY() >= this.nc && mouseEvent.getY() <= this.nc + this.ne) {
                this.nD = -1;
                C0021aw.b.a(C0028g.b);
                pS.remove(this.mR);
                pS.remove(this.mS);
                pS.remove(this.mT);
                pS.remove(this.mU);
                pS.remove(this.mV);
                pS.remove(this.mW);
                a((byte) 8, (Object) null);
                pS.repaint();
                return;
            }
        }
        if (this.ny) {
            if (mouseEvent.getX() >= this.nh && mouseEvent.getX() <= this.nh + this.nj && mouseEvent.getY() >= this.ni && mouseEvent.getY() <= this.ni + this.nk) {
                C0021aw.b.a(C0028g.a);
                this.ny = false;
                this.nD = -1;
                if (this.mV.getText().equals(this.mW.getText()) && this.mV.getText().length() <= 10 && this.mU.getText().length() <= 10) {
                    this.nz = false;
                    this.nB = true;
                    g();
                    return;
                } else if (this.mU.getText().length() > 10) {
                    this.mQ = 5;
                    this.nA = true;
                    return;
                } else if (this.mV.getText().length() > 10) {
                    this.mQ = 6;
                    this.nA = true;
                    return;
                } else if (this.mV.getText().equals(this.mW.getText())) {
                    return;
                } else {
                    this.mQ = 7;
                    this.nA = true;
                    return;
                }
            } else if (mouseEvent.getX() >= this.nl && mouseEvent.getX() <= this.nl + this.nn && mouseEvent.getY() >= this.nm && mouseEvent.getY() <= this.nm + this.no) {
                C0021aw.b.a(C0028g.b);
                this.ny = false;
                this.nz = true;
                this.nD = -1;
                return;
            }
        }
        if (!this.nA || mouseEvent.getX() < this.np || mouseEvent.getX() > this.np + this.nr || mouseEvent.getY() < this.nq || mouseEvent.getY() > this.nq + this.ns) {
            return;
        }
        this.nA = false;
        this.nD = -1;
        C0021aw.b.a(C0028g.a);
        if (this.mQ != 0) {
            this.nz = true;
            return;
        }
        pS.remove(this.mR);
        pS.remove(this.mS);
        pS.remove(this.mT);
        pS.remove(this.mU);
        pS.remove(this.mV);
        pS.remove(this.mW);
        a((byte) 10, (Object) null);
    }

    public void g(KeyEvent keyEvent) {
        if (this.nz) {
            switch (keyEvent.getKeyCode()) {
                case 10:
                    this.nz = false;
                    this.ny = true;
                    this.nD = -1;
                    return;
                default:
                    return;
            }
        }
    }

    public void s(Object obj) {
        this.g = this.pW.d("en", 0);
        this.oD = true;
        this.pk = false;
        pS.removeAll();
        this.nG = new ImageIcon(getClass().getResource(this.pW.d("en", 0) + this.pW.d("en", 144)));
        this.nH = new int[5];
        this.nH[0] = this.pW.b("en", 147);
        this.nH[1] = this.pW.b("en", 149);
        this.nH[2] = this.pW.b("en", 151);
        this.nH[3] = this.pW.b("en", 153);
        this.nH[4] = this.pW.b("en", 155);
        this.nI = new int[5];
        this.nI[0] = this.pW.b("en", 148);
        this.nI[1] = this.pW.b("en", 150);
        this.nI[2] = this.pW.b("en", 152);
        this.nI[3] = this.pW.b("en", 154);
        this.nI[4] = this.pW.b("en", 156);
        this.nJ = this.pW.b("en", 157);
        this.nK = this.pW.b("en", 158);
        this.nZ = new ImageIcon(getClass().getResource(this.pW.d("en", 0) + this.pW.d("en", 159)));
        this.mc = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1078)));
        this.mm = this.pW.b("en", 1089);
        this.mn = this.pW.b("en", 1090);
        this.mo = this.pW.b("en", 1091);
        this.mp = this.pW.b("en", 1092);
        this.mq = this.pW.b("en", 1093);
        this.mr = this.pW.b("en", 1094);
        this.mD = false;
        this.ox = this.pW.b("en", 173);
        this.oy = this.pW.b("en", 174);
        this.oz = this.pW.b("en", 177);
        this.oA = this.pW.b("en", 178);
        this.oB = this.pW.b("en", 175);
        this.oC = this.pW.b("en", 1244);
        this.oE = false;
        this.oF = new ImageIcon(getClass().getResource(this.pW.d("en", 0) + this.pW.d("en", 1367)));
        this.oG = this.pW.b("en", 1368);
        this.oH = this.pW.b("en", 1369);
        this.oa = new Icon[5][5];
        this.ob = new int[5];
        this.oc = new int[5];
        this.od = new int[5];
        this.oe = new Icon[5][5];
        this.of = new int[5];
        this.og = new int[5];
        this.oh = new int[5];
        this.qW[0] = 0;
        this.qW[1] = 0;
        this.qW[2] = 0;
        this.qW[3] = 0;
        this.qW[4] = 0;
        this.oi = new int[5];
        this.oi[0] = 0;
        this.oi[1] = 0;
        this.oi[2] = 0;
        this.oi[3] = 0;
        this.oi[4] = 0;
        this.oj = new int[5];
        this.on = new ImageIcon(getClass().getResource(this.pW.d("en", 0) + this.pW.d("en", 172)));
        this.ot = new Icon[2];
        this.ot[0] = new ImageIcon(getClass().getResource(this.pW.d("en", 0) + this.pW.d("en", 1218)));
        this.ot[1] = new ImageIcon(getClass().getResource(this.pW.d("en", 0) + this.pW.d("en", 1217)));
        this.ow = -1;
        this.ou = 0;
        this.ov = 0;
        this.nL = new JLabel[5];
        this.nL[0] = new JLabel();
        this.nL[0].setOpaque(false);
        this.nL[0].setFocusable(false);
        this.nL[0].setBounds(this.pW.b("en", 160) - 52, this.pW.b("en", 161) - 61, this.pW.b("en", 170), this.pW.b("en", 171));
        this.nL[0].setForeground(new Color(8838126));
        this.nL[0].setFont(new Font((String) null, 1, 12));
        this.nL[0].setHorizontalAlignment(0);
        this.nL[0].setVerticalAlignment(0);
        pS.add(this.nL[0]);
        this.nL[1] = new JLabel();
        this.nL[1].setOpaque(false);
        this.nL[1].setFocusable(false);
        this.nL[1].setBounds(this.pW.b("en", 162) - 52, this.pW.b("en", 163) - 61, this.pW.b("en", 170), this.pW.b("en", 171));
        this.nL[1].setForeground(new Color(8838126));
        this.nL[1].setFont(new Font((String) null, 1, 12));
        this.nL[1].setHorizontalAlignment(0);
        this.nL[1].setVerticalAlignment(0);
        pS.add(this.nL[1]);
        this.nL[2] = new JLabel();
        this.nL[2].setOpaque(false);
        this.nL[2].setFocusable(false);
        this.nL[2].setBounds(this.pW.b("en", 164) - 52, this.pW.b("en", 165) - 61, this.pW.b("en", 170), this.pW.b("en", 171));
        this.nL[2].setForeground(new Color(8838126));
        this.nL[2].setFont(new Font((String) null, 1, 12));
        this.nL[2].setHorizontalAlignment(0);
        this.nL[2].setVerticalAlignment(0);
        pS.add(this.nL[2]);
        this.nL[3] = new JLabel();
        this.nL[3].setOpaque(false);
        this.nL[3].setFocusable(false);
        this.nL[3].setBounds(this.pW.b("en", 166) - 52, this.pW.b("en", 167) - 61, this.pW.b("en", 170), this.pW.b("en", 171));
        this.nL[3].setForeground(new Color(8838126));
        this.nL[3].setFont(new Font((String) null, 1, 12));
        this.nL[3].setHorizontalAlignment(0);
        this.nL[3].setVerticalAlignment(0);
        pS.add(this.nL[3]);
        this.nL[4] = new JLabel();
        this.nL[4].setOpaque(false);
        this.nL[4].setFocusable(false);
        this.nL[4].setBounds(this.pW.b("en", 168) - 52, this.pW.b("en", 169) - 61, this.pW.b("en", 170), this.pW.b("en", 171));
        this.nL[4].setForeground(new Color(8838126));
        this.nL[4].setFont(new Font((String) null, 1, 12));
        this.nL[4].setHorizontalAlignment(0);
        this.nL[4].setVerticalAlignment(0);
        pS.add(this.nL[4]);
        this.oo = new JLabel();
        this.oo.setOpaque(false);
        this.oo.setFocusable(false);
        this.oo.setBackground(new Color(4280407));
        this.oo.setBorder(BorderFactory.createLineBorder(new Color(4280407)));
        this.oo.setBounds(this.pW.b("en", 129), this.pW.b("en", 130), this.pW.b("en", 131), this.pW.b("en", 132));
        this.oo.setForeground(new Color(8838126));
        this.oo.setFont(new Font((String) null, 1, 12));
        this.oo.setHorizontalAlignment(0);
        this.oo.setVerticalAlignment(0);
        pS.add(this.oo);
        this.ra = 0;
        this.op = "Please wait";
        this.oo.setText(this.op);
        this.oq = 0;
        this.pk = false;
        this.or = 100L;
        this.os = System.currentTimeMillis() + this.or;
        this.op = "Requesting for your characters";
        this.oo.setText(this.op);
        this.oq = 0;
        this.pk = false;
        this.pe.write("RC|" + V + "\n");
        this.pe.flush();
        C0032k.a("request for character");
    }

    public void s(Graphics graphics) {
        y(graphics);
        this.nG.paintIcon(pS, graphics, this.pW.b("en", 145), this.pW.b("en", 146));
        if (this.oa[0] == null || this.oa[0][0] == null || this.oe[0][0] == null) {
            this.nZ.paintIcon(pS, graphics, this.nH[0], this.nI[0]);
        } else {
            int i = this.oi[0];
            int i2 = this.oi[0];
            if (this.ok == 0 || this.om == 0) {
                if (this.oh[0] != this.oj[0] && this.oi[0] != 0) {
                    i = this.oi[0] % (this.oh[0] + 1);
                    if (i == 0) {
                        i = 1;
                    }
                }
                if (this.od[0] != this.oj[0] && this.oi[0] != 0) {
                    i2 = ((i2 - 1) % this.od[0]) + 1;
                }
            }
            this.oe[0][i].paintIcon(pS, graphics, (this.nH[0] - 5) + this.of[0], (this.nI[0] - 8) + this.og[0]);
            this.oa[0][i2].paintIcon(pS, graphics, (this.nH[0] - 5) + this.ob[0], (this.nI[0] - 8) + this.oc[0]);
        }
        if (this.oa[1] == null || this.oa[1][0] == null || this.oe[1][0] == null) {
            this.nZ.paintIcon(pS, graphics, this.nH[1], this.nI[1]);
        } else {
            int i3 = this.oi[1];
            int i4 = this.oi[1];
            if (this.ok == 1 || this.om == 1) {
                if (this.oh[1] != this.oj[1] && this.oi[1] != 0) {
                    i3 = this.oi[1] % (this.oh[1] + 1);
                    if (i3 == 0) {
                        i3 = 1;
                    }
                }
                if (this.od[1] != this.oj[1] && this.oi[1] != 0) {
                    i4 = (i4 - 1) % (this.od[1] + 1);
                    if (i4 == 0) {
                        i4 = 1;
                    }
                }
            }
            this.oe[1][i3].paintIcon(pS, graphics, (this.nH[1] - 5) + this.of[1], (this.nI[1] - 8) + this.og[1]);
            this.oa[1][i4].paintIcon(pS, graphics, (this.nH[1] - 5) + this.ob[1], (this.nI[1] - 8) + this.oc[1]);
        }
        if (this.oa[2] == null || this.oa[2][0] == null || this.oe[2][0] == null) {
            this.nZ.paintIcon(pS, graphics, this.nH[2], this.nI[2]);
        } else {
            int i5 = this.oi[2];
            int i6 = this.oi[2];
            if (this.ok == 2 || this.om == 2) {
                if (this.oh[2] != this.oj[2] && this.oi[2] != 0) {
                    i5 = this.oi[2] % (this.oh[2] + 1);
                    if (i5 == 0) {
                        i5 = 1;
                    }
                }
                if (this.od[2] != this.oj[2] && this.oi[2] != 0) {
                    i6 = (i6 - 1) % (this.od[2] + 1);
                    if (i6 == 0) {
                        i6 = 1;
                    }
                }
            }
            this.oe[2][i5].paintIcon(pS, graphics, (this.nH[2] - 5) + this.of[2], (this.nI[2] - 8) + this.og[2]);
            this.oa[2][i6].paintIcon(pS, graphics, (this.nH[2] - 5) + this.ob[2], (this.nI[2] - 8) + this.oc[2]);
        }
        if (this.oa[3] == null || this.oa[3][0] == null || this.oe[3][0] == null) {
            this.nZ.paintIcon(pS, graphics, this.nH[3], this.nI[3]);
        } else {
            int i7 = this.oi[3];
            int i8 = this.oi[3];
            if (this.ok == 3 || this.om == 3) {
                if (this.oh[3] != this.oj[3] && this.oi[3] != 0) {
                    i7 = this.oi[3] % (this.oh[3] + 1);
                    if (i7 == 0) {
                        i7 = 1;
                    }
                }
                if (this.od[3] != this.oj[3] && this.oi[3] != 0) {
                    i8 = (i8 - 1) % (this.od[3] + 1);
                    if (i8 == 0) {
                        i8 = 1;
                    }
                }
            }
            this.oe[3][i7].paintIcon(pS, graphics, (this.nH[3] - 5) + this.of[3], (this.nI[3] - 8) + this.og[3]);
            this.oa[3][i8].paintIcon(pS, graphics, (this.nH[3] - 5) + this.ob[3], (this.nI[3] - 8) + this.oc[3]);
        }
        if (this.oa[4] == null || this.oa[4][0] == null || this.oe[4][0] == null) {
            this.nZ.paintIcon(pS, graphics, this.nH[4], this.nI[4]);
        } else {
            int i9 = this.oi[4];
            int i10 = this.oi[4];
            if (this.ok == 4 || this.om == 4) {
                if (this.oh[4] != this.oj[4] && this.oi[4] != 0) {
                    i9 = this.oi[4] % (this.oh[4] + 1);
                    if (i9 == 0) {
                        i9 = 1;
                    }
                }
                if (this.od[4] != this.oj[4] && this.oi[4] != 0) {
                    i10 = (i10 - 1) % (this.od[4] + 1);
                    if (i10 == 0) {
                        i10 = 1;
                    }
                }
            }
            this.oe[4][i9].paintIcon(pS, graphics, (this.nH[4] - 5) + this.of[4], (this.nI[4] - 8) + this.og[4]);
            this.oa[4][i10].paintIcon(pS, graphics, (this.nH[4] - 5) + this.ob[4], (this.nI[4] - 8) + this.oc[4]);
        }
        if (this.oD) {
            this.ph.paintIcon(pS, graphics, this.pW.b("en", 115), this.pW.b("en", 116));
        } else {
            this.on.paintIcon(pS, graphics, this.nH[this.ok], this.nI[this.ok]);
        }
        if (this.mD) {
            this.mc.paintIcon(pS, graphics, this.mm, this.mn + 280);
            graphics.setColor(new Color(12711676));
            MastersOfDestiny mastersOfDestiny = pS;
            graphics.setFont(MastersOfDestiny.U);
            graphics.drawString(this.lV, 264, 520);
        }
        if (this.oE) {
            this.oF.paintIcon(pS, graphics, this.mm, this.mn + 280);
            graphics.setColor(new Color(12711676));
            MastersOfDestiny mastersOfDestiny2 = pS;
            graphics.setFont(MastersOfDestiny.U);
            graphics.drawString("Confirm to delete this character?", 300, 520);
        }
        if (this.ow != -1) {
            this.ot[this.ow].paintIcon(pS, graphics, this.ou, this.ov);
        }
    }

    public void c() {
        if (System.currentTimeMillis() > this.os) {
            if (this.pk) {
                if (this.oo != null) {
                    this.oo.hide();
                }
                this.oo = null;
                this.pk = false;
                this.ok = 0;
                this.oi[this.ok] = 1;
                this.oD = false;
                return;
            }
            if (this.oo != null) {
                this.oq = (this.oq + 1) % 4;
                if (this.oq != 0) {
                    this.oo.setText(this.oo.getText() + ".");
                } else {
                    this.oo.setText(this.op);
                }
            } else if (!this.oD) {
                if (this.om != -1 && this.om != this.ok && this.oj[this.om] != 0) {
                    this.oi[this.om] = (this.oi[this.om] + 1) % this.oj[this.om];
                    if (this.oi[this.om] == 0) {
                        this.oi[this.om] = 1;
                    }
                }
                if (this.oj[this.ok] != 0) {
                    this.oi[this.ok] = (this.oi[this.ok] + 1) % (this.oj[this.ok] + 1);
                    if (this.oi[this.ok] == 0) {
                        this.oi[this.ok] = 1;
                    }
                }
            }
            this.os += this.or;
        }
    }

    public void ao(MouseEvent mouseEvent) {
        if (this.oo != null) {
            return;
        }
        this.ow = -1;
        if (!this.mD && !this.oD && !this.oE) {
            if (mouseEvent.getX() >= this.ox && mouseEvent.getX() <= this.ox + this.oz && mouseEvent.getY() >= this.oy && mouseEvent.getY() <= this.oy + this.oA) {
                this.ow = 0;
                this.ou = this.ox;
                this.ov = this.oy;
                return;
            } else if (mouseEvent.getX() >= this.oB && mouseEvent.getX() <= this.oB + this.oz && mouseEvent.getY() >= this.oy && mouseEvent.getY() <= this.oy + this.oA) {
                this.ow = 0;
                this.ou = this.oB;
                this.ov = this.oy;
                return;
            } else if (mouseEvent.getX() >= this.oC && mouseEvent.getX() <= this.oC + this.oz && mouseEvent.getY() >= this.oy && mouseEvent.getY() <= this.oy + this.oA) {
                this.ow = 0;
                this.ou = this.oC;
                this.ov = this.oy;
                return;
            }
        }
        if (this.mD && mouseEvent.getX() >= this.mo && mouseEvent.getX() <= this.mo + this.mq && mouseEvent.getY() >= this.mp + 280 && mouseEvent.getY() <= this.mp + this.mr + 280) {
            this.ow = 1;
            this.ou = this.mo;
            this.ov = this.mp + 280;
            return;
        }
        if (this.oE) {
            if (mouseEvent.getX() >= this.oG && mouseEvent.getX() <= this.oG + this.mq && mouseEvent.getY() >= this.mp + 280 && mouseEvent.getY() <= this.mp + this.mr + 280) {
                this.ow = 1;
                this.ou = this.oG;
                this.ov = this.mp + 280;
                return;
            } else if (mouseEvent.getX() >= this.oH && mouseEvent.getX() <= this.oH + this.mq && mouseEvent.getY() >= this.mp + 280 && mouseEvent.getY() <= this.mp + this.mr + 280) {
                this.ow = 1;
                this.ou = this.oH;
                this.ov = this.mp + 280;
                return;
            }
        }
        if (mouseEvent.getX() >= this.nH[0] && mouseEvent.getX() <= this.nH[0] + this.nJ && mouseEvent.getY() >= this.nI[0] && mouseEvent.getY() <= this.nI[0] + this.nK) {
            if (this.om == 0 || this.ra < 0) {
                return;
            }
            C0032k.a("0 charHover = " + this.om);
            if (this.om != -1) {
                this.oi[this.om] = 0;
            }
            this.om = 0;
            this.oi[this.om] = 1;
            C0021aw.b.a(C0028g.c);
        } else if (mouseEvent.getX() >= this.nH[1] && mouseEvent.getX() <= this.nH[1] + this.nJ && mouseEvent.getY() >= this.nI[1] && mouseEvent.getY() <= this.nI[1] + this.nK) {
            if (this.om == 1 || this.ra < 1) {
                return;
            }
            C0032k.a("1 charHover = " + this.om);
            if (this.om != -1) {
                this.oi[this.om] = 0;
            }
            this.om = 1;
            this.oi[this.om] = 1;
            C0021aw.b.a(C0028g.c);
        } else if (mouseEvent.getX() >= this.nH[2] && mouseEvent.getX() <= this.nH[2] + this.nJ && mouseEvent.getY() >= this.nI[2] && mouseEvent.getY() <= this.nI[2] + this.nK) {
            if (this.om == 2 || this.ra < 2) {
                return;
            }
            C0032k.a("2 charHover = " + this.om);
            if (this.om != -1) {
                this.oi[this.om] = 0;
            }
            this.om = 2;
            this.oi[this.om] = 1;
            C0021aw.b.a(C0028g.c);
        } else if (mouseEvent.getX() >= this.nH[3] && mouseEvent.getX() <= this.nH[3] + this.nJ && mouseEvent.getY() >= this.nI[3] && mouseEvent.getY() <= this.nI[3] + this.nK) {
            if (this.om == 3 || this.ra < 3) {
                return;
            }
            C0032k.a("3 charHover = " + this.om);
            if (this.om != -1) {
                this.oi[this.om] = 0;
            }
            this.om = 3;
            this.oi[this.om] = 1;
            C0021aw.b.a(C0028g.c);
        } else if (mouseEvent.getX() < this.nH[4] || mouseEvent.getX() > this.nH[4] + this.nJ || mouseEvent.getY() < this.nI[4] || mouseEvent.getY() > this.nI[4] + this.nK) {
            if (this.om != -1) {
                this.oi[this.om] = 0;
            }
            this.om = -1;
        } else if (this.om == 4 || this.ra < 4) {
        } else {
            C0032k.a("4 charHover = " + this.om);
            if (this.om != -1) {
                this.oi[this.om] = 0;
            }
            this.om = 4;
            this.oi[this.om] = 1;
            C0021aw.b.a(C0028g.c);
        }
    }

    public void a(int i) {
        this.oi[this.ok] = 0;
        this.ok = i;
        this.oi[this.ok] = 1;
        C0021aw.b.a(C0028g.a);
    }

    public void ap(MouseEvent mouseEvent) {
        if (this.oo != null) {
            return;
        }
        if (this.mD) {
            if (mouseEvent.getX() < this.mo || mouseEvent.getX() > this.mo + this.mq || mouseEvent.getY() < this.mp + 280 || mouseEvent.getY() > this.mp + this.mr + 280) {
                return;
            }
            C0021aw.b.a(C0028g.a);
            this.mD = false;
            this.ow = -1;
            return;
        }
        if (this.oE) {
            if (mouseEvent.getX() >= this.oG && mouseEvent.getX() <= this.oG + this.mq && mouseEvent.getY() >= this.mp + 280 && mouseEvent.getY() <= this.mp + this.mr + 280) {
                e();
                this.ow = -1;
                this.oE = false;
                return;
            } else if (mouseEvent.getX() >= this.oH && mouseEvent.getX() <= this.oH + this.mq && mouseEvent.getY() >= this.mp + 280 && mouseEvent.getY() <= this.mp + this.mr + 280) {
                this.ow = -1;
                this.oE = false;
                return;
            }
        }
        if (mouseEvent.getX() >= this.nH[0] && mouseEvent.getX() <= this.nH[0] + this.nJ && mouseEvent.getY() >= this.nI[0] && mouseEvent.getY() <= this.nI[0] + this.nK && this.ra >= 0) {
            a(0);
        }
        if (mouseEvent.getX() >= this.nH[1] && mouseEvent.getX() <= this.nH[1] + this.nJ && mouseEvent.getY() >= this.nI[1] && mouseEvent.getY() <= this.nI[1] + this.nK && this.ra >= 1) {
            a(1);
        }
        if (mouseEvent.getX() >= this.nH[2] && mouseEvent.getX() <= this.nH[2] + this.nJ && mouseEvent.getY() >= this.nI[2] && mouseEvent.getY() <= this.nI[2] + this.nK && this.ra >= 2) {
            a(2);
        }
        if (mouseEvent.getX() >= this.nH[3] && mouseEvent.getX() <= this.nH[3] + this.nJ && mouseEvent.getY() >= this.nI[3] && mouseEvent.getY() <= this.nI[3] + this.nK && this.ra >= 3) {
            a(3);
        }
        if (mouseEvent.getX() >= this.nH[4] && mouseEvent.getX() <= this.nH[4] + this.nJ && mouseEvent.getY() >= this.nI[4] && mouseEvent.getY() <= this.nI[4] + this.nK && this.ra >= 4) {
            a(4);
        }
        if (mouseEvent.getX() >= this.ox && mouseEvent.getX() <= this.ox + this.oz && mouseEvent.getY() >= this.oy && mouseEvent.getY() <= this.oy + this.oA) {
            d();
        } else if (mouseEvent.getX() >= this.oB && mouseEvent.getX() <= this.oB + this.oz && mouseEvent.getY() >= this.oy && mouseEvent.getY() <= this.oy + this.oA) {
            this.oE = true;
            this.ow = -1;
        } else if (mouseEvent.getX() < this.oC || mouseEvent.getX() > this.oC + this.oz || mouseEvent.getY() < this.oy || mouseEvent.getY() > this.oy + this.oA) {
        } else {
            C0021aw.b.a(C0028g.b);
            this.pe.write("RD|" + V + "\n");
            this.pe.flush();
            this.ow = -1;
            pS.remove(this.nL[0]);
            pS.remove(this.nL[1]);
            pS.remove(this.nL[2]);
            pS.remove(this.nL[3]);
            pS.remove(this.nL[4]);
            a((byte) 2, (Object) null);
            pS.repaint();
        }
    }

    public void h(KeyEvent keyEvent) {
        if (this.oo != null) {
            return;
        }
        if (keyEvent.getKeyChar() == 'a' || keyEvent.getKeyChar() == 'd' || keyEvent.getKeyChar() == 'w' || keyEvent.getKeyChar() == 's') {
            a((this.ok + 1) % 5);
            C0021aw.b.a(C0028g.a);
        }
    }

    public void i(KeyEvent keyEvent) {
        if (this.oo != null) {
            return;
        }
        switch (keyEvent.getKeyCode()) {
            case 10:
                d();
                return;
            default:
                return;
        }
    }

    public void d() {
        C0021aw.b.a(C0028g.a);
        this.ow = -1;
        pS.remove(this.nL[0]);
        pS.remove(this.nL[1]);
        pS.remove(this.nL[2]);
        pS.remove(this.nL[3]);
        pS.remove(this.nL[4]);
        oI = Integer.parseInt(this.qU[this.ok]);
        oJ = this.qX[this.ok];
        oK = this.qW[this.ok];
        oL = this.qY[this.ok];
        oM = this.qZ[this.ok];
        C0032k.a("test: char selected = " + this.ok);
        C0032k.a("test: level = " + this.qV[this.ok]);
        this.bZ = this.um.a("group" + oK + ".txt");
        this.pe.write("RS|" + oI + "|" + V + "|" + Y + "\n");
        this.pe.flush();
        a((byte) 26, (Object) null);
    }

    public void e() {
        C0021aw.b.a(C0028g.b);
        this.ow = -1;
        this.ol = this.ok;
        this.pe.write("P4|" + this.qU[this.ok] + "\n");
        this.pe.flush();
        C0032k.a("delete character: " + this.qX[this.ok] + "<" + this.qU[this.ok] + ">");
    }

    public void t(Object obj) {
        for (int i = 0; i < this.oi.length; i++) {
            this.oi[i] = 0;
        }
        this.oo = new JLabel();
        this.oo.setOpaque(false);
        this.oo.setFocusable(false);
        this.oo.setBackground(new Color(4280407));
        this.oo.setBorder(BorderFactory.createLineBorder(new Color(4280407)));
        this.oo.setBounds(this.pW.b("en", 129), this.pW.b("en", 130), this.pW.b("en", 131), this.pW.b("en", 132));
        this.oo.setForeground(new Color(8838126));
        this.oo.setFont(new Font((String) null, 1, 12));
        this.oo.setHorizontalAlignment(0);
        this.oo.setVerticalAlignment(0);
        pS.add(this.oo);
        this.oo.setText("Please wait...");
    }

    public void t(Graphics graphics) {
        y(graphics);
        this.nG.paintIcon(pS, graphics, this.pW.b("en", 145), this.pW.b("en", 146));
        if (this.oa[0] == null || this.oa[0][0] == null || this.oe[0][0] == null) {
            this.nZ.paintIcon(pS, graphics, this.nH[0], this.nI[0]);
        } else {
            this.oe[0][this.oi[0] % this.oh[0]].paintIcon(pS, graphics, (this.nH[0] - 5) + this.of[0], (this.nI[0] - 8) + this.og[0]);
            this.oa[0][this.oi[0] % this.od[0]].paintIcon(pS, graphics, (this.nH[0] - 5) + this.ob[0], (this.nI[0] - 8) + this.oc[0]);
        }
        if (this.oa[1] == null || this.oa[1][0] == null || this.oe[1][0] == null) {
            this.nZ.paintIcon(pS, graphics, this.nH[1], this.nI[1]);
        } else {
            this.oe[1][this.oi[1] % this.oh[1]].paintIcon(pS, graphics, (this.nH[1] - 5) + this.of[1], (this.nI[1] - 8) + this.og[1]);
            this.oa[1][this.oi[1] % this.od[1]].paintIcon(pS, graphics, (this.nH[1] - 5) + this.ob[1], (this.nI[1] - 8) + this.oc[1]);
        }
        if (this.oa[2] == null || this.oa[2][0] == null || this.oe[2][0] == null) {
            this.nZ.paintIcon(pS, graphics, this.nH[2], this.nI[2]);
        } else {
            this.oe[2][this.oi[2] % this.oh[2]].paintIcon(pS, graphics, (this.nH[2] - 5) + this.of[2], (this.nI[2] - 8) + this.og[2]);
            this.oa[2][this.oi[2] % this.od[2]].paintIcon(pS, graphics, (this.nH[2] - 5) + this.ob[2], (this.nI[2] - 8) + this.oc[2]);
        }
        if (this.oa[3] == null || this.oa[3][0] == null || this.oe[3][0] == null) {
            this.nZ.paintIcon(pS, graphics, this.nH[3], this.nI[3]);
        } else {
            this.oe[3][this.oi[3] % this.oh[3]].paintIcon(pS, graphics, (this.nH[3] - 5) + this.of[3], (this.nI[3] - 8) + this.og[3]);
            this.oa[3][this.oi[3] % this.od[3]].paintIcon(pS, graphics, (this.nH[3] - 5) + this.ob[3], (this.nI[3] - 8) + this.oc[3]);
        }
        if (this.oa[4] == null || this.oa[4][0] == null || this.oe[4][0] == null) {
            this.nZ.paintIcon(pS, graphics, this.nH[4], this.nI[4]);
        } else {
            this.oe[4][this.oi[4] % this.oh[4]].paintIcon(pS, graphics, (this.nH[4] - 5) + this.of[4], (this.nI[4] - 8) + this.og[4]);
            this.oa[4][this.oi[4] % this.od[4]].paintIcon(pS, graphics, (this.nH[4] - 5) + this.ob[4], (this.nI[4] - 8) + this.oc[4]);
        }
        this.on.paintIcon(pS, graphics, this.nH[this.ok], this.nI[this.ok]);
        this.ph.paintIcon(pS, graphics, this.pW.b("en", 115), this.pW.b("en", 116));
    }

    public void u(Object obj) {
        this.oS = new ImageIcon(getClass().getResource(this.pW.d("en", 0) + this.pW.d("en", 133)));
        this.oT = new Icon[2];
        this.oT[0] = new ImageIcon(getClass().getResource(this.pW.d("en", 0) + this.pW.d("en", 136)));
        this.oT[1] = new ImageIcon(getClass().getResource(this.pW.d("en", 0) + this.pW.d("en", 141)));
        this.oU = new int[2];
        this.oU[0] = this.pW.b("en", 137);
        this.oU[1] = this.pW.b("en", 142);
        this.oV = new int[2];
        this.oV[0] = this.pW.b("en", 138);
        this.oV[1] = this.pW.b("en", 143);
        this.oW = this.pW.b("en", 139);
        this.oX = this.pW.b("en", 140);
        this.oY = 0;
    }

    public void u(Graphics graphics) {
        y(graphics);
        this.oS.paintIcon(pS, graphics, this.pW.b("en", 134), this.pW.b("en", 135));
        this.oT[this.oY].paintIcon(pS, graphics, this.oU[this.oY], this.oV[this.oY]);
    }

    public void aq(MouseEvent mouseEvent) {
        if (mouseEvent.getX() >= this.oU[0] && mouseEvent.getX() <= this.oW + this.oU[0] && mouseEvent.getY() >= this.oV[0] && mouseEvent.getY() <= this.oV[0] + this.oX) {
            if (this.oY != 0) {
                C0021aw.b.a(C0028g.c);
                this.oY = 0;
            }
        } else if (mouseEvent.getX() < this.oU[1] || mouseEvent.getX() > this.oW + this.oU[1] || mouseEvent.getY() < this.oV[1] || mouseEvent.getY() > this.oV[1] + this.oX || this.oY == 1) {
        } else {
            C0021aw.b.a(C0028g.c);
            this.oY = 1;
        }
    }

    public void ar(MouseEvent mouseEvent) {
        switch (this.oY) {
            case 0:
                if (mouseEvent.getX() >= this.oU[0] && mouseEvent.getX() <= this.oW + this.oU[0] && mouseEvent.getY() >= this.oV[0] && mouseEvent.getY() <= this.oV[0] + this.oX) {
                    C0021aw.b.a(C0028g.a);
                    a((byte) 4, (Object) null);
                }
                pS.repaint();
                return;
            case 1:
                if (mouseEvent.getX() >= this.oU[1] && mouseEvent.getX() <= this.oW + this.oU[1] && mouseEvent.getY() >= this.oV[1] && mouseEvent.getY() <= this.oV[1] + this.oX) {
                    C0021aw.b.a(C0028g.a);
                    a((byte) 3, (Object) null);
                }
                pS.repaint();
                return;
            default:
                C0032k.a("default");
                return;
        }
    }

    public void j(KeyEvent keyEvent) {
        if (keyEvent.getKeyChar() == 'a' || keyEvent.getKeyChar() == 'd') {
            this.oY ^= 1;
            C0021aw.b.a(C0028g.c);
        }
    }

    public void k(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case 10:
                switch (this.pK) {
                    case 0:
                        C0021aw.b.a(C0028g.a);
                        a((byte) 4, (Object) null);
                        pS.repaint();
                        return;
                    case 1:
                        C0021aw.b.a(C0028g.a);
                        a((byte) 3, (Object) null);
                        pS.repaint();
                        return;
                    default:
                        return;
                }
            default:
                return;
        }
    }

    public void v(Object obj) {
        this.pP.d();
        this.gn = new C0009ai();
        this.gn.a(209, 159, 369, 106, MastersOfDestiny.B, MastersOfDestiny.C);
        this.gy = false;
        this.rc = false;
        this.gA = null;
        this.ph = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 128)));
        C0032k.a("b4 create textfield");
        this.pf = new JTextField();
        C0032k.a("after create textfield");
        this.pf.setOpaque(false);
        this.pf.setEditable(false);
        this.pf.setBackground(new Color(4280407));
        this.pf.setBorder(BorderFactory.createLineBorder(new Color(4280407)));
        this.pf.setBounds(this.pW.b("en", 129), this.pW.b("en", 130), this.pW.b("en", 131), this.pW.b("en", 132));
        this.pf.setForeground(new Color(8838126));
        this.pf.setSelectionColor(new Color(8838126));
        this.pf.setSelectedTextColor(new Color(4810614));
        this.pf.setFont(new Font((String) null, 1, 12));
        this.pf.setHorizontalAlignment(0);
        pS.add(this.pf);
        this.pg = "Connecting to server";
        this.pf.setText(this.pg);
        g();
    }

    public void v(Graphics graphics) {
        y(graphics);
        if (this.qm != 13) {
            this.ph.paintIcon(pS, graphics, this.pW.b("en", 115), this.pW.b("en", 116));
        }
    }

    public void f() {
        if (System.currentTimeMillis() > this.pm) {
            if (!this.pk) {
                this.pi = (this.pi + 1) % 4;
                if (this.pf != null) {
                    if (this.pi != 0) {
                        this.pf.setText(this.pf.getText() + ".");
                    } else {
                        this.pf.setText(this.pg);
                    }
                }
            }
            if (this.pl != this.qy) {
                this.pm += this.pl;
                return;
            }
            C0032k.a("removed txtbox");
            pS.remove(this.pf);
            a(this.qz, (Object) null);
        }
    }

    public void g() {
        String str = this.b;
        int parseInt = Integer.parseInt(this.a + "224");
        try {
            this.pi = 0;
            this.pk = false;
            this.pl = 100L;
            this.pm = System.currentTimeMillis() + this.pl;
            this.pb = new Socket(str, parseInt);
            this.pe = new PrintWriter(this.pb.getOutputStream(), true);
            this.pd = new BufferedReader(new InputStreamReader(this.pb.getInputStream()));
            this.pc = new Y(this);
            this.pc.start();
        } catch (IOException e) {
            C0032k.a("auth conection error = " + e.getMessage());
            a("Unable to connect to the server.\nPlease try again.\n[Press Any Key]", (byte) 8, (Object) null);
        }
    }

    public void w(Object obj) {
        this.pn = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 114)));
        this.po = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 123)));
        this.pz = new Icon[2];
        this.pz[0] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1217)));
        this.pz[1] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 1218)));
        this.pA = 0;
        this.pB = 0;
        this.pC = -1;
        this.pp = new JTextField();
        this.pp.setText(aB.a.a());
        this.pp.setBounds(this.pW.b("en", 117), this.pW.b("en", 118), this.pW.b("en", 121), this.pW.b("en", 122));
        this.pp.setBackground(new Color(5338761));
        this.pp.setBorder(BorderFactory.createLineBorder(new Color(5338761)));
        this.pp.setForeground(new Color(8838126));
        this.pp.setSelectedTextColor(new Color(4810614));
        this.pp.setSelectionColor(new Color(6591140));
        this.pp.setCaretColor(new Color(8838126));
        pS.add(this.pp);
        this.pp.getDocument().addDocumentListener(new C0015ap(this));
        this.pp.addActionListener(new C0036o(this));
        this.pq = new JPasswordField();
        this.pq.setBounds(this.pW.b("en", 119), this.pW.b("en", 120), this.pW.b("en", 121), this.pW.b("en", 122));
        this.pq.setBackground(new Color(5338761));
        this.pq.setBorder(BorderFactory.createLineBorder(new Color(5338761)));
        this.pq.setForeground(new Color(8838126));
        this.pq.setSelectedTextColor(new Color(4810614));
        this.pq.setSelectionColor(new Color(6591140));
        this.pq.setCaretColor(new Color(8838126));
        pS.add(this.pq);
        if (this.pp.getText().length() > 0) {
            this.pq.requestFocus();
        } else {
            this.pp.requestFocus();
        }
        this.pq.getDocument().addDocumentListener(new C0044y(this));
        this.pq.addActionListener(new C0042w(this));
        this.pD = false;
        this.pr = this.pW.b("en", 124);
        this.ps = this.pW.b("en", 125);
        this.pt = this.pW.b("en", 126);
        this.pu = this.pW.b("en", 127);
        this.pv = this.pW.b("en", 1235);
        this.pw = this.pW.b("en", 1236);
        this.px = this.pW.b("en", 1237);
        this.py = this.pW.b("en", 1238);
    }

    public void h() {
        pS.remove(this.pp);
        pS.remove(this.pq);
        a((byte) 11, (Object) null);
    }

    public void w(Graphics graphics) {
        y(graphics);
        this.pn.paintIcon(pS, graphics, this.pW.b("en", 115), this.pW.b("en", 116));
        if (this.pD) {
            this.po.paintIcon(pS, graphics, this.pr, this.ps);
        }
        if (this.pC != -1) {
            this.pz[this.pC].paintIcon(pS, graphics, this.pA, this.pB);
        }
    }

    public void as(MouseEvent mouseEvent) {
        this.pC = -1;
        if (mouseEvent.getX() >= this.pv && mouseEvent.getX() <= this.pv + this.px && mouseEvent.getY() >= this.pw && mouseEvent.getY() <= this.pw + this.py) {
            this.pC = 1;
            this.pA = this.pv;
            this.pB = this.pw;
        } else if (this.pD && mouseEvent.getX() >= this.pr && mouseEvent.getX() <= this.pr + this.pt && mouseEvent.getY() >= this.ps && mouseEvent.getY() <= this.ps + this.pu) {
            this.pC = 0;
            this.pA = this.pr;
            this.pB = this.ps;
            C0021aw.b.a(C0028g.c);
        }
    }

    public void at(MouseEvent mouseEvent) {
        if (mouseEvent.getX() >= this.pv && mouseEvent.getX() <= this.pv + this.px && mouseEvent.getY() >= this.pw && mouseEvent.getY() <= this.pw + this.py) {
            C0021aw.b.a(C0028g.b);
            this.pC = -1;
            pS.remove(this.pp);
            pS.remove(this.pq);
            a((byte) 8, (Object) null);
            pS.repaint();
        } else if (this.pD && mouseEvent.getX() >= this.pr && mouseEvent.getX() <= this.pr + this.pt && mouseEvent.getY() >= this.ps && mouseEvent.getY() <= this.ps + this.pu) {
            C0021aw.b.a(C0028g.a);
            this.pC = -1;
            h();
        }
    }

    public void l(KeyEvent keyEvent) {
        if (this.pD) {
            switch (keyEvent.getKeyCode()) {
                case 10:
                    C0021aw.b.a(C0028g.a);
                    h();
                    return;
                default:
                    return;
            }
        }
    }

    public void x(Object obj) {
        this.pE = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 103)));
        this.pF = new Icon[2];
        this.pF[0] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 106)));
        this.pF[1] = new ImageIcon(getClass().getResource(this.pW.a("en", 0) + this.pW.a("en", 109)));
        this.pG = new int[2];
        this.pG[0] = this.pW.b("en", 107);
        this.pG[1] = this.pW.b("en", 110);
        this.pH = new int[2];
        this.pH[0] = this.pW.b("en", 108);
        this.pH[1] = this.pW.b("en", 111);
        this.pI = this.pW.b("en", 112);
        this.pJ = this.pW.b("en", 113);
        this.pK = 1;
    }

    public void x(Graphics graphics) {
        y(graphics);
        this.pE.paintIcon(pS, graphics, this.pW.b("en", 104), this.pW.b("en", 105));
        this.pF[this.pK].paintIcon(pS, graphics, this.pG[this.pK], this.pH[this.pK]);
    }

    public void au(MouseEvent mouseEvent) {
        if (mouseEvent.getX() >= this.pG[0] && mouseEvent.getX() <= this.pI + this.pG[0] && mouseEvent.getY() >= this.pH[0] && mouseEvent.getY() <= this.pH[0] + this.pJ) {
            if (this.pK != 0) {
                C0021aw.b.a(C0028g.c);
                this.pK = 0;
            }
        } else if (mouseEvent.getX() < this.pG[1] || mouseEvent.getX() > this.pI + this.pG[1] || mouseEvent.getY() < this.pH[1] || mouseEvent.getY() > this.pH[1] + this.pJ || this.pK == 1) {
        } else {
            C0021aw.b.a(C0028g.c);
            this.pK = 1;
        }
    }

    public void av(MouseEvent mouseEvent) {
        switch (this.pK) {
            case 0:
                pS.repaint();
                if (mouseEvent.getX() < this.pG[0] || mouseEvent.getX() > this.pI + this.pG[0] || mouseEvent.getY() < this.pH[0] || mouseEvent.getY() > this.pH[0] + this.pJ) {
                    return;
                }
                C0021aw.b.a(C0028g.a);
                a((byte) 9, (Object) null);
                return;
            case 1:
                pS.repaint();
                if (mouseEvent.getX() < this.pG[1] || mouseEvent.getX() > this.pI + this.pG[1] || mouseEvent.getY() < this.pH[1] || mouseEvent.getY() > this.pH[1] + this.pJ) {
                    return;
                }
                C0021aw.b.a(C0028g.a);
                a((byte) 10, (Object) null);
                return;
            default:
                C0032k.a("default");
                return;
        }
    }

    public void m(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case 10:
                switch (this.pK) {
                    case 0:
                        C0021aw.b.a(C0028g.a);
                        a((byte) 9, (Object) null);
                        pS.repaint();
                        return;
                    case 1:
                        C0021aw.b.a(C0028g.a);
                        a((byte) 10, (Object) null);
                        pS.repaint();
                        return;
                    default:
                        return;
                }
            default:
                return;
        }
    }

    public void n(KeyEvent keyEvent) {
        if (keyEvent.getKeyChar() == 'w' || keyEvent.getKeyChar() == 's') {
            this.pK ^= 1;
            C0021aw.b.a(C0028g.c);
        }
    }

    public void y(Object obj) {
        C0032k.a("start");
        this.pN = System.currentTimeMillis() + 3000;
        this.pO = new ImageIcon(getClass().getResource(this.pW.d("en", 0) + this.pW.d("en", 1)));
    }

    public void aw(MouseEvent mouseEvent) {
        this.qj = true;
        a((byte) 8, (Object) null);
        C0032k.a("finish splash");
    }

    public void y(Graphics graphics) {
        this.pO.paintIcon(pS, graphics, 0, 0);
    }

    public void i() {
        if (System.currentTimeMillis() > this.pN) {
            aw(null);
        }
    }

    public static MastersOfDestiny j() {
        if (pS == null) {
            C0032k.a("MastersOfDestiny is null");
        }
        return pS;
    }

    public static X k() {
        if (uq == null) {
            C0032k.a("stateManager is null");
        }
        return uq;
    }

    public GameStates(MastersOfDestiny mastersOfDestiny, String str) {
        this.a = "5";
        this.b = "b1.main.hinterwars.com";
        this.pX = null;
        this.pZ = false;
        if (str.compareTo(sm) != 0) {
            String[] split = str.split(":");
            String str2 = split[0];
            this.b = str2;
            this.a = split[1].substring(0, 1);
            C0032k.a("GameStates(Constructor): Server address now set to=> " + str2);
            C0032k.a("GameStates(Constructor): Port now set to=> " + this.a);
        }
        C0021aw.b.a(C0028g.a);
        pS = mastersOfDestiny;
        this.pW = new aE("res/Resources.ini");
        this.pP = new C0045z();
        this.pQ = new aA();
        this.pR = new Q();
        this.pX = C0031j.a();
        this.pX.a(this);
        this.pX.a(this.pW);
        this.um = new K("res/skills/", "graphicsMapping.txt");
        this.un = new G("res/HQ/Missions/");
        this.uo = new C0008ah("res/HQ/Area/");
        this.pT = new U("res/items/", "graphicsMapping.txt", "itemClassMapping.txt", "bodySlotMapping.txt");
        this.up = new T("res/cafe/Convo/", "res/cafe/Trigger/", "res/cafe/Quest/", "res/cafe/SubQuest/");
        this.ur = new C0001aa(this.pX, this.pT, this.um, this.un, this.uo, this.up, mastersOfDestiny, null);
        C0032k.a("entityManager = " + this.pX);
        try {
            this.p = (az) this.pX.a(Class.forName("az"));
            this.x = (az) this.pX.a(Class.forName("az"));
            this.F = (az) this.pX.a(Class.forName("az"));
            this.H = (az) this.pX.a(Class.forName("az"));
            this.M = (az) this.pX.a(Class.forName("az"));
            this.N = (C0011ak) this.pX.a(Class.forName("ak"));
            this.N.a((byte) 0);
            this.M.a(this.N);
            this.M.g();
        } catch (ClassNotFoundException e) {
        }
        this.pY = this.pW.a("en", 267, 0, 0);
        this.qd = (byte) 0;
        this.g = this.pW.d("en", 0);
        this.pU = new Thread(this);
        this.pU.setName("gameThread");
        this.pU.start();
        this.pZ = true;
    }

    public void l() {
        if (this.qj) {
            a((byte) 2, (Object) null);
        } else {
            a((byte) 1, (Object) null);
        }
    }

    @Override // defpackage.aN
    public void a(int i, Object obj) {
        switch (i) {
            case 101:
                if (this.O != null) {
                    if (!((C) obj).o) {
                        this.ql = false;
                        if (this.O.e()) {
                            this.O.h();
                            return;
                        }
                        return;
                    }
                    switch (((C) obj).m()) {
                        case 0:
                            if (!this.ql) {
                                C0021aw.b.a(C0028g.a);
                                this.ql = true;
                                this.qk = (byte) 1;
                                this.O.g();
                                this.O.a("Hop", ry);
                                this.O.a("Direct", rz);
                            }
                            this.O.a((this.G.al + this.G.N[0][0].getIconWidth()) - this.O.k.getIconWidth(), (((this.G.am - this.O.j.getIconHeight()) - this.O.l.getIconHeight()) - (this.O.o.size() * this.O.k.getIconHeight())) - 5);
                            return;
                        case 1:
                            if (!this.ql) {
                                C0021aw.b.a(C0028g.a);
                                this.ql = true;
                                this.qk = (byte) 2;
                                this.O.g();
                                this.O.a("Enter", sn);
                            }
                            this.O.a((this.G.al + this.G.N[0][0].getIconWidth()) - this.O.k.getIconWidth(), (((this.G.am - this.O.j.getIconHeight()) - this.O.l.getIconHeight()) - (this.O.o.size() * this.O.k.getIconHeight())) - 5);
                            return;
                        case 2:
                            if (!this.ql) {
                                C0032k.a("touched shop!!!");
                                C0021aw.b.a(C0028g.a);
                                this.U.write("S1\n");
                                this.U.flush();
                                this.ql = true;
                                this.qk = (byte) -1;
                                this.O.g();
                            }
                            this.O.a((this.G.al + this.G.N[0][0].getIconWidth()) - this.O.k.getIconWidth(), (((this.G.am - this.O.j.getIconHeight()) - this.O.l.getIconHeight()) - (this.O.o.size() * this.O.k.getIconHeight())) - 5);
                            return;
                        case 3:
                            if (!this.ql) {
                                C0021aw.b.a(C0028g.a);
                                this.ql = true;
                                this.qk = (byte) 4;
                                this.O.g();
                                this.O.a("Enter", "1");
                            }
                            this.O.a((this.G.al + this.G.N[0][0].getIconWidth()) - this.O.k.getIconWidth(), (((this.G.am - this.O.j.getIconHeight()) - this.O.l.getIconHeight()) - (this.O.o.size() * this.O.k.getIconHeight())) - 5);
                            return;
                        case 4:
                            if (!this.ql) {
                                C0021aw.b.a(C0028g.a);
                                this.ql = true;
                                this.qk = (byte) 5;
                                this.O.g();
                                this.O.a("Enter", sm);
                            }
                            if (this.O != null) {
                                this.O.a((this.G.al + this.G.N[0][0].getIconWidth()) - this.O.k.getIconWidth(), (((this.G.am - this.O.j.getIconHeight()) - this.O.l.getIconHeight()) - (this.O.o.size() * this.O.k.getIconHeight())) - 5);
                                return;
                            }
                            return;
                        case 5:
                            if (this.ql) {
                                return;
                            }
                            C0021aw.b.a(C0028g.a);
                            this.ql = true;
                            this.qk = (byte) 6;
                            this.O.g();
                            this.O.a("Enter", "1");
                            this.O.a((this.G.al + this.G.N[0][0].getIconWidth()) - this.O.k.getIconWidth(), (((this.G.am - this.O.j.getIconHeight()) - this.O.l.getIconHeight()) - (this.O.o.size() * this.O.k.getIconHeight())) - 5);
                            return;
                        case 6:
                            if (!this.ql) {
                                C0021aw.b.a(C0028g.a);
                                this.ql = true;
                                this.qk = (byte) 7;
                                this.O.g();
                                if (this.O.o.size() < 1) {
                                    this.O.a("Enter", "1");
                                }
                            }
                            this.O.a((this.G.al + this.G.N[0][0].getIconWidth()) - this.O.k.getIconWidth(), (((this.G.am - this.O.j.getIconHeight()) - this.O.l.getIconHeight()) - (this.O.o.size() * this.O.k.getIconHeight())) - 5);
                            return;
                        default:
                            return;
                    }
                }
                return;
            default:
                return;
        }
    }

    void z(Object obj) {
        this.pV = false;
    }

    public void a(byte b, Object obj) {
        this.qn = this.qm;
        this.qm = b;
        b((int) b, obj);
        C0032k.a("setState: curState = " + ((int) b));
        System.gc();
    }

    void b(int i, Object obj) {
        this.qo = true;
        switch (this.qn) {
            case 3:
                if (this.oo != null) {
                    pS.remove(this.oo);
                }
                if (this.nL != null) {
                    for (int i2 = 0; i2 < this.nL.length; i2++) {
                        if (this.nL[i2] != null) {
                            pS.remove(this.nL[i2]);
                        }
                    }
                    break;
                }
                break;
            case 5:
                pS.remove(pS.o);
                break;
            case C0000a.aW /* 11 */:
                pS.remove(this.pf);
                break;
        }
        switch (i) {
            case 1:
                y(obj);
                break;
            case 2:
                u(obj);
                break;
            case 3:
                s(obj);
                break;
            case 4:
                q(obj);
                break;
            case 5:
                C0032k.a("reach colony state");
                e(obj);
                break;
            case 6:
            case 7:
            case C0000a.aX /* 12 */:
            case C0000a.bk /* 25 */:
            case C0000a.bm /* 27 */:
            case C0000a.bo /* 29 */:
            default:
                C0032k.a("Unknown game state requested: " + i);
                break;
            case 8:
                x(obj);
                break;
            case 9:
                r(obj);
                break;
            case 10:
                w(obj);
                break;
            case C0000a.aW /* 11 */:
                v(obj);
                break;
            case C0000a.aY /* 13 */:
                A(obj);
                break;
            case C0000a.aZ /* 14 */:
                f(obj);
                break;
            case 15:
                h(obj);
                break;
            case C0000a.bb /* 16 */:
                g(obj);
                break;
            case C0000a.bc /* 17 */:
                o(obj);
                break;
            case C0000a.bd /* 18 */:
                i(obj);
                break;
            case C0000a.be /* 19 */:
                l(obj);
                break;
            case C0000a.bf /* 20 */:
                p(obj);
                break;
            case C0000a.bg /* 21 */:
                j(obj);
                break;
            case C0000a.bh /* 22 */:
                k(obj);
                break;
            case C0000a.bi /* 23 */:
                C0032k.a("go to initialize state");
                a(obj);
                break;
            case C0000a.bj /* 24 */:
                c(obj);
                break;
            case C0000a.bl /* 26 */:
                t(obj);
                break;
            case C0000a.bn /* 28 */:
                b(obj);
                break;
            case 30:
                d(obj);
                break;
            case C0000a.bq /* 31 */:
                m(obj);
                break;
            case C0000a.br /* 32 */:
                n(obj);
                break;
        }
        this.qo = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ax(MouseEvent mouseEvent) {
        if (this.qo) {
            return;
        }
        switch (this.qm) {
            case 2:
                aq(mouseEvent);
                return;
            case 3:
                ao(mouseEvent);
                return;
            case 4:
                al(mouseEvent);
                return;
            case 5:
                a(mouseEvent);
                return;
            case 6:
            case 7:
            case C0000a.aW /* 11 */:
            case C0000a.aX /* 12 */:
            case C0000a.aY /* 13 */:
            case C0000a.bi /* 23 */:
            case C0000a.bj /* 24 */:
            case C0000a.bk /* 25 */:
            case C0000a.bl /* 26 */:
            case C0000a.bm /* 27 */:
            case C0000a.bn /* 28 */:
            case C0000a.bo /* 29 */:
            case 30:
            default:
                return;
            case 8:
                au(mouseEvent);
                return;
            case 9:
                am(mouseEvent);
                return;
            case 10:
                as(mouseEvent);
                return;
            case C0000a.aZ /* 14 */:
                f(mouseEvent);
                return;
            case 15:
                s(mouseEvent);
                return;
            case C0000a.bb /* 16 */:
                k(mouseEvent);
                return;
            case C0000a.bc /* 17 */:
                ab(mouseEvent);
                return;
            case C0000a.bd /* 18 */:
                x(mouseEvent);
                return;
            case C0000a.be /* 19 */:
                M(mouseEvent);
                return;
            case C0000a.bf /* 20 */:
                ag(mouseEvent);
                return;
            case C0000a.bg /* 21 */:
                C(mouseEvent);
                return;
            case C0000a.bh /* 22 */:
                H(mouseEvent);
                return;
            case C0000a.bq /* 31 */:
                R(mouseEvent);
                return;
            case C0000a.br /* 32 */:
                W(mouseEvent);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ay(MouseEvent mouseEvent) {
        if (this.qo) {
            return;
        }
        switch (this.qm) {
            case 5:
                e(mouseEvent);
                return;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case C0000a.aW /* 11 */:
            case C0000a.aX /* 12 */:
            case C0000a.aY /* 13 */:
            case C0000a.aZ /* 14 */:
            case C0000a.be /* 19 */:
            case C0000a.bf /* 20 */:
            default:
                return;
            case 15:
                u(mouseEvent);
                return;
            case C0000a.bb /* 16 */:
                o(mouseEvent);
                return;
            case C0000a.bc /* 17 */:
                ad(mouseEvent);
                return;
            case C0000a.bd /* 18 */:
                z(mouseEvent);
                return;
            case C0000a.bg /* 21 */:
                E(mouseEvent);
                return;
            case C0000a.bh /* 22 */:
                J(mouseEvent);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void az(MouseEvent mouseEvent) {
        if (this.qo) {
            return;
        }
        switch (this.qm) {
            case 5:
                c(mouseEvent);
                return;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case C0000a.aW /* 11 */:
            case C0000a.aX /* 12 */:
            case C0000a.aY /* 13 */:
            case C0000a.aZ /* 14 */:
            case C0000a.be /* 19 */:
            case C0000a.bf /* 20 */:
            default:
                return;
            case 15:
                t(mouseEvent);
                return;
            case C0000a.bb /* 16 */:
                n(mouseEvent);
                return;
            case C0000a.bc /* 17 */:
                ac(mouseEvent);
                return;
            case C0000a.bd /* 18 */:
                y(mouseEvent);
                return;
            case C0000a.bg /* 21 */:
                D(mouseEvent);
                return;
            case C0000a.bh /* 22 */:
                I(mouseEvent);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void aA(MouseEvent mouseEvent) {
        if (this.qo) {
            return;
        }
        switch (this.qm) {
            case 1:
                aw(mouseEvent);
                return;
            case 2:
                ar(mouseEvent);
                return;
            case 3:
                ap(mouseEvent);
                return;
            case 4:
                ak(mouseEvent);
                return;
            case 5:
                b(mouseEvent);
                return;
            case 6:
            case 7:
            case C0000a.aW /* 11 */:
            case C0000a.aX /* 12 */:
            case C0000a.aY /* 13 */:
            case C0000a.bi /* 23 */:
            case C0000a.bj /* 24 */:
            case C0000a.bk /* 25 */:
            case C0000a.bl /* 26 */:
            case C0000a.bm /* 27 */:
            case C0000a.bn /* 28 */:
            case C0000a.bo /* 29 */:
            case 30:
            default:
                return;
            case 8:
                av(mouseEvent);
                return;
            case 9:
                an(mouseEvent);
                return;
            case 10:
                C0032k.a("gamestate login click");
                at(mouseEvent);
                return;
            case C0000a.aZ /* 14 */:
                g(mouseEvent);
                return;
            case 15:
                q(mouseEvent);
                return;
            case C0000a.bb /* 16 */:
                l(mouseEvent);
                return;
            case C0000a.bc /* 17 */:
                aa(mouseEvent);
                return;
            case C0000a.bd /* 18 */:
                w(mouseEvent);
                return;
            case C0000a.be /* 19 */:
                L(mouseEvent);
                return;
            case C0000a.bf /* 20 */:
                af(mouseEvent);
                return;
            case C0000a.bg /* 21 */:
                B(mouseEvent);
                return;
            case C0000a.bh /* 22 */:
                G(mouseEvent);
                return;
            case C0000a.bq /* 31 */:
                Q(mouseEvent);
                return;
            case C0000a.br /* 32 */:
                V(mouseEvent);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void aB(MouseEvent mouseEvent) {
        if (this.qo) {
            return;
        }
        switch (this.qm) {
            case 5:
                d(mouseEvent);
                return;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case C0000a.aW /* 11 */:
            case C0000a.aX /* 12 */:
            case C0000a.aY /* 13 */:
            case C0000a.aZ /* 14 */:
            case C0000a.be /* 19 */:
            case C0000a.bf /* 20 */:
            default:
                return;
            case 15:
                v(mouseEvent);
                return;
            case C0000a.bb /* 16 */:
                p(mouseEvent);
                return;
            case C0000a.bc /* 17 */:
                ae(mouseEvent);
                return;
            case C0000a.bd /* 18 */:
                A(mouseEvent);
                return;
            case C0000a.bg /* 21 */:
                F(mouseEvent);
                return;
            case C0000a.bh /* 22 */:
                K(mouseEvent);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void aC(MouseEvent mouseEvent) {
        if (this.qo) {
            return;
        }
        byte b = this.qm;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void aD(MouseEvent mouseEvent) {
        if (this.qo) {
            return;
        }
        byte b = this.qm;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(KeyEvent keyEvent) {
        if (this.qo) {
            return;
        }
        switch (this.qm) {
            case 2:
                k(keyEvent);
                return;
            case 3:
            case 6:
            case 7:
            case C0000a.aW /* 11 */:
            case C0000a.aX /* 12 */:
            case 15:
            default:
                return;
            case 4:
                f(keyEvent);
                return;
            case 5:
                b(keyEvent);
                return;
            case 8:
                m(keyEvent);
                return;
            case 9:
                g(keyEvent);
                return;
            case 10:
                l(keyEvent);
                return;
            case C0000a.aY /* 13 */:
                m();
                return;
            case C0000a.aZ /* 14 */:
                d(keyEvent);
                return;
            case C0000a.bb /* 16 */:
                e(keyEvent);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(KeyEvent keyEvent) {
        if (this.qo) {
            return;
        }
        switch (this.qm) {
            case 5:
                c(keyEvent);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(KeyEvent keyEvent) {
        if (this.qo) {
            return;
        }
        switch (this.qm) {
            case 2:
                j(keyEvent);
                return;
            case 3:
                h(keyEvent);
                return;
            case 4:
            case 6:
            case 7:
            case 9:
            case 10:
            case C0000a.aW /* 11 */:
            case C0000a.aX /* 12 */:
            default:
                return;
            case 5:
                a(keyEvent);
                return;
            case 8:
                n(keyEvent);
                return;
            case C0000a.aY /* 13 */:
                m();
                return;
        }
    }

    private String e(String str) {
        String str2 = sm;
        try {
            InputStream resourceAsStream = getClass().getResourceAsStream(str);
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
                str2 = new String(byteArrayOutputStream.toByteArray(), "utf-8");
            }
        } catch (Exception e) {
            C0032k.a("GameStates(getClientVersion): Error" + e);
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void z(Graphics graphics) {
        pS.b.setSize(804, 632);
        if (this.qo) {
            return;
        }
        switch (this.qm) {
            case 1:
                y(graphics);
                break;
            case 2:
                u(graphics);
                break;
            case 3:
                s(graphics);
                break;
            case 4:
                q(graphics);
                break;
            case 5:
                e(graphics);
                graphics.setFont(new Font("BV Boli", 2, 18));
                graphics.setColor(new Color(11594998));
                graphics.drawString(this.qp + "." + this.a + "a", 631, 32);
                break;
            case 7:
                a(graphics);
                break;
            case 8:
                x(graphics);
                break;
            case 9:
                r(graphics);
                break;
            case 10:
                w(graphics);
                break;
            case C0000a.aW /* 11 */:
                v(graphics);
                break;
            case C0000a.aY /* 13 */:
                A(graphics);
                break;
            case C0000a.aZ /* 14 */:
                f(graphics);
                graphics.setFont(new Font("BV Boli", 2, 18));
                graphics.setColor(new Color(11594998));
                graphics.drawString(this.qp + "." + this.a + "a", 631, 32);
                break;
            case 15:
                h(graphics);
                graphics.setFont(new Font("BV Boli", 2, 18));
                graphics.setColor(new Color(11594998));
                graphics.drawString(this.qp + "." + this.a + "a", 631, 32);
                break;
            case C0000a.bb /* 16 */:
                g(graphics);
                graphics.setFont(new Font("BV Boli", 2, 18));
                graphics.setColor(new Color(11594998));
                graphics.drawString(this.qp + "." + this.a + "a", 631, 32);
                break;
            case C0000a.bc /* 17 */:
                o(graphics);
                graphics.setFont(new Font("BV Boli", 2, 18));
                graphics.setColor(new Color(11594998));
                graphics.drawString(this.qp + "." + this.a + "a", 631, 32);
                break;
            case C0000a.bd /* 18 */:
                i(graphics);
                break;
            case C0000a.be /* 19 */:
                l(graphics);
                graphics.setFont(new Font("BV Boli", 2, 18));
                graphics.setColor(new Color(11594998));
                graphics.drawString(this.qp + "." + this.a + "a", 631, 32);
                break;
            case C0000a.bf /* 20 */:
                p(graphics);
                graphics.setFont(new Font("BV Boli", 2, 18));
                graphics.setColor(new Color(11594998));
                graphics.drawString(this.qp + "." + this.a + "a", 631, 32);
                break;
            case C0000a.bg /* 21 */:
                j(graphics);
                break;
            case C0000a.bh /* 22 */:
                k(graphics);
                graphics.setFont(new Font("BV Boli", 2, 18));
                graphics.setColor(new Color(11594998));
                graphics.drawString(this.qp + "." + this.a + "a", 631, 32);
                break;
            case C0000a.bi /* 23 */:
                a(graphics);
                break;
            case C0000a.bj /* 24 */:
                c(graphics);
                break;
            case C0000a.bk /* 25 */:
                c(graphics);
                break;
            case C0000a.bl /* 26 */:
                t(graphics);
                break;
            case C0000a.bm /* 27 */:
                b(graphics);
                break;
            case C0000a.bn /* 28 */:
                b(graphics);
                break;
            case C0000a.bo /* 29 */:
                d(graphics);
                break;
            case 30:
                d(graphics);
                break;
            case C0000a.bq /* 31 */:
                m(graphics);
                break;
            case C0000a.br /* 32 */:
                n(graphics);
                break;
        }
        notifyAll();
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.pV) {
            if (!this.qo) {
                synchronized (this) {
                    switch (this.qm) {
                        case 1:
                            i();
                            break;
                        case 3:
                            c();
                            break;
                        case 5:
                            a(System.currentTimeMillis());
                            break;
                        case C0000a.aW /* 11 */:
                            f();
                            break;
                        case C0000a.bc /* 17 */:
                            f(this.ur, System.currentTimeMillis());
                            break;
                        case C0000a.bd /* 18 */:
                            a(this.ur, System.currentTimeMillis());
                            break;
                        case C0000a.bf /* 20 */:
                            g(this.ur, System.currentTimeMillis());
                            break;
                        case C0000a.bg /* 21 */:
                            b(this.ur, System.currentTimeMillis());
                            break;
                        case C0000a.bh /* 22 */:
                            c(this.ur, System.currentTimeMillis());
                            break;
                        case C0000a.bq /* 31 */:
                            d(this.ur, System.currentTimeMillis());
                            break;
                        case C0000a.br /* 32 */:
                            e(this.ur, System.currentTimeMillis());
                            break;
                    }
                    if (this.pX != null) {
                        this.pX.a(System.currentTimeMillis());
                    }
                    try {
                        pS.repaint();
                        Thread.sleep(100L);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }

    public void c(String str) {
        String[] split = str.split("\\|");
        if (split[0].equals("CS")) {
            if (this.qm == 11) {
                this.pg = "Authenticating";
                this.pf.setText(this.pg);
            }
            this.pi = 0;
            this.pk = false;
            this.pe.write("VC|" + this.qp + "\n");
            this.pe.flush();
            if (this.qm == 11) {
                this.pe.write("LI|" + this.pp.getText() + "|" + this.pq.getText() + "\n");
                aB.a.a(this.pp.getText());
                this.pe.flush();
            }
        } else if (split[0].equals(qw)) {
            if (this.qm == 9) {
                this.pe.write("R1|" + this.mR.getText() + "|" + this.mS.getText() + "\n");
                this.pe.flush();
                this.pe.write("R2|" + this.mT.getText() + "\n");
                this.pe.flush();
                this.pe.write("R3|" + this.mU.getText() + "|" + this.mV.getText() + "\n");
                this.pe.flush();
                this.pe.write("R4\n");
                this.pe.flush();
                C0032k.a("sent registration request");
            }
        } else if (split[0].equals("P3")) {
            this.lU = 0;
            this.mE = false;
            this.mD = true;
        } else if (split[0].equals("P2")) {
            this.lU = Integer.parseInt(split[1]);
            this.mE = false;
            this.mD = true;
        } else if (split[0].equals(qK)) {
            this.mQ = 0;
            this.nB = false;
            this.nA = true;
        } else if (split[0].equals(qL)) {
            this.mQ = Integer.parseInt(split[1]);
            this.nB = false;
            this.nA = true;
        } else if (split[0].equals("CP")) {
            V = Long.parseLong(split[1]);
            Y = split[2];
            this.pg = "::[Authenticated]::";
            this.pf.setText(this.pg);
            this.pi = 0;
            this.pk = true;
            this.pl = this.qy;
            this.pm = System.currentTimeMillis() + this.pl;
            this.qz = (byte) 2;
        } else if (split[0].equals("WV")) {
            this.pg = "Version obsolete, please restart Hinterwars";
            this.pf.setText(this.pg);
            this.pi = 0;
            this.pk = true;
            this.pl = this.qy;
            this.pm = System.currentTimeMillis() + this.pl;
            this.qz = (byte) 10;
        } else if (split[0].equals("WP")) {
            this.pg = "Login Failed. Please try again.";
            this.pf.setText(this.pg);
            this.pi = 0;
            this.pk = true;
            this.pl = this.qy;
            this.pm = System.currentTimeMillis() + this.pl;
            this.qz = (byte) 10;
        } else if (split[0].equals("BA")) {
            this.pg = "Your account has been banned.";
            this.pf.setText(this.pg);
            this.pi = 0;
            this.pk = true;
            this.pl = this.qy;
            this.pm = System.currentTimeMillis() + this.pl;
            this.qz = (byte) 10;
        } else if (split[0].equals("IS")) {
            this.pg = "Invalid subscription. Please try again.";
            this.pf.setText(this.pg);
            this.pi = 0;
            this.pk = true;
            this.pl = this.qy;
            this.pm = System.currentTimeMillis() + this.pl;
            this.qz = (byte) 10;
        } else if (!split[0].equals(qE)) {
            if (split[0].equals("CR")) {
                if (this.ra == 0) {
                    this.op = "Retrieving";
                    this.oo.setText(this.op);
                    this.oq = 0;
                    this.pk = false;
                }
                this.qU[this.ra] = split[1];
                this.qV[this.ra] = split[2];
                this.qW[this.ra] = Integer.parseInt(split[3]);
                this.qX[this.ra] = split[4];
                this.qY[this.ra] = Integer.parseInt(split[5]);
                if (Integer.parseInt(split[7]) != -1) {
                    D a = this.pT.a(split[7]);
                    this.oa[this.ra] = a.t();
                    this.ob[this.ra] = a.u();
                    this.oc[this.ra] = a.v();
                    this.od[this.ra] = a.r();
                } else {
                    S a2 = this.ur.D.a(this.qW[this.ra], this.qY[this.ra]);
                    this.od[this.ra] = a2.a();
                    this.ob[this.ra] = a2.f();
                    this.oc[this.ra] = a2.g();
                    this.oa[this.ra] = a2.d();
                }
                this.qZ[this.ra] = Integer.parseInt(split[6]);
                if (Integer.parseInt(split[8]) != -1) {
                    D a3 = this.pT.a(split[8]);
                    this.oe[this.ra] = a3.t();
                    this.of[this.ra] = a3.u();
                    this.og[this.ra] = a3.v();
                    this.oh[this.ra] = a3.r();
                } else {
                    S b = this.ur.D.b(this.qW[this.ra], this.qZ[this.ra]);
                    this.oh[this.ra] = b.a();
                    this.of[this.ra] = b.f();
                    this.og[this.ra] = b.g();
                    this.oe[this.ra] = b.d();
                }
                if (this.oh[this.ra] > this.od[this.ra]) {
                    this.oj[this.ra] = this.oh[this.ra];
                } else {
                    this.oj[this.ra] = this.od[this.ra];
                }
                String str2 = sm;
                switch (this.qW[this.ra]) {
                    case 1:
                        str2 = "Human";
                        break;
                    case 2:
                        str2 = "Taikuus";
                        break;
                    case 3:
                        str2 = "Firans";
                        break;
                    case 4:
                        str2 = "Brucians";
                        break;
                }
                this.nL[this.ra].setText("<html>" + this.qX[this.ra] + "<BR>" + str2 + "<BR>Lv " + this.qV[this.ra] + "</html>");
                pS.repaint();
                this.ra++;
            } else if (split[0].equals("P5")) {
                this.lV = "You are not authorized to delete this character!";
                this.mD = true;
            } else if (split[0].equals("P6")) {
                this.lV = "                   Delete successful!";
                this.mD = true;
                for (int i = this.ol; i <= 4; i++) {
                    if (i >= 4) {
                        this.qU[i] = null;
                        this.qV[i] = null;
                        this.qW[i] = 0;
                        this.qX[i] = null;
                        this.qY[i] = 0;
                        this.od[i] = 0;
                        this.ob[i] = 0;
                        this.oc[i] = 0;
                        this.oa[i] = null;
                        this.qZ[i] = 0;
                        this.oh[i] = 0;
                        this.of[i] = 0;
                        this.og[i] = 0;
                        this.oe[i] = null;
                        this.oj[i] = 0;
                        this.nL[i].setText(sm);
                    } else if (this.qU[i + 1] != null) {
                        this.qU[i] = this.qU[i + 1];
                        this.qV[i] = this.qV[i + 1];
                        this.qW[i] = this.qW[i + 1];
                        this.qX[i] = this.qX[i + 1];
                        this.qY[i] = this.qY[i + 1];
                        S a4 = this.ur.D.a(this.qW[i], this.qY[i]);
                        this.od[i] = a4.a();
                        this.ob[i] = a4.f();
                        this.oc[i] = a4.g();
                        this.oa[i] = a4.d();
                        this.qZ[i] = this.qZ[i + 1];
                        S b2 = this.ur.D.b(this.qW[i], this.qZ[i]);
                        this.oh[i] = b2.a();
                        this.of[i] = b2.f();
                        this.og[i] = b2.g();
                        this.oe[i] = b2.d();
                        if (this.oh[i] > this.od[i]) {
                            this.oj[i] = this.oh[i];
                        } else {
                            this.oj[i] = this.od[i];
                        }
                        String str3 = sm;
                        switch (this.qW[i]) {
                            case 1:
                                str3 = "Human";
                                break;
                            case 2:
                                str3 = "Taikuus";
                                break;
                            case 3:
                                str3 = "Firans";
                                break;
                            case 4:
                                str3 = "Brucians";
                                break;
                        }
                        this.nL[i].setText("<html>" + this.qX[i] + "<BR>" + str3 + "<BR>Lv " + this.qV[i] + "</html>");
                        this.qU[i + 1] = null;
                        this.qV[i + 1] = null;
                        this.qW[i + 1] = 0;
                        this.qX[i + 1] = null;
                        this.qY[i + 1] = 0;
                        this.od[i + 1] = 0;
                        this.ob[i + 1] = 0;
                        this.oc[i + 1] = 0;
                        this.oa[i + 1] = null;
                        this.qZ[i + 1] = 0;
                        this.oh[i + 1] = 0;
                        this.of[i + 1] = 0;
                        this.og[i + 1] = 0;
                        this.oe[i + 1] = null;
                        this.oj[i + 1] = 0;
                        this.nL[i + 1].setText(sm);
                    } else {
                        this.qU[i] = null;
                        this.qV[i] = null;
                        this.qW[i] = 0;
                        this.qX[i] = null;
                        this.qY[i] = 0;
                        this.od[i] = 0;
                        this.ob[i] = 0;
                        this.oc[i] = 0;
                        this.oa[i] = null;
                        this.qZ[i] = 0;
                        this.oh[i] = 0;
                        this.of[i] = 0;
                        this.og[i] = 0;
                        this.oe[i] = null;
                        this.oj[i] = 0;
                        this.nL[i].setText(sm);
                    }
                    pS.repaint();
                }
            } else if (split[0].equals("TF")) {
                C0032k.a("TF 1");
                if (this.nL[0].getText() == null || this.nL[0].getText().equals(sm)) {
                    this.pe.write("RD|" + V + "\n");
                    this.pe.flush();
                    a("Sorry\nYou do not have any character for selection\n[Press Any Key]", (byte) 2, (Object) null);
                    return;
                }
                this.op = "::[Successfully Retrieved]::";
                this.oo.setText(this.op);
                this.oq = 0;
                this.pk = true;
            } else if (split[0].equals("SI")) {
                try {
                    this.pc.a();
                    this.pc = null;
                    this.pd = null;
                    this.pe = null;
                    this.pb.close();
                    this.pb = null;
                    C0032k.a("auth closed");
                    this.S = new Socket(split[1], Integer.parseInt(split[2]));
                    this.U = new PrintWriter(this.S.getOutputStream(), true);
                    this.T = new BufferedReader(new InputStreamReader(this.S.getInputStream()));
                    C0032k.a("~~~~~~~~~~~~~~~~~~~~connecting: ~~~~~~~~~~~~~~~~~~~~~~~~~");
                    this.aa = new C0025d(this);
                    this.aa.start();
                    this.U.write("ST|" + V + "|" + Y + "\n");
                    this.U.flush();
                } catch (IOException e) {
                    C0032k.a("connection error = " + e.getMessage());
                    a("Unable to connect to the server.\nPlease try again.\n[Press Any Key]", (byte) 8, (Object) null);
                }
            }
        }
    }

    public void d(String str) {
        Icon[][] s;
        int r;
        int u;
        int v;
        Icon[][] s2;
        int r2;
        int u2;
        int v2;
        C0004ad c0004ad;
        Icon[][] s3;
        int r3;
        int u3;
        int v3;
        Icon[][] s4;
        int r4;
        int u4;
        int v4;
        Icon[][] s5;
        int r5;
        int u5;
        int v5;
        Icon[][] s6;
        int r6;
        int u6;
        int v6;
        C0032k.a("GameStates(processColonyReceive): Received Message " + str);
        String[] split = str.split("\\|");
        C0032k.a("process colony " + str);
        C0032k.a("current state = " + ((int) this.qm));
        C0032k.a("current colony state = " + ((int) this.ab));
        switch (this.qm) {
            case C0000a.bc /* 17 */:
                f(split);
                break;
            case C0000a.bd /* 18 */:
                a(split);
                break;
            case C0000a.bf /* 20 */:
                g(split);
                break;
            case C0000a.bg /* 21 */:
                b(split);
                return;
            case C0000a.bh /* 22 */:
                c(split);
                if (!split[0].equals("CS") && !split[0].equals("AP")) {
                    return;
                }
                break;
        }
        switch (this.ab) {
            case 4:
                C0032k.a("process cafe msg");
                f(split);
                break;
            case 5:
                a(split);
                break;
            case 7:
                g(split);
                break;
        }
        if (split[0].equalsIgnoreCase(C0022ax.s)) {
            aX.e = split[4];
            aX.f = Integer.parseInt(split[5]);
            a((byte) 21, (Object) null);
        } else if (split[0].equalsIgnoreCase(C0022ax.q)) {
            this.al = new int[2];
            this.al[0] = 0;
            this.al[1] = 1;
            this.am = new String[2];
            this.am[0] = C0022ax.b(split[1], split[2], Long.parseLong(split[3]));
            this.am[1] = C0022ax.c(split[1], split[2], Long.parseLong(split[3]));
            if (split[2].equalsIgnoreCase("M")) {
                this.ac.a(this.ad, split[1] + " would like to invite you for mission:\n" + this.un.a(Long.parseLong(split[3])).b(), this.ae, this.af, this.ag, this.ah, MastersOfDestiny.C, this.ai, this.aj, this.ak, this.al, this.am);
            }
            if (split[2].equalsIgnoreCase("A")) {
                this.ac.a(this.ad, split[1] + " would like to invite you to explore:\n" + this.uo.a(Long.parseLong(split[3])).b(), this.ae, this.af, this.ag, this.ah, MastersOfDestiny.C, this.ai, this.aj, this.ak, this.al, this.am);
            }
            if (split[2].equalsIgnoreCase("P")) {
                this.ac.a(this.ad, split[1] + " would like to invite you to enter the battle:\n" + this.uo.a(Long.parseLong(split[3])).b(), this.ae, this.af, this.ag, this.ah, MastersOfDestiny.C, this.ai, this.aj, this.ak, this.al, this.am);
            }
        } else if (split[0].equalsIgnoreCase(C0022ax.g)) {
            for (int i = 0; i < this.ac.a().size(); i++) {
                aG aGVar = (aG) this.ac.a().get(i);
                if (((String) aGVar.f(0)).startsWith(C0022ax.r) || ((String) aGVar.f(0)).startsWith(C0022ax.u)) {
                    this.ac.a(aGVar);
                    return;
                }
            }
        } else if (split[0].equals("SI")) {
            try {
                this.aa.a();
                this.aa = null;
                this.T = null;
                this.U = null;
                this.S.close();
                this.S = null;
                C0032k.a("colony closed");
                this.ur.a = split[1];
                this.ur.b = Integer.parseInt(split[2]);
                this.S = new Socket(this.ur.a, this.ur.b);
                this.U = new PrintWriter(this.S.getOutputStream(), true);
                this.T = new BufferedReader(new InputStreamReader(this.S.getInputStream()));
                C0032k.a("~~~~~~~~~~~~~~~~~~~~connecting~~~~~~~~~~~~~~~~~~~~~~~~~");
                this.aa = new C0025d(this);
                this.aa.start();
            } catch (IOException e) {
                C0032k.a("connection error = " + e.getMessage());
                a("Unable to connect to the server.\nPlease try again.\n[Press Any Key]", (byte) 8, (Object) null);
            }
        } else if (split[0].equals("CS")) {
            this.rb = false;
            this.U.write("ST|" + V + "|" + Y + "\n");
            this.U.flush();
        } else if (split[0].equals("AP")) {
            if (split[1].equals("N")) {
                try {
                    this.aa.a();
                    this.aa = null;
                    this.T = null;
                    this.U = null;
                    this.S.close();
                    this.S = null;
                    C0032k.a("colony closed");
                    a("Authentication Failed.\nPlease try again.\n[Press Any Key]", (byte) 8, (Object) null);
                } catch (IOException e2) {
                }
            } else if (split[1].equals("Y")) {
                pS.remove(this.oo);
                W = Integer.parseInt(split[2]);
                this.Q = false;
                this.P = false;
                this.R = false;
                this.e = false;
                this.ab = (byte) 0;
                this.G = null;
                if (this.q != null) {
                    this.q.h();
                }
                if (this.r != null) {
                    this.r.h();
                }
                if (this.s != null) {
                    this.s.h();
                }
                if (this.t != null) {
                    this.t.h();
                }
                if (this.u != null) {
                    this.u.h();
                }
                if (this.v != null) {
                    this.v.h();
                }
                if (this.I != null) {
                    this.w.h();
                }
                if (this.p != null) {
                    this.p.m();
                }
                if (this.y != null) {
                    this.y.h();
                }
                if (this.z != null) {
                    this.z.h();
                }
                if (this.A != null) {
                    this.A.h();
                }
                if (this.B != null) {
                    this.B.h();
                }
                if (this.C != null) {
                    this.C.h();
                }
                if (this.x != null) {
                    this.x.m();
                }
                if (this.k != null) {
                    Enumeration elements = this.k.elements();
                    while (elements.hasMoreElements()) {
                        ((C0004ad) elements.nextElement()).h();
                    }
                    this.k.clear();
                } else {
                    this.k = new Hashtable();
                }
                if (this.l != null) {
                    this.l.clear();
                } else {
                    this.l = new Hashtable();
                }
                if (this.F != null) {
                    this.F.m();
                }
                if (this.D != null) {
                    this.D.h();
                }
                if (this.I != null) {
                    this.I.h();
                }
                if (this.J != null) {
                    this.J.h();
                }
                if (this.K != null) {
                    this.K.h();
                }
                if (this.H != null) {
                    this.H.m();
                }
                if (this.M != null) {
                    this.M.m();
                }
                if (this.O != null) {
                    this.O.h();
                }
                if (this.eI != null) {
                    this.eI.b();
                }
                if (this.eP != null) {
                    this.eP.b();
                }
                switch (W) {
                    case 1:
                        Z = "Terra " + split[3];
                        this.c = 72;
                        this.d = 127;
                        if (this.k != null) {
                            Enumeration elements2 = this.k.elements();
                            while (elements2.hasMoreElements()) {
                                C0004ad c0004ad2 = (C0004ad) elements2.nextElement();
                                c0004ad2.B = this.c;
                                c0004ad2.C = this.d;
                            }
                        }
                        a((byte) 23, (Object) null);
                        break;
                    case 2:
                        Z = "Eego " + split[3];
                        this.c = 72;
                        this.d = 127;
                        if (this.k != null) {
                            Enumeration elements3 = this.k.elements();
                            while (elements3.hasMoreElements()) {
                                C0004ad c0004ad3 = (C0004ad) elements3.nextElement();
                                c0004ad3.B = this.c;
                                c0004ad3.C = this.d;
                            }
                        }
                        a((byte) 23, (Object) null);
                        break;
                    case 3:
                        Z = "Yanorium " + split[3];
                        this.c = 72;
                        this.d = 127;
                        if (this.k != null) {
                            Enumeration elements4 = this.k.elements();
                            while (elements4.hasMoreElements()) {
                                C0004ad c0004ad4 = (C0004ad) elements4.nextElement();
                                c0004ad4.B = this.c;
                                c0004ad4.C = this.d;
                            }
                        }
                        a((byte) 23, (Object) null);
                        break;
                    case 4:
                        Z = "Sadhular " + split[3];
                        this.c = 72;
                        this.d = 127;
                        if (this.k != null) {
                            Enumeration elements5 = this.k.elements();
                            while (elements5.hasMoreElements()) {
                                C0004ad c0004ad5 = (C0004ad) elements5.nextElement();
                                c0004ad5.B = this.c;
                                c0004ad5.C = this.d;
                            }
                        }
                        a((byte) 23, (Object) null);
                        break;
                    case 5:
                        Z = "Cacto " + split[3];
                        this.c = 72;
                        this.d = 127;
                        if (this.k != null) {
                            Enumeration elements6 = this.k.elements();
                            while (elements6.hasMoreElements()) {
                                C0004ad c0004ad6 = (C0004ad) elements6.nextElement();
                                c0004ad6.B = this.c;
                                c0004ad6.C = this.d;
                            }
                        }
                        a((byte) 23, (Object) null);
                        break;
                    case 6:
                        Z = "Fira " + split[3];
                        this.c = 132;
                        this.d = 172;
                        if (this.k != null) {
                            Enumeration elements7 = this.k.elements();
                            while (elements7.hasMoreElements()) {
                                ((C0004ad) elements7.nextElement()).B = this.c;
                                ((C0004ad) elements7.nextElement()).C = this.d;
                            }
                        }
                        a((byte) 28, (Object) null);
                        break;
                    case 7:
                        Z = "Artax " + split[3];
                        this.c = 132;
                        this.d = 172;
                        if (this.k != null) {
                            Enumeration elements8 = this.k.elements();
                            while (elements8.hasMoreElements()) {
                                ((C0004ad) elements8.nextElement()).B = this.c;
                                ((C0004ad) elements8.nextElement()).C = this.d;
                            }
                        }
                        a((byte) 28, (Object) null);
                        break;
                    case 8:
                        Z = "Anonk " + split[3];
                        this.c = 132;
                        this.d = 172;
                        if (this.k != null) {
                            Enumeration elements9 = this.k.elements();
                            while (elements9.hasMoreElements()) {
                                ((C0004ad) elements9.nextElement()).B = this.c;
                                ((C0004ad) elements9.nextElement()).C = this.d;
                            }
                        }
                        a((byte) 28, (Object) null);
                        break;
                    case 9:
                        Z = "Anonious " + split[3];
                        this.c = 132;
                        this.d = 172;
                        if (this.k != null) {
                            Enumeration elements10 = this.k.elements();
                            while (elements10.hasMoreElements()) {
                                ((C0004ad) elements10.nextElement()).B = this.c;
                                ((C0004ad) elements10.nextElement()).C = this.d;
                            }
                        }
                        a((byte) 28, (Object) null);
                        break;
                    case 10:
                        Z = "Icex " + split[3];
                        this.c = 132;
                        this.d = 172;
                        if (this.k != null) {
                            Enumeration elements11 = this.k.elements();
                            while (elements11.hasMoreElements()) {
                                ((C0004ad) elements11.nextElement()).B = this.c;
                                ((C0004ad) elements11.nextElement()).C = this.d;
                            }
                        }
                        a((byte) 28, (Object) null);
                        break;
                    case C0000a.aW /* 11 */:
                        Z = "Taikaan " + split[3];
                        this.c = 132;
                        this.d = 172;
                        if (this.k != null) {
                            Enumeration elements12 = this.k.elements();
                            while (elements12.hasMoreElements()) {
                                ((C0004ad) elements12.nextElement()).B = this.c;
                                ((C0004ad) elements12.nextElement()).C = this.d;
                            }
                        }
                        a((byte) 24, (Object) null);
                        break;
                    case C0000a.aX /* 12 */:
                        Z = "Vormix " + split[3];
                        this.c = 132;
                        this.d = 172;
                        if (this.k != null) {
                            Enumeration elements13 = this.k.elements();
                            while (elements13.hasMoreElements()) {
                                ((C0004ad) elements13.nextElement()).B = this.c;
                                ((C0004ad) elements13.nextElement()).C = this.d;
                            }
                        }
                        a((byte) 24, (Object) null);
                        break;
                    case C0000a.aY /* 13 */:
                        Z = "Crapucus " + split[3];
                        this.c = 132;
                        this.d = 172;
                        if (this.k != null) {
                            Enumeration elements14 = this.k.elements();
                            while (elements14.hasMoreElements()) {
                                ((C0004ad) elements14.nextElement()).B = this.c;
                                ((C0004ad) elements14.nextElement()).C = this.d;
                            }
                        }
                        a((byte) 24, (Object) null);
                        break;
                    case C0000a.aZ /* 14 */:
                        Z = "Actzen " + split[3];
                        this.c = 132;
                        this.d = 172;
                        if (this.k != null) {
                            Enumeration elements15 = this.k.elements();
                            while (elements15.hasMoreElements()) {
                                ((C0004ad) elements15.nextElement()).B = this.c;
                                ((C0004ad) elements15.nextElement()).C = this.d;
                            }
                        }
                        a((byte) 24, (Object) null);
                        break;
                    case 15:
                        Z = "Cheeza " + split[3];
                        this.c = 132;
                        this.d = 172;
                        if (this.k != null) {
                            Enumeration elements16 = this.k.elements();
                            while (elements16.hasMoreElements()) {
                                ((C0004ad) elements16.nextElement()).B = this.c;
                                ((C0004ad) elements16.nextElement()).C = this.d;
                            }
                        }
                        a((byte) 24, (Object) null);
                        break;
                    case C0000a.bb /* 16 */:
                        Z = "Brucana " + split[3];
                        this.c = 72;
                        this.d = 127;
                        if (this.k != null) {
                            Enumeration elements17 = this.k.elements();
                            while (elements17.hasMoreElements()) {
                                C0004ad c0004ad7 = (C0004ad) elements17.nextElement();
                                c0004ad7.B = this.c;
                                c0004ad7.C = this.d;
                            }
                        }
                        a((byte) 30, (Object) null);
                        break;
                    case C0000a.bc /* 17 */:
                        Z = "Cactora " + split[3];
                        this.c = 72;
                        this.d = 127;
                        if (this.k != null) {
                            Enumeration elements18 = this.k.elements();
                            while (elements18.hasMoreElements()) {
                                C0004ad c0004ad8 = (C0004ad) elements18.nextElement();
                                c0004ad8.B = this.c;
                                c0004ad8.C = this.d;
                            }
                        }
                        a((byte) 30, (Object) null);
                        break;
                    case C0000a.bd /* 18 */:
                        Z = "Capmucius " + split[3];
                        this.c = 72;
                        this.d = 127;
                        if (this.k != null) {
                            Enumeration elements19 = this.k.elements();
                            while (elements19.hasMoreElements()) {
                                C0004ad c0004ad9 = (C0004ad) elements19.nextElement();
                                c0004ad9.B = this.c;
                                c0004ad9.C = this.d;
                            }
                        }
                        a((byte) 30, (Object) null);
                        break;
                    case C0000a.be /* 19 */:
                        Z = "Yippox " + split[3];
                        this.c = 72;
                        this.d = 127;
                        if (this.k != null) {
                            Enumeration elements20 = this.k.elements();
                            while (elements20.hasMoreElements()) {
                                C0004ad c0004ad10 = (C0004ad) elements20.nextElement();
                                c0004ad10.B = this.c;
                                c0004ad10.C = this.d;
                            }
                        }
                        a((byte) 30, (Object) null);
                        break;
                    case C0000a.bf /* 20 */:
                        Z = "Zenaidura " + split[3];
                        this.c = 72;
                        this.d = 127;
                        if (this.k != null) {
                            Enumeration elements21 = this.k.elements();
                            while (elements21.hasMoreElements()) {
                                C0004ad c0004ad11 = (C0004ad) elements21.nextElement();
                                c0004ad11.B = this.c;
                                c0004ad11.C = this.d;
                            }
                        }
                        a((byte) 30, (Object) null);
                        break;
                }
            }
            this.rb = true;
        } else if (split[0].equals("IS")) {
            String a = oK == 1 ? a("res/colony/Human_intro.txt") : oK == 2 ? a("res/colony/Taikuus_intro.txt") : oK == 3 ? a("res/colony/Firan_intro.txt") : a("res/colony/Brucian_intro.txt");
            if (this.gy) {
                this.gA = a;
                return;
            }
            this.gn.a(a, 16777215, 16777215);
            this.gn.a((byte) 2);
            this.gy = true;
        } else if (split[0].equals("I1")) {
            C0032k.a("curstate = " + ((int) this.qm));
            pS.o.enable();
            pS.p.enable();
            pS.q.enable();
            pS.r.enable();
            X = new Long(split[5]).longValue();
            if (Integer.parseInt(split[10]) == -1) {
                S a2 = this.ur.D.a(oK, oL);
                s5 = a2.b();
                r5 = a2.a();
                u5 = a2.f();
                v5 = a2.g();
            } else {
                D a3 = this.pT.a(split[10]);
                s5 = a3.s();
                r5 = a3.r();
                u5 = a3.u();
                v5 = a3.v();
            }
            if (Integer.parseInt(split[11]) == -1) {
                S b = this.ur.D.b(oK, oM);
                s6 = b.b();
                r6 = b.a();
                u6 = b.f();
                v6 = b.g();
            } else {
                D a4 = this.pT.a(split[11]);
                s6 = a4.s();
                r6 = a4.r();
                u6 = a4.u();
                v6 = a4.v();
            }
            a(oI, split[1], s5, r5, u5, v5, s6, r6, u6, v6, Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), oK, oL, oM);
            if (this.rc) {
                return;
            }
            if (this.gy) {
                this.gA = a("res/colony/1.txt");
                return;
            }
            this.gn.a(a("res/colony/1.txt"), 16777215, 16777215);
            this.gn.a((byte) 2);
            this.gy = true;
            this.rc = true;
        } else if (split[0].equals("I2")) {
            int parseInt = Integer.parseInt(split[7]);
            int parseInt2 = Integer.parseInt(split[8]);
            int parseInt3 = Integer.parseInt(split[9]);
            C0032k.a("race = " + parseInt + "; hair = " + parseInt2 + "; armor = " + parseInt3);
            if (Integer.parseInt(split[10]) == -1) {
                S a5 = this.ur.D.a(parseInt, parseInt2);
                s3 = a5.b();
                r3 = a5.a();
                u3 = a5.f();
                v3 = a5.g();
            } else {
                D a6 = this.pT.a(split[10]);
                s3 = a6.s();
                r3 = a6.r();
                u3 = a6.u();
                v3 = a6.v();
            }
            if (Integer.parseInt(split[11]) == -1) {
                S b2 = this.ur.D.b(parseInt, parseInt3);
                s4 = b2.b();
                r4 = b2.a();
                u4 = b2.f();
                v4 = b2.g();
            } else {
                D a7 = this.pT.a(split[11]);
                s4 = a7.s();
                r4 = a7.r();
                u4 = a7.u();
                v4 = a7.v();
            }
            a(Long.parseLong(split[1]), split[2], s3, r3, u3, v3, s4, r4, u4, v4, Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5]), parseInt, parseInt2, parseInt3);
            this.pR.a(split[1], split[2] + "|" + parseInt + "|" + split[6]);
            this.U.write("RPD\n");
            this.U.flush();
        } else if (split[0].equals("I3")) {
            if (this.rb) {
                int parseInt4 = Integer.parseInt(split[7]);
                int parseInt5 = Integer.parseInt(split[8]);
                int parseInt6 = Integer.parseInt(split[9]);
                if (Integer.parseInt(split[10]) == -1) {
                    S a8 = this.ur.D.a(parseInt4, parseInt5);
                    s = a8.b();
                    r = a8.a();
                    u = a8.f();
                    v = a8.g();
                } else {
                    D a9 = this.pT.a(split[10]);
                    s = a9.s();
                    r = a9.r();
                    u = a9.u();
                    v = a9.v();
                }
                if (Integer.parseInt(split[11]) == -1) {
                    S b3 = this.ur.D.b(parseInt4, parseInt6);
                    s2 = b3.b();
                    r2 = b3.a();
                    u2 = b3.f();
                    v2 = b3.g();
                } else {
                    D a10 = this.pT.a(split[11]);
                    s2 = a10.s();
                    r2 = a10.r();
                    u2 = a10.u();
                    v2 = a10.v();
                }
                a(Long.parseLong(split[1]), split[2], s, r, u, v, s2, r2, u2, v2, Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5]), parseInt4, parseInt5, parseInt6);
                if (((C0004ad) this.k.get(new Long(split[1]))) != null) {
                    this.pR.a(split[1], split[2] + "|" + parseInt4 + "|" + split[6]);
                    if (this.eP != null) {
                        this.eP.a(c0004ad.E + " enters " + this.pY[W - 1], 9962039, 9962039);
                        this.eP.a((byte) 3);
                    }
                }
                if (this.ab == 5) {
                    int parseInt7 = Integer.parseInt(split[6]);
                    String[] a11 = this.pP.a();
                    for (int i2 = 0; i2 < a11.length; i2++) {
                        C0032k.a("buddies " + i2 + " : " + a11[i2]);
                        if (a11[i2].equalsIgnoreCase(split[2])) {
                            this.lt.b.add(parseInt4 + "|" + parseInt7 + "|" + a11[i2]);
                            return;
                        }
                    }
                    this.lt.c.add(parseInt4 + "|" + parseInt7 + "|" + split[2]);
                }
                if (this.ab == 7) {
                    int parseInt8 = Integer.parseInt(split[6]);
                    String[] a12 = this.pP.a();
                    for (int i3 = 0; i3 < a12.length; i3++) {
                        C0032k.a("buddies " + i3 + " : " + a12[i3]);
                        if (a12[i3].equalsIgnoreCase(split[2])) {
                            this.lJ.b.add(parseInt4 + "|" + parseInt8 + "|" + a12[i3]);
                            return;
                        }
                    }
                    this.lJ.c.add(parseInt4 + "|" + parseInt8 + "|" + split[2]);
                }
            }
        } else if (split[0].equals("I4")) {
            int parseInt9 = Integer.parseInt(split[3]);
            int parseInt10 = Integer.parseInt(split[2]);
            if (parseInt9 > 0) {
                D a13 = this.pT.a(split[1]);
                C0020av c0020av = new C0020av();
                c0020av.a(a13);
                c0020av.a(1);
                c0020av.a(parseInt9, (byte) 0);
                this.G.M.add(c0020av);
                if (parseInt10 > 1) {
                    parseInt9 = 0;
                    parseInt10--;
                }
            }
            if (parseInt9 != 0 || parseInt10 <= 0) {
                return;
            }
            D a14 = this.pT.a(split[1]);
            C0020av c0020av2 = new C0020av();
            c0020av2.a(a14);
            c0020av2.a(parseInt10);
            this.G.H[a14.h()].add(c0020av2);
        } else if (split[0].equals("I5")) {
            int parseInt11 = Integer.parseInt(split[3]);
            C0004ad c0004ad12 = (C0004ad) this.k.get(new Long(split[1]));
            if (parseInt11 > 0) {
                D a15 = this.pT.a(split[2]);
                C0020av c0020av3 = new C0020av();
                c0020av3.a(a15);
                c0020av3.a(1);
                c0020av3.a(parseInt11, (byte) 0);
            }
        } else if (!split[0].equals("I6")) {
            if (split[0].equals(rp)) {
                if (this.k == null || !this.k.containsKey(new Long(split[1]))) {
                    return;
                }
                String str2 = Long.parseLong(split[1]) == ((long) oI) ? "You have levelled up!" : ((C0004ad) this.k.get(new Long(split[1]))).E + " has levelled up!";
                C0032k.a(str2);
                if (this.eP == null) {
                    this.eR = str2;
                    return;
                }
                C0032k.a("system info != null");
                this.eP.a(str2, 13960102, 13960102);
                this.eP.a((byte) 3);
            } else if (split[0].equals("G1")) {
                String str3 = "The server will shut down in " + split[1];
                String str4 = Integer.parseInt(split[1]) > 1 ? str3 + " minutes." : str3 + " minute.";
                if (this.eP != null) {
                    this.eP.a(str4, 7683328, 7683328);
                    this.eP.a((byte) 3);
                }
            } else if (split[0].equals("G2")) {
                String str5 = split[2];
                if (this.eP != null) {
                    this.eP.a(str5, 7683328, 7683328);
                    this.eP.a((byte) 3);
                }
            } else if (split[0].equals("CT")) {
                C0004ad c0004ad13 = (C0004ad) this.k.get(new Long(split[1]));
                if (c0004ad13 == null || this.eI == null) {
                    return;
                }
                this.eI.a(c0004ad13.E + ": " + split[2], 16711680, 0);
                this.eI.a((byte) 3);
                String str6 = split[2];
                try {
                    str6 = new String(str6.getBytes(), "UTF-8");
                } catch (UnsupportedEncodingException e3) {
                    C0032k.a(e3);
                }
                c0004ad13.a(str6);
            } else if (split[0].equals("WK")) {
                if (this.k == null || !this.k.containsKey(new Long(split[1]))) {
                    return;
                }
                C0004ad c0004ad14 = (C0004ad) this.k.get(new Long(split[1]));
                if (c0004ad14 != null) {
                    c0004ad14.l();
                    c0004ad14.c(c0004ad14.f(Integer.parseInt(split[2])), c0004ad14.g(Integer.parseInt(split[3])));
                } else if (this.l != null) {
                    this.l.put(new Long(split[1]), str);
                }
            } else if (split[0].equals("KA")) {
                this.U.write("KA|" + V + "|" + Y + "\n");
                this.U.flush();
            } else if (split[0].equals(rr)) {
                try {
                    this.aa.a();
                    this.aa = null;
                    this.T = null;
                    this.U = null;
                    this.S.close();
                    this.S = null;
                    C0032k.a("colony closed");
                    a("Connection with the server is lost.\nPlease try again.\n[Press Any Key]", (byte) 8, (Object) null);
                } catch (IOException e4) {
                }
            } else if (split[0].equals("LV")) {
                if (this.rb) {
                    AbstractC0003ac abstractC0003ac = (AbstractC0003ac) this.k.get(new Long(split[1]));
                    if (abstractC0003ac != null) {
                        C0032k.a(((C0004ad) abstractC0003ac).E + " leaves");
                        abstractC0003ac.h();
                        this.F.b(abstractC0003ac);
                        if (this.eP != null) {
                            this.eP.a(((C0004ad) abstractC0003ac).E + " has left", 9962039, 9962039);
                            this.eP.a((byte) 3);
                        }
                    }
                    this.pR.a(split[1]);
                    this.l.remove(new Long(split[1]));
                    if (this.dp == null || !this.dp.equals(sm + Long.parseLong(split[1]))) {
                        return;
                    }
                    this.cC = false;
                    this.dK = false;
                    this.dL = false;
                    this.cJ = false;
                    this.dp = null;
                    for (int i4 = 0; i4 < this.cU.size(); i4++) {
                        C0020av c0020av4 = (C0020av) this.cU.get(i4);
                        int indexOf = this.G.H[c0020av4.a().h()].indexOf(c0020av4);
                        if (indexOf == -1) {
                            this.G.H[c0020av4.a().h()].add((C0020av) c0020av4.clone());
                        } else {
                            ((C0020av) this.G.H[c0020av4.a().h()].elementAt(indexOf)).a(((C0020av) this.G.H[c0020av4.a().h()].elementAt(indexOf)).b() + c0020av4.b());
                        }
                    }
                    this.cU = new Vector();
                    this.cT = new Vector();
                    this.cI = false;
                    X += this.cW;
                    this.cW = 0;
                    this.cV = 0;
                    pS.remove(pS.r);
                    this.dc = 0;
                    this.eP.a("Trade cancelled", 7549, 7549);
                    this.eP.a((byte) 3);
                }
            } else if (split[0].equals("EM")) {
                C0032k.a("emoticon = " + str);
                C0004ad c0004ad15 = (C0004ad) this.k.get(new Long(split[1]));
                if (c0004ad15 == null || this.eI == null) {
                    return;
                }
                switch (Integer.parseInt(split[2])) {
                    case 0:
                        this.eI.a(c0004ad15.E + ": *smiles*", 16711680, 0);
                        break;
                    case 1:
                        this.eI.a(c0004ad15.E + ": *frowns*", 16711680, 0);
                        break;
                    case 2:
                        this.eI.a(c0004ad15.E + ": *SOS*", 16711680, 0);
                        break;
                    case 3:
                        this.eI.a(c0004ad15.E + ": *grateful*", 16711680, 0);
                        break;
                    case 4:
                        this.eI.a(c0004ad15.E + ": *sobs*", 16711680, 0);
                        break;
                    case 5:
                        this.eI.a(c0004ad15.E + ": *heart flutters*", 16711680, 0);
                        break;
                    case 6:
                        this.eI.a(c0004ad15.E + ": *blushes*", 16711680, 0);
                        break;
                    case 7:
                        this.eI.a(c0004ad15.E + ": *shocked*", 16711680, 0);
                        break;
                    case 8:
                        this.eI.a(c0004ad15.E + ": *grins*", 16711680, 0);
                        break;
                    case 9:
                        this.eI.a(c0004ad15.E + ": *yawns*", 16711680, 0);
                        break;
                    case 10:
                        this.eI.a(c0004ad15.E + ": *waves*", 16711680, 0);
                        break;
                }
                this.eI.a((byte) 3);
                c0004ad15.e(Integer.parseInt(split[2]));
            } else if (split[0].equals(rx)) {
                try {
                    this.aa.a();
                    this.aa = null;
                    this.T = null;
                    this.U = null;
                    this.S.close();
                    this.S = null;
                    C0032k.a("colony closed");
                    this.G = null;
                    if (this.q != null) {
                        this.q.h();
                    }
                    if (this.r != null) {
                        this.r.h();
                    }
                    if (this.s != null) {
                        this.s.h();
                    }
                    if (this.t != null) {
                        this.t.h();
                    }
                    if (this.u != null) {
                        this.u.h();
                    }
                    if (this.v != null) {
                        this.v.h();
                    }
                    if (this.I != null) {
                        this.w.h();
                    }
                    if (this.p != null) {
                        this.p.m();
                    }
                    if (this.y != null) {
                        this.y.h();
                    }
                    if (this.z != null) {
                        this.z.h();
                    }
                    if (this.A != null) {
                        this.A.h();
                    }
                    if (this.B != null) {
                        this.B.h();
                    }
                    if (this.C != null) {
                        this.C.h();
                    }
                    if (this.x != null) {
                        this.x.m();
                    }
                    if (this.k != null) {
                        Enumeration elements22 = this.k.elements();
                        while (elements22.hasMoreElements()) {
                            ((C0004ad) elements22.nextElement()).h();
                        }
                        this.k.clear();
                    }
                    if (this.F != null) {
                        this.F.m();
                    }
                    if (this.D != null) {
                        this.D.h();
                    }
                    if (this.I != null) {
                        this.I.h();
                    }
                    if (this.J != null) {
                        this.J.h();
                    }
                    if (this.K != null) {
                        this.K.h();
                    }
                    if (this.H != null) {
                        this.H.m();
                    }
                    if (this.M != null) {
                        this.M.m();
                    }
                    if (this.O != null) {
                        this.O.h();
                    }
                    this.eI.b();
                    this.eP.b();
                    this.bZ = new Vector();
                    this.ca = new Vector();
                    a("Duplicate login!\n[Press Any Key]", (byte) 8, (Object) null);
                } catch (IOException e5) {
                }
            } else if (split[0].equals("WS")) {
                C0021aw.b.a(C0028g.e);
                if (this.eI != null) {
                    this.eI.a(split[1] + " speaks to you: " + split[2], 9831166, 0);
                    this.eI.a((byte) 3);
                }
            } else if (split[0].equals("U2")) {
                for (int i5 = 0; i5 < this.G.H[3].size(); i5++) {
                    C0020av c0020av5 = (C0020av) this.G.H[3].get(i5);
                    if (c0020av5.a().a() == Long.parseLong(split[1])) {
                        if (c0020av5.b() > 1) {
                            c0020av5.a(c0020av5.b() - 1);
                        } else {
                            this.G.H[3].remove(i5);
                        }
                        this.gb = -1;
                        this.gc = -1L;
                        return;
                    }
                }
            } else if (split[0].equals(tX)) {
                this.eP.a(this.gd[Integer.parseInt(split[2]) - 1], 8651009, 8651009);
                this.eP.a((byte) 3);
                this.gb = -1;
                this.gc = -1L;
            } else if (split[0].equals("P2") || split[0].equals("P3")) {
                this.hs.add(split[1]);
                this.ht.add(split[2]);
            } else if (split[0].equals("P5")) {
                this.hr = false;
                this.he = -1;
                a("Sorry\n" + this.pY[this.hf - 1] + " is fully occupied.\nPlease try again later.[Press Any Key]", (byte) 14, (Object) null);
            } else if (split[0].equals("P6")) {
                this.hr = false;
                this.he = -1;
                a("Sorry\nYou do not have enough sidos.\nPlease try again later.[Press Any Key]", (byte) 14, (Object) null);
            } else if (split[0].equals(rF)) {
                try {
                    this.aa.a();
                    this.aa = null;
                    this.T = null;
                    this.U = null;
                    this.S.close();
                    this.S = null;
                    C0032k.a("colony closed");
                    this.G = null;
                    this.k.clear();
                    this.q.h();
                    this.r.h();
                    this.s.h();
                    this.t.h();
                    this.u.h();
                    this.v.h();
                    this.w.h();
                    this.p.m();
                    if (this.y != null) {
                        this.y.h();
                    }
                    this.z.h();
                    if (this.A != null) {
                        this.A.h();
                    }
                    this.B.h();
                    this.C.h();
                    this.x.m();
                    Enumeration elements23 = this.k.elements();
                    while (elements23.hasMoreElements()) {
                        ((C0004ad) elements23.nextElement()).h();
                    }
                    this.k.clear();
                    this.F.m();
                    this.D.h();
                    this.I.h();
                    this.J.h();
                    this.K.h();
                    this.H.m();
                    this.M.m();
                    this.O.h();
                    pS.g.remove(0, pS.g.getLength());
                    this.ur.a = split[1];
                    this.ur.b = Integer.parseInt(split[2]);
                    this.S = new Socket(split[1], Integer.parseInt(split[2]));
                    this.U = new PrintWriter(this.S.getOutputStream(), true);
                    this.T = new BufferedReader(new InputStreamReader(this.S.getInputStream()));
                    C0032k.a("~~~~~~~~~~~~~~~~~~~~connecting~~~~~~~~~~~~~~~~~~~~~~~~~");
                    this.aa = new C0025d(this);
                    this.aa.start();
                } catch (BadLocationException e6) {
                    C0032k.a("problem in deleting history: " + e6.getMessage());
                } catch (IOException e7) {
                    C0032k.a("connection error = " + e7.getMessage());
                    a("Unable to connect to the server.\nPlease try again.\n[Press Any Key]", (byte) 8, (Object) null);
                }
            } else if (split[0].equals(rG)) {
                X = new Long(split[1]).longValue();
            } else if (split[0].equals(sd)) {
                this.pP.a(split[1], split[2], split[3]);
            } else if (split[0].equals("SN")) {
                this.qk = (byte) -1;
                this.O.g();
                this.O.a("Sorry, no merchants available.", (Object) null);
            } else if (!split[0].equals(rJ)) {
                if (split[0].equals(rK)) {
                    this.qk = (byte) 3;
                    if (this.O.e()) {
                        this.O.a(split[2], split[1]);
                    }
                } else if (split[0].equals(rM)) {
                    C0032k.a("shopitems = " + str);
                    D a16 = this.pT.a(split[1]);
                    C0020av c0020av6 = new C0020av();
                    c0020av6.a(a16);
                    c0020av6.a(Long.parseLong(split[2]));
                    c0020av6.a(Integer.parseInt(split[3]));
                    a(c0020av6);
                } else if (split[0].equals(rQ)) {
                    try {
                        this.js.insertString(this.js.getLength(), "\n You bought ", pS.h);
                        this.js.insertString(this.js.getLength(), this.jk.getText() + " " + this.jo, pS.l);
                        this.jr.setCaretPosition(this.js.getLength());
                    } catch (BadLocationException e8) {
                        C0032k.a(e8.getMessage());
                    }
                } else if (split[0].equals(rO)) {
                    try {
                        this.js.insertString(this.js.getLength(), "\n You do not have enough sidos to buy ", pS.j);
                        this.js.insertString(this.js.getLength(), this.jk.getText() + " " + this.jo, pS.k);
                        this.jr.setCaretPosition(this.js.getLength());
                    } catch (BadLocationException e9) {
                        C0032k.a(e9.getMessage());
                    }
                } else if (split[0].equals(sb)) {
                    X = Long.parseLong(split[1]);
                } else if (split[0].equals(rP)) {
                    try {
                        this.js.insertString(this.js.getLength(), "\n The shop has inadequate stock for the purchase of ", pS.j);
                        this.js.insertString(this.js.getLength(), this.jk.getText() + " " + this.jo, pS.k);
                        this.jr.setCaretPosition(this.js.getLength());
                    } catch (BadLocationException e10) {
                        C0032k.a(e10.getMessage());
                    }
                    for (int i6 = 0; i6 < this.hV.length; i6++) {
                        Enumeration elements24 = this.hV[i6].elements();
                        int i7 = 0;
                        while (elements24.hasMoreElements()) {
                            if (this.jn == ((C0020av) elements24.nextElement()).a().a()) {
                                ((C0020av) this.hV[i6].elementAt(i7)).a(Integer.parseInt(split[1]));
                            }
                            i7++;
                        }
                    }
                } else if (split[0].equals(rS)) {
                    for (int i8 = 0; i8 < this.G.H.length; i8++) {
                        Enumeration elements25 = this.G.H[i8].elements();
                        int i9 = 0;
                        while (elements25.hasMoreElements()) {
                            if (Long.parseLong(split[2]) == ((C0020av) elements25.nextElement()).a().a()) {
                                ((C0020av) this.G.H[i8].elementAt(i9)).a(Long.parseLong(split[3]));
                            }
                            i9++;
                        }
                    }
                } else if (split[0].equals(rY)) {
                    try {
                        this.js.insertString(this.js.getLength(), "\n You sold ", pS.h);
                        this.js.insertString(this.js.getLength(), this.jk.getText() + " " + this.jo, pS.l);
                        this.jr.setCaretPosition(this.js.getLength());
                    } catch (BadLocationException e11) {
                        C0032k.a(e11.getMessage());
                    }
                } else if (split[0].equals(rX)) {
                    try {
                        this.js.insertString(this.js.getLength(), "\n You do not have ", pS.j);
                        this.js.insertString(this.js.getLength(), this.jk.getText() + " " + this.jo, pS.k);
                        this.js.insertString(this.js.getLength(), " to sell ", pS.j);
                        this.jr.setCaretPosition(this.js.getLength());
                    } catch (BadLocationException e12) {
                        C0032k.a(e12.getMessage());
                    }
                    for (int i10 = 0; i10 < this.G.H.length; i10++) {
                        Enumeration elements26 = this.G.H[i10].elements();
                        int i11 = 0;
                        while (elements26.hasMoreElements()) {
                            if (((C0020av) elements26.nextElement()).a().a() == this.jn) {
                                ((C0020av) this.G.H[i10].elementAt(i11)).a(Integer.parseInt(split[1]));
                            }
                            i11++;
                        }
                    }
                } else if (split[0].equals(rZ)) {
                    int parseInt12 = Integer.parseInt(split[3]);
                    int parseInt13 = Integer.parseInt(split[2]);
                    if (parseInt12 > 0) {
                        parseInt13--;
                    }
                    long parseLong = Long.parseLong(split[1]);
                    boolean z = false;
                    for (int i12 = 0; i12 < this.G.H.length; i12++) {
                        Enumeration elements27 = this.G.H[i12].elements();
                        int i13 = 0;
                        while (elements27.hasMoreElements()) {
                            if (((C0020av) elements27.nextElement()).a().a() == parseLong) {
                                if (parseInt13 <= 0) {
                                    this.G.H[i12].remove(i13);
                                } else {
                                    ((C0020av) this.G.H[i12].elementAt(i13)).a(parseInt13);
                                }
                                z = true;
                            }
                            i13++;
                        }
                    }
                    if (!z && parseInt13 > 0) {
                        D a17 = this.pT.a(split[1]);
                        C0020av c0020av7 = new C0020av();
                        c0020av7.a(a17);
                        c0020av7.a(parseInt13);
                        this.G.H[a17.h()].add(c0020av7);
                    }
                    this.U.write("S20|" + this.O.n().toString() + "\n");
                    this.U.flush();
                } else if (split[0].equals(sa)) {
                    if (split[1].equals(this.O.n().toString())) {
                        C0032k.a("in here");
                        int parseInt14 = Integer.parseInt(split[4]);
                        long parseLong2 = Long.parseLong(split[2]);
                        boolean z2 = false;
                        for (int i14 = 0; i14 < this.hV.length; i14++) {
                            Enumeration elements28 = this.hV[i14].elements();
                            int i15 = 0;
                            while (true) {
                                if (!elements28.hasMoreElements()) {
                                    break;
                                } else if (((C0020av) elements28.nextElement()).a().a() == parseLong2) {
                                    if (parseInt14 > 0 || parseInt14 == -1) {
                                        ((C0020av) this.hV[i14].elementAt(i15)).a(parseInt14);
                                        ((C0020av) this.hV[i14].elementAt(i15)).a(Long.parseLong(split[3]));
                                    } else {
                                        this.hV[i14].remove(i15);
                                    }
                                    z2 = true;
                                } else {
                                    i15++;
                                }
                            }
                        }
                        if (z2) {
                            return;
                        }
                        if (parseInt14 > 0 || parseInt14 == -1) {
                            D a18 = this.pT.a(split[2]);
                            C0020av c0020av8 = new C0020av();
                            c0020av8.a(a18);
                            c0020av8.a(parseInt14);
                            c0020av8.a(Long.parseLong(split[3]));
                            this.hV[a18.h()].add(c0020av8);
                        }
                    }
                } else if (split[0].equals(tG)) {
                    D a19 = this.pT.a(split[1]);
                    C0020av c0020av9 = new C0020av();
                    c0020av9.a(a19);
                    c0020av9.a(Integer.parseInt(split[2]));
                    b(c0020av9);
                } else if (!split[0].equals(tR)) {
                    if (split[0].equals(tI)) {
                        try {
                            this.js.insertString(this.js.getLength(), "\n You put ", pS.h);
                            this.js.insertString(this.js.getLength(), this.jk.getText() + " " + this.jo, pS.l);
                            this.js.insertString(this.js.getLength(), " into your locker", pS.h);
                            this.jr.setCaretPosition(this.js.getLength());
                        } catch (BadLocationException e13) {
                            C0032k.a(e13.getMessage());
                        }
                    } else if (split[0].equals(tT)) {
                        X = Long.parseLong(split[1]);
                    } else if (split[0].equals(tN)) {
                        try {
                            this.js.insertString(this.js.getLength(), "\n You got ", pS.h);
                            this.js.insertString(this.js.getLength(), this.jk.getText() + " " + this.jo, pS.l);
                            this.js.insertString(this.js.getLength(), " from your locker", pS.h);
                            this.jr.setCaretPosition(this.js.getLength());
                        } catch (BadLocationException e14) {
                            C0032k.a(e14.getMessage());
                        }
                    } else if (split[0].equals(tO)) {
                        try {
                            this.js.insertString(this.js.getLength(), "\n You do not have ", pS.j);
                            this.js.insertString(this.js.getLength(), this.jk.getText() + " " + this.jo, pS.k);
                            this.js.insertString(this.js.getLength(), " to withdraw ", pS.j);
                            this.jr.setCaretPosition(this.js.getLength());
                        } catch (BadLocationException e15) {
                            C0032k.a(e15.getMessage());
                        }
                    } else if (split[0].equals(tK)) {
                        try {
                            this.js.insertString(this.js.getLength(), "\n You do not have enough", pS.j);
                            this.js.insertString(this.js.getLength(), " currency to withdraw ", pS.j);
                            this.jr.setCaretPosition(this.js.getLength());
                        } catch (BadLocationException e16) {
                            C0032k.a(e16.getMessage());
                        }
                    } else if (split[0].equals(tL)) {
                        try {
                            this.js.insertString(this.js.getLength(), "\n You do not have ", pS.j);
                            this.js.insertString(this.js.getLength(), this.jk.getText() + " " + this.jo, pS.k);
                            this.js.insertString(this.js.getLength(), " to deposit ", pS.j);
                            this.jr.setCaretPosition(this.js.getLength());
                        } catch (BadLocationException e17) {
                            C0032k.a(e17.getMessage());
                        }
                    } else if (split[0].equals(tU)) {
                        if (this.ab == 3) {
                            if (this.hw == 1) {
                                try {
                                    this.js.insertString(this.js.getLength(), "\n You will be encumbered if you withdraw ", pS.j);
                                    this.js.insertString(this.js.getLength(), this.jk.getText() + " " + this.jo, pS.k);
                                    this.jr.setCaretPosition(this.js.getLength());
                                } catch (BadLocationException e18) {
                                    C0032k.a(e18.getMessage());
                                }
                            } else {
                                try {
                                    this.js.insertString(this.js.getLength(), "\n You will be encumbered if you buy ", pS.j);
                                    this.js.insertString(this.js.getLength(), this.jk.getText() + " " + this.jo, pS.k);
                                    this.jr.setCaretPosition(this.js.getLength());
                                } catch (BadLocationException e19) {
                                    C0032k.a(e19.getMessage());
                                }
                            }
                        }
                        if (this.ab == 2) {
                            if (this.hw == 0) {
                                try {
                                    this.js.insertString(this.js.getLength(), "\n You will be encumbered if you buy ", pS.j);
                                    this.js.insertString(this.js.getLength(), this.jk.getText() + " " + this.jo, pS.k);
                                    this.jr.setCaretPosition(this.js.getLength());
                                } catch (BadLocationException e20) {
                                    C0032k.a(e20.getMessage());
                                }
                            }
                        } else if (this.ab == 0 && this.cC) {
                            this.cC = false;
                            this.dK = false;
                            this.dL = false;
                            this.cJ = false;
                            this.dp = null;
                            pS.remove(pS.r);
                            for (int i16 = 0; i16 < this.cU.size(); i16++) {
                                C0020av c0020av10 = (C0020av) this.cU.get(i16);
                                int indexOf2 = this.G.H[c0020av10.a().h()].indexOf(c0020av10);
                                if (indexOf2 == -1) {
                                    this.G.H[c0020av10.a().h()].add((C0020av) c0020av10.clone());
                                } else {
                                    ((C0020av) this.G.H[c0020av10.a().h()].elementAt(indexOf2)).a(((C0020av) this.G.H[c0020av10.a().h()].elementAt(indexOf2)).b() + c0020av10.b());
                                }
                            }
                            this.cU = new Vector();
                            this.cT = new Vector();
                            X += this.cW;
                            this.cW = 0;
                            this.cV = 0;
                            this.cI = false;
                            this.dc = 0;
                            this.eP.a("This transaction will cause you to be encumbered. Trade cancelled.", 7549, 7549);
                            this.eP.a((byte) 3);
                        }
                    } else if (split[0].equals(tS)) {
                        int parseInt15 = Integer.parseInt(split[3]);
                        int parseInt16 = Integer.parseInt(split[2]);
                        if (parseInt15 > 0) {
                            parseInt16--;
                        }
                        long parseLong3 = Long.parseLong(split[1]);
                        boolean z3 = false;
                        for (int i17 = 0; i17 < this.G.H.length && !z3; i17++) {
                            Enumeration elements29 = this.G.H[i17].elements();
                            int i18 = 0;
                            while (true) {
                                if (!elements29.hasMoreElements()) {
                                    break;
                                } else if (((C0020av) elements29.nextElement()).a().a() == parseLong3) {
                                    if (parseInt16 > 0) {
                                        ((C0020av) this.G.H[i17].elementAt(i18)).a(parseInt16);
                                    } else {
                                        this.G.H[i17].remove(i18);
                                    }
                                    z3 = true;
                                } else {
                                    i18++;
                                }
                            }
                        }
                        if (z3) {
                            return;
                        }
                        D a20 = this.pT.a(split[1]);
                        C0020av c0020av11 = new C0020av();
                        c0020av11.a(a20);
                        c0020av11.a(parseInt16);
                        this.G.H[a20.h()].add(c0020av11);
                    } else if (split[0].equals(tJ)) {
                        long parseLong4 = Long.parseLong(split[1]);
                        int parseInt17 = Integer.parseInt(split[2]);
                        boolean z4 = false;
                        for (int i19 = 0; i19 < this.hW.length; i19++) {
                            Enumeration elements30 = this.hW[i19].elements();
                            int i20 = 0;
                            while (elements30.hasMoreElements()) {
                                C0020av c0020av12 = (C0020av) elements30.nextElement();
                                if (c0020av12.a().a() == parseLong4) {
                                    if (parseInt17 == 0) {
                                        this.hW[i19].remove(c0020av12);
                                    } else {
                                        ((C0020av) this.hW[i19].elementAt(i20)).a(parseInt17);
                                    }
                                    z4 = true;
                                }
                                i20++;
                            }
                        }
                        if (z4) {
                            return;
                        }
                        D a21 = this.pT.a(split[1]);
                        C0020av c0020av13 = new C0020av();
                        c0020av13.a(a21);
                        c0020av13.a(Integer.parseInt(split[2]));
                        this.hW[a21.h()].add(c0020av13);
                    } else if (split[0].equals(sf)) {
                        this.eP.a("Sorry " + split[1] + " is offline and can't authorise you", 86567, 86567);
                        this.eP.a((byte) 3);
                    } else if (split[0].equals("BA")) {
                        if (split[2].equals("Y")) {
                            this.eP.a(split[1] + " accepted your buddy request", 86567, 86567);
                            this.eP.a((byte) 3);
                            this.pP.a(split[1], "online", split[3]);
                        } else if (split[2].equals("N")) {
                            this.eP.a(split[1] + " rejected your buddy request", 86567, 86567);
                            this.eP.a((byte) 3);
                        }
                    } else if (split[0].equals(se)) {
                        if (this.rb) {
                            this.an = new int[2];
                            this.an[0] = 0;
                            this.an[1] = 1;
                            this.ao = new String[2];
                            this.ao[0] = "BA|" + split[1] + "|Y|" + split[3] + "\n";
                            this.ao[1] = "BA|" + split[1] + "|N|0\n";
                            this.ac.a(this.ad, split[1] + " sends you an buddy request ", this.ae, this.af, this.ag, this.ah, MastersOfDestiny.C, this.ai, this.aj, this.ak, this.an, this.ao);
                        }
                    } else if (split[0].equals(sh)) {
                        this.pP.a(split[1]);
                    } else if (split[0].equals(th)) {
                        this.pR.a(split[1], split[2] + "|" + split[3] + "|" + split[4]);
                    } else if (split[0].equals(tk)) {
                        this.eP.a(this.pR.b(split[1]) + " is offline", 7549, 7549);
                        this.eP.a((byte) 3);
                    } else if (split[0].equals(tl)) {
                        this.eP.a(this.pR.b(split[1]) + " is participating in another trade", 7549, 7549);
                        this.eP.a((byte) 3);
                    } else if (split[0].equals(tD)) {
                        this.eP.a(this.pR.b(split[1]) + " is encumbered and cannot trade with you.", 7549, 7549);
                        this.eP.a((byte) 3);
                    } else if (split[0].equals(tE)) {
                        this.eP.a("Please lighten your inventory before trading!", 7549, 7549);
                        this.eP.a((byte) 3);
                    } else if (split[0].equals(tm)) {
                        this.eP.a("You cannot request for more than one trade at the same time", 7549, 7549);
                        this.eP.a((byte) 3);
                    } else if (split[0].equals(tw)) {
                        this.cC = false;
                        this.dK = false;
                        this.dL = false;
                        this.cJ = false;
                        this.dp = null;
                        pS.remove(pS.r);
                        for (int i21 = 0; i21 < this.cU.size(); i21++) {
                            C0020av c0020av14 = (C0020av) this.cU.get(i21);
                            int indexOf3 = this.G.H[c0020av14.a().h()].indexOf(c0020av14);
                            if (indexOf3 == -1) {
                                this.G.H[c0020av14.a().h()].add((C0020av) c0020av14.clone());
                            } else {
                                ((C0020av) this.G.H[c0020av14.a().h()].elementAt(indexOf3)).a(((C0020av) this.G.H[c0020av14.a().h()].elementAt(indexOf3)).b() + c0020av14.b());
                            }
                        }
                        this.cU = new Vector();
                        this.cT = new Vector();
                        this.cI = false;
                        X += this.cW;
                        this.cW = 0;
                        this.cV = 0;
                        this.dc = 0;
                        this.eP.a("You do not have enough item to trade", 7549, 7549);
                        this.eP.a((byte) 3);
                    } else if (split[0].equals(tA)) {
                        this.cC = false;
                        this.dK = false;
                        this.dp = null;
                        this.dL = false;
                        this.cJ = false;
                        pS.remove(pS.r);
                        for (int i22 = 0; i22 < this.cU.size(); i22++) {
                            C0020av c0020av15 = (C0020av) this.cU.get(i22);
                            int indexOf4 = this.G.H[c0020av15.a().h()].indexOf(c0020av15);
                            if (indexOf4 == -1) {
                                this.G.H[c0020av15.a().h()].add((C0020av) c0020av15.clone());
                            } else {
                                ((C0020av) this.G.H[c0020av15.a().h()].elementAt(indexOf4)).a(((C0020av) this.G.H[c0020av15.a().h()].elementAt(indexOf4)).b() + c0020av15.b());
                            }
                        }
                        this.cU = new Vector();
                        this.cT = new Vector();
                        this.cI = false;
                        X += this.cW;
                        this.cW = 0;
                        this.cV = 0;
                        this.dc = 0;
                        this.eP.a("You do not have item to trade", 7549, 7549);
                        this.eP.a((byte) 3);
                    } else if (split[0].equals(tB)) {
                        this.cC = false;
                        this.dK = false;
                        this.dL = false;
                        this.cJ = false;
                        this.dp = null;
                        pS.remove(pS.r);
                        for (int i23 = 0; i23 < this.cU.size(); i23++) {
                            C0020av c0020av16 = (C0020av) this.cU.get(i23);
                            int indexOf5 = this.G.H[c0020av16.a().h()].indexOf(c0020av16);
                            if (indexOf5 == -1) {
                                this.G.H[c0020av16.a().h()].add((C0020av) c0020av16.clone());
                            } else {
                                ((C0020av) this.G.H[c0020av16.a().h()].elementAt(indexOf5)).a(((C0020av) this.G.H[c0020av16.a().h()].elementAt(indexOf5)).b() + c0020av16.b());
                            }
                        }
                        this.cU = new Vector();
                        this.cT = new Vector();
                        this.cI = false;
                        X += this.cW;
                        this.cW = 0;
                        this.cV = 0;
                        this.dc = 0;
                        this.eP.a("You do not have enough balance to trade", 7549, 7549);
                        this.eP.a((byte) 3);
                    } else if (split[0].equals(tx)) {
                        String b4 = this.pR.b(split[1]);
                        this.cC = false;
                        this.dK = false;
                        this.dL = false;
                        this.cJ = false;
                        this.dp = null;
                        pS.remove(pS.r);
                        for (int i24 = 0; i24 < this.cU.size(); i24++) {
                            C0020av c0020av17 = (C0020av) this.cU.get(i24);
                            int indexOf6 = this.G.H[c0020av17.a().h()].indexOf(c0020av17);
                            if (indexOf6 == -1) {
                                this.G.H[c0020av17.a().h()].add((C0020av) c0020av17.clone());
                            } else {
                                ((C0020av) this.G.H[c0020av17.a().h()].elementAt(indexOf6)).a(((C0020av) this.G.H[c0020av17.a().h()].elementAt(indexOf6)).b() + c0020av17.b());
                            }
                        }
                        this.cU = new Vector();
                        this.cT = new Vector();
                        X += this.cW;
                        this.cW = 0;
                        this.cV = 0;
                        this.cI = false;
                        this.dc = 0;
                        this.eP.a(b4 + " cancelled the trade", 7549, 7549);
                        this.eP.a((byte) 3);
                    } else if (split[0].equals(tr)) {
                        this.cC = true;
                        this.aA = -1;
                        pS.add(pS.r);
                        pS.r.setText("0");
                        this.dp = split[1];
                    } else if (split[0].equals(tq)) {
                        this.eP.a(this.pR.b(split[1]) + " rejected your trading request", 7549, 7549);
                        this.eP.a((byte) 3);
                    } else if (split[0].equals(tt)) {
                        int parseInt18 = Integer.parseInt(split[3]);
                        D a22 = this.pT.a(split[2]);
                        C0020av c0020av18 = new C0020av();
                        c0020av18.a(a22);
                        c0020av18.a(parseInt18);
                        this.cT.add(c0020av18);
                    } else if (split[0].equals(tz)) {
                        this.cV = Integer.parseInt(split[2]);
                    } else if (split[0].equals(tv)) {
                        this.cC = false;
                        this.dK = false;
                        this.dL = false;
                        this.cJ = false;
                        this.dp = null;
                        pS.remove(pS.r);
                        for (int i25 = 0; i25 < this.cT.size(); i25++) {
                            C0020av c0020av19 = (C0020av) this.cT.get(i25);
                            int indexOf7 = this.G.H[c0020av19.a().h()].indexOf(c0020av19);
                            if (indexOf7 == -1) {
                                this.G.H[c0020av19.a().h()].add((C0020av) c0020av19.clone());
                            } else {
                                ((C0020av) this.G.H[c0020av19.a().h()].elementAt(indexOf7)).a(((C0020av) this.G.H[c0020av19.a().h()].elementAt(indexOf7)).b() + c0020av19.b());
                            }
                        }
                        this.cU = new Vector();
                        this.cT = new Vector();
                        this.cI = false;
                        X += this.cV;
                        this.cW = 0;
                        this.cV = 0;
                        this.dc = 0;
                        this.eP.a("Trade successful!", 7549, 7549);
                        this.eP.a((byte) 3);
                    } else if (split[0].equals(tu)) {
                        this.dK = true;
                    } else if (split[0].equals(tn)) {
                        if (this.rb) {
                            this.ac.a(this.ad, this.pR.b(split[1]) + " sends you a trade request ", this.ae, this.af, this.ag, this.ah, MastersOfDestiny.C, this.ai, this.aj, this.ak, new int[]{0, 1}, new String[]{"T5|" + split[1] + "\n", "T4|" + split[1] + "\n"});
                        }
                    } else if (split[0].equals("PI")) {
                        this.G.p(Long.parseLong(split[1]));
                        this.G.b(Long.parseLong(split[2]));
                        this.G.k(Long.parseLong(split[3]));
                        this.G.h(Long.parseLong(split[4]));
                        this.G.i(Long.parseLong(split[5]));
                        this.G.g(Long.parseLong(split[6]));
                        this.G.l(Long.parseLong(split[7]));
                        this.G.c(Long.parseLong(split[8]));
                        this.G.f(Long.parseLong(split[9]));
                        this.G.j(Long.parseLong(split[10]));
                        this.G.m(Long.parseLong(split[11]));
                        this.G.n(Long.parseLong(split[12]));
                        this.G.o(Long.parseLong(split[13]));
                        this.ca = new Vector();
                    } else if (split[0].equals("PW")) {
                        this.G.e(Long.parseLong(split[1]));
                        this.G.d(Long.parseLong(split[2]));
                        if (this.G.q() > this.G.p()) {
                            if (this.eP == null) {
                                this.eQ = "You are encumbered!";
                                return;
                            }
                            this.eP.a("You are encumbered!", 16711680, 16711680);
                            this.eP.a((byte) 3);
                        }
                    } else if (split[0].equals("PS")) {
                        aQ a23 = this.um.a(Long.parseLong(split[1]));
                        this.ca.add(a23);
                        for (int i26 = 0; i26 < this.bZ.size(); i26++) {
                            C0039s c0039s = (C0039s) this.bZ.get(i26);
                            if (c0039s.a().equalsIgnoreCase(a23.b())) {
                                if (a23.q() == 0) {
                                    c0039s.a(a23.c() + 1);
                                    return;
                                } else {
                                    this.bZ.remove(i26);
                                    return;
                                }
                            }
                        }
                    } else if (split[0].equals(sV)) {
                        aQ a24 = this.um.a(Long.parseLong(split[1]));
                        for (int i27 = 0; i27 < this.bZ.size(); i27++) {
                            C0039s c0039s2 = (C0039s) this.bZ.get(i27);
                            if (c0039s2.a().equalsIgnoreCase(a24.b())) {
                                c0039s2.a(a24.c());
                                c0039s2.a(true);
                                C0032k.a("AS: skill " + c0039s2.a() + " learnable");
                                return;
                            }
                        }
                    } else if (split[0].equals(sX)) {
                        aQ a25 = this.um.a(Long.parseLong(split[1]));
                        int i28 = 0;
                        while (true) {
                            if (i28 < this.bZ.size()) {
                                C0039s c0039s3 = (C0039s) this.bZ.get(i28);
                                if (c0039s3.a().equalsIgnoreCase(a25.b())) {
                                    c0039s3.a(false);
                                } else {
                                    i28++;
                                }
                            }
                        }
                        this.eP.a("You have successfully learnt skill " + a25.b() + " level " + a25.c(), 5636448, 5636448);
                        this.eP.a((byte) 3);
                    } else if (split[0].equals(sY)) {
                        this.eP.a("You haven't learnt previous level of skill " + this.um.a(Long.parseLong(split[1])).b(), 5636448, 5636448);
                        this.eP.a((byte) 3);
                    } else if (split[0].equals(sZ)) {
                        this.eP.a("Your race cannot learn skill " + this.um.a(Long.parseLong(split[1])).b(), 5636448, 5636448);
                        this.eP.a((byte) 3);
                    } else if (split[0].equals(ta)) {
                        aQ a26 = this.um.a(Long.parseLong(split[1]));
                        this.eP.a("Your level cannot learn skill " + a26.b() + " level " + (a26.c() - 1), 5636448, 5636448);
                        this.eP.a((byte) 3);
                    } else if (split[0].equals(tb)) {
                        this.eP.a("You haven't trained to learn " + this.um.a(Long.parseLong(split[1])).n() + " type skill", 5636448, 5636448);
                        this.eP.a((byte) 3);
                    } else if (split[0].equals(tc)) {
                        aQ a27 = this.um.a(Long.parseLong(split[1]));
                        this.eP.a("You don't have enough skill point to learn skill " + a27.b() + " level " + a27.c(), 5636448, 5636448);
                        this.eP.a((byte) 3);
                    } else if (split[0].equals(td)) {
                        aQ a28 = this.um.a(Long.parseLong(split[1]));
                        this.eP.a("You have already learnt " + a28.b() + " level " + a28.c(), 5636448, 5636448);
                        this.eP.a((byte) 3);
                    } else if (split[0].equals(sR)) {
                        C0032k.a("current quest " + split[1] + ":" + split[2]);
                        this.pQ.a(Long.parseLong(split[1]), Long.parseLong(split[2]), Long.parseLong(split[3]), "current");
                        this.bq.add(Long.valueOf(split[1]));
                    } else if (split[0].equals(sS)) {
                        this.pQ.a(Long.parseLong(split[1]), Long.parseLong(split[2]), 2L, "completed");
                        this.br.add(Long.valueOf(split[1]));
                    } else if (split[0].equals(sj)) {
                        int parseInt19 = Integer.parseInt(split[2]);
                        if (this.gj != null) {
                            if (parseInt19 <= 0) {
                                if (parseInt19 != 0 || this.gm) {
                                    return;
                                }
                                int indexOf8 = this.G.H[this.gj.a().h()].indexOf(this.gj);
                                if (indexOf8 == -1) {
                                    this.gj.b(0);
                                    this.G.H[this.gj.a().h()].add((C0020av) this.gj.clone());
                                } else {
                                    ((C0020av) this.G.H[this.gj.a().h()].elementAt(indexOf8)).a(((C0020av) this.G.H[this.gj.a().h()].elementAt(indexOf8)).b() + 1);
                                }
                                switch (this.gj.a().j()) {
                                    case 1:
                                        S a29 = this.ur.D.a(oK, oL);
                                        this.G.N = a29.b();
                                        this.G.O = a29.f();
                                        this.G.P = a29.g();
                                        this.G.Q = a29.a();
                                        break;
                                    case 2:
                                        S b5 = this.ur.D.b(oK, oM);
                                        this.G.R = b5.b();
                                        this.G.S = b5.f();
                                        this.G.T = b5.g();
                                        this.G.U = b5.a();
                                        break;
                                }
                                this.gj = null;
                                return;
                            }
                            Enumeration elements31 = this.G.M.elements();
                            int i29 = 0;
                            while (true) {
                                if (elements31.hasMoreElements()) {
                                    if (((C0020av) elements31.nextElement()).d() == parseInt19) {
                                        if (this.G.H[((C0020av) this.G.M.elementAt(i29)).a().h()].indexOf((C0020av) this.G.M.elementAt(i29)) == -1) {
                                            this.G.H[((C0020av) this.G.M.elementAt(i29)).a().h()].add(this.G.M.elementAt(i29));
                                        } else {
                                            ((C0020av) this.G.H[((C0020av) this.G.M.elementAt(i29)).a().h()].elementAt(this.G.H[((C0020av) this.G.M.elementAt(i29)).a().h()].indexOf((C0020av) this.G.M.elementAt(i29)))).a(((C0020av) this.G.H[((C0020av) this.G.M.elementAt(i29)).a().h()].elementAt(this.G.H[((C0020av) this.G.M.elementAt(i29)).a().h()].indexOf((C0020av) this.G.M.elementAt(i29)))).b() + 1);
                                        }
                                        this.G.M.removeElementAt(i29);
                                    } else {
                                        i29++;
                                    }
                                }
                            }
                            this.G.M.addElement((C0020av) this.gj.clone());
                            C0020av c0020av20 = (C0020av) this.G.M.elementAt(this.G.M.size() - 1);
                            Icon[][] a30 = c0020av20.a(parseInt19, (byte) 0);
                            if (a30 != null) {
                                switch (parseInt19) {
                                    case 1:
                                        this.G.N = a30;
                                        this.G.O = c0020av20.a.u();
                                        this.G.P = c0020av20.a.v();
                                        this.G.Q = c0020av20.a.r();
                                        break;
                                    case 2:
                                        this.G.R = a30;
                                        this.G.S = c0020av20.a.u();
                                        this.G.T = c0020av20.a.v();
                                        this.G.U = c0020av20.a.r();
                                        break;
                                }
                            }
                            this.gj = null;
                        }
                    } else if (split[0].equals(sl)) {
                        int parseInt20 = Integer.parseInt(split[2]);
                        if (this.gj != null) {
                            if (parseInt20 <= 0) {
                                if (parseInt20 != 0 || this.gm) {
                                    return;
                                }
                                this.G.M.addElement((C0020av) this.gj.clone());
                                this.gj = null;
                                return;
                            }
                            int indexOf9 = this.G.H[this.gj.a().h()].indexOf(this.gj);
                            if (indexOf9 == -1) {
                                this.gj.b(0);
                                this.G.H[this.gj.a().h()].add((C0020av) this.gj.clone());
                            } else {
                                ((C0020av) this.G.H[this.gj.a().h()].elementAt(indexOf9)).a(((C0020av) this.G.H[this.gj.a().h()].elementAt(indexOf9)).b() + 1);
                            }
                            this.eP.a("You cannot equip " + this.gj.a().c() + "!", 16711680, 16711680);
                            this.eP.a((byte) 3);
                        }
                    } else if (split[0].equals(sk)) {
                        int parseInt21 = Integer.parseInt(split[3]);
                        C0004ad c0004ad16 = (C0004ad) this.k.get(new Long(split[1]));
                        if (parseInt21 > 0 && c0004ad16 != null) {
                            D a31 = this.pT.a(split[2]);
                            C0020av c0020av21 = new C0020av();
                            c0020av21.a(a31);
                            c0020av21.a(1);
                            Icon[][] a32 = c0020av21.a(parseInt21, (byte) 0);
                            if (a32 != null) {
                                switch (parseInt21) {
                                    case 1:
                                        c0004ad16.N = a32;
                                        c0004ad16.O = c0020av21.a.u();
                                        c0004ad16.P = c0020av21.a.v();
                                        c0004ad16.Q = c0020av21.a.r();
                                        break;
                                    case 2:
                                        c0004ad16.R = a32;
                                        c0004ad16.S = c0020av21.a.u();
                                        c0004ad16.T = c0020av21.a.v();
                                        c0004ad16.U = c0020av21.a.r();
                                        break;
                                }
                            }
                            c0004ad16.M.add(c0020av21);
                            return;
                        }
                        C0032k.a("unequip");
                        for (int i30 = 0; i30 < c0004ad16.M.size(); i30++) {
                            C0032k.a("i = " + i30);
                            C0032k.a("name = " + ((C0020av) c0004ad16.M.elementAt(i30)).a().c());
                            C0032k.a("((Item)gamer.equip.elementAt(i)).getItemDetails().getID() = " + ((C0020av) c0004ad16.M.elementAt(i30)).a().a());
                            C0032k.a("Long.parseLong(parts[1]) = " + Long.parseLong(split[1]));
                            if (((C0020av) c0004ad16.M.elementAt(i30)).a().a() == Long.parseLong(split[2])) {
                                switch (((C0020av) c0004ad16.M.elementAt(i30)).a().j()) {
                                    case 1:
                                        S a33 = this.ur.D.a(c0004ad16.m(), c0004ad16.C());
                                        c0004ad16.N = a33.b();
                                        c0004ad16.O = a33.f();
                                        c0004ad16.P = a33.g();
                                        c0004ad16.Q = a33.a();
                                        break;
                                    case 2:
                                        S b6 = this.ur.D.b(c0004ad16.m(), c0004ad16.D());
                                        c0004ad16.R = b6.b();
                                        c0004ad16.S = b6.f();
                                        c0004ad16.T = b6.g();
                                        c0004ad16.U = b6.a();
                                        break;
                                }
                                C0032k.a("same and remove");
                                c0004ad16.M.removeElementAt(i30);
                            } else {
                                C0032k.a("not the same");
                            }
                            C0032k.a("---------------------------------");
                        }
                    } else if (!split[0].equals(sp)) {
                        if (split[0].equals(so)) {
                            this.ls = true;
                        } else if (split[0].equals(sq)) {
                            C0020av c0020av22 = new C0020av();
                            c0020av22.a(this.pT.a(split[1]));
                            c0020av22.a(Long.parseLong(split[2]));
                            c0020av22.a(Integer.parseInt(split[3]));
                            c(c0020av22);
                        } else if (split[0].equals(st)) {
                            try {
                                this.js.insertString(this.js.getLength(), "\n You do not have enough sidos to buy ", pS.j);
                                this.js.insertString(this.js.getLength(), this.jk.getText() + " " + this.jo, pS.k);
                                this.jr.setCaretPosition(this.js.getLength());
                            } catch (BadLocationException e21) {
                                C0032k.a(e21.getMessage());
                            }
                        } else if (split[0].equals(su)) {
                            try {
                                this.js.insertString(this.js.getLength(), "\n The shop has inadequate stock for the purchase of ", pS.j);
                                this.js.insertString(this.js.getLength(), this.jk.getText() + " " + this.jo, pS.k);
                                this.jr.setCaretPosition(this.js.getLength());
                            } catch (BadLocationException e22) {
                                C0032k.a(e22.getMessage());
                            }
                            Enumeration elements32 = this.ko.elements();
                            int i31 = 0;
                            while (elements32.hasMoreElements()) {
                                if (this.jn == ((C0020av) elements32.nextElement()).a().a()) {
                                    ((C0020av) this.ko.elementAt(i31)).a(Integer.parseInt(split[1]));
                                }
                                i31++;
                            }
                        } else if (split[0].equals(sv)) {
                            try {
                                this.js.insertString(this.js.getLength(), "\n You bought ", pS.h);
                                this.js.insertString(this.js.getLength(), this.jk.getText() + " " + this.jo, pS.l);
                                this.jr.setCaretPosition(this.js.getLength());
                            } catch (BadLocationException e23) {
                                C0032k.a(e23.getMessage());
                            }
                        } else if (split[0].equals(sw)) {
                            int parseInt22 = Integer.parseInt(split[3]);
                            int parseInt23 = Integer.parseInt(split[2]);
                            if (parseInt22 > 0) {
                                parseInt23--;
                            }
                            long parseLong5 = Long.parseLong(split[1]);
                            boolean z5 = false;
                            for (int i32 = 0; i32 < this.G.H.length; i32++) {
                                Enumeration elements33 = this.G.H[i32].elements();
                                int i33 = 0;
                                while (true) {
                                    if (!elements33.hasMoreElements()) {
                                        break;
                                    } else if (((C0020av) elements33.nextElement()).a().a() == parseLong5) {
                                        if (parseInt23 > 0) {
                                            ((C0020av) this.G.H[i32].elementAt(i33)).a(parseInt23);
                                        } else {
                                            this.G.H[i32].remove(i33);
                                        }
                                        z5 = true;
                                    } else {
                                        i33++;
                                    }
                                }
                            }
                            if (!z5 && parseInt23 > 0) {
                                D a34 = this.pT.a(split[1]);
                                C0020av c0020av23 = new C0020av();
                                c0020av23.a(a34);
                                c0020av23.a(parseInt23);
                                this.G.H[a34.h()].add(c0020av23);
                            }
                            this.U.write("H13\n");
                            this.U.flush();
                        } else if (split[0].equals(sx)) {
                            X = Long.parseLong(split[1]);
                        } else if (split[0].equals(sy)) {
                            C0032k.a("in here");
                            long parseLong6 = Long.parseLong(split[1]);
                            boolean z6 = false;
                            int parseInt24 = Integer.parseInt(split[3]);
                            Enumeration elements34 = this.ko.elements();
                            int i34 = 0;
                            while (true) {
                                if (elements34.hasMoreElements()) {
                                    if (((C0020av) elements34.nextElement()).a().a() == parseLong6) {
                                        if (parseInt24 > 0 || parseInt24 == -1) {
                                            ((C0020av) this.ko.elementAt(i34)).a(parseInt24);
                                            ((C0020av) this.ko.elementAt(i34)).a(Long.parseLong(split[2]));
                                        } else {
                                            this.ko.remove(i34);
                                        }
                                        z6 = true;
                                    } else {
                                        i34++;
                                    }
                                }
                            }
                            if (z6) {
                                return;
                            }
                            if (parseInt24 > 0 || parseInt24 == -1) {
                                D a35 = this.pT.a(split[1]);
                                C0020av c0020av24 = new C0020av();
                                c0020av24.a(a35);
                                c0020av24.a(Integer.parseInt(split[3]));
                                c0020av24.a(Long.parseLong(split[2]));
                                this.ko.add(c0020av24);
                            }
                        } else if (split[0].equals(sD)) {
                            try {
                                this.js.insertString(this.js.getLength(), "\n You do not have ", pS.j);
                                this.js.insertString(this.js.getLength(), this.jk.getText() + " " + this.jo, pS.k);
                                this.js.insertString(this.js.getLength(), " to sell ", pS.j);
                                this.jr.setCaretPosition(this.js.getLength());
                            } catch (BadLocationException e24) {
                                C0032k.a(e24.getMessage());
                            }
                            for (int i35 = 0; i35 < this.G.H.length; i35++) {
                                Enumeration elements35 = this.G.H[i35].elements();
                                int i36 = 0;
                                while (elements35.hasMoreElements()) {
                                    if (((C0020av) elements35.nextElement()).a().a() == this.jn) {
                                        ((C0020av) this.G.H[i35].elementAt(i36)).a(Integer.parseInt(split[1]));
                                    }
                                    i36++;
                                }
                            }
                        } else if (split[0].equals(sE)) {
                            try {
                                this.js.insertString(this.js.getLength(), "\n You sold ", pS.h);
                                this.js.insertString(this.js.getLength(), this.jk.getText() + " " + this.jo, pS.l);
                                this.jr.setCaretPosition(this.js.getLength());
                            } catch (BadLocationException e25) {
                                C0032k.a(e25.getMessage());
                            }
                        } else if (split[0].equals(sF)) {
                            int parseInt25 = Integer.parseInt(split[3]);
                            int parseInt26 = Integer.parseInt(split[2]);
                            if (parseInt25 > 0) {
                                parseInt26--;
                            }
                            long parseLong7 = Long.parseLong(split[1]);
                            boolean z7 = false;
                            for (int i37 = 0; i37 < this.G.H.length; i37++) {
                                Enumeration elements36 = this.G.H[i37].elements();
                                int i38 = 0;
                                while (true) {
                                    if (!elements36.hasMoreElements()) {
                                        break;
                                    } else if (((C0020av) elements36.nextElement()).a().a() == parseLong7) {
                                        if (parseInt26 > 0) {
                                            ((C0020av) this.G.H[i37].elementAt(i38)).a(parseInt26);
                                        } else {
                                            this.G.H[i37].remove(i38);
                                        }
                                        z7 = true;
                                    } else {
                                        i38++;
                                    }
                                }
                            }
                            if (z7 || parseInt26 <= 0) {
                                return;
                            }
                            D a36 = this.pT.a(split[1]);
                            C0020av c0020av25 = new C0020av();
                            c0020av25.a(a36);
                            c0020av25.a(parseInt26);
                            this.G.H[a36.h()].add(c0020av25);
                        } else if (split[0].equals(sG)) {
                            X = Long.parseLong(split[1]);
                        } else if (split[0].equals(sH)) {
                            C0032k.a("in here");
                            long parseLong8 = Long.parseLong(split[1]);
                            int parseInt27 = Integer.parseInt(split[3]);
                            boolean z8 = false;
                            Enumeration elements37 = this.ko.elements();
                            int i39 = 0;
                            while (true) {
                                if (elements37.hasMoreElements()) {
                                    if (((C0020av) elements37.nextElement()).a().a() == parseLong8) {
                                        if (parseInt27 > 0 || parseInt27 == -1) {
                                            ((C0020av) this.ko.elementAt(i39)).a(parseInt27);
                                            ((C0020av) this.ko.elementAt(i39)).a(Long.parseLong(split[2]));
                                        } else {
                                            this.ko.remove(i39);
                                        }
                                        z8 = true;
                                    } else {
                                        i39++;
                                    }
                                }
                            }
                            if (z8) {
                                return;
                            }
                            if (parseInt27 > 0 || parseInt27 == -1) {
                                D a37 = this.pT.a(split[1]);
                                C0020av c0020av26 = new C0020av();
                                c0020av26.a(a37);
                                c0020av26.a(parseInt27);
                                c0020av26.a(Long.parseLong(split[2]));
                                this.ko.add(c0020av26);
                            }
                        } else if (!split[0].equals(sJ)) {
                            if (split[0].equals(sK)) {
                                for (int i40 = 0; i40 < this.G.H.length; i40++) {
                                    Enumeration elements38 = this.G.H[i40].elements();
                                    int i41 = 0;
                                    while (elements38.hasMoreElements()) {
                                        if (Long.parseLong(split[1]) == ((C0020av) elements38.nextElement()).a().a()) {
                                            ((C0020av) this.G.H[i40].elementAt(i41)).a(Long.parseLong(split[2]));
                                        }
                                        i41++;
                                    }
                                }
                            } else if (split[0].equals(sN)) {
                                try {
                                    this.js.insertString(this.js.getLength(), "\n Your healing is successful.", pS.h);
                                    this.jr.setCaretPosition(this.js.getLength());
                                } catch (BadLocationException e26) {
                                    C0032k.a(e26.getMessage());
                                }
                                X = Long.parseLong(split[3]);
                                this.G.b(Long.parseLong(split[1]));
                                this.G.g(Long.parseLong(split[2]));
                            } else if (split[0].equals(sO)) {
                                try {
                                    this.js.insertString(this.js.getLength(), "\n You do not have enough sidos to buy this heal option ", pS.j);
                                    this.jr.setCaretPosition(this.js.getLength());
                                } catch (BadLocationException e27) {
                                    C0032k.a(e27.getMessage());
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    void a(long j, String str, Icon[][] iconArr, int i, int i2, int i3, Icon[][] iconArr2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        try {
            C0032k.a("spawning char");
            C0004ad c0004ad = (C0004ad) this.pX.a(Class.forName("ad"));
            C0032k.a("spawn id-" + j);
            c0004ad.D = j;
            C0032k.a("nick = " + str);
            c0004ad.E = str;
            C0032k.a("char_nick = " + c0004ad.E);
            c0004ad.B = this.c;
            c0004ad.C = this.d;
            c0004ad.al = c0004ad.f(i7);
            c0004ad.am = c0004ad.g(i8);
            String str2 = (String) this.l.get(new Long(j));
            if (str2 != null) {
                String[] split = str2.split("\\|");
                c0004ad.al = c0004ad.f(Integer.parseInt(split[2]));
                c0004ad.am = c0004ad.g(Integer.parseInt(split[3]));
                i9 = Integer.parseInt(split[4]);
            }
            C0032k.a(c0004ad.al);
            C0032k.a(c0004ad.am);
            if (i9 > 7) {
                i9 -= 8;
            }
            c0004ad.d(i9);
            c0004ad.a(30, 43);
            c0004ad.b(8, 8);
            c0004ad.e(25, 10);
            c0004ad.E();
            c0004ad.av = c0004ad.ap;
            c0004ad.aw = c0004ad.aq;
            c0004ad.a(i10);
            c0004ad.b(i11);
            c0004ad.c(i12);
            if (c0004ad.D == oI) {
                c0004ad.G = this.U;
                c0004ad.F = Color.RED;
                c0004ad.a(iconArr, i, i2, i3, iconArr2, i4, i5, i6, this.i, this.ur.n, this.ur.o);
                this.G = c0004ad;
            } else {
                c0004ad.F = Color.DARK_GRAY;
                c0004ad.a(iconArr, i, i2, i3, iconArr2, i4, i5, i6, this.h, this.ur.n, this.ur.o);
            }
            c0004ad.g();
            this.k.put(new Long(j), c0004ad);
            C0032k.a("before put char in group");
            this.F.a(c0004ad);
            C0032k.a("after put char in group");
        } catch (ClassNotFoundException e) {
            C0032k.a(e.getMessage());
        }
    }

    void A(Object obj) {
        C0032k.a((String) this.ub.elementAt(0));
        C0032k.a(this.pW.b("en", 179));
        C0032k.a(this.pW.b("en", 180));
        MastersOfDestiny mastersOfDestiny = pS;
        C0032k.a(MastersOfDestiny.E);
        int b = this.pW.b("en", 179);
        int b2 = this.pW.b("en", 180);
        MastersOfDestiny mastersOfDestiny2 = pS;
        this.N.a((String) this.ub.elementAt(0), b, b2, 300, 92, MastersOfDestiny.E, this.pW.a("en", 0) + this.pW.a("en", 128));
        this.N.g();
    }

    void A(Graphics graphics) {
        switch (this.qn) {
            case 1:
                y(graphics);
                break;
            case 2:
                u(graphics);
                break;
            case 3:
                s(graphics);
                break;
            case 4:
                q(graphics);
                break;
            case 5:
                e(graphics);
                break;
            case 7:
                a(graphics);
                break;
            case 8:
                x(graphics);
                break;
            case 10:
                w(graphics);
                break;
            case C0000a.aW /* 11 */:
                v(graphics);
                break;
            case C0000a.bd /* 18 */:
                i(graphics);
                break;
            case C0000a.bf /* 20 */:
                p(graphics);
                break;
            case C0000a.bg /* 21 */:
                j(graphics);
                break;
            case C0000a.bh /* 22 */:
                k(graphics);
                break;
            case C0000a.bi /* 23 */:
                a(graphics);
                break;
        }
        this.N.a(graphics, pS);
    }

    void m() {
        a((byte) ((Integer) this.ub.elementAt(1)).intValue(), this.ub.elementAt(2));
        this.ub.removeAllElements();
        if (this.uc == null) {
            this.N.h();
            return;
        }
        pS.remove(this.uc);
        this.uc = null;
    }

    public void a(ActionEvent actionEvent) {
    }

    public void a(String str, byte b, Object obj) {
        this.ub.addElement(str);
        this.ub.addElement(new Integer(b));
        this.ub.addElement(obj);
        a((byte) 13, (Object) null);
    }

    private void p() {
        this.ur.w = null;
        this.lG = null;
        this.lt = null;
        this.lu = null;
        this.lv = null;
        this.lF = null;
        this.lH = null;
        this.lJ = null;
        C0032k.a("GameStates(clearMemory): Clearing State Data");
    }

    public void n() {
    }

    public void o() {
    }
}
