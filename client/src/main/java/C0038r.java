package defpackage;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/* renamed from: r  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:r.class */
public class C0038r extends PlainDocument {
    private int a;

    public C0038r(int i) {
        a(i);
    }

    public final int a() {
        return this.a;
    }

    public void insertString(int i, String str, AttributeSet attributeSet) throws BadLocationException {
        if (i >= this.a || str.equals(C0000a.w)) {
            return;
        }
        super.insertString(i, str, attributeSet);
    }

    public final void a(int i) {
        this.a = i;
    }
}
