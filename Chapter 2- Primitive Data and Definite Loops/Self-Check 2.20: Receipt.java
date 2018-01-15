/*The following program redundantly repeats the same expressions many times. Modify the program to remove all redundant 
expressions using variables of appropriate types.

// This program computes the total amount owed for a meal,
// assuming 8% tax and a 15% tip.
public class Receipt {
    public static void main(String[] args) {
        System.out.println("Subtotal:");
        System.out.println(38 + 40 + 30);
        System.out.println("Tax:");
        System.out.println((38 + 40 + 30) * .08);
        System.out.println("Tip:");
        System.out.println((38 + 40 + 30) * .15);
        System.out.println("Total:");
        System.out.println(38 + 40 + 30 +
                            (38 + 40 + 30) * .08 +
                            (38 + 40 + 30) * .15);

    }
}*/

// This program computes the total amount owed for a meal,
// assuming 8% tax and a 15% tip.
public class Receipt {
    public static void main(String[] args) {
        int subTotal = 108;
        System.out.println("Subtotal:");
        System.out.println(subTotal);
        double tax = subTotal * 0.08; 
        System.out.println("Tax:");
        System.out.println(tax);
        double tip = subTotal * 0.15;
        System.out.println("Tip:");
        System.out.println(tip);
        double total = subTotal + tax + tip;
        System.out.println("Total:");
        System.out.println(total);

    }
}
