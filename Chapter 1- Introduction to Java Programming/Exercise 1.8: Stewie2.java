/*Write a complete Java program in a class named Stewie2 that prints the following output. Use at least one static method besides main to remove redundancy.

//////////////////////
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\

*/

public class Stewie2 {
    public static void main(String[] args) {
        victory();
    }
    public static void victory() {
        String top = "//////////////////////";
        String bottom = "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\";
        String text = "|| Victory is mine! ||";
        String s = text + "\n" + bottom + "\n";
        System.out.print(top + "\n" + s + s + s + s + s);
    }
}
