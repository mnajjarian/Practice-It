/*Write a complete Java program in a class named TwoRockets that generates the following output. Use static methods to 
show structure and eliminate redundancy in your solution.

Note that there are two rocket ships next to each other. What redundancy can you eliminate using static methods? 
What redundancy cannot be eliminated?

   /\       /\
  /  \     /  \
 /    \   /    \
+------+ +------+
|      | |      |
|      | |      |
+------+ +------+
|United| |United|
|States| |States|
+------+ +------+
|      | |      |
|      | |      |
+------+ +------+
   /\       /\
  /  \     /  \
 /    \   /    \

*/
public class TwoRockets {
    public static void main(String[] args) {
        cap();
        square();
        unitedState();
        square();
        cap();
    }
    public static void cap() {
        String top = "   /\\       /\\";
        String center = "  /  \\     /  \\";
        String bottom = " /    \\   /    \\";
        System.out.println(top + "\n" + center + "\n" + bottom);
    }
    public static void square() {
        String top = "+------+ +------+";
        String center = "|      | |      |";
        System.out.println(top + "\n" + center + "\n" + center + "\n" + top);
    }
    public static void unitedState() {
        String u = "|United| |United|";
        String s = "|States| |States|";
        System.out.println(u + "\n" + s);
    }
}
