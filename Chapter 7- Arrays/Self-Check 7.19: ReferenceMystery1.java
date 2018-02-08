/*The following program produces 4 lines of output. Write each line of output below as it would appear on the console.


import java.util.*;   // for Arrays class
​
public class ReferenceMystery1 {
    public static void main(String[] args) {
        int x = 0;
        int[] a = new int[4];
        x++;
        
        mystery(x, a);
        System.out.println(x + " " + Arrays.toString(a));
        
        x++;
        mystery(x, a);
        System.out.println(x + " " + Arrays.toString(a));
    }
    
    public static void mystery(int x, int[] a) {
        x++;
        a[x]++;
        System.out.println(x + " " + Arrays.toString(a));
    }
}*/

 line 1	  2 {0, 0, 1, 0}
 line 2 	1 {0, 0, 1, 0}
 line 3 	3 {0, 0, 1, 1}
 line 4 	2 {0, 0, 1, 1}
