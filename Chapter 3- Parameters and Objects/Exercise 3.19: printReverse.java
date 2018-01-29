/*Write a method called printReverse that accepts a String as its parameter and prints the characters in opposite order. 
For example, a call of printReverse("hello there!"); should print the following output:

!ereht olleh

If the empty string is passed, no output is produced. Your method should produce a complete line of output.*/
public static void printReverse(String string) {
    for(int i = string.length() - 1; i >= 0; i--) {
        System.out.print(string.charAt(i));
    }
}
