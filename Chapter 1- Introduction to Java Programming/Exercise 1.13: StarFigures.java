/*Write a complete Java program in a class named StarFigures that generates the following output. 
Use static methods to show structure and eliminate redundancy in your solution.

*****
*****
 * *
  *
 * *

*****
*****
 * *
  *
 * *
*****
*****

  *
  *
  *
*****
*****
 * *
  *
 * *
*/

public class StarFigures {
    public static void main(String[] args) {
        stars();
        second();
        System.out.println();
        stars();
        second();
        stars();
        last();
    }
    public static void stars() {
        System.out.println("*****");
        System.out.println("*****");
    }
    public static void second() {
        System.out.println(" * *");
        System.out.println("  *");
        System.out.println(" * *");
    }
    public static void last() {
        System.out.println();
        System.out.println("  *");
        System.out.println("  *");
        System.out.println("  *");
        stars();
        second();
    }
}
