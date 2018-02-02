/*Rewrite the code below by factoring to eliminate redundancy. Your code must produce the same results. To simplify things, you
may assume that the user always types 1 or 2 for the multiplier.*/

System.out.print("Is your money multiplied 1 or 2 times? ");
int times = console.nextInt();
System.out.print("And how much are you contributing? ");
int donation = console.nextInt();
if (times == 1) {
    sum = sum + donation;
    count1++;   
} else {
    sum = sum + 2 * donation;
    count2++;
}
total = total + donation;
