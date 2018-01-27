/*What output is produced by the following program?


public class MysteryNums {
    public static void main(String[] args) {
        int x = 15;
        sentence(x, 42);
​
        int y = x - 5;
        sentence(y, x + y);
    }
​
    public static void sentence(int num1, int num2) {
        System.out.println(num1 + " " + num2);
    }
}*/

15 42
10 25
