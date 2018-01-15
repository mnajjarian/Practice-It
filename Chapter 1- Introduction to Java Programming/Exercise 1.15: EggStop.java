/*Write a complete Java program in a class named EggStop that generates the following output. 
Use static methods to show structure and eliminate redundancy in your solution.

  ______
 /      \
/        \
\        /
 \______/

  ______
 /      \
/        \
\        /
 \______/
+--------+

  ______
 /      \
/        \
|  STOP  |
\        /
 \______/
+--------+

*/

public class EggStop {

	public static void main(String[] args) {
		combine();
		topEgg();
		System.out.println("|  STOP  |");
		bottomEgg();
		line();
	}
	public static void topEgg() {
		System.out.println("  ______ ");
		System.out.println(" /      \\");
		System.out.println("/        \\");
	}
	public static void bottomEgg() {
		System.out.println("\\        /");
		System.out.println(" \\______/");
	}
	public static void line() {
		System.out.println("+--------+");
        System.out.println();
	}
	public static void combine() {
		topEgg();
		bottomEgg();
		System.out.println();
		topEgg();
		bottomEgg();
		line();
	}
}
