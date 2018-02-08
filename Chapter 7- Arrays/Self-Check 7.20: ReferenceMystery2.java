/*The following program produces 4 lines of output. Write each line of output below as it would appear on the console.


import java.util.*;   // for Arrays class
​
public class ReferenceMystery2 {
    public static void main(String[] args) {
        int x = 1;
        int[] a = new int[2];
        mystery(x, a);
        System.out.println(x + " " + Arrays.toString(a));
        x--;
        a[1] = a.length;
        mystery(x, a);
        System.out.println(x + " " + Arrays.toString(a));
    }
    
    public static void mystery(int x, int[] list) {
        list[x]++;
        x++;
        System.out.println(x + " " + Arrays.toString(list));
    }
}*/

 line 1	  2 {0, 1}
 line 2	  1 {0, 1}
 line 3	  1 {1, 2}
 line 4	  0 [1, 2}
