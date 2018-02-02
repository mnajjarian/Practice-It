/*The following code was intended to print a message when the double gpa variable's value is 3.2, but it actually produces the wrong output. 
Fix the code to print the expected message.

(The idea here is that the expression 3.2 * 3 in Java does not exactly equal 9.6. You should leave in the computation of the credits 
variable and should still make your test examine that variable's value, rather than just directly testing the gpa variable itself.)*/

double credits = gpa * 3;
if (Math.round(credits) == 10) {
    System.out.println("You earned enough credits.");
}
