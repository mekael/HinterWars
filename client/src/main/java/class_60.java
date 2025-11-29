import java.awt.Graphics;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

// $VF: renamed from: j
public class class_60 {
   // $VF: renamed from: b j
   private static class_60 field_1650 = null;
   // $VF: renamed from: c boolean
   private boolean field_1651 = false;
   // $VF: renamed from: a aE
   protected class_33 field_1652;
   // $VF: renamed from: d java.util.Vector[]
   private Vector[] field_1653;
   // $VF: renamed from: e java.util.Vector
   private Vector field_1654 = new Vector();
   // $VF: renamed from: f java.util.Vector
   private Vector field_1655 = new Vector();

   // $VF: renamed from: a () j
   public static class_60 method_550() {
      if (field_1650 == null) {
         field_1650 = new class_60();
      }

      return field_1650;
   }

   private class_60() {
      this.field_1652 = null;
   }

   // $VF: renamed from: a (aE) void
   public void method_551(class_33 var1) {
      this.field_1652 = var1;
   }

   // $VF: renamed from: b () aE
   public class_33 method_552() {
      return this.field_1652;
   }

   // $VF: renamed from: a (java.lang.Class) ac
   public class_86 method_553(Class var1) {
      try {
         class_86 var2 = null;
         Enumeration var3 = this.field_1654.elements();

         while (var3.hasMoreElements()) {
            var2 = (class_86)var3.nextElement();
            if (var2.method_796() && var2.getClass() == var1) {
               var2.field_2992 = 0;
               var2.method_790();
               return var2;
            }
         }

         var2 = (class_86)var1.newInstance();
         var2.field_2992 = 0;
         var2.method_790();
         this.field_1654.addElement(var2);
         return var2;
      } catch (Exception var4) {
         class_62.method_563("spawnEntity exception: " + var4.getMessage());
         return null;
      }
   }

   // $VF: renamed from: c () void
   public void method_554() {
      this.field_1654.removeAllElements();
      this.field_1655.removeAllElements();
   }

   // $VF: renamed from: b (java.lang.Class) void
   public void method_555(Class var1) {
      Enumeration var2 = this.field_1654.elements();

      while (var2.hasMoreElements()) {
         class_86 var3 = (class_86)var2.nextElement();
         if (var3.method_795() && var3.getClass() == var1) {
            var3.method_798();
         }
      }
   }

   // $VF: renamed from: a (aN) void
   public void method_556(class_0 var1) {
      this.field_1655.addElement(var1);
   }

   // $VF: renamed from: a (int, ac) void
   public void method_557(int var1, class_86 var2) {
      Enumeration var3 = this.field_1655.elements();

      while (var3.hasMoreElements()) {
         ((class_0)var3.nextElement()).method_0(var1, var2);
      }
   }

   // $VF: renamed from: a (long) void
   public void method_558(long var1) {
      try {
         for (int var3 = 0; var3 < this.field_1654.size(); var3++) {
            class_86 var4 = (class_86)this.field_1654.elementAt(var3);
            if (var4.method_795()) {
               var4.method_791(var1);
            }
         }

         for (int var8 = 0; var8 < this.field_1654.size() - 2; var8++) {
            class_86 var9 = (class_86)this.field_1654.elementAt(var8);
            if (var9.method_795()) {
               for (int var5 = var8 + 1; var5 < this.field_1654.size(); var5++) {
                  class_86 var6 = (class_86)this.field_1654.elementAt(var5);
                  if (var6.method_795()
                     && var9.getClass() != Class.forName("az")
                     && var6.getClass() != Class.forName("az")
                     && var9.getClass() != Class.forName("af")
                     && var6.getClass() != Class.forName("af")
                     && this.method_562(var9, var6)) {
                     var9.method_792(var6);
                     var6.method_792(var9);
                  }
               }
            }
         }
      } catch (ClassNotFoundException var7) {
         class_62.method_563("class not found!!!");
      }
   }

   // $VF: renamed from: a (java.lang.String, boolean) void
   public void method_559(String var1, boolean var2) {
      if (var2) {
         class_62.method_563(var1);
      } else {
         class_62.method_563(var1);
      }
   }

   // $VF: renamed from: a (java.awt.Graphics, MastersOfDestiny) void
   public void method_560(Graphics var1, MastersOfDestiny var2) {
      try {
         Enumeration var3 = this.field_1654.elements();

         while (var3.hasMoreElements()) {
            class_86 var4 = (class_86)var3.nextElement();
            if (var4.getClass() == Class.forName("az") && var4.method_795()) {
               Enumeration var5 = var4.method_787();
               if (var5.hasMoreElements()) {
                  Object var6 = var5.nextElement();
                  if (var6.getClass() == Class.forName("ad")) {
                     Map var15 = Collections.synchronizedMap(new TreeMap(new class_61(this)));
                     class_90 var16 = (class_90)var6;
                     if (var16.e()) {
                        var15.put(new Integer(var16.method_802()), var16);
                     }

                     while (var5.hasMoreElements()) {
                        class_90 var9 = (class_90)var5.nextElement();
                        if (var9.e()) {
                           Vector var10 = new Vector();
                           var10.add(var9);
                           Object var11 = var15.put(new Integer(var9.method_802()), var10);
                           if (var11 != null) {
                              if (var11.getClass() == Class.forName("ad")) {
                                 var10.add((class_90)var11);
                                 var15.put(new Integer(var9.method_802()), var10);
                              } else {
                                 Vector var12 = (Vector)var11;
                                 Enumeration var13 = var12.elements();

                                 while (var13.hasMoreElements()) {
                                    var10.add((class_90)var13.nextElement());
                                    var15.put(new Integer(var9.method_802()), var10);
                                 }
                              }
                           }
                        }
                     }

                     for (Object var18 : var15.values()) {
                        if (var18.getClass() == Class.forName("ad")) {
                           ((class_90)var18).method_793(var1, var2);
                        } else {
                           Vector var19 = (Vector)var18;
                           Enumeration var20 = var19.elements();

                           while (var20.hasMoreElements()) {
                              class_90 var21 = (class_90)var20.nextElement();
                              var21.method_793(var1, var2);
                           }
                        }
                     }
                  } else {
                     class_86 var7 = (class_86)var6;
                     if (var7.method_795()) {
                        var7.method_793(var1, var2);
                     }

                     while (var5.hasMoreElements()) {
                        class_86 var8 = (class_86)var5.nextElement();
                        if (var8.method_795()) {
                           var8.method_793(var1, var2);
                        }
                     }
                  }
               }
            }
         }
      } catch (ClassNotFoundException var14) {
      }
   }

   // $VF: renamed from: b (java.awt.Graphics, MastersOfDestiny) void
   public void method_561(Graphics var1, MastersOfDestiny var2) {
      Enumeration var3 = this.field_1654.elements();

      while (var3.hasMoreElements()) {
         class_86 var4 = (class_86)var3.nextElement();
         if (var4.method_795()) {
            var4.method_794(var1, var2);
         }
      }
   }

   // $VF: renamed from: a (ac, ac) boolean
   boolean method_562(class_86 var1, class_86 var2) {
      if (var1.method_799() != 0 && var1.method_800() != 0 && var2.method_799() != 0 && var2.method_800() != 0) {
         int var3 = var2.method_801();
         int var4 = var3 + var2.method_799();
         int var5 = var2.method_802();
         int var6 = var5 + var2.method_800();
         int var7 = var1.method_801();
         int var8 = var7 + var1.method_799();
         int var9 = var1.method_802();
         int var10 = var9 + var1.method_800();
         if ((var7 >= var3 && var7 <= var4 || var8 >= var3 && var8 <= var4 || var7 <= var3 && var8 >= var4)
            && (var9 >= var5 && var9 <= var6 || var10 >= var5 && var10 <= var6 || var9 <= var5 && var10 >= var6)) {
            return true;
         }
      }

      return false;
   }
}
