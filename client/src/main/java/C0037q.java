package defpackage;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/* renamed from: q  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:q.class */
public class C0037q extends PlainDocument {
    private int a;
    private int b;

    public C0037q(int i) {
        a(i);
    }

    public final void a(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final void b(int i) {
        this.b = i;
    }

    public final int b() {
        return this.b;
    }

    public void insertString(int i, String str, AttributeSet attributeSet) throws BadLocationException {
        if (i < this.a) {
            String replaceAll = str.replaceAll("[^0-9]", "");
            if (super.getLength() == 0 && replaceAll.equals("0")) {
                replaceAll = "1";
            }
            if (!replaceAll.equals(C0000a.w)) {
                super.insertString(i, replaceAll, attributeSet);
            }
            try {
                if (this.b != -1 && Integer.parseInt(super.getText(0, super.getLength())) > this.b) {
                    super.remove(0, super.getLength());
                    super.insertString(0, "" + this.b, attributeSet);
                }
            } catch (NumberFormatException e) {
            }
        }
    }

    public void remove(int i, int i2) throws BadLocationException {
        super.remove(i, i2);
        try {
            if (Integer.parseInt(super.getText(0, super.getLength())) == 0) {
                super.remove(0, super.getLength());
                insertString(0, "1", null);
            }
        } catch (NumberFormatException e) {
        }
    }
}
