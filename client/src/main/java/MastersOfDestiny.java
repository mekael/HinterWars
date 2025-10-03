package defpackage;

import java.awt.Color;
import java.awt.Container;
import java.awt.DisplayMode;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

/* renamed from: MastersOfDestiny  reason: default package */
/* loaded from: hinterwars.jar:MastersOfDestiny.class */
public class MastersOfDestiny extends JPanel implements WindowListener, MouseMotionListener, MouseListener, KeyListener {
    GameStates a;
    JFrame b;
    Icon c;
    JScrollPane d;
    JScrollBar e;
    JTextPane f;
    Document g;
    SimpleAttributeSet h;
    SimpleAttributeSet i;
    SimpleAttributeSet j;
    SimpleAttributeSet k;
    SimpleAttributeSet l;
    SimpleAttributeSet m;
    SimpleAttributeSet n;
    JTextArea o;
    JTextField p;
    JTextField q;
    JTextField r;
    Container s;
    GraphicsEnvironment t;
    GraphicsDevice[] u;
    DisplayMode[] v;
    private final ClassLoader aq = getClass().getClassLoader();
    private final Image ar = new ImageIcon(this.aq.getResource("res/hw.gif")).getImage();
    boolean w = false;
    public static FontMetrics y;
    public static FontMetrics A;
    public static FontMetrics C;
    public static FontMetrics E;
    public static FontMetrics G;
    public static FontMetrics I;
    public static FontMetrics K;
    public static FontMetrics N;
    public static FontMetrics P;
    public static FontMetrics R;
    public static FontMetrics T;
    public static FontMetrics V;
    public static FontMetrics X;
    public static FontMetrics Z;
    public static FontMetrics ab;
    public static FontMetrics ad;
    public static FontMetrics af;
    public static FontMetrics ah;
    public static FontMetrics aj;
    public static FontMetrics al;
    public static FontMetrics an;
    public static FontMetrics ap;
    public static Font x = new Font("Arial", 0, 10);
    public static Font z = new Font("Arial", 0, 11);
    public static Font B = new Font("Arial", 0, 12);
    public static Font D = new Font("Arial", 1, 12);
    public static Font F = new Font("Arial", 1, 14);
    public static Font H = new Font("Arial", 0, 14);
    public static Font J = new Font("Arial", 0, 16);
    public static Font L = new Font("Impact", 1, 16);
    public static Font M = new Font("BV Boli", 2, 24);
    public static Font O = new Font("BV Boli", 1, 20);
    public static Font Q = new Font("Arial Narrow", 1, 12);
    public static Font S = new Font("Arial Narrow", 0, 12);
    public static Font U = new Font("Arial Narrow", 1, 16);
    public static Font W = new Font("Arial Narrow", 0, 18);
    public static Font Y = new Font("Arial Narrow", 1, 18);
    public static Font aa = new Font("Arial Narrow", 1, 36);
    public static Font ac = new Font("Arial Narrow", 0, 36);
    public static Font ae = new Font("Arial Narrow", 1, 14);
    public static Font ag = new Font("Arial Narrow", 1, 11);
    public static Font ai = new Font("Arial Narrow", 1, 10);
    public static Font ak = new Font("Arial Narrow", 0, 10);
    public static Font am = new Font("Dialog", 0, 12);
    public static Font ao = new Font("Dialog", 1, 12);

    public MastersOfDestiny(String str) {
        this.a = new GameStates(this, str);
        this.a.l();
        this.b = new JFrame("HinterWars");
        this.b.setIconImage(this.ar);
        this.b.setSize(804, 632);
        this.b.setResizable(false);
        this.b.addWindowListener(this);
        this.f = new JTextPane();
        this.f.setEditable(false);
        this.f.setSelectionColor(new Color(14540253));
        this.f.setOpaque(false);
        this.f.addKeyListener(new aF(this));
        this.g = this.f.getDocument();
        this.d = new JScrollPane(this.f, 20, 31);
        this.e = this.d.getVerticalScrollBar();
        this.d.setOpaque(false);
        this.d.setBounds(420, 537, 363, 50);
        add(this.d);
        this.d.setVisible(false);
        this.h = new SimpleAttributeSet();
        StyleConstants.setForeground(this.h, Color.BLACK);
        StyleConstants.setFontFamily(this.h, "Times New Romans");
        StyleConstants.setFontSize(this.h, 12);
        this.i = new SimpleAttributeSet();
        StyleConstants.setForeground(this.i, Color.BLACK);
        StyleConstants.setFontFamily(this.i, "Times New Romans");
        StyleConstants.setBold(this.i, true);
        StyleConstants.setUnderline(this.i, true);
        StyleConstants.setFontSize(this.i, 12);
        this.j = new SimpleAttributeSet();
        StyleConstants.setForeground(this.j, new Color(13382451));
        StyleConstants.setBackground(this.j, new Color(16777113));
        StyleConstants.setFontFamily(this.j, "Times New Romans");
        StyleConstants.setFontSize(this.j, 12);
        this.k = new SimpleAttributeSet();
        StyleConstants.setForeground(this.k, new Color(13382451));
        StyleConstants.setBackground(this.k, new Color(16777113));
        StyleConstants.setFontFamily(this.k, "Times New Romans");
        StyleConstants.setBold(this.k, true);
        StyleConstants.setFontSize(this.k, 12);
        this.l = new SimpleAttributeSet();
        StyleConstants.setForeground(this.l, new Color(39423));
        StyleConstants.setFontFamily(this.l, "Times New Romans");
        StyleConstants.setFontSize(this.l, 12);
        this.m = new SimpleAttributeSet();
        StyleConstants.setForeground(this.m, new Color(13382451));
        StyleConstants.setFontFamily(this.m, "Times New Romans");
        StyleConstants.setFontSize(this.m, 12);
        this.n = new SimpleAttributeSet();
        StyleConstants.setForeground(this.n, new Color(16738047));
        StyleConstants.setFontFamily(this.n, "Times New Romans");
        StyleConstants.setFontSize(this.n, 12);
        this.o = new JTextArea();
        this.o.addKeyListener(new C0016ar(this));
        this.o.setDocument(new C0038r(45));
        this.o.setLineWrap(true);
        this.o.setTabSize(0);
        this.o.setFont(new Font("Times New Romans", 0, 12));
        this.o.setBounds(23, 560, 303, 32);
        this.o.setBackground(new Color(0));
        this.o.setSelectionColor(new Color(14540253));
        this.o.setBorder(BorderFactory.createLineBorder(new Color(16777215)));
        this.o.setOpaque(false);
        this.o.disable();
        this.o.addFocusListener(new C0018at(this));
        this.p = new JTextField();
        this.p.addKeyListener(new aI(this));
        this.p.setDocument(new C0038r(10));
        this.p.setFont(new Font("Times New Romans", 0, 12));
        this.p.setBounds(680, 500, 70, 15);
        this.p.setBackground(new Color(16777215));
        this.p.setSelectionColor(new Color(16777215));
        this.p.setBorder(BorderFactory.createLineBorder(new Color(16777215)));
        this.p.setOpaque(false);
        this.p.disable();
        this.q = new JTextField();
        this.q.addKeyListener(new C0014ao(this));
        this.q.setDocument(new C0038r(10));
        this.q.setFont(new Font("Times New Romans", 0, 12));
        this.q.setBounds(484, 330, 90, 15);
        this.q.setBackground(new Color(14737632));
        this.q.setSelectionColor(new Color(14540253));
        this.q.setBorder(BorderFactory.createLineBorder(new Color(16777215)));
        this.q.setOpaque(false);
        this.q.disable();
        this.r = new JTextField();
        this.r.setDocument(new C0038r(10));
        this.r.setFont(new Font("Times New Romans", 0, 12));
        this.r.setBounds(575, 254, 67, 14);
        this.r.setBackground(new Color(14737632));
        this.r.setSelectionColor(new Color(14540253));
        this.r.setBorder(BorderFactory.createLineBorder(new Color(16777215)));
        this.r.setOpaque(false);
        this.r.disable();
        setLayout(null);
        setFocusable(true);
        requestFocusInWindow();
        addMouseListener(this);
        addMouseMotionListener(this);
        addKeyListener(this);
        this.s = this.b.getContentPane();
        this.s.setSize(804, 632);
        this.s.add(this);
        this.t = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.u = this.t.getScreenDevices();
        this.v = new DisplayMode[this.u.length];
        this.b.show();
        C0021aw.b.a(C0028g.o, true);
    }

    public static void main(String[] strArr) {
        new MastersOfDestiny(strArr.length == 1 ? strArr[0] : "");
    }

    public void a(boolean z2) {
        if (!this.w && z2) {
            this.w = true;
            for (int i = 0; i < this.u.length; i++) {
                if (this.u[i].isFullScreenSupported()) {
                    C0032k.a("fullscreen");
                    if (this.b.isDisplayable()) {
                        this.b.dispose();
                    }
                    this.b.setUndecorated(true);
                    this.v[i] = this.u[i].getDisplayMode();
                    this.u[i].setFullScreenWindow(this.b);
                    DisplayMode displayMode = new DisplayMode(800, 600, 32, 60);
                    if (this.u[i].isDisplayChangeSupported()) {
                        C0032k.a("Fullscreen: display change supported");
                        this.u[i].setDisplayMode(displayMode);
                    }
                    this.b.show();
                    repaint();
                }
            }
        }
        if (z2 || !this.w) {
            return;
        }
        this.w = false;
        for (int i2 = 0; i2 < this.u.length; i2++) {
            if (this.u[i2].isFullScreenSupported()) {
                C0032k.a("windowed");
                if (this.u[i2].isDisplayChangeSupported()) {
                    C0032k.a("windowed: display change supported");
                    this.u[i2].setDisplayMode(this.v[i2]);
                }
                this.u[i2].setFullScreenWindow((Window) null);
                if (this.b.isDisplayable()) {
                    this.b.dispose();
                }
                this.b.setUndecorated(false);
                this.b.show();
            }
        }
    }

    public void paintComponent(Graphics graphics) {
        A = graphics.getFontMetrics(z);
        C = graphics.getFontMetrics(B);
        E = graphics.getFontMetrics(D);
        I = graphics.getFontMetrics(H);
        G = graphics.getFontMetrics(F);
        N = graphics.getFontMetrics(M);
        P = graphics.getFontMetrics(O);
        af = graphics.getFontMetrics(ae);
        R = graphics.getFontMetrics(Q);
        ah = graphics.getFontMetrics(ag);
        aj = graphics.getFontMetrics(ai);
        T = graphics.getFontMetrics(S);
        an = graphics.getFontMetrics(am);
        ap = graphics.getFontMetrics(ao);
        graphics.setFont(ao);
        this.a.z(graphics);
    }

    public void keyPressed(KeyEvent keyEvent) {
        this.a.o(keyEvent);
    }

    public void keyReleased(KeyEvent keyEvent) {
        this.a.p(keyEvent);
    }

    public void keyTyped(KeyEvent keyEvent) {
        this.a.q(keyEvent);
    }

    public void mouseMoved(MouseEvent mouseEvent) {
        this.a.ax(mouseEvent);
    }

    public void mouseDragged(MouseEvent mouseEvent) {
        this.a.ay(mouseEvent);
    }

    public void mouseReleased(MouseEvent mouseEvent) {
        this.a.aB(mouseEvent);
    }

    public void mouseEntered(MouseEvent mouseEvent) {
        this.a.aD(mouseEvent);
    }

    public void mousePressed(MouseEvent mouseEvent) {
        this.a.az(mouseEvent);
    }

    public void mouseClicked(MouseEvent mouseEvent) {
        this.a.aA(mouseEvent);
    }

    public void mouseExited(MouseEvent mouseEvent) {
        this.a.aC(mouseEvent);
    }

    public void windowClosing(WindowEvent windowEvent) {
        System.exit(0);
    }

    public void windowIconified(WindowEvent windowEvent) {
    }

    public void windowOpened(WindowEvent windowEvent) {
    }

    public void windowClosed(WindowEvent windowEvent) {
    }

    public void windowDeiconified(WindowEvent windowEvent) {
    }

    public void windowActivated(WindowEvent windowEvent) {
        requestFocusInWindow();
    }

    public void windowDeactivated(WindowEvent windowEvent) {
    }

    public void a() {
        String[] split;
        String trim = this.o.getText().trim();
        String trim2 = this.o.getText().trim();
        C0032k.a("chatPressedEnter message2 = " + trim2);
        try {
            trim = new String(trim.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            C0032k.a(e);
        }
        C0032k.a("chatPressedEnter message = " + trim);
        if (this.a.qm == 5) {
            if (trim.startsWith("/w")) {
                String str = "";
                for (int i = 2; i < trim.split(" ").length; i++) {
                    str = str + split[i] + " ";
                }
                this.a.eI.a(this.a.G.E + " speaks to " + split[1] + ": " + str, 16748545, 0);
            } else if (trim.length() > 0) {
                this.a.eI.a(this.a.G.E + ": " + trim, 16712134, 0);
            }
            if (trim.length() > 0) {
                if (trim.startsWith("/w")) {
                    String[] split2 = trim.split(" ", 3);
                    if (split2.length > 2) {
                        PrintWriter printWriter = this.a.U;
                        StringBuilder sb = new StringBuilder();
                        GameStates gameStates = this.a;
                        printWriter.write(sb.append(C0000a.aB).append(C0000a.v).append(split2[1]).append(C0000a.v).append(split2[2]).append(C0000a.w).toString());
                        this.a.U.flush();
                        StringBuilder append = new StringBuilder().append("Sent: ");
                        GameStates gameStates2 = this.a;
                        C0032k.a(append.append(C0000a.aB).append(C0000a.v).append(split2[1]).append(C0000a.v).append(split2[2]).append(C0000a.w).toString());
                    }
                } else if (trim.startsWith("/add")) {
                    String[] split3 = trim.split(" ", 3);
                    if (split3.length > 2) {
                        if (split3[2].equals("<invite message here>")) {
                            PrintWriter printWriter2 = this.a.U;
                            StringBuilder sb2 = new StringBuilder();
                            GameStates gameStates3 = this.a;
                            printWriter2.write(sb2.append("BR").append(C0000a.v).append(split3[1]).append("| |\n").toString());
                            this.a.U.flush();
                        } else {
                            PrintWriter printWriter3 = this.a.U;
                            StringBuilder sb3 = new StringBuilder();
                            GameStates gameStates4 = this.a;
                            printWriter3.write(sb3.append("BR").append(C0000a.v).append(split3[1]).append(C0000a.v).append(split3[2]).append(C0000a.w).toString());
                            this.a.U.flush();
                        }
                    } else if (split3.length > 1) {
                        PrintWriter printWriter4 = this.a.U;
                        StringBuilder sb4 = new StringBuilder();
                        GameStates gameStates5 = this.a;
                        printWriter4.write(sb4.append("BR").append(C0000a.v).append(split3[1]).append("| |\n").toString());
                        this.a.U.flush();
                    }
                } else {
                    PrintWriter printWriter5 = this.a.U;
                    StringBuilder sb5 = new StringBuilder();
                    GameStates gameStates6 = this.a;
                    printWriter5.write(sb5.append(C0000a.aA).append(C0000a.v).append(trim).append(C0000a.w).toString());
                    this.a.U.flush();
                    this.a.G.a(trim2);
                }
            }
        } else if (this.a.qm == 22) {
            this.a.lv.a(C0000a.c(trim));
            this.a.lv.a(this.a.G.D, trim2);
        }
        this.o.setText("");
    }

    public void b() {
        String trim = this.p.getText().trim();
        if (trim.equals("")) {
            return;
        }
        this.p.setText("");
        this.o.setText("/add " + trim + " <invite message here>");
        this.o.setCaretPosition(this.o.getText().indexOf(60));
        this.o.moveCaretPosition(this.o.getText().indexOf(62) + 1);
        this.o.getCaret().setSelectionVisible(true);
    }

    public void c() {
        String trim = this.q.getText().trim();
        if (trim.equals("")) {
            return;
        }
        int parseInt = Integer.parseInt(trim);
        this.a.dw = false;
        this.q.setText("1");
        remove(this.q);
        int b = ((C0020av) this.a.G.H[this.a.dc].elementAt(this.a.dv + this.a.dq)).b();
        if (b <= parseInt) {
            this.a.dI.a(b);
            this.a.G.H[this.a.dc].removeElementAt(this.a.dv + this.a.dq);
        } else {
            this.a.dI.a(parseInt);
            ((C0020av) this.a.G.H[this.a.dc].elementAt(this.a.dv + this.a.dq)).a(b - parseInt);
        }
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= this.a.cU.size()) {
                break;
            } else if (this.a.dI.a().a() == ((C0020av) this.a.cU.get(i)).a().a()) {
                z2 = true;
                ((C0020av) this.a.cU.get(i)).a(((C0020av) this.a.cU.get(i)).b() + this.a.dI.b());
                break;
            } else {
                i++;
            }
        }
        if (!z2) {
            this.a.cU.add((C0020av) this.a.dI.clone());
        }
        this.a.dv = -1;
        this.a.dI = null;
    }

    public void a(String str, String str2, SimpleAttributeSet simpleAttributeSet) {
        a(str + ": " + str2, simpleAttributeSet);
    }

    public void a(String str, SimpleAttributeSet simpleAttributeSet) {
        try {
            this.g.insertString(this.g.getLength(), C0000a.w + str, simpleAttributeSet);
            this.f.setCaretPosition(this.g.getLength());
        } catch (BadLocationException e) {
            C0032k.a(e.getMessage());
        }
    }

    public void b(String str, SimpleAttributeSet simpleAttributeSet) {
        try {
            this.g.insertString(this.g.getLength(), str, simpleAttributeSet);
            this.f.setCaretPosition(this.g.getLength());
        } catch (BadLocationException e) {
            C0032k.a(e.getMessage());
        }
    }
}
