import java.awt.Color;
import java.awt.Container;
import java.awt.DisplayMode;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
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

public class MastersOfDestiny extends JPanel implements WindowListener, MouseMotionListener, MouseListener, KeyListener {
   // $VF: renamed from: a GameStates
   GameStates field_2779;
   // $VF: renamed from: b javax.swing.JFrame
   JFrame field_2780;
   // $VF: renamed from: c javax.swing.Icon
   Icon field_2781;
   // $VF: renamed from: d javax.swing.JScrollPane
   JScrollPane field_2782;
   // $VF: renamed from: e javax.swing.JScrollBar
   JScrollBar field_2783;
   // $VF: renamed from: f javax.swing.JTextPane
   JTextPane field_2784;
   // $VF: renamed from: g javax.swing.text.Document
   Document field_2785;
   // $VF: renamed from: h javax.swing.text.SimpleAttributeSet
   SimpleAttributeSet field_2786;
   // $VF: renamed from: i javax.swing.text.SimpleAttributeSet
   SimpleAttributeSet field_2787;
   // $VF: renamed from: j javax.swing.text.SimpleAttributeSet
   SimpleAttributeSet field_2788;
   // $VF: renamed from: k javax.swing.text.SimpleAttributeSet
   SimpleAttributeSet field_2789;
   // $VF: renamed from: l javax.swing.text.SimpleAttributeSet
   SimpleAttributeSet field_2790;
   // $VF: renamed from: m javax.swing.text.SimpleAttributeSet
   SimpleAttributeSet field_2791;
   // $VF: renamed from: n javax.swing.text.SimpleAttributeSet
   SimpleAttributeSet field_2792;
   // $VF: renamed from: o javax.swing.JTextArea
   JTextArea field_2793;
   // $VF: renamed from: p javax.swing.JTextField
   JTextField field_2794;
   // $VF: renamed from: q javax.swing.JTextField
   JTextField field_2795;
   // $VF: renamed from: r javax.swing.JTextField
   JTextField field_2796;
   // $VF: renamed from: s java.awt.Container
   Container field_2797;
   // $VF: renamed from: t java.awt.GraphicsEnvironment
   GraphicsEnvironment field_2798;
   // $VF: renamed from: u java.awt.GraphicsDevice[]
   GraphicsDevice[] field_2799;
   // $VF: renamed from: v java.awt.DisplayMode[]
   DisplayMode[] field_2800;
   // $VF: renamed from: aq java.lang.ClassLoader
   private final ClassLoader field_2801 = this.getClass().getClassLoader();
   // $VF: renamed from: ar java.awt.Image
   private final Image field_2802 = new ImageIcon(this.field_2801.getResource("res/hw.gif")).getImage();
   // $VF: renamed from: w boolean
   boolean field_2803 = false;
   // $VF: renamed from: x java.awt.Font
   public static Font field_2804 = new Font("Arial", 0, 10);
   // $VF: renamed from: y java.awt.FontMetrics
   public static FontMetrics field_2805;
   // $VF: renamed from: z java.awt.Font
   public static Font field_2806 = new Font("Arial", 0, 11);
   // $VF: renamed from: A java.awt.FontMetrics
   public static FontMetrics field_2807;
   // $VF: renamed from: B java.awt.Font
   public static Font field_2808 = new Font("Arial", 0, 12);
   // $VF: renamed from: C java.awt.FontMetrics
   public static FontMetrics field_2809;
   // $VF: renamed from: D java.awt.Font
   public static Font field_2810 = new Font("Arial", 1, 12);
   // $VF: renamed from: E java.awt.FontMetrics
   public static FontMetrics field_2811;
   // $VF: renamed from: F java.awt.Font
   public static Font field_2812 = new Font("Arial", 1, 14);
   // $VF: renamed from: G java.awt.FontMetrics
   public static FontMetrics field_2813;
   // $VF: renamed from: H java.awt.Font
   public static Font field_2814 = new Font("Arial", 0, 14);
   // $VF: renamed from: I java.awt.FontMetrics
   public static FontMetrics field_2815;
   // $VF: renamed from: J java.awt.Font
   public static Font field_2816 = new Font("Arial", 0, 16);
   // $VF: renamed from: K java.awt.FontMetrics
   public static FontMetrics field_2817;
   // $VF: renamed from: L java.awt.Font
   public static Font field_2818 = new Font("Impact", 1, 16);
   // $VF: renamed from: M java.awt.Font
   public static Font field_2819 = new Font("BV Boli", 2, 24);
   // $VF: renamed from: N java.awt.FontMetrics
   public static FontMetrics field_2820;
   // $VF: renamed from: O java.awt.Font
   public static Font field_2821 = new Font("BV Boli", 1, 20);
   // $VF: renamed from: P java.awt.FontMetrics
   public static FontMetrics field_2822;
   // $VF: renamed from: Q java.awt.Font
   public static Font field_2823 = new Font("Arial Narrow", 1, 12);
   // $VF: renamed from: R java.awt.FontMetrics
   public static FontMetrics field_2824;
   // $VF: renamed from: S java.awt.Font
   public static Font field_2825 = new Font("Arial Narrow", 0, 12);
   // $VF: renamed from: T java.awt.FontMetrics
   public static FontMetrics field_2826;
   // $VF: renamed from: U java.awt.Font
   public static Font field_2827 = new Font("Arial Narrow", 1, 16);
   // $VF: renamed from: V java.awt.FontMetrics
   public static FontMetrics field_2828;
   // $VF: renamed from: W java.awt.Font
   public static Font field_2829 = new Font("Arial Narrow", 0, 18);
   // $VF: renamed from: X java.awt.FontMetrics
   public static FontMetrics field_2830;
   // $VF: renamed from: Y java.awt.Font
   public static Font field_2831 = new Font("Arial Narrow", 1, 18);
   // $VF: renamed from: Z java.awt.FontMetrics
   public static FontMetrics field_2832;
   // $VF: renamed from: aa java.awt.Font
   public static Font field_2833 = new Font("Arial Narrow", 1, 36);
   // $VF: renamed from: ab java.awt.FontMetrics
   public static FontMetrics field_2834;
   // $VF: renamed from: ac java.awt.Font
   public static Font field_2835 = new Font("Arial Narrow", 0, 36);
   // $VF: renamed from: ad java.awt.FontMetrics
   public static FontMetrics field_2836;
   // $VF: renamed from: ae java.awt.Font
   public static Font field_2837 = new Font("Arial Narrow", 1, 14);
   // $VF: renamed from: af java.awt.FontMetrics
   public static FontMetrics field_2838;
   // $VF: renamed from: ag java.awt.Font
   public static Font field_2839 = new Font("Arial Narrow", 1, 11);
   // $VF: renamed from: ah java.awt.FontMetrics
   public static FontMetrics field_2840;
   // $VF: renamed from: ai java.awt.Font
   public static Font field_2841 = new Font("Arial Narrow", 1, 10);
   // $VF: renamed from: aj java.awt.FontMetrics
   public static FontMetrics field_2842;
   // $VF: renamed from: ak java.awt.Font
   public static Font field_2843 = new Font("Arial Narrow", 0, 10);
   // $VF: renamed from: al java.awt.FontMetrics
   public static FontMetrics field_2844;
   // $VF: renamed from: am java.awt.Font
   public static Font field_2845 = new Font("Dialog", 0, 12);
   // $VF: renamed from: an java.awt.FontMetrics
   public static FontMetrics field_2846;
   // $VF: renamed from: ao java.awt.Font
   public static Font field_2847 = new Font("Dialog", 1, 12);
   // $VF: renamed from: ap java.awt.FontMetrics
   public static FontMetrics field_2848;

   public MastersOfDestiny(String var1) {
      this.field_2779 = new GameStates(this, var1);
      this.field_2779.method_464();
      this.field_2780 = new JFrame("HinterWars");
      this.field_2780.setIconImage(this.field_2802);
      this.field_2780.setSize(804, 632);
      this.field_2780.setResizable(false);
      this.field_2780.addWindowListener(this);
      this.field_2784 = new JTextPane();
      this.field_2784.setEditable(false);
      this.field_2784.setSelectionColor(new Color(14540253));
      this.field_2784.setOpaque(false);
      this.field_2784.addKeyListener(new class_26(this));
      this.field_2785 = this.field_2784.getDocument();
      this.field_2782 = new JScrollPane(this.field_2784, 20, 31);
      this.field_2783 = this.field_2782.getVerticalScrollBar();
      this.field_2782.setOpaque(false);
      this.field_2782.setBounds(420, 537, 363, 50);
      this.add(this.field_2782);
      this.field_2782.setVisible(false);
      this.field_2786 = new SimpleAttributeSet();
      StyleConstants.setForeground(this.field_2786, Color.BLACK);
      StyleConstants.setFontFamily(this.field_2786, "Times New Romans");
      StyleConstants.setFontSize(this.field_2786, 12);
      this.field_2787 = new SimpleAttributeSet();
      StyleConstants.setForeground(this.field_2787, Color.BLACK);
      StyleConstants.setFontFamily(this.field_2787, "Times New Romans");
      StyleConstants.setBold(this.field_2787, true);
      StyleConstants.setUnderline(this.field_2787, true);
      StyleConstants.setFontSize(this.field_2787, 12);
      this.field_2788 = new SimpleAttributeSet();
      StyleConstants.setForeground(this.field_2788, new Color(13382451));
      StyleConstants.setBackground(this.field_2788, new Color(16777113));
      StyleConstants.setFontFamily(this.field_2788, "Times New Romans");
      StyleConstants.setFontSize(this.field_2788, 12);
      this.field_2789 = new SimpleAttributeSet();
      StyleConstants.setForeground(this.field_2789, new Color(13382451));
      StyleConstants.setBackground(this.field_2789, new Color(16777113));
      StyleConstants.setFontFamily(this.field_2789, "Times New Romans");
      StyleConstants.setBold(this.field_2789, true);
      StyleConstants.setFontSize(this.field_2789, 12);
      this.field_2790 = new SimpleAttributeSet();
      StyleConstants.setForeground(this.field_2790, new Color(39423));
      StyleConstants.setFontFamily(this.field_2790, "Times New Romans");
      StyleConstants.setFontSize(this.field_2790, 12);
      this.field_2791 = new SimpleAttributeSet();
      StyleConstants.setForeground(this.field_2791, new Color(13382451));
      StyleConstants.setFontFamily(this.field_2791, "Times New Romans");
      StyleConstants.setFontSize(this.field_2791, 12);
      this.field_2792 = new SimpleAttributeSet();
      StyleConstants.setForeground(this.field_2792, new Color(16738047));
      StyleConstants.setFontFamily(this.field_2792, "Times New Romans");
      StyleConstants.setFontSize(this.field_2792, 12);
      this.field_2793 = new JTextArea();
      this.field_2793.addKeyListener(new class_25(this));
      this.field_2793.setDocument(new class_31(45));
      this.field_2793.setLineWrap(true);
      this.field_2793.setTabSize(0);
      this.field_2793.setFont(new Font("Times New Romans", 0, 12));
      this.field_2793.setBounds(23, 560, 303, 32);
      this.field_2793.setBackground(new Color(0));
      this.field_2793.setSelectionColor(new Color(14540253));
      this.field_2793.setBorder(BorderFactory.createLineBorder(new Color(16777215)));
      this.field_2793.setOpaque(false);
      this.field_2793.disable();
      this.field_2793.addFocusListener(new class_24(this));
      this.field_2794 = new JTextField();
      this.field_2794.addKeyListener(new class_23(this));
      this.field_2794.setDocument(new class_31(10));
      this.field_2794.setFont(new Font("Times New Romans", 0, 12));
      this.field_2794.setBounds(680, 500, 70, 15);
      this.field_2794.setBackground(new Color(16777215));
      this.field_2794.setSelectionColor(new Color(16777215));
      this.field_2794.setBorder(BorderFactory.createLineBorder(new Color(16777215)));
      this.field_2794.setOpaque(false);
      this.field_2794.disable();
      this.field_2795 = new JTextField();
      this.field_2795.addKeyListener(new class_22(this));
      this.field_2795.setDocument(new class_31(10));
      this.field_2795.setFont(new Font("Times New Romans", 0, 12));
      this.field_2795.setBounds(484, 330, 90, 15);
      this.field_2795.setBackground(new Color(14737632));
      this.field_2795.setSelectionColor(new Color(14540253));
      this.field_2795.setBorder(BorderFactory.createLineBorder(new Color(16777215)));
      this.field_2795.setOpaque(false);
      this.field_2795.disable();
      this.field_2796 = new JTextField();
      this.field_2796.setDocument(new class_31(10));
      this.field_2796.setFont(new Font("Times New Romans", 0, 12));
      this.field_2796.setBounds(575, 254, 67, 14);
      this.field_2796.setBackground(new Color(14737632));
      this.field_2796.setSelectionColor(new Color(14540253));
      this.field_2796.setBorder(BorderFactory.createLineBorder(new Color(16777215)));
      this.field_2796.setOpaque(false);
      this.field_2796.disable();
      this.setLayout(null);
      this.setFocusable(true);
      this.requestFocusInWindow();
      this.addMouseListener(this);
      this.addMouseMotionListener(this);
      this.addKeyListener(this);
      this.field_2797 = this.field_2780.getContentPane();
      this.field_2797.setSize(804, 632);
      this.field_2797.add(this);
      this.field_2798 = GraphicsEnvironment.getLocalGraphicsEnvironment();
      this.field_2799 = this.field_2798.getScreenDevices();
      this.field_2800 = new DisplayMode[this.field_2799.length];
      this.field_2780.show();
      class_3.field_20.method_18("res/sound/bgm/hinterwars_theme.wav", true);
   }

   public static void main(String[] var0) {
      String var1 = "";
      if (var0.length == 1) {
         var1 = var0[0];
      }

      new MastersOfDestiny(var1);
   }

   // $VF: renamed from: a (boolean) void
   public void method_757(boolean var1) {
      if (!this.field_2803 && var1) {
         this.field_2803 = true;

         for (int var2 = 0; var2 < this.field_2799.length; var2++) {
            if (this.field_2799[var2].isFullScreenSupported()) {
               class_62.method_563("fullscreen");
               if (this.field_2780.isDisplayable()) {
                  this.field_2780.dispose();
               }

               this.field_2780.setUndecorated(true);
               this.field_2800[var2] = this.field_2799[var2].getDisplayMode();
               this.field_2799[var2].setFullScreenWindow(this.field_2780);
               DisplayMode var3 = new DisplayMode(800, 600, 32, 60);
               if (this.field_2799[var2].isDisplayChangeSupported()) {
                  class_62.method_563("Fullscreen: display change supported");
                  this.field_2799[var2].setDisplayMode(var3);
               }

               this.field_2780.show();
               this.repaint();
            }
         }
      }

      if (!var1 && this.field_2803) {
         this.field_2803 = false;

         for (int var4 = 0; var4 < this.field_2799.length; var4++) {
            if (this.field_2799[var4].isFullScreenSupported()) {
               class_62.method_563("windowed");
               if (this.field_2799[var4].isDisplayChangeSupported()) {
                  class_62.method_563("windowed: display change supported");
                  this.field_2799[var4].setDisplayMode(this.field_2800[var4]);
               }

               this.field_2799[var4].setFullScreenWindow(null);
               if (this.field_2780.isDisplayable()) {
                  this.field_2780.dispose();
               }

               this.field_2780.setUndecorated(false);
               this.field_2780.show();
            }
         }
      }
   }

   @Override
   public void paintComponent(Graphics var1) {
      field_2807 = var1.getFontMetrics(field_2806);
      field_2809 = var1.getFontMetrics(field_2808);
      field_2811 = var1.getFontMetrics(field_2810);
      field_2815 = var1.getFontMetrics(field_2814);
      field_2813 = var1.getFontMetrics(field_2812);
      field_2820 = var1.getFontMetrics(field_2819);
      field_2822 = var1.getFontMetrics(field_2821);
      field_2838 = var1.getFontMetrics(field_2837);
      field_2824 = var1.getFontMetrics(field_2823);
      field_2840 = var1.getFontMetrics(field_2839);
      field_2842 = var1.getFontMetrics(field_2841);
      field_2826 = var1.getFontMetrics(field_2825);
      field_2846 = var1.getFontMetrics(field_2845);
      field_2848 = var1.getFontMetrics(field_2847);
      var1.setFont(field_2847);
      this.field_2779.method_479(var1);
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      this.field_2779.method_475(var1);
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      this.field_2779.method_476(var1);
   }

   @Override
   public void keyTyped(KeyEvent var1) {
      this.field_2779.method_477(var1);
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      this.field_2779.method_468(var1);
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      this.field_2779.method_469(var1);
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      this.field_2779.method_472(var1);
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      this.field_2779.method_474(var1);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.field_2779.method_470(var1);
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      this.field_2779.method_471(var1);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.field_2779.method_473(var1);
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      System.exit(0);
   }

   @Override
   public void windowIconified(WindowEvent var1) {
   }

   @Override
   public void windowOpened(WindowEvent var1) {
   }

   @Override
   public void windowClosed(WindowEvent var1) {
   }

   @Override
   public void windowDeiconified(WindowEvent var1) {
   }

   @Override
   public void windowActivated(WindowEvent var1) {
      this.requestFocusInWindow();
   }

   @Override
   public void windowDeactivated(WindowEvent var1) {
   }

   // $VF: renamed from: a () void
   public void method_758() {
      String var1 = this.field_2793.getText().trim();
      String var2 = this.field_2793.getText().trim();
      class_62.method_563("chatPressedEnter message2 = " + var2);

      try {
         byte[] var3 = var1.getBytes("UTF-8");
         var1 = new String(var3);
      } catch (UnsupportedEncodingException var6) {
         class_62.method_563(var6);
      }

      class_62.method_563("chatPressedEnter message = " + var1);
      if (this.field_2779.field_1300 == 5) {
         if (!var1.startsWith("/w")) {
            if (var1.length() > 0) {
               this.field_2779.field_691.method_569(this.field_2779.field_421.field_3056 + ": " + var1, 16712134, 0);
            }
         } else {
            String[] var7 = var1.split(" ");
            String var4 = "";

            for (int var5 = 2; var5 < var7.length; var5++) {
               var4 = var4 + var7[var5] + " ";
            }

            this.field_2779.field_691.method_569(this.field_2779.field_421.field_3056 + " speaks to " + var7[1] + ": " + var4, 16748545, 0);
         }

         if (var1.length() > 0) {
            if (var1.startsWith("/w")) {
               String[] var8 = var1.split(" ", 3);
               if (var8.length > 2) {
                  this.field_2779.field_435.write("WS" + "|" + var8[1] + "|" + var8[2] + "\n");
                  this.field_2779.field_435.flush();
                  class_62.method_563("Sent: " + "WS" + "|" + var8[1] + "|" + var8[2] + "\n");
               }
            } else if (var1.startsWith("/add")) {
               String[] var9 = var1.split(" ", 3);
               if (var9.length > 2) {
                  if (!var9[2].equals("<invite message here>")) {
                     this.field_2779.field_435.write("BR" + "|" + var9[1] + "|" + var9[2] + "\n");
                     this.field_2779.field_435.flush();
                  } else {
                     this.field_2779.field_435.write("BR" + "|" + var9[1] + "| |\n");
                     this.field_2779.field_435.flush();
                  }
               } else if (var9.length > 1) {
                  this.field_2779.field_435.write("BR" + "|" + var9[1] + "| |\n");
                  this.field_2779.field_435.flush();
               }
            } else {
               this.field_2779.field_435.write("CT" + "|" + var1 + "\n");
               this.field_2779.field_435.flush();
               this.field_2779.field_421.method_850(var2);
            }
         }
      } else if (this.field_2779.field_1300 == 22) {
         this.field_2779.field_1043.method_704(class_68.method_632(var1));
         this.field_2779.field_1043.method_725(this.field_2779.field_421.field_3055, var2);
      }

      this.field_2793.setText("");
   }

   // $VF: renamed from: b () void
   public void method_759() {
      String var1 = this.field_2794.getText().trim();
      if (!var1.equals("")) {
         this.field_2794.setText("");
         this.field_2793.setText("/add " + var1 + " <invite message here>");
         this.field_2793.setCaretPosition(this.field_2793.getText().indexOf(60));
         this.field_2793.moveCaretPosition(this.field_2793.getText().indexOf(62) + 1);
         this.field_2793.getCaret().setSelectionVisible(true);
      }
   }

   // $VF: renamed from: c () void
   public void method_760() {
      String var1 = this.field_2795.getText().trim();
      if (!var1.equals("")) {
         int var2 = Integer.parseInt(var1);
         this.field_2779.field_627 = false;
         this.field_2795.setText("1");
         this.remove(this.field_2795);
         int var3 = ((class_30)this.field_2779.field_421.field_3059[this.field_2779.field_607].elementAt(this.field_2779.field_626 + this.field_2779.field_621))
            .method_236();
         if (var3 <= var2) {
            this.field_2779.field_639.method_235(var3);
            this.field_2779.field_421.field_3059[this.field_2779.field_607].removeElementAt(this.field_2779.field_626 + this.field_2779.field_621);
         } else {
            this.field_2779.field_639.method_235(var2);
            ((class_30)this.field_2779.field_421.field_3059[this.field_2779.field_607].elementAt(this.field_2779.field_626 + this.field_2779.field_621))
               .method_235(var3 - var2);
         }

         boolean var4 = false;

         for (int var5 = 0; var5 < this.field_2779.field_599.size(); var5++) {
            if (this.field_2779.field_639.method_234().method_179() == ((class_30)this.field_2779.field_599.get(var5)).method_234().method_179()) {
               var4 = true;
               ((class_30)this.field_2779.field_599.get(var5))
                  .method_235(((class_30)this.field_2779.field_599.get(var5)).method_236() + this.field_2779.field_639.method_236());
               break;
            }
         }

         if (!var4) {
            this.field_2779.field_599.add((class_30)this.field_2779.field_639.clone());
         }

         this.field_2779.field_626 = -1;
         this.field_2779.field_639 = null;
      }
   }

   // $VF: renamed from: a (java.lang.String, java.lang.String, javax.swing.text.SimpleAttributeSet) void
   public void method_761(String var1, String var2, SimpleAttributeSet var3) {
      var2 = var1 + ": " + var2;
      this.method_762(var2, var3);
   }

   // $VF: renamed from: a (java.lang.String, javax.swing.text.SimpleAttributeSet) void
   public void method_762(String var1, SimpleAttributeSet var2) {
      try {
         this.field_2785.insertString(this.field_2785.getLength(), "\n" + var1, var2);
         this.field_2784.setCaretPosition(this.field_2785.getLength());
      } catch (BadLocationException var4) {
         class_62.method_563(var4.getMessage());
      }
   }

   // $VF: renamed from: b (java.lang.String, javax.swing.text.SimpleAttributeSet) void
   public void method_763(String var1, SimpleAttributeSet var2) {
      try {
         this.field_2785.insertString(this.field_2785.getLength(), var1, var2);
         this.field_2784.setCaretPosition(this.field_2785.getLength());
      } catch (BadLocationException var4) {
         class_62.method_563(var4.getMessage());
      }
   }
}
