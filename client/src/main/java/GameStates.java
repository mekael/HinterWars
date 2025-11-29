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

public class GameStates implements Runnable, class_0 {
   // $VF: renamed from: a java.lang.String
   String field_389 = "5";
   // $VF: renamed from: b java.lang.String
   String field_390 = "b1.main.hinterwars.com";
   // $VF: renamed from: c int
   int field_391;
   // $VF: renamed from: d int
   int field_392;
   // $VF: renamed from: e boolean
   boolean field_393 = false;
   // $VF: renamed from: f int
   int field_394 = 0;
   // $VF: renamed from: g java.lang.String
   String field_395;
   // $VF: renamed from: h java.awt.image.BufferedImage
   BufferedImage field_396;
   // $VF: renamed from: i java.awt.image.BufferedImage
   BufferedImage field_397;
   // $VF: renamed from: j java.awt.Image
   Image field_398;
   // $VF: renamed from: k java.util.Hashtable
   Hashtable field_399;
   // $VF: renamed from: l java.util.Hashtable
   Hashtable field_400;
   // $VF: renamed from: m javax.swing.Icon
   Icon field_401;
   // $VF: renamed from: n javax.swing.Icon[]
   Icon[] field_402;
   // $VF: renamed from: o javax.swing.Icon
   Icon field_403;
   // $VF: renamed from: p az
   class_89 field_404;
   // $VF: renamed from: q C
   class_88 field_405;
   // $VF: renamed from: r C
   class_88 field_406;
   // $VF: renamed from: s C
   class_88 field_407;
   // $VF: renamed from: t C
   class_88 field_408;
   // $VF: renamed from: u C
   class_88 field_409;
   // $VF: renamed from: v C
   class_88 field_410;
   // $VF: renamed from: w C
   class_88 field_411;
   // $VF: renamed from: x az
   class_89 field_412;
   // $VF: renamed from: y af
   class_93 field_413;
   // $VF: renamed from: z af
   class_93 field_414;
   // $VF: renamed from: A af
   class_93 field_415;
   // $VF: renamed from: B af
   class_93 field_416;
   // $VF: renamed from: C af
   class_93 field_417;
   // $VF: renamed from: D af
   class_93 field_418;
   // $VF: renamed from: E af
   class_93 field_419;
   // $VF: renamed from: F az
   class_89 field_420;
   // $VF: renamed from: G ad
   class_90 field_421;
   // $VF: renamed from: H az
   class_89 field_422;
   // $VF: renamed from: I af
   class_93 field_423;
   // $VF: renamed from: J af
   class_93 field_424;
   // $VF: renamed from: K af
   class_93 field_425;
   // $VF: renamed from: L af
   class_93 field_426;
   // $VF: renamed from: M az
   class_89 field_427;
   // $VF: renamed from: N ak
   class_87 field_428;
   // $VF: renamed from: O H
   class_92 field_429;
   // $VF: renamed from: P boolean
   boolean field_430 = false;
   // $VF: renamed from: Q boolean
   boolean field_431 = false;
   // $VF: renamed from: R boolean
   boolean field_432 = false;
   // $VF: renamed from: S java.net.Socket
   Socket field_433;
   // $VF: renamed from: T java.io.BufferedReader
   BufferedReader field_434 = null;
   // $VF: renamed from: U java.io.PrintWriter
   PrintWriter field_435 = null;
   // $VF: renamed from: V long
   static long field_436;
   // $VF: renamed from: W int
   static int field_437;
   // $VF: renamed from: X long
   static long field_438;
   // $VF: renamed from: Y java.lang.String
   static String field_439;
   // $VF: renamed from: Z java.lang.String
   static String field_440;
   // $VF: renamed from: aa d
   class_95 field_441;
   // $VF: renamed from: ab byte
   byte field_442;
   // $VF: renamed from: ud byte
   private final byte field_443 = 0;
   // $VF: renamed from: ue byte
   private final byte field_444 = 1;
   // $VF: renamed from: uf byte
   private final byte field_445 = 2;
   // $VF: renamed from: ug byte
   private final byte field_446 = 3;
   // $VF: renamed from: uh byte
   private final byte field_447 = 4;
   // $VF: renamed from: ui byte
   private final byte field_448 = 5;
   // $VF: renamed from: uj byte
   private final byte field_449 = 6;
   // $VF: renamed from: uk byte
   private final byte field_450 = 7;
   // $VF: renamed from: ac W
   class_58 field_451;
   // $VF: renamed from: ad java.lang.String
   String field_452;
   // $VF: renamed from: ae int
   int field_453;
   // $VF: renamed from: af int
   int field_454;
   // $VF: renamed from: ag int
   int field_455;
   // $VF: renamed from: ah int
   int field_456;
   // $VF: renamed from: ai java.lang.String[]
   String[] field_457;
   // $VF: renamed from: aj int[]
   int[] field_458;
   // $VF: renamed from: ak int[]
   int[] field_459;
   // $VF: renamed from: al int[]
   int[] field_460;
   // $VF: renamed from: am java.lang.Object[]
   Object[] field_461;
   // $VF: renamed from: an int[]
   int[] field_462;
   // $VF: renamed from: ao java.lang.Object[]
   Object[] field_463;
   // $VF: renamed from: ap javax.swing.Icon[]
   Icon[] field_464;
   // $VF: renamed from: aq int[]
   int[] field_465;
   // $VF: renamed from: ar int[]
   int[] field_466;
   // $VF: renamed from: as int[]
   int[] field_467;
   // $VF: renamed from: at int[]
   int[] field_468;
   // $VF: renamed from: au byte
   final byte field_469 = 0;
   // $VF: renamed from: av byte
   final byte field_470 = 1;
   // $VF: renamed from: aw byte
   final byte field_471 = 2;
   // $VF: renamed from: ax byte
   final byte field_472 = 3;
   // $VF: renamed from: ay byte
   final byte field_473 = 4;
   // $VF: renamed from: az byte
   final byte field_474 = 5;
   // $VF: renamed from: aA int
   int field_475 = -1;
   // $VF: renamed from: aB int
   int field_476 = -1;
   // $VF: renamed from: aC javax.swing.Icon
   Icon field_477;
   // $VF: renamed from: aD int[]
   int[] field_478;
   // $VF: renamed from: aE int
   int field_479;
   // $VF: renamed from: aF int
   int field_480;
   // $VF: renamed from: aG int
   int field_481;
   // $VF: renamed from: aH int
   int field_482;
   // $VF: renamed from: aI int[]
   int[] field_483;
   // $VF: renamed from: aJ int
   int field_484;
   // $VF: renamed from: aK int
   int field_485;
   // $VF: renamed from: aL javax.swing.Icon[]
   Icon[] field_486;
   // $VF: renamed from: aM int[]
   int[] field_487;
   // $VF: renamed from: aN int
   int field_488;
   // $VF: renamed from: aO int[]
   int[] field_489;
   // $VF: renamed from: aP int
   int field_490;
   // $VF: renamed from: aQ byte
   final byte field_491 = 0;
   // $VF: renamed from: aR byte
   final byte field_492 = 1;
   // $VF: renamed from: aS int
   int field_493 = 0;
   // $VF: renamed from: aT int
   int field_494 = 0;
   // $VF: renamed from: aU int
   int field_495 = 0;
   // $VF: renamed from: aV int
   int field_496 = 0;
   // $VF: renamed from: aW int
   int field_497;
   // $VF: renamed from: aX int
   int field_498;
   // $VF: renamed from: aY int
   int field_499;
   // $VF: renamed from: aZ int
   int field_500;
   // $VF: renamed from: ba int
   int field_501;
   // $VF: renamed from: bb int
   int field_502;
   // $VF: renamed from: bc int
   int field_503;
   // $VF: renamed from: bd int
   int field_504;
   // $VF: renamed from: be int
   int field_505;
   // $VF: renamed from: bf int
   int field_506;
   // $VF: renamed from: bg int
   int field_507 = 0;
   // $VF: renamed from: bh int
   int field_508 = 8;
   // $VF: renamed from: bi int
   int field_509;
   // $VF: renamed from: bj int
   int field_510;
   // $VF: renamed from: bk int
   int field_511;
   // $VF: renamed from: bl int
   int field_512;
   // $VF: renamed from: bm int
   int field_513;
   // $VF: renamed from: bn int
   int field_514;
   // $VF: renamed from: bo int
   int field_515 = 0;
   // $VF: renamed from: bp int
   int field_516 = 0;
   // $VF: renamed from: bq java.util.Vector
   Vector field_517;
   // $VF: renamed from: br java.util.Vector
   Vector field_518;
   // $VF: renamed from: bs javax.swing.Icon
   Icon field_519;
   // $VF: renamed from: bt javax.swing.Icon
   Icon field_520;
   // $VF: renamed from: bu javax.swing.Icon
   Icon field_521;
   // $VF: renamed from: bv int[]
   int[] field_522;
   // $VF: renamed from: bw int[]
   int[] field_523;
   // $VF: renamed from: bx int
   int field_524;
   // $VF: renamed from: by int
   int field_525;
   // $VF: renamed from: bz javax.swing.Icon[]
   Icon[] field_526;
   // $VF: renamed from: bA int
   int field_527;
   // $VF: renamed from: bB int
   int field_528;
   // $VF: renamed from: bC int
   int field_529;
   // $VF: renamed from: bD int[]
   int[] field_530;
   // $VF: renamed from: bE int
   int field_531;
   // $VF: renamed from: bF int
   int field_532;
   // $VF: renamed from: bG int
   int field_533;
   // $VF: renamed from: bH int
   int field_534;
   // $VF: renamed from: bI int
   int field_535;
   // $VF: renamed from: bJ int
   int field_536;
   // $VF: renamed from: bK javax.swing.Icon[]
   Icon[] field_537;
   // $VF: renamed from: bL byte
   final byte field_538 = 0;
   // $VF: renamed from: bM byte
   final byte field_539 = 1;
   // $VF: renamed from: bN int[]
   int[] field_540;
   // $VF: renamed from: bO int
   int field_541;
   // $VF: renamed from: bP int[]
   int[] field_542;
   // $VF: renamed from: bQ int
   int field_543;
   // $VF: renamed from: bR javax.swing.Icon
   Icon field_544;
   // $VF: renamed from: bS int
   int field_545;
   // $VF: renamed from: bT int
   int field_546;
   // $VF: renamed from: bU int
   int field_547 = 0;
   // $VF: renamed from: bV boolean
   boolean field_548 = false;
   // $VF: renamed from: bW int
   int field_549 = -1;
   // $VF: renamed from: bX int
   int field_550 = -1;
   // $VF: renamed from: bY javax.swing.Icon
   Icon field_551;
   // $VF: renamed from: bZ java.util.Vector
   Vector field_552 = new Vector();
   // $VF: renamed from: ca java.util.Vector
   Vector field_553 = new Vector();
   // $VF: renamed from: cb int
   int field_554 = -1;
   // $VF: renamed from: cc int
   int field_555 = 0;
   // $VF: renamed from: cd int
   int field_556 = -1;
   // $VF: renamed from: ce int
   int field_557 = 0;
   // $VF: renamed from: cf int
   int field_558 = 0;
   // $VF: renamed from: cg ak
   class_87 field_559;
   // $VF: renamed from: ch java.lang.String
   String field_560;
   // $VF: renamed from: ci javax.swing.Icon
   Icon field_561;
   // $VF: renamed from: cj byte
   final byte field_562 = 1;
   // $VF: renamed from: ck int
   int field_563;
   // $VF: renamed from: cl int[]
   int[] field_564;
   // $VF: renamed from: cm int
   int field_565;
   // $VF: renamed from: cn int
   int field_566;
   // $VF: renamed from: co int
   int field_567 = -1;
   // $VF: renamed from: cp int
   static int field_568 = 11;
   // $VF: renamed from: cq int
   int field_569;
   // $VF: renamed from: cr int
   int field_570;
   // $VF: renamed from: cs int
   int field_571;
   // $VF: renamed from: ct int
   int field_572;
   // $VF: renamed from: cu int
   int field_573;
   // $VF: renamed from: cv int
   int field_574 = 0;
   // $VF: renamed from: cw int
   int field_575 = 0;
   // $VF: renamed from: cx int
   int field_576;
   // $VF: renamed from: cy int
   int field_577;
   // $VF: renamed from: cz int
   int field_578;
   // $VF: renamed from: cA int
   int field_579;
   // $VF: renamed from: cB javax.swing.Icon
   Icon field_580;
   // $VF: renamed from: cC boolean
   boolean field_581 = false;
   // $VF: renamed from: cD int
   int field_582;
   // $VF: renamed from: cE int
   int field_583;
   // $VF: renamed from: cF int
   int field_584;
   // $VF: renamed from: cG int
   int field_585;
   // $VF: renamed from: cH javax.swing.Icon
   Icon field_586;
   // $VF: renamed from: cI boolean
   boolean field_587 = false;
   // $VF: renamed from: cJ boolean
   boolean field_588 = false;
   // $VF: renamed from: cK int[]
   int[] field_589;
   // $VF: renamed from: cL int
   int field_590;
   // $VF: renamed from: cM int
   int field_591;
   // $VF: renamed from: cN int
   int field_592;
   // $VF: renamed from: cO int[]
   int[] field_593;
   // $VF: renamed from: cP int
   int field_594;
   // $VF: renamed from: cQ int
   int field_595;
   // $VF: renamed from: cR int
   int field_596;
   // $VF: renamed from: cS int
   int field_597;
   // $VF: renamed from: cT java.util.Vector
   Vector field_598;
   // $VF: renamed from: cU java.util.Vector
   Vector field_599;
   // $VF: renamed from: cV int
   int field_600;
   // $VF: renamed from: cW int
   int field_601;
   // $VF: renamed from: cX int
   int field_602;
   // $VF: renamed from: cY int
   int field_603;
   // $VF: renamed from: cZ int
   int field_604;
   // $VF: renamed from: da int
   int field_605;
   // $VF: renamed from: db javax.swing.Icon[]
   Icon[] field_606;
   // $VF: renamed from: dc int
   int field_607 = 0;
   // $VF: renamed from: dd int[]
   int[] field_608;
   // $VF: renamed from: de int
   int field_609;
   // $VF: renamed from: df int[]
   int[] field_610;
   // $VF: renamed from: dg int
   int field_611;
   // $VF: renamed from: dh int[]
   int[] field_612;
   // $VF: renamed from: di int[]
   int[] field_613;
   // $VF: renamed from: dj int
   int field_614;
   // $VF: renamed from: dk int
   int field_615;
   // $VF: renamed from: dl int
   int field_616;
   // $VF: renamed from: dm int[]
   int[] field_617;
   // $VF: renamed from: dn int
   int field_618;
   // $VF: renamed from: do int
   int field_619;
   // $VF: renamed from: dp java.lang.String
   String field_620;
   // $VF: renamed from: dq int
   int field_621;
   // $VF: renamed from: dr int
   int field_622;
   // $VF: renamed from: ds int
   int field_623;
   // $VF: renamed from: dt int
   int field_624;
   // $VF: renamed from: du int
   int field_625 = -1;
   // $VF: renamed from: dv int
   int field_626 = -1;
   // $VF: renamed from: dw boolean
   boolean field_627 = false;
   // $VF: renamed from: dx javax.swing.Icon
   Icon field_628;
   // $VF: renamed from: dy int
   int field_629;
   // $VF: renamed from: dz int
   int field_630;
   // $VF: renamed from: dA int[]
   int[] field_631;
   // $VF: renamed from: dB int
   int field_632;
   // $VF: renamed from: dC int[]
   int[] field_633;
   // $VF: renamed from: dD int
   int field_634;
   // $VF: renamed from: dE int
   int field_635;
   // $VF: renamed from: dF int[]
   int[] field_636;
   // $VF: renamed from: dG int
   int field_637;
   // $VF: renamed from: dH int
   int field_638;
   // $VF: renamed from: dI av
   class_30 field_639;
   // $VF: renamed from: dJ boolean
   boolean field_640 = false;
   // $VF: renamed from: dK boolean
   boolean field_641 = false;
   // $VF: renamed from: dL boolean
   boolean field_642 = false;
   // $VF: renamed from: dM javax.swing.Icon
   Icon field_643;
   // $VF: renamed from: dN javax.swing.Icon
   Icon field_644;
   // $VF: renamed from: dO javax.swing.Icon[]
   Icon[] field_645;
   // $VF: renamed from: dP int
   int field_646;
   // $VF: renamed from: dQ int[]
   int[] field_647;
   // $VF: renamed from: dR int
   int field_648;
   // $VF: renamed from: dS int[]
   int[] field_649;
   // $VF: renamed from: dT int
   int field_650;
   // $VF: renamed from: dU javax.swing.Icon
   Icon field_651;
   // $VF: renamed from: dV int
   int field_652;
   // $VF: renamed from: dW int
   int field_653;
   // $VF: renamed from: dX javax.swing.Icon[]
   Icon[] field_654;
   // $VF: renamed from: dY javax.swing.Icon
   Icon field_655;
   // $VF: renamed from: dZ int[]
   int[] field_656;
   // $VF: renamed from: ea int
   int field_657;
   // $VF: renamed from: eb int
   int field_658;
   // $VF: renamed from: ec int
   int field_659;
   // $VF: renamed from: ed int[]
   int[] field_660;
   // $VF: renamed from: ee int
   int field_661;
   // $VF: renamed from: ef int
   int field_662;
   // $VF: renamed from: eg int
   int field_663;
   // $VF: renamed from: eh int
   int field_664;
   // $VF: renamed from: ei int
   int field_665;
   // $VF: renamed from: ej int
   int field_666;
   // $VF: renamed from: ek int[]
   int[] field_667;
   // $VF: renamed from: el int
   int field_668;
   // $VF: renamed from: em int
   int field_669;
   // $VF: renamed from: en int
   int field_670;
   // $VF: renamed from: eo int
   int field_671;
   // $VF: renamed from: ep int
   int field_672;
   // $VF: renamed from: eq int
   int field_673;
   // $VF: renamed from: er int
   int field_674;
   // $VF: renamed from: es int
   int field_675;
   // $VF: renamed from: et int
   int field_676;
   // $VF: renamed from: eu int
   int field_677;
   // $VF: renamed from: ev int
   int field_678;
   // $VF: renamed from: ew int
   int field_679;
   // $VF: renamed from: ex int
   int field_680;
   // $VF: renamed from: ey ai
   class_63 field_681;
   // $VF: renamed from: ez boolean
   boolean field_682;
   // $VF: renamed from: eA java.util.Vector
   Vector field_683;
   // $VF: renamed from: eB java.lang.String[]
   String[] field_684;
   // $VF: renamed from: eC int
   int field_685;
   // $VF: renamed from: eD int
   int field_686;
   // $VF: renamed from: eE int
   int field_687;
   // $VF: renamed from: eF int
   int field_688;
   // $VF: renamed from: eG int
   int field_689;
   // $VF: renamed from: eH int
   int field_690;
   // $VF: renamed from: eI ai
   class_63 field_691;
   // $VF: renamed from: eJ int
   int field_692;
   // $VF: renamed from: eK int
   int field_693;
   // $VF: renamed from: eL int
   int field_694;
   // $VF: renamed from: eM int
   int field_695;
   // $VF: renamed from: eN int
   int field_696;
   // $VF: renamed from: eO int
   int field_697;
   // $VF: renamed from: eP ai
   class_63 field_698;
   // $VF: renamed from: eQ java.lang.String
   String field_699 = null;
   // $VF: renamed from: eR java.lang.String
   String field_700 = null;
   // $VF: renamed from: eS javax.swing.Icon[]
   Icon[] field_701;
   // $VF: renamed from: eT byte
   final byte field_702 = 0;
   // $VF: renamed from: eU byte
   final byte field_703 = 1;
   // $VF: renamed from: eV byte
   final byte field_704 = 2;
   // $VF: renamed from: eW int[]
   int[] field_705;
   // $VF: renamed from: eX int[]
   int[] field_706;
   // $VF: renamed from: eY int[]
   int[] field_707;
   // $VF: renamed from: eZ int
   int field_708;
   // $VF: renamed from: fa int
   int field_709 = -1;
   // $VF: renamed from: fb int
   int field_710;
   // $VF: renamed from: fc int
   int field_711;
   // $VF: renamed from: fd int
   int field_712;
   // $VF: renamed from: fe int
   int field_713;
   // $VF: renamed from: ff int
   int field_714;
   // $VF: renamed from: fg int
   int field_715 = 0;
   // $VF: renamed from: fh int
   int field_716 = 0;
   // $VF: renamed from: fi int
   static int field_717 = 11;
   // $VF: renamed from: fj int
   int field_718;
   // $VF: renamed from: fk int
   int field_719;
   // $VF: renamed from: fl int
   int field_720;
   // $VF: renamed from: fm int
   int field_721;
   // $VF: renamed from: fn int
   int field_722;
   // $VF: renamed from: fo int
   int field_723;
   // $VF: renamed from: fp int
   int field_724;
   // $VF: renamed from: fq int
   int field_725;
   // $VF: renamed from: fr javax.swing.Icon
   Icon field_726;
   // $VF: renamed from: fs int[]
   int[] field_727;
   // $VF: renamed from: ft int
   int field_728;
   // $VF: renamed from: fu int
   int field_729;
   // $VF: renamed from: fv int
   int field_730;
   // $VF: renamed from: fw int
   int field_731;
   // $VF: renamed from: fx int
   int field_732;
   // $VF: renamed from: fy int
   int field_733;
   // $VF: renamed from: fz int
   int field_734;
   // $VF: renamed from: fA int
   int field_735;
   // $VF: renamed from: fB javax.swing.Icon[]
   Icon[] field_736;
   // $VF: renamed from: fC int[]
   int[] field_737;
   // $VF: renamed from: fD int
   int field_738;
   // $VF: renamed from: fE int[]
   int[] field_739;
   // $VF: renamed from: fF int
   int field_740;
   // $VF: renamed from: fG java.lang.String[]
   String[] field_741;
   // $VF: renamed from: fH int[]
   int[] field_742;
   // $VF: renamed from: fI int[]
   int[] field_743;
   // $VF: renamed from: fJ int[]
   int[] field_744;
   // $VF: renamed from: fK int[]
   int[] field_745;
   // $VF: renamed from: fL int
   int field_746;
   // $VF: renamed from: fM int
   int field_747;
   // $VF: renamed from: fN javax.swing.Icon
   Icon field_748;
   // $VF: renamed from: fO int
   int field_749;
   // $VF: renamed from: fP int
   int field_750;
   // $VF: renamed from: fQ int
   int field_751;
   // $VF: renamed from: fR int
   int field_752;
   // $VF: renamed from: fS int[]
   int[] field_753;
   // $VF: renamed from: fT int
   int field_754;
   // $VF: renamed from: fU int
   int field_755;
   // $VF: renamed from: fV javax.swing.Icon
   Icon field_756;
   // $VF: renamed from: fW int
   int field_757;
   // $VF: renamed from: fX int
   int field_758;
   // $VF: renamed from: fY int
   int field_759;
   // $VF: renamed from: fZ int
   int field_760;
   // $VF: renamed from: ga javax.swing.Icon
   Icon field_761;
   // $VF: renamed from: gb int
   int field_762;
   // $VF: renamed from: gc long
   long field_763;
   // $VF: renamed from: gd java.lang.String[]
   String[] field_764;
   // $VF: renamed from: ge byte
   final byte field_765 = 0;
   // $VF: renamed from: gf byte
   final byte field_766 = 1;
   // $VF: renamed from: gg ak
   class_87 field_767;
   // $VF: renamed from: gh java.lang.String
   String field_768;
   // $VF: renamed from: gi av
   class_30 field_769;
   // $VF: renamed from: gj av
   class_30 field_770;
   // $VF: renamed from: gk int
   int field_771;
   // $VF: renamed from: gl int
   int field_772;
   // $VF: renamed from: gm boolean
   boolean field_773;
   // $VF: renamed from: gn ai
   class_63 field_774;
   // $VF: renamed from: go int
   int field_775;
   // $VF: renamed from: gp int
   int field_776;
   // $VF: renamed from: gq int
   int field_777;
   // $VF: renamed from: gr int[]
   int[] field_778;
   // $VF: renamed from: gs int
   int field_779;
   // $VF: renamed from: gt int
   int field_780;
   // $VF: renamed from: gu int
   int field_781;
   // $VF: renamed from: gv int
   int field_782;
   // $VF: renamed from: gw int
   int field_783;
   // $VF: renamed from: gx int
   int field_784;
   // $VF: renamed from: gy boolean
   boolean field_785;
   // $VF: renamed from: gz javax.swing.Icon
   Icon field_786;
   // $VF: renamed from: gA java.lang.String
   String field_787;
   // $VF: renamed from: gB javax.swing.Icon
   Icon field_788;
   // $VF: renamed from: gC javax.swing.Icon
   Icon field_789;
   // $VF: renamed from: gD javax.swing.Icon
   Icon field_790;
   // $VF: renamed from: gE javax.swing.Icon[]
   Icon[] field_791;
   // $VF: renamed from: gF boolean
   boolean field_792;
   // $VF: renamed from: gG boolean
   boolean field_793;
   // $VF: renamed from: gH int
   int field_794;
   // $VF: renamed from: gI int
   int field_795;
   // $VF: renamed from: gJ javax.swing.Icon[]
   Icon[] field_796;
   // $VF: renamed from: gK int
   static int field_797;
   // $VF: renamed from: gL int
   static int field_798;
   // $VF: renamed from: gM boolean
   boolean field_799;
   // $VF: renamed from: gN boolean
   boolean field_800;
   // $VF: renamed from: gO byte
   byte field_801 = 0;
   // $VF: renamed from: ul javax.swing.Icon
   private Icon field_802;
   // $VF: renamed from: gP javax.swing.Icon
   Icon field_803;
   // $VF: renamed from: gQ javax.swing.Icon
   Icon field_804;
   // $VF: renamed from: gR javax.swing.Icon
   Icon field_805;
   // $VF: renamed from: gS int[]
   int[] field_806;
   // $VF: renamed from: gT int[]
   int[] field_807;
   // $VF: renamed from: gU javax.swing.Icon[]
   Icon[] field_808;
   // $VF: renamed from: gV int[]
   int[] field_809;
   // $VF: renamed from: gW int[]
   int[] field_810;
   // $VF: renamed from: gX javax.swing.Icon
   Icon field_811;
   // $VF: renamed from: gY int
   int field_812;
   // $VF: renamed from: gZ int
   int field_813;
   // $VF: renamed from: ha int[]
   int[] field_814;
   // $VF: renamed from: hb int[]
   int[] field_815;
   // $VF: renamed from: hc int
   int field_816;
   // $VF: renamed from: hd int
   int field_817;
   // $VF: renamed from: he int
   int field_818;
   // $VF: renamed from: hf int
   int field_819;
   // $VF: renamed from: hg javax.swing.Icon
   Icon field_820;
   // $VF: renamed from: hh int
   int field_821;
   // $VF: renamed from: hi int
   int field_822;
   // $VF: renamed from: hj int
   int field_823;
   // $VF: renamed from: hk int
   int field_824;
   // $VF: renamed from: hl int
   int field_825;
   // $VF: renamed from: hm int
   int field_826;
   // $VF: renamed from: hn javax.swing.Icon[]
   Icon[] field_827;
   // $VF: renamed from: ho int
   int field_828;
   // $VF: renamed from: hp int
   int field_829;
   // $VF: renamed from: hq int
   int field_830;
   // $VF: renamed from: hr boolean
   boolean field_831;
   // $VF: renamed from: hs java.util.Vector
   Vector field_832;
   // $VF: renamed from: ht java.util.Vector
   Vector field_833;
   // $VF: renamed from: hu javax.swing.Icon
   Icon field_834;
   // $VF: renamed from: hv javax.swing.Icon[]
   Icon[] field_835;
   // $VF: renamed from: hw int
   int field_836;
   // $VF: renamed from: hx int[]
   int[] field_837;
   // $VF: renamed from: hy int
   int field_838;
   // $VF: renamed from: hz int[]
   int[] field_839;
   // $VF: renamed from: hA int
   int field_840;
   // $VF: renamed from: hB javax.swing.Icon[]
   Icon[] field_841;
   // $VF: renamed from: hC int
   int field_842;
   // $VF: renamed from: hD int[]
   int[] field_843;
   // $VF: renamed from: hE int
   int field_844;
   // $VF: renamed from: hF int[]
   int[] field_845;
   // $VF: renamed from: hG int
   int field_846;
   // $VF: renamed from: hH javax.swing.Icon[]
   Icon[] field_847;
   // $VF: renamed from: hI int[]
   int[] field_848;
   // $VF: renamed from: hJ int
   int field_849;
   // $VF: renamed from: hK int[]
   int[] field_850;
   // $VF: renamed from: hL int
   int field_851;
   // $VF: renamed from: hM javax.swing.Icon[]
   Icon[] field_852;
   // $VF: renamed from: hN int
   int field_853;
   // $VF: renamed from: hO int[]
   int[] field_854;
   // $VF: renamed from: hP int
   int field_855;
   // $VF: renamed from: hQ int[]
   int[] field_856;
   // $VF: renamed from: hR int
   int field_857;
   // $VF: renamed from: hS int[]
   int[] field_858;
   // $VF: renamed from: hT int
   int field_859;
   // $VF: renamed from: hU int
   int field_860;
   // $VF: renamed from: hV java.util.Vector[]
   Vector[] field_861;
   // $VF: renamed from: hW java.util.Vector[]
   Vector[] field_862;
   // $VF: renamed from: hX int[]
   int[] field_863;
   // $VF: renamed from: hY int[]
   int[] field_864;
   // $VF: renamed from: hZ int
   int field_865;
   // $VF: renamed from: ia int
   int field_866;
   // $VF: renamed from: ib int
   int field_867;
   // $VF: renamed from: ic int[]
   int[] field_868;
   // $VF: renamed from: id int
   int field_869;
   // $VF: renamed from: ie int
   int field_870;
   // $VF: renamed from: if int
   final int field_871 = 0;
   // $VF: renamed from: ig int
   final int field_872 = 1;
   // $VF: renamed from: ih int
   final int field_873 = 2;
   // $VF: renamed from: ii int
   final int field_874 = 3;
   // $VF: renamed from: ij javax.swing.Icon
   Icon field_875;
   // $VF: renamed from: ik int
   int field_876;
   // $VF: renamed from: il int
   int field_877;
   // $VF: renamed from: im ak
   class_87 field_878;
   // $VF: renamed from: in int
   int field_879;
   // $VF: renamed from: io int
   int field_880;
   // $VF: renamed from: ip byte
   final byte field_881 = 0;
   // $VF: renamed from: iq byte
   final byte field_882 = 1;
   // $VF: renamed from: ir byte
   final byte field_883 = 2;
   // $VF: renamed from: is int
   int field_884;
   // $VF: renamed from: it int
   int field_885;
   // $VF: renamed from: iu ak
   class_87 field_886;
   // $VF: renamed from: iv javax.swing.Icon
   Icon field_887;
   // $VF: renamed from: iw int
   int field_888;
   // $VF: renamed from: ix int
   int field_889;
   // $VF: renamed from: iy int
   int field_890;
   // $VF: renamed from: iz int
   int field_891;
   // $VF: renamed from: iA javax.swing.Icon
   Icon field_892;
   // $VF: renamed from: iB int
   int field_893;
   // $VF: renamed from: iC int
   int field_894;
   // $VF: renamed from: iD long
   long field_895;
   // $VF: renamed from: iE boolean
   boolean field_896;
   // $VF: renamed from: iF boolean
   boolean field_897;
   // $VF: renamed from: iG int
   int field_898;
   // $VF: renamed from: iH int
   int field_899;
   // $VF: renamed from: iI javax.swing.Icon
   Icon field_900;
   // $VF: renamed from: iJ int
   int field_901;
   // $VF: renamed from: iK int
   int field_902;
   // $VF: renamed from: iL int
   int field_903;
   // $VF: renamed from: iM int[]
   int[] field_904;
   // $VF: renamed from: iN int
   int field_905;
   // $VF: renamed from: iO int
   int field_906;
   // $VF: renamed from: iP javax.swing.Icon
   Icon field_907;
   // $VF: renamed from: iQ int
   int field_908;
   // $VF: renamed from: iR int
   int field_909;
   // $VF: renamed from: iS int
   int field_910;
   // $VF: renamed from: iT int
   int field_911;
   // $VF: renamed from: iU javax.swing.Icon
   Icon field_912;
   // $VF: renamed from: iV int
   int field_913;
   // $VF: renamed from: iW int
   int field_914;
   // $VF: renamed from: iX boolean
   boolean field_915;
   // $VF: renamed from: iY int
   int field_916;
   // $VF: renamed from: iZ int
   int field_917;
   // $VF: renamed from: ja int
   int field_918;
   // $VF: renamed from: jb int
   int field_919;
   // $VF: renamed from: jc int
   int field_920;
   // $VF: renamed from: jd int
   int field_921;
   // $VF: renamed from: je long
   long field_922;
   // $VF: renamed from: jf int
   final int field_923 = 300;
   // $VF: renamed from: jg javax.swing.Icon[]
   Icon[] field_924;
   // $VF: renamed from: jh int
   int field_925;
   // $VF: renamed from: ji int
   int field_926;
   // $VF: renamed from: jj int
   int field_927;
   // $VF: renamed from: jk javax.swing.JTextField
   JTextField field_928;
   // $VF: renamed from: jl long
   long field_929;
   // $VF: renamed from: jm long
   long field_930;
   // $VF: renamed from: jn long
   long field_931;
   // $VF: renamed from: jo java.lang.String
   String field_932;
   // $VF: renamed from: jp javax.swing.JScrollPane
   JScrollPane field_933;
   // $VF: renamed from: jq javax.swing.JScrollBar
   JScrollBar field_934;
   // $VF: renamed from: jr javax.swing.JTextPane
   JTextPane field_935;
   // $VF: renamed from: js javax.swing.text.Document
   Document field_936;
   // $VF: renamed from: jt javax.swing.Icon
   Icon field_937;
   // $VF: renamed from: ju javax.swing.Icon
   Icon field_938;
   // $VF: renamed from: jv int
   int field_939;
   // $VF: renamed from: jw int
   int field_940;
   // $VF: renamed from: jx javax.swing.Icon[]
   Icon[] field_941;
   // $VF: renamed from: jy int
   int field_942;
   // $VF: renamed from: jz int[]
   int[] field_943;
   // $VF: renamed from: jA int
   int field_944;
   // $VF: renamed from: jB int
   int field_945;
   // $VF: renamed from: jC int
   int field_946;
   // $VF: renamed from: jD javax.swing.Icon
   Icon field_947;
   // $VF: renamed from: jE int
   int field_948;
   // $VF: renamed from: jF int
   int field_949;
   // $VF: renamed from: jG int
   int field_950;
   // $VF: renamed from: jH int[]
   int[] field_951;
   // $VF: renamed from: jI int
   int field_952;
   // $VF: renamed from: jJ javax.swing.Icon
   Icon field_953;
   // $VF: renamed from: jK javax.swing.Icon
   Icon field_954;
   // $VF: renamed from: jL int
   int field_955;
   // $VF: renamed from: jM int
   int field_956;
   // $VF: renamed from: jN javax.swing.Icon[]
   Icon[] field_957;
   // $VF: renamed from: jO java.lang.String[]
   String[] field_958;
   // $VF: renamed from: jP java.lang.String[]
   String[] field_959;
   // $VF: renamed from: jQ int
   int field_960;
   // $VF: renamed from: jR int
   int field_961;
   // $VF: renamed from: jS int
   int field_962;
   // $VF: renamed from: jT int[]
   int[] field_963;
   // $VF: renamed from: jU javax.swing.Icon
   Icon field_964;
   // $VF: renamed from: jV int
   int field_965;
   // $VF: renamed from: jW int
   int field_966;
   // $VF: renamed from: jX int
   int field_967;
   // $VF: renamed from: jY int[]
   int[] field_968;
   // $VF: renamed from: jZ int
   int field_969;
   // $VF: renamed from: ka int
   int field_970;
   // $VF: renamed from: kb java.lang.String
   String field_971;
   // $VF: renamed from: kc java.lang.String[]
   String[] field_972;
   // $VF: renamed from: kd javax.swing.Icon[]
   Icon[] field_973;
   // $VF: renamed from: ke int
   int field_974;
   // $VF: renamed from: kf int
   int field_975;
   // $VF: renamed from: kg javax.swing.Icon
   Icon field_976;
   // $VF: renamed from: kh int
   int field_977;
   // $VF: renamed from: ki int
   int field_978;
   // $VF: renamed from: kj int
   int field_979;
   // $VF: renamed from: kk int
   int field_980;
   // $VF: renamed from: kl int[]
   int[] field_981;
   // $VF: renamed from: km int
   int field_982;
   // $VF: renamed from: kn int
   int field_983;
   // $VF: renamed from: ko java.util.Vector
   Vector field_984;
   // $VF: renamed from: kp int[]
   int[] field_985;
   // $VF: renamed from: kq int[]
   int[] field_986;
   // $VF: renamed from: kr int
   int field_987;
   // $VF: renamed from: ks int
   int field_988;
   // $VF: renamed from: kt int
   int field_989;
   // $VF: renamed from: ku int[]
   int[] field_990;
   // $VF: renamed from: kv int
   int field_991;
   // $VF: renamed from: kw int
   int field_992;
   // $VF: renamed from: kx int
   final int field_993 = 0;
   // $VF: renamed from: ky int
   final int field_994 = 1;
   // $VF: renamed from: kz int
   final int field_995 = 2;
   // $VF: renamed from: kA int
   final int field_996 = 3;
   // $VF: renamed from: kB javax.swing.Icon
   Icon field_997;
   // $VF: renamed from: kC int
   int field_998;
   // $VF: renamed from: kD int
   int field_999;
   // $VF: renamed from: kE ak
   class_87 field_1000;
   // $VF: renamed from: kF int
   int field_1001;
   // $VF: renamed from: kG int
   int field_1002;
   // $VF: renamed from: kH byte
   final byte field_1003 = 0;
   // $VF: renamed from: kI byte
   final byte field_1004 = 1;
   // $VF: renamed from: kJ byte
   final byte field_1005 = 2;
   // $VF: renamed from: kK int
   int field_1006;
   // $VF: renamed from: kL int
   int field_1007;
   // $VF: renamed from: kM ak
   class_87 field_1008;
   // $VF: renamed from: kN javax.swing.Icon
   Icon field_1009;
   // $VF: renamed from: kO int
   int field_1010;
   // $VF: renamed from: kP int
   int field_1011;
   // $VF: renamed from: kQ boolean
   boolean field_1012;
   // $VF: renamed from: kR javax.swing.Icon
   Icon field_1013;
   // $VF: renamed from: kS int
   int field_1014;
   // $VF: renamed from: kT int
   int field_1015;
   // $VF: renamed from: kU javax.swing.Icon
   Icon field_1016;
   // $VF: renamed from: kV int
   int field_1017;
   // $VF: renamed from: kW int
   int field_1018;
   // $VF: renamed from: kX int
   int field_1019;
   // $VF: renamed from: kY int[]
   int[] field_1020;
   // $VF: renamed from: kZ int
   int field_1021;
   // $VF: renamed from: la int
   int field_1022;
   // $VF: renamed from: lb javax.swing.Icon
   Icon field_1023;
   // $VF: renamed from: lc int
   int field_1024;
   // $VF: renamed from: ld int
   int field_1025;
   // $VF: renamed from: le int
   int field_1026;
   // $VF: renamed from: lf int
   int field_1027;
   // $VF: renamed from: lg javax.swing.Icon
   Icon field_1028;
   // $VF: renamed from: lh int
   int field_1029;
   // $VF: renamed from: li int
   int field_1030;
   // $VF: renamed from: lj boolean
   boolean field_1031;
   // $VF: renamed from: lk int
   int field_1032;
   // $VF: renamed from: ll int
   int field_1033;
   // $VF: renamed from: lm long
   long field_1034;
   // $VF: renamed from: ln int
   final int field_1035 = 300;
   // $VF: renamed from: lo javax.swing.Icon[]
   Icon[] field_1036;
   // $VF: renamed from: lp int
   int field_1037;
   // $VF: renamed from: lq int
   int field_1038;
   // $VF: renamed from: lr int
   int field_1039;
   // $VF: renamed from: ls boolean
   boolean field_1040;
   // $VF: renamed from: lt aX
   class_79 field_1041;
   // $VF: renamed from: lu O
   class_78 field_1042;
   // $VF: renamed from: lv t
   class_77 field_1043;
   // $VF: renamed from: lw javax.swing.Icon
   Icon field_1044;
   // $VF: renamed from: lx javax.swing.Icon[]
   Icon[] field_1045;
   // $VF: renamed from: ly int
   int field_1046;
   // $VF: renamed from: lz int
   int field_1047;
   // $VF: renamed from: lA int
   int field_1048;
   // $VF: renamed from: lB int
   int field_1049;
   // $VF: renamed from: lC int
   int field_1050;
   // $VF: renamed from: lD int
   int field_1051;
   // $VF: renamed from: lE int
   int field_1052;
   // $VF: renamed from: lF aj
   class_76 field_1053;
   // $VF: renamed from: lG x
   class_80 field_1054;
   // $VF: renamed from: lH c
   class_81 field_1055;
   // $VF: renamed from: lI javax.swing.Icon
   Icon field_1056;
   // $VF: renamed from: lJ aJ
   class_75 field_1057;
   // $VF: renamed from: lK javax.swing.Icon[][]
   Icon[][] field_1058;
   // $VF: renamed from: lL javax.swing.Icon[][]
   Icon[][] field_1059;
   // $VF: renamed from: lM int[]
   int[] field_1060;
   // $VF: renamed from: lN int[]
   int[] field_1061;
   // $VF: renamed from: lO int[]
   int[] field_1062;
   // $VF: renamed from: lP int[]
   int[] field_1063;
   // $VF: renamed from: lQ int
   int field_1064;
   // $VF: renamed from: lR int
   int field_1065;
   // $VF: renamed from: lS java.lang.String[]
   String[] field_1066 = new String[]{"  Human", " Taikuus", "    Firan", "Brucian"};
   // $VF: renamed from: lT java.lang.String[]
   String[] field_1067 = new String[]{
      "          Character creation successful!",
      "This character name has already been used!",
      "You cannot create more than 5 characters!",
      "No spacing is allowed in character name!"
   };
   // $VF: renamed from: lU int
   int field_1068;
   // $VF: renamed from: lV java.lang.String
   String field_1069 = "";
   // $VF: renamed from: lW int
   int field_1070;
   // $VF: renamed from: lX int
   int field_1071;
   // $VF: renamed from: lY int
   int field_1072;
   // $VF: renamed from: lZ javax.swing.Icon
   Icon field_1073;
   // $VF: renamed from: ma javax.swing.Icon
   Icon field_1074;
   // $VF: renamed from: mb javax.swing.Icon
   Icon field_1075;
   // $VF: renamed from: mc javax.swing.Icon
   Icon field_1076;
   // $VF: renamed from: md javax.swing.Icon[]
   Icon[] field_1077;
   // $VF: renamed from: me int
   int field_1078;
   // $VF: renamed from: mf int
   int field_1079;
   // $VF: renamed from: mg int
   int field_1080;
   // $VF: renamed from: mh int
   int field_1081;
   // $VF: renamed from: mi int
   int field_1082;
   // $VF: renamed from: mj int
   int field_1083;
   // $VF: renamed from: mk int
   int field_1084;
   // $VF: renamed from: ml int
   int field_1085;
   // $VF: renamed from: mm int
   int field_1086;
   // $VF: renamed from: mn int
   int field_1087;
   // $VF: renamed from: mo int
   int field_1088;
   // $VF: renamed from: mp int
   int field_1089;
   // $VF: renamed from: mq int
   int field_1090;
   // $VF: renamed from: mr int
   int field_1091;
   // $VF: renamed from: ms int[]
   int[] field_1092;
   // $VF: renamed from: mt int[]
   int[] field_1093;
   // $VF: renamed from: mu int
   int field_1094;
   // $VF: renamed from: mv int
   int field_1095;
   // $VF: renamed from: mw int
   int field_1096;
   // $VF: renamed from: mx int[]
   int[] field_1097;
   // $VF: renamed from: my int
   int field_1098;
   // $VF: renamed from: mz int
   int field_1099;
   // $VF: renamed from: mA int
   int field_1100;
   // $VF: renamed from: mB javax.swing.JTextField
   JTextField field_1101;
   // $VF: renamed from: mC boolean
   boolean field_1102;
   // $VF: renamed from: mD boolean
   boolean field_1103;
   // $VF: renamed from: mE boolean
   boolean field_1104;
   // $VF: renamed from: mF S
   class_85 field_1105;
   // $VF: renamed from: mG javax.swing.Icon[]
   Icon[] field_1106;
   // $VF: renamed from: mH int
   int field_1107;
   // $VF: renamed from: mI int
   int field_1108;
   // $VF: renamed from: mJ int
   int field_1109;
   // $VF: renamed from: mK javax.swing.Icon
   Icon field_1110;
   // $VF: renamed from: mL javax.swing.Icon
   Icon field_1111;
   // $VF: renamed from: mM javax.swing.Icon
   Icon field_1112;
   // $VF: renamed from: mN javax.swing.Icon
   Icon field_1113;
   // $VF: renamed from: mO javax.swing.Icon
   Icon field_1114;
   // $VF: renamed from: mP java.lang.String[]
   static String[] field_1115 = new String[]{
      "                 Registration Successful!",
      "This email address has been registered already!",
      "        This userID has been registered already!",
      "UserID and email address have been used already!",
      "         Please fill in all the fields required!",
      "  Please restrict your user ID to 10 characters!",
      " Please restrict your password to 10 characters!",
      "                Different set of passwords!"
   };
   // $VF: renamed from: mQ int
   int field_1116;
   // $VF: renamed from: mR javax.swing.JTextField
   JTextField field_1117;
   // $VF: renamed from: mS javax.swing.JTextField
   JTextField field_1118;
   // $VF: renamed from: mT javax.swing.JTextField
   JTextField field_1119;
   // $VF: renamed from: mU javax.swing.JTextField
   JTextField field_1120;
   // $VF: renamed from: mV javax.swing.JPasswordField
   JPasswordField field_1121;
   // $VF: renamed from: mW javax.swing.JPasswordField
   JPasswordField field_1122;
   // $VF: renamed from: mX int
   int field_1123;
   // $VF: renamed from: mY int
   int field_1124;
   // $VF: renamed from: mZ int
   int field_1125;
   // $VF: renamed from: na int
   int field_1126;
   // $VF: renamed from: nb int
   int field_1127;
   // $VF: renamed from: nc int
   int field_1128;
   // $VF: renamed from: nd int
   int field_1129;
   // $VF: renamed from: ne int
   int field_1130;
   // $VF: renamed from: nf int
   int field_1131;
   // $VF: renamed from: ng int
   int field_1132;
   // $VF: renamed from: nh int
   int field_1133;
   // $VF: renamed from: ni int
   int field_1134;
   // $VF: renamed from: nj int
   int field_1135;
   // $VF: renamed from: nk int
   int field_1136;
   // $VF: renamed from: nl int
   int field_1137;
   // $VF: renamed from: nm int
   int field_1138;
   // $VF: renamed from: nn int
   int field_1139;
   // $VF: renamed from: no int
   int field_1140;
   // $VF: renamed from: np int
   int field_1141;
   // $VF: renamed from: nq int
   int field_1142;
   // $VF: renamed from: nr int
   int field_1143;
   // $VF: renamed from: ns int
   int field_1144;
   // $VF: renamed from: nt int
   int field_1145;
   // $VF: renamed from: nu int
   int field_1146;
   // $VF: renamed from: nv int
   int field_1147;
   // $VF: renamed from: nw int
   int field_1148;
   // $VF: renamed from: nx int
   int field_1149;
   // $VF: renamed from: ny boolean
   boolean field_1150;
   // $VF: renamed from: nz boolean
   boolean field_1151;
   // $VF: renamed from: nA boolean
   boolean field_1152;
   // $VF: renamed from: nB boolean
   boolean field_1153;
   // $VF: renamed from: nC javax.swing.Icon[]
   Icon[] field_1154;
   // $VF: renamed from: nD int
   int field_1155;
   // $VF: renamed from: nE int
   int field_1156;
   // $VF: renamed from: nF int
   int field_1157;
   // $VF: renamed from: nG javax.swing.Icon
   Icon field_1158;
   // $VF: renamed from: nH int[]
   int[] field_1159;
   // $VF: renamed from: nI int[]
   int[] field_1160;
   // $VF: renamed from: nJ int
   int field_1161;
   // $VF: renamed from: nK int
   int field_1162;
   // $VF: renamed from: nL javax.swing.JLabel[]
   JLabel[] field_1163;
   // $VF: renamed from: nM int
   final int field_1164 = 0;
   // $VF: renamed from: nN int
   final int field_1165 = 1;
   // $VF: renamed from: nO int
   final int field_1166 = 2;
   // $VF: renamed from: nP int
   final int field_1167 = 3;
   // $VF: renamed from: nQ int
   final int field_1168 = 4;
   // $VF: renamed from: nR int
   final int field_1169 = 0;
   // $VF: renamed from: nS int
   final int field_1170 = 1;
   // $VF: renamed from: nT int
   final int field_1171 = 0;
   // $VF: renamed from: nU int
   final int field_1172 = 1;
   // $VF: renamed from: nV int
   final int field_1173 = 0;
   // $VF: renamed from: nW int
   final int field_1174 = 1;
   // $VF: renamed from: nX int
   final int field_1175 = 0;
   // $VF: renamed from: nY int
   final int field_1176 = 1;
   // $VF: renamed from: nZ javax.swing.Icon
   Icon field_1177;
   // $VF: renamed from: oa javax.swing.Icon[][]
   Icon[][] field_1178;
   // $VF: renamed from: ob int[]
   int[] field_1179;
   // $VF: renamed from: oc int[]
   int[] field_1180;
   // $VF: renamed from: od int[]
   int[] field_1181;
   // $VF: renamed from: oe javax.swing.Icon[][]
   Icon[][] field_1182;
   // $VF: renamed from: of int[]
   int[] field_1183;
   // $VF: renamed from: og int[]
   int[] field_1184;
   // $VF: renamed from: oh int[]
   int[] field_1185;
   // $VF: renamed from: oi int[]
   int[] field_1186;
   // $VF: renamed from: oj int[]
   int[] field_1187;
   // $VF: renamed from: ok int
   int field_1188;
   // $VF: renamed from: ol int
   int field_1189;
   // $VF: renamed from: om int
   int field_1190;
   // $VF: renamed from: on javax.swing.Icon
   Icon field_1191;
   // $VF: renamed from: oo javax.swing.JLabel
   JLabel field_1192;
   // $VF: renamed from: op java.lang.String
   String field_1193;
   // $VF: renamed from: oq int
   int field_1194;
   // $VF: renamed from: or long
   long field_1195;
   // $VF: renamed from: os long
   long field_1196;
   // $VF: renamed from: ot javax.swing.Icon[]
   Icon[] field_1197;
   // $VF: renamed from: ou int
   int field_1198;
   // $VF: renamed from: ov int
   int field_1199;
   // $VF: renamed from: ow int
   int field_1200;
   // $VF: renamed from: ox int
   int field_1201;
   // $VF: renamed from: oy int
   int field_1202;
   // $VF: renamed from: oz int
   int field_1203;
   // $VF: renamed from: oA int
   int field_1204;
   // $VF: renamed from: oB int
   int field_1205;
   // $VF: renamed from: oC int
   int field_1206;
   // $VF: renamed from: oD boolean
   boolean field_1207;
   // $VF: renamed from: oE boolean
   boolean field_1208;
   // $VF: renamed from: oF javax.swing.Icon
   Icon field_1209;
   // $VF: renamed from: oG int
   int field_1210;
   // $VF: renamed from: oH int
   int field_1211;
   // $VF: renamed from: oI int
   static int field_1212;
   // $VF: renamed from: oJ java.lang.String
   static String field_1213;
   // $VF: renamed from: oK int
   static int field_1214;
   // $VF: renamed from: oL int
   static int field_1215;
   // $VF: renamed from: oM int
   static int field_1216;
   // $VF: renamed from: oN int
   int field_1217 = 0;
   // $VF: renamed from: oO int
   int field_1218;
   // $VF: renamed from: oP int
   int field_1219;
   // $VF: renamed from: oQ int
   int field_1220;
   // $VF: renamed from: oR int
   int field_1221;
   // $VF: renamed from: oS javax.swing.Icon
   Icon field_1222;
   // $VF: renamed from: oT javax.swing.Icon[]
   Icon[] field_1223;
   // $VF: renamed from: oU int[]
   int[] field_1224;
   // $VF: renamed from: oV int[]
   int[] field_1225;
   // $VF: renamed from: oW int
   int field_1226;
   // $VF: renamed from: oX int
   int field_1227;
   // $VF: renamed from: oY int
   int field_1228;
   // $VF: renamed from: oZ int
   final int field_1229 = 0;
   // $VF: renamed from: pa int
   final int field_1230 = 1;
   // $VF: renamed from: pb java.net.Socket
   Socket field_1231;
   // $VF: renamed from: pc Y
   class_96 field_1232;
   // $VF: renamed from: pd java.io.BufferedReader
   BufferedReader field_1233 = null;
   // $VF: renamed from: pe java.io.PrintWriter
   PrintWriter field_1234 = null;
   // $VF: renamed from: pf javax.swing.JTextField
   JTextField field_1235;
   // $VF: renamed from: pg java.lang.String
   String field_1236;
   // $VF: renamed from: ph javax.swing.Icon
   Icon field_1237;
   // $VF: renamed from: pi int
   int field_1238;
   // $VF: renamed from: pj int
   final int field_1239 = 3;
   // $VF: renamed from: pk boolean
   boolean field_1240 = false;
   // $VF: renamed from: pl long
   long field_1241;
   // $VF: renamed from: pm long
   long field_1242;
   // $VF: renamed from: pn javax.swing.Icon
   Icon field_1243;
   // $VF: renamed from: po javax.swing.Icon
   Icon field_1244;
   // $VF: renamed from: pp javax.swing.JTextField
   JTextField field_1245;
   // $VF: renamed from: pq javax.swing.JPasswordField
   JPasswordField field_1246;
   // $VF: renamed from: pr int
   int field_1247;
   // $VF: renamed from: ps int
   int field_1248;
   // $VF: renamed from: pt int
   int field_1249;
   // $VF: renamed from: pu int
   int field_1250;
   // $VF: renamed from: pv int
   int field_1251;
   // $VF: renamed from: pw int
   int field_1252;
   // $VF: renamed from: px int
   int field_1253;
   // $VF: renamed from: py int
   int field_1254;
   // $VF: renamed from: pz javax.swing.Icon[]
   Icon[] field_1255;
   // $VF: renamed from: pA int
   int field_1256;
   // $VF: renamed from: pB int
   int field_1257;
   // $VF: renamed from: pC int
   int field_1258;
   // $VF: renamed from: pD boolean
   boolean field_1259;
   // $VF: renamed from: pE javax.swing.Icon
   Icon field_1260;
   // $VF: renamed from: pF javax.swing.Icon[]
   Icon[] field_1261;
   // $VF: renamed from: pG int[]
   int[] field_1262;
   // $VF: renamed from: pH int[]
   int[] field_1263;
   // $VF: renamed from: pI int
   int field_1264;
   // $VF: renamed from: pJ int
   int field_1265;
   // $VF: renamed from: pK int
   int field_1266;
   // $VF: renamed from: pL int
   final int field_1267 = 0;
   // $VF: renamed from: pM int
   final int field_1268 = 1;
   // $VF: renamed from: pN long
   long field_1269;
   // $VF: renamed from: pO javax.swing.Icon
   Icon field_1270;
   // $VF: renamed from: pP z
   public class_72 field_1271;
   // $VF: renamed from: pQ aA
   public class_9 field_1272;
   // $VF: renamed from: pR Q
   public class_10 field_1273;
   // $VF: renamed from: pS MastersOfDestiny
   public static MastersOfDestiny field_1274 = null;
   // $VF: renamed from: pT U
   public class_28 field_1275;
   // $VF: renamed from: um K
   private class_5 field_1276;
   // $VF: renamed from: un G
   private class_18 field_1277;
   // $VF: renamed from: uo ah
   private class_20 field_1278;
   // $VF: renamed from: up T
   private class_67 field_1279;
   // $VF: renamed from: uq X
   private static class_2 field_1280;
   // $VF: renamed from: ur aa
   private class_57 field_1281;
   // $VF: renamed from: pU java.lang.Thread
   Thread field_1282;
   // $VF: renamed from: pV boolean
   boolean field_1283 = true;
   // $VF: renamed from: pW aE
   class_33 field_1284;
   // $VF: renamed from: pX j
   class_60 field_1285 = null;
   // $VF: renamed from: pY java.lang.String[]
   String[] field_1286;
   // $VF: renamed from: pZ boolean
   boolean field_1287 = false;
   // $VF: renamed from: qa java.applet.AudioClip
   AudioClip field_1288;
   // $VF: renamed from: qb java.applet.AudioClip
   AudioClip field_1289;
   // $VF: renamed from: qc java.applet.AudioClip
   AudioClip field_1290;
   // $VF: renamed from: qd byte
   byte field_1291;
   // $VF: renamed from: qe byte
   final byte field_1292 = 0;
   // $VF: renamed from: qf byte
   final byte field_1293 = 1;
   // $VF: renamed from: qg byte
   final byte field_1294 = 2;
   // $VF: renamed from: qh byte
   final byte field_1295 = 3;
   // $VF: renamed from: qi aw
   class_3 field_1296;
   // $VF: renamed from: qj boolean
   boolean field_1297 = false;
   // $VF: renamed from: qk byte
   byte field_1298;
   // $VF: renamed from: ql boolean
   boolean field_1299;
   // $VF: renamed from: qm byte
   byte field_1300 = 0;
   // $VF: renamed from: qn byte
   byte field_1301 = 0;
   // $VF: renamed from: qo boolean
   boolean field_1302 = false;
   // $VF: renamed from: qp java.lang.String
   final String field_1303 = this.method_478("res/patch/buildVer.txt") + "." + this.method_478("res/patch/idList.txt");
   // $VF: renamed from: qq java.lang.String
   final String field_1304 = "gameThread";
   // $VF: renamed from: qr java.lang.String
   static final String field_1305 = "CS";
   // $VF: renamed from: qs java.lang.String
   static final String field_1306 = "VC";
   // $VF: renamed from: qt java.lang.String
   static final String field_1307 = "WV";
   // $VF: renamed from: qu java.lang.String
   static final String field_1308 = "CP";
   // $VF: renamed from: qv java.lang.String
   static final String field_1309 = "WP";
   // $VF: renamed from: qw java.lang.String
   static final String field_1310 = "CV";
   // $VF: renamed from: qx java.lang.String
   static final String field_1311 = "LI";
   // $VF: renamed from: qy long
   long field_1312 = 2000L;
   // $VF: renamed from: qz byte
   byte field_1313;
   // $VF: renamed from: qA java.lang.String
   static final String field_1314 = "RC";
   // $VF: renamed from: qB java.lang.String
   static final String field_1315 = "CR";
   // $VF: renamed from: qC java.lang.String
   static final String field_1316 = "TF";
   // $VF: renamed from: qD java.lang.String
   static final String field_1317 = "SI";
   // $VF: renamed from: qE java.lang.String
   static final String field_1318 = "CN";
   // $VF: renamed from: qF java.lang.String
   static final String field_1319 = "IS";
   // $VF: renamed from: qG java.lang.String
   static final String field_1320 = "R1";
   // $VF: renamed from: qH java.lang.String
   static final String field_1321 = "R2";
   // $VF: renamed from: qI java.lang.String
   static final String field_1322 = "R3";
   // $VF: renamed from: qJ java.lang.String
   static final String field_1323 = "R4";
   // $VF: renamed from: qK java.lang.String
   static final String field_1324 = "R5";
   // $VF: renamed from: qL java.lang.String
   static final String field_1325 = "R6";
   // $VF: renamed from: qM java.lang.String
   static final String field_1326 = "P1";
   // $VF: renamed from: qN java.lang.String
   static final String field_1327 = "P2";
   // $VF: renamed from: qO java.lang.String
   static final String field_1328 = "P3";
   // $VF: renamed from: qP java.lang.String
   static final String field_1329 = "P4";
   // $VF: renamed from: qQ java.lang.String
   static final String field_1330 = "P5";
   // $VF: renamed from: qR java.lang.String
   static final String field_1331 = "P6";
   // $VF: renamed from: qS java.lang.String
   static final String field_1332 = "RD";
   // $VF: renamed from: qT java.lang.String
   static final String field_1333 = "BA";
   // $VF: renamed from: qU java.lang.String[]
   String[] field_1334 = new String[5];
   // $VF: renamed from: qV java.lang.String[]
   String[] field_1335 = new String[5];
   // $VF: renamed from: qW int[]
   int[] field_1336 = new int[5];
   // $VF: renamed from: qX java.lang.String[]
   String[] field_1337 = new String[5];
   // $VF: renamed from: qY int[]
   int[] field_1338 = new int[5];
   // $VF: renamed from: qZ int[]
   int[] field_1339 = new int[5];
   // $VF: renamed from: ra int
   int field_1340 = 0;
   // $VF: renamed from: rb boolean
   boolean field_1341 = false;
   // $VF: renamed from: rc boolean
   boolean field_1342;
   // $VF: renamed from: rd java.lang.String
   static final String field_1343 = "|";
   // $VF: renamed from: re java.lang.String
   static final String field_1344 = "\n";
   // $VF: renamed from: rf java.lang.String
   static final String field_1345 = "CI";
   // $VF: renamed from: rg java.lang.String
   static final String field_1346 = "ST";
   // $VF: renamed from: rh java.lang.String
   static final String field_1347 = "AP";
   // $VF: renamed from: ri java.lang.String
   static final String field_1348 = "IS";
   // $VF: renamed from: rj java.lang.String
   static final String field_1349 = "I1";
   // $VF: renamed from: rk java.lang.String
   static final String field_1350 = "I2";
   // $VF: renamed from: rl java.lang.String
   static final String field_1351 = "I3";
   // $VF: renamed from: rm java.lang.String
   static final String field_1352 = "I4";
   // $VF: renamed from: rn java.lang.String
   static final String field_1353 = "I5";
   // $VF: renamed from: ro java.lang.String
   static final String field_1354 = "I6";
   // $VF: renamed from: rp java.lang.String
   static final String field_1355 = "LU";
   // $VF: renamed from: rq java.lang.String
   static final String field_1356 = "KA";
   // $VF: renamed from: rr java.lang.String
   static final String field_1357 = "AF";
   // $VF: renamed from: rs java.lang.String
   static final String field_1358 = "CT";
   // $VF: renamed from: rt java.lang.String
   static final String field_1359 = "EM";
   // $VF: renamed from: ru java.lang.String
   static final String field_1360 = "WS";
   // $VF: renamed from: rv java.lang.String
   static final String field_1361 = "WK";
   // $VF: renamed from: rw java.lang.String
   static final String field_1362 = "LV";
   // $VF: renamed from: rx java.lang.String
   static final String field_1363 = "KO";
   // $VF: renamed from: ry java.lang.String
   static final String field_1364 = "P1|H\n";
   // $VF: renamed from: rz java.lang.String
   static final String field_1365 = "P1|D\n";
   // $VF: renamed from: rA java.lang.String
   static final String field_1366 = "P2";
   // $VF: renamed from: rB java.lang.String
   static final String field_1367 = "P3";
   // $VF: renamed from: rC java.lang.String
   static final String field_1368 = "P4";
   // $VF: renamed from: rD java.lang.String
   static final String field_1369 = "P5";
   // $VF: renamed from: rE java.lang.String
   static final String field_1370 = "P6";
   // $VF: renamed from: rF java.lang.String
   static final String field_1371 = "P7";
   // $VF: renamed from: rG java.lang.String
   static final String field_1372 = "P8";
   // $VF: renamed from: rH java.lang.String
   static final String field_1373 = "S1";
   // $VF: renamed from: rI java.lang.String
   static final String field_1374 = "SN";
   // $VF: renamed from: rJ java.lang.String
   static final String field_1375 = "SY";
   // $VF: renamed from: rK java.lang.String
   static final String field_1376 = "S2";
   // $VF: renamed from: rL java.lang.String
   static final String field_1377 = "S19";
   // $VF: renamed from: rM java.lang.String
   static final String field_1378 = "S3";
   // $VF: renamed from: rN java.lang.String
   static final String field_1379 = "S5";
   // $VF: renamed from: rO java.lang.String
   static final String field_1380 = "S9";
   // $VF: renamed from: rP java.lang.String
   static final String field_1381 = "S10";
   // $VF: renamed from: rQ java.lang.String
   static final String field_1382 = "S6";
   // $VF: renamed from: rR java.lang.String
   static final String field_1383 = "S20";
   // $VF: renamed from: rS java.lang.String
   static final String field_1384 = "S21";
   // $VF: renamed from: rT java.lang.String
   static final String field_1385 = "S11";
   // $VF: renamed from: rU java.lang.String
   static final String field_1386 = "S12";
   // $VF: renamed from: rV java.lang.String
   static final String field_1387 = "S14";
   // $VF: renamed from: rW java.lang.String
   static final String field_1388 = "S13";
   // $VF: renamed from: rX java.lang.String
   static final String field_1389 = "S15";
   // $VF: renamed from: rY java.lang.String
   static final String field_1390 = "S16";
   // $VF: renamed from: rZ java.lang.String
   static final String field_1391 = "S7";
   // $VF: renamed from: sa java.lang.String
   static final String field_1392 = "S17";
   // $VF: renamed from: sb java.lang.String
   static final String field_1393 = "S8";
   // $VF: renamed from: sc java.lang.String
   static final String field_1394 = "S4";
   // $VF: renamed from: sd java.lang.String
   static final String field_1395 = "BS";
   // $VF: renamed from: se java.lang.String
   static final String field_1396 = "BR";
   // $VF: renamed from: sf java.lang.String
   static final String field_1397 = "BO";
   // $VF: renamed from: sg java.lang.String
   static final String field_1398 = "BA";
   // $VF: renamed from: sh java.lang.String
   static final String field_1399 = "BD";
   // $VF: renamed from: si java.lang.String
   static final String field_1400 = "C1";
   // $VF: renamed from: sj java.lang.String
   static final String field_1401 = "C2";
   // $VF: renamed from: sk java.lang.String
   static final String field_1402 = "C3";
   // $VF: renamed from: sl java.lang.String
   static final String field_1403 = "C4";
   // $VF: renamed from: sm java.lang.String
   static final String field_1404 = "";
   // $VF: renamed from: sn java.lang.String
   static final String field_1405 = "H1";
   // $VF: renamed from: so java.lang.String
   static final String field_1406 = "H2";
   // $VF: renamed from: sp java.lang.String
   static final String field_1407 = "H3";
   // $VF: renamed from: sq java.lang.String
   static final String field_1408 = "H4";
   // $VF: renamed from: sr java.lang.String
   static final String field_1409 = "H5";
   // $VF: renamed from: ss java.lang.String
   static final String field_1410 = "H6";
   // $VF: renamed from: st java.lang.String
   static final String field_1411 = "H7";
   // $VF: renamed from: su java.lang.String
   static final String field_1412 = "H8";
   // $VF: renamed from: sv java.lang.String
   static final String field_1413 = "H9";
   // $VF: renamed from: sw java.lang.String
   static final String field_1414 = "H10";
   // $VF: renamed from: sx java.lang.String
   static final String field_1415 = "H11";
   // $VF: renamed from: sy java.lang.String
   static final String field_1416 = "H12";
   // $VF: renamed from: sz java.lang.String
   static final String field_1417 = "H16";
   // $VF: renamed from: sA java.lang.String
   static final String field_1418 = "H17";
   // $VF: renamed from: sB java.lang.String
   static final String field_1419 = "H18";
   // $VF: renamed from: sC java.lang.String
   static final String field_1420 = "H19";
   // $VF: renamed from: sD java.lang.String
   static final String field_1421 = "H20";
   // $VF: renamed from: sE java.lang.String
   static final String field_1422 = "H21";
   // $VF: renamed from: sF java.lang.String
   static final String field_1423 = "H22";
   // $VF: renamed from: sG java.lang.String
   static final String field_1424 = "H23";
   // $VF: renamed from: sH java.lang.String
   static final String field_1425 = "H24";
   // $VF: renamed from: sI java.lang.String
   static final String field_1426 = "H13";
   // $VF: renamed from: sJ java.lang.String
   static final String field_1427 = "H14";
   // $VF: renamed from: sK java.lang.String
   static final String field_1428 = "H15";
   // $VF: renamed from: sL java.lang.String
   static final String field_1429 = "H25";
   // $VF: renamed from: sM java.lang.String
   static final String field_1430 = "H26";
   // $VF: renamed from: sN java.lang.String
   static final String field_1431 = "H27";
   // $VF: renamed from: sO java.lang.String
   static final String field_1432 = "H28";
   // $VF: renamed from: sP java.lang.String
   static final String field_1433 = "O1";
   // $VF: renamed from: sQ java.lang.String
   static final String field_1434 = "O3";
   // $VF: renamed from: sR java.lang.String
   static final String field_1435 = "O2";
   // $VF: renamed from: sS java.lang.String
   static final String field_1436 = "O4";
   // $VF: renamed from: sT java.lang.String
   static final String field_1437 = "PI";
   // $VF: renamed from: sU java.lang.String
   static final String field_1438 = "PS";
   // $VF: renamed from: sV java.lang.String
   static final String field_1439 = "AS";
   // $VF: renamed from: sW java.lang.String
   static final String field_1440 = "LS";
   // $VF: renamed from: sX java.lang.String
   static final String field_1441 = "SL";
   // $VF: renamed from: sY java.lang.String
   static final String field_1442 = "LE1";
   // $VF: renamed from: sZ java.lang.String
   static final String field_1443 = "LE2";
   // $VF: renamed from: ta java.lang.String
   static final String field_1444 = "LE3";
   // $VF: renamed from: tb java.lang.String
   static final String field_1445 = "LE5";
   // $VF: renamed from: tc java.lang.String
   static final String field_1446 = "LE4";
   // $VF: renamed from: td java.lang.String
   static final String field_1447 = "LE6";
   // $VF: renamed from: te java.lang.String
   static final String field_1448 = "RC";
   // $VF: renamed from: tf java.lang.String
   static final String field_1449 = "WR";
   // $VF: renamed from: tg java.lang.String
   static final String field_1450 = "PW";
   // $VF: renamed from: th java.lang.String
   static final String field_1451 = "PCD";
   // $VF: renamed from: ti java.lang.String
   static final String field_1452 = "RPD";
   // $VF: renamed from: tj java.lang.String
   static final String field_1453 = "T1";
   // $VF: renamed from: tk java.lang.String
   static final String field_1454 = "T2";
   // $VF: renamed from: tl java.lang.String
   static final String field_1455 = "T11";
   // $VF: renamed from: tm java.lang.String
   static final String field_1456 = "T10";
   // $VF: renamed from: tn java.lang.String
   static final String field_1457 = "T3";
   // $VF: renamed from: to java.lang.String
   static final String field_1458 = "T4";
   // $VF: renamed from: tp java.lang.String
   static final String field_1459 = "T5";
   // $VF: renamed from: tq java.lang.String
   static final String field_1460 = "T6";
   // $VF: renamed from: tr java.lang.String
   static final String field_1461 = "T7";
   // $VF: renamed from: ts java.lang.String
   static final String field_1462 = "T8";
   // $VF: renamed from: tt java.lang.String
   static final String field_1463 = "T9";
   // $VF: renamed from: tu java.lang.String
   static final String field_1464 = "T12";
   // $VF: renamed from: tv java.lang.String
   static final String field_1465 = "T13";
   // $VF: renamed from: tw java.lang.String
   static final String field_1466 = "T14";
   // $VF: renamed from: tx java.lang.String
   static final String field_1467 = "T15";
   // $VF: renamed from: ty java.lang.String
   static final String field_1468 = "T16";
   // $VF: renamed from: tz java.lang.String
   static final String field_1469 = "T17";
   // $VF: renamed from: tA java.lang.String
   static final String field_1470 = "T18";
   // $VF: renamed from: tB java.lang.String
   static final String field_1471 = "T19";
   // $VF: renamed from: tC java.lang.String
   static final String field_1472 = "T20";
   // $VF: renamed from: tD java.lang.String
   static final String field_1473 = "T21";
   // $VF: renamed from: tE java.lang.String
   static final String field_1474 = "T22";
   // $VF: renamed from: tF java.lang.String
   static final String field_1475 = "L1";
   // $VF: renamed from: tG java.lang.String
   static final String field_1476 = "L2";
   // $VF: renamed from: tH java.lang.String
   static final String field_1477 = "L3";
   // $VF: renamed from: tI java.lang.String
   static final String field_1478 = "L4";
   // $VF: renamed from: tJ java.lang.String
   static final String field_1479 = "L5";
   // $VF: renamed from: tK java.lang.String
   static final String field_1480 = "L6";
   // $VF: renamed from: tL java.lang.String
   static final String field_1481 = "L7";
   // $VF: renamed from: tM java.lang.String
   static final String field_1482 = "L8";
   // $VF: renamed from: tN java.lang.String
   static final String field_1483 = "L9";
   // $VF: renamed from: tO java.lang.String
   static final String field_1484 = "L10";
   // $VF: renamed from: tP java.lang.String
   static final String field_1485 = "L11";
   // $VF: renamed from: tQ java.lang.String
   static final String field_1486 = "L12";
   // $VF: renamed from: tR java.lang.String
   static final String field_1487 = "L13";
   // $VF: renamed from: tS java.lang.String
   static final String field_1488 = "L14";
   // $VF: renamed from: tT java.lang.String
   static final String field_1489 = "L15";
   // $VF: renamed from: tU java.lang.String
   static final String field_1490 = "OW";
   // $VF: renamed from: tV java.lang.String
   static final String field_1491 = "U1";
   // $VF: renamed from: tW java.lang.String
   static final String field_1492 = "U2";
   // $VF: renamed from: tX java.lang.String
   static final String field_1493 = "U3";
   // $VF: renamed from: tY java.lang.String
   static final String field_1494 = "PSR";
   // $VF: renamed from: tZ java.lang.String
   static final String field_1495 = "G1";
   // $VF: renamed from: ua java.lang.String
   static final String field_1496 = "G2";
   // $VF: renamed from: ub java.util.Vector
   Vector field_1497 = new Vector();
   // $VF: renamed from: uc javax.swing.JLabel
   JLabel field_1498;

   // $VF: renamed from: a (java.lang.Object) void
   public void method_284(Object var1) {
      class_3.field_20.method_18("res/sound/bgm/Terra_Theme.wav", true);
      this.method_488();
      class_62.method_563("initializing...........................");
      this.field_394 = 0;
      this.field_401 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 221)));
      class_62.method_563("loadingSplash = " + this.field_401);
      String[] var2 = this.field_1284.method_260("en", 225, 0, 0);
      this.field_402 = new Icon[var2.length];

      for (int var3 = 0; var3 < var2.length; var3++) {
         this.field_402[var3] = new ImageIcon(this.getClass().getResource(this.field_395 + var2[var3]));
         class_62.method_563("animation = " + this.field_402[var3]);
      }

      try {
         field_797 = field_1274.getWidth();
         field_798 = field_1274.getHeight();
         this.field_398 = ImageIO.read(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 27)));
         this.field_397 = new BufferedImage(field_797, field_798, 1);
         this.field_396 = new BufferedImage(field_797, field_798, 1);
         this.field_397.createGraphics().drawImage(this.field_398, 0, 0, null);
         this.field_1281.field_1537 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 36)));
         String[] var6 = this.field_1284.method_260("en", 215, 0, 0);
         this.field_1281.field_1538 = new Icon[var6.length];

         for (int var4 = 0; var4 < var6.length; var4++) {
            this.field_1281.field_1538[var4] = new ImageIcon(this.getClass().getResource(this.field_395 + var6[var4]));
         }
      } catch (IOException var5) {
      }

      Enumeration var7 = this.field_399.elements();

      while (var7.hasMoreElements()) {
         class_90 var8 = (class_90)var7.nextElement();
         if (var8.field_3055 == field_1212) {
            var8.field_3073 = this.field_397;
         }
      }

      this.method_466((byte)7, null);
   }

   // $VF: renamed from: a (java.awt.Graphics) void
   public void method_285(Graphics var1) {
      this.field_401.paintIcon(field_1274, var1, 0, 0);
      if (this.field_1300 == 7) {
         if (!this.field_393) {
            try {
               switch (this.field_394) {
                  case 0:
                     class_62.method_563("initialize = " + this.field_394);
                     this.field_403 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 2)));
                     this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                     this.field_394++;
                     break;
                  case 1:
                     class_62.method_563("initialize = " + this.field_394);
                     BufferedImage var2 = ImageIO.read(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 88)));
                     BufferedImage var3 = new BufferedImage(var2.getWidth(null), var2.getHeight(null), 1);
                     var3.createGraphics().drawImage(var2, 0, 0, null);
                     ImageIcon var4 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 87)));
                     this.field_405 = (class_88)this.field_1285.method_553(Class.forName("C"));
                     this.field_405.method_806((byte)0);
                     this.field_405.method_808(var4, var3);
                     this.field_405.method_807(this.field_1284.method_254("en", 89), this.field_1284.method_254("en", 90));
                     this.field_405.g();
                     this.field_404.method_785(this.field_405);
                     this.field_406 = (class_88)this.field_1285.method_553(Class.forName("C"));
                     this.field_406.method_806((byte)1);
                     this.field_406.method_808(var4, var3);
                     this.field_406.method_807(this.field_1284.method_254("en", 91), this.field_1284.method_254("en", 92));
                     this.field_406.g();
                     this.field_404.method_785(this.field_406);
                     this.field_407 = (class_88)this.field_1285.method_553(Class.forName("C"));
                     this.field_407.method_806((byte)2);
                     this.field_407.method_808(var4, var3);
                     this.field_407.method_807(this.field_1284.method_254("en", 93), this.field_1284.method_254("en", 94));
                     this.field_407.g();
                     this.field_404.method_785(this.field_407);
                     this.field_408 = (class_88)this.field_1285.method_553(Class.forName("C"));
                     this.field_408.method_806((byte)3);
                     this.field_408.method_808(var4, var3);
                     this.field_408.method_807(this.field_1284.method_254("en", 95), this.field_1284.method_254("en", 96));
                     this.field_408.g();
                     this.field_404.method_785(this.field_408);
                     this.field_409 = (class_88)this.field_1285.method_553(Class.forName("C"));
                     this.field_409.method_806((byte)4);
                     this.field_409.method_808(var4, var3);
                     this.field_409.method_807(this.field_1284.method_254("en", 97), this.field_1284.method_254("en", 98));
                     this.field_409.g();
                     this.field_404.method_785(this.field_409);
                     this.field_410 = (class_88)this.field_1285.method_553(Class.forName("C"));
                     this.field_410.method_806((byte)5);
                     this.field_410.method_808(var4, var3);
                     this.field_410.method_807(this.field_1284.method_254("en", 99), this.field_1284.method_254("en", 100));
                     this.field_410.g();
                     this.field_404.method_785(this.field_410);
                     this.field_411 = (class_88)this.field_1285.method_553(Class.forName("C"));
                     this.field_411.method_806((byte)6);
                     this.field_411.method_808(var4, var3);
                     this.field_411.method_807(this.field_1284.method_254("en", 101), this.field_1284.method_254("en", 102));
                     this.field_411.g();
                     this.field_404.method_785(this.field_411);
                     this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                     this.field_394++;
                     break;
                  case 2:
                     class_62.method_563("initialize = " + this.field_394);
                     this.field_413 = (class_93)this.field_1285.method_553(Class.forName("af"));
                     this.field_413.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 61))));
                     this.field_413.method_884(this.field_1284.method_254("en", 64), this.field_1284.method_254("en", 65));
                     this.field_413.g();
                     this.field_412.method_785(this.field_413);
                     this.field_414 = (class_93)this.field_1285.method_553(Class.forName("af"));
                     this.field_414.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 66))));
                     this.field_414.method_884(this.field_1284.method_254("en", 67), this.field_1284.method_254("en", 68));
                     String[] var5 = this.field_1284.method_260("en", 183, 0, 0);
                     Icon[] var6 = new Icon[var5.length];

                     for (int var15 = 0; var15 < var6.length; var15++) {
                        var6[var15] = new ImageIcon(this.getClass().getResource(this.field_395 + var5[var15]));
                     }

                     this.field_414.method_886(var6, this.field_1284.method_254("en", 184), this.field_1284.method_254("en", 185));
                     this.field_414.g();
                     this.field_412.method_785(this.field_414);
                     this.field_415 = (class_93)this.field_1285.method_553(Class.forName("af"));
                     this.field_415.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 61))));
                     this.field_415.method_884(this.field_1284.method_254("en", 62), this.field_1284.method_254("en", 63));
                     this.field_415.g();
                     this.field_412.method_785(this.field_415);
                     this.field_416 = (class_93)this.field_1285.method_553(Class.forName("af"));
                     this.field_416.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 69))));
                     this.field_416.method_884(this.field_1284.method_254("en", 70), this.field_1284.method_254("en", 71));
                     this.field_416.g();
                     this.field_412.method_785(this.field_416);
                     this.field_417 = (class_93)this.field_1285.method_553(Class.forName("af"));
                     this.field_417.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 72))));
                     this.field_417.method_884(this.field_1284.method_254("en", 73), this.field_1284.method_254("en", 74));
                     this.field_417.g();
                     this.field_412.method_785(this.field_417);
                     this.field_418 = (class_93)this.field_1285.method_553(Class.forName("af"));
                     this.field_418.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 75))));
                     this.field_418.method_884(this.field_1284.method_254("en", 76), this.field_1284.method_254("en", 77));
                     this.field_418.g();
                     this.field_412.method_785(this.field_418);
                     this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                     this.field_394++;
                     break;
                  case 3:
                     class_62.method_563("initialize = " + this.field_394);
                     this.field_423 = (class_93)this.field_1285.method_553(Class.forName("af"));
                     this.field_423.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 78))));
                     this.field_423.method_884(this.field_1284.method_254("en", 79), this.field_1284.method_254("en", 80));
                     String[] var7 = this.field_1284.method_260("en", 189, 0, 0);
                     Icon[] var8 = new Icon[var7.length];

                     for (int var9 = 0; var9 < var8.length; var9++) {
                        var8[var9] = new ImageIcon(this.getClass().getResource(this.field_395 + var7[var9]));
                     }

                     this.field_423.method_886(var8, this.field_1284.method_254("en", 190), this.field_1284.method_254("en", 191));
                     this.field_423.g();
                     this.field_422.method_785(this.field_423);
                     this.field_424 = (class_93)this.field_1285.method_553(Class.forName("af"));
                     this.field_424.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 84))));
                     this.field_424.method_884(this.field_1284.method_254("en", 85), this.field_1284.method_254("en", 86));
                     this.field_424.g();
                     this.field_422.method_785(this.field_424);
                     this.field_425 = (class_93)this.field_1285.method_553(Class.forName("af"));
                     this.field_425.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 81))));
                     this.field_425.method_884(this.field_1284.method_254("en", 82), this.field_1284.method_254("en", 83));
                     String[] var16 = this.field_1284.method_260("en", 186, 0, 0);
                     Icon[] var10 = new Icon[var16.length];

                     for (int var11 = 0; var11 < var10.length; var11++) {
                        var10[var11] = new ImageIcon(this.getClass().getResource(this.field_395 + var16[var11]));
                     }

                     this.field_425.method_886(var10, this.field_1284.method_254("en", 187), this.field_1284.method_254("en", 188));
                     this.field_425.g();
                     this.field_422.method_785(this.field_425);
                     this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                     this.field_394++;
                     break;
                  case 4:
                     class_62.method_563("initialize = " + this.field_394);
                     this.field_429 = (class_92)this.field_1285.method_553(Class.forName("H"));
                     this.field_429
                        .method_876(
                           new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 216))),
                           new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 217))),
                           new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 218)))
                        );
                     this.field_427.method_785(this.field_429);
                     this.field_427.method_785(this.field_428);
                     this.field_404.g();
                     this.field_412.g();
                     this.field_420.g();
                     this.field_422.g();
                     this.field_427.g();
                     this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                     this.field_394++;
                     break;
                  case 5:
                     class_62.method_563("initialize = " + this.field_394);
                     this.field_1281.field_1548 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 540)));
                     this.field_1281.field_1549 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 547)));
                     this.field_1281.field_1573 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 543)));
                     this.field_1281.field_1578 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 544)));
                     this.field_1281.field_1583 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 545)));
                     this.field_1281.field_1588 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 546)));
                     this.field_1281.field_1574 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 573)));
                     this.field_1281.field_1579 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 574)));
                     this.field_1281.field_1584 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 575)));
                     this.field_1281.field_1589 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 576)));
                     this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                     this.field_394++;
                     break;
                  case 6:
                     class_57.field_1525 = field_436;
                     this.field_1281.field_1527 = field_1212;
                     this.field_1281.field_1526 = field_439;
                     this.field_1281.field_1528 = field_1213;
                     class_62.method_563("initialize = " + this.field_394);
                     this.field_1281.field_1540 = this.field_1275;
                     this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                     this.field_393 = true;
                     class_62.method_563("finish init go to colony");
                     this.method_466((byte)5, null);
               }
            } catch (IOException var12) {
               class_62.method_563("[Colony State] IOException: " + var12.getMessage());
               var12.printStackTrace();
            } catch (ClassNotFoundException var13) {
               class_62.method_563("[Colony State] ClassNotFoundException: " + var13.getMessage());
            } catch (Exception var14) {
               class_62.method_563("init Exception " + var14.getMessage());
               var14.printStackTrace();
            }
         } else {
            class_62.method_563("go to colony");
            this.method_466((byte)5, null);
         }
      }
   }

   // $VF: renamed from: b (java.lang.Object) void
   public void method_286(Object var1) {
      class_3.field_20.method_18("res/sound/bgm/Fira_Theme.wav", true);
      this.method_488();
      class_62.method_563("initializing...........................");
      this.field_394 = 0;
      this.field_401 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 220)));
      class_62.method_563("loadingSplash = " + this.field_401);
      String[] var2 = this.field_1284.method_260("en", 225, 0, 0);
      this.field_402 = new Icon[var2.length];

      for (int var3 = 0; var3 < var2.length; var3++) {
         this.field_402[var3] = new ImageIcon(this.getClass().getResource(this.field_395 + var2[var3]));
         class_62.method_563("animation = " + this.field_402[var3]);
      }

      try {
         field_797 = field_1274.getWidth();
         field_798 = field_1274.getHeight();
         this.field_398 = ImageIO.read(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 819)));
         this.field_397 = new BufferedImage(field_797, field_798, 1);
         this.field_396 = new BufferedImage(field_797, field_798, 1);
         this.field_397.createGraphics().drawImage(this.field_398, 0, 0, null);
         this.field_1281.field_1537 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 36)));
         String[] var6 = this.field_1284.method_260("en", 215, 0, 0);
         this.field_1281.field_1538 = new Icon[var6.length];

         for (int var4 = 0; var4 < var6.length; var4++) {
            this.field_1281.field_1538[var4] = new ImageIcon(this.getClass().getResource(this.field_395 + var6[var4]));
         }
      } catch (IOException var5) {
      }

      Enumeration var7 = this.field_399.elements();

      while (var7.hasMoreElements()) {
         class_90 var8 = (class_90)var7.nextElement();
         if (var8.field_3055 == field_1212) {
            var8.field_3073 = this.field_397;
         }
      }

      this.method_466((byte)27, null);
   }

   // $VF: renamed from: b (java.awt.Graphics) void
   public void method_287(Graphics var1) {
      this.field_401.paintIcon(field_1274, var1, 0, 0);
      if (this.field_1300 == 27) {
         if (!this.field_430) {
            try {
               switch (this.field_394) {
                  case 0:
                     class_62.method_563("initialize = " + this.field_394);
                     this.field_403 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 824)));
                     this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                     this.field_394++;
                     break;
                  case 1:
                     class_62.method_563("initialize = " + this.field_394);
                     BufferedImage var2 = ImageIO.read(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 770)));
                     BufferedImage var3 = new BufferedImage(var2.getWidth(null), var2.getHeight(null), 1);
                     var3.createGraphics().drawImage(var2, 0, 0, null);
                     ImageIcon var4 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 771)));
                     this.field_405 = (class_88)this.field_1285.method_553(Class.forName("C"));
                     this.field_405.method_806((byte)0);
                     this.field_405.method_808(var4, var3);
                     this.field_405.method_807(this.field_1284.method_254("en", 772), this.field_1284.method_254("en", 773));
                     this.field_405.g();
                     this.field_404.method_785(this.field_405);
                     this.field_406 = (class_88)this.field_1285.method_553(Class.forName("C"));
                     this.field_406.method_806((byte)1);
                     this.field_406.method_808(var4, var3);
                     this.field_406.method_807(this.field_1284.method_254("en", 774), this.field_1284.method_254("en", 775));
                     this.field_406.g();
                     this.field_404.method_785(this.field_406);
                     this.field_407 = (class_88)this.field_1285.method_553(Class.forName("C"));
                     this.field_407.method_806((byte)2);
                     this.field_407.method_808(var4, var3);
                     this.field_407.method_807(this.field_1284.method_254("en", 776), this.field_1284.method_254("en", 777));
                     this.field_407.g();
                     this.field_404.method_785(this.field_407);
                     this.field_408 = (class_88)this.field_1285.method_553(Class.forName("C"));
                     this.field_408.method_806((byte)3);
                     this.field_408.method_808(var4, var3);
                     this.field_408.method_807(this.field_1284.method_254("en", 778), this.field_1284.method_254("en", 779));
                     this.field_408.g();
                     this.field_404.method_785(this.field_408);
                     this.field_409 = (class_88)this.field_1285.method_553(Class.forName("C"));
                     this.field_409.method_806((byte)4);
                     this.field_409.method_808(var4, var3);
                     this.field_409.method_807(this.field_1284.method_254("en", 780), this.field_1284.method_254("en", 781));
                     this.field_409.g();
                     this.field_404.method_785(this.field_409);
                     this.field_410 = (class_88)this.field_1285.method_553(Class.forName("C"));
                     this.field_410.method_806((byte)5);
                     this.field_410.method_808(var4, var3);
                     this.field_410.method_807(this.field_1284.method_254("en", 782), this.field_1284.method_254("en", 783));
                     this.field_410.g();
                     this.field_404.method_785(this.field_410);
                     this.field_411 = (class_88)this.field_1285.method_553(Class.forName("C"));
                     this.field_411.method_806((byte)6);
                     this.field_411.method_808(var4, var3);
                     this.field_411.method_807(this.field_1284.method_254("en", 784), this.field_1284.method_254("en", 785));
                     this.field_411.g();
                     this.field_404.method_785(this.field_411);
                     this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                     this.field_394++;
                     break;
                  case 2:
                     class_62.method_563("initialize = " + this.field_394);
                     this.field_424 = (class_93)this.field_1285.method_553(Class.forName("af"));
                     this.field_424.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 786))));
                     this.field_424.method_884(this.field_1284.method_254("en", 787), this.field_1284.method_254("en", 788));
                     String[] var5 = this.field_1284.method_260("en", 789, 0, 0);
                     Icon[] var6 = new Icon[var5.length];

                     for (int var7 = 0; var7 < var6.length; var7++) {
                        var6[var7] = new ImageIcon(this.getClass().getResource(this.field_395 + var5[var7]));
                     }

                     this.field_424.method_886(var6, this.field_1284.method_254("en", 790), this.field_1284.method_254("en", 791));
                     this.field_424.g();
                     this.field_412.method_785(this.field_424);
                     this.field_414 = (class_93)this.field_1285.method_553(Class.forName("af"));
                     this.field_414.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 792))));
                     this.field_414.method_884(this.field_1284.method_254("en", 793), this.field_1284.method_254("en", 794));
                     String[] var15 = this.field_1284.method_260("en", 795, 0, 0);
                     Icon[] var8 = new Icon[var15.length];

                     for (int var9 = 0; var9 < var8.length; var9++) {
                        var8[var9] = new ImageIcon(this.getClass().getResource(this.field_395 + var15[var9]));
                     }

                     this.field_414.method_886(var8, this.field_1284.method_254("en", 796), this.field_1284.method_254("en", 797));
                     this.field_414.g();
                     this.field_412.method_785(this.field_414);
                     this.field_416 = (class_93)this.field_1285.method_553(Class.forName("af"));
                     this.field_416.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 798))));
                     this.field_416.method_884(this.field_1284.method_254("en", 799), this.field_1284.method_254("en", 800));
                     String[] var16 = this.field_1284.method_260("en", 801, 0, 0);
                     Icon[] var10 = new Icon[var16.length];

                     for (int var11 = 0; var11 < var10.length; var11++) {
                        var10[var11] = new ImageIcon(this.getClass().getResource(this.field_395 + var16[var11]));
                     }

                     this.field_416.method_886(var10, this.field_1284.method_254("en", 802), this.field_1284.method_254("en", 803));
                     this.field_416.g();
                     this.field_412.method_785(this.field_416);
                     this.field_418 = (class_93)this.field_1285.method_553(Class.forName("af"));
                     this.field_418.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 804))));
                     this.field_418.method_884(this.field_1284.method_254("en", 805), this.field_1284.method_254("en", 806));
                     this.field_418.g();
                     this.field_412.method_785(this.field_418);
                     this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                     this.field_394++;
                     break;
                  case 3:
                     class_62.method_563("initialize = " + this.field_394);
                     this.field_425 = (class_93)this.field_1285.method_553(Class.forName("af"));
                     this.field_425.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 807))));
                     this.field_425.method_884(this.field_1284.method_254("en", 808), this.field_1284.method_254("en", 809));
                     this.field_425.g();
                     this.field_422.method_785(this.field_425);
                     this.field_423 = (class_93)this.field_1285.method_553(Class.forName("af"));
                     this.field_423.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 810))));
                     this.field_423.method_884(this.field_1284.method_254("en", 811), this.field_1284.method_254("en", 812));
                     this.field_423.g();
                     this.field_422.method_785(this.field_423);
                     this.field_417 = (class_93)this.field_1285.method_553(Class.forName("af"));
                     this.field_417.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 813))));
                     this.field_417.method_884(this.field_1284.method_254("en", 814), this.field_1284.method_254("en", 815));
                     this.field_417.g();
                     this.field_422.method_785(this.field_417);
                     this.field_419 = (class_93)this.field_1285.method_553(Class.forName("af"));
                     this.field_419.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 816))));
                     this.field_419.method_884(this.field_1284.method_254("en", 817), this.field_1284.method_254("en", 818));
                     this.field_419.g();
                     this.field_422.method_785(this.field_419);
                     this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                     this.field_394++;
                     break;
                  case 4:
                     class_62.method_563("initialize = " + this.field_394);
                     this.field_429 = (class_92)this.field_1285.method_553(Class.forName("H"));
                     this.field_429
                        .method_876(
                           new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 216))),
                           new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 217))),
                           new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 218)))
                        );
                     this.field_427.method_785(this.field_429);
                     this.field_427.method_785(this.field_428);
                     this.field_404.g();
                     this.field_412.g();
                     this.field_420.g();
                     this.field_422.g();
                     this.field_427.g();
                     this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                     this.field_394++;
                     break;
                  case 5:
                     class_62.method_563("initialize = " + this.field_394);
                     this.field_1281.field_1548 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 540)));
                     this.field_1281.field_1549 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 547)));
                     this.field_1281.field_1573 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 543)));
                     this.field_1281.field_1578 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 544)));
                     this.field_1281.field_1583 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 545)));
                     this.field_1281.field_1588 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 546)));
                     this.field_1281.field_1574 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 573)));
                     this.field_1281.field_1579 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 574)));
                     this.field_1281.field_1584 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 575)));
                     this.field_1281.field_1589 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 576)));
                     this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                     this.field_394++;
                     break;
                  case 6:
                     class_57.field_1525 = field_436;
                     this.field_1281.field_1527 = field_1212;
                     this.field_1281.field_1526 = field_439;
                     this.field_1281.field_1528 = field_1213;
                     class_62.method_563("initialize = " + this.field_394);
                     this.field_1281.field_1540 = this.field_1275;
                     this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                     this.field_430 = true;
                     class_62.method_563("finish init go to colony");
                     this.method_466((byte)5, null);
               }
            } catch (IOException var12) {
               class_62.method_563("[Colony State] IOException: " + var12.getMessage());
               var12.printStackTrace();
            } catch (ClassNotFoundException var13) {
               class_62.method_563("[Colony State] ClassNotFoundException: " + var13.getMessage());
            } catch (Exception var14) {
               class_62.method_563("init Exception " + var14.getMessage());
               var14.printStackTrace();
            }
         } else {
            class_62.method_563("go to colony");
            this.method_466((byte)5, null);
         }
      }
   }

   // $VF: renamed from: c (java.lang.Object) void
   public void method_288(Object var1) {
      class_3.field_20.method_18("res/sound/bgm/Taikus_Theme.wav", true);
      this.method_488();
      class_62.method_563("initializing...........................");
      this.field_394 = 0;
      this.field_401 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 223)));
      class_62.method_563("loadingSplash = " + this.field_401);
      String[] var2 = this.field_1284.method_260("en", 225, 0, 0);
      this.field_402 = new Icon[var2.length];

      for (int var3 = 0; var3 < var2.length; var3++) {
         this.field_402[var3] = new ImageIcon(this.getClass().getResource(this.field_395 + var2[var3]));
         class_62.method_563("animation = " + this.field_402[var3]);
      }

      try {
         field_797 = field_1274.getWidth();
         field_798 = field_1274.getHeight();
         this.field_398 = ImageIO.read(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 822)));
         this.field_397 = new BufferedImage(field_797, field_798, 1);
         this.field_396 = new BufferedImage(field_797, field_798, 1);
         this.field_397.createGraphics().drawImage(this.field_398, 0, 0, null);
         this.field_1281.field_1537 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 36)));
         String[] var6 = this.field_1284.method_260("en", 215, 0, 0);
         this.field_1281.field_1538 = new Icon[var6.length];

         for (int var4 = 0; var4 < var6.length; var4++) {
            this.field_1281.field_1538[var4] = new ImageIcon(this.getClass().getResource(this.field_395 + var6[var4]));
         }
      } catch (IOException var5) {
      }

      Enumeration var7 = this.field_399.elements();

      while (var7.hasMoreElements()) {
         class_90 var8 = (class_90)var7.nextElement();
         if (var8.field_3055 == field_1212) {
            var8.field_3073 = this.field_397;
         }
      }

      this.method_466((byte)25, null);
   }

   // $VF: renamed from: c (java.awt.Graphics) void
   public void method_289(Graphics var1) {
      this.field_401.paintIcon(field_1274, var1, 0, 0);
      if (this.field_1300 == 25) {
         try {
            switch (this.field_394) {
               case 0:
                  class_62.method_563("initialize = " + this.field_394);
                  this.field_403 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 823)));
                  this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                  this.field_394++;
                  break;
               case 1:
                  class_62.method_563("initialize = " + this.field_394);
                  BufferedImage var2 = ImageIO.read(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 825)));
                  BufferedImage var3 = new BufferedImage(var2.getWidth(null), var2.getHeight(null), 1);
                  var3.createGraphics().drawImage(var2, 0, 0, null);
                  ImageIcon var4 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 826)));
                  this.field_405 = (class_88)this.field_1285.method_553(Class.forName("C"));
                  this.field_405.method_806((byte)0);
                  this.field_405.method_808(var4, var3);
                  this.field_405.method_807(this.field_1284.method_254("en", 827), this.field_1284.method_254("en", 828));
                  this.field_405.g();
                  this.field_404.method_785(this.field_405);
                  this.field_406 = (class_88)this.field_1285.method_553(Class.forName("C"));
                  this.field_406.method_806((byte)1);
                  this.field_406.method_808(var4, var3);
                  this.field_406.method_807(this.field_1284.method_254("en", 829), this.field_1284.method_254("en", 830));
                  this.field_406.g();
                  this.field_404.method_785(this.field_406);
                  this.field_407 = (class_88)this.field_1285.method_553(Class.forName("C"));
                  this.field_407.method_806((byte)2);
                  this.field_407.method_808(var4, var3);
                  this.field_407.method_807(this.field_1284.method_254("en", 831), this.field_1284.method_254("en", 832));
                  this.field_407.g();
                  this.field_404.method_785(this.field_407);
                  this.field_408 = (class_88)this.field_1285.method_553(Class.forName("C"));
                  this.field_408.method_806((byte)3);
                  this.field_408.method_808(var4, var3);
                  this.field_408.method_807(this.field_1284.method_254("en", 833), this.field_1284.method_254("en", 834));
                  this.field_408.g();
                  this.field_404.method_785(this.field_408);
                  this.field_409 = (class_88)this.field_1285.method_553(Class.forName("C"));
                  this.field_409.method_806((byte)4);
                  this.field_409.method_808(var4, var3);
                  this.field_409.method_807(this.field_1284.method_254("en", 835), this.field_1284.method_254("en", 836));
                  this.field_409.g();
                  this.field_404.method_785(this.field_409);
                  this.field_410 = (class_88)this.field_1285.method_553(Class.forName("C"));
                  this.field_410.method_806((byte)5);
                  this.field_410.method_808(var4, var3);
                  this.field_410.method_807(this.field_1284.method_254("en", 837), this.field_1284.method_254("en", 838));
                  this.field_410.g();
                  this.field_404.method_785(this.field_410);
                  this.field_411 = (class_88)this.field_1285.method_553(Class.forName("C"));
                  this.field_411.method_806((byte)6);
                  this.field_411.method_808(var4, var3);
                  this.field_411.method_807(this.field_1284.method_254("en", 839), this.field_1284.method_254("en", 840));
                  this.field_411.g();
                  this.field_404.method_785(this.field_411);
                  this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                  this.field_394++;
                  break;
               case 2:
                  class_62.method_563("initialize = " + this.field_394);
                  this.field_424 = (class_93)this.field_1285.method_553(Class.forName("af"));
                  this.field_424.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 841))));
                  this.field_424.method_884(this.field_1284.method_254("en", 845), this.field_1284.method_254("en", 846));
                  String[] var5 = this.field_1284.method_260("en", 842, 0, 0);
                  Icon[] var6 = new Icon[var5.length];

                  for (int var17 = 0; var17 < var6.length; var17++) {
                     var6[var17] = new ImageIcon(this.getClass().getResource(this.field_395 + var5[var17]));
                  }

                  this.field_424.method_886(var6, this.field_1284.method_254("en", 843), this.field_1284.method_254("en", 844));
                  this.field_424.g();
                  this.field_412.method_785(this.field_424);
                  this.field_416 = (class_93)this.field_1285.method_553(Class.forName("af"));
                  this.field_416.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 853))));
                  this.field_416.method_884(this.field_1284.method_254("en", 854), this.field_1284.method_254("en", 855));
                  this.field_416.g();
                  this.field_412.method_785(this.field_416);
                  this.field_425 = (class_93)this.field_1285.method_553(Class.forName("af"));
                  this.field_425.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 859))));
                  this.field_425.method_884(this.field_1284.method_254("en", 860), this.field_1284.method_254("en", 861));
                  this.field_425.g();
                  this.field_412.method_785(this.field_425);
                  this.field_418 = (class_93)this.field_1285.method_553(Class.forName("af"));
                  this.field_418.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 856))));
                  this.field_418.method_884(this.field_1284.method_254("en", 857), this.field_1284.method_254("en", 858));
                  this.field_418.g();
                  this.field_412.method_785(this.field_418);
                  this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                  this.field_394++;
                  break;
               case 3:
                  class_62.method_563("initialize = " + this.field_394);
                  this.field_423 = (class_93)this.field_1285.method_553(Class.forName("af"));
                  this.field_423.method_885(null);
                  String[] var7 = this.field_1284.method_260("en", 862, 0, 0);
                  Icon[] var8 = new Icon[var7.length];

                  for (int var9 = 0; var9 < var8.length; var9++) {
                     var8[var9] = new ImageIcon(this.getClass().getResource(this.field_395 + var7[var9]));
                  }

                  this.field_423.method_886(var8, this.field_1284.method_254("en", 863), this.field_1284.method_254("en", 864));
                  this.field_423.g();
                  this.field_422.method_785(this.field_423);
                  this.field_414 = (class_93)this.field_1285.method_553(Class.forName("af"));
                  this.field_414.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 847))));
                  this.field_414.method_884(this.field_1284.method_254("en", 851), this.field_1284.method_254("en", 852));
                  String[] var18 = this.field_1284.method_260("en", 848, 0, 0);
                  Icon[] var10 = new Icon[var18.length];

                  for (int var11 = 0; var11 < var10.length; var11++) {
                     var10[var11] = new ImageIcon(this.getClass().getResource(this.field_395 + var18[var11]));
                  }

                  this.field_414.method_886(var10, this.field_1284.method_254("en", 849), this.field_1284.method_254("en", 850));
                  this.field_414.g();
                  this.field_422.method_785(this.field_414);
                  this.field_417 = (class_93)this.field_1285.method_553(Class.forName("af"));
                  this.field_417.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 865))));
                  this.field_417.method_884(this.field_1284.method_254("en", 866), this.field_1284.method_254("en", 867));
                  String[] var19 = this.field_1284.method_260("en", 1247, 0, 0);
                  Icon[] var12 = new Icon[var19.length];

                  for (int var13 = 0; var13 < var12.length; var13++) {
                     var12[var13] = new ImageIcon(this.getClass().getResource(this.field_395 + var19[var13]));
                  }

                  this.field_417.method_886(var12, this.field_1284.method_254("en", 1248), this.field_1284.method_254("en", 1249));
                  this.field_417.g();
                  this.field_422.method_785(this.field_417);
                  this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                  this.field_394++;
                  break;
               case 4:
                  class_62.method_563("initialize = " + this.field_394);
                  this.field_429 = (class_92)this.field_1285.method_553(Class.forName("H"));
                  this.field_429
                     .method_876(
                        new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 216))),
                        new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 217))),
                        new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 218)))
                     );
                  this.field_427.method_785(this.field_429);
                  this.field_427.method_785(this.field_428);
                  this.field_404.g();
                  this.field_412.g();
                  this.field_420.g();
                  this.field_422.g();
                  this.field_427.g();
                  this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                  this.field_394++;
                  break;
               case 5:
                  class_62.method_563("initialize = " + this.field_394);
                  this.field_1281.field_1548 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 540)));
                  this.field_1281.field_1549 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 547)));
                  this.field_1281.field_1573 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 543)));
                  this.field_1281.field_1578 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 544)));
                  this.field_1281.field_1583 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 545)));
                  this.field_1281.field_1588 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 546)));
                  this.field_1281.field_1574 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 573)));
                  this.field_1281.field_1579 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 574)));
                  this.field_1281.field_1584 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 575)));
                  this.field_1281.field_1589 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 576)));
                  this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                  this.field_394++;
                  break;
               case 6:
                  class_57.field_1525 = field_436;
                  this.field_1281.field_1527 = field_1212;
                  this.field_1281.field_1526 = field_439;
                  this.field_1281.field_1528 = field_1213;
                  class_62.method_563("initialize = " + this.field_394);
                  this.field_1275 = new class_28(
                     this.field_395 + this.field_1284.method_253("en", 291), "graphicsMapping.txt", "itemClassMapping.txt", "bodySlotMapping.txt"
                  );
                  this.field_1281.field_1540 = this.field_1275;
                  this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                  class_62.method_563("finish init go to colony");
                  this.method_466((byte)5, null);
            }
         } catch (IOException var14) {
            class_62.method_563("[Colony State] IOException: " + var14.getMessage());
            var14.printStackTrace();
         } catch (ClassNotFoundException var15) {
            class_62.method_563("[Colony State] ClassNotFoundException: " + var15.getMessage());
         } catch (Exception var16) {
            class_62.method_563("init Exception " + var16.getMessage());
            var16.printStackTrace();
         }
      }
   }

   // $VF: renamed from: d (java.lang.Object) void
   public void method_290(Object var1) {
      class_3.field_20.method_18("res/sound/bgm/Bruca_Theme.wav", true);
      this.method_488();
      class_62.method_563("initializing...........................");
      this.field_394 = 0;
      this.field_401 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 222)));
      class_62.method_563("loadingSplash = " + this.field_401);
      String[] var2 = this.field_1284.method_260("en", 225, 0, 0);
      this.field_402 = new Icon[var2.length];

      for (int var3 = 0; var3 < var2.length; var3++) {
         this.field_402[var3] = new ImageIcon(this.getClass().getResource(this.field_395 + var2[var3]));
         class_62.method_563("animation = " + this.field_402[var3]);
      }

      try {
         field_797 = field_1274.getWidth();
         field_798 = field_1274.getHeight();
         this.field_398 = ImageIO.read(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 982)));
         this.field_397 = new BufferedImage(field_797, field_798, 1);
         this.field_396 = new BufferedImage(field_797, field_798, 1);
         this.field_397.createGraphics().drawImage(this.field_398, 0, 0, null);
         this.field_1281.field_1537 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 36)));
         String[] var6 = this.field_1284.method_260("en", 215, 0, 0);
         this.field_1281.field_1538 = new Icon[var6.length];

         for (int var4 = 0; var4 < var6.length; var4++) {
            this.field_1281.field_1538[var4] = new ImageIcon(this.getClass().getResource(this.field_395 + var6[var4]));
         }
      } catch (IOException var5) {
      }

      Enumeration var7 = this.field_399.elements();

      while (var7.hasMoreElements()) {
         class_90 var8 = (class_90)var7.nextElement();
         if (var8.field_3055 == field_1212) {
            var8.field_3073 = this.field_397;
         }
      }

      this.method_466((byte)29, null);
   }

   // $VF: renamed from: d (java.awt.Graphics) void
   public void method_291(Graphics var1) {
      this.field_401.paintIcon(field_1274, var1, 0, 0);
      if (this.field_1300 == 29) {
         if (!this.field_432) {
            try {
               switch (this.field_394) {
                  case 0:
                     class_62.method_563("initialize = " + this.field_394);
                     this.field_403 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 983)));
                     this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                     this.field_394++;
                     break;
                  case 1:
                     class_62.method_563("initialize = " + this.field_394);
                     BufferedImage var2 = ImageIO.read(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 984)));
                     BufferedImage var3 = new BufferedImage(var2.getWidth(null), var2.getHeight(null), 1);
                     var3.createGraphics().drawImage(var2, 0, 0, null);
                     ImageIcon var4 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 985)));
                     this.field_405 = (class_88)this.field_1285.method_553(Class.forName("C"));
                     this.field_405.method_806((byte)0);
                     this.field_405.method_808(var4, var3);
                     this.field_405.method_807(this.field_1284.method_254("en", 992), this.field_1284.method_254("en", 993));
                     this.field_405.g();
                     this.field_404.method_785(this.field_405);
                     this.field_406 = (class_88)this.field_1285.method_553(Class.forName("C"));
                     this.field_406.method_806((byte)1);
                     this.field_406.method_808(var4, var3);
                     this.field_406.method_807(this.field_1284.method_254("en", 988), this.field_1284.method_254("en", 989));
                     this.field_406.g();
                     this.field_404.method_785(this.field_406);
                     this.field_407 = (class_88)this.field_1285.method_553(Class.forName("C"));
                     this.field_407.method_806((byte)2);
                     this.field_407.method_808(var4, var3);
                     this.field_407.method_807(this.field_1284.method_254("en", 986), this.field_1284.method_254("en", 987));
                     this.field_407.g();
                     this.field_404.method_785(this.field_407);
                     this.field_408 = (class_88)this.field_1285.method_553(Class.forName("C"));
                     this.field_408.method_806((byte)3);
                     this.field_408.method_808(var4, var3);
                     this.field_408.method_807(this.field_1284.method_254("en", 998), this.field_1284.method_254("en", 999));
                     this.field_408.g();
                     this.field_404.method_785(this.field_408);
                     this.field_409 = (class_88)this.field_1285.method_553(Class.forName("C"));
                     this.field_409.method_806((byte)4);
                     this.field_409.method_808(var4, var3);
                     this.field_409.method_807(this.field_1284.method_254("en", 990), this.field_1284.method_254("en", 991));
                     this.field_409.g();
                     this.field_404.method_785(this.field_409);
                     this.field_410 = (class_88)this.field_1285.method_553(Class.forName("C"));
                     this.field_410.method_806((byte)5);
                     this.field_410.method_808(var4, var3);
                     this.field_410.method_807(this.field_1284.method_254("en", 994), this.field_1284.method_254("en", 995));
                     this.field_410.g();
                     this.field_404.method_785(this.field_410);
                     this.field_411 = (class_88)this.field_1285.method_553(Class.forName("C"));
                     this.field_411.method_806((byte)6);
                     this.field_411.method_808(var4, var3);
                     this.field_411.method_807(this.field_1284.method_254("en", 996), this.field_1284.method_254("en", 997));
                     this.field_411.g();
                     this.field_404.method_785(this.field_411);
                     this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                     this.field_394++;
                     break;
                  case 2:
                     class_62.method_563("initialize = " + this.field_394);
                     this.field_416 = (class_93)this.field_1285.method_553(Class.forName("af"));
                     this.field_416.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1003))));
                     this.field_416.method_884(this.field_1284.method_254("en", 1004), this.field_1284.method_254("en", 1005));
                     this.field_416.g();
                     this.field_412.method_785(this.field_416);
                     this.field_417 = (class_93)this.field_1285.method_553(Class.forName("af"));
                     this.field_417.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1000))));
                     this.field_417.method_884(this.field_1284.method_254("en", 1001), this.field_1284.method_254("en", 1002));
                     this.field_417.g();
                     this.field_412.method_785(this.field_417);
                     this.field_424 = (class_93)this.field_1285.method_553(Class.forName("af"));
                     this.field_424.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1006))));
                     this.field_424.method_884(this.field_1284.method_254("en", 1007), this.field_1284.method_254("en", 1008));
                     String[] var5 = this.field_1284.method_260("en", 1024, 0, 0);
                     Icon[] var6 = new Icon[var5.length];

                     for (int var15 = 0; var15 < var6.length; var15++) {
                        var6[var15] = new ImageIcon(this.getClass().getResource(this.field_395 + var5[var15]));
                     }

                     this.field_424.method_886(var6, this.field_1284.method_254("en", 1025), this.field_1284.method_254("en", 1026));
                     this.field_424.g();
                     this.field_412.method_785(this.field_424);
                     this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                     this.field_394++;
                     break;
                  case 3:
                     class_62.method_563("initialize = " + this.field_394);
                     this.field_414 = (class_93)this.field_1285.method_553(Class.forName("af"));
                     this.field_414.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1009))));
                     this.field_414.method_884(this.field_1284.method_254("en", 1010), this.field_1284.method_254("en", 1011));
                     String[] var7 = this.field_1284.method_260("en", 1027, 0, 0);
                     Icon[] var8 = new Icon[var7.length];

                     for (int var9 = 0; var9 < var8.length; var9++) {
                        var8[var9] = new ImageIcon(this.getClass().getResource(this.field_395 + var7[var9]));
                     }

                     this.field_414.method_886(var8, this.field_1284.method_254("en", 1028), this.field_1284.method_254("en", 1029));
                     this.field_414.g();
                     this.field_422.method_785(this.field_414);
                     this.field_418 = (class_93)this.field_1285.method_553(Class.forName("af"));
                     this.field_418.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1018))));
                     this.field_418.method_884(this.field_1284.method_254("en", 1019), this.field_1284.method_254("en", 1020));
                     this.field_418.g();
                     this.field_422.method_785(this.field_418);
                     this.field_423 = (class_93)this.field_1285.method_553(Class.forName("af"));
                     this.field_423.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1015))));
                     this.field_423.method_884(this.field_1284.method_254("en", 1016), this.field_1284.method_254("en", 1017));
                     String[] var16 = this.field_1284.method_260("en", 1030, 0, 0);
                     Icon[] var10 = new Icon[var16.length];

                     for (int var11 = 0; var11 < var10.length; var11++) {
                        var10[var11] = new ImageIcon(this.getClass().getResource(this.field_395 + var16[var11]));
                     }

                     this.field_423.method_886(var10, this.field_1284.method_254("en", 1031), this.field_1284.method_254("en", 1032));
                     this.field_423.g();
                     this.field_422.method_785(this.field_423);
                     this.field_425 = (class_93)this.field_1285.method_553(Class.forName("af"));
                     this.field_425.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1012))));
                     this.field_425.method_884(this.field_1284.method_254("en", 1013), this.field_1284.method_254("en", 1014));
                     this.field_425.g();
                     this.field_422.method_785(this.field_425);
                     this.field_426 = (class_93)this.field_1285.method_553(Class.forName("af"));
                     this.field_426.method_885(new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1021))));
                     this.field_426.method_884(this.field_1284.method_254("en", 1022), this.field_1284.method_254("en", 1023));
                     this.field_426.g();
                     this.field_422.method_785(this.field_426);
                     this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                     this.field_394++;
                     break;
                  case 4:
                     class_62.method_563("initialize = " + this.field_394);
                     this.field_429 = (class_92)this.field_1285.method_553(Class.forName("H"));
                     this.field_429
                        .method_876(
                           new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 216))),
                           new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 217))),
                           new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 218)))
                        );
                     this.field_427.method_785(this.field_429);
                     this.field_427.method_785(this.field_428);
                     this.field_404.g();
                     this.field_412.g();
                     this.field_420.g();
                     this.field_422.g();
                     this.field_427.g();
                     this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                     this.field_394++;
                     break;
                  case 5:
                     class_62.method_563("initialize = " + this.field_394);
                     this.field_1281.field_1548 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 540)));
                     this.field_1281.field_1549 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 547)));
                     this.field_1281.field_1573 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 543)));
                     this.field_1281.field_1578 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 544)));
                     this.field_1281.field_1583 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 545)));
                     this.field_1281.field_1588 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 546)));
                     this.field_1281.field_1574 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 573)));
                     this.field_1281.field_1579 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 574)));
                     this.field_1281.field_1584 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 575)));
                     this.field_1281.field_1589 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 576)));
                     this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                     this.field_394++;
                     break;
                  case 6:
                     class_57.field_1525 = field_436;
                     this.field_1281.field_1527 = field_1212;
                     this.field_1281.field_1526 = field_439;
                     this.field_1281.field_1528 = field_1213;
                     class_62.method_563("initialize = " + this.field_394);
                     this.field_1281.field_1540 = this.field_1275;
                     this.field_402[this.field_394].paintIcon(field_1274, var1, this.field_1284.method_254("en", 226), this.field_1284.method_254("en", 227));
                     this.field_432 = true;
                     class_62.method_563("finish init go to colony");
                     this.method_466((byte)5, null);
               }
            } catch (IOException var12) {
               class_62.method_563("[Colony State] IOException: " + var12.getMessage());
               var12.printStackTrace();
            } catch (ClassNotFoundException var13) {
               class_62.method_563("[Colony State] ClassNotFoundException: " + var13.getMessage());
            } catch (Exception var14) {
               class_62.method_563("init Exception " + var14.getMessage());
               var14.printStackTrace();
            }
         } else {
            class_62.method_563("go to colony");
            this.method_466((byte)5, null);
         }
      }
   }

   // $VF: renamed from: e (java.lang.Object) void
   public void method_292(Object var1) {
      this.field_1273.method_98();
      this.field_775 = this.field_1281.method_502("en", 1205);
      this.field_776 = this.field_1281.method_502("en", 1206);
      this.field_777 = this.field_1281.method_502("en", 1207);
      this.field_778 = this.field_1281.method_503("en", 1208);
      this.field_779 = this.field_1281.method_502("en", 1156);
      this.field_780 = this.field_1281.method_502("en", 1157);
      this.field_781 = this.field_1281.method_502("en", 1209);
      this.field_782 = this.field_1281.method_502("en", 1210);
      this.field_783 = this.field_1281.method_502("en", 1160);
      this.field_784 = this.field_1281.method_502("en", 1161);
      this.field_786 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 1162)));
      this.field_788 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 1219)));
      this.field_789 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 1220)));
      this.field_790 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 1221)));
      this.field_791 = new Icon[2];
      this.field_791[0] = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 1222)));
      this.field_791[1] = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 1223)));
      this.field_792 = false;
      this.field_793 = false;
      this.field_794 = -1;
      this.field_795 = -1;
      this.field_802 = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 1377)));
      this.field_451 = new class_58(this.field_1284.method_254("en", 4), this.field_1284.method_254("en", 5), (byte)1, (byte)0);
      this.field_452 = this.field_395 + this.field_1284.method_256("en", 3);
      this.field_453 = this.field_1284.method_254("en", 6);
      this.field_454 = this.field_1284.method_254("en", 7);
      this.field_455 = this.field_1284.method_254("en", 8);
      this.field_456 = this.field_1284.method_254("en", 9);
      this.field_457 = new String[3];
      this.field_457[0] = this.field_395 + this.field_1284.method_256("en", 10);
      this.field_457[1] = this.field_395 + this.field_1284.method_256("en", 13);
      this.field_457[2] = this.field_395 + this.field_1284.method_256("en", 16);
      this.field_458 = new int[3];
      this.field_458[0] = this.field_1284.method_254("en", 11);
      this.field_458[1] = this.field_1284.method_254("en", 14);
      this.field_458[2] = this.field_1284.method_254("en", 17);
      this.field_459 = new int[3];
      this.field_459[0] = this.field_1284.method_254("en", 12);
      this.field_459[1] = this.field_1284.method_254("en", 15);
      this.field_459[2] = this.field_1284.method_254("en", 18);
      this.field_460 = null;
      this.field_461 = null;
      this.field_463 = null;
      this.field_462 = null;
      field_1274.field_2793.setBounds(24, 572, 310, 21);
      field_1274.field_2793.setBorder(BorderFactory.createLineBorder(new Color(14870248)));
      field_1274.add(field_1274.field_2793);
      field_1274.field_2794.setBounds(680, 500, 70, 15);
      field_1274.field_2794.setForeground(new Color(11725047));
      field_1274.field_2794.setBorder(BorderFactory.createLineBorder(new Color(0)));
      field_1274.field_2795.setBounds(484, 330, 90, 15);
      field_1274.field_2795.setForeground(new Color(0));
      field_1274.field_2795.setBorder(BorderFactory.createLineBorder(new Color(14737632)));
      field_1274.field_2796.setBounds(575, 254, 67, 14);
      field_1274.field_2796.setForeground(new Color(0));
      field_1274.field_2796.setBorder(BorderFactory.createLineBorder(new Color(16777215)));
      this.field_685 = this.field_1281.method_502("en", 640);
      this.field_686 = this.field_1281.method_502("en", 641);
      this.field_687 = this.field_1281.method_502("en", 642);
      this.field_688 = this.field_1281.method_502("en", 643);
      this.field_689 = this.field_1281.method_502("en", 644);
      this.field_690 = this.field_1281.method_502("en", 645);
      this.field_691 = new class_63();
      this.field_691.method_567(30, 477, 340, 51, MastersOfDestiny.field_2845, MastersOfDestiny.field_2846);
      this.field_692 = this.field_1281.method_502("en", 908);
      this.field_693 = this.field_1281.method_502("en", 909);
      this.field_694 = this.field_1281.method_502("en", 910);
      this.field_695 = this.field_1281.method_502("en", 911);
      this.field_696 = this.field_1281.method_502("en", 912);
      this.field_697 = this.field_1281.method_502("en", 913);
      this.field_698 = new class_63();
      this.field_698.method_567(30, 434, 340, 34, MastersOfDestiny.field_2810, MastersOfDestiny.field_2811);
      if (this.field_700 != null) {
         this.field_698.method_569(this.field_700, 13960102, 13960102);
         this.field_698.method_571((byte)3);
         this.field_700 = null;
      }

      if (this.field_699 != null) {
         this.field_698.method_569(this.field_699, 16711680, 16711680);
         this.field_698.method_571((byte)3);
         this.field_699 = null;
      }

      this.field_725 = 0;
      this.field_727 = this.field_1281.method_503("en", 207);
      this.field_728 = this.field_1281.method_502("en", 725);
      this.field_729 = this.field_1281.method_502("en", 209);
      this.field_730 = this.field_1281.method_502("en", 210);
      this.field_726 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 609)));
      this.field_731 = this.field_1281.method_502("en", 318);
      this.field_732 = this.field_1281.method_502("en", 319);
      this.field_733 = this.field_1281.method_502("en", 320);
      this.field_734 = this.field_1281.method_502("en", 321);
      this.field_464 = new Icon[6];
      this.field_464[0] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 697)));
      this.field_464[1] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 706)));
      this.field_464[2] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 872)));
      this.field_464[3] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 703)));
      this.field_464[4] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 914)));
      this.field_464[5] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1250)));
      this.field_465 = new int[6];
      this.field_466 = new int[6];
      this.field_467 = new int[6];
      this.field_468 = new int[6];
      this.field_465[0] = this.field_1281.method_502("en", 713);
      this.field_466[0] = this.field_1281.method_502("en", 714);
      this.field_467[0] = this.field_1281.method_502("en", 715);
      this.field_468[0] = this.field_1281.method_502("en", 716);
      this.field_465[1] = this.field_1281.method_502("en", 717);
      this.field_466[1] = this.field_1281.method_502("en", 718);
      this.field_467[1] = this.field_1281.method_502("en", 719);
      this.field_468[1] = this.field_1281.method_502("en", 720);
      this.field_465[2] = this.field_1281.method_502("en", 873);
      this.field_466[2] = this.field_1281.method_502("en", 874);
      this.field_467[2] = this.field_1281.method_502("en", 875);
      this.field_468[2] = this.field_1281.method_502("en", 876);
      this.field_465[3] = this.field_1281.method_502("en", 721);
      this.field_466[3] = this.field_1281.method_502("en", 722);
      this.field_467[3] = this.field_1281.method_502("en", 723);
      this.field_468[3] = this.field_1281.method_502("en", 724);
      this.field_465[4] = this.field_1281.method_502("en", 915);
      this.field_466[4] = this.field_1281.method_502("en", 916);
      this.field_467[4] = this.field_1281.method_502("en", 917);
      this.field_468[4] = this.field_1281.method_502("en", 918);
      this.field_465[5] = this.field_1281.method_502("en", 717);
      this.field_466[5] = this.field_1281.method_502("en", 718);
      this.field_467[5] = this.field_1281.method_502("en", 719);
      this.field_468[5] = this.field_1281.method_502("en", 720);
      this.field_477 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 610)));
      this.field_478 = new int[6];
      this.field_478[0] = this.field_1281.method_502("en", 709);
      this.field_478[1] = this.field_1281.method_502("en", 710);
      this.field_478[2] = this.field_1281.method_502("en", 877);
      this.field_478[3] = this.field_1281.method_502("en", 711);
      this.field_478[4] = this.field_1281.method_502("en", 919);
      this.field_478[5] = this.field_1281.method_502("en", 1251);
      this.field_479 = this.field_1281.method_502("en", 712);
      this.field_480 = this.field_1281.method_502("en", 638);
      this.field_481 = this.field_1281.method_502("en", 639);
      this.field_741 = new String[6];
      this.field_741[0] = " Inventory";
      this.field_741[1] = " Quest Log";
      this.field_741[2] = "Char Stats";
      this.field_741[3] = "Buddy List";
      this.field_741[4] = "Player List";
      this.field_741[5] = "   Options";
      this.field_796 = new ImageIcon[4];
      this.field_796[0] = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 483)));
      this.field_796[1] = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 484)));
      this.field_796[2] = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 485)));
      this.field_796[3] = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 486)));
      this.field_482 = this.field_1281.method_502("en", 868);
      this.field_483 = this.field_1281.method_503("en", 869);
      this.field_484 = this.field_1281.method_502("en", 870);
      this.field_485 = this.field_1281.method_502("en", 871);

      try {
         InputStream var2 = this.getClass().getResourceAsStream("res/HUD/options/help.txt");
         if (var2 != null) {
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();

            int var4;
            while ((var4 = var2.read()) != -1) {
               var3.write(var4);
            }

            var2.close();
            String var5 = new String(var3.toByteArray(), "utf-8");
            class_62.method_563(var5);
            String[] var6 = var5.split("\n");
            this.field_684 = new String[var6.length];
            this.field_683 = new Vector();

            for (int var7 = 0; var7 < var6.length; var7++) {
               String[] var8 = var6[var7].split("\\|");
               this.field_684[var7] = var8[0];
               String[][] var9 = new String[var8.length - 1][2];

               for (int var10 = 1; var10 < var8.length; var10++) {
                  String[] var11 = var8[var10].split(">");
                  var9[var10 - 1][0] = var11[0];
                  var11[1] = var11[1].replaceAll("<", "\n");
                  var9[var10 - 1][1] = var11[1];
               }

               this.field_683.add(var9);
            }
         } else {
            class_62.method_563("tile graphics mapping null");
         }
      } catch (IOException var12) {
         class_62.method_563(var12.getMessage());
      }

      this.field_645 = new Icon[2];
      this.field_645[0] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1252)));
      this.field_645[1] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1253)));
      this.field_646 = 0;
      this.field_647 = this.field_1281.method_503("en", 1254);
      this.field_648 = this.field_1281.method_502("en", 1255);
      this.field_649 = this.field_1281.method_503("en", 1256);
      this.field_650 = this.field_1281.method_502("en", 1257);
      this.field_651 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1258)));
      this.field_652 = this.field_1281.method_502("en", 1259);
      this.field_653 = this.field_1281.method_502("en", 1260);
      this.field_654 = new Icon[2];
      this.field_654[0] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1261)));
      this.field_654[1] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1262)));
      this.field_655 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1263)));
      this.field_656 = this.field_1281.method_503("en", 1264);
      this.field_657 = this.field_1281.method_502("en", 1265);
      this.field_658 = class_3.field_20.method_23();
      this.field_659 = class_3.field_20.method_22();
      this.field_660 = this.field_1281.method_503("en", 1266);
      this.field_661 = this.field_1281.method_502("en", 1267);
      this.field_662 = this.field_1281.method_502("en", 1268);
      this.field_663 = this.field_1281.method_502("en", 1269);
      this.field_664 = 0;
      this.field_665 = -1;
      this.field_666 = this.field_1281.method_502("en", 1270);
      this.field_667 = this.field_1281.method_503("en", 1271);
      this.field_668 = this.field_1281.method_502("en", 1272);
      this.field_669 = this.field_1281.method_502("en", 1273);
      this.field_670 = this.field_1281.method_502("en", 1274);
      this.field_671 = this.field_1281.method_502("en", 1275);
      this.field_672 = this.field_1281.method_502("en", 1276);
      this.field_673 = this.field_1281.method_502("en", 1277);
      this.field_674 = this.field_1281.method_502("en", 1278);
      this.field_675 = this.field_1281.method_502("en", 1279);
      this.field_676 = this.field_1281.method_502("en", 1280);
      this.field_677 = this.field_1281.method_502("en", 1281);
      this.field_678 = this.field_1281.method_502("en", 1282);
      this.field_679 = 0;
      this.field_680 = 0;
      this.field_681 = new class_63();
      this.field_681
         .method_567(
            this.field_675 + 13,
            this.field_676 + MastersOfDestiny.field_2809.getHeight() / 2,
            this.field_677,
            this.field_678 - 25,
            MastersOfDestiny.field_2808,
            MastersOfDestiny.field_2815
         );
      this.field_682 = false;
      this.field_526 = new Icon[4];
      this.field_526[0] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 878)));
      this.field_526[1] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1211)));
      this.field_526[2] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1212)));
      this.field_526[3] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1213)));
      this.field_527 = this.field_1281.method_502("en", 879);
      this.field_528 = this.field_1281.method_502("en", 880);
      this.field_529 = this.field_1281.method_502("en", 896);
      this.field_530 = this.field_1281.method_503("en", 897);
      this.field_531 = this.field_1281.method_502("en", 898);
      this.field_532 = this.field_1281.method_502("en", 899);
      this.field_533 = this.field_1281.method_502("en", 900);
      this.field_534 = this.field_1281.method_502("en", 901);
      this.field_535 = this.field_1281.method_502("en", 902);
      this.field_536 = this.field_1281.method_502("en", 903);
      this.field_519 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 881)));
      this.field_522 = this.field_1281.method_503("en", 882);
      this.field_523 = this.field_1281.method_503("en", 883);
      this.field_524 = this.field_1281.method_502("en", 884);
      this.field_525 = this.field_1281.method_502("en", 885);
      this.field_520 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 904)));
      this.field_521 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 905)));
      this.field_537 = new Icon[2];
      this.field_537[0] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 891)));
      this.field_537[1] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 886)));
      this.field_540 = this.field_1281.method_503("en", 887);
      this.field_541 = this.field_1281.method_502("en", 888);
      this.field_542 = this.field_1281.method_503("en", 889);
      this.field_543 = this.field_1281.method_502("en", 890);
      this.field_544 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 892)));
      this.field_545 = this.field_1281.method_502("en", 893);
      this.field_546 = this.field_1281.method_502("en", 894);
      this.field_551 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 895)));
      this.field_559 = class_87.method_803();
      this.field_559.method_804((byte)6);
      this.field_560 = this.field_395 + this.field_1284.method_256("en", 906);
      this.field_701 = new Icon[3];
      this.field_701[0] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 704)));
      this.field_701[1] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 704)));
      this.field_701[2] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 705)));
      this.field_705 = new int[3];
      this.field_705[0] = this.field_1281.method_502("en", 726);
      this.field_705[1] = this.field_1281.method_502("en", 726);
      this.field_705[2] = this.field_1281.method_502("en", 279);
      this.field_706 = new int[3];
      this.field_706[0] = this.field_1281.method_502("en", 727);
      this.field_706[1] = this.field_1281.method_502("en", 728);
      this.field_706[2] = this.field_1281.method_502("en", 280);
      this.field_707 = new int[3];
      this.field_707[0] = this.field_1281.method_502("en", 729);
      this.field_707[1] = this.field_1281.method_502("en", 729);
      this.field_707[2] = this.field_1281.method_502("en", 281);
      this.field_708 = this.field_1281.method_502("en", 730);
      this.field_710 = this.field_1281.method_502("en", 731);
      this.field_711 = this.field_1281.method_502("en", 732);
      this.field_712 = this.field_1281.method_502("en", 733);
      this.field_713 = this.field_1281.method_502("en", 734);
      this.field_714 = this.field_1281.method_502("en", 735);
      this.field_718 = this.field_1281.method_502("en", 736);
      this.field_719 = this.field_1281.method_502("en", 737);
      this.field_720 = this.field_1281.method_502("en", 738);
      this.field_721 = this.field_1281.method_502("en", 739);
      this.field_722 = -1;
      this.field_486 = new Icon[2];
      this.field_486[0] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 742)));
      this.field_486[1] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 743)));
      this.field_487 = new int[2];
      this.field_487[0] = this.field_1281.method_502("en", 744);
      this.field_487[1] = this.field_1281.method_502("en", 745);
      this.field_488 = this.field_1281.method_502("en", 746);
      this.field_489 = new int[2];
      this.field_489[0] = this.field_1281.method_502("en", 747);
      this.field_489[1] = this.field_1281.method_502("en", 748);
      this.field_490 = this.field_1281.method_502("en", 749);
      this.field_497 = this.field_1281.method_502("en", 750);
      this.field_498 = this.field_1281.method_502("en", 751);
      this.field_499 = this.field_1281.method_502("en", 752);
      this.field_500 = this.field_1281.method_502("en", 753);
      this.field_501 = this.field_1281.method_502("en", 754);
      this.field_502 = this.field_1281.method_502("en", 755);
      this.field_503 = this.field_1281.method_502("en", 751);
      this.field_504 = this.field_1281.method_502("en", 752);
      this.field_505 = this.field_1281.method_502("en", 753);
      this.field_506 = this.field_1281.method_502("en", 754);
      this.field_509 = this.field_1281.method_502("en", 756);
      this.field_510 = this.field_1281.method_502("en", 757);
      this.field_511 = this.field_1281.method_502("en", 758);
      this.field_512 = this.field_1281.method_502("en", 759);
      this.field_513 = this.field_1281.method_502("en", 760);
      this.field_514 = this.field_1281.method_502("en", 761);
      this.field_561 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 920)));
      this.field_563 = this.field_1281.method_502("en", 921);
      this.field_564 = this.field_1284.method_257("en", 922);
      this.field_565 = this.field_1281.method_502("en", 923);
      this.field_566 = this.field_1281.method_502("en", 924);
      this.field_569 = this.field_1281.method_502("en", 925);
      this.field_570 = this.field_1281.method_502("en", 926);
      this.field_571 = this.field_1281.method_502("en", 927);
      this.field_572 = this.field_1281.method_502("en", 928);
      this.field_573 = this.field_1281.method_502("en", 929);
      this.field_576 = this.field_1281.method_502("en", 930);
      this.field_577 = this.field_1281.method_502("en", 931);
      this.field_578 = this.field_1281.method_502("en", 932);
      this.field_579 = this.field_1281.method_502("en", 933);
      this.field_580 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 934)));
      this.field_582 = this.field_1281.method_502("en", 935);
      this.field_583 = this.field_1281.method_502("en", 936);
      this.field_584 = this.field_1281.method_502("en", 937);
      this.field_585 = this.field_1281.method_502("en", 938);
      this.field_586 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 939)));
      this.field_589 = this.field_1284.method_257("en", 940);
      this.field_590 = this.field_1281.method_502("en", 941);
      this.field_591 = this.field_1281.method_502("en", 942);
      this.field_592 = this.field_1281.method_502("en", 943);
      this.field_644 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 980)));
      this.field_643 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 981)));
      this.field_593 = this.field_1284.method_257("en", 944);
      this.field_594 = this.field_1281.method_502("en", 945);
      this.field_595 = this.field_1281.method_502("en", 946);
      this.field_596 = this.field_1281.method_502("en", 947);
      this.field_597 = this.field_1281.method_502("en", 948);
      this.field_602 = this.field_1281.method_502("en", 949);
      this.field_603 = this.field_1281.method_502("en", 950);
      this.field_604 = this.field_1281.method_502("en", 951);
      this.field_605 = this.field_1281.method_502("en", 952);
      this.field_606 = new Icon[4];
      this.field_606[0] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 976)));
      this.field_606[1] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 977)));
      this.field_606[2] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 978)));
      this.field_606[3] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 979)));
      this.field_607 = 0;
      this.field_608 = this.field_1284.method_257("en", 953);
      this.field_609 = this.field_1281.method_502("en", 954);
      this.field_610 = this.field_1284.method_257("en", 955);
      this.field_611 = this.field_1281.method_502("en", 956);
      this.field_612 = this.field_1284.method_257("en", 957);
      this.field_613 = this.field_1284.method_257("en", 958);
      this.field_614 = this.field_1281.method_502("en", 959);
      this.field_615 = this.field_1281.method_502("en", 960);
      this.field_616 = this.field_1281.method_502("en", 961);
      this.field_617 = this.field_1284.method_257("en", 962);
      this.field_618 = this.field_1281.method_502("en", 963);
      this.field_619 = this.field_1281.method_502("en", 964);
      this.field_599 = new Vector();
      this.field_598 = new Vector();
      this.field_601 = 0;
      this.field_600 = 0;
      this.field_621 = 0;
      this.field_622 = 0;
      this.field_623 = this.field_612[0] - 2;
      this.field_624 = this.field_613[0] - 2;
      this.field_628 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 965)));
      this.field_629 = this.field_1281.method_502("en", 966);
      this.field_630 = this.field_1281.method_502("en", 967);
      this.field_631 = this.field_1284.method_257("en", 968);
      this.field_632 = this.field_1281.method_502("en", 969);
      this.field_633 = this.field_1284.method_257("en", 970);
      this.field_634 = this.field_1281.method_502("en", 971);
      this.field_635 = this.field_1281.method_502("en", 972);
      this.field_636 = this.field_1284.method_257("en", 973);
      this.field_637 = this.field_1281.method_502("en", 974);
      this.field_638 = this.field_1281.method_502("en", 975);
      this.field_736 = new Icon[4];
      this.field_736[0] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 702)));
      this.field_736[1] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 699)));
      this.field_736[2] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 701)));
      this.field_736[3] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 700)));
      this.field_735 = 0;
      this.field_737 = this.field_1284.method_257("en", 361);
      this.field_738 = this.field_1284.method_254("en", 362);
      this.field_739 = this.field_1284.method_257("en", 363);
      this.field_740 = this.field_1284.method_254("en", 364);
      this.field_742 = this.field_1284.method_257("en", 326);
      this.field_743 = this.field_1284.method_257("en", 327);
      this.field_744 = this.field_1284.method_257("en", 349);
      this.field_745 = this.field_1284.method_257("en", 350);
      this.field_746 = this.field_1284.method_254("en", 328);
      this.field_747 = this.field_1284.method_254("en", 329);
      this.field_751 = 0;
      this.field_748 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 293)));
      this.field_749 = this.field_742[0] - 2;
      this.field_750 = this.field_743[0] - 2;
      this.field_752 = this.field_1284.method_254("en", 330);
      this.field_753 = this.field_1284.method_257("en", 331);
      this.field_754 = this.field_1284.method_254("en", 332);
      this.field_755 = this.field_1284.method_254("en", 333);
      this.field_767 = class_87.method_803();
      this.field_767.method_804((byte)4);
      this.field_768 = this.field_395 + this.field_1284.method_256("en", 334);
      this.field_756 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1200)));
      this.field_757 = this.field_1284.method_254("en", 1201);
      this.field_758 = this.field_1284.method_254("en", 1202);
      this.field_759 = this.field_1284.method_254("en", 1203);
      this.field_760 = this.field_1284.method_254("en", 1204);
      this.field_761 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 881)));
      this.field_762 = -1;
      this.field_763 = -1L;
      this.field_764 = new String[6];
      this.field_764[0] = "You don't have such an item to use!";
      this.field_764[1] = "This item cannot be used in colony!";
      this.field_764[2] = "You cannot use this item to this target!";
      this.field_764[3] = "You don't have enough energy to use this item!";
      this.field_764[4] = "Your race cannot use this item!";
      this.field_764[5] = "You haven't reached the required level to use this item!";
      this.field_769 = null;
      this.field_770 = null;
      this.field_771 = 0;
      this.field_772 = 0;
      this.field_773 = true;
      this.field_800 = false;
      this.field_1299 = false;
      this.field_799 = false;
   }

   // $VF: renamed from: e (java.awt.Graphics) void
   public void method_293(Graphics var1) {
      switch (this.field_442) {
         case 1:
            this.method_309(var1);
            return;
         case 2:
            this.method_335(var1);
            return;
         case 3:
            this.method_322(var1);
            return;
         case 4:
            this.method_397(var1);
            return;
         case 5:
            this.method_344(var1);
            return;
         case 6:
            this.method_372(var1);
            return;
         case 7:
            this.method_406(var1);
            return;
         default:
            this.field_403.paintIcon(field_1274, var1, 0, 0);
            this.field_1285.method_560(var1, field_1274);
            var1.setFont(new Font(null, 1, 11));
            this.field_1285.method_561(var1, field_1274);
            this.field_1281.field_1548.paintIcon(field_1274, var1, -1, 430);
            this.field_802.paintIcon(field_1274, var1, 689, 542);
            this.field_691.method_572(var1, field_1274);
            this.field_698.method_572(var1, field_1274);
            if (this.field_476 != -1) {
               this.field_477.paintIcon(field_1274, var1, this.field_478[this.field_476], this.field_479);
            }

            if (this.field_475 != -1) {
               this.field_464[this.field_475].paintIcon(field_1274, var1, this.field_465[this.field_475] - 2, this.field_466[this.field_475]);
            }

            if (this.field_476 != -1) {
               var1.setColor(new Color(2304558));
               var1.fillRect(this.field_478[this.field_476] - 5, 519, 60, 15);
               var1.setColor(new Color(16777215));
               var1.setFont(MastersOfDestiny.field_2839);
               var1.drawString(this.field_741[this.field_476], this.field_478[this.field_476], 530);
            }

            if (this.field_725 != -1) {
               this.field_726.paintIcon(field_1274, var1, this.field_727[this.field_725] + 2, this.field_728);
            }

            if (this.field_475 == 3) {
               String[] var2 = this.field_1271.method_662();
               String[] var3 = this.field_1271.method_663();
               int var4 = var2.length + var3.length;
               var1.setColor(new Color(11725031));
               var1.setFont(MastersOfDestiny.field_2806);
               var1.drawString(var2.length + " Online", 684, 249);
               var1.setColor(new Color(13356237));
               var1.setFont(MastersOfDestiny.field_2806);
               var1.drawString(var3.length + " Offline", 684, 456);
               if (var4 - this.field_716 > field_717) {
                  if (this.field_715 >= this.field_716 && this.field_715 < this.field_716 + field_717 && var4 != 0) {
                     var1.setColor(new Color(9605778));
                     var1.fillRect(676, 255 + (this.field_715 - this.field_716) * 17, 111, 17);
                  }
               } else if (this.field_715 >= this.field_716 && this.field_715 < var4 - this.field_716 && var4 != 0) {
                  var1.setColor(new Color(9605778));
                  var1.fillRect(676, 255 + (this.field_715 - this.field_716) * 17, 111, 17);
               }

               for (int var5 = 0; var5 < var2.length; var5++) {
                  if (var5 >= this.field_716 && var5 < this.field_716 + field_717) {
                     var1.setColor(new Color(11725031));
                     var1.setFont(MastersOfDestiny.field_2810);
                     var1.drawString(var2[var5], 684, 269 + (var5 - this.field_716) * 17);
                  }
               }

               for (int var51 = 0; var51 < var3.length; var51++) {
                  if (var51 + var2.length >= this.field_716 && var51 + var2.length < this.field_716 + field_717) {
                     var1.setColor(new Color(13356237));
                     var1.setFont(MastersOfDestiny.field_2810);
                     var1.drawString(var3[var51], 684, 269 + (var51 + var2.length - this.field_716) * 17);
                  }
               }

               if (this.field_709 != -1) {
                  this.field_701[this.field_709].paintIcon(field_1274, var1, this.field_705[this.field_709] - 1, this.field_706[this.field_709] - 1);
               }

               if (this.field_722 != -1) {
                  if (var2.length - this.field_716 > field_717) {
                     if (this.field_722 >= this.field_716 && this.field_722 < this.field_716 + field_717 && var4 != 0) {
                        var1.setColor(new Color(16777215));
                        var1.fillRect(this.field_723 + 9, this.field_724 + 9, 77, 19);
                        var1.setColor(new Color(0));
                        var1.fillRect(this.field_723 + 10, this.field_724 + 10, 75, 17);
                        String var52 = this.field_1271.method_661(var2[this.field_722]);
                        var1.setColor(new Color(16777215));
                        var1.setFont(MastersOfDestiny.field_2808);
                        var1.drawString(var52, this.field_723 + 15, this.field_724 + 22);
                     }
                  } else if (var2.length - this.field_716 > 0
                     && var2.length - this.field_716 <= field_717
                     && this.field_722 >= this.field_716
                     && this.field_722 < var2.length
                     && var4 != 0) {
                     var1.setColor(new Color(16777215));
                     var1.fillRect(this.field_723 + 9, this.field_724 + 9, 77, 19);
                     var1.setColor(new Color(0));
                     var1.fillRect(this.field_723 + 10, this.field_724 + 10, 75, 17);
                     String var53 = this.field_1271.method_661(var2[this.field_722]);
                     var1.setColor(new Color(16777215));
                     var1.setFont(MastersOfDestiny.field_2808);
                     var1.drawString(var53, this.field_723 + 15, this.field_724 + 22);
                  }
               }
            }

            if (this.field_475 == 5) {
               this.field_645[this.field_646].paintIcon(field_1274, var1, this.field_647[this.field_646], this.field_648);
               if (this.field_646 == 0) {
                  var1.setColor(new Color(6710886));
                  if (this.field_664 >= this.field_679 && this.field_664 < this.field_679 + 8) {
                     var1.fillRect(this.field_671, this.field_672 + (this.field_664 - this.field_679) * 17, this.field_673, 17);
                  }

                  var1.setColor(new Color(16777215));
                  var1.setFont(MastersOfDestiny.field_2810);
                  if (this.field_684.length - this.field_679 <= 8) {
                     for (int var9 = this.field_679; var9 < this.field_684.length; var9++) {
                        var1.drawString(this.field_684[var9], 419, 370 + (var9 - this.field_679) * 17);
                     }
                  } else {
                     for (int var8 = this.field_679; var8 < 8 + this.field_679; var8++) {
                        var1.drawString(this.field_684[var8], 419, 370 + (var8 - this.field_679) * 17);
                     }
                  }

                  if (this.field_665 != -1) {
                     if (this.field_665 >= this.field_680 && this.field_665 < this.field_680 + 8) {
                        var1.setColor(new Color(6710886));
                        var1.fillRect(this.field_675, this.field_676 + (this.field_665 - this.field_680) * 17, this.field_677, 17);
                     }

                     var1.setColor(new Color(16777215));
                     var1.setFont(MastersOfDestiny.field_2810);
                     String[][] var10 = (String[][])this.field_683.get(this.field_664);
                     if (var10.length - this.field_680 > 8) {
                        for (int var24 = this.field_680; var24 < this.field_680 + 8; var24++) {
                           var1.drawString(var10[var24][0], 557, 370 + (var24 - this.field_680) * 17);
                        }
                     } else {
                        for (int var23 = this.field_680; var23 < var10.length; var23++) {
                           var1.drawString(var10[var23][0], 557, 370 + (var23 - this.field_680) * 17);
                        }
                     }
                  }

                  if (this.field_682) {
                     this.field_681.method_572(var1, field_1274);
                  }
               } else {
                  this.field_651.paintIcon(field_1274, var1, this.field_652, this.field_653);
                  var1.setColor(new Color(16777215));
                  var1.setFont(MastersOfDestiny.field_2810);
                  var1.drawString("Music Vol:", 435, 376);
                  var1.drawString("Sound:", 614, 376);
                  this.field_655.paintIcon(field_1274, var1, this.field_656[0], this.field_657);
                  this.field_655.paintIcon(field_1274, var1, this.field_656[1], this.field_657);
                  var1.drawString(this.field_658 + "", 534, 376);
                  var1.drawString(this.field_659 + "", 694, 376);
                  if (this.field_659 > 0) {
                     this.field_654[0].paintIcon(field_1274, var1, this.field_660[2], this.field_661);
                  }

                  if (this.field_659 < 9) {
                     this.field_654[1].paintIcon(field_1274, var1, this.field_660[3], this.field_661);
                  }

                  if (this.field_658 > 0) {
                     this.field_654[0].paintIcon(field_1274, var1, this.field_660[0], this.field_661);
                  }

                  if (this.field_658 < 9) {
                     this.field_654[1].paintIcon(field_1274, var1, this.field_660[1], this.field_661);
                  }
               }
            }

            if (this.field_475 == 4) {
               var1.setColor(new Color(11725031));
               var1.setFont(MastersOfDestiny.field_2806);
               var1.drawString(field_440, 684, 249);
               String[] var11 = this.field_1273.method_96();
               int var25 = var11.length;
               if (this.field_574 >= this.field_575 && this.field_574 < this.field_575 + field_568 && var25 != 0) {
                  var1.setColor(new Color(9605778));
                  var1.fillRect(676, 255 + (this.field_574 - this.field_575) * 17, 111, 17);
               }

               for (int var41 = 0; var41 < var11.length; var41++) {
                  if (var41 >= this.field_575 && var41 < this.field_575 + field_568) {
                     String[] var54 = var11[var41].split("\\|");
                     this.field_796[Integer.parseInt(var54[1]) - 1].paintIcon(field_1274, var1, 676, 257 + (var41 - this.field_575) * 17);
                     var1.setColor(new Color(0));
                     var1.setFont(MastersOfDestiny.field_2841);
                     var1.drawString(var54[2], 697, 268 + (var41 - this.field_575) * 17);
                     var1.setColor(new Color(11725031));
                     var1.setFont(MastersOfDestiny.field_2810);
                     var1.drawString(var54[0], 710, 269 + (var41 - this.field_575) * 17);
                  }
               }

               if (this.field_567 != -1) {
                  this.field_561.paintIcon(field_1274, var1, this.field_563 - 1, this.field_564[this.field_567]);
               }
            }

            if (this.field_581) {
               this.field_580.paintIcon(field_1274, var1, this.field_582, this.field_583);
               if (this.field_642) {
                  this.field_643.paintIcon(field_1274, var1, 416, 269);
               }

               if (this.field_641) {
                  this.field_643.paintIcon(field_1274, var1, 416, 191);
               }

               if (this.field_587) {
                  this.field_586.paintIcon(field_1274, var1, this.field_589[0] + 1, this.field_590);
               }

               if (this.field_588) {
                  this.field_644.paintIcon(field_1274, var1, this.field_589[0] + 1, this.field_590);
               }

               this.field_606[this.field_607].paintIcon(field_1274, var1, this.field_608[this.field_607], this.field_609);

               for (int var12 = 0; var12 < this.field_612.length; var12++) {
                  if (var12 + this.field_621 < this.field_421.field_3059[this.field_607].size()) {
                     ((class_30)this.field_421.field_3059[this.field_607].elementAt(var12 + this.field_621))
                        .method_234()
                        .method_181()
                        .paintIcon(field_1274, var1, this.field_612[var12], this.field_613[var12]);
                     var1.setColor(new Color(16777215));
                     var1.setFont(MastersOfDestiny.field_2839);
                     var1.drawString(
                        "" + ((class_30)this.field_421.field_3059[this.field_607].elementAt(var12 + this.field_621)).method_236(),
                        this.field_612[var12] + 1,
                        this.field_613[var12] + 9
                     );
                  }
               }

               for (int var13 = 0; var13 < this.field_599.size(); var13++) {
                  class_30 var26 = (class_30)this.field_599.get(var13);
                  var26.method_234().method_181().paintIcon(field_1274, var1, this.field_593[var13] - 1, this.field_595 - 1);
                  var1.setColor(new Color(0));
                  var1.setFont(MastersOfDestiny.field_2839);
                  var1.drawString("" + var26.method_236(), this.field_593[var13] + 1, this.field_595 + 9);
               }

               for (int var14 = 0; var14 < this.field_598.size(); var14++) {
                  if (this.field_598.get(var14) != null) {
                     class_30 var27 = (class_30)this.field_598.get(var14);
                     var27.method_234().method_181().paintIcon(field_1274, var1, this.field_593[var14] - 1, this.field_594 - 1);
                     var1.setColor(new Color(0));
                     var1.setFont(MastersOfDestiny.field_2839);
                     var1.drawString("" + var27.method_236(), this.field_593[var14] + 1, this.field_594 + 9);
                  }
               }

               var1.setColor(new Color(0));
               var1.setFont(MastersOfDestiny.field_2806);
               var1.drawString(this.field_600 + "", 575, 188);
               var1.setColor(new Color(16777215));
               var1.setFont(MastersOfDestiny.field_2806);
               var1.drawString("Balance: " + field_438, 562, 361);
               this.field_748.paintIcon(field_1274, var1, this.field_623 - 1, this.field_624);
               if (this.field_794 != -1) {
                  this.field_790.paintIcon(field_1274, var1, this.field_589[this.field_794], this.field_590);
               }

               var1.setFont(MastersOfDestiny.field_2806);
               if (this.field_767.field_2993 != null) {
                  this.field_767.method_793(var1, field_1274);
               }

               if (this.field_769 != null) {
                  this.field_769.method_234().method_181().paintIcon(field_1274, var1, this.field_771, this.field_772);
               }

               if (this.field_627) {
                  this.field_628.paintIcon(field_1274, var1, this.field_629, this.field_630);
                  if (this.field_795 != -1) {
                     this.field_791[this.field_795].paintIcon(field_1274, var1, this.field_631[this.field_795], this.field_632);
                  }
               }
            }

            if (this.field_475 == 1) {
               this.field_486[this.field_507].paintIcon(field_1274, var1, this.field_487[this.field_507] - 1, this.field_488);
               if (this.field_507 == 0) {
                  if (this.field_1272.method_86() > 0) {
                     var1.setColor(new Color(6710886));
                     var1.fillRect(this.field_509 - 2, this.field_510 + (this.field_493 - this.field_495) * 17, this.field_511 + 2, 17);
                     String[] var15 = this.field_1272.method_84(this.field_517);
                     if (var15.length - this.field_495 < 8) {
                        for (int var29 = this.field_495; var29 < var15.length; var29++) {
                           var1.setColor(new Color(16777215));
                           var1.setFont(MastersOfDestiny.field_2808);
                           if (var15[var29].length() > 15) {
                              String var43 = var15[var29].substring(0, 15) + "...";
                              var1.drawString(var43, this.field_509 + 15, this.field_510 + 12 + (var29 - this.field_495) * 17);
                           } else {
                              var1.drawString(var15[var29], this.field_509 + 15, this.field_510 + 12 + (var29 - this.field_495) * 17);
                           }
                        }
                     } else {
                        for (int var28 = this.field_495; var28 < 8 + this.field_495; var28++) {
                           var1.setColor(new Color(16777215));
                           var1.setFont(MastersOfDestiny.field_2808);
                           if (var15[var28].length() > 15) {
                              String var42 = var15[var28].substring(0, 15) + "...";
                              var1.drawString(var42, this.field_509 + 15, this.field_510 + 12 + (var28 - this.field_495) * 17);
                           } else {
                              var1.drawString(var15[var28], this.field_509 + 15, this.field_510 + 12 + (var28 - this.field_495) * 17);
                           }
                        }
                     }

                     if (this.field_517.size() > 0) {
                        long var30 = (Long)this.field_517.get(this.field_493);
                        String var55 = this.field_1272.method_83(var30);
                        if (var55 != null || var55 != "") {
                           var1.setColor(new Color(16777215));
                           var1.setFont(MastersOfDestiny.field_2808);
                           String[] var6 = this.method_295(var55, var1, 200);
                           this.field_516 = var6.length;
                           if (var6.length - this.field_515 < 7) {
                              for (int var7 = this.field_515; var7 < var6.length; var7++) {
                                 var1.drawString(var6[var7], this.field_513 + 20, this.field_514 + 20 + (var7 - this.field_515) * 17);
                              }
                           } else {
                              for (int var61 = this.field_515; var61 < this.field_515 + 7; var61++) {
                                 var1.drawString(var6[var61], this.field_513 + 20, this.field_514 + 20 + (var61 - this.field_515) * 17);
                              }
                           }
                        }
                     }
                  }
               } else if (this.field_507 == 1 && this.field_1272.method_87() > 0) {
                  var1.setColor(new Color(6710886));
                  var1.fillRect(this.field_509 - 2, this.field_510 + (this.field_494 - this.field_496) * 17 - 1, this.field_511 + 2, 17);
                  String[] var16 = this.field_1272.method_85(this.field_518);
                  if (var16.length - this.field_496 < 8) {
                     for (int var32 = this.field_495; var32 < var16.length; var32++) {
                        var1.setColor(new Color(16777215));
                        var1.setFont(MastersOfDestiny.field_2808);
                        if (var16[var32].length() > 15) {
                           String var45 = var16[var32].substring(0, 15) + "...";
                           var1.drawString(var45, this.field_509 + 15, this.field_510 + 12 + (var32 - this.field_496) * 17);
                        } else {
                           var1.drawString(var16[var32], this.field_509 + 15, this.field_510 + 12 + (var32 - this.field_496) * 17);
                        }
                     }
                  } else {
                     for (int var31 = this.field_496; var31 < 8 + this.field_496; var31++) {
                        var1.setColor(new Color(16777215));
                        var1.setFont(MastersOfDestiny.field_2808);
                        if (var16[var31].length() > 15) {
                           String var44 = var16[var31].substring(0, 15) + "...";
                           var1.drawString(var44, this.field_509 + 15, this.field_510 + 12 + (var31 - this.field_496) * 17);
                        } else {
                           var1.drawString(var16[var31], this.field_509 + 15, this.field_510 + 12 + (var31 - this.field_496) * 17);
                        }
                     }
                  }

                  if (this.field_518.size() > 0) {
                     long var33 = (Long)this.field_518.get(this.field_494);
                     String var56 = this.field_1272.method_83(var33);
                     if (var56 != null || var56 != "") {
                        var1.setColor(new Color(16777215));
                        var1.setFont(MastersOfDestiny.field_2808);
                        String[] var60 = this.method_295(var56, var1, 200);
                        if (var60.length - this.field_515 <= 7) {
                           for (int var62 = this.field_515; var62 < var60.length; var62++) {
                              var1.drawString(var60[var62], this.field_513 + 20, this.field_514 + 20 + (var62 - this.field_515) * 17);
                           }
                        } else {
                           for (int var63 = this.field_515; var63 < this.field_515 + 7; var63++) {
                              var1.drawString(var60[var63], this.field_513 + 20, this.field_514 + 20 + (var63 - this.field_515) * 17);
                           }
                        }
                     }
                  }
               }
            }

            if (this.field_475 == 0) {
               var1.setFont(MastersOfDestiny.field_2806);
               Enumeration var17 = this.field_421.field_3064.elements();

               while (var17.hasMoreElements()) {
                  var1.setColor(new Color(14277081));
                  class_30 var34 = (class_30)var17.nextElement();
                  long var46 = var34.method_242();
                  if (var46 > 0L && var46 <= 3L) {
                     var34.method_234()
                        .method_181()
                        .paintIcon(field_1274, var1, this.field_744[var34.method_242() - 1], this.field_745[var34.method_242() - 1]);
                  } else if (var46 > 4L) {
                     var34.method_234()
                        .method_181()
                        .paintIcon(field_1274, var1, this.field_744[var34.method_242() - 2], this.field_745[var34.method_242() - 2]);
                  }
               }

               this.field_736[this.field_735].paintIcon(field_1274, var1, this.field_737[this.field_735], this.field_738);
               int var35 = this.field_751 * this.field_742.length;

               for (int var47 = 0; var47 < this.field_743.length; var47++) {
                  for (int var57 = 0; var57 < this.field_742.length; var57++) {
                     if (var35 < this.field_421.field_3059[this.field_735].size()) {
                        ((class_30)this.field_421.field_3059[this.field_735].elementAt(var35))
                           .method_234()
                           .method_181()
                           .paintIcon(field_1274, var1, this.field_742[var57] - 1, this.field_743[var47]);
                        var1.setColor(new Color(16777215));
                        var1.setFont(MastersOfDestiny.field_2806);
                        var1.drawString(
                           "" + ((class_30)this.field_421.field_3059[this.field_735].elementAt(var35)).method_236(),
                           this.field_742[var57] + 2,
                           this.field_743[var47] + 9
                        );
                        if (this.field_735 == 3 && var35 == this.field_762) {
                           this.field_761.paintIcon(field_1274, var1, this.field_742[var57] - 1, this.field_743[var47]);
                        }
                     }

                     var35++;
                  }
               }

               var1.setColor(new Color(16777215));
               var1.setFont(MastersOfDestiny.field_2804);
               var1.drawString("Wt: " + this.field_421.method_821() + " / " + this.field_421.method_819(), 417, 476);
               var1.drawString("Sidos: " + field_438, 417, 491);
               var1.drawString("AP: " + this.field_421.method_833(), 417, 507);
               var1.drawString("Arm: " + this.field_421.method_839(), 488, 476);
               var1.drawString("Acc: " + this.field_421.method_841(), 488, 491);
               var1.drawString("Dmg: " + this.field_421.method_837(), 488, 507);
               if (this.field_735 == 3) {
                  this.field_756.paintIcon(field_1274, var1, this.field_757, this.field_758);
               }

               this.field_748.paintIcon(field_1274, var1, this.field_749 - 1, this.field_750);
               if (this.field_792) {
                  this.field_788.paintIcon(field_1274, var1, this.field_757 - 1, this.field_758 - 1);
               }

               var1.setFont(MastersOfDestiny.field_2806);
               if (this.field_767.field_2993 != null) {
                  this.field_767.method_793(var1, field_1274);
               }

               if (this.field_769 != null) {
                  this.field_769.method_234().method_181().paintIcon(field_1274, var1, this.field_771, this.field_772);
               }
            }

            if (this.field_475 == 2) {
               this.field_526[field_1214 - 1].paintIcon(field_1274, var1, this.field_527 - 1, this.field_528);
               var1.setFont(MastersOfDestiny.field_2810);
               var1.setColor(new Color(12441572));
               var1.drawString("Name: " + field_1213, 430, 420);
               var1.setFont(MastersOfDestiny.field_2806);
               var1.drawString("LV: " + this.field_421.method_843(), 430, 435);
               var1.drawString("HP: " + this.field_421.method_815() + "/" + this.field_421.method_817(), 430, 450);
               var1.drawString("Energy: " + this.field_421.method_825() + "/" + this.field_421.method_823(), 430, 465);
               var1.drawString("AP: " + this.field_421.method_833(), 430, 480);
               if (this.field_421.method_829() != 0L) {
                  var1.drawString("XP: " + this.field_421.method_827() + "/" + this.field_421.method_829(), 430, 495);
               } else {
                  var1.drawString("XP: " + this.field_421.method_827(), 430, 495);
               }

               var1.drawString("XP Debt: " + this.field_421.method_831(), 430, 510);
               var1.setFont(MastersOfDestiny.field_2806);
               var1.setColor(new Color(16777215));
               var1.drawString("Skill Point: " + this.field_421.method_835(), 550, 513);
               if (this.field_558 == 0) {
                  this.field_537[0].paintIcon(field_1274, var1, this.field_540[0] - 1, this.field_541 + 1);
                  if (this.field_553.size() - this.field_555 > 20) {
                     for (int var21 = this.field_555; var21 < this.field_555 + 20; var21++) {
                        class_7 var39 = (class_7)this.field_553.get(var21);
                        var39.method_66().paintIcon(field_1274, var1, this.field_522[var21 - this.field_555] - 1, this.field_523[var21 - this.field_555]);
                        this.field_551.paintIcon(field_1274, var1, this.field_522[var21 - this.field_555] + 32, this.field_523[var21 - this.field_555] + 33);
                        if (var39.method_74() == 0L) {
                           var1.setFont(MastersOfDestiny.field_2839);
                           var1.drawString("" + var39.method_47(), this.field_522[var21 - this.field_555] + 36, this.field_523[var21 - this.field_555] + 43);
                        } else {
                           this.field_521.paintIcon(field_1274, var1, this.field_522[var21 - this.field_555] + 33, this.field_523[var21 - this.field_555] + 33);
                        }
                     }
                  } else {
                     for (int var20 = this.field_555; var20 < this.field_553.size(); var20++) {
                        class_7 var38 = (class_7)this.field_553.get(var20);
                        var38.method_66().paintIcon(field_1274, var1, this.field_522[var20 - this.field_555] - 1, this.field_523[var20 - this.field_555]);
                        this.field_551.paintIcon(field_1274, var1, this.field_522[var20 - this.field_555] + 32, this.field_523[var20 - this.field_555] + 33);
                        if (var38.method_74() == 0L) {
                           var1.setFont(MastersOfDestiny.field_2839);
                           var1.drawString("" + var38.method_47(), this.field_522[var20 - this.field_555] + 36, this.field_523[var20 - this.field_555] + 43);
                        } else {
                           this.field_521.paintIcon(field_1274, var1, this.field_522[var20 - this.field_555] + 33, this.field_523[var20 - this.field_555] + 33);
                        }
                     }
                  }
               } else if (this.field_558 == 1) {
                  this.field_537[1].paintIcon(field_1274, var1, this.field_540[1] - 1, this.field_541 + 1);
                  if (this.field_552.size() - this.field_557 > 20) {
                     for (int var18 = this.field_557; var18 < this.field_557 + 20; var18++) {
                        class_6 var36 = (class_6)this.field_552.get(var18);
                        int var48 = (int)var36.method_35() - 1;
                        class_7 var58 = this.field_1276.method_30(var36.method_42(var48));
                        var58.method_66().paintIcon(field_1274, var1, this.field_522[var18 - this.field_557] - 1, this.field_523[var18 - this.field_557]);
                        this.field_551.paintIcon(field_1274, var1, this.field_522[var18 - this.field_557] + 32, this.field_523[var18 - this.field_557] + 33);
                        var1.setFont(MastersOfDestiny.field_2839);
                        var1.drawString("" + var58.method_47(), this.field_522[var18 - this.field_557] + 36, this.field_523[var18 - this.field_557] + 43);
                        if (!var36.method_37() || var58.method_62() > this.field_421.method_835()) {
                           var36.method_38(false);
                           this.field_520.paintIcon(field_1274, var1, this.field_522[var18 - this.field_557] - 1, this.field_523[var18 - this.field_557]);
                        } else if (this.field_550 == var18) {
                           this.field_519.paintIcon(field_1274, var1, this.field_522[var18 - this.field_557] - 1, this.field_523[var18 - this.field_557]);
                        }
                     }
                  } else {
                     for (int var19 = this.field_557; var19 < this.field_552.size(); var19++) {
                        class_6 var37 = (class_6)this.field_552.get(var19);
                        int var49 = (int)var37.method_35() - 1;
                        class_7 var59 = this.field_1276.method_30(var37.method_42(var49));
                        var59.method_66().paintIcon(field_1274, var1, this.field_522[var19 - this.field_557] - 1, this.field_523[var19 - this.field_557]);
                        this.field_551.paintIcon(field_1274, var1, this.field_522[var19 - this.field_557] + 32, this.field_523[var19 - this.field_557] + 33);
                        var1.setFont(MastersOfDestiny.field_2839);
                        var1.drawString("" + var59.method_47(), this.field_522[var19 - this.field_557] + 36, this.field_523[var19 - this.field_557] + 43);
                        if (!var37.method_37() || var59.method_62() > this.field_421.method_835()) {
                           var37.method_38(false);
                           this.field_520.paintIcon(field_1274, var1, this.field_522[var19 - this.field_557] - 1, this.field_523[var19 - this.field_557]);
                        } else if (this.field_550 == var19) {
                           this.field_519.paintIcon(field_1274, var1, this.field_522[var19 - this.field_557] - 1, this.field_523[var19 - this.field_557]);
                        }
                     }
                  }

                  if (this.field_793) {
                     this.field_789.paintIcon(field_1274, var1, this.field_533 - 1, this.field_534 - 1);
                  }
               }

               boolean var22 = false;

               for (int var40 = 0; var40 < this.field_552.size(); var40++) {
                  class_6 var50 = (class_6)this.field_552.get(var40);
                  if (var50.method_37()) {
                     var22 = true;
                     break;
                  }
               }

               if (var22) {
                  if (this.field_547 == 3) {
                     this.field_544.paintIcon(field_1274, var1, this.field_545 - 1, this.field_546 - 1);
                     this.field_547 = 0;
                  }

                  this.field_547++;
               }

               var1.setFont(MastersOfDestiny.field_2806);
               if (this.field_559.field_2993 != null) {
                  this.field_559.method_793(var1, field_1274);
               }
            }

            if (this.field_785) {
               this.field_786.paintIcon(field_1274, var1, this.field_775, this.field_776);
               this.field_774.method_572(var1, field_1274);
            }

            this.field_451.method_518(var1, field_1274);
      }
   }

   // $VF: renamed from: a (java.lang.String) java.lang.String
   public String method_294(String var1) {
      String var2 = "read failed";

      try {
         InputStream var3 = this.getClass().getResourceAsStream(var1);
         if (var3 != null) {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();

            int var5;
            while ((var5 = var3.read()) != -1) {
               var4.write(var5);
            }

            var3.close();
            var2 = new String(var4.toByteArray(), "utf-8");
         }

         class_62.method_563("read from item file = " + var2);
      } catch (IOException var6) {
         class_62.method_563(var6.getMessage());
      }

      return var2;
   }

   // $VF: renamed from: a (java.lang.String, java.awt.Graphics, int) java.lang.String[]
   public String[] method_295(String var1, Graphics var2, int var3) {
      Vector var4 = new Vector();
      FontMetrics var5 = var2.getFontMetrics();
      String[] var6 = var1.split(" ");
      String var7 = "";

      for (int var8 = 0; var8 < var6.length; var8++) {
         if (var5.stringWidth(var7 + var6[var8]) > var3) {
            var4.add(var7);
            var8--;
            var7 = "";
         } else {
            var7 = var7 + var6[var8] + " ";
         }
      }

      var4.add(var7);
      return var4.toArray(new String[var4.size()]);
   }

   // $VF: renamed from: a (long) void
   public void method_296(long var1) {
      switch (this.field_442) {
         case 1:
            return;
         case 2:
            return;
         case 3:
            return;
         case 4:
            this.method_398(this.field_1281, System.currentTimeMillis());
            return;
         case 5:
            this.method_345(this.field_1281, System.currentTimeMillis());
            return;
         case 6:
            return;
         case 7:
            this.method_407(this.field_1281, System.currentTimeMillis());
            return;
         default:
            if (this.field_421 != null) {
               ;
            }
      }
   }

   // $VF: renamed from: b (byte, java.lang.Object) void
   private void method_297(byte var1, Object var2) {
      this.field_442 = var1;
      class_62.method_563("here");
      if (this.field_442 == 0) {
         field_1274.add(field_1274.field_2793);
      } else {
         field_1274.remove(field_1274.field_2793);
         field_1274.remove(field_1274.field_2794);
         switch (this.field_442) {
            case 1:
               this.method_308(var2);
               break;
            case 2:
               this.method_333(var2);
               break;
            case 3:
               this.method_319(var2);
               break;
            case 4:
               this.method_396(var2);
               break;
            case 5:
               this.method_343(var2);
               break;
            case 6:
               this.method_371(var2);
               break;
            case 7:
               this.method_405(var2);
         }
      }
   }

   // $VF: renamed from: b (java.lang.String) void
   public void method_298(String var1) {
      this.field_435.write(var1);
      this.field_435.flush();
      class_62.method_563("sent: " + var1);
   }

   // $VF: renamed from: a (java.awt.event.MouseEvent) void
   public void method_299(MouseEvent var1) {
      switch (this.field_442) {
         case 1:
            this.method_313(var1);
            return;
         case 2:
            this.method_338(var1);
            return;
         case 3:
            this.method_323(var1);
            return;
         case 4:
            this.method_400(var1);
            return;
         case 5:
            this.method_347(var1);
            return;
         case 6:
            this.method_374(var1);
            return;
         case 7:
            this.method_409(var1);
            return;
         default:
            this.field_722 = -1;
            this.field_476 = -1;
            this.field_709 = -1;
            this.field_792 = false;
            this.field_793 = false;
            this.field_794 = -1;
            this.field_795 = -1;

            for (int var2 = 0; var2 < this.field_478.length; var2++) {
               if (var1.getX() >= this.field_478[var2] + 2
                  && var1.getX() <= this.field_478[var2] + this.field_480 + 2
                  && var1.getY() >= this.field_479 + 2
                  && var1.getY() <= this.field_479 + this.field_481 + 2) {
                  this.field_476 = var2;
                  return;
               }
            }

            this.field_725 = -1;

            for (int var8 = 0; var8 < this.field_727.length; var8++) {
               if (var1.getX() >= this.field_727[var8]
                  && var1.getX() <= this.field_727[var8] + this.field_729
                  && var1.getY() >= this.field_728
                  && var1.getY() <= this.field_728 + this.field_730) {
                  this.field_725 = var8;
                  return;
               }
            }

            if (this.field_429.e()) {
               int var9 = this.field_429.method_880();
               if (this.field_429.method_883(var1.getX(), var1.getY()) && var9 != this.field_429.method_880()) {
                  class_3.field_20.method_17("res/sound/mouse_effects/mouse_over_A.wav");
                  field_1274.repaint();
                  return;
               }
            }

            if (this.field_475 == 3) {
               if (var1.getX() >= this.field_705[0]
                  && var1.getX() <= this.field_705[0] + this.field_707[0]
                  && var1.getY() >= this.field_706[0]
                  && var1.getY() <= this.field_706[0] + this.field_708) {
                  this.field_709 = 0;
                  return;
               }

               if (var1.getX() >= this.field_705[1]
                  && var1.getX() <= this.field_705[1] + this.field_707[1]
                  && var1.getY() >= this.field_706[1]
                  && var1.getY() <= this.field_706[1] + this.field_708) {
                  this.field_709 = 1;
                  return;
               }

               if (var1.getX() >= this.field_705[2]
                  && var1.getX() <= this.field_705[2] + this.field_707[2]
                  && var1.getY() >= this.field_706[2]
                  && var1.getY() <= this.field_706[2] + this.field_708) {
                  this.field_709 = 2;
                  return;
               }

               if (var1.getX() >= this.field_718
                  && var1.getX() <= this.field_718 + this.field_720
                  && var1.getY() >= this.field_719
                  && var1.getY() <= this.field_719 + this.field_721) {
                  double var15 = Math.floor((var1.getY() - this.field_719) / 17);
                  this.field_722 = this.field_716 + (int)var15;
                  this.field_723 = var1.getX();
                  this.field_724 = var1.getY();
                  return;
               }
            }

            if (this.field_475 == 0) {
               if (this.field_735 == 3
                  && var1.getX() >= this.field_757
                  && var1.getX() <= this.field_757 + this.field_759
                  && var1.getY() >= this.field_758
                  && var1.getY() <= this.field_758 + this.field_760) {
                  this.field_792 = true;
                  return;
               }

               int var10 = this.field_751 * this.field_742.length;

               for (int var3 = 0; var3 < this.field_743.length; var3++) {
                  for (int var4 = 0; var4 < this.field_742.length; var4++) {
                     if (var1.getX() > this.field_742[var4]
                        && var1.getX() < this.field_742[var4] + this.field_746
                        && var1.getY() > this.field_743[var3]
                        && var1.getY() < this.field_743[var3] + this.field_747) {
                        this.field_749 = this.field_742[var4] - 2;
                        this.field_750 = this.field_743[var3] - 2;
                        if (var10 < this.field_421.field_3059[this.field_735].size()) {
                           this.field_767.method_804((byte)4);
                           int var5 = this.field_749 + this.field_746;
                           int var6 = this.field_750 + this.field_747 / 3 * 2;
                           if (var5 + 130 > 780) {
                              var5 -= 130;
                           }

                           if (var6 + 150 > 580) {
                              var6 -= 100;
                           }

                           this.field_767
                              .method_805(
                                 ((class_30)this.field_421.field_3059[this.field_735].elementAt(var10)).method_243(),
                                 var5,
                                 var6,
                                 150,
                                 88,
                                 MastersOfDestiny.field_2809,
                                 null
                              );
                           return;
                        }
                     }

                     var10++;
                  }
               }

               for (int var16 = 0; var16 < this.field_744.length; var16++) {
                  if (var1.getX() > this.field_744[var16]
                     && var1.getX() < this.field_744[var16] + this.field_746
                     && var1.getY() > this.field_745[var16]
                     && var1.getY() < this.field_745[var16] + this.field_747) {
                     this.field_749 = this.field_744[var16] - 2;
                     this.field_750 = this.field_745[var16] - 2;
                     if (var16 < 3) {
                        for (int var21 = 0; var21 < this.field_421.field_3064.size(); var21++) {
                           if (((class_30)this.field_421.field_3064.elementAt(var21)).method_240() == var16 + 1) {
                              this.field_767.method_804((byte)4);
                              int var26 = this.field_749 + this.field_746;
                              int var30 = this.field_750 + this.field_747 / 3 * 2;
                              if (var26 + 130 > 780) {
                                 var26 -= 130;
                              }

                              if (var30 + 100 > 580) {
                                 var30 -= 100;
                              }

                              this.field_767
                                 .method_805(
                                    ((class_30)this.field_421.field_3064.elementAt(var21)).method_243(),
                                    var26,
                                    var30,
                                    150,
                                    88,
                                    MastersOfDestiny.field_2809,
                                    null
                                 );
                              return;
                           }
                        }
                     } else {
                        for (int var20 = 0; var20 < this.field_421.field_3064.size(); var20++) {
                           if (((class_30)this.field_421.field_3064.elementAt(var20)).method_240() == var16 + 2) {
                              this.field_767.method_804((byte)4);
                              int var25 = this.field_749 + this.field_746;
                              int var29 = this.field_750 + this.field_747 / 3 * 2;
                              if (var25 + 130 > 780) {
                                 var25 -= 130;
                              }

                              if (var29 + 100 > 580) {
                                 var29 -= 100;
                              }

                              this.field_767
                                 .method_805(
                                    ((class_30)this.field_421.field_3064.elementAt(var20)).method_243(),
                                    var25,
                                    var29,
                                    150,
                                    88,
                                    MastersOfDestiny.field_2809,
                                    null
                                 );
                              return;
                           }
                        }
                     }
                  }
               }

               this.field_767.method_805(null, 575, 307, 130, 88, MastersOfDestiny.field_2809, null);
            }

            if (this.field_581) {
               if (var1.getX() >= this.field_589[0]
                  && var1.getX() <= this.field_589[0] + this.field_591
                  && var1.getY() >= this.field_590
                  && var1.getY() <= this.field_590 + this.field_592
                  && !this.field_588) {
                  this.field_794 = 0;
                  return;
               }

               if (var1.getX() >= this.field_589[1]
                  && var1.getX() <= this.field_589[1] + this.field_591
                  && var1.getY() >= this.field_590
                  && var1.getY() <= this.field_590 + this.field_592) {
                  this.field_794 = 1;
                  return;
               }

               if (this.field_627) {
                  if (var1.getX() >= this.field_631[0]
                     && var1.getX() <= this.field_631[0] + this.field_633[0]
                     && var1.getY() >= this.field_632
                     && var1.getY() <= this.field_632 + this.field_634) {
                     this.field_795 = 0;
                     return;
                  }

                  if (var1.getX() >= this.field_631[1]
                     && var1.getX() <= this.field_631[1] + this.field_633[1]
                     && var1.getY() >= this.field_632
                     && var1.getY() <= this.field_632 + this.field_634) {
                     this.field_795 = 1;
                     return;
                  }
               }

               for (int var11 = 0; var11 < this.field_612.length; var11++) {
                  if (var1.getX() > this.field_612[var11]
                     && var1.getX() < this.field_612[var11] + this.field_614
                     && var1.getY() > this.field_613[var11]
                     && var1.getY() < this.field_613[var11] + this.field_615) {
                     this.field_622 = var11 + this.field_621;
                     this.field_623 = this.field_612[var11] - 2;
                     this.field_624 = this.field_613[var11] - 2;
                     if (this.field_622 < this.field_421.field_3059[this.field_607].size()) {
                        this.field_767.method_804((byte)4);
                        int var17 = this.field_623 + this.field_614;
                        int var22 = this.field_624 + this.field_615 / 3 * 2;
                        if (var17 + 130 > 780) {
                           var17 -= 130;
                        }

                        if (var22 + 120 > 580) {
                           var22 -= 120;
                        }

                        this.field_767
                           .method_805(
                              ((class_30)this.field_421.field_3059[this.field_607].elementAt(this.field_622)).method_243(),
                              var17,
                              var22,
                              150,
                              88,
                              MastersOfDestiny.field_2809,
                              null
                           );
                        return;
                     }
                  }
               }

               this.field_767.method_805(null, 575, 307, 130, 88, MastersOfDestiny.field_2809, null);
            }

            if (this.field_475 == 2) {
               if (this.field_558 == 0) {
                  for (int var12 = 0; var12 < this.field_522.length; var12++) {
                     if (var1.getX() > this.field_522[var12]
                        && var1.getX() < this.field_522[var12] + this.field_524
                        && var1.getY() > this.field_523[var12]
                        && var1.getY() < this.field_523[var12] + this.field_525) {
                        if (var12 + this.field_555 < this.field_553.size()) {
                           this.field_554 = var12 + this.field_555;
                           this.field_559.method_804((byte)6);
                           class_7 var18 = (class_7)this.field_553.get(this.field_554);
                           int var23 = this.field_522[var12] + this.field_524;
                           int var27 = this.field_523[var12] + this.field_525 / 3 * 2;
                           if (var23 + 180 > 780) {
                              var23 -= 180;
                           }

                           if (var12 > 9) {
                              var27 -= 150;
                           }

                           this.field_559.method_805(var18.method_77(), var23, var27, 150, 88, MastersOfDestiny.field_2809, null);
                           return;
                        }

                        this.field_554 = -1;
                        this.field_559.method_805(null, 575, 307, 130, 88, MastersOfDestiny.field_2809, null);
                        return;
                     }
                  }

                  this.field_559.method_805(null, 575, 307, 130, 88, MastersOfDestiny.field_2809, null);
               } else if (this.field_558 == 1) {
                  if (var1.getX() > this.field_533
                     && var1.getX() < this.field_533 + this.field_535
                     && var1.getY() > this.field_534
                     && var1.getY() < this.field_534 + this.field_536) {
                     this.field_793 = true;
                     return;
                  }

                  for (int var13 = 0; var13 < this.field_522.length; var13++) {
                     if (var1.getX() > this.field_522[var13]
                        && var1.getX() < this.field_522[var13] + this.field_524
                        && var1.getY() > this.field_523[var13]
                        && var1.getY() < this.field_523[var13] + this.field_525
                        && var13 + this.field_557 < this.field_552.size()) {
                        this.field_556 = var13 + this.field_557;
                        this.field_559.method_804((byte)6);
                        class_6 var19 = (class_6)this.field_552.get(this.field_556);
                        int var24 = (int)var19.method_35() - 1;
                        class_7 var28 = this.field_1276.method_30(var19.method_42(var24));
                        int var31 = this.field_522[var13] + this.field_524;
                        int var7 = this.field_523[var13] + this.field_525 / 3 * 2;
                        if (var31 + 130 > 780) {
                           var31 -= 180;
                        }

                        if (var13 > 9) {
                           var7 -= 150;
                        }

                        this.field_559.method_805(var28.method_77(), var31, var7, 150, 88, MastersOfDestiny.field_2809, null);
                        return;
                     }
                  }

                  this.field_556 = -1;
                  this.field_559.method_805(null, 575, 307, 130, 88, MastersOfDestiny.field_2809, null);
               }
            }

            if (this.field_475 == 4) {
               this.field_567 = -1;

               for (int var14 = 0; var14 < this.field_564.length; var14++) {
                  if (var1.getX() > this.field_563
                     && var1.getX() < this.field_563 + this.field_565
                     && var1.getY() > this.field_564[var14]
                     && var1.getY() < this.field_564[var14] + this.field_566) {
                     this.field_567 = var14;
                     return;
                  }
               }
            }
      }
   }

   // $VF: renamed from: b (java.awt.event.MouseEvent) void
   public void method_300(MouseEvent var1) {
      switch (this.field_442) {
         case 1:
            this.method_314(var1);
            return;
         case 2:
            this.method_336(var1);
            return;
         case 3:
            this.method_324(var1);
            return;
         case 4:
            this.method_399(var1);
            return;
         case 5:
            this.method_346(var1);
            return;
         case 6:
            this.method_373(var1);
            return;
         case 7:
            this.method_408(var1);
            return;
         default:
            if (this.field_785) {
               if (var1.getX() >= this.field_777
                  && var1.getX() <= this.field_777 + this.field_779
                  && var1.getY() >= this.field_778[0]
                  && var1.getY() <= this.field_778[0] + this.field_780) {
                  this.field_774.method_571((byte)0);
                  return;
               }

               if (var1.getX() >= this.field_777
                  && var1.getX() <= this.field_777 + this.field_779
                  && var1.getY() >= this.field_778[1]
                  && var1.getY() <= this.field_778[1] + this.field_780) {
                  this.field_774.method_571((byte)1);
                  return;
               }

               if (var1.getX() >= this.field_781
                  && var1.getX() <= this.field_781 + this.field_783
                  && var1.getY() >= this.field_782
                  && var1.getY() <= this.field_782 + this.field_784) {
                  this.field_774.method_570();
                  if (this.field_787 == null) {
                     this.field_785 = false;
                  } else {
                     this.field_774.method_569(this.field_787, 16777215, 16777215);
                     this.field_774.method_571((byte)2);
                     this.field_1342 = true;
                     this.field_787 = null;
                  }

                  return;
               }
            }

            if (this.field_476 != -1) {
               if (this.field_476 == this.field_475) {
                  this.field_475 = -1;
                  if (this.field_476 == 3) {
                     field_1274.remove(field_1274.field_2794);
                  }
               } else {
                  this.field_475 = this.field_476;
                  if (this.field_475 == 3) {
                     this.field_716 = 0;
                     this.field_715 = 0;
                     field_1274.add(field_1274.field_2794);
                     field_1274.field_2794.requestFocusInWindow();
                  } else {
                     field_1274.remove(field_1274.field_2794);
                  }

                  if (this.field_475 == 1) {
                     this.field_517 = new Vector();
                     this.field_518 = new Vector();
                     this.field_495 = 0;
                     this.field_496 = 0;
                     this.field_493 = 0;
                     this.field_494 = 0;
                     this.field_507 = 0;
                     this.field_515 = 0;
                     this.field_516 = 0;
                     this.field_435.write("O1\n");
                     this.field_435.flush();
                     this.field_435.write("O3\n");
                     this.field_435.flush();
                     class_62.method_563("quest request sent");
                  }

                  if (this.field_475 == 0) {
                     this.field_735 = 0;
                     this.field_435.write("PSR\n");
                     this.field_435.flush();
                     this.field_435.write("WR\n");
                     this.field_435.flush();
                  }

                  if (this.field_475 == 2) {
                     this.field_554 = -1;
                     this.field_555 = 0;
                     this.field_556 = -1;
                     this.field_557 = 0;
                     this.field_558 = 0;
                     this.field_549 = -1;
                     this.field_550 = -1;
                     this.field_435.write("RC\n");
                     this.field_435.flush();
                     class_62.method_563("char skill request sent");
                  }

                  if (this.field_475 == 4) {
                     this.field_575 = 0;
                     this.field_574 = 0;
                     this.field_435.write("RPD\n");
                     this.field_435.flush();
                     class_62.method_563("planet player list request sent");
                  }

                  if (this.field_475 == 5) {
                     this.field_679 = 0;
                     this.field_680 = 0;
                     this.field_664 = 0;
                     this.field_665 = -1;
                     this.field_682 = false;
                  }
               }
            } else {
               if (this.field_475 == 3) {
                  if (var1.getX() >= this.field_705[0]
                     && var1.getX() <= this.field_705[0] + this.field_707[0]
                     && var1.getY() >= this.field_706[0]
                     && var1.getY() <= this.field_706[0] + this.field_708) {
                     String[] var35 = this.field_1271.method_662();
                     String[] var47 = this.field_1271.method_663();
                     if (this.field_715 < var35.length) {
                        String var54 = var35[this.field_715];
                        field_1274.field_2793.setText("/w " + var54 + " ");
                        field_1274.field_2793.requestFocusInWindow();
                     } else if (this.field_715 >= var35.length && this.field_715 < this.field_1271.method_664()) {
                        String var55 = var47[this.field_715 - var35.length];
                        field_1274.field_2793.setText("/w " + var55 + " ");
                        field_1274.field_2793.requestFocusInWindow();
                     }

                     return;
                  }

                  if (var1.getX() >= this.field_705[1]
                     && var1.getX() <= this.field_705[1] + this.field_707[1]
                     && var1.getY() >= this.field_706[1]
                     && var1.getY() <= this.field_706[1] + this.field_708) {
                     String[] var34 = this.field_1271.method_662();
                     String[] var46 = this.field_1271.method_663();
                     if (this.field_715 < var34.length) {
                        String var52 = var34[this.field_715];
                        this.field_435.write("BD|" + var52 + "\n");
                        this.field_435.flush();
                        this.field_1271.method_659(var52);
                        class_62.method_563("remove buddy " + var52);
                     } else if (this.field_715 >= var34.length && this.field_715 < this.field_1271.method_664()) {
                        String var53 = var46[this.field_715 - var34.length];
                        this.field_435.write("BD|" + var53 + "\n");
                        this.field_435.flush();
                        this.field_1271.method_659(var53);
                        class_62.method_563("remove buddy " + var53);
                     }

                     return;
                  }

                  if (var1.getX() >= this.field_705[2]
                     && var1.getX() <= this.field_705[2] + this.field_707[2]
                     && var1.getY() >= this.field_706[2]
                     && var1.getY() <= this.field_706[2] + this.field_708) {
                     String var33 = field_1274.field_2794.getText().trim();
                     class_62.method_563("add buddy " + var33);
                     if (!var33.equals("")) {
                        class_62.method_563("add buddy 2");
                        field_1274.field_2794.setText("");
                        this.field_435.write("BR|" + var33 + "| |\n");
                        this.field_435.flush();
                     }

                     class_62.method_563("add buddy");
                     return;
                  }

                  if (var1.getX() >= this.field_718
                     && var1.getX() <= this.field_718 + this.field_720
                     && var1.getY() >= this.field_719
                     && var1.getY() <= this.field_719 + this.field_721) {
                     double var32 = Math.floor((var1.getY() - this.field_719) / 17);
                     this.field_715 = this.field_716 + (int)var32;
                     return;
                  }

                  if (var1.getX() >= this.field_710
                     && var1.getX() <= this.field_710 + this.field_713
                     && var1.getY() >= this.field_711
                     && var1.getY() <= this.field_711 + this.field_714) {
                     if (this.field_716 > 0) {
                        this.field_716--;
                     }

                     if (this.field_715 >= this.field_716 + field_717) {
                        this.field_715 = this.field_716 + field_717 - 1;
                     }

                     return;
                  }

                  if (var1.getX() >= this.field_710
                     && var1.getX() <= this.field_710 + this.field_713
                     && var1.getY() >= this.field_712
                     && var1.getY() <= this.field_712 + this.field_714) {
                     if (this.field_716 + field_717 - 1 < this.field_1271.method_664()) {
                        this.field_716++;
                     }

                     if (this.field_715 < this.field_716) {
                        this.field_715 = this.field_716;
                     }

                     return;
                  }

                  if (var1.getX() >= this.field_482
                     && var1.getX() <= this.field_482 + this.field_484
                     && var1.getY() >= this.field_483[3]
                     && var1.getY() <= this.field_483[3] + this.field_485) {
                     this.field_475 = -1;
                     field_1274.remove(field_1274.field_2794);
                     return;
                  }
               }

               if (this.field_475 == 4) {
                  if (this.field_567 == 0) {
                     String[] var31 = this.field_1273.method_96();
                     String[] var45 = var31[this.field_574].split("\\|");
                     field_1274.field_2793.setText("/w " + var45[0] + " ");
                     field_1274.field_2793.requestFocusInWindow();
                     return;
                  }

                  if (this.field_567 == 1) {
                     String[] var30 = this.field_1273.method_95();
                     String var44 = var30[this.field_574];
                     this.field_435.write("T1|" + var44 + "\n");
                     this.field_435.flush();
                     return;
                  }

                  if (this.field_567 == 2) {
                     String[] var29 = this.field_1273.method_96();
                     String[] var43 = var29[this.field_574].split("\\|");
                     if (!var43.equals("")) {
                        class_62.method_563("add buddy 2");
                        field_1274.field_2794.setText("");
                        this.field_435.write("BR|" + var43[0] + "| |\n");
                        this.field_435.flush();
                     }

                     return;
                  }

                  if (var1.getX() >= this.field_576
                     && var1.getX() <= this.field_576 + this.field_578
                     && var1.getY() >= this.field_577
                     && var1.getY() <= this.field_577 + this.field_579) {
                     double var28 = Math.floor((var1.getY() - this.field_577) / 17);
                     this.field_574 = this.field_575 + (int)var28;
                     return;
                  }

                  if (var1.getX() >= this.field_569
                     && var1.getX() <= this.field_569 + this.field_572
                     && var1.getY() >= this.field_570
                     && var1.getY() <= this.field_570 + this.field_573) {
                     if (this.field_575 > 0) {
                        this.field_575--;
                     }

                     if (this.field_574 >= this.field_575 + field_568) {
                        this.field_574 = this.field_575 + field_568 - 1;
                     }

                     return;
                  }

                  if (var1.getX() >= this.field_569
                     && var1.getX() <= this.field_569 + this.field_572
                     && var1.getY() >= this.field_571
                     && var1.getY() <= this.field_571 + this.field_573) {
                     if (this.field_575 + field_568 - 1 < this.field_1273.method_97()) {
                        this.field_575++;
                     }

                     if (this.field_574 < this.field_575) {
                        this.field_574 = this.field_575;
                     }

                     return;
                  }

                  if (var1.getX() >= this.field_482
                     && var1.getX() <= this.field_482 + this.field_484
                     && var1.getY() >= this.field_483[4]
                     && var1.getY() <= this.field_483[4] + this.field_485) {
                     this.field_475 = -1;
                     return;
                  }
               }

               if (this.field_581) {
                  if (this.field_627) {
                     if (var1.getX() >= this.field_635
                        && var1.getX() <= this.field_635 + this.field_637
                        && var1.getY() >= this.field_636[1]
                        && var1.getY() <= this.field_636[1] + this.field_638) {
                        int var26 = Integer.parseInt(field_1274.field_2795.getText().trim());
                        if (var26 > 1) {
                           var26--;
                        } else {
                           var26 = 1;
                        }

                        field_1274.field_2795.setText("" + var26);
                        return;
                     }

                     if (var1.getX() >= this.field_635
                        && var1.getX() <= this.field_635 + this.field_637
                        && var1.getY() >= this.field_636[0]
                        && var1.getY() <= this.field_636[0] + this.field_638) {
                        int var24 = Integer.parseInt(field_1274.field_2795.getText().trim());
                        int var42 = ((class_30)this.field_421.field_3059[this.field_607].elementAt(this.field_626 + this.field_621)).method_236();
                        if (var24 < var42) {
                           var24++;
                        } else {
                           var24 = var42;
                        }

                        field_1274.field_2795.setText("" + var24);
                        return;
                     }

                     if (var1.getX() >= this.field_631[0]
                        && var1.getX() <= this.field_631[0] + this.field_633[0]
                        && var1.getY() >= this.field_632
                        && var1.getY() <= this.field_632 + this.field_634) {
                        this.field_795 = -1;
                        field_1274.method_760();
                        return;
                     }

                     if (var1.getX() >= this.field_631[1]
                        && var1.getX() <= this.field_631[1] + this.field_633[1]
                        && var1.getY() >= this.field_632
                        && var1.getY() <= this.field_632 + this.field_634) {
                        this.field_627 = false;
                        this.field_625 = -1;
                        this.field_639 = null;
                        this.field_795 = -1;
                        field_1274.remove(field_1274.field_2795);
                        field_1274.field_2795.setText("1");
                        return;
                     }
                  } else {
                     if (var1.getX() >= this.field_589[0]
                        && var1.getX() <= this.field_589[0] + this.field_591
                        && var1.getY() >= this.field_590
                        && var1.getY() <= this.field_590 + this.field_592
                        && !this.field_587
                        && !this.field_588) {
                        this.field_587 = true;

                        for (int var10 = 0; var10 < this.field_599.size(); var10++) {
                           if (this.field_599.get(var10) != null) {
                              class_30 var36 = (class_30)this.field_599.get(var10);
                              long var48 = var36.method_234().method_179();
                              int var6 = var36.method_236();
                              this.field_435.write("T8|" + this.field_620 + "|" + var48 + "|" + var6 + "\n");
                              this.field_435.flush();
                              class_62.method_563("sent T8|" + this.field_620 + "|" + var48 + "|" + var6);
                           }
                        }

                        String var11 = field_1274.field_2796.getText().trim();
                        this.field_601 = 0;
                        if (var11 != null) {
                           this.field_601 = Integer.parseInt(var11);
                        }

                        if (this.field_601 > (int)field_438) {
                           this.field_601 = (int)field_438;
                        }

                        if (this.field_601 < 0) {
                           this.field_601 = 0;
                        }

                        field_438 = field_438 - this.field_601;
                        this.field_435.write("T16|" + this.field_620 + "|" + this.field_601 + "\n");
                        this.field_435.flush();
                        class_62.method_563("sent T16|" + this.field_620 + "|" + this.field_601);
                        return;
                     }

                     if (var1.getX() >= this.field_589[0]
                        && var1.getX() <= this.field_589[0] + this.field_591
                        && var1.getY() >= this.field_590
                        && var1.getY() <= this.field_590 + this.field_592
                        && this.field_587
                        && !this.field_588) {
                        this.field_588 = true;
                        this.field_587 = false;
                        this.field_642 = true;
                        this.field_794 = -1;
                        this.field_435.write("T12|" + this.field_620 + "\n");
                        this.field_435.flush();
                        return;
                     }

                     if (var1.getX() >= this.field_589[1]
                        && var1.getX() <= this.field_589[1] + this.field_591
                        && var1.getY() >= this.field_590
                        && var1.getY() <= this.field_590 + this.field_592) {
                        this.field_581 = false;
                        this.field_641 = false;
                        this.field_642 = false;
                        this.field_588 = false;

                        for (int var9 = 0; var9 < this.field_599.size(); var9++) {
                           class_30 var3 = (class_30)this.field_599.get(var9);
                           int var4 = this.field_421.field_3059[var3.method_234().method_193()].indexOf(var3);
                           if (var4 == -1) {
                              this.field_421.field_3059[var3.method_234().method_193()].add((class_30)var3.clone());
                           } else {
                              ((class_30)this.field_421.field_3059[var3.method_234().method_193()].elementAt(var4))
                                 .method_235(
                                    ((class_30)this.field_421.field_3059[var3.method_234().method_193()].elementAt(var4)).method_236() + var3.method_236()
                                 );
                           }
                        }

                        this.field_599 = new Vector();
                        this.field_598 = new Vector();
                        this.field_587 = false;
                        field_438 = field_438 + this.field_601;
                        this.field_601 = 0;
                        this.field_600 = 0;
                        field_1274.remove(field_1274.field_2796);
                        this.field_607 = 0;
                        this.field_698.method_569("Trade cancelled", 7549, 7549);
                        this.field_698.method_571((byte)3);
                        this.field_435.write("T15|" + this.field_620 + "\n");
                        this.field_435.flush();
                        this.field_620 = null;
                        return;
                     }

                     for (int var2 = 0; var2 < this.field_608.length; var2++) {
                        if (var1.getX() >= this.field_608[var2]
                           && var1.getX() <= this.field_608[var2] + this.field_610[var2]
                           && var1.getY() >= this.field_609
                           && var1.getY() <= this.field_609 + this.field_611) {
                           this.field_607 = var2;
                           this.field_621 = 0;
                           this.field_622 = 0;
                           this.field_623 = this.field_612[0] - 2;
                           this.field_624 = this.field_613[0] - 2;
                           return;
                        }
                     }

                     for (int var8 = 0; var8 < this.field_617.length; var8++) {
                        if (var1.getX() >= this.field_616
                           && var1.getX() <= this.field_616 + this.field_618
                           && var1.getY() >= this.field_617[var8]
                           && var1.getY() <= this.field_617[var8] + this.field_619) {
                           switch (var8) {
                              case 0:
                                 if (this.field_621 > 0) {
                                    this.field_621 -= 5;
                                 }

                                 return;
                              case 1:
                                 if (this.field_621 + 10 < this.field_421.field_3059[this.field_607].size()) {
                                    this.field_621 += 5;
                                 }

                                 return;
                           }
                        }
                     }
                  }

                  if (var1.getX() >= this.field_602
                     && var1.getX() <= this.field_602 + this.field_604
                     && var1.getY() >= this.field_603
                     && var1.getY() <= this.field_603 + this.field_605) {
                     this.field_581 = false;
                     this.field_641 = false;
                     this.field_642 = false;
                     this.field_588 = false;

                     for (int var23 = 0; var23 < this.field_599.size(); var23++) {
                        class_30 var41 = (class_30)this.field_599.get(var23);
                        int var51 = this.field_421.field_3059[var41.method_234().method_193()].indexOf(var41);
                        if (var51 == -1) {
                           this.field_421.field_3059[var41.method_234().method_193()].add((class_30)var41.clone());
                        } else {
                           ((class_30)this.field_421.field_3059[var41.method_234().method_193()].elementAt(var51))
                              .method_235(
                                 ((class_30)this.field_421.field_3059[var41.method_234().method_193()].elementAt(var51)).method_236() + var41.method_236()
                              );
                        }
                     }

                     this.field_599 = new Vector();
                     this.field_598 = new Vector();
                     this.field_587 = false;
                     field_438 = field_438 + this.field_601;
                     this.field_601 = 0;
                     this.field_600 = 0;
                     field_1274.remove(field_1274.field_2796);
                     this.field_607 = 0;
                     this.field_698.method_569("Trade cancelled", 7549, 7549);
                     this.field_698.method_571((byte)3);
                     this.field_435.write("T15|" + this.field_620 + "\n");
                     this.field_435.flush();
                     this.field_620 = null;
                     return;
                  }
               }

               if (this.field_475 == 5) {
                  if (var1.getX() >= this.field_647[0]
                     && var1.getX() <= this.field_647[0] + this.field_649[0]
                     && var1.getY() >= this.field_648
                     && var1.getY() <= this.field_648 + this.field_650) {
                     this.field_646 = 0;
                     return;
                  }

                  if (var1.getX() >= this.field_647[1]
                     && var1.getX() <= this.field_647[1] + this.field_649[1]
                     && var1.getY() >= this.field_648
                     && var1.getY() <= this.field_648 + this.field_650) {
                     if (this.field_646 == 0) {
                        this.field_682 = false;
                        this.field_665 = -1;
                        this.field_664 = 0;
                        this.field_679 = 0;
                        this.field_680 = 0;
                     }

                     this.field_646 = 1;
                     return;
                  }

                  if (this.field_646 == 0) {
                     if (var1.getX() >= this.field_671
                        && var1.getX() <= this.field_671 + this.field_673
                        && var1.getY() >= this.field_672
                        && var1.getY() <= this.field_672 + this.field_674) {
                        int var14 = (int)Math.floor((var1.getY() - this.field_672) / 17);
                        if (var14 < this.field_684.length - this.field_679) {
                           this.field_664 = var14 + this.field_679;
                           this.field_665 = 0;
                           this.field_682 = false;
                        }

                        return;
                     }

                     if (var1.getX() >= this.field_675
                        && var1.getX() <= this.field_675 + this.field_677
                        && var1.getY() >= this.field_676
                        && var1.getY() <= this.field_676 + this.field_678
                        && !this.field_682) {
                        int var13 = (int)Math.floor((var1.getY() - this.field_676) / 17);
                        String[][] var37 = (String[][])this.field_683.get(this.field_664);
                        if (var13 < var37.length - this.field_680) {
                           this.field_665 = var13 + this.field_680;
                           this.field_681.method_570();
                           class_62.method_563(var37[this.field_665][1]);
                           this.field_681.method_569(var37[this.field_665][1], 16777215, 16777215);
                           this.field_681.method_571((byte)2);
                           this.field_665 = -1;
                           this.field_682 = true;
                        }

                        return;
                     }

                     if (var1.getX() >= this.field_666
                        && var1.getX() <= this.field_666 + this.field_668
                        && var1.getY() >= this.field_667[0]
                        && var1.getY() <= this.field_667[0] + this.field_669) {
                        if (this.field_679 > 0) {
                           this.field_679--;
                        }

                        return;
                     }

                     if (var1.getX() >= this.field_666
                        && var1.getX() <= this.field_666 + this.field_668
                        && var1.getY() >= this.field_667[1]
                        && var1.getY() <= this.field_667[1] + this.field_669) {
                        if (this.field_684.length - this.field_679 > 8) {
                           this.field_679++;
                        }

                        return;
                     }

                     if (var1.getX() >= this.field_670
                        && var1.getX() <= this.field_670 + this.field_668
                        && var1.getY() >= this.field_667[0]
                        && var1.getY() <= this.field_667[0] + this.field_669
                        && this.field_665 != -1) {
                        if (this.field_680 > 0) {
                           this.field_680--;
                        }

                        return;
                     }

                     if (var1.getX() >= this.field_670
                        && var1.getX() <= this.field_670 + this.field_668
                        && var1.getY() >= this.field_667[1]
                        && var1.getY() <= this.field_667[1] + this.field_669
                        && this.field_665 != -1) {
                        int var12 = ((String[][])this.field_683.get(this.field_664)).length;
                        if (var12 - this.field_680 > 8) {
                           this.field_680++;
                        }

                        return;
                     }

                     if (var1.getX() >= this.field_670
                        && var1.getX() <= this.field_670 + this.field_668
                        && var1.getY() >= this.field_667[0]
                        && var1.getY() <= this.field_667[0] + this.field_669
                        && this.field_682) {
                        this.field_681.method_571((byte)0);
                        return;
                     }

                     if (var1.getX() >= this.field_670
                        && var1.getX() <= this.field_670 + this.field_668
                        && var1.getY() >= this.field_667[1]
                        && var1.getY() <= this.field_667[1] + this.field_669
                        && this.field_682) {
                        this.field_681.method_571((byte)1);
                        return;
                     }
                  } else {
                     if (var1.getX() >= this.field_660[0]
                        && var1.getX() <= this.field_660[0] + this.field_662
                        && var1.getY() >= this.field_661
                        && var1.getY() <= this.field_661 + this.field_663) {
                        if (this.field_658 > 0) {
                           this.field_658--;
                           class_3.field_20.method_21(this.field_658);
                        }

                        return;
                     }

                     if (var1.getX() >= this.field_660[1]
                        && var1.getX() <= this.field_660[1] + this.field_662
                        && var1.getY() >= this.field_661
                        && var1.getY() <= this.field_661 + this.field_663) {
                        if (this.field_658 < 9) {
                           this.field_658++;
                           class_3.field_20.method_21(this.field_658);
                        }

                        return;
                     }

                     if (var1.getX() >= this.field_660[2]
                        && var1.getX() <= this.field_660[2] + this.field_662
                        && var1.getY() >= this.field_661
                        && var1.getY() <= this.field_661 + this.field_663) {
                        if (this.field_659 > 0) {
                           this.field_659--;
                           class_3.field_20.method_20(this.field_659);
                        }

                        return;
                     }

                     if (var1.getX() >= this.field_660[3]
                        && var1.getX() <= this.field_660[3] + this.field_662
                        && var1.getY() >= this.field_661
                        && var1.getY() <= this.field_661 + this.field_663) {
                        if (this.field_659 < 9) {
                           this.field_659++;
                           class_3.field_20.method_20(this.field_659);
                        }

                        return;
                     }
                  }

                  if (var1.getX() >= this.field_482
                     && var1.getX() <= this.field_482 + this.field_484
                     && var1.getY() >= this.field_483[5]
                     && var1.getY() <= this.field_483[5] + this.field_485) {
                     this.field_475 = -1;
                     this.field_664 = 0;
                     this.field_665 = -1;
                     this.field_679 = 0;
                     this.field_680 = 0;
                     this.field_682 = false;
                     return;
                  }
               }

               if (this.field_475 == 1) {
                  if (var1.getX() >= this.field_487[0]
                     && var1.getX() <= this.field_487[0] + this.field_489[0]
                     && var1.getY() >= this.field_488
                     && var1.getY() <= this.field_488 + this.field_490) {
                     if (this.field_507 != 0) {
                        this.field_495 = 0;
                        this.field_496 = 0;
                        this.field_493 = 0;
                        this.field_494 = 0;
                        this.field_515 = 0;
                     }

                     this.field_507 = 0;
                     return;
                  }

                  if (var1.getX() >= this.field_487[1]
                     && var1.getX() <= this.field_487[1] + this.field_489[1]
                     && var1.getY() >= this.field_488
                     && var1.getY() <= this.field_488 + this.field_490) {
                     if (this.field_507 != 1) {
                        this.field_495 = 0;
                        this.field_496 = 0;
                        this.field_493 = 0;
                        this.field_494 = 0;
                        this.field_515 = 0;
                     }

                     this.field_507 = 1;
                     return;
                  }

                  if (var1.getX() >= this.field_482
                     && var1.getX() <= this.field_482 + this.field_484
                     && var1.getY() >= this.field_483[1]
                     && var1.getY() <= this.field_483[1] + this.field_485) {
                     this.field_475 = -1;
                     return;
                  }

                  if (this.field_507 == 0) {
                     if (var1.getX() >= this.field_497
                        && var1.getX() <= this.field_497 + this.field_500
                        && var1.getY() >= this.field_498
                        && var1.getY() <= this.field_498 + this.field_501) {
                        if (this.field_495 > 0) {
                           this.field_495--;
                        }

                        if (this.field_493 >= this.field_495 + this.field_508) {
                           this.field_493 = this.field_495 + this.field_508 - 1;
                        }

                        return;
                     }

                     if (var1.getX() >= this.field_497
                        && var1.getX() <= this.field_497 + this.field_500
                        && var1.getY() >= this.field_499
                        && var1.getY() <= this.field_499 + this.field_501) {
                        if (this.field_495 + this.field_508 < this.field_1272.method_86()) {
                           this.field_495++;
                        }

                        if (this.field_493 < this.field_495) {
                           this.field_493 = this.field_495;
                        }

                        return;
                     }

                     if (var1.getX() >= this.field_509
                        && var1.getX() <= this.field_509 + this.field_511
                        && var1.getY() >= this.field_510
                        && var1.getY() <= this.field_510 + this.field_512) {
                        double var15 = Math.floor((var1.getY() - this.field_510) / 17);
                        this.field_493 = this.field_495 + (int)var15;
                        class_62.method_563("Current Quest Index = " + this.field_493);
                        return;
                     }

                     if (var1.getX() >= this.field_502
                        && var1.getX() <= this.field_502 + this.field_505
                        && var1.getY() >= this.field_503
                        && var1.getY() <= this.field_503 + this.field_506) {
                        if (this.field_515 > 0) {
                           this.field_515--;
                        }

                        return;
                     }

                     if (var1.getX() >= this.field_502
                        && var1.getX() <= this.field_502 + this.field_505
                        && var1.getY() >= this.field_504
                        && var1.getY() <= this.field_504 + this.field_506) {
                        if (this.field_515 + 7 < this.field_516) {
                           this.field_515++;
                        }

                        return;
                     }
                  } else if (this.field_507 == 1) {
                     if (var1.getX() >= this.field_497
                        && var1.getX() <= this.field_497 + this.field_500
                        && var1.getY() >= this.field_498
                        && var1.getY() <= this.field_498 + this.field_501) {
                        if (this.field_496 > 0) {
                           this.field_496--;
                        }

                        if (this.field_494 >= this.field_496 + this.field_508) {
                           this.field_494 = this.field_496 + this.field_508 - 1;
                        }

                        return;
                     }

                     if (var1.getX() >= this.field_497
                        && var1.getX() <= this.field_497 + this.field_500
                        && var1.getY() >= this.field_499
                        && var1.getY() <= this.field_499 + this.field_501) {
                        if (this.field_496 + this.field_508 < this.field_1272.method_87()) {
                           this.field_496++;
                        }

                        if (this.field_494 < this.field_496) {
                           this.field_494 = this.field_496;
                        }

                        return;
                     }

                     if (var1.getX() >= this.field_509
                        && var1.getX() <= this.field_509 + this.field_511
                        && var1.getY() >= this.field_510
                        && var1.getY() <= this.field_510 + this.field_512) {
                        double var22 = Math.floor((var1.getY() - this.field_510) / 17);
                        this.field_494 = this.field_496 + (int)var22;
                        class_62.method_563("Completed Quest Index = " + this.field_494);
                        return;
                     }

                     if (var1.getX() >= this.field_502
                        && var1.getX() <= this.field_502 + this.field_505
                        && var1.getY() >= this.field_503
                        && var1.getY() <= this.field_503 + this.field_506) {
                        if (this.field_515 > 0) {
                           this.field_515--;
                        }

                        return;
                     }

                     if (var1.getX() >= this.field_502
                        && var1.getX() <= this.field_502 + this.field_505
                        && var1.getY() >= this.field_504
                        && var1.getY() <= this.field_504 + this.field_506) {
                        if (this.field_515 + 7 < this.field_516) {
                           this.field_515++;
                        }

                        return;
                     }
                  }
               }

               if (this.field_475 == 0) {
                  for (int var16 = 0; var16 < this.field_737.length; var16++) {
                     if (var1.getX() >= this.field_737[var16]
                        && var1.getX() <= this.field_737[var16] + this.field_739[var16]
                        && var1.getY() >= this.field_738
                        && var1.getY() <= this.field_738 + this.field_740) {
                        this.field_735 = var16;
                        this.field_751 = 0;
                        this.field_749 = this.field_742[0] - 2;
                        this.field_750 = this.field_743[0] - 2;
                        return;
                     }
                  }

                  if (this.field_735 == 3) {
                     int var17 = this.field_751 * this.field_742.length;

                     for (int var38 = 0; var38 < this.field_743.length; var38++) {
                        for (int var49 = 0; var49 < this.field_742.length; var49++) {
                           if (var1.getX() >= this.field_742[var49]
                              && var1.getX() <= this.field_742[var49] + this.field_746
                              && var1.getY() >= this.field_743[var38]
                              && var1.getY() <= this.field_743[var38] + this.field_747
                              && var17 < this.field_421.field_3059[this.field_735].size()) {
                              this.field_762 = var17;
                              this.field_763 = ((class_30)this.field_421.field_3059[this.field_735].elementAt(var17)).method_234().method_179();
                              return;
                           }

                           var17++;
                        }
                     }

                     if (var1.getX() >= this.field_757
                        && var1.getX() <= this.field_757 + this.field_759
                        && var1.getY() >= this.field_758
                        && var1.getY() <= this.field_758 + this.field_760
                        && this.field_763 != -1L) {
                        this.field_435.write("U1|" + this.field_763 + "\n");
                        this.field_435.flush();
                        class_62.method_563("colony use item " + this.field_763);
                        return;
                     }
                  }

                  for (int var18 = 0; var18 < this.field_753.length; var18++) {
                     if (var1.getX() >= this.field_752
                        && var1.getX() <= this.field_752 + this.field_754
                        && var1.getY() >= this.field_753[var18]
                        && var1.getY() <= this.field_753[var18] + this.field_755) {
                        switch (var18) {
                           case 0:
                              if (this.field_751 > 0) {
                                 this.field_751--;
                              }

                              return;
                           case 1:
                              if (this.field_742.length * (this.field_751 + this.field_743.length) < this.field_421.field_3059[this.field_735].size()) {
                                 this.field_751++;
                              }

                              return;
                        }
                     }
                  }

                  if (var1.getX() >= this.field_482
                     && var1.getX() <= this.field_482 + this.field_484
                     && var1.getY() >= this.field_483[0]
                     && var1.getY() <= this.field_483[0] + this.field_485) {
                     this.field_475 = -1;
                     return;
                  }
               }

               if (this.field_475 == 2) {
                  for (int var19 = 0; var19 < this.field_540.length; var19++) {
                     if (var1.getX() > this.field_540[var19]
                        && var1.getX() < this.field_540[var19] + this.field_542[var19]
                        && var1.getY() > this.field_541
                        && var1.getY() < this.field_541 + this.field_543) {
                        this.field_558 = var19;
                        this.field_554 = 0;
                        this.field_555 = 0;
                        this.field_556 = 0;
                        this.field_557 = 0;
                        this.field_549 = -1;
                        this.field_550 = -1;
                        return;
                     }
                  }

                  if (this.field_558 == 0) {
                     if (var1.getX() > this.field_529
                        && var1.getX() < this.field_529 + this.field_531
                        && var1.getY() > this.field_530[0]
                        && var1.getY() < this.field_530[0] + this.field_532) {
                        if (this.field_555 > 0) {
                           this.field_555 -= 5;
                        }

                        return;
                     }

                     if (var1.getX() > this.field_529
                        && var1.getX() < this.field_529 + this.field_531
                        && var1.getY() > this.field_530[1]
                        && var1.getY() < this.field_530[1] + this.field_532) {
                        if (this.field_553.size() > 20 && this.field_555 < this.field_553.size() - 20) {
                           this.field_555 += 5;
                        }

                        return;
                     }
                  }

                  if (this.field_558 == 1) {
                     if (this.field_556 != -1) {
                        class_6 var21 = (class_6)this.field_552.get(this.field_556);
                        if (var21.method_37()) {
                           int var40 = (int)var21.method_35() - 1;
                           this.field_549 = (int)var21.method_42(var40);
                           this.field_550 = this.field_556;
                           class_62.method_563("Skill " + this.field_549 + " selected");
                        }

                        return;
                     }

                     if (var1.getX() > this.field_533
                        && var1.getX() < this.field_533 + this.field_535
                        && var1.getY() > this.field_534
                        && var1.getY() < this.field_534 + this.field_536) {
                        if (this.field_549 != -1) {
                           this.field_435.write("LS|" + this.field_549 + "\n");
                           this.field_435.flush();
                           class_62.method_563("Skill " + this.field_549 + " learning request sent");
                           this.field_549 = -1;
                           this.field_550 = -1;
                        }

                        return;
                     }

                     if (var1.getX() > this.field_529
                        && var1.getX() < this.field_529 + this.field_531
                        && var1.getY() > this.field_530[0]
                        && var1.getY() < this.field_530[0] + this.field_532) {
                        if (this.field_557 > 0) {
                           this.field_557 -= 5;
                        }

                        return;
                     }

                     if (var1.getX() > this.field_529
                        && var1.getX() < this.field_529 + this.field_531
                        && var1.getY() > this.field_530[1]
                        && var1.getY() < this.field_530[1] + this.field_532) {
                        if (this.field_552.size() > 20 && this.field_557 < this.field_552.size() - 20) {
                           this.field_557 += 5;
                        }

                        return;
                     }
                  }

                  if (var1.getX() >= this.field_482
                     && var1.getX() <= this.field_482 + this.field_484
                     && var1.getY() >= this.field_483[2]
                     && var1.getY() <= this.field_483[2] + this.field_485) {
                     this.field_475 = -1;
                     return;
                  }
               }

               if (var1.getX() > this.field_685
                  && var1.getX() < this.field_685 + this.field_689
                  && var1.getY() > this.field_686
                  && var1.getY() < this.field_686 + this.field_690) {
                  this.field_691.method_571((byte)0);
               } else if (var1.getX() > this.field_687
                  && var1.getX() < this.field_687 + this.field_689
                  && var1.getY() > this.field_688
                  && var1.getY() < this.field_688 + this.field_690) {
                  this.field_691.method_571((byte)1);
               } else if (var1.getX() > this.field_692
                  && var1.getX() < this.field_692 + this.field_696
                  && var1.getY() > this.field_693
                  && var1.getY() < this.field_693 + this.field_697) {
                  this.field_698.method_571((byte)0);
               } else if (var1.getX() > this.field_694
                  && var1.getX() < this.field_694 + this.field_696
                  && var1.getY() > this.field_695
                  && var1.getY() < this.field_695 + this.field_697) {
                  this.field_698.method_571((byte)1);
               } else if (this.field_725 != -1) {
                  this.method_301((byte)this.field_725);
               } else if (var1.getX() >= this.field_731
                  && var1.getX() <= this.field_731 + this.field_733
                  && var1.getY() >= this.field_732
                  && var1.getY() <= this.field_732 + this.field_734) {
                  field_1274.method_758();
               } else if (this.field_421 != null) {
                  this.field_799 = false;
                  field_1274.requestFocusInWindow();
                  String var20 = (String)this.field_451.method_519(var1);
                  if (var20 != null) {
                     this.method_298(var20);
                     class_62.method_563("sending params..");
                     String[] var39 = var20.split("\\|");
                     if (var39[0].equalsIgnoreCase("AI")) {
                        class_62.method_563("param sent = AI");
                        if (var39[var39.length - 1].equalsIgnoreCase("Y\n")) {
                           class_62.method_563("param set = AI yes");
                           int[] var50 = new int[]{1};
                           Object[] var5 = new Object[]{class_70.method_643(var39[1], var39[2], Long.parseLong(var39[3]))};
                           this.field_451.method_521().method_545(var50, var5);
                           String[] var56 = ((String)this.field_461[1]).split("\\|");
                           if (var56[2].equalsIgnoreCase("M")) {
                              class_62.method_563("param set = AI M");
                              class_19 var7 = this.field_1277.method_136(Long.parseLong(var56[3]));
                              this.field_451.method_521().method_531("Waiting for " + var56[1] + " to start mission:\n" + var7.method_140() + "\n");
                           } else if (var56[2].equalsIgnoreCase("A")) {
                           }
                        } else if (var39[var39.length - 1].equalsIgnoreCase("N\n")) {
                           class_62.method_563("param set = AI no");
                           this.field_451.method_516(this.field_451.method_521());
                        }
                     } else if (var39[0].equalsIgnoreCase("RM")) {
                        class_62.method_563("param set = RM reject mission");
                        this.field_451.method_516(this.field_451.method_521());
                     } else if (var39[0].equalsIgnoreCase("BA")) {
                        if (var39[2].equalsIgnoreCase("Y")) {
                           this.field_1271.method_658(var39[1], "online", var39[3]);
                           class_62.method_563("add buddy " + var39[1]);
                        }

                        this.field_451.method_516(this.field_451.method_521());
                     } else if (var39[0].equalsIgnoreCase("T5")) {
                        this.field_581 = true;
                        this.field_475 = -1;
                        this.field_620 = var39[1].substring(0, var39[1].length() - 1);
                        field_1274.add(field_1274.field_2796);
                        field_1274.field_2796.setText("0");
                        this.field_451.method_516(this.field_451.method_521());
                     } else if (var39[0].equalsIgnoreCase("T4")) {
                        this.field_451.method_516(this.field_451.method_521());
                     }
                  } else {
                     this.field_451.method_516(this.field_451.method_521());
                     if (this.field_429.e() && this.field_429.method_883(var1.getX(), var1.getY())) {
                        class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
                        class_62.method_563("menu selectted state = " + this.field_1298);
                        if (this.field_1298 == 5) {
                           if (this.field_421.method_821() > this.field_421.method_819()) {
                              this.field_698.method_569("You cannot go to mission before you lighten your inventory!", 16711680, 16711680);
                              this.field_698.method_571((byte)3);
                           } else {
                              this.method_297(this.field_1298, this.field_429.method_881());
                           }
                        } else {
                           this.method_297(this.field_1298, this.field_429.method_881());
                        }
                     }
                  }
               }
            }
      }
   }

   // $VF: renamed from: a (byte) void
   public void method_301(byte var1) {
      this.field_725 = var1;
      this.field_435.write("EM|" + this.field_725 + "\n");
      this.field_435.flush();
      switch (this.field_725) {
         case 0:
            this.field_691.method_569(this.field_421.field_3056 + ": *smiles*", 16711680, 0);
            break;
         case 1:
            this.field_691.method_569(this.field_421.field_3056 + ": *frowns*", 16711680, 0);
            break;
         case 2:
            this.field_691.method_569(this.field_421.field_3056 + ": *SOS*", 16711680, 0);
            break;
         case 3:
            this.field_691.method_569(this.field_421.field_3056 + ": *grateful*", 16711680, 0);
            break;
         case 4:
            this.field_691.method_569(this.field_421.field_3056 + ": *sobs*", 16711680, 0);
            break;
         case 5:
            this.field_691.method_569(this.field_421.field_3056 + ": *heart flutters*", 16711680, 0);
            break;
         case 6:
            this.field_691.method_569(this.field_421.field_3056 + ": *blushes*", 16711680, 0);
            break;
         case 7:
            this.field_691.method_569(this.field_421.field_3056 + ": *shocked*", 16711680, 0);
            break;
         case 8:
            this.field_691.method_569(this.field_421.field_3056 + ": *grins*", 16711680, 0);
            break;
         case 9:
            this.field_691.method_569(this.field_421.field_3056 + ": *yawns*", 16711680, 0);
            break;
         case 10:
            this.field_691.method_569(this.field_421.field_3056 + ": *waves*", 16711680, 0);
      }

      this.field_691.method_571((byte)3);
      this.field_421.method_851(this.field_725);
   }

   // $VF: renamed from: c (java.awt.event.MouseEvent) void
   public void method_302(MouseEvent var1) {
      switch (this.field_442) {
         case 1:
            this.method_315(var1);
            return;
         case 2:
            this.method_340(var1);
            return;
         case 3:
            this.method_327(var1);
            return;
         case 4:
            this.method_401(var1);
            return;
         case 5:
            this.method_348(var1);
            return;
         case 6:
            this.method_375(var1);
            return;
         case 7:
            this.method_410(var1);
            return;
         default:
            if (this.field_421 != null) {
               this.field_799 = false;
               field_1274.requestFocusInWindow();
               if (!this.field_429.e() || !this.field_429.method_883(var1.getX(), var1.getY())) {
                  if (this.field_475 == 0) {
                     for (int var2 = 0; var2 < this.field_744.length; var2++) {
                        if (var1.getX() >= this.field_744[var2]
                           && var1.getX() <= this.field_744[var2] + this.field_746
                           && var1.getY() >= this.field_745[var2]
                           && var1.getY() <= this.field_745[var2] + this.field_747) {
                           int var3 = 0;

                           for (Enumeration var4 = this.field_421.field_3064.elements(); var4.hasMoreElements(); var3++) {
                              int var5 = ((class_30)var4.nextElement()).method_242() - 1;
                              if (var5 > 2) {
                                 var5--;
                              }

                              if (var5 == var2) {
                                 this.field_769 = (class_30)((class_30)this.field_421.field_3064.elementAt(var3)).clone();
                                 this.field_421.field_3064.removeElementAt(var3);
                                 this.field_771 = this.field_744[var2];
                                 this.field_772 = this.field_745[var2];
                                 this.field_773 = false;
                                 return;
                              }
                           }
                        }
                     }

                     if (this.field_735 != 3) {
                        int var6 = this.field_751 * this.field_742.length;

                        for (int var9 = 0; var9 < this.field_743.length; var9++) {
                           for (int var10 = 0; var10 < this.field_742.length; var10++) {
                              if (var1.getX() >= this.field_742[var10]
                                 && var1.getX() <= this.field_742[var10] + this.field_746
                                 && var1.getY() >= this.field_743[var9]
                                 && var1.getY() <= this.field_743[var9] + this.field_747
                                 && var6 < this.field_421.field_3059[this.field_735].size()
                                 && ((class_30)this.field_421.field_3059[this.field_735].elementAt(var6)).method_236() > 0) {
                                 this.field_769 = (class_30)((class_30)this.field_421.field_3059[this.field_735].elementAt(var6)).clone();
                                 if (((class_30)this.field_421.field_3059[this.field_735].elementAt(var6)).method_236() == 1) {
                                    this.field_421.field_3059[this.field_735].removeElementAt(var6);
                                 } else {
                                    this.field_769.method_235(1);
                                    ((class_30)this.field_421.field_3059[this.field_735].elementAt(var6))
                                       .method_235(((class_30)this.field_421.field_3059[this.field_735].elementAt(var6)).method_236() - 1);
                                 }

                                 this.field_771 = this.field_742[var10];
                                 this.field_772 = this.field_743[var9];
                                 this.field_773 = true;
                                 return;
                              }

                              var6++;
                           }
                        }
                     }
                  }

                  if (this.field_581) {
                     for (int var7 = 0; var7 < this.field_593.length; var7++) {
                        if (var1.getX() >= this.field_593[var7]
                           && var1.getX() <= this.field_593[var7] + this.field_596
                           && var1.getY() >= this.field_595
                           && var1.getY() <= this.field_595 + this.field_597
                           && var7 < this.field_599.size()
                           && this.field_599.get(var7) != null
                           && !this.field_587
                           && !this.field_588) {
                           this.field_769 = (class_30)((class_30)this.field_599.get(var7)).clone();
                           this.field_599.remove(var7);
                           this.field_771 = this.field_593[var7];
                           this.field_772 = this.field_595;
                           this.field_640 = false;
                           return;
                        }
                     }

                     for (int var8 = 0; var8 < this.field_612.length; var8++) {
                        if (var1.getX() >= this.field_612[var8]
                           && var1.getX() <= this.field_612[var8] + this.field_614
                           && var1.getY() >= this.field_613[var8]
                           && var1.getY() <= this.field_613[var8] + this.field_615
                           && !this.field_587
                           && !this.field_588
                           && var8 + this.field_621 < this.field_421.field_3059[this.field_607].size()
                           && ((class_30)this.field_421.field_3059[this.field_607].elementAt(var8 + this.field_621)).method_236() > 0) {
                           this.field_769 = (class_30)((class_30)this.field_421.field_3059[this.field_607].elementAt(var8 + this.field_621)).clone();
                           this.field_771 = this.field_612[var8];
                           this.field_772 = this.field_613[var8];
                           this.field_626 = var8;
                           this.field_640 = true;
                           return;
                        }
                     }

                     if (var1.getY() >= this.field_583 && var1.getX() >= this.field_582 && var1.getX() <= this.field_582 + this.field_584) {
                        return;
                     }
                  }

                  if (var1.getY() <= 535) {
                     if (var1.getX() >= 19 || var1.getY() <= 449) {
                        if (this.field_475 != -1) {
                           if (this.field_475 != 3 && this.field_475 != 4) {
                              if (var1.getY() >= this.field_466[this.field_475] && var1.getX() >= this.field_465[this.field_475]) {
                                 return;
                              }
                           } else if (var1.getY() >= this.field_466[3] && var1.getX() >= 666) {
                              return;
                           }
                        }

                        if (!this.field_785
                           || var1.getX() <= this.field_775
                           || var1.getX() >= this.field_775 + 412
                           || var1.getY() <= this.field_776
                           || var1.getY() >= this.field_776 + 142) {
                           this.field_421.method_860(var1.getX(), var1.getY());
                        }
                     }
                  }
               }
            }
      }
   }

   // $VF: renamed from: d (java.awt.event.MouseEvent) void
   public void method_303(MouseEvent var1) {
      switch (this.field_442) {
         case 1:
            this.method_316(var1);
            return;
         case 2:
            this.method_342(var1);
            return;
         case 3:
            this.method_329(var1);
            return;
         case 4:
            this.method_403(var1);
            return;
         case 5:
            this.method_350(var1);
            return;
         case 6:
            this.method_376(var1);
            return;
         case 7:
            this.method_411(var1);
            return;
         default:
            if (this.field_421 != null) {
               if (this.field_769 != null && !this.field_581) {
                  if (this.field_773) {
                     class_62.method_563("item name = " + this.field_769.method_234().method_183());
                     class_62.method_563("item bodyslot = " + this.field_769.method_234().method_197());
                     int var4 = this.field_769.method_234().method_197() - 1;
                     if (var4 > -1 && var4 < 3) {
                        if (var1.getX() >= this.field_744[var4]
                           && var1.getX() <= this.field_744[var4] + this.field_746
                           && var1.getY() >= this.field_745[var4]
                           && var1.getY() <= this.field_745[var4] + this.field_747) {
                           class_62.method_563("to body");
                           this.field_769.method_241(var4 + 1);
                           this.field_770 = (class_30)this.field_769.clone();
                           this.field_435.write("C1|" + this.field_769.method_234().method_179() + "|" + (var4 + 1) + "\n");
                           this.field_435.flush();
                        } else {
                           var4 = -1;
                        }
                     } else if (var4 > 3) {
                        var4--;
                        if (var1.getX() >= this.field_744[var4]
                           && var1.getX() <= this.field_744[var4] + this.field_746
                           && var1.getY() >= this.field_745[var4]
                           && var1.getY() <= this.field_745[var4] + this.field_747) {
                           class_62.method_563("to body");
                           this.field_769.method_241(var4 + 2);
                           this.field_770 = (class_30)this.field_769.clone();
                           this.field_435.write("C1|" + this.field_769.method_234().method_179() + "|" + (var4 + 2) + "\n");
                           this.field_435.flush();
                        } else {
                           var4 = -1;
                        }
                     }

                     if (var4 < 0) {
                        class_62.method_563("back to inv");
                        int var3 = this.field_421.field_3059[this.field_769.method_234().method_193()].indexOf(this.field_769);
                        if (var3 == -1) {
                           this.field_421.field_3059[this.field_769.method_234().method_193()].add((class_30)this.field_769.clone());
                        } else {
                           ((class_30)this.field_421.field_3059[this.field_769.method_234().method_193()].elementAt(var3))
                              .method_235(((class_30)this.field_421.field_3059[this.field_769.method_234().method_193()].elementAt(var3)).method_236() + 1);
                        }
                     }
                  } else if (var1.getX() >= this.field_742[0]
                     && var1.getX() <= this.field_742[this.field_742.length - 1] + this.field_746
                     && var1.getY() >= this.field_743[0]
                     && var1.getY() <= this.field_743[this.field_743.length - 1] + this.field_747) {
                     this.field_770 = (class_30)this.field_769.clone();
                     this.field_435.write("C1|" + this.field_769.method_234().method_179() + "|" + "0" + "\n");
                     this.field_435.flush();
                  } else {
                     this.field_421.field_3064.add((class_30)this.field_769.clone());
                  }

                  this.field_769 = null;
               } else if (this.field_769 != null && this.field_581) {
                  if (this.field_640) {
                     if (var1.getX() < this.field_593[0]
                        || var1.getX() > this.field_593[4] + this.field_596
                        || var1.getY() < this.field_595
                        || var1.getY() > this.field_595 + this.field_597
                        || this.field_587
                        || this.field_588) {
                        this.field_639 = null;
                        this.field_626 = -1;
                     } else if (this.field_599.size() < 5) {
                        this.field_627 = true;
                        field_1274.add(field_1274.field_2795);
                        field_1274.field_2795.setText("1");
                        this.field_639 = (class_30)this.field_769.clone();
                     } else {
                        this.field_639 = null;
                        this.field_626 = -1;
                     }
                  } else if (var1.getX() >= this.field_612[0]
                     && var1.getX() <= this.field_612[this.field_612.length - 1] + this.field_614
                     && var1.getY() >= this.field_613[0]
                     && var1.getY() <= this.field_613[this.field_613.length - 1] + this.field_615) {
                     int var2 = this.field_421.field_3059[this.field_769.method_234().method_193()].indexOf(this.field_769);
                     if (var2 == -1) {
                        this.field_421.field_3059[this.field_769.method_234().method_193()].add((class_30)this.field_769.clone());
                     } else {
                        ((class_30)this.field_421.field_3059[this.field_769.method_234().method_193()].elementAt(var2))
                           .method_235(
                              ((class_30)this.field_421.field_3059[this.field_769.method_234().method_193()].elementAt(var2)).method_236()
                                 + this.field_769.method_236()
                           );
                     }
                  } else {
                     this.field_599.add((class_30)this.field_769.clone());
                  }

                  this.field_769 = null;
               } else {
                  this.field_421.method_861();
               }
            }
      }
   }

   // $VF: renamed from: e (java.awt.event.MouseEvent) void
   public void method_304(MouseEvent var1) {
      switch (this.field_442) {
         case 1:
            this.method_317(var1);
            return;
         case 2:
            this.method_341(var1);
            return;
         case 3:
            this.method_328(var1);
            return;
         case 4:
            this.method_402(var1);
            return;
         case 5:
            this.method_349(var1);
            return;
         case 6:
            this.method_377(var1);
            return;
         case 7:
            this.method_412(var1);
            return;
         default:
            if (this.field_421 != null) {
               this.field_799 = false;
               if (this.field_769 != null) {
                  this.field_771 = var1.getX() - 22;
                  this.field_772 = var1.getY() - 22;
               } else if (var1.getY() <= 535) {
                  if (this.field_475 != -1) {
                     if (this.field_475 != 3 && this.field_475 != 4) {
                        if (var1.getY() >= this.field_466[this.field_475] && var1.getX() >= this.field_465[this.field_475]) {
                           return;
                        }
                     } else if (var1.getY() >= this.field_466[3] && var1.getX() >= 666) {
                        return;
                     }
                  }

                  if (!this.field_581 || var1.getY() < this.field_583 || var1.getX() < this.field_582 || var1.getX() > this.field_582 + this.field_584) {
                     this.field_421.method_860(var1.getX(), var1.getY());
                  }
               }
            }
      }
   }

   // $VF: renamed from: a (java.awt.event.KeyEvent) void
   public void method_305(KeyEvent var1) {
      if (this.field_421 != null) {
         if (!this.field_799) {
            this.field_421.method_861();
            this.field_799 = true;
         }

         char var2 = var1.getKeyChar();
         if (var2 == this.field_1284.method_255("en", 28)) {
            if (!field_1274.field_2793.isFocusOwner()) {
               this.field_421.method_862();
            }
         } else if (var2 == this.field_1284.method_255("en", 29)) {
            if (!field_1274.field_2793.isFocusOwner()) {
               this.field_421.method_866();
            }
         } else if (var2 == this.field_1284.method_255("en", 30)) {
            if (!field_1274.field_2793.isFocusOwner()) {
               this.field_421.method_865();
            }
         } else if (var2 == this.field_1284.method_255("en", 31)) {
            if (!field_1274.field_2793.isFocusOwner()) {
               this.field_421.method_868();
            }
         } else if (var2 == this.field_1284.method_255("en", 32)) {
            if (!field_1274.field_2793.isFocusOwner()) {
               this.field_421.method_863();
            }
         } else if (var2 == this.field_1284.method_255("en", 33)) {
            if (!field_1274.field_2793.isFocusOwner()) {
               this.field_421.method_869();
            }
         } else if (var2 == this.field_1284.method_255("en", 34)) {
            if (!field_1274.field_2793.isFocusOwner()) {
               this.field_421.method_864();
            }
         } else if (var2 == this.field_1284.method_255("en", 35)) {
            if (!field_1274.field_2793.isFocusOwner()) {
               this.field_421.method_867();
            }
         } else {
            field_1274.field_2793.setText(field_1274.field_2793.getText() + var2);
            field_1274.field_2793.requestFocusInWindow();
         }
      }
   }

   // $VF: renamed from: b (java.awt.event.KeyEvent) void
   public void method_306(KeyEvent var1) {
      if (this.field_421 != null) {
         class_62.method_564(var1.getKeyCode());
         if (this.field_429.e()
            && (
               var1.getKeyCode() == 112
                  || var1.getKeyCode() == 113
                  || var1.getKeyCode() == 114
                  || var1.getKeyCode() == 115
                  || var1.getKeyCode() == 116
                  || var1.getKeyCode() == 117
                  || var1.getKeyCode() == 118
                  || var1.getKeyCode() == 119
            )) {
            switch (var1.getKeyCode()) {
               case 112:
                  this.field_429.method_879(0);
                  break;
               case 113:
                  this.field_429.method_879(1);
                  break;
               case 114:
                  this.field_429.method_879(2);
                  break;
               case 115:
                  this.field_429.method_879(3);
                  break;
               case 116:
                  this.field_429.method_879(4);
                  break;
               case 117:
                  this.field_429.method_879(5);
                  break;
               case 118:
                  this.field_429.method_879(6);
                  break;
               case 119:
                  this.field_429.method_879(7);
            }

            field_1274.repaint();
            if (this.field_429.method_881() != null) {
               class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
               if (this.field_1298 == 5) {
                  if (this.field_421.method_821() > this.field_421.method_819()) {
                     this.field_698.method_569("You cannot go to mission before you lighten your inventory!", 16711680, 16711680);
                     this.field_698.method_571((byte)3);
                  } else {
                     this.method_297(this.field_1298, this.field_429.method_881());
                  }
               } else {
                  this.method_297(this.field_1298, this.field_429.method_881());
               }
            } else {
               class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_fail.wav");
            }
         }
      }
   }

   // $VF: renamed from: c (java.awt.event.KeyEvent) void
   public void method_307(KeyEvent var1) {
      if (this.field_421 != null) {
         this.field_421.method_861();
      }
   }

   // $VF: renamed from: f (java.lang.Object) void
   public void method_308(Object var1) {
      class_62.method_563("in spaceport");
      if (var1 != null) {
         switch (field_437) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
               this.field_803 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 219)));
               break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
               this.field_803 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 820)));
               break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
               this.field_803 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 821)));
               break;
            case 16:
            case 17:
            case 18:
            case 19:
               this.field_803 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1177)));
         }

         this.field_827 = new Icon[3];
         this.field_827[0] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1224)));
         this.field_827[1] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1230)));
         this.field_827[2] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1230)));
         this.field_828 = 0;
         this.field_829 = 0;
         this.field_830 = -1;
         this.field_804 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 229)));
         this.field_805 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 228)));
         this.field_806 = this.field_1284.method_257("en", 233);
         this.field_807 = this.field_1284.method_257("en", 234);
         String[] var2 = this.field_1284.method_260("en", 230, 0, 0);
         this.field_808 = new Icon[var2.length];

         for (int var3 = 0; var3 < this.field_808.length; var3++) {
            this.field_808[var3] = new ImageIcon(this.getClass().getResource(this.field_395 + var2[var3]));
         }

         this.field_809 = this.field_1284.method_257("en", 231);
         this.field_810 = this.field_1284.method_257("en", 232);
         this.field_812 = this.field_1284.method_254("en", 261);
         this.field_813 = this.field_1284.method_254("en", 262);
         this.field_814 = this.field_1284.method_257("en", 263);
         this.field_815 = this.field_1284.method_257("en", 264);
         this.field_816 = this.field_1284.method_254("en", 265);
         this.field_817 = this.field_1284.method_254("en", 266);
         this.field_820 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 268)));
         this.field_821 = this.field_1284.method_254("en", 269);
         this.field_822 = this.field_1284.method_254("en", 270);
         this.field_823 = this.field_1284.method_254("en", 271);
         this.field_824 = this.field_1284.method_254("en", 272);
         this.field_825 = this.field_1284.method_254("en", 273);
         this.field_826 = this.field_1284.method_254("en", 274);
         class_62.method_563("out = " + var1.toString());
         this.field_435.write(var1.toString());
         this.field_435.flush();
         this.field_832 = new Vector();
         this.field_833 = new Vector();
      }

      this.field_818 = -1;
      this.field_831 = false;
   }

   // $VF: renamed from: f (java.awt.Graphics) void
   public void method_309(Graphics var1) {
      this.field_803.paintIcon(field_1274, var1, 0, 0);
      this.method_310(var1, field_437);
      this.method_311(var1, field_437);
      var1.setFont(new Font("Arial", 0, 14));
      var1.setColor(new Color(16777215));
      var1.drawString("Bal: " + field_438 + " sidos", 414, 119);
      if (this.field_818 > 0) {
         this.method_312(var1, field_437, this.field_818);
         this.method_310(var1, this.field_818);
      }

      Enumeration var2 = this.field_832.elements();

      while (var2.hasMoreElements()) {
         int var3 = Integer.parseInt(var2.nextElement().toString());
         this.method_311(var1, var3);
      }

      if (this.field_831) {
         var1.setColor(new Color(0));
         var1.drawString("Please wait.", 536, 429);
      } else if (this.field_818 != -2) {
         var1.setFont(MastersOfDestiny.field_2814);
         var1.setColor(new Color(6710886));
         var1.drawString("Welcome adventurer.", 476, 396);
         var1.drawString("Please select your destination.", 476, 417);
         if (this.field_818 != -1) {
            var1.setColor(new Color(0));
            var1.drawString("Destination: " + this.field_1286[this.field_818 - 1], 476, 443);
            var1.drawString("Fare: " + this.field_833.elementAt(this.field_832.indexOf("" + this.field_818)) + " sidos", 476, 463);
         }
      } else {
         this.method_312(var1, field_437, this.field_819);
         this.method_310(var1, this.field_819);
         var1.setFont(MastersOfDestiny.field_2814);
         var1.setColor(new Color(6710886));
         var1.drawString("Please confirm your destination.", 476, 396);
         var1.setColor(new Color(0));
         var1.drawString("Destination: " + this.field_1286[this.field_819 - 1], 476, 423);
         var1.drawString("Fare: " + this.field_833.elementAt(this.field_832.indexOf("" + this.field_819)) + " sidos", 476, 440);
         this.field_820.paintIcon(field_1274, var1, this.field_821, this.field_822);
      }

      if (this.field_830 != -1) {
         this.field_827[this.field_830].paintIcon(field_1274, var1, this.field_828, this.field_829);
      }
   }

   // $VF: renamed from: a (java.awt.Graphics, int) void
   public void method_310(Graphics var1, int var2) {
      switch (var2) {
         case 1:
            this.field_804.paintIcon(field_1274, var1, this.field_806[var2 - 1], this.field_807[var2 - 1]);
            break;
         case 6:
            this.field_804.paintIcon(field_1274, var1, this.field_806[var2 - 1], this.field_807[var2 - 1]);
            break;
         case 11:
            this.field_804.paintIcon(field_1274, var1, this.field_806[var2 - 1], this.field_807[var2 - 1]);
            break;
         case 16:
            this.field_804.paintIcon(field_1274, var1, this.field_806[var2 - 1], this.field_807[var2 - 1]);
            break;
         default:
            this.field_805.paintIcon(field_1274, var1, this.field_806[var2 - 1], this.field_807[var2 - 1]);
      }
   }

   // $VF: renamed from: b (java.awt.Graphics, int) void
   public void method_311(Graphics var1, int var2) {
      this.field_808[var2 - 1].paintIcon(field_1274, var1, this.field_809[var2 - 1], this.field_810[var2 - 1]);
   }

   // $VF: renamed from: a (java.awt.Graphics, int, int) void
   public void method_312(Graphics var1, int var2, int var3) {
      if ((var2 != 9 || var3 != 7) && (var2 != 7 || var3 != 9)) {
         if ((var2 != 16 || var3 != 17) && (var2 != 17 || var3 != 16)) {
            if ((var2 != 16 || var3 != 18) && (var2 != 18 || var3 != 16)) {
               if ((var2 != 5 || var3 != 4) && (var2 != 4 || var3 != 5)) {
                  if ((var2 != 17 || var3 != 3) && (var2 != 3 || var3 != 17)) {
                     if ((var2 != 17 || var3 != 19) && (var2 != 19 || var3 != 17)) {
                        if ((var2 != 15 || var3 != 13) && (var2 != 13 || var3 != 15)) {
                           if ((var2 != 12 || var3 != 13) && (var2 != 13 || var3 != 12)) {
                              if ((var2 != 2 || var3 != 5) && (var2 != 5 || var3 != 2)) {
                                 if ((var2 != 6 || var3 != 9) && (var2 != 9 || var3 != 6)) {
                                    if ((var2 != 6 || var3 != 8) && (var2 != 8 || var3 != 6)) {
                                       if ((var2 != 6 || var3 != 16) && (var2 != 16 || var3 != 6)) {
                                          if ((var2 != 6 || var3 != 1) && (var2 != 1 || var3 != 6)) {
                                             if ((var2 != 10 || var3 != 9) && (var2 != 9 || var3 != 10)) {
                                                if ((var2 != 10 || var3 != 8) && (var2 != 8 || var3 != 10)) {
                                                   if ((var2 != 4 || var3 != 3) && (var2 != 3 || var3 != 4)) {
                                                      if ((var2 != 11 || var3 != 8) && (var2 != 8 || var3 != 11)) {
                                                         if ((var2 != 11 || var3 != 15) && (var2 != 15 || var3 != 11)) {
                                                            if ((var2 != 11 || var3 != 1) && (var2 != 1 || var3 != 11)) {
                                                               if ((var2 != 11 || var3 != 12) && (var2 != 12 || var3 != 11)) {
                                                                  if ((var2 != 1 || var3 != 5) && (var2 != 5 || var3 != 1)) {
                                                                     if ((var2 != 1 || var3 != 2) && (var2 != 2 || var3 != 1)) {
                                                                        if ((var2 != 1 || var3 != 4) && (var2 != 4 || var3 != 1)) {
                                                                           if ((var2 != 1 || var3 != 3) && (var2 != 3 || var3 != 1)) {
                                                                              if ((var2 != 19 || var3 != 18) && (var2 != 18 || var3 != 19)) {
                                                                                 if (var2 == 14 && var3 == 13 || var2 == 13 && var3 == 14) {
                                                                                    this.field_811 = new ImageIcon(
                                                                                       this.getClass()
                                                                                          .getResource(this.field_395 + this.field_1284.method_256("en", 260))
                                                                                    );
                                                                                    this.field_811.paintIcon(field_1274, var1, this.field_812, this.field_813);
                                                                                 }
                                                                              } else {
                                                                                 this.field_811 = new ImageIcon(
                                                                                    this.getClass()
                                                                                       .getResource(this.field_395 + this.field_1284.method_256("en", 259))
                                                                                 );
                                                                                 this.field_811.paintIcon(field_1274, var1, this.field_812, this.field_813);
                                                                              }
                                                                           } else {
                                                                              this.field_811 = new ImageIcon(
                                                                                 this.getClass()
                                                                                    .getResource(this.field_395 + this.field_1284.method_256("en", 258))
                                                                              );
                                                                              this.field_811.paintIcon(field_1274, var1, this.field_812, this.field_813);
                                                                           }
                                                                        } else {
                                                                           this.field_811 = new ImageIcon(
                                                                              this.getClass()
                                                                                 .getResource(this.field_395 + this.field_1284.method_256("en", 257))
                                                                           );
                                                                           this.field_811.paintIcon(field_1274, var1, this.field_812, this.field_813);
                                                                        }
                                                                     } else {
                                                                        this.field_811 = new ImageIcon(
                                                                           this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 256))
                                                                        );
                                                                        this.field_811.paintIcon(field_1274, var1, this.field_812, this.field_813);
                                                                     }
                                                                  } else {
                                                                     this.field_811 = new ImageIcon(
                                                                        this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 255))
                                                                     );
                                                                     this.field_811.paintIcon(field_1274, var1, this.field_812, this.field_813);
                                                                  }
                                                               } else {
                                                                  this.field_811 = new ImageIcon(
                                                                     this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 254))
                                                                  );
                                                                  this.field_811.paintIcon(field_1274, var1, this.field_812, this.field_813);
                                                               }
                                                            } else {
                                                               this.field_811 = new ImageIcon(
                                                                  this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 253))
                                                               );
                                                               this.field_811.paintIcon(field_1274, var1, this.field_812, this.field_813);
                                                            }
                                                         } else {
                                                            this.field_811 = new ImageIcon(
                                                               this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 252))
                                                            );
                                                            this.field_811.paintIcon(field_1274, var1, this.field_812, this.field_813);
                                                         }
                                                      } else {
                                                         this.field_811 = new ImageIcon(
                                                            this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 251))
                                                         );
                                                         this.field_811.paintIcon(field_1274, var1, this.field_812, this.field_813);
                                                      }
                                                   } else {
                                                      this.field_811 = new ImageIcon(
                                                         this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 250))
                                                      );
                                                      this.field_811.paintIcon(field_1274, var1, this.field_812, this.field_813);
                                                   }
                                                } else {
                                                   this.field_811 = new ImageIcon(
                                                      this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 249))
                                                   );
                                                   this.field_811.paintIcon(field_1274, var1, this.field_812, this.field_813);
                                                }
                                             } else {
                                                this.field_811 = new ImageIcon(
                                                   this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 248))
                                                );
                                                this.field_811.paintIcon(field_1274, var1, this.field_812, this.field_813);
                                             }
                                          } else {
                                             this.field_811 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 247)));
                                             this.field_811.paintIcon(field_1274, var1, this.field_812, this.field_813);
                                          }
                                       } else {
                                          this.field_811 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 246)));
                                          this.field_811.paintIcon(field_1274, var1, this.field_812, this.field_813);
                                       }
                                    } else {
                                       this.field_811 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 245)));
                                       this.field_811.paintIcon(field_1274, var1, this.field_812, this.field_813);
                                    }
                                 } else {
                                    this.field_811 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 244)));
                                    this.field_811.paintIcon(field_1274, var1, this.field_812, this.field_813);
                                 }
                              } else {
                                 this.field_811 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 243)));
                                 this.field_811.paintIcon(field_1274, var1, this.field_812, this.field_813);
                              }
                           } else {
                              this.field_811 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 242)));
                              this.field_811.paintIcon(field_1274, var1, this.field_812, this.field_813);
                           }
                        } else {
                           this.field_811 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 241)));
                           this.field_811.paintIcon(field_1274, var1, this.field_812, this.field_813);
                        }
                     } else {
                        this.field_811 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 240)));
                        this.field_811.paintIcon(field_1274, var1, this.field_812, this.field_813);
                     }
                  } else {
                     this.field_811 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 239)));
                     this.field_811.paintIcon(field_1274, var1, this.field_812, this.field_813);
                  }
               } else {
                  this.field_811 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 238)));
                  this.field_811.paintIcon(field_1274, var1, this.field_812, this.field_813);
               }
            } else {
               this.field_811 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 237)));
               this.field_811.paintIcon(field_1274, var1, this.field_812, this.field_813);
            }
         } else {
            this.field_811 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 236)));
            this.field_811.paintIcon(field_1274, var1, this.field_812, this.field_813);
         }
      } else {
         this.field_811 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 235)));
         this.field_811.paintIcon(field_1274, var1, this.field_812, this.field_813);
      }
   }

   // $VF: renamed from: f (java.awt.event.MouseEvent) void
   public void method_313(MouseEvent var1) {
      if (!this.field_831) {
         this.field_830 = -1;
         if (var1.getX() > this.field_1284.method_254("en", 275)
            && var1.getX() < this.field_1284.method_254("en", 275) + this.field_1284.method_254("en", 277)
            && var1.getY() > this.field_1284.method_254("en", 276)
            && var1.getY() < this.field_1284.method_254("en", 276) + this.field_1284.method_254("en", 278)) {
            this.field_830 = 0;
            this.field_828 = this.field_1284.method_254("en", 275);
            this.field_829 = this.field_1284.method_254("en", 276);
         } else {
            if (this.field_818 == -2) {
               if (var1.getX() > this.field_821
                  && var1.getX() < this.field_821 + this.field_825
                  && var1.getY() > this.field_822
                  && var1.getY() < this.field_822 + this.field_826) {
                  this.field_830 = 1;
                  this.field_828 = this.field_821;
                  this.field_829 = this.field_822;
                  return;
               }

               if (var1.getX() > this.field_823
                  && var1.getX() < this.field_823 + this.field_825
                  && var1.getY() > this.field_824
                  && var1.getY() < this.field_824 + this.field_826) {
                  this.field_830 = 2;
                  this.field_828 = this.field_823;
                  this.field_829 = this.field_824;
                  return;
               }
            }

            if (this.field_818 != -2) {
               boolean var2 = false;

               for (int var3 = 0; var3 < this.field_814.length; var3++) {
                  if (var1.getX() > this.field_814[var3]
                     && var1.getX() < this.field_814[var3] + this.field_816
                     && var1.getY() > this.field_815[var3]
                     && var1.getY() < this.field_815[var3] + this.field_817
                     && this.field_832.contains("" + (var3 + 1))) {
                     int var4 = this.field_818;
                     this.field_818 = var3 + 1;
                     var2 = true;
                     if (var4 != this.field_818) {
                        class_3.field_20.method_17("res/sound/mouse_effects/mouse_over_A.wav");
                     }
                  }
               }

               if (!var2) {
                  this.field_818 = -1;
               }
            }
         }
      }
   }

   // $VF: renamed from: g (java.awt.event.MouseEvent) void
   public void method_314(MouseEvent var1) {
      if (!this.field_831) {
         if (this.field_818 > 0) {
            this.field_819 = this.field_818;
            this.field_818 = -2;
            class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
         } else {
            if (this.field_818 == -2) {
               if (var1.getX() > this.field_821
                  && var1.getX() < this.field_821 + this.field_825
                  && var1.getY() > this.field_822
                  && var1.getY() < this.field_822 + this.field_826) {
                  class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
                  this.field_435.write("P4|" + this.field_819 + "\n");
                  this.field_435.flush();
                  this.field_830 = -1;
                  this.field_831 = true;
                  return;
               }

               if (var1.getX() > this.field_823
                  && var1.getX() < this.field_823 + this.field_825
                  && var1.getY() > this.field_824
                  && var1.getY() < this.field_824 + this.field_826) {
                  this.field_818 = -1;
                  this.field_830 = -1;
                  class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
                  return;
               }
            }

            if (var1.getX() > this.field_1284.method_254("en", 275)
               && var1.getX() < this.field_1284.method_254("en", 275) + this.field_1284.method_254("en", 277)
               && var1.getY() > this.field_1284.method_254("en", 276)
               && var1.getY() < this.field_1284.method_254("en", 276) + this.field_1284.method_254("en", 278)) {
               class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
               this.field_429.method_798();
               this.field_830 = -1;
               class_62.method_563("spaceport test 1");
               this.method_297((byte)0, null);
               this.field_1300 = 5;
            }
         }
      }
   }

   // $VF: renamed from: h (java.awt.event.MouseEvent) void
   public void method_315(MouseEvent var1) {
   }

   // $VF: renamed from: i (java.awt.event.MouseEvent) void
   public void method_316(MouseEvent var1) {
   }

   // $VF: renamed from: j (java.awt.event.MouseEvent) void
   public void method_317(MouseEvent var1) {
   }

   // $VF: renamed from: d (java.awt.event.KeyEvent) void
   public void method_318(KeyEvent var1) {
   }

   // $VF: renamed from: g (java.lang.Object) void
   public void method_319(Object var1) {
      switch (field_437) {
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            this.field_834 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 290)));
            break;
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
            this.field_834 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1163)));
            break;
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
            this.field_834 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1069)));
            break;
         case 16:
         case 17:
         case 18:
         case 19:
            this.field_834 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1170)));
      }

      this.field_924 = new Icon[3];
      this.field_924[0] = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 1224)));
      this.field_924[1] = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 1222)));
      this.field_924[2] = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 1223)));
      this.field_925 = 0;
      this.field_926 = 0;
      this.field_927 = -1;
      this.field_835 = new Icon[2];
      this.field_835[0] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 404)));
      this.field_835[1] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 405)));
      this.field_836 = 0;
      this.field_837 = this.field_1284.method_257("en", 406);
      this.field_838 = this.field_1284.method_254("en", 407);
      this.field_839 = this.field_1284.method_257("en", 408);
      this.field_840 = this.field_1284.method_254("en", 409);
      this.field_841 = new Icon[3];
      this.field_841[0] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 375)));
      this.field_841[1] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 376)));
      this.field_841[2] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 377)));
      this.field_842 = 0;
      this.field_843 = this.field_1284.method_257("en", 410);
      this.field_844 = this.field_1284.method_254("en", 411);
      this.field_845 = this.field_1284.method_257("en", 412);
      this.field_846 = this.field_1284.method_254("en", 413);
      this.field_847 = new Icon[4];
      this.field_847[0] = this.field_841[0];
      this.field_847[1] = this.field_841[1];
      this.field_847[2] = this.field_841[2];
      this.field_847[3] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 378)));
      this.field_848 = this.field_1284.method_257("en", 426);
      this.field_849 = this.field_1284.method_254("en", 427);
      this.field_850 = this.field_1284.method_257("en", 428);
      this.field_851 = this.field_1284.method_254("en", 429);
      this.field_852 = new Icon[4];
      this.field_852[0] = this.field_841[0];
      this.field_852[1] = this.field_841[1];
      this.field_852[2] = this.field_841[2];
      this.field_852[3] = this.field_847[3];
      this.field_853 = 0;
      this.field_854 = this.field_1284.method_257("en", 414);
      this.field_855 = this.field_1284.method_254("en", 415);
      this.field_856 = this.field_1284.method_257("en", 416);
      this.field_857 = this.field_1284.method_254("en", 417);
      this.field_858 = this.field_1284.method_257("en", 352);
      this.field_859 = this.field_1284.method_254("en", 355);
      this.field_860 = this.field_1284.method_254("en", 356);
      this.field_861 = new Vector[4];
      this.field_861[0] = new Vector();
      this.field_861[1] = new Vector();
      this.field_861[2] = new Vector();
      this.field_861[3] = new Vector();
      this.field_862 = new Vector[4];
      this.field_862[0] = new Vector();
      this.field_862[1] = new Vector();
      this.field_862[2] = new Vector();
      this.field_862[3] = new Vector();
      this.field_863 = this.field_1284.method_257("en", 353);
      this.field_864 = this.field_1284.method_257("en", 354);
      this.field_865 = 0;
      this.field_866 = 0;
      this.field_867 = this.field_1284.method_254("en", 418);
      this.field_868 = this.field_1284.method_257("en", 419);
      this.field_869 = this.field_1284.method_254("en", 420);
      this.field_870 = this.field_1284.method_254("en", 421);
      this.field_875 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 293)));
      this.field_876 = this.field_858[0] - 2;
      this.field_877 = this.field_863[0] - 2;
      this.field_878 = class_87.method_803();
      this.field_878.method_804((byte)2);
      this.field_878.g();
      this.field_879 = 150;
      this.field_880 = 17;
      this.field_886 = class_87.method_803();
      this.field_886.method_804((byte)3);
      this.field_886.g();
      this.field_887 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 393)));
      this.field_888 = 0;
      this.field_889 = 0;
      this.field_890 = this.field_1284.method_254("en", 394);
      this.field_891 = this.field_1284.method_254("en", 395);
      this.field_896 = true;
      this.field_897 = true;
      this.field_898 = this.field_1284.method_254("en", 387);
      this.field_899 = this.field_1284.method_254("en", 388);
      this.method_332();
      this.method_331();
      this.field_933.setVisible(false);

      try {
         this.field_936.remove(0, this.field_936.getLength());
         this.field_936.insertString(this.field_936.getLength(), " Shop Transaction History", field_1274.field_2787);
      } catch (BadLocationException var3) {
         class_62.method_563(var3.getMessage());
      }

      this.field_900 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 434)));
      this.field_903 = this.field_1284.method_254("en", 400);
      this.field_904 = this.field_1284.method_257("en", 401);
      this.field_905 = this.field_1284.method_254("en", 402);
      this.field_906 = this.field_1284.method_254("en", 403);
      this.field_907 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 433)));
      this.field_912 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 435)));
      this.field_915 = false;
      this.field_916 = this.field_1284.method_254("en", 389);
      this.field_917 = this.field_1284.method_254("en", 390);
      this.field_918 = this.field_1284.method_254("en", 391);
      this.field_919 = this.field_1284.method_254("en", 392);
      this.field_920 = 0;
      this.field_921 = 0;
      this.field_922 = 0L;
      this.field_435.write("S19|" + var1.toString() + "\n");
      class_62.method_563("S19|" + var1.toString() + "\n");
      this.field_435.flush();
      this.field_435.write("S20|" + var1.toString() + "\n");
      this.field_435.flush();
      this.field_435.write("L1\n");
      this.field_435.flush();
   }

   // $VF: renamed from: a (av) void
   public void method_320(class_30 var1) {
      this.field_861[var1.method_234().method_193()].add(var1);
   }

   // $VF: renamed from: b (av) void
   public void method_321(class_30 var1) {
      this.field_862[var1.method_234().method_193()].add(var1);
   }

   // $VF: renamed from: g (java.awt.Graphics) void
   public void method_322(Graphics var1) {
      this.field_834.paintIcon(field_1274, var1, 0, 0);
      this.field_835[this.field_836].paintIcon(field_1274, var1, this.field_837[this.field_836], this.field_838);
      switch (this.field_836) {
         case 0:
            this.field_841[this.field_842].paintIcon(field_1274, var1, this.field_843[this.field_842], this.field_844);
            var1.setColor(new Color(0));
            var1.fillRect(274, 101, 55, 19);
            int var2 = this.field_865 * this.field_858.length;

            for (int var8 = 0; var8 < this.field_863.length; var8++) {
               for (int var11 = 0; var11 < this.field_858.length; var11++) {
                  if (var2 < this.field_861[this.field_842].size()) {
                     ((class_30)this.field_861[this.field_842].elementAt(var2))
                        .method_234()
                        .method_181()
                        .paintIcon(field_1274, var1, this.field_858[var11], this.field_863[var8]);
                     long var13 = ((class_30)this.field_861[this.field_842].elementAt(var2)).method_236();
                     if (var13 > 0L) {
                        var1.setColor(new Color(16777215));
                        var1.setFont(MastersOfDestiny.field_2806);
                        var1.drawString(var13 + "", this.field_858[var11] + 2, this.field_863[var8] + 9);
                     }

                     var2++;
                  }
               }
            }
            break;
         case 1:
            this.field_847[this.field_842].paintIcon(field_1274, var1, this.field_848[this.field_842], this.field_849);
            int var3 = this.field_865 * this.field_858.length;

            for (int var4 = 0; var4 < this.field_863.length; var4++) {
               for (int var5 = 0; var5 < this.field_858.length; var5++) {
                  if (var3 < this.field_862[this.field_842].size()) {
                     ((class_30)this.field_862[this.field_842].elementAt(var3))
                        .method_234()
                        .method_181()
                        .paintIcon(field_1274, var1, this.field_858[var5], this.field_863[var4]);
                     var1.setColor(new Color(16777215));
                     var1.setFont(MastersOfDestiny.field_2806);
                     var1.drawString(
                        "" + ((class_30)this.field_862[this.field_842].elementAt(var3)).method_236(), this.field_858[var5] + 2, this.field_863[var4] + 9
                     );
                     var3++;
                  }
               }
            }
      }

      this.field_852[this.field_853].paintIcon(field_1274, var1, this.field_854[this.field_853], this.field_855);
      int var7 = this.field_866 * this.field_858.length;

      for (int var9 = 0; var9 < this.field_864.length; var9++) {
         for (int var12 = 0; var12 < this.field_858.length; var12++) {
            if (var7 < this.field_421.field_3059[this.field_853].size()) {
               ((class_30)this.field_421.field_3059[this.field_853].elementAt(var7))
                  .method_234()
                  .method_181()
                  .paintIcon(field_1274, var1, this.field_858[var12], this.field_864[var9]);
               var1.setColor(new Color(16777215));
               var1.setFont(MastersOfDestiny.field_2806);
               var1.drawString(
                  "" + ((class_30)this.field_421.field_3059[this.field_853].elementAt(var7)).method_236(), this.field_858[var12] + 2, this.field_864[var9] + 9
               );
               var7++;
            }
         }
      }

      long var10 = this.field_421.method_821();
      var1.setColor(new Color(0));
      var1.setFont(MastersOfDestiny.field_2810);
      var1.drawString("" + var10 + "/" + this.field_421.method_819(), 139, 520);
      var1.setColor(new Color(0));
      var1.setFont(MastersOfDestiny.field_2810);
      var1.drawString("" + field_438, 284, 520);
      var1.setColor(new Color(0));
      var1.setFont(MastersOfDestiny.field_2812);
      var1.drawString(
         "" + this.field_429.method_882(),
         this.field_1284.method_254("en", 430)
            + (this.field_1284.method_254("en", 432) - MastersOfDestiny.field_2813.stringWidth(this.field_429.method_882().toString())) / 2,
         this.field_1284.method_254("en", 431) + MastersOfDestiny.field_2813.getHeight()
      );
      this.field_875.paintIcon(field_1274, var1, this.field_876, this.field_877);
      if (this.field_878.field_2993 != null) {
         var1.setFont(MastersOfDestiny.field_2808);
         this.field_878.method_793(var1, field_1274);
      }

      if (this.field_886.field_2993 != null) {
         this.field_875.paintIcon(field_1274, var1, this.field_884, this.field_885);
         var1.setFont(MastersOfDestiny.field_2808);
         this.field_886.method_793(var1, field_1274);
         var1.setColor(new Color(16777215));
         var1.setFont(MastersOfDestiny.field_2808);
         var1.drawString("Quantity:", this.field_901, this.field_902 - 4);
         this.field_900.paintIcon(field_1274, var1, this.field_901, this.field_902);
         var1.setColor(new Color(16777215));
         var1.setFont(MastersOfDestiny.field_2808);
         if (this.field_836 == 1) {
            var1.drawString("Deposit Cost:", this.field_908, this.field_909 - 4);
         } else {
            var1.drawString("Cost:", this.field_908, this.field_909 - 4);
         }

         this.field_907.paintIcon(field_1274, var1, this.field_908, this.field_909);
         var1.setColor(new Color(0));
         var1.setFont(MastersOfDestiny.field_2810);
         var1.drawString("" + this.field_930, this.field_910, this.field_911);
         this.field_912.paintIcon(field_1274, var1, this.field_913, this.field_914);
      }

      if (this.field_927 != -1) {
         this.field_924[this.field_927].paintIcon(field_1274, var1, this.field_925, this.field_926);
      }

      if (this.field_892 != null) {
         this.field_892.paintIcon(field_1274, var1, this.field_893, this.field_894);
      }
   }

   // $VF: renamed from: k (java.awt.event.MouseEvent) void
   public void method_323(MouseEvent var1) {
      this.field_927 = -1;
      if (var1.getX() > this.field_1284.method_254("en", 383)
         && var1.getX() < this.field_1284.method_254("en", 383) + this.field_1284.method_254("en", 385)
         && var1.getY() > this.field_1284.method_254("en", 384)
         && var1.getY() < this.field_1284.method_254("en", 384) + this.field_1284.method_254("en", 386)) {
         this.field_927 = 0;
         this.field_925 = this.field_1284.method_254("en", 383);
         this.field_926 = this.field_1284.method_254("en", 384);
      } else {
         if (this.field_886.field_2993 != null) {
            if (!this.field_928.getText().trim().equals("")
               && var1.getX() > this.field_913
               && var1.getX() < this.field_913 + this.field_1284.method_254("en", 424)
               && var1.getY() > this.field_914
               && var1.getY() < this.field_914 + this.field_1284.method_254("en", 425)) {
               this.field_927 = 1;
               this.field_925 = this.field_913;
               this.field_926 = this.field_914;
               return;
            }

            if (var1.getX() > this.field_913 + this.field_1284.method_254("en", 424) + 3
               && var1.getX() < this.field_913 + this.field_1284.method_254("en", 424) + 3 + this.field_1284.method_254("en", 391)
               && var1.getY() > this.field_914
               && var1.getY() < this.field_914 + this.field_1284.method_254("en", 392)) {
               this.field_927 = 2;
               this.field_925 = this.field_913 + this.field_1284.method_254("en", 424) + 3;
               this.field_926 = this.field_914;
               return;
            }
         }

         if (this.field_886.field_2993 == null || !this.field_896) {
            switch (this.field_836) {
               case 0:
                  int var2 = this.field_865 * this.field_858.length;

                  for (int var7 = 0; var7 < this.field_863.length; var7++) {
                     for (int var9 = 0; var9 < this.field_858.length; var9++) {
                        if (var1.getX() >= this.field_858[var9]
                           && var1.getX() <= this.field_858[var9] + this.field_859
                           && var1.getY() >= this.field_863[var7]
                           && var1.getY() <= this.field_863[var7] + this.field_860) {
                           this.field_876 = this.field_858[var9] - 2;
                           this.field_877 = this.field_863[var7] - 2;
                           if (var2 < this.field_861[this.field_842].size()) {
                              if (var9 < this.field_858.length / 2) {
                                 this.method_326(
                                    ((class_30)this.field_861[this.field_842].elementAt(var2)).method_245("Out of Stock"), (byte)1, this.field_878.field_3010
                                 );
                              } else {
                                 this.method_326(
                                    ((class_30)this.field_861[this.field_842].elementAt(var2)).method_245("Out of Stock"), (byte)0, this.field_878.field_3010
                                 );
                              }
                           }

                           return;
                        }

                        var2++;
                     }
                  }
                  break;
               case 1:
                  int var3 = this.field_865 * this.field_858.length;

                  for (int var4 = 0; var4 < this.field_863.length; var4++) {
                     for (int var5 = 0; var5 < this.field_858.length; var5++) {
                        if (var1.getX() >= this.field_858[var5]
                           && var1.getX() <= this.field_858[var5] + this.field_859
                           && var1.getY() >= this.field_863[var4]
                           && var1.getY() <= this.field_863[var4] + this.field_860) {
                           this.field_876 = this.field_858[var5] - 2;
                           this.field_877 = this.field_863[var4] - 2;
                           if (var3 < this.field_862[this.field_842].size()) {
                              if (var5 < this.field_858.length / 2) {
                                 this.method_326(
                                    ((class_30)this.field_862[this.field_842].elementAt(var3)).method_245("In Locker"), (byte)1, this.field_878.field_3010
                                 );
                              } else {
                                 this.method_326(
                                    ((class_30)this.field_862[this.field_842].elementAt(var3)).method_245("In Locker"), (byte)0, this.field_878.field_3010
                                 );
                              }
                           }

                           return;
                        }

                        var3++;
                     }
                  }
            }
         }

         if (this.field_886.field_2993 == null || this.field_896) {
            int var6 = this.field_866 * this.field_858.length;

            for (int var8 = 0; var8 < this.field_864.length; var8++) {
               for (int var10 = 0; var10 < this.field_858.length; var10++) {
                  if (var1.getX() >= this.field_858[var10]
                     && var1.getX() <= this.field_858[var10] + this.field_859
                     && var1.getY() >= this.field_864[var8]
                     && var1.getY() <= this.field_864[var8] + this.field_860) {
                     this.field_876 = this.field_858[var10] - 2;
                     this.field_877 = this.field_864[var8] - 2;
                     if (var6 < this.field_421.field_3059[this.field_853].size()) {
                        if (var10 < this.field_858.length / 2) {
                           this.method_326(
                              ((class_30)this.field_421.field_3059[this.field_853].elementAt(var6)).method_245("0"), (byte)1, this.field_878.field_3010
                           );
                        } else {
                           this.method_326(
                              ((class_30)this.field_421.field_3059[this.field_853].elementAt(var6)).method_245("0"), (byte)0, this.field_878.field_3010
                           );
                        }
                     }

                     return;
                  }

                  var6++;
               }
            }
         }

         this.method_326(null, (byte)1, this.field_878.field_3010);
      }
   }

   // $VF: renamed from: l (java.awt.event.MouseEvent) void
   public void method_324(MouseEvent var1) {
      if (this.field_886.field_2993 != null) {
         for (int var2 = 0; var2 < this.field_904.length; var2++) {
            if (var1.getX() >= this.field_903
               && var1.getX() <= this.field_903 + this.field_905
               && var1.getY() >= this.field_904[var2]
               && var1.getY() <= this.field_904[var2] + this.field_906) {
               if (this.field_928.getText().equals("")) {
                  this.field_928.setText("1");
               } else if (var2 == 0) {
                  this.field_928.setText("" + (Integer.parseInt(this.field_928.getText()) + 1));
               } else if (Integer.parseInt(this.field_928.getText()) > 1) {
                  this.field_928.setText("" + (Integer.parseInt(this.field_928.getText()) - 1));
               }

               this.field_915 = true;
               return;
            }
         }

         if (!this.field_928.getText().trim().equals("")
            && var1.getX() > this.field_913
            && var1.getX() < this.field_913 + this.field_1284.method_254("en", 424)
            && var1.getY() > this.field_914
            && var1.getY() < this.field_914 + this.field_1284.method_254("en", 425)) {
            class_62.method_563("buy!");
            this.field_886.field_2993 = null;
            this.field_928.setVisible(false);
            this.field_927 = -1;
            if (!this.field_933.isVisible()) {
               this.field_933.setVisible(true);
            }

            if (this.field_836 == 0) {
               if (this.field_896) {
                  class_62.method_563("S5|" + this.field_429.method_881().toString() + "|" + this.field_931 + "|" + this.field_928.getText() + "\n");
                  this.field_435.write("S5|" + this.field_429.method_881().toString() + "|" + this.field_931 + "|" + this.field_928.getText() + "\n");
                  this.field_435.flush();
               } else {
                  class_62.method_563("S13|" + this.field_429.method_881().toString() + "|" + this.field_931 + "|" + this.field_928.getText() + "\n");
                  this.field_435.write("S13|" + this.field_429.method_881().toString() + "|" + this.field_931 + "|" + this.field_928.getText() + "\n");
                  this.field_435.flush();
               }
            } else if (this.field_836 == 1) {
               if (this.field_897) {
                  class_62.method_563("L8|" + this.field_931 + "|" + this.field_928.getText() + "\n");
                  this.field_435.write("L8|" + this.field_931 + "|" + this.field_928.getText() + "\n");
                  this.field_435.flush();
               } else {
                  class_62.method_563("L3|" + this.field_931 + "|" + this.field_928.getText() + "\n");
                  this.field_435.write("L3|" + this.field_931 + "|" + this.field_928.getText() + "\n");
                  this.field_435.flush();
               }
            }

            return;
         }

         if (var1.getX() > this.field_913 + this.field_1284.method_254("en", 424) + 3
            && var1.getX() < this.field_913 + this.field_1284.method_254("en", 424) + 3 + this.field_1284.method_254("en", 391)
            && var1.getY() > this.field_914
            && var1.getY() < this.field_914 + this.field_1284.method_254("en", 392)) {
            this.field_886.field_2993 = null;
            this.field_928.setVisible(false);
            this.field_927 = -1;
            return;
         }
      }

      if (this.field_886.field_2993 == null) {
         for (int var3 = 0; var3 < this.field_835.length; var3++) {
            if (var1.getX() >= this.field_837[var3]
               && var1.getX() <= this.field_837[var3] + this.field_839[var3]
               && var1.getY() >= this.field_838
               && var1.getY() <= this.field_838 + this.field_840) {
               this.field_836 = var3;
               this.field_842 = 0;
               this.field_865 = 0;
               this.field_876 = this.field_858[0] - 2;
               this.field_877 = this.field_863[0] - 2;
               return;
            }
         }

         switch (this.field_836) {
            case 0:
               for (int var5 = 0; var5 < this.field_841.length; var5++) {
                  if (var1.getX() >= this.field_843[var5]
                     && var1.getX() <= this.field_843[var5] + this.field_845[var5]
                     && var1.getY() >= this.field_844
                     && var1.getY() <= this.field_844 + this.field_846) {
                     this.field_842 = var5;
                     this.field_876 = this.field_858[0] - 2;
                     this.field_877 = this.field_863[0] - 2;
                     this.field_865 = 0;
                     class_62.method_563("currentShopItemTab = " + this.field_842);
                     return;
                  }
               }
               break;
            case 1:
               for (int var4 = 0; var4 < this.field_847.length; var4++) {
                  if (var1.getX() >= this.field_848[var4]
                     && var1.getX() <= this.field_848[var4] + this.field_850[var4]
                     && var1.getY() >= this.field_849
                     && var1.getY() <= this.field_849 + this.field_851) {
                     this.field_842 = var4;
                     this.field_865 = 0;
                     this.field_876 = this.field_858[0] - 2;
                     this.field_877 = this.field_863[0] - 2;
                     return;
                  }
               }
         }
      }

      if (this.field_886.field_2993 == null) {
         for (int var6 = 0; var6 < this.field_852.length; var6++) {
            if (var1.getX() >= this.field_854[var6]
               && var1.getX() <= this.field_854[var6] + this.field_856[var6]
               && var1.getY() >= this.field_855
               && var1.getY() <= this.field_855 + this.field_857) {
               this.field_853 = var6;
               this.field_865 = 0;
               this.field_876 = this.field_858[0] - 2;
               this.field_877 = this.field_864[0] - 2;
               return;
            }
         }
      }

      for (int var7 = 0; var7 < this.field_868.length; var7++) {
         if (var1.getX() >= this.field_867
            && var1.getX() <= this.field_867 + this.field_869
            && var1.getY() >= this.field_868[var7]
            && var1.getY() <= this.field_868[var7] + this.field_870) {
            switch (var7) {
               case 0:
                  if ((this.field_886.field_2993 == null || !this.field_896 || !this.field_897) && this.field_865 > 0) {
                     this.field_865--;
                  }

                  return;
               case 1:
                  if (this.field_886.field_2993 == null || !this.field_896 || !this.field_897) {
                     switch (this.field_836) {
                        case 0:
                           if (this.field_858.length * (this.field_865 + this.field_863.length) < this.field_861[this.field_842].size()) {
                              this.field_865++;
                           }

                           return;
                        case 1:
                           if (this.field_858.length * (this.field_865 + this.field_863.length) < this.field_862[this.field_842].size()) {
                              this.field_865++;
                           }

                           return;
                     }
                  }

                  return;
               case 2:
                  if ((this.field_886.field_2993 == null || this.field_896 || this.field_897) && this.field_866 > 0) {
                     this.field_866--;
                  }

                  return;
               case 3:
                  if ((this.field_886.field_2993 == null || this.field_896 || this.field_897)
                     && this.field_858.length * (this.field_866 + this.field_863.length) < this.field_421.field_3059[this.field_853].size()) {
                     this.field_866++;
                  }

                  return;
            }
         }
      }

      if (var1.getX() > this.field_1284.method_254("en", 383)
         && var1.getX() < this.field_1284.method_254("en", 383) + this.field_1284.method_254("en", 385)
         && var1.getY() > this.field_1284.method_254("en", 384)
         && var1.getY() < this.field_1284.method_254("en", 384) + this.field_1284.method_254("en", 386)) {
         this.field_435.write("S4\n");
         this.field_435.flush();
         this.field_933.setVisible(false);
         this.field_928.setVisible(false);
         this.field_927 = -1;
         class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
         this.field_429.method_798();
         this.method_297((byte)0, null);
      } else if (var1.getX() == this.field_920 && var1.getY() == this.field_921 && this.field_922 >= System.currentTimeMillis()) {
         this.method_325(var1);
         this.field_920 = 0;
         this.field_921 = 0;
         this.field_922 = 0L;
      } else {
         this.field_920 = var1.getX();
         this.field_921 = var1.getY();
         this.field_922 = System.currentTimeMillis() + 300L;
      }
   }

   // $VF: renamed from: m (java.awt.event.MouseEvent) void
   public void method_325(MouseEvent var1) {
      if (this.field_886.field_2993 == null) {
         if (this.field_836 == 0) {
            int var2 = this.field_865 * this.field_858.length;

            for (int var3 = 0; var3 < this.field_863.length; var3++) {
               for (int var4 = 0; var4 < this.field_858.length; var4++) {
                  if (var1.getX() >= this.field_858[var4]
                     && var1.getX() <= this.field_858[var4] + this.field_859
                     && var1.getY() >= this.field_863[var3]
                     && var1.getY() <= this.field_863[var3] + this.field_860) {
                     this.field_896 = true;
                     this.field_884 = this.field_858[var4] - 2;
                     this.field_885 = this.field_863[var3] - 2;
                     if (var2 < this.field_861[this.field_842].size()) {
                        if (var4 < this.field_858.length / 2) {
                           this.method_326(
                              ((class_30)this.field_861[this.field_842].elementAt(var2)).method_245("Out of Stock"), (byte)1, this.field_886.field_3010
                           );
                        } else {
                           this.method_326(
                              ((class_30)this.field_861[this.field_842].elementAt(var2)).method_245("Out of Stock"), (byte)0, this.field_886.field_3010
                           );
                        }
                     }

                     this.field_928.setText("1");
                     ((class_32)this.field_928.getDocument()).method_250(((class_30)this.field_861[this.field_842].elementAt(var2)).method_236());
                     this.field_931 = ((class_30)this.field_861[this.field_842].elementAt(var2)).method_234().method_179();
                     this.field_932 = ((class_30)this.field_861[this.field_842].elementAt(var2)).method_234().method_183();
                     this.field_929 = ((class_30)this.field_861[this.field_842].elementAt(var2)).method_238();
                     return;
                  }

                  var2++;
               }
            }
         } else if (this.field_836 == 1) {
            int var5 = this.field_865 * this.field_858.length;

            for (int var7 = 0; var7 < this.field_863.length; var7++) {
               for (int var9 = 0; var9 < this.field_858.length; var9++) {
                  if (var1.getX() >= this.field_858[var9]
                     && var1.getX() <= this.field_858[var9] + this.field_859
                     && var1.getY() >= this.field_863[var7]
                     && var1.getY() <= this.field_863[var7] + this.field_860) {
                     this.field_897 = true;
                     this.field_884 = this.field_858[var9] - 2;
                     this.field_885 = this.field_863[var7] - 2;
                     if (var5 < this.field_862[this.field_842].size()) {
                        if (var9 < this.field_858.length / 2) {
                           this.method_326(
                              ((class_30)this.field_862[this.field_842].elementAt(var5)).method_245("Out of Stock"), (byte)1, this.field_886.field_3010
                           );
                        } else {
                           this.method_326(
                              ((class_30)this.field_862[this.field_842].elementAt(var5)).method_245("Out of Stock"), (byte)0, this.field_886.field_3010
                           );
                        }
                     }

                     this.field_928.setText("1");
                     ((class_32)this.field_928.getDocument()).method_250(((class_30)this.field_862[this.field_842].elementAt(var5)).method_236());
                     this.field_931 = ((class_30)this.field_862[this.field_842].elementAt(var5)).method_234().method_179();
                     this.field_932 = ((class_30)this.field_862[this.field_842].elementAt(var5)).method_234().method_183();
                     this.field_929 = ((class_30)this.field_862[this.field_842].elementAt(var5)).method_238();
                     return;
                  }

                  var5++;
               }
            }
         }

         int var6 = this.field_866 * this.field_858.length;

         for (int var8 = 0; var8 < this.field_864.length; var8++) {
            for (int var10 = 0; var10 < this.field_858.length; var10++) {
               if (var1.getX() >= this.field_858[var10]
                  && var1.getX() <= this.field_858[var10] + this.field_859
                  && var1.getY() >= this.field_864[var8]
                  && var1.getY() <= this.field_864[var8] + this.field_860) {
                  if (this.field_836 == 0) {
                     this.field_896 = false;
                  } else if (this.field_836 == 1) {
                     this.field_897 = false;
                  }

                  this.field_884 = this.field_858[var10] - 2;
                  this.field_885 = this.field_864[var8] - 2;
                  if (var6 < this.field_421.field_3059[this.field_853].size()) {
                     if (var10 < this.field_858.length / 2) {
                        this.method_326(
                           ((class_30)this.field_421.field_3059[this.field_853].elementAt(var6)).method_245("0"), (byte)1, this.field_886.field_3010
                        );
                     } else if (var10 == this.field_858.length - 1) {
                        this.method_326(
                           ((class_30)this.field_421.field_3059[this.field_853].elementAt(var6)).method_245("0"), (byte)2, this.field_886.field_3010
                        );
                     } else {
                        this.method_326(
                           ((class_30)this.field_421.field_3059[this.field_853].elementAt(var6)).method_245("0"), (byte)0, this.field_886.field_3010
                        );
                     }
                  }

                  ((class_32)this.field_928.getDocument()).method_250(((class_30)this.field_421.field_3059[this.field_853].elementAt(var6)).method_236());
                  switch (this.field_853) {
                     case 0:
                        this.field_928.setText("1");
                        break;
                     case 1:
                        this.field_928.setText("1");
                        break;
                     case 2:
                        this.field_928.setText("" + ((class_32)this.field_928.getDocument()).method_251());
                        break;
                     case 3:
                        this.field_928.setText("" + ((class_32)this.field_928.getDocument()).method_251());
                  }

                  this.field_931 = ((class_30)this.field_421.field_3059[this.field_853].elementAt(var6)).method_234().method_179();
                  this.field_932 = ((class_30)this.field_421.field_3059[this.field_853].elementAt(var6)).method_234().method_183();
                  this.field_929 = ((class_30)this.field_421.field_3059[this.field_853].elementAt(var6)).method_238();
                  return;
               }

               var6++;
            }
         }
      }
   }

   // $VF: renamed from: a (java.lang.String, byte, byte) void
   public void method_326(String var1, byte var2, byte var3) {
      int var4 = this.field_876 + this.field_859 / 2;
      int var5 = this.field_877 + this.field_860 / 3 * 2;
      if (var5 + 150 > 580) {
         var5 -= 150;
      }

      switch (var2) {
         case 0:
            var4 = var4 - this.field_879 - 15;
         case 1:
         default:
            break;
         case 2:
            var4 -= this.field_879;
            var4 -= this.field_859 / 2;
      }

      switch (var3) {
         case 2:
            this.field_878.method_805(var1, var4, var5, this.field_879, this.field_880, MastersOfDestiny.field_2809, null);
            break;
         case 3:
            if (var4 + 300 > 420) {
               var4 -= 70;
            }

            this.field_886.method_805(var1, var4, var5, this.field_879, this.field_880, MastersOfDestiny.field_2809, null);
            this.field_901 = var4 + this.field_879 + 6 + 2;
            this.field_902 = var5 + MastersOfDestiny.field_2809.getHeight() + MastersOfDestiny.field_2809.getHeight() / 2;
            this.field_928.setBounds(this.field_901 + 3, this.field_902 + 5, this.field_1284.method_254("en", 398), this.field_1284.method_254("en", 399));
            this.field_928.setVisible(true);
            this.field_928.requestFocusInWindow();
            this.field_903 = this.field_901 + this.field_1284.method_254("en", 398) + 4;
            this.field_904[0] = this.field_902;
            this.field_904[1] = this.field_902 + this.field_905;
            this.field_908 = this.field_901;
            this.field_909 = this.field_902
               + this.field_900.getIconHeight()
               + MastersOfDestiny.field_2809.getHeight()
               + MastersOfDestiny.field_2809.getHeight() / 2;
            this.field_910 = this.field_908 + 1 + 5;
            this.field_911 = this.field_909 + this.field_907.getIconHeight() - 1 - 3;
            this.field_913 = this.field_908 + 1;
            this.field_914 = var5 + this.field_886.field_2999 - this.field_912.getIconHeight() - MastersOfDestiny.field_2809.getHeight() / 2;
      }
   }

   // $VF: renamed from: n (java.awt.event.MouseEvent) void
   public void method_327(MouseEvent var1) {
      if (this.field_886.field_2993 == null) {
         switch (this.field_836) {
            case 0:
               int var2 = this.field_865 * this.field_858.length;

               for (int var8 = 0; var8 < this.field_863.length; var8++) {
                  for (int var10 = 0; var10 < this.field_858.length; var10++) {
                     if (var1.getX() >= this.field_858[var10]
                        && var1.getX() <= this.field_858[var10] + this.field_859
                        && var1.getY() >= this.field_863[var8]
                        && var1.getY() <= this.field_863[var8] + this.field_860
                        && var2 < this.field_861[this.field_842].size()) {
                        class_30 var12 = (class_30)this.field_861[this.field_842].elementAt(var2);
                        if (var12.method_236() != 0) {
                           this.field_893 = var1.getX();
                           this.field_894 = var1.getY();
                           this.field_896 = true;
                           this.field_892 = var12.method_234().method_181();
                           ((class_32)this.field_928.getDocument()).method_250(var12.method_236());
                           this.field_931 = var12.method_234().method_179();
                           this.field_932 = var12.method_234().method_183();
                           this.field_929 = var12.method_238();
                        }
                     }

                     var2++;
                  }
               }
               break;
            case 1:
               int var3 = this.field_865 * this.field_858.length;

               for (int var4 = 0; var4 < this.field_863.length; var4++) {
                  for (int var5 = 0; var5 < this.field_858.length; var5++) {
                     if (var1.getX() >= this.field_858[var5]
                        && var1.getX() <= this.field_858[var5] + this.field_859
                        && var1.getY() >= this.field_863[var4]
                        && var1.getY() <= this.field_863[var4] + this.field_860
                        && var3 < this.field_862[this.field_842].size()) {
                        class_30 var6 = (class_30)this.field_862[this.field_842].elementAt(var3);
                        if (var6.method_236() != 0) {
                           this.field_893 = var1.getX();
                           this.field_894 = var1.getY();
                           this.field_897 = true;
                           this.field_892 = var6.method_234().method_181();
                           ((class_32)this.field_928.getDocument()).method_250(var6.method_236());
                           this.field_931 = var6.method_234().method_179();
                           this.field_932 = var6.method_234().method_183();
                           this.field_929 = 0L;
                        }
                     }

                     var3++;
                  }
               }
         }

         int var7 = this.field_866 * this.field_858.length;

         for (int var9 = 0; var9 < this.field_864.length; var9++) {
            for (int var11 = 0; var11 < this.field_858.length; var11++) {
               if (var1.getX() >= this.field_858[var11]
                  && var1.getX() <= this.field_858[var11] + this.field_859
                  && var1.getY() >= this.field_864[var9]
                  && var1.getY() <= this.field_864[var9] + this.field_860
                  && var7 < this.field_421.field_3059[this.field_853].size()) {
                  class_30 var13 = (class_30)this.field_421.field_3059[this.field_853].elementAt(var7);
                  if (var13.method_236() != 0) {
                     this.field_893 = var1.getX();
                     this.field_894 = var1.getY();
                     this.field_896 = false;
                     this.field_897 = false;
                     this.field_892 = var13.method_234().method_181();
                     ((class_32)this.field_928.getDocument()).method_250(var13.method_236());
                     this.field_931 = var13.method_234().method_179();
                     this.field_932 = var13.method_234().method_183();
                     if (this.field_836 == 0) {
                        this.field_929 = var13.method_238();
                     } else {
                        this.field_929 = 10L;
                     }
                  }
               }

               var7++;
            }
         }
      }
   }

   // $VF: renamed from: o (java.awt.event.MouseEvent) void
   public void method_328(MouseEvent var1) {
      if (this.field_892 != null) {
         this.field_893 = var1.getX();
         this.field_894 = var1.getY();
      }
   }

   // $VF: renamed from: p (java.awt.event.MouseEvent) void
   public void method_329(MouseEvent var1) {
      if (this.field_892 != null) {
         if (this.field_836 == 0) {
            if (this.field_896) {
               if (var1.getX() >= this.field_858[0]
                  && var1.getX() <= this.field_858[this.field_858.length - 1] + this.field_859
                  && var1.getY() >= this.field_864[0]
                  && var1.getY() <= this.field_864[this.field_864.length - 1] + this.field_860) {
                  this.field_884 = this.field_876;
                  this.field_885 = this.field_877;
                  if (this.field_884 < this.field_858[(this.field_858.length - 1) / 2]) {
                     this.method_326(this.field_878.field_2993.substring(0), (byte)1, this.field_886.field_3010);
                  } else {
                     this.method_326(this.field_878.field_2993.substring(0), (byte)0, this.field_886.field_3010);
                  }

                  this.field_928.setText("1");
               }
            } else if (var1.getX() >= this.field_858[0]
               && var1.getX() <= this.field_858[this.field_858.length - 1] + this.field_859
               && var1.getY() >= this.field_863[0]
               && var1.getY() <= this.field_863[this.field_863.length - 1] + this.field_860) {
               this.field_884 = this.field_876;
               this.field_885 = this.field_877;
               if (this.field_884 < this.field_858[(this.field_858.length - 1) / 2]) {
                  this.method_326(this.field_878.field_2993.substring(0), (byte)1, this.field_886.field_3010);
               } else {
                  this.method_326(this.field_878.field_2993.substring(0), (byte)0, this.field_886.field_3010);
               }

               switch (this.field_853) {
                  case 0:
                     this.field_928.setText("1");
                     break;
                  case 1:
                     this.field_928.setText("1");
                     break;
                  case 2:
                     this.field_928.setText("" + ((class_32)this.field_928.getDocument()).method_251());
                     break;
                  case 3:
                     this.field_928.setText("" + ((class_32)this.field_928.getDocument()).method_251());
               }
            }
         } else if (this.field_836 == 1) {
            if (this.field_897) {
               if (var1.getX() >= this.field_858[0]
                  && var1.getX() <= this.field_858[this.field_858.length - 1] + this.field_859
                  && var1.getY() >= this.field_864[0]
                  && var1.getY() <= this.field_864[this.field_864.length - 1] + this.field_860) {
                  this.field_884 = this.field_876;
                  this.field_885 = this.field_877;
                  if (this.field_884 < this.field_858[(this.field_858.length - 1) / 2]) {
                     this.method_326(this.field_878.field_2993.substring(0), (byte)1, this.field_886.field_3010);
                  } else {
                     this.method_326(this.field_878.field_2993.substring(0), (byte)0, this.field_886.field_3010);
                  }

                  this.field_928.setText("1");
               }
            } else if (var1.getX() >= this.field_858[0]
               && var1.getX() <= this.field_858[this.field_858.length - 1] + this.field_859
               && var1.getY() >= this.field_863[0]
               && var1.getY() <= this.field_863[this.field_863.length - 1] + this.field_860) {
               this.field_884 = this.field_876;
               this.field_885 = this.field_877;
               if (this.field_884 < this.field_858[(this.field_858.length - 1) / 2]) {
                  this.method_326(this.field_878.field_2993.substring(0), (byte)1, this.field_886.field_3010);
               } else {
                  this.method_326(this.field_878.field_2993.substring(0), (byte)0, this.field_886.field_3010);
               }

               switch (this.field_853) {
                  case 0:
                     this.field_928.setText("1");
                     break;
                  case 1:
                     this.field_928.setText("1");
                     break;
                  case 2:
                     this.field_928.setText("" + ((class_32)this.field_928.getDocument()).method_251());
                     break;
                  case 3:
                     this.field_928.setText("" + ((class_32)this.field_928.getDocument()).method_251());
               }
            }
         }

         this.field_892 = null;
      }
   }

   // $VF: renamed from: e (java.awt.event.KeyEvent) void
   public void method_330(KeyEvent var1) {
   }

   // $VF: renamed from: a () void
   public void method_331() {
      this.field_935 = new JTextPane();
      this.field_935.setEditable(false);
      this.field_935.setSelectionColor(new Color(14540253));
      this.field_935.setOpaque(false);
      this.field_935.addKeyListener(new class_55(this));
      this.field_936 = this.field_935.getDocument();
      this.field_933 = new JScrollPane(this.field_935, 20, 31);
      this.field_934 = this.field_933.getVerticalScrollBar();
      this.field_933.setOpaque(false);
      this.field_933
         .setBounds(
            this.field_1284.method_254("en", 430) + 2,
            this.field_1284.method_254("en", 431) + MastersOfDestiny.field_2813.getHeight() + 2,
            this.field_1284.method_254("en", 432) - 4,
            59
         );
      field_1274.add(this.field_933);
      this.field_933.setVisible(false);
   }

   // $VF: renamed from: b () void
   public void method_332() {
      if (this.field_928 == null) {
         this.field_1013 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 434)));
         this.field_928 = new JTextField();
         this.field_928
            .setBounds(
               this.field_1284.method_254("en", 396),
               this.field_1284.method_254("en", 397),
               this.field_1284.method_254("en", 398),
               this.field_1284.method_254("en", 399)
            );
         this.field_928.setBackground(new Color(14737632));
         this.field_928.setBorder(BorderFactory.createLineBorder(new Color(14737632)));
         this.field_928.setForeground(new Color(8092539));
         this.field_928.setSelectedTextColor(new Color(8092539));
         this.field_928.setSelectionColor(new Color(11711154));
         this.field_928.setCaretColor(new Color(8092539));
         this.field_928.setVisible(false);
         field_1274.add(this.field_928);
         this.field_928.setDocument(new class_32(5));
         this.field_928.getDocument().addDocumentListener(new class_44(this));
         this.field_928.addActionListener(new class_41(this));
      }
   }

   // $VF: renamed from: h (java.lang.Object) void
   public void method_333(Object var1) {
      switch (field_437) {
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            this.field_937 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 351)));
            break;
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
            this.field_937 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1166)));
            break;
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
            this.field_937 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1072)));
            break;
         case 16:
         case 17:
         case 18:
         case 19:
            this.field_937 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1173)));
      }

      this.field_938 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1185)));
      this.field_939 = this.field_1284.method_254("en", 1186);
      this.field_940 = this.field_1284.method_254("en", 1187);
      this.field_1036 = new Icon[4];
      this.field_1036[0] = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 1224)));
      this.field_1036[1] = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 1229)));
      this.field_1036[2] = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 1222)));
      this.field_1036[3] = new ImageIcon(this.getClass().getResource(this.field_1281.method_504("en", 1223)));
      this.field_1039 = -1;
      this.field_1037 = 0;
      this.field_1038 = 0;
      this.field_941 = new Icon[2];
      this.field_941[0] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 369)));
      this.field_941[1] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 370)));
      this.field_942 = 0;
      this.field_943 = new int[2];
      this.field_943 = this.field_1284.method_257("en", 371);
      this.field_944 = this.field_1284.method_254("en", 372);
      this.field_945 = this.field_1284.method_254("en", 373);
      this.field_946 = this.field_1284.method_254("en", 374);
      this.field_947 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 378)));

      try {
         InputStream var2 = this.getClass().getResourceAsStream("res/hospital/heal.txt");
         if (var2 != null) {
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();

            int var4;
            while ((var4 = var2.read()) != -1) {
               var3.write(var4);
            }

            var2.close();
            this.field_971 = new String(var3.toByteArray(), "utf-8");
            class_62.method_563(this.field_971);
         } else {
            class_62.method_563("heal txt null");
         }
      } catch (IOException var6) {
         class_62.method_563(var6.getMessage());
      }

      this.field_953 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1179)));
      this.field_954 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1178)));
      if (this.field_971 != null) {
         this.field_972 = this.field_971.split("\n");
         int var7 = this.field_972.length;
         this.field_957 = new Icon[var7];
         this.field_958 = new String[var7];
         this.field_959 = new String[var7];
         this.field_955 = 0;
         this.field_956 = 0;

         for (int var8 = 0; var8 < var7; var8++) {
            String[] var9 = this.field_972[var8].split("\\|");
            if (var9[0].equalsIgnoreCase("H")) {
               this.field_957[var8] = this.field_953;
               this.field_955++;
            } else {
               this.field_957[var8] = this.field_954;
               this.field_956++;
            }

            this.field_958[var8] = var9[1];
            this.field_959[var8] = var9[2];
         }
      } else {
         this.field_957 = new Icon[6];
         this.field_957[0] = this.field_953;
         this.field_957[1] = this.field_953;
         this.field_957[2] = this.field_953;
         this.field_957[3] = this.field_954;
         this.field_957[4] = this.field_954;
         this.field_957[5] = this.field_954;
         this.field_958 = new String[6];
         this.field_958[0] = "Light HP Heal";
         this.field_958[1] = "Medium HP Heal";
         this.field_958[2] = "Large HP Heal";
         this.field_958[3] = "Light Energy Recovery";
         this.field_958[4] = "Medium Energy Recovery";
         this.field_958[5] = "Large Energy Recovery";
         this.field_959 = new String[6];
         this.field_959[0] = "Heals 20 HP. 7 Sidos.";
         this.field_959[1] = "Heals 50 HP. 12 Sidos.";
         this.field_959[2] = "Heals 100 HP. 17 Sidos.";
         this.field_959[3] = "Recovers 20 Energy. 7 Sidos.";
         this.field_959[4] = "Recovers 50 Energy. 12 Sidos.";
         this.field_959[5] = "Recovers 100 Energy. 17 Sidos.";
         this.field_955 = 3;
         this.field_956 = 3;
      }

      this.field_960 = -1;
      this.field_961 = 0;
      this.field_962 = this.field_1284.method_254("en", 1180);
      this.field_963 = this.field_1284.method_257("en", 1181);
      this.field_967 = this.field_1284.method_254("en", 1188);
      this.field_968 = this.field_1284.method_257("en", 1189);
      this.field_969 = this.field_1284.method_254("en", 1190);
      this.field_970 = this.field_1284.method_254("en", 1191);
      this.field_964 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1182)));
      this.field_965 = this.field_1284.method_254("en", 1183);
      this.field_966 = this.field_1284.method_254("en", 1184);
      this.field_973 = new Icon[4];
      this.field_973[0] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1192)));
      this.field_973[1] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1214)));
      this.field_973[2] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1215)));
      this.field_973[3] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1216)));
      this.field_974 = this.field_1284.method_254("en", 1193);
      this.field_975 = this.field_1284.method_254("en", 1194);
      this.field_976 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1195)));
      this.field_977 = this.field_1284.method_254("en", 1196);
      this.field_978 = this.field_1284.method_254("en", 1197);
      this.field_979 = this.field_1284.method_254("en", 1198);
      this.field_980 = this.field_1284.method_254("en", 1199);
      this.field_948 = 0;
      this.field_949 = 86;
      this.field_950 = this.field_1284.method_254("en", 380);
      this.field_951 = this.field_1284.method_257("en", 381);
      this.field_952 = this.field_1284.method_254("en", 382);
      this.field_981 = this.field_1284.method_257("en", 352);
      this.field_982 = this.field_1284.method_254("en", 355);
      this.field_983 = this.field_1284.method_254("en", 356);
      this.field_984 = new Vector();
      this.field_985 = this.field_1284.method_257("en", 353);
      this.field_986 = this.field_1284.method_257("en", 354);
      this.field_987 = 0;
      this.field_988 = 0;
      this.field_989 = this.field_1284.method_254("en", 357);
      this.field_990 = this.field_1284.method_257("en", 358);
      this.field_991 = this.field_1284.method_254("en", 359);
      this.field_992 = this.field_1284.method_254("en", 360);
      this.field_997 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 293)));
      this.field_998 = this.field_981[0] - 2;
      this.field_999 = this.field_985[0] - 2;
      this.field_1000 = class_87.method_803();
      this.field_1000.method_804((byte)2);
      this.field_1000.g();
      this.field_1001 = 158;
      this.field_1002 = 17;
      this.field_1008 = class_87.method_803();
      this.field_1008.method_804((byte)3);
      this.field_1008.g();
      this.field_1012 = true;
      this.field_1014 = this.field_1284.method_254("en", 387);
      this.field_1015 = this.field_1284.method_254("en", 388);
      this.method_332();
      this.method_331();
      this.field_933
         .setBounds(
            this.field_1284.method_254("en", 430) + 2,
            this.field_1284.method_254("en", 431) + MastersOfDestiny.field_2813.getHeight() - 30,
            this.field_1284.method_254("en", 432) - 4,
            59
         );
      this.field_933.setVisible(false);

      try {
         this.field_936.remove(0, this.field_936.getLength());
         this.field_936.insertString(this.field_936.getLength(), "Hospital Transaction History", field_1274.field_2787);
      } catch (BadLocationException var5) {
         class_62.method_563(var5.getMessage());
      }

      this.field_1016 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 434)));
      this.field_1019 = this.field_1284.method_254("en", 400);
      this.field_1020 = this.field_1284.method_257("en", 401);
      this.field_1021 = this.field_1284.method_254("en", 402);
      this.field_1022 = this.field_1284.method_254("en", 403);
      this.field_1023 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 433)));
      this.field_1028 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 435)));
      this.field_1031 = false;
      this.field_1032 = 0;
      this.field_1033 = 0;
      this.field_1034 = 0L;
      this.field_1040 = false;
      this.field_435.write("H1\n");
      this.field_435.flush();
      this.field_435.write("H13\n");
      this.field_435.flush();
   }

   // $VF: renamed from: c (av) void
   public void method_334(class_30 var1) {
      this.field_984.add(var1);
   }

   // $VF: renamed from: h (java.awt.Graphics) void
   public void method_335(Graphics var1) {
      this.field_937.paintIcon(field_1274, var1, 0, 0);
      this.field_941[this.field_942].paintIcon(field_1274, var1, this.field_943[this.field_942], this.field_944);
      if (!this.field_933.isVisible()) {
         var1.setColor(new Color(7763574));
         var1.setFont(MastersOfDestiny.field_2829);
         var1.drawString("Welcome, adventurer.", 455, 409);
         var1.drawString("What would you like to buy?", 455, 430);
      }

      if (this.field_942 == 0) {
         int var2 = this.field_987 * this.field_981.length;

         for (int var3 = 0; var3 < this.field_985.length; var3++) {
            for (int var4 = 0; var4 < this.field_981.length; var4++) {
               if (var2 < this.field_984.size()) {
                  ((class_30)this.field_984.elementAt(var2)).method_234().method_181().paintIcon(field_1274, var1, this.field_981[var4], this.field_985[var3]);
                  long var5 = ((class_30)this.field_984.elementAt(var2)).method_236();
                  if (var5 > 0L) {
                     var1.setColor(new Color(16777215));
                     var1.setFont(MastersOfDestiny.field_2806);
                     var1.drawString(var5 + "", this.field_981[var4] + 2, this.field_985[var3] + 9);
                  }

                  var2++;
               }
            }
         }

         this.field_947.paintIcon(field_1274, var1, this.field_949, this.field_950);
         int var9 = this.field_988 * this.field_981.length;

         for (int var10 = 0; var10 < this.field_986.length; var10++) {
            for (int var12 = 0; var12 < this.field_981.length; var12++) {
               if (var9 < this.field_421.field_3059[3].size()) {
                  ((class_30)this.field_421.field_3059[3].elementAt(var9))
                     .method_234()
                     .method_181()
                     .paintIcon(field_1274, var1, this.field_981[var12], this.field_986[var10]);
                  var1.setColor(new Color(16777215));
                  var1.setFont(MastersOfDestiny.field_2806);
                  var1.drawString(
                     "" + ((class_30)this.field_421.field_3059[3].elementAt(var9)).method_236(), this.field_981[var12] + 2, this.field_986[var10] + 9
                  );
                  var9++;
               }
            }
         }

         long var11 = this.field_421.method_821();
         var1.setColor(new Color(0));
         var1.setFont(MastersOfDestiny.field_2810);
         var1.drawString("" + var11 + "/" + this.field_421.method_819(), 139, 520);
         this.field_997.paintIcon(field_1274, var1, this.field_998, this.field_999);
         if (this.field_1000.field_2993 != null) {
            var1.setFont(MastersOfDestiny.field_2808);
            this.field_1000.method_793(var1, field_1274);
         }

         if (this.field_1008.field_2993 != null) {
            this.field_997.paintIcon(field_1274, var1, this.field_1006, this.field_1007);
            var1.setFont(MastersOfDestiny.field_2808);
            this.field_1008.method_793(var1, field_1274);
            var1.setColor(new Color(16777215));
            var1.setFont(MastersOfDestiny.field_2808);
            var1.drawString("Quantity:", this.field_1017, this.field_1018 - 4);
            this.field_1016.paintIcon(field_1274, var1, this.field_1017, this.field_1018);
            var1.setColor(new Color(16777215));
            var1.setFont(MastersOfDestiny.field_2808);
            var1.drawString("Cost:", this.field_1024, this.field_1025 - 4);
            this.field_1023.paintIcon(field_1274, var1, this.field_1024, this.field_1025);
            var1.setColor(new Color(0));
            var1.setFont(MastersOfDestiny.field_2810);
            var1.drawString("" + this.field_930, this.field_1026, this.field_1027);
            this.field_1028.paintIcon(field_1274, var1, this.field_1029, this.field_1030);
         }

         if (this.field_1009 != null) {
            this.field_1009.paintIcon(field_1274, var1, this.field_1010, this.field_1011);
         }
      } else {
         this.field_938.paintIcon(field_1274, var1, this.field_939, this.field_940);
         if (this.field_960 >= this.field_961) {
            this.field_964.paintIcon(field_1274, var1, this.field_962 - 14, this.field_963[this.field_960 - this.field_961] - 3);
         }

         this.field_976.paintIcon(field_1274, var1, this.field_977, this.field_978);
         if (this.field_957.length - this.field_961 > 4) {
            for (int var8 = 0; var8 < 4; var8++) {
               this.field_957[var8 + this.field_961].paintIcon(field_1274, var1, this.field_962, this.field_963[var8]);
               var1.setColor(new Color(8254201));
               var1.setFont(MastersOfDestiny.field_2810);
               var1.drawString(this.field_958[var8 + this.field_961], this.field_962 + 54, this.field_963[var8] + 12);
               var1.setColor(new Color(16777215));
               var1.drawString(this.field_959[var8 + this.field_961], this.field_962 + 54, this.field_963[var8] + 31);
            }
         } else {
            for (int var7 = this.field_961; var7 < this.field_957.length; var7++) {
               this.field_957[var7].paintIcon(field_1274, var1, this.field_962, this.field_963[var7 - this.field_961]);
               var1.setColor(new Color(8254201));
               var1.setFont(MastersOfDestiny.field_2810);
               var1.drawString(this.field_958[var7], this.field_962 + 54, this.field_963[var7 - this.field_961] + 12);
               var1.setColor(new Color(16777215));
               var1.drawString(this.field_959[var7], this.field_962 + 54, this.field_963[var7 - this.field_961] + 31);
            }
         }

         this.field_973[field_1214 - 1].paintIcon(field_1274, var1, this.field_974, this.field_975);
         var1.setColor(new Color(16777215));
         var1.setFont(MastersOfDestiny.field_2812);
         var1.drawString(field_1213, 224, 426);
         var1.drawString("HP: " + this.field_421.method_815() + "/" + this.field_421.method_817(), 224, 448);
         var1.drawString("EN: " + this.field_421.method_825() + "/" + this.field_421.method_823(), 224, 470);
      }

      var1.setColor(new Color(0));
      var1.setFont(MastersOfDestiny.field_2810);
      var1.drawString("" + field_438, 284, 520);
      if (this.field_1039 != -1) {
         this.field_1036[this.field_1039].paintIcon(field_1274, var1, this.field_1037, this.field_1038);
      }

      if (this.field_1040) {
         var1.setColor(new Color(15790320));
         var1.fillRect(447, 393, 236, 77);
         var1.setColor(new Color(0));
         var1.setFont(MastersOfDestiny.field_2812);
         var1.drawString("Sorry", 565 - var1.getFontMetrics().stringWidth("Sorry") / 2, 393 + var1.getFontMetrics().getHeight());
         var1.setColor(new Color(8092539));
         var1.setFont(MastersOfDestiny.field_2808);
         var1.drawString("There is no hospital available", 452, 393 + var1.getFontMetrics().getHeight() * 2);
         var1.drawString("at the moment.", 452, 393 + var1.getFontMetrics().getHeight() * 3);
         var1.drawString("Please check back again", 452, 447 + var1.getFontMetrics().getHeight() * 5);
      }
   }

   // $VF: renamed from: q (java.awt.event.MouseEvent) void
   public void method_336(MouseEvent var1) {
      if (var1.getX() == this.field_1032 && var1.getY() == this.field_1033 && this.field_1034 >= System.currentTimeMillis()) {
         this.method_337(var1);
         this.field_1032 = 0;
         this.field_1033 = 0;
         this.field_1034 = 0L;
      } else {
         if (this.field_1008.field_2993 == null) {
            for (int var2 = 0; var2 < this.field_941.length; var2++) {
               if (var1.getX() >= this.field_943[var2]
                  && var1.getX() <= this.field_943[var2] + this.field_945
                  && var1.getY() >= this.field_944
                  && var1.getY() <= this.field_944 + this.field_946) {
                  this.field_942 = var2;
                  return;
               }
            }
         }

         if (this.field_942 == 0) {
            if (this.field_1008.field_2993 != null) {
               for (int var3 = 0; var3 < this.field_1020.length; var3++) {
                  if (var1.getX() >= this.field_1019
                     && var1.getX() <= this.field_1019 + this.field_1021
                     && var1.getY() >= this.field_1020[var3]
                     && var1.getY() <= this.field_1020[var3] + this.field_1022) {
                     if (this.field_928.getText().equals("")) {
                        this.field_928.setText("1");
                     } else if (var3 == 0) {
                        this.field_928.setText("" + (Integer.parseInt(this.field_928.getText()) + 1));
                     } else if (Integer.parseInt(this.field_928.getText()) > 1) {
                        this.field_928.setText("" + (Integer.parseInt(this.field_928.getText()) - 1));
                     }

                     this.field_1031 = true;
                     return;
                  }
               }

               if (!this.field_928.getText().trim().equals("")
                  && var1.getX() > this.field_1029
                  && var1.getX() < this.field_1029 + this.field_1284.method_254("en", 424)
                  && var1.getY() > this.field_1030
                  && var1.getY() < this.field_1030 + this.field_1284.method_254("en", 425)) {
                  class_62.method_563("buy!");
                  this.field_1008.field_2993 = null;
                  this.field_928.setVisible(false);
                  this.field_1039 = -1;
                  if (!this.field_933.isVisible()) {
                     this.field_933.setVisible(true);
                  }

                  if (this.field_1012) {
                     class_62.method_563("buy");
                     class_62.method_563("H6|" + this.field_931 + "|" + this.field_928.getText() + "\n");
                     this.field_435.write("H6|" + this.field_931 + "|" + this.field_928.getText() + "\n");
                     this.field_435.flush();
                  } else {
                     class_62.method_563("sell");
                     class_62.method_563("H19|" + this.field_931 + "|" + this.field_928.getText() + "\n");
                     this.field_435.write("H19|" + this.field_931 + "|" + this.field_928.getText() + "\n");
                     this.field_435.flush();
                  }

                  return;
               }

               if (var1.getX() > this.field_1029 + this.field_1284.method_254("en", 424) + 3
                  && var1.getX() < this.field_1029 + this.field_1284.method_254("en", 424) + 3 + this.field_1284.method_254("en", 391)
                  && var1.getY() > this.field_1030
                  && var1.getY() < this.field_1030 + this.field_1284.method_254("en", 392)) {
                  this.field_1008.field_2993 = null;
                  this.field_928.setVisible(false);
                  this.field_1039 = -1;
                  return;
               }
            } else {
               for (int var4 = 0; var4 < this.field_990.length; var4++) {
                  if (var1.getX() >= this.field_989
                     && var1.getX() <= this.field_989 + this.field_991
                     && var1.getY() >= this.field_990[var4]
                     && var1.getY() <= this.field_990[var4] + this.field_992) {
                     switch (var4) {
                        case 0:
                           if ((this.field_1008.field_2993 == null || !this.field_1012) && this.field_987 > 0) {
                              this.field_987--;
                           }

                           return;
                        case 1:
                           if ((this.field_1008.field_2993 == null || !this.field_1012)
                              && this.field_981.length * (this.field_987 + this.field_985.length) < this.field_984.size()) {
                              this.field_987++;
                           }

                           return;
                        case 2:
                           if ((this.field_1008.field_2993 == null || this.field_1012) && this.field_988 > 0) {
                              this.field_988--;
                           }

                           return;
                        case 3:
                           if ((this.field_1008.field_2993 == null || this.field_1012)
                              && this.field_981.length * (this.field_988 + this.field_986.length) < this.field_421.field_3059[3].size()) {
                              this.field_988++;
                           }

                           return;
                     }
                  }
               }
            }
         } else {
            if (var1.getX() >= this.field_977
               && var1.getX() <= this.field_977 + this.field_979
               && var1.getY() >= this.field_978
               && var1.getY() <= this.field_978 + this.field_980) {
               if (this.field_960 < this.field_955 && this.field_960 > -1) {
                  this.field_435.write("H25|" + (this.field_960 + 1) + "\n");
                  this.field_435.flush();
               } else if (this.field_960 >= this.field_955) {
                  this.field_435.write("H26|" + (this.field_960 + 1 - this.field_955) + "\n");
                  this.field_435.flush();
               }

               if (!this.field_933.isVisible()) {
                  this.field_933.setVisible(true);
               }

               return;
            }

            for (int var5 = 0; var5 < 4; var5++) {
               if (var1.getX() >= this.field_962
                  && var1.getX() <= this.field_962 + 257
                  && var1.getY() >= this.field_963[var5]
                  && var1.getY() <= this.field_963[var5] + 45) {
                  if (var5 < this.field_957.length - this.field_961) {
                     this.field_960 = var5 + this.field_961;
                  }

                  return;
               }
            }

            if (var1.getX() >= this.field_967
               && var1.getX() <= this.field_967 + this.field_969
               && var1.getY() >= this.field_968[0]
               && var1.getY() <= this.field_968[0] + this.field_970) {
               if (this.field_961 > 0) {
                  this.field_961--;
               }

               if (this.field_960 >= this.field_961 + 4) {
                  this.field_960 = this.field_961 + 3;
               }

               return;
            }

            if (var1.getX() >= this.field_967
               && var1.getX() <= this.field_967 + this.field_969
               && var1.getY() >= this.field_968[1]
               && var1.getY() <= this.field_968[1] + this.field_970) {
               if (this.field_961 + 4 < this.field_957.length) {
                  this.field_961++;
               }

               if (this.field_960 - this.field_961 < 0) {
                  this.field_960 = this.field_961;
               }

               return;
            }
         }

         if (var1.getX() > this.field_1284.method_254("en", 383)
            && var1.getX() < this.field_1284.method_254("en", 383) + this.field_1284.method_254("en", 385)
            && var1.getY() > this.field_1284.method_254("en", 384)
            && var1.getY() < this.field_1284.method_254("en", 384) + this.field_1284.method_254("en", 386)) {
            this.field_933.setVisible(false);
            this.field_928.setVisible(false);
            this.field_1039 = -1;
            this.field_435.write("H5\n");
            this.field_435.flush();
            class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
            this.field_429.method_798();
            this.method_297((byte)0, null);
         } else {
            this.field_1032 = var1.getX();
            this.field_1033 = var1.getY();
            this.field_1034 = System.currentTimeMillis() + 300L;
         }
      }
   }

   // $VF: renamed from: r (java.awt.event.MouseEvent) void
   public void method_337(MouseEvent var1) {
      if (this.field_1008.field_2993 == null) {
         if (this.field_942 == 0) {
            int var2 = this.field_987 * this.field_981.length;

            for (int var3 = 0; var3 < this.field_985.length; var3++) {
               for (int var4 = 0; var4 < this.field_981.length; var4++) {
                  if (var1.getX() >= this.field_981[var4]
                     && var1.getX() <= this.field_981[var4] + this.field_982
                     && var1.getY() >= this.field_985[var3]
                     && var1.getY() <= this.field_985[var3] + this.field_983) {
                     this.field_1012 = true;
                     this.field_1006 = this.field_981[var4] - 2;
                     this.field_1007 = this.field_985[var3] - 2;
                     if (var2 < this.field_984.size()) {
                        if (var4 < this.field_981.length / 2) {
                           this.method_339(((class_30)this.field_984.elementAt(var2)).method_245("Out of Stock"), (byte)1, this.field_1008.field_3010);
                        } else {
                           this.method_339(((class_30)this.field_984.elementAt(var2)).method_245("Out of Stock"), (byte)0, this.field_1008.field_3010);
                        }
                     }

                     this.field_928.setText("1");
                     ((class_32)this.field_928.getDocument()).method_250(((class_30)this.field_984.elementAt(var2)).method_236());
                     this.field_931 = ((class_30)this.field_984.elementAt(var2)).method_234().method_179();
                     this.field_932 = ((class_30)this.field_984.elementAt(var2)).method_234().method_183();
                     this.field_929 = ((class_30)this.field_984.elementAt(var2)).method_238();
                     return;
                  }

                  var2++;
               }
            }

            int var6 = this.field_988 * this.field_981.length;

            for (int var7 = 0; var7 < this.field_986.length; var7++) {
               for (int var5 = 0; var5 < this.field_981.length; var5++) {
                  if (var1.getX() >= this.field_981[var5]
                     && var1.getX() <= this.field_981[var5] + this.field_982
                     && var1.getY() >= this.field_986[var7]
                     && var1.getY() <= this.field_986[var7] + this.field_983) {
                     this.field_1012 = false;
                     this.field_1006 = this.field_981[var5] - 2;
                     this.field_1007 = this.field_986[var7] - 2;
                     if (var6 < this.field_421.field_3059[3].size()) {
                        if (var5 < this.field_981.length / 2) {
                           this.method_339(((class_30)this.field_421.field_3059[3].elementAt(var6)).method_245("0"), (byte)1, this.field_1008.field_3010);
                        } else if (var5 == this.field_981.length - 1) {
                           this.method_339(((class_30)this.field_421.field_3059[3].elementAt(var6)).method_245("0"), (byte)2, this.field_1008.field_3010);
                        } else {
                           this.method_339(((class_30)this.field_421.field_3059[3].elementAt(var6)).method_245("0"), (byte)0, this.field_1008.field_3010);
                        }
                     }

                     ((class_32)this.field_928.getDocument()).method_250(((class_30)this.field_421.field_3059[3].elementAt(var6)).method_236());
                     switch (3) {
                        case 0:
                           this.field_928.setText("1");
                           break;
                        case 1:
                           this.field_928.setText("1");
                           break;
                        case 2:
                           this.field_928.setText("" + ((class_32)this.field_928.getDocument()).method_251());
                           break;
                        case 3:
                           this.field_928.setText("" + ((class_32)this.field_928.getDocument()).method_251());
                     }

                     this.field_931 = ((class_30)this.field_421.field_3059[3].elementAt(var6)).method_234().method_179();
                     this.field_932 = ((class_30)this.field_421.field_3059[3].elementAt(var6)).method_234().method_183();
                     this.field_929 = ((class_30)this.field_421.field_3059[3].elementAt(var6)).method_238();
                     return;
                  }

                  var6++;
               }
            }
         }
      }
   }

   // $VF: renamed from: s (java.awt.event.MouseEvent) void
   public void method_338(MouseEvent var1) {
      this.field_1039 = -1;
      if (var1.getX() > this.field_1284.method_254("en", 383)
         && var1.getX() < this.field_1284.method_254("en", 383) + this.field_1284.method_254("en", 385)
         && var1.getY() > this.field_1284.method_254("en", 384)
         && var1.getY() < this.field_1284.method_254("en", 384) + this.field_1284.method_254("en", 386)) {
         this.field_1039 = 0;
         this.field_1037 = this.field_1284.method_254("en", 383);
         this.field_1038 = this.field_1284.method_254("en", 384);
      } else {
         if (this.field_942 == 0) {
            if (this.field_1008.field_2993 != null) {
               if (!this.field_928.getText().trim().equals("")
                  && var1.getX() > this.field_1029
                  && var1.getX() < this.field_1029 + this.field_1284.method_254("en", 424)
                  && var1.getY() > this.field_1030
                  && var1.getY() < this.field_1030 + this.field_1284.method_254("en", 425)) {
                  this.field_1039 = 2;
                  this.field_1037 = this.field_1029;
                  this.field_1038 = this.field_1030;
                  return;
               }

               if (var1.getX() > this.field_1029 + this.field_1284.method_254("en", 424) + 3
                  && var1.getX() < this.field_1029 + this.field_1284.method_254("en", 424) + 3 + this.field_1284.method_254("en", 391)
                  && var1.getY() > this.field_1030
                  && var1.getY() < this.field_1030 + this.field_1284.method_254("en", 392)) {
                  this.field_1039 = 3;
                  this.field_1037 = this.field_1029 + this.field_1284.method_254("en", 424) + 3;
                  this.field_1038 = this.field_1030;
                  return;
               }
            }
         } else if (var1.getX() >= this.field_977
            && var1.getX() <= this.field_977 + this.field_979
            && var1.getY() >= this.field_978
            && var1.getY() <= this.field_978 + this.field_980) {
            this.field_1039 = 1;
            this.field_1037 = this.field_977;
            this.field_1038 = this.field_978;
            return;
         }

         if ((this.field_1008.field_2993 == null || !this.field_1012) && this.field_942 == 0) {
            int var2 = this.field_987 * this.field_981.length;

            for (int var3 = 0; var3 < this.field_985.length; var3++) {
               for (int var4 = 0; var4 < this.field_981.length; var4++) {
                  if (var1.getX() >= this.field_981[var4]
                     && var1.getX() <= this.field_981[var4] + this.field_982
                     && var1.getY() >= this.field_985[var3]
                     && var1.getY() <= this.field_985[var3] + this.field_983) {
                     this.field_998 = this.field_981[var4] - 2;
                     this.field_999 = this.field_985[var3] - 2;
                     if (var2 < this.field_984.size()) {
                        if (var4 < this.field_981.length / 2) {
                           this.method_339(((class_30)this.field_984.elementAt(var2)).method_245("Out of Stock"), (byte)1, this.field_1000.field_3010);
                        } else {
                           this.method_339(((class_30)this.field_984.elementAt(var2)).method_245("Out of Stock"), (byte)0, this.field_1000.field_3010);
                        }
                     }

                     return;
                  }

                  var2++;
               }
            }
         }

         if (this.field_1008.field_2993 == null || this.field_1012) {
            int var5 = this.field_988 * this.field_981.length;

            for (int var6 = 0; var6 < this.field_986.length; var6++) {
               for (int var7 = 0; var7 < this.field_981.length; var7++) {
                  if (var1.getX() >= this.field_981[var7]
                     && var1.getX() <= this.field_981[var7] + this.field_982
                     && var1.getY() >= this.field_986[var6]
                     && var1.getY() <= this.field_986[var6] + this.field_983) {
                     this.field_998 = this.field_981[var7] - 2;
                     this.field_999 = this.field_986[var6] - 2;
                     if (var5 < this.field_421.field_3059[3].size()) {
                        if (var7 < this.field_981.length / 2) {
                           this.method_339(((class_30)this.field_421.field_3059[3].elementAt(var5)).method_245("0"), (byte)1, this.field_1000.field_3010);
                        } else {
                           this.method_339(((class_30)this.field_421.field_3059[3].elementAt(var5)).method_245("0"), (byte)0, this.field_1000.field_3010);
                        }
                     }

                     return;
                  }

                  var5++;
               }
            }
         }

         this.method_339(null, (byte)1, this.field_1000.field_3010);
      }
   }

   // $VF: renamed from: b (java.lang.String, byte, byte) void
   public void method_339(String var1, byte var2, byte var3) {
      int var4 = this.field_998 + this.field_982 / 2;
      int var5 = this.field_999 + this.field_983 / 3 * 2;
      if (var5 + 150 > 580) {
         var5 -= 150;
      }

      switch (var2) {
         case 0:
            var4 = var4 - this.field_1001 - 15;
         case 1:
         default:
            break;
         case 2:
            var4 -= this.field_1001;
            var4 -= this.field_982 / 2;
      }

      switch (var3) {
         case 2:
            this.field_1000.method_805(var1, var4, var5, this.field_1001, this.field_1002, MastersOfDestiny.field_2809, null);
            break;
         case 3:
            if (var4 + 300 > 420) {
               var4 -= 70;
            }

            this.field_1008.method_805(var1, var4, var5, this.field_1001, this.field_1002, MastersOfDestiny.field_2809, null);
            this.field_1017 = var4 + this.field_1001 + 6 + 2;
            this.field_1018 = var5 + MastersOfDestiny.field_2809.getHeight() + MastersOfDestiny.field_2809.getHeight() / 2;
            this.field_928.setBounds(this.field_1017 + 3, this.field_1018 + 5, this.field_1284.method_254("en", 398), this.field_1284.method_254("en", 399));
            this.field_928.setVisible(true);
            this.field_928.requestFocusInWindow();
            this.field_1019 = this.field_1017 + this.field_1284.method_254("en", 398) + 4;
            this.field_1020[0] = this.field_1018;
            this.field_1020[1] = this.field_1018 + this.field_1021;
            this.field_1024 = this.field_1017;
            this.field_1025 = this.field_1018
               + this.field_1016.getIconHeight()
               + MastersOfDestiny.field_2809.getHeight()
               + MastersOfDestiny.field_2809.getHeight() / 2;
            this.field_1026 = this.field_1024 + 1 + 5;
            this.field_1027 = this.field_1025 + this.field_1023.getIconHeight() - 1 - 3;
            this.field_1029 = this.field_1024 + 1;
            this.field_1030 = var5 + this.field_1008.field_2999 - this.field_1028.getIconHeight() - MastersOfDestiny.field_2809.getHeight() / 2;
      }
   }

   // $VF: renamed from: t (java.awt.event.MouseEvent) void
   public void method_340(MouseEvent var1) {
      if (this.field_1008.field_2993 == null) {
         if (this.field_942 == 0) {
            int var2 = this.field_987 * this.field_981.length;

            for (int var3 = 0; var3 < this.field_985.length; var3++) {
               for (int var4 = 0; var4 < this.field_981.length; var4++) {
                  if (var1.getX() >= this.field_981[var4]
                     && var1.getX() <= this.field_981[var4] + this.field_982
                     && var1.getY() >= this.field_985[var3]
                     && var1.getY() <= this.field_985[var3] + this.field_983
                     && var2 < this.field_984.size()) {
                     class_30 var5 = (class_30)this.field_984.elementAt(var2);
                     if (var5.method_236() != 0) {
                        this.field_1010 = var1.getX();
                        this.field_1011 = var1.getY();
                        this.field_1012 = true;
                        this.field_1009 = var5.method_234().method_181();
                        ((class_32)this.field_928.getDocument()).method_250(var5.method_236());
                        this.field_931 = var5.method_234().method_179();
                        this.field_932 = var5.method_234().method_183();
                        this.field_929 = var5.method_238();
                     }
                  }

                  var2++;
               }
            }
         }

         int var6 = this.field_988 * this.field_981.length;

         for (int var7 = 0; var7 < this.field_986.length; var7++) {
            for (int var8 = 0; var8 < this.field_981.length; var8++) {
               if (var1.getX() >= this.field_981[var8]
                  && var1.getX() <= this.field_981[var8] + this.field_982
                  && var1.getY() >= this.field_986[var7]
                  && var1.getY() <= this.field_986[var7] + this.field_983
                  && var6 < this.field_421.field_3059[3].size()) {
                  class_30 var9 = (class_30)this.field_421.field_3059[3].elementAt(var6);
                  if (var9.method_236() != 0) {
                     this.field_1010 = var1.getX();
                     this.field_1011 = var1.getY();
                     this.field_1012 = false;
                     this.field_1009 = var9.method_234().method_181();
                     ((class_32)this.field_928.getDocument()).method_250(var9.method_236());
                     this.field_931 = var9.method_234().method_179();
                     this.field_932 = var9.method_234().method_183();
                     this.field_929 = var9.method_238();
                  }
               }

               var6++;
            }
         }
      }
   }

   // $VF: renamed from: u (java.awt.event.MouseEvent) void
   public void method_341(MouseEvent var1) {
      if (this.field_1009 != null) {
         this.field_1010 = var1.getX();
         this.field_1011 = var1.getY();
      }
   }

   // $VF: renamed from: v (java.awt.event.MouseEvent) void
   public void method_342(MouseEvent var1) {
      if (this.field_1009 != null) {
         if (this.field_1012) {
            if (var1.getX() >= this.field_981[0]
               && var1.getX() <= this.field_981[this.field_981.length - 1] + this.field_982
               && var1.getY() >= this.field_986[0]
               && var1.getY() <= this.field_986[this.field_986.length - 1] + this.field_983) {
               this.field_1006 = this.field_998;
               this.field_1007 = this.field_999;
               if (this.field_1006 < this.field_981[(this.field_981.length - 1) / 2]) {
                  this.method_339(this.field_1000.field_2993.substring(0), (byte)1, this.field_1008.field_3010);
               } else {
                  this.method_339(this.field_1000.field_2993.substring(0), (byte)0, this.field_1008.field_3010);
               }

               this.field_928.setText("1");
            }
         } else if (var1.getX() >= this.field_981[0]
            && var1.getX() <= this.field_981[this.field_981.length - 1] + this.field_982
            && var1.getY() >= this.field_985[0]
            && var1.getY() <= this.field_985[this.field_985.length - 1] + this.field_983) {
            this.field_1006 = this.field_998;
            this.field_1007 = this.field_999;
            if (this.field_1006 < this.field_981[(this.field_981.length - 1) / 2]) {
               this.method_339(this.field_1000.field_2993.substring(0), (byte)1, this.field_1008.field_3010);
            } else {
               this.method_339(this.field_1000.field_2993.substring(0), (byte)0, this.field_1008.field_3010);
            }

            switch (3) {
               case 0:
                  this.field_928.setText("1");
                  break;
               case 1:
                  this.field_928.setText("1");
                  break;
               case 2:
                  this.field_928.setText("" + ((class_32)this.field_928.getDocument()).method_251());
                  break;
               case 3:
                  this.field_928.setText("" + ((class_32)this.field_928.getDocument()).method_251());
            }
         }

         this.field_1009 = null;
      }
   }

   // $VF: renamed from: i (java.lang.Object) void
   public void method_343(Object var1) {
      this.field_1041 = new class_79(this);
      this.field_1041.method_670(this.field_1281, System.currentTimeMillis());
   }

   // $VF: renamed from: i (java.awt.Graphics) void
   public void method_344(Graphics var1) {
      this.field_1041.method_673(var1, field_1274);
   }

   // $VF: renamed from: a (aa, long) void
   public void method_345(class_57 var1, long var2) {
      if (this.field_1041 != null) {
         int var4 = this.field_1041.method_671(var1, var2);
         if (var4 != 18 && var4 != 0) {
            class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
            this.field_429.method_798();
            class_62.method_563("changing state from mission: " + var4);
            if (var4 == 5) {
               this.method_297((byte)0, null);
               this.field_1300 = 5;
            } else {
               this.method_466((byte)var4, null);
            }
         }
      }
   }

   // $VF: renamed from: w (java.awt.event.MouseEvent) void
   public void method_346(MouseEvent var1) {
      this.field_1041.method_677(var1);
   }

   // $VF: renamed from: x (java.awt.event.MouseEvent) void
   public void method_347(MouseEvent var1) {
      this.field_1041.method_678(var1);
   }

   // $VF: renamed from: y (java.awt.event.MouseEvent) void
   public void method_348(MouseEvent var1) {
      this.field_1041.method_679(var1);
   }

   // $VF: renamed from: z (java.awt.event.MouseEvent) void
   public void method_349(MouseEvent var1) {
      this.field_1041.method_681(var1);
   }

   // $VF: renamed from: A (java.awt.event.MouseEvent) void
   public void method_350(MouseEvent var1) {
      this.field_1041.method_680(var1);
   }

   // $VF: renamed from: a (java.lang.String[]) void
   public void method_351(String[] var1) {
      this.field_1041.method_675(var1);
   }

   // $VF: renamed from: j (java.lang.Object) void
   public void method_352(Object var1) {
      int var2 = (int)(Math.random() * 5.0);
      if (var2 == 1) {
         class_3.field_20.method_18("res/sound/bgm/Battle1.wav", true);
      } else if (var2 == 2) {
         class_3.field_20.method_18("res/sound/bgm/Battle2.wav", true);
      } else if (var2 == 3) {
         class_3.field_20.method_18("res/sound/bgm/Battle3.wav", true);
      } else if (var2 == 4) {
         class_3.field_20.method_18("res/sound/bgm/Battle4.wav", true);
      } else {
         class_3.field_20.method_18("res/sound/bgm/Battle5.wav", true);
      }

      this.field_1042 = new class_78(this);
      this.field_1281.field_1527 = field_1212;
      this.field_1042.method_670(this.field_1281, System.currentTimeMillis());
   }

   // $VF: renamed from: a (java.lang.String, int) void
   public void method_353(String var1, int var2) {
      class_62.method_563("new connection");

      try {
         class_62.method_563("terminating colony reader - " + this.field_441);
         if (this.field_441 != null) {
            this.field_441.method_889();
         }

         class_62.method_563("colonyReader terminated");
         this.field_441 = null;
         this.field_434 = null;
         this.field_435 = null;
         this.field_433.close();
         this.field_433 = null;
         class_62.method_563("colony closed");
         class_62.method_563("connecting to: " + var1 + " port: " + var2);
         this.field_433 = new Socket(var1, var2);
         this.field_435 = new PrintWriter(this.field_433.getOutputStream(), true);
         this.field_434 = new BufferedReader(new InputStreamReader(this.field_433.getInputStream()));
         class_62.method_563("~~~~~~~~~~~~~~~~~~~~connecting~~~~~~~~~~~~~~~~~~~~~~~~~");
         this.field_441 = new class_95(this);
         this.field_441.start();
      } catch (IOException var4) {
         class_62.method_563("connection error = " + var4.getMessage());
         this.method_487("Unable to connect to the server.\nPlease try again.\n[Press Any Key]", (byte)8, null);
      }
   }

   // $VF: renamed from: j (java.awt.Graphics) void
   public void method_354(Graphics var1) {
      this.field_1042.method_673(var1, field_1274);
   }

   // $VF: renamed from: b (aa, long) void
   public void method_355(class_57 var1, long var2) {
      if (this.field_1042 != null) {
         int var4 = this.field_1042.method_671(var1, var2);
         if (var4 != 21 && var4 != 0) {
            class_62.method_563("changing state from hq: " + var4);
            this.method_466((byte)var4, null);
         }
      }
   }

   // $VF: renamed from: B (java.awt.event.MouseEvent) void
   public void method_356(MouseEvent var1) {
      this.field_1042.method_677(var1);
   }

   // $VF: renamed from: C (java.awt.event.MouseEvent) void
   public void method_357(MouseEvent var1) {
      this.field_1042.method_678(var1);
   }

   // $VF: renamed from: D (java.awt.event.MouseEvent) void
   public void method_358(MouseEvent var1) {
      this.field_1042.method_679(var1);
   }

   // $VF: renamed from: E (java.awt.event.MouseEvent) void
   public void method_359(MouseEvent var1) {
      this.field_1042.method_681(var1);
   }

   // $VF: renamed from: F (java.awt.event.MouseEvent) void
   public void method_360(MouseEvent var1) {
      this.field_1042.method_680(var1);
   }

   // $VF: renamed from: b (java.lang.String[]) void
   public void method_361(String[] var1) {
      this.field_1042.method_675(var1);
   }

   // $VF: renamed from: k (java.lang.Object) void
   public void method_362(Object var1) {
      this.field_1043 = new class_77(this);
      this.field_1043.method_670(this.field_1281, System.currentTimeMillis());
   }

   // $VF: renamed from: k (java.awt.Graphics) void
   public void method_363(Graphics var1) {
      this.field_1043.method_673(var1, field_1274);
   }

   // $VF: renamed from: c (aa, long) void
   public void method_364(class_57 var1, long var2) {
      if (this.field_1043 != null) {
         int var4 = this.field_1043.method_671(var1, var2);
         if (var4 != 22 && var4 != 0) {
            class_62.method_563("changing state from mission: " + var4);
            if (var4 == 27) {
               this.field_442 = 0;
            }

            this.method_466((byte)var4, null);
         }
      }
   }

   // $VF: renamed from: G (java.awt.event.MouseEvent) void
   public void method_365(MouseEvent var1) {
      this.field_1043.method_677(var1);
   }

   // $VF: renamed from: H (java.awt.event.MouseEvent) void
   public void method_366(MouseEvent var1) {
      this.field_1043.method_678(var1);
   }

   // $VF: renamed from: I (java.awt.event.MouseEvent) void
   public void method_367(MouseEvent var1) {
      this.field_1043.method_679(var1);
   }

   // $VF: renamed from: J (java.awt.event.MouseEvent) void
   public void method_368(MouseEvent var1) {
      this.field_1043.method_681(var1);
   }

   // $VF: renamed from: K (java.awt.event.MouseEvent) void
   public void method_369(MouseEvent var1) {
      this.field_1043.method_680(var1);
   }

   // $VF: renamed from: c (java.lang.String[]) void
   public void method_370(String[] var1) {
      this.field_1043.method_675(var1);
   }

   // $VF: renamed from: l (java.lang.Object) void
   public void method_371(Object var1) {
      switch (field_437) {
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            this.field_1044 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1246)));
            break;
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
            this.field_1044 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1167)));
            break;
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
            this.field_1044 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1073)));
            break;
         case 16:
         case 17:
         case 18:
         case 19:
            this.field_1044 = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1174)));
      }

      this.field_1045 = new Icon[2];
      this.field_1045[0] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1224)));
      this.field_1045[1] = new ImageIcon(this.getClass().getResource(this.field_395 + this.field_1284.method_256("en", 1223)));
      this.field_1046 = 0;
      this.field_1047 = 0;
      this.field_1048 = -1;
      this.field_1049 = this.field_1284.method_254("en", 437);
      this.field_1050 = this.field_1284.method_254("en", 438);
      this.field_1051 = this.field_1284.method_254("en", 439);
      this.field_1052 = this.field_1284.method_254("en", 440);
   }

   // $VF: renamed from: l (java.awt.Graphics) void
   public void method_372(Graphics var1) {
      this.field_1044.paintIcon(field_1274, var1, 0, 0);
      if (this.field_1048 != -1) {
         this.field_1045[this.field_1048].paintIcon(field_1274, var1, this.field_1046, this.field_1047);
      }
   }

   // $VF: renamed from: L (java.awt.event.MouseEvent) void
   public void method_373(MouseEvent var1) {
      if (var1.getX() >= 212 && var1.getX() <= 266 && var1.getY() >= 183 && var1.getY() <= 200) {
         class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
         this.field_429.method_798();
         this.method_466((byte)32, null);
      } else if (var1.getX() >= 212 && var1.getX() <= 266 && var1.getY() >= 321 && var1.getY() <= 338) {
         class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
         this.field_429.method_798();
         this.method_466((byte)31, null);
      } else if (var1.getX() > this.field_1049
         && var1.getX() < this.field_1049 + this.field_1051
         && var1.getY() > this.field_1050
         && var1.getY() < this.field_1050 + this.field_1052) {
         class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
         this.field_429.method_798();
         this.method_297((byte)0, null);
         this.field_1300 = 5;
      }
   }

   // $VF: renamed from: M (java.awt.event.MouseEvent) void
   public void method_374(MouseEvent var1) {
      this.field_1048 = -1;
      if (var1.getX() >= 212 && var1.getX() <= 266 && var1.getY() >= 183 && var1.getY() <= 200) {
         this.field_1048 = 1;
         this.field_1046 = 212;
         this.field_1047 = 183;
      } else if (var1.getX() >= 212 && var1.getX() <= 266 && var1.getY() >= 321 && var1.getY() <= 338) {
         this.field_1048 = 1;
         this.field_1046 = 212;
         this.field_1047 = 321;
      } else if (var1.getX() > this.field_1049
         && var1.getX() < this.field_1049 + this.field_1051
         && var1.getY() > this.field_1050
         && var1.getY() < this.field_1050 + this.field_1052) {
         this.field_1048 = 0;
         this.field_1046 = this.field_1049;
         this.field_1047 = this.field_1050;
      }
   }

   // $VF: renamed from: N (java.awt.event.MouseEvent) void
   public void method_375(MouseEvent var1) {
   }

   // $VF: renamed from: O (java.awt.event.MouseEvent) void
   public void method_376(MouseEvent var1) {
   }

   // $VF: renamed from: P (java.awt.event.MouseEvent) void
   public void method_377(MouseEvent var1) {
   }

   // $VF: renamed from: d (aa, long) void
   public void method_378(class_57 var1, long var2) {
      if (this.field_1053 != null) {
         int var4 = this.field_1053.method_671(var1, var2);
         if (var4 != 31 && var4 != 0) {
            class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
            this.field_429.method_798();
            if (var4 == 5) {
               this.method_297((byte)0, null);
               this.field_1300 = 5;
            } else {
               this.method_466((byte)var4, null);
            }
         }
      }
   }

   // $VF: renamed from: Q (java.awt.event.MouseEvent) void
   public void method_379(MouseEvent var1) {
      this.field_1053.method_677(var1);
   }

   // $VF: renamed from: R (java.awt.event.MouseEvent) void
   public void method_380(MouseEvent var1) {
      this.field_1053.method_678(var1);
   }

   // $VF: renamed from: S (java.awt.event.MouseEvent) void
   public void method_381(MouseEvent var1) {
      this.field_1053.method_679(var1);
   }

   // $VF: renamed from: T (java.awt.event.MouseEvent) void
   public void method_382(MouseEvent var1) {
      this.field_1053.method_681(var1);
   }

   // $VF: renamed from: U (java.awt.event.MouseEvent) void
   public void method_383(MouseEvent var1) {
      this.field_1053.method_680(var1);
   }

   // $VF: renamed from: d (java.lang.String[]) void
   public void method_384(String[] var1) {
      this.field_1053.method_675(var1);
   }

   // $VF: renamed from: m (java.lang.Object) void
   public void method_385(Object var1) {
      this.field_1053 = new class_76(this);
      this.field_1053.method_670(this.field_1281, System.currentTimeMillis());
   }

   // $VF: renamed from: m (java.awt.Graphics) void
   public void method_386(Graphics var1) {
      this.field_1053.method_673(var1, field_1274);
   }

   // $VF: renamed from: e (aa, long) void
   public void method_387(class_57 var1, long var2) {
      if (this.field_1054 != null) {
         int var4 = this.field_1054.method_671(var1, var2);
         if (var4 != 32 && var4 != 0) {
            class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
            this.field_429.method_798();
            if (var4 == 5) {
               this.method_297((byte)0, null);
               this.field_1300 = 5;
            } else {
               this.method_466((byte)var4, null);
            }
         }
      }
   }

   // $VF: renamed from: V (java.awt.event.MouseEvent) void
   public void method_388(MouseEvent var1) {
      this.field_1054.method_677(var1);
   }

   // $VF: renamed from: W (java.awt.event.MouseEvent) void
   public void method_389(MouseEvent var1) {
      this.field_1054.method_678(var1);
   }

   // $VF: renamed from: X (java.awt.event.MouseEvent) void
   public void method_390(MouseEvent var1) {
      this.field_1054.method_679(var1);
   }

   // $VF: renamed from: Y (java.awt.event.MouseEvent) void
   public void method_391(MouseEvent var1) {
      this.field_1054.method_681(var1);
   }

   // $VF: renamed from: Z (java.awt.event.MouseEvent) void
   public void method_392(MouseEvent var1) {
      this.field_1054.method_680(var1);
   }

   // $VF: renamed from: e (java.lang.String[]) void
   public void method_393(String[] var1) {
      this.field_1054.method_675(var1);
   }

   // $VF: renamed from: n (java.lang.Object) void
   public void method_394(Object var1) {
      this.field_1054 = new class_80(this);
      this.field_1054.method_670(this.field_1281, System.currentTimeMillis());
   }

   // $VF: renamed from: n (java.awt.Graphics) void
   public void method_395(Graphics var1) {
      this.field_1054.method_673(var1, field_1274);
   }

   // $VF: renamed from: o (java.lang.Object) void
   public void method_396(Object var1) {
      this.field_1055 = new class_81(this);
      this.field_1055.method_670(this.field_1281, System.currentTimeMillis());
   }

   // $VF: renamed from: o (java.awt.Graphics) void
   public void method_397(Graphics var1) {
      this.field_1055.method_673(var1, field_1274);
   }

   // $VF: renamed from: f (aa, long) void
   public void method_398(class_57 var1, long var2) {
      if (this.field_1055 != null) {
         int var4 = this.field_1055.method_671(var1, var2);
         if (var4 != 17 && var4 != 0) {
            class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
            this.field_429.method_798();
            class_62.method_563("changing state from cafe: " + var4);
            if (var4 == 5) {
               this.method_297((byte)0, null);
            } else {
               this.method_466((byte)var4, null);
            }

            byte var5 = 0;
            this.field_1055.method_672(var5);
         }
      }
   }

   // $VF: renamed from: aa (java.awt.event.MouseEvent) void
   public void method_399(MouseEvent var1) {
      this.field_1055.method_677(var1);
   }

   // $VF: renamed from: ab (java.awt.event.MouseEvent) void
   public void method_400(MouseEvent var1) {
      this.field_1055.method_678(var1);
   }

   // $VF: renamed from: ac (java.awt.event.MouseEvent) void
   public void method_401(MouseEvent var1) {
      this.field_1055.method_679(var1);
   }

   // $VF: renamed from: ad (java.awt.event.MouseEvent) void
   public void method_402(MouseEvent var1) {
      this.field_1055.method_681(var1);
   }

   // $VF: renamed from: ae (java.awt.event.MouseEvent) void
   public void method_403(MouseEvent var1) {
      this.field_1055.method_680(var1);
   }

   // $VF: renamed from: f (java.lang.String[]) void
   public void method_404(String[] var1) {
      this.field_1055.method_675(var1);
   }

   // $VF: renamed from: p (java.lang.Object) void
   public void method_405(Object var1) {
      this.field_1057 = new class_75(this);
      this.field_1057.method_670(this.field_1281, System.currentTimeMillis());
   }

   // $VF: renamed from: p (java.awt.Graphics) void
   public void method_406(Graphics var1) {
      this.field_1057.method_673(var1, field_1274);
   }

   // $VF: renamed from: g (aa, long) void
   public void method_407(class_57 var1, long var2) {
      if (this.field_1057 != null) {
         int var4 = this.field_1057.method_671(var1, var2);
         if (var4 != 20 && var4 != 0) {
            class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
            this.field_429.method_798();
            class_62.method_563("changing state from stadium: " + var4);
            if (var4 == 5) {
               this.method_297((byte)0, null);
               this.field_1300 = 5;
            } else {
               this.method_466((byte)var4, null);
            }
         }
      }
   }

   // $VF: renamed from: af (java.awt.event.MouseEvent) void
   public void method_408(MouseEvent var1) {
      this.field_1057.method_677(var1);
   }

   // $VF: renamed from: ag (java.awt.event.MouseEvent) void
   public void method_409(MouseEvent var1) {
      this.field_1057.method_678(var1);
   }

   // $VF: renamed from: ah (java.awt.event.MouseEvent) void
   public void method_410(MouseEvent var1) {
      this.field_1057.method_679(var1);
   }

   // $VF: renamed from: ai (java.awt.event.MouseEvent) void
   public void method_411(MouseEvent var1) {
      this.field_1057.method_680(var1);
   }

   // $VF: renamed from: aj (java.awt.event.MouseEvent) void
   public void method_412(MouseEvent var1) {
      this.field_1057.method_681(var1);
   }

   // $VF: renamed from: g (java.lang.String[]) void
   public void method_413(String[] var1) {
      this.field_1057.method_675(var1);
   }

   // $VF: renamed from: q (java.lang.Object) void
   public void method_414(Object var1) {
      this.field_1070 = 1;
      this.field_1071 = 0;
      this.field_1072 = 0;
      this.field_1059 = new Icon[4][3];
      this.field_1059[0][0] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1112)));
      this.field_1059[0][1] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1113)));
      this.field_1059[0][2] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1114)));
      this.field_1059[2][0] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1115)));
      this.field_1059[2][1] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1116)));
      this.field_1059[2][2] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1117)));
      this.field_1059[1][0] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1118)));
      this.field_1059[1][1] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1119)));
      this.field_1059[1][2] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1120)));
      this.field_1059[3][0] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1121)));
      this.field_1059[3][1] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1122)));
      this.field_1059[3][2] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1123)));
      this.field_1058 = new Icon[4][3];
      this.field_1058[0][0] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1124)));
      this.field_1058[0][1] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1125)));
      this.field_1058[0][2] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1126)));
      this.field_1058[2][0] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1127)));
      this.field_1058[2][1] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1128)));
      this.field_1058[2][2] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1129)));
      this.field_1058[1][0] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1130)));
      this.field_1058[1][1] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1131)));
      this.field_1058[1][2] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1132)));
      this.field_1058[3][0] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1133)));
      this.field_1058[3][1] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1134)));
      this.field_1058[3][2] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1135)));
      this.field_1060 = new int[4];
      this.field_1060[0] = this.field_1284.method_254("en", 1136);
      this.field_1060[2] = this.field_1284.method_254("en", 1137);
      this.field_1060[1] = this.field_1284.method_254("en", 1138);
      this.field_1060[3] = this.field_1284.method_254("en", 1139);
      this.field_1061 = new int[4];
      this.field_1061[0] = this.field_1284.method_254("en", 1140);
      this.field_1061[2] = this.field_1284.method_254("en", 1141);
      this.field_1061[1] = this.field_1284.method_254("en", 1142);
      this.field_1061[3] = this.field_1284.method_254("en", 1143);
      this.field_1062 = new int[4];
      this.field_1062[0] = this.field_1284.method_254("en", 1144);
      this.field_1062[2] = this.field_1284.method_254("en", 1145);
      this.field_1062[1] = this.field_1284.method_254("en", 1146);
      this.field_1062[3] = this.field_1284.method_254("en", 1147);
      this.field_1063 = new int[4];
      this.field_1063[0] = this.field_1284.method_254("en", 1148);
      this.field_1063[2] = this.field_1284.method_254("en", 1149);
      this.field_1063[1] = this.field_1284.method_254("en", 1150);
      this.field_1063[3] = this.field_1284.method_254("en", 1151);
      this.field_1064 = 400;
      this.field_1065 = 234;
      this.field_1068 = 0;
      this.field_1102 = false;
      this.field_1103 = false;
      this.field_1104 = false;
      this.field_1073 = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1076)));
      this.field_1075 = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1077)));
      this.field_1076 = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1078)));
      this.field_1074 = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1079)));
      this.field_1077 = new Icon[2];
      this.field_1077[0] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1080)));
      this.field_1077[1] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1081)));
      this.field_1096 = -1;
      this.field_1080 = this.field_1284.method_254("en", 1082);
      this.field_1081 = this.field_1284.method_254("en", 1083);
      this.field_1082 = this.field_1284.method_254("en", 1084);
      this.field_1083 = this.field_1284.method_254("en", 1085);
      this.field_1084 = this.field_1284.method_254("en", 1086);
      this.field_1085 = this.field_1284.method_254("en", 1243);
      this.field_1078 = this.field_1284.method_254("en", 1087);
      this.field_1079 = this.field_1284.method_254("en", 1088);
      this.field_1086 = this.field_1284.method_254("en", 1089);
      this.field_1087 = this.field_1284.method_254("en", 1090);
      this.field_1088 = this.field_1284.method_254("en", 1091);
      this.field_1089 = this.field_1284.method_254("en", 1092);
      this.field_1090 = this.field_1284.method_254("en", 1093);
      this.field_1091 = this.field_1284.method_254("en", 1094);
      this.field_1092 = new int[2];
      this.field_1092[0] = this.field_1284.method_254("en", 1095);
      this.field_1092[1] = this.field_1284.method_254("en", 1096);
      this.field_1093 = new int[3];
      this.field_1093[0] = this.field_1284.method_254("en", 1097);
      this.field_1093[1] = this.field_1284.method_254("en", 1098);
      this.field_1093[2] = this.field_1284.method_254("en", 1099);
      this.field_1094 = this.field_1284.method_254("en", 1110);
      this.field_1095 = this.field_1284.method_254("en", 1111);
      this.field_1097 = new int[3];
      this.field_1097[0] = this.field_1284.method_254("en", 1104);
      this.field_1097[1] = this.field_1284.method_254("en", 1105);
      this.field_1097[2] = this.field_1284.method_254("en", 1106);
      this.field_1098 = this.field_1284.method_254("en", 1107);
      this.field_1099 = this.field_1284.method_254("en", 1108);
      this.field_1100 = this.field_1284.method_254("en", 1109);
      this.field_1106 = new Icon[2];
      this.field_1106[1] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1217)));
      this.field_1106[0] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1218)));
      this.field_1109 = -1;
      this.field_1107 = 0;
      this.field_1108 = 0;
      this.field_1101 = new JTextField();
      this.field_1101
         .setBounds(
            this.field_1284.method_254("en", 1100),
            this.field_1284.method_254("en", 1101),
            this.field_1284.method_254("en", 1102),
            this.field_1284.method_254("en", 1103)
         );
      this.field_1101.setBackground(new Color(5338761));
      this.field_1101.setBorder(BorderFactory.createLineBorder(new Color(5338761)));
      this.field_1101.setForeground(new Color(8838126));
      this.field_1101.setSelectedTextColor(new Color(4810614));
      this.field_1101.setSelectionColor(new Color(6591140));
      this.field_1101.setCaretColor(new Color(8838126));
      field_1274.add(this.field_1101);
      this.field_1101.requestFocus();
      this.field_1101.getDocument().addDocumentListener(new class_40(this));
      this.field_1101.addActionListener(new class_39(this));
   }

   // $VF: renamed from: q (java.awt.Graphics) void
   public void method_415(Graphics var1) {
      this.method_460(var1);
      this.field_1074.paintIcon(field_1274, var1, this.field_1078, this.field_1079);
      this.field_1059[this.field_1070 - 1][this.field_1072]
         .paintIcon(field_1274, var1, this.field_1064 - this.field_1060[this.field_1070 - 1], this.field_1065 - this.field_1061[this.field_1070 - 1]);
      this.field_1058[this.field_1070 - 1][this.field_1071]
         .paintIcon(field_1274, var1, this.field_1064 - this.field_1062[this.field_1070 - 1], this.field_1065 - this.field_1063[this.field_1070 - 1]);
      var1.setColor(new Color(12711676));
      var1.setFont(MastersOfDestiny.field_2837);
      var1.drawString(this.field_1066[this.field_1070 - 1], 397, 358);
      var1.drawString("" + (this.field_1071 + 1), 419, 384);
      var1.drawString("" + (this.field_1072 + 1), 419, 411);
      if (this.field_1102) {
         this.field_1073.paintIcon(field_1274, var1, this.field_1080, this.field_1081);
      }

      if (!this.field_1103 && !this.field_1104 && this.field_1096 != -1) {
         this.field_1077[0].paintIcon(field_1274, var1, this.field_1092[0], this.field_1093[this.field_1096]);
         this.field_1077[1].paintIcon(field_1274, var1, this.field_1092[1], this.field_1093[this.field_1096]);
      }

      if (this.field_1103) {
         this.field_1076.paintIcon(field_1274, var1, this.field_1086, this.field_1087);
         var1.setColor(new Color(12711676));
         var1.setFont(MastersOfDestiny.field_2827);
         var1.drawString(this.field_1067[this.field_1068], 264, 240);
      }

      if (this.field_1104) {
         this.field_1075.paintIcon(field_1274, var1, this.field_1086, this.field_1087);
         var1.setColor(new Color(12711676));
         var1.setFont(MastersOfDestiny.field_2831);
         var1.drawString("Processing your request, please wait...", 264, 254);
      }

      if (this.field_1109 != -1) {
         this.field_1106[this.field_1109].paintIcon(field_1274, var1, this.field_1107, this.field_1108);
      }
   }

   // $VF: renamed from: ak (java.awt.event.MouseEvent) void
   public void method_416(MouseEvent var1) {
      if (this.field_1103
         && var1.getX() >= this.field_1088
         && var1.getX() <= this.field_1088 + this.field_1090
         && var1.getY() >= this.field_1089
         && var1.getY() <= this.field_1089 + this.field_1091) {
         class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
         this.field_1109 = -1;
         this.field_1103 = false;
         if (this.field_1068 == 0) {
            field_1274.remove(this.field_1101);
            this.method_466((byte)2, null);
         }
      } else {
         if (!this.field_1103 && !this.field_1104) {
            if (var1.getX() >= this.field_1092[0]
               && var1.getX() <= this.field_1092[0] + this.field_1094
               && var1.getY() >= this.field_1093[0]
               && var1.getY() <= this.field_1093[0] + this.field_1095) {
               if (this.field_1070 > 1) {
                  this.field_1070--;
               }

               return;
            }

            if (var1.getX() >= this.field_1092[1]
               && var1.getX() <= this.field_1092[1] + this.field_1094
               && var1.getY() >= this.field_1093[0]
               && var1.getY() <= this.field_1093[0] + this.field_1095) {
               if (this.field_1070 < 4) {
                  this.field_1070++;
               }

               return;
            }

            if (var1.getX() >= this.field_1092[0]
               && var1.getX() <= this.field_1092[0] + this.field_1094
               && var1.getY() >= this.field_1093[1]
               && var1.getY() <= this.field_1093[1] + this.field_1095) {
               if (this.field_1071 > 0) {
                  this.field_1071--;
               }

               return;
            }

            if (var1.getX() >= this.field_1092[1]
               && var1.getX() <= this.field_1092[1] + this.field_1094
               && var1.getY() >= this.field_1093[1]
               && var1.getY() <= this.field_1093[1] + this.field_1095) {
               if (this.field_1071 < 2) {
                  this.field_1071++;
               }

               return;
            }

            if (var1.getX() >= this.field_1092[0]
               && var1.getX() <= this.field_1092[0] + this.field_1094
               && var1.getY() >= this.field_1093[2]
               && var1.getY() <= this.field_1093[2] + this.field_1095) {
               if (this.field_1072 > 0) {
                  this.field_1072--;
               }

               return;
            }

            if (var1.getX() >= this.field_1092[1]
               && var1.getX() <= this.field_1092[1] + this.field_1094
               && var1.getY() >= this.field_1093[2]
               && var1.getY() <= this.field_1093[2] + this.field_1095) {
               if (this.field_1072 < 2) {
                  this.field_1072++;
               }

               return;
            }

            if (var1.getX() >= this.field_1084
               && var1.getX() <= this.field_1084 + this.field_1082
               && var1.getY() >= this.field_1081
               && var1.getY() <= this.field_1081 + this.field_1083) {
               class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_fail.wav");
               this.field_1101.setText("");
               this.field_1070 = 1;
               this.field_1071 = 0;
               this.field_1072 = 0;
               return;
            }

            if (this.field_1102
               && var1.getX() >= this.field_1080
               && var1.getX() <= this.field_1080 + this.field_1082
               && var1.getY() >= this.field_1081
               && var1.getY() <= this.field_1081 + this.field_1083) {
               class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
               this.field_1102 = false;
               this.field_1109 = -1;
               boolean var2 = false;

               for (int var3 = 0; var3 < this.field_1101.getText().length(); var3++) {
                  if (this.field_1101.getText().substring(var3, var3 + 1).equals(" ")) {
                     this.field_1068 = 3;
                     this.field_1104 = false;
                     this.field_1103 = true;
                     var2 = true;
                     break;
                  }
               }

               if (!var2) {
                  this.field_1104 = true;
                  this.field_1234.write("P1|" + this.field_1101.getText() + "|" + this.field_1070 + "|" + this.field_1072 + "|" + this.field_1071 + "\n");
                  this.field_1234.flush();
                  class_62.method_563(
                     "sent create char request P1|" + this.field_1101.getText() + "|" + this.field_1070 + "|" + this.field_1072 + "|" + this.field_1071
                  );
               }

               return;
            }

            if (var1.getX() >= this.field_1085
               && var1.getX() <= this.field_1085 + this.field_1082
               && var1.getY() >= this.field_1081
               && var1.getY() <= this.field_1081 + this.field_1083) {
               class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_fail.wav");
               this.field_1109 = -1;
               field_1274.remove(this.field_1101);
               this.method_466((byte)2, null);
               field_1274.repaint();
               return;
            }
         }
      }
   }

   // $VF: renamed from: al (java.awt.event.MouseEvent) void
   public void method_417(MouseEvent var1) {
      this.field_1096 = -1;
      this.field_1109 = -1;
      if (!this.field_1103 && !this.field_1104) {
         for (int var2 = 0; var2 < this.field_1097.length; var2++) {
            if (var1.getX() >= this.field_1098
               && var1.getX() <= this.field_1098 + this.field_1099
               && var1.getY() >= this.field_1097[var2]
               && var1.getY() <= this.field_1097[var2] + this.field_1100) {
               class_62.method_563("test in line " + var2);
               this.field_1096 = var2;
               return;
            }
         }

         if (var1.getX() >= this.field_1080
            && var1.getX() <= this.field_1080 + this.field_1082
            && var1.getY() >= this.field_1081
            && var1.getY() <= this.field_1081 + this.field_1083
            && this.field_1102) {
            this.field_1109 = 0;
            this.field_1107 = this.field_1080;
            this.field_1108 = this.field_1081;
            return;
         }

         if (var1.getX() >= this.field_1084
            && var1.getX() <= this.field_1084 + this.field_1082
            && var1.getY() >= this.field_1081
            && var1.getY() <= this.field_1081 + this.field_1083) {
            this.field_1109 = 0;
            this.field_1107 = this.field_1084;
            this.field_1108 = this.field_1081;
            return;
         }

         if (var1.getX() >= this.field_1085
            && var1.getX() <= this.field_1085 + this.field_1082
            && var1.getY() >= this.field_1081
            && var1.getY() <= this.field_1081 + this.field_1083) {
            this.field_1109 = 0;
            this.field_1107 = this.field_1085;
            this.field_1108 = this.field_1081;
            return;
         }
      }

      if (this.field_1103
         && var1.getX() >= this.field_1088
         && var1.getX() <= this.field_1088 + this.field_1090
         && var1.getY() >= this.field_1089
         && var1.getY() <= this.field_1089 + this.field_1091) {
         this.field_1109 = 1;
         this.field_1107 = this.field_1088;
         this.field_1108 = this.field_1089;
      }
   }

   // $VF: renamed from: f (java.awt.event.KeyEvent) void
   public void method_418(KeyEvent var1) {
      if (this.field_1102) {
         switch (var1.getKeyCode()) {
            case 10:
               this.field_1102 = false;
               this.field_1109 = -1;
               this.field_1104 = true;
               this.field_1234.write("P1|" + this.field_1101.getText() + "|" + this.field_1070 + "|" + this.field_1072 + "|" + this.field_1071 + "\n");
               this.field_1234.flush();
         }
      }
   }

   // $VF: renamed from: r (java.lang.Object) void
   public void method_419(Object var1) {
      this.field_1150 = false;
      this.field_1151 = false;
      this.field_1152 = false;
      this.field_1110 = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1033)));
      this.field_1111 = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1034)));
      this.field_1112 = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1035)));
      this.field_1113 = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1036)));
      this.field_1114 = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1068)));
      this.field_1116 = 0;
      this.field_1155 = -1;
      this.field_1154 = new Icon[2];
      this.field_1154[0] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1217)));
      this.field_1154[1] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1218)));
      this.field_1156 = 0;
      this.field_1157 = 0;
      this.field_1120 = new JTextField();
      this.field_1120
         .setBounds(
            this.field_1284.method_254("en", 1037),
            this.field_1284.method_254("en", 1038),
            this.field_1284.method_254("en", 1039),
            this.field_1284.method_254("en", 1040)
         );
      this.field_1120.setBackground(new Color(5338761));
      this.field_1120.setBorder(BorderFactory.createLineBorder(new Color(5338761)));
      this.field_1120.setForeground(new Color(8838126));
      this.field_1120.setSelectedTextColor(new Color(4810614));
      this.field_1120.setSelectionColor(new Color(6591140));
      this.field_1120.setCaretColor(new Color(8838126));
      field_1274.add(this.field_1120);
      this.field_1120.getDocument().addDocumentListener(new class_38(this));
      this.field_1120.addActionListener(new class_37(this));
      this.field_1117 = new JTextField();
      this.field_1117
         .setBounds(
            this.field_1284.method_254("en", 1037),
            this.field_1284.method_254("en", 1041),
            this.field_1284.method_254("en", 1039),
            this.field_1284.method_254("en", 1040)
         );
      this.field_1117.setBackground(new Color(5338761));
      this.field_1117.setBorder(BorderFactory.createLineBorder(new Color(5338761)));
      this.field_1117.setForeground(new Color(8838126));
      this.field_1117.setSelectedTextColor(new Color(4810614));
      this.field_1117.setSelectionColor(new Color(6591140));
      this.field_1117.setCaretColor(new Color(8838126));
      field_1274.add(this.field_1117);
      this.field_1117.requestFocus();
      this.field_1117.getDocument().addDocumentListener(new class_36(this));
      this.field_1117.addActionListener(new class_35(this));
      this.field_1118 = new JTextField();
      this.field_1118
         .setBounds(
            this.field_1284.method_254("en", 1037),
            this.field_1284.method_254("en", 1042),
            this.field_1284.method_254("en", 1039),
            this.field_1284.method_254("en", 1040)
         );
      this.field_1118.setBackground(new Color(5338761));
      this.field_1118.setBorder(BorderFactory.createLineBorder(new Color(5338761)));
      this.field_1118.setForeground(new Color(8838126));
      this.field_1118.setSelectedTextColor(new Color(4810614));
      this.field_1118.setSelectionColor(new Color(6591140));
      this.field_1118.setCaretColor(new Color(8838126));
      field_1274.add(this.field_1118);
      this.field_1118.getDocument().addDocumentListener(new class_54(this));
      this.field_1118.addActionListener(new class_53(this));
      this.field_1119 = new JTextField();
      this.field_1119
         .setBounds(
            this.field_1284.method_254("en", 1037),
            this.field_1284.method_254("en", 1043),
            this.field_1284.method_254("en", 1039),
            this.field_1284.method_254("en", 1040)
         );
      this.field_1119.setBackground(new Color(5338761));
      this.field_1119.setBorder(BorderFactory.createLineBorder(new Color(5338761)));
      this.field_1119.setForeground(new Color(8838126));
      this.field_1119.setSelectedTextColor(new Color(4810614));
      this.field_1119.setSelectionColor(new Color(6591140));
      this.field_1119.setCaretColor(new Color(8838126));
      field_1274.add(this.field_1119);
      this.field_1119.getDocument().addDocumentListener(new class_52(this));
      this.field_1119.addActionListener(new class_51(this));
      this.field_1121 = new JPasswordField();
      this.field_1121
         .setBounds(
            this.field_1284.method_254("en", 1037),
            this.field_1284.method_254("en", 1044),
            this.field_1284.method_254("en", 1039),
            this.field_1284.method_254("en", 1040)
         );
      this.field_1121.setBackground(new Color(5338761));
      this.field_1121.setBorder(BorderFactory.createLineBorder(new Color(5338761)));
      this.field_1121.setForeground(new Color(8838126));
      this.field_1121.setSelectedTextColor(new Color(4810614));
      this.field_1121.setSelectionColor(new Color(6591140));
      this.field_1121.setCaretColor(new Color(8838126));
      field_1274.add(this.field_1121);
      this.field_1121.getDocument().addDocumentListener(new class_50(this));
      this.field_1121.addActionListener(new class_49(this));
      this.field_1122 = new JPasswordField();
      this.field_1122
         .setBounds(
            this.field_1284.method_254("en", 1037),
            this.field_1284.method_254("en", 1045),
            this.field_1284.method_254("en", 1039),
            this.field_1284.method_254("en", 1040)
         );
      this.field_1122.setBackground(new Color(5338761));
      this.field_1122.setBorder(BorderFactory.createLineBorder(new Color(5338761)));
      this.field_1122.setForeground(new Color(8838126));
      this.field_1122.setSelectedTextColor(new Color(4810614));
      this.field_1122.setSelectionColor(new Color(6591140));
      this.field_1122.setCaretColor(new Color(8838126));
      field_1274.add(this.field_1122);
      this.field_1122.getDocument().addDocumentListener(new class_48(this));
      this.field_1122.addActionListener(new class_47(this));
      this.field_1123 = this.field_1284.method_254("en", 1046);
      this.field_1124 = this.field_1284.method_254("en", 1047);
      this.field_1125 = this.field_1284.method_254("en", 1048);
      this.field_1126 = this.field_1284.method_254("en", 1049);
      this.field_1127 = this.field_1284.method_254("en", 1239);
      this.field_1128 = this.field_1284.method_254("en", 1240);
      this.field_1129 = this.field_1284.method_254("en", 1241);
      this.field_1130 = this.field_1284.method_254("en", 1242);
      this.field_1133 = this.field_1284.method_254("en", 1050);
      this.field_1134 = this.field_1284.method_254("en", 1051);
      this.field_1135 = this.field_1284.method_254("en", 1052);
      this.field_1136 = this.field_1284.method_254("en", 1053);
      this.field_1131 = this.field_1284.method_254("en", 1054);
      this.field_1132 = this.field_1284.method_254("en", 1055);
      this.field_1137 = this.field_1284.method_254("en", 1056);
      this.field_1138 = this.field_1284.method_254("en", 1057);
      this.field_1139 = this.field_1284.method_254("en", 1058);
      this.field_1140 = this.field_1284.method_254("en", 1059);
      this.field_1141 = this.field_1284.method_254("en", 1060);
      this.field_1142 = this.field_1284.method_254("en", 1061);
      this.field_1143 = this.field_1284.method_254("en", 1062);
      this.field_1144 = this.field_1284.method_254("en", 1063);
      this.field_1145 = this.field_1284.method_254("en", 1064);
      this.field_1146 = this.field_1284.method_254("en", 1065);
      this.field_1147 = this.field_1284.method_254("en", 1066);
      this.field_1148 = this.field_1284.method_254("en", 1067);
   }

   // $VF: renamed from: r (java.awt.Graphics) void
   public void method_420(Graphics var1) {
      this.method_460(var1);
      this.field_1110.paintIcon(field_1274, var1, this.field_1147, this.field_1148);
      if (this.field_1151) {
         this.field_1112.paintIcon(field_1274, var1, this.field_1123, this.field_1124);
      }

      if (this.field_1150) {
         this.field_1111.paintIcon(field_1274, var1, this.field_1131, this.field_1132);
      }

      if (this.field_1153) {
         this.field_1114.paintIcon(field_1274, var1, this.field_1145, this.field_1146);
         var1.setColor(new Color(12711676));
         var1.setFont(MastersOfDestiny.field_2831);
         var1.drawString("Processing your request, please wait...", 260, 260);
      }

      if (this.field_1152) {
         this.field_1113.paintIcon(field_1274, var1, this.field_1145, this.field_1146);
         var1.setColor(new Color(12711676));
         var1.setFont(MastersOfDestiny.field_2827);
         var1.drawString(field_1115[this.field_1116], 254, 250);
      }

      if (this.field_1155 != -1) {
         this.field_1154[this.field_1155].paintIcon(field_1274, var1, this.field_1156, this.field_1157);
      }
   }

   // $VF: renamed from: am (java.awt.event.MouseEvent) void
   public void method_421(MouseEvent var1) {
      this.field_1155 = -1;
      if (!this.field_1150 && !this.field_1152) {
         if (var1.getX() >= this.field_1127
            && var1.getX() <= this.field_1127 + this.field_1129
            && var1.getY() >= this.field_1128
            && var1.getY() <= this.field_1128 + this.field_1130) {
            class_3.field_20.method_17("res/sound/mouse_effects/mouse_over_A.wav");
            this.field_1155 = 1;
            this.field_1156 = this.field_1127;
            this.field_1157 = this.field_1128;
            return;
         }

         if (this.field_1151
            && var1.getX() >= this.field_1123
            && var1.getX() <= this.field_1123 + this.field_1125
            && var1.getY() >= this.field_1124
            && var1.getY() <= this.field_1124 + this.field_1126) {
            class_3.field_20.method_17("res/sound/mouse_effects/mouse_over_A.wav");
            this.field_1155 = 0;
            this.field_1156 = this.field_1123;
            this.field_1157 = this.field_1124;
            return;
         }
      }

      if (this.field_1150) {
         if (var1.getX() >= this.field_1133
            && var1.getX() <= this.field_1133 + this.field_1135
            && var1.getY() >= this.field_1134
            && var1.getY() <= this.field_1134 + this.field_1136) {
            class_3.field_20.method_17("res/sound/mouse_effects/mouse_over_A.wav");
            this.field_1155 = 0;
            this.field_1156 = this.field_1133;
            this.field_1157 = this.field_1134;
            return;
         }

         if (var1.getX() >= this.field_1137
            && var1.getX() <= this.field_1137 + this.field_1139
            && var1.getY() >= this.field_1138
            && var1.getY() <= this.field_1138 + this.field_1140) {
            class_3.field_20.method_17("res/sound/mouse_effects/mouse_over_A.wav");
            this.field_1155 = 0;
            this.field_1156 = this.field_1137;
            this.field_1157 = this.field_1138;
            return;
         }
      }

      if (this.field_1152
         && var1.getX() >= this.field_1141
         && var1.getX() <= this.field_1141 + this.field_1143
         && var1.getY() >= this.field_1142
         && var1.getY() <= this.field_1142 + this.field_1144) {
         class_3.field_20.method_17("res/sound/mouse_effects/mouse_over_A.wav");
         this.field_1155 = 0;
         this.field_1156 = this.field_1141;
         this.field_1157 = this.field_1142;
      }
   }

   // $VF: renamed from: an (java.awt.event.MouseEvent) void
   public void method_422(MouseEvent var1) {
      if (!this.field_1150 && !this.field_1152) {
         if (this.field_1151
            && var1.getX() >= this.field_1123
            && var1.getX() <= this.field_1123 + this.field_1125
            && var1.getY() >= this.field_1124
            && var1.getY() <= this.field_1124 + this.field_1126) {
            class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
            this.field_1151 = false;
            this.field_1150 = true;
            this.field_1155 = -1;
            return;
         }

         if (var1.getX() >= this.field_1127
            && var1.getX() <= this.field_1127 + this.field_1129
            && var1.getY() >= this.field_1128
            && var1.getY() <= this.field_1128 + this.field_1130) {
            this.field_1155 = -1;
            class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_fail.wav");
            field_1274.remove(this.field_1117);
            field_1274.remove(this.field_1118);
            field_1274.remove(this.field_1119);
            field_1274.remove(this.field_1120);
            field_1274.remove(this.field_1121);
            field_1274.remove(this.field_1122);
            this.method_466((byte)8, null);
            field_1274.repaint();
            return;
         }
      }

      if (this.field_1150) {
         if (var1.getX() >= this.field_1133
            && var1.getX() <= this.field_1133 + this.field_1135
            && var1.getY() >= this.field_1134
            && var1.getY() <= this.field_1134 + this.field_1136) {
            class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
            this.field_1150 = false;
            this.field_1155 = -1;
            if (this.field_1121.getText().equals(this.field_1122.getText())
               && this.field_1121.getText().length() <= 10
               && this.field_1120.getText().length() <= 10) {
               this.field_1151 = false;
               this.field_1153 = true;
               this.method_445();
            } else if (this.field_1120.getText().length() > 10) {
               this.field_1116 = 5;
               this.field_1152 = true;
            } else if (this.field_1121.getText().length() > 10) {
               this.field_1116 = 6;
               this.field_1152 = true;
            } else if (!this.field_1121.getText().equals(this.field_1122.getText())) {
               this.field_1116 = 7;
               this.field_1152 = true;
            }

            return;
         }

         if (var1.getX() >= this.field_1137
            && var1.getX() <= this.field_1137 + this.field_1139
            && var1.getY() >= this.field_1138
            && var1.getY() <= this.field_1138 + this.field_1140) {
            class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_fail.wav");
            this.field_1150 = false;
            this.field_1151 = true;
            this.field_1155 = -1;
            return;
         }
      }

      if (this.field_1152
         && var1.getX() >= this.field_1141
         && var1.getX() <= this.field_1141 + this.field_1143
         && var1.getY() >= this.field_1142
         && var1.getY() <= this.field_1142 + this.field_1144) {
         this.field_1152 = false;
         this.field_1155 = -1;
         class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
         if (this.field_1116 == 0) {
            field_1274.remove(this.field_1117);
            field_1274.remove(this.field_1118);
            field_1274.remove(this.field_1119);
            field_1274.remove(this.field_1120);
            field_1274.remove(this.field_1121);
            field_1274.remove(this.field_1122);
            this.method_466((byte)10, null);
         } else {
            this.field_1151 = true;
         }
      }
   }

   // $VF: renamed from: g (java.awt.event.KeyEvent) void
   public void method_423(KeyEvent var1) {
      if (this.field_1151) {
         switch (var1.getKeyCode()) {
            case 10:
               this.field_1151 = false;
               this.field_1150 = true;
               this.field_1155 = -1;
         }
      }
   }

   // $VF: renamed from: s (java.lang.Object) void
   public void method_424(Object var1) {
      this.field_395 = this.field_1284.method_256("en", 0);
      this.field_1207 = true;
      this.field_1240 = false;
      field_1274.removeAll();
      this.field_1158 = new ImageIcon(this.getClass().getResource(this.field_1284.method_256("en", 0) + this.field_1284.method_256("en", 144)));
      this.field_1159 = new int[5];
      this.field_1159[0] = this.field_1284.method_254("en", 147);
      this.field_1159[1] = this.field_1284.method_254("en", 149);
      this.field_1159[2] = this.field_1284.method_254("en", 151);
      this.field_1159[3] = this.field_1284.method_254("en", 153);
      this.field_1159[4] = this.field_1284.method_254("en", 155);
      this.field_1160 = new int[5];
      this.field_1160[0] = this.field_1284.method_254("en", 148);
      this.field_1160[1] = this.field_1284.method_254("en", 150);
      this.field_1160[2] = this.field_1284.method_254("en", 152);
      this.field_1160[3] = this.field_1284.method_254("en", 154);
      this.field_1160[4] = this.field_1284.method_254("en", 156);
      this.field_1161 = this.field_1284.method_254("en", 157);
      this.field_1162 = this.field_1284.method_254("en", 158);
      this.field_1177 = new ImageIcon(this.getClass().getResource(this.field_1284.method_256("en", 0) + this.field_1284.method_256("en", 159)));
      this.field_1076 = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1078)));
      this.field_1086 = this.field_1284.method_254("en", 1089);
      this.field_1087 = this.field_1284.method_254("en", 1090);
      this.field_1088 = this.field_1284.method_254("en", 1091);
      this.field_1089 = this.field_1284.method_254("en", 1092);
      this.field_1090 = this.field_1284.method_254("en", 1093);
      this.field_1091 = this.field_1284.method_254("en", 1094);
      this.field_1103 = false;
      this.field_1201 = this.field_1284.method_254("en", 173);
      this.field_1202 = this.field_1284.method_254("en", 174);
      this.field_1203 = this.field_1284.method_254("en", 177);
      this.field_1204 = this.field_1284.method_254("en", 178);
      this.field_1205 = this.field_1284.method_254("en", 175);
      this.field_1206 = this.field_1284.method_254("en", 1244);
      this.field_1208 = false;
      this.field_1209 = new ImageIcon(this.getClass().getResource(this.field_1284.method_256("en", 0) + this.field_1284.method_256("en", 1367)));
      this.field_1210 = this.field_1284.method_254("en", 1368);
      this.field_1211 = this.field_1284.method_254("en", 1369);
      this.field_1178 = new Icon[5][5];
      this.field_1179 = new int[5];
      this.field_1180 = new int[5];
      this.field_1181 = new int[5];
      this.field_1182 = new Icon[5][5];
      this.field_1183 = new int[5];
      this.field_1184 = new int[5];
      this.field_1185 = new int[5];
      this.field_1336[0] = 0;
      this.field_1336[1] = 0;
      this.field_1336[2] = 0;
      this.field_1336[3] = 0;
      this.field_1336[4] = 0;
      this.field_1186 = new int[5];
      this.field_1186[0] = 0;
      this.field_1186[1] = 0;
      this.field_1186[2] = 0;
      this.field_1186[3] = 0;
      this.field_1186[4] = 0;
      this.field_1187 = new int[5];
      this.field_1191 = new ImageIcon(this.getClass().getResource(this.field_1284.method_256("en", 0) + this.field_1284.method_256("en", 172)));
      this.field_1197 = new Icon[2];
      this.field_1197[0] = new ImageIcon(this.getClass().getResource(this.field_1284.method_256("en", 0) + this.field_1284.method_256("en", 1218)));
      this.field_1197[1] = new ImageIcon(this.getClass().getResource(this.field_1284.method_256("en", 0) + this.field_1284.method_256("en", 1217)));
      this.field_1200 = -1;
      this.field_1198 = 0;
      this.field_1199 = 0;
      this.field_1163 = new JLabel[5];
      this.field_1163[0] = new JLabel();
      this.field_1163[0].setOpaque(false);
      this.field_1163[0].setFocusable(false);
      this.field_1163[0]
         .setBounds(
            this.field_1284.method_254("en", 160) - 52,
            this.field_1284.method_254("en", 161) - 61,
            this.field_1284.method_254("en", 170),
            this.field_1284.method_254("en", 171)
         );
      this.field_1163[0].setForeground(new Color(8838126));
      this.field_1163[0].setFont(new Font(null, 1, 12));
      this.field_1163[0].setHorizontalAlignment(0);
      this.field_1163[0].setVerticalAlignment(0);
      field_1274.add(this.field_1163[0]);
      this.field_1163[1] = new JLabel();
      this.field_1163[1].setOpaque(false);
      this.field_1163[1].setFocusable(false);
      this.field_1163[1]
         .setBounds(
            this.field_1284.method_254("en", 162) - 52,
            this.field_1284.method_254("en", 163) - 61,
            this.field_1284.method_254("en", 170),
            this.field_1284.method_254("en", 171)
         );
      this.field_1163[1].setForeground(new Color(8838126));
      this.field_1163[1].setFont(new Font(null, 1, 12));
      this.field_1163[1].setHorizontalAlignment(0);
      this.field_1163[1].setVerticalAlignment(0);
      field_1274.add(this.field_1163[1]);
      this.field_1163[2] = new JLabel();
      this.field_1163[2].setOpaque(false);
      this.field_1163[2].setFocusable(false);
      this.field_1163[2]
         .setBounds(
            this.field_1284.method_254("en", 164) - 52,
            this.field_1284.method_254("en", 165) - 61,
            this.field_1284.method_254("en", 170),
            this.field_1284.method_254("en", 171)
         );
      this.field_1163[2].setForeground(new Color(8838126));
      this.field_1163[2].setFont(new Font(null, 1, 12));
      this.field_1163[2].setHorizontalAlignment(0);
      this.field_1163[2].setVerticalAlignment(0);
      field_1274.add(this.field_1163[2]);
      this.field_1163[3] = new JLabel();
      this.field_1163[3].setOpaque(false);
      this.field_1163[3].setFocusable(false);
      this.field_1163[3]
         .setBounds(
            this.field_1284.method_254("en", 166) - 52,
            this.field_1284.method_254("en", 167) - 61,
            this.field_1284.method_254("en", 170),
            this.field_1284.method_254("en", 171)
         );
      this.field_1163[3].setForeground(new Color(8838126));
      this.field_1163[3].setFont(new Font(null, 1, 12));
      this.field_1163[3].setHorizontalAlignment(0);
      this.field_1163[3].setVerticalAlignment(0);
      field_1274.add(this.field_1163[3]);
      this.field_1163[4] = new JLabel();
      this.field_1163[4].setOpaque(false);
      this.field_1163[4].setFocusable(false);
      this.field_1163[4]
         .setBounds(
            this.field_1284.method_254("en", 168) - 52,
            this.field_1284.method_254("en", 169) - 61,
            this.field_1284.method_254("en", 170),
            this.field_1284.method_254("en", 171)
         );
      this.field_1163[4].setForeground(new Color(8838126));
      this.field_1163[4].setFont(new Font(null, 1, 12));
      this.field_1163[4].setHorizontalAlignment(0);
      this.field_1163[4].setVerticalAlignment(0);
      field_1274.add(this.field_1163[4]);
      this.field_1192 = new JLabel();
      this.field_1192.setOpaque(false);
      this.field_1192.setFocusable(false);
      this.field_1192.setBackground(new Color(4280407));
      this.field_1192.setBorder(BorderFactory.createLineBorder(new Color(4280407)));
      this.field_1192
         .setBounds(
            this.field_1284.method_254("en", 129),
            this.field_1284.method_254("en", 130),
            this.field_1284.method_254("en", 131),
            this.field_1284.method_254("en", 132)
         );
      this.field_1192.setForeground(new Color(8838126));
      this.field_1192.setFont(new Font(null, 1, 12));
      this.field_1192.setHorizontalAlignment(0);
      this.field_1192.setVerticalAlignment(0);
      field_1274.add(this.field_1192);
      this.field_1340 = 0;
      this.field_1193 = "Please wait";
      this.field_1192.setText(this.field_1193);
      this.field_1194 = 0;
      this.field_1240 = false;
      this.field_1195 = 100L;
      this.field_1196 = System.currentTimeMillis() + this.field_1195;
      this.field_1193 = "Requesting for your characters";
      this.field_1192.setText(this.field_1193);
      this.field_1194 = 0;
      this.field_1240 = false;
      this.field_1234.write("RC|" + field_436 + "\n");
      this.field_1234.flush();
      class_62.method_563("request for character");
   }

   // $VF: renamed from: s (java.awt.Graphics) void
   public void method_425(Graphics var1) {
      this.method_460(var1);
      this.field_1158.paintIcon(field_1274, var1, this.field_1284.method_254("en", 145), this.field_1284.method_254("en", 146));
      if (this.field_1178[0] != null && this.field_1178[0][0] != null && this.field_1182[0][0] != null) {
         int var2 = this.field_1186[0];
         int var9 = this.field_1186[0];
         if (this.field_1188 == 0 || this.field_1190 == 0) {
            if (this.field_1185[0] != this.field_1187[0] && this.field_1186[0] != 0) {
               var2 = this.field_1186[0] % (this.field_1185[0] + 1);
               if (var2 == 0) {
                  var2 = 1;
               }
            }

            if (this.field_1181[0] != this.field_1187[0] && this.field_1186[0] != 0) {
               var9 = --var9 % this.field_1181[0];
               var9++;
            }
         }

         this.field_1182[0][var2].paintIcon(field_1274, var1, this.field_1159[0] - 5 + this.field_1183[0], this.field_1160[0] - 8 + this.field_1184[0]);
         this.field_1178[0][var9].paintIcon(field_1274, var1, this.field_1159[0] - 5 + this.field_1179[0], this.field_1160[0] - 8 + this.field_1180[0]);
      } else {
         this.field_1177.paintIcon(field_1274, var1, this.field_1159[0], this.field_1160[0]);
      }

      if (this.field_1178[1] != null && this.field_1178[1][0] != null && this.field_1182[1][0] != null) {
         int var4 = this.field_1186[1];
         int var10 = this.field_1186[1];
         if (this.field_1188 == 1 || this.field_1190 == 1) {
            if (this.field_1185[1] != this.field_1187[1] && this.field_1186[1] != 0) {
               var4 = this.field_1186[1] % (this.field_1185[1] + 1);
               if (var4 == 0) {
                  var4 = 1;
               }
            }

            if (this.field_1181[1] != this.field_1187[1] && this.field_1186[1] != 0) {
               var10 = --var10 % (this.field_1181[1] + 1);
               if (var10 == 0) {
                  var10 = 1;
               }
            }
         }

         this.field_1182[1][var4].paintIcon(field_1274, var1, this.field_1159[1] - 5 + this.field_1183[1], this.field_1160[1] - 8 + this.field_1184[1]);
         this.field_1178[1][var10].paintIcon(field_1274, var1, this.field_1159[1] - 5 + this.field_1179[1], this.field_1160[1] - 8 + this.field_1180[1]);
      } else {
         this.field_1177.paintIcon(field_1274, var1, this.field_1159[1], this.field_1160[1]);
      }

      if (this.field_1178[2] != null && this.field_1178[2][0] != null && this.field_1182[2][0] != null) {
         int var5 = this.field_1186[2];
         int var12 = this.field_1186[2];
         if (this.field_1188 == 2 || this.field_1190 == 2) {
            if (this.field_1185[2] != this.field_1187[2] && this.field_1186[2] != 0) {
               var5 = this.field_1186[2] % (this.field_1185[2] + 1);
               if (var5 == 0) {
                  var5 = 1;
               }
            }

            if (this.field_1181[2] != this.field_1187[2] && this.field_1186[2] != 0) {
               var12 = --var12 % (this.field_1181[2] + 1);
               if (var12 == 0) {
                  var12 = 1;
               }
            }
         }

         this.field_1182[2][var5].paintIcon(field_1274, var1, this.field_1159[2] - 5 + this.field_1183[2], this.field_1160[2] - 8 + this.field_1184[2]);
         this.field_1178[2][var12].paintIcon(field_1274, var1, this.field_1159[2] - 5 + this.field_1179[2], this.field_1160[2] - 8 + this.field_1180[2]);
      } else {
         this.field_1177.paintIcon(field_1274, var1, this.field_1159[2], this.field_1160[2]);
      }

      if (this.field_1178[3] != null && this.field_1178[3][0] != null && this.field_1182[3][0] != null) {
         int var6 = this.field_1186[3];
         int var14 = this.field_1186[3];
         if (this.field_1188 == 3 || this.field_1190 == 3) {
            if (this.field_1185[3] != this.field_1187[3] && this.field_1186[3] != 0) {
               var6 = this.field_1186[3] % (this.field_1185[3] + 1);
               if (var6 == 0) {
                  var6 = 1;
               }
            }

            if (this.field_1181[3] != this.field_1187[3] && this.field_1186[3] != 0) {
               var14 = --var14 % (this.field_1181[3] + 1);
               if (var14 == 0) {
                  var14 = 1;
               }
            }
         }

         this.field_1182[3][var6].paintIcon(field_1274, var1, this.field_1159[3] - 5 + this.field_1183[3], this.field_1160[3] - 8 + this.field_1184[3]);
         this.field_1178[3][var14].paintIcon(field_1274, var1, this.field_1159[3] - 5 + this.field_1179[3], this.field_1160[3] - 8 + this.field_1180[3]);
      } else {
         this.field_1177.paintIcon(field_1274, var1, this.field_1159[3], this.field_1160[3]);
      }

      if (this.field_1178[4] != null && this.field_1178[4][0] != null && this.field_1182[4][0] != null) {
         int var7 = this.field_1186[4];
         int var16 = this.field_1186[4];
         if (this.field_1188 == 4 || this.field_1190 == 4) {
            if (this.field_1185[4] != this.field_1187[4] && this.field_1186[4] != 0) {
               var7 = this.field_1186[4] % (this.field_1185[4] + 1);
               if (var7 == 0) {
                  var7 = 1;
               }
            }

            if (this.field_1181[4] != this.field_1187[4] && this.field_1186[4] != 0) {
               var16 = --var16 % (this.field_1181[4] + 1);
               if (var16 == 0) {
                  var16 = 1;
               }
            }
         }

         this.field_1182[4][var7].paintIcon(field_1274, var1, this.field_1159[4] - 5 + this.field_1183[4], this.field_1160[4] - 8 + this.field_1184[4]);
         this.field_1178[4][var16].paintIcon(field_1274, var1, this.field_1159[4] - 5 + this.field_1179[4], this.field_1160[4] - 8 + this.field_1180[4]);
      } else {
         this.field_1177.paintIcon(field_1274, var1, this.field_1159[4], this.field_1160[4]);
      }

      if (this.field_1207) {
         this.field_1237.paintIcon(field_1274, var1, this.field_1284.method_254("en", 115), this.field_1284.method_254("en", 116));
      } else {
         this.field_1191.paintIcon(field_1274, var1, this.field_1159[this.field_1188], this.field_1160[this.field_1188]);
      }

      if (this.field_1103) {
         this.field_1076.paintIcon(field_1274, var1, this.field_1086, this.field_1087 + 280);
         var1.setColor(new Color(12711676));
         var1.setFont(MastersOfDestiny.field_2827);
         var1.drawString(this.field_1069, 264, 520);
      }

      if (this.field_1208) {
         this.field_1209.paintIcon(field_1274, var1, this.field_1086, this.field_1087 + 280);
         var1.setColor(new Color(12711676));
         var1.setFont(MastersOfDestiny.field_2827);
         var1.drawString("Confirm to delete this character?", 300, 520);
      }

      if (this.field_1200 != -1) {
         this.field_1197[this.field_1200].paintIcon(field_1274, var1, this.field_1198, this.field_1199);
      }
   }

   // $VF: renamed from: c () void
   public void method_426() {
      if (System.currentTimeMillis() > this.field_1196) {
         if (!this.field_1240) {
            if (this.field_1192 != null) {
               this.field_1194 = (this.field_1194 + 1) % 4;
               if (this.field_1194 != 0) {
                  this.field_1192.setText(this.field_1192.getText() + ".");
               } else {
                  this.field_1192.setText(this.field_1193);
               }
            } else if (!this.field_1207) {
               if (this.field_1190 != -1 && this.field_1190 != this.field_1188 && this.field_1187[this.field_1190] != 0) {
                  this.field_1186[this.field_1190] = (this.field_1186[this.field_1190] + 1) % this.field_1187[this.field_1190];
                  if (this.field_1186[this.field_1190] == 0) {
                     this.field_1186[this.field_1190] = 1;
                  }
               }

               if (this.field_1187[this.field_1188] != 0) {
                  this.field_1186[this.field_1188] = (this.field_1186[this.field_1188] + 1) % (this.field_1187[this.field_1188] + 1);
                  if (this.field_1186[this.field_1188] == 0) {
                     this.field_1186[this.field_1188] = 1;
                  }
               }
            }

            this.field_1196 = this.field_1196 + this.field_1195;
         } else {
            if (this.field_1192 != null) {
               this.field_1192.hide();
            }

            this.field_1192 = null;
            this.field_1240 = false;
            this.field_1188 = 0;
            this.field_1186[this.field_1188] = 1;
            this.field_1207 = false;
         }
      }
   }

   // $VF: renamed from: ao (java.awt.event.MouseEvent) void
   public void method_427(MouseEvent var1) {
      if (this.field_1192 == null) {
         this.field_1200 = -1;
         if (!this.field_1103 && !this.field_1207 && !this.field_1208) {
            if (var1.getX() >= this.field_1201
               && var1.getX() <= this.field_1201 + this.field_1203
               && var1.getY() >= this.field_1202
               && var1.getY() <= this.field_1202 + this.field_1204) {
               this.field_1200 = 0;
               this.field_1198 = this.field_1201;
               this.field_1199 = this.field_1202;
               return;
            }

            if (var1.getX() >= this.field_1205
               && var1.getX() <= this.field_1205 + this.field_1203
               && var1.getY() >= this.field_1202
               && var1.getY() <= this.field_1202 + this.field_1204) {
               this.field_1200 = 0;
               this.field_1198 = this.field_1205;
               this.field_1199 = this.field_1202;
               return;
            }

            if (var1.getX() >= this.field_1206
               && var1.getX() <= this.field_1206 + this.field_1203
               && var1.getY() >= this.field_1202
               && var1.getY() <= this.field_1202 + this.field_1204) {
               this.field_1200 = 0;
               this.field_1198 = this.field_1206;
               this.field_1199 = this.field_1202;
               return;
            }
         }

         if (this.field_1103
            && var1.getX() >= this.field_1088
            && var1.getX() <= this.field_1088 + this.field_1090
            && var1.getY() >= this.field_1089 + 280
            && var1.getY() <= this.field_1089 + this.field_1091 + 280) {
            this.field_1200 = 1;
            this.field_1198 = this.field_1088;
            this.field_1199 = this.field_1089 + 280;
         } else {
            if (this.field_1208) {
               if (var1.getX() >= this.field_1210
                  && var1.getX() <= this.field_1210 + this.field_1090
                  && var1.getY() >= this.field_1089 + 280
                  && var1.getY() <= this.field_1089 + this.field_1091 + 280) {
                  this.field_1200 = 1;
                  this.field_1198 = this.field_1210;
                  this.field_1199 = this.field_1089 + 280;
                  return;
               }

               if (var1.getX() >= this.field_1211
                  && var1.getX() <= this.field_1211 + this.field_1090
                  && var1.getY() >= this.field_1089 + 280
                  && var1.getY() <= this.field_1089 + this.field_1091 + 280) {
                  this.field_1200 = 1;
                  this.field_1198 = this.field_1211;
                  this.field_1199 = this.field_1089 + 280;
                  return;
               }
            }

            if (var1.getX() >= this.field_1159[0]
               && var1.getX() <= this.field_1159[0] + this.field_1161
               && var1.getY() >= this.field_1160[0]
               && var1.getY() <= this.field_1160[0] + this.field_1162) {
               if (this.field_1190 != 0 && this.field_1340 >= 0) {
                  class_62.method_563("0 charHover = " + this.field_1190);
                  if (this.field_1190 != -1) {
                     this.field_1186[this.field_1190] = 0;
                  }

                  this.field_1190 = 0;
                  this.field_1186[this.field_1190] = 1;
                  class_3.field_20.method_17("res/sound/mouse_effects/mouse_over_A.wav");
               }
            } else if (var1.getX() >= this.field_1159[1]
               && var1.getX() <= this.field_1159[1] + this.field_1161
               && var1.getY() >= this.field_1160[1]
               && var1.getY() <= this.field_1160[1] + this.field_1162) {
               if (this.field_1190 != 1 && this.field_1340 >= 1) {
                  class_62.method_563("1 charHover = " + this.field_1190);
                  if (this.field_1190 != -1) {
                     this.field_1186[this.field_1190] = 0;
                  }

                  this.field_1190 = 1;
                  this.field_1186[this.field_1190] = 1;
                  class_3.field_20.method_17("res/sound/mouse_effects/mouse_over_A.wav");
               }
            } else if (var1.getX() >= this.field_1159[2]
               && var1.getX() <= this.field_1159[2] + this.field_1161
               && var1.getY() >= this.field_1160[2]
               && var1.getY() <= this.field_1160[2] + this.field_1162) {
               if (this.field_1190 != 2 && this.field_1340 >= 2) {
                  class_62.method_563("2 charHover = " + this.field_1190);
                  if (this.field_1190 != -1) {
                     this.field_1186[this.field_1190] = 0;
                  }

                  this.field_1190 = 2;
                  this.field_1186[this.field_1190] = 1;
                  class_3.field_20.method_17("res/sound/mouse_effects/mouse_over_A.wav");
               }
            } else if (var1.getX() >= this.field_1159[3]
               && var1.getX() <= this.field_1159[3] + this.field_1161
               && var1.getY() >= this.field_1160[3]
               && var1.getY() <= this.field_1160[3] + this.field_1162) {
               if (this.field_1190 != 3 && this.field_1340 >= 3) {
                  class_62.method_563("3 charHover = " + this.field_1190);
                  if (this.field_1190 != -1) {
                     this.field_1186[this.field_1190] = 0;
                  }

                  this.field_1190 = 3;
                  this.field_1186[this.field_1190] = 1;
                  class_3.field_20.method_17("res/sound/mouse_effects/mouse_over_A.wav");
               }
            } else if (var1.getX() >= this.field_1159[4]
               && var1.getX() <= this.field_1159[4] + this.field_1161
               && var1.getY() >= this.field_1160[4]
               && var1.getY() <= this.field_1160[4] + this.field_1162) {
               if (this.field_1190 != 4 && this.field_1340 >= 4) {
                  class_62.method_563("4 charHover = " + this.field_1190);
                  if (this.field_1190 != -1) {
                     this.field_1186[this.field_1190] = 0;
                  }

                  this.field_1190 = 4;
                  this.field_1186[this.field_1190] = 1;
                  class_3.field_20.method_17("res/sound/mouse_effects/mouse_over_A.wav");
               }
            } else {
               if (this.field_1190 != -1) {
                  this.field_1186[this.field_1190] = 0;
               }

               this.field_1190 = -1;
            }
         }
      }
   }

   // $VF: renamed from: a (int) void
   public void method_428(int var1) {
      this.field_1186[this.field_1188] = 0;
      this.field_1188 = var1;
      this.field_1186[this.field_1188] = 1;
      class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
   }

   // $VF: renamed from: ap (java.awt.event.MouseEvent) void
   public void method_429(MouseEvent var1) {
      if (this.field_1192 == null) {
         if (this.field_1103) {
            if (var1.getX() >= this.field_1088
               && var1.getX() <= this.field_1088 + this.field_1090
               && var1.getY() >= this.field_1089 + 280
               && var1.getY() <= this.field_1089 + this.field_1091 + 280) {
               class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
               this.field_1103 = false;
               this.field_1200 = -1;
            }
         } else {
            if (this.field_1208) {
               if (var1.getX() >= this.field_1210
                  && var1.getX() <= this.field_1210 + this.field_1090
                  && var1.getY() >= this.field_1089 + 280
                  && var1.getY() <= this.field_1089 + this.field_1091 + 280) {
                  this.method_433();
                  this.field_1200 = -1;
                  this.field_1208 = false;
                  return;
               }

               if (var1.getX() >= this.field_1211
                  && var1.getX() <= this.field_1211 + this.field_1090
                  && var1.getY() >= this.field_1089 + 280
                  && var1.getY() <= this.field_1089 + this.field_1091 + 280) {
                  this.field_1200 = -1;
                  this.field_1208 = false;
                  return;
               }
            }

            if (var1.getX() >= this.field_1159[0]
               && var1.getX() <= this.field_1159[0] + this.field_1161
               && var1.getY() >= this.field_1160[0]
               && var1.getY() <= this.field_1160[0] + this.field_1162
               && this.field_1340 >= 0) {
               this.method_428(0);
            }

            if (var1.getX() >= this.field_1159[1]
               && var1.getX() <= this.field_1159[1] + this.field_1161
               && var1.getY() >= this.field_1160[1]
               && var1.getY() <= this.field_1160[1] + this.field_1162
               && this.field_1340 >= 1) {
               this.method_428(1);
            }

            if (var1.getX() >= this.field_1159[2]
               && var1.getX() <= this.field_1159[2] + this.field_1161
               && var1.getY() >= this.field_1160[2]
               && var1.getY() <= this.field_1160[2] + this.field_1162
               && this.field_1340 >= 2) {
               this.method_428(2);
            }

            if (var1.getX() >= this.field_1159[3]
               && var1.getX() <= this.field_1159[3] + this.field_1161
               && var1.getY() >= this.field_1160[3]
               && var1.getY() <= this.field_1160[3] + this.field_1162
               && this.field_1340 >= 3) {
               this.method_428(3);
            }

            if (var1.getX() >= this.field_1159[4]
               && var1.getX() <= this.field_1159[4] + this.field_1161
               && var1.getY() >= this.field_1160[4]
               && var1.getY() <= this.field_1160[4] + this.field_1162
               && this.field_1340 >= 4) {
               this.method_428(4);
            }

            if (var1.getX() >= this.field_1201
               && var1.getX() <= this.field_1201 + this.field_1203
               && var1.getY() >= this.field_1202
               && var1.getY() <= this.field_1202 + this.field_1204) {
               this.method_432();
            } else if (var1.getX() >= this.field_1205
               && var1.getX() <= this.field_1205 + this.field_1203
               && var1.getY() >= this.field_1202
               && var1.getY() <= this.field_1202 + this.field_1204) {
               this.field_1208 = true;
               this.field_1200 = -1;
            } else if (var1.getX() >= this.field_1206
               && var1.getX() <= this.field_1206 + this.field_1203
               && var1.getY() >= this.field_1202
               && var1.getY() <= this.field_1202 + this.field_1204) {
               class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_fail.wav");
               this.field_1234.write("RD|" + field_436 + "\n");
               this.field_1234.flush();
               this.field_1200 = -1;
               field_1274.remove(this.field_1163[0]);
               field_1274.remove(this.field_1163[1]);
               field_1274.remove(this.field_1163[2]);
               field_1274.remove(this.field_1163[3]);
               field_1274.remove(this.field_1163[4]);
               this.method_466((byte)2, null);
               field_1274.repaint();
            }
         }
      }
   }

   // $VF: renamed from: h (java.awt.event.KeyEvent) void
   public void method_430(KeyEvent var1) {
      if (this.field_1192 == null) {
         if (var1.getKeyChar() == 'a' || var1.getKeyChar() == 'd' || var1.getKeyChar() == 'w' || var1.getKeyChar() == 's') {
            this.method_428((this.field_1188 + 1) % 5);
            class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
         }
      }
   }

   // $VF: renamed from: i (java.awt.event.KeyEvent) void
   public void method_431(KeyEvent var1) {
      if (this.field_1192 == null) {
         switch (var1.getKeyCode()) {
            case 10:
               this.method_432();
         }
      }
   }

   // $VF: renamed from: d () void
   public void method_432() {
      class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
      this.field_1200 = -1;
      field_1274.remove(this.field_1163[0]);
      field_1274.remove(this.field_1163[1]);
      field_1274.remove(this.field_1163[2]);
      field_1274.remove(this.field_1163[3]);
      field_1274.remove(this.field_1163[4]);
      field_1212 = Integer.parseInt(this.field_1334[this.field_1188]);
      field_1213 = this.field_1337[this.field_1188];
      field_1214 = this.field_1336[this.field_1188];
      field_1215 = this.field_1338[this.field_1188];
      field_1216 = this.field_1339[this.field_1188];
      class_62.method_563("test: char selected = " + this.field_1188);
      class_62.method_563("test: level = " + this.field_1335[this.field_1188]);
      this.field_552 = this.field_1276.method_31("group" + field_1214 + ".txt");
      this.field_1234.write("RS|" + field_1212 + "|" + field_436 + "|" + field_439 + "\n");
      this.field_1234.flush();
      this.method_466((byte)26, null);
   }

   // $VF: renamed from: e () void
   public void method_433() {
      class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_fail.wav");
      this.field_1200 = -1;
      this.field_1189 = this.field_1188;
      this.field_1234.write("P4|" + this.field_1334[this.field_1188] + "\n");
      this.field_1234.flush();
      class_62.method_563("delete character: " + this.field_1337[this.field_1188] + "<" + this.field_1334[this.field_1188] + ">");
   }

   // $VF: renamed from: t (java.lang.Object) void
   public void method_434(Object var1) {
      for (int var2 = 0; var2 < this.field_1186.length; var2++) {
         this.field_1186[var2] = 0;
      }

      this.field_1192 = new JLabel();
      this.field_1192.setOpaque(false);
      this.field_1192.setFocusable(false);
      this.field_1192.setBackground(new Color(4280407));
      this.field_1192.setBorder(BorderFactory.createLineBorder(new Color(4280407)));
      this.field_1192
         .setBounds(
            this.field_1284.method_254("en", 129),
            this.field_1284.method_254("en", 130),
            this.field_1284.method_254("en", 131),
            this.field_1284.method_254("en", 132)
         );
      this.field_1192.setForeground(new Color(8838126));
      this.field_1192.setFont(new Font(null, 1, 12));
      this.field_1192.setHorizontalAlignment(0);
      this.field_1192.setVerticalAlignment(0);
      field_1274.add(this.field_1192);
      this.field_1192.setText("Please wait...");
   }

   // $VF: renamed from: t (java.awt.Graphics) void
   public void method_435(Graphics var1) {
      this.method_460(var1);
      this.field_1158.paintIcon(field_1274, var1, this.field_1284.method_254("en", 145), this.field_1284.method_254("en", 146));
      if (this.field_1178[0] != null && this.field_1178[0][0] != null && this.field_1182[0][0] != null) {
         this.field_1182[0][this.field_1186[0] % this.field_1185[0]]
            .paintIcon(field_1274, var1, this.field_1159[0] - 5 + this.field_1183[0], this.field_1160[0] - 8 + this.field_1184[0]);
         this.field_1178[0][this.field_1186[0] % this.field_1181[0]]
            .paintIcon(field_1274, var1, this.field_1159[0] - 5 + this.field_1179[0], this.field_1160[0] - 8 + this.field_1180[0]);
      } else {
         this.field_1177.paintIcon(field_1274, var1, this.field_1159[0], this.field_1160[0]);
      }

      if (this.field_1178[1] != null && this.field_1178[1][0] != null && this.field_1182[1][0] != null) {
         this.field_1182[1][this.field_1186[1] % this.field_1185[1]]
            .paintIcon(field_1274, var1, this.field_1159[1] - 5 + this.field_1183[1], this.field_1160[1] - 8 + this.field_1184[1]);
         this.field_1178[1][this.field_1186[1] % this.field_1181[1]]
            .paintIcon(field_1274, var1, this.field_1159[1] - 5 + this.field_1179[1], this.field_1160[1] - 8 + this.field_1180[1]);
      } else {
         this.field_1177.paintIcon(field_1274, var1, this.field_1159[1], this.field_1160[1]);
      }

      if (this.field_1178[2] != null && this.field_1178[2][0] != null && this.field_1182[2][0] != null) {
         this.field_1182[2][this.field_1186[2] % this.field_1185[2]]
            .paintIcon(field_1274, var1, this.field_1159[2] - 5 + this.field_1183[2], this.field_1160[2] - 8 + this.field_1184[2]);
         this.field_1178[2][this.field_1186[2] % this.field_1181[2]]
            .paintIcon(field_1274, var1, this.field_1159[2] - 5 + this.field_1179[2], this.field_1160[2] - 8 + this.field_1180[2]);
      } else {
         this.field_1177.paintIcon(field_1274, var1, this.field_1159[2], this.field_1160[2]);
      }

      if (this.field_1178[3] != null && this.field_1178[3][0] != null && this.field_1182[3][0] != null) {
         this.field_1182[3][this.field_1186[3] % this.field_1185[3]]
            .paintIcon(field_1274, var1, this.field_1159[3] - 5 + this.field_1183[3], this.field_1160[3] - 8 + this.field_1184[3]);
         this.field_1178[3][this.field_1186[3] % this.field_1181[3]]
            .paintIcon(field_1274, var1, this.field_1159[3] - 5 + this.field_1179[3], this.field_1160[3] - 8 + this.field_1180[3]);
      } else {
         this.field_1177.paintIcon(field_1274, var1, this.field_1159[3], this.field_1160[3]);
      }

      if (this.field_1178[4] != null && this.field_1178[4][0] != null && this.field_1182[4][0] != null) {
         this.field_1182[4][this.field_1186[4] % this.field_1185[4]]
            .paintIcon(field_1274, var1, this.field_1159[4] - 5 + this.field_1183[4], this.field_1160[4] - 8 + this.field_1184[4]);
         this.field_1178[4][this.field_1186[4] % this.field_1181[4]]
            .paintIcon(field_1274, var1, this.field_1159[4] - 5 + this.field_1179[4], this.field_1160[4] - 8 + this.field_1180[4]);
      } else {
         this.field_1177.paintIcon(field_1274, var1, this.field_1159[4], this.field_1160[4]);
      }

      this.field_1191.paintIcon(field_1274, var1, this.field_1159[this.field_1188], this.field_1160[this.field_1188]);
      this.field_1237.paintIcon(field_1274, var1, this.field_1284.method_254("en", 115), this.field_1284.method_254("en", 116));
   }

   // $VF: renamed from: u (java.lang.Object) void
   public void method_436(Object var1) {
      this.field_1222 = new ImageIcon(this.getClass().getResource(this.field_1284.method_256("en", 0) + this.field_1284.method_256("en", 133)));
      this.field_1223 = new Icon[2];
      this.field_1223[0] = new ImageIcon(this.getClass().getResource(this.field_1284.method_256("en", 0) + this.field_1284.method_256("en", 136)));
      this.field_1223[1] = new ImageIcon(this.getClass().getResource(this.field_1284.method_256("en", 0) + this.field_1284.method_256("en", 141)));
      this.field_1224 = new int[2];
      this.field_1224[0] = this.field_1284.method_254("en", 137);
      this.field_1224[1] = this.field_1284.method_254("en", 142);
      this.field_1225 = new int[2];
      this.field_1225[0] = this.field_1284.method_254("en", 138);
      this.field_1225[1] = this.field_1284.method_254("en", 143);
      this.field_1226 = this.field_1284.method_254("en", 139);
      this.field_1227 = this.field_1284.method_254("en", 140);
      this.field_1228 = 0;
   }

   // $VF: renamed from: u (java.awt.Graphics) void
   public void method_437(Graphics var1) {
      this.method_460(var1);
      this.field_1222.paintIcon(field_1274, var1, this.field_1284.method_254("en", 134), this.field_1284.method_254("en", 135));
      this.field_1223[this.field_1228].paintIcon(field_1274, var1, this.field_1224[this.field_1228], this.field_1225[this.field_1228]);
   }

   // $VF: renamed from: aq (java.awt.event.MouseEvent) void
   public void method_438(MouseEvent var1) {
      if (var1.getX() >= this.field_1224[0]
         && var1.getX() <= this.field_1226 + this.field_1224[0]
         && var1.getY() >= this.field_1225[0]
         && var1.getY() <= this.field_1225[0] + this.field_1227) {
         if (this.field_1228 != 0) {
            class_3.field_20.method_17("res/sound/mouse_effects/mouse_over_A.wav");
            this.field_1228 = 0;
         }
      } else if (var1.getX() >= this.field_1224[1]
         && var1.getX() <= this.field_1226 + this.field_1224[1]
         && var1.getY() >= this.field_1225[1]
         && var1.getY() <= this.field_1225[1] + this.field_1227
         && this.field_1228 != 1) {
         class_3.field_20.method_17("res/sound/mouse_effects/mouse_over_A.wav");
         this.field_1228 = 1;
      }
   }

   // $VF: renamed from: ar (java.awt.event.MouseEvent) void
   public void method_439(MouseEvent var1) {
      switch (this.field_1228) {
         case 0:
            if (var1.getX() >= this.field_1224[0]
               && var1.getX() <= this.field_1226 + this.field_1224[0]
               && var1.getY() >= this.field_1225[0]
               && var1.getY() <= this.field_1225[0] + this.field_1227) {
               class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
               this.method_466((byte)4, null);
            }

            field_1274.repaint();
            break;
         case 1:
            if (var1.getX() >= this.field_1224[1]
               && var1.getX() <= this.field_1226 + this.field_1224[1]
               && var1.getY() >= this.field_1225[1]
               && var1.getY() <= this.field_1225[1] + this.field_1227) {
               class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
               this.method_466((byte)3, null);
            }

            field_1274.repaint();
            break;
         default:
            class_62.method_563("default");
      }
   }

   // $VF: renamed from: j (java.awt.event.KeyEvent) void
   public void method_440(KeyEvent var1) {
      if (var1.getKeyChar() == 'a' || var1.getKeyChar() == 'd') {
         this.field_1228 ^= 1;
         class_3.field_20.method_17("res/sound/mouse_effects/mouse_over_A.wav");
      }
   }

   // $VF: renamed from: k (java.awt.event.KeyEvent) void
   public void method_441(KeyEvent var1) {
      switch (var1.getKeyCode()) {
         case 10:
            switch (this.field_1266) {
               case 0:
                  class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
                  this.method_466((byte)4, null);
                  field_1274.repaint();
                  break;
               case 1:
                  class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
                  this.method_466((byte)3, null);
                  field_1274.repaint();
            }
      }
   }

   // $VF: renamed from: v (java.lang.Object) void
   public void method_442(Object var1) {
      this.field_1271.method_665();
      this.field_774 = new class_63();
      this.field_774.method_567(209, 159, 369, 106, MastersOfDestiny.field_2808, MastersOfDestiny.field_2809);
      this.field_785 = false;
      this.field_1342 = false;
      this.field_787 = null;
      this.field_1237 = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 128)));
      class_62.method_563("b4 create textfield");
      this.field_1235 = new JTextField();
      class_62.method_563("after create textfield");
      this.field_1235.setOpaque(false);
      this.field_1235.setEditable(false);
      this.field_1235.setBackground(new Color(4280407));
      this.field_1235.setBorder(BorderFactory.createLineBorder(new Color(4280407)));
      this.field_1235
         .setBounds(
            this.field_1284.method_254("en", 129),
            this.field_1284.method_254("en", 130),
            this.field_1284.method_254("en", 131),
            this.field_1284.method_254("en", 132)
         );
      this.field_1235.setForeground(new Color(8838126));
      this.field_1235.setSelectionColor(new Color(8838126));
      this.field_1235.setSelectedTextColor(new Color(4810614));
      this.field_1235.setFont(new Font(null, 1, 12));
      this.field_1235.setHorizontalAlignment(0);
      field_1274.add(this.field_1235);
      this.field_1236 = "Connecting to server";
      this.field_1235.setText(this.field_1236);
      this.method_445();
   }

   // $VF: renamed from: v (java.awt.Graphics) void
   public void method_443(Graphics var1) {
      this.method_460(var1);
      if (this.field_1300 != 13) {
         this.field_1237.paintIcon(field_1274, var1, this.field_1284.method_254("en", 115), this.field_1284.method_254("en", 116));
      }
   }

   // $VF: renamed from: f () void
   public void method_444() {
      if (System.currentTimeMillis() > this.field_1242) {
         if (!this.field_1240) {
            this.field_1238 = (this.field_1238 + 1) % 4;
            if (this.field_1235 != null) {
               if (this.field_1238 != 0) {
                  this.field_1235.setText(this.field_1235.getText() + ".");
               } else {
                  this.field_1235.setText(this.field_1236);
               }
            }
         }

         if (this.field_1241 == this.field_1312) {
            class_62.method_563("removed txtbox");
            field_1274.remove(this.field_1235);
            this.method_466(this.field_1313, null);
         } else {
            this.field_1242 = this.field_1242 + this.field_1241;
         }
      }
   }

   // $VF: renamed from: g () void
   public void method_445() {
      String var1 = this.field_390;
      int var2 = Integer.parseInt(this.field_389 + "224");

      try {
         this.field_1238 = 0;
         this.field_1240 = false;
         this.field_1241 = 100L;
         this.field_1242 = System.currentTimeMillis() + this.field_1241;
         this.field_1231 = new Socket(var1, var2);
         this.field_1234 = new PrintWriter(this.field_1231.getOutputStream(), true);
         this.field_1233 = new BufferedReader(new InputStreamReader(this.field_1231.getInputStream()));
         this.field_1232 = new class_96(this);
         this.field_1232.start();
      } catch (IOException var4) {
         class_62.method_563("auth conection error = " + var4.getMessage());
         this.method_487("Unable to connect to the server.\nPlease try again.\n[Press Any Key]", (byte)8, null);
      }
   }

   // $VF: renamed from: w (java.lang.Object) void
   public void method_446(Object var1) {
      this.field_1243 = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 114)));
      this.field_1244 = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 123)));
      this.field_1255 = new Icon[2];
      this.field_1255[0] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1217)));
      this.field_1255[1] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 1218)));
      this.field_1256 = 0;
      this.field_1257 = 0;
      this.field_1258 = -1;
      this.field_1245 = new JTextField();
      this.field_1245.setText(class_56.field_1522.method_493());
      this.field_1245
         .setBounds(
            this.field_1284.method_254("en", 117),
            this.field_1284.method_254("en", 118),
            this.field_1284.method_254("en", 121),
            this.field_1284.method_254("en", 122)
         );
      this.field_1245.setBackground(new Color(5338761));
      this.field_1245.setBorder(BorderFactory.createLineBorder(new Color(5338761)));
      this.field_1245.setForeground(new Color(8838126));
      this.field_1245.setSelectedTextColor(new Color(4810614));
      this.field_1245.setSelectionColor(new Color(6591140));
      this.field_1245.setCaretColor(new Color(8838126));
      field_1274.add(this.field_1245);
      this.field_1245.getDocument().addDocumentListener(new class_46(this));
      this.field_1245.addActionListener(new class_45(this));
      this.field_1246 = new JPasswordField();
      this.field_1246
         .setBounds(
            this.field_1284.method_254("en", 119),
            this.field_1284.method_254("en", 120),
            this.field_1284.method_254("en", 121),
            this.field_1284.method_254("en", 122)
         );
      this.field_1246.setBackground(new Color(5338761));
      this.field_1246.setBorder(BorderFactory.createLineBorder(new Color(5338761)));
      this.field_1246.setForeground(new Color(8838126));
      this.field_1246.setSelectedTextColor(new Color(4810614));
      this.field_1246.setSelectionColor(new Color(6591140));
      this.field_1246.setCaretColor(new Color(8838126));
      field_1274.add(this.field_1246);
      if (this.field_1245.getText().length() > 0) {
         this.field_1246.requestFocus();
      } else {
         this.field_1245.requestFocus();
      }

      this.field_1246.getDocument().addDocumentListener(new class_43(this));
      this.field_1246.addActionListener(new class_42(this));
      this.field_1259 = false;
      this.field_1247 = this.field_1284.method_254("en", 124);
      this.field_1248 = this.field_1284.method_254("en", 125);
      this.field_1249 = this.field_1284.method_254("en", 126);
      this.field_1250 = this.field_1284.method_254("en", 127);
      this.field_1251 = this.field_1284.method_254("en", 1235);
      this.field_1252 = this.field_1284.method_254("en", 1236);
      this.field_1253 = this.field_1284.method_254("en", 1237);
      this.field_1254 = this.field_1284.method_254("en", 1238);
   }

   // $VF: renamed from: h () void
   public void method_447() {
      field_1274.remove(this.field_1245);
      field_1274.remove(this.field_1246);
      this.method_466((byte)11, null);
   }

   // $VF: renamed from: w (java.awt.Graphics) void
   public void method_448(Graphics var1) {
      this.method_460(var1);
      this.field_1243.paintIcon(field_1274, var1, this.field_1284.method_254("en", 115), this.field_1284.method_254("en", 116));
      if (this.field_1259) {
         this.field_1244.paintIcon(field_1274, var1, this.field_1247, this.field_1248);
      }

      if (this.field_1258 != -1) {
         this.field_1255[this.field_1258].paintIcon(field_1274, var1, this.field_1256, this.field_1257);
      }
   }

   // $VF: renamed from: as (java.awt.event.MouseEvent) void
   public void method_449(MouseEvent var1) {
      this.field_1258 = -1;
      if (var1.getX() >= this.field_1251
         && var1.getX() <= this.field_1251 + this.field_1253
         && var1.getY() >= this.field_1252
         && var1.getY() <= this.field_1252 + this.field_1254) {
         this.field_1258 = 1;
         this.field_1256 = this.field_1251;
         this.field_1257 = this.field_1252;
      } else if (this.field_1259) {
         if (var1.getX() >= this.field_1247
            && var1.getX() <= this.field_1247 + this.field_1249
            && var1.getY() >= this.field_1248
            && var1.getY() <= this.field_1248 + this.field_1250) {
            this.field_1258 = 0;
            this.field_1256 = this.field_1247;
            this.field_1257 = this.field_1248;
            class_3.field_20.method_17("res/sound/mouse_effects/mouse_over_A.wav");
         }
      }
   }

   // $VF: renamed from: at (java.awt.event.MouseEvent) void
   public void method_450(MouseEvent var1) {
      if (var1.getX() >= this.field_1251
         && var1.getX() <= this.field_1251 + this.field_1253
         && var1.getY() >= this.field_1252
         && var1.getY() <= this.field_1252 + this.field_1254) {
         class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_fail.wav");
         this.field_1258 = -1;
         field_1274.remove(this.field_1245);
         field_1274.remove(this.field_1246);
         this.method_466((byte)8, null);
         field_1274.repaint();
      } else if (this.field_1259) {
         if (var1.getX() >= this.field_1247
            && var1.getX() <= this.field_1247 + this.field_1249
            && var1.getY() >= this.field_1248
            && var1.getY() <= this.field_1248 + this.field_1250) {
            class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
            this.field_1258 = -1;
            this.method_447();
         }
      }
   }

   // $VF: renamed from: l (java.awt.event.KeyEvent) void
   public void method_451(KeyEvent var1) {
      if (this.field_1259) {
         switch (var1.getKeyCode()) {
            case 10:
               class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
               this.method_447();
         }
      }
   }

   // $VF: renamed from: x (java.lang.Object) void
   public void method_452(Object var1) {
      this.field_1260 = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 103)));
      this.field_1261 = new Icon[2];
      this.field_1261[0] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 106)));
      this.field_1261[1] = new ImageIcon(this.getClass().getResource(this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 109)));
      this.field_1262 = new int[2];
      this.field_1262[0] = this.field_1284.method_254("en", 107);
      this.field_1262[1] = this.field_1284.method_254("en", 110);
      this.field_1263 = new int[2];
      this.field_1263[0] = this.field_1284.method_254("en", 108);
      this.field_1263[1] = this.field_1284.method_254("en", 111);
      this.field_1264 = this.field_1284.method_254("en", 112);
      this.field_1265 = this.field_1284.method_254("en", 113);
      this.field_1266 = 1;
   }

   // $VF: renamed from: x (java.awt.Graphics) void
   public void method_453(Graphics var1) {
      this.method_460(var1);
      this.field_1260.paintIcon(field_1274, var1, this.field_1284.method_254("en", 104), this.field_1284.method_254("en", 105));
      this.field_1261[this.field_1266].paintIcon(field_1274, var1, this.field_1262[this.field_1266], this.field_1263[this.field_1266]);
   }

   // $VF: renamed from: au (java.awt.event.MouseEvent) void
   public void method_454(MouseEvent var1) {
      if (var1.getX() >= this.field_1262[0]
         && var1.getX() <= this.field_1264 + this.field_1262[0]
         && var1.getY() >= this.field_1263[0]
         && var1.getY() <= this.field_1263[0] + this.field_1265) {
         if (this.field_1266 != 0) {
            class_3.field_20.method_17("res/sound/mouse_effects/mouse_over_A.wav");
            this.field_1266 = 0;
         }
      } else if (var1.getX() >= this.field_1262[1]
         && var1.getX() <= this.field_1264 + this.field_1262[1]
         && var1.getY() >= this.field_1263[1]
         && var1.getY() <= this.field_1263[1] + this.field_1265
         && this.field_1266 != 1) {
         class_3.field_20.method_17("res/sound/mouse_effects/mouse_over_A.wav");
         this.field_1266 = 1;
      }
   }

   // $VF: renamed from: av (java.awt.event.MouseEvent) void
   public void method_455(MouseEvent var1) {
      switch (this.field_1266) {
         case 0:
            field_1274.repaint();
            if (var1.getX() >= this.field_1262[0]
               && var1.getX() <= this.field_1264 + this.field_1262[0]
               && var1.getY() >= this.field_1263[0]
               && var1.getY() <= this.field_1263[0] + this.field_1265) {
               class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
               this.method_466((byte)9, null);
            }
            break;
         case 1:
            field_1274.repaint();
            if (var1.getX() >= this.field_1262[1]
               && var1.getX() <= this.field_1264 + this.field_1262[1]
               && var1.getY() >= this.field_1263[1]
               && var1.getY() <= this.field_1263[1] + this.field_1265) {
               class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
               this.method_466((byte)10, null);
            }
            break;
         default:
            class_62.method_563("default");
      }
   }

   // $VF: renamed from: m (java.awt.event.KeyEvent) void
   public void method_456(KeyEvent var1) {
      switch (var1.getKeyCode()) {
         case 10:
            switch (this.field_1266) {
               case 0:
                  class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
                  this.method_466((byte)9, null);
                  field_1274.repaint();
                  break;
               case 1:
                  class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
                  this.method_466((byte)10, null);
                  field_1274.repaint();
            }
      }
   }

   // $VF: renamed from: n (java.awt.event.KeyEvent) void
   public void method_457(KeyEvent var1) {
      if (var1.getKeyChar() == 'w' || var1.getKeyChar() == 's') {
         this.field_1266 ^= 1;
         class_3.field_20.method_17("res/sound/mouse_effects/mouse_over_A.wav");
      }
   }

   // $VF: renamed from: y (java.lang.Object) void
   public void method_458(Object var1) {
      class_62.method_563("start");
      this.field_1269 = System.currentTimeMillis() + 3000L;
      this.field_1270 = new ImageIcon(this.getClass().getResource(this.field_1284.method_256("en", 0) + this.field_1284.method_256("en", 1)));
   }

   // $VF: renamed from: aw (java.awt.event.MouseEvent) void
   public void method_459(MouseEvent var1) {
      this.field_1297 = true;
      this.method_466((byte)8, null);
      class_62.method_563("finish splash");
   }

   // $VF: renamed from: y (java.awt.Graphics) void
   public void method_460(Graphics var1) {
      this.field_1270.paintIcon(field_1274, var1, 0, 0);
   }

   // $VF: renamed from: i () void
   public void method_461() {
      if (System.currentTimeMillis() > this.field_1269) {
         this.method_459(null);
      }
   }

   // $VF: renamed from: j () MastersOfDestiny
   public static MastersOfDestiny method_462() {
      if (field_1274 == null) {
         class_62.method_563("MastersOfDestiny is null");
      }

      return field_1274;
   }

   // $VF: renamed from: k () X
   public static class_2 method_463() {
      if (field_1280 == null) {
         class_62.method_563("stateManager is null");
      }

      return field_1280;
   }

   public GameStates(MastersOfDestiny var1, String var2) {
      if (var2.compareTo("") != 0) {
         String[] var3 = var2.split(":");
         var2 = var3[0];
         this.field_390 = var2;
         this.field_389 = var3[1].substring(0, 1);
         class_62.method_563("GameStates(Constructor): Server address now set to=> " + var2);
         class_62.method_563("GameStates(Constructor): Port now set to=> " + this.field_389);
      }

      class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
      field_1274 = var1;
      this.field_1284 = new class_33("res/Resources.ini");
      this.field_1271 = new class_72();
      this.field_1272 = new class_9();
      this.field_1273 = new class_10();
      this.field_1285 = class_60.method_550();
      this.field_1285.method_556(this);
      this.field_1285.method_551(this.field_1284);
      this.field_1276 = new class_5("res/skills/", "graphicsMapping.txt");
      this.field_1277 = new class_18("res/HQ/Missions/");
      this.field_1278 = new class_20("res/HQ/Area/");
      this.field_1275 = new class_28("res/items/", "graphicsMapping.txt", "itemClassMapping.txt", "bodySlotMapping.txt");
      this.field_1279 = new class_67("res/cafe/Convo/", "res/cafe/Trigger/", "res/cafe/Quest/", "res/cafe/SubQuest/");
      this.field_1281 = new class_57(this.field_1285, this.field_1275, this.field_1276, this.field_1277, this.field_1278, this.field_1279, var1, null);
      class_62.method_563("entityManager = " + this.field_1285);

      try {
         this.field_404 = (class_89)this.field_1285.method_553(Class.forName("az"));
         this.field_412 = (class_89)this.field_1285.method_553(Class.forName("az"));
         this.field_420 = (class_89)this.field_1285.method_553(Class.forName("az"));
         this.field_422 = (class_89)this.field_1285.method_553(Class.forName("az"));
         this.field_427 = (class_89)this.field_1285.method_553(Class.forName("az"));
         this.field_428 = (class_87)this.field_1285.method_553(Class.forName("ak"));
         this.field_428.method_804((byte)0);
         this.field_427.method_785(this.field_428);
         this.field_427.g();
      } catch (ClassNotFoundException var4) {
      }

      this.field_1286 = this.field_1284.method_260("en", 267, 0, 0);
      this.field_1291 = 0;
      this.field_395 = this.field_1284.method_256("en", 0);
      this.field_1282 = new Thread(this);
      this.field_1282.setName("gameThread");
      this.field_1282.start();
      this.field_1287 = true;
   }

   // $VF: renamed from: l () void
   public void method_464() {
      if (this.field_1297) {
         this.method_466((byte)2, null);
      } else {
         this.method_466((byte)1, null);
      }
   }

   // $VF: renamed from: a (int, java.lang.Object) void
   @Override
   public void method_0(int var1, Object var2) {
      switch (var1) {
         case 101:
            if (this.field_429 != null) {
               if (!((class_88)var2).field_3016) {
                  this.field_1299 = false;
                  if (this.field_429.e()) {
                     this.field_429.method_798();
                  }

                  return;
               }

               switch (((class_88)var2).method_809()) {
                  case 0:
                     if (!this.field_1299) {
                        class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
                        this.field_1299 = true;
                        this.field_1298 = 1;
                        this.field_429.g();
                        this.field_429.method_878("Hop", "P1|H\n");
                        this.field_429.method_878("Direct", "P1|D\n");
                     }

                     this.field_429
                        .method_877(
                           this.field_421.field_3089 + this.field_421.field_3065[0][0].getIconWidth() - this.field_429.field_3118.getIconWidth(),
                           this.field_421.field_3090
                              - this.field_429.field_3117.getIconHeight()
                              - this.field_429.field_3119.getIconHeight()
                              - this.field_429.field_3122.size() * this.field_429.field_3118.getIconHeight()
                              - 5
                        );
                     break;
                  case 1:
                     if (!this.field_1299) {
                        class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
                        this.field_1299 = true;
                        this.field_1298 = 2;
                        this.field_429.g();
                        this.field_429.method_878("Enter", "H1");
                     }

                     this.field_429
                        .method_877(
                           this.field_421.field_3089 + this.field_421.field_3065[0][0].getIconWidth() - this.field_429.field_3118.getIconWidth(),
                           this.field_421.field_3090
                              - this.field_429.field_3117.getIconHeight()
                              - this.field_429.field_3119.getIconHeight()
                              - this.field_429.field_3122.size() * this.field_429.field_3118.getIconHeight()
                              - 5
                        );
                     break;
                  case 2:
                     if (!this.field_1299) {
                        class_62.method_563("touched shop!!!");
                        class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
                        this.field_435.write("S1\n");
                        this.field_435.flush();
                        this.field_1299 = true;
                        this.field_1298 = -1;
                        this.field_429.g();
                     }

                     this.field_429
                        .method_877(
                           this.field_421.field_3089 + this.field_421.field_3065[0][0].getIconWidth() - this.field_429.field_3118.getIconWidth(),
                           this.field_421.field_3090
                              - this.field_429.field_3117.getIconHeight()
                              - this.field_429.field_3119.getIconHeight()
                              - this.field_429.field_3122.size() * this.field_429.field_3118.getIconHeight()
                              - 5
                        );
                     break;
                  case 3:
                     if (!this.field_1299) {
                        class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
                        this.field_1299 = true;
                        this.field_1298 = 4;
                        this.field_429.g();
                        this.field_429.method_878("Enter", "1");
                     }

                     this.field_429
                        .method_877(
                           this.field_421.field_3089 + this.field_421.field_3065[0][0].getIconWidth() - this.field_429.field_3118.getIconWidth(),
                           this.field_421.field_3090
                              - this.field_429.field_3117.getIconHeight()
                              - this.field_429.field_3119.getIconHeight()
                              - this.field_429.field_3122.size() * this.field_429.field_3118.getIconHeight()
                              - 5
                        );
                     break;
                  case 4:
                     if (!this.field_1299) {
                        class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
                        this.field_1299 = true;
                        this.field_1298 = 5;
                        this.field_429.g();
                        this.field_429.method_878("Enter", "");
                     }

                     if (this.field_429 != null) {
                        this.field_429
                           .method_877(
                              this.field_421.field_3089 + this.field_421.field_3065[0][0].getIconWidth() - this.field_429.field_3118.getIconWidth(),
                              this.field_421.field_3090
                                 - this.field_429.field_3117.getIconHeight()
                                 - this.field_429.field_3119.getIconHeight()
                                 - this.field_429.field_3122.size() * this.field_429.field_3118.getIconHeight()
                                 - 5
                           );
                     }
                     break;
                  case 5:
                     if (!this.field_1299) {
                        class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
                        this.field_1299 = true;
                        this.field_1298 = 6;
                        this.field_429.g();
                        this.field_429.method_878("Enter", "1");
                        this.field_429
                           .method_877(
                              this.field_421.field_3089 + this.field_421.field_3065[0][0].getIconWidth() - this.field_429.field_3118.getIconWidth(),
                              this.field_421.field_3090
                                 - this.field_429.field_3117.getIconHeight()
                                 - this.field_429.field_3119.getIconHeight()
                                 - this.field_429.field_3122.size() * this.field_429.field_3118.getIconHeight()
                                 - 5
                           );
                     }
                     break;
                  case 6:
                     if (!this.field_1299) {
                        class_3.field_20.method_17("res/sound/mouse_effects/mouseclick_success.wav");
                        this.field_1299 = true;
                        this.field_1298 = 7;
                        this.field_429.g();
                        if (this.field_429.field_3122.size() < 1) {
                           this.field_429.method_878("Enter", "1");
                        }
                     }

                     this.field_429
                        .method_877(
                           this.field_421.field_3089 + this.field_421.field_3065[0][0].getIconWidth() - this.field_429.field_3118.getIconWidth(),
                           this.field_421.field_3090
                              - this.field_429.field_3117.getIconHeight()
                              - this.field_429.field_3119.getIconHeight()
                              - this.field_429.field_3122.size() * this.field_429.field_3118.getIconHeight()
                              - 5
                        );
               }
            }

            return;
      }
   }

   // $VF: renamed from: z (java.lang.Object) void
   void method_465(Object var1) {
      this.field_1283 = false;
   }

   // $VF: renamed from: a (byte, java.lang.Object) void
   public void method_466(byte var1, Object var2) {
      this.field_1301 = this.field_1300;
      this.field_1300 = var1;
      this.method_467(var1, var2);
      class_62.method_563("setState: curState = " + var1);
      System.gc();
   }

   // $VF: renamed from: b (int, java.lang.Object) void
   void method_467(int var1, Object var2) {
      this.field_1302 = true;
      switch (this.field_1301) {
         case 3:
            if (this.field_1192 != null) {
               field_1274.remove(this.field_1192);
            }

            if (this.field_1163 != null) {
               for (int var3 = 0; var3 < this.field_1163.length; var3++) {
                  if (this.field_1163[var3] != null) {
                     field_1274.remove(this.field_1163[var3]);
                  }
               }
            }
            break;
         case 5:
            field_1274.remove(field_1274.field_2793);
            break;
         case 11:
            field_1274.remove(this.field_1235);
      }

      switch (var1) {
         case 1:
            this.method_458(var2);
            break;
         case 2:
            this.method_436(var2);
            break;
         case 3:
            this.method_424(var2);
            break;
         case 4:
            this.method_414(var2);
            break;
         case 5:
            class_62.method_563("reach colony state");
            this.method_292(var2);
            break;
         case 6:
         case 7:
         case 12:
         case 25:
         case 27:
         case 29:
         default:
            class_62.method_563("Unknown game state requested: " + var1);
            break;
         case 8:
            this.method_452(var2);
            break;
         case 9:
            this.method_419(var2);
            break;
         case 10:
            this.method_446(var2);
            break;
         case 11:
            this.method_442(var2);
            break;
         case 13:
            this.method_483(var2);
            break;
         case 14:
            this.method_308(var2);
            break;
         case 15:
            this.method_333(var2);
            break;
         case 16:
            this.method_319(var2);
            break;
         case 17:
            this.method_396(var2);
            break;
         case 18:
            this.method_343(var2);
            break;
         case 19:
            this.method_371(var2);
            break;
         case 20:
            this.method_405(var2);
            break;
         case 21:
            this.method_352(var2);
            break;
         case 22:
            this.method_362(var2);
            break;
         case 23:
            class_62.method_563("go to initialize state");
            this.method_284(var2);
            break;
         case 24:
            this.method_288(var2);
            break;
         case 26:
            this.method_434(var2);
            break;
         case 28:
            this.method_286(var2);
            break;
         case 30:
            this.method_290(var2);
            break;
         case 31:
            this.method_385(var2);
            break;
         case 32:
            this.method_394(var2);
      }

      this.field_1302 = false;
   }

   // $VF: renamed from: ax (java.awt.event.MouseEvent) void
   void method_468(MouseEvent var1) {
      if (!this.field_1302) {
         switch (this.field_1300) {
            case 2:
               this.method_438(var1);
               break;
            case 3:
               this.method_427(var1);
               break;
            case 4:
               this.method_417(var1);
               break;
            case 5:
               this.method_299(var1);
            case 6:
            case 7:
            case 11:
            case 12:
            case 13:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            default:
               break;
            case 8:
               this.method_454(var1);
               break;
            case 9:
               this.method_421(var1);
               break;
            case 10:
               this.method_449(var1);
               break;
            case 14:
               this.method_313(var1);
               break;
            case 15:
               this.method_338(var1);
               break;
            case 16:
               this.method_323(var1);
               break;
            case 17:
               this.method_400(var1);
               break;
            case 18:
               this.method_347(var1);
               break;
            case 19:
               this.method_374(var1);
               break;
            case 20:
               this.method_409(var1);
               break;
            case 21:
               this.method_357(var1);
               break;
            case 22:
               this.method_366(var1);
               break;
            case 31:
               this.method_380(var1);
               break;
            case 32:
               this.method_389(var1);
         }
      }
   }

   // $VF: renamed from: ay (java.awt.event.MouseEvent) void
   void method_469(MouseEvent var1) {
      if (!this.field_1302) {
         switch (this.field_1300) {
            case 5:
               this.method_304(var1);
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 19:
            case 20:
            default:
               break;
            case 15:
               this.method_341(var1);
               break;
            case 16:
               this.method_328(var1);
               break;
            case 17:
               this.method_402(var1);
               break;
            case 18:
               this.method_349(var1);
               break;
            case 21:
               this.method_359(var1);
               break;
            case 22:
               this.method_368(var1);
         }
      }
   }

   // $VF: renamed from: az (java.awt.event.MouseEvent) void
   void method_470(MouseEvent var1) {
      if (!this.field_1302) {
         switch (this.field_1300) {
            case 5:
               this.method_302(var1);
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 19:
            case 20:
            default:
               break;
            case 15:
               this.method_340(var1);
               break;
            case 16:
               this.method_327(var1);
               break;
            case 17:
               this.method_401(var1);
               break;
            case 18:
               this.method_348(var1);
               break;
            case 21:
               this.method_358(var1);
               break;
            case 22:
               this.method_367(var1);
         }
      }
   }

   // $VF: renamed from: aA (java.awt.event.MouseEvent) void
   void method_471(MouseEvent var1) {
      if (!this.field_1302) {
         switch (this.field_1300) {
            case 1:
               this.method_459(var1);
               break;
            case 2:
               this.method_439(var1);
               break;
            case 3:
               this.method_429(var1);
               break;
            case 4:
               this.method_416(var1);
               break;
            case 5:
               this.method_300(var1);
            case 6:
            case 7:
            case 11:
            case 12:
            case 13:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            default:
               break;
            case 8:
               this.method_455(var1);
               break;
            case 9:
               this.method_422(var1);
               break;
            case 10:
               class_62.method_563("gamestate login click");
               this.method_450(var1);
               break;
            case 14:
               this.method_314(var1);
               break;
            case 15:
               this.method_336(var1);
               break;
            case 16:
               this.method_324(var1);
               break;
            case 17:
               this.method_399(var1);
               break;
            case 18:
               this.method_346(var1);
               break;
            case 19:
               this.method_373(var1);
               break;
            case 20:
               this.method_408(var1);
               break;
            case 21:
               this.method_356(var1);
               break;
            case 22:
               this.method_365(var1);
               break;
            case 31:
               this.method_379(var1);
               break;
            case 32:
               this.method_388(var1);
         }
      }
   }

   // $VF: renamed from: aB (java.awt.event.MouseEvent) void
   void method_472(MouseEvent var1) {
      if (!this.field_1302) {
         switch (this.field_1300) {
            case 5:
               this.method_303(var1);
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 19:
            case 20:
            default:
               break;
            case 15:
               this.method_342(var1);
               break;
            case 16:
               this.method_329(var1);
               break;
            case 17:
               this.method_403(var1);
               break;
            case 18:
               this.method_350(var1);
               break;
            case 21:
               this.method_360(var1);
               break;
            case 22:
               this.method_369(var1);
         }
      }
   }

   // $VF: renamed from: aC (java.awt.event.MouseEvent) void
   void method_473(MouseEvent var1) {
      if (!this.field_1302) {
         ;
      }
   }

   // $VF: renamed from: aD (java.awt.event.MouseEvent) void
   void method_474(MouseEvent var1) {
      if (!this.field_1302) {
         ;
      }
   }

   // $VF: renamed from: o (java.awt.event.KeyEvent) void
   void method_475(KeyEvent var1) {
      if (!this.field_1302) {
         switch (this.field_1300) {
            case 2:
               this.method_441(var1);
            case 3:
            case 6:
            case 7:
            case 11:
            case 12:
            case 15:
            default:
               break;
            case 4:
               this.method_418(var1);
               break;
            case 5:
               this.method_306(var1);
               break;
            case 8:
               this.method_456(var1);
               break;
            case 9:
               this.method_423(var1);
               break;
            case 10:
               this.method_451(var1);
               break;
            case 13:
               this.method_485();
               break;
            case 14:
               this.method_318(var1);
               break;
            case 16:
               this.method_330(var1);
         }
      }
   }

   // $VF: renamed from: p (java.awt.event.KeyEvent) void
   void method_476(KeyEvent var1) {
      if (!this.field_1302) {
         switch (this.field_1300) {
            case 5:
               this.method_307(var1);
         }
      }
   }

   // $VF: renamed from: q (java.awt.event.KeyEvent) void
   void method_477(KeyEvent var1) {
      if (!this.field_1302) {
         switch (this.field_1300) {
            case 2:
               this.method_440(var1);
               break;
            case 3:
               this.method_430(var1);
            case 4:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
               break;
            case 5:
               this.method_305(var1);
               break;
            case 8:
               this.method_457(var1);
               break;
            case 13:
               this.method_485();
         }
      }
   }

   // $VF: renamed from: e (java.lang.String) java.lang.String
   private String method_478(String var1) {
      String var2 = "";

      try {
         InputStream var3 = this.getClass().getResourceAsStream(var1);
         if (var3 != null) {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();

            int var5;
            while ((var5 = var3.read()) != -1) {
               var4.write(var5);
            }

            var3.close();
            var2 = new String(var4.toByteArray(), "utf-8");
         }
      } catch (Exception var6) {
         class_62.method_563("GameStates(getClientVersion): Error" + var6);
      }

      return var2;
   }

   // $VF: renamed from: z (java.awt.Graphics) void
   synchronized void method_479(Graphics var1) {
      field_1274.field_2780.setSize(804, 632);
      if (!this.field_1302) {
         switch (this.field_1300) {
            case 1:
               this.method_460(var1);
               break;
            case 2:
               this.method_437(var1);
               break;
            case 3:
               this.method_425(var1);
               break;
            case 4:
               this.method_415(var1);
               break;
            case 5:
               this.method_293(var1);
               var1.setFont(new Font("BV Boli", 2, 18));
               var1.setColor(new Color(11594998));
               var1.drawString(this.field_1303 + "." + this.field_389 + "a", 631, 32);
            case 6:
            case 12:
            default:
               break;
            case 7:
               this.method_285(var1);
               break;
            case 8:
               this.method_453(var1);
               break;
            case 9:
               this.method_420(var1);
               break;
            case 10:
               this.method_448(var1);
               break;
            case 11:
               this.method_443(var1);
               break;
            case 13:
               this.method_484(var1);
               break;
            case 14:
               this.method_309(var1);
               var1.setFont(new Font("BV Boli", 2, 18));
               var1.setColor(new Color(11594998));
               var1.drawString(this.field_1303 + "." + this.field_389 + "a", 631, 32);
               break;
            case 15:
               this.method_335(var1);
               var1.setFont(new Font("BV Boli", 2, 18));
               var1.setColor(new Color(11594998));
               var1.drawString(this.field_1303 + "." + this.field_389 + "a", 631, 32);
               break;
            case 16:
               this.method_322(var1);
               var1.setFont(new Font("BV Boli", 2, 18));
               var1.setColor(new Color(11594998));
               var1.drawString(this.field_1303 + "." + this.field_389 + "a", 631, 32);
               break;
            case 17:
               this.method_397(var1);
               var1.setFont(new Font("BV Boli", 2, 18));
               var1.setColor(new Color(11594998));
               var1.drawString(this.field_1303 + "." + this.field_389 + "a", 631, 32);
               break;
            case 18:
               this.method_344(var1);
               break;
            case 19:
               this.method_372(var1);
               var1.setFont(new Font("BV Boli", 2, 18));
               var1.setColor(new Color(11594998));
               var1.drawString(this.field_1303 + "." + this.field_389 + "a", 631, 32);
               break;
            case 20:
               this.method_406(var1);
               var1.setFont(new Font("BV Boli", 2, 18));
               var1.setColor(new Color(11594998));
               var1.drawString(this.field_1303 + "." + this.field_389 + "a", 631, 32);
               break;
            case 21:
               this.method_354(var1);
               break;
            case 22:
               this.method_363(var1);
               var1.setFont(new Font("BV Boli", 2, 18));
               var1.setColor(new Color(11594998));
               var1.drawString(this.field_1303 + "." + this.field_389 + "a", 631, 32);
               break;
            case 23:
               this.method_285(var1);
               break;
            case 24:
               this.method_289(var1);
               break;
            case 25:
               this.method_289(var1);
               break;
            case 26:
               this.method_435(var1);
               break;
            case 27:
               this.method_287(var1);
               break;
            case 28:
               this.method_287(var1);
               break;
            case 29:
               this.method_291(var1);
               break;
            case 30:
               this.method_291(var1);
               break;
            case 31:
               this.method_386(var1);
               break;
            case 32:
               this.method_395(var1);
         }

         this.notifyAll();
      }
   }

   // $VF: renamed from: run () void
   @Override
   public void run() {
      while (this.field_1283) {
         if (!this.field_1302) {
            synchronized (this) {
               switch (this.field_1300) {
                  case 1:
                     this.method_461();
                  case 2:
                  case 4:
                  case 6:
                  case 7:
                  case 8:
                  case 9:
                  case 10:
                  case 12:
                  case 13:
                  case 14:
                  case 15:
                  case 16:
                  case 19:
                  case 23:
                  case 24:
                  case 25:
                  case 26:
                  case 27:
                  case 28:
                  case 29:
                  case 30:
                  default:
                     break;
                  case 3:
                     this.method_426();
                     break;
                  case 5:
                     this.method_296(System.currentTimeMillis());
                     break;
                  case 11:
                     this.method_444();
                     break;
                  case 17:
                     this.method_398(this.field_1281, System.currentTimeMillis());
                     break;
                  case 18:
                     this.method_345(this.field_1281, System.currentTimeMillis());
                     break;
                  case 20:
                     this.method_407(this.field_1281, System.currentTimeMillis());
                     break;
                  case 21:
                     this.method_355(this.field_1281, System.currentTimeMillis());
                     break;
                  case 22:
                     this.method_364(this.field_1281, System.currentTimeMillis());
                     break;
                  case 31:
                     this.method_378(this.field_1281, System.currentTimeMillis());
                     break;
                  case 32:
                     this.method_387(this.field_1281, System.currentTimeMillis());
               }

               if (this.field_1285 != null) {
                  this.field_1285.method_558(System.currentTimeMillis());
               }

               try {
                  field_1274.repaint();
                  Thread.sleep(100L);
               } catch (InterruptedException var4) {
               }
            }
         }
      }
   }

   // $VF: renamed from: c (java.lang.String) void
   public void method_480(String var1) {
      String[] var2 = var1.split("\\|");
      if (var2[0].equals("CS")) {
         if (this.field_1300 == 11) {
            this.field_1236 = "Authenticating";
            this.field_1235.setText(this.field_1236);
         }

         this.field_1238 = 0;
         this.field_1240 = false;
         this.field_1234.write("VC|" + this.field_1303 + "\n");
         this.field_1234.flush();
         if (this.field_1300 == 11) {
            this.field_1234.write("LI|" + this.field_1245.getText() + "|" + this.field_1246.getText() + "\n");
            class_56.field_1522.method_496(this.field_1245.getText());
            this.field_1234.flush();
         }
      } else if (var2[0].equals("CV")) {
         if (this.field_1300 == 9) {
            this.field_1234.write("R1|" + this.field_1117.getText() + "|" + this.field_1118.getText() + "\n");
            this.field_1234.flush();
            this.field_1234.write("R2|" + this.field_1119.getText() + "\n");
            this.field_1234.flush();
            this.field_1234.write("R3|" + this.field_1120.getText() + "|" + this.field_1121.getText() + "\n");
            this.field_1234.flush();
            this.field_1234.write("R4\n");
            this.field_1234.flush();
            class_62.method_563("sent registration request");
         }
      } else if (var2[0].equals("P3")) {
         this.field_1068 = 0;
         this.field_1104 = false;
         this.field_1103 = true;
      } else if (var2[0].equals("P2")) {
         this.field_1068 = Integer.parseInt(var2[1]);
         this.field_1104 = false;
         this.field_1103 = true;
      } else if (var2[0].equals("R5")) {
         this.field_1116 = 0;
         this.field_1153 = false;
         this.field_1152 = true;
      } else if (var2[0].equals("R6")) {
         this.field_1116 = Integer.parseInt(var2[1]);
         this.field_1153 = false;
         this.field_1152 = true;
      } else if (var2[0].equals("CP")) {
         field_436 = Long.parseLong(var2[1]);
         field_439 = var2[2];
         this.field_1236 = "::[Authenticated]::";
         this.field_1235.setText(this.field_1236);
         this.field_1238 = 0;
         this.field_1240 = true;
         this.field_1241 = this.field_1312;
         this.field_1242 = System.currentTimeMillis() + this.field_1241;
         this.field_1313 = 2;
      } else if (var2[0].equals("WV")) {
         this.field_1236 = "Version obsolete, please restart Hinterwars";
         this.field_1235.setText(this.field_1236);
         this.field_1238 = 0;
         this.field_1240 = true;
         this.field_1241 = this.field_1312;
         this.field_1242 = System.currentTimeMillis() + this.field_1241;
         this.field_1313 = 10;
      } else if (var2[0].equals("WP")) {
         this.field_1236 = "Login Failed. Please try again.";
         this.field_1235.setText(this.field_1236);
         this.field_1238 = 0;
         this.field_1240 = true;
         this.field_1241 = this.field_1312;
         this.field_1242 = System.currentTimeMillis() + this.field_1241;
         this.field_1313 = 10;
      } else if (var2[0].equals("BA")) {
         this.field_1236 = "Your account has been banned.";
         this.field_1235.setText(this.field_1236);
         this.field_1238 = 0;
         this.field_1240 = true;
         this.field_1241 = this.field_1312;
         this.field_1242 = System.currentTimeMillis() + this.field_1241;
         this.field_1313 = 10;
      } else if (var2[0].equals("IS")) {
         this.field_1236 = "Invalid subscription. Please try again.";
         this.field_1235.setText(this.field_1236);
         this.field_1238 = 0;
         this.field_1240 = true;
         this.field_1241 = this.field_1312;
         this.field_1242 = System.currentTimeMillis() + this.field_1241;
         this.field_1313 = 10;
      } else if (!var2[0].equals("CN")) {
         if (var2[0].equals("CR")) {
            if (this.field_1340 == 0) {
               this.field_1193 = "Retrieving";
               this.field_1192.setText(this.field_1193);
               this.field_1194 = 0;
               this.field_1240 = false;
            }

            this.field_1334[this.field_1340] = var2[1];
            this.field_1335[this.field_1340] = var2[2];
            this.field_1336[this.field_1340] = Integer.parseInt(var2[3]);
            this.field_1337[this.field_1340] = var2[4];
            this.field_1338[this.field_1340] = Integer.parseInt(var2[5]);
            if (Integer.parseInt(var2[7]) != -1) {
               class_29 var3 = this.field_1275.method_177(var2[7]);
               this.field_1178[this.field_1340] = var3.method_221();
               this.field_1179[this.field_1340] = var3.method_223();
               this.field_1180[this.field_1340] = var3.method_225();
               this.field_1181[this.field_1340] = var3.method_219();
            } else {
               class_85 var7 = this.field_1281.field_1553.method_769(this.field_1336[this.field_1340], this.field_1338[this.field_1340]);
               this.field_1181[this.field_1340] = var7.method_774();
               this.field_1179[this.field_1340] = var7.method_780();
               this.field_1180[this.field_1340] = var7.method_781();
               this.field_1178[this.field_1340] = var7.method_777();
            }

            this.field_1339[this.field_1340] = Integer.parseInt(var2[6]);
            if (Integer.parseInt(var2[8]) != -1) {
               class_29 var8 = this.field_1275.method_177(var2[8]);
               this.field_1182[this.field_1340] = var8.method_221();
               this.field_1183[this.field_1340] = var8.method_223();
               this.field_1184[this.field_1340] = var8.method_225();
               this.field_1185[this.field_1340] = var8.method_219();
            } else {
               class_85 var9 = this.field_1281.field_1553.method_770(this.field_1336[this.field_1340], this.field_1339[this.field_1340]);
               this.field_1185[this.field_1340] = var9.method_774();
               this.field_1183[this.field_1340] = var9.method_780();
               this.field_1184[this.field_1340] = var9.method_781();
               this.field_1182[this.field_1340] = var9.method_777();
            }

            if (this.field_1185[this.field_1340] > this.field_1181[this.field_1340]) {
               this.field_1187[this.field_1340] = this.field_1185[this.field_1340];
            } else {
               this.field_1187[this.field_1340] = this.field_1181[this.field_1340];
            }

            String var10 = "";
            switch (this.field_1336[this.field_1340]) {
               case 1:
                  var10 = "Human";
                  break;
               case 2:
                  var10 = "Taikuus";
                  break;
               case 3:
                  var10 = "Firans";
                  break;
               case 4:
                  var10 = "Brucians";
            }

            this.field_1163[this.field_1340]
               .setText("<html>" + this.field_1337[this.field_1340] + "<BR>" + var10 + "<BR>" + "Lv " + this.field_1335[this.field_1340] + "</html>");
            field_1274.repaint();
            this.field_1340++;
         } else if (var2[0].equals("P5")) {
            this.field_1069 = "You are not authorized to delete this character!";
            this.field_1103 = true;
         } else if (var2[0].equals("P6")) {
            this.field_1069 = "                   Delete successful!";
            this.field_1103 = true;

            for (int var11 = this.field_1189; var11 <= 4; var11++) {
               if (var11 < 4) {
                  if (this.field_1334[var11 + 1] != null) {
                     this.field_1334[var11] = this.field_1334[var11 + 1];
                     this.field_1335[var11] = this.field_1335[var11 + 1];
                     this.field_1336[var11] = this.field_1336[var11 + 1];
                     this.field_1337[var11] = this.field_1337[var11 + 1];
                     this.field_1338[var11] = this.field_1338[var11 + 1];
                     class_85 var4 = this.field_1281.field_1553.method_769(this.field_1336[var11], this.field_1338[var11]);
                     this.field_1181[var11] = var4.method_774();
                     this.field_1179[var11] = var4.method_780();
                     this.field_1180[var11] = var4.method_781();
                     this.field_1178[var11] = var4.method_777();
                     this.field_1339[var11] = this.field_1339[var11 + 1];
                     var4 = this.field_1281.field_1553.method_770(this.field_1336[var11], this.field_1339[var11]);
                     this.field_1185[var11] = var4.method_774();
                     this.field_1183[var11] = var4.method_780();
                     this.field_1184[var11] = var4.method_781();
                     this.field_1182[var11] = var4.method_777();
                     if (this.field_1185[var11] > this.field_1181[var11]) {
                        this.field_1187[var11] = this.field_1185[var11];
                     } else {
                        this.field_1187[var11] = this.field_1181[var11];
                     }

                     String var5 = "";
                     switch (this.field_1336[var11]) {
                        case 1:
                           var5 = "Human";
                           break;
                        case 2:
                           var5 = "Taikuus";
                           break;
                        case 3:
                           var5 = "Firans";
                           break;
                        case 4:
                           var5 = "Brucians";
                     }

                     this.field_1163[var11].setText("<html>" + this.field_1337[var11] + "<BR>" + var5 + "<BR>" + "Lv " + this.field_1335[var11] + "</html>");
                     this.field_1334[var11 + 1] = null;
                     this.field_1335[var11 + 1] = null;
                     this.field_1336[var11 + 1] = 0;
                     this.field_1337[var11 + 1] = null;
                     this.field_1338[var11 + 1] = 0;
                     this.field_1181[var11 + 1] = 0;
                     this.field_1179[var11 + 1] = 0;
                     this.field_1180[var11 + 1] = 0;
                     this.field_1178[var11 + 1] = null;
                     this.field_1339[var11 + 1] = 0;
                     this.field_1185[var11 + 1] = 0;
                     this.field_1183[var11 + 1] = 0;
                     this.field_1184[var11 + 1] = 0;
                     this.field_1182[var11 + 1] = null;
                     this.field_1187[var11 + 1] = 0;
                     this.field_1163[var11 + 1].setText("");
                  } else {
                     this.field_1334[var11] = null;
                     this.field_1335[var11] = null;
                     this.field_1336[var11] = 0;
                     this.field_1337[var11] = null;
                     this.field_1338[var11] = 0;
                     this.field_1181[var11] = 0;
                     this.field_1179[var11] = 0;
                     this.field_1180[var11] = 0;
                     this.field_1178[var11] = null;
                     this.field_1339[var11] = 0;
                     this.field_1185[var11] = 0;
                     this.field_1183[var11] = 0;
                     this.field_1184[var11] = 0;
                     this.field_1182[var11] = null;
                     this.field_1187[var11] = 0;
                     this.field_1163[var11].setText("");
                  }
               } else {
                  this.field_1334[var11] = null;
                  this.field_1335[var11] = null;
                  this.field_1336[var11] = 0;
                  this.field_1337[var11] = null;
                  this.field_1338[var11] = 0;
                  this.field_1181[var11] = 0;
                  this.field_1179[var11] = 0;
                  this.field_1180[var11] = 0;
                  this.field_1178[var11] = null;
                  this.field_1339[var11] = 0;
                  this.field_1185[var11] = 0;
                  this.field_1183[var11] = 0;
                  this.field_1184[var11] = 0;
                  this.field_1182[var11] = null;
                  this.field_1187[var11] = 0;
                  this.field_1163[var11].setText("");
               }

               field_1274.repaint();
            }
         } else if (var2[0].equals("TF")) {
            class_62.method_563("TF 1");
            if (this.field_1163[0].getText() == null || this.field_1163[0].getText().equals("")) {
               this.field_1234.write("RD|" + field_436 + "\n");
               this.field_1234.flush();
               this.method_487("Sorry\nYou do not have any character for selection\n[Press Any Key]", (byte)2, null);
               return;
            }

            this.field_1193 = "::[Successfully Retrieved]::";
            this.field_1192.setText(this.field_1193);
            this.field_1194 = 0;
            this.field_1240 = true;
         } else if (var2[0].equals("SI")) {
            try {
               this.field_1232.method_891();
               this.field_1232 = null;
               this.field_1233 = null;
               this.field_1234 = null;
               this.field_1231.close();
               this.field_1231 = null;
               class_62.method_563("auth closed");
               this.field_433 = new Socket(var2[1], Integer.parseInt(var2[2]));
               this.field_435 = new PrintWriter(this.field_433.getOutputStream(), true);
               this.field_434 = new BufferedReader(new InputStreamReader(this.field_433.getInputStream()));
               class_62.method_563("~~~~~~~~~~~~~~~~~~~~connecting: ~~~~~~~~~~~~~~~~~~~~~~~~~");
               this.field_441 = new class_95(this);
               this.field_441.start();
               this.field_435.write("ST|" + field_436 + "|" + field_439 + "\n");
               this.field_435.flush();
            } catch (IOException var6) {
               class_62.method_563("connection error = " + var6.getMessage());
               this.method_487("Unable to connect to the server.\nPlease try again.\n[Press Any Key]", (byte)8, null);
            }
         }
      }
   }

   // $VF: renamed from: d (java.lang.String) void
   public void method_481(String var1) {
      class_62.method_563("GameStates(processColonyReceive): Received Message " + var1);
      String[] var2 = var1.split("\\|");
      class_62.method_563("process colony " + var1);
      class_62.method_563("current state = " + this.field_1300);
      class_62.method_563("current colony state = " + this.field_442);
      switch (this.field_1300) {
         case 17:
            this.method_404(var2);
            break;
         case 18:
            this.method_351(var2);
         case 19:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         default:
            break;
         case 20:
            this.method_413(var2);
            break;
         case 21:
            this.method_361(var2);
            return;
         case 22:
            this.method_370(var2);
            if (!var2[0].equals("CS") && !var2[0].equals("AP")) {
               return;
            }
      }

      switch (this.field_442) {
         case 4:
            class_62.method_563("process cafe msg");
            this.method_404(var2);
            break;
         case 5:
            this.method_351(var2);
         case 6:
         default:
            break;
         case 7:
            this.method_413(var2);
      }

      if (var2[0].equalsIgnoreCase("TG")) {
         class_79.field_2616 = var2[4];
         class_79.field_2617 = Integer.parseInt(var2[5]);
         this.method_466((byte)21, null);
      } else if (var2[0].equalsIgnoreCase("IP")) {
         this.field_460 = new int[2];
         this.field_460[0] = 0;
         this.field_460[1] = 1;
         this.field_461 = new String[2];
         this.field_461[0] = class_70.method_641(var2[1], var2[2], Long.parseLong(var2[3]));
         this.field_461[1] = class_70.method_642(var2[1], var2[2], Long.parseLong(var2[3]));
         if (var2[2].equalsIgnoreCase("M")) {
            class_19 var3 = this.field_1277.method_136(Long.parseLong(var2[3]));
            this.field_451
               .method_515(
                  this.field_452,
                  var2[1] + " would like to invite you for mission:\n" + var3.method_140(),
                  this.field_453,
                  this.field_454,
                  this.field_455,
                  this.field_456,
                  MastersOfDestiny.field_2809,
                  this.field_457,
                  this.field_458,
                  this.field_459,
                  this.field_460,
                  this.field_461
               );
         }

         if (var2[2].equalsIgnoreCase("A")) {
            class_21 var47 = this.field_1278.method_145(Long.parseLong(var2[3]));
            this.field_451
               .method_515(
                  this.field_452,
                  var2[1] + " would like to invite you to explore:\n" + var47.method_149(),
                  this.field_453,
                  this.field_454,
                  this.field_455,
                  this.field_456,
                  MastersOfDestiny.field_2809,
                  this.field_457,
                  this.field_458,
                  this.field_459,
                  this.field_460,
                  this.field_461
               );
         }

         if (var2[2].equalsIgnoreCase("P")) {
            class_21 var48 = this.field_1278.method_145(Long.parseLong(var2[3]));
            this.field_451
               .method_515(
                  this.field_452,
                  var2[1] + " would like to invite you to enter the battle:\n" + var48.method_149(),
                  this.field_453,
                  this.field_454,
                  this.field_455,
                  this.field_456,
                  MastersOfDestiny.field_2809,
                  this.field_457,
                  this.field_458,
                  this.field_459,
                  this.field_460,
                  this.field_461
               );
         }
      } else if (var2[0].equalsIgnoreCase("CI1")) {
         for (int var49 = 0; var49 < this.field_451.method_520().size(); var49++) {
            class_59 var4 = (class_59)this.field_451.method_520().get(var49);
            if (((String)var4.method_547(0)).startsWith("AI") || ((String)var4.method_547(0)).startsWith("RM")) {
               this.field_451.method_516(var4);
               break;
            }
         }
      } else if (var2[0].equals("SI")) {
         try {
            this.field_441.method_889();
            this.field_441 = null;
            this.field_434 = null;
            this.field_435 = null;
            this.field_433.close();
            this.field_433 = null;
            class_62.method_563("colony closed");
            this.field_1281.field_1523 = var2[1];
            this.field_1281.field_1524 = Integer.parseInt(var2[2]);
            this.field_433 = new Socket(this.field_1281.field_1523, this.field_1281.field_1524);
            this.field_435 = new PrintWriter(this.field_433.getOutputStream(), true);
            this.field_434 = new BufferedReader(new InputStreamReader(this.field_433.getInputStream()));
            class_62.method_563("~~~~~~~~~~~~~~~~~~~~connecting~~~~~~~~~~~~~~~~~~~~~~~~~");
            this.field_441 = new class_95(this);
            this.field_441.start();
         } catch (IOException var43) {
            class_62.method_563("connection error = " + var43.getMessage());
            this.method_487("Unable to connect to the server.\nPlease try again.\n[Press Any Key]", (byte)8, null);
         }
      } else if (var2[0].equals("CS")) {
         this.field_1341 = false;
         this.field_435.write("ST|" + field_436 + "|" + field_439 + "\n");
         this.field_435.flush();
      } else if (var2[0].equals("AP")) {
         if (var2[1].equals("N")) {
            try {
               this.field_441.method_889();
               this.field_441 = null;
               this.field_434 = null;
               this.field_435 = null;
               this.field_433.close();
               this.field_433 = null;
               class_62.method_563("colony closed");
               this.method_487("Authentication Failed.\nPlease try again.\n[Press Any Key]", (byte)8, null);
            } catch (IOException var42) {
            }
         } else if (var2[1].equals("Y")) {
            field_1274.remove(this.field_1192);
            field_437 = Integer.parseInt(var2[2]);
            this.field_431 = false;
            this.field_430 = false;
            this.field_432 = false;
            this.field_393 = false;
            this.field_442 = 0;
            this.field_421 = null;
            if (this.field_405 != null) {
               this.field_405.h();
            }

            if (this.field_406 != null) {
               this.field_406.h();
            }

            if (this.field_407 != null) {
               this.field_407.h();
            }

            if (this.field_408 != null) {
               this.field_408.h();
            }

            if (this.field_409 != null) {
               this.field_409.h();
            }

            if (this.field_410 != null) {
               this.field_410.h();
            }

            if (this.field_423 != null) {
               this.field_411.h();
            }

            if (this.field_404 != null) {
               this.field_404.method_811();
            }

            if (this.field_413 != null) {
               this.field_413.h();
            }

            if (this.field_414 != null) {
               this.field_414.h();
            }

            if (this.field_415 != null) {
               this.field_415.h();
            }

            if (this.field_416 != null) {
               this.field_416.h();
            }

            if (this.field_417 != null) {
               this.field_417.h();
            }

            if (this.field_412 != null) {
               this.field_412.method_811();
            }

            if (this.field_399 != null) {
               Enumeration var50 = this.field_399.elements();

               while (var50.hasMoreElements()) {
                  ((class_90)var50.nextElement()).h();
               }

               this.field_399.clear();
            } else {
               this.field_399 = new Hashtable();
            }

            if (this.field_400 != null) {
               this.field_400.clear();
            } else {
               this.field_400 = new Hashtable();
            }

            if (this.field_420 != null) {
               this.field_420.method_811();
            }

            if (this.field_418 != null) {
               this.field_418.h();
            }

            if (this.field_423 != null) {
               this.field_423.h();
            }

            if (this.field_424 != null) {
               this.field_424.h();
            }

            if (this.field_425 != null) {
               this.field_425.h();
            }

            if (this.field_422 != null) {
               this.field_422.method_811();
            }

            if (this.field_427 != null) {
               this.field_427.method_811();
            }

            if (this.field_429 != null) {
               this.field_429.method_798();
            }

            if (this.field_691 != null) {
               this.field_691.method_570();
            }

            if (this.field_698 != null) {
               this.field_698.method_570();
            }

            switch (field_437) {
               case 1:
                  field_440 = "Terra " + var2[3];
                  this.field_391 = 72;
                  this.field_392 = 127;
                  if (this.field_399 != null) {
                     Enumeration var70 = this.field_399.elements();

                     while (var70.hasMoreElements()) {
                        class_90 var141 = (class_90)var70.nextElement();
                        var141.field_3053 = this.field_391;
                        var141.field_3054 = this.field_392;
                     }
                  }

                  this.method_466((byte)23, null);
                  break;
               case 2:
                  field_440 = "Eego " + var2[3];
                  this.field_391 = 72;
                  this.field_392 = 127;
                  if (this.field_399 != null) {
                     Enumeration var69 = this.field_399.elements();

                     while (var69.hasMoreElements()) {
                        class_90 var140 = (class_90)var69.nextElement();
                        var140.field_3053 = this.field_391;
                        var140.field_3054 = this.field_392;
                     }
                  }

                  this.method_466((byte)23, null);
                  break;
               case 3:
                  field_440 = "Yanorium " + var2[3];
                  this.field_391 = 72;
                  this.field_392 = 127;
                  if (this.field_399 != null) {
                     Enumeration var68 = this.field_399.elements();

                     while (var68.hasMoreElements()) {
                        class_90 var139 = (class_90)var68.nextElement();
                        var139.field_3053 = this.field_391;
                        var139.field_3054 = this.field_392;
                     }
                  }

                  this.method_466((byte)23, null);
                  break;
               case 4:
                  field_440 = "Sadhular " + var2[3];
                  this.field_391 = 72;
                  this.field_392 = 127;
                  if (this.field_399 != null) {
                     Enumeration var67 = this.field_399.elements();

                     while (var67.hasMoreElements()) {
                        class_90 var138 = (class_90)var67.nextElement();
                        var138.field_3053 = this.field_391;
                        var138.field_3054 = this.field_392;
                     }
                  }

                  this.method_466((byte)23, null);
                  break;
               case 5:
                  field_440 = "Cacto " + var2[3];
                  this.field_391 = 72;
                  this.field_392 = 127;
                  if (this.field_399 != null) {
                     Enumeration var66 = this.field_399.elements();

                     while (var66.hasMoreElements()) {
                        class_90 var137 = (class_90)var66.nextElement();
                        var137.field_3053 = this.field_391;
                        var137.field_3054 = this.field_392;
                     }
                  }

                  this.method_466((byte)23, null);
                  break;
               case 6:
                  field_440 = "Fira " + var2[3];
                  this.field_391 = 132;
                  this.field_392 = 172;
                  if (this.field_399 != null) {
                     for (Enumeration var65 = this.field_399.elements(); var65.hasMoreElements(); ((class_90)var65.nextElement()).field_3054 = this.field_392) {
                        ((class_90)var65.nextElement()).field_3053 = this.field_391;
                     }
                  }

                  this.method_466((byte)28, null);
                  break;
               case 7:
                  field_440 = "Artax " + var2[3];
                  this.field_391 = 132;
                  this.field_392 = 172;
                  if (this.field_399 != null) {
                     for (Enumeration var64 = this.field_399.elements(); var64.hasMoreElements(); ((class_90)var64.nextElement()).field_3054 = this.field_392) {
                        ((class_90)var64.nextElement()).field_3053 = this.field_391;
                     }
                  }

                  this.method_466((byte)28, null);
                  break;
               case 8:
                  field_440 = "Anonk " + var2[3];
                  this.field_391 = 132;
                  this.field_392 = 172;
                  if (this.field_399 != null) {
                     for (Enumeration var63 = this.field_399.elements(); var63.hasMoreElements(); ((class_90)var63.nextElement()).field_3054 = this.field_392) {
                        ((class_90)var63.nextElement()).field_3053 = this.field_391;
                     }
                  }

                  this.method_466((byte)28, null);
                  break;
               case 9:
                  field_440 = "Anonious " + var2[3];
                  this.field_391 = 132;
                  this.field_392 = 172;
                  if (this.field_399 != null) {
                     for (Enumeration var62 = this.field_399.elements(); var62.hasMoreElements(); ((class_90)var62.nextElement()).field_3054 = this.field_392) {
                        ((class_90)var62.nextElement()).field_3053 = this.field_391;
                     }
                  }

                  this.method_466((byte)28, null);
                  break;
               case 10:
                  field_440 = "Icex " + var2[3];
                  this.field_391 = 132;
                  this.field_392 = 172;
                  if (this.field_399 != null) {
                     for (Enumeration var61 = this.field_399.elements(); var61.hasMoreElements(); ((class_90)var61.nextElement()).field_3054 = this.field_392) {
                        ((class_90)var61.nextElement()).field_3053 = this.field_391;
                     }
                  }

                  this.method_466((byte)28, null);
                  break;
               case 11:
                  field_440 = "Taikaan " + var2[3];
                  this.field_391 = 132;
                  this.field_392 = 172;
                  if (this.field_399 != null) {
                     for (Enumeration var60 = this.field_399.elements(); var60.hasMoreElements(); ((class_90)var60.nextElement()).field_3054 = this.field_392) {
                        ((class_90)var60.nextElement()).field_3053 = this.field_391;
                     }
                  }

                  this.method_466((byte)24, null);
                  break;
               case 12:
                  field_440 = "Vormix " + var2[3];
                  this.field_391 = 132;
                  this.field_392 = 172;
                  if (this.field_399 != null) {
                     for (Enumeration var59 = this.field_399.elements(); var59.hasMoreElements(); ((class_90)var59.nextElement()).field_3054 = this.field_392) {
                        ((class_90)var59.nextElement()).field_3053 = this.field_391;
                     }
                  }

                  this.method_466((byte)24, null);
                  break;
               case 13:
                  field_440 = "Crapucus " + var2[3];
                  this.field_391 = 132;
                  this.field_392 = 172;
                  if (this.field_399 != null) {
                     for (Enumeration var58 = this.field_399.elements(); var58.hasMoreElements(); ((class_90)var58.nextElement()).field_3054 = this.field_392) {
                        ((class_90)var58.nextElement()).field_3053 = this.field_391;
                     }
                  }

                  this.method_466((byte)24, null);
                  break;
               case 14:
                  field_440 = "Actzen " + var2[3];
                  this.field_391 = 132;
                  this.field_392 = 172;
                  if (this.field_399 != null) {
                     for (Enumeration var57 = this.field_399.elements(); var57.hasMoreElements(); ((class_90)var57.nextElement()).field_3054 = this.field_392) {
                        ((class_90)var57.nextElement()).field_3053 = this.field_391;
                     }
                  }

                  this.method_466((byte)24, null);
                  break;
               case 15:
                  field_440 = "Cheeza " + var2[3];
                  this.field_391 = 132;
                  this.field_392 = 172;
                  if (this.field_399 != null) {
                     for (Enumeration var56 = this.field_399.elements(); var56.hasMoreElements(); ((class_90)var56.nextElement()).field_3054 = this.field_392) {
                        ((class_90)var56.nextElement()).field_3053 = this.field_391;
                     }
                  }

                  this.method_466((byte)24, null);
                  break;
               case 16:
                  field_440 = "Brucana " + var2[3];
                  this.field_391 = 72;
                  this.field_392 = 127;
                  if (this.field_399 != null) {
                     Enumeration var55 = this.field_399.elements();

                     while (var55.hasMoreElements()) {
                        class_90 var136 = (class_90)var55.nextElement();
                        var136.field_3053 = this.field_391;
                        var136.field_3054 = this.field_392;
                     }
                  }

                  this.method_466((byte)30, null);
                  break;
               case 17:
                  field_440 = "Cactora " + var2[3];
                  this.field_391 = 72;
                  this.field_392 = 127;
                  if (this.field_399 != null) {
                     Enumeration var54 = this.field_399.elements();

                     while (var54.hasMoreElements()) {
                        class_90 var135 = (class_90)var54.nextElement();
                        var135.field_3053 = this.field_391;
                        var135.field_3054 = this.field_392;
                     }
                  }

                  this.method_466((byte)30, null);
                  break;
               case 18:
                  field_440 = "Capmucius " + var2[3];
                  this.field_391 = 72;
                  this.field_392 = 127;
                  if (this.field_399 != null) {
                     Enumeration var53 = this.field_399.elements();

                     while (var53.hasMoreElements()) {
                        class_90 var134 = (class_90)var53.nextElement();
                        var134.field_3053 = this.field_391;
                        var134.field_3054 = this.field_392;
                     }
                  }

                  this.method_466((byte)30, null);
                  break;
               case 19:
                  field_440 = "Yippox " + var2[3];
                  this.field_391 = 72;
                  this.field_392 = 127;
                  if (this.field_399 != null) {
                     Enumeration var52 = this.field_399.elements();

                     while (var52.hasMoreElements()) {
                        class_90 var133 = (class_90)var52.nextElement();
                        var133.field_3053 = this.field_391;
                        var133.field_3054 = this.field_392;
                     }
                  }

                  this.method_466((byte)30, null);
                  break;
               case 20:
                  field_440 = "Zenaidura " + var2[3];
                  this.field_391 = 72;
                  this.field_392 = 127;
                  if (this.field_399 != null) {
                     Enumeration var51 = this.field_399.elements();

                     while (var51.hasMoreElements()) {
                        class_90 var132 = (class_90)var51.nextElement();
                        var132.field_3053 = this.field_391;
                        var132.field_3054 = this.field_392;
                     }
                  }

                  this.method_466((byte)30, null);
            }
         }

         this.field_1341 = true;
      } else if (var2[0].equals("IS")) {
         String var71 = "";
         if (field_1214 == 1) {
            var71 = this.method_294("res/colony/Human_intro.txt");
         } else if (field_1214 == 2) {
            var71 = this.method_294("res/colony/Taikuus_intro.txt");
         } else if (field_1214 == 3) {
            var71 = this.method_294("res/colony/Firan_intro.txt");
         } else {
            var71 = this.method_294("res/colony/Brucian_intro.txt");
         }

         if (this.field_785) {
            this.field_787 = var71;
         } else {
            this.field_774.method_569(var71, 16777215, 16777215);
            this.field_774.method_571((byte)2);
            this.field_785 = true;
         }
      } else if (var2[0].equals("I1")) {
         class_62.method_563("curstate = " + this.field_1300);
         field_1274.field_2793.enable();
         field_1274.field_2794.enable();
         field_1274.field_2795.enable();
         field_1274.field_2796.enable();
         field_438 = new Long(var2[5]);
         int var5;
         int var7;
         int var8;
         Icon[][] var73;
         if (Integer.parseInt(var2[10]) == -1) {
            class_85 var11 = this.field_1281.field_1553.method_769(field_1214, field_1215);
            var73 = var11.method_775();
            var5 = var11.method_774();
            var7 = var11.method_780();
            var8 = var11.method_781();
         } else {
            class_29 var318 = this.field_1275.method_177(var2[10]);
            var73 = var318.method_220();
            var5 = var318.method_219();
            var7 = var318.method_223();
            var8 = var318.method_225();
            Object var319 = null;
         }

         int var6;
         int var9;
         int var10;
         Icon[][] var142;
         if (Integer.parseInt(var2[11]) == -1) {
            class_85 var320 = this.field_1281.field_1553.method_770(field_1214, field_1216);
            var142 = var320.method_775();
            var6 = var320.method_774();
            var9 = var320.method_780();
            var10 = var320.method_781();
         } else {
            class_29 var321 = this.field_1275.method_177(var2[11]);
            var142 = var321.method_220();
            var6 = var321.method_219();
            var9 = var321.method_223();
            var10 = var321.method_225();
            Object var322 = null;
         }

         this.method_482(
            field_1212,
            var2[1],
            var73,
            var5,
            var7,
            var8,
            var142,
            var6,
            var9,
            var10,
            Integer.parseInt(var2[2]),
            Integer.parseInt(var2[3]),
            Integer.parseInt(var2[4]),
            field_1214,
            field_1215,
            field_1216
         );
         if (!this.field_1342) {
            if (this.field_785) {
               this.field_787 = this.method_294("res/colony/1.txt");
            } else {
               this.field_774.method_569(this.method_294("res/colony/1.txt"), 16777215, 16777215);
               this.field_774.method_571((byte)2);
               this.field_785 = true;
               this.field_1342 = true;
            }
         }
      } else if (var2[0].equals("I2")) {
         int var74 = Integer.parseInt(var2[7]);
         int var143 = Integer.parseInt(var2[8]);
         int var178 = Integer.parseInt(var2[9]);
         class_62.method_563("race = " + var74 + "; hair = " + var143 + "; armor = " + var178);
         int var12;
         int var13;
         Icon[][] var270;
         int var308;
         if (Integer.parseInt(var2[10]) == -1) {
            class_85 var224 = this.field_1281.field_1553.method_769(var74, var143);
            var270 = var224.method_775();
            var308 = var224.method_774();
            var12 = var224.method_780();
            var13 = var224.method_781();
         } else {
            class_29 var16 = this.field_1275.method_177(var2[10]);
            var270 = var16.method_220();
            var308 = var16.method_219();
            var12 = var16.method_223();
            var13 = var16.method_225();
            Object var333 = null;
         }

         int var14;
         int var15;
         Icon[][] var290;
         int var323;
         if (Integer.parseInt(var2[11]) == -1) {
            class_85 var248 = this.field_1281.field_1553.method_770(var74, var178);
            var290 = var248.method_775();
            var323 = var248.method_774();
            var14 = var248.method_780();
            var15 = var248.method_781();
         } else {
            class_29 var334 = this.field_1275.method_177(var2[11]);
            var290 = var334.method_220();
            var323 = var334.method_219();
            var14 = var334.method_223();
            var15 = var334.method_225();
            Object var335 = null;
         }

         this.method_482(
            Long.parseLong(var2[1]),
            var2[2],
            var270,
            var308,
            var12,
            var13,
            var290,
            var323,
            var14,
            var15,
            Integer.parseInt(var2[3]),
            Integer.parseInt(var2[4]),
            Integer.parseInt(var2[5]),
            var74,
            var143,
            var178
         );
         this.field_1273.method_92(var2[1], var2[2] + "|" + var74 + "|" + var2[6]);
         this.field_435.write("RPD\n");
         this.field_435.flush();
      } else if (var2[0].equals("I3")) {
         if (this.field_1341) {
            int var75 = Integer.parseInt(var2[7]);
            int var144 = Integer.parseInt(var2[8]);
            int var179 = Integer.parseInt(var2[9]);
            Icon[][] var271;
            int var309;
            int var329;
            int var330;
            if (Integer.parseInt(var2[10]) == -1) {
               class_85 var225 = this.field_1281.field_1553.method_769(var75, var144);
               var271 = var225.method_775();
               var309 = var225.method_774();
               var329 = var225.method_780();
               var330 = var225.method_781();
            } else {
               class_29 var336 = this.field_1275.method_177(var2[10]);
               var271 = var336.method_220();
               var309 = var336.method_219();
               var329 = var336.method_223();
               var330 = var336.method_225();
               Object var337 = null;
            }

            Icon[][] var291;
            int var324;
            int var331;
            int var332;
            if (Integer.parseInt(var2[11]) == -1) {
               class_85 var249 = this.field_1281.field_1553.method_770(var75, var179);
               var291 = var249.method_775();
               var324 = var249.method_774();
               var331 = var249.method_780();
               var332 = var249.method_781();
            } else {
               class_29 var338 = this.field_1275.method_177(var2[11]);
               var291 = var338.method_220();
               var324 = var338.method_219();
               var331 = var338.method_223();
               var332 = var338.method_225();
               Object var339 = null;
            }

            this.method_482(
               Long.parseLong(var2[1]),
               var2[2],
               var271,
               var309,
               var329,
               var330,
               var291,
               var324,
               var331,
               var332,
               Integer.parseInt(var2[3]),
               Integer.parseInt(var2[4]),
               Integer.parseInt(var2[5]),
               var75,
               var144,
               var179
            );
            class_90 var340 = (class_90)this.field_399.get(new Long(var2[1]));
            if (var340 != null) {
               this.field_1273.method_92(var2[1], var2[2] + "|" + var75 + "|" + var2[6]);
               if (this.field_698 != null) {
                  this.field_698.method_569(var340.field_3056 + " enters " + this.field_1286[field_437 - 1], 9962039, 9962039);
                  this.field_698.method_571((byte)3);
               }
            }

            if (this.field_442 == 5) {
               int var17 = Integer.parseInt(var2[6]);
               String[] var18 = this.field_1271.method_662();

               for (int var19 = 0; var19 < var18.length; var19++) {
                  class_62.method_563("buddies " + var19 + " : " + var18[var19]);
                  if (var18[var19].equalsIgnoreCase(var2[2])) {
                     this.field_1041.field_2517.add(var75 + "|" + var17 + "|" + var18[var19]);
                     return;
                  }
               }

               this.field_1041.field_2529.add(var75 + "|" + var17 + "|" + var2[2]);
            }

            if (this.field_442 == 7) {
               int var341 = Integer.parseInt(var2[6]);
               String[] var342 = this.field_1271.method_662();

               for (int var343 = 0; var343 < var342.length; var343++) {
                  class_62.method_563("buddies " + var343 + " : " + var342[var343]);
                  if (var342[var343].equalsIgnoreCase(var2[2])) {
                     this.field_1057.field_2099.add(var75 + "|" + var341 + "|" + var342[var343]);
                     return;
                  }
               }

               this.field_1057.field_2111.add(var75 + "|" + var341 + "|" + var2[2]);
            }
         }
      } else if (var2[0].equals("I4")) {
         int var76 = Integer.parseInt(var2[3]);
         int var145 = Integer.parseInt(var2[2]);
         if (var76 > 0) {
            class_29 var180 = this.field_1275.method_177(var2[1]);
            class_30 var226 = new class_30();
            var226.method_233(var180);
            var226.method_235(1);
            Icon[][] var250 = var226.method_239(var76, (byte)0);
            this.field_421.field_3064.add(var226);
            var180 = null;
            if (var145 > 1) {
               var76 = 0;
               var145--;
            }
         }

         if (var76 == 0 && var145 > 0) {
            class_29 var182 = this.field_1275.method_177(var2[1]);
            class_30 var227 = new class_30();
            var227.method_233(var182);
            var227.method_235(var145);
            this.field_421.field_3059[var182.method_193()].add(var227);
            var182 = null;
         }
      } else if (var2[0].equals("I5")) {
         int var77 = Integer.parseInt(var2[3]);
         class_90 var146 = (class_90)this.field_399.get(new Long(var2[1]));
         if (var77 > 0) {
            class_29 var184 = this.field_1275.method_177(var2[2]);
            class_30 var228 = new class_30();
            var228.method_233(var184);
            var228.method_235(1);
            Icon[][] var251 = var228.method_239(var77, (byte)0);
            var184 = null;
         }
      } else if (!var2[0].equals("I6")) {
         if (var2[0].equals("LU")) {
            if (this.field_399 != null && this.field_399.containsKey(new Long(var2[1]))) {
               class_90 var78 = (class_90)this.field_399.get(new Long(var2[1]));
               String var147;
               if (Long.parseLong(var2[1]) == field_1212) {
                  var147 = "You have levelled up!";
               } else {
                  var147 = var78.field_3056 + " has levelled up!";
               }

               class_62.method_563(var147);
               if (this.field_698 != null) {
                  class_62.method_563("system info != null");
                  this.field_698.method_569(var147, 13960102, 13960102);
                  this.field_698.method_571((byte)3);
               } else {
                  this.field_700 = var147;
               }
            }
         } else if (var2[0].equals("G1")) {
            String var79 = "The server will shut down in " + var2[1];
            if (Integer.parseInt(var2[1]) > 1) {
               var79 = var79 + " minutes.";
            } else {
               var79 = var79 + " minute.";
            }

            if (this.field_698 != null) {
               this.field_698.method_569(var79, 7683328, 7683328);
               this.field_698.method_571((byte)3);
            }
         } else if (var2[0].equals("G2")) {
            String var81 = var2[2];
            if (this.field_698 != null) {
               this.field_698.method_569(var81, 7683328, 7683328);
               this.field_698.method_571((byte)3);
            }
         } else if (var2[0].equals("CT")) {
            class_90 var82 = (class_90)this.field_399.get(new Long(var2[1]));
            if (var82 != null && this.field_691 != null) {
               this.field_691.method_569(var82.field_3056 + ": " + var2[2], 16711680, 0);
               this.field_691.method_571((byte)3);
               String var148 = var2[2];

               try {
                  byte[] var186 = var148.getBytes();
                  var148 = new String(var186, "UTF-8");
               } catch (UnsupportedEncodingException var41) {
                  class_62.method_563(var41);
               }

               var82.method_850(var148);
            }
         } else if (var2[0].equals("WK")) {
            if (this.field_399 != null && this.field_399.containsKey(new Long(var2[1]))) {
               class_90 var83 = (class_90)this.field_399.get(new Long(var2[1]));
               if (var83 != null) {
                  int var149 = var83.method_802();
                  int var187 = var83.method_852(Integer.parseInt(var2[2]));
                  int var229 = var83.method_853(Integer.parseInt(var2[3]));
                  var83.method_859(var187, var229);
               } else if (this.field_400 != null) {
                  this.field_400.put(new Long(var2[1]), var1);
               }
            }
         } else if (var2[0].equals("KA")) {
            this.field_435.write("KA|" + field_436 + "|" + field_439 + "\n");
            this.field_435.flush();
         } else if (var2[0].equals("AF")) {
            try {
               this.field_441.method_889();
               this.field_441 = null;
               this.field_434 = null;
               this.field_435 = null;
               this.field_433.close();
               this.field_433 = null;
               class_62.method_563("colony closed");
               this.method_487("Connection with the server is lost.\nPlease try again.\n[Press Any Key]", (byte)8, null);
            } catch (IOException var40) {
            }
         } else if (var2[0].equals("LV")) {
            if (this.field_1341) {
               class_86 var84 = (class_86)this.field_399.get(new Long(var2[1]));
               if (var84 != null) {
                  class_62.method_563(((class_90)var84).field_3056 + " leaves");
                  var84.method_798();
                  this.field_420.method_786(var84);
                  if (this.field_698 != null) {
                     this.field_698.method_569(((class_90)var84).field_3056 + " has left", 9962039, 9962039);
                     this.field_698.method_571((byte)3);
                  }
               }

               this.field_1273.method_93(var2[1]);
               this.field_400.remove(new Long(var2[1]));
               if (this.field_620 != null && this.field_620.equals("" + Long.parseLong(var2[1]))) {
                  this.field_581 = false;
                  this.field_641 = false;
                  this.field_642 = false;
                  this.field_588 = false;
                  this.field_620 = null;

                  for (int var150 = 0; var150 < this.field_599.size(); var150++) {
                     class_30 var188 = (class_30)this.field_599.get(var150);
                     int var230 = this.field_421.field_3059[var188.method_234().method_193()].indexOf(var188);
                     if (var230 == -1) {
                        this.field_421.field_3059[var188.method_234().method_193()].add((class_30)var188.clone());
                     } else {
                        ((class_30)this.field_421.field_3059[var188.method_234().method_193()].elementAt(var230))
                           .method_235(
                              ((class_30)this.field_421.field_3059[var188.method_234().method_193()].elementAt(var230)).method_236() + var188.method_236()
                           );
                     }
                  }

                  this.field_599 = new Vector();
                  this.field_598 = new Vector();
                  this.field_587 = false;
                  field_438 = field_438 + this.field_601;
                  this.field_601 = 0;
                  this.field_600 = 0;
                  field_1274.remove(field_1274.field_2796);
                  this.field_607 = 0;
                  this.field_698.method_569("Trade cancelled", 7549, 7549);
                  this.field_698.method_571((byte)3);
               }
            }
         } else if (var2[0].equals("EM")) {
            class_62.method_563("emoticon = " + var1);
            class_90 var85 = (class_90)this.field_399.get(new Long(var2[1]));
            if (var85 != null && this.field_691 != null) {
               switch (Integer.parseInt(var2[2])) {
                  case 0:
                     this.field_691.method_569(var85.field_3056 + ": *smiles*", 16711680, 0);
                     break;
                  case 1:
                     this.field_691.method_569(var85.field_3056 + ": *frowns*", 16711680, 0);
                     break;
                  case 2:
                     this.field_691.method_569(var85.field_3056 + ": *SOS*", 16711680, 0);
                     break;
                  case 3:
                     this.field_691.method_569(var85.field_3056 + ": *grateful*", 16711680, 0);
                     break;
                  case 4:
                     this.field_691.method_569(var85.field_3056 + ": *sobs*", 16711680, 0);
                     break;
                  case 5:
                     this.field_691.method_569(var85.field_3056 + ": *heart flutters*", 16711680, 0);
                     break;
                  case 6:
                     this.field_691.method_569(var85.field_3056 + ": *blushes*", 16711680, 0);
                     break;
                  case 7:
                     this.field_691.method_569(var85.field_3056 + ": *shocked*", 16711680, 0);
                     break;
                  case 8:
                     this.field_691.method_569(var85.field_3056 + ": *grins*", 16711680, 0);
                     break;
                  case 9:
                     this.field_691.method_569(var85.field_3056 + ": *yawns*", 16711680, 0);
                     break;
                  case 10:
                     this.field_691.method_569(var85.field_3056 + ": *waves*", 16711680, 0);
               }

               this.field_691.method_571((byte)3);
               var85.method_851(Integer.parseInt(var2[2]));
            }
         } else if (var2[0].equals("KO")) {
            try {
               this.field_441.method_889();
               this.field_441 = null;
               this.field_434 = null;
               this.field_435 = null;
               this.field_433.close();
               this.field_433 = null;
               class_62.method_563("colony closed");
               this.field_421 = null;
               if (this.field_405 != null) {
                  this.field_405.h();
               }

               if (this.field_406 != null) {
                  this.field_406.h();
               }

               if (this.field_407 != null) {
                  this.field_407.h();
               }

               if (this.field_408 != null) {
                  this.field_408.h();
               }

               if (this.field_409 != null) {
                  this.field_409.h();
               }

               if (this.field_410 != null) {
                  this.field_410.h();
               }

               if (this.field_423 != null) {
                  this.field_411.h();
               }

               if (this.field_404 != null) {
                  this.field_404.method_811();
               }

               if (this.field_413 != null) {
                  this.field_413.h();
               }

               if (this.field_414 != null) {
                  this.field_414.h();
               }

               if (this.field_415 != null) {
                  this.field_415.h();
               }

               if (this.field_416 != null) {
                  this.field_416.h();
               }

               if (this.field_417 != null) {
                  this.field_417.h();
               }

               if (this.field_412 != null) {
                  this.field_412.method_811();
               }

               if (this.field_399 != null) {
                  Enumeration var86 = this.field_399.elements();

                  while (var86.hasMoreElements()) {
                     ((class_90)var86.nextElement()).h();
                  }

                  this.field_399.clear();
               }

               if (this.field_420 != null) {
                  this.field_420.method_811();
               }

               if (this.field_418 != null) {
                  this.field_418.h();
               }

               if (this.field_423 != null) {
                  this.field_423.h();
               }

               if (this.field_424 != null) {
                  this.field_424.h();
               }

               if (this.field_425 != null) {
                  this.field_425.h();
               }

               if (this.field_422 != null) {
                  this.field_422.method_811();
               }

               if (this.field_427 != null) {
                  this.field_427.method_811();
               }

               if (this.field_429 != null) {
                  this.field_429.method_798();
               }

               this.field_691.method_570();
               this.field_698.method_570();
               this.field_552 = new Vector();
               this.field_553 = new Vector();
               this.method_487("Duplicate login!\n[Press Any Key]", (byte)8, null);
            } catch (IOException var44) {
            }
         } else if (var2[0].equals("WS")) {
            class_3.field_20.method_17("res/sound/mouse_effects/alert.wav");
            if (this.field_691 != null) {
               this.field_691.method_569(var2[1] + " speaks to you: " + var2[2], 9831166, 0);
               this.field_691.method_571((byte)3);
            }
         } else if (var2[0].equals("U2")) {
            for (int var87 = 0; var87 < this.field_421.field_3059[3].size(); var87++) {
               class_30 var151 = (class_30)this.field_421.field_3059[3].get(var87);
               if (var151.method_234().method_179() == Long.parseLong(var2[1])) {
                  if (var151.method_236() > 1) {
                     var151.method_235(var151.method_236() - 1);
                  } else {
                     this.field_421.field_3059[3].remove(var87);
                  }

                  this.field_762 = -1;
                  this.field_763 = -1L;
                  break;
               }
            }
         } else if (var2[0].equals("U3")) {
            this.field_698.method_569(this.field_764[Integer.parseInt(var2[2]) - 1], 8651009, 8651009);
            this.field_698.method_571((byte)3);
            this.field_762 = -1;
            this.field_763 = -1L;
         } else if (var2[0].equals("P2") || var2[0].equals("P3")) {
            this.field_832.add(var2[1]);
            this.field_833.add(var2[2]);
         } else if (var2[0].equals("P5")) {
            this.field_831 = false;
            this.field_818 = -1;
            this.method_487("Sorry\n" + this.field_1286[this.field_819 - 1] + " is fully occupied.\nPlease try again later.[Press Any Key]", (byte)14, null);
         } else if (var2[0].equals("P6")) {
            this.field_831 = false;
            this.field_818 = -1;
            this.method_487("Sorry\nYou do not have enough sidos.\nPlease try again later.[Press Any Key]", (byte)14, null);
         } else if (var2[0].equals("P7")) {
            try {
               this.field_441.method_889();
               this.field_441 = null;
               this.field_434 = null;
               this.field_435 = null;
               this.field_433.close();
               this.field_433 = null;
               class_62.method_563("colony closed");
               this.field_421 = null;
               this.field_399.clear();
               this.field_405.h();
               this.field_406.h();
               this.field_407.h();
               this.field_408.h();
               this.field_409.h();
               this.field_410.h();
               this.field_411.h();
               this.field_404.method_811();
               if (this.field_413 != null) {
                  this.field_413.h();
               }

               this.field_414.h();
               if (this.field_415 != null) {
                  this.field_415.h();
               }

               this.field_416.h();
               this.field_417.h();
               this.field_412.method_811();
               Enumeration var88 = this.field_399.elements();

               while (var88.hasMoreElements()) {
                  ((class_90)var88.nextElement()).h();
               }

               this.field_399.clear();
               this.field_420.method_811();
               this.field_418.h();
               this.field_423.h();
               this.field_424.h();
               this.field_425.h();
               this.field_422.method_811();
               this.field_427.method_811();
               this.field_429.method_798();
               field_1274.field_2785.remove(0, field_1274.field_2785.getLength());
               this.field_1281.field_1523 = var2[1];
               this.field_1281.field_1524 = Integer.parseInt(var2[2]);
               this.field_433 = new Socket(var2[1], Integer.parseInt(var2[2]));
               this.field_435 = new PrintWriter(this.field_433.getOutputStream(), true);
               this.field_434 = new BufferedReader(new InputStreamReader(this.field_433.getInputStream()));
               class_62.method_563("~~~~~~~~~~~~~~~~~~~~connecting~~~~~~~~~~~~~~~~~~~~~~~~~");
               this.field_441 = new class_95(this);
               this.field_441.start();
            } catch (IOException var45) {
               class_62.method_563("connection error = " + var45.getMessage());
               this.method_487("Unable to connect to the server.\nPlease try again.\n[Press Any Key]", (byte)8, null);
            } catch (BadLocationException var46) {
               class_62.method_563("problem in deleting history: " + var46.getMessage());
            }
         } else if (var2[0].equals("P8")) {
            field_438 = new Long(var2[1]);
         } else if (var2[0].equals("BS")) {
            this.field_1271.method_658(var2[1], var2[2], var2[3]);
         } else if (var2[0].equals("SN")) {
            this.field_1298 = -1;
            this.field_429.g();
            this.field_429.method_878("Sorry, no merchants available.", null);
         } else if (!var2[0].equals("SY")) {
            if (var2[0].equals("S2")) {
               this.field_1298 = 3;
               if (this.field_429.e()) {
                  this.field_429.method_878(var2[2], var2[1]);
               }
            } else if (var2[0].equals("S3")) {
               class_62.method_563("shopitems = " + var1);
               class_29 var89 = this.field_1275.method_177(var2[1]);
               class_30 var152 = new class_30();
               var152.method_233(var89);
               var152.method_237(Long.parseLong(var2[2]));
               var152.method_235(Integer.parseInt(var2[3]));
               this.method_320(var152);
               var89 = null;
            } else if (var2[0].equals("S6")) {
               try {
                  this.field_936.insertString(this.field_936.getLength(), "\n You bought ", field_1274.field_2786);
                  this.field_936.insertString(this.field_936.getLength(), this.field_928.getText() + " " + this.field_932, field_1274.field_2790);
                  this.field_935.setCaretPosition(this.field_936.getLength());
               } catch (BadLocationException var39) {
                  class_62.method_563(var39.getMessage());
               }
            } else if (var2[0].equals("S9")) {
               try {
                  this.field_936.insertString(this.field_936.getLength(), "\n You do not have enough sidos to buy ", field_1274.field_2788);
                  this.field_936.insertString(this.field_936.getLength(), this.field_928.getText() + " " + this.field_932, field_1274.field_2789);
                  this.field_935.setCaretPosition(this.field_936.getLength());
               } catch (BadLocationException var38) {
                  class_62.method_563(var38.getMessage());
               }
            } else if (var2[0].equals("S8")) {
               field_438 = Long.parseLong(var2[1]);
            } else if (var2[0].equals("S10")) {
               try {
                  this.field_936.insertString(this.field_936.getLength(), "\n The shop has inadequate stock for the purchase of ", field_1274.field_2788);
                  this.field_936.insertString(this.field_936.getLength(), this.field_928.getText() + " " + this.field_932, field_1274.field_2789);
                  this.field_935.setCaretPosition(this.field_936.getLength());
               } catch (BadLocationException var37) {
                  class_62.method_563(var37.getMessage());
               }

               for (int var91 = 0; var91 < this.field_861.length; var91++) {
                  Enumeration var153 = this.field_861[var91].elements();

                  for (int var189 = 0; var153.hasMoreElements(); var189++) {
                     class_30 var231 = (class_30)var153.nextElement();
                     if (this.field_931 == var231.method_234().method_179()) {
                        ((class_30)this.field_861[var91].elementAt(var189)).method_235(Integer.parseInt(var2[1]));
                     }
                  }
               }
            } else if (var2[0].equals("S21")) {
               for (int var92 = 0; var92 < this.field_421.field_3059.length; var92++) {
                  Enumeration var154 = this.field_421.field_3059[var92].elements();

                  for (int var190 = 0; var154.hasMoreElements(); var190++) {
                     class_30 var232 = (class_30)var154.nextElement();
                     if (Long.parseLong(var2[2]) == var232.method_234().method_179()) {
                        ((class_30)this.field_421.field_3059[var92].elementAt(var190)).method_237(Long.parseLong(var2[3]));
                     }
                  }
               }
            } else if (var2[0].equals("S16")) {
               try {
                  this.field_936.insertString(this.field_936.getLength(), "\n You sold ", field_1274.field_2786);
                  this.field_936.insertString(this.field_936.getLength(), this.field_928.getText() + " " + this.field_932, field_1274.field_2790);
                  this.field_935.setCaretPosition(this.field_936.getLength());
               } catch (BadLocationException var36) {
                  class_62.method_563(var36.getMessage());
               }
            } else if (var2[0].equals("S15")) {
               try {
                  this.field_936.insertString(this.field_936.getLength(), "\n You do not have ", field_1274.field_2788);
                  this.field_936.insertString(this.field_936.getLength(), this.field_928.getText() + " " + this.field_932, field_1274.field_2789);
                  this.field_936.insertString(this.field_936.getLength(), " to sell ", field_1274.field_2788);
                  this.field_935.setCaretPosition(this.field_936.getLength());
               } catch (BadLocationException var35) {
                  class_62.method_563(var35.getMessage());
               }

               for (int var93 = 0; var93 < this.field_421.field_3059.length; var93++) {
                  Enumeration var155 = this.field_421.field_3059[var93].elements();

                  for (int var191 = 0; var155.hasMoreElements(); var191++) {
                     class_30 var233 = (class_30)var155.nextElement();
                     if (var233.method_234().method_179() == this.field_931) {
                        ((class_30)this.field_421.field_3059[var93].elementAt(var191)).method_235(Integer.parseInt(var2[1]));
                     }
                  }
               }
            } else if (var2[0].equals("S7")) {
               int var94 = Integer.parseInt(var2[3]);
               int var156 = Integer.parseInt(var2[2]);
               if (var94 > 0) {
                  var156--;
               }

               long var192 = Long.parseLong(var2[1]);
               boolean var252 = false;

               for (int var272 = 0; var272 < this.field_421.field_3059.length; var272++) {
                  Enumeration var292 = this.field_421.field_3059[var272].elements();

                  for (int var310 = 0; var292.hasMoreElements(); var310++) {
                     class_30 var325 = (class_30)var292.nextElement();
                     if (var325.method_234().method_179() == var192) {
                        if (var156 <= 0) {
                           this.field_421.field_3059[var272].remove(var310);
                        } else {
                           ((class_30)this.field_421.field_3059[var272].elementAt(var310)).method_235(var156);
                        }

                        var252 = true;
                     }
                  }
               }

               if (!var252 && var156 > 0) {
                  class_29 var273 = this.field_1275.method_177(var2[1]);
                  class_30 var293 = new class_30();
                  var293.method_233(var273);
                  var293.method_235(var156);
                  this.field_421.field_3059[var273.method_193()].add(var293);
                  var273 = null;
               }

               this.field_435.write("S20|" + this.field_429.method_881().toString() + "\n");
               this.field_435.flush();
            } else if (var2[0].equals("S17")) {
               if (var2[1].equals(this.field_429.method_881().toString())) {
                  class_62.method_563("in here");
                  int var95 = Integer.parseInt(var2[4]);
                  long var157 = Long.parseLong(var2[2]);
                  boolean var234 = false;

                  for (int var253 = 0; var253 < this.field_861.length; var253++) {
                     Enumeration var275 = this.field_861[var253].elements();

                     for (int var294 = 0; var275.hasMoreElements(); var294++) {
                        class_30 var311 = (class_30)var275.nextElement();
                        if (var311.method_234().method_179() == var157) {
                           if (var95 <= 0 && var95 != -1) {
                              this.field_861[var253].remove(var294);
                           } else {
                              ((class_30)this.field_861[var253].elementAt(var294)).method_235(var95);
                              ((class_30)this.field_861[var253].elementAt(var294)).method_237(Long.parseLong(var2[3]));
                           }

                           var234 = true;
                           break;
                        }
                     }
                  }

                  if (!var234 && (var95 > 0 || var95 == -1)) {
                     class_29 var254 = this.field_1275.method_177(var2[2]);
                     class_30 var276 = new class_30();
                     var276.method_233(var254);
                     var276.method_235(var95);
                     var276.method_237(Long.parseLong(var2[3]));
                     this.field_861[var254.method_193()].add(var276);
                     var254 = null;
                  }
               }
            } else if (var2[0].equals("L2")) {
               class_29 var96 = this.field_1275.method_177(var2[1]);
               class_30 var158 = new class_30();
               var158.method_233(var96);
               var158.method_235(Integer.parseInt(var2[2]));
               this.method_321(var158);
               var96 = null;
            } else if (!var2[0].equals("L13")) {
               if (var2[0].equals("L4")) {
                  try {
                     this.field_936.insertString(this.field_936.getLength(), "\n You put ", field_1274.field_2786);
                     this.field_936.insertString(this.field_936.getLength(), this.field_928.getText() + " " + this.field_932, field_1274.field_2790);
                     this.field_936.insertString(this.field_936.getLength(), " into your locker", field_1274.field_2786);
                     this.field_935.setCaretPosition(this.field_936.getLength());
                  } catch (BadLocationException var34) {
                     class_62.method_563(var34.getMessage());
                  }
               } else if (var2[0].equals("L15")) {
                  field_438 = Long.parseLong(var2[1]);
               } else if (var2[0].equals("L9")) {
                  try {
                     this.field_936.insertString(this.field_936.getLength(), "\n You got ", field_1274.field_2786);
                     this.field_936.insertString(this.field_936.getLength(), this.field_928.getText() + " " + this.field_932, field_1274.field_2790);
                     this.field_936.insertString(this.field_936.getLength(), " from your locker", field_1274.field_2786);
                     this.field_935.setCaretPosition(this.field_936.getLength());
                  } catch (BadLocationException var33) {
                     class_62.method_563(var33.getMessage());
                  }
               } else if (var2[0].equals("L10")) {
                  try {
                     this.field_936.insertString(this.field_936.getLength(), "\n You do not have ", field_1274.field_2788);
                     this.field_936.insertString(this.field_936.getLength(), this.field_928.getText() + " " + this.field_932, field_1274.field_2789);
                     this.field_936.insertString(this.field_936.getLength(), " to withdraw ", field_1274.field_2788);
                     this.field_935.setCaretPosition(this.field_936.getLength());
                  } catch (BadLocationException var32) {
                     class_62.method_563(var32.getMessage());
                  }
               } else if (var2[0].equals("L6")) {
                  try {
                     this.field_936.insertString(this.field_936.getLength(), "\n You do not have enough", field_1274.field_2788);
                     this.field_936.insertString(this.field_936.getLength(), " currency to withdraw ", field_1274.field_2788);
                     this.field_935.setCaretPosition(this.field_936.getLength());
                  } catch (BadLocationException var31) {
                     class_62.method_563(var31.getMessage());
                  }
               } else if (var2[0].equals("L7")) {
                  try {
                     this.field_936.insertString(this.field_936.getLength(), "\n You do not have ", field_1274.field_2788);
                     this.field_936.insertString(this.field_936.getLength(), this.field_928.getText() + " " + this.field_932, field_1274.field_2789);
                     this.field_936.insertString(this.field_936.getLength(), " to deposit ", field_1274.field_2788);
                     this.field_935.setCaretPosition(this.field_936.getLength());
                  } catch (BadLocationException var30) {
                     class_62.method_563(var30.getMessage());
                  }
               } else if (var2[0].equals("OW")) {
                  if (this.field_442 == 3) {
                     if (this.field_836 == 1) {
                        try {
                           this.field_936.insertString(this.field_936.getLength(), "\n You will be encumbered if you withdraw ", field_1274.field_2788);
                           this.field_936.insertString(this.field_936.getLength(), this.field_928.getText() + " " + this.field_932, field_1274.field_2789);
                           this.field_935.setCaretPosition(this.field_936.getLength());
                        } catch (BadLocationException var29) {
                           class_62.method_563(var29.getMessage());
                        }
                     } else {
                        try {
                           this.field_936.insertString(this.field_936.getLength(), "\n You will be encumbered if you buy ", field_1274.field_2788);
                           this.field_936.insertString(this.field_936.getLength(), this.field_928.getText() + " " + this.field_932, field_1274.field_2789);
                           this.field_935.setCaretPosition(this.field_936.getLength());
                        } catch (BadLocationException var28) {
                           class_62.method_563(var28.getMessage());
                        }
                     }
                  }

                  if (this.field_442 == 2) {
                     if (this.field_836 == 0) {
                        try {
                           this.field_936.insertString(this.field_936.getLength(), "\n You will be encumbered if you buy ", field_1274.field_2788);
                           this.field_936.insertString(this.field_936.getLength(), this.field_928.getText() + " " + this.field_932, field_1274.field_2789);
                           this.field_935.setCaretPosition(this.field_936.getLength());
                        } catch (BadLocationException var27) {
                           class_62.method_563(var27.getMessage());
                        }
                     }
                  } else if (this.field_442 == 0 && this.field_581) {
                     this.field_581 = false;
                     this.field_641 = false;
                     this.field_642 = false;
                     this.field_588 = false;
                     this.field_620 = null;
                     field_1274.remove(field_1274.field_2796);

                     for (int var98 = 0; var98 < this.field_599.size(); var98++) {
                        class_30 var159 = (class_30)this.field_599.get(var98);
                        int var193 = this.field_421.field_3059[var159.method_234().method_193()].indexOf(var159);
                        if (var193 == -1) {
                           this.field_421.field_3059[var159.method_234().method_193()].add((class_30)var159.clone());
                        } else {
                           ((class_30)this.field_421.field_3059[var159.method_234().method_193()].elementAt(var193))
                              .method_235(
                                 ((class_30)this.field_421.field_3059[var159.method_234().method_193()].elementAt(var193)).method_236() + var159.method_236()
                              );
                        }
                     }

                     this.field_599 = new Vector();
                     this.field_598 = new Vector();
                     field_438 = field_438 + this.field_601;
                     this.field_601 = 0;
                     this.field_600 = 0;
                     this.field_587 = false;
                     this.field_607 = 0;
                     this.field_698.method_569("This transaction will cause you to be encumbered. Trade cancelled.", 7549, 7549);
                     this.field_698.method_571((byte)3);
                  }
               } else if (var2[0].equals("L14")) {
                  int var99 = Integer.parseInt(var2[3]);
                  int var160 = Integer.parseInt(var2[2]);
                  if (var99 > 0) {
                     var160--;
                  }

                  long var194 = Long.parseLong(var2[1]);
                  boolean var256 = false;

                  for (int var277 = 0; var277 < this.field_421.field_3059.length && !var256; var277++) {
                     Enumeration var295 = this.field_421.field_3059[var277].elements();

                     for (int var312 = 0; var295.hasMoreElements(); var312++) {
                        class_30 var326 = (class_30)var295.nextElement();
                        if (var326.method_234().method_179() == var194) {
                           if (var160 > 0) {
                              ((class_30)this.field_421.field_3059[var277].elementAt(var312)).method_235(var160);
                           } else {
                              this.field_421.field_3059[var277].remove(var312);
                           }

                           var256 = true;
                           break;
                        }
                     }
                  }

                  if (!var256) {
                     class_29 var278 = this.field_1275.method_177(var2[1]);
                     class_30 var296 = new class_30();
                     var296.method_233(var278);
                     var296.method_235(var160);
                     this.field_421.field_3059[var278.method_193()].add(var296);
                     var278 = null;
                  }
               } else if (var2[0].equals("L5")) {
                  long var100 = Long.parseLong(var2[1]);
                  int var195 = Integer.parseInt(var2[2]);
                  boolean var235 = false;

                  for (int var257 = 0; var257 < this.field_862.length; var257++) {
                     Enumeration var280 = this.field_862[var257].elements();

                     for (int var297 = 0; var280.hasMoreElements(); var297++) {
                        class_30 var313 = (class_30)var280.nextElement();
                        if (var313.method_234().method_179() == var100) {
                           if (var195 == 0) {
                              this.field_862[var257].remove(var313);
                           } else {
                              ((class_30)this.field_862[var257].elementAt(var297)).method_235(var195);
                           }

                           var235 = true;
                        }
                     }
                  }

                  if (!var235) {
                     class_29 var258 = this.field_1275.method_177(var2[1]);
                     class_30 var281 = new class_30();
                     var281.method_233(var258);
                     var281.method_235(Integer.parseInt(var2[2]));
                     this.field_862[var258.method_193()].add(var281);
                     var258 = null;
                  }
               } else if (var2[0].equals("BO")) {
                  this.field_698.method_569("Sorry " + var2[1] + " is offline and can't authorise you", 86567, 86567);
                  this.field_698.method_571((byte)3);
               } else if (var2[0].equals("BA")) {
                  if (var2[2].equals("Y")) {
                     this.field_698.method_569(var2[1] + " accepted your buddy request", 86567, 86567);
                     this.field_698.method_571((byte)3);
                     this.field_1271.method_658(var2[1], "online", var2[3]);
                  } else if (var2[2].equals("N")) {
                     this.field_698.method_569(var2[1] + " rejected your buddy request", 86567, 86567);
                     this.field_698.method_571((byte)3);
                  }
               } else if (var2[0].equals("BR")) {
                  if (this.field_1341) {
                     this.field_462 = new int[2];
                     this.field_462[0] = 0;
                     this.field_462[1] = 1;
                     this.field_463 = new String[2];
                     this.field_463[0] = "BA|" + var2[1] + "|" + "Y" + "|" + var2[3] + "\n";
                     this.field_463[1] = "BA|" + var2[1] + "|" + "N" + "|" + "0" + "\n";
                     this.field_451
                        .method_515(
                           this.field_452,
                           var2[1] + " sends you an buddy request ",
                           this.field_453,
                           this.field_454,
                           this.field_455,
                           this.field_456,
                           MastersOfDestiny.field_2809,
                           this.field_457,
                           this.field_458,
                           this.field_459,
                           this.field_462,
                           this.field_463
                        );
                  }
               } else if (var2[0].equals("BD")) {
                  this.field_1271.method_659(var2[1]);
               } else if (var2[0].equals("PCD")) {
                  this.field_1273.method_92(var2[1], var2[2] + "|" + var2[3] + "|" + var2[4]);
               } else if (var2[0].equals("T2")) {
                  String var101 = this.field_1273.method_94(var2[1]);
                  this.field_698.method_569(var101 + " is offline", 7549, 7549);
                  this.field_698.method_571((byte)3);
               } else if (var2[0].equals("T11")) {
                  String var102 = this.field_1273.method_94(var2[1]);
                  this.field_698.method_569(var102 + " is participating in another trade", 7549, 7549);
                  this.field_698.method_571((byte)3);
               } else if (var2[0].equals("T21")) {
                  String var103 = this.field_1273.method_94(var2[1]);
                  this.field_698.method_569(var103 + " is encumbered and cannot trade with you.", 7549, 7549);
                  this.field_698.method_571((byte)3);
               } else if (var2[0].equals("T22")) {
                  this.field_698.method_569("Please lighten your inventory before trading!", 7549, 7549);
                  this.field_698.method_571((byte)3);
               } else if (var2[0].equals("T10")) {
                  this.field_698.method_569("You cannot request for more than one trade at the same time", 7549, 7549);
                  this.field_698.method_571((byte)3);
               } else if (var2[0].equals("T14")) {
                  this.field_581 = false;
                  this.field_641 = false;
                  this.field_642 = false;
                  this.field_588 = false;
                  this.field_620 = null;
                  field_1274.remove(field_1274.field_2796);

                  for (int var104 = 0; var104 < this.field_599.size(); var104++) {
                     class_30 var161 = (class_30)this.field_599.get(var104);
                     int var196 = this.field_421.field_3059[var161.method_234().method_193()].indexOf(var161);
                     if (var196 == -1) {
                        this.field_421.field_3059[var161.method_234().method_193()].add((class_30)var161.clone());
                     } else {
                        ((class_30)this.field_421.field_3059[var161.method_234().method_193()].elementAt(var196))
                           .method_235(
                              ((class_30)this.field_421.field_3059[var161.method_234().method_193()].elementAt(var196)).method_236() + var161.method_236()
                           );
                     }
                  }

                  this.field_599 = new Vector();
                  this.field_598 = new Vector();
                  this.field_587 = false;
                  field_438 = field_438 + this.field_601;
                  this.field_601 = 0;
                  this.field_600 = 0;
                  this.field_607 = 0;
                  this.field_698.method_569("You do not have enough item to trade", 7549, 7549);
                  this.field_698.method_571((byte)3);
               } else if (var2[0].equals("T18")) {
                  this.field_581 = false;
                  this.field_641 = false;
                  this.field_620 = null;
                  this.field_642 = false;
                  this.field_588 = false;
                  field_1274.remove(field_1274.field_2796);

                  for (int var105 = 0; var105 < this.field_599.size(); var105++) {
                     class_30 var162 = (class_30)this.field_599.get(var105);
                     int var197 = this.field_421.field_3059[var162.method_234().method_193()].indexOf(var162);
                     if (var197 == -1) {
                        this.field_421.field_3059[var162.method_234().method_193()].add((class_30)var162.clone());
                     } else {
                        ((class_30)this.field_421.field_3059[var162.method_234().method_193()].elementAt(var197))
                           .method_235(
                              ((class_30)this.field_421.field_3059[var162.method_234().method_193()].elementAt(var197)).method_236() + var162.method_236()
                           );
                     }
                  }

                  this.field_599 = new Vector();
                  this.field_598 = new Vector();
                  this.field_587 = false;
                  field_438 = field_438 + this.field_601;
                  this.field_601 = 0;
                  this.field_600 = 0;
                  this.field_607 = 0;
                  this.field_698.method_569("You do not have item to trade", 7549, 7549);
                  this.field_698.method_571((byte)3);
               } else if (var2[0].equals("T19")) {
                  this.field_581 = false;
                  this.field_641 = false;
                  this.field_642 = false;
                  this.field_588 = false;
                  this.field_620 = null;
                  field_1274.remove(field_1274.field_2796);

                  for (int var106 = 0; var106 < this.field_599.size(); var106++) {
                     class_30 var163 = (class_30)this.field_599.get(var106);
                     int var198 = this.field_421.field_3059[var163.method_234().method_193()].indexOf(var163);
                     if (var198 == -1) {
                        this.field_421.field_3059[var163.method_234().method_193()].add((class_30)var163.clone());
                     } else {
                        ((class_30)this.field_421.field_3059[var163.method_234().method_193()].elementAt(var198))
                           .method_235(
                              ((class_30)this.field_421.field_3059[var163.method_234().method_193()].elementAt(var198)).method_236() + var163.method_236()
                           );
                     }
                  }

                  this.field_599 = new Vector();
                  this.field_598 = new Vector();
                  this.field_587 = false;
                  field_438 = field_438 + this.field_601;
                  this.field_601 = 0;
                  this.field_600 = 0;
                  this.field_607 = 0;
                  this.field_698.method_569("You do not have enough balance to trade", 7549, 7549);
                  this.field_698.method_571((byte)3);
               } else if (var2[0].equals("T15")) {
                  String var107 = this.field_1273.method_94(var2[1]);
                  this.field_581 = false;
                  this.field_641 = false;
                  this.field_642 = false;
                  this.field_588 = false;
                  this.field_620 = null;
                  field_1274.remove(field_1274.field_2796);

                  for (int var164 = 0; var164 < this.field_599.size(); var164++) {
                     class_30 var199 = (class_30)this.field_599.get(var164);
                     int var236 = this.field_421.field_3059[var199.method_234().method_193()].indexOf(var199);
                     if (var236 == -1) {
                        this.field_421.field_3059[var199.method_234().method_193()].add((class_30)var199.clone());
                     } else {
                        ((class_30)this.field_421.field_3059[var199.method_234().method_193()].elementAt(var236))
                           .method_235(
                              ((class_30)this.field_421.field_3059[var199.method_234().method_193()].elementAt(var236)).method_236() + var199.method_236()
                           );
                     }
                  }

                  this.field_599 = new Vector();
                  this.field_598 = new Vector();
                  field_438 = field_438 + this.field_601;
                  this.field_601 = 0;
                  this.field_600 = 0;
                  this.field_587 = false;
                  this.field_607 = 0;
                  this.field_698.method_569(var107 + " cancelled the trade", 7549, 7549);
                  this.field_698.method_571((byte)3);
               } else if (var2[0].equals("T7")) {
                  this.field_581 = true;
                  this.field_475 = -1;
                  field_1274.add(field_1274.field_2796);
                  field_1274.field_2796.setText("0");
                  this.field_620 = var2[1];
               } else if (var2[0].equals("T6")) {
                  String var108 = this.field_1273.method_94(var2[1]);
                  this.field_698.method_569(var108 + " rejected your trading request", 7549, 7549);
                  this.field_698.method_571((byte)3);
               } else if (var2[0].equals("T9")) {
                  int var109 = Integer.parseInt(var2[3]);
                  class_29 var165 = this.field_1275.method_177(var2[2]);
                  class_30 var200 = new class_30();
                  var200.method_233(var165);
                  var200.method_235(var109);
                  this.field_598.add(var200);
                  var165 = null;
               } else if (var2[0].equals("T17")) {
                  this.field_600 = Integer.parseInt(var2[2]);
               } else if (var2[0].equals("T13")) {
                  this.field_581 = false;
                  this.field_641 = false;
                  this.field_642 = false;
                  this.field_588 = false;
                  this.field_620 = null;
                  field_1274.remove(field_1274.field_2796);

                  for (int var110 = 0; var110 < this.field_598.size(); var110++) {
                     class_30 var167 = (class_30)this.field_598.get(var110);
                     int var201 = this.field_421.field_3059[var167.method_234().method_193()].indexOf(var167);
                     if (var201 == -1) {
                        this.field_421.field_3059[var167.method_234().method_193()].add((class_30)var167.clone());
                     } else {
                        ((class_30)this.field_421.field_3059[var167.method_234().method_193()].elementAt(var201))
                           .method_235(
                              ((class_30)this.field_421.field_3059[var167.method_234().method_193()].elementAt(var201)).method_236() + var167.method_236()
                           );
                     }
                  }

                  this.field_599 = new Vector();
                  this.field_598 = new Vector();
                  this.field_587 = false;
                  field_438 = field_438 + this.field_600;
                  this.field_601 = 0;
                  this.field_600 = 0;
                  this.field_607 = 0;
                  this.field_698.method_569("Trade successful!", 7549, 7549);
                  this.field_698.method_571((byte)3);
               } else if (var2[0].equals("T12")) {
                  this.field_641 = true;
               } else if (var2[0].equals("T3")) {
                  if (this.field_1341) {
                     int[] var111 = new int[]{0, 1};
                     String[] var168 = new String[]{"T5|" + var2[1] + "\n", "T4|" + var2[1] + "\n"};
                     String var202 = this.field_1273.method_94(var2[1]);
                     this.field_451
                        .method_515(
                           this.field_452,
                           var202 + " sends you a trade request ",
                           this.field_453,
                           this.field_454,
                           this.field_455,
                           this.field_456,
                           MastersOfDestiny.field_2809,
                           this.field_457,
                           this.field_458,
                           this.field_459,
                           var111,
                           var168
                        );
                  }
               } else if (var2[0].equals("PI")) {
                  this.field_421.method_842(Long.parseLong(var2[1]));
                  this.field_421.method_814(Long.parseLong(var2[2]));
                  this.field_421.method_832(Long.parseLong(var2[3]));
                  this.field_421.method_826(Long.parseLong(var2[4]));
                  this.field_421.method_828(Long.parseLong(var2[5]));
                  this.field_421.method_824(Long.parseLong(var2[6]));
                  this.field_421.method_834(Long.parseLong(var2[7]));
                  this.field_421.method_816(Long.parseLong(var2[8]));
                  this.field_421.method_822(Long.parseLong(var2[9]));
                  this.field_421.method_830(Long.parseLong(var2[10]));
                  this.field_421.method_836(Long.parseLong(var2[11]));
                  this.field_421.method_838(Long.parseLong(var2[12]));
                  this.field_421.method_840(Long.parseLong(var2[13]));
                  this.field_553 = new Vector();
               } else if (var2[0].equals("PW")) {
                  this.field_421.method_820(Long.parseLong(var2[1]));
                  this.field_421.method_818(Long.parseLong(var2[2]));
                  if (this.field_421.method_821() > this.field_421.method_819()) {
                     if (this.field_698 == null) {
                        this.field_699 = "You are encumbered!";
                     } else {
                        this.field_698.method_569("You are encumbered!", 16711680, 16711680);
                        this.field_698.method_571((byte)3);
                     }
                  }
               } else if (var2[0].equals("PS")) {
                  long var112 = Long.parseLong(var2[1]);
                  class_7 var203 = this.field_1276.method_30(var112);
                  this.field_553.add(var203);

                  for (int var237 = 0; var237 < this.field_552.size(); var237++) {
                     class_6 var260 = (class_6)this.field_552.get(var237);
                     if (var260.method_33().equalsIgnoreCase(var203.method_45())) {
                        if (var203.method_74() == 0L) {
                           var260.method_36(var203.method_47() + 1L);
                        } else {
                           this.field_552.remove(var237);
                        }
                        break;
                     }
                  }
               } else if (var2[0].equals("AS")) {
                  long var113 = Long.parseLong(var2[1]);
                  class_7 var204 = this.field_1276.method_30(var113);

                  for (int var238 = 0; var238 < this.field_552.size(); var238++) {
                     class_6 var261 = (class_6)this.field_552.get(var238);
                     if (var261.method_33().equalsIgnoreCase(var204.method_45())) {
                        var261.method_36(var204.method_47());
                        var261.method_38(true);
                        class_62.method_563("AS: skill " + var261.method_33() + " learnable");
                        break;
                     }
                  }
               } else if (var2[0].equals("SL")) {
                  long var114 = Long.parseLong(var2[1]);
                  class_7 var205 = this.field_1276.method_30(var114);

                  for (int var239 = 0; var239 < this.field_552.size(); var239++) {
                     class_6 var262 = (class_6)this.field_552.get(var239);
                     if (var262.method_33().equalsIgnoreCase(var205.method_45())) {
                        var262.method_38(false);
                        break;
                     }
                  }

                  this.field_698.method_569("You have successfully learnt skill " + var205.method_45() + " level " + var205.method_47(), 5636448, 5636448);
                  this.field_698.method_571((byte)3);
               } else if (var2[0].equals("LE1")) {
                  long var115 = Long.parseLong(var2[1]);
                  class_7 var206 = this.field_1276.method_30(var115);
                  this.field_698.method_569("You haven't learnt previous level of skill " + var206.method_45(), 5636448, 5636448);
                  this.field_698.method_571((byte)3);
               } else if (var2[0].equals("LE2")) {
                  long var116 = Long.parseLong(var2[1]);
                  class_7 var207 = this.field_1276.method_30(var116);
                  this.field_698.method_569("Your race cannot learn skill " + var207.method_45(), 5636448, 5636448);
                  this.field_698.method_571((byte)3);
               } else if (var2[0].equals("LE3")) {
                  long var117 = Long.parseLong(var2[1]);
                  class_7 var208 = this.field_1276.method_30(var117);
                  this.field_698.method_569("Your level cannot learn skill " + var208.method_45() + " level " + (var208.method_47() - 1L), 5636448, 5636448);
                  this.field_698.method_571((byte)3);
               } else if (var2[0].equals("LE5")) {
                  long var118 = Long.parseLong(var2[1]);
                  class_7 var209 = this.field_1276.method_30(var118);
                  this.field_698.method_569("You haven't trained to learn " + var209.method_68() + " type skill", 5636448, 5636448);
                  this.field_698.method_571((byte)3);
               } else if (var2[0].equals("LE4")) {
                  long var119 = Long.parseLong(var2[1]);
                  class_7 var210 = this.field_1276.method_30(var119);
                  this.field_698
                     .method_569("You don't have enough skill point to learn skill " + var210.method_45() + " level " + var210.method_47(), 5636448, 5636448);
                  this.field_698.method_571((byte)3);
               } else if (var2[0].equals("LE6")) {
                  long var120 = Long.parseLong(var2[1]);
                  class_7 var211 = this.field_1276.method_30(var120);
                  this.field_698.method_569("You have already learnt " + var211.method_45() + " level " + var211.method_47(), 5636448, 5636448);
                  this.field_698.method_571((byte)3);
               } else if (var2[0].equals("O2")) {
                  class_62.method_563("current quest " + var2[1] + ":" + var2[2]);
                  this.field_1272.method_82(Long.parseLong(var2[1]), Long.parseLong(var2[2]), Long.parseLong(var2[3]), "current");
                  this.field_517.add(Long.valueOf(var2[1]));
               } else if (var2[0].equals("O4")) {
                  this.field_1272.method_82(Long.parseLong(var2[1]), Long.parseLong(var2[2]), 2L, "completed");
                  this.field_518.add(Long.valueOf(var2[1]));
               } else if (var2[0].equals("C2")) {
                  int var121 = Integer.parseInt(var2[2]);
                  if (this.field_770 != null) {
                     if (var121 > 0) {
                        Enumeration var169 = this.field_421.field_3064.elements();

                        for (int var212 = 0; var169.hasMoreElements(); var212++) {
                           if (((class_30)var169.nextElement()).method_240() == var121) {
                              if (this.field_421.field_3059[((class_30)this.field_421.field_3064.elementAt(var212)).method_234().method_193()]
                                    .indexOf((class_30)this.field_421.field_3064.elementAt(var212))
                                 == -1) {
                                 this.field_421.field_3059[((class_30)this.field_421.field_3064.elementAt(var212)).method_234().method_193()]
                                    .add(this.field_421.field_3064.elementAt(var212));
                              } else {
                                 ((class_30)this.field_421.field_3059[((class_30)this.field_421.field_3064.elementAt(var212)).method_234().method_193()]
                                       .elementAt(
                                          this.field_421.field_3059[((class_30)this.field_421.field_3064.elementAt(var212)).method_234().method_193()]
                                             .indexOf((class_30)this.field_421.field_3064.elementAt(var212))
                                       ))
                                    .method_235(
                                       ((class_30)this.field_421.field_3059[((class_30)this.field_421.field_3064.elementAt(var212)).method_234().method_193()]
                                                .elementAt(
                                                   this.field_421.field_3059[((class_30)this.field_421.field_3064.elementAt(var212)).method_234().method_193()]
                                                      .indexOf((class_30)this.field_421.field_3064.elementAt(var212))
                                                ))
                                             .method_236()
                                          + 1
                                    );
                              }

                              this.field_421.field_3064.removeElementAt(var212);
                              break;
                           }
                        }

                        this.field_421.field_3064.addElement((class_30)this.field_770.clone());
                        class_30 var240 = (class_30)this.field_421.field_3064.elementAt(this.field_421.field_3064.size() - 1);
                        Icon[][] var263 = var240.method_239(var121, (byte)0);
                        if (var263 != null) {
                           switch (var121) {
                              case 1:
                                 this.field_421.field_3065 = var263;
                                 this.field_421.field_3066 = var240.field_322.method_223();
                                 this.field_421.field_3067 = var240.field_322.method_225();
                                 this.field_421.field_3068 = var240.field_322.method_219();
                                 break;
                              case 2:
                                 this.field_421.field_3069 = var263;
                                 this.field_421.field_3070 = var240.field_322.method_223();
                                 this.field_421.field_3071 = var240.field_322.method_225();
                                 this.field_421.field_3072 = var240.field_322.method_219();
                           }
                        }

                        this.field_770 = null;
                     } else if (var121 == 0 && !this.field_773) {
                        int var170 = this.field_421.field_3059[this.field_770.method_234().method_193()].indexOf(this.field_770);
                        if (var170 == -1) {
                           this.field_770.method_241(0);
                           this.field_421.field_3059[this.field_770.method_234().method_193()].add((class_30)this.field_770.clone());
                        } else {
                           ((class_30)this.field_421.field_3059[this.field_770.method_234().method_193()].elementAt(var170))
                              .method_235(((class_30)this.field_421.field_3059[this.field_770.method_234().method_193()].elementAt(var170)).method_236() + 1);
                        }

                        switch (this.field_770.method_234().method_197()) {
                           case 1:
                              class_85 var213 = this.field_1281.field_1553.method_769(field_1214, field_1215);
                              this.field_421.field_3065 = var213.method_775();
                              this.field_421.field_3066 = var213.method_780();
                              this.field_421.field_3067 = var213.method_781();
                              this.field_421.field_3068 = var213.method_774();
                              break;
                           case 2:
                              class_85 var241 = this.field_1281.field_1553.method_770(field_1214, field_1216);
                              this.field_421.field_3069 = var241.method_775();
                              this.field_421.field_3070 = var241.method_780();
                              this.field_421.field_3071 = var241.method_781();
                              this.field_421.field_3072 = var241.method_774();
                        }

                        this.field_770 = null;
                     }
                  }
               } else if (var2[0].equals("C4")) {
                  int var122 = Integer.parseInt(var2[2]);
                  if (this.field_770 != null) {
                     if (var122 > 0) {
                        int var171 = this.field_421.field_3059[this.field_770.method_234().method_193()].indexOf(this.field_770);
                        if (var171 == -1) {
                           this.field_770.method_241(0);
                           this.field_421.field_3059[this.field_770.method_234().method_193()].add((class_30)this.field_770.clone());
                        } else {
                           ((class_30)this.field_421.field_3059[this.field_770.method_234().method_193()].elementAt(var171))
                              .method_235(((class_30)this.field_421.field_3059[this.field_770.method_234().method_193()].elementAt(var171)).method_236() + 1);
                        }

                        this.field_698.method_569("You cannot equip " + this.field_770.method_234().method_183() + "!", 16711680, 16711680);
                        this.field_698.method_571((byte)3);
                     } else if (var122 == 0 && !this.field_773) {
                        this.field_421.field_3064.addElement((class_30)this.field_770.clone());
                        this.field_770 = null;
                     }
                  }
               } else if (var2[0].equals("C3")) {
                  int var123 = Integer.parseInt(var2[3]);
                  class_90 var172 = (class_90)this.field_399.get(new Long(var2[1]));
                  if (var123 <= 0 || var172 == null) {
                     class_62.method_563("unequip");

                     for (int var216 = 0; var216 < var172.field_3064.size(); var216++) {
                        class_62.method_563("i = " + var216);
                        class_62.method_563("name = " + ((class_30)var172.field_3064.elementAt(var216)).method_234().method_183());
                        class_62.method_563(
                           "((Item)gamer.equip.elementAt(i)).getItemDetails().getID() = "
                              + ((class_30)var172.field_3064.elementAt(var216)).method_234().method_179()
                        );
                        class_62.method_563("Long.parseLong(parts[1]) = " + Long.parseLong(var2[1]));
                        if (((class_30)var172.field_3064.elementAt(var216)).method_234().method_179() == Long.parseLong(var2[2])) {
                           switch (((class_30)var172.field_3064.elementAt(var216)).method_234().method_197()) {
                              case 1:
                                 class_85 var243 = this.field_1281.field_1553.method_769(var172.method_813(), var172.method_844());
                                 var172.field_3065 = var243.method_775();
                                 var172.field_3066 = var243.method_780();
                                 var172.field_3067 = var243.method_781();
                                 var172.field_3068 = var243.method_774();
                                 break;
                              case 2:
                                 class_85 var265 = this.field_1281.field_1553.method_770(var172.method_813(), var172.method_846());
                                 var172.field_3069 = var265.method_775();
                                 var172.field_3070 = var265.method_780();
                                 var172.field_3071 = var265.method_781();
                                 var172.field_3072 = var265.method_774();
                           }

                           class_62.method_563("same and remove");
                           var172.field_3064.removeElementAt(var216);
                        } else {
                           class_62.method_563("not the same");
                        }

                        class_62.method_563("---------------------------------");
                     }
                  } else {
                     class_29 var214 = this.field_1275.method_177(var2[2]);
                     class_30 var242 = new class_30();
                     var242.method_233(var214);
                     var242.method_235(1);
                     Icon[][] var264 = var242.method_239(var123, (byte)0);
                     if (var264 != null) {
                        switch (var123) {
                           case 1:
                              var172.field_3065 = var264;
                              var172.field_3066 = var242.field_322.method_223();
                              var172.field_3067 = var242.field_322.method_225();
                              var172.field_3068 = var242.field_322.method_219();
                              break;
                           case 2:
                              var172.field_3069 = var264;
                              var172.field_3070 = var242.field_322.method_223();
                              var172.field_3071 = var242.field_322.method_225();
                              var172.field_3072 = var242.field_322.method_219();
                        }
                     }

                     var172.field_3064.add(var242);
                     var214 = null;
                  }
               } else if (!var2[0].equals("H3")) {
                  if (var2[0].equals("H2")) {
                     this.field_1040 = true;
                  } else if (var2[0].equals("H4")) {
                     class_30 var124 = new class_30();
                     var124.method_233(this.field_1275.method_177(var2[1]));
                     var124.method_237(Long.parseLong(var2[2]));
                     var124.method_235(Integer.parseInt(var2[3]));
                     this.method_334(var124);
                  } else if (var2[0].equals("H7")) {
                     try {
                        this.field_936.insertString(this.field_936.getLength(), "\n You do not have enough sidos to buy ", field_1274.field_2788);
                        this.field_936.insertString(this.field_936.getLength(), this.field_928.getText() + " " + this.field_932, field_1274.field_2789);
                        this.field_935.setCaretPosition(this.field_936.getLength());
                     } catch (BadLocationException var26) {
                        class_62.method_563(var26.getMessage());
                     }
                  } else if (var2[0].equals("H8")) {
                     try {
                        this.field_936.insertString(this.field_936.getLength(), "\n The shop has inadequate stock for the purchase of ", field_1274.field_2788);
                        this.field_936.insertString(this.field_936.getLength(), this.field_928.getText() + " " + this.field_932, field_1274.field_2789);
                        this.field_935.setCaretPosition(this.field_936.getLength());
                     } catch (BadLocationException var25) {
                        class_62.method_563(var25.getMessage());
                     }

                     Enumeration var125 = this.field_984.elements();

                     for (int var173 = 0; var125.hasMoreElements(); var173++) {
                        class_30 var217 = (class_30)var125.nextElement();
                        if (this.field_931 == var217.method_234().method_179()) {
                           ((class_30)this.field_984.elementAt(var173)).method_235(Integer.parseInt(var2[1]));
                        }
                     }
                  } else if (var2[0].equals("H9")) {
                     try {
                        this.field_936.insertString(this.field_936.getLength(), "\n You bought ", field_1274.field_2786);
                        this.field_936.insertString(this.field_936.getLength(), this.field_928.getText() + " " + this.field_932, field_1274.field_2790);
                        this.field_935.setCaretPosition(this.field_936.getLength());
                     } catch (BadLocationException var24) {
                        class_62.method_563(var24.getMessage());
                     }
                  } else if (var2[0].equals("H10")) {
                     int var126 = Integer.parseInt(var2[3]);
                     int var174 = Integer.parseInt(var2[2]);
                     if (var126 > 0) {
                        var174--;
                     }

                     long var218 = Long.parseLong(var2[1]);
                     boolean var266 = false;

                     for (int var282 = 0; var282 < this.field_421.field_3059.length; var282++) {
                        Enumeration var298 = this.field_421.field_3059[var282].elements();

                        for (int var314 = 0; var298.hasMoreElements(); var314++) {
                           class_30 var327 = (class_30)var298.nextElement();
                           if (var327.method_234().method_179() == var218) {
                              if (var174 > 0) {
                                 ((class_30)this.field_421.field_3059[var282].elementAt(var314)).method_235(var174);
                              } else {
                                 this.field_421.field_3059[var282].remove(var314);
                              }

                              var266 = true;
                              break;
                           }
                        }
                     }

                     if (!var266 && var174 > 0) {
                        class_29 var283 = this.field_1275.method_177(var2[1]);
                        class_30 var299 = new class_30();
                        var299.method_233(var283);
                        var299.method_235(var174);
                        this.field_421.field_3059[var283.method_193()].add(var299);
                        var283 = null;
                     }

                     this.field_435.write("H13\n");
                     this.field_435.flush();
                  } else if (var2[0].equals("H11")) {
                     field_438 = Long.parseLong(var2[1]);
                  } else if (var2[0].equals("H12")) {
                     class_62.method_563("in here");
                     long var127 = Long.parseLong(var2[1]);
                     boolean var219 = false;
                     int var244 = Integer.parseInt(var2[3]);
                     Enumeration var267 = this.field_984.elements();

                     for (int var285 = 0; var267.hasMoreElements(); var285++) {
                        class_30 var300 = (class_30)var267.nextElement();
                        if (var300.method_234().method_179() == var127) {
                           if (var244 <= 0 && var244 != -1) {
                              this.field_984.remove(var285);
                           } else {
                              ((class_30)this.field_984.elementAt(var285)).method_235(var244);
                              ((class_30)this.field_984.elementAt(var285)).method_237(Long.parseLong(var2[2]));
                           }

                           var219 = true;
                           break;
                        }
                     }

                     if (!var219 && (var244 > 0 || var244 == -1)) {
                        class_29 var301 = this.field_1275.method_177(var2[1]);
                        class_30 var315 = new class_30();
                        var315.method_233(var301);
                        var315.method_235(Integer.parseInt(var2[3]));
                        var315.method_237(Long.parseLong(var2[2]));
                        this.field_984.add(var315);
                        var301 = null;
                     }
                  } else if (var2[0].equals("H20")) {
                     try {
                        this.field_936.insertString(this.field_936.getLength(), "\n You do not have ", field_1274.field_2788);
                        this.field_936.insertString(this.field_936.getLength(), this.field_928.getText() + " " + this.field_932, field_1274.field_2789);
                        this.field_936.insertString(this.field_936.getLength(), " to sell ", field_1274.field_2788);
                        this.field_935.setCaretPosition(this.field_936.getLength());
                     } catch (BadLocationException var23) {
                        class_62.method_563(var23.getMessage());
                     }

                     for (int var128 = 0; var128 < this.field_421.field_3059.length; var128++) {
                        Enumeration var175 = this.field_421.field_3059[var128].elements();

                        for (int var220 = 0; var175.hasMoreElements(); var220++) {
                           class_30 var245 = (class_30)var175.nextElement();
                           if (var245.method_234().method_179() == this.field_931) {
                              ((class_30)this.field_421.field_3059[var128].elementAt(var220)).method_235(Integer.parseInt(var2[1]));
                           }
                        }
                     }
                  } else if (var2[0].equals("H21")) {
                     try {
                        this.field_936.insertString(this.field_936.getLength(), "\n You sold ", field_1274.field_2786);
                        this.field_936.insertString(this.field_936.getLength(), this.field_928.getText() + " " + this.field_932, field_1274.field_2790);
                        this.field_935.setCaretPosition(this.field_936.getLength());
                     } catch (BadLocationException var22) {
                        class_62.method_563(var22.getMessage());
                     }
                  } else if (var2[0].equals("H22")) {
                     int var129 = Integer.parseInt(var2[3]);
                     int var176 = Integer.parseInt(var2[2]);
                     if (var129 > 0) {
                        var176--;
                     }

                     long var221 = Long.parseLong(var2[1]);
                     boolean var268 = false;

                     for (int var286 = 0; var286 < this.field_421.field_3059.length; var286++) {
                        Enumeration var303 = this.field_421.field_3059[var286].elements();

                        for (int var316 = 0; var303.hasMoreElements(); var316++) {
                           class_30 var328 = (class_30)var303.nextElement();
                           if (var328.method_234().method_179() == var221) {
                              if (var176 > 0) {
                                 ((class_30)this.field_421.field_3059[var286].elementAt(var316)).method_235(var176);
                              } else {
                                 this.field_421.field_3059[var286].remove(var316);
                              }

                              var268 = true;
                              break;
                           }
                        }
                     }

                     if (!var268 && var176 > 0) {
                        class_29 var287 = this.field_1275.method_177(var2[1]);
                        class_30 var304 = new class_30();
                        var304.method_233(var287);
                        var304.method_235(var176);
                        this.field_421.field_3059[var287.method_193()].add(var304);
                        var287 = null;
                     }
                  } else if (var2[0].equals("H23")) {
                     field_438 = Long.parseLong(var2[1]);
                  } else if (var2[0].equals("H24")) {
                     class_62.method_563("in here");
                     long var130 = Long.parseLong(var2[1]);
                     int var222 = Integer.parseInt(var2[3]);
                     boolean var246 = false;
                     Enumeration var269 = this.field_984.elements();

                     for (int var289 = 0; var269.hasMoreElements(); var289++) {
                        class_30 var305 = (class_30)var269.nextElement();
                        if (var305.method_234().method_179() == var130) {
                           if (var222 <= 0 && var222 != -1) {
                              this.field_984.remove(var289);
                           } else {
                              ((class_30)this.field_984.elementAt(var289)).method_235(var222);
                              ((class_30)this.field_984.elementAt(var289)).method_237(Long.parseLong(var2[2]));
                           }

                           var246 = true;
                           break;
                        }
                     }

                     if (!var246 && (var222 > 0 || var222 == -1)) {
                        class_29 var306 = this.field_1275.method_177(var2[1]);
                        class_30 var317 = new class_30();
                        var317.method_233(var306);
                        var317.method_235(var222);
                        var317.method_237(Long.parseLong(var2[2]));
                        this.field_984.add(var317);
                        var306 = null;
                     }
                  } else if (!var2[0].equals("H14")) {
                     if (var2[0].equals("H15")) {
                        for (int var131 = 0; var131 < this.field_421.field_3059.length; var131++) {
                           Enumeration var177 = this.field_421.field_3059[var131].elements();

                           for (int var223 = 0; var177.hasMoreElements(); var223++) {
                              class_30 var247 = (class_30)var177.nextElement();
                              if (Long.parseLong(var2[1]) == var247.method_234().method_179()) {
                                 ((class_30)this.field_421.field_3059[var131].elementAt(var223)).method_237(Long.parseLong(var2[2]));
                              }
                           }
                        }
                     } else if (var2[0].equals("H27")) {
                        try {
                           this.field_936.insertString(this.field_936.getLength(), "\n Your healing is successful.", field_1274.field_2786);
                           this.field_935.setCaretPosition(this.field_936.getLength());
                        } catch (BadLocationException var21) {
                           class_62.method_563(var21.getMessage());
                        }

                        field_438 = Long.parseLong(var2[3]);
                        this.field_421.method_814(Long.parseLong(var2[1]));
                        this.field_421.method_824(Long.parseLong(var2[2]));
                     } else if (var2[0].equals("H28")) {
                        try {
                           this.field_936
                              .insertString(this.field_936.getLength(), "\n You do not have enough sidos to buy this heal option ", field_1274.field_2788);
                           this.field_935.setCaretPosition(this.field_936.getLength());
                        } catch (BadLocationException var20) {
                           class_62.method_563(var20.getMessage());
                        }
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (long, java.lang.String, javax.swing.Icon[][], int, int, int, javax.swing.Icon[][], int, int, int, int, int, int, int, int, int) void
   void method_482(
      long var1,
      String var3,
      Icon[][] var4,
      int var5,
      int var6,
      int var7,
      Icon[][] var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17
   ) {
      try {
         class_62.method_563("spawning char");
         class_90 var18 = (class_90)this.field_1285.method_553(Class.forName("ad"));
         class_62.method_563("spawn id-" + var1);
         var18.field_3055 = var1;
         class_62.method_563("nick = " + var3);
         var18.field_3056 = var3;
         class_62.method_563("char_nick = " + var18.field_3056);
         var18.field_3053 = this.field_391;
         var18.field_3054 = this.field_392;
         var18.field_3089 = var18.method_852(var12);
         var18.field_3090 = var18.method_853(var13);
         String var19 = (String)this.field_400.get(new Long(var1));
         if (var19 != null) {
            String[] var20 = var19.split("\\|");
            var18.field_3089 = var18.method_852(Integer.parseInt(var20[2]));
            var18.field_3090 = var18.method_853(Integer.parseInt(var20[3]));
            var14 = Integer.parseInt(var20[4]);
         }

         class_62.method_564(var18.field_3089);
         class_62.method_564(var18.field_3090);
         if (var14 > 7) {
            var14 -= 8;
         }

         var18.method_849(var14);
         var18.method_856(30, 43);
         var18.method_857(8, 8);
         var18.method_870(25, 10);
         var18.method_858();
         var18.field_3099 = var18.field_3093;
         var18.field_3100 = var18.field_3094;
         var18.method_812(var15);
         var18.method_845(var16);
         var18.method_847(var17);
         if (var18.field_3055 == field_1212) {
            var18.field_3058 = this.field_435;
            var18.field_3057 = Color.RED;
            var18.method_848(var4, var5, var6, var7, var8, var9, var10, var11, this.field_397, this.field_1281.field_1537, this.field_1281.field_1538);
            this.field_421 = var18;
         } else {
            var18.field_3057 = Color.DARK_GRAY;
            var18.method_848(var4, var5, var6, var7, var8, var9, var10, var11, this.field_396, this.field_1281.field_1537, this.field_1281.field_1538);
         }

         var18.g();
         this.field_399.put(new Long(var1), var18);
         class_62.method_563("before put char in group");
         this.field_420.method_785(var18);
         class_62.method_563("after put char in group");
      } catch (ClassNotFoundException var21) {
         class_62.method_563(var21.getMessage());
      }
   }

   // $VF: renamed from: A (java.lang.Object) void
   void method_483(Object var1) {
      class_62.method_563((String)this.field_1497.elementAt(0));
      class_62.method_564(this.field_1284.method_254("en", 179));
      class_62.method_564(this.field_1284.method_254("en", 180));
      class_62.method_563(MastersOfDestiny.field_2811);
      this.field_428
         .method_805(
            (String)this.field_1497.elementAt(0),
            this.field_1284.method_254("en", 179),
            this.field_1284.method_254("en", 180),
            300,
            92,
            MastersOfDestiny.field_2811,
            this.field_1284.method_253("en", 0) + this.field_1284.method_253("en", 128)
         );
      this.field_428.g();
   }

   // $VF: renamed from: A (java.awt.Graphics) void
   void method_484(Graphics var1) {
      switch (this.field_1301) {
         case 1:
            this.method_460(var1);
            break;
         case 2:
            this.method_437(var1);
            break;
         case 3:
            this.method_425(var1);
            break;
         case 4:
            this.method_415(var1);
            break;
         case 5:
            this.method_293(var1);
         case 6:
         case 9:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 19:
         default:
            break;
         case 7:
            this.method_285(var1);
            break;
         case 8:
            this.method_453(var1);
            break;
         case 10:
            this.method_448(var1);
            break;
         case 11:
            this.method_443(var1);
            break;
         case 18:
            this.method_344(var1);
            break;
         case 20:
            this.method_406(var1);
            break;
         case 21:
            this.method_354(var1);
            break;
         case 22:
            this.method_363(var1);
            break;
         case 23:
            this.method_285(var1);
      }

      this.field_428.method_793(var1, field_1274);
   }

   // $VF: renamed from: m () void
   void method_485() {
      this.method_466((byte)((Integer)this.field_1497.elementAt(1)).intValue(), this.field_1497.elementAt(2));
      this.field_1497.removeAllElements();
      if (this.field_1498 != null) {
         field_1274.remove(this.field_1498);
         this.field_1498 = null;
      } else {
         this.field_428.h();
      }
   }

   // $VF: renamed from: a (java.awt.event.ActionEvent) void
   public void method_486(ActionEvent var1) {
   }

   // $VF: renamed from: a (java.lang.String, byte, java.lang.Object) void
   public void method_487(String var1, byte var2, Object var3) {
      this.field_1497.addElement(var1);
      this.field_1497.addElement(new Integer(var2));
      this.field_1497.addElement(var3);
      this.method_466((byte)13, null);
   }

   // $VF: renamed from: p () void
   private void method_488() {
      this.field_1281.field_1546 = null;
      this.field_1054 = null;
      this.field_1041 = null;
      this.field_1042 = null;
      this.field_1043 = null;
      this.field_1053 = null;
      this.field_1055 = null;
      this.field_1057 = null;
      class_62.method_563("GameStates(clearMemory): Clearing State Data");
   }

   // $VF: renamed from: n () void
   public void method_489() {
   }

   // $VF: renamed from: o () void
   public void method_490() {
   }
}
