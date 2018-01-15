/*The following program redundantly repeats the same expressions many times. Modify the program to remove all redundant 
expressions using variables of appropriate types. (Your variables should be used to help solve the overall problem. 
You must use a sufficient number of variables to receive credit for solving this problem. Declare each variable 
in its own statement on its own line.)

public class ComputePay {
    public static void main(String[] args) {
        // Calculate pay at work based on hours worked each day
        System.out.println("My total hours worked:");
        System.out.println(4 + 5 + 8 + 4);

        System.out.println("My hourly salary:");
        System.out.println("$8.75");

        System.out.println("My total pay:");
        System.out.println((4 + 5 + 8 + 4) * 8.75);

        System.out.println("My taxes owed:"); // 20% tax
        System.out.println((4 + 5 + 8 + 4) * 8.75 * 0.20);
    }
}*/

public class ComputePay {
    public static void main(String[] args) {
        // Calculate pay at work based on hours worked each day
        int totalHours = 21;
        System.out.println("My total hours worked:");
        System.out.println(totalHours);
        
        double hourly = 8.75;
        System.out.println("My hourly salary:");
        System.out.println("$" + hourly);

        double totalPay = totalHours * hourly;
        System.out.println("My total pay:");
        System.out.println(totalPay);

        double tax = totalPay * 0.20;
        System.out.println("My taxes owed:"); // 20% tax
        System.out.println(tax);
    }
}
