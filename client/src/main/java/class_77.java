import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;

// $VF: renamed from: t
public class class_77 extends class_74 {
   // $VF: renamed from: w aa
   private class_57 field_2227;
   // $VF: renamed from: x byte
   private byte field_2228;
   // $VF: renamed from: a boolean
   boolean field_2229;
   // $VF: renamed from: y int
   private int field_2230;
   // $VF: renamed from: z long
   private long field_2231;
   // $VF: renamed from: A long
   private long field_2232;
   // $VF: renamed from: b boolean
   boolean field_2233;
   // $VF: renamed from: c byte
   public final byte field_2234 = 1;
   // $VF: renamed from: d byte
   public final byte field_2235 = 2;
   // $VF: renamed from: e byte
   public final byte field_2236 = 3;
   // $VF: renamed from: f byte
   public final byte field_2237 = 4;
   // $VF: renamed from: g byte
   public final byte field_2238 = 5;
   // $VF: renamed from: h byte
   public final byte field_2239 = 6;
   // $VF: renamed from: i byte
   public final byte field_2240 = 7;
   // $VF: renamed from: j byte
   public final byte field_2241 = 8;
   // $VF: renamed from: k byte
   public final byte field_2242 = 9;
   // $VF: renamed from: B I
   private class_17 field_2243;
   // $VF: renamed from: C javax.swing.Icon
   private Icon field_2244;
   // $VF: renamed from: D javax.swing.Icon
   private Icon field_2245;
   // $VF: renamed from: E javax.swing.Icon
   private Icon field_2246;
   // $VF: renamed from: F javax.swing.Icon
   private Icon field_2247;
   // $VF: renamed from: G int
   private int field_2248;
   // $VF: renamed from: H int
   private int field_2249;
   // $VF: renamed from: I boolean
   private boolean field_2250;
   // $VF: renamed from: J java.lang.String
   private String field_2251;
   // $VF: renamed from: K int
   private int field_2252;
   // $VF: renamed from: L int
   private int field_2253;
   // $VF: renamed from: M int
   private int field_2254;
   // $VF: renamed from: N int
   private int field_2255;
   // $VF: renamed from: O int
   private int field_2256;
   // $VF: renamed from: P int
   private int field_2257;
   // $VF: renamed from: Q ai
   private class_63 field_2258;
   // $VF: renamed from: R int
   private int field_2259;
   // $VF: renamed from: S int[]
   private int[] field_2260;
   // $VF: renamed from: T int
   private int field_2261;
   // $VF: renamed from: U int
   private int field_2262;
   // $VF: renamed from: V int
   private int field_2263;
   // $VF: renamed from: W javax.swing.Icon
   private Icon field_2264;
   // $VF: renamed from: X int
   private int field_2265;
   // $VF: renamed from: Y int
   private int field_2266;
   // $VF: renamed from: Z int
   private int field_2267;
   // $VF: renamed from: aa int
   private int field_2268;
   // $VF: renamed from: ab boolean
   private boolean field_2269;
   // $VF: renamed from: ac int
   private int field_2270;
   // $VF: renamed from: ad int
   private int field_2271;
   // $VF: renamed from: ae int
   private int field_2272;
   // $VF: renamed from: af int
   private int field_2273;
   // $VF: renamed from: ag javax.swing.Icon
   private Icon field_2274;
   // $VF: renamed from: ah javax.swing.Icon
   private Icon field_2275;
   // $VF: renamed from: ai int
   private int field_2276;
   // $VF: renamed from: aj int
   private int field_2277;
   // $VF: renamed from: ak javax.swing.Icon
   private Icon field_2278;
   // $VF: renamed from: al javax.swing.Icon
   private Icon field_2279;
   // $VF: renamed from: am int
   private int field_2280;
   // $VF: renamed from: an int
   private int field_2281;
   // $VF: renamed from: ao byte
   private final byte field_2282 = 0;
   // $VF: renamed from: ap byte
   private final byte field_2283 = 1;
   // $VF: renamed from: aq byte
   private final byte field_2284 = 2;
   // $VF: renamed from: ar byte
   private final byte field_2285 = 3;
   // $VF: renamed from: as byte
   private final byte field_2286 = 4;
   // $VF: renamed from: at byte
   private byte field_2287;
   // $VF: renamed from: au boolean
   private boolean field_2288;
   // $VF: renamed from: av int
   private int field_2289;
   // $VF: renamed from: aw int
   private int field_2290;
   // $VF: renamed from: ax byte
   private byte field_2291;
   // $VF: renamed from: ay boolean
   private boolean field_2292;
   // $VF: renamed from: az int
   private int field_2293;
   // $VF: renamed from: aA int
   private int field_2294;
   // $VF: renamed from: aB byte
   private byte field_2295;
   // $VF: renamed from: aC boolean
   private boolean field_2296;
   // $VF: renamed from: aD int
   private int field_2297;
   // $VF: renamed from: aE int
   private int field_2298;
   // $VF: renamed from: aF byte
   private byte field_2299;
   // $VF: renamed from: aG boolean
   private boolean field_2300;
   // $VF: renamed from: aH int
   private int field_2301;
   // $VF: renamed from: aI int
   private int field_2302;
   // $VF: renamed from: aJ byte
   private byte field_2303;
   // $VF: renamed from: aK boolean
   private boolean field_2304;
   // $VF: renamed from: aL int
   private int field_2305;
   // $VF: renamed from: aM int
   private int field_2306;
   // $VF: renamed from: aN byte
   private byte field_2307;
   // $VF: renamed from: aO boolean
   private boolean field_2308;
   // $VF: renamed from: aP int
   private int field_2309;
   // $VF: renamed from: aQ int
   private int field_2310;
   // $VF: renamed from: aR byte
   private byte field_2311;
   // $VF: renamed from: aS boolean
   private boolean field_2312;
   // $VF: renamed from: aT int
   private int field_2313;
   // $VF: renamed from: aU int
   private int field_2314;
   // $VF: renamed from: aV javax.swing.Icon
   private Icon field_2315;
   // $VF: renamed from: aW int
   private int field_2316;
   // $VF: renamed from: aX int
   private int field_2317;
   // $VF: renamed from: aY javax.swing.Icon
   private Icon field_2318;
   // $VF: renamed from: aZ int
   private int field_2319;
   // $VF: renamed from: ba int
   private int field_2320;
   // $VF: renamed from: bb int
   private int field_2321;
   // $VF: renamed from: bc int[]
   private int[] field_2322;
   // $VF: renamed from: bd int
   private final int field_2323 = 0;
   // $VF: renamed from: be int
   private final int field_2324 = 1;
   // $VF: renamed from: bf int
   private int field_2325;
   // $VF: renamed from: bg int
   private int field_2326;
   // $VF: renamed from: bh int
   private int field_2327;
   // $VF: renamed from: bi ak
   private class_87 field_2328;
   // $VF: renamed from: bj byte
   private final byte field_2329 = 0;
   // $VF: renamed from: bk byte
   private final byte field_2330 = 1;
   // $VF: renamed from: bl int
   private int field_2331;
   // $VF: renamed from: bm int
   private int field_2332;
   // $VF: renamed from: bn int
   private int field_2333;
   // $VF: renamed from: bo int
   private int field_2334;
   // $VF: renamed from: bp int
   private int field_2335;
   // $VF: renamed from: bq int
   private int field_2336;
   // $VF: renamed from: br int[]
   private int[] field_2337;
   // $VF: renamed from: bs int[]
   private int[] field_2338;
   // $VF: renamed from: bt int[]
   private int[] field_2339;
   // $VF: renamed from: bu int[]
   private int[] field_2340;
   // $VF: renamed from: bv int[]
   private int[] field_2341;
   // $VF: renamed from: bw int[]
   private int[] field_2342;
   // $VF: renamed from: bx int
   private int field_2343;
   // $VF: renamed from: by int
   private int field_2344;
   // $VF: renamed from: bz java.util.Vector
   private Vector field_2345;
   // $VF: renamed from: bA av
   private class_30 field_2346;
   // $VF: renamed from: bB int
   private int field_2347;
   // $VF: renamed from: bC int
   private int field_2348;
   // $VF: renamed from: bD av
   private class_30 field_2349;
   // $VF: renamed from: bE int
   private int field_2350;
   // $VF: renamed from: bF int
   private int field_2351;
   // $VF: renamed from: bG boolean
   private boolean field_2352;
   // $VF: renamed from: bH long
   private long field_2353;
   // $VF: renamed from: bI int
   private int field_2354;
   // $VF: renamed from: bJ int
   private int field_2355;
   // $VF: renamed from: l ai
   class_63 field_2356;
   // $VF: renamed from: m int
   int field_2357;
   // $VF: renamed from: n int
   int field_2358;
   // $VF: renamed from: o int
   int field_2359;
   // $VF: renamed from: p int
   int field_2360;
   // $VF: renamed from: q int
   int field_2361;
   // $VF: renamed from: r int
   int field_2362;
   // $VF: renamed from: bK int
   private int field_2363;
   // $VF: renamed from: bL java.lang.String
   private String field_2364;
   // $VF: renamed from: bM int
   private int field_2365;
   // $VF: renamed from: bN int
   private int field_2366;
   // $VF: renamed from: bO int
   private int field_2367;
   // $VF: renamed from: bP int
   private int field_2368;
   // $VF: renamed from: bQ int
   private int field_2369;
   // $VF: renamed from: bR int
   private int field_2370;
   // $VF: renamed from: bS javax.swing.Icon
   private Icon field_2371;
   // $VF: renamed from: bT int
   private int field_2372;
   // $VF: renamed from: bU int
   private int field_2373;
   // $VF: renamed from: bV int
   private int field_2374;
   // $VF: renamed from: bW int
   private int field_2375;
   // $VF: renamed from: bX int
   private int field_2376;
   // $VF: renamed from: bY int
   private int field_2377;
   // $VF: renamed from: bZ javax.swing.Icon
   private Icon field_2378;
   // $VF: renamed from: ca javax.swing.Icon
   private Icon field_2379;
   // $VF: renamed from: cb int
   private int field_2380;
   // $VF: renamed from: cc int
   private int field_2381;
   // $VF: renamed from: cd int
   private int field_2382;
   // $VF: renamed from: ce int
   private int field_2383;
   // $VF: renamed from: cf int
   private int field_2384;
   // $VF: renamed from: cg int
   private int field_2385;
   // $VF: renamed from: ch int
   private int field_2386;
   // $VF: renamed from: ci int
   private int field_2387;
   // $VF: renamed from: cj javax.swing.Icon
   private Icon field_2388;
   // $VF: renamed from: ck int
   private int field_2389;
   // $VF: renamed from: cl int
   private int field_2390;
   // $VF: renamed from: cm int
   private int field_2391;
   // $VF: renamed from: cn int
   private int field_2392;
   // $VF: renamed from: co long
   private long field_2393;
   // $VF: renamed from: cp boolean
   private boolean field_2394;
   // $VF: renamed from: cq javax.swing.Icon
   private Icon field_2395;
   // $VF: renamed from: cr int
   private int field_2396;
   // $VF: renamed from: cs int
   private int field_2397;
   // $VF: renamed from: ct int
   private int field_2398;
   // $VF: renamed from: cu int
   private int field_2399;
   // $VF: renamed from: cv int
   private int field_2400;
   // $VF: renamed from: cw int
   private int field_2401;
   // $VF: renamed from: cx java.util.Hashtable
   private Hashtable field_2402;
   // $VF: renamed from: cy java.util.Hashtable
   private Hashtable field_2403;
   // $VF: renamed from: cz long[]
   private long[] field_2404;
   // $VF: renamed from: cA long[]
   private long[] field_2405;
   // $VF: renamed from: cB ai
   private class_63 field_2406;
   // $VF: renamed from: cC int
   private int field_2407;
   // $VF: renamed from: cD int
   private int field_2408;
   // $VF: renamed from: cE int
   private int field_2409;
   // $VF: renamed from: cF int[]
   private int[] field_2410;
   // $VF: renamed from: cG int
   private int field_2411;
   // $VF: renamed from: cH int
   private int field_2412;
   // $VF: renamed from: cI int
   private int field_2413;
   // $VF: renamed from: cJ int
   private int field_2414;
   // $VF: renamed from: cK int
   private int field_2415;
   // $VF: renamed from: cL int
   private int field_2416;
   // $VF: renamed from: s boolean
   boolean field_2417;
   // $VF: renamed from: cM javax.swing.Icon
   private Icon field_2418;
   // $VF: renamed from: cN int
   private static int field_2419;
   // $VF: renamed from: cO int
   private static int field_2420;
   // $VF: renamed from: cP int
   private static int field_2421;
   // $VF: renamed from: cQ int
   private static int field_2422;
   // $VF: renamed from: cR int
   private int field_2423;
   // $VF: renamed from: cS int
   private int field_2424;
   // $VF: renamed from: cT javax.swing.Icon
   private Icon field_2425;
   // $VF: renamed from: cU boolean
   private boolean field_2426;
   // $VF: renamed from: cV javax.swing.Icon
   private Icon field_2427;
   // $VF: renamed from: cW long[][]
   private long[][] field_2428;
   // $VF: renamed from: cX javax.swing.Icon
   private Icon field_2429;
   // $VF: renamed from: cY long[][]
   private long[][] field_2430;
   // $VF: renamed from: cZ javax.swing.Icon
   private Icon field_2431;
   // $VF: renamed from: da long[][]
   private long[][] field_2432;
   // $VF: renamed from: db long[][]
   private long[][] field_2433;
   // $VF: renamed from: dc java.util.ArrayList
   private ArrayList field_2434;
   // $VF: renamed from: dd aV
   private class_97 field_2435;
   // $VF: renamed from: de javax.swing.Icon
   private Icon field_2436;
   // $VF: renamed from: df int
   private int field_2437;
   // $VF: renamed from: dg int
   private int field_2438;
   // $VF: renamed from: dh javax.swing.Icon
   private Icon field_2439;
   // $VF: renamed from: di int
   private int field_2440;
   // $VF: renamed from: dj int
   private int field_2441;
   // $VF: renamed from: dk boolean
   private boolean field_2442;
   // $VF: renamed from: dl long
   private long field_2443;
   // $VF: renamed from: t byte
   byte field_2444;
   // $VF: renamed from: u byte
   byte field_2445;
   // $VF: renamed from: dm int
   private int field_2446;
   // $VF: renamed from: dn int
   private int field_2447;
   // $VF: renamed from: do long
   private long field_2448;
   // $VF: renamed from: dp int
   private final int field_2449 = 300;
   // $VF: renamed from: v GameStates
   GameStates field_2450;
   // $VF: renamed from: dq java.util.Vector
   private Vector field_2451 = new Vector();
   // $VF: renamed from: dr int
   private int field_2452;
   // $VF: renamed from: ds long
   private long field_2453;
   // $VF: renamed from: dt int
   private final int field_2454 = 30;
   // $VF: renamed from: du boolean
   private boolean field_2455;

   public class_77(GameStates var1) {
      this.field_2450 = var1;
   }

   // $VF: renamed from: a (aa, long) void
   @Override
   public void method_670(class_57 var1, long var2) {
      class_62.method_563("in mission state");
      this.field_2227 = var1;
      this.field_2228 = 22;
      this.field_2402 = ((class_78)var1.field_1546[0]).field_2465;
      this.field_2403 = ((class_78)var1.field_1546[0]).field_2466;
      this.field_2229 = false;
      this.field_2231 = -1L;
      this.field_2232 = -1L;
      this.field_2230 = -1;
      this.field_2233 = false;
      this.field_2243 = ((class_78)var1.field_1546[0]).field_2464;
      this.field_2244 = new ImageIcon(this.getClass().getResource("res/missions/missionmap01_tiles.png"));
      var1.field_1545.field_2793.setBounds(24, 572, 310, 21);
      var1.field_1545.field_2793.setBorder(BorderFactory.createLineBorder(new Color(14870248)));
      var1.field_1545.add(var1.field_1545.field_2793);
      this.field_2252 = var1.method_502("en", 640);
      this.field_2253 = var1.method_502("en", 641);
      this.field_2254 = var1.method_502("en", 642);
      this.field_2255 = var1.method_502("en", 643);
      this.field_2256 = var1.method_502("en", 644);
      this.field_2257 = var1.method_502("en", 645);
      this.field_2258 = new class_63();
      this.field_2258.method_567(30, 477, 340, 51, MastersOfDestiny.field_2845, MastersOfDestiny.field_2846);
      this.field_2406 = new class_63();
      this.field_2406.method_567(209, 144, 385, 106, MastersOfDestiny.field_2808, MastersOfDestiny.field_2809);
      this.field_2407 = var1.method_502("en", 1152);
      this.field_2408 = var1.method_502("en", 1153);
      this.field_2409 = var1.method_502("en", 1154);
      this.field_2410 = var1.method_503("en", 1155);
      this.field_2411 = var1.method_502("en", 1156);
      this.field_2412 = var1.method_502("en", 1157);
      this.field_2413 = var1.method_502("en", 1158);
      this.field_2414 = var1.method_502("en", 1159);
      this.field_2415 = var1.method_502("en", 1160);
      this.field_2416 = var1.method_502("en", 1161);
      this.field_2417 = false;
      this.field_2418 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1162)));
      this.field_2259 = 0;
      this.field_2260 = var1.method_503("en", 207);
      this.field_2261 = var1.method_502("en", 725);
      this.field_2262 = var1.method_502("en", 209);
      this.field_2263 = var1.method_502("en", 210);
      this.field_2264 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 609)));
      this.field_2265 = var1.method_502("en", 318);
      this.field_2266 = var1.method_502("en", 319);
      this.field_2267 = var1.method_502("en", 320);
      this.field_2268 = var1.method_502("en", 321);
      this.field_2269 = false;
      this.field_2270 = var1.method_502("en", 635);
      this.field_2271 = var1.method_502("en", 637);
      this.field_2272 = var1.method_502("en", 638);
      this.field_2273 = var1.method_502("en", 639);
      this.field_2436 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1298)));
      this.field_2437 = var1.method_502("en", 1299);
      this.field_2438 = var1.method_502("en", 1300);
      this.field_2274 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 606)));
      this.field_2275 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 605)));
      this.field_2276 = var1.method_502("en", 548);
      this.field_2277 = var1.method_502("en", 549);
      this.field_2278 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 608)));
      this.field_2279 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 607)));
      this.field_2280 = var1.method_502("en", 550);
      this.field_2281 = var1.method_502("en", 551);
      this.field_2287 = 4;
      this.field_2288 = false;
      this.field_2289 = var1.method_502("en", 552);
      this.field_2290 = var1.method_502("en", 553);
      this.field_2291 = 4;
      this.field_2292 = false;
      this.field_2293 = var1.method_502("en", 554);
      this.field_2294 = var1.method_502("en", 555);
      this.field_2295 = 4;
      this.field_2296 = false;
      this.field_2297 = var1.method_502("en", 558);
      this.field_2298 = var1.method_502("en", 559);
      this.field_2299 = 4;
      this.field_2300 = false;
      this.field_2301 = var1.method_502("en", 560);
      this.field_2302 = var1.method_502("en", 561);
      this.field_2303 = 4;
      this.field_2304 = false;
      this.field_2305 = var1.method_502("en", 562);
      this.field_2306 = var1.method_502("en", 563);
      this.field_2307 = 4;
      this.field_2308 = false;
      this.field_2309 = var1.method_502("en", 564);
      this.field_2310 = var1.method_502("en", 565);
      this.field_2311 = 4;
      this.field_2312 = false;
      this.field_2313 = var1.method_502("en", 556);
      this.field_2314 = var1.method_502("en", 557);
      this.field_2315 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 618)));
      this.field_2316 = var1.method_502("en", 619);
      this.field_2317 = var1.method_502("en", 620);
      this.field_2318 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 611)));
      this.field_2319 = var1.method_502("en", 612);
      this.field_2320 = var1.method_502("en", 613);
      this.field_2321 = var1.method_502("en", 625);
      this.field_2322 = new int[2];
      this.field_2322[0] = var1.method_502("en", 626);
      this.field_2322[1] = var1.method_502("en", 627);
      this.field_2325 = var1.method_502("en", 628);
      this.field_2326 = var1.method_502("en", 629);
      this.field_2327 = 0;
      this.field_2328 = class_87.method_803();
      this.field_2328.method_804((byte)2);
      this.field_2328.g();
      this.field_2335 = 150;
      this.field_2336 = 17;
      this.field_2337 = null;
      this.field_2338 = null;
      this.field_2339 = var1.method_503("en", 621);
      this.field_2340 = var1.method_503("en", 622);
      this.field_2341 = var1.method_503("en", 616);
      this.field_2342 = var1.method_503("en", 617);
      this.field_2347 = var1.method_502("en", 614);
      this.field_2348 = var1.method_502("en", 615);
      this.field_2343 = var1.method_502("en", 623);
      this.field_2344 = var1.method_502("en", 624);
      this.field_2345 = new Vector();
      this.field_2349 = null;
      this.field_2350 = 0;
      this.field_2351 = 0;
      this.field_2352 = true;
      this.field_2363 = 0;
      this.field_2354 = var1.method_502("en", 541);
      this.field_2355 = var1.method_502("en", 542);
      this.method_708();
      this.field_2443 = 0L;
      this.field_2357 = var1.method_502("en", 908);
      this.field_2358 = var1.method_502("en", 909);
      this.field_2359 = var1.method_502("en", 910);
      this.field_2360 = var1.method_502("en", 911);
      this.field_2361 = var1.method_502("en", 912);
      this.field_2362 = var1.method_502("en", 913);
      this.field_2356 = new class_63();
      this.field_2356.method_567(30, 434, 340, 34, MastersOfDestiny.field_2810, MastersOfDestiny.field_2811);
      this.field_2356.method_569("Waiting for new turn...", 0, 0);
      this.field_2356.method_571((byte)3);
      this.field_2245 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 905)));
      this.field_2246 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 904)));
      this.field_2247 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 881)));
      this.field_2248 = -1;
      this.field_2249 = -1;
      this.field_2365 = var1.method_502("en", 577);
      this.field_2366 = var1.method_502("en", 578);
      this.field_2367 = var1.method_502("en", 579);
      this.field_2368 = var1.method_502("en", 580);
      this.field_2369 = var1.method_502("en", 581);
      this.field_2370 = var1.method_502("en", 582);
      this.field_2371 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 583)));
      this.field_2372 = var1.method_502("en", 584);
      this.field_2373 = var1.method_502("en", 585);
      this.field_2374 = var1.method_502("en", 586);
      this.field_2375 = var1.method_502("en", 587);
      this.field_2376 = var1.method_502("en", 588);
      this.field_2377 = var1.method_502("en", 589);
      this.field_2378 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 590)));
      this.field_2379 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 591)));
      this.field_2380 = var1.method_502("en", 592);
      this.field_2381 = var1.method_502("en", 593);
      this.field_2382 = var1.method_502("en", 594);
      this.field_2383 = var1.method_502("en", 595);
      this.field_2384 = var1.method_502("en", 596);
      this.field_2385 = var1.method_502("en", 597);
      this.field_2386 = var1.method_502("en", 598);
      this.field_2387 = var1.method_502("en", 599);
      this.field_2388 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 600)));
      this.field_2389 = var1.method_502("en", 601);
      this.field_2390 = var1.method_502("en", 602);
      this.field_2391 = var1.method_502("en", 603);
      this.field_2392 = var1.method_502("en", 604);
      this.field_2395 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 646)));
      this.field_2396 = 250;
      this.field_2397 = 254;
      this.field_2398 = 334;
      this.field_2399 = 313;
      this.field_2400 = 131;
      this.field_2401 = 19;
      field_2419 = var1.method_502("en", 536);
      field_2420 = var1.method_502("en", 537);
      field_2421 = var1.method_502("en", 538);
      field_2422 = var1.method_502("en", 539);
      int var4 = ((class_64)this.field_2403.get(var1.field_1527)).field_1717;
      int var5 = ((class_64)this.field_2403.get(var1.field_1527)).field_1718;
      this.field_2423 = this.field_2243.method_125(var4, var5).method_168();
      this.field_2424 = this.field_2243.method_125(var4, var5).method_170();
      this.field_2425 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 566)));
      this.field_2426 = false;
      this.field_2427 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 567)));
      this.field_2428 = (long[][])(new class_16[this.field_2243.method_134()][this.field_2243.method_135()]);
      this.field_2429 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 568)));
      this.field_2430 = (long[][])(new class_16[this.field_2243.method_134()][this.field_2243.method_135()]);
      this.field_2431 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 569)));
      this.field_2432 = (long[][])(new class_16[this.field_2243.method_134()][this.field_2243.method_135()]);
      this.field_2433 = (long[][])(new class_16[this.field_2243.method_134()][this.field_2243.method_135()]);
      this.method_716();
      this.method_718();
      this.method_722();
      this.method_720();
      this.field_2435 = new class_97(this.field_2243, this.field_2243.method_134() * this.field_2243.method_135());
      this.field_2434 = new ArrayList(this.field_2243.method_134() * this.field_2243.method_135());
      this.field_2439 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 572)));
      this.field_2442 = false;
      ((class_78)var1.field_1546[0]).field_2462++;
      class_62.method_563("current stage = " + ((class_78)var1.field_1546[0]).field_2462);
      class_62.method_563("max stage = " + ((class_78)var1.field_1546[0]).field_2463);
      class_62.method_563("finish splash = " + this.field_2229);
      this.field_2444 = 0;
      this.field_2445 = -1;
      class_62.method_563("mission state finish entering");
   }

   // $VF: renamed from: b (aa, long) int
   @Override
   public int method_671(class_57 var1, long var2) {
      this.method_710(var2);
      Enumeration var4 = this.field_2402.elements();

      while (var4.hasMoreElements()) {
         class_64 var5 = (class_64)var4.nextElement();
         byte var6 = var5.method_580(System.currentTimeMillis());
         if (var6 == 1) {
            this.field_2440 = this.field_2243.method_125(var5.field_1717, var5.field_1718).method_168();
            this.field_2441 = this.field_2243.method_125(var5.field_1717, var5.field_1718).method_170();
            this.field_2243.method_125(var5.field_1717, var5.field_1718).method_161(false);
            this.field_2243.method_125(var5.field_1717, var5.field_1718).method_163(false);
         }

         if (var6 != 0) {
            this.field_2444++;
            class_62.method_563("monster update animationDone: " + this.field_2444 + " / " + this.field_2445);
            if (this.field_2444 >= this.field_2445) {
               if (this.field_2404 != null || this.field_2405 != null) {
                  Enumeration var7 = this.field_2402.elements();

                  while (var7.hasMoreElements()) {
                     ((class_64)var7.nextElement()).method_588();
                  }

                  var7 = this.field_2403.elements();

                  while (var7.hasMoreElements()) {
                     ((class_64)var7.nextElement()).method_588();
                  }
               }

               this.field_2404 = null;
               this.field_2405 = null;
               this.method_704(class_68.method_625());
               this.field_2426 = false;
            }
         }
      }

      Enumeration var9 = this.field_2403.elements();

      while (var9.hasMoreElements()) {
         class_64 var10 = (class_64)var9.nextElement();
         byte var12 = var10.method_580(System.currentTimeMillis());
         if (var12 == 1) {
            this.field_2440 = this.field_2243.method_125(var10.field_1717, var10.field_1718).method_168();
            this.field_2441 = this.field_2243.method_125(var10.field_1717, var10.field_1718).method_170();
            this.field_2243.method_125(var10.field_1717, var10.field_1718).method_161(false);
            this.field_2243.method_125(var10.field_1717, var10.field_1718).method_163(false);
         }

         if (var12 == 5) {
            ((class_65)var10).method_608(this.field_2227);
         }

         if (var12 != 0) {
            this.field_2444++;
            class_62.method_563("player update animationDone: " + this.field_2444 + " / " + this.field_2445);
            if (this.field_2444 >= this.field_2445) {
               if (this.field_2404 != null || this.field_2405 != null) {
                  Enumeration var8 = this.field_2402.elements();

                  while (var8.hasMoreElements()) {
                     ((class_64)var8.nextElement()).method_588();
                  }

                  var8 = this.field_2403.elements();

                  while (var8.hasMoreElements()) {
                     ((class_64)var8.nextElement()).method_588();
                  }
               }

               this.field_2404 = null;
               this.field_2405 = null;
               this.method_704(class_68.method_625());
               this.field_2426 = false;
            }
         }
      }

      if (this.field_2443 != 0L && System.currentTimeMillis() - this.field_2443 > 30000L) {
         this.field_2450.method_353(this.field_2227.field_1523, this.field_2227.field_1524);
         this.field_2228 = 27;
      }

      return this.field_2228;
   }

   // $VF: renamed from: a (byte) void
   @Override
   public void method_672(byte var1) {
   }

   // $VF: renamed from: a (java.awt.Graphics, MastersOfDestiny) void
   @Override
   public void method_673(Graphics var1, MastersOfDestiny var2) {
      if (!this.field_2229) {
         ((class_78)this.field_2227.field_1546[0]).method_673(var1, var2);
         if (((class_78)this.field_2227.field_1546[0]).field_2462 == ((class_78)this.field_2227.field_1546[0]).field_2463) {
            this.field_2229 = true;
            this.method_704(class_68.method_626());
         }
      } else {
         this.field_2243.method_124(var1, var2);

         for (int var3 = 0; var3 < this.field_2243.method_134(); var3++) {
            for (int var4 = 0; var4 < this.field_2243.method_135(); var4++) {
               class_27 var5 = this.field_2243.method_125(var3, var4);
               Icon var6 = var5.method_156();
               if (var6 != null && (var5.method_160() || var5.method_154() != null)) {
                  int var7 = var5.method_172() - var6.getIconWidth() / 2;
                  int var8 = var5.method_174() + 16 - var6.getIconHeight();
                  var6.paintIcon(var2, var1, var7, var8);
               }
            }
         }

         if (this.field_2442) {
            this.field_2439.paintIcon(var2, var1, this.field_2440, this.field_2441);
         }

         for (int var19 = 0; var19 < this.field_2428.length; var19++) {
            for (int var24 = 0; var24 < this.field_2428[0].length; var24++) {
               if (this.field_2428[var19][var24] > 0L) {
                  this.field_2427
                     .paintIcon(var2, var1, this.field_2243.method_125(var19, var24).method_168(), this.field_2243.method_125(var19, var24).method_170());
               }
            }
         }

         for (int var20 = 0; var20 < this.field_2430.length; var20++) {
            for (int var25 = 0; var25 < this.field_2430[0].length; var25++) {
               if (this.field_2430[var20][var25] > 0L) {
                  this.field_2429
                     .paintIcon(var2, var1, this.field_2243.method_125(var20, var25).method_168(), this.field_2243.method_125(var20, var25).method_170());
               }
            }
         }

         for (int var21 = 0; var21 < this.field_2432.length; var21++) {
            for (int var26 = 0; var26 < this.field_2432.length; var26++) {
               if (this.field_2432[var21][var26] > 0L
                  && (
                     this.field_2243.method_125(var21, var26).method_168() != this.field_2440
                        || this.field_2441 != this.field_2243.method_125(var21, var26).method_170()
                  )) {
                  this.field_2431
                     .paintIcon(var2, var1, this.field_2243.method_125(var21, var26).method_168(), this.field_2243.method_125(var21, var26).method_170());
               }
            }
         }

         for (int var22 = 0; var22 < this.field_2433.length; var22++) {
            for (int var27 = 0; var27 < this.field_2433.length; var27++) {
               if (this.field_2433[var22][var27] > 0L
                  && (
                     this.field_2243.method_125(var22, var27).method_168() != this.field_2440
                        || this.field_2441 != this.field_2243.method_125(var22, var27).method_170()
                  )) {
                  this.field_2431
                     .paintIcon(var2, var1, this.field_2243.method_125(var22, var27).method_168(), this.field_2243.method_125(var22, var27).method_170());
               }
            }
         }

         if (this.field_2423 != 0 && this.field_2424 != 0) {
            this.field_2425.paintIcon(var2, var1, this.field_2423, this.field_2424);
         }

         var1.setFont(MastersOfDestiny.field_2819);
         var1.setColor(new Color(11594998));
         var1.drawString(
            "" + this.field_2452,
            this.field_2354 - MastersOfDestiny.field_2820.stringWidth("" + this.field_2452) / 2,
            this.field_2355 + MastersOfDestiny.field_2820.getHeight() / 4
         );
         var1.setFont(MastersOfDestiny.field_2841);
         var1.setColor(Color.BLACK);
         int var23 = ((class_65)this.field_2403.get(this.field_2227.field_1527)).A;

         try {
            Map var28 = Collections.synchronizedMap(new TreeMap(new class_16(this)));
            Enumeration var33 = this.field_2402.elements();

            while (var33.hasMoreElements()) {
               class_66 var41 = (class_66)var33.nextElement();
               Vector var50 = new Vector();
               var50.add(var41);
               Object var62 = var28.put(new Integer(var41.S), var50);
               if (var62 != null) {
                  if (var62.getClass() != Class.forName("aS") && var62.getClass() != Class.forName("aH") && var62.getClass() != Class.forName("ab")) {
                     Vector var9 = (Vector)var62;
                     Enumeration var10 = var9.elements();

                     while (var10.hasMoreElements()) {
                        Object var11 = var10.nextElement();
                        if (var11.getClass() == Class.forName("aS") || var11.getClass() == Class.forName("aH")) {
                           class_64 var12 = (class_64)var11;
                           if (var12.field_1722.length > 1) {
                              var50.add((class_65)var12);
                           } else {
                              var50.add((class_66)var12);
                           }
                        } else if (var11.getClass() == Class.forName("ab")) {
                           var50.add((class_27)var11);
                        }
                     }
                  } else {
                     var50.add(var62);
                  }

                  var28.put(new Integer(var41.S), var50);
               }
            }

            Enumeration var42 = this.field_2403.elements();

            while (var42.hasMoreElements()) {
               class_65 var51 = (class_65)var42.nextElement();
               Vector var63 = new Vector();
               var63.add(var51);
               Object var71 = var28.put(new Integer(var51.S), var63);
               if (var71 != null) {
                  if (var71.getClass() != Class.forName("aS") && var71.getClass() != Class.forName("aH") && var71.getClass() != Class.forName("ab")) {
                     Vector var81 = (Vector)var71;
                     Enumeration var89 = var81.elements();

                     while (var89.hasMoreElements()) {
                        Object var98 = var89.nextElement();
                        if (var98.getClass() == Class.forName("aS") || var98.getClass() == Class.forName("aH")) {
                           class_64 var13 = (class_64)var98;
                           if (var13.field_1722.length > 1) {
                              var63.add((class_65)var13);
                           } else {
                              var63.add((class_66)var13);
                           }
                        } else if (var98.getClass() == Class.forName("ab")) {
                           var63.add((class_27)var98);
                        }
                     }
                  } else {
                     var63.add(var71);
                  }

                  var28.put(new Integer(var51.S), var63);
               }
            }

            for (int var52 = 0; var52 < this.field_2243.method_134(); var52++) {
               for (int var64 = 0; var64 < this.field_2243.method_135(); var64++) {
                  class_27 var72 = this.field_2243.method_125(var52, var64);
                  Icon var82 = var72.method_156();
                  if (var82 != null && !var72.method_160() && var72.method_154() == null) {
                     Vector var90 = new Vector();
                     var90.add(var72);
                     Object var99 = var28.put(new Integer(var72.field_170), var90);
                     if (var99 != null) {
                        if (var99.getClass() != Class.forName("aS") && var99.getClass() != Class.forName("aH") && var99.getClass() != Class.forName("ab")) {
                           Vector var104 = (Vector)var99;
                           Enumeration var14 = var104.elements();

                           while (var14.hasMoreElements()) {
                              Object var15 = var14.nextElement();
                              if (var15.getClass() == Class.forName("aS") || var15.getClass() == Class.forName("aH")) {
                                 class_64 var16 = (class_64)var15;
                                 if (var16.field_1722.length > 1) {
                                    var90.add((class_65)var16);
                                 } else {
                                    var90.add((class_66)var16);
                                 }
                              } else if (var15.getClass() == Class.forName("ab")) {
                                 var90.add((class_27)var15);
                              }
                           }
                        } else {
                           var90.add(var99);
                        }

                        var28.put(new Integer(var72.field_170), var90);
                     }
                  }
               }
            }

            for (Object var65 : var28.values()) {
               if (var65.getClass() == Class.forName("aS")) {
                  ((class_66)var65).method_613(var1, var2);
               } else if (var65.getClass() == Class.forName("aH")) {
                  ((class_65)var65).method_609(var1, var2, var23);
               } else if (var65.getClass() == Class.forName("ab")) {
                  Icon var74 = ((class_27)var65).method_156();
                  if (var74 != null) {
                     int var84 = ((class_27)var65).method_172() - var74.getIconWidth() / 2;
                     int var93 = ((class_27)var65).method_174() + 16 - var74.getIconHeight();
                     var74.paintIcon(var2, var1, var84, var93);
                  }
               } else {
                  Enumeration var73 = ((Vector)var65).elements();

                  while (var73.hasMoreElements()) {
                     Object var83 = var73.nextElement();
                     if (var83.getClass() == Class.forName("aS") || var83.getClass() == Class.forName("aH")) {
                        class_64 var92 = (class_64)var83;
                        if (var92.method_574()) {
                           if (var92.field_1722.length > 1) {
                              ((class_65)var92).method_609(var1, var2, var23);
                           } else {
                              ((class_66)var92).method_613(var1, var2);
                           }
                        }
                     } else if (var83.getClass() == Class.forName("ab")) {
                        Icon var91 = ((class_27)var83).method_156();
                        if (var91 != null) {
                           int var100 = ((class_27)var83).method_172() - var91.getIconWidth() / 2;
                           int var105 = ((class_27)var83).method_174() + 16 - var91.getIconHeight();
                           var91.paintIcon(var2, var1, var100, var105);
                        }
                     }
                  }
               }
            }
         } catch (ClassNotFoundException var18) {
            class_62.method_563(var18.getMessage());
         }

         if (this.field_2405 != null || this.field_2404 != null) {
            var1.setColor(new Color(0, 0, 0, 100));
            var1.fillRect(0, 0, 800, 600);

            try {
               Map var29 = Collections.synchronizedMap(new TreeMap(new class_15(this)));
               if (this.field_2404 != null) {
                  for (int var34 = 0; var34 < this.field_2404.length; var34++) {
                     class_66 var43 = (class_66)this.field_2402.get(new Long(this.field_2404[var34]));
                     Vector var54 = new Vector();
                     var54.add(var43);
                     Object var66 = var29.put(new Integer(var43.S), var54);
                     if (var66 != null) {
                        if (var66.getClass() != Class.forName("aS") && var66.getClass() != Class.forName("aH")) {
                           Vector var75 = (Vector)var66;
                           Enumeration var85 = var75.elements();

                           while (var85.hasMoreElements()) {
                              Object var94 = var85.nextElement();
                              if (var94.getClass() == Class.forName("aS") || var94.getClass() == Class.forName("aH")) {
                                 class_64 var101 = (class_64)var94;
                                 if (var101.field_1722.length > 1) {
                                    var54.add((class_65)var101);
                                 } else {
                                    var54.add((class_66)var101);
                                 }
                              } else if (var94.getClass() == Class.forName("ab")) {
                                 var54.add((class_27)var94);
                              }
                           }
                        } else {
                           var54.add(var66);
                        }

                        var29.put(new Integer(var43.S), var54);
                     }
                  }
               }

               if (this.field_2405 != null) {
                  for (int var35 = 0; var35 < this.field_2405.length; var35++) {
                     class_65 var44 = (class_65)this.field_2403.get(new Long(this.field_2405[var35]));
                     Vector var55 = new Vector();
                     var55.add(var44);
                     Object var67 = var29.put(new Integer(var44.S), var55);
                     if (var67 != null) {
                        if (var67.getClass() != Class.forName("aS") && var67.getClass() != Class.forName("aH")) {
                           Vector var76 = (Vector)var67;
                           Enumeration var86 = var76.elements();

                           while (var86.hasMoreElements()) {
                              Object var95 = var86.nextElement();
                              if (var95.getClass() == Class.forName("aS") || var95.getClass() == Class.forName("aH")) {
                                 class_64 var102 = (class_64)var95;
                                 if (var102.field_1722.length > 1) {
                                    var55.add((class_65)var102);
                                 } else {
                                    var55.add((class_66)var102);
                                 }
                              } else if (var95.getClass() == Class.forName("ab")) {
                                 var55.add((class_27)var95);
                              }
                           }
                        } else {
                           var55.add(var67);
                        }

                        var29.put(new Integer(var44.S), var55);
                     }
                  }
               }

               for (int var36 = 0; var36 < this.field_2243.method_134(); var36++) {
                  for (int var45 = 0; var45 < this.field_2243.method_135(); var45++) {
                     class_27 var56 = this.field_2243.method_125(var36, var45);
                     Icon var68 = var56.method_156();
                     if (var68 != null && !var56.method_160() && var56.method_154() == null) {
                        Vector var77 = new Vector();
                        var77.add(var56);
                        Object var87 = var29.put(new Integer(var56.field_170), var77);
                        if (var87 != null) {
                           if (var87.getClass() != Class.forName("aS") && var87.getClass() != Class.forName("aH") && var87.getClass() != Class.forName("ab")) {
                              Vector var96 = (Vector)var87;
                              Enumeration var103 = var96.elements();

                              while (var103.hasMoreElements()) {
                                 Object var106 = var103.nextElement();
                                 if (var106.getClass() == Class.forName("aS") || var106.getClass() == Class.forName("aH")) {
                                    class_64 var107 = (class_64)var106;
                                    if (var107.field_1722.length > 1) {
                                       var77.add((class_65)var107);
                                    } else {
                                       var77.add((class_66)var107);
                                    }
                                 } else if (var106.getClass() == Class.forName("ab")) {
                                    var77.add((class_27)var106);
                                 }
                              }
                           } else {
                              var77.add(var87);
                           }

                           var29.put(new Integer(var56.field_170), var77);
                        }
                     }
                  }
               }

               for (Object var46 : var29.values()) {
                  if (var46.getClass() == Class.forName("aS")) {
                     ((class_66)var46).method_613(var1, var2);
                  } else if (var46.getClass() == Class.forName("aH")) {
                     ((class_65)var46).method_609(var1, var2, var23);
                  } else if (var46.getClass() == Class.forName("ab")) {
                     Icon var58 = ((class_27)var46).method_156();
                     if (var58 != null) {
                        int var70 = ((class_27)var46).method_172() - var58.getIconWidth() / 2;
                        int var80 = ((class_27)var46).method_174() + 16 - var58.getIconHeight();
                        var58.paintIcon(var2, var1, var70, var80);
                     }
                  } else {
                     Enumeration var57 = ((Vector)var46).elements();

                     while (var57.hasMoreElements()) {
                        Object var69 = var57.nextElement();
                        if (var69.getClass() == Class.forName("aS") || var69.getClass() == Class.forName("aH")) {
                           class_64 var79 = (class_64)var69;
                           if (var79.method_574()) {
                              if (var79.field_1722.length > 1) {
                                 ((class_65)var79).method_609(var1, var2, var23);
                              } else {
                                 ((class_66)var79).method_613(var1, var2);
                              }
                           }
                        } else if (var69.getClass() == Class.forName("ab")) {
                           Icon var78 = ((class_27)var69).method_156();
                           if (var78 != null) {
                              int var88 = ((class_27)var69).method_172() - var78.getIconWidth() / 2;
                              int var97 = ((class_27)var69).method_174() + 16 - var78.getIconHeight();
                              var78.paintIcon(var2, var1, var88, var97);
                           }
                        }
                     }
                  }
               }
            } catch (ClassNotFoundException var17) {
               class_62.method_563(var17.getMessage());
            }
         }

         ((class_64)this.field_2403.get(this.field_2227.field_1527))
            .method_578(
               var1,
               var2,
               this.field_2365,
               this.field_2366,
               this.field_2367,
               this.field_2368,
               this.field_2369,
               this.field_2370,
               this.field_2371,
               this.field_2372,
               this.field_2373,
               this.field_2374,
               this.field_2375,
               this.field_2376,
               this.field_2377
            );
         if (this.field_2393 > 0L) {
            if (this.field_2394) {
               ((class_64)this.field_2402.get(this.field_2393))
                  .method_579(
                     var1,
                     var2,
                     this.field_2378,
                     this.field_2380,
                     this.field_2381,
                     this.field_2382,
                     this.field_2383,
                     this.field_2384,
                     this.field_2385,
                     this.field_2386,
                     this.field_2387,
                     this.field_2388,
                     this.field_2389,
                     this.field_2390,
                     this.field_2391,
                     this.field_2392
                  );
            } else {
               ((class_64)this.field_2403.get(this.field_2393))
                  .method_579(
                     var1,
                     var2,
                     this.field_2379,
                     this.field_2380,
                     this.field_2381,
                     this.field_2382,
                     this.field_2383,
                     this.field_2384,
                     this.field_2385,
                     this.field_2386,
                     this.field_2387,
                     this.field_2388,
                     this.field_2389,
                     this.field_2390,
                     this.field_2391,
                     this.field_2392
                  );
            }
         } else if (this.field_2393 == 0L && this.field_2394) {
            ((class_64)this.field_2402.get(this.field_2393))
               .method_579(
                  var1,
                  var2,
                  this.field_2378,
                  this.field_2380,
                  this.field_2381,
                  this.field_2382,
                  this.field_2383,
                  this.field_2384,
                  this.field_2385,
                  this.field_2386,
                  this.field_2387,
                  this.field_2388,
                  this.field_2389,
                  this.field_2390,
                  this.field_2391,
                  this.field_2392
               );
         }

         this.field_2227.field_1548.paintIcon(var2, var1, -1, 430);
         this.field_2436.paintIcon(var2, var1, this.field_2437, this.field_2438);
         if (this.field_2259 != -1) {
            this.field_2264.paintIcon(var2, var1, this.field_2260[this.field_2259] + 2, this.field_2261);
         }

         this.field_2258.method_572(var1, var2);
         if (this.field_2269) {
            this.field_2227.field_1549.paintIcon(var2, var1, 397, 369);
            if (this.field_2287 == 4 || this.field_2287 == 1) {
               this.field_2274.paintIcon(var2, var1, this.field_2289, this.field_2290);
            }

            if (this.field_2288) {
               this.field_2275.paintIcon(var2, var1, this.field_2289, this.field_2290);
            }

            if (this.field_2291 == 4 || this.field_2291 == 1) {
               this.field_2274.paintIcon(var2, var1, this.field_2293, this.field_2294);
            }

            if (this.field_2292) {
               this.field_2275.paintIcon(var2, var1, this.field_2293, this.field_2294);
            }

            if (this.field_2295 == 4 || this.field_2295 == 1) {
               this.field_2278.paintIcon(var2, var1, this.field_2297, this.field_2298);
            }

            if (this.field_2296) {
               this.field_2279.paintIcon(var2, var1, this.field_2297, this.field_2298);
            }

            if (this.field_2299 == 4 || this.field_2299 == 1) {
               this.field_2278.paintIcon(var2, var1, this.field_2301, this.field_2302);
            }

            if (this.field_2300) {
               this.field_2279.paintIcon(var2, var1, this.field_2301, this.field_2302);
            }

            if (this.field_2303 == 4 || this.field_2303 == 1) {
               this.field_2278.paintIcon(var2, var1, this.field_2305, this.field_2306);
            }

            if (this.field_2304) {
               this.field_2279.paintIcon(var2, var1, this.field_2305, this.field_2306);
            }

            if (this.field_2307 == 4 || this.field_2307 == 1) {
               this.field_2278.paintIcon(var2, var1, this.field_2309, this.field_2310);
            }

            if (this.field_2308) {
               this.field_2279.paintIcon(var2, var1, this.field_2309, this.field_2310);
            }

            if (this.field_2311 == 4 || this.field_2311 == 1) {
               this.field_2274.paintIcon(var2, var1, this.field_2313, this.field_2314);
            }

            if (this.field_2312) {
               this.field_2275.paintIcon(var2, var1, this.field_2313, this.field_2314);
            }

            if (this.field_2299 == 2 || this.field_2299 == 3) {
               this.field_2315.paintIcon(var2, var1, this.field_2316, this.field_2317);
               int var30 = this.field_2327 * this.field_2337.length;

               for (int var38 = 0; var38 < this.field_2338.length; var38++) {
                  for (int var47 = 0; var47 < this.field_2337.length; var47++) {
                     if (var30 < this.field_2345.size()) {
                        class_7 var59 = (class_7)this.field_2345.elementAt(var30);
                        var59.method_66().paintIcon(var2, var1, this.field_2337[var47], this.field_2338[var38]);
                        if (var59.method_74() == 0L) {
                           var1.setColor(new Color(16777215));
                           var1.setFont(MastersOfDestiny.field_2839);
                           var1.drawString("" + var59.method_47(), this.field_2337[var47] + 35, this.field_2338[var38] + 43);
                        } else {
                           this.field_2245.paintIcon(var2, var1, this.field_2337[var47] + 33, this.field_2338[var38] + 33);
                        }

                        if (var59.method_70() > ((class_65)this.field_2403.get(new Long(this.field_2227.field_1527))).v || var59.method_75()) {
                           this.field_2246.paintIcon(var2, var1, this.field_2337[var47] - 1, this.field_2338[var38]);
                        }

                        var30++;
                     }
                  }
               }

               if (this.field_2248 != -1 && this.field_2249 != -1) {
                  this.field_2247.paintIcon(var2, var1, this.field_2248, this.field_2249);
               }
            }

            if (this.field_2303 == 2) {
               this.field_2315.paintIcon(var2, var1, this.field_2316, this.field_2317);
            }

            if (this.field_2307 == 2) {
               this.field_2318.paintIcon(var2, var1, this.field_2316, this.field_2317);
               if (this.field_2346 != null) {
                  this.field_2346.method_234().method_181().paintIcon(var2, var1, this.field_2347 + 2, this.field_2348);
               }
            }

            if (this.field_2303 == 2) {
               int var31 = this.field_2327 * this.field_2337.length;

               for (int var39 = 0; var39 < this.field_2338.length; var39++) {
                  for (int var48 = 0; var48 < this.field_2337.length; var48++) {
                     if (var31 < this.field_2345.size()) {
                        ((class_30)this.field_2345.elementAt(var31))
                           .method_234()
                           .method_181()
                           .paintIcon(var2, var1, this.field_2337[var48], this.field_2338[var39]);
                        int var60 = ((class_30)this.field_2345.elementAt(var31)).method_236();
                        var1.setColor(new Color(16777215));
                        var1.setFont(MastersOfDestiny.field_2839);
                        var1.drawString(var60 + "", this.field_2337[var48] + 2, this.field_2338[var39] + 9);
                        if (Integer.parseInt(((class_30)this.field_2345.elementAt(var31)).method_234().method_201())
                           > ((class_65)this.field_2403.get(new Long(this.field_2227.field_1527))).t) {
                           this.field_2246.paintIcon(var2, var1, this.field_2337[var48] - 1, this.field_2338[var39]);
                        }
                     }

                     var31++;
                  }
               }
            }

            if (this.field_2307 == 2) {
               int var32 = this.field_2327 * this.field_2337.length;

               for (int var40 = 0; var40 < this.field_2338.length; var40++) {
                  for (int var49 = 0; var49 < this.field_2337.length; var49++) {
                     if (var32 < this.field_2345.size()) {
                        ((class_30)this.field_2345.elementAt(var32))
                           .method_234()
                           .method_181()
                           .paintIcon(var2, var1, this.field_2337[var49] + 2, this.field_2338[var40]);
                        int var61 = ((class_30)this.field_2345.elementAt(var32)).method_236();
                        var1.setColor(new Color(16777215));
                        var1.setFont(MastersOfDestiny.field_2839);
                        var1.drawString(var61 + "", this.field_2337[var49] + 3, this.field_2338[var40] + 9);
                     }

                     var32++;
                  }
               }

               if (this.field_2349 != null) {
                  this.field_2349.method_234().method_181().paintIcon(var2, var1, this.field_2350, this.field_2351);
               }
            }

            if (this.field_2328.field_2993 != null) {
               var1.setFont(MastersOfDestiny.field_2808);
               this.field_2328.method_793(var1, var2);
            }
         }

         this.field_2356.method_572(var1, var2);
         if (this.field_2250) {
            this.field_2395.paintIcon(var2, var1, this.field_2396, this.field_2397);
            var1.setColor(new Color(8838126));
            var1.setFont(MastersOfDestiny.field_2821);
            var1.drawString(
               this.field_2251,
               this.field_2396 + this.field_2395.getIconWidth() / 2 - MastersOfDestiny.field_2820.stringWidth(this.field_2251) / 2,
               this.field_2397 + 5 * (MastersOfDestiny.field_2822.getHeight() / 4)
            );
         }

         if (this.field_2417) {
            this.field_2418.paintIcon(var2, var1, this.field_2407, this.field_2408);
            this.field_2406.method_572(var1, var2);
         }
      }
   }

   // $VF: renamed from: a (int, java.lang.Object) void
   @Override
   public void method_674(int var1, Object var2) {
   }

   // $VF: renamed from: a (java.lang.String[]) void
   @Override
   public void method_675(String[] var1) {
      class_62.method_563("mission state received: " + var1[0]);
      switch (class_68.method_618(var1)) {
         case -1:
            this.method_704(class_68.method_622(Long.toString(class_57.field_1525), this.field_2227.field_1526));
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 7:
         case 8:
         case 9:
         case 10:
         case 12:
         case 13:
         case 15:
         case 16:
         case 18:
         case 19:
         case 44:
         default:
            break;
         case 6:
            this.method_704(class_68.method_626());
            break;
         case 11:
            int var58 = Integer.parseInt(var1[3]);
            int var60 = Integer.parseInt(var1[4]);
            class_66 var69 = new class_66(
               Long.parseLong(var1[1]),
               Long.parseLong(var1[2]),
               this.field_2227.method_504("en", 535),
               var58,
               var60,
               this.field_2243.method_125(var58, var60).method_172(),
               this.field_2243.method_125(var58, var60).method_174(),
               Integer.parseInt(var1[5]),
               Integer.parseInt(var1[6])
            );
            var69.method_612(this.field_2227);
            this.field_2402.put(new Long(var1[2]), var69);
            this.field_2243.method_128(var58, var60, var69);
            this.field_2243.method_125(var58, var60).method_161(false);
            this.field_2243.method_125(var58, var60).method_163(false);
            break;
         case 14:
            int var57 = Integer.parseInt(var1[3]);
            int var59 = Integer.parseInt(var1[4]);
            int var17 = Integer.parseInt(var1[7]);
            int var18 = Integer.parseInt(var1[8]);
            int var19 = Integer.parseInt(var1[9]);
            class_65 var66 = new class_65(
               Long.parseLong(var1[1]),
               var1[2],
               Integer.parseInt(var1[6]),
               var17,
               var18,
               var19,
               var57,
               var59,
               this.field_2243.method_125(var57, var59).method_172(),
               this.field_2243.method_125(var57, var59).method_174(),
               Integer.parseInt(var1[5]),
               this.field_2227.method_508(var17),
               Integer.parseInt(var1[13])
            );
            if (Integer.parseInt(var1[10]) != -1) {
               class_29 var71 = this.field_2227.field_1540.method_177(var1[10]);
               class_30 var79 = new class_30();
               var79.method_233(var71);
               var79.method_235(1);
               var79.method_239(1, (byte)1);
               var66.method_598(var79);
               var71 = null;
            }

            if (Integer.parseInt(var1[11]) != -1) {
               class_29 var73 = this.field_2227.field_1540.method_177(var1[11]);
               class_30 var80 = new class_30();
               var80.method_233(var73);
               var80.method_235(1);
               var80.method_239(2, (byte)1);
               var66.method_598(var80);
               var73 = null;
            }

            if (Integer.parseInt(var1[12]) != -1) {
               class_29 var75 = this.field_2227.field_1540.method_177(var1[12]);
               class_30 var81 = new class_30();
               var81.method_233(var75);
               var81.method_235(1);
               var81.method_239(3, (byte)1);
               var66.method_598(var81);
               var75 = null;
            }

            this.field_2403.put(new Long(var1[1]), var66);
            this.field_2243.method_128(var57, var59, var66);
            this.field_2243.method_125(var57, var59).method_161(false);
            this.field_2243.method_125(var57, var59).method_163(false);
            break;
         case 17:
            int var20 = Integer.parseInt(var1[3]);
            if (var20 > 0) {
               class_29 var77 = this.field_2227.field_1540.method_177(var1[2]);
               class_30 var83 = new class_30();
               var83.method_233(var77);
               var83.method_235(1);
               var83.method_239(var20, (byte)1);
               class_62.method_563("item = " + var83);
               class_62.method_563("((Player)missionPlayers.get(Long.valueOf(messageParts[1]))) = " + (class_65)this.field_2403.get(Long.valueOf(var1[1])));
               ((class_65)this.field_2403.get(Long.valueOf(var1[1]))).method_598(var83);
               var77 = null;
            }
            break;
         case 20:
            if (this.field_2403.get(Long.valueOf(var1[1])) != null) {
               ((class_65)this.field_2403.get(Long.valueOf(var1[1])))
                  .method_607(
                     Integer.parseInt(var1[2]),
                     Integer.parseInt(var1[6]),
                     Integer.parseInt(var1[3]),
                     Integer.parseInt(var1[5]),
                     Integer.parseInt(var1[4]),
                     Integer.parseInt(var1[7])
                  );
            }
            break;
         case 21:
            if (this.field_2403.get(Long.valueOf(var1[1])) != null) {
               ((class_65)this.field_2403.get(Long.valueOf(var1[1])))
                  .method_607(
                     Integer.parseInt(var1[2]),
                     Integer.parseInt(var1[6]),
                     Integer.parseInt(var1[3]),
                     Integer.parseInt(var1[5]),
                     Integer.parseInt(var1[4]),
                     Integer.parseInt(var1[7])
                  );
            }
            break;
         case 22:
            int var21 = Integer.parseInt(var1[1]);
            if (var21 == 1) {
               class_62.method_563("new round");
               class_62.method_563("missionPlayer = " + this.field_2403);
               class_62.method_563("missionPlayer.size = " + this.field_2403.size());
               Enumeration var82 = this.field_2403.elements();

               while (var82.hasMoreElements()) {
                  class_65 var65 = (class_65)var82.nextElement();
                  var65.method_608(this.field_2227);
               }
            }

            this.field_2363 = var21;
            if (this.field_2356 != null) {
               this.field_2356.method_569("Round: " + this.field_2363 + "...", 0, 0);
               this.field_2356.method_571((byte)3);
            }
            break;
         case 23:
            this.field_2364 = ((class_64)this.field_2403.get(Long.valueOf(var1[1]))).field_1683;
            int var22 = ((class_64)this.field_2403.get(Long.valueOf(var1[1]))).field_1717;
            int var23 = ((class_64)this.field_2403.get(Long.valueOf(var1[1]))).field_1718;
            class_62.method_563("turnTileX " + this.field_2440 + " turnTileY " + this.field_2441);
            this.field_2440 = this.field_2243.method_125(var22, var23).method_168();
            this.field_2441 = this.field_2243.method_125(var22, var23).method_170();
            this.field_2442 = true;
            this.field_2423 = this.field_2440;
            this.field_2424 = this.field_2441;
            if (Long.parseLong(var1[1]) == this.field_2227.field_1527) {
               if (((class_65)this.field_2403.get(this.field_2227.field_1527)).field_1802 != -1) {
                  ((class_65)this.field_2403.get(this.field_2227.field_1527)).field_1803 = ((class_64)this.field_2403.get(this.field_2227.field_1527)).field_1688;
                  ((class_64)this.field_2403.get(this.field_2227.field_1527)).field_1688 = ((class_65)this.field_2403.get(this.field_2227.field_1527)).field_1802;
               }

               ((class_64)this.field_2403.get(this.field_2227.field_1527)).field_1694 = ((class_64)this.field_2403.get(this.field_2227.field_1527)).field_1688;
               this.field_2269 = true;
               this.field_2287 = 0;
               this.field_2291 = 0;
               this.field_2295 = 4;
               this.field_2299 = 4;
               this.field_2303 = 4;
               this.field_2307 = 4;
               this.field_2311 = 0;
               this.method_709();
            }

            if (this.field_2356 != null) {
               this.field_2356.method_569("Round: " + this.field_2363 + " - " + this.field_2364 + "'s turn", 0, 0);
               this.field_2356.method_571((byte)3);
            }
            break;
         case 24:
            this.method_708();
            this.field_2287 = 4;
            this.field_2291 = 4;
            this.field_2295 = 4;
            this.field_2299 = 4;
            this.field_2303 = 4;
            this.field_2307 = 4;
            this.field_2311 = 4;
            this.field_2269 = false;
            break;
         case 25:
            this.field_2364 = ((class_64)this.field_2402.get(Long.valueOf(var1[1]))).field_1683;
            int var84 = ((class_64)this.field_2402.get(Long.valueOf(var1[1]))).field_1717;
            int var85 = ((class_64)this.field_2402.get(Long.valueOf(var1[1]))).field_1718;
            this.field_2440 = this.field_2243.method_125(var84, var85).method_168();
            this.field_2441 = this.field_2243.method_125(var84, var85).method_170();
            this.field_2442 = true;
            this.field_2423 = this.field_2440;
            this.field_2424 = this.field_2441;
            this.field_2356.method_569("Round: " + this.field_2363 + " - " + this.field_2364 + "'s turn", 0, 0);
            this.field_2356.method_571((byte)3);
            break;
         case 26:
            class_62.method_563("player walk type");
            class_62.method_563("x: " + ((class_64)this.field_2403.get(Long.valueOf(var1[1]))).field_1717);
            class_62.method_563("y: " + ((class_64)this.field_2403.get(Long.valueOf(var1[1]))).field_1718);
            class_65 var64 = (class_65)this.field_2403.get(Long.valueOf(var1[1]));
            int var53 = var64.P;
            int var54 = var64.Q;
            class_27 var29 = this.field_2243.method_125(var53, var54);
            this.field_2243.method_128(var53, var54, null);
            this.field_2243.method_125(var53, var54).method_161(true);
            this.field_2243.method_125(var53, var54).method_163(false);
            int var55 = Integer.parseInt(var1[2]);
            int var56 = Integer.parseInt(var1[3]);
            class_27 var30 = this.field_2243.method_125(var55, var56);
            this.field_2423 = var30.method_168();
            this.field_2424 = var30.method_170();
            this.field_2243.method_128(var55, var56, var64);
            this.field_2435.method_893(var29, var30);
            int var51 = 0;

            do {
               var51 = this.field_2435.method_897();
            } while (var51 == 1);

            class_62.method_563("searchStats = " + var51);
            this.field_2434 = this.field_2435.method_894();

            for (int var31 = 0; var31 < this.field_2434.size(); var31++) {
               class_12 var32 = (class_12)this.field_2434.get(var31);
               if (var32 != null) {
                  class_62.method_563("x " + var32.method_110().method_164() + " Y " + var32.method_110().method_166());
               }
            }

            ((class_64)this.field_2403.get(Long.valueOf(var1[1]))).method_576(this.field_2434);
            this.field_2444 = 0;
            this.field_2445 = 1;
            if (var64.p == this.field_2227.field_1527) {
               this.field_2287 = 4;
               class_64 var10000 = (class_64)this.field_2403.get(this.field_2227.field_1527);
               var10000.field_1694 = var10000.field_1694 - this.field_2434.size();
            }

            this.field_2426 = true;
            break;
         case 27:
            class_62.method_563("monster walk type");
            class_66 var68 = (class_66)this.field_2402.get(Long.valueOf(var1[1]));
            int var3 = var68.P;
            int var4 = var68.Q;
            class_62.method_563("old - x: " + var3 + " | y: " + var4);
            class_27 var33 = this.field_2243.method_125(var3, var4);
            this.field_2243.method_128(var3, var4, null);
            this.field_2243.method_125(var3, var4).method_161(true);
            this.field_2243.method_125(var3, var4).method_163(false);
            int var5 = Integer.parseInt(var1[2]);
            int var6 = Integer.parseInt(var1[3]);
            class_62.method_563("new - x: " + var5 + " | y: " + var6);
            class_27 var34 = this.field_2243.method_125(var5, var6);
            this.field_2423 = var34.method_168();
            this.field_2424 = var34.method_170();
            this.field_2243.method_128(var5, var6, var68);
            this.field_2435.method_893(var33, var34);
            int var2 = 0;

            do {
               var2 = this.field_2435.method_897();
            } while (var2 == 1);

            class_62.method_563("searchStats = " + var2);
            this.field_2434 = this.field_2435.method_894();

            for (int var86 = 0; var86 < this.field_2434.size(); var86++) {
               class_12 var87 = (class_12)this.field_2434.get(var86);
               if (var87 != null) {
                  class_62.method_563("x " + var87.method_110().method_164() + " Y " + var87.method_110().method_166());
               }
            }

            ((class_64)this.field_2402.get(Long.valueOf(var1[1]))).method_576(this.field_2434);
            this.field_2444 = 0;
            this.field_2445 = 1;
            this.field_2426 = true;
            break;
         case 28:
            class_62.method_563("monster attacking...");
            int var35 = Integer.parseInt(var1[2]);
            Vector var36 = new Vector();
            if (!var1[5].equals("-1")) {
               String[] var37 = var1[5].split(" ");

               for (int var90 = 0; var90 < var37.length; var90++) {
                  class_62.method_563("affected player " + var37[var90]);
                  class_64 var93 = (class_64)this.field_2403.get(Long.valueOf(var37[var90]));
                  var36.add(var93);
               }
            }

            if (!var1[6].equals("-1")) {
               String[] var88 = var1[6].split(" ");

               for (int var91 = 0; var91 < var88.length; var91++) {
                  class_62.method_563("affected monster " + var88[var91]);
                  if (!var88[var91].equals(var1[1])) {
                     class_64 var94 = (class_64)this.field_2402.get(Long.valueOf(var88[var91]));
                     var36.add(var94);
                  }
               }
            }

            class_64[] var89 = new class_64[var36.size()];

            for (int var92 = 0; var92 < var36.size(); var92++) {
               var89[var92] = (class_64)var36.get(var92);
            }

            class_66 var67 = (class_66)this.field_2402.get(Long.valueOf(var1[1]));
            this.field_2444 = 0;
            this.field_2445 = (byte)(var36.size() + 1);
            var67.a(var89, Integer.parseInt(var1[3]), Integer.parseInt(var1[4]), var35);
            this.field_2423 = this.field_2243.method_125(Integer.parseInt(var1[3]), Integer.parseInt(var1[4])).method_168();
            this.field_2424 = this.field_2243.method_125(Integer.parseInt(var1[3]), Integer.parseInt(var1[4])).method_170();
            this.field_2426 = true;
            break;
         case 29:
            class_65 var63 = (class_65)this.field_2403.get(Long.valueOf(var1[1]));
            if (var1.length == 8) {
               if (!var1[7].equalsIgnoreCase("null")) {
                  var63.y = var1[7];
               }
            } else if (var63.u != Integer.parseInt(var1[2])) {
               var63.y = "HP " + (Integer.parseInt(var1[2]) - var63.u);
            }

            var63.u = Integer.parseInt(var1[2]);
            var63.w = Integer.parseInt(var1[3]);
            var63.x = Integer.parseInt(var1[5]);
            var63.v = Integer.parseInt(var1[4]);
            if (var63.u <= 0) {
               this.field_2243.method_128(var63.P, var63.Q, null);
               this.field_2243.method_125(var63.P, var63.Q).method_161(true);
               this.field_2243.method_125(var63.P, var63.Q).method_163(false);
               if (Long.parseLong(var1[1]) == this.field_2393) {
                  this.field_2393 = -1L;
               }

               if (Long.parseLong(var1[1]) == this.field_2227.field_1527) {
                  this.method_704(class_68.method_634());
                  this.method_708();
                  ((class_65)this.field_2403.get(this.field_2227.field_1527)).field_1802 = -1;
                  if (((class_65)this.field_2403.get(this.field_2227.field_1527)).field_1803 != -1) {
                     ((class_64)this.field_2403.get(this.field_2227.field_1527)).field_1688 = ((class_65)this.field_2403.get(this.field_2227.field_1527)).field_1803;
                     ((class_65)this.field_2403.get(this.field_2227.field_1527)).field_1803 = -1;
                  }

                  this.method_718();
                  this.method_716();
                  this.field_2287 = 4;
                  this.field_2291 = 4;
                  this.field_2295 = 4;
                  this.field_2299 = 4;
                  this.field_2303 = 4;
                  this.field_2307 = 4;
                  this.field_2311 = 4;
                  this.field_2269 = false;
               }
            }
            break;
         case 30:
            class_66 var10 = (class_66)this.field_2402.get(Long.valueOf(var1[1]));
            if (var1.length == 5) {
               if (!var1[4].equalsIgnoreCase("null")) {
                  var10.y = var1[4];
               }
            } else if (var10.u != Integer.parseInt(var1[2])) {
               var10.y = "HP " + (Integer.parseInt(var1[2]) - var10.u);
            }

            var10.u = Integer.parseInt(var1[2]);
            if (var10.u <= 0) {
               this.field_2243.method_128(var10.P, var10.Q, null);
               this.field_2243.method_125(var10.P, var10.Q).method_161(true);
               this.field_2243.method_125(var10.P, var10.Q).method_163(false);
               if (Long.parseLong(var1[1]) == this.field_2393) {
                  this.field_2393 = -1L;
               }
            }
            break;
         case 31:
            class_62.method_563("player attacking...");
            int var38 = Integer.parseInt(var1[2]);
            Vector var39 = new Vector();
            if (!var1[5].equals("-1")) {
               String[] var40 = var1[5].split(" ");

               for (int var97 = 0; var97 < var40.length; var97++) {
                  class_62.method_563("affected player " + var40[var97]);
                  if (!var40[var97].equals(var1[1])) {
                     class_64 var102 = (class_64)this.field_2403.get(Long.valueOf(var40[var97]));
                     var39.add(var102);
                  }
               }
            }

            if (!var1[6].equals("-1")) {
               String[] var95 = var1[6].split(" ");

               for (int var98 = 0; var98 < var95.length; var98++) {
                  class_62.method_563("affected monster " + var95[var98]);
                  class_64 var103 = (class_64)this.field_2402.get(Long.valueOf(var95[var98]));
                  var39.add(var103);
               }
            }

            class_64[] var96 = new class_64[var39.size()];

            for (int var99 = 0; var99 < var39.size(); var99++) {
               var96[var99] = (class_64)var39.get(var99);
            }

            class_65 var62 = (class_65)this.field_2403.get(Long.valueOf(var1[1]));
            this.field_2444 = 0;
            this.field_2445 = (byte)(var39.size() + 1);
            var62.a(var96, Integer.parseInt(var1[3]), Integer.parseInt(var1[4]), var38);
            this.field_2423 = this.field_2243.method_125(Integer.parseInt(var1[3]), Integer.parseInt(var1[4])).method_168();
            this.field_2424 = this.field_2243.method_125(Integer.parseInt(var1[3]), Integer.parseInt(var1[4])).method_170();
            if (var62.p == this.field_2227.field_1527) {
               this.field_2291 = 4;
               this.field_2295 = 4;
               this.field_2299 = 4;
               this.field_2303 = 4;
               this.field_2307 = 4;
            }

            this.field_2426 = true;
            break;
         case 32:
            if (this.field_2287 == 4 && this.field_2291 == 4) {
               this.method_704(class_68.method_634());
               ((class_65)this.field_2403.get(this.field_2227.field_1527)).field_1802 = -1;
               if (((class_65)this.field_2403.get(this.field_2227.field_1527)).field_1803 != -1) {
                  ((class_64)this.field_2403.get(this.field_2227.field_1527)).field_1688 = ((class_65)this.field_2403.get(this.field_2227.field_1527)).field_1803;
                  ((class_65)this.field_2403.get(this.field_2227.field_1527)).field_1803 = -1;
               }

               this.method_708();
               this.method_718();
               this.method_716();
               this.method_722();
               this.field_2287 = 4;
               this.field_2291 = 4;
               this.field_2295 = 4;
               this.field_2299 = 4;
               this.field_2303 = 4;
               this.field_2307 = 4;
               this.field_2311 = 4;
               this.field_2269 = false;
            } else {
               if (this.field_2287 == 1) {
                  this.field_2287 = 0;
               }

               if (this.field_2291 == 1) {
                  this.field_2291 = 0;
                  this.field_2295 = 4;
                  this.field_2299 = 4;
                  this.field_2303 = 4;
                  this.field_2307 = 4;
               }

               this.field_2311 = 0;
               this.field_2269 = true;
               this.method_709();
            }
            break;
         case 33:
            this.method_726(Long.parseLong(var1[1]), var1[2]);
            break;
         case 34:
            this.method_728(Long.parseLong(var1[1]), Integer.parseInt(var1[2]));
            break;
         case 35:
            class_3.field_20.method_17("res/sound/combat/battle_win.wav");
            this.field_2251 = "Mission Cleared!";

            for (int var101 = 0; var101 < this.field_2243.method_134(); var101++) {
               for (int var106 = 0; var106 < this.field_2243.method_135(); var106++) {
                  if (this.field_2243.method_125(var101, var106).method_158() == 255) {
                     int var108 = this.field_2243.method_125(var101, var106).method_164();
                     int var110 = this.field_2243.method_125(var101, var106).method_166();
                     Enumeration var112 = this.field_2403.elements();

                     while (var112.hasMoreElements()) {
                        class_65 var113 = (class_65)var112.nextElement();
                        if (var113.P == var108 && var113.Q == var110) {
                           this.field_2251 = "Mission Aborted.";
                        }
                     }
                  }
               }
            }

            this.field_2250 = true;
            this.method_704(class_68.method_625());
            break;
         case 36:
            class_3.field_20.method_17("res/sound/combat/battle_lose.wav");
            this.field_2251 = "Mission Failed!";
            this.field_2250 = true;
            this.method_704(class_68.method_625());
            break;
         case 37:
            class_62.method_563("player using item...");
            this.method_729(Long.parseLong(var1[1]), Integer.parseInt(var1[3]), Integer.parseInt(var1[4]), var1[2]);
            break;
         case 38:
            class_65 var61 = (class_65)this.field_2403.get(Long.valueOf(var1[1]));
            class_62.method_563(var61.p + var61.l + " changing equipment");
            int var41 = Integer.parseInt(var1[3]);
            class_62.method_563("bodyslotID = " + var41);
            if (var41 > 0) {
               class_30 var100 = var61.method_605(var41);
               if (var100 != null) {
                  int var104 = var61.method_601(var100);
                  if (var104 == -1) {
                     var61.method_600(var100);
                  } else {
                     var61.method_602(var100.method_234().method_193(), var104, 1);
                  }

                  var61.method_599(var100);
               }

               class_29 var105 = this.field_2227.field_1540.method_177(var1[2]);
               class_30 var107 = new class_30();
               var107.method_233(var105);
               var107.method_235(1);
               var107.method_239(var41, (byte)1);
               var61.method_598(var107);
               this.field_2356.method_569(var61.l + " have equipped " + var107.method_234().method_183(), 9765735, 9765735);
               this.field_2356.method_571((byte)3);
               int var109 = var61.method_601(var107);
               if (var109 != -1) {
                  var61.method_602(var107.method_234().method_193(), var109, -1);
               }

               this.field_2426 = true;
               this.field_2444 = 0;
               this.field_2445 = 1;
               var61.k();
               if (var41 == 3 && Long.parseLong(var1[1]) == this.field_2227.field_1527) {
                  class_30 var111 = ((class_65)this.field_2403.get(this.field_2227.field_1527)).method_606();
                  String var47 = var111.method_234().method_189();
                  class_62.method_563(var47);

                  for (int var48 = 0; var48 < ((class_65)this.field_2403.get(this.field_2227.field_1527)).method_597().size(); var48++) {
                     class_7 var49 = (class_7)((class_65)this.field_2403.get(this.field_2227.field_1527)).method_597().get(var48);
                     if (var111 != null) {
                        if (var47.equalsIgnoreCase("gun")) {
                           if (var49.method_68().startsWith("Close Combat")) {
                              class_62.method_563("disabled");
                              var49.method_76(true);
                           } else {
                              class_62.method_563("enabled");
                              var49.method_76(false);
                           }
                        } else if (var47.equalsIgnoreCase("knife")) {
                           if (var49.method_68().startsWith("Gunnery")) {
                              class_62.method_563("disabled");
                              var49.method_76(true);
                           } else {
                              class_62.method_563("enabled");
                              var49.method_76(false);
                           }
                        } else if (var47.equalsIgnoreCase("sword")) {
                           if (var49.method_68().startsWith("Bow Crafts")) {
                              var49.method_76(true);
                           } else {
                              var49.method_76(false);
                           }
                        } else if (var47.equalsIgnoreCase("bow")) {
                           if (var49.method_68().startsWith("Sword Crafts")) {
                              var49.method_76(true);
                           } else {
                              var49.method_76(false);
                           }
                        } else if (var47.equalsIgnoreCase("book")) {
                           if (var49.method_68().startsWith("Combat Magic")) {
                              var49.method_76(true);
                           } else {
                              var49.method_76(false);
                           }
                        } else if (var47.equalsIgnoreCase("staff")) {
                           if (var49.method_68().startsWith("Support Magic")) {
                              var49.method_76(true);
                           } else {
                              var49.method_76(false);
                           }
                        } else if (var47.equalsIgnoreCase("claw")) {
                           if (var49.method_68().startsWith("Knuckles Training")) {
                              var49.method_76(true);
                           } else {
                              var49.method_76(false);
                           }
                        } else if (var47.equalsIgnoreCase("knuckles")) {
                           if (var49.method_68().startsWith("Claws Training")) {
                              var49.method_76(true);
                           } else {
                              var49.method_76(false);
                           }
                        } else {
                           var49.method_76(false);
                        }
                     } else if (!var49.method_68().startsWith("Close Combat")
                        && !var49.method_68().startsWith("Gunnery")
                        && !var49.method_68().startsWith("Bow Crafts")
                        && !var49.method_68().startsWith("Sword Crafts")
                        && !var49.method_68().startsWith("Combat Magic")
                        && !var49.method_68().startsWith("Support Magic")
                        && !var49.method_68().startsWith("Knuckles Training")
                        && !var49.method_68().startsWith("Claws Training")) {
                        var49.method_76(false);
                     } else {
                        var49.method_76(true);
                     }
                  }
               }
            } else if (var61.method_606().method_234().method_179() == Long.parseLong(var1[2])) {
               class_30 var42 = var61.method_606();
               String var43 = var42.method_234().method_189();
               int var44 = var61.method_601(var42);
               if (var44 == -1) {
                  var61.method_600(var42);
               } else {
                  var61.method_602(var42.method_234().method_193(), var44, 1);
               }

               var61.method_599(var42);
               this.field_2356.method_569(var61.l + " have unequipped " + var42.method_234().method_183(), 9765735, 9765735);
               this.field_2356.method_571((byte)3);
               this.field_2426 = true;
               this.field_2444 = 0;
               this.field_2445 = 1;
               var61.k();
               if (Long.parseLong(var1[1]) == this.field_2227.field_1527) {
                  for (int var45 = 0; var45 < ((class_65)this.field_2403.get(this.field_2227.field_1527)).method_597().size(); var45++) {
                     class_7 var46 = (class_7)((class_65)this.field_2403.get(this.field_2227.field_1527)).method_597().get(var45);
                     if (var43.equalsIgnoreCase("gun")) {
                        if (var46.method_68().startsWith("Gunnery")) {
                           var46.method_76(true);
                        }
                     } else if (var43.equalsIgnoreCase("knife")) {
                        if (var46.method_68().startsWith("Close Combat")) {
                           var46.method_76(true);
                        }
                     } else if (var43.equalsIgnoreCase("sword")) {
                        if (var46.method_68().startsWith("Sword Crafts")) {
                           var46.method_76(true);
                        }
                     } else if (var43.equalsIgnoreCase("bow")) {
                        if (var46.method_68().startsWith("Bow Crafts")) {
                           var46.method_76(true);
                        }
                     } else if (var43.equalsIgnoreCase("book")) {
                        if (var46.method_68().startsWith("Support Magic")) {
                           var46.method_76(true);
                        }
                     } else if (var43.equalsIgnoreCase("staff")) {
                        if (var46.method_68().startsWith("Combat Magic")) {
                           var46.method_76(true);
                        }
                     } else if (var43.equalsIgnoreCase("claw")) {
                        if (var46.method_68().startsWith("Claws Training")) {
                           var46.method_76(true);
                        }
                     } else if (var43.equalsIgnoreCase("knuckles") && var46.method_68().startsWith("Knuckles Training")) {
                        var46.method_76(true);
                     }
                  }
               }
            }

            this.method_704(class_68.method_631());
            if (var61.p == this.field_2227.field_1527) {
               if (this.field_2287 == 0) {
                  this.field_2287 = 1;
               }

               this.field_2291 = 4;
               this.field_2295 = 4;
               this.field_2299 = 4;
               this.field_2303 = 4;
               this.field_2307 = 4;
               this.field_2269 = false;
            }
            break;
         case 39:
            this.field_2356.method_569("Failed to change equipment to " + this.field_2227.field_1540.method_177(var1[1]).method_183(), 16711680, 16711680);
            this.field_2356.method_571((byte)3);
            class_62.method_563(this.field_2364 + " vs. " + this.field_2227.field_1528);
            if (this.field_2364.equalsIgnoreCase(this.field_2227.field_1528)) {
               class_62.method_563("me");
               if (this.field_2287 == 1) {
                  this.field_2287 = 0;
               }

               this.field_2291 = 0;
               this.field_2295 = 4;
               this.field_2299 = 4;
               this.field_2303 = 4;
               this.field_2307 = 4;
               this.field_2311 = 0;
               this.field_2269 = true;
            }
            break;
         case 40:
            class_62.method_563("missionPlayers size = " + this.field_2403.size());
            if (this.field_2403.containsKey(Long.valueOf(var1[1]))) {
               this.field_2243
                  .method_128(((class_65)this.field_2403.get(Long.valueOf(var1[1]))).P, ((class_65)this.field_2403.get(Long.valueOf(var1[1]))).Q, null);
               this.field_2243
                  .method_125(((class_65)this.field_2403.get(Long.valueOf(var1[1]))).P, ((class_65)this.field_2403.get(Long.valueOf(var1[1]))).Q)
                  .method_161(true);
               this.field_2243
                  .method_125(((class_65)this.field_2403.get(Long.valueOf(var1[1]))).P, ((class_65)this.field_2403.get(Long.valueOf(var1[1]))).Q)
                  .method_163(false);
               this.field_2403.remove(Long.valueOf(var1[1]));
               class_62.method_563("player " + var1[1] + " left");
            }
            break;
         case 41:
            int var24 = var1[1].indexOf(".");
            String var25 = var1[1].substring(0, var24);
            int var26 = Integer.parseInt(var1[1].substring(var24 + 1, var1[1].length()));
            this.method_705(var25, var26);
            this.method_707();
            this.field_2406.method_571((byte)2);
            this.field_2417 = true;
            break;
         case 42:
            this.method_706(var1[2] + " " + var1[3]);
            break;
         case 43:
            int var27 = Integer.parseInt(var1[1]);
            int var28 = Integer.parseInt(var1[2]);
            if (var27 != 0) {
               this.method_706(var27 + " experience");
            }

            if (var28 != 0) {
               this.method_706(var28 + " sidos");
            }
            break;
         case 45:
            this.field_2231 = -1L;
            this.field_2232 = -1L;
            this.field_2230 = -1;
            this.field_2233 = false;
            this.field_2269 = false;
            this.field_2363 = 0;
            this.method_716();
            this.method_718();
            this.method_722();
            this.method_708();
            this.field_2426 = false;
            this.field_2444 = 0;
            this.field_2445 = -1;
            this.field_2402.clear();
            this.method_704(class_68.method_625());
            break;
         case 46:
            int var7 = Integer.parseInt(var1[2]);
            int var8 = Integer.parseInt(var1[3]);
            class_65 var9 = (class_65)this.field_2403.get(new Long(var1[1]));
            var9.T = Integer.parseInt(var1[4]);
            if (this.field_2243.method_127(var9.P, var9.Q) != null && this.field_2243.method_127(var9.P, var9.Q).equals(var9)) {
               this.field_2243.method_128(var9.P, var9.Q, null);
               this.field_2243.method_125(var9.P, var9.Q).method_161(true);
               this.field_2243.method_125(var9.P, var9.Q).method_163(false);
            }

            var9.P = var7;
            var9.Q = var8;
            var9.R = this.field_2243.method_125(var7, var8).method_172();
            var9.S = this.field_2243.method_125(var7, var8).method_174();
            var9.N = this.field_2243.method_125(var7, var8).method_172();
            var9.O = this.field_2243.method_125(var7, var8).method_174();
            this.field_2243.method_128(var7, var8, var9);
            this.field_2243.method_125(var7, var8).method_161(false);
            this.field_2243.method_125(var7, var8).method_163(false);
            break;
         case 47:
            if (!this.field_2250) {
               this.field_2450.method_353(this.field_2227.field_1523, this.field_2227.field_1524);
               this.field_2228 = 27;
            } else {
               this.field_2443 = System.currentTimeMillis();
            }
            break;
         case 48:
            String var11 = "The server will shut down in " + var1[1];
            if (Integer.parseInt(var1[1]) > 1) {
               var11 = var11 + " minutes.";
            } else {
               var11 = var11 + " minute.";
            }

            class_62.method_563(var11);
            if (this.field_2356 != null) {
               class_62.method_563("add to system info");
               this.field_2356.method_569(var11, 7683328, 7683328);
               this.field_2356.method_571((byte)3);
            }
            break;
         case 49:
            String var12 = var1[2];
            if (this.field_2356 != null) {
               this.field_2356.method_569(var12, 7683328, 7683328);
               this.field_2356.method_571((byte)3);
            }
            break;
         case 50:
            String var13 = ((class_64)this.field_2403.get(Long.valueOf(var1[1]))).field_1683;
            String var14 = var13 + " received " + var1[4] + " " + var1[3];
            this.method_733(var1[1], var1[2], var1[4]);
            if (this.field_2356 != null) {
               this.field_2356.method_569(var14, 7683328, 7683328);
               this.field_2356.method_571((byte)3);
            }
            break;
         case 51:
            String var15 = ((class_64)this.field_2403.get(Long.valueOf(var1[1]))).field_1683;
            String var16 = var15 + " received " + var1[2] + " sidos";
            if (this.field_2356 != null) {
               this.field_2356.method_569(var16, 7683328, 7683328);
               this.field_2356.method_571((byte)3);
            }
            break;
         case 52:
            if (Integer.parseInt(var1[3]) == this.field_2363 + 1 && Long.parseLong(var1[1]) == this.field_2227.field_1527) {
               ((class_65)this.field_2403.get(Long.valueOf(var1[1]))).field_1802 = Integer.parseInt(var1[2]);
            }
            break;
         case 53:
            ((class_65)this.field_2403.get(Long.valueOf(var1[1]))).r = Integer.parseInt(var1[2]);
            if (((class_65)this.field_2403.get(Long.valueOf(var1[1]))).r < ((class_65)this.field_2403.get(Long.valueOf(var1[1]))).u) {
               ((class_65)this.field_2403.get(Long.valueOf(var1[1]))).u = ((class_65)this.field_2403.get(Long.valueOf(var1[1]))).r;
            }
            break;
         case 54:
            ((class_65)this.field_2403.get(Long.valueOf(var1[1]))).s = Integer.parseInt(var1[2]);
            if (((class_65)this.field_2403.get(Long.valueOf(var1[1]))).s < ((class_65)this.field_2403.get(Long.valueOf(var1[1]))).v) {
               ((class_65)this.field_2403.get(Long.valueOf(var1[1]))).v = ((class_65)this.field_2403.get(Long.valueOf(var1[1]))).s;
            }
            break;
         case 55:
            class_3.field_20.method_17("res/sound/combat/battle_win.wav");
            this.field_2251 = "Battle Won!";
            this.field_2250 = true;
            this.method_704(class_68.method_625());
            break;
         case 56:
            class_3.field_20.method_17("res/sound/combat/battle_lose.wav");
            this.field_2251 = "Battle Lost!";
            this.field_2250 = true;
            this.method_704(class_68.method_625());
            break;
         case 57:
            class_3.field_20.method_17("res/sound/combat/battle_lose.wav");
            this.field_2251 = "Battle Draw!";
            this.field_2250 = true;
            this.method_704(class_68.method_625());
            break;
         case 58:
            this.method_727(var1[1], var1[2]);
      }
   }

   // $VF: renamed from: a (java.lang.String) void
   public void method_704(String var1) {
      this.field_2450.field_435.write(var1);
      this.field_2450.field_435.flush();
      class_62.method_563("sent: " + var1);
   }

   // $VF: renamed from: a () void
   @Override
   public void method_676() {
   }

   // $VF: renamed from: a (java.lang.String, int) void
   public void method_705(String var1, int var2) {
      String var3 = "res/missions/captions/" + var1 + ".txt";
      class_62.method_563("dir=" + var3);
      String var4 = "";

      try {
         String var5 = "";
         InputStream var6 = this.getClass().getResourceAsStream(var3);
         if (var6 != null) {
            ByteArrayOutputStream var7 = new ByteArrayOutputStream();

            int var8;
            while ((var8 = var6.read()) != -1) {
               var7.write(var8);
            }

            var6.close();
            var5 = new String(var7.toByteArray(), "utf-8");
            class_62.method_563("caption: " + var5);
         }

         if (var5 != null && var5.length() >= 1) {
            String[] var10 = var5.split("\r\n");
            var4 = var10[var2];
         } else {
            var4 = "Caption read exception";
         }

         class_62.method_563("read from item file = " + var4);
      } catch (IOException var9) {
         class_62.method_563(var9.getMessage());
      }

      class_62.method_563("Caption Text => " + var4);
      this.field_2406.method_569(var4, 16777215, 16777215);
   }

   // $VF: renamed from: b (java.lang.String) void
   private void method_706(String var1) {
      this.field_2451.add(var1);
   }

   // $VF: renamed from: b () void
   private void method_707() {
      String var1 = "";
      if (this.field_2451.size() > 0) {
         this.field_2406.method_569("--------------", 16777215, 16777215);
         this.field_2406.method_569("Quest Rewards", 16777215, 16777215);

         for (int var2 = 0; var2 < this.field_2451.size(); var2++) {
            this.field_2406.method_569((String)this.field_2451.get(var2), 16777215, 16777215);
         }
      }
   }

   // $VF: renamed from: c () void
   private void method_708() {
      this.field_2452 = 30;
      this.field_2455 = false;
   }

   // $VF: renamed from: d () void
   private void method_709() {
      this.field_2453 = System.currentTimeMillis() + 1000L;
      this.field_2452 = 30;
      this.field_2455 = true;
   }

   // $VF: renamed from: a (long) void
   private void method_710(long var1) {
      if (this.field_2455 && var1 > this.field_2453) {
         if (this.field_2452 > 0) {
            this.field_2452--;
            this.field_2453 = var1 + 1000L;
         } else {
            this.method_711();
         }
      }
   }

   // $VF: renamed from: e () void
   private void method_711() {
      this.field_2455 = false;
      this.field_2269 = false;
      this.method_718();
      this.method_716();
      this.method_722();
      this.field_2287 = 4;
      this.field_2291 = 4;
      this.field_2295 = 4;
      this.field_2299 = 4;
      this.field_2303 = 4;
      this.field_2307 = 4;
      this.field_2311 = 4;
      class_62.method_563("time's up!");
      this.method_708();
      this.method_704(class_68.method_634());
      ((class_65)this.field_2403.get(this.field_2227.field_1527)).field_1802 = -1;
      if (((class_65)this.field_2403.get(this.field_2227.field_1527)).field_1803 != -1) {
         ((class_64)this.field_2403.get(this.field_2227.field_1527)).field_1688 = ((class_65)this.field_2403.get(this.field_2227.field_1527)).field_1803;
         ((class_65)this.field_2403.get(this.field_2227.field_1527)).field_1803 = -1;
      }
   }

   // $VF: renamed from: a (int, int) int
   public static int method_712(int var0, int var1) {
      int var3 = var0 - var1;
      return field_2419 + var3 * (field_2421 / 2);
   }

   // $VF: renamed from: b (int, int) int
   public static int method_713(int var0, int var1) {
      int var3 = var0 + var1;
      return field_2420 + var3 * (field_2422 / 2);
   }

   // $VF: renamed from: c (int, int) int
   public static int method_714(int var0, int var1) {
      return method_712(var0, var1) + field_2421 / 2;
   }

   // $VF: renamed from: d (int, int) int
   public static int method_715(int var0, int var1) {
      return method_713(var0, var1) + field_2422 / 2;
   }

   // $VF: renamed from: f () void
   private void method_716() {
      for (int var1 = 0; var1 < this.field_2428.length; var1++) {
         for (int var2 = 0; var2 < this.field_2428[0].length; var2++) {
            this.field_2428[var1][var2] = 0L;
         }
      }
   }

   // $VF: renamed from: a (int, int, long) void
   private void method_717(int var1, int var2, long var3) {
      if (var3 != 0L) {
         if (var1 >= 0 && var1 < this.field_2428.length && var2 >= 0 && var2 < this.field_2428[0].length) {
            if (this.field_2243.method_125(var1, var2).method_160() && this.field_2428[var1][var2] < var3) {
               this.field_2428[var1][var2] = var3--;
               this.method_717(var1, var2 + 1, var3);
               this.method_717(var1, var2 - 1, var3);
               this.method_717(var1 + 1, var2, var3);
               this.method_717(var1 - 1, var2, var3);
            }
         }
      }
   }

   // $VF: renamed from: g () void
   private void method_718() {
      for (int var1 = 0; var1 < this.field_2430.length; var1++) {
         for (int var2 = 0; var2 < this.field_2430[0].length; var2++) {
            this.field_2430[var1][var2] = 0L;
         }
      }
   }

   // $VF: renamed from: b (int, int, long) void
   private void method_719(int var1, int var2, long var3) {
      if (var3 != 0L) {
         if (var1 >= 0 && var1 < this.field_2430.length && var2 >= 0 && var2 < this.field_2430[0].length) {
            if ((this.field_2243.method_125(var1, var2).method_160() || !this.field_2243.method_125(var1, var2).method_162())
               && this.field_2430[var1][var2] < var3) {
               this.field_2430[var1][var2] = var3--;
               this.method_719(var1, var2 + 1, var3);
               this.method_719(var1, var2 - 1, var3);
               this.method_719(var1 + 1, var2, var3);
               this.method_719(var1 - 1, var2, var3);
            } else if (!this.field_2243.method_125(var1, var2).method_160()
               && this.field_2243.method_125(var1, var2).method_162()
               && this.field_2430[var1][var2] < var3) {
               this.method_719(var1, var2 + 1, --var3);
               this.method_719(var1, var2 - 1, var3);
               this.method_719(var1 + 1, var2, var3);
               this.method_719(var1 - 1, var2, var3);
            }
         }
      }
   }

   // $VF: renamed from: h () void
   private void method_720() {
      for (int var1 = 0; var1 < this.field_2433.length; var1++) {
         for (int var2 = 0; var2 < this.field_2433[0].length; var2++) {
            this.field_2433[var1][var2] = 0L;
         }
      }
   }

   // $VF: renamed from: c (int, int, long) void
   private void method_721(int var1, int var2, long var3) {
      if (var3 != 0L) {
         if (var1 >= 0 && var1 < this.field_2433.length && var2 >= 0 && var2 < this.field_2433[0].length) {
            if ((this.field_2243.method_125(var1, var2).method_160() || !this.field_2243.method_125(var1, var2).method_162())
               && this.field_2433[var1][var2] < var3) {
               this.field_2433[var1][var2] = var3--;
               this.method_721(var1, var2 + 1, var3);
               this.method_721(var1, var2 - 1, var3);
               this.method_721(var1 + 1, var2, var3);
               this.method_721(var1 - 1, var2, var3);
               this.method_721(var1 - 1, var2 - 1, var3);
               this.method_721(var1 - 1, var2 + 1, var3);
               this.method_721(var1 + 1, var2 - 1, var3);
               this.method_721(var1 + 1, var2 + 1, var3);
            } else if (!this.field_2243.method_125(var1, var2).method_160()
               && this.field_2243.method_125(var1, var2).method_162()
               && this.field_2433[var1][var2] < var3) {
               this.method_721(var1, var2 + 1, --var3);
               this.method_721(var1, var2 - 1, var3);
               this.method_721(var1 + 1, var2, var3);
               this.method_721(var1 - 1, var2, var3);
               this.method_721(var1 - 1, var2 - 1, var3);
               this.method_721(var1 - 1, var2 + 1, var3);
               this.method_721(var1 + 1, var2 - 1, var3);
               this.method_721(var1 + 1, var2 + 1, var3);
            }
         }
      }
   }

   // $VF: renamed from: i () void
   private void method_722() {
      for (int var1 = 0; var1 < this.field_2430.length; var1++) {
         for (int var2 = 0; var2 < this.field_2430[0].length; var2++) {
            this.field_2432[var1][var2] = 0L;
         }
      }
   }

   // $VF: renamed from: d (int, int, long) void
   private void method_723(int var1, int var2, long var3) {
      if (var3 != 0L) {
         if (var1 >= 0 && var1 < this.field_2432.length && var2 >= 0 && var2 < this.field_2432[0].length) {
            if ((this.field_2243.method_125(var1, var2).method_160() || !this.field_2243.method_125(var1, var2).method_162())
               && this.field_2432[var1][var2] < var3) {
               this.field_2432[var1][var2] = var3--;
               this.method_723(var1, var2 + 1, var3);
               this.method_723(var1, var2 - 1, var3);
               this.method_723(var1 + 1, var2, var3);
               this.method_723(var1 - 1, var2, var3);
            }
         }
      }
   }

   // $VF: renamed from: e (int, int) java.awt.Dimension
   private Dimension method_724(int var1, int var2) {
      for (int var3 = 0; var3 < this.field_2428.length; var3++) {
         for (int var4 = 0; var4 < this.field_2428[0].length; var4++) {
            if (var1 > this.field_2243.method_125(var3, var4).method_168()
               && var1 < this.field_2243.method_125(var3, var4).method_168() + field_2421
               && var2 > this.field_2243.method_125(var3, var4).method_170()
               && var2 < this.field_2243.method_125(var3, var4).method_170() + field_2422) {
               try {
                  int[] var5 = new int[1];
                  int var6 = var1 - this.field_2243.method_125(var3, var4).method_168();
                  int var7 = var2 - this.field_2243.method_125(var3, var4).method_170();
                  this.field_2227.field_1552.getRGB(var6, var7, 1, 1, var5, 0, 1);

                  for (int var8 = 0; var8 < var5.length; var8++) {
                     if (var5[var8] != -1) {
                        return new Dimension(var3, var4);
                     }
                  }
               } catch (ArrayIndexOutOfBoundsException var9) {
               }
            }
         }
      }

      return null;
   }

   // $VF: renamed from: a (long, java.lang.String) void
   public void method_725(long var1, String var3) {
      class_62.method_563("playerchat message = " + var3);
      ((class_64)this.field_2403.get(var1)).method_590(var3);
      String var4 = var3;

      try {
         byte[] var5 = var4.getBytes("UTF-8");
         var4 = new String(var5);
      } catch (UnsupportedEncodingException var6) {
         class_62.method_563(var6);
      }

      class_62.method_563("playerchat message2 = " + var4);
      this.field_2258.method_569(((class_64)this.field_2403.get(var1)).field_1683 + ": " + var4, 16711680, 0);
   }

   // $VF: renamed from: b (long, java.lang.String) void
   public void method_726(long var1, String var3) {
      this.field_2258.method_569(((class_64)this.field_2403.get(var1)).field_1683 + ": " + var3, 16711680, 0);
      String var4 = var3;

      try {
         byte[] var5 = var4.getBytes();
         var4 = new String(var5, "UTF-8");
      } catch (UnsupportedEncodingException var6) {
         class_62.method_563(var6);
      }

      ((class_64)this.field_2403.get(var1)).method_590(var4);
   }

   // $VF: renamed from: a (java.lang.String, java.lang.String) void
   public void method_727(String var1, String var2) {
      class_3.field_20.method_17("res/sound/mouse_effects/alert.wav");
      this.field_2258.method_569(var1 + " speaks to you: " + var2, 9831166, 0);
      this.field_2258.method_571((byte)3);
   }

   // $VF: renamed from: a (long, int) void
   public void method_728(long var1, int var3) {
      this.field_2259 = var3;
      String var4 = ((class_64)this.field_2403.get(var1)).field_1683;
      switch (this.field_2259) {
         case 0:
            this.field_2258.method_569(var4 + ": *smiles*", 16711680, 16777011);
            break;
         case 1:
            this.field_2258.method_569(var4 + ": *frowns*", 16711680, 16777011);
            break;
         case 2:
            this.field_2258.method_569(var4 + ": *SOS*", 16711680, 16777011);
            break;
         case 3:
            this.field_2258.method_569(var4 + ": *grateful*", 16711680, 16777011);
            break;
         case 4:
            this.field_2258.method_569(var4 + ": *sobs*", 16711680, 16777011);
            break;
         case 5:
            this.field_2258.method_569(var4 + ": *heart flutters*", 16711680, 16777011);
            break;
         case 6:
            this.field_2258.method_569(var4 + ": *blushes*", 16711680, 16777011);
            break;
         case 7:
            this.field_2258.method_569(var4 + ": *shocked*", 16711680, 16777011);
            break;
         case 8:
            this.field_2258.method_569(var4 + ": *grins*", 16711680, 16777011);
            break;
         case 9:
            this.field_2258.method_569(var4 + ": *yawns*", 16711680, 16777011);
            break;
         case 10:
            this.field_2258.method_569(var4 + ": *waves*", 16711680, 16777011);
      }

      ((class_64)this.field_2403.get(var1)).method_591(this.field_2259);
   }

   // $VF: renamed from: a (long, int, int, java.lang.String) void
   public void method_729(long var1, int var3, int var4, String var5) {
      Enumeration var6 = this.field_2402.elements();

      while (var6.hasMoreElements()) {
         ((class_64)var6.nextElement()).method_587();
      }

      var6 = this.field_2403.elements();

      while (var6.hasMoreElements()) {
         ((class_64)var6.nextElement()).method_587();
      }

      class_65 var7 = (class_65)this.field_2403.get(var1);
      class_29 var8 = this.field_2227.field_1540.method_177(var5);
      int var9 = var8.method_207();
      Vector var10 = var7.method_603();

      for (int var11 = 0; var11 < var10.size(); var11++) {
         if (((class_30)var10.get(var11)).method_234().method_179() == Long.parseLong(var5)) {
            var7.method_602(3, var11, -1);
            break;
         }
      }

      String var14 = var8.method_183();
      class_64[] var12 = this.method_730(var1, var3, var4, var9);
      var7.a(var12, var3, var4, var14);
      this.field_2444 = 0;
      this.field_2445 = (byte)(var12.length + 1);
      this.field_2423 = this.field_2243.method_125(var7.P, var7.Q).method_168();
      this.field_2424 = this.field_2243.method_125(var7.P, var7.Q).method_170();
      if (var7.p == this.field_2227.field_1527) {
         this.field_2291 = 4;
         this.field_2295 = 4;
         this.field_2299 = 4;
         this.field_2303 = 4;
         this.field_2307 = 4;
      }

      this.field_2426 = true;
   }

   // $VF: renamed from: a (java.lang.Long, int, int, int) A[]
   public class_64[] method_730(Long var1, int var2, int var3, int var4) {
      Vector var5 = new Vector();
      Vector var6 = new Vector();
      Vector var7 = new Vector();
      var6.add(var1);

      try {
         Object var8 = this.field_2243.method_127(var2, var3);
         if (var8 != null) {
            if (var8.getClass() == Class.forName("aH")) {
               var6.add(new Long(((class_64)var8).field_1687));
               var5.add((class_64)var8);
            } else if (var8.getClass() == Class.forName("aS")) {
               var7.add(new Long(((class_64)var8).field_1687));
               var5.add((class_64)var8);
            }
         }

         if (var4 > 0) {
            for (int var9 = 1; var9 <= var4; var9++) {
               for (int var10 = 0 - var9; var10 < var9 * 2; var10 += var9) {
                  for (int var11 = 0 - var9; var11 < var9 * 2; var11 += var9) {
                     Object var12 = this.field_2243.method_127(var2 + var10, var3 + var11);
                     if (var12 != null) {
                        if (var12.getClass() == Class.forName("aH")) {
                           var6.add(new Long(((class_64)var12).field_1687));
                           var5.add((class_64)var12);
                        } else if (var12.getClass() == Class.forName("aS")) {
                           var7.add(new Long(((class_64)var12).field_1687));
                           var5.add((class_64)var12);
                        }
                     }
                  }
               }
            }
         }
      } catch (ClassNotFoundException var13) {
      }

      if (var5.size() == 0) {
         this.field_2404 = null;
         this.field_2405 = null;
         return null;
      } else {
         class_64[] var14 = new class_64[var5.size()];

         for (int var15 = 0; var15 < var14.length; var15++) {
            var14[var15] = (class_64)var5.elementAt(var15);
         }

         if (var7.size() == 0) {
            this.field_2404 = null;
         } else {
            this.field_2404 = new long[var7.size()];

            for (int var16 = 0; var16 < this.field_2404.length; var16++) {
               this.field_2404[var16] = (Long)var7.elementAt(var16);
            }
         }

         if (var6.size() == 0) {
            this.field_2405 = null;
         } else {
            this.field_2405 = new long[var6.size()];

            for (int var17 = 0; var17 < this.field_2405.length; var17++) {
               this.field_2405[var17] = (Long)var6.elementAt(var17);
            }
         }

         return var14;
      }
   }

   // $VF: renamed from: a (java.lang.String, byte, byte) void
   public void method_731(String var1, byte var2, byte var3) {
      int var4 = this.field_2331;
      int var5 = this.field_2332 - this.field_2344;
      switch (var2) {
         case 0:
            var4 -= this.field_2335;
            break;
         case 1:
            var4 += 45;
      }

      switch (var3) {
         case 2:
            this.field_2328.method_805(var1, var4, var5, this.field_2335, this.field_2336, MastersOfDestiny.field_2809, null);
      }
   }

   // $VF: renamed from: a (java.awt.event.MouseEvent) void
   @Override
   public void method_677(MouseEvent var1) {
      if (this.field_2250
         && var1.getX() > this.field_2398
         && var1.getX() < this.field_2398 + this.field_2400
         && var1.getY() > this.field_2399
         && var1.getY() < this.field_2399 + this.field_2401) {
         this.field_2228 = 27;
         this.field_2450.method_353(this.field_2227.field_1523, this.field_2227.field_1524);
      }

      if (var1.getX() >= this.field_2252
         && var1.getX() <= this.field_2252 + this.field_2256
         && var1.getY() >= this.field_2253
         && var1.getY() <= this.field_2253 + this.field_2257) {
         this.field_2258.method_571((byte)0);
      } else if (var1.getX() >= this.field_2254
         && var1.getX() <= this.field_2254 + this.field_2256
         && var1.getY() >= this.field_2255
         && var1.getY() <= this.field_2255 + this.field_2257) {
         this.field_2258.method_571((byte)1);
      } else if (var1.getX() > this.field_2357
         && var1.getX() < this.field_2357 + this.field_2361
         && var1.getY() > this.field_2358
         && var1.getY() < this.field_2358 + this.field_2362) {
         this.field_2356.method_571((byte)0);
      } else if (var1.getX() > this.field_2359
         && var1.getX() < this.field_2359 + this.field_2361
         && var1.getY() > this.field_2360
         && var1.getY() < this.field_2360 + this.field_2362) {
         this.field_2356.method_571((byte)1);
      } else {
         for (int var2 = 0; var2 < this.field_2260.length; var2++) {
            if (var1.getX() >= this.field_2260[var2]
               && var1.getX() <= this.field_2260[var2] + this.field_2262
               && var1.getY() >= this.field_2261
               && var1.getY() <= this.field_2261 + this.field_2263) {
               this.method_728(this.field_2227.field_1527, var2);
               this.method_704(class_68.method_633(var2));
               return;
            }
         }

         if (var1.getX() >= this.field_2265
            && var1.getX() <= this.field_2265 + this.field_2267
            && var1.getY() >= this.field_2266
            && var1.getY() <= this.field_2266 + this.field_2268) {
            this.field_2227.field_1545.method_758();
         } else {
            if (this.field_2417) {
               if (var1.getX() >= this.field_2409
                  && var1.getX() <= this.field_2409 + this.field_2411
                  && var1.getY() >= this.field_2410[0]
                  && var1.getY() <= this.field_2410[0] + this.field_2412) {
                  this.field_2406.method_571((byte)0);
                  return;
               }

               if (var1.getX() >= this.field_2409
                  && var1.getX() <= this.field_2409 + this.field_2411
                  && var1.getY() >= this.field_2410[1]
                  && var1.getY() <= this.field_2410[1] + this.field_2412) {
                  this.field_2406.method_571((byte)1);
                  return;
               }

               if (var1.getX() >= this.field_2413
                  && var1.getX() <= this.field_2413 + this.field_2415
                  && var1.getY() >= this.field_2414
                  && var1.getY() <= this.field_2414 + this.field_2416) {
                  this.field_2417 = false;
                  this.field_2406.method_570();
                  return;
               }
            }

            if (var1.getX() >= this.field_2270
               && var1.getX() <= this.field_2270 + this.field_2272
               && var1.getY() >= this.field_2271
               && var1.getY() <= this.field_2271 + this.field_2273) {
               if (this.field_2269) {
                  this.field_2269 = false;
               } else {
                  this.field_2269 = true;
                  if (this.field_2287 == 2) {
                     this.method_716();
                     this.field_2287 = 0;
                  }

                  if (this.field_2291 == 2) {
                     if (this.field_2295 == 2 || this.field_2299 == 3) {
                        this.method_718();
                     }

                     if (this.field_2303 == 3) {
                        this.method_722();
                     }

                     this.field_2291 = 0;
                     this.field_2295 = 4;
                     this.field_2299 = 4;
                     this.field_2303 = 4;
                     this.field_2307 = 4;
                  }
               }
            } else {
               if (this.field_2269) {
                  class_30 var19 = ((class_65)this.field_2403.get(new Long(this.field_2227.field_1527))).method_606();
                  if (this.field_2287 == 0
                     && var1.getX() >= this.field_2289
                     && var1.getX() <= this.field_2289 + this.field_2276
                     && var1.getY() >= this.field_2290
                     && var1.getY() <= this.field_2290 + this.field_2277) {
                     class_62.method_563("moveBtn clicked");
                     int var30 = ((class_64)this.field_2403.get(this.field_2227.field_1527)).field_1717;
                     int var37 = ((class_64)this.field_2403.get(this.field_2227.field_1527)).field_1718;
                     class_62.method_563("startTileX " + var30 + " startTileY " + var37);
                     this.method_716();
                     int var44 = ((class_64)this.field_2403.get(this.field_2227.field_1527)).field_1694;
                     class_62.method_563("availableAP = " + var44);
                     this.method_717(var30, var37 + 1, var44);
                     this.method_717(var30, var37 - 1, var44);
                     this.method_717(var30 + 1, var37, var44);
                     this.method_717(var30 - 1, var37, var44);
                     this.field_2287 = 2;
                     this.field_2269 = false;
                     return;
                  }

                  if (this.field_2291 == 0
                     && var1.getX() >= this.field_2293
                     && var1.getX() <= this.field_2293 + this.field_2276
                     && var1.getY() >= this.field_2294
                     && var1.getY() <= this.field_2294 + this.field_2277) {
                     this.field_2291 = 2;
                     if (var19 != null
                        && Integer.parseInt(var19.method_234().method_203()) <= ((class_65)this.field_2403.get(new Long(this.field_2227.field_1527))).v) {
                        this.field_2295 = 0;
                     } else {
                        this.field_2295 = 4;
                     }

                     this.field_2299 = 0;
                     this.field_2303 = 0;
                     this.field_2307 = 0;
                     class_62.method_563(
                        "((Player)missionPlayers.get(new Long(gameData.characterID))).getSkills().size() - "
                           + ((class_65)this.field_2403.get(new Long(this.field_2227.field_1527))).method_597().size()
                     );
                     Enumeration var29 = ((class_65)this.field_2403.get(new Long(this.field_2227.field_1527))).method_597().elements();

                     while (var29.hasMoreElements()) {
                        class_62.method_563("Skill - " + ((class_7)var29.nextElement()).method_45());
                     }

                     return;
                  }

                  if (this.field_2291 == 2
                     && this.field_2295 == 0
                     && var1.getX() >= this.field_2297
                     && var1.getX() <= this.field_2297 + this.field_2280
                     && var1.getY() >= this.field_2298
                     && var1.getY() <= this.field_2298 + this.field_2281) {
                     int var28 = ((class_64)this.field_2403.get(this.field_2227.field_1527)).field_1717;
                     int var36 = ((class_64)this.field_2403.get(this.field_2227.field_1527)).field_1718;
                     this.method_718();
                     int var43 = 2;
                     if (var19 != null) {
                        var43 = Integer.parseInt(var19.method_234().method_191()) + 1;
                     }

                     this.method_719(var28, var36, var43);
                     this.field_2353 = 1L;
                     this.field_2295 = 2;
                     this.field_2299 = 4;
                     this.field_2303 = 4;
                     this.field_2307 = 4;
                     this.field_2269 = false;
                     return;
                  }

                  if (this.field_2291 == 2
                     && this.field_2299 == 0
                     && var1.getX() >= this.field_2301
                     && var1.getX() <= this.field_2301 + this.field_2280
                     && var1.getY() >= this.field_2302
                     && var1.getY() <= this.field_2302 + this.field_2281) {
                     this.field_2291 = 2;
                     if (var19 != null
                        && Integer.parseInt(var19.method_234().method_203()) <= ((class_65)this.field_2403.get(new Long(this.field_2227.field_1527))).v) {
                        this.field_2295 = 0;
                     } else {
                        this.field_2295 = 4;
                     }

                     this.field_2299 = 2;
                     this.field_2303 = 0;
                     this.field_2307 = 0;
                     this.field_2327 = 0;
                     this.field_2337 = this.field_2339;
                     this.field_2338 = this.field_2340;
                     this.field_2248 = -1;
                     this.field_2249 = -1;
                     this.field_2345 = ((class_65)this.field_2403.get(new Long(this.field_2227.field_1527))).method_597();
                     return;
                  }

                  if (this.field_2291 == 2
                     && this.field_2303 == 0
                     && var1.getX() >= this.field_2305
                     && var1.getX() <= this.field_2305 + this.field_2280
                     && var1.getY() >= this.field_2306
                     && var1.getY() <= this.field_2306 + this.field_2281) {
                     this.field_2291 = 2;
                     if (var19 != null
                        && Integer.parseInt(var19.method_234().method_203()) <= ((class_65)this.field_2403.get(new Long(this.field_2227.field_1527))).v) {
                        this.field_2295 = 0;
                     } else {
                        this.field_2295 = 4;
                     }

                     this.field_2299 = 0;
                     this.field_2303 = 2;
                     this.field_2307 = 0;
                     this.field_2327 = 0;
                     this.field_2337 = this.field_2339;
                     this.field_2338 = this.field_2340;
                     this.field_2248 = -1;
                     this.field_2249 = -1;
                     this.field_2345 = ((class_65)this.field_2403.get(new Long(this.field_2227.field_1527))).method_603();
                     class_62.method_563(
                        "player inventory size 3 = " + ((class_65)this.field_2403.get(new Long(this.field_2227.field_1527))).method_603().size()
                     );
                     class_62.method_563("itemForSelect.size() = " + this.field_2345.size());
                     return;
                  }

                  if (this.field_2291 == 2
                     && this.field_2307 == 0
                     && var1.getX() >= this.field_2309
                     && var1.getX() <= this.field_2309 + this.field_2280
                     && var1.getY() >= this.field_2310
                     && var1.getY() <= this.field_2310 + this.field_2281) {
                     this.field_2291 = 2;
                     if (var19 != null
                        && Integer.parseInt(var19.method_234().method_203()) <= ((class_65)this.field_2403.get(new Long(this.field_2227.field_1527))).v) {
                        this.field_2295 = 0;
                     } else {
                        this.field_2295 = 4;
                     }

                     this.field_2299 = 0;
                     this.field_2303 = 0;
                     this.field_2307 = 2;
                     this.field_2327 = 0;
                     this.field_2337 = this.field_2341;
                     this.field_2338 = this.field_2342;
                     this.field_2248 = -1;
                     this.field_2249 = -1;
                     this.field_2345 = ((class_65)this.field_2403.get(new Long(this.field_2227.field_1527))).method_604();
                     class_62.method_563("itemForSelect.size() = " + this.field_2345.size());
                     this.field_2346 = ((class_65)this.field_2403.get(new Long(this.field_2227.field_1527))).method_606();
                     return;
                  }

                  if (this.field_2311 == 0
                     && var1.getX() >= this.field_2313
                     && var1.getX() <= this.field_2313 + this.field_2276
                     && var1.getY() >= this.field_2314
                     && var1.getY() <= this.field_2314 + this.field_2277) {
                     this.method_704(class_68.method_634());
                     ((class_65)this.field_2403.get(this.field_2227.field_1527)).field_1802 = -1;
                     if (((class_65)this.field_2403.get(this.field_2227.field_1527)).field_1803 != -1) {
                        ((class_64)this.field_2403.get(this.field_2227.field_1527)).field_1688 = ((class_65)this.field_2403.get(this.field_2227.field_1527)).field_1803;
                        ((class_65)this.field_2403.get(this.field_2227.field_1527)).field_1803 = -1;
                     }

                     this.method_708();
                     this.method_718();
                     this.method_716();
                     this.field_2287 = 4;
                     this.field_2291 = 4;
                     this.field_2295 = 4;
                     this.field_2299 = 4;
                     this.field_2303 = 4;
                     this.field_2307 = 4;
                     this.field_2311 = 4;
                     this.field_2269 = false;
                     return;
                  }

                  if (this.field_2299 == 2 || this.field_2303 == 2 || this.field_2307 == 2) {
                     for (int var3 = 0; var3 < this.field_2322.length; var3++) {
                        if (var1.getX() >= this.field_2321
                           && var1.getX() <= this.field_2321 + this.field_2325
                           && var1.getY() >= this.field_2322[var3]
                           && var1.getY() <= this.field_2322[var3] + this.field_2326) {
                           switch (var3) {
                              case 0:
                                 if (this.field_2327 > 0) {
                                    this.field_2327--;
                                 }

                                 return;
                              case 1:
                                 if (this.field_2337.length * (this.field_2327 + this.field_2338.length) < this.field_2345.size()) {
                                    this.field_2327++;
                                 }

                                 return;
                           }
                        }
                     }
                  }

                  if (this.field_2303 == 2) {
                     int var21 = this.field_2327 * this.field_2337.length;

                     for (int var4 = 0; var4 < this.field_2338.length; var4++) {
                        for (int var5 = 0; var5 < this.field_2337.length; var5++) {
                           if (var1.getX() >= this.field_2337[var5]
                              && var1.getX() <= this.field_2337[var5] + this.field_2343
                              && var1.getY() >= this.field_2338[var4]
                              && var1.getY() <= this.field_2338[var4] + this.field_2344) {
                              class_62.method_563("x=" + var5 + "; y=" + var4);
                              int var6 = var21 + var4 * this.field_2337.length + var5;
                              class_62.method_563("indx=" + var6);
                              class_62.method_563("itemForSelect.size()=" + this.field_2345.size());
                              if (var6 < this.field_2345.size()) {
                                 class_30 var7 = (class_30)this.field_2345.elementAt(var6);
                                 class_65 var8 = (class_65)this.field_2403.get(this.field_2227.field_1527);
                                 int var9 = var8.t;
                                 if (var9 >= Integer.parseInt(var7.method_234().method_201())) {
                                    int var10 = ((class_64)this.field_2403.get(this.field_2227.field_1527)).field_1717;
                                    int var11 = ((class_64)this.field_2403.get(this.field_2227.field_1527)).field_1718;
                                    this.method_718();
                                    int var12 = Integer.parseInt(var7.method_234().method_191()) + 1;
                                    class_62.method_563("range=" + var12);
                                    this.field_2353 = var7.method_234().method_179();
                                    if (var12 == 1) {
                                       this.method_708();
                                       if (this.field_2287 == 0) {
                                          this.field_2287 = 1;
                                       }

                                       this.field_2291 = 1;
                                       this.field_2295 = 1;
                                       this.field_2299 = 1;
                                       this.field_2303 = 1;
                                       this.field_2307 = 1;
                                       this.field_2311 = 1;
                                       this.field_2232 = this.field_2353;
                                       this.method_704(class_68.method_629(this.field_2353, var8.P, var8.Q));
                                    } else {
                                       this.method_719(var10, var11, var12);
                                       this.field_2248 = this.field_2337[var5];
                                       this.field_2249 = this.field_2338[var4];
                                       this.field_2230 = var6;
                                       this.field_2303 = 3;
                                    }

                                    this.field_2269 = false;
                                 } else if (this.field_2356 != null) {
                                    this.field_2356.method_569("You haven't reached the level requirement of this item!", 16711680, 16711680);
                                    this.field_2356.method_571((byte)3);
                                 }
                              }

                              return;
                           }
                        }
                     }
                  }

                  if (this.field_2299 == 2) {
                     class_62.method_563("skill in progress");
                     int var22 = this.field_2327 * this.field_2337.length;
                     class_62.method_563("itemIndx=" + var22);

                     for (int var31 = 0; var31 < this.field_2338.length; var31++) {
                        for (int var38 = 0; var38 < this.field_2337.length; var38++) {
                           if (var1.getX() >= this.field_2337[var38]
                              && var1.getX() <= this.field_2337[var38] + this.field_2343
                              && var1.getY() >= this.field_2338[var31]
                              && var1.getY() <= this.field_2338[var31] + this.field_2344) {
                              class_62.method_563("x=" + var38 + "; y=" + var31);
                              int var45 = var22 + var31 * this.field_2337.length + var38;
                              class_62.method_563("indx=" + var45);
                              class_62.method_563("itemForSelect.size()=" + this.field_2345.size());
                              if (var45 < this.field_2345.size()) {
                                 class_7 var50 = (class_7)this.field_2345.elementAt(var45);
                                 if (var50.method_70() <= ((class_65)this.field_2403.get(new Long(this.field_2227.field_1527))).v && !var50.method_75()) {
                                    int var51 = ((class_64)this.field_2403.get(this.field_2227.field_1527)).field_1717;
                                    int var52 = ((class_64)this.field_2403.get(this.field_2227.field_1527)).field_1718;
                                    this.method_718();
                                    int var53 = (int)var50.method_52() + 1;
                                    if (var53 == 1) {
                                       this.method_718();
                                       this.method_708();
                                       this.field_2269 = false;
                                       this.field_2353 = var50.method_43();
                                       this.field_2248 = this.field_2337[var38];
                                       this.field_2249 = this.field_2338[var31];
                                       this.field_2230 = var45;
                                       if (this.field_2287 == 0) {
                                          this.field_2287 = 1;
                                       }

                                       this.field_2291 = 1;
                                       this.field_2295 = 1;
                                       this.field_2299 = 1;
                                       this.field_2303 = 1;
                                       this.field_2307 = 1;
                                       this.field_2311 = 1;
                                       this.field_2231 = this.field_2353;
                                       this.method_704(class_68.method_627(this.field_2353, var51, var52));
                                       class_62.method_563("aoe skill used: x=" + var51 + "; y=" + var52);
                                    } else {
                                       if (var53 == 0) {
                                          var53 = Integer.parseInt(
                                                ((class_65)this.field_2403.get(new Long(this.field_2227.field_1527))).method_606().method_234().method_191()
                                             )
                                             + 1;
                                          this.method_719(var51, var52, var53);
                                       } else {
                                          this.method_719(var51, var52, var53);
                                       }

                                       class_62.method_563("range=" + var53);
                                       class_62.method_563("skillid=" + var50.method_43());
                                       this.field_2353 = var50.method_43();
                                       this.field_2248 = this.field_2337[var38];
                                       this.field_2249 = this.field_2338[var31];
                                       this.field_2230 = var45;
                                       this.field_2299 = 3;
                                       this.field_2269 = false;
                                    }
                                 } else if (var50.method_70() > ((class_65)this.field_2403.get(new Long(this.field_2227.field_1527))).v
                                    && !var50.method_75()
                                    && this.field_2356 != null) {
                                    this.field_2356.method_569("You don't have enough energy to execute this skill!", 16711680, 16711680);
                                    this.field_2356.method_571((byte)3);
                                 }
                              }

                              return;
                           }
                        }
                     }
                  }
               }

               Dimension var20 = this.method_724(var1.getX(), var1.getY());
               this.method_720();
               if (this.field_2303 == 3) {
                  if (var20 != null) {
                     if (this.field_2430[var20.width][var20.height] > 0L) {
                        this.method_718();
                        class_30 var27 = (class_30)this.field_2345.elementAt(this.field_2230);
                        byte var35 = Byte.parseByte(var27.method_234().method_185());
                        class_65 var42 = (class_65)this.field_2403.get(this.field_2227.field_1527);
                        if (var35 == 1) {
                           try {
                              Object var48 = this.field_2243.method_127(var20.width, var20.height);
                              if (var48 == null) {
                                 this.field_2291 = 0;
                                 this.field_2295 = 4;
                                 this.field_2299 = 4;
                                 this.field_2303 = 4;
                                 this.field_2307 = 4;
                                 this.field_2269 = true;
                              } else if (var48.getClass() == Class.forName("aS")
                                 || var48.getClass() == Class.forName("aH") && ((class_64)var48).field_1698 != var42.A) {
                                 this.method_708();
                                 if (this.field_2287 == 0) {
                                    this.field_2287 = 1;
                                 }

                                 this.field_2291 = 1;
                                 this.field_2295 = 1;
                                 this.field_2299 = 1;
                                 this.field_2303 = 1;
                                 this.field_2307 = 1;
                                 this.field_2311 = 1;
                                 this.field_2232 = this.field_2353;
                                 this.method_704(class_68.method_629(this.field_2353, var20.width, var20.height));
                              }
                           } catch (ClassNotFoundException var16) {
                           }
                        } else if (var35 == 2) {
                           try {
                              Object var49 = this.field_2243.method_127(var20.width, var20.height);
                              if (var49 == null) {
                                 this.field_2291 = 0;
                                 this.field_2295 = 4;
                                 this.field_2299 = 4;
                                 this.field_2303 = 4;
                                 this.field_2307 = 4;
                                 this.field_2269 = true;
                              } else if (var49.getClass() == Class.forName("aH") && ((class_64)var49).field_1698 == var42.A) {
                                 this.method_708();
                                 if (this.field_2287 == 0) {
                                    this.field_2287 = 1;
                                 }

                                 this.field_2291 = 1;
                                 this.field_2295 = 1;
                                 this.field_2299 = 1;
                                 this.field_2303 = 1;
                                 this.field_2307 = 1;
                                 this.field_2311 = 1;
                                 this.field_2232 = this.field_2353;
                                 this.method_704(class_68.method_629(this.field_2353, var20.width, var20.height));
                              }
                           } catch (ClassNotFoundException var13) {
                           }
                        }
                     }
                  } else {
                     this.method_718();
                     this.field_2291 = 0;
                     this.field_2295 = 4;
                     this.field_2299 = 4;
                     this.field_2303 = 4;
                     this.field_2307 = 4;
                     this.field_2269 = true;
                  }

                  this.field_2230 = -1;
               } else if (this.field_2295 == 2) {
                  try {
                     if (var20 != null) {
                        if (this.field_2430[var20.width][var20.height] > 0L) {
                           this.method_718();
                           Object var26 = this.field_2243.method_127(var20.width, var20.height);
                           class_62.method_563("object on tile = " + var26);
                           class_65 var34 = (class_65)this.field_2403.get(this.field_2227.field_1527);
                           if (var26 == null) {
                              this.field_2291 = 0;
                              this.field_2295 = 4;
                              this.field_2299 = 4;
                              this.field_2303 = 4;
                              this.field_2307 = 4;
                              this.field_2269 = true;
                           } else if (var26.getClass() == Class.forName("aS")
                              || var26.getClass() == Class.forName("aH") && ((class_64)var26).field_1698 != var34.A) {
                              this.method_708();
                              if (this.field_2287 == 0) {
                                 this.field_2287 = 1;
                              }

                              this.field_2291 = 1;
                              this.field_2295 = 1;
                              this.field_2299 = 1;
                              this.field_2303 = 1;
                              this.field_2307 = 1;
                              this.field_2311 = 1;
                              this.method_704(class_68.method_627(this.field_2353, var20.width, var20.height));
                           }
                        }
                     } else {
                        this.method_718();
                        this.field_2291 = 0;
                        this.field_2295 = 4;
                        this.field_2299 = 4;
                        this.field_2303 = 4;
                        this.field_2307 = 4;
                        this.field_2269 = true;
                     }
                  } catch (ClassNotFoundException var17) {
                  }
               } else if (this.field_2299 != 3) {
                  if (this.field_2287 == 2) {
                     if (var20 != null) {
                        if (this.field_2428[var20.width][var20.height] > 0L) {
                           this.method_716();
                           int var25 = ((class_64)this.field_2403.get(this.field_2227.field_1527)).field_1717;
                           int var33 = ((class_64)this.field_2403.get(this.field_2227.field_1527)).field_1718;
                           byte var40 = 0;
                           if (var20.width > var25) {
                              if (var20.height > var33) {
                                 var40 = 2;
                              } else {
                                 var40 = 3;
                              }
                           } else if (var20.height > var33) {
                              var40 = 1;
                           } else {
                              var40 = 0;
                           }

                           this.method_708();
                           this.field_2287 = 1;
                           if (this.field_2291 == 0) {
                              this.field_2291 = 1;
                              this.field_2295 = 1;
                              this.field_2299 = 1;
                              this.field_2303 = 1;
                              this.field_2307 = 1;
                           }

                           this.field_2311 = 1;
                           this.method_704(class_68.method_624(var20.width, var20.height, var40));
                        } else {
                           this.method_716();
                           this.field_2287 = 0;
                           this.field_2269 = true;
                        }
                     } else {
                        this.method_716();
                        this.field_2287 = 0;
                        this.field_2269 = true;
                     }
                  } else {
                     try {
                        if (var20 != null) {
                           Object var24 = this.field_2243.method_127(var20.width, var20.height);
                           if (var24 != null) {
                              if (var24.getClass() == Class.forName("aH")) {
                                 this.field_2394 = false;
                                 this.field_2393 = ((class_64)var24).field_1687;
                                 if (this.field_2393 == this.field_2227.field_1527) {
                                    this.field_2393 = -1L;
                                 }
                              } else if (var24.getClass() == Class.forName("aS")) {
                                 this.field_2394 = true;
                                 this.field_2393 = ((class_64)var24).field_1687;
                                 class_62.method_563("mouseOver monster - " + this.field_2393);
                              } else {
                                 this.field_2393 = -1L;
                              }
                           } else {
                              this.field_2393 = -1L;
                           }
                        } else {
                           this.field_2393 = -1L;
                        }
                     } catch (ClassNotFoundException var15) {
                        if (var1.getX() == this.field_2446 && var1.getY() == this.field_2447 && this.field_2448 >= System.currentTimeMillis()) {
                           this.method_732(var1);
                           class_62.method_563("double click ");
                           this.field_2446 = 0;
                           this.field_2447 = 0;
                           this.field_2448 = 0L;
                        } else {
                           this.field_2446 = var1.getX();
                           this.field_2447 = var1.getY();
                           this.field_2448 = System.currentTimeMillis() + 300L;
                           class_62.method_563("first click");
                        }
                     }
                  }
               } else {
                  class_65 var23 = (class_65)this.field_2403.get(this.field_2227.field_1527);
                  if (var20 != null) {
                     if (this.field_2430[var20.width][var20.height] > 0L) {
                        this.method_718();
                        class_7 var32 = (class_7)this.field_2345.elementAt(this.field_2230);
                        byte var39 = (byte)var32.method_56();
                        if (var39 == 1) {
                           try {
                              Object var46 = this.field_2243.method_127(var20.width, var20.height);
                              if (var46 == null) {
                                 this.field_2291 = 0;
                                 this.field_2295 = 4;
                                 this.field_2299 = 4;
                                 this.field_2303 = 4;
                                 this.field_2307 = 4;
                                 this.field_2269 = true;
                              } else if (var46.getClass() == Class.forName("aS")
                                 || var46.getClass() == Class.forName("aH") && ((class_64)var46).field_1698 != var23.A) {
                                 this.method_708();
                                 if (this.field_2287 == 0) {
                                    this.field_2287 = 1;
                                 }

                                 this.field_2291 = 1;
                                 this.field_2295 = 1;
                                 this.field_2299 = 1;
                                 this.field_2303 = 1;
                                 this.field_2307 = 1;
                                 this.field_2311 = 1;
                                 this.field_2231 = this.field_2353;
                                 this.method_704(class_68.method_627(this.field_2353, var20.width, var20.height));
                              }
                           } catch (ClassNotFoundException var18) {
                           }
                        } else if (var39 == 2) {
                           try {
                              Object var47 = this.field_2243.method_127(var20.width, var20.height);
                              if (var47 == null) {
                                 this.field_2291 = 0;
                                 this.field_2295 = 4;
                                 this.field_2299 = 4;
                                 this.field_2303 = 4;
                                 this.field_2307 = 4;
                                 this.field_2269 = true;
                              } else if (var47.getClass() == Class.forName("aH") && ((class_64)var47).field_1698 == var23.A) {
                                 this.method_708();
                                 if (this.field_2287 == 0) {
                                    this.field_2287 = 1;
                                 }

                                 this.field_2291 = 1;
                                 this.field_2295 = 1;
                                 this.field_2299 = 1;
                                 this.field_2303 = 1;
                                 this.field_2307 = 1;
                                 this.field_2311 = 1;
                                 this.field_2231 = this.field_2353;
                                 this.method_704(class_68.method_627(this.field_2353, var20.width, var20.height));
                              }
                           } catch (ClassNotFoundException var14) {
                           }
                        } else {
                           this.method_708();
                           if (this.field_2287 == 0) {
                              this.field_2287 = 1;
                           }

                           this.field_2291 = 1;
                           this.field_2295 = 1;
                           this.field_2299 = 1;
                           this.field_2303 = 1;
                           this.field_2307 = 1;
                           this.field_2311 = 1;
                           this.field_2231 = this.field_2353;
                           this.method_704(class_68.method_627(this.field_2353, var20.width, var20.height));
                        }
                     }
                  } else {
                     this.method_718();
                     this.field_2291 = 0;
                     this.field_2295 = 4;
                     this.field_2299 = 4;
                     this.field_2303 = 4;
                     this.field_2307 = 4;
                     this.field_2269 = true;
                  }

                  this.field_2230 = -1;
               }
            }
         }
      }
   }

   // $VF: renamed from: f (java.awt.event.MouseEvent) void
   public void method_732(MouseEvent var1) {
      if (this.field_2269) {
         if (this.field_2291 == 2 && this.field_2299 == 2) {
            int var10 = this.field_2327 * this.field_2337.length;

            for (int var12 = 0; var12 < this.field_2338.length; var12++) {
               for (int var14 = 0; var14 < this.field_2337.length; var14++) {
                  if (var1.getX() >= this.field_2337[var14]
                     && var1.getX() <= this.field_2337[var14] + this.field_2343
                     && var1.getY() >= this.field_2338[var12]
                     && var1.getY() <= this.field_2338[var12] + this.field_2344
                     && var10 < this.field_2345.size()) {
                     this.field_2353 = ((class_7)this.field_2345.elementAt(var10)).method_43();
                     int var15 = ((class_64)this.field_2403.get(this.field_2227.field_1527)).field_1717;
                     int var16 = ((class_64)this.field_2403.get(this.field_2227.field_1527)).field_1718;
                     long var17 = ((class_7)this.field_2345.elementAt(var10)).method_52();
                     this.method_719(var15, var16 + 1, var17);
                     this.method_719(var15, var16 - 1, var17);
                     this.method_719(var15 + 1, var16, var17);
                     this.method_719(var15 - 1, var16, var17);
                     this.field_2269 = false;
                     this.field_2299 = 3;
                  }
               }
            }

            return;
         }

         if (this.field_2291 == 2 && this.field_2303 == 2) {
            int var9 = this.field_2327 * this.field_2337.length;

            for (int var11 = 0; var11 < this.field_2338.length; var11++) {
               for (int var13 = 0; var13 < this.field_2337.length; var13++) {
                  if (var1.getX() >= this.field_2337[var13]
                     && var1.getX() <= this.field_2337[var13] + this.field_2343
                     && var1.getY() >= this.field_2338[var11]
                     && var1.getY() <= this.field_2338[var11] + this.field_2344
                     && var9 < this.field_2345.size()) {
                     this.field_2353 = ((class_30)this.field_2345.elementAt(var9)).field_322.method_179();
                     int var5 = ((class_64)this.field_2403.get(this.field_2227.field_1527)).field_1717;
                     int var6 = ((class_64)this.field_2403.get(this.field_2227.field_1527)).field_1718;
                     long var7 = Long.parseLong(((class_30)this.field_2345.elementAt(var9)).method_234().method_191());
                     this.method_723(var5, var6 + 1, var7);
                     this.method_723(var5, var6 - 1, var7);
                     this.method_723(var5 + 1, var6, var7);
                     this.method_723(var5 - 1, var6, var7);
                     this.field_2269 = false;
                     this.field_2303 = 3;
                  }
               }
            }

            return;
         }

         if (this.field_2291 == 2 && this.field_2307 == 2) {
            int var2 = this.field_2327 * this.field_2337.length;

            for (int var3 = 0; var3 < this.field_2338.length; var3++) {
               for (int var4 = 0; var4 < this.field_2337.length; var4++) {
                  if (var1.getX() >= this.field_2337[var4]
                     && var1.getX() <= this.field_2337[var4] + this.field_2343
                     && var1.getY() >= this.field_2338[var3]
                     && var1.getY() <= this.field_2338[var3] + this.field_2344) {
                     class_62.method_563("change equip = " + var2);
                     if (var2 < this.field_2345.size()) {
                        this.method_704(class_68.method_630(((class_30)this.field_2345.elementAt(var2)).field_322.method_179(), this.field_2346.method_240()));
                        if (this.field_2287 == 0) {
                           this.field_2287 = 1;
                        }

                        this.field_2291 = 1;
                        this.field_2295 = 1;
                        this.field_2299 = 1;
                        this.field_2303 = 1;
                        this.field_2307 = 1;
                        this.field_2311 = 1;
                        this.field_2269 = false;
                     }

                     return;
                  }

                  var2++;
               }
            }
         }
      }
   }

   // $VF: renamed from: b (java.awt.event.MouseEvent) void
   @Override
   public void method_678(MouseEvent var1) {
      if (!this.field_2426) {
         this.method_720();
         Dimension var2 = this.method_724(var1.getX(), var1.getY());
         if (var2 == null) {
            this.field_2423 = 0;
            this.field_2424 = 0;
         } else {
            this.field_2423 = this.field_2243.method_125(var2.width, var2.height).method_168();
            this.field_2424 = this.field_2243.method_125(var2.width, var2.height).method_170();
         }

         if (this.field_2303 == 3 && var2 != null && this.field_2430[var2.width][var2.height] > 0L) {
            class_30 var10 = (class_30)this.field_2345.elementAt(this.field_2230);
            int var14 = var10.method_234().method_207();
            if (var14 > 0) {
               this.method_721(var2.width, var2.height, var14);
            }

            return;
         }

         if (this.field_2299 == 3 && var2 != null && this.field_2430[var2.width][var2.height] > 0L) {
            class_7 var9 = (class_7)this.field_2345.elementAt(this.field_2230);
            int var13 = (int)var9.method_72();
            if (var13 > 0) {
               this.method_721(var2.width, var2.height, var13 + 1);
            }

            return;
         }

         if (this.field_2299 == 2) {
            int var3 = this.field_2327 * this.field_2337.length;

            for (int var4 = 0; var4 < this.field_2338.length; var4++) {
               for (int var5 = 0; var5 < this.field_2337.length; var5++) {
                  if (var1.getX() >= this.field_2337[var5]
                     && var1.getX() <= this.field_2337[var5] + this.field_2343
                     && var1.getY() >= this.field_2338[var4]
                     && var1.getY() <= this.field_2338[var4] + this.field_2344) {
                     if (var3 < this.field_2345.size()) {
                        this.field_2331 = this.field_2337[var5];
                        this.field_2332 = this.field_2338[var4];
                        if (this.field_2331 + this.field_2343 + this.field_2335 < 760) {
                           this.method_731(((class_7)this.field_2345.elementAt(var3)).method_77(), (byte)1, this.field_2328.field_3010);
                        } else {
                           this.method_731(((class_7)this.field_2345.elementAt(var3)).method_77(), (byte)0, this.field_2328.field_3010);
                        }
                     }

                     return;
                  }

                  var3++;
               }
            }
         }

         if (this.field_2303 == 2) {
            int var7 = this.field_2327 * this.field_2337.length;

            for (int var11 = 0; var11 < this.field_2338.length; var11++) {
               for (int var15 = 0; var15 < this.field_2337.length; var15++) {
                  if (var1.getX() >= this.field_2337[var15]
                     && var1.getX() <= this.field_2337[var15] + this.field_2343
                     && var1.getY() >= this.field_2338[var11]
                     && var1.getY() <= this.field_2338[var11] + this.field_2344) {
                     if (var7 < this.field_2345.size()) {
                        this.field_2331 = this.field_2337[var15];
                        this.field_2332 = this.field_2338[var11];
                        if (var15 < this.field_2337.length / 2) {
                           this.method_731(((class_30)this.field_2345.elementAt(var7)).method_243(), (byte)1, this.field_2328.field_3010);
                        } else {
                           this.method_731(((class_30)this.field_2345.elementAt(var7)).method_243(), (byte)0, this.field_2328.field_3010);
                        }
                     }

                     return;
                  }

                  var7++;
               }
            }
         }

         if (this.field_2307 == 2) {
            int var8 = this.field_2327 * this.field_2337.length;

            for (int var12 = 0; var12 < this.field_2338.length; var12++) {
               for (int var16 = 0; var16 < this.field_2337.length; var16++) {
                  if (var1.getX() >= this.field_2337[var16]
                     && var1.getX() <= this.field_2337[var16] + this.field_2343
                     && var1.getY() >= this.field_2338[var12]
                     && var1.getY() <= this.field_2338[var12] + this.field_2344) {
                     if (var8 < this.field_2345.size()) {
                        this.field_2331 = this.field_2337[var16];
                        this.field_2332 = this.field_2338[var12];
                        if (var16 < this.field_2337.length / 2) {
                           this.method_731(((class_30)this.field_2345.elementAt(var8)).method_243(), (byte)1, this.field_2328.field_3010);
                        } else {
                           this.method_731(((class_30)this.field_2345.elementAt(var8)).method_243(), (byte)0, this.field_2328.field_3010);
                        }
                     }

                     return;
                  }

                  var8++;
               }
            }

            if (var1.getX() >= this.field_2347
               && var1.getX() <= this.field_2347 + this.field_2343
               && var1.getY() >= this.field_2348
               && var1.getY() <= this.field_2348 + this.field_2344) {
               this.field_2331 = this.field_2347;
               this.field_2332 = this.field_2348;
               if (this.field_2346 != null) {
                  this.method_731(this.field_2346.method_243(), (byte)1, this.field_2328.field_3010);
               }

               return;
            }
         }

         this.method_731(null, (byte)1, this.field_2328.field_3010);
      }

      this.field_2259 = -1;

      for (int var6 = 0; var6 < this.field_2260.length; var6++) {
         if (var1.getX() >= this.field_2260[var6]
            && var1.getX() <= this.field_2260[var6] + this.field_2262
            && var1.getY() >= this.field_2261
            && var1.getY() <= this.field_2261 + this.field_2263) {
            this.field_2259 = var6;
            return;
         }
      }
   }

   // $VF: renamed from: c (java.awt.event.MouseEvent) void
   @Override
   public void method_679(MouseEvent var1) {
      if (this.field_2269 && this.field_2307 == 2) {
         int var2 = this.field_2327 * this.field_2337.length;

         for (int var3 = 0; var3 < this.field_2338.length; var3++) {
            for (int var4 = 0; var4 < this.field_2337.length; var4++) {
               if (var1.getX() >= this.field_2337[var4]
                  && var1.getX() <= this.field_2337[var4] + this.field_2343
                  && var1.getY() >= this.field_2338[var3]
                  && var1.getY() <= this.field_2338[var3] + this.field_2344) {
                  if (var2 < this.field_2345.size()) {
                     this.field_2349 = (class_30)this.field_2345.elementAt(var2);
                     this.field_2350 = this.field_2337[var4];
                     this.field_2351 = this.field_2338[var3];
                     this.field_2352 = true;
                     this.method_731(null, (byte)1, this.field_2328.field_3010);
                  }

                  return;
               }

               var2++;
            }
         }

         if (var1.getX() >= this.field_2347
            && var1.getX() <= this.field_2347 + this.field_2343
            && var1.getY() >= this.field_2348
            && var1.getY() <= this.field_2348 + this.field_2344) {
            this.field_2349 = this.field_2346;
            this.field_2350 = this.field_2347;
            this.field_2351 = this.field_2348;
            this.field_2346 = null;
            this.field_2352 = false;
            this.method_731(null, (byte)1, this.field_2328.field_3010);
            return;
         }
      }

      if (var1.getX() == this.field_2446 && var1.getY() == this.field_2447 && this.field_2448 >= System.currentTimeMillis()) {
         this.method_732(var1);
         class_62.method_563("double click ");
         this.field_2446 = 0;
         this.field_2447 = 0;
         this.field_2448 = 0L;
      } else {
         this.field_2446 = var1.getX();
         this.field_2447 = var1.getY();
         this.field_2448 = System.currentTimeMillis() + 300L;
         class_62.method_563("first click");
      }
   }

   // $VF: renamed from: d (java.awt.event.MouseEvent) void
   @Override
   public void method_680(MouseEvent var1) {
      if (this.field_2269 && this.field_2307 == 2 && this.field_2349 != null) {
         if (this.field_2352) {
            if (var1.getX() >= this.field_2347
               && var1.getX() <= this.field_2347 + this.field_2343
               && var1.getY() >= this.field_2348
               && var1.getY() <= this.field_2348 + this.field_2344) {
               this.method_704(class_68.method_630(this.field_2349.field_322.method_179(), 3));
               if (this.field_2287 == 0) {
                  this.field_2287 = 1;
               }

               this.field_2291 = 1;
               this.field_2295 = 1;
               this.field_2299 = 1;
               this.field_2303 = 1;
               this.field_2307 = 1;
               this.field_2311 = 1;
               this.field_2269 = false;
            }
         } else if (var1.getX() >= this.field_2337[0]
            && var1.getX() <= this.field_2337[2] + this.field_2343
            && var1.getY() >= this.field_2338[0]
            && var1.getY() <= this.field_2338[1] + this.field_2344) {
            this.method_704(class_68.method_630(this.field_2349.method_234().method_179(), 0));
            if (this.field_2287 == 0) {
               this.field_2287 = 1;
            }

            this.field_2291 = 1;
            this.field_2295 = 1;
            this.field_2299 = 1;
            this.field_2303 = 1;
            this.field_2307 = 1;
            this.field_2311 = 1;
            this.field_2269 = false;
         } else {
            this.field_2346 = this.field_2349;
         }

         this.field_2349 = null;
      }
   }

   // $VF: renamed from: e (java.awt.event.MouseEvent) void
   @Override
   public void method_681(MouseEvent var1) {
      if (this.field_2349 != null) {
         this.field_2350 = var1.getX() - 22;
         this.field_2351 = var1.getY() - 22;
      }
   }

   // $VF: renamed from: a (java.lang.String, java.lang.String, java.lang.String) void
   private void method_733(String var1, String var2, String var3) {
      class_29 var4 = this.field_2227.field_1540.method_177(var2);
      class_30 var5 = new class_30();
      var5.method_233(var4);
      var5.method_235(Integer.parseInt(var3));
      ((class_65)this.field_2403.get(Long.valueOf(var1))).method_600(var5);
      var4 = null;
   }

   // $VF: renamed from: a (java.awt.event.KeyEvent) void
   @Override
   public void method_682(KeyEvent var1) {
   }

   // $VF: renamed from: b (java.awt.event.KeyEvent) void
   @Override
   public void method_683(KeyEvent var1) {
   }

   // $VF: renamed from: c (java.awt.event.KeyEvent) void
   @Override
   public void method_684(KeyEvent var1) {
   }
}
