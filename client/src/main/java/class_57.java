import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Hashtable;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

// $VF: renamed from: aa
public class class_57 {
   // $VF: renamed from: a java.lang.String
   public String field_1523;
   // $VF: renamed from: b int
   public int field_1524;
   // $VF: renamed from: c long
   public static long field_1525;
   // $VF: renamed from: d java.lang.String
   public String field_1526;
   // $VF: renamed from: e long
   public long field_1527;
   // $VF: renamed from: f java.lang.String
   public String field_1528;
   // $VF: renamed from: g int
   public int field_1529;
   // $VF: renamed from: aO java.lang.String[]
   private String[] field_1530;
   // $VF: renamed from: h java.lang.String
   public String field_1531;
   // $VF: renamed from: i long
   public long field_1532;
   // $VF: renamed from: j java.util.Hashtable
   public Hashtable field_1533;
   // $VF: renamed from: k java.awt.image.BufferedImage
   public BufferedImage field_1534;
   // $VF: renamed from: l boolean
   public boolean field_1535;
   // $VF: renamed from: m java.util.Hashtable
   public Hashtable field_1536;
   // $VF: renamed from: n javax.swing.Icon
   public Icon field_1537;
   // $VF: renamed from: o javax.swing.Icon[]
   public Icon[] field_1538;
   // $VF: renamed from: p j
   public class_60 field_1539;
   // $VF: renamed from: q U
   public class_28 field_1540;
   // $VF: renamed from: r K
   public class_5 field_1541;
   // $VF: renamed from: s G
   public class_18 field_1542;
   // $VF: renamed from: t ah
   public class_20 field_1543;
   // $VF: renamed from: u T
   public class_67 field_1544;
   // $VF: renamed from: v MastersOfDestiny
   public MastersOfDestiny field_1545;
   // $VF: renamed from: w java.lang.Object[]
   public Object[] field_1546;
   // $VF: renamed from: x aE
   public class_33 field_1547;
   // $VF: renamed from: y javax.swing.Icon
   public Icon field_1548;
   // $VF: renamed from: z javax.swing.Icon
   public Icon field_1549;
   // $VF: renamed from: A int
   public int field_1550;
   // $VF: renamed from: B int
   public int field_1551;
   // $VF: renamed from: C java.awt.image.BufferedImage
   BufferedImage field_1552;
   // $VF: renamed from: D h
   public class_84 field_1553;
   // $VF: renamed from: aP int
   private final int field_1554 = 1;
   // $VF: renamed from: aQ int
   private final int field_1555 = 2;
   // $VF: renamed from: aR int
   private final int field_1556 = 3;
   // $VF: renamed from: aS int
   private final int field_1557 = 4;
   // $VF: renamed from: E javax.swing.Icon
   Icon field_1558;
   // $VF: renamed from: F javax.swing.Icon[]
   Icon[] field_1559;
   // $VF: renamed from: G javax.swing.Icon[]
   Icon[] field_1560;
   // $VF: renamed from: H javax.swing.Icon[]
   Icon[] field_1561;
   // $VF: renamed from: I javax.swing.Icon[]
   Icon[] field_1562;
   // $VF: renamed from: J javax.swing.Icon[]
   Icon[] field_1563;
   // $VF: renamed from: K javax.swing.Icon[]
   Icon[] field_1564;
   // $VF: renamed from: L javax.swing.Icon[]
   Icon[] field_1565;
   // $VF: renamed from: M javax.swing.Icon[]
   Icon[] field_1566;
   // $VF: renamed from: N javax.swing.Icon[]
   Icon[] field_1567;
   // $VF: renamed from: O javax.swing.Icon[]
   Icon[] field_1568;
   // $VF: renamed from: P javax.swing.Icon[]
   Icon[] field_1569;
   // $VF: renamed from: Q javax.swing.Icon[]
   Icon[] field_1570;
   // $VF: renamed from: R javax.swing.Icon
   Icon field_1571;
   // $VF: renamed from: S javax.swing.Icon
   Icon field_1572;
   // $VF: renamed from: T javax.swing.Icon
   Icon field_1573;
   // $VF: renamed from: U javax.swing.Icon
   Icon field_1574;
   // $VF: renamed from: V javax.swing.Icon[]
   Icon[] field_1575;
   // $VF: renamed from: W javax.swing.Icon[][]
   Icon[][] field_1576;
   // $VF: renamed from: X javax.swing.Icon
   Icon field_1577;
   // $VF: renamed from: Y javax.swing.Icon
   Icon field_1578;
   // $VF: renamed from: Z javax.swing.Icon
   Icon field_1579;
   // $VF: renamed from: aa javax.swing.Icon[]
   Icon[] field_1580;
   // $VF: renamed from: ab javax.swing.Icon[][]
   Icon[][] field_1581;
   // $VF: renamed from: ac javax.swing.Icon
   Icon field_1582;
   // $VF: renamed from: ad javax.swing.Icon
   Icon field_1583;
   // $VF: renamed from: ae javax.swing.Icon
   Icon field_1584;
   // $VF: renamed from: af javax.swing.Icon[]
   Icon[] field_1585;
   // $VF: renamed from: ag javax.swing.Icon[][]
   Icon[][] field_1586;
   // $VF: renamed from: ah javax.swing.Icon
   Icon field_1587;
   // $VF: renamed from: ai javax.swing.Icon
   Icon field_1588;
   // $VF: renamed from: aj javax.swing.Icon
   Icon field_1589;
   // $VF: renamed from: ak javax.swing.Icon[]
   Icon[] field_1590;
   // $VF: renamed from: al javax.swing.Icon[][]
   Icon[][] field_1591;
   // $VF: renamed from: am javax.swing.Icon
   Icon field_1592;
   // $VF: renamed from: an int
   static final int field_1593 = 0;
   // $VF: renamed from: ao int
   static final int field_1594 = 1;
   // $VF: renamed from: ap int
   static final int field_1595 = 2;
   // $VF: renamed from: aq int
   static final int field_1596 = 3;
   // $VF: renamed from: ar int
   static final int field_1597 = 4;
   // $VF: renamed from: as int
   static final int field_1598 = 5;
   // $VF: renamed from: at int
   static final int field_1599 = 6;
   // $VF: renamed from: au int
   static final int field_1600 = 7;
   // $VF: renamed from: av int
   static final int field_1601 = 8;
   // $VF: renamed from: aw int
   static final int field_1602 = 9;
   // $VF: renamed from: ax int
   static final int field_1603 = 10;
   // $VF: renamed from: ay int
   static final int field_1604 = 11;
   // $VF: renamed from: az int
   static final int field_1605 = 12;
   // $VF: renamed from: aA int
   static final int field_1606 = 13;
   // $VF: renamed from: aB int
   static final int field_1607 = 14;
   // $VF: renamed from: aC int
   static final int field_1608 = 15;
   // $VF: renamed from: aT int
   private int field_1609;
   // $VF: renamed from: aD java.net.Socket
   public Socket field_1610;
   // $VF: renamed from: aE java.io.BufferedReader
   public BufferedReader field_1611;
   // $VF: renamed from: aF java.io.PrintWriter
   public PrintWriter field_1612;
   // $VF: renamed from: aG java.applet.AudioClip
   AudioClip field_1613;
   // $VF: renamed from: aH java.applet.AudioClip
   AudioClip field_1614;
   // $VF: renamed from: aI java.applet.AudioClip
   AudioClip field_1615;
   // $VF: renamed from: aJ byte
   byte field_1616;
   // $VF: renamed from: aK byte
   final byte field_1617 = 0;
   // $VF: renamed from: aL byte
   final byte field_1618 = 1;
   // $VF: renamed from: aM byte
   final byte field_1619 = 2;
   // $VF: renamed from: aN byte
   final byte field_1620 = 3;

   // $VF: renamed from: a (java.lang.String, int) javax.swing.Icon
   public Icon method_499(String var1, int var2) {
      return new ImageIcon(this.getClass().getResource(this.method_504(var1, var2)));
   }

   // $VF: renamed from: b (java.lang.String, int) java.awt.image.BufferedImage
   public BufferedImage method_500(String var1, int var2) {
      BufferedImage var3 = null;

      try {
         var3 = ImageIO.read(this.getClass().getResource(this.method_504(var1, var2)));
      } catch (IOException var5) {
         class_62.method_563(" gameData.getImage IOException: " + var5.getMessage());
         var5.printStackTrace();
      }

      return var3;
   }

   // $VF: renamed from: c (java.lang.String, int) javax.swing.Icon[]
   public Icon[] method_501(String var1, int var2) {
      String[] var3 = this.field_1547.method_260(var1, var2, 0, 0);
      Icon[] var4 = new Icon[var3.length];

      for (int var5 = 0; var5 < var3.length; var5++) {
         var4[var5] = new ImageIcon(this.getClass().getResource(this.field_1547.method_256("en", 0) + var3[var5]));
      }

      return var4;
   }

   // $VF: renamed from: d (java.lang.String, int) int
   public int method_502(String var1, int var2) {
      return this.field_1547.method_254(var1, var2);
   }

   // $VF: renamed from: e (java.lang.String, int) int[]
   public int[] method_503(String var1, int var2) {
      return this.field_1547.method_257(var1, var2);
   }

   // $VF: renamed from: f (java.lang.String, int) java.lang.String
   public String method_504(String var1, int var2) {
      return this.field_1547.method_256("en", 0) + this.field_1547.method_256(var1, var2);
   }

   // $VF: renamed from: g (java.lang.String, int) java.lang.String
   public String method_505(String var1, int var2) {
      return this.field_1547.method_256(var1, var2);
   }

   public class_57(class_60 var1, class_28 var2, class_5 var3, class_18 var4, class_20 var5, class_67 var6, MastersOfDestiny var7, Object[] var8) {
      this.field_1535 = false;
      this.field_1539 = var1;
      this.field_1540 = var2;
      this.field_1541 = var3;
      this.field_1542 = var4;
      this.field_1543 = var5;
      this.field_1544 = var6;
      this.field_1545 = var7;
      this.field_1546 = var8;
      this.field_1553 = new class_84();
      this.field_1575 = new Icon[4];
      this.field_1575[0] = new ImageIcon(this.getClass().getResource("res/items/humans/white_mask/stand_ne.png"));
      this.field_1575[1] = new ImageIcon(this.getClass().getResource("res/items/humans/white_mask/stand_nw.png"));
      this.field_1575[2] = new ImageIcon(this.getClass().getResource("res/items/humans/white_mask/stand_sw.png"));
      this.field_1575[3] = new ImageIcon(this.getClass().getResource("res/items/humans/white_mask/stand_se.png"));
      this.field_1576 = new Icon[4][2];
      this.field_1576[0][0] = new ImageIcon(this.getClass().getResource("res/items/humans/yellow_mask/stand_ne1.png"));
      this.field_1576[0][1] = new ImageIcon(this.getClass().getResource("res/items/humans/yellow_mask/stand_ne2.png"));
      this.field_1576[1][0] = new ImageIcon(this.getClass().getResource("res/items/humans/yellow_mask/stand_nw1.png"));
      this.field_1576[1][1] = new ImageIcon(this.getClass().getResource("res/items/humans/yellow_mask/stand_nw2.png"));
      this.field_1576[2][0] = new ImageIcon(this.getClass().getResource("res/items/humans/yellow_mask/stand_sw1.png"));
      this.field_1576[2][1] = new ImageIcon(this.getClass().getResource("res/items/humans/yellow_mask/stand_sw2.png"));
      this.field_1576[3][0] = new ImageIcon(this.getClass().getResource("res/items/humans/yellow_mask/stand_se1.png"));
      this.field_1576[3][1] = new ImageIcon(this.getClass().getResource("res/items/humans/yellow_mask/stand_se2.png"));
      this.field_1577 = new ImageIcon(this.getClass().getResource("res/items/humans/human_die.png"));
      this.field_1580 = new Icon[4];
      this.field_1580[0] = new ImageIcon(this.getClass().getResource("res/items/taikuus/white_mask/stand_ne.png"));
      this.field_1580[1] = new ImageIcon(this.getClass().getResource("res/items/taikuus/white_mask/stand_nw.png"));
      this.field_1580[2] = new ImageIcon(this.getClass().getResource("res/items/taikuus/white_mask/stand_sw.png"));
      this.field_1580[3] = new ImageIcon(this.getClass().getResource("res/items/taikuus/white_mask/stand_se.png"));
      this.field_1581 = new Icon[4][2];
      this.field_1581[0][0] = new ImageIcon(this.getClass().getResource("res/items/taikuus/yellow_mask/stand_ne1.png"));
      this.field_1581[0][1] = new ImageIcon(this.getClass().getResource("res/items/taikuus/yellow_mask/stand_ne2.png"));
      this.field_1581[1][0] = new ImageIcon(this.getClass().getResource("res/items/taikuus/yellow_mask/stand_nw1.png"));
      this.field_1581[1][1] = new ImageIcon(this.getClass().getResource("res/items/taikuus/yellow_mask/stand_nw2.png"));
      this.field_1581[2][0] = new ImageIcon(this.getClass().getResource("res/items/taikuus/yellow_mask/stand_sw1.png"));
      this.field_1581[2][1] = new ImageIcon(this.getClass().getResource("res/items/taikuus/yellow_mask/stand_sw2.png"));
      this.field_1581[3][0] = new ImageIcon(this.getClass().getResource("res/items/taikuus/yellow_mask/stand_se1.png"));
      this.field_1581[3][1] = new ImageIcon(this.getClass().getResource("res/items/taikuus/yellow_mask/stand_se2.png"));
      this.field_1582 = new ImageIcon(this.getClass().getResource("res/items/taikuus/taikus_die.png"));
      this.field_1585 = new Icon[4];
      this.field_1585[0] = new ImageIcon(this.getClass().getResource("res/items/firan/white_mask/stand_ne.png"));
      this.field_1585[1] = new ImageIcon(this.getClass().getResource("res/items/firan/white_mask/stand_nw.png"));
      this.field_1585[2] = new ImageIcon(this.getClass().getResource("res/items/firan/white_mask/stand_sw.png"));
      this.field_1585[3] = new ImageIcon(this.getClass().getResource("res/items/firan/white_mask/stand_se.png"));
      this.field_1586 = new Icon[4][2];
      this.field_1586[0][0] = new ImageIcon(this.getClass().getResource("res/items/firan/yellow_mask/stand_ne1.png"));
      this.field_1586[0][1] = new ImageIcon(this.getClass().getResource("res/items/firan/yellow_mask/stand_ne2.png"));
      this.field_1586[1][0] = new ImageIcon(this.getClass().getResource("res/items/firan/yellow_mask/stand_nw1.png"));
      this.field_1586[1][1] = new ImageIcon(this.getClass().getResource("res/items/firan/yellow_mask/stand_nw2.png"));
      this.field_1586[2][0] = new ImageIcon(this.getClass().getResource("res/items/firan/yellow_mask/stand_sw1.png"));
      this.field_1586[2][1] = new ImageIcon(this.getClass().getResource("res/items/firan/yellow_mask/stand_sw2.png"));
      this.field_1586[3][0] = new ImageIcon(this.getClass().getResource("res/items/firan/yellow_mask/stand_se1.png"));
      this.field_1586[3][1] = new ImageIcon(this.getClass().getResource("res/items/firan/yellow_mask/stand_se2.png"));
      this.field_1587 = new ImageIcon(this.getClass().getResource("res/items/firan/firan_die.png"));
      this.field_1590 = new Icon[4];
      this.field_1590[0] = new ImageIcon(this.getClass().getResource("res/items/brucian/white_mask/stand_ne.png"));
      this.field_1590[1] = new ImageIcon(this.getClass().getResource("res/items/brucian/white_mask/stand_nw.png"));
      this.field_1590[2] = new ImageIcon(this.getClass().getResource("res/items/brucian/white_mask/stand_sw.png"));
      this.field_1590[3] = new ImageIcon(this.getClass().getResource("res/items/brucian/white_mask/stand_se.png"));
      this.field_1591 = new Icon[4][2];
      this.field_1591[0][0] = new ImageIcon(this.getClass().getResource("res/items/brucian/yellow_mask/stand_ne1.png"));
      this.field_1591[0][1] = new ImageIcon(this.getClass().getResource("res/items/brucian/yellow_mask/stand_ne2.png"));
      this.field_1591[1][0] = new ImageIcon(this.getClass().getResource("res/items/brucian/yellow_mask/stand_nw1.png"));
      this.field_1591[1][1] = new ImageIcon(this.getClass().getResource("res/items/brucian/yellow_mask/stand_nw2.png"));
      this.field_1591[2][0] = new ImageIcon(this.getClass().getResource("res/items/brucian/yellow_mask/stand_sw1.png"));
      this.field_1591[2][1] = new ImageIcon(this.getClass().getResource("res/items/brucian/yellow_mask/stand_sw2.png"));
      this.field_1591[3][0] = new ImageIcon(this.getClass().getResource("res/items/brucian/yellow_mask/stand_se1.png"));
      this.field_1591[3][1] = new ImageIcon(this.getClass().getResource("res/items/brucian/yellow_mask/stand_se2.png"));
      this.field_1592 = new ImageIcon(this.getClass().getResource("res/items/brucian/brucian_die.png"));
      this.field_1558 = new ImageIcon(this.getClass().getResource("res/effects/hit/effect_hit.png"));
      this.field_1559 = new Icon[3];
      this.field_1559[0] = new ImageIcon(this.getClass().getResource("res/effects/UE_target/effect_useitem_target1.png"));
      this.field_1559[1] = new ImageIcon(this.getClass().getResource("res/effects/UE_target/effect_useitem_target2.png"));
      this.field_1559[2] = new ImageIcon(this.getClass().getResource("res/effects/UE_target/effect_useitem_target3.png"));
      this.field_1560 = new Icon[3];
      this.field_1560[0] = new ImageIcon(this.getClass().getResource("res/effects/UE_caster/effect_useitem_caster1.png"));
      this.field_1560[1] = new ImageIcon(this.getClass().getResource("res/effects/UE_caster/effect_useitem_caster2.png"));
      this.field_1560[2] = new ImageIcon(this.getClass().getResource("res/effects/UE_caster/effect_useitem_caster3.png"));
      this.field_1561 = new Icon[3];
      this.field_1561[0] = new ImageIcon(this.getClass().getResource("res/effects/skill_caster/effect_buff_caster1.png"));
      this.field_1561[1] = new ImageIcon(this.getClass().getResource("res/effects/skill_caster/effect_buff_caster2.png"));
      this.field_1561[2] = new ImageIcon(this.getClass().getResource("res/effects/skill_caster/effect_buff_caster3.png"));
      this.field_1562 = new Icon[3];
      this.field_1562[0] = new ImageIcon(this.getClass().getResource("res/effects/skill_target/effect_buff_target1.png"));
      this.field_1562[1] = new ImageIcon(this.getClass().getResource("res/effects/skill_target/effect_buff_target2.png"));
      this.field_1562[2] = new ImageIcon(this.getClass().getResource("res/effects/skill_target/effect_buff_target3.png"));
      this.field_1563 = new Icon[3];
      this.field_1563[0] = new ImageIcon(this.getClass().getResource("res/effects/skill_caster/effect_debuff_caster1.png"));
      this.field_1563[1] = new ImageIcon(this.getClass().getResource("res/effects/skill_caster/effect_debuff_caster2.png"));
      this.field_1563[2] = new ImageIcon(this.getClass().getResource("res/effects/skill_caster/effect_debuff_caster3.png"));
      this.field_1564 = new Icon[3];
      this.field_1564[0] = new ImageIcon(this.getClass().getResource("res/effects/skill_target/effect_debuff_target1.png"));
      this.field_1564[1] = new ImageIcon(this.getClass().getResource("res/effects/skill_target/effect_debuff_target2.png"));
      this.field_1564[2] = new ImageIcon(this.getClass().getResource("res/effects/skill_target/effect_debuff_target3.png"));
      this.field_1565 = new Icon[3];
      this.field_1565[0] = new ImageIcon(this.getClass().getResource("res/effects/skill_caster/effect_flame_caster1.png"));
      this.field_1565[1] = new ImageIcon(this.getClass().getResource("res/effects/skill_caster/effect_flame_caster2.png"));
      this.field_1565[2] = new ImageIcon(this.getClass().getResource("res/effects/skill_caster/effect_flame_caster3.png"));
      this.field_1566 = new Icon[4];
      this.field_1566[0] = new ImageIcon(this.getClass().getResource("res/effects/skill_target/effect_flame_target1.png"));
      this.field_1566[1] = new ImageIcon(this.getClass().getResource("res/effects/skill_target/effect_flame_target2.png"));
      this.field_1566[2] = new ImageIcon(this.getClass().getResource("res/effects/skill_target/effect_flame_target3.png"));
      this.field_1566[3] = new ImageIcon(this.getClass().getResource("res/effects/skill_target/effect_flame_target4.png"));
      this.field_1567 = new Icon[3];
      this.field_1567[0] = new ImageIcon(this.getClass().getResource("res/effects/skill_caster/effect_melee_caster1.png"));
      this.field_1567[1] = new ImageIcon(this.getClass().getResource("res/effects/skill_caster/effect_melee_caster2.png"));
      this.field_1567[2] = new ImageIcon(this.getClass().getResource("res/effects/skill_caster/effect_melee_caster3.png"));
      this.field_1568 = new Icon[2];
      this.field_1568[0] = new ImageIcon(this.getClass().getResource("res/effects/skill_target/effect_melee_target1.png"));
      this.field_1568[1] = new ImageIcon(this.getClass().getResource("res/effects/skill_target/effect_melee_target2.png"));
      this.field_1569 = new Icon[3];
      this.field_1569[0] = new ImageIcon(this.getClass().getResource("res/effects/skill_caster/effect_ranged_caster1.png"));
      this.field_1569[1] = new ImageIcon(this.getClass().getResource("res/effects/skill_caster/effect_ranged_caster2.png"));
      this.field_1569[2] = new ImageIcon(this.getClass().getResource("res/effects/skill_caster/effect_ranged_caster3.png"));
      this.field_1570 = new Icon[2];
      this.field_1570[0] = new ImageIcon(this.getClass().getResource("res/effects/skill_target/effect_ranged_target1.png"));
      this.field_1570[1] = new ImageIcon(this.getClass().getResource("res/effects/skill_target/effect_ranged_target2.png"));
      this.field_1571 = new ImageIcon(this.getClass().getResource("res/missions/mini_hp.png"));
      this.field_1572 = new ImageIcon(this.getClass().getResource("res/missions/mini_hp1.png"));
      class_62.method_563("gameData.miniLifeBar - " + this.field_1571 + " gameData.miniLifeDepleteBar - " + this.field_1572);
      this.field_1547 = var1.method_552();
      this.field_1613 = Applet.newAudioClip(this.getClass().getResource(this.field_1547.method_253("en", 0) + this.field_1547.method_256("en", 287)));
      this.field_1615 = Applet.newAudioClip(this.getClass().getResource(this.field_1547.method_253("en", 0) + this.field_1547.method_256("en", 288)));
      this.field_1614 = Applet.newAudioClip(this.getClass().getResource(this.field_1547.method_253("en", 0) + this.field_1547.method_256("en", 289)));
      this.field_1616 = 0;
      this.field_1530 = this.field_1547.method_260("en", 267, 0, 0);

      try {
         BufferedImage var9 = ImageIO.read(this.getClass().getResource(this.method_504("en", 88)));
         this.field_1552 = new BufferedImage(var9.getWidth(null), var9.getHeight(null), 1);
         this.field_1552.createGraphics().drawImage(var9, 0, 0, null);
      } catch (IOException var10) {
      }
   }

   // $VF: renamed from: a (int) java.lang.String
   public String method_506(int var1) {
      return this.field_1530[var1];
   }

   // $VF: renamed from: b (int) javax.swing.Icon
   public Icon method_507(int var1) {
      switch (var1) {
         case 1:
            return this.field_1573;
         case 2:
            return this.field_1578;
         case 3:
            return this.field_1583;
         case 4:
            return this.field_1588;
         default:
            class_62.method_563("GameDate.getClamourShot: Error! - invalid race id");
            return null;
      }
   }

   // $VF: renamed from: c (int) javax.swing.Icon
   public Icon method_508(int var1) {
      switch (var1) {
         case 1:
            return this.field_1574;
         case 2:
            return this.field_1579;
         case 3:
            return this.field_1584;
         case 4:
            return this.field_1589;
         default:
            class_62.method_563("GameDate.getClamourShot: Error! - invalid race id");
            return null;
      }
   }

   // $VF: renamed from: a () int
   public int method_509() {
      return this.field_1609;
   }

   // $VF: renamed from: a (java.lang.String) void
   public void method_510(String var1) {
      String[] var2 = this.method_511(var1);
      this.method_512(var2);
   }

   // $VF: renamed from: b (java.lang.String) java.lang.String[]
   public String[] method_511(String var1) {
      String[] var2 = var1.split("\\|");
      this.method_513(class_68.method_619(var2[1]));
      var1 = "";
      if (this.field_1609 < Integer.parseInt(var2[1])) {
         for (int var3 = 0; var3 < var2.length; var3++) {
            if (var3 != 1) {
               var1 = var1 + var2[var3];
               if (var3 != var2.length - 1) {
                  var1 = var1 + "|";
               }
            }
         }

         this.field_1609 = Integer.parseInt(var2[1]);
      }

      return var1.split("\\|");
   }

   // $VF: renamed from: a (java.lang.String[]) void
   public void method_512(String[] var1) {
   }

   // $VF: renamed from: c (java.lang.String) void
   public void method_513(String var1) {
      this.field_1612.write(var1);
      this.field_1612.flush();
   }

   // $VF: renamed from: a (byte) void
   public void method_514(byte var1) {
      if (this.field_1616 != 0) {
         switch (this.field_1616) {
            case 1:
               this.field_1613.stop();
               break;
            case 2:
               this.field_1615.stop();
               break;
            case 3:
               if (var1 == 1 || var1 == 2) {
                  this.field_1614.stop();
               }
         }
      }

      switch (var1) {
         case 1:
            try {
               Thread.sleep(100L);
               this.field_1613.play();
               Thread.sleep(1000L);
               this.field_1616 = 1;
            } catch (InterruptedException var3) {
               class_62.method_563(var3.getMessage());
            }
            break;
         case 2:
            this.field_1615.play();
            this.field_1616 = 2;
            break;
         case 3:
            this.field_1614.play();
            this.field_1616 = 3;
      }
   }
}
