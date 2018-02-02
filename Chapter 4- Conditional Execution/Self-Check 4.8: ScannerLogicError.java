/*The following code contains a logic error. Examine the code and figure out the case(s) in which the code would print something 
that is untrue about the number that was entered. Then correct the logic error in the code. You should retain the original printed 
messages (and not add any new ones), but make them print at appropriate times such that the message printed is always a true 
statement about the integer typed.*/

Scanner console = new Scanner(System.in);
System.out.print("Type a number: ");
int number = console.nextInt();
if (number % 2 == 0) {
    if (number % 3 == 0) {
        System.out.println("Divisible by 6.");
    }
    } else {
        System.out.println("Odd.");
    }
