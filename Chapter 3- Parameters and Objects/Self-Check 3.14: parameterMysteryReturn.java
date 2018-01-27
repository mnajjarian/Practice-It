/*Given the following program:


public class MysteryReturn {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        
        z = mystery(x, z, y);                        // Statement 1
        System.out.println(x + " " + y + " " + z);   // Statement 2
        x = mystery(z, z, x);                        // Statement 3
        System.out.println(x + " " + y + " " + z);   // Statement 4
        y = mystery(y, y, z);                        // Statement 5
        System.out.println(x + " " + y + " " + z);   // Statement 6
    }
​
    public static int mystery(int z, int x, int y) {
        z--;
        x = 2 * y + z;
        y = x - 1;
        System.out.println(y + " " + z);
        return x;
    }
}
Write the output of each statement.*/


 Statement 1	  3 0
 Statement 2	  1 2 4
 Statement 3	  4 3
 Statement 4	  5 2 4
 Statement 5	  8 1
 Statement 6	  5 9 4
