/*The following program contains several errors. Correct the errors and submit a working version of the program.
The corrected version of the program should produce the following output:

Body temp in C is: 37.0
*/
public class Temperature {
    public static void main(String[] args) {
        double tempf = 98.6;
        double tempc = 0.0;
        ftoc(tempf, tempc);
        
    }

    // converts Fahrenheit temperatures to Celsius
    public static void ftoc(double tempf, double tempc) {
        tempc = (tempf - 32) * 5 / 9;
        System.out.println("Body temp in C is: " + tempc);
    }
}
