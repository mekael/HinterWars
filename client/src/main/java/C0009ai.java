

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.util.Vector;

/* renamed from: ai  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:ai.class */
public class C0009ai {
    public static final byte a = 0;
    public static final byte b = 1;
    public static final byte c = 2;
    public static final byte d = 3;
    String f;
    int g;
    int h;
    int i;
    int j;
    int l;
    Font m;
    FontMetrics n;
    int o;
    int p;
    Vector e = new Vector();
    final int k = 200;

    public void a() {
        this.e.removeAllElements();
        this.p = 0;
    }

    public void a(int i, int i2, int i3, int i4, Font font, FontMetrics fontMetrics) {
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.m = font;
        this.n = fontMetrics;
        this.l = i4 / fontMetrics.getHeight();
        if (this.l > 200) {
            this.l = 200;
        }
    }

    private void a(String str) {
        if (this.e.size() > 200) {
            this.e.removeElementAt(0);
        }
        this.e.addElement(str);
        this.o = this.e.size() - this.l;
        if (this.o < 0) {
            this.o = 0;
        }
    }

    public void a(String str, int i, int i2) {
        boolean z = false;
        int i3 = 0;
        boolean z2 = true;
        while (!z) {
            int i4 = 0;
            int i5 = i3;
            while (true) {
                if (i3 >= str.length()) {
                    String substring = str.substring(i5, str.length());
                    if (z2) {
                        a(i + C0000a.v + i2 + C0000a.v + substring);
                    } else {
                        a(i2 + C0000a.v + i2 + C0000a.v + substring);
                    }
                    z2 = false;
                    z = true;
                } else {
                    char charAt = str.charAt(i3);
                    if ('\n' == charAt) {
                        String substring2 = str.substring(i5, i3);
                        if (z2) {
                            a(i + C0000a.v + i2 + C0000a.v + substring2);
                        } else {
                            a(i2 + C0000a.v + i2 + C0000a.v + substring2);
                        }
                        z2 = false;
                        i3++;
                    } else {
                        int charWidth = this.n.charWidth(charAt);
                        if (i4 + charWidth <= this.i - 15) {
                            i4 += charWidth;
                            i3++;
                        } else if (str.charAt(i3) != ' ') {
                            int i6 = i3;
                            while (i6 > i5) {
                                i6--;
                                if (str.charAt(i6) == ' ') {
                                    break;
                                }
                            }
                            if (i6 != i5) {
                                String substring3 = str.substring(i5, i6);
                                if (z2) {
                                    a(i + C0000a.v + i2 + C0000a.v + substring3);
                                } else {
                                    a(i2 + C0000a.v + i2 + C0000a.v + substring3);
                                }
                                z2 = false;
                                i3 = i6 + 1;
                            } else {
                                String substring4 = str.substring(i5, i3);
                                if (z2) {
                                    a(i + C0000a.v + i2 + C0000a.v + substring4);
                                } else {
                                    a(i2 + C0000a.v + i2 + C0000a.v + substring4);
                                }
                                z2 = false;
                            }
                        } else {
                            String substring5 = str.substring(i5, i3);
                            if (z2) {
                                a(i + C0000a.v + i2 + C0000a.v + substring5);
                            } else {
                                a(i2 + C0000a.v + i2 + C0000a.v + substring5);
                            }
                            z2 = false;
                            i3++;
                        }
                    }
                }
            }
        }
    }

    public void b() {
        this.e.removeAllElements();
    }

    public boolean a(byte b2) {
        switch (b2) {
            case 0:
                this.p++;
                if (this.p > this.o) {
                    this.p = this.o;
                    return false;
                }
                return true;
            case 1:
                this.p--;
                if (this.p < 0) {
                    this.p = 0;
                    return false;
                }
                return true;
            case 2:
                this.p = this.o;
                return true;
            case 3:
                this.p = 0;
                return true;
            default:
                C0032k.a("ConsoleEntity.scroll - error: invalid scroll id");
                return true;
        }
    }

    public void a(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
        int height = this.n.getHeight();
        int i = this.g;
        int i2 = this.h + height;
        graphics.setFont(this.m);
        int size = (this.e.size() - this.l) - this.p;
        if (size < 0) {
            size = 0;
        }
        for (int i3 = size; i3 < this.e.size(); i3++) {
            int i4 = i;
            String[] split = ((String) this.e.elementAt(i3)).split("\\|");
            try {
                split[2] = new String(split[2].getBytes(), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                C0032k.a(e);
            }
            if (split[2].indexOf(":") != -1) {
                graphics.setColor(new Color(Integer.parseInt(split[0])));
                String substring = split[2].substring(0, split[2].indexOf(":") + 1);
                for (int i5 = 0; i5 < substring.length(); i5++) {
                    graphics.drawString(Character.toString(substring.charAt(i5)), i4, i2);
                    i4 += this.n.charWidth(substring.charAt(i5));
                }
                graphics.setColor(new Color(Integer.parseInt(split[1])));
                String substring2 = split[2].substring(split[2].indexOf(":") + 1);
                for (int i6 = 0; i6 < substring2.length(); i6++) {
                    graphics.drawString(Character.toString(substring2.charAt(i6)), i4, i2);
                    i4 += this.n.charWidth(substring2.charAt(i6));
                }
            } else {
                graphics.setColor(new Color(Integer.parseInt(split[1])));
                for (int i7 = 0; i7 < split[2].length(); i7++) {
                    graphics.drawString(Character.toString(split[2].charAt(i7)), i4, i2);
                    i4 += this.n.charWidth(split[2].charAt(i7));
                }
            }
            i2 += height;
            if (i3 == (size + this.l) - 1) {
                return;
            }
        }
    }
}
