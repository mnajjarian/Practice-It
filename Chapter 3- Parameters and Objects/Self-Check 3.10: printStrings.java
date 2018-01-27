/*Write a method called printStrings that accepts a String and a number of repetitions as parameters and prints that String 
the given number of times. For example, the call:


printStrings("abc", 5);
will print the following output:

abcabcabcabcabc
*/

public static void printStrings(String string, int n) {
    for(int i = 1; i <= n; i++) {
        System.out.print(string);
    }
}
