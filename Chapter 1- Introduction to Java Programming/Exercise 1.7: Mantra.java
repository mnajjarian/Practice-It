/*Write a complete Java program in a class named Mantra that produces the following output. Remove its redundancy by 
adding a method.

There's one thing every coder must understand:
The System.out.println command.

There's one thing every coder must understand:
The System.out.println command.
*/

public class Mantra {
    public static void main(String[] args) {
        mantra();
    }
    public static void mantra() {
        String thing = "There's one thing every coder must understand:";
        String command = "The System.out.println command.";
        String mantra = thing + "\n" + command;
        System.out.print(mantra + "\n\n" + mantra);
}
}
