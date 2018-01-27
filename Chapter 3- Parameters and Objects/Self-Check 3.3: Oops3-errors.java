/*The following program contains 9 errors. Correct the errors and submit a working version of the program. 
The corrected version of the program should produce the following output:

x = 10.01 and y = 8.0
x = 10.01 and y = 867.5309
The value from main is: 867.5309
z = 5
*/

public class Oops3 {
    public static void main(String[] args) {
        double bubble = 867.5309;
        double x = 10.01;
        double y = 8.0;
        int z = 5;
        printer(x, y);
        printer(x, bubble);
        System.out.println("The value from main is: " + bubble);
        System.out.println("z = " + z);
    }

    public static void printer(double x, double y) {
        
        System.out.println("x = " + x + " and y = " + y);
        
        
    }
}
