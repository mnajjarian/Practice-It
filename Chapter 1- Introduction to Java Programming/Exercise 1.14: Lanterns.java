/*Write a complete Java program in a class named Lanterns that generates the following three figures of output. Use static 
methods to show structure and eliminate redundancy in your solution.

In particular, make sure that main contains no System.out.println statements except for blank lines, that any 
System.out.println statement(s) repeated are captured in a method that is called just once, and that 
the same System.out.println statement never appears in two places in the code.

    *****
  *********
*************

    *****
  *********
*************
* | | | | | *
*************
    *****
  *********
*************

    *****
  *********
*************
    *****
* | | | | | *
* | | | | | *
    *****
    *****
*/
public class Lanterns {

	public static void main(String[] args) {
		first();
		System.out.println();
		combine();
		second();
		fourth();
		

	}
	public static void first() {
		System.out.println("    *****");
		System.out.println("  *********");
		System.out.println("*************");
	}
	public static void second() {
		
		System.out.println("* | | | | | *");
	}
	public static void third() {
		first();
		second();
		System.out.println("*************");
		first();
		System.out.println();
	}
	public static void fourth() {
        String s = "    *****";
		System.out.println(s + "\n" + s);
	}
	public static void combine() {
		third();
		first();
		System.out.println("    *****");
		second();
		
	}

}
