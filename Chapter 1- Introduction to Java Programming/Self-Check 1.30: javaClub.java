/*Consider the following program, saved into a file named Example.java:


   public class Example {
       public static void displayRule() {
           System.out.println("The first rule ");
           System.out.println("of Java Club is,");
           System.out.println();
           System.out.println("you do not talk about Java Club.");
       }
 
       public static void main(String[] args) {
          System.out.println("The rules of Java Club.");
          displayRule();
          displayRule();
      }
  }
What would happen if each of the following changes were made to the Example program? 
If there would be no change to the program, choose "nothing". If it would cause the program not to compile, 
choose "error". If it would change the program's output, choose "output". Treat each change independently of the others.*/

a) Change line 1 to: 
public class Demonstration                                ----> error

b) Change line 9 to: 
public static void MAIN(String[] args) {                  ----> error

c) Insert a new line after line 11 that reads: 
System.out.println();                                     ----> output

d) Change line 2 to: 
public static void printMessage() {                       ----> error

e) Change line 2 to: 
public static void showMessage() {
and change lines 11 and 12 to: 
showMessage();	                                          ----> nothing

f) Replace lines 3-4 with: 
System.out.println("The first rule of Java Club is,");    ----> output
