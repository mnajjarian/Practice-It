/*Write Java code to read an integer from the user, then print even if that number is an even number or odd otherwise. You may 
assume that the user types a valid integer. The input/output should match the following example:

Type a number: 14
even

*/
Scanner input = new Scanner(System.in);
System.out.print("Type a number: ");
int number = input.nextInt();
if(number % 2 == 0) {
    System.out.println("even");
} else {
    System.out.println("odd");
}
