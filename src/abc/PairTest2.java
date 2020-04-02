package abc;//package abc;
//
//import com.sun.xml.internal.ws.resources.UtilMessages;
//import jdk.nashorn.internal.codegen.types.Type;
//
//import java.io.IOException;
//import java.time.*;
//
///**
// * @version 1.02 2015-06-21
// * @author Cay Horstmann
// */
//public class PairTest2
//{
//   public static void main(String[] args)
//   {
//      Pair<String>[] aqq = new Pair[10];
//      Pair<String> q = new Pair('a','b');
//      aqq[0] = q;
//      try{
//         for(Pair t : aqq){
//            System.out.println(t.toString());
//         }
//      }catch (UnknownError | NullPointerException e){
//         System.out.println("取数组为null");
//      }
//
//
//      LocalDate[] birthdays =
//         {
//            LocalDate.of(1906, 12, 9), // G. Hopper
//            LocalDate.of(1815, 12, 10), // A. Lovelace
//            LocalDate.of(1903, 12, 3), // J. von Neumann
//            LocalDate.of(1910, 6, 22), // K. Zuse
//         };
//      Pair[] mm = new Pair[1];
//      mm[0] = ArrayAlg.minmax(birthdays);
//      System.out.println("min = " + mm[0].getFirst());
//      System.out.println("max = " + mm[0].getSecond());
//   }
//}
//
//class ArrayAlg
//{
//   /**
//      Gets the minimum and maximum of an array of objects of type T.
//      @param a an array of objects of type T
//      @return a pair with the min and max values, or null if a is null or empty
//   */
//   public static <T extends Comparable> Pair<T> minmax(T[] a)
//   {
//      if (a == null || a.length == 0) return null;
//      T min = a[0];
//      T max = a[0];
//      for (int i = 1; i < a.length; i++)
//      {
//         if (min.compareTo(a[i]) > 0) min = a[i];
//         if (max.compareTo(a[i]) < 0) max = a[i];
//      }
//      return new Pair<>(min, max);
//   }
//}
