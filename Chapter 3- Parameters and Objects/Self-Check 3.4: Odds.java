/*What output is produced by the following program?


public class Odds {
    public static void main(String[] args) {
        printOdds(3);
        printOdds(17 / 2);
        
        int x = 25;
        printOdds(37 - x + 1);
    }   
    
    public static void printOdds(int n) {
        for (int i = 1; i <= n; i++) {
            int odd = 2 * i - 1;
            System.out.print(odd + " ");
        }
        System.out.println();
    }
}*/
 
1 3 5
1 3 5 7 9 11 13 15
1 3 5 7 9 11 13 15 17 19 21 23 25
